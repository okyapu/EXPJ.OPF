/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0020/src/com/nec/jp/orteus/metamorBase/AH0020/AH0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0020;

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

public class AH0020010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
       
        //------------------------------------------------------------------------------
        /** 
         * 一覧情報取得設定処理
         *
         * @param	AH0020010Control	control
         * @return	なし
        */
        private void setListData(AH0020010Control control)
        {
         if(control.struct.getList_w_target() != null)
         {
          // 一覧に表示されているデータ数分処理を繰り返す
          List list = control.getList();
          list.clear();
          for(int i = 0; i < control.struct.getList_w_target().size(); i++)
          {
           // データ取得
           AH0020010Struct targetStruct = new AH0020010Struct();
                 targetStruct.importData(control.struct, i);
                 if("true".equals(targetStruct.getc_target())==true)
                 {
                  targetStruct.setw_target("1");
                 }
                 else
                 {
                  targetStruct.setw_target("0");
                 }
                 list.add(targetStruct);
          }
         }
         return;
        }
        //------------------------------------------------------------------------------
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
	 * @param control AH0020010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AH0020010Control control)
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
	 * @param control AH0020010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AH0020010Control control)
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
	 * @param control AH0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
			logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AH0020010"+" $Revision: 1.5 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AH0020010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
                try {
                 // リロード処理
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------------------
                try {
              
                 // 読込処理
                 control.control_eventHandller("select");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 保管区指定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickselect_wh(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_wh");
		//{{user_implement_dev:<onClickselect_wh>
                //------------------------------------------------------------------------------
                try {
              
                 // 保管区指定処理
                 control.control_eventHandller("select_wh");
              
                 // エラーなしの場合、子画面に遷移
                 if(control.getMessage().sizeError() <= 0)
                 {
                  nextUrl = "/AH0020011.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_wh>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_wh");

		return nextUrl;
	}

	/**
	 * 品目指定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickselect_item(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_item");
		//{{user_implement_dev:<onClickselect_item>
                //------------------------------------------------------------------------------
                try {
              
                 // 品目指定処理
                 control.control_eventHandller("select_item");
              
                 // エラーなしの場合、子画面に遷移
                 if(control.getMessage().sizeError() <= 0)
                 {
                  nextUrl = "/AH0020012.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_item>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_item");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
                //------------------------------------------------------------------------------
                try {
              
                 // 登録処理
                 control.control_eventHandller("insert");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------------------
                try {
              
                 // 更新処理
                 control.control_eventHandller("update");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
                //------------------------------------------------------------------------------
                try {
              
                 // 削除処理
                 control.control_eventHandller("delete");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------------------
                try {
              
                 // クリア処理
                 control.control_eventHandller("clear");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickselect_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");
		//{{user_implement_dev:<onClickselect_sub1>
                //------------------------------------------------------------------------------
                try {
              
                 // 読込処理
                 control.control_eventHandller("select_sub1");
              
                 // 子画面に遷移
                 nextUrl = "/AH0020011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickupdate_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");
		//{{user_implement_dev:<onClickupdate_sub1>
                //------------------------------------------------------------------------------
                try {
              
                 // 一覧情報取得設定処理
                 setListData(control);
              
                 // 更新処理
                 control.control_eventHandller("update_sub1");
              
                 // 子画面に遷移
                 nextUrl = "/AH0020011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickclear_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub1");
		//{{user_implement_dev:<onClickclear_sub1>
                //------------------------------------------------------------------------------
                try {
              
                 // クリア処理
                 control.control_eventHandller("clear_sub1");
              
                 // 子画面に遷移
                 nextUrl = "/AH0020011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
                try {
              
                 // 戻る処理
                 control.control_eventHandller("return_sub1");
              
                 // 親画面に遷移
                 nextUrl = "/AH0020010.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickselect_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub2");
		//{{user_implement_dev:<onClickselect_sub2>
                //------------------------------------------------------------------------------
                try {
              
                 // 読込処理
                 control.control_eventHandller("select_sub2");
              
                 // 子画面に遷移
                 nextUrl = "/AH0020012.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub2");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickupdate_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub2");
		//{{user_implement_dev:<onClickupdate_sub2>
                //------------------------------------------------------------------------------
                try {
              
                 // 一覧情報取得設定処理
                 setListData(control);
              
                 // 更新処理
                 control.control_eventHandller("update_sub2");
              
                 // 子画面に遷移
                 nextUrl = "/AH0020012.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub2");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickclear_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub2");
		//{{user_implement_dev:<onClickclear_sub2>
                //------------------------------------------------------------------------------
                try {
              
                 // クリア処理
                 control.control_eventHandller("clear_sub2");
              
                 // 子画面に遷移
                 nextUrl = "/AH0020012.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub2");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickreturn_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub2");
		//{{user_implement_dev:<onClickreturn_sub2>
                //---------------------------------------------------------------------
                try {
              
                 // 戻る処理
                 control.control_eventHandller("return_sub2");
              
                 // 親画面に遷移
                 nextUrl = "/AH0020010.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub2");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickreturn_sub3(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub3");
		//{{user_implement_dev:<onClickreturn_sub3>
                //---------------------------------------------------------------------
                try {
              
                 // 戻る処理
                 control.control_eventHandller("return_sub3");
              
                 if(control.FLG_INV_TARGET_WH.equals(control.getInvTargetFlg()) == true)
                 {
                  // 子画面（保管区指定）に遷移
                  nextUrl = "/AH0020011.jsp";
                 }
                 else
                 {
                  // 子画面（品目指定）に遷移
                  nextUrl = "/AH0020012.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub3>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub3");

		return nextUrl;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickCsvImportWh(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportWh");
		//{{user_implement_dev:<onClickCsvImportWh>
                //------------------------------------------------------------------------------
                try {
              
                 // ＣＳＶ取込処理
                 control.control_eventHandller("CsvImportWh");
              
                 if(control.getMessage().sizeError() <= 0)
                 {
                  // エラーなしの場合、CSV画面に遷移
                  nextUrl = "/AH0020013.jsp";
                 }
                 else
                 {
                  // エラーありの場合、子画面のまま
                  nextUrl = "/AH0020011.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvImportWh>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportWh");

		return nextUrl;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickCsvImportItem(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportItem");
		//{{user_implement_dev:<onClickCsvImportItem>
                //------------------------------------------------------------------------------
                try {
              
                 // ＣＳＶ取込処理
                 control.control_eventHandller("CsvImportItem");
              
                 if(control.getMessage().sizeError() <= 0)
                 {
                  // エラーなしの場合、CSV画面に遷移
                  nextUrl = "/AH0020013.jsp";
                 }
                 else
                 {
                  // エラーありの場合、子画面のまま
                  nextUrl = "/AH0020012.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvImportItem>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportItem");

		return nextUrl;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickBrowse(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");
		//{{user_implement_dev:<onClickBrowse>
                //---------------------------------------------------------------------
                try {
                 control.control_eventHandller("Browse");
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickBrowse>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");

		return nextUrl;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickCsvIn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");
		//{{user_implement_dev:<onClickCsvIn>
                //------------------------------------------------------------------------------
                try {
                 control.setCsvReader(new CsvReader(request));
                 control.control_eventHandller("CsvIn");
                 control.setCsvReader(null);
              
                 if(control.getMessage().sizeError() > 0)
                 {
                  // エラーがある場合、子画面のまま
                  nextUrl = "/AH0020013.jsp";
                 }
                 else
                 {
                  if(control.FLG_INV_TARGET_WH.equals(control.getInvTargetFlg()) == true)
                  {
                   // 子画面（保管区指定）に遷移
                   nextUrl = "/AH0020011.jsp";
                  }
                  else
                  {
                   // 子画面（品目指定）に遷移
                   nextUrl = "/AH0020012.jsp";
                  }
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvIn>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");

		return nextUrl;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");
		//{{user_implement_dev:<onClickselectall>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("selectall");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickselectall>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");

		return nextUrl;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AH0020010Controlクラスインスタンス
	 */
	public String onClickcancelselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");
		//{{user_implement_dev:<onClickcancelselectall>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("cancelselectall");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcancelselectall>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AH0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] INV_DATE = ((params.containsKey("INV_DATE")) ? (String[])params.get("INV_DATE") : (String[])null);
		String[] w_INV_STS_TYP = ((params.containsKey("w_INV_STS_TYP")) ? (String[])params.get("w_INV_STS_TYP") : (String[])null);
		String[] h_REGULAR_INV_FLG = ((params.containsKey("h_REGULAR_INV_FLG")) ? (String[])params.get("h_REGULAR_INV_FLG") : (String[])null);
		String[] h_CYCLE_INV_FLG = ((params.containsKey("h_CYCLE_INV_FLG")) ? (String[])params.get("h_CYCLE_INV_FLG") : (String[])null);
		String[] h_TEMP_INV_FLG = ((params.containsKey("h_TEMP_INV_FLG")) ? (String[])params.get("h_TEMP_INV_FLG") : (String[])null);
		String[] INV_COMMENT = ((params.containsKey("INV_COMMENT")) ? (String[])params.get("INV_COMMENT") : (String[])null);
		String[] INV_START_DATE = ((params.containsKey("INV_START_DATE")) ? (String[])params.get("INV_START_DATE") : (String[])null);
		String[] STOCK_SAVE_DATE = ((params.containsKey("STOCK_SAVE_DATE")) ? (String[])params.get("STOCK_SAVE_DATE") : (String[])null);
		String[] INV_UPDATED_DATE = ((params.containsKey("INV_UPDATED_DATE")) ? (String[])params.get("INV_UPDATED_DATE") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] w_MRP_FLG = ((params.containsKey("w_MRP_FLG")) ? (String[])params.get("w_MRP_FLG") : (String[])null);
		String[] w_WH_TYP = ((params.containsKey("w_WH_TYP")) ? (String[])params.get("w_WH_TYP") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] w_MRP_ODR_TYP = ((params.containsKey("w_MRP_ODR_TYP")) ? (String[])params.get("w_MRP_ODR_TYP") : (String[])null);
		String[] w_OUTSIDE_TYP = ((params.containsKey("w_OUTSIDE_TYP")) ? (String[])params.get("w_OUTSIDE_TYP") : (String[])null);
		String[] WH_VEND_CD = ((params.containsKey("WH_VEND_CD")) ? (String[])params.get("WH_VEND_CD") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] h_disp_entry_wh = ((params.containsKey("h_disp_entry_wh")) ? (String[])params.get("h_disp_entry_wh") : (String[])null);
		String[] w_WH_CD = ((params.containsKey("w_WH_CD")) ? (String[])params.get("w_WH_CD") : (String[])null);
		String[] h_disp_entry_item = ((params.containsKey("h_disp_entry_item")) ? (String[])params.get("h_disp_entry_item") : (String[])null);
		String[] h_INV_STS_TYP = ((params.containsKey("h_INV_STS_TYP")) ? (String[])params.get("h_INV_STS_TYP") : (String[])null);
		String[] w_ABC_TYP = ((params.containsKey("w_ABC_TYP")) ? (String[])params.get("w_ABC_TYP") : (String[])null);
		String[] s_ABC_TYP = ((params.containsKey("s_ABC_TYP")) ? (String[])params.get("s_ABC_TYP") : (String[])null);
		String[] s_ABC_TYP_name = ((params.containsKey("s_ABC_TYP_name")) ? (String[])params.get("s_ABC_TYP_name") : (String[])null);
		String[] s_ABC_TYP_val = ((params.containsKey("s_ABC_TYP_val")) ? (String[])params.get("s_ABC_TYP_val") : (String[])null);
		String[] ERR_ADR = ((params.containsKey("ERR_ADR")) ? (String[])params.get("ERR_ADR") : (String[])null);
		String[] ERR_MSG = ((params.containsKey("ERR_MSG")) ? (String[])params.get("ERR_MSG") : (String[])null);
		String[] h_saveINV_DATE = ((params.containsKey("h_saveINV_DATE")) ? (String[])params.get("h_saveINV_DATE") : (String[])null);
		String[] c_REGULAR_INV_FLG = ((params.containsKey("c_REGULAR_INV_FLG")) ? (String[])params.get("c_REGULAR_INV_FLG") : (String[])null);
		String[] c_CYCLE_INV_FLG = ((params.containsKey("c_CYCLE_INV_FLG")) ? (String[])params.get("c_CYCLE_INV_FLG") : (String[])null);
		String[] c_TEMP_INV_FLG = ((params.containsKey("c_TEMP_INV_FLG")) ? (String[])params.get("c_TEMP_INV_FLG") : (String[])null);
		String[] c_disp_entry_wh = ((params.containsKey("c_disp_entry_wh")) ? (String[])params.get("c_disp_entry_wh") : (String[])null);
		String[] c_disp_entry_item = ((params.containsKey("c_disp_entry_item")) ? (String[])params.get("c_disp_entry_item") : (String[])null);
		String[] c_target = ((params.containsKey("c_target")) ? (String[])params.get("c_target") : (String[])null);
		String[] h_saveINV_STS_TYP = ((params.containsKey("h_saveINV_STS_TYP")) ? (String[])params.get("h_saveINV_STS_TYP") : (String[])null);
		String[] INV_WH_CD = ((params.containsKey("INV_WH_CD")) ? (String[])params.get("INV_WH_CD") : (String[])null);
		String[] MRP_FLG = ((params.containsKey("MRP_FLG")) ? (String[])params.get("MRP_FLG") : (String[])null);
		String[] WH_TYP = ((params.containsKey("WH_TYP")) ? (String[])params.get("WH_TYP") : (String[])null);
		String[] INV_ITEM_CD = ((params.containsKey("INV_ITEM_CD")) ? (String[])params.get("INV_ITEM_CD") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] OUTSIDE_TYP = ((params.containsKey("OUTSIDE_TYP")) ? (String[])params.get("OUTSIDE_TYP") : (String[])null);
		String[] ABC_TYP = ((params.containsKey("ABC_TYP")) ? (String[])params.get("ABC_TYP") : (String[])null);
		String[] w_target = ((params.containsKey("w_target")) ? (String[])params.get("w_target") : (String[])null);
		String[] r1_inv_target = ((params.containsKey("r1_inv_target")) ? (String[])params.get("r1_inv_target") : (String[])null);
		String[] r2_inv_target = ((params.containsKey("r2_inv_target")) ? (String[])params.get("r2_inv_target") : (String[])null);
		String[] FileName = ((params.containsKey("FileName")) ? (String[])params.get("FileName") : (String[])null);
		String[] h_saveTEMP_INV_FLG = ((params.containsKey("h_saveTEMP_INV_FLG")) ? (String[])params.get("h_saveTEMP_INV_FLG") : (String[])null);

		struct.setINV_DATE( ((INV_DATE == null) ? (String)null : INV_DATE[0]) );
		struct.setList_INV_DATE(TypeConverter.convert(INV_DATE));
		struct.setw_INV_STS_TYP( ((w_INV_STS_TYP == null) ? (String)null : w_INV_STS_TYP[0]) );
		struct.setList_w_INV_STS_TYP(TypeConverter.convert(w_INV_STS_TYP));
		struct.seth_REGULAR_INV_FLG( ((h_REGULAR_INV_FLG == null) ? (String)null : h_REGULAR_INV_FLG[0]) );
		struct.setList_h_REGULAR_INV_FLG(TypeConverter.convert(h_REGULAR_INV_FLG));
		struct.seth_CYCLE_INV_FLG( ((h_CYCLE_INV_FLG == null) ? (String)null : h_CYCLE_INV_FLG[0]) );
		struct.setList_h_CYCLE_INV_FLG(TypeConverter.convert(h_CYCLE_INV_FLG));
		struct.seth_TEMP_INV_FLG( ((h_TEMP_INV_FLG == null) ? (String)null : h_TEMP_INV_FLG[0]) );
		struct.setList_h_TEMP_INV_FLG(TypeConverter.convert(h_TEMP_INV_FLG));
		struct.setINV_COMMENT( ((INV_COMMENT == null) ? (String)null : INV_COMMENT[0]) );
		struct.setList_INV_COMMENT(TypeConverter.convert(INV_COMMENT));
		struct.setINV_START_DATE( ((INV_START_DATE == null) ? (String)null : INV_START_DATE[0]) );
		struct.setList_INV_START_DATE(TypeConverter.convert(INV_START_DATE));
		struct.setSTOCK_SAVE_DATE( ((STOCK_SAVE_DATE == null) ? (String)null : STOCK_SAVE_DATE[0]) );
		struct.setList_STOCK_SAVE_DATE(TypeConverter.convert(STOCK_SAVE_DATE));
		struct.setINV_UPDATED_DATE( ((INV_UPDATED_DATE == null) ? (String)null : INV_UPDATED_DATE[0]) );
		struct.setList_INV_UPDATED_DATE(TypeConverter.convert(INV_UPDATED_DATE));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setw_MRP_FLG( ((w_MRP_FLG == null) ? (String)null : w_MRP_FLG[0]) );
		struct.setList_w_MRP_FLG(TypeConverter.convert(w_MRP_FLG));
		struct.setw_WH_TYP( ((w_WH_TYP == null) ? (String)null : w_WH_TYP[0]) );
		struct.setList_w_WH_TYP(TypeConverter.convert(w_WH_TYP));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setw_MRP_ODR_TYP( ((w_MRP_ODR_TYP == null) ? (String)null : w_MRP_ODR_TYP[0]) );
		struct.setList_w_MRP_ODR_TYP(TypeConverter.convert(w_MRP_ODR_TYP));
		struct.setw_OUTSIDE_TYP( ((w_OUTSIDE_TYP == null) ? (String)null : w_OUTSIDE_TYP[0]) );
		struct.setList_w_OUTSIDE_TYP(TypeConverter.convert(w_OUTSIDE_TYP));
		struct.setWH_VEND_CD( ((WH_VEND_CD == null) ? (String)null : WH_VEND_CD[0]) );
		struct.setList_WH_VEND_CD(TypeConverter.convert(WH_VEND_CD));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.seth_disp_entry_wh( ((h_disp_entry_wh == null) ? (String)null : h_disp_entry_wh[0]) );
		struct.setList_h_disp_entry_wh(TypeConverter.convert(h_disp_entry_wh));
		struct.setw_WH_CD( ((w_WH_CD == null) ? (String)null : w_WH_CD[0]) );
		struct.setList_w_WH_CD(TypeConverter.convert(w_WH_CD));
		struct.seth_disp_entry_item( ((h_disp_entry_item == null) ? (String)null : h_disp_entry_item[0]) );
		struct.setList_h_disp_entry_item(TypeConverter.convert(h_disp_entry_item));
		struct.seth_INV_STS_TYP( ((h_INV_STS_TYP == null) ? (String)null : h_INV_STS_TYP[0]) );
		struct.setList_h_INV_STS_TYP(TypeConverter.convert(h_INV_STS_TYP));
		struct.setw_ABC_TYP( ((w_ABC_TYP == null) ? (String)null : w_ABC_TYP[0]) );
		struct.setList_w_ABC_TYP(TypeConverter.convert(w_ABC_TYP));
		struct.sets_ABC_TYP( ((s_ABC_TYP == null) ? (String)null : s_ABC_TYP[0]) );
		struct.setList_s_ABC_TYP(TypeConverter.convert(s_ABC_TYP));
		struct.sets_ABC_TYP_name( ((s_ABC_TYP_name == null) ? (String)null : s_ABC_TYP_name[0]) );
		struct.setList_s_ABC_TYP_name(TypeConverter.convert(s_ABC_TYP_name));
		struct.sets_ABC_TYP_val( ((s_ABC_TYP_val == null) ? (String)null : s_ABC_TYP_val[0]) );
		struct.setList_s_ABC_TYP_val(TypeConverter.convert(s_ABC_TYP_val));
		struct.setERR_ADR( ((ERR_ADR == null) ? (String)null : ERR_ADR[0]) );
		struct.setList_ERR_ADR(TypeConverter.convert(ERR_ADR));
		struct.setERR_MSG( ((ERR_MSG == null) ? (String)null : ERR_MSG[0]) );
		struct.setList_ERR_MSG(TypeConverter.convert(ERR_MSG));
		struct.seth_saveINV_DATE( ((h_saveINV_DATE == null) ? (String)null : h_saveINV_DATE[0]) );
		struct.setList_h_saveINV_DATE(TypeConverter.convert(h_saveINV_DATE));
		struct.setc_REGULAR_INV_FLG( ((c_REGULAR_INV_FLG == null) ? (String)null : c_REGULAR_INV_FLG[0]) );
		struct.setList_c_REGULAR_INV_FLG(TypeConverter.convert(c_REGULAR_INV_FLG));
		struct.setc_CYCLE_INV_FLG( ((c_CYCLE_INV_FLG == null) ? (String)null : c_CYCLE_INV_FLG[0]) );
		struct.setList_c_CYCLE_INV_FLG(TypeConverter.convert(c_CYCLE_INV_FLG));
		struct.setc_TEMP_INV_FLG( ((c_TEMP_INV_FLG == null) ? (String)null : c_TEMP_INV_FLG[0]) );
		struct.setList_c_TEMP_INV_FLG(TypeConverter.convert(c_TEMP_INV_FLG));
		struct.setc_disp_entry_wh( ((c_disp_entry_wh == null) ? (String)null : c_disp_entry_wh[0]) );
		struct.setList_c_disp_entry_wh(TypeConverter.convert(c_disp_entry_wh));
		struct.setc_disp_entry_item( ((c_disp_entry_item == null) ? (String)null : c_disp_entry_item[0]) );
		struct.setList_c_disp_entry_item(TypeConverter.convert(c_disp_entry_item));
		struct.setc_target( ((c_target == null) ? (String)null : c_target[0]) );
		struct.setList_c_target(TypeConverter.convert(c_target));
		struct.seth_saveINV_STS_TYP( ((h_saveINV_STS_TYP == null) ? (String)null : h_saveINV_STS_TYP[0]) );
		struct.setList_h_saveINV_STS_TYP(TypeConverter.convert(h_saveINV_STS_TYP));
		struct.setINV_WH_CD( ((INV_WH_CD == null) ? (String)null : INV_WH_CD[0]) );
		struct.setList_INV_WH_CD(TypeConverter.convert(INV_WH_CD));
		struct.setMRP_FLG( ((MRP_FLG == null) ? (String)null : MRP_FLG[0]) );
		struct.setList_MRP_FLG(TypeConverter.convert(MRP_FLG));
		struct.setWH_TYP( ((WH_TYP == null) ? (String)null : WH_TYP[0]) );
		struct.setList_WH_TYP(TypeConverter.convert(WH_TYP));
		struct.setINV_ITEM_CD( ((INV_ITEM_CD == null) ? (String)null : INV_ITEM_CD[0]) );
		struct.setList_INV_ITEM_CD(TypeConverter.convert(INV_ITEM_CD));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setOUTSIDE_TYP( ((OUTSIDE_TYP == null) ? (String)null : OUTSIDE_TYP[0]) );
		struct.setList_OUTSIDE_TYP(TypeConverter.convert(OUTSIDE_TYP));
		struct.setABC_TYP( ((ABC_TYP == null) ? (String)null : ABC_TYP[0]) );
		struct.setList_ABC_TYP(TypeConverter.convert(ABC_TYP));
		struct.setw_target( ((w_target == null) ? (String)null : w_target[0]) );
		struct.setList_w_target(TypeConverter.convert(w_target));
		struct.setr1_inv_target( ((r1_inv_target == null) ? (String)null : r1_inv_target[0]) );
		struct.setList_r1_inv_target(TypeConverter.convert(r1_inv_target));
		struct.setr2_inv_target( ((r2_inv_target == null) ? (String)null : r2_inv_target[0]) );
		struct.setList_r2_inv_target(TypeConverter.convert(r2_inv_target));
		struct.setFileName( ((FileName == null) ? (String)null : FileName[0]) );
		struct.setList_FileName(TypeConverter.convert(FileName));
		struct.seth_saveTEMP_INV_FLG( ((h_saveTEMP_INV_FLG == null) ? (String)null : h_saveTEMP_INV_FLG[0]) );
		struct.setList_h_saveTEMP_INV_FLG(TypeConverter.convert(h_saveTEMP_INV_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AH0020010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAH0020010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAH0020010Struct";   // JSP先のバインド名(Struct)の指定
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
					AH0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AH0020010Control control;
		AH0020010Entity  entity = null;
		AH0020010Struct  struct = null;

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

			if( (control = (AH0020010Control)so.getAttribute("AH0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new AH0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AH0020010Control();
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
				} else if( isClick(request, "select_wh") ) {
					if ( !isCryptical(request, so, params, "select_wh") ) return ERROR_TARGET;
					target = onClickselect_wh(request, response, so, params, control);
					control.setButton("select_wh");
				} else if( isClick(request, "select_item") ) {
					if ( !isCryptical(request, so, params, "select_item") ) return ERROR_TARGET;
					target = onClickselect_item(request, response, so, params, control);
					control.setButton("select_item");
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
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "select_sub1") ) {
					if ( !isCryptical(request, so, params, "select_sub1") ) return ERROR_TARGET;
					target = onClickselect_sub1(request, response, so, params, control);
					control.setButton("select_sub1");
				} else if( isClick(request, "update_sub1") ) {
					if ( !isCryptical(request, so, params, "update_sub1") ) return ERROR_TARGET;
					target = onClickupdate_sub1(request, response, so, params, control);
					control.setButton("update_sub1");
				} else if( isClick(request, "clear_sub1") ) {
					if ( !isCryptical(request, so, params, "clear_sub1") ) return ERROR_TARGET;
					target = onClickclear_sub1(request, response, so, params, control);
					control.setButton("clear_sub1");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "select_sub2") ) {
					if ( !isCryptical(request, so, params, "select_sub2") ) return ERROR_TARGET;
					target = onClickselect_sub2(request, response, so, params, control);
					control.setButton("select_sub2");
				} else if( isClick(request, "update_sub2") ) {
					if ( !isCryptical(request, so, params, "update_sub2") ) return ERROR_TARGET;
					target = onClickupdate_sub2(request, response, so, params, control);
					control.setButton("update_sub2");
				} else if( isClick(request, "clear_sub2") ) {
					if ( !isCryptical(request, so, params, "clear_sub2") ) return ERROR_TARGET;
					target = onClickclear_sub2(request, response, so, params, control);
					control.setButton("clear_sub2");
				} else if( isClick(request, "return_sub2") ) {
					if ( !isCryptical(request, so, params, "return_sub2") ) return ERROR_TARGET;
					target = onClickreturn_sub2(request, response, so, params, control);
					control.setButton("return_sub2");
				} else if( isClick(request, "return_sub3") ) {
					if ( !isCryptical(request, so, params, "return_sub3") ) return ERROR_TARGET;
					target = onClickreturn_sub3(request, response, so, params, control);
					control.setButton("return_sub3");
				} else if( isClick(request, "CsvImportWh") ) {
					if ( !isCryptical(request, so, params, "CsvImportWh") ) return ERROR_TARGET;
					target = onClickCsvImportWh(request, response, so, params, control);
					control.setButton("CsvImportWh");
				} else if( isClick(request, "CsvImportItem") ) {
					if ( !isCryptical(request, so, params, "CsvImportItem") ) return ERROR_TARGET;
					target = onClickCsvImportItem(request, response, so, params, control);
					control.setButton("CsvImportItem");
				} else if( isClick(request, "Browse") ) {
					if ( !isCryptical(request, so, params, "Browse") ) return ERROR_TARGET;
					target = onClickBrowse(request, response, so, params, control);
					control.setButton("Browse");
				} else if( isClick(request, "CsvIn") ) {
					if ( !isCryptical(request, so, params, "CsvIn") ) return ERROR_TARGET;
					target = onClickCsvIn(request, response, so, params, control);
					control.setButton("CsvIn");
				} else if( isClick(request, "selectall") ) {
					if ( !isCryptical(request, so, params, "selectall") ) return ERROR_TARGET;
					target = onClickselectall(request, response, so, params, control);
					control.setButton("selectall");
				} else if( isClick(request, "cancelselectall") ) {
					if ( !isCryptical(request, so, params, "cancelselectall") ) return ERROR_TARGET;
					target = onClickcancelselectall(request, response, so, params, control);
					control.setButton("cancelselectall");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AH0020010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "select_wh") && bFLG_DISCONNECT_select_wh)
				|| (isClick(request, "select_item") && bFLG_DISCONNECT_select_item)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "select_sub1") && bFLG_DISCONNECT_select_sub1)
				|| (isClick(request, "update_sub1") && bFLG_DISCONNECT_update_sub1)
				|| (isClick(request, "clear_sub1") && bFLG_DISCONNECT_clear_sub1)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "select_sub2") && bFLG_DISCONNECT_select_sub2)
				|| (isClick(request, "update_sub2") && bFLG_DISCONNECT_update_sub2)
				|| (isClick(request, "clear_sub2") && bFLG_DISCONNECT_clear_sub2)
				|| (isClick(request, "return_sub2") && bFLG_DISCONNECT_return_sub2)
				|| (isClick(request, "return_sub3") && bFLG_DISCONNECT_return_sub3)
				|| (isClick(request, "CsvImportWh") && bFLG_DISCONNECT_CsvImportWh)
				|| (isClick(request, "CsvImportItem") && bFLG_DISCONNECT_CsvImportItem)
				|| (isClick(request, "Browse") && bFLG_DISCONNECT_Browse)
				|| (isClick(request, "CsvIn") && bFLG_DISCONNECT_CsvIn)
				|| (isClick(request, "selectall") && bFLG_DISCONNECT_selectall)
				|| (isClick(request, "cancelselectall") && bFLG_DISCONNECT_cancelselectall)
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
	private  static boolean bFLG_DISCONNECT_select_wh = true;
	private  static boolean bFLG_DISCONNECT_select_item = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_select_sub1 = true;
	private  static boolean bFLG_DISCONNECT_update_sub1 = true;
	private  static boolean bFLG_DISCONNECT_clear_sub1 = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_select_sub2 = true;
	private  static boolean bFLG_DISCONNECT_update_sub2 = true;
	private  static boolean bFLG_DISCONNECT_clear_sub2 = true;
	private  static boolean bFLG_DISCONNECT_return_sub2 = true;
	private  static boolean bFLG_DISCONNECT_return_sub3 = true;
	private  static boolean bFLG_DISCONNECT_CsvImportWh = true;
	private  static boolean bFLG_DISCONNECT_CsvImportItem = true;
	private  static boolean bFLG_DISCONNECT_Browse = true;
	private  static boolean bFLG_DISCONNECT_CsvIn = true;
	private  static boolean bFLG_DISCONNECT_selectall = true;
	private  static boolean bFLG_DISCONNECT_cancelselectall = true;

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
		return "com.nec.jp.orteus.metamorBase.AH0020.AH0020010Servlet";
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
	public AH0020010Servlet()
	{
		//{{user_implement_dev:<AH0020010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_select_wh = true;
                bFLG_DISCONNECT_select_item = true;
                bFLG_DISCONNECT_insert = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_delete = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_select_sub1 = true;
                bFLG_DISCONNECT_update_sub1 = true;
                bFLG_DISCONNECT_clear_sub1 = true;
                bFLG_DISCONNECT_return_sub1 = true;
                bFLG_DISCONNECT_select_sub2 = true;
                bFLG_DISCONNECT_update_sub2 = true;
                bFLG_DISCONNECT_clear_sub2 = true;
                bFLG_DISCONNECT_return_sub2 = true;
              
                //}}user_implement_dev:<AH0020010_DisConnect_FLG>

		//{{user_implement_dev:<AH0020010Servlet>
                //}}user_implement_dev:<AH0020010Servlet>
	}

	//////////////////////////////

}
