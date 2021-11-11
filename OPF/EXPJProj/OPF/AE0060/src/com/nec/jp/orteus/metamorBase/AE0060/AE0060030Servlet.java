/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060030Servlet.java,v $
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

public class AE0060030Servlet extends HttpServlet
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
	 * @param control AE0060030Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AE0060030Control control)
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
		String[] PUCH_ODR_CD = (String[]) params.get("l_PUCH_ODR_CD");
		control.setPuchOdrCd((PUCH_ODR_CD == null) ? null : PUCH_ODR_CD[0]);
		String[] ACPT_NO = (String[]) params.get("l_ACPT_NO");
		control.setAcptNo((ACPT_NO == null) ? null : ACPT_NO[0]);


      
		// TODO: ユーザ定義のコードを記述してください
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AE0060030Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AE0060030Control control)
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
	 * @param control AE0060030Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060030Entity entity = control.entity;
		AE0060030Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
			logger.entering("AE0060030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
			//			objMessage.m_writer.write( Level.ALL, "AE0060030"+" $Revision: 1.36 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AE0060030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AE0060030Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060030Entity entity = control.entity;
		AE0060030Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
			//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060030-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AE0060030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060030Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060030Entity entity = control.entity;
		AE0060030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060030Controlクラスインスタンス
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060030Entity entity = control.entity;
		AE0060030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
		// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Update");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * 完了解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060030Controlクラスインスタンス
	 */
	public String onClickCancelComplete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060030Entity entity = control.entity;
		AE0060030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");
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
		logger.exiting("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0060030Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060030Entity entity = control.entity;
		AE0060030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AE0060030Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AE0060030Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PUCH_ODR_CD = ((params.containsKey("PUCH_ODR_CD")) ? (String[])params.get("PUCH_ODR_CD") : (String[])null);
		String[] ACPT_NO = ((params.containsKey("ACPT_NO")) ? (String[])params.get("ACPT_NO") : (String[])null);
		String[] ACPT_QTY = ((params.containsKey("ACPT_QTY")) ? (String[])params.get("ACPT_QTY") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] ACPT_STS_TYP_DN = ((params.containsKey("ACPT_STS_TYP_DN")) ? (String[])params.get("ACPT_STS_TYP_DN") : (String[])null);
		String[] BUSINESS_OPR_DATE = ((params.containsKey("BUSINESS_OPR_DATE")) ? (String[])params.get("BUSINESS_OPR_DATE") : (String[])null);
		String[] INSPECTED_QTY = ((params.containsKey("INSPECTED_QTY")) ? (String[])params.get("INSPECTED_QTY") : (String[])null);
		String[] c_COMPLETE = ((params.containsKey("c_COMPLETE")) ? (String[])params.get("c_COMPLETE") : (String[])null);
		String[] ACCEPTED_QTY = ((params.containsKey("ACCEPTED_QTY")) ? (String[])params.get("ACCEPTED_QTY") : (String[])null);
		String[] DEFECTED_QTY = ((params.containsKey("DEFECTED_QTY")) ? (String[])params.get("DEFECTED_QTY") : (String[])null);
		String[] INSPEC_DATE = ((params.containsKey("INSPEC_DATE")) ? (String[])params.get("INSPEC_DATE") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] INSPEC_RSLT_COMMENT = ((params.containsKey("INSPEC_RSLT_COMMENT")) ? (String[])params.get("INSPEC_RSLT_COMMENT") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] l_DEFECT_CAUSE_CD = ((params.containsKey("l_DEFECT_CAUSE_CD")) ? (String[])params.get("l_DEFECT_CAUSE_CD") : (String[])null);
		String[] l_DEFECT_INSPC_QTY = ((params.containsKey("l_DEFECT_INSPC_QTY")) ? (String[])params.get("l_DEFECT_INSPC_QTY") : (String[])null);
		String[] l_DEFECT_COMMENT = ((params.containsKey("l_DEFECT_COMMENT")) ? (String[])params.get("l_DEFECT_COMMENT") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] SUM_ACPT_QTY = ((params.containsKey("SUM_ACPT_QTY")) ? (String[])params.get("SUM_ACPT_QTY") : (String[])null);
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
		String[] INSPC_CMPLT_FLG_DN = ((params.containsKey("INSPC_CMPLT_FLG_DN")) ? (String[])params.get("INSPC_CMPLT_FLG_DN") : (String[])null);
		String[] SPL_ITEM_TYP_DN = ((params.containsKey("SPL_ITEM_TYP_DN")) ? (String[])params.get("SPL_ITEM_TYP_DN") : (String[])null);
		String[] PRODUCT_TYP_DN = ((params.containsKey("PRODUCT_TYP_DN")) ? (String[])params.get("PRODUCT_TYP_DN") : (String[])null);
		String[] PUCH_ODR_STS_TYP_DN = ((params.containsKey("PUCH_ODR_STS_TYP_DN")) ? (String[])params.get("PUCH_ODR_STS_TYP_DN") : (String[])null);
		String[] NON_NO_ITEM_FLG_DN = ((params.containsKey("NON_NO_ITEM_FLG_DN")) ? (String[])params.get("NON_NO_ITEM_FLG_DN") : (String[])null);
		String[] h_PUCH_ODR_CD = ((params.containsKey("h_PUCH_ODR_CD")) ? (String[])params.get("h_PUCH_ODR_CD") : (String[])null);
		String[] h_ACPT_NO = ((params.containsKey("h_ACPT_NO")) ? (String[])params.get("h_ACPT_NO") : (String[])null);
		String[] PUCH_ODR_MODIFY_COUNT = ((params.containsKey("PUCH_ODR_MODIFY_COUNT")) ? (String[])params.get("PUCH_ODR_MODIFY_COUNT") : (String[])null);
		String[] ACPT_MODIFY_COUNT = ((params.containsKey("ACPT_MODIFY_COUNT")) ? (String[])params.get("ACPT_MODIFY_COUNT") : (String[])null);
		String[] INSPC_MODIFY_COUNT = ((params.containsKey("INSPC_MODIFY_COUNT")) ? (String[])params.get("INSPC_MODIFY_COUNT") : (String[])null);
		String[] INSPC_CMPLT_FLG = ((params.containsKey("INSPC_CMPLT_FLG")) ? (String[])params.get("INSPC_CMPLT_FLG") : (String[])null);
		String[] PUCH_ODR_STS_TYP = ((params.containsKey("PUCH_ODR_STS_TYP")) ? (String[])params.get("PUCH_ODR_STS_TYP") : (String[])null);
		String[] SPL_ITEM_TYP = ((params.containsKey("SPL_ITEM_TYP")) ? (String[])params.get("SPL_ITEM_TYP") : (String[])null);
		String[] ACPT_INSPC_TYP = ((params.containsKey("ACPT_INSPC_TYP")) ? (String[])params.get("ACPT_INSPC_TYP") : (String[])null);
		String[] PRODUCT_TYP = ((params.containsKey("PRODUCT_TYP")) ? (String[])params.get("PRODUCT_TYP") : (String[])null);
		String[] NON_NO_ITEM_FLG = ((params.containsKey("NON_NO_ITEM_FLG")) ? (String[])params.get("NON_NO_ITEM_FLG") : (String[])null);
		String[] UNIT_QTY_TYP_DN = ((params.containsKey("UNIT_QTY_TYP_DN")) ? (String[])params.get("UNIT_QTY_TYP_DN") : (String[])null);
		String[] UNIT_QTY_TYP = ((params.containsKey("UNIT_QTY_TYP")) ? (String[])params.get("UNIT_QTY_TYP") : (String[])null);
		String[] ACPT_STS_TYP = ((params.containsKey("ACPT_STS_TYP")) ? (String[])params.get("ACPT_STS_TYP") : (String[])null);
		String[] THIS_MONTH = ((params.containsKey("THIS_MONTH")) ? (String[])params.get("THIS_MONTH") : (String[])null);
		String[] INSTALL_FLG = ((params.containsKey("INSTALL_FLG")) ? (String[])params.get("INSTALL_FLG") : (String[])null);
		String[] PUCH_ODR_COMMENT = ((params.containsKey("PUCH_ODR_COMMENT")) ? (String[])params.get("PUCH_ODR_COMMENT") : (String[])null);
		String[] h_INSPEC_DATE = ((params.containsKey("h_INSPEC_DATE")) ? (String[])params.get("h_INSPEC_DATE") : (String[])null);
		String[] ITEM_CD_M = ((params.containsKey("ITEM_CD_M")) ? (String[])params.get("ITEM_CD_M") : (String[])null);
		String[] ITEM_NAME_M = ((params.containsKey("ITEM_NAME_M")) ? (String[])params.get("ITEM_NAME_M") : (String[])null);
		String[] INSPC_WH_CD = ((params.containsKey("INSPC_WH_CD")) ? (String[])params.get("INSPC_WH_CD") : (String[])null);
		String[] INSPC_WH_NAME = ((params.containsKey("INSPC_WH_NAME")) ? (String[])params.get("INSPC_WH_NAME") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] l_DEFECT_CAUSE_CD_name = ((params.containsKey("l_DEFECT_CAUSE_CD_name")) ? (String[])params.get("l_DEFECT_CAUSE_CD_name") : (String[])null);
		String[] l_DEFECT_CAUSE_CD_val = ((params.containsKey("l_DEFECT_CAUSE_CD_val")) ? (String[])params.get("l_DEFECT_CAUSE_CD_val") : (String[])null);
		String[] ACPT_DATE = ((params.containsKey("ACPT_DATE")) ? (String[])params.get("ACPT_DATE") : (String[])null);
		String[] EXCH_RATE = ((params.containsKey("EXCH_RATE")) ? (String[])params.get("EXCH_RATE") : (String[])null);
		String[] h_INSPECTED_QTY = ((params.containsKey("h_INSPECTED_QTY")) ? (String[])params.get("h_INSPECTED_QTY") : (String[])null);

		struct.setPUCH_ODR_CD( ((PUCH_ODR_CD == null) ? (String)null : PUCH_ODR_CD[0]) );
		struct.setList_PUCH_ODR_CD(TypeConverter.convert(PUCH_ODR_CD));
		struct.setACPT_NO( ((ACPT_NO == null) ? (String)null : ACPT_NO[0]) );
		struct.setList_ACPT_NO(TypeConverter.convert(ACPT_NO));
		struct.setACPT_QTY( ((ACPT_QTY == null) ? (String)null : ACPT_QTY[0]) );
		struct.setList_ACPT_QTY(TypeConverter.convert(ACPT_QTY));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setACPT_STS_TYP_DN( ((ACPT_STS_TYP_DN == null) ? (String)null : ACPT_STS_TYP_DN[0]) );
		struct.setList_ACPT_STS_TYP_DN(TypeConverter.convert(ACPT_STS_TYP_DN));
		struct.setBUSINESS_OPR_DATE( ((BUSINESS_OPR_DATE == null) ? (String)null : BUSINESS_OPR_DATE[0]) );
		struct.setList_BUSINESS_OPR_DATE(TypeConverter.convert(BUSINESS_OPR_DATE));
		struct.setINSPECTED_QTY( ((INSPECTED_QTY == null) ? (String)null : INSPECTED_QTY[0]) );
		struct.setList_INSPECTED_QTY(TypeConverter.convert(INSPECTED_QTY));
		struct.setc_COMPLETE( ((c_COMPLETE == null) ? (String)null : c_COMPLETE[0]) );
		struct.setList_c_COMPLETE(TypeConverter.convert(c_COMPLETE));
		struct.setACCEPTED_QTY( ((ACCEPTED_QTY == null) ? (String)null : ACCEPTED_QTY[0]) );
		struct.setList_ACCEPTED_QTY(TypeConverter.convert(ACCEPTED_QTY));
		struct.setDEFECTED_QTY( ((DEFECTED_QTY == null) ? (String)null : DEFECTED_QTY[0]) );
		struct.setList_DEFECTED_QTY(TypeConverter.convert(DEFECTED_QTY));
		struct.setINSPEC_DATE( ((INSPEC_DATE == null) ? (String)null : INSPEC_DATE[0]) );
		struct.setList_INSPEC_DATE(TypeConverter.convert(INSPEC_DATE));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setINSPEC_RSLT_COMMENT( ((INSPEC_RSLT_COMMENT == null) ? (String)null : INSPEC_RSLT_COMMENT[0]) );
		struct.setList_INSPEC_RSLT_COMMENT(TypeConverter.convert(INSPEC_RSLT_COMMENT));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setl_DEFECT_CAUSE_CD( ((l_DEFECT_CAUSE_CD == null) ? (String)null : l_DEFECT_CAUSE_CD[0]) );
		struct.setList_l_DEFECT_CAUSE_CD(TypeConverter.convert(l_DEFECT_CAUSE_CD));
		struct.setl_DEFECT_INSPC_QTY( ((l_DEFECT_INSPC_QTY == null) ? (String)null : l_DEFECT_INSPC_QTY[0]) );
		struct.setList_l_DEFECT_INSPC_QTY(TypeConverter.convert(l_DEFECT_INSPC_QTY));
		struct.setl_DEFECT_COMMENT( ((l_DEFECT_COMMENT == null) ? (String)null : l_DEFECT_COMMENT[0]) );
		struct.setList_l_DEFECT_COMMENT(TypeConverter.convert(l_DEFECT_COMMENT));
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
		struct.setINSPC_CMPLT_FLG_DN( ((INSPC_CMPLT_FLG_DN == null) ? (String)null : INSPC_CMPLT_FLG_DN[0]) );
		struct.setList_INSPC_CMPLT_FLG_DN(TypeConverter.convert(INSPC_CMPLT_FLG_DN));
		struct.setSPL_ITEM_TYP_DN( ((SPL_ITEM_TYP_DN == null) ? (String)null : SPL_ITEM_TYP_DN[0]) );
		struct.setList_SPL_ITEM_TYP_DN(TypeConverter.convert(SPL_ITEM_TYP_DN));
		struct.setPRODUCT_TYP_DN( ((PRODUCT_TYP_DN == null) ? (String)null : PRODUCT_TYP_DN[0]) );
		struct.setList_PRODUCT_TYP_DN(TypeConverter.convert(PRODUCT_TYP_DN));
		struct.setPUCH_ODR_STS_TYP_DN( ((PUCH_ODR_STS_TYP_DN == null) ? (String)null : PUCH_ODR_STS_TYP_DN[0]) );
		struct.setList_PUCH_ODR_STS_TYP_DN(TypeConverter.convert(PUCH_ODR_STS_TYP_DN));
		struct.setNON_NO_ITEM_FLG_DN( ((NON_NO_ITEM_FLG_DN == null) ? (String)null : NON_NO_ITEM_FLG_DN[0]) );
		struct.setList_NON_NO_ITEM_FLG_DN(TypeConverter.convert(NON_NO_ITEM_FLG_DN));
		struct.seth_PUCH_ODR_CD( ((h_PUCH_ODR_CD == null) ? (String)null : h_PUCH_ODR_CD[0]) );
		struct.setList_h_PUCH_ODR_CD(TypeConverter.convert(h_PUCH_ODR_CD));
		struct.seth_ACPT_NO( ((h_ACPT_NO == null) ? (String)null : h_ACPT_NO[0]) );
		struct.setList_h_ACPT_NO(TypeConverter.convert(h_ACPT_NO));
		struct.setPUCH_ODR_MODIFY_COUNT( ((PUCH_ODR_MODIFY_COUNT == null) ? (String)null : PUCH_ODR_MODIFY_COUNT[0]) );
		struct.setList_PUCH_ODR_MODIFY_COUNT(TypeConverter.convert(PUCH_ODR_MODIFY_COUNT));
		struct.setACPT_MODIFY_COUNT( ((ACPT_MODIFY_COUNT == null) ? (String)null : ACPT_MODIFY_COUNT[0]) );
		struct.setList_ACPT_MODIFY_COUNT(TypeConverter.convert(ACPT_MODIFY_COUNT));
		struct.setINSPC_MODIFY_COUNT( ((INSPC_MODIFY_COUNT == null) ? (String)null : INSPC_MODIFY_COUNT[0]) );
		struct.setList_INSPC_MODIFY_COUNT(TypeConverter.convert(INSPC_MODIFY_COUNT));
		struct.setINSPC_CMPLT_FLG( ((INSPC_CMPLT_FLG == null) ? (String)null : INSPC_CMPLT_FLG[0]) );
		struct.setList_INSPC_CMPLT_FLG(TypeConverter.convert(INSPC_CMPLT_FLG));
		struct.setPUCH_ODR_STS_TYP( ((PUCH_ODR_STS_TYP == null) ? (String)null : PUCH_ODR_STS_TYP[0]) );
		struct.setList_PUCH_ODR_STS_TYP(TypeConverter.convert(PUCH_ODR_STS_TYP));
		struct.setSPL_ITEM_TYP( ((SPL_ITEM_TYP == null) ? (String)null : SPL_ITEM_TYP[0]) );
		struct.setList_SPL_ITEM_TYP(TypeConverter.convert(SPL_ITEM_TYP));
		struct.setACPT_INSPC_TYP( ((ACPT_INSPC_TYP == null) ? (String)null : ACPT_INSPC_TYP[0]) );
		struct.setList_ACPT_INSPC_TYP(TypeConverter.convert(ACPT_INSPC_TYP));
		struct.setPRODUCT_TYP( ((PRODUCT_TYP == null) ? (String)null : PRODUCT_TYP[0]) );
		struct.setList_PRODUCT_TYP(TypeConverter.convert(PRODUCT_TYP));
		struct.setNON_NO_ITEM_FLG( ((NON_NO_ITEM_FLG == null) ? (String)null : NON_NO_ITEM_FLG[0]) );
		struct.setList_NON_NO_ITEM_FLG(TypeConverter.convert(NON_NO_ITEM_FLG));
		struct.setUNIT_QTY_TYP_DN( ((UNIT_QTY_TYP_DN == null) ? (String)null : UNIT_QTY_TYP_DN[0]) );
		struct.setList_UNIT_QTY_TYP_DN(TypeConverter.convert(UNIT_QTY_TYP_DN));
		struct.setUNIT_QTY_TYP( ((UNIT_QTY_TYP == null) ? (String)null : UNIT_QTY_TYP[0]) );
		struct.setList_UNIT_QTY_TYP(TypeConverter.convert(UNIT_QTY_TYP));
		struct.setACPT_STS_TYP( ((ACPT_STS_TYP == null) ? (String)null : ACPT_STS_TYP[0]) );
		struct.setList_ACPT_STS_TYP(TypeConverter.convert(ACPT_STS_TYP));
		struct.setTHIS_MONTH( ((THIS_MONTH == null) ? (String)null : THIS_MONTH[0]) );
		struct.setList_THIS_MONTH(TypeConverter.convert(THIS_MONTH));
		struct.setINSTALL_FLG( ((INSTALL_FLG == null) ? (String)null : INSTALL_FLG[0]) );
		struct.setList_INSTALL_FLG(TypeConverter.convert(INSTALL_FLG));
		struct.setPUCH_ODR_COMMENT( ((PUCH_ODR_COMMENT == null) ? (String)null : PUCH_ODR_COMMENT[0]) );
		struct.setList_PUCH_ODR_COMMENT(TypeConverter.convert(PUCH_ODR_COMMENT));
		struct.seth_INSPEC_DATE( ((h_INSPEC_DATE == null) ? (String)null : h_INSPEC_DATE[0]) );
		struct.setList_h_INSPEC_DATE(TypeConverter.convert(h_INSPEC_DATE));
		struct.setITEM_CD_M( ((ITEM_CD_M == null) ? (String)null : ITEM_CD_M[0]) );
		struct.setList_ITEM_CD_M(TypeConverter.convert(ITEM_CD_M));
		struct.setITEM_NAME_M( ((ITEM_NAME_M == null) ? (String)null : ITEM_NAME_M[0]) );
		struct.setList_ITEM_NAME_M(TypeConverter.convert(ITEM_NAME_M));
		struct.setINSPC_WH_CD( ((INSPC_WH_CD == null) ? (String)null : INSPC_WH_CD[0]) );
		struct.setList_INSPC_WH_CD(TypeConverter.convert(INSPC_WH_CD));
		struct.setINSPC_WH_NAME( ((INSPC_WH_NAME == null) ? (String)null : INSPC_WH_NAME[0]) );
		struct.setList_INSPC_WH_NAME(TypeConverter.convert(INSPC_WH_NAME));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.setl_DEFECT_CAUSE_CD_name( ((l_DEFECT_CAUSE_CD_name == null) ? (String)null : l_DEFECT_CAUSE_CD_name[0]) );
		struct.setList_l_DEFECT_CAUSE_CD_name(TypeConverter.convert(l_DEFECT_CAUSE_CD_name));
		struct.setl_DEFECT_CAUSE_CD_val( ((l_DEFECT_CAUSE_CD_val == null) ? (String)null : l_DEFECT_CAUSE_CD_val[0]) );
		struct.setList_l_DEFECT_CAUSE_CD_val(TypeConverter.convert(l_DEFECT_CAUSE_CD_val));
		struct.setACPT_DATE( ((ACPT_DATE == null) ? (String)null : ACPT_DATE[0]) );
		struct.setList_ACPT_DATE(TypeConverter.convert(ACPT_DATE));
		struct.setEXCH_RATE( ((EXCH_RATE == null) ? (String)null : EXCH_RATE[0]) );
		struct.setList_EXCH_RATE(TypeConverter.convert(EXCH_RATE));
		struct.seth_INSPECTED_QTY( ((h_INSPECTED_QTY == null) ? (String)null : h_INSPECTED_QTY[0]) );
		struct.setList_h_INSPECTED_QTY(TypeConverter.convert(h_INSPECTED_QTY));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AE0060030.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAE0060030Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAE0060030Struct";   // JSP先のバインド名(Struct)の指定
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
					AE0060030Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0060030Entity entity = control.entity;
		AE0060030Struct struct = control.struct;

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
		logger.entering("AE0060030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AE0060030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AE0060030Control control;
		AE0060030Entity  entity = null;
		AE0060030Struct  struct = null;

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

			if( (control = (AE0060030Control)so.getAttribute("AE0060030Control_"+request.getSession(false).getId())) == null ) {
				control = new AE0060030Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AE0060030Control();
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
				} else if( isClick(request, "Update") ) {
					if ( !isCryptical(request, so, params, "Update") ) return ERROR_TARGET;
					target = onClickUpdate(request, response, so, params, control);
					control.setButton("Update");
				} else if( isClick(request, "CancelComplete") ) {
					if ( !isCryptical(request, so, params, "CancelComplete") ) return ERROR_TARGET;
					target = onClickCancelComplete(request, response, so, params, control);
					control.setButton("CancelComplete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AE0060030Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "CancelComplete") && bFLG_DISCONNECT_CancelComplete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
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
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_CancelComplete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;

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
		return "com.nec.jp.orteus.metamorBase.AE0060.AE0060030Servlet";
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
	public AE0060030Servlet()
	{
		//{{user_implement_dev:<AE0060030_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Update = true;
		bFLG_DISCONNECT_CancelComplete = true;
		bFLG_DISCONNECT_Clear = true;

                //}}user_implement_dev:<AE0060030_DisConnect_FLG>

		//{{user_implement_dev:<AE0060030Servlet>
		// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AE0060030Servlet>
	}

	//////////////////////////////

}
