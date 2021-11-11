/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0180;

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

public class AA0180010Servlet extends HttpServlet
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
	 * @param control AA0180010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AA0180010Control control)
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
	 * @param control AA0180010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AA0180010Control control)
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
	 * @param control AA0180010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
			logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ユーザ定義のコードを記述してください
              //			objMessage.m_writer.write( Level.ALL, "AA0180010"+" $Revision: 1.6 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0180010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                try {
                 // TODO: ユーザ定義のコードを記述してください
              
                 if (control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                 }
              
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180010-E999","リロード処理"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("Select");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * FlashTree初期化ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickFlashTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");
		//{{user_implement_dev:<onClickFlashTree>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("FlashTree");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickFlashTree>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");

		return nextUrl;
	}

	/**
	 * 構成追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickLineInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0180011.jsp";		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");
		//{{user_implement_dev:<onClickLineInsert>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("LineInsert");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickLineInsert>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");

		return nextUrl;
	}

	/**
	 * 構成修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickLineUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0180011.jsp";		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");
		//{{user_implement_dev:<onClickLineUpdate>
              
                try {
                 control.control_eventHandller("LineUpdate");
              
                 if (control.getMsgStruct().sizeError() > 0) {
                  // データ変更（削除）されていた場合
                  nextUrl = null;
                 }
              
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
              
                //}}user_implement_dev:<onClickLineUpdate>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("Clear");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("Close");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * 一括削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickDeleteAll(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickDeleteAll");
		//{{user_implement_dev:<onClickDeleteAll>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("DeleteAll");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickDeleteAll>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickDeleteAll");

		return nextUrl;
	}

	/**
	 * この品目で正展開ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickShowS_Tree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowS_Tree");
		//{{user_implement_dev:<onClickShowS_Tree>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("ShowS_Tree");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickShowS_Tree>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowS_Tree");

		return nextUrl;
	}

	/**
	 * この品目で逆展開ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickShowR_Tree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowR_Tree");
		//{{user_implement_dev:<onClickShowR_Tree>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("ShowR_Tree");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickShowR_Tree>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowR_Tree");

		return nextUrl;
	}

	/**
	 * ツリー追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickAddTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0180010Control.jsp";		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");
		//{{user_implement_dev:<onClickAddTree>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("AddTree");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickAddTree>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");

		return nextUrl;
	}

	/**
	 * 詳細情報ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickShowDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0180010Detail.jsp";		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");
		//{{user_implement_dev:<onClickShowDetail>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("ShowDetail");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickShowDetail>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub1Insert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Insert");
		//{{user_implement_dev:<onClickSub1Insert>
              
                try {
                 control.control_eventHandller("Sub1Insert");
              
                 if (control.getMsgStruct().sizeError() > 0) {
                  // なんらかの異常ある場合（メイン画面に戻る準備ができていない）
                  nextUrl = "/AA0180011.jsp";
                 }
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
              
                //}}user_implement_dev:<onClickSub1Insert>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Insert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub1Update(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Update");
		//{{user_implement_dev:<onClickSub1Update>
              
                try {
                 control.control_eventHandller("Sub1Update");
              
                 if (control.getMsgStruct().sizeError() > 0) {
                  // なんらかの異常ある場合（メイン画面に戻る準備ができていない）
                  nextUrl = "/AA0180011.jsp";
                 }
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
              
                //}}user_implement_dev:<onClickSub1Update>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Update");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub1Return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Return");
		//{{user_implement_dev:<onClickSub1Return>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 control.control_eventHandller("Sub1Return");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickSub1Return>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Return");

		return nextUrl;
	}

	/**
	 * 詳細情報ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickShowDetail2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0180010Detail.jsp";		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail2");
		//{{user_implement_dev:<onClickShowDetail2>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ShowDetail2");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickShowDetail2>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail2");

		return nextUrl;
	}

	/**
	 * 系列追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickLineInsertProc(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0180012.jsp";		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsertProc");
		//{{user_implement_dev:<onClickLineInsertProc>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LineInsertProc");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			throw ee;
		}
                //}}user_implement_dev:<onClickLineInsertProc>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsertProc");

		return nextUrl;
	}

	/**
	 * 系列修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickLineUpdateProc(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0180012.jsp";		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdateProc");
		//{{user_implement_dev:<onClickLineUpdateProc>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LineUpdateProc");
                 if (control.getMsgStruct().sizeError() > 0) {
                  // データ変更（削除）されていた場合
                  nextUrl = null;
                 }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			throw ee;
		}
                //}}user_implement_dev:<onClickLineUpdateProc>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdateProc");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub2insert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2insert");
		//{{user_implement_dev:<onClickSub2insert>
			// TODO: ユーザ定義のコードを記述してください
		try {
              
                 // 工場コード取得
                 struct.setPLANT_CD((String)so.getAttribute("PlantCd"));
              
			control.control_eventHandller("Sub2insert");
              
                 // エラー発生の場合、子画面に遷移
                 if(control.getMessage().sizeError() > 0)
                  nextUrl = "/AA0180012.jsp";
              
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickSub2insert>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2insert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub2update(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2update");
		//{{user_implement_dev:<onClickSub2update>
			// TODO: ユーザ定義のコードを記述してください
		try {
              
            // 工場コード取得
            struct.setPLANT_CD((String)so.getAttribute("PlantCd"));
              
			control.control_eventHandller("Sub2update");
            // エラー発生の場合、子画面に遷移
			
            if(control.getMessage().sizeError() > 0)
                nextUrl = "/AA0180012.jsp";
			
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
            ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickSub2update>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2update");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub2Return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2Return");
		//{{user_implement_dev:<onClickSub2Return>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Sub2Return");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickSub2Return>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2Return");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub1Delete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Delete");
		//{{user_implement_dev:<onClickSub1Delete>
			// TODO: ユーザ定義のコードを記述してください
              
		try {
			control.control_eventHandller("Sub1Delete");
		      
	         if (control.getMsgStruct().sizeError() > 0) {
	          // なんらかの異常ある場合（メイン画面に戻る準備ができていない）
	          nextUrl = "/AA0180011.jsp";
	         }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			throw ee;
		}
                //}}user_implement_dev:<onClickSub1Delete>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub1Delete");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0180010Controlクラスインスタンス
	 */
	public String onClickSub2delete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0180010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2delete");
		//{{user_implement_dev:<onClickSub2delete>
			// TODO: ユーザ定義のコードを記述してください
		
		try {
            
            // 工場コード取得
            struct.setPLANT_CD((String)so.getAttribute("PlantCd"));
              
			control.control_eventHandller("Sub2delete");
            // エラー発生の場合、子画面に遷移
			
            if(control.getMessage().sizeError() > 0)
                nextUrl = "/AA0180012.jsp";
			
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
            ee.add(emsg);
			throw ee;
		}
                //}}user_implement_dev:<onClickSub2delete>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"onClickSub2delete");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0180010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] Det_PS_EDITION = ((params.containsKey("Det_PS_EDITION")) ? (String[])params.get("Det_PS_EDITION") : (String[])null);
		String[] Det_STOCK_UNIT = ((params.containsKey("Det_STOCK_UNIT")) ? (String[])params.get("Det_STOCK_UNIT") : (String[])null);
		String[] Det_EFF_PHASE_IN_DATE = ((params.containsKey("Det_EFF_PHASE_IN_DATE")) ? (String[])params.get("Det_EFF_PHASE_IN_DATE") : (String[])null);
		String[] Det_EFF_PHASE_OUT_DATE = ((params.containsKey("Det_EFF_PHASE_OUT_DATE")) ? (String[])params.get("Det_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] Det_PS_SPOIL = ((params.containsKey("Det_PS_SPOIL")) ? (String[])params.get("Det_PS_SPOIL") : (String[])null);
		String[] Det_CONS_TYP = ((params.containsKey("Det_CONS_TYP")) ? (String[])params.get("Det_CONS_TYP") : (String[])null);
		String[] Det_PS_LT_FLG = ((params.containsKey("Det_PS_LT_FLG")) ? (String[])params.get("Det_PS_LT_FLG") : (String[])null);
		String[] Det_PS_PROP_LT = ((params.containsKey("Det_PS_PROP_LT")) ? (String[])params.get("Det_PS_PROP_LT") : (String[])null);
		String[] Det_PS_PROP_LOT_SIZE = ((params.containsKey("Det_PS_PROP_LOT_SIZE")) ? (String[])params.get("Det_PS_PROP_LOT_SIZE") : (String[])null);
		String[] Det_PS_REF_NO = ((params.containsKey("Det_PS_REF_NO")) ? (String[])params.get("Det_PS_REF_NO") : (String[])null);
		String[] Det_COST_UP_TYP = ((params.containsKey("Det_COST_UP_TYP")) ? (String[])params.get("Det_COST_UP_TYP") : (String[])null);
		String[] Det_MRP_EXP_TYP = ((params.containsKey("Det_MRP_EXP_TYP")) ? (String[])params.get("Det_MRP_EXP_TYP") : (String[])null);
		String[] Target_ITEM_CD = ((params.containsKey("Target_ITEM_CD")) ? (String[])params.get("Target_ITEM_CD") : (String[])null);
		String[] DEVELOP_TYP = ((params.containsKey("DEVELOP_TYP")) ? (String[])params.get("DEVELOP_TYP") : (String[])null);
		String[] InitLevel = ((params.containsKey("InitLevel")) ? (String[])params.get("InitLevel") : (String[])null);
		String[] id = ((params.containsKey("id")) ? (String[])params.get("id") : (String[])null);
		String[] lvl = ((params.containsKey("lvl")) ? (String[])params.get("lvl") : (String[])null);
		String[] parent = ((params.containsKey("parent")) ? (String[])params.get("parent") : (String[])null);
		String[] label = ((params.containsKey("label")) ? (String[])params.get("label") : (String[])null);
		String[] ctx = ((params.containsKey("ctx")) ? (String[])params.get("ctx") : (String[])null);
		String[] maxid = ((params.containsKey("maxid")) ? (String[])params.get("maxid") : (String[])null);
		String[] Upper_ITEM_CD = ((params.containsKey("Upper_ITEM_CD")) ? (String[])params.get("Upper_ITEM_CD") : (String[])null);
		String[] Upper_ITEM_NAME = ((params.containsKey("Upper_ITEM_NAME")) ? (String[])params.get("Upper_ITEM_NAME") : (String[])null);
		String[] Lower_ITEM_CD = ((params.containsKey("Lower_ITEM_CD")) ? (String[])params.get("Lower_ITEM_CD") : (String[])null);
		String[] Lower_ITEM_NAME = ((params.containsKey("Lower_ITEM_NAME")) ? (String[])params.get("Lower_ITEM_NAME") : (String[])null);
		String[] PS_EDITION = ((params.containsKey("PS_EDITION")) ? (String[])params.get("PS_EDITION") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] DetParent_ITEM_NAME = ((params.containsKey("DetParent_ITEM_NAME")) ? (String[])params.get("DetParent_ITEM_NAME") : (String[])null);
		String[] DetParent_OUTSIDE_TYP = ((params.containsKey("DetParent_OUTSIDE_TYP")) ? (String[])params.get("DetParent_OUTSIDE_TYP") : (String[])null);
		String[] DetComp_ITEM_NAME = ((params.containsKey("DetComp_ITEM_NAME")) ? (String[])params.get("DetComp_ITEM_NAME") : (String[])null);
		String[] DetComp_OUTSIDE_TYP = ((params.containsKey("DetComp_OUTSIDE_TYP")) ? (String[])params.get("DetComp_OUTSIDE_TYP") : (String[])null);
		String[] TargetDate = ((params.containsKey("TargetDate")) ? (String[])params.get("TargetDate") : (String[])null);
		String[] EFF_PHASE_IN_DATE = ((params.containsKey("EFF_PHASE_IN_DATE")) ? (String[])params.get("EFF_PHASE_IN_DATE") : (String[])null);
		String[] EFF_PHASE_OUT_DATE = ((params.containsKey("EFF_PHASE_OUT_DATE")) ? (String[])params.get("EFF_PHASE_OUT_DATE") : (String[])null);
		String[] DetParent_MRP_ODR_TYP = ((params.containsKey("DetParent_MRP_ODR_TYP")) ? (String[])params.get("DetParent_MRP_ODR_TYP") : (String[])null);
		String[] DetComp_MRP_ODR_TYP = ((params.containsKey("DetComp_MRP_ODR_TYP")) ? (String[])params.get("DetComp_MRP_ODR_TYP") : (String[])null);
		String[] Det_PS_FIXED_LT = ((params.containsKey("Det_PS_FIXED_LT")) ? (String[])params.get("Det_PS_FIXED_LT") : (String[])null);
		String[] DetParent_ITEM_CD = ((params.containsKey("DetParent_ITEM_CD")) ? (String[])params.get("DetParent_ITEM_CD") : (String[])null);
		String[] DetComp_ITEM_CD = ((params.containsKey("DetComp_ITEM_CD")) ? (String[])params.get("DetComp_ITEM_CD") : (String[])null);
		String[] h_Target_ITEM_CD = ((params.containsKey("h_Target_ITEM_CD")) ? (String[])params.get("h_Target_ITEM_CD") : (String[])null);
		String[] h_TargetDate = ((params.containsKey("h_TargetDate")) ? (String[])params.get("h_TargetDate") : (String[])null);
		String[] h_DEVELOP_TYP = ((params.containsKey("h_DEVELOP_TYP")) ? (String[])params.get("h_DEVELOP_TYP") : (String[])null);
		String[] h_InitLevel = ((params.containsKey("h_InitLevel")) ? (String[])params.get("h_InitLevel") : (String[])null);
		String[] DEVELOP_TYP_name = ((params.containsKey("DEVELOP_TYP_name")) ? (String[])params.get("DEVELOP_TYP_name") : (String[])null);
		String[] DEVELOP_TYP_val = ((params.containsKey("DEVELOP_TYP_val")) ? (String[])params.get("DEVELOP_TYP_val") : (String[])null);
		String[] Det_PS_UNIT_QTY = ((params.containsKey("Det_PS_UNIT_QTY")) ? (String[])params.get("Det_PS_UNIT_QTY") : (String[])null);
		String[] h_ProcTyp = ((params.containsKey("h_ProcTyp")) ? (String[])params.get("h_ProcTyp") : (String[])null);
		String[] h_MaxLevel = ((params.containsKey("h_MaxLevel")) ? (String[])params.get("h_MaxLevel") : (String[])null);
		String[] PROC_CD = ((params.containsKey("PROC_CD")) ? (String[])params.get("PROC_CD") : (String[])null);
		String[] MODIFY_CNT_ISSUE = ((params.containsKey("MODIFY_CNT_ISSUE")) ? (String[])params.get("MODIFY_CNT_ISSUE") : (String[])null);
		String[] MODIFY_CNT_PROC = ((params.containsKey("MODIFY_CNT_PROC")) ? (String[])params.get("MODIFY_CNT_PROC") : (String[])null);
		String[] DET_TYP = ((params.containsKey("DET_TYP")) ? (String[])params.get("DET_TYP") : (String[])null);
		String[] Det2ITEM_CD = ((params.containsKey("Det2ITEM_CD")) ? (String[])params.get("Det2ITEM_CD") : (String[])null);
		String[] Det2ITEM_NAME = ((params.containsKey("Det2ITEM_NAME")) ? (String[])params.get("Det2ITEM_NAME") : (String[])null);
		String[] Det2PROC_CD = ((params.containsKey("Det2PROC_CD")) ? (String[])params.get("Det2PROC_CD") : (String[])null);
		String[] Det2PROC_NO = ((params.containsKey("Det2PROC_NO")) ? (String[])params.get("Det2PROC_NO") : (String[])null);
		String[] Det2PROC_NAME = ((params.containsKey("Det2PROC_NAME")) ? (String[])params.get("Det2PROC_NAME") : (String[])null);
		String[] Det2WS_CD = ((params.containsKey("Det2WS_CD")) ? (String[])params.get("Det2WS_CD") : (String[])null);
		String[] Det2WS_NAME = ((params.containsKey("Det2WS_NAME")) ? (String[])params.get("Det2WS_NAME") : (String[])null);
		String[] Det2COMPANY_CD = ((params.containsKey("Det2COMPANY_CD")) ? (String[])params.get("Det2COMPANY_CD") : (String[])null);
		String[] Det2VEND_CD = ((params.containsKey("Det2VEND_CD")) ? (String[])params.get("Det2VEND_CD") : (String[])null);
		String[] Det2VEND_NAME = ((params.containsKey("Det2VEND_NAME")) ? (String[])params.get("Det2VEND_NAME") : (String[])null);
		String[] Det2FIXED_LT = ((params.containsKey("Det2FIXED_LT")) ? (String[])params.get("Det2FIXED_LT") : (String[])null);
		String[] Det2PROP_LT = ((params.containsKey("Det2PROP_LT")) ? (String[])params.get("Det2PROP_LT") : (String[])null);
		String[] Det2SAFETY_LT = ((params.containsKey("Det2SAFETY_LT")) ? (String[])params.get("Det2SAFETY_LT") : (String[])null);
		String[] Det2PROP_LOT_SIZE = ((params.containsKey("Det2PROP_LOT_SIZE")) ? (String[])params.get("Det2PROP_LOT_SIZE") : (String[])null);
		String[] Det2SPOIL = ((params.containsKey("Det2SPOIL")) ? (String[])params.get("Det2SPOIL") : (String[])null);
		String[] Det2OUTSIDE_TYP = ((params.containsKey("Det2OUTSIDE_TYP")) ? (String[])params.get("Det2OUTSIDE_TYP") : (String[])null);
		String[] Det2STANDARD_COST = ((params.containsKey("Det2STANDARD_COST")) ? (String[])params.get("Det2STANDARD_COST") : (String[])null);
		String[] Sub2_ITEM_CD = ((params.containsKey("Sub2_ITEM_CD")) ? (String[])params.get("Sub2_ITEM_CD") : (String[])null);
		String[] Sub2_ITEM_NAME = ((params.containsKey("Sub2_ITEM_NAME")) ? (String[])params.get("Sub2_ITEM_NAME") : (String[])null);
		String[] Sub2_PROC_CD = ((params.containsKey("Sub2_PROC_CD")) ? (String[])params.get("Sub2_PROC_CD") : (String[])null);
		String[] Sub2_PROC_NAME = ((params.containsKey("Sub2_PROC_NAME")) ? (String[])params.get("Sub2_PROC_NAME") : (String[])null);
		String[] Sub2_PROC_NO = ((params.containsKey("Sub2_PROC_NO")) ? (String[])params.get("Sub2_PROC_NO") : (String[])null);
		String[] Sub2_SPOIL = ((params.containsKey("Sub2_SPOIL")) ? (String[])params.get("Sub2_SPOIL") : (String[])null);
		String[] Sub2_FIXED_LT = ((params.containsKey("Sub2_FIXED_LT")) ? (String[])params.get("Sub2_FIXED_LT") : (String[])null);
		String[] Sub2_PROP_LT = ((params.containsKey("Sub2_PROP_LT")) ? (String[])params.get("Sub2_PROP_LT") : (String[])null);
		String[] Sub2_PROP_LOT_SIZE = ((params.containsKey("Sub2_PROP_LOT_SIZE")) ? (String[])params.get("Sub2_PROP_LOT_SIZE") : (String[])null);
		String[] Sub2_STOCK_UNIT = ((params.containsKey("Sub2_STOCK_UNIT")) ? (String[])params.get("Sub2_STOCK_UNIT") : (String[])null);
		String[] Sub2_SAFETY_LT = ((params.containsKey("Sub2_SAFETY_LT")) ? (String[])params.get("Sub2_SAFETY_LT") : (String[])null);
		String[] Sub2_OUTSIDE_TYP = ((params.containsKey("Sub2_OUTSIDE_TYP")) ? (String[])params.get("Sub2_OUTSIDE_TYP") : (String[])null);
		String[] Sub2_OUTSIDE_TYP_name = ((params.containsKey("Sub2_OUTSIDE_TYP_name")) ? (String[])params.get("Sub2_OUTSIDE_TYP_name") : (String[])null);
		String[] Sub2_OUTSIDE_TYP_val = ((params.containsKey("Sub2_OUTSIDE_TYP_val")) ? (String[])params.get("Sub2_OUTSIDE_TYP_val") : (String[])null);
		String[] Sub2_WS_CD = ((params.containsKey("Sub2_WS_CD")) ? (String[])params.get("Sub2_WS_CD") : (String[])null);
		String[] Sub2_WS_NAME = ((params.containsKey("Sub2_WS_NAME")) ? (String[])params.get("Sub2_WS_NAME") : (String[])null);
		String[] Sub2_VEND_CD = ((params.containsKey("Sub2_VEND_CD")) ? (String[])params.get("Sub2_VEND_CD") : (String[])null);
		String[] Sub2_VEND_NAME = ((params.containsKey("Sub2_VEND_NAME")) ? (String[])params.get("Sub2_VEND_NAME") : (String[])null);
		String[] Sub2_ACPT_INSPC_TYP = ((params.containsKey("Sub2_ACPT_INSPC_TYP")) ? (String[])params.get("Sub2_ACPT_INSPC_TYP") : (String[])null);
		String[] Sub2_ACPT_INSPC_TYP_name = ((params.containsKey("Sub2_ACPT_INSPC_TYP_name")) ? (String[])params.get("Sub2_ACPT_INSPC_TYP_name") : (String[])null);
		String[] Sub2_ACPT_INSPC_TYP_val = ((params.containsKey("Sub2_ACPT_INSPC_TYP_val")) ? (String[])params.get("Sub2_ACPT_INSPC_TYP_val") : (String[])null);
		String[] Sub2_STANDARD_COST = ((params.containsKey("Sub2_STANDARD_COST")) ? (String[])params.get("Sub2_STANDARD_COST") : (String[])null);
		String[] Sub1Parent_ITEM_CD = ((params.containsKey("Sub1Parent_ITEM_CD")) ? (String[])params.get("Sub1Parent_ITEM_CD") : (String[])null);
		String[] h_Sub1Parent_ITEM_CD = ((params.containsKey("h_Sub1Parent_ITEM_CD")) ? (String[])params.get("h_Sub1Parent_ITEM_CD") : (String[])null);
		String[] Sub1Parent_ITEM_NAME = ((params.containsKey("Sub1Parent_ITEM_NAME")) ? (String[])params.get("Sub1Parent_ITEM_NAME") : (String[])null);
		String[] Sub1Comp_ITEM_CD = ((params.containsKey("Sub1Comp_ITEM_CD")) ? (String[])params.get("Sub1Comp_ITEM_CD") : (String[])null);
		String[] h_Sub1Comp_ITEM_CD = ((params.containsKey("h_Sub1Comp_ITEM_CD")) ? (String[])params.get("h_Sub1Comp_ITEM_CD") : (String[])null);
		String[] Sub1Comp_ITEM_NAME = ((params.containsKey("Sub1Comp_ITEM_NAME")) ? (String[])params.get("Sub1Comp_ITEM_NAME") : (String[])null);
		String[] Sub1_PS_EDITION = ((params.containsKey("Sub1_PS_EDITION")) ? (String[])params.get("Sub1_PS_EDITION") : (String[])null);
		String[] h_Sub1_PS_EDITION = ((params.containsKey("h_Sub1_PS_EDITION")) ? (String[])params.get("h_Sub1_PS_EDITION") : (String[])null);
		String[] h_Sub1_MODIFY_COUNT = ((params.containsKey("h_Sub1_MODIFY_COUNT")) ? (String[])params.get("h_Sub1_MODIFY_COUNT") : (String[])null);
		String[] Sub1_PS_UNIT_NUMERATOR = ((params.containsKey("Sub1_PS_UNIT_NUMERATOR")) ? (String[])params.get("Sub1_PS_UNIT_NUMERATOR") : (String[])null);
		String[] Sub1_PS_UNIT_DENOMINATOR = ((params.containsKey("Sub1_PS_UNIT_DENOMINATOR")) ? (String[])params.get("Sub1_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] Sub1_STOCK_UNIT = ((params.containsKey("Sub1_STOCK_UNIT")) ? (String[])params.get("Sub1_STOCK_UNIT") : (String[])null);
		String[] Sub1_EFF_PHASE_IN_DATE = ((params.containsKey("Sub1_EFF_PHASE_IN_DATE")) ? (String[])params.get("Sub1_EFF_PHASE_IN_DATE") : (String[])null);
		String[] Sub1_EFF_PHASE_OUT_DATE = ((params.containsKey("Sub1_EFF_PHASE_OUT_DATE")) ? (String[])params.get("Sub1_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] Sub1_PS_SPOIL = ((params.containsKey("Sub1_PS_SPOIL")) ? (String[])params.get("Sub1_PS_SPOIL") : (String[])null);
		String[] Sub1_CONS_TYP = ((params.containsKey("Sub1_CONS_TYP")) ? (String[])params.get("Sub1_CONS_TYP") : (String[])null);
		String[] Sub1_CONS_TYP_name = ((params.containsKey("Sub1_CONS_TYP_name")) ? (String[])params.get("Sub1_CONS_TYP_name") : (String[])null);
		String[] Sub1_CONS_TYP_val = ((params.containsKey("Sub1_CONS_TYP_val")) ? (String[])params.get("Sub1_CONS_TYP_val") : (String[])null);
		String[] Sub1_PS_REF_NO = ((params.containsKey("Sub1_PS_REF_NO")) ? (String[])params.get("Sub1_PS_REF_NO") : (String[])null);
		String[] Sub1_PS_FIXED_LT = ((params.containsKey("Sub1_PS_FIXED_LT")) ? (String[])params.get("Sub1_PS_FIXED_LT") : (String[])null);
		String[] c_Sub1_PS_LT_FLG = ((params.containsKey("c_Sub1_PS_LT_FLG")) ? (String[])params.get("c_Sub1_PS_LT_FLG") : (String[])null);
		String[] h_Sub1_PS_LT_FLG = ((params.containsKey("h_Sub1_PS_LT_FLG")) ? (String[])params.get("h_Sub1_PS_LT_FLG") : (String[])null);
		String[] Sub1_PS_PROP_LT = ((params.containsKey("Sub1_PS_PROP_LT")) ? (String[])params.get("Sub1_PS_PROP_LT") : (String[])null);
		String[] Sub1_PS_PROP_LOT_SIZE = ((params.containsKey("Sub1_PS_PROP_LOT_SIZE")) ? (String[])params.get("Sub1_PS_PROP_LOT_SIZE") : (String[])null);
		String[] Sub1_COST_UP_TYP = ((params.containsKey("Sub1_COST_UP_TYP")) ? (String[])params.get("Sub1_COST_UP_TYP") : (String[])null);
		String[] Sub1_COST_UP_TYP_name = ((params.containsKey("Sub1_COST_UP_TYP_name")) ? (String[])params.get("Sub1_COST_UP_TYP_name") : (String[])null);
		String[] Sub1_COST_UP_TYP_val = ((params.containsKey("Sub1_COST_UP_TYP_val")) ? (String[])params.get("Sub1_COST_UP_TYP_val") : (String[])null);
		String[] Sub1_MRP_EXP_TYP = ((params.containsKey("Sub1_MRP_EXP_TYP")) ? (String[])params.get("Sub1_MRP_EXP_TYP") : (String[])null);
		String[] Sub1_MRP_EXP_TYP_name = ((params.containsKey("Sub1_MRP_EXP_TYP_name")) ? (String[])params.get("Sub1_MRP_EXP_TYP_name") : (String[])null);
		String[] Sub1_MRP_EXP_TYP_val = ((params.containsKey("Sub1_MRP_EXP_TYP_val")) ? (String[])params.get("Sub1_MRP_EXP_TYP_val") : (String[])null);
		String[] h_Target_ITEM_CD2 = ((params.containsKey("h_Target_ITEM_CD2")) ? (String[])params.get("h_Target_ITEM_CD2") : (String[])null);
		String[] h_TargetDate2 = ((params.containsKey("h_TargetDate2")) ? (String[])params.get("h_TargetDate2") : (String[])null);
		String[] h_DEVELOP_TYP2 = ((params.containsKey("h_DEVELOP_TYP2")) ? (String[])params.get("h_DEVELOP_TYP2") : (String[])null);
		String[] h_InitLevel2 = ((params.containsKey("h_InitLevel2")) ? (String[])params.get("h_InitLevel2") : (String[])null);
		String[] Det2ACPT_INSPC_TYP = ((params.containsKey("Det2ACPT_INSPC_TYP")) ? (String[])params.get("Det2ACPT_INSPC_TYP") : (String[])null);
		String[] h_Sub2_MODIFY_COUNT = ((params.containsKey("h_Sub2_MODIFY_COUNT")) ? (String[])params.get("h_Sub2_MODIFY_COUNT") : (String[])null);
		String[] h_Sub2_PROC_NO = ((params.containsKey("h_Sub2_PROC_NO")) ? (String[])params.get("h_Sub2_PROC_NO") : (String[])null);
		String[] FIRST_PROC = ((params.containsKey("FIRST_PROC")) ? (String[])params.get("FIRST_PROC") : (String[])null);
		String[] h_Sub1_PS_UNIT_NUMERATOR = ((params.containsKey("h_Sub1_PS_UNIT_NUMERATOR")) ? (String[])params.get("h_Sub1_PS_UNIT_NUMERATOR") : (String[])null);
		String[] h_Sub1_PS_UNIT_DENOMINATOR = ((params.containsKey("h_Sub1_PS_UNIT_DENOMINATOR")) ? (String[])params.get("h_Sub1_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] AA0180010tree1 = ((params.containsKey("AA0180010tree1")) ? (String[])params.get("AA0180010tree1") : (String[])null);
		String[] sub2_STOCK_UNIT_1 = ((params.containsKey("sub2_STOCK_UNIT_1")) ? (String[])params.get("sub2_STOCK_UNIT_1") : (String[])null);
		String[] sub2_STOCK_UNIT_2 = ((params.containsKey("sub2_STOCK_UNIT_2")) ? (String[])params.get("sub2_STOCK_UNIT_2") : (String[])null);
		String[] sub2_STOCK_UNIT_3 = ((params.containsKey("sub2_STOCK_UNIT_3")) ? (String[])params.get("sub2_STOCK_UNIT_3") : (String[])null);
		String[] Det2FIXED_LT_UNIT = ((params.containsKey("Det2FIXED_LT_UNIT")) ? (String[])params.get("Det2FIXED_LT_UNIT") : (String[])null);
		String[] Det2PROP_LT_UNIT = ((params.containsKey("Det2PROP_LT_UNIT")) ? (String[])params.get("Det2PROP_LT_UNIT") : (String[])null);
		String[] Det2PROP_LOT_SIZE_UNIT = ((params.containsKey("Det2PROP_LOT_SIZE_UNIT")) ? (String[])params.get("Det2PROP_LOT_SIZE_UNIT") : (String[])null);
		String[] Det2SAFETY_LT_UNIT = ((params.containsKey("Det2SAFETY_LT_UNIT")) ? (String[])params.get("Det2SAFETY_LT_UNIT") : (String[])null);
		String[] Det_MANHOUR_TYP = ((params.containsKey("Det_MANHOUR_TYP")) ? (String[])params.get("Det_MANHOUR_TYP") : (String[])null);
		String[] Lower_MANHOUR_TYP = ((params.containsKey("Lower_MANHOUR_TYP")) ? (String[])params.get("Lower_MANHOUR_TYP") : (String[])null);
		String[] MANHOUR_TYP = ((params.containsKey("MANHOUR_TYP")) ? (String[])params.get("MANHOUR_TYP") : (String[])null);

		struct.setDet_PS_EDITION( ((Det_PS_EDITION == null) ? (String)null : Det_PS_EDITION[0]) );
		struct.setList_Det_PS_EDITION(TypeConverter.convert(Det_PS_EDITION));
		struct.setDet_STOCK_UNIT( ((Det_STOCK_UNIT == null) ? (String)null : Det_STOCK_UNIT[0]) );
		struct.setList_Det_STOCK_UNIT(TypeConverter.convert(Det_STOCK_UNIT));
		struct.setDet_EFF_PHASE_IN_DATE( ((Det_EFF_PHASE_IN_DATE == null) ? (String)null : Det_EFF_PHASE_IN_DATE[0]) );
		struct.setList_Det_EFF_PHASE_IN_DATE(TypeConverter.convert(Det_EFF_PHASE_IN_DATE));
		struct.setDet_EFF_PHASE_OUT_DATE( ((Det_EFF_PHASE_OUT_DATE == null) ? (String)null : Det_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_Det_EFF_PHASE_OUT_DATE(TypeConverter.convert(Det_EFF_PHASE_OUT_DATE));
		struct.setDet_PS_SPOIL( ((Det_PS_SPOIL == null) ? (String)null : Det_PS_SPOIL[0]) );
		struct.setList_Det_PS_SPOIL(TypeConverter.convert(Det_PS_SPOIL));
		struct.setDet_CONS_TYP( ((Det_CONS_TYP == null) ? (String)null : Det_CONS_TYP[0]) );
		struct.setList_Det_CONS_TYP(TypeConverter.convert(Det_CONS_TYP));
		struct.setDet_PS_LT_FLG( ((Det_PS_LT_FLG == null) ? (String)null : Det_PS_LT_FLG[0]) );
		struct.setList_Det_PS_LT_FLG(TypeConverter.convert(Det_PS_LT_FLG));
		struct.setDet_PS_PROP_LT( ((Det_PS_PROP_LT == null) ? (String)null : Det_PS_PROP_LT[0]) );
		struct.setList_Det_PS_PROP_LT(TypeConverter.convert(Det_PS_PROP_LT));
		struct.setDet_PS_PROP_LOT_SIZE( ((Det_PS_PROP_LOT_SIZE == null) ? (String)null : Det_PS_PROP_LOT_SIZE[0]) );
		struct.setList_Det_PS_PROP_LOT_SIZE(TypeConverter.convert(Det_PS_PROP_LOT_SIZE));
		struct.setDet_PS_REF_NO( ((Det_PS_REF_NO == null) ? (String)null : Det_PS_REF_NO[0]) );
		struct.setList_Det_PS_REF_NO(TypeConverter.convert(Det_PS_REF_NO));
		struct.setDet_COST_UP_TYP( ((Det_COST_UP_TYP == null) ? (String)null : Det_COST_UP_TYP[0]) );
		struct.setList_Det_COST_UP_TYP(TypeConverter.convert(Det_COST_UP_TYP));
		struct.setDet_MRP_EXP_TYP( ((Det_MRP_EXP_TYP == null) ? (String)null : Det_MRP_EXP_TYP[0]) );
		struct.setList_Det_MRP_EXP_TYP(TypeConverter.convert(Det_MRP_EXP_TYP));
		struct.setTarget_ITEM_CD( ((Target_ITEM_CD == null) ? (String)null : Target_ITEM_CD[0]) );
		struct.setList_Target_ITEM_CD(TypeConverter.convert(Target_ITEM_CD));
		struct.setDEVELOP_TYP( ((DEVELOP_TYP == null) ? (String)null : DEVELOP_TYP[0]) );
		struct.setList_DEVELOP_TYP(TypeConverter.convert(DEVELOP_TYP));
		struct.setInitLevel( ((InitLevel == null) ? (String)null : InitLevel[0]) );
		struct.setList_InitLevel(TypeConverter.convert(InitLevel));
		struct.setid( ((id == null) ? (String)null : id[0]) );
		struct.setList_id(TypeConverter.convert(id));
		struct.setlvl( ((lvl == null) ? (String)null : lvl[0]) );
		struct.setList_lvl(TypeConverter.convert(lvl));
		struct.setparent( ((parent == null) ? (String)null : parent[0]) );
		struct.setList_parent(TypeConverter.convert(parent));
		struct.setlabel( ((label == null) ? (String)null : label[0]) );
		struct.setList_label(TypeConverter.convert(label));
		struct.setctx( ((ctx == null) ? (String)null : ctx[0]) );
		struct.setList_ctx(TypeConverter.convert(ctx));
		struct.setmaxid( ((maxid == null) ? (String)null : maxid[0]) );
		struct.setList_maxid(TypeConverter.convert(maxid));
		struct.setUpper_ITEM_CD( ((Upper_ITEM_CD == null) ? (String)null : Upper_ITEM_CD[0]) );
		struct.setList_Upper_ITEM_CD(TypeConverter.convert(Upper_ITEM_CD));
		struct.setUpper_ITEM_NAME( ((Upper_ITEM_NAME == null) ? (String)null : Upper_ITEM_NAME[0]) );
		struct.setList_Upper_ITEM_NAME(TypeConverter.convert(Upper_ITEM_NAME));
		struct.setLower_ITEM_CD( ((Lower_ITEM_CD == null) ? (String)null : Lower_ITEM_CD[0]) );
		struct.setList_Lower_ITEM_CD(TypeConverter.convert(Lower_ITEM_CD));
		struct.setLower_ITEM_NAME( ((Lower_ITEM_NAME == null) ? (String)null : Lower_ITEM_NAME[0]) );
		struct.setList_Lower_ITEM_NAME(TypeConverter.convert(Lower_ITEM_NAME));
		struct.setPS_EDITION( ((PS_EDITION == null) ? (String)null : PS_EDITION[0]) );
		struct.setList_PS_EDITION(TypeConverter.convert(PS_EDITION));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setDetParent_ITEM_NAME( ((DetParent_ITEM_NAME == null) ? (String)null : DetParent_ITEM_NAME[0]) );
		struct.setList_DetParent_ITEM_NAME(TypeConverter.convert(DetParent_ITEM_NAME));
		struct.setDetParent_OUTSIDE_TYP( ((DetParent_OUTSIDE_TYP == null) ? (String)null : DetParent_OUTSIDE_TYP[0]) );
		struct.setList_DetParent_OUTSIDE_TYP(TypeConverter.convert(DetParent_OUTSIDE_TYP));
		struct.setDetComp_ITEM_NAME( ((DetComp_ITEM_NAME == null) ? (String)null : DetComp_ITEM_NAME[0]) );
		struct.setList_DetComp_ITEM_NAME(TypeConverter.convert(DetComp_ITEM_NAME));
		struct.setDetComp_OUTSIDE_TYP( ((DetComp_OUTSIDE_TYP == null) ? (String)null : DetComp_OUTSIDE_TYP[0]) );
		struct.setList_DetComp_OUTSIDE_TYP(TypeConverter.convert(DetComp_OUTSIDE_TYP));
		struct.setTargetDate( ((TargetDate == null) ? (String)null : TargetDate[0]) );
		struct.setList_TargetDate(TypeConverter.convert(TargetDate));
		struct.setEFF_PHASE_IN_DATE( ((EFF_PHASE_IN_DATE == null) ? (String)null : EFF_PHASE_IN_DATE[0]) );
		struct.setList_EFF_PHASE_IN_DATE(TypeConverter.convert(EFF_PHASE_IN_DATE));
		struct.setEFF_PHASE_OUT_DATE( ((EFF_PHASE_OUT_DATE == null) ? (String)null : EFF_PHASE_OUT_DATE[0]) );
		struct.setList_EFF_PHASE_OUT_DATE(TypeConverter.convert(EFF_PHASE_OUT_DATE));
		struct.setDetParent_MRP_ODR_TYP( ((DetParent_MRP_ODR_TYP == null) ? (String)null : DetParent_MRP_ODR_TYP[0]) );
		struct.setList_DetParent_MRP_ODR_TYP(TypeConverter.convert(DetParent_MRP_ODR_TYP));
		struct.setDetComp_MRP_ODR_TYP( ((DetComp_MRP_ODR_TYP == null) ? (String)null : DetComp_MRP_ODR_TYP[0]) );
		struct.setList_DetComp_MRP_ODR_TYP(TypeConverter.convert(DetComp_MRP_ODR_TYP));
		struct.setDet_PS_FIXED_LT( ((Det_PS_FIXED_LT == null) ? (String)null : Det_PS_FIXED_LT[0]) );
		struct.setList_Det_PS_FIXED_LT(TypeConverter.convert(Det_PS_FIXED_LT));
		struct.setDetParent_ITEM_CD( ((DetParent_ITEM_CD == null) ? (String)null : DetParent_ITEM_CD[0]) );
		struct.setList_DetParent_ITEM_CD(TypeConverter.convert(DetParent_ITEM_CD));
		struct.setDetComp_ITEM_CD( ((DetComp_ITEM_CD == null) ? (String)null : DetComp_ITEM_CD[0]) );
		struct.setList_DetComp_ITEM_CD(TypeConverter.convert(DetComp_ITEM_CD));
		struct.seth_Target_ITEM_CD( ((h_Target_ITEM_CD == null) ? (String)null : h_Target_ITEM_CD[0]) );
		struct.setList_h_Target_ITEM_CD(TypeConverter.convert(h_Target_ITEM_CD));
		struct.seth_TargetDate( ((h_TargetDate == null) ? (String)null : h_TargetDate[0]) );
		struct.setList_h_TargetDate(TypeConverter.convert(h_TargetDate));
		struct.seth_DEVELOP_TYP( ((h_DEVELOP_TYP == null) ? (String)null : h_DEVELOP_TYP[0]) );
		struct.setList_h_DEVELOP_TYP(TypeConverter.convert(h_DEVELOP_TYP));
		struct.seth_InitLevel( ((h_InitLevel == null) ? (String)null : h_InitLevel[0]) );
		struct.setList_h_InitLevel(TypeConverter.convert(h_InitLevel));
		struct.setDEVELOP_TYP_name( ((DEVELOP_TYP_name == null) ? (String)null : DEVELOP_TYP_name[0]) );
		struct.setList_DEVELOP_TYP_name(TypeConverter.convert(DEVELOP_TYP_name));
		struct.setDEVELOP_TYP_val( ((DEVELOP_TYP_val == null) ? (String)null : DEVELOP_TYP_val[0]) );
		struct.setList_DEVELOP_TYP_val(TypeConverter.convert(DEVELOP_TYP_val));
		struct.setDet_PS_UNIT_QTY( ((Det_PS_UNIT_QTY == null) ? (String)null : Det_PS_UNIT_QTY[0]) );
		struct.setList_Det_PS_UNIT_QTY(TypeConverter.convert(Det_PS_UNIT_QTY));
		struct.seth_ProcTyp( ((h_ProcTyp == null) ? (String)null : h_ProcTyp[0]) );
		struct.setList_h_ProcTyp(TypeConverter.convert(h_ProcTyp));
		struct.seth_MaxLevel( ((h_MaxLevel == null) ? (String)null : h_MaxLevel[0]) );
		struct.setList_h_MaxLevel(TypeConverter.convert(h_MaxLevel));
		struct.setPROC_CD( ((PROC_CD == null) ? (String)null : PROC_CD[0]) );
		struct.setList_PROC_CD(TypeConverter.convert(PROC_CD));
		struct.setMODIFY_CNT_ISSUE( ((MODIFY_CNT_ISSUE == null) ? (String)null : MODIFY_CNT_ISSUE[0]) );
		struct.setList_MODIFY_CNT_ISSUE(TypeConverter.convert(MODIFY_CNT_ISSUE));
		struct.setMODIFY_CNT_PROC( ((MODIFY_CNT_PROC == null) ? (String)null : MODIFY_CNT_PROC[0]) );
		struct.setList_MODIFY_CNT_PROC(TypeConverter.convert(MODIFY_CNT_PROC));
		struct.setDET_TYP( ((DET_TYP == null) ? (String)null : DET_TYP[0]) );
		struct.setList_DET_TYP(TypeConverter.convert(DET_TYP));
		struct.setDet2ITEM_CD( ((Det2ITEM_CD == null) ? (String)null : Det2ITEM_CD[0]) );
		struct.setList_Det2ITEM_CD(TypeConverter.convert(Det2ITEM_CD));
		struct.setDet2ITEM_NAME( ((Det2ITEM_NAME == null) ? (String)null : Det2ITEM_NAME[0]) );
		struct.setList_Det2ITEM_NAME(TypeConverter.convert(Det2ITEM_NAME));
		struct.setDet2PROC_CD( ((Det2PROC_CD == null) ? (String)null : Det2PROC_CD[0]) );
		struct.setList_Det2PROC_CD(TypeConverter.convert(Det2PROC_CD));
		struct.setDet2PROC_NO( ((Det2PROC_NO == null) ? (String)null : Det2PROC_NO[0]) );
		struct.setList_Det2PROC_NO(TypeConverter.convert(Det2PROC_NO));
		struct.setDet2PROC_NAME( ((Det2PROC_NAME == null) ? (String)null : Det2PROC_NAME[0]) );
		struct.setList_Det2PROC_NAME(TypeConverter.convert(Det2PROC_NAME));
		struct.setDet2WS_CD( ((Det2WS_CD == null) ? (String)null : Det2WS_CD[0]) );
		struct.setList_Det2WS_CD(TypeConverter.convert(Det2WS_CD));
		struct.setDet2WS_NAME( ((Det2WS_NAME == null) ? (String)null : Det2WS_NAME[0]) );
		struct.setList_Det2WS_NAME(TypeConverter.convert(Det2WS_NAME));
		struct.setDet2COMPANY_CD( ((Det2COMPANY_CD == null) ? (String)null : Det2COMPANY_CD[0]) );
		struct.setList_Det2COMPANY_CD(TypeConverter.convert(Det2COMPANY_CD));
		struct.setDet2VEND_CD( ((Det2VEND_CD == null) ? (String)null : Det2VEND_CD[0]) );
		struct.setList_Det2VEND_CD(TypeConverter.convert(Det2VEND_CD));
		struct.setDet2VEND_NAME( ((Det2VEND_NAME == null) ? (String)null : Det2VEND_NAME[0]) );
		struct.setList_Det2VEND_NAME(TypeConverter.convert(Det2VEND_NAME));
		struct.setDet2FIXED_LT( ((Det2FIXED_LT == null) ? (String)null : Det2FIXED_LT[0]) );
		struct.setList_Det2FIXED_LT(TypeConverter.convert(Det2FIXED_LT));
		struct.setDet2PROP_LT( ((Det2PROP_LT == null) ? (String)null : Det2PROP_LT[0]) );
		struct.setList_Det2PROP_LT(TypeConverter.convert(Det2PROP_LT));
		struct.setDet2SAFETY_LT( ((Det2SAFETY_LT == null) ? (String)null : Det2SAFETY_LT[0]) );
		struct.setList_Det2SAFETY_LT(TypeConverter.convert(Det2SAFETY_LT));
		struct.setDet2PROP_LOT_SIZE( ((Det2PROP_LOT_SIZE == null) ? (String)null : Det2PROP_LOT_SIZE[0]) );
		struct.setList_Det2PROP_LOT_SIZE(TypeConverter.convert(Det2PROP_LOT_SIZE));
		struct.setDet2SPOIL( ((Det2SPOIL == null) ? (String)null : Det2SPOIL[0]) );
		struct.setList_Det2SPOIL(TypeConverter.convert(Det2SPOIL));
		struct.setDet2OUTSIDE_TYP( ((Det2OUTSIDE_TYP == null) ? (String)null : Det2OUTSIDE_TYP[0]) );
		struct.setList_Det2OUTSIDE_TYP(TypeConverter.convert(Det2OUTSIDE_TYP));
		struct.setDet2STANDARD_COST( ((Det2STANDARD_COST == null) ? (String)null : Det2STANDARD_COST[0]) );
		struct.setList_Det2STANDARD_COST(TypeConverter.convert(Det2STANDARD_COST));
		struct.setSub2_ITEM_CD( ((Sub2_ITEM_CD == null) ? (String)null : Sub2_ITEM_CD[0]) );
		struct.setList_Sub2_ITEM_CD(TypeConverter.convert(Sub2_ITEM_CD));
		struct.setSub2_ITEM_NAME( ((Sub2_ITEM_NAME == null) ? (String)null : Sub2_ITEM_NAME[0]) );
		struct.setList_Sub2_ITEM_NAME(TypeConverter.convert(Sub2_ITEM_NAME));
		struct.setSub2_PROC_CD( ((Sub2_PROC_CD == null) ? (String)null : Sub2_PROC_CD[0]) );
		struct.setList_Sub2_PROC_CD(TypeConverter.convert(Sub2_PROC_CD));
		struct.setSub2_PROC_NAME( ((Sub2_PROC_NAME == null) ? (String)null : Sub2_PROC_NAME[0]) );
		struct.setList_Sub2_PROC_NAME(TypeConverter.convert(Sub2_PROC_NAME));
		struct.setSub2_PROC_NO( ((Sub2_PROC_NO == null) ? (String)null : Sub2_PROC_NO[0]) );
		struct.setList_Sub2_PROC_NO(TypeConverter.convert(Sub2_PROC_NO));
		struct.setSub2_SPOIL( ((Sub2_SPOIL == null) ? (String)null : Sub2_SPOIL[0]) );
		struct.setList_Sub2_SPOIL(TypeConverter.convert(Sub2_SPOIL));
		struct.setSub2_FIXED_LT( ((Sub2_FIXED_LT == null) ? (String)null : Sub2_FIXED_LT[0]) );
		struct.setList_Sub2_FIXED_LT(TypeConverter.convert(Sub2_FIXED_LT));
		struct.setSub2_PROP_LT( ((Sub2_PROP_LT == null) ? (String)null : Sub2_PROP_LT[0]) );
		struct.setList_Sub2_PROP_LT(TypeConverter.convert(Sub2_PROP_LT));
		struct.setSub2_PROP_LOT_SIZE( ((Sub2_PROP_LOT_SIZE == null) ? (String)null : Sub2_PROP_LOT_SIZE[0]) );
		struct.setList_Sub2_PROP_LOT_SIZE(TypeConverter.convert(Sub2_PROP_LOT_SIZE));
		struct.setSub2_STOCK_UNIT( ((Sub2_STOCK_UNIT == null) ? (String)null : Sub2_STOCK_UNIT[0]) );
		struct.setList_Sub2_STOCK_UNIT(TypeConverter.convert(Sub2_STOCK_UNIT));
		struct.setSub2_SAFETY_LT( ((Sub2_SAFETY_LT == null) ? (String)null : Sub2_SAFETY_LT[0]) );
		struct.setList_Sub2_SAFETY_LT(TypeConverter.convert(Sub2_SAFETY_LT));
		struct.setSub2_OUTSIDE_TYP( ((Sub2_OUTSIDE_TYP == null) ? (String)null : Sub2_OUTSIDE_TYP[0]) );
		struct.setList_Sub2_OUTSIDE_TYP(TypeConverter.convert(Sub2_OUTSIDE_TYP));
		struct.setSub2_OUTSIDE_TYP_name( ((Sub2_OUTSIDE_TYP_name == null) ? (String)null : Sub2_OUTSIDE_TYP_name[0]) );
		struct.setList_Sub2_OUTSIDE_TYP_name(TypeConverter.convert(Sub2_OUTSIDE_TYP_name));
		struct.setSub2_OUTSIDE_TYP_val( ((Sub2_OUTSIDE_TYP_val == null) ? (String)null : Sub2_OUTSIDE_TYP_val[0]) );
		struct.setList_Sub2_OUTSIDE_TYP_val(TypeConverter.convert(Sub2_OUTSIDE_TYP_val));
		struct.setSub2_WS_CD( ((Sub2_WS_CD == null) ? (String)null : Sub2_WS_CD[0]) );
		struct.setList_Sub2_WS_CD(TypeConverter.convert(Sub2_WS_CD));
		struct.setSub2_WS_NAME( ((Sub2_WS_NAME == null) ? (String)null : Sub2_WS_NAME[0]) );
		struct.setList_Sub2_WS_NAME(TypeConverter.convert(Sub2_WS_NAME));
		struct.setSub2_VEND_CD( ((Sub2_VEND_CD == null) ? (String)null : Sub2_VEND_CD[0]) );
		struct.setList_Sub2_VEND_CD(TypeConverter.convert(Sub2_VEND_CD));
		struct.setSub2_VEND_NAME( ((Sub2_VEND_NAME == null) ? (String)null : Sub2_VEND_NAME[0]) );
		struct.setList_Sub2_VEND_NAME(TypeConverter.convert(Sub2_VEND_NAME));
		struct.setSub2_ACPT_INSPC_TYP( ((Sub2_ACPT_INSPC_TYP == null) ? (String)null : Sub2_ACPT_INSPC_TYP[0]) );
		struct.setList_Sub2_ACPT_INSPC_TYP(TypeConverter.convert(Sub2_ACPT_INSPC_TYP));
		struct.setSub2_ACPT_INSPC_TYP_name( ((Sub2_ACPT_INSPC_TYP_name == null) ? (String)null : Sub2_ACPT_INSPC_TYP_name[0]) );
		struct.setList_Sub2_ACPT_INSPC_TYP_name(TypeConverter.convert(Sub2_ACPT_INSPC_TYP_name));
		struct.setSub2_ACPT_INSPC_TYP_val( ((Sub2_ACPT_INSPC_TYP_val == null) ? (String)null : Sub2_ACPT_INSPC_TYP_val[0]) );
		struct.setList_Sub2_ACPT_INSPC_TYP_val(TypeConverter.convert(Sub2_ACPT_INSPC_TYP_val));
		struct.setSub2_STANDARD_COST( ((Sub2_STANDARD_COST == null) ? (String)null : Sub2_STANDARD_COST[0]) );
		struct.setList_Sub2_STANDARD_COST(TypeConverter.convert(Sub2_STANDARD_COST));
		struct.setSub1Parent_ITEM_CD( ((Sub1Parent_ITEM_CD == null) ? (String)null : Sub1Parent_ITEM_CD[0]) );
		struct.setList_Sub1Parent_ITEM_CD(TypeConverter.convert(Sub1Parent_ITEM_CD));
		struct.seth_Sub1Parent_ITEM_CD( ((h_Sub1Parent_ITEM_CD == null) ? (String)null : h_Sub1Parent_ITEM_CD[0]) );
		struct.setList_h_Sub1Parent_ITEM_CD(TypeConverter.convert(h_Sub1Parent_ITEM_CD));
		struct.setSub1Parent_ITEM_NAME( ((Sub1Parent_ITEM_NAME == null) ? (String)null : Sub1Parent_ITEM_NAME[0]) );
		struct.setList_Sub1Parent_ITEM_NAME(TypeConverter.convert(Sub1Parent_ITEM_NAME));
		struct.setSub1Comp_ITEM_CD( ((Sub1Comp_ITEM_CD == null) ? (String)null : Sub1Comp_ITEM_CD[0]) );
		struct.setList_Sub1Comp_ITEM_CD(TypeConverter.convert(Sub1Comp_ITEM_CD));
		struct.seth_Sub1Comp_ITEM_CD( ((h_Sub1Comp_ITEM_CD == null) ? (String)null : h_Sub1Comp_ITEM_CD[0]) );
		struct.setList_h_Sub1Comp_ITEM_CD(TypeConverter.convert(h_Sub1Comp_ITEM_CD));
		struct.setSub1Comp_ITEM_NAME( ((Sub1Comp_ITEM_NAME == null) ? (String)null : Sub1Comp_ITEM_NAME[0]) );
		struct.setList_Sub1Comp_ITEM_NAME(TypeConverter.convert(Sub1Comp_ITEM_NAME));
		struct.setSub1_PS_EDITION( ((Sub1_PS_EDITION == null) ? (String)null : Sub1_PS_EDITION[0]) );
		struct.setList_Sub1_PS_EDITION(TypeConverter.convert(Sub1_PS_EDITION));
		struct.seth_Sub1_PS_EDITION( ((h_Sub1_PS_EDITION == null) ? (String)null : h_Sub1_PS_EDITION[0]) );
		struct.setList_h_Sub1_PS_EDITION(TypeConverter.convert(h_Sub1_PS_EDITION));
		struct.seth_Sub1_MODIFY_COUNT( ((h_Sub1_MODIFY_COUNT == null) ? (String)null : h_Sub1_MODIFY_COUNT[0]) );
		struct.setList_h_Sub1_MODIFY_COUNT(TypeConverter.convert(h_Sub1_MODIFY_COUNT));
		struct.setSub1_PS_UNIT_NUMERATOR( ((Sub1_PS_UNIT_NUMERATOR == null) ? (String)null : Sub1_PS_UNIT_NUMERATOR[0]) );
		struct.setList_Sub1_PS_UNIT_NUMERATOR(TypeConverter.convert(Sub1_PS_UNIT_NUMERATOR));
		struct.setSub1_PS_UNIT_DENOMINATOR( ((Sub1_PS_UNIT_DENOMINATOR == null) ? (String)null : Sub1_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_Sub1_PS_UNIT_DENOMINATOR(TypeConverter.convert(Sub1_PS_UNIT_DENOMINATOR));
		struct.setSub1_STOCK_UNIT( ((Sub1_STOCK_UNIT == null) ? (String)null : Sub1_STOCK_UNIT[0]) );
		struct.setList_Sub1_STOCK_UNIT(TypeConverter.convert(Sub1_STOCK_UNIT));
		struct.setSub1_EFF_PHASE_IN_DATE( ((Sub1_EFF_PHASE_IN_DATE == null) ? (String)null : Sub1_EFF_PHASE_IN_DATE[0]) );
		struct.setList_Sub1_EFF_PHASE_IN_DATE(TypeConverter.convert(Sub1_EFF_PHASE_IN_DATE));
		struct.setSub1_EFF_PHASE_OUT_DATE( ((Sub1_EFF_PHASE_OUT_DATE == null) ? (String)null : Sub1_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_Sub1_EFF_PHASE_OUT_DATE(TypeConverter.convert(Sub1_EFF_PHASE_OUT_DATE));
		struct.setSub1_PS_SPOIL( ((Sub1_PS_SPOIL == null) ? (String)null : Sub1_PS_SPOIL[0]) );
		struct.setList_Sub1_PS_SPOIL(TypeConverter.convert(Sub1_PS_SPOIL));
		struct.setSub1_CONS_TYP( ((Sub1_CONS_TYP == null) ? (String)null : Sub1_CONS_TYP[0]) );
		struct.setList_Sub1_CONS_TYP(TypeConverter.convert(Sub1_CONS_TYP));
		struct.setSub1_CONS_TYP_name( ((Sub1_CONS_TYP_name == null) ? (String)null : Sub1_CONS_TYP_name[0]) );
		struct.setList_Sub1_CONS_TYP_name(TypeConverter.convert(Sub1_CONS_TYP_name));
		struct.setSub1_CONS_TYP_val( ((Sub1_CONS_TYP_val == null) ? (String)null : Sub1_CONS_TYP_val[0]) );
		struct.setList_Sub1_CONS_TYP_val(TypeConverter.convert(Sub1_CONS_TYP_val));
		struct.setSub1_PS_REF_NO( ((Sub1_PS_REF_NO == null) ? (String)null : Sub1_PS_REF_NO[0]) );
		struct.setList_Sub1_PS_REF_NO(TypeConverter.convert(Sub1_PS_REF_NO));
		struct.setSub1_PS_FIXED_LT( ((Sub1_PS_FIXED_LT == null) ? (String)null : Sub1_PS_FIXED_LT[0]) );
		struct.setList_Sub1_PS_FIXED_LT(TypeConverter.convert(Sub1_PS_FIXED_LT));
		struct.setc_Sub1_PS_LT_FLG( ((c_Sub1_PS_LT_FLG == null) ? (String)null : c_Sub1_PS_LT_FLG[0]) );
		struct.setList_c_Sub1_PS_LT_FLG(TypeConverter.convert(c_Sub1_PS_LT_FLG));
		struct.seth_Sub1_PS_LT_FLG( ((h_Sub1_PS_LT_FLG == null) ? (String)null : h_Sub1_PS_LT_FLG[0]) );
		struct.setList_h_Sub1_PS_LT_FLG(TypeConverter.convert(h_Sub1_PS_LT_FLG));
		struct.setSub1_PS_PROP_LT( ((Sub1_PS_PROP_LT == null) ? (String)null : Sub1_PS_PROP_LT[0]) );
		struct.setList_Sub1_PS_PROP_LT(TypeConverter.convert(Sub1_PS_PROP_LT));
		struct.setSub1_PS_PROP_LOT_SIZE( ((Sub1_PS_PROP_LOT_SIZE == null) ? (String)null : Sub1_PS_PROP_LOT_SIZE[0]) );
		struct.setList_Sub1_PS_PROP_LOT_SIZE(TypeConverter.convert(Sub1_PS_PROP_LOT_SIZE));
		struct.setSub1_COST_UP_TYP( ((Sub1_COST_UP_TYP == null) ? (String)null : Sub1_COST_UP_TYP[0]) );
		struct.setList_Sub1_COST_UP_TYP(TypeConverter.convert(Sub1_COST_UP_TYP));
		struct.setSub1_COST_UP_TYP_name( ((Sub1_COST_UP_TYP_name == null) ? (String)null : Sub1_COST_UP_TYP_name[0]) );
		struct.setList_Sub1_COST_UP_TYP_name(TypeConverter.convert(Sub1_COST_UP_TYP_name));
		struct.setSub1_COST_UP_TYP_val( ((Sub1_COST_UP_TYP_val == null) ? (String)null : Sub1_COST_UP_TYP_val[0]) );
		struct.setList_Sub1_COST_UP_TYP_val(TypeConverter.convert(Sub1_COST_UP_TYP_val));
		struct.setSub1_MRP_EXP_TYP( ((Sub1_MRP_EXP_TYP == null) ? (String)null : Sub1_MRP_EXP_TYP[0]) );
		struct.setList_Sub1_MRP_EXP_TYP(TypeConverter.convert(Sub1_MRP_EXP_TYP));
		struct.setSub1_MRP_EXP_TYP_name( ((Sub1_MRP_EXP_TYP_name == null) ? (String)null : Sub1_MRP_EXP_TYP_name[0]) );
		struct.setList_Sub1_MRP_EXP_TYP_name(TypeConverter.convert(Sub1_MRP_EXP_TYP_name));
		struct.setSub1_MRP_EXP_TYP_val( ((Sub1_MRP_EXP_TYP_val == null) ? (String)null : Sub1_MRP_EXP_TYP_val[0]) );
		struct.setList_Sub1_MRP_EXP_TYP_val(TypeConverter.convert(Sub1_MRP_EXP_TYP_val));
		struct.seth_Target_ITEM_CD2( ((h_Target_ITEM_CD2 == null) ? (String)null : h_Target_ITEM_CD2[0]) );
		struct.setList_h_Target_ITEM_CD2(TypeConverter.convert(h_Target_ITEM_CD2));
		struct.seth_TargetDate2( ((h_TargetDate2 == null) ? (String)null : h_TargetDate2[0]) );
		struct.setList_h_TargetDate2(TypeConverter.convert(h_TargetDate2));
		struct.seth_DEVELOP_TYP2( ((h_DEVELOP_TYP2 == null) ? (String)null : h_DEVELOP_TYP2[0]) );
		struct.setList_h_DEVELOP_TYP2(TypeConverter.convert(h_DEVELOP_TYP2));
		struct.seth_InitLevel2( ((h_InitLevel2 == null) ? (String)null : h_InitLevel2[0]) );
		struct.setList_h_InitLevel2(TypeConverter.convert(h_InitLevel2));
		struct.setDet2ACPT_INSPC_TYP( ((Det2ACPT_INSPC_TYP == null) ? (String)null : Det2ACPT_INSPC_TYP[0]) );
		struct.setList_Det2ACPT_INSPC_TYP(TypeConverter.convert(Det2ACPT_INSPC_TYP));
		struct.seth_Sub2_MODIFY_COUNT( ((h_Sub2_MODIFY_COUNT == null) ? (String)null : h_Sub2_MODIFY_COUNT[0]) );
		struct.setList_h_Sub2_MODIFY_COUNT(TypeConverter.convert(h_Sub2_MODIFY_COUNT));
		struct.seth_Sub2_PROC_NO( ((h_Sub2_PROC_NO == null) ? (String)null : h_Sub2_PROC_NO[0]) );
		struct.setList_h_Sub2_PROC_NO(TypeConverter.convert(h_Sub2_PROC_NO));
		struct.setFIRST_PROC( ((FIRST_PROC == null) ? (String)null : FIRST_PROC[0]) );
		struct.setList_FIRST_PROC(TypeConverter.convert(FIRST_PROC));
		struct.seth_Sub1_PS_UNIT_NUMERATOR( ((h_Sub1_PS_UNIT_NUMERATOR == null) ? (String)null : h_Sub1_PS_UNIT_NUMERATOR[0]) );
		struct.setList_h_Sub1_PS_UNIT_NUMERATOR(TypeConverter.convert(h_Sub1_PS_UNIT_NUMERATOR));
		struct.seth_Sub1_PS_UNIT_DENOMINATOR( ((h_Sub1_PS_UNIT_DENOMINATOR == null) ? (String)null : h_Sub1_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_h_Sub1_PS_UNIT_DENOMINATOR(TypeConverter.convert(h_Sub1_PS_UNIT_DENOMINATOR));
		struct.setAA0180010tree1( ((AA0180010tree1 == null) ? (String)null : AA0180010tree1[0]) );
		struct.setList_AA0180010tree1(TypeConverter.convert(AA0180010tree1));
		struct.setsub2_STOCK_UNIT_1( ((sub2_STOCK_UNIT_1 == null) ? (String)null : sub2_STOCK_UNIT_1[0]) );
		struct.setList_sub2_STOCK_UNIT_1(TypeConverter.convert(sub2_STOCK_UNIT_1));
		struct.setsub2_STOCK_UNIT_2( ((sub2_STOCK_UNIT_2 == null) ? (String)null : sub2_STOCK_UNIT_2[0]) );
		struct.setList_sub2_STOCK_UNIT_2(TypeConverter.convert(sub2_STOCK_UNIT_2));
		struct.setsub2_STOCK_UNIT_3( ((sub2_STOCK_UNIT_3 == null) ? (String)null : sub2_STOCK_UNIT_3[0]) );
		struct.setList_sub2_STOCK_UNIT_3(TypeConverter.convert(sub2_STOCK_UNIT_3));
		struct.setDet2FIXED_LT_UNIT( ((Det2FIXED_LT_UNIT == null) ? (String)null : Det2FIXED_LT_UNIT[0]) );
		struct.setList_Det2FIXED_LT_UNIT(TypeConverter.convert(Det2FIXED_LT_UNIT));
		struct.setDet2PROP_LT_UNIT( ((Det2PROP_LT_UNIT == null) ? (String)null : Det2PROP_LT_UNIT[0]) );
		struct.setList_Det2PROP_LT_UNIT(TypeConverter.convert(Det2PROP_LT_UNIT));
		struct.setDet2PROP_LOT_SIZE_UNIT( ((Det2PROP_LOT_SIZE_UNIT == null) ? (String)null : Det2PROP_LOT_SIZE_UNIT[0]) );
		struct.setList_Det2PROP_LOT_SIZE_UNIT(TypeConverter.convert(Det2PROP_LOT_SIZE_UNIT));
		struct.setDet2SAFETY_LT_UNIT( ((Det2SAFETY_LT_UNIT == null) ? (String)null : Det2SAFETY_LT_UNIT[0]) );
		struct.setList_Det2SAFETY_LT_UNIT(TypeConverter.convert(Det2SAFETY_LT_UNIT));
		struct.setDet_MANHOUR_TYP( ((Det_MANHOUR_TYP == null) ? (String)null : Det_MANHOUR_TYP[0]) );
		struct.setList_Det_MANHOUR_TYP(TypeConverter.convert(Det_MANHOUR_TYP));
		struct.setLower_MANHOUR_TYP( ((Lower_MANHOUR_TYP == null) ? (String)null : Lower_MANHOUR_TYP[0]) );
		struct.setList_Lower_MANHOUR_TYP(TypeConverter.convert(Lower_MANHOUR_TYP));
		struct.setMANHOUR_TYP( ((MANHOUR_TYP == null) ? (String)null : MANHOUR_TYP[0]) );
		struct.setList_MANHOUR_TYP(TypeConverter.convert(MANHOUR_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0180010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAA0180010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAA0180010Struct";   // JSP先のバインド名(Struct)の指定
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
					AA0180010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0180010Entity entity = control.entity;
		AA0180010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0180010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0180010Control control;
		AA0180010Entity  entity = null;
		AA0180010Struct  struct = null;

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

			if( (control = (AA0180010Control)so.getAttribute("AA0180010Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0180010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0180010Control();
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
				} else if( isClick(request, "FlashTree") ) {
					if ( !isCryptical(request, so, params, "FlashTree") ) return ERROR_TARGET;
					target = onClickFlashTree(request, response, so, params, control);
					control.setButton("FlashTree");
				} else if( isClick(request, "LineInsert") ) {
					if ( !isCryptical(request, so, params, "LineInsert") ) return ERROR_TARGET;
					target = onClickLineInsert(request, response, so, params, control);
					control.setButton("LineInsert");
				} else if( isClick(request, "LineUpdate") ) {
					if ( !isCryptical(request, so, params, "LineUpdate") ) return ERROR_TARGET;
					target = onClickLineUpdate(request, response, so, params, control);
					control.setButton("LineUpdate");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "DeleteAll") ) {
					if ( !isCryptical(request, so, params, "DeleteAll") ) return ERROR_TARGET;
					target = onClickDeleteAll(request, response, so, params, control);
					control.setButton("DeleteAll");
				} else if( isClick(request, "ShowS_Tree") ) {
					if ( !isCryptical(request, so, params, "ShowS_Tree") ) return ERROR_TARGET;
					target = onClickShowS_Tree(request, response, so, params, control);
					control.setButton("ShowS_Tree");
				} else if( isClick(request, "ShowR_Tree") ) {
					if ( !isCryptical(request, so, params, "ShowR_Tree") ) return ERROR_TARGET;
					target = onClickShowR_Tree(request, response, so, params, control);
					control.setButton("ShowR_Tree");
				} else if( isClick(request, "AddTree") ) {
					if ( !isCryptical(request, so, params, "AddTree") ) return ERROR_TARGET;
					target = onClickAddTree(request, response, so, params, control);
					control.setButton("AddTree");
				} else if( isClick(request, "ShowDetail") ) {
					if ( !isCryptical(request, so, params, "ShowDetail") ) return ERROR_TARGET;
					target = onClickShowDetail(request, response, so, params, control);
					control.setButton("ShowDetail");
				} else if( isClick(request, "Sub1Insert") ) {
					if ( !isCryptical(request, so, params, "Sub1Insert") ) return ERROR_TARGET;
					target = onClickSub1Insert(request, response, so, params, control);
					control.setButton("Sub1Insert");
				} else if( isClick(request, "Sub1Update") ) {
					if ( !isCryptical(request, so, params, "Sub1Update") ) return ERROR_TARGET;
					target = onClickSub1Update(request, response, so, params, control);
					control.setButton("Sub1Update");
				} else if( isClick(request, "Sub1Return") ) {
					if ( !isCryptical(request, so, params, "Sub1Return") ) return ERROR_TARGET;
					target = onClickSub1Return(request, response, so, params, control);
					control.setButton("Sub1Return");
				} else if( isClick(request, "ShowDetail2") ) {
					if ( !isCryptical(request, so, params, "ShowDetail2") ) return ERROR_TARGET;
					target = onClickShowDetail2(request, response, so, params, control);
					control.setButton("ShowDetail2");
				} else if( isClick(request, "LineInsertProc") ) {
					if ( !isCryptical(request, so, params, "LineInsertProc") ) return ERROR_TARGET;
					target = onClickLineInsertProc(request, response, so, params, control);
					control.setButton("LineInsertProc");
				} else if( isClick(request, "LineUpdateProc") ) {
					if ( !isCryptical(request, so, params, "LineUpdateProc") ) return ERROR_TARGET;
					target = onClickLineUpdateProc(request, response, so, params, control);
					control.setButton("LineUpdateProc");
				} else if( isClick(request, "Sub2insert") ) {
					if ( !isCryptical(request, so, params, "Sub2insert") ) return ERROR_TARGET;
					target = onClickSub2insert(request, response, so, params, control);
					control.setButton("Sub2insert");
				} else if( isClick(request, "Sub2update") ) {
					if ( !isCryptical(request, so, params, "Sub2update") ) return ERROR_TARGET;
					target = onClickSub2update(request, response, so, params, control);
					control.setButton("Sub2update");
				} else if( isClick(request, "Sub2Return") ) {
					if ( !isCryptical(request, so, params, "Sub2Return") ) return ERROR_TARGET;
					target = onClickSub2Return(request, response, so, params, control);
					control.setButton("Sub2Return");
				} else if( isClick(request, "Sub1Delete") ) {
					if ( !isCryptical(request, so, params, "Sub1Delete") ) return ERROR_TARGET;
					target = onClickSub1Delete(request, response, so, params, control);
					control.setButton("Sub1Delete");
				} else if( isClick(request, "Sub2delete") ) {
					if ( !isCryptical(request, so, params, "Sub2delete") ) return ERROR_TARGET;
					target = onClickSub2delete(request, response, so, params, control);
					control.setButton("Sub2delete");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0180010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
                                 // TODO: ユーザ定義のコードを記述してください
                                 ////! 渡されたパラメタをすべて出力するDEBUG用コード
                                 //System.out.println("--------------------------------");
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
                                 //System.out.println("--------------------------------");
                                 ////! 設定されたStruct変数を出力するDEBUG用コード
                                 //struct = control.struct;
                                 //if (struct.getLower_ITEM_NAME() != null) { System.out.println("              Lower_ITEM_NAME: " + struct.getLower_ITEM_NAME()); }
                                 //if (struct.getLower_ITEM_CD() != null) { System.out.println("                Lower_ITEM_CD: " + struct.getLower_ITEM_CD()); }
                                 //if (struct.getUpper_ITEM_NAME() != null) { System.out.println("              Upper_ITEM_NAME: " + struct.getUpper_ITEM_NAME()); }
                                 //if (struct.getUpper_ITEM_CD() != null) { System.out.println("                Upper_ITEM_CD: " + struct.getUpper_ITEM_CD()); }
                                 //if (struct.getDetParent_ITEM_CD() != null) { System.out.println("            DetParent_ITEM_CD: " + struct.getDetParent_ITEM_CD()); }
                                 //if (struct.getDetParent_ITEM_NAME() != null) { System.out.println("          DetParent_ITEM_NAME: " + struct.getDetParent_ITEM_NAME()); }
                                 //if (struct.getDetParent_MRP_ODR_TYP() != null) { System.out.println("        DetParent_MRP_ODR_TYP: " + struct.getDetParent_MRP_ODR_TYP()); }
                                 //if (struct.getDetParent_OUTSIDE_TYP() != null) { System.out.println("        DetParent_OUTSIDE_TYP: " + struct.getDetParent_OUTSIDE_TYP()); }
                                 //if (struct.getDetComp_ITEM_CD() != null) { System.out.println("              DetComp_ITEM_CD: " + struct.getDetComp_ITEM_CD()); }
                                 //if (struct.getDetComp_ITEM_NAME() != null) { System.out.println("            DetComp_ITEM_NAME: " + struct.getDetComp_ITEM_NAME()); }
                                 //if (struct.getDetComp_MRP_ODR_TYP() != null) { System.out.println("          DetComp_MRP_ODR_TYP: " + struct.getDetComp_MRP_ODR_TYP()); }
                                 //if (struct.getDetComp_OUTSIDE_TYP() != null) { System.out.println("          DetComp_OUTSIDE_TYP: " + struct.getDetComp_OUTSIDE_TYP()); }
                                 //if (struct.getDet_PS_EDITION() != null) { System.out.println("               Det_PS_EDITION: " + struct.getDet_PS_EDITION()); }
                                 //if (struct.getDet_PS_UNIT_QTY() != null) { System.out.println("              Det_PS_UNIT_QTY: " + struct.getDet_PS_UNIT_QTY()); }
                                 //if (struct.getDet_STOCK_UNIT() != null) { System.out.println("               Det_STOCK_UNIT: " + struct.getDet_STOCK_UNIT()); }
                                 //if (struct.getDet_EFF_PHASE_IN_DATE() != null) { System.out.println("        Det_EFF_PHASE_IN_DATE: " + struct.getDet_EFF_PHASE_IN_DATE()); }
                                 //if (struct.getDet_EFF_PHASE_OUT_DATE() != null) { System.out.println("       Det_EFF_PHASE_OUT_DATE: " + struct.getDet_EFF_PHASE_OUT_DATE()); }
                                 //if (struct.getDet_PS_SPOIL() != null) { System.out.println("                 Det_PS_SPOIL: " + struct.getDet_PS_SPOIL()); }
                                 //if (struct.getDet_CONS_TYP() != null) { System.out.println("                 Det_CONS_TYP: " + struct.getDet_CONS_TYP()); }
                                 //if (struct.getDet_PS_LT_FLG() != null) { System.out.println("                Det_PS_LT_FLG: " + struct.getDet_PS_LT_FLG()); }
                                 //if (struct.getDet_PS_FIXED_LT() != null) { System.out.println("              Det_PS_FIXED_LT: " + struct.getDet_PS_FIXED_LT()); }
                                 //if (struct.getDet_PS_PROP_LT() != null) { System.out.println("               Det_PS_PROP_LT: " + struct.getDet_PS_PROP_LT()); }
                                 //if (struct.getDet_PS_PROP_LOT_SIZE() != null) { System.out.println("         Det_PS_PROP_LOT_SIZE: " + struct.getDet_PS_PROP_LOT_SIZE()); }
                                 //if (struct.getDet_PS_REF_NO() != null) { System.out.println("                Det_PS_REF_NO: " + struct.getDet_PS_REF_NO()); }
                                 //if (struct.getDet_COST_UP_TYP() != null) { System.out.println("              Det_COST_UP_TYP: " + struct.getDet_COST_UP_TYP()); }
                                 //if (struct.getDet_MRP_EXP_TYP() != null) { System.out.println("              Det_MRP_EXP_TYP: " + struct.getDet_MRP_EXP_TYP()); }
                                 //if (struct.getPS_EDITION() != null) { System.out.println("                   PS_EDITION: " + struct.getPS_EDITION()); }
                                 //if (struct.getSub1Parent_ITEM_NAME() != null) { System.out.println("         Sub1Parent_ITEM_NAME: " + struct.getSub1Parent_ITEM_NAME()); }
                                 //if (struct.getSub1Comp_ITEM_NAME() != null) { System.out.println("           Sub1Comp_ITEM_NAME: " + struct.getSub1Comp_ITEM_NAME()); }
                                 //if (struct.getSub1_PS_UNIT_NUMERATOR() != null) { System.out.println("       Sub1_PS_UNIT_NUMERATOR: " + struct.getSub1_PS_UNIT_NUMERATOR()); }
                                 //if (struct.getSub1_PS_UNIT_DENOMINATOR() != null) { System.out.println("     Sub1_PS_UNIT_DENOMINATOR: " + struct.getSub1_PS_UNIT_DENOMINATOR()); }
                                 //if (struct.getSub1_STOCK_UNIT() != null) { System.out.println("              Sub1_STOCK_UNIT: " + struct.getSub1_STOCK_UNIT()); }
                                 //if (struct.getSub1_EFF_PHASE_IN_DATE() != null) { System.out.println("       Sub1_EFF_PHASE_IN_DATE: " + struct.getSub1_EFF_PHASE_IN_DATE()); }
                                 //if (struct.getSub1_EFF_PHASE_OUT_DATE() != null) { System.out.println("      Sub1_EFF_PHASE_OUT_DATE: " + struct.getSub1_EFF_PHASE_OUT_DATE()); }
                                 //if (struct.getSub1_PS_SPOIL() != null) { System.out.println("                Sub1_PS_SPOIL: " + struct.getSub1_PS_SPOIL()); }
                                 //if (struct.getSub1_CONS_TYP() != null) { System.out.println("                Sub1_CONS_TYP: " + struct.getSub1_CONS_TYP()); }
                                 //if (struct.geth_Sub1_PS_LT_FLG() != null) { System.out.println("             h_Sub1_PS_LT_FLG: " + struct.geth_Sub1_PS_LT_FLG()); }
                                 //if (struct.getSub1_PS_FIXED_LT() != null) { System.out.println("             Sub1_PS_FIXED_LT: " + struct.getSub1_PS_FIXED_LT()); }
                                 //if (struct.getSub1_PS_PROP_LT() != null) { System.out.println("              Sub1_PS_PROP_LT: " + struct.getSub1_PS_PROP_LT()); }
                                 //if (struct.getSub1_PS_PROP_LOT_SIZE() != null) { System.out.println("        Sub1_PS_PROP_LOT_SIZE: " + struct.getSub1_PS_PROP_LOT_SIZE()); }
                                 //if (struct.getSub1_PS_REF_NO() != null) { System.out.println("               Sub1_PS_REF_NO: " + struct.getSub1_PS_REF_NO()); }
                                 //if (struct.getSub1_COST_UP_TYP() != null) { System.out.println("             Sub1_COST_UP_TYP: " + struct.getSub1_COST_UP_TYP()); }
                                 //if (struct.getSub1_MRP_EXP_TYP() != null) { System.out.println("             Sub1_MRP_EXP_TYP: " + struct.getSub1_MRP_EXP_TYP()); }
                                 //if (struct.geth_Sub1_MODIFY_COUNT() != null) { System.out.println("          h_Sub1_MODIFY_COUNT: " + struct.geth_Sub1_MODIFY_COUNT()); }
                                 //if (struct.getSub1Parent_ITEM_CD() != null) { System.out.println("           Sub1Parent_ITEM_CD: " + struct.getSub1Parent_ITEM_CD()); }
                                 //if (struct.getSub1Comp_ITEM_CD() != null) { System.out.println("             Sub1Comp_ITEM_CD: " + struct.getSub1Comp_ITEM_CD()); }
                                 //if (struct.getSub1_PS_EDITION() != null) { System.out.println("              Sub1_PS_EDITION: " + struct.getSub1_PS_EDITION()); }
                                 //if (struct.getTarget_ITEM_CD() != null) { System.out.println("               Target_ITEM_CD: " + struct.getTarget_ITEM_CD()); }
                                 //if (struct.getDEVELOP_TYP() != null) { System.out.println("                  DEVELOP_TYP: " + struct.getDEVELOP_TYP()); }
                                 //if (struct.getInitLevel() != null) { System.out.println("                    InitLevel: " + struct.getInitLevel()); }
                                 //if (struct.getAA0180010tree1() != null) { System.out.println("               AA0180010tree1: " + struct.getAA0180010tree1()); }
                                 //if (struct.getid() != null) { System.out.println("                           id: " + struct.getid()); }
                                 //if (struct.getlvl() != null) { System.out.println("                          lvl: " + struct.getlvl()); }
                                 //if (struct.getparent() != null) { System.out.println("                       parent: " + struct.getparent()); }
                                 //if (struct.getlabel() != null) { System.out.println("                        label: " + struct.getlabel()); }
                                 //if (struct.getctx() != null) { System.out.println("                          ctx: " + struct.getctx()); }
                                 //if (struct.getmaxid() != null) { System.out.println("                        maxid: " + struct.getmaxid()); }
                                 //if (struct.getMODIFY_COUNT() != null) { System.out.println("                 MODIFY_COUNT: " + struct.getMODIFY_COUNT()); }
                                 //if (struct.getTargetDate() != null) { System.out.println("                   TargetDate: " + struct.getTargetDate()); }
                                 //if (struct.getEFF_PHASE_IN_DATE() != null) { System.out.println("            EFF_PHASE_IN_DATE: " + struct.getEFF_PHASE_IN_DATE()); }
                                 //if (struct.getEFF_PHASE_OUT_DATE() != null) { System.out.println("           EFF_PHASE_OUT_DATE: " + struct.getEFF_PHASE_OUT_DATE()); }
                                 //if (struct.geth_Sub1Parent_ITEM_CD() != null) { System.out.println("         h_Sub1Parent_ITEM_CD: " + struct.geth_Sub1Parent_ITEM_CD()); }
                                 //if (struct.geth_Sub1Comp_ITEM_CD() != null) { System.out.println("           h_Sub1Comp_ITEM_CD: " + struct.geth_Sub1Comp_ITEM_CD()); }
                                 //if (struct.geth_Target_ITEM_CD() != null) { System.out.println("             h_Target_ITEM_CD: " + struct.geth_Target_ITEM_CD()); }
                                 //if (struct.geth_TargetDate() != null) { System.out.println("                 h_TargetDate: " + struct.geth_TargetDate()); }
                                 //if (struct.geth_DEVELOP_TYP() != null) { System.out.println("                h_DEVELOP_TYP: " + struct.geth_DEVELOP_TYP()); }
                                 //if (struct.geth_InitLevel() != null) { System.out.println("                  h_InitLevel: " + struct.geth_InitLevel()); }
                                 //if (struct.geth_Sub1_PS_EDITION() != null) { System.out.println("            h_Sub1_PS_EDITION: " + struct.geth_Sub1_PS_EDITION()); }
                                 //if (struct.getDEVELOP_TYP_name() != null) { System.out.println("             DEVELOP_TYP_name: " + struct.getDEVELOP_TYP_name()); }
                                 //if (struct.getDEVELOP_TYP_val() != null) { System.out.println("              DEVELOP_TYP_val: " + struct.getDEVELOP_TYP_val()); }
                                 //if (struct.getSub1_CONS_TYP_name() != null) { System.out.println("           Sub1_CONS_TYP_name: " + struct.getSub1_CONS_TYP_name()); }
                                 //if (struct.getSub1_CONS_TYP_val() != null) { System.out.println("            Sub1_CONS_TYP_val: " + struct.getSub1_CONS_TYP_val()); }
                                 //if (struct.getc_Sub1_PS_LT_FLG() != null) { System.out.println("             c_Sub1_PS_LT_FLG: " + struct.getc_Sub1_PS_LT_FLG()); }
                                 //if (struct.getSub1_COST_UP_TYP_name() != null) { System.out.println("        Sub1_COST_UP_TYP_name: " + struct.getSub1_COST_UP_TYP_name()); }
                                 //if (struct.getSub1_COST_UP_TYP_val() != null) { System.out.println("         Sub1_COST_UP_TYP_val: " + struct.getSub1_COST_UP_TYP_val()); }
                                 //if (struct.getSub1_MRP_EXP_TYP_name() != null) { System.out.println("        Sub1_MRP_EXP_TYP_name: " + struct.getSub1_MRP_EXP_TYP_name()); }
                                 //if (struct.getSub1_MRP_EXP_TYP_val() != null) { System.out.println("         Sub1_MRP_EXP_TYP_val: " + struct.getSub1_MRP_EXP_TYP_val()); }
                                 //if (struct.geth_ProcTyp() != null) { System.out.println("                    h_ProcTyp: " + struct.geth_ProcTyp()); }
                                 //if (struct.geth_MaxLevel() != null) { System.out.println("                   h_MaxLevel: " + struct.geth_MaxLevel()); }
                                 //System.out.println("--------------------------------");
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
				|| (isClick(request, "FlashTree") && bFLG_DISCONNECT_FlashTree)
				|| (isClick(request, "LineInsert") && bFLG_DISCONNECT_LineInsert)
				|| (isClick(request, "LineUpdate") && bFLG_DISCONNECT_LineUpdate)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "DeleteAll") && bFLG_DISCONNECT_DeleteAll)
				|| (isClick(request, "ShowS_Tree") && bFLG_DISCONNECT_ShowS_Tree)
				|| (isClick(request, "ShowR_Tree") && bFLG_DISCONNECT_ShowR_Tree)
				|| (isClick(request, "AddTree") && bFLG_DISCONNECT_AddTree)
				|| (isClick(request, "ShowDetail") && bFLG_DISCONNECT_ShowDetail)
				|| (isClick(request, "Sub1Insert") && bFLG_DISCONNECT_Sub1Insert)
				|| (isClick(request, "Sub1Update") && bFLG_DISCONNECT_Sub1Update)
				|| (isClick(request, "Sub1Return") && bFLG_DISCONNECT_Sub1Return)
				|| (isClick(request, "ShowDetail2") && bFLG_DISCONNECT_ShowDetail2)
				|| (isClick(request, "LineInsertProc") && bFLG_DISCONNECT_LineInsertProc)
				|| (isClick(request, "LineUpdateProc") && bFLG_DISCONNECT_LineUpdateProc)
				|| (isClick(request, "Sub2insert") && bFLG_DISCONNECT_Sub2insert)
				|| (isClick(request, "Sub2update") && bFLG_DISCONNECT_Sub2update)
				|| (isClick(request, "Sub2Return") && bFLG_DISCONNECT_Sub2Return)
				|| (isClick(request, "Sub1Delete") && bFLG_DISCONNECT_Sub1Delete)
				|| (isClick(request, "Sub2delete") && bFLG_DISCONNECT_Sub2delete)
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
	private  static boolean bFLG_DISCONNECT_FlashTree = true;
	private  static boolean bFLG_DISCONNECT_LineInsert = true;
	private  static boolean bFLG_DISCONNECT_LineUpdate = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_DeleteAll = true;
	private  static boolean bFLG_DISCONNECT_ShowS_Tree = true;
	private  static boolean bFLG_DISCONNECT_ShowR_Tree = true;
	private  static boolean bFLG_DISCONNECT_AddTree = true;
	private  static boolean bFLG_DISCONNECT_ShowDetail = true;
	private  static boolean bFLG_DISCONNECT_Sub1Insert = true;
	private  static boolean bFLG_DISCONNECT_Sub1Update = true;
	private  static boolean bFLG_DISCONNECT_Sub1Return = true;
	private  static boolean bFLG_DISCONNECT_ShowDetail2 = true;
	private  static boolean bFLG_DISCONNECT_LineInsertProc = true;
	private  static boolean bFLG_DISCONNECT_LineUpdateProc = true;
	private  static boolean bFLG_DISCONNECT_Sub2insert = true;
	private  static boolean bFLG_DISCONNECT_Sub2update = true;
	private  static boolean bFLG_DISCONNECT_Sub2Return = true;
	private  static boolean bFLG_DISCONNECT_Sub1Delete = true;
	private  static boolean bFLG_DISCONNECT_Sub2delete = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0180.AA0180010Servlet";
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
	public AA0180010Servlet()
	{
		//{{user_implement_dev:<AA0180010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_Select = true;
                bFLG_DISCONNECT_FlashTree = true;
                bFLG_DISCONNECT_LineInsert = true;
                bFLG_DISCONNECT_LineUpdate = true;
                bFLG_DISCONNECT_Clear = true;
                bFLG_DISCONNECT_Close = true;
              
                //}}user_implement_dev:<AA0180010_DisConnect_FLG>

		//{{user_implement_dev:<AA0180010Servlet>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AA0180010Servlet>
	}

	//////////////////////////////

}
