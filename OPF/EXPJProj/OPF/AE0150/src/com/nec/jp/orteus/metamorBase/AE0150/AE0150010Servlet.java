/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0150/src/com/nec/jp/orteus/metamorBase/AE0150/AE0150010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0150;

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
 * CLASS     : AE0150010Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AE0150010Servlet extends HttpServlet
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
	 * @param control AE0150010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AE0150010Control control)
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
	 * @param control AE0150010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AE0150010Control control)
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
	 * @param control AE0150010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
			logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "AE0150010"+" $Revision: 1.4 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AE0150010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("AE0150010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0150010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 選択更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0150010Controlクラスインスタンス
	 */
	public String onClickUpdateAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdateAssort");
		//{{user_implement_dev:<onClickUpdateAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("UpdateAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdateAssort>
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdateAssort");

		return nextUrl;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0150010Controlクラスインスタンス
	 */
	public String onClickCheckAll(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");
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
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");

		return nextUrl;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0150010Controlクラスインスタンス
	 */
	public String onClickCheckClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");
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
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0150010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0150010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AE0150010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] r_APPR_1 = ((params.containsKey("r_APPR_1")) ? (String[])params.get("r_APPR_1") : (String[])null);
		String[] r_APPR_2 = ((params.containsKey("r_APPR_2")) ? (String[])params.get("r_APPR_2") : (String[])null);
		String[] r_APPR_3 = ((params.containsKey("r_APPR_3")) ? (String[])params.get("r_APPR_3") : (String[])null);
		String[] r_APPR_4 = ((params.containsKey("r_APPR_4")) ? (String[])params.get("r_APPR_4") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] h_APPR_POWER_TYP = ((params.containsKey("h_APPR_POWER_TYP")) ? (String[])params.get("h_APPR_POWER_TYP") : (String[])null);
		String[] INSPC_DATE_FROM = ((params.containsKey("INSPC_DATE_FROM")) ? (String[])params.get("INSPC_DATE_FROM") : (String[])null);
		String[] INSPC_DATE_TO = ((params.containsKey("INSPC_DATE_TO")) ? (String[])params.get("INSPC_DATE_TO") : (String[])null);
		String[] RESERVE_CAUSE = ((params.containsKey("RESERVE_CAUSE")) ? (String[])params.get("RESERVE_CAUSE") : (String[])null);
		String[] l_APPR_ID = ((params.containsKey("l_APPR_ID")) ? (String[])params.get("l_APPR_ID") : (String[])null);
		String[] l_APPR_DATE = ((params.containsKey("l_APPR_DATE")) ? (String[])params.get("l_APPR_DATE") : (String[])null);
		String[] l_RESERVE_CAUSE = ((params.containsKey("l_RESERVE_CAUSE")) ? (String[])params.get("l_RESERVE_CAUSE") : (String[])null);
		String[] l_PUCH_ODR_CD = ((params.containsKey("l_PUCH_ODR_CD")) ? (String[])params.get("l_PUCH_ODR_CD") : (String[])null);
		String[] l_ACPT_NO = ((params.containsKey("l_ACPT_NO")) ? (String[])params.get("l_ACPT_NO") : (String[])null);
		String[] l_INSPC_ACPT_NO = ((params.containsKey("l_INSPC_ACPT_NO")) ? (String[])params.get("l_INSPC_ACPT_NO") : (String[])null);
		String[] l_CRCT_TYP = ((params.containsKey("l_CRCT_TYP")) ? (String[])params.get("l_CRCT_TYP") : (String[])null);
		String[] l_INSPC_ACPT_DATE = ((params.containsKey("l_INSPC_ACPT_DATE")) ? (String[])params.get("l_INSPC_ACPT_DATE") : (String[])null);
		String[] l_ACPT_DATE = ((params.containsKey("l_ACPT_DATE")) ? (String[])params.get("l_ACPT_DATE") : (String[])null);
		String[] l_VEND_CD = ((params.containsKey("l_VEND_CD")) ? (String[])params.get("l_VEND_CD") : (String[])null);
		String[] l_VEND_NAME = ((params.containsKey("l_VEND_NAME")) ? (String[])params.get("l_VEND_NAME") : (String[])null);
		String[] l_PLANT_CD = ((params.containsKey("l_PLANT_CD")) ? (String[])params.get("l_PLANT_CD") : (String[])null);
		String[] l_PLANT_NAME = ((params.containsKey("l_PLANT_NAME")) ? (String[])params.get("l_PLANT_NAME") : (String[])null);
		String[] l_GNR_ORG_CD = ((params.containsKey("l_GNR_ORG_CD")) ? (String[])params.get("l_GNR_ORG_CD") : (String[])null);
		String[] l_GNR_ORG_NAME = ((params.containsKey("l_GNR_ORG_NAME")) ? (String[])params.get("l_GNR_ORG_NAME") : (String[])null);
		String[] l_DLV_CD = ((params.containsKey("l_DLV_CD")) ? (String[])params.get("l_DLV_CD") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_PRODUCT_TYP = ((params.containsKey("l_PRODUCT_TYP")) ? (String[])params.get("l_PRODUCT_TYP") : (String[])null);
		String[] l_WORK_IN_PROC_CD = ((params.containsKey("l_WORK_IN_PROC_CD")) ? (String[])params.get("l_WORK_IN_PROC_CD") : (String[])null);
		String[] l_UNIT_COST = ((params.containsKey("l_UNIT_COST")) ? (String[])params.get("l_UNIT_COST") : (String[])null);
		String[] l_UNIT_COST_TYP = ((params.containsKey("l_UNIT_COST_TYP")) ? (String[])params.get("l_UNIT_COST_TYP") : (String[])null);
		String[] l_PROCESSING_COST = ((params.containsKey("l_PROCESSING_COST")) ? (String[])params.get("l_PROCESSING_COST") : (String[])null);
		String[] l_MATERIAL_COST = ((params.containsKey("l_MATERIAL_COST")) ? (String[])params.get("l_MATERIAL_COST") : (String[])null);
		String[] l_OTHER_OVERHEADS = ((params.containsKey("l_OTHER_OVERHEADS")) ? (String[])params.get("l_OTHER_OVERHEADS") : (String[])null);
		String[] l_ACPT_QTY_2 = ((params.containsKey("l_ACPT_QTY_2")) ? (String[])params.get("l_ACPT_QTY_2") : (String[])null);
		String[] l_INSPC_ACPT_QTY = ((params.containsKey("l_INSPC_ACPT_QTY")) ? (String[])params.get("l_INSPC_ACPT_QTY") : (String[])null);
		String[] l_STOCK_UNIT = ((params.containsKey("l_STOCK_UNIT")) ? (String[])params.get("l_STOCK_UNIT") : (String[])null);
		String[] l_INSPC_ACPT_AMOUNT = ((params.containsKey("l_INSPC_ACPT_AMOUNT")) ? (String[])params.get("l_INSPC_ACPT_AMOUNT") : (String[])null);
		String[] l_DISC_AMOUNT = ((params.containsKey("l_DISC_AMOUNT")) ? (String[])params.get("l_DISC_AMOUNT") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_JOB_ODR_DETAIL_NO = ((params.containsKey("l_JOB_ODR_DETAIL_NO")) ? (String[])params.get("l_JOB_ODR_DETAIL_NO") : (String[])null);
		String[] l_MANAGEMENT_CD = ((params.containsKey("l_MANAGEMENT_CD")) ? (String[])params.get("l_MANAGEMENT_CD") : (String[])null);
		String[] l_SBCNT_PUCH_TYP = ((params.containsKey("l_SBCNT_PUCH_TYP")) ? (String[])params.get("l_SBCNT_PUCH_TYP") : (String[])null);
		String[] l_INV_CTRL_FLG = ((params.containsKey("l_INV_CTRL_FLG")) ? (String[])params.get("l_INV_CTRL_FLG") : (String[])null);
		String[] l_SLIP_TYP = ((params.containsKey("l_SLIP_TYP")) ? (String[])params.get("l_SLIP_TYP") : (String[])null);
		String[] l_PUCH_RTN_FLG = ((params.containsKey("l_PUCH_RTN_FLG")) ? (String[])params.get("l_PUCH_RTN_FLG") : (String[])null);
		String[] l_MODIFY_COUNT = ((params.containsKey("l_MODIFY_COUNT")) ? (String[])params.get("l_MODIFY_COUNT") : (String[])null);
		String[] l_ROWNO = ((params.containsKey("l_ROWNO")) ? (String[])params.get("l_ROWNO") : (String[])null);
		String[] l_AI_AP_IF_FLG = ((params.containsKey("l_AI_AP_IF_FLG")) ? (String[])params.get("l_AI_AP_IF_FLG") : (String[])null);

		struct.setr_APPR_1( ((r_APPR_1 == null) ? (String)null : r_APPR_1[0]) );
		struct.setList_r_APPR_1(TypeConverter.convert(r_APPR_1));
		struct.setr_APPR_2( ((r_APPR_2 == null) ? (String)null : r_APPR_2[0]) );
		struct.setList_r_APPR_2(TypeConverter.convert(r_APPR_2));
		struct.setr_APPR_3( ((r_APPR_3 == null) ? (String)null : r_APPR_3[0]) );
		struct.setList_r_APPR_3(TypeConverter.convert(r_APPR_3));
		struct.setr_APPR_4( ((r_APPR_4 == null) ? (String)null : r_APPR_4[0]) );
		struct.setList_r_APPR_4(TypeConverter.convert(r_APPR_4));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.seth_APPR_POWER_TYP( ((h_APPR_POWER_TYP == null) ? (String)null : h_APPR_POWER_TYP[0]) );
		struct.setList_h_APPR_POWER_TYP(TypeConverter.convert(h_APPR_POWER_TYP));
		struct.setINSPC_DATE_FROM( ((INSPC_DATE_FROM == null) ? (String)null : INSPC_DATE_FROM[0]) );
		struct.setList_INSPC_DATE_FROM(TypeConverter.convert(INSPC_DATE_FROM));
		struct.setINSPC_DATE_TO( ((INSPC_DATE_TO == null) ? (String)null : INSPC_DATE_TO[0]) );
		struct.setList_INSPC_DATE_TO(TypeConverter.convert(INSPC_DATE_TO));
		struct.setRESERVE_CAUSE( ((RESERVE_CAUSE == null) ? (String)null : RESERVE_CAUSE[0]) );
		struct.setList_RESERVE_CAUSE(TypeConverter.convert(RESERVE_CAUSE));
		struct.setl_APPR_ID( ((l_APPR_ID == null) ? (String)null : l_APPR_ID[0]) );
		struct.setList_l_APPR_ID(TypeConverter.convert(l_APPR_ID));
		struct.setl_APPR_DATE( ((l_APPR_DATE == null) ? (String)null : l_APPR_DATE[0]) );
		struct.setList_l_APPR_DATE(TypeConverter.convert(l_APPR_DATE));
		struct.setl_RESERVE_CAUSE( ((l_RESERVE_CAUSE == null) ? (String)null : l_RESERVE_CAUSE[0]) );
		struct.setList_l_RESERVE_CAUSE(TypeConverter.convert(l_RESERVE_CAUSE));
		struct.setl_PUCH_ODR_CD( ((l_PUCH_ODR_CD == null) ? (String)null : l_PUCH_ODR_CD[0]) );
		struct.setList_l_PUCH_ODR_CD(TypeConverter.convert(l_PUCH_ODR_CD));
		struct.setl_ACPT_NO( ((l_ACPT_NO == null) ? (String)null : l_ACPT_NO[0]) );
		struct.setList_l_ACPT_NO(TypeConverter.convert(l_ACPT_NO));
		struct.setl_INSPC_ACPT_NO( ((l_INSPC_ACPT_NO == null) ? (String)null : l_INSPC_ACPT_NO[0]) );
		struct.setList_l_INSPC_ACPT_NO(TypeConverter.convert(l_INSPC_ACPT_NO));
		struct.setl_CRCT_TYP( ((l_CRCT_TYP == null) ? (String)null : l_CRCT_TYP[0]) );
		struct.setList_l_CRCT_TYP(TypeConverter.convert(l_CRCT_TYP));
		struct.setl_INSPC_ACPT_DATE( ((l_INSPC_ACPT_DATE == null) ? (String)null : l_INSPC_ACPT_DATE[0]) );
		struct.setList_l_INSPC_ACPT_DATE(TypeConverter.convert(l_INSPC_ACPT_DATE));
		struct.setl_ACPT_DATE( ((l_ACPT_DATE == null) ? (String)null : l_ACPT_DATE[0]) );
		struct.setList_l_ACPT_DATE(TypeConverter.convert(l_ACPT_DATE));
		struct.setl_VEND_CD( ((l_VEND_CD == null) ? (String)null : l_VEND_CD[0]) );
		struct.setList_l_VEND_CD(TypeConverter.convert(l_VEND_CD));
		struct.setl_VEND_NAME( ((l_VEND_NAME == null) ? (String)null : l_VEND_NAME[0]) );
		struct.setList_l_VEND_NAME(TypeConverter.convert(l_VEND_NAME));
		struct.setl_PLANT_CD( ((l_PLANT_CD == null) ? (String)null : l_PLANT_CD[0]) );
		struct.setList_l_PLANT_CD(TypeConverter.convert(l_PLANT_CD));
		struct.setl_PLANT_NAME( ((l_PLANT_NAME == null) ? (String)null : l_PLANT_NAME[0]) );
		struct.setList_l_PLANT_NAME(TypeConverter.convert(l_PLANT_NAME));
		struct.setl_GNR_ORG_CD( ((l_GNR_ORG_CD == null) ? (String)null : l_GNR_ORG_CD[0]) );
		struct.setList_l_GNR_ORG_CD(TypeConverter.convert(l_GNR_ORG_CD));
		struct.setl_GNR_ORG_NAME( ((l_GNR_ORG_NAME == null) ? (String)null : l_GNR_ORG_NAME[0]) );
		struct.setList_l_GNR_ORG_NAME(TypeConverter.convert(l_GNR_ORG_NAME));
		struct.setl_DLV_CD( ((l_DLV_CD == null) ? (String)null : l_DLV_CD[0]) );
		struct.setList_l_DLV_CD(TypeConverter.convert(l_DLV_CD));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_PRODUCT_TYP( ((l_PRODUCT_TYP == null) ? (String)null : l_PRODUCT_TYP[0]) );
		struct.setList_l_PRODUCT_TYP(TypeConverter.convert(l_PRODUCT_TYP));
		struct.setl_WORK_IN_PROC_CD( ((l_WORK_IN_PROC_CD == null) ? (String)null : l_WORK_IN_PROC_CD[0]) );
		struct.setList_l_WORK_IN_PROC_CD(TypeConverter.convert(l_WORK_IN_PROC_CD));
		struct.setl_UNIT_COST( ((l_UNIT_COST == null) ? (String)null : l_UNIT_COST[0]) );
		struct.setList_l_UNIT_COST(TypeConverter.convert(l_UNIT_COST));
		struct.setl_UNIT_COST_TYP( ((l_UNIT_COST_TYP == null) ? (String)null : l_UNIT_COST_TYP[0]) );
		struct.setList_l_UNIT_COST_TYP(TypeConverter.convert(l_UNIT_COST_TYP));
		struct.setl_PROCESSING_COST( ((l_PROCESSING_COST == null) ? (String)null : l_PROCESSING_COST[0]) );
		struct.setList_l_PROCESSING_COST(TypeConverter.convert(l_PROCESSING_COST));
		struct.setl_MATERIAL_COST( ((l_MATERIAL_COST == null) ? (String)null : l_MATERIAL_COST[0]) );
		struct.setList_l_MATERIAL_COST(TypeConverter.convert(l_MATERIAL_COST));
		struct.setl_OTHER_OVERHEADS( ((l_OTHER_OVERHEADS == null) ? (String)null : l_OTHER_OVERHEADS[0]) );
		struct.setList_l_OTHER_OVERHEADS(TypeConverter.convert(l_OTHER_OVERHEADS));
		struct.setl_ACPT_QTY_2( ((l_ACPT_QTY_2 == null) ? (String)null : l_ACPT_QTY_2[0]) );
		struct.setList_l_ACPT_QTY_2(TypeConverter.convert(l_ACPT_QTY_2));
		struct.setl_INSPC_ACPT_QTY( ((l_INSPC_ACPT_QTY == null) ? (String)null : l_INSPC_ACPT_QTY[0]) );
		struct.setList_l_INSPC_ACPT_QTY(TypeConverter.convert(l_INSPC_ACPT_QTY));
		struct.setl_STOCK_UNIT( ((l_STOCK_UNIT == null) ? (String)null : l_STOCK_UNIT[0]) );
		struct.setList_l_STOCK_UNIT(TypeConverter.convert(l_STOCK_UNIT));
		struct.setl_INSPC_ACPT_AMOUNT( ((l_INSPC_ACPT_AMOUNT == null) ? (String)null : l_INSPC_ACPT_AMOUNT[0]) );
		struct.setList_l_INSPC_ACPT_AMOUNT(TypeConverter.convert(l_INSPC_ACPT_AMOUNT));
		struct.setl_DISC_AMOUNT( ((l_DISC_AMOUNT == null) ? (String)null : l_DISC_AMOUNT[0]) );
		struct.setList_l_DISC_AMOUNT(TypeConverter.convert(l_DISC_AMOUNT));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_JOB_ODR_DETAIL_NO( ((l_JOB_ODR_DETAIL_NO == null) ? (String)null : l_JOB_ODR_DETAIL_NO[0]) );
		struct.setList_l_JOB_ODR_DETAIL_NO(TypeConverter.convert(l_JOB_ODR_DETAIL_NO));
		struct.setl_MANAGEMENT_CD( ((l_MANAGEMENT_CD == null) ? (String)null : l_MANAGEMENT_CD[0]) );
		struct.setList_l_MANAGEMENT_CD(TypeConverter.convert(l_MANAGEMENT_CD));
		struct.setl_SBCNT_PUCH_TYP( ((l_SBCNT_PUCH_TYP == null) ? (String)null : l_SBCNT_PUCH_TYP[0]) );
		struct.setList_l_SBCNT_PUCH_TYP(TypeConverter.convert(l_SBCNT_PUCH_TYP));
		struct.setl_INV_CTRL_FLG( ((l_INV_CTRL_FLG == null) ? (String)null : l_INV_CTRL_FLG[0]) );
		struct.setList_l_INV_CTRL_FLG(TypeConverter.convert(l_INV_CTRL_FLG));
		struct.setl_SLIP_TYP( ((l_SLIP_TYP == null) ? (String)null : l_SLIP_TYP[0]) );
		struct.setList_l_SLIP_TYP(TypeConverter.convert(l_SLIP_TYP));
		struct.setl_PUCH_RTN_FLG( ((l_PUCH_RTN_FLG == null) ? (String)null : l_PUCH_RTN_FLG[0]) );
		struct.setList_l_PUCH_RTN_FLG(TypeConverter.convert(l_PUCH_RTN_FLG));
		struct.setl_MODIFY_COUNT( ((l_MODIFY_COUNT == null) ? (String)null : l_MODIFY_COUNT[0]) );
		struct.setList_l_MODIFY_COUNT(TypeConverter.convert(l_MODIFY_COUNT));
		struct.setl_ROWNO( ((l_ROWNO == null) ? (String)null : l_ROWNO[0]) );
		struct.setList_l_ROWNO(TypeConverter.convert(l_ROWNO));
		struct.setl_AI_AP_IF_FLG( ((l_AI_AP_IF_FLG == null) ? (String)null : l_AI_AP_IF_FLG[0]) );
		struct.setList_l_AI_AP_IF_FLG(TypeConverter.convert(l_AI_AP_IF_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AE0150010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAE0150010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAE0150010Struct";   // JSP先のバインド名(Struct)の指定
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
					AE0150010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0150010Entity entity = control.entity;
		AE0150010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AE0150010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AE0150010Control control;
		AE0150010Entity  entity = null;
		AE0150010Struct  struct = null;

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

			if( (control = (AE0150010Control)so.getAttribute("AE0150010Control_"+request.getSession(false).getId())) == null ) {
				control = new AE0150010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AE0150010Control();
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
				} else if( isClick(request, "UpdateAssort") ) {
					if ( !isCryptical(request, so, params, "UpdateAssort") ) return ERROR_TARGET;
					target = onClickUpdateAssort(request, response, so, params, control);
					control.setButton("UpdateAssort");
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
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AE0150010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "UpdateAssort") && bFLG_DISCONNECT_UpdateAssort)
				|| (isClick(request, "CheckAll") && bFLG_DISCONNECT_CheckAll)
				|| (isClick(request, "CheckClear") && bFLG_DISCONNECT_CheckClear)
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
	private  static boolean bFLG_DISCONNECT_UpdateAssort = true;
	private  static boolean bFLG_DISCONNECT_CheckAll = true;
	private  static boolean bFLG_DISCONNECT_CheckClear = true;
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
		return "com.nec.jp.orteus.metamorBase.AE0150.AE0150010Servlet";
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
	public AE0150010Servlet()
	{
		//{{user_implement_dev:<AE0150010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_UpdateAssort = true;
		bFLG_DISCONNECT_CheckAll = true;
		bFLG_DISCONNECT_CheckClear = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<AE0150010_DisConnect_FLG>

		//{{user_implement_dev:<AE0150010Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AE0150010Servlet>
	}

	//////////////////////////////

}
