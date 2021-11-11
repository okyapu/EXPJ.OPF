/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/src/com/nec/jp/orteus/metamorBase/AH0010/AH0010020Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0010;

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

public class AH0010020Servlet extends HttpServlet
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
	 * @param control AH0010020Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AH0010020Control control)
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
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AH0010020Control control)
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
	 * @param control AH0010020Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
			logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
              //			objMessage.m_writer.write( Level.ALL, "AH0010020"+" $Revision: 1.3 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AH0010020Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("select");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("update");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("clear");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	public String onClickCsvImport(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AH0010021.jsp";		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");
		//{{user_implement_dev:<onClickCsvImport>
                //------------------------------------------------------------------------------
                try {
                 control.control_eventHandller("CsvImport");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvImport>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
                try {
                 control.control_eventHandller("return_sub1");
              
                 // 親画面に遷移
                 nextUrl = "/AH0010020.jsp";
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	public String onClickBrowse(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");
		//{{user_implement_dev:<onClickBrowse>
                //---------------------------------------------------------------------
                try {
                 control.control_eventHandller("Browse");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickBrowse>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");

		return nextUrl;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0010020Controlクラスインスタンス
	 */
	public String onClickCsvIn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");
		//{{user_implement_dev:<onClickCsvIn>
                //------------------------------------------------------------------------------
                try {
                 control.setCsvReader(new CsvReader(request));
                 control.control_eventHandller("CsvIn");
                 control.setCsvReader(null);
              
                 if(control.getMessage().sizeError() > 0)
                 {
                  // エラーがある場合、子画面のまま
                  nextUrl = "/AH0010021.jsp";
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvIn>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AH0010020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] w_DRAW_CD = ((params.containsKey("w_DRAW_CD")) ? (String[])params.get("w_DRAW_CD") : (String[])null);
		String[] w_SPEC = ((params.containsKey("w_SPEC")) ? (String[])params.get("w_SPEC") : (String[])null);
		String[] w_MRP_ODR_TYP = ((params.containsKey("w_MRP_ODR_TYP")) ? (String[])params.get("w_MRP_ODR_TYP") : (String[])null);
		String[] w_OUTSIDE_TYP = ((params.containsKey("w_OUTSIDE_TYP")) ? (String[])params.get("w_OUTSIDE_TYP") : (String[])null);
		String[] w_ABC_TYP = ((params.containsKey("w_ABC_TYP")) ? (String[])params.get("w_ABC_TYP") : (String[])null);
		String[] h_INV_FLG_JAN = ((params.containsKey("h_INV_FLG_JAN")) ? (String[])params.get("h_INV_FLG_JAN") : (String[])null);
		String[] h_INV_FLG_FEB = ((params.containsKey("h_INV_FLG_FEB")) ? (String[])params.get("h_INV_FLG_FEB") : (String[])null);
		String[] h_INV_FLG_MAR = ((params.containsKey("h_INV_FLG_MAR")) ? (String[])params.get("h_INV_FLG_MAR") : (String[])null);
		String[] h_INV_FLG_APR = ((params.containsKey("h_INV_FLG_APR")) ? (String[])params.get("h_INV_FLG_APR") : (String[])null);
		String[] h_INV_FLG_MAY = ((params.containsKey("h_INV_FLG_MAY")) ? (String[])params.get("h_INV_FLG_MAY") : (String[])null);
		String[] h_INV_FLG_JUN = ((params.containsKey("h_INV_FLG_JUN")) ? (String[])params.get("h_INV_FLG_JUN") : (String[])null);
		String[] h_INV_FLG_JUL = ((params.containsKey("h_INV_FLG_JUL")) ? (String[])params.get("h_INV_FLG_JUL") : (String[])null);
		String[] h_INV_FLG_AUG = ((params.containsKey("h_INV_FLG_AUG")) ? (String[])params.get("h_INV_FLG_AUG") : (String[])null);
		String[] h_INV_FLG_SEP = ((params.containsKey("h_INV_FLG_SEP")) ? (String[])params.get("h_INV_FLG_SEP") : (String[])null);
		String[] h_INV_FLG_OCT = ((params.containsKey("h_INV_FLG_OCT")) ? (String[])params.get("h_INV_FLG_OCT") : (String[])null);
		String[] h_INV_FLG_NOV = ((params.containsKey("h_INV_FLG_NOV")) ? (String[])params.get("h_INV_FLG_NOV") : (String[])null);
		String[] h_INV_FLG_DEC = ((params.containsKey("h_INV_FLG_DEC")) ? (String[])params.get("h_INV_FLG_DEC") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] ERR_ADR = ((params.containsKey("ERR_ADR")) ? (String[])params.get("ERR_ADR") : (String[])null);
		String[] ERR_MSG = ((params.containsKey("ERR_MSG")) ? (String[])params.get("ERR_MSG") : (String[])null);
		String[] c_INV_FLG_JAN = ((params.containsKey("c_INV_FLG_JAN")) ? (String[])params.get("c_INV_FLG_JAN") : (String[])null);
		String[] c_INV_FLG_FEB = ((params.containsKey("c_INV_FLG_FEB")) ? (String[])params.get("c_INV_FLG_FEB") : (String[])null);
		String[] c_INV_FLG_MAR = ((params.containsKey("c_INV_FLG_MAR")) ? (String[])params.get("c_INV_FLG_MAR") : (String[])null);
		String[] c_INV_FLG_APR = ((params.containsKey("c_INV_FLG_APR")) ? (String[])params.get("c_INV_FLG_APR") : (String[])null);
		String[] c_INV_FLG_MAY = ((params.containsKey("c_INV_FLG_MAY")) ? (String[])params.get("c_INV_FLG_MAY") : (String[])null);
		String[] c_INV_FLG_JUN = ((params.containsKey("c_INV_FLG_JUN")) ? (String[])params.get("c_INV_FLG_JUN") : (String[])null);
		String[] c_INV_FLG_JUL = ((params.containsKey("c_INV_FLG_JUL")) ? (String[])params.get("c_INV_FLG_JUL") : (String[])null);
		String[] c_INV_FLG_AUG = ((params.containsKey("c_INV_FLG_AUG")) ? (String[])params.get("c_INV_FLG_AUG") : (String[])null);
		String[] c_INV_FLG_SEP = ((params.containsKey("c_INV_FLG_SEP")) ? (String[])params.get("c_INV_FLG_SEP") : (String[])null);
		String[] c_INV_FLG_OCT = ((params.containsKey("c_INV_FLG_OCT")) ? (String[])params.get("c_INV_FLG_OCT") : (String[])null);
		String[] c_INV_FLG_NOV = ((params.containsKey("c_INV_FLG_NOV")) ? (String[])params.get("c_INV_FLG_NOV") : (String[])null);
		String[] c_INV_FLG_DEC = ((params.containsKey("c_INV_FLG_DEC")) ? (String[])params.get("c_INV_FLG_DEC") : (String[])null);
		String[] h_saveITEM_CD = ((params.containsKey("h_saveITEM_CD")) ? (String[])params.get("h_saveITEM_CD") : (String[])null);
		String[] FileName = ((params.containsKey("FileName")) ? (String[])params.get("FileName") : (String[])null);

		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setw_DRAW_CD( ((w_DRAW_CD == null) ? (String)null : w_DRAW_CD[0]) );
		struct.setList_w_DRAW_CD(TypeConverter.convert(w_DRAW_CD));
		struct.setw_SPEC( ((w_SPEC == null) ? (String)null : w_SPEC[0]) );
		struct.setList_w_SPEC(TypeConverter.convert(w_SPEC));
		struct.setw_MRP_ODR_TYP( ((w_MRP_ODR_TYP == null) ? (String)null : w_MRP_ODR_TYP[0]) );
		struct.setList_w_MRP_ODR_TYP(TypeConverter.convert(w_MRP_ODR_TYP));
		struct.setw_OUTSIDE_TYP( ((w_OUTSIDE_TYP == null) ? (String)null : w_OUTSIDE_TYP[0]) );
		struct.setList_w_OUTSIDE_TYP(TypeConverter.convert(w_OUTSIDE_TYP));
		struct.setw_ABC_TYP( ((w_ABC_TYP == null) ? (String)null : w_ABC_TYP[0]) );
		struct.setList_w_ABC_TYP(TypeConverter.convert(w_ABC_TYP));
		struct.seth_INV_FLG_JAN( ((h_INV_FLG_JAN == null) ? (String)null : h_INV_FLG_JAN[0]) );
		struct.setList_h_INV_FLG_JAN(TypeConverter.convert(h_INV_FLG_JAN));
		struct.seth_INV_FLG_FEB( ((h_INV_FLG_FEB == null) ? (String)null : h_INV_FLG_FEB[0]) );
		struct.setList_h_INV_FLG_FEB(TypeConverter.convert(h_INV_FLG_FEB));
		struct.seth_INV_FLG_MAR( ((h_INV_FLG_MAR == null) ? (String)null : h_INV_FLG_MAR[0]) );
		struct.setList_h_INV_FLG_MAR(TypeConverter.convert(h_INV_FLG_MAR));
		struct.seth_INV_FLG_APR( ((h_INV_FLG_APR == null) ? (String)null : h_INV_FLG_APR[0]) );
		struct.setList_h_INV_FLG_APR(TypeConverter.convert(h_INV_FLG_APR));
		struct.seth_INV_FLG_MAY( ((h_INV_FLG_MAY == null) ? (String)null : h_INV_FLG_MAY[0]) );
		struct.setList_h_INV_FLG_MAY(TypeConverter.convert(h_INV_FLG_MAY));
		struct.seth_INV_FLG_JUN( ((h_INV_FLG_JUN == null) ? (String)null : h_INV_FLG_JUN[0]) );
		struct.setList_h_INV_FLG_JUN(TypeConverter.convert(h_INV_FLG_JUN));
		struct.seth_INV_FLG_JUL( ((h_INV_FLG_JUL == null) ? (String)null : h_INV_FLG_JUL[0]) );
		struct.setList_h_INV_FLG_JUL(TypeConverter.convert(h_INV_FLG_JUL));
		struct.seth_INV_FLG_AUG( ((h_INV_FLG_AUG == null) ? (String)null : h_INV_FLG_AUG[0]) );
		struct.setList_h_INV_FLG_AUG(TypeConverter.convert(h_INV_FLG_AUG));
		struct.seth_INV_FLG_SEP( ((h_INV_FLG_SEP == null) ? (String)null : h_INV_FLG_SEP[0]) );
		struct.setList_h_INV_FLG_SEP(TypeConverter.convert(h_INV_FLG_SEP));
		struct.seth_INV_FLG_OCT( ((h_INV_FLG_OCT == null) ? (String)null : h_INV_FLG_OCT[0]) );
		struct.setList_h_INV_FLG_OCT(TypeConverter.convert(h_INV_FLG_OCT));
		struct.seth_INV_FLG_NOV( ((h_INV_FLG_NOV == null) ? (String)null : h_INV_FLG_NOV[0]) );
		struct.setList_h_INV_FLG_NOV(TypeConverter.convert(h_INV_FLG_NOV));
		struct.seth_INV_FLG_DEC( ((h_INV_FLG_DEC == null) ? (String)null : h_INV_FLG_DEC[0]) );
		struct.setList_h_INV_FLG_DEC(TypeConverter.convert(h_INV_FLG_DEC));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setERR_ADR( ((ERR_ADR == null) ? (String)null : ERR_ADR[0]) );
		struct.setList_ERR_ADR(TypeConverter.convert(ERR_ADR));
		struct.setERR_MSG( ((ERR_MSG == null) ? (String)null : ERR_MSG[0]) );
		struct.setList_ERR_MSG(TypeConverter.convert(ERR_MSG));
		struct.setc_INV_FLG_JAN( ((c_INV_FLG_JAN == null) ? (String)null : c_INV_FLG_JAN[0]) );
		struct.setList_c_INV_FLG_JAN(TypeConverter.convert(c_INV_FLG_JAN));
		struct.setc_INV_FLG_FEB( ((c_INV_FLG_FEB == null) ? (String)null : c_INV_FLG_FEB[0]) );
		struct.setList_c_INV_FLG_FEB(TypeConverter.convert(c_INV_FLG_FEB));
		struct.setc_INV_FLG_MAR( ((c_INV_FLG_MAR == null) ? (String)null : c_INV_FLG_MAR[0]) );
		struct.setList_c_INV_FLG_MAR(TypeConverter.convert(c_INV_FLG_MAR));
		struct.setc_INV_FLG_APR( ((c_INV_FLG_APR == null) ? (String)null : c_INV_FLG_APR[0]) );
		struct.setList_c_INV_FLG_APR(TypeConverter.convert(c_INV_FLG_APR));
		struct.setc_INV_FLG_MAY( ((c_INV_FLG_MAY == null) ? (String)null : c_INV_FLG_MAY[0]) );
		struct.setList_c_INV_FLG_MAY(TypeConverter.convert(c_INV_FLG_MAY));
		struct.setc_INV_FLG_JUN( ((c_INV_FLG_JUN == null) ? (String)null : c_INV_FLG_JUN[0]) );
		struct.setList_c_INV_FLG_JUN(TypeConverter.convert(c_INV_FLG_JUN));
		struct.setc_INV_FLG_JUL( ((c_INV_FLG_JUL == null) ? (String)null : c_INV_FLG_JUL[0]) );
		struct.setList_c_INV_FLG_JUL(TypeConverter.convert(c_INV_FLG_JUL));
		struct.setc_INV_FLG_AUG( ((c_INV_FLG_AUG == null) ? (String)null : c_INV_FLG_AUG[0]) );
		struct.setList_c_INV_FLG_AUG(TypeConverter.convert(c_INV_FLG_AUG));
		struct.setc_INV_FLG_SEP( ((c_INV_FLG_SEP == null) ? (String)null : c_INV_FLG_SEP[0]) );
		struct.setList_c_INV_FLG_SEP(TypeConverter.convert(c_INV_FLG_SEP));
		struct.setc_INV_FLG_OCT( ((c_INV_FLG_OCT == null) ? (String)null : c_INV_FLG_OCT[0]) );
		struct.setList_c_INV_FLG_OCT(TypeConverter.convert(c_INV_FLG_OCT));
		struct.setc_INV_FLG_NOV( ((c_INV_FLG_NOV == null) ? (String)null : c_INV_FLG_NOV[0]) );
		struct.setList_c_INV_FLG_NOV(TypeConverter.convert(c_INV_FLG_NOV));
		struct.setc_INV_FLG_DEC( ((c_INV_FLG_DEC == null) ? (String)null : c_INV_FLG_DEC[0]) );
		struct.setList_c_INV_FLG_DEC(TypeConverter.convert(c_INV_FLG_DEC));
		struct.seth_saveITEM_CD( ((h_saveITEM_CD == null) ? (String)null : h_saveITEM_CD[0]) );
		struct.setList_h_saveITEM_CD(TypeConverter.convert(h_saveITEM_CD));
		struct.setFileName( ((FileName == null) ? (String)null : FileName[0]) );
		struct.setList_FileName(TypeConverter.convert(FileName));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AH0010020.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAH0010020Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAH0010020Struct";   // JSP先のバインド名(Struct)の指定
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
					AH0010020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AH0010020Control control;
		AH0010020Entity  entity = null;
		AH0010020Struct  struct = null;

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

			if( (control = (AH0010020Control)so.getAttribute("AH0010020Control_"+request.getSession(false).getId())) == null ) {
				control = new AH0010020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AH0010020Control();
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
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "CsvImport") ) {
					if ( !isCryptical(request, so, params, "CsvImport") ) return ERROR_TARGET;
					target = onClickCsvImport(request, response, so, params, control);
					control.setButton("CsvImport");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "Browse") ) {
					if ( !isCryptical(request, so, params, "Browse") ) return ERROR_TARGET;
					target = onClickBrowse(request, response, so, params, control);
					control.setButton("Browse");
				} else if( isClick(request, "CsvIn") ) {
					if ( !isCryptical(request, so, params, "CsvIn") ) return ERROR_TARGET;
					target = onClickCsvIn(request, response, so, params, control);
					control.setButton("CsvIn");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AH0010020Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "CsvImport") && bFLG_DISCONNECT_CsvImport)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "Browse") && bFLG_DISCONNECT_Browse)
				|| (isClick(request, "CsvIn") && bFLG_DISCONNECT_CsvIn)
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
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_CsvImport = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_Browse = true;
	private  static boolean bFLG_DISCONNECT_CsvIn = true;

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
		return "com.nec.jp.orteus.metamorBase.AH0010.AH0010020Servlet";
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
	public AH0010020Servlet()
	{
		//{{user_implement_dev:<AH0010020_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_CsvImport = true;
                bFLG_DISCONNECT_return_sub1 = true;
                bFLG_DISCONNECT_Browse = true;
                bFLG_DISCONNECT_CsvIn = true;
              
                //}}user_implement_dev:<AH0010020_DisConnect_FLG>

		//{{user_implement_dev:<AH0010020Servlet>
                //}}user_implement_dev:<AH0010020Servlet>
	}

	//////////////////////////////

}
