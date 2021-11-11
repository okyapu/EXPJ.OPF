/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0060/src/com/nec/jp/orteus/metamorBase/AF0060/AF0060010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0060;

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

public class AF0060010Servlet extends HttpServlet
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
	 * @param control AF0060010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AF0060010Control control)
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
	 * @param control AF0060010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AF0060010Control control)
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
	 * @param control AF0060010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
			logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
              //			objMessage.m_writer.write( Level.ALL, "AF0060010"+" $Revision: 1.18 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AF0060010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //---------------------------------------------------------------------
                try {
                 // 工場コード取得
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0060010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //---------------------------------------------------------------------
                try {
                 // 工場コード取得
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("select");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0060010Controlクラスインスタンス
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
                //------------------------------------------------------------------
                try {
                 // 工場コード取得
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("modify");
              
                 if(control.getMessage().sizeError() <= 0){
                  // 子画面に遷移
                  nextUrl = "/AF0060011.jsp";
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0060010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //---------------------------------------------------------------------
                try {
                 // 工場コード取得
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("clear");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0060010Controlクラスインスタンス
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
		//{{user_implement_dev:<onClickinsertSub1>
                //---------------------------------------------------------------------
                try {
                 // 工場コード取得
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("insertSub1");
              
                 // チェックでエラーが発生している場合
                 if(control.getMessage().sizeError() > 0)
                 {
                  // 再び子画面に遷移
                  nextUrl = "/AF0060011.jsp";
                 }
                 else {
                  // 読込処理
                  control.controlselect();
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0060010Controlクラスインスタンス
	 */
	public String onClickcloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");
		//{{user_implement_dev:<onClickcloseSub1>
                //------------------------------------------------------------------
                try{
                 // 工場コード取得
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 // 親画面に遷移
                 nextUrl = "/AF0060010.jsp";
              
                 control.control_eventHandller("closeSub1");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickcloseSub1>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");

		return nextUrl;
	}

	/**
	 * 選択完了解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0060010Controlクラスインスタンス
	 */
	public String onClickCancelCompleteChoice(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelCompleteChoice");
		//{{user_implement_dev:<onClickCancelCompleteChoice>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CancelCompleteChoice");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelCompleteChoice>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelCompleteChoice");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AF0060010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] RCV_WH_CD = ((params.containsKey("RCV_WH_CD")) ? (String[])params.get("RCV_WH_CD") : (String[])null);
		String[] TRANSPORT_CMPLT_TYP = ((params.containsKey("TRANSPORT_CMPLT_TYP")) ? (String[])params.get("TRANSPORT_CMPLT_TYP") : (String[])null);
		String[] TRANSPORT_CMPLT_TYP_name = ((params.containsKey("TRANSPORT_CMPLT_TYP_name")) ? (String[])params.get("TRANSPORT_CMPLT_TYP_name") : (String[])null);
		String[] TRANSPORT_CMPLT_TYP_val = ((params.containsKey("TRANSPORT_CMPLT_TYP_val")) ? (String[])params.get("TRANSPORT_CMPLT_TYP_val") : (String[])null);
		String[] TRANSPORT_SLIP_CD = ((params.containsKey("TRANSPORT_SLIP_CD")) ? (String[])params.get("TRANSPORT_SLIP_CD") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] ISSUE_PLANT_CD = ((params.containsKey("ISSUE_PLANT_CD")) ? (String[])params.get("ISSUE_PLANT_CD") : (String[])null);
		String[] ISSUE_PLANT_NAME = ((params.containsKey("ISSUE_PLANT_NAME")) ? (String[])params.get("ISSUE_PLANT_NAME") : (String[])null);
		String[] ISSUE_WH_CD = ((params.containsKey("ISSUE_WH_CD")) ? (String[])params.get("ISSUE_WH_CD") : (String[])null);
		String[] ISSUE_WH_NAME = ((params.containsKey("ISSUE_WH_NAME")) ? (String[])params.get("ISSUE_WH_NAME") : (String[])null);
		String[] RCV_PLANT_CD = ((params.containsKey("RCV_PLANT_CD")) ? (String[])params.get("RCV_PLANT_CD") : (String[])null);
		String[] RCV_PLANT_NAME = ((params.containsKey("RCV_PLANT_NAME")) ? (String[])params.get("RCV_PLANT_NAME") : (String[])null);
		String[] RCV_WH_NAME = ((params.containsKey("RCV_WH_NAME")) ? (String[])params.get("RCV_WH_NAME") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] ISSUE_DATE = ((params.containsKey("ISSUE_DATE")) ? (String[])params.get("ISSUE_DATE") : (String[])null);
		String[] ISSUE_QTY = ((params.containsKey("ISSUE_QTY")) ? (String[])params.get("ISSUE_QTY") : (String[])null);
		String[] RCV_DATE = ((params.containsKey("RCV_DATE")) ? (String[])params.get("RCV_DATE") : (String[])null);
		String[] RCV_QTY = ((params.containsKey("RCV_QTY")) ? (String[])params.get("RCV_QTY") : (String[])null);
		String[] w_WH_STOCK_ON_HAND_QTY = ((params.containsKey("w_WH_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_WH_STOCK_ON_HAND_QTY") : (String[])null);
		String[] w_TOTAL_STOCK_ON_HAND_QTY = ((params.containsKey("w_TOTAL_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_TOTAL_STOCK_ON_HAND_QTY") : (String[])null);
		String[] RCV_ISSUE_DATE = ((params.containsKey("RCV_ISSUE_DATE")) ? (String[])params.get("RCV_ISSUE_DATE") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] w_LEAVE_RCV_QTY = ((params.containsKey("w_LEAVE_RCV_QTY")) ? (String[])params.get("w_LEAVE_RCV_QTY") : (String[])null);
		String[] w_UNIT_QTY_TYP = ((params.containsKey("w_UNIT_QTY_TYP")) ? (String[])params.get("w_UNIT_QTY_TYP") : (String[])null);
		String[] w_BUSINESS_OPR_DATE = ((params.containsKey("w_BUSINESS_OPR_DATE")) ? (String[])params.get("w_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_TRANSPORT_CMPLT_TYP = ((params.containsKey("h_TRANSPORT_CMPLT_TYP")) ? (String[])params.get("h_TRANSPORT_CMPLT_TYP") : (String[])null);
		String[] w_MODIFY_COUNT = ((params.containsKey("w_MODIFY_COUNT")) ? (String[])params.get("w_MODIFY_COUNT") : (String[])null);
		String[] RCV_ISSUE_QTY = ((params.containsKey("RCV_ISSUE_QTY")) ? (String[])params.get("RCV_ISSUE_QTY") : (String[])null);
		String[] c_TRANSPORT_CMPLT_TYP = ((params.containsKey("c_TRANSPORT_CMPLT_TYP")) ? (String[])params.get("c_TRANSPORT_CMPLT_TYP") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] h_lotCtrl = ((params.containsKey("h_lotCtrl")) ? (String[])params.get("h_lotCtrl") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] STOCK_ON_HAND_QTY = ((params.containsKey("STOCK_ON_HAND_QTY")) ? (String[])params.get("STOCK_ON_HAND_QTY") : (String[])null);
		String[] DEFECT_QTY = ((params.containsKey("DEFECT_QTY")) ? (String[])params.get("DEFECT_QTY") : (String[])null);
		String[] ALLOCABLE_QTY = ((params.containsKey("ALLOCABLE_QTY")) ? (String[])params.get("ALLOCABLE_QTY") : (String[])null);
		String[] h_lotFlg = ((params.containsKey("h_lotFlg")) ? (String[])params.get("h_lotFlg") : (String[])null);
		String[] RCV_ISSUE_COMMENT = ((params.containsKey("RCV_ISSUE_COMMENT")) ? (String[])params.get("RCV_ISSUE_COMMENT") : (String[])null);
		String[] ISSUE_COMMENT = ((params.containsKey("ISSUE_COMMENT")) ? (String[])params.get("ISSUE_COMMENT") : (String[])null);
		String[] hid_TRANSPORT_CMPLT_TYP = ((params.containsKey("hid_TRANSPORT_CMPLT_TYP")) ? (String[])params.get("hid_TRANSPORT_CMPLT_TYP") : (String[])null);

		struct.setRCV_WH_CD( ((RCV_WH_CD == null) ? (String)null : RCV_WH_CD[0]) );
		struct.setList_RCV_WH_CD(TypeConverter.convert(RCV_WH_CD));
		if( (TRANSPORT_CMPLT_TYP == null)||("".equals(TRANSPORT_CMPLT_TYP[0])) ) {
		   struct.setTRANSPORT_CMPLT_TYP( (Integer)null );
		} else {
		   struct.setTRANSPORT_CMPLT_TYP( new Integer(TRANSPORT_CMPLT_TYP[0]) );
		   struct.setList_TRANSPORT_CMPLT_TYP(TypeConverter.convert(TRANSPORT_CMPLT_TYP));
		}
		struct.setTRANSPORT_CMPLT_TYP_name( ((TRANSPORT_CMPLT_TYP_name == null) ? (String)null : TRANSPORT_CMPLT_TYP_name[0]) );
		struct.setList_TRANSPORT_CMPLT_TYP_name(TypeConverter.convert(TRANSPORT_CMPLT_TYP_name));
		if( (TRANSPORT_CMPLT_TYP_val == null)||("".equals(TRANSPORT_CMPLT_TYP_val[0])) ) {
		   struct.setTRANSPORT_CMPLT_TYP_val( (Integer)null );
		} else {
		   struct.setTRANSPORT_CMPLT_TYP_val( new Integer(TRANSPORT_CMPLT_TYP_val[0]) );
		   struct.setList_TRANSPORT_CMPLT_TYP_val(TypeConverter.convert(TRANSPORT_CMPLT_TYP_val));
		}
		struct.setTRANSPORT_SLIP_CD( ((TRANSPORT_SLIP_CD == null) ? (String)null : TRANSPORT_SLIP_CD[0]) );
		struct.setList_TRANSPORT_SLIP_CD(TypeConverter.convert(TRANSPORT_SLIP_CD));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setISSUE_PLANT_CD( ((ISSUE_PLANT_CD == null) ? (String)null : ISSUE_PLANT_CD[0]) );
		struct.setList_ISSUE_PLANT_CD(TypeConverter.convert(ISSUE_PLANT_CD));
		struct.setISSUE_PLANT_NAME( ((ISSUE_PLANT_NAME == null) ? (String)null : ISSUE_PLANT_NAME[0]) );
		struct.setList_ISSUE_PLANT_NAME(TypeConverter.convert(ISSUE_PLANT_NAME));
		struct.setISSUE_WH_CD( ((ISSUE_WH_CD == null) ? (String)null : ISSUE_WH_CD[0]) );
		struct.setList_ISSUE_WH_CD(TypeConverter.convert(ISSUE_WH_CD));
		struct.setISSUE_WH_NAME( ((ISSUE_WH_NAME == null) ? (String)null : ISSUE_WH_NAME[0]) );
		struct.setList_ISSUE_WH_NAME(TypeConverter.convert(ISSUE_WH_NAME));
		struct.setRCV_PLANT_CD( ((RCV_PLANT_CD == null) ? (String)null : RCV_PLANT_CD[0]) );
		struct.setList_RCV_PLANT_CD(TypeConverter.convert(RCV_PLANT_CD));
		struct.setRCV_PLANT_NAME( ((RCV_PLANT_NAME == null) ? (String)null : RCV_PLANT_NAME[0]) );
		struct.setList_RCV_PLANT_NAME(TypeConverter.convert(RCV_PLANT_NAME));
		struct.setRCV_WH_NAME( ((RCV_WH_NAME == null) ? (String)null : RCV_WH_NAME[0]) );
		struct.setList_RCV_WH_NAME(TypeConverter.convert(RCV_WH_NAME));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setISSUE_DATE( ((ISSUE_DATE == null) ? (String)null : ISSUE_DATE[0]) );
		struct.setList_ISSUE_DATE(TypeConverter.convert(ISSUE_DATE));
		struct.setISSUE_QTY( ((ISSUE_QTY == null) ? (String)null : ISSUE_QTY[0]) );
		struct.setList_ISSUE_QTY(TypeConverter.convert(ISSUE_QTY));
		struct.setRCV_DATE( ((RCV_DATE == null) ? (String)null : RCV_DATE[0]) );
		struct.setList_RCV_DATE(TypeConverter.convert(RCV_DATE));
		struct.setRCV_QTY( ((RCV_QTY == null) ? (String)null : RCV_QTY[0]) );
		struct.setList_RCV_QTY(TypeConverter.convert(RCV_QTY));
		struct.setw_WH_STOCK_ON_HAND_QTY( ((w_WH_STOCK_ON_HAND_QTY == null) ? (String)null : w_WH_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_WH_STOCK_ON_HAND_QTY(TypeConverter.convert(w_WH_STOCK_ON_HAND_QTY));
		struct.setw_TOTAL_STOCK_ON_HAND_QTY( ((w_TOTAL_STOCK_ON_HAND_QTY == null) ? (String)null : w_TOTAL_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_TOTAL_STOCK_ON_HAND_QTY(TypeConverter.convert(w_TOTAL_STOCK_ON_HAND_QTY));
		struct.setRCV_ISSUE_DATE( ((RCV_ISSUE_DATE == null) ? (String)null : RCV_ISSUE_DATE[0]) );
		struct.setList_RCV_ISSUE_DATE(TypeConverter.convert(RCV_ISSUE_DATE));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setw_LEAVE_RCV_QTY( ((w_LEAVE_RCV_QTY == null) ? (String)null : w_LEAVE_RCV_QTY[0]) );
		struct.setList_w_LEAVE_RCV_QTY(TypeConverter.convert(w_LEAVE_RCV_QTY));
		if( (w_UNIT_QTY_TYP == null)||("".equals(w_UNIT_QTY_TYP[0])) ) {
		   struct.setw_UNIT_QTY_TYP( (Integer)null );
		} else {
		   struct.setw_UNIT_QTY_TYP( new Integer(w_UNIT_QTY_TYP[0]) );
		   struct.setList_w_UNIT_QTY_TYP(TypeConverter.convert(w_UNIT_QTY_TYP));
		}
		struct.setw_BUSINESS_OPR_DATE( ((w_BUSINESS_OPR_DATE == null) ? (String)null : w_BUSINESS_OPR_DATE[0]) );
		struct.setList_w_BUSINESS_OPR_DATE(TypeConverter.convert(w_BUSINESS_OPR_DATE));
		struct.seth_TRANSPORT_CMPLT_TYP( ((h_TRANSPORT_CMPLT_TYP == null) ? (String)null : h_TRANSPORT_CMPLT_TYP[0]) );
		struct.setList_h_TRANSPORT_CMPLT_TYP(TypeConverter.convert(h_TRANSPORT_CMPLT_TYP));
		struct.setw_MODIFY_COUNT( ((w_MODIFY_COUNT == null) ? (String)null : w_MODIFY_COUNT[0]) );
		struct.setList_w_MODIFY_COUNT(TypeConverter.convert(w_MODIFY_COUNT));
		struct.setRCV_ISSUE_QTY( ((RCV_ISSUE_QTY == null) ? (String)null : RCV_ISSUE_QTY[0]) );
		struct.setList_RCV_ISSUE_QTY(TypeConverter.convert(RCV_ISSUE_QTY));
		struct.setc_TRANSPORT_CMPLT_TYP( ((c_TRANSPORT_CMPLT_TYP == null) ? (String)null : c_TRANSPORT_CMPLT_TYP[0]) );
		struct.setList_c_TRANSPORT_CMPLT_TYP(TypeConverter.convert(c_TRANSPORT_CMPLT_TYP));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.seth_lotCtrl( ((h_lotCtrl == null) ? (String)null : h_lotCtrl[0]) );
		struct.setList_h_lotCtrl(TypeConverter.convert(h_lotCtrl));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.setSTOCK_ON_HAND_QTY( ((STOCK_ON_HAND_QTY == null) ? (String)null : STOCK_ON_HAND_QTY[0]) );
		struct.setList_STOCK_ON_HAND_QTY(TypeConverter.convert(STOCK_ON_HAND_QTY));
		struct.setDEFECT_QTY( ((DEFECT_QTY == null) ? (String)null : DEFECT_QTY[0]) );
		struct.setList_DEFECT_QTY(TypeConverter.convert(DEFECT_QTY));
		struct.setALLOCABLE_QTY( ((ALLOCABLE_QTY == null) ? (String)null : ALLOCABLE_QTY[0]) );
		struct.setList_ALLOCABLE_QTY(TypeConverter.convert(ALLOCABLE_QTY));
		struct.seth_lotFlg( ((h_lotFlg == null) ? (String)null : h_lotFlg[0]) );
		struct.setList_h_lotFlg(TypeConverter.convert(h_lotFlg));
		struct.setRCV_ISSUE_COMMENT( ((RCV_ISSUE_COMMENT == null) ? (String)null : RCV_ISSUE_COMMENT[0]) );
		struct.setList_RCV_ISSUE_COMMENT(TypeConverter.convert(RCV_ISSUE_COMMENT));
		struct.setISSUE_COMMENT( ((ISSUE_COMMENT == null) ? (String)null : ISSUE_COMMENT[0]) );
		struct.setList_ISSUE_COMMENT(TypeConverter.convert(ISSUE_COMMENT));
		struct.sethid_TRANSPORT_CMPLT_TYP( ((hid_TRANSPORT_CMPLT_TYP == null) ? (String)null : hid_TRANSPORT_CMPLT_TYP[0]) );
		struct.setList_hid_TRANSPORT_CMPLT_TYP(TypeConverter.convert(hid_TRANSPORT_CMPLT_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AF0060010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAF0060010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAF0060010Struct";   // JSP先のバインド名(Struct)の指定
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
					AF0060010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AF0060010Control control;
		AF0060010Entity  entity = null;
		AF0060010Struct  struct = null;

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

			if( (control = (AF0060010Control)so.getAttribute("AF0060010Control_"+request.getSession(false).getId())) == null ) {
				control = new AF0060010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AF0060010Control();
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
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "insertSub1") ) {
					if ( !isCryptical(request, so, params, "insertSub1") ) return ERROR_TARGET;
					target = onClickinsertSub1(request, response, so, params, control);
					control.setButton("insertSub1");
				} else if( isClick(request, "closeSub1") ) {
					if ( !isCryptical(request, so, params, "closeSub1") ) return ERROR_TARGET;
					target = onClickcloseSub1(request, response, so, params, control);
					control.setButton("closeSub1");
				} else if( isClick(request, "CancelCompleteChoice") ) {
					if ( !isCryptical(request, so, params, "CancelCompleteChoice") ) return ERROR_TARGET;
					target = onClickCancelCompleteChoice(request, response, so, params, control);
					control.setButton("CancelCompleteChoice");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AF0060010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "insertSub1") && bFLG_DISCONNECT_insertSub1)
				|| (isClick(request, "closeSub1") && bFLG_DISCONNECT_closeSub1)
				|| (isClick(request, "CancelCompleteChoice") && bFLG_DISCONNECT_CancelCompleteChoice)
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
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_insertSub1 = true;
	private  static boolean bFLG_DISCONNECT_closeSub1 = true;
	private  static boolean bFLG_DISCONNECT_CancelCompleteChoice = true;

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
		return "com.nec.jp.orteus.metamorBase.AF0060.AF0060010Servlet";
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
	public AF0060010Servlet()
	{
		//{{user_implement_dev:<AF0060010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_modify = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_insertSub1 = true;
                bFLG_DISCONNECT_closeSub1 = true;
              
                //}}user_implement_dev:<AF0060010_DisConnect_FLG>

		//{{user_implement_dev:<AF0060010Servlet>
                //}}user_implement_dev:<AF0060010Servlet>
	}

	//////////////////////////////

}
