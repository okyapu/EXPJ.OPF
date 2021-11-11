/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0160/src/com/nec/jp/orteus/metamorBase/AA0160/AA0160010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0160;

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

public class AA0160010Servlet extends HttpServlet
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
	 * @param control AA0160010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AA0160010Control control)
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
	 * @param control AA0160010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AA0160010Control control)
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
	 * @param control AA0160010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
			logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			objMessage.m_writer.write( Level.ALL, "AA9030010"+" $Revision: 1.3 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0160010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA9030010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0160010Controlクラスインスタンス
	 */
	public String onClickCsvImport(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0160011.jsp";		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");
		//{{user_implement_dev:<onClickCsvImport>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CsvImport");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvImport>
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");

		return nextUrl;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0160010Controlクラスインスタンス
	 */
	public String onClickBrowse(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");
		//{{user_implement_dev:<onClickBrowse>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Browse");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickBrowse>
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");

		return nextUrl;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0160010Controlクラスインスタンス
	 */
	public String onClickCsvIn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0160011.jsp";		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");
		//{{user_implement_dev:<onClickCsvIn>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.setCsvReader(new CsvReader(request));
			control.control_eventHandller("CsvIn");
			control.setCsvReader(null);
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvIn>
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0160010Controlクラスインスタンス
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("return_sub1");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0160010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("clear");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0160010Controlクラスインスタンス
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0160010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0160011.jsp";		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
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
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0160010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] rdoInsert = ((params.containsKey("rdoInsert")) ? (String[])params.get("rdoInsert") : (String[])null);
		String[] rdoUpdate = ((params.containsKey("rdoUpdate")) ? (String[])params.get("rdoUpdate") : (String[])null);
		String[] rdoDelete = ((params.containsKey("rdoDelete")) ? (String[])params.get("rdoDelete") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] FileName = ((params.containsKey("FileName")) ? (String[])params.get("FileName") : (String[])null);
		String[] CANCEL_FILE = ((params.containsKey("CANCEL_FILE")) ? (String[])params.get("CANCEL_FILE") : (String[])null);
		String[] JUDGMENT_TXT = ((params.containsKey("JUDGMENT_TXT")) ? (String[])params.get("JUDGMENT_TXT") : (String[])null);
		String[] h_PARENT_ITEM_CD = ((params.containsKey("h_PARENT_ITEM_CD")) ? (String[])params.get("h_PARENT_ITEM_CD") : (String[])null);
		String[] h_COMP_ITEM_CD = ((params.containsKey("h_COMP_ITEM_CD")) ? (String[])params.get("h_COMP_ITEM_CD") : (String[])null);
		String[] h_PS_EDITION = ((params.containsKey("h_PS_EDITION")) ? (String[])params.get("h_PS_EDITION") : (String[])null);
		String[] h_PS_UNIT_DENOMINATOR = ((params.containsKey("h_PS_UNIT_DENOMINATOR")) ? (String[])params.get("h_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] h_PS_UNIT_NUMERATOR = ((params.containsKey("h_PS_UNIT_NUMERATOR")) ? (String[])params.get("h_PS_UNIT_NUMERATOR") : (String[])null);
		String[] h_EFF_PHASE_IN_DATE = ((params.containsKey("h_EFF_PHASE_IN_DATE")) ? (String[])params.get("h_EFF_PHASE_IN_DATE") : (String[])null);
		String[] h_EFF_PHASE_OUT_DATE = ((params.containsKey("h_EFF_PHASE_OUT_DATE")) ? (String[])params.get("h_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] h_PS_SPOIL = ((params.containsKey("h_PS_SPOIL")) ? (String[])params.get("h_PS_SPOIL") : (String[])null);
		String[] h_CONS_TYP = ((params.containsKey("h_CONS_TYP")) ? (String[])params.get("h_CONS_TYP") : (String[])null);
		String[] h_PS_LT_FLG = ((params.containsKey("h_PS_LT_FLG")) ? (String[])params.get("h_PS_LT_FLG") : (String[])null);
		String[] h_PS_FIXED_LT = ((params.containsKey("h_PS_FIXED_LT")) ? (String[])params.get("h_PS_FIXED_LT") : (String[])null);
		String[] h_PS_PROP_LT = ((params.containsKey("h_PS_PROP_LT")) ? (String[])params.get("h_PS_PROP_LT") : (String[])null);
		String[] h_PS_PROP_LOT_SIZE = ((params.containsKey("h_PS_PROP_LOT_SIZE")) ? (String[])params.get("h_PS_PROP_LOT_SIZE") : (String[])null);
		String[] h_PS_REF_NO = ((params.containsKey("h_PS_REF_NO")) ? (String[])params.get("h_PS_REF_NO") : (String[])null);
		String[] h_COST_UP_TYP = ((params.containsKey("h_COST_UP_TYP")) ? (String[])params.get("h_COST_UP_TYP") : (String[])null);
		String[] h_MRP_EXP_TYP = ((params.containsKey("h_MRP_EXP_TYP")) ? (String[])params.get("h_MRP_EXP_TYP") : (String[])null);
		String[] ERROR_IN = ((params.containsKey("ERROR_IN")) ? (String[])params.get("ERROR_IN") : (String[])null);
		String[] ERR_CTR_NM = ((params.containsKey("ERR_CTR_NM")) ? (String[])params.get("ERR_CTR_NM") : (String[])null);
		String[] ERR_INFO = ((params.containsKey("ERR_INFO")) ? (String[])params.get("ERR_INFO") : (String[])null);
		String[] DO_CHK = ((params.containsKey("DO_CHK")) ? (String[])params.get("DO_CHK") : (String[])null);
		String[] PARENT_ITEM_CD = ((params.containsKey("PARENT_ITEM_CD")) ? (String[])params.get("PARENT_ITEM_CD") : (String[])null);
		String[] COMP_ITEM_CD = ((params.containsKey("COMP_ITEM_CD")) ? (String[])params.get("COMP_ITEM_CD") : (String[])null);
		String[] PS_EDITION = ((params.containsKey("PS_EDITION")) ? (String[])params.get("PS_EDITION") : (String[])null);

		struct.setrdoInsert( ((rdoInsert == null) ? (String)null : rdoInsert[0]) );
		struct.setList_rdoInsert(TypeConverter.convert(rdoInsert));
		struct.setrdoUpdate( ((rdoUpdate == null) ? (String)null : rdoUpdate[0]) );
		struct.setList_rdoUpdate(TypeConverter.convert(rdoUpdate));
		struct.setrdoDelete( ((rdoDelete == null) ? (String)null : rdoDelete[0]) );
		struct.setList_rdoDelete(TypeConverter.convert(rdoDelete));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setFileName( ((FileName == null) ? (String)null : FileName[0]) );
		struct.setList_FileName(TypeConverter.convert(FileName));
		struct.setCANCEL_FILE( ((CANCEL_FILE == null) ? (String)null : CANCEL_FILE[0]) );
		struct.setList_CANCEL_FILE(TypeConverter.convert(CANCEL_FILE));
		struct.setJUDGMENT_TXT( ((JUDGMENT_TXT == null) ? (String)null : JUDGMENT_TXT[0]) );
		struct.setList_JUDGMENT_TXT(TypeConverter.convert(JUDGMENT_TXT));
		struct.seth_PARENT_ITEM_CD( ((h_PARENT_ITEM_CD == null) ? (String)null : h_PARENT_ITEM_CD[0]) );
		struct.setList_h_PARENT_ITEM_CD(TypeConverter.convert(h_PARENT_ITEM_CD));
		struct.seth_COMP_ITEM_CD( ((h_COMP_ITEM_CD == null) ? (String)null : h_COMP_ITEM_CD[0]) );
		struct.setList_h_COMP_ITEM_CD(TypeConverter.convert(h_COMP_ITEM_CD));
		struct.seth_PS_EDITION( ((h_PS_EDITION == null) ? (String)null : h_PS_EDITION[0]) );
		struct.setList_h_PS_EDITION(TypeConverter.convert(h_PS_EDITION));
		struct.seth_PS_UNIT_DENOMINATOR( ((h_PS_UNIT_DENOMINATOR == null) ? (String)null : h_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_h_PS_UNIT_DENOMINATOR(TypeConverter.convert(h_PS_UNIT_DENOMINATOR));
		struct.seth_PS_UNIT_NUMERATOR( ((h_PS_UNIT_NUMERATOR == null) ? (String)null : h_PS_UNIT_NUMERATOR[0]) );
		struct.setList_h_PS_UNIT_NUMERATOR(TypeConverter.convert(h_PS_UNIT_NUMERATOR));
		struct.seth_EFF_PHASE_IN_DATE( ((h_EFF_PHASE_IN_DATE == null) ? (String)null : h_EFF_PHASE_IN_DATE[0]) );
		struct.setList_h_EFF_PHASE_IN_DATE(TypeConverter.convert(h_EFF_PHASE_IN_DATE));
		struct.seth_EFF_PHASE_OUT_DATE( ((h_EFF_PHASE_OUT_DATE == null) ? (String)null : h_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_h_EFF_PHASE_OUT_DATE(TypeConverter.convert(h_EFF_PHASE_OUT_DATE));
		struct.seth_PS_SPOIL( ((h_PS_SPOIL == null) ? (String)null : h_PS_SPOIL[0]) );
		struct.setList_h_PS_SPOIL(TypeConverter.convert(h_PS_SPOIL));
		struct.seth_CONS_TYP( ((h_CONS_TYP == null) ? (String)null : h_CONS_TYP[0]) );
		struct.setList_h_CONS_TYP(TypeConverter.convert(h_CONS_TYP));
		struct.seth_PS_LT_FLG( ((h_PS_LT_FLG == null) ? (String)null : h_PS_LT_FLG[0]) );
		struct.setList_h_PS_LT_FLG(TypeConverter.convert(h_PS_LT_FLG));
		struct.seth_PS_FIXED_LT( ((h_PS_FIXED_LT == null) ? (String)null : h_PS_FIXED_LT[0]) );
		struct.setList_h_PS_FIXED_LT(TypeConverter.convert(h_PS_FIXED_LT));
		struct.seth_PS_PROP_LT( ((h_PS_PROP_LT == null) ? (String)null : h_PS_PROP_LT[0]) );
		struct.setList_h_PS_PROP_LT(TypeConverter.convert(h_PS_PROP_LT));
		struct.seth_PS_PROP_LOT_SIZE( ((h_PS_PROP_LOT_SIZE == null) ? (String)null : h_PS_PROP_LOT_SIZE[0]) );
		struct.setList_h_PS_PROP_LOT_SIZE(TypeConverter.convert(h_PS_PROP_LOT_SIZE));
		struct.seth_PS_REF_NO( ((h_PS_REF_NO == null) ? (String)null : h_PS_REF_NO[0]) );
		struct.setList_h_PS_REF_NO(TypeConverter.convert(h_PS_REF_NO));
		struct.seth_COST_UP_TYP( ((h_COST_UP_TYP == null) ? (String)null : h_COST_UP_TYP[0]) );
		struct.setList_h_COST_UP_TYP(TypeConverter.convert(h_COST_UP_TYP));
		struct.seth_MRP_EXP_TYP( ((h_MRP_EXP_TYP == null) ? (String)null : h_MRP_EXP_TYP[0]) );
		struct.setList_h_MRP_EXP_TYP(TypeConverter.convert(h_MRP_EXP_TYP));
		struct.setERROR_IN( ((ERROR_IN == null) ? (String)null : ERROR_IN[0]) );
		struct.setList_ERROR_IN(TypeConverter.convert(ERROR_IN));
		struct.setERR_CTR_NM( ((ERR_CTR_NM == null) ? (String)null : ERR_CTR_NM[0]) );
		struct.setList_ERR_CTR_NM(TypeConverter.convert(ERR_CTR_NM));
		struct.setERR_INFO( ((ERR_INFO == null) ? (String)null : ERR_INFO[0]) );
		struct.setList_ERR_INFO(TypeConverter.convert(ERR_INFO));
		struct.setDO_CHK( ((DO_CHK == null) ? (String)null : DO_CHK[0]) );
		struct.setList_DO_CHK(TypeConverter.convert(DO_CHK));
		struct.setPARENT_ITEM_CD( ((PARENT_ITEM_CD == null) ? (String)null : PARENT_ITEM_CD[0]) );
		struct.setList_PARENT_ITEM_CD(TypeConverter.convert(PARENT_ITEM_CD));
		struct.setCOMP_ITEM_CD( ((COMP_ITEM_CD == null) ? (String)null : COMP_ITEM_CD[0]) );
		struct.setList_COMP_ITEM_CD(TypeConverter.convert(COMP_ITEM_CD));
		struct.setPS_EDITION( ((PS_EDITION == null) ? (String)null : PS_EDITION[0]) );
		struct.setList_PS_EDITION(TypeConverter.convert(PS_EDITION));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0160010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAA0160010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAA0160010Struct";   // JSP先のバインド名(Struct)の指定
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
					AA0160010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0160010Entity entity = control.entity;
		AA0160010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0160010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0160010Control control;
		AA0160010Entity  entity = null;
		AA0160010Struct  struct = null;

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

			if( (control = (AA0160010Control)so.getAttribute("AA0160010Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0160010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0160010Control();
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
				if( isClick(request, "CsvImport") ) {
					if ( !isCryptical(request, so, params, "CsvImport") ) return ERROR_TARGET;
					target = onClickCsvImport(request, response, so, params, control);
					control.setButton("CsvImport");
				} else if( isClick(request, "Browse") ) {
					if ( !isCryptical(request, so, params, "Browse") ) return ERROR_TARGET;
					target = onClickBrowse(request, response, so, params, control);
					control.setButton("Browse");
				} else if( isClick(request, "CsvIn") ) {
					if ( !isCryptical(request, so, params, "CsvIn") ) return ERROR_TARGET;
					target = onClickCsvIn(request, response, so, params, control);
					control.setButton("CsvIn");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0160010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "CsvImport") && bFLG_DISCONNECT_CsvImport)
				|| (isClick(request, "Browse") && bFLG_DISCONNECT_Browse)
				|| (isClick(request, "CsvIn") && bFLG_DISCONNECT_CsvIn)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
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
	private  static boolean bFLG_DISCONNECT_CsvImport = true;
	private  static boolean bFLG_DISCONNECT_Browse = true;
	private  static boolean bFLG_DISCONNECT_CsvIn = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
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
		return "com.nec.jp.orteus.metamorBase.AA0160.AA0160010Servlet";
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
	public AA0160010Servlet()
	{
		//{{user_implement_dev:<AA0160010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_CsvImport = true;
		bFLG_DISCONNECT_Browse = true;
		bFLG_DISCONNECT_CsvIn = true;
		bFLG_DISCONNECT_return_sub1 = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AA0160010_DisConnect_FLG>

		//{{user_implement_dev:<AA0160010Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AA0160010Servlet>
	}

	//////////////////////////////

}
