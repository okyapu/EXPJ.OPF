/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0040/src/com/nec/jp/orteus/metamorBase/KM0040/KM0040010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0040;

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
 * CLASS     : KM0040010Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0040010Servlet extends HttpServlet
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
	 * @param control KM0040010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, KM0040010Control control)
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
	 * @param control KM0040010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, KM0040010Control control)
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
	 * @param control KM0040010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
			logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "KM0040010"+" $Revision: 1.1 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0040010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0040010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0040010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0040010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0040010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 見積登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0040010Controlクラスインスタンス
	 */
	public String onClickGoSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub1");
		//{{user_implement_dev:<onClickGoSub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("GoSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickGoSub1>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub1");

		return nextUrl;
	}

	/**
	 * 案件進捗ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0040010Controlクラスインスタンス
	 */
	public String onClickGoSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub2");
		//{{user_implement_dev:<onClickGoSub2>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("GoSub2");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickGoSub2>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub2");

		return nextUrl;
	}

	/**
	 * 案件受注登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0040010Controlクラスインスタンス
	 */
	public String onClickGoSub3(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub3");
		//{{user_implement_dev:<onClickGoSub3>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("GoSub3");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickGoSub3>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub3");

		return nextUrl;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0040010Controlクラスインスタンス
	 */
	public String onClickCSVOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCSVOut");
		//{{user_implement_dev:<onClickCSVOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CSVOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCSVOut>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCSVOut");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0040010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] IN_PROJECT_CD = ((params.containsKey("IN_PROJECT_CD")) ? (String[])params.get("IN_PROJECT_CD") : (String[])null);
		String[] CHECK_1 = ((params.containsKey("CHECK_1")) ? (String[])params.get("CHECK_1") : (String[])null);
		String[] IN_CUST_CD = ((params.containsKey("IN_CUST_CD")) ? (String[])params.get("IN_CUST_CD") : (String[])null);
		String[] C1_PROJECT_STAT = ((params.containsKey("C1_PROJECT_STAT")) ? (String[])params.get("C1_PROJECT_STAT") : (String[])null);
		String[] C2_PROJECT_STAT = ((params.containsKey("C2_PROJECT_STAT")) ? (String[])params.get("C2_PROJECT_STAT") : (String[])null);
		String[] C3_PROJECT_STAT = ((params.containsKey("C3_PROJECT_STAT")) ? (String[])params.get("C3_PROJECT_STAT") : (String[])null);
		String[] C4_PROJECT_STAT = ((params.containsKey("C4_PROJECT_STAT")) ? (String[])params.get("C4_PROJECT_STAT") : (String[])null);
		String[] C5_PROJECT_STAT = ((params.containsKey("C5_PROJECT_STAT")) ? (String[])params.get("C5_PROJECT_STAT") : (String[])null);
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] PROJECT_STAT = ((params.containsKey("PROJECT_STAT")) ? (String[])params.get("PROJECT_STAT") : (String[])null);
		String[] DLV_LOC_CD = ((params.containsKey("DLV_LOC_CD")) ? (String[])params.get("DLV_LOC_CD") : (String[])null);
		String[] ESTIMATE_NO = ((params.containsKey("ESTIMATE_NO")) ? (String[])params.get("ESTIMATE_NO") : (String[])null);
		String[] TXT_FILE = ((params.containsKey("TXT_FILE")) ? (String[])params.get("TXT_FILE") : (String[])null);
		String[] IN_ES_USER_CD = ((params.containsKey("IN_ES_USER_CD")) ? (String[])params.get("IN_ES_USER_CD") : (String[])null);
		String[] FROM_ASSUME_DLV_DATE = ((params.containsKey("FROM_ASSUME_DLV_DATE")) ? (String[])params.get("FROM_ASSUME_DLV_DATE") : (String[])null);
		String[] TO_ASSUME_DLV_DATE = ((params.containsKey("TO_ASSUME_DLV_DATE")) ? (String[])params.get("TO_ASSUME_DLV_DATE") : (String[])null);
		String[] VEND_DATE = ((params.containsKey("VEND_DATE")) ? (String[])params.get("VEND_DATE") : (String[])null);
		String[] ASSUME_DLV_DATE = ((params.containsKey("ASSUME_DLV_DATE")) ? (String[])params.get("ASSUME_DLV_DATE") : (String[])null);
		String[] ASSUME_AMOUNT = ((params.containsKey("ASSUME_AMOUNT")) ? (String[])params.get("ASSUME_AMOUNT") : (String[])null);
		String[] CUR_UNIT = ((params.containsKey("CUR_UNIT")) ? (String[])params.get("CUR_UNIT") : (String[])null);
		String[] ASSUME_AMOUNT_EXCH_RATES = ((params.containsKey("ASSUME_AMOUNT_EXCH_RATES")) ? (String[])params.get("ASSUME_AMOUNT_EXCH_RATES") : (String[])null);
		String[] PJ_ORG_CD = ((params.containsKey("PJ_ORG_CD")) ? (String[])params.get("PJ_ORG_CD") : (String[])null);
		String[] PJ_USER_CD = ((params.containsKey("PJ_USER_CD")) ? (String[])params.get("PJ_USER_CD") : (String[])null);
		String[] REMARKS1 = ((params.containsKey("REMARKS1")) ? (String[])params.get("REMARKS1") : (String[])null);
		String[] REMARKS2 = ((params.containsKey("REMARKS2")) ? (String[])params.get("REMARKS2") : (String[])null);
		String[] REMARKS3 = ((params.containsKey("REMARKS3")) ? (String[])params.get("REMARKS3") : (String[])null);
		String[] REMARKS4 = ((params.containsKey("REMARKS4")) ? (String[])params.get("REMARKS4") : (String[])null);
		String[] REMARKS5 = ((params.containsKey("REMARKS5")) ? (String[])params.get("REMARKS5") : (String[])null);
		String[] ESTIMATE_STAT = ((params.containsKey("ESTIMATE_STAT")) ? (String[])params.get("ESTIMATE_STAT") : (String[])null);
		String[] ES_COMMET1 = ((params.containsKey("ES_COMMET1")) ? (String[])params.get("ES_COMMET1") : (String[])null);
		String[] ES_COMMET2 = ((params.containsKey("ES_COMMET2")) ? (String[])params.get("ES_COMMET2") : (String[])null);
		String[] ES_COMMET3 = ((params.containsKey("ES_COMMET3")) ? (String[])params.get("ES_COMMET3") : (String[])null);
		String[] ES_COMMET4 = ((params.containsKey("ES_COMMET4")) ? (String[])params.get("ES_COMMET4") : (String[])null);
		String[] ES_COMMET5 = ((params.containsKey("ES_COMMET5")) ? (String[])params.get("ES_COMMET5") : (String[])null);
		String[] ES_ORG_CD = ((params.containsKey("ES_ORG_CD")) ? (String[])params.get("ES_ORG_CD") : (String[])null);
		String[] ES_USER_CD = ((params.containsKey("ES_USER_CD")) ? (String[])params.get("ES_USER_CD") : (String[])null);
		String[] ESTIMATE_AMOUNT = ((params.containsKey("ESTIMATE_AMOUNT")) ? (String[])params.get("ESTIMATE_AMOUNT") : (String[])null);
		String[] ESTIMATE_AMOUNT_JPN = ((params.containsKey("ESTIMATE_AMOUNT_JPN")) ? (String[])params.get("ESTIMATE_AMOUNT_JPN") : (String[])null);
		String[] ESREMARK1 = ((params.containsKey("ESREMARK1")) ? (String[])params.get("ESREMARK1") : (String[])null);
		String[] ESREMARK2 = ((params.containsKey("ESREMARK2")) ? (String[])params.get("ESREMARK2") : (String[])null);
		String[] ESREMARK3 = ((params.containsKey("ESREMARK3")) ? (String[])params.get("ESREMARK3") : (String[])null);
		String[] IN_PJ_USER_CD = ((params.containsKey("IN_PJ_USER_CD")) ? (String[])params.get("IN_PJ_USER_CD") : (String[])null);
		String[] IN_PJ_USER_NAME = ((params.containsKey("IN_PJ_USER_NAME")) ? (String[])params.get("IN_PJ_USER_NAME") : (String[])null);
		String[] IN_ES_USER_NAME = ((params.containsKey("IN_ES_USER_NAME")) ? (String[])params.get("IN_ES_USER_NAME") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] ACCURACY = ((params.containsKey("ACCURACY")) ? (String[])params.get("ACCURACY") : (String[])null);
		String[] FROM_ESTIMATE_DATE = ((params.containsKey("FROM_ESTIMATE_DATE")) ? (String[])params.get("FROM_ESTIMATE_DATE") : (String[])null);
		String[] TO_ESTIMATE_DATE = ((params.containsKey("TO_ESTIMATE_DATE")) ? (String[])params.get("TO_ESTIMATE_DATE") : (String[])null);
		String[] ESTIMATE_DATE = ((params.containsKey("ESTIMATE_DATE")) ? (String[])params.get("ESTIMATE_DATE") : (String[])null);
		String[] ORG_NAME_1 = ((params.containsKey("ORG_NAME_1")) ? (String[])params.get("ORG_NAME_1") : (String[])null);
		String[] USER_NAME_1 = ((params.containsKey("USER_NAME_1")) ? (String[])params.get("USER_NAME_1") : (String[])null);
		String[] ORG_NAME_2 = ((params.containsKey("ORG_NAME_2")) ? (String[])params.get("ORG_NAME_2") : (String[])null);
		String[] USER_NAME_2 = ((params.containsKey("USER_NAME_2")) ? (String[])params.get("USER_NAME_2") : (String[])null);
		String[] DLV_LOC_NAME = ((params.containsKey("DLV_LOC_NAME")) ? (String[])params.get("DLV_LOC_NAME") : (String[])null);
		String[] I_PROJECT_STAT = ((params.containsKey("I_PROJECT_STAT")) ? (String[])params.get("I_PROJECT_STAT") : (String[])null);
		String[] FROM_VEND_DATE = ((params.containsKey("FROM_VEND_DATE")) ? (String[])params.get("FROM_VEND_DATE") : (String[])null);
		String[] TO_VEND_DATE = ((params.containsKey("TO_VEND_DATE")) ? (String[])params.get("TO_VEND_DATE") : (String[])null);
		String[] C6_PROJECT_STAT = ((params.containsKey("C6_PROJECT_STAT")) ? (String[])params.get("C6_PROJECT_STAT") : (String[])null);

		struct.setIN_PROJECT_CD( ((IN_PROJECT_CD == null) ? (String)null : IN_PROJECT_CD[0]) );
		struct.setList_IN_PROJECT_CD(TypeConverter.convert(IN_PROJECT_CD));
		struct.setCHECK_1( ((CHECK_1 == null) ? (String)null : CHECK_1[0]) );
		struct.setList_CHECK_1(TypeConverter.convert(CHECK_1));
		struct.setIN_CUST_CD( ((IN_CUST_CD == null) ? (String)null : IN_CUST_CD[0]) );
		struct.setList_IN_CUST_CD(TypeConverter.convert(IN_CUST_CD));
		struct.setC1_PROJECT_STAT( ((C1_PROJECT_STAT == null) ? (String)null : C1_PROJECT_STAT[0]) );
		struct.setList_C1_PROJECT_STAT(TypeConverter.convert(C1_PROJECT_STAT));
		struct.setC2_PROJECT_STAT( ((C2_PROJECT_STAT == null) ? (String)null : C2_PROJECT_STAT[0]) );
		struct.setList_C2_PROJECT_STAT(TypeConverter.convert(C2_PROJECT_STAT));
		struct.setC3_PROJECT_STAT( ((C3_PROJECT_STAT == null) ? (String)null : C3_PROJECT_STAT[0]) );
		struct.setList_C3_PROJECT_STAT(TypeConverter.convert(C3_PROJECT_STAT));
		struct.setC4_PROJECT_STAT( ((C4_PROJECT_STAT == null) ? (String)null : C4_PROJECT_STAT[0]) );
		struct.setList_C4_PROJECT_STAT(TypeConverter.convert(C4_PROJECT_STAT));
		struct.setC5_PROJECT_STAT( ((C5_PROJECT_STAT == null) ? (String)null : C5_PROJECT_STAT[0]) );
		struct.setList_C5_PROJECT_STAT(TypeConverter.convert(C5_PROJECT_STAT));
		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setPROJECT_STAT( ((PROJECT_STAT == null) ? (String)null : PROJECT_STAT[0]) );
		struct.setList_PROJECT_STAT(TypeConverter.convert(PROJECT_STAT));
		struct.setDLV_LOC_CD( ((DLV_LOC_CD == null) ? (String)null : DLV_LOC_CD[0]) );
		struct.setList_DLV_LOC_CD(TypeConverter.convert(DLV_LOC_CD));
		struct.setESTIMATE_NO( ((ESTIMATE_NO == null) ? (String)null : ESTIMATE_NO[0]) );
		struct.setList_ESTIMATE_NO(TypeConverter.convert(ESTIMATE_NO));
		struct.setTXT_FILE( ((TXT_FILE == null) ? (String)null : TXT_FILE[0]) );
		struct.setList_TXT_FILE(TypeConverter.convert(TXT_FILE));
		struct.setIN_ES_USER_CD( ((IN_ES_USER_CD == null) ? (String)null : IN_ES_USER_CD[0]) );
		struct.setList_IN_ES_USER_CD(TypeConverter.convert(IN_ES_USER_CD));
		struct.setFROM_ASSUME_DLV_DATE( ((FROM_ASSUME_DLV_DATE == null) ? (String)null : FROM_ASSUME_DLV_DATE[0]) );
		struct.setList_FROM_ASSUME_DLV_DATE(TypeConverter.convert(FROM_ASSUME_DLV_DATE));
		struct.setTO_ASSUME_DLV_DATE( ((TO_ASSUME_DLV_DATE == null) ? (String)null : TO_ASSUME_DLV_DATE[0]) );
		struct.setList_TO_ASSUME_DLV_DATE(TypeConverter.convert(TO_ASSUME_DLV_DATE));
		struct.setVEND_DATE( ((VEND_DATE == null) ? (String)null : VEND_DATE[0]) );
		struct.setList_VEND_DATE(TypeConverter.convert(VEND_DATE));
		struct.setASSUME_DLV_DATE( ((ASSUME_DLV_DATE == null) ? (String)null : ASSUME_DLV_DATE[0]) );
		struct.setList_ASSUME_DLV_DATE(TypeConverter.convert(ASSUME_DLV_DATE));
		struct.setASSUME_AMOUNT( ((ASSUME_AMOUNT == null) ? (String)null : ASSUME_AMOUNT[0]) );
		struct.setList_ASSUME_AMOUNT(TypeConverter.convert(ASSUME_AMOUNT));
		struct.setCUR_UNIT( ((CUR_UNIT == null) ? (String)null : CUR_UNIT[0]) );
		struct.setList_CUR_UNIT(TypeConverter.convert(CUR_UNIT));
		struct.setASSUME_AMOUNT_EXCH_RATES( ((ASSUME_AMOUNT_EXCH_RATES == null) ? (String)null : ASSUME_AMOUNT_EXCH_RATES[0]) );
		struct.setList_ASSUME_AMOUNT_EXCH_RATES(TypeConverter.convert(ASSUME_AMOUNT_EXCH_RATES));
		struct.setPJ_ORG_CD( ((PJ_ORG_CD == null) ? (String)null : PJ_ORG_CD[0]) );
		struct.setList_PJ_ORG_CD(TypeConverter.convert(PJ_ORG_CD));
		struct.setPJ_USER_CD( ((PJ_USER_CD == null) ? (String)null : PJ_USER_CD[0]) );
		struct.setList_PJ_USER_CD(TypeConverter.convert(PJ_USER_CD));
		struct.setREMARKS1( ((REMARKS1 == null) ? (String)null : REMARKS1[0]) );
		struct.setList_REMARKS1(TypeConverter.convert(REMARKS1));
		struct.setREMARKS2( ((REMARKS2 == null) ? (String)null : REMARKS2[0]) );
		struct.setList_REMARKS2(TypeConverter.convert(REMARKS2));
		struct.setREMARKS3( ((REMARKS3 == null) ? (String)null : REMARKS3[0]) );
		struct.setList_REMARKS3(TypeConverter.convert(REMARKS3));
		struct.setREMARKS4( ((REMARKS4 == null) ? (String)null : REMARKS4[0]) );
		struct.setList_REMARKS4(TypeConverter.convert(REMARKS4));
		struct.setREMARKS5( ((REMARKS5 == null) ? (String)null : REMARKS5[0]) );
		struct.setList_REMARKS5(TypeConverter.convert(REMARKS5));
		struct.setESTIMATE_STAT( ((ESTIMATE_STAT == null) ? (String)null : ESTIMATE_STAT[0]) );
		struct.setList_ESTIMATE_STAT(TypeConverter.convert(ESTIMATE_STAT));
		struct.setES_COMMET1( ((ES_COMMET1 == null) ? (String)null : ES_COMMET1[0]) );
		struct.setList_ES_COMMET1(TypeConverter.convert(ES_COMMET1));
		struct.setES_COMMET2( ((ES_COMMET2 == null) ? (String)null : ES_COMMET2[0]) );
		struct.setList_ES_COMMET2(TypeConverter.convert(ES_COMMET2));
		struct.setES_COMMET3( ((ES_COMMET3 == null) ? (String)null : ES_COMMET3[0]) );
		struct.setList_ES_COMMET3(TypeConverter.convert(ES_COMMET3));
		struct.setES_COMMET4( ((ES_COMMET4 == null) ? (String)null : ES_COMMET4[0]) );
		struct.setList_ES_COMMET4(TypeConverter.convert(ES_COMMET4));
		struct.setES_COMMET5( ((ES_COMMET5 == null) ? (String)null : ES_COMMET5[0]) );
		struct.setList_ES_COMMET5(TypeConverter.convert(ES_COMMET5));
		struct.setES_ORG_CD( ((ES_ORG_CD == null) ? (String)null : ES_ORG_CD[0]) );
		struct.setList_ES_ORG_CD(TypeConverter.convert(ES_ORG_CD));
		struct.setES_USER_CD( ((ES_USER_CD == null) ? (String)null : ES_USER_CD[0]) );
		struct.setList_ES_USER_CD(TypeConverter.convert(ES_USER_CD));
		struct.setESTIMATE_AMOUNT( ((ESTIMATE_AMOUNT == null) ? (String)null : ESTIMATE_AMOUNT[0]) );
		struct.setList_ESTIMATE_AMOUNT(TypeConverter.convert(ESTIMATE_AMOUNT));
		struct.setESTIMATE_AMOUNT_JPN( ((ESTIMATE_AMOUNT_JPN == null) ? (String)null : ESTIMATE_AMOUNT_JPN[0]) );
		struct.setList_ESTIMATE_AMOUNT_JPN(TypeConverter.convert(ESTIMATE_AMOUNT_JPN));
		struct.setESREMARK1( ((ESREMARK1 == null) ? (String)null : ESREMARK1[0]) );
		struct.setList_ESREMARK1(TypeConverter.convert(ESREMARK1));
		struct.setESREMARK2( ((ESREMARK2 == null) ? (String)null : ESREMARK2[0]) );
		struct.setList_ESREMARK2(TypeConverter.convert(ESREMARK2));
		struct.setESREMARK3( ((ESREMARK3 == null) ? (String)null : ESREMARK3[0]) );
		struct.setList_ESREMARK3(TypeConverter.convert(ESREMARK3));
		struct.setIN_PJ_USER_CD( ((IN_PJ_USER_CD == null) ? (String)null : IN_PJ_USER_CD[0]) );
		struct.setList_IN_PJ_USER_CD(TypeConverter.convert(IN_PJ_USER_CD));
		struct.setIN_PJ_USER_NAME( ((IN_PJ_USER_NAME == null) ? (String)null : IN_PJ_USER_NAME[0]) );
		struct.setList_IN_PJ_USER_NAME(TypeConverter.convert(IN_PJ_USER_NAME));
		struct.setIN_ES_USER_NAME( ((IN_ES_USER_NAME == null) ? (String)null : IN_ES_USER_NAME[0]) );
		struct.setList_IN_ES_USER_NAME(TypeConverter.convert(IN_ES_USER_NAME));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setACCURACY( ((ACCURACY == null) ? (String)null : ACCURACY[0]) );
		struct.setList_ACCURACY(TypeConverter.convert(ACCURACY));
		struct.setFROM_ESTIMATE_DATE( ((FROM_ESTIMATE_DATE == null) ? (String)null : FROM_ESTIMATE_DATE[0]) );
		struct.setList_FROM_ESTIMATE_DATE(TypeConverter.convert(FROM_ESTIMATE_DATE));
		struct.setTO_ESTIMATE_DATE( ((TO_ESTIMATE_DATE == null) ? (String)null : TO_ESTIMATE_DATE[0]) );
		struct.setList_TO_ESTIMATE_DATE(TypeConverter.convert(TO_ESTIMATE_DATE));
		struct.setESTIMATE_DATE( ((ESTIMATE_DATE == null) ? (String)null : ESTIMATE_DATE[0]) );
		struct.setList_ESTIMATE_DATE(TypeConverter.convert(ESTIMATE_DATE));
		struct.setORG_NAME_1( ((ORG_NAME_1 == null) ? (String)null : ORG_NAME_1[0]) );
		struct.setList_ORG_NAME_1(TypeConverter.convert(ORG_NAME_1));
		struct.setUSER_NAME_1( ((USER_NAME_1 == null) ? (String)null : USER_NAME_1[0]) );
		struct.setList_USER_NAME_1(TypeConverter.convert(USER_NAME_1));
		struct.setORG_NAME_2( ((ORG_NAME_2 == null) ? (String)null : ORG_NAME_2[0]) );
		struct.setList_ORG_NAME_2(TypeConverter.convert(ORG_NAME_2));
		struct.setUSER_NAME_2( ((USER_NAME_2 == null) ? (String)null : USER_NAME_2[0]) );
		struct.setList_USER_NAME_2(TypeConverter.convert(USER_NAME_2));
		struct.setDLV_LOC_NAME( ((DLV_LOC_NAME == null) ? (String)null : DLV_LOC_NAME[0]) );
		struct.setList_DLV_LOC_NAME(TypeConverter.convert(DLV_LOC_NAME));
		struct.setI_PROJECT_STAT( ((I_PROJECT_STAT == null) ? (String)null : I_PROJECT_STAT[0]) );
		struct.setList_I_PROJECT_STAT(TypeConverter.convert(I_PROJECT_STAT));
		struct.setFROM_VEND_DATE( ((FROM_VEND_DATE == null) ? (String)null : FROM_VEND_DATE[0]) );
		struct.setList_FROM_VEND_DATE(TypeConverter.convert(FROM_VEND_DATE));
		struct.setTO_VEND_DATE( ((TO_VEND_DATE == null) ? (String)null : TO_VEND_DATE[0]) );
		struct.setList_TO_VEND_DATE(TypeConverter.convert(TO_VEND_DATE));
		struct.setC6_PROJECT_STAT( ((C6_PROJECT_STAT == null) ? (String)null : C6_PROJECT_STAT[0]) );
		struct.setList_C6_PROJECT_STAT(TypeConverter.convert(C6_PROJECT_STAT));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0040010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aKM0040010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aKM0040010Struct";   // JSP先のバインド名(Struct)の指定
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
					KM0040010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0040010Control control;
		KM0040010Entity  entity = null;
		KM0040010Struct  struct = null;

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

			if( (control = (KM0040010Control)so.getAttribute("KM0040010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0040010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0040010Control();
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
				if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "Select") ) {
					if ( !isCryptical(request, so, params, "Select") ) return ERROR_TARGET;
					target = onClickSelect(request, response, so, params, control);
					control.setButton("Select");
				} else if( isClick(request, "GoSub1") ) {
					if ( !isCryptical(request, so, params, "GoSub1") ) return ERROR_TARGET;
					target = onClickGoSub1(request, response, so, params, control);
					control.setButton("GoSub1");
				} else if( isClick(request, "GoSub2") ) {
					if ( !isCryptical(request, so, params, "GoSub2") ) return ERROR_TARGET;
					target = onClickGoSub2(request, response, so, params, control);
					control.setButton("GoSub2");
				} else if( isClick(request, "GoSub3") ) {
					if ( !isCryptical(request, so, params, "GoSub3") ) return ERROR_TARGET;
					target = onClickGoSub3(request, response, so, params, control);
					control.setButton("GoSub3");
				} else if( isClick(request, "CSVOut") ) {
					if ( !isCryptical(request, so, params, "CSVOut") ) return ERROR_TARGET;
					target = onClickCSVOut(request, response, so, params, control);
					control.setButton("CSVOut");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KM0040010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "Select") && bFLG_DISCONNECT_Select)
				|| (isClick(request, "GoSub1") && bFLG_DISCONNECT_GoSub1)
				|| (isClick(request, "GoSub2") && bFLG_DISCONNECT_GoSub2)
				|| (isClick(request, "GoSub3") && bFLG_DISCONNECT_GoSub3)
				|| (isClick(request, "CSVOut") && bFLG_DISCONNECT_CSVOut)
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
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_GoSub1 = true;
	private  static boolean bFLG_DISCONNECT_GoSub2 = true;
	private  static boolean bFLG_DISCONNECT_GoSub3 = true;
	private  static boolean bFLG_DISCONNECT_CSVOut = true;

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
		return "com.nec.jp.orteus.metamorBase.KM0040.KM0040010Servlet";
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
	public KM0040010Servlet()
	{
		//{{user_implement_dev:<KM0040010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KM0040010_DisConnect_FLG>

		//{{user_implement_dev:<KM0040010Servlet>
//			bFLG_CSRF = false; // CSRFのための判定を行わない場合は、コメントアウトをはずしてください

			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<KM0040010Servlet>
	}

	//////////////////////////////

}
