/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0030/src/com/nec/jp/orteus/metamorBase/AZ0030/AZ0030010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0030;

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
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AZ0030010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
       //------------------------------------------------------------------------------
       
        /** 
         * 親画面の一覧「確認」欄のチェックボックスのチェック状態を取得し、controlのメンバへ設定する
         * @param HttpServletRequest request
         * @param Hashtable params
         * @param AZ0030010Struct control
        */
        private void setCheckboxStatus(
            HttpServletRequest request,
            Hashtable params,
            AZ0030010Control control)
        {
         for(int i = 0; i < control.getListsize(); i++)
         {
          AZ0030010Struct temp_struct = (AZ0030010Struct)control.getListvalue(control.convListDataIndex(i));
          String[] val = ((params.containsKey("h_confirm_flg" + i)) ? (String[])params.get("h_confirm_flg" + i) : (String[])null);
          if(val != null && "1".equals(val[0]))
          {
           temp_struct.setw_confirm_flg(new Integer(1));
          }
          else
          {
           temp_struct.setw_confirm_flg(new Integer(0));
          }
         }
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
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AZ0030010Control control)
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
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AZ0030010Control control)
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
	 * @param control AZ0030010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
			logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AZ0030010"+" $Revision: 1.9 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AZ0030010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
              
                try {
              
                 // リロード処理
                 setScreenMoveParams(params, control);
                 control.control_eventHandller("reload");
                 if(control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                  control.control_eventHandller("select");
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------------------
              
                try {
              
                 // 画面上の設定値を取得
                 String[] val = null;
              
                 // 「対象」radioの選択状況を取得設定
                 val = ((params.containsKey("h_plant_flg")) ? (String[])params.get("h_plant_flg") : (String[])null);
                 if(val != null && "1".equals(val[0]))
                 {
                  struct.seth_plant_flg(new Integer(1));
                 }
                 else
                 {
                  struct.seth_plant_flg(new Integer(0));
                 }
              
                 // 「自ユーザ表示」checkboxのチェック状況を取得設定
                 val = ((params.containsKey("h_own_flg")) ? (String[])params.get("h_own_flg") : (String[])null);
                 if(val != null && "1".equals(val[0]))
                 {
                  struct.seth_own_flg(new Integer(1));
                 }
                 else
                 {
                  struct.seth_own_flg(new Integer(0));
                 }
              
                 // 「表示順」radioの選択状況を取得設定
                 val = ((params.containsKey("h_sort_flg")) ? (String[])params.get("h_sort_flg") : (String[])null);
                 if(val != null && "1".equals(val[0]))
                 {
                  struct.seth_sort_flg("1");
                 }
                 else
                 {
                  struct.seth_sort_flg("0");
                 }
              
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickdetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickdetail");
		//{{user_implement_dev:<onClickdetail>
                //------------------------------------------------------------------------------
              
                try {
              
                 // 詳細表示処理
                 control.control_eventHandller("detail");
              
                 // エラーなしの場合、子画面に遷移
                 if(control.getMessage().sizeError() <= 0)
                 {
                  nextUrl = "/AZ0030011.jsp";
                 }
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickdetail>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickdetail");

		return nextUrl;
	}

	/**
	 * 確認ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickconfirm(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm");
		//{{user_implement_dev:<onClickconfirm>
                //------------------------------------------------------------------------------
              
                try {
              
                 // 確認処理
                 control.control_eventHandller("confirm");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickconfirm>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm");

		return nextUrl;
	}

	/**
	 * 前へボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickprev_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickprev_sub1");
		//{{user_implement_dev:<onClickprev_sub1>
                //------------------------------------------------------------------------------
              
                try {
              
                 // 前データ設定処理
                 control.control_eventHandller("prev_sub1");
              
                 // 親画面に戻らないようにする処理
                 nextUrl = "/AZ0030011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickprev_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickprev_sub1");

		return nextUrl;
	}

	/**
	 * 次へボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClicknext_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClicknext_sub1");
		//{{user_implement_dev:<onClicknext_sub1>
                //------------------------------------------------------------------------------
              
                try {
              
                 // 次データ設定処理
                 control.control_eventHandller("next_sub1");
              
                 // 親画面に戻らないようにする処理
                 nextUrl = "/AZ0030011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClicknext_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClicknext_sub1");

		return nextUrl;
	}

	/**
	 * 確認ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickconfirm_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm_sub1");
		//{{user_implement_dev:<onClickconfirm_sub1>
                //---------------------------------------------------------------------
              
                try{
              
                 // 対象データ確認処理
                 control.control_eventHandller("confirm_sub1");
              
                 // 親画面に戻らないようにする処理
                 nextUrl = "/AZ0030011.jsp";
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickconfirm_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm_sub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
              
                try {
              
                 // 戻る処理
                 control.control_eventHandller("return_sub1");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");

		return nextUrl;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0030010Controlクラスインスタンス
	 */
	public String onClickcancelselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AZ0030010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] LOG_CD = ((params.containsKey("LOG_CD")) ? (String[])params.get("LOG_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] FROM_DATE = ((params.containsKey("FROM_DATE")) ? (String[])params.get("FROM_DATE") : (String[])null);
		String[] h_FROM_TIME = ((params.containsKey("h_FROM_TIME")) ? (String[])params.get("h_FROM_TIME") : (String[])null);
		String[] s_FROM_TIME = ((params.containsKey("s_FROM_TIME")) ? (String[])params.get("s_FROM_TIME") : (String[])null);
		String[] s_FROM_TIME_name = ((params.containsKey("s_FROM_TIME_name")) ? (String[])params.get("s_FROM_TIME_name") : (String[])null);
		String[] s_FROM_TIME_val = ((params.containsKey("s_FROM_TIME_val")) ? (String[])params.get("s_FROM_TIME_val") : (String[])null);
		String[] TO_DATE = ((params.containsKey("TO_DATE")) ? (String[])params.get("TO_DATE") : (String[])null);
		String[] s_TO_TIME = ((params.containsKey("s_TO_TIME")) ? (String[])params.get("s_TO_TIME") : (String[])null);
		String[] s_TO_TIME_name = ((params.containsKey("s_TO_TIME_name")) ? (String[])params.get("s_TO_TIME_name") : (String[])null);
		String[] s_TO_TIME_val = ((params.containsKey("s_TO_TIME_val")) ? (String[])params.get("s_TO_TIME_val") : (String[])null);
		String[] h_TO_TIME = ((params.containsKey("h_TO_TIME")) ? (String[])params.get("h_TO_TIME") : (String[])null);
		String[] h_plant_flg = ((params.containsKey("h_plant_flg")) ? (String[])params.get("h_plant_flg") : (String[])null);
		String[] h_own_flg = ((params.containsKey("h_own_flg")) ? (String[])params.get("h_own_flg") : (String[])null);
		String[] h_sort_flg = ((params.containsKey("h_sort_flg")) ? (String[])params.get("h_sort_flg") : (String[])null);
		String[] h_detail_flg = ((params.containsKey("h_detail_flg")) ? (String[])params.get("h_detail_flg") : (String[])null);
		String[] CREATED_DATE = ((params.containsKey("CREATED_DATE")) ? (String[])params.get("CREATED_DATE") : (String[])null);
		String[] MSG = ((params.containsKey("MSG")) ? (String[])params.get("MSG") : (String[])null);
		String[] DATA_STRING = ((params.containsKey("DATA_STRING")) ? (String[])params.get("DATA_STRING") : (String[])null);
		String[] CONFIRM_DATE = ((params.containsKey("CONFIRM_DATE")) ? (String[])params.get("CONFIRM_DATE") : (String[])null);
		String[] w_BUSINESS_NAME = ((params.containsKey("w_BUSINESS_NAME")) ? (String[])params.get("w_BUSINESS_NAME") : (String[])null);
		String[] w_DATA_STRING = ((params.containsKey("w_DATA_STRING")) ? (String[])params.get("w_DATA_STRING") : (String[])null);
		String[] r_PLANT_ALL = ((params.containsKey("r_PLANT_ALL")) ? (String[])params.get("r_PLANT_ALL") : (String[])null);
		String[] r_PLANT = ((params.containsKey("r_PLANT")) ? (String[])params.get("r_PLANT") : (String[])null);
		String[] c_OWN = ((params.containsKey("c_OWN")) ? (String[])params.get("c_OWN") : (String[])null);
		String[] r_SORT_NEW = ((params.containsKey("r_SORT_NEW")) ? (String[])params.get("r_SORT_NEW") : (String[])null);
		String[] r_SORT_OLD = ((params.containsKey("r_SORT_OLD")) ? (String[])params.get("r_SORT_OLD") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] USER_CD = ((params.containsKey("USER_CD")) ? (String[])params.get("USER_CD") : (String[])null);
		String[] h_PLAN_TYP = ((params.containsKey("h_PLAN_TYP")) ? (String[])params.get("h_PLAN_TYP") : (String[])null);
		String[] BUSINESS_NAME = ((params.containsKey("BUSINESS_NAME")) ? (String[])params.get("BUSINESS_NAME") : (String[])null);

		struct.setLOG_CD( ((LOG_CD == null) ? (String)null : LOG_CD[0]) );
		struct.setList_LOG_CD(TypeConverter.convert(LOG_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setFROM_DATE( ((FROM_DATE == null) ? (String)null : FROM_DATE[0]) );
		struct.setList_FROM_DATE(TypeConverter.convert(FROM_DATE));
		struct.seth_FROM_TIME( ((h_FROM_TIME == null) ? (String)null : h_FROM_TIME[0]) );
		struct.setList_h_FROM_TIME(TypeConverter.convert(h_FROM_TIME));
		struct.sets_FROM_TIME( ((s_FROM_TIME == null) ? (String)null : s_FROM_TIME[0]) );
		struct.setList_s_FROM_TIME(TypeConverter.convert(s_FROM_TIME));
		struct.sets_FROM_TIME_name( ((s_FROM_TIME_name == null) ? (String)null : s_FROM_TIME_name[0]) );
		struct.setList_s_FROM_TIME_name(TypeConverter.convert(s_FROM_TIME_name));
		struct.sets_FROM_TIME_val( ((s_FROM_TIME_val == null) ? (String)null : s_FROM_TIME_val[0]) );
		struct.setList_s_FROM_TIME_val(TypeConverter.convert(s_FROM_TIME_val));
		struct.setTO_DATE( ((TO_DATE == null) ? (String)null : TO_DATE[0]) );
		struct.setList_TO_DATE(TypeConverter.convert(TO_DATE));
		struct.sets_TO_TIME( ((s_TO_TIME == null) ? (String)null : s_TO_TIME[0]) );
		struct.setList_s_TO_TIME(TypeConverter.convert(s_TO_TIME));
		struct.sets_TO_TIME_name( ((s_TO_TIME_name == null) ? (String)null : s_TO_TIME_name[0]) );
		struct.setList_s_TO_TIME_name(TypeConverter.convert(s_TO_TIME_name));
		struct.sets_TO_TIME_val( ((s_TO_TIME_val == null) ? (String)null : s_TO_TIME_val[0]) );
		struct.setList_s_TO_TIME_val(TypeConverter.convert(s_TO_TIME_val));
		struct.seth_TO_TIME( ((h_TO_TIME == null) ? (String)null : h_TO_TIME[0]) );
		struct.setList_h_TO_TIME(TypeConverter.convert(h_TO_TIME));
		if( (h_plant_flg == null)||("".equals(h_plant_flg[0])) ) {
		   struct.seth_plant_flg( (Integer)null );
		} else {
		   struct.seth_plant_flg( new Integer(h_plant_flg[0]) );
		   struct.setList_h_plant_flg(TypeConverter.convert(h_plant_flg));
		}
		if( (h_own_flg == null)||("".equals(h_own_flg[0])) ) {
		   struct.seth_own_flg( (Integer)null );
		} else {
		   struct.seth_own_flg( new Integer(h_own_flg[0]) );
		   struct.setList_h_own_flg(TypeConverter.convert(h_own_flg));
		}
		if( (h_sort_flg == null)||("".equals(h_sort_flg[0])) ) {
		   struct.seth_sort_flg( (Integer)null );
		} else {
		   struct.seth_sort_flg( new Integer(h_sort_flg[0]) );
		   struct.setList_h_sort_flg(TypeConverter.convert(h_sort_flg));
		}
		if( (h_detail_flg == null)||("".equals(h_detail_flg[0])) ) {
		   struct.seth_detail_flg( (Integer)null );
		} else {
		   struct.seth_detail_flg( new Integer(h_detail_flg[0]) );
		   struct.setList_h_detail_flg(TypeConverter.convert(h_detail_flg));
		}
		struct.setCREATED_DATE( ((CREATED_DATE == null) ? (String)null : CREATED_DATE[0]) );
		struct.setList_CREATED_DATE(TypeConverter.convert(CREATED_DATE));
		struct.setMSG( ((MSG == null) ? (String)null : MSG[0]) );
		struct.setList_MSG(TypeConverter.convert(MSG));
		struct.setDATA_STRING( ((DATA_STRING == null) ? (String)null : DATA_STRING[0]) );
		struct.setList_DATA_STRING(TypeConverter.convert(DATA_STRING));
		struct.setCONFIRM_DATE( ((CONFIRM_DATE == null) ? (String)null : CONFIRM_DATE[0]) );
		struct.setList_CONFIRM_DATE(TypeConverter.convert(CONFIRM_DATE));
		struct.setw_BUSINESS_NAME( ((w_BUSINESS_NAME == null) ? (String)null : w_BUSINESS_NAME[0]) );
		struct.setList_w_BUSINESS_NAME(TypeConverter.convert(w_BUSINESS_NAME));
		struct.setw_DATA_STRING( ((w_DATA_STRING == null) ? (String)null : w_DATA_STRING[0]) );
		struct.setList_w_DATA_STRING(TypeConverter.convert(w_DATA_STRING));
		struct.setr_PLANT_ALL( ((r_PLANT_ALL == null) ? (String)null : r_PLANT_ALL[0]) );
		struct.setList_r_PLANT_ALL(TypeConverter.convert(r_PLANT_ALL));
		struct.setr_PLANT( ((r_PLANT == null) ? (String)null : r_PLANT[0]) );
		struct.setList_r_PLANT(TypeConverter.convert(r_PLANT));
		struct.setc_OWN( ((c_OWN == null) ? (String)null : c_OWN[0]) );
		struct.setList_c_OWN(TypeConverter.convert(c_OWN));
		struct.setr_SORT_NEW( ((r_SORT_NEW == null) ? (String)null : r_SORT_NEW[0]) );
		struct.setList_r_SORT_NEW(TypeConverter.convert(r_SORT_NEW));
		struct.setr_SORT_OLD( ((r_SORT_OLD == null) ? (String)null : r_SORT_OLD[0]) );
		struct.setList_r_SORT_OLD(TypeConverter.convert(r_SORT_OLD));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setUSER_CD( ((USER_CD == null) ? (String)null : USER_CD[0]) );
		struct.setList_USER_CD(TypeConverter.convert(USER_CD));
		struct.seth_PLAN_TYP( ((h_PLAN_TYP == null) ? (String)null : h_PLAN_TYP[0]) );
		struct.setList_h_PLAN_TYP(TypeConverter.convert(h_PLAN_TYP));
		struct.setBUSINESS_NAME( ((BUSINESS_NAME == null) ? (String)null : BUSINESS_NAME[0]) );
		struct.setList_BUSINESS_NAME(TypeConverter.convert(BUSINESS_NAME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AZ0030010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAZ0030010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAZ0030010Struct";   // JSP先のバインド名(Struct)の指定
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
					AZ0030010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AZ0030010Control control;
		AZ0030010Entity  entity = null;
		AZ0030010Struct  struct = null;

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

			if( (control = (AZ0030010Control)so.getAttribute("AZ0030010Control_"+request.getSession(false).getId())) == null ) {
				control = new AZ0030010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AZ0030010Control();
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
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "detail") ) {
					if ( !isCryptical(request, so, params, "detail") ) return ERROR_TARGET;
					target = onClickdetail(request, response, so, params, control);
					control.setButton("detail");
				} else if( isClick(request, "confirm") ) {
					if ( !isCryptical(request, so, params, "confirm") ) return ERROR_TARGET;
					target = onClickconfirm(request, response, so, params, control);
					control.setButton("confirm");
				} else if( isClick(request, "prev_sub1") ) {
					if ( !isCryptical(request, so, params, "prev_sub1") ) return ERROR_TARGET;
					target = onClickprev_sub1(request, response, so, params, control);
					control.setButton("prev_sub1");
				} else if( isClick(request, "next_sub1") ) {
					if ( !isCryptical(request, so, params, "next_sub1") ) return ERROR_TARGET;
					target = onClicknext_sub1(request, response, so, params, control);
					control.setButton("next_sub1");
				} else if( isClick(request, "confirm_sub1") ) {
					if ( !isCryptical(request, so, params, "confirm_sub1") ) return ERROR_TARGET;
					target = onClickconfirm_sub1(request, response, so, params, control);
					control.setButton("confirm_sub1");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
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

				so.setAttribute("AZ0030010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "detail") && bFLG_DISCONNECT_detail)
				|| (isClick(request, "confirm") && bFLG_DISCONNECT_confirm)
				|| (isClick(request, "prev_sub1") && bFLG_DISCONNECT_prev_sub1)
				|| (isClick(request, "next_sub1") && bFLG_DISCONNECT_next_sub1)
				|| (isClick(request, "confirm_sub1") && bFLG_DISCONNECT_confirm_sub1)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
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
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_detail = true;
	private  static boolean bFLG_DISCONNECT_confirm = true;
	private  static boolean bFLG_DISCONNECT_prev_sub1 = true;
	private  static boolean bFLG_DISCONNECT_next_sub1 = true;
	private  static boolean bFLG_DISCONNECT_confirm_sub1 = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
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
		return "com.nec.jp.orteus.metamorBase.AZ0030.AZ0030010Servlet";
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
	public AZ0030010Servlet()
	{
		//{{user_implement_dev:<AZ0030010_DisConnect_FLG>
                // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
              
                //}}user_implement_dev:<AZ0030010_DisConnect_FLG>

		//{{user_implement_dev:<AZ0030010Servlet>
                 
                //}}user_implement_dev:<AZ0030010Servlet>
	}

	//////////////////////////////

}
