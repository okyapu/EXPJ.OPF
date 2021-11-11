/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0100/src/com/nec/jp/orteus/metamorBase/KQ0100/KQ0100010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0100;

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
 * CLASS     : KQ0100010Servlet クラス
 * ファイル・クラス説明
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KQ0100010Servlet extends HttpServlet
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
	 * @param control KQ0100010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, KQ0100010Control control)
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
	 * @param control KQ0100010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, KQ0100010Control control)
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
	 * @param control KQ0100010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0100010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0100010Entity entity = control.entity;
		KQ0100010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
			logger.entering("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ユーザ定義のコードを記述してください
//			LogWriter.write( Level.ALL, "KQ0100010"+" $Revision: 1.3 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KQ0100010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0100010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0100010Entity entity = control.entity;
		KQ0100010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KQ0100010-E999","リロード処理"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0100010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0100010Entity entity = control.entity;
		KQ0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickselect>
		logger.exiting("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0100010Controlクラスインスタンス
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0100010Entity entity = control.entity;
		KQ0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("update");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0100010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0100010Entity entity = control.entity;
		KQ0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickclear>
		logger.exiting("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control KQ0100010Controlクラスインスタンス
	 */
	public String onClickclose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0100010Entity entity = control.entity;
		KQ0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");
		//{{user_implement_dev:<onClickclose>
			// TODO: ユーザ定義のコードを記述してください
		try {
			control.control_eventHandller("close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickclose>
		logger.exiting("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KQ0100010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] ODR_NO = ((params.containsKey("ODR_NO")) ? (String[])params.get("ODR_NO") : (String[])null);
		String[] h_UPDATE_FLG = ((params.containsKey("h_UPDATE_FLG")) ? (String[])params.get("h_UPDATE_FLG") : (String[])null);
		String[] r_SEL_PTN1 = ((params.containsKey("r_SEL_PTN1")) ? (String[])params.get("r_SEL_PTN1") : (String[])null);
		String[] SLIP_CD = ((params.containsKey("SLIP_CD")) ? (String[])params.get("SLIP_CD") : (String[])null);
		String[] r_SEL_PTN2 = ((params.containsKey("r_SEL_PTN2")) ? (String[])params.get("r_SEL_PTN2") : (String[])null);
		String[] CUST_ODR_NO = ((params.containsKey("CUST_ODR_NO")) ? (String[])params.get("CUST_ODR_NO") : (String[])null);
		String[] TAX_CD = ((params.containsKey("TAX_CD")) ? (String[])params.get("TAX_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] CUST_ITEM_CD = ((params.containsKey("CUST_ITEM_CD")) ? (String[])params.get("CUST_ITEM_CD") : (String[])null);
		String[] CUST_ITEM_NAME = ((params.containsKey("CUST_ITEM_NAME")) ? (String[])params.get("CUST_ITEM_NAME") : (String[])null);
		String[] INSPC_ACPT_TYP = ((params.containsKey("INSPC_ACPT_TYP")) ? (String[])params.get("INSPC_ACPT_TYP") : (String[])null);
		String[] ODR_QTY = ((params.containsKey("ODR_QTY")) ? (String[])params.get("ODR_QTY") : (String[])null);
		String[] ODR_ACPT_DATE = ((params.containsKey("ODR_ACPT_DATE")) ? (String[])params.get("ODR_ACPT_DATE") : (String[])null);
		String[] ODR_UNIT_PRICE = ((params.containsKey("ODR_UNIT_PRICE")) ? (String[])params.get("ODR_UNIT_PRICE") : (String[])null);
		String[] ODR_UNIT_CD = ((params.containsKey("ODR_UNIT_CD")) ? (String[])params.get("ODR_UNIT_CD") : (String[])null);
		String[] SHIP_DLV_DATE = ((params.containsKey("SHIP_DLV_DATE")) ? (String[])params.get("SHIP_DLV_DATE") : (String[])null);
		String[] ODR_AMOUNT = ((params.containsKey("ODR_AMOUNT")) ? (String[])params.get("ODR_AMOUNT") : (String[])null);
		String[] ODR_AMOUNT_UNIT_CD = ((params.containsKey("ODR_AMOUNT_UNIT_CD")) ? (String[])params.get("ODR_AMOUNT_UNIT_CD") : (String[])null);
		String[] DESINATED_DLV_DATE = ((params.containsKey("DESINATED_DLV_DATE")) ? (String[])params.get("DESINATED_DLV_DATE") : (String[])null);
		String[] l_STATUS = ((params.containsKey("l_STATUS")) ? (String[])params.get("l_STATUS") : (String[])null);
		String[] l_h_STATUS_CD = ((params.containsKey("l_h_STATUS_CD")) ? (String[])params.get("l_h_STATUS_CD") : (String[])null);
		String[] l_PART_DLV_SEQ_NO = ((params.containsKey("l_PART_DLV_SEQ_NO")) ? (String[])params.get("l_PART_DLV_SEQ_NO") : (String[])null);
		String[] l_DESINATED_SHIP_DATE = ((params.containsKey("l_DESINATED_SHIP_DATE")) ? (String[])params.get("l_DESINATED_SHIP_DATE") : (String[])null);
		String[] l_SALES_DATE = ((params.containsKey("l_SALES_DATE")) ? (String[])params.get("l_SALES_DATE") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] h_ODR_NO = ((params.containsKey("h_ODR_NO")) ? (String[])params.get("h_ODR_NO") : (String[])null);
		String[] h_CURRNCY_CD = ((params.containsKey("h_CURRNCY_CD")) ? (String[])params.get("h_CURRNCY_CD") : (String[])null);
		String[] h_TRANSPORT_LT = ((params.containsKey("h_TRANSPORT_LT")) ? (String[])params.get("h_TRANSPORT_LT") : (String[])null);
		String[] h_EXCH_TYP = ((params.containsKey("h_EXCH_TYP")) ? (String[])params.get("h_EXCH_TYP") : (String[])null);
		String[] h_PRICE_ROUND_TYP = ((params.containsKey("h_PRICE_ROUND_TYP")) ? (String[])params.get("h_PRICE_ROUND_TYP") : (String[])null);
		String[] h_INSPC_ACPT_TYP = ((params.containsKey("h_INSPC_ACPT_TYP")) ? (String[])params.get("h_INSPC_ACPT_TYP") : (String[])null);
		String[] l_ODR_SCDL_DLV_DATE = ((params.containsKey("l_ODR_SCDL_DLV_DATE")) ? (String[])params.get("l_ODR_SCDL_DLV_DATE") : (String[])null);
		String[] l_SHIP_DATE = ((params.containsKey("l_SHIP_DATE")) ? (String[])params.get("l_SHIP_DATE") : (String[])null);
		String[] l_SHIP_SCDL_DLV_DATE = ((params.containsKey("l_SHIP_SCDL_DLV_DATE")) ? (String[])params.get("l_SHIP_SCDL_DLV_DATE") : (String[])null);
		String[] l_SHIP_ODR_SLIP_CD = ((params.containsKey("l_SHIP_ODR_SLIP_CD")) ? (String[])params.get("l_SHIP_ODR_SLIP_CD") : (String[])null);
		String[] h_TAX_CD = ((params.containsKey("h_TAX_CD")) ? (String[])params.get("h_TAX_CD") : (String[])null);
		String[] l_h_SHIP_ODR_AMOUNT = ((params.containsKey("l_h_SHIP_ODR_AMOUNT")) ? (String[])params.get("l_h_SHIP_ODR_AMOUNT") : (String[])null);
		String[] l_h_SALES_AMOUNT = ((params.containsKey("l_h_SALES_AMOUNT")) ? (String[])params.get("l_h_SALES_AMOUNT") : (String[])null);
		String[] l_h_AI_AR_IF_FLG = ((params.containsKey("l_h_AI_AR_IF_FLG")) ? (String[])params.get("l_h_AI_AR_IF_FLG") : (String[])null);
		String[] l_h_TAX_DESINATED_SHIP_DATE = ((params.containsKey("l_h_TAX_DESINATED_SHIP_DATE")) ? (String[])params.get("l_h_TAX_DESINATED_SHIP_DATE") : (String[])null);
		String[] l_h_SHIP_ODR_NO = ((params.containsKey("l_h_SHIP_ODR_NO")) ? (String[])params.get("l_h_SHIP_ODR_NO") : (String[])null);
		String[] l_h_SALES_SEQ_NO = ((params.containsKey("l_h_SALES_SEQ_NO")) ? (String[])params.get("l_h_SALES_SEQ_NO") : (String[])null);
		String[] l_h_SALES_SLIP_CD = ((params.containsKey("l_h_SALES_SLIP_CD")) ? (String[])params.get("l_h_SALES_SLIP_CD") : (String[])null);
		String[] l_h_UPDATE_FLG = ((params.containsKey("l_h_UPDATE_FLG")) ? (String[])params.get("l_h_UPDATE_FLG") : (String[])null);
		String[] l_h_SHIP_SEQ_NO = ((params.containsKey("l_h_SHIP_SEQ_NO")) ? (String[])params.get("l_h_SHIP_SEQ_NO") : (String[])null);
		String[] l_h_INSPC_ACPT_DATE = ((params.containsKey("l_h_INSPC_ACPT_DATE")) ? (String[])params.get("l_h_INSPC_ACPT_DATE") : (String[])null);
		String[] l_h_AR_INSPC_ACPT_DATE = ((params.containsKey("l_h_AR_INSPC_ACPT_DATE")) ? (String[])params.get("l_h_AR_INSPC_ACPT_DATE") : (String[])null);
		String[] l_h_AR_SALES_AMOUNT = ((params.containsKey("l_h_AR_SALES_AMOUNT")) ? (String[])params.get("l_h_AR_SALES_AMOUNT") : (String[])null);
		String[] l_h_AR_TRN_INSPC_ACPT_DATE = ((params.containsKey("l_h_AR_TRN_INSPC_ACPT_DATE")) ? (String[])params.get("l_h_AR_TRN_INSPC_ACPT_DATE") : (String[])null);
		String[] l_h_AR_TRN_SALES_AMOUNT = ((params.containsKey("l_h_AR_TRN_SALES_AMOUNT")) ? (String[])params.get("l_h_AR_TRN_SALES_AMOUNT") : (String[])null);
		String[] h_SLIP_CTRL_GRP = ((params.containsKey("h_SLIP_CTRL_GRP")) ? (String[])params.get("h_SLIP_CTRL_GRP") : (String[])null);
		String[] h_MODIFY_COUNT = ((params.containsKey("h_MODIFY_COUNT")) ? (String[])params.get("h_MODIFY_COUNT") : (String[])null);

		struct.setODR_NO( ((ODR_NO == null) ? (String)null : ODR_NO[0]) );
		struct.setList_ODR_NO(TypeConverter.convert(ODR_NO));
		struct.seth_UPDATE_FLG( ((h_UPDATE_FLG == null) ? (String)null : h_UPDATE_FLG[0]) );
		struct.setList_h_UPDATE_FLG(TypeConverter.convert(h_UPDATE_FLG));
		struct.setr_SEL_PTN1( ((r_SEL_PTN1 == null) ? (String)null : r_SEL_PTN1[0]) );
		struct.setList_r_SEL_PTN1(TypeConverter.convert(r_SEL_PTN1));
		struct.setSLIP_CD( ((SLIP_CD == null) ? (String)null : SLIP_CD[0]) );
		struct.setList_SLIP_CD(TypeConverter.convert(SLIP_CD));
		struct.setr_SEL_PTN2( ((r_SEL_PTN2 == null) ? (String)null : r_SEL_PTN2[0]) );
		struct.setList_r_SEL_PTN2(TypeConverter.convert(r_SEL_PTN2));
		struct.setCUST_ODR_NO( ((CUST_ODR_NO == null) ? (String)null : CUST_ODR_NO[0]) );
		struct.setList_CUST_ODR_NO(TypeConverter.convert(CUST_ODR_NO));
		struct.setTAX_CD( ((TAX_CD == null) ? (String)null : TAX_CD[0]) );
		struct.setList_TAX_CD(TypeConverter.convert(TAX_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setCUST_ITEM_CD( ((CUST_ITEM_CD == null) ? (String)null : CUST_ITEM_CD[0]) );
		struct.setList_CUST_ITEM_CD(TypeConverter.convert(CUST_ITEM_CD));
		struct.setCUST_ITEM_NAME( ((CUST_ITEM_NAME == null) ? (String)null : CUST_ITEM_NAME[0]) );
		struct.setList_CUST_ITEM_NAME(TypeConverter.convert(CUST_ITEM_NAME));
		struct.setINSPC_ACPT_TYP( ((INSPC_ACPT_TYP == null) ? (String)null : INSPC_ACPT_TYP[0]) );
		struct.setList_INSPC_ACPT_TYP(TypeConverter.convert(INSPC_ACPT_TYP));
		struct.setODR_QTY( ((ODR_QTY == null) ? (String)null : ODR_QTY[0]) );
		struct.setList_ODR_QTY(TypeConverter.convert(ODR_QTY));
		struct.setODR_ACPT_DATE( ((ODR_ACPT_DATE == null) ? (String)null : ODR_ACPT_DATE[0]) );
		struct.setList_ODR_ACPT_DATE(TypeConverter.convert(ODR_ACPT_DATE));
		struct.setODR_UNIT_PRICE( ((ODR_UNIT_PRICE == null) ? (String)null : ODR_UNIT_PRICE[0]) );
		struct.setList_ODR_UNIT_PRICE(TypeConverter.convert(ODR_UNIT_PRICE));
		struct.setODR_UNIT_CD( ((ODR_UNIT_CD == null) ? (String)null : ODR_UNIT_CD[0]) );
		struct.setList_ODR_UNIT_CD(TypeConverter.convert(ODR_UNIT_CD));
		struct.setSHIP_DLV_DATE( ((SHIP_DLV_DATE == null) ? (String)null : SHIP_DLV_DATE[0]) );
		struct.setList_SHIP_DLV_DATE(TypeConverter.convert(SHIP_DLV_DATE));
		struct.setODR_AMOUNT( ((ODR_AMOUNT == null) ? (String)null : ODR_AMOUNT[0]) );
		struct.setList_ODR_AMOUNT(TypeConverter.convert(ODR_AMOUNT));
		struct.setODR_AMOUNT_UNIT_CD( ((ODR_AMOUNT_UNIT_CD == null) ? (String)null : ODR_AMOUNT_UNIT_CD[0]) );
		struct.setList_ODR_AMOUNT_UNIT_CD(TypeConverter.convert(ODR_AMOUNT_UNIT_CD));
		struct.setDESINATED_DLV_DATE( ((DESINATED_DLV_DATE == null) ? (String)null : DESINATED_DLV_DATE[0]) );
		struct.setList_DESINATED_DLV_DATE(TypeConverter.convert(DESINATED_DLV_DATE));
		struct.setl_STATUS( ((l_STATUS == null) ? (String)null : l_STATUS[0]) );
		struct.setList_l_STATUS(TypeConverter.convert(l_STATUS));
		struct.setl_h_STATUS_CD( ((l_h_STATUS_CD == null) ? (String)null : l_h_STATUS_CD[0]) );
		struct.setList_l_h_STATUS_CD(TypeConverter.convert(l_h_STATUS_CD));
		struct.setl_PART_DLV_SEQ_NO( ((l_PART_DLV_SEQ_NO == null) ? (String)null : l_PART_DLV_SEQ_NO[0]) );
		struct.setList_l_PART_DLV_SEQ_NO(TypeConverter.convert(l_PART_DLV_SEQ_NO));
		struct.setl_DESINATED_SHIP_DATE( ((l_DESINATED_SHIP_DATE == null) ? (String)null : l_DESINATED_SHIP_DATE[0]) );
		struct.setList_l_DESINATED_SHIP_DATE(TypeConverter.convert(l_DESINATED_SHIP_DATE));
		struct.setl_SALES_DATE( ((l_SALES_DATE == null) ? (String)null : l_SALES_DATE[0]) );
		struct.setList_l_SALES_DATE(TypeConverter.convert(l_SALES_DATE));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.seth_ODR_NO( ((h_ODR_NO == null) ? (String)null : h_ODR_NO[0]) );
		struct.setList_h_ODR_NO(TypeConverter.convert(h_ODR_NO));
		struct.seth_CURRNCY_CD( ((h_CURRNCY_CD == null) ? (String)null : h_CURRNCY_CD[0]) );
		struct.setList_h_CURRNCY_CD(TypeConverter.convert(h_CURRNCY_CD));
		struct.seth_TRANSPORT_LT( ((h_TRANSPORT_LT == null) ? (String)null : h_TRANSPORT_LT[0]) );
		struct.setList_h_TRANSPORT_LT(TypeConverter.convert(h_TRANSPORT_LT));
		struct.seth_EXCH_TYP( ((h_EXCH_TYP == null) ? (String)null : h_EXCH_TYP[0]) );
		struct.setList_h_EXCH_TYP(TypeConverter.convert(h_EXCH_TYP));
		struct.seth_PRICE_ROUND_TYP( ((h_PRICE_ROUND_TYP == null) ? (String)null : h_PRICE_ROUND_TYP[0]) );
		struct.setList_h_PRICE_ROUND_TYP(TypeConverter.convert(h_PRICE_ROUND_TYP));
		struct.seth_INSPC_ACPT_TYP( ((h_INSPC_ACPT_TYP == null) ? (String)null : h_INSPC_ACPT_TYP[0]) );
		struct.setList_h_INSPC_ACPT_TYP(TypeConverter.convert(h_INSPC_ACPT_TYP));
		struct.setl_ODR_SCDL_DLV_DATE( ((l_ODR_SCDL_DLV_DATE == null) ? (String)null : l_ODR_SCDL_DLV_DATE[0]) );
		struct.setList_l_ODR_SCDL_DLV_DATE(TypeConverter.convert(l_ODR_SCDL_DLV_DATE));
		struct.setl_SHIP_DATE( ((l_SHIP_DATE == null) ? (String)null : l_SHIP_DATE[0]) );
		struct.setList_l_SHIP_DATE(TypeConverter.convert(l_SHIP_DATE));
		struct.setl_SHIP_SCDL_DLV_DATE( ((l_SHIP_SCDL_DLV_DATE == null) ? (String)null : l_SHIP_SCDL_DLV_DATE[0]) );
		struct.setList_l_SHIP_SCDL_DLV_DATE(TypeConverter.convert(l_SHIP_SCDL_DLV_DATE));
		struct.setl_SHIP_ODR_SLIP_CD( ((l_SHIP_ODR_SLIP_CD == null) ? (String)null : l_SHIP_ODR_SLIP_CD[0]) );
		struct.setList_l_SHIP_ODR_SLIP_CD(TypeConverter.convert(l_SHIP_ODR_SLIP_CD));
		struct.seth_TAX_CD( ((h_TAX_CD == null) ? (String)null : h_TAX_CD[0]) );
		struct.setList_h_TAX_CD(TypeConverter.convert(h_TAX_CD));
		struct.setl_h_SHIP_ODR_AMOUNT( ((l_h_SHIP_ODR_AMOUNT == null) ? (String)null : l_h_SHIP_ODR_AMOUNT[0]) );
		struct.setList_l_h_SHIP_ODR_AMOUNT(TypeConverter.convert(l_h_SHIP_ODR_AMOUNT));
		struct.setl_h_SALES_AMOUNT( ((l_h_SALES_AMOUNT == null) ? (String)null : l_h_SALES_AMOUNT[0]) );
		struct.setList_l_h_SALES_AMOUNT(TypeConverter.convert(l_h_SALES_AMOUNT));
		struct.setl_h_AI_AR_IF_FLG( ((l_h_AI_AR_IF_FLG == null) ? (String)null : l_h_AI_AR_IF_FLG[0]) );
		struct.setList_l_h_AI_AR_IF_FLG(TypeConverter.convert(l_h_AI_AR_IF_FLG));
		struct.setl_h_TAX_DESINATED_SHIP_DATE( ((l_h_TAX_DESINATED_SHIP_DATE == null) ? (String)null : l_h_TAX_DESINATED_SHIP_DATE[0]) );
		struct.setList_l_h_TAX_DESINATED_SHIP_DATE(TypeConverter.convert(l_h_TAX_DESINATED_SHIP_DATE));
		struct.setl_h_SHIP_ODR_NO( ((l_h_SHIP_ODR_NO == null) ? (String)null : l_h_SHIP_ODR_NO[0]) );
		struct.setList_l_h_SHIP_ODR_NO(TypeConverter.convert(l_h_SHIP_ODR_NO));
		struct.setl_h_SALES_SEQ_NO( ((l_h_SALES_SEQ_NO == null) ? (String)null : l_h_SALES_SEQ_NO[0]) );
		struct.setList_l_h_SALES_SEQ_NO(TypeConverter.convert(l_h_SALES_SEQ_NO));
		struct.setl_h_SALES_SLIP_CD( ((l_h_SALES_SLIP_CD == null) ? (String)null : l_h_SALES_SLIP_CD[0]) );
		struct.setList_l_h_SALES_SLIP_CD(TypeConverter.convert(l_h_SALES_SLIP_CD));
		struct.setl_h_UPDATE_FLG( ((l_h_UPDATE_FLG == null) ? (String)null : l_h_UPDATE_FLG[0]) );
		struct.setList_l_h_UPDATE_FLG(TypeConverter.convert(l_h_UPDATE_FLG));
		struct.setl_h_SHIP_SEQ_NO( ((l_h_SHIP_SEQ_NO == null) ? (String)null : l_h_SHIP_SEQ_NO[0]) );
		struct.setList_l_h_SHIP_SEQ_NO(TypeConverter.convert(l_h_SHIP_SEQ_NO));
		struct.setl_h_INSPC_ACPT_DATE( ((l_h_INSPC_ACPT_DATE == null) ? (String)null : l_h_INSPC_ACPT_DATE[0]) );
		struct.setList_l_h_INSPC_ACPT_DATE(TypeConverter.convert(l_h_INSPC_ACPT_DATE));
		struct.setl_h_AR_INSPC_ACPT_DATE( ((l_h_AR_INSPC_ACPT_DATE == null) ? (String)null : l_h_AR_INSPC_ACPT_DATE[0]) );
		struct.setList_l_h_AR_INSPC_ACPT_DATE(TypeConverter.convert(l_h_AR_INSPC_ACPT_DATE));
		struct.setl_h_AR_SALES_AMOUNT( ((l_h_AR_SALES_AMOUNT == null) ? (String)null : l_h_AR_SALES_AMOUNT[0]) );
		struct.setList_l_h_AR_SALES_AMOUNT(TypeConverter.convert(l_h_AR_SALES_AMOUNT));
		struct.setl_h_AR_TRN_INSPC_ACPT_DATE( ((l_h_AR_TRN_INSPC_ACPT_DATE == null) ? (String)null : l_h_AR_TRN_INSPC_ACPT_DATE[0]) );
		struct.setList_l_h_AR_TRN_INSPC_ACPT_DATE(TypeConverter.convert(l_h_AR_TRN_INSPC_ACPT_DATE));
		struct.setl_h_AR_TRN_SALES_AMOUNT( ((l_h_AR_TRN_SALES_AMOUNT == null) ? (String)null : l_h_AR_TRN_SALES_AMOUNT[0]) );
		struct.setList_l_h_AR_TRN_SALES_AMOUNT(TypeConverter.convert(l_h_AR_TRN_SALES_AMOUNT));
		struct.seth_SLIP_CTRL_GRP( ((h_SLIP_CTRL_GRP == null) ? (String)null : h_SLIP_CTRL_GRP[0]) );
		struct.setList_h_SLIP_CTRL_GRP(TypeConverter.convert(h_SLIP_CTRL_GRP));
		struct.seth_MODIFY_COUNT( ((h_MODIFY_COUNT == null) ? (String)null : h_MODIFY_COUNT[0]) );
		struct.setList_h_MODIFY_COUNT(TypeConverter.convert(h_MODIFY_COUNT));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KQ0100010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aKQ0100010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aKQ0100010Struct";   // JSP先のバインド名(Struct)の指定
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
					KQ0100010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		KQ0100010Entity entity = control.entity;
		KQ0100010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0100");
		logger.entering("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KQ0100010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KQ0100010Control control;
		KQ0100010Entity  entity = null;
		KQ0100010Struct  struct = null;

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

			if( (control = (KQ0100010Control)so.getAttribute("KQ0100010Control_"+request.getSession(false).getId())) == null ) {
				control = new KQ0100010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KQ0100010Control();
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
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "close") ) {
					if ( !isCryptical(request, so, params, "close") ) return ERROR_TARGET;
					target = onClickclose(request, response, so, params, control);
					control.setButton("close");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KQ0100010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "select") && bFLG_DISCONNECT_select)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "close") && bFLG_DISCONNECT_close)
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
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_close = true;

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
		return "com.nec.jp.orteus.metamorBase.KQ0100.KQ0100010Servlet";
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
	public KQ0100010Servlet()
	{
		//{{user_implement_dev:<KQ0100010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_update = true;
		bFLG_DISCONNECT_clear = true;
		bFLG_DISCONNECT_close = true;

                //}}user_implement_dev:<KQ0100010_DisConnect_FLG>

		//{{user_implement_dev:<KQ0100010Servlet>
//			bFLG_CSRF = false; // CSRFのための判定を行わない場合は、コメントアウトをはずしてください

			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<KQ0100010Servlet>
	}

	//////////////////////////////

}
