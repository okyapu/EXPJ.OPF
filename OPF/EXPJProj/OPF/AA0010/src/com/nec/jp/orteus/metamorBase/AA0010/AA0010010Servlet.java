/*
 * $Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/srcgen/rp_pfnd_tbl/ServletTempl.vm,v $
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

package com.nec.jp.orteus.metamorBase.AA0010;

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
//}}user_implement_dev:import

//{{user_implement_dev:header
/**
 * CLASS     : AA0010010Servlet クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0、<日付>、新規作成
 *         [ : <バージョン>、<日付>、<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class AA0010010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
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
	 * @param control AA0010010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AA0010010Control control)
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
		if (control.isScreenMove()){
			HashMap keyvalueMap = new HashMap();
			if (params.containsKey("h_KEY1") && params.containsKey("h_VALUE1")) {
				String[] key = null;
				String[] value = null;
				key = (String[]) params.get("h_KEY1");
				value = (String[]) params.get("h_VALUE1");
				keyvalueMap.put(key[0], value[0]);
			}
			if (params.containsKey("h_KEY2") && params.containsKey("h_VALUE2")) {
				String[] key = null;
				String[] value = null;
				key = (String[]) params.get("h_KEY2");
				value = (String[]) params.get("h_VALUE2");
				keyvalueMap.put(key[0], value[0]);
			}
			if (params.containsKey("h_KEY3") && params.containsKey("h_VALUE3")) {
				String[] key = null;
				String[] value = null;
				key = (String[]) params.get("h_KEY3");
				value = (String[]) params.get("h_VALUE3");
				keyvalueMap.put(key[0], value[0]);
			}
			if (params.containsKey("h_KEY4") && params.containsKey("h_VALUE4")) {
				String[] key = null;
				String[] value = null;
				key = (String[]) params.get("h_KEY4");
				value = (String[]) params.get("h_VALUE4");
				keyvalueMap.put(key[0], value[0]);
			}
			if (params.containsKey("h_KEY5") && params.containsKey("h_VALUE5")) {
				String[] key = null;
				String[] value = null;
				key = (String[]) params.get("h_KEY5");
				value = (String[]) params.get("h_VALUE5");
				keyvalueMap.put(key[0], value[0]);
			}
			control.setKeyValueMap(keyvalueMap);	
		}
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AA0010010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AA0010010Control control)
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
	 * @param control AA0010010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
			logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			objMessage.m_writer.write( Level.ALL, "AA0010010"+" $Revision: 1.31 $" );
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0010010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		//---------------------------------------------------------------------
		try {
			// 画面遷移パラメータの取得
			setScreenMoveParams(params, control);
			control.control_eventHandller("reload");

			/*if (control.isScreenMove()) {
				getSessionParameters(so, params, struct);
				control.control_eventHandller("select");
			}*/
		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
