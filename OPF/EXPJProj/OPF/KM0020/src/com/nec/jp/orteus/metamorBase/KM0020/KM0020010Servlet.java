/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0020/src/com/nec/jp/orteus/metamorBase/KM0020/KM0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0020;

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
/**
 * CLASS     : KM0020010Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0020010Servlet extends HttpServlet
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
	 * @param control KM0020010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, KM0020010Control control)
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
		String[] PROJECT_CD = (String[]) params.get("PROJECT_CD");
		control.settProjectCd((PROJECT_CD == null) ? null : PROJECT_CD[0]);
		
		String[] ESTIMATE_NO = (String[]) params.get("ESTIMATE_NO");
		control.setEstimateNo((ESTIMATE_NO == null) ? null : ESTIMATE_NO[0]);
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, KM0020010Control control)
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
	 * @param control KM0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
			logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "KM0020010"+" $Revision: 1.4 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			// TODO: ユーザ定義のコードを記述してください
			control.control_eventHandller("reload");
			if(control.isScreenMove()) {
                control.control_eventHandller("select");
                nextUrl = "/KM0020010.jsp";
            }
		} catch ( FoundationException e ) {
//			e.printStackTrace();
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0020010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 明細合計ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickTotal(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickTotal");
		//{{user_implement_dev:<onClickTotal>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Total");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickTotal>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickTotal");

		return nextUrl;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickappend(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");
		//{{user_implement_dev:<onClickappend>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("append");
			// 子画面に遷移
			if(control.getMessage().sizeError() <= 0){
	             nextUrl = "/KM0020011.jsp";
	        }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickappend>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("modify");
			// 子画面に遷移
            nextUrl = "/KM0020011.jsp";
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickerase(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickerase");
		//{{user_implement_dev:<onClickerase>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("erase");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickerase>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickerase");

		return nextUrl;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickprint(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickprint");
		//{{user_implement_dev:<onClickprint>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("print");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickprint>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickprint");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("update");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("delete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClose>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickSelectUnitCost(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/KM0020011.jsp";		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");
		//{{user_implement_dev:<onClickSelectUnitCost>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("SelectUnitCost");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectUnitCost>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");

		return nextUrl;
	}

	/**
	 * 邦貨換算ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickLcConversion(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/KM0020011.jsp";		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickLcConversion");
		//{{user_implement_dev:<onClickLcConversion>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("LcConversion");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLcConversion>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickLcConversion");

		return nextUrl;
	}

	/**
	 * 追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
		//{{user_implement_dev:<onClickinsertSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("insertSub1");
			// エラー発生の場合、子画面に遷移
            if(control.getMessage().sizeError() > 0){
             nextUrl = "/KM0020011.jsp";
            }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * 修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickupdateSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");
		//{{user_implement_dev:<onClickupdateSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("updateSub1");
			// エラー発生の場合、子画面に遷移
            if(control.getMessage().sizeError() > 0){
             nextUrl = "/KM0020011.jsp";
            }
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdateSub1>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickcancelSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");
		//{{user_implement_dev:<onClickcancelSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("cancelSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcancelSub1>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");

		return nextUrl;
	}

	/**
	 * 引用読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickQ_Select(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickQ_Select");
		//{{user_implement_dev:<onClickQ_Select>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Q_Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickQ_Select>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickQ_Select");

		return nextUrl;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0020010Controlクラスインスタンス
	 */
	public String onClickcopy(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcopy");
		//{{user_implement_dev:<onClickcopy>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("copy");
			// 子画面に遷移
			if(control.getMessage().sizeError() <= 0){
				nextUrl = "/KM0020011.jsp";
			}
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcopy>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcopy");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] ESTIMATE_NO = ((params.containsKey("ESTIMATE_NO")) ? (String[])params.get("ESTIMATE_NO") : (String[])null);
		String[] ESTIMATE_STAT = ((params.containsKey("ESTIMATE_STAT")) ? (String[])params.get("ESTIMATE_STAT") : (String[])null);
		String[] ES_COMMET1 = ((params.containsKey("ES_COMMET1")) ? (String[])params.get("ES_COMMET1") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] ES_COMMET2 = ((params.containsKey("ES_COMMET2")) ? (String[])params.get("ES_COMMET2") : (String[])null);
		String[] ESTIMATE_DATE = ((params.containsKey("ESTIMATE_DATE")) ? (String[])params.get("ESTIMATE_DATE") : (String[])null);
		String[] ES_COMMET4 = ((params.containsKey("ES_COMMET4")) ? (String[])params.get("ES_COMMET4") : (String[])null);
		String[] ESTIMATE_AMOUNT = ((params.containsKey("ESTIMATE_AMOUNT")) ? (String[])params.get("ESTIMATE_AMOUNT") : (String[])null);
		String[] CUR_UNIT = ((params.containsKey("CUR_UNIT")) ? (String[])params.get("CUR_UNIT") : (String[])null);
		String[] ES_COMMET3 = ((params.containsKey("ES_COMMET3")) ? (String[])params.get("ES_COMMET3") : (String[])null);
		String[] ESTIMATE_AMOUNT_JPN = ((params.containsKey("ESTIMATE_AMOUNT_JPN")) ? (String[])params.get("ESTIMATE_AMOUNT_JPN") : (String[])null);
		String[] ES_COMMET5 = ((params.containsKey("ES_COMMET5")) ? (String[])params.get("ES_COMMET5") : (String[])null);
		String[] ES_USER_CD = ((params.containsKey("ES_USER_CD")) ? (String[])params.get("ES_USER_CD") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] ES_ORG_CD = ((params.containsKey("ES_ORG_CD")) ? (String[])params.get("ES_ORG_CD") : (String[])null);
		String[] ORG_NAME = ((params.containsKey("ORG_NAME")) ? (String[])params.get("ORG_NAME") : (String[])null);
		String[] ZIP_CD = ((params.containsKey("ZIP_CD")) ? (String[])params.get("ZIP_CD") : (String[])null);
		String[] TEL = ((params.containsKey("TEL")) ? (String[])params.get("TEL") : (String[])null);
		String[] ADDRESS_1 = ((params.containsKey("ADDRESS_1")) ? (String[])params.get("ADDRESS_1") : (String[])null);
		String[] ESREMARK1 = ((params.containsKey("ESREMARK1")) ? (String[])params.get("ESREMARK1") : (String[])null);
		String[] ESREMARK2 = ((params.containsKey("ESREMARK2")) ? (String[])params.get("ESREMARK2") : (String[])null);
		String[] ESREMARK3 = ((params.containsKey("ESREMARK3")) ? (String[])params.get("ESREMARK3") : (String[])null);
		String[] l_DETAL_NO = ((params.containsKey("l_DETAL_NO")) ? (String[])params.get("l_DETAL_NO") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_DESINATED_DLV_DATE = ((params.containsKey("l_DESINATED_DLV_DATE")) ? (String[])params.get("l_DESINATED_DLV_DATE") : (String[])null);
		String[] l_ESTIMATE_QTY = ((params.containsKey("l_ESTIMATE_QTY")) ? (String[])params.get("l_ESTIMATE_QTY") : (String[])null);
		String[] l_UNIT_CD = ((params.containsKey("l_UNIT_CD")) ? (String[])params.get("l_UNIT_CD") : (String[])null);
		String[] l_UNIT_PRICE = ((params.containsKey("l_UNIT_PRICE")) ? (String[])params.get("l_UNIT_PRICE") : (String[])null);
		String[] l_DISCOUNT_PRICE = ((params.containsKey("l_DISCOUNT_PRICE")) ? (String[])params.get("l_DISCOUNT_PRICE") : (String[])null);
		String[] l_ESTIMATE_UNIT_PRICE = ((params.containsKey("l_ESTIMATE_UNIT_PRICE")) ? (String[])params.get("l_ESTIMATE_UNIT_PRICE") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] l_AMOUNT = ((params.containsKey("l_AMOUNT")) ? (String[])params.get("l_AMOUNT") : (String[])null);
		String[] l_DISCOUNT_AMOUNT = ((params.containsKey("l_DISCOUNT_AMOUNT")) ? (String[])params.get("l_DISCOUNT_AMOUNT") : (String[])null);
		String[] l_ESTIMATE_AMOUNT = ((params.containsKey("l_ESTIMATE_AMOUNT")) ? (String[])params.get("l_ESTIMATE_AMOUNT") : (String[])null);
		String[] l_ESTIMATE_AMOUNT_JPN = ((params.containsKey("l_ESTIMATE_AMOUNT_JPN")) ? (String[])params.get("l_ESTIMATE_AMOUNT_JPN") : (String[])null);
		String[] l_ES_COST_ALL = ((params.containsKey("l_ES_COST_ALL")) ? (String[])params.get("l_ES_COST_ALL") : (String[])null);
		String[] l_ESTIMATE_GAIN = ((params.containsKey("l_ESTIMATE_GAIN")) ? (String[])params.get("l_ESTIMATE_GAIN") : (String[])null);
		String[] l_ES_COST_MATERIAL = ((params.containsKey("l_ES_COST_MATERIAL")) ? (String[])params.get("l_ES_COST_MATERIAL") : (String[])null);
		String[] l_ES_COST_PROCESS = ((params.containsKey("l_ES_COST_PROCESS")) ? (String[])params.get("l_ES_COST_PROCESS") : (String[])null);
		String[] l_ES_COST_OUTSOUCE = ((params.containsKey("l_ES_COST_OUTSOUCE")) ? (String[])params.get("l_ES_COST_OUTSOUCE") : (String[])null);
		String[] l_ES_COST_ETC = ((params.containsKey("l_ES_COST_ETC")) ? (String[])params.get("l_ES_COST_ETC") : (String[])null);
		String[] l_ES_COST_SERVICE = ((params.containsKey("l_ES_COST_SERVICE")) ? (String[])params.get("l_ES_COST_SERVICE") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] h_MAX_DETAL_NO = ((params.containsKey("h_MAX_DETAL_NO")) ? (String[])params.get("h_MAX_DETAL_NO") : (String[])null);
		String[] l_FLAG = ((params.containsKey("l_FLAG")) ? (String[])params.get("l_FLAG") : (String[])null);
		String[] QUOTE_PROJECT_CD = ((params.containsKey("QUOTE_PROJECT_CD")) ? (String[])params.get("QUOTE_PROJECT_CD") : (String[])null);
		String[] QUOTE_ESTIMATE_NO = ((params.containsKey("QUOTE_ESTIMATE_NO")) ? (String[])params.get("QUOTE_ESTIMATE_NO") : (String[])null);
		String[] h_CUST_CD = ((params.containsKey("h_CUST_CD")) ? (String[])params.get("h_CUST_CD") : (String[])null);
		String[] h_CUR_CD = ((params.containsKey("h_CUR_CD")) ? (String[])params.get("h_CUR_CD") : (String[])null);
		String[] ADDRESS_2 = ((params.containsKey("ADDRESS_2")) ? (String[])params.get("ADDRESS_2") : (String[])null);
		String[] l_CUST_ITEM_CD = ((params.containsKey("l_CUST_ITEM_CD")) ? (String[])params.get("l_CUST_ITEM_CD") : (String[])null);
		String[] l_UNIT_COST = ((params.containsKey("l_UNIT_COST")) ? (String[])params.get("l_UNIT_COST") : (String[])null);
		String[] l_CUST_ITEM_NAME = ((params.containsKey("l_CUST_ITEM_NAME")) ? (String[])params.get("l_CUST_ITEM_NAME") : (String[])null);
		String[] l_SPEC_CLASS1_TYP = ((params.containsKey("l_SPEC_CLASS1_TYP")) ? (String[])params.get("l_SPEC_CLASS1_TYP") : (String[])null);
		String[] l_SPEC_CLASS2_TYP = ((params.containsKey("l_SPEC_CLASS2_TYP")) ? (String[])params.get("l_SPEC_CLASS2_TYP") : (String[])null);
		String[] l_SPEC_SELECT1_TYP = ((params.containsKey("l_SPEC_SELECT1_TYP")) ? (String[])params.get("l_SPEC_SELECT1_TYP") : (String[])null);
		String[] l_SPEC_SELECT2_TYP = ((params.containsKey("l_SPEC_SELECT2_TYP")) ? (String[])params.get("l_SPEC_SELECT2_TYP") : (String[])null);
		String[] l_SPEC_SELECT3_TYP = ((params.containsKey("l_SPEC_SELECT3_TYP")) ? (String[])params.get("l_SPEC_SELECT3_TYP") : (String[])null);
		String[] l_SPEC_SELECT4_TYP = ((params.containsKey("l_SPEC_SELECT4_TYP")) ? (String[])params.get("l_SPEC_SELECT4_TYP") : (String[])null);
		String[] l_ESTIMATE_TYP = ((params.containsKey("l_ESTIMATE_TYP")) ? (String[])params.get("l_ESTIMATE_TYP") : (String[])null);
		String[] l_ESTIMATE_NAME = ((params.containsKey("l_ESTIMATE_NAME")) ? (String[])params.get("l_ESTIMATE_NAME") : (String[])null);
		String[] l_SPEC_CLASS1_NAME = ((params.containsKey("l_SPEC_CLASS1_NAME")) ? (String[])params.get("l_SPEC_CLASS1_NAME") : (String[])null);
		String[] l_SPEC_CLASS2_NAME = ((params.containsKey("l_SPEC_CLASS2_NAME")) ? (String[])params.get("l_SPEC_CLASS2_NAME") : (String[])null);
		String[] l_SPEC_SELECT1_NAME = ((params.containsKey("l_SPEC_SELECT1_NAME")) ? (String[])params.get("l_SPEC_SELECT1_NAME") : (String[])null);
		String[] l_SPEC_SELECT2_NAME = ((params.containsKey("l_SPEC_SELECT2_NAME")) ? (String[])params.get("l_SPEC_SELECT2_NAME") : (String[])null);
		String[] l_SPEC_SELECT3_NAME = ((params.containsKey("l_SPEC_SELECT3_NAME")) ? (String[])params.get("l_SPEC_SELECT3_NAME") : (String[])null);
		String[] l_SPEC_SELECT4_NAME = ((params.containsKey("l_SPEC_SELECT4_NAME")) ? (String[])params.get("l_SPEC_SELECT4_NAME") : (String[])null);
		String[] l_ESTIMATE_TYP_name = ((params.containsKey("l_ESTIMATE_TYP_name")) ? (String[])params.get("l_ESTIMATE_TYP_name") : (String[])null);
		String[] l_ESTIMATE_TYP_val = ((params.containsKey("l_ESTIMATE_TYP_val")) ? (String[])params.get("l_ESTIMATE_TYP_val") : (String[])null);
		String[] l_SPEC_CLASS1_TYP_name = ((params.containsKey("l_SPEC_CLASS1_TYP_name")) ? (String[])params.get("l_SPEC_CLASS1_TYP_name") : (String[])null);
		String[] l_SPEC_CLASS1_TYP_val = ((params.containsKey("l_SPEC_CLASS1_TYP_val")) ? (String[])params.get("l_SPEC_CLASS1_TYP_val") : (String[])null);
		String[] l_SPEC_CLASS2_TYP_name = ((params.containsKey("l_SPEC_CLASS2_TYP_name")) ? (String[])params.get("l_SPEC_CLASS2_TYP_name") : (String[])null);
		String[] l_SPEC_CLASS2_TYP_val = ((params.containsKey("l_SPEC_CLASS2_TYP_val")) ? (String[])params.get("l_SPEC_CLASS2_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT1_TYP_name = ((params.containsKey("l_SPEC_SELECT1_TYP_name")) ? (String[])params.get("l_SPEC_SELECT1_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT1_TYP_val = ((params.containsKey("l_SPEC_SELECT1_TYP_val")) ? (String[])params.get("l_SPEC_SELECT1_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT2_TYP_name = ((params.containsKey("l_SPEC_SELECT2_TYP_name")) ? (String[])params.get("l_SPEC_SELECT2_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT2_TYP_val = ((params.containsKey("l_SPEC_SELECT2_TYP_val")) ? (String[])params.get("l_SPEC_SELECT2_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT3_TYP_name = ((params.containsKey("l_SPEC_SELECT3_TYP_name")) ? (String[])params.get("l_SPEC_SELECT3_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT3_TYP_val = ((params.containsKey("l_SPEC_SELECT3_TYP_val")) ? (String[])params.get("l_SPEC_SELECT3_TYP_val") : (String[])null);
		String[] l_SPEC_SELECT4_TYP_name = ((params.containsKey("l_SPEC_SELECT4_TYP_name")) ? (String[])params.get("l_SPEC_SELECT4_TYP_name") : (String[])null);
		String[] l_SPEC_SELECT4_TYP_val = ((params.containsKey("l_SPEC_SELECT4_TYP_val")) ? (String[])params.get("l_SPEC_SELECT4_TYP_val") : (String[])null);
		String[] LIST_CNT = ((params.containsKey("LIST_CNT")) ? (String[])params.get("LIST_CNT") : (String[])null);
		String[] PROJECT_STAT = ((params.containsKey("PROJECT_STAT")) ? (String[])params.get("PROJECT_STAT") : (String[])null);
		String[] UNOFFICIAL_RECEIPT_FLG = ((params.containsKey("UNOFFICIAL_RECEIPT_FLG")) ? (String[])params.get("UNOFFICIAL_RECEIPT_FLG") : (String[])null);

		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setESTIMATE_NO( ((ESTIMATE_NO == null) ? (String)null : ESTIMATE_NO[0]) );
		struct.setList_ESTIMATE_NO(TypeConverter.convert(ESTIMATE_NO));
		struct.setESTIMATE_STAT( ((ESTIMATE_STAT == null) ? (String)null : ESTIMATE_STAT[0]) );
		struct.setList_ESTIMATE_STAT(TypeConverter.convert(ESTIMATE_STAT));
		struct.setES_COMMET1( ((ES_COMMET1 == null) ? (String)null : ES_COMMET1[0]) );
		struct.setList_ES_COMMET1(TypeConverter.convert(ES_COMMET1));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setES_COMMET2( ((ES_COMMET2 == null) ? (String)null : ES_COMMET2[0]) );
		struct.setList_ES_COMMET2(TypeConverter.convert(ES_COMMET2));
		struct.setESTIMATE_DATE( ((ESTIMATE_DATE == null) ? (String)null : ESTIMATE_DATE[0]) );
		struct.setList_ESTIMATE_DATE(TypeConverter.convert(ESTIMATE_DATE));
		struct.setES_COMMET4( ((ES_COMMET4 == null) ? (String)null : ES_COMMET4[0]) );
		struct.setList_ES_COMMET4(TypeConverter.convert(ES_COMMET4));
		struct.setESTIMATE_AMOUNT( ((ESTIMATE_AMOUNT == null) ? (String)null : ESTIMATE_AMOUNT[0]) );
		struct.setList_ESTIMATE_AMOUNT(TypeConverter.convert(ESTIMATE_AMOUNT));
		struct.setCUR_UNIT( ((CUR_UNIT == null) ? (String)null : CUR_UNIT[0]) );
		struct.setList_CUR_UNIT(TypeConverter.convert(CUR_UNIT));
		struct.setES_COMMET3( ((ES_COMMET3 == null) ? (String)null : ES_COMMET3[0]) );
		struct.setList_ES_COMMET3(TypeConverter.convert(ES_COMMET3));
		struct.setESTIMATE_AMOUNT_JPN( ((ESTIMATE_AMOUNT_JPN == null) ? (String)null : ESTIMATE_AMOUNT_JPN[0]) );
		struct.setList_ESTIMATE_AMOUNT_JPN(TypeConverter.convert(ESTIMATE_AMOUNT_JPN));
		struct.setES_COMMET5( ((ES_COMMET5 == null) ? (String)null : ES_COMMET5[0]) );
		struct.setList_ES_COMMET5(TypeConverter.convert(ES_COMMET5));
		struct.setES_USER_CD( ((ES_USER_CD == null) ? (String)null : ES_USER_CD[0]) );
		struct.setList_ES_USER_CD(TypeConverter.convert(ES_USER_CD));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setES_ORG_CD( ((ES_ORG_CD == null) ? (String)null : ES_ORG_CD[0]) );
		struct.setList_ES_ORG_CD(TypeConverter.convert(ES_ORG_CD));
		struct.setORG_NAME( ((ORG_NAME == null) ? (String)null : ORG_NAME[0]) );
		struct.setList_ORG_NAME(TypeConverter.convert(ORG_NAME));
		struct.setZIP_CD( ((ZIP_CD == null) ? (String)null : ZIP_CD[0]) );
		struct.setList_ZIP_CD(TypeConverter.convert(ZIP_CD));
		struct.setTEL( ((TEL == null) ? (String)null : TEL[0]) );
		struct.setList_TEL(TypeConverter.convert(TEL));
		struct.setADDRESS_1( ((ADDRESS_1 == null) ? (String)null : ADDRESS_1[0]) );
		struct.setList_ADDRESS_1(TypeConverter.convert(ADDRESS_1));
		struct.setESREMARK1( ((ESREMARK1 == null) ? (String)null : ESREMARK1[0]) );
		struct.setList_ESREMARK1(TypeConverter.convert(ESREMARK1));
		struct.setESREMARK2( ((ESREMARK2 == null) ? (String)null : ESREMARK2[0]) );
		struct.setList_ESREMARK2(TypeConverter.convert(ESREMARK2));
		struct.setESREMARK3( ((ESREMARK3 == null) ? (String)null : ESREMARK3[0]) );
		struct.setList_ESREMARK3(TypeConverter.convert(ESREMARK3));
		struct.setl_DETAL_NO( ((l_DETAL_NO == null) ? (String)null : l_DETAL_NO[0]) );
		struct.setList_l_DETAL_NO(TypeConverter.convert(l_DETAL_NO));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_DESINATED_DLV_DATE( ((l_DESINATED_DLV_DATE == null) ? (String)null : l_DESINATED_DLV_DATE[0]) );
		struct.setList_l_DESINATED_DLV_DATE(TypeConverter.convert(l_DESINATED_DLV_DATE));
		struct.setl_ESTIMATE_QTY( ((l_ESTIMATE_QTY == null) ? (String)null : l_ESTIMATE_QTY[0]) );
		struct.setList_l_ESTIMATE_QTY(TypeConverter.convert(l_ESTIMATE_QTY));
		struct.setl_UNIT_CD( ((l_UNIT_CD == null) ? (String)null : l_UNIT_CD[0]) );
		struct.setList_l_UNIT_CD(TypeConverter.convert(l_UNIT_CD));
		struct.setl_UNIT_PRICE( ((l_UNIT_PRICE == null) ? (String)null : l_UNIT_PRICE[0]) );
		struct.setList_l_UNIT_PRICE(TypeConverter.convert(l_UNIT_PRICE));
		struct.setl_DISCOUNT_PRICE( ((l_DISCOUNT_PRICE == null) ? (String)null : l_DISCOUNT_PRICE[0]) );
		struct.setList_l_DISCOUNT_PRICE(TypeConverter.convert(l_DISCOUNT_PRICE));
		struct.setl_ESTIMATE_UNIT_PRICE( ((l_ESTIMATE_UNIT_PRICE == null) ? (String)null : l_ESTIMATE_UNIT_PRICE[0]) );
		struct.setList_l_ESTIMATE_UNIT_PRICE(TypeConverter.convert(l_ESTIMATE_UNIT_PRICE));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setl_AMOUNT( ((l_AMOUNT == null) ? (String)null : l_AMOUNT[0]) );
		struct.setList_l_AMOUNT(TypeConverter.convert(l_AMOUNT));
		struct.setl_DISCOUNT_AMOUNT( ((l_DISCOUNT_AMOUNT == null) ? (String)null : l_DISCOUNT_AMOUNT[0]) );
		struct.setList_l_DISCOUNT_AMOUNT(TypeConverter.convert(l_DISCOUNT_AMOUNT));
		struct.setl_ESTIMATE_AMOUNT( ((l_ESTIMATE_AMOUNT == null) ? (String)null : l_ESTIMATE_AMOUNT[0]) );
		struct.setList_l_ESTIMATE_AMOUNT(TypeConverter.convert(l_ESTIMATE_AMOUNT));
		struct.setl_ESTIMATE_AMOUNT_JPN( ((l_ESTIMATE_AMOUNT_JPN == null) ? (String)null : l_ESTIMATE_AMOUNT_JPN[0]) );
		struct.setList_l_ESTIMATE_AMOUNT_JPN(TypeConverter.convert(l_ESTIMATE_AMOUNT_JPN));
		struct.setl_ES_COST_ALL( ((l_ES_COST_ALL == null) ? (String)null : l_ES_COST_ALL[0]) );
		struct.setList_l_ES_COST_ALL(TypeConverter.convert(l_ES_COST_ALL));
		struct.setl_ESTIMATE_GAIN( ((l_ESTIMATE_GAIN == null) ? (String)null : l_ESTIMATE_GAIN[0]) );
		struct.setList_l_ESTIMATE_GAIN(TypeConverter.convert(l_ESTIMATE_GAIN));
		struct.setl_ES_COST_MATERIAL( ((l_ES_COST_MATERIAL == null) ? (String)null : l_ES_COST_MATERIAL[0]) );
		struct.setList_l_ES_COST_MATERIAL(TypeConverter.convert(l_ES_COST_MATERIAL));
		struct.setl_ES_COST_PROCESS( ((l_ES_COST_PROCESS == null) ? (String)null : l_ES_COST_PROCESS[0]) );
		struct.setList_l_ES_COST_PROCESS(TypeConverter.convert(l_ES_COST_PROCESS));
		struct.setl_ES_COST_OUTSOUCE( ((l_ES_COST_OUTSOUCE == null) ? (String)null : l_ES_COST_OUTSOUCE[0]) );
		struct.setList_l_ES_COST_OUTSOUCE(TypeConverter.convert(l_ES_COST_OUTSOUCE));
		struct.setl_ES_COST_ETC( ((l_ES_COST_ETC == null) ? (String)null : l_ES_COST_ETC[0]) );
		struct.setList_l_ES_COST_ETC(TypeConverter.convert(l_ES_COST_ETC));
		struct.setl_ES_COST_SERVICE( ((l_ES_COST_SERVICE == null) ? (String)null : l_ES_COST_SERVICE[0]) );
		struct.setList_l_ES_COST_SERVICE(TypeConverter.convert(l_ES_COST_SERVICE));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.seth_MAX_DETAL_NO( ((h_MAX_DETAL_NO == null) ? (String)null : h_MAX_DETAL_NO[0]) );
		struct.setList_h_MAX_DETAL_NO(TypeConverter.convert(h_MAX_DETAL_NO));
		struct.setl_FLAG( ((l_FLAG == null) ? (String)null : l_FLAG[0]) );
		struct.setList_l_FLAG(TypeConverter.convert(l_FLAG));
		struct.setQUOTE_PROJECT_CD( ((QUOTE_PROJECT_CD == null) ? (String)null : QUOTE_PROJECT_CD[0]) );
		struct.setList_QUOTE_PROJECT_CD(TypeConverter.convert(QUOTE_PROJECT_CD));
		struct.setQUOTE_ESTIMATE_NO( ((QUOTE_ESTIMATE_NO == null) ? (String)null : QUOTE_ESTIMATE_NO[0]) );
		struct.setList_QUOTE_ESTIMATE_NO(TypeConverter.convert(QUOTE_ESTIMATE_NO));
		struct.seth_CUST_CD( ((h_CUST_CD == null) ? (String)null : h_CUST_CD[0]) );
		struct.setList_h_CUST_CD(TypeConverter.convert(h_CUST_CD));
		struct.seth_CUR_CD( ((h_CUR_CD == null) ? (String)null : h_CUR_CD[0]) );
		struct.setList_h_CUR_CD(TypeConverter.convert(h_CUR_CD));
		struct.setADDRESS_2( ((ADDRESS_2 == null) ? (String)null : ADDRESS_2[0]) );
		struct.setList_ADDRESS_2(TypeConverter.convert(ADDRESS_2));
		struct.setl_CUST_ITEM_CD( ((l_CUST_ITEM_CD == null) ? (String)null : l_CUST_ITEM_CD[0]) );
		struct.setList_l_CUST_ITEM_CD(TypeConverter.convert(l_CUST_ITEM_CD));
		struct.setl_UNIT_COST( ((l_UNIT_COST == null) ? (String)null : l_UNIT_COST[0]) );
		struct.setList_l_UNIT_COST(TypeConverter.convert(l_UNIT_COST));
		struct.setl_CUST_ITEM_NAME( ((l_CUST_ITEM_NAME == null) ? (String)null : l_CUST_ITEM_NAME[0]) );
		struct.setList_l_CUST_ITEM_NAME(TypeConverter.convert(l_CUST_ITEM_NAME));
		struct.setl_SPEC_CLASS1_TYP( ((l_SPEC_CLASS1_TYP == null) ? (String)null : l_SPEC_CLASS1_TYP[0]) );
		struct.setList_l_SPEC_CLASS1_TYP(TypeConverter.convert(l_SPEC_CLASS1_TYP));
		struct.setl_SPEC_CLASS2_TYP( ((l_SPEC_CLASS2_TYP == null) ? (String)null : l_SPEC_CLASS2_TYP[0]) );
		struct.setList_l_SPEC_CLASS2_TYP(TypeConverter.convert(l_SPEC_CLASS2_TYP));
		struct.setl_SPEC_SELECT1_TYP( ((l_SPEC_SELECT1_TYP == null) ? (String)null : l_SPEC_SELECT1_TYP[0]) );
		struct.setList_l_SPEC_SELECT1_TYP(TypeConverter.convert(l_SPEC_SELECT1_TYP));
		struct.setl_SPEC_SELECT2_TYP( ((l_SPEC_SELECT2_TYP == null) ? (String)null : l_SPEC_SELECT2_TYP[0]) );
		struct.setList_l_SPEC_SELECT2_TYP(TypeConverter.convert(l_SPEC_SELECT2_TYP));
		struct.setl_SPEC_SELECT3_TYP( ((l_SPEC_SELECT3_TYP == null) ? (String)null : l_SPEC_SELECT3_TYP[0]) );
		struct.setList_l_SPEC_SELECT3_TYP(TypeConverter.convert(l_SPEC_SELECT3_TYP));
		struct.setl_SPEC_SELECT4_TYP( ((l_SPEC_SELECT4_TYP == null) ? (String)null : l_SPEC_SELECT4_TYP[0]) );
		struct.setList_l_SPEC_SELECT4_TYP(TypeConverter.convert(l_SPEC_SELECT4_TYP));
		struct.setl_ESTIMATE_TYP( ((l_ESTIMATE_TYP == null) ? (String)null : l_ESTIMATE_TYP[0]) );
		struct.setList_l_ESTIMATE_TYP(TypeConverter.convert(l_ESTIMATE_TYP));
		struct.setl_ESTIMATE_NAME( ((l_ESTIMATE_NAME == null) ? (String)null : l_ESTIMATE_NAME[0]) );
		struct.setList_l_ESTIMATE_NAME(TypeConverter.convert(l_ESTIMATE_NAME));
		struct.setl_SPEC_CLASS1_NAME( ((l_SPEC_CLASS1_NAME == null) ? (String)null : l_SPEC_CLASS1_NAME[0]) );
		struct.setList_l_SPEC_CLASS1_NAME(TypeConverter.convert(l_SPEC_CLASS1_NAME));
		struct.setl_SPEC_CLASS2_NAME( ((l_SPEC_CLASS2_NAME == null) ? (String)null : l_SPEC_CLASS2_NAME[0]) );
		struct.setList_l_SPEC_CLASS2_NAME(TypeConverter.convert(l_SPEC_CLASS2_NAME));
		struct.setl_SPEC_SELECT1_NAME( ((l_SPEC_SELECT1_NAME == null) ? (String)null : l_SPEC_SELECT1_NAME[0]) );
		struct.setList_l_SPEC_SELECT1_NAME(TypeConverter.convert(l_SPEC_SELECT1_NAME));
		struct.setl_SPEC_SELECT2_NAME( ((l_SPEC_SELECT2_NAME == null) ? (String)null : l_SPEC_SELECT2_NAME[0]) );
		struct.setList_l_SPEC_SELECT2_NAME(TypeConverter.convert(l_SPEC_SELECT2_NAME));
		struct.setl_SPEC_SELECT3_NAME( ((l_SPEC_SELECT3_NAME == null) ? (String)null : l_SPEC_SELECT3_NAME[0]) );
		struct.setList_l_SPEC_SELECT3_NAME(TypeConverter.convert(l_SPEC_SELECT3_NAME));
		struct.setl_SPEC_SELECT4_NAME( ((l_SPEC_SELECT4_NAME == null) ? (String)null : l_SPEC_SELECT4_NAME[0]) );
		struct.setList_l_SPEC_SELECT4_NAME(TypeConverter.convert(l_SPEC_SELECT4_NAME));
		struct.setl_ESTIMATE_TYP_name( ((l_ESTIMATE_TYP_name == null) ? (String)null : l_ESTIMATE_TYP_name[0]) );
		struct.setList_l_ESTIMATE_TYP_name(TypeConverter.convert(l_ESTIMATE_TYP_name));
		struct.setl_ESTIMATE_TYP_val( ((l_ESTIMATE_TYP_val == null) ? (String)null : l_ESTIMATE_TYP_val[0]) );
		struct.setList_l_ESTIMATE_TYP_val(TypeConverter.convert(l_ESTIMATE_TYP_val));
		struct.setl_SPEC_CLASS1_TYP_name( ((l_SPEC_CLASS1_TYP_name == null) ? (String)null : l_SPEC_CLASS1_TYP_name[0]) );
		struct.setList_l_SPEC_CLASS1_TYP_name(TypeConverter.convert(l_SPEC_CLASS1_TYP_name));
		struct.setl_SPEC_CLASS1_TYP_val( ((l_SPEC_CLASS1_TYP_val == null) ? (String)null : l_SPEC_CLASS1_TYP_val[0]) );
		struct.setList_l_SPEC_CLASS1_TYP_val(TypeConverter.convert(l_SPEC_CLASS1_TYP_val));
		struct.setl_SPEC_CLASS2_TYP_name( ((l_SPEC_CLASS2_TYP_name == null) ? (String)null : l_SPEC_CLASS2_TYP_name[0]) );
		struct.setList_l_SPEC_CLASS2_TYP_name(TypeConverter.convert(l_SPEC_CLASS2_TYP_name));
		struct.setl_SPEC_CLASS2_TYP_val( ((l_SPEC_CLASS2_TYP_val == null) ? (String)null : l_SPEC_CLASS2_TYP_val[0]) );
		struct.setList_l_SPEC_CLASS2_TYP_val(TypeConverter.convert(l_SPEC_CLASS2_TYP_val));
		struct.setl_SPEC_SELECT1_TYP_name( ((l_SPEC_SELECT1_TYP_name == null) ? (String)null : l_SPEC_SELECT1_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT1_TYP_name(TypeConverter.convert(l_SPEC_SELECT1_TYP_name));
		struct.setl_SPEC_SELECT1_TYP_val( ((l_SPEC_SELECT1_TYP_val == null) ? (String)null : l_SPEC_SELECT1_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT1_TYP_val(TypeConverter.convert(l_SPEC_SELECT1_TYP_val));
		struct.setl_SPEC_SELECT2_TYP_name( ((l_SPEC_SELECT2_TYP_name == null) ? (String)null : l_SPEC_SELECT2_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT2_TYP_name(TypeConverter.convert(l_SPEC_SELECT2_TYP_name));
		struct.setl_SPEC_SELECT2_TYP_val( ((l_SPEC_SELECT2_TYP_val == null) ? (String)null : l_SPEC_SELECT2_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT2_TYP_val(TypeConverter.convert(l_SPEC_SELECT2_TYP_val));
		struct.setl_SPEC_SELECT3_TYP_name( ((l_SPEC_SELECT3_TYP_name == null) ? (String)null : l_SPEC_SELECT3_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT3_TYP_name(TypeConverter.convert(l_SPEC_SELECT3_TYP_name));
		struct.setl_SPEC_SELECT3_TYP_val( ((l_SPEC_SELECT3_TYP_val == null) ? (String)null : l_SPEC_SELECT3_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT3_TYP_val(TypeConverter.convert(l_SPEC_SELECT3_TYP_val));
		struct.setl_SPEC_SELECT4_TYP_name( ((l_SPEC_SELECT4_TYP_name == null) ? (String)null : l_SPEC_SELECT4_TYP_name[0]) );
		struct.setList_l_SPEC_SELECT4_TYP_name(TypeConverter.convert(l_SPEC_SELECT4_TYP_name));
		struct.setl_SPEC_SELECT4_TYP_val( ((l_SPEC_SELECT4_TYP_val == null) ? (String)null : l_SPEC_SELECT4_TYP_val[0]) );
		struct.setList_l_SPEC_SELECT4_TYP_val(TypeConverter.convert(l_SPEC_SELECT4_TYP_val));
		struct.setLIST_CNT( ((LIST_CNT == null) ? (String)null : LIST_CNT[0]) );
		struct.setList_LIST_CNT(TypeConverter.convert(LIST_CNT));
		struct.setPROJECT_STAT( ((PROJECT_STAT == null) ? (String)null : PROJECT_STAT[0]) );
		struct.setList_PROJECT_STAT(TypeConverter.convert(PROJECT_STAT));
		struct.setUNOFFICIAL_RECEIPT_FLG( ((UNOFFICIAL_RECEIPT_FLG == null) ? (String)null : UNOFFICIAL_RECEIPT_FLG[0]) );
		struct.setList_UNOFFICIAL_RECEIPT_FLG(TypeConverter.convert(UNOFFICIAL_RECEIPT_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0020010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aKM0020010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aKM0020010Struct";   // JSP先のバインド名(Struct)の指定
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
					KM0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0020010Entity entity = control.entity;
		KM0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0020");
		logger.entering("KM0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0020010Control control;
		KM0020010Entity  entity = null;
		KM0020010Struct  struct = null;

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

			if( (control = (KM0020010Control)so.getAttribute("KM0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0020010Control();
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
				} else if( isClick(request, "Total") ) {
					if ( !isCryptical(request, so, params, "Total") ) return ERROR_TARGET;
					target = onClickTotal(request, response, so, params, control);
					control.setButton("Total");
				} else if( isClick(request, "append") ) {
					if ( !isCryptical(request, so, params, "append") ) return ERROR_TARGET;
					target = onClickappend(request, response, so, params, control);
					control.setButton("append");
				} else if( isClick(request, "modify") ) {
					if ( !isCryptical(request, so, params, "modify") ) return ERROR_TARGET;
					target = onClickmodify(request, response, so, params, control);
					control.setButton("modify");
				} else if( isClick(request, "erase") ) {
					if ( !isCryptical(request, so, params, "erase") ) return ERROR_TARGET;
					target = onClickerase(request, response, so, params, control);
					control.setButton("erase");
				} else if( isClick(request, "print") ) {
					if ( !isCryptical(request, so, params, "print") ) return ERROR_TARGET;
					target = onClickprint(request, response, so, params, control);
					control.setButton("print");
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "delete") ) {
					if ( !isCryptical(request, so, params, "delete") ) return ERROR_TARGET;
					target = onClickdelete(request, response, so, params, control);
					control.setButton("delete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "SelectUnitCost") ) {
					if ( !isCryptical(request, so, params, "SelectUnitCost") ) return ERROR_TARGET;
					target = onClickSelectUnitCost(request, response, so, params, control);
					control.setButton("SelectUnitCost");
				} else if( isClick(request, "LcConversion") ) {
					if ( !isCryptical(request, so, params, "LcConversion") ) return ERROR_TARGET;
					target = onClickLcConversion(request, response, so, params, control);
					control.setButton("LcConversion");
				} else if( isClick(request, "insertSub1") ) {
					if ( !isCryptical(request, so, params, "insertSub1") ) return ERROR_TARGET;
					target = onClickinsertSub1(request, response, so, params, control);
					control.setButton("insertSub1");
				} else if( isClick(request, "updateSub1") ) {
					if ( !isCryptical(request, so, params, "updateSub1") ) return ERROR_TARGET;
					target = onClickupdateSub1(request, response, so, params, control);
					control.setButton("updateSub1");
				} else if( isClick(request, "cancelSub1") ) {
					if ( !isCryptical(request, so, params, "cancelSub1") ) return ERROR_TARGET;
					target = onClickcancelSub1(request, response, so, params, control);
					control.setButton("cancelSub1");
				} else if( isClick(request, "Q_Select") ) {
					if ( !isCryptical(request, so, params, "Q_Select") ) return ERROR_TARGET;
					target = onClickQ_Select(request, response, so, params, control);
					control.setButton("Q_Select");
				} else if( isClick(request, "copy") ) {
					if ( !isCryptical(request, so, params, "copy") ) return ERROR_TARGET;
					target = onClickcopy(request, response, so, params, control);
					control.setButton("copy");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KM0020010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "Total") && bFLG_DISCONNECT_Total)
				|| (isClick(request, "append") && bFLG_DISCONNECT_append)
				|| (isClick(request, "modify") && bFLG_DISCONNECT_modify)
				|| (isClick(request, "erase") && bFLG_DISCONNECT_erase)
				|| (isClick(request, "print") && bFLG_DISCONNECT_print)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "SelectUnitCost") && bFLG_DISCONNECT_SelectUnitCost)
				|| (isClick(request, "LcConversion") && bFLG_DISCONNECT_LcConversion)
				|| (isClick(request, "insertSub1") && bFLG_DISCONNECT_insertSub1)
				|| (isClick(request, "updateSub1") && bFLG_DISCONNECT_updateSub1)
				|| (isClick(request, "cancelSub1") && bFLG_DISCONNECT_cancelSub1)
				|| (isClick(request, "Q_Select") && bFLG_DISCONNECT_Q_Select)
				|| (isClick(request, "copy") && bFLG_DISCONNECT_copy)
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
	private  static boolean bFLG_DISCONNECT_Total = true;
	private  static boolean bFLG_DISCONNECT_append = true;
	private  static boolean bFLG_DISCONNECT_modify = true;
	private  static boolean bFLG_DISCONNECT_erase = true;
	private  static boolean bFLG_DISCONNECT_print = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_SelectUnitCost = true;
	private  static boolean bFLG_DISCONNECT_LcConversion = true;
	private  static boolean bFLG_DISCONNECT_insertSub1 = true;
	private  static boolean bFLG_DISCONNECT_updateSub1 = true;
	private  static boolean bFLG_DISCONNECT_cancelSub1 = true;
	private  static boolean bFLG_DISCONNECT_Q_Select = true;
	private  static boolean bFLG_DISCONNECT_copy = true;

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
		return "com.nec.jp.orteus.metamorBase.KM0020.KM0020010Servlet";
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
	public KM0020010Servlet()
	{
		//{{user_implement_dev:<KM0020010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Total = true;
		bFLG_DISCONNECT_append = true;
		bFLG_DISCONNECT_modify = true;
		bFLG_DISCONNECT_erase = true;
		bFLG_DISCONNECT_print = true;
		bFLG_DISCONNECT_insert = true;
		bFLG_DISCONNECT_update = true;
		bFLG_DISCONNECT_delete = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;
		bFLG_DISCONNECT_SelectUnitCost = true;
		bFLG_DISCONNECT_LcConversion = true;
		bFLG_DISCONNECT_insertSub1 = true;
		bFLG_DISCONNECT_updateSub1 = true;
		bFLG_DISCONNECT_cancelSub1 = true;

                //}}user_implement_dev:<KM0020010_DisConnect_FLG>

		//{{user_implement_dev:<KM0020010Servlet>
//			bFLG_CSRF = false; // CSRFのための判定を行わない場合は、コメントアウトをはずしてください

			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<KM0020010Servlet>
	}

	//////////////////////////////

}
