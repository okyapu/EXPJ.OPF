/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010030Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

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
 * CLASS     : KQ0010030Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KQ0010030Servlet extends HttpServlet
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
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, KQ0010030Control control)
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
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, KQ0010030Control control)
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
	 * @param control KQ0010030Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
			logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "KQ0010030"+" $Revision: 1.9 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KQ0010030Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 選択承認ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickApprAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprAssort");
		//{{user_implement_dev:<onClickApprAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ApprAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickApprAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprAssort");

		return nextUrl;
	}

	/**
	 * 選択保留ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickReserveAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveAssort");
		//{{user_implement_dev:<onClickReserveAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ReserveAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReserveAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveAssort");

		return nextUrl;
	}

	/**
	 * 選択保留解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickReserveDelAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveDelAssort");
		//{{user_implement_dev:<onClickReserveDelAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ReserveDelAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReserveDelAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveDelAssort");

		return nextUrl;
	}

	/**
	 * 選択依頼削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickApprDelAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprDelAssort");
		//{{user_implement_dev:<onClickApprDelAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ApprDelAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickApprDelAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprDelAssort");

		return nextUrl;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickCheckAll(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");
		//{{user_implement_dev:<onClickCheckAll>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CheckAll");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCheckAll>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");

		return nextUrl;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickCheckClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");
		//{{user_implement_dev:<onClickCheckClear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CheckClear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCheckClear>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * 明細ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0010030Controlクラスインスタンス
	 */
	public String onClickClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/KQ0010030detail.jsp";		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClickDetail");
		//{{user_implement_dev:<onClickClickDetail>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ClickDetail");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClickDetail>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClickDetail");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KQ0010030Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] h_APPR_POWER_TYP = ((params.containsKey("h_APPR_POWER_TYP")) ? (String[])params.get("h_APPR_POWER_TYP") : (String[])null);
		String[] r1_FILTER1 = ((params.containsKey("r1_FILTER1")) ? (String[])params.get("r1_FILTER1") : (String[])null);
		String[] r2_FILTER1 = ((params.containsKey("r2_FILTER1")) ? (String[])params.get("r2_FILTER1") : (String[])null);
		String[] r3_FILTER1 = ((params.containsKey("r3_FILTER1")) ? (String[])params.get("r3_FILTER1") : (String[])null);
		String[] h_SELECT_TYP = ((params.containsKey("h_SELECT_TYP")) ? (String[])params.get("h_SELECT_TYP") : (String[])null);
		String[] h_REQUEST_APPR_SAME = ((params.containsKey("h_REQUEST_APPR_SAME")) ? (String[])params.get("h_REQUEST_APPR_SAME") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] START_DATE = ((params.containsKey("START_DATE")) ? (String[])params.get("START_DATE") : (String[])null);
		String[] END_DATE = ((params.containsKey("END_DATE")) ? (String[])params.get("END_DATE") : (String[])null);
		String[] RESERVE_CAUSE = ((params.containsKey("RESERVE_CAUSE")) ? (String[])params.get("RESERVE_CAUSE") : (String[])null);
		String[] l_PROC_TYP_VALUE = ((params.containsKey("l_PROC_TYP_VALUE")) ? (String[])params.get("l_PROC_TYP_VALUE") : (String[])null);
		String[] h_PROC_TYP = ((params.containsKey("h_PROC_TYP")) ? (String[])params.get("h_PROC_TYP") : (String[])null);
		String[] l_REQUEST_BY_NAME = ((params.containsKey("l_REQUEST_BY_NAME")) ? (String[])params.get("l_REQUEST_BY_NAME") : (String[])null);
		String[] l_REQUEST_DATE = ((params.containsKey("l_REQUEST_DATE")) ? (String[])params.get("l_REQUEST_DATE") : (String[])null);
		String[] l_APPR_REMARKS = ((params.containsKey("l_APPR_REMARKS")) ? (String[])params.get("l_APPR_REMARKS") : (String[])null);
		String[] l_RESERVE_CAUSE = ((params.containsKey("l_RESERVE_CAUSE")) ? (String[])params.get("l_RESERVE_CAUSE") : (String[])null);
		String[] l_ODR_TYP_DN = ((params.containsKey("l_ODR_TYP_DN")) ? (String[])params.get("l_ODR_TYP_DN") : (String[])null);
		String[] l_ODR_TYP = ((params.containsKey("l_ODR_TYP")) ? (String[])params.get("l_ODR_TYP") : (String[])null);
		String[] l_CUST_ODR_NO = ((params.containsKey("l_CUST_ODR_NO")) ? (String[])params.get("l_CUST_ODR_NO") : (String[])null);
		String[] l_CUST_ITEM_CD = ((params.containsKey("l_CUST_ITEM_CD")) ? (String[])params.get("l_CUST_ITEM_CD") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_CUST_CD = ((params.containsKey("l_CUST_CD")) ? (String[])params.get("l_CUST_CD") : (String[])null);
		String[] l_CUST_ANAME = ((params.containsKey("l_CUST_ANAME")) ? (String[])params.get("l_CUST_ANAME") : (String[])null);
		String[] l_DESINATED_DLV_DATE = ((params.containsKey("l_DESINATED_DLV_DATE")) ? (String[])params.get("l_DESINATED_DLV_DATE") : (String[])null);
		String[] l_ODR_QTY = ((params.containsKey("l_ODR_QTY")) ? (String[])params.get("l_ODR_QTY") : (String[])null);
		String[] l_UNIT_CD = ((params.containsKey("l_UNIT_CD")) ? (String[])params.get("l_UNIT_CD") : (String[])null);
		String[] l_ODR_UNIT_PRICE = ((params.containsKey("l_ODR_UNIT_PRICE")) ? (String[])params.get("l_ODR_UNIT_PRICE") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] l_SPCL_PRICE_TYP_DN = ((params.containsKey("l_SPCL_PRICE_TYP_DN")) ? (String[])params.get("l_SPCL_PRICE_TYP_DN") : (String[])null);
		String[] l_SPCL_PRICE_TYP = ((params.containsKey("l_SPCL_PRICE_TYP")) ? (String[])params.get("l_SPCL_PRICE_TYP") : (String[])null);
		String[] l_DLV_LOC_CD = ((params.containsKey("l_DLV_LOC_CD")) ? (String[])params.get("l_DLV_LOC_CD") : (String[])null);
		String[] l_DLV_LOC_NAME = ((params.containsKey("l_DLV_LOC_NAME")) ? (String[])params.get("l_DLV_LOC_NAME") : (String[])null);
		String[] l_DEPO_TYP_DN = ((params.containsKey("l_DEPO_TYP_DN")) ? (String[])params.get("l_DEPO_TYP_DN") : (String[])null);
		String[] l_DEPO_TYP = ((params.containsKey("l_DEPO_TYP")) ? (String[])params.get("l_DEPO_TYP") : (String[])null);
		String[] l_CUST_ITEM_NAME = ((params.containsKey("l_CUST_ITEM_NAME")) ? (String[])params.get("l_CUST_ITEM_NAME") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_ODR_ACPT_DATE = ((params.containsKey("l_ODR_ACPT_DATE")) ? (String[])params.get("l_ODR_ACPT_DATE") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_JOB_ODR_QTY = ((params.containsKey("l_JOB_ODR_QTY")) ? (String[])params.get("l_JOB_ODR_QTY") : (String[])null);
		String[] l_JOB_ODR_DLV_DATE = ((params.containsKey("l_JOB_ODR_DLV_DATE")) ? (String[])params.get("l_JOB_ODR_DLV_DATE") : (String[])null);
		String[] l_ALC_GRP_CD = ((params.containsKey("l_ALC_GRP_CD")) ? (String[])params.get("l_ALC_GRP_CD") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] l_CUS_DLV_KEY_CD = ((params.containsKey("l_CUS_DLV_KEY_CD")) ? (String[])params.get("l_CUS_DLV_KEY_CD") : (String[])null);
		String[] l_CUS_DLV_CD = ((params.containsKey("l_CUS_DLV_CD")) ? (String[])params.get("l_CUS_DLV_CD") : (String[])null);
		String[] d_OLD_CUST_ODR_NO = ((params.containsKey("d_OLD_CUST_ODR_NO")) ? (String[])params.get("d_OLD_CUST_ODR_NO") : (String[])null);
		String[] d_NEW_CUST_ODR_NO = ((params.containsKey("d_NEW_CUST_ODR_NO")) ? (String[])params.get("d_NEW_CUST_ODR_NO") : (String[])null);
		String[] d_CUST_ODR_NO_CHANGE = ((params.containsKey("d_CUST_ODR_NO_CHANGE")) ? (String[])params.get("d_CUST_ODR_NO_CHANGE") : (String[])null);
		String[] d_OLD_CUST_CD = ((params.containsKey("d_OLD_CUST_CD")) ? (String[])params.get("d_OLD_CUST_CD") : (String[])null);
		String[] d_NEW_CUST_CD = ((params.containsKey("d_NEW_CUST_CD")) ? (String[])params.get("d_NEW_CUST_CD") : (String[])null);
		String[] d_CUST_CD_CHANGE = ((params.containsKey("d_CUST_CD_CHANGE")) ? (String[])params.get("d_CUST_CD_CHANGE") : (String[])null);
		String[] d_OLD_CUST_ITEM_CD = ((params.containsKey("d_OLD_CUST_ITEM_CD")) ? (String[])params.get("d_OLD_CUST_ITEM_CD") : (String[])null);
		String[] d_NEW_CUST_ITEM_CD = ((params.containsKey("d_NEW_CUST_ITEM_CD")) ? (String[])params.get("d_NEW_CUST_ITEM_CD") : (String[])null);
		String[] d_CUST_ITEM_CD_CHANGE = ((params.containsKey("d_CUST_ITEM_CD_CHANGE")) ? (String[])params.get("d_CUST_ITEM_CD_CHANGE") : (String[])null);
		String[] d_DLV_LOC_CD_CHANGE = ((params.containsKey("d_DLV_LOC_CD_CHANGE")) ? (String[])params.get("d_DLV_LOC_CD_CHANGE") : (String[])null);
		String[] d_OLD_ODR_QTY = ((params.containsKey("d_OLD_ODR_QTY")) ? (String[])params.get("d_OLD_ODR_QTY") : (String[])null);
		String[] d_NEW_ODR_QTY = ((params.containsKey("d_NEW_ODR_QTY")) ? (String[])params.get("d_NEW_ODR_QTY") : (String[])null);
		String[] d_ODR_QTY_CHANGE = ((params.containsKey("d_ODR_QTY_CHANGE")) ? (String[])params.get("d_ODR_QTY_CHANGE") : (String[])null);
		String[] d_OLD_DESINATED_DLV_DATE = ((params.containsKey("d_OLD_DESINATED_DLV_DATE")) ? (String[])params.get("d_OLD_DESINATED_DLV_DATE") : (String[])null);
		String[] d_NEW_DESINATED_DLV_DATE = ((params.containsKey("d_NEW_DESINATED_DLV_DATE")) ? (String[])params.get("d_NEW_DESINATED_DLV_DATE") : (String[])null);
		String[] d_DESINATED_DLV_DATE_CHANGE = ((params.containsKey("d_DESINATED_DLV_DATE_CHANGE")) ? (String[])params.get("d_DESINATED_DLV_DATE_CHANGE") : (String[])null);
		String[] d_OLD_SPCL_PRICE_TYP = ((params.containsKey("d_OLD_SPCL_PRICE_TYP")) ? (String[])params.get("d_OLD_SPCL_PRICE_TYP") : (String[])null);
		String[] d_NEW_SPCL_PRICE_TYP = ((params.containsKey("d_NEW_SPCL_PRICE_TYP")) ? (String[])params.get("d_NEW_SPCL_PRICE_TYP") : (String[])null);
		String[] d_SPCL_PRICE_TYP_CHANGE = ((params.containsKey("d_SPCL_PRICE_TYP_CHANGE")) ? (String[])params.get("d_SPCL_PRICE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_ODR_UNIT_PRICE = ((params.containsKey("d_OLD_ODR_UNIT_PRICE")) ? (String[])params.get("d_OLD_ODR_UNIT_PRICE") : (String[])null);
		String[] d_NEW_ODR_UNIT_PRICE = ((params.containsKey("d_NEW_ODR_UNIT_PRICE")) ? (String[])params.get("d_NEW_ODR_UNIT_PRICE") : (String[])null);
		String[] d_ODR_UNIT_PRICE_CHANGE = ((params.containsKey("d_ODR_UNIT_PRICE_CHANGE")) ? (String[])params.get("d_ODR_UNIT_PRICE_CHANGE") : (String[])null);
		String[] d_OLD_DLV_LOC_CD = ((params.containsKey("d_OLD_DLV_LOC_CD")) ? (String[])params.get("d_OLD_DLV_LOC_CD") : (String[])null);
		String[] d_NEW_DLV_LOC_CD = ((params.containsKey("d_NEW_DLV_LOC_CD")) ? (String[])params.get("d_NEW_DLV_LOC_CD") : (String[])null);
		String[] d_OLD_REMARKS = ((params.containsKey("d_OLD_REMARKS")) ? (String[])params.get("d_OLD_REMARKS") : (String[])null);
		String[] d_NEW_REMARKS = ((params.containsKey("d_NEW_REMARKS")) ? (String[])params.get("d_NEW_REMARKS") : (String[])null);
		String[] d_REMARKS_CHANGE = ((params.containsKey("d_REMARKS_CHANGE")) ? (String[])params.get("d_REMARKS_CHANGE") : (String[])null);
		String[] l_REQUEST_BY = ((params.containsKey("l_REQUEST_BY")) ? (String[])params.get("l_REQUEST_BY") : (String[])null);
		String[] h_STATUS = ((params.containsKey("h_STATUS")) ? (String[])params.get("h_STATUS") : (String[])null);
		String[] h_APPR_ID = ((params.containsKey("h_APPR_ID")) ? (String[])params.get("h_APPR_ID") : (String[])null);
		String[] h_SCREEN_URL = ((params.containsKey("h_SCREEN_URL")) ? (String[])params.get("h_SCREEN_URL") : (String[])null);
		String[] h_ODR_NO = ((params.containsKey("h_ODR_NO")) ? (String[])params.get("h_ODR_NO") : (String[])null);
		String[] d_OLD_ODR_NO = ((params.containsKey("d_OLD_ODR_NO")) ? (String[])params.get("d_OLD_ODR_NO") : (String[])null);
		String[] d_NEW_ODR_NO = ((params.containsKey("d_NEW_ODR_NO")) ? (String[])params.get("d_NEW_ODR_NO") : (String[])null);
		String[] d_ODR_NO_CHANGE = ((params.containsKey("d_ODR_NO_CHANGE")) ? (String[])params.get("d_ODR_NO_CHANGE") : (String[])null);
		String[] d_OLD_ODR_TYP = ((params.containsKey("d_OLD_ODR_TYP")) ? (String[])params.get("d_OLD_ODR_TYP") : (String[])null);
		String[] d_NEW_ODR_TYP = ((params.containsKey("d_NEW_ODR_TYP")) ? (String[])params.get("d_NEW_ODR_TYP") : (String[])null);
		String[] d_ODR_TYP_CHANGE = ((params.containsKey("d_ODR_TYP_CHANGE")) ? (String[])params.get("d_ODR_TYP_CHANGE") : (String[])null);
		String[] h_MODIFY_COUNT = ((params.containsKey("h_MODIFY_COUNT")) ? (String[])params.get("h_MODIFY_COUNT") : (String[])null);
		String[] l_STATUS_NAME = ((params.containsKey("l_STATUS_NAME")) ? (String[])params.get("l_STATUS_NAME") : (String[])null);
		String[] l_PROJECT_CD = ((params.containsKey("l_PROJECT_CD")) ? (String[])params.get("l_PROJECT_CD") : (String[])null);
		String[] l_ESTIMATE_NO = ((params.containsKey("l_ESTIMATE_NO")) ? (String[])params.get("l_ESTIMATE_NO") : (String[])null);
		String[] l_DETAL_NO = ((params.containsKey("l_DETAL_NO")) ? (String[])params.get("l_DETAL_NO") : (String[])null);
		String[] l_ESTIMATE_TYPE = ((params.containsKey("l_ESTIMATE_TYPE")) ? (String[])params.get("l_ESTIMATE_TYPE") : (String[])null);
		String[] l_h_ESTIMATE_TYPE = ((params.containsKey("l_h_ESTIMATE_TYPE")) ? (String[])params.get("l_h_ESTIMATE_TYPE") : (String[])null);
		String[] l_OWN_PERSON_CD = ((params.containsKey("l_OWN_PERSON_CD")) ? (String[])params.get("l_OWN_PERSON_CD") : (String[])null);
		String[] l_OWN_ORG_CD = ((params.containsKey("l_OWN_ORG_CD")) ? (String[])params.get("l_OWN_ORG_CD") : (String[])null);
		String[] l_ORGN_ODR_NO = ((params.containsKey("l_ORGN_ODR_NO")) ? (String[])params.get("l_ORGN_ODR_NO") : (String[])null);
		String[] l_ADD_ODR_FLG = ((params.containsKey("l_ADD_ODR_FLG")) ? (String[])params.get("l_ADD_ODR_FLG") : (String[])null);

		struct.seth_APPR_POWER_TYP( ((h_APPR_POWER_TYP == null) ? (String)null : h_APPR_POWER_TYP[0]) );
		struct.setList_h_APPR_POWER_TYP(TypeConverter.convert(h_APPR_POWER_TYP));
		struct.setr1_FILTER1( ((r1_FILTER1 == null) ? (String)null : r1_FILTER1[0]) );
		struct.setList_r1_FILTER1(TypeConverter.convert(r1_FILTER1));
		struct.setr2_FILTER1( ((r2_FILTER1 == null) ? (String)null : r2_FILTER1[0]) );
		struct.setList_r2_FILTER1(TypeConverter.convert(r2_FILTER1));
		struct.setr3_FILTER1( ((r3_FILTER1 == null) ? (String)null : r3_FILTER1[0]) );
		struct.setList_r3_FILTER1(TypeConverter.convert(r3_FILTER1));
		struct.seth_SELECT_TYP( ((h_SELECT_TYP == null) ? (String)null : h_SELECT_TYP[0]) );
		struct.setList_h_SELECT_TYP(TypeConverter.convert(h_SELECT_TYP));
		struct.seth_REQUEST_APPR_SAME( ((h_REQUEST_APPR_SAME == null) ? (String)null : h_REQUEST_APPR_SAME[0]) );
		struct.setList_h_REQUEST_APPR_SAME(TypeConverter.convert(h_REQUEST_APPR_SAME));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setSTART_DATE( ((START_DATE == null) ? (String)null : START_DATE[0]) );
		struct.setList_START_DATE(TypeConverter.convert(START_DATE));
		struct.setEND_DATE( ((END_DATE == null) ? (String)null : END_DATE[0]) );
		struct.setList_END_DATE(TypeConverter.convert(END_DATE));
		struct.setRESERVE_CAUSE( ((RESERVE_CAUSE == null) ? (String)null : RESERVE_CAUSE[0]) );
		struct.setList_RESERVE_CAUSE(TypeConverter.convert(RESERVE_CAUSE));
		struct.setl_PROC_TYP_VALUE( ((l_PROC_TYP_VALUE == null) ? (String)null : l_PROC_TYP_VALUE[0]) );
		struct.setList_l_PROC_TYP_VALUE(TypeConverter.convert(l_PROC_TYP_VALUE));
		struct.seth_PROC_TYP( ((h_PROC_TYP == null) ? (String)null : h_PROC_TYP[0]) );
		struct.setList_h_PROC_TYP(TypeConverter.convert(h_PROC_TYP));
		struct.setl_REQUEST_BY_NAME( ((l_REQUEST_BY_NAME == null) ? (String)null : l_REQUEST_BY_NAME[0]) );
		struct.setList_l_REQUEST_BY_NAME(TypeConverter.convert(l_REQUEST_BY_NAME));
		struct.setl_REQUEST_DATE( ((l_REQUEST_DATE == null) ? (String)null : l_REQUEST_DATE[0]) );
		struct.setList_l_REQUEST_DATE(TypeConverter.convert(l_REQUEST_DATE));
		struct.setl_APPR_REMARKS( ((l_APPR_REMARKS == null) ? (String)null : l_APPR_REMARKS[0]) );
		struct.setList_l_APPR_REMARKS(TypeConverter.convert(l_APPR_REMARKS));
		struct.setl_RESERVE_CAUSE( ((l_RESERVE_CAUSE == null) ? (String)null : l_RESERVE_CAUSE[0]) );
		struct.setList_l_RESERVE_CAUSE(TypeConverter.convert(l_RESERVE_CAUSE));
		struct.setl_ODR_TYP_DN( ((l_ODR_TYP_DN == null) ? (String)null : l_ODR_TYP_DN[0]) );
		struct.setList_l_ODR_TYP_DN(TypeConverter.convert(l_ODR_TYP_DN));
		struct.setl_ODR_TYP( ((l_ODR_TYP == null) ? (String)null : l_ODR_TYP[0]) );
		struct.setList_l_ODR_TYP(TypeConverter.convert(l_ODR_TYP));
		struct.setl_CUST_ODR_NO( ((l_CUST_ODR_NO == null) ? (String)null : l_CUST_ODR_NO[0]) );
		struct.setList_l_CUST_ODR_NO(TypeConverter.convert(l_CUST_ODR_NO));
		struct.setl_CUST_ITEM_CD( ((l_CUST_ITEM_CD == null) ? (String)null : l_CUST_ITEM_CD[0]) );
		struct.setList_l_CUST_ITEM_CD(TypeConverter.convert(l_CUST_ITEM_CD));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_CUST_CD( ((l_CUST_CD == null) ? (String)null : l_CUST_CD[0]) );
		struct.setList_l_CUST_CD(TypeConverter.convert(l_CUST_CD));
		struct.setl_CUST_ANAME( ((l_CUST_ANAME == null) ? (String)null : l_CUST_ANAME[0]) );
		struct.setList_l_CUST_ANAME(TypeConverter.convert(l_CUST_ANAME));
		struct.setl_DESINATED_DLV_DATE( ((l_DESINATED_DLV_DATE == null) ? (String)null : l_DESINATED_DLV_DATE[0]) );
		struct.setList_l_DESINATED_DLV_DATE(TypeConverter.convert(l_DESINATED_DLV_DATE));
		struct.setl_ODR_QTY( ((l_ODR_QTY == null) ? (String)null : l_ODR_QTY[0]) );
		struct.setList_l_ODR_QTY(TypeConverter.convert(l_ODR_QTY));
		struct.setl_UNIT_CD( ((l_UNIT_CD == null) ? (String)null : l_UNIT_CD[0]) );
		struct.setList_l_UNIT_CD(TypeConverter.convert(l_UNIT_CD));
		struct.setl_ODR_UNIT_PRICE( ((l_ODR_UNIT_PRICE == null) ? (String)null : l_ODR_UNIT_PRICE[0]) );
		struct.setList_l_ODR_UNIT_PRICE(TypeConverter.convert(l_ODR_UNIT_PRICE));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setl_SPCL_PRICE_TYP_DN( ((l_SPCL_PRICE_TYP_DN == null) ? (String)null : l_SPCL_PRICE_TYP_DN[0]) );
		struct.setList_l_SPCL_PRICE_TYP_DN(TypeConverter.convert(l_SPCL_PRICE_TYP_DN));
		struct.setl_SPCL_PRICE_TYP( ((l_SPCL_PRICE_TYP == null) ? (String)null : l_SPCL_PRICE_TYP[0]) );
		struct.setList_l_SPCL_PRICE_TYP(TypeConverter.convert(l_SPCL_PRICE_TYP));
		struct.setl_DLV_LOC_CD( ((l_DLV_LOC_CD == null) ? (String)null : l_DLV_LOC_CD[0]) );
		struct.setList_l_DLV_LOC_CD(TypeConverter.convert(l_DLV_LOC_CD));
		struct.setl_DLV_LOC_NAME( ((l_DLV_LOC_NAME == null) ? (String)null : l_DLV_LOC_NAME[0]) );
		struct.setList_l_DLV_LOC_NAME(TypeConverter.convert(l_DLV_LOC_NAME));
		struct.setl_DEPO_TYP_DN( ((l_DEPO_TYP_DN == null) ? (String)null : l_DEPO_TYP_DN[0]) );
		struct.setList_l_DEPO_TYP_DN(TypeConverter.convert(l_DEPO_TYP_DN));
		struct.setl_DEPO_TYP( ((l_DEPO_TYP == null) ? (String)null : l_DEPO_TYP[0]) );
		struct.setList_l_DEPO_TYP(TypeConverter.convert(l_DEPO_TYP));
		struct.setl_CUST_ITEM_NAME( ((l_CUST_ITEM_NAME == null) ? (String)null : l_CUST_ITEM_NAME[0]) );
		struct.setList_l_CUST_ITEM_NAME(TypeConverter.convert(l_CUST_ITEM_NAME));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_ODR_ACPT_DATE( ((l_ODR_ACPT_DATE == null) ? (String)null : l_ODR_ACPT_DATE[0]) );
		struct.setList_l_ODR_ACPT_DATE(TypeConverter.convert(l_ODR_ACPT_DATE));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_JOB_ODR_QTY( ((l_JOB_ODR_QTY == null) ? (String)null : l_JOB_ODR_QTY[0]) );
		struct.setList_l_JOB_ODR_QTY(TypeConverter.convert(l_JOB_ODR_QTY));
		struct.setl_JOB_ODR_DLV_DATE( ((l_JOB_ODR_DLV_DATE == null) ? (String)null : l_JOB_ODR_DLV_DATE[0]) );
		struct.setList_l_JOB_ODR_DLV_DATE(TypeConverter.convert(l_JOB_ODR_DLV_DATE));
		struct.setl_ALC_GRP_CD( ((l_ALC_GRP_CD == null) ? (String)null : l_ALC_GRP_CD[0]) );
		struct.setList_l_ALC_GRP_CD(TypeConverter.convert(l_ALC_GRP_CD));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.setl_CUS_DLV_KEY_CD( ((l_CUS_DLV_KEY_CD == null) ? (String)null : l_CUS_DLV_KEY_CD[0]) );
		struct.setList_l_CUS_DLV_KEY_CD(TypeConverter.convert(l_CUS_DLV_KEY_CD));
		struct.setl_CUS_DLV_CD( ((l_CUS_DLV_CD == null) ? (String)null : l_CUS_DLV_CD[0]) );
		struct.setList_l_CUS_DLV_CD(TypeConverter.convert(l_CUS_DLV_CD));
		struct.setd_OLD_CUST_ODR_NO( ((d_OLD_CUST_ODR_NO == null) ? (String)null : d_OLD_CUST_ODR_NO[0]) );
		struct.setList_d_OLD_CUST_ODR_NO(TypeConverter.convert(d_OLD_CUST_ODR_NO));
		struct.setd_NEW_CUST_ODR_NO( ((d_NEW_CUST_ODR_NO == null) ? (String)null : d_NEW_CUST_ODR_NO[0]) );
		struct.setList_d_NEW_CUST_ODR_NO(TypeConverter.convert(d_NEW_CUST_ODR_NO));
		struct.setd_CUST_ODR_NO_CHANGE( ((d_CUST_ODR_NO_CHANGE == null) ? (String)null : d_CUST_ODR_NO_CHANGE[0]) );
		struct.setList_d_CUST_ODR_NO_CHANGE(TypeConverter.convert(d_CUST_ODR_NO_CHANGE));
		struct.setd_OLD_CUST_CD( ((d_OLD_CUST_CD == null) ? (String)null : d_OLD_CUST_CD[0]) );
		struct.setList_d_OLD_CUST_CD(TypeConverter.convert(d_OLD_CUST_CD));
		struct.setd_NEW_CUST_CD( ((d_NEW_CUST_CD == null) ? (String)null : d_NEW_CUST_CD[0]) );
		struct.setList_d_NEW_CUST_CD(TypeConverter.convert(d_NEW_CUST_CD));
		struct.setd_CUST_CD_CHANGE( ((d_CUST_CD_CHANGE == null) ? (String)null : d_CUST_CD_CHANGE[0]) );
		struct.setList_d_CUST_CD_CHANGE(TypeConverter.convert(d_CUST_CD_CHANGE));
		struct.setd_OLD_CUST_ITEM_CD( ((d_OLD_CUST_ITEM_CD == null) ? (String)null : d_OLD_CUST_ITEM_CD[0]) );
		struct.setList_d_OLD_CUST_ITEM_CD(TypeConverter.convert(d_OLD_CUST_ITEM_CD));
		struct.setd_NEW_CUST_ITEM_CD( ((d_NEW_CUST_ITEM_CD == null) ? (String)null : d_NEW_CUST_ITEM_CD[0]) );
		struct.setList_d_NEW_CUST_ITEM_CD(TypeConverter.convert(d_NEW_CUST_ITEM_CD));
		struct.setd_CUST_ITEM_CD_CHANGE( ((d_CUST_ITEM_CD_CHANGE == null) ? (String)null : d_CUST_ITEM_CD_CHANGE[0]) );
		struct.setList_d_CUST_ITEM_CD_CHANGE(TypeConverter.convert(d_CUST_ITEM_CD_CHANGE));
		struct.setd_DLV_LOC_CD_CHANGE( ((d_DLV_LOC_CD_CHANGE == null) ? (String)null : d_DLV_LOC_CD_CHANGE[0]) );
		struct.setList_d_DLV_LOC_CD_CHANGE(TypeConverter.convert(d_DLV_LOC_CD_CHANGE));
		struct.setd_OLD_ODR_QTY( ((d_OLD_ODR_QTY == null) ? (String)null : d_OLD_ODR_QTY[0]) );
		struct.setList_d_OLD_ODR_QTY(TypeConverter.convert(d_OLD_ODR_QTY));
		struct.setd_NEW_ODR_QTY( ((d_NEW_ODR_QTY == null) ? (String)null : d_NEW_ODR_QTY[0]) );
		struct.setList_d_NEW_ODR_QTY(TypeConverter.convert(d_NEW_ODR_QTY));
		struct.setd_ODR_QTY_CHANGE( ((d_ODR_QTY_CHANGE == null) ? (String)null : d_ODR_QTY_CHANGE[0]) );
		struct.setList_d_ODR_QTY_CHANGE(TypeConverter.convert(d_ODR_QTY_CHANGE));
		struct.setd_OLD_DESINATED_DLV_DATE( ((d_OLD_DESINATED_DLV_DATE == null) ? (String)null : d_OLD_DESINATED_DLV_DATE[0]) );
		struct.setList_d_OLD_DESINATED_DLV_DATE(TypeConverter.convert(d_OLD_DESINATED_DLV_DATE));
		struct.setd_NEW_DESINATED_DLV_DATE( ((d_NEW_DESINATED_DLV_DATE == null) ? (String)null : d_NEW_DESINATED_DLV_DATE[0]) );
		struct.setList_d_NEW_DESINATED_DLV_DATE(TypeConverter.convert(d_NEW_DESINATED_DLV_DATE));
		struct.setd_DESINATED_DLV_DATE_CHANGE( ((d_DESINATED_DLV_DATE_CHANGE == null) ? (String)null : d_DESINATED_DLV_DATE_CHANGE[0]) );
		struct.setList_d_DESINATED_DLV_DATE_CHANGE(TypeConverter.convert(d_DESINATED_DLV_DATE_CHANGE));
		struct.setd_OLD_SPCL_PRICE_TYP( ((d_OLD_SPCL_PRICE_TYP == null) ? (String)null : d_OLD_SPCL_PRICE_TYP[0]) );
		struct.setList_d_OLD_SPCL_PRICE_TYP(TypeConverter.convert(d_OLD_SPCL_PRICE_TYP));
		struct.setd_NEW_SPCL_PRICE_TYP( ((d_NEW_SPCL_PRICE_TYP == null) ? (String)null : d_NEW_SPCL_PRICE_TYP[0]) );
		struct.setList_d_NEW_SPCL_PRICE_TYP(TypeConverter.convert(d_NEW_SPCL_PRICE_TYP));
		struct.setd_SPCL_PRICE_TYP_CHANGE( ((d_SPCL_PRICE_TYP_CHANGE == null) ? (String)null : d_SPCL_PRICE_TYP_CHANGE[0]) );
		struct.setList_d_SPCL_PRICE_TYP_CHANGE(TypeConverter.convert(d_SPCL_PRICE_TYP_CHANGE));
		struct.setd_OLD_ODR_UNIT_PRICE( ((d_OLD_ODR_UNIT_PRICE == null) ? (String)null : d_OLD_ODR_UNIT_PRICE[0]) );
		struct.setList_d_OLD_ODR_UNIT_PRICE(TypeConverter.convert(d_OLD_ODR_UNIT_PRICE));
		struct.setd_NEW_ODR_UNIT_PRICE( ((d_NEW_ODR_UNIT_PRICE == null) ? (String)null : d_NEW_ODR_UNIT_PRICE[0]) );
		struct.setList_d_NEW_ODR_UNIT_PRICE(TypeConverter.convert(d_NEW_ODR_UNIT_PRICE));
		struct.setd_ODR_UNIT_PRICE_CHANGE( ((d_ODR_UNIT_PRICE_CHANGE == null) ? (String)null : d_ODR_UNIT_PRICE_CHANGE[0]) );
		struct.setList_d_ODR_UNIT_PRICE_CHANGE(TypeConverter.convert(d_ODR_UNIT_PRICE_CHANGE));
		struct.setd_OLD_DLV_LOC_CD( ((d_OLD_DLV_LOC_CD == null) ? (String)null : d_OLD_DLV_LOC_CD[0]) );
		struct.setList_d_OLD_DLV_LOC_CD(TypeConverter.convert(d_OLD_DLV_LOC_CD));
		struct.setd_NEW_DLV_LOC_CD( ((d_NEW_DLV_LOC_CD == null) ? (String)null : d_NEW_DLV_LOC_CD[0]) );
		struct.setList_d_NEW_DLV_LOC_CD(TypeConverter.convert(d_NEW_DLV_LOC_CD));
		struct.setd_OLD_REMARKS( ((d_OLD_REMARKS == null) ? (String)null : d_OLD_REMARKS[0]) );
		struct.setList_d_OLD_REMARKS(TypeConverter.convert(d_OLD_REMARKS));
		struct.setd_NEW_REMARKS( ((d_NEW_REMARKS == null) ? (String)null : d_NEW_REMARKS[0]) );
		struct.setList_d_NEW_REMARKS(TypeConverter.convert(d_NEW_REMARKS));
		struct.setd_REMARKS_CHANGE( ((d_REMARKS_CHANGE == null) ? (String)null : d_REMARKS_CHANGE[0]) );
		struct.setList_d_REMARKS_CHANGE(TypeConverter.convert(d_REMARKS_CHANGE));
		struct.setl_REQUEST_BY( ((l_REQUEST_BY == null) ? (String)null : l_REQUEST_BY[0]) );
		struct.setList_l_REQUEST_BY(TypeConverter.convert(l_REQUEST_BY));
		struct.seth_STATUS( ((h_STATUS == null) ? (String)null : h_STATUS[0]) );
		struct.setList_h_STATUS(TypeConverter.convert(h_STATUS));
		struct.seth_APPR_ID( ((h_APPR_ID == null) ? (String)null : h_APPR_ID[0]) );
		struct.setList_h_APPR_ID(TypeConverter.convert(h_APPR_ID));
		struct.seth_SCREEN_URL( ((h_SCREEN_URL == null) ? (String)null : h_SCREEN_URL[0]) );
		struct.setList_h_SCREEN_URL(TypeConverter.convert(h_SCREEN_URL));
		struct.seth_ODR_NO( ((h_ODR_NO == null) ? (String)null : h_ODR_NO[0]) );
		struct.setList_h_ODR_NO(TypeConverter.convert(h_ODR_NO));
		struct.setd_OLD_ODR_NO( ((d_OLD_ODR_NO == null) ? (String)null : d_OLD_ODR_NO[0]) );
		struct.setList_d_OLD_ODR_NO(TypeConverter.convert(d_OLD_ODR_NO));
		struct.setd_NEW_ODR_NO( ((d_NEW_ODR_NO == null) ? (String)null : d_NEW_ODR_NO[0]) );
		struct.setList_d_NEW_ODR_NO(TypeConverter.convert(d_NEW_ODR_NO));
		struct.setd_ODR_NO_CHANGE( ((d_ODR_NO_CHANGE == null) ? (String)null : d_ODR_NO_CHANGE[0]) );
		struct.setList_d_ODR_NO_CHANGE(TypeConverter.convert(d_ODR_NO_CHANGE));
		struct.setd_OLD_ODR_TYP( ((d_OLD_ODR_TYP == null) ? (String)null : d_OLD_ODR_TYP[0]) );
		struct.setList_d_OLD_ODR_TYP(TypeConverter.convert(d_OLD_ODR_TYP));
		struct.setd_NEW_ODR_TYP( ((d_NEW_ODR_TYP == null) ? (String)null : d_NEW_ODR_TYP[0]) );
		struct.setList_d_NEW_ODR_TYP(TypeConverter.convert(d_NEW_ODR_TYP));
		struct.setd_ODR_TYP_CHANGE( ((d_ODR_TYP_CHANGE == null) ? (String)null : d_ODR_TYP_CHANGE[0]) );
		struct.setList_d_ODR_TYP_CHANGE(TypeConverter.convert(d_ODR_TYP_CHANGE));
		struct.seth_MODIFY_COUNT( ((h_MODIFY_COUNT == null) ? (String)null : h_MODIFY_COUNT[0]) );
		struct.setList_h_MODIFY_COUNT(TypeConverter.convert(h_MODIFY_COUNT));
		struct.setl_STATUS_NAME( ((l_STATUS_NAME == null) ? (String)null : l_STATUS_NAME[0]) );
		struct.setList_l_STATUS_NAME(TypeConverter.convert(l_STATUS_NAME));
		struct.setl_PROJECT_CD( ((l_PROJECT_CD == null) ? (String)null : l_PROJECT_CD[0]) );
		struct.setList_l_PROJECT_CD(TypeConverter.convert(l_PROJECT_CD));
		struct.setl_ESTIMATE_NO( ((l_ESTIMATE_NO == null) ? (String)null : l_ESTIMATE_NO[0]) );
		struct.setList_l_ESTIMATE_NO(TypeConverter.convert(l_ESTIMATE_NO));
		struct.setl_DETAL_NO( ((l_DETAL_NO == null) ? (String)null : l_DETAL_NO[0]) );
		struct.setList_l_DETAL_NO(TypeConverter.convert(l_DETAL_NO));
		struct.setl_ESTIMATE_TYPE( ((l_ESTIMATE_TYPE == null) ? (String)null : l_ESTIMATE_TYPE[0]) );
		struct.setList_l_ESTIMATE_TYPE(TypeConverter.convert(l_ESTIMATE_TYPE));
		struct.setl_h_ESTIMATE_TYPE( ((l_h_ESTIMATE_TYPE == null) ? (String)null : l_h_ESTIMATE_TYPE[0]) );
		struct.setList_l_h_ESTIMATE_TYPE(TypeConverter.convert(l_h_ESTIMATE_TYPE));
		struct.setl_OWN_PERSON_CD( ((l_OWN_PERSON_CD == null) ? (String)null : l_OWN_PERSON_CD[0]) );
		struct.setList_l_OWN_PERSON_CD(TypeConverter.convert(l_OWN_PERSON_CD));
		struct.setl_OWN_ORG_CD( ((l_OWN_ORG_CD == null) ? (String)null : l_OWN_ORG_CD[0]) );
		struct.setList_l_OWN_ORG_CD(TypeConverter.convert(l_OWN_ORG_CD));
		struct.setl_ORGN_ODR_NO( ((l_ORGN_ODR_NO == null) ? (String)null : l_ORGN_ODR_NO[0]) );
		struct.setList_l_ORGN_ODR_NO(TypeConverter.convert(l_ORGN_ODR_NO));
		struct.setl_ADD_ODR_FLG( ((l_ADD_ODR_FLG == null) ? (String)null : l_ADD_ODR_FLG[0]) );
		struct.setList_l_ADD_ODR_FLG(TypeConverter.convert(l_ADD_ODR_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KQ0010030.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aKQ0010030Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aKQ0010030Struct";   // JSP先のバインド名(Struct)の指定
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
					KQ0010030Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KQ0010030Control control;
		KQ0010030Entity  entity = null;
		KQ0010030Struct  struct = null;

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

			if( (control = (KQ0010030Control)so.getAttribute("KQ0010030Control_"+request.getSession(false).getId())) == null ) {
				control = new KQ0010030Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KQ0010030Control();
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
				} else if( isClick(request, "ApprAssort") ) {
					if ( !isCryptical(request, so, params, "ApprAssort") ) return ERROR_TARGET;
					target = onClickApprAssort(request, response, so, params, control);
					control.setButton("ApprAssort");
				} else if( isClick(request, "ReserveAssort") ) {
					if ( !isCryptical(request, so, params, "ReserveAssort") ) return ERROR_TARGET;
					target = onClickReserveAssort(request, response, so, params, control);
					control.setButton("ReserveAssort");
				} else if( isClick(request, "ReserveDelAssort") ) {
					if ( !isCryptical(request, so, params, "ReserveDelAssort") ) return ERROR_TARGET;
					target = onClickReserveDelAssort(request, response, so, params, control);
					control.setButton("ReserveDelAssort");
				} else if( isClick(request, "ApprDelAssort") ) {
					if ( !isCryptical(request, so, params, "ApprDelAssort") ) return ERROR_TARGET;
					target = onClickApprDelAssort(request, response, so, params, control);
					control.setButton("ApprDelAssort");
				} else if( isClick(request, "CheckAll") ) {
					if ( !isCryptical(request, so, params, "CheckAll") ) return ERROR_TARGET;
					target = onClickCheckAll(request, response, so, params, control);
					control.setButton("CheckAll");
				} else if( isClick(request, "CheckClear") ) {
					if ( !isCryptical(request, so, params, "CheckClear") ) return ERROR_TARGET;
					target = onClickCheckClear(request, response, so, params, control);
					control.setButton("CheckClear");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "ClickDetail") ) {
					if ( !isCryptical(request, so, params, "ClickDetail") ) return ERROR_TARGET;
					target = onClickClickDetail(request, response, so, params, control);
					control.setButton("ClickDetail");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KQ0010030Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "ApprAssort") && bFLG_DISCONNECT_ApprAssort)
				|| (isClick(request, "ReserveAssort") && bFLG_DISCONNECT_ReserveAssort)
				|| (isClick(request, "ReserveDelAssort") && bFLG_DISCONNECT_ReserveDelAssort)
				|| (isClick(request, "ApprDelAssort") && bFLG_DISCONNECT_ApprDelAssort)
				|| (isClick(request, "CheckAll") && bFLG_DISCONNECT_CheckAll)
				|| (isClick(request, "CheckClear") && bFLG_DISCONNECT_CheckClear)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "ClickDetail") && bFLG_DISCONNECT_ClickDetail)
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
	private  static boolean bFLG_DISCONNECT_ApprAssort = true;
	private  static boolean bFLG_DISCONNECT_ReserveAssort = true;
	private  static boolean bFLG_DISCONNECT_ReserveDelAssort = true;
	private  static boolean bFLG_DISCONNECT_ApprDelAssort = true;
	private  static boolean bFLG_DISCONNECT_CheckAll = true;
	private  static boolean bFLG_DISCONNECT_CheckClear = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_ClickDetail = true;

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
		return "com.nec.jp.orteus.metamorBase.KQ0010.KQ0010030Servlet";
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
	public KQ0010030Servlet()
	{
		//{{user_implement_dev:<KQ0010030_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_ApprAssort = true;
		bFLG_DISCONNECT_ReserveAssort = true;
		bFLG_DISCONNECT_ReserveDelAssort = true;
		bFLG_DISCONNECT_ApprDelAssort = true;
		bFLG_DISCONNECT_CheckAll = true;
		bFLG_DISCONNECT_CheckClear = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KQ0010030_DisConnect_FLG>

		//{{user_implement_dev:<KQ0010030Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<KQ0010030Servlet>
	}

	//////////////////////////////

}
