/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0070/src/com/nec/jp/orteus/metamorBase/AA0070/AA0070010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0070;

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
//}}user_implement_dev:header

public class AA0070010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head

	/** 
	 * 画面のチェックボックスのチェック状態を取得して設定する
	 * @param HttpServletRequest request
	 * @param Hashtable params
	 * @param AA0070010Control control
	*/
	private void setCheckBoxStatus(
					HttpServletRequest request,
					Hashtable params,
					AA0070010Struct struct ) throws FoundationException
	{
		String[] checkValue;
		checkValue = ((params.containsKey("ODR_FORM_FLG")) ? (String[])params.get("ODR_FORM_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_FORM_FLG("1");
		}
		else
		{
			struct.setODR_FORM_FLG("0");
		}
		checkValue = ((params.containsKey("ODR_EDI_FLG")) ? (String[])params.get("ODR_EDI_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_EDI_FLG("1");
		}
		else
		{
			struct.setODR_EDI_FLG("0");
		}
		checkValue = ((params.containsKey("ODR_FAX_FLG")) ? (String[])params.get("ODR_FAX_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_FAX_FLG("1");
		}
		else
		{
			struct.setODR_FAX_FLG("0");
		}
		checkValue = ((params.containsKey("ODR_MAIL_FLG")) ? (String[])params.get("ODR_MAIL_FLG") : (String[])null);
		if(checkValue != null && "true".equals(checkValue[0]))
		{
			struct.setODR_MAIL_FLG("1");
		}
		else
		{
			struct.setODR_MAIL_FLG("0");
		}
	}
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
	 * @param control AA0070010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AA0070010Control control)
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
		if (params.containsKey("h_KEY6") && params.containsKey("h_VALUE6")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY6");
			value = (String[]) params.get("h_VALUE6");
			keyvalueMap.put(key[0], value[0]);
		}
		if (params.containsKey("h_KEY7") && params.containsKey("h_VALUE7")) {
			String[] key = null;
			String[] value = null;
			key = (String[]) params.get("h_KEY7");
			value = (String[]) params.get("h_VALUE7");
			keyvalueMap.put(key[0], value[0]);
		}
		control.setKeyvalueMap(keyvalueMap);
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AA0070010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AA0070010Control control)
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
	 * @param control AA0070010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
			logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>

			objMessage.m_writer.write( Level.ALL, "AA0070010"+" $Revision: 1.14 $" );
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0070010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			
			setScreenMoveParams(params, control);
			control.control_eventHandller("reload");
			if(control.isScreenMove()) {
				control.control_eventHandller("select");
			}

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0070010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		try {
			control.control_eventHandller("select");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0070010Controlクラスインスタンス
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
		try {
			// チェックボックス情報を取得設定
			setCheckBoxStatus(request, params, struct);

			control.control_eventHandller("insert");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0070010Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
		try {
			// チェックボックス情報を取得設定
			setCheckBoxStatus(request, params, struct);

			control.control_eventHandller("update");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0070010Controlクラスインスタンス
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
		try {
			control.control_eventHandller("delete");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0070010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0070010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
		try {
			control.control_eventHandller("clear");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0070010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] VEND_KNAME = ((params.containsKey("VEND_KNAME")) ? (String[])params.get("VEND_KNAME") : (String[])null);
		String[] ZIP_CD = ((params.containsKey("ZIP_CD")) ? (String[])params.get("ZIP_CD") : (String[])null);
		String[] ADDRESS_1 = ((params.containsKey("ADDRESS_1")) ? (String[])params.get("ADDRESS_1") : (String[])null);
		String[] ADDRESS_2 = ((params.containsKey("ADDRESS_2")) ? (String[])params.get("ADDRESS_2") : (String[])null);
		String[] ADDRESS_K_1 = ((params.containsKey("ADDRESS_K_1")) ? (String[])params.get("ADDRESS_K_1") : (String[])null);
		String[] ADDRESS_K_2 = ((params.containsKey("ADDRESS_K_2")) ? (String[])params.get("ADDRESS_K_2") : (String[])null);
		String[] TEL = ((params.containsKey("TEL")) ? (String[])params.get("TEL") : (String[])null);
		String[] FAX = ((params.containsKey("FAX")) ? (String[])params.get("FAX") : (String[])null);
		String[] EMAIL = ((params.containsKey("EMAIL")) ? (String[])params.get("EMAIL") : (String[])null);
		String[] VEND_ORG = ((params.containsKey("VEND_ORG")) ? (String[])params.get("VEND_ORG") : (String[])null);
		String[] VEND_PERSON = ((params.containsKey("VEND_PERSON")) ? (String[])params.get("VEND_PERSON") : (String[])null);
		String[] OWN_ORG_CD = ((params.containsKey("OWN_ORG_CD")) ? (String[])params.get("OWN_ORG_CD") : (String[])null);
		String[] OWN_ORG_NAME = ((params.containsKey("OWN_ORG_NAME")) ? (String[])params.get("OWN_ORG_NAME") : (String[])null);
		String[] OWN_PERSON_CD = ((params.containsKey("OWN_PERSON_CD")) ? (String[])params.get("OWN_PERSON_CD") : (String[])null);
		String[] OWN_PERSON_NAME = ((params.containsKey("OWN_PERSON_NAME")) ? (String[])params.get("OWN_PERSON_NAME") : (String[])null);
		String[] ROUND_TYP = ((params.containsKey("ROUND_TYP")) ? (String[])params.get("ROUND_TYP") : (String[])null);
		String[] ROUND_TYP_name = ((params.containsKey("ROUND_TYP_name")) ? (String[])params.get("ROUND_TYP_name") : (String[])null);
		String[] ROUND_TYP_val = ((params.containsKey("ROUND_TYP_val")) ? (String[])params.get("ROUND_TYP_val") : (String[])null);
		String[] TAX_CD = ((params.containsKey("TAX_CD")) ? (String[])params.get("TAX_CD") : (String[])null);
		String[] TAX_APPLY_TYP = ((params.containsKey("TAX_APPLY_TYP")) ? (String[])params.get("TAX_APPLY_TYP") : (String[])null);
		String[] TAX_APPLY_TYP_name = ((params.containsKey("TAX_APPLY_TYP_name")) ? (String[])params.get("TAX_APPLY_TYP_name") : (String[])null);
		String[] TAX_APPLY_TYP_val = ((params.containsKey("TAX_APPLY_TYP_val")) ? (String[])params.get("TAX_APPLY_TYP_val") : (String[])null);
		String[] TAX_CALC_TYP = ((params.containsKey("TAX_CALC_TYP")) ? (String[])params.get("TAX_CALC_TYP") : (String[])null);
		String[] TAX_CALC_TYP_name = ((params.containsKey("TAX_CALC_TYP_name")) ? (String[])params.get("TAX_CALC_TYP_name") : (String[])null);
		String[] TAX_CALC_TYP_val = ((params.containsKey("TAX_CALC_TYP_val")) ? (String[])params.get("TAX_CALC_TYP_val") : (String[])null);
		String[] ODR_FORM_FLG = ((params.containsKey("ODR_FORM_FLG")) ? (String[])params.get("ODR_FORM_FLG") : (String[])null);
		String[] ODR_EDI_FLG = ((params.containsKey("ODR_EDI_FLG")) ? (String[])params.get("ODR_EDI_FLG") : (String[])null);
		String[] ODR_FAX_FLG = ((params.containsKey("ODR_FAX_FLG")) ? (String[])params.get("ODR_FAX_FLG") : (String[])null);
		String[] ODR_MAIL_FLG = ((params.containsKey("ODR_MAIL_FLG")) ? (String[])params.get("ODR_MAIL_FLG") : (String[])null);
		String[] VEND_REM = ((params.containsKey("VEND_REM")) ? (String[])params.get("VEND_REM") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] h_VEND_CD = ((params.containsKey("h_VEND_CD")) ? (String[])params.get("h_VEND_CD") : (String[])null);
		String[] EXCH_TYP = ((params.containsKey("EXCH_TYP")) ? (String[])params.get("EXCH_TYP") : (String[])null);
		String[] EXCH_TYP_name = ((params.containsKey("EXCH_TYP_name")) ? (String[])params.get("EXCH_TYP_name") : (String[])null);
		String[] EXCH_TYP_val = ((params.containsKey("EXCH_TYP_val")) ? (String[])params.get("EXCH_TYP_val") : (String[])null);
		String[] IMPORT_TRN_TYP = ((params.containsKey("IMPORT_TRN_TYP")) ? (String[])params.get("IMPORT_TRN_TYP") : (String[])null);
		String[] IMPORT_TRN_TYP_name = ((params.containsKey("IMPORT_TRN_TYP_name")) ? (String[])params.get("IMPORT_TRN_TYP_name") : (String[])null);
		String[] IMPORT_TRN_TYP_val = ((params.containsKey("IMPORT_TRN_TYP_val")) ? (String[])params.get("IMPORT_TRN_TYP_val") : (String[])null);
		String[] CUR_CD = ((params.containsKey("CUR_CD")) ? (String[])params.get("CUR_CD") : (String[])null);
		String[] CUR_NAME = ((params.containsKey("CUR_NAME")) ? (String[])params.get("CUR_NAME") : (String[])null);
		String[] INSPC_ACPT_APP_TYP = ((params.containsKey("INSPC_ACPT_APP_TYP")) ? (String[])params.get("INSPC_ACPT_APP_TYP") : (String[])null);
		String[] INSPC_ACPT_APP_TYP_name = ((params.containsKey("INSPC_ACPT_APP_TYP_name")) ? (String[])params.get("INSPC_ACPT_APP_TYP_name") : (String[])null);
		String[] INSPC_ACPT_APP_TYP_val = ((params.containsKey("INSPC_ACPT_APP_TYP_val")) ? (String[])params.get("INSPC_ACPT_APP_TYP_val") : (String[])null);
		String[] h_SCREENMOVE_TYP = ((params.containsKey("h_SCREENMOVE_TYP")) ? (String[])params.get("h_SCREENMOVE_TYP") : (String[])null);
		String[] h_APPR_ID = ((params.containsKey("h_APPR_ID")) ? (String[])params.get("h_APPR_ID") : (String[])null);
		String[] APPR_REMARKS = ((params.containsKey("APPR_REMARKS")) ? (String[])params.get("APPR_REMARKS") : (String[])null);
		String[] h_APR_VEND_CTRL = ((params.containsKey("h_APR_VEND_CTRL")) ? (String[])params.get("h_APR_VEND_CTRL") : (String[])null);

		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setVEND_KNAME( ((VEND_KNAME == null) ? (String)null : VEND_KNAME[0]) );
		struct.setList_VEND_KNAME(TypeConverter.convert(VEND_KNAME));
		struct.setZIP_CD( ((ZIP_CD == null) ? (String)null : ZIP_CD[0]) );
		struct.setList_ZIP_CD(TypeConverter.convert(ZIP_CD));
		struct.setADDRESS_1( ((ADDRESS_1 == null) ? (String)null : ADDRESS_1[0]) );
		struct.setList_ADDRESS_1(TypeConverter.convert(ADDRESS_1));
		struct.setADDRESS_2( ((ADDRESS_2 == null) ? (String)null : ADDRESS_2[0]) );
		struct.setList_ADDRESS_2(TypeConverter.convert(ADDRESS_2));
		struct.setADDRESS_K_1( ((ADDRESS_K_1 == null) ? (String)null : ADDRESS_K_1[0]) );
		struct.setList_ADDRESS_K_1(TypeConverter.convert(ADDRESS_K_1));
		struct.setADDRESS_K_2( ((ADDRESS_K_2 == null) ? (String)null : ADDRESS_K_2[0]) );
		struct.setList_ADDRESS_K_2(TypeConverter.convert(ADDRESS_K_2));
		struct.setTEL( ((TEL == null) ? (String)null : TEL[0]) );
		struct.setList_TEL(TypeConverter.convert(TEL));
		struct.setFAX( ((FAX == null) ? (String)null : FAX[0]) );
		struct.setList_FAX(TypeConverter.convert(FAX));
		struct.setEMAIL( ((EMAIL == null) ? (String)null : EMAIL[0]) );
		struct.setList_EMAIL(TypeConverter.convert(EMAIL));
		struct.setVEND_ORG( ((VEND_ORG == null) ? (String)null : VEND_ORG[0]) );
		struct.setList_VEND_ORG(TypeConverter.convert(VEND_ORG));
		struct.setVEND_PERSON( ((VEND_PERSON == null) ? (String)null : VEND_PERSON[0]) );
		struct.setList_VEND_PERSON(TypeConverter.convert(VEND_PERSON));
		struct.setOWN_ORG_CD( ((OWN_ORG_CD == null) ? (String)null : OWN_ORG_CD[0]) );
		struct.setList_OWN_ORG_CD(TypeConverter.convert(OWN_ORG_CD));
		struct.setOWN_ORG_NAME( ((OWN_ORG_NAME == null) ? (String)null : OWN_ORG_NAME[0]) );
		struct.setList_OWN_ORG_NAME(TypeConverter.convert(OWN_ORG_NAME));
		struct.setOWN_PERSON_CD( ((OWN_PERSON_CD == null) ? (String)null : OWN_PERSON_CD[0]) );
		struct.setList_OWN_PERSON_CD(TypeConverter.convert(OWN_PERSON_CD));
		struct.setOWN_PERSON_NAME( ((OWN_PERSON_NAME == null) ? (String)null : OWN_PERSON_NAME[0]) );
		struct.setList_OWN_PERSON_NAME(TypeConverter.convert(OWN_PERSON_NAME));
		if( (ROUND_TYP == null)||("".equals(ROUND_TYP[0])) ) {
		   struct.setROUND_TYP( (Integer)null );
		} else {
		   struct.setROUND_TYP( new Integer(ROUND_TYP[0]) );
		   struct.setList_ROUND_TYP(TypeConverter.convert(ROUND_TYP));
		}
		struct.setROUND_TYP_name( ((ROUND_TYP_name == null) ? (String)null : ROUND_TYP_name[0]) );
		struct.setList_ROUND_TYP_name(TypeConverter.convert(ROUND_TYP_name));
		struct.setROUND_TYP_val( ((ROUND_TYP_val == null) ? (String)null : ROUND_TYP_val[0]) );
		struct.setList_ROUND_TYP_val(TypeConverter.convert(ROUND_TYP_val));
		struct.setTAX_CD( ((TAX_CD == null) ? (String)null : TAX_CD[0]) );
		struct.setList_TAX_CD(TypeConverter.convert(TAX_CD));
		if( (TAX_APPLY_TYP == null)||("".equals(TAX_APPLY_TYP[0])) ) {
		   struct.setTAX_APPLY_TYP( (Integer)null );
		} else {
		   struct.setTAX_APPLY_TYP( new Integer(TAX_APPLY_TYP[0]) );
		   struct.setList_TAX_APPLY_TYP(TypeConverter.convert(TAX_APPLY_TYP));
		}
		struct.setTAX_APPLY_TYP_name( ((TAX_APPLY_TYP_name == null) ? (String)null : TAX_APPLY_TYP_name[0]) );
		struct.setList_TAX_APPLY_TYP_name(TypeConverter.convert(TAX_APPLY_TYP_name));
		struct.setTAX_APPLY_TYP_val( ((TAX_APPLY_TYP_val == null) ? (String)null : TAX_APPLY_TYP_val[0]) );
		struct.setList_TAX_APPLY_TYP_val(TypeConverter.convert(TAX_APPLY_TYP_val));
		if( (TAX_CALC_TYP == null)||("".equals(TAX_CALC_TYP[0])) ) {
		   struct.setTAX_CALC_TYP( (Integer)null );
		} else {
		   struct.setTAX_CALC_TYP( new Integer(TAX_CALC_TYP[0]) );
		   struct.setList_TAX_CALC_TYP(TypeConverter.convert(TAX_CALC_TYP));
		}
		struct.setTAX_CALC_TYP_name( ((TAX_CALC_TYP_name == null) ? (String)null : TAX_CALC_TYP_name[0]) );
		struct.setList_TAX_CALC_TYP_name(TypeConverter.convert(TAX_CALC_TYP_name));
		struct.setTAX_CALC_TYP_val( ((TAX_CALC_TYP_val == null) ? (String)null : TAX_CALC_TYP_val[0]) );
		struct.setList_TAX_CALC_TYP_val(TypeConverter.convert(TAX_CALC_TYP_val));
		struct.setODR_FORM_FLG( ((ODR_FORM_FLG == null) ? (String)null : ODR_FORM_FLG[0]) );
		struct.setList_ODR_FORM_FLG(TypeConverter.convert(ODR_FORM_FLG));
		struct.setODR_EDI_FLG( ((ODR_EDI_FLG == null) ? (String)null : ODR_EDI_FLG[0]) );
		struct.setList_ODR_EDI_FLG(TypeConverter.convert(ODR_EDI_FLG));
		struct.setODR_FAX_FLG( ((ODR_FAX_FLG == null) ? (String)null : ODR_FAX_FLG[0]) );
		struct.setList_ODR_FAX_FLG(TypeConverter.convert(ODR_FAX_FLG));
		struct.setODR_MAIL_FLG( ((ODR_MAIL_FLG == null) ? (String)null : ODR_MAIL_FLG[0]) );
		struct.setList_ODR_MAIL_FLG(TypeConverter.convert(ODR_MAIL_FLG));
		struct.setVEND_REM( ((VEND_REM == null) ? (String)null : VEND_REM[0]) );
		struct.setList_VEND_REM(TypeConverter.convert(VEND_REM));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.seth_VEND_CD( ((h_VEND_CD == null) ? (String)null : h_VEND_CD[0]) );
		struct.setList_h_VEND_CD(TypeConverter.convert(h_VEND_CD));
		struct.setEXCH_TYP( ((EXCH_TYP == null) ? (String)null : EXCH_TYP[0]) );
		struct.setList_EXCH_TYP(TypeConverter.convert(EXCH_TYP));
		struct.setEXCH_TYP_name( ((EXCH_TYP_name == null) ? (String)null : EXCH_TYP_name[0]) );
		struct.setList_EXCH_TYP_name(TypeConverter.convert(EXCH_TYP_name));
		struct.setEXCH_TYP_val( ((EXCH_TYP_val == null) ? (String)null : EXCH_TYP_val[0]) );
		struct.setList_EXCH_TYP_val(TypeConverter.convert(EXCH_TYP_val));
		struct.setIMPORT_TRN_TYP( ((IMPORT_TRN_TYP == null) ? (String)null : IMPORT_TRN_TYP[0]) );
		struct.setList_IMPORT_TRN_TYP(TypeConverter.convert(IMPORT_TRN_TYP));
		struct.setIMPORT_TRN_TYP_name( ((IMPORT_TRN_TYP_name == null) ? (String)null : IMPORT_TRN_TYP_name[0]) );
		struct.setList_IMPORT_TRN_TYP_name(TypeConverter.convert(IMPORT_TRN_TYP_name));
		struct.setIMPORT_TRN_TYP_val( ((IMPORT_TRN_TYP_val == null) ? (String)null : IMPORT_TRN_TYP_val[0]) );
		struct.setList_IMPORT_TRN_TYP_val(TypeConverter.convert(IMPORT_TRN_TYP_val));
		struct.setCUR_CD( ((CUR_CD == null) ? (String)null : CUR_CD[0]) );
		struct.setList_CUR_CD(TypeConverter.convert(CUR_CD));
		struct.setCUR_NAME( ((CUR_NAME == null) ? (String)null : CUR_NAME[0]) );
		struct.setList_CUR_NAME(TypeConverter.convert(CUR_NAME));
		struct.setINSPC_ACPT_APP_TYP( ((INSPC_ACPT_APP_TYP == null) ? (String)null : INSPC_ACPT_APP_TYP[0]) );
		struct.setList_INSPC_ACPT_APP_TYP(TypeConverter.convert(INSPC_ACPT_APP_TYP));
		struct.setINSPC_ACPT_APP_TYP_name( ((INSPC_ACPT_APP_TYP_name == null) ? (String)null : INSPC_ACPT_APP_TYP_name[0]) );
		struct.setList_INSPC_ACPT_APP_TYP_name(TypeConverter.convert(INSPC_ACPT_APP_TYP_name));
		struct.setINSPC_ACPT_APP_TYP_val( ((INSPC_ACPT_APP_TYP_val == null) ? (String)null : INSPC_ACPT_APP_TYP_val[0]) );
		struct.setList_INSPC_ACPT_APP_TYP_val(TypeConverter.convert(INSPC_ACPT_APP_TYP_val));
		struct.seth_SCREENMOVE_TYP( ((h_SCREENMOVE_TYP == null) ? (String)null : h_SCREENMOVE_TYP[0]) );
		struct.setList_h_SCREENMOVE_TYP(TypeConverter.convert(h_SCREENMOVE_TYP));
		struct.seth_APPR_ID( ((h_APPR_ID == null) ? (String)null : h_APPR_ID[0]) );
		struct.setList_h_APPR_ID(TypeConverter.convert(h_APPR_ID));
		struct.setAPPR_REMARKS( ((APPR_REMARKS == null) ? (String)null : APPR_REMARKS[0]) );
		struct.setList_APPR_REMARKS(TypeConverter.convert(APPR_REMARKS));
		struct.seth_APR_VEND_CTRL( ((h_APR_VEND_CTRL == null) ? (String)null : h_APR_VEND_CTRL[0]) );
		struct.setList_h_APR_VEND_CTRL(TypeConverter.convert(h_APR_VEND_CTRL));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0070010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAA0070010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAA0070010Struct";   // JSP先のバインド名(Struct)の指定
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
					AA0070010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0070010Entity entity = control.entity;
		AA0070010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0070010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0070010Control control;
		AA0070010Entity  entity = null;
		AA0070010Struct  struct = null;

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

			if( (control = (AA0070010Control)so.getAttribute("AA0070010Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0070010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0070010Control();
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

				so.setAttribute("AA0070010Control_"+request.getSession(false).getId(),control);

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
		return "com.nec.jp.orteus.metamorBase.AA0070.AA0070010Servlet";
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
	public AA0070010Servlet()
	{
		//{{user_implement_dev:<AA0070010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_insert = true;
		bFLG_DISCONNECT_update = true;
		bFLG_DISCONNECT_delete = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AA0070010_DisConnect_FLG>

		//{{user_implement_dev:<AA0070010Servlet>
			
                //}}user_implement_dev:<AA0070010Servlet>
	}

	//////////////////////////////

}
