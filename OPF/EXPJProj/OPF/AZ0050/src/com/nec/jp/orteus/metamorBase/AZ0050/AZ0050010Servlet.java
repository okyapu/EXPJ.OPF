/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/src/com/nec/jp/orteus/metamorBase/AZ0050/AZ0050010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0050;

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
//import com.nec.jp.orteus.metamorBase.common.CsvWriter.CsvWriter;
//------------------------------------------------------------------------------

//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AZ0050010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
              
               //-------------------------------------------------------------------------
               /** 
                * 条件設定画面の入力の取得し、controlのメンバへ設定する
                * @param HttpServletRequest request
                * @param Hashtable params
                * @param AZ0050010Struct control
               */
               private void setInput2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0050010Control control)
               {
                List w_list = control.getColumnList();
              
                String[] types = ((params.containsKey("sub3COND_TYPE")) ? (String[])params.get("sub3COND_TYPE") : (String[])null);
                String[] value1 = ((params.containsKey("sub3COND_VALUE1")) ? (String[])params.get("sub3COND_VALUE1") : (String[])null);
                String[] value2 = ((params.containsKey("sub3COND_VALUE2")) ? (String[])params.get("sub3COND_VALUE2") : (String[])null);
                String[] displays = ((params.containsKey("sub3DISPLAY_FLG")) ? (String[])params.get("sub3DISPLAY_FLG") : (String[])null);
                String[] sorttypes = ((params.containsKey("sub3SORT_TYPE")) ? (String[])params.get("sub3SORT_TYPE") : (String[])null);
                String[] sortkeys = ((params.containsKey("sub3SORTKEY_PRI")) ? (String[])params.get("sub3SORTKEY_PRI") : (String[])null);
                for(int i = 0; i < w_list.size(); i++)
                {
                 AZ0050010Struct temp_struct = (AZ0050010Struct)w_list.get(i);
                 if( types == null || types[i] == null ){
                  temp_struct.setsub3COND_TYPE(null);
                 } else {
                  temp_struct.setsub3COND_TYPE(new String(types[i]));
                 }
              
                 if( value1 == null || value1[i] == null ){
                  temp_struct.setsub3COND_VALUE1(null);
                 } else {
                  temp_struct.setsub3COND_VALUE1(new String(value1[i]));
                 }
              
                 if( value2 == null || value2[i] == null ){
                  temp_struct.setsub3COND_VALUE2(null);
                 } else {
                  temp_struct.setsub3COND_VALUE2(new String(value2[i]));
                 }
              
                 if( displays == null || displays[i] == null ){
                  temp_struct.setsub3DISPLAY_FLG(null);
                 } else {
                  temp_struct.setsub3DISPLAY_FLG(new String(displays[i]));
                 }
              
                 if( sorttypes == null || sorttypes[i] == null ){
                  temp_struct.setsub3SORT_TYPE(null);
                 } else {
                  temp_struct.setsub3SORT_TYPE(new String(sorttypes[i]));
                 }
              
                 if( sortkeys == null || sortkeys[i] == null ){
                  temp_struct.setsub3SORTKEY_PRI(null);
                 } else {
                  temp_struct.setsub3SORTKEY_PRI(new String(sortkeys[i]));
                 }
                }
               }
              
              
               /** 
                * テーブル選択画面の入力を取得し、structへ設定する
               */
               private int setSelectTabl2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0050010Struct struct){
              
                List l_table = new ArrayList();
                List l_comment = new ArrayList();
                int ret = 0;
              
                // 画面よりデータを取得
                String[] tbl = ((params.containsKey("h_TABLE_TO")) ? (String[])params.get("h_TABLE_TO") : (String[])null);
                String[] comment = ((params.containsKey("h_TABLE_COMMENT_TO")) ? (String[])params.get("h_TABLE_COMMENT_TO") : (String[])null);
              
                if(tbl != null){
                 for(int i=0; i<tbl.length; i++)
                 {
                  l_table.add(tbl[i]);
                  l_comment.add(comment[i]);
                 }
                 ret = tbl.length;
                }
              
                // 選択テーブルリストをStructにセット
                struct.setList_h_TABLE_TO(l_table);
                struct.setList_h_TABLE_COMMENT_TO(l_comment);
              
                return ret;
               }
              

// 2006/03/31追加
               /**
				 * 業務グループ設定画面の入力を取得し、structへ設定する
				 */
				private int setSelectGroup2Struct(HttpServletRequest request,
						Hashtable params, AZ0050010Struct struct) {
			
					List l_groupCd = new ArrayList();
					int ret = 0;

					// 画面よりデータを取得
					String[] groupCd = ((params.containsKey("h_GROUP_CODE_TO")) ? (String[]) params
							.get("h_GROUP_CODE_TO") : (String[]) null);
			
					if (groupCd != null) {
						for (int i = 0; i < groupCd.length; i++) {
							l_groupCd.add(groupCd[i]);
						}
						ret = groupCd.length;
					}
			
					// 選択テーブルリストをStructにセット
					struct.setList_h_GROUP_CODE_TO(l_groupCd);
			
					return ret;
				}
