/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0020/src/com/nec/jp/orteus/metamorBase/AN0020/AN0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0020;

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

public class AN0020010Servlet extends HttpServlet
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
	 * @param control AN0020010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AN0020010Control control)
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
	 * @param control AN0020010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AN0020010Control control)
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
	 * @param control AN0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
			logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ユーザ定義のコードを記述してください
              //			objMessage.m_writer.write( Level.ALL, "AN0020010"+" $Revision: 1.3 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AN0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0020010-E999","リロード処理"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AN0020010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AN0020010Controlクラスインスタンス
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("Update");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AN0020010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AN0020010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AN0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] CHART_CD = ((params.containsKey("CHART_CD")) ? (String[])params.get("CHART_CD") : (String[])null);
		String[] CHART_NAME = ((params.containsKey("CHART_NAME")) ? (String[])params.get("CHART_NAME") : (String[])null);
		String[] CHART_TYP = ((params.containsKey("CHART_TYP")) ? (String[])params.get("CHART_TYP") : (String[])null);
		String[] CHART_TYP_name = ((params.containsKey("CHART_TYP_name")) ? (String[])params.get("CHART_TYP_name") : (String[])null);
		String[] CHART_TYP_val = ((params.containsKey("CHART_TYP_val")) ? (String[])params.get("CHART_TYP_val") : (String[])null);
		String[] DIMENSION_TYP = ((params.containsKey("DIMENSION_TYP")) ? (String[])params.get("DIMENSION_TYP") : (String[])null);
		String[] DIMENSION_TYP_name = ((params.containsKey("DIMENSION_TYP_name")) ? (String[])params.get("DIMENSION_TYP_name") : (String[])null);
		String[] DIMENSION_TYP_val = ((params.containsKey("DIMENSION_TYP_val")) ? (String[])params.get("DIMENSION_TYP_val") : (String[])null);
		String[] MAX_SCALE_RATE = ((params.containsKey("MAX_SCALE_RATE")) ? (String[])params.get("MAX_SCALE_RATE") : (String[])null);
		String[] SCALE_STEP = ((params.containsKey("SCALE_STEP")) ? (String[])params.get("SCALE_STEP") : (String[])null);
		String[] HIGH_LOAD = ((params.containsKey("HIGH_LOAD")) ? (String[])params.get("HIGH_LOAD") : (String[])null);
		String[] MIDDLE_LOAD = ((params.containsKey("MIDDLE_LOAD")) ? (String[])params.get("MIDDLE_LOAD") : (String[])null);
		String[] LOW_LOAD = ((params.containsKey("LOW_LOAD")) ? (String[])params.get("LOW_LOAD") : (String[])null);
		String[] BACKGROUNDCOLOR_R = ((params.containsKey("BACKGROUNDCOLOR_R")) ? (String[])params.get("BACKGROUNDCOLOR_R") : (String[])null);
		String[] BACKGROUNDCOLOR_G = ((params.containsKey("BACKGROUNDCOLOR_G")) ? (String[])params.get("BACKGROUNDCOLOR_G") : (String[])null);
		String[] BACKGROUNDCOLOR_B = ((params.containsKey("BACKGROUNDCOLOR_B")) ? (String[])params.get("BACKGROUNDCOLOR_B") : (String[])null);
		String[] CHART_COLOR0_R = ((params.containsKey("CHART_COLOR0_R")) ? (String[])params.get("CHART_COLOR0_R") : (String[])null);
		String[] CHART_COLOR0_G = ((params.containsKey("CHART_COLOR0_G")) ? (String[])params.get("CHART_COLOR0_G") : (String[])null);
		String[] CHART_COLOR0_B = ((params.containsKey("CHART_COLOR0_B")) ? (String[])params.get("CHART_COLOR0_B") : (String[])null);
		String[] CHART_COLOR1_R = ((params.containsKey("CHART_COLOR1_R")) ? (String[])params.get("CHART_COLOR1_R") : (String[])null);
		String[] CHART_COLOR1_G = ((params.containsKey("CHART_COLOR1_G")) ? (String[])params.get("CHART_COLOR1_G") : (String[])null);
		String[] CHART_COLOR1_B = ((params.containsKey("CHART_COLOR1_B")) ? (String[])params.get("CHART_COLOR1_B") : (String[])null);
		String[] CHART_COLOR2_R = ((params.containsKey("CHART_COLOR2_R")) ? (String[])params.get("CHART_COLOR2_R") : (String[])null);
		String[] CHART_COLOR2_G = ((params.containsKey("CHART_COLOR2_G")) ? (String[])params.get("CHART_COLOR2_G") : (String[])null);
		String[] CHART_COLOR2_B = ((params.containsKey("CHART_COLOR2_B")) ? (String[])params.get("CHART_COLOR2_B") : (String[])null);
		String[] CHART_COLOR9_R = ((params.containsKey("CHART_COLOR9_R")) ? (String[])params.get("CHART_COLOR9_R") : (String[])null);
		String[] CHART_COLOR9_G = ((params.containsKey("CHART_COLOR9_G")) ? (String[])params.get("CHART_COLOR9_G") : (String[])null);
		String[] CHART_COLOR9_B = ((params.containsKey("CHART_COLOR9_B")) ? (String[])params.get("CHART_COLOR9_B") : (String[])null);
		String[] HIGH_LOAD_COLOR_R = ((params.containsKey("HIGH_LOAD_COLOR_R")) ? (String[])params.get("HIGH_LOAD_COLOR_R") : (String[])null);
		String[] HIGH_LOAD_COLOR_G = ((params.containsKey("HIGH_LOAD_COLOR_G")) ? (String[])params.get("HIGH_LOAD_COLOR_G") : (String[])null);
		String[] HIGH_LOAD_COLOR_B = ((params.containsKey("HIGH_LOAD_COLOR_B")) ? (String[])params.get("HIGH_LOAD_COLOR_B") : (String[])null);
		String[] h_MODIFY_COUNT = ((params.containsKey("h_MODIFY_COUNT")) ? (String[])params.get("h_MODIFY_COUNT") : (String[])null);
		String[] LOW_LOAD_COLOR_R = ((params.containsKey("LOW_LOAD_COLOR_R")) ? (String[])params.get("LOW_LOAD_COLOR_R") : (String[])null);
		String[] LOW_LOAD_COLOR_G = ((params.containsKey("LOW_LOAD_COLOR_G")) ? (String[])params.get("LOW_LOAD_COLOR_G") : (String[])null);
		String[] LOW_LOAD_COLOR_B = ((params.containsKey("LOW_LOAD_COLOR_B")) ? (String[])params.get("LOW_LOAD_COLOR_B") : (String[])null);
		String[] MIDDLE_LOAD_COLOR_R = ((params.containsKey("MIDDLE_LOAD_COLOR_R")) ? (String[])params.get("MIDDLE_LOAD_COLOR_R") : (String[])null);
		String[] MIDDLE_LOAD_COLOR_G = ((params.containsKey("MIDDLE_LOAD_COLOR_G")) ? (String[])params.get("MIDDLE_LOAD_COLOR_G") : (String[])null);
		String[] MIDDLE_LOAD_COLOR_B = ((params.containsKey("MIDDLE_LOAD_COLOR_B")) ? (String[])params.get("MIDDLE_LOAD_COLOR_B") : (String[])null);

		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setCHART_CD( ((CHART_CD == null) ? (String)null : CHART_CD[0]) );
		struct.setList_CHART_CD(TypeConverter.convert(CHART_CD));
		struct.setCHART_NAME( ((CHART_NAME == null) ? (String)null : CHART_NAME[0]) );
		struct.setList_CHART_NAME(TypeConverter.convert(CHART_NAME));
		struct.setCHART_TYP( ((CHART_TYP == null) ? (String)null : CHART_TYP[0]) );
		struct.setList_CHART_TYP(TypeConverter.convert(CHART_TYP));
		struct.setCHART_TYP_name( ((CHART_TYP_name == null) ? (String)null : CHART_TYP_name[0]) );
		struct.setList_CHART_TYP_name(TypeConverter.convert(CHART_TYP_name));
		struct.setCHART_TYP_val( ((CHART_TYP_val == null) ? (String)null : CHART_TYP_val[0]) );
		struct.setList_CHART_TYP_val(TypeConverter.convert(CHART_TYP_val));
		struct.setDIMENSION_TYP( ((DIMENSION_TYP == null) ? (String)null : DIMENSION_TYP[0]) );
		struct.setList_DIMENSION_TYP(TypeConverter.convert(DIMENSION_TYP));
		struct.setDIMENSION_TYP_name( ((DIMENSION_TYP_name == null) ? (String)null : DIMENSION_TYP_name[0]) );
		struct.setList_DIMENSION_TYP_name(TypeConverter.convert(DIMENSION_TYP_name));
		struct.setDIMENSION_TYP_val( ((DIMENSION_TYP_val == null) ? (String)null : DIMENSION_TYP_val[0]) );
		struct.setList_DIMENSION_TYP_val(TypeConverter.convert(DIMENSION_TYP_val));
		struct.setMAX_SCALE_RATE( ((MAX_SCALE_RATE == null) ? (String)null : MAX_SCALE_RATE[0]) );
		struct.setList_MAX_SCALE_RATE(TypeConverter.convert(MAX_SCALE_RATE));
		struct.setSCALE_STEP( ((SCALE_STEP == null) ? (String)null : SCALE_STEP[0]) );
		struct.setList_SCALE_STEP(TypeConverter.convert(SCALE_STEP));
		struct.setHIGH_LOAD( ((HIGH_LOAD == null) ? (String)null : HIGH_LOAD[0]) );
		struct.setList_HIGH_LOAD(TypeConverter.convert(HIGH_LOAD));
		struct.setMIDDLE_LOAD( ((MIDDLE_LOAD == null) ? (String)null : MIDDLE_LOAD[0]) );
		struct.setList_MIDDLE_LOAD(TypeConverter.convert(MIDDLE_LOAD));
		struct.setLOW_LOAD( ((LOW_LOAD == null) ? (String)null : LOW_LOAD[0]) );
		struct.setList_LOW_LOAD(TypeConverter.convert(LOW_LOAD));
		struct.setBACKGROUNDCOLOR_R( ((BACKGROUNDCOLOR_R == null) ? (String)null : BACKGROUNDCOLOR_R[0]) );
		struct.setList_BACKGROUNDCOLOR_R(TypeConverter.convert(BACKGROUNDCOLOR_R));
		struct.setBACKGROUNDCOLOR_G( ((BACKGROUNDCOLOR_G == null) ? (String)null : BACKGROUNDCOLOR_G[0]) );
		struct.setList_BACKGROUNDCOLOR_G(TypeConverter.convert(BACKGROUNDCOLOR_G));
		struct.setBACKGROUNDCOLOR_B( ((BACKGROUNDCOLOR_B == null) ? (String)null : BACKGROUNDCOLOR_B[0]) );
		struct.setList_BACKGROUNDCOLOR_B(TypeConverter.convert(BACKGROUNDCOLOR_B));
		struct.setCHART_COLOR0_R( ((CHART_COLOR0_R == null) ? (String)null : CHART_COLOR0_R[0]) );
		struct.setList_CHART_COLOR0_R(TypeConverter.convert(CHART_COLOR0_R));
		struct.setCHART_COLOR0_G( ((CHART_COLOR0_G == null) ? (String)null : CHART_COLOR0_G[0]) );
		struct.setList_CHART_COLOR0_G(TypeConverter.convert(CHART_COLOR0_G));
		struct.setCHART_COLOR0_B( ((CHART_COLOR0_B == null) ? (String)null : CHART_COLOR0_B[0]) );
		struct.setList_CHART_COLOR0_B(TypeConverter.convert(CHART_COLOR0_B));
		struct.setCHART_COLOR1_R( ((CHART_COLOR1_R == null) ? (String)null : CHART_COLOR1_R[0]) );
		struct.setList_CHART_COLOR1_R(TypeConverter.convert(CHART_COLOR1_R));
		struct.setCHART_COLOR1_G( ((CHART_COLOR1_G == null) ? (String)null : CHART_COLOR1_G[0]) );
		struct.setList_CHART_COLOR1_G(TypeConverter.convert(CHART_COLOR1_G));
		struct.setCHART_COLOR1_B( ((CHART_COLOR1_B == null) ? (String)null : CHART_COLOR1_B[0]) );
		struct.setList_CHART_COLOR1_B(TypeConverter.convert(CHART_COLOR1_B));
		struct.setCHART_COLOR2_R( ((CHART_COLOR2_R == null) ? (String)null : CHART_COLOR2_R[0]) );
		struct.setList_CHART_COLOR2_R(TypeConverter.convert(CHART_COLOR2_R));
		struct.setCHART_COLOR2_G( ((CHART_COLOR2_G == null) ? (String)null : CHART_COLOR2_G[0]) );
		struct.setList_CHART_COLOR2_G(TypeConverter.convert(CHART_COLOR2_G));
		struct.setCHART_COLOR2_B( ((CHART_COLOR2_B == null) ? (String)null : CHART_COLOR2_B[0]) );
		struct.setList_CHART_COLOR2_B(TypeConverter.convert(CHART_COLOR2_B));
		struct.setCHART_COLOR9_R( ((CHART_COLOR9_R == null) ? (String)null : CHART_COLOR9_R[0]) );
		struct.setList_CHART_COLOR9_R(TypeConverter.convert(CHART_COLOR9_R));
		struct.setCHART_COLOR9_G( ((CHART_COLOR9_G == null) ? (String)null : CHART_COLOR9_G[0]) );
		struct.setList_CHART_COLOR9_G(TypeConverter.convert(CHART_COLOR9_G));
		struct.setCHART_COLOR9_B( ((CHART_COLOR9_B == null) ? (String)null : CHART_COLOR9_B[0]) );
		struct.setList_CHART_COLOR9_B(TypeConverter.convert(CHART_COLOR9_B));
		struct.setHIGH_LOAD_COLOR_R( ((HIGH_LOAD_COLOR_R == null) ? (String)null : HIGH_LOAD_COLOR_R[0]) );
		struct.setList_HIGH_LOAD_COLOR_R(TypeConverter.convert(HIGH_LOAD_COLOR_R));
		struct.setHIGH_LOAD_COLOR_G( ((HIGH_LOAD_COLOR_G == null) ? (String)null : HIGH_LOAD_COLOR_G[0]) );
		struct.setList_HIGH_LOAD_COLOR_G(TypeConverter.convert(HIGH_LOAD_COLOR_G));
		struct.setHIGH_LOAD_COLOR_B( ((HIGH_LOAD_COLOR_B == null) ? (String)null : HIGH_LOAD_COLOR_B[0]) );
		struct.setList_HIGH_LOAD_COLOR_B(TypeConverter.convert(HIGH_LOAD_COLOR_B));
		struct.seth_MODIFY_COUNT( ((h_MODIFY_COUNT == null) ? (String)null : h_MODIFY_COUNT[0]) );
		struct.setList_h_MODIFY_COUNT(TypeConverter.convert(h_MODIFY_COUNT));
		struct.setLOW_LOAD_COLOR_R( ((LOW_LOAD_COLOR_R == null) ? (String)null : LOW_LOAD_COLOR_R[0]) );
		struct.setList_LOW_LOAD_COLOR_R(TypeConverter.convert(LOW_LOAD_COLOR_R));
		struct.setLOW_LOAD_COLOR_G( ((LOW_LOAD_COLOR_G == null) ? (String)null : LOW_LOAD_COLOR_G[0]) );
		struct.setList_LOW_LOAD_COLOR_G(TypeConverter.convert(LOW_LOAD_COLOR_G));
		struct.setLOW_LOAD_COLOR_B( ((LOW_LOAD_COLOR_B == null) ? (String)null : LOW_LOAD_COLOR_B[0]) );
		struct.setList_LOW_LOAD_COLOR_B(TypeConverter.convert(LOW_LOAD_COLOR_B));
		struct.setMIDDLE_LOAD_COLOR_R( ((MIDDLE_LOAD_COLOR_R == null) ? (String)null : MIDDLE_LOAD_COLOR_R[0]) );
		struct.setList_MIDDLE_LOAD_COLOR_R(TypeConverter.convert(MIDDLE_LOAD_COLOR_R));
		struct.setMIDDLE_LOAD_COLOR_G( ((MIDDLE_LOAD_COLOR_G == null) ? (String)null : MIDDLE_LOAD_COLOR_G[0]) );
		struct.setList_MIDDLE_LOAD_COLOR_G(TypeConverter.convert(MIDDLE_LOAD_COLOR_G));
		struct.setMIDDLE_LOAD_COLOR_B( ((MIDDLE_LOAD_COLOR_B == null) ? (String)null : MIDDLE_LOAD_COLOR_B[0]) );
		struct.setList_MIDDLE_LOAD_COLOR_B(TypeConverter.convert(MIDDLE_LOAD_COLOR_B));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AN0020010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAN0020010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAN0020010Struct";   // JSP先のバインド名(Struct)の指定
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
					AN0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AN0020010Control control;
		AN0020010Entity  entity = null;
		AN0020010Struct  struct = null;

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

			if( (control = (AN0020010Control)so.getAttribute("AN0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new AN0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AN0020010Control();
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
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AN0020010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
                                 // TODO: ユーザ定義のコードを記述してください
                                 ////! 渡されたパラメタをすべて出力するテスト用コード
                                 //System.out.println("---< start >--------------------");
                                 //Enumeration paramNames = request.getParameterNames();
                                 //while (paramNames.hasMoreElements()) {
                                 //	String paramName = (String)paramNames.nextElement();
                                 //	System.out.println(" paramName: " + paramName);
                                 //	String[] paramValues = request.getParameterValues(paramName);
                                 //	if (paramValues.length == 1) {
                                 //		String paramValue = paramValues[0];
                                 //		if (paramValue.length() == 0) {
                                 //			System.out.println("paramValue: null");
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
                                 //System.out.println("---< end >----------------------");
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
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
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
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;

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
		return "com.nec.jp.orteus.metamorBase.AN0020.AN0020010Servlet";
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
	public AN0020010Servlet()
	{
		//{{user_implement_dev:<AN0020010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_Select = true;
                bFLG_DISCONNECT_Update = true;
                bFLG_DISCONNECT_Clear = true;
                bFLG_DISCONNECT_Close = true;
              
                //}}user_implement_dev:<AN0020010_DisConnect_FLG>

		//{{user_implement_dev:<AN0020010Servlet>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AN0020010Servlet>
	}

	//////////////////////////////

}
