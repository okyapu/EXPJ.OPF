/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/src/com/nec/jp/orteus/metamorBase/AZ0060/AZ0060010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0060;

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
 * CLASS     : AZ0060010Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AZ0060010Servlet extends HttpServlet
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
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AZ0060010Control control)
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
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AZ0060010Control control)
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
	 * @param control AZ0060010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
			logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "AZ0060010"+" $Revision: 1.14 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AZ0060010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("AZ0060010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 選択承認ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickApprAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickApprAssort");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickApprAssort");

		return nextUrl;
	}

	/**
	 * 選択保留ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickReserveAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickReserveAssort");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickReserveAssort");

		return nextUrl;
	}

	/**
	 * 選択保留解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickReserveDelAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickReserveDelAssort");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickReserveDelAssort");

		return nextUrl;
	}

	/**
	 * 選択依頼削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickApprDelAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickApprDelAssort");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickApprDelAssort");

		return nextUrl;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickCheckAll(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");

		return nextUrl;
	}

	/**
	 * 変更前ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickMastInfo(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickMastInfo");
		//{{user_implement_dev:<onClickMastInfo>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("MastInfo");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickMastInfo>
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickMastInfo");

		return nextUrl;
	}

	/**
	 * 変更後ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickApprInfo(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickApprInfo");
		//{{user_implement_dev:<onClickApprInfo>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ApprInfo");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickApprInfo>
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickApprInfo");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * ClickShowボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickClickShow(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AZ0060010iframe.jsp";		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");
		//{{user_implement_dev:<onClickClickShow>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ClickShow");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClickShow>
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");

		return nextUrl;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0060010Controlクラスインスタンス
	 */
	public String onClickClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AZ0060010Detail.jsp";		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClickDetail");
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
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClickDetail");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AZ0060010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] r1_FILTER1 = ((params.containsKey("r1_FILTER1")) ? (String[])params.get("r1_FILTER1") : (String[])null);
		String[] r2_FILTER1 = ((params.containsKey("r2_FILTER1")) ? (String[])params.get("r2_FILTER1") : (String[])null);
		String[] r3_FILTER1 = ((params.containsKey("r3_FILTER1")) ? (String[])params.get("r3_FILTER1") : (String[])null);
		String[] RESERVE_CAUSE = ((params.containsKey("RESERVE_CAUSE")) ? (String[])params.get("RESERVE_CAUSE") : (String[])null);
		String[] h_SELECT_TYP = ((params.containsKey("h_SELECT_TYP")) ? (String[])params.get("h_SELECT_TYP") : (String[])null);
		String[] l_SCREEN_NAME = ((params.containsKey("l_SCREEN_NAME")) ? (String[])params.get("l_SCREEN_NAME") : (String[])null);
		String[] l_REQUEST_COUNT = ((params.containsKey("l_REQUEST_COUNT")) ? (String[])params.get("l_REQUEST_COUNT") : (String[])null);
		String[] l_APPRING_COUNT = ((params.containsKey("l_APPRING_COUNT")) ? (String[])params.get("l_APPRING_COUNT") : (String[])null);
		String[] l_RESERVE_COUNT = ((params.containsKey("l_RESERVE_COUNT")) ? (String[])params.get("l_RESERVE_COUNT") : (String[])null);
		String[] h_APPR_ID = ((params.containsKey("h_APPR_ID")) ? (String[])params.get("h_APPR_ID") : (String[])null);
		String[] l_APPR_REMARKS = ((params.containsKey("l_APPR_REMARKS")) ? (String[])params.get("l_APPR_REMARKS") : (String[])null);
		String[] l_REQUEST_BY = ((params.containsKey("l_REQUEST_BY")) ? (String[])params.get("l_REQUEST_BY") : (String[])null);
		String[] l_REQUEST_DATE = ((params.containsKey("l_REQUEST_DATE")) ? (String[])params.get("l_REQUEST_DATE") : (String[])null);
		String[] l_ITEM_COL1 = ((params.containsKey("l_ITEM_COL1")) ? (String[])params.get("l_ITEM_COL1") : (String[])null);
		String[] l_ITEM_COL2 = ((params.containsKey("l_ITEM_COL2")) ? (String[])params.get("l_ITEM_COL2") : (String[])null);
		String[] l_ITEM_COL3 = ((params.containsKey("l_ITEM_COL3")) ? (String[])params.get("l_ITEM_COL3") : (String[])null);
		String[] l_ITEM_COL4 = ((params.containsKey("l_ITEM_COL4")) ? (String[])params.get("l_ITEM_COL4") : (String[])null);
		String[] l_ITEM_COL5 = ((params.containsKey("l_ITEM_COL5")) ? (String[])params.get("l_ITEM_COL5") : (String[])null);
		String[] l_PROC_TYP_VALUE = ((params.containsKey("l_PROC_TYP_VALUE")) ? (String[])params.get("l_PROC_TYP_VALUE") : (String[])null);
		String[] h_PROC_TYP = ((params.containsKey("h_PROC_TYP")) ? (String[])params.get("h_PROC_TYP") : (String[])null);
		String[] h_STATUS = ((params.containsKey("h_STATUS")) ? (String[])params.get("h_STATUS") : (String[])null);
		String[] h_SCREEN_URL = ((params.containsKey("h_SCREEN_URL")) ? (String[])params.get("h_SCREEN_URL") : (String[])null);
		String[] d_OLD_USER_CD = ((params.containsKey("d_OLD_USER_CD")) ? (String[])params.get("d_OLD_USER_CD") : (String[])null);
		String[] d_NEW_USER_CD = ((params.containsKey("d_NEW_USER_CD")) ? (String[])params.get("d_NEW_USER_CD") : (String[])null);
		String[] d_USER_CD_CHANGE = ((params.containsKey("d_USER_CD_CHANGE")) ? (String[])params.get("d_USER_CD_CHANGE") : (String[])null);
		String[] d_OLD_USER_NAME = ((params.containsKey("d_OLD_USER_NAME")) ? (String[])params.get("d_OLD_USER_NAME") : (String[])null);
		String[] d_NEW_USER_NAME = ((params.containsKey("d_NEW_USER_NAME")) ? (String[])params.get("d_NEW_USER_NAME") : (String[])null);
		String[] d_USER_NAME_CHANGE = ((params.containsKey("d_USER_NAME_CHANGE")) ? (String[])params.get("d_USER_NAME_CHANGE") : (String[])null);
		String[] d_OLD_PLANT_CD = ((params.containsKey("d_OLD_PLANT_CD")) ? (String[])params.get("d_OLD_PLANT_CD") : (String[])null);
		String[] d_NEW_PLANT_CD = ((params.containsKey("d_NEW_PLANT_CD")) ? (String[])params.get("d_NEW_PLANT_CD") : (String[])null);
		String[] d_PLANT_CD_CHANGE = ((params.containsKey("d_PLANT_CD_CHANGE")) ? (String[])params.get("d_PLANT_CD_CHANGE") : (String[])null);
		String[] d_OLD_PASSWORD = ((params.containsKey("d_OLD_PASSWORD")) ? (String[])params.get("d_OLD_PASSWORD") : (String[])null);
		String[] d_NEW_PASSWORD = ((params.containsKey("d_NEW_PASSWORD")) ? (String[])params.get("d_NEW_PASSWORD") : (String[])null);
		String[] d_PASSWORD_CHANGE = ((params.containsKey("d_PASSWORD_CHANGE")) ? (String[])params.get("d_PASSWORD_CHANGE") : (String[])null);
		String[] d_OLD_APPR_POWER_TYP = ((params.containsKey("d_OLD_APPR_POWER_TYP")) ? (String[])params.get("d_OLD_APPR_POWER_TYP") : (String[])null);
		String[] d_NEW_APPR_POWER_TYP = ((params.containsKey("d_NEW_APPR_POWER_TYP")) ? (String[])params.get("d_NEW_APPR_POWER_TYP") : (String[])null);
		String[] d_OLD_ADDRESS = ((params.containsKey("d_OLD_ADDRESS")) ? (String[])params.get("d_OLD_ADDRESS") : (String[])null);
		String[] d_NEW_ADDRESS = ((params.containsKey("d_NEW_ADDRESS")) ? (String[])params.get("d_NEW_ADDRESS") : (String[])null);
		String[] d_ADDRESS_CHANGE = ((params.containsKey("d_ADDRESS_CHANGE")) ? (String[])params.get("d_ADDRESS_CHANGE") : (String[])null);
		String[] d_OLD_LOCALE = ((params.containsKey("d_OLD_LOCALE")) ? (String[])params.get("d_OLD_LOCALE") : (String[])null);
		String[] d_NEW_LOCALE = ((params.containsKey("d_NEW_LOCALE")) ? (String[])params.get("d_NEW_LOCALE") : (String[])null);
		String[] d_LOCALE_CHANGE = ((params.containsKey("d_LOCALE_CHANGE")) ? (String[])params.get("d_LOCALE_CHANGE") : (String[])null);
		String[] l_RESERVE_CAUSE = ((params.containsKey("l_RESERVE_CAUSE")) ? (String[])params.get("l_RESERVE_CAUSE") : (String[])null);
		String[] h_REQUEST_APPR_SAME = ((params.containsKey("h_REQUEST_APPR_SAME")) ? (String[])params.get("h_REQUEST_APPR_SAME") : (String[])null);
		String[] h_MODIFY_COUNT = ((params.containsKey("h_MODIFY_COUNT")) ? (String[])params.get("h_MODIFY_COUNT") : (String[])null);
		String[] h_APPR_POWER_TYP = ((params.containsKey("h_APPR_POWER_TYP")) ? (String[])params.get("h_APPR_POWER_TYP") : (String[])null);
		String[] d_OLD_ITEM_CD = ((params.containsKey("d_OLD_ITEM_CD")) ? (String[])params.get("d_OLD_ITEM_CD") : (String[])null);
		String[] d_NEW_ITEM_CD = ((params.containsKey("d_NEW_ITEM_CD")) ? (String[])params.get("d_NEW_ITEM_CD") : (String[])null);
		String[] d_ITEM_CD_CHANGE = ((params.containsKey("d_ITEM_CD_CHANGE")) ? (String[])params.get("d_ITEM_CD_CHANGE") : (String[])null);
		String[] d_OLD_CUST_CD = ((params.containsKey("d_OLD_CUST_CD")) ? (String[])params.get("d_OLD_CUST_CD") : (String[])null);
		String[] d_NEW_CUST_CD = ((params.containsKey("d_NEW_CUST_CD")) ? (String[])params.get("d_NEW_CUST_CD") : (String[])null);
		String[] d_CUST_CD_CHANGE = ((params.containsKey("d_CUST_CD_CHANGE")) ? (String[])params.get("d_CUST_CD_CHANGE") : (String[])null);
		String[] d_OLD_EFF_PHASE_IN_DATE = ((params.containsKey("d_OLD_EFF_PHASE_IN_DATE")) ? (String[])params.get("d_OLD_EFF_PHASE_IN_DATE") : (String[])null);
		String[] d_NEW_EFF_PHASE_IN_DATE = ((params.containsKey("d_NEW_EFF_PHASE_IN_DATE")) ? (String[])params.get("d_NEW_EFF_PHASE_IN_DATE") : (String[])null);
		String[] d_EFF_PHASE_IN_DATE_CHANGE = ((params.containsKey("d_EFF_PHASE_IN_DATE_CHANGE")) ? (String[])params.get("d_EFF_PHASE_IN_DATE_CHANGE") : (String[])null);
		String[] d_NEW_UNIT_COST_TYP = ((params.containsKey("d_NEW_UNIT_COST_TYP")) ? (String[])params.get("d_NEW_UNIT_COST_TYP") : (String[])null);
		String[] d_UNIT_COST_TYP_CHANGE = ((params.containsKey("d_UNIT_COST_TYP_CHANGE")) ? (String[])params.get("d_UNIT_COST_TYP_CHANGE") : (String[])null);
		String[] d_OLD_UNIT_COST = ((params.containsKey("d_OLD_UNIT_COST")) ? (String[])params.get("d_OLD_UNIT_COST") : (String[])null);
		String[] d_NEW_UNIT_COST = ((params.containsKey("d_NEW_UNIT_COST")) ? (String[])params.get("d_NEW_UNIT_COST") : (String[])null);
		String[] d_UNIT_COST_CHANGE = ((params.containsKey("d_UNIT_COST_CHANGE")) ? (String[])params.get("d_UNIT_COST_CHANGE") : (String[])null);
		String[] d_OLD_UNIT_COST_TYP = ((params.containsKey("d_OLD_UNIT_COST_TYP")) ? (String[])params.get("d_OLD_UNIT_COST_TYP") : (String[])null);
		String[] d_APPR_POWER_TYP_CHANGE = ((params.containsKey("d_APPR_POWER_TYP_CHANGE")) ? (String[])params.get("d_APPR_POWER_TYP_CHANGE") : (String[])null);
		String[] d_OLD_VEND_CD = ((params.containsKey("d_OLD_VEND_CD")) ? (String[])params.get("d_OLD_VEND_CD") : (String[])null);
		String[] d_NEW_VEND_CD = ((params.containsKey("d_NEW_VEND_CD")) ? (String[])params.get("d_NEW_VEND_CD") : (String[])null);
		String[] d_VEND_CD_CHANGE = ((params.containsKey("d_VEND_CD_CHANGE")) ? (String[])params.get("d_VEND_CD_CHANGE") : (String[])null);
		String[] d_OLD_ONEROUS_FLG = ((params.containsKey("d_OLD_ONEROUS_FLG")) ? (String[])params.get("d_OLD_ONEROUS_FLG") : (String[])null);
		String[] d_NEW_ONEROUS_FLG = ((params.containsKey("d_NEW_ONEROUS_FLG")) ? (String[])params.get("d_NEW_ONEROUS_FLG") : (String[])null);
		String[] d_ONEROUS_FLG_CHANGE = ((params.containsKey("d_ONEROUS_FLG_CHANGE")) ? (String[])params.get("d_ONEROUS_FLG_CHANGE") : (String[])null);
		String[] d_OLD_PROC_CD = ((params.containsKey("d_OLD_PROC_CD")) ? (String[])params.get("d_OLD_PROC_CD") : (String[])null);
		String[] d_NEW_PROC_CD = ((params.containsKey("d_NEW_PROC_CD")) ? (String[])params.get("d_NEW_PROC_CD") : (String[])null);
		String[] d_PROC_CD_CHANGE = ((params.containsKey("d_PROC_CD_CHANGE")) ? (String[])params.get("d_PROC_CD_CHANGE") : (String[])null);
		String[] d_OLD_PROCESSING_COST = ((params.containsKey("d_OLD_PROCESSING_COST")) ? (String[])params.get("d_OLD_PROCESSING_COST") : (String[])null);
		String[] d_NEW_PROCESSING_COST = ((params.containsKey("d_NEW_PROCESSING_COST")) ? (String[])params.get("d_NEW_PROCESSING_COST") : (String[])null);
		String[] d_PROCESSING_COST_CHANGE = ((params.containsKey("d_PROCESSING_COST_CHANGE")) ? (String[])params.get("d_PROCESSING_COST_CHANGE") : (String[])null);
		String[] d_OLD_MATERIAL_COST = ((params.containsKey("d_OLD_MATERIAL_COST")) ? (String[])params.get("d_OLD_MATERIAL_COST") : (String[])null);
		String[] d_NEW_MATERIAL_COST = ((params.containsKey("d_NEW_MATERIAL_COST")) ? (String[])params.get("d_NEW_MATERIAL_COST") : (String[])null);
		String[] d_MATERIAL_COST_CHANGE = ((params.containsKey("d_MATERIAL_COST_CHANGE")) ? (String[])params.get("d_MATERIAL_COST_CHANGE") : (String[])null);
		String[] d_OLD_OTHER_OVERHEADS = ((params.containsKey("d_OLD_OTHER_OVERHEADS")) ? (String[])params.get("d_OLD_OTHER_OVERHEADS") : (String[])null);
		String[] d_NEW_OTHER_OVERHEADS = ((params.containsKey("d_NEW_OTHER_OVERHEADS")) ? (String[])params.get("d_NEW_OTHER_OVERHEADS") : (String[])null);
		String[] d_OTHER_OVERHEADS_CHANGE = ((params.containsKey("d_OTHER_OVERHEADS_CHANGE")) ? (String[])params.get("d_OTHER_OVERHEADS_CHANGE") : (String[])null);
		String[] l_REQUEST_BY_NAME = ((params.containsKey("l_REQUEST_BY_NAME")) ? (String[])params.get("l_REQUEST_BY_NAME") : (String[])null);
		String[] h_KEY1 = ((params.containsKey("h_KEY1")) ? (String[])params.get("h_KEY1") : (String[])null);
		String[] h_VALUE1 = ((params.containsKey("h_VALUE1")) ? (String[])params.get("h_VALUE1") : (String[])null);
		String[] h_KEY2 = ((params.containsKey("h_KEY2")) ? (String[])params.get("h_KEY2") : (String[])null);
		String[] h_VALUE2 = ((params.containsKey("h_VALUE2")) ? (String[])params.get("h_VALUE2") : (String[])null);
		String[] h_KEY3 = ((params.containsKey("h_KEY3")) ? (String[])params.get("h_KEY3") : (String[])null);
		String[] h_VALUE3 = ((params.containsKey("h_VALUE3")) ? (String[])params.get("h_VALUE3") : (String[])null);
		String[] h_KEY4 = ((params.containsKey("h_KEY4")) ? (String[])params.get("h_KEY4") : (String[])null);
		String[] h_VALUE4 = ((params.containsKey("h_VALUE4")) ? (String[])params.get("h_VALUE4") : (String[])null);
		String[] h_KEY5 = ((params.containsKey("h_KEY5")) ? (String[])params.get("h_KEY5") : (String[])null);
		String[] h_VALUE5 = ((params.containsKey("h_VALUE5")) ? (String[])params.get("h_VALUE5") : (String[])null);
		String[] h_KEY6 = ((params.containsKey("h_KEY6")) ? (String[])params.get("h_KEY6") : (String[])null);
		String[] h_VALUE6 = ((params.containsKey("h_VALUE6")) ? (String[])params.get("h_VALUE6") : (String[])null);
		String[] h_KEY7 = ((params.containsKey("h_KEY7")) ? (String[])params.get("h_KEY7") : (String[])null);
		String[] h_VALUE7 = ((params.containsKey("h_VALUE7")) ? (String[])params.get("h_VALUE7") : (String[])null);
		String[] h_TABLE_NAME = ((params.containsKey("h_TABLE_NAME")) ? (String[])params.get("h_TABLE_NAME") : (String[])null);
		String[] d_OLD_VEND_ITEM_CD = ((params.containsKey("d_OLD_VEND_ITEM_CD")) ? (String[])params.get("d_OLD_VEND_ITEM_CD") : (String[])null);
		String[] d_NEW_VEND_ITEM_CD = ((params.containsKey("d_NEW_VEND_ITEM_CD")) ? (String[])params.get("d_NEW_VEND_ITEM_CD") : (String[])null);
		String[] d_VEND_ITEM_CD_CHANGE = ((params.containsKey("d_VEND_ITEM_CD_CHANGE")) ? (String[])params.get("d_VEND_ITEM_CD_CHANGE") : (String[])null);
		String[] d_OLD_PUCH_PRIORITY_REF_NO = ((params.containsKey("d_OLD_PUCH_PRIORITY_REF_NO")) ? (String[])params.get("d_OLD_PUCH_PRIORITY_REF_NO") : (String[])null);
		String[] d_NEW_PUCH_PRIORITY_REF_NO = ((params.containsKey("d_NEW_PUCH_PRIORITY_REF_NO")) ? (String[])params.get("d_NEW_PUCH_PRIORITY_REF_NO") : (String[])null);
		String[] d_PUCH_PRIORITY_REF_NO_CHANGE = ((params.containsKey("d_PUCH_PRIORITY_REF_NO_CHANGE")) ? (String[])params.get("d_PUCH_PRIORITY_REF_NO_CHANGE") : (String[])null);
		String[] d_OLD_PUCH_SIZE = ((params.containsKey("d_OLD_PUCH_SIZE")) ? (String[])params.get("d_OLD_PUCH_SIZE") : (String[])null);
		String[] d_NEW_PUCH_SIZE = ((params.containsKey("d_NEW_PUCH_SIZE")) ? (String[])params.get("d_NEW_PUCH_SIZE") : (String[])null);
		String[] d_PUCH_SIZE_CHANGE = ((params.containsKey("d_PUCH_SIZE_CHANGE")) ? (String[])params.get("d_PUCH_SIZE_CHANGE") : (String[])null);
		String[] d_OLD_VEND_NAME = ((params.containsKey("d_OLD_VEND_NAME")) ? (String[])params.get("d_OLD_VEND_NAME") : (String[])null);
		String[] d_NEW_VEND_NAME = ((params.containsKey("d_NEW_VEND_NAME")) ? (String[])params.get("d_NEW_VEND_NAME") : (String[])null);
		String[] d_VEND_NAME_CHANGE = ((params.containsKey("d_VEND_NAME_CHANGE")) ? (String[])params.get("d_VEND_NAME_CHANGE") : (String[])null);
		String[] d_OLD_VEND_ANAME = ((params.containsKey("d_OLD_VEND_ANAME")) ? (String[])params.get("d_OLD_VEND_ANAME") : (String[])null);
		String[] d_NEW_VEND_ANAME = ((params.containsKey("d_NEW_VEND_ANAME")) ? (String[])params.get("d_NEW_VEND_ANAME") : (String[])null);
		String[] d_OLD_ZIP_CD = ((params.containsKey("d_OLD_ZIP_CD")) ? (String[])params.get("d_OLD_ZIP_CD") : (String[])null);
		String[] d_NEW_ZIP_CD = ((params.containsKey("d_NEW_ZIP_CD")) ? (String[])params.get("d_NEW_ZIP_CD") : (String[])null);
		String[] d_ZIP_CD_CHANGE = ((params.containsKey("d_ZIP_CD_CHANGE")) ? (String[])params.get("d_ZIP_CD_CHANGE") : (String[])null);
		String[] d_OLD_ADDRESS_1 = ((params.containsKey("d_OLD_ADDRESS_1")) ? (String[])params.get("d_OLD_ADDRESS_1") : (String[])null);
		String[] d_NEW_ADDRESS_1 = ((params.containsKey("d_NEW_ADDRESS_1")) ? (String[])params.get("d_NEW_ADDRESS_1") : (String[])null);
		String[] d_ADDRESS_1_CHANGE = ((params.containsKey("d_ADDRESS_1_CHANGE")) ? (String[])params.get("d_ADDRESS_1_CHANGE") : (String[])null);
		String[] d_OLD_ADDRESS_2 = ((params.containsKey("d_OLD_ADDRESS_2")) ? (String[])params.get("d_OLD_ADDRESS_2") : (String[])null);
		String[] d_NEW_ADDRESS_2 = ((params.containsKey("d_NEW_ADDRESS_2")) ? (String[])params.get("d_NEW_ADDRESS_2") : (String[])null);
		String[] d_ADDRESS_2_CHANGE = ((params.containsKey("d_ADDRESS_2_CHANGE")) ? (String[])params.get("d_ADDRESS_2_CHANGE") : (String[])null);
		String[] d_OLD_ADDRESS_K_1 = ((params.containsKey("d_OLD_ADDRESS_K_1")) ? (String[])params.get("d_OLD_ADDRESS_K_1") : (String[])null);
		String[] d_NEW_ADDRESS_K_1 = ((params.containsKey("d_NEW_ADDRESS_K_1")) ? (String[])params.get("d_NEW_ADDRESS_K_1") : (String[])null);
		String[] d_ADDRESS_K_1_CHANGE = ((params.containsKey("d_ADDRESS_K_1_CHANGE")) ? (String[])params.get("d_ADDRESS_K_1_CHANGE") : (String[])null);
		String[] d_OLD_ADDRESS_K_2 = ((params.containsKey("d_OLD_ADDRESS_K_2")) ? (String[])params.get("d_OLD_ADDRESS_K_2") : (String[])null);
		String[] d_NEW_ADDRESS_K_2 = ((params.containsKey("d_NEW_ADDRESS_K_2")) ? (String[])params.get("d_NEW_ADDRESS_K_2") : (String[])null);
		String[] d_ADDRESS_K_2_CHANGE = ((params.containsKey("d_ADDRESS_K_2_CHANGE")) ? (String[])params.get("d_ADDRESS_K_2_CHANGE") : (String[])null);
		String[] d_OLD_TEL = ((params.containsKey("d_OLD_TEL")) ? (String[])params.get("d_OLD_TEL") : (String[])null);
		String[] d_NEW_TEL = ((params.containsKey("d_NEW_TEL")) ? (String[])params.get("d_NEW_TEL") : (String[])null);
		String[] d_TEL_CHANGE = ((params.containsKey("d_TEL_CHANGE")) ? (String[])params.get("d_TEL_CHANGE") : (String[])null);
		String[] d_OLD_FAX = ((params.containsKey("d_OLD_FAX")) ? (String[])params.get("d_OLD_FAX") : (String[])null);
		String[] d_NEW_FAX = ((params.containsKey("d_NEW_FAX")) ? (String[])params.get("d_NEW_FAX") : (String[])null);
		String[] d_FAX_CHANGE = ((params.containsKey("d_FAX_CHANGE")) ? (String[])params.get("d_FAX_CHANGE") : (String[])null);
		String[] d_OLD_EMAIL = ((params.containsKey("d_OLD_EMAIL")) ? (String[])params.get("d_OLD_EMAIL") : (String[])null);
		String[] d_NEW_EMAIL = ((params.containsKey("d_NEW_EMAIL")) ? (String[])params.get("d_NEW_EMAIL") : (String[])null);
		String[] d_EMAIL_CHANGE = ((params.containsKey("d_EMAIL_CHANGE")) ? (String[])params.get("d_EMAIL_CHANGE") : (String[])null);
		String[] d_OLD_VEND_ORG = ((params.containsKey("d_OLD_VEND_ORG")) ? (String[])params.get("d_OLD_VEND_ORG") : (String[])null);
		String[] d_NEW_VEND_ORG = ((params.containsKey("d_NEW_VEND_ORG")) ? (String[])params.get("d_NEW_VEND_ORG") : (String[])null);
		String[] d_VEND_ORG_CHANGE = ((params.containsKey("d_VEND_ORG_CHANGE")) ? (String[])params.get("d_VEND_ORG_CHANGE") : (String[])null);
		String[] d_OLD_VEND_PERSON = ((params.containsKey("d_OLD_VEND_PERSON")) ? (String[])params.get("d_OLD_VEND_PERSON") : (String[])null);
		String[] d_NEW_VEND_PERSON = ((params.containsKey("d_NEW_VEND_PERSON")) ? (String[])params.get("d_NEW_VEND_PERSON") : (String[])null);
		String[] d_VEND_PERSON_CHANGE = ((params.containsKey("d_VEND_PERSON_CHANGE")) ? (String[])params.get("d_VEND_PERSON_CHANGE") : (String[])null);
		String[] d_OLD_OWN_ORG_CD = ((params.containsKey("d_OLD_OWN_ORG_CD")) ? (String[])params.get("d_OLD_OWN_ORG_CD") : (String[])null);
		String[] d_NEW_OWN_ORG_CD = ((params.containsKey("d_NEW_OWN_ORG_CD")) ? (String[])params.get("d_NEW_OWN_ORG_CD") : (String[])null);
		String[] d_OWN_ORG_CD_CHANGE = ((params.containsKey("d_OWN_ORG_CD_CHANGE")) ? (String[])params.get("d_OWN_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_OWN_ORG_NAME = ((params.containsKey("d_OLD_OWN_ORG_NAME")) ? (String[])params.get("d_OLD_OWN_ORG_NAME") : (String[])null);
		String[] d_NEW_OWN_ORG_NAME = ((params.containsKey("d_NEW_OWN_ORG_NAME")) ? (String[])params.get("d_NEW_OWN_ORG_NAME") : (String[])null);
		String[] d_OWN_ORG_NAME_CHANGE = ((params.containsKey("d_OWN_ORG_NAME_CHANGE")) ? (String[])params.get("d_OWN_ORG_NAME_CHANGE") : (String[])null);
		String[] d_OLD_OWN_PERSON_CD = ((params.containsKey("d_OLD_OWN_PERSON_CD")) ? (String[])params.get("d_OLD_OWN_PERSON_CD") : (String[])null);
		String[] d_NEW_OWN_PERSON_CD = ((params.containsKey("d_NEW_OWN_PERSON_CD")) ? (String[])params.get("d_NEW_OWN_PERSON_CD") : (String[])null);
		String[] d_OWN_PERSON_CD_CHANGE = ((params.containsKey("d_OWN_PERSON_CD_CHANGE")) ? (String[])params.get("d_OWN_PERSON_CD_CHANGE") : (String[])null);
		String[] d_OLD_ROUND_TYP = ((params.containsKey("d_OLD_ROUND_TYP")) ? (String[])params.get("d_OLD_ROUND_TYP") : (String[])null);
		String[] d_NEW_ROUND_TYP = ((params.containsKey("d_NEW_ROUND_TYP")) ? (String[])params.get("d_NEW_ROUND_TYP") : (String[])null);
		String[] d_ROUND_TYP_CHANGE = ((params.containsKey("d_ROUND_TYP_CHANGE")) ? (String[])params.get("d_ROUND_TYP_CHANGE") : (String[])null);
		String[] d_OLD_TAX_CD = ((params.containsKey("d_OLD_TAX_CD")) ? (String[])params.get("d_OLD_TAX_CD") : (String[])null);
		String[] d_NEW_TAX_CD = ((params.containsKey("d_NEW_TAX_CD")) ? (String[])params.get("d_NEW_TAX_CD") : (String[])null);
		String[] d_TAX_CD_CHANGE = ((params.containsKey("d_TAX_CD_CHANGE")) ? (String[])params.get("d_TAX_CD_CHANGE") : (String[])null);
		String[] d_OLD_TAX_APPLY_TYP = ((params.containsKey("d_OLD_TAX_APPLY_TYP")) ? (String[])params.get("d_OLD_TAX_APPLY_TYP") : (String[])null);
		String[] d_NEW_TAX_APPLY_TYP = ((params.containsKey("d_NEW_TAX_APPLY_TYP")) ? (String[])params.get("d_NEW_TAX_APPLY_TYP") : (String[])null);
		String[] d_TAX_APPLY_TYP_CD_CHANGE = ((params.containsKey("d_TAX_APPLY_TYP_CD_CHANGE")) ? (String[])params.get("d_TAX_APPLY_TYP_CD_CHANGE") : (String[])null);
		String[] d_OLD_TAX_CALC_TYP = ((params.containsKey("d_OLD_TAX_CALC_TYP")) ? (String[])params.get("d_OLD_TAX_CALC_TYP") : (String[])null);
		String[] d_NEW_TAX_CALC_TYP = ((params.containsKey("d_NEW_TAX_CALC_TYP")) ? (String[])params.get("d_NEW_TAX_CALC_TYP") : (String[])null);
		String[] d_TAX_CALC_TYP_CHANGE = ((params.containsKey("d_TAX_CALC_TYP_CHANGE")) ? (String[])params.get("d_TAX_CALC_TYP_CHANGE") : (String[])null);
		String[] d_OLD_INSPC_ACPT_APP_TYP = ((params.containsKey("d_OLD_INSPC_ACPT_APP_TYP")) ? (String[])params.get("d_OLD_INSPC_ACPT_APP_TYP") : (String[])null);
		String[] d_NEW_INSPC_ACPT_APP_TYP = ((params.containsKey("d_NEW_INSPC_ACPT_APP_TYP")) ? (String[])params.get("d_NEW_INSPC_ACPT_APP_TYP") : (String[])null);
		String[] d_INSPC_ACPT_APP_TYP_CHANGE = ((params.containsKey("d_INSPC_ACPT_APP_TYP_CHANGE")) ? (String[])params.get("d_INSPC_ACPT_APP_TYP_CHANGE") : (String[])null);
		String[] d_OLD_VEND_REM = ((params.containsKey("d_OLD_VEND_REM")) ? (String[])params.get("d_OLD_VEND_REM") : (String[])null);
		String[] d_NEW_VEND_REM = ((params.containsKey("d_NEW_VEND_REM")) ? (String[])params.get("d_NEW_VEND_REM") : (String[])null);
		String[] d_VEND_REM_CHANGE = ((params.containsKey("d_VEND_REM_CHANGE")) ? (String[])params.get("d_VEND_REM_CHANGE") : (String[])null);
		String[] d_OLD_CUR_CD = ((params.containsKey("d_OLD_CUR_CD")) ? (String[])params.get("d_OLD_CUR_CD") : (String[])null);
		String[] d_NEW_CUR_CD = ((params.containsKey("d_NEW_CUR_CD")) ? (String[])params.get("d_NEW_CUR_CD") : (String[])null);
		String[] d_CUR_CD_CHANGE = ((params.containsKey("d_CUR_CD_CHANGE")) ? (String[])params.get("d_CUR_CD_CHANGE") : (String[])null);
		String[] d_OLD_EXCH_TYP = ((params.containsKey("d_OLD_EXCH_TYP")) ? (String[])params.get("d_OLD_EXCH_TYP") : (String[])null);
		String[] d_NEW_EXCH_TYP = ((params.containsKey("d_NEW_EXCH_TYP")) ? (String[])params.get("d_NEW_EXCH_TYP") : (String[])null);
		String[] d_EXCH_TYP_CHANGE = ((params.containsKey("d_EXCH_TYP_CHANGE")) ? (String[])params.get("d_EXCH_TYP_CHANGE") : (String[])null);
		String[] d_OLD_IMPORT_TRN_TYP = ((params.containsKey("d_OLD_IMPORT_TRN_TYP")) ? (String[])params.get("d_OLD_IMPORT_TRN_TYP") : (String[])null);
		String[] d_NEW_IMPORT_TRN_TYP = ((params.containsKey("d_NEW_IMPORT_TRN_TYP")) ? (String[])params.get("d_NEW_IMPORT_TRN_TYP") : (String[])null);
		String[] d_IMPORT_TRN_TYP_CHANGE = ((params.containsKey("d_IMPORT_TRN_TYP_CHANGE")) ? (String[])params.get("d_IMPORT_TRN_TYP_CHANGE") : (String[])null);
		String[] d_VEND_ANAME_CHANGE = ((params.containsKey("d_VEND_ANAME_CHANGE")) ? (String[])params.get("d_VEND_ANAME_CHANGE") : (String[])null);
		String[] d_OLD_CUST_NAME = ((params.containsKey("d_OLD_CUST_NAME")) ? (String[])params.get("d_OLD_CUST_NAME") : (String[])null);
		String[] d_NEW_CUST_NAME = ((params.containsKey("d_NEW_CUST_NAME")) ? (String[])params.get("d_NEW_CUST_NAME") : (String[])null);
		String[] d_CUST_NAME_CHANGE = ((params.containsKey("d_CUST_NAME_CHANGE")) ? (String[])params.get("d_CUST_NAME_CHANGE") : (String[])null);
		String[] d_OLD_CUST_ANAME = ((params.containsKey("d_OLD_CUST_ANAME")) ? (String[])params.get("d_OLD_CUST_ANAME") : (String[])null);
		String[] d_NEW_CUST_ANAME = ((params.containsKey("d_NEW_CUST_ANAME")) ? (String[])params.get("d_NEW_CUST_ANAME") : (String[])null);
		String[] d_CUST_ANAME_CHANGE = ((params.containsKey("d_CUST_ANAME_CHANGE")) ? (String[])params.get("d_CUST_ANAME_CHANGE") : (String[])null);
		String[] d_OLD_CUST_KNAME = ((params.containsKey("d_OLD_CUST_KNAME")) ? (String[])params.get("d_OLD_CUST_KNAME") : (String[])null);
		String[] d_NEW_CUST_KNAME = ((params.containsKey("d_NEW_CUST_KNAME")) ? (String[])params.get("d_NEW_CUST_KNAME") : (String[])null);
		String[] d_CUST_KNAME_CHANGE = ((params.containsKey("d_CUST_KNAME_CHANGE")) ? (String[])params.get("d_CUST_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_INSPC_ACPT_TYP = ((params.containsKey("d_OLD_INSPC_ACPT_TYP")) ? (String[])params.get("d_OLD_INSPC_ACPT_TYP") : (String[])null);
		String[] d_NEW_INSPC_ACPT_TYP = ((params.containsKey("d_NEW_INSPC_ACPT_TYP")) ? (String[])params.get("d_NEW_INSPC_ACPT_TYP") : (String[])null);
		String[] d_INSPC_ACPT_TYP_CHANGE = ((params.containsKey("d_INSPC_ACPT_TYP_CHANGE")) ? (String[])params.get("d_INSPC_ACPT_TYP_CHANGE") : (String[])null);
		String[] d_TAX_APPLY_TYP_CHANGE = ((params.containsKey("d_TAX_APPLY_TYP_CHANGE")) ? (String[])params.get("d_TAX_APPLY_TYP_CHANGE") : (String[])null);
		String[] d_OLD_EDI_CUST_VEND_CD = ((params.containsKey("d_OLD_EDI_CUST_VEND_CD")) ? (String[])params.get("d_OLD_EDI_CUST_VEND_CD") : (String[])null);
		String[] d_NEW_EDI_CUST_VEND_CD = ((params.containsKey("d_NEW_EDI_CUST_VEND_CD")) ? (String[])params.get("d_NEW_EDI_CUST_VEND_CD") : (String[])null);
		String[] d_EDI_CUST_VEND_CD_CHANGE = ((params.containsKey("d_EDI_CUST_VEND_CD_CHANGE")) ? (String[])params.get("d_EDI_CUST_VEND_CD_CHANGE") : (String[])null);
		String[] d_OLD_PARTIAL_SHIP_INST_FLG = ((params.containsKey("d_OLD_PARTIAL_SHIP_INST_FLG")) ? (String[])params.get("d_OLD_PARTIAL_SHIP_INST_FLG") : (String[])null);
		String[] d_NEW_PARTIAL_SHIP_INST_FLG = ((params.containsKey("d_NEW_PARTIAL_SHIP_INST_FLG")) ? (String[])params.get("d_NEW_PARTIAL_SHIP_INST_FLG") : (String[])null);
		String[] d_PARTIAL_SHIP_INST_FLG_CHANGE = ((params.containsKey("d_PARTIAL_SHIP_INST_FLG_CHANGE")) ? (String[])params.get("d_PARTIAL_SHIP_INST_FLG_CHANGE") : (String[])null);
		String[] d_OLD_DLV_LOC_CD = ((params.containsKey("d_OLD_DLV_LOC_CD")) ? (String[])params.get("d_OLD_DLV_LOC_CD") : (String[])null);
		String[] d_NEW_DLV_LOC_CD = ((params.containsKey("d_NEW_DLV_LOC_CD")) ? (String[])params.get("d_NEW_DLV_LOC_CD") : (String[])null);
		String[] d_DLV_LOC_CD_CHANGE = ((params.containsKey("d_DLV_LOC_CD_CHANGE")) ? (String[])params.get("d_DLV_LOC_CD_CHANGE") : (String[])null);
		String[] d_OLD_DLV_LOC_NAME = ((params.containsKey("d_OLD_DLV_LOC_NAME")) ? (String[])params.get("d_OLD_DLV_LOC_NAME") : (String[])null);
		String[] d_NEW_DLV_LOC_NAME = ((params.containsKey("d_NEW_DLV_LOC_NAME")) ? (String[])params.get("d_NEW_DLV_LOC_NAME") : (String[])null);
		String[] d_DLV_LOC_NAME_CHANGE = ((params.containsKey("d_DLV_LOC_NAME_CHANGE")) ? (String[])params.get("d_DLV_LOC_NAME_CHANGE") : (String[])null);
		String[] d_OLD_DLV_LOC_KNAME = ((params.containsKey("d_OLD_DLV_LOC_KNAME")) ? (String[])params.get("d_OLD_DLV_LOC_KNAME") : (String[])null);
		String[] d_NEW_DLV_LOC_KNAME = ((params.containsKey("d_NEW_DLV_LOC_KNAME")) ? (String[])params.get("d_NEW_DLV_LOC_KNAME") : (String[])null);
		String[] d_DLV_LOC_KNAME_CHANGE = ((params.containsKey("d_DLV_LOC_KNAME_CHANGE")) ? (String[])params.get("d_DLV_LOC_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_DLV_LOC_ENAME = ((params.containsKey("d_OLD_DLV_LOC_ENAME")) ? (String[])params.get("d_OLD_DLV_LOC_ENAME") : (String[])null);
		String[] d_NEW_DLV_LOC_ENAME = ((params.containsKey("d_NEW_DLV_LOC_ENAME")) ? (String[])params.get("d_NEW_DLV_LOC_ENAME") : (String[])null);
		String[] d_DLV_LOC_ENAME_CHANGE = ((params.containsKey("d_DLV_LOC_ENAME_CHANGE")) ? (String[])params.get("d_DLV_LOC_ENAME_CHANGE") : (String[])null);
		String[] d_OLD_TRANSPORT_CD = ((params.containsKey("d_OLD_TRANSPORT_CD")) ? (String[])params.get("d_OLD_TRANSPORT_CD") : (String[])null);
		String[] d_NEW_TRANSPORT_CD = ((params.containsKey("d_NEW_TRANSPORT_CD")) ? (String[])params.get("d_NEW_TRANSPORT_CD") : (String[])null);
		String[] d_TRANSPORT_CD_CHANGE = ((params.containsKey("d_TRANSPORT_CD_CHANGE")) ? (String[])params.get("d_TRANSPORT_CD_CHANGE") : (String[])null);
		String[] d_OLD_DEPO_WH_CD = ((params.containsKey("d_OLD_DEPO_WH_CD")) ? (String[])params.get("d_OLD_DEPO_WH_CD") : (String[])null);
		String[] d_NEW_DEPO_WH_CD = ((params.containsKey("d_NEW_DEPO_WH_CD")) ? (String[])params.get("d_NEW_DEPO_WH_CD") : (String[])null);
		String[] d_DEPO_WH_CD_CHANGE = ((params.containsKey("d_DEPO_WH_CD_CHANGE")) ? (String[])params.get("d_DEPO_WH_CD_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_WH_CD = ((params.containsKey("d_OLD_SHIP_WH_CD")) ? (String[])params.get("d_OLD_SHIP_WH_CD") : (String[])null);
		String[] d_NEW_SHIP_WH_CD = ((params.containsKey("d_NEW_SHIP_WH_CD")) ? (String[])params.get("d_NEW_SHIP_WH_CD") : (String[])null);
		String[] d_SHIP_WH_CD_CHANGE = ((params.containsKey("d_SHIP_WH_CD_CHANGE")) ? (String[])params.get("d_SHIP_WH_CD_CHANGE") : (String[])null);
		String[] d_OLD_TRANSPORT_LT = ((params.containsKey("d_OLD_TRANSPORT_LT")) ? (String[])params.get("d_OLD_TRANSPORT_LT") : (String[])null);
		String[] d_NEW_TRANSPORT_LT = ((params.containsKey("d_NEW_TRANSPORT_LT")) ? (String[])params.get("d_NEW_TRANSPORT_LT") : (String[])null);
		String[] d_TRANSPORT_LT_CHANGE = ((params.containsKey("d_TRANSPORT_LT_CHANGE")) ? (String[])params.get("d_TRANSPORT_LT_CHANGE") : (String[])null);
		String[] d_OLD_EXCH_RESERVE_CD = ((params.containsKey("d_OLD_EXCH_RESERVE_CD")) ? (String[])params.get("d_OLD_EXCH_RESERVE_CD") : (String[])null);
		String[] d_NEW_EXCH_RESERVE_CD = ((params.containsKey("d_NEW_EXCH_RESERVE_CD")) ? (String[])params.get("d_NEW_EXCH_RESERVE_CD") : (String[])null);
		String[] d_EXCH_RESERVE_CD_CHANGE = ((params.containsKey("d_EXCH_RESERVE_CD_CHANGE")) ? (String[])params.get("d_EXCH_RESERVE_CD_CHANGE") : (String[])null);
		String[] d_OLD_EXCH_START_DATE = ((params.containsKey("d_OLD_EXCH_START_DATE")) ? (String[])params.get("d_OLD_EXCH_START_DATE") : (String[])null);
		String[] d_NEW_EXCH_START_DATE = ((params.containsKey("d_NEW_EXCH_START_DATE")) ? (String[])params.get("d_NEW_EXCH_START_DATE") : (String[])null);
		String[] d_EXCH_START_DATE_CHANGE = ((params.containsKey("d_EXCH_START_DATE_CHANGE")) ? (String[])params.get("d_EXCH_START_DATE_CHANGE") : (String[])null);
		String[] d_OLD_EXCH_RATE = ((params.containsKey("d_OLD_EXCH_RATE")) ? (String[])params.get("d_OLD_EXCH_RATE") : (String[])null);
		String[] d_NEW_EXCH_RATE = ((params.containsKey("d_NEW_EXCH_RATE")) ? (String[])params.get("d_NEW_EXCH_RATE") : (String[])null);
		String[] d_EXCH_RATE_CHANGE = ((params.containsKey("d_EXCH_RATE_CHANGE")) ? (String[])params.get("d_EXCH_RATE_CHANGE") : (String[])null);
		String[] d_OLD_BILL_ADDRESSEE_CD = ((params.containsKey("d_OLD_BILL_ADDRESSEE_CD")) ? (String[])params.get("d_OLD_BILL_ADDRESSEE_CD") : (String[])null);
		String[] d_NEW_BILL_ADDRESSEE_CD = ((params.containsKey("d_NEW_BILL_ADDRESSEE_CD")) ? (String[])params.get("d_NEW_BILL_ADDRESSEE_CD") : (String[])null);
		String[] d_BILL_ADDRESSEE_CD_CHANGE = ((params.containsKey("d_BILL_ADDRESSEE_CD_CHANGE")) ? (String[])params.get("d_BILL_ADDRESSEE_CD_CHANGE") : (String[])null);
		String[] d_OLD_CUST_FNAME = ((params.containsKey("d_OLD_CUST_FNAME")) ? (String[])params.get("d_OLD_CUST_FNAME") : (String[])null);
		String[] d_NEW_CUST_FNAME = ((params.containsKey("d_NEW_CUST_FNAME")) ? (String[])params.get("d_NEW_CUST_FNAME") : (String[])null);
		String[] d_CUST_FNAME_CHANGE = ((params.containsKey("d_CUST_FNAME_CHANGE")) ? (String[])params.get("d_CUST_FNAME_CHANGE") : (String[])null);
		String[] d_OLD_CUST_ENAME = ((params.containsKey("d_OLD_CUST_ENAME")) ? (String[])params.get("d_OLD_CUST_ENAME") : (String[])null);
		String[] d_NEW_CUST_ENAME = ((params.containsKey("d_NEW_CUST_ENAME")) ? (String[])params.get("d_NEW_CUST_ENAME") : (String[])null);
		String[] d_CUST_ENAME_CHANGE = ((params.containsKey("d_CUST_ENAME_CHANGE")) ? (String[])params.get("d_CUST_ENAME_CHANGE") : (String[])null);
		String[] d_OLD_OWNER_EXECUTIVE = ((params.containsKey("d_OLD_OWNER_EXECUTIVE")) ? (String[])params.get("d_OLD_OWNER_EXECUTIVE") : (String[])null);
		String[] d_NEW_OWNER_EXECUTIVE = ((params.containsKey("d_NEW_OWNER_EXECUTIVE")) ? (String[])params.get("d_NEW_OWNER_EXECUTIVE") : (String[])null);
		String[] d_OWNER_EXECUTIVE_CHANGE = ((params.containsKey("d_OWNER_EXECUTIVE_CHANGE")) ? (String[])params.get("d_OWNER_EXECUTIVE_CHANGE") : (String[])null);
		String[] d_OLD_OWNER_NAME = ((params.containsKey("d_OLD_OWNER_NAME")) ? (String[])params.get("d_OLD_OWNER_NAME") : (String[])null);
		String[] d_NEW_OWNER_NAME = ((params.containsKey("d_NEW_OWNER_NAME")) ? (String[])params.get("d_NEW_OWNER_NAME") : (String[])null);
		String[] d_OWNER_NAME_CHANGE = ((params.containsKey("d_OWNER_NAME_CHANGE")) ? (String[])params.get("d_OWNER_NAME_CHANGE") : (String[])null);
		String[] d_OLD_COMPANY_CD = ((params.containsKey("d_OLD_COMPANY_CD")) ? (String[])params.get("d_OLD_COMPANY_CD") : (String[])null);
		String[] d_NEW_COMPANY_CD = ((params.containsKey("d_NEW_COMPANY_CD")) ? (String[])params.get("d_NEW_COMPANY_CD") : (String[])null);
		String[] d_COMPANY_CD_CHANGE = ((params.containsKey("d_COMPANY_CD_CHANGE")) ? (String[])params.get("d_COMPANY_CD_CHANGE") : (String[])null);
		String[] d_OLD_COMPANY_FNAME = ((params.containsKey("d_OLD_COMPANY_FNAME")) ? (String[])params.get("d_OLD_COMPANY_FNAME") : (String[])null);
		String[] d_NEW_COMPANY_FNAME = ((params.containsKey("d_NEW_COMPANY_FNAME")) ? (String[])params.get("d_NEW_COMPANY_FNAME") : (String[])null);
		String[] d_COMPANY_FNAME_CHANGE = ((params.containsKey("d_COMPANY_FNAME_CHANGE")) ? (String[])params.get("d_COMPANY_FNAME_CHANGE") : (String[])null);
		String[] d_OLD_COMPANY_NAME = ((params.containsKey("d_OLD_COMPANY_NAME")) ? (String[])params.get("d_OLD_COMPANY_NAME") : (String[])null);
		String[] d_NEW_COMPANY_NAME = ((params.containsKey("d_NEW_COMPANY_NAME")) ? (String[])params.get("d_NEW_COMPANY_NAME") : (String[])null);
		String[] d_COMPANY_NAME_CHANGE = ((params.containsKey("d_COMPANY_NAME_CHANGE")) ? (String[])params.get("d_COMPANY_NAME_CHANGE") : (String[])null);
		String[] d_OLD_COMPANY_KNAME = ((params.containsKey("d_OLD_COMPANY_KNAME")) ? (String[])params.get("d_OLD_COMPANY_KNAME") : (String[])null);
		String[] d_NEW_COMPANY_KNAME = ((params.containsKey("d_NEW_COMPANY_KNAME")) ? (String[])params.get("d_NEW_COMPANY_KNAME") : (String[])null);
		String[] d_COMPANY_KNAME_CHANGE = ((params.containsKey("d_COMPANY_KNAME_CHANGE")) ? (String[])params.get("d_COMPANY_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_COMPANY_ENAME = ((params.containsKey("d_OLD_COMPANY_ENAME")) ? (String[])params.get("d_OLD_COMPANY_ENAME") : (String[])null);
		String[] d_NEW_COMPANY_ENAME = ((params.containsKey("d_NEW_COMPANY_ENAME")) ? (String[])params.get("d_NEW_COMPANY_ENAME") : (String[])null);
		String[] d_COMPANY_ENAME_CHANGE = ((params.containsKey("d_COMPANY_ENAME_CHANGE")) ? (String[])params.get("d_COMPANY_ENAME_CHANGE") : (String[])null);
		String[] d_OLD_USER_TYP = ((params.containsKey("d_OLD_USER_TYP")) ? (String[])params.get("d_OLD_USER_TYP") : (String[])null);
		String[] d_NEW_USER_TYP = ((params.containsKey("d_NEW_USER_TYP")) ? (String[])params.get("d_NEW_USER_TYP") : (String[])null);
		String[] d_USER_TYP_CHANGE = ((params.containsKey("d_USER_TYP_CHANGE")) ? (String[])params.get("d_USER_TYP_CHANGE") : (String[])null);
		String[] d_OLD_BANK_CD = ((params.containsKey("d_OLD_BANK_CD")) ? (String[])params.get("d_OLD_BANK_CD") : (String[])null);
		String[] d_NEW_BANK_CD = ((params.containsKey("d_NEW_BANK_CD")) ? (String[])params.get("d_NEW_BANK_CD") : (String[])null);
		String[] d_BANK_CD_CHANGE = ((params.containsKey("d_BANK_CD_CHANGE")) ? (String[])params.get("d_BANK_CD_CHANGE") : (String[])null);
		String[] d_OLD_BANK_NAME = ((params.containsKey("d_OLD_BANK_NAME")) ? (String[])params.get("d_OLD_BANK_NAME") : (String[])null);
		String[] d_NEW_BANK_NAME = ((params.containsKey("d_NEW_BANK_NAME")) ? (String[])params.get("d_NEW_BANK_NAME") : (String[])null);
		String[] d_BANK_NAME_CHANGE = ((params.containsKey("d_BANK_NAME_CHANGE")) ? (String[])params.get("d_BANK_NAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_ANAME = ((params.containsKey("d_OLD_BANK_ANAME")) ? (String[])params.get("d_OLD_BANK_ANAME") : (String[])null);
		String[] d_NEW_BANK_ANAME = ((params.containsKey("d_NEW_BANK_ANAME")) ? (String[])params.get("d_NEW_BANK_ANAME") : (String[])null);
		String[] d_BANK_ANAME_CHANGE = ((params.containsKey("d_BANK_ANAME_CHANGE")) ? (String[])params.get("d_BANK_ANAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_KNAME = ((params.containsKey("d_OLD_BANK_KNAME")) ? (String[])params.get("d_OLD_BANK_KNAME") : (String[])null);
		String[] d_NEW_BANK_KNAME = ((params.containsKey("d_NEW_BANK_KNAME")) ? (String[])params.get("d_NEW_BANK_KNAME") : (String[])null);
		String[] d_BANK_KNAME_CHANGE = ((params.containsKey("d_BANK_KNAME_CHANGE")) ? (String[])params.get("d_BANK_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_ENAME = ((params.containsKey("d_OLD_BANK_ENAME")) ? (String[])params.get("d_OLD_BANK_ENAME") : (String[])null);
		String[] d_NEW_BANK_ENAME = ((params.containsKey("d_NEW_BANK_ENAME")) ? (String[])params.get("d_NEW_BANK_ENAME") : (String[])null);
		String[] d_BANK_ENAME_CHANGE = ((params.containsKey("d_BANK_ENAME_CHANGE")) ? (String[])params.get("d_BANK_ENAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_FB_NAME = ((params.containsKey("d_OLD_BANK_FB_NAME")) ? (String[])params.get("d_OLD_BANK_FB_NAME") : (String[])null);
		String[] d_NEW_BANK_FB_NAME = ((params.containsKey("d_NEW_BANK_FB_NAME")) ? (String[])params.get("d_NEW_BANK_FB_NAME") : (String[])null);
		String[] d_BANK_FB_NAME_CHANGE = ((params.containsKey("d_BANK_FB_NAME_CHANGE")) ? (String[])params.get("d_BANK_FB_NAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_CD = ((params.containsKey("d_OLD_BANK_BR_CD")) ? (String[])params.get("d_OLD_BANK_BR_CD") : (String[])null);
		String[] d_NEW_BANK_BR_CD = ((params.containsKey("d_NEW_BANK_BR_CD")) ? (String[])params.get("d_NEW_BANK_BR_CD") : (String[])null);
		String[] d_BANK_BR_CD_CHANGE = ((params.containsKey("d_BANK_BR_CD_CHANGE")) ? (String[])params.get("d_BANK_BR_CD_CHANGE") : (String[])null);
		String[] d_OLD_B_ACCT_TYP_CD = ((params.containsKey("d_OLD_B_ACCT_TYP_CD")) ? (String[])params.get("d_OLD_B_ACCT_TYP_CD") : (String[])null);
		String[] d_NEW_B_ACCT_TYP_CD = ((params.containsKey("d_NEW_B_ACCT_TYP_CD")) ? (String[])params.get("d_NEW_B_ACCT_TYP_CD") : (String[])null);
		String[] d_B_ACCT_TYP_CD_CHANGE = ((params.containsKey("d_B_ACCT_TYP_CD_CHANGE")) ? (String[])params.get("d_B_ACCT_TYP_CD_CHANGE") : (String[])null);
		String[] d_OLD_B_ACCT_NAME = ((params.containsKey("d_OLD_B_ACCT_NAME")) ? (String[])params.get("d_OLD_B_ACCT_NAME") : (String[])null);
		String[] d_NEW_B_ACCT_NAME = ((params.containsKey("d_NEW_B_ACCT_NAME")) ? (String[])params.get("d_NEW_B_ACCT_NAME") : (String[])null);
		String[] d_B_ACCT_NAME_CHANGE = ((params.containsKey("d_B_ACCT_NAME_CHANGE")) ? (String[])params.get("d_B_ACCT_NAME_CHANGE") : (String[])null);
		String[] d_OLD_FB_DATA_TYP = ((params.containsKey("d_OLD_FB_DATA_TYP")) ? (String[])params.get("d_OLD_FB_DATA_TYP") : (String[])null);
		String[] d_NEW_FB_DATA_TYP = ((params.containsKey("d_NEW_FB_DATA_TYP")) ? (String[])params.get("d_NEW_FB_DATA_TYP") : (String[])null);
		String[] d_FB_DATA_TYP_CHANGE = ((params.containsKey("d_FB_DATA_TYP_CHANGE")) ? (String[])params.get("d_FB_DATA_TYP_CHANGE") : (String[])null);
		String[] d_OLD_TRF_REQUEST_CD = ((params.containsKey("d_OLD_TRF_REQUEST_CD")) ? (String[])params.get("d_OLD_TRF_REQUEST_CD") : (String[])null);
		String[] d_NEW_TRF_REQUEST_CD = ((params.containsKey("d_NEW_TRF_REQUEST_CD")) ? (String[])params.get("d_NEW_TRF_REQUEST_CD") : (String[])null);
		String[] d_TRF_REQUEST_CD_CHANGE = ((params.containsKey("d_TRF_REQUEST_CD_CHANGE")) ? (String[])params.get("d_TRF_REQUEST_CD_CHANGE") : (String[])null);
		String[] d_OLD_B_ACCT_FB_NAME = ((params.containsKey("d_OLD_B_ACCT_FB_NAME")) ? (String[])params.get("d_OLD_B_ACCT_FB_NAME") : (String[])null);
		String[] d_NEW_B_ACCT_FB_NAME = ((params.containsKey("d_NEW_B_ACCT_FB_NAME")) ? (String[])params.get("d_NEW_B_ACCT_FB_NAME") : (String[])null);
		String[] d_B_ACCT_FB_NAME_CHANGE = ((params.containsKey("d_B_ACCT_FB_NAME_CHANGE")) ? (String[])params.get("d_B_ACCT_FB_NAME_CHANGE") : (String[])null);
		String[] d_OLD_ACCT_CD = ((params.containsKey("d_OLD_ACCT_CD")) ? (String[])params.get("d_OLD_ACCT_CD") : (String[])null);
		String[] d_NEW_ACCT_CD = ((params.containsKey("d_NEW_ACCT_CD")) ? (String[])params.get("d_NEW_ACCT_CD") : (String[])null);
		String[] d_ACCT_CD_CHANGE = ((params.containsKey("d_ACCT_CD_CHANGE")) ? (String[])params.get("d_ACCT_CD_CHANGE") : (String[])null);
		String[] d_OLD_PRIMITIVE_TYP = ((params.containsKey("d_OLD_PRIMITIVE_TYP")) ? (String[])params.get("d_OLD_PRIMITIVE_TYP") : (String[])null);
		String[] d_NEW_PRIMITIVE_TYP = ((params.containsKey("d_NEW_PRIMITIVE_TYP")) ? (String[])params.get("d_NEW_PRIMITIVE_TYP") : (String[])null);
		String[] d_PRIMITIVE_TYP_CHANGE = ((params.containsKey("d_PRIMITIVE_TYP_CHANGE")) ? (String[])params.get("d_PRIMITIVE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_ACCT_NAME = ((params.containsKey("d_OLD_ACCT_NAME")) ? (String[])params.get("d_OLD_ACCT_NAME") : (String[])null);
		String[] d_NEW_ACCT_NAME = ((params.containsKey("d_NEW_ACCT_NAME")) ? (String[])params.get("d_NEW_ACCT_NAME") : (String[])null);
		String[] d_ACCT_NAME_CHANGE = ((params.containsKey("d_ACCT_NAME_CHANGE")) ? (String[])params.get("d_ACCT_NAME_CHANGE") : (String[])null);
		String[] d_OLD_ACCT_ANAME = ((params.containsKey("d_OLD_ACCT_ANAME")) ? (String[])params.get("d_OLD_ACCT_ANAME") : (String[])null);
		String[] d_NEW_ACCT_ANAME = ((params.containsKey("d_NEW_ACCT_ANAME")) ? (String[])params.get("d_NEW_ACCT_ANAME") : (String[])null);
		String[] d_ACCT_ANAME_CHANGE = ((params.containsKey("d_ACCT_ANAME_CHANGE")) ? (String[])params.get("d_ACCT_ANAME_CHANGE") : (String[])null);
		String[] d_OLD_ACCT_KNAME = ((params.containsKey("d_OLD_ACCT_KNAME")) ? (String[])params.get("d_OLD_ACCT_KNAME") : (String[])null);
		String[] d_NEW_ACCT_KNAME = ((params.containsKey("d_NEW_ACCT_KNAME")) ? (String[])params.get("d_NEW_ACCT_KNAME") : (String[])null);
		String[] d_ACCT_KNAME_CHANGE = ((params.containsKey("d_ACCT_KNAME_CHANGE")) ? (String[])params.get("d_ACCT_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_DR_CR_TYP = ((params.containsKey("d_OLD_DR_CR_TYP")) ? (String[])params.get("d_OLD_DR_CR_TYP") : (String[])null);
		String[] d_NEW_DR_CR_TYP = ((params.containsKey("d_NEW_DR_CR_TYP")) ? (String[])params.get("d_NEW_DR_CR_TYP") : (String[])null);
		String[] d_DR_CR_TYP_CHANGE = ((params.containsKey("d_DR_CR_TYP_CHANGE")) ? (String[])params.get("d_DR_CR_TYP_CHANGE") : (String[])null);
		String[] d_OLD_ACCT_TYP = ((params.containsKey("d_OLD_ACCT_TYP")) ? (String[])params.get("d_OLD_ACCT_TYP") : (String[])null);
		String[] d_NEW_ACCT_TYP = ((params.containsKey("d_NEW_ACCT_TYP")) ? (String[])params.get("d_NEW_ACCT_TYP") : (String[])null);
		String[] d_ACCT_TYP_CHANGE = ((params.containsKey("d_ACCT_TYP_CHANGE")) ? (String[])params.get("d_ACCT_TYP_CHANGE") : (String[])null);
		String[] d_OLD_SUB_ACCT_TYP_DEFAULT = ((params.containsKey("d_OLD_SUB_ACCT_TYP_DEFAULT")) ? (String[])params.get("d_OLD_SUB_ACCT_TYP_DEFAULT") : (String[])null);
		String[] d_NEW_SUB_ACCT_TYP_DEFAULT = ((params.containsKey("d_NEW_SUB_ACCT_TYP_DEFAULT")) ? (String[])params.get("d_NEW_SUB_ACCT_TYP_DEFAULT") : (String[])null);
		String[] d_SUB_ACCT_TYP_DEFAULT_CHANGE = ((params.containsKey("d_SUB_ACCT_TYP_DEFAULT_CHANGE")) ? (String[])params.get("d_SUB_ACCT_TYP_DEFAULT_CHANGE") : (String[])null);
		String[] d_OLD_TRF_TYP = ((params.containsKey("d_OLD_TRF_TYP")) ? (String[])params.get("d_OLD_TRF_TYP") : (String[])null);
		String[] d_NEW_TRF_TYP = ((params.containsKey("d_NEW_TRF_TYP")) ? (String[])params.get("d_NEW_TRF_TYP") : (String[])null);
		String[] d_TRF_TYP_CHANGE = ((params.containsKey("d_TRF_TYP_CHANGE")) ? (String[])params.get("d_TRF_TYP_CHANGE") : (String[])null);
		String[] d_OLD_CONTENTS_TYP = ((params.containsKey("d_OLD_CONTENTS_TYP")) ? (String[])params.get("d_OLD_CONTENTS_TYP") : (String[])null);
		String[] d_NEW_CONTENTS_TYP = ((params.containsKey("d_NEW_CONTENTS_TYP")) ? (String[])params.get("d_NEW_CONTENTS_TYP") : (String[])null);
		String[] d_CONTENTS_TYP_CHANGE = ((params.containsKey("d_CONTENTS_TYP_CHANGE")) ? (String[])params.get("d_CONTENTS_TYP_CHANGE") : (String[])null);
		String[] d_OLD_INFO_TYP = ((params.containsKey("d_OLD_INFO_TYP")) ? (String[])params.get("d_OLD_INFO_TYP") : (String[])null);
		String[] d_NEW_INFO_TYP = ((params.containsKey("d_NEW_INFO_TYP")) ? (String[])params.get("d_NEW_INFO_TYP") : (String[])null);
		String[] d_INFO_TYP_CHANGE = ((params.containsKey("d_INFO_TYP_CHANGE")) ? (String[])params.get("d_INFO_TYP_CHANGE") : (String[])null);
		String[] d_OLD_VALID_START_DATE = ((params.containsKey("d_OLD_VALID_START_DATE")) ? (String[])params.get("d_OLD_VALID_START_DATE") : (String[])null);
		String[] d_NEW_VALID_START_DATE = ((params.containsKey("d_NEW_VALID_START_DATE")) ? (String[])params.get("d_NEW_VALID_START_DATE") : (String[])null);
		String[] d_VALID_START_DATE_CHANGE = ((params.containsKey("d_VALID_START_DATE_CHANGE")) ? (String[])params.get("d_VALID_START_DATE_CHANGE") : (String[])null);
		String[] d_OLD_VALID_END_DATE = ((params.containsKey("d_OLD_VALID_END_DATE")) ? (String[])params.get("d_OLD_VALID_END_DATE") : (String[])null);
		String[] d_NEW_VALID_END_DATE = ((params.containsKey("d_NEW_VALID_END_DATE")) ? (String[])params.get("d_NEW_VALID_END_DATE") : (String[])null);
		String[] d_VALID_END_DATE_CHANGE = ((params.containsKey("d_VALID_END_DATE_CHANGE")) ? (String[])params.get("d_VALID_END_DATE_CHANGE") : (String[])null);
		String[] d_OLD_MIN_AMOUNT = ((params.containsKey("d_OLD_MIN_AMOUNT")) ? (String[])params.get("d_OLD_MIN_AMOUNT") : (String[])null);
		String[] d_NEW_MIN_AMOUNT = ((params.containsKey("d_NEW_MIN_AMOUNT")) ? (String[])params.get("d_NEW_MIN_AMOUNT") : (String[])null);
		String[] d_OLD_MAX_AMOUNT = ((params.containsKey("d_OLD_MAX_AMOUNT")) ? (String[])params.get("d_OLD_MAX_AMOUNT") : (String[])null);
		String[] d_NEW_MAX_AMOUNT = ((params.containsKey("d_NEW_MAX_AMOUNT")) ? (String[])params.get("d_NEW_MAX_AMOUNT") : (String[])null);
		String[] d_MAX_AMOUNT_CHANGE = ((params.containsKey("d_MAX_AMOUNT_CHANGE")) ? (String[])params.get("d_MAX_AMOUNT_CHANGE") : (String[])null);
		String[] d_OLD_TRF_FEE = ((params.containsKey("d_OLD_TRF_FEE")) ? (String[])params.get("d_OLD_TRF_FEE") : (String[])null);
		String[] d_NEW_TRF_FEE = ((params.containsKey("d_NEW_TRF_FEE")) ? (String[])params.get("d_NEW_TRF_FEE") : (String[])null);
		String[] d_TRF_FEE_CHANGE = ((params.containsKey("d_TRF_FEE_CHANGE")) ? (String[])params.get("d_TRF_FEE_CHANGE") : (String[])null);
		String[] d_OLD_VEND_KNAME = ((params.containsKey("d_OLD_VEND_KNAME")) ? (String[])params.get("d_OLD_VEND_KNAME") : (String[])null);
		String[] d_NEW_VEND_KNAME = ((params.containsKey("d_NEW_VEND_KNAME")) ? (String[])params.get("d_NEW_VEND_KNAME") : (String[])null);
		String[] d_VEND_KNAME_CHANGE = ((params.containsKey("d_VEND_KNAME_CHANGE")) ? (String[])params.get("d_VEND_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_SUB_ACCT_CD = ((params.containsKey("d_OLD_SUB_ACCT_CD")) ? (String[])params.get("d_OLD_SUB_ACCT_CD") : (String[])null);
		String[] d_NEW_SUB_ACCT_CD = ((params.containsKey("d_NEW_SUB_ACCT_CD")) ? (String[])params.get("d_NEW_SUB_ACCT_CD") : (String[])null);
		String[] d_SUB_ACCT_CD_CHANGE = ((params.containsKey("d_SUB_ACCT_CD_CHANGE")) ? (String[])params.get("d_SUB_ACCT_CD_CHANGE") : (String[])null);
		String[] d_OLD_PAY_PATTERN_CD = ((params.containsKey("d_OLD_PAY_PATTERN_CD")) ? (String[])params.get("d_OLD_PAY_PATTERN_CD") : (String[])null);
		String[] d_NEW_PAY_PATTERN_CD = ((params.containsKey("d_NEW_PAY_PATTERN_CD")) ? (String[])params.get("d_NEW_PAY_PATTERN_CD") : (String[])null);
		String[] d_PAY_PATTERN_CD_CHANGE = ((params.containsKey("d_PAY_PATTERN_CD_CHANGE")) ? (String[])params.get("d_PAY_PATTERN_CD_CHANGE") : (String[])null);
		String[] d_OLD_PAY_ODR_TYP = ((params.containsKey("d_OLD_PAY_ODR_TYP")) ? (String[])params.get("d_OLD_PAY_ODR_TYP") : (String[])null);
		String[] d_NEW_PAY_ODR_TYP = ((params.containsKey("d_NEW_PAY_ODR_TYP")) ? (String[])params.get("d_NEW_PAY_ODR_TYP") : (String[])null);
		String[] d_PAY_ODR_TYP_CHANGE = ((params.containsKey("d_PAY_ODR_TYP_CHANGE")) ? (String[])params.get("d_PAY_ODR_TYP_CHANGE") : (String[])null);
		String[] d_OLD_PAY_METHOD_CD_1 = ((params.containsKey("d_OLD_PAY_METHOD_CD_1")) ? (String[])params.get("d_OLD_PAY_METHOD_CD_1") : (String[])null);
		String[] d_NEW_PAY_METHOD_CD_1 = ((params.containsKey("d_NEW_PAY_METHOD_CD_1")) ? (String[])params.get("d_NEW_PAY_METHOD_CD_1") : (String[])null);
		String[] d_PAY_METHOD_CD_1_CHANGE = ((params.containsKey("d_PAY_METHOD_CD_1_CHANGE")) ? (String[])params.get("d_PAY_METHOD_CD_1_CHANGE") : (String[])null);
		String[] d_OLD_PAY_METHOD_CD_2 = ((params.containsKey("d_OLD_PAY_METHOD_CD_2")) ? (String[])params.get("d_OLD_PAY_METHOD_CD_2") : (String[])null);
		String[] d_NEW_PAY_METHOD_CD_2 = ((params.containsKey("d_NEW_PAY_METHOD_CD_2")) ? (String[])params.get("d_NEW_PAY_METHOD_CD_2") : (String[])null);
		String[] d_PAY_METHOD_CD_2_CHANGE = ((params.containsKey("d_PAY_METHOD_CD_2_CHANGE")) ? (String[])params.get("d_PAY_METHOD_CD_2_CHANGE") : (String[])null);
		String[] d_OLD_PAY_METHOD_CD = ((params.containsKey("d_OLD_PAY_METHOD_CD")) ? (String[])params.get("d_OLD_PAY_METHOD_CD") : (String[])null);
		String[] d_NEW_PAY_METHOD_CD = ((params.containsKey("d_NEW_PAY_METHOD_CD")) ? (String[])params.get("d_NEW_PAY_METHOD_CD") : (String[])null);
		String[] d_PAY_METHOD_CD_CHANGE = ((params.containsKey("d_PAY_METHOD_CD_CHANGE")) ? (String[])params.get("d_PAY_METHOD_CD_CHANGE") : (String[])null);
		String[] d_OLD_PAY_METHOD = ((params.containsKey("d_OLD_PAY_METHOD")) ? (String[])params.get("d_OLD_PAY_METHOD") : (String[])null);
		String[] d_NEW_PAY_METHOD = ((params.containsKey("d_NEW_PAY_METHOD")) ? (String[])params.get("d_NEW_PAY_METHOD") : (String[])null);
		String[] d_PAY_METHOD_CHANGE = ((params.containsKey("d_PAY_METHOD_CHANGE")) ? (String[])params.get("d_PAY_METHOD_CHANGE") : (String[])null);
		String[] d_OLD_PAY_TARGET_TYP = ((params.containsKey("d_OLD_PAY_TARGET_TYP")) ? (String[])params.get("d_OLD_PAY_TARGET_TYP") : (String[])null);
		String[] d_NEW_PAY_TARGET_TYP = ((params.containsKey("d_NEW_PAY_TARGET_TYP")) ? (String[])params.get("d_NEW_PAY_TARGET_TYP") : (String[])null);
		String[] d_PAY_TARGET_TYP_CHANGE = ((params.containsKey("d_PAY_TARGET_TYP_CHANGE")) ? (String[])params.get("d_PAY_TARGET_TYP_CHANGE") : (String[])null);
		String[] d_OLD_SLIP_CTRL_ORG_CD = ((params.containsKey("d_OLD_SLIP_CTRL_ORG_CD")) ? (String[])params.get("d_OLD_SLIP_CTRL_ORG_CD") : (String[])null);
		String[] d_NEW_SLIP_CTRL_ORG_CD = ((params.containsKey("d_NEW_SLIP_CTRL_ORG_CD")) ? (String[])params.get("d_NEW_SLIP_CTRL_ORG_CD") : (String[])null);
		String[] d_SLIP_CTRL_ORG_CD_CHANGE = ((params.containsKey("d_SLIP_CTRL_ORG_CD_CHANGE")) ? (String[])params.get("d_SLIP_CTRL_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_CLOSING_CTRL_ORG_CD = ((params.containsKey("d_OLD_CLOSING_CTRL_ORG_CD")) ? (String[])params.get("d_OLD_CLOSING_CTRL_ORG_CD") : (String[])null);
		String[] d_NEW_CLOSING_CTRL_ORG_CD = ((params.containsKey("d_NEW_CLOSING_CTRL_ORG_CD")) ? (String[])params.get("d_NEW_CLOSING_CTRL_ORG_CD") : (String[])null);
		String[] d_CLOSING_CTRL_ORG_CD_CHANGE = ((params.containsKey("d_CLOSING_CTRL_ORG_CD_CHANGE")) ? (String[])params.get("d_CLOSING_CTRL_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_PAY_CALC_CTRL_ORG_CD = ((params.containsKey("d_OLD_PAY_CALC_CTRL_ORG_CD")) ? (String[])params.get("d_OLD_PAY_CALC_CTRL_ORG_CD") : (String[])null);
		String[] d_NEW_PAY_CALC_CTRL_ORG_CD = ((params.containsKey("d_NEW_PAY_CALC_CTRL_ORG_CD")) ? (String[])params.get("d_NEW_PAY_CALC_CTRL_ORG_CD") : (String[])null);
		String[] d_PAY_CALC_CTRL_ORG_CD_CHANGE = ((params.containsKey("d_PAY_CALC_CTRL_ORG_CD_CHANGE")) ? (String[])params.get("d_PAY_CALC_CTRL_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_PAY_FIX_CTRL_ORG_CD = ((params.containsKey("d_OLD_PAY_FIX_CTRL_ORG_CD")) ? (String[])params.get("d_OLD_PAY_FIX_CTRL_ORG_CD") : (String[])null);
		String[] d_NEW_PAY_FIX_CTRL_ORG_CD = ((params.containsKey("d_NEW_PAY_FIX_CTRL_ORG_CD")) ? (String[])params.get("d_NEW_PAY_FIX_CTRL_ORG_CD") : (String[])null);
		String[] d_PAY_FIX_CTRL_ORG_CD_CHANGE = ((params.containsKey("d_PAY_FIX_CTRL_ORG_CD_CHANGE")) ? (String[])params.get("d_PAY_FIX_CTRL_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_STL_COND_CD = ((params.containsKey("d_OLD_STL_COND_CD")) ? (String[])params.get("d_OLD_STL_COND_CD") : (String[])null);
		String[] d_NEW_STL_COND_CD = ((params.containsKey("d_NEW_STL_COND_CD")) ? (String[])params.get("d_NEW_STL_COND_CD") : (String[])null);
		String[] d_STL_COND_CD_CHANGE = ((params.containsKey("d_STL_COND_CD_CHANGE")) ? (String[])params.get("d_STL_COND_CD_CHANGE") : (String[])null);
		String[] d_OLD_CLAIM_ORG_CD = ((params.containsKey("d_OLD_CLAIM_ORG_CD")) ? (String[])params.get("d_OLD_CLAIM_ORG_CD") : (String[])null);
		String[] d_NEW_CLAIM_ORG_CD = ((params.containsKey("d_NEW_CLAIM_ORG_CD")) ? (String[])params.get("d_NEW_CLAIM_ORG_CD") : (String[])null);
		String[] d_CLAIM_ORG_CD_CHANGE = ((params.containsKey("d_CLAIM_ORG_CD_CHANGE")) ? (String[])params.get("d_CLAIM_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_EDI_TRN_BILL_TYP = ((params.containsKey("d_OLD_EDI_TRN_BILL_TYP")) ? (String[])params.get("d_OLD_EDI_TRN_BILL_TYP") : (String[])null);
		String[] d_NEW_EDI_TRN_BILL_TYP = ((params.containsKey("d_NEW_EDI_TRN_BILL_TYP")) ? (String[])params.get("d_NEW_EDI_TRN_BILL_TYP") : (String[])null);
		String[] d_EDI_TRN_BILL_TYP_CHANGE = ((params.containsKey("d_EDI_TRN_BILL_TYP_CHANGE")) ? (String[])params.get("d_EDI_TRN_BILL_TYP_CHANGE") : (String[])null);
		String[] d_OLD_EDI_TRN_RM_TYP = ((params.containsKey("d_OLD_EDI_TRN_RM_TYP")) ? (String[])params.get("d_OLD_EDI_TRN_RM_TYP") : (String[])null);
		String[] d_NEW_EDI_TRN_RM_TYP = ((params.containsKey("d_NEW_EDI_TRN_RM_TYP")) ? (String[])params.get("d_NEW_EDI_TRN_RM_TYP") : (String[])null);
		String[] d_EDI_TRN_RM_TYP_CHANGE = ((params.containsKey("d_EDI_TRN_RM_TYP_CHANGE")) ? (String[])params.get("d_EDI_TRN_RM_TYP_CHANGE") : (String[])null);
		String[] d_OLD_BILL_BALANCE_CTRL_FLG = ((params.containsKey("d_OLD_BILL_BALANCE_CTRL_FLG")) ? (String[])params.get("d_OLD_BILL_BALANCE_CTRL_FLG") : (String[])null);
		String[] d_NEW_BILL_BALANCE_CTRL_FLG = ((params.containsKey("d_NEW_BILL_BALANCE_CTRL_FLG")) ? (String[])params.get("d_NEW_BILL_BALANCE_CTRL_FLG") : (String[])null);
		String[] d_BILL_BALANCE_CTRL_FLG_CHANGE = ((params.containsKey("d_BILL_BALANCE_CTRL_FLG_CHANGE")) ? (String[])params.get("d_BILL_BALANCE_CTRL_FLG_CHANGE") : (String[])null);
		String[] d_OLD_AR_BALANCE_CTRL_FLG = ((params.containsKey("d_OLD_AR_BALANCE_CTRL_FLG")) ? (String[])params.get("d_OLD_AR_BALANCE_CTRL_FLG") : (String[])null);
		String[] d_NEW_AR_BALANCE_CTRL_FLG = ((params.containsKey("d_NEW_AR_BALANCE_CTRL_FLG")) ? (String[])params.get("d_NEW_AR_BALANCE_CTRL_FLG") : (String[])null);
		String[] d_AR_BALANCE_CTRL_FLG_CHANGE = ((params.containsKey("d_AR_BALANCE_CTRL_FLG_CHANGE")) ? (String[])params.get("d_AR_BALANCE_CTRL_FLG_CHANGE") : (String[])null);
		String[] d_OLD_COLLECTION_STD_AMOUNT = ((params.containsKey("d_OLD_COLLECTION_STD_AMOUNT")) ? (String[])params.get("d_OLD_COLLECTION_STD_AMOUNT") : (String[])null);
		String[] d_NEW_COLLECTION_STD_AMOUNT = ((params.containsKey("d_NEW_COLLECTION_STD_AMOUNT")) ? (String[])params.get("d_NEW_COLLECTION_STD_AMOUNT") : (String[])null);
		String[] d_COLLECTION_STD_AMOUNT_CHANGE = ((params.containsKey("d_COLLECTION_STD_AMOUNT_CHANGE")) ? (String[])params.get("d_COLLECTION_STD_AMOUNT_CHANGE") : (String[])null);
		String[] d_OLD_RM_OFFSET_TYP = ((params.containsKey("d_OLD_RM_OFFSET_TYP")) ? (String[])params.get("d_OLD_RM_OFFSET_TYP") : (String[])null);
		String[] d_NEW_RM_OFFSET_TYP = ((params.containsKey("d_NEW_RM_OFFSET_TYP")) ? (String[])params.get("d_NEW_RM_OFFSET_TYP") : (String[])null);
		String[] d_RM_OFFSET_TYP_CHANGE = ((params.containsKey("d_RM_OFFSET_TYP_CHANGE")) ? (String[])params.get("d_RM_OFFSET_TYP_CHANGE") : (String[])null);
		String[] d_OLD_LINE_CUST_CD = ((params.containsKey("d_OLD_LINE_CUST_CD")) ? (String[])params.get("d_OLD_LINE_CUST_CD") : (String[])null);
		String[] d_NEW_LINE_CUST_CD = ((params.containsKey("d_NEW_LINE_CUST_CD")) ? (String[])params.get("d_NEW_LINE_CUST_CD") : (String[])null);
		String[] d_LINE_CUST_CD_CHANGE = ((params.containsKey("d_LINE_CUST_CD_CHANGE")) ? (String[])params.get("d_LINE_CUST_CD_CHANGE") : (String[])null);
		String[] d_OLD_B_ACCT_CTRL_CD = ((params.containsKey("d_OLD_B_ACCT_CTRL_CD")) ? (String[])params.get("d_OLD_B_ACCT_CTRL_CD") : (String[])null);
		String[] d_NEW_B_ACCT_CTRL_CD = ((params.containsKey("d_NEW_B_ACCT_CTRL_CD")) ? (String[])params.get("d_NEW_B_ACCT_CTRL_CD") : (String[])null);
		String[] d_B_ACCT_CTRL_CD_CHANGE = ((params.containsKey("d_B_ACCT_CTRL_CD_CHANGE")) ? (String[])params.get("d_B_ACCT_CTRL_CD_CHANGE") : (String[])null);
		String[] d_OLD_B_ACCT_MNG_NAME = ((params.containsKey("d_OLD_B_ACCT_MNG_NAME")) ? (String[])params.get("d_OLD_B_ACCT_MNG_NAME") : (String[])null);
		String[] d_NEW_B_ACCT_MNG_NAME = ((params.containsKey("d_NEW_B_ACCT_MNG_NAME")) ? (String[])params.get("d_NEW_B_ACCT_MNG_NAME") : (String[])null);
		String[] d_B_ACCT_MNG_NAME_CHANGE = ((params.containsKey("d_B_ACCT_MNG_NAME_CHANGE")) ? (String[])params.get("d_B_ACCT_MNG_NAME_CHANGE") : (String[])null);
		String[] d_OLD_B_ACCT_NO = ((params.containsKey("d_OLD_B_ACCT_NO")) ? (String[])params.get("d_OLD_B_ACCT_NO") : (String[])null);
		String[] d_NEW_B_ACCT_NO = ((params.containsKey("d_NEW_B_ACCT_NO")) ? (String[])params.get("d_NEW_B_ACCT_NO") : (String[])null);
		String[] d_B_ACCT_NO_CHANGE = ((params.containsKey("d_B_ACCT_NO_CHANGE")) ? (String[])params.get("d_B_ACCT_NO_CHANGE") : (String[])null);
		String[] d_OLD_INTERNAL_TRN_TYP = ((params.containsKey("d_OLD_INTERNAL_TRN_TYP")) ? (String[])params.get("d_OLD_INTERNAL_TRN_TYP") : (String[])null);
		String[] d_NEW_INTERNAL_TRN_TYP = ((params.containsKey("d_NEW_INTERNAL_TRN_TYP")) ? (String[])params.get("d_NEW_INTERNAL_TRN_TYP") : (String[])null);
		String[] d_INTERNAL_TRN_TYP_CHANGE = ((params.containsKey("d_INTERNAL_TRN_TYP_CHANGE")) ? (String[])params.get("d_INTERNAL_TRN_TYP_CHANGE") : (String[])null);
		String[] d_MIN_AMOUNT_CHANGE = ((params.containsKey("d_MIN_AMOUNT_CHANGE")) ? (String[])params.get("d_MIN_AMOUNT_CHANGE") : (String[])null);
		String[] d_OLD_ORG_CD = ((params.containsKey("d_OLD_ORG_CD")) ? (String[])params.get("d_OLD_ORG_CD") : (String[])null);
		String[] d_NEW_ORG_CD = ((params.containsKey("d_NEW_ORG_CD")) ? (String[])params.get("d_NEW_ORG_CD") : (String[])null);
		String[] d_ORG_CD_CHANGE = ((params.containsKey("d_ORG_CD_CHANGE")) ? (String[])params.get("d_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_PAY_PATTERN_NAME = ((params.containsKey("d_OLD_PAY_PATTERN_NAME")) ? (String[])params.get("d_OLD_PAY_PATTERN_NAME") : (String[])null);
		String[] d_NEW_PAY_PATTERN_NAME = ((params.containsKey("d_NEW_PAY_PATTERN_NAME")) ? (String[])params.get("d_NEW_PAY_PATTERN_NAME") : (String[])null);
		String[] d_PAY_PATTERN_NAME_CHANGE = ((params.containsKey("d_PAY_PATTERN_NAME_CHANGE")) ? (String[])params.get("d_PAY_PATTERN_NAME_CHANGE") : (String[])null);
		String[] d_OLD_STD_AMOUNT = ((params.containsKey("d_OLD_STD_AMOUNT")) ? (String[])params.get("d_OLD_STD_AMOUNT") : (String[])null);
		String[] d_NEW_STD_AMOUNT = ((params.containsKey("d_NEW_STD_AMOUNT")) ? (String[])params.get("d_NEW_STD_AMOUNT") : (String[])null);
		String[] d_STD_AMOUNT_CHANGE = ((params.containsKey("d_STD_AMOUNT_CHANGE")) ? (String[])params.get("d_STD_AMOUNT_CHANGE") : (String[])null);
		String[] d_OLD_RATIO_1 = ((params.containsKey("d_OLD_RATIO_1")) ? (String[])params.get("d_OLD_RATIO_1") : (String[])null);
		String[] d_NEW_RATIO_1 = ((params.containsKey("d_NEW_RATIO_1")) ? (String[])params.get("d_NEW_RATIO_1") : (String[])null);
		String[] d_RATIO_1_CHANGE = ((params.containsKey("d_RATIO_1_CHANGE")) ? (String[])params.get("d_RATIO_1_CHANGE") : (String[])null);
		String[] d_OLD_RATIO_2 = ((params.containsKey("d_OLD_RATIO_2")) ? (String[])params.get("d_OLD_RATIO_2") : (String[])null);
		String[] d_NEW_RATIO_2 = ((params.containsKey("d_NEW_RATIO_2")) ? (String[])params.get("d_NEW_RATIO_2") : (String[])null);
		String[] d_RATIO_2_CHANGE = ((params.containsKey("d_RATIO_2_CHANGE")) ? (String[])params.get("d_RATIO_2_CHANGE") : (String[])null);
		String[] d_OLD_PATTERN_CD = ((params.containsKey("d_OLD_PATTERN_CD")) ? (String[])params.get("d_OLD_PATTERN_CD") : (String[])null);
		String[] d_NEW_PATTERN_CD = ((params.containsKey("d_NEW_PATTERN_CD")) ? (String[])params.get("d_NEW_PATTERN_CD") : (String[])null);
		String[] d_PATTERN_CD_CHANGE = ((params.containsKey("d_PATTERN_CD_CHANGE")) ? (String[])params.get("d_PATTERN_CD_CHANGE") : (String[])null);
		String[] d_OLD_CLASS_1 = ((params.containsKey("d_OLD_CLASS_1")) ? (String[])params.get("d_OLD_CLASS_1") : (String[])null);
		String[] d_NEW_CLASS_1 = ((params.containsKey("d_NEW_CLASS_1")) ? (String[])params.get("d_NEW_CLASS_1") : (String[])null);
		String[] d_CLASS_1_CHANGE = ((params.containsKey("d_CLASS_1_CHANGE")) ? (String[])params.get("d_CLASS_1_CHANGE") : (String[])null);
		String[] d_OLD_CLASS_2 = ((params.containsKey("d_OLD_CLASS_2")) ? (String[])params.get("d_OLD_CLASS_2") : (String[])null);
		String[] d_NEW_CLASS_2 = ((params.containsKey("d_NEW_CLASS_2")) ? (String[])params.get("d_NEW_CLASS_2") : (String[])null);
		String[] d_CLASS_2_CHANGE = ((params.containsKey("d_CLASS_2_CHANGE")) ? (String[])params.get("d_CLASS_2_CHANGE") : (String[])null);
		String[] d_OLD_CLASS_3 = ((params.containsKey("d_OLD_CLASS_3")) ? (String[])params.get("d_OLD_CLASS_3") : (String[])null);
		String[] d_NEW_CLASS_3 = ((params.containsKey("d_NEW_CLASS_3")) ? (String[])params.get("d_NEW_CLASS_3") : (String[])null);
		String[] d_CLASS_3_CHANGE = ((params.containsKey("d_CLASS_3_CHANGE")) ? (String[])params.get("d_CLASS_3_CHANGE") : (String[])null);
		String[] d_OLD_AUTO_JNL_NAME = ((params.containsKey("d_OLD_AUTO_JNL_NAME")) ? (String[])params.get("d_OLD_AUTO_JNL_NAME") : (String[])null);
		String[] d_NEW_AUTO_JNL_NAME = ((params.containsKey("d_NEW_AUTO_JNL_NAME")) ? (String[])params.get("d_NEW_AUTO_JNL_NAME") : (String[])null);
		String[] d_AUTO_JNL_NAME_CHANGE = ((params.containsKey("d_AUTO_JNL_NAME_CHANGE")) ? (String[])params.get("d_AUTO_JNL_NAME_CHANGE") : (String[])null);
		String[] d_OLD_DR_ACCT_CD = ((params.containsKey("d_OLD_DR_ACCT_CD")) ? (String[])params.get("d_OLD_DR_ACCT_CD") : (String[])null);
		String[] d_NEW_DR_ACCT_CD = ((params.containsKey("d_NEW_DR_ACCT_CD")) ? (String[])params.get("d_NEW_DR_ACCT_CD") : (String[])null);
		String[] d_DR_ACCT_CD_CHANGE = ((params.containsKey("d_DR_ACCT_CD_CHANGE")) ? (String[])params.get("d_DR_ACCT_CD_CHANGE") : (String[])null);
		String[] d_OLD_DR_SUB_ACCT_CD = ((params.containsKey("d_OLD_DR_SUB_ACCT_CD")) ? (String[])params.get("d_OLD_DR_SUB_ACCT_CD") : (String[])null);
		String[] d_NEW_DR_SUB_ACCT_CD = ((params.containsKey("d_NEW_DR_SUB_ACCT_CD")) ? (String[])params.get("d_NEW_DR_SUB_ACCT_CD") : (String[])null);
		String[] d_DR_SUB_ACCT_CD_CHANGE = ((params.containsKey("d_DR_SUB_ACCT_CD_CHANGE")) ? (String[])params.get("d_DR_SUB_ACCT_CD_CHANGE") : (String[])null);
		String[] d_OLD_DR_ORG_TYP = ((params.containsKey("d_OLD_DR_ORG_TYP")) ? (String[])params.get("d_OLD_DR_ORG_TYP") : (String[])null);
		String[] d_NEW_DR_ORG_TYP = ((params.containsKey("d_NEW_DR_ORG_TYP")) ? (String[])params.get("d_NEW_DR_ORG_TYP") : (String[])null);
		String[] d_DR_ORG_TYP_CHANGE = ((params.containsKey("d_DR_ORG_TYP_CHANGE")) ? (String[])params.get("d_DR_ORG_TYP_CHANGE") : (String[])null);
		String[] d_OLD_DR_ORG_CD = ((params.containsKey("d_OLD_DR_ORG_CD")) ? (String[])params.get("d_OLD_DR_ORG_CD") : (String[])null);
		String[] d_NEW_DR_ORG_CD = ((params.containsKey("d_NEW_DR_ORG_CD")) ? (String[])params.get("d_NEW_DR_ORG_CD") : (String[])null);
		String[] d_DR_ORG_CD_CHANGE = ((params.containsKey("d_DR_ORG_CD_CHANGE")) ? (String[])params.get("d_DR_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_CR_ACCT_CD = ((params.containsKey("d_OLD_CR_ACCT_CD")) ? (String[])params.get("d_OLD_CR_ACCT_CD") : (String[])null);
		String[] d_NEW_CR_ACCT_CD = ((params.containsKey("d_NEW_CR_ACCT_CD")) ? (String[])params.get("d_NEW_CR_ACCT_CD") : (String[])null);
		String[] d_CR_ACCT_CD_CHANGE = ((params.containsKey("d_CR_ACCT_CD_CHANGE")) ? (String[])params.get("d_CR_ACCT_CD_CHANGE") : (String[])null);
		String[] d_OLD_CR_SUB_ACCT_CD = ((params.containsKey("d_OLD_CR_SUB_ACCT_CD")) ? (String[])params.get("d_OLD_CR_SUB_ACCT_CD") : (String[])null);
		String[] d_NEW_CR_SUB_ACCT_CD = ((params.containsKey("d_NEW_CR_SUB_ACCT_CD")) ? (String[])params.get("d_NEW_CR_SUB_ACCT_CD") : (String[])null);
		String[] d_CR_SUB_ACCT_CD_CHANGE = ((params.containsKey("d_CR_SUB_ACCT_CD_CHANGE")) ? (String[])params.get("d_CR_SUB_ACCT_CD_CHANGE") : (String[])null);
		String[] d_OLD_CR_ORG_TYP = ((params.containsKey("d_OLD_CR_ORG_TYP")) ? (String[])params.get("d_OLD_CR_ORG_TYP") : (String[])null);
		String[] d_NEW_CR_ORG_TYP = ((params.containsKey("d_NEW_CR_ORG_TYP")) ? (String[])params.get("d_NEW_CR_ORG_TYP") : (String[])null);
		String[] d_CR_ORG_TYP_CHANGE = ((params.containsKey("d_CR_ORG_TYP_CHANGE")) ? (String[])params.get("d_CR_ORG_TYP_CHANGE") : (String[])null);
		String[] d_OLD_CR_ORG_CD = ((params.containsKey("d_OLD_CR_ORG_CD")) ? (String[])params.get("d_OLD_CR_ORG_CD") : (String[])null);
		String[] d_NEW_CR_ORG_CD = ((params.containsKey("d_NEW_CR_ORG_CD")) ? (String[])params.get("d_NEW_CR_ORG_CD") : (String[])null);
		String[] d_CR_ORG_CD_CHANGE = ((params.containsKey("d_CR_ORG_CD_CHANGE")) ? (String[])params.get("d_CR_ORG_CD_CHANGE") : (String[])null);
		String[] d_OLD_ACCT_SLIP_NUM = ((params.containsKey("d_OLD_ACCT_SLIP_NUM")) ? (String[])params.get("d_OLD_ACCT_SLIP_NUM") : (String[])null);
		String[] d_NEW_ACCT_SLIP_NUM = ((params.containsKey("d_NEW_ACCT_SLIP_NUM")) ? (String[])params.get("d_NEW_ACCT_SLIP_NUM") : (String[])null);
		String[] d_ACCT_SLIP_NUM_CHANGE = ((params.containsKey("d_ACCT_SLIP_NUM_CHANGE")) ? (String[])params.get("d_ACCT_SLIP_NUM_CHANGE") : (String[])null);
		String[] d_OLD_ACCT_JNL_PATTERN_CD = ((params.containsKey("d_OLD_ACCT_JNL_PATTERN_CD")) ? (String[])params.get("d_OLD_ACCT_JNL_PATTERN_CD") : (String[])null);
		String[] d_NEW_ACCT_JNL_PATTERN_CD = ((params.containsKey("d_NEW_ACCT_JNL_PATTERN_CD")) ? (String[])params.get("d_NEW_ACCT_JNL_PATTERN_CD") : (String[])null);
		String[] d_ACCT_JNL_PATTERN_CD_CHANGE = ((params.containsKey("d_ACCT_JNL_PATTERN_CD_CHANGE")) ? (String[])params.get("d_ACCT_JNL_PATTERN_CD_CHANGE") : (String[])null);
		String[] d_OLD_CAL_NO = ((params.containsKey("d_OLD_CAL_NO")) ? (String[])params.get("d_OLD_CAL_NO") : (String[])null);
		String[] d_NEW_CAL_NO = ((params.containsKey("d_NEW_CAL_NO")) ? (String[])params.get("d_NEW_CAL_NO") : (String[])null);
		String[] d_CAL_NO_CHANGE = ((params.containsKey("d_CAL_NO_CHANGE")) ? (String[])params.get("d_CAL_NO_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_NAME = ((params.containsKey("d_OLD_BANK_BR_NAME")) ? (String[])params.get("d_OLD_BANK_BR_NAME") : (String[])null);
		String[] d_NEW_BANK_BR_NAME = ((params.containsKey("d_NEW_BANK_BR_NAME")) ? (String[])params.get("d_NEW_BANK_BR_NAME") : (String[])null);
		String[] d_BANK_BR_NAME_CHANGE = ((params.containsKey("d_BANK_BR_NAME_CHANGE")) ? (String[])params.get("d_BANK_BR_NAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_ANAME = ((params.containsKey("d_OLD_BANK_BR_ANAME")) ? (String[])params.get("d_OLD_BANK_BR_ANAME") : (String[])null);
		String[] d_NEW_BANK_BR_ANAME = ((params.containsKey("d_NEW_BANK_BR_ANAME")) ? (String[])params.get("d_NEW_BANK_BR_ANAME") : (String[])null);
		String[] d_BANK_BR_ANAME_CHANGE = ((params.containsKey("d_BANK_BR_ANAME_CHANGE")) ? (String[])params.get("d_BANK_BR_ANAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_KNAME = ((params.containsKey("d_OLD_BANK_BR_KNAME")) ? (String[])params.get("d_OLD_BANK_BR_KNAME") : (String[])null);
		String[] d_NEW_BANK_BR_KNAME = ((params.containsKey("d_NEW_BANK_BR_KNAME")) ? (String[])params.get("d_NEW_BANK_BR_KNAME") : (String[])null);
		String[] d_BANK_BR_KNAME_CHANGE = ((params.containsKey("d_BANK_BR_KNAME_CHANGE")) ? (String[])params.get("d_BANK_BR_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_ENAME = ((params.containsKey("d_OLD_BANK_BR_ENAME")) ? (String[])params.get("d_OLD_BANK_BR_ENAME") : (String[])null);
		String[] d_NEW_BANK_BR_ENAME = ((params.containsKey("d_NEW_BANK_BR_ENAME")) ? (String[])params.get("d_NEW_BANK_BR_ENAME") : (String[])null);
		String[] d_BANK_BR_ENAME_CHANGE = ((params.containsKey("d_BANK_BR_ENAME_CHANGE")) ? (String[])params.get("d_BANK_BR_ENAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_FB_NAME = ((params.containsKey("d_OLD_BANK_BR_FB_NAME")) ? (String[])params.get("d_OLD_BANK_BR_FB_NAME") : (String[])null);
		String[] d_NEW_BANK_BR_FB_NAME = ((params.containsKey("d_NEW_BANK_BR_FB_NAME")) ? (String[])params.get("d_NEW_BANK_BR_FB_NAME") : (String[])null);
		String[] d_BANK_BR_FB_NAME_CHANGE = ((params.containsKey("d_BANK_BR_FB_NAME_CHANGE")) ? (String[])params.get("d_BANK_BR_FB_NAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_CNAME = ((params.containsKey("d_OLD_BANK_BR_CNAME")) ? (String[])params.get("d_OLD_BANK_BR_CNAME") : (String[])null);
		String[] d_NEW_BANK_BR_CNAME = ((params.containsKey("d_NEW_BANK_BR_CNAME")) ? (String[])params.get("d_NEW_BANK_BR_CNAME") : (String[])null);
		String[] d_BANK_BR_CNAME_CHANGE = ((params.containsKey("d_BANK_BR_CNAME_CHANGE")) ? (String[])params.get("d_BANK_BR_CNAME_CHANGE") : (String[])null);
		String[] d_OLD_BANK_BR_ECNAME = ((params.containsKey("d_OLD_BANK_BR_ECNAME")) ? (String[])params.get("d_OLD_BANK_BR_ECNAME") : (String[])null);
		String[] d_NEW_BANK_BR_ECNAME = ((params.containsKey("d_NEW_BANK_BR_ECNAME")) ? (String[])params.get("d_NEW_BANK_BR_ECNAME") : (String[])null);
		String[] d_BANK_BR_ECNAME_CHANGE = ((params.containsKey("d_BANK_BR_ECNAME_CHANGE")) ? (String[])params.get("d_BANK_BR_ECNAME_CHANGE") : (String[])null);
		String[] d_OLD_BRANCH_CD = ((params.containsKey("d_OLD_BRANCH_CD")) ? (String[])params.get("d_OLD_BRANCH_CD") : (String[])null);
		String[] d_NEW_BRANCH_CD = ((params.containsKey("d_NEW_BRANCH_CD")) ? (String[])params.get("d_NEW_BRANCH_CD") : (String[])null);
		String[] d_BRANCH_CD_CHANGE = ((params.containsKey("d_BRANCH_CD_CHANGE")) ? (String[])params.get("d_BRANCH_CD_CHANGE") : (String[])null);
		String[] d_OLD_BRANCH_FNAME = ((params.containsKey("d_OLD_BRANCH_FNAME")) ? (String[])params.get("d_OLD_BRANCH_FNAME") : (String[])null);
		String[] d_NEW_BRANCH_FNAME = ((params.containsKey("d_NEW_BRANCH_FNAME")) ? (String[])params.get("d_NEW_BRANCH_FNAME") : (String[])null);
		String[] d_BRANCH_FNAME_CHANGE = ((params.containsKey("d_BRANCH_FNAME_CHANGE")) ? (String[])params.get("d_BRANCH_FNAME_CHANGE") : (String[])null);
		String[] d_OLD_BRANCH_NAME = ((params.containsKey("d_OLD_BRANCH_NAME")) ? (String[])params.get("d_OLD_BRANCH_NAME") : (String[])null);
		String[] d_NEW_BRANCH_NAME = ((params.containsKey("d_NEW_BRANCH_NAME")) ? (String[])params.get("d_NEW_BRANCH_NAME") : (String[])null);
		String[] d_BRANCH_NAME_CHANGE = ((params.containsKey("d_BRANCH_NAME_CHANGE")) ? (String[])params.get("d_BRANCH_NAME_CHANGE") : (String[])null);
		String[] d_OLD_BRANCH_KNAME = ((params.containsKey("d_OLD_BRANCH_KNAME")) ? (String[])params.get("d_OLD_BRANCH_KNAME") : (String[])null);
		String[] d_NEW_BRANCH_KNAME = ((params.containsKey("d_NEW_BRANCH_KNAME")) ? (String[])params.get("d_NEW_BRANCH_KNAME") : (String[])null);
		String[] d_BRANCH_KNAME_CHANGE = ((params.containsKey("d_BRANCH_KNAME_CHANGE")) ? (String[])params.get("d_BRANCH_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_BRANCH_ENAME = ((params.containsKey("d_OLD_BRANCH_ENAME")) ? (String[])params.get("d_OLD_BRANCH_ENAME") : (String[])null);
		String[] d_NEW_BRANCH_ENAME = ((params.containsKey("d_NEW_BRANCH_ENAME")) ? (String[])params.get("d_NEW_BRANCH_ENAME") : (String[])null);
		String[] d_BRANCH_ENAME_CHANGE = ((params.containsKey("d_BRANCH_ENAME_CHANGE")) ? (String[])params.get("d_BRANCH_ENAME_CHANGE") : (String[])null);
		String[] d_OLD_BRANCH_SEQ_CD = ((params.containsKey("d_OLD_BRANCH_SEQ_CD")) ? (String[])params.get("d_OLD_BRANCH_SEQ_CD") : (String[])null);
		String[] d_NEW_BRANCH_SEQ_CD = ((params.containsKey("d_NEW_BRANCH_SEQ_CD")) ? (String[])params.get("d_NEW_BRANCH_SEQ_CD") : (String[])null);
		String[] d_BRANCH_SEQ_CD_CHANGE = ((params.containsKey("d_BRANCH_SEQ_CD_CHANGE")) ? (String[])params.get("d_BRANCH_SEQ_CD_CHANGE") : (String[])null);
		String[] d_OLD_CHARGE_ORG_NAME = ((params.containsKey("d_OLD_CHARGE_ORG_NAME")) ? (String[])params.get("d_OLD_CHARGE_ORG_NAME") : (String[])null);
		String[] d_NEW_CHARGE_ORG_NAME = ((params.containsKey("d_NEW_CHARGE_ORG_NAME")) ? (String[])params.get("d_NEW_CHARGE_ORG_NAME") : (String[])null);
		String[] d_CHARGE_ORG_NAME_CHANGE = ((params.containsKey("d_CHARGE_ORG_NAME_CHANGE")) ? (String[])params.get("d_CHARGE_ORG_NAME_CHANGE") : (String[])null);
		String[] d_OLD_CHARGE_PERSON_NAME = ((params.containsKey("d_OLD_CHARGE_PERSON_NAME")) ? (String[])params.get("d_OLD_CHARGE_PERSON_NAME") : (String[])null);
		String[] d_NEW_CHARGE_PERSON_NAME = ((params.containsKey("d_NEW_CHARGE_PERSON_NAME")) ? (String[])params.get("d_NEW_CHARGE_PERSON_NAME") : (String[])null);
		String[] d_CHARGE_PERSON_NAME_CHANGE = ((params.containsKey("d_CHARGE_PERSON_NAME_CHANGE")) ? (String[])params.get("d_CHARGE_PERSON_NAME_CHANGE") : (String[])null);
		String[] d_OLD_EDI_OWN_VEND_CD = ((params.containsKey("d_OLD_EDI_OWN_VEND_CD")) ? (String[])params.get("d_OLD_EDI_OWN_VEND_CD") : (String[])null);
		String[] d_NEW_EDI_OWN_VEND_CD = ((params.containsKey("d_NEW_EDI_OWN_VEND_CD")) ? (String[])params.get("d_NEW_EDI_OWN_VEND_CD") : (String[])null);
		String[] d_EDI_OWN_VEND_CD_CHANGE = ((params.containsKey("d_EDI_OWN_VEND_CD_CHANGE")) ? (String[])params.get("d_EDI_OWN_VEND_CD_CHANGE") : (String[])null);
		String[] d_OLD_REMARKS_1 = ((params.containsKey("d_OLD_REMARKS_1")) ? (String[])params.get("d_OLD_REMARKS_1") : (String[])null);
		String[] d_NEW_REMARKS_1 = ((params.containsKey("d_NEW_REMARKS_1")) ? (String[])params.get("d_NEW_REMARKS_1") : (String[])null);
		String[] d_REMARKS_1_CHANGE = ((params.containsKey("d_REMARKS_1_CHANGE")) ? (String[])params.get("d_REMARKS_1_CHANGE") : (String[])null);
		String[] d_OLD_REMARKS_2 = ((params.containsKey("d_OLD_REMARKS_2")) ? (String[])params.get("d_OLD_REMARKS_2") : (String[])null);
		String[] d_NEW_REMARKS_2 = ((params.containsKey("d_NEW_REMARKS_2")) ? (String[])params.get("d_NEW_REMARKS_2") : (String[])null);
		String[] d_REMARKS_2_CHANGE = ((params.containsKey("d_REMARKS_2_CHANGE")) ? (String[])params.get("d_REMARKS_2_CHANGE") : (String[])null);
		String[] d_OLD_REMARKS_3 = ((params.containsKey("d_OLD_REMARKS_3")) ? (String[])params.get("d_OLD_REMARKS_3") : (String[])null);
		String[] d_NEW_REMARKS_3 = ((params.containsKey("d_NEW_REMARKS_3")) ? (String[])params.get("d_NEW_REMARKS_3") : (String[])null);
		String[] d_REMARKS_3_CHANGE = ((params.containsKey("d_REMARKS_3_CHANGE")) ? (String[])params.get("d_REMARKS_3_CHANGE") : (String[])null);
		String[] d_OLD_DETAIL_ROUND_TYP = ((params.containsKey("d_OLD_DETAIL_ROUND_TYP")) ? (String[])params.get("d_OLD_DETAIL_ROUND_TYP") : (String[])null);
		String[] d_NEW_DETAIL_ROUND_TYP = ((params.containsKey("d_NEW_DETAIL_ROUND_TYP")) ? (String[])params.get("d_NEW_DETAIL_ROUND_TYP") : (String[])null);
		String[] d_DETAIL_ROUND_TYP_CHANGE = ((params.containsKey("d_DETAIL_ROUND_TYP_CHANGE")) ? (String[])params.get("d_DETAIL_ROUND_TYP_CHANGE") : (String[])null);
		String[] d_OLD_SECTION_CD = ((params.containsKey("d_OLD_SECTION_CD")) ? (String[])params.get("d_OLD_SECTION_CD") : (String[])null);
		String[] d_NEW_SECTION_CD = ((params.containsKey("d_NEW_SECTION_CD")) ? (String[])params.get("d_NEW_SECTION_CD") : (String[])null);
		String[] d_SECTION_CD_CHANGE = ((params.containsKey("d_SECTION_CD_CHANGE")) ? (String[])params.get("d_SECTION_CD_CHANGE") : (String[])null);
		String[] l_STATUS_NAME = ((params.containsKey("l_STATUS_NAME")) ? (String[])params.get("l_STATUS_NAME") : (String[])null);
		String[] d_OLD_PURPOSE_UNIT_PRICE_TYP = ((params.containsKey("d_OLD_PURPOSE_UNIT_PRICE_TYP")) ? (String[])params.get("d_OLD_PURPOSE_UNIT_PRICE_TYP") : (String[])null);
		String[] d_NEW_PURPOSE_UNIT_PRICE_TYP = ((params.containsKey("d_NEW_PURPOSE_UNIT_PRICE_TYP")) ? (String[])params.get("d_NEW_PURPOSE_UNIT_PRICE_TYP") : (String[])null);
		String[] d_PURPOSE_UNIT_PRICE_TYP_CHANGE = ((params.containsKey("d_PURPOSE_UNIT_PRICE_TYP_CHANGE")) ? (String[])params.get("d_PURPOSE_UNIT_PRICE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_SALES_UNIT_SIZE = ((params.containsKey("d_OLD_SALES_UNIT_SIZE")) ? (String[])params.get("d_OLD_SALES_UNIT_SIZE") : (String[])null);
		String[] d_NEW_SALES_UNIT_SIZE = ((params.containsKey("d_NEW_SALES_UNIT_SIZE")) ? (String[])params.get("d_NEW_SALES_UNIT_SIZE") : (String[])null);
		String[] d_SALES_UNIT_SIZE_CHANGE = ((params.containsKey("d_SALES_UNIT_SIZE_CHANGE")) ? (String[])params.get("d_SALES_UNIT_SIZE_CHANGE") : (String[])null);
		String[] d_OLD_SALES_UNIT_COST = ((params.containsKey("d_OLD_SALES_UNIT_COST")) ? (String[])params.get("d_OLD_SALES_UNIT_COST") : (String[])null);
		String[] d_NEW_SALES_UNIT_COST = ((params.containsKey("d_NEW_SALES_UNIT_COST")) ? (String[])params.get("d_NEW_SALES_UNIT_COST") : (String[])null);
		String[] d_SALES_UNIT_COST_CHANGE = ((params.containsKey("d_SALES_UNIT_COST_CHANGE")) ? (String[])params.get("d_SALES_UNIT_COST_CHANGE") : (String[])null);
		String[] d_OLD_CUST_GRP_CD = ((params.containsKey("d_OLD_CUST_GRP_CD")) ? (String[])params.get("d_OLD_CUST_GRP_CD") : (String[])null);
		String[] d_NEW_CUST_GRP_CD = ((params.containsKey("d_NEW_CUST_GRP_CD")) ? (String[])params.get("d_NEW_CUST_GRP_CD") : (String[])null);
		String[] d_CUST_GRP_CD_CHANGE = ((params.containsKey("d_CUST_GRP_CD_CHANGE")) ? (String[])params.get("d_CUST_GRP_CD_CHANGE") : (String[])null);
		String[] d_OLD_CNCNTRT_DLV_LOC_CD = ((params.containsKey("d_OLD_CNCNTRT_DLV_LOC_CD")) ? (String[])params.get("d_OLD_CNCNTRT_DLV_LOC_CD") : (String[])null);
		String[] d_NEW_CNCNTRT_DLV_LOC_CD = ((params.containsKey("d_NEW_CNCNTRT_DLV_LOC_CD")) ? (String[])params.get("d_NEW_CNCNTRT_DLV_LOC_CD") : (String[])null);
		String[] d_CNCNTRT_DLV_LOC_CD_CHANGE = ((params.containsKey("d_CNCNTRT_DLV_LOC_CD_CHANGE")) ? (String[])params.get("d_CNCNTRT_DLV_LOC_CD_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_CTL_TYP = ((params.containsKey("d_OLD_SHIP_CTL_TYP")) ? (String[])params.get("d_OLD_SHIP_CTL_TYP") : (String[])null);
		String[] d_NEW_SHIP_CTL_TYP = ((params.containsKey("d_NEW_SHIP_CTL_TYP")) ? (String[])params.get("d_NEW_SHIP_CTL_TYP") : (String[])null);
		String[] d_SHIP_CTL_TYP_CHANGE = ((params.containsKey("d_SHIP_CTL_TYP_CHANGE")) ? (String[])params.get("d_SHIP_CTL_TYP_CHANGE") : (String[])null);
		String[] d_OLD_DLV_SLIP_ISS_FLG = ((params.containsKey("d_OLD_DLV_SLIP_ISS_FLG")) ? (String[])params.get("d_OLD_DLV_SLIP_ISS_FLG") : (String[])null);
		String[] d_NEW_DLV_SLIP_ISS_FLG = ((params.containsKey("d_NEW_DLV_SLIP_ISS_FLG")) ? (String[])params.get("d_NEW_DLV_SLIP_ISS_FLG") : (String[])null);
		String[] d_DLV_SLIP_ISS_FLG_CHANGE = ((params.containsKey("d_DLV_SLIP_ISS_FLG_CHANGE")) ? (String[])params.get("d_DLV_SLIP_ISS_FLG_CHANGE") : (String[])null);
		String[] d_OLD_IDENT_CARD_F_ISS_TYP = ((params.containsKey("d_OLD_IDENT_CARD_F_ISS_TYP")) ? (String[])params.get("d_OLD_IDENT_CARD_F_ISS_TYP") : (String[])null);
		String[] d_NEW_IDENT_CARD_F_ISS_TYP = ((params.containsKey("d_NEW_IDENT_CARD_F_ISS_TYP")) ? (String[])params.get("d_NEW_IDENT_CARD_F_ISS_TYP") : (String[])null);
		String[] d_IDENT_CARD_F_ISS_TYP_CHANGE = ((params.containsKey("d_IDENT_CARD_F_ISS_TYP_CHANGE")) ? (String[])params.get("d_IDENT_CARD_F_ISS_TYP_CHANGE") : (String[])null);
		String[] d_OLD_IDENT_CARD_F_FORMAT_TYP = ((params.containsKey("d_OLD_IDENT_CARD_F_FORMAT_TYP")) ? (String[])params.get("d_OLD_IDENT_CARD_F_FORMAT_TYP") : (String[])null);
		String[] d_NEW_IDENT_CARD_F_FORMAT_TYP = ((params.containsKey("d_NEW_IDENT_CARD_F_FORMAT_TYP")) ? (String[])params.get("d_NEW_IDENT_CARD_F_FORMAT_TYP") : (String[])null);
		String[] d_IDENT_CARD_F_FORMAT_TYP_CHANGE = ((params.containsKey("d_IDENT_CARD_F_FORMAT_TYP_CHANGE")) ? (String[])params.get("d_IDENT_CARD_F_FORMAT_TYP_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_FIX_TERM = ((params.containsKey("d_OLD_SHIP_FIX_TERM")) ? (String[])params.get("d_OLD_SHIP_FIX_TERM") : (String[])null);
		String[] d_NEW_SHIP_FIX_TERM = ((params.containsKey("d_NEW_SHIP_FIX_TERM")) ? (String[])params.get("d_NEW_SHIP_FIX_TERM") : (String[])null);
		String[] d_SHIP_FIX_TERM_CHANGE = ((params.containsKey("d_SHIP_FIX_TERM_CHANGE")) ? (String[])params.get("d_SHIP_FIX_TERM_CHANGE") : (String[])null);
		String[] d_OLD_MASS_PRODUCT_TYP = ((params.containsKey("d_OLD_MASS_PRODUCT_TYP")) ? (String[])params.get("d_OLD_MASS_PRODUCT_TYP") : (String[])null);
		String[] d_NEW_MASS_PRODUCT_TYP = ((params.containsKey("d_NEW_MASS_PRODUCT_TYP")) ? (String[])params.get("d_NEW_MASS_PRODUCT_TYP") : (String[])null);
		String[] d_MASS_PRODUCT_TYP_CHANGE = ((params.containsKey("d_MASS_PRODUCT_TYP_CHANGE")) ? (String[])params.get("d_MASS_PRODUCT_TYP_CHANGE") : (String[])null);
		String[] d_OLD_DECISION_REPLACE_PTN = ((params.containsKey("d_OLD_DECISION_REPLACE_PTN")) ? (String[])params.get("d_OLD_DECISION_REPLACE_PTN") : (String[])null);
		String[] d_NEW_DECISION_REPLACE_PTN = ((params.containsKey("d_NEW_DECISION_REPLACE_PTN")) ? (String[])params.get("d_NEW_DECISION_REPLACE_PTN") : (String[])null);
		String[] d_DECISION_REPLACE_PTN_CHANGE = ((params.containsKey("d_DECISION_REPLACE_PTN_CHANGE")) ? (String[])params.get("d_DECISION_REPLACE_PTN_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_RSLT_APPLY_TYP = ((params.containsKey("d_OLD_SHIP_RSLT_APPLY_TYP")) ? (String[])params.get("d_OLD_SHIP_RSLT_APPLY_TYP") : (String[])null);
		String[] d_NEW_SHIP_RSLT_APPLY_TYP = ((params.containsKey("d_NEW_SHIP_RSLT_APPLY_TYP")) ? (String[])params.get("d_NEW_SHIP_RSLT_APPLY_TYP") : (String[])null);
		String[] d_SHIP_RSLT_APPLY_TYP_CHANGE = ((params.containsKey("d_SHIP_RSLT_APPLY_TYP_CHANGE")) ? (String[])params.get("d_SHIP_RSLT_APPLY_TYP_CHANGE") : (String[])null);
		String[] d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP = ((params.containsKey("d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP")) ? (String[])params.get("d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP") : (String[])null);
		String[] d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP = ((params.containsKey("d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP")) ? (String[])params.get("d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP") : (String[])null);
		String[] d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE = ((params.containsKey("d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE")) ? (String[])params.get("d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE") : (String[])null);
		String[] d_OLD_NEXT_DLV_SHIFT_EFF_FLG = ((params.containsKey("d_OLD_NEXT_DLV_SHIFT_EFF_FLG")) ? (String[])params.get("d_OLD_NEXT_DLV_SHIFT_EFF_FLG") : (String[])null);
		String[] d_NEW_NEXT_DLV_SHIFT_EFF_FLG = ((params.containsKey("d_NEW_NEXT_DLV_SHIFT_EFF_FLG")) ? (String[])params.get("d_NEW_NEXT_DLV_SHIFT_EFF_FLG") : (String[])null);
		String[] d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE = ((params.containsKey("d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE")) ? (String[])params.get("d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE") : (String[])null);
		String[] d_OLD_UNCNFM_PLAN_AVG_FLG = ((params.containsKey("d_OLD_UNCNFM_PLAN_AVG_FLG")) ? (String[])params.get("d_OLD_UNCNFM_PLAN_AVG_FLG") : (String[])null);
		String[] d_NEW_UNCNFM_PLAN_AVG_FLG = ((params.containsKey("d_NEW_UNCNFM_PLAN_AVG_FLG")) ? (String[])params.get("d_NEW_UNCNFM_PLAN_AVG_FLG") : (String[])null);
		String[] d_UNCNFM_PLAN_AVG_FLG_CHANGE = ((params.containsKey("d_UNCNFM_PLAN_AVG_FLG_CHANGE")) ? (String[])params.get("d_UNCNFM_PLAN_AVG_FLG_CHANGE") : (String[])null);
		String[] d_OLD_CNCNTRT_TRANS_LT = ((params.containsKey("d_OLD_CNCNTRT_TRANS_LT")) ? (String[])params.get("d_OLD_CNCNTRT_TRANS_LT") : (String[])null);
		String[] d_NEW_CNCNTRT_TRANS_LT = ((params.containsKey("d_NEW_CNCNTRT_TRANS_LT")) ? (String[])params.get("d_NEW_CNCNTRT_TRANS_LT") : (String[])null);
		String[] d_CNCNTRT_TRANS_LT_CHANGE = ((params.containsKey("d_CNCNTRT_TRANS_LT_CHANGE")) ? (String[])params.get("d_CNCNTRT_TRANS_LT_CHANGE") : (String[])null);
		String[] d_OLD_CUST_TRANS_LT = ((params.containsKey("d_OLD_CUST_TRANS_LT")) ? (String[])params.get("d_OLD_CUST_TRANS_LT") : (String[])null);
		String[] d_NEW_CUST_TRANS_LT = ((params.containsKey("d_NEW_CUST_TRANS_LT")) ? (String[])params.get("d_NEW_CUST_TRANS_LT") : (String[])null);
		String[] d_CUST_TRANS_LT_CHANGE = ((params.containsKey("d_CUST_TRANS_LT_CHANGE")) ? (String[])params.get("d_CUST_TRANS_LT_CHANGE") : (String[])null);
		String[] d_OLD_CUST_DESINATED_DLV_LOC_CD = ((params.containsKey("d_OLD_CUST_DESINATED_DLV_LOC_CD")) ? (String[])params.get("d_OLD_CUST_DESINATED_DLV_LOC_CD") : (String[])null);
		String[] d_NEW_CUST_DESINATED_DLV_LOC_CD = ((params.containsKey("d_NEW_CUST_DESINATED_DLV_LOC_CD")) ? (String[])params.get("d_NEW_CUST_DESINATED_DLV_LOC_CD") : (String[])null);
		String[] d_CUST_DESINATED_DLV_LOC_CD_CHANGE = ((params.containsKey("d_CUST_DESINATED_DLV_LOC_CD_CHANGE")) ? (String[])params.get("d_CUST_DESINATED_DLV_LOC_CD_CHANGE") : (String[])null);
		String[] d_OLD_DLV_LOC_OPTION_CHANGE_VALUE = ((params.containsKey("d_OLD_DLV_LOC_OPTION_CHANGE_VALUE")) ? (String[])params.get("d_OLD_DLV_LOC_OPTION_CHANGE_VALUE") : (String[])null);
		String[] d_NEW_DLV_LOC_OPTION_CHANGE_VALUE = ((params.containsKey("d_NEW_DLV_LOC_OPTION_CHANGE_VALUE")) ? (String[])params.get("d_NEW_DLV_LOC_OPTION_CHANGE_VALUE") : (String[])null);
		String[] d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE = ((params.containsKey("d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE")) ? (String[])params.get("d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE") : (String[])null);
		String[] d_OLD_CUST_DESINATED_DLV_LOC_NAME = ((params.containsKey("d_OLD_CUST_DESINATED_DLV_LOC_NAME")) ? (String[])params.get("d_OLD_CUST_DESINATED_DLV_LOC_NAME") : (String[])null);
		String[] d_NEW_CUST_DESINATED_DLV_LOC_NAME = ((params.containsKey("d_NEW_CUST_DESINATED_DLV_LOC_NAME")) ? (String[])params.get("d_NEW_CUST_DESINATED_DLV_LOC_NAME") : (String[])null);
		String[] d_CUST_DESINATED_DLV_LOC_NAME_CHANGE = ((params.containsKey("d_CUST_DESINATED_DLV_LOC_NAME_CHANGE")) ? (String[])params.get("d_CUST_DESINATED_DLV_LOC_NAME_CHANGE") : (String[])null);
		String[] d_OLD_CUST_DESINATED_DLV_LOC_KNAME = ((params.containsKey("d_OLD_CUST_DESINATED_DLV_LOC_KNAME")) ? (String[])params.get("d_OLD_CUST_DESINATED_DLV_LOC_KNAME") : (String[])null);
		String[] d_NEW_CUST_DESINATED_DLV_LOC_KNAME = ((params.containsKey("d_NEW_CUST_DESINATED_DLV_LOC_KNAME")) ? (String[])params.get("d_NEW_CUST_DESINATED_DLV_LOC_KNAME") : (String[])null);
		String[] d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE = ((params.containsKey("d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE")) ? (String[])params.get("d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE") : (String[])null);
		String[] d_OLD_CUST_DESINATED_DLV_LOC_ENAME = ((params.containsKey("d_OLD_CUST_DESINATED_DLV_LOC_ENAME")) ? (String[])params.get("d_OLD_CUST_DESINATED_DLV_LOC_ENAME") : (String[])null);
		String[] d_NEW_CUST_DESINATED_DLV_LOC_ENAME = ((params.containsKey("d_NEW_CUST_DESINATED_DLV_LOC_ENAME")) ? (String[])params.get("d_NEW_CUST_DESINATED_DLV_LOC_ENAME") : (String[])null);
		String[] d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE = ((params.containsKey("d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE")) ? (String[])params.get("d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE") : (String[])null);
		String[] h_HISTORY_FOR_APPR = ((params.containsKey("h_HISTORY_FOR_APPR")) ? (String[])params.get("h_HISTORY_FOR_APPR") : (String[])null);
		String[] d_OLD_ITEM_NAME = ((params.containsKey("d_OLD_ITEM_NAME")) ? (String[])params.get("d_OLD_ITEM_NAME") : (String[])null);
		String[] d_NEW_ITEM_NAME = ((params.containsKey("d_NEW_ITEM_NAME")) ? (String[])params.get("d_NEW_ITEM_NAME") : (String[])null);
		String[] d_ITEM_NAME_CHANGE = ((params.containsKey("d_ITEM_NAME_CHANGE")) ? (String[])params.get("d_ITEM_NAME_CHANGE") : (String[])null);
		String[] d_OLD_DRAW_CD = ((params.containsKey("d_OLD_DRAW_CD")) ? (String[])params.get("d_OLD_DRAW_CD") : (String[])null);
		String[] d_NEW_DRAW_CD = ((params.containsKey("d_NEW_DRAW_CD")) ? (String[])params.get("d_NEW_DRAW_CD") : (String[])null);
		String[] d_DRAW_CD_CHANGE = ((params.containsKey("d_DRAW_CD_CHANGE")) ? (String[])params.get("d_DRAW_CD_CHANGE") : (String[])null);
		String[] d_OLD_HIGH_LEVEL_NO = ((params.containsKey("d_OLD_HIGH_LEVEL_NO")) ? (String[])params.get("d_OLD_HIGH_LEVEL_NO") : (String[])null);
		String[] d_NEW_HIGH_LEVEL_NO = ((params.containsKey("d_NEW_HIGH_LEVEL_NO")) ? (String[])params.get("d_NEW_HIGH_LEVEL_NO") : (String[])null);
		String[] d_HIGH_LEVEL_NO_CHANGE = ((params.containsKey("d_HIGH_LEVEL_NO_CHANGE")) ? (String[])params.get("d_HIGH_LEVEL_NO_CHANGE") : (String[])null);
		String[] d_OLD_SPEC = ((params.containsKey("d_OLD_SPEC")) ? (String[])params.get("d_OLD_SPEC") : (String[])null);
		String[] d_NEW_SPEC = ((params.containsKey("d_NEW_SPEC")) ? (String[])params.get("d_NEW_SPEC") : (String[])null);
		String[] d_SPEC_CHANGE = ((params.containsKey("d_SPEC_CHANGE")) ? (String[])params.get("d_SPEC_CHANGE") : (String[])null);
		String[] d_OLD_ISSUE_TYP = ((params.containsKey("d_OLD_ISSUE_TYP")) ? (String[])params.get("d_OLD_ISSUE_TYP") : (String[])null);
		String[] d_NEW_ISSUE_TYP = ((params.containsKey("d_NEW_ISSUE_TYP")) ? (String[])params.get("d_NEW_ISSUE_TYP") : (String[])null);
		String[] d_ISSUE_TYP_CHANGE = ((params.containsKey("d_ISSUE_TYP_CHANGE")) ? (String[])params.get("d_ISSUE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_UNIT_QTY_TYP = ((params.containsKey("d_OLD_UNIT_QTY_TYP")) ? (String[])params.get("d_OLD_UNIT_QTY_TYP") : (String[])null);
		String[] d_NEW_UNIT_QTY_TYP = ((params.containsKey("d_NEW_UNIT_QTY_TYP")) ? (String[])params.get("d_NEW_UNIT_QTY_TYP") : (String[])null);
		String[] d_UNIT_QTY_TYP_CHANGE = ((params.containsKey("d_UNIT_QTY_TYP_CHANGE")) ? (String[])params.get("d_UNIT_QTY_TYP_CHANGE") : (String[])null);
		String[] d_OLD_OUTSIDE_TYP = ((params.containsKey("d_OLD_OUTSIDE_TYP")) ? (String[])params.get("d_OLD_OUTSIDE_TYP") : (String[])null);
		String[] d_NEW_OUTSIDE_TYP = ((params.containsKey("d_NEW_OUTSIDE_TYP")) ? (String[])params.get("d_NEW_OUTSIDE_TYP") : (String[])null);
		String[] d_OUTSIDE_TYP_CHANGE = ((params.containsKey("d_OUTSIDE_TYP_CHANGE")) ? (String[])params.get("d_OUTSIDE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_ACPT_INSPC_TYP = ((params.containsKey("d_OLD_ACPT_INSPC_TYP")) ? (String[])params.get("d_OLD_ACPT_INSPC_TYP") : (String[])null);
		String[] d_NEW_ACPT_INSPC_TYP = ((params.containsKey("d_NEW_ACPT_INSPC_TYP")) ? (String[])params.get("d_NEW_ACPT_INSPC_TYP") : (String[])null);
		String[] d_ACPT_INSPC_TYP_CHANGE = ((params.containsKey("d_ACPT_INSPC_TYP_CHANGE")) ? (String[])params.get("d_ACPT_INSPC_TYP_CHANGE") : (String[])null);
		String[] d_OLD_STOCK_UNIT_FLG = ((params.containsKey("d_OLD_STOCK_UNIT_FLG")) ? (String[])params.get("d_OLD_STOCK_UNIT_FLG") : (String[])null);
		String[] d_NEW_STOCK_UNIT_FLG = ((params.containsKey("d_NEW_STOCK_UNIT_FLG")) ? (String[])params.get("d_NEW_STOCK_UNIT_FLG") : (String[])null);
		String[] d_STOCK_UNIT_FLG_CHANGE = ((params.containsKey("d_STOCK_UNIT_FLG_CHANGE")) ? (String[])params.get("d_STOCK_UNIT_FLG_CHANGE") : (String[])null);
		String[] d_OLD_PRODUCT_TYP = ((params.containsKey("d_OLD_PRODUCT_TYP")) ? (String[])params.get("d_OLD_PRODUCT_TYP") : (String[])null);
		String[] d_NEW_PRODUCT_TYP = ((params.containsKey("d_NEW_PRODUCT_TYP")) ? (String[])params.get("d_NEW_PRODUCT_TYP") : (String[])null);
		String[] d_PRODUCT_TYP_CHANGE = ((params.containsKey("d_PRODUCT_TYP_CHANGE")) ? (String[])params.get("d_PRODUCT_TYP_CHANGE") : (String[])null);
		String[] d_OLD_STOCK_UNIT = ((params.containsKey("d_OLD_STOCK_UNIT")) ? (String[])params.get("d_OLD_STOCK_UNIT") : (String[])null);
		String[] d_NEW_STOCK_UNIT = ((params.containsKey("d_NEW_STOCK_UNIT")) ? (String[])params.get("d_NEW_STOCK_UNIT") : (String[])null);
		String[] d_STOCK_UNIT_CHANGE = ((params.containsKey("d_STOCK_UNIT_CHANGE")) ? (String[])params.get("d_STOCK_UNIT_CHANGE") : (String[])null);
		String[] d_OLD_ABC_TYP = ((params.containsKey("d_OLD_ABC_TYP")) ? (String[])params.get("d_OLD_ABC_TYP") : (String[])null);
		String[] d_NEW_ABC_TYP = ((params.containsKey("d_NEW_ABC_TYP")) ? (String[])params.get("d_NEW_ABC_TYP") : (String[])null);
		String[] d_ABC_TYP_CHANGE = ((params.containsKey("d_ABC_TYP_CHANGE")) ? (String[])params.get("d_ABC_TYP_CHANGE") : (String[])null);
		String[] d_OLD_PKG_UNIT = ((params.containsKey("d_OLD_PKG_UNIT")) ? (String[])params.get("d_OLD_PKG_UNIT") : (String[])null);
		String[] d_NEW_PKG_UNIT = ((params.containsKey("d_NEW_PKG_UNIT")) ? (String[])params.get("d_NEW_PKG_UNIT") : (String[])null);
		String[] d_PKG_UNIT_CHANGE = ((params.containsKey("d_PKG_UNIT_CHANGE")) ? (String[])params.get("d_PKG_UNIT_CHANGE") : (String[])null);
		String[] d_OLD_OPR_RSLT_TYP = ((params.containsKey("d_OLD_OPR_RSLT_TYP")) ? (String[])params.get("d_OLD_OPR_RSLT_TYP") : (String[])null);
		String[] d_NEW_OPR_RSLT_TYP = ((params.containsKey("d_NEW_OPR_RSLT_TYP")) ? (String[])params.get("d_NEW_OPR_RSLT_TYP") : (String[])null);
		String[] d_OPR_RSLT_TYP_CHANGE = ((params.containsKey("d_OPR_RSLT_TYP_CHANGE")) ? (String[])params.get("d_OPR_RSLT_TYP_CHANGE") : (String[])null);
		String[] d_OLD_PKG_UNIT_QTY = ((params.containsKey("d_OLD_PKG_UNIT_QTY")) ? (String[])params.get("d_OLD_PKG_UNIT_QTY") : (String[])null);
		String[] d_NEW_PKG_UNIT_QTY = ((params.containsKey("d_NEW_PKG_UNIT_QTY")) ? (String[])params.get("d_NEW_PKG_UNIT_QTY") : (String[])null);
		String[] d_PKG_UNIT_QTY_CHANGE = ((params.containsKey("d_PKG_UNIT_QTY_CHANGE")) ? (String[])params.get("d_PKG_UNIT_QTY_CHANGE") : (String[])null);
		String[] d_OLD_SPL_ITEM_TYP = ((params.containsKey("d_OLD_SPL_ITEM_TYP")) ? (String[])params.get("d_OLD_SPL_ITEM_TYP") : (String[])null);
		String[] d_NEW_SPL_ITEM_TYP = ((params.containsKey("d_NEW_SPL_ITEM_TYP")) ? (String[])params.get("d_NEW_SPL_ITEM_TYP") : (String[])null);
		String[] d_SPL_ITEM_TYP_CHANGE = ((params.containsKey("d_SPL_ITEM_TYP_CHANGE")) ? (String[])params.get("d_SPL_ITEM_TYP_CHANGE") : (String[])null);
		String[] d_OLD_ODR_LT = ((params.containsKey("d_OLD_ODR_LT")) ? (String[])params.get("d_OLD_ODR_LT") : (String[])null);
		String[] d_NEW_ODR_LT = ((params.containsKey("d_NEW_ODR_LT")) ? (String[])params.get("d_NEW_ODR_LT") : (String[])null);
		String[] d_ODR_LT_CHANGE = ((params.containsKey("d_ODR_LT_CHANGE")) ? (String[])params.get("d_ODR_LT_CHANGE") : (String[])null);
		String[] d_OLD_ISSUE_LT = ((params.containsKey("d_OLD_ISSUE_LT")) ? (String[])params.get("d_OLD_ISSUE_LT") : (String[])null);
		String[] d_NEW_ISSUE_LT = ((params.containsKey("d_NEW_ISSUE_LT")) ? (String[])params.get("d_NEW_ISSUE_LT") : (String[])null);
		String[] d_ISSUE_LT_CHANGE = ((params.containsKey("d_ISSUE_LT_CHANGE")) ? (String[])params.get("d_ISSUE_LT_CHANGE") : (String[])null);
		String[] d_OLD_FIXED_LT = ((params.containsKey("d_OLD_FIXED_LT")) ? (String[])params.get("d_OLD_FIXED_LT") : (String[])null);
		String[] d_NEW_FIXED_LT = ((params.containsKey("d_NEW_FIXED_LT")) ? (String[])params.get("d_NEW_FIXED_LT") : (String[])null);
		String[] d_FIXED_LT_CHANGE = ((params.containsKey("d_FIXED_LT_CHANGE")) ? (String[])params.get("d_FIXED_LT_CHANGE") : (String[])null);
		String[] d_OLD_PROP_LOT_SIZE = ((params.containsKey("d_OLD_PROP_LOT_SIZE")) ? (String[])params.get("d_OLD_PROP_LOT_SIZE") : (String[])null);
		String[] d_NEW_PROP_LOT_SIZE = ((params.containsKey("d_NEW_PROP_LOT_SIZE")) ? (String[])params.get("d_NEW_PROP_LOT_SIZE") : (String[])null);
		String[] d_PROP_LOT_SIZE_CHANGE = ((params.containsKey("d_PROP_LOT_SIZE_CHANGE")) ? (String[])params.get("d_PROP_LOT_SIZE_CHANGE") : (String[])null);
		String[] d_OLD_PROP_LT = ((params.containsKey("d_OLD_PROP_LT")) ? (String[])params.get("d_OLD_PROP_LT") : (String[])null);
		String[] d_NEW_PROP_LT = ((params.containsKey("d_NEW_PROP_LT")) ? (String[])params.get("d_NEW_PROP_LT") : (String[])null);
		String[] d_PROP_LT_CHANGE = ((params.containsKey("d_PROP_LT_CHANGE")) ? (String[])params.get("d_PROP_LT_CHANGE") : (String[])null);
		String[] d_OLD_ITEM_SPOIL = ((params.containsKey("d_OLD_ITEM_SPOIL")) ? (String[])params.get("d_OLD_ITEM_SPOIL") : (String[])null);
		String[] d_NEW_ITEM_SPOIL = ((params.containsKey("d_NEW_ITEM_SPOIL")) ? (String[])params.get("d_NEW_ITEM_SPOIL") : (String[])null);
		String[] d_ITEM_SPOIL_CHANGE = ((params.containsKey("d_ITEM_SPOIL_CHANGE")) ? (String[])params.get("d_ITEM_SPOIL_CHANGE") : (String[])null);
		String[] d_OLD_SAFETY_LT = ((params.containsKey("d_OLD_SAFETY_LT")) ? (String[])params.get("d_OLD_SAFETY_LT") : (String[])null);
		String[] d_NEW_SAFETY_LT = ((params.containsKey("d_NEW_SAFETY_LT")) ? (String[])params.get("d_NEW_SAFETY_LT") : (String[])null);
		String[] d_SAFETY_LT_CHANGE = ((params.containsKey("d_SAFETY_LT_CHANGE")) ? (String[])params.get("d_SAFETY_LT_CHANGE") : (String[])null);
		String[] d_OLD_SAFETY_STOCK = ((params.containsKey("d_OLD_SAFETY_STOCK")) ? (String[])params.get("d_OLD_SAFETY_STOCK") : (String[])null);
		String[] d_NEW_SAFETY_STOCK = ((params.containsKey("d_NEW_SAFETY_STOCK")) ? (String[])params.get("d_NEW_SAFETY_STOCK") : (String[])null);
		String[] d_SAFETY_STOCK_CHANGE = ((params.containsKey("d_SAFETY_STOCK_CHANGE")) ? (String[])params.get("d_SAFETY_STOCK_CHANGE") : (String[])null);
		String[] d_OLD_MRP_ODR_TYP = ((params.containsKey("d_OLD_MRP_ODR_TYP")) ? (String[])params.get("d_OLD_MRP_ODR_TYP") : (String[])null);
		String[] d_NEW_MRP_ODR_TYP = ((params.containsKey("d_NEW_MRP_ODR_TYP")) ? (String[])params.get("d_NEW_MRP_ODR_TYP") : (String[])null);
		String[] d_MRP_ODR_TYP_CHANGE = ((params.containsKey("d_MRP_ODR_TYP_CHANGE")) ? (String[])params.get("d_MRP_ODR_TYP_CHANGE") : (String[])null);
		String[] d_OLD_MANHOUR_TYP = ((params.containsKey("d_OLD_MANHOUR_TYP")) ? (String[])params.get("d_OLD_MANHOUR_TYP") : (String[])null);
		String[] d_NEW_MANHOUR_TYP = ((params.containsKey("d_NEW_MANHOUR_TYP")) ? (String[])params.get("d_NEW_MANHOUR_TYP") : (String[])null);
		String[] d_MANHOUR_TYP_CHANGE = ((params.containsKey("d_MANHOUR_TYP_CHANGE")) ? (String[])params.get("d_MANHOUR_TYP_CHANGE") : (String[])null);
		String[] d_OLD_LOT_SIZING_TYP = ((params.containsKey("d_OLD_LOT_SIZING_TYP")) ? (String[])params.get("d_OLD_LOT_SIZING_TYP") : (String[])null);
		String[] d_NEW_LOT_SIZING_TYP = ((params.containsKey("d_NEW_LOT_SIZING_TYP")) ? (String[])params.get("d_NEW_LOT_SIZING_TYP") : (String[])null);
		String[] d_LOT_SIZING_TYP_CHANGE = ((params.containsKey("d_LOT_SIZING_TYP_CHANGE")) ? (String[])params.get("d_LOT_SIZING_TYP_CHANGE") : (String[])null);
		String[] d_OLD_MPS_FLG = ((params.containsKey("d_OLD_MPS_FLG")) ? (String[])params.get("d_OLD_MPS_FLG") : (String[])null);
		String[] d_NEW_MPS_FLG = ((params.containsKey("d_NEW_MPS_FLG")) ? (String[])params.get("d_NEW_MPS_FLG") : (String[])null);
		String[] d_MPS_FLG_CHANGE = ((params.containsKey("d_MPS_FLG_CHANGE")) ? (String[])params.get("d_MPS_FLG_CHANGE") : (String[])null);
		String[] d_OLD_MAX_PERIOD = ((params.containsKey("d_OLD_MAX_PERIOD")) ? (String[])params.get("d_OLD_MAX_PERIOD") : (String[])null);
		String[] d_NEW_MAX_PERIOD = ((params.containsKey("d_NEW_MAX_PERIOD")) ? (String[])params.get("d_NEW_MAX_PERIOD") : (String[])null);
		String[] d_MAX_PERIOD_CHANGE = ((params.containsKey("d_MAX_PERIOD_CHANGE")) ? (String[])params.get("d_MAX_PERIOD_CHANGE") : (String[])null);
		String[] d_OLD_FIXED_ODR_QTY = ((params.containsKey("d_OLD_FIXED_ODR_QTY")) ? (String[])params.get("d_OLD_FIXED_ODR_QTY") : (String[])null);
		String[] d_NEW_FIXED_ODR_QTY = ((params.containsKey("d_NEW_FIXED_ODR_QTY")) ? (String[])params.get("d_NEW_FIXED_ODR_QTY") : (String[])null);
		String[] d_FIXED_ODR_QTY_CHANGE = ((params.containsKey("d_FIXED_ODR_QTY_CHANGE")) ? (String[])params.get("d_FIXED_ODR_QTY_CHANGE") : (String[])null);
		String[] d_OLD_MAX_ODR_QTY = ((params.containsKey("d_OLD_MAX_ODR_QTY")) ? (String[])params.get("d_OLD_MAX_ODR_QTY") : (String[])null);
		String[] d_NEW_MAX_ODR_QTY = ((params.containsKey("d_NEW_MAX_ODR_QTY")) ? (String[])params.get("d_NEW_MAX_ODR_QTY") : (String[])null);
		String[] d_MAX_ODR_QTY_CHANGE = ((params.containsKey("d_MAX_ODR_QTY_CHANGE")) ? (String[])params.get("d_MAX_ODR_QTY_CHANGE") : (String[])null);
		String[] d_OLD_MIN_ODR_QTY = ((params.containsKey("d_OLD_MIN_ODR_QTY")) ? (String[])params.get("d_OLD_MIN_ODR_QTY") : (String[])null);
		String[] d_NEW_MIN_ODR_QTY = ((params.containsKey("d_NEW_MIN_ODR_QTY")) ? (String[])params.get("d_NEW_MIN_ODR_QTY") : (String[])null);
		String[] d_MIN_ODR_QTY_CHANGE = ((params.containsKey("d_MIN_ODR_QTY_CHANGE")) ? (String[])params.get("d_MIN_ODR_QTY_CHANGE") : (String[])null);
		String[] d_OLD_ODR_POINT = ((params.containsKey("d_OLD_ODR_POINT")) ? (String[])params.get("d_OLD_ODR_POINT") : (String[])null);
		String[] d_NEW_ODR_POINT = ((params.containsKey("d_NEW_ODR_POINT")) ? (String[])params.get("d_NEW_ODR_POINT") : (String[])null);
		String[] d_ODR_POINT_CHANGE = ((params.containsKey("d_ODR_POINT_CHANGE")) ? (String[])params.get("d_ODR_POINT_CHANGE") : (String[])null);
		String[] d_OLD_MUL_ODR_QTY = ((params.containsKey("d_OLD_MUL_ODR_QTY")) ? (String[])params.get("d_OLD_MUL_ODR_QTY") : (String[])null);
		String[] d_NEW_MUL_ODR_QTY = ((params.containsKey("d_NEW_MUL_ODR_QTY")) ? (String[])params.get("d_NEW_MUL_ODR_QTY") : (String[])null);
		String[] d_MUL_ODR_QTY_CHANGE = ((params.containsKey("d_MUL_ODR_QTY_CHANGE")) ? (String[])params.get("d_MUL_ODR_QTY_CHANGE") : (String[])null);
		String[] d_OLD_CLASIFICATION_CD = ((params.containsKey("d_OLD_CLASIFICATION_CD")) ? (String[])params.get("d_OLD_CLASIFICATION_CD") : (String[])null);
		String[] d_NEW_CLASIFICATION_CD = ((params.containsKey("d_NEW_CLASIFICATION_CD")) ? (String[])params.get("d_NEW_CLASIFICATION_CD") : (String[])null);
		String[] d_CLASIFICATION_CD_CHANGE = ((params.containsKey("d_CLASIFICATION_CD_CHANGE")) ? (String[])params.get("d_CLASIFICATION_CD_CHANGE") : (String[])null);
		String[] d_OLD_UNIT_WEIGHT = ((params.containsKey("d_OLD_UNIT_WEIGHT")) ? (String[])params.get("d_OLD_UNIT_WEIGHT") : (String[])null);
		String[] d_NEW_UNIT_WEIGHT = ((params.containsKey("d_NEW_UNIT_WEIGHT")) ? (String[])params.get("d_NEW_UNIT_WEIGHT") : (String[])null);
		String[] d_UNIT_WEIGHT_CHANGE = ((params.containsKey("d_UNIT_WEIGHT_CHANGE")) ? (String[])params.get("d_UNIT_WEIGHT_CHANGE") : (String[])null);
		String[] d_OLD_TAX_CD_1 = ((params.containsKey("d_OLD_TAX_CD_1")) ? (String[])params.get("d_OLD_TAX_CD_1") : (String[])null);
		String[] d_NEW_TAX_CD_1 = ((params.containsKey("d_NEW_TAX_CD_1")) ? (String[])params.get("d_NEW_TAX_CD_1") : (String[])null);
		String[] d_TAX_CD_1_CHANGE = ((params.containsKey("d_TAX_CD_1_CHANGE")) ? (String[])params.get("d_TAX_CD_1_CHANGE") : (String[])null);
		String[] d_OLD_DEPO_TYP = ((params.containsKey("d_OLD_DEPO_TYP")) ? (String[])params.get("d_OLD_DEPO_TYP") : (String[])null);
		String[] d_NEW_DEPO_TYP = ((params.containsKey("d_NEW_DEPO_TYP")) ? (String[])params.get("d_NEW_DEPO_TYP") : (String[])null);
		String[] d_DEPO_TYP_CHANGE = ((params.containsKey("d_DEPO_TYP_CHANGE")) ? (String[])params.get("d_DEPO_TYP_CHANGE") : (String[])null);
		String[] d_OLD_BEST_BEFORE_YEAR = ((params.containsKey("d_OLD_BEST_BEFORE_YEAR")) ? (String[])params.get("d_OLD_BEST_BEFORE_YEAR") : (String[])null);
		String[] d_NEW_BEST_BEFORE_YEAR = ((params.containsKey("d_NEW_BEST_BEFORE_YEAR")) ? (String[])params.get("d_NEW_BEST_BEFORE_YEAR") : (String[])null);
		String[] d_BEST_BEFORE_YEAR_CHANGE = ((params.containsKey("d_BEST_BEFORE_YEAR_CHANGE")) ? (String[])params.get("d_BEST_BEFORE_YEAR_CHANGE") : (String[])null);
		String[] d_OLD_LOT_CTRL_FLG = ((params.containsKey("d_OLD_LOT_CTRL_FLG")) ? (String[])params.get("d_OLD_LOT_CTRL_FLG") : (String[])null);
		String[] d_NEW_LOT_CTRL_FLG = ((params.containsKey("d_NEW_LOT_CTRL_FLG")) ? (String[])params.get("d_NEW_LOT_CTRL_FLG") : (String[])null);
		String[] d_LOT_CTRL_FLG_CHANGE = ((params.containsKey("d_LOT_CTRL_FLG_CHANGE")) ? (String[])params.get("d_LOT_CTRL_FLG_CHANGE") : (String[])null);
		String[] d_OLD_BEST_BEFORE_MONTH = ((params.containsKey("d_OLD_BEST_BEFORE_MONTH")) ? (String[])params.get("d_OLD_BEST_BEFORE_MONTH") : (String[])null);
		String[] d_NEW_BEST_BEFORE_MONTH = ((params.containsKey("d_NEW_BEST_BEFORE_MONTH")) ? (String[])params.get("d_NEW_BEST_BEFORE_MONTH") : (String[])null);
		String[] d_BEST_BEFORE_MONTH_CHANGE = ((params.containsKey("d_BEST_BEFORE_MONTH_CHANGE")) ? (String[])params.get("d_BEST_BEFORE_MONTH_CHANGE") : (String[])null);
		String[] d_OLD_LOT_NUMBERING_TYP = ((params.containsKey("d_OLD_LOT_NUMBERING_TYP")) ? (String[])params.get("d_OLD_LOT_NUMBERING_TYP") : (String[])null);
		String[] d_NEW_LOT_NUMBERING_TYP = ((params.containsKey("d_NEW_LOT_NUMBERING_TYP")) ? (String[])params.get("d_NEW_LOT_NUMBERING_TYP") : (String[])null);
		String[] d_LOT_NUMBERING_TYP_CHANGE = ((params.containsKey("d_LOT_NUMBERING_TYP_CHANGE")) ? (String[])params.get("d_LOT_NUMBERING_TYP_CHANGE") : (String[])null);
		String[] d_OLD_BEST_BEFORE_DAY = ((params.containsKey("d_OLD_BEST_BEFORE_DAY")) ? (String[])params.get("d_OLD_BEST_BEFORE_DAY") : (String[])null);
		String[] d_NEW_BEST_BEFORE_DAY = ((params.containsKey("d_NEW_BEST_BEFORE_DAY")) ? (String[])params.get("d_NEW_BEST_BEFORE_DAY") : (String[])null);
		String[] d_BEST_BEFORE_DAY_CHANGE = ((params.containsKey("d_BEST_BEFORE_DAY_CHANGE")) ? (String[])params.get("d_BEST_BEFORE_DAY_CHANGE") : (String[])null);
		String[] d_OLD_STOCK_STATUS = ((params.containsKey("d_OLD_STOCK_STATUS")) ? (String[])params.get("d_OLD_STOCK_STATUS") : (String[])null);
		String[] d_NEW_STOCK_STATUS = ((params.containsKey("d_NEW_STOCK_STATUS")) ? (String[])params.get("d_NEW_STOCK_STATUS") : (String[])null);
		String[] d_STOCK_STATUS_CHANGE = ((params.containsKey("d_STOCK_STATUS_CHANGE")) ? (String[])params.get("d_STOCK_STATUS_CHANGE") : (String[])null);
		String[] d_OLD_STOCK_STATUS_NAME = ((params.containsKey("d_OLD_STOCK_STATUS_NAME")) ? (String[])params.get("d_OLD_STOCK_STATUS_NAME") : (String[])null);
		String[] d_NEW_STOCK_STATUS_NAME = ((params.containsKey("d_NEW_STOCK_STATUS_NAME")) ? (String[])params.get("d_NEW_STOCK_STATUS_NAME") : (String[])null);
		String[] d_STOCK_STATUS_NAME_CHANGE = ((params.containsKey("d_STOCK_STATUS_NAME_CHANGE")) ? (String[])params.get("d_STOCK_STATUS_NAME_CHANGE") : (String[])null);
		String[] d_OLD_STOCK_TYP = ((params.containsKey("d_OLD_STOCK_TYP")) ? (String[])params.get("d_OLD_STOCK_TYP") : (String[])null);
		String[] d_NEW_STOCK_TYP = ((params.containsKey("d_NEW_STOCK_TYP")) ? (String[])params.get("d_NEW_STOCK_TYP") : (String[])null);
		String[] d_STOCK_TYP_CHANGE = ((params.containsKey("d_STOCK_TYP_CHANGE")) ? (String[])params.get("d_STOCK_TYP_CHANGE") : (String[])null);
		String[] d_OLD_EFF_STOCK_TYP = ((params.containsKey("d_OLD_EFF_STOCK_TYP")) ? (String[])params.get("d_OLD_EFF_STOCK_TYP") : (String[])null);
		String[] d_NEW_EFF_STOCK_TYP = ((params.containsKey("d_NEW_EFF_STOCK_TYP")) ? (String[])params.get("d_NEW_EFF_STOCK_TYP") : (String[])null);
		String[] d_EFF_STOCK_TYP_CHANGE = ((params.containsKey("d_EFF_STOCK_TYP_CHANGE")) ? (String[])params.get("d_EFF_STOCK_TYP_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_TYP = ((params.containsKey("d_OLD_SHIP_TYP")) ? (String[])params.get("d_OLD_SHIP_TYP") : (String[])null);
		String[] d_NEW_SHIP_TYP = ((params.containsKey("d_NEW_SHIP_TYP")) ? (String[])params.get("d_NEW_SHIP_TYP") : (String[])null);
		String[] d_SHIP_TYP_CHANGE = ((params.containsKey("d_SHIP_TYP_CHANGE")) ? (String[])params.get("d_SHIP_TYP_CHANGE") : (String[])null);
		String[] d_OLD_REF_NO = ((params.containsKey("d_OLD_REF_NO")) ? (String[])params.get("d_OLD_REF_NO") : (String[])null);
		String[] d_NEW_REF_NO = ((params.containsKey("d_NEW_REF_NO")) ? (String[])params.get("d_NEW_REF_NO") : (String[])null);
		String[] d_REF_NO_CHANGE = ((params.containsKey("d_REF_NO_CHANGE")) ? (String[])params.get("d_REF_NO_CHANGE") : (String[])null);
		String[] d_OLD_DELIVERY_CD = ((params.containsKey("d_OLD_DELIVERY_CD")) ? (String[])params.get("d_OLD_DELIVERY_CD") : (String[])null);
		String[] d_NEW_DELIVERY_CD = ((params.containsKey("d_NEW_DELIVERY_CD")) ? (String[])params.get("d_NEW_DELIVERY_CD") : (String[])null);
		String[] d_DELIVERY_CD_CHANGE = ((params.containsKey("d_DELIVERY_CD_CHANGE")) ? (String[])params.get("d_DELIVERY_CD_CHANGE") : (String[])null);
		String[] d_OLD_BALA_ACCO_PATTERN_CD = ((params.containsKey("d_OLD_BALA_ACCO_PATTERN_CD")) ? (String[])params.get("d_OLD_BALA_ACCO_PATTERN_CD") : (String[])null);
		String[] d_NEW_BALA_ACCO_PATTERN_CD = ((params.containsKey("d_NEW_BALA_ACCO_PATTERN_CD")) ? (String[])params.get("d_NEW_BALA_ACCO_PATTERN_CD") : (String[])null);
		String[] d_BALA_ACCO_PATTERN_CD_CHANGE = ((params.containsKey("d_BALA_ACCO_PATTERN_CD_CHANGE")) ? (String[])params.get("d_BALA_ACCO_PATTERN_CD_CHANGE") : (String[])null);
		String[] d_OLD_CUST_PRIORITY_REF_NO = ((params.containsKey("d_OLD_CUST_PRIORITY_REF_NO")) ? (String[])params.get("d_OLD_CUST_PRIORITY_REF_NO") : (String[])null);
		String[] d_NEW_CUST_PRIORITY_REF_NO = ((params.containsKey("d_NEW_CUST_PRIORITY_REF_NO")) ? (String[])params.get("d_NEW_CUST_PRIORITY_REF_NO") : (String[])null);
		String[] d_CUST_PRIORITY_REF_NO_CHANGE = ((params.containsKey("d_CUST_PRIORITY_REF_NO_CHANGE")) ? (String[])params.get("d_CUST_PRIORITY_REF_NO_CHANGE") : (String[])null);
		String[] d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO = ((params.containsKey("d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO")) ? (String[])params.get("d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO") : (String[])null);
		String[] d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO = ((params.containsKey("d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO")) ? (String[])params.get("d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO") : (String[])null);
		String[] d_OLD_BALA_ACCO_CD_1 = ((params.containsKey("d_OLD_BALA_ACCO_CD_1")) ? (String[])params.get("d_OLD_BALA_ACCO_CD_1") : (String[])null);
		String[] d_NEW_BALA_ACCO_CD_1 = ((params.containsKey("d_NEW_BALA_ACCO_CD_1")) ? (String[])params.get("d_NEW_BALA_ACCO_CD_1") : (String[])null);
		String[] d_BALA_ACCO_CD_1_CHANGE = ((params.containsKey("d_BALA_ACCO_CD_1_CHANGE")) ? (String[])params.get("d_BALA_ACCO_CD_1_CHANGE") : (String[])null);
		String[] d_OLD_BALA_ACCO_CD_2 = ((params.containsKey("d_OLD_BALA_ACCO_CD_2")) ? (String[])params.get("d_OLD_BALA_ACCO_CD_2") : (String[])null);
		String[] d_NEW_BALA_ACCO_CD_2 = ((params.containsKey("d_NEW_BALA_ACCO_CD_2")) ? (String[])params.get("d_NEW_BALA_ACCO_CD_2") : (String[])null);
		String[] d_BALA_ACCO_CD_2_CHANGE = ((params.containsKey("d_BALA_ACCO_CD_2_CHANGE")) ? (String[])params.get("d_BALA_ACCO_CD_2_CHANGE") : (String[])null);
		String[] d_OLD_BALA_ACCO_CD_3 = ((params.containsKey("d_OLD_BALA_ACCO_CD_3")) ? (String[])params.get("d_OLD_BALA_ACCO_CD_3") : (String[])null);
		String[] d_NEW_BALA_ACCO_CD_3 = ((params.containsKey("d_NEW_BALA_ACCO_CD_3")) ? (String[])params.get("d_NEW_BALA_ACCO_CD_3") : (String[])null);
		String[] d_BALA_ACCO_CD_3_CHANGE = ((params.containsKey("d_BALA_ACCO_CD_3_CHANGE")) ? (String[])params.get("d_BALA_ACCO_CD_3_CHANGE") : (String[])null);
		String[] d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE = ((params.containsKey("d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE")) ? (String[])params.get("d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE") : (String[])null);
		String[] d_OLD_BILL_ADDRESSEE_FLG = ((params.containsKey("d_OLD_BILL_ADDRESSEE_FLG")) ? (String[])params.get("d_OLD_BILL_ADDRESSEE_FLG") : (String[])null);
		String[] d_NEW_BILL_ADDRESSEE_FLG = ((params.containsKey("d_NEW_BILL_ADDRESSEE_FLG")) ? (String[])params.get("d_NEW_BILL_ADDRESSEE_FLG") : (String[])null);
		String[] d_BILL_ADDRESSEE_FLG_CHANGE = ((params.containsKey("d_BILL_ADDRESSEE_FLG_CHANGE")) ? (String[])params.get("d_BILL_ADDRESSEE_FLG_CHANGE") : (String[])null);
		String[] d_OLD_RM_FLG = ((params.containsKey("d_OLD_RM_FLG")) ? (String[])params.get("d_OLD_RM_FLG") : (String[])null);
		String[] d_NEW_RM_FLG = ((params.containsKey("d_NEW_RM_FLG")) ? (String[])params.get("d_NEW_RM_FLG") : (String[])null);
		String[] d_RM_FLG_CHANGE = ((params.containsKey("d_RM_FLG_CHANGE")) ? (String[])params.get("d_RM_FLG_CHANGE") : (String[])null);
		String[] d_OLD_CLAIM_CYCLE_TYP = ((params.containsKey("d_OLD_CLAIM_CYCLE_TYP")) ? (String[])params.get("d_OLD_CLAIM_CYCLE_TYP") : (String[])null);
		String[] d_NEW_CLAIM_CYCLE_TYP = ((params.containsKey("d_NEW_CLAIM_CYCLE_TYP")) ? (String[])params.get("d_NEW_CLAIM_CYCLE_TYP") : (String[])null);
		String[] d_CLAIM_CYCLE_TYP_CHANGE = ((params.containsKey("d_CLAIM_CYCLE_TYP_CHANGE")) ? (String[])params.get("d_CLAIM_CYCLE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_TEMP_UNIT_PRICE_SALES_FLG = ((params.containsKey("d_OLD_TEMP_UNIT_PRICE_SALES_FLG")) ? (String[])params.get("d_OLD_TEMP_UNIT_PRICE_SALES_FLG") : (String[])null);
		String[] d_NEW_TEMP_UNIT_PRICE_SALES_FLG = ((params.containsKey("d_NEW_TEMP_UNIT_PRICE_SALES_FLG")) ? (String[])params.get("d_NEW_TEMP_UNIT_PRICE_SALES_FLG") : (String[])null);
		String[] d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE = ((params.containsKey("d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE")) ? (String[])params.get("d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE") : (String[])null);
		String[] d_OLD_RM_INP_TYP = ((params.containsKey("d_OLD_RM_INP_TYP")) ? (String[])params.get("d_OLD_RM_INP_TYP") : (String[])null);
		String[] d_NEW_RM_INP_TYP = ((params.containsKey("d_NEW_RM_INP_TYP")) ? (String[])params.get("d_NEW_RM_INP_TYP") : (String[])null);
		String[] d_RM_INP_TYP_CHANGE = ((params.containsKey("d_RM_INP_TYP_CHANGE")) ? (String[])params.get("d_RM_INP_TYP_CHANGE") : (String[])null);
		String[] d_OLD_TRN_STOP_FLG = ((params.containsKey("d_OLD_TRN_STOP_FLG")) ? (String[])params.get("d_OLD_TRN_STOP_FLG") : (String[])null);
		String[] d_NEW_TRN_STOP_FLG = ((params.containsKey("d_NEW_TRN_STOP_FLG")) ? (String[])params.get("d_NEW_TRN_STOP_FLG") : (String[])null);
		String[] d_TRN_STOP_FLG_CHANGE = ((params.containsKey("d_TRN_STOP_FLG_CHANGE")) ? (String[])params.get("d_TRN_STOP_FLG_CHANGE") : (String[])null);
		String[] d_OLD_SET_LT = ((params.containsKey("d_OLD_SET_LT")) ? (String[])params.get("d_OLD_SET_LT") : (String[])null);
		String[] d_NEW_SET_LT = ((params.containsKey("d_NEW_SET_LT")) ? (String[])params.get("d_NEW_SET_LT") : (String[])null);
		String[] d_SET_LT_CHANGE = ((params.containsKey("d_SET_LT_CHANGE")) ? (String[])params.get("d_SET_LT_CHANGE") : (String[])null);
		String[] d_OLD_JANCODE = ((params.containsKey("d_OLD_JANCODE")) ? (String[])params.get("d_OLD_JANCODE") : (String[])null);
		String[] d_NEW_JANCODE = ((params.containsKey("d_NEW_JANCODE")) ? (String[])params.get("d_NEW_JANCODE") : (String[])null);
		String[] d_JANCODE_CHANGE = ((params.containsKey("d_JANCODE_CHANGE")) ? (String[])params.get("d_JANCODE_CHANGE") : (String[])null);
		String[] d_OLD_MAX_STOCK_QTY = ((params.containsKey("d_OLD_MAX_STOCK_QTY")) ? (String[])params.get("d_OLD_MAX_STOCK_QTY") : (String[])null);
		String[] d_NEW_MAX_STOCK_QTY = ((params.containsKey("d_NEW_MAX_STOCK_QTY")) ? (String[])params.get("d_NEW_MAX_STOCK_QTY") : (String[])null);
		String[] d_MAX_STOCK_QTY_CHANGE = ((params.containsKey("d_MAX_STOCK_QTY_CHANGE")) ? (String[])params.get("d_MAX_STOCK_QTY_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_DEADLINE_YEAR = ((params.containsKey("d_OLD_SHIP_DEADLINE_YEAR")) ? (String[])params.get("d_OLD_SHIP_DEADLINE_YEAR") : (String[])null);
		String[] d_NEW_SHIP_DEADLINE_YEAR = ((params.containsKey("d_NEW_SHIP_DEADLINE_YEAR")) ? (String[])params.get("d_NEW_SHIP_DEADLINE_YEAR") : (String[])null);
		String[] d_SHIP_DEADLINE_YEAR_CHANGE = ((params.containsKey("d_SHIP_DEADLINE_YEAR_CHANGE")) ? (String[])params.get("d_SHIP_DEADLINE_YEAR_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_DEADLINE_MONTH = ((params.containsKey("d_OLD_SHIP_DEADLINE_MONTH")) ? (String[])params.get("d_OLD_SHIP_DEADLINE_MONTH") : (String[])null);
		String[] d_NEW_SHIP_DEADLINE_MONTH = ((params.containsKey("d_NEW_SHIP_DEADLINE_MONTH")) ? (String[])params.get("d_NEW_SHIP_DEADLINE_MONTH") : (String[])null);
		String[] d_SHIP_DEADLINE_MONTH_CHANGE = ((params.containsKey("d_SHIP_DEADLINE_MONTH_CHANGE")) ? (String[])params.get("d_SHIP_DEADLINE_MONTH_CHANGE") : (String[])null);
		String[] d_OLD_SHIP_DEADLINE_DAY = ((params.containsKey("d_OLD_SHIP_DEADLINE_DAY")) ? (String[])params.get("d_OLD_SHIP_DEADLINE_DAY") : (String[])null);
		String[] d_NEW_SHIP_DEADLINE_DAY = ((params.containsKey("d_NEW_SHIP_DEADLINE_DAY")) ? (String[])params.get("d_NEW_SHIP_DEADLINE_DAY") : (String[])null);
		String[] d_SHIP_DEADLINE_DAY_CHANGE = ((params.containsKey("d_SHIP_DEADLINE_DAY_CHANGE")) ? (String[])params.get("d_SHIP_DEADLINE_DAY_CHANGE") : (String[])null);
		String[] d_OLD_CUST_DLV_LOC_CD = ((params.containsKey("d_OLD_CUST_DLV_LOC_CD")) ? (String[])params.get("d_OLD_CUST_DLV_LOC_CD") : (String[])null);
		String[] d_NEW_CUST_DLV_LOC_CD = ((params.containsKey("d_NEW_CUST_DLV_LOC_CD")) ? (String[])params.get("d_NEW_CUST_DLV_LOC_CD") : (String[])null);
		String[] d_CUST_DLV_LOC_CD_CHANGE = ((params.containsKey("d_CUST_DLV_LOC_CD_CHANGE")) ? (String[])params.get("d_CUST_DLV_LOC_CD_CHANGE") : (String[])null);
		String[] d_OLD_CUST_FLG = ((params.containsKey("d_OLD_CUST_FLG")) ? (String[])params.get("d_OLD_CUST_FLG") : (String[])null);
		String[] d_NEW_CUST_FLG = ((params.containsKey("d_NEW_CUST_FLG")) ? (String[])params.get("d_NEW_CUST_FLG") : (String[])null);
		String[] d_CUST_FLG_CHANGE = ((params.containsKey("d_CUST_FLG_CHANGE")) ? (String[])params.get("d_CUST_FLG_CHANGE") : (String[])null);
		String[] d_OLD_DELIVERY_FLG = ((params.containsKey("d_OLD_DELIVERY_FLG")) ? (String[])params.get("d_OLD_DELIVERY_FLG") : (String[])null);
		String[] d_NEW_DELIVERY_FLG = ((params.containsKey("d_NEW_DELIVERY_FLG")) ? (String[])params.get("d_NEW_DELIVERY_FLG") : (String[])null);
		String[] d_DELIVERY_FLG_CHANGE = ((params.containsKey("d_DELIVERY_FLG_CHANGE")) ? (String[])params.get("d_DELIVERY_FLG_CHANGE") : (String[])null);
		String[] d_OLD_BALA_ACCO_FLG = ((params.containsKey("d_OLD_BALA_ACCO_FLG")) ? (String[])params.get("d_OLD_BALA_ACCO_FLG") : (String[])null);
		String[] d_NEW_BALA_ACCO_FLG = ((params.containsKey("d_NEW_BALA_ACCO_FLG")) ? (String[])params.get("d_NEW_BALA_ACCO_FLG") : (String[])null);
		String[] d_BALA_ACCO_FLG_CHANGE = ((params.containsKey("d_BALA_ACCO_FLG_CHANGE")) ? (String[])params.get("d_BALA_ACCO_FLG_CHANGE") : (String[])null);
		String[] d_OLD_UNIT_COST_USE_TYP = ((params.containsKey("d_OLD_UNIT_COST_USE_TYP")) ? (String[])params.get("d_OLD_UNIT_COST_USE_TYP") : (String[])null);
		String[] d_NEW_UNIT_COST_USE_TYP = ((params.containsKey("d_NEW_UNIT_COST_USE_TYP")) ? (String[])params.get("d_NEW_UNIT_COST_USE_TYP") : (String[])null);
		String[] d_UNIT_COST_USE_TYP_CHANGE = ((params.containsKey("d_UNIT_COST_USE_TYP_CHANGE")) ? (String[])params.get("d_UNIT_COST_USE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_PAY_TARGET_NAME_1 = ((params.containsKey("d_OLD_PAY_TARGET_NAME_1")) ? (String[])params.get("d_OLD_PAY_TARGET_NAME_1") : (String[])null);
		String[] d_NEW_PAY_TARGET_NAME_1 = ((params.containsKey("d_NEW_PAY_TARGET_NAME_1")) ? (String[])params.get("d_NEW_PAY_TARGET_NAME_1") : (String[])null);
		String[] d_PAY_TARGET_NAME_1_CHANGE = ((params.containsKey("d_PAY_TARGET_NAME_1_CHANGE")) ? (String[])params.get("d_PAY_TARGET_NAME_1_CHANGE") : (String[])null);
		String[] d_OLD_PAY_METHOD_1 = ((params.containsKey("d_OLD_PAY_METHOD_1")) ? (String[])params.get("d_OLD_PAY_METHOD_1") : (String[])null);
		String[] d_NEW_PAY_METHOD_1 = ((params.containsKey("d_NEW_PAY_METHOD_1")) ? (String[])params.get("d_NEW_PAY_METHOD_1") : (String[])null);
		String[] d_PAY_METHOD_1_CHANGE = ((params.containsKey("d_PAY_METHOD_1_CHANGE")) ? (String[])params.get("d_PAY_METHOD_1_CHANGE") : (String[])null);
		String[] d_OLD_PAY_TARGET_NAME_2 = ((params.containsKey("d_OLD_PAY_TARGET_NAME_2")) ? (String[])params.get("d_OLD_PAY_TARGET_NAME_2") : (String[])null);
		String[] d_NEW_PAY_TARGET_NAME_2 = ((params.containsKey("d_NEW_PAY_TARGET_NAME_2")) ? (String[])params.get("d_NEW_PAY_TARGET_NAME_2") : (String[])null);
		String[] d_PAY_TARGET_NAME_2_CHANGE = ((params.containsKey("d_PAY_TARGET_NAME_2_CHANGE")) ? (String[])params.get("d_PAY_TARGET_NAME_2_CHANGE") : (String[])null);
		String[] d_OLD_BUSINESS_WH_FLG = ((params.containsKey("d_OLD_BUSINESS_WH_FLG")) ? (String[])params.get("d_OLD_BUSINESS_WH_FLG") : (String[])null);
		String[] d_NEW_BUSINESS_WH_FLG = ((params.containsKey("d_NEW_BUSINESS_WH_FLG")) ? (String[])params.get("d_NEW_BUSINESS_WH_FLG") : (String[])null);
		String[] d_BUSINESS_WH_FLG_CHANGE = ((params.containsKey("d_BUSINESS_WH_FLG_CHANGE")) ? (String[])params.get("d_BUSINESS_WH_FLG_CHANGE") : (String[])null);
		String[] d_OLD_REPRESENT_FLG = ((params.containsKey("d_OLD_REPRESENT_FLG")) ? (String[])params.get("d_OLD_REPRESENT_FLG") : (String[])null);
		String[] d_NEW_REPRESENT_FLG = ((params.containsKey("d_NEW_REPRESENT_FLG")) ? (String[])params.get("d_NEW_REPRESENT_FLG") : (String[])null);
		String[] d_REPRESENT_FLG_CHANGE = ((params.containsKey("d_REPRESENT_FLG_CHANGE")) ? (String[])params.get("d_REPRESENT_FLG_CHANGE") : (String[])null);
		String[] d_OLD_SPCL_PRICE_TYP = ((params.containsKey("d_OLD_SPCL_PRICE_TYP")) ? (String[])params.get("d_OLD_SPCL_PRICE_TYP") : (String[])null);
		String[] d_NEW_SPCL_PRICE_TYP = ((params.containsKey("d_NEW_SPCL_PRICE_TYP")) ? (String[])params.get("d_NEW_SPCL_PRICE_TYP") : (String[])null);
		String[] d_SPCL_PRICE_TYP_CHANGE = ((params.containsKey("d_SPCL_PRICE_TYP_CHANGE")) ? (String[])params.get("d_SPCL_PRICE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_UNIT_CD = ((params.containsKey("d_OLD_UNIT_CD")) ? (String[])params.get("d_OLD_UNIT_CD") : (String[])null);
		String[] d_NEW_UNIT_CD = ((params.containsKey("d_NEW_UNIT_CD")) ? (String[])params.get("d_NEW_UNIT_CD") : (String[])null);
		String[] d_UNIT_CD_CHANGE = ((params.containsKey("d_UNIT_CD_CHANGE")) ? (String[])params.get("d_UNIT_CD_CHANGE") : (String[])null);
		String[] d_OLD_EFF_PHASE_OUT_DATE = ((params.containsKey("d_OLD_EFF_PHASE_OUT_DATE")) ? (String[])params.get("d_OLD_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] d_NEW_EFF_PHASE_OUT_DATE = ((params.containsKey("d_NEW_EFF_PHASE_OUT_DATE")) ? (String[])params.get("d_NEW_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] d_EFF_PHASE_OUT_DATE_CHANGE = ((params.containsKey("d_EFF_PHASE_OUT_DATE_CHANGE")) ? (String[])params.get("d_EFF_PHASE_OUT_DATE_CHANGE") : (String[])null);
		String[] d_OLD_SALE_SIZE = ((params.containsKey("d_OLD_SALE_SIZE")) ? (String[])params.get("d_OLD_SALE_SIZE") : (String[])null);
		String[] d_NEW_SALE_SIZE = ((params.containsKey("d_NEW_SALE_SIZE")) ? (String[])params.get("d_NEW_SALE_SIZE") : (String[])null);
		String[] d_SALE_SIZE_CHANGE = ((params.containsKey("d_SALE_SIZE_CHANGE")) ? (String[])params.get("d_SALE_SIZE_CHANGE") : (String[])null);

		struct.setr1_FILTER1( ((r1_FILTER1 == null) ? (String)null : r1_FILTER1[0]) );
		struct.setList_r1_FILTER1(TypeConverter.convert(r1_FILTER1));
		struct.setr2_FILTER1( ((r2_FILTER1 == null) ? (String)null : r2_FILTER1[0]) );
		struct.setList_r2_FILTER1(TypeConverter.convert(r2_FILTER1));
		struct.setr3_FILTER1( ((r3_FILTER1 == null) ? (String)null : r3_FILTER1[0]) );
		struct.setList_r3_FILTER1(TypeConverter.convert(r3_FILTER1));
		struct.setRESERVE_CAUSE( ((RESERVE_CAUSE == null) ? (String)null : RESERVE_CAUSE[0]) );
		struct.setList_RESERVE_CAUSE(TypeConverter.convert(RESERVE_CAUSE));
		struct.seth_SELECT_TYP( ((h_SELECT_TYP == null) ? (String)null : h_SELECT_TYP[0]) );
		struct.setList_h_SELECT_TYP(TypeConverter.convert(h_SELECT_TYP));
		struct.setl_SCREEN_NAME( ((l_SCREEN_NAME == null) ? (String)null : l_SCREEN_NAME[0]) );
		struct.setList_l_SCREEN_NAME(TypeConverter.convert(l_SCREEN_NAME));
		struct.setl_REQUEST_COUNT( ((l_REQUEST_COUNT == null) ? (String)null : l_REQUEST_COUNT[0]) );
		struct.setList_l_REQUEST_COUNT(TypeConverter.convert(l_REQUEST_COUNT));
		struct.setl_APPRING_COUNT( ((l_APPRING_COUNT == null) ? (String)null : l_APPRING_COUNT[0]) );
		struct.setList_l_APPRING_COUNT(TypeConverter.convert(l_APPRING_COUNT));
		struct.setl_RESERVE_COUNT( ((l_RESERVE_COUNT == null) ? (String)null : l_RESERVE_COUNT[0]) );
		struct.setList_l_RESERVE_COUNT(TypeConverter.convert(l_RESERVE_COUNT));
		struct.seth_APPR_ID( ((h_APPR_ID == null) ? (String)null : h_APPR_ID[0]) );
		struct.setList_h_APPR_ID(TypeConverter.convert(h_APPR_ID));
		struct.setl_APPR_REMARKS( ((l_APPR_REMARKS == null) ? (String)null : l_APPR_REMARKS[0]) );
		struct.setList_l_APPR_REMARKS(TypeConverter.convert(l_APPR_REMARKS));
		struct.setl_REQUEST_BY( ((l_REQUEST_BY == null) ? (String)null : l_REQUEST_BY[0]) );
		struct.setList_l_REQUEST_BY(TypeConverter.convert(l_REQUEST_BY));
		struct.setl_REQUEST_DATE( ((l_REQUEST_DATE == null) ? (String)null : l_REQUEST_DATE[0]) );
		struct.setList_l_REQUEST_DATE(TypeConverter.convert(l_REQUEST_DATE));
		struct.setl_ITEM_COL1( ((l_ITEM_COL1 == null) ? (String)null : l_ITEM_COL1[0]) );
		struct.setList_l_ITEM_COL1(TypeConverter.convert(l_ITEM_COL1));
		struct.setl_ITEM_COL2( ((l_ITEM_COL2 == null) ? (String)null : l_ITEM_COL2[0]) );
		struct.setList_l_ITEM_COL2(TypeConverter.convert(l_ITEM_COL2));
		struct.setl_ITEM_COL3( ((l_ITEM_COL3 == null) ? (String)null : l_ITEM_COL3[0]) );
		struct.setList_l_ITEM_COL3(TypeConverter.convert(l_ITEM_COL3));
		struct.setl_ITEM_COL4( ((l_ITEM_COL4 == null) ? (String)null : l_ITEM_COL4[0]) );
		struct.setList_l_ITEM_COL4(TypeConverter.convert(l_ITEM_COL4));
		struct.setl_ITEM_COL5( ((l_ITEM_COL5 == null) ? (String)null : l_ITEM_COL5[0]) );
		struct.setList_l_ITEM_COL5(TypeConverter.convert(l_ITEM_COL5));
		struct.setl_PROC_TYP_VALUE( ((l_PROC_TYP_VALUE == null) ? (String)null : l_PROC_TYP_VALUE[0]) );
		struct.setList_l_PROC_TYP_VALUE(TypeConverter.convert(l_PROC_TYP_VALUE));
		struct.seth_PROC_TYP( ((h_PROC_TYP == null) ? (String)null : h_PROC_TYP[0]) );
		struct.setList_h_PROC_TYP(TypeConverter.convert(h_PROC_TYP));
		struct.seth_STATUS( ((h_STATUS == null) ? (String)null : h_STATUS[0]) );
		struct.setList_h_STATUS(TypeConverter.convert(h_STATUS));
		struct.seth_SCREEN_URL( ((h_SCREEN_URL == null) ? (String)null : h_SCREEN_URL[0]) );
		struct.setList_h_SCREEN_URL(TypeConverter.convert(h_SCREEN_URL));
		struct.setd_OLD_USER_CD( ((d_OLD_USER_CD == null) ? (String)null : d_OLD_USER_CD[0]) );
		struct.setList_d_OLD_USER_CD(TypeConverter.convert(d_OLD_USER_CD));
		struct.setd_NEW_USER_CD( ((d_NEW_USER_CD == null) ? (String)null : d_NEW_USER_CD[0]) );
		struct.setList_d_NEW_USER_CD(TypeConverter.convert(d_NEW_USER_CD));
		struct.setd_USER_CD_CHANGE( ((d_USER_CD_CHANGE == null) ? (String)null : d_USER_CD_CHANGE[0]) );
		struct.setList_d_USER_CD_CHANGE(TypeConverter.convert(d_USER_CD_CHANGE));
		struct.setd_OLD_USER_NAME( ((d_OLD_USER_NAME == null) ? (String)null : d_OLD_USER_NAME[0]) );
		struct.setList_d_OLD_USER_NAME(TypeConverter.convert(d_OLD_USER_NAME));
		struct.setd_NEW_USER_NAME( ((d_NEW_USER_NAME == null) ? (String)null : d_NEW_USER_NAME[0]) );
		struct.setList_d_NEW_USER_NAME(TypeConverter.convert(d_NEW_USER_NAME));
		struct.setd_USER_NAME_CHANGE( ((d_USER_NAME_CHANGE == null) ? (String)null : d_USER_NAME_CHANGE[0]) );
		struct.setList_d_USER_NAME_CHANGE(TypeConverter.convert(d_USER_NAME_CHANGE));
		struct.setd_OLD_PLANT_CD( ((d_OLD_PLANT_CD == null) ? (String)null : d_OLD_PLANT_CD[0]) );
		struct.setList_d_OLD_PLANT_CD(TypeConverter.convert(d_OLD_PLANT_CD));
		struct.setd_NEW_PLANT_CD( ((d_NEW_PLANT_CD == null) ? (String)null : d_NEW_PLANT_CD[0]) );
		struct.setList_d_NEW_PLANT_CD(TypeConverter.convert(d_NEW_PLANT_CD));
		struct.setd_PLANT_CD_CHANGE( ((d_PLANT_CD_CHANGE == null) ? (String)null : d_PLANT_CD_CHANGE[0]) );
		struct.setList_d_PLANT_CD_CHANGE(TypeConverter.convert(d_PLANT_CD_CHANGE));
		struct.setd_OLD_PASSWORD( ((d_OLD_PASSWORD == null) ? (String)null : d_OLD_PASSWORD[0]) );
		struct.setList_d_OLD_PASSWORD(TypeConverter.convert(d_OLD_PASSWORD));
		struct.setd_NEW_PASSWORD( ((d_NEW_PASSWORD == null) ? (String)null : d_NEW_PASSWORD[0]) );
		struct.setList_d_NEW_PASSWORD(TypeConverter.convert(d_NEW_PASSWORD));
		struct.setd_PASSWORD_CHANGE( ((d_PASSWORD_CHANGE == null) ? (String)null : d_PASSWORD_CHANGE[0]) );
		struct.setList_d_PASSWORD_CHANGE(TypeConverter.convert(d_PASSWORD_CHANGE));
		struct.setd_OLD_APPR_POWER_TYP( ((d_OLD_APPR_POWER_TYP == null) ? (String)null : d_OLD_APPR_POWER_TYP[0]) );
		struct.setList_d_OLD_APPR_POWER_TYP(TypeConverter.convert(d_OLD_APPR_POWER_TYP));
		struct.setd_NEW_APPR_POWER_TYP( ((d_NEW_APPR_POWER_TYP == null) ? (String)null : d_NEW_APPR_POWER_TYP[0]) );
		struct.setList_d_NEW_APPR_POWER_TYP(TypeConverter.convert(d_NEW_APPR_POWER_TYP));
		struct.setd_OLD_ADDRESS( ((d_OLD_ADDRESS == null) ? (String)null : d_OLD_ADDRESS[0]) );
		struct.setList_d_OLD_ADDRESS(TypeConverter.convert(d_OLD_ADDRESS));
		struct.setd_NEW_ADDRESS( ((d_NEW_ADDRESS == null) ? (String)null : d_NEW_ADDRESS[0]) );
		struct.setList_d_NEW_ADDRESS(TypeConverter.convert(d_NEW_ADDRESS));
		struct.setd_ADDRESS_CHANGE( ((d_ADDRESS_CHANGE == null) ? (String)null : d_ADDRESS_CHANGE[0]) );
		struct.setList_d_ADDRESS_CHANGE(TypeConverter.convert(d_ADDRESS_CHANGE));
		struct.setd_OLD_LOCALE( ((d_OLD_LOCALE == null) ? (String)null : d_OLD_LOCALE[0]) );
		struct.setList_d_OLD_LOCALE(TypeConverter.convert(d_OLD_LOCALE));
		struct.setd_NEW_LOCALE( ((d_NEW_LOCALE == null) ? (String)null : d_NEW_LOCALE[0]) );
		struct.setList_d_NEW_LOCALE(TypeConverter.convert(d_NEW_LOCALE));
		struct.setd_LOCALE_CHANGE( ((d_LOCALE_CHANGE == null) ? (String)null : d_LOCALE_CHANGE[0]) );
		struct.setList_d_LOCALE_CHANGE(TypeConverter.convert(d_LOCALE_CHANGE));
		struct.setl_RESERVE_CAUSE( ((l_RESERVE_CAUSE == null) ? (String)null : l_RESERVE_CAUSE[0]) );
		struct.setList_l_RESERVE_CAUSE(TypeConverter.convert(l_RESERVE_CAUSE));
		struct.seth_REQUEST_APPR_SAME( ((h_REQUEST_APPR_SAME == null) ? (String)null : h_REQUEST_APPR_SAME[0]) );
		struct.setList_h_REQUEST_APPR_SAME(TypeConverter.convert(h_REQUEST_APPR_SAME));
		struct.seth_MODIFY_COUNT( ((h_MODIFY_COUNT == null) ? (String)null : h_MODIFY_COUNT[0]) );
		struct.setList_h_MODIFY_COUNT(TypeConverter.convert(h_MODIFY_COUNT));
		struct.seth_APPR_POWER_TYP( ((h_APPR_POWER_TYP == null) ? (String)null : h_APPR_POWER_TYP[0]) );
		struct.setList_h_APPR_POWER_TYP(TypeConverter.convert(h_APPR_POWER_TYP));
		struct.setd_OLD_ITEM_CD( ((d_OLD_ITEM_CD == null) ? (String)null : d_OLD_ITEM_CD[0]) );
		struct.setList_d_OLD_ITEM_CD(TypeConverter.convert(d_OLD_ITEM_CD));
		struct.setd_NEW_ITEM_CD( ((d_NEW_ITEM_CD == null) ? (String)null : d_NEW_ITEM_CD[0]) );
		struct.setList_d_NEW_ITEM_CD(TypeConverter.convert(d_NEW_ITEM_CD));
		struct.setd_ITEM_CD_CHANGE( ((d_ITEM_CD_CHANGE == null) ? (String)null : d_ITEM_CD_CHANGE[0]) );
		struct.setList_d_ITEM_CD_CHANGE(TypeConverter.convert(d_ITEM_CD_CHANGE));
		struct.setd_OLD_CUST_CD( ((d_OLD_CUST_CD == null) ? (String)null : d_OLD_CUST_CD[0]) );
		struct.setList_d_OLD_CUST_CD(TypeConverter.convert(d_OLD_CUST_CD));
		struct.setd_NEW_CUST_CD( ((d_NEW_CUST_CD == null) ? (String)null : d_NEW_CUST_CD[0]) );
		struct.setList_d_NEW_CUST_CD(TypeConverter.convert(d_NEW_CUST_CD));
		struct.setd_CUST_CD_CHANGE( ((d_CUST_CD_CHANGE == null) ? (String)null : d_CUST_CD_CHANGE[0]) );
		struct.setList_d_CUST_CD_CHANGE(TypeConverter.convert(d_CUST_CD_CHANGE));
		struct.setd_OLD_EFF_PHASE_IN_DATE( ((d_OLD_EFF_PHASE_IN_DATE == null) ? (String)null : d_OLD_EFF_PHASE_IN_DATE[0]) );
		struct.setList_d_OLD_EFF_PHASE_IN_DATE(TypeConverter.convert(d_OLD_EFF_PHASE_IN_DATE));
		struct.setd_NEW_EFF_PHASE_IN_DATE( ((d_NEW_EFF_PHASE_IN_DATE == null) ? (String)null : d_NEW_EFF_PHASE_IN_DATE[0]) );
		struct.setList_d_NEW_EFF_PHASE_IN_DATE(TypeConverter.convert(d_NEW_EFF_PHASE_IN_DATE));
		struct.setd_EFF_PHASE_IN_DATE_CHANGE( ((d_EFF_PHASE_IN_DATE_CHANGE == null) ? (String)null : d_EFF_PHASE_IN_DATE_CHANGE[0]) );
		struct.setList_d_EFF_PHASE_IN_DATE_CHANGE(TypeConverter.convert(d_EFF_PHASE_IN_DATE_CHANGE));
		struct.setd_NEW_UNIT_COST_TYP( ((d_NEW_UNIT_COST_TYP == null) ? (String)null : d_NEW_UNIT_COST_TYP[0]) );
		struct.setList_d_NEW_UNIT_COST_TYP(TypeConverter.convert(d_NEW_UNIT_COST_TYP));
		struct.setd_UNIT_COST_TYP_CHANGE( ((d_UNIT_COST_TYP_CHANGE == null) ? (String)null : d_UNIT_COST_TYP_CHANGE[0]) );
		struct.setList_d_UNIT_COST_TYP_CHANGE(TypeConverter.convert(d_UNIT_COST_TYP_CHANGE));
		struct.setd_OLD_UNIT_COST( ((d_OLD_UNIT_COST == null) ? (String)null : d_OLD_UNIT_COST[0]) );
		struct.setList_d_OLD_UNIT_COST(TypeConverter.convert(d_OLD_UNIT_COST));
		struct.setd_NEW_UNIT_COST( ((d_NEW_UNIT_COST == null) ? (String)null : d_NEW_UNIT_COST[0]) );
		struct.setList_d_NEW_UNIT_COST(TypeConverter.convert(d_NEW_UNIT_COST));
		struct.setd_UNIT_COST_CHANGE( ((d_UNIT_COST_CHANGE == null) ? (String)null : d_UNIT_COST_CHANGE[0]) );
		struct.setList_d_UNIT_COST_CHANGE(TypeConverter.convert(d_UNIT_COST_CHANGE));
		struct.setd_OLD_UNIT_COST_TYP( ((d_OLD_UNIT_COST_TYP == null) ? (String)null : d_OLD_UNIT_COST_TYP[0]) );
		struct.setList_d_OLD_UNIT_COST_TYP(TypeConverter.convert(d_OLD_UNIT_COST_TYP));
		struct.setd_APPR_POWER_TYP_CHANGE( ((d_APPR_POWER_TYP_CHANGE == null) ? (String)null : d_APPR_POWER_TYP_CHANGE[0]) );
		struct.setList_d_APPR_POWER_TYP_CHANGE(TypeConverter.convert(d_APPR_POWER_TYP_CHANGE));
		struct.setd_OLD_VEND_CD( ((d_OLD_VEND_CD == null) ? (String)null : d_OLD_VEND_CD[0]) );
		struct.setList_d_OLD_VEND_CD(TypeConverter.convert(d_OLD_VEND_CD));
		struct.setd_NEW_VEND_CD( ((d_NEW_VEND_CD == null) ? (String)null : d_NEW_VEND_CD[0]) );
		struct.setList_d_NEW_VEND_CD(TypeConverter.convert(d_NEW_VEND_CD));
		struct.setd_VEND_CD_CHANGE( ((d_VEND_CD_CHANGE == null) ? (String)null : d_VEND_CD_CHANGE[0]) );
		struct.setList_d_VEND_CD_CHANGE(TypeConverter.convert(d_VEND_CD_CHANGE));
		struct.setd_OLD_ONEROUS_FLG( ((d_OLD_ONEROUS_FLG == null) ? (String)null : d_OLD_ONEROUS_FLG[0]) );
		struct.setList_d_OLD_ONEROUS_FLG(TypeConverter.convert(d_OLD_ONEROUS_FLG));
		struct.setd_NEW_ONEROUS_FLG( ((d_NEW_ONEROUS_FLG == null) ? (String)null : d_NEW_ONEROUS_FLG[0]) );
		struct.setList_d_NEW_ONEROUS_FLG(TypeConverter.convert(d_NEW_ONEROUS_FLG));
		struct.setd_ONEROUS_FLG_CHANGE( ((d_ONEROUS_FLG_CHANGE == null) ? (String)null : d_ONEROUS_FLG_CHANGE[0]) );
		struct.setList_d_ONEROUS_FLG_CHANGE(TypeConverter.convert(d_ONEROUS_FLG_CHANGE));
		struct.setd_OLD_PROC_CD( ((d_OLD_PROC_CD == null) ? (String)null : d_OLD_PROC_CD[0]) );
		struct.setList_d_OLD_PROC_CD(TypeConverter.convert(d_OLD_PROC_CD));
		struct.setd_NEW_PROC_CD( ((d_NEW_PROC_CD == null) ? (String)null : d_NEW_PROC_CD[0]) );
		struct.setList_d_NEW_PROC_CD(TypeConverter.convert(d_NEW_PROC_CD));
		struct.setd_PROC_CD_CHANGE( ((d_PROC_CD_CHANGE == null) ? (String)null : d_PROC_CD_CHANGE[0]) );
		struct.setList_d_PROC_CD_CHANGE(TypeConverter.convert(d_PROC_CD_CHANGE));
		struct.setd_OLD_PROCESSING_COST( ((d_OLD_PROCESSING_COST == null) ? (String)null : d_OLD_PROCESSING_COST[0]) );
		struct.setList_d_OLD_PROCESSING_COST(TypeConverter.convert(d_OLD_PROCESSING_COST));
		struct.setd_NEW_PROCESSING_COST( ((d_NEW_PROCESSING_COST == null) ? (String)null : d_NEW_PROCESSING_COST[0]) );
		struct.setList_d_NEW_PROCESSING_COST(TypeConverter.convert(d_NEW_PROCESSING_COST));
		struct.setd_PROCESSING_COST_CHANGE( ((d_PROCESSING_COST_CHANGE == null) ? (String)null : d_PROCESSING_COST_CHANGE[0]) );
		struct.setList_d_PROCESSING_COST_CHANGE(TypeConverter.convert(d_PROCESSING_COST_CHANGE));
		struct.setd_OLD_MATERIAL_COST( ((d_OLD_MATERIAL_COST == null) ? (String)null : d_OLD_MATERIAL_COST[0]) );
		struct.setList_d_OLD_MATERIAL_COST(TypeConverter.convert(d_OLD_MATERIAL_COST));
		struct.setd_NEW_MATERIAL_COST( ((d_NEW_MATERIAL_COST == null) ? (String)null : d_NEW_MATERIAL_COST[0]) );
		struct.setList_d_NEW_MATERIAL_COST(TypeConverter.convert(d_NEW_MATERIAL_COST));
		struct.setd_MATERIAL_COST_CHANGE( ((d_MATERIAL_COST_CHANGE == null) ? (String)null : d_MATERIAL_COST_CHANGE[0]) );
		struct.setList_d_MATERIAL_COST_CHANGE(TypeConverter.convert(d_MATERIAL_COST_CHANGE));
		struct.setd_OLD_OTHER_OVERHEADS( ((d_OLD_OTHER_OVERHEADS == null) ? (String)null : d_OLD_OTHER_OVERHEADS[0]) );
		struct.setList_d_OLD_OTHER_OVERHEADS(TypeConverter.convert(d_OLD_OTHER_OVERHEADS));
		struct.setd_NEW_OTHER_OVERHEADS( ((d_NEW_OTHER_OVERHEADS == null) ? (String)null : d_NEW_OTHER_OVERHEADS[0]) );
		struct.setList_d_NEW_OTHER_OVERHEADS(TypeConverter.convert(d_NEW_OTHER_OVERHEADS));
		struct.setd_OTHER_OVERHEADS_CHANGE( ((d_OTHER_OVERHEADS_CHANGE == null) ? (String)null : d_OTHER_OVERHEADS_CHANGE[0]) );
		struct.setList_d_OTHER_OVERHEADS_CHANGE(TypeConverter.convert(d_OTHER_OVERHEADS_CHANGE));
		struct.setl_REQUEST_BY_NAME( ((l_REQUEST_BY_NAME == null) ? (String)null : l_REQUEST_BY_NAME[0]) );
		struct.setList_l_REQUEST_BY_NAME(TypeConverter.convert(l_REQUEST_BY_NAME));
		struct.seth_KEY1( ((h_KEY1 == null) ? (String)null : h_KEY1[0]) );
		struct.setList_h_KEY1(TypeConverter.convert(h_KEY1));
		struct.seth_VALUE1( ((h_VALUE1 == null) ? (String)null : h_VALUE1[0]) );
		struct.setList_h_VALUE1(TypeConverter.convert(h_VALUE1));
		struct.seth_KEY2( ((h_KEY2 == null) ? (String)null : h_KEY2[0]) );
		struct.setList_h_KEY2(TypeConverter.convert(h_KEY2));
		struct.seth_VALUE2( ((h_VALUE2 == null) ? (String)null : h_VALUE2[0]) );
		struct.setList_h_VALUE2(TypeConverter.convert(h_VALUE2));
		struct.seth_KEY3( ((h_KEY3 == null) ? (String)null : h_KEY3[0]) );
		struct.setList_h_KEY3(TypeConverter.convert(h_KEY3));
		struct.seth_VALUE3( ((h_VALUE3 == null) ? (String)null : h_VALUE3[0]) );
		struct.setList_h_VALUE3(TypeConverter.convert(h_VALUE3));
		struct.seth_KEY4( ((h_KEY4 == null) ? (String)null : h_KEY4[0]) );
		struct.setList_h_KEY4(TypeConverter.convert(h_KEY4));
		struct.seth_VALUE4( ((h_VALUE4 == null) ? (String)null : h_VALUE4[0]) );
		struct.setList_h_VALUE4(TypeConverter.convert(h_VALUE4));
		struct.seth_KEY5( ((h_KEY5 == null) ? (String)null : h_KEY5[0]) );
		struct.setList_h_KEY5(TypeConverter.convert(h_KEY5));
		struct.seth_VALUE5( ((h_VALUE5 == null) ? (String)null : h_VALUE5[0]) );
		struct.setList_h_VALUE5(TypeConverter.convert(h_VALUE5));
		struct.seth_KEY6( ((h_KEY6 == null) ? (String)null : h_KEY6[0]) );
		struct.setList_h_KEY6(TypeConverter.convert(h_KEY6));
		struct.seth_VALUE6( ((h_VALUE6 == null) ? (String)null : h_VALUE6[0]) );
		struct.setList_h_VALUE6(TypeConverter.convert(h_VALUE6));
		struct.seth_KEY7( ((h_KEY7 == null) ? (String)null : h_KEY7[0]) );
		struct.setList_h_KEY7(TypeConverter.convert(h_KEY7));
		struct.seth_VALUE7( ((h_VALUE7 == null) ? (String)null : h_VALUE7[0]) );
		struct.setList_h_VALUE7(TypeConverter.convert(h_VALUE7));
		struct.seth_TABLE_NAME( ((h_TABLE_NAME == null) ? (String)null : h_TABLE_NAME[0]) );
		struct.setList_h_TABLE_NAME(TypeConverter.convert(h_TABLE_NAME));
		struct.setd_OLD_VEND_ITEM_CD( ((d_OLD_VEND_ITEM_CD == null) ? (String)null : d_OLD_VEND_ITEM_CD[0]) );
		struct.setList_d_OLD_VEND_ITEM_CD(TypeConverter.convert(d_OLD_VEND_ITEM_CD));
		struct.setd_NEW_VEND_ITEM_CD( ((d_NEW_VEND_ITEM_CD == null) ? (String)null : d_NEW_VEND_ITEM_CD[0]) );
		struct.setList_d_NEW_VEND_ITEM_CD(TypeConverter.convert(d_NEW_VEND_ITEM_CD));
		struct.setd_VEND_ITEM_CD_CHANGE( ((d_VEND_ITEM_CD_CHANGE == null) ? (String)null : d_VEND_ITEM_CD_CHANGE[0]) );
		struct.setList_d_VEND_ITEM_CD_CHANGE(TypeConverter.convert(d_VEND_ITEM_CD_CHANGE));
		struct.setd_OLD_PUCH_PRIORITY_REF_NO( ((d_OLD_PUCH_PRIORITY_REF_NO == null) ? (String)null : d_OLD_PUCH_PRIORITY_REF_NO[0]) );
		struct.setList_d_OLD_PUCH_PRIORITY_REF_NO(TypeConverter.convert(d_OLD_PUCH_PRIORITY_REF_NO));
		struct.setd_NEW_PUCH_PRIORITY_REF_NO( ((d_NEW_PUCH_PRIORITY_REF_NO == null) ? (String)null : d_NEW_PUCH_PRIORITY_REF_NO[0]) );
		struct.setList_d_NEW_PUCH_PRIORITY_REF_NO(TypeConverter.convert(d_NEW_PUCH_PRIORITY_REF_NO));
		struct.setd_PUCH_PRIORITY_REF_NO_CHANGE( ((d_PUCH_PRIORITY_REF_NO_CHANGE == null) ? (String)null : d_PUCH_PRIORITY_REF_NO_CHANGE[0]) );
		struct.setList_d_PUCH_PRIORITY_REF_NO_CHANGE(TypeConverter.convert(d_PUCH_PRIORITY_REF_NO_CHANGE));
		struct.setd_OLD_PUCH_SIZE( ((d_OLD_PUCH_SIZE == null) ? (String)null : d_OLD_PUCH_SIZE[0]) );
		struct.setList_d_OLD_PUCH_SIZE(TypeConverter.convert(d_OLD_PUCH_SIZE));
		struct.setd_NEW_PUCH_SIZE( ((d_NEW_PUCH_SIZE == null) ? (String)null : d_NEW_PUCH_SIZE[0]) );
		struct.setList_d_NEW_PUCH_SIZE(TypeConverter.convert(d_NEW_PUCH_SIZE));
		struct.setd_PUCH_SIZE_CHANGE( ((d_PUCH_SIZE_CHANGE == null) ? (String)null : d_PUCH_SIZE_CHANGE[0]) );
		struct.setList_d_PUCH_SIZE_CHANGE(TypeConverter.convert(d_PUCH_SIZE_CHANGE));
		struct.setd_OLD_VEND_NAME( ((d_OLD_VEND_NAME == null) ? (String)null : d_OLD_VEND_NAME[0]) );
		struct.setList_d_OLD_VEND_NAME(TypeConverter.convert(d_OLD_VEND_NAME));
		struct.setd_NEW_VEND_NAME( ((d_NEW_VEND_NAME == null) ? (String)null : d_NEW_VEND_NAME[0]) );
		struct.setList_d_NEW_VEND_NAME(TypeConverter.convert(d_NEW_VEND_NAME));
		struct.setd_VEND_NAME_CHANGE( ((d_VEND_NAME_CHANGE == null) ? (String)null : d_VEND_NAME_CHANGE[0]) );
		struct.setList_d_VEND_NAME_CHANGE(TypeConverter.convert(d_VEND_NAME_CHANGE));
		struct.setd_OLD_VEND_ANAME( ((d_OLD_VEND_ANAME == null) ? (String)null : d_OLD_VEND_ANAME[0]) );
		struct.setList_d_OLD_VEND_ANAME(TypeConverter.convert(d_OLD_VEND_ANAME));
		struct.setd_NEW_VEND_ANAME( ((d_NEW_VEND_ANAME == null) ? (String)null : d_NEW_VEND_ANAME[0]) );
		struct.setList_d_NEW_VEND_ANAME(TypeConverter.convert(d_NEW_VEND_ANAME));
		struct.setd_OLD_ZIP_CD( ((d_OLD_ZIP_CD == null) ? (String)null : d_OLD_ZIP_CD[0]) );
		struct.setList_d_OLD_ZIP_CD(TypeConverter.convert(d_OLD_ZIP_CD));
		struct.setd_NEW_ZIP_CD( ((d_NEW_ZIP_CD == null) ? (String)null : d_NEW_ZIP_CD[0]) );
		struct.setList_d_NEW_ZIP_CD(TypeConverter.convert(d_NEW_ZIP_CD));
		struct.setd_ZIP_CD_CHANGE( ((d_ZIP_CD_CHANGE == null) ? (String)null : d_ZIP_CD_CHANGE[0]) );
		struct.setList_d_ZIP_CD_CHANGE(TypeConverter.convert(d_ZIP_CD_CHANGE));
		struct.setd_OLD_ADDRESS_1( ((d_OLD_ADDRESS_1 == null) ? (String)null : d_OLD_ADDRESS_1[0]) );
		struct.setList_d_OLD_ADDRESS_1(TypeConverter.convert(d_OLD_ADDRESS_1));
		struct.setd_NEW_ADDRESS_1( ((d_NEW_ADDRESS_1 == null) ? (String)null : d_NEW_ADDRESS_1[0]) );
		struct.setList_d_NEW_ADDRESS_1(TypeConverter.convert(d_NEW_ADDRESS_1));
		struct.setd_ADDRESS_1_CHANGE( ((d_ADDRESS_1_CHANGE == null) ? (String)null : d_ADDRESS_1_CHANGE[0]) );
		struct.setList_d_ADDRESS_1_CHANGE(TypeConverter.convert(d_ADDRESS_1_CHANGE));
		struct.setd_OLD_ADDRESS_2( ((d_OLD_ADDRESS_2 == null) ? (String)null : d_OLD_ADDRESS_2[0]) );
		struct.setList_d_OLD_ADDRESS_2(TypeConverter.convert(d_OLD_ADDRESS_2));
		struct.setd_NEW_ADDRESS_2( ((d_NEW_ADDRESS_2 == null) ? (String)null : d_NEW_ADDRESS_2[0]) );
		struct.setList_d_NEW_ADDRESS_2(TypeConverter.convert(d_NEW_ADDRESS_2));
		struct.setd_ADDRESS_2_CHANGE( ((d_ADDRESS_2_CHANGE == null) ? (String)null : d_ADDRESS_2_CHANGE[0]) );
		struct.setList_d_ADDRESS_2_CHANGE(TypeConverter.convert(d_ADDRESS_2_CHANGE));
		struct.setd_OLD_ADDRESS_K_1( ((d_OLD_ADDRESS_K_1 == null) ? (String)null : d_OLD_ADDRESS_K_1[0]) );
		struct.setList_d_OLD_ADDRESS_K_1(TypeConverter.convert(d_OLD_ADDRESS_K_1));
		struct.setd_NEW_ADDRESS_K_1( ((d_NEW_ADDRESS_K_1 == null) ? (String)null : d_NEW_ADDRESS_K_1[0]) );
		struct.setList_d_NEW_ADDRESS_K_1(TypeConverter.convert(d_NEW_ADDRESS_K_1));
		struct.setd_ADDRESS_K_1_CHANGE( ((d_ADDRESS_K_1_CHANGE == null) ? (String)null : d_ADDRESS_K_1_CHANGE[0]) );
		struct.setList_d_ADDRESS_K_1_CHANGE(TypeConverter.convert(d_ADDRESS_K_1_CHANGE));
		struct.setd_OLD_ADDRESS_K_2( ((d_OLD_ADDRESS_K_2 == null) ? (String)null : d_OLD_ADDRESS_K_2[0]) );
		struct.setList_d_OLD_ADDRESS_K_2(TypeConverter.convert(d_OLD_ADDRESS_K_2));
		struct.setd_NEW_ADDRESS_K_2( ((d_NEW_ADDRESS_K_2 == null) ? (String)null : d_NEW_ADDRESS_K_2[0]) );
		struct.setList_d_NEW_ADDRESS_K_2(TypeConverter.convert(d_NEW_ADDRESS_K_2));
		struct.setd_ADDRESS_K_2_CHANGE( ((d_ADDRESS_K_2_CHANGE == null) ? (String)null : d_ADDRESS_K_2_CHANGE[0]) );
		struct.setList_d_ADDRESS_K_2_CHANGE(TypeConverter.convert(d_ADDRESS_K_2_CHANGE));
		struct.setd_OLD_TEL( ((d_OLD_TEL == null) ? (String)null : d_OLD_TEL[0]) );
		struct.setList_d_OLD_TEL(TypeConverter.convert(d_OLD_TEL));
		struct.setd_NEW_TEL( ((d_NEW_TEL == null) ? (String)null : d_NEW_TEL[0]) );
		struct.setList_d_NEW_TEL(TypeConverter.convert(d_NEW_TEL));
		struct.setd_TEL_CHANGE( ((d_TEL_CHANGE == null) ? (String)null : d_TEL_CHANGE[0]) );
		struct.setList_d_TEL_CHANGE(TypeConverter.convert(d_TEL_CHANGE));
		struct.setd_OLD_FAX( ((d_OLD_FAX == null) ? (String)null : d_OLD_FAX[0]) );
		struct.setList_d_OLD_FAX(TypeConverter.convert(d_OLD_FAX));
		struct.setd_NEW_FAX( ((d_NEW_FAX == null) ? (String)null : d_NEW_FAX[0]) );
		struct.setList_d_NEW_FAX(TypeConverter.convert(d_NEW_FAX));
		struct.setd_FAX_CHANGE( ((d_FAX_CHANGE == null) ? (String)null : d_FAX_CHANGE[0]) );
		struct.setList_d_FAX_CHANGE(TypeConverter.convert(d_FAX_CHANGE));
		struct.setd_OLD_EMAIL( ((d_OLD_EMAIL == null) ? (String)null : d_OLD_EMAIL[0]) );
		struct.setList_d_OLD_EMAIL(TypeConverter.convert(d_OLD_EMAIL));
		struct.setd_NEW_EMAIL( ((d_NEW_EMAIL == null) ? (String)null : d_NEW_EMAIL[0]) );
		struct.setList_d_NEW_EMAIL(TypeConverter.convert(d_NEW_EMAIL));
		struct.setd_EMAIL_CHANGE( ((d_EMAIL_CHANGE == null) ? (String)null : d_EMAIL_CHANGE[0]) );
		struct.setList_d_EMAIL_CHANGE(TypeConverter.convert(d_EMAIL_CHANGE));
		struct.setd_OLD_VEND_ORG( ((d_OLD_VEND_ORG == null) ? (String)null : d_OLD_VEND_ORG[0]) );
		struct.setList_d_OLD_VEND_ORG(TypeConverter.convert(d_OLD_VEND_ORG));
		struct.setd_NEW_VEND_ORG( ((d_NEW_VEND_ORG == null) ? (String)null : d_NEW_VEND_ORG[0]) );
		struct.setList_d_NEW_VEND_ORG(TypeConverter.convert(d_NEW_VEND_ORG));
		struct.setd_VEND_ORG_CHANGE( ((d_VEND_ORG_CHANGE == null) ? (String)null : d_VEND_ORG_CHANGE[0]) );
		struct.setList_d_VEND_ORG_CHANGE(TypeConverter.convert(d_VEND_ORG_CHANGE));
		struct.setd_OLD_VEND_PERSON( ((d_OLD_VEND_PERSON == null) ? (String)null : d_OLD_VEND_PERSON[0]) );
		struct.setList_d_OLD_VEND_PERSON(TypeConverter.convert(d_OLD_VEND_PERSON));
		struct.setd_NEW_VEND_PERSON( ((d_NEW_VEND_PERSON == null) ? (String)null : d_NEW_VEND_PERSON[0]) );
		struct.setList_d_NEW_VEND_PERSON(TypeConverter.convert(d_NEW_VEND_PERSON));
		struct.setd_VEND_PERSON_CHANGE( ((d_VEND_PERSON_CHANGE == null) ? (String)null : d_VEND_PERSON_CHANGE[0]) );
		struct.setList_d_VEND_PERSON_CHANGE(TypeConverter.convert(d_VEND_PERSON_CHANGE));
		struct.setd_OLD_OWN_ORG_CD( ((d_OLD_OWN_ORG_CD == null) ? (String)null : d_OLD_OWN_ORG_CD[0]) );
		struct.setList_d_OLD_OWN_ORG_CD(TypeConverter.convert(d_OLD_OWN_ORG_CD));
		struct.setd_NEW_OWN_ORG_CD( ((d_NEW_OWN_ORG_CD == null) ? (String)null : d_NEW_OWN_ORG_CD[0]) );
		struct.setList_d_NEW_OWN_ORG_CD(TypeConverter.convert(d_NEW_OWN_ORG_CD));
		struct.setd_OWN_ORG_CD_CHANGE( ((d_OWN_ORG_CD_CHANGE == null) ? (String)null : d_OWN_ORG_CD_CHANGE[0]) );
		struct.setList_d_OWN_ORG_CD_CHANGE(TypeConverter.convert(d_OWN_ORG_CD_CHANGE));
		struct.setd_OLD_OWN_ORG_NAME( ((d_OLD_OWN_ORG_NAME == null) ? (String)null : d_OLD_OWN_ORG_NAME[0]) );
		struct.setList_d_OLD_OWN_ORG_NAME(TypeConverter.convert(d_OLD_OWN_ORG_NAME));
		struct.setd_NEW_OWN_ORG_NAME( ((d_NEW_OWN_ORG_NAME == null) ? (String)null : d_NEW_OWN_ORG_NAME[0]) );
		struct.setList_d_NEW_OWN_ORG_NAME(TypeConverter.convert(d_NEW_OWN_ORG_NAME));
		struct.setd_OWN_ORG_NAME_CHANGE( ((d_OWN_ORG_NAME_CHANGE == null) ? (String)null : d_OWN_ORG_NAME_CHANGE[0]) );
		struct.setList_d_OWN_ORG_NAME_CHANGE(TypeConverter.convert(d_OWN_ORG_NAME_CHANGE));
		struct.setd_OLD_OWN_PERSON_CD( ((d_OLD_OWN_PERSON_CD == null) ? (String)null : d_OLD_OWN_PERSON_CD[0]) );
		struct.setList_d_OLD_OWN_PERSON_CD(TypeConverter.convert(d_OLD_OWN_PERSON_CD));
		struct.setd_NEW_OWN_PERSON_CD( ((d_NEW_OWN_PERSON_CD == null) ? (String)null : d_NEW_OWN_PERSON_CD[0]) );
		struct.setList_d_NEW_OWN_PERSON_CD(TypeConverter.convert(d_NEW_OWN_PERSON_CD));
		struct.setd_OWN_PERSON_CD_CHANGE( ((d_OWN_PERSON_CD_CHANGE == null) ? (String)null : d_OWN_PERSON_CD_CHANGE[0]) );
		struct.setList_d_OWN_PERSON_CD_CHANGE(TypeConverter.convert(d_OWN_PERSON_CD_CHANGE));
		struct.setd_OLD_ROUND_TYP( ((d_OLD_ROUND_TYP == null) ? (String)null : d_OLD_ROUND_TYP[0]) );
		struct.setList_d_OLD_ROUND_TYP(TypeConverter.convert(d_OLD_ROUND_TYP));
		struct.setd_NEW_ROUND_TYP( ((d_NEW_ROUND_TYP == null) ? (String)null : d_NEW_ROUND_TYP[0]) );
		struct.setList_d_NEW_ROUND_TYP(TypeConverter.convert(d_NEW_ROUND_TYP));
		struct.setd_ROUND_TYP_CHANGE( ((d_ROUND_TYP_CHANGE == null) ? (String)null : d_ROUND_TYP_CHANGE[0]) );
		struct.setList_d_ROUND_TYP_CHANGE(TypeConverter.convert(d_ROUND_TYP_CHANGE));
		struct.setd_OLD_TAX_CD( ((d_OLD_TAX_CD == null) ? (String)null : d_OLD_TAX_CD[0]) );
		struct.setList_d_OLD_TAX_CD(TypeConverter.convert(d_OLD_TAX_CD));
		struct.setd_NEW_TAX_CD( ((d_NEW_TAX_CD == null) ? (String)null : d_NEW_TAX_CD[0]) );
		struct.setList_d_NEW_TAX_CD(TypeConverter.convert(d_NEW_TAX_CD));
		struct.setd_TAX_CD_CHANGE( ((d_TAX_CD_CHANGE == null) ? (String)null : d_TAX_CD_CHANGE[0]) );
		struct.setList_d_TAX_CD_CHANGE(TypeConverter.convert(d_TAX_CD_CHANGE));
		struct.setd_OLD_TAX_APPLY_TYP( ((d_OLD_TAX_APPLY_TYP == null) ? (String)null : d_OLD_TAX_APPLY_TYP[0]) );
		struct.setList_d_OLD_TAX_APPLY_TYP(TypeConverter.convert(d_OLD_TAX_APPLY_TYP));
		struct.setd_NEW_TAX_APPLY_TYP( ((d_NEW_TAX_APPLY_TYP == null) ? (String)null : d_NEW_TAX_APPLY_TYP[0]) );
		struct.setList_d_NEW_TAX_APPLY_TYP(TypeConverter.convert(d_NEW_TAX_APPLY_TYP));
		struct.setd_TAX_APPLY_TYP_CD_CHANGE( ((d_TAX_APPLY_TYP_CD_CHANGE == null) ? (String)null : d_TAX_APPLY_TYP_CD_CHANGE[0]) );
		struct.setList_d_TAX_APPLY_TYP_CD_CHANGE(TypeConverter.convert(d_TAX_APPLY_TYP_CD_CHANGE));
		struct.setd_OLD_TAX_CALC_TYP( ((d_OLD_TAX_CALC_TYP == null) ? (String)null : d_OLD_TAX_CALC_TYP[0]) );
		struct.setList_d_OLD_TAX_CALC_TYP(TypeConverter.convert(d_OLD_TAX_CALC_TYP));
		struct.setd_NEW_TAX_CALC_TYP( ((d_NEW_TAX_CALC_TYP == null) ? (String)null : d_NEW_TAX_CALC_TYP[0]) );
		struct.setList_d_NEW_TAX_CALC_TYP(TypeConverter.convert(d_NEW_TAX_CALC_TYP));
		struct.setd_TAX_CALC_TYP_CHANGE( ((d_TAX_CALC_TYP_CHANGE == null) ? (String)null : d_TAX_CALC_TYP_CHANGE[0]) );
		struct.setList_d_TAX_CALC_TYP_CHANGE(TypeConverter.convert(d_TAX_CALC_TYP_CHANGE));
		struct.setd_OLD_INSPC_ACPT_APP_TYP( ((d_OLD_INSPC_ACPT_APP_TYP == null) ? (String)null : d_OLD_INSPC_ACPT_APP_TYP[0]) );
		struct.setList_d_OLD_INSPC_ACPT_APP_TYP(TypeConverter.convert(d_OLD_INSPC_ACPT_APP_TYP));
		struct.setd_NEW_INSPC_ACPT_APP_TYP( ((d_NEW_INSPC_ACPT_APP_TYP == null) ? (String)null : d_NEW_INSPC_ACPT_APP_TYP[0]) );
		struct.setList_d_NEW_INSPC_ACPT_APP_TYP(TypeConverter.convert(d_NEW_INSPC_ACPT_APP_TYP));
		struct.setd_INSPC_ACPT_APP_TYP_CHANGE( ((d_INSPC_ACPT_APP_TYP_CHANGE == null) ? (String)null : d_INSPC_ACPT_APP_TYP_CHANGE[0]) );
		struct.setList_d_INSPC_ACPT_APP_TYP_CHANGE(TypeConverter.convert(d_INSPC_ACPT_APP_TYP_CHANGE));
		struct.setd_OLD_VEND_REM( ((d_OLD_VEND_REM == null) ? (String)null : d_OLD_VEND_REM[0]) );
		struct.setList_d_OLD_VEND_REM(TypeConverter.convert(d_OLD_VEND_REM));
		struct.setd_NEW_VEND_REM( ((d_NEW_VEND_REM == null) ? (String)null : d_NEW_VEND_REM[0]) );
		struct.setList_d_NEW_VEND_REM(TypeConverter.convert(d_NEW_VEND_REM));
		struct.setd_VEND_REM_CHANGE( ((d_VEND_REM_CHANGE == null) ? (String)null : d_VEND_REM_CHANGE[0]) );
		struct.setList_d_VEND_REM_CHANGE(TypeConverter.convert(d_VEND_REM_CHANGE));
		struct.setd_OLD_CUR_CD( ((d_OLD_CUR_CD == null) ? (String)null : d_OLD_CUR_CD[0]) );
		struct.setList_d_OLD_CUR_CD(TypeConverter.convert(d_OLD_CUR_CD));
		struct.setd_NEW_CUR_CD( ((d_NEW_CUR_CD == null) ? (String)null : d_NEW_CUR_CD[0]) );
		struct.setList_d_NEW_CUR_CD(TypeConverter.convert(d_NEW_CUR_CD));
		struct.setd_CUR_CD_CHANGE( ((d_CUR_CD_CHANGE == null) ? (String)null : d_CUR_CD_CHANGE[0]) );
		struct.setList_d_CUR_CD_CHANGE(TypeConverter.convert(d_CUR_CD_CHANGE));
		struct.setd_OLD_EXCH_TYP( ((d_OLD_EXCH_TYP == null) ? (String)null : d_OLD_EXCH_TYP[0]) );
		struct.setList_d_OLD_EXCH_TYP(TypeConverter.convert(d_OLD_EXCH_TYP));
		struct.setd_NEW_EXCH_TYP( ((d_NEW_EXCH_TYP == null) ? (String)null : d_NEW_EXCH_TYP[0]) );
		struct.setList_d_NEW_EXCH_TYP(TypeConverter.convert(d_NEW_EXCH_TYP));
		struct.setd_EXCH_TYP_CHANGE( ((d_EXCH_TYP_CHANGE == null) ? (String)null : d_EXCH_TYP_CHANGE[0]) );
		struct.setList_d_EXCH_TYP_CHANGE(TypeConverter.convert(d_EXCH_TYP_CHANGE));
		struct.setd_OLD_IMPORT_TRN_TYP( ((d_OLD_IMPORT_TRN_TYP == null) ? (String)null : d_OLD_IMPORT_TRN_TYP[0]) );
		struct.setList_d_OLD_IMPORT_TRN_TYP(TypeConverter.convert(d_OLD_IMPORT_TRN_TYP));
		struct.setd_NEW_IMPORT_TRN_TYP( ((d_NEW_IMPORT_TRN_TYP == null) ? (String)null : d_NEW_IMPORT_TRN_TYP[0]) );
		struct.setList_d_NEW_IMPORT_TRN_TYP(TypeConverter.convert(d_NEW_IMPORT_TRN_TYP));
		struct.setd_IMPORT_TRN_TYP_CHANGE( ((d_IMPORT_TRN_TYP_CHANGE == null) ? (String)null : d_IMPORT_TRN_TYP_CHANGE[0]) );
		struct.setList_d_IMPORT_TRN_TYP_CHANGE(TypeConverter.convert(d_IMPORT_TRN_TYP_CHANGE));
		struct.setd_VEND_ANAME_CHANGE( ((d_VEND_ANAME_CHANGE == null) ? (String)null : d_VEND_ANAME_CHANGE[0]) );
		struct.setList_d_VEND_ANAME_CHANGE(TypeConverter.convert(d_VEND_ANAME_CHANGE));
		struct.setd_OLD_CUST_NAME( ((d_OLD_CUST_NAME == null) ? (String)null : d_OLD_CUST_NAME[0]) );
		struct.setList_d_OLD_CUST_NAME(TypeConverter.convert(d_OLD_CUST_NAME));
		struct.setd_NEW_CUST_NAME( ((d_NEW_CUST_NAME == null) ? (String)null : d_NEW_CUST_NAME[0]) );
		struct.setList_d_NEW_CUST_NAME(TypeConverter.convert(d_NEW_CUST_NAME));
		struct.setd_CUST_NAME_CHANGE( ((d_CUST_NAME_CHANGE == null) ? (String)null : d_CUST_NAME_CHANGE[0]) );
		struct.setList_d_CUST_NAME_CHANGE(TypeConverter.convert(d_CUST_NAME_CHANGE));
		struct.setd_OLD_CUST_ANAME( ((d_OLD_CUST_ANAME == null) ? (String)null : d_OLD_CUST_ANAME[0]) );
		struct.setList_d_OLD_CUST_ANAME(TypeConverter.convert(d_OLD_CUST_ANAME));
		struct.setd_NEW_CUST_ANAME( ((d_NEW_CUST_ANAME == null) ? (String)null : d_NEW_CUST_ANAME[0]) );
		struct.setList_d_NEW_CUST_ANAME(TypeConverter.convert(d_NEW_CUST_ANAME));
		struct.setd_CUST_ANAME_CHANGE( ((d_CUST_ANAME_CHANGE == null) ? (String)null : d_CUST_ANAME_CHANGE[0]) );
		struct.setList_d_CUST_ANAME_CHANGE(TypeConverter.convert(d_CUST_ANAME_CHANGE));
		struct.setd_OLD_CUST_KNAME( ((d_OLD_CUST_KNAME == null) ? (String)null : d_OLD_CUST_KNAME[0]) );
		struct.setList_d_OLD_CUST_KNAME(TypeConverter.convert(d_OLD_CUST_KNAME));
		struct.setd_NEW_CUST_KNAME( ((d_NEW_CUST_KNAME == null) ? (String)null : d_NEW_CUST_KNAME[0]) );
		struct.setList_d_NEW_CUST_KNAME(TypeConverter.convert(d_NEW_CUST_KNAME));
		struct.setd_CUST_KNAME_CHANGE( ((d_CUST_KNAME_CHANGE == null) ? (String)null : d_CUST_KNAME_CHANGE[0]) );
		struct.setList_d_CUST_KNAME_CHANGE(TypeConverter.convert(d_CUST_KNAME_CHANGE));
		struct.setd_OLD_INSPC_ACPT_TYP( ((d_OLD_INSPC_ACPT_TYP == null) ? (String)null : d_OLD_INSPC_ACPT_TYP[0]) );
		struct.setList_d_OLD_INSPC_ACPT_TYP(TypeConverter.convert(d_OLD_INSPC_ACPT_TYP));
		struct.setd_NEW_INSPC_ACPT_TYP( ((d_NEW_INSPC_ACPT_TYP == null) ? (String)null : d_NEW_INSPC_ACPT_TYP[0]) );
		struct.setList_d_NEW_INSPC_ACPT_TYP(TypeConverter.convert(d_NEW_INSPC_ACPT_TYP));
		struct.setd_INSPC_ACPT_TYP_CHANGE( ((d_INSPC_ACPT_TYP_CHANGE == null) ? (String)null : d_INSPC_ACPT_TYP_CHANGE[0]) );
		struct.setList_d_INSPC_ACPT_TYP_CHANGE(TypeConverter.convert(d_INSPC_ACPT_TYP_CHANGE));
		struct.setd_TAX_APPLY_TYP_CHANGE( ((d_TAX_APPLY_TYP_CHANGE == null) ? (String)null : d_TAX_APPLY_TYP_CHANGE[0]) );
		struct.setList_d_TAX_APPLY_TYP_CHANGE(TypeConverter.convert(d_TAX_APPLY_TYP_CHANGE));
		struct.setd_OLD_EDI_CUST_VEND_CD( ((d_OLD_EDI_CUST_VEND_CD == null) ? (String)null : d_OLD_EDI_CUST_VEND_CD[0]) );
		struct.setList_d_OLD_EDI_CUST_VEND_CD(TypeConverter.convert(d_OLD_EDI_CUST_VEND_CD));
		struct.setd_NEW_EDI_CUST_VEND_CD( ((d_NEW_EDI_CUST_VEND_CD == null) ? (String)null : d_NEW_EDI_CUST_VEND_CD[0]) );
		struct.setList_d_NEW_EDI_CUST_VEND_CD(TypeConverter.convert(d_NEW_EDI_CUST_VEND_CD));
		struct.setd_EDI_CUST_VEND_CD_CHANGE( ((d_EDI_CUST_VEND_CD_CHANGE == null) ? (String)null : d_EDI_CUST_VEND_CD_CHANGE[0]) );
		struct.setList_d_EDI_CUST_VEND_CD_CHANGE(TypeConverter.convert(d_EDI_CUST_VEND_CD_CHANGE));
		struct.setd_OLD_PARTIAL_SHIP_INST_FLG( ((d_OLD_PARTIAL_SHIP_INST_FLG == null) ? (String)null : d_OLD_PARTIAL_SHIP_INST_FLG[0]) );
		struct.setList_d_OLD_PARTIAL_SHIP_INST_FLG(TypeConverter.convert(d_OLD_PARTIAL_SHIP_INST_FLG));
		struct.setd_NEW_PARTIAL_SHIP_INST_FLG( ((d_NEW_PARTIAL_SHIP_INST_FLG == null) ? (String)null : d_NEW_PARTIAL_SHIP_INST_FLG[0]) );
		struct.setList_d_NEW_PARTIAL_SHIP_INST_FLG(TypeConverter.convert(d_NEW_PARTIAL_SHIP_INST_FLG));
		struct.setd_PARTIAL_SHIP_INST_FLG_CHANGE( ((d_PARTIAL_SHIP_INST_FLG_CHANGE == null) ? (String)null : d_PARTIAL_SHIP_INST_FLG_CHANGE[0]) );
		struct.setList_d_PARTIAL_SHIP_INST_FLG_CHANGE(TypeConverter.convert(d_PARTIAL_SHIP_INST_FLG_CHANGE));
		struct.setd_OLD_DLV_LOC_CD( ((d_OLD_DLV_LOC_CD == null) ? (String)null : d_OLD_DLV_LOC_CD[0]) );
		struct.setList_d_OLD_DLV_LOC_CD(TypeConverter.convert(d_OLD_DLV_LOC_CD));
		struct.setd_NEW_DLV_LOC_CD( ((d_NEW_DLV_LOC_CD == null) ? (String)null : d_NEW_DLV_LOC_CD[0]) );
		struct.setList_d_NEW_DLV_LOC_CD(TypeConverter.convert(d_NEW_DLV_LOC_CD));
		struct.setd_DLV_LOC_CD_CHANGE( ((d_DLV_LOC_CD_CHANGE == null) ? (String)null : d_DLV_LOC_CD_CHANGE[0]) );
		struct.setList_d_DLV_LOC_CD_CHANGE(TypeConverter.convert(d_DLV_LOC_CD_CHANGE));
		struct.setd_OLD_DLV_LOC_NAME( ((d_OLD_DLV_LOC_NAME == null) ? (String)null : d_OLD_DLV_LOC_NAME[0]) );
		struct.setList_d_OLD_DLV_LOC_NAME(TypeConverter.convert(d_OLD_DLV_LOC_NAME));
		struct.setd_NEW_DLV_LOC_NAME( ((d_NEW_DLV_LOC_NAME == null) ? (String)null : d_NEW_DLV_LOC_NAME[0]) );
		struct.setList_d_NEW_DLV_LOC_NAME(TypeConverter.convert(d_NEW_DLV_LOC_NAME));
		struct.setd_DLV_LOC_NAME_CHANGE( ((d_DLV_LOC_NAME_CHANGE == null) ? (String)null : d_DLV_LOC_NAME_CHANGE[0]) );
		struct.setList_d_DLV_LOC_NAME_CHANGE(TypeConverter.convert(d_DLV_LOC_NAME_CHANGE));
		struct.setd_OLD_DLV_LOC_KNAME( ((d_OLD_DLV_LOC_KNAME == null) ? (String)null : d_OLD_DLV_LOC_KNAME[0]) );
		struct.setList_d_OLD_DLV_LOC_KNAME(TypeConverter.convert(d_OLD_DLV_LOC_KNAME));
		struct.setd_NEW_DLV_LOC_KNAME( ((d_NEW_DLV_LOC_KNAME == null) ? (String)null : d_NEW_DLV_LOC_KNAME[0]) );
		struct.setList_d_NEW_DLV_LOC_KNAME(TypeConverter.convert(d_NEW_DLV_LOC_KNAME));
		struct.setd_DLV_LOC_KNAME_CHANGE( ((d_DLV_LOC_KNAME_CHANGE == null) ? (String)null : d_DLV_LOC_KNAME_CHANGE[0]) );
		struct.setList_d_DLV_LOC_KNAME_CHANGE(TypeConverter.convert(d_DLV_LOC_KNAME_CHANGE));
		struct.setd_OLD_DLV_LOC_ENAME( ((d_OLD_DLV_LOC_ENAME == null) ? (String)null : d_OLD_DLV_LOC_ENAME[0]) );
		struct.setList_d_OLD_DLV_LOC_ENAME(TypeConverter.convert(d_OLD_DLV_LOC_ENAME));
		struct.setd_NEW_DLV_LOC_ENAME( ((d_NEW_DLV_LOC_ENAME == null) ? (String)null : d_NEW_DLV_LOC_ENAME[0]) );
		struct.setList_d_NEW_DLV_LOC_ENAME(TypeConverter.convert(d_NEW_DLV_LOC_ENAME));
		struct.setd_DLV_LOC_ENAME_CHANGE( ((d_DLV_LOC_ENAME_CHANGE == null) ? (String)null : d_DLV_LOC_ENAME_CHANGE[0]) );
		struct.setList_d_DLV_LOC_ENAME_CHANGE(TypeConverter.convert(d_DLV_LOC_ENAME_CHANGE));
		struct.setd_OLD_TRANSPORT_CD( ((d_OLD_TRANSPORT_CD == null) ? (String)null : d_OLD_TRANSPORT_CD[0]) );
		struct.setList_d_OLD_TRANSPORT_CD(TypeConverter.convert(d_OLD_TRANSPORT_CD));
		struct.setd_NEW_TRANSPORT_CD( ((d_NEW_TRANSPORT_CD == null) ? (String)null : d_NEW_TRANSPORT_CD[0]) );
		struct.setList_d_NEW_TRANSPORT_CD(TypeConverter.convert(d_NEW_TRANSPORT_CD));
		struct.setd_TRANSPORT_CD_CHANGE( ((d_TRANSPORT_CD_CHANGE == null) ? (String)null : d_TRANSPORT_CD_CHANGE[0]) );
		struct.setList_d_TRANSPORT_CD_CHANGE(TypeConverter.convert(d_TRANSPORT_CD_CHANGE));
		struct.setd_OLD_DEPO_WH_CD( ((d_OLD_DEPO_WH_CD == null) ? (String)null : d_OLD_DEPO_WH_CD[0]) );
		struct.setList_d_OLD_DEPO_WH_CD(TypeConverter.convert(d_OLD_DEPO_WH_CD));
		struct.setd_NEW_DEPO_WH_CD( ((d_NEW_DEPO_WH_CD == null) ? (String)null : d_NEW_DEPO_WH_CD[0]) );
		struct.setList_d_NEW_DEPO_WH_CD(TypeConverter.convert(d_NEW_DEPO_WH_CD));
		struct.setd_DEPO_WH_CD_CHANGE( ((d_DEPO_WH_CD_CHANGE == null) ? (String)null : d_DEPO_WH_CD_CHANGE[0]) );
		struct.setList_d_DEPO_WH_CD_CHANGE(TypeConverter.convert(d_DEPO_WH_CD_CHANGE));
		struct.setd_OLD_SHIP_WH_CD( ((d_OLD_SHIP_WH_CD == null) ? (String)null : d_OLD_SHIP_WH_CD[0]) );
		struct.setList_d_OLD_SHIP_WH_CD(TypeConverter.convert(d_OLD_SHIP_WH_CD));
		struct.setd_NEW_SHIP_WH_CD( ((d_NEW_SHIP_WH_CD == null) ? (String)null : d_NEW_SHIP_WH_CD[0]) );
		struct.setList_d_NEW_SHIP_WH_CD(TypeConverter.convert(d_NEW_SHIP_WH_CD));
		struct.setd_SHIP_WH_CD_CHANGE( ((d_SHIP_WH_CD_CHANGE == null) ? (String)null : d_SHIP_WH_CD_CHANGE[0]) );
		struct.setList_d_SHIP_WH_CD_CHANGE(TypeConverter.convert(d_SHIP_WH_CD_CHANGE));
		struct.setd_OLD_TRANSPORT_LT( ((d_OLD_TRANSPORT_LT == null) ? (String)null : d_OLD_TRANSPORT_LT[0]) );
		struct.setList_d_OLD_TRANSPORT_LT(TypeConverter.convert(d_OLD_TRANSPORT_LT));
		struct.setd_NEW_TRANSPORT_LT( ((d_NEW_TRANSPORT_LT == null) ? (String)null : d_NEW_TRANSPORT_LT[0]) );
		struct.setList_d_NEW_TRANSPORT_LT(TypeConverter.convert(d_NEW_TRANSPORT_LT));
		struct.setd_TRANSPORT_LT_CHANGE( ((d_TRANSPORT_LT_CHANGE == null) ? (String)null : d_TRANSPORT_LT_CHANGE[0]) );
		struct.setList_d_TRANSPORT_LT_CHANGE(TypeConverter.convert(d_TRANSPORT_LT_CHANGE));
		struct.setd_OLD_EXCH_RESERVE_CD( ((d_OLD_EXCH_RESERVE_CD == null) ? (String)null : d_OLD_EXCH_RESERVE_CD[0]) );
		struct.setList_d_OLD_EXCH_RESERVE_CD(TypeConverter.convert(d_OLD_EXCH_RESERVE_CD));
		struct.setd_NEW_EXCH_RESERVE_CD( ((d_NEW_EXCH_RESERVE_CD == null) ? (String)null : d_NEW_EXCH_RESERVE_CD[0]) );
		struct.setList_d_NEW_EXCH_RESERVE_CD(TypeConverter.convert(d_NEW_EXCH_RESERVE_CD));
		struct.setd_EXCH_RESERVE_CD_CHANGE( ((d_EXCH_RESERVE_CD_CHANGE == null) ? (String)null : d_EXCH_RESERVE_CD_CHANGE[0]) );
		struct.setList_d_EXCH_RESERVE_CD_CHANGE(TypeConverter.convert(d_EXCH_RESERVE_CD_CHANGE));
		struct.setd_OLD_EXCH_START_DATE( ((d_OLD_EXCH_START_DATE == null) ? (String)null : d_OLD_EXCH_START_DATE[0]) );
		struct.setList_d_OLD_EXCH_START_DATE(TypeConverter.convert(d_OLD_EXCH_START_DATE));
		struct.setd_NEW_EXCH_START_DATE( ((d_NEW_EXCH_START_DATE == null) ? (String)null : d_NEW_EXCH_START_DATE[0]) );
		struct.setList_d_NEW_EXCH_START_DATE(TypeConverter.convert(d_NEW_EXCH_START_DATE));
		struct.setd_EXCH_START_DATE_CHANGE( ((d_EXCH_START_DATE_CHANGE == null) ? (String)null : d_EXCH_START_DATE_CHANGE[0]) );
		struct.setList_d_EXCH_START_DATE_CHANGE(TypeConverter.convert(d_EXCH_START_DATE_CHANGE));
		struct.setd_OLD_EXCH_RATE( ((d_OLD_EXCH_RATE == null) ? (String)null : d_OLD_EXCH_RATE[0]) );
		struct.setList_d_OLD_EXCH_RATE(TypeConverter.convert(d_OLD_EXCH_RATE));
		struct.setd_NEW_EXCH_RATE( ((d_NEW_EXCH_RATE == null) ? (String)null : d_NEW_EXCH_RATE[0]) );
		struct.setList_d_NEW_EXCH_RATE(TypeConverter.convert(d_NEW_EXCH_RATE));
		struct.setd_EXCH_RATE_CHANGE( ((d_EXCH_RATE_CHANGE == null) ? (String)null : d_EXCH_RATE_CHANGE[0]) );
		struct.setList_d_EXCH_RATE_CHANGE(TypeConverter.convert(d_EXCH_RATE_CHANGE));
		struct.setd_OLD_BILL_ADDRESSEE_CD( ((d_OLD_BILL_ADDRESSEE_CD == null) ? (String)null : d_OLD_BILL_ADDRESSEE_CD[0]) );
		struct.setList_d_OLD_BILL_ADDRESSEE_CD(TypeConverter.convert(d_OLD_BILL_ADDRESSEE_CD));
		struct.setd_NEW_BILL_ADDRESSEE_CD( ((d_NEW_BILL_ADDRESSEE_CD == null) ? (String)null : d_NEW_BILL_ADDRESSEE_CD[0]) );
		struct.setList_d_NEW_BILL_ADDRESSEE_CD(TypeConverter.convert(d_NEW_BILL_ADDRESSEE_CD));
		struct.setd_BILL_ADDRESSEE_CD_CHANGE( ((d_BILL_ADDRESSEE_CD_CHANGE == null) ? (String)null : d_BILL_ADDRESSEE_CD_CHANGE[0]) );
		struct.setList_d_BILL_ADDRESSEE_CD_CHANGE(TypeConverter.convert(d_BILL_ADDRESSEE_CD_CHANGE));
		struct.setd_OLD_CUST_FNAME( ((d_OLD_CUST_FNAME == null) ? (String)null : d_OLD_CUST_FNAME[0]) );
		struct.setList_d_OLD_CUST_FNAME(TypeConverter.convert(d_OLD_CUST_FNAME));
		struct.setd_NEW_CUST_FNAME( ((d_NEW_CUST_FNAME == null) ? (String)null : d_NEW_CUST_FNAME[0]) );
		struct.setList_d_NEW_CUST_FNAME(TypeConverter.convert(d_NEW_CUST_FNAME));
		struct.setd_CUST_FNAME_CHANGE( ((d_CUST_FNAME_CHANGE == null) ? (String)null : d_CUST_FNAME_CHANGE[0]) );
		struct.setList_d_CUST_FNAME_CHANGE(TypeConverter.convert(d_CUST_FNAME_CHANGE));
		struct.setd_OLD_CUST_ENAME( ((d_OLD_CUST_ENAME == null) ? (String)null : d_OLD_CUST_ENAME[0]) );
		struct.setList_d_OLD_CUST_ENAME(TypeConverter.convert(d_OLD_CUST_ENAME));
		struct.setd_NEW_CUST_ENAME( ((d_NEW_CUST_ENAME == null) ? (String)null : d_NEW_CUST_ENAME[0]) );
		struct.setList_d_NEW_CUST_ENAME(TypeConverter.convert(d_NEW_CUST_ENAME));
		struct.setd_CUST_ENAME_CHANGE( ((d_CUST_ENAME_CHANGE == null) ? (String)null : d_CUST_ENAME_CHANGE[0]) );
		struct.setList_d_CUST_ENAME_CHANGE(TypeConverter.convert(d_CUST_ENAME_CHANGE));
		struct.setd_OLD_OWNER_EXECUTIVE( ((d_OLD_OWNER_EXECUTIVE == null) ? (String)null : d_OLD_OWNER_EXECUTIVE[0]) );
		struct.setList_d_OLD_OWNER_EXECUTIVE(TypeConverter.convert(d_OLD_OWNER_EXECUTIVE));
		struct.setd_NEW_OWNER_EXECUTIVE( ((d_NEW_OWNER_EXECUTIVE == null) ? (String)null : d_NEW_OWNER_EXECUTIVE[0]) );
		struct.setList_d_NEW_OWNER_EXECUTIVE(TypeConverter.convert(d_NEW_OWNER_EXECUTIVE));
		struct.setd_OWNER_EXECUTIVE_CHANGE( ((d_OWNER_EXECUTIVE_CHANGE == null) ? (String)null : d_OWNER_EXECUTIVE_CHANGE[0]) );
		struct.setList_d_OWNER_EXECUTIVE_CHANGE(TypeConverter.convert(d_OWNER_EXECUTIVE_CHANGE));
		struct.setd_OLD_OWNER_NAME( ((d_OLD_OWNER_NAME == null) ? (String)null : d_OLD_OWNER_NAME[0]) );
		struct.setList_d_OLD_OWNER_NAME(TypeConverter.convert(d_OLD_OWNER_NAME));
		struct.setd_NEW_OWNER_NAME( ((d_NEW_OWNER_NAME == null) ? (String)null : d_NEW_OWNER_NAME[0]) );
		struct.setList_d_NEW_OWNER_NAME(TypeConverter.convert(d_NEW_OWNER_NAME));
		struct.setd_OWNER_NAME_CHANGE( ((d_OWNER_NAME_CHANGE == null) ? (String)null : d_OWNER_NAME_CHANGE[0]) );
		struct.setList_d_OWNER_NAME_CHANGE(TypeConverter.convert(d_OWNER_NAME_CHANGE));
		struct.setd_OLD_COMPANY_CD( ((d_OLD_COMPANY_CD == null) ? (String)null : d_OLD_COMPANY_CD[0]) );
		struct.setList_d_OLD_COMPANY_CD(TypeConverter.convert(d_OLD_COMPANY_CD));
		struct.setd_NEW_COMPANY_CD( ((d_NEW_COMPANY_CD == null) ? (String)null : d_NEW_COMPANY_CD[0]) );
		struct.setList_d_NEW_COMPANY_CD(TypeConverter.convert(d_NEW_COMPANY_CD));
		struct.setd_COMPANY_CD_CHANGE( ((d_COMPANY_CD_CHANGE == null) ? (String)null : d_COMPANY_CD_CHANGE[0]) );
		struct.setList_d_COMPANY_CD_CHANGE(TypeConverter.convert(d_COMPANY_CD_CHANGE));
		struct.setd_OLD_COMPANY_FNAME( ((d_OLD_COMPANY_FNAME == null) ? (String)null : d_OLD_COMPANY_FNAME[0]) );
		struct.setList_d_OLD_COMPANY_FNAME(TypeConverter.convert(d_OLD_COMPANY_FNAME));
		struct.setd_NEW_COMPANY_FNAME( ((d_NEW_COMPANY_FNAME == null) ? (String)null : d_NEW_COMPANY_FNAME[0]) );
		struct.setList_d_NEW_COMPANY_FNAME(TypeConverter.convert(d_NEW_COMPANY_FNAME));
		struct.setd_COMPANY_FNAME_CHANGE( ((d_COMPANY_FNAME_CHANGE == null) ? (String)null : d_COMPANY_FNAME_CHANGE[0]) );
		struct.setList_d_COMPANY_FNAME_CHANGE(TypeConverter.convert(d_COMPANY_FNAME_CHANGE));
		struct.setd_OLD_COMPANY_NAME( ((d_OLD_COMPANY_NAME == null) ? (String)null : d_OLD_COMPANY_NAME[0]) );
		struct.setList_d_OLD_COMPANY_NAME(TypeConverter.convert(d_OLD_COMPANY_NAME));
		struct.setd_NEW_COMPANY_NAME( ((d_NEW_COMPANY_NAME == null) ? (String)null : d_NEW_COMPANY_NAME[0]) );
		struct.setList_d_NEW_COMPANY_NAME(TypeConverter.convert(d_NEW_COMPANY_NAME));
		struct.setd_COMPANY_NAME_CHANGE( ((d_COMPANY_NAME_CHANGE == null) ? (String)null : d_COMPANY_NAME_CHANGE[0]) );
		struct.setList_d_COMPANY_NAME_CHANGE(TypeConverter.convert(d_COMPANY_NAME_CHANGE));
		struct.setd_OLD_COMPANY_KNAME( ((d_OLD_COMPANY_KNAME == null) ? (String)null : d_OLD_COMPANY_KNAME[0]) );
		struct.setList_d_OLD_COMPANY_KNAME(TypeConverter.convert(d_OLD_COMPANY_KNAME));
		struct.setd_NEW_COMPANY_KNAME( ((d_NEW_COMPANY_KNAME == null) ? (String)null : d_NEW_COMPANY_KNAME[0]) );
		struct.setList_d_NEW_COMPANY_KNAME(TypeConverter.convert(d_NEW_COMPANY_KNAME));
		struct.setd_COMPANY_KNAME_CHANGE( ((d_COMPANY_KNAME_CHANGE == null) ? (String)null : d_COMPANY_KNAME_CHANGE[0]) );
		struct.setList_d_COMPANY_KNAME_CHANGE(TypeConverter.convert(d_COMPANY_KNAME_CHANGE));
		struct.setd_OLD_COMPANY_ENAME( ((d_OLD_COMPANY_ENAME == null) ? (String)null : d_OLD_COMPANY_ENAME[0]) );
		struct.setList_d_OLD_COMPANY_ENAME(TypeConverter.convert(d_OLD_COMPANY_ENAME));
		struct.setd_NEW_COMPANY_ENAME( ((d_NEW_COMPANY_ENAME == null) ? (String)null : d_NEW_COMPANY_ENAME[0]) );
		struct.setList_d_NEW_COMPANY_ENAME(TypeConverter.convert(d_NEW_COMPANY_ENAME));
		struct.setd_COMPANY_ENAME_CHANGE( ((d_COMPANY_ENAME_CHANGE == null) ? (String)null : d_COMPANY_ENAME_CHANGE[0]) );
		struct.setList_d_COMPANY_ENAME_CHANGE(TypeConverter.convert(d_COMPANY_ENAME_CHANGE));
		struct.setd_OLD_USER_TYP( ((d_OLD_USER_TYP == null) ? (String)null : d_OLD_USER_TYP[0]) );
		struct.setList_d_OLD_USER_TYP(TypeConverter.convert(d_OLD_USER_TYP));
		struct.setd_NEW_USER_TYP( ((d_NEW_USER_TYP == null) ? (String)null : d_NEW_USER_TYP[0]) );
		struct.setList_d_NEW_USER_TYP(TypeConverter.convert(d_NEW_USER_TYP));
		struct.setd_USER_TYP_CHANGE( ((d_USER_TYP_CHANGE == null) ? (String)null : d_USER_TYP_CHANGE[0]) );
		struct.setList_d_USER_TYP_CHANGE(TypeConverter.convert(d_USER_TYP_CHANGE));
		struct.setd_OLD_BANK_CD( ((d_OLD_BANK_CD == null) ? (String)null : d_OLD_BANK_CD[0]) );
		struct.setList_d_OLD_BANK_CD(TypeConverter.convert(d_OLD_BANK_CD));
		struct.setd_NEW_BANK_CD( ((d_NEW_BANK_CD == null) ? (String)null : d_NEW_BANK_CD[0]) );
		struct.setList_d_NEW_BANK_CD(TypeConverter.convert(d_NEW_BANK_CD));
		struct.setd_BANK_CD_CHANGE( ((d_BANK_CD_CHANGE == null) ? (String)null : d_BANK_CD_CHANGE[0]) );
		struct.setList_d_BANK_CD_CHANGE(TypeConverter.convert(d_BANK_CD_CHANGE));
		struct.setd_OLD_BANK_NAME( ((d_OLD_BANK_NAME == null) ? (String)null : d_OLD_BANK_NAME[0]) );
		struct.setList_d_OLD_BANK_NAME(TypeConverter.convert(d_OLD_BANK_NAME));
		struct.setd_NEW_BANK_NAME( ((d_NEW_BANK_NAME == null) ? (String)null : d_NEW_BANK_NAME[0]) );
		struct.setList_d_NEW_BANK_NAME(TypeConverter.convert(d_NEW_BANK_NAME));
		struct.setd_BANK_NAME_CHANGE( ((d_BANK_NAME_CHANGE == null) ? (String)null : d_BANK_NAME_CHANGE[0]) );
		struct.setList_d_BANK_NAME_CHANGE(TypeConverter.convert(d_BANK_NAME_CHANGE));
		struct.setd_OLD_BANK_ANAME( ((d_OLD_BANK_ANAME == null) ? (String)null : d_OLD_BANK_ANAME[0]) );
		struct.setList_d_OLD_BANK_ANAME(TypeConverter.convert(d_OLD_BANK_ANAME));
		struct.setd_NEW_BANK_ANAME( ((d_NEW_BANK_ANAME == null) ? (String)null : d_NEW_BANK_ANAME[0]) );
		struct.setList_d_NEW_BANK_ANAME(TypeConverter.convert(d_NEW_BANK_ANAME));
		struct.setd_BANK_ANAME_CHANGE( ((d_BANK_ANAME_CHANGE == null) ? (String)null : d_BANK_ANAME_CHANGE[0]) );
		struct.setList_d_BANK_ANAME_CHANGE(TypeConverter.convert(d_BANK_ANAME_CHANGE));
		struct.setd_OLD_BANK_KNAME( ((d_OLD_BANK_KNAME == null) ? (String)null : d_OLD_BANK_KNAME[0]) );
		struct.setList_d_OLD_BANK_KNAME(TypeConverter.convert(d_OLD_BANK_KNAME));
		struct.setd_NEW_BANK_KNAME( ((d_NEW_BANK_KNAME == null) ? (String)null : d_NEW_BANK_KNAME[0]) );
		struct.setList_d_NEW_BANK_KNAME(TypeConverter.convert(d_NEW_BANK_KNAME));
		struct.setd_BANK_KNAME_CHANGE( ((d_BANK_KNAME_CHANGE == null) ? (String)null : d_BANK_KNAME_CHANGE[0]) );
		struct.setList_d_BANK_KNAME_CHANGE(TypeConverter.convert(d_BANK_KNAME_CHANGE));
		struct.setd_OLD_BANK_ENAME( ((d_OLD_BANK_ENAME == null) ? (String)null : d_OLD_BANK_ENAME[0]) );
		struct.setList_d_OLD_BANK_ENAME(TypeConverter.convert(d_OLD_BANK_ENAME));
		struct.setd_NEW_BANK_ENAME( ((d_NEW_BANK_ENAME == null) ? (String)null : d_NEW_BANK_ENAME[0]) );
		struct.setList_d_NEW_BANK_ENAME(TypeConverter.convert(d_NEW_BANK_ENAME));
		struct.setd_BANK_ENAME_CHANGE( ((d_BANK_ENAME_CHANGE == null) ? (String)null : d_BANK_ENAME_CHANGE[0]) );
		struct.setList_d_BANK_ENAME_CHANGE(TypeConverter.convert(d_BANK_ENAME_CHANGE));
		struct.setd_OLD_BANK_FB_NAME( ((d_OLD_BANK_FB_NAME == null) ? (String)null : d_OLD_BANK_FB_NAME[0]) );
		struct.setList_d_OLD_BANK_FB_NAME(TypeConverter.convert(d_OLD_BANK_FB_NAME));
		struct.setd_NEW_BANK_FB_NAME( ((d_NEW_BANK_FB_NAME == null) ? (String)null : d_NEW_BANK_FB_NAME[0]) );
		struct.setList_d_NEW_BANK_FB_NAME(TypeConverter.convert(d_NEW_BANK_FB_NAME));
		struct.setd_BANK_FB_NAME_CHANGE( ((d_BANK_FB_NAME_CHANGE == null) ? (String)null : d_BANK_FB_NAME_CHANGE[0]) );
		struct.setList_d_BANK_FB_NAME_CHANGE(TypeConverter.convert(d_BANK_FB_NAME_CHANGE));
		struct.setd_OLD_BANK_BR_CD( ((d_OLD_BANK_BR_CD == null) ? (String)null : d_OLD_BANK_BR_CD[0]) );
		struct.setList_d_OLD_BANK_BR_CD(TypeConverter.convert(d_OLD_BANK_BR_CD));
		struct.setd_NEW_BANK_BR_CD( ((d_NEW_BANK_BR_CD == null) ? (String)null : d_NEW_BANK_BR_CD[0]) );
		struct.setList_d_NEW_BANK_BR_CD(TypeConverter.convert(d_NEW_BANK_BR_CD));
		struct.setd_BANK_BR_CD_CHANGE( ((d_BANK_BR_CD_CHANGE == null) ? (String)null : d_BANK_BR_CD_CHANGE[0]) );
		struct.setList_d_BANK_BR_CD_CHANGE(TypeConverter.convert(d_BANK_BR_CD_CHANGE));
		struct.setd_OLD_B_ACCT_TYP_CD( ((d_OLD_B_ACCT_TYP_CD == null) ? (String)null : d_OLD_B_ACCT_TYP_CD[0]) );
		struct.setList_d_OLD_B_ACCT_TYP_CD(TypeConverter.convert(d_OLD_B_ACCT_TYP_CD));
		struct.setd_NEW_B_ACCT_TYP_CD( ((d_NEW_B_ACCT_TYP_CD == null) ? (String)null : d_NEW_B_ACCT_TYP_CD[0]) );
		struct.setList_d_NEW_B_ACCT_TYP_CD(TypeConverter.convert(d_NEW_B_ACCT_TYP_CD));
		struct.setd_B_ACCT_TYP_CD_CHANGE( ((d_B_ACCT_TYP_CD_CHANGE == null) ? (String)null : d_B_ACCT_TYP_CD_CHANGE[0]) );
		struct.setList_d_B_ACCT_TYP_CD_CHANGE(TypeConverter.convert(d_B_ACCT_TYP_CD_CHANGE));
		struct.setd_OLD_B_ACCT_NAME( ((d_OLD_B_ACCT_NAME == null) ? (String)null : d_OLD_B_ACCT_NAME[0]) );
		struct.setList_d_OLD_B_ACCT_NAME(TypeConverter.convert(d_OLD_B_ACCT_NAME));
		struct.setd_NEW_B_ACCT_NAME( ((d_NEW_B_ACCT_NAME == null) ? (String)null : d_NEW_B_ACCT_NAME[0]) );
		struct.setList_d_NEW_B_ACCT_NAME(TypeConverter.convert(d_NEW_B_ACCT_NAME));
		struct.setd_B_ACCT_NAME_CHANGE( ((d_B_ACCT_NAME_CHANGE == null) ? (String)null : d_B_ACCT_NAME_CHANGE[0]) );
		struct.setList_d_B_ACCT_NAME_CHANGE(TypeConverter.convert(d_B_ACCT_NAME_CHANGE));
		struct.setd_OLD_FB_DATA_TYP( ((d_OLD_FB_DATA_TYP == null) ? (String)null : d_OLD_FB_DATA_TYP[0]) );
		struct.setList_d_OLD_FB_DATA_TYP(TypeConverter.convert(d_OLD_FB_DATA_TYP));
		struct.setd_NEW_FB_DATA_TYP( ((d_NEW_FB_DATA_TYP == null) ? (String)null : d_NEW_FB_DATA_TYP[0]) );
		struct.setList_d_NEW_FB_DATA_TYP(TypeConverter.convert(d_NEW_FB_DATA_TYP));
		struct.setd_FB_DATA_TYP_CHANGE( ((d_FB_DATA_TYP_CHANGE == null) ? (String)null : d_FB_DATA_TYP_CHANGE[0]) );
		struct.setList_d_FB_DATA_TYP_CHANGE(TypeConverter.convert(d_FB_DATA_TYP_CHANGE));
		struct.setd_OLD_TRF_REQUEST_CD( ((d_OLD_TRF_REQUEST_CD == null) ? (String)null : d_OLD_TRF_REQUEST_CD[0]) );
		struct.setList_d_OLD_TRF_REQUEST_CD(TypeConverter.convert(d_OLD_TRF_REQUEST_CD));
		struct.setd_NEW_TRF_REQUEST_CD( ((d_NEW_TRF_REQUEST_CD == null) ? (String)null : d_NEW_TRF_REQUEST_CD[0]) );
		struct.setList_d_NEW_TRF_REQUEST_CD(TypeConverter.convert(d_NEW_TRF_REQUEST_CD));
		struct.setd_TRF_REQUEST_CD_CHANGE( ((d_TRF_REQUEST_CD_CHANGE == null) ? (String)null : d_TRF_REQUEST_CD_CHANGE[0]) );
		struct.setList_d_TRF_REQUEST_CD_CHANGE(TypeConverter.convert(d_TRF_REQUEST_CD_CHANGE));
		struct.setd_OLD_B_ACCT_FB_NAME( ((d_OLD_B_ACCT_FB_NAME == null) ? (String)null : d_OLD_B_ACCT_FB_NAME[0]) );
		struct.setList_d_OLD_B_ACCT_FB_NAME(TypeConverter.convert(d_OLD_B_ACCT_FB_NAME));
		struct.setd_NEW_B_ACCT_FB_NAME( ((d_NEW_B_ACCT_FB_NAME == null) ? (String)null : d_NEW_B_ACCT_FB_NAME[0]) );
		struct.setList_d_NEW_B_ACCT_FB_NAME(TypeConverter.convert(d_NEW_B_ACCT_FB_NAME));
		struct.setd_B_ACCT_FB_NAME_CHANGE( ((d_B_ACCT_FB_NAME_CHANGE == null) ? (String)null : d_B_ACCT_FB_NAME_CHANGE[0]) );
		struct.setList_d_B_ACCT_FB_NAME_CHANGE(TypeConverter.convert(d_B_ACCT_FB_NAME_CHANGE));
		struct.setd_OLD_ACCT_CD( ((d_OLD_ACCT_CD == null) ? (String)null : d_OLD_ACCT_CD[0]) );
		struct.setList_d_OLD_ACCT_CD(TypeConverter.convert(d_OLD_ACCT_CD));
		struct.setd_NEW_ACCT_CD( ((d_NEW_ACCT_CD == null) ? (String)null : d_NEW_ACCT_CD[0]) );
		struct.setList_d_NEW_ACCT_CD(TypeConverter.convert(d_NEW_ACCT_CD));
		struct.setd_ACCT_CD_CHANGE( ((d_ACCT_CD_CHANGE == null) ? (String)null : d_ACCT_CD_CHANGE[0]) );
		struct.setList_d_ACCT_CD_CHANGE(TypeConverter.convert(d_ACCT_CD_CHANGE));
		struct.setd_OLD_PRIMITIVE_TYP( ((d_OLD_PRIMITIVE_TYP == null) ? (String)null : d_OLD_PRIMITIVE_TYP[0]) );
		struct.setList_d_OLD_PRIMITIVE_TYP(TypeConverter.convert(d_OLD_PRIMITIVE_TYP));
		struct.setd_NEW_PRIMITIVE_TYP( ((d_NEW_PRIMITIVE_TYP == null) ? (String)null : d_NEW_PRIMITIVE_TYP[0]) );
		struct.setList_d_NEW_PRIMITIVE_TYP(TypeConverter.convert(d_NEW_PRIMITIVE_TYP));
		struct.setd_PRIMITIVE_TYP_CHANGE( ((d_PRIMITIVE_TYP_CHANGE == null) ? (String)null : d_PRIMITIVE_TYP_CHANGE[0]) );
		struct.setList_d_PRIMITIVE_TYP_CHANGE(TypeConverter.convert(d_PRIMITIVE_TYP_CHANGE));
		struct.setd_OLD_ACCT_NAME( ((d_OLD_ACCT_NAME == null) ? (String)null : d_OLD_ACCT_NAME[0]) );
		struct.setList_d_OLD_ACCT_NAME(TypeConverter.convert(d_OLD_ACCT_NAME));
		struct.setd_NEW_ACCT_NAME( ((d_NEW_ACCT_NAME == null) ? (String)null : d_NEW_ACCT_NAME[0]) );
		struct.setList_d_NEW_ACCT_NAME(TypeConverter.convert(d_NEW_ACCT_NAME));
		struct.setd_ACCT_NAME_CHANGE( ((d_ACCT_NAME_CHANGE == null) ? (String)null : d_ACCT_NAME_CHANGE[0]) );
		struct.setList_d_ACCT_NAME_CHANGE(TypeConverter.convert(d_ACCT_NAME_CHANGE));
		struct.setd_OLD_ACCT_ANAME( ((d_OLD_ACCT_ANAME == null) ? (String)null : d_OLD_ACCT_ANAME[0]) );
		struct.setList_d_OLD_ACCT_ANAME(TypeConverter.convert(d_OLD_ACCT_ANAME));
		struct.setd_NEW_ACCT_ANAME( ((d_NEW_ACCT_ANAME == null) ? (String)null : d_NEW_ACCT_ANAME[0]) );
		struct.setList_d_NEW_ACCT_ANAME(TypeConverter.convert(d_NEW_ACCT_ANAME));
		struct.setd_ACCT_ANAME_CHANGE( ((d_ACCT_ANAME_CHANGE == null) ? (String)null : d_ACCT_ANAME_CHANGE[0]) );
		struct.setList_d_ACCT_ANAME_CHANGE(TypeConverter.convert(d_ACCT_ANAME_CHANGE));
		struct.setd_OLD_ACCT_KNAME( ((d_OLD_ACCT_KNAME == null) ? (String)null : d_OLD_ACCT_KNAME[0]) );
		struct.setList_d_OLD_ACCT_KNAME(TypeConverter.convert(d_OLD_ACCT_KNAME));
		struct.setd_NEW_ACCT_KNAME( ((d_NEW_ACCT_KNAME == null) ? (String)null : d_NEW_ACCT_KNAME[0]) );
		struct.setList_d_NEW_ACCT_KNAME(TypeConverter.convert(d_NEW_ACCT_KNAME));
		struct.setd_ACCT_KNAME_CHANGE( ((d_ACCT_KNAME_CHANGE == null) ? (String)null : d_ACCT_KNAME_CHANGE[0]) );
		struct.setList_d_ACCT_KNAME_CHANGE(TypeConverter.convert(d_ACCT_KNAME_CHANGE));
		struct.setd_OLD_DR_CR_TYP( ((d_OLD_DR_CR_TYP == null) ? (String)null : d_OLD_DR_CR_TYP[0]) );
		struct.setList_d_OLD_DR_CR_TYP(TypeConverter.convert(d_OLD_DR_CR_TYP));
		struct.setd_NEW_DR_CR_TYP( ((d_NEW_DR_CR_TYP == null) ? (String)null : d_NEW_DR_CR_TYP[0]) );
		struct.setList_d_NEW_DR_CR_TYP(TypeConverter.convert(d_NEW_DR_CR_TYP));
		struct.setd_DR_CR_TYP_CHANGE( ((d_DR_CR_TYP_CHANGE == null) ? (String)null : d_DR_CR_TYP_CHANGE[0]) );
		struct.setList_d_DR_CR_TYP_CHANGE(TypeConverter.convert(d_DR_CR_TYP_CHANGE));
		struct.setd_OLD_ACCT_TYP( ((d_OLD_ACCT_TYP == null) ? (String)null : d_OLD_ACCT_TYP[0]) );
		struct.setList_d_OLD_ACCT_TYP(TypeConverter.convert(d_OLD_ACCT_TYP));
		struct.setd_NEW_ACCT_TYP( ((d_NEW_ACCT_TYP == null) ? (String)null : d_NEW_ACCT_TYP[0]) );
		struct.setList_d_NEW_ACCT_TYP(TypeConverter.convert(d_NEW_ACCT_TYP));
		struct.setd_ACCT_TYP_CHANGE( ((d_ACCT_TYP_CHANGE == null) ? (String)null : d_ACCT_TYP_CHANGE[0]) );
		struct.setList_d_ACCT_TYP_CHANGE(TypeConverter.convert(d_ACCT_TYP_CHANGE));
		struct.setd_OLD_SUB_ACCT_TYP_DEFAULT( ((d_OLD_SUB_ACCT_TYP_DEFAULT == null) ? (String)null : d_OLD_SUB_ACCT_TYP_DEFAULT[0]) );
		struct.setList_d_OLD_SUB_ACCT_TYP_DEFAULT(TypeConverter.convert(d_OLD_SUB_ACCT_TYP_DEFAULT));
		struct.setd_NEW_SUB_ACCT_TYP_DEFAULT( ((d_NEW_SUB_ACCT_TYP_DEFAULT == null) ? (String)null : d_NEW_SUB_ACCT_TYP_DEFAULT[0]) );
		struct.setList_d_NEW_SUB_ACCT_TYP_DEFAULT(TypeConverter.convert(d_NEW_SUB_ACCT_TYP_DEFAULT));
		struct.setd_SUB_ACCT_TYP_DEFAULT_CHANGE( ((d_SUB_ACCT_TYP_DEFAULT_CHANGE == null) ? (String)null : d_SUB_ACCT_TYP_DEFAULT_CHANGE[0]) );
		struct.setList_d_SUB_ACCT_TYP_DEFAULT_CHANGE(TypeConverter.convert(d_SUB_ACCT_TYP_DEFAULT_CHANGE));
		struct.setd_OLD_TRF_TYP( ((d_OLD_TRF_TYP == null) ? (String)null : d_OLD_TRF_TYP[0]) );
		struct.setList_d_OLD_TRF_TYP(TypeConverter.convert(d_OLD_TRF_TYP));
		struct.setd_NEW_TRF_TYP( ((d_NEW_TRF_TYP == null) ? (String)null : d_NEW_TRF_TYP[0]) );
		struct.setList_d_NEW_TRF_TYP(TypeConverter.convert(d_NEW_TRF_TYP));
		struct.setd_TRF_TYP_CHANGE( ((d_TRF_TYP_CHANGE == null) ? (String)null : d_TRF_TYP_CHANGE[0]) );
		struct.setList_d_TRF_TYP_CHANGE(TypeConverter.convert(d_TRF_TYP_CHANGE));
		struct.setd_OLD_CONTENTS_TYP( ((d_OLD_CONTENTS_TYP == null) ? (String)null : d_OLD_CONTENTS_TYP[0]) );
		struct.setList_d_OLD_CONTENTS_TYP(TypeConverter.convert(d_OLD_CONTENTS_TYP));
		struct.setd_NEW_CONTENTS_TYP( ((d_NEW_CONTENTS_TYP == null) ? (String)null : d_NEW_CONTENTS_TYP[0]) );
		struct.setList_d_NEW_CONTENTS_TYP(TypeConverter.convert(d_NEW_CONTENTS_TYP));
		struct.setd_CONTENTS_TYP_CHANGE( ((d_CONTENTS_TYP_CHANGE == null) ? (String)null : d_CONTENTS_TYP_CHANGE[0]) );
		struct.setList_d_CONTENTS_TYP_CHANGE(TypeConverter.convert(d_CONTENTS_TYP_CHANGE));
		struct.setd_OLD_INFO_TYP( ((d_OLD_INFO_TYP == null) ? (String)null : d_OLD_INFO_TYP[0]) );
		struct.setList_d_OLD_INFO_TYP(TypeConverter.convert(d_OLD_INFO_TYP));
		struct.setd_NEW_INFO_TYP( ((d_NEW_INFO_TYP == null) ? (String)null : d_NEW_INFO_TYP[0]) );
		struct.setList_d_NEW_INFO_TYP(TypeConverter.convert(d_NEW_INFO_TYP));
		struct.setd_INFO_TYP_CHANGE( ((d_INFO_TYP_CHANGE == null) ? (String)null : d_INFO_TYP_CHANGE[0]) );
		struct.setList_d_INFO_TYP_CHANGE(TypeConverter.convert(d_INFO_TYP_CHANGE));
		struct.setd_OLD_VALID_START_DATE( ((d_OLD_VALID_START_DATE == null) ? (String)null : d_OLD_VALID_START_DATE[0]) );
		struct.setList_d_OLD_VALID_START_DATE(TypeConverter.convert(d_OLD_VALID_START_DATE));
		struct.setd_NEW_VALID_START_DATE( ((d_NEW_VALID_START_DATE == null) ? (String)null : d_NEW_VALID_START_DATE[0]) );
		struct.setList_d_NEW_VALID_START_DATE(TypeConverter.convert(d_NEW_VALID_START_DATE));
		struct.setd_VALID_START_DATE_CHANGE( ((d_VALID_START_DATE_CHANGE == null) ? (String)null : d_VALID_START_DATE_CHANGE[0]) );
		struct.setList_d_VALID_START_DATE_CHANGE(TypeConverter.convert(d_VALID_START_DATE_CHANGE));
		struct.setd_OLD_VALID_END_DATE( ((d_OLD_VALID_END_DATE == null) ? (String)null : d_OLD_VALID_END_DATE[0]) );
		struct.setList_d_OLD_VALID_END_DATE(TypeConverter.convert(d_OLD_VALID_END_DATE));
		struct.setd_NEW_VALID_END_DATE( ((d_NEW_VALID_END_DATE == null) ? (String)null : d_NEW_VALID_END_DATE[0]) );
		struct.setList_d_NEW_VALID_END_DATE(TypeConverter.convert(d_NEW_VALID_END_DATE));
		struct.setd_VALID_END_DATE_CHANGE( ((d_VALID_END_DATE_CHANGE == null) ? (String)null : d_VALID_END_DATE_CHANGE[0]) );
		struct.setList_d_VALID_END_DATE_CHANGE(TypeConverter.convert(d_VALID_END_DATE_CHANGE));
		struct.setd_OLD_MIN_AMOUNT( ((d_OLD_MIN_AMOUNT == null) ? (String)null : d_OLD_MIN_AMOUNT[0]) );
		struct.setList_d_OLD_MIN_AMOUNT(TypeConverter.convert(d_OLD_MIN_AMOUNT));
		struct.setd_NEW_MIN_AMOUNT( ((d_NEW_MIN_AMOUNT == null) ? (String)null : d_NEW_MIN_AMOUNT[0]) );
		struct.setList_d_NEW_MIN_AMOUNT(TypeConverter.convert(d_NEW_MIN_AMOUNT));
		struct.setd_OLD_MAX_AMOUNT( ((d_OLD_MAX_AMOUNT == null) ? (String)null : d_OLD_MAX_AMOUNT[0]) );
		struct.setList_d_OLD_MAX_AMOUNT(TypeConverter.convert(d_OLD_MAX_AMOUNT));
		struct.setd_NEW_MAX_AMOUNT( ((d_NEW_MAX_AMOUNT == null) ? (String)null : d_NEW_MAX_AMOUNT[0]) );
		struct.setList_d_NEW_MAX_AMOUNT(TypeConverter.convert(d_NEW_MAX_AMOUNT));
		struct.setd_MAX_AMOUNT_CHANGE( ((d_MAX_AMOUNT_CHANGE == null) ? (String)null : d_MAX_AMOUNT_CHANGE[0]) );
		struct.setList_d_MAX_AMOUNT_CHANGE(TypeConverter.convert(d_MAX_AMOUNT_CHANGE));
		struct.setd_OLD_TRF_FEE( ((d_OLD_TRF_FEE == null) ? (String)null : d_OLD_TRF_FEE[0]) );
		struct.setList_d_OLD_TRF_FEE(TypeConverter.convert(d_OLD_TRF_FEE));
		struct.setd_NEW_TRF_FEE( ((d_NEW_TRF_FEE == null) ? (String)null : d_NEW_TRF_FEE[0]) );
		struct.setList_d_NEW_TRF_FEE(TypeConverter.convert(d_NEW_TRF_FEE));
		struct.setd_TRF_FEE_CHANGE( ((d_TRF_FEE_CHANGE == null) ? (String)null : d_TRF_FEE_CHANGE[0]) );
		struct.setList_d_TRF_FEE_CHANGE(TypeConverter.convert(d_TRF_FEE_CHANGE));
		struct.setd_OLD_VEND_KNAME( ((d_OLD_VEND_KNAME == null) ? (String)null : d_OLD_VEND_KNAME[0]) );
		struct.setList_d_OLD_VEND_KNAME(TypeConverter.convert(d_OLD_VEND_KNAME));
		struct.setd_NEW_VEND_KNAME( ((d_NEW_VEND_KNAME == null) ? (String)null : d_NEW_VEND_KNAME[0]) );
		struct.setList_d_NEW_VEND_KNAME(TypeConverter.convert(d_NEW_VEND_KNAME));
		struct.setd_VEND_KNAME_CHANGE( ((d_VEND_KNAME_CHANGE == null) ? (String)null : d_VEND_KNAME_CHANGE[0]) );
		struct.setList_d_VEND_KNAME_CHANGE(TypeConverter.convert(d_VEND_KNAME_CHANGE));
		struct.setd_OLD_SUB_ACCT_CD( ((d_OLD_SUB_ACCT_CD == null) ? (String)null : d_OLD_SUB_ACCT_CD[0]) );
		struct.setList_d_OLD_SUB_ACCT_CD(TypeConverter.convert(d_OLD_SUB_ACCT_CD));
		struct.setd_NEW_SUB_ACCT_CD( ((d_NEW_SUB_ACCT_CD == null) ? (String)null : d_NEW_SUB_ACCT_CD[0]) );
		struct.setList_d_NEW_SUB_ACCT_CD(TypeConverter.convert(d_NEW_SUB_ACCT_CD));
		struct.setd_SUB_ACCT_CD_CHANGE( ((d_SUB_ACCT_CD_CHANGE == null) ? (String)null : d_SUB_ACCT_CD_CHANGE[0]) );
		struct.setList_d_SUB_ACCT_CD_CHANGE(TypeConverter.convert(d_SUB_ACCT_CD_CHANGE));
		struct.setd_OLD_PAY_PATTERN_CD( ((d_OLD_PAY_PATTERN_CD == null) ? (String)null : d_OLD_PAY_PATTERN_CD[0]) );
		struct.setList_d_OLD_PAY_PATTERN_CD(TypeConverter.convert(d_OLD_PAY_PATTERN_CD));
		struct.setd_NEW_PAY_PATTERN_CD( ((d_NEW_PAY_PATTERN_CD == null) ? (String)null : d_NEW_PAY_PATTERN_CD[0]) );
		struct.setList_d_NEW_PAY_PATTERN_CD(TypeConverter.convert(d_NEW_PAY_PATTERN_CD));
		struct.setd_PAY_PATTERN_CD_CHANGE( ((d_PAY_PATTERN_CD_CHANGE == null) ? (String)null : d_PAY_PATTERN_CD_CHANGE[0]) );
		struct.setList_d_PAY_PATTERN_CD_CHANGE(TypeConverter.convert(d_PAY_PATTERN_CD_CHANGE));
		struct.setd_OLD_PAY_ODR_TYP( ((d_OLD_PAY_ODR_TYP == null) ? (String)null : d_OLD_PAY_ODR_TYP[0]) );
		struct.setList_d_OLD_PAY_ODR_TYP(TypeConverter.convert(d_OLD_PAY_ODR_TYP));
		struct.setd_NEW_PAY_ODR_TYP( ((d_NEW_PAY_ODR_TYP == null) ? (String)null : d_NEW_PAY_ODR_TYP[0]) );
		struct.setList_d_NEW_PAY_ODR_TYP(TypeConverter.convert(d_NEW_PAY_ODR_TYP));
		struct.setd_PAY_ODR_TYP_CHANGE( ((d_PAY_ODR_TYP_CHANGE == null) ? (String)null : d_PAY_ODR_TYP_CHANGE[0]) );
		struct.setList_d_PAY_ODR_TYP_CHANGE(TypeConverter.convert(d_PAY_ODR_TYP_CHANGE));
		struct.setd_OLD_PAY_METHOD_CD_1( ((d_OLD_PAY_METHOD_CD_1 == null) ? (String)null : d_OLD_PAY_METHOD_CD_1[0]) );
		struct.setList_d_OLD_PAY_METHOD_CD_1(TypeConverter.convert(d_OLD_PAY_METHOD_CD_1));
		struct.setd_NEW_PAY_METHOD_CD_1( ((d_NEW_PAY_METHOD_CD_1 == null) ? (String)null : d_NEW_PAY_METHOD_CD_1[0]) );
		struct.setList_d_NEW_PAY_METHOD_CD_1(TypeConverter.convert(d_NEW_PAY_METHOD_CD_1));
		struct.setd_PAY_METHOD_CD_1_CHANGE( ((d_PAY_METHOD_CD_1_CHANGE == null) ? (String)null : d_PAY_METHOD_CD_1_CHANGE[0]) );
		struct.setList_d_PAY_METHOD_CD_1_CHANGE(TypeConverter.convert(d_PAY_METHOD_CD_1_CHANGE));
		struct.setd_OLD_PAY_METHOD_CD_2( ((d_OLD_PAY_METHOD_CD_2 == null) ? (String)null : d_OLD_PAY_METHOD_CD_2[0]) );
		struct.setList_d_OLD_PAY_METHOD_CD_2(TypeConverter.convert(d_OLD_PAY_METHOD_CD_2));
		struct.setd_NEW_PAY_METHOD_CD_2( ((d_NEW_PAY_METHOD_CD_2 == null) ? (String)null : d_NEW_PAY_METHOD_CD_2[0]) );
		struct.setList_d_NEW_PAY_METHOD_CD_2(TypeConverter.convert(d_NEW_PAY_METHOD_CD_2));
		struct.setd_PAY_METHOD_CD_2_CHANGE( ((d_PAY_METHOD_CD_2_CHANGE == null) ? (String)null : d_PAY_METHOD_CD_2_CHANGE[0]) );
		struct.setList_d_PAY_METHOD_CD_2_CHANGE(TypeConverter.convert(d_PAY_METHOD_CD_2_CHANGE));
		struct.setd_OLD_PAY_METHOD_CD( ((d_OLD_PAY_METHOD_CD == null) ? (String)null : d_OLD_PAY_METHOD_CD[0]) );
		struct.setList_d_OLD_PAY_METHOD_CD(TypeConverter.convert(d_OLD_PAY_METHOD_CD));
		struct.setd_NEW_PAY_METHOD_CD( ((d_NEW_PAY_METHOD_CD == null) ? (String)null : d_NEW_PAY_METHOD_CD[0]) );
		struct.setList_d_NEW_PAY_METHOD_CD(TypeConverter.convert(d_NEW_PAY_METHOD_CD));
		struct.setd_PAY_METHOD_CD_CHANGE( ((d_PAY_METHOD_CD_CHANGE == null) ? (String)null : d_PAY_METHOD_CD_CHANGE[0]) );
		struct.setList_d_PAY_METHOD_CD_CHANGE(TypeConverter.convert(d_PAY_METHOD_CD_CHANGE));
		struct.setd_OLD_PAY_METHOD( ((d_OLD_PAY_METHOD == null) ? (String)null : d_OLD_PAY_METHOD[0]) );
		struct.setList_d_OLD_PAY_METHOD(TypeConverter.convert(d_OLD_PAY_METHOD));
		struct.setd_NEW_PAY_METHOD( ((d_NEW_PAY_METHOD == null) ? (String)null : d_NEW_PAY_METHOD[0]) );
		struct.setList_d_NEW_PAY_METHOD(TypeConverter.convert(d_NEW_PAY_METHOD));
		struct.setd_PAY_METHOD_CHANGE( ((d_PAY_METHOD_CHANGE == null) ? (String)null : d_PAY_METHOD_CHANGE[0]) );
		struct.setList_d_PAY_METHOD_CHANGE(TypeConverter.convert(d_PAY_METHOD_CHANGE));
		struct.setd_OLD_PAY_TARGET_TYP( ((d_OLD_PAY_TARGET_TYP == null) ? (String)null : d_OLD_PAY_TARGET_TYP[0]) );
		struct.setList_d_OLD_PAY_TARGET_TYP(TypeConverter.convert(d_OLD_PAY_TARGET_TYP));
		struct.setd_NEW_PAY_TARGET_TYP( ((d_NEW_PAY_TARGET_TYP == null) ? (String)null : d_NEW_PAY_TARGET_TYP[0]) );
		struct.setList_d_NEW_PAY_TARGET_TYP(TypeConverter.convert(d_NEW_PAY_TARGET_TYP));
		struct.setd_PAY_TARGET_TYP_CHANGE( ((d_PAY_TARGET_TYP_CHANGE == null) ? (String)null : d_PAY_TARGET_TYP_CHANGE[0]) );
		struct.setList_d_PAY_TARGET_TYP_CHANGE(TypeConverter.convert(d_PAY_TARGET_TYP_CHANGE));
		struct.setd_OLD_SLIP_CTRL_ORG_CD( ((d_OLD_SLIP_CTRL_ORG_CD == null) ? (String)null : d_OLD_SLIP_CTRL_ORG_CD[0]) );
		struct.setList_d_OLD_SLIP_CTRL_ORG_CD(TypeConverter.convert(d_OLD_SLIP_CTRL_ORG_CD));
		struct.setd_NEW_SLIP_CTRL_ORG_CD( ((d_NEW_SLIP_CTRL_ORG_CD == null) ? (String)null : d_NEW_SLIP_CTRL_ORG_CD[0]) );
		struct.setList_d_NEW_SLIP_CTRL_ORG_CD(TypeConverter.convert(d_NEW_SLIP_CTRL_ORG_CD));
		struct.setd_SLIP_CTRL_ORG_CD_CHANGE( ((d_SLIP_CTRL_ORG_CD_CHANGE == null) ? (String)null : d_SLIP_CTRL_ORG_CD_CHANGE[0]) );
		struct.setList_d_SLIP_CTRL_ORG_CD_CHANGE(TypeConverter.convert(d_SLIP_CTRL_ORG_CD_CHANGE));
		struct.setd_OLD_CLOSING_CTRL_ORG_CD( ((d_OLD_CLOSING_CTRL_ORG_CD == null) ? (String)null : d_OLD_CLOSING_CTRL_ORG_CD[0]) );
		struct.setList_d_OLD_CLOSING_CTRL_ORG_CD(TypeConverter.convert(d_OLD_CLOSING_CTRL_ORG_CD));
		struct.setd_NEW_CLOSING_CTRL_ORG_CD( ((d_NEW_CLOSING_CTRL_ORG_CD == null) ? (String)null : d_NEW_CLOSING_CTRL_ORG_CD[0]) );
		struct.setList_d_NEW_CLOSING_CTRL_ORG_CD(TypeConverter.convert(d_NEW_CLOSING_CTRL_ORG_CD));
		struct.setd_CLOSING_CTRL_ORG_CD_CHANGE( ((d_CLOSING_CTRL_ORG_CD_CHANGE == null) ? (String)null : d_CLOSING_CTRL_ORG_CD_CHANGE[0]) );
		struct.setList_d_CLOSING_CTRL_ORG_CD_CHANGE(TypeConverter.convert(d_CLOSING_CTRL_ORG_CD_CHANGE));
		struct.setd_OLD_PAY_CALC_CTRL_ORG_CD( ((d_OLD_PAY_CALC_CTRL_ORG_CD == null) ? (String)null : d_OLD_PAY_CALC_CTRL_ORG_CD[0]) );
		struct.setList_d_OLD_PAY_CALC_CTRL_ORG_CD(TypeConverter.convert(d_OLD_PAY_CALC_CTRL_ORG_CD));
		struct.setd_NEW_PAY_CALC_CTRL_ORG_CD( ((d_NEW_PAY_CALC_CTRL_ORG_CD == null) ? (String)null : d_NEW_PAY_CALC_CTRL_ORG_CD[0]) );
		struct.setList_d_NEW_PAY_CALC_CTRL_ORG_CD(TypeConverter.convert(d_NEW_PAY_CALC_CTRL_ORG_CD));
		struct.setd_PAY_CALC_CTRL_ORG_CD_CHANGE( ((d_PAY_CALC_CTRL_ORG_CD_CHANGE == null) ? (String)null : d_PAY_CALC_CTRL_ORG_CD_CHANGE[0]) );
		struct.setList_d_PAY_CALC_CTRL_ORG_CD_CHANGE(TypeConverter.convert(d_PAY_CALC_CTRL_ORG_CD_CHANGE));
		struct.setd_OLD_PAY_FIX_CTRL_ORG_CD( ((d_OLD_PAY_FIX_CTRL_ORG_CD == null) ? (String)null : d_OLD_PAY_FIX_CTRL_ORG_CD[0]) );
		struct.setList_d_OLD_PAY_FIX_CTRL_ORG_CD(TypeConverter.convert(d_OLD_PAY_FIX_CTRL_ORG_CD));
		struct.setd_NEW_PAY_FIX_CTRL_ORG_CD( ((d_NEW_PAY_FIX_CTRL_ORG_CD == null) ? (String)null : d_NEW_PAY_FIX_CTRL_ORG_CD[0]) );
		struct.setList_d_NEW_PAY_FIX_CTRL_ORG_CD(TypeConverter.convert(d_NEW_PAY_FIX_CTRL_ORG_CD));
		struct.setd_PAY_FIX_CTRL_ORG_CD_CHANGE( ((d_PAY_FIX_CTRL_ORG_CD_CHANGE == null) ? (String)null : d_PAY_FIX_CTRL_ORG_CD_CHANGE[0]) );
		struct.setList_d_PAY_FIX_CTRL_ORG_CD_CHANGE(TypeConverter.convert(d_PAY_FIX_CTRL_ORG_CD_CHANGE));
		struct.setd_OLD_STL_COND_CD( ((d_OLD_STL_COND_CD == null) ? (String)null : d_OLD_STL_COND_CD[0]) );
		struct.setList_d_OLD_STL_COND_CD(TypeConverter.convert(d_OLD_STL_COND_CD));
		struct.setd_NEW_STL_COND_CD( ((d_NEW_STL_COND_CD == null) ? (String)null : d_NEW_STL_COND_CD[0]) );
		struct.setList_d_NEW_STL_COND_CD(TypeConverter.convert(d_NEW_STL_COND_CD));
		struct.setd_STL_COND_CD_CHANGE( ((d_STL_COND_CD_CHANGE == null) ? (String)null : d_STL_COND_CD_CHANGE[0]) );
		struct.setList_d_STL_COND_CD_CHANGE(TypeConverter.convert(d_STL_COND_CD_CHANGE));
		struct.setd_OLD_CLAIM_ORG_CD( ((d_OLD_CLAIM_ORG_CD == null) ? (String)null : d_OLD_CLAIM_ORG_CD[0]) );
		struct.setList_d_OLD_CLAIM_ORG_CD(TypeConverter.convert(d_OLD_CLAIM_ORG_CD));
		struct.setd_NEW_CLAIM_ORG_CD( ((d_NEW_CLAIM_ORG_CD == null) ? (String)null : d_NEW_CLAIM_ORG_CD[0]) );
		struct.setList_d_NEW_CLAIM_ORG_CD(TypeConverter.convert(d_NEW_CLAIM_ORG_CD));
		struct.setd_CLAIM_ORG_CD_CHANGE( ((d_CLAIM_ORG_CD_CHANGE == null) ? (String)null : d_CLAIM_ORG_CD_CHANGE[0]) );
		struct.setList_d_CLAIM_ORG_CD_CHANGE(TypeConverter.convert(d_CLAIM_ORG_CD_CHANGE));
		struct.setd_OLD_EDI_TRN_BILL_TYP( ((d_OLD_EDI_TRN_BILL_TYP == null) ? (String)null : d_OLD_EDI_TRN_BILL_TYP[0]) );
		struct.setList_d_OLD_EDI_TRN_BILL_TYP(TypeConverter.convert(d_OLD_EDI_TRN_BILL_TYP));
		struct.setd_NEW_EDI_TRN_BILL_TYP( ((d_NEW_EDI_TRN_BILL_TYP == null) ? (String)null : d_NEW_EDI_TRN_BILL_TYP[0]) );
		struct.setList_d_NEW_EDI_TRN_BILL_TYP(TypeConverter.convert(d_NEW_EDI_TRN_BILL_TYP));
		struct.setd_EDI_TRN_BILL_TYP_CHANGE( ((d_EDI_TRN_BILL_TYP_CHANGE == null) ? (String)null : d_EDI_TRN_BILL_TYP_CHANGE[0]) );
		struct.setList_d_EDI_TRN_BILL_TYP_CHANGE(TypeConverter.convert(d_EDI_TRN_BILL_TYP_CHANGE));
		struct.setd_OLD_EDI_TRN_RM_TYP( ((d_OLD_EDI_TRN_RM_TYP == null) ? (String)null : d_OLD_EDI_TRN_RM_TYP[0]) );
		struct.setList_d_OLD_EDI_TRN_RM_TYP(TypeConverter.convert(d_OLD_EDI_TRN_RM_TYP));
		struct.setd_NEW_EDI_TRN_RM_TYP( ((d_NEW_EDI_TRN_RM_TYP == null) ? (String)null : d_NEW_EDI_TRN_RM_TYP[0]) );
		struct.setList_d_NEW_EDI_TRN_RM_TYP(TypeConverter.convert(d_NEW_EDI_TRN_RM_TYP));
		struct.setd_EDI_TRN_RM_TYP_CHANGE( ((d_EDI_TRN_RM_TYP_CHANGE == null) ? (String)null : d_EDI_TRN_RM_TYP_CHANGE[0]) );
		struct.setList_d_EDI_TRN_RM_TYP_CHANGE(TypeConverter.convert(d_EDI_TRN_RM_TYP_CHANGE));
		struct.setd_OLD_BILL_BALANCE_CTRL_FLG( ((d_OLD_BILL_BALANCE_CTRL_FLG == null) ? (String)null : d_OLD_BILL_BALANCE_CTRL_FLG[0]) );
		struct.setList_d_OLD_BILL_BALANCE_CTRL_FLG(TypeConverter.convert(d_OLD_BILL_BALANCE_CTRL_FLG));
		struct.setd_NEW_BILL_BALANCE_CTRL_FLG( ((d_NEW_BILL_BALANCE_CTRL_FLG == null) ? (String)null : d_NEW_BILL_BALANCE_CTRL_FLG[0]) );
		struct.setList_d_NEW_BILL_BALANCE_CTRL_FLG(TypeConverter.convert(d_NEW_BILL_BALANCE_CTRL_FLG));
		struct.setd_BILL_BALANCE_CTRL_FLG_CHANGE( ((d_BILL_BALANCE_CTRL_FLG_CHANGE == null) ? (String)null : d_BILL_BALANCE_CTRL_FLG_CHANGE[0]) );
		struct.setList_d_BILL_BALANCE_CTRL_FLG_CHANGE(TypeConverter.convert(d_BILL_BALANCE_CTRL_FLG_CHANGE));
		struct.setd_OLD_AR_BALANCE_CTRL_FLG( ((d_OLD_AR_BALANCE_CTRL_FLG == null) ? (String)null : d_OLD_AR_BALANCE_CTRL_FLG[0]) );
		struct.setList_d_OLD_AR_BALANCE_CTRL_FLG(TypeConverter.convert(d_OLD_AR_BALANCE_CTRL_FLG));
		struct.setd_NEW_AR_BALANCE_CTRL_FLG( ((d_NEW_AR_BALANCE_CTRL_FLG == null) ? (String)null : d_NEW_AR_BALANCE_CTRL_FLG[0]) );
		struct.setList_d_NEW_AR_BALANCE_CTRL_FLG(TypeConverter.convert(d_NEW_AR_BALANCE_CTRL_FLG));
		struct.setd_AR_BALANCE_CTRL_FLG_CHANGE( ((d_AR_BALANCE_CTRL_FLG_CHANGE == null) ? (String)null : d_AR_BALANCE_CTRL_FLG_CHANGE[0]) );
		struct.setList_d_AR_BALANCE_CTRL_FLG_CHANGE(TypeConverter.convert(d_AR_BALANCE_CTRL_FLG_CHANGE));
		struct.setd_OLD_COLLECTION_STD_AMOUNT( ((d_OLD_COLLECTION_STD_AMOUNT == null) ? (String)null : d_OLD_COLLECTION_STD_AMOUNT[0]) );
		struct.setList_d_OLD_COLLECTION_STD_AMOUNT(TypeConverter.convert(d_OLD_COLLECTION_STD_AMOUNT));
		struct.setd_NEW_COLLECTION_STD_AMOUNT( ((d_NEW_COLLECTION_STD_AMOUNT == null) ? (String)null : d_NEW_COLLECTION_STD_AMOUNT[0]) );
		struct.setList_d_NEW_COLLECTION_STD_AMOUNT(TypeConverter.convert(d_NEW_COLLECTION_STD_AMOUNT));
		struct.setd_COLLECTION_STD_AMOUNT_CHANGE( ((d_COLLECTION_STD_AMOUNT_CHANGE == null) ? (String)null : d_COLLECTION_STD_AMOUNT_CHANGE[0]) );
		struct.setList_d_COLLECTION_STD_AMOUNT_CHANGE(TypeConverter.convert(d_COLLECTION_STD_AMOUNT_CHANGE));
		struct.setd_OLD_RM_OFFSET_TYP( ((d_OLD_RM_OFFSET_TYP == null) ? (String)null : d_OLD_RM_OFFSET_TYP[0]) );
		struct.setList_d_OLD_RM_OFFSET_TYP(TypeConverter.convert(d_OLD_RM_OFFSET_TYP));
		struct.setd_NEW_RM_OFFSET_TYP( ((d_NEW_RM_OFFSET_TYP == null) ? (String)null : d_NEW_RM_OFFSET_TYP[0]) );
		struct.setList_d_NEW_RM_OFFSET_TYP(TypeConverter.convert(d_NEW_RM_OFFSET_TYP));
		struct.setd_RM_OFFSET_TYP_CHANGE( ((d_RM_OFFSET_TYP_CHANGE == null) ? (String)null : d_RM_OFFSET_TYP_CHANGE[0]) );
		struct.setList_d_RM_OFFSET_TYP_CHANGE(TypeConverter.convert(d_RM_OFFSET_TYP_CHANGE));
		struct.setd_OLD_LINE_CUST_CD( ((d_OLD_LINE_CUST_CD == null) ? (String)null : d_OLD_LINE_CUST_CD[0]) );
		struct.setList_d_OLD_LINE_CUST_CD(TypeConverter.convert(d_OLD_LINE_CUST_CD));
		struct.setd_NEW_LINE_CUST_CD( ((d_NEW_LINE_CUST_CD == null) ? (String)null : d_NEW_LINE_CUST_CD[0]) );
		struct.setList_d_NEW_LINE_CUST_CD(TypeConverter.convert(d_NEW_LINE_CUST_CD));
		struct.setd_LINE_CUST_CD_CHANGE( ((d_LINE_CUST_CD_CHANGE == null) ? (String)null : d_LINE_CUST_CD_CHANGE[0]) );
		struct.setList_d_LINE_CUST_CD_CHANGE(TypeConverter.convert(d_LINE_CUST_CD_CHANGE));
		struct.setd_OLD_B_ACCT_CTRL_CD( ((d_OLD_B_ACCT_CTRL_CD == null) ? (String)null : d_OLD_B_ACCT_CTRL_CD[0]) );
		struct.setList_d_OLD_B_ACCT_CTRL_CD(TypeConverter.convert(d_OLD_B_ACCT_CTRL_CD));
		struct.setd_NEW_B_ACCT_CTRL_CD( ((d_NEW_B_ACCT_CTRL_CD == null) ? (String)null : d_NEW_B_ACCT_CTRL_CD[0]) );
		struct.setList_d_NEW_B_ACCT_CTRL_CD(TypeConverter.convert(d_NEW_B_ACCT_CTRL_CD));
		struct.setd_B_ACCT_CTRL_CD_CHANGE( ((d_B_ACCT_CTRL_CD_CHANGE == null) ? (String)null : d_B_ACCT_CTRL_CD_CHANGE[0]) );
		struct.setList_d_B_ACCT_CTRL_CD_CHANGE(TypeConverter.convert(d_B_ACCT_CTRL_CD_CHANGE));
		struct.setd_OLD_B_ACCT_MNG_NAME( ((d_OLD_B_ACCT_MNG_NAME == null) ? (String)null : d_OLD_B_ACCT_MNG_NAME[0]) );
		struct.setList_d_OLD_B_ACCT_MNG_NAME(TypeConverter.convert(d_OLD_B_ACCT_MNG_NAME));
		struct.setd_NEW_B_ACCT_MNG_NAME( ((d_NEW_B_ACCT_MNG_NAME == null) ? (String)null : d_NEW_B_ACCT_MNG_NAME[0]) );
		struct.setList_d_NEW_B_ACCT_MNG_NAME(TypeConverter.convert(d_NEW_B_ACCT_MNG_NAME));
		struct.setd_B_ACCT_MNG_NAME_CHANGE( ((d_B_ACCT_MNG_NAME_CHANGE == null) ? (String)null : d_B_ACCT_MNG_NAME_CHANGE[0]) );
		struct.setList_d_B_ACCT_MNG_NAME_CHANGE(TypeConverter.convert(d_B_ACCT_MNG_NAME_CHANGE));
		struct.setd_OLD_B_ACCT_NO( ((d_OLD_B_ACCT_NO == null) ? (String)null : d_OLD_B_ACCT_NO[0]) );
		struct.setList_d_OLD_B_ACCT_NO(TypeConverter.convert(d_OLD_B_ACCT_NO));
		struct.setd_NEW_B_ACCT_NO( ((d_NEW_B_ACCT_NO == null) ? (String)null : d_NEW_B_ACCT_NO[0]) );
		struct.setList_d_NEW_B_ACCT_NO(TypeConverter.convert(d_NEW_B_ACCT_NO));
		struct.setd_B_ACCT_NO_CHANGE( ((d_B_ACCT_NO_CHANGE == null) ? (String)null : d_B_ACCT_NO_CHANGE[0]) );
		struct.setList_d_B_ACCT_NO_CHANGE(TypeConverter.convert(d_B_ACCT_NO_CHANGE));
		struct.setd_OLD_INTERNAL_TRN_TYP( ((d_OLD_INTERNAL_TRN_TYP == null) ? (String)null : d_OLD_INTERNAL_TRN_TYP[0]) );
		struct.setList_d_OLD_INTERNAL_TRN_TYP(TypeConverter.convert(d_OLD_INTERNAL_TRN_TYP));
		struct.setd_NEW_INTERNAL_TRN_TYP( ((d_NEW_INTERNAL_TRN_TYP == null) ? (String)null : d_NEW_INTERNAL_TRN_TYP[0]) );
		struct.setList_d_NEW_INTERNAL_TRN_TYP(TypeConverter.convert(d_NEW_INTERNAL_TRN_TYP));
		struct.setd_INTERNAL_TRN_TYP_CHANGE( ((d_INTERNAL_TRN_TYP_CHANGE == null) ? (String)null : d_INTERNAL_TRN_TYP_CHANGE[0]) );
		struct.setList_d_INTERNAL_TRN_TYP_CHANGE(TypeConverter.convert(d_INTERNAL_TRN_TYP_CHANGE));
		struct.setd_MIN_AMOUNT_CHANGE( ((d_MIN_AMOUNT_CHANGE == null) ? (String)null : d_MIN_AMOUNT_CHANGE[0]) );
		struct.setList_d_MIN_AMOUNT_CHANGE(TypeConverter.convert(d_MIN_AMOUNT_CHANGE));
		struct.setd_OLD_ORG_CD( ((d_OLD_ORG_CD == null) ? (String)null : d_OLD_ORG_CD[0]) );
		struct.setList_d_OLD_ORG_CD(TypeConverter.convert(d_OLD_ORG_CD));
		struct.setd_NEW_ORG_CD( ((d_NEW_ORG_CD == null) ? (String)null : d_NEW_ORG_CD[0]) );
		struct.setList_d_NEW_ORG_CD(TypeConverter.convert(d_NEW_ORG_CD));
		struct.setd_ORG_CD_CHANGE( ((d_ORG_CD_CHANGE == null) ? (String)null : d_ORG_CD_CHANGE[0]) );
		struct.setList_d_ORG_CD_CHANGE(TypeConverter.convert(d_ORG_CD_CHANGE));
		struct.setd_OLD_PAY_PATTERN_NAME( ((d_OLD_PAY_PATTERN_NAME == null) ? (String)null : d_OLD_PAY_PATTERN_NAME[0]) );
		struct.setList_d_OLD_PAY_PATTERN_NAME(TypeConverter.convert(d_OLD_PAY_PATTERN_NAME));
		struct.setd_NEW_PAY_PATTERN_NAME( ((d_NEW_PAY_PATTERN_NAME == null) ? (String)null : d_NEW_PAY_PATTERN_NAME[0]) );
		struct.setList_d_NEW_PAY_PATTERN_NAME(TypeConverter.convert(d_NEW_PAY_PATTERN_NAME));
		struct.setd_PAY_PATTERN_NAME_CHANGE( ((d_PAY_PATTERN_NAME_CHANGE == null) ? (String)null : d_PAY_PATTERN_NAME_CHANGE[0]) );
		struct.setList_d_PAY_PATTERN_NAME_CHANGE(TypeConverter.convert(d_PAY_PATTERN_NAME_CHANGE));
		struct.setd_OLD_STD_AMOUNT( ((d_OLD_STD_AMOUNT == null) ? (String)null : d_OLD_STD_AMOUNT[0]) );
		struct.setList_d_OLD_STD_AMOUNT(TypeConverter.convert(d_OLD_STD_AMOUNT));
		struct.setd_NEW_STD_AMOUNT( ((d_NEW_STD_AMOUNT == null) ? (String)null : d_NEW_STD_AMOUNT[0]) );
		struct.setList_d_NEW_STD_AMOUNT(TypeConverter.convert(d_NEW_STD_AMOUNT));
		struct.setd_STD_AMOUNT_CHANGE( ((d_STD_AMOUNT_CHANGE == null) ? (String)null : d_STD_AMOUNT_CHANGE[0]) );
		struct.setList_d_STD_AMOUNT_CHANGE(TypeConverter.convert(d_STD_AMOUNT_CHANGE));
		struct.setd_OLD_RATIO_1( ((d_OLD_RATIO_1 == null) ? (String)null : d_OLD_RATIO_1[0]) );
		struct.setList_d_OLD_RATIO_1(TypeConverter.convert(d_OLD_RATIO_1));
		struct.setd_NEW_RATIO_1( ((d_NEW_RATIO_1 == null) ? (String)null : d_NEW_RATIO_1[0]) );
		struct.setList_d_NEW_RATIO_1(TypeConverter.convert(d_NEW_RATIO_1));
		struct.setd_RATIO_1_CHANGE( ((d_RATIO_1_CHANGE == null) ? (String)null : d_RATIO_1_CHANGE[0]) );
		struct.setList_d_RATIO_1_CHANGE(TypeConverter.convert(d_RATIO_1_CHANGE));
		struct.setd_OLD_RATIO_2( ((d_OLD_RATIO_2 == null) ? (String)null : d_OLD_RATIO_2[0]) );
		struct.setList_d_OLD_RATIO_2(TypeConverter.convert(d_OLD_RATIO_2));
		struct.setd_NEW_RATIO_2( ((d_NEW_RATIO_2 == null) ? (String)null : d_NEW_RATIO_2[0]) );
		struct.setList_d_NEW_RATIO_2(TypeConverter.convert(d_NEW_RATIO_2));
		struct.setd_RATIO_2_CHANGE( ((d_RATIO_2_CHANGE == null) ? (String)null : d_RATIO_2_CHANGE[0]) );
		struct.setList_d_RATIO_2_CHANGE(TypeConverter.convert(d_RATIO_2_CHANGE));
		struct.setd_OLD_PATTERN_CD( ((d_OLD_PATTERN_CD == null) ? (String)null : d_OLD_PATTERN_CD[0]) );
		struct.setList_d_OLD_PATTERN_CD(TypeConverter.convert(d_OLD_PATTERN_CD));
		struct.setd_NEW_PATTERN_CD( ((d_NEW_PATTERN_CD == null) ? (String)null : d_NEW_PATTERN_CD[0]) );
		struct.setList_d_NEW_PATTERN_CD(TypeConverter.convert(d_NEW_PATTERN_CD));
		struct.setd_PATTERN_CD_CHANGE( ((d_PATTERN_CD_CHANGE == null) ? (String)null : d_PATTERN_CD_CHANGE[0]) );
		struct.setList_d_PATTERN_CD_CHANGE(TypeConverter.convert(d_PATTERN_CD_CHANGE));
		struct.setd_OLD_CLASS_1( ((d_OLD_CLASS_1 == null) ? (String)null : d_OLD_CLASS_1[0]) );
		struct.setList_d_OLD_CLASS_1(TypeConverter.convert(d_OLD_CLASS_1));
		struct.setd_NEW_CLASS_1( ((d_NEW_CLASS_1 == null) ? (String)null : d_NEW_CLASS_1[0]) );
		struct.setList_d_NEW_CLASS_1(TypeConverter.convert(d_NEW_CLASS_1));
		struct.setd_CLASS_1_CHANGE( ((d_CLASS_1_CHANGE == null) ? (String)null : d_CLASS_1_CHANGE[0]) );
		struct.setList_d_CLASS_1_CHANGE(TypeConverter.convert(d_CLASS_1_CHANGE));
		struct.setd_OLD_CLASS_2( ((d_OLD_CLASS_2 == null) ? (String)null : d_OLD_CLASS_2[0]) );
		struct.setList_d_OLD_CLASS_2(TypeConverter.convert(d_OLD_CLASS_2));
		struct.setd_NEW_CLASS_2( ((d_NEW_CLASS_2 == null) ? (String)null : d_NEW_CLASS_2[0]) );
		struct.setList_d_NEW_CLASS_2(TypeConverter.convert(d_NEW_CLASS_2));
		struct.setd_CLASS_2_CHANGE( ((d_CLASS_2_CHANGE == null) ? (String)null : d_CLASS_2_CHANGE[0]) );
		struct.setList_d_CLASS_2_CHANGE(TypeConverter.convert(d_CLASS_2_CHANGE));
		struct.setd_OLD_CLASS_3( ((d_OLD_CLASS_3 == null) ? (String)null : d_OLD_CLASS_3[0]) );
		struct.setList_d_OLD_CLASS_3(TypeConverter.convert(d_OLD_CLASS_3));
		struct.setd_NEW_CLASS_3( ((d_NEW_CLASS_3 == null) ? (String)null : d_NEW_CLASS_3[0]) );
		struct.setList_d_NEW_CLASS_3(TypeConverter.convert(d_NEW_CLASS_3));
		struct.setd_CLASS_3_CHANGE( ((d_CLASS_3_CHANGE == null) ? (String)null : d_CLASS_3_CHANGE[0]) );
		struct.setList_d_CLASS_3_CHANGE(TypeConverter.convert(d_CLASS_3_CHANGE));
		struct.setd_OLD_AUTO_JNL_NAME( ((d_OLD_AUTO_JNL_NAME == null) ? (String)null : d_OLD_AUTO_JNL_NAME[0]) );
		struct.setList_d_OLD_AUTO_JNL_NAME(TypeConverter.convert(d_OLD_AUTO_JNL_NAME));
		struct.setd_NEW_AUTO_JNL_NAME( ((d_NEW_AUTO_JNL_NAME == null) ? (String)null : d_NEW_AUTO_JNL_NAME[0]) );
		struct.setList_d_NEW_AUTO_JNL_NAME(TypeConverter.convert(d_NEW_AUTO_JNL_NAME));
		struct.setd_AUTO_JNL_NAME_CHANGE( ((d_AUTO_JNL_NAME_CHANGE == null) ? (String)null : d_AUTO_JNL_NAME_CHANGE[0]) );
		struct.setList_d_AUTO_JNL_NAME_CHANGE(TypeConverter.convert(d_AUTO_JNL_NAME_CHANGE));
		struct.setd_OLD_DR_ACCT_CD( ((d_OLD_DR_ACCT_CD == null) ? (String)null : d_OLD_DR_ACCT_CD[0]) );
		struct.setList_d_OLD_DR_ACCT_CD(TypeConverter.convert(d_OLD_DR_ACCT_CD));
		struct.setd_NEW_DR_ACCT_CD( ((d_NEW_DR_ACCT_CD == null) ? (String)null : d_NEW_DR_ACCT_CD[0]) );
		struct.setList_d_NEW_DR_ACCT_CD(TypeConverter.convert(d_NEW_DR_ACCT_CD));
		struct.setd_DR_ACCT_CD_CHANGE( ((d_DR_ACCT_CD_CHANGE == null) ? (String)null : d_DR_ACCT_CD_CHANGE[0]) );
		struct.setList_d_DR_ACCT_CD_CHANGE(TypeConverter.convert(d_DR_ACCT_CD_CHANGE));
		struct.setd_OLD_DR_SUB_ACCT_CD( ((d_OLD_DR_SUB_ACCT_CD == null) ? (String)null : d_OLD_DR_SUB_ACCT_CD[0]) );
		struct.setList_d_OLD_DR_SUB_ACCT_CD(TypeConverter.convert(d_OLD_DR_SUB_ACCT_CD));
		struct.setd_NEW_DR_SUB_ACCT_CD( ((d_NEW_DR_SUB_ACCT_CD == null) ? (String)null : d_NEW_DR_SUB_ACCT_CD[0]) );
		struct.setList_d_NEW_DR_SUB_ACCT_CD(TypeConverter.convert(d_NEW_DR_SUB_ACCT_CD));
		struct.setd_DR_SUB_ACCT_CD_CHANGE( ((d_DR_SUB_ACCT_CD_CHANGE == null) ? (String)null : d_DR_SUB_ACCT_CD_CHANGE[0]) );
		struct.setList_d_DR_SUB_ACCT_CD_CHANGE(TypeConverter.convert(d_DR_SUB_ACCT_CD_CHANGE));
		struct.setd_OLD_DR_ORG_TYP( ((d_OLD_DR_ORG_TYP == null) ? (String)null : d_OLD_DR_ORG_TYP[0]) );
		struct.setList_d_OLD_DR_ORG_TYP(TypeConverter.convert(d_OLD_DR_ORG_TYP));
		struct.setd_NEW_DR_ORG_TYP( ((d_NEW_DR_ORG_TYP == null) ? (String)null : d_NEW_DR_ORG_TYP[0]) );
		struct.setList_d_NEW_DR_ORG_TYP(TypeConverter.convert(d_NEW_DR_ORG_TYP));
		struct.setd_DR_ORG_TYP_CHANGE( ((d_DR_ORG_TYP_CHANGE == null) ? (String)null : d_DR_ORG_TYP_CHANGE[0]) );
		struct.setList_d_DR_ORG_TYP_CHANGE(TypeConverter.convert(d_DR_ORG_TYP_CHANGE));
		struct.setd_OLD_DR_ORG_CD( ((d_OLD_DR_ORG_CD == null) ? (String)null : d_OLD_DR_ORG_CD[0]) );
		struct.setList_d_OLD_DR_ORG_CD(TypeConverter.convert(d_OLD_DR_ORG_CD));
		struct.setd_NEW_DR_ORG_CD( ((d_NEW_DR_ORG_CD == null) ? (String)null : d_NEW_DR_ORG_CD[0]) );
		struct.setList_d_NEW_DR_ORG_CD(TypeConverter.convert(d_NEW_DR_ORG_CD));
		struct.setd_DR_ORG_CD_CHANGE( ((d_DR_ORG_CD_CHANGE == null) ? (String)null : d_DR_ORG_CD_CHANGE[0]) );
		struct.setList_d_DR_ORG_CD_CHANGE(TypeConverter.convert(d_DR_ORG_CD_CHANGE));
		struct.setd_OLD_CR_ACCT_CD( ((d_OLD_CR_ACCT_CD == null) ? (String)null : d_OLD_CR_ACCT_CD[0]) );
		struct.setList_d_OLD_CR_ACCT_CD(TypeConverter.convert(d_OLD_CR_ACCT_CD));
		struct.setd_NEW_CR_ACCT_CD( ((d_NEW_CR_ACCT_CD == null) ? (String)null : d_NEW_CR_ACCT_CD[0]) );
		struct.setList_d_NEW_CR_ACCT_CD(TypeConverter.convert(d_NEW_CR_ACCT_CD));
		struct.setd_CR_ACCT_CD_CHANGE( ((d_CR_ACCT_CD_CHANGE == null) ? (String)null : d_CR_ACCT_CD_CHANGE[0]) );
		struct.setList_d_CR_ACCT_CD_CHANGE(TypeConverter.convert(d_CR_ACCT_CD_CHANGE));
		struct.setd_OLD_CR_SUB_ACCT_CD( ((d_OLD_CR_SUB_ACCT_CD == null) ? (String)null : d_OLD_CR_SUB_ACCT_CD[0]) );
		struct.setList_d_OLD_CR_SUB_ACCT_CD(TypeConverter.convert(d_OLD_CR_SUB_ACCT_CD));
		struct.setd_NEW_CR_SUB_ACCT_CD( ((d_NEW_CR_SUB_ACCT_CD == null) ? (String)null : d_NEW_CR_SUB_ACCT_CD[0]) );
		struct.setList_d_NEW_CR_SUB_ACCT_CD(TypeConverter.convert(d_NEW_CR_SUB_ACCT_CD));
		struct.setd_CR_SUB_ACCT_CD_CHANGE( ((d_CR_SUB_ACCT_CD_CHANGE == null) ? (String)null : d_CR_SUB_ACCT_CD_CHANGE[0]) );
		struct.setList_d_CR_SUB_ACCT_CD_CHANGE(TypeConverter.convert(d_CR_SUB_ACCT_CD_CHANGE));
		struct.setd_OLD_CR_ORG_TYP( ((d_OLD_CR_ORG_TYP == null) ? (String)null : d_OLD_CR_ORG_TYP[0]) );
		struct.setList_d_OLD_CR_ORG_TYP(TypeConverter.convert(d_OLD_CR_ORG_TYP));
		struct.setd_NEW_CR_ORG_TYP( ((d_NEW_CR_ORG_TYP == null) ? (String)null : d_NEW_CR_ORG_TYP[0]) );
		struct.setList_d_NEW_CR_ORG_TYP(TypeConverter.convert(d_NEW_CR_ORG_TYP));
		struct.setd_CR_ORG_TYP_CHANGE( ((d_CR_ORG_TYP_CHANGE == null) ? (String)null : d_CR_ORG_TYP_CHANGE[0]) );
		struct.setList_d_CR_ORG_TYP_CHANGE(TypeConverter.convert(d_CR_ORG_TYP_CHANGE));
		struct.setd_OLD_CR_ORG_CD( ((d_OLD_CR_ORG_CD == null) ? (String)null : d_OLD_CR_ORG_CD[0]) );
		struct.setList_d_OLD_CR_ORG_CD(TypeConverter.convert(d_OLD_CR_ORG_CD));
		struct.setd_NEW_CR_ORG_CD( ((d_NEW_CR_ORG_CD == null) ? (String)null : d_NEW_CR_ORG_CD[0]) );
		struct.setList_d_NEW_CR_ORG_CD(TypeConverter.convert(d_NEW_CR_ORG_CD));
		struct.setd_CR_ORG_CD_CHANGE( ((d_CR_ORG_CD_CHANGE == null) ? (String)null : d_CR_ORG_CD_CHANGE[0]) );
		struct.setList_d_CR_ORG_CD_CHANGE(TypeConverter.convert(d_CR_ORG_CD_CHANGE));
		struct.setd_OLD_ACCT_SLIP_NUM( ((d_OLD_ACCT_SLIP_NUM == null) ? (String)null : d_OLD_ACCT_SLIP_NUM[0]) );
		struct.setList_d_OLD_ACCT_SLIP_NUM(TypeConverter.convert(d_OLD_ACCT_SLIP_NUM));
		struct.setd_NEW_ACCT_SLIP_NUM( ((d_NEW_ACCT_SLIP_NUM == null) ? (String)null : d_NEW_ACCT_SLIP_NUM[0]) );
		struct.setList_d_NEW_ACCT_SLIP_NUM(TypeConverter.convert(d_NEW_ACCT_SLIP_NUM));
		struct.setd_ACCT_SLIP_NUM_CHANGE( ((d_ACCT_SLIP_NUM_CHANGE == null) ? (String)null : d_ACCT_SLIP_NUM_CHANGE[0]) );
		struct.setList_d_ACCT_SLIP_NUM_CHANGE(TypeConverter.convert(d_ACCT_SLIP_NUM_CHANGE));
		struct.setd_OLD_ACCT_JNL_PATTERN_CD( ((d_OLD_ACCT_JNL_PATTERN_CD == null) ? (String)null : d_OLD_ACCT_JNL_PATTERN_CD[0]) );
		struct.setList_d_OLD_ACCT_JNL_PATTERN_CD(TypeConverter.convert(d_OLD_ACCT_JNL_PATTERN_CD));
		struct.setd_NEW_ACCT_JNL_PATTERN_CD( ((d_NEW_ACCT_JNL_PATTERN_CD == null) ? (String)null : d_NEW_ACCT_JNL_PATTERN_CD[0]) );
		struct.setList_d_NEW_ACCT_JNL_PATTERN_CD(TypeConverter.convert(d_NEW_ACCT_JNL_PATTERN_CD));
		struct.setd_ACCT_JNL_PATTERN_CD_CHANGE( ((d_ACCT_JNL_PATTERN_CD_CHANGE == null) ? (String)null : d_ACCT_JNL_PATTERN_CD_CHANGE[0]) );
		struct.setList_d_ACCT_JNL_PATTERN_CD_CHANGE(TypeConverter.convert(d_ACCT_JNL_PATTERN_CD_CHANGE));
		struct.setd_OLD_CAL_NO( ((d_OLD_CAL_NO == null) ? (String)null : d_OLD_CAL_NO[0]) );
		struct.setList_d_OLD_CAL_NO(TypeConverter.convert(d_OLD_CAL_NO));
		struct.setd_NEW_CAL_NO( ((d_NEW_CAL_NO == null) ? (String)null : d_NEW_CAL_NO[0]) );
		struct.setList_d_NEW_CAL_NO(TypeConverter.convert(d_NEW_CAL_NO));
		struct.setd_CAL_NO_CHANGE( ((d_CAL_NO_CHANGE == null) ? (String)null : d_CAL_NO_CHANGE[0]) );
		struct.setList_d_CAL_NO_CHANGE(TypeConverter.convert(d_CAL_NO_CHANGE));
		struct.setd_OLD_BANK_BR_NAME( ((d_OLD_BANK_BR_NAME == null) ? (String)null : d_OLD_BANK_BR_NAME[0]) );
		struct.setList_d_OLD_BANK_BR_NAME(TypeConverter.convert(d_OLD_BANK_BR_NAME));
		struct.setd_NEW_BANK_BR_NAME( ((d_NEW_BANK_BR_NAME == null) ? (String)null : d_NEW_BANK_BR_NAME[0]) );
		struct.setList_d_NEW_BANK_BR_NAME(TypeConverter.convert(d_NEW_BANK_BR_NAME));
		struct.setd_BANK_BR_NAME_CHANGE( ((d_BANK_BR_NAME_CHANGE == null) ? (String)null : d_BANK_BR_NAME_CHANGE[0]) );
		struct.setList_d_BANK_BR_NAME_CHANGE(TypeConverter.convert(d_BANK_BR_NAME_CHANGE));
		struct.setd_OLD_BANK_BR_ANAME( ((d_OLD_BANK_BR_ANAME == null) ? (String)null : d_OLD_BANK_BR_ANAME[0]) );
		struct.setList_d_OLD_BANK_BR_ANAME(TypeConverter.convert(d_OLD_BANK_BR_ANAME));
		struct.setd_NEW_BANK_BR_ANAME( ((d_NEW_BANK_BR_ANAME == null) ? (String)null : d_NEW_BANK_BR_ANAME[0]) );
		struct.setList_d_NEW_BANK_BR_ANAME(TypeConverter.convert(d_NEW_BANK_BR_ANAME));
		struct.setd_BANK_BR_ANAME_CHANGE( ((d_BANK_BR_ANAME_CHANGE == null) ? (String)null : d_BANK_BR_ANAME_CHANGE[0]) );
		struct.setList_d_BANK_BR_ANAME_CHANGE(TypeConverter.convert(d_BANK_BR_ANAME_CHANGE));
		struct.setd_OLD_BANK_BR_KNAME( ((d_OLD_BANK_BR_KNAME == null) ? (String)null : d_OLD_BANK_BR_KNAME[0]) );
		struct.setList_d_OLD_BANK_BR_KNAME(TypeConverter.convert(d_OLD_BANK_BR_KNAME));
		struct.setd_NEW_BANK_BR_KNAME( ((d_NEW_BANK_BR_KNAME == null) ? (String)null : d_NEW_BANK_BR_KNAME[0]) );
		struct.setList_d_NEW_BANK_BR_KNAME(TypeConverter.convert(d_NEW_BANK_BR_KNAME));
		struct.setd_BANK_BR_KNAME_CHANGE( ((d_BANK_BR_KNAME_CHANGE == null) ? (String)null : d_BANK_BR_KNAME_CHANGE[0]) );
		struct.setList_d_BANK_BR_KNAME_CHANGE(TypeConverter.convert(d_BANK_BR_KNAME_CHANGE));
		struct.setd_OLD_BANK_BR_ENAME( ((d_OLD_BANK_BR_ENAME == null) ? (String)null : d_OLD_BANK_BR_ENAME[0]) );
		struct.setList_d_OLD_BANK_BR_ENAME(TypeConverter.convert(d_OLD_BANK_BR_ENAME));
		struct.setd_NEW_BANK_BR_ENAME( ((d_NEW_BANK_BR_ENAME == null) ? (String)null : d_NEW_BANK_BR_ENAME[0]) );
		struct.setList_d_NEW_BANK_BR_ENAME(TypeConverter.convert(d_NEW_BANK_BR_ENAME));
		struct.setd_BANK_BR_ENAME_CHANGE( ((d_BANK_BR_ENAME_CHANGE == null) ? (String)null : d_BANK_BR_ENAME_CHANGE[0]) );
		struct.setList_d_BANK_BR_ENAME_CHANGE(TypeConverter.convert(d_BANK_BR_ENAME_CHANGE));
		struct.setd_OLD_BANK_BR_FB_NAME( ((d_OLD_BANK_BR_FB_NAME == null) ? (String)null : d_OLD_BANK_BR_FB_NAME[0]) );
		struct.setList_d_OLD_BANK_BR_FB_NAME(TypeConverter.convert(d_OLD_BANK_BR_FB_NAME));
		struct.setd_NEW_BANK_BR_FB_NAME( ((d_NEW_BANK_BR_FB_NAME == null) ? (String)null : d_NEW_BANK_BR_FB_NAME[0]) );
		struct.setList_d_NEW_BANK_BR_FB_NAME(TypeConverter.convert(d_NEW_BANK_BR_FB_NAME));
		struct.setd_BANK_BR_FB_NAME_CHANGE( ((d_BANK_BR_FB_NAME_CHANGE == null) ? (String)null : d_BANK_BR_FB_NAME_CHANGE[0]) );
		struct.setList_d_BANK_BR_FB_NAME_CHANGE(TypeConverter.convert(d_BANK_BR_FB_NAME_CHANGE));
		struct.setd_OLD_BANK_BR_CNAME( ((d_OLD_BANK_BR_CNAME == null) ? (String)null : d_OLD_BANK_BR_CNAME[0]) );
		struct.setList_d_OLD_BANK_BR_CNAME(TypeConverter.convert(d_OLD_BANK_BR_CNAME));
		struct.setd_NEW_BANK_BR_CNAME( ((d_NEW_BANK_BR_CNAME == null) ? (String)null : d_NEW_BANK_BR_CNAME[0]) );
		struct.setList_d_NEW_BANK_BR_CNAME(TypeConverter.convert(d_NEW_BANK_BR_CNAME));
		struct.setd_BANK_BR_CNAME_CHANGE( ((d_BANK_BR_CNAME_CHANGE == null) ? (String)null : d_BANK_BR_CNAME_CHANGE[0]) );
		struct.setList_d_BANK_BR_CNAME_CHANGE(TypeConverter.convert(d_BANK_BR_CNAME_CHANGE));
		struct.setd_OLD_BANK_BR_ECNAME( ((d_OLD_BANK_BR_ECNAME == null) ? (String)null : d_OLD_BANK_BR_ECNAME[0]) );
		struct.setList_d_OLD_BANK_BR_ECNAME(TypeConverter.convert(d_OLD_BANK_BR_ECNAME));
		struct.setd_NEW_BANK_BR_ECNAME( ((d_NEW_BANK_BR_ECNAME == null) ? (String)null : d_NEW_BANK_BR_ECNAME[0]) );
		struct.setList_d_NEW_BANK_BR_ECNAME(TypeConverter.convert(d_NEW_BANK_BR_ECNAME));
		struct.setd_BANK_BR_ECNAME_CHANGE( ((d_BANK_BR_ECNAME_CHANGE == null) ? (String)null : d_BANK_BR_ECNAME_CHANGE[0]) );
		struct.setList_d_BANK_BR_ECNAME_CHANGE(TypeConverter.convert(d_BANK_BR_ECNAME_CHANGE));
		struct.setd_OLD_BRANCH_CD( ((d_OLD_BRANCH_CD == null) ? (String)null : d_OLD_BRANCH_CD[0]) );
		struct.setList_d_OLD_BRANCH_CD(TypeConverter.convert(d_OLD_BRANCH_CD));
		struct.setd_NEW_BRANCH_CD( ((d_NEW_BRANCH_CD == null) ? (String)null : d_NEW_BRANCH_CD[0]) );
		struct.setList_d_NEW_BRANCH_CD(TypeConverter.convert(d_NEW_BRANCH_CD));
		struct.setd_BRANCH_CD_CHANGE( ((d_BRANCH_CD_CHANGE == null) ? (String)null : d_BRANCH_CD_CHANGE[0]) );
		struct.setList_d_BRANCH_CD_CHANGE(TypeConverter.convert(d_BRANCH_CD_CHANGE));
		struct.setd_OLD_BRANCH_FNAME( ((d_OLD_BRANCH_FNAME == null) ? (String)null : d_OLD_BRANCH_FNAME[0]) );
		struct.setList_d_OLD_BRANCH_FNAME(TypeConverter.convert(d_OLD_BRANCH_FNAME));
		struct.setd_NEW_BRANCH_FNAME( ((d_NEW_BRANCH_FNAME == null) ? (String)null : d_NEW_BRANCH_FNAME[0]) );
		struct.setList_d_NEW_BRANCH_FNAME(TypeConverter.convert(d_NEW_BRANCH_FNAME));
		struct.setd_BRANCH_FNAME_CHANGE( ((d_BRANCH_FNAME_CHANGE == null) ? (String)null : d_BRANCH_FNAME_CHANGE[0]) );
		struct.setList_d_BRANCH_FNAME_CHANGE(TypeConverter.convert(d_BRANCH_FNAME_CHANGE));
		struct.setd_OLD_BRANCH_NAME( ((d_OLD_BRANCH_NAME == null) ? (String)null : d_OLD_BRANCH_NAME[0]) );
		struct.setList_d_OLD_BRANCH_NAME(TypeConverter.convert(d_OLD_BRANCH_NAME));
		struct.setd_NEW_BRANCH_NAME( ((d_NEW_BRANCH_NAME == null) ? (String)null : d_NEW_BRANCH_NAME[0]) );
		struct.setList_d_NEW_BRANCH_NAME(TypeConverter.convert(d_NEW_BRANCH_NAME));
		struct.setd_BRANCH_NAME_CHANGE( ((d_BRANCH_NAME_CHANGE == null) ? (String)null : d_BRANCH_NAME_CHANGE[0]) );
		struct.setList_d_BRANCH_NAME_CHANGE(TypeConverter.convert(d_BRANCH_NAME_CHANGE));
		struct.setd_OLD_BRANCH_KNAME( ((d_OLD_BRANCH_KNAME == null) ? (String)null : d_OLD_BRANCH_KNAME[0]) );
		struct.setList_d_OLD_BRANCH_KNAME(TypeConverter.convert(d_OLD_BRANCH_KNAME));
		struct.setd_NEW_BRANCH_KNAME( ((d_NEW_BRANCH_KNAME == null) ? (String)null : d_NEW_BRANCH_KNAME[0]) );
		struct.setList_d_NEW_BRANCH_KNAME(TypeConverter.convert(d_NEW_BRANCH_KNAME));
		struct.setd_BRANCH_KNAME_CHANGE( ((d_BRANCH_KNAME_CHANGE == null) ? (String)null : d_BRANCH_KNAME_CHANGE[0]) );
		struct.setList_d_BRANCH_KNAME_CHANGE(TypeConverter.convert(d_BRANCH_KNAME_CHANGE));
		struct.setd_OLD_BRANCH_ENAME( ((d_OLD_BRANCH_ENAME == null) ? (String)null : d_OLD_BRANCH_ENAME[0]) );
		struct.setList_d_OLD_BRANCH_ENAME(TypeConverter.convert(d_OLD_BRANCH_ENAME));
		struct.setd_NEW_BRANCH_ENAME( ((d_NEW_BRANCH_ENAME == null) ? (String)null : d_NEW_BRANCH_ENAME[0]) );
		struct.setList_d_NEW_BRANCH_ENAME(TypeConverter.convert(d_NEW_BRANCH_ENAME));
		struct.setd_BRANCH_ENAME_CHANGE( ((d_BRANCH_ENAME_CHANGE == null) ? (String)null : d_BRANCH_ENAME_CHANGE[0]) );
		struct.setList_d_BRANCH_ENAME_CHANGE(TypeConverter.convert(d_BRANCH_ENAME_CHANGE));
		struct.setd_OLD_BRANCH_SEQ_CD( ((d_OLD_BRANCH_SEQ_CD == null) ? (String)null : d_OLD_BRANCH_SEQ_CD[0]) );
		struct.setList_d_OLD_BRANCH_SEQ_CD(TypeConverter.convert(d_OLD_BRANCH_SEQ_CD));
		struct.setd_NEW_BRANCH_SEQ_CD( ((d_NEW_BRANCH_SEQ_CD == null) ? (String)null : d_NEW_BRANCH_SEQ_CD[0]) );
		struct.setList_d_NEW_BRANCH_SEQ_CD(TypeConverter.convert(d_NEW_BRANCH_SEQ_CD));
		struct.setd_BRANCH_SEQ_CD_CHANGE( ((d_BRANCH_SEQ_CD_CHANGE == null) ? (String)null : d_BRANCH_SEQ_CD_CHANGE[0]) );
		struct.setList_d_BRANCH_SEQ_CD_CHANGE(TypeConverter.convert(d_BRANCH_SEQ_CD_CHANGE));
		struct.setd_OLD_CHARGE_ORG_NAME( ((d_OLD_CHARGE_ORG_NAME == null) ? (String)null : d_OLD_CHARGE_ORG_NAME[0]) );
		struct.setList_d_OLD_CHARGE_ORG_NAME(TypeConverter.convert(d_OLD_CHARGE_ORG_NAME));
		struct.setd_NEW_CHARGE_ORG_NAME( ((d_NEW_CHARGE_ORG_NAME == null) ? (String)null : d_NEW_CHARGE_ORG_NAME[0]) );
		struct.setList_d_NEW_CHARGE_ORG_NAME(TypeConverter.convert(d_NEW_CHARGE_ORG_NAME));
		struct.setd_CHARGE_ORG_NAME_CHANGE( ((d_CHARGE_ORG_NAME_CHANGE == null) ? (String)null : d_CHARGE_ORG_NAME_CHANGE[0]) );
		struct.setList_d_CHARGE_ORG_NAME_CHANGE(TypeConverter.convert(d_CHARGE_ORG_NAME_CHANGE));
		struct.setd_OLD_CHARGE_PERSON_NAME( ((d_OLD_CHARGE_PERSON_NAME == null) ? (String)null : d_OLD_CHARGE_PERSON_NAME[0]) );
		struct.setList_d_OLD_CHARGE_PERSON_NAME(TypeConverter.convert(d_OLD_CHARGE_PERSON_NAME));
		struct.setd_NEW_CHARGE_PERSON_NAME( ((d_NEW_CHARGE_PERSON_NAME == null) ? (String)null : d_NEW_CHARGE_PERSON_NAME[0]) );
		struct.setList_d_NEW_CHARGE_PERSON_NAME(TypeConverter.convert(d_NEW_CHARGE_PERSON_NAME));
		struct.setd_CHARGE_PERSON_NAME_CHANGE( ((d_CHARGE_PERSON_NAME_CHANGE == null) ? (String)null : d_CHARGE_PERSON_NAME_CHANGE[0]) );
		struct.setList_d_CHARGE_PERSON_NAME_CHANGE(TypeConverter.convert(d_CHARGE_PERSON_NAME_CHANGE));
		struct.setd_OLD_EDI_OWN_VEND_CD( ((d_OLD_EDI_OWN_VEND_CD == null) ? (String)null : d_OLD_EDI_OWN_VEND_CD[0]) );
		struct.setList_d_OLD_EDI_OWN_VEND_CD(TypeConverter.convert(d_OLD_EDI_OWN_VEND_CD));
		struct.setd_NEW_EDI_OWN_VEND_CD( ((d_NEW_EDI_OWN_VEND_CD == null) ? (String)null : d_NEW_EDI_OWN_VEND_CD[0]) );
		struct.setList_d_NEW_EDI_OWN_VEND_CD(TypeConverter.convert(d_NEW_EDI_OWN_VEND_CD));
		struct.setd_EDI_OWN_VEND_CD_CHANGE( ((d_EDI_OWN_VEND_CD_CHANGE == null) ? (String)null : d_EDI_OWN_VEND_CD_CHANGE[0]) );
		struct.setList_d_EDI_OWN_VEND_CD_CHANGE(TypeConverter.convert(d_EDI_OWN_VEND_CD_CHANGE));
		struct.setd_OLD_REMARKS_1( ((d_OLD_REMARKS_1 == null) ? (String)null : d_OLD_REMARKS_1[0]) );
		struct.setList_d_OLD_REMARKS_1(TypeConverter.convert(d_OLD_REMARKS_1));
		struct.setd_NEW_REMARKS_1( ((d_NEW_REMARKS_1 == null) ? (String)null : d_NEW_REMARKS_1[0]) );
		struct.setList_d_NEW_REMARKS_1(TypeConverter.convert(d_NEW_REMARKS_1));
		struct.setd_REMARKS_1_CHANGE( ((d_REMARKS_1_CHANGE == null) ? (String)null : d_REMARKS_1_CHANGE[0]) );
		struct.setList_d_REMARKS_1_CHANGE(TypeConverter.convert(d_REMARKS_1_CHANGE));
		struct.setd_OLD_REMARKS_2( ((d_OLD_REMARKS_2 == null) ? (String)null : d_OLD_REMARKS_2[0]) );
		struct.setList_d_OLD_REMARKS_2(TypeConverter.convert(d_OLD_REMARKS_2));
		struct.setd_NEW_REMARKS_2( ((d_NEW_REMARKS_2 == null) ? (String)null : d_NEW_REMARKS_2[0]) );
		struct.setList_d_NEW_REMARKS_2(TypeConverter.convert(d_NEW_REMARKS_2));
		struct.setd_REMARKS_2_CHANGE( ((d_REMARKS_2_CHANGE == null) ? (String)null : d_REMARKS_2_CHANGE[0]) );
		struct.setList_d_REMARKS_2_CHANGE(TypeConverter.convert(d_REMARKS_2_CHANGE));
		struct.setd_OLD_REMARKS_3( ((d_OLD_REMARKS_3 == null) ? (String)null : d_OLD_REMARKS_3[0]) );
		struct.setList_d_OLD_REMARKS_3(TypeConverter.convert(d_OLD_REMARKS_3));
		struct.setd_NEW_REMARKS_3( ((d_NEW_REMARKS_3 == null) ? (String)null : d_NEW_REMARKS_3[0]) );
		struct.setList_d_NEW_REMARKS_3(TypeConverter.convert(d_NEW_REMARKS_3));
		struct.setd_REMARKS_3_CHANGE( ((d_REMARKS_3_CHANGE == null) ? (String)null : d_REMARKS_3_CHANGE[0]) );
		struct.setList_d_REMARKS_3_CHANGE(TypeConverter.convert(d_REMARKS_3_CHANGE));
		struct.setd_OLD_DETAIL_ROUND_TYP( ((d_OLD_DETAIL_ROUND_TYP == null) ? (String)null : d_OLD_DETAIL_ROUND_TYP[0]) );
		struct.setList_d_OLD_DETAIL_ROUND_TYP(TypeConverter.convert(d_OLD_DETAIL_ROUND_TYP));
		struct.setd_NEW_DETAIL_ROUND_TYP( ((d_NEW_DETAIL_ROUND_TYP == null) ? (String)null : d_NEW_DETAIL_ROUND_TYP[0]) );
		struct.setList_d_NEW_DETAIL_ROUND_TYP(TypeConverter.convert(d_NEW_DETAIL_ROUND_TYP));
		struct.setd_DETAIL_ROUND_TYP_CHANGE( ((d_DETAIL_ROUND_TYP_CHANGE == null) ? (String)null : d_DETAIL_ROUND_TYP_CHANGE[0]) );
		struct.setList_d_DETAIL_ROUND_TYP_CHANGE(TypeConverter.convert(d_DETAIL_ROUND_TYP_CHANGE));
		struct.setd_OLD_SECTION_CD( ((d_OLD_SECTION_CD == null) ? (String)null : d_OLD_SECTION_CD[0]) );
		struct.setList_d_OLD_SECTION_CD(TypeConverter.convert(d_OLD_SECTION_CD));
		struct.setd_NEW_SECTION_CD( ((d_NEW_SECTION_CD == null) ? (String)null : d_NEW_SECTION_CD[0]) );
		struct.setList_d_NEW_SECTION_CD(TypeConverter.convert(d_NEW_SECTION_CD));
		struct.setd_SECTION_CD_CHANGE( ((d_SECTION_CD_CHANGE == null) ? (String)null : d_SECTION_CD_CHANGE[0]) );
		struct.setList_d_SECTION_CD_CHANGE(TypeConverter.convert(d_SECTION_CD_CHANGE));
		struct.setl_STATUS_NAME( ((l_STATUS_NAME == null) ? (String)null : l_STATUS_NAME[0]) );
		struct.setList_l_STATUS_NAME(TypeConverter.convert(l_STATUS_NAME));
		struct.setd_OLD_PURPOSE_UNIT_PRICE_TYP( ((d_OLD_PURPOSE_UNIT_PRICE_TYP == null) ? (String)null : d_OLD_PURPOSE_UNIT_PRICE_TYP[0]) );
		struct.setList_d_OLD_PURPOSE_UNIT_PRICE_TYP(TypeConverter.convert(d_OLD_PURPOSE_UNIT_PRICE_TYP));
		struct.setd_NEW_PURPOSE_UNIT_PRICE_TYP( ((d_NEW_PURPOSE_UNIT_PRICE_TYP == null) ? (String)null : d_NEW_PURPOSE_UNIT_PRICE_TYP[0]) );
		struct.setList_d_NEW_PURPOSE_UNIT_PRICE_TYP(TypeConverter.convert(d_NEW_PURPOSE_UNIT_PRICE_TYP));
		struct.setd_PURPOSE_UNIT_PRICE_TYP_CHANGE( ((d_PURPOSE_UNIT_PRICE_TYP_CHANGE == null) ? (String)null : d_PURPOSE_UNIT_PRICE_TYP_CHANGE[0]) );
		struct.setList_d_PURPOSE_UNIT_PRICE_TYP_CHANGE(TypeConverter.convert(d_PURPOSE_UNIT_PRICE_TYP_CHANGE));
		struct.setd_OLD_SALES_UNIT_SIZE( ((d_OLD_SALES_UNIT_SIZE == null) ? (String)null : d_OLD_SALES_UNIT_SIZE[0]) );
		struct.setList_d_OLD_SALES_UNIT_SIZE(TypeConverter.convert(d_OLD_SALES_UNIT_SIZE));
		struct.setd_NEW_SALES_UNIT_SIZE( ((d_NEW_SALES_UNIT_SIZE == null) ? (String)null : d_NEW_SALES_UNIT_SIZE[0]) );
		struct.setList_d_NEW_SALES_UNIT_SIZE(TypeConverter.convert(d_NEW_SALES_UNIT_SIZE));
		struct.setd_SALES_UNIT_SIZE_CHANGE( ((d_SALES_UNIT_SIZE_CHANGE == null) ? (String)null : d_SALES_UNIT_SIZE_CHANGE[0]) );
		struct.setList_d_SALES_UNIT_SIZE_CHANGE(TypeConverter.convert(d_SALES_UNIT_SIZE_CHANGE));
		struct.setd_OLD_SALES_UNIT_COST( ((d_OLD_SALES_UNIT_COST == null) ? (String)null : d_OLD_SALES_UNIT_COST[0]) );
		struct.setList_d_OLD_SALES_UNIT_COST(TypeConverter.convert(d_OLD_SALES_UNIT_COST));
		struct.setd_NEW_SALES_UNIT_COST( ((d_NEW_SALES_UNIT_COST == null) ? (String)null : d_NEW_SALES_UNIT_COST[0]) );
		struct.setList_d_NEW_SALES_UNIT_COST(TypeConverter.convert(d_NEW_SALES_UNIT_COST));
		struct.setd_SALES_UNIT_COST_CHANGE( ((d_SALES_UNIT_COST_CHANGE == null) ? (String)null : d_SALES_UNIT_COST_CHANGE[0]) );
		struct.setList_d_SALES_UNIT_COST_CHANGE(TypeConverter.convert(d_SALES_UNIT_COST_CHANGE));
		struct.setd_OLD_CUST_GRP_CD( ((d_OLD_CUST_GRP_CD == null) ? (String)null : d_OLD_CUST_GRP_CD[0]) );
		struct.setList_d_OLD_CUST_GRP_CD(TypeConverter.convert(d_OLD_CUST_GRP_CD));
		struct.setd_NEW_CUST_GRP_CD( ((d_NEW_CUST_GRP_CD == null) ? (String)null : d_NEW_CUST_GRP_CD[0]) );
		struct.setList_d_NEW_CUST_GRP_CD(TypeConverter.convert(d_NEW_CUST_GRP_CD));
		struct.setd_CUST_GRP_CD_CHANGE( ((d_CUST_GRP_CD_CHANGE == null) ? (String)null : d_CUST_GRP_CD_CHANGE[0]) );
		struct.setList_d_CUST_GRP_CD_CHANGE(TypeConverter.convert(d_CUST_GRP_CD_CHANGE));
		struct.setd_OLD_CNCNTRT_DLV_LOC_CD( ((d_OLD_CNCNTRT_DLV_LOC_CD == null) ? (String)null : d_OLD_CNCNTRT_DLV_LOC_CD[0]) );
		struct.setList_d_OLD_CNCNTRT_DLV_LOC_CD(TypeConverter.convert(d_OLD_CNCNTRT_DLV_LOC_CD));
		struct.setd_NEW_CNCNTRT_DLV_LOC_CD( ((d_NEW_CNCNTRT_DLV_LOC_CD == null) ? (String)null : d_NEW_CNCNTRT_DLV_LOC_CD[0]) );
		struct.setList_d_NEW_CNCNTRT_DLV_LOC_CD(TypeConverter.convert(d_NEW_CNCNTRT_DLV_LOC_CD));
		struct.setd_CNCNTRT_DLV_LOC_CD_CHANGE( ((d_CNCNTRT_DLV_LOC_CD_CHANGE == null) ? (String)null : d_CNCNTRT_DLV_LOC_CD_CHANGE[0]) );
		struct.setList_d_CNCNTRT_DLV_LOC_CD_CHANGE(TypeConverter.convert(d_CNCNTRT_DLV_LOC_CD_CHANGE));
		struct.setd_OLD_SHIP_CTL_TYP( ((d_OLD_SHIP_CTL_TYP == null) ? (String)null : d_OLD_SHIP_CTL_TYP[0]) );
		struct.setList_d_OLD_SHIP_CTL_TYP(TypeConverter.convert(d_OLD_SHIP_CTL_TYP));
		struct.setd_NEW_SHIP_CTL_TYP( ((d_NEW_SHIP_CTL_TYP == null) ? (String)null : d_NEW_SHIP_CTL_TYP[0]) );
		struct.setList_d_NEW_SHIP_CTL_TYP(TypeConverter.convert(d_NEW_SHIP_CTL_TYP));
		struct.setd_SHIP_CTL_TYP_CHANGE( ((d_SHIP_CTL_TYP_CHANGE == null) ? (String)null : d_SHIP_CTL_TYP_CHANGE[0]) );
		struct.setList_d_SHIP_CTL_TYP_CHANGE(TypeConverter.convert(d_SHIP_CTL_TYP_CHANGE));
		struct.setd_OLD_DLV_SLIP_ISS_FLG( ((d_OLD_DLV_SLIP_ISS_FLG == null) ? (String)null : d_OLD_DLV_SLIP_ISS_FLG[0]) );
		struct.setList_d_OLD_DLV_SLIP_ISS_FLG(TypeConverter.convert(d_OLD_DLV_SLIP_ISS_FLG));
		struct.setd_NEW_DLV_SLIP_ISS_FLG( ((d_NEW_DLV_SLIP_ISS_FLG == null) ? (String)null : d_NEW_DLV_SLIP_ISS_FLG[0]) );
		struct.setList_d_NEW_DLV_SLIP_ISS_FLG(TypeConverter.convert(d_NEW_DLV_SLIP_ISS_FLG));
		struct.setd_DLV_SLIP_ISS_FLG_CHANGE( ((d_DLV_SLIP_ISS_FLG_CHANGE == null) ? (String)null : d_DLV_SLIP_ISS_FLG_CHANGE[0]) );
		struct.setList_d_DLV_SLIP_ISS_FLG_CHANGE(TypeConverter.convert(d_DLV_SLIP_ISS_FLG_CHANGE));
		struct.setd_OLD_IDENT_CARD_F_ISS_TYP( ((d_OLD_IDENT_CARD_F_ISS_TYP == null) ? (String)null : d_OLD_IDENT_CARD_F_ISS_TYP[0]) );
		struct.setList_d_OLD_IDENT_CARD_F_ISS_TYP(TypeConverter.convert(d_OLD_IDENT_CARD_F_ISS_TYP));
		struct.setd_NEW_IDENT_CARD_F_ISS_TYP( ((d_NEW_IDENT_CARD_F_ISS_TYP == null) ? (String)null : d_NEW_IDENT_CARD_F_ISS_TYP[0]) );
		struct.setList_d_NEW_IDENT_CARD_F_ISS_TYP(TypeConverter.convert(d_NEW_IDENT_CARD_F_ISS_TYP));
		struct.setd_IDENT_CARD_F_ISS_TYP_CHANGE( ((d_IDENT_CARD_F_ISS_TYP_CHANGE == null) ? (String)null : d_IDENT_CARD_F_ISS_TYP_CHANGE[0]) );
		struct.setList_d_IDENT_CARD_F_ISS_TYP_CHANGE(TypeConverter.convert(d_IDENT_CARD_F_ISS_TYP_CHANGE));
		struct.setd_OLD_IDENT_CARD_F_FORMAT_TYP( ((d_OLD_IDENT_CARD_F_FORMAT_TYP == null) ? (String)null : d_OLD_IDENT_CARD_F_FORMAT_TYP[0]) );
		struct.setList_d_OLD_IDENT_CARD_F_FORMAT_TYP(TypeConverter.convert(d_OLD_IDENT_CARD_F_FORMAT_TYP));
		struct.setd_NEW_IDENT_CARD_F_FORMAT_TYP( ((d_NEW_IDENT_CARD_F_FORMAT_TYP == null) ? (String)null : d_NEW_IDENT_CARD_F_FORMAT_TYP[0]) );
		struct.setList_d_NEW_IDENT_CARD_F_FORMAT_TYP(TypeConverter.convert(d_NEW_IDENT_CARD_F_FORMAT_TYP));
		struct.setd_IDENT_CARD_F_FORMAT_TYP_CHANGE( ((d_IDENT_CARD_F_FORMAT_TYP_CHANGE == null) ? (String)null : d_IDENT_CARD_F_FORMAT_TYP_CHANGE[0]) );
		struct.setList_d_IDENT_CARD_F_FORMAT_TYP_CHANGE(TypeConverter.convert(d_IDENT_CARD_F_FORMAT_TYP_CHANGE));
		struct.setd_OLD_SHIP_FIX_TERM( ((d_OLD_SHIP_FIX_TERM == null) ? (String)null : d_OLD_SHIP_FIX_TERM[0]) );
		struct.setList_d_OLD_SHIP_FIX_TERM(TypeConverter.convert(d_OLD_SHIP_FIX_TERM));
		struct.setd_NEW_SHIP_FIX_TERM( ((d_NEW_SHIP_FIX_TERM == null) ? (String)null : d_NEW_SHIP_FIX_TERM[0]) );
		struct.setList_d_NEW_SHIP_FIX_TERM(TypeConverter.convert(d_NEW_SHIP_FIX_TERM));
		struct.setd_SHIP_FIX_TERM_CHANGE( ((d_SHIP_FIX_TERM_CHANGE == null) ? (String)null : d_SHIP_FIX_TERM_CHANGE[0]) );
		struct.setList_d_SHIP_FIX_TERM_CHANGE(TypeConverter.convert(d_SHIP_FIX_TERM_CHANGE));
		struct.setd_OLD_MASS_PRODUCT_TYP( ((d_OLD_MASS_PRODUCT_TYP == null) ? (String)null : d_OLD_MASS_PRODUCT_TYP[0]) );
		struct.setList_d_OLD_MASS_PRODUCT_TYP(TypeConverter.convert(d_OLD_MASS_PRODUCT_TYP));
		struct.setd_NEW_MASS_PRODUCT_TYP( ((d_NEW_MASS_PRODUCT_TYP == null) ? (String)null : d_NEW_MASS_PRODUCT_TYP[0]) );
		struct.setList_d_NEW_MASS_PRODUCT_TYP(TypeConverter.convert(d_NEW_MASS_PRODUCT_TYP));
		struct.setd_MASS_PRODUCT_TYP_CHANGE( ((d_MASS_PRODUCT_TYP_CHANGE == null) ? (String)null : d_MASS_PRODUCT_TYP_CHANGE[0]) );
		struct.setList_d_MASS_PRODUCT_TYP_CHANGE(TypeConverter.convert(d_MASS_PRODUCT_TYP_CHANGE));
		struct.setd_OLD_DECISION_REPLACE_PTN( ((d_OLD_DECISION_REPLACE_PTN == null) ? (String)null : d_OLD_DECISION_REPLACE_PTN[0]) );
		struct.setList_d_OLD_DECISION_REPLACE_PTN(TypeConverter.convert(d_OLD_DECISION_REPLACE_PTN));
		struct.setd_NEW_DECISION_REPLACE_PTN( ((d_NEW_DECISION_REPLACE_PTN == null) ? (String)null : d_NEW_DECISION_REPLACE_PTN[0]) );
		struct.setList_d_NEW_DECISION_REPLACE_PTN(TypeConverter.convert(d_NEW_DECISION_REPLACE_PTN));
		struct.setd_DECISION_REPLACE_PTN_CHANGE( ((d_DECISION_REPLACE_PTN_CHANGE == null) ? (String)null : d_DECISION_REPLACE_PTN_CHANGE[0]) );
		struct.setList_d_DECISION_REPLACE_PTN_CHANGE(TypeConverter.convert(d_DECISION_REPLACE_PTN_CHANGE));
		struct.setd_OLD_SHIP_RSLT_APPLY_TYP( ((d_OLD_SHIP_RSLT_APPLY_TYP == null) ? (String)null : d_OLD_SHIP_RSLT_APPLY_TYP[0]) );
		struct.setList_d_OLD_SHIP_RSLT_APPLY_TYP(TypeConverter.convert(d_OLD_SHIP_RSLT_APPLY_TYP));
		struct.setd_NEW_SHIP_RSLT_APPLY_TYP( ((d_NEW_SHIP_RSLT_APPLY_TYP == null) ? (String)null : d_NEW_SHIP_RSLT_APPLY_TYP[0]) );
		struct.setList_d_NEW_SHIP_RSLT_APPLY_TYP(TypeConverter.convert(d_NEW_SHIP_RSLT_APPLY_TYP));
		struct.setd_SHIP_RSLT_APPLY_TYP_CHANGE( ((d_SHIP_RSLT_APPLY_TYP_CHANGE == null) ? (String)null : d_SHIP_RSLT_APPLY_TYP_CHANGE[0]) );
		struct.setList_d_SHIP_RSLT_APPLY_TYP_CHANGE(TypeConverter.convert(d_SHIP_RSLT_APPLY_TYP_CHANGE));
		struct.setd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP( ((d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP == null) ? (String)null : d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP[0]) );
		struct.setList_d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP(TypeConverter.convert(d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP));
		struct.setd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP( ((d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP == null) ? (String)null : d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP[0]) );
		struct.setList_d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP(TypeConverter.convert(d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP));
		struct.setd_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE( ((d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE == null) ? (String)null : d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE[0]) );
		struct.setList_d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE(TypeConverter.convert(d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE));
		struct.setd_OLD_NEXT_DLV_SHIFT_EFF_FLG( ((d_OLD_NEXT_DLV_SHIFT_EFF_FLG == null) ? (String)null : d_OLD_NEXT_DLV_SHIFT_EFF_FLG[0]) );
		struct.setList_d_OLD_NEXT_DLV_SHIFT_EFF_FLG(TypeConverter.convert(d_OLD_NEXT_DLV_SHIFT_EFF_FLG));
		struct.setd_NEW_NEXT_DLV_SHIFT_EFF_FLG( ((d_NEW_NEXT_DLV_SHIFT_EFF_FLG == null) ? (String)null : d_NEW_NEXT_DLV_SHIFT_EFF_FLG[0]) );
		struct.setList_d_NEW_NEXT_DLV_SHIFT_EFF_FLG(TypeConverter.convert(d_NEW_NEXT_DLV_SHIFT_EFF_FLG));
		struct.setd_NEXT_DLV_SHIFT_EFF_FLG_CHANGE( ((d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE == null) ? (String)null : d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE[0]) );
		struct.setList_d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE(TypeConverter.convert(d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE));
		struct.setd_OLD_UNCNFM_PLAN_AVG_FLG( ((d_OLD_UNCNFM_PLAN_AVG_FLG == null) ? (String)null : d_OLD_UNCNFM_PLAN_AVG_FLG[0]) );
		struct.setList_d_OLD_UNCNFM_PLAN_AVG_FLG(TypeConverter.convert(d_OLD_UNCNFM_PLAN_AVG_FLG));
		struct.setd_NEW_UNCNFM_PLAN_AVG_FLG( ((d_NEW_UNCNFM_PLAN_AVG_FLG == null) ? (String)null : d_NEW_UNCNFM_PLAN_AVG_FLG[0]) );
		struct.setList_d_NEW_UNCNFM_PLAN_AVG_FLG(TypeConverter.convert(d_NEW_UNCNFM_PLAN_AVG_FLG));
		struct.setd_UNCNFM_PLAN_AVG_FLG_CHANGE( ((d_UNCNFM_PLAN_AVG_FLG_CHANGE == null) ? (String)null : d_UNCNFM_PLAN_AVG_FLG_CHANGE[0]) );
		struct.setList_d_UNCNFM_PLAN_AVG_FLG_CHANGE(TypeConverter.convert(d_UNCNFM_PLAN_AVG_FLG_CHANGE));
		struct.setd_OLD_CNCNTRT_TRANS_LT( ((d_OLD_CNCNTRT_TRANS_LT == null) ? (String)null : d_OLD_CNCNTRT_TRANS_LT[0]) );
		struct.setList_d_OLD_CNCNTRT_TRANS_LT(TypeConverter.convert(d_OLD_CNCNTRT_TRANS_LT));
		struct.setd_NEW_CNCNTRT_TRANS_LT( ((d_NEW_CNCNTRT_TRANS_LT == null) ? (String)null : d_NEW_CNCNTRT_TRANS_LT[0]) );
		struct.setList_d_NEW_CNCNTRT_TRANS_LT(TypeConverter.convert(d_NEW_CNCNTRT_TRANS_LT));
		struct.setd_CNCNTRT_TRANS_LT_CHANGE( ((d_CNCNTRT_TRANS_LT_CHANGE == null) ? (String)null : d_CNCNTRT_TRANS_LT_CHANGE[0]) );
		struct.setList_d_CNCNTRT_TRANS_LT_CHANGE(TypeConverter.convert(d_CNCNTRT_TRANS_LT_CHANGE));
		struct.setd_OLD_CUST_TRANS_LT( ((d_OLD_CUST_TRANS_LT == null) ? (String)null : d_OLD_CUST_TRANS_LT[0]) );
		struct.setList_d_OLD_CUST_TRANS_LT(TypeConverter.convert(d_OLD_CUST_TRANS_LT));
		struct.setd_NEW_CUST_TRANS_LT( ((d_NEW_CUST_TRANS_LT == null) ? (String)null : d_NEW_CUST_TRANS_LT[0]) );
		struct.setList_d_NEW_CUST_TRANS_LT(TypeConverter.convert(d_NEW_CUST_TRANS_LT));
		struct.setd_CUST_TRANS_LT_CHANGE( ((d_CUST_TRANS_LT_CHANGE == null) ? (String)null : d_CUST_TRANS_LT_CHANGE[0]) );
		struct.setList_d_CUST_TRANS_LT_CHANGE(TypeConverter.convert(d_CUST_TRANS_LT_CHANGE));
		struct.setd_OLD_CUST_DESINATED_DLV_LOC_CD( ((d_OLD_CUST_DESINATED_DLV_LOC_CD == null) ? (String)null : d_OLD_CUST_DESINATED_DLV_LOC_CD[0]) );
		struct.setList_d_OLD_CUST_DESINATED_DLV_LOC_CD(TypeConverter.convert(d_OLD_CUST_DESINATED_DLV_LOC_CD));
		struct.setd_NEW_CUST_DESINATED_DLV_LOC_CD( ((d_NEW_CUST_DESINATED_DLV_LOC_CD == null) ? (String)null : d_NEW_CUST_DESINATED_DLV_LOC_CD[0]) );
		struct.setList_d_NEW_CUST_DESINATED_DLV_LOC_CD(TypeConverter.convert(d_NEW_CUST_DESINATED_DLV_LOC_CD));
		struct.setd_CUST_DESINATED_DLV_LOC_CD_CHANGE( ((d_CUST_DESINATED_DLV_LOC_CD_CHANGE == null) ? (String)null : d_CUST_DESINATED_DLV_LOC_CD_CHANGE[0]) );
		struct.setList_d_CUST_DESINATED_DLV_LOC_CD_CHANGE(TypeConverter.convert(d_CUST_DESINATED_DLV_LOC_CD_CHANGE));
		struct.setd_OLD_DLV_LOC_OPTION_CHANGE_VALUE( ((d_OLD_DLV_LOC_OPTION_CHANGE_VALUE == null) ? (String)null : d_OLD_DLV_LOC_OPTION_CHANGE_VALUE[0]) );
		struct.setList_d_OLD_DLV_LOC_OPTION_CHANGE_VALUE(TypeConverter.convert(d_OLD_DLV_LOC_OPTION_CHANGE_VALUE));
		struct.setd_NEW_DLV_LOC_OPTION_CHANGE_VALUE( ((d_NEW_DLV_LOC_OPTION_CHANGE_VALUE == null) ? (String)null : d_NEW_DLV_LOC_OPTION_CHANGE_VALUE[0]) );
		struct.setList_d_NEW_DLV_LOC_OPTION_CHANGE_VALUE(TypeConverter.convert(d_NEW_DLV_LOC_OPTION_CHANGE_VALUE));
		struct.setd_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE( ((d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE == null) ? (String)null : d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE[0]) );
		struct.setList_d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE(TypeConverter.convert(d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE));
		struct.setd_OLD_CUST_DESINATED_DLV_LOC_NAME( ((d_OLD_CUST_DESINATED_DLV_LOC_NAME == null) ? (String)null : d_OLD_CUST_DESINATED_DLV_LOC_NAME[0]) );
		struct.setList_d_OLD_CUST_DESINATED_DLV_LOC_NAME(TypeConverter.convert(d_OLD_CUST_DESINATED_DLV_LOC_NAME));
		struct.setd_NEW_CUST_DESINATED_DLV_LOC_NAME( ((d_NEW_CUST_DESINATED_DLV_LOC_NAME == null) ? (String)null : d_NEW_CUST_DESINATED_DLV_LOC_NAME[0]) );
		struct.setList_d_NEW_CUST_DESINATED_DLV_LOC_NAME(TypeConverter.convert(d_NEW_CUST_DESINATED_DLV_LOC_NAME));
		struct.setd_CUST_DESINATED_DLV_LOC_NAME_CHANGE( ((d_CUST_DESINATED_DLV_LOC_NAME_CHANGE == null) ? (String)null : d_CUST_DESINATED_DLV_LOC_NAME_CHANGE[0]) );
		struct.setList_d_CUST_DESINATED_DLV_LOC_NAME_CHANGE(TypeConverter.convert(d_CUST_DESINATED_DLV_LOC_NAME_CHANGE));
		struct.setd_OLD_CUST_DESINATED_DLV_LOC_KNAME( ((d_OLD_CUST_DESINATED_DLV_LOC_KNAME == null) ? (String)null : d_OLD_CUST_DESINATED_DLV_LOC_KNAME[0]) );
		struct.setList_d_OLD_CUST_DESINATED_DLV_LOC_KNAME(TypeConverter.convert(d_OLD_CUST_DESINATED_DLV_LOC_KNAME));
		struct.setd_NEW_CUST_DESINATED_DLV_LOC_KNAME( ((d_NEW_CUST_DESINATED_DLV_LOC_KNAME == null) ? (String)null : d_NEW_CUST_DESINATED_DLV_LOC_KNAME[0]) );
		struct.setList_d_NEW_CUST_DESINATED_DLV_LOC_KNAME(TypeConverter.convert(d_NEW_CUST_DESINATED_DLV_LOC_KNAME));
		struct.setd_CUST_DESINATED_DLV_LOC_KNAME_CHANGE( ((d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE == null) ? (String)null : d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE[0]) );
		struct.setList_d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE(TypeConverter.convert(d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE));
		struct.setd_OLD_CUST_DESINATED_DLV_LOC_ENAME( ((d_OLD_CUST_DESINATED_DLV_LOC_ENAME == null) ? (String)null : d_OLD_CUST_DESINATED_DLV_LOC_ENAME[0]) );
		struct.setList_d_OLD_CUST_DESINATED_DLV_LOC_ENAME(TypeConverter.convert(d_OLD_CUST_DESINATED_DLV_LOC_ENAME));
		struct.setd_NEW_CUST_DESINATED_DLV_LOC_ENAME( ((d_NEW_CUST_DESINATED_DLV_LOC_ENAME == null) ? (String)null : d_NEW_CUST_DESINATED_DLV_LOC_ENAME[0]) );
		struct.setList_d_NEW_CUST_DESINATED_DLV_LOC_ENAME(TypeConverter.convert(d_NEW_CUST_DESINATED_DLV_LOC_ENAME));
		struct.setd_CUST_DESINATED_DLV_LOC_ENAME_CHANGE( ((d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE == null) ? (String)null : d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE[0]) );
		struct.setList_d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE(TypeConverter.convert(d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE));
		struct.seth_HISTORY_FOR_APPR( ((h_HISTORY_FOR_APPR == null) ? (String)null : h_HISTORY_FOR_APPR[0]) );
		struct.setList_h_HISTORY_FOR_APPR(TypeConverter.convert(h_HISTORY_FOR_APPR));
		struct.setd_OLD_ITEM_NAME( ((d_OLD_ITEM_NAME == null) ? (String)null : d_OLD_ITEM_NAME[0]) );
		struct.setList_d_OLD_ITEM_NAME(TypeConverter.convert(d_OLD_ITEM_NAME));
		struct.setd_NEW_ITEM_NAME( ((d_NEW_ITEM_NAME == null) ? (String)null : d_NEW_ITEM_NAME[0]) );
		struct.setList_d_NEW_ITEM_NAME(TypeConverter.convert(d_NEW_ITEM_NAME));
		struct.setd_ITEM_NAME_CHANGE( ((d_ITEM_NAME_CHANGE == null) ? (String)null : d_ITEM_NAME_CHANGE[0]) );
		struct.setList_d_ITEM_NAME_CHANGE(TypeConverter.convert(d_ITEM_NAME_CHANGE));
		struct.setd_OLD_DRAW_CD( ((d_OLD_DRAW_CD == null) ? (String)null : d_OLD_DRAW_CD[0]) );
		struct.setList_d_OLD_DRAW_CD(TypeConverter.convert(d_OLD_DRAW_CD));
		struct.setd_NEW_DRAW_CD( ((d_NEW_DRAW_CD == null) ? (String)null : d_NEW_DRAW_CD[0]) );
		struct.setList_d_NEW_DRAW_CD(TypeConverter.convert(d_NEW_DRAW_CD));
		struct.setd_DRAW_CD_CHANGE( ((d_DRAW_CD_CHANGE == null) ? (String)null : d_DRAW_CD_CHANGE[0]) );
		struct.setList_d_DRAW_CD_CHANGE(TypeConverter.convert(d_DRAW_CD_CHANGE));
		struct.setd_OLD_HIGH_LEVEL_NO( ((d_OLD_HIGH_LEVEL_NO == null) ? (String)null : d_OLD_HIGH_LEVEL_NO[0]) );
		struct.setList_d_OLD_HIGH_LEVEL_NO(TypeConverter.convert(d_OLD_HIGH_LEVEL_NO));
		struct.setd_NEW_HIGH_LEVEL_NO( ((d_NEW_HIGH_LEVEL_NO == null) ? (String)null : d_NEW_HIGH_LEVEL_NO[0]) );
		struct.setList_d_NEW_HIGH_LEVEL_NO(TypeConverter.convert(d_NEW_HIGH_LEVEL_NO));
		struct.setd_HIGH_LEVEL_NO_CHANGE( ((d_HIGH_LEVEL_NO_CHANGE == null) ? (String)null : d_HIGH_LEVEL_NO_CHANGE[0]) );
		struct.setList_d_HIGH_LEVEL_NO_CHANGE(TypeConverter.convert(d_HIGH_LEVEL_NO_CHANGE));
		struct.setd_OLD_SPEC( ((d_OLD_SPEC == null) ? (String)null : d_OLD_SPEC[0]) );
		struct.setList_d_OLD_SPEC(TypeConverter.convert(d_OLD_SPEC));
		struct.setd_NEW_SPEC( ((d_NEW_SPEC == null) ? (String)null : d_NEW_SPEC[0]) );
		struct.setList_d_NEW_SPEC(TypeConverter.convert(d_NEW_SPEC));
		struct.setd_SPEC_CHANGE( ((d_SPEC_CHANGE == null) ? (String)null : d_SPEC_CHANGE[0]) );
		struct.setList_d_SPEC_CHANGE(TypeConverter.convert(d_SPEC_CHANGE));
		struct.setd_OLD_ISSUE_TYP( ((d_OLD_ISSUE_TYP == null) ? (String)null : d_OLD_ISSUE_TYP[0]) );
		struct.setList_d_OLD_ISSUE_TYP(TypeConverter.convert(d_OLD_ISSUE_TYP));
		struct.setd_NEW_ISSUE_TYP( ((d_NEW_ISSUE_TYP == null) ? (String)null : d_NEW_ISSUE_TYP[0]) );
		struct.setList_d_NEW_ISSUE_TYP(TypeConverter.convert(d_NEW_ISSUE_TYP));
		struct.setd_ISSUE_TYP_CHANGE( ((d_ISSUE_TYP_CHANGE == null) ? (String)null : d_ISSUE_TYP_CHANGE[0]) );
		struct.setList_d_ISSUE_TYP_CHANGE(TypeConverter.convert(d_ISSUE_TYP_CHANGE));
		struct.setd_OLD_UNIT_QTY_TYP( ((d_OLD_UNIT_QTY_TYP == null) ? (String)null : d_OLD_UNIT_QTY_TYP[0]) );
		struct.setList_d_OLD_UNIT_QTY_TYP(TypeConverter.convert(d_OLD_UNIT_QTY_TYP));
		struct.setd_NEW_UNIT_QTY_TYP( ((d_NEW_UNIT_QTY_TYP == null) ? (String)null : d_NEW_UNIT_QTY_TYP[0]) );
		struct.setList_d_NEW_UNIT_QTY_TYP(TypeConverter.convert(d_NEW_UNIT_QTY_TYP));
		struct.setd_UNIT_QTY_TYP_CHANGE( ((d_UNIT_QTY_TYP_CHANGE == null) ? (String)null : d_UNIT_QTY_TYP_CHANGE[0]) );
		struct.setList_d_UNIT_QTY_TYP_CHANGE(TypeConverter.convert(d_UNIT_QTY_TYP_CHANGE));
		struct.setd_OLD_OUTSIDE_TYP( ((d_OLD_OUTSIDE_TYP == null) ? (String)null : d_OLD_OUTSIDE_TYP[0]) );
		struct.setList_d_OLD_OUTSIDE_TYP(TypeConverter.convert(d_OLD_OUTSIDE_TYP));
		struct.setd_NEW_OUTSIDE_TYP( ((d_NEW_OUTSIDE_TYP == null) ? (String)null : d_NEW_OUTSIDE_TYP[0]) );
		struct.setList_d_NEW_OUTSIDE_TYP(TypeConverter.convert(d_NEW_OUTSIDE_TYP));
		struct.setd_OUTSIDE_TYP_CHANGE( ((d_OUTSIDE_TYP_CHANGE == null) ? (String)null : d_OUTSIDE_TYP_CHANGE[0]) );
		struct.setList_d_OUTSIDE_TYP_CHANGE(TypeConverter.convert(d_OUTSIDE_TYP_CHANGE));
		struct.setd_OLD_ACPT_INSPC_TYP( ((d_OLD_ACPT_INSPC_TYP == null) ? (String)null : d_OLD_ACPT_INSPC_TYP[0]) );
		struct.setList_d_OLD_ACPT_INSPC_TYP(TypeConverter.convert(d_OLD_ACPT_INSPC_TYP));
		struct.setd_NEW_ACPT_INSPC_TYP( ((d_NEW_ACPT_INSPC_TYP == null) ? (String)null : d_NEW_ACPT_INSPC_TYP[0]) );
		struct.setList_d_NEW_ACPT_INSPC_TYP(TypeConverter.convert(d_NEW_ACPT_INSPC_TYP));
		struct.setd_ACPT_INSPC_TYP_CHANGE( ((d_ACPT_INSPC_TYP_CHANGE == null) ? (String)null : d_ACPT_INSPC_TYP_CHANGE[0]) );
		struct.setList_d_ACPT_INSPC_TYP_CHANGE(TypeConverter.convert(d_ACPT_INSPC_TYP_CHANGE));
		struct.setd_OLD_STOCK_UNIT_FLG( ((d_OLD_STOCK_UNIT_FLG == null) ? (String)null : d_OLD_STOCK_UNIT_FLG[0]) );
		struct.setList_d_OLD_STOCK_UNIT_FLG(TypeConverter.convert(d_OLD_STOCK_UNIT_FLG));
		struct.setd_NEW_STOCK_UNIT_FLG( ((d_NEW_STOCK_UNIT_FLG == null) ? (String)null : d_NEW_STOCK_UNIT_FLG[0]) );
		struct.setList_d_NEW_STOCK_UNIT_FLG(TypeConverter.convert(d_NEW_STOCK_UNIT_FLG));
		struct.setd_STOCK_UNIT_FLG_CHANGE( ((d_STOCK_UNIT_FLG_CHANGE == null) ? (String)null : d_STOCK_UNIT_FLG_CHANGE[0]) );
		struct.setList_d_STOCK_UNIT_FLG_CHANGE(TypeConverter.convert(d_STOCK_UNIT_FLG_CHANGE));
		struct.setd_OLD_PRODUCT_TYP( ((d_OLD_PRODUCT_TYP == null) ? (String)null : d_OLD_PRODUCT_TYP[0]) );
		struct.setList_d_OLD_PRODUCT_TYP(TypeConverter.convert(d_OLD_PRODUCT_TYP));
		struct.setd_NEW_PRODUCT_TYP( ((d_NEW_PRODUCT_TYP == null) ? (String)null : d_NEW_PRODUCT_TYP[0]) );
		struct.setList_d_NEW_PRODUCT_TYP(TypeConverter.convert(d_NEW_PRODUCT_TYP));
		struct.setd_PRODUCT_TYP_CHANGE( ((d_PRODUCT_TYP_CHANGE == null) ? (String)null : d_PRODUCT_TYP_CHANGE[0]) );
		struct.setList_d_PRODUCT_TYP_CHANGE(TypeConverter.convert(d_PRODUCT_TYP_CHANGE));
		struct.setd_OLD_STOCK_UNIT( ((d_OLD_STOCK_UNIT == null) ? (String)null : d_OLD_STOCK_UNIT[0]) );
		struct.setList_d_OLD_STOCK_UNIT(TypeConverter.convert(d_OLD_STOCK_UNIT));
		struct.setd_NEW_STOCK_UNIT( ((d_NEW_STOCK_UNIT == null) ? (String)null : d_NEW_STOCK_UNIT[0]) );
		struct.setList_d_NEW_STOCK_UNIT(TypeConverter.convert(d_NEW_STOCK_UNIT));
		struct.setd_STOCK_UNIT_CHANGE( ((d_STOCK_UNIT_CHANGE == null) ? (String)null : d_STOCK_UNIT_CHANGE[0]) );
		struct.setList_d_STOCK_UNIT_CHANGE(TypeConverter.convert(d_STOCK_UNIT_CHANGE));
		struct.setd_OLD_ABC_TYP( ((d_OLD_ABC_TYP == null) ? (String)null : d_OLD_ABC_TYP[0]) );
		struct.setList_d_OLD_ABC_TYP(TypeConverter.convert(d_OLD_ABC_TYP));
		struct.setd_NEW_ABC_TYP( ((d_NEW_ABC_TYP == null) ? (String)null : d_NEW_ABC_TYP[0]) );
		struct.setList_d_NEW_ABC_TYP(TypeConverter.convert(d_NEW_ABC_TYP));
		struct.setd_ABC_TYP_CHANGE( ((d_ABC_TYP_CHANGE == null) ? (String)null : d_ABC_TYP_CHANGE[0]) );
		struct.setList_d_ABC_TYP_CHANGE(TypeConverter.convert(d_ABC_TYP_CHANGE));
		struct.setd_OLD_PKG_UNIT( ((d_OLD_PKG_UNIT == null) ? (String)null : d_OLD_PKG_UNIT[0]) );
		struct.setList_d_OLD_PKG_UNIT(TypeConverter.convert(d_OLD_PKG_UNIT));
		struct.setd_NEW_PKG_UNIT( ((d_NEW_PKG_UNIT == null) ? (String)null : d_NEW_PKG_UNIT[0]) );
		struct.setList_d_NEW_PKG_UNIT(TypeConverter.convert(d_NEW_PKG_UNIT));
		struct.setd_PKG_UNIT_CHANGE( ((d_PKG_UNIT_CHANGE == null) ? (String)null : d_PKG_UNIT_CHANGE[0]) );
		struct.setList_d_PKG_UNIT_CHANGE(TypeConverter.convert(d_PKG_UNIT_CHANGE));
		struct.setd_OLD_OPR_RSLT_TYP( ((d_OLD_OPR_RSLT_TYP == null) ? (String)null : d_OLD_OPR_RSLT_TYP[0]) );
		struct.setList_d_OLD_OPR_RSLT_TYP(TypeConverter.convert(d_OLD_OPR_RSLT_TYP));
		struct.setd_NEW_OPR_RSLT_TYP( ((d_NEW_OPR_RSLT_TYP == null) ? (String)null : d_NEW_OPR_RSLT_TYP[0]) );
		struct.setList_d_NEW_OPR_RSLT_TYP(TypeConverter.convert(d_NEW_OPR_RSLT_TYP));
		struct.setd_OPR_RSLT_TYP_CHANGE( ((d_OPR_RSLT_TYP_CHANGE == null) ? (String)null : d_OPR_RSLT_TYP_CHANGE[0]) );
		struct.setList_d_OPR_RSLT_TYP_CHANGE(TypeConverter.convert(d_OPR_RSLT_TYP_CHANGE));
		struct.setd_OLD_PKG_UNIT_QTY( ((d_OLD_PKG_UNIT_QTY == null) ? (String)null : d_OLD_PKG_UNIT_QTY[0]) );
		struct.setList_d_OLD_PKG_UNIT_QTY(TypeConverter.convert(d_OLD_PKG_UNIT_QTY));
		struct.setd_NEW_PKG_UNIT_QTY( ((d_NEW_PKG_UNIT_QTY == null) ? (String)null : d_NEW_PKG_UNIT_QTY[0]) );
		struct.setList_d_NEW_PKG_UNIT_QTY(TypeConverter.convert(d_NEW_PKG_UNIT_QTY));
		struct.setd_PKG_UNIT_QTY_CHANGE( ((d_PKG_UNIT_QTY_CHANGE == null) ? (String)null : d_PKG_UNIT_QTY_CHANGE[0]) );
		struct.setList_d_PKG_UNIT_QTY_CHANGE(TypeConverter.convert(d_PKG_UNIT_QTY_CHANGE));
		struct.setd_OLD_SPL_ITEM_TYP( ((d_OLD_SPL_ITEM_TYP == null) ? (String)null : d_OLD_SPL_ITEM_TYP[0]) );
		struct.setList_d_OLD_SPL_ITEM_TYP(TypeConverter.convert(d_OLD_SPL_ITEM_TYP));
		struct.setd_NEW_SPL_ITEM_TYP( ((d_NEW_SPL_ITEM_TYP == null) ? (String)null : d_NEW_SPL_ITEM_TYP[0]) );
		struct.setList_d_NEW_SPL_ITEM_TYP(TypeConverter.convert(d_NEW_SPL_ITEM_TYP));
		struct.setd_SPL_ITEM_TYP_CHANGE( ((d_SPL_ITEM_TYP_CHANGE == null) ? (String)null : d_SPL_ITEM_TYP_CHANGE[0]) );
		struct.setList_d_SPL_ITEM_TYP_CHANGE(TypeConverter.convert(d_SPL_ITEM_TYP_CHANGE));
		struct.setd_OLD_ODR_LT( ((d_OLD_ODR_LT == null) ? (String)null : d_OLD_ODR_LT[0]) );
		struct.setList_d_OLD_ODR_LT(TypeConverter.convert(d_OLD_ODR_LT));
		struct.setd_NEW_ODR_LT( ((d_NEW_ODR_LT == null) ? (String)null : d_NEW_ODR_LT[0]) );
		struct.setList_d_NEW_ODR_LT(TypeConverter.convert(d_NEW_ODR_LT));
		struct.setd_ODR_LT_CHANGE( ((d_ODR_LT_CHANGE == null) ? (String)null : d_ODR_LT_CHANGE[0]) );
		struct.setList_d_ODR_LT_CHANGE(TypeConverter.convert(d_ODR_LT_CHANGE));
		struct.setd_OLD_ISSUE_LT( ((d_OLD_ISSUE_LT == null) ? (String)null : d_OLD_ISSUE_LT[0]) );
		struct.setList_d_OLD_ISSUE_LT(TypeConverter.convert(d_OLD_ISSUE_LT));
		struct.setd_NEW_ISSUE_LT( ((d_NEW_ISSUE_LT == null) ? (String)null : d_NEW_ISSUE_LT[0]) );
		struct.setList_d_NEW_ISSUE_LT(TypeConverter.convert(d_NEW_ISSUE_LT));
		struct.setd_ISSUE_LT_CHANGE( ((d_ISSUE_LT_CHANGE == null) ? (String)null : d_ISSUE_LT_CHANGE[0]) );
		struct.setList_d_ISSUE_LT_CHANGE(TypeConverter.convert(d_ISSUE_LT_CHANGE));
		struct.setd_OLD_FIXED_LT( ((d_OLD_FIXED_LT == null) ? (String)null : d_OLD_FIXED_LT[0]) );
		struct.setList_d_OLD_FIXED_LT(TypeConverter.convert(d_OLD_FIXED_LT));
		struct.setd_NEW_FIXED_LT( ((d_NEW_FIXED_LT == null) ? (String)null : d_NEW_FIXED_LT[0]) );
		struct.setList_d_NEW_FIXED_LT(TypeConverter.convert(d_NEW_FIXED_LT));
		struct.setd_FIXED_LT_CHANGE( ((d_FIXED_LT_CHANGE == null) ? (String)null : d_FIXED_LT_CHANGE[0]) );
		struct.setList_d_FIXED_LT_CHANGE(TypeConverter.convert(d_FIXED_LT_CHANGE));
		struct.setd_OLD_PROP_LOT_SIZE( ((d_OLD_PROP_LOT_SIZE == null) ? (String)null : d_OLD_PROP_LOT_SIZE[0]) );
		struct.setList_d_OLD_PROP_LOT_SIZE(TypeConverter.convert(d_OLD_PROP_LOT_SIZE));
		struct.setd_NEW_PROP_LOT_SIZE( ((d_NEW_PROP_LOT_SIZE == null) ? (String)null : d_NEW_PROP_LOT_SIZE[0]) );
		struct.setList_d_NEW_PROP_LOT_SIZE(TypeConverter.convert(d_NEW_PROP_LOT_SIZE));
		struct.setd_PROP_LOT_SIZE_CHANGE( ((d_PROP_LOT_SIZE_CHANGE == null) ? (String)null : d_PROP_LOT_SIZE_CHANGE[0]) );
		struct.setList_d_PROP_LOT_SIZE_CHANGE(TypeConverter.convert(d_PROP_LOT_SIZE_CHANGE));
		struct.setd_OLD_PROP_LT( ((d_OLD_PROP_LT == null) ? (String)null : d_OLD_PROP_LT[0]) );
		struct.setList_d_OLD_PROP_LT(TypeConverter.convert(d_OLD_PROP_LT));
		struct.setd_NEW_PROP_LT( ((d_NEW_PROP_LT == null) ? (String)null : d_NEW_PROP_LT[0]) );
		struct.setList_d_NEW_PROP_LT(TypeConverter.convert(d_NEW_PROP_LT));
		struct.setd_PROP_LT_CHANGE( ((d_PROP_LT_CHANGE == null) ? (String)null : d_PROP_LT_CHANGE[0]) );
		struct.setList_d_PROP_LT_CHANGE(TypeConverter.convert(d_PROP_LT_CHANGE));
		struct.setd_OLD_ITEM_SPOIL( ((d_OLD_ITEM_SPOIL == null) ? (String)null : d_OLD_ITEM_SPOIL[0]) );
		struct.setList_d_OLD_ITEM_SPOIL(TypeConverter.convert(d_OLD_ITEM_SPOIL));
		struct.setd_NEW_ITEM_SPOIL( ((d_NEW_ITEM_SPOIL == null) ? (String)null : d_NEW_ITEM_SPOIL[0]) );
		struct.setList_d_NEW_ITEM_SPOIL(TypeConverter.convert(d_NEW_ITEM_SPOIL));
		struct.setd_ITEM_SPOIL_CHANGE( ((d_ITEM_SPOIL_CHANGE == null) ? (String)null : d_ITEM_SPOIL_CHANGE[0]) );
		struct.setList_d_ITEM_SPOIL_CHANGE(TypeConverter.convert(d_ITEM_SPOIL_CHANGE));
		struct.setd_OLD_SAFETY_LT( ((d_OLD_SAFETY_LT == null) ? (String)null : d_OLD_SAFETY_LT[0]) );
		struct.setList_d_OLD_SAFETY_LT(TypeConverter.convert(d_OLD_SAFETY_LT));
		struct.setd_NEW_SAFETY_LT( ((d_NEW_SAFETY_LT == null) ? (String)null : d_NEW_SAFETY_LT[0]) );
		struct.setList_d_NEW_SAFETY_LT(TypeConverter.convert(d_NEW_SAFETY_LT));
		struct.setd_SAFETY_LT_CHANGE( ((d_SAFETY_LT_CHANGE == null) ? (String)null : d_SAFETY_LT_CHANGE[0]) );
		struct.setList_d_SAFETY_LT_CHANGE(TypeConverter.convert(d_SAFETY_LT_CHANGE));
		struct.setd_OLD_SAFETY_STOCK( ((d_OLD_SAFETY_STOCK == null) ? (String)null : d_OLD_SAFETY_STOCK[0]) );
		struct.setList_d_OLD_SAFETY_STOCK(TypeConverter.convert(d_OLD_SAFETY_STOCK));
		struct.setd_NEW_SAFETY_STOCK( ((d_NEW_SAFETY_STOCK == null) ? (String)null : d_NEW_SAFETY_STOCK[0]) );
		struct.setList_d_NEW_SAFETY_STOCK(TypeConverter.convert(d_NEW_SAFETY_STOCK));
		struct.setd_SAFETY_STOCK_CHANGE( ((d_SAFETY_STOCK_CHANGE == null) ? (String)null : d_SAFETY_STOCK_CHANGE[0]) );
		struct.setList_d_SAFETY_STOCK_CHANGE(TypeConverter.convert(d_SAFETY_STOCK_CHANGE));
		struct.setd_OLD_MRP_ODR_TYP( ((d_OLD_MRP_ODR_TYP == null) ? (String)null : d_OLD_MRP_ODR_TYP[0]) );
		struct.setList_d_OLD_MRP_ODR_TYP(TypeConverter.convert(d_OLD_MRP_ODR_TYP));
		struct.setd_NEW_MRP_ODR_TYP( ((d_NEW_MRP_ODR_TYP == null) ? (String)null : d_NEW_MRP_ODR_TYP[0]) );
		struct.setList_d_NEW_MRP_ODR_TYP(TypeConverter.convert(d_NEW_MRP_ODR_TYP));
		struct.setd_MRP_ODR_TYP_CHANGE( ((d_MRP_ODR_TYP_CHANGE == null) ? (String)null : d_MRP_ODR_TYP_CHANGE[0]) );
		struct.setList_d_MRP_ODR_TYP_CHANGE(TypeConverter.convert(d_MRP_ODR_TYP_CHANGE));
		struct.setd_OLD_MANHOUR_TYP( ((d_OLD_MANHOUR_TYP == null) ? (String)null : d_OLD_MANHOUR_TYP[0]) );
		struct.setList_d_OLD_MANHOUR_TYP(TypeConverter.convert(d_OLD_MANHOUR_TYP));
		struct.setd_NEW_MANHOUR_TYP( ((d_NEW_MANHOUR_TYP == null) ? (String)null : d_NEW_MANHOUR_TYP[0]) );
		struct.setList_d_NEW_MANHOUR_TYP(TypeConverter.convert(d_NEW_MANHOUR_TYP));
		struct.setd_MANHOUR_TYP_CHANGE( ((d_MANHOUR_TYP_CHANGE == null) ? (String)null : d_MANHOUR_TYP_CHANGE[0]) );
		struct.setList_d_MANHOUR_TYP_CHANGE(TypeConverter.convert(d_MANHOUR_TYP_CHANGE));
		struct.setd_OLD_LOT_SIZING_TYP( ((d_OLD_LOT_SIZING_TYP == null) ? (String)null : d_OLD_LOT_SIZING_TYP[0]) );
		struct.setList_d_OLD_LOT_SIZING_TYP(TypeConverter.convert(d_OLD_LOT_SIZING_TYP));
		struct.setd_NEW_LOT_SIZING_TYP( ((d_NEW_LOT_SIZING_TYP == null) ? (String)null : d_NEW_LOT_SIZING_TYP[0]) );
		struct.setList_d_NEW_LOT_SIZING_TYP(TypeConverter.convert(d_NEW_LOT_SIZING_TYP));
		struct.setd_LOT_SIZING_TYP_CHANGE( ((d_LOT_SIZING_TYP_CHANGE == null) ? (String)null : d_LOT_SIZING_TYP_CHANGE[0]) );
		struct.setList_d_LOT_SIZING_TYP_CHANGE(TypeConverter.convert(d_LOT_SIZING_TYP_CHANGE));
		struct.setd_OLD_MPS_FLG( ((d_OLD_MPS_FLG == null) ? (String)null : d_OLD_MPS_FLG[0]) );
		struct.setList_d_OLD_MPS_FLG(TypeConverter.convert(d_OLD_MPS_FLG));
		struct.setd_NEW_MPS_FLG( ((d_NEW_MPS_FLG == null) ? (String)null : d_NEW_MPS_FLG[0]) );
		struct.setList_d_NEW_MPS_FLG(TypeConverter.convert(d_NEW_MPS_FLG));
		struct.setd_MPS_FLG_CHANGE( ((d_MPS_FLG_CHANGE == null) ? (String)null : d_MPS_FLG_CHANGE[0]) );
		struct.setList_d_MPS_FLG_CHANGE(TypeConverter.convert(d_MPS_FLG_CHANGE));
		struct.setd_OLD_MAX_PERIOD( ((d_OLD_MAX_PERIOD == null) ? (String)null : d_OLD_MAX_PERIOD[0]) );
		struct.setList_d_OLD_MAX_PERIOD(TypeConverter.convert(d_OLD_MAX_PERIOD));
		struct.setd_NEW_MAX_PERIOD( ((d_NEW_MAX_PERIOD == null) ? (String)null : d_NEW_MAX_PERIOD[0]) );
		struct.setList_d_NEW_MAX_PERIOD(TypeConverter.convert(d_NEW_MAX_PERIOD));
		struct.setd_MAX_PERIOD_CHANGE( ((d_MAX_PERIOD_CHANGE == null) ? (String)null : d_MAX_PERIOD_CHANGE[0]) );
		struct.setList_d_MAX_PERIOD_CHANGE(TypeConverter.convert(d_MAX_PERIOD_CHANGE));
		struct.setd_OLD_FIXED_ODR_QTY( ((d_OLD_FIXED_ODR_QTY == null) ? (String)null : d_OLD_FIXED_ODR_QTY[0]) );
		struct.setList_d_OLD_FIXED_ODR_QTY(TypeConverter.convert(d_OLD_FIXED_ODR_QTY));
		struct.setd_NEW_FIXED_ODR_QTY( ((d_NEW_FIXED_ODR_QTY == null) ? (String)null : d_NEW_FIXED_ODR_QTY[0]) );
		struct.setList_d_NEW_FIXED_ODR_QTY(TypeConverter.convert(d_NEW_FIXED_ODR_QTY));
		struct.setd_FIXED_ODR_QTY_CHANGE( ((d_FIXED_ODR_QTY_CHANGE == null) ? (String)null : d_FIXED_ODR_QTY_CHANGE[0]) );
		struct.setList_d_FIXED_ODR_QTY_CHANGE(TypeConverter.convert(d_FIXED_ODR_QTY_CHANGE));
		struct.setd_OLD_MAX_ODR_QTY( ((d_OLD_MAX_ODR_QTY == null) ? (String)null : d_OLD_MAX_ODR_QTY[0]) );
		struct.setList_d_OLD_MAX_ODR_QTY(TypeConverter.convert(d_OLD_MAX_ODR_QTY));
		struct.setd_NEW_MAX_ODR_QTY( ((d_NEW_MAX_ODR_QTY == null) ? (String)null : d_NEW_MAX_ODR_QTY[0]) );
		struct.setList_d_NEW_MAX_ODR_QTY(TypeConverter.convert(d_NEW_MAX_ODR_QTY));
		struct.setd_MAX_ODR_QTY_CHANGE( ((d_MAX_ODR_QTY_CHANGE == null) ? (String)null : d_MAX_ODR_QTY_CHANGE[0]) );
		struct.setList_d_MAX_ODR_QTY_CHANGE(TypeConverter.convert(d_MAX_ODR_QTY_CHANGE));
		struct.setd_OLD_MIN_ODR_QTY( ((d_OLD_MIN_ODR_QTY == null) ? (String)null : d_OLD_MIN_ODR_QTY[0]) );
		struct.setList_d_OLD_MIN_ODR_QTY(TypeConverter.convert(d_OLD_MIN_ODR_QTY));
		struct.setd_NEW_MIN_ODR_QTY( ((d_NEW_MIN_ODR_QTY == null) ? (String)null : d_NEW_MIN_ODR_QTY[0]) );
		struct.setList_d_NEW_MIN_ODR_QTY(TypeConverter.convert(d_NEW_MIN_ODR_QTY));
		struct.setd_MIN_ODR_QTY_CHANGE( ((d_MIN_ODR_QTY_CHANGE == null) ? (String)null : d_MIN_ODR_QTY_CHANGE[0]) );
		struct.setList_d_MIN_ODR_QTY_CHANGE(TypeConverter.convert(d_MIN_ODR_QTY_CHANGE));
		struct.setd_OLD_ODR_POINT( ((d_OLD_ODR_POINT == null) ? (String)null : d_OLD_ODR_POINT[0]) );
		struct.setList_d_OLD_ODR_POINT(TypeConverter.convert(d_OLD_ODR_POINT));
		struct.setd_NEW_ODR_POINT( ((d_NEW_ODR_POINT == null) ? (String)null : d_NEW_ODR_POINT[0]) );
		struct.setList_d_NEW_ODR_POINT(TypeConverter.convert(d_NEW_ODR_POINT));
		struct.setd_ODR_POINT_CHANGE( ((d_ODR_POINT_CHANGE == null) ? (String)null : d_ODR_POINT_CHANGE[0]) );
		struct.setList_d_ODR_POINT_CHANGE(TypeConverter.convert(d_ODR_POINT_CHANGE));
		struct.setd_OLD_MUL_ODR_QTY( ((d_OLD_MUL_ODR_QTY == null) ? (String)null : d_OLD_MUL_ODR_QTY[0]) );
		struct.setList_d_OLD_MUL_ODR_QTY(TypeConverter.convert(d_OLD_MUL_ODR_QTY));
		struct.setd_NEW_MUL_ODR_QTY( ((d_NEW_MUL_ODR_QTY == null) ? (String)null : d_NEW_MUL_ODR_QTY[0]) );
		struct.setList_d_NEW_MUL_ODR_QTY(TypeConverter.convert(d_NEW_MUL_ODR_QTY));
		struct.setd_MUL_ODR_QTY_CHANGE( ((d_MUL_ODR_QTY_CHANGE == null) ? (String)null : d_MUL_ODR_QTY_CHANGE[0]) );
		struct.setList_d_MUL_ODR_QTY_CHANGE(TypeConverter.convert(d_MUL_ODR_QTY_CHANGE));
		struct.setd_OLD_CLASIFICATION_CD( ((d_OLD_CLASIFICATION_CD == null) ? (String)null : d_OLD_CLASIFICATION_CD[0]) );
		struct.setList_d_OLD_CLASIFICATION_CD(TypeConverter.convert(d_OLD_CLASIFICATION_CD));
		struct.setd_NEW_CLASIFICATION_CD( ((d_NEW_CLASIFICATION_CD == null) ? (String)null : d_NEW_CLASIFICATION_CD[0]) );
		struct.setList_d_NEW_CLASIFICATION_CD(TypeConverter.convert(d_NEW_CLASIFICATION_CD));
		struct.setd_CLASIFICATION_CD_CHANGE( ((d_CLASIFICATION_CD_CHANGE == null) ? (String)null : d_CLASIFICATION_CD_CHANGE[0]) );
		struct.setList_d_CLASIFICATION_CD_CHANGE(TypeConverter.convert(d_CLASIFICATION_CD_CHANGE));
		struct.setd_OLD_UNIT_WEIGHT( ((d_OLD_UNIT_WEIGHT == null) ? (String)null : d_OLD_UNIT_WEIGHT[0]) );
		struct.setList_d_OLD_UNIT_WEIGHT(TypeConverter.convert(d_OLD_UNIT_WEIGHT));
		struct.setd_NEW_UNIT_WEIGHT( ((d_NEW_UNIT_WEIGHT == null) ? (String)null : d_NEW_UNIT_WEIGHT[0]) );
		struct.setList_d_NEW_UNIT_WEIGHT(TypeConverter.convert(d_NEW_UNIT_WEIGHT));
		struct.setd_UNIT_WEIGHT_CHANGE( ((d_UNIT_WEIGHT_CHANGE == null) ? (String)null : d_UNIT_WEIGHT_CHANGE[0]) );
		struct.setList_d_UNIT_WEIGHT_CHANGE(TypeConverter.convert(d_UNIT_WEIGHT_CHANGE));
		struct.setd_OLD_TAX_CD_1( ((d_OLD_TAX_CD_1 == null) ? (String)null : d_OLD_TAX_CD_1[0]) );
		struct.setList_d_OLD_TAX_CD_1(TypeConverter.convert(d_OLD_TAX_CD_1));
		struct.setd_NEW_TAX_CD_1( ((d_NEW_TAX_CD_1 == null) ? (String)null : d_NEW_TAX_CD_1[0]) );
		struct.setList_d_NEW_TAX_CD_1(TypeConverter.convert(d_NEW_TAX_CD_1));
		struct.setd_TAX_CD_1_CHANGE( ((d_TAX_CD_1_CHANGE == null) ? (String)null : d_TAX_CD_1_CHANGE[0]) );
		struct.setList_d_TAX_CD_1_CHANGE(TypeConverter.convert(d_TAX_CD_1_CHANGE));
		struct.setd_OLD_DEPO_TYP( ((d_OLD_DEPO_TYP == null) ? (String)null : d_OLD_DEPO_TYP[0]) );
		struct.setList_d_OLD_DEPO_TYP(TypeConverter.convert(d_OLD_DEPO_TYP));
		struct.setd_NEW_DEPO_TYP( ((d_NEW_DEPO_TYP == null) ? (String)null : d_NEW_DEPO_TYP[0]) );
		struct.setList_d_NEW_DEPO_TYP(TypeConverter.convert(d_NEW_DEPO_TYP));
		struct.setd_DEPO_TYP_CHANGE( ((d_DEPO_TYP_CHANGE == null) ? (String)null : d_DEPO_TYP_CHANGE[0]) );
		struct.setList_d_DEPO_TYP_CHANGE(TypeConverter.convert(d_DEPO_TYP_CHANGE));
		struct.setd_OLD_BEST_BEFORE_YEAR( ((d_OLD_BEST_BEFORE_YEAR == null) ? (String)null : d_OLD_BEST_BEFORE_YEAR[0]) );
		struct.setList_d_OLD_BEST_BEFORE_YEAR(TypeConverter.convert(d_OLD_BEST_BEFORE_YEAR));
		struct.setd_NEW_BEST_BEFORE_YEAR( ((d_NEW_BEST_BEFORE_YEAR == null) ? (String)null : d_NEW_BEST_BEFORE_YEAR[0]) );
		struct.setList_d_NEW_BEST_BEFORE_YEAR(TypeConverter.convert(d_NEW_BEST_BEFORE_YEAR));
		struct.setd_BEST_BEFORE_YEAR_CHANGE( ((d_BEST_BEFORE_YEAR_CHANGE == null) ? (String)null : d_BEST_BEFORE_YEAR_CHANGE[0]) );
		struct.setList_d_BEST_BEFORE_YEAR_CHANGE(TypeConverter.convert(d_BEST_BEFORE_YEAR_CHANGE));
		struct.setd_OLD_LOT_CTRL_FLG( ((d_OLD_LOT_CTRL_FLG == null) ? (String)null : d_OLD_LOT_CTRL_FLG[0]) );
		struct.setList_d_OLD_LOT_CTRL_FLG(TypeConverter.convert(d_OLD_LOT_CTRL_FLG));
		struct.setd_NEW_LOT_CTRL_FLG( ((d_NEW_LOT_CTRL_FLG == null) ? (String)null : d_NEW_LOT_CTRL_FLG[0]) );
		struct.setList_d_NEW_LOT_CTRL_FLG(TypeConverter.convert(d_NEW_LOT_CTRL_FLG));
		struct.setd_LOT_CTRL_FLG_CHANGE( ((d_LOT_CTRL_FLG_CHANGE == null) ? (String)null : d_LOT_CTRL_FLG_CHANGE[0]) );
		struct.setList_d_LOT_CTRL_FLG_CHANGE(TypeConverter.convert(d_LOT_CTRL_FLG_CHANGE));
		struct.setd_OLD_BEST_BEFORE_MONTH( ((d_OLD_BEST_BEFORE_MONTH == null) ? (String)null : d_OLD_BEST_BEFORE_MONTH[0]) );
		struct.setList_d_OLD_BEST_BEFORE_MONTH(TypeConverter.convert(d_OLD_BEST_BEFORE_MONTH));
		struct.setd_NEW_BEST_BEFORE_MONTH( ((d_NEW_BEST_BEFORE_MONTH == null) ? (String)null : d_NEW_BEST_BEFORE_MONTH[0]) );
		struct.setList_d_NEW_BEST_BEFORE_MONTH(TypeConverter.convert(d_NEW_BEST_BEFORE_MONTH));
		struct.setd_BEST_BEFORE_MONTH_CHANGE( ((d_BEST_BEFORE_MONTH_CHANGE == null) ? (String)null : d_BEST_BEFORE_MONTH_CHANGE[0]) );
		struct.setList_d_BEST_BEFORE_MONTH_CHANGE(TypeConverter.convert(d_BEST_BEFORE_MONTH_CHANGE));
		struct.setd_OLD_LOT_NUMBERING_TYP( ((d_OLD_LOT_NUMBERING_TYP == null) ? (String)null : d_OLD_LOT_NUMBERING_TYP[0]) );
		struct.setList_d_OLD_LOT_NUMBERING_TYP(TypeConverter.convert(d_OLD_LOT_NUMBERING_TYP));
		struct.setd_NEW_LOT_NUMBERING_TYP( ((d_NEW_LOT_NUMBERING_TYP == null) ? (String)null : d_NEW_LOT_NUMBERING_TYP[0]) );
		struct.setList_d_NEW_LOT_NUMBERING_TYP(TypeConverter.convert(d_NEW_LOT_NUMBERING_TYP));
		struct.setd_LOT_NUMBERING_TYP_CHANGE( ((d_LOT_NUMBERING_TYP_CHANGE == null) ? (String)null : d_LOT_NUMBERING_TYP_CHANGE[0]) );
		struct.setList_d_LOT_NUMBERING_TYP_CHANGE(TypeConverter.convert(d_LOT_NUMBERING_TYP_CHANGE));
		struct.setd_OLD_BEST_BEFORE_DAY( ((d_OLD_BEST_BEFORE_DAY == null) ? (String)null : d_OLD_BEST_BEFORE_DAY[0]) );
		struct.setList_d_OLD_BEST_BEFORE_DAY(TypeConverter.convert(d_OLD_BEST_BEFORE_DAY));
		struct.setd_NEW_BEST_BEFORE_DAY( ((d_NEW_BEST_BEFORE_DAY == null) ? (String)null : d_NEW_BEST_BEFORE_DAY[0]) );
		struct.setList_d_NEW_BEST_BEFORE_DAY(TypeConverter.convert(d_NEW_BEST_BEFORE_DAY));
		struct.setd_BEST_BEFORE_DAY_CHANGE( ((d_BEST_BEFORE_DAY_CHANGE == null) ? (String)null : d_BEST_BEFORE_DAY_CHANGE[0]) );
		struct.setList_d_BEST_BEFORE_DAY_CHANGE(TypeConverter.convert(d_BEST_BEFORE_DAY_CHANGE));
		struct.setd_OLD_STOCK_STATUS( ((d_OLD_STOCK_STATUS == null) ? (String)null : d_OLD_STOCK_STATUS[0]) );
		struct.setList_d_OLD_STOCK_STATUS(TypeConverter.convert(d_OLD_STOCK_STATUS));
		struct.setd_NEW_STOCK_STATUS( ((d_NEW_STOCK_STATUS == null) ? (String)null : d_NEW_STOCK_STATUS[0]) );
		struct.setList_d_NEW_STOCK_STATUS(TypeConverter.convert(d_NEW_STOCK_STATUS));
		struct.setd_STOCK_STATUS_CHANGE( ((d_STOCK_STATUS_CHANGE == null) ? (String)null : d_STOCK_STATUS_CHANGE[0]) );
		struct.setList_d_STOCK_STATUS_CHANGE(TypeConverter.convert(d_STOCK_STATUS_CHANGE));
		struct.setd_OLD_STOCK_STATUS_NAME( ((d_OLD_STOCK_STATUS_NAME == null) ? (String)null : d_OLD_STOCK_STATUS_NAME[0]) );
		struct.setList_d_OLD_STOCK_STATUS_NAME(TypeConverter.convert(d_OLD_STOCK_STATUS_NAME));
		struct.setd_NEW_STOCK_STATUS_NAME( ((d_NEW_STOCK_STATUS_NAME == null) ? (String)null : d_NEW_STOCK_STATUS_NAME[0]) );
		struct.setList_d_NEW_STOCK_STATUS_NAME(TypeConverter.convert(d_NEW_STOCK_STATUS_NAME));
		struct.setd_STOCK_STATUS_NAME_CHANGE( ((d_STOCK_STATUS_NAME_CHANGE == null) ? (String)null : d_STOCK_STATUS_NAME_CHANGE[0]) );
		struct.setList_d_STOCK_STATUS_NAME_CHANGE(TypeConverter.convert(d_STOCK_STATUS_NAME_CHANGE));
		struct.setd_OLD_STOCK_TYP( ((d_OLD_STOCK_TYP == null) ? (String)null : d_OLD_STOCK_TYP[0]) );
		struct.setList_d_OLD_STOCK_TYP(TypeConverter.convert(d_OLD_STOCK_TYP));
		struct.setd_NEW_STOCK_TYP( ((d_NEW_STOCK_TYP == null) ? (String)null : d_NEW_STOCK_TYP[0]) );
		struct.setList_d_NEW_STOCK_TYP(TypeConverter.convert(d_NEW_STOCK_TYP));
		struct.setd_STOCK_TYP_CHANGE( ((d_STOCK_TYP_CHANGE == null) ? (String)null : d_STOCK_TYP_CHANGE[0]) );
		struct.setList_d_STOCK_TYP_CHANGE(TypeConverter.convert(d_STOCK_TYP_CHANGE));
		struct.setd_OLD_EFF_STOCK_TYP( ((d_OLD_EFF_STOCK_TYP == null) ? (String)null : d_OLD_EFF_STOCK_TYP[0]) );
		struct.setList_d_OLD_EFF_STOCK_TYP(TypeConverter.convert(d_OLD_EFF_STOCK_TYP));
		struct.setd_NEW_EFF_STOCK_TYP( ((d_NEW_EFF_STOCK_TYP == null) ? (String)null : d_NEW_EFF_STOCK_TYP[0]) );
		struct.setList_d_NEW_EFF_STOCK_TYP(TypeConverter.convert(d_NEW_EFF_STOCK_TYP));
		struct.setd_EFF_STOCK_TYP_CHANGE( ((d_EFF_STOCK_TYP_CHANGE == null) ? (String)null : d_EFF_STOCK_TYP_CHANGE[0]) );
		struct.setList_d_EFF_STOCK_TYP_CHANGE(TypeConverter.convert(d_EFF_STOCK_TYP_CHANGE));
		struct.setd_OLD_SHIP_TYP( ((d_OLD_SHIP_TYP == null) ? (String)null : d_OLD_SHIP_TYP[0]) );
		struct.setList_d_OLD_SHIP_TYP(TypeConverter.convert(d_OLD_SHIP_TYP));
		struct.setd_NEW_SHIP_TYP( ((d_NEW_SHIP_TYP == null) ? (String)null : d_NEW_SHIP_TYP[0]) );
		struct.setList_d_NEW_SHIP_TYP(TypeConverter.convert(d_NEW_SHIP_TYP));
		struct.setd_SHIP_TYP_CHANGE( ((d_SHIP_TYP_CHANGE == null) ? (String)null : d_SHIP_TYP_CHANGE[0]) );
		struct.setList_d_SHIP_TYP_CHANGE(TypeConverter.convert(d_SHIP_TYP_CHANGE));
		struct.setd_OLD_REF_NO( ((d_OLD_REF_NO == null) ? (String)null : d_OLD_REF_NO[0]) );
		struct.setList_d_OLD_REF_NO(TypeConverter.convert(d_OLD_REF_NO));
		struct.setd_NEW_REF_NO( ((d_NEW_REF_NO == null) ? (String)null : d_NEW_REF_NO[0]) );
		struct.setList_d_NEW_REF_NO(TypeConverter.convert(d_NEW_REF_NO));
		struct.setd_REF_NO_CHANGE( ((d_REF_NO_CHANGE == null) ? (String)null : d_REF_NO_CHANGE[0]) );
		struct.setList_d_REF_NO_CHANGE(TypeConverter.convert(d_REF_NO_CHANGE));
		struct.setd_OLD_DELIVERY_CD( ((d_OLD_DELIVERY_CD == null) ? (String)null : d_OLD_DELIVERY_CD[0]) );
		struct.setList_d_OLD_DELIVERY_CD(TypeConverter.convert(d_OLD_DELIVERY_CD));
		struct.setd_NEW_DELIVERY_CD( ((d_NEW_DELIVERY_CD == null) ? (String)null : d_NEW_DELIVERY_CD[0]) );
		struct.setList_d_NEW_DELIVERY_CD(TypeConverter.convert(d_NEW_DELIVERY_CD));
		struct.setd_DELIVERY_CD_CHANGE( ((d_DELIVERY_CD_CHANGE == null) ? (String)null : d_DELIVERY_CD_CHANGE[0]) );
		struct.setList_d_DELIVERY_CD_CHANGE(TypeConverter.convert(d_DELIVERY_CD_CHANGE));
		struct.setd_OLD_BALA_ACCO_PATTERN_CD( ((d_OLD_BALA_ACCO_PATTERN_CD == null) ? (String)null : d_OLD_BALA_ACCO_PATTERN_CD[0]) );
		struct.setList_d_OLD_BALA_ACCO_PATTERN_CD(TypeConverter.convert(d_OLD_BALA_ACCO_PATTERN_CD));
		struct.setd_NEW_BALA_ACCO_PATTERN_CD( ((d_NEW_BALA_ACCO_PATTERN_CD == null) ? (String)null : d_NEW_BALA_ACCO_PATTERN_CD[0]) );
		struct.setList_d_NEW_BALA_ACCO_PATTERN_CD(TypeConverter.convert(d_NEW_BALA_ACCO_PATTERN_CD));
		struct.setd_BALA_ACCO_PATTERN_CD_CHANGE( ((d_BALA_ACCO_PATTERN_CD_CHANGE == null) ? (String)null : d_BALA_ACCO_PATTERN_CD_CHANGE[0]) );
		struct.setList_d_BALA_ACCO_PATTERN_CD_CHANGE(TypeConverter.convert(d_BALA_ACCO_PATTERN_CD_CHANGE));
		struct.setd_OLD_CUST_PRIORITY_REF_NO( ((d_OLD_CUST_PRIORITY_REF_NO == null) ? (String)null : d_OLD_CUST_PRIORITY_REF_NO[0]) );
		struct.setList_d_OLD_CUST_PRIORITY_REF_NO(TypeConverter.convert(d_OLD_CUST_PRIORITY_REF_NO));
		struct.setd_NEW_CUST_PRIORITY_REF_NO( ((d_NEW_CUST_PRIORITY_REF_NO == null) ? (String)null : d_NEW_CUST_PRIORITY_REF_NO[0]) );
		struct.setList_d_NEW_CUST_PRIORITY_REF_NO(TypeConverter.convert(d_NEW_CUST_PRIORITY_REF_NO));
		struct.setd_CUST_PRIORITY_REF_NO_CHANGE( ((d_CUST_PRIORITY_REF_NO_CHANGE == null) ? (String)null : d_CUST_PRIORITY_REF_NO_CHANGE[0]) );
		struct.setList_d_CUST_PRIORITY_REF_NO_CHANGE(TypeConverter.convert(d_CUST_PRIORITY_REF_NO_CHANGE));
		struct.setd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO( ((d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO == null) ? (String)null : d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO[0]) );
		struct.setList_d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO(TypeConverter.convert(d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO));
		struct.setd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO( ((d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO == null) ? (String)null : d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO[0]) );
		struct.setList_d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO(TypeConverter.convert(d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO));
		struct.setd_OLD_BALA_ACCO_CD_1( ((d_OLD_BALA_ACCO_CD_1 == null) ? (String)null : d_OLD_BALA_ACCO_CD_1[0]) );
		struct.setList_d_OLD_BALA_ACCO_CD_1(TypeConverter.convert(d_OLD_BALA_ACCO_CD_1));
		struct.setd_NEW_BALA_ACCO_CD_1( ((d_NEW_BALA_ACCO_CD_1 == null) ? (String)null : d_NEW_BALA_ACCO_CD_1[0]) );
		struct.setList_d_NEW_BALA_ACCO_CD_1(TypeConverter.convert(d_NEW_BALA_ACCO_CD_1));
		struct.setd_BALA_ACCO_CD_1_CHANGE( ((d_BALA_ACCO_CD_1_CHANGE == null) ? (String)null : d_BALA_ACCO_CD_1_CHANGE[0]) );
		struct.setList_d_BALA_ACCO_CD_1_CHANGE(TypeConverter.convert(d_BALA_ACCO_CD_1_CHANGE));
		struct.setd_OLD_BALA_ACCO_CD_2( ((d_OLD_BALA_ACCO_CD_2 == null) ? (String)null : d_OLD_BALA_ACCO_CD_2[0]) );
		struct.setList_d_OLD_BALA_ACCO_CD_2(TypeConverter.convert(d_OLD_BALA_ACCO_CD_2));
		struct.setd_NEW_BALA_ACCO_CD_2( ((d_NEW_BALA_ACCO_CD_2 == null) ? (String)null : d_NEW_BALA_ACCO_CD_2[0]) );
		struct.setList_d_NEW_BALA_ACCO_CD_2(TypeConverter.convert(d_NEW_BALA_ACCO_CD_2));
		struct.setd_BALA_ACCO_CD_2_CHANGE( ((d_BALA_ACCO_CD_2_CHANGE == null) ? (String)null : d_BALA_ACCO_CD_2_CHANGE[0]) );
		struct.setList_d_BALA_ACCO_CD_2_CHANGE(TypeConverter.convert(d_BALA_ACCO_CD_2_CHANGE));
		struct.setd_OLD_BALA_ACCO_CD_3( ((d_OLD_BALA_ACCO_CD_3 == null) ? (String)null : d_OLD_BALA_ACCO_CD_3[0]) );
		struct.setList_d_OLD_BALA_ACCO_CD_3(TypeConverter.convert(d_OLD_BALA_ACCO_CD_3));
		struct.setd_NEW_BALA_ACCO_CD_3( ((d_NEW_BALA_ACCO_CD_3 == null) ? (String)null : d_NEW_BALA_ACCO_CD_3[0]) );
		struct.setList_d_NEW_BALA_ACCO_CD_3(TypeConverter.convert(d_NEW_BALA_ACCO_CD_3));
		struct.setd_BALA_ACCO_CD_3_CHANGE( ((d_BALA_ACCO_CD_3_CHANGE == null) ? (String)null : d_BALA_ACCO_CD_3_CHANGE[0]) );
		struct.setList_d_BALA_ACCO_CD_3_CHANGE(TypeConverter.convert(d_BALA_ACCO_CD_3_CHANGE));
		struct.setd_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE( ((d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE == null) ? (String)null : d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE[0]) );
		struct.setList_d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE(TypeConverter.convert(d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE));
		struct.setd_OLD_BILL_ADDRESSEE_FLG( ((d_OLD_BILL_ADDRESSEE_FLG == null) ? (String)null : d_OLD_BILL_ADDRESSEE_FLG[0]) );
		struct.setList_d_OLD_BILL_ADDRESSEE_FLG(TypeConverter.convert(d_OLD_BILL_ADDRESSEE_FLG));
		struct.setd_NEW_BILL_ADDRESSEE_FLG( ((d_NEW_BILL_ADDRESSEE_FLG == null) ? (String)null : d_NEW_BILL_ADDRESSEE_FLG[0]) );
		struct.setList_d_NEW_BILL_ADDRESSEE_FLG(TypeConverter.convert(d_NEW_BILL_ADDRESSEE_FLG));
		struct.setd_BILL_ADDRESSEE_FLG_CHANGE( ((d_BILL_ADDRESSEE_FLG_CHANGE == null) ? (String)null : d_BILL_ADDRESSEE_FLG_CHANGE[0]) );
		struct.setList_d_BILL_ADDRESSEE_FLG_CHANGE(TypeConverter.convert(d_BILL_ADDRESSEE_FLG_CHANGE));
		struct.setd_OLD_RM_FLG( ((d_OLD_RM_FLG == null) ? (String)null : d_OLD_RM_FLG[0]) );
		struct.setList_d_OLD_RM_FLG(TypeConverter.convert(d_OLD_RM_FLG));
		struct.setd_NEW_RM_FLG( ((d_NEW_RM_FLG == null) ? (String)null : d_NEW_RM_FLG[0]) );
		struct.setList_d_NEW_RM_FLG(TypeConverter.convert(d_NEW_RM_FLG));
		struct.setd_RM_FLG_CHANGE( ((d_RM_FLG_CHANGE == null) ? (String)null : d_RM_FLG_CHANGE[0]) );
		struct.setList_d_RM_FLG_CHANGE(TypeConverter.convert(d_RM_FLG_CHANGE));
		struct.setd_OLD_CLAIM_CYCLE_TYP( ((d_OLD_CLAIM_CYCLE_TYP == null) ? (String)null : d_OLD_CLAIM_CYCLE_TYP[0]) );
		struct.setList_d_OLD_CLAIM_CYCLE_TYP(TypeConverter.convert(d_OLD_CLAIM_CYCLE_TYP));
		struct.setd_NEW_CLAIM_CYCLE_TYP( ((d_NEW_CLAIM_CYCLE_TYP == null) ? (String)null : d_NEW_CLAIM_CYCLE_TYP[0]) );
		struct.setList_d_NEW_CLAIM_CYCLE_TYP(TypeConverter.convert(d_NEW_CLAIM_CYCLE_TYP));
		struct.setd_CLAIM_CYCLE_TYP_CHANGE( ((d_CLAIM_CYCLE_TYP_CHANGE == null) ? (String)null : d_CLAIM_CYCLE_TYP_CHANGE[0]) );
		struct.setList_d_CLAIM_CYCLE_TYP_CHANGE(TypeConverter.convert(d_CLAIM_CYCLE_TYP_CHANGE));
		struct.setd_OLD_TEMP_UNIT_PRICE_SALES_FLG( ((d_OLD_TEMP_UNIT_PRICE_SALES_FLG == null) ? (String)null : d_OLD_TEMP_UNIT_PRICE_SALES_FLG[0]) );
		struct.setList_d_OLD_TEMP_UNIT_PRICE_SALES_FLG(TypeConverter.convert(d_OLD_TEMP_UNIT_PRICE_SALES_FLG));
		struct.setd_NEW_TEMP_UNIT_PRICE_SALES_FLG( ((d_NEW_TEMP_UNIT_PRICE_SALES_FLG == null) ? (String)null : d_NEW_TEMP_UNIT_PRICE_SALES_FLG[0]) );
		struct.setList_d_NEW_TEMP_UNIT_PRICE_SALES_FLG(TypeConverter.convert(d_NEW_TEMP_UNIT_PRICE_SALES_FLG));
		struct.setd_TEMP_UNIT_PRICE_SALES_FLG_CHANGE( ((d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE == null) ? (String)null : d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE[0]) );
		struct.setList_d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE(TypeConverter.convert(d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE));
		struct.setd_OLD_RM_INP_TYP( ((d_OLD_RM_INP_TYP == null) ? (String)null : d_OLD_RM_INP_TYP[0]) );
		struct.setList_d_OLD_RM_INP_TYP(TypeConverter.convert(d_OLD_RM_INP_TYP));
		struct.setd_NEW_RM_INP_TYP( ((d_NEW_RM_INP_TYP == null) ? (String)null : d_NEW_RM_INP_TYP[0]) );
		struct.setList_d_NEW_RM_INP_TYP(TypeConverter.convert(d_NEW_RM_INP_TYP));
		struct.setd_RM_INP_TYP_CHANGE( ((d_RM_INP_TYP_CHANGE == null) ? (String)null : d_RM_INP_TYP_CHANGE[0]) );
		struct.setList_d_RM_INP_TYP_CHANGE(TypeConverter.convert(d_RM_INP_TYP_CHANGE));
		struct.setd_OLD_TRN_STOP_FLG( ((d_OLD_TRN_STOP_FLG == null) ? (String)null : d_OLD_TRN_STOP_FLG[0]) );
		struct.setList_d_OLD_TRN_STOP_FLG(TypeConverter.convert(d_OLD_TRN_STOP_FLG));
		struct.setd_NEW_TRN_STOP_FLG( ((d_NEW_TRN_STOP_FLG == null) ? (String)null : d_NEW_TRN_STOP_FLG[0]) );
		struct.setList_d_NEW_TRN_STOP_FLG(TypeConverter.convert(d_NEW_TRN_STOP_FLG));
		struct.setd_TRN_STOP_FLG_CHANGE( ((d_TRN_STOP_FLG_CHANGE == null) ? (String)null : d_TRN_STOP_FLG_CHANGE[0]) );
		struct.setList_d_TRN_STOP_FLG_CHANGE(TypeConverter.convert(d_TRN_STOP_FLG_CHANGE));
		struct.setd_OLD_SET_LT( ((d_OLD_SET_LT == null) ? (String)null : d_OLD_SET_LT[0]) );
		struct.setList_d_OLD_SET_LT(TypeConverter.convert(d_OLD_SET_LT));
		struct.setd_NEW_SET_LT( ((d_NEW_SET_LT == null) ? (String)null : d_NEW_SET_LT[0]) );
		struct.setList_d_NEW_SET_LT(TypeConverter.convert(d_NEW_SET_LT));
		struct.setd_SET_LT_CHANGE( ((d_SET_LT_CHANGE == null) ? (String)null : d_SET_LT_CHANGE[0]) );
		struct.setList_d_SET_LT_CHANGE(TypeConverter.convert(d_SET_LT_CHANGE));
		struct.setd_OLD_JANCODE( ((d_OLD_JANCODE == null) ? (String)null : d_OLD_JANCODE[0]) );
		struct.setList_d_OLD_JANCODE(TypeConverter.convert(d_OLD_JANCODE));
		struct.setd_NEW_JANCODE( ((d_NEW_JANCODE == null) ? (String)null : d_NEW_JANCODE[0]) );
		struct.setList_d_NEW_JANCODE(TypeConverter.convert(d_NEW_JANCODE));
		struct.setd_JANCODE_CHANGE( ((d_JANCODE_CHANGE == null) ? (String)null : d_JANCODE_CHANGE[0]) );
		struct.setList_d_JANCODE_CHANGE(TypeConverter.convert(d_JANCODE_CHANGE));
		struct.setd_OLD_MAX_STOCK_QTY( ((d_OLD_MAX_STOCK_QTY == null) ? (String)null : d_OLD_MAX_STOCK_QTY[0]) );
		struct.setList_d_OLD_MAX_STOCK_QTY(TypeConverter.convert(d_OLD_MAX_STOCK_QTY));
		struct.setd_NEW_MAX_STOCK_QTY( ((d_NEW_MAX_STOCK_QTY == null) ? (String)null : d_NEW_MAX_STOCK_QTY[0]) );
		struct.setList_d_NEW_MAX_STOCK_QTY(TypeConverter.convert(d_NEW_MAX_STOCK_QTY));
		struct.setd_MAX_STOCK_QTY_CHANGE( ((d_MAX_STOCK_QTY_CHANGE == null) ? (String)null : d_MAX_STOCK_QTY_CHANGE[0]) );
		struct.setList_d_MAX_STOCK_QTY_CHANGE(TypeConverter.convert(d_MAX_STOCK_QTY_CHANGE));
		struct.setd_OLD_SHIP_DEADLINE_YEAR( ((d_OLD_SHIP_DEADLINE_YEAR == null) ? (String)null : d_OLD_SHIP_DEADLINE_YEAR[0]) );
		struct.setList_d_OLD_SHIP_DEADLINE_YEAR(TypeConverter.convert(d_OLD_SHIP_DEADLINE_YEAR));
		struct.setd_NEW_SHIP_DEADLINE_YEAR( ((d_NEW_SHIP_DEADLINE_YEAR == null) ? (String)null : d_NEW_SHIP_DEADLINE_YEAR[0]) );
		struct.setList_d_NEW_SHIP_DEADLINE_YEAR(TypeConverter.convert(d_NEW_SHIP_DEADLINE_YEAR));
		struct.setd_SHIP_DEADLINE_YEAR_CHANGE( ((d_SHIP_DEADLINE_YEAR_CHANGE == null) ? (String)null : d_SHIP_DEADLINE_YEAR_CHANGE[0]) );
		struct.setList_d_SHIP_DEADLINE_YEAR_CHANGE(TypeConverter.convert(d_SHIP_DEADLINE_YEAR_CHANGE));
		struct.setd_OLD_SHIP_DEADLINE_MONTH( ((d_OLD_SHIP_DEADLINE_MONTH == null) ? (String)null : d_OLD_SHIP_DEADLINE_MONTH[0]) );
		struct.setList_d_OLD_SHIP_DEADLINE_MONTH(TypeConverter.convert(d_OLD_SHIP_DEADLINE_MONTH));
		struct.setd_NEW_SHIP_DEADLINE_MONTH( ((d_NEW_SHIP_DEADLINE_MONTH == null) ? (String)null : d_NEW_SHIP_DEADLINE_MONTH[0]) );
		struct.setList_d_NEW_SHIP_DEADLINE_MONTH(TypeConverter.convert(d_NEW_SHIP_DEADLINE_MONTH));
		struct.setd_SHIP_DEADLINE_MONTH_CHANGE( ((d_SHIP_DEADLINE_MONTH_CHANGE == null) ? (String)null : d_SHIP_DEADLINE_MONTH_CHANGE[0]) );
		struct.setList_d_SHIP_DEADLINE_MONTH_CHANGE(TypeConverter.convert(d_SHIP_DEADLINE_MONTH_CHANGE));
		struct.setd_OLD_SHIP_DEADLINE_DAY( ((d_OLD_SHIP_DEADLINE_DAY == null) ? (String)null : d_OLD_SHIP_DEADLINE_DAY[0]) );
		struct.setList_d_OLD_SHIP_DEADLINE_DAY(TypeConverter.convert(d_OLD_SHIP_DEADLINE_DAY));
		struct.setd_NEW_SHIP_DEADLINE_DAY( ((d_NEW_SHIP_DEADLINE_DAY == null) ? (String)null : d_NEW_SHIP_DEADLINE_DAY[0]) );
		struct.setList_d_NEW_SHIP_DEADLINE_DAY(TypeConverter.convert(d_NEW_SHIP_DEADLINE_DAY));
		struct.setd_SHIP_DEADLINE_DAY_CHANGE( ((d_SHIP_DEADLINE_DAY_CHANGE == null) ? (String)null : d_SHIP_DEADLINE_DAY_CHANGE[0]) );
		struct.setList_d_SHIP_DEADLINE_DAY_CHANGE(TypeConverter.convert(d_SHIP_DEADLINE_DAY_CHANGE));
		struct.setd_OLD_CUST_DLV_LOC_CD( ((d_OLD_CUST_DLV_LOC_CD == null) ? (String)null : d_OLD_CUST_DLV_LOC_CD[0]) );
		struct.setList_d_OLD_CUST_DLV_LOC_CD(TypeConverter.convert(d_OLD_CUST_DLV_LOC_CD));
		struct.setd_NEW_CUST_DLV_LOC_CD( ((d_NEW_CUST_DLV_LOC_CD == null) ? (String)null : d_NEW_CUST_DLV_LOC_CD[0]) );
		struct.setList_d_NEW_CUST_DLV_LOC_CD(TypeConverter.convert(d_NEW_CUST_DLV_LOC_CD));
		struct.setd_CUST_DLV_LOC_CD_CHANGE( ((d_CUST_DLV_LOC_CD_CHANGE == null) ? (String)null : d_CUST_DLV_LOC_CD_CHANGE[0]) );
		struct.setList_d_CUST_DLV_LOC_CD_CHANGE(TypeConverter.convert(d_CUST_DLV_LOC_CD_CHANGE));
		struct.setd_OLD_CUST_FLG( ((d_OLD_CUST_FLG == null) ? (String)null : d_OLD_CUST_FLG[0]) );
		struct.setList_d_OLD_CUST_FLG(TypeConverter.convert(d_OLD_CUST_FLG));
		struct.setd_NEW_CUST_FLG( ((d_NEW_CUST_FLG == null) ? (String)null : d_NEW_CUST_FLG[0]) );
		struct.setList_d_NEW_CUST_FLG(TypeConverter.convert(d_NEW_CUST_FLG));
		struct.setd_CUST_FLG_CHANGE( ((d_CUST_FLG_CHANGE == null) ? (String)null : d_CUST_FLG_CHANGE[0]) );
		struct.setList_d_CUST_FLG_CHANGE(TypeConverter.convert(d_CUST_FLG_CHANGE));
		struct.setd_OLD_DELIVERY_FLG( ((d_OLD_DELIVERY_FLG == null) ? (String)null : d_OLD_DELIVERY_FLG[0]) );
		struct.setList_d_OLD_DELIVERY_FLG(TypeConverter.convert(d_OLD_DELIVERY_FLG));
		struct.setd_NEW_DELIVERY_FLG( ((d_NEW_DELIVERY_FLG == null) ? (String)null : d_NEW_DELIVERY_FLG[0]) );
		struct.setList_d_NEW_DELIVERY_FLG(TypeConverter.convert(d_NEW_DELIVERY_FLG));
		struct.setd_DELIVERY_FLG_CHANGE( ((d_DELIVERY_FLG_CHANGE == null) ? (String)null : d_DELIVERY_FLG_CHANGE[0]) );
		struct.setList_d_DELIVERY_FLG_CHANGE(TypeConverter.convert(d_DELIVERY_FLG_CHANGE));
		struct.setd_OLD_BALA_ACCO_FLG( ((d_OLD_BALA_ACCO_FLG == null) ? (String)null : d_OLD_BALA_ACCO_FLG[0]) );
		struct.setList_d_OLD_BALA_ACCO_FLG(TypeConverter.convert(d_OLD_BALA_ACCO_FLG));
		struct.setd_NEW_BALA_ACCO_FLG( ((d_NEW_BALA_ACCO_FLG == null) ? (String)null : d_NEW_BALA_ACCO_FLG[0]) );
		struct.setList_d_NEW_BALA_ACCO_FLG(TypeConverter.convert(d_NEW_BALA_ACCO_FLG));
		struct.setd_BALA_ACCO_FLG_CHANGE( ((d_BALA_ACCO_FLG_CHANGE == null) ? (String)null : d_BALA_ACCO_FLG_CHANGE[0]) );
		struct.setList_d_BALA_ACCO_FLG_CHANGE(TypeConverter.convert(d_BALA_ACCO_FLG_CHANGE));
		struct.setd_OLD_UNIT_COST_USE_TYP( ((d_OLD_UNIT_COST_USE_TYP == null) ? (String)null : d_OLD_UNIT_COST_USE_TYP[0]) );
		struct.setList_d_OLD_UNIT_COST_USE_TYP(TypeConverter.convert(d_OLD_UNIT_COST_USE_TYP));
		struct.setd_NEW_UNIT_COST_USE_TYP( ((d_NEW_UNIT_COST_USE_TYP == null) ? (String)null : d_NEW_UNIT_COST_USE_TYP[0]) );
		struct.setList_d_NEW_UNIT_COST_USE_TYP(TypeConverter.convert(d_NEW_UNIT_COST_USE_TYP));
		struct.setd_UNIT_COST_USE_TYP_CHANGE( ((d_UNIT_COST_USE_TYP_CHANGE == null) ? (String)null : d_UNIT_COST_USE_TYP_CHANGE[0]) );
		struct.setList_d_UNIT_COST_USE_TYP_CHANGE(TypeConverter.convert(d_UNIT_COST_USE_TYP_CHANGE));
		struct.setd_OLD_PAY_TARGET_NAME_1( ((d_OLD_PAY_TARGET_NAME_1 == null) ? (String)null : d_OLD_PAY_TARGET_NAME_1[0]) );
		struct.setList_d_OLD_PAY_TARGET_NAME_1(TypeConverter.convert(d_OLD_PAY_TARGET_NAME_1));
		struct.setd_NEW_PAY_TARGET_NAME_1( ((d_NEW_PAY_TARGET_NAME_1 == null) ? (String)null : d_NEW_PAY_TARGET_NAME_1[0]) );
		struct.setList_d_NEW_PAY_TARGET_NAME_1(TypeConverter.convert(d_NEW_PAY_TARGET_NAME_1));
		struct.setd_PAY_TARGET_NAME_1_CHANGE( ((d_PAY_TARGET_NAME_1_CHANGE == null) ? (String)null : d_PAY_TARGET_NAME_1_CHANGE[0]) );
		struct.setList_d_PAY_TARGET_NAME_1_CHANGE(TypeConverter.convert(d_PAY_TARGET_NAME_1_CHANGE));
		struct.setd_OLD_PAY_METHOD_1( ((d_OLD_PAY_METHOD_1 == null) ? (String)null : d_OLD_PAY_METHOD_1[0]) );
		struct.setList_d_OLD_PAY_METHOD_1(TypeConverter.convert(d_OLD_PAY_METHOD_1));
		struct.setd_NEW_PAY_METHOD_1( ((d_NEW_PAY_METHOD_1 == null) ? (String)null : d_NEW_PAY_METHOD_1[0]) );
		struct.setList_d_NEW_PAY_METHOD_1(TypeConverter.convert(d_NEW_PAY_METHOD_1));
		struct.setd_PAY_METHOD_1_CHANGE( ((d_PAY_METHOD_1_CHANGE == null) ? (String)null : d_PAY_METHOD_1_CHANGE[0]) );
		struct.setList_d_PAY_METHOD_1_CHANGE(TypeConverter.convert(d_PAY_METHOD_1_CHANGE));
		struct.setd_OLD_PAY_TARGET_NAME_2( ((d_OLD_PAY_TARGET_NAME_2 == null) ? (String)null : d_OLD_PAY_TARGET_NAME_2[0]) );
		struct.setList_d_OLD_PAY_TARGET_NAME_2(TypeConverter.convert(d_OLD_PAY_TARGET_NAME_2));
		struct.setd_NEW_PAY_TARGET_NAME_2( ((d_NEW_PAY_TARGET_NAME_2 == null) ? (String)null : d_NEW_PAY_TARGET_NAME_2[0]) );
		struct.setList_d_NEW_PAY_TARGET_NAME_2(TypeConverter.convert(d_NEW_PAY_TARGET_NAME_2));
		struct.setd_PAY_TARGET_NAME_2_CHANGE( ((d_PAY_TARGET_NAME_2_CHANGE == null) ? (String)null : d_PAY_TARGET_NAME_2_CHANGE[0]) );
		struct.setList_d_PAY_TARGET_NAME_2_CHANGE(TypeConverter.convert(d_PAY_TARGET_NAME_2_CHANGE));
		struct.setd_OLD_BUSINESS_WH_FLG( ((d_OLD_BUSINESS_WH_FLG == null) ? (String)null : d_OLD_BUSINESS_WH_FLG[0]) );
		struct.setList_d_OLD_BUSINESS_WH_FLG(TypeConverter.convert(d_OLD_BUSINESS_WH_FLG));
		struct.setd_NEW_BUSINESS_WH_FLG( ((d_NEW_BUSINESS_WH_FLG == null) ? (String)null : d_NEW_BUSINESS_WH_FLG[0]) );
		struct.setList_d_NEW_BUSINESS_WH_FLG(TypeConverter.convert(d_NEW_BUSINESS_WH_FLG));
		struct.setd_BUSINESS_WH_FLG_CHANGE( ((d_BUSINESS_WH_FLG_CHANGE == null) ? (String)null : d_BUSINESS_WH_FLG_CHANGE[0]) );
		struct.setList_d_BUSINESS_WH_FLG_CHANGE(TypeConverter.convert(d_BUSINESS_WH_FLG_CHANGE));
		struct.setd_OLD_REPRESENT_FLG( ((d_OLD_REPRESENT_FLG == null) ? (String)null : d_OLD_REPRESENT_FLG[0]) );
		struct.setList_d_OLD_REPRESENT_FLG(TypeConverter.convert(d_OLD_REPRESENT_FLG));
		struct.setd_NEW_REPRESENT_FLG( ((d_NEW_REPRESENT_FLG == null) ? (String)null : d_NEW_REPRESENT_FLG[0]) );
		struct.setList_d_NEW_REPRESENT_FLG(TypeConverter.convert(d_NEW_REPRESENT_FLG));
		struct.setd_REPRESENT_FLG_CHANGE( ((d_REPRESENT_FLG_CHANGE == null) ? (String)null : d_REPRESENT_FLG_CHANGE[0]) );
		struct.setList_d_REPRESENT_FLG_CHANGE(TypeConverter.convert(d_REPRESENT_FLG_CHANGE));
		struct.setd_OLD_SPCL_PRICE_TYP( ((d_OLD_SPCL_PRICE_TYP == null) ? (String)null : d_OLD_SPCL_PRICE_TYP[0]) );
		struct.setList_d_OLD_SPCL_PRICE_TYP(TypeConverter.convert(d_OLD_SPCL_PRICE_TYP));
		struct.setd_NEW_SPCL_PRICE_TYP( ((d_NEW_SPCL_PRICE_TYP == null) ? (String)null : d_NEW_SPCL_PRICE_TYP[0]) );
		struct.setList_d_NEW_SPCL_PRICE_TYP(TypeConverter.convert(d_NEW_SPCL_PRICE_TYP));
		struct.setd_SPCL_PRICE_TYP_CHANGE( ((d_SPCL_PRICE_TYP_CHANGE == null) ? (String)null : d_SPCL_PRICE_TYP_CHANGE[0]) );
		struct.setList_d_SPCL_PRICE_TYP_CHANGE(TypeConverter.convert(d_SPCL_PRICE_TYP_CHANGE));
		struct.setd_OLD_UNIT_CD( ((d_OLD_UNIT_CD == null) ? (String)null : d_OLD_UNIT_CD[0]) );
		struct.setList_d_OLD_UNIT_CD(TypeConverter.convert(d_OLD_UNIT_CD));
		struct.setd_NEW_UNIT_CD( ((d_NEW_UNIT_CD == null) ? (String)null : d_NEW_UNIT_CD[0]) );
		struct.setList_d_NEW_UNIT_CD(TypeConverter.convert(d_NEW_UNIT_CD));
		struct.setd_UNIT_CD_CHANGE( ((d_UNIT_CD_CHANGE == null) ? (String)null : d_UNIT_CD_CHANGE[0]) );
		struct.setList_d_UNIT_CD_CHANGE(TypeConverter.convert(d_UNIT_CD_CHANGE));
		struct.setd_OLD_EFF_PHASE_OUT_DATE( ((d_OLD_EFF_PHASE_OUT_DATE == null) ? (String)null : d_OLD_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_d_OLD_EFF_PHASE_OUT_DATE(TypeConverter.convert(d_OLD_EFF_PHASE_OUT_DATE));
		struct.setd_NEW_EFF_PHASE_OUT_DATE( ((d_NEW_EFF_PHASE_OUT_DATE == null) ? (String)null : d_NEW_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_d_NEW_EFF_PHASE_OUT_DATE(TypeConverter.convert(d_NEW_EFF_PHASE_OUT_DATE));
		struct.setd_EFF_PHASE_OUT_DATE_CHANGE( ((d_EFF_PHASE_OUT_DATE_CHANGE == null) ? (String)null : d_EFF_PHASE_OUT_DATE_CHANGE[0]) );
		struct.setList_d_EFF_PHASE_OUT_DATE_CHANGE(TypeConverter.convert(d_EFF_PHASE_OUT_DATE_CHANGE));
		struct.setd_OLD_SALE_SIZE( ((d_OLD_SALE_SIZE == null) ? (String)null : d_OLD_SALE_SIZE[0]) );
		struct.setList_d_OLD_SALE_SIZE(TypeConverter.convert(d_OLD_SALE_SIZE));
		struct.setd_NEW_SALE_SIZE( ((d_NEW_SALE_SIZE == null) ? (String)null : d_NEW_SALE_SIZE[0]) );
		struct.setList_d_NEW_SALE_SIZE(TypeConverter.convert(d_NEW_SALE_SIZE));
		struct.setd_SALE_SIZE_CHANGE( ((d_SALE_SIZE_CHANGE == null) ? (String)null : d_SALE_SIZE_CHANGE[0]) );
		struct.setList_d_SALE_SIZE_CHANGE(TypeConverter.convert(d_SALE_SIZE_CHANGE));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AZ0060010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAZ0060010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAZ0060010Struct";   // JSP先のバインド名(Struct)の指定
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
					AZ0060010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0060010Entity entity = control.entity;
		AZ0060010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AZ0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AZ0060010Control control;
		AZ0060010Entity  entity = null;
		AZ0060010Struct  struct = null;

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

			if( (control = (AZ0060010Control)so.getAttribute("AZ0060010Control_"+request.getSession(false).getId())) == null ) {
				control = new AZ0060010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AZ0060010Control();
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
				} else if( isClick(request, "MastInfo") ) {
					if ( !isCryptical(request, so, params, "MastInfo") ) return ERROR_TARGET;
					target = onClickMastInfo(request, response, so, params, control);
					control.setButton("MastInfo");
				} else if( isClick(request, "ApprInfo") ) {
					if ( !isCryptical(request, so, params, "ApprInfo") ) return ERROR_TARGET;
					target = onClickApprInfo(request, response, so, params, control);
					control.setButton("ApprInfo");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "ClickShow") ) {
					if ( !isCryptical(request, so, params, "ClickShow") ) return ERROR_TARGET;
					target = onClickClickShow(request, response, so, params, control);
					control.setButton("ClickShow");
				} else if( isClick(request, "ClickDetail") ) {
					if ( !isCryptical(request, so, params, "ClickDetail") ) return ERROR_TARGET;
					target = onClickClickDetail(request, response, so, params, control);
					control.setButton("ClickDetail");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AZ0060010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "MastInfo") && bFLG_DISCONNECT_MastInfo)
				|| (isClick(request, "ApprInfo") && bFLG_DISCONNECT_ApprInfo)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "ClickShow") && bFLG_DISCONNECT_ClickShow)
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
	private  static boolean bFLG_DISCONNECT_MastInfo = true;
	private  static boolean bFLG_DISCONNECT_ApprInfo = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_ClickShow = true;
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
		return "com.nec.jp.orteus.metamorBase.AZ0060.AZ0060010Servlet";
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
	public AZ0060010Servlet()
	{
		//{{user_implement_dev:<AZ0060010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_ApprAssort = true;
		bFLG_DISCONNECT_ReserveAssort = true;
		bFLG_DISCONNECT_ReserveDelAssort = true;
		bFLG_DISCONNECT_ApprDelAssort = true;
		bFLG_DISCONNECT_CheckAll = true;
		bFLG_DISCONNECT_MastInfo = true;
		bFLG_DISCONNECT_ApprInfo = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<AZ0060010_DisConnect_FLG>

		//{{user_implement_dev:<AZ0060010Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AZ0060010Servlet>
	}

	//////////////////////////////

}
