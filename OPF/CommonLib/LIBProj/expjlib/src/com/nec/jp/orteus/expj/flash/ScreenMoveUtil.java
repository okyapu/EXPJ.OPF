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
 * ��ʏ��擾�N���X<br>
 * <br>
 * ��ʖ��ƋƖ�ID���擾���܂��B<br>
 * �Ɩ�ID������ł��Ȃ��ꍇ�͍ŏ��l���擾���܂��B<br>
 * �Ɩ�ID���擾�ł��Ȃ��ꍇ�͉�ʖ��̂ݎ擾���A�Ɩ�ID�ɂ͉��ID���Z�b�g���܂��B<br>
 * �Ɩ�ID�E��ʖ����Ɏ擾�o���Ȃ��ꍇ�͗��҂ɉ��ID���Z�b�g���܂��B<br>
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2013/06/27 02:04:11 $
*/

public class ScreenMoveUtil {

	protected String servletName = null;
	protected String screenID = "";
	protected String screenName = "";

	/**
	 * ��ʖ��v���p�e�B�t�@�C��
	 */
	private static ResourceBundle _menuDic = null;

	/**
	 * ���P�[��
	 */
	private static String _locale = null;

	/**
	 * �R���X�g���N�^�i�������Ή��j
	 *
	 * @param  servletName �T�[�u���b�g��
	 * @throws FoundationException servletName �� null �̏ꍇ
	 */
	public ScreenMoveUtil(String servletName)
			throws FoundationException {
		if (servletName == null) {
			throw new FoundationException("ScreenMoveUtil","�R���X�g���N�^","(SBM0865) �������s���ł��B");
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
			throw new FoundationException("ScreenMoveUtil","�R���X�g���N�^","(SBM0871) ���R�[�h�����Ɏ��s���܂����B");
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
	 * �R���X�g���N�^�i������Ή��j
	 *
	 * @param  servletName �T�[�u���b�g��
	 * @param  so HttpSession
	 * @throws FoundationException servletName �� null �̏ꍇ
	 */
	public ScreenMoveUtil(String servletName, HttpSession so)
			throws FoundationException {
		if (servletName == null) {
			throw new FoundationException("ScreenMoveUtil","�R���X�g���N�^","(SBM0865) �������s���ł��B");
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

		// ������Ή�
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

				// ������Ή�
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

							// ������Ή�
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
			throw new FoundationException("ScreenMoveUtil","�R���X�g���N�^","(SBM0871) ���R�[�h�����Ɏ��s���܂����B");
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
	 * ��ʖ����擾���܂��B
	 *
	 * @return ��ʖ�
	 */
	public String getScreenName() {
		screenName = Converter.changeSpecialCharacter(screenName);
		return this.screenName;
	}

	/**
	 * �Ɩ�ID���擾���܂��B
	 *
	 * @return �Ɩ�ID
	 */
	public String getScreenID() {
		return this.screenID;
	}

	/**
	 * ���j���[��`�t�@�C��("OrteusMenuDic")����w�肳�ꂽ��ʃR�[�h�̉�ʖ����擾���܂��B<br>
	 * �Y����ʖ���������Ȃ��ꍇ��"No Name(��ʃR�[�h,����R�[�h)"��Ԃ��܂��B<br>
	 *
	 * @param code ��ʃR�[�h�i�Ɩ��R�[�h or ���ID�j
	 * @param locale ����R�[�h
	 * @return ��ʖ�
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
