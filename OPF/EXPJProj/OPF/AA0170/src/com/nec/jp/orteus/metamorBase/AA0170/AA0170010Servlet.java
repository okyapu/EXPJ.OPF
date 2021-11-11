/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/src/com/nec/jp/orteus/metamorBase/AA0170/AA0170010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0170;

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
//}}user_implement_dev:header

public class AA0170010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
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
	 * @param control AA0170010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AA0170010Control control)
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
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AA0170010Control control)
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
	 * @param control AA0170010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
			logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                                      objMessage.m_writer.write( Level.ALL, "AA0170010"+" $Revision: 1.4 $" );
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0170010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
                try {
              
                 setScreenMoveParams(params, control);
                 control.control_eventHandller("reload");
                 if(control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                  control.control_eventHandller("select");
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                try {
              
                 control.setKeyStruct(struct);
              
                 control.control_eventHandller("select");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
              
                }
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickupdateSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");
		//{{user_implement_dev:<onClickupdateSub1>
                //------------------------------------------------------------------
		try {
              
			control.control_eventHandller("updateSub1");
              
			// エラー発生の場合、子画面に遷移
			if (control.getMessage().sizeError() > 0) {
				nextUrl = "/AA0170011.jsp";
			}
              
		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
			
		}
                
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdateSub1>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickcloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");
		//{{user_implement_dev:<onClickcloseSub1>
                //------------------------------------------------------------------
        try {
              
            control.control_eventHandller("closeSub1");
              
        } catch(FoundationException e) {
            ExpjException ee = new ExpjException(e, "ZZ01106");
            throw ee;
        }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickcloseSub1>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try{
              
                 control.control_eventHandller("clear");
              
                }catch(FoundationException e){
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
              
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
		//{{user_implement_dev:<onClickinsertSub1>
                //------------------------------------------------------------------
		try{
			
			control.control_eventHandller("insertSub1");
              
			// エラー発生の場合、子画面に遷移
			if (control.getMessage().sizeError() > 0) {
				nextUrl = "/AA0170011.jsp";
			}  
		}catch(FoundationException e){
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
			
		}
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * selectProcGrpボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickselectProcGrp(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0170010iframe.jsp";		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickselectProcGrp");
		//{{user_implement_dev:<onClickselectProcGrp>
        try {
            
//            control.setKeyStruct(struct);
         
            control.control_eventHandller("selectProcGrp");
         
           }catch(FoundationException e) {
            ExpjException ee = new ExpjException(e, "ZZ01106");
            throw ee;
         
           }
                //}}user_implement_dev:<onClickselectProcGrp>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickselectProcGrp");

		return nextUrl;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickinsertProcGrp(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertProcGrp");
		//{{user_implement_dev:<onClickinsertProcGrp>
		try {
			control.control_eventHandller("insertProcGrp");
 
			// 子画面に遷移
			nextUrl = "/AA0170012.jsp";
 
		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}

                //}}user_implement_dev:<onClickinsertProcGrp>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertProcGrp");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickupdateProcGrp(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateProcGrp");
		//{{user_implement_dev:<onClickupdateProcGrp>
		try {
			
			control.control_eventHandller("updateProcGrp");
 
			// 子画面に遷移
			nextUrl = "/AA0170012.jsp";
 
		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdateProcGrp>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateProcGrp");

		return nextUrl;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickcopyProcGrp(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickcopyProcGrp");
		//{{user_implement_dev:<onClickcopyProcGrp>
		
		try {
			
			control.control_eventHandller("copyProcGrp");
 
			// 子画面に遷移
			nextUrl = "/AA0170012.jsp";
 
		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcopyProcGrp>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickcopyProcGrp");

		return nextUrl;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickdeleteProcGrp(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeleteProcGrp");
		//{{user_implement_dev:<onClickdeleteProcGrp>

		try {
			
            control.control_eventHandller("deleteProcGrp");
         
        } catch ( FoundationException e ) {
            ExpjException ee = new ExpjException(e, "ZZ01106");
            throw ee;
         
        }

                //}}user_implement_dev:<onClickdeleteProcGrp>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeleteProcGrp");

		return nextUrl;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickdeleteAllProcGrp(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeleteAllProcGrp");
		//{{user_implement_dev:<onClickdeleteAllProcGrp>

		try {

			control.control_eventHandller("deleteAllProcGrp");
		
		} catch(FoundationException e) {

			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickdeleteAllProcGrp>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeleteAllProcGrp");

		return nextUrl;
	}

	/**
	 * 番号再振ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickrenumProcGrp(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickrenumProcGrp");
		//{{user_implement_dev:<onClickrenumProcGrp>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("renumProcGrp");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickrenumProcGrp>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickrenumProcGrp");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickinsertSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub2");
		//{{user_implement_dev:<onClickinsertSub2>
		
		try {
			
			control.control_eventHandller("insertSub2");
              
			// エラー発生の場合、子画面に遷移
			if (control.getMessage().sizeError() > 0) {
				nextUrl = "/AA0170012.jsp";
			}
			  
		} catch (FoundationException e){
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
			
		}
                //}}user_implement_dev:<onClickinsertSub2>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub2");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickupdateSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub2");
		//{{user_implement_dev:<onClickupdateSub2>

		try {
			
			control.control_eventHandller("updateSub2");
              
			// エラー発生の場合、子画面に遷移
			if (control.getMessage().sizeError() > 0) {
				nextUrl = "/AA0170012.jsp";
			}
			  
		} catch (FoundationException e) {
			
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
			
		}
                //}}user_implement_dev:<onClickupdateSub2>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub2");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickcloseSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub2");
		//{{user_implement_dev:<onClickcloseSub2>
       
		try {
            
            control.control_eventHandller("closeSub2");
         
        } catch(FoundationException e) {
            ExpjException ee = new ExpjException(e, "ZZ01106");
            throw ee;
        }
                //}}user_implement_dev:<onClickcloseSub2>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub2");

		return nextUrl;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickinsertPs(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertPs");
		//{{user_implement_dev:<onClickinsertPs>
		try {
			control.control_eventHandller("insertPs");
 
			// 子画面に遷移
			nextUrl = "/AA0170011.jsp";
 
		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsertPs>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertPs");

		return nextUrl;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickupdatePs(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdatePs");
		//{{user_implement_dev:<onClickupdatePs>
		try {
            
			control.control_eventHandller("updatePs");
 
			// 子画面に遷移
			nextUrl = "/AA0170011.jsp";
 
		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdatePs>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickupdatePs");

		return nextUrl;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickdeletePs(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeletePs");
		//{{user_implement_dev:<onClickdeletePs>

		try {
            control.control_eventHandller("deletePs");
         
        } catch ( FoundationException e ) {
            ExpjException ee = new ExpjException(e, "ZZ01106");
            throw ee;
         
        }

                //}}user_implement_dev:<onClickdeletePs>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeletePs");

		return nextUrl;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0170010Controlクラスインスタンス
	 */
	public String onClickdeleteAllPs(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0170010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeleteAllPs");
		//{{user_implement_dev:<onClickdeleteAllPs>

		try {
			
			control.control_eventHandller("deleteAllPs");
		
		} catch(FoundationException e) {
			
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickdeleteAllPs>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"onClickdeleteAllPs");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0170010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] sub2_ITEM_CD = ((params.containsKey("sub2_ITEM_CD")) ? (String[])params.get("sub2_ITEM_CD") : (String[])null);
		String[] sub2_ITEM_NAME = ((params.containsKey("sub2_ITEM_NAME")) ? (String[])params.get("sub2_ITEM_NAME") : (String[])null);
		String[] sub2_MODIFY_COUNT = ((params.containsKey("sub2_MODIFY_COUNT")) ? (String[])params.get("sub2_MODIFY_COUNT") : (String[])null);
		String[] sub2_PROC_CD = ((params.containsKey("sub2_PROC_CD")) ? (String[])params.get("sub2_PROC_CD") : (String[])null);
		String[] sub2_PROC_NAME = ((params.containsKey("sub2_PROC_NAME")) ? (String[])params.get("sub2_PROC_NAME") : (String[])null);
		String[] sub2_PROC_NO = ((params.containsKey("sub2_PROC_NO")) ? (String[])params.get("sub2_PROC_NO") : (String[])null);
		String[] sub2_SPOIL = ((params.containsKey("sub2_SPOIL")) ? (String[])params.get("sub2_SPOIL") : (String[])null);
		String[] sub2_FIXED_LT = ((params.containsKey("sub2_FIXED_LT")) ? (String[])params.get("sub2_FIXED_LT") : (String[])null);
		String[] sub2_PROP_LT = ((params.containsKey("sub2_PROP_LT")) ? (String[])params.get("sub2_PROP_LT") : (String[])null);
		String[] sub2_PROP_LOT_SIZE = ((params.containsKey("sub2_PROP_LOT_SIZE")) ? (String[])params.get("sub2_PROP_LOT_SIZE") : (String[])null);
		String[] sub2_STOCK_UNIT = ((params.containsKey("sub2_STOCK_UNIT")) ? (String[])params.get("sub2_STOCK_UNIT") : (String[])null);
		String[] sub2_SAFETY_LT = ((params.containsKey("sub2_SAFETY_LT")) ? (String[])params.get("sub2_SAFETY_LT") : (String[])null);
		String[] sub2_OUTSIDE_TYP = ((params.containsKey("sub2_OUTSIDE_TYP")) ? (String[])params.get("sub2_OUTSIDE_TYP") : (String[])null);
		String[] sub2_OUTSIDE_TYP_name = ((params.containsKey("sub2_OUTSIDE_TYP_name")) ? (String[])params.get("sub2_OUTSIDE_TYP_name") : (String[])null);
		String[] sub2_OUTSIDE_TYP_val = ((params.containsKey("sub2_OUTSIDE_TYP_val")) ? (String[])params.get("sub2_OUTSIDE_TYP_val") : (String[])null);
		String[] sub2_WS_CD = ((params.containsKey("sub2_WS_CD")) ? (String[])params.get("sub2_WS_CD") : (String[])null);
		String[] sub2_WS_NAME = ((params.containsKey("sub2_WS_NAME")) ? (String[])params.get("sub2_WS_NAME") : (String[])null);
		String[] sub2_VEND_CD = ((params.containsKey("sub2_VEND_CD")) ? (String[])params.get("sub2_VEND_CD") : (String[])null);
		String[] sub2_VEND_NAME = ((params.containsKey("sub2_VEND_NAME")) ? (String[])params.get("sub2_VEND_NAME") : (String[])null);
		String[] sub2_ACPT_INSPC_TYP = ((params.containsKey("sub2_ACPT_INSPC_TYP")) ? (String[])params.get("sub2_ACPT_INSPC_TYP") : (String[])null);
		String[] sub2_ACPT_INSPC_TYP_name = ((params.containsKey("sub2_ACPT_INSPC_TYP_name")) ? (String[])params.get("sub2_ACPT_INSPC_TYP_name") : (String[])null);
		String[] sub2_ACPT_INSPC_TYP_val = ((params.containsKey("sub2_ACPT_INSPC_TYP_val")) ? (String[])params.get("sub2_ACPT_INSPC_TYP_val") : (String[])null);
		String[] sub2_STANDARD_COST = ((params.containsKey("sub2_STANDARD_COST")) ? (String[])params.get("sub2_STANDARD_COST") : (String[])null);
		String[] main_TARGET_ITEM_CD = ((params.containsKey("main_TARGET_ITEM_CD")) ? (String[])params.get("main_TARGET_ITEM_CD") : (String[])null);
		String[] main_DEVELOP_TYP = ((params.containsKey("main_DEVELOP_TYP")) ? (String[])params.get("main_DEVELOP_TYP") : (String[])null);
		String[] main_DEVELOP_TYP_name = ((params.containsKey("main_DEVELOP_TYP_name")) ? (String[])params.get("main_DEVELOP_TYP_name") : (String[])null);
		String[] main_DEVELOP_TYP_val = ((params.containsKey("main_DEVELOP_TYP_val")) ? (String[])params.get("main_DEVELOP_TYP_val") : (String[])null);
		String[] main_TARGET_DATE = ((params.containsKey("main_TARGET_DATE")) ? (String[])params.get("main_TARGET_DATE") : (String[])null);
		String[] main_LEVEL = ((params.containsKey("main_LEVEL")) ? (String[])params.get("main_LEVEL") : (String[])null);
		String[] ps_MODIFY_COUNT = ((params.containsKey("ps_MODIFY_COUNT")) ? (String[])params.get("ps_MODIFY_COUNT") : (String[])null);
		String[] ps_NO = ((params.containsKey("ps_NO")) ? (String[])params.get("ps_NO") : (String[])null);
		String[] ps_PARENT_ITEM_CD = ((params.containsKey("ps_PARENT_ITEM_CD")) ? (String[])params.get("ps_PARENT_ITEM_CD") : (String[])null);
		String[] ps_PARENT_ITEM_NAME = ((params.containsKey("ps_PARENT_ITEM_NAME")) ? (String[])params.get("ps_PARENT_ITEM_NAME") : (String[])null);
		String[] ps_COMP_ITEM_CD = ((params.containsKey("ps_COMP_ITEM_CD")) ? (String[])params.get("ps_COMP_ITEM_CD") : (String[])null);
		String[] ps_COMP_ITEM_NAME = ((params.containsKey("ps_COMP_ITEM_NAME")) ? (String[])params.get("ps_COMP_ITEM_NAME") : (String[])null);
		String[] ps_PS_EDITION = ((params.containsKey("ps_PS_EDITION")) ? (String[])params.get("ps_PS_EDITION") : (String[])null);
		String[] ps_PS_UNIT_NUMERATOR = ((params.containsKey("ps_PS_UNIT_NUMERATOR")) ? (String[])params.get("ps_PS_UNIT_NUMERATOR") : (String[])null);
		String[] ps_PS_UNIT_DENOMINATOR = ((params.containsKey("ps_PS_UNIT_DENOMINATOR")) ? (String[])params.get("ps_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] ps_STOCK_UNIT = ((params.containsKey("ps_STOCK_UNIT")) ? (String[])params.get("ps_STOCK_UNIT") : (String[])null);
		String[] ps_EFF_PHASE_IN_DATE = ((params.containsKey("ps_EFF_PHASE_IN_DATE")) ? (String[])params.get("ps_EFF_PHASE_IN_DATE") : (String[])null);
		String[] ps_EFF_PHASE_OUT_DATE = ((params.containsKey("ps_EFF_PHASE_OUT_DATE")) ? (String[])params.get("ps_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] ps_PS_SPOIL = ((params.containsKey("ps_PS_SPOIL")) ? (String[])params.get("ps_PS_SPOIL") : (String[])null);
		String[] ps_CONS_NAME = ((params.containsKey("ps_CONS_NAME")) ? (String[])params.get("ps_CONS_NAME") : (String[])null);
		String[] ps_CONS_TYP = ((params.containsKey("ps_CONS_TYP")) ? (String[])params.get("ps_CONS_TYP") : (String[])null);
		String[] ps_PS_LT_NAME = ((params.containsKey("ps_PS_LT_NAME")) ? (String[])params.get("ps_PS_LT_NAME") : (String[])null);
		String[] ps_PS_LT_FLG = ((params.containsKey("ps_PS_LT_FLG")) ? (String[])params.get("ps_PS_LT_FLG") : (String[])null);
		String[] ps_PS_FIXED_LT = ((params.containsKey("ps_PS_FIXED_LT")) ? (String[])params.get("ps_PS_FIXED_LT") : (String[])null);
		String[] ps_PS_PROP_LT = ((params.containsKey("ps_PS_PROP_LT")) ? (String[])params.get("ps_PS_PROP_LT") : (String[])null);
		String[] ps_PS_PROP_LOT_SIZE = ((params.containsKey("ps_PS_PROP_LOT_SIZE")) ? (String[])params.get("ps_PS_PROP_LOT_SIZE") : (String[])null);
		String[] ps_PS_REF_NO = ((params.containsKey("ps_PS_REF_NO")) ? (String[])params.get("ps_PS_REF_NO") : (String[])null);
		String[] ps_COST_UP_NAME = ((params.containsKey("ps_COST_UP_NAME")) ? (String[])params.get("ps_COST_UP_NAME") : (String[])null);
		String[] ps_COST_UP_TYP = ((params.containsKey("ps_COST_UP_TYP")) ? (String[])params.get("ps_COST_UP_TYP") : (String[])null);
		String[] ps_MRP_EXP_NAME = ((params.containsKey("ps_MRP_EXP_NAME")) ? (String[])params.get("ps_MRP_EXP_NAME") : (String[])null);
		String[] ps_MRP_EXP_TYP = ((params.containsKey("ps_MRP_EXP_TYP")) ? (String[])params.get("ps_MRP_EXP_TYP") : (String[])null);
		String[] pr_PROC_CD = ((params.containsKey("pr_PROC_CD")) ? (String[])params.get("pr_PROC_CD") : (String[])null);
		String[] pr_PROC_NAME = ((params.containsKey("pr_PROC_NAME")) ? (String[])params.get("pr_PROC_NAME") : (String[])null);
		String[] pr_PROC_NO = ((params.containsKey("pr_PROC_NO")) ? (String[])params.get("pr_PROC_NO") : (String[])null);
		String[] pr_OUTSIDE_NAME = ((params.containsKey("pr_OUTSIDE_NAME")) ? (String[])params.get("pr_OUTSIDE_NAME") : (String[])null);
		String[] pr_WS_CD = ((params.containsKey("pr_WS_CD")) ? (String[])params.get("pr_WS_CD") : (String[])null);
		String[] pr_VEND_CD = ((params.containsKey("pr_VEND_CD")) ? (String[])params.get("pr_VEND_CD") : (String[])null);
		String[] pr_ACPT_INSPC_NAME = ((params.containsKey("pr_ACPT_INSPC_NAME")) ? (String[])params.get("pr_ACPT_INSPC_NAME") : (String[])null);
		String[] pr_FIXED_LT = ((params.containsKey("pr_FIXED_LT")) ? (String[])params.get("pr_FIXED_LT") : (String[])null);
		String[] pr_PROP_LT = ((params.containsKey("pr_PROP_LT")) ? (String[])params.get("pr_PROP_LT") : (String[])null);
		String[] pr_PROP_LOT_SIZE = ((params.containsKey("pr_PROP_LOT_SIZE")) ? (String[])params.get("pr_PROP_LOT_SIZE") : (String[])null);
		String[] pr_SAFETY_LT = ((params.containsKey("pr_SAFETY_LT")) ? (String[])params.get("pr_SAFETY_LT") : (String[])null);
		String[] pr_SPOIL = ((params.containsKey("pr_SPOIL")) ? (String[])params.get("pr_SPOIL") : (String[])null);
		String[] pr_STANDARD_COST = ((params.containsKey("pr_STANDARD_COST")) ? (String[])params.get("pr_STANDARD_COST") : (String[])null);
		String[] pr_OUTSIDE_TYP = ((params.containsKey("pr_OUTSIDE_TYP")) ? (String[])params.get("pr_OUTSIDE_TYP") : (String[])null);
		String[] pr_ACPT_INSPC_TYP = ((params.containsKey("pr_ACPT_INSPC_TYP")) ? (String[])params.get("pr_ACPT_INSPC_TYP") : (String[])null);
		String[] pr_MODIFY_COUNT = ((params.containsKey("pr_MODIFY_COUNT")) ? (String[])params.get("pr_MODIFY_COUNT") : (String[])null);
		String[] pr_WS_NAME = ((params.containsKey("pr_WS_NAME")) ? (String[])params.get("pr_WS_NAME") : (String[])null);
		String[] pr_VEND_NAME = ((params.containsKey("pr_VEND_NAME")) ? (String[])params.get("pr_VEND_NAME") : (String[])null);
		String[] sub1_PARENT_ITEM_CD = ((params.containsKey("sub1_PARENT_ITEM_CD")) ? (String[])params.get("sub1_PARENT_ITEM_CD") : (String[])null);
		String[] sub1_PARENT_ITEM_NAME = ((params.containsKey("sub1_PARENT_ITEM_NAME")) ? (String[])params.get("sub1_PARENT_ITEM_NAME") : (String[])null);
		String[] sub1_DEVELOP_TYP = ((params.containsKey("sub1_DEVELOP_TYP")) ? (String[])params.get("sub1_DEVELOP_TYP") : (String[])null);
		String[] sub1_COMP_ITEM_CD = ((params.containsKey("sub1_COMP_ITEM_CD")) ? (String[])params.get("sub1_COMP_ITEM_CD") : (String[])null);
		String[] sub1_COMP_ITEM_NAME = ((params.containsKey("sub1_COMP_ITEM_NAME")) ? (String[])params.get("sub1_COMP_ITEM_NAME") : (String[])null);
		String[] sub1_PS_EDITION = ((params.containsKey("sub1_PS_EDITION")) ? (String[])params.get("sub1_PS_EDITION") : (String[])null);
		String[] sub1_MODIFY_COUNT = ((params.containsKey("sub1_MODIFY_COUNT")) ? (String[])params.get("sub1_MODIFY_COUNT") : (String[])null);
		String[] sub1_PS_UNIT_NUMERATOR = ((params.containsKey("sub1_PS_UNIT_NUMERATOR")) ? (String[])params.get("sub1_PS_UNIT_NUMERATOR") : (String[])null);
		String[] sub1_PS_UNIT_DENOMINATOR = ((params.containsKey("sub1_PS_UNIT_DENOMINATOR")) ? (String[])params.get("sub1_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] sub1_STOCK_UNIT = ((params.containsKey("sub1_STOCK_UNIT")) ? (String[])params.get("sub1_STOCK_UNIT") : (String[])null);
		String[] sub1_EFF_PHASE_IN_DATE = ((params.containsKey("sub1_EFF_PHASE_IN_DATE")) ? (String[])params.get("sub1_EFF_PHASE_IN_DATE") : (String[])null);
		String[] sub1_EFF_PHASE_OUT_DATE = ((params.containsKey("sub1_EFF_PHASE_OUT_DATE")) ? (String[])params.get("sub1_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] sub1_PS_SPOIL = ((params.containsKey("sub1_PS_SPOIL")) ? (String[])params.get("sub1_PS_SPOIL") : (String[])null);
		String[] sub1_CONS_TYP = ((params.containsKey("sub1_CONS_TYP")) ? (String[])params.get("sub1_CONS_TYP") : (String[])null);
		String[] sub1_CONS_TYP_name = ((params.containsKey("sub1_CONS_TYP_name")) ? (String[])params.get("sub1_CONS_TYP_name") : (String[])null);
		String[] sub1_CONS_TYP_val = ((params.containsKey("sub1_CONS_TYP_val")) ? (String[])params.get("sub1_CONS_TYP_val") : (String[])null);
		String[] sub1_PS_REF_NO = ((params.containsKey("sub1_PS_REF_NO")) ? (String[])params.get("sub1_PS_REF_NO") : (String[])null);
		String[] sub1_PS_FIXED_LT = ((params.containsKey("sub1_PS_FIXED_LT")) ? (String[])params.get("sub1_PS_FIXED_LT") : (String[])null);
		String[] sub1_PS_LT_CHECK = ((params.containsKey("sub1_PS_LT_CHECK")) ? (String[])params.get("sub1_PS_LT_CHECK") : (String[])null);
		String[] sub1_PS_LT_FLG = ((params.containsKey("sub1_PS_LT_FLG")) ? (String[])params.get("sub1_PS_LT_FLG") : (String[])null);
		String[] sub1_PS_PROP_LT = ((params.containsKey("sub1_PS_PROP_LT")) ? (String[])params.get("sub1_PS_PROP_LT") : (String[])null);
		String[] sub1_PS_PROP_LOT_SIZE = ((params.containsKey("sub1_PS_PROP_LOT_SIZE")) ? (String[])params.get("sub1_PS_PROP_LOT_SIZE") : (String[])null);
		String[] sub1_COST_UP_TYP = ((params.containsKey("sub1_COST_UP_TYP")) ? (String[])params.get("sub1_COST_UP_TYP") : (String[])null);
		String[] sub1_COST_UP_TYP_name = ((params.containsKey("sub1_COST_UP_TYP_name")) ? (String[])params.get("sub1_COST_UP_TYP_name") : (String[])null);
		String[] sub1_COST_UP_TYP_val = ((params.containsKey("sub1_COST_UP_TYP_val")) ? (String[])params.get("sub1_COST_UP_TYP_val") : (String[])null);
		String[] sub1_MRP_EXP_TYP = ((params.containsKey("sub1_MRP_EXP_TYP")) ? (String[])params.get("sub1_MRP_EXP_TYP") : (String[])null);
		String[] sub1_MRP_EXP_TYP_name = ((params.containsKey("sub1_MRP_EXP_TYP_name")) ? (String[])params.get("sub1_MRP_EXP_TYP_name") : (String[])null);
		String[] sub1_MRP_EXP_TYP_val = ((params.containsKey("sub1_MRP_EXP_TYP_val")) ? (String[])params.get("sub1_MRP_EXP_TYP_val") : (String[])null);
		String[] sub1_TARGET_ITEM_CD = ((params.containsKey("sub1_TARGET_ITEM_CD")) ? (String[])params.get("sub1_TARGET_ITEM_CD") : (String[])null);
		String[] sub1_LEVEL = ((params.containsKey("sub1_LEVEL")) ? (String[])params.get("sub1_LEVEL") : (String[])null);
		String[] sub1_TARGET_DATE = ((params.containsKey("sub1_TARGET_DATE")) ? (String[])params.get("sub1_TARGET_DATE") : (String[])null);
		String[] pr_ITEM_CD = ((params.containsKey("pr_ITEM_CD")) ? (String[])params.get("pr_ITEM_CD") : (String[])null);
		String[] pr_ITEM_NAME = ((params.containsKey("pr_ITEM_NAME")) ? (String[])params.get("pr_ITEM_NAME") : (String[])null);
		String[] pr_PLANT_CD = ((params.containsKey("pr_PLANT_CD")) ? (String[])params.get("pr_PLANT_CD") : (String[])null);
		String[] pr_PS_EDITION = ((params.containsKey("pr_PS_EDITION")) ? (String[])params.get("pr_PS_EDITION") : (String[])null);
		String[] hidden_ITEM_NAME = ((params.containsKey("hidden_ITEM_NAME")) ? (String[])params.get("hidden_ITEM_NAME") : (String[])null);
		String[] hidden_ITEM_CD = ((params.containsKey("hidden_ITEM_CD")) ? (String[])params.get("hidden_ITEM_CD") : (String[])null);
		String[] pr_STOCK_UNIT = ((params.containsKey("pr_STOCK_UNIT")) ? (String[])params.get("pr_STOCK_UNIT") : (String[])null);
		String[] sub2_STATUS = ((params.containsKey("sub2_STATUS")) ? (String[])params.get("sub2_STATUS") : (String[])null);
		String[] FIRST_PROC_FLG = ((params.containsKey("FIRST_PROC_FLG")) ? (String[])params.get("FIRST_PROC_FLG") : (String[])null);
		String[] sub1_h_PS_UNIT_NUMERATOR = ((params.containsKey("sub1_h_PS_UNIT_NUMERATOR")) ? (String[])params.get("sub1_h_PS_UNIT_NUMERATOR") : (String[])null);
		String[] sub1_h_PS_UNIT_DENOMINATOR = ((params.containsKey("sub1_h_PS_UNIT_DENOMINATOR")) ? (String[])params.get("sub1_h_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] sub2_STOCK_UNIT_1 = ((params.containsKey("sub2_STOCK_UNIT_1")) ? (String[])params.get("sub2_STOCK_UNIT_1") : (String[])null);
		String[] sub2_STOCK_UNIT_2 = ((params.containsKey("sub2_STOCK_UNIT_2")) ? (String[])params.get("sub2_STOCK_UNIT_2") : (String[])null);
		String[] sub2_STOCK_UNIT_3 = ((params.containsKey("sub2_STOCK_UNIT_3")) ? (String[])params.get("sub2_STOCK_UNIT_3") : (String[])null);
		String[] ps_COMP_MANHOUR_NAME = ((params.containsKey("ps_COMP_MANHOUR_NAME")) ? (String[])params.get("ps_COMP_MANHOUR_NAME") : (String[])null);
		String[] ps_COMP_MANHOUR_TYP = ((params.containsKey("ps_COMP_MANHOUR_TYP")) ? (String[])params.get("ps_COMP_MANHOUR_TYP") : (String[])null);
		String[] sub2_MANHOUR_TYP = ((params.containsKey("sub2_MANHOUR_TYP")) ? (String[])params.get("sub2_MANHOUR_TYP") : (String[])null);
		String[] ps_PARENT_MANHOUR_TYP = ((params.containsKey("ps_PARENT_MANHOUR_TYP")) ? (String[])params.get("ps_PARENT_MANHOUR_TYP") : (String[])null);

		struct.setsub2_ITEM_CD( ((sub2_ITEM_CD == null) ? (String)null : sub2_ITEM_CD[0]) );
		struct.setList_sub2_ITEM_CD(TypeConverter.convert(sub2_ITEM_CD));
		struct.setsub2_ITEM_NAME( ((sub2_ITEM_NAME == null) ? (String)null : sub2_ITEM_NAME[0]) );
		struct.setList_sub2_ITEM_NAME(TypeConverter.convert(sub2_ITEM_NAME));
		struct.setsub2_MODIFY_COUNT( ((sub2_MODIFY_COUNT == null) ? (String)null : sub2_MODIFY_COUNT[0]) );
		struct.setList_sub2_MODIFY_COUNT(TypeConverter.convert(sub2_MODIFY_COUNT));
		struct.setsub2_PROC_CD( ((sub2_PROC_CD == null) ? (String)null : sub2_PROC_CD[0]) );
		struct.setList_sub2_PROC_CD(TypeConverter.convert(sub2_PROC_CD));
		struct.setsub2_PROC_NAME( ((sub2_PROC_NAME == null) ? (String)null : sub2_PROC_NAME[0]) );
		struct.setList_sub2_PROC_NAME(TypeConverter.convert(sub2_PROC_NAME));
		struct.setsub2_PROC_NO( ((sub2_PROC_NO == null) ? (String)null : sub2_PROC_NO[0]) );
		struct.setList_sub2_PROC_NO(TypeConverter.convert(sub2_PROC_NO));
		struct.setsub2_SPOIL( ((sub2_SPOIL == null) ? (String)null : sub2_SPOIL[0]) );
		struct.setList_sub2_SPOIL(TypeConverter.convert(sub2_SPOIL));
		struct.setsub2_FIXED_LT( ((sub2_FIXED_LT == null) ? (String)null : sub2_FIXED_LT[0]) );
		struct.setList_sub2_FIXED_LT(TypeConverter.convert(sub2_FIXED_LT));
		struct.setsub2_PROP_LT( ((sub2_PROP_LT == null) ? (String)null : sub2_PROP_LT[0]) );
		struct.setList_sub2_PROP_LT(TypeConverter.convert(sub2_PROP_LT));
		struct.setsub2_PROP_LOT_SIZE( ((sub2_PROP_LOT_SIZE == null) ? (String)null : sub2_PROP_LOT_SIZE[0]) );
		struct.setList_sub2_PROP_LOT_SIZE(TypeConverter.convert(sub2_PROP_LOT_SIZE));
		struct.setsub2_STOCK_UNIT( ((sub2_STOCK_UNIT == null) ? (String)null : sub2_STOCK_UNIT[0]) );
		struct.setList_sub2_STOCK_UNIT(TypeConverter.convert(sub2_STOCK_UNIT));
		struct.setsub2_SAFETY_LT( ((sub2_SAFETY_LT == null) ? (String)null : sub2_SAFETY_LT[0]) );
		struct.setList_sub2_SAFETY_LT(TypeConverter.convert(sub2_SAFETY_LT));
		struct.setsub2_OUTSIDE_TYP( ((sub2_OUTSIDE_TYP == null) ? (String)null : sub2_OUTSIDE_TYP[0]) );
		struct.setList_sub2_OUTSIDE_TYP(TypeConverter.convert(sub2_OUTSIDE_TYP));
		struct.setsub2_OUTSIDE_TYP_name( ((sub2_OUTSIDE_TYP_name == null) ? (String)null : sub2_OUTSIDE_TYP_name[0]) );
		struct.setList_sub2_OUTSIDE_TYP_name(TypeConverter.convert(sub2_OUTSIDE_TYP_name));
		struct.setsub2_OUTSIDE_TYP_val( ((sub2_OUTSIDE_TYP_val == null) ? (String)null : sub2_OUTSIDE_TYP_val[0]) );
		struct.setList_sub2_OUTSIDE_TYP_val(TypeConverter.convert(sub2_OUTSIDE_TYP_val));
		struct.setsub2_WS_CD( ((sub2_WS_CD == null) ? (String)null : sub2_WS_CD[0]) );
		struct.setList_sub2_WS_CD(TypeConverter.convert(sub2_WS_CD));
		struct.setsub2_WS_NAME( ((sub2_WS_NAME == null) ? (String)null : sub2_WS_NAME[0]) );
		struct.setList_sub2_WS_NAME(TypeConverter.convert(sub2_WS_NAME));
		struct.setsub2_VEND_CD( ((sub2_VEND_CD == null) ? (String)null : sub2_VEND_CD[0]) );
		struct.setList_sub2_VEND_CD(TypeConverter.convert(sub2_VEND_CD));
		struct.setsub2_VEND_NAME( ((sub2_VEND_NAME == null) ? (String)null : sub2_VEND_NAME[0]) );
		struct.setList_sub2_VEND_NAME(TypeConverter.convert(sub2_VEND_NAME));
		struct.setsub2_ACPT_INSPC_TYP( ((sub2_ACPT_INSPC_TYP == null) ? (String)null : sub2_ACPT_INSPC_TYP[0]) );
		struct.setList_sub2_ACPT_INSPC_TYP(TypeConverter.convert(sub2_ACPT_INSPC_TYP));
		struct.setsub2_ACPT_INSPC_TYP_name( ((sub2_ACPT_INSPC_TYP_name == null) ? (String)null : sub2_ACPT_INSPC_TYP_name[0]) );
		struct.setList_sub2_ACPT_INSPC_TYP_name(TypeConverter.convert(sub2_ACPT_INSPC_TYP_name));
		struct.setsub2_ACPT_INSPC_TYP_val( ((sub2_ACPT_INSPC_TYP_val == null) ? (String)null : sub2_ACPT_INSPC_TYP_val[0]) );
		struct.setList_sub2_ACPT_INSPC_TYP_val(TypeConverter.convert(sub2_ACPT_INSPC_TYP_val));
		struct.setsub2_STANDARD_COST( ((sub2_STANDARD_COST == null) ? (String)null : sub2_STANDARD_COST[0]) );
		struct.setList_sub2_STANDARD_COST(TypeConverter.convert(sub2_STANDARD_COST));
		struct.setmain_TARGET_ITEM_CD( ((main_TARGET_ITEM_CD == null) ? (String)null : main_TARGET_ITEM_CD[0]) );
		struct.setList_main_TARGET_ITEM_CD(TypeConverter.convert(main_TARGET_ITEM_CD));
		struct.setmain_DEVELOP_TYP( ((main_DEVELOP_TYP == null) ? (String)null : main_DEVELOP_TYP[0]) );
		struct.setList_main_DEVELOP_TYP(TypeConverter.convert(main_DEVELOP_TYP));
		struct.setmain_DEVELOP_TYP_name( ((main_DEVELOP_TYP_name == null) ? (String)null : main_DEVELOP_TYP_name[0]) );
		struct.setList_main_DEVELOP_TYP_name(TypeConverter.convert(main_DEVELOP_TYP_name));
		struct.setmain_DEVELOP_TYP_val( ((main_DEVELOP_TYP_val == null) ? (String)null : main_DEVELOP_TYP_val[0]) );
		struct.setList_main_DEVELOP_TYP_val(TypeConverter.convert(main_DEVELOP_TYP_val));
		struct.setmain_TARGET_DATE( ((main_TARGET_DATE == null) ? (String)null : main_TARGET_DATE[0]) );
		struct.setList_main_TARGET_DATE(TypeConverter.convert(main_TARGET_DATE));
		struct.setmain_LEVEL( ((main_LEVEL == null) ? (String)null : main_LEVEL[0]) );
		struct.setList_main_LEVEL(TypeConverter.convert(main_LEVEL));
		struct.setps_MODIFY_COUNT( ((ps_MODIFY_COUNT == null) ? (String)null : ps_MODIFY_COUNT[0]) );
		struct.setList_ps_MODIFY_COUNT(TypeConverter.convert(ps_MODIFY_COUNT));
		struct.setps_NO( ((ps_NO == null) ? (String)null : ps_NO[0]) );
		struct.setList_ps_NO(TypeConverter.convert(ps_NO));
		struct.setps_PARENT_ITEM_CD( ((ps_PARENT_ITEM_CD == null) ? (String)null : ps_PARENT_ITEM_CD[0]) );
		struct.setList_ps_PARENT_ITEM_CD(TypeConverter.convert(ps_PARENT_ITEM_CD));
		struct.setps_PARENT_ITEM_NAME( ((ps_PARENT_ITEM_NAME == null) ? (String)null : ps_PARENT_ITEM_NAME[0]) );
		struct.setList_ps_PARENT_ITEM_NAME(TypeConverter.convert(ps_PARENT_ITEM_NAME));
		struct.setps_COMP_ITEM_CD( ((ps_COMP_ITEM_CD == null) ? (String)null : ps_COMP_ITEM_CD[0]) );
		struct.setList_ps_COMP_ITEM_CD(TypeConverter.convert(ps_COMP_ITEM_CD));
		struct.setps_COMP_ITEM_NAME( ((ps_COMP_ITEM_NAME == null) ? (String)null : ps_COMP_ITEM_NAME[0]) );
		struct.setList_ps_COMP_ITEM_NAME(TypeConverter.convert(ps_COMP_ITEM_NAME));
		struct.setps_PS_EDITION( ((ps_PS_EDITION == null) ? (String)null : ps_PS_EDITION[0]) );
		struct.setList_ps_PS_EDITION(TypeConverter.convert(ps_PS_EDITION));
		struct.setps_PS_UNIT_NUMERATOR( ((ps_PS_UNIT_NUMERATOR == null) ? (String)null : ps_PS_UNIT_NUMERATOR[0]) );
		struct.setList_ps_PS_UNIT_NUMERATOR(TypeConverter.convert(ps_PS_UNIT_NUMERATOR));
		struct.setps_PS_UNIT_DENOMINATOR( ((ps_PS_UNIT_DENOMINATOR == null) ? (String)null : ps_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_ps_PS_UNIT_DENOMINATOR(TypeConverter.convert(ps_PS_UNIT_DENOMINATOR));
		struct.setps_STOCK_UNIT( ((ps_STOCK_UNIT == null) ? (String)null : ps_STOCK_UNIT[0]) );
		struct.setList_ps_STOCK_UNIT(TypeConverter.convert(ps_STOCK_UNIT));
		struct.setps_EFF_PHASE_IN_DATE( ((ps_EFF_PHASE_IN_DATE == null) ? (String)null : ps_EFF_PHASE_IN_DATE[0]) );
		struct.setList_ps_EFF_PHASE_IN_DATE(TypeConverter.convert(ps_EFF_PHASE_IN_DATE));
		struct.setps_EFF_PHASE_OUT_DATE( ((ps_EFF_PHASE_OUT_DATE == null) ? (String)null : ps_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_ps_EFF_PHASE_OUT_DATE(TypeConverter.convert(ps_EFF_PHASE_OUT_DATE));
		struct.setps_PS_SPOIL( ((ps_PS_SPOIL == null) ? (String)null : ps_PS_SPOIL[0]) );
		struct.setList_ps_PS_SPOIL(TypeConverter.convert(ps_PS_SPOIL));
		struct.setps_CONS_NAME( ((ps_CONS_NAME == null) ? (String)null : ps_CONS_NAME[0]) );
		struct.setList_ps_CONS_NAME(TypeConverter.convert(ps_CONS_NAME));
		struct.setps_CONS_TYP( ((ps_CONS_TYP == null) ? (String)null : ps_CONS_TYP[0]) );
		struct.setList_ps_CONS_TYP(TypeConverter.convert(ps_CONS_TYP));
		struct.setps_PS_LT_NAME( ((ps_PS_LT_NAME == null) ? (String)null : ps_PS_LT_NAME[0]) );
		struct.setList_ps_PS_LT_NAME(TypeConverter.convert(ps_PS_LT_NAME));
		struct.setps_PS_LT_FLG( ((ps_PS_LT_FLG == null) ? (String)null : ps_PS_LT_FLG[0]) );
		struct.setList_ps_PS_LT_FLG(TypeConverter.convert(ps_PS_LT_FLG));
		struct.setps_PS_FIXED_LT( ((ps_PS_FIXED_LT == null) ? (String)null : ps_PS_FIXED_LT[0]) );
		struct.setList_ps_PS_FIXED_LT(TypeConverter.convert(ps_PS_FIXED_LT));
		struct.setps_PS_PROP_LT( ((ps_PS_PROP_LT == null) ? (String)null : ps_PS_PROP_LT[0]) );
		struct.setList_ps_PS_PROP_LT(TypeConverter.convert(ps_PS_PROP_LT));
		struct.setps_PS_PROP_LOT_SIZE( ((ps_PS_PROP_LOT_SIZE == null) ? (String)null : ps_PS_PROP_LOT_SIZE[0]) );
		struct.setList_ps_PS_PROP_LOT_SIZE(TypeConverter.convert(ps_PS_PROP_LOT_SIZE));
		struct.setps_PS_REF_NO( ((ps_PS_REF_NO == null) ? (String)null : ps_PS_REF_NO[0]) );
		struct.setList_ps_PS_REF_NO(TypeConverter.convert(ps_PS_REF_NO));
		struct.setps_COST_UP_NAME( ((ps_COST_UP_NAME == null) ? (String)null : ps_COST_UP_NAME[0]) );
		struct.setList_ps_COST_UP_NAME(TypeConverter.convert(ps_COST_UP_NAME));
		struct.setps_COST_UP_TYP( ((ps_COST_UP_TYP == null) ? (String)null : ps_COST_UP_TYP[0]) );
		struct.setList_ps_COST_UP_TYP(TypeConverter.convert(ps_COST_UP_TYP));
		struct.setps_MRP_EXP_NAME( ((ps_MRP_EXP_NAME == null) ? (String)null : ps_MRP_EXP_NAME[0]) );
		struct.setList_ps_MRP_EXP_NAME(TypeConverter.convert(ps_MRP_EXP_NAME));
		struct.setps_MRP_EXP_TYP( ((ps_MRP_EXP_TYP == null) ? (String)null : ps_MRP_EXP_TYP[0]) );
		struct.setList_ps_MRP_EXP_TYP(TypeConverter.convert(ps_MRP_EXP_TYP));
		struct.setpr_PROC_CD( ((pr_PROC_CD == null) ? (String)null : pr_PROC_CD[0]) );
		struct.setList_pr_PROC_CD(TypeConverter.convert(pr_PROC_CD));
		struct.setpr_PROC_NAME( ((pr_PROC_NAME == null) ? (String)null : pr_PROC_NAME[0]) );
		struct.setList_pr_PROC_NAME(TypeConverter.convert(pr_PROC_NAME));
		struct.setpr_PROC_NO( ((pr_PROC_NO == null) ? (String)null : pr_PROC_NO[0]) );
		struct.setList_pr_PROC_NO(TypeConverter.convert(pr_PROC_NO));
		struct.setpr_OUTSIDE_NAME( ((pr_OUTSIDE_NAME == null) ? (String)null : pr_OUTSIDE_NAME[0]) );
		struct.setList_pr_OUTSIDE_NAME(TypeConverter.convert(pr_OUTSIDE_NAME));
		struct.setpr_WS_CD( ((pr_WS_CD == null) ? (String)null : pr_WS_CD[0]) );
		struct.setList_pr_WS_CD(TypeConverter.convert(pr_WS_CD));
		struct.setpr_VEND_CD( ((pr_VEND_CD == null) ? (String)null : pr_VEND_CD[0]) );
		struct.setList_pr_VEND_CD(TypeConverter.convert(pr_VEND_CD));
		struct.setpr_ACPT_INSPC_NAME( ((pr_ACPT_INSPC_NAME == null) ? (String)null : pr_ACPT_INSPC_NAME[0]) );
		struct.setList_pr_ACPT_INSPC_NAME(TypeConverter.convert(pr_ACPT_INSPC_NAME));
		struct.setpr_FIXED_LT( ((pr_FIXED_LT == null) ? (String)null : pr_FIXED_LT[0]) );
		struct.setList_pr_FIXED_LT(TypeConverter.convert(pr_FIXED_LT));
		struct.setpr_PROP_LT( ((pr_PROP_LT == null) ? (String)null : pr_PROP_LT[0]) );
		struct.setList_pr_PROP_LT(TypeConverter.convert(pr_PROP_LT));
		struct.setpr_PROP_LOT_SIZE( ((pr_PROP_LOT_SIZE == null) ? (String)null : pr_PROP_LOT_SIZE[0]) );
		struct.setList_pr_PROP_LOT_SIZE(TypeConverter.convert(pr_PROP_LOT_SIZE));
		struct.setpr_SAFETY_LT( ((pr_SAFETY_LT == null) ? (String)null : pr_SAFETY_LT[0]) );
		struct.setList_pr_SAFETY_LT(TypeConverter.convert(pr_SAFETY_LT));
		struct.setpr_SPOIL( ((pr_SPOIL == null) ? (String)null : pr_SPOIL[0]) );
		struct.setList_pr_SPOIL(TypeConverter.convert(pr_SPOIL));
		struct.setpr_STANDARD_COST( ((pr_STANDARD_COST == null) ? (String)null : pr_STANDARD_COST[0]) );
		struct.setList_pr_STANDARD_COST(TypeConverter.convert(pr_STANDARD_COST));
		struct.setpr_OUTSIDE_TYP( ((pr_OUTSIDE_TYP == null) ? (String)null : pr_OUTSIDE_TYP[0]) );
		struct.setList_pr_OUTSIDE_TYP(TypeConverter.convert(pr_OUTSIDE_TYP));
		struct.setpr_ACPT_INSPC_TYP( ((pr_ACPT_INSPC_TYP == null) ? (String)null : pr_ACPT_INSPC_TYP[0]) );
		struct.setList_pr_ACPT_INSPC_TYP(TypeConverter.convert(pr_ACPT_INSPC_TYP));
		struct.setpr_MODIFY_COUNT( ((pr_MODIFY_COUNT == null) ? (String)null : pr_MODIFY_COUNT[0]) );
		struct.setList_pr_MODIFY_COUNT(TypeConverter.convert(pr_MODIFY_COUNT));
		struct.setpr_WS_NAME( ((pr_WS_NAME == null) ? (String)null : pr_WS_NAME[0]) );
		struct.setList_pr_WS_NAME(TypeConverter.convert(pr_WS_NAME));
		struct.setpr_VEND_NAME( ((pr_VEND_NAME == null) ? (String)null : pr_VEND_NAME[0]) );
		struct.setList_pr_VEND_NAME(TypeConverter.convert(pr_VEND_NAME));
		struct.setsub1_PARENT_ITEM_CD( ((sub1_PARENT_ITEM_CD == null) ? (String)null : sub1_PARENT_ITEM_CD[0]) );
		struct.setList_sub1_PARENT_ITEM_CD(TypeConverter.convert(sub1_PARENT_ITEM_CD));
		struct.setsub1_PARENT_ITEM_NAME( ((sub1_PARENT_ITEM_NAME == null) ? (String)null : sub1_PARENT_ITEM_NAME[0]) );
		struct.setList_sub1_PARENT_ITEM_NAME(TypeConverter.convert(sub1_PARENT_ITEM_NAME));
		struct.setsub1_DEVELOP_TYP( ((sub1_DEVELOP_TYP == null) ? (String)null : sub1_DEVELOP_TYP[0]) );
		struct.setList_sub1_DEVELOP_TYP(TypeConverter.convert(sub1_DEVELOP_TYP));
		struct.setsub1_COMP_ITEM_CD( ((sub1_COMP_ITEM_CD == null) ? (String)null : sub1_COMP_ITEM_CD[0]) );
		struct.setList_sub1_COMP_ITEM_CD(TypeConverter.convert(sub1_COMP_ITEM_CD));
		struct.setsub1_COMP_ITEM_NAME( ((sub1_COMP_ITEM_NAME == null) ? (String)null : sub1_COMP_ITEM_NAME[0]) );
		struct.setList_sub1_COMP_ITEM_NAME(TypeConverter.convert(sub1_COMP_ITEM_NAME));
		struct.setsub1_PS_EDITION( ((sub1_PS_EDITION == null) ? (String)null : sub1_PS_EDITION[0]) );
		struct.setList_sub1_PS_EDITION(TypeConverter.convert(sub1_PS_EDITION));
		struct.setsub1_MODIFY_COUNT( ((sub1_MODIFY_COUNT == null) ? (String)null : sub1_MODIFY_COUNT[0]) );
		struct.setList_sub1_MODIFY_COUNT(TypeConverter.convert(sub1_MODIFY_COUNT));
		struct.setsub1_PS_UNIT_NUMERATOR( ((sub1_PS_UNIT_NUMERATOR == null) ? (String)null : sub1_PS_UNIT_NUMERATOR[0]) );
		struct.setList_sub1_PS_UNIT_NUMERATOR(TypeConverter.convert(sub1_PS_UNIT_NUMERATOR));
		struct.setsub1_PS_UNIT_DENOMINATOR( ((sub1_PS_UNIT_DENOMINATOR == null) ? (String)null : sub1_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_sub1_PS_UNIT_DENOMINATOR(TypeConverter.convert(sub1_PS_UNIT_DENOMINATOR));
		struct.setsub1_STOCK_UNIT( ((sub1_STOCK_UNIT == null) ? (String)null : sub1_STOCK_UNIT[0]) );
		struct.setList_sub1_STOCK_UNIT(TypeConverter.convert(sub1_STOCK_UNIT));
		struct.setsub1_EFF_PHASE_IN_DATE( ((sub1_EFF_PHASE_IN_DATE == null) ? (String)null : sub1_EFF_PHASE_IN_DATE[0]) );
		struct.setList_sub1_EFF_PHASE_IN_DATE(TypeConverter.convert(sub1_EFF_PHASE_IN_DATE));
		struct.setsub1_EFF_PHASE_OUT_DATE( ((sub1_EFF_PHASE_OUT_DATE == null) ? (String)null : sub1_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_sub1_EFF_PHASE_OUT_DATE(TypeConverter.convert(sub1_EFF_PHASE_OUT_DATE));
		struct.setsub1_PS_SPOIL( ((sub1_PS_SPOIL == null) ? (String)null : sub1_PS_SPOIL[0]) );
		struct.setList_sub1_PS_SPOIL(TypeConverter.convert(sub1_PS_SPOIL));
		struct.setsub1_CONS_TYP( ((sub1_CONS_TYP == null) ? (String)null : sub1_CONS_TYP[0]) );
		struct.setList_sub1_CONS_TYP(TypeConverter.convert(sub1_CONS_TYP));
		struct.setsub1_CONS_TYP_name( ((sub1_CONS_TYP_name == null) ? (String)null : sub1_CONS_TYP_name[0]) );
		struct.setList_sub1_CONS_TYP_name(TypeConverter.convert(sub1_CONS_TYP_name));
		struct.setsub1_CONS_TYP_val( ((sub1_CONS_TYP_val == null) ? (String)null : sub1_CONS_TYP_val[0]) );
		struct.setList_sub1_CONS_TYP_val(TypeConverter.convert(sub1_CONS_TYP_val));
		struct.setsub1_PS_REF_NO( ((sub1_PS_REF_NO == null) ? (String)null : sub1_PS_REF_NO[0]) );
		struct.setList_sub1_PS_REF_NO(TypeConverter.convert(sub1_PS_REF_NO));
		struct.setsub1_PS_FIXED_LT( ((sub1_PS_FIXED_LT == null) ? (String)null : sub1_PS_FIXED_LT[0]) );
		struct.setList_sub1_PS_FIXED_LT(TypeConverter.convert(sub1_PS_FIXED_LT));
		struct.setsub1_PS_LT_CHECK( ((sub1_PS_LT_CHECK == null) ? (String)null : sub1_PS_LT_CHECK[0]) );
		struct.setList_sub1_PS_LT_CHECK(TypeConverter.convert(sub1_PS_LT_CHECK));
		struct.setsub1_PS_LT_FLG( ((sub1_PS_LT_FLG == null) ? (String)null : sub1_PS_LT_FLG[0]) );
		struct.setList_sub1_PS_LT_FLG(TypeConverter.convert(sub1_PS_LT_FLG));
		struct.setsub1_PS_PROP_LT( ((sub1_PS_PROP_LT == null) ? (String)null : sub1_PS_PROP_LT[0]) );
		struct.setList_sub1_PS_PROP_LT(TypeConverter.convert(sub1_PS_PROP_LT));
		struct.setsub1_PS_PROP_LOT_SIZE( ((sub1_PS_PROP_LOT_SIZE == null) ? (String)null : sub1_PS_PROP_LOT_SIZE[0]) );
		struct.setList_sub1_PS_PROP_LOT_SIZE(TypeConverter.convert(sub1_PS_PROP_LOT_SIZE));
		struct.setsub1_COST_UP_TYP( ((sub1_COST_UP_TYP == null) ? (String)null : sub1_COST_UP_TYP[0]) );
		struct.setList_sub1_COST_UP_TYP(TypeConverter.convert(sub1_COST_UP_TYP));
		struct.setsub1_COST_UP_TYP_name( ((sub1_COST_UP_TYP_name == null) ? (String)null : sub1_COST_UP_TYP_name[0]) );
		struct.setList_sub1_COST_UP_TYP_name(TypeConverter.convert(sub1_COST_UP_TYP_name));
		struct.setsub1_COST_UP_TYP_val( ((sub1_COST_UP_TYP_val == null) ? (String)null : sub1_COST_UP_TYP_val[0]) );
		struct.setList_sub1_COST_UP_TYP_val(TypeConverter.convert(sub1_COST_UP_TYP_val));
		struct.setsub1_MRP_EXP_TYP( ((sub1_MRP_EXP_TYP == null) ? (String)null : sub1_MRP_EXP_TYP[0]) );
		struct.setList_sub1_MRP_EXP_TYP(TypeConverter.convert(sub1_MRP_EXP_TYP));
		struct.setsub1_MRP_EXP_TYP_name( ((sub1_MRP_EXP_TYP_name == null) ? (String)null : sub1_MRP_EXP_TYP_name[0]) );
		struct.setList_sub1_MRP_EXP_TYP_name(TypeConverter.convert(sub1_MRP_EXP_TYP_name));
		struct.setsub1_MRP_EXP_TYP_val( ((sub1_MRP_EXP_TYP_val == null) ? (String)null : sub1_MRP_EXP_TYP_val[0]) );
		struct.setList_sub1_MRP_EXP_TYP_val(TypeConverter.convert(sub1_MRP_EXP_TYP_val));
		struct.setsub1_TARGET_ITEM_CD( ((sub1_TARGET_ITEM_CD == null) ? (String)null : sub1_TARGET_ITEM_CD[0]) );
		struct.setList_sub1_TARGET_ITEM_CD(TypeConverter.convert(sub1_TARGET_ITEM_CD));
		struct.setsub1_LEVEL( ((sub1_LEVEL == null) ? (String)null : sub1_LEVEL[0]) );
		struct.setList_sub1_LEVEL(TypeConverter.convert(sub1_LEVEL));
		struct.setsub1_TARGET_DATE( ((sub1_TARGET_DATE == null) ? (String)null : sub1_TARGET_DATE[0]) );
		struct.setList_sub1_TARGET_DATE(TypeConverter.convert(sub1_TARGET_DATE));
		struct.setpr_ITEM_CD( ((pr_ITEM_CD == null) ? (String)null : pr_ITEM_CD[0]) );
		struct.setList_pr_ITEM_CD(TypeConverter.convert(pr_ITEM_CD));
		struct.setpr_ITEM_NAME( ((pr_ITEM_NAME == null) ? (String)null : pr_ITEM_NAME[0]) );
		struct.setList_pr_ITEM_NAME(TypeConverter.convert(pr_ITEM_NAME));
		struct.setpr_PLANT_CD( ((pr_PLANT_CD == null) ? (String)null : pr_PLANT_CD[0]) );
		struct.setList_pr_PLANT_CD(TypeConverter.convert(pr_PLANT_CD));
		struct.setpr_PS_EDITION( ((pr_PS_EDITION == null) ? (String)null : pr_PS_EDITION[0]) );
		struct.setList_pr_PS_EDITION(TypeConverter.convert(pr_PS_EDITION));
		struct.sethidden_ITEM_NAME( ((hidden_ITEM_NAME == null) ? (String)null : hidden_ITEM_NAME[0]) );
		struct.setList_hidden_ITEM_NAME(TypeConverter.convert(hidden_ITEM_NAME));
		struct.sethidden_ITEM_CD( ((hidden_ITEM_CD == null) ? (String)null : hidden_ITEM_CD[0]) );
		struct.setList_hidden_ITEM_CD(TypeConverter.convert(hidden_ITEM_CD));
		struct.setpr_STOCK_UNIT( ((pr_STOCK_UNIT == null) ? (String)null : pr_STOCK_UNIT[0]) );
		struct.setList_pr_STOCK_UNIT(TypeConverter.convert(pr_STOCK_UNIT));
		struct.setsub2_STATUS( ((sub2_STATUS == null) ? (String)null : sub2_STATUS[0]) );
		struct.setList_sub2_STATUS(TypeConverter.convert(sub2_STATUS));
		struct.setFIRST_PROC_FLG( ((FIRST_PROC_FLG == null) ? (String)null : FIRST_PROC_FLG[0]) );
		struct.setList_FIRST_PROC_FLG(TypeConverter.convert(FIRST_PROC_FLG));
		struct.setsub1_h_PS_UNIT_NUMERATOR( ((sub1_h_PS_UNIT_NUMERATOR == null) ? (String)null : sub1_h_PS_UNIT_NUMERATOR[0]) );
		struct.setList_sub1_h_PS_UNIT_NUMERATOR(TypeConverter.convert(sub1_h_PS_UNIT_NUMERATOR));
		struct.setsub1_h_PS_UNIT_DENOMINATOR( ((sub1_h_PS_UNIT_DENOMINATOR == null) ? (String)null : sub1_h_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_sub1_h_PS_UNIT_DENOMINATOR(TypeConverter.convert(sub1_h_PS_UNIT_DENOMINATOR));
		struct.setsub2_STOCK_UNIT_1( ((sub2_STOCK_UNIT_1 == null) ? (String)null : sub2_STOCK_UNIT_1[0]) );
		struct.setList_sub2_STOCK_UNIT_1(TypeConverter.convert(sub2_STOCK_UNIT_1));
		struct.setsub2_STOCK_UNIT_2( ((sub2_STOCK_UNIT_2 == null) ? (String)null : sub2_STOCK_UNIT_2[0]) );
		struct.setList_sub2_STOCK_UNIT_2(TypeConverter.convert(sub2_STOCK_UNIT_2));
		struct.setsub2_STOCK_UNIT_3( ((sub2_STOCK_UNIT_3 == null) ? (String)null : sub2_STOCK_UNIT_3[0]) );
		struct.setList_sub2_STOCK_UNIT_3(TypeConverter.convert(sub2_STOCK_UNIT_3));
		struct.setps_COMP_MANHOUR_NAME( ((ps_COMP_MANHOUR_NAME == null) ? (String)null : ps_COMP_MANHOUR_NAME[0]) );
		struct.setList_ps_COMP_MANHOUR_NAME(TypeConverter.convert(ps_COMP_MANHOUR_NAME));
		struct.setps_COMP_MANHOUR_TYP( ((ps_COMP_MANHOUR_TYP == null) ? (String)null : ps_COMP_MANHOUR_TYP[0]) );
		struct.setList_ps_COMP_MANHOUR_TYP(TypeConverter.convert(ps_COMP_MANHOUR_TYP));
		struct.setsub2_MANHOUR_TYP( ((sub2_MANHOUR_TYP == null) ? (String)null : sub2_MANHOUR_TYP[0]) );
		struct.setList_sub2_MANHOUR_TYP(TypeConverter.convert(sub2_MANHOUR_TYP));
		struct.setps_PARENT_MANHOUR_TYP( ((ps_PARENT_MANHOUR_TYP == null) ? (String)null : ps_PARENT_MANHOUR_TYP[0]) );
		struct.setList_ps_PARENT_MANHOUR_TYP(TypeConverter.convert(ps_PARENT_MANHOUR_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0170010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAA0170010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAA0170010Struct";   // JSP先のバインド名(Struct)の指定
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
					AA0170010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0170010Entity entity = control.entity;
		AA0170010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0170010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0170010Control control;
		AA0170010Entity  entity = null;
		AA0170010Struct  struct = null;

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

			if( (control = (AA0170010Control)so.getAttribute("AA0170010Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0170010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0170010Control();
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
				if( isClick(request, "select") ) {
					if ( !isCryptical(request, so, params, "select") ) return ERROR_TARGET;
					target = onClickselect(request, response, so, params, control);
					control.setButton("select");
				} else if( isClick(request, "updateSub1") ) {
					if ( !isCryptical(request, so, params, "updateSub1") ) return ERROR_TARGET;
					target = onClickupdateSub1(request, response, so, params, control);
					control.setButton("updateSub1");
				} else if( isClick(request, "closeSub1") ) {
					if ( !isCryptical(request, so, params, "closeSub1") ) return ERROR_TARGET;
					target = onClickcloseSub1(request, response, so, params, control);
					control.setButton("closeSub1");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "insertSub1") ) {
					if ( !isCryptical(request, so, params, "insertSub1") ) return ERROR_TARGET;
					target = onClickinsertSub1(request, response, so, params, control);
					control.setButton("insertSub1");
				} else if( isClick(request, "selectProcGrp") ) {
					if ( !isCryptical(request, so, params, "selectProcGrp") ) return ERROR_TARGET;
					target = onClickselectProcGrp(request, response, so, params, control);
					control.setButton("selectProcGrp");
				} else if( isClick(request, "insertProcGrp") ) {
					if ( !isCryptical(request, so, params, "insertProcGrp") ) return ERROR_TARGET;
					target = onClickinsertProcGrp(request, response, so, params, control);
					control.setButton("insertProcGrp");
				} else if( isClick(request, "updateProcGrp") ) {
					if ( !isCryptical(request, so, params, "updateProcGrp") ) return ERROR_TARGET;
					target = onClickupdateProcGrp(request, response, so, params, control);
					control.setButton("updateProcGrp");
				} else if( isClick(request, "copyProcGrp") ) {
					if ( !isCryptical(request, so, params, "copyProcGrp") ) return ERROR_TARGET;
					target = onClickcopyProcGrp(request, response, so, params, control);
					control.setButton("copyProcGrp");
				} else if( isClick(request, "deleteProcGrp") ) {
					if ( !isCryptical(request, so, params, "deleteProcGrp") ) return ERROR_TARGET;
					target = onClickdeleteProcGrp(request, response, so, params, control);
					control.setButton("deleteProcGrp");
				} else if( isClick(request, "deleteAllProcGrp") ) {
					if ( !isCryptical(request, so, params, "deleteAllProcGrp") ) return ERROR_TARGET;
					target = onClickdeleteAllProcGrp(request, response, so, params, control);
					control.setButton("deleteAllProcGrp");
				} else if( isClick(request, "renumProcGrp") ) {
					if ( !isCryptical(request, so, params, "renumProcGrp") ) return ERROR_TARGET;
					target = onClickrenumProcGrp(request, response, so, params, control);
					control.setButton("renumProcGrp");
				} else if( isClick(request, "insertSub2") ) {
					if ( !isCryptical(request, so, params, "insertSub2") ) return ERROR_TARGET;
					target = onClickinsertSub2(request, response, so, params, control);
					control.setButton("insertSub2");
				} else if( isClick(request, "updateSub2") ) {
					if ( !isCryptical(request, so, params, "updateSub2") ) return ERROR_TARGET;
					target = onClickupdateSub2(request, response, so, params, control);
					control.setButton("updateSub2");
				} else if( isClick(request, "closeSub2") ) {
					if ( !isCryptical(request, so, params, "closeSub2") ) return ERROR_TARGET;
					target = onClickcloseSub2(request, response, so, params, control);
					control.setButton("closeSub2");
				} else if( isClick(request, "insertPs") ) {
					if ( !isCryptical(request, so, params, "insertPs") ) return ERROR_TARGET;
					target = onClickinsertPs(request, response, so, params, control);
					control.setButton("insertPs");
				} else if( isClick(request, "updatePs") ) {
					if ( !isCryptical(request, so, params, "updatePs") ) return ERROR_TARGET;
					target = onClickupdatePs(request, response, so, params, control);
					control.setButton("updatePs");
				} else if( isClick(request, "deletePs") ) {
					if ( !isCryptical(request, so, params, "deletePs") ) return ERROR_TARGET;
					target = onClickdeletePs(request, response, so, params, control);
					control.setButton("deletePs");
				} else if( isClick(request, "deleteAllPs") ) {
					if ( !isCryptical(request, so, params, "deleteAllPs") ) return ERROR_TARGET;
					target = onClickdeleteAllPs(request, response, so, params, control);
					control.setButton("deleteAllPs");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0170010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
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
				if((isClick(request, "select") && bFLG_DISCONNECT_select)
				|| (isClick(request, "updateSub1") && bFLG_DISCONNECT_updateSub1)
				|| (isClick(request, "closeSub1") && bFLG_DISCONNECT_closeSub1)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "insertSub1") && bFLG_DISCONNECT_insertSub1)
				|| (isClick(request, "selectProcGrp") && bFLG_DISCONNECT_selectProcGrp)
				|| (isClick(request, "insertProcGrp") && bFLG_DISCONNECT_insertProcGrp)
				|| (isClick(request, "updateProcGrp") && bFLG_DISCONNECT_updateProcGrp)
				|| (isClick(request, "copyProcGrp") && bFLG_DISCONNECT_copyProcGrp)
				|| (isClick(request, "deleteProcGrp") && bFLG_DISCONNECT_deleteProcGrp)
				|| (isClick(request, "deleteAllProcGrp") && bFLG_DISCONNECT_deleteAllProcGrp)
				|| (isClick(request, "renumProcGrp") && bFLG_DISCONNECT_renumProcGrp)
				|| (isClick(request, "insertSub2") && bFLG_DISCONNECT_insertSub2)
				|| (isClick(request, "updateSub2") && bFLG_DISCONNECT_updateSub2)
				|| (isClick(request, "closeSub2") && bFLG_DISCONNECT_closeSub2)
				|| (isClick(request, "insertPs") && bFLG_DISCONNECT_insertPs)
				|| (isClick(request, "updatePs") && bFLG_DISCONNECT_updatePs)
				|| (isClick(request, "deletePs") && bFLG_DISCONNECT_deletePs)
				|| (isClick(request, "deleteAllPs") && bFLG_DISCONNECT_deleteAllPs)
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
	private  static boolean bFLG_DISCONNECT_select = true;
	private  static boolean bFLG_DISCONNECT_updateSub1 = true;
	private  static boolean bFLG_DISCONNECT_closeSub1 = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_insertSub1 = true;
	private  static boolean bFLG_DISCONNECT_selectProcGrp = true;
	private  static boolean bFLG_DISCONNECT_insertProcGrp = true;
	private  static boolean bFLG_DISCONNECT_updateProcGrp = true;
	private  static boolean bFLG_DISCONNECT_copyProcGrp = true;
	private  static boolean bFLG_DISCONNECT_deleteProcGrp = true;
	private  static boolean bFLG_DISCONNECT_deleteAllProcGrp = true;
	private  static boolean bFLG_DISCONNECT_renumProcGrp = true;
	private  static boolean bFLG_DISCONNECT_insertSub2 = true;
	private  static boolean bFLG_DISCONNECT_updateSub2 = true;
	private  static boolean bFLG_DISCONNECT_closeSub2 = true;
	private  static boolean bFLG_DISCONNECT_insertPs = true;
	private  static boolean bFLG_DISCONNECT_updatePs = true;
	private  static boolean bFLG_DISCONNECT_deletePs = true;
	private  static boolean bFLG_DISCONNECT_deleteAllPs = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0170.AA0170010Servlet";
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
	public AA0170010Servlet()
	{
		//{{user_implement_dev:<AA0170010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
              
                 bFLG_DISCONNECT_select = true;
              
                 bFLG_DISCONNECT_insertPs = true;
              
                 bFLG_DISCONNECT_updatePs = true;
              
                 bFLG_DISCONNECT_deletePs = true;
              
                 bFLG_DISCONNECT_deleteAllPs = true;
              
                 bFLG_DISCONNECT_updateSub1 = true;
              
                 bFLG_DISCONNECT_closeSub1 = true;
              
                //}}user_implement_dev:<AA0170010_DisConnect_FLG>

		//{{user_implement_dev:<AA0170010Servlet>
                //}}user_implement_dev:<AA0170010Servlet>
	}

	//////////////////////////////

}
