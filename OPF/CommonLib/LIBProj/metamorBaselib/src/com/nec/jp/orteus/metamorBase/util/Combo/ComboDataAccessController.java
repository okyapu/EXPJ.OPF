//------------------------------------------------------------------------------
// (#)ComboDataAccessController.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 2003/05/22 �V�K�쐬 Y.Inada
// 2003/06/24 OrteusStudio�o�[�W�����A�b�v�ɔ����C�� Y.Inada
//            �O�FdoConnection[ver1.00.03]
//            ��FIDbConnection[ver1.00.05]
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (C) 2003 NEC INFORMATEC SYSTEMS, LTD.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/06/27 �f�[�^�擾�p��SQL�̏C��
//            �O�FDISPLAY_VALUE
//            ��FDISPLAY_NAME
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Combo;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboStruct;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboException;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * �R���{�{�b�N�X�f�[�^���擾����ׂ̃��[�e�B���e�B�N���X�B<BR>
 * �f�[�^���擾(getData)����O�ɃR�l�N�V�����̐ݒ�����Ă����Ȃ���΂Ȃ�Ȃ��B
 *
 * @author  Y.Inada
 * @version 1.00
 */
public class ComboDataAccessController
{
	/** DB�A�N�Z�X�p�̃R�l�N�V���� */
	private IDbConnection _conn = null;

	/** �f�[�^�擾�p��SQL */
	private String _selectSql = 
		"select SYS_TYPE_VALUE.\"VALUE\",SYS_TYPE_VALUE.\"DISPLAY_NAME\""
		+"from SYS_TYPE_VALUE "
		+"where "
		+"  SYS_TYPE_VALUE.\"NAME\" = ?"
		+"order by SYS_TYPE_VALUE.VALUE";

	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public ComboDataAccessController(){}

	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����B
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public ComboDataAccessController(IDbConnection connect){_conn = connect;}


	/**
	 * �R�l�N�V�����ݒ�B<BR>
	 * �R�l�N�V�����̎Q�Ƃ𖳌��ɂ���ꍇ�A������null��ݒ肷�邱�ƁB
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public void setConnection(IDbConnection connect){_conn = connect;}


	/**
	 * �w�肳�ꂽ�L�[�̃R���{�{�b�N�X�f�[�^���擾����B
	 *
	 * @param  key �擾�L�[
	 * @return �擾�����R���{�{�b�N�X�f�[�^�B
	 *         �f�[�^�͏����Ɋi�[����Ă���B
	 * @throws SQLException
     *         SQL�̔��s�Ɏ��s�����ꍇ
	 * @throws ComboException
     *         �����������ʂ�0���̏ꍇ
	 */
	public ComboStruct getData(String key) throws SQLException, ComboException
	{
		ComboStruct rCombo = new ComboStruct();		// �R���{�{�b�N�X�f�[�^
		PreparedStatement stmt = null;				// �X�e�[�g�����g
		ResultSet rset = null;						// ���U���g�Z�b�g

		try{
			// SQL�쐬
			stmt = (_conn.getConn()).prepareStatement(_selectSql);
			stmt.setString(1, key);
		
			// SQL���s
			rset = stmt.executeQuery();
		
			// ���ʂ�ݒ�
			while(rset.next()){
				String val = new String(rset.getString(1));
				String explan = new String(rset.getString(2));
				rCombo.addData(val, explan);
			}
			
			// �擾�f�[�^��0�ȉ��̏ꍇ�A��O����
			if(rCombo.size() <= 0){ throw new ComboException(); }

			return rCombo;
		
		}finally{
			if(rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}
}

