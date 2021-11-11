/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090040Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

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

//}}user_implement_dev:import

//{{user_implement_dev:header
/**
 * CLASS     : AE0090040Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AE0090040Servlet extends HttpServlet
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
	 * @param control AE0090040Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AE0090040Control control)
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
	 * @param control AE0090040Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AE0090040Control control)
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
	 * @param control AE0090040Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
			logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "AE0090040"+" $Revision: 1.8 $" );
			control.control_eventHandller("initial");
			logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		
		
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AE0090040Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
         //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0130010-E999","リロード処理"));
            ExpjException ee = new ExpjException(e, "ZZ01106");
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
            throw ee;
   		} catch (BusinessProcessException e) {
//   			 エラー処理を記述してください。
   			ExpjException ee = new ExpjException(e, "ZZ01106");
   			throw ee;
   		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * FlashTree初期化ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickFlashTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");
		//{{user_implement_dev:<onClickFlashTree>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("FlashTree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickFlashTree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("Close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * この品目で正展開ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickShowS_Tree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowS_Tree");
		//{{user_implement_dev:<onClickShowS_Tree>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ShowS_Tree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickShowS_Tree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowS_Tree");

		return nextUrl;
	}

	/**
	 * この品目で逆展開ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickShowR_Tree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowR_Tree");
		//{{user_implement_dev:<onClickShowR_Tree>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ShowR_Tree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickShowR_Tree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowR_Tree");

		return nextUrl;
	}

	/**
	 * 詳細情報ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickShowDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090040Detail.jsp";		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");
		//{{user_implement_dev:<onClickShowDetail>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ShowDetail");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                //}}user_implement_dev:<onClickShowDetail>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");

		return nextUrl;
	}

	/**
	 * 在庫参照ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickStockInquiry(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickStockInquiry");
		//{{user_implement_dev:<onClickStockInquiry>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("StockInquiry");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickStockInquiry>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickStockInquiry");

		return nextUrl;
	}

	/**
	 * 発注計画メンテボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickMaintenanceRequestOrderPlan(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickMaintenanceRequestOrderPlan");
		//{{user_implement_dev:<onClickMaintenanceRequestOrderPlan>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("MaintenanceRequestOrderPlan");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} catch (BusinessProcessException e) {
//			 エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickMaintenanceRequestOrderPlan>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickMaintenanceRequestOrderPlan");

		return nextUrl;
	}

	/**
	 * ツリー読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickTreeSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickTreeSelect");
		//{{user_implement_dev:<onClickTreeSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("TreeSelect");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickTreeSelect>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickTreeSelect");

		return nextUrl;
	}

	/**
	 * 一覧読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickViewSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090041.jsp";		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickViewSelect");
		//{{user_implement_dev:<onClickViewSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ViewSelect");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickViewSelect>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickViewSelect");

		return nextUrl;
	}

	/**
	 * 有効在庫参照ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickValidStockInquiry(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickValidStockInquiry");
		//{{user_implement_dev:<onClickValidStockInquiry>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("ValidStockInquiry");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickValidStockInquiry>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickValidStockInquiry");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickSubClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090041.jsp";		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSubClear");
		//{{user_implement_dev:<onClickSubClear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("SubClear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSubClear>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickSubClear");

		return nextUrl;
	}

	/**
	 * ツリー追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AE0090040Controlクラスインスタンス
	 */
	public String onClickAddTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0090040Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0090040Control.jsp";		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");
		//{{user_implement_dev:<onClickAddTree>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("AddTree");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAddTree>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AE0090040Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] Target_ITEM_CD = ((params.containsKey("Target_ITEM_CD")) ? (String[])params.get("Target_ITEM_CD") : (String[])null);
		String[] DEVELOP_TYP = ((params.containsKey("DEVELOP_TYP")) ? (String[])params.get("DEVELOP_TYP") : (String[])null);
		String[] DEVELOP_TYP_name = ((params.containsKey("DEVELOP_TYP_name")) ? (String[])params.get("DEVELOP_TYP_name") : (String[])null);
		String[] DEVELOP_TYP_val = ((params.containsKey("DEVELOP_TYP_val")) ? (String[])params.get("DEVELOP_TYP_val") : (String[])null);
		String[] TargetDate = ((params.containsKey("TargetDate")) ? (String[])params.get("TargetDate") : (String[])null);
		String[] InitLevel = ((params.containsKey("InitLevel")) ? (String[])params.get("InitLevel") : (String[])null);
		String[] h_MaxLevel = ((params.containsKey("h_MaxLevel")) ? (String[])params.get("h_MaxLevel") : (String[])null);
		String[] AE0090040tree1 = ((params.containsKey("AE0090040tree1")) ? (String[])params.get("AE0090040tree1") : (String[])null);
		String[] id = ((params.containsKey("id")) ? (String[])params.get("id") : (String[])null);
		String[] lvl = ((params.containsKey("lvl")) ? (String[])params.get("lvl") : (String[])null);
		String[] parent = ((params.containsKey("parent")) ? (String[])params.get("parent") : (String[])null);
		String[] label = ((params.containsKey("label")) ? (String[])params.get("label") : (String[])null);
		String[] ctx = ((params.containsKey("ctx")) ? (String[])params.get("ctx") : (String[])null);
		String[] maxid = ((params.containsKey("maxid")) ? (String[])params.get("maxid") : (String[])null);
		String[] Upper_ITEM_CD = ((params.containsKey("Upper_ITEM_CD")) ? (String[])params.get("Upper_ITEM_CD") : (String[])null);
		String[] Lower_ITEM_CD = ((params.containsKey("Lower_ITEM_CD")) ? (String[])params.get("Lower_ITEM_CD") : (String[])null);
		String[] Lower_ITEM_NAME = ((params.containsKey("Lower_ITEM_NAME")) ? (String[])params.get("Lower_ITEM_NAME") : (String[])null);
		String[] PS_EDITION = ((params.containsKey("PS_EDITION")) ? (String[])params.get("PS_EDITION") : (String[])null);
		String[] EFF_PHASE_IN_DATE = ((params.containsKey("EFF_PHASE_IN_DATE")) ? (String[])params.get("EFF_PHASE_IN_DATE") : (String[])null);
		String[] EFF_PHASE_OUT_DATE = ((params.containsKey("EFF_PHASE_OUT_DATE")) ? (String[])params.get("EFF_PHASE_OUT_DATE") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] RECEIPT_SCHEDULES_NUMBER1 = ((params.containsKey("RECEIPT_SCHEDULES_NUMBER1")) ? (String[])params.get("RECEIPT_SCHEDULES_NUMBER1") : (String[])null);
		String[] RECEIPT_SCHEDULES_NUMBER2 = ((params.containsKey("RECEIPT_SCHEDULES_NUMBER2")) ? (String[])params.get("RECEIPT_SCHEDULES_NUMBER2") : (String[])null);
		String[] TERM2STARTDATE = ((params.containsKey("TERM2STARTDATE")) ? (String[])params.get("TERM2STARTDATE") : (String[])null);
		String[] NEED_QTY_1 = ((params.containsKey("NEED_QTY_1")) ? (String[])params.get("NEED_QTY_1") : (String[])null);
		String[] Det_Parent_ITEM_CD = ((params.containsKey("Det_Parent_ITEM_CD")) ? (String[])params.get("Det_Parent_ITEM_CD") : (String[])null);
		String[] Det_Parent_ITEM_NAME = ((params.containsKey("Det_Parent_ITEM_NAME")) ? (String[])params.get("Det_Parent_ITEM_NAME") : (String[])null);
		String[] Det_Comp_ITEM_CD = ((params.containsKey("Det_Comp_ITEM_CD")) ? (String[])params.get("Det_Comp_ITEM_CD") : (String[])null);
		String[] Det_Comp_ITEM_NAME = ((params.containsKey("Det_Comp_ITEM_NAME")) ? (String[])params.get("Det_Comp_ITEM_NAME") : (String[])null);
		String[] Det_Comp_Need_QTY = ((params.containsKey("Det_Comp_Need_QTY")) ? (String[])params.get("Det_Comp_Need_QTY") : (String[])null);
		String[] Det_Comp_OUTSIDE_TYP = ((params.containsKey("Det_Comp_OUTSIDE_TYP")) ? (String[])params.get("Det_Comp_OUTSIDE_TYP") : (String[])null);
		String[] Det_Comp_MRP_ODR_TYP = ((params.containsKey("Det_Comp_MRP_ODR_TYP")) ? (String[])params.get("Det_Comp_MRP_ODR_TYP") : (String[])null);
		String[] Upper_ITEM_NAME = ((params.containsKey("Upper_ITEM_NAME")) ? (String[])params.get("Upper_ITEM_NAME") : (String[])null);
		String[] Det_Comp_ONHAND_QTY = ((params.containsKey("Det_Comp_ONHAND_QTY")) ? (String[])params.get("Det_Comp_ONHAND_QTY") : (String[])null);
		String[] Det_Comp_STOCK_UNIT = ((params.containsKey("Det_Comp_STOCK_UNIT")) ? (String[])params.get("Det_Comp_STOCK_UNIT") : (String[])null);
		String[] Det_Comp_PRODUCT_TYP = ((params.containsKey("Det_Comp_PRODUCT_TYP")) ? (String[])params.get("Det_Comp_PRODUCT_TYP") : (String[])null);
		String[] Det_Comp_PS_UNIT_QTY = ((params.containsKey("Det_Comp_PS_UNIT_QTY")) ? (String[])params.get("Det_Comp_PS_UNIT_QTY") : (String[])null);
		String[] Det_Comp_PS_SPOIL = ((params.containsKey("Det_Comp_PS_SPOIL")) ? (String[])params.get("Det_Comp_PS_SPOIL") : (String[])null);
		String[] Det_Comp_EFF_PHASE_IN_DATE = ((params.containsKey("Det_Comp_EFF_PHASE_IN_DATE")) ? (String[])params.get("Det_Comp_EFF_PHASE_IN_DATE") : (String[])null);
		String[] Det_Comp_EFF_PHASE_OUT_DATE = ((params.containsKey("Det_Comp_EFF_PHASE_OUT_DATE")) ? (String[])params.get("Det_Comp_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] Det_Comp_CONS_TYP = ((params.containsKey("Det_Comp_CONS_TYP")) ? (String[])params.get("Det_Comp_CONS_TYP") : (String[])null);
		String[] Det_Comp_ITEM_SPOIL = ((params.containsKey("Det_Comp_ITEM_SPOIL")) ? (String[])params.get("Det_Comp_ITEM_SPOIL") : (String[])null);
		String[] Upper_NEED_QTY = ((params.containsKey("Upper_NEED_QTY")) ? (String[])params.get("Upper_NEED_QTY") : (String[])null);
		String[] Lower_NEED_QTY = ((params.containsKey("Lower_NEED_QTY")) ? (String[])params.get("Lower_NEED_QTY") : (String[])null);
		String[] ONHAND_STOCK = ((params.containsKey("ONHAND_STOCK")) ? (String[])params.get("ONHAND_STOCK") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] NO = ((params.containsKey("NO")) ? (String[])params.get("NO") : (String[])null);
		String[] PARENT_ITEM_CD = ((params.containsKey("PARENT_ITEM_CD")) ? (String[])params.get("PARENT_ITEM_CD") : (String[])null);
		String[] COMP_ITEM_CD = ((params.containsKey("COMP_ITEM_CD")) ? (String[])params.get("COMP_ITEM_CD") : (String[])null);
		String[] COMP_ITEM_NAME = ((params.containsKey("COMP_ITEM_NAME")) ? (String[])params.get("COMP_ITEM_NAME") : (String[])null);
		String[] PRODUCT_TYP = ((params.containsKey("PRODUCT_TYP")) ? (String[])params.get("PRODUCT_TYP") : (String[])null);
		String[] NEED_QTY = ((params.containsKey("NEED_QTY")) ? (String[])params.get("NEED_QTY") : (String[])null);
		String[] UNIT_QTY = ((params.containsKey("UNIT_QTY")) ? (String[])params.get("UNIT_QTY") : (String[])null);
		String[] IN_UNIT_1 = ((params.containsKey("IN_UNIT_1")) ? (String[])params.get("IN_UNIT_1") : (String[])null);
		String[] IN_UNIT_2 = ((params.containsKey("IN_UNIT_2")) ? (String[])params.get("IN_UNIT_2") : (String[])null);
		String[] NUMERATOR = ((params.containsKey("NUMERATOR")) ? (String[])params.get("NUMERATOR") : (String[])null);
		String[] DENOMINATOR = ((params.containsKey("DENOMINATOR")) ? (String[])params.get("DENOMINATOR") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] PARENT_ITEM_NAME = ((params.containsKey("PARENT_ITEM_NAME")) ? (String[])params.get("PARENT_ITEM_NAME") : (String[])null);
		String[] h_DEVELOP_TYP = ((params.containsKey("h_DEVELOP_TYP")) ? (String[])params.get("h_DEVELOP_TYP") : (String[])null);

		struct.setTarget_ITEM_CD( ((Target_ITEM_CD == null) ? (String)null : Target_ITEM_CD[0]) );
		struct.setList_Target_ITEM_CD(TypeConverter.convert(Target_ITEM_CD));
		struct.setDEVELOP_TYP( ((DEVELOP_TYP == null) ? (String)null : DEVELOP_TYP[0]) );
		struct.setList_DEVELOP_TYP(TypeConverter.convert(DEVELOP_TYP));
		struct.setDEVELOP_TYP_name( ((DEVELOP_TYP_name == null) ? (String)null : DEVELOP_TYP_name[0]) );
		struct.setList_DEVELOP_TYP_name(TypeConverter.convert(DEVELOP_TYP_name));
		struct.setDEVELOP_TYP_val( ((DEVELOP_TYP_val == null) ? (String)null : DEVELOP_TYP_val[0]) );
		struct.setList_DEVELOP_TYP_val(TypeConverter.convert(DEVELOP_TYP_val));
		struct.setTargetDate( ((TargetDate == null) ? (String)null : TargetDate[0]) );
		struct.setList_TargetDate(TypeConverter.convert(TargetDate));
		struct.setInitLevel( ((InitLevel == null) ? (String)null : InitLevel[0]) );
		struct.setList_InitLevel(TypeConverter.convert(InitLevel));
		struct.seth_MaxLevel( ((h_MaxLevel == null) ? (String)null : h_MaxLevel[0]) );
		struct.setList_h_MaxLevel(TypeConverter.convert(h_MaxLevel));
		struct.setAE0090040tree1( ((AE0090040tree1 == null) ? (String)null : AE0090040tree1[0]) );
		struct.setList_AE0090040tree1(TypeConverter.convert(AE0090040tree1));
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
		struct.setLower_ITEM_CD( ((Lower_ITEM_CD == null) ? (String)null : Lower_ITEM_CD[0]) );
		struct.setList_Lower_ITEM_CD(TypeConverter.convert(Lower_ITEM_CD));
		struct.setLower_ITEM_NAME( ((Lower_ITEM_NAME == null) ? (String)null : Lower_ITEM_NAME[0]) );
		struct.setList_Lower_ITEM_NAME(TypeConverter.convert(Lower_ITEM_NAME));
		struct.setPS_EDITION( ((PS_EDITION == null) ? (String)null : PS_EDITION[0]) );
		struct.setList_PS_EDITION(TypeConverter.convert(PS_EDITION));
		struct.setEFF_PHASE_IN_DATE( ((EFF_PHASE_IN_DATE == null) ? (String)null : EFF_PHASE_IN_DATE[0]) );
		struct.setList_EFF_PHASE_IN_DATE(TypeConverter.convert(EFF_PHASE_IN_DATE));
		struct.setEFF_PHASE_OUT_DATE( ((EFF_PHASE_OUT_DATE == null) ? (String)null : EFF_PHASE_OUT_DATE[0]) );
		struct.setList_EFF_PHASE_OUT_DATE(TypeConverter.convert(EFF_PHASE_OUT_DATE));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setRECEIPT_SCHEDULES_NUMBER1( ((RECEIPT_SCHEDULES_NUMBER1 == null) ? (String)null : RECEIPT_SCHEDULES_NUMBER1[0]) );
		struct.setList_RECEIPT_SCHEDULES_NUMBER1(TypeConverter.convert(RECEIPT_SCHEDULES_NUMBER1));
		struct.setRECEIPT_SCHEDULES_NUMBER2( ((RECEIPT_SCHEDULES_NUMBER2 == null) ? (String)null : RECEIPT_SCHEDULES_NUMBER2[0]) );
		struct.setList_RECEIPT_SCHEDULES_NUMBER2(TypeConverter.convert(RECEIPT_SCHEDULES_NUMBER2));
		struct.setTERM2STARTDATE( ((TERM2STARTDATE == null) ? (String)null : TERM2STARTDATE[0]) );
		struct.setList_TERM2STARTDATE(TypeConverter.convert(TERM2STARTDATE));
		struct.setNEED_QTY_1( ((NEED_QTY_1 == null) ? (String)null : NEED_QTY_1[0]) );
		struct.setList_NEED_QTY_1(TypeConverter.convert(NEED_QTY_1));
		struct.setDet_Parent_ITEM_CD( ((Det_Parent_ITEM_CD == null) ? (String)null : Det_Parent_ITEM_CD[0]) );
		struct.setList_Det_Parent_ITEM_CD(TypeConverter.convert(Det_Parent_ITEM_CD));
		struct.setDet_Parent_ITEM_NAME( ((Det_Parent_ITEM_NAME == null) ? (String)null : Det_Parent_ITEM_NAME[0]) );
		struct.setList_Det_Parent_ITEM_NAME(TypeConverter.convert(Det_Parent_ITEM_NAME));
		struct.setDet_Comp_ITEM_CD( ((Det_Comp_ITEM_CD == null) ? (String)null : Det_Comp_ITEM_CD[0]) );
		struct.setList_Det_Comp_ITEM_CD(TypeConverter.convert(Det_Comp_ITEM_CD));
		struct.setDet_Comp_ITEM_NAME( ((Det_Comp_ITEM_NAME == null) ? (String)null : Det_Comp_ITEM_NAME[0]) );
		struct.setList_Det_Comp_ITEM_NAME(TypeConverter.convert(Det_Comp_ITEM_NAME));
		struct.setDet_Comp_Need_QTY( ((Det_Comp_Need_QTY == null) ? (String)null : Det_Comp_Need_QTY[0]) );
		struct.setList_Det_Comp_Need_QTY(TypeConverter.convert(Det_Comp_Need_QTY));
		struct.setDet_Comp_OUTSIDE_TYP( ((Det_Comp_OUTSIDE_TYP == null) ? (String)null : Det_Comp_OUTSIDE_TYP[0]) );
		struct.setList_Det_Comp_OUTSIDE_TYP(TypeConverter.convert(Det_Comp_OUTSIDE_TYP));
		struct.setDet_Comp_MRP_ODR_TYP( ((Det_Comp_MRP_ODR_TYP == null) ? (String)null : Det_Comp_MRP_ODR_TYP[0]) );
		struct.setList_Det_Comp_MRP_ODR_TYP(TypeConverter.convert(Det_Comp_MRP_ODR_TYP));
		struct.setUpper_ITEM_NAME( ((Upper_ITEM_NAME == null) ? (String)null : Upper_ITEM_NAME[0]) );
		struct.setList_Upper_ITEM_NAME(TypeConverter.convert(Upper_ITEM_NAME));
		struct.setDet_Comp_ONHAND_QTY( ((Det_Comp_ONHAND_QTY == null) ? (String)null : Det_Comp_ONHAND_QTY[0]) );
		struct.setList_Det_Comp_ONHAND_QTY(TypeConverter.convert(Det_Comp_ONHAND_QTY));
		struct.setDet_Comp_STOCK_UNIT( ((Det_Comp_STOCK_UNIT == null) ? (String)null : Det_Comp_STOCK_UNIT[0]) );
		struct.setList_Det_Comp_STOCK_UNIT(TypeConverter.convert(Det_Comp_STOCK_UNIT));
		struct.setDet_Comp_PRODUCT_TYP( ((Det_Comp_PRODUCT_TYP == null) ? (String)null : Det_Comp_PRODUCT_TYP[0]) );
		struct.setList_Det_Comp_PRODUCT_TYP(TypeConverter.convert(Det_Comp_PRODUCT_TYP));
		struct.setDet_Comp_PS_UNIT_QTY( ((Det_Comp_PS_UNIT_QTY == null) ? (String)null : Det_Comp_PS_UNIT_QTY[0]) );
		struct.setList_Det_Comp_PS_UNIT_QTY(TypeConverter.convert(Det_Comp_PS_UNIT_QTY));
		struct.setDet_Comp_PS_SPOIL( ((Det_Comp_PS_SPOIL == null) ? (String)null : Det_Comp_PS_SPOIL[0]) );
		struct.setList_Det_Comp_PS_SPOIL(TypeConverter.convert(Det_Comp_PS_SPOIL));
		struct.setDet_Comp_EFF_PHASE_IN_DATE( ((Det_Comp_EFF_PHASE_IN_DATE == null) ? (String)null : Det_Comp_EFF_PHASE_IN_DATE[0]) );
		struct.setList_Det_Comp_EFF_PHASE_IN_DATE(TypeConverter.convert(Det_Comp_EFF_PHASE_IN_DATE));
		struct.setDet_Comp_EFF_PHASE_OUT_DATE( ((Det_Comp_EFF_PHASE_OUT_DATE == null) ? (String)null : Det_Comp_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_Det_Comp_EFF_PHASE_OUT_DATE(TypeConverter.convert(Det_Comp_EFF_PHASE_OUT_DATE));
		struct.setDet_Comp_CONS_TYP( ((Det_Comp_CONS_TYP == null) ? (String)null : Det_Comp_CONS_TYP[0]) );
		struct.setList_Det_Comp_CONS_TYP(TypeConverter.convert(Det_Comp_CONS_TYP));
		struct.setDet_Comp_ITEM_SPOIL( ((Det_Comp_ITEM_SPOIL == null) ? (String)null : Det_Comp_ITEM_SPOIL[0]) );
		struct.setList_Det_Comp_ITEM_SPOIL(TypeConverter.convert(Det_Comp_ITEM_SPOIL));
		struct.setUpper_NEED_QTY( ((Upper_NEED_QTY == null) ? (String)null : Upper_NEED_QTY[0]) );
		struct.setList_Upper_NEED_QTY(TypeConverter.convert(Upper_NEED_QTY));
		struct.setLower_NEED_QTY( ((Lower_NEED_QTY == null) ? (String)null : Lower_NEED_QTY[0]) );
		struct.setList_Lower_NEED_QTY(TypeConverter.convert(Lower_NEED_QTY));
		struct.setONHAND_STOCK( ((ONHAND_STOCK == null) ? (String)null : ONHAND_STOCK[0]) );
		struct.setList_ONHAND_STOCK(TypeConverter.convert(ONHAND_STOCK));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setNO( ((NO == null) ? (String)null : NO[0]) );
		struct.setList_NO(TypeConverter.convert(NO));
		struct.setPARENT_ITEM_CD( ((PARENT_ITEM_CD == null) ? (String)null : PARENT_ITEM_CD[0]) );
		struct.setList_PARENT_ITEM_CD(TypeConverter.convert(PARENT_ITEM_CD));
		struct.setCOMP_ITEM_CD( ((COMP_ITEM_CD == null) ? (String)null : COMP_ITEM_CD[0]) );
		struct.setList_COMP_ITEM_CD(TypeConverter.convert(COMP_ITEM_CD));
		struct.setCOMP_ITEM_NAME( ((COMP_ITEM_NAME == null) ? (String)null : COMP_ITEM_NAME[0]) );
		struct.setList_COMP_ITEM_NAME(TypeConverter.convert(COMP_ITEM_NAME));
		struct.setPRODUCT_TYP( ((PRODUCT_TYP == null) ? (String)null : PRODUCT_TYP[0]) );
		struct.setList_PRODUCT_TYP(TypeConverter.convert(PRODUCT_TYP));
		struct.setNEED_QTY( ((NEED_QTY == null) ? (String)null : NEED_QTY[0]) );
		struct.setList_NEED_QTY(TypeConverter.convert(NEED_QTY));
		struct.setUNIT_QTY( ((UNIT_QTY == null) ? (String)null : UNIT_QTY[0]) );
		struct.setList_UNIT_QTY(TypeConverter.convert(UNIT_QTY));
		struct.setIN_UNIT_1( ((IN_UNIT_1 == null) ? (String)null : IN_UNIT_1[0]) );
		struct.setList_IN_UNIT_1(TypeConverter.convert(IN_UNIT_1));
		struct.setIN_UNIT_2( ((IN_UNIT_2 == null) ? (String)null : IN_UNIT_2[0]) );
		struct.setList_IN_UNIT_2(TypeConverter.convert(IN_UNIT_2));
		struct.setNUMERATOR( ((NUMERATOR == null) ? (String)null : NUMERATOR[0]) );
		struct.setList_NUMERATOR(TypeConverter.convert(NUMERATOR));
		struct.setDENOMINATOR( ((DENOMINATOR == null) ? (String)null : DENOMINATOR[0]) );
		struct.setList_DENOMINATOR(TypeConverter.convert(DENOMINATOR));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setPARENT_ITEM_NAME( ((PARENT_ITEM_NAME == null) ? (String)null : PARENT_ITEM_NAME[0]) );
		struct.setList_PARENT_ITEM_NAME(TypeConverter.convert(PARENT_ITEM_NAME));
		struct.seth_DEVELOP_TYP( ((h_DEVELOP_TYP == null) ? (String)null : h_DEVELOP_TYP[0]) );
		struct.setList_h_DEVELOP_TYP(TypeConverter.convert(h_DEVELOP_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AE0090040.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAE0090040Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAE0090040Struct";   // JSP先のバインド名(Struct)の指定
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
					AE0090040Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AE0090040Entity entity = control.entity;
		AE0090040Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AE0090040Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AE0090040Control control;
		AE0090040Entity  entity = null;
		AE0090040Struct  struct = null;

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

			if( (control = (AE0090040Control)so.getAttribute("AE0090040Control_"+request.getSession(false).getId())) == null ) {
				control = new AE0090040Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AE0090040Control();
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
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "ShowS_Tree") ) {
					if ( !isCryptical(request, so, params, "ShowS_Tree") ) return ERROR_TARGET;
					target = onClickShowS_Tree(request, response, so, params, control);
					control.setButton("ShowS_Tree");
				} else if( isClick(request, "ShowR_Tree") ) {
					if ( !isCryptical(request, so, params, "ShowR_Tree") ) return ERROR_TARGET;
					target = onClickShowR_Tree(request, response, so, params, control);
					control.setButton("ShowR_Tree");
				} else if( isClick(request, "ShowDetail") ) {
					if ( !isCryptical(request, so, params, "ShowDetail") ) return ERROR_TARGET;
					target = onClickShowDetail(request, response, so, params, control);
					control.setButton("ShowDetail");
				} else if( isClick(request, "StockInquiry") ) {
					if ( !isCryptical(request, so, params, "StockInquiry") ) return ERROR_TARGET;
					target = onClickStockInquiry(request, response, so, params, control);
					control.setButton("StockInquiry");
				} else if( isClick(request, "MaintenanceRequestOrderPlan") ) {
					if ( !isCryptical(request, so, params, "MaintenanceRequestOrderPlan") ) return ERROR_TARGET;
					target = onClickMaintenanceRequestOrderPlan(request, response, so, params, control);
					control.setButton("MaintenanceRequestOrderPlan");
				} else if( isClick(request, "TreeSelect") ) {
					if ( !isCryptical(request, so, params, "TreeSelect") ) return ERROR_TARGET;
					target = onClickTreeSelect(request, response, so, params, control);
					control.setButton("TreeSelect");
				} else if( isClick(request, "ViewSelect") ) {
					if ( !isCryptical(request, so, params, "ViewSelect") ) return ERROR_TARGET;
					target = onClickViewSelect(request, response, so, params, control);
					control.setButton("ViewSelect");
				} else if( isClick(request, "ValidStockInquiry") ) {
					if ( !isCryptical(request, so, params, "ValidStockInquiry") ) return ERROR_TARGET;
					target = onClickValidStockInquiry(request, response, so, params, control);
					control.setButton("ValidStockInquiry");
				} else if( isClick(request, "SubClear") ) {
					if ( !isCryptical(request, so, params, "SubClear") ) return ERROR_TARGET;
					target = onClickSubClear(request, response, so, params, control);
					control.setButton("SubClear");
				} else if( isClick(request, "AddTree") ) {
					if ( !isCryptical(request, so, params, "AddTree") ) return ERROR_TARGET;
					target = onClickAddTree(request, response, so, params, control);
					control.setButton("AddTree");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AE0090040Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "FlashTree") && bFLG_DISCONNECT_FlashTree)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "ShowS_Tree") && bFLG_DISCONNECT_ShowS_Tree)
				|| (isClick(request, "ShowR_Tree") && bFLG_DISCONNECT_ShowR_Tree)
				|| (isClick(request, "ShowDetail") && bFLG_DISCONNECT_ShowDetail)
				|| (isClick(request, "StockInquiry") && bFLG_DISCONNECT_StockInquiry)
				|| (isClick(request, "MaintenanceRequestOrderPlan") && bFLG_DISCONNECT_MaintenanceRequestOrderPlan)
				|| (isClick(request, "TreeSelect") && bFLG_DISCONNECT_TreeSelect)
				|| (isClick(request, "ViewSelect") && bFLG_DISCONNECT_ViewSelect)
				|| (isClick(request, "ValidStockInquiry") && bFLG_DISCONNECT_ValidStockInquiry)
				|| (isClick(request, "SubClear") && bFLG_DISCONNECT_SubClear)
				|| (isClick(request, "AddTree") && bFLG_DISCONNECT_AddTree)
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
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_ShowS_Tree = true;
	private  static boolean bFLG_DISCONNECT_ShowR_Tree = true;
	private  static boolean bFLG_DISCONNECT_ShowDetail = true;
	private  static boolean bFLG_DISCONNECT_StockInquiry = true;
	private  static boolean bFLG_DISCONNECT_MaintenanceRequestOrderPlan = true;
	private  static boolean bFLG_DISCONNECT_TreeSelect = true;
	private  static boolean bFLG_DISCONNECT_ViewSelect = true;
	private  static boolean bFLG_DISCONNECT_ValidStockInquiry = true;
	private  static boolean bFLG_DISCONNECT_SubClear = true;
	private  static boolean bFLG_DISCONNECT_AddTree = true;

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
		return "com.nec.jp.orteus.metamorBase.AE0090.AE0090040Servlet";
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
	public AE0090040Servlet()
	{
		//{{user_implement_dev:<AE0090040_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_FlashTree = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<AE0090040_DisConnect_FLG>

		//{{user_implement_dev:<AE0090040Servlet>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<AE0090040Servlet>
	}

	//////////////////////////////

}
