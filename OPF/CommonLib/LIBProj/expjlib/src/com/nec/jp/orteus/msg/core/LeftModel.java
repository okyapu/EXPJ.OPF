/*
 * COPYRIGHT (C) 2003        NEC INFORMATEC SYSTEMS, LTD.
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
  * @(#)  LeftModel.java
  *
  * 履歴
  * EXPJ (2005/03/22) 特殊文字('"など)変換機能追加
  *                   com.nec.jp.orteus.expj.util.Converter クラス使用
  * EXPJ (2005/03/18) 常設メニュー作成（既存修正）とメッセージメニュー（新規）作成機能を分離
  * EXPJ (2005/01/26) JavaDoc修正
  * EXPJ (2004/12/28) プリンタ情報取得処理 追加
  *
  * 2.0.3.4 (2004/12/15),未実装画面のメニュー表示対応
  * 2.0.3.3 (2004/11/24),画面遷移結合対応
  * 2.0.3.2 (2004/03/11),WebSphere5.1用にLeftModel()コンストラクタを追加
  * 2.0.3.1 (2004/02/26),国際化対応
  * 2.0.3.0 (2004/01/26),SQL Server 対応
  * 2.0.2.0 (2003/07/15),makeBusinessMessageCountメソッド修正
  * 2.0.1.0 (2003/07/09),DBType統合処理追加
  * 2.0.0.0 (2003/03/17),CopyRight追加
  *
  * バージョン管理キーワード設定
  * \$Date\$
  * \$Revision\$
  * \$Log\$
  */

package com.nec.jp.orteus.msg.core;

import com.nec.jp.orteus.msg.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.nec.jp.orteus.common.*;
import com.nec.jp.orteus.eo.*;
import com.nec.jp.orteus.util.*;

import com.nec.jp.orteus.xaf.foundation.*;

import com.nec.jp.orteus.xaf.log.*;
import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.util.logging.*;
import com.nec.jp.orteus.msg.util.*;

import javax.servlet.jsp.*;
import java.net.*;

import com.nec.jp.orteus.expj.util.Converter;

/**
 * 左フレームのモデルクラス
 * @author NEC Informatec Systems, Ltd.
 * @date 08/09,2001
 * @since Version 1.0
 * @version Version 1.0
 */
public class LeftModel extends Model
{
	private HttpSession so;
	private MasterCash masterCash = null;
	private String [] m_myBusinessGroupCdList = null;
	private Hashtable m_recvBusinessHash = null;
	private Hashtable m_businessClassHash = null;
	private Hashtable m_parmBusinessHash = null;
	private Hashtable m_businessClassNameHash = null;
	private Hashtable m_shutFlagHash = null;
	private Hashtable m_businessMessageCountHash = null;
	private int m_sendedCount = 0;
	private int m_completedCount = 0;
	private Hashtable m_urlHash = null;
	private String strLocale = null;
	private ResourceBundle rbOrMenuDic = null;

	// EXPJ プリンタ情報
	private Hashtable m_printerDlgFlgHash = null;
	private Hashtable m_msgCdHash = null;
	private Hashtable m_printerTypHash = null;
	private Hashtable m_printerNameHash = null;
	private Hashtable m_printerSeqNoHash = null;

	/**
	 * 画面遷移結合ラインフラグ
	 * @since Version 2.4.2
	 */
	private final static String SCREEN_TRANS_LINE_FLAG = "2";

	/**
	 * コンストラクタ
	 * @since Version 3.0
	 * @return なし
	 * @throws なし
	 */
	public LeftModel() {
	}

	/**
	 * コンストラクタ
	 * @since Version 1.0
	 * @param so セッションオブジェクト
	 * @return なし
	 * @throws なし
	 */
	public LeftModel(HttpSession so) {
		this.so = so;
	}

	/**
	 * リクエストを処理します。
	 * @since Version 1.0
	 * @param request リクエストを指定します。
	 * @throws MessageControlException
	 */
	public void parseRequest(HttpServletRequest request) throws MessageControlException{
		try{
//			CORETools.traceDEBUG("** LeftModel:parseRequest **");

			strLocale = (String)so.getAttribute("LOCALE");
			CoreTools.traceDEBUG("(SBM1223)** LeftModel:parseRequest ** Locale=" + strLocale + "で処理します");
			// デフォルトロケール以外は、リソースバンドルを取得しておく
			if(!CoreTools.getLocale(null).equals(strLocale)) {
				rbOrMenuDic = CoreTools.getResourceBundle("OrteusMenuDic", strLocale);
			}

			masterCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
			if(masterCash == null){
				CoreTools.traceDEBUG("(SBM1224)** LeftModel:parseRequest ** セッションからMasterCashオブジェクトが取得できませんでした");
				masterCash = new MasterCash(strLocale);
				so.setAttribute("MSG_MASTER_CASH",masterCash);
			}
			// パスワード変更日と業務運用日の比較
			if(!chkSaveMonth((String)so.getAttribute("UserId"))) return;
			makeMyBusinessGroupCdList(); //業務グループ一覧を作成
				
			//makeRecvBusissCdListHash();  //業務グループごとの受信業務コード一覧を作成
			makeBusissClassListHash();   //業務グループごとの仕分けグループ一覧を作成
			makeParmBusissCdListHash();  //業務グループごと、仕分けグループごとの常設業務コード一覧を作成
			makeClassInfoHash();         //業務グループごと、仕分けグループごとの仕分け情報（仕分けグループ名、閉フラグ）を作成
			//makeBusinessMessageCount();   //業務ごとの受信メッセージ数を作成
			//makeSendMessageCount();       //送信済みメッセージ数を作成
			//makeCompleteMessageCount();   //完了メッセージ数を作成
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0206");			// リクエスト処理に失敗
			thisMce.setNextException(mce);
			throw thisMce;
		}
	}


