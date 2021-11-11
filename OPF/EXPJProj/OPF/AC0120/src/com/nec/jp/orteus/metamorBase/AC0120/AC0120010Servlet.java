/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/src/com/nec/jp/orteus/metamorBase/AC0120/AC0120010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0120;

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

public class AC0120010Servlet extends HttpServlet
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
	 * @param control AC0120010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AC0120010Control control)
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
	 * @param control AC0120010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AC0120010Control control)
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
	 * @param control AC0120010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
			logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			objMessage.m_writer.write( Level.ALL, "AC0120010"+" $Revision: 1.18 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AC0120010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0120010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Select");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * FlashTree初期化ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickFlashTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");
		//{{user_implement_dev:<onClickFlashTree>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("FlashTree");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickFlashTree>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");

		return nextUrl;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickappend(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120011.jsp";		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");
		//{{user_implement_dev:<onClickappend>
			// TODO: ユーザ定義のコードを記述してください
		try {
          control.setNextUrl(nextUrl);
			control.control_eventHandller("append");
          nextUrl = control.getNextUrl();
            // 子画面に遷移
           // nextUrl = "/AC0120011.jsp";

		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickappend>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120011.jsp";		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
			// TODO: ユーザ定義のコードを記述してください
		try {
          control.setNextUrl(nextUrl);
			control.control_eventHandller("modify");
          nextUrl = control.getNextUrl();
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Clear");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * PeekerItemCdボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickPeekerItemCd(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickPeekerItemCd");
		//{{user_implement_dev:<onClickPeekerItemCd>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("PeekerItemCd");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickPeekerItemCd>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickPeekerItemCd");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.setNextUrl(nextUrl);
          
			control.control_eventHandller("insert");
			nextUrl = control.getNextUrl();

        } catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
          control.setNextUrl(nextUrl);
          control.control_eventHandller("update");
          nextUrl = control.getNextUrl();

		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickcancelSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120010.jsp";		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");
		//{{user_implement_dev:<onClickcancelSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("cancelSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcancelSub1>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");

		return nextUrl;
	}

	/**
	 * 詳細表示ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickShowDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120010Detail.jsp";		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");
		//{{user_implement_dev:<onClickShowDetail>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ShowDetail");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickShowDetail>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");

		return nextUrl;
	}

	/**
	 * ツリー追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickAddTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120010Control.jsp";		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");
		//{{user_implement_dev:<onClickAddTree>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("AddTree");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAddTree>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickselectSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120011.jsp";		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickselectSub1");
		//{{user_implement_dev:<onClickselectSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("selectSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickselectSub1>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickselectSub1");

		return nextUrl;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0120010Controlクラスインスタンス
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
		//{{user_implement_dev:<onClickCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CsvOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvOut>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AC0120010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] JOB_ODR_CANCEL_NO = ((params.containsKey("JOB_ODR_CANCEL_NO")) ? (String[])params.get("JOB_ODR_CANCEL_NO") : (String[])null);
		String[] InitLevel = ((params.containsKey("InitLevel")) ? (String[])params.get("InitLevel") : (String[])null);
		String[] id = ((params.containsKey("id")) ? (String[])params.get("id") : (String[])null);
		String[] lvl = ((params.containsKey("lvl")) ? (String[])params.get("lvl") : (String[])null);
		String[] parent = ((params.containsKey("parent")) ? (String[])params.get("parent") : (String[])null);
		String[] label = ((params.containsKey("label")) ? (String[])params.get("label") : (String[])null);
		String[] ctx = ((params.containsKey("ctx")) ? (String[])params.get("ctx") : (String[])null);
		String[] maxid = ((params.containsKey("maxid")) ? (String[])params.get("maxid") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] OD_NO = ((params.containsKey("OD_NO")) ? (String[])params.get("OD_NO") : (String[])null);
		String[] MRP_TYP = ((params.containsKey("MRP_TYP")) ? (String[])params.get("MRP_TYP") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] ODR_STS_TYP = ((params.containsKey("ODR_STS_TYP")) ? (String[])params.get("ODR_STS_TYP") : (String[])null);
		String[] DM_STS_TYP = ((params.containsKey("DM_STS_TYP")) ? (String[])params.get("DM_STS_TYP") : (String[])null);
		String[] OD_TYP = ((params.containsKey("OD_TYP")) ? (String[])params.get("OD_TYP") : (String[])null);
		String[] JOB_ODR_STS_TYP = ((params.containsKey("JOB_ODR_STS_TYP")) ? (String[])params.get("JOB_ODR_STS_TYP") : (String[])null);
		String[] PARENT_OD_NO = ((params.containsKey("PARENT_OD_NO")) ? (String[])params.get("PARENT_OD_NO") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] OUTSIDE_TYP_DN = ((params.containsKey("OUTSIDE_TYP_DN")) ? (String[])params.get("OUTSIDE_TYP_DN") : (String[])null);
		String[] ITEM_SPOIL = ((params.containsKey("ITEM_SPOIL")) ? (String[])params.get("ITEM_SPOIL") : (String[])null);
		String[] UNIT_QTY_TYP_DN = ((params.containsKey("UNIT_QTY_TYP_DN")) ? (String[])params.get("UNIT_QTY_TYP_DN") : (String[])null);
		String[] DUE_DATE = ((params.containsKey("DUE_DATE")) ? (String[])params.get("DUE_DATE") : (String[])null);
		String[] PRD_DUE_DATE = ((params.containsKey("PRD_DUE_DATE")) ? (String[])params.get("PRD_DUE_DATE") : (String[])null);
		String[] PRD_START_DATE = ((params.containsKey("PRD_START_DATE")) ? (String[])params.get("PRD_START_DATE") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] DM_QTY = ((params.containsKey("DM_QTY")) ? (String[])params.get("DM_QTY") : (String[])null);
		String[] ODR_QTY = ((params.containsKey("ODR_QTY")) ? (String[])params.get("ODR_QTY") : (String[])null);
		String[] SUM_ALCD_QTY = ((params.containsKey("SUM_ALCD_QTY")) ? (String[])params.get("SUM_ALCD_QTY") : (String[])null);
		String[] ODR_STS_TYP_DN = ((params.containsKey("ODR_STS_TYP_DN")) ? (String[])params.get("ODR_STS_TYP_DN") : (String[])null);
		String[] DM_STS_TYP_DN = ((params.containsKey("DM_STS_TYP_DN")) ? (String[])params.get("DM_STS_TYP_DN") : (String[])null);
		String[] OD_TYP_DN = ((params.containsKey("OD_TYP_DN")) ? (String[])params.get("OD_TYP_DN") : (String[])null);
		String[] Sub1_Parent_ITEM_CD = ((params.containsKey("Sub1_Parent_ITEM_CD")) ? (String[])params.get("Sub1_Parent_ITEM_CD") : (String[])null);
		String[] Sub1_Parent_ITEM_NAME = ((params.containsKey("Sub1_Parent_ITEM_NAME")) ? (String[])params.get("Sub1_Parent_ITEM_NAME") : (String[])null);
		String[] Sub1_Comp_ITEM_CD = ((params.containsKey("Sub1_Comp_ITEM_CD")) ? (String[])params.get("Sub1_Comp_ITEM_CD") : (String[])null);
		String[] Sub1_Comp_ITEM_NAME = ((params.containsKey("Sub1_Comp_ITEM_NAME")) ? (String[])params.get("Sub1_Comp_ITEM_NAME") : (String[])null);
		String[] Sub1_DRAW_CD = ((params.containsKey("Sub1_DRAW_CD")) ? (String[])params.get("Sub1_DRAW_CD") : (String[])null);
		String[] Sub1_SPEC = ((params.containsKey("Sub1_SPEC")) ? (String[])params.get("Sub1_SPEC") : (String[])null);
		String[] Sub1_PS_UNIT_DENOMINATOR = ((params.containsKey("Sub1_PS_UNIT_DENOMINATOR")) ? (String[])params.get("Sub1_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] Sub1_PS_UNIT_NUMERATOR = ((params.containsKey("Sub1_PS_UNIT_NUMERATOR")) ? (String[])params.get("Sub1_PS_UNIT_NUMERATOR") : (String[])null);
		String[] Sub1_DM_QTY = ((params.containsKey("Sub1_DM_QTY")) ? (String[])params.get("Sub1_DM_QTY") : (String[])null);
		String[] Sub1_ODR_QTY = ((params.containsKey("Sub1_ODR_QTY")) ? (String[])params.get("Sub1_ODR_QTY") : (String[])null);
		String[] Sub1_DUE_DATE = ((params.containsKey("Sub1_DUE_DATE")) ? (String[])params.get("Sub1_DUE_DATE") : (String[])null);
		String[] Sub1_PRD_DUE_DATE = ((params.containsKey("Sub1_PRD_DUE_DATE")) ? (String[])params.get("Sub1_PRD_DUE_DATE") : (String[])null);
		String[] Sub1_PRD_START_DATE = ((params.containsKey("Sub1_PRD_START_DATE")) ? (String[])params.get("Sub1_PRD_START_DATE") : (String[])null);
		String[] Sub1_ODR_START_DATE = ((params.containsKey("Sub1_ODR_START_DATE")) ? (String[])params.get("Sub1_ODR_START_DATE") : (String[])null);
		String[] Sub1_OUTSIDE_TYP = ((params.containsKey("Sub1_OUTSIDE_TYP")) ? (String[])params.get("Sub1_OUTSIDE_TYP") : (String[])null);
		String[] Sub1_OUTSIDE_TYP_name = ((params.containsKey("Sub1_OUTSIDE_TYP_name")) ? (String[])params.get("Sub1_OUTSIDE_TYP_name") : (String[])null);
		String[] Sub1_OUTSIDE_TYP_val = ((params.containsKey("Sub1_OUTSIDE_TYP_val")) ? (String[])params.get("Sub1_OUTSIDE_TYP_val") : (String[])null);
		String[] Sub1_ITEM_SPOIL = ((params.containsKey("Sub1_ITEM_SPOIL")) ? (String[])params.get("Sub1_ITEM_SPOIL") : (String[])null);
		String[] Sub1_PS_SPOIL = ((params.containsKey("Sub1_PS_SPOIL")) ? (String[])params.get("Sub1_PS_SPOIL") : (String[])null);
		String[] h_Sub1_PS_UNIT_QTY = ((params.containsKey("h_Sub1_PS_UNIT_QTY")) ? (String[])params.get("h_Sub1_PS_UNIT_QTY") : (String[])null);
		String[] Sub1_MRP_ODR_TYP_DN = ((params.containsKey("Sub1_MRP_ODR_TYP_DN")) ? (String[])params.get("Sub1_MRP_ODR_TYP_DN") : (String[])null);
		String[] Sub1_UNIT_QTY_TYP_DN = ((params.containsKey("Sub1_UNIT_QTY_TYP_DN")) ? (String[])params.get("Sub1_UNIT_QTY_TYP_DN") : (String[])null);
		String[] Sub1_STOCK_UNIT = ((params.containsKey("Sub1_STOCK_UNIT")) ? (String[])params.get("Sub1_STOCK_UNIT") : (String[])null);
		String[] h_Sub1_Parent_ODR_QTY = ((params.containsKey("h_Sub1_Parent_ODR_QTY")) ? (String[])params.get("h_Sub1_Parent_ODR_QTY") : (String[])null);
		String[] h_Sub1_MRP_ODR_TYP = ((params.containsKey("h_Sub1_MRP_ODR_TYP")) ? (String[])params.get("h_Sub1_MRP_ODR_TYP") : (String[])null);
		String[] h_Sub1_UNIT_QTY_TYP = ((params.containsKey("h_Sub1_UNIT_QTY_TYP")) ? (String[])params.get("h_Sub1_UNIT_QTY_TYP") : (String[])null);
		String[] h_Sub1_Parent_ODR_START_DATE = ((params.containsKey("h_Sub1_Parent_ODR_START_DATE")) ? (String[])params.get("h_Sub1_Parent_ODR_START_DATE") : (String[])null);
		String[] h_Parent_OD_MODIFY_COUNT = ((params.containsKey("h_Parent_OD_MODIFY_COUNT")) ? (String[])params.get("h_Parent_OD_MODIFY_COUNT") : (String[])null);
		String[] h_Comp_ITEM_MODIFY_COUNT = ((params.containsKey("h_Comp_ITEM_MODIFY_COUNT")) ? (String[])params.get("h_Comp_ITEM_MODIFY_COUNT") : (String[])null);
		String[] h_Sub1_Parent_OD_LEVEL_NO = ((params.containsKey("h_Sub1_Parent_OD_LEVEL_NO")) ? (String[])params.get("h_Sub1_Parent_OD_LEVEL_NO") : (String[])null);
		String[] h_Sub1_ISSUE_TYP = ((params.containsKey("h_Sub1_ISSUE_TYP")) ? (String[])params.get("h_Sub1_ISSUE_TYP") : (String[])null);
		String[] h_Sub1_Parent_ALC_GRP_CD = ((params.containsKey("h_Sub1_Parent_ALC_GRP_CD")) ? (String[])params.get("h_Sub1_Parent_ALC_GRP_CD") : (String[])null);
		String[] AC0120010tree1 = ((params.containsKey("AC0120010tree1")) ? (String[])params.get("AC0120010tree1") : (String[])null);
		String[] c_JOB_ODR_DEL = ((params.containsKey("c_JOB_ODR_DEL")) ? (String[])params.get("c_JOB_ODR_DEL") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_Sub1_OD_MODIFY_COUNT = ((params.containsKey("h_Sub1_OD_MODIFY_COUNT")) ? (String[])params.get("h_Sub1_OD_MODIFY_COUNT") : (String[])null);
		String[] OD_GNR_TYP_DN = ((params.containsKey("OD_GNR_TYP_DN")) ? (String[])params.get("OD_GNR_TYP_DN") : (String[])null);
		String[] Detail_ITEM_NAME = ((params.containsKey("Detail_ITEM_NAME")) ? (String[])params.get("Detail_ITEM_NAME") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] Sub1_DUE_TIME = ((params.containsKey("Sub1_DUE_TIME")) ? (String[])params.get("Sub1_DUE_TIME") : (String[])null);
		String[] Sub1_DUE_TIME2 = ((params.containsKey("Sub1_DUE_TIME2")) ? (String[])params.get("Sub1_DUE_TIME2") : (String[])null);
		String[] Sub1_DUE_TIME3 = ((params.containsKey("Sub1_DUE_TIME3")) ? (String[])params.get("Sub1_DUE_TIME3") : (String[])null);
		String[] Sub1_PRD_DUE_TIME = ((params.containsKey("Sub1_PRD_DUE_TIME")) ? (String[])params.get("Sub1_PRD_DUE_TIME") : (String[])null);
		String[] Sub1_PRD_START_TIME = ((params.containsKey("Sub1_PRD_START_TIME")) ? (String[])params.get("Sub1_PRD_START_TIME") : (String[])null);
		String[] Sub1_ODR_START_TIME = ((params.containsKey("Sub1_ODR_START_TIME")) ? (String[])params.get("Sub1_ODR_START_TIME") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] MANHOUR_TYP = ((params.containsKey("MANHOUR_TYP")) ? (String[])params.get("MANHOUR_TYP") : (String[])null);
		String[] MANHOUR_TYP_DN = ((params.containsKey("MANHOUR_TYP_DN")) ? (String[])params.get("MANHOUR_TYP_DN") : (String[])null);
		String[] h_Sub1_MANHOUR_TYP = ((params.containsKey("h_Sub1_MANHOUR_TYP")) ? (String[])params.get("h_Sub1_MANHOUR_TYP") : (String[])null);
		String[] OPR_RSLT_TYP_DN = ((params.containsKey("OPR_RSLT_TYP_DN")) ? (String[])params.get("OPR_RSLT_TYP_DN") : (String[])null);
		String[] TOTAL_RCV_QTY = ((params.containsKey("TOTAL_RCV_QTY")) ? (String[])params.get("TOTAL_RCV_QTY") : (String[])null);
		String[] TOTAL_ISSUE_QTY = ((params.containsKey("TOTAL_ISSUE_QTY")) ? (String[])params.get("TOTAL_ISSUE_QTY") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] OPR_RSLT_TYP = ((params.containsKey("OPR_RSLT_TYP")) ? (String[])params.get("OPR_RSLT_TYP") : (String[])null);
		String[] JOB_ODR_STS_TYP1 = ((params.containsKey("JOB_ODR_STS_TYP1")) ? (String[])params.get("JOB_ODR_STS_TYP1") : (String[])null);
		String[] CHIID_OD_NO = ((params.containsKey("CHIID_OD_NO")) ? (String[])params.get("CHIID_OD_NO") : (String[])null);
		String[] h_DM_STS_TYP = ((params.containsKey("h_DM_STS_TYP")) ? (String[])params.get("h_DM_STS_TYP") : (String[])null);
		String[] h_ODR_STS_TYP = ((params.containsKey("h_ODR_STS_TYP")) ? (String[])params.get("h_ODR_STS_TYP") : (String[])null);
		String[] h_size = ((params.containsKey("h_size")) ? (String[])params.get("h_size") : (String[])null);

		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setJOB_ODR_CANCEL_NO( ((JOB_ODR_CANCEL_NO == null) ? (String)null : JOB_ODR_CANCEL_NO[0]) );
		struct.setList_JOB_ODR_CANCEL_NO(TypeConverter.convert(JOB_ODR_CANCEL_NO));
		struct.setInitLevel( ((InitLevel == null) ? (String)null : InitLevel[0]) );
		struct.setList_InitLevel(TypeConverter.convert(InitLevel));
		struct.setid( ((id == null) ? (String)null : id[0]) );
		struct.setList_id(TypeConverter.convert(id));
		struct.setlvl( ((lvl == null) ? (String)null : lvl[0]) );
		struct.setList_lvl(TypeConverter.convert(lvl));
		struct.setparent( ((parent == null) ? (String)null : parent[0]) );
		struct.setList_parent(TypeConverter.convert(parent));
		struct.setlabel( ((label == null) ? (String)null : label[0]) );
		struct.setList_label(TypeConverter.convert(label));
		struct.setctx( ((ctx == null) ? (String)null : ctx[0]) );
		struct.setList_ctx(TypeConverter.convert(ctx));
		struct.setmaxid( ((maxid == null) ? (String)null : maxid[0]) );
		struct.setList_maxid(TypeConverter.convert(maxid));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setOD_NO( ((OD_NO == null) ? (String)null : OD_NO[0]) );
		struct.setList_OD_NO(TypeConverter.convert(OD_NO));
		struct.setMRP_TYP( ((MRP_TYP == null) ? (String)null : MRP_TYP[0]) );
		struct.setList_MRP_TYP(TypeConverter.convert(MRP_TYP));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setODR_STS_TYP( ((ODR_STS_TYP == null) ? (String)null : ODR_STS_TYP[0]) );
		struct.setList_ODR_STS_TYP(TypeConverter.convert(ODR_STS_TYP));
		struct.setDM_STS_TYP( ((DM_STS_TYP == null) ? (String)null : DM_STS_TYP[0]) );
		struct.setList_DM_STS_TYP(TypeConverter.convert(DM_STS_TYP));
		struct.setOD_TYP( ((OD_TYP == null) ? (String)null : OD_TYP[0]) );
		struct.setList_OD_TYP(TypeConverter.convert(OD_TYP));
		struct.setJOB_ODR_STS_TYP( ((JOB_ODR_STS_TYP == null) ? (String)null : JOB_ODR_STS_TYP[0]) );
		struct.setList_JOB_ODR_STS_TYP(TypeConverter.convert(JOB_ODR_STS_TYP));
		struct.setPARENT_OD_NO( ((PARENT_OD_NO == null) ? (String)null : PARENT_OD_NO[0]) );
		struct.setList_PARENT_OD_NO(TypeConverter.convert(PARENT_OD_NO));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setOUTSIDE_TYP_DN( ((OUTSIDE_TYP_DN == null) ? (String)null : OUTSIDE_TYP_DN[0]) );
		struct.setList_OUTSIDE_TYP_DN(TypeConverter.convert(OUTSIDE_TYP_DN));
		struct.setITEM_SPOIL( ((ITEM_SPOIL == null) ? (String)null : ITEM_SPOIL[0]) );
		struct.setList_ITEM_SPOIL(TypeConverter.convert(ITEM_SPOIL));
		struct.setUNIT_QTY_TYP_DN( ((UNIT_QTY_TYP_DN == null) ? (String)null : UNIT_QTY_TYP_DN[0]) );
		struct.setList_UNIT_QTY_TYP_DN(TypeConverter.convert(UNIT_QTY_TYP_DN));
		struct.setDUE_DATE( ((DUE_DATE == null) ? (String)null : DUE_DATE[0]) );
		struct.setList_DUE_DATE(TypeConverter.convert(DUE_DATE));
		struct.setPRD_DUE_DATE( ((PRD_DUE_DATE == null) ? (String)null : PRD_DUE_DATE[0]) );
		struct.setList_PRD_DUE_DATE(TypeConverter.convert(PRD_DUE_DATE));
		struct.setPRD_START_DATE( ((PRD_START_DATE == null) ? (String)null : PRD_START_DATE[0]) );
		struct.setList_PRD_START_DATE(TypeConverter.convert(PRD_START_DATE));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setDM_QTY( ((DM_QTY == null) ? (String)null : DM_QTY[0]) );
		struct.setList_DM_QTY(TypeConverter.convert(DM_QTY));
		struct.setODR_QTY( ((ODR_QTY == null) ? (String)null : ODR_QTY[0]) );
		struct.setList_ODR_QTY(TypeConverter.convert(ODR_QTY));
		struct.setSUM_ALCD_QTY( ((SUM_ALCD_QTY == null) ? (String)null : SUM_ALCD_QTY[0]) );
		struct.setList_SUM_ALCD_QTY(TypeConverter.convert(SUM_ALCD_QTY));
		struct.setODR_STS_TYP_DN( ((ODR_STS_TYP_DN == null) ? (String)null : ODR_STS_TYP_DN[0]) );
		struct.setList_ODR_STS_TYP_DN(TypeConverter.convert(ODR_STS_TYP_DN));
		struct.setDM_STS_TYP_DN( ((DM_STS_TYP_DN == null) ? (String)null : DM_STS_TYP_DN[0]) );
		struct.setList_DM_STS_TYP_DN(TypeConverter.convert(DM_STS_TYP_DN));
		struct.setOD_TYP_DN( ((OD_TYP_DN == null) ? (String)null : OD_TYP_DN[0]) );
		struct.setList_OD_TYP_DN(TypeConverter.convert(OD_TYP_DN));
		struct.setSub1_Parent_ITEM_CD( ((Sub1_Parent_ITEM_CD == null) ? (String)null : Sub1_Parent_ITEM_CD[0]) );
		struct.setList_Sub1_Parent_ITEM_CD(TypeConverter.convert(Sub1_Parent_ITEM_CD));
		struct.setSub1_Parent_ITEM_NAME( ((Sub1_Parent_ITEM_NAME == null) ? (String)null : Sub1_Parent_ITEM_NAME[0]) );
		struct.setList_Sub1_Parent_ITEM_NAME(TypeConverter.convert(Sub1_Parent_ITEM_NAME));
		struct.setSub1_Comp_ITEM_CD( ((Sub1_Comp_ITEM_CD == null) ? (String)null : Sub1_Comp_ITEM_CD[0]) );
		struct.setList_Sub1_Comp_ITEM_CD(TypeConverter.convert(Sub1_Comp_ITEM_CD));
		struct.setSub1_Comp_ITEM_NAME( ((Sub1_Comp_ITEM_NAME == null) ? (String)null : Sub1_Comp_ITEM_NAME[0]) );
		struct.setList_Sub1_Comp_ITEM_NAME(TypeConverter.convert(Sub1_Comp_ITEM_NAME));
		struct.setSub1_DRAW_CD( ((Sub1_DRAW_CD == null) ? (String)null : Sub1_DRAW_CD[0]) );
		struct.setList_Sub1_DRAW_CD(TypeConverter.convert(Sub1_DRAW_CD));
		struct.setSub1_SPEC( ((Sub1_SPEC == null) ? (String)null : Sub1_SPEC[0]) );
		struct.setList_Sub1_SPEC(TypeConverter.convert(Sub1_SPEC));
		struct.setSub1_PS_UNIT_DENOMINATOR( ((Sub1_PS_UNIT_DENOMINATOR == null) ? (String)null : Sub1_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_Sub1_PS_UNIT_DENOMINATOR(TypeConverter.convert(Sub1_PS_UNIT_DENOMINATOR));
		struct.setSub1_PS_UNIT_NUMERATOR( ((Sub1_PS_UNIT_NUMERATOR == null) ? (String)null : Sub1_PS_UNIT_NUMERATOR[0]) );
		struct.setList_Sub1_PS_UNIT_NUMERATOR(TypeConverter.convert(Sub1_PS_UNIT_NUMERATOR));
		struct.setSub1_DM_QTY( ((Sub1_DM_QTY == null) ? (String)null : Sub1_DM_QTY[0]) );
		struct.setList_Sub1_DM_QTY(TypeConverter.convert(Sub1_DM_QTY));
		struct.setSub1_ODR_QTY( ((Sub1_ODR_QTY == null) ? (String)null : Sub1_ODR_QTY[0]) );
		struct.setList_Sub1_ODR_QTY(TypeConverter.convert(Sub1_ODR_QTY));
		struct.setSub1_DUE_DATE( ((Sub1_DUE_DATE == null) ? (String)null : Sub1_DUE_DATE[0]) );
		struct.setList_Sub1_DUE_DATE(TypeConverter.convert(Sub1_DUE_DATE));
		struct.setSub1_PRD_DUE_DATE( ((Sub1_PRD_DUE_DATE == null) ? (String)null : Sub1_PRD_DUE_DATE[0]) );
		struct.setList_Sub1_PRD_DUE_DATE(TypeConverter.convert(Sub1_PRD_DUE_DATE));
		struct.setSub1_PRD_START_DATE( ((Sub1_PRD_START_DATE == null) ? (String)null : Sub1_PRD_START_DATE[0]) );
		struct.setList_Sub1_PRD_START_DATE(TypeConverter.convert(Sub1_PRD_START_DATE));
		struct.setSub1_ODR_START_DATE( ((Sub1_ODR_START_DATE == null) ? (String)null : Sub1_ODR_START_DATE[0]) );
		struct.setList_Sub1_ODR_START_DATE(TypeConverter.convert(Sub1_ODR_START_DATE));
		struct.setSub1_OUTSIDE_TYP( ((Sub1_OUTSIDE_TYP == null) ? (String)null : Sub1_OUTSIDE_TYP[0]) );
		struct.setList_Sub1_OUTSIDE_TYP(TypeConverter.convert(Sub1_OUTSIDE_TYP));
		struct.setSub1_OUTSIDE_TYP_name( ((Sub1_OUTSIDE_TYP_name == null) ? (String)null : Sub1_OUTSIDE_TYP_name[0]) );
		struct.setList_Sub1_OUTSIDE_TYP_name(TypeConverter.convert(Sub1_OUTSIDE_TYP_name));
		struct.setSub1_OUTSIDE_TYP_val( ((Sub1_OUTSIDE_TYP_val == null) ? (String)null : Sub1_OUTSIDE_TYP_val[0]) );
		struct.setList_Sub1_OUTSIDE_TYP_val(TypeConverter.convert(Sub1_OUTSIDE_TYP_val));
		struct.setSub1_ITEM_SPOIL( ((Sub1_ITEM_SPOIL == null) ? (String)null : Sub1_ITEM_SPOIL[0]) );
		struct.setList_Sub1_ITEM_SPOIL(TypeConverter.convert(Sub1_ITEM_SPOIL));
		struct.setSub1_PS_SPOIL( ((Sub1_PS_SPOIL == null) ? (String)null : Sub1_PS_SPOIL[0]) );
		struct.setList_Sub1_PS_SPOIL(TypeConverter.convert(Sub1_PS_SPOIL));
		struct.seth_Sub1_PS_UNIT_QTY( ((h_Sub1_PS_UNIT_QTY == null) ? (String)null : h_Sub1_PS_UNIT_QTY[0]) );
		struct.setList_h_Sub1_PS_UNIT_QTY(TypeConverter.convert(h_Sub1_PS_UNIT_QTY));
		struct.setSub1_MRP_ODR_TYP_DN( ((Sub1_MRP_ODR_TYP_DN == null) ? (String)null : Sub1_MRP_ODR_TYP_DN[0]) );
		struct.setList_Sub1_MRP_ODR_TYP_DN(TypeConverter.convert(Sub1_MRP_ODR_TYP_DN));
		struct.setSub1_UNIT_QTY_TYP_DN( ((Sub1_UNIT_QTY_TYP_DN == null) ? (String)null : Sub1_UNIT_QTY_TYP_DN[0]) );
		struct.setList_Sub1_UNIT_QTY_TYP_DN(TypeConverter.convert(Sub1_UNIT_QTY_TYP_DN));
		struct.setSub1_STOCK_UNIT( ((Sub1_STOCK_UNIT == null) ? (String)null : Sub1_STOCK_UNIT[0]) );
		struct.setList_Sub1_STOCK_UNIT(TypeConverter.convert(Sub1_STOCK_UNIT));
		struct.seth_Sub1_Parent_ODR_QTY( ((h_Sub1_Parent_ODR_QTY == null) ? (String)null : h_Sub1_Parent_ODR_QTY[0]) );
		struct.setList_h_Sub1_Parent_ODR_QTY(TypeConverter.convert(h_Sub1_Parent_ODR_QTY));
		struct.seth_Sub1_MRP_ODR_TYP( ((h_Sub1_MRP_ODR_TYP == null) ? (String)null : h_Sub1_MRP_ODR_TYP[0]) );
		struct.setList_h_Sub1_MRP_ODR_TYP(TypeConverter.convert(h_Sub1_MRP_ODR_TYP));
		struct.seth_Sub1_UNIT_QTY_TYP( ((h_Sub1_UNIT_QTY_TYP == null) ? (String)null : h_Sub1_UNIT_QTY_TYP[0]) );
		struct.setList_h_Sub1_UNIT_QTY_TYP(TypeConverter.convert(h_Sub1_UNIT_QTY_TYP));
		struct.seth_Sub1_Parent_ODR_START_DATE( ((h_Sub1_Parent_ODR_START_DATE == null) ? (String)null : h_Sub1_Parent_ODR_START_DATE[0]) );
		struct.setList_h_Sub1_Parent_ODR_START_DATE(TypeConverter.convert(h_Sub1_Parent_ODR_START_DATE));
		struct.seth_Parent_OD_MODIFY_COUNT( ((h_Parent_OD_MODIFY_COUNT == null) ? (String)null : h_Parent_OD_MODIFY_COUNT[0]) );
		struct.setList_h_Parent_OD_MODIFY_COUNT(TypeConverter.convert(h_Parent_OD_MODIFY_COUNT));
		struct.seth_Comp_ITEM_MODIFY_COUNT( ((h_Comp_ITEM_MODIFY_COUNT == null) ? (String)null : h_Comp_ITEM_MODIFY_COUNT[0]) );
		struct.setList_h_Comp_ITEM_MODIFY_COUNT(TypeConverter.convert(h_Comp_ITEM_MODIFY_COUNT));
		struct.seth_Sub1_Parent_OD_LEVEL_NO( ((h_Sub1_Parent_OD_LEVEL_NO == null) ? (String)null : h_Sub1_Parent_OD_LEVEL_NO[0]) );
		struct.setList_h_Sub1_Parent_OD_LEVEL_NO(TypeConverter.convert(h_Sub1_Parent_OD_LEVEL_NO));
		struct.seth_Sub1_ISSUE_TYP( ((h_Sub1_ISSUE_TYP == null) ? (String)null : h_Sub1_ISSUE_TYP[0]) );
		struct.setList_h_Sub1_ISSUE_TYP(TypeConverter.convert(h_Sub1_ISSUE_TYP));
		struct.seth_Sub1_Parent_ALC_GRP_CD( ((h_Sub1_Parent_ALC_GRP_CD == null) ? (String)null : h_Sub1_Parent_ALC_GRP_CD[0]) );
		struct.setList_h_Sub1_Parent_ALC_GRP_CD(TypeConverter.convert(h_Sub1_Parent_ALC_GRP_CD));
		struct.setAC0120010tree1( ((AC0120010tree1 == null) ? (String)null : AC0120010tree1[0]) );
		struct.setList_AC0120010tree1(TypeConverter.convert(AC0120010tree1));
		struct.setc_JOB_ODR_DEL( ((c_JOB_ODR_DEL == null) ? (String)null : c_JOB_ODR_DEL[0]) );
		struct.setList_c_JOB_ODR_DEL(TypeConverter.convert(c_JOB_ODR_DEL));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_Sub1_OD_MODIFY_COUNT( ((h_Sub1_OD_MODIFY_COUNT == null) ? (String)null : h_Sub1_OD_MODIFY_COUNT[0]) );
		struct.setList_h_Sub1_OD_MODIFY_COUNT(TypeConverter.convert(h_Sub1_OD_MODIFY_COUNT));
		struct.setOD_GNR_TYP_DN( ((OD_GNR_TYP_DN == null) ? (String)null : OD_GNR_TYP_DN[0]) );
		struct.setList_OD_GNR_TYP_DN(TypeConverter.convert(OD_GNR_TYP_DN));
		struct.setDetail_ITEM_NAME( ((Detail_ITEM_NAME == null) ? (String)null : Detail_ITEM_NAME[0]) );
		struct.setList_Detail_ITEM_NAME(TypeConverter.convert(Detail_ITEM_NAME));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setSub1_DUE_TIME( ((Sub1_DUE_TIME == null) ? (String)null : Sub1_DUE_TIME[0]) );
		struct.setList_Sub1_DUE_TIME(TypeConverter.convert(Sub1_DUE_TIME));
		struct.setSub1_DUE_TIME2( ((Sub1_DUE_TIME2 == null) ? (String)null : Sub1_DUE_TIME2[0]) );
		struct.setList_Sub1_DUE_TIME2(TypeConverter.convert(Sub1_DUE_TIME2));
		struct.setSub1_DUE_TIME3( ((Sub1_DUE_TIME3 == null) ? (String)null : Sub1_DUE_TIME3[0]) );
		struct.setList_Sub1_DUE_TIME3(TypeConverter.convert(Sub1_DUE_TIME3));
		struct.setSub1_PRD_DUE_TIME( ((Sub1_PRD_DUE_TIME == null) ? (String)null : Sub1_PRD_DUE_TIME[0]) );
		struct.setList_Sub1_PRD_DUE_TIME(TypeConverter.convert(Sub1_PRD_DUE_TIME));
		struct.setSub1_PRD_START_TIME( ((Sub1_PRD_START_TIME == null) ? (String)null : Sub1_PRD_START_TIME[0]) );
		struct.setList_Sub1_PRD_START_TIME(TypeConverter.convert(Sub1_PRD_START_TIME));
		struct.setSub1_ODR_START_TIME( ((Sub1_ODR_START_TIME == null) ? (String)null : Sub1_ODR_START_TIME[0]) );
		struct.setList_Sub1_ODR_START_TIME(TypeConverter.convert(Sub1_ODR_START_TIME));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.setMANHOUR_TYP( ((MANHOUR_TYP == null) ? (String)null : MANHOUR_TYP[0]) );
		struct.setList_MANHOUR_TYP(TypeConverter.convert(MANHOUR_TYP));
		struct.setMANHOUR_TYP_DN( ((MANHOUR_TYP_DN == null) ? (String)null : MANHOUR_TYP_DN[0]) );
		struct.setList_MANHOUR_TYP_DN(TypeConverter.convert(MANHOUR_TYP_DN));
		struct.seth_Sub1_MANHOUR_TYP( ((h_Sub1_MANHOUR_TYP == null) ? (String)null : h_Sub1_MANHOUR_TYP[0]) );
		struct.setList_h_Sub1_MANHOUR_TYP(TypeConverter.convert(h_Sub1_MANHOUR_TYP));
		struct.setOPR_RSLT_TYP_DN( ((OPR_RSLT_TYP_DN == null) ? (String)null : OPR_RSLT_TYP_DN[0]) );
		struct.setList_OPR_RSLT_TYP_DN(TypeConverter.convert(OPR_RSLT_TYP_DN));
		struct.setTOTAL_RCV_QTY( ((TOTAL_RCV_QTY == null) ? (String)null : TOTAL_RCV_QTY[0]) );
		struct.setList_TOTAL_RCV_QTY(TypeConverter.convert(TOTAL_RCV_QTY));
		struct.setTOTAL_ISSUE_QTY( ((TOTAL_ISSUE_QTY == null) ? (String)null : TOTAL_ISSUE_QTY[0]) );
		struct.setList_TOTAL_ISSUE_QTY(TypeConverter.convert(TOTAL_ISSUE_QTY));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setOPR_RSLT_TYP( ((OPR_RSLT_TYP == null) ? (String)null : OPR_RSLT_TYP[0]) );
		struct.setList_OPR_RSLT_TYP(TypeConverter.convert(OPR_RSLT_TYP));
		struct.setJOB_ODR_STS_TYP1( ((JOB_ODR_STS_TYP1 == null) ? (String)null : JOB_ODR_STS_TYP1[0]) );
		struct.setList_JOB_ODR_STS_TYP1(TypeConverter.convert(JOB_ODR_STS_TYP1));
		struct.setCHIID_OD_NO( ((CHIID_OD_NO == null) ? (String)null : CHIID_OD_NO[0]) );
		struct.setList_CHIID_OD_NO(TypeConverter.convert(CHIID_OD_NO));
		struct.seth_DM_STS_TYP( ((h_DM_STS_TYP == null) ? (String)null : h_DM_STS_TYP[0]) );
		struct.setList_h_DM_STS_TYP(TypeConverter.convert(h_DM_STS_TYP));
		struct.seth_ODR_STS_TYP( ((h_ODR_STS_TYP == null) ? (String)null : h_ODR_STS_TYP[0]) );
		struct.setList_h_ODR_STS_TYP(TypeConverter.convert(h_ODR_STS_TYP));
		struct.seth_size( ((h_size == null) ? (String)null : h_size[0]) );
		struct.setList_h_size(TypeConverter.convert(h_size));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AC0120010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAC0120010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAC0120010Struct";   // JSP先のバインド名(Struct)の指定
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
					AC0120010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AC0120010Control control;
		AC0120010Entity  entity = null;
		AC0120010Struct  struct = null;

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

			if( (control = (AC0120010Control)so.getAttribute("AC0120010Control_"+request.getSession(false).getId())) == null ) {
				control = new AC0120010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AC0120010Control();
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
				} else if( isClick(request, "FlashTree") ) {
					if ( !isCryptical(request, so, params, "FlashTree") ) return ERROR_TARGET;
					target = onClickFlashTree(request, response, so, params, control);
					control.setButton("FlashTree");
				} else if( isClick(request, "append") ) {
					if ( !isCryptical(request, so, params, "append") ) return ERROR_TARGET;
					target = onClickappend(request, response, so, params, control);
					control.setButton("append");
				} else if( isClick(request, "modify") ) {
					if ( !isCryptical(request, so, params, "modify") ) return ERROR_TARGET;
					target = onClickmodify(request, response, so, params, control);
					control.setButton("modify");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "PeekerItemCd") ) {
					if ( !isCryptical(request, so, params, "PeekerItemCd") ) return ERROR_TARGET;
					target = onClickPeekerItemCd(request, response, so, params, control);
					control.setButton("PeekerItemCd");
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "cancelSub1") ) {
					if ( !isCryptical(request, so, params, "cancelSub1") ) return ERROR_TARGET;
					target = onClickcancelSub1(request, response, so, params, control);
					control.setButton("cancelSub1");
				} else if( isClick(request, "ShowDetail") ) {
					if ( !isCryptical(request, so, params, "ShowDetail") ) return ERROR_TARGET;
					target = onClickShowDetail(request, response, so, params, control);
					control.setButton("ShowDetail");
				} else if( isClick(request, "AddTree") ) {
					if ( !isCryptical(request, so, params, "AddTree") ) return ERROR_TARGET;
					target = onClickAddTree(request, response, so, params, control);
					control.setButton("AddTree");
				} else if( isClick(request, "selectSub1") ) {
					if ( !isCryptical(request, so, params, "selectSub1") ) return ERROR_TARGET;
					target = onClickselectSub1(request, response, so, params, control);
					control.setButton("selectSub1");
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AC0120010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "FlashTree") && bFLG_DISCONNECT_FlashTree)
				|| (isClick(request, "append") && bFLG_DISCONNECT_append)
				|| (isClick(request, "modify") && bFLG_DISCONNECT_modify)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "PeekerItemCd") && bFLG_DISCONNECT_PeekerItemCd)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "cancelSub1") && bFLG_DISCONNECT_cancelSub1)
				|| (isClick(request, "ShowDetail") && bFLG_DISCONNECT_ShowDetail)
				|| (isClick(request, "AddTree") && bFLG_DISCONNECT_AddTree)
				|| (isClick(request, "selectSub1") && bFLG_DISCONNECT_selectSub1)
				|| (isClick(request, "CsvOut") && bFLG_DISCONNECT_CsvOut)
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
	private  static boolean bFLG_DISCONNECT_FlashTree = true;
	private  static boolean bFLG_DISCONNECT_append = true;
	private  static boolean bFLG_DISCONNECT_modify = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_PeekerItemCd = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_cancelSub1 = true;
	private  static boolean bFLG_DISCONNECT_ShowDetail = true;
	private  static boolean bFLG_DISCONNECT_AddTree = true;
	private  static boolean bFLG_DISCONNECT_selectSub1 = true;
	private  static boolean bFLG_DISCONNECT_CsvOut = true;

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
		return "com.nec.jp.orteus.metamorBase.AC0120.AC0120010Servlet";
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
	public AC0120010Servlet()
	{
		//{{user_implement_dev:<AC0120010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_FlashTree = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_ShowDetail = true;
		bFLG_DISCONNECT_AddTree = true;

                //}}user_implement_dev:<AC0120010_DisConnect_FLG>

		//{{user_implement_dev:<AC0120010Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AC0120010Servlet>
	}

	//////////////////////////////

}