// 2006/03/31追加ここまで


               /**
				 * 対象項目選択画面の入力を取得し、structへ設定する
				 */
               private void setSelectItem2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0050010Struct struct){
              
                List l_col = new ArrayList();
                List l_alias = new ArrayList();
                List l_table_name = new ArrayList();
              
                // 画面よりデータを取得
                String[] col = ((params.containsKey("h_COLUMN")) ? (String[])params.get("h_COLUMN") : (String[])null);
                String[] alias = ((params.containsKey("h_TABLE_ALIAS")) ? (String[])params.get("h_TABLE_ALIAS") : (String[])null);
                String[] table_name = ((params.containsKey("h_TABLE_NAME")) ? (String[])params.get("h_TABLE_NAME") : (String[])null);
                if(col != null){
                 for(int i=0; i<col.length; i++)
                 {
                  l_col.add(col[i]);
                  l_alias.add(alias[i]);
                  l_table_name.add(table_name[i]);
                 }
                }
              
                // 選択テーブルリストをStructにセット
                struct.l_h_COLUMN.clear();
                struct.l_h_TABLE_ALIAS.clear();
                struct.l_h_TABLE_NAME.clear();
                struct.setList_h_COLUMN(l_col);
                struct.setList_h_TABLE_ALIAS(l_alias);
                struct.setList_h_TABLE_NAME(l_table_name);
               }
              
              
               /** 
                * 結合条件設定画面の入力を取得し、structへ設定する
               */
               private void setJoin2Struct(
                   HttpServletRequest request,
                   Hashtable params,
                   AZ0050010Struct struct){
              
                List l_left_name = new ArrayList();
                List l_left_alias = new ArrayList();
                List l_left_col = new ArrayList();
                List l_right_name = new ArrayList();
                List l_right_alias = new ArrayList();
                List l_right_col = new ArrayList();
                List l_cond = new ArrayList();
              
                // 画面よりデータを取得
                String[] left_name = ((params.containsKey("h_LEFT_TABLE_NAME")) ? (String[])params.get("h_LEFT_TABLE_NAME") : (String[])null);
                String[] left_alias = ((params.containsKey("h_LEFT_TABLE_ALIAS")) ? (String[])params.get("h_LEFT_TABLE_ALIAS") : (String[])null);
                String[] left_col = ((params.containsKey("h_LEFT_COLUMN")) ? (String[])params.get("h_LEFT_COLUMN") : (String[])null);
                String[] right_name = ((params.containsKey("h_RIGHT_TABLE_NAME")) ? (String[])params.get("h_RIGHT_TABLE_NAME") : (String[])null);
                String[] right_alias = ((params.containsKey("h_RIGHT_TABLE_ALIAS")) ? (String[])params.get("h_RIGHT_TABLE_ALIAS") : (String[])null);
                String[] right_col = ((params.containsKey("h_RIGHT_COLUMN")) ? (String[])params.get("h_RIGHT_COLUMN") : (String[])null);
                String[] cond = ((params.containsKey("h_CONDITION")) ? (String[])params.get("h_CONDITION") : (String[])null);
              
                if(left_name != null){
                 for(int i=0; i<left_name.length; i++)
                 {
                  l_left_name.add(left_name[i]);
                  l_left_alias.add(left_alias[i]);
                  l_left_col.add(left_col[i]);
                  l_right_name.add(right_name[i]);
                  l_right_alias.add(right_alias[i]);
                  l_right_col.add(right_col[i]);
                  l_cond.add(cond[i]);
                 }
                }
              
                // 選択テーブルリストをStructにセット
                struct.l_h_LEFT_TABLE_NAME.clear();
                struct.l_h_LEFT_TABLE_ALIAS.clear();
                struct.l_h_LEFT_COLUMN.clear();
                struct.l_h_RIGHT_TABLE_NAME.clear();
                struct.l_h_RIGHT_TABLE_ALIAS.clear();
                struct.l_h_RIGHT_COLUMN.clear();
                struct.l_h_CONDITION.clear();
                struct.setList_h_LEFT_TABLE_NAME(l_left_name);
                struct.setList_h_LEFT_TABLE_ALIAS(l_left_alias);
                struct.setList_h_LEFT_COLUMN(l_left_col);
                struct.setList_h_RIGHT_TABLE_NAME(l_right_name);
                struct.setList_h_RIGHT_TABLE_ALIAS(l_right_alias);
                struct.setList_h_RIGHT_COLUMN(l_right_col);
                struct.setList_h_CONDITION(l_cond);
               }
              
               //-------------------------------------------------------------------------
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
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	private void setScreenMoveParams(Hashtable params, AZ0050010Control control)
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
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	private void setScreenCommonParams(Hashtable params, AZ0050010Control control)
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
	 * @param control AZ0050010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;

		try {
			// 初期処理
			CoreTools.initialize(request);

			// ログファイルの初期化
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
			logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                               objMessage.m_writer.write( Level.ALL, "AZ0050010"+" $Revision: 1.14 $" );
                               control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AZ0050010Controlクラスインスタンス
	 * @return 移動先のＵＲＬ
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// 画面遷移パラメータの取得
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                              //---------------------------------------------------------------------
                              try {
                            
                               //リロード処理
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
                              //---------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                              //------------------------------------------------------------------
                              try {
                            
                               control.setKeyStruct(struct);
                            
                               //読込処理
                               control.control_eventHandller("select");
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                              //------------------------------------------------------------------
                              try {
                            
                               //クリアボタン
                               control.control_eventHandller("clear");
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                            
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickclose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");
		//{{user_implement_dev:<onClickclose>
                              //------------------------------------------------------------------
                              boolean lockStatus = false;    // ロック解除状態
                              try {
                            
                               // 閉じる
                               control.control_eventHandller("close");
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClickclose>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub3clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3clear");
		//{{user_implement_dev:<onClicksub3clear>
                              //------------------------------------------------------------------
                              try {
                            
                               //クリアボタン
                               control.control_eventHandller("sub3clear");
                            
                               // 子画面に遷移
                               nextUrl = "/AZ0050013.jsp";
                            
                              }catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                            
                              }
                              //------------------------------------------------------------------
                //}}user_implement_dev:<onClicksub3clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3clear");

		return nextUrl;
	}

	/**
	 * ＣＳＶ出力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub4csv(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4csv");
		//{{user_implement_dev:<onClicksub4csv>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub4csv");
                               
                               List csvList = control.getCsvList();
                               if(csvList != null && csvList.size() > 0){
                                try{
                                 String filename = CsvWriter.getFileName(request.getRemoteUser());
                                 CsvWriter csvWriter = new CsvWriter(filename);
                                 csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),false);
                                 nextUrl = csvWriter.getUrl(response);//ダウンロード時記述
                            
                                 // ＣＳＶ出力情報ログ表示
                                 String siz = TypeConverter.convert(csvList.size());
                                 
                                 ExpjMessage emsg = new ExpjMessage("ZZ01006", "FILENAME:" + filename); //エラー詳細
                                 control.sysLog.info(emsg, control.getsysUSER_CD());
                                 emsg = new ExpjMessage("ZZ01006", "COUNT:" + siz); //エラー詳細
                                 control.sysLog.info(emsg, control.getsysUSER_CD());
                                          emsg = new ExpjMessage("ZZ01006", "The CSV file was outputted."); //エラー詳細
                                 control.sysLog.info(emsg, control.getsysUSER_CD());
                            
                                }catch(Exception e){
                                 //CSV出力失敗
                                 ExpjException ee = new ExpjException("ZZ01107");
                                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                                 ee.add(emsg);
                                 throw ee;
                                }
                               }
                            
                              }catch(FoundationException e){
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4csv>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4csv");

		return nextUrl;
	}

	/**
	 * 検索実行ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickexecute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickexecute");
		//{{user_implement_dev:<onClickexecute>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               // 検索実行
                               control.control_eventHandller("execute");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // 子画面に遷移
                                nextUrl = "/AZ0050014.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickexecute>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickexecute");

		return nextUrl;
	}

	/**
	 * 検索条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickcondition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcondition");
		//{{user_implement_dev:<onClickcondition>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               // 検索条件設定
                               control.control_eventHandller("condition");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // 子画面に遷移
                                nextUrl = "/AZ0050013.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickcondition>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcondition");

		return nextUrl;
	}

	/**
	 * 検索実行ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub3execute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3execute");
		//{{user_implement_dev:<onClicksub3execute>
                              //------------------------------------------------------------------
                              try {
                               setInput2Struct(request,params,control);
                               //検索実行へ
                               control.control_eventHandller("sub3execute");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050013.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                nextUrl = "/AZ0050014.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3execute>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3execute");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub3return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3return");
		//{{user_implement_dev:<onClicksub3return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub3return");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050013.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3return");

		return nextUrl;
	}

	/**
	 * 検索条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub4condition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4condition");
		//{{user_implement_dev:<onClicksub4condition>
                              try {
                            
                               control.control_eventHandller("sub4condition");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050014.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // 子画面に遷移
                                nextUrl = "/AZ0050013.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4condition>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4condition");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub4return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4return");
		//{{user_implement_dev:<onClicksub4return>
                              //------------------------------------------------------------------
                              try {
                            
                               // 読込処理
                               control.control_eventHandller("sub4return");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050014.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4return");

		return nextUrl;
	}

	/**
	 * 行追加(ＧＵＩ)ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickinsertgui(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertgui");
		//{{user_implement_dev:<onClickinsertgui>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("insertgui");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // テーブル選択画面へ遷移
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickinsertgui>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertgui");

		return nextUrl;
	}

	/**
	 * 行修正(ＧＵＩ)ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickupdategui(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdategui");
		//{{user_implement_dev:<onClickupdategui>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("updategui");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // テーブル選択画面へ遷移
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickupdategui>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdategui");

		return nextUrl;
	}

	/**
	 * 行複写(ＧＵＩ)ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickcopygui(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopygui");
		//{{user_implement_dev:<onClickcopygui>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("copygui");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // テーブル選択画面へ遷移
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickcopygui>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopygui");

		return nextUrl;
	}

	/**
	 * 行追加(フリー)ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickinsertfree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertfree");
		//{{user_implement_dev:<onClickinsertfree>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("insertfree");
                            
                               // フリー入力画面へ遷移
                               nextUrl = "/AZ0050016.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickinsertfree>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertfree");

		return nextUrl;
	}

	/**
	 * 行修正(フリー)ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickupdatefree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdatefree");
		//{{user_implement_dev:<onClickupdatefree>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("updatefree");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // フリー入力画面へ遷移
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickupdatefree>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickupdatefree");

		return nextUrl;
	}

	/**
	 * 行複写(フリー)ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickcopyfree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopyfree");
		//{{user_implement_dev:<onClickcopyfree>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("copyfree");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // フリー入力画面へ遷移
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickcopyfree>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickcopyfree");

		return nextUrl;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               // 読込処理
                               control.control_eventHandller("delete");
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * フリー入力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub1freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1freeSql");
		//{{user_implement_dev:<onClicksub1freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               // 選択テーブルをstructへコピー
                               setSelectTabl2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub1freeSql");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050011.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // フリー入力画面へ遷移
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1freeSql");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub1clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1clear");
		//{{user_implement_dev:<onClicksub1clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub1clear");
                            
                               // 同一画面に遷移
                               nextUrl = "/AZ0050011.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1clear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub1return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1return");
		//{{user_implement_dev:<onClicksub1return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub1return");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050011.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // クエリ一覧画面へ遷移
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1return");

		return nextUrl;
	}

	/**
	 * 前条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub2selectTable(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectTable");
		//{{user_implement_dev:<onClicksub2selectTable>
                              //------------------------------------------------------------------
                              try {
                            
                               // 結合条件をstructへコピー
                               setJoin2Struct(request, params, struct);
                            
                               control.control_eventHandller("sub2selectTable");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050012.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // テーブル選択画面へ遷移
                                nextUrl = "/AZ0050011.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2selectTable>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectTable");

		return nextUrl;
	}

	/**
	 * 次条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub2selectItem(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectItem");
		//{{user_implement_dev:<onClicksub2selectItem>
                              //------------------------------------------------------------------
                              try {
                            
                               // 結合条件をstructへコピー
                               setJoin2Struct(request, params, struct);
                            
                               control.control_eventHandller("sub2selectItem");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050012.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // 対象項目選択画面へ遷移
                                nextUrl = "/AZ0050015.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2selectItem>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2selectItem");

		return nextUrl;
	}

	/**
	 * フリー入力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub2freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2freeSql");
		//{{user_implement_dev:<onClicksub2freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               // 結合条件をstructへコピー
                               setJoin2Struct(request, params, struct);
                            
                               control.control_eventHandller("sub2freeSql");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050012.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // フリー入力画面へ遷移
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2freeSql");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub2clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2clear");
		//{{user_implement_dev:<onClicksub2clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub2clear");
                            
                               // 同一画面に遷移
                               nextUrl = "/AZ0050012.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2clear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub2return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2return");
		//{{user_implement_dev:<onClicksub2return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub2return");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050012.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // クエリ一覧画面へ遷移
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub2return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub2return");

		return nextUrl;
	}

	/**
	 * 次条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub5condition(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5condition");
		//{{user_implement_dev:<onClicksub5condition>
                              //------------------------------------------------------------------
                              try {
                            
                               setSelectItem2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub5condition");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050015.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // 検索条件設定画面へ遷移
                                nextUrl = "/AZ0050013.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5condition>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5condition");

		return nextUrl;
	}

	/**
	 * フリー入力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub5freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5freeSql");
		//{{user_implement_dev:<onClicksub5freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               setSelectItem2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub5freeSql");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050015.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // フリー入力画面へ遷移
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5freeSql");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub5clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5clear");
		//{{user_implement_dev:<onClicksub5clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub5clear");
                            
                               // 同一画面に遷移
                               nextUrl = "/AZ0050015.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5clear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub5return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5return");
		//{{user_implement_dev:<onClicksub5return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub5return");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050015.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // クエリ一覧画面へ遷移
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5return");

		return nextUrl;
	}

	/**
	 * 検索実行ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub6execute(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6execute");
		//{{user_implement_dev:<onClicksub6execute>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub6execute");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050016.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // 検索結果画面へ遷移
                                nextUrl = "/AZ0050014.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub6execute>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6execute");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub6clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6clear");
		//{{user_implement_dev:<onClicksub6clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub6clear");
                            
                               // 同一画面に遷移
                               nextUrl = "/AZ0050016.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub6clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6clear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub6return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6return");
		//{{user_implement_dev:<onClicksub6return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub6return");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050016.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // クエリ一覧画面へ遷移
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub6return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub6return");

		return nextUrl;
	}

	/**
	 * 前条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub3selectItem(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3selectItem");
		//{{user_implement_dev:<onClicksub3selectItem>
                              //------------------------------------------------------------------
                              try {
                            
                               setInput2Struct(request,params,control);
                            
                               control.control_eventHandller("sub3selectItem");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050013.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // 対象項目選択画面へ遷移
                                nextUrl = "/AZ0050015.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3selectItem>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3selectItem");

		return nextUrl;
	}

	/**
	 * クエリ名設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub4inputTitle(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4inputTitle");
		//{{user_implement_dev:<onClicksub4inputTitle>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub4inputTitle");
                            
                               // クエリ名設定画面へ遷移
                               nextUrl = "/AZ0050017.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4inputTitle>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4inputTitle");

		return nextUrl;
	}

	/**
	 * フリー入力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub4freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4freeSql");
		//{{user_implement_dev:<onClicksub4freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub4freeSql");
                            
                               // フリー入力画面へ遷移
                               nextUrl = "/AZ0050016.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub4freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub4freeSql");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub7insert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7insert");
		//{{user_implement_dev:<onClicksub7insert>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7insert");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050017.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // クエリ一覧へ遷移
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7insert>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7insert");

		return nextUrl;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub7update(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7update");
		//{{user_implement_dev:<onClicksub7update>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7update");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050017.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // クエリ一覧へ遷移
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7update>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7update");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub7clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7clear");
		//{{user_implement_dev:<onClicksub7clear>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7clear");
                            
                               // 同一画面に遷移
                               nextUrl = "/AZ0050017.jsp";
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7clear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub7return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7return");
		//{{user_implement_dev:<onClicksub7return>
                              //------------------------------------------------------------------
                              try {
                            
                               control.control_eventHandller("sub7return");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050017.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // クエリ一覧画面へ遷移
                                nextUrl = "/AZ0050010.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub7return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub7return");

		return nextUrl;
	}

	/**
	 * フリー入力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub3freeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3freeSql");
		//{{user_implement_dev:<onClicksub3freeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               setInput2Struct(request,params,control);
                            
                               control.control_eventHandller("sub3freeSql");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050013.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // フリー入力画面へ遷移
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub3freeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub3freeSql");

		return nextUrl;
	}

	/**
	 * フリー入力ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickfreeSql(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickfreeSql");
		//{{user_implement_dev:<onClickfreeSql>
                              //------------------------------------------------------------------
                              try {
                            
                               // 更新対象の構成情報No取得
                               control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
                            
                               control.control_eventHandller("freeSql");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050010.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                // フリー入力画面へ遷移
                                nextUrl = "/AZ0050016.jsp";
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClickfreeSql>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickfreeSql");

		return nextUrl;
	}

	/**
	 * 次条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub1next(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1next");
		//{{user_implement_dev:<onClicksub1next>
                              //------------------------------------------------------------------
                              try {
                            
                               // 選択テーブルをstructへコピー
                               control._table_cnt = setSelectTabl2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub1next");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050011.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                if(control._table_cnt == 1){
                                 // 対象項目選択画面へ遷移
                                 nextUrl = "/AZ0050015.jsp";
                                } else {
                                 // 結合条件設定画面へ遷移
                                 nextUrl = "/AZ0050012.jsp";
                                }
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub1next>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub1next");

		return nextUrl;
	}

	/**
	 * 前条件設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub5prior(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5prior");
		//{{user_implement_dev:<onClicksub5prior>
                              //------------------------------------------------------------------
                              try {
                            
                               setSelectItem2Struct(request,params,struct);
                            
                               control.control_eventHandller("sub5prior");
                            
                               // SQL例外判定フラグをチェックし遷移先の分岐を行う
                               if(control._sqlexception_flg){
                                // SQL例外発生により遷移なし
                                nextUrl = "/AZ0050015.jsp";
                                // フラグクリア
                                control._sqlexception_flg = false;
                               } else {
                                if(control._table_cnt == 1){
                                 // テーブル選択画面へ遷移
                                 nextUrl = "/AZ0050011.jsp";
                                } else {
                                 // 結合条件設定画面へ遷移
                                 nextUrl = "/AZ0050012.jsp";
                                }
                               }
                            
                              } catch(FoundationException e) {
                               ExpjException ee = new ExpjException(e, "ZZ01106");
                               ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                               ee.add(emsg);
                               throw ee;
                              }
                //}}user_implement_dev:<onClicksub5prior>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub5prior");

		return nextUrl;
	}

	/**
	 * 業務グループ設定ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClickgroupset(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickgroupset");
		//{{user_implement_dev:<onClickgroupset>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 更新対象の構成情報No取得
			control.setCheckNumber(new Integer(request.getParameter("r_Btn")));
			control.control_eventHandller("groupset");
			nextUrl = "/AZ0050018.jsp";
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickgroupset>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClickgroupset");

		return nextUrl;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub8Insert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8Insert");
		//{{user_implement_dev:<onClicksub8Insert>
			// TODO: ユーザ定義のコードを記述してください
		try {
            // 選択テーブルをstructへコピー
            setSelectGroup2Struct(request,params,struct);
			nextUrl = "/AZ0050010.jsp";
			control.control_eventHandller("sub8Insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksub8Insert>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8Insert");

		return nextUrl;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub8clear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8clear");
		//{{user_implement_dev:<onClicksub8clear>
			// TODO: ユーザ定義のコードを記述してください
		try {
			nextUrl = "/AZ0050018.jsp";
			control.control_eventHandller("sub8clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksub8clear>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8clear");

		return nextUrl;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 * @param request HttpRequestクラスインスタンス
	 * @param response HttpResponseクラスインスタンス
	 * @param so HttpSessionクラスインスタンス
	 * @param params Hashtableクラスインスタンス
	 * @param control AZ0050010Controlクラスインスタンス
	 */
	public String onClicksub8return(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8return");
		//{{user_implement_dev:<onClicksub8return>
			// TODO: ユーザ定義のコードを記述してください
		try {
			nextUrl = "/AZ0050010.jsp";
			control.control_eventHandller("sub8return");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksub8return>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"onClicksub8return");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AZ0050010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_QUERY_NAME = ((params.containsKey("w_QUERY_NAME")) ? (String[])params.get("w_QUERY_NAME") : (String[])null);
		String[] w_QUERY_GROUP = ((params.containsKey("w_QUERY_GROUP")) ? (String[])params.get("w_QUERY_GROUP") : (String[])null);
		String[] w_MEMO = ((params.containsKey("w_MEMO")) ? (String[])params.get("w_MEMO") : (String[])null);
		String[] w_CREATED_BY = ((params.containsKey("w_CREATED_BY")) ? (String[])params.get("w_CREATED_BY") : (String[])null);
		String[] w_CREATED_DATE_FROM = ((params.containsKey("w_CREATED_DATE_FROM")) ? (String[])params.get("w_CREATED_DATE_FROM") : (String[])null);
		String[] w_CREATED_DATE_TO = ((params.containsKey("w_CREATED_DATE_TO")) ? (String[])params.get("w_CREATED_DATE_TO") : (String[])null);
		String[] QUERY_NAME = ((params.containsKey("QUERY_NAME")) ? (String[])params.get("QUERY_NAME") : (String[])null);
		String[] QUERY_GROUP = ((params.containsKey("QUERY_GROUP")) ? (String[])params.get("QUERY_GROUP") : (String[])null);
		String[] QUERY_MEMO = ((params.containsKey("QUERY_MEMO")) ? (String[])params.get("QUERY_MEMO") : (String[])null);
		String[] CREATED_BY = ((params.containsKey("CREATED_BY")) ? (String[])params.get("CREATED_BY") : (String[])null);
		String[] CREATED_DATE = ((params.containsKey("CREATED_DATE")) ? (String[])params.get("CREATED_DATE") : (String[])null);
		String[] UPDATED_BY = ((params.containsKey("UPDATED_BY")) ? (String[])params.get("UPDATED_BY") : (String[])null);
		String[] UPDATED_DATE = ((params.containsKey("UPDATED_DATE")) ? (String[])params.get("UPDATED_DATE") : (String[])null);
		String[] sub3COLUMN_TYPE = ((params.containsKey("sub3COLUMN_TYPE")) ? (String[])params.get("sub3COLUMN_TYPE") : (String[])null);
		String[] sub3COND_TYPE = ((params.containsKey("sub3COND_TYPE")) ? (String[])params.get("sub3COND_TYPE") : (String[])null);
		String[] sub3COND_TYPE_name = ((params.containsKey("sub3COND_TYPE_name")) ? (String[])params.get("sub3COND_TYPE_name") : (String[])null);
		String[] sub3COND_TYPE_val = ((params.containsKey("sub3COND_TYPE_val")) ? (String[])params.get("sub3COND_TYPE_val") : (String[])null);
		String[] sub3COND_VALUE1 = ((params.containsKey("sub3COND_VALUE1")) ? (String[])params.get("sub3COND_VALUE1") : (String[])null);
		String[] sub3COND_VALUE2 = ((params.containsKey("sub3COND_VALUE2")) ? (String[])params.get("sub3COND_VALUE2") : (String[])null);
		String[] sub3DISPLAY_FLG = ((params.containsKey("sub3DISPLAY_FLG")) ? (String[])params.get("sub3DISPLAY_FLG") : (String[])null);
		String[] sub3SORT_TYPE = ((params.containsKey("sub3SORT_TYPE")) ? (String[])params.get("sub3SORT_TYPE") : (String[])null);
		String[] sub3SORT_TYPE_name = ((params.containsKey("sub3SORT_TYPE_name")) ? (String[])params.get("sub3SORT_TYPE_name") : (String[])null);
		String[] sub3SORT_TYPE_val = ((params.containsKey("sub3SORT_TYPE_val")) ? (String[])params.get("sub3SORT_TYPE_val") : (String[])null);
		String[] sub3SORTKEY_PRI = ((params.containsKey("sub3SORTKEY_PRI")) ? (String[])params.get("sub3SORTKEY_PRI") : (String[])null);
		String[] sub3TABLE_NAME_COMMENT = ((params.containsKey("sub3TABLE_NAME_COMMENT")) ? (String[])params.get("sub3TABLE_NAME_COMMENT") : (String[])null);
		String[] sub3TABLE_NAME = ((params.containsKey("sub3TABLE_NAME")) ? (String[])params.get("sub3TABLE_NAME") : (String[])null);
		String[] sub3COLUMN_NAME = ((params.containsKey("sub3COLUMN_NAME")) ? (String[])params.get("sub3COLUMN_NAME") : (String[])null);
		String[] sub3COLUMN_NAME_COMMENT = ((params.containsKey("sub3COLUMN_NAME_COMMENT")) ? (String[])params.get("sub3COLUMN_NAME_COMMENT") : (String[])null);
		String[] sub6FREE_SQL = ((params.containsKey("sub6FREE_SQL")) ? (String[])params.get("sub6FREE_SQL") : (String[])null);
		String[] EDIT_TYP = ((params.containsKey("EDIT_TYP")) ? (String[])params.get("EDIT_TYP") : (String[])null);
		String[] EDIT_NAME = ((params.containsKey("EDIT_NAME")) ? (String[])params.get("EDIT_NAME") : (String[])null);

		struct.setw_QUERY_NAME( ((w_QUERY_NAME == null) ? (String)null : w_QUERY_NAME[0]) );
		struct.setList_w_QUERY_NAME(TypeConverter.convert(w_QUERY_NAME));
		struct.setw_QUERY_GROUP( ((w_QUERY_GROUP == null) ? (String)null : w_QUERY_GROUP[0]) );
		struct.setList_w_QUERY_GROUP(TypeConverter.convert(w_QUERY_GROUP));
		struct.setw_MEMO( ((w_MEMO == null) ? (String)null : w_MEMO[0]) );
		struct.setList_w_MEMO(TypeConverter.convert(w_MEMO));
		struct.setw_CREATED_BY( ((w_CREATED_BY == null) ? (String)null : w_CREATED_BY[0]) );
		struct.setList_w_CREATED_BY(TypeConverter.convert(w_CREATED_BY));
		struct.setw_CREATED_DATE_FROM( ((w_CREATED_DATE_FROM == null) ? (String)null : w_CREATED_DATE_FROM[0]) );
		struct.setList_w_CREATED_DATE_FROM(TypeConverter.convert(w_CREATED_DATE_FROM));
		struct.setw_CREATED_DATE_TO( ((w_CREATED_DATE_TO == null) ? (String)null : w_CREATED_DATE_TO[0]) );
		struct.setList_w_CREATED_DATE_TO(TypeConverter.convert(w_CREATED_DATE_TO));
		struct.setQUERY_NAME( ((QUERY_NAME == null) ? (String)null : QUERY_NAME[0]) );
		struct.setList_QUERY_NAME(TypeConverter.convert(QUERY_NAME));
		struct.setQUERY_GROUP( ((QUERY_GROUP == null) ? (String)null : QUERY_GROUP[0]) );
		struct.setList_QUERY_GROUP(TypeConverter.convert(QUERY_GROUP));
		struct.setQUERY_MEMO( ((QUERY_MEMO == null) ? (String)null : QUERY_MEMO[0]) );
		struct.setList_QUERY_MEMO(TypeConverter.convert(QUERY_MEMO));
		struct.setCREATED_BY( ((CREATED_BY == null) ? (String)null : CREATED_BY[0]) );
		struct.setList_CREATED_BY(TypeConverter.convert(CREATED_BY));
		struct.setCREATED_DATE( ((CREATED_DATE == null) ? (String)null : CREATED_DATE[0]) );
		struct.setList_CREATED_DATE(TypeConverter.convert(CREATED_DATE));
		struct.setUPDATED_BY( ((UPDATED_BY == null) ? (String)null : UPDATED_BY[0]) );
		struct.setList_UPDATED_BY(TypeConverter.convert(UPDATED_BY));
		struct.setUPDATED_DATE( ((UPDATED_DATE == null) ? (String)null : UPDATED_DATE[0]) );
		struct.setList_UPDATED_DATE(TypeConverter.convert(UPDATED_DATE));
		struct.setsub3COLUMN_TYPE( ((sub3COLUMN_TYPE == null) ? (String)null : sub3COLUMN_TYPE[0]) );
		struct.setList_sub3COLUMN_TYPE(TypeConverter.convert(sub3COLUMN_TYPE));
		struct.setsub3COND_TYPE( ((sub3COND_TYPE == null) ? (String)null : sub3COND_TYPE[0]) );
		struct.setList_sub3COND_TYPE(TypeConverter.convert(sub3COND_TYPE));
		struct.setsub3COND_TYPE_name( ((sub3COND_TYPE_name == null) ? (String)null : sub3COND_TYPE_name[0]) );
		struct.setList_sub3COND_TYPE_name(TypeConverter.convert(sub3COND_TYPE_name));
		struct.setsub3COND_TYPE_val( ((sub3COND_TYPE_val == null) ? (String)null : sub3COND_TYPE_val[0]) );
		struct.setList_sub3COND_TYPE_val(TypeConverter.convert(sub3COND_TYPE_val));
		struct.setsub3COND_VALUE1( ((sub3COND_VALUE1 == null) ? (String)null : sub3COND_VALUE1[0]) );
		struct.setList_sub3COND_VALUE1(TypeConverter.convert(sub3COND_VALUE1));
		struct.setsub3COND_VALUE2( ((sub3COND_VALUE2 == null) ? (String)null : sub3COND_VALUE2[0]) );
		struct.setList_sub3COND_VALUE2(TypeConverter.convert(sub3COND_VALUE2));
		struct.setsub3DISPLAY_FLG( ((sub3DISPLAY_FLG == null) ? (String)null : sub3DISPLAY_FLG[0]) );
		struct.setList_sub3DISPLAY_FLG(TypeConverter.convert(sub3DISPLAY_FLG));
		struct.setsub3SORT_TYPE( ((sub3SORT_TYPE == null) ? (String)null : sub3SORT_TYPE[0]) );
		struct.setList_sub3SORT_TYPE(TypeConverter.convert(sub3SORT_TYPE));
		struct.setsub3SORT_TYPE_name( ((sub3SORT_TYPE_name == null) ? (String)null : sub3SORT_TYPE_name[0]) );
		struct.setList_sub3SORT_TYPE_name(TypeConverter.convert(sub3SORT_TYPE_name));
		struct.setsub3SORT_TYPE_val( ((sub3SORT_TYPE_val == null) ? (String)null : sub3SORT_TYPE_val[0]) );
		struct.setList_sub3SORT_TYPE_val(TypeConverter.convert(sub3SORT_TYPE_val));
		struct.setsub3SORTKEY_PRI( ((sub3SORTKEY_PRI == null) ? (String)null : sub3SORTKEY_PRI[0]) );
		struct.setList_sub3SORTKEY_PRI(TypeConverter.convert(sub3SORTKEY_PRI));
		struct.setsub3TABLE_NAME_COMMENT( ((sub3TABLE_NAME_COMMENT == null) ? (String)null : sub3TABLE_NAME_COMMENT[0]) );
		struct.setList_sub3TABLE_NAME_COMMENT(TypeConverter.convert(sub3TABLE_NAME_COMMENT));
		struct.setsub3TABLE_NAME( ((sub3TABLE_NAME == null) ? (String)null : sub3TABLE_NAME[0]) );
		struct.setList_sub3TABLE_NAME(TypeConverter.convert(sub3TABLE_NAME));
		struct.setsub3COLUMN_NAME( ((sub3COLUMN_NAME == null) ? (String)null : sub3COLUMN_NAME[0]) );
		struct.setList_sub3COLUMN_NAME(TypeConverter.convert(sub3COLUMN_NAME));
		struct.setsub3COLUMN_NAME_COMMENT( ((sub3COLUMN_NAME_COMMENT == null) ? (String)null : sub3COLUMN_NAME_COMMENT[0]) );
		struct.setList_sub3COLUMN_NAME_COMMENT(TypeConverter.convert(sub3COLUMN_NAME_COMMENT));
		struct.setsub6FREE_SQL( ((sub6FREE_SQL == null) ? (String)null : sub6FREE_SQL[0]) );
		struct.setList_sub6FREE_SQL(TypeConverter.convert(sub6FREE_SQL));
		struct.setEDIT_TYP( ((EDIT_TYP == null) ? (String)null : EDIT_TYP[0]) );
		struct.setList_EDIT_TYP(TypeConverter.convert(EDIT_TYP));
		struct.setEDIT_NAME( ((EDIT_NAME == null) ? (String)null : EDIT_NAME[0]) );
		struct.setList_EDIT_NAME(TypeConverter.convert(EDIT_NAME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AZ0050010.jsp";          // 移動先URLの指定
	public static String JSP_BIND_NAME_Control = "aAZ0050010Control"; // JSP先のバインド名(Control)の指定
	public static String JSP_BIND_NAME_Struct = "aAZ0050010Struct";   // JSP先のバインド名(Struct)の指定
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
					AZ0050010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// 移動先ＵＲＬ
		AZ0050010Entity entity = control.entity;
		AZ0050010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AZ0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AZ0050010Control control;
		AZ0050010Entity  entity = null;
		AZ0050010Struct  struct = null;

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

			if( (control = (AZ0050010Control)so.getAttribute("AZ0050010Control_"+request.getSession(false).getId())) == null ) {
				control = new AZ0050010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AZ0050010Control();
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
				String all_false = "true";
				if( isClick(request, "select") ) {
					if ( !isCryptical(request, so, params, "select") ) return ERROR_TARGET;
					target = onClickselect(request, response, so, params, control);
					control.setButton("select");
					all_false = "false";
				}
				if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
					all_false = "false";
				}
				if( isClick(request, "close") ) {
					if ( !isCryptical(request, so, params, "close") ) return ERROR_TARGET;
					target = onClickclose(request, response, so, params, control);
					control.setButton("close");
					all_false = "false";
				}
				if( isClick(request, "sub3clear") ) {
					if ( !isCryptical(request, so, params, "sub3clear") ) return ERROR_TARGET;
					target = onClicksub3clear(request, response, so, params, control);
					control.setButton("sub3clear");
					all_false = "false";
				}
				if( isClick(request, "sub4csv") ) {
					if ( !isCryptical(request, so, params, "sub4csv") ) return ERROR_TARGET;
					target = onClicksub4csv(request, response, so, params, control);
					control.setButton("sub4csv");
					all_false = "false";
				}
				if( isClick(request, "execute") ) {
					if ( !isCryptical(request, so, params, "execute") ) return ERROR_TARGET;
					target = onClickexecute(request, response, so, params, control);
					control.setButton("execute");
					all_false = "false";
				}
				if( isClick(request, "condition") ) {
					if ( !isCryptical(request, so, params, "condition") ) return ERROR_TARGET;
					target = onClickcondition(request, response, so, params, control);
					control.setButton("condition");
					all_false = "false";
				}
				if( isClick(request, "sub3execute") ) {
					if ( !isCryptical(request, so, params, "sub3execute") ) return ERROR_TARGET;
					target = onClicksub3execute(request, response, so, params, control);
					control.setButton("sub3execute");
					all_false = "false";
				}
				if( isClick(request, "sub3return") ) {
					if ( !isCryptical(request, so, params, "sub3return") ) return ERROR_TARGET;
					target = onClicksub3return(request, response, so, params, control);
					control.setButton("sub3return");
					all_false = "false";
				}
				if( isClick(request, "sub4condition") ) {
					if ( !isCryptical(request, so, params, "sub4condition") ) return ERROR_TARGET;
					target = onClicksub4condition(request, response, so, params, control);
					control.setButton("sub4condition");
					all_false = "false";
				}
				if( isClick(request, "sub4return") ) {
					if ( !isCryptical(request, so, params, "sub4return") ) return ERROR_TARGET;
					target = onClicksub4return(request, response, so, params, control);
					control.setButton("sub4return");
					all_false = "false";
				}
				if( isClick(request, "insertgui") ) {
					if ( !isCryptical(request, so, params, "insertgui") ) return ERROR_TARGET;
					target = onClickinsertgui(request, response, so, params, control);
					control.setButton("insertgui");
					all_false = "false";
				}
				if( isClick(request, "updategui") ) {
					if ( !isCryptical(request, so, params, "updategui") ) return ERROR_TARGET;
					target = onClickupdategui(request, response, so, params, control);
					control.setButton("updategui");
					all_false = "false";
				}
				if( isClick(request, "copygui") ) {
					if ( !isCryptical(request, so, params, "copygui") ) return ERROR_TARGET;
					target = onClickcopygui(request, response, so, params, control);
					control.setButton("copygui");
					all_false = "false";
				}
				if( isClick(request, "insertfree") ) {
					if ( !isCryptical(request, so, params, "insertfree") ) return ERROR_TARGET;
					target = onClickinsertfree(request, response, so, params, control);
					control.setButton("insertfree");
					all_false = "false";
				}
				if( isClick(request, "updatefree") ) {
					if ( !isCryptical(request, so, params, "updatefree") ) return ERROR_TARGET;
					target = onClickupdatefree(request, response, so, params, control);
					control.setButton("updatefree");
					all_false = "false";
				}
				if( isClick(request, "copyfree") ) {
					if ( !isCryptical(request, so, params, "copyfree") ) return ERROR_TARGET;
					target = onClickcopyfree(request, response, so, params, control);
					control.setButton("copyfree");
					all_false = "false";
				}
				if( isClick(request, "delete") ) {
					if ( !isCryptical(request, so, params, "delete") ) return ERROR_TARGET;
					target = onClickdelete(request, response, so, params, control);
					control.setButton("delete");
					all_false = "false";
				}
				if( isClick(request, "sub1freeSql") ) {
					if ( !isCryptical(request, so, params, "sub1freeSql") ) return ERROR_TARGET;
					target = onClicksub1freeSql(request, response, so, params, control);
					control.setButton("sub1freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub1clear") ) {
					if ( !isCryptical(request, so, params, "sub1clear") ) return ERROR_TARGET;
					target = onClicksub1clear(request, response, so, params, control);
					control.setButton("sub1clear");
					all_false = "false";
				}
				if( isClick(request, "sub1return") ) {
					if ( !isCryptical(request, so, params, "sub1return") ) return ERROR_TARGET;
					target = onClicksub1return(request, response, so, params, control);
					control.setButton("sub1return");
					all_false = "false";
				}
				if( isClick(request, "sub2selectTable") ) {
					if ( !isCryptical(request, so, params, "sub2selectTable") ) return ERROR_TARGET;
					target = onClicksub2selectTable(request, response, so, params, control);
					control.setButton("sub2selectTable");
					all_false = "false";
				}
				if( isClick(request, "sub2selectItem") ) {
					if ( !isCryptical(request, so, params, "sub2selectItem") ) return ERROR_TARGET;
					target = onClicksub2selectItem(request, response, so, params, control);
					control.setButton("sub2selectItem");
					all_false = "false";
				}
				if( isClick(request, "sub2freeSql") ) {
					if ( !isCryptical(request, so, params, "sub2freeSql") ) return ERROR_TARGET;
					target = onClicksub2freeSql(request, response, so, params, control);
					control.setButton("sub2freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub2clear") ) {
					if ( !isCryptical(request, so, params, "sub2clear") ) return ERROR_TARGET;
					target = onClicksub2clear(request, response, so, params, control);
					control.setButton("sub2clear");
					all_false = "false";
				}
				if( isClick(request, "sub2return") ) {
					if ( !isCryptical(request, so, params, "sub2return") ) return ERROR_TARGET;
					target = onClicksub2return(request, response, so, params, control);
					control.setButton("sub2return");
					all_false = "false";
				}
				if( isClick(request, "sub5condition") ) {
					if ( !isCryptical(request, so, params, "sub5condition") ) return ERROR_TARGET;
					target = onClicksub5condition(request, response, so, params, control);
					control.setButton("sub5condition");
					all_false = "false";
				}
				if( isClick(request, "sub5freeSql") ) {
					if ( !isCryptical(request, so, params, "sub5freeSql") ) return ERROR_TARGET;
					target = onClicksub5freeSql(request, response, so, params, control);
					control.setButton("sub5freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub5clear") ) {
					if ( !isCryptical(request, so, params, "sub5clear") ) return ERROR_TARGET;
					target = onClicksub5clear(request, response, so, params, control);
					control.setButton("sub5clear");
					all_false = "false";
				}
				if( isClick(request, "sub5return") ) {
					if ( !isCryptical(request, so, params, "sub5return") ) return ERROR_TARGET;
					target = onClicksub5return(request, response, so, params, control);
					control.setButton("sub5return");
					all_false = "false";
				}
				if( isClick(request, "sub6execute") ) {
					if ( !isCryptical(request, so, params, "sub6execute") ) return ERROR_TARGET;
					target = onClicksub6execute(request, response, so, params, control);
					control.setButton("sub6execute");
					all_false = "false";
				}
				if( isClick(request, "sub6clear") ) {
					if ( !isCryptical(request, so, params, "sub6clear") ) return ERROR_TARGET;
					target = onClicksub6clear(request, response, so, params, control);
					control.setButton("sub6clear");
					all_false = "false";
				}
				if( isClick(request, "sub6return") ) {
					if ( !isCryptical(request, so, params, "sub6return") ) return ERROR_TARGET;
					target = onClicksub6return(request, response, so, params, control);
					control.setButton("sub6return");
					all_false = "false";
				}
				if( isClick(request, "sub3selectItem") ) {
					if ( !isCryptical(request, so, params, "sub3selectItem") ) return ERROR_TARGET;
					target = onClicksub3selectItem(request, response, so, params, control);
					control.setButton("sub3selectItem");
					all_false = "false";
				}
				if( isClick(request, "sub4inputTitle") ) {
					if ( !isCryptical(request, so, params, "sub4inputTitle") ) return ERROR_TARGET;
					target = onClicksub4inputTitle(request, response, so, params, control);
					control.setButton("sub4inputTitle");
					all_false = "false";
				}
				if( isClick(request, "sub4freeSql") ) {
					if ( !isCryptical(request, so, params, "sub4freeSql") ) return ERROR_TARGET;
					target = onClicksub4freeSql(request, response, so, params, control);
					control.setButton("sub4freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub7insert") ) {
					if ( !isCryptical(request, so, params, "sub7insert") ) return ERROR_TARGET;
					target = onClicksub7insert(request, response, so, params, control);
					control.setButton("sub7insert");
					all_false = "false";
				}
				if( isClick(request, "sub7update") ) {
					if ( !isCryptical(request, so, params, "sub7update") ) return ERROR_TARGET;
					target = onClicksub7update(request, response, so, params, control);
					control.setButton("sub7update");
					all_false = "false";
				}
				if( isClick(request, "sub7clear") ) {
					if ( !isCryptical(request, so, params, "sub7clear") ) return ERROR_TARGET;
					target = onClicksub7clear(request, response, so, params, control);
					control.setButton("sub7clear");
					all_false = "false";
				}
				if( isClick(request, "sub7return") ) {
					if ( !isCryptical(request, so, params, "sub7return") ) return ERROR_TARGET;
					target = onClicksub7return(request, response, so, params, control);
					control.setButton("sub7return");
					all_false = "false";
				}
				if( isClick(request, "sub3freeSql") ) {
					if ( !isCryptical(request, so, params, "sub3freeSql") ) return ERROR_TARGET;
					target = onClicksub3freeSql(request, response, so, params, control);
					control.setButton("sub3freeSql");
					all_false = "false";
				}
				if( isClick(request, "freeSql") ) {
					if ( !isCryptical(request, so, params, "freeSql") ) return ERROR_TARGET;
					target = onClickfreeSql(request, response, so, params, control);
					control.setButton("freeSql");
					all_false = "false";
				}
				if( isClick(request, "sub1next") ) {
					if ( !isCryptical(request, so, params, "sub1next") ) return ERROR_TARGET;
					target = onClicksub1next(request, response, so, params, control);
					control.setButton("sub1next");
					all_false = "false";
				}
				if( isClick(request, "sub5prior") ) {
					if ( !isCryptical(request, so, params, "sub5prior") ) return ERROR_TARGET;
					target = onClicksub5prior(request, response, so, params, control);
					control.setButton("sub5prior");
					all_false = "false";
				}
				if( isClick(request, "groupset") ) {
					if ( !isCryptical(request, so, params, "groupset") ) return ERROR_TARGET;
					target = onClickgroupset(request, response, so, params, control);
					control.setButton("groupset");
					all_false = "false";
				}
				if( isClick(request, "sub8Insert") ) {
					if ( !isCryptical(request, so, params, "sub8Insert") ) return ERROR_TARGET;
					target = onClicksub8Insert(request, response, so, params, control);
					control.setButton("sub8Insert");
					all_false = "false";
				}
				if( isClick(request, "sub8clear") ) {
					if ( !isCryptical(request, so, params, "sub8clear") ) return ERROR_TARGET;
					target = onClicksub8clear(request, response, so, params, control);
					control.setButton("sub8clear");
					all_false = "false";
				}
				if( isClick(request, "sub8return") ) {
					if ( !isCryptical(request, so, params, "sub8return") ) return ERROR_TARGET;
					target = onClicksub8return(request, response, so, params, control);
					control.setButton("sub8return");
					all_false = "false";
				}
				if( all_false == "true" ) {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AZ0050010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "close") && bFLG_DISCONNECT_close)
				|| (isClick(request, "sub3clear") && bFLG_DISCONNECT_sub3clear)
				|| (isClick(request, "sub4csv") && bFLG_DISCONNECT_sub4csv)
				|| (isClick(request, "execute") && bFLG_DISCONNECT_execute)
				|| (isClick(request, "condition") && bFLG_DISCONNECT_condition)
				|| (isClick(request, "sub3execute") && bFLG_DISCONNECT_sub3execute)
				|| (isClick(request, "sub3return") && bFLG_DISCONNECT_sub3return)
				|| (isClick(request, "sub4condition") && bFLG_DISCONNECT_sub4condition)
				|| (isClick(request, "sub4return") && bFLG_DISCONNECT_sub4return)
				|| (isClick(request, "insertgui") && bFLG_DISCONNECT_insertgui)
				|| (isClick(request, "updategui") && bFLG_DISCONNECT_updategui)
				|| (isClick(request, "copygui") && bFLG_DISCONNECT_copygui)
				|| (isClick(request, "insertfree") && bFLG_DISCONNECT_insertfree)
				|| (isClick(request, "updatefree") && bFLG_DISCONNECT_updatefree)
				|| (isClick(request, "copyfree") && bFLG_DISCONNECT_copyfree)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "sub1freeSql") && bFLG_DISCONNECT_sub1freeSql)
				|| (isClick(request, "sub1clear") && bFLG_DISCONNECT_sub1clear)
				|| (isClick(request, "sub1return") && bFLG_DISCONNECT_sub1return)
				|| (isClick(request, "sub2selectTable") && bFLG_DISCONNECT_sub2selectTable)
				|| (isClick(request, "sub2selectItem") && bFLG_DISCONNECT_sub2selectItem)
				|| (isClick(request, "sub2freeSql") && bFLG_DISCONNECT_sub2freeSql)
				|| (isClick(request, "sub2clear") && bFLG_DISCONNECT_sub2clear)
				|| (isClick(request, "sub2return") && bFLG_DISCONNECT_sub2return)
				|| (isClick(request, "sub5condition") && bFLG_DISCONNECT_sub5condition)
				|| (isClick(request, "sub5freeSql") && bFLG_DISCONNECT_sub5freeSql)
				|| (isClick(request, "sub5clear") && bFLG_DISCONNECT_sub5clear)
				|| (isClick(request, "sub5return") && bFLG_DISCONNECT_sub5return)
				|| (isClick(request, "sub6execute") && bFLG_DISCONNECT_sub6execute)
				|| (isClick(request, "sub6clear") && bFLG_DISCONNECT_sub6clear)
				|| (isClick(request, "sub6return") && bFLG_DISCONNECT_sub6return)
				|| (isClick(request, "sub3selectItem") && bFLG_DISCONNECT_sub3selectItem)
				|| (isClick(request, "sub4inputTitle") && bFLG_DISCONNECT_sub4inputTitle)
				|| (isClick(request, "sub4freeSql") && bFLG_DISCONNECT_sub4freeSql)
				|| (isClick(request, "sub7insert") && bFLG_DISCONNECT_sub7insert)
				|| (isClick(request, "sub7update") && bFLG_DISCONNECT_sub7update)
				|| (isClick(request, "sub7clear") && bFLG_DISCONNECT_sub7clear)
				|| (isClick(request, "sub7return") && bFLG_DISCONNECT_sub7return)
				|| (isClick(request, "sub3freeSql") && bFLG_DISCONNECT_sub3freeSql)
				|| (isClick(request, "freeSql") && bFLG_DISCONNECT_freeSql)
				|| (isClick(request, "sub1next") && bFLG_DISCONNECT_sub1next)
				|| (isClick(request, "sub5prior") && bFLG_DISCONNECT_sub5prior)
				|| (isClick(request, "groupset") && bFLG_DISCONNECT_groupset)
				|| (isClick(request, "sub8Insert") && bFLG_DISCONNECT_sub8Insert)
				|| (isClick(request, "sub8clear") && bFLG_DISCONNECT_sub8clear)
				|| (isClick(request, "sub8return") && bFLG_DISCONNECT_sub8return)
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
	private  static boolean bFLG_DISCONNECT_close = true;
	private  static boolean bFLG_DISCONNECT_sub3clear = true;
	private  static boolean bFLG_DISCONNECT_sub4csv = true;
	private  static boolean bFLG_DISCONNECT_execute = true;
	private  static boolean bFLG_DISCONNECT_condition = true;
	private  static boolean bFLG_DISCONNECT_sub3execute = true;
	private  static boolean bFLG_DISCONNECT_sub3return = true;
	private  static boolean bFLG_DISCONNECT_sub4condition = true;
	private  static boolean bFLG_DISCONNECT_sub4return = true;
	private  static boolean bFLG_DISCONNECT_insertgui = true;
	private  static boolean bFLG_DISCONNECT_updategui = true;
	private  static boolean bFLG_DISCONNECT_copygui = true;
	private  static boolean bFLG_DISCONNECT_insertfree = true;
	private  static boolean bFLG_DISCONNECT_updatefree = true;
	private  static boolean bFLG_DISCONNECT_copyfree = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_sub1freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub1clear = true;
	private  static boolean bFLG_DISCONNECT_sub1return = true;
	private  static boolean bFLG_DISCONNECT_sub2selectTable = true;
	private  static boolean bFLG_DISCONNECT_sub2selectItem = true;
	private  static boolean bFLG_DISCONNECT_sub2freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub2clear = true;
	private  static boolean bFLG_DISCONNECT_sub2return = true;
	private  static boolean bFLG_DISCONNECT_sub5condition = true;
	private  static boolean bFLG_DISCONNECT_sub5freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub5clear = true;
	private  static boolean bFLG_DISCONNECT_sub5return = true;
	private  static boolean bFLG_DISCONNECT_sub6execute = true;
	private  static boolean bFLG_DISCONNECT_sub6clear = true;
	private  static boolean bFLG_DISCONNECT_sub6return = true;
	private  static boolean bFLG_DISCONNECT_sub3selectItem = true;
	private  static boolean bFLG_DISCONNECT_sub4inputTitle = true;
	private  static boolean bFLG_DISCONNECT_sub4freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub7insert = true;
	private  static boolean bFLG_DISCONNECT_sub7update = true;
	private  static boolean bFLG_DISCONNECT_sub7clear = true;
	private  static boolean bFLG_DISCONNECT_sub7return = true;
	private  static boolean bFLG_DISCONNECT_sub3freeSql = true;
	private  static boolean bFLG_DISCONNECT_freeSql = true;
	private  static boolean bFLG_DISCONNECT_sub1next = true;
	private  static boolean bFLG_DISCONNECT_sub5prior = true;
	private  static boolean bFLG_DISCONNECT_groupset = true;
	private  static boolean bFLG_DISCONNECT_sub8Insert = true;
	private  static boolean bFLG_DISCONNECT_sub8clear = true;
	private  static boolean bFLG_DISCONNECT_sub8return = true;

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
		return "com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Servlet";
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
	public AZ0050010Servlet()
	{
		//{{user_implement_dev:<AZ0050010_DisConnect_FLG>
                              // submitボタン押下時コネクションを自動的にcloseするためのフラグ 自動切断時：true（デフォルト）
                              bFLG_DISCONNECT_defaultEvent = true;
                              bFLG_DISCONNECT_select = true;
                              bFLG_DISCONNECT_clear = true;
                              bFLG_DISCONNECT_close = true;
                              bFLG_DISCONNECT_sub3clear = true;
                              bFLG_DISCONNECT_sub4csv = true;
                              bFLG_DISCONNECT_execute = true;
                              bFLG_DISCONNECT_condition = true;
                              bFLG_DISCONNECT_sub3execute = true;
                              bFLG_DISCONNECT_sub3return = true;
                              bFLG_DISCONNECT_sub4condition = true;
                              bFLG_DISCONNECT_sub4return = true;
                              bFLG_DISCONNECT_insertgui = true;
                              bFLG_DISCONNECT_updategui = true;
                              bFLG_DISCONNECT_copygui = true;
                              bFLG_DISCONNECT_insertfree = true;
                              bFLG_DISCONNECT_updatefree = true;
                              bFLG_DISCONNECT_copyfree = true;
                              bFLG_DISCONNECT_delete = true;
                              bFLG_DISCONNECT_sub1next = true;
                              bFLG_DISCONNECT_sub1freeSql = true;
                              bFLG_DISCONNECT_sub1clear = true;
                              bFLG_DISCONNECT_sub1return = true;
                              bFLG_DISCONNECT_sub2selectTable = true;
                              bFLG_DISCONNECT_sub2selectItem = true;
                              bFLG_DISCONNECT_sub2freeSql = true;
                              bFLG_DISCONNECT_sub2clear = true;
                              bFLG_DISCONNECT_sub2return = true;
                              bFLG_DISCONNECT_sub5prior = true;
                              bFLG_DISCONNECT_sub5condition = true;
                              bFLG_DISCONNECT_sub5freeSql = true;
                              bFLG_DISCONNECT_sub5clear = true;
                              bFLG_DISCONNECT_sub5return = true;
                              bFLG_DISCONNECT_sub6execute = true;
                              bFLG_DISCONNECT_sub6clear = true;
                              bFLG_DISCONNECT_sub6return = true;
                              bFLG_DISCONNECT_sub3selectItem = true;
                              bFLG_DISCONNECT_sub4inputTitle = true;
                              bFLG_DISCONNECT_sub4freeSql = true;
                              bFLG_DISCONNECT_sub7insert = true;
                              bFLG_DISCONNECT_sub7update = true;
                              bFLG_DISCONNECT_sub7clear = true;
                              bFLG_DISCONNECT_sub7return = true;
                              bFLG_DISCONNECT_sub3freeSql = true;
                              bFLG_DISCONNECT_freeSql = true;
                              bFLG_DISCONNECT_groupset = true;
                              bFLG_DISCONNECT_sub8Insert = true;
                              bFLG_DISCONNECT_sub8clear = true;
                              bFLG_DISCONNECT_sub8return = true;
                            
                //}}user_implement_dev:<AZ0050010_DisConnect_FLG>

		//{{user_implement_dev:<AZ0050010Servlet>
                               
                //}}user_implement_dev:<AZ0050010Servlet>
	}

	//////////////////////////////

}