	/**
	 * 業務グループＣＤから業務グループ名を取得します。
	 * @since Version 1.0
	 * @param businessGroupCd 業務グループＣＤを指定します。
	 * @return 業務グループ名
	 * @throws なし
	 */
	public String getNameFromBusinessGroupCd(String businessGroupCd){
		String businessGroupName = masterCash.getNameFromBusinessGroupCd(businessGroupCd);
		businessGroupName = Converter.changeSpecialCharacter(businessGroupName);
		return businessGroupName;
	}


	/**
	 * 指定した業務コードから業務名を取得します。
	 * @since Version 1.0
	 * @param businessCd 業務コード
	 * @return 業務名
	 * @throws なし
	 */
	public String getNameFromBusinessCd(String businessCd){
		String businessName = masterCash.getNameFromBusinessCd(businessCd);
		businessName = Converter.changeSpecialCharacter(businessName);
		return businessName;
	}


	/**
	 * ログインユーザの担当業務グループ名一覧を返却します。
	 * @since Version 1.0
	 * @return ログインユーザの担当業務グループ名一覧
	 */
	public String [] getMyBusinessGroupCdList(){
		return m_myBusinessGroupCdList;
	}


	/**
	 * ログインユーザの担当業務グループＣＤ一覧を作成します。
	 * 作成した業務グループＣＤ一覧はハッシュテーブルに保存されます。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeMyBusinessGroupCdList() throws MessageControlException{
		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			ss = new SqlSelect("BELONG_MST");
			ss.addCol("BUSINESS_GROUP_CD");
			ss.addKey("USER_CD",(String)so.getAttribute("UserId"));
			ss.setDistinct(true);
			ss.addOrder("BUSINESS_GROUP_CD");
			ss.execute(conn);
			m_myBusinessGroupCdList = new String[ss.getRowSize()];

			int count = 0;
			while(ss.next()){
				m_myBusinessGroupCdList[count] = ss.getString("BUSINESS_GROUP_CD");
				count++;
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0202");
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0202");
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}catch(Exception e){
				CoreTools.traceDEBUG("(SBM1225)LeftModel.makeMyBusinessGroupCdList:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * ログインユーザの名前を返却します。
	 * @since Version 1.0
	 * @return myName ログインユーザの名前
	 */
	public String getMyName(){
		String myName = masterCash.getNameFromUserCd((String)so.getAttribute("UserId"));
		return myName;
	}


	/**
	 * 受信業務コードの一覧を取得します。
	 * @since Version 1.0
	 * @param businessGroupCd 業務ループコード
	 * @return 受信業務コード一覧
	 */
	public String [] getRecvBusinessCdList(String businessGroupCd){
		String [] recvBusinessList = (String [])m_recvBusinessHash.get(businessGroupCd);
		return recvBusinessList;
	}


