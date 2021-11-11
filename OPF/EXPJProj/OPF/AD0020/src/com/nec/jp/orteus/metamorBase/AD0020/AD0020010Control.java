/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/src/com/nec/jp/orteus/metamorBase/AD0020/AD0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0020;

import com.nec.jp.orteus.metamorBase.AD0020.*;
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
//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0020010Control
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
				setStruct2XML(elChild, (AD0020010Struct)list.get(i), startId, lvl, parentId);
				// 作成したエレメントを子供として追加
				el.appendChild(elChild);
			}
		}
		return startId;
	}

	public int setXMLDoc(Element el, List list, int startId) throws BusinessProcessException, FoundationException {
		return setXMLDoc(el, list, startId, 1, 0);
	} 

	public void setStruct2XML(Element el, AD0020010Struct struct, int id, int lvl, int parentId) throws BusinessProcessException, FoundationException {

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
				}
				if (struct.getITEM_NAME() != null && !struct.getITEM_NAME().equals("")) {
					el.setAttribute("ITEM_NAME", struct.getITEM_NAME());
				}
				if (struct.getOD_NO() != null && !struct.getOD_NO().equals("")) {
					el.setAttribute("OD_NO", struct.getOD_NO());
				}
				if (struct.getMRP_TYP() != null && !struct.getMRP_TYP().equals("")) {
					el.setAttribute("MRP_TYP", struct.getMRP_TYP());
				}
				if (struct.getMRP_ODR_TYP() != null && !struct.getMRP_ODR_TYP().equals("")) {
					el.setAttribute("MRP_ODR_TYP", struct.getMRP_ODR_TYP());
				}
				if (struct.getODR_STS_TYP() != null && !struct.getODR_STS_TYP().equals("")) {
					el.setAttribute("ODR_STS_TYP", struct.getODR_STS_TYP());
				}
				if (struct.getOD_TYP() != null && !struct.getOD_TYP().equals("")) {
					el.setAttribute("OD_TYP", struct.getOD_TYP());
				}


                //}}user_implement_dev:<setStruct2XML>
			} catch(DOMException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public void setStruct2XML(Element el, AD0020010Struct struct, int id) throws BusinessProcessException, FoundationException {
		setStruct2XML(el, struct, id, 1, 0);
		return;
	}

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
	public AD0020010Struct getListvalue(int x) { return (AD0020010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0020010Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0020010Struct createStruct() { return new AD0020010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0020010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//---------------------------------------------------------------------------

	/** デフォールト初期展開レベル */
	private static final String DEFAULT_INIT_LEVEL = "15";
	/** 最大累計行数 */
	private static final int MAX_NODE_NUM = 50;
	/** 最大読込行数（初期読込または追加読込毎） */
	private static final int MAX_READ_NUM = 20;

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
		AD0020010Struct parentNodeStruct,
		int parentNodeId,
		int compNodeId,
		int maxNodeId,
		int compTreeLevel,
		int maxLevel,
		boolean selectFlag)
		throws BusinessProcessException, FoundationException, ExpjException, MaxLineException {
		try {
			// 子ノードの一覧を取得
			AD0020010Struct workStruct = new AD0020010Struct();
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
					} else if ("3".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon02C");
					} else if ("4".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon03C");
					}
				} else if (parentNodeElement.hasAttribute("target") == false) {
					// 末端以外のノードであり、Rootでない場合
					parentNodeElement.setAttribute("ctx", "N");
					// ツリーアイコンをセット
					if ("1".equals(parentNodeElement.getAttribute("OD_TYP"))
						|| "2".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon01A");
						parentNodeElement.setAttribute("icon2", "AD0020011CIcon01B");
					} else if ("3".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon02A");
						parentNodeElement.setAttribute("icon2", "AD0020011CIcon02B");
					} else if ("4".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon03A");
						parentNodeElement.setAttribute("icon2", "AD0020011CIcon03B");
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
				AD0020010Struct compNodeStruct = (AD0020010Struct) compNodeList.get(i);
				// 子ノードを生成、ツリー用XMLに追加
				Element compNodeElement = flashTree.createElement("node");
				parentNodeElement.appendChild(compNodeElement);
				// compNodeStructから子ノードの各種属性データを設定

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
		struct.setJOB_ODR_TYP_DN(null);
		struct.setMRP_TYP(null);
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
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

		// ツリーを初期化
		flashTree = new XmlDocument();

		list = null;

		readStatus = INITIAL;
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
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		Element rootElement = null;
		Element topNodeElement = null;
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

			AD0020010Struct rootStruct = (AD0020010Struct) rootList.get(0);

			// 製番状態区分が1/2/9の場合はエラーにする。
			if (("1".equals(rootStruct.getJOB_ODR_STS_TYP()))
				|| ("2".equals(rootStruct.getJOB_ODR_STS_TYP()))
				|| ("9".equals(rootStruct.getJOB_ODR_STS_TYP()))) {
				setErrorMessage("AD32616");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "JOB_ODR_STS_TYP", rootStruct.getJOB_ODR_STS_TYP());
				return;
			}
			
			// ユーザが所属する工場コードと、[製番計画]の工場コードが
			// 一致しない場合はエラーにする。
			if (!this.sysPLANT_CD.equals(rootStruct.getPLANT_CD())) {
				setErrorMessage("AD00016");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "PLANT_CD", this.sysPLANT_CD);
				return;
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
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * FlashTree初期化ボタン押下時に実行される処理です。
	 *
	 */
	public void controlFlashTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");
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
				setStruct2XML(el, (AD0020010Struct)list.get(i), startId);

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
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		initializeAll();


                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 詳細表示ボタン押下時に実行される処理です。
	 *
	 */
	public void controlShowDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");
			//{{user_implement_dev:<controlShowDetail>


		try {
			// 選択されたノードを元に詳細情報を取得
			List detailList = entity.mDetail.read(conn, struct);
			AD0020010Struct detailStruct = (AD0020010Struct) detailList.get(0);

			// 詳細情報を設定
			struct.setJOB_ODR_TYP(detailStruct.getJOB_ODR_TYP());
			struct.setJOB_ODR_TYP_DN(multcombo("JOB_ODR_TYP",detailStruct.getJOB_ODR_TYP_DN()));
			struct.setALC_GRP_CD(detailStruct.getALC_GRP_CD());
			struct.setITEM_CD(detailStruct.getITEM_CD());
			struct.setITEM_NAME(detailStruct.getITEM_NAME());
			struct.setDRAW_CD(detailStruct.getDRAW_CD());
			struct.setSPEC(detailStruct.getSPEC());
			struct.setOUTSIDE_TYP(detailStruct.getOUTSIDE_TYP());
			struct.setOUTSIDE_TYP_DN(multcombo("OUTSIDE_TYP",detailStruct.getOUTSIDE_TYP_DN()));
			struct.setMRP_ODR_TYP(detailStruct.getMRP_ODR_TYP());
			struct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",detailStruct.getMRP_ODR_TYP_DN()));
			struct.setITEM_SPOIL(detailStruct.getITEM_SPOIL());
			struct.setUNIT_QTY_TYP(detailStruct.getUNIT_QTY_TYP());
			struct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",detailStruct.getUNIT_QTY_TYP_DN()));
			struct.setJOB_ODR_DLV_DATE(detailStruct.getJOB_ODR_DLV_DATE());
			struct.setDUE_DATE(detailStruct.getDUE_DATE());
			struct.setPRD_DUE_DATE(detailStruct.getPRD_DUE_DATE());
			struct.setPRD_START_DATE(detailStruct.getPRD_START_DATE());
			struct.setODR_START_DATE(detailStruct.getODR_START_DATE());
			struct.setSUM_PUCH_ODR_QTY(detailStruct.getSUM_PUCH_ODR_QTY());
			struct.setSUM_OPR_INST_QTY(detailStruct.getSUM_OPR_INST_QTY());
			struct.setODR_QTY(detailStruct.getODR_QTY());
			struct.setDM_QTY(detailStruct.getDM_QTY());
			struct.setSUM_ALCD_QTY(detailStruct.getSUM_ALCD_QTY());
			struct.setODR_STS_TYP(detailStruct.getODR_STS_TYP());
			struct.setODR_STS_TYP_DN(multcombo("ODR_STS_TYP",detailStruct.getODR_STS_TYP_DN()));
			struct.setDM_STS_TYP(detailStruct.getDM_STS_TYP());
			struct.setDM_STS_TYP_DN(multcombo("DM_STS_TYP",detailStruct.getDM_STS_TYP_DN()));
			struct.setSTOCK_UNIT(detailStruct.getSTOCK_UNIT());
		} catch (SQLException e) {
			throw new ExpjException(e);
		}


                //}}user_implement_dev:<controlShowDetail>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");

		return;
	}

	/**
	 * ツリー追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAddTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");
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
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		initializeAll();

		// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
		if (isScreenMove() == true) {
			// 検索のコントロールメソッドを呼び出します。
			//				controlSelect();
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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


		try {
			PrivateConfig pc = new PrivateConfig(conn);
			// 最大展開レベルを取得
			Integer maxLevel = pc.getNumber("MAX_DISPLAY_PS_LEVEL");
			if (maxLevel == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				sysLog.severe(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", "SYS_PARAMETER.NAME:MAX_DISPLAY_PS_LEVEL");
				sysLog.severe(emsg, getsysUSER_CD());
				throw new NoDataException();
			}
			_maxDisplayLevel = maxLevel.intValue();

			// 初期展開レベルを取得
			Integer initLevel = pc.getNumber("INIT_DISPLAY_PS_LEVEL");
			if (initLevel == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				sysLog.severe(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", "SYS_PARAMETER.NAME:INIT_DISPLAY_PS_LEVEL");
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
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("ShowDetail") ) {
				controlShowDetail();
			} else if( button.equals("AddTree") ) {
				controlAddTree();
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
//			throw new FoundationException("AD0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020010-E999","CSVの出力処理"));
			throw new FoundationException("AD0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0020010Entity entity;
	protected AD0020010Struct struct;
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

		entity = new AD0020010Entity();
		struct = new AD0020010Struct();

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
	 * AD0020010クラスの標準コンストラクタ
	 */
	public AD0020010Control() throws BusinessProcessException, FoundationException
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
				AD0020010Struct key = (AD0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("InitLevel") && key.getInitLevel() != null) {
					msgKey.setKeyValue("InitLevel", key.getInitLevel());
				}
				if(msgKeyType.containsKeyColumn("AD0020010tree1") && key.getAD0020010tree1() != null) {
					msgKey.setKeyValue("AD0020010tree1", key.getAD0020010tree1());
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
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
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
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN") && key.getODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DN", key.getODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN") && key.getDM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("DM_STS_TYP_DN", key.getDM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
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
					AD0020010Struct key = new AD0020010Struct();
					if(msgKeyType.containsKeyColumn("InitLevel")) {
						key.setInitLevel(msgKey.getKeyValue("InitLevel"));
					}
					if(msgKeyType.containsKeyColumn("AD0020010tree1")) {
						key.setAD0020010tree1(msgKey.getKeyValue("AD0020010tree1"));
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
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
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
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN")) {
						key.setODR_STS_TYP_DN(msgKey.getKeyValue("ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN")) {
						key.setDM_STS_TYP_DN(msgKey.getKeyValue("DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
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
