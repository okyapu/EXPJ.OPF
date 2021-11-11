/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060020Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0060;

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
//}}user_implement_dev:header

public class AE0060020Servlet extends HttpServlet
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
	 * @param control AE0060020Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AE0060020Control control)
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
		// TODO: ユーザ定義のコードを記述してください
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AE0060020Control control)
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
	 * @param control AE0060020Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
			logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
			//			objMessage.m_writer.write( Level.ALL, "AE0060020"+" $Revision: 1.38 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AE0060020Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			// TODO: ユーザ定義のコードを記述してください

			control.control_eventHandller("reload");

		} catch (FoundationException e) {
			//			e.printStackTrace();
			//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060020-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Select");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickLineInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060021.jsp";		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");
		//{{user_implement_dev:<onClickLineInsert>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LineInsert");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineInsert>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickLineUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060021.jsp";		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");
		//{{user_implement_dev:<onClickLineUpdate>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LineUpdate");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineUpdate>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");

		return nextUrl;
	}

	/**
	 * 完了解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickCancelComplete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");
		//{{user_implement_dev:<onClickCancelComplete>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CancelComplete");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelComplete>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Clear");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickSelectUnitCost(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060021.jsp";		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");
		//{{user_implement_dev:<onClickSelectUnitCost>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("SelectUnitCost");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectUnitCost>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.setNextUrl(nextUrl);
			control.control_eventHandller("Insert");
			nextUrl = control.getNextUrl();
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.setNextUrl(nextUrl);
			control.control_eventHandller("Update");
			nextUrl = control.getNextUrl();
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickReturn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");
		//{{user_implement_dev:<onClickReturn>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Return");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReturn>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickInsert2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert2");
		//{{user_implement_dev:<onClickInsert2>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Insert2");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AE0060022.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert2>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert2");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickUpdate2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate2");
		//{{user_implement_dev:<onClickUpdate2>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Update2");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AE0060022.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate2>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate2");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickReturn2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn2");
		//{{user_implement_dev:<onClickReturn2>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Return2");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReturn2>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn2");

		return nextUrl;
	}

	/**
	 * 使用数修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickNoUserParts(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060022.jsp";		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickNoUserParts");
		//{{user_implement_dev:<onClickNoUserParts>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("NoUserParts");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickNoUserParts>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickNoUserParts");

		return nextUrl;
	}

	/**
	 * 支給品追加登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickUseParts(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060022.jsp";		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUseParts");
		//{{user_implement_dev:<onClickUseParts>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("UseParts");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUseParts>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUseParts");

		return nextUrl;
	}

	/**
	 * ClickShowボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickClickShow(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060020iframe.jsp";		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");
		//{{user_implement_dev:<onClickClickShow>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ClickShow");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClickShow>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");

		return nextUrl;
	}

	/**
	 * 取消解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickCancelOdrCancel(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelOdrCancel");
		//{{user_implement_dev:<onClickCancelOdrCancel>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CancelOdrCancel");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelOdrCancel>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelOdrCancel");

		return nextUrl;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");
		//{{user_implement_dev:<onClickDetail>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Detail");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickDetail>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");

		return nextUrl;
	}

	/**
	 * ロット管理ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060020Controlクラスインスタンス
	 */
	public String onClickLotInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");
		//{{user_implement_dev:<onClickLotInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LotInsert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLotInsert>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AE0060020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PUCH_ODR_CD = ((params.containsKey("PUCH_ODR_CD")) ? (String[])params.get("PUCH_ODR_CD") : (String[])null);
		String[] l_ACPT_NO = ((params.containsKey("l_ACPT_NO")) ? (String[])params.get("l_ACPT_NO") : (String[])null);
		String[] l_ACPT_QTY = ((params.containsKey("l_ACPT_QTY")) ? (String[])params.get("l_ACPT_QTY") : (String[])null);
		String[] l_WH_CD = ((params.containsKey("l_WH_CD")) ? (String[])params.get("l_WH_CD") : (String[])null);
		String[] l_WH_NAME = ((params.containsKey("l_WH_NAME")) ? (String[])params.get("l_WH_NAME") : (String[])null);
		String[] l_DLV_CD = ((params.containsKey("l_DLV_CD")) ? (String[])params.get("l_DLV_CD") : (String[])null);
		String[] l_UNIT_COST = ((params.containsKey("l_UNIT_COST")) ? (String[])params.get("l_UNIT_COST") : (String[])null);
		String[] l_ACPT_STS_TYP_DN = ((params.containsKey("l_ACPT_STS_TYP_DN")) ? (String[])params.get("l_ACPT_STS_TYP_DN") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] SUM_ACPT_QTY = ((params.containsKey("SUM_ACPT_QTY")) ? (String[])params.get("SUM_ACPT_QTY") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] ACPT_INSPC_TYP_DN = ((params.containsKey("ACPT_INSPC_TYP_DN")) ? (String[])params.get("ACPT_INSPC_TYP_DN") : (String[])null);
		String[] PUCH_ODR_DLV_DATE = ((params.containsKey("PUCH_ODR_DLV_DATE")) ? (String[])params.get("PUCH_ODR_DLV_DATE") : (String[])null);
		String[] CONFIRM_DLV_DATE = ((params.containsKey("CONFIRM_DLV_DATE")) ? (String[])params.get("CONFIRM_DLV_DATE") : (String[])null);
		String[] PUCH_ODR_SLIP_ISS_DATE = ((params.containsKey("PUCH_ODR_SLIP_ISS_DATE")) ? (String[])params.get("PUCH_ODR_SLIP_ISS_DATE") : (String[])null);
		String[] PUCH_ODR_QTY = ((params.containsKey("PUCH_ODR_QTY")) ? (String[])params.get("PUCH_ODR_QTY") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] PROC_NAME = ((params.containsKey("PROC_NAME")) ? (String[])params.get("PROC_NAME") : (String[])null);
		String[] PUCH_ODR_PERSON = ((params.containsKey("PUCH_ODR_PERSON")) ? (String[])params.get("PUCH_ODR_PERSON") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] SPL_ITEM_TYP_DN = ((params.containsKey("SPL_ITEM_TYP_DN")) ? (String[])params.get("SPL_ITEM_TYP_DN") : (String[])null);
		String[] PRODUCT_TYP_DN = ((params.containsKey("PRODUCT_TYP_DN")) ? (String[])params.get("PRODUCT_TYP_DN") : (String[])null);
		String[] PUCH_ODR_STS_TYP_DN = ((params.containsKey("PUCH_ODR_STS_TYP_DN")) ? (String[])params.get("PUCH_ODR_STS_TYP_DN") : (String[])null);
		String[] NON_NO_ITEM_FLG_DN = ((params.containsKey("NON_NO_ITEM_FLG_DN")) ? (String[])params.get("NON_NO_ITEM_FLG_DN") : (String[])null);
		String[] ACPT_NO = ((params.containsKey("ACPT_NO")) ? (String[])params.get("ACPT_NO") : (String[])null);
		String[] ACPT_QTY = ((params.containsKey("ACPT_QTY")) ? (String[])params.get("ACPT_QTY") : (String[])null);
		String[] c_COMPLETE = ((params.containsKey("c_COMPLETE")) ? (String[])params.get("c_COMPLETE") : (String[])null);
		String[] BUSINESS_OPR_DATE = ((params.containsKey("BUSINESS_OPR_DATE")) ? (String[])params.get("BUSINESS_OPR_DATE") : (String[])null);
		String[] ACPT_DATE = ((params.containsKey("ACPT_DATE")) ? (String[])params.get("ACPT_DATE") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] CUR_CD = ((params.containsKey("CUR_CD")) ? (String[])params.get("CUR_CD") : (String[])null);
		String[] CUR_NAME = ((params.containsKey("CUR_NAME")) ? (String[])params.get("CUR_NAME") : (String[])null);
		String[] UNIT_COST_TYP = ((params.containsKey("UNIT_COST_TYP")) ? (String[])params.get("UNIT_COST_TYP") : (String[])null);
		String[] UNIT_COST_TYP_name = ((params.containsKey("UNIT_COST_TYP_name")) ? (String[])params.get("UNIT_COST_TYP_name") : (String[])null);
		String[] UNIT_COST_TYP_val = ((params.containsKey("UNIT_COST_TYP_val")) ? (String[])params.get("UNIT_COST_TYP_val") : (String[])null);
		String[] UNIT_COST = ((params.containsKey("UNIT_COST")) ? (String[])params.get("UNIT_COST") : (String[])null);
		String[] VEND_CUR_UNIT = ((params.containsKey("VEND_CUR_UNIT")) ? (String[])params.get("VEND_CUR_UNIT") : (String[])null);
		String[] PROCESSING_COST = ((params.containsKey("PROCESSING_COST")) ? (String[])params.get("PROCESSING_COST") : (String[])null);
		String[] TAX_AMOUNT_1 = ((params.containsKey("TAX_AMOUNT_1")) ? (String[])params.get("TAX_AMOUNT_1") : (String[])null);
		String[] TAX_RATE_1 = ((params.containsKey("TAX_RATE_1")) ? (String[])params.get("TAX_RATE_1") : (String[])null);
		String[] MATERIAL_COST = ((params.containsKey("MATERIAL_COST")) ? (String[])params.get("MATERIAL_COST") : (String[])null);
		String[] TAX_AMOUNT_2 = ((params.containsKey("TAX_AMOUNT_2")) ? (String[])params.get("TAX_AMOUNT_2") : (String[])null);
		String[] TAX_RATE_2 = ((params.containsKey("TAX_RATE_2")) ? (String[])params.get("TAX_RATE_2") : (String[])null);
		String[] OTHER_OVERHEADS = ((params.containsKey("OTHER_OVERHEADS")) ? (String[])params.get("OTHER_OVERHEADS") : (String[])null);
		String[] TAX_AMOUNT_3 = ((params.containsKey("TAX_AMOUNT_3")) ? (String[])params.get("TAX_AMOUNT_3") : (String[])null);
		String[] TAX_RATE_3 = ((params.containsKey("TAX_RATE_3")) ? (String[])params.get("TAX_RATE_3") : (String[])null);
		String[] PUCH_ODR_AMOUNT = ((params.containsKey("PUCH_ODR_AMOUNT")) ? (String[])params.get("PUCH_ODR_AMOUNT") : (String[])null);
		String[] AMOUNT_INCLUDE_TAX = ((params.containsKey("AMOUNT_INCLUDE_TAX")) ? (String[])params.get("AMOUNT_INCLUDE_TAX") : (String[])null);
		String[] DISC_AMOUNT = ((params.containsKey("DISC_AMOUNT")) ? (String[])params.get("DISC_AMOUNT") : (String[])null);
		String[] HOME_CUR_AMOUNT = ((params.containsKey("HOME_CUR_AMOUNT")) ? (String[])params.get("HOME_CUR_AMOUNT") : (String[])null);
		String[] HOME_CUR_UNIT = ((params.containsKey("HOME_CUR_UNIT")) ? (String[])params.get("HOME_CUR_UNIT") : (String[])null);
		String[] NET_AMOUNT = ((params.containsKey("NET_AMOUNT")) ? (String[])params.get("NET_AMOUNT") : (String[])null);
		String[] EXCH_RATE = ((params.containsKey("EXCH_RATE")) ? (String[])params.get("EXCH_RATE") : (String[])null);
		String[] DLV_CD = ((params.containsKey("DLV_CD")) ? (String[])params.get("DLV_CD") : (String[])null);
		String[] ACPT_RSLT_COMMENT = ((params.containsKey("ACPT_RSLT_COMMENT")) ? (String[])params.get("ACPT_RSLT_COMMENT") : (String[])null);
		String[] INSPC_CMPLT_FLG_DN = ((params.containsKey("INSPC_CMPLT_FLG_DN")) ? (String[])params.get("INSPC_CMPLT_FLG_DN") : (String[])null);
		String[] SelectUnitCostFlag = ((params.containsKey("SelectUnitCostFlag")) ? (String[])params.get("SelectUnitCostFlag") : (String[])null);
		String[] PUCH_ODR_MODIFY_COUNT = ((params.containsKey("PUCH_ODR_MODIFY_COUNT")) ? (String[])params.get("PUCH_ODR_MODIFY_COUNT") : (String[])null);
		String[] ACPT_MODIFY_COUNT = ((params.containsKey("ACPT_MODIFY_COUNT")) ? (String[])params.get("ACPT_MODIFY_COUNT") : (String[])null);
		String[] ACPT_INSPC_TYP = ((params.containsKey("ACPT_INSPC_TYP")) ? (String[])params.get("ACPT_INSPC_TYP") : (String[])null);
		String[] PUCH_ODR_STS_TYP = ((params.containsKey("PUCH_ODR_STS_TYP")) ? (String[])params.get("PUCH_ODR_STS_TYP") : (String[])null);
		String[] INSPC_CMPLT_FLG = ((params.containsKey("INSPC_CMPLT_FLG")) ? (String[])params.get("INSPC_CMPLT_FLG") : (String[])null);
		String[] SPL_ITEM_TYP = ((params.containsKey("SPL_ITEM_TYP")) ? (String[])params.get("SPL_ITEM_TYP") : (String[])null);
		String[] PRODUCT_TYP = ((params.containsKey("PRODUCT_TYP")) ? (String[])params.get("PRODUCT_TYP") : (String[])null);
		String[] NON_NO_ITEM_FLG = ((params.containsKey("NON_NO_ITEM_FLG")) ? (String[])params.get("NON_NO_ITEM_FLG") : (String[])null);
		String[] UNIT_QTY_TYP_DN = ((params.containsKey("UNIT_QTY_TYP_DN")) ? (String[])params.get("UNIT_QTY_TYP_DN") : (String[])null);
		String[] UNIT_QTY_TYP = ((params.containsKey("UNIT_QTY_TYP")) ? (String[])params.get("UNIT_QTY_TYP") : (String[])null);
		String[] l_STOCK_UNIT = ((params.containsKey("l_STOCK_UNIT")) ? (String[])params.get("l_STOCK_UNIT") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] SUPPLIED_ISSUE_QTY = ((params.containsKey("SUPPLIED_ISSUE_QTY")) ? (String[])params.get("SUPPLIED_ISSUE_QTY") : (String[])null);
		String[] TOTAL_ISSUE_QTY = ((params.containsKey("TOTAL_ISSUE_QTY")) ? (String[])params.get("TOTAL_ISSUE_QTY") : (String[])null);
		String[] SUPPLIED_DATE = ((params.containsKey("SUPPLIED_DATE")) ? (String[])params.get("SUPPLIED_DATE") : (String[])null);
		String[] STOCK_ON_HAND_QTY = ((params.containsKey("STOCK_ON_HAND_QTY")) ? (String[])params.get("STOCK_ON_HAND_QTY") : (String[])null);
		String[] PART_SUPPLIED_COMMENT = ((params.containsKey("PART_SUPPLIED_COMMENT")) ? (String[])params.get("PART_SUPPLIED_COMMENT") : (String[])null);
		String[] ISSUE_INST_CD = ((params.containsKey("ISSUE_INST_CD")) ? (String[])params.get("ISSUE_INST_CD") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] SUPPLIED_UNIT_NUMERATOR = ((params.containsKey("SUPPLIED_UNIT_NUMERATOR")) ? (String[])params.get("SUPPLIED_UNIT_NUMERATOR") : (String[])null);
		String[] SUPPLIED_UNIT_DENOMINATOR = ((params.containsKey("SUPPLIED_UNIT_DENOMINATOR")) ? (String[])params.get("SUPPLIED_UNIT_DENOMINATOR") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_SUPPLIED_GNR_TYP = ((params.containsKey("l_SUPPLIED_GNR_TYP")) ? (String[])params.get("l_SUPPLIED_GNR_TYP") : (String[])null);
		String[] l_SUPPLIED_QTY = ((params.containsKey("l_SUPPLIED_QTY")) ? (String[])params.get("l_SUPPLIED_QTY") : (String[])null);
		String[] l_TOTAL_ISSUE_QTY = ((params.containsKey("l_TOTAL_ISSUE_QTY")) ? (String[])params.get("l_TOTAL_ISSUE_QTY") : (String[])null);
		String[] l_SUPPLIED_DATE = ((params.containsKey("l_SUPPLIED_DATE")) ? (String[])params.get("l_SUPPLIED_DATE") : (String[])null);
		String[] l_HAND_QTY = ((params.containsKey("l_HAND_QTY")) ? (String[])params.get("l_HAND_QTY") : (String[])null);
		String[] l_PART_SUPPLIED_COMMENT = ((params.containsKey("l_PART_SUPPLIED_COMMENT")) ? (String[])params.get("l_PART_SUPPLIED_COMMENT") : (String[])null);
		String[] l_ISSUE_INST_CD = ((params.containsKey("l_ISSUE_INST_CD")) ? (String[])params.get("l_ISSUE_INST_CD") : (String[])null);
		String[] l_MRP_ODR_TYP = ((params.containsKey("l_MRP_ODR_TYP")) ? (String[])params.get("l_MRP_ODR_TYP") : (String[])null);
		String[] l_SUPPLIED_UNIT_DENOMINATOR = ((params.containsKey("l_SUPPLIED_UNIT_DENOMINATOR")) ? (String[])params.get("l_SUPPLIED_UNIT_DENOMINATOR") : (String[])null);
		String[] l_SUPPLIED_UNIT_NUMERATOR = ((params.containsKey("l_SUPPLIED_UNIT_NUMERATOR")) ? (String[])params.get("l_SUPPLIED_UNIT_NUMERATOR") : (String[])null);
		String[] l_STOCK_UNIT2 = ((params.containsKey("l_STOCK_UNIT2")) ? (String[])params.get("l_STOCK_UNIT2") : (String[])null);
		String[] STOCK_UNIT1 = ((params.containsKey("STOCK_UNIT1")) ? (String[])params.get("STOCK_UNIT1") : (String[])null);
		String[] STOCK_UNIT2 = ((params.containsKey("STOCK_UNIT2")) ? (String[])params.get("STOCK_UNIT2") : (String[])null);
		String[] STOCK_UNIT3 = ((params.containsKey("STOCK_UNIT3")) ? (String[])params.get("STOCK_UNIT3") : (String[])null);
		String[] STOCK_UNIT4 = ((params.containsKey("STOCK_UNIT4")) ? (String[])params.get("STOCK_UNIT4") : (String[])null);
		String[] STOCK_UNIT5 = ((params.containsKey("STOCK_UNIT5")) ? (String[])params.get("STOCK_UNIT5") : (String[])null);
		String[] l_SUPPLIED_RE_QTY = ((params.containsKey("l_SUPPLIED_RE_QTY")) ? (String[])params.get("l_SUPPLIED_RE_QTY") : (String[])null);
		String[] h_ACPT_QTY = ((params.containsKey("h_ACPT_QTY")) ? (String[])params.get("h_ACPT_QTY") : (String[])null);
		String[] h_ACPT_DATE = ((params.containsKey("h_ACPT_DATE")) ? (String[])params.get("h_ACPT_DATE") : (String[])null);
		String[] h_TOTAL_ISSUE_QTY = ((params.containsKey("h_TOTAL_ISSUE_QTY")) ? (String[])params.get("h_TOTAL_ISSUE_QTY") : (String[])null);
		String[] h_SUPPLIED_DATE = ((params.containsKey("h_SUPPLIED_DATE")) ? (String[])params.get("h_SUPPLIED_DATE") : (String[])null);
		String[] h_PART_SUPPLIED_COMMENT = ((params.containsKey("h_PART_SUPPLIED_COMMENT")) ? (String[])params.get("h_PART_SUPPLIED_COMMENT") : (String[])null);
		String[] h_PUCH_ODR_CD = ((params.containsKey("h_PUCH_ODR_CD")) ? (String[])params.get("h_PUCH_ODR_CD") : (String[])null);
		String[] l_UNIT_QTY_TYP = ((params.containsKey("l_UNIT_QTY_TYP")) ? (String[])params.get("l_UNIT_QTY_TYP") : (String[])null);
		String[] UNIT_QTY_TYP2 = ((params.containsKey("UNIT_QTY_TYP2")) ? (String[])params.get("UNIT_QTY_TYP2") : (String[])null);
		String[] h_ODR_CANCEL_SLIP_ISS_FLG = ((params.containsKey("h_ODR_CANCEL_SLIP_ISS_FLG")) ? (String[])params.get("h_ODR_CANCEL_SLIP_ISS_FLG") : (String[])null);
		String[] c_CANCEL = ((params.containsKey("c_CANCEL")) ? (String[])params.get("c_CANCEL") : (String[])null);
		String[] ODR_CANCEL_CAUSE_CD = ((params.containsKey("ODR_CANCEL_CAUSE_CD")) ? (String[])params.get("ODR_CANCEL_CAUSE_CD") : (String[])null);
		String[] h_ACPT_RSLT_COUNT = ((params.containsKey("h_ACPT_RSLT_COUNT")) ? (String[])params.get("h_ACPT_RSLT_COUNT") : (String[])null);
		String[] THIS_MONTH = ((params.containsKey("THIS_MONTH")) ? (String[])params.get("THIS_MONTH") : (String[])null);
		String[] INSTALL_FLG = ((params.containsKey("INSTALL_FLG")) ? (String[])params.get("INSTALL_FLG") : (String[])null);
		String[] PUCH_ODR_COMMENT = ((params.containsKey("PUCH_ODR_COMMENT")) ? (String[])params.get("PUCH_ODR_COMMENT") : (String[])null);
		String[] INSPC_WH_CD = ((params.containsKey("INSPC_WH_CD")) ? (String[])params.get("INSPC_WH_CD") : (String[])null);
		String[] INSPC_WH_NAME = ((params.containsKey("INSPC_WH_NAME")) ? (String[])params.get("INSPC_WH_NAME") : (String[])null);
		String[] ITEM_CD_DW = ((params.containsKey("ITEM_CD_DW")) ? (String[])params.get("ITEM_CD_DW") : (String[])null);
		String[] ITEM_NAME_DW = ((params.containsKey("ITEM_NAME_DW")) ? (String[])params.get("ITEM_NAME_DW") : (String[])null);
		String[] l_LOT_NO = ((params.containsKey("l_LOT_NO")) ? (String[])params.get("l_LOT_NO") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] h_LOT_NUMBERING_TYP = ((params.containsKey("h_LOT_NUMBERING_TYP")) ? (String[])params.get("h_LOT_NUMBERING_TYP") : (String[])null);
		String[] h_LOT_CONTROL_FLG = ((params.containsKey("h_LOT_CONTROL_FLG")) ? (String[])params.get("h_LOT_CONTROL_FLG") : (String[])null);
		String[] h_FINAL_PROC_FLG = ((params.containsKey("h_FINAL_PROC_FLG")) ? (String[])params.get("h_FINAL_PROC_FLG") : (String[])null);
		String[] param1 = ((params.containsKey("param1")) ? (String[])params.get("param1") : (String[])null);
		String[] param2 = ((params.containsKey("param2")) ? (String[])params.get("param2") : (String[])null);
		String[] param3 = ((params.containsKey("param3")) ? (String[])params.get("param3") : (String[])null);
		String[] h_LINEUPDATE_FLG_1 = ((params.containsKey("h_LINEUPDATE_FLG_1")) ? (String[])params.get("h_LINEUPDATE_FLG_1") : (String[])null);
		String[] h_LINEUPDATE_FLG = ((params.containsKey("h_LINEUPDATE_FLG")) ? (String[])params.get("h_LINEUPDATE_FLG") : (String[])null);
		String[] ITEM_CD_LOT = ((params.containsKey("ITEM_CD_LOT")) ? (String[])params.get("ITEM_CD_LOT") : (String[])null);
		String[] JudgeFlg = ((params.containsKey("JudgeFlg")) ? (String[])params.get("JudgeFlg") : (String[])null);
		String[] h_LOTCTRL = ((params.containsKey("h_LOTCTRL")) ? (String[])params.get("h_LOTCTRL") : (String[])null);
		String[] h_WORK_ODR_CD = ((params.containsKey("h_WORK_ODR_CD")) ? (String[])params.get("h_WORK_ODR_CD") : (String[])null);
		String[] h_LOT_NO = ((params.containsKey("h_LOT_NO")) ? (String[])params.get("h_LOT_NO") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_DATE_FLG = ((params.containsKey("h_DATE_FLG")) ? (String[])params.get("h_DATE_FLG") : (String[])null);

		struct.setPUCH_ODR_CD( ((PUCH_ODR_CD == null) ? (String)null : PUCH_ODR_CD[0]) );
		struct.setList_PUCH_ODR_CD(TypeConverter.convert(PUCH_ODR_CD));
		struct.setl_ACPT_NO( ((l_ACPT_NO == null) ? (String)null : l_ACPT_NO[0]) );
		struct.setList_l_ACPT_NO(TypeConverter.convert(l_ACPT_NO));
		struct.setl_ACPT_QTY( ((l_ACPT_QTY == null) ? (String)null : l_ACPT_QTY[0]) );
		struct.setList_l_ACPT_QTY(TypeConverter.convert(l_ACPT_QTY));
		struct.setl_WH_CD( ((l_WH_CD == null) ? (String)null : l_WH_CD[0]) );
		struct.setList_l_WH_CD(TypeConverter.convert(l_WH_CD));
		struct.setl_WH_NAME( ((l_WH_NAME == null) ? (String)null : l_WH_NAME[0]) );
		struct.setList_l_WH_NAME(TypeConverter.convert(l_WH_NAME));
		struct.setl_DLV_CD( ((l_DLV_CD == null) ? (String)null : l_DLV_CD[0]) );
		struct.setList_l_DLV_CD(TypeConverter.convert(l_DLV_CD));
		struct.setl_UNIT_COST( ((l_UNIT_COST == null) ? (String)null : l_UNIT_COST[0]) );
		struct.setList_l_UNIT_COST(TypeConverter.convert(l_UNIT_COST));
		struct.setl_ACPT_STS_TYP_DN( ((l_ACPT_STS_TYP_DN == null) ? (String)null : l_ACPT_STS_TYP_DN[0]) );
		struct.setList_l_ACPT_STS_TYP_DN(TypeConverter.convert(l_ACPT_STS_TYP_DN));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.setSUM_ACPT_QTY( ((SUM_ACPT_QTY == null) ? (String)null : SUM_ACPT_QTY[0]) );
		struct.setList_SUM_ACPT_QTY(TypeConverter.convert(SUM_ACPT_QTY));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setACPT_INSPC_TYP_DN( ((ACPT_INSPC_TYP_DN == null) ? (String)null : ACPT_INSPC_TYP_DN[0]) );
		struct.setList_ACPT_INSPC_TYP_DN(TypeConverter.convert(ACPT_INSPC_TYP_DN));
		struct.setPUCH_ODR_DLV_DATE( ((PUCH_ODR_DLV_DATE == null) ? (String)null : PUCH_ODR_DLV_DATE[0]) );
		struct.setList_PUCH_ODR_DLV_DATE(TypeConverter.convert(PUCH_ODR_DLV_DATE));
		struct.setCONFIRM_DLV_DATE( ((CONFIRM_DLV_DATE == null) ? (String)null : CONFIRM_DLV_DATE[0]) );
		struct.setList_CONFIRM_DLV_DATE(TypeConverter.convert(CONFIRM_DLV_DATE));
		struct.setPUCH_ODR_SLIP_ISS_DATE( ((PUCH_ODR_SLIP_ISS_DATE == null) ? (String)null : PUCH_ODR_SLIP_ISS_DATE[0]) );
		struct.setList_PUCH_ODR_SLIP_ISS_DATE(TypeConverter.convert(PUCH_ODR_SLIP_ISS_DATE));
		struct.setPUCH_ODR_QTY( ((PUCH_ODR_QTY == null) ? (String)null : PUCH_ODR_QTY[0]) );
		struct.setList_PUCH_ODR_QTY(TypeConverter.convert(PUCH_ODR_QTY));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		struct.setPROC_NAME( ((PROC_NAME == null) ? (String)null : PROC_NAME[0]) );
		struct.setList_PROC_NAME(TypeConverter.convert(PROC_NAME));
		struct.setPUCH_ODR_PERSON( ((PUCH_ODR_PERSON == null) ? (String)null : PUCH_ODR_PERSON[0]) );
		struct.setList_PUCH_ODR_PERSON(TypeConverter.convert(PUCH_ODR_PERSON));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setSPL_ITEM_TYP_DN( ((SPL_ITEM_TYP_DN == null) ? (String)null : SPL_ITEM_TYP_DN[0]) );
		struct.setList_SPL_ITEM_TYP_DN(TypeConverter.convert(SPL_ITEM_TYP_DN));
		struct.setPRODUCT_TYP_DN( ((PRODUCT_TYP_DN == null) ? (String)null : PRODUCT_TYP_DN[0]) );
		struct.setList_PRODUCT_TYP_DN(TypeConverter.convert(PRODUCT_TYP_DN));
		struct.setPUCH_ODR_STS_TYP_DN( ((PUCH_ODR_STS_TYP_DN == null) ? (String)null : PUCH_ODR_STS_TYP_DN[0]) );
		struct.setList_PUCH_ODR_STS_TYP_DN(TypeConverter.convert(PUCH_ODR_STS_TYP_DN));
		struct.setNON_NO_ITEM_FLG_DN( ((NON_NO_ITEM_FLG_DN == null) ? (String)null : NON_NO_ITEM_FLG_DN[0]) );
		struct.setList_NON_NO_ITEM_FLG_DN(TypeConverter.convert(NON_NO_ITEM_FLG_DN));
		struct.setACPT_NO( ((ACPT_NO == null) ? (String)null : ACPT_NO[0]) );
		struct.setList_ACPT_NO(TypeConverter.convert(ACPT_NO));
		struct.setACPT_QTY( ((ACPT_QTY == null) ? (String)null : ACPT_QTY[0]) );
		struct.setList_ACPT_QTY(TypeConverter.convert(ACPT_QTY));
		struct.setc_COMPLETE( ((c_COMPLETE == null) ? (String)null : c_COMPLETE[0]) );
		struct.setList_c_COMPLETE(TypeConverter.convert(c_COMPLETE));
		struct.setBUSINESS_OPR_DATE( ((BUSINESS_OPR_DATE == null) ? (String)null : BUSINESS_OPR_DATE[0]) );
		struct.setList_BUSINESS_OPR_DATE(TypeConverter.convert(BUSINESS_OPR_DATE));
		struct.setACPT_DATE( ((ACPT_DATE == null) ? (String)null : ACPT_DATE[0]) );
		struct.setList_ACPT_DATE(TypeConverter.convert(ACPT_DATE));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setCUR_CD( ((CUR_CD == null) ? (String)null : CUR_CD[0]) );
		struct.setList_CUR_CD(TypeConverter.convert(CUR_CD));
		struct.setCUR_NAME( ((CUR_NAME == null) ? (String)null : CUR_NAME[0]) );
		struct.setList_CUR_NAME(TypeConverter.convert(CUR_NAME));
		struct.setUNIT_COST_TYP( ((UNIT_COST_TYP == null) ? (String)null : UNIT_COST_TYP[0]) );
		struct.setList_UNIT_COST_TYP(TypeConverter.convert(UNIT_COST_TYP));
		struct.setUNIT_COST_TYP_name( ((UNIT_COST_TYP_name == null) ? (String)null : UNIT_COST_TYP_name[0]) );
		struct.setList_UNIT_COST_TYP_name(TypeConverter.convert(UNIT_COST_TYP_name));
		struct.setUNIT_COST_TYP_val( ((UNIT_COST_TYP_val == null) ? (String)null : UNIT_COST_TYP_val[0]) );
		struct.setList_UNIT_COST_TYP_val(TypeConverter.convert(UNIT_COST_TYP_val));
		struct.setUNIT_COST( ((UNIT_COST == null) ? (String)null : UNIT_COST[0]) );
		struct.setList_UNIT_COST(TypeConverter.convert(UNIT_COST));
		struct.setVEND_CUR_UNIT( ((VEND_CUR_UNIT == null) ? (String)null : VEND_CUR_UNIT[0]) );
		struct.setList_VEND_CUR_UNIT(TypeConverter.convert(VEND_CUR_UNIT));
		struct.setPROCESSING_COST( ((PROCESSING_COST == null) ? (String)null : PROCESSING_COST[0]) );
		struct.setList_PROCESSING_COST(TypeConverter.convert(PROCESSING_COST));
		struct.setTAX_AMOUNT_1( ((TAX_AMOUNT_1 == null) ? (String)null : TAX_AMOUNT_1[0]) );
		struct.setList_TAX_AMOUNT_1(TypeConverter.convert(TAX_AMOUNT_1));
		struct.setTAX_RATE_1( ((TAX_RATE_1 == null) ? (String)null : TAX_RATE_1[0]) );
		struct.setList_TAX_RATE_1(TypeConverter.convert(TAX_RATE_1));
		struct.setMATERIAL_COST( ((MATERIAL_COST == null) ? (String)null : MATERIAL_COST[0]) );
		struct.setList_MATERIAL_COST(TypeConverter.convert(MATERIAL_COST));
		struct.setTAX_AMOUNT_2( ((TAX_AMOUNT_2 == null) ? (String)null : TAX_AMOUNT_2[0]) );
		struct.setList_TAX_AMOUNT_2(TypeConverter.convert(TAX_AMOUNT_2));
		struct.setTAX_RATE_2( ((TAX_RATE_2 == null) ? (String)null : TAX_RATE_2[0]) );
		struct.setList_TAX_RATE_2(TypeConverter.convert(TAX_RATE_2));
		struct.setOTHER_OVERHEADS( ((OTHER_OVERHEADS == null) ? (String)null : OTHER_OVERHEADS[0]) );
		struct.setList_OTHER_OVERHEADS(TypeConverter.convert(OTHER_OVERHEADS));
		struct.setTAX_AMOUNT_3( ((TAX_AMOUNT_3 == null) ? (String)null : TAX_AMOUNT_3[0]) );
		struct.setList_TAX_AMOUNT_3(TypeConverter.convert(TAX_AMOUNT_3));
		struct.setTAX_RATE_3( ((TAX_RATE_3 == null) ? (String)null : TAX_RATE_3[0]) );
		struct.setList_TAX_RATE_3(TypeConverter.convert(TAX_RATE_3));
		struct.setPUCH_ODR_AMOUNT( ((PUCH_ODR_AMOUNT == null) ? (String)null : PUCH_ODR_AMOUNT[0]) );
		struct.setList_PUCH_ODR_AMOUNT(TypeConverter.convert(PUCH_ODR_AMOUNT));
		struct.setAMOUNT_INCLUDE_TAX( ((AMOUNT_INCLUDE_TAX == null) ? (String)null : AMOUNT_INCLUDE_TAX[0]) );
		struct.setList_AMOUNT_INCLUDE_TAX(TypeConverter.convert(AMOUNT_INCLUDE_TAX));
		struct.setDISC_AMOUNT( ((DISC_AMOUNT == null) ? (String)null : DISC_AMOUNT[0]) );
		struct.setList_DISC_AMOUNT(TypeConverter.convert(DISC_AMOUNT));
		struct.setHOME_CUR_AMOUNT( ((HOME_CUR_AMOUNT == null) ? (String)null : HOME_CUR_AMOUNT[0]) );
		struct.setList_HOME_CUR_AMOUNT(TypeConverter.convert(HOME_CUR_AMOUNT));
		struct.setHOME_CUR_UNIT( ((HOME_CUR_UNIT == null) ? (String)null : HOME_CUR_UNIT[0]) );
		struct.setList_HOME_CUR_UNIT(TypeConverter.convert(HOME_CUR_UNIT));
		struct.setNET_AMOUNT( ((NET_AMOUNT == null) ? (String)null : NET_AMOUNT[0]) );
		struct.setList_NET_AMOUNT(TypeConverter.convert(NET_AMOUNT));
		struct.setEXCH_RATE( ((EXCH_RATE == null) ? (String)null : EXCH_RATE[0]) );
		struct.setList_EXCH_RATE(TypeConverter.convert(EXCH_RATE));
		struct.setDLV_CD( ((DLV_CD == null) ? (String)null : DLV_CD[0]) );
		struct.setList_DLV_CD(TypeConverter.convert(DLV_CD));
		struct.setACPT_RSLT_COMMENT( ((ACPT_RSLT_COMMENT == null) ? (String)null : ACPT_RSLT_COMMENT[0]) );
		struct.setList_ACPT_RSLT_COMMENT(TypeConverter.convert(ACPT_RSLT_COMMENT));
		struct.setINSPC_CMPLT_FLG_DN( ((INSPC_CMPLT_FLG_DN == null) ? (String)null : INSPC_CMPLT_FLG_DN[0]) );
		struct.setList_INSPC_CMPLT_FLG_DN(TypeConverter.convert(INSPC_CMPLT_FLG_DN));
		struct.setSelectUnitCostFlag( ((SelectUnitCostFlag == null) ? (String)null : SelectUnitCostFlag[0]) );
		struct.setList_SelectUnitCostFlag(TypeConverter.convert(SelectUnitCostFlag));
		struct.setPUCH_ODR_MODIFY_COUNT( ((PUCH_ODR_MODIFY_COUNT == null) ? (String)null : PUCH_ODR_MODIFY_COUNT[0]) );
		struct.setList_PUCH_ODR_MODIFY_COUNT(TypeConverter.convert(PUCH_ODR_MODIFY_COUNT));
		struct.setACPT_MODIFY_COUNT( ((ACPT_MODIFY_COUNT == null) ? (String)null : ACPT_MODIFY_COUNT[0]) );
		struct.setList_ACPT_MODIFY_COUNT(TypeConverter.convert(ACPT_MODIFY_COUNT));
		struct.setACPT_INSPC_TYP( ((ACPT_INSPC_TYP == null) ? (String)null : ACPT_INSPC_TYP[0]) );
		struct.setList_ACPT_INSPC_TYP(TypeConverter.convert(ACPT_INSPC_TYP));
		struct.setPUCH_ODR_STS_TYP( ((PUCH_ODR_STS_TYP == null) ? (String)null : PUCH_ODR_STS_TYP[0]) );
		struct.setList_PUCH_ODR_STS_TYP(TypeConverter.convert(PUCH_ODR_STS_TYP));
		struct.setINSPC_CMPLT_FLG( ((INSPC_CMPLT_FLG == null) ? (String)null : INSPC_CMPLT_FLG[0]) );
		struct.setList_INSPC_CMPLT_FLG(TypeConverter.convert(INSPC_CMPLT_FLG));
		struct.setSPL_ITEM_TYP( ((SPL_ITEM_TYP == null) ? (String)null : SPL_ITEM_TYP[0]) );
		struct.setList_SPL_ITEM_TYP(TypeConverter.convert(SPL_ITEM_TYP));
		struct.setPRODUCT_TYP( ((PRODUCT_TYP == null) ? (String)null : PRODUCT_TYP[0]) );
		struct.setList_PRODUCT_TYP(TypeConverter.convert(PRODUCT_TYP));
		struct.setNON_NO_ITEM_FLG( ((NON_NO_ITEM_FLG == null) ? (String)null : NON_NO_ITEM_FLG[0]) );
		struct.setList_NON_NO_ITEM_FLG(TypeConverter.convert(NON_NO_ITEM_FLG));
		struct.setUNIT_QTY_TYP_DN( ((UNIT_QTY_TYP_DN == null) ? (String)null : UNIT_QTY_TYP_DN[0]) );
		struct.setList_UNIT_QTY_TYP_DN(TypeConverter.convert(UNIT_QTY_TYP_DN));
		struct.setUNIT_QTY_TYP( ((UNIT_QTY_TYP == null) ? (String)null : UNIT_QTY_TYP[0]) );
		struct.setList_UNIT_QTY_TYP(TypeConverter.convert(UNIT_QTY_TYP));
		struct.setl_STOCK_UNIT( ((l_STOCK_UNIT == null) ? (String)null : l_STOCK_UNIT[0]) );
		struct.setList_l_STOCK_UNIT(TypeConverter.convert(l_STOCK_UNIT));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setSUPPLIED_ISSUE_QTY( ((SUPPLIED_ISSUE_QTY == null) ? (String)null : SUPPLIED_ISSUE_QTY[0]) );
		struct.setList_SUPPLIED_ISSUE_QTY(TypeConverter.convert(SUPPLIED_ISSUE_QTY));
		struct.setTOTAL_ISSUE_QTY( ((TOTAL_ISSUE_QTY == null) ? (String)null : TOTAL_ISSUE_QTY[0]) );
		struct.setList_TOTAL_ISSUE_QTY(TypeConverter.convert(TOTAL_ISSUE_QTY));
		struct.setSUPPLIED_DATE( ((SUPPLIED_DATE == null) ? (String)null : SUPPLIED_DATE[0]) );
		struct.setList_SUPPLIED_DATE(TypeConverter.convert(SUPPLIED_DATE));
		struct.setSTOCK_ON_HAND_QTY( ((STOCK_ON_HAND_QTY == null) ? (String)null : STOCK_ON_HAND_QTY[0]) );
		struct.setList_STOCK_ON_HAND_QTY(TypeConverter.convert(STOCK_ON_HAND_QTY));
		struct.setPART_SUPPLIED_COMMENT( ((PART_SUPPLIED_COMMENT == null) ? (String)null : PART_SUPPLIED_COMMENT[0]) );
		struct.setList_PART_SUPPLIED_COMMENT(TypeConverter.convert(PART_SUPPLIED_COMMENT));
		struct.setISSUE_INST_CD( ((ISSUE_INST_CD == null) ? (String)null : ISSUE_INST_CD[0]) );
		struct.setList_ISSUE_INST_CD(TypeConverter.convert(ISSUE_INST_CD));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setSUPPLIED_UNIT_NUMERATOR( ((SUPPLIED_UNIT_NUMERATOR == null) ? (String)null : SUPPLIED_UNIT_NUMERATOR[0]) );
		struct.setList_SUPPLIED_UNIT_NUMERATOR(TypeConverter.convert(SUPPLIED_UNIT_NUMERATOR));
		struct.setSUPPLIED_UNIT_DENOMINATOR( ((SUPPLIED_UNIT_DENOMINATOR == null) ? (String)null : SUPPLIED_UNIT_DENOMINATOR[0]) );
		struct.setList_SUPPLIED_UNIT_DENOMINATOR(TypeConverter.convert(SUPPLIED_UNIT_DENOMINATOR));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_SUPPLIED_GNR_TYP( ((l_SUPPLIED_GNR_TYP == null) ? (String)null : l_SUPPLIED_GNR_TYP[0]) );
		struct.setList_l_SUPPLIED_GNR_TYP(TypeConverter.convert(l_SUPPLIED_GNR_TYP));
		struct.setl_SUPPLIED_QTY( ((l_SUPPLIED_QTY == null) ? (String)null : l_SUPPLIED_QTY[0]) );
		struct.setList_l_SUPPLIED_QTY(TypeConverter.convert(l_SUPPLIED_QTY));
		struct.setl_TOTAL_ISSUE_QTY( ((l_TOTAL_ISSUE_QTY == null) ? (String)null : l_TOTAL_ISSUE_QTY[0]) );
		struct.setList_l_TOTAL_ISSUE_QTY(TypeConverter.convert(l_TOTAL_ISSUE_QTY));
		struct.setl_SUPPLIED_DATE( ((l_SUPPLIED_DATE == null) ? (String)null : l_SUPPLIED_DATE[0]) );
		struct.setList_l_SUPPLIED_DATE(TypeConverter.convert(l_SUPPLIED_DATE));
		struct.setl_HAND_QTY( ((l_HAND_QTY == null) ? (String)null : l_HAND_QTY[0]) );
		struct.setList_l_HAND_QTY(TypeConverter.convert(l_HAND_QTY));
		struct.setl_PART_SUPPLIED_COMMENT( ((l_PART_SUPPLIED_COMMENT == null) ? (String)null : l_PART_SUPPLIED_COMMENT[0]) );
		struct.setList_l_PART_SUPPLIED_COMMENT(TypeConverter.convert(l_PART_SUPPLIED_COMMENT));
		struct.setl_ISSUE_INST_CD( ((l_ISSUE_INST_CD == null) ? (String)null : l_ISSUE_INST_CD[0]) );
		struct.setList_l_ISSUE_INST_CD(TypeConverter.convert(l_ISSUE_INST_CD));
		struct.setl_MRP_ODR_TYP( ((l_MRP_ODR_TYP == null) ? (String)null : l_MRP_ODR_TYP[0]) );
		struct.setList_l_MRP_ODR_TYP(TypeConverter.convert(l_MRP_ODR_TYP));
		struct.setl_SUPPLIED_UNIT_DENOMINATOR( ((l_SUPPLIED_UNIT_DENOMINATOR == null) ? (String)null : l_SUPPLIED_UNIT_DENOMINATOR[0]) );
		struct.setList_l_SUPPLIED_UNIT_DENOMINATOR(TypeConverter.convert(l_SUPPLIED_UNIT_DENOMINATOR));
		struct.setl_SUPPLIED_UNIT_NUMERATOR( ((l_SUPPLIED_UNIT_NUMERATOR == null) ? (String)null : l_SUPPLIED_UNIT_NUMERATOR[0]) );
		struct.setList_l_SUPPLIED_UNIT_NUMERATOR(TypeConverter.convert(l_SUPPLIED_UNIT_NUMERATOR));
		struct.setl_STOCK_UNIT2( ((l_STOCK_UNIT2 == null) ? (String)null : l_STOCK_UNIT2[0]) );
		struct.setList_l_STOCK_UNIT2(TypeConverter.convert(l_STOCK_UNIT2));
		struct.setSTOCK_UNIT1( ((STOCK_UNIT1 == null) ? (String)null : STOCK_UNIT1[0]) );
		struct.setList_STOCK_UNIT1(TypeConverter.convert(STOCK_UNIT1));
		struct.setSTOCK_UNIT2( ((STOCK_UNIT2 == null) ? (String)null : STOCK_UNIT2[0]) );
		struct.setList_STOCK_UNIT2(TypeConverter.convert(STOCK_UNIT2));
		struct.setSTOCK_UNIT3( ((STOCK_UNIT3 == null) ? (String)null : STOCK_UNIT3[0]) );
		struct.setList_STOCK_UNIT3(TypeConverter.convert(STOCK_UNIT3));
		struct.setSTOCK_UNIT4( ((STOCK_UNIT4 == null) ? (String)null : STOCK_UNIT4[0]) );
		struct.setList_STOCK_UNIT4(TypeConverter.convert(STOCK_UNIT4));
		struct.setSTOCK_UNIT5( ((STOCK_UNIT5 == null) ? (String)null : STOCK_UNIT5[0]) );
		struct.setList_STOCK_UNIT5(TypeConverter.convert(STOCK_UNIT5));
		struct.setl_SUPPLIED_RE_QTY( ((l_SUPPLIED_RE_QTY == null) ? (String)null : l_SUPPLIED_RE_QTY[0]) );
		struct.setList_l_SUPPLIED_RE_QTY(TypeConverter.convert(l_SUPPLIED_RE_QTY));
		struct.seth_ACPT_QTY( ((h_ACPT_QTY == null) ? (String)null : h_ACPT_QTY[0]) );
		struct.setList_h_ACPT_QTY(TypeConverter.convert(h_ACPT_QTY));
		struct.seth_ACPT_DATE( ((h_ACPT_DATE == null) ? (String)null : h_ACPT_DATE[0]) );
		struct.setList_h_ACPT_DATE(TypeConverter.convert(h_ACPT_DATE));
		struct.seth_TOTAL_ISSUE_QTY( ((h_TOTAL_ISSUE_QTY == null) ? (String)null : h_TOTAL_ISSUE_QTY[0]) );
		struct.setList_h_TOTAL_ISSUE_QTY(TypeConverter.convert(h_TOTAL_ISSUE_QTY));
		struct.seth_SUPPLIED_DATE( ((h_SUPPLIED_DATE == null) ? (String)null : h_SUPPLIED_DATE[0]) );
		struct.setList_h_SUPPLIED_DATE(TypeConverter.convert(h_SUPPLIED_DATE));
		struct.seth_PART_SUPPLIED_COMMENT( ((h_PART_SUPPLIED_COMMENT == null) ? (String)null : h_PART_SUPPLIED_COMMENT[0]) );
		struct.setList_h_PART_SUPPLIED_COMMENT(TypeConverter.convert(h_PART_SUPPLIED_COMMENT));
		struct.seth_PUCH_ODR_CD( ((h_PUCH_ODR_CD == null) ? (String)null : h_PUCH_ODR_CD[0]) );
		struct.setList_h_PUCH_ODR_CD(TypeConverter.convert(h_PUCH_ODR_CD));
		struct.setl_UNIT_QTY_TYP( ((l_UNIT_QTY_TYP == null) ? (String)null : l_UNIT_QTY_TYP[0]) );
		struct.setList_l_UNIT_QTY_TYP(TypeConverter.convert(l_UNIT_QTY_TYP));
		struct.setUNIT_QTY_TYP2( ((UNIT_QTY_TYP2 == null) ? (String)null : UNIT_QTY_TYP2[0]) );
		struct.setList_UNIT_QTY_TYP2(TypeConverter.convert(UNIT_QTY_TYP2));
		struct.seth_ODR_CANCEL_SLIP_ISS_FLG( ((h_ODR_CANCEL_SLIP_ISS_FLG == null) ? (String)null : h_ODR_CANCEL_SLIP_ISS_FLG[0]) );
		struct.setList_h_ODR_CANCEL_SLIP_ISS_FLG(TypeConverter.convert(h_ODR_CANCEL_SLIP_ISS_FLG));
		struct.setc_CANCEL( ((c_CANCEL == null) ? (String)null : c_CANCEL[0]) );
		struct.setList_c_CANCEL(TypeConverter.convert(c_CANCEL));
		struct.setODR_CANCEL_CAUSE_CD( ((ODR_CANCEL_CAUSE_CD == null) ? (String)null : ODR_CANCEL_CAUSE_CD[0]) );
		struct.setList_ODR_CANCEL_CAUSE_CD(TypeConverter.convert(ODR_CANCEL_CAUSE_CD));
		struct.seth_ACPT_RSLT_COUNT( ((h_ACPT_RSLT_COUNT == null) ? (String)null : h_ACPT_RSLT_COUNT[0]) );
		struct.setList_h_ACPT_RSLT_COUNT(TypeConverter.convert(h_ACPT_RSLT_COUNT));
		struct.setTHIS_MONTH( ((THIS_MONTH == null) ? (String)null : THIS_MONTH[0]) );
		struct.setList_THIS_MONTH(TypeConverter.convert(THIS_MONTH));
		struct.setINSTALL_FLG( ((INSTALL_FLG == null) ? (String)null : INSTALL_FLG[0]) );
		struct.setList_INSTALL_FLG(TypeConverter.convert(INSTALL_FLG));
		struct.setPUCH_ODR_COMMENT( ((PUCH_ODR_COMMENT == null) ? (String)null : PUCH_ODR_COMMENT[0]) );
		struct.setList_PUCH_ODR_COMMENT(TypeConverter.convert(PUCH_ODR_COMMENT));
		struct.setINSPC_WH_CD( ((INSPC_WH_CD == null) ? (String)null : INSPC_WH_CD[0]) );
		struct.setList_INSPC_WH_CD(TypeConverter.convert(INSPC_WH_CD));
		struct.setINSPC_WH_NAME( ((INSPC_WH_NAME == null) ? (String)null : INSPC_WH_NAME[0]) );
		struct.setList_INSPC_WH_NAME(TypeConverter.convert(INSPC_WH_NAME));
		struct.setITEM_CD_DW( ((ITEM_CD_DW == null) ? (String)null : ITEM_CD_DW[0]) );
		struct.setList_ITEM_CD_DW(TypeConverter.convert(ITEM_CD_DW));
		struct.setITEM_NAME_DW( ((ITEM_NAME_DW == null) ? (String)null : ITEM_NAME_DW[0]) );
		struct.setList_ITEM_NAME_DW(TypeConverter.convert(ITEM_NAME_DW));
		struct.setl_LOT_NO( ((l_LOT_NO == null) ? (String)null : l_LOT_NO[0]) );
		struct.setList_l_LOT_NO(TypeConverter.convert(l_LOT_NO));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.seth_LOT_NUMBERING_TYP( ((h_LOT_NUMBERING_TYP == null) ? (String)null : h_LOT_NUMBERING_TYP[0]) );
		struct.setList_h_LOT_NUMBERING_TYP(TypeConverter.convert(h_LOT_NUMBERING_TYP));
		struct.seth_LOT_CONTROL_FLG( ((h_LOT_CONTROL_FLG == null) ? (String)null : h_LOT_CONTROL_FLG[0]) );
		struct.setList_h_LOT_CONTROL_FLG(TypeConverter.convert(h_LOT_CONTROL_FLG));
		struct.seth_FINAL_PROC_FLG( ((h_FINAL_PROC_FLG == null) ? (String)null : h_FINAL_PROC_FLG[0]) );
		struct.setList_h_FINAL_PROC_FLG(TypeConverter.convert(h_FINAL_PROC_FLG));
		struct.setparam1( ((param1 == null) ? (String)null : param1[0]) );
		struct.setList_param1(TypeConverter.convert(param1));
		struct.setparam2( ((param2 == null) ? (String)null : param2[0]) );
		struct.setList_param2(TypeConverter.convert(param2));
		struct.setparam3( ((param3 == null) ? (String)null : param3[0]) );
		struct.setList_param3(TypeConverter.convert(param3));
		struct.seth_LINEUPDATE_FLG_1( ((h_LINEUPDATE_FLG_1 == null) ? (String)null : h_LINEUPDATE_FLG_1[0]) );
		struct.setList_h_LINEUPDATE_FLG_1(TypeConverter.convert(h_LINEUPDATE_FLG_1));
		struct.seth_LINEUPDATE_FLG( ((h_LINEUPDATE_FLG == null) ? (String)null : h_LINEUPDATE_FLG[0]) );
		struct.setList_h_LINEUPDATE_FLG(TypeConverter.convert(h_LINEUPDATE_FLG));
		struct.setITEM_CD_LOT( ((ITEM_CD_LOT == null) ? (String)null : ITEM_CD_LOT[0]) );
		struct.setList_ITEM_CD_LOT(TypeConverter.convert(ITEM_CD_LOT));
		struct.setJudgeFlg( ((JudgeFlg == null) ? (String)null : JudgeFlg[0]) );
		struct.setList_JudgeFlg(TypeConverter.convert(JudgeFlg));
		struct.seth_LOTCTRL( ((h_LOTCTRL == null) ? (String)null : h_LOTCTRL[0]) );
		struct.setList_h_LOTCTRL(TypeConverter.convert(h_LOTCTRL));
		struct.seth_WORK_ODR_CD( ((h_WORK_ODR_CD == null) ? (String)null : h_WORK_ODR_CD[0]) );
		struct.setList_h_WORK_ODR_CD(TypeConverter.convert(h_WORK_ODR_CD));
		struct.seth_LOT_NO( ((h_LOT_NO == null) ? (String)null : h_LOT_NO[0]) );
		struct.setList_h_LOT_NO(TypeConverter.convert(h_LOT_NO));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_DATE_FLG( ((h_DATE_FLG == null) ? (String)null : h_DATE_FLG[0]) );
		struct.setList_h_DATE_FLG(TypeConverter.convert(h_DATE_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AE0060020.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAE0060020Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAE0060020Struct";   // JSP先のバインド名(Struct)の指定
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
					AE0060020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AE0060020Control control;
		AE0060020Entity  entity = null;
		AE0060020Struct  struct = null;

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

			if( (control = (AE0060020Control)so.getAttribute("AE0060020Control_"+request.getSession(false).getId())) == null ) {
				control = new AE0060020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AE0060020Control();
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
				} else if( isClick(request, "LineInsert") ) {
					if ( !isCryptical(request, so, params, "LineInsert") ) return ERROR_TARGET;
					target = onClickLineInsert(request, response, so, params, control);
					control.setButton("LineInsert");
				} else if( isClick(request, "LineUpdate") ) {
					if ( !isCryptical(request, so, params, "LineUpdate") ) return ERROR_TARGET;
					target = onClickLineUpdate(request, response, so, params, control);
					control.setButton("LineUpdate");
				} else if( isClick(request, "CancelComplete") ) {
					if ( !isCryptical(request, so, params, "CancelComplete") ) return ERROR_TARGET;
					target = onClickCancelComplete(request, response, so, params, control);
					control.setButton("CancelComplete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
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
				} else if( isClick(request, "Return") ) {
					if ( !isCryptical(request, so, params, "Return") ) return ERROR_TARGET;
					target = onClickReturn(request, response, so, params, control);
					control.setButton("Return");
				} else if( isClick(request, "Insert2") ) {
					if ( !isCryptical(request, so, params, "Insert2") ) return ERROR_TARGET;
					target = onClickInsert2(request, response, so, params, control);
					control.setButton("Insert2");
				} else if( isClick(request, "Update2") ) {
					if ( !isCryptical(request, so, params, "Update2") ) return ERROR_TARGET;
					target = onClickUpdate2(request, response, so, params, control);
					control.setButton("Update2");
				} else if( isClick(request, "Return2") ) {
					if ( !isCryptical(request, so, params, "Return2") ) return ERROR_TARGET;
					target = onClickReturn2(request, response, so, params, control);
					control.setButton("Return2");
				} else if( isClick(request, "NoUserParts") ) {
					if ( !isCryptical(request, so, params, "NoUserParts") ) return ERROR_TARGET;
					target = onClickNoUserParts(request, response, so, params, control);
					control.setButton("NoUserParts");
				} else if( isClick(request, "UseParts") ) {
					if ( !isCryptical(request, so, params, "UseParts") ) return ERROR_TARGET;
					target = onClickUseParts(request, response, so, params, control);
					control.setButton("UseParts");
				} else if( isClick(request, "ClickShow") ) {
					if ( !isCryptical(request, so, params, "ClickShow") ) return ERROR_TARGET;
					target = onClickClickShow(request, response, so, params, control);
					control.setButton("ClickShow");
				} else if( isClick(request, "CancelOdrCancel") ) {
					if ( !isCryptical(request, so, params, "CancelOdrCancel") ) return ERROR_TARGET;
					target = onClickCancelOdrCancel(request, response, so, params, control);
					control.setButton("CancelOdrCancel");
				} else if( isClick(request, "Detail") ) {
					if ( !isCryptical(request, so, params, "Detail") ) return ERROR_TARGET;
					target = onClickDetail(request, response, so, params, control);
					control.setButton("Detail");
				} else if( isClick(request, "LotInsert") ) {
					if ( !isCryptical(request, so, params, "LotInsert") ) return ERROR_TARGET;
					target = onClickLotInsert(request, response, so, params, control);
					control.setButton("LotInsert");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AE0060020Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "LineInsert") && bFLG_DISCONNECT_LineInsert)
				|| (isClick(request, "LineUpdate") && bFLG_DISCONNECT_LineUpdate)
				|| (isClick(request, "CancelComplete") && bFLG_DISCONNECT_CancelComplete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "SelectUnitCost") && bFLG_DISCONNECT_SelectUnitCost)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Return") && bFLG_DISCONNECT_Return)
				|| (isClick(request, "Insert2") && bFLG_DISCONNECT_Insert2)
				|| (isClick(request, "Update2") && bFLG_DISCONNECT_Update2)
				|| (isClick(request, "Return2") && bFLG_DISCONNECT_Return2)
				|| (isClick(request, "NoUserParts") && bFLG_DISCONNECT_NoUserParts)
				|| (isClick(request, "UseParts") && bFLG_DISCONNECT_UseParts)
				|| (isClick(request, "ClickShow") && bFLG_DISCONNECT_ClickShow)
				|| (isClick(request, "CancelOdrCancel") && bFLG_DISCONNECT_CancelOdrCancel)
				|| (isClick(request, "Detail") && bFLG_DISCONNECT_Detail)
				|| (isClick(request, "LotInsert") && bFLG_DISCONNECT_LotInsert)
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
	private  static boolean bFLG_DISCONNECT_LineInsert = true;
	private  static boolean bFLG_DISCONNECT_LineUpdate = true;
	private  static boolean bFLG_DISCONNECT_CancelComplete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_SelectUnitCost = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Return = true;
	private  static boolean bFLG_DISCONNECT_Insert2 = true;
	private  static boolean bFLG_DISCONNECT_Update2 = true;
	private  static boolean bFLG_DISCONNECT_Return2 = true;
	private  static boolean bFLG_DISCONNECT_NoUserParts = true;
	private  static boolean bFLG_DISCONNECT_UseParts = true;
	private  static boolean bFLG_DISCONNECT_ClickShow = true;
	private  static boolean bFLG_DISCONNECT_CancelOdrCancel = true;
	private  static boolean bFLG_DISCONNECT_Detail = true;
	private  static boolean bFLG_DISCONNECT_LotInsert = true;

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
		return "com.nec.jp.orteus.metamorBase.AE0060.AE0060020Servlet";
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
	public AE0060020Servlet()
	{
		//{{user_implement_dev:<AE0060020_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_LineInsert = true;
		bFLG_DISCONNECT_LineUpdate = true;
		bFLG_DISCONNECT_CancelComplete = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_SelectUnitCost = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;
		bFLG_DISCONNECT_Return = true;

                //}}user_implement_dev:<AE0060020_DisConnect_FLG>

		//{{user_implement_dev:<AE0060020Servlet>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AE0060020Servlet>
	}

	//////////////////////////////

}