	/**
	 * 業務グループごとの受信業務コード一覧のハッシュを作成します。
	 * 作成した業務グループＣＤ一覧はハッシュテーブルに保存されます。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeRecvBusissCdListHash() throws MessageControlException{
		m_recvBusinessHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		SqlSelect ssFlag = null;
		String lineFlag = null;
		String currentBusinessCd = null;
		String [] businessCd = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			// DBTypeを取得し、DISPLAY_ORDERのソート用文字列を作成
			String sortStr = null;
			String dbType = CoreTools.getDBType();
			if (dbType.equals(CoreTools.DBTYPE_DB2) == true) {
				sortStr = "DECIMAL(DISPLAY_ORDER)";
			} else if (dbType.equals(CoreTools.DBTYPE_SQL_SERVER) == true) {
				sortStr = "CAST(DISPLAY_ORDER AS INT)";
			} else {
				sortStr = "TO_NUMBER(DISPLAY_ORDER)";
			}

			for(int i=0;i<m_myBusinessGroupCdList.length;i++){
				ss = new SqlSelect("GROUP_RECV_BUSINESS_MST");
				ss.addCol("BUSINESS_CD");
				ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[i]);
				ss.addOrder("BUSINESS_GROUP_CD");
				// 表示順の修正varcharでorder byしていたものをnumberに修正 2003.01.17 R.Hashimoto
//				ss.addOrder("DISPLAY_ORDER");
				//ss.addOrder("TO_NUMBER(DISPLAY_ORDER)");
				// DBType 統合処理
				ss.addOrder(sortStr);
				ss.execute(conn);

				businessCd = new String[ss.getRowSize()];
				lineFlag = null;
				int count = 0;
				while(ss.next()){
					currentBusinessCd = ss.getString("BUSINESS_CD");

					// 業務関係マスタのラインフラグの確認
					// ラインフラグが '2' の場合、画面遷移結合と判断し、m_recvBusinessHash に追加しない
					ssFlag = new SqlSelect("BUSINESS_RELATION_MST");
					ssFlag.setDistinct(true);
					ssFlag.addCol("LINE_FLAG");
					ssFlag.addKey("BUSINESS_CD_TO", currentBusinessCd);
					ssFlag.execute(conn);

					if(ssFlag.getRowSize() == 1){
						ssFlag.next();
						lineFlag = ssFlag.getString("LINE_FLAG");
					}

					if( (lineFlag != null) && (!SCREEN_TRANS_LINE_FLAG.equals(lineFlag)) ){
						businessCd[count] = currentBusinessCd;
						count++;
					}

					ssFlag.close();
					ssFlag = null;
				}

				String[] businessCdBuff = new String[count];
				System.arraycopy(businessCd, 0, businessCdBuff, 0, count);
				m_recvBusinessHash.put(m_myBusinessGroupCdList[i], businessCdBuff);

				ss.close();
				ss = null;
			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//受信業務コード一覧のハッシュの作成に失敗しました。
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//受信業務コード一覧のハッシュの作成に失敗しました。
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(ssFlag != null){
					ssFlag.close();
					ssFlag = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}catch(Exception e){
				CoreTools.traceDEBUG("(SBM1226)LeftModel.makeRecvBusissCdListHash:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * 常設業務コードの一覧を取得します。
	 * @since Version 1.0
	 * @param businessGroupCd 業務グループコード
	 * @param businessClassCd 仕分けグループコード
	 * @return 常設業務コード一覧
	 */
	public String [] getParmBusinessCdList(String businessGroupCd,String businessClassCd){
		Hashtable businessHash = (Hashtable)m_parmBusinessHash.get(businessGroupCd);
		String [] parmBusinessCd = (String [])businessHash.get(businessClassCd);
		return parmBusinessCd;
	}


	/**
	 * 業務グループコードから仕分けグループコード一覧を取得します。
	 * @since Version 1.0
	 * @param businessGroupCd 業務グループコード
	 * @return 仕分けグループコード一覧
	 */
	public String [] getBusinessClassCdList(String businessGroupCd){
		String [] businessClassList = (String [])m_businessClassHash.get(businessGroupCd);
		return businessClassList;
	}


