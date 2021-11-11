/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/src/com/nec/jp/orteus/metamorBase/AG0010/AG0010010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0010;

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

public class AG0010010Servlet extends HttpServlet
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
	 * @param control AG0010010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AG0010010Control control)
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
		
		// 在庫一覧からの遷移パラメータの取得
		// 工場コード
		String[] plantCd = (String[])params.get("PLANT_CD");

		if (plantCd == null) {
			control.setPlantCd(null);
		} else {
			control.setPlantCd(plantCd[0]);
		}
		
		// 品目番号
		String[] itemCd = (String[])params.get("ITEM_CD");
		if (itemCd == null) {
			control.setItemCd(null);
		} else {
			control.setItemCd(itemCd[0]);
		}
		// 品目番号
		if(params.containsKey("Lower_ITEM_CD")){
			String[] loweritemCd = (String[])params.get("Lower_ITEM_CD");
			if (loweritemCd  == null) {
				control.setItemCd(null);
			} else {
				control.setItemCd(loweritemCd [0]);
			}
		}
		
		String[] devtyp = (String[])params.get("h_DEVELOP_TYP");
		String[] compitemCd = (String[])params.get("COMP_ITEM_CD");
		String[] parentitemCd = (String[])params.get("PARENT_ITEM_CD");
		if (devtyp != null) {		
			if ("2".equals(devtyp[0])) {
				control.setItemCd(parentitemCd[0]);
			}else if(!"".equals(compitemCd[0])){
				control.setItemCd(compitemCd[0]);				
			}else if(!"".equals(parentitemCd[0])){
				control.setItemCd(parentitemCd[0]);				
			}
		}
		
		String[] w_WH_CD = (String[])params.get("WH_CD");
		if(w_WH_CD == null){
		    control.setWh_Cd(null);
		} else {
		    control.setWh_Cd(w_WH_CD[0]);
		}
		
		String[] WH_NAME = (String[])params.get("WH_NAME");
		if(WH_NAME == null){
	        control.setWH_NAME(null);
		} else {
		    control.setWH_NAME(WH_NAME[0]);
		}
		
		String[] templot = (String[])params.get("tempLot");
		if(templot == null){
		    control.settemplot("0");
		} else {
			control.settemplot(templot[0]);
		} 
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * 画面共通パラメータ取得
	 * @param params  Hashtableクラスインスタンス
	 * @param control AG0010010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AG0010010Control control)
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
	 * @param control AG0010010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
			logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AG0010010"+" $Revision: 1.12 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AG0010010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		//------------------------------------------------------------------------------
		try {
			control.control_eventHandller("reload");
			if(control.gettemplot().equals("1")){
			    nextUrl = "/AG0010012.jsp";
			}else {
				nextUrl = "/AG0010010.jsp";
			}

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0010010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//------------------------------------------------------------------
		try {
			// キー項目退避
			control.setKeyStruct(struct);
			// ストラクトクリアしてキー項目を再セット
			struct.clear();
			struct.initialize();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("select");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * 在庫詳細ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0010010Controlクラスインスタンス
	 */
	public String onClickinventoryDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetail");
		//{{user_implement_dev:<onClickinventoryDetail>
		//------------------------------------------------------------------
		try{
			int maxline1 = 10;
			// キー項目退避
			control.setKeyStruct(struct);
			// ストラクトクリアしてキー項目を再セット
			struct.clear();
			struct.initialize();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("inventoryDetail");

			if("1".equals(control.getnextUrlFlg())){
				// 子画面に遷移
				nextUrl = "/AG0010011.jsp";
			} else {
				nextUrl = "/AG0010010.jsp";
			}

			control.maxLineCheck(maxline1);

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickinventoryDetail>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetail");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0010010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0010010Controlクラスインスタンス
	 */
	public String onClickCloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub1");
		//{{user_implement_dev:<onClickCloseSub1>
		//------------------------------------------------------------------
		try{
			// ストラクトクリアしてキー項目を再セット
			struct.clear();
			struct.initialize();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("CloseSub1");

			// 親画面に遷移
			nextUrl = "/AG0010010.jsp";

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickCloseSub1>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub1");

		return nextUrl;
	}

	/**
	 * ロット別詳細ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0010010Controlクラスインスタンス
	 */
	public String onClickinventoryDetailsub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AG0010012.jsp";		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetailsub1");
		//{{user_implement_dev:<onClickinventoryDetailsub1>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int maxline2 = 20;
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());
			control.control_eventHandller("inventoryDetailsub1");
			if(control.getMessage().sizeError() > 0){
				// 子画面に遷移
				nextUrl = "/AG0010011.jsp";
			}
			
			control.maxLineCheck(maxline2);
			
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinventoryDetailsub1>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinventoryDetailsub1");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AG0010010Controlクラスインスタンス
	 */
	public String onClickCloseSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AG0010011.jsp";		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub2");
		//{{user_implement_dev:<onClickCloseSub2>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// ストラクトクリアしてキー項目を再セット
			struct.clear();
			struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("CloseSub2");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCloseSub2>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCloseSub2");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AG0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] w_ITEM_STOCK_QTY = ((params.containsKey("w_ITEM_STOCK_QTY")) ? (String[])params.get("w_ITEM_STOCK_QTY") : (String[])null);
		String[] w_ITEM_STOCK_QTY_FOR_MRP = ((params.containsKey("w_ITEM_STOCK_QTY_FOR_MRP")) ? (String[])params.get("w_ITEM_STOCK_QTY_FOR_MRP") : (String[])null);
		String[] w_ITEM_STOCK_QTY_OUTSIDE_MRP = ((params.containsKey("w_ITEM_STOCK_QTY_OUTSIDE_MRP")) ? (String[])params.get("w_ITEM_STOCK_QTY_OUTSIDE_MRP") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY = ((params.containsKey("w_JOB_ODR_STOCK_QTY")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_FOR_MRP = ((params.containsKey("w_JOB_ODR_STOCK_QTY_FOR_MRP")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_FOR_MRP") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = ((params.containsKey("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP") : (String[])null);
		String[] w_TOTAL_STOCK_QTY = ((params.containsKey("w_TOTAL_STOCK_QTY")) ? (String[])params.get("w_TOTAL_STOCK_QTY") : (String[])null);
		String[] w_ITEM_DEFECT_QTY = ((params.containsKey("w_ITEM_DEFECT_QTY")) ? (String[])params.get("w_ITEM_DEFECT_QTY") : (String[])null);
		String[] w_ITEM_STOCK_QTY_LAST_DAY = ((params.containsKey("w_ITEM_STOCK_QTY_LAST_DAY")) ? (String[])params.get("w_ITEM_STOCK_QTY_LAST_DAY") : (String[])null);
		String[] w_ITEM_STOCK_QTY_LAST_MONTH = ((params.containsKey("w_ITEM_STOCK_QTY_LAST_MONTH")) ? (String[])params.get("w_ITEM_STOCK_QTY_LAST_MONTH") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_LAST_DAY = ((params.containsKey("w_JOB_ODR_STOCK_QTY_LAST_DAY")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_LAST_DAY") : (String[])null);
		String[] w_JOB_ODR_STOCK_QTY_LAST_MONTH = ((params.containsKey("w_JOB_ODR_STOCK_QTY_LAST_MONTH")) ? (String[])params.get("w_JOB_ODR_STOCK_QTY_LAST_MONTH") : (String[])null);
		String[] w_TOTAL_STOCK_QTY_LAST_DAY = ((params.containsKey("w_TOTAL_STOCK_QTY_LAST_DAY")) ? (String[])params.get("w_TOTAL_STOCK_QTY_LAST_DAY") : (String[])null);
		String[] w_TOTAL_STOCK_QTY_LAST_MONTH = ((params.containsKey("w_TOTAL_STOCK_QTY_LAST_MONTH")) ? (String[])params.get("w_TOTAL_STOCK_QTY_LAST_MONTH") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] w_WH_CD = ((params.containsKey("w_WH_CD")) ? (String[])params.get("w_WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] w_STOCK_ON_HAND_QTY = ((params.containsKey("w_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_STOCK_ON_HAND_QTY") : (String[])null);
		String[] w_DEFECT_QTY = ((params.containsKey("w_DEFECT_QTY")) ? (String[])params.get("w_DEFECT_QTY") : (String[])null);
		String[] w_PRVS_DAYEND_STOCK_QTY = ((params.containsKey("w_PRVS_DAYEND_STOCK_QTY")) ? (String[])params.get("w_PRVS_DAYEND_STOCK_QTY") : (String[])null);
		String[] w_PRVS_MONTHEND_STOCK_QTY = ((params.containsKey("w_PRVS_MONTHEND_STOCK_QTY")) ? (String[])params.get("w_PRVS_MONTHEND_STOCK_QTY") : (String[])null);
		String[] w_PLANT_NAME = ((params.containsKey("w_PLANT_NAME")) ? (String[])params.get("w_PLANT_NAME") : (String[])null);
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] MRP_ODR_NAME = ((params.containsKey("MRP_ODR_NAME")) ? (String[])params.get("MRP_ODR_NAME") : (String[])null);
		String[] MRP_NAME = ((params.containsKey("MRP_NAME")) ? (String[])params.get("MRP_NAME") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] h_lotCtrl = ((params.containsKey("h_lotCtrl")) ? (String[])params.get("h_lotCtrl") : (String[])null);
		String[] h_lotFlg = ((params.containsKey("h_lotFlg")) ? (String[])params.get("h_lotFlg") : (String[])null);
		String[] h_screenflg = ((params.containsKey("h_screenflg")) ? (String[])params.get("h_screenflg") : (String[])null);
		String[] l_PLANT_NAME = ((params.containsKey("l_PLANT_NAME")) ? (String[])params.get("l_PLANT_NAME") : (String[])null);
		String[] l_LOT_NO = ((params.containsKey("l_LOT_NO")) ? (String[])params.get("l_LOT_NO") : (String[])null);
		String[] l_STOCK_ON_HAND_QTY = ((params.containsKey("l_STOCK_ON_HAND_QTY")) ? (String[])params.get("l_STOCK_ON_HAND_QTY") : (String[])null);
		String[] l_ALCD_QTY = ((params.containsKey("l_ALCD_QTY")) ? (String[])params.get("l_ALCD_QTY") : (String[])null);
		String[] l_EXPIRATION_DATE = ((params.containsKey("l_EXPIRATION_DATE")) ? (String[])params.get("l_EXPIRATION_DATE") : (String[])null);
		String[] l_PRD_CMPLT_DATE = ((params.containsKey("l_PRD_CMPLT_DATE")) ? (String[])params.get("l_PRD_CMPLT_DATE") : (String[])null);

		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setw_ITEM_STOCK_QTY( ((w_ITEM_STOCK_QTY == null) ? (String)null : w_ITEM_STOCK_QTY[0]) );
		struct.setList_w_ITEM_STOCK_QTY(TypeConverter.convert(w_ITEM_STOCK_QTY));
		struct.setw_ITEM_STOCK_QTY_FOR_MRP( ((w_ITEM_STOCK_QTY_FOR_MRP == null) ? (String)null : w_ITEM_STOCK_QTY_FOR_MRP[0]) );
		struct.setList_w_ITEM_STOCK_QTY_FOR_MRP(TypeConverter.convert(w_ITEM_STOCK_QTY_FOR_MRP));
		struct.setw_ITEM_STOCK_QTY_OUTSIDE_MRP( ((w_ITEM_STOCK_QTY_OUTSIDE_MRP == null) ? (String)null : w_ITEM_STOCK_QTY_OUTSIDE_MRP[0]) );
		struct.setList_w_ITEM_STOCK_QTY_OUTSIDE_MRP(TypeConverter.convert(w_ITEM_STOCK_QTY_OUTSIDE_MRP));
		struct.setw_JOB_ODR_STOCK_QTY( ((w_JOB_ODR_STOCK_QTY == null) ? (String)null : w_JOB_ODR_STOCK_QTY[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY(TypeConverter.convert(w_JOB_ODR_STOCK_QTY));
		struct.setw_JOB_ODR_STOCK_QTY_FOR_MRP( ((w_JOB_ODR_STOCK_QTY_FOR_MRP == null) ? (String)null : w_JOB_ODR_STOCK_QTY_FOR_MRP[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_FOR_MRP(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_FOR_MRP));
		struct.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP( ((w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP == null) ? (String)null : w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP));
		struct.setw_TOTAL_STOCK_QTY( ((w_TOTAL_STOCK_QTY == null) ? (String)null : w_TOTAL_STOCK_QTY[0]) );
		struct.setList_w_TOTAL_STOCK_QTY(TypeConverter.convert(w_TOTAL_STOCK_QTY));
		struct.setw_ITEM_DEFECT_QTY( ((w_ITEM_DEFECT_QTY == null) ? (String)null : w_ITEM_DEFECT_QTY[0]) );
		struct.setList_w_ITEM_DEFECT_QTY(TypeConverter.convert(w_ITEM_DEFECT_QTY));
		struct.setw_ITEM_STOCK_QTY_LAST_DAY( ((w_ITEM_STOCK_QTY_LAST_DAY == null) ? (String)null : w_ITEM_STOCK_QTY_LAST_DAY[0]) );
		struct.setList_w_ITEM_STOCK_QTY_LAST_DAY(TypeConverter.convert(w_ITEM_STOCK_QTY_LAST_DAY));
		struct.setw_ITEM_STOCK_QTY_LAST_MONTH( ((w_ITEM_STOCK_QTY_LAST_MONTH == null) ? (String)null : w_ITEM_STOCK_QTY_LAST_MONTH[0]) );
		struct.setList_w_ITEM_STOCK_QTY_LAST_MONTH(TypeConverter.convert(w_ITEM_STOCK_QTY_LAST_MONTH));
		struct.setw_JOB_ODR_STOCK_QTY_LAST_DAY( ((w_JOB_ODR_STOCK_QTY_LAST_DAY == null) ? (String)null : w_JOB_ODR_STOCK_QTY_LAST_DAY[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_LAST_DAY(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_LAST_DAY));
		struct.setw_JOB_ODR_STOCK_QTY_LAST_MONTH( ((w_JOB_ODR_STOCK_QTY_LAST_MONTH == null) ? (String)null : w_JOB_ODR_STOCK_QTY_LAST_MONTH[0]) );
		struct.setList_w_JOB_ODR_STOCK_QTY_LAST_MONTH(TypeConverter.convert(w_JOB_ODR_STOCK_QTY_LAST_MONTH));
		struct.setw_TOTAL_STOCK_QTY_LAST_DAY( ((w_TOTAL_STOCK_QTY_LAST_DAY == null) ? (String)null : w_TOTAL_STOCK_QTY_LAST_DAY[0]) );
		struct.setList_w_TOTAL_STOCK_QTY_LAST_DAY(TypeConverter.convert(w_TOTAL_STOCK_QTY_LAST_DAY));
		struct.setw_TOTAL_STOCK_QTY_LAST_MONTH( ((w_TOTAL_STOCK_QTY_LAST_MONTH == null) ? (String)null : w_TOTAL_STOCK_QTY_LAST_MONTH[0]) );
		struct.setList_w_TOTAL_STOCK_QTY_LAST_MONTH(TypeConverter.convert(w_TOTAL_STOCK_QTY_LAST_MONTH));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setw_WH_CD( ((w_WH_CD == null) ? (String)null : w_WH_CD[0]) );
		struct.setList_w_WH_CD(TypeConverter.convert(w_WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setw_STOCK_ON_HAND_QTY( ((w_STOCK_ON_HAND_QTY == null) ? (String)null : w_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_STOCK_ON_HAND_QTY(TypeConverter.convert(w_STOCK_ON_HAND_QTY));
		struct.setw_DEFECT_QTY( ((w_DEFECT_QTY == null) ? (String)null : w_DEFECT_QTY[0]) );
		struct.setList_w_DEFECT_QTY(TypeConverter.convert(w_DEFECT_QTY));
		struct.setw_PRVS_DAYEND_STOCK_QTY( ((w_PRVS_DAYEND_STOCK_QTY == null) ? (String)null : w_PRVS_DAYEND_STOCK_QTY[0]) );
		struct.setList_w_PRVS_DAYEND_STOCK_QTY(TypeConverter.convert(w_PRVS_DAYEND_STOCK_QTY));
		struct.setw_PRVS_MONTHEND_STOCK_QTY( ((w_PRVS_MONTHEND_STOCK_QTY == null) ? (String)null : w_PRVS_MONTHEND_STOCK_QTY[0]) );
		struct.setList_w_PRVS_MONTHEND_STOCK_QTY(TypeConverter.convert(w_PRVS_MONTHEND_STOCK_QTY));
		struct.setw_PLANT_NAME( ((w_PLANT_NAME == null) ? (String)null : w_PLANT_NAME[0]) );
		struct.setList_w_PLANT_NAME(TypeConverter.convert(w_PLANT_NAME));
		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setMRP_ODR_NAME( ((MRP_ODR_NAME == null) ? (String)null : MRP_ODR_NAME[0]) );
		struct.setList_MRP_ODR_NAME(TypeConverter.convert(MRP_ODR_NAME));
		struct.setMRP_NAME( ((MRP_NAME == null) ? (String)null : MRP_NAME[0]) );
		struct.setList_MRP_NAME(TypeConverter.convert(MRP_NAME));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.seth_lotCtrl( ((h_lotCtrl == null) ? (String)null : h_lotCtrl[0]) );
		struct.setList_h_lotCtrl(TypeConverter.convert(h_lotCtrl));
		struct.seth_lotFlg( ((h_lotFlg == null) ? (String)null : h_lotFlg[0]) );
		struct.setList_h_lotFlg(TypeConverter.convert(h_lotFlg));
		struct.seth_screenflg( ((h_screenflg == null) ? (String)null : h_screenflg[0]) );
		struct.setList_h_screenflg(TypeConverter.convert(h_screenflg));
		struct.setl_PLANT_NAME( ((l_PLANT_NAME == null) ? (String)null : l_PLANT_NAME[0]) );
		struct.setList_l_PLANT_NAME(TypeConverter.convert(l_PLANT_NAME));
		struct.setl_LOT_NO( ((l_LOT_NO == null) ? (String)null : l_LOT_NO[0]) );
		struct.setList_l_LOT_NO(TypeConverter.convert(l_LOT_NO));
		struct.setl_STOCK_ON_HAND_QTY( ((l_STOCK_ON_HAND_QTY == null) ? (String)null : l_STOCK_ON_HAND_QTY[0]) );
		struct.setList_l_STOCK_ON_HAND_QTY(TypeConverter.convert(l_STOCK_ON_HAND_QTY));
		struct.setl_ALCD_QTY( ((l_ALCD_QTY == null) ? (String)null : l_ALCD_QTY[0]) );
		struct.setList_l_ALCD_QTY(TypeConverter.convert(l_ALCD_QTY));
		struct.setl_EXPIRATION_DATE( ((l_EXPIRATION_DATE == null) ? (String)null : l_EXPIRATION_DATE[0]) );
		struct.setList_l_EXPIRATION_DATE(TypeConverter.convert(l_EXPIRATION_DATE));
		struct.setl_PRD_CMPLT_DATE( ((l_PRD_CMPLT_DATE == null) ? (String)null : l_PRD_CMPLT_DATE[0]) );
		struct.setList_l_PRD_CMPLT_DATE(TypeConverter.convert(l_PRD_CMPLT_DATE));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AG0010010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAG0010010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAG0010010Struct";   // JSP先のバインド名(Struct)の指定
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
					AG0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AG0010010Entity entity = control.entity;
		AG0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0010");
		logger.entering("AG0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AG0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AG0010010Control control;
		AG0010010Entity  entity = null;
		AG0010010Struct  struct = null;

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

			if( (control = (AG0010010Control)so.getAttribute("AG0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new AG0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AG0010010Control();
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
				} else if( isClick(request, "inventoryDetail") ) {
					if ( !isCryptical(request, so, params, "inventoryDetail") ) return ERROR_TARGET;
					target = onClickinventoryDetail(request, response, so, params, control);
					control.setButton("inventoryDetail");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "CloseSub1") ) {
					if ( !isCryptical(request, so, params, "CloseSub1") ) return ERROR_TARGET;
					target = onClickCloseSub1(request, response, so, params, control);
					control.setButton("CloseSub1");
				} else if( isClick(request, "inventoryDetailsub1") ) {
					if ( !isCryptical(request, so, params, "inventoryDetailsub1") ) return ERROR_TARGET;
					target = onClickinventoryDetailsub1(request, response, so, params, control);
					control.setButton("inventoryDetailsub1");
				} else if( isClick(request, "CloseSub2") ) {
					if ( !isCryptical(request, so, params, "CloseSub2") ) return ERROR_TARGET;
					target = onClickCloseSub2(request, response, so, params, control);
					control.setButton("CloseSub2");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AG0010010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "inventoryDetail") && bFLG_DISCONNECT_inventoryDetail)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "CloseSub1") && bFLG_DISCONNECT_CloseSub1)
				|| (isClick(request, "inventoryDetailsub1") && bFLG_DISCONNECT_inventoryDetailsub1)
				|| (isClick(request, "CloseSub2") && bFLG_DISCONNECT_CloseSub2)
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
	private  static boolean bFLG_DISCONNECT_inventoryDetail = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_CloseSub1 = true;
	private  static boolean bFLG_DISCONNECT_inventoryDetailsub1 = true;
	private  static boolean bFLG_DISCONNECT_CloseSub2 = true;

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
		return "com.nec.jp.orteus.metamorBase.AG0010.AG0010010Servlet";
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
	public AG0010010Servlet()
	{
		//{{user_implement_dev:<AG0010010_DisConnect_FLG>
		// submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_inventoryDetail = true;
		bFLG_DISCONNECT_clear = true;
		bFLG_DISCONNECT_CloseSub1 = true;

                //}}user_implement_dev:<AG0010010_DisConnect_FLG>

		//{{user_implement_dev:<AG0010010Servlet>
                //}}user_implement_dev:<AG0010010Servlet>
	}

	//////////////////////////////

}
