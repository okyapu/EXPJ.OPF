/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/src/com/nec/jp/orteus/metamorBase/AL0040/AL0040010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0040;

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

import java.lang.Integer;

//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AL0040010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head

	/** 制約工程コード */
	protected String _strNECK_PROC_CD = null;
	/** 負荷日付 */
	protected String _strLOAD_DATE = null;
	/** 記憶選択日数 */
	protected String _strSLOAD_DATE = null;
	/** シフト日付 */
	protected String _strShift_Date = null;
	/** チャート日付 */
	protected String _strChart_DATE = null;
	/** グラフ日付 */
	protected String _strGraph_DATE = null;
	/** 開始日付 */
	protected String _strFrom_DATE = null;
	/** 終了日付 */
	protected String _strTo_DATE = null;
	/** メインプログラムID */
	protected String _strProgramId = null;

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
	 * @param control AL0040010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AL0040010Control control)
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
	 * @param control AL0040010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AL0040010Control control)
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
	 * @param control AL0040010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
			logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>

			// 対象のラジオボタンNoの取得
			String btn = request.getParameter("r_Btn");
			if (btn != null && btn.equals("") == false) {
				control.setCheckNumber(Integer.parseInt(btn));
			}

			control.control_eventHandller("initial");

                //}}user_implement_dev:<initialEvent>
			logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AL0040010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0040010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>

		try {
			// 対象のラジオボタンNoの取得
			String btn = request.getParameter("r_Btn");
			if (btn != null && btn.equals("") == false) {
				control.setCheckNumber(Integer.parseInt(btn));
			}

			control.control_eventHandller("Select");

		} catch (FoundationException fe) {
			ExpjException ee = new ExpjException(fe, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * アンカーボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickSelectNeckCD(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectNeckCD");
		//{{user_implement_dev:<onClickSelectNeckCD>

		try {
			struct.setK_NECK_PROC_CD(_strNECK_PROC_CD);
			struct.setK_LOAD_DATE(_strLOAD_DATE);
			struct.setDateFrom(_strFrom_DATE);
			struct.setDateTo(_strTo_DATE);
			// 選択日付を保存
			struct.setS_LOAD_DATE(_strSLOAD_DATE);
			// シフト日数デフォルト表示
			struct.setShift_Date("10");

			control.control_eventHandller("SelectNeckCD");

			if (control.getMsgStruct().sizeError() > 0) {
				// 複数工程日別負荷参照画面に滞留
				nextUrl = "/AL0040010.jsp";
			} else {
				// リンク先に遷移
				nextUrl = "/AL0040011.jsp";
			}

		} catch (FoundationException fe) {
			ExpjException ee = new ExpjException(fe, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<onClickSelectNeckCD>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectNeckCD");

		return nextUrl;
	}

	/**
	 * 左矢印ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickSelect_Prev(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect_Prev");
		//{{user_implement_dev:<onClickSelect_Prev>

		try {
			// 実際には、日付を変更して、onClickSelectNeckCD() を呼びたい
			//!DEBUG用コード
			//System.out.println("AL0040010Servlet.onClickSelect_Prev().左矢印処理");

			// MloadDay を画面の日付分マイナス
			Calendar cal = new GregorianCalendar();
			Date dateDefFrom;
			cal.setTime(Converter.strToDate(struct.getK_LOAD_DATE(), "yyyy/MM/dd"));
			String Shift_DayPrev = struct.getShift_Date();
			if (Shift_DayPrev.substring(0, 1).equals("+") == true) {
				// + 文字対策
				Shift_DayPrev = Shift_DayPrev.substring(1, Shift_DayPrev.length());
			}
			cal.add(Calendar.DATE, -1 * Integer.parseInt(Shift_DayPrev));
			_strLOAD_DATE = Converter.dateToStr(cal.getTime(), "yyyy/MM/dd");

			struct.setK_LOAD_DATE(_strLOAD_DATE);

			control.control_eventHandller("SelectNeckCD");

			// リンク先に遷移
			nextUrl = "/AL0040011.jsp";

		} catch (ParseException pe) {
			ExpjException ee = new ExpjException(pe, "ZZ01106");
			throw ee;
		} catch (FoundationException fe) {
			ExpjException ee = new ExpjException(fe, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<onClickSelect_Prev>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect_Prev");

		return nextUrl;
	}

	/**
	 * 右矢印ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickSelect_Next(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect_Next");
		//{{user_implement_dev:<onClickSelect_Next>

		try {
			// 実際には、日付を変更して、onClickSelectNeckCD() を呼びたい
			//!DEBUG用コード
			//System.out.println("AL0040010Servlet.onClickSelect_Next().右矢印処理");

			// MloadDayを画面の日付分プラス
			Calendar cal = new GregorianCalendar();
			Date dateDefFrom;
			cal.setTime(Converter.strToDate(struct.getK_LOAD_DATE(), "yyyy/MM/dd"));
			String Shift_Day = struct.getShift_Date();
			if (Shift_Day.substring(0, 1).equals("+") == true) {
				// + 文字対策
				Shift_Day = Shift_Day.substring(1, Shift_Day.length());
			}
			cal.add(Calendar.DATE, Integer.parseInt(Shift_Day));
			_strLOAD_DATE = Converter.dateToStr(cal.getTime(), "yyyy/MM/dd");

			struct.setK_LOAD_DATE(_strLOAD_DATE);

			control.control_eventHandller("SelectNeckCD");

			// リンク先に遷移
			nextUrl = "/AL0040011.jsp";

		} catch (ParseException pe) {
			ExpjException ee = new ExpjException(pe, "ZZ01106");
			throw ee;
		} catch (FoundationException fe) {
			ExpjException ee = new ExpjException(fe, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<onClickSelect_Next>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect_Next");

		return nextUrl;
	}

	/**
	 * グラフリンクボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickSelectNeckDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectNeckDetail");
		//{{user_implement_dev:<onClickSelectNeckDetail>

		try {
			struct.setK_NECK_PROC_CD(_strNECK_PROC_CD);
			struct.setKM_LOAD_DATE(_strGraph_DATE);
			struct.setK_LOAD_DATE(_strChart_DATE);
			// 選択日付を保存
			struct.setS_LOAD_DATE(_strSLOAD_DATE);

			if (_strShift_Date == null || _strShift_Date.equals("") == true) {
				struct.setShift_Date("0");
			} else {
				struct.setShift_Date(_strShift_Date);
			}
			if (control.getAlInstalledFlg().equals("0") == true) {
				// ALがインストールされていない場合
				// 期間(FromとTo)をパラメータから設定
				struct.setDateFrom(_strFrom_DATE);
				struct.setDateTo(_strTo_DATE);
			}

			control.control_eventHandller("SelectNeckDetail");

			// リンク先に遷移
			nextUrl = "/AL0040012.jsp";

		} catch (FoundationException fe) {
			ExpjException ee = new ExpjException(fe, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<onClickSelectNeckDetail>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectNeckDetail");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Close");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickCancelSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AL0040010.jsp";		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelSub1");
		//{{user_implement_dev:<onClickCancelSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CancelSub1");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelSub1>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelSub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AL0040010Controlクラスインスタンス
	 */
	public String onClickCancelSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AL0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AL0040011.jsp";		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelSub2");
		//{{user_implement_dev:<onClickCancelSub2>

		try {
			control.control_eventHandller("CancelSub2");

			if (control.getAlInstalledFlg().equals("0") == true) {
				// ALがインストールされていない場合
				// 複数工程日別負荷参照画面に遷移
				nextUrl = "/AL0040010.jsp";
			}
		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<onClickCancelSub2>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelSub2");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AL0040010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] DateFrom = ((params.containsKey("DateFrom")) ? (String[])params.get("DateFrom") : (String[])null);
		String[] NECK_PROC_NAME = ((params.containsKey("NECK_PROC_NAME")) ? (String[])params.get("NECK_PROC_NAME") : (String[])null);
		String[] DateTo = ((params.containsKey("DateTo")) ? (String[])params.get("DateTo") : (String[])null);
		String[] NECK_PROC_CD = ((params.containsKey("NECK_PROC_CD")) ? (String[])params.get("NECK_PROC_CD") : (String[])null);
		String[] K_NECK_PROC_CD = ((params.containsKey("K_NECK_PROC_CD")) ? (String[])params.get("K_NECK_PROC_CD") : (String[])null);
		String[] K_PLANT_CD = ((params.containsKey("K_PLANT_CD")) ? (String[])params.get("K_PLANT_CD") : (String[])null);
		String[] K_LOAD_DATE = ((params.containsKey("K_LOAD_DATE")) ? (String[])params.get("K_LOAD_DATE") : (String[])null);
		String[] L_NECK_PROC_CD = ((params.containsKey("L_NECK_PROC_CD")) ? (String[])params.get("L_NECK_PROC_CD") : (String[])null);
		String[] L_NECK_PROC_NAME = ((params.containsKey("L_NECK_PROC_NAME")) ? (String[])params.get("L_NECK_PROC_NAME") : (String[])null);
		String[] L_NECK_PROC_CAPA = ((params.containsKey("L_NECK_PROC_CAPA")) ? (String[])params.get("L_NECK_PROC_CAPA") : (String[])null);
		String[] L_NECK_PROC_CAPA_UNIT = ((params.containsKey("L_NECK_PROC_CAPA_UNIT")) ? (String[])params.get("L_NECK_PROC_CAPA_UNIT") : (String[])null);
		String[] Shift_Date = ((params.containsKey("Shift_Date")) ? (String[])params.get("Shift_Date") : (String[])null);
		String[] LKM_NECK_PROC_CD = ((params.containsKey("LKM_NECK_PROC_CD")) ? (String[])params.get("LKM_NECK_PROC_CD") : (String[])null);
		String[] LKM_NECK_PROC_NAME = ((params.containsKey("LKM_NECK_PROC_NAME")) ? (String[])params.get("LKM_NECK_PROC_NAME") : (String[])null);
		String[] LKM_NECK_PROC_CAPA = ((params.containsKey("LKM_NECK_PROC_CAPA")) ? (String[])params.get("LKM_NECK_PROC_CAPA") : (String[])null);
		String[] LKM_NECK_PROC_CAPA_UNIT = ((params.containsKey("LKM_NECK_PROC_CAPA_UNIT")) ? (String[])params.get("LKM_NECK_PROC_CAPA_UNIT") : (String[])null);
		String[] LKM_LOAD_DATE = ((params.containsKey("LKM_LOAD_DATE")) ? (String[])params.get("LKM_LOAD_DATE") : (String[])null);
		String[] LKM_SUM_LOAD_QTY = ((params.containsKey("LKM_SUM_LOAD_QTY")) ? (String[])params.get("LKM_SUM_LOAD_QTY") : (String[])null);
		String[] LKM_OVR_LOAD_QTY = ((params.containsKey("LKM_OVR_LOAD_QTY")) ? (String[])params.get("LKM_OVR_LOAD_QTY") : (String[])null);
		String[] LKM_ITEM_CD = ((params.containsKey("LKM_ITEM_CD")) ? (String[])params.get("LKM_ITEM_CD") : (String[])null);
		String[] LKM_ITEM_NAME = ((params.containsKey("LKM_ITEM_NAME")) ? (String[])params.get("LKM_ITEM_NAME") : (String[])null);
		String[] LKM_JOB_ODR_CD = ((params.containsKey("LKM_JOB_ODR_CD")) ? (String[])params.get("LKM_JOB_ODR_CD") : (String[])null);
		String[] LKM_ODR_STS_TYP = ((params.containsKey("LKM_ODR_STS_TYP")) ? (String[])params.get("LKM_ODR_STS_TYP") : (String[])null);
		String[] LKM_PRD_START_DATE = ((params.containsKey("LKM_PRD_START_DATE")) ? (String[])params.get("LKM_PRD_START_DATE") : (String[])null);
		String[] LKM_PRD_DUE_DATE = ((params.containsKey("LKM_PRD_DUE_DATE")) ? (String[])params.get("LKM_PRD_DUE_DATE") : (String[])null);
		String[] LKM_ODR_QTY = ((params.containsKey("LKM_ODR_QTY")) ? (String[])params.get("LKM_ODR_QTY") : (String[])null);
		String[] LKM_TOTAL_RCV_QTY = ((params.containsKey("LKM_TOTAL_RCV_QTY")) ? (String[])params.get("LKM_TOTAL_RCV_QTY") : (String[])null);
		String[] LKM_UNIT_LOAD = ((params.containsKey("LKM_UNIT_LOAD")) ? (String[])params.get("LKM_UNIT_LOAD") : (String[])null);
		String[] LKM_LOAD_QTY = ((params.containsKey("LKM_LOAD_QTY")) ? (String[])params.get("LKM_LOAD_QTY") : (String[])null);
		String[] hidden_High_Color = ((params.containsKey("hidden_High_Color")) ? (String[])params.get("hidden_High_Color") : (String[])null);
		String[] hidden_Midd_Color = ((params.containsKey("hidden_Midd_Color")) ? (String[])params.get("hidden_Midd_Color") : (String[])null);
		String[] hidden_Low_Color = ((params.containsKey("hidden_Low_Color")) ? (String[])params.get("hidden_Low_Color") : (String[])null);
		String[] hidden_DateFrom = ((params.containsKey("hidden_DateFrom")) ? (String[])params.get("hidden_DateFrom") : (String[])null);
		String[] hidden_DateTo = ((params.containsKey("hidden_DateTo")) ? (String[])params.get("hidden_DateTo") : (String[])null);
		String[] S_LOAD_DATE = ((params.containsKey("S_LOAD_DATE")) ? (String[])params.get("S_LOAD_DATE") : (String[])null);

		struct.setDateFrom( ((DateFrom == null) ? (String)null : DateFrom[0]) );
		struct.setList_DateFrom(TypeConverter.convert(DateFrom));
		struct.setNECK_PROC_NAME( ((NECK_PROC_NAME == null) ? (String)null : NECK_PROC_NAME[0]) );
		struct.setList_NECK_PROC_NAME(TypeConverter.convert(NECK_PROC_NAME));
		struct.setDateTo( ((DateTo == null) ? (String)null : DateTo[0]) );
		struct.setList_DateTo(TypeConverter.convert(DateTo));
		struct.setNECK_PROC_CD( ((NECK_PROC_CD == null) ? (String)null : NECK_PROC_CD[0]) );
		struct.setList_NECK_PROC_CD(TypeConverter.convert(NECK_PROC_CD));
		struct.setK_NECK_PROC_CD( ((K_NECK_PROC_CD == null) ? (String)null : K_NECK_PROC_CD[0]) );
		struct.setList_K_NECK_PROC_CD(TypeConverter.convert(K_NECK_PROC_CD));
		struct.setK_PLANT_CD( ((K_PLANT_CD == null) ? (String)null : K_PLANT_CD[0]) );
		struct.setList_K_PLANT_CD(TypeConverter.convert(K_PLANT_CD));
		struct.setK_LOAD_DATE( ((K_LOAD_DATE == null) ? (String)null : K_LOAD_DATE[0]) );
		struct.setList_K_LOAD_DATE(TypeConverter.convert(K_LOAD_DATE));
		struct.setL_NECK_PROC_CD( ((L_NECK_PROC_CD == null) ? (String)null : L_NECK_PROC_CD[0]) );
		struct.setList_L_NECK_PROC_CD(TypeConverter.convert(L_NECK_PROC_CD));
		struct.setL_NECK_PROC_NAME( ((L_NECK_PROC_NAME == null) ? (String)null : L_NECK_PROC_NAME[0]) );
		struct.setList_L_NECK_PROC_NAME(TypeConverter.convert(L_NECK_PROC_NAME));
		struct.setL_NECK_PROC_CAPA( ((L_NECK_PROC_CAPA == null) ? (String)null : L_NECK_PROC_CAPA[0]) );
		struct.setList_L_NECK_PROC_CAPA(TypeConverter.convert(L_NECK_PROC_CAPA));
		struct.setL_NECK_PROC_CAPA_UNIT( ((L_NECK_PROC_CAPA_UNIT == null) ? (String)null : L_NECK_PROC_CAPA_UNIT[0]) );
		struct.setList_L_NECK_PROC_CAPA_UNIT(TypeConverter.convert(L_NECK_PROC_CAPA_UNIT));
		struct.setShift_Date( ((Shift_Date == null) ? (String)null : Shift_Date[0]) );
		struct.setList_Shift_Date(TypeConverter.convert(Shift_Date));
		struct.setLKM_NECK_PROC_CD( ((LKM_NECK_PROC_CD == null) ? (String)null : LKM_NECK_PROC_CD[0]) );
		struct.setList_LKM_NECK_PROC_CD(TypeConverter.convert(LKM_NECK_PROC_CD));
		struct.setLKM_NECK_PROC_NAME( ((LKM_NECK_PROC_NAME == null) ? (String)null : LKM_NECK_PROC_NAME[0]) );
		struct.setList_LKM_NECK_PROC_NAME(TypeConverter.convert(LKM_NECK_PROC_NAME));
		struct.setLKM_NECK_PROC_CAPA( ((LKM_NECK_PROC_CAPA == null) ? (String)null : LKM_NECK_PROC_CAPA[0]) );
		struct.setList_LKM_NECK_PROC_CAPA(TypeConverter.convert(LKM_NECK_PROC_CAPA));
		struct.setLKM_NECK_PROC_CAPA_UNIT( ((LKM_NECK_PROC_CAPA_UNIT == null) ? (String)null : LKM_NECK_PROC_CAPA_UNIT[0]) );
		struct.setList_LKM_NECK_PROC_CAPA_UNIT(TypeConverter.convert(LKM_NECK_PROC_CAPA_UNIT));
		struct.setLKM_LOAD_DATE( ((LKM_LOAD_DATE == null) ? (String)null : LKM_LOAD_DATE[0]) );
		struct.setList_LKM_LOAD_DATE(TypeConverter.convert(LKM_LOAD_DATE));
		struct.setLKM_SUM_LOAD_QTY( ((LKM_SUM_LOAD_QTY == null) ? (String)null : LKM_SUM_LOAD_QTY[0]) );
		struct.setList_LKM_SUM_LOAD_QTY(TypeConverter.convert(LKM_SUM_LOAD_QTY));
		struct.setLKM_OVR_LOAD_QTY( ((LKM_OVR_LOAD_QTY == null) ? (String)null : LKM_OVR_LOAD_QTY[0]) );
		struct.setList_LKM_OVR_LOAD_QTY(TypeConverter.convert(LKM_OVR_LOAD_QTY));
		struct.setLKM_ITEM_CD( ((LKM_ITEM_CD == null) ? (String)null : LKM_ITEM_CD[0]) );
		struct.setList_LKM_ITEM_CD(TypeConverter.convert(LKM_ITEM_CD));
		struct.setLKM_ITEM_NAME( ((LKM_ITEM_NAME == null) ? (String)null : LKM_ITEM_NAME[0]) );
		struct.setList_LKM_ITEM_NAME(TypeConverter.convert(LKM_ITEM_NAME));
		struct.setLKM_JOB_ODR_CD( ((LKM_JOB_ODR_CD == null) ? (String)null : LKM_JOB_ODR_CD[0]) );
		struct.setList_LKM_JOB_ODR_CD(TypeConverter.convert(LKM_JOB_ODR_CD));
		struct.setLKM_ODR_STS_TYP( ((LKM_ODR_STS_TYP == null) ? (String)null : LKM_ODR_STS_TYP[0]) );
		struct.setList_LKM_ODR_STS_TYP(TypeConverter.convert(LKM_ODR_STS_TYP));
		struct.setLKM_PRD_START_DATE( ((LKM_PRD_START_DATE == null) ? (String)null : LKM_PRD_START_DATE[0]) );
		struct.setList_LKM_PRD_START_DATE(TypeConverter.convert(LKM_PRD_START_DATE));
		struct.setLKM_PRD_DUE_DATE( ((LKM_PRD_DUE_DATE == null) ? (String)null : LKM_PRD_DUE_DATE[0]) );
		struct.setList_LKM_PRD_DUE_DATE(TypeConverter.convert(LKM_PRD_DUE_DATE));
		struct.setLKM_ODR_QTY( ((LKM_ODR_QTY == null) ? (String)null : LKM_ODR_QTY[0]) );
		struct.setList_LKM_ODR_QTY(TypeConverter.convert(LKM_ODR_QTY));
		struct.setLKM_TOTAL_RCV_QTY( ((LKM_TOTAL_RCV_QTY == null) ? (String)null : LKM_TOTAL_RCV_QTY[0]) );
		struct.setList_LKM_TOTAL_RCV_QTY(TypeConverter.convert(LKM_TOTAL_RCV_QTY));
		struct.setLKM_UNIT_LOAD( ((LKM_UNIT_LOAD == null) ? (String)null : LKM_UNIT_LOAD[0]) );
		struct.setList_LKM_UNIT_LOAD(TypeConverter.convert(LKM_UNIT_LOAD));
		struct.setLKM_LOAD_QTY( ((LKM_LOAD_QTY == null) ? (String)null : LKM_LOAD_QTY[0]) );
		struct.setList_LKM_LOAD_QTY(TypeConverter.convert(LKM_LOAD_QTY));
		struct.sethidden_High_Color( ((hidden_High_Color == null) ? (String)null : hidden_High_Color[0]) );
		struct.setList_hidden_High_Color(TypeConverter.convert(hidden_High_Color));
		struct.sethidden_Midd_Color( ((hidden_Midd_Color == null) ? (String)null : hidden_Midd_Color[0]) );
		struct.setList_hidden_Midd_Color(TypeConverter.convert(hidden_Midd_Color));
		struct.sethidden_Low_Color( ((hidden_Low_Color == null) ? (String)null : hidden_Low_Color[0]) );
		struct.setList_hidden_Low_Color(TypeConverter.convert(hidden_Low_Color));
		struct.sethidden_DateFrom( ((hidden_DateFrom == null) ? (String)null : hidden_DateFrom[0]) );
		struct.setList_hidden_DateFrom(TypeConverter.convert(hidden_DateFrom));
		struct.sethidden_DateTo( ((hidden_DateTo == null) ? (String)null : hidden_DateTo[0]) );
		struct.setList_hidden_DateTo(TypeConverter.convert(hidden_DateTo));
		struct.setS_LOAD_DATE( ((S_LOAD_DATE == null) ? (String)null : S_LOAD_DATE[0]) );
		struct.setList_S_LOAD_DATE(TypeConverter.convert(S_LOAD_DATE));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AL0040010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAL0040010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAL0040010Struct";   // JSP先のバインド名(Struct)の指定
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
					AL0040010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AL0040010Entity entity = control.entity;
		AL0040010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AL0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AL0040010Control control;
		AL0040010Entity  entity = null;
		AL0040010Struct  struct = null;

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

			if( (control = (AL0040010Control)so.getAttribute("AL0040010Control_"+request.getSession(false).getId())) == null ) {
				control = new AL0040010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AL0040010Control();
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
				} else if( isClick(request, "SelectNeckCD") ) {
					if ( !isCryptical(request, so, params, "SelectNeckCD") ) return ERROR_TARGET;
					target = onClickSelectNeckCD(request, response, so, params, control);
					control.setButton("SelectNeckCD");
				} else if( isClick(request, "Select_Prev") ) {
					if ( !isCryptical(request, so, params, "Select_Prev") ) return ERROR_TARGET;
					target = onClickSelect_Prev(request, response, so, params, control);
					control.setButton("Select_Prev");
				} else if( isClick(request, "Select_Next") ) {
					if ( !isCryptical(request, so, params, "Select_Next") ) return ERROR_TARGET;
					target = onClickSelect_Next(request, response, so, params, control);
					control.setButton("Select_Next");
				} else if( isClick(request, "SelectNeckDetail") ) {
					if ( !isCryptical(request, so, params, "SelectNeckDetail") ) return ERROR_TARGET;
					target = onClickSelectNeckDetail(request, response, so, params, control);
					control.setButton("SelectNeckDetail");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "CancelSub1") ) {
					if ( !isCryptical(request, so, params, "CancelSub1") ) return ERROR_TARGET;
					target = onClickCancelSub1(request, response, so, params, control);
					control.setButton("CancelSub1");
				} else if( isClick(request, "CancelSub2") ) {
					if ( !isCryptical(request, so, params, "CancelSub2") ) return ERROR_TARGET;
					target = onClickCancelSub2(request, response, so, params, control);
					control.setButton("CancelSub2");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AL0040010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>

				////!DEBUG用コード
				//System.out.println("---< start >-------------------");
				//Enumeration paramNames = request.getParameterNames();
				//while (paramNames.hasMoreElements()) {
				//	String paramName = (String)paramNames.nextElement();
				//	System.out.println(" paramName: " + paramName);
				//	String[] paramValues = request.getParameterValues(paramName);
				//	if (paramValues.length == 1) {
				//		String paramValue = paramValues[0];
				//		if (paramValue.length() == 0) {
				//			System.out.println("paramValue:");
				//		} else {
				//			System.out.println("paramValue: " + paramValue);
				//		}
				//	} else {
				//		String paramValue = paramValues[0];
				//		for (int i = 1; i < paramValues.length; i++) {
				//			paramValue = paramValue + "/" + paramValues[i];
				//		}
				//		System.out.println("paramValue: " + paramValue);
				//	}
				//}
				//System.out.println("---< end >---------------------");

				String nextUrl = null;      // 移動先ＵＲＬ
				// 複数工程日別負荷参照画面からのアンカーイベント
				if (request.getParameter("NeckProcCd") != null
						&& request.getParameter("HeaderDay") != null
						&& request.getParameter("KFromDay") != null
						&& request.getParameter("KToDay") != null)
				{
					//!DEBUG用コード
					//System.out.println("\tアンカーパラメータ取得");

					// 制約工程コード
					_strNECK_PROC_CD = request.getParameter("NeckProcCd");
					// 負荷参照日
					_strLOAD_DATE = request.getParameter("HeaderDay");
					// 期間From
					_strFrom_DATE = request.getParameter("KFromDay");
					// 期間To
					_strTo_DATE = request.getParameter("KToDay");
					// 選択日付の保存
					_strSLOAD_DATE = _strLOAD_DATE;

					if (control.getAlInstalledFlg().equals("0") == true) {
						// ALがインストールされていない場合
						// 工程別負荷明細画面に遷移
						_strGraph_DATE = _strLOAD_DATE;
						_strChart_DATE = _strLOAD_DATE;
						target = onClickSelectNeckDetail(request, response, so, params, control);
					} else {
						// ALがインストールされている場合
						// 工程別負荷参照画面（グラフ画面）に遷移
						target = onClickSelectNeckCD(request, response, so, params, control);
					}
				} else

				// 工日別負荷参照画面の右左矢印イメージボタンイベント
				if (isClick(request, "Select_Prev.x") && isClick(request, "Select_Prev.y")) {
					//!DEBUG用コード
					//System.out.println("\t工日別負荷参照画面の左矢印イメージボタンイベント取得");

					target = onClickSelect_Prev(request, response, so, params, control);
				} else if (isClick(request, "Select_Next.x") && isClick(request, "Select_Next.y")) {
					//!DEBUG用コード
					//System.out.println("\t工日別負荷参照画面の右矢印イメージボタンイベント取得");

					target = onClickSelect_Next(request, response, so, params, control);
				} else

				// 工程別負荷参照画面のグラフハイパーリンクイベント
				if (request.getParameter("Pid") != null
						&& request.getParameter("NeckCd") != null
						&& request.getParameter("LoadDay") != null
						&& request.getParameter("GraphDay") != null
						&& request.getParameter("ShiftDay") != null)
				{
					_strProgramId = request.getParameter("Pid");
					if (_strProgramId.equals("AL0040012") == true) {
						//!DEBUG用コード
						//System.out.println("\tハイパーリンクパラメータ取得");

						// 制約工程コード
						_strNECK_PROC_CD = request.getParameter("NeckCd");
						// グラフ選択日
						_strGraph_DATE = request.getParameter("LoadDay");
						// グラフ表示日
						_strChart_DATE = request.getParameter("GraphDay");
						// シフト日数
						_strShift_Date = request.getParameter("ShiftDay");
						// 選択日付の保存
						_strSLOAD_DATE = request.getParameter("SLoadDay");

						target = onClickSelectNeckDetail(request, response, so, params, control);
					}
				}

				////!DEBUG用コード
				//struct = control.struct;
				//if (struct.getDateFrom() != null) { System.out.println("\tDateFrom: " + struct.getDateFrom()); }
				//if (struct.getNECK_PROC_NAME() != null) { System.out.println("\tNECK_PROC_NAME: " + struct.getNECK_PROC_NAME()); }
				//if (struct.getDateTo() != null) { System.out.println("\tDateTo: " + struct.getDateTo()); }
				//if (struct.getNECK_PROC_CD() != null) { System.out.println("\tstruct.NECK_PROC_CD(): " + struct.getNECK_PROC_CD()); }
				//if (struct.getK_NECK_PROC_CD() != null) { System.out.println("\tK_NECK_PROC_CD: " + struct.getK_NECK_PROC_CD()); }
				//if (struct.getK_PLANT_CD() != null) { System.out.println("\tK_PLANT_CD: " + struct.getK_PLANT_CD()); }
				//if (struct.getK_LOAD_DATE() != null) { System.out.println("\tK_LOAD_DATE: " + struct.getK_LOAD_DATE()); }
				//if (struct.getL_NECK_PROC_CD() != null) { System.out.println("\tL_NECK_PROC_CD: " + struct.getL_NECK_PROC_CD()); }
				//if (struct.getL_NECK_PROC_NAME() != null) { System.out.println("\tL_NECK_PROC_NAME: " + struct.getL_NECK_PROC_NAME()); }
				//if (struct.getL_NECK_PROC_CAPA() != null) { System.out.println("\tL_NECK_PROC_CAPA: " + struct.getL_NECK_PROC_CAPA()); }
				//if (struct.getL_NECK_PROC_CAPA_UNIT() != null) { System.out.println("\tL_NECK_PROC_CAPA_UNIT: " + struct.getL_NECK_PROC_CAPA_UNIT()); }
				//if (struct.getShift_Date() != null) { System.out.println("\tShift_Date: " + struct.getShift_Date()); }
				//if (struct.getLKM_NECK_PROC_CD() != null) { System.out.println("\tLKM_NECK_PROC_CD: " + struct.getLKM_NECK_PROC_CD()); }
				//if (struct.getLKM_NECK_PROC_NAME() != null) { System.out.println("\tLKM_NECK_PROC_NAME: " + struct.getLKM_NECK_PROC_NAME()); }
				//if (struct.getLKM_NECK_PROC_CAPA() != null) { System.out.println("\tLKM_NECK_PROC_CAPA: " + struct.getLKM_NECK_PROC_CAPA()); }
				//if (struct.getLKM_NECK_PROC_CAPA_UNIT() != null) { System.out.println("\tLKM_NECK_PROC_CAPA_UNIT: " + struct.getLKM_NECK_PROC_CAPA_UNIT()); }
				//if (struct.getLKM_LOAD_DATE() != null) { System.out.println("\tLKM_LOAD_DATE: " + struct.getLKM_LOAD_DATE()); }
				//if (struct.getLKM_SUM_LOAD_QTY() != null) { System.out.println("\tLKM_SUM_LOAD_QTY: " + struct.getLKM_SUM_LOAD_QTY()); }
				//if (struct.getLKM_OVR_LOAD_QTY() != null) { System.out.println("\tLKM_OVR_LOAD_QTY: " + struct.getLKM_OVR_LOAD_QTY()); }
				//if (struct.getLKM_ITEM_CD() != null) { System.out.println("\tLKM_ITEM_CD: " + struct.getLKM_ITEM_CD()); }
				//if (struct.getLKM_ITEM_NAME() != null) { System.out.println("\tLKM_ITEM_NAME: " + struct.getLKM_ITEM_NAME()); }
				//if (struct.getLKM_JOB_ODR_CD() != null) { System.out.println("\tLKM_JOB_ODR_CD: " + struct.getLKM_JOB_ODR_CD()); }
				//if (struct.getLKM_ODR_STS_TYP() != null) { System.out.println("\tLKM_ODR_STS_TYP: " + struct.getLKM_ODR_STS_TYP()); }
				//if (struct.getLKM_PRD_START_DATE() != null) { System.out.println("\tLKM_PRD_START_DATE: " + struct.getLKM_PRD_START_DATE()); }
				//if (struct.getLKM_PRD_DUE_DATE() != null) { System.out.println("\tLKM_PRD_DUE_DATE: " + struct.getLKM_PRD_DUE_DATE()); }
				//if (struct.getLKM_ODR_QTY() != null) { System.out.println("\tLKM_ODR_QTY: " + struct.getLKM_ODR_QTY()); }
				//if (struct.getLKM_TOTAL_RCV_QTY() != null) { System.out.println("\tLKM_TOTAL_RCV_QTY: " + struct.getLKM_TOTAL_RCV_QTY()); }
				//if (struct.getLKM_UNIT_LOAD() != null) { System.out.println("\tLKM_UNIT_LOAD: " + struct.getLKM_UNIT_LOAD()); }
				//if (struct.getLKM_LOAD_QTY() != null) { System.out.println("\tLKM_LOAD_QTY: " + struct.getLKM_LOAD_QTY()); }
				//if (struct.gethidden_High_Color() != null) { System.out.println("\thidden_High_Color: " + struct.gethidden_High_Color()); }
				//if (struct.gethidden_Midd_Color() != null) { System.out.println("\thidden_Midd_Color: " + struct.gethidden_Midd_Color()); }
				//if (struct.gethidden_Low_Color() != null) { System.out.println("\thidden_Low_Color: " + struct.gethidden_Low_Color()); }
				//if (struct.gethidden_DateFrom() != null) { System.out.println("\thidden_DateFrom: " + struct.gethidden_DateFrom()); }
				//if (struct.gethidden_DateTo() != null) { System.out.println("\thidden_DateTo: " + struct.gethidden_DateTo()); }
				//if (struct.getS_LOAD_DATE() != null) { System.out.println("\tS_LOAD_DATE: " + struct.getS_LOAD_DATE()); }

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
				|| (isClick(request, "SelectNeckCD") && bFLG_DISCONNECT_SelectNeckCD)
				|| (isClick(request, "Select_Prev") && bFLG_DISCONNECT_Select_Prev)
				|| (isClick(request, "Select_Next") && bFLG_DISCONNECT_Select_Next)
				|| (isClick(request, "SelectNeckDetail") && bFLG_DISCONNECT_SelectNeckDetail)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "CancelSub1") && bFLG_DISCONNECT_CancelSub1)
				|| (isClick(request, "CancelSub2") && bFLG_DISCONNECT_CancelSub2)
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
	private  static boolean bFLG_DISCONNECT_SelectNeckCD = true;
	private  static boolean bFLG_DISCONNECT_Select_Prev = true;
	private  static boolean bFLG_DISCONNECT_Select_Next = true;
	private  static boolean bFLG_DISCONNECT_SelectNeckDetail = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_CancelSub1 = true;
	private  static boolean bFLG_DISCONNECT_CancelSub2 = true;

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
		return "com.nec.jp.orteus.metamorBase.AL0040.AL0040010Servlet";
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
	public AL0040010Servlet()
	{
		//{{user_implement_dev:<AL0040010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_SelectNeckCD = true;
		bFLG_DISCONNECT_Select_Prev = true;
		bFLG_DISCONNECT_Select_Next = true;
		bFLG_DISCONNECT_CancelSub1 = true;
		bFLG_DISCONNECT_SelectNeckDetail = true;
		bFLG_DISCONNECT_CancelSub2 = true;
		bFLG_DISCONNECT_Close = true;
		bFLG_DISCONNECT_Clear = true;

                //}}user_implement_dev:<AL0040010_DisConnect_FLG>

		//{{user_implement_dev:<AL0040010Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AL0040010Servlet>
	}

	//////////////////////////////

}