	/**
	 * 業務グループごとの仕分けグループコード一覧のハッシュを作成します。
	 * 作成した仕分けグループＣＤ一覧はハッシュテーブルに保存されます。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeBusissClassListHash() throws MessageControlException{
		m_businessClassHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			for(int i=0;i<m_myBusinessGroupCdList.length;i++){
				ss = new SqlSelect("BUSINESS_CLASS_MST");
				ss.addCol("BUSINESS_CLASS_CD");
				ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[i]);
				ss.execute(conn);

				String [] businessClassCd = new String[ss.getRowSize()];
				int count = 0;
				while(ss.next()){
					businessClassCd[count] = ss.getString("BUSINESS_CLASS_CD");
					count++;
				}
				m_businessClassHash.put(m_myBusinessGroupCdList[i],businessClassCd);

				ss.close();
				ss = null;
			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//受信業務コード一覧のハッシュの作成に失敗しました。
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//受信業務コード一覧のハッシュの作成に失敗しました。
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1227)LeftModel.makeBusissClassListHash:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * 業務グループごと、仕分けグループごとの常設業務コード一覧のハッシュを作成します。
	 * 作成した業務グループＣＤ一覧はハッシュテーブルに保存されます。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeParmBusissCdListHash() throws MessageControlException{
		m_parmBusinessHash = new Hashtable();
		m_urlHash = new Hashtable();

		// EXPJ プリンタ情報
		m_printerDlgFlgHash = new Hashtable();
		m_msgCdHash = new Hashtable();
		m_printerTypHash = new Hashtable();
		m_printerNameHash = new Hashtable();
		m_printerSeqNoHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			// DBTypeを取得し、ソート用文字列を作成
			String doSortStr = null;
			String snoSortStr = null;
			String dbType = CoreTools.getDBType();
			if (dbType.equals(CoreTools.DBTYPE_DB2) == true) {
				doSortStr = "DECIMAL(DISPLAY_ORDER)";
				snoSortStr = "DECIMAL(SCREEN_NO)";
			} else if (dbType.equals(CoreTools.DBTYPE_SQL_SERVER) == true) {
				doSortStr = "CAST(DISPLAY_ORDER AS INT)";
				snoSortStr = "CAST(SCREEN_NO AS INT)";
			} else {
				doSortStr = "TO_NUMBER(DISPLAY_ORDER)";
				snoSortStr = "TO_NUMBER(SCREEN_NO)";
			}

			Hashtable classHash = null;
			for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
				classHash = new Hashtable();
				String [] businessClassCd = (String [])m_businessClassHash.get(m_myBusinessGroupCdList[groupCount]);
				for(int classCount=0;classCount<businessClassCd.length;classCount++){
					ss = new SqlSelect("GROUP_PARM_BUSINESS_MST");
					ss.addCol("BUSINESS_CD");
					ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[groupCount]);
					ss.addKey("BUSINESS_CLASS_CD",businessClassCd[classCount]);
					// 表示順の修正varcharでorder byしていたものをnumberに修正 2003.01.17 R.Hashimoto
//				    ss.addOrder("DISPLAY_ORDER");
					//ss.addOrder("TO_NUMBER(DISPLAY_ORDER)");
					// DBType統合処理
					ss.addOrder(doSortStr);
					ss.execute(conn);

					String [] businessCd = new String[ss.getRowSize()];
					int count = 0;
					while(ss.next()){
						businessCd[count] = ss.getString("BUSINESS_CD");
						count++;
					}
					classHash.put(businessClassCd[classCount],businessCd);

					ss.close();
					ss = null;

					for(int businessCount=0;businessCount<businessCd.length;businessCount++){
						ss = new SqlSelect("CONDUCT_MST");
						ss.addCol("CONDUCT_CD");
						ss.addKey("BUSINESS_CD",businessCd[businessCount]);
						// 表示順の修正varcharでorder byしていたものをnumberに修正 2003.01.17 R.Hashimoto
//				        ss.addOrder("DISPLAY_ORDER");
						//ss.addOrder("TO_NUMBER(DISPLAY_ORDER)");
						// DBType統合処理
						ss.addOrder(doSortStr);
						ss.execute(conn);

						String [] conductCd = new String[ss.getRowSize()];

						count = 0;
						while(ss.next()){
							conductCd[count] = ss.getString("CONDUCT_CD");
							count++;
						}
						ss.close();
						ss = null;

						Hashtable conductHash = new Hashtable();

						for(int conductCount=0;conductCount<conductCd.length;conductCount++){

							// EXPJ プリンタ情報追加
							String tableString = "(SELECT"
											   + "  USER_MST.USER_CD"
											   + ", SYS_PRINT_PARM.PROGRAM_CD"
											   + ", SYS_PRINT_PARM.PLANT_CD"
											   + ", SYS_PRINT_PARM.PRINTER_DLG_FLG"
											   + ", SYS_PRINT_PARM.MSG_CD"
											   + ", SYS_PRINTERS.SEQ_NO"
											   + ", NVL(SYS_PRINTERS.PRINTER_TYP, 0) PRINTER_TYP"
											   + ", SYS_PRINTERS.PRINTER_NAME "
											   + "FROM SYS_PRINT_PARM,SYS_PRINTERS,USER_MST "
											   + "WHERE SYS_PRINT_PARM.SEQ_NO = SYS_PRINTERS.SEQ_NO(+) "
											   + "AND  SYS_PRINT_PARM.PLANT_CD = USER_MST.PLANT_CD"
											   + ") PRINT_PARM,"
											   + "SCREEN_MST";

							//ss = new SqlSelect("SCREEN_MST");
							ss = new SqlSelect(tableString);

							//ss.addCol("SCREEN_URL");
							ss.addCol("SCREEN_MST.SCREEN_URL");
							ss.addCol("TO_CHAR(PRINT_PARM.PRINTER_DLG_FLG) PRINTER_DLG_FLG");
							ss.addCol("PRINT_PARM.MSG_CD");
							ss.addCol("NVL(TO_CHAR(PRINT_PARM.PRINTER_TYP), '0') PRINTER_TYP");
							ss.addCol("PRINT_PARM.PRINTER_NAME");
							ss.addCol("PRINT_PARM.SEQ_NO");

							//ss.addKey("CONDUCT_CD",conductCd[conductCount]);
							//ss.addKey("BUSINESS_CD",businessCd[businessCount]);
							ss.addKey("SCREEN_MST.CONDUCT_CD",conductCd[conductCount]);
							ss.addKey("SCREEN_MST.BUSINESS_CD",businessCd[businessCount]);
							ss.addKey("PRINT_PARM.USER_CD(+)",(String)so.getAttribute("UserId"));
							ss.addKey("PRINT_PARM.PROGRAM_CD(+) = REPLACE(UPPER(SCREEN_MST.SCREEN_URL), 'SERVLET')");
							// 文字列ソートのために数値型によるソートに修正 2003.06.15 R.Hashimoto
//							ss.addOrder("SCREEN_NO");
							//ss.addOrder("TO_NUMBER(SCREEN_NO)");
							// DBType統合処理
							ss.addOrder(snoSortStr);
							ss.execute(conn);

							if(ss.getRowSize() == 0){
								MessageControlException mce = new MessageControlException("MSG-E0108");
								//画面マスタにレコードが存在しません。
								mce.addDetail("BUSINESS_CD = " + businessCd[businessCount]);
								mce.addDetail("CONDUCT_CD = " + conductCd[conductCount]);
								throw mce;
							}

							String url = ss.getString("SCREEN_URL");
							if (url==null) {
								url="NoDesign.jsp";
							}
							conductHash.put(conductCd[conductCount],url);

							String tempBUSINESS_CD = businessCd[businessCount];

							String printerDlgFlg = ss.getString("PRINTER_DLG_FLG");
							if(printerDlgFlg != null) {
								m_printerDlgFlgHash.put(tempBUSINESS_CD,printerDlgFlg);
							}

							String msgCd = ss.getString("MSG_CD");
							if(msgCd != null) {
								m_msgCdHash.put(tempBUSINESS_CD,msgCd);
							}

							String printerTyp = ss.getString("PRINTER_TYP");
							if(printerTyp != null) {
								m_printerTypHash.put(tempBUSINESS_CD,printerTyp);
							}

							String printerName = ss.getString("PRINTER_NAME");
							if(printerName != null) {
								m_printerNameHash.put(tempBUSINESS_CD,printerName);
							}

							String printerSeqNo = ss.getString("SEQ_NO");
							if(printerSeqNo != null) {
								m_printerSeqNoHash.put(tempBUSINESS_CD,printerSeqNo);
							}

							ss.close();
							ss = null;
						}
						m_urlHash.put(businessCd[businessCount],conductHash);
					}
				}

				m_parmBusinessHash.put(m_myBusinessGroupCdList[groupCount],classHash);

			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0212");
			//常設業務コード一覧のハッシュの作成に失敗しました。
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0212");
			//常設業務コード一覧のハッシュの作成に失敗しました。
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1228)LeftModel.makeParmBusissCdListHash:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * 業務グループごと、仕分けグループごとの仕分けグループ名、閉フラグのハッシュを作成します。
	 * 作成した業務グループＣＤ一覧はハッシュテーブルに保存されます。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeClassInfoHash() throws MessageControlException{
		m_businessClassNameHash = new Hashtable();
		m_shutFlagHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			Hashtable shutHash = null;
			Hashtable nameHash = null;
			String businessClassName = null;
			String strKey = null;
			for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
				shutHash = new Hashtable();
				nameHash = new Hashtable();
				String [] businessClassCd = (String [])m_businessClassHash.get(m_myBusinessGroupCdList[groupCount]);
				for(int classCount=0;classCount<businessClassCd.length;classCount++){
					ss = new SqlSelect("BUSINESS_CLASS_MST");
					ss.addCol("BUSINESS_CLASS_NAME");
					ss.addCol("SHUT_FLAG");
					ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[groupCount]);
					ss.addKey("BUSINESS_CLASS_CD",businessClassCd[classCount]);
					ss.execute(conn);

					if(ss.getRowSize() != 1){
						MessageControlException thisMce = new MessageControlException("MSG-E0213");
						//業務仕分けマスタにレコードが存在しません。
						throw thisMce;
					}

					businessClassName = null;
					strKey = "Orteus.BUSINESS_CLASS_MST.BUSINESS_CLASS_NAME."
						   + m_myBusinessGroupCdList[groupCount] + "_"
						   + businessClassCd[classCount];
					// デフォルトロケールの場合は、DBからデータを取得
					if(CoreTools.getLocale(null).equals(strLocale)) {
						businessClassName = ss.getString("BUSINESS_CLASS_NAME");
					}
					// デフォルトロケール以外は、メニュー用プロパティファイルからデータを取得
					else {
						try {
							businessClassName = CoreTools.getRBString(strKey, rbOrMenuDic);
						} catch(MissingResourceException e) {
							businessClassName = "Not Defined";
							CoreTools.traceDEBUG("LeftModel.makeClassInfoHash() Exception ["+e.toString()+"]");
						}
					}
					String shutFlag = ss.getString("SHUT_FLAG");

					nameHash.put(businessClassCd[classCount],businessClassName);
					shutHash.put(businessClassCd[classCount],shutFlag);

					ss.close();
					ss = null;
				}

				m_businessClassNameHash.put(m_myBusinessGroupCdList[groupCount],nameHash);
				m_shutFlagHash.put(m_myBusinessGroupCdList[groupCount],shutHash);

			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0214");
			//業務仕分け情報の作成に失敗しました。
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0214");
			//業務仕分け情報の作成に失敗しました。
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1229)LeftModel.makeClassInfoHash:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * 指定した仕分けグループコードから仕分けグループ名を取得します。
	 * @since Version 1.0
	 * @param businessGroupCd 業務グループコード
	 * @param businessClassCd 仕分けグループコード
	 * @return 仕分けグループ名
	 */
	public String getNameFromBusinessClassCd(String businessGroupCd,String businessClassCd){
		Hashtable businessHash = (Hashtable)m_businessClassNameHash.get(businessGroupCd);
		String businessClassName = (String)businessHash.get(businessClassCd);
		businessClassName = Converter.changeSpecialCharacter(businessClassName);
		return businessClassName;
	}


