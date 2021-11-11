/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/combobox/ComboBox.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.combobox;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.nec.jp.orteus.util.CoreTools;
import java.util.ResourceBundle;
import java.util.MissingResourceException;

/**
 * �R���{�{�b�N�X�f�[�^���擾����ׂ̃��[�e�B���e�B�N���X�B<BR>
 * �f�[�^���擾(getData)����O�ɃR�l�N�V�����̐ݒ�����Ă��������B
 *
 * @see ComboException
 * @see ComboStruct
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:51 $
 */
public class ComboBox {

	/**
	 * DB�A�N�Z�X�p�̃R�l�N�V����
	 */
	private IDbConnection _conn = null;

	/**
	 * �f�[�^�擾�p��SQL
	 */
	private String _selectSql =
		"select SYS_TYPE_VALUE.\"VALUE\",SYS_TYPE_VALUE.\"DISPLAY_NAME\""
		+"from SYS_TYPE_VALUE "
		+"where "
		+"  SYS_TYPE_VALUE.\"NAME\" = ?"
		+"order by SYS_TYPE_VALUE.VALUE";

	/**
	 * �R���{�����v���p�e�B�t�@�C��
	 */
	private ResourceBundle _comboExplan = null;

	/**
	 * �V�X�e���f�t�H���g���P�[��
	 */
	private String _strDefaultLocale = CoreTools.getLocale(null);

	/**
	 * ���[�U���P�[��
	 */
	private String _strLocale = CoreTools.getLocale(null);

	/**
	 * �I�u�W�F�N�g���\�z���܂��B
	 */
	public ComboBox(){
	}

	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z���܂��B
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public ComboBox(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z���܂��B<BR>
	 * ���[�UCD�Ń��P�[�����m�肵�܂��B
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param  userCd ���[�UCD
	 */
	public ComboBox(IDbConnection connect, String userCd){
		_conn = connect;
		_strLocale = CoreTools.getLocale(userCd);
	}

	/**
	 * �R�l�N�V�����ݒ�B<BR>
	 * �R�l�N�V�����̎Q�Ƃ𖳌��ɂ���ꍇ�A������null��ݒ肵�Ă��������B
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public void setConnection(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * ���P�[���Z�b�g<BR>
	 *
	 * @param locale ����R�[�h
	 */
	public void setLocale(String locale){
		_strLocale = locale;
	}

	/**
	 * �w�肳�ꂽ�L�[�̃R���{�{�b�N�X�f�[�^���擾���܂��B<BR>
	 *
	 * @param  key �擾�L�[
	 * @return �擾�����R���{�{�b�N�X�f�[�^�B�f�[�^�͏����Ɋi�[����Ă��܂��B
	 * @throws SQLException SQL�̔��s�Ɏ��s�����ꍇ
	 * @throws ComboException �����������ʂ�0���̏ꍇ
	 */
	public ComboStruct getData(String key)
			throws SQLException, ComboException
	{
		ComboStruct rCombo = new ComboStruct();	// �R���{�{�b�N�X�f�[�^
		PreparedStatement stmt = null;			// �X�e�[�g�����g
		ResultSet rset = null;					// ���U���g�Z�b�g

		try{
			// SQL�쐬
			stmt = (_conn.getConn()).prepareStatement(_selectSql);
			stmt.setString(1, key);

			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ�ݒ�
			while (rset.next()){
				String val = new String(rset.getString(1));
				String explan = new String(rset.getString(2));

				// ������Ή�
				if (!_strDefaultLocale.equals(_strLocale)) {
					explan = getProperty(key, val, _strLocale);
				}

				rCombo.addData(val, explan);
			}

			// �擾�f�[�^��0�ȉ��̏ꍇ�A��O����
			if (rCombo.size() <= 0){
				throw new ComboException();
			}

			return rCombo;

		}finally{
			if (rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if (stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * �R���{��`�t�@�C��("ExpjCombo")����w�肳�ꂽ�R���{�f�[�^�̐������擾���܂��B<br>
	 * �Y�����������������Ȃ��ꍇ��"No Explanation(key, val, local)"��Ԃ��܂��B<br>
	 *
	 * @param key �R���{�f�[�^�擾�L�[
	 * @param val �R���{�f�[�^�l
	 * @param locale ����R�[�h
	 * @return ����
	 */
	private String getProperty(String key, String val, String locale) {

		String explan = "No Name(" + key + ", " + val + ", " + locale + ")";

		try {
			if (_comboExplan == null) {
				_comboExplan = CoreTools.getResourceBundle("ExpjCombo", locale);
			}
		} catch (MissingResourceException e) {
			return explan;
		}

		try {
			explan = _comboExplan.getString(key + "." + val);
		} catch (MissingResourceException e) {
			return explan;
		}

		return explan;
	}
}

