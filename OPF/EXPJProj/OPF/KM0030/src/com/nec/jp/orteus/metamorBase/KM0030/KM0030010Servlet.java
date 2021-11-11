/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0030/src/com/nec/jp/orteus/metamorBase/KM0030/KM0030010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0030;

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
 * CLASS     : KM0030010Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0030010Servlet extends HttpServlet
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
	 * @param control KM0030010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, KM0030010Control control)
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
	 * @param control KM0030010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, KM0030010Control control)
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
	 * @param control KM0030010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
			logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "KM0030010"+" $Revision: 1.2 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0030010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0030010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0030010Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * 修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0030010Controlクラスインスタンス
	 */
	public String onClickModify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickModify");
		//{{user_implement_dev:<onClickModify>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Modify");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickModify>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickModify");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0030010Controlクラスインスタンス
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0030010Controlクラスインスタンス
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Update");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0030010Controlクラスインスタンス
	 */
	public String onClickDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");
		//{{user_implement_dev:<onClickDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Delete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickDelete>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0030010Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KM0030010Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0030010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] ESTIMATE_NO = ((params.containsKey("ESTIMATE_NO")) ? (String[])params.get("ESTIMATE_NO") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] rdoSHIP_INST = ((params.containsKey("rdoSHIP_INST")) ? (String[])params.get("rdoSHIP_INST") : (String[])null);
		String[] rdoSHIP_UPDATE = ((params.containsKey("rdoSHIP_UPDATE")) ? (String[])params.get("rdoSHIP_UPDATE") : (String[])null);
		String[] l_DETAL_NO = ((params.containsKey("l_DETAL_NO")) ? (String[])params.get("l_DETAL_NO") : (String[])null);
		String[] l_ODR_NO = ((params.containsKey("l_ODR_NO")) ? (String[])params.get("l_ODR_NO") : (String[])null);
		String[] l_ODR_TYP = ((params.containsKey("l_ODR_TYP")) ? (String[])params.get("l_ODR_TYP") : (String[])null);
		String[] l_CUST_ODR_NO = ((params.containsKey("l_CUST_ODR_NO")) ? (String[])params.get("l_CUST_ODR_NO") : (String[])null);
		String[] l_CUST_ITEM_CD = ((params.containsKey("l_CUST_ITEM_CD")) ? (String[])params.get("l_CUST_ITEM_CD") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_DESINATED_DLV_DATE = ((params.containsKey("l_DESINATED_DLV_DATE")) ? (String[])params.get("l_DESINATED_DLV_DATE") : (String[])null);
		String[] l_ESTIMATE_QTY = ((params.containsKey("l_ESTIMATE_QTY")) ? (String[])params.get("l_ESTIMATE_QTY") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] DETAIL_NO = ((params.containsKey("DETAIL_NO")) ? (String[])params.get("DETAIL_NO") : (String[])null);
		String[] ODR_ACPT_DATE = ((params.containsKey("ODR_ACPT_DATE")) ? (String[])params.get("ODR_ACPT_DATE") : (String[])null);
		String[] ACPT_ODR_CD = ((params.containsKey("ACPT_ODR_CD")) ? (String[])params.get("ACPT_ODR_CD") : (String[])null);
		String[] c_DOODR = ((params.containsKey("c_DOODR")) ? (String[])params.get("c_DOODR") : (String[])null);
		String[] ODR_TYP = ((params.containsKey("ODR_TYP")) ? (String[])params.get("ODR_TYP") : (String[])null);
		String[] PREPARE_QTY = ((params.containsKey("PREPARE_QTY")) ? (String[])params.get("PREPARE_QTY") : (String[])null);
		String[] CUST_ODR_NO = ((params.containsKey("CUST_ODR_NO")) ? (String[])params.get("CUST_ODR_NO") : (String[])null);
		String[] JOB_ODR_DLV_DATE = ((params.containsKey("JOB_ODR_DLV_DATE")) ? (String[])params.get("JOB_ODR_DLV_DATE") : (String[])null);
		String[] DESINATED_DLV_DATE = ((params.containsKey("DESINATED_DLV_DATE")) ? (String[])params.get("DESINATED_DLV_DATE") : (String[])null);
		String[] ALC_GRP_CD = ((params.containsKey("ALC_GRP_CD")) ? (String[])params.get("ALC_GRP_CD") : (String[])null);
		String[] DLV_LOC_CD = ((params.containsKey("DLV_LOC_CD")) ? (String[])params.get("DLV_LOC_CD") : (String[])null);
		String[] c_INPUTODRCD = ((params.containsKey("c_INPUTODRCD")) ? (String[])params.get("c_INPUTODRCD") : (String[])null);
		String[] ESTIMATE_TYPE = ((params.containsKey("ESTIMATE_TYPE")) ? (String[])params.get("ESTIMATE_TYPE") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] CUST_ITEM_CD = ((params.containsKey("CUST_ITEM_CD")) ? (String[])params.get("CUST_ITEM_CD") : (String[])null);
		String[] CUST_ITEM_NAME = ((params.containsKey("CUST_ITEM_NAME")) ? (String[])params.get("CUST_ITEM_NAME") : (String[])null);
		String[] QTY = ((params.containsKey("QTY")) ? (String[])params.get("QTY") : (String[])null);
		String[] QTY_UNIT = ((params.containsKey("QTY_UNIT")) ? (String[])params.get("QTY_UNIT") : (String[])null);
		String[] ODR_UNIT_PRICE = ((params.containsKey("ODR_UNIT_PRICE")) ? (String[])params.get("ODR_UNIT_PRICE") : (String[])null);
		String[] ODR_PRICE_UNIT = ((params.containsKey("ODR_PRICE_UNIT")) ? (String[])params.get("ODR_PRICE_UNIT") : (String[])null);
		String[] ODR_AMOUNT = ((params.containsKey("ODR_AMOUNT")) ? (String[])params.get("ODR_AMOUNT") : (String[])null);
		String[] ODR_AMOUNT_EXCH_RATES = ((params.containsKey("ODR_AMOUNT_EXCH_RATES")) ? (String[])params.get("ODR_AMOUNT_EXCH_RATES") : (String[])null);
		String[] ISSUE_INST_COMMENT = ((params.containsKey("ISSUE_INST_COMMENT")) ? (String[])params.get("ISSUE_INST_COMMENT") : (String[])null);
		String[] APPROVED_COMMENT = ((params.containsKey("APPROVED_COMMENT")) ? (String[])params.get("APPROVED_COMMENT") : (String[])null);
		String[] CUST_CHRG_PSN_CD = ((params.containsKey("CUST_CHRG_PSN_CD")) ? (String[])params.get("CUST_CHRG_PSN_CD") : (String[])null);
		String[] CUST_CHRG_PSN_NAME = ((params.containsKey("CUST_CHRG_PSN_NAME")) ? (String[])params.get("CUST_CHRG_PSN_NAME") : (String[])null);
		String[] ES_ORG_CD = ((params.containsKey("ES_ORG_CD")) ? (String[])params.get("ES_ORG_CD") : (String[])null);
		String[] ES_ORG_NAME = ((params.containsKey("ES_ORG_NAME")) ? (String[])params.get("ES_ORG_NAME") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] l_UNIT_CD = ((params.containsKey("l_UNIT_CD")) ? (String[])params.get("l_UNIT_CD") : (String[])null);
		String[] l_ESTIMATE_UNIT_PRICE = ((params.containsKey("l_ESTIMATE_UNIT_PRICE")) ? (String[])params.get("l_ESTIMATE_UNIT_PRICE") : (String[])null);
		String[] l_ODR_AMOUNT = ((params.containsKey("l_ODR_AMOUNT")) ? (String[])params.get("l_ODR_AMOUNT") : (String[])null);
		String[] l_ODR_AMOUNT_EXCH_RATES = ((params.containsKey("l_ODR_AMOUNT_EXCH_RATES")) ? (String[])params.get("l_ODR_AMOUNT_EXCH_RATES") : (String[])null);
		String[] l_DLV_LOC_CD = ((params.containsKey("l_DLV_LOC_CD")) ? (String[])params.get("l_DLV_LOC_CD") : (String[])null);
		String[] l_DLV_LOC_NAME = ((params.containsKey("l_DLV_LOC_NAME")) ? (String[])params.get("l_DLV_LOC_NAME") : (String[])null);
		String[] l_DEPO_TYP = ((params.containsKey("l_DEPO_TYP")) ? (String[])params.get("l_DEPO_TYP") : (String[])null);
		String[] l_CUST_ITEM_NAME = ((params.containsKey("l_CUST_ITEM_NAME")) ? (String[])params.get("l_CUST_ITEM_NAME") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_ODR_ACPT_DATE = ((params.containsKey("l_ODR_ACPT_DATE")) ? (String[])params.get("l_ODR_ACPT_DATE") : (String[])null);
		String[] l_JOB_ODR_DLV_DATE = ((params.containsKey("l_JOB_ODR_DLV_DATE")) ? (String[])params.get("l_JOB_ODR_DLV_DATE") : (String[])null);
		String[] l_ALC_GRP_CD = ((params.containsKey("l_ALC_GRP_CD")) ? (String[])params.get("l_ALC_GRP_CD") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] l_APPR_REMARKS = ((params.containsKey("l_APPR_REMARKS")) ? (String[])params.get("l_APPR_REMARKS") : (String[])null);
		String[] l_CUST_CHRG_PSN_NAME = ((params.containsKey("l_CUST_CHRG_PSN_NAME")) ? (String[])params.get("l_CUST_CHRG_PSN_NAME") : (String[])null);
		String[] l_CUST_CHRG_ORG_NAME = ((params.containsKey("l_CUST_CHRG_ORG_NAME")) ? (String[])params.get("l_CUST_CHRG_ORG_NAME") : (String[])null);
		String[] l_ESTIMATE_TYPE = ((params.containsKey("l_ESTIMATE_TYPE")) ? (String[])params.get("l_ESTIMATE_TYPE") : (String[])null);
		String[] l_ESTIMATE_ITEM_NAME = ((params.containsKey("l_ESTIMATE_ITEM_NAME")) ? (String[])params.get("l_ESTIMATE_ITEM_NAME") : (String[])null);
		String[] l_ODR_QTY = ((params.containsKey("l_ODR_QTY")) ? (String[])params.get("l_ODR_QTY") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] h_UPDATE_FLG = ((params.containsKey("h_UPDATE_FLG")) ? (String[])params.get("h_UPDATE_FLG") : (String[])null);
		String[] l_TODR_MODIFY_COUNT = ((params.containsKey("l_TODR_MODIFY_COUNT")) ? (String[])params.get("l_TODR_MODIFY_COUNT") : (String[])null);
		String[] l_TEST_MODIFY_COUNT = ((params.containsKey("l_TEST_MODIFY_COUNT")) ? (String[])params.get("l_TEST_MODIFY_COUNT") : (String[])null);
		String[] l_TPJ_MODIFY_COUNT = ((params.containsKey("l_TPJ_MODIFY_COUNT")) ? (String[])params.get("l_TPJ_MODIFY_COUNT") : (String[])null);
		String[] l_h_ESTIMATE_TYPE = ((params.containsKey("l_h_ESTIMATE_TYPE")) ? (String[])params.get("l_h_ESTIMATE_TYPE") : (String[])null);
		String[] h_ESTIMATE_TYPE = ((params.containsKey("h_ESTIMATE_TYPE")) ? (String[])params.get("h_ESTIMATE_TYPE") : (String[])null);
		String[] l_h_PREC_ARRANGE_FLG = ((params.containsKey("l_h_PREC_ARRANGE_FLG")) ? (String[])params.get("l_h_PREC_ARRANGE_FLG") : (String[])null);
		String[] l_c_DOODR = ((params.containsKey("l_c_DOODR")) ? (String[])params.get("l_c_DOODR") : (String[])null);
		String[] l_c_INPUTODRCD = ((params.containsKey("l_c_INPUTODRCD")) ? (String[])params.get("l_c_INPUTODRCD") : (String[])null);
		String[] h_PREC_ARRANGE_FLG = ((params.containsKey("h_PREC_ARRANGE_FLG")) ? (String[])params.get("h_PREC_ARRANGE_FLG") : (String[])null);
		String[] l_h_ODR_TYP = ((params.containsKey("l_h_ODR_TYP")) ? (String[])params.get("l_h_ODR_TYP") : (String[])null);
		String[] h_ODR_TYP = ((params.containsKey("h_ODR_TYP")) ? (String[])params.get("h_ODR_TYP") : (String[])null);
		String[] h_ODR_TYP3 = ((params.containsKey("h_ODR_TYP3")) ? (String[])params.get("h_ODR_TYP3") : (String[])null);
		String[] h_APR_ODR = ((params.containsKey("h_APR_ODR")) ? (String[])params.get("h_APR_ODR") : (String[])null);
		String[] h_PRD_REQ_JOB_ODR_TYP_1 = ((params.containsKey("h_PRD_REQ_JOB_ODR_TYP_1")) ? (String[])params.get("h_PRD_REQ_JOB_ODR_TYP_1") : (String[])null);
		String[] h_PRD_REQ_JOB_ODR_TYP_2 = ((params.containsKey("h_PRD_REQ_JOB_ODR_TYP_2")) ? (String[])params.get("h_PRD_REQ_JOB_ODR_TYP_2") : (String[])null);
		String[] h_DLV_LOC_CD = ((params.containsKey("h_DLV_LOC_CD")) ? (String[])params.get("h_DLV_LOC_CD") : (String[])null);
		String[] h_ANS_DLV_DATE_EXIST_FLG = ((params.containsKey("h_ANS_DLV_DATE_EXIST_FLG")) ? (String[])params.get("h_ANS_DLV_DATE_EXIST_FLG") : (String[])null);
		String[] ITEM_NAME_R = ((params.containsKey("ITEM_NAME_R")) ? (String[])params.get("ITEM_NAME_R") : (String[])null);
		String[] l_h_ANS_DLV_DATE_EXIST_FLG = ((params.containsKey("l_h_ANS_DLV_DATE_EXIST_FLG")) ? (String[])params.get("l_h_ANS_DLV_DATE_EXIST_FLG") : (String[])null);
		String[] l_h_DEPO_TYP = ((params.containsKey("l_h_DEPO_TYP")) ? (String[])params.get("l_h_DEPO_TYP") : (String[])null);
		String[] l_OWN_PERSON_CD = ((params.containsKey("l_OWN_PERSON_CD")) ? (String[])params.get("l_OWN_PERSON_CD") : (String[])null);
		String[] l_OWN_ORG_CD = ((params.containsKey("l_OWN_ORG_CD")) ? (String[])params.get("l_OWN_ORG_CD") : (String[])null);

		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setESTIMATE_NO( ((ESTIMATE_NO == null) ? (String)null : ESTIMATE_NO[0]) );
		struct.setList_ESTIMATE_NO(TypeConverter.convert(ESTIMATE_NO));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setrdoSHIP_INST( ((rdoSHIP_INST == null) ? (String)null : rdoSHIP_INST[0]) );
		struct.setList_rdoSHIP_INST(TypeConverter.convert(rdoSHIP_INST));
		struct.setrdoSHIP_UPDATE( ((rdoSHIP_UPDATE == null) ? (String)null : rdoSHIP_UPDATE[0]) );
		struct.setList_rdoSHIP_UPDATE(TypeConverter.convert(rdoSHIP_UPDATE));
		struct.setl_DETAL_NO( ((l_DETAL_NO == null) ? (String)null : l_DETAL_NO[0]) );
		struct.setList_l_DETAL_NO(TypeConverter.convert(l_DETAL_NO));
		struct.setl_ODR_NO( ((l_ODR_NO == null) ? (String)null : l_ODR_NO[0]) );
		struct.setList_l_ODR_NO(TypeConverter.convert(l_ODR_NO));
		struct.setl_ODR_TYP( ((l_ODR_TYP == null) ? (String)null : l_ODR_TYP[0]) );
		struct.setList_l_ODR_TYP(TypeConverter.convert(l_ODR_TYP));
		struct.setl_CUST_ODR_NO( ((l_CUST_ODR_NO == null) ? (String)null : l_CUST_ODR_NO[0]) );
		struct.setList_l_CUST_ODR_NO(TypeConverter.convert(l_CUST_ODR_NO));
		struct.setl_CUST_ITEM_CD( ((l_CUST_ITEM_CD == null) ? (String)null : l_CUST_ITEM_CD[0]) );
		struct.setList_l_CUST_ITEM_CD(TypeConverter.convert(l_CUST_ITEM_CD));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_DESINATED_DLV_DATE( ((l_DESINATED_DLV_DATE == null) ? (String)null : l_DESINATED_DLV_DATE[0]) );
		struct.setList_l_DESINATED_DLV_DATE(TypeConverter.convert(l_DESINATED_DLV_DATE));
		struct.setl_ESTIMATE_QTY( ((l_ESTIMATE_QTY == null) ? (String)null : l_ESTIMATE_QTY[0]) );
		struct.setList_l_ESTIMATE_QTY(TypeConverter.convert(l_ESTIMATE_QTY));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setDETAIL_NO( ((DETAIL_NO == null) ? (String)null : DETAIL_NO[0]) );
		struct.setList_DETAIL_NO(TypeConverter.convert(DETAIL_NO));
		struct.setODR_ACPT_DATE( ((ODR_ACPT_DATE == null) ? (String)null : ODR_ACPT_DATE[0]) );
		struct.setList_ODR_ACPT_DATE(TypeConverter.convert(ODR_ACPT_DATE));
		struct.setACPT_ODR_CD( ((ACPT_ODR_CD == null) ? (String)null : ACPT_ODR_CD[0]) );
		struct.setList_ACPT_ODR_CD(TypeConverter.convert(ACPT_ODR_CD));
		struct.setc_DOODR( ((c_DOODR == null) ? (String)null : c_DOODR[0]) );
		struct.setList_c_DOODR(TypeConverter.convert(c_DOODR));
		struct.setODR_TYP( ((ODR_TYP == null) ? (String)null : ODR_TYP[0]) );
		struct.setList_ODR_TYP(TypeConverter.convert(ODR_TYP));
		struct.setPREPARE_QTY( ((PREPARE_QTY == null) ? (String)null : PREPARE_QTY[0]) );
		struct.setList_PREPARE_QTY(TypeConverter.convert(PREPARE_QTY));
		struct.setCUST_ODR_NO( ((CUST_ODR_NO == null) ? (String)null : CUST_ODR_NO[0]) );
		struct.setList_CUST_ODR_NO(TypeConverter.convert(CUST_ODR_NO));
		struct.setJOB_ODR_DLV_DATE( ((JOB_ODR_DLV_DATE == null) ? (String)null : JOB_ODR_DLV_DATE[0]) );
		struct.setList_JOB_ODR_DLV_DATE(TypeConverter.convert(JOB_ODR_DLV_DATE));
		struct.setDESINATED_DLV_DATE( ((DESINATED_DLV_DATE == null) ? (String)null : DESINATED_DLV_DATE[0]) );
		struct.setList_DESINATED_DLV_DATE(TypeConverter.convert(DESINATED_DLV_DATE));
		struct.setALC_GRP_CD( ((ALC_GRP_CD == null) ? (String)null : ALC_GRP_CD[0]) );
		struct.setList_ALC_GRP_CD(TypeConverter.convert(ALC_GRP_CD));
		struct.setDLV_LOC_CD( ((DLV_LOC_CD == null) ? (String)null : DLV_LOC_CD[0]) );
		struct.setList_DLV_LOC_CD(TypeConverter.convert(DLV_LOC_CD));
		struct.setc_INPUTODRCD( ((c_INPUTODRCD == null) ? (String)null : c_INPUTODRCD[0]) );
		struct.setList_c_INPUTODRCD(TypeConverter.convert(c_INPUTODRCD));
		struct.setESTIMATE_TYPE( ((ESTIMATE_TYPE == null) ? (String)null : ESTIMATE_TYPE[0]) );
		struct.setList_ESTIMATE_TYPE(TypeConverter.convert(ESTIMATE_TYPE));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setCUST_ITEM_CD( ((CUST_ITEM_CD == null) ? (String)null : CUST_ITEM_CD[0]) );
		struct.setList_CUST_ITEM_CD(TypeConverter.convert(CUST_ITEM_CD));
		struct.setCUST_ITEM_NAME( ((CUST_ITEM_NAME == null) ? (String)null : CUST_ITEM_NAME[0]) );
		struct.setList_CUST_ITEM_NAME(TypeConverter.convert(CUST_ITEM_NAME));
		struct.setQTY( ((QTY == null) ? (String)null : QTY[0]) );
		struct.setList_QTY(TypeConverter.convert(QTY));
		struct.setQTY_UNIT( ((QTY_UNIT == null) ? (String)null : QTY_UNIT[0]) );
		struct.setList_QTY_UNIT(TypeConverter.convert(QTY_UNIT));
		struct.setODR_UNIT_PRICE( ((ODR_UNIT_PRICE == null) ? (String)null : ODR_UNIT_PRICE[0]) );
		struct.setList_ODR_UNIT_PRICE(TypeConverter.convert(ODR_UNIT_PRICE));
		struct.setODR_PRICE_UNIT( ((ODR_PRICE_UNIT == null) ? (String)null : ODR_PRICE_UNIT[0]) );
		struct.setList_ODR_PRICE_UNIT(TypeConverter.convert(ODR_PRICE_UNIT));
		struct.setODR_AMOUNT( ((ODR_AMOUNT == null) ? (String)null : ODR_AMOUNT[0]) );
		struct.setList_ODR_AMOUNT(TypeConverter.convert(ODR_AMOUNT));
		struct.setODR_AMOUNT_EXCH_RATES( ((ODR_AMOUNT_EXCH_RATES == null) ? (String)null : ODR_AMOUNT_EXCH_RATES[0]) );
		struct.setList_ODR_AMOUNT_EXCH_RATES(TypeConverter.convert(ODR_AMOUNT_EXCH_RATES));
		struct.setISSUE_INST_COMMENT( ((ISSUE_INST_COMMENT == null) ? (String)null : ISSUE_INST_COMMENT[0]) );
		struct.setList_ISSUE_INST_COMMENT(TypeConverter.convert(ISSUE_INST_COMMENT));
		struct.setAPPROVED_COMMENT( ((APPROVED_COMMENT == null) ? (String)null : APPROVED_COMMENT[0]) );
		struct.setList_APPROVED_COMMENT(TypeConverter.convert(APPROVED_COMMENT));
		struct.setCUST_CHRG_PSN_CD( ((CUST_CHRG_PSN_CD == null) ? (String)null : CUST_CHRG_PSN_CD[0]) );
		struct.setList_CUST_CHRG_PSN_CD(TypeConverter.convert(CUST_CHRG_PSN_CD));
		struct.setCUST_CHRG_PSN_NAME( ((CUST_CHRG_PSN_NAME == null) ? (String)null : CUST_CHRG_PSN_NAME[0]) );
		struct.setList_CUST_CHRG_PSN_NAME(TypeConverter.convert(CUST_CHRG_PSN_NAME));
		struct.setES_ORG_CD( ((ES_ORG_CD == null) ? (String)null : ES_ORG_CD[0]) );
		struct.setList_ES_ORG_CD(TypeConverter.convert(ES_ORG_CD));
		struct.setES_ORG_NAME( ((ES_ORG_NAME == null) ? (String)null : ES_ORG_NAME[0]) );
		struct.setList_ES_ORG_NAME(TypeConverter.convert(ES_ORG_NAME));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setl_UNIT_CD( ((l_UNIT_CD == null) ? (String)null : l_UNIT_CD[0]) );
		struct.setList_l_UNIT_CD(TypeConverter.convert(l_UNIT_CD));
		struct.setl_ESTIMATE_UNIT_PRICE( ((l_ESTIMATE_UNIT_PRICE == null) ? (String)null : l_ESTIMATE_UNIT_PRICE[0]) );
		struct.setList_l_ESTIMATE_UNIT_PRICE(TypeConverter.convert(l_ESTIMATE_UNIT_PRICE));
		struct.setl_ODR_AMOUNT( ((l_ODR_AMOUNT == null) ? (String)null : l_ODR_AMOUNT[0]) );
		struct.setList_l_ODR_AMOUNT(TypeConverter.convert(l_ODR_AMOUNT));
		struct.setl_ODR_AMOUNT_EXCH_RATES( ((l_ODR_AMOUNT_EXCH_RATES == null) ? (String)null : l_ODR_AMOUNT_EXCH_RATES[0]) );
		struct.setList_l_ODR_AMOUNT_EXCH_RATES(TypeConverter.convert(l_ODR_AMOUNT_EXCH_RATES));
		struct.setl_DLV_LOC_CD( ((l_DLV_LOC_CD == null) ? (String)null : l_DLV_LOC_CD[0]) );
		struct.setList_l_DLV_LOC_CD(TypeConverter.convert(l_DLV_LOC_CD));
		struct.setl_DLV_LOC_NAME( ((l_DLV_LOC_NAME == null) ? (String)null : l_DLV_LOC_NAME[0]) );
		struct.setList_l_DLV_LOC_NAME(TypeConverter.convert(l_DLV_LOC_NAME));
		struct.setl_DEPO_TYP( ((l_DEPO_TYP == null) ? (String)null : l_DEPO_TYP[0]) );
		struct.setList_l_DEPO_TYP(TypeConverter.convert(l_DEPO_TYP));
		struct.setl_CUST_ITEM_NAME( ((l_CUST_ITEM_NAME == null) ? (String)null : l_CUST_ITEM_NAME[0]) );
		struct.setList_l_CUST_ITEM_NAME(TypeConverter.convert(l_CUST_ITEM_NAME));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_ODR_ACPT_DATE( ((l_ODR_ACPT_DATE == null) ? (String)null : l_ODR_ACPT_DATE[0]) );
		struct.setList_l_ODR_ACPT_DATE(TypeConverter.convert(l_ODR_ACPT_DATE));
		struct.setl_JOB_ODR_DLV_DATE( ((l_JOB_ODR_DLV_DATE == null) ? (String)null : l_JOB_ODR_DLV_DATE[0]) );
		struct.setList_l_JOB_ODR_DLV_DATE(TypeConverter.convert(l_JOB_ODR_DLV_DATE));
		struct.setl_ALC_GRP_CD( ((l_ALC_GRP_CD == null) ? (String)null : l_ALC_GRP_CD[0]) );
		struct.setList_l_ALC_GRP_CD(TypeConverter.convert(l_ALC_GRP_CD));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.setl_APPR_REMARKS( ((l_APPR_REMARKS == null) ? (String)null : l_APPR_REMARKS[0]) );
		struct.setList_l_APPR_REMARKS(TypeConverter.convert(l_APPR_REMARKS));
		struct.setl_CUST_CHRG_PSN_NAME( ((l_CUST_CHRG_PSN_NAME == null) ? (String)null : l_CUST_CHRG_PSN_NAME[0]) );
		struct.setList_l_CUST_CHRG_PSN_NAME(TypeConverter.convert(l_CUST_CHRG_PSN_NAME));
		struct.setl_CUST_CHRG_ORG_NAME( ((l_CUST_CHRG_ORG_NAME == null) ? (String)null : l_CUST_CHRG_ORG_NAME[0]) );
		struct.setList_l_CUST_CHRG_ORG_NAME(TypeConverter.convert(l_CUST_CHRG_ORG_NAME));
		struct.setl_ESTIMATE_TYPE( ((l_ESTIMATE_TYPE == null) ? (String)null : l_ESTIMATE_TYPE[0]) );
		struct.setList_l_ESTIMATE_TYPE(TypeConverter.convert(l_ESTIMATE_TYPE));
		struct.setl_ESTIMATE_ITEM_NAME( ((l_ESTIMATE_ITEM_NAME == null) ? (String)null : l_ESTIMATE_ITEM_NAME[0]) );
		struct.setList_l_ESTIMATE_ITEM_NAME(TypeConverter.convert(l_ESTIMATE_ITEM_NAME));
		struct.setl_ODR_QTY( ((l_ODR_QTY == null) ? (String)null : l_ODR_QTY[0]) );
		struct.setList_l_ODR_QTY(TypeConverter.convert(l_ODR_QTY));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.seth_UPDATE_FLG( ((h_UPDATE_FLG == null) ? (String)null : h_UPDATE_FLG[0]) );
		struct.setList_h_UPDATE_FLG(TypeConverter.convert(h_UPDATE_FLG));
		struct.setl_TODR_MODIFY_COUNT( ((l_TODR_MODIFY_COUNT == null) ? (String)null : l_TODR_MODIFY_COUNT[0]) );
		struct.setList_l_TODR_MODIFY_COUNT(TypeConverter.convert(l_TODR_MODIFY_COUNT));
		struct.setl_TEST_MODIFY_COUNT( ((l_TEST_MODIFY_COUNT == null) ? (String)null : l_TEST_MODIFY_COUNT[0]) );
		struct.setList_l_TEST_MODIFY_COUNT(TypeConverter.convert(l_TEST_MODIFY_COUNT));
		struct.setl_TPJ_MODIFY_COUNT( ((l_TPJ_MODIFY_COUNT == null) ? (String)null : l_TPJ_MODIFY_COUNT[0]) );
		struct.setList_l_TPJ_MODIFY_COUNT(TypeConverter.convert(l_TPJ_MODIFY_COUNT));
		struct.setl_h_ESTIMATE_TYPE( ((l_h_ESTIMATE_TYPE == null) ? (String)null : l_h_ESTIMATE_TYPE[0]) );
		struct.setList_l_h_ESTIMATE_TYPE(TypeConverter.convert(l_h_ESTIMATE_TYPE));
		struct.seth_ESTIMATE_TYPE( ((h_ESTIMATE_TYPE == null) ? (String)null : h_ESTIMATE_TYPE[0]) );
		struct.setList_h_ESTIMATE_TYPE(TypeConverter.convert(h_ESTIMATE_TYPE));
		struct.setl_h_PREC_ARRANGE_FLG( ((l_h_PREC_ARRANGE_FLG == null) ? (String)null : l_h_PREC_ARRANGE_FLG[0]) );
		struct.setList_l_h_PREC_ARRANGE_FLG(TypeConverter.convert(l_h_PREC_ARRANGE_FLG));
		struct.setl_c_DOODR( ((l_c_DOODR == null) ? (String)null : l_c_DOODR[0]) );
		struct.setList_l_c_DOODR(TypeConverter.convert(l_c_DOODR));
		struct.setl_c_INPUTODRCD( ((l_c_INPUTODRCD == null) ? (String)null : l_c_INPUTODRCD[0]) );
		struct.setList_l_c_INPUTODRCD(TypeConverter.convert(l_c_INPUTODRCD));
		struct.seth_PREC_ARRANGE_FLG( ((h_PREC_ARRANGE_FLG == null) ? (String)null : h_PREC_ARRANGE_FLG[0]) );
		struct.setList_h_PREC_ARRANGE_FLG(TypeConverter.convert(h_PREC_ARRANGE_FLG));
		struct.setl_h_ODR_TYP( ((l_h_ODR_TYP == null) ? (String)null : l_h_ODR_TYP[0]) );
		struct.setList_l_h_ODR_TYP(TypeConverter.convert(l_h_ODR_TYP));
		struct.seth_ODR_TYP( ((h_ODR_TYP == null) ? (String)null : h_ODR_TYP[0]) );
		struct.setList_h_ODR_TYP(TypeConverter.convert(h_ODR_TYP));
		struct.seth_ODR_TYP3( ((h_ODR_TYP3 == null) ? (String)null : h_ODR_TYP3[0]) );
		struct.setList_h_ODR_TYP3(TypeConverter.convert(h_ODR_TYP3));
		struct.seth_APR_ODR( ((h_APR_ODR == null) ? (String)null : h_APR_ODR[0]) );
		struct.setList_h_APR_ODR(TypeConverter.convert(h_APR_ODR));
		struct.seth_PRD_REQ_JOB_ODR_TYP_1( ((h_PRD_REQ_JOB_ODR_TYP_1 == null) ? (String)null : h_PRD_REQ_JOB_ODR_TYP_1[0]) );
		struct.setList_h_PRD_REQ_JOB_ODR_TYP_1(TypeConverter.convert(h_PRD_REQ_JOB_ODR_TYP_1));
		struct.seth_PRD_REQ_JOB_ODR_TYP_2( ((h_PRD_REQ_JOB_ODR_TYP_2 == null) ? (String)null : h_PRD_REQ_JOB_ODR_TYP_2[0]) );
		struct.setList_h_PRD_REQ_JOB_ODR_TYP_2(TypeConverter.convert(h_PRD_REQ_JOB_ODR_TYP_2));
		struct.seth_DLV_LOC_CD( ((h_DLV_LOC_CD == null) ? (String)null : h_DLV_LOC_CD[0]) );
		struct.setList_h_DLV_LOC_CD(TypeConverter.convert(h_DLV_LOC_CD));
		struct.seth_ANS_DLV_DATE_EXIST_FLG( ((h_ANS_DLV_DATE_EXIST_FLG == null) ? (String)null : h_ANS_DLV_DATE_EXIST_FLG[0]) );
		struct.setList_h_ANS_DLV_DATE_EXIST_FLG(TypeConverter.convert(h_ANS_DLV_DATE_EXIST_FLG));
		struct.setITEM_NAME_R( ((ITEM_NAME_R == null) ? (String)null : ITEM_NAME_R[0]) );
		struct.setList_ITEM_NAME_R(TypeConverter.convert(ITEM_NAME_R));
		struct.setl_h_ANS_DLV_DATE_EXIST_FLG( ((l_h_ANS_DLV_DATE_EXIST_FLG == null) ? (String)null : l_h_ANS_DLV_DATE_EXIST_FLG[0]) );
		struct.setList_l_h_ANS_DLV_DATE_EXIST_FLG(TypeConverter.convert(l_h_ANS_DLV_DATE_EXIST_FLG));
		struct.setl_h_DEPO_TYP( ((l_h_DEPO_TYP == null) ? (String)null : l_h_DEPO_TYP[0]) );
		struct.setList_l_h_DEPO_TYP(TypeConverter.convert(l_h_DEPO_TYP));
		struct.setl_OWN_PERSON_CD( ((l_OWN_PERSON_CD == null) ? (String)null : l_OWN_PERSON_CD[0]) );
		struct.setList_l_OWN_PERSON_CD(TypeConverter.convert(l_OWN_PERSON_CD));
		struct.setl_OWN_ORG_CD( ((l_OWN_ORG_CD == null) ? (String)null : l_OWN_ORG_CD[0]) );
		struct.setList_l_OWN_ORG_CD(TypeConverter.convert(l_OWN_ORG_CD));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0030010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aKM0030010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aKM0030010Struct";   // JSP先のバインド名(Struct)の指定
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
					KM0030010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KM0030010Entity entity = control.entity;
		KM0030010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0030");
		logger.entering("KM0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0030010Control control;
		KM0030010Entity  entity = null;
		KM0030010Struct  struct = null;

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

			if( (control = (KM0030010Control)so.getAttribute("KM0030010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0030010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0030010Control();
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
				} else if( isClick(request, "Modify") ) {
					if ( !isCryptical(request, so, params, "Modify") ) return ERROR_TARGET;
					target = onClickModify(request, response, so, params, control);
					control.setButton("Modify");
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

				so.setAttribute("KM0030010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "Modify") && bFLG_DISCONNECT_Modify)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Delete") && bFLG_DISCONNECT_Delete)
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
	private  static boolean bFLG_DISCONNECT_Modify = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Delete = true;
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
		return "com.nec.jp.orteus.metamorBase.KM0030.KM0030010Servlet";
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
	public KM0030010Servlet()
	{
		//{{user_implement_dev:<KM0030010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Modify = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;
		bFLG_DISCONNECT_Delete = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KM0030010_DisConnect_FLG>

		//{{user_implement_dev:<KM0030010Servlet>
//			bFLG_CSRF = false; // CSRFのための判定を行わない場合は、コメントアウトをはずしてください

			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<KM0030010Servlet>
	}

	//////////////////////////////

}