	/**
	 * 指定した仕分けグループコードから閉フラグ状態を取得します。
	 * @since Version 1.0
	 * @param businessGroupCd 業務グループコード
	 * @param businessClassCd 仕分けグループコード
	 * @return 閉フラグ状態
	 */
	public boolean getShutFlag(String businessGroupCd,String businessClassCd){
		boolean bShut = false;
		Hashtable businessHash = (Hashtable)m_shutFlagHash.get(businessGroupCd);
		String shutFlag = (String)businessHash.get(businessClassCd);

		if(shutFlag != null && shutFlag.equals("1")){
			bShut = true;
		}

		return bShut;
	}


	/**
	 * 指定した業務グループの受信メッセージ数を取得します。
	 * @since Version 1.0
	 * @param businessGroupCd 業務グループコード
	 * @return 受信メッセージ数
	 */
	public int getGroupMessageCount(String businessGroupCd){
		int count = 0;
		String [] businessCd = getRecvBusinessCdList(businessGroupCd);

		for(int i=0;businessCd != null && i<businessCd.length;i++){
			count = count + getBusinessMessageCount(businessCd[i]);
		}

		return count;
	}


	/**
	 * 指定した業務の受信メッセージ数を取得します。
	 * @since Version 1.0
	 * @param businessCd 業務グループコード
	 * @return 受信メッセージ数
	 */
	public int getBusinessMessageCount(String businessCd){
		int count = 0;

		try{
			String countStr = (String)m_businessMessageCountHash.get(businessCd);
			count = Integer.parseInt(countStr);
		}
		catch(Exception e){
				CoreTools.traceDEBUG("(SBM1230)LeftModel.getBusinessMessageCount:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
		}

		return count;
	}

	/**
	 * 業務ごとの受信メッセージ数を作成します。
	 * MSG_USER_CD が存在する場合は、個人メッセージ数を作成します。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	public void makeBusinessMessageCount() throws MessageControlException{
		// MSG_USER_CD を取得する 2003/07/17 m-kusunoki
		String user = (String)so.getAttribute("MSG_USER_CD");
		CoreTools.traceDEBUG("**** LeftModel makeBusinessMessageCount() user=" + user);

		m_businessMessageCountHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
				String [] businessCd = (String [])m_recvBusinessHash.get(m_myBusinessGroupCdList[groupCount]);
				for(int businessCount=0;businessCount<businessCd.length;businessCount++){
					ss = new SqlSelect("MESSAGES");
					ss.addCol("MESSAGE_ID");
					ss.addKey("BUSINESS_CD",businessCd[businessCount]);
					ss.addKey("LOCK_STATE","<>",Message.LOCK_CANCEL);
					ss.addKey("COMPLETE_FLAG","<>","1");
					ss.addKey("DELETE_FLAG","0");

					// ラインメッセージが存在し、かつ個人の場合、条件を追加する 2003/07/17 m-kusunoki
					if((MessageListModel.isLineMessage(businessCd[businessCount]) == true) && (user != null) && (user.equals("") != true)){
						String addStr = "TRANSMITTING_USER_CD IN (SELECT LINE_MST.USER_CD_FROM FROM LINE_MST, BUSINESS_RELATION_MST WHERE LINE_MST.USER_CD_TO='"
								 + user
								 + "' AND LINE_MST.BUSINESS_CD_FROM=BUSINESS_RELATION_MST.BUSINESS_CD_FROM AND BUSINESS_RELATION_MST.BUSINESS_CD_TO='"
								 + businessCd[businessCount]
								 + "' AND BUSINESS_RELATION_MST.LINE_FLAG='1')";

						ss.addKey(addStr);
					}

					ss.execute(conn);

					m_businessMessageCountHash.put(businessCd[businessCount],"" + ss.getRowSize());
					ss.close();
					ss = null;
				}
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//業務ごとの受信メッセージ数の作成に失敗しました。
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//業務ごとの受信メッセージ数の作成に失敗しました。
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1231)LeftModel.makeBusinessMessageCount:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}

	/**
	 * 送信済みメッセージ数を取得します。
	 * @since Version 1.0
	 * @return 送信済みメッセージ数
	 */
	public int getSendMessageCount(){
		return m_sendedCount;
	}


	/**
	 * 送信済みメッセージ数を作成します。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	public void makeSendMessageCount() throws MessageControlException{
		m_sendedCount = 0;

		String sendedUser = (String)so.getAttribute("MSG_SENDED_USER_CD");
		if(sendedUser == null){
			sendedUser = (String)so.getAttribute("UserId");
		}

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			if(sendedUser.equals("")){
				for(int i=0;i<m_myBusinessGroupCdList.length;i++){
					ss = new SqlSelect("MESSAGES");
					ss.addCol("MESSAGE_ID");
					ss.addKey("TRANSMITTING_GROUP_CD",m_myBusinessGroupCdList[i]);
					ss.addKey("DELETE_FLAG","0");
					ss.execute(conn);

					m_sendedCount = m_sendedCount + ss.getRowSize();

					ss.close();
					ss = null;
				}
			}else{
				ss = new SqlSelect("MESSAGES");
				ss.addCol("MESSAGE_ID");
				ss.addKey("TRANSMITTING_USER_CD",sendedUser);
				ss.addKey("DELETE_FLAG","0");
				ss.execute(conn);

				m_sendedCount = ss.getRowSize();

				ss.close();
				ss = null;
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0216");
			//送信済みメッセージ数の作成に失敗しました。
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0216");
			//送信済みメッセージ数の作成に失敗しました。
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1232)LeftModel.makeSendMessageCount:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * 完了メッセージ数を取得します。
	 * @since Version 1.0
	 * @return 完了メッセージ数
	 */
	public int getCompleteMessageCount(){
		return m_completedCount;
	}


	/**
	 * 完了メッセージ数を作成します。
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	public void makeCompleteMessageCount() throws MessageControlException{
		m_completedCount = 0;

		String completedUser = (String)so.getAttribute("MSG_COMPLETED_USER_CD");
		if(completedUser == null){
			completedUser = (String)so.getAttribute("UserId");
		}

		Hashtable messageCountHash = new Hashtable();
		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			if(completedUser.equals("")){
				for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
					String [] businessCd = getRecvBusinessCdList(m_myBusinessGroupCdList[groupCount]);
					for(int businessCount=0;businessCd != null && businessCount<businessCd.length;businessCount++){
						ss = new SqlSelect("MESSAGES");
						ss.addCol("MESSAGE_ID");
						ss.addKey("BUSINESS_CD",businessCd[businessCount]);
						ss.addKey("LOCK_STATE","<>",Message.LOCK_CANCEL);
						ss.addKey("COMPLETE_FLAG","1");
						ss.addKey("DELETE_FLAG","0");
						ss.execute(conn);

						messageCountHash.put(businessCd[businessCount],"" + ss.getRowSize());

						ss.close();
						ss = null;

					}
				}

				Enumeration enum1 = messageCountHash.elements();
				while(enum1.hasMoreElements()){
					String countStr = (String)enum1.nextElement();
					m_completedCount = m_completedCount + Integer.parseInt(countStr);
				}
			}else{
				ss = new SqlSelect("MESSAGES");
				ss.addCol("MESSAGE_ID");
				ss.addKey("UPDATED_BY",completedUser);
				ss.addKey("COMPLETE_FLAG","1");
				ss.addKey("DELETE_FLAG","0");
				ss.execute(conn);

				m_completedCount = ss.getRowSize();

				ss.close();
				ss = null;
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0217");
			//完了メッセージ数の作成に失敗しました。
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0217");
			//完了メッセージ数の作成に失敗しました。
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1233)LeftModel.makeCompleteMessageCount:データベース操作に失敗しました。");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * 常設業務のURLを取得します。
	 * @since Version 1.0
	 * @param businessCd 業務コード
	 * @return 常設業務のURL
	 */
	public String getUrl(String businessCd/*,String conductCd*/){
		String url = null;
		try{
			Hashtable conductHash = (Hashtable)m_urlHash.get(businessCd);

//			url = (String)conductHash.get(conductCd);
			Enumeration enum1 = conductHash.elements();
			if(enum1.hasMoreElements()){
				url = (String)enum1.nextElement();
			}
		}
		catch(Exception e){
			CoreTools.traceDEBUG("Exception:" + e.toString());
		}

		if(url == null){
//			CORETools.traceDEBUG("LeftModel.getUrl()  businessCd:" + businessCd + " conductCd:" + conductCd + " のときURL取得失敗");
			CoreTools.traceDEBUG("(SBM1234)LeftModel.getUrl()  businessCd:" + businessCd + " のときURL取得失敗");
			url = "";
		}

		return url;
	}

	/**
	 * 指定した業務コードからプリンタダイアログフラグを取得します。
	 * @since Version 1.0
	 * @param businessCd 業務コード
	 * @return プリンタダイアログフラグ
	 */
	public String getPrinterDlgFlgFromBusinessCd(String businessCd){
		String printerDlgFlg = (String)m_printerDlgFlgHash.get(businessCd);
		return printerDlgFlg;
	}

	/**
	 * 指定した業務コードからメッセージコードを取得します。
	 * @since Version 1.0
	 * @param businessCd 業務コード
	 * @return メッセージコード
	 */
	public String getMsgCdFromBusinessCd(String businessCd){
		String msgCd = (String)m_msgCdHash.get(businessCd);
		return msgCd;
	}

	/**
	 * 指定した業務コードからプリンタ種別を取得します。
	 * @since Version 1.0
	 * @param businessCd 業務コード
	 * @return プリンタ種別
	 */
	public String getPrinterTypFromBusinessCd(String businessCd){
		String printerTyp = (String)m_printerTypHash.get(businessCd);
		return printerTyp;
	}

	/**
	 * 指定した業務コードから物理プリンタ名を取得します。
	 * @since Version 1.0
	 * @param businessCd 業務コード
	 * @return 物理プリンタ名
	 */
	public String getPrinterNameFromBusinessCd(String businessCd){
		String printerName = (String)m_printerNameHash.get(businessCd);
		return printerName;
	}

	/**
	 * 指定した業務コードからプリンタ識別番号を取得します。
	 * @since Version 1.0
	 * @param businessCd 業務コード
	 * @return プリンタ識別番号
	 */
	public String getPrinterSeqNoFromBusinessCd(String businessCd){
		String printerSeqNo = (String)m_printerSeqNoHash.get(businessCd);
		return printerSeqNo;
	}

	/**
	 * リクエストを処理して、メッセージ情報部分だけ構築します。
	 * @since Version 1.0
	 * @param request リクエストを指定します。
	 * @throws MessageControlException
	 */
	public void parseMsgRequest(HttpServletRequest request) throws MessageControlException{
		try{
//			CORETools.traceDEBUG("** LeftModel:parseRequest **");

			strLocale = (String)so.getAttribute("LOCALE");
			CoreTools.traceDEBUG("(SBM1223)** LeftModel:parseRequest ** Locale=" + strLocale + "で処理します");
			// デフォルトロケール以外は、リソースバンドルを取得しておく
			if(!CoreTools.getLocale(null).equals(strLocale)) {
				rbOrMenuDic = CoreTools.getResourceBundle("OrteusMenuDic", strLocale);
			}

			masterCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
			if(masterCash == null){
				CoreTools.traceDEBUG("(SBM1224)** LeftModel:parseRequest ** セッションからMasterCashオブジェクトが取得できませんでした");
				masterCash = new MasterCash(strLocale);
				so.setAttribute("MSG_MASTER_CASH",masterCash);
			}
			// パスワード変更日と業務運用日の比較
			if(!chkSaveMonth((String)so.getAttribute("UserId"))) return;
			
			makeMyBusinessGroupCdList(); //業務グループ一覧を作成
			makeRecvBusissCdListHash();  //業務グループごとの受信業務コード一覧を作成
			//makeBusissClassListHash();   //業務グループごとの仕分けグループ一覧を作成
			//makeParmBusissCdListHash();  //業務グループごと、仕分けグループごとの常設業務コード一覧を作成
			//makeClassInfoHash();         //業務グループごと、仕分けグループごとの仕分け情報（仕分けグループ名、閉フラグ）を作成
			makeBusinessMessageCount();   //業務ごとの受信メッセージ数を作成
			makeSendMessageCount();       //送信済みメッセージ数を作成
			makeCompleteMessageCount();   //完了メッセージ数を作成
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0206");			// リクエスト処理に失敗
			thisMce.setNextException(mce);
			throw thisMce;
		}
	}
	/**
	 * パスワード変更日と業務運用日の比較
	 *
	 * @param	IDbConnection	DB接続
	 * @param	userId	ユーザID
	 * 
	 */
	public boolean chkSaveMonth(String userId){
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String pwdUpdate = null;
		String pwdMonth = null;
		String busOprDate = null;
		IDbConnection conn = null;
		// パスワード変更日、業務運用日取得用SQL
		String strUserSQL = "SELECT "
			+ "TO_CHAR(SYS_DATE_CTRL.BUSINESS_OPR_DATE, 'YYYY/MM/DD'), "
			+ "TO_CHAR(USER_MST.PASSWORD_CHG_DATE, 'YYYY/MM/DD') "
			+ "FROM "
			+ "USER_MST,SYS_DATE_CTRL "
			+ "WHERE "
			+ "USER_MST.PLANT_CD = SYS_DATE_CTRL.PLANT_CD " 
			+ "AND USER_MST.USER_CD = ?";		
		// パスワード期限取得用SQL
		String strParamSQL = "SELECT VALUE FROM SYS_PARAMETER WHERE NAME = 'PSW_EFFECT_MONTHS'";

		try{	
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();
			// ログインユーザ情報	
			stmt = conn.getConn().prepareStatement(strUserSQL);
			stmt.setString(1, userId);
			rset = stmt.executeQuery();
			if (rset.next()) {
				busOprDate = rset.getString(1);
				pwdUpdate = rset.getString(2);
			}
			closeResultSet(rset);
			closePreparedStatement(stmt);

			if (busOprDate == null || "".equals(busOprDate)
					|| pwdUpdate == null || "".equals(pwdUpdate))
				return false;

			// パスワード期限の取得
			stmt = conn.getConn().prepareStatement(strParamSQL);
			rset = stmt.executeQuery();
			if (rset.next())
				pwdMonth = rset.getString(1);
			if (pwdMonth == null || "".equals(pwdMonth))
				return false;

			// パスワード変更日 ＋ パスワード期限 > 業務運用日のチャック
			if ("0".equals(pwdMonth) || checkDate(pwdUpdate, busOprDate, Integer.parseInt(pwdMonth)) >= 0)
				return true;

		}catch(Exception e){			
			CoreTools.traceDEBUG("LeftModel.chkSaveMonth:SQLException");
			CoreTools.traceDEBUG(e.toString());
			return false;
		}finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closeConn(conn);
		}
		return false;
	}
	/**
	 * パスワード変更日と業務運用日の比較
	 *
	 * @param	pwdUpdDate	パスワード変更日
	 * @param	strOprDate	業務運用日
	 * @param	month	パスワード期限
	 * 
	 */
	public static int checkDate(String pwdUpdDate, String strOprDate,
			int month) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		Date busOprDate = null;
		try {
			cal.setTime(dateFormat.parse(pwdUpdDate));
			// 業務運用日
			busOprDate = dateFormat.parse(strOprDate);
		} catch (ParseException e) {
			e.printStackTrace();
			CoreTools.traceDEBUG("LeftModel.checkDate:ParseException");
			CoreTools.traceDEBUG(e.toString());
		}
		cal.add(cal.MONTH, month);
		// パスワード変更日 + パスワード期限
		Date pwdUpdate = cal.getTime();
		
		return pwdUpdate.compareTo(busOprDate);
	}

	/**
	 * リザルトセットを閉じる
	 *
	 * @param	resultset	閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if(resultset == null)  return;
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}


	/**
	 * プリペアドステートメントを閉じる
	 *
	 * @param	statement	閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if(statement == null)  return;
		try{
			statement.close();
			statement = null;
		}
		catch (SQLException e){}
	}
	/**
	 * リザルトセットを閉じる
	 *
	 * @param	resultset	閉じる対象のリザルトセット
	 */
	private void closeConn(IDbConnection conn)
	{
		if(conn != null){
			try {
				conn.commit();
			} catch (FoundationException e) {
			}
			CoreTools.closeTransConnection(conn);
			conn = null;
		}
	}
}
