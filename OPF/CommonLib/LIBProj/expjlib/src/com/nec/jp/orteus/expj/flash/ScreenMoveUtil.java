/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/flash/ScreenMoveUtil.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.flash;

import com.nec.jp.orteus.util.CoreTools;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.util.FoundationException;

import java.util.ResourceBundle;
import javax.servlet.http.HttpSession;
import java.util.MissingResourceException;

import com.nec.jp.orteus.expj.util.Converter;

/**
 * 画面情報取得クラス<br>
 * <br>
 * 画面名と業務IDを取得します。<br>
 * 業務IDが特定できない場合は最小値を取得します。<br>
 * 業務IDが取得できない場合は画面名のみ取得し、業務IDには画面IDをセットします。<br>
 * 業務ID・画面名共に取得出来ない場合は両者に画面IDをセットします。<br>
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2013/06/27 02:04:11 $
*/

public class ScreenMoveUtil {

	protected String servletName = null;
	protected String screenID = "";
	protected String screenName = "";

	/**
	 * 画面名プロパティファイル
	 */
	private static ResourceBundle _menuDic = null;

	/**
	 * ロケール
	 */
	private static String _locale = null;

	/**
	 * コンストラクタ（多言語非対応）
	 *
	 * @param  servletName サーブレット名
	 * @throws FoundationException servletName が null の場合
	 */
	public ScreenMoveUtil(String servletName)
			throws FoundationException {
		if (servletName == null) {
			throw new FoundationException("ScreenMoveUtil","コンストラクタ","(SBM0865) 引数が不正です。");
		}
		this.servletName = servletName;

		String query = "select SCREEN_MST.BUSINESS_CD, SCREEN_MST.SCREEN_NAME"
					 + " from SCREEN_MST, GROUP_PARM_BUSINESS_MST"
					 + " where SCREEN_MST.SCREEN_URL = ?"
					 + "   and SCREEN_MST.BUSINESS_CD = GROUP_PARM_BUSINESS_MST.BUSINESS_CD"
					 + " order by SCREEN_MST.BUSINESS_CD";

		String query2 = "select SCREEN_NAME"
					  + " from SYS_OBJECTS"
					  + " where SYS_OBJECTS.SCREEN_ID = ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try{
			conn = CoreTools.getDefaultConnection().getConn();
			stmt = conn.prepareStatement(query);
			stmt.setString(1, this.servletName);
			rs = stmt.executeQuery();

			if (rs.next()){
				this.screenID = rs.getString("BUSINESS_CD");
				this.screenName = rs.getString("SCREEN_NAME");
			}
			else {
				if (this.servletName.length() > 8) {
					String bisinessID = this.servletName.substring(0, this.servletName.length() - 7);
					this.screenID = bisinessID;
					this.screenName = bisinessID;

					stmt = conn.prepareStatement(query2);
					stmt.setString(1, bisinessID);
					try {
						rs = stmt.executeQuery();
						if (rs.next()) {
							this.screenName = rs.getString("SCREEN_NAME");
						}
					}
					catch (SQLException e) { }
				}
			}
		}catch( Exception e ){
			e.printStackTrace();
			throw new FoundationException("ScreenMoveUtil","コンストラクタ","(SBM0871) レコード検索に失敗しました。");
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
					conn = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			catch (Exception e) {}
		}
	}


	/**
	 * コンストラクタ（多言語対応）
	 *
	 * @param  servletName サーブレット名
	 * @param  so HttpSession
	 * @throws FoundationException servletName が null の場合
	 */
	public ScreenMoveUtil(String servletName, HttpSession so)
			throws FoundationException {
		if (servletName == null) {
			throw new FoundationException("ScreenMoveUtil","コンストラクタ","(SBM0865) 引数が不正です。");
		}
		this.servletName = servletName;

		String query = "select SCREEN_MST.BUSINESS_CD, SCREEN_MST.SCREEN_NAME"
					 + " from SCREEN_MST, GROUP_PARM_BUSINESS_MST"
					 + " where SCREEN_MST.SCREEN_URL = ?"
					 + "   and SCREEN_MST.BUSINESS_CD = GROUP_PARM_BUSINESS_MST.BUSINESS_CD"
					 + " order by SCREEN_MST.BUSINESS_CD";

		String query2 = "select SCREEN_NAME"
					  + " from SYS_OBJECTS"
					  + " where SYS_OBJECTS.SCREEN_ID = ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// 多言語対応
		String strDefaultLocale = CoreTools.getLocale(null); // DefaultLocale
		String strLocale = (String)so.getAttribute("LOCALE"); // UserLocale

		try{
			conn = CoreTools.getDefaultConnection().getConn();
			stmt = conn.prepareStatement(query);
			stmt.setString(1, this.servletName);
			rs = stmt.executeQuery();

			if (rs.next()){
				this.screenID = rs.getString("BUSINESS_CD");
				this.screenName = rs.getString("SCREEN_NAME");

				// 多言語対応
				if (!strDefaultLocale.equals(strLocale)) {
					this.screenName = getProperty("Orteus.BUSINESS_MST.BUSINESS_NAME." + this.screenID, strLocale);
				}
			}
			else {
				if (this.servletName.length() > 8) {
					String bisinessID = this.servletName.substring(0, this.servletName.length() - 7);
					this.screenID = bisinessID;
					this.screenName = bisinessID;

					stmt = conn.prepareStatement(query2);
					stmt.setString(1, bisinessID);
					try {
						rs = stmt.executeQuery();
						if (rs.next()) {
							this.screenName = rs.getString("SCREEN_NAME");

							// 多言語対応
							if (!strDefaultLocale.equals(strLocale)) {
								this.screenName = getProperty("Orteus.BUSINESS_MST.BUSINESS_NAME." + this.screenID, strLocale);
							}
						}
					}
					catch (SQLException e) { }
				}
			}
		}catch( Exception e ){
			e.printStackTrace();
			throw new FoundationException("ScreenMoveUtil","コンストラクタ","(SBM0871) レコード検索に失敗しました。");
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
					conn = null;
				}
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			catch (Exception e) {}
		}
	}

	/**
	 * 画面名を取得します。
	 *
	 * @return 画面名
	 */
	public String getScreenName() {
		screenName = Converter.changeSpecialCharacter(screenName);
		return this.screenName;
	}

	/**
	 * 業務IDを取得します。
	 *
	 * @return 業務ID
	 */
	public String getScreenID() {
		return this.screenID;
	}

	/**
	 * メニュー定義ファイル("OrteusMenuDic")から指定された画面コードの画面名を取得します。<br>
	 * 該当画面名が見つからない場合は"No Name(画面コード,言語コード)"を返します。<br>
	 *
	 * @param code 画面コード（業務コード or 画面ID）
	 * @param locale 言語コード
	 * @return 画面名
	 */
	static synchronized String getProperty(String code, String locale) {

		String val = "No Name(" + code + ", " + locale + ")";

		try {
			if ((_locale == null) || !(_locale.equals(locale))) {
				_locale = locale;
				_menuDic = CoreTools.getResourceBundle("OrteusMenuDic", locale);
			}
		} catch (MissingResourceException e) {
			return val;
		}

		try {
			val = _menuDic.getString(code);
		} catch (MissingResourceException e) {
			return val;
		}

		return val;
	}
}
