/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0050/src/com/nec/jp/orteus/metamorBase/AG0050/AG0050010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0050;

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

public class AG0050010Servlet extends HttpServlet
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
	 * @param control AG0050010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AG0050010Control control)
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
        if(params.containsKey("w_PLANT_CD")){
        	String [] PLANT_CD = (String[]) params.get("w_PLANT_CD");
    		control.setPlantCd((PLANT_CD==null)?null:PLANT_CD[0]);
    		String [] ITEM_CD =(String[]) params.get("w_ITEM_CD");
    		control.setItemCd((ITEM_CD==null)?null:ITEM_CD[0]);
        }
        else if(params.containsKey("PLANT_CD")){
        	String [] PLANT_CD = (String[]) params.get("PLANT_CD");
    		control.setPlantCd((PLANT_CD==null)?null:PLANT_CD[0]);
    		String [] ITEM_CD =(String[]) params.get("ITEM_CD");
    		control.setItemCd((ITEM_CD==null)?null:ITEM_CD[0]);
        }
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AG0050010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AG0050010Control control)
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
	 * @param control AG0050010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
			logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AG0050010"+" $Revision: 1.14 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AG0050010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		//------------------------------------------------------------------------------
		try {
			control.control_eventHandller("reload");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0050010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//------------------------------------------------------------------
		try {
			// キー項目退避
			control.setKeyStruct(struct);
			// ストラクトクリアしてキー項目を再セット
			//struct.clear();
			//struct.initialize();
			//struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			//struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("select");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0050010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
		//------------------------------------------------------------------
		try{
			control.control_eventHandller("clear");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0050010Controlクラスインスタンス
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
		//{{user_implement_dev:<onClickCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("CsvOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvOut>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AG0050010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] w_PLANT_NAME = ((params.containsKey("w_PLANT_NAME")) ? (String[])params.get("w_PLANT_NAME") : (String[])null);
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] SCDL_ISSUE_TOTAL_FIX = ((params.containsKey("SCDL_ISSUE_TOTAL_FIX")) ? (String[])params.get("SCDL_ISSUE_TOTAL_FIX") : (String[])null);
		String[] SCDL_RCV_TOTAL_FIX = ((params.containsKey("SCDL_RCV_TOTAL_FIX")) ? (String[])params.get("SCDL_RCV_TOTAL_FIX") : (String[])null);
		String[] STOCK_UNIT_3 = ((params.containsKey("STOCK_UNIT_3")) ? (String[])params.get("STOCK_UNIT_3") : (String[])null);
		String[] SCDL_ISSUE_TOTAL_NOFIX = ((params.containsKey("SCDL_ISSUE_TOTAL_NOFIX")) ? (String[])params.get("SCDL_ISSUE_TOTAL_NOFIX") : (String[])null);
		String[] STOCK_UNIT_1 = ((params.containsKey("STOCK_UNIT_1")) ? (String[])params.get("STOCK_UNIT_1") : (String[])null);
		String[] SCDL_RCV_TOTAL_NOFIX = ((params.containsKey("SCDL_RCV_TOTAL_NOFIX")) ? (String[])params.get("SCDL_RCV_TOTAL_NOFIX") : (String[])null);
		String[] STOCK_UNIT_4 = ((params.containsKey("STOCK_UNIT_4")) ? (String[])params.get("STOCK_UNIT_4") : (String[])null);
		String[] SCDL_ISSUE_TOTAL = ((params.containsKey("SCDL_ISSUE_TOTAL")) ? (String[])params.get("SCDL_ISSUE_TOTAL") : (String[])null);
		String[] STOCK_UNIT_2 = ((params.containsKey("STOCK_UNIT_2")) ? (String[])params.get("STOCK_UNIT_2") : (String[])null);
		String[] SCDL_RCV_TOTAL = ((params.containsKey("SCDL_RCV_TOTAL")) ? (String[])params.get("SCDL_RCV_TOTAL") : (String[])null);
		String[] STOCK_UNIT_5 = ((params.containsKey("STOCK_UNIT_5")) ? (String[])params.get("STOCK_UNIT_5") : (String[])null);
		String[] DELIVERY_DATE = ((params.containsKey("DELIVERY_DATE")) ? (String[])params.get("DELIVERY_DATE") : (String[])null);
		String[] INSIDE_ODR_QTY = ((params.containsKey("INSIDE_ODR_QTY")) ? (String[])params.get("INSIDE_ODR_QTY") : (String[])null);
		String[] DEMAND_QTY = ((params.containsKey("DEMAND_QTY")) ? (String[])params.get("DEMAND_QTY") : (String[])null);
		String[] STOCK_ODR_QTY = ((params.containsKey("STOCK_ODR_QTY")) ? (String[])params.get("STOCK_ODR_QTY") : (String[])null);
		String[] ADD_SUBTRACT = ((params.containsKey("ADD_SUBTRACT")) ? (String[])params.get("ADD_SUBTRACT") : (String[])null);
		String[] EFFECT_STOCK_QTY = ((params.containsKey("EFFECT_STOCK_QTY")) ? (String[])params.get("EFFECT_STOCK_QTY") : (String[])null);
		String[] PURCHASE_UNIT = ((params.containsKey("PURCHASE_UNIT")) ? (String[])params.get("PURCHASE_UNIT") : (String[])null);
		String[] STATUS = ((params.containsKey("STATUS")) ? (String[])params.get("STATUS") : (String[])null);
		String[] DEMAND_NO = ((params.containsKey("DEMAND_NO")) ? (String[])params.get("DEMAND_NO") : (String[])null);
		String[] ORDER_NO = ((params.containsKey("ORDER_NO")) ? (String[])params.get("ORDER_NO") : (String[])null);
		String[] GNR_TYP = ((params.containsKey("GNR_TYP")) ? (String[])params.get("GNR_TYP") : (String[])null);
		String[] JOB_ODR_CANCEL_NO = ((params.containsKey("JOB_ODR_CANCEL_NO")) ? (String[])params.get("JOB_ODR_CANCEL_NO") : (String[])null);
		String[] PARENT_ORDER_NO = ((params.containsKey("PARENT_ORDER_NO")) ? (String[])params.get("PARENT_ORDER_NO") : (String[])null);
		String[] rdoItemCd = ((params.containsKey("rdoItemCd")) ? (String[])params.get("rdoItemCd") : (String[])null);
		String[] rdoParentItemCd = ((params.containsKey("rdoParentItemCd")) ? (String[])params.get("rdoParentItemCd") : (String[])null);
		String[] rdoCompItemCd = ((params.containsKey("rdoCompItemCd")) ? (String[])params.get("rdoCompItemCd") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] DLV_LOC_CD = ((params.containsKey("DLV_LOC_CD")) ? (String[])params.get("DLV_LOC_CD") : (String[])null);
		String[] DESINATED_DLV_DATE = ((params.containsKey("DESINATED_DLV_DATE")) ? (String[])params.get("DESINATED_DLV_DATE") : (String[])null);
		String[] w_PARENT_ITEM_CD = ((params.containsKey("w_PARENT_ITEM_CD")) ? (String[])params.get("w_PARENT_ITEM_CD") : (String[])null);
		String[] w_PARENT_ITEM_NAME = ((params.containsKey("w_PARENT_ITEM_NAME")) ? (String[])params.get("w_PARENT_ITEM_NAME") : (String[])null);
		String[] w_COMP_ITEM_CD = ((params.containsKey("w_COMP_ITEM_CD")) ? (String[])params.get("w_COMP_ITEM_CD") : (String[])null);
		String[] w_COMP_ITEM_NAME = ((params.containsKey("w_COMP_ITEM_NAME")) ? (String[])params.get("w_COMP_ITEM_NAME") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] PUCH_ODR_START_DATE = ((params.containsKey("PUCH_ODR_START_DATE")) ? (String[])params.get("PUCH_ODR_START_DATE") : (String[])null);
		String[] PARENT_ORDER_ITEM_NO = ((params.containsKey("PARENT_ORDER_ITEM_NO")) ? (String[])params.get("PARENT_ORDER_ITEM_NO") : (String[])null);
		String[] PARENT_ORDER_ITEM_NAME = ((params.containsKey("PARENT_ORDER_ITEM_NAME")) ? (String[])params.get("PARENT_ORDER_ITEM_NAME") : (String[])null);
		String[] ODR_ACPT_DATE = ((params.containsKey("ODR_ACPT_DATE")) ? (String[])params.get("ODR_ACPT_DATE") : (String[])null);
		String[] checkMrpFlg = ((params.containsKey("checkMrpFlg")) ? (String[])params.get("checkMrpFlg") : (String[])null);
		String[] checkProdPlan = ((params.containsKey("checkProdPlan")) ? (String[])params.get("checkProdPlan") : (String[])null);
		String[] checkUncnfm = ((params.containsKey("checkUncnfm")) ? (String[])params.get("checkUncnfm") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] h_INSTALL_FLG = ((params.containsKey("h_INSTALL_FLG")) ? (String[])params.get("h_INSTALL_FLG") : (String[])null);
		String[] INTEGRATE_ODR_QTY = ((params.containsKey("INTEGRATE_ODR_QTY")) ? (String[])params.get("INTEGRATE_ODR_QTY") : (String[])null);
		String[] FIX_ODR_QTY = ((params.containsKey("FIX_ODR_QTY")) ? (String[])params.get("FIX_ODR_QTY") : (String[])null);
		String[] UNOFFICIAL_ODR_QTY = ((params.containsKey("UNOFFICIAL_ODR_QTY")) ? (String[])params.get("UNOFFICIAL_ODR_QTY") : (String[])null);
		String[] DEPOT_QTY = ((params.containsKey("DEPOT_QTY")) ? (String[])params.get("DEPOT_QTY") : (String[])null);
		String[] CUST_ANAME = ((params.containsKey("CUST_ANAME")) ? (String[])params.get("CUST_ANAME") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] checkQty = ((params.containsKey("checkQty")) ? (String[])params.get("checkQty") : (String[])null);
		String[] ODR_DEPOT_CTL_NO = ((params.containsKey("ODR_DEPOT_CTL_NO")) ? (String[])params.get("ODR_DEPOT_CTL_NO") : (String[])null);
		String[] CUST_ODR_NO = ((params.containsKey("CUST_ODR_NO")) ? (String[])params.get("CUST_ODR_NO") : (String[])null);
		String[] ODR_CHARACTERISTIC = ((params.containsKey("ODR_CHARACTERISTIC")) ? (String[])params.get("ODR_CHARACTERISTIC") : (String[])null);
		String[] h_DM_CREATE_BASE_TBL = ((params.containsKey("h_DM_CREATE_BASE_TBL")) ? (String[])params.get("h_DM_CREATE_BASE_TBL") : (String[])null);

		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setw_PLANT_NAME( ((w_PLANT_NAME == null) ? (String)null : w_PLANT_NAME[0]) );
		struct.setList_w_PLANT_NAME(TypeConverter.convert(w_PLANT_NAME));
		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setSCDL_ISSUE_TOTAL_FIX( ((SCDL_ISSUE_TOTAL_FIX == null) ? (String)null : SCDL_ISSUE_TOTAL_FIX[0]) );
		struct.setList_SCDL_ISSUE_TOTAL_FIX(TypeConverter.convert(SCDL_ISSUE_TOTAL_FIX));
		struct.setSCDL_RCV_TOTAL_FIX( ((SCDL_RCV_TOTAL_FIX == null) ? (String)null : SCDL_RCV_TOTAL_FIX[0]) );
		struct.setList_SCDL_RCV_TOTAL_FIX(TypeConverter.convert(SCDL_RCV_TOTAL_FIX));
		struct.setSTOCK_UNIT_3( ((STOCK_UNIT_3 == null) ? (String)null : STOCK_UNIT_3[0]) );
		struct.setList_STOCK_UNIT_3(TypeConverter.convert(STOCK_UNIT_3));
		struct.setSCDL_ISSUE_TOTAL_NOFIX( ((SCDL_ISSUE_TOTAL_NOFIX == null) ? (String)null : SCDL_ISSUE_TOTAL_NOFIX[0]) );
		struct.setList_SCDL_ISSUE_TOTAL_NOFIX(TypeConverter.convert(SCDL_ISSUE_TOTAL_NOFIX));
		struct.setSTOCK_UNIT_1( ((STOCK_UNIT_1 == null) ? (String)null : STOCK_UNIT_1[0]) );
		struct.setList_STOCK_UNIT_1(TypeConverter.convert(STOCK_UNIT_1));
		struct.setSCDL_RCV_TOTAL_NOFIX( ((SCDL_RCV_TOTAL_NOFIX == null) ? (String)null : SCDL_RCV_TOTAL_NOFIX[0]) );
		struct.setList_SCDL_RCV_TOTAL_NOFIX(TypeConverter.convert(SCDL_RCV_TOTAL_NOFIX));
		struct.setSTOCK_UNIT_4( ((STOCK_UNIT_4 == null) ? (String)null : STOCK_UNIT_4[0]) );
		struct.setList_STOCK_UNIT_4(TypeConverter.convert(STOCK_UNIT_4));
		struct.setSCDL_ISSUE_TOTAL( ((SCDL_ISSUE_TOTAL == null) ? (String)null : SCDL_ISSUE_TOTAL[0]) );
		struct.setList_SCDL_ISSUE_TOTAL(TypeConverter.convert(SCDL_ISSUE_TOTAL));
		struct.setSTOCK_UNIT_2( ((STOCK_UNIT_2 == null) ? (String)null : STOCK_UNIT_2[0]) );
		struct.setList_STOCK_UNIT_2(TypeConverter.convert(STOCK_UNIT_2));
		struct.setSCDL_RCV_TOTAL( ((SCDL_RCV_TOTAL == null) ? (String)null : SCDL_RCV_TOTAL[0]) );
		struct.setList_SCDL_RCV_TOTAL(TypeConverter.convert(SCDL_RCV_TOTAL));
		struct.setSTOCK_UNIT_5( ((STOCK_UNIT_5 == null) ? (String)null : STOCK_UNIT_5[0]) );
		struct.setList_STOCK_UNIT_5(TypeConverter.convert(STOCK_UNIT_5));
		struct.setDELIVERY_DATE( ((DELIVERY_DATE == null) ? (String)null : DELIVERY_DATE[0]) );
		struct.setList_DELIVERY_DATE(TypeConverter.convert(DELIVERY_DATE));
		struct.setINSIDE_ODR_QTY( ((INSIDE_ODR_QTY == null) ? (String)null : INSIDE_ODR_QTY[0]) );
		struct.setList_INSIDE_ODR_QTY(TypeConverter.convert(INSIDE_ODR_QTY));
		struct.setDEMAND_QTY( ((DEMAND_QTY == null) ? (String)null : DEMAND_QTY[0]) );
		struct.setList_DEMAND_QTY(TypeConverter.convert(DEMAND_QTY));
		struct.setSTOCK_ODR_QTY( ((STOCK_ODR_QTY == null) ? (String)null : STOCK_ODR_QTY[0]) );
		struct.setList_STOCK_ODR_QTY(TypeConverter.convert(STOCK_ODR_QTY));
		struct.setADD_SUBTRACT( ((ADD_SUBTRACT == null) ? (String)null : ADD_SUBTRACT[0]) );
		struct.setList_ADD_SUBTRACT(TypeConverter.convert(ADD_SUBTRACT));
		struct.setEFFECT_STOCK_QTY( ((EFFECT_STOCK_QTY == null) ? (String)null : EFFECT_STOCK_QTY[0]) );
		struct.setList_EFFECT_STOCK_QTY(TypeConverter.convert(EFFECT_STOCK_QTY));
		struct.setPURCHASE_UNIT( ((PURCHASE_UNIT == null) ? (String)null : PURCHASE_UNIT[0]) );
		struct.setList_PURCHASE_UNIT(TypeConverter.convert(PURCHASE_UNIT));
		struct.setSTATUS( ((STATUS == null) ? (String)null : STATUS[0]) );
		struct.setList_STATUS(TypeConverter.convert(STATUS));
		struct.setDEMAND_NO( ((DEMAND_NO == null) ? (String)null : DEMAND_NO[0]) );
		struct.setList_DEMAND_NO(TypeConverter.convert(DEMAND_NO));
		struct.setORDER_NO( ((ORDER_NO == null) ? (String)null : ORDER_NO[0]) );
		struct.setList_ORDER_NO(TypeConverter.convert(ORDER_NO));
		struct.setGNR_TYP( ((GNR_TYP == null) ? (String)null : GNR_TYP[0]) );
		struct.setList_GNR_TYP(TypeConverter.convert(GNR_TYP));
		struct.setJOB_ODR_CANCEL_NO( ((JOB_ODR_CANCEL_NO == null) ? (String)null : JOB_ODR_CANCEL_NO[0]) );
		struct.setList_JOB_ODR_CANCEL_NO(TypeConverter.convert(JOB_ODR_CANCEL_NO));
		struct.setPARENT_ORDER_NO( ((PARENT_ORDER_NO == null) ? (String)null : PARENT_ORDER_NO[0]) );
		struct.setList_PARENT_ORDER_NO(TypeConverter.convert(PARENT_ORDER_NO));
		struct.setrdoItemCd( ((rdoItemCd == null) ? (String)null : rdoItemCd[0]) );
		struct.setList_rdoItemCd(TypeConverter.convert(rdoItemCd));
		struct.setrdoParentItemCd( ((rdoParentItemCd == null) ? (String)null : rdoParentItemCd[0]) );
		struct.setList_rdoParentItemCd(TypeConverter.convert(rdoParentItemCd));
		struct.setrdoCompItemCd( ((rdoCompItemCd == null) ? (String)null : rdoCompItemCd[0]) );
		struct.setList_rdoCompItemCd(TypeConverter.convert(rdoCompItemCd));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setDLV_LOC_CD( ((DLV_LOC_CD == null) ? (String)null : DLV_LOC_CD[0]) );
		struct.setList_DLV_LOC_CD(TypeConverter.convert(DLV_LOC_CD));
		struct.setDESINATED_DLV_DATE( ((DESINATED_DLV_DATE == null) ? (String)null : DESINATED_DLV_DATE[0]) );
		struct.setList_DESINATED_DLV_DATE(TypeConverter.convert(DESINATED_DLV_DATE));
		struct.setw_PARENT_ITEM_CD( ((w_PARENT_ITEM_CD == null) ? (String)null : w_PARENT_ITEM_CD[0]) );
		struct.setList_w_PARENT_ITEM_CD(TypeConverter.convert(w_PARENT_ITEM_CD));
		struct.setw_PARENT_ITEM_NAME( ((w_PARENT_ITEM_NAME == null) ? (String)null : w_PARENT_ITEM_NAME[0]) );
		struct.setList_w_PARENT_ITEM_NAME(TypeConverter.convert(w_PARENT_ITEM_NAME));
		struct.setw_COMP_ITEM_CD( ((w_COMP_ITEM_CD == null) ? (String)null : w_COMP_ITEM_CD[0]) );
		struct.setList_w_COMP_ITEM_CD(TypeConverter.convert(w_COMP_ITEM_CD));
		struct.setw_COMP_ITEM_NAME( ((w_COMP_ITEM_NAME == null) ? (String)null : w_COMP_ITEM_NAME[0]) );
		struct.setList_w_COMP_ITEM_NAME(TypeConverter.convert(w_COMP_ITEM_NAME));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setPUCH_ODR_START_DATE( ((PUCH_ODR_START_DATE == null) ? (String)null : PUCH_ODR_START_DATE[0]) );
		struct.setList_PUCH_ODR_START_DATE(TypeConverter.convert(PUCH_ODR_START_DATE));
		struct.setPARENT_ORDER_ITEM_NO( ((PARENT_ORDER_ITEM_NO == null) ? (String)null : PARENT_ORDER_ITEM_NO[0]) );
		struct.setList_PARENT_ORDER_ITEM_NO(TypeConverter.convert(PARENT_ORDER_ITEM_NO));
		struct.setPARENT_ORDER_ITEM_NAME( ((PARENT_ORDER_ITEM_NAME == null) ? (String)null : PARENT_ORDER_ITEM_NAME[0]) );
		struct.setList_PARENT_ORDER_ITEM_NAME(TypeConverter.convert(PARENT_ORDER_ITEM_NAME));
		struct.setODR_ACPT_DATE( ((ODR_ACPT_DATE == null) ? (String)null : ODR_ACPT_DATE[0]) );
		struct.setList_ODR_ACPT_DATE(TypeConverter.convert(ODR_ACPT_DATE));
		struct.setcheckMrpFlg( ((checkMrpFlg == null) ? (String)null : checkMrpFlg[0]) );
		struct.setList_checkMrpFlg(TypeConverter.convert(checkMrpFlg));
		struct.setcheckProdPlan( ((checkProdPlan == null) ? (String)null : checkProdPlan[0]) );
		struct.setList_checkProdPlan(TypeConverter.convert(checkProdPlan));
		struct.setcheckUncnfm( ((checkUncnfm == null) ? (String)null : checkUncnfm[0]) );
		struct.setList_checkUncnfm(TypeConverter.convert(checkUncnfm));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.seth_INSTALL_FLG( ((h_INSTALL_FLG == null) ? (String)null : h_INSTALL_FLG[0]) );
		struct.setList_h_INSTALL_FLG(TypeConverter.convert(h_INSTALL_FLG));
		struct.setINTEGRATE_ODR_QTY( ((INTEGRATE_ODR_QTY == null) ? (String)null : INTEGRATE_ODR_QTY[0]) );
		struct.setList_INTEGRATE_ODR_QTY(TypeConverter.convert(INTEGRATE_ODR_QTY));
		struct.setFIX_ODR_QTY( ((FIX_ODR_QTY == null) ? (String)null : FIX_ODR_QTY[0]) );
		struct.setList_FIX_ODR_QTY(TypeConverter.convert(FIX_ODR_QTY));
		struct.setUNOFFICIAL_ODR_QTY( ((UNOFFICIAL_ODR_QTY == null) ? (String)null : UNOFFICIAL_ODR_QTY[0]) );
		struct.setList_UNOFFICIAL_ODR_QTY(TypeConverter.convert(UNOFFICIAL_ODR_QTY));
		struct.setDEPOT_QTY( ((DEPOT_QTY == null) ? (String)null : DEPOT_QTY[0]) );
		struct.setList_DEPOT_QTY(TypeConverter.convert(DEPOT_QTY));
		struct.setCUST_ANAME( ((CUST_ANAME == null) ? (String)null : CUST_ANAME[0]) );
		struct.setList_CUST_ANAME(TypeConverter.convert(CUST_ANAME));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setcheckQty( ((checkQty == null) ? (String)null : checkQty[0]) );
		struct.setList_checkQty(TypeConverter.convert(checkQty));
		struct.setODR_DEPOT_CTL_NO( ((ODR_DEPOT_CTL_NO == null) ? (String)null : ODR_DEPOT_CTL_NO[0]) );
		struct.setList_ODR_DEPOT_CTL_NO(TypeConverter.convert(ODR_DEPOT_CTL_NO));
		struct.setCUST_ODR_NO( ((CUST_ODR_NO == null) ? (String)null : CUST_ODR_NO[0]) );
		struct.setList_CUST_ODR_NO(TypeConverter.convert(CUST_ODR_NO));
		struct.setODR_CHARACTERISTIC( ((ODR_CHARACTERISTIC == null) ? (String)null : ODR_CHARACTERISTIC[0]) );
		struct.setList_ODR_CHARACTERISTIC(TypeConverter.convert(ODR_CHARACTERISTIC));
		struct.seth_DM_CREATE_BASE_TBL( ((h_DM_CREATE_BASE_TBL == null) ? (String)null : h_DM_CREATE_BASE_TBL[0]) );
		struct.setList_h_DM_CREATE_BASE_TBL(TypeConverter.convert(h_DM_CREATE_BASE_TBL));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AG0050010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAG0050010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAG0050010Struct";   // JSP先のバインド名(Struct)の指定
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
					AG0050010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AG0050010Control control;
		AG0050010Entity  entity = null;
		AG0050010Struct  struct = null;

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

			if( (control = (AG0050010Control)so.getAttribute("AG0050010Control_"+request.getSession(false).getId())) == null ) {
				control = new AG0050010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AG0050010Control();
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
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AG0050010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "CsvOut") && bFLG_DISCONNECT_CsvOut)
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
	private  static boolean bFLG_DISCONNECT_CsvOut = true;

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
		return "com.nec.jp.orteus.metamorBase.AG0050.AG0050010Servlet";
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
	public AG0050010Servlet()
	{
		//{{user_implement_dev:<AG0050010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AG0050010_DisConnect_FLG>

		//{{user_implement_dev:<AG0050010Servlet>
                //}}user_implement_dev:<AG0050010Servlet>
	}

	//////////////////////////////

}
