/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0040/src/com/nec/jp/orteus/metamorBase/AD0040/AD0040010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0040;

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

public class AD0040010Servlet extends HttpServlet
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
	 * @param control AD0040010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AD0040010Control control)
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
			
		if (params.containsKey("param1")) {
			String[] value = null;
			value = (String[]) params.get("param1");
			if(null != value){
				control.setIn_Opr_Inst_Cd_Move(value[0]);
			}

		}
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AD0040010Control control)
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
	 * @param control AD0040010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
			logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			objMessage.m_writer.write( Level.ALL, "AD0040010"+" $Revision: 1.23 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AD0040010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 子部品追加登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickUseParts(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040012.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUseParts");
		//{{user_implement_dev:<onClickUseParts>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("UseParts");


			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0040010.jsp";
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUseParts>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUseParts");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickUpdate11(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate11");
		//{{user_implement_dev:<onClickUpdate11>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Update11");


			if (control.getMsgStruct().getError().size() != 0 
					&& control.getScreenMoveFlg() == 0) {
				nextUrl = "/AD0040011.jsp";
			} else {
				control.setScreenMoveFlg(0);
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate11>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate11");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickUpdate12(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate12");
		//{{user_implement_dev:<onClickUpdate12>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Update12");


			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0040012.jsp";
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate12>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate12");

		return nextUrl;
	}

	/**
	 * 調整数登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickNoUserParts(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040012.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickNoUserParts");
		//{{user_implement_dev:<onClickNoUserParts>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("NoUserParts");


			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0040010.jsp";
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickNoUserParts>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickNoUserParts");

		return nextUrl;
	}

	/**
	 * 完了解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickCancelComplete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");
		//{{user_implement_dev:<onClickCancelComplete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CancelComplete");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelComplete>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");

		return nextUrl;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickLineInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040011.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");
		//{{user_implement_dev:<onClickLineInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LineInsert");


			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0040010.jsp";
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineInsert>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickLineUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040011.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");
		//{{user_implement_dev:<onClickLineUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LineUpdate");


			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0040010.jsp";
			}

/*			if (control.getMsgStruct().getError().size() != 0
					&& control._defectListFlg == 0) {
				nextUrl = "/AD0040010.jsp";
			} else {
				control._defectListFlg = 0;
			}
*/

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineUpdate>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");

		return nextUrl;
	}

	/**
	 * 一括更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickUpdateAll(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdateAll");
		//{{user_implement_dev:<onClickUpdateAll>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("UpdateAll");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdateAll>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdateAll");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickInsert11(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert11");
		//{{user_implement_dev:<onClickInsert11>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Insert11");


			if (control.getMsgStruct().getError().size() != 0 
					&& control.getScreenMoveFlg() == 0) {
				nextUrl = "/AD0040011.jsp";
			} else {
				control.setScreenMoveFlg(0);
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert11>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert11");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickReturn11(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickReturn11");
		//{{user_implement_dev:<onClickReturn11>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Return11");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReturn11>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickReturn11");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickInsert12(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert12");
		//{{user_implement_dev:<onClickInsert12>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Insert12");


			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0040012.jsp";
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert12>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert12");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickReturn12(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickReturn12");
		//{{user_implement_dev:<onClickReturn12>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Return12");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReturn12>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickReturn12");

		return nextUrl;
	}

	/**
	 * ClickShowボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickClickShow(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010iframe.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");
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
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");

		return nextUrl;
	}

	/**
	 * ロット管理ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickLotInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");
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
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");

		return nextUrl;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");
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
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");

		return nextUrl;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AD0040010Controlクラスインスタンス
	 */
	public String onClickPrintShow(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0040010.jsp";		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickPrintShow");
		//{{user_implement_dev:<onClickPrintShow>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("PrintShow");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickPrintShow>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"onClickPrintShow");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AD0040010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PARTIAL_PRD_NO = ((params.containsKey("PARTIAL_PRD_NO")) ? (String[])params.get("PARTIAL_PRD_NO") : (String[])null);
		String[] ACPT_QTY = ((params.containsKey("ACPT_QTY")) ? (String[])params.get("ACPT_QTY") : (String[])null);
		String[] DEFECT_QTY = ((params.containsKey("DEFECT_QTY")) ? (String[])params.get("DEFECT_QTY") : (String[])null);
		String[] OPR_DATE = ((params.containsKey("OPR_DATE")) ? (String[])params.get("OPR_DATE") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] WS_CD = ((params.containsKey("WS_CD")) ? (String[])params.get("WS_CD") : (String[])null);
		String[] WS_NAME = ((params.containsKey("WS_NAME")) ? (String[])params.get("WS_NAME") : (String[])null);
		String[] WORK_ODR_DLV_DATE = ((params.containsKey("WORK_ODR_DLV_DATE")) ? (String[])params.get("WORK_ODR_DLV_DATE") : (String[])null);
		String[] OPR_INST_START_DATE = ((params.containsKey("OPR_INST_START_DATE")) ? (String[])params.get("OPR_INST_START_DATE") : (String[])null);
		String[] OPR_INST_QTY = ((params.containsKey("OPR_INST_QTY")) ? (String[])params.get("OPR_INST_QTY") : (String[])null);
		String[] SUM_ACPT_QTY = ((params.containsKey("SUM_ACPT_QTY")) ? (String[])params.get("SUM_ACPT_QTY") : (String[])null);
		String[] SUM_DEFECT_QTY = ((params.containsKey("SUM_DEFECT_QTY")) ? (String[])params.get("SUM_DEFECT_QTY") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] OPR_RSLT_PERSON = ((params.containsKey("OPR_RSLT_PERSON")) ? (String[])params.get("OPR_RSLT_PERSON") : (String[])null);
		String[] PRE_ARRANGEMENT_TIME = ((params.containsKey("PRE_ARRANGEMENT_TIME")) ? (String[])params.get("PRE_ARRANGEMENT_TIME") : (String[])null);
		String[] OPR_TIME = ((params.containsKey("OPR_TIME")) ? (String[])params.get("OPR_TIME") : (String[])null);
		String[] POST_ARRANGEMENT_TIME = ((params.containsKey("POST_ARRANGEMENT_TIME")) ? (String[])params.get("POST_ARRANGEMENT_TIME") : (String[])null);
		String[] CESSATION_TIME = ((params.containsKey("CESSATION_TIME")) ? (String[])params.get("CESSATION_TIME") : (String[])null);
		String[] CESSATION_CAUSE = ((params.containsKey("CESSATION_CAUSE")) ? (String[])params.get("CESSATION_CAUSE") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] OPR_RSLT_COMMENT = ((params.containsKey("OPR_RSLT_COMMENT")) ? (String[])params.get("OPR_RSLT_COMMENT") : (String[])null);
		String[] OPR_INST_CD = ((params.containsKey("OPR_INST_CD")) ? (String[])params.get("OPR_INST_CD") : (String[])null);
		String[] OPR_TIME_UNIT_TYP = ((params.containsKey("OPR_TIME_UNIT_TYP")) ? (String[])params.get("OPR_TIME_UNIT_TYP") : (String[])null);
		String[] OPR_TIME_UNIT_TYP_name = ((params.containsKey("OPR_TIME_UNIT_TYP_name")) ? (String[])params.get("OPR_TIME_UNIT_TYP_name") : (String[])null);
		String[] OPR_TIME_UNIT_TYP_val = ((params.containsKey("OPR_TIME_UNIT_TYP_val")) ? (String[])params.get("OPR_TIME_UNIT_TYP_val") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] PROC_NAME = ((params.containsKey("PROC_NAME")) ? (String[])params.get("PROC_NAME") : (String[])null);
		String[] TEMP_PLAN_QTY = ((params.containsKey("TEMP_PLAN_QTY")) ? (String[])params.get("TEMP_PLAN_QTY") : (String[])null);
		String[] TEMP_USEOVER_QTY = ((params.containsKey("TEMP_USEOVER_QTY")) ? (String[])params.get("TEMP_USEOVER_QTY") : (String[])null);
		String[] TEMP_PLANOUT_QTY = ((params.containsKey("TEMP_PLANOUT_QTY")) ? (String[])params.get("TEMP_PLANOUT_QTY") : (String[])null);
		String[] TEMP_USE_QTY = ((params.containsKey("TEMP_USE_QTY")) ? (String[])params.get("TEMP_USE_QTY") : (String[])null);
		String[] RCV_ISSUE_DATE = ((params.containsKey("RCV_ISSUE_DATE")) ? (String[])params.get("RCV_ISSUE_DATE") : (String[])null);
		String[] RCV_ISSUE_COMMENT = ((params.containsKey("RCV_ISSUE_COMMENT")) ? (String[])params.get("RCV_ISSUE_COMMENT") : (String[])null);
		String[] ISSUE_TYP_DN = ((params.containsKey("ISSUE_TYP_DN")) ? (String[])params.get("ISSUE_TYP_DN") : (String[])null);
		String[] ISSUE_INST_UNIT_FRACTION = ((params.containsKey("ISSUE_INST_UNIT_FRACTION")) ? (String[])params.get("ISSUE_INST_UNIT_FRACTION") : (String[])null);
		String[] MRP_ODR_TYP_DN = ((params.containsKey("MRP_ODR_TYP_DN")) ? (String[])params.get("MRP_ODR_TYP_DN") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] h_OPR_INST_CD = ((params.containsKey("h_OPR_INST_CD")) ? (String[])params.get("h_OPR_INST_CD") : (String[])null);
		String[] h_WORK_STS_TYP = ((params.containsKey("h_WORK_STS_TYP")) ? (String[])params.get("h_WORK_STS_TYP") : (String[])null);
		String[] h_ISSUE_TYP = ((params.containsKey("h_ISSUE_TYP")) ? (String[])params.get("h_ISSUE_TYP") : (String[])null);
		String[] h_ISSUE_INST_UNIT_DENOMINATOR = ((params.containsKey("h_ISSUE_INST_UNIT_DENOMINATOR")) ? (String[])params.get("h_ISSUE_INST_UNIT_DENOMINATOR") : (String[])null);
		String[] h_ISSUE_INST_UNIT_NUMERATOR = ((params.containsKey("h_ISSUE_INST_UNIT_NUMERATOR")) ? (String[])params.get("h_ISSUE_INST_UNIT_NUMERATOR") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] c_COMPLETE = ((params.containsKey("c_COMPLETE")) ? (String[])params.get("c_COMPLETE") : (String[])null);
		String[] IN_OPR_INST_CD = ((params.containsKey("IN_OPR_INST_CD")) ? (String[])params.get("IN_OPR_INST_CD") : (String[])null);
		String[] h_ISSUE_INST_CD = ((params.containsKey("h_ISSUE_INST_CD")) ? (String[])params.get("h_ISSUE_INST_CD") : (String[])null);
		String[] h_ITEM_MODIFY_COUNT = ((params.containsKey("h_ITEM_MODIFY_COUNT")) ? (String[])params.get("h_ITEM_MODIFY_COUNT") : (String[])null);
		String[] h_PROC_MODIFY_COUNT = ((params.containsKey("h_PROC_MODIFY_COUNT")) ? (String[])params.get("h_PROC_MODIFY_COUNT") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_FINAL_PROC_FLG = ((params.containsKey("h_FINAL_PROC_FLG")) ? (String[])params.get("h_FINAL_PROC_FLG") : (String[])null);
		String[] l_DEFECT_CAUSE_CD = ((params.containsKey("l_DEFECT_CAUSE_CD")) ? (String[])params.get("l_DEFECT_CAUSE_CD") : (String[])null);
		String[] l_DEFECT_QTY = ((params.containsKey("l_DEFECT_QTY")) ? (String[])params.get("l_DEFECT_QTY") : (String[])null);
		String[] l_DEFECT_COMMENT = ((params.containsKey("l_DEFECT_COMMENT")) ? (String[])params.get("l_DEFECT_COMMENT") : (String[])null);
		String[] l_PARTIAL_PRD_NO = ((params.containsKey("l_PARTIAL_PRD_NO")) ? (String[])params.get("l_PARTIAL_PRD_NO") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] RCV_ISSUE_TIME = ((params.containsKey("RCV_ISSUE_TIME")) ? (String[])params.get("RCV_ISSUE_TIME") : (String[])null);
		String[] OPRATION_TIME = ((params.containsKey("OPRATION_TIME")) ? (String[])params.get("OPRATION_TIME") : (String[])null);
		String[] h_OPR_DATE = ((params.containsKey("h_OPR_DATE")) ? (String[])params.get("h_OPR_DATE") : (String[])null);
		String[] h_SYS_LOT_CTRL_FLG = ((params.containsKey("h_SYS_LOT_CTRL_FLG")) ? (String[])params.get("h_SYS_LOT_CTRL_FLG") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] l_LOT_NO = ((params.containsKey("l_LOT_NO")) ? (String[])params.get("l_LOT_NO") : (String[])null);
		String[] LOT_NUMBERING_TYP = ((params.containsKey("LOT_NUMBERING_TYP")) ? (String[])params.get("LOT_NUMBERING_TYP") : (String[])null);
		String[] param1 = ((params.containsKey("param1")) ? (String[])params.get("param1") : (String[])null);
		String[] LOT_CTRL_FLG = ((params.containsKey("LOT_CTRL_FLG")) ? (String[])params.get("LOT_CTRL_FLG") : (String[])null);
		String[] param2 = ((params.containsKey("param2")) ? (String[])params.get("param2") : (String[])null);
		String[] param3 = ((params.containsKey("param3")) ? (String[])params.get("param3") : (String[])null);
		String[] h_LOT_NO = ((params.containsKey("h_LOT_NO")) ? (String[])params.get("h_LOT_NO") : (String[])null);
		String[] l_DEFECT_CAUSE_CD_name = ((params.containsKey("l_DEFECT_CAUSE_CD_name")) ? (String[])params.get("l_DEFECT_CAUSE_CD_name") : (String[])null);
		String[] l_DEFECT_CAUSE_CD_val = ((params.containsKey("l_DEFECT_CAUSE_CD_val")) ? (String[])params.get("l_DEFECT_CAUSE_CD_val") : (String[])null);
		String[] c_OUTPUT = ((params.containsKey("c_OUTPUT")) ? (String[])params.get("c_OUTPUT") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] h_PROCESS_MANAGE_FLG = ((params.containsKey("h_PROCESS_MANAGE_FLG")) ? (String[])params.get("h_PROCESS_MANAGE_FLG") : (String[])null);

		struct.setPARTIAL_PRD_NO( ((PARTIAL_PRD_NO == null) ? (String)null : PARTIAL_PRD_NO[0]) );
		struct.setList_PARTIAL_PRD_NO(TypeConverter.convert(PARTIAL_PRD_NO));
		struct.setACPT_QTY( ((ACPT_QTY == null) ? (String)null : ACPT_QTY[0]) );
		struct.setList_ACPT_QTY(TypeConverter.convert(ACPT_QTY));
		struct.setDEFECT_QTY( ((DEFECT_QTY == null) ? (String)null : DEFECT_QTY[0]) );
		struct.setList_DEFECT_QTY(TypeConverter.convert(DEFECT_QTY));
		struct.setOPR_DATE( ((OPR_DATE == null) ? (String)null : OPR_DATE[0]) );
		struct.setList_OPR_DATE(TypeConverter.convert(OPR_DATE));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setWS_CD( ((WS_CD == null) ? (String)null : WS_CD[0]) );
		struct.setList_WS_CD(TypeConverter.convert(WS_CD));
		struct.setWS_NAME( ((WS_NAME == null) ? (String)null : WS_NAME[0]) );
		struct.setList_WS_NAME(TypeConverter.convert(WS_NAME));
		struct.setWORK_ODR_DLV_DATE( ((WORK_ODR_DLV_DATE == null) ? (String)null : WORK_ODR_DLV_DATE[0]) );
		struct.setList_WORK_ODR_DLV_DATE(TypeConverter.convert(WORK_ODR_DLV_DATE));
		struct.setOPR_INST_START_DATE( ((OPR_INST_START_DATE == null) ? (String)null : OPR_INST_START_DATE[0]) );
		struct.setList_OPR_INST_START_DATE(TypeConverter.convert(OPR_INST_START_DATE));
		struct.setOPR_INST_QTY( ((OPR_INST_QTY == null) ? (String)null : OPR_INST_QTY[0]) );
		struct.setList_OPR_INST_QTY(TypeConverter.convert(OPR_INST_QTY));
		struct.setSUM_ACPT_QTY( ((SUM_ACPT_QTY == null) ? (String)null : SUM_ACPT_QTY[0]) );
		struct.setList_SUM_ACPT_QTY(TypeConverter.convert(SUM_ACPT_QTY));
		struct.setSUM_DEFECT_QTY( ((SUM_DEFECT_QTY == null) ? (String)null : SUM_DEFECT_QTY[0]) );
		struct.setList_SUM_DEFECT_QTY(TypeConverter.convert(SUM_DEFECT_QTY));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setOPR_RSLT_PERSON( ((OPR_RSLT_PERSON == null) ? (String)null : OPR_RSLT_PERSON[0]) );
		struct.setList_OPR_RSLT_PERSON(TypeConverter.convert(OPR_RSLT_PERSON));
		struct.setPRE_ARRANGEMENT_TIME( ((PRE_ARRANGEMENT_TIME == null) ? (String)null : PRE_ARRANGEMENT_TIME[0]) );
		struct.setList_PRE_ARRANGEMENT_TIME(TypeConverter.convert(PRE_ARRANGEMENT_TIME));
		struct.setOPR_TIME( ((OPR_TIME == null) ? (String)null : OPR_TIME[0]) );
		struct.setList_OPR_TIME(TypeConverter.convert(OPR_TIME));
		struct.setPOST_ARRANGEMENT_TIME( ((POST_ARRANGEMENT_TIME == null) ? (String)null : POST_ARRANGEMENT_TIME[0]) );
		struct.setList_POST_ARRANGEMENT_TIME(TypeConverter.convert(POST_ARRANGEMENT_TIME));
		struct.setCESSATION_TIME( ((CESSATION_TIME == null) ? (String)null : CESSATION_TIME[0]) );
		struct.setList_CESSATION_TIME(TypeConverter.convert(CESSATION_TIME));
		struct.setCESSATION_CAUSE( ((CESSATION_CAUSE == null) ? (String)null : CESSATION_CAUSE[0]) );
		struct.setList_CESSATION_CAUSE(TypeConverter.convert(CESSATION_CAUSE));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setOPR_RSLT_COMMENT( ((OPR_RSLT_COMMENT == null) ? (String)null : OPR_RSLT_COMMENT[0]) );
		struct.setList_OPR_RSLT_COMMENT(TypeConverter.convert(OPR_RSLT_COMMENT));
		struct.setOPR_INST_CD( ((OPR_INST_CD == null) ? (String)null : OPR_INST_CD[0]) );
		struct.setList_OPR_INST_CD(TypeConverter.convert(OPR_INST_CD));
		struct.setOPR_TIME_UNIT_TYP( ((OPR_TIME_UNIT_TYP == null) ? (String)null : OPR_TIME_UNIT_TYP[0]) );
		struct.setList_OPR_TIME_UNIT_TYP(TypeConverter.convert(OPR_TIME_UNIT_TYP));
		struct.setOPR_TIME_UNIT_TYP_name( ((OPR_TIME_UNIT_TYP_name == null) ? (String)null : OPR_TIME_UNIT_TYP_name[0]) );
		struct.setList_OPR_TIME_UNIT_TYP_name(TypeConverter.convert(OPR_TIME_UNIT_TYP_name));
		struct.setOPR_TIME_UNIT_TYP_val( ((OPR_TIME_UNIT_TYP_val == null) ? (String)null : OPR_TIME_UNIT_TYP_val[0]) );
		struct.setList_OPR_TIME_UNIT_TYP_val(TypeConverter.convert(OPR_TIME_UNIT_TYP_val));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		struct.setPROC_NAME( ((PROC_NAME == null) ? (String)null : PROC_NAME[0]) );
		struct.setList_PROC_NAME(TypeConverter.convert(PROC_NAME));
		struct.setTEMP_PLAN_QTY( ((TEMP_PLAN_QTY == null) ? (String)null : TEMP_PLAN_QTY[0]) );
		struct.setList_TEMP_PLAN_QTY(TypeConverter.convert(TEMP_PLAN_QTY));
		struct.setTEMP_USEOVER_QTY( ((TEMP_USEOVER_QTY == null) ? (String)null : TEMP_USEOVER_QTY[0]) );
		struct.setList_TEMP_USEOVER_QTY(TypeConverter.convert(TEMP_USEOVER_QTY));
		struct.setTEMP_PLANOUT_QTY( ((TEMP_PLANOUT_QTY == null) ? (String)null : TEMP_PLANOUT_QTY[0]) );
		struct.setList_TEMP_PLANOUT_QTY(TypeConverter.convert(TEMP_PLANOUT_QTY));
		struct.setTEMP_USE_QTY( ((TEMP_USE_QTY == null) ? (String)null : TEMP_USE_QTY[0]) );
		struct.setList_TEMP_USE_QTY(TypeConverter.convert(TEMP_USE_QTY));
		struct.setRCV_ISSUE_DATE( ((RCV_ISSUE_DATE == null) ? (String)null : RCV_ISSUE_DATE[0]) );
		struct.setList_RCV_ISSUE_DATE(TypeConverter.convert(RCV_ISSUE_DATE));
		struct.setRCV_ISSUE_COMMENT( ((RCV_ISSUE_COMMENT == null) ? (String)null : RCV_ISSUE_COMMENT[0]) );
		struct.setList_RCV_ISSUE_COMMENT(TypeConverter.convert(RCV_ISSUE_COMMENT));
		struct.setISSUE_TYP_DN( ((ISSUE_TYP_DN == null) ? (String)null : ISSUE_TYP_DN[0]) );
		struct.setList_ISSUE_TYP_DN(TypeConverter.convert(ISSUE_TYP_DN));
		struct.setISSUE_INST_UNIT_FRACTION( ((ISSUE_INST_UNIT_FRACTION == null) ? (String)null : ISSUE_INST_UNIT_FRACTION[0]) );
		struct.setList_ISSUE_INST_UNIT_FRACTION(TypeConverter.convert(ISSUE_INST_UNIT_FRACTION));
		struct.setMRP_ODR_TYP_DN( ((MRP_ODR_TYP_DN == null) ? (String)null : MRP_ODR_TYP_DN[0]) );
		struct.setList_MRP_ODR_TYP_DN(TypeConverter.convert(MRP_ODR_TYP_DN));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.seth_OPR_INST_CD( ((h_OPR_INST_CD == null) ? (String)null : h_OPR_INST_CD[0]) );
		struct.setList_h_OPR_INST_CD(TypeConverter.convert(h_OPR_INST_CD));
		struct.seth_WORK_STS_TYP( ((h_WORK_STS_TYP == null) ? (String)null : h_WORK_STS_TYP[0]) );
		struct.setList_h_WORK_STS_TYP(TypeConverter.convert(h_WORK_STS_TYP));
		struct.seth_ISSUE_TYP( ((h_ISSUE_TYP == null) ? (String)null : h_ISSUE_TYP[0]) );
		struct.setList_h_ISSUE_TYP(TypeConverter.convert(h_ISSUE_TYP));
		struct.seth_ISSUE_INST_UNIT_DENOMINATOR( ((h_ISSUE_INST_UNIT_DENOMINATOR == null) ? (String)null : h_ISSUE_INST_UNIT_DENOMINATOR[0]) );
		struct.setList_h_ISSUE_INST_UNIT_DENOMINATOR(TypeConverter.convert(h_ISSUE_INST_UNIT_DENOMINATOR));
		struct.seth_ISSUE_INST_UNIT_NUMERATOR( ((h_ISSUE_INST_UNIT_NUMERATOR == null) ? (String)null : h_ISSUE_INST_UNIT_NUMERATOR[0]) );
		struct.setList_h_ISSUE_INST_UNIT_NUMERATOR(TypeConverter.convert(h_ISSUE_INST_UNIT_NUMERATOR));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setc_COMPLETE( ((c_COMPLETE == null) ? (String)null : c_COMPLETE[0]) );
		struct.setList_c_COMPLETE(TypeConverter.convert(c_COMPLETE));
		struct.setIN_OPR_INST_CD( ((IN_OPR_INST_CD == null) ? (String)null : IN_OPR_INST_CD[0]) );
		struct.setList_IN_OPR_INST_CD(TypeConverter.convert(IN_OPR_INST_CD));
		struct.seth_ISSUE_INST_CD( ((h_ISSUE_INST_CD == null) ? (String)null : h_ISSUE_INST_CD[0]) );
		struct.setList_h_ISSUE_INST_CD(TypeConverter.convert(h_ISSUE_INST_CD));
		struct.seth_ITEM_MODIFY_COUNT( ((h_ITEM_MODIFY_COUNT == null) ? (String)null : h_ITEM_MODIFY_COUNT[0]) );
		struct.setList_h_ITEM_MODIFY_COUNT(TypeConverter.convert(h_ITEM_MODIFY_COUNT));
		struct.seth_PROC_MODIFY_COUNT( ((h_PROC_MODIFY_COUNT == null) ? (String)null : h_PROC_MODIFY_COUNT[0]) );
		struct.setList_h_PROC_MODIFY_COUNT(TypeConverter.convert(h_PROC_MODIFY_COUNT));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_FINAL_PROC_FLG( ((h_FINAL_PROC_FLG == null) ? (String)null : h_FINAL_PROC_FLG[0]) );
		struct.setList_h_FINAL_PROC_FLG(TypeConverter.convert(h_FINAL_PROC_FLG));
		struct.setl_DEFECT_CAUSE_CD( ((l_DEFECT_CAUSE_CD == null) ? (String)null : l_DEFECT_CAUSE_CD[0]) );
		struct.setList_l_DEFECT_CAUSE_CD(TypeConverter.convert(l_DEFECT_CAUSE_CD));
		struct.setl_DEFECT_QTY( ((l_DEFECT_QTY == null) ? (String)null : l_DEFECT_QTY[0]) );
		struct.setList_l_DEFECT_QTY(TypeConverter.convert(l_DEFECT_QTY));
		struct.setl_DEFECT_COMMENT( ((l_DEFECT_COMMENT == null) ? (String)null : l_DEFECT_COMMENT[0]) );
		struct.setList_l_DEFECT_COMMENT(TypeConverter.convert(l_DEFECT_COMMENT));
		struct.setl_PARTIAL_PRD_NO( ((l_PARTIAL_PRD_NO == null) ? (String)null : l_PARTIAL_PRD_NO[0]) );
		struct.setList_l_PARTIAL_PRD_NO(TypeConverter.convert(l_PARTIAL_PRD_NO));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.setRCV_ISSUE_TIME( ((RCV_ISSUE_TIME == null) ? (String)null : RCV_ISSUE_TIME[0]) );
		struct.setList_RCV_ISSUE_TIME(TypeConverter.convert(RCV_ISSUE_TIME));
		struct.setOPRATION_TIME( ((OPRATION_TIME == null) ? (String)null : OPRATION_TIME[0]) );
		struct.setList_OPRATION_TIME(TypeConverter.convert(OPRATION_TIME));
		struct.seth_OPR_DATE( ((h_OPR_DATE == null) ? (String)null : h_OPR_DATE[0]) );
		struct.setList_h_OPR_DATE(TypeConverter.convert(h_OPR_DATE));
		struct.seth_SYS_LOT_CTRL_FLG( ((h_SYS_LOT_CTRL_FLG == null) ? (String)null : h_SYS_LOT_CTRL_FLG[0]) );
		struct.setList_h_SYS_LOT_CTRL_FLG(TypeConverter.convert(h_SYS_LOT_CTRL_FLG));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.setl_LOT_NO( ((l_LOT_NO == null) ? (String)null : l_LOT_NO[0]) );
		struct.setList_l_LOT_NO(TypeConverter.convert(l_LOT_NO));
		struct.setLOT_NUMBERING_TYP( ((LOT_NUMBERING_TYP == null) ? (String)null : LOT_NUMBERING_TYP[0]) );
		struct.setList_LOT_NUMBERING_TYP(TypeConverter.convert(LOT_NUMBERING_TYP));
		struct.setparam1( ((param1 == null) ? (String)null : param1[0]) );
		struct.setList_param1(TypeConverter.convert(param1));
		struct.setLOT_CTRL_FLG( ((LOT_CTRL_FLG == null) ? (String)null : LOT_CTRL_FLG[0]) );
		struct.setList_LOT_CTRL_FLG(TypeConverter.convert(LOT_CTRL_FLG));
		struct.setparam2( ((param2 == null) ? (String)null : param2[0]) );
		struct.setList_param2(TypeConverter.convert(param2));
		struct.setparam3( ((param3 == null) ? (String)null : param3[0]) );
		struct.setList_param3(TypeConverter.convert(param3));
		struct.seth_LOT_NO( ((h_LOT_NO == null) ? (String)null : h_LOT_NO[0]) );
		struct.setList_h_LOT_NO(TypeConverter.convert(h_LOT_NO));
		struct.setl_DEFECT_CAUSE_CD_name( ((l_DEFECT_CAUSE_CD_name == null) ? (String)null : l_DEFECT_CAUSE_CD_name[0]) );
		struct.setList_l_DEFECT_CAUSE_CD_name(TypeConverter.convert(l_DEFECT_CAUSE_CD_name));
		struct.setl_DEFECT_CAUSE_CD_val( ((l_DEFECT_CAUSE_CD_val == null) ? (String)null : l_DEFECT_CAUSE_CD_val[0]) );
		struct.setList_l_DEFECT_CAUSE_CD_val(TypeConverter.convert(l_DEFECT_CAUSE_CD_val));
		struct.setc_OUTPUT( ((c_OUTPUT == null) ? (String)null : c_OUTPUT[0]) );
		struct.setList_c_OUTPUT(TypeConverter.convert(c_OUTPUT));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.seth_PROCESS_MANAGE_FLG( ((h_PROCESS_MANAGE_FLG == null) ? (String)null : h_PROCESS_MANAGE_FLG[0]) );
		struct.setList_h_PROCESS_MANAGE_FLG(TypeConverter.convert(h_PROCESS_MANAGE_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AD0040010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAD0040010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAD0040010Struct";   // JSP先のバインド名(Struct)の指定
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
					AD0040010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AD0040010Entity entity = control.entity;
		AD0040010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0040");
		logger.entering("AD0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AD0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AD0040010Control control;
		AD0040010Entity  entity = null;
		AD0040010Struct  struct = null;

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

			if( (control = (AD0040010Control)so.getAttribute("AD0040010Control_"+request.getSession(false).getId())) == null ) {
				control = new AD0040010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AD0040010Control();
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
				} else if( isClick(request, "UseParts") ) {
					if ( !isCryptical(request, so, params, "UseParts") ) return ERROR_TARGET;
					target = onClickUseParts(request, response, so, params, control);
					control.setButton("UseParts");
				} else if( isClick(request, "Update11") ) {
					if ( !isCryptical(request, so, params, "Update11") ) return ERROR_TARGET;
					target = onClickUpdate11(request, response, so, params, control);
					control.setButton("Update11");
				} else if( isClick(request, "Update12") ) {
					if ( !isCryptical(request, so, params, "Update12") ) return ERROR_TARGET;
					target = onClickUpdate12(request, response, so, params, control);
					control.setButton("Update12");
				} else if( isClick(request, "NoUserParts") ) {
					if ( !isCryptical(request, so, params, "NoUserParts") ) return ERROR_TARGET;
					target = onClickNoUserParts(request, response, so, params, control);
					control.setButton("NoUserParts");
				} else if( isClick(request, "CancelComplete") ) {
					if ( !isCryptical(request, so, params, "CancelComplete") ) return ERROR_TARGET;
					target = onClickCancelComplete(request, response, so, params, control);
					control.setButton("CancelComplete");
				} else if( isClick(request, "LineInsert") ) {
					if ( !isCryptical(request, so, params, "LineInsert") ) return ERROR_TARGET;
					target = onClickLineInsert(request, response, so, params, control);
					control.setButton("LineInsert");
				} else if( isClick(request, "LineUpdate") ) {
					if ( !isCryptical(request, so, params, "LineUpdate") ) return ERROR_TARGET;
					target = onClickLineUpdate(request, response, so, params, control);
					control.setButton("LineUpdate");
				} else if( isClick(request, "UpdateAll") ) {
					if ( !isCryptical(request, so, params, "UpdateAll") ) return ERROR_TARGET;
					target = onClickUpdateAll(request, response, so, params, control);
					control.setButton("UpdateAll");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Insert11") ) {
					if ( !isCryptical(request, so, params, "Insert11") ) return ERROR_TARGET;
					target = onClickInsert11(request, response, so, params, control);
					control.setButton("Insert11");
				} else if( isClick(request, "Return11") ) {
					if ( !isCryptical(request, so, params, "Return11") ) return ERROR_TARGET;
					target = onClickReturn11(request, response, so, params, control);
					control.setButton("Return11");
				} else if( isClick(request, "Insert12") ) {
					if ( !isCryptical(request, so, params, "Insert12") ) return ERROR_TARGET;
					target = onClickInsert12(request, response, so, params, control);
					control.setButton("Insert12");
				} else if( isClick(request, "Return12") ) {
					if ( !isCryptical(request, so, params, "Return12") ) return ERROR_TARGET;
					target = onClickReturn12(request, response, so, params, control);
					control.setButton("Return12");
				} else if( isClick(request, "ClickShow") ) {
					if ( !isCryptical(request, so, params, "ClickShow") ) return ERROR_TARGET;
					target = onClickClickShow(request, response, so, params, control);
					control.setButton("ClickShow");
				} else if( isClick(request, "LotInsert") ) {
					if ( !isCryptical(request, so, params, "LotInsert") ) return ERROR_TARGET;
					target = onClickLotInsert(request, response, so, params, control);
					control.setButton("LotInsert");
				} else if( isClick(request, "Detail") ) {
					if ( !isCryptical(request, so, params, "Detail") ) return ERROR_TARGET;
					target = onClickDetail(request, response, so, params, control);
					control.setButton("Detail");
				} else if( isClick(request, "PrintShow") ) {
					if ( !isCryptical(request, so, params, "PrintShow") ) return ERROR_TARGET;
					target = onClickPrintShow(request, response, so, params, control);
					control.setButton("PrintShow");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AD0040010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "UseParts") && bFLG_DISCONNECT_UseParts)
				|| (isClick(request, "Update11") && bFLG_DISCONNECT_Update11)
				|| (isClick(request, "Update12") && bFLG_DISCONNECT_Update12)
				|| (isClick(request, "NoUserParts") && bFLG_DISCONNECT_NoUserParts)
				|| (isClick(request, "CancelComplete") && bFLG_DISCONNECT_CancelComplete)
				|| (isClick(request, "LineInsert") && bFLG_DISCONNECT_LineInsert)
				|| (isClick(request, "LineUpdate") && bFLG_DISCONNECT_LineUpdate)
				|| (isClick(request, "UpdateAll") && bFLG_DISCONNECT_UpdateAll)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Insert11") && bFLG_DISCONNECT_Insert11)
				|| (isClick(request, "Return11") && bFLG_DISCONNECT_Return11)
				|| (isClick(request, "Insert12") && bFLG_DISCONNECT_Insert12)
				|| (isClick(request, "Return12") && bFLG_DISCONNECT_Return12)
				|| (isClick(request, "ClickShow") && bFLG_DISCONNECT_ClickShow)
				|| (isClick(request, "LotInsert") && bFLG_DISCONNECT_LotInsert)
				|| (isClick(request, "Detail") && bFLG_DISCONNECT_Detail)
				|| (isClick(request, "PrintShow") && bFLG_DISCONNECT_PrintShow)
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
	private  static boolean bFLG_DISCONNECT_UseParts = true;
	private  static boolean bFLG_DISCONNECT_Update11 = true;
	private  static boolean bFLG_DISCONNECT_Update12 = true;
	private  static boolean bFLG_DISCONNECT_NoUserParts = true;
	private  static boolean bFLG_DISCONNECT_CancelComplete = true;
	private  static boolean bFLG_DISCONNECT_LineInsert = true;
	private  static boolean bFLG_DISCONNECT_LineUpdate = true;
	private  static boolean bFLG_DISCONNECT_UpdateAll = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Insert11 = true;
	private  static boolean bFLG_DISCONNECT_Return11 = true;
	private  static boolean bFLG_DISCONNECT_Insert12 = true;
	private  static boolean bFLG_DISCONNECT_Return12 = true;
	private  static boolean bFLG_DISCONNECT_ClickShow = true;
	private  static boolean bFLG_DISCONNECT_LotInsert = true;
	private  static boolean bFLG_DISCONNECT_Detail = true;
	private  static boolean bFLG_DISCONNECT_PrintShow = true;

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
		return "com.nec.jp.orteus.metamorBase.AD0040.AD0040010Servlet";
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
	public AD0040010Servlet()
	{
		//{{user_implement_dev:<AD0040010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_UseParts = true;
		bFLG_DISCONNECT_Update11 = true;
		bFLG_DISCONNECT_Update12 = true;
		bFLG_DISCONNECT_NoUserParts = true;
		bFLG_DISCONNECT_ClickShow = true;
		bFLG_DISCONNECT_CancelComplete = true;
		bFLG_DISCONNECT_LineInsert = true;
		bFLG_DISCONNECT_LineUpdate = true;
		bFLG_DISCONNECT_UpdateAll = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Insert11 = true;
		bFLG_DISCONNECT_Return11 = true;
		bFLG_DISCONNECT_Insert12 = true;
		bFLG_DISCONNECT_Return12 = true;

                //}}user_implement_dev:<AD0040010_DisConnect_FLG>

		//{{user_implement_dev:<AD0040010Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AD0040010Servlet>
	}

	//////////////////////////////

}