//			ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
//			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------

                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0010010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//---------------------------------------------------------------------
		try {
			control.control_eventHandller("select");

		} catch(FoundationException e) {
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
//			ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
//			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0010010Controlクラスインスタンス
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
		//---------------------------------------------------------------------
		try {
			control.control_eventHandller("insert");

		} catch(FoundationException e) {
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
//			ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
//			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0010010Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
		//---------------------------------------------------------------------
		try {
			control.control_eventHandller("update");

		} catch(FoundationException e) {
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
//			ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
//			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0010010Controlクラスインスタンス
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
		//---------------------------------------------------------------------
		try {
			control.control_eventHandller("delete");

		} catch(FoundationException e) {
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
//			ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
//			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0010010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
		//---------------------------------------------------------------------
		try {
			control.control_eventHandller("clear");

		} catch(FoundationException e) {
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
//			ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
//			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] HIGH_LEVEL_NO = ((params.containsKey("HIGH_LEVEL_NO")) ? (String[])params.get("HIGH_LEVEL_NO") : (String[])null);
		String[] ISSUE_TYP = ((params.containsKey("ISSUE_TYP")) ? (String[])params.get("ISSUE_TYP") : (String[])null);
		String[] ISSUE_TYP_name = ((params.containsKey("ISSUE_TYP_name")) ? (String[])params.get("ISSUE_TYP_name") : (String[])null);
		String[] ISSUE_TYP_val = ((params.containsKey("ISSUE_TYP_val")) ? (String[])params.get("ISSUE_TYP_val") : (String[])null);
		String[] OUTSIDE_TYP = ((params.containsKey("OUTSIDE_TYP")) ? (String[])params.get("OUTSIDE_TYP") : (String[])null);
		String[] OUTSIDE_TYP_name = ((params.containsKey("OUTSIDE_TYP_name")) ? (String[])params.get("OUTSIDE_TYP_name") : (String[])null);
		String[] OUTSIDE_TYP_val = ((params.containsKey("OUTSIDE_TYP_val")) ? (String[])params.get("OUTSIDE_TYP_val") : (String[])null);
		String[] STOCK_UNIT_FLG = ((params.containsKey("STOCK_UNIT_FLG")) ? (String[])params.get("STOCK_UNIT_FLG") : (String[])null);
		String[] STOCK_UNIT_FLG_name = ((params.containsKey("STOCK_UNIT_FLG_name")) ? (String[])params.get("STOCK_UNIT_FLG_name") : (String[])null);
		String[] STOCK_UNIT_FLG_val = ((params.containsKey("STOCK_UNIT_FLG_val")) ? (String[])params.get("STOCK_UNIT_FLG_val") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] PKG_UNIT = ((params.containsKey("PKG_UNIT")) ? (String[])params.get("PKG_UNIT") : (String[])null);
		String[] PKG_UNIT_QTY = ((params.containsKey("PKG_UNIT_QTY")) ? (String[])params.get("PKG_UNIT_QTY") : (String[])null);
		String[] UNIT_QTY_TYP = ((params.containsKey("UNIT_QTY_TYP")) ? (String[])params.get("UNIT_QTY_TYP") : (String[])null);
		String[] UNIT_QTY_TYP_name = ((params.containsKey("UNIT_QTY_TYP_name")) ? (String[])params.get("UNIT_QTY_TYP_name") : (String[])null);
		String[] UNIT_QTY_TYP_val = ((params.containsKey("UNIT_QTY_TYP_val")) ? (String[])params.get("UNIT_QTY_TYP_val") : (String[])null);
		String[] ODR_LT = ((params.containsKey("ODR_LT")) ? (String[])params.get("ODR_LT") : (String[])null);
		String[] ISSUE_LT = ((params.containsKey("ISSUE_LT")) ? (String[])params.get("ISSUE_LT") : (String[])null);
		String[] FIXED_LT = ((params.containsKey("FIXED_LT")) ? (String[])params.get("FIXED_LT") : (String[])null);
		String[] PROP_LOT_SIZE = ((params.containsKey("PROP_LOT_SIZE")) ? (String[])params.get("PROP_LOT_SIZE") : (String[])null);
		String[] PROP_LT = ((params.containsKey("PROP_LT")) ? (String[])params.get("PROP_LT") : (String[])null);
		String[] ITEM_SPOIL = ((params.containsKey("ITEM_SPOIL")) ? (String[])params.get("ITEM_SPOIL") : (String[])null);
		String[] SAFETY_LT = ((params.containsKey("SAFETY_LT")) ? (String[])params.get("SAFETY_LT") : (String[])null);
		String[] SAFETY_STOCK = ((params.containsKey("SAFETY_STOCK")) ? (String[])params.get("SAFETY_STOCK") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] MRP_ODR_TYP_name = ((params.containsKey("MRP_ODR_TYP_name")) ? (String[])params.get("MRP_ODR_TYP_name") : (String[])null);
		String[] MRP_ODR_TYP_val = ((params.containsKey("MRP_ODR_TYP_val")) ? (String[])params.get("MRP_ODR_TYP_val") : (String[])null);
		String[] LOT_SIZING_TYP = ((params.containsKey("LOT_SIZING_TYP")) ? (String[])params.get("LOT_SIZING_TYP") : (String[])null);
		String[] MAX_PERIOD = ((params.containsKey("MAX_PERIOD")) ? (String[])params.get("MAX_PERIOD") : (String[])null);
		String[] FIXED_ODR_QTY = ((params.containsKey("FIXED_ODR_QTY")) ? (String[])params.get("FIXED_ODR_QTY") : (String[])null);
		String[] MAX_ODR_QTY = ((params.containsKey("MAX_ODR_QTY")) ? (String[])params.get("MAX_ODR_QTY") : (String[])null);
		String[] MIN_ODR_QTY = ((params.containsKey("MIN_ODR_QTY")) ? (String[])params.get("MIN_ODR_QTY") : (String[])null);
		String[] ODR_POINT = ((params.containsKey("ODR_POINT")) ? (String[])params.get("ODR_POINT") : (String[])null);
		String[] MUL_ODR_QTY = ((params.containsKey("MUL_ODR_QTY")) ? (String[])params.get("MUL_ODR_QTY") : (String[])null);
		String[] MPS_FLG = ((params.containsKey("MPS_FLG")) ? (String[])params.get("MPS_FLG") : (String[])null);
		String[] ACPT_INSPC_TYP = ((params.containsKey("ACPT_INSPC_TYP")) ? (String[])params.get("ACPT_INSPC_TYP") : (String[])null);
		String[] ACPT_INSPC_TYP_name = ((params.containsKey("ACPT_INSPC_TYP_name")) ? (String[])params.get("ACPT_INSPC_TYP_name") : (String[])null);
		String[] ACPT_INSPC_TYP_val = ((params.containsKey("ACPT_INSPC_TYP_val")) ? (String[])params.get("ACPT_INSPC_TYP_val") : (String[])null);
		String[] PRODUCT_TYP = ((params.containsKey("PRODUCT_TYP")) ? (String[])params.get("PRODUCT_TYP") : (String[])null);
		String[] PRODUCT_TYP_name = ((params.containsKey("PRODUCT_TYP_name")) ? (String[])params.get("PRODUCT_TYP_name") : (String[])null);
		String[] PRODUCT_TYP_val = ((params.containsKey("PRODUCT_TYP_val")) ? (String[])params.get("PRODUCT_TYP_val") : (String[])null);
		String[] CLASIFICATION_CD = ((params.containsKey("CLASIFICATION_CD")) ? (String[])params.get("CLASIFICATION_CD") : (String[])null);
		String[] UNIT_WEIGHT = ((params.containsKey("UNIT_WEIGHT")) ? (String[])params.get("UNIT_WEIGHT") : (String[])null);
		String[] ABC_TYP = ((params.containsKey("ABC_TYP")) ? (String[])params.get("ABC_TYP") : (String[])null);
		String[] ABC_TYP_name = ((params.containsKey("ABC_TYP_name")) ? (String[])params.get("ABC_TYP_name") : (String[])null);
		String[] ABC_TYP_val = ((params.containsKey("ABC_TYP_val")) ? (String[])params.get("ABC_TYP_val") : (String[])null);
		String[] OPR_RSLT_TYP = ((params.containsKey("OPR_RSLT_TYP")) ? (String[])params.get("OPR_RSLT_TYP") : (String[])null);
		String[] OPR_RSLT_TYP_name = ((params.containsKey("OPR_RSLT_TYP_name")) ? (String[])params.get("OPR_RSLT_TYP_name") : (String[])null);
		String[] OPR_RSLT_TYP_val = ((params.containsKey("OPR_RSLT_TYP_val")) ? (String[])params.get("OPR_RSLT_TYP_val") : (String[])null);
		String[] SPL_ITEM_TYP = ((params.containsKey("SPL_ITEM_TYP")) ? (String[])params.get("SPL_ITEM_TYP") : (String[])null);
		String[] SPL_ITEM_TYP_name = ((params.containsKey("SPL_ITEM_TYP_name")) ? (String[])params.get("SPL_ITEM_TYP_name") : (String[])null);
		String[] SPL_ITEM_TYP_val = ((params.containsKey("SPL_ITEM_TYP_val")) ? (String[])params.get("SPL_ITEM_TYP_val") : (String[])null);
		String[] TAX_CD = ((params.containsKey("TAX_CD")) ? (String[])params.get("TAX_CD") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] TAX_NAME = ((params.containsKey("TAX_NAME")) ? (String[])params.get("TAX_NAME") : (String[])null);
		String[] LOT_SIZING_TYP_name = ((params.containsKey("LOT_SIZING_TYP_name")) ? (String[])params.get("LOT_SIZING_TYP_name") : (String[])null);
		String[] LOT_SIZING_TYP_val = ((params.containsKey("LOT_SIZING_TYP_val")) ? (String[])params.get("LOT_SIZING_TYP_val") : (String[])null);
		String[] MPS_FLG_name = ((params.containsKey("MPS_FLG_name")) ? (String[])params.get("MPS_FLG_name") : (String[])null);
		String[] MPS_FLG_val = ((params.containsKey("MPS_FLG_val")) ? (String[])params.get("MPS_FLG_val") : (String[])null);
		String[] h_ITEM_CD = ((params.containsKey("h_ITEM_CD")) ? (String[])params.get("h_ITEM_CD") : (String[])null);
		String[] STOCK_UNIT_name = ((params.containsKey("STOCK_UNIT_name")) ? (String[])params.get("STOCK_UNIT_name") : (String[])null);
		String[] STOCK_UNIT_val = ((params.containsKey("STOCK_UNIT_val")) ? (String[])params.get("STOCK_UNIT_val") : (String[])null);
		String[] CAL_NO = ((params.containsKey("CAL_NO")) ? (String[])params.get("CAL_NO") : (String[])null);
		String[] CAL_NAME = ((params.containsKey("CAL_NAME")) ? (String[])params.get("CAL_NAME") : (String[])null);
		String[] ITEM_CLASS_01_TYP = ((params.containsKey("ITEM_CLASS_01_TYP")) ? (String[])params.get("ITEM_CLASS_01_TYP") : (String[])null);
		String[] ITEM_CLASS_01_CD = ((params.containsKey("ITEM_CLASS_01_CD")) ? (String[])params.get("ITEM_CLASS_01_CD") : (String[])null);
		String[] ITEM_CLASS_01_NAME = ((params.containsKey("ITEM_CLASS_01_NAME")) ? (String[])params.get("ITEM_CLASS_01_NAME") : (String[])null);
		String[] ITEM_CLASS_02_TYP = ((params.containsKey("ITEM_CLASS_02_TYP")) ? (String[])params.get("ITEM_CLASS_02_TYP") : (String[])null);
		String[] ITEM_CLASS_02_CD = ((params.containsKey("ITEM_CLASS_02_CD")) ? (String[])params.get("ITEM_CLASS_02_CD") : (String[])null);
		String[] ITEM_CLASS_02_NAME = ((params.containsKey("ITEM_CLASS_02_NAME")) ? (String[])params.get("ITEM_CLASS_02_NAME") : (String[])null);
		String[] ITEM_CLASS_03_TYP = ((params.containsKey("ITEM_CLASS_03_TYP")) ? (String[])params.get("ITEM_CLASS_03_TYP") : (String[])null);
		String[] ITEM_CLASS_03_CD = ((params.containsKey("ITEM_CLASS_03_CD")) ? (String[])params.get("ITEM_CLASS_03_CD") : (String[])null);
		String[] ITEM_CLASS_03_NAME = ((params.containsKey("ITEM_CLASS_03_NAME")) ? (String[])params.get("ITEM_CLASS_03_NAME") : (String[])null);
		String[] ITEM_CLASS_04_TYP = ((params.containsKey("ITEM_CLASS_04_TYP")) ? (String[])params.get("ITEM_CLASS_04_TYP") : (String[])null);
		String[] ITEM_CLASS_04_CD = ((params.containsKey("ITEM_CLASS_04_CD")) ? (String[])params.get("ITEM_CLASS_04_CD") : (String[])null);
		String[] ITEM_CLASS_04_NAME = ((params.containsKey("ITEM_CLASS_04_NAME")) ? (String[])params.get("ITEM_CLASS_04_NAME") : (String[])null);
		String[] ITEM_CLASS_05_TYP = ((params.containsKey("ITEM_CLASS_05_TYP")) ? (String[])params.get("ITEM_CLASS_05_TYP") : (String[])null);
		String[] ITEM_CLASS_05_CD = ((params.containsKey("ITEM_CLASS_05_CD")) ? (String[])params.get("ITEM_CLASS_05_CD") : (String[])null);
		String[] ITEM_CLASS_05_NAME = ((params.containsKey("ITEM_CLASS_05_NAME")) ? (String[])params.get("ITEM_CLASS_05_NAME") : (String[])null);
		String[] ITEM_CLASS_06_TYP = ((params.containsKey("ITEM_CLASS_06_TYP")) ? (String[])params.get("ITEM_CLASS_06_TYP") : (String[])null);
		String[] ITEM_CLASS_06_CD = ((params.containsKey("ITEM_CLASS_06_CD")) ? (String[])params.get("ITEM_CLASS_06_CD") : (String[])null);
		String[] ITEM_CLASS_06_NAME = ((params.containsKey("ITEM_CLASS_06_NAME")) ? (String[])params.get("ITEM_CLASS_06_NAME") : (String[])null);
		String[] ITEM_CLASS_07_TYP = ((params.containsKey("ITEM_CLASS_07_TYP")) ? (String[])params.get("ITEM_CLASS_07_TYP") : (String[])null);
		String[] ITEM_CLASS_07_CD = ((params.containsKey("ITEM_CLASS_07_CD")) ? (String[])params.get("ITEM_CLASS_07_CD") : (String[])null);
		String[] ITEM_CLASS_07_NAME = ((params.containsKey("ITEM_CLASS_07_NAME")) ? (String[])params.get("ITEM_CLASS_07_NAME") : (String[])null);
		String[] ITEM_CLASS_08_TYP = ((params.containsKey("ITEM_CLASS_08_TYP")) ? (String[])params.get("ITEM_CLASS_08_TYP") : (String[])null);
		String[] ITEM_CLASS_08_CD = ((params.containsKey("ITEM_CLASS_08_CD")) ? (String[])params.get("ITEM_CLASS_08_CD") : (String[])null);
		String[] ITEM_CLASS_08_NAME = ((params.containsKey("ITEM_CLASS_08_NAME")) ? (String[])params.get("ITEM_CLASS_08_NAME") : (String[])null);
		String[] ITEM_CLASS_09_TYP = ((params.containsKey("ITEM_CLASS_09_TYP")) ? (String[])params.get("ITEM_CLASS_09_TYP") : (String[])null);
		String[] ITEM_CLASS_09_CD = ((params.containsKey("ITEM_CLASS_09_CD")) ? (String[])params.get("ITEM_CLASS_09_CD") : (String[])null);
		String[] ITEM_CLASS_09_NAME = ((params.containsKey("ITEM_CLASS_09_NAME")) ? (String[])params.get("ITEM_CLASS_09_NAME") : (String[])null);
		String[] ITEM_CLASS_10_TYP = ((params.containsKey("ITEM_CLASS_10_TYP")) ? (String[])params.get("ITEM_CLASS_10_TYP") : (String[])null);
		String[] ITEM_CLASS_10_CD = ((params.containsKey("ITEM_CLASS_10_CD")) ? (String[])params.get("ITEM_CLASS_10_CD") : (String[])null);
		String[] ITEM_CLASS_10_NAME = ((params.containsKey("ITEM_CLASS_10_NAME")) ? (String[])params.get("ITEM_CLASS_10_NAME") : (String[])null);
		String[] ITEM_CLASS_11_TYP = ((params.containsKey("ITEM_CLASS_11_TYP")) ? (String[])params.get("ITEM_CLASS_11_TYP") : (String[])null);
		String[] ITEM_CLASS_11_CD = ((params.containsKey("ITEM_CLASS_11_CD")) ? (String[])params.get("ITEM_CLASS_11_CD") : (String[])null);
		String[] ITEM_CLASS_11_NAME = ((params.containsKey("ITEM_CLASS_11_NAME")) ? (String[])params.get("ITEM_CLASS_11_NAME") : (String[])null);
		String[] ITEM_CLASS_12_TYP = ((params.containsKey("ITEM_CLASS_12_TYP")) ? (String[])params.get("ITEM_CLASS_12_TYP") : (String[])null);
		String[] ITEM_CLASS_12_CD = ((params.containsKey("ITEM_CLASS_12_CD")) ? (String[])params.get("ITEM_CLASS_12_CD") : (String[])null);
		String[] ITEM_CLASS_12_NAME = ((params.containsKey("ITEM_CLASS_12_NAME")) ? (String[])params.get("ITEM_CLASS_12_NAME") : (String[])null);
		String[] DEPO_TYP = ((params.containsKey("DEPO_TYP")) ? (String[])params.get("DEPO_TYP") : (String[])null);
		String[] DEPO_TYP_name = ((params.containsKey("DEPO_TYP_name")) ? (String[])params.get("DEPO_TYP_name") : (String[])null);
		String[] DEPO_TYP_val = ((params.containsKey("DEPO_TYP_val")) ? (String[])params.get("DEPO_TYP_val") : (String[])null);
		String[] BEST_BEFORE_YEAR = ((params.containsKey("BEST_BEFORE_YEAR")) ? (String[])params.get("BEST_BEFORE_YEAR") : (String[])null);
		String[] LOT_CTRL_FLG = ((params.containsKey("LOT_CTRL_FLG")) ? (String[])params.get("LOT_CTRL_FLG") : (String[])null);
		String[] LOT_CTRL_FLG_name = ((params.containsKey("LOT_CTRL_FLG_name")) ? (String[])params.get("LOT_CTRL_FLG_name") : (String[])null);
		String[] LOT_CTRL_FLG_val = ((params.containsKey("LOT_CTRL_FLG_val")) ? (String[])params.get("LOT_CTRL_FLG_val") : (String[])null);
		String[] BEST_BEFORE_MONTH = ((params.containsKey("BEST_BEFORE_MONTH")) ? (String[])params.get("BEST_BEFORE_MONTH") : (String[])null);
		String[] LOT_NUMBERING_TYP = ((params.containsKey("LOT_NUMBERING_TYP")) ? (String[])params.get("LOT_NUMBERING_TYP") : (String[])null);
		String[] LOT_NUMBERING_TYP_name = ((params.containsKey("LOT_NUMBERING_TYP_name")) ? (String[])params.get("LOT_NUMBERING_TYP_name") : (String[])null);
		String[] LOT_NUMBERING_TYP_val = ((params.containsKey("LOT_NUMBERING_TYP_val")) ? (String[])params.get("LOT_NUMBERING_TYP_val") : (String[])null);
		String[] BEST_BEFORE_DAY = ((params.containsKey("BEST_BEFORE_DAY")) ? (String[])params.get("BEST_BEFORE_DAY") : (String[])null);
		String[] REMARK1 = ((params.containsKey("REMARK1")) ? (String[])params.get("REMARK1") : (String[])null);
		String[] REMARK2 = ((params.containsKey("REMARK2")) ? (String[])params.get("REMARK2") : (String[])null);
		String[] MANHOUR_TYP = ((params.containsKey("MANHOUR_TYP")) ? (String[])params.get("MANHOUR_TYP") : (String[])null);
		String[] MANHOUR_TYP_name = ((params.containsKey("MANHOUR_TYP_name")) ? (String[])params.get("MANHOUR_TYP_name") : (String[])null);
		String[] MANHOUR_TYP_val = ((params.containsKey("MANHOUR_TYP_val")) ? (String[])params.get("MANHOUR_TYP_val") : (String[])null);
		String[] h_APR_ITEM = ((params.containsKey("h_APR_ITEM")) ? (String[])params.get("h_APR_ITEM") : (String[])null);
		String[] h_SCREENMOVE_TYP = ((params.containsKey("h_SCREENMOVE_TYP")) ? (String[])params.get("h_SCREENMOVE_TYP") : (String[])null);
		String[] h_APPR_ID = ((params.containsKey("h_APPR_ID")) ? (String[])params.get("h_APPR_ID") : (String[])null);
		String[] APPR_REMARKS = ((params.containsKey("APPR_REMARKS")) ? (String[])params.get("APPR_REMARKS") : (String[])null);
		String[] DEPT_CD = ((params.containsKey("DEPT_CD")) ? (String[])params.get("DEPT_CD") : (String[])null);
		String[] DEPT_NAME = ((params.containsKey("DEPT_NAME")) ? (String[])params.get("DEPT_NAME") : (String[])null);
		String[] PJ_CD = ((params.containsKey("PJ_CD")) ? (String[])params.get("PJ_CD") : (String[])null);
		String[] PJ_CD_name = ((params.containsKey("PJ_CD_name")) ? (String[])params.get("PJ_CD_name") : (String[])null);
		String[] PJ_CD_val = ((params.containsKey("PJ_CD_val")) ? (String[])params.get("PJ_CD_val") : (String[])null);
		String[] SEG_CONTENTS1 = ((params.containsKey("SEG_CONTENTS1")) ? (String[])params.get("SEG_CONTENTS1") : (String[])null);
		String[] SEG_CONTENTS1_name = ((params.containsKey("SEG_CONTENTS1_name")) ? (String[])params.get("SEG_CONTENTS1_name") : (String[])null);
		String[] SEG_CONTENTS1_val = ((params.containsKey("SEG_CONTENTS1_val")) ? (String[])params.get("SEG_CONTENTS1_val") : (String[])null);
		String[] SEG_CONTENTS2 = ((params.containsKey("SEG_CONTENTS2")) ? (String[])params.get("SEG_CONTENTS2") : (String[])null);
		String[] SEG_CONTENTS2_name = ((params.containsKey("SEG_CONTENTS2_name")) ? (String[])params.get("SEG_CONTENTS2_name") : (String[])null);
		String[] SEG_CONTENTS2_val = ((params.containsKey("SEG_CONTENTS2_val")) ? (String[])params.get("SEG_CONTENTS2_val") : (String[])null);
		String[] SEG_CONTENTS3 = ((params.containsKey("SEG_CONTENTS3")) ? (String[])params.get("SEG_CONTENTS3") : (String[])null);
		String[] SEG_CONTENTS3_name = ((params.containsKey("SEG_CONTENTS3_name")) ? (String[])params.get("SEG_CONTENTS3_name") : (String[])null);
		String[] SEG_CONTENTS3_val = ((params.containsKey("SEG_CONTENTS3_val")) ? (String[])params.get("SEG_CONTENTS3_val") : (String[])null);
		String[] SEG_CONTENTS4 = ((params.containsKey("SEG_CONTENTS4")) ? (String[])params.get("SEG_CONTENTS4") : (String[])null);
		String[] SEG_CONTENTS4_name = ((params.containsKey("SEG_CONTENTS4_name")) ? (String[])params.get("SEG_CONTENTS4_name") : (String[])null);
		String[] SEG_CONTENTS4_val = ((params.containsKey("SEG_CONTENTS4_val")) ? (String[])params.get("SEG_CONTENTS4_val") : (String[])null);

		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setHIGH_LEVEL_NO( ((HIGH_LEVEL_NO == null) ? (String)null : HIGH_LEVEL_NO[0]) );
		struct.setList_HIGH_LEVEL_NO(TypeConverter.convert(HIGH_LEVEL_NO));
		if( (ISSUE_TYP == null)||("".equals(ISSUE_TYP[0])) ) {
		   struct.setISSUE_TYP( (Integer)null );
		} else {
		   struct.setISSUE_TYP( new Integer(ISSUE_TYP[0]) );
		   struct.setList_ISSUE_TYP(TypeConverter.convert(ISSUE_TYP));
		}
		struct.setISSUE_TYP_name( ((ISSUE_TYP_name == null) ? (String)null : ISSUE_TYP_name[0]) );
		struct.setList_ISSUE_TYP_name(TypeConverter.convert(ISSUE_TYP_name));
		struct.setISSUE_TYP_val( ((ISSUE_TYP_val == null) ? (String)null : ISSUE_TYP_val[0]) );
		struct.setList_ISSUE_TYP_val(TypeConverter.convert(ISSUE_TYP_val));
		if( (OUTSIDE_TYP == null)||("".equals(OUTSIDE_TYP[0])) ) {
		   struct.setOUTSIDE_TYP( (Integer)null );
		} else {
		   struct.setOUTSIDE_TYP( new Integer(OUTSIDE_TYP[0]) );
		   struct.setList_OUTSIDE_TYP(TypeConverter.convert(OUTSIDE_TYP));
		}
		struct.setOUTSIDE_TYP_name( ((OUTSIDE_TYP_name == null) ? (String)null : OUTSIDE_TYP_name[0]) );
		struct.setList_OUTSIDE_TYP_name(TypeConverter.convert(OUTSIDE_TYP_name));
		struct.setOUTSIDE_TYP_val( ((OUTSIDE_TYP_val == null) ? (String)null : OUTSIDE_TYP_val[0]) );
		struct.setList_OUTSIDE_TYP_val(TypeConverter.convert(OUTSIDE_TYP_val));
		if( (STOCK_UNIT_FLG == null)||("".equals(STOCK_UNIT_FLG[0])) ) {
		   struct.setSTOCK_UNIT_FLG( (Integer)null );
		} else {
		   struct.setSTOCK_UNIT_FLG( new Integer(STOCK_UNIT_FLG[0]) );
		   struct.setList_STOCK_UNIT_FLG(TypeConverter.convert(STOCK_UNIT_FLG));
		}
		struct.setSTOCK_UNIT_FLG_name( ((STOCK_UNIT_FLG_name == null) ? (String)null : STOCK_UNIT_FLG_name[0]) );
		struct.setList_STOCK_UNIT_FLG_name(TypeConverter.convert(STOCK_UNIT_FLG_name));
		struct.setSTOCK_UNIT_FLG_val( ((STOCK_UNIT_FLG_val == null) ? (String)null : STOCK_UNIT_FLG_val[0]) );
		struct.setList_STOCK_UNIT_FLG_val(TypeConverter.convert(STOCK_UNIT_FLG_val));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setPKG_UNIT( ((PKG_UNIT == null) ? (String)null : PKG_UNIT[0]) );
		struct.setList_PKG_UNIT(TypeConverter.convert(PKG_UNIT));
		struct.setPKG_UNIT_QTY( ((PKG_UNIT_QTY == null) ? (String)null : PKG_UNIT_QTY[0]) );
		struct.setList_PKG_UNIT_QTY(TypeConverter.convert(PKG_UNIT_QTY));
		if( (UNIT_QTY_TYP == null)||("".equals(UNIT_QTY_TYP[0])) ) {
		   struct.setUNIT_QTY_TYP( (Integer)null );
		} else {
		   struct.setUNIT_QTY_TYP( new Integer(UNIT_QTY_TYP[0]) );
		   struct.setList_UNIT_QTY_TYP(TypeConverter.convert(UNIT_QTY_TYP));
		}
		struct.setUNIT_QTY_TYP_name( ((UNIT_QTY_TYP_name == null) ? (String)null : UNIT_QTY_TYP_name[0]) );
		struct.setList_UNIT_QTY_TYP_name(TypeConverter.convert(UNIT_QTY_TYP_name));
		struct.setUNIT_QTY_TYP_val( ((UNIT_QTY_TYP_val == null) ? (String)null : UNIT_QTY_TYP_val[0]) );
		struct.setList_UNIT_QTY_TYP_val(TypeConverter.convert(UNIT_QTY_TYP_val));
		struct.setODR_LT( ((ODR_LT == null) ? (String)null : ODR_LT[0]) );
		struct.setList_ODR_LT(TypeConverter.convert(ODR_LT));
		struct.setISSUE_LT( ((ISSUE_LT == null) ? (String)null : ISSUE_LT[0]) );
		struct.setList_ISSUE_LT(TypeConverter.convert(ISSUE_LT));
		struct.setFIXED_LT( ((FIXED_LT == null) ? (String)null : FIXED_LT[0]) );
		struct.setList_FIXED_LT(TypeConverter.convert(FIXED_LT));
		struct.setPROP_LOT_SIZE( ((PROP_LOT_SIZE == null) ? (String)null : PROP_LOT_SIZE[0]) );
		struct.setList_PROP_LOT_SIZE(TypeConverter.convert(PROP_LOT_SIZE));
		struct.setPROP_LT( ((PROP_LT == null) ? (String)null : PROP_LT[0]) );
		struct.setList_PROP_LT(TypeConverter.convert(PROP_LT));
		struct.setITEM_SPOIL( ((ITEM_SPOIL == null) ? (String)null : ITEM_SPOIL[0]) );
		struct.setList_ITEM_SPOIL(TypeConverter.convert(ITEM_SPOIL));
		struct.setSAFETY_LT( ((SAFETY_LT == null) ? (String)null : SAFETY_LT[0]) );
		struct.setList_SAFETY_LT(TypeConverter.convert(SAFETY_LT));
		struct.setSAFETY_STOCK( ((SAFETY_STOCK == null) ? (String)null : SAFETY_STOCK[0]) );
		struct.setList_SAFETY_STOCK(TypeConverter.convert(SAFETY_STOCK));
		if( (MRP_ODR_TYP == null)||("".equals(MRP_ODR_TYP[0])) ) {
		   struct.setMRP_ODR_TYP( (Integer)null );
		} else {
		   struct.setMRP_ODR_TYP( new Integer(MRP_ODR_TYP[0]) );
		   struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		}
		struct.setMRP_ODR_TYP_name( ((MRP_ODR_TYP_name == null) ? (String)null : MRP_ODR_TYP_name[0]) );
		struct.setList_MRP_ODR_TYP_name(TypeConverter.convert(MRP_ODR_TYP_name));
		struct.setMRP_ODR_TYP_val( ((MRP_ODR_TYP_val == null) ? (String)null : MRP_ODR_TYP_val[0]) );
		struct.setList_MRP_ODR_TYP_val(TypeConverter.convert(MRP_ODR_TYP_val));
		if( (LOT_SIZING_TYP == null)||("".equals(LOT_SIZING_TYP[0])) ) {
		   struct.setLOT_SIZING_TYP( (Integer)null );
		} else {
		   struct.setLOT_SIZING_TYP( new Integer(LOT_SIZING_TYP[0]) );
		   struct.setList_LOT_SIZING_TYP(TypeConverter.convert(LOT_SIZING_TYP));
		}
		struct.setMAX_PERIOD( ((MAX_PERIOD == null) ? (String)null : MAX_PERIOD[0]) );
		struct.setList_MAX_PERIOD(TypeConverter.convert(MAX_PERIOD));
		struct.setFIXED_ODR_QTY( ((FIXED_ODR_QTY == null) ? (String)null : FIXED_ODR_QTY[0]) );
		struct.setList_FIXED_ODR_QTY(TypeConverter.convert(FIXED_ODR_QTY));
		struct.setMAX_ODR_QTY( ((MAX_ODR_QTY == null) ? (String)null : MAX_ODR_QTY[0]) );
		struct.setList_MAX_ODR_QTY(TypeConverter.convert(MAX_ODR_QTY));
		struct.setMIN_ODR_QTY( ((MIN_ODR_QTY == null) ? (String)null : MIN_ODR_QTY[0]) );
		struct.setList_MIN_ODR_QTY(TypeConverter.convert(MIN_ODR_QTY));
		struct.setODR_POINT( ((ODR_POINT == null) ? (String)null : ODR_POINT[0]) );
		struct.setList_ODR_POINT(TypeConverter.convert(ODR_POINT));
		struct.setMUL_ODR_QTY( ((MUL_ODR_QTY == null) ? (String)null : MUL_ODR_QTY[0]) );
		struct.setList_MUL_ODR_QTY(TypeConverter.convert(MUL_ODR_QTY));
		if( (MPS_FLG == null)||("".equals(MPS_FLG[0])) ) {
		   struct.setMPS_FLG( (Integer)null );
		} else {
		   struct.setMPS_FLG( new Integer(MPS_FLG[0]) );
		   struct.setList_MPS_FLG(TypeConverter.convert(MPS_FLG));
		}
		if( (ACPT_INSPC_TYP == null)||("".equals(ACPT_INSPC_TYP[0])) ) {
		   struct.setACPT_INSPC_TYP( (Integer)null );
		} else {
		   struct.setACPT_INSPC_TYP( new Integer(ACPT_INSPC_TYP[0]) );
		   struct.setList_ACPT_INSPC_TYP(TypeConverter.convert(ACPT_INSPC_TYP));
		}
		struct.setACPT_INSPC_TYP_name( ((ACPT_INSPC_TYP_name == null) ? (String)null : ACPT_INSPC_TYP_name[0]) );
		struct.setList_ACPT_INSPC_TYP_name(TypeConverter.convert(ACPT_INSPC_TYP_name));
		struct.setACPT_INSPC_TYP_val( ((ACPT_INSPC_TYP_val == null) ? (String)null : ACPT_INSPC_TYP_val[0]) );
		struct.setList_ACPT_INSPC_TYP_val(TypeConverter.convert(ACPT_INSPC_TYP_val));
		if( (PRODUCT_TYP == null)||("".equals(PRODUCT_TYP[0])) ) {
		   struct.setPRODUCT_TYP( (Integer)null );
		} else {
		   struct.setPRODUCT_TYP( new Integer(PRODUCT_TYP[0]) );
		   struct.setList_PRODUCT_TYP(TypeConverter.convert(PRODUCT_TYP));
		}
		struct.setPRODUCT_TYP_name( ((PRODUCT_TYP_name == null) ? (String)null : PRODUCT_TYP_name[0]) );
		struct.setList_PRODUCT_TYP_name(TypeConverter.convert(PRODUCT_TYP_name));
		struct.setPRODUCT_TYP_val( ((PRODUCT_TYP_val == null) ? (String)null : PRODUCT_TYP_val[0]) );
		struct.setList_PRODUCT_TYP_val(TypeConverter.convert(PRODUCT_TYP_val));
		struct.setCLASIFICATION_CD( ((CLASIFICATION_CD == null) ? (String)null : CLASIFICATION_CD[0]) );
		struct.setList_CLASIFICATION_CD(TypeConverter.convert(CLASIFICATION_CD));
		struct.setUNIT_WEIGHT( ((UNIT_WEIGHT == null) ? (String)null : UNIT_WEIGHT[0]) );
		struct.setList_UNIT_WEIGHT(TypeConverter.convert(UNIT_WEIGHT));
		if( (ABC_TYP == null)||("".equals(ABC_TYP[0])) ) {
		   struct.setABC_TYP( (Integer)null );
		} else {
		   struct.setABC_TYP( new Integer(ABC_TYP[0]) );
		   struct.setList_ABC_TYP(TypeConverter.convert(ABC_TYP));
		}
		struct.setABC_TYP_name( ((ABC_TYP_name == null) ? (String)null : ABC_TYP_name[0]) );
		struct.setList_ABC_TYP_name(TypeConverter.convert(ABC_TYP_name));
		struct.setABC_TYP_val( ((ABC_TYP_val == null) ? (String)null : ABC_TYP_val[0]) );
		struct.setList_ABC_TYP_val(TypeConverter.convert(ABC_TYP_val));
		if( (OPR_RSLT_TYP == null)||("".equals(OPR_RSLT_TYP[0])) ) {
		   struct.setOPR_RSLT_TYP( (Integer)null );
		} else {
		   struct.setOPR_RSLT_TYP( new Integer(OPR_RSLT_TYP[0]) );
		   struct.setList_OPR_RSLT_TYP(TypeConverter.convert(OPR_RSLT_TYP));
		}
		struct.setOPR_RSLT_TYP_name( ((OPR_RSLT_TYP_name == null) ? (String)null : OPR_RSLT_TYP_name[0]) );
		struct.setList_OPR_RSLT_TYP_name(TypeConverter.convert(OPR_RSLT_TYP_name));
		struct.setOPR_RSLT_TYP_val( ((OPR_RSLT_TYP_val == null) ? (String)null : OPR_RSLT_TYP_val[0]) );
		struct.setList_OPR_RSLT_TYP_val(TypeConverter.convert(OPR_RSLT_TYP_val));
		if( (SPL_ITEM_TYP == null)||("".equals(SPL_ITEM_TYP[0])) ) {
		   struct.setSPL_ITEM_TYP( (Integer)null );
		} else {
		   struct.setSPL_ITEM_TYP( new Integer(SPL_ITEM_TYP[0]) );
		   struct.setList_SPL_ITEM_TYP(TypeConverter.convert(SPL_ITEM_TYP));
		}
		struct.setSPL_ITEM_TYP_name( ((SPL_ITEM_TYP_name == null) ? (String)null : SPL_ITEM_TYP_name[0]) );
		struct.setList_SPL_ITEM_TYP_name(TypeConverter.convert(SPL_ITEM_TYP_name));
		struct.setSPL_ITEM_TYP_val( ((SPL_ITEM_TYP_val == null) ? (String)null : SPL_ITEM_TYP_val[0]) );
		struct.setList_SPL_ITEM_TYP_val(TypeConverter.convert(SPL_ITEM_TYP_val));
		struct.setTAX_CD( ((TAX_CD == null) ? (String)null : TAX_CD[0]) );
		struct.setList_TAX_CD(TypeConverter.convert(TAX_CD));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setTAX_NAME( ((TAX_NAME == null) ? (String)null : TAX_NAME[0]) );
		struct.setList_TAX_NAME(TypeConverter.convert(TAX_NAME));
		struct.setLOT_SIZING_TYP_name( ((LOT_SIZING_TYP_name == null) ? (String)null : LOT_SIZING_TYP_name[0]) );
		struct.setList_LOT_SIZING_TYP_name(TypeConverter.convert(LOT_SIZING_TYP_name));
		struct.setLOT_SIZING_TYP_val( ((LOT_SIZING_TYP_val == null) ? (String)null : LOT_SIZING_TYP_val[0]) );
		struct.setList_LOT_SIZING_TYP_val(TypeConverter.convert(LOT_SIZING_TYP_val));
		struct.setMPS_FLG_name( ((MPS_FLG_name == null) ? (String)null : MPS_FLG_name[0]) );
		struct.setList_MPS_FLG_name(TypeConverter.convert(MPS_FLG_name));
		struct.setMPS_FLG_val( ((MPS_FLG_val == null) ? (String)null : MPS_FLG_val[0]) );
		struct.setList_MPS_FLG_val(TypeConverter.convert(MPS_FLG_val));
		struct.seth_ITEM_CD( ((h_ITEM_CD == null) ? (String)null : h_ITEM_CD[0]) );
		struct.setList_h_ITEM_CD(TypeConverter.convert(h_ITEM_CD));
		struct.setSTOCK_UNIT_name( ((STOCK_UNIT_name == null) ? (String)null : STOCK_UNIT_name[0]) );
		struct.setList_STOCK_UNIT_name(TypeConverter.convert(STOCK_UNIT_name));
		struct.setSTOCK_UNIT_val( ((STOCK_UNIT_val == null) ? (String)null : STOCK_UNIT_val[0]) );
		struct.setList_STOCK_UNIT_val(TypeConverter.convert(STOCK_UNIT_val));
		if( (CAL_NO == null)||("".equals(CAL_NO[0])) ) {
		   struct.setCAL_NO( (Integer)null );
		} else {
		   struct.setCAL_NO( new Integer(CAL_NO[0]) );
		   struct.setList_CAL_NO(TypeConverter.convert(CAL_NO));
		}
		struct.setCAL_NAME( ((CAL_NAME == null) ? (String)null : CAL_NAME[0]) );
		struct.setList_CAL_NAME(TypeConverter.convert(CAL_NAME));
		struct.setITEM_CLASS_01_TYP( ((ITEM_CLASS_01_TYP == null) ? (String)null : ITEM_CLASS_01_TYP[0]) );
		struct.setList_ITEM_CLASS_01_TYP(TypeConverter.convert(ITEM_CLASS_01_TYP));
		struct.setITEM_CLASS_01_CD( ((ITEM_CLASS_01_CD == null) ? (String)null : ITEM_CLASS_01_CD[0]) );
		struct.setList_ITEM_CLASS_01_CD(TypeConverter.convert(ITEM_CLASS_01_CD));
		struct.setITEM_CLASS_01_NAME( ((ITEM_CLASS_01_NAME == null) ? (String)null : ITEM_CLASS_01_NAME[0]) );
		struct.setList_ITEM_CLASS_01_NAME(TypeConverter.convert(ITEM_CLASS_01_NAME));
		struct.setITEM_CLASS_02_TYP( ((ITEM_CLASS_02_TYP == null) ? (String)null : ITEM_CLASS_02_TYP[0]) );
		struct.setList_ITEM_CLASS_02_TYP(TypeConverter.convert(ITEM_CLASS_02_TYP));
		struct.setITEM_CLASS_02_CD( ((ITEM_CLASS_02_CD == null) ? (String)null : ITEM_CLASS_02_CD[0]) );
		struct.setList_ITEM_CLASS_02_CD(TypeConverter.convert(ITEM_CLASS_02_CD));
		struct.setITEM_CLASS_02_NAME( ((ITEM_CLASS_02_NAME == null) ? (String)null : ITEM_CLASS_02_NAME[0]) );
		struct.setList_ITEM_CLASS_02_NAME(TypeConverter.convert(ITEM_CLASS_02_NAME));
		struct.setITEM_CLASS_03_TYP( ((ITEM_CLASS_03_TYP == null) ? (String)null : ITEM_CLASS_03_TYP[0]) );
		struct.setList_ITEM_CLASS_03_TYP(TypeConverter.convert(ITEM_CLASS_03_TYP));
		struct.setITEM_CLASS_03_CD( ((ITEM_CLASS_03_CD == null) ? (String)null : ITEM_CLASS_03_CD[0]) );
		struct.setList_ITEM_CLASS_03_CD(TypeConverter.convert(ITEM_CLASS_03_CD));
		struct.setITEM_CLASS_03_NAME( ((ITEM_CLASS_03_NAME == null) ? (String)null : ITEM_CLASS_03_NAME[0]) );
		struct.setList_ITEM_CLASS_03_NAME(TypeConverter.convert(ITEM_CLASS_03_NAME));
		struct.setITEM_CLASS_04_TYP( ((ITEM_CLASS_04_TYP == null) ? (String)null : ITEM_CLASS_04_TYP[0]) );
		struct.setList_ITEM_CLASS_04_TYP(TypeConverter.convert(ITEM_CLASS_04_TYP));
		struct.setITEM_CLASS_04_CD( ((ITEM_CLASS_04_CD == null) ? (String)null : ITEM_CLASS_04_CD[0]) );
		struct.setList_ITEM_CLASS_04_CD(TypeConverter.convert(ITEM_CLASS_04_CD));
		struct.setITEM_CLASS_04_NAME( ((ITEM_CLASS_04_NAME == null) ? (String)null : ITEM_CLASS_04_NAME[0]) );
		struct.setList_ITEM_CLASS_04_NAME(TypeConverter.convert(ITEM_CLASS_04_NAME));
		struct.setITEM_CLASS_05_TYP( ((ITEM_CLASS_05_TYP == null) ? (String)null : ITEM_CLASS_05_TYP[0]) );
		struct.setList_ITEM_CLASS_05_TYP(TypeConverter.convert(ITEM_CLASS_05_TYP));
		struct.setITEM_CLASS_05_CD( ((ITEM_CLASS_05_CD == null) ? (String)null : ITEM_CLASS_05_CD[0]) );
		struct.setList_ITEM_CLASS_05_CD(TypeConverter.convert(ITEM_CLASS_05_CD));
		struct.setITEM_CLASS_05_NAME( ((ITEM_CLASS_05_NAME == null) ? (String)null : ITEM_CLASS_05_NAME[0]) );
		struct.setList_ITEM_CLASS_05_NAME(TypeConverter.convert(ITEM_CLASS_05_NAME));
		struct.setITEM_CLASS_06_TYP( ((ITEM_CLASS_06_TYP == null) ? (String)null : ITEM_CLASS_06_TYP[0]) );
		struct.setList_ITEM_CLASS_06_TYP(TypeConverter.convert(ITEM_CLASS_06_TYP));
		struct.setITEM_CLASS_06_CD( ((ITEM_CLASS_06_CD == null) ? (String)null : ITEM_CLASS_06_CD[0]) );
		struct.setList_ITEM_CLASS_06_CD(TypeConverter.convert(ITEM_CLASS_06_CD));
		struct.setITEM_CLASS_06_NAME( ((ITEM_CLASS_06_NAME == null) ? (String)null : ITEM_CLASS_06_NAME[0]) );
		struct.setList_ITEM_CLASS_06_NAME(TypeConverter.convert(ITEM_CLASS_06_NAME));
		struct.setITEM_CLASS_07_TYP( ((ITEM_CLASS_07_TYP == null) ? (String)null : ITEM_CLASS_07_TYP[0]) );
		struct.setList_ITEM_CLASS_07_TYP(TypeConverter.convert(ITEM_CLASS_07_TYP));
		struct.setITEM_CLASS_07_CD( ((ITEM_CLASS_07_CD == null) ? (String)null : ITEM_CLASS_07_CD[0]) );
		struct.setList_ITEM_CLASS_07_CD(TypeConverter.convert(ITEM_CLASS_07_CD));
		struct.setITEM_CLASS_07_NAME( ((ITEM_CLASS_07_NAME == null) ? (String)null : ITEM_CLASS_07_NAME[0]) );
		struct.setList_ITEM_CLASS_07_NAME(TypeConverter.convert(ITEM_CLASS_07_NAME));
		struct.setITEM_CLASS_08_TYP( ((ITEM_CLASS_08_TYP == null) ? (String)null : ITEM_CLASS_08_TYP[0]) );
		struct.setList_ITEM_CLASS_08_TYP(TypeConverter.convert(ITEM_CLASS_08_TYP));
		struct.setITEM_CLASS_08_CD( ((ITEM_CLASS_08_CD == null) ? (String)null : ITEM_CLASS_08_CD[0]) );
		struct.setList_ITEM_CLASS_08_CD(TypeConverter.convert(ITEM_CLASS_08_CD));
		struct.setITEM_CLASS_08_NAME( ((ITEM_CLASS_08_NAME == null) ? (String)null : ITEM_CLASS_08_NAME[0]) );
		struct.setList_ITEM_CLASS_08_NAME(TypeConverter.convert(ITEM_CLASS_08_NAME));
		struct.setITEM_CLASS_09_TYP( ((ITEM_CLASS_09_TYP == null) ? (String)null : ITEM_CLASS_09_TYP[0]) );
		struct.setList_ITEM_CLASS_09_TYP(TypeConverter.convert(ITEM_CLASS_09_TYP));
		struct.setITEM_CLASS_09_CD( ((ITEM_CLASS_09_CD == null) ? (String)null : ITEM_CLASS_09_CD[0]) );
		struct.setList_ITEM_CLASS_09_CD(TypeConverter.convert(ITEM_CLASS_09_CD));
		struct.setITEM_CLASS_09_NAME( ((ITEM_CLASS_09_NAME == null) ? (String)null : ITEM_CLASS_09_NAME[0]) );
		struct.setList_ITEM_CLASS_09_NAME(TypeConverter.convert(ITEM_CLASS_09_NAME));
		struct.setITEM_CLASS_10_TYP( ((ITEM_CLASS_10_TYP == null) ? (String)null : ITEM_CLASS_10_TYP[0]) );
		struct.setList_ITEM_CLASS_10_TYP(TypeConverter.convert(ITEM_CLASS_10_TYP));
		struct.setITEM_CLASS_10_CD( ((ITEM_CLASS_10_CD == null) ? (String)null : ITEM_CLASS_10_CD[0]) );
		struct.setList_ITEM_CLASS_10_CD(TypeConverter.convert(ITEM_CLASS_10_CD));
		struct.setITEM_CLASS_10_NAME( ((ITEM_CLASS_10_NAME == null) ? (String)null : ITEM_CLASS_10_NAME[0]) );
		struct.setList_ITEM_CLASS_10_NAME(TypeConverter.convert(ITEM_CLASS_10_NAME));
		struct.setITEM_CLASS_11_TYP( ((ITEM_CLASS_11_TYP == null) ? (String)null : ITEM_CLASS_11_TYP[0]) );
		struct.setList_ITEM_CLASS_11_TYP(TypeConverter.convert(ITEM_CLASS_11_TYP));
		struct.setITEM_CLASS_11_CD( ((ITEM_CLASS_11_CD == null) ? (String)null : ITEM_CLASS_11_CD[0]) );
		struct.setList_ITEM_CLASS_11_CD(TypeConverter.convert(ITEM_CLASS_11_CD));
		struct.setITEM_CLASS_11_NAME( ((ITEM_CLASS_11_NAME == null) ? (String)null : ITEM_CLASS_11_NAME[0]) );
		struct.setList_ITEM_CLASS_11_NAME(TypeConverter.convert(ITEM_CLASS_11_NAME));
		struct.setITEM_CLASS_12_TYP( ((ITEM_CLASS_12_TYP == null) ? (String)null : ITEM_CLASS_12_TYP[0]) );
		struct.setList_ITEM_CLASS_12_TYP(TypeConverter.convert(ITEM_CLASS_12_TYP));
		struct.setITEM_CLASS_12_CD( ((ITEM_CLASS_12_CD == null) ? (String)null : ITEM_CLASS_12_CD[0]) );
		struct.setList_ITEM_CLASS_12_CD(TypeConverter.convert(ITEM_CLASS_12_CD));
		struct.setITEM_CLASS_12_NAME( ((ITEM_CLASS_12_NAME == null) ? (String)null : ITEM_CLASS_12_NAME[0]) );
		struct.setList_ITEM_CLASS_12_NAME(TypeConverter.convert(ITEM_CLASS_12_NAME));
		if( (DEPO_TYP == null)||("".equals(DEPO_TYP[0])) ) {
		   struct.setDEPO_TYP( (Integer)null );
		} else {
		   struct.setDEPO_TYP( new Integer(DEPO_TYP[0]) );
		   struct.setList_DEPO_TYP(TypeConverter.convert(DEPO_TYP));
		}
		struct.setDEPO_TYP_name( ((DEPO_TYP_name == null) ? (String)null : DEPO_TYP_name[0]) );
		struct.setList_DEPO_TYP_name(TypeConverter.convert(DEPO_TYP_name));
		struct.setDEPO_TYP_val( ((DEPO_TYP_val == null) ? (String)null : DEPO_TYP_val[0]) );
		struct.setList_DEPO_TYP_val(TypeConverter.convert(DEPO_TYP_val));
		struct.setBEST_BEFORE_YEAR( ((BEST_BEFORE_YEAR == null) ? (String)null : BEST_BEFORE_YEAR[0]) );
		struct.setList_BEST_BEFORE_YEAR(TypeConverter.convert(BEST_BEFORE_YEAR));
		if( (LOT_CTRL_FLG == null)||("".equals(LOT_CTRL_FLG[0])) ) {
		   struct.setLOT_CTRL_FLG( (Integer)null );
		} else {
		   struct.setLOT_CTRL_FLG( new Integer(LOT_CTRL_FLG[0]) );
		   struct.setList_LOT_CTRL_FLG(TypeConverter.convert(LOT_CTRL_FLG));
		}
		struct.setLOT_CTRL_FLG_name( ((LOT_CTRL_FLG_name == null) ? (String)null : LOT_CTRL_FLG_name[0]) );
		struct.setList_LOT_CTRL_FLG_name(TypeConverter.convert(LOT_CTRL_FLG_name));
		struct.setLOT_CTRL_FLG_val( ((LOT_CTRL_FLG_val == null) ? (String)null : LOT_CTRL_FLG_val[0]) );
		struct.setList_LOT_CTRL_FLG_val(TypeConverter.convert(LOT_CTRL_FLG_val));
		struct.setBEST_BEFORE_MONTH( ((BEST_BEFORE_MONTH == null) ? (String)null : BEST_BEFORE_MONTH[0]) );
		struct.setList_BEST_BEFORE_MONTH(TypeConverter.convert(BEST_BEFORE_MONTH));
		if( (LOT_NUMBERING_TYP == null)||("".equals(LOT_NUMBERING_TYP[0])) ) {
		   struct.setLOT_NUMBERING_TYP( (Integer)null );
		} else {
		   struct.setLOT_NUMBERING_TYP( new Integer(LOT_NUMBERING_TYP[0]) );
		   struct.setList_LOT_NUMBERING_TYP(TypeConverter.convert(LOT_NUMBERING_TYP));
		}
		struct.setLOT_NUMBERING_TYP_name( ((LOT_NUMBERING_TYP_name == null) ? (String)null : LOT_NUMBERING_TYP_name[0]) );
		struct.setList_LOT_NUMBERING_TYP_name(TypeConverter.convert(LOT_NUMBERING_TYP_name));
		struct.setLOT_NUMBERING_TYP_val( ((LOT_NUMBERING_TYP_val == null) ? (String)null : LOT_NUMBERING_TYP_val[0]) );
		struct.setList_LOT_NUMBERING_TYP_val(TypeConverter.convert(LOT_NUMBERING_TYP_val));
		struct.setBEST_BEFORE_DAY( ((BEST_BEFORE_DAY == null) ? (String)null : BEST_BEFORE_DAY[0]) );
		struct.setList_BEST_BEFORE_DAY(TypeConverter.convert(BEST_BEFORE_DAY));
		struct.setREMARK1( ((REMARK1 == null) ? (String)null : REMARK1[0]) );
		struct.setList_REMARK1(TypeConverter.convert(REMARK1));
		struct.setREMARK2( ((REMARK2 == null) ? (String)null : REMARK2[0]) );
		struct.setList_REMARK2(TypeConverter.convert(REMARK2));
		if( (MANHOUR_TYP == null)||("".equals(MANHOUR_TYP[0])) ) {
		   struct.setMANHOUR_TYP( (Integer)null );
		} else {
		   struct.setMANHOUR_TYP( new Integer(MANHOUR_TYP[0]) );
		   struct.setList_MANHOUR_TYP(TypeConverter.convert(MANHOUR_TYP));
		}
		struct.setMANHOUR_TYP_name( ((MANHOUR_TYP_name == null) ? (String)null : MANHOUR_TYP_name[0]) );
		struct.setList_MANHOUR_TYP_name(TypeConverter.convert(MANHOUR_TYP_name));
		struct.setMANHOUR_TYP_val( ((MANHOUR_TYP_val == null) ? (String)null : MANHOUR_TYP_val[0]) );
		struct.setList_MANHOUR_TYP_val(TypeConverter.convert(MANHOUR_TYP_val));
		struct.seth_APR_ITEM( ((h_APR_ITEM == null) ? (String)null : h_APR_ITEM[0]) );
		struct.setList_h_APR_ITEM(TypeConverter.convert(h_APR_ITEM));
		struct.seth_SCREENMOVE_TYP( ((h_SCREENMOVE_TYP == null) ? (String)null : h_SCREENMOVE_TYP[0]) );
		struct.setList_h_SCREENMOVE_TYP(TypeConverter.convert(h_SCREENMOVE_TYP));
		struct.seth_APPR_ID( ((h_APPR_ID == null) ? (String)null : h_APPR_ID[0]) );
		struct.setList_h_APPR_ID(TypeConverter.convert(h_APPR_ID));
		struct.setAPPR_REMARKS( ((APPR_REMARKS == null) ? (String)null : APPR_REMARKS[0]) );
		struct.setList_APPR_REMARKS(TypeConverter.convert(APPR_REMARKS));
		struct.setDEPT_CD( ((DEPT_CD == null) ? (String)null : DEPT_CD[0]) );
		struct.setList_DEPT_CD(TypeConverter.convert(DEPT_CD));
		struct.setDEPT_NAME( ((DEPT_NAME == null) ? (String)null : DEPT_NAME[0]) );
		struct.setList_DEPT_NAME(TypeConverter.convert(DEPT_NAME));
		struct.setPJ_CD( ((PJ_CD == null) ? (String)null : PJ_CD[0]) );
		struct.setList_PJ_CD(TypeConverter.convert(PJ_CD));
		struct.setPJ_CD_name( ((PJ_CD_name == null) ? (String)null : PJ_CD_name[0]) );
		struct.setList_PJ_CD_name(TypeConverter.convert(PJ_CD_name));
		struct.setPJ_CD_val( ((PJ_CD_val == null) ? (String)null : PJ_CD_val[0]) );
		struct.setList_PJ_CD_val(TypeConverter.convert(PJ_CD_val));
		struct.setSEG_CONTENTS1( ((SEG_CONTENTS1 == null) ? (String)null : SEG_CONTENTS1[0]) );
		struct.setList_SEG_CONTENTS1(TypeConverter.convert(SEG_CONTENTS1));
		struct.setSEG_CONTENTS1_name( ((SEG_CONTENTS1_name == null) ? (String)null : SEG_CONTENTS1_name[0]) );
		struct.setList_SEG_CONTENTS1_name(TypeConverter.convert(SEG_CONTENTS1_name));
		struct.setSEG_CONTENTS1_val( ((SEG_CONTENTS1_val == null) ? (String)null : SEG_CONTENTS1_val[0]) );
		struct.setList_SEG_CONTENTS1_val(TypeConverter.convert(SEG_CONTENTS1_val));
		struct.setSEG_CONTENTS2( ((SEG_CONTENTS2 == null) ? (String)null : SEG_CONTENTS2[0]) );
		struct.setList_SEG_CONTENTS2(TypeConverter.convert(SEG_CONTENTS2));
		struct.setSEG_CONTENTS2_name( ((SEG_CONTENTS2_name == null) ? (String)null : SEG_CONTENTS2_name[0]) );
		struct.setList_SEG_CONTENTS2_name(TypeConverter.convert(SEG_CONTENTS2_name));
		struct.setSEG_CONTENTS2_val( ((SEG_CONTENTS2_val == null) ? (String)null : SEG_CONTENTS2_val[0]) );
		struct.setList_SEG_CONTENTS2_val(TypeConverter.convert(SEG_CONTENTS2_val));
		struct.setSEG_CONTENTS3( ((SEG_CONTENTS3 == null) ? (String)null : SEG_CONTENTS3[0]) );
		struct.setList_SEG_CONTENTS3(TypeConverter.convert(SEG_CONTENTS3));
		struct.setSEG_CONTENTS3_name( ((SEG_CONTENTS3_name == null) ? (String)null : SEG_CONTENTS3_name[0]) );
		struct.setList_SEG_CONTENTS3_name(TypeConverter.convert(SEG_CONTENTS3_name));
		struct.setSEG_CONTENTS3_val( ((SEG_CONTENTS3_val == null) ? (String)null : SEG_CONTENTS3_val[0]) );
		struct.setList_SEG_CONTENTS3_val(TypeConverter.convert(SEG_CONTENTS3_val));
		struct.setSEG_CONTENTS4( ((SEG_CONTENTS4 == null) ? (String)null : SEG_CONTENTS4[0]) );
		struct.setList_SEG_CONTENTS4(TypeConverter.convert(SEG_CONTENTS4));
		struct.setSEG_CONTENTS4_name( ((SEG_CONTENTS4_name == null) ? (String)null : SEG_CONTENTS4_name[0]) );
		struct.setList_SEG_CONTENTS4_name(TypeConverter.convert(SEG_CONTENTS4_name));
		struct.setSEG_CONTENTS4_val( ((SEG_CONTENTS4_val == null) ? (String)null : SEG_CONTENTS4_val[0]) );
		struct.setList_SEG_CONTENTS4_val(TypeConverter.convert(SEG_CONTENTS4_val));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0010010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAA0010010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAA0010010Struct";   // JSP先のバインド名(Struct)の指定
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
					AA0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0010010Entity entity = control.entity;
		AA0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0010010Control control;
		AA0010010Entity  entity = null;
		AA0010010Struct  struct = null;

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

			if( (control = (AA0010010Control)so.getAttribute("AA0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0010010Control();
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
				if( isClick(request, "select") ) {
					if ( !isCryptical(request, so, params, "select") ) return ERROR_TARGET;
					target = onClickselect(request, response, so, params, control);
					control.setButton("select");
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "delete") ) {
					if ( !isCryptical(request, so, params, "delete") ) return ERROR_TARGET;
					target = onClickdelete(request, response, so, params, control);
					control.setButton("delete");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0010010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>

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
				if((isClick(request, "select") && bFLG_DISCONNECT_select)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
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
	private  static boolean bFLG_DISCONNECT_select = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_clear = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0010.AA0010010Servlet";
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
	public AA0010010Servlet()
	{
		//{{user_implement_dev:<AA0010010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;

			bFLG_DISCONNECT_select = true;

			bFLG_DISCONNECT_insert = true;

			bFLG_DISCONNECT_update = true;

			bFLG_DISCONNECT_delete = true;

			bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AA0010010_DisConnect_FLG>

		//{{user_implement_dev:<AA0010010Servlet>

                //}}user_implement_dev:<AA0010010Servlet>
	}

	//////////////////////////////

}
