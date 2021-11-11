/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0120/src/com/nec/jp/orteus/metamorBase/AE0120/AE0120010Servlet.java,v $
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
 * EXPJ    (2005/01/31),SRCGEN対応、メッセージの多言語対応(MessageStruct)
 * EXPJ    (2004/09/08),FLASH SUBMIT方法変更
 * EXPJ    (2004/06/24),FLASH連携メソッド追加
 * EXPJ    (2004/04/20),CSV アップロード機能追加
 * EXPJ    (2004/04/09),コメント修正 "リスエスと"->"リクエスト"
 * EXPJ    (2004/04/06),user_implement で}}指定するべき部分が{{になっていたのを修正
 *                      setScreenCommonParamsメソッドにパラメータを追加（印刷用）
 *                      StructDump時のtoString()を削除（Null値対策）
 * EXPJ    (2004/04/01),CsvOutメソッドの処理を削除→ControlのCsvOutメソッドにて実施する
 *                      user_implement_dev:<setScreenMoveParams>を復活
 *                      正常動作のトランザクション完了時にはconn.commitを行うように修正
 * EXPJ    (2004/03/20),レビュー結果を反映
 * EXPJ    (2004/03/13),送信元ボタン登録追加
 * EXPJ    (2004/03/09),setScreenMoveParamsメソッドからsetScreenCommonParamsメソッドを分離
 *                      setScreenMoveParams呼出をreloadメソッドに戻し、イベントハンドラからはsetScreenCommonParams呼出
 *                      Exceptionの処理を修正
 *                      SystemLog出力の問題点対応
 * EXPJ    (2004/03/04),メッセージ系部品改造対応
 *                     ,CsvOutメソッドの処理を追加
 *                     ,Printメソッドの処理をEXPLANNER/J用に改造
 * EXPJ    (2004/03/04),メッセージ系部品改造対応
 * EXPJ    (2004/03/03),履歴を修正
 *                     ,Orteusテンプレートのかつてのバグを修正 "reloadEvent"→"reload"
 *                     ,reloadEventメソッドでcontrolを"Select"で呼び出すのを中止
 *                     ,画面遷移パラメータの取得処理呼び出しをreloadEventメソッドからイベントハンドラに移動
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造
 * 4.0.3.8 (2004/08/02),TRUST-Vプロジェクトのフィードバック（ページ制御部品対応）
 * 4.0.3.7 (2004/05/24),ダウンロード対応を追加。
 * 4.0.3.6 (2004/05/21),event-type=printを追加。コネクションの接続・切断方法のバグを修正
 * 4.0.3.5 (2004/05/07),Webサーバタイプの初期化を削除、defaultEventのnextUrl処理、ログファイルの初期化修正
 *                      setReferURL()->getReferURL()、コネクションの接続・切断方法変更
 * 4.0.3.4 (2004/04/07),isClickメソッドのユーザ記述定義ミスを修正
 * 4.0.3.3 (2004/02/23),Control::getPdfFileName()対応
 * 4.0.3.2 (2004/01/23),帳票ツール連携用コードを追加
 * 4.0.3.1 (2003/10/24),isClickメソッドにOwnCoding領域を追加
 * 4.0.3.0 (2003/10/07),bFLG_DISCONNECT_defaultEventの初期値をtrueに修正
 * 4.0.2.0 (2003/08/05),Sesstion Timeout時の遷移指定追加
 * 4.0.1.0 (2003/05/19),Connectionフラグの定義修正
 * 4.0.0.1 (2003/04/24),Structバインド修正
 * 4.0.0.0 (2003/04/23),クラス名標準化対応
 * 3.0.1.0 (2003/03/31),control method呼び出し,reload eventでのConnection close追加
 * 3.0.0.0 (2003/03/19),Time,Timestamp型対応
 * 2.1.0.0 (2002/12/17),User OwnCode部ロギング追加,Logging package修正
 * 2.0.0.1 (2002/07/05),Connection対応
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AE0120;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.common.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.csv.*;
import com.nec.jp.orteus.expj.flash.FlashServletRequest;

import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.Date;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_dev:import

//{{user_implement_dev:header
/**
 * CLASS     : AE0120010Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AE0120010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
		// TODO: ユーザ定義のコードを記述してください
        //}}user_implement_dev:class_head

	/**
	 * ThrowableのprintStackTrace()を文字列で返却します
	 * @param   Throwable e  Exception
	 * @return  String  変換後文字列
	 */
	private String getStackTrace(Throwable e)
	{
		ByteArrayOutputStream temp = new ByteArrayOutputStream();
		try {
			if (e == null) {
				throw new Exception();
			}
			PrintStream out = new PrintStream(temp);
			e.printStackTrace(out);
			return temp.toString();
		} catch ( Exception ex ) {
			return "";
		} finally {
			try {
				temp.close();
			} catch (IOException ee){}
		}
	}

	/** 
	 * 画面遷移パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AE0120010Control control)
	{
		if (params == null) {
			control.setScreenMoveFlg (false);
			control.setScreenId((String)null);
			return;
		}

		if (control == null) {
			control.setScreenMoveFlg (false);
			control.setScreenId((String)null);
			return;
		}

		//画面遷移からの呼び出しであるかどうかを示すパラメータを取得
		String[] screenMoveFlg = null;
		if(params.containsKey("SCREEN_MOVE_FLG")) {
			screenMoveFlg = (String[])params.get("SCREEN_MOVE_FLG");
		}
		else {
			screenMoveFlg = (String[])null;
		}
		if(screenMoveFlg == null) {
			control.setScreenMoveFlg (false);
		}
		else {
			control.setScreenMoveFlg (true);
		}

//{{user_implement_dev:<setScreenMoveParams>
		//画面遷移からの検索パラメータ(画面固有)を取得し、controlの変数へ格納
		String[] PUCH_ODR_CD = (String[]) params.get("l_PUCH_ODR_CD");
		control.setPuchOdrCd((PUCH_ODR_CD == null) ? null : PUCH_ODR_CD[0]);

		// TODO: ユーザ定義のコードを記述してください
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AE0120010Control control)
	{
		if (params == null) {
			control.setButtonType((String)null);
			control.setPdfOutputType("0");
			control.setPdfOutputPrinter((String)null);
			return;
		}

		if (control == null) {
			control.setButtonType((String)null);
			control.setPdfOutputType("0");
			control.setPdfOutputPrinter((String)null);
			return;
		}

		// 押下ボタン種別
		if(params.containsKey("SUBMIT_BUTTON_TYPE")) {
			control.setButtonType(((String[])params.get("SUBMIT_BUTTON_TYPE"))[0]);
		}
		else {
			control.setButtonType((String)null);
		}

		// 帳票出力タイプ
		if(params.containsKey("PRINTER_TYPE")) {
			control.setPdfOutputType(((String[])params.get("PRINTER_TYPE"))[0]);
		}
		else {
			control.setPdfOutputType("0");
		}

		// 帳票出力先
		if(params.containsKey("SELECTED_PRINTER")) {
			control.setPdfOutputPrinter(((String[])params.get("SELECTED_PRINTER"))[0]);
		}
		else {
			control.setPdfOutputPrinter((String)null);
		}

		// 帳票出力リストパターン
		if(params.containsKey("PRINT_PATTERN")) {
			control.setPdfOutputListPattern(((String[])params.get("PRINT_PATTERN"))[0]);
		}
		else {
			control.setPdfOutputListPattern("2");
		}

		// 帳票出力リスト行
		if(params.containsKey("PRINT_TARGET")) {
			control.setPdfOutputListLine((String[])params.get("PRINT_TARGET"));
		}
		else {
			control.setPdfOutputListLine((String[])null);
		}

		// 送信元プログラムID取り込み
		if(params.containsKey("SUBMIT_PROGRAM")) {
			control.setProgramId(((String[])params.get("SUBMIT_PROGRAM"))[0]);
		}
		else {
			control.setProgramId((String)null);
		}

		// 送信元画面ID取り込み
		if(params.containsKey("SUBMIT_SCREEN")) {
			control.setScreenId(((String[])params.get("SUBMIT_SCREEN"))[0]);
		}
		else {
			control.setScreenId((String)null);
		}

		// 新規画面フラグ
		String[] newScreenFlg = null;
		if(params.containsKey("NEW_SCREEN_FLG")) {
			newScreenFlg = (String[])params.get("NEW_SCREEN_FLG");
		}
		else {
			newScreenFlg = (String[])null;
		}
		if((newScreenFlg != null) && ("FALSE".equalsIgnoreCase(newScreenFlg[0]))) {
			control.setNewScreenFlg(false);
		}
		else {
			control.setNewScreenFlg(true);
		}

//{{user_implement_dev:<setScreenCommonParams>
		// TODO: ユーザ定義のコードを記述してください
//}}user_implement_dev:<setScreenCommonParams>

	}

	//////////////////////////////

	/**
	 * 初回時のみ実行される処理
	 * initialEventメソッド
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
			logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "AE0120010"+" $Revision: 1.15 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}

		return nextUrl;
	}

	/**
	 * リロード時のみ実行される処理
	 * reloadEventメソッド
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			// TODO: ユーザ定義のコードを記述してください
			control.control_eventHandller("reload");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("AE0120010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	public String onClickSelectUnitCost(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");
		//{{user_implement_dev:<onClickSelectUnitCost>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("SelectUnitCost");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectUnitCost>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Update");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	public String onClickDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");
		//{{user_implement_dev:<onClickDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Delete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickDelete>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0120010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AE0120010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PUCH_ODR_CD = ((params.containsKey("PUCH_ODR_CD")) ? (String[])params.get("PUCH_ODR_CD") : (String[])null);
		String[] h_PUCH_ODR_CD = ((params.containsKey("h_PUCH_ODR_CD")) ? (String[])params.get("h_PUCH_ODR_CD") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] PUCH_RTN_QTY = ((params.containsKey("PUCH_RTN_QTY")) ? (String[])params.get("PUCH_RTN_QTY") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] PUCH_RTN_DATE = ((params.containsKey("PUCH_RTN_DATE")) ? (String[])params.get("PUCH_RTN_DATE") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] PUCH_RTN_COMMENT = ((params.containsKey("PUCH_RTN_COMMENT")) ? (String[])params.get("PUCH_RTN_COMMENT") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] UNIT_COST_TYP = ((params.containsKey("UNIT_COST_TYP")) ? (String[])params.get("UNIT_COST_TYP") : (String[])null);
		String[] UNIT_COST_TYP_name = ((params.containsKey("UNIT_COST_TYP_name")) ? (String[])params.get("UNIT_COST_TYP_name") : (String[])null);
		String[] UNIT_COST_TYP_val = ((params.containsKey("UNIT_COST_TYP_val")) ? (String[])params.get("UNIT_COST_TYP_val") : (String[])null);
		String[] PUCH_ODR_PERSON = ((params.containsKey("PUCH_ODR_PERSON")) ? (String[])params.get("PUCH_ODR_PERSON") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] UNIT_COST = ((params.containsKey("UNIT_COST")) ? (String[])params.get("UNIT_COST") : (String[])null);
		String[] VEND_CUR_UNIT = ((params.containsKey("VEND_CUR_UNIT")) ? (String[])params.get("VEND_CUR_UNIT") : (String[])null);
		String[] r1_FILTER = ((params.containsKey("r1_FILTER")) ? (String[])params.get("r1_FILTER") : (String[])null);
		String[] PROCESSING_COST = ((params.containsKey("PROCESSING_COST")) ? (String[])params.get("PROCESSING_COST") : (String[])null);
		String[] r2_FILTER = ((params.containsKey("r2_FILTER")) ? (String[])params.get("r2_FILTER") : (String[])null);
		String[] MATERIAL_COST = ((params.containsKey("MATERIAL_COST")) ? (String[])params.get("MATERIAL_COST") : (String[])null);
		String[] PUCH_ODR_CD_2 = ((params.containsKey("PUCH_ODR_CD_2")) ? (String[])params.get("PUCH_ODR_CD_2") : (String[])null);
		String[] OTHER_OVERHEADS = ((params.containsKey("OTHER_OVERHEADS")) ? (String[])params.get("OTHER_OVERHEADS") : (String[])null);
		String[] TAX_AMOUNT_1 = ((params.containsKey("TAX_AMOUNT_1")) ? (String[])params.get("TAX_AMOUNT_1") : (String[])null);
		String[] TAX_RATE_1 = ((params.containsKey("TAX_RATE_1")) ? (String[])params.get("TAX_RATE_1") : (String[])null);
		String[] PUCH_ODR_AMOUNT = ((params.containsKey("PUCH_ODR_AMOUNT")) ? (String[])params.get("PUCH_ODR_AMOUNT") : (String[])null);
		String[] TAX_AMOUNT_2 = ((params.containsKey("TAX_AMOUNT_2")) ? (String[])params.get("TAX_AMOUNT_2") : (String[])null);
		String[] TAX_RATE_2 = ((params.containsKey("TAX_RATE_2")) ? (String[])params.get("TAX_RATE_2") : (String[])null);
		String[] DISC_AMOUNT = ((params.containsKey("DISC_AMOUNT")) ? (String[])params.get("DISC_AMOUNT") : (String[])null);
		String[] TAX_AMOUNT_3 = ((params.containsKey("TAX_AMOUNT_3")) ? (String[])params.get("TAX_AMOUNT_3") : (String[])null);
		String[] TAX_RATE_3 = ((params.containsKey("TAX_RATE_3")) ? (String[])params.get("TAX_RATE_3") : (String[])null);
		String[] NET_AMOUNT = ((params.containsKey("NET_AMOUNT")) ? (String[])params.get("NET_AMOUNT") : (String[])null);
		String[] AMOUNT_INCLUDE_TAX = ((params.containsKey("AMOUNT_INCLUDE_TAX")) ? (String[])params.get("AMOUNT_INCLUDE_TAX") : (String[])null);
		String[] HOME_CUR_AMOUNT = ((params.containsKey("HOME_CUR_AMOUNT")) ? (String[])params.get("HOME_CUR_AMOUNT") : (String[])null);
		String[] HOME_CUR_UNIT = ((params.containsKey("HOME_CUR_UNIT")) ? (String[])params.get("HOME_CUR_UNIT") : (String[])null);
		String[] EXCH_RATE = ((params.containsKey("EXCH_RATE")) ? (String[])params.get("EXCH_RATE") : (String[])null);
		String[] c_NON_NO_ITEM_FLG = ((params.containsKey("c_NON_NO_ITEM_FLG")) ? (String[])params.get("c_NON_NO_ITEM_FLG") : (String[])null);
		String[] SelectUnitCostFlag = ((params.containsKey("SelectUnitCostFlag")) ? (String[])params.get("SelectUnitCostFlag") : (String[])null);
		String[] INSTALL_FLG = ((params.containsKey("INSTALL_FLG")) ? (String[])params.get("INSTALL_FLG") : (String[])null);
		String[] THIS_MONTH = ((params.containsKey("THIS_MONTH")) ? (String[])params.get("THIS_MONTH") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] RTN_DEL_FLG = ((params.containsKey("RTN_DEL_FLG")) ? (String[])params.get("RTN_DEL_FLG") : (String[])null);
		String[] h_PUCH_RTN_DATE = ((params.containsKey("h_PUCH_RTN_DATE")) ? (String[])params.get("h_PUCH_RTN_DATE") : (String[])null);
		String[] PRODUCT_TYP = ((params.containsKey("PRODUCT_TYP")) ? (String[])params.get("PRODUCT_TYP") : (String[])null);
		String[] PRODUCT_TYP_name = ((params.containsKey("PRODUCT_TYP_name")) ? (String[])params.get("PRODUCT_TYP_name") : (String[])null);
		String[] PRODUCT_TYP_val = ((params.containsKey("PRODUCT_TYP_val")) ? (String[])params.get("PRODUCT_TYP_val") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] h_lotCtrl = ((params.containsKey("h_lotCtrl")) ? (String[])params.get("h_lotCtrl") : (String[])null);
		String[] TAX_CD = ((params.containsKey("TAX_CD")) ? (String[])params.get("TAX_CD") : (String[])null);

		struct.setPUCH_ODR_CD( ((PUCH_ODR_CD == null) ? (String)null : PUCH_ODR_CD[0]) );
		struct.setList_PUCH_ODR_CD(TypeConverter.convert(PUCH_ODR_CD));
		struct.seth_PUCH_ODR_CD( ((h_PUCH_ODR_CD == null) ? (String)null : h_PUCH_ODR_CD[0]) );
		struct.setList_h_PUCH_ODR_CD(TypeConverter.convert(h_PUCH_ODR_CD));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setPUCH_RTN_QTY( ((PUCH_RTN_QTY == null) ? (String)null : PUCH_RTN_QTY[0]) );
		struct.setList_PUCH_RTN_QTY(TypeConverter.convert(PUCH_RTN_QTY));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setPUCH_RTN_DATE( ((PUCH_RTN_DATE == null) ? (String)null : PUCH_RTN_DATE[0]) );
		struct.setList_PUCH_RTN_DATE(TypeConverter.convert(PUCH_RTN_DATE));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setPUCH_RTN_COMMENT( ((PUCH_RTN_COMMENT == null) ? (String)null : PUCH_RTN_COMMENT[0]) );
		struct.setList_PUCH_RTN_COMMENT(TypeConverter.convert(PUCH_RTN_COMMENT));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setUNIT_COST_TYP( ((UNIT_COST_TYP == null) ? (String)null : UNIT_COST_TYP[0]) );
		struct.setList_UNIT_COST_TYP(TypeConverter.convert(UNIT_COST_TYP));
		struct.setUNIT_COST_TYP_name( ((UNIT_COST_TYP_name == null) ? (String)null : UNIT_COST_TYP_name[0]) );
		struct.setList_UNIT_COST_TYP_name(TypeConverter.convert(UNIT_COST_TYP_name));
		struct.setUNIT_COST_TYP_val( ((UNIT_COST_TYP_val == null) ? (String)null : UNIT_COST_TYP_val[0]) );
		struct.setList_UNIT_COST_TYP_val(TypeConverter.convert(UNIT_COST_TYP_val));
		struct.setPUCH_ODR_PERSON( ((PUCH_ODR_PERSON == null) ? (String)null : PUCH_ODR_PERSON[0]) );
		struct.setList_PUCH_ODR_PERSON(TypeConverter.convert(PUCH_ODR_PERSON));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setUNIT_COST( ((UNIT_COST == null) ? (String)null : UNIT_COST[0]) );
		struct.setList_UNIT_COST(TypeConverter.convert(UNIT_COST));
		struct.setVEND_CUR_UNIT( ((VEND_CUR_UNIT == null) ? (String)null : VEND_CUR_UNIT[0]) );
		struct.setList_VEND_CUR_UNIT(TypeConverter.convert(VEND_CUR_UNIT));
		struct.setr1_FILTER( ((r1_FILTER == null) ? (String)null : r1_FILTER[0]) );
		struct.setList_r1_FILTER(TypeConverter.convert(r1_FILTER));
		struct.setPROCESSING_COST( ((PROCESSING_COST == null) ? (String)null : PROCESSING_COST[0]) );
		struct.setList_PROCESSING_COST(TypeConverter.convert(PROCESSING_COST));
		struct.setr2_FILTER( ((r2_FILTER == null) ? (String)null : r2_FILTER[0]) );
		struct.setList_r2_FILTER(TypeConverter.convert(r2_FILTER));
		struct.setMATERIAL_COST( ((MATERIAL_COST == null) ? (String)null : MATERIAL_COST[0]) );
		struct.setList_MATERIAL_COST(TypeConverter.convert(MATERIAL_COST));
		struct.setPUCH_ODR_CD_2( ((PUCH_ODR_CD_2 == null) ? (String)null : PUCH_ODR_CD_2[0]) );
		struct.setList_PUCH_ODR_CD_2(TypeConverter.convert(PUCH_ODR_CD_2));
		struct.setOTHER_OVERHEADS( ((OTHER_OVERHEADS == null) ? (String)null : OTHER_OVERHEADS[0]) );
		struct.setList_OTHER_OVERHEADS(TypeConverter.convert(OTHER_OVERHEADS));
		struct.setTAX_AMOUNT_1( ((TAX_AMOUNT_1 == null) ? (String)null : TAX_AMOUNT_1[0]) );
		struct.setList_TAX_AMOUNT_1(TypeConverter.convert(TAX_AMOUNT_1));
		struct.setTAX_RATE_1( ((TAX_RATE_1 == null) ? (String)null : TAX_RATE_1[0]) );
		struct.setList_TAX_RATE_1(TypeConverter.convert(TAX_RATE_1));
		struct.setPUCH_ODR_AMOUNT( ((PUCH_ODR_AMOUNT == null) ? (String)null : PUCH_ODR_AMOUNT[0]) );
		struct.setList_PUCH_ODR_AMOUNT(TypeConverter.convert(PUCH_ODR_AMOUNT));
		struct.setTAX_AMOUNT_2( ((TAX_AMOUNT_2 == null) ? (String)null : TAX_AMOUNT_2[0]) );
		struct.setList_TAX_AMOUNT_2(TypeConverter.convert(TAX_AMOUNT_2));
		struct.setTAX_RATE_2( ((TAX_RATE_2 == null) ? (String)null : TAX_RATE_2[0]) );
		struct.setList_TAX_RATE_2(TypeConverter.convert(TAX_RATE_2));
		struct.setDISC_AMOUNT( ((DISC_AMOUNT == null) ? (String)null : DISC_AMOUNT[0]) );
		struct.setList_DISC_AMOUNT(TypeConverter.convert(DISC_AMOUNT));
		struct.setTAX_AMOUNT_3( ((TAX_AMOUNT_3 == null) ? (String)null : TAX_AMOUNT_3[0]) );
		struct.setList_TAX_AMOUNT_3(TypeConverter.convert(TAX_AMOUNT_3));
		struct.setTAX_RATE_3( ((TAX_RATE_3 == null) ? (String)null : TAX_RATE_3[0]) );
		struct.setList_TAX_RATE_3(TypeConverter.convert(TAX_RATE_3));
		struct.setNET_AMOUNT( ((NET_AMOUNT == null) ? (String)null : NET_AMOUNT[0]) );
		struct.setList_NET_AMOUNT(TypeConverter.convert(NET_AMOUNT));
		struct.setAMOUNT_INCLUDE_TAX( ((AMOUNT_INCLUDE_TAX == null) ? (String)null : AMOUNT_INCLUDE_TAX[0]) );
		struct.setList_AMOUNT_INCLUDE_TAX(TypeConverter.convert(AMOUNT_INCLUDE_TAX));
		struct.setHOME_CUR_AMOUNT( ((HOME_CUR_AMOUNT == null) ? (String)null : HOME_CUR_AMOUNT[0]) );
		struct.setList_HOME_CUR_AMOUNT(TypeConverter.convert(HOME_CUR_AMOUNT));
		struct.setHOME_CUR_UNIT( ((HOME_CUR_UNIT == null) ? (String)null : HOME_CUR_UNIT[0]) );
		struct.setList_HOME_CUR_UNIT(TypeConverter.convert(HOME_CUR_UNIT));
		struct.setEXCH_RATE( ((EXCH_RATE == null) ? (String)null : EXCH_RATE[0]) );
		struct.setList_EXCH_RATE(TypeConverter.convert(EXCH_RATE));
		struct.setc_NON_NO_ITEM_FLG( ((c_NON_NO_ITEM_FLG == null) ? (String)null : c_NON_NO_ITEM_FLG[0]) );
		struct.setList_c_NON_NO_ITEM_FLG(TypeConverter.convert(c_NON_NO_ITEM_FLG));
		struct.setSelectUnitCostFlag( ((SelectUnitCostFlag == null) ? (String)null : SelectUnitCostFlag[0]) );
		struct.setList_SelectUnitCostFlag(TypeConverter.convert(SelectUnitCostFlag));
		struct.setINSTALL_FLG( ((INSTALL_FLG == null) ? (String)null : INSTALL_FLG[0]) );
		struct.setList_INSTALL_FLG(TypeConverter.convert(INSTALL_FLG));
		struct.setTHIS_MONTH( ((THIS_MONTH == null) ? (String)null : THIS_MONTH[0]) );
		struct.setList_THIS_MONTH(TypeConverter.convert(THIS_MONTH));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setRTN_DEL_FLG( ((RTN_DEL_FLG == null) ? (String)null : RTN_DEL_FLG[0]) );
		struct.setList_RTN_DEL_FLG(TypeConverter.convert(RTN_DEL_FLG));
		struct.seth_PUCH_RTN_DATE( ((h_PUCH_RTN_DATE == null) ? (String)null : h_PUCH_RTN_DATE[0]) );
		struct.setList_h_PUCH_RTN_DATE(TypeConverter.convert(h_PUCH_RTN_DATE));
		struct.setPRODUCT_TYP( ((PRODUCT_TYP == null) ? (String)null : PRODUCT_TYP[0]) );
		struct.setList_PRODUCT_TYP(TypeConverter.convert(PRODUCT_TYP));
		struct.setPRODUCT_TYP_name( ((PRODUCT_TYP_name == null) ? (String)null : PRODUCT_TYP_name[0]) );
		struct.setList_PRODUCT_TYP_name(TypeConverter.convert(PRODUCT_TYP_name));
		struct.setPRODUCT_TYP_val( ((PRODUCT_TYP_val == null) ? (String)null : PRODUCT_TYP_val[0]) );
		struct.setList_PRODUCT_TYP_val(TypeConverter.convert(PRODUCT_TYP_val));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.seth_lotCtrl( ((h_lotCtrl == null) ? (String)null : h_lotCtrl[0]) );
		struct.setList_h_lotCtrl(TypeConverter.convert(h_lotCtrl));
		struct.setTAX_CD( ((TAX_CD == null) ? (String)null : TAX_CD[0]) );
		struct.setList_TAX_CD(TypeConverter.convert(TAX_CD));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AE0120010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAE0120010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAE0120010Struct";   // JSP先のバインド名(Struct)の指定
	public static int WEBSERVER_TYPE = 0;                               // Webサーバタイプの定義
	public static String MENU_TARGET = "/main.jsp";					// メニューページの設定
	public static String ERROR_TARGET = "/ExpjMessage.jsp";					// エラーページの設定
	public static String EVENT_STATUS = "event_status";					// Session Objectに格納するイベント状態のName
	public static String BEGIN_EVENT = "begin";							// Session Objectに格納する初期イベントの値
	public static String EXECUTE_EVENT = "execute";						// Session Objectに格納するリロードイベントの値

	//////////////////////////////

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * デフォルトで実行される処理
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String defaultEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0120010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0120010Entity entity = control.entity;
		AE0120010Struct struct = control.struct;

		if( so == null ) return ERROR_TARGET;
		if( refererURL == null ) return nextUrl;

		// 各画面の初期起動の判定
		if( (so.getAttribute(refererURL) == null)&&(so.getAttribute(refererURL+EVENT_STATUS) == null) ) {
			so.setAttribute(refererURL+EVENT_STATUS,BEGIN_EVENT);
			nextUrl = initialEvent(request, response, so, params, control);
			String nextUrlTmp = reloadEvent(request, response, so, params, control);
			if(nextUrlTmp != null) {
				nextUrl = nextUrlTmp;
			}
		} else {
			so.setAttribute(refererURL,BEGIN_EVENT);
			nextUrl = reloadEvent(request, response, so, params, control);
		}

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0120");
		logger.entering("AE0120010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AE0120010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

		return nextUrl;
	}

	/**
	 * イベントハンドラ
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 */
	public String eventHandling(
					HttpServletRequest request,
					HttpServletResponse response) throws ServletException, IOException
	{
		ManageContainer  container;
		HttpSession so;
		Hashtable     params  = null;
		String        target  = null;
		String        refererURL = null;
		AE0120010Control control;
		AE0120010Entity  entity = null;
		AE0120010Struct  struct = null;

		try {
			container = CoreTools.getContainer();
			if (request.getAttribute("MSG_SERVLET_FORWARDED") == null) {
				params = CoreTools.getParamsList(request);
			} else {
				// Servlet間遷移の場合はパラメータを設定しない。
				params = new Hashtable();
			}
			so = request.getSession();
			
			// Session Timeout時の処理
			if(so == null || so.getAttribute("UserId") == null) return MENU_TARGET;

			// 参照元URLの格納
			refererURL = getReferURL(request);

			if( (control = (AE0120010Control)so.getAttribute("AE0120010Control_"+request.getSession(false).getId())) == null ) {
				control = new AE0120010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AE0120010Control();
						struct = control.struct;
						entity = control.entity;
						struct.setsUser_ID( request.getRemoteUser() );
						entity.setUsrId( request.getRemoteUser() );
						control.setBusiness(Business.getCurrentBusiness(so, request));
					}
				}
			}

			// ユーザ名のセット
			control.setUsrId( request.getRemoteUser() );
			control.setsysUSER_CD((String)request.getRemoteUser() );
			control.setsysPLANT_CD((String)so.getAttribute("PlantCd"));
			control.setsysUSER_NAME((String)so.getAttribute( "UserName" ));
			control.setsysPLANT_NAME((String)so.getAttribute( "PlantName" ));

			// メッセージストラクト作成
			if (control.getMsgStruct() == null) {
				control.createMsgStruct();
			}

			// 画面共通パラメータの取得
			setScreenCommonParams(params, control);
			// コネクションの取得
			//if(control.conn == null || control.conn.getConn() == null) { control.conn = CoreTools.getTransConnection(); }
			control.connect();
			// 表示権限設定
			ArrayList revokeCtrlList = Screen.getRevokeControlList(control.conn, control.getBusiness().getBusinessCd());
			Screen.setRevokeControlListToRequest(request, revokeCtrlList);

			try {
				// イベントの処理
				if( isClick(request, "Select") ) {
					if ( !isCryptical(request, so, params, "Select") ) return ERROR_TARGET;
					target = onClickSelect(request, response, so, params, control);
					control.setButton("Select");
				} else if( isClick(request, "SelectUnitCost") ) {
					if ( !isCryptical(request, so, params, "SelectUnitCost") ) return ERROR_TARGET;
					target = onClickSelectUnitCost(request, response, so, params, control);
					control.setButton("SelectUnitCost");
				} else if( isClick(request, "Insert") ) {
					if ( !isCryptical(request, so, params, "Insert") ) return ERROR_TARGET;
					target = onClickInsert(request, response, so, params, control);
					control.setButton("Insert");
				} else if( isClick(request, "Update") ) {
					if ( !isCryptical(request, so, params, "Update") ) return ERROR_TARGET;
					target = onClickUpdate(request, response, so, params, control);
					control.setButton("Update");
				} else if( isClick(request, "Delete") ) {
					if ( !isCryptical(request, so, params, "Delete") ) return ERROR_TARGET;
					target = onClickDelete(request, response, so, params, control);
					control.setButton("Delete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AE0120010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
					// TODO: ユーザ定義のコードを記述してください
                                //}}user_implement_dev:<eventHandling>

				if(target==null) { target = DEFAULT_TARGET; }

				// targetの編集
				int exist = target.indexOf("?");
				String uri = null;
				String args = null;
				if(exist != -1) {
					uri = target.substring(0,exist);
					args = target.substring(exist+1,target.length());
					if((args != null) &&  (args.length() != 0) && (args.equals("") != true)) {
						target = uri + "?MSG_CONTEXT_NO=" + control.getBusiness().getContextNumber() + "&" + args;
					} else {
						target = uri + "?MSG_CONTEXT_NO=" + control.getBusiness().getContextNumber();
					}
				} else {
					target += "?MSG_CONTEXT_NO=" + control.getBusiness().getContextNumber();
				}

				// Servletへの属性の登録
				if (control.getBusiness().getAutoSendMessageId() != 0) {
					request.setAttribute("MSG_MESSAGE_ID", String.valueOf(control.getBusiness().getAutoSendMessageId()));
					request.setAttribute("MSG_BUSINESS_CD", control.getBusiness().getAutoSendBusinessCdTo());
					request.setAttribute("MSG_SERVLET_FORWARDED", new Object());
				}

				// JSPへの属性の登録
				request.setAttribute(JSP_BIND_NAME_Control,control);
				request.setAttribute(JSP_BIND_NAME_Struct,control.getStruct());
				try {
					control.conn.commit();
				} catch (Exception ex){
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "Commit fault"); //コミット失敗
				}
			} catch (ExpjException ee){
				try {
					control.conn.rollback();
				} catch (Exception ex){
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "RollBack fault"); //ロールバック失敗
				}
				ee.printStackTrace();
				if(control.logInit){
					control.sysLog.severe( ee.getExpjMessage(), control.getsysUSER_CD()); //エラーメッセージ
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), ee.toString()); //エラー詳細
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "ProcessId:" + control.sp.getProcId()); //業務名
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "PlantCd:" + control.getsysPLANT_CD()); //工場コード
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "UserCd:" + control.getsysUSER_CD()); //ユーザコード
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "StructDump：" + struct); //ストラクトダンプ
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), getStackTrace((Throwable)ee)); //スタックトレース
				}
				throw ee;
			} catch(Exception e) {
				try {
					control.conn.rollback();
				} catch (Exception ex){
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "RollBack fault"); //ロールバック失敗
				}
				ExpjException ee = new ExpjException(e, "ZZ01106");
				ee.printStackTrace();
				if(control.logInit){
					control.sysLog.severe( ee.getExpjMessage(), control.getsysUSER_CD()); //エラーメッセージ
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), ee.toString()); //エラー詳細
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "ProcessId:" + control.sp.getProcId()); //業務名
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "PlantCd:" + control.getsysPLANT_CD()); //工場コード
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "UserCd:" + control.getsysUSER_CD()); //ユーザコード
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "StructDump：" + struct); //ストラクトダンプ
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), getStackTrace((Throwable)ee)); //スタックトレース
				}
				throw ee;
			} finally {
				// コネクションの切断
				if((isClick(request, "Select") && bFLG_DISCONNECT_Select)
				|| (isClick(request, "SelectUnitCost") && bFLG_DISCONNECT_SelectUnitCost)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Delete") && bFLG_DISCONNECT_Delete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				) {
					//if(control.conn != null) {CoreTools.closeTransConnection(control.conn);}
					//control.conn = null;
					control.disconnect(control.conn);
					control.conn = null;
				} else if(bFLG_DISCONNECT_defaultEvent) {
					//if(control.conn != null) {CoreTools.closeTransConnection(control.conn);}
					//control.conn = null;
					control.disconnect(control.conn);
					control.conn = null;
				}
			}
			return target;
		} catch (ExpjException ee){
			ee.setToRequest(request);
			return ERROR_TARGET;
		} catch (FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.printStackTrace();
			ee.setToRequest(request);
			return ERROR_TARGET;
		} catch( Exception e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			e.printStackTrace();
			ee.setToRequest(request);
			return ERROR_TARGET;
		} finally {
			if(params!=null) params.clear();
		}
	}

	/**
	 * submitボタン押下時コネクションを自動的にcloseするためのフラグ
	 * 自動切断時：true（デフォルト）
	 * トランザクション継続時：false
	 * を設定します。
	 * 設定値の変更はコンストラクタで行ってください。
	 */
	private  static boolean bFLG_DISCONNECT_defaultEvent = true;
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_SelectUnitCost = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Delete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;

	//////////////////////////////

	// 初期化処理
	public void init(ServletConfig config) throws ServletException
	{
		super.init( config );
		return;
	}

	// doGetメソッドの処理
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FlashServletRequest req = new FlashServletRequest(request);
		move( eventHandling(req, response), req, response );
		return;
	}

	// doPostメソッドの処理
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FlashServletRequest req = new FlashServletRequest(request);
		move( eventHandling(req, response), req, response );
		return;
	}

	//////////////////////////////

	/*
	 * 指定されたURLに移動します。
	 *
	 * @param url 移動先URL
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 *
	 */
	void move(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// JSPにリクエストのフォワード
		if(url != null) {
			if (!url.startsWith("/")) {
				url = "/" + url;
			}
			ServletContext sContext = getServletContext();
			sContext.getRequestDispatcher(url).forward(request, response);
		}
		return;
	}

	/**
	 * 参照元URLを取得します。
	 */
	String getReferURL(HttpServletRequest request)
	{
		return (request.getHeader("referer") == null ? request.getRequestURI() : request.getHeader("referer"));
	}

	/*
	 * クリックされたかどうかをチェックします
	 */
	boolean isClick(HttpServletRequest request, String buttonName)
	{
		// Servlet間遷移の場合は、クリックを判定しない。
		if (request.getAttribute("MSG_SERVLET_FORWARDED") != null) {
			return false;
		}

		boolean click = false;
		click = (request.getParameterValues(buttonName)==null ? false : true);
		if ( (!click) && ( "CsvIn".equals(buttonName) ) ) {
			boolean bCsvIn = false;
			try {
				bCsvIn = request.getContentType().toLowerCase().startsWith("multipart/form-data");
			} catch ( Exception e ) {
				bCsvIn = false;
			}
			click = bCsvIn;
		}
		//{{user_implement_dev:<isClick>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<isClick>
		return click;
	}

	static private boolean bFLG_CSRF = true;
	static private String algorithm = null;

	/*
	 * ＣＳＲＦ対策として、ハッシュ化されたセッションIDの画面からの受信状況をチェックします
	 */
	boolean isCryptical(HttpServletRequest request, HttpSession so, Hashtable params, String buttonName) throws ExpjException
	{
		if( request == null ) {
			ExpjException ee = new ExpjException((Exception)null, "ZZ01106");
			ee.add(new ExpjMessage("ZZ01006", "request is null"));
			throw ee;
		}

		if ( "CsvIn".equals(buttonName) ) {
			if ( request.getParameterValues(buttonName) == null ) {
				try {
					if ( request.getContentType().toLowerCase().startsWith("multipart/form-data") ) {
						// CSVアップロード時はチェック対象外
						return true;
					}
				} catch ( Exception e ) {// NO ACTION}
				}
			}
		}

		if( bFLG_CSRF ) {
			ExpjException ee = new ExpjException((Exception)null, "ZZ01106");
			if ( so == null ) {
				ee.add(new ExpjMessage("ZZ01006", "session is null"));
				throw ee;
			}
			String sessionId = so.getId();
			if( sessionId == null ) {
				ee.add(new ExpjMessage("ZZ01006", "id from session is null"));
				throw ee;
			}

			if ( params == null ) {
				ee.add(new ExpjMessage("ZZ01006", "parameters is null"));
				throw ee;
			}
			String[] hashes = (String[])params.get("ORTEUS_HASHED");
			String hashed = null;
			if ( ( hashes != null ) && ( hashes.length > 0 ) ) {
				hashed = hashes[0];
			}
			if( hashed == null ) {
				ee.add(new ExpjMessage("ZZ01006", "keyword from screen is null"));
				throw ee;
			}

			if (algorithm == null) {
				algorithm = "SHA-1";
				try {
					algorithm = AppServerResources.getInstance().getString("orteus.csrf.algorithm");
				} catch(Exception e) {
					// NO ACTION
				}
			}
			String sessionIdHash = XafTools.getCryptString(sessionId, algorithm);
			if ( !sessionIdHash.equals(hashed) ) {
				ee.add(new ExpjMessage("ZZ01006", "session id hash is NG"));
				throw ee;
			}
		}
		return true;
	}

	/*
	 * Servlet情報の取得
	 */
	public String getServletInfo()
	{
		return "com.nec.jp.orteus.metamorBase.AE0120.AE0120010Servlet";
	}

	/**
	 * 消滅時の処理
	 */
	public void destroy()
	{
		objMessage = null;
	}

	/*
	 * 標準コンストラクタ
	 */
	public AE0120010Servlet()
	{
		//{{user_implement_dev:<AE0120010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_SelectUnitCost = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;
		bFLG_DISCONNECT_Delete = true;
		bFLG_DISCONNECT_Clear = true;

                //}}user_implement_dev:<AE0120010_DisConnect_FLG>

		//{{user_implement_dev:<AE0120010Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AE0120010Servlet>
	}

	//////////////////////////////

}
