/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/src/com/nec/jp/orteus/metamorBase/AA0080/AA0080020Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0080;

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

public class AA0080020Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
        //------------------------------------------------------------------------------
        
         /** コメントリスト */
         private List _commentList = new ArrayList(0);
       
         /** 休日リスト */
         private List _holidayList = new ArrayList(0);
       
         /** 休日 OFF */
         private final static String _s_Off = "0";
       
         /** 休日 OFF */
         private final static String _s_On = "1";
       
         /** 休日 OFF */
         private final static Integer _i_Off = new Integer(0);
       
         /** 休日 ON */
         private final static Integer _i_On = new Integer(1);
       
         /** 空文字 */
         private final static String _emptyStr = "";
       
        //------------------------------------------------------------------------------
        /** 
         * 一覧情報取得設定処理
         *
         * @param	AA0080020Control	control
         * @return	なし
        */
        private void setListData(AA0080020Control control)
        {
         // 一覧情報取得設定
         List list = control.getNowCalendarList();
         list.clear();
         if(control.struct.getList_CAL_DATE() != null)
         {
          // 一覧に表示されているデータ数分処理を繰り返す
          for(int i = 0; i < control.struct.getList_CAL_DATE().size(); i++)
          {
           // データ取得
           AA0080020Struct targetStruct = new AA0080020Struct();
                 targetStruct.importData(control.struct, i);
                 //カレンダ番号設定
                 targetStruct.setCAL_NO(control.struct.getCAL_NO());
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
	 * @param control AA0080020Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AA0080020Control control)
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
	 * @param control AA0080020Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AA0080020Control control)
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
	 * @param control AA0080020Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
			logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AA0080020"+" $Revision: 1.7 $" );
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0080020Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
              
                }catch( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("select");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * カレンダ作成ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
                //------------------------------------------------------------------
                try {
                 // 一覧情報取得設定処理(エラー時対応のため)
                 setListData(control);
              
                 control.control_eventHandller("insert");
              
                 // エラーが発生していない場合、子画面遷移
                 if(control.getMessage().sizeError() <= 0)
                  nextUrl = "/AA0080021.jsp";
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * 休日再設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickchange(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickchange");
		//{{user_implement_dev:<onClickchange>
                //------------------------------------------------------------------
                try {
                 // 一覧情報取得設定処理(エラー時対応のため)
                 setListData(control);
              
                 control.control_eventHandller("change");
              
                 // エラーが発生していない場合、子画面遷移
                 if(control.getMessage().sizeError() <= 0)
                  nextUrl = "/AA0080021.jsp";
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickchange>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickchange");

		return nextUrl;
	}

	/**
	 * 前月ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickbefore(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickbefore");
		//{{user_implement_dev:<onClickbefore>
                //------------------------------------------------------------------
                try {
                 // 一覧情報取得設定処理(エラー時対応のため)
                 setListData(control);
              
                 control.control_eventHandller("before");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickbefore>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickbefore");

		return nextUrl;
	}

	/**
	 * 翌月ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClicknext(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClicknext");
		//{{user_implement_dev:<onClicknext>
                //------------------------------------------------------------------
                try {
                 // 一覧情報取得設定処理(エラー時対応のため)
                 setListData(control);
              
                 control.control_eventHandller("next");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClicknext>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClicknext");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------
                try {
                 // 一覧情報取得設定処理
                 setListData(control);
              
                 // 更新情報変換(休日)
                 int size = control.getNowCalendarList().size();
                 _commentList.clear();
                 _holidayList.clear();
              
                 for(int i = 0; i < size; i++){
                  AA0080020Struct targetStruct = (AA0080020Struct)(((List)control.getNowCalendarList()).get(i));
              
                  // 休日チェックボックスのチェック状態をフラグ値に変換
                  String strTemp = targetStruct.getc_HOLIDAY_FLG();
                  if("true".equals(strTemp) != true)
                   targetStruct.setHOLIDAY_FLG(_i_Off);
                  else
                   targetStruct.setHOLIDAY_FLG(_i_On);
              
                  targetStruct.seth_TIME_CTRL(struct.geth_TIME_CTRL());
                 }
              
                 control.control_eventHandller("update");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("clear");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
		//{{user_implement_dev:<onClickinsertSub1>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("insertSub1");
              
                 // エラー発生の場合、子画面に遷移
                 if(control.getMessage().sizeError() > 0)
                 {
                  nextUrl = "/AA0080021.jsp";
                 }
                 else
                 {
                  // 親画面読込処理
                  control.readParentData();
                 }
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickupdateSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");
		//{{user_implement_dev:<onClickupdateSub1>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("updateSub1");
              
                 // エラー発生の場合、子画面に遷移
                 if(control.getMessage().sizeError() > 0)
                 {
                  nextUrl = "/AA0080021.jsp";
                 }
                 else
                 {
                  // 親画面読込処理
                  control.readParentData();
                 }
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdateSub1>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AA0080020Controlクラスインスタンス
	 */
	public String onClickcloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");
		//{{user_implement_dev:<onClickcloseSub1>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("closeSub1");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickcloseSub1>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0080020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] CAL_NO = ((params.containsKey("CAL_NO")) ? (String[])params.get("CAL_NO") : (String[])null);
		String[] CAL_NAME = ((params.containsKey("CAL_NAME")) ? (String[])params.get("CAL_NAME") : (String[])null);
		String[] DATE_FROM = ((params.containsKey("DATE_FROM")) ? (String[])params.get("DATE_FROM") : (String[])null);
		String[] CAL_DATE = ((params.containsKey("CAL_DATE")) ? (String[])params.get("CAL_DATE") : (String[])null);
		String[] CAL_DATE_WEEK = ((params.containsKey("CAL_DATE_WEEK")) ? (String[])params.get("CAL_DATE_WEEK") : (String[])null);
		String[] h_HOLIDAY_SUN = ((params.containsKey("h_HOLIDAY_SUN")) ? (String[])params.get("h_HOLIDAY_SUN") : (String[])null);
		String[] h_HOLIDAY_MON = ((params.containsKey("h_HOLIDAY_MON")) ? (String[])params.get("h_HOLIDAY_MON") : (String[])null);
		String[] h_HOLIDAY_TUE = ((params.containsKey("h_HOLIDAY_TUE")) ? (String[])params.get("h_HOLIDAY_TUE") : (String[])null);
		String[] h_HOLIDAY_WED = ((params.containsKey("h_HOLIDAY_WED")) ? (String[])params.get("h_HOLIDAY_WED") : (String[])null);
		String[] h_HOLIDAY_THU = ((params.containsKey("h_HOLIDAY_THU")) ? (String[])params.get("h_HOLIDAY_THU") : (String[])null);
		String[] h_HOLIDAY_FRI = ((params.containsKey("h_HOLIDAY_FRI")) ? (String[])params.get("h_HOLIDAY_FRI") : (String[])null);
		String[] h_HOLIDAY_SAT = ((params.containsKey("h_HOLIDAY_SAT")) ? (String[])params.get("h_HOLIDAY_SAT") : (String[])null);
		String[] DATE_TO = ((params.containsKey("DATE_TO")) ? (String[])params.get("DATE_TO") : (String[])null);
		String[] w_DATE_FROM = ((params.containsKey("w_DATE_FROM")) ? (String[])params.get("w_DATE_FROM") : (String[])null);
		String[] w_DATE_TO = ((params.containsKey("w_DATE_TO")) ? (String[])params.get("w_DATE_TO") : (String[])null);
		String[] HEAD_DATE = ((params.containsKey("HEAD_DATE")) ? (String[])params.get("HEAD_DATE") : (String[])null);
		String[] CAL_COMMENT = ((params.containsKey("CAL_COMMENT")) ? (String[])params.get("CAL_COMMENT") : (String[])null);
		String[] c_HOLIDAY_FLG = ((params.containsKey("c_HOLIDAY_FLG")) ? (String[])params.get("c_HOLIDAY_FLG") : (String[])null);
		String[] c_HOLIDAY_SUN = ((params.containsKey("c_HOLIDAY_SUN")) ? (String[])params.get("c_HOLIDAY_SUN") : (String[])null);
		String[] c_HOLIDAY_MON = ((params.containsKey("c_HOLIDAY_MON")) ? (String[])params.get("c_HOLIDAY_MON") : (String[])null);
		String[] c_HOLIDAY_TUE = ((params.containsKey("c_HOLIDAY_TUE")) ? (String[])params.get("c_HOLIDAY_TUE") : (String[])null);
		String[] c_HOLIDAY_WED = ((params.containsKey("c_HOLIDAY_WED")) ? (String[])params.get("c_HOLIDAY_WED") : (String[])null);
		String[] c_HOLIDAY_THU = ((params.containsKey("c_HOLIDAY_THU")) ? (String[])params.get("c_HOLIDAY_THU") : (String[])null);
		String[] c_HOLIDAY_FRI = ((params.containsKey("c_HOLIDAY_FRI")) ? (String[])params.get("c_HOLIDAY_FRI") : (String[])null);
		String[] c_HOLIDAY_SAT = ((params.containsKey("c_HOLIDAY_SAT")) ? (String[])params.get("c_HOLIDAY_SAT") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] HOLIDAY_FLG = ((params.containsKey("HOLIDAY_FLG")) ? (String[])params.get("HOLIDAY_FLG") : (String[])null);
		String[] ASP_SHIFT_CD = ((params.containsKey("ASP_SHIFT_CD")) ? (String[])params.get("ASP_SHIFT_CD") : (String[])null);
		String[] t_HOLIDAY_SUN = ((params.containsKey("t_HOLIDAY_SUN")) ? (String[])params.get("t_HOLIDAY_SUN") : (String[])null);
		String[] t_HOLIDAY_MON = ((params.containsKey("t_HOLIDAY_MON")) ? (String[])params.get("t_HOLIDAY_MON") : (String[])null);
		String[] t_HOLIDAY_TUE = ((params.containsKey("t_HOLIDAY_TUE")) ? (String[])params.get("t_HOLIDAY_TUE") : (String[])null);
		String[] t_HOLIDAY_WED = ((params.containsKey("t_HOLIDAY_WED")) ? (String[])params.get("t_HOLIDAY_WED") : (String[])null);
		String[] t_HOLIDAY_THU = ((params.containsKey("t_HOLIDAY_THU")) ? (String[])params.get("t_HOLIDAY_THU") : (String[])null);
		String[] t_HOLIDAY_FRI = ((params.containsKey("t_HOLIDAY_FRI")) ? (String[])params.get("t_HOLIDAY_FRI") : (String[])null);
		String[] t_HOLIDAY_SAT = ((params.containsKey("t_HOLIDAY_SAT")) ? (String[])params.get("t_HOLIDAY_SAT") : (String[])null);
		String[] h_TIME_CTRL = ((params.containsKey("h_TIME_CTRL")) ? (String[])params.get("h_TIME_CTRL") : (String[])null);

		struct.setCAL_NO( ((CAL_NO == null) ? (String)null : CAL_NO[0]) );
		struct.setList_CAL_NO(TypeConverter.convert(CAL_NO));
		struct.setCAL_NAME( ((CAL_NAME == null) ? (String)null : CAL_NAME[0]) );
		struct.setList_CAL_NAME(TypeConverter.convert(CAL_NAME));
		struct.setDATE_FROM( ((DATE_FROM == null) ? (String)null : DATE_FROM[0]) );
		struct.setList_DATE_FROM(TypeConverter.convert(DATE_FROM));
		struct.setCAL_DATE( ((CAL_DATE == null) ? (String)null : CAL_DATE[0]) );
		struct.setList_CAL_DATE(TypeConverter.convert(CAL_DATE));
		struct.setCAL_DATE_WEEK( ((CAL_DATE_WEEK == null) ? (String)null : CAL_DATE_WEEK[0]) );
		struct.setList_CAL_DATE_WEEK(TypeConverter.convert(CAL_DATE_WEEK));
		if( (h_HOLIDAY_SUN == null)||("".equals(h_HOLIDAY_SUN[0])) ) {
		   struct.seth_HOLIDAY_SUN( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_SUN( new Integer(h_HOLIDAY_SUN[0]) );
		   struct.setList_h_HOLIDAY_SUN(TypeConverter.convert(h_HOLIDAY_SUN));
		}
		if( (h_HOLIDAY_MON == null)||("".equals(h_HOLIDAY_MON[0])) ) {
		   struct.seth_HOLIDAY_MON( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_MON( new Integer(h_HOLIDAY_MON[0]) );
		   struct.setList_h_HOLIDAY_MON(TypeConverter.convert(h_HOLIDAY_MON));
		}
		if( (h_HOLIDAY_TUE == null)||("".equals(h_HOLIDAY_TUE[0])) ) {
		   struct.seth_HOLIDAY_TUE( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_TUE( new Integer(h_HOLIDAY_TUE[0]) );
		   struct.setList_h_HOLIDAY_TUE(TypeConverter.convert(h_HOLIDAY_TUE));
		}
		if( (h_HOLIDAY_WED == null)||("".equals(h_HOLIDAY_WED[0])) ) {
		   struct.seth_HOLIDAY_WED( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_WED( new Integer(h_HOLIDAY_WED[0]) );
		   struct.setList_h_HOLIDAY_WED(TypeConverter.convert(h_HOLIDAY_WED));
		}
		if( (h_HOLIDAY_THU == null)||("".equals(h_HOLIDAY_THU[0])) ) {
		   struct.seth_HOLIDAY_THU( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_THU( new Integer(h_HOLIDAY_THU[0]) );
		   struct.setList_h_HOLIDAY_THU(TypeConverter.convert(h_HOLIDAY_THU));
		}
		if( (h_HOLIDAY_FRI == null)||("".equals(h_HOLIDAY_FRI[0])) ) {
		   struct.seth_HOLIDAY_FRI( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_FRI( new Integer(h_HOLIDAY_FRI[0]) );
		   struct.setList_h_HOLIDAY_FRI(TypeConverter.convert(h_HOLIDAY_FRI));
		}
		if( (h_HOLIDAY_SAT == null)||("".equals(h_HOLIDAY_SAT[0])) ) {
		   struct.seth_HOLIDAY_SAT( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_SAT( new Integer(h_HOLIDAY_SAT[0]) );
		   struct.setList_h_HOLIDAY_SAT(TypeConverter.convert(h_HOLIDAY_SAT));
		}
		struct.setDATE_TO( ((DATE_TO == null) ? (String)null : DATE_TO[0]) );
		struct.setList_DATE_TO(TypeConverter.convert(DATE_TO));
		struct.setw_DATE_FROM( ((w_DATE_FROM == null) ? (String)null : w_DATE_FROM[0]) );
		struct.setList_w_DATE_FROM(TypeConverter.convert(w_DATE_FROM));
		struct.setw_DATE_TO( ((w_DATE_TO == null) ? (String)null : w_DATE_TO[0]) );
		struct.setList_w_DATE_TO(TypeConverter.convert(w_DATE_TO));
		struct.setHEAD_DATE( ((HEAD_DATE == null) ? (String)null : HEAD_DATE[0]) );
		struct.setList_HEAD_DATE(TypeConverter.convert(HEAD_DATE));
		struct.setCAL_COMMENT( ((CAL_COMMENT == null) ? (String)null : CAL_COMMENT[0]) );
		struct.setList_CAL_COMMENT(TypeConverter.convert(CAL_COMMENT));
		struct.setc_HOLIDAY_FLG( ((c_HOLIDAY_FLG == null) ? (String)null : c_HOLIDAY_FLG[0]) );
		struct.setList_c_HOLIDAY_FLG(TypeConverter.convert(c_HOLIDAY_FLG));
		struct.setc_HOLIDAY_SUN( ((c_HOLIDAY_SUN == null) ? (String)null : c_HOLIDAY_SUN[0]) );
		struct.setList_c_HOLIDAY_SUN(TypeConverter.convert(c_HOLIDAY_SUN));
		struct.setc_HOLIDAY_MON( ((c_HOLIDAY_MON == null) ? (String)null : c_HOLIDAY_MON[0]) );
		struct.setList_c_HOLIDAY_MON(TypeConverter.convert(c_HOLIDAY_MON));
		struct.setc_HOLIDAY_TUE( ((c_HOLIDAY_TUE == null) ? (String)null : c_HOLIDAY_TUE[0]) );
		struct.setList_c_HOLIDAY_TUE(TypeConverter.convert(c_HOLIDAY_TUE));
		struct.setc_HOLIDAY_WED( ((c_HOLIDAY_WED == null) ? (String)null : c_HOLIDAY_WED[0]) );
		struct.setList_c_HOLIDAY_WED(TypeConverter.convert(c_HOLIDAY_WED));
		struct.setc_HOLIDAY_THU( ((c_HOLIDAY_THU == null) ? (String)null : c_HOLIDAY_THU[0]) );
		struct.setList_c_HOLIDAY_THU(TypeConverter.convert(c_HOLIDAY_THU));
		struct.setc_HOLIDAY_FRI( ((c_HOLIDAY_FRI == null) ? (String)null : c_HOLIDAY_FRI[0]) );
		struct.setList_c_HOLIDAY_FRI(TypeConverter.convert(c_HOLIDAY_FRI));
		struct.setc_HOLIDAY_SAT( ((c_HOLIDAY_SAT == null) ? (String)null : c_HOLIDAY_SAT[0]) );
		struct.setList_c_HOLIDAY_SAT(TypeConverter.convert(c_HOLIDAY_SAT));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		if( (HOLIDAY_FLG == null)||("".equals(HOLIDAY_FLG[0])) ) {
		   struct.setHOLIDAY_FLG( (Integer)null );
		} else {
		   struct.setHOLIDAY_FLG( new Integer(HOLIDAY_FLG[0]) );
		   struct.setList_HOLIDAY_FLG(TypeConverter.convert(HOLIDAY_FLG));
		}
		struct.setASP_SHIFT_CD( ((ASP_SHIFT_CD == null) ? (String)null : ASP_SHIFT_CD[0]) );
		struct.setList_ASP_SHIFT_CD(TypeConverter.convert(ASP_SHIFT_CD));
		struct.sett_HOLIDAY_SUN( ((t_HOLIDAY_SUN == null) ? (String)null : t_HOLIDAY_SUN[0]) );
		struct.setList_t_HOLIDAY_SUN(TypeConverter.convert(t_HOLIDAY_SUN));
		struct.sett_HOLIDAY_MON( ((t_HOLIDAY_MON == null) ? (String)null : t_HOLIDAY_MON[0]) );
		struct.setList_t_HOLIDAY_MON(TypeConverter.convert(t_HOLIDAY_MON));
		struct.sett_HOLIDAY_TUE( ((t_HOLIDAY_TUE == null) ? (String)null : t_HOLIDAY_TUE[0]) );
		struct.setList_t_HOLIDAY_TUE(TypeConverter.convert(t_HOLIDAY_TUE));
		struct.sett_HOLIDAY_WED( ((t_HOLIDAY_WED == null) ? (String)null : t_HOLIDAY_WED[0]) );
		struct.setList_t_HOLIDAY_WED(TypeConverter.convert(t_HOLIDAY_WED));
		struct.sett_HOLIDAY_THU( ((t_HOLIDAY_THU == null) ? (String)null : t_HOLIDAY_THU[0]) );
		struct.setList_t_HOLIDAY_THU(TypeConverter.convert(t_HOLIDAY_THU));
		struct.sett_HOLIDAY_FRI( ((t_HOLIDAY_FRI == null) ? (String)null : t_HOLIDAY_FRI[0]) );
		struct.setList_t_HOLIDAY_FRI(TypeConverter.convert(t_HOLIDAY_FRI));
		struct.sett_HOLIDAY_SAT( ((t_HOLIDAY_SAT == null) ? (String)null : t_HOLIDAY_SAT[0]) );
		struct.setList_t_HOLIDAY_SAT(TypeConverter.convert(t_HOLIDAY_SAT));
		struct.seth_TIME_CTRL( ((h_TIME_CTRL == null) ? (String)null : h_TIME_CTRL[0]) );
		struct.setList_h_TIME_CTRL(TypeConverter.convert(h_TIME_CTRL));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0080020.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAA0080020Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAA0080020Struct";   // JSP先のバインド名(Struct)の指定
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
					AA0080020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0080020Control control;
		AA0080020Entity  entity = null;
		AA0080020Struct  struct = null;

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

			if( (control = (AA0080020Control)so.getAttribute("AA0080020Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0080020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0080020Control();
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
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "change") ) {
					if ( !isCryptical(request, so, params, "change") ) return ERROR_TARGET;
					target = onClickchange(request, response, so, params, control);
					control.setButton("change");
				} else if( isClick(request, "before") ) {
					if ( !isCryptical(request, so, params, "before") ) return ERROR_TARGET;
					target = onClickbefore(request, response, so, params, control);
					control.setButton("before");
				} else if( isClick(request, "next") ) {
					if ( !isCryptical(request, so, params, "next") ) return ERROR_TARGET;
					target = onClicknext(request, response, so, params, control);
					control.setButton("next");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "insertSub1") ) {
					if ( !isCryptical(request, so, params, "insertSub1") ) return ERROR_TARGET;
					target = onClickinsertSub1(request, response, so, params, control);
					control.setButton("insertSub1");
				} else if( isClick(request, "updateSub1") ) {
					if ( !isCryptical(request, so, params, "updateSub1") ) return ERROR_TARGET;
					target = onClickupdateSub1(request, response, so, params, control);
					control.setButton("updateSub1");
				} else if( isClick(request, "closeSub1") ) {
					if ( !isCryptical(request, so, params, "closeSub1") ) return ERROR_TARGET;
					target = onClickcloseSub1(request, response, so, params, control);
					control.setButton("closeSub1");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0080020Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
                                 
                                //------------------------------------------------------------------
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
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "change") && bFLG_DISCONNECT_change)
				|| (isClick(request, "before") && bFLG_DISCONNECT_before)
				|| (isClick(request, "next") && bFLG_DISCONNECT_next)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "insertSub1") && bFLG_DISCONNECT_insertSub1)
				|| (isClick(request, "updateSub1") && bFLG_DISCONNECT_updateSub1)
				|| (isClick(request, "closeSub1") && bFLG_DISCONNECT_closeSub1)
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
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_change = true;
	private  static boolean bFLG_DISCONNECT_before = true;
	private  static boolean bFLG_DISCONNECT_next = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_insertSub1 = true;
	private  static boolean bFLG_DISCONNECT_updateSub1 = true;
	private  static boolean bFLG_DISCONNECT_closeSub1 = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0080.AA0080020Servlet";
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
	public AA0080020Servlet()
	{
		//{{user_implement_dev:<AA0080020_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_insert = true;
                bFLG_DISCONNECT_change = true;
                bFLG_DISCONNECT_before = true;
                bFLG_DISCONNECT_next = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_insertSub1 = true;
                bFLG_DISCONNECT_updateSub1 = true;
                bFLG_DISCONNECT_closeSub1 = true;
              
                //}}user_implement_dev:<AA0080020_DisConnect_FLG>

		//{{user_implement_dev:<AA0080020Servlet>
                 
                //}}user_implement_dev:<AA0080020Servlet>
	}

	//////////////////////////////

}
