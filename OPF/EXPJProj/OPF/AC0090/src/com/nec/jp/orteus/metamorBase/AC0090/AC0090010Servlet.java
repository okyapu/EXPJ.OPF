/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0090/src/com/nec/jp/orteus/metamorBase/AC0090/AC0090010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0090;

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

public class AC0090010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
        //------------------------------------------------------------------------------
       
        /** 
         * 画面選択データ
         * @param req HttpServletRequest request
         * @param con AC0090010Control control
         */
        //20070514 takahashi↓
		//private void setSelectRadioNo(AC0090010Control con, HttpServletRequest req)
        //{
        // con.setCheckNumber(new Integer(req.getParameter("r_Btn")));
        //}
        //20070514 takahashi↑
		
        //------------------------------------------------------------------------------
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
	 * @param control AC0090010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AC0090010Control control)
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
	 * @param control AC0090010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AC0090010Control control)
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
	 * @param control AC0090010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
			logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AC0090010"+" $Revision: 1.6 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AC0090010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------
              
                try {
              
                 setScreenMoveParams(params, control);
                 control.control_eventHandller("reload");
                 if(control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                  control.control_eventHandller("select");
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
              
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0090010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                 
                try {
                 // メッセージクリア
                 control.getMessage().clearAll();
                 
                 // 読込処理
                 control.control_eventHandller("select");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0090010Controlクラスインスタンス
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
                //------------------------------------------------------------------------------
              
                try {
              
                 // 外部デマンド紐付けサブ処理
                 control.control_eventHandller("modify");
              
                 // 子画面に遷移
                 nextUrl = "/AC0090011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * 紐付け解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0090010Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------------------
                 
                try {
                 
                 // 更新処理
                 control.control_eventHandller("update");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0090010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try {
                 // メッセージクリア
                 control.getMessage().clearAll();
                 
                 // クリア処理
                 control.control_eventHandller("clear");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0090010Controlクラスインスタンス
	 */
	public String onClickselect_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");
		//{{user_implement_dev:<onClickselect_sub1>
                //------------------------------------------------------------------------------
              
                try {
              
                 // 読込処理
                 control.control_eventHandller("select_sub1");
              
                 // 子画面に遷移
                 nextUrl = "/AC0090011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickselect_sub1>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0090010Controlクラスインスタンス
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
                 
                try {
              
                 // 戻る処理
                 control.control_eventHandller("return_sub1");
              
                 // 親画面に遷移
                 nextUrl = "/AC0090010.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AC0090010Controlクラスインスタンス
	 */
	public String onClickupdate_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");
		//{{user_implement_dev:<onClickupdate_sub1>
                //------------------------------------------------------------------------------
                 
                try {
              
                 // 更新処理
                 control.control_eventHandller("update_sub1");
                 
                 // エラー発生の場合、子画面に遷移
                 if(control.getMessage().sizeError() > 0) {
                  nextUrl = "/AC0090011.jsp";
                 } else {
                  // 親画面に遷移
                  nextUrl = "/AC0090010.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate_sub1>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AC0090010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_PLANT_NAME = ((params.containsKey("w_PLANT_NAME")) ? (String[])params.get("w_PLANT_NAME") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] w_DATE_FROM = ((params.containsKey("w_DATE_FROM")) ? (String[])params.get("w_DATE_FROM") : (String[])null);
		String[] w_DATE_TO = ((params.containsKey("w_DATE_TO")) ? (String[])params.get("w_DATE_TO") : (String[])null);
		String[] w_DRAW_CD = ((params.containsKey("w_DRAW_CD")) ? (String[])params.get("w_DRAW_CD") : (String[])null);
		String[] w_SPEC = ((params.containsKey("w_SPEC")) ? (String[])params.get("w_SPEC") : (String[])null);
		String[] w_MRP_ODR_TYP = ((params.containsKey("w_MRP_ODR_TYP")) ? (String[])params.get("w_MRP_ODR_TYP") : (String[])null);
		String[] w_OUTSIDE_TYP = ((params.containsKey("w_OUTSIDE_TYP")) ? (String[])params.get("w_OUTSIDE_TYP") : (String[])null);
		String[] w_ITEM_SPOIL = ((params.containsKey("w_ITEM_SPOIL")) ? (String[])params.get("w_ITEM_SPOIL") : (String[])null);
		String[] w_UNIT_QTY_TYP = ((params.containsKey("w_UNIT_QTY_TYP")) ? (String[])params.get("w_UNIT_QTY_TYP") : (String[])null);
		String[] w_LOT_SIZING_TYP = ((params.containsKey("w_LOT_SIZING_TYP")) ? (String[])params.get("w_LOT_SIZING_TYP") : (String[])null);
		String[] w_MAX_PERIOD = ((params.containsKey("w_MAX_PERIOD")) ? (String[])params.get("w_MAX_PERIOD") : (String[])null);
		String[] w_MUL_ODR_QTY = ((params.containsKey("w_MUL_ODR_QTY")) ? (String[])params.get("w_MUL_ODR_QTY") : (String[])null);
		String[] w_SAFETY_STOCK = ((params.containsKey("w_SAFETY_STOCK")) ? (String[])params.get("w_SAFETY_STOCK") : (String[])null);
		String[] w_MAX_ODR_QTY = ((params.containsKey("w_MAX_ODR_QTY")) ? (String[])params.get("w_MAX_ODR_QTY") : (String[])null);
		String[] w_MIN_ODR_QTY = ((params.containsKey("w_MIN_ODR_QTY")) ? (String[])params.get("w_MIN_ODR_QTY") : (String[])null);
		String[] EXTERNAL_PLAN_CD = ((params.containsKey("EXTERNAL_PLAN_CD")) ? (String[])params.get("EXTERNAL_PLAN_CD") : (String[])null);
		String[] DUE_DATE = ((params.containsKey("DUE_DATE")) ? (String[])params.get("DUE_DATE") : (String[])null);
		String[] DM_QTY = ((params.containsKey("DM_QTY")) ? (String[])params.get("DM_QTY") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] w_subDUE_DATE = ((params.containsKey("w_subDUE_DATE")) ? (String[])params.get("w_subDUE_DATE") : (String[])null);
		String[] w_subDM_QTY = ((params.containsKey("w_subDM_QTY")) ? (String[])params.get("w_subDM_QTY") : (String[])null);
		String[] w_subITEM_CD = ((params.containsKey("w_subITEM_CD")) ? (String[])params.get("w_subITEM_CD") : (String[])null);
		String[] w_subITEM_NAME = ((params.containsKey("w_subITEM_NAME")) ? (String[])params.get("w_subITEM_NAME") : (String[])null);
		String[] w_subEXTERNAL_PLAN_CD = ((params.containsKey("w_subEXTERNAL_PLAN_CD")) ? (String[])params.get("w_subEXTERNAL_PLAN_CD") : (String[])null);
		String[] w_subPLANT_CD = ((params.containsKey("w_subPLANT_CD")) ? (String[])params.get("w_subPLANT_CD") : (String[])null);
		String[] w_subPLANT_NAME = ((params.containsKey("w_subPLANT_NAME")) ? (String[])params.get("w_subPLANT_NAME") : (String[])null);
		String[] w_subDATE_FROM = ((params.containsKey("w_subDATE_FROM")) ? (String[])params.get("w_subDATE_FROM") : (String[])null);
		String[] w_subDATE_TO = ((params.containsKey("w_subDATE_TO")) ? (String[])params.get("w_subDATE_TO") : (String[])null);
		String[] subITEM_CD = ((params.containsKey("subITEM_CD")) ? (String[])params.get("subITEM_CD") : (String[])null);
		String[] subITEM_NAME = ((params.containsKey("subITEM_NAME")) ? (String[])params.get("subITEM_NAME") : (String[])null);
		String[] subODR_START_DATE = ((params.containsKey("subODR_START_DATE")) ? (String[])params.get("subODR_START_DATE") : (String[])null);
		String[] subPRD_START_DATE = ((params.containsKey("subPRD_START_DATE")) ? (String[])params.get("subPRD_START_DATE") : (String[])null);
		String[] subODR_QTY = ((params.containsKey("subODR_QTY")) ? (String[])params.get("subODR_QTY") : (String[])null);
		String[] subSU_DM_QTY = ((params.containsKey("subSU_DM_QTY")) ? (String[])params.get("subSU_DM_QTY") : (String[])null);
		String[] subRE_ODR_QTY = ((params.containsKey("subRE_ODR_QTY")) ? (String[])params.get("subRE_ODR_QTY") : (String[])null);
		String[] subPRD_DUE_DATE = ((params.containsKey("subPRD_DUE_DATE")) ? (String[])params.get("subPRD_DUE_DATE") : (String[])null);
		String[] subJOB_ODR_CD = ((params.containsKey("subJOB_ODR_CD")) ? (String[])params.get("subJOB_ODR_CD") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] subMODIFY_COUNT = ((params.containsKey("subMODIFY_COUNT")) ? (String[])params.get("subMODIFY_COUNT") : (String[])null);
		String[] OD_NO = ((params.containsKey("OD_NO")) ? (String[])params.get("OD_NO") : (String[])null);
		String[] CP_UNIT = ((params.containsKey("CP_UNIT")) ? (String[])params.get("CP_UNIT") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] subOD_NO = ((params.containsKey("subOD_NO")) ? (String[])params.get("subOD_NO") : (String[])null);
		String[] subPS_UNIT_NUMERATOR = ((params.containsKey("subPS_UNIT_NUMERATOR")) ? (String[])params.get("subPS_UNIT_NUMERATOR") : (String[])null);
		String[] subPS_UNIT_DENOMINATOR = ((params.containsKey("subPS_UNIT_DENOMINATOR")) ? (String[])params.get("subPS_UNIT_DENOMINATOR") : (String[])null);
		String[] w_TIME_FROM = ((params.containsKey("w_TIME_FROM")) ? (String[])params.get("w_TIME_FROM") : (String[])null);
		String[] w_TIME_TO = ((params.containsKey("w_TIME_TO")) ? (String[])params.get("w_TIME_TO") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] w_subTIME_FROM = ((params.containsKey("w_subTIME_FROM")) ? (String[])params.get("w_subTIME_FROM") : (String[])null);
		String[] w_subTIME_TO = ((params.containsKey("w_subTIME_TO")) ? (String[])params.get("w_subTIME_TO") : (String[])null);
		String[] w_subDUE_TIME = ((params.containsKey("w_subDUE_TIME")) ? (String[])params.get("w_subDUE_TIME") : (String[])null);

		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_PLANT_NAME( ((w_PLANT_NAME == null) ? (String)null : w_PLANT_NAME[0]) );
		struct.setList_w_PLANT_NAME(TypeConverter.convert(w_PLANT_NAME));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setw_DATE_FROM( ((w_DATE_FROM == null) ? (String)null : w_DATE_FROM[0]) );
		struct.setList_w_DATE_FROM(TypeConverter.convert(w_DATE_FROM));
		struct.setw_DATE_TO( ((w_DATE_TO == null) ? (String)null : w_DATE_TO[0]) );
		struct.setList_w_DATE_TO(TypeConverter.convert(w_DATE_TO));
		struct.setw_DRAW_CD( ((w_DRAW_CD == null) ? (String)null : w_DRAW_CD[0]) );
		struct.setList_w_DRAW_CD(TypeConverter.convert(w_DRAW_CD));
		struct.setw_SPEC( ((w_SPEC == null) ? (String)null : w_SPEC[0]) );
		struct.setList_w_SPEC(TypeConverter.convert(w_SPEC));
		struct.setw_MRP_ODR_TYP( ((w_MRP_ODR_TYP == null) ? (String)null : w_MRP_ODR_TYP[0]) );
		struct.setList_w_MRP_ODR_TYP(TypeConverter.convert(w_MRP_ODR_TYP));
		struct.setw_OUTSIDE_TYP( ((w_OUTSIDE_TYP == null) ? (String)null : w_OUTSIDE_TYP[0]) );
		struct.setList_w_OUTSIDE_TYP(TypeConverter.convert(w_OUTSIDE_TYP));
		struct.setw_ITEM_SPOIL( ((w_ITEM_SPOIL == null) ? (String)null : w_ITEM_SPOIL[0]) );
		struct.setList_w_ITEM_SPOIL(TypeConverter.convert(w_ITEM_SPOIL));
		struct.setw_UNIT_QTY_TYP( ((w_UNIT_QTY_TYP == null) ? (String)null : w_UNIT_QTY_TYP[0]) );
		struct.setList_w_UNIT_QTY_TYP(TypeConverter.convert(w_UNIT_QTY_TYP));
		struct.setw_LOT_SIZING_TYP( ((w_LOT_SIZING_TYP == null) ? (String)null : w_LOT_SIZING_TYP[0]) );
		struct.setList_w_LOT_SIZING_TYP(TypeConverter.convert(w_LOT_SIZING_TYP));
		struct.setw_MAX_PERIOD( ((w_MAX_PERIOD == null) ? (String)null : w_MAX_PERIOD[0]) );
		struct.setList_w_MAX_PERIOD(TypeConverter.convert(w_MAX_PERIOD));
		struct.setw_MUL_ODR_QTY( ((w_MUL_ODR_QTY == null) ? (String)null : w_MUL_ODR_QTY[0]) );
		struct.setList_w_MUL_ODR_QTY(TypeConverter.convert(w_MUL_ODR_QTY));
		struct.setw_SAFETY_STOCK( ((w_SAFETY_STOCK == null) ? (String)null : w_SAFETY_STOCK[0]) );
		struct.setList_w_SAFETY_STOCK(TypeConverter.convert(w_SAFETY_STOCK));
		struct.setw_MAX_ODR_QTY( ((w_MAX_ODR_QTY == null) ? (String)null : w_MAX_ODR_QTY[0]) );
		struct.setList_w_MAX_ODR_QTY(TypeConverter.convert(w_MAX_ODR_QTY));
		struct.setw_MIN_ODR_QTY( ((w_MIN_ODR_QTY == null) ? (String)null : w_MIN_ODR_QTY[0]) );
		struct.setList_w_MIN_ODR_QTY(TypeConverter.convert(w_MIN_ODR_QTY));
		struct.setEXTERNAL_PLAN_CD( ((EXTERNAL_PLAN_CD == null) ? (String)null : EXTERNAL_PLAN_CD[0]) );
		struct.setList_EXTERNAL_PLAN_CD(TypeConverter.convert(EXTERNAL_PLAN_CD));
		struct.setDUE_DATE( ((DUE_DATE == null) ? (String)null : DUE_DATE[0]) );
		struct.setList_DUE_DATE(TypeConverter.convert(DUE_DATE));
		struct.setDM_QTY( ((DM_QTY == null) ? (String)null : DM_QTY[0]) );
		struct.setList_DM_QTY(TypeConverter.convert(DM_QTY));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setw_subDUE_DATE( ((w_subDUE_DATE == null) ? (String)null : w_subDUE_DATE[0]) );
		struct.setList_w_subDUE_DATE(TypeConverter.convert(w_subDUE_DATE));
		struct.setw_subDM_QTY( ((w_subDM_QTY == null) ? (String)null : w_subDM_QTY[0]) );
		struct.setList_w_subDM_QTY(TypeConverter.convert(w_subDM_QTY));
		struct.setw_subITEM_CD( ((w_subITEM_CD == null) ? (String)null : w_subITEM_CD[0]) );
		struct.setList_w_subITEM_CD(TypeConverter.convert(w_subITEM_CD));
		struct.setw_subITEM_NAME( ((w_subITEM_NAME == null) ? (String)null : w_subITEM_NAME[0]) );
		struct.setList_w_subITEM_NAME(TypeConverter.convert(w_subITEM_NAME));
		struct.setw_subEXTERNAL_PLAN_CD( ((w_subEXTERNAL_PLAN_CD == null) ? (String)null : w_subEXTERNAL_PLAN_CD[0]) );
		struct.setList_w_subEXTERNAL_PLAN_CD(TypeConverter.convert(w_subEXTERNAL_PLAN_CD));
		struct.setw_subPLANT_CD( ((w_subPLANT_CD == null) ? (String)null : w_subPLANT_CD[0]) );
		struct.setList_w_subPLANT_CD(TypeConverter.convert(w_subPLANT_CD));
		struct.setw_subPLANT_NAME( ((w_subPLANT_NAME == null) ? (String)null : w_subPLANT_NAME[0]) );
		struct.setList_w_subPLANT_NAME(TypeConverter.convert(w_subPLANT_NAME));
		struct.setw_subDATE_FROM( ((w_subDATE_FROM == null) ? (String)null : w_subDATE_FROM[0]) );
		struct.setList_w_subDATE_FROM(TypeConverter.convert(w_subDATE_FROM));
		struct.setw_subDATE_TO( ((w_subDATE_TO == null) ? (String)null : w_subDATE_TO[0]) );
		struct.setList_w_subDATE_TO(TypeConverter.convert(w_subDATE_TO));
		struct.setsubITEM_CD( ((subITEM_CD == null) ? (String)null : subITEM_CD[0]) );
		struct.setList_subITEM_CD(TypeConverter.convert(subITEM_CD));
		struct.setsubITEM_NAME( ((subITEM_NAME == null) ? (String)null : subITEM_NAME[0]) );
		struct.setList_subITEM_NAME(TypeConverter.convert(subITEM_NAME));
		struct.setsubODR_START_DATE( ((subODR_START_DATE == null) ? (String)null : subODR_START_DATE[0]) );
		struct.setList_subODR_START_DATE(TypeConverter.convert(subODR_START_DATE));
		struct.setsubPRD_START_DATE( ((subPRD_START_DATE == null) ? (String)null : subPRD_START_DATE[0]) );
		struct.setList_subPRD_START_DATE(TypeConverter.convert(subPRD_START_DATE));
		struct.setsubODR_QTY( ((subODR_QTY == null) ? (String)null : subODR_QTY[0]) );
		struct.setList_subODR_QTY(TypeConverter.convert(subODR_QTY));
		struct.setsubSU_DM_QTY( ((subSU_DM_QTY == null) ? (String)null : subSU_DM_QTY[0]) );
		struct.setList_subSU_DM_QTY(TypeConverter.convert(subSU_DM_QTY));
		struct.setsubRE_ODR_QTY( ((subRE_ODR_QTY == null) ? (String)null : subRE_ODR_QTY[0]) );
		struct.setList_subRE_ODR_QTY(TypeConverter.convert(subRE_ODR_QTY));
		struct.setsubPRD_DUE_DATE( ((subPRD_DUE_DATE == null) ? (String)null : subPRD_DUE_DATE[0]) );
		struct.setList_subPRD_DUE_DATE(TypeConverter.convert(subPRD_DUE_DATE));
		struct.setsubJOB_ODR_CD( ((subJOB_ODR_CD == null) ? (String)null : subJOB_ODR_CD[0]) );
		struct.setList_subJOB_ODR_CD(TypeConverter.convert(subJOB_ODR_CD));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setsubMODIFY_COUNT( ((subMODIFY_COUNT == null) ? (String)null : subMODIFY_COUNT[0]) );
		struct.setList_subMODIFY_COUNT(TypeConverter.convert(subMODIFY_COUNT));
		struct.setOD_NO( ((OD_NO == null) ? (String)null : OD_NO[0]) );
		struct.setList_OD_NO(TypeConverter.convert(OD_NO));
		struct.setCP_UNIT( ((CP_UNIT == null) ? (String)null : CP_UNIT[0]) );
		struct.setList_CP_UNIT(TypeConverter.convert(CP_UNIT));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setsubOD_NO( ((subOD_NO == null) ? (String)null : subOD_NO[0]) );
		struct.setList_subOD_NO(TypeConverter.convert(subOD_NO));
		struct.setsubPS_UNIT_NUMERATOR( ((subPS_UNIT_NUMERATOR == null) ? (String)null : subPS_UNIT_NUMERATOR[0]) );
		struct.setList_subPS_UNIT_NUMERATOR(TypeConverter.convert(subPS_UNIT_NUMERATOR));
		struct.setsubPS_UNIT_DENOMINATOR( ((subPS_UNIT_DENOMINATOR == null) ? (String)null : subPS_UNIT_DENOMINATOR[0]) );
		struct.setList_subPS_UNIT_DENOMINATOR(TypeConverter.convert(subPS_UNIT_DENOMINATOR));
		struct.setw_TIME_FROM( ((w_TIME_FROM == null) ? (String)null : w_TIME_FROM[0]) );
		struct.setList_w_TIME_FROM(TypeConverter.convert(w_TIME_FROM));
		struct.setw_TIME_TO( ((w_TIME_TO == null) ? (String)null : w_TIME_TO[0]) );
		struct.setList_w_TIME_TO(TypeConverter.convert(w_TIME_TO));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.setw_subTIME_FROM( ((w_subTIME_FROM == null) ? (String)null : w_subTIME_FROM[0]) );
		struct.setList_w_subTIME_FROM(TypeConverter.convert(w_subTIME_FROM));
		struct.setw_subTIME_TO( ((w_subTIME_TO == null) ? (String)null : w_subTIME_TO[0]) );
		struct.setList_w_subTIME_TO(TypeConverter.convert(w_subTIME_TO));
		struct.setw_subDUE_TIME( ((w_subDUE_TIME == null) ? (String)null : w_subDUE_TIME[0]) );
		struct.setList_w_subDUE_TIME(TypeConverter.convert(w_subDUE_TIME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AC0090010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAC0090010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAC0090010Struct";   // JSP先のバインド名(Struct)の指定
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
					AC0090010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AC0090010Control control;
		AC0090010Entity  entity = null;
		AC0090010Struct  struct = null;

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

			if( (control = (AC0090010Control)so.getAttribute("AC0090010Control_"+request.getSession(false).getId())) == null ) {
				control = new AC0090010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AC0090010Control();
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
				} else if( isClick(request, "modify") ) {
					if ( !isCryptical(request, so, params, "modify") ) return ERROR_TARGET;
					target = onClickmodify(request, response, so, params, control);
					control.setButton("modify");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "select_sub1") ) {
					if ( !isCryptical(request, so, params, "select_sub1") ) return ERROR_TARGET;
					target = onClickselect_sub1(request, response, so, params, control);
					control.setButton("select_sub1");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "update_sub1") ) {
					if ( !isCryptical(request, so, params, "update_sub1") ) return ERROR_TARGET;
					target = onClickupdate_sub1(request, response, so, params, control);
					control.setButton("update_sub1");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AC0090010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "modify") && bFLG_DISCONNECT_modify)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "select_sub1") && bFLG_DISCONNECT_select_sub1)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "update_sub1") && bFLG_DISCONNECT_update_sub1)
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
	private  static boolean bFLG_DISCONNECT_modify = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_select_sub1 = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_update_sub1 = true;

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
		return "com.nec.jp.orteus.metamorBase.AC0090.AC0090010Servlet";
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
	public AC0090010Servlet()
	{
		//{{user_implement_dev:<AC0090010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_modify = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_clear = true;
              
                //}}user_implement_dev:<AC0090010_DisConnect_FLG>

		//{{user_implement_dev:<AC0090010Servlet>
                 
                //}}user_implement_dev:<AC0090010Servlet>
	}

	//////////////////////////////

}
