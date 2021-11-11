/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0020/src/com/nec/jp/orteus/metamorBase/DA0020/DA0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0020;

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

public class DA0020010Servlet extends HttpServlet
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
	 * @param control DA0020010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, DA0020010Control control)
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
	 * @param control DA0020010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, DA0020010Control control)
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
	 * @param control DA0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
			logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ユーザ定義のコードを記述してください
              //			objMessage.m_writer.write( Level.ALL, "DA0020010"+" $Revision: 1.3 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control DA0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","リロード処理"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control DA0020010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control DA0020010Controlクラスインスタンス
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("Insert");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control DA0020010Controlクラスインスタンス
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
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
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control DA0020010Controlクラスインスタンス
	 */
	public String onClickDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");
		//{{user_implement_dev:<onClickDelete>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("Delete");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickDelete>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");

		return nextUrl;
	}

	/**
	 * 削除取消ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control DA0020010Controlクラスインスタンス
	 */
	public String onClickCancelDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelDelete");
		//{{user_implement_dev:<onClickCancelDelete>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("CancelDelete");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickCancelDelete>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelDelete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control DA0020010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, DA0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] h_PLANT_CD = ((params.containsKey("h_PLANT_CD")) ? (String[])params.get("h_PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] YEAR = ((params.containsKey("YEAR")) ? (String[])params.get("YEAR") : (String[])null);
		String[] h_YEAR = ((params.containsKey("h_YEAR")) ? (String[])params.get("h_YEAR") : (String[])null);
		String[] HALF_TERM_TYP = ((params.containsKey("HALF_TERM_TYP")) ? (String[])params.get("HALF_TERM_TYP") : (String[])null);
		String[] HALF_TERM_TYP_name = ((params.containsKey("HALF_TERM_TYP_name")) ? (String[])params.get("HALF_TERM_TYP_name") : (String[])null);
		String[] HALF_TERM_TYP_val = ((params.containsKey("HALF_TERM_TYP_val")) ? (String[])params.get("HALF_TERM_TYP_val") : (String[])null);
		String[] h_HALF_TERM_TYP = ((params.containsKey("h_HALF_TERM_TYP")) ? (String[])params.get("h_HALF_TERM_TYP") : (String[])null);
		String[] COST_TYP = ((params.containsKey("COST_TYP")) ? (String[])params.get("COST_TYP") : (String[])null);
		String[] COST_TYP_name = ((params.containsKey("COST_TYP_name")) ? (String[])params.get("COST_TYP_name") : (String[])null);
		String[] COST_TYP_val = ((params.containsKey("COST_TYP_val")) ? (String[])params.get("COST_TYP_val") : (String[])null);
		String[] h_COST_TYP = ((params.containsKey("h_COST_TYP")) ? (String[])params.get("h_COST_TYP") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] h_ITEM_CD = ((params.containsKey("h_ITEM_CD")) ? (String[])params.get("h_ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] CS_PUCH_TYP = ((params.containsKey("CS_PUCH_TYP")) ? (String[])params.get("CS_PUCH_TYP") : (String[])null);
		String[] CS_PUCH_TYP_name = ((params.containsKey("CS_PUCH_TYP_name")) ? (String[])params.get("CS_PUCH_TYP_name") : (String[])null);
		String[] CS_PUCH_TYP_val = ((params.containsKey("CS_PUCH_TYP_val")) ? (String[])params.get("CS_PUCH_TYP_val") : (String[])null);
		String[] h_CS_PUCH_TYP = ((params.containsKey("h_CS_PUCH_TYP")) ? (String[])params.get("h_CS_PUCH_TYP") : (String[])null);
		String[] CS_PROC_CD = ((params.containsKey("CS_PROC_CD")) ? (String[])params.get("CS_PROC_CD") : (String[])null);
		String[] CS_PROC_NAME = ((params.containsKey("CS_PROC_NAME")) ? (String[])params.get("CS_PROC_NAME") : (String[])null);
		String[] UNIT_COST_ACCEPT_TYP = ((params.containsKey("UNIT_COST_ACCEPT_TYP")) ? (String[])params.get("UNIT_COST_ACCEPT_TYP") : (String[])null);
		String[] UNIT_COST_ACCEPT_TYP_name = ((params.containsKey("UNIT_COST_ACCEPT_TYP_name")) ? (String[])params.get("UNIT_COST_ACCEPT_TYP_name") : (String[])null);
		String[] UNIT_COST_ACCEPT_TYP_val = ((params.containsKey("UNIT_COST_ACCEPT_TYP_val")) ? (String[])params.get("UNIT_COST_ACCEPT_TYP_val") : (String[])null);
		String[] CLASIFICATION_CD = ((params.containsKey("CLASIFICATION_CD")) ? (String[])params.get("CLASIFICATION_CD") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] ORG_CD = ((params.containsKey("ORG_CD")) ? (String[])params.get("ORG_CD") : (String[])null);
		String[] ORG_NAME = ((params.containsKey("ORG_NAME")) ? (String[])params.get("ORG_NAME") : (String[])null);
		String[] ONEROUS_CONS_FLG = ((params.containsKey("ONEROUS_CONS_FLG")) ? (String[])params.get("ONEROUS_CONS_FLG") : (String[])null);
		String[] ONEROUS_CONS_FLG_name = ((params.containsKey("ONEROUS_CONS_FLG_name")) ? (String[])params.get("ONEROUS_CONS_FLG_name") : (String[])null);
		String[] ONEROUS_CONS_FLG_val = ((params.containsKey("ONEROUS_CONS_FLG_val")) ? (String[])params.get("ONEROUS_CONS_FLG_val") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] UNIT_COST = ((params.containsKey("UNIT_COST")) ? (String[])params.get("UNIT_COST") : (String[])null);
		String[] CUR_UNIT = ((params.containsKey("CUR_UNIT")) ? (String[])params.get("CUR_UNIT") : (String[])null);
		String[] UNIT_COST_TYP = ((params.containsKey("UNIT_COST_TYP")) ? (String[])params.get("UNIT_COST_TYP") : (String[])null);
		String[] UNIT_COST_TYP_name = ((params.containsKey("UNIT_COST_TYP_name")) ? (String[])params.get("UNIT_COST_TYP_name") : (String[])null);
		String[] UNIT_COST_TYP_val = ((params.containsKey("UNIT_COST_TYP_val")) ? (String[])params.get("UNIT_COST_TYP_val") : (String[])null);
		String[] PUCH_UNIT_QTY = ((params.containsKey("PUCH_UNIT_QTY")) ? (String[])params.get("PUCH_UNIT_QTY") : (String[])null);
		String[] CUR_CD = ((params.containsKey("CUR_CD")) ? (String[])params.get("CUR_CD") : (String[])null);
		String[] CUR_NAME = ((params.containsKey("CUR_NAME")) ? (String[])params.get("CUR_NAME") : (String[])null);
		String[] EXCH_RATE = ((params.containsKey("EXCH_RATE")) ? (String[])params.get("EXCH_RATE") : (String[])null);
		String[] SUB_VEND_CD = ((params.containsKey("SUB_VEND_CD")) ? (String[])params.get("SUB_VEND_CD") : (String[])null);
		String[] SUB_VEND_NAME = ((params.containsKey("SUB_VEND_NAME")) ? (String[])params.get("SUB_VEND_NAME") : (String[])null);
		String[] SUB_UNIT_COST = ((params.containsKey("SUB_UNIT_COST")) ? (String[])params.get("SUB_UNIT_COST") : (String[])null);
		String[] SUB_CUR_UNIT = ((params.containsKey("SUB_CUR_UNIT")) ? (String[])params.get("SUB_CUR_UNIT") : (String[])null);
		String[] SUB_UNIT_COST_TYP = ((params.containsKey("SUB_UNIT_COST_TYP")) ? (String[])params.get("SUB_UNIT_COST_TYP") : (String[])null);
		String[] SUB_UNIT_COST_TYP_name = ((params.containsKey("SUB_UNIT_COST_TYP_name")) ? (String[])params.get("SUB_UNIT_COST_TYP_name") : (String[])null);
		String[] SUB_UNIT_COST_TYP_val = ((params.containsKey("SUB_UNIT_COST_TYP_val")) ? (String[])params.get("SUB_UNIT_COST_TYP_val") : (String[])null);
		String[] SUB_PUCH_UNIT_QTY = ((params.containsKey("SUB_PUCH_UNIT_QTY")) ? (String[])params.get("SUB_PUCH_UNIT_QTY") : (String[])null);
		String[] SUB_CUR_CD = ((params.containsKey("SUB_CUR_CD")) ? (String[])params.get("SUB_CUR_CD") : (String[])null);
		String[] SUB_CUR_NAME = ((params.containsKey("SUB_CUR_NAME")) ? (String[])params.get("SUB_CUR_NAME") : (String[])null);
		String[] SUB_EXCH_RATE = ((params.containsKey("SUB_EXCH_RATE")) ? (String[])params.get("SUB_EXCH_RATE") : (String[])null);
		String[] DEL_FLG = ((params.containsKey("DEL_FLG")) ? (String[])params.get("DEL_FLG") : (String[])null);
		String[] c_NoCheckClasificationCd = ((params.containsKey("c_NoCheckClasificationCd")) ? (String[])params.get("c_NoCheckClasificationCd") : (String[])null);
		String[] c_NoCheckStockUnit = ((params.containsKey("c_NoCheckStockUnit")) ? (String[])params.get("c_NoCheckStockUnit") : (String[])null);

		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.seth_PLANT_CD( ((h_PLANT_CD == null) ? (String)null : h_PLANT_CD[0]) );
		struct.setList_h_PLANT_CD(TypeConverter.convert(h_PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setYEAR( ((YEAR == null) ? (String)null : YEAR[0]) );
		struct.setList_YEAR(TypeConverter.convert(YEAR));
		struct.seth_YEAR( ((h_YEAR == null) ? (String)null : h_YEAR[0]) );
		struct.setList_h_YEAR(TypeConverter.convert(h_YEAR));
		struct.setHALF_TERM_TYP( ((HALF_TERM_TYP == null) ? (String)null : HALF_TERM_TYP[0]) );
		struct.setList_HALF_TERM_TYP(TypeConverter.convert(HALF_TERM_TYP));
		struct.setHALF_TERM_TYP_name( ((HALF_TERM_TYP_name == null) ? (String)null : HALF_TERM_TYP_name[0]) );
		struct.setList_HALF_TERM_TYP_name(TypeConverter.convert(HALF_TERM_TYP_name));
		struct.setHALF_TERM_TYP_val( ((HALF_TERM_TYP_val == null) ? (String)null : HALF_TERM_TYP_val[0]) );
		struct.setList_HALF_TERM_TYP_val(TypeConverter.convert(HALF_TERM_TYP_val));
		struct.seth_HALF_TERM_TYP( ((h_HALF_TERM_TYP == null) ? (String)null : h_HALF_TERM_TYP[0]) );
		struct.setList_h_HALF_TERM_TYP(TypeConverter.convert(h_HALF_TERM_TYP));
		struct.setCOST_TYP( ((COST_TYP == null) ? (String)null : COST_TYP[0]) );
		struct.setList_COST_TYP(TypeConverter.convert(COST_TYP));
		struct.setCOST_TYP_name( ((COST_TYP_name == null) ? (String)null : COST_TYP_name[0]) );
		struct.setList_COST_TYP_name(TypeConverter.convert(COST_TYP_name));
		struct.setCOST_TYP_val( ((COST_TYP_val == null) ? (String)null : COST_TYP_val[0]) );
		struct.setList_COST_TYP_val(TypeConverter.convert(COST_TYP_val));
		struct.seth_COST_TYP( ((h_COST_TYP == null) ? (String)null : h_COST_TYP[0]) );
		struct.setList_h_COST_TYP(TypeConverter.convert(h_COST_TYP));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.seth_ITEM_CD( ((h_ITEM_CD == null) ? (String)null : h_ITEM_CD[0]) );
		struct.setList_h_ITEM_CD(TypeConverter.convert(h_ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setCS_PUCH_TYP( ((CS_PUCH_TYP == null) ? (String)null : CS_PUCH_TYP[0]) );
		struct.setList_CS_PUCH_TYP(TypeConverter.convert(CS_PUCH_TYP));
		struct.setCS_PUCH_TYP_name( ((CS_PUCH_TYP_name == null) ? (String)null : CS_PUCH_TYP_name[0]) );
		struct.setList_CS_PUCH_TYP_name(TypeConverter.convert(CS_PUCH_TYP_name));
		struct.setCS_PUCH_TYP_val( ((CS_PUCH_TYP_val == null) ? (String)null : CS_PUCH_TYP_val[0]) );
		struct.setList_CS_PUCH_TYP_val(TypeConverter.convert(CS_PUCH_TYP_val));
		struct.seth_CS_PUCH_TYP( ((h_CS_PUCH_TYP == null) ? (String)null : h_CS_PUCH_TYP[0]) );
		struct.setList_h_CS_PUCH_TYP(TypeConverter.convert(h_CS_PUCH_TYP));
		struct.setCS_PROC_CD( ((CS_PROC_CD == null) ? (String)null : CS_PROC_CD[0]) );
		struct.setList_CS_PROC_CD(TypeConverter.convert(CS_PROC_CD));
		struct.setCS_PROC_NAME( ((CS_PROC_NAME == null) ? (String)null : CS_PROC_NAME[0]) );
		struct.setList_CS_PROC_NAME(TypeConverter.convert(CS_PROC_NAME));
		struct.setUNIT_COST_ACCEPT_TYP( ((UNIT_COST_ACCEPT_TYP == null) ? (String)null : UNIT_COST_ACCEPT_TYP[0]) );
		struct.setList_UNIT_COST_ACCEPT_TYP(TypeConverter.convert(UNIT_COST_ACCEPT_TYP));
		struct.setUNIT_COST_ACCEPT_TYP_name( ((UNIT_COST_ACCEPT_TYP_name == null) ? (String)null : UNIT_COST_ACCEPT_TYP_name[0]) );
		struct.setList_UNIT_COST_ACCEPT_TYP_name(TypeConverter.convert(UNIT_COST_ACCEPT_TYP_name));
		struct.setUNIT_COST_ACCEPT_TYP_val( ((UNIT_COST_ACCEPT_TYP_val == null) ? (String)null : UNIT_COST_ACCEPT_TYP_val[0]) );
		struct.setList_UNIT_COST_ACCEPT_TYP_val(TypeConverter.convert(UNIT_COST_ACCEPT_TYP_val));
		struct.setCLASIFICATION_CD( ((CLASIFICATION_CD == null) ? (String)null : CLASIFICATION_CD[0]) );
		struct.setList_CLASIFICATION_CD(TypeConverter.convert(CLASIFICATION_CD));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setORG_CD( ((ORG_CD == null) ? (String)null : ORG_CD[0]) );
		struct.setList_ORG_CD(TypeConverter.convert(ORG_CD));
		struct.setORG_NAME( ((ORG_NAME == null) ? (String)null : ORG_NAME[0]) );
		struct.setList_ORG_NAME(TypeConverter.convert(ORG_NAME));
		struct.setONEROUS_CONS_FLG( ((ONEROUS_CONS_FLG == null) ? (String)null : ONEROUS_CONS_FLG[0]) );
		struct.setList_ONEROUS_CONS_FLG(TypeConverter.convert(ONEROUS_CONS_FLG));
		struct.setONEROUS_CONS_FLG_name( ((ONEROUS_CONS_FLG_name == null) ? (String)null : ONEROUS_CONS_FLG_name[0]) );
		struct.setList_ONEROUS_CONS_FLG_name(TypeConverter.convert(ONEROUS_CONS_FLG_name));
		struct.setONEROUS_CONS_FLG_val( ((ONEROUS_CONS_FLG_val == null) ? (String)null : ONEROUS_CONS_FLG_val[0]) );
		struct.setList_ONEROUS_CONS_FLG_val(TypeConverter.convert(ONEROUS_CONS_FLG_val));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.setUNIT_COST( ((UNIT_COST == null) ? (String)null : UNIT_COST[0]) );
		struct.setList_UNIT_COST(TypeConverter.convert(UNIT_COST));
		struct.setCUR_UNIT( ((CUR_UNIT == null) ? (String)null : CUR_UNIT[0]) );
		struct.setList_CUR_UNIT(TypeConverter.convert(CUR_UNIT));
		struct.setUNIT_COST_TYP( ((UNIT_COST_TYP == null) ? (String)null : UNIT_COST_TYP[0]) );
		struct.setList_UNIT_COST_TYP(TypeConverter.convert(UNIT_COST_TYP));
		struct.setUNIT_COST_TYP_name( ((UNIT_COST_TYP_name == null) ? (String)null : UNIT_COST_TYP_name[0]) );
		struct.setList_UNIT_COST_TYP_name(TypeConverter.convert(UNIT_COST_TYP_name));
		struct.setUNIT_COST_TYP_val( ((UNIT_COST_TYP_val == null) ? (String)null : UNIT_COST_TYP_val[0]) );
		struct.setList_UNIT_COST_TYP_val(TypeConverter.convert(UNIT_COST_TYP_val));
		struct.setPUCH_UNIT_QTY( ((PUCH_UNIT_QTY == null) ? (String)null : PUCH_UNIT_QTY[0]) );
		struct.setList_PUCH_UNIT_QTY(TypeConverter.convert(PUCH_UNIT_QTY));
		struct.setCUR_CD( ((CUR_CD == null) ? (String)null : CUR_CD[0]) );
		struct.setList_CUR_CD(TypeConverter.convert(CUR_CD));
		struct.setCUR_NAME( ((CUR_NAME == null) ? (String)null : CUR_NAME[0]) );
		struct.setList_CUR_NAME(TypeConverter.convert(CUR_NAME));
		struct.setEXCH_RATE( ((EXCH_RATE == null) ? (String)null : EXCH_RATE[0]) );
		struct.setList_EXCH_RATE(TypeConverter.convert(EXCH_RATE));
		struct.setSUB_VEND_CD( ((SUB_VEND_CD == null) ? (String)null : SUB_VEND_CD[0]) );
		struct.setList_SUB_VEND_CD(TypeConverter.convert(SUB_VEND_CD));
		struct.setSUB_VEND_NAME( ((SUB_VEND_NAME == null) ? (String)null : SUB_VEND_NAME[0]) );
		struct.setList_SUB_VEND_NAME(TypeConverter.convert(SUB_VEND_NAME));
		struct.setSUB_UNIT_COST( ((SUB_UNIT_COST == null) ? (String)null : SUB_UNIT_COST[0]) );
		struct.setList_SUB_UNIT_COST(TypeConverter.convert(SUB_UNIT_COST));
		struct.setSUB_CUR_UNIT( ((SUB_CUR_UNIT == null) ? (String)null : SUB_CUR_UNIT[0]) );
		struct.setList_SUB_CUR_UNIT(TypeConverter.convert(SUB_CUR_UNIT));
		struct.setSUB_UNIT_COST_TYP( ((SUB_UNIT_COST_TYP == null) ? (String)null : SUB_UNIT_COST_TYP[0]) );
		struct.setList_SUB_UNIT_COST_TYP(TypeConverter.convert(SUB_UNIT_COST_TYP));
		struct.setSUB_UNIT_COST_TYP_name( ((SUB_UNIT_COST_TYP_name == null) ? (String)null : SUB_UNIT_COST_TYP_name[0]) );
		struct.setList_SUB_UNIT_COST_TYP_name(TypeConverter.convert(SUB_UNIT_COST_TYP_name));
		struct.setSUB_UNIT_COST_TYP_val( ((SUB_UNIT_COST_TYP_val == null) ? (String)null : SUB_UNIT_COST_TYP_val[0]) );
		struct.setList_SUB_UNIT_COST_TYP_val(TypeConverter.convert(SUB_UNIT_COST_TYP_val));
		struct.setSUB_PUCH_UNIT_QTY( ((SUB_PUCH_UNIT_QTY == null) ? (String)null : SUB_PUCH_UNIT_QTY[0]) );
		struct.setList_SUB_PUCH_UNIT_QTY(TypeConverter.convert(SUB_PUCH_UNIT_QTY));
		struct.setSUB_CUR_CD( ((SUB_CUR_CD == null) ? (String)null : SUB_CUR_CD[0]) );
		struct.setList_SUB_CUR_CD(TypeConverter.convert(SUB_CUR_CD));
		struct.setSUB_CUR_NAME( ((SUB_CUR_NAME == null) ? (String)null : SUB_CUR_NAME[0]) );
		struct.setList_SUB_CUR_NAME(TypeConverter.convert(SUB_CUR_NAME));
		struct.setSUB_EXCH_RATE( ((SUB_EXCH_RATE == null) ? (String)null : SUB_EXCH_RATE[0]) );
		struct.setList_SUB_EXCH_RATE(TypeConverter.convert(SUB_EXCH_RATE));
		struct.setDEL_FLG( ((DEL_FLG == null) ? (String)null : DEL_FLG[0]) );
		struct.setList_DEL_FLG(TypeConverter.convert(DEL_FLG));
		struct.setc_NoCheckClasificationCd( ((c_NoCheckClasificationCd == null) ? (String)null : c_NoCheckClasificationCd[0]) );
		struct.setList_c_NoCheckClasificationCd(TypeConverter.convert(c_NoCheckClasificationCd));
		struct.setc_NoCheckStockUnit( ((c_NoCheckStockUnit == null) ? (String)null : c_NoCheckStockUnit[0]) );
		struct.setList_c_NoCheckStockUnit(TypeConverter.convert(c_NoCheckStockUnit));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/DA0020010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aDA0020010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aDA0020010Struct";   // JSP先のバインド名(Struct)の指定
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
					DA0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		DA0020010Control control;
		DA0020010Entity  entity = null;
		DA0020010Struct  struct = null;

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

			if( (control = (DA0020010Control)so.getAttribute("DA0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new DA0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new DA0020010Control();
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
				} else if( isClick(request, "Insert") ) {
					if ( !isCryptical(request, so, params, "Insert") ) return ERROR_TARGET;
					target = onClickInsert(request, response, so, params, control);
					control.setButton("Insert");
				} else if( isClick(request, "Update") ) {
					if ( !isCryptical(request, so, params, "Update") ) return ERROR_TARGET;
					target = onClickUpdate(request, response, so, params, control);
					control.setButton("Update");
				} else if( isClick(request, "Delete") ) {
					if ( !isCryptical(request, so, params, "Delete") ) return ERROR_TARGET;
					target = onClickDelete(request, response, so, params, control);
					control.setButton("Delete");
				} else if( isClick(request, "CancelDelete") ) {
					if ( !isCryptical(request, so, params, "CancelDelete") ) return ERROR_TARGET;
					target = onClickCancelDelete(request, response, so, params, control);
					control.setButton("CancelDelete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("DA0020010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Delete") && bFLG_DISCONNECT_Delete)
				|| (isClick(request, "CancelDelete") && bFLG_DISCONNECT_CancelDelete)
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
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Delete = true;
	private  static boolean bFLG_DISCONNECT_CancelDelete = true;
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
		return "com.nec.jp.orteus.metamorBase.DA0020.DA0020010Servlet";
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
	public DA0020010Servlet()
	{
		//{{user_implement_dev:<DA0020010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_Select = true;
                bFLG_DISCONNECT_Insert = true;
                bFLG_DISCONNECT_Update = true;
                bFLG_DISCONNECT_Delete = true;
                bFLG_DISCONNECT_CancelDelete = true;
                bFLG_DISCONNECT_Clear = true;
              
                //}}user_implement_dev:<DA0020010_DisConnect_FLG>

		//{{user_implement_dev:<DA0020010Servlet>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<DA0020010Servlet>
	}

	//////////////////////////////

}
