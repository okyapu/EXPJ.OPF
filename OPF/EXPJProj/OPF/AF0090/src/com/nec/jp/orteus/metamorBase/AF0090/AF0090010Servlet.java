/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0090/src/com/nec/jp/orteus/metamorBase/AF0090/AF0090010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0090;

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

public class AF0090010Servlet extends HttpServlet
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
	 * @param control AF0090010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AF0090010Control control)
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
	 * @param control AF0090010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AF0090010Control control)
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
	 * @param control AF0090010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0090010Entity entity = control.entity;
		AF0090010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
			logger.entering("AF0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AF0090010"+" $Revision: 1.12 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AF0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AF0090010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0090010Entity entity = control.entity;
		AF0090010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		//---------------------------------------------------------------------
		try {
			// 工場コード取得
			struct.setPLANT_CD(control.getsysPLANT_CD());

			control.control_eventHandller("reload");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AF0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0090010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0090010Entity entity = control.entity;
		AF0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//---------------------------------------------------------------------
		try{
			// 工場コード取得
			struct.setPLANT_CD(control.getsysPLANT_CD());

			control.control_eventHandller("select");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0090010Controlクラスインスタンス
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0090010Entity entity = control.entity;
		AF0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
		//---------------------------------------------------------------------
		try {
			// 工場コード取得
			struct.setPLANT_CD(control.getsysPLANT_CD());

			control.control_eventHandller("insert");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0090010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0090010Entity entity = control.entity;
		AF0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
		//---------------------------------------------------------------------
		try{
			// 工場コード取得
			struct.setPLANT_CD(control.getsysPLANT_CD());

			control.control_eventHandller("clear");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AF0090010Controlクラスインスタンス
	 */
	public String onClickclose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0090010Entity entity = control.entity;
		AF0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");
		//{{user_implement_dev:<onClickclose>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickclose>
		logger.exiting("AF0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AF0090010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] RCV_ISSUE_QTY = ((params.containsKey("RCV_ISSUE_QTY")) ? (String[])params.get("RCV_ISSUE_QTY") : (String[])null);
		String[] RCV_ISSUE_DATE = ((params.containsKey("RCV_ISSUE_DATE")) ? (String[])params.get("RCV_ISSUE_DATE") : (String[])null);
		String[] NON_PLANNED_CAUSE_CD = ((params.containsKey("NON_PLANNED_CAUSE_CD")) ? (String[])params.get("NON_PLANNED_CAUSE_CD") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] w_WH_STOCK_ON_HAND_QTY = ((params.containsKey("w_WH_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_WH_STOCK_ON_HAND_QTY") : (String[])null);
		String[] DEFECT_QTY = ((params.containsKey("DEFECT_QTY")) ? (String[])params.get("DEFECT_QTY") : (String[])null);
		String[] w_TOTAL_STOCK_ON_HAND_QTY = ((params.containsKey("w_TOTAL_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_TOTAL_STOCK_ON_HAND_QTY") : (String[])null);
		String[] w_TOTAL_DEFECT_QTY = ((params.containsKey("w_TOTAL_DEFECT_QTY")) ? (String[])params.get("w_TOTAL_DEFECT_QTY") : (String[])null);
		String[] w_JOB_ODR = ((params.containsKey("w_JOB_ODR")) ? (String[])params.get("w_JOB_ODR") : (String[])null);
		String[] w_INFERIOR = ((params.containsKey("w_INFERIOR")) ? (String[])params.get("w_INFERIOR") : (String[])null);
		String[] BUSINESS_OPR_DATE = ((params.containsKey("BUSINESS_OPR_DATE")) ? (String[])params.get("BUSINESS_OPR_DATE") : (String[])null);
		String[] c_JOB_ODR_CD = ((params.containsKey("c_JOB_ODR_CD")) ? (String[])params.get("c_JOB_ODR_CD") : (String[])null);
		String[] c_RCV_ISSUE_QTY = ((params.containsKey("c_RCV_ISSUE_QTY")) ? (String[])params.get("c_RCV_ISSUE_QTY") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] ALC_POS_QTY = ((params.containsKey("ALC_POS_QTY")) ? (String[])params.get("ALC_POS_QTY") : (String[])null);
		String[] THIS_TIME_POS_QTY = ((params.containsKey("THIS_TIME_POS_QTY")) ? (String[])params.get("THIS_TIME_POS_QTY") : (String[])null);
		String[] c_ISSUE_FLG = ((params.containsKey("c_ISSUE_FLG")) ? (String[])params.get("c_ISSUE_FLG") : (String[])null);
		String[] ISSUE_ITEM_CD = ((params.containsKey("ISSUE_ITEM_CD")) ? (String[])params.get("ISSUE_ITEM_CD") : (String[])null);
		String[] ISSUE_JOB_ODR_CD = ((params.containsKey("ISSUE_JOB_ODR_CD")) ? (String[])params.get("ISSUE_JOB_ODR_CD") : (String[])null);
		String[] ISSUE_PROC_CD = ((params.containsKey("ISSUE_PROC_CD")) ? (String[])params.get("ISSUE_PROC_CD") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] LOT_STOCK_ON_HAND_QTY = ((params.containsKey("LOT_STOCK_ON_HAND_QTY")) ? (String[])params.get("LOT_STOCK_ON_HAND_QTY") : (String[])null);
		String[] LOT_DEFECT_QTY = ((params.containsKey("LOT_DEFECT_QTY")) ? (String[])params.get("LOT_DEFECT_QTY") : (String[])null);
		String[] ALLOCABLE_QTY = ((params.containsKey("ALLOCABLE_QTY")) ? (String[])params.get("ALLOCABLE_QTY") : (String[])null);
		String[] h_LotCtrl = ((params.containsKey("h_LotCtrl")) ? (String[])params.get("h_LotCtrl") : (String[])null);
		String[] h_lotFlg = ((params.containsKey("h_lotFlg")) ? (String[])params.get("h_lotFlg") : (String[])null);
		String[] ACCT_CD = ((params.containsKey("ACCT_CD")) ? (String[])params.get("ACCT_CD") : (String[])null);
		String[] ACCT_CD_name = ((params.containsKey("ACCT_CD_name")) ? (String[])params.get("ACCT_CD_name") : (String[])null);
		String[] ACCT_CD_val = ((params.containsKey("ACCT_CD_val")) ? (String[])params.get("ACCT_CD_val") : (String[])null);
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

		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setRCV_ISSUE_QTY( ((RCV_ISSUE_QTY == null) ? (String)null : RCV_ISSUE_QTY[0]) );
		struct.setList_RCV_ISSUE_QTY(TypeConverter.convert(RCV_ISSUE_QTY));
		struct.setRCV_ISSUE_DATE( ((RCV_ISSUE_DATE == null) ? (String)null : RCV_ISSUE_DATE[0]) );
		struct.setList_RCV_ISSUE_DATE(TypeConverter.convert(RCV_ISSUE_DATE));
		struct.setNON_PLANNED_CAUSE_CD( ((NON_PLANNED_CAUSE_CD == null) ? (String)null : NON_PLANNED_CAUSE_CD[0]) );
		struct.setList_NON_PLANNED_CAUSE_CD(TypeConverter.convert(NON_PLANNED_CAUSE_CD));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setw_WH_STOCK_ON_HAND_QTY( ((w_WH_STOCK_ON_HAND_QTY == null) ? (String)null : w_WH_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_WH_STOCK_ON_HAND_QTY(TypeConverter.convert(w_WH_STOCK_ON_HAND_QTY));
		struct.setDEFECT_QTY( ((DEFECT_QTY == null) ? (String)null : DEFECT_QTY[0]) );
		struct.setList_DEFECT_QTY(TypeConverter.convert(DEFECT_QTY));
		struct.setw_TOTAL_STOCK_ON_HAND_QTY( ((w_TOTAL_STOCK_ON_HAND_QTY == null) ? (String)null : w_TOTAL_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_TOTAL_STOCK_ON_HAND_QTY(TypeConverter.convert(w_TOTAL_STOCK_ON_HAND_QTY));
		struct.setw_TOTAL_DEFECT_QTY( ((w_TOTAL_DEFECT_QTY == null) ? (String)null : w_TOTAL_DEFECT_QTY[0]) );
		struct.setList_w_TOTAL_DEFECT_QTY(TypeConverter.convert(w_TOTAL_DEFECT_QTY));
		if( (w_JOB_ODR == null)||("".equals(w_JOB_ODR[0])) ) {
		   struct.setw_JOB_ODR( (Integer)null );
		} else {
		   struct.setw_JOB_ODR( new Integer(w_JOB_ODR[0]) );
		   struct.setList_w_JOB_ODR(TypeConverter.convert(w_JOB_ODR));
		}
		if( (w_INFERIOR == null)||("".equals(w_INFERIOR[0])) ) {
		   struct.setw_INFERIOR( (Integer)null );
		} else {
		   struct.setw_INFERIOR( new Integer(w_INFERIOR[0]) );
		   struct.setList_w_INFERIOR(TypeConverter.convert(w_INFERIOR));
		}
		struct.setBUSINESS_OPR_DATE( ((BUSINESS_OPR_DATE == null) ? (String)null : BUSINESS_OPR_DATE[0]) );
		struct.setList_BUSINESS_OPR_DATE(TypeConverter.convert(BUSINESS_OPR_DATE));
		struct.setc_JOB_ODR_CD( ((c_JOB_ODR_CD == null) ? (String)null : c_JOB_ODR_CD[0]) );
		struct.setList_c_JOB_ODR_CD(TypeConverter.convert(c_JOB_ODR_CD));
		struct.setc_RCV_ISSUE_QTY( ((c_RCV_ISSUE_QTY == null) ? (String)null : c_RCV_ISSUE_QTY[0]) );
		struct.setList_c_RCV_ISSUE_QTY(TypeConverter.convert(c_RCV_ISSUE_QTY));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setALC_POS_QTY( ((ALC_POS_QTY == null) ? (String)null : ALC_POS_QTY[0]) );
		struct.setList_ALC_POS_QTY(TypeConverter.convert(ALC_POS_QTY));
		struct.setTHIS_TIME_POS_QTY( ((THIS_TIME_POS_QTY == null) ? (String)null : THIS_TIME_POS_QTY[0]) );
		struct.setList_THIS_TIME_POS_QTY(TypeConverter.convert(THIS_TIME_POS_QTY));
		struct.setc_ISSUE_FLG( ((c_ISSUE_FLG == null) ? (String)null : c_ISSUE_FLG[0]) );
		struct.setList_c_ISSUE_FLG(TypeConverter.convert(c_ISSUE_FLG));
		struct.setISSUE_ITEM_CD( ((ISSUE_ITEM_CD == null) ? (String)null : ISSUE_ITEM_CD[0]) );
		struct.setList_ISSUE_ITEM_CD(TypeConverter.convert(ISSUE_ITEM_CD));
		struct.setISSUE_JOB_ODR_CD( ((ISSUE_JOB_ODR_CD == null) ? (String)null : ISSUE_JOB_ODR_CD[0]) );
		struct.setList_ISSUE_JOB_ODR_CD(TypeConverter.convert(ISSUE_JOB_ODR_CD));
		struct.setISSUE_PROC_CD( ((ISSUE_PROC_CD == null) ? (String)null : ISSUE_PROC_CD[0]) );
		struct.setList_ISSUE_PROC_CD(TypeConverter.convert(ISSUE_PROC_CD));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.setLOT_STOCK_ON_HAND_QTY( ((LOT_STOCK_ON_HAND_QTY == null) ? (String)null : LOT_STOCK_ON_HAND_QTY[0]) );
		struct.setList_LOT_STOCK_ON_HAND_QTY(TypeConverter.convert(LOT_STOCK_ON_HAND_QTY));
		struct.setLOT_DEFECT_QTY( ((LOT_DEFECT_QTY == null) ? (String)null : LOT_DEFECT_QTY[0]) );
		struct.setList_LOT_DEFECT_QTY(TypeConverter.convert(LOT_DEFECT_QTY));
		struct.setALLOCABLE_QTY( ((ALLOCABLE_QTY == null) ? (String)null : ALLOCABLE_QTY[0]) );
		struct.setList_ALLOCABLE_QTY(TypeConverter.convert(ALLOCABLE_QTY));
		struct.seth_LotCtrl( ((h_LotCtrl == null) ? (String)null : h_LotCtrl[0]) );
		struct.setList_h_LotCtrl(TypeConverter.convert(h_LotCtrl));
		struct.seth_lotFlg( ((h_lotFlg == null) ? (String)null : h_lotFlg[0]) );
		struct.setList_h_lotFlg(TypeConverter.convert(h_lotFlg));
		struct.setACCT_CD( ((ACCT_CD == null) ? (String)null : ACCT_CD[0]) );
		struct.setList_ACCT_CD(TypeConverter.convert(ACCT_CD));
		struct.setACCT_CD_name( ((ACCT_CD_name == null) ? (String)null : ACCT_CD_name[0]) );
		struct.setList_ACCT_CD_name(TypeConverter.convert(ACCT_CD_name));
		struct.setACCT_CD_val( ((ACCT_CD_val == null) ? (String)null : ACCT_CD_val[0]) );
		struct.setList_ACCT_CD_val(TypeConverter.convert(ACCT_CD_val));
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

	public static String DEFAULT_TARGET = "/AF0090010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAF0090010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAF0090010Struct";   // JSP先のバインド名(Struct)の指定
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
					AF0090010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AF0090010Entity entity = control.entity;
		AF0090010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0090");
		logger.entering("AF0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AF0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AF0090010Control control;
		AF0090010Entity  entity = null;
		AF0090010Struct  struct = null;

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

			if( (control = (AF0090010Control)so.getAttribute("AF0090010Control_"+request.getSession(false).getId())) == null ) {
				control = new AF0090010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AF0090010Control();
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
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "close") ) {
					if ( !isCryptical(request, so, params, "close") ) return ERROR_TARGET;
					target = onClickclose(request, response, so, params, control);
					control.setButton("close");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AF0090010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "close") && bFLG_DISCONNECT_close)
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
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_close = true;

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
		return "com.nec.jp.orteus.metamorBase.AF0090.AF0090010Servlet";
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
	public AF0090010Servlet()
	{
		//{{user_implement_dev:<AF0090010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_insert = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AF0090010_DisConnect_FLG>

		//{{user_implement_dev:<AF0090010Servlet>
                //}}user_implement_dev:<AF0090010Servlet>
	}

	//////////////////////////////

}
