//------------------------------------------------------------------------------
// (#)BusinessMessageAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/29 �V�K�쐬 K.Matsumoto
// 2003/06/24 OrteusStudio�o�[�W�����A�b�v�ɔ����C�� Y.Inada
//            �O�FdoConnection[ver1.00.03]
//            ��FIDbConnection[ver1.00.05]
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/07/29 �R���s���[�^����p�~�B�H��R�[�h��ǉ� K.Matsumoto
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.BusinessMessage;

import java.sql.Timestamp;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageException;

/**
 * �Ɩ����b�Z�[�W�̓o�^�A�폜���s���A�N�Z�b�T�N���X�B<BR>
 *
 * @author  K.Matsumoto
 * @version 1.00
 */
public class BusinessMessageAccessor
{
	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public BusinessMessageAccessor(){}

	/**
	 * �������B
	 * @param connect �R�l�N�V����
	 */
	public void init(IDbConnection connect) {
		_connect = connect;
	}

	/**
	 * �Ɩ����b�Z�[�W�̒ǉ����s���B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 */
	public void add(BusinessMessage message) throws SQLException
	{
		PreparedStatement getDataStatment = null;
		PreparedStatement insertDataStatment = null;
		ResultSet resultMessage = null;

		try{
			// �Ɩ����b�Z�[�W��`�e�[�u�������p��SQL�쐬
			getDataStatment =
					_connect.getConn().prepareStatement(_getMessageSql);
			getDataStatment.setString(1, message.getMessageCode());

			// SQL���s
			resultMessage = getDataStatment.executeQuery();

			// �Ɩ����b�Z�[�W�e�[�u���ǉ��p��SQL�쐬
			insertDataStatment =
					_connect.getConn().prepareStatement(_insertSql);
			insertDataStatment.setString(1, message.getLogCode());
			insertDataStatment.setString(2, message.getPlantCode());
			insertDataStatment.setString(3, message.getBusinessName());
			insertDataStatment.setString(4, message.getMessageCode());
			insertDataStatment.setString(6, message.getData());
			// insertDataStatment.setTimestamp(
			// 		7, new Timestamp(System.currentTimeMillis()));
			insertDataStatment.setString(7, message.getUser());
			if(resultMessage.next() == true) {
				insertDataStatment.setString(5, resultMessage.getString(1));
			}else{
				insertDataStatment.setString(5,
					"(SBM0616)�Ɩ����b�Z�[�W�ԍ��ɊY�����郁�b�Z�[�W�����݂��܂���");
			}

			// SQL���s
			insertDataStatment.executeUpdate();

		} finally {
			if (resultMessage != null) {
				try {
					resultMessage.close();
				} catch (SQLException e) {}
			}

			if (getDataStatment != null) {
				try {
					getDataStatment.close();
				} catch (SQLException e) {}
			}

			if (insertDataStatment != null) {
				try {
					insertDataStatment.close();
				} catch (SQLException e) {}
			}
		}
	}

	/**
	 * �Ɩ����b�Z�[�W���擾����B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 */
	public ArrayList get(String plant) throws SQLException
	{
		ArrayList list = new ArrayList(0);		// ���b�Z�[�W�i�[�p
		PreparedStatement stmt = null;			// �X�e�[�g�����g
		ResultSet rset = null;					// ���U���g�Z�b�g

		try{
			// �Ɩ����b�Z�[�W�e�[�u�������p��SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(_selectBusinessSql);
			stmt.setString(1, plant);

			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				BusinessMessage msg = new BusinessMessage();
				msg.setLogCode(rset.getString(1));
				msg.setPlantCode(rset.getString(2));
				msg.setBusinessOperatingName(rset.getString(3));
				msg.setMessageCode(rset.getString(4));
				msg.setMessage(rset.getString(5));
				msg.setData(rset.getString(6));
				if(rset.getTimestamp(7) != null){
					msg.setCheckDate(
							new Date(rset.getTimestamp(7).getTime()));
				}
				if(rset.getTimestamp(8) != null){
					msg.setGenerateDate(
							new Date(rset.getTimestamp(8).getTime()));
				}
				msg.setUser(rset.getString(9));
				list.add(msg);
			}
			return list;

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

	/**
	 * �Ɩ����b�Z�[�W���擾����B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 */
	public ArrayList get(String plant, String user) throws SQLException
	{
		ArrayList list = new ArrayList(0);		// ���b�Z�[�W�i�[�p
		PreparedStatement stmt = null;			// �X�e�[�g�����g
		ResultSet rset = null;					// ���U���g�Z�b�g

		try{
			// �Ɩ����b�Z�[�W�e�[�u�������p��SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(_selectPlantBusinessSql);
			stmt.setString(1, user);
			stmt.setString(2, plant);

			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				BusinessMessage msg = new BusinessMessage();
				msg.setLogCode(rset.getString(1));
				msg.setPlantCode(rset.getString(2));
				msg.setBusinessOperatingName(rset.getString(3));
				msg.setMessageCode(rset.getString(4));
				msg.setMessage(rset.getString(5));
				msg.setData(rset.getString(6));
				if(rset.getTimestamp(7) != null){
					msg.setCheckDate(
							new Date(rset.getTimestamp(7).getTime()));
				}
				if(rset.getTimestamp(8) != null){
					msg.setGenerateDate(
							new Date(rset.getTimestamp(8).getTime()));
				}
				msg.setUser(rset.getString(9));
				list.add(msg);
			}
			return list;

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

	/**
	 * �Ɩ����b�Z�[�W���m�F����B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 */
	public void confirm(String logcd, String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// �X�e�[�g�����g

		try{
			// �Ɩ����b�Z�[�W�e�[�u���m�F�p��SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(_updateBusinessSql);
			// stmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
			stmt.setString(1, user);
			stmt.setString(2, logcd);
			stmt.setString(3, plant);

			// SQL���s
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * �Ɩ����b�Z�[�W���m�F����B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 */
	public void confirmAll(String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// �X�e�[�g�����g

		try{
			// �Ɩ����b�Z�[�W�e�[�u���m�F�p��SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(_updateAllBusinessSql);
			// stmt.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
			stmt.setString(1, user);
			stmt.setString(2, plant);

			// SQL���s
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * �Ɩ����b�Z�[�W���폜����B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 */
	public void delete(String logcd, String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// �X�e�[�g�����g

		try{
			// �Ɩ����b�Z�[�W�e�[�u���m�F�p��SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(_deleteBusinessSql);
			stmt.setString(1, user);
			stmt.setString(2, logcd);
			stmt.setString(3, plant);

			// SQL���s
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * �Ɩ����b�Z�[�W���폜����B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 */
	public void deleteAll(String plant, String user) throws SQLException
	{
		PreparedStatement stmt = null;			// �X�e�[�g�����g

		try{
			// �Ɩ����b�Z�[�W�e�[�u���m�F�p��SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(_deleteAllBusinessSql);
			stmt.setString(1, user);
			stmt.setString(2, plant);

			// SQL���s
			stmt.executeQuery();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}

	/**
	 * �����Ԃ��o�߂����Ɩ����b�Z�[�W���폜����B
	 * @throws SQLException
	 *          DB�A�N�Z�X���ɉ��炩�ُ̈킪���������ꍇ
	 * @throws BusinessMessageException
	 *          �ێ����ԃe�[�u���ɋƖ����b�Z�[�W�ێ����ԃ��R�[�h��
     *          ���݂��Ȃ��ꍇ
	 */
	public void cleanup() throws SQLException, BusinessMessageException
	{
		PreparedStatement getDataStatment = null;
		PreparedStatement deleteDataStatment = null;
		ResultSet resultData = null;

		try {
			// �ێ����ԃe�[�u�������p��SQL�쐬
			getDataStatment =
					_connect.getConn().prepareStatement(_getPeriodSql);
			// SQL���s
			resultData = getDataStatment.executeQuery();

			if (resultData.next() == true) {
				// �Ɩ����b�Z�[�W�e�[�u���폜�p��SQL�쐬
				deleteDataStatment =
						_connect.getConn().prepareStatement(_cleanUpSql);

				deleteDataStatment.setInt(1, resultData.getInt(1));
				deleteDataStatment.setTimestamp(
						2, new java.sql.Timestamp(System.currentTimeMillis()));

				// SQL���s
				deleteDataStatment.executeUpdate();

			} else {
				throw new BusinessMessageException();
			}
		} finally {
			if (getDataStatment != null) {
				try {
					getDataStatment.close();
				} catch (SQLException e) {}
			}
			if (resultData != null){
				try{
					resultData.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				resultData = null;
			}
			if (deleteDataStatment != null){
				try{
					deleteDataStatment.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				deleteDataStatment = null;
			}
		}
	}

	/** �R�l�N�V���� */
	private IDbConnection _connect = null;

	/** �Ɩ����b�Z�[�W��`�e�[�u��--�����p��SQL */
	private String _getMessageSql =
			"select MSG from SYS_BUSINESS_MESSAGE where MSG_CD = ?";

	/** �Ɩ����b�Z�[�W�e�[�u��--�ǉ��p��SQL */
	private String _insertSql =
			"insert into SYS_MSG_LOG " +
			"(LOG_CD," +
			" PLANT_CD," +
			" BUSINESS_NAME," +
			" MSG_CD," +
			" MSG," +
			" DATA_STRING," +
			" CONFIRM_DATE," +
			" CREATED_DATE," +
			" CREATED_BY," +
			" CREATED_PRG_NM," +
			" UPDATED_DATE," +
			" UPDATED_BY," +
			" UPDATED_PRG_NM) " +
			"values" +
			"(?, ?, ?, ?, ?, ?, NULL," +
			" sysdate, ?, 'BusinessMessage', sysdate," +
			" 'SYSTEM', 'BusinessMessage')";

	/** �Ɩ����b�Z�[�W�e�[�u��--�����p��SQL */
	private String _selectBusinessSql =
			"select " +
				"LOG_CD," +
				"PLANT_CD," +
				"BUSINESS_NAME," +
				"MSG_CD," +
				"MSG," +
				"DATA_STRING," +
				"CONFIRM_DATE," +
				"CREATED_DATE," +
				"CREATED_BY " +
			"from " +
				"SYS_MSG_LOG " +
			"where " +
				"PLANT_CD = ? " +
			"order by " +
				"CREATED_DATE ASC";

	/** �Ɩ����b�Z�[�W�e�[�u��--�����p��SQL */
	private String _selectPlantBusinessSql =
			"select " +
				"LOG_CD," +
				"PLANT_CD," +
				"BUSINESS_NAME," +
				"MSG_CD," +
				"MSG," +
				"DATA_STRING," +
				"CONFIRM_DATE," +
				"CREATED_DATE," +
				"CREATED_BY " +
			"from " +
				"SYS_MSG_LOG " +
			"where " +
				"CREATED_BY = ? and " +
				"PLANT_CD = ? " +
			"order by " +
				"CREATED_DATE ASC";

	/** �Ɩ����b�Z�[�W�e�[�u��--�X�V�p��SQL */
	private String _updateBusinessSql =
			"update " +
				"SYS_MSG_LOG " +
			"set " +
				"CONFIRM_DATE = sysdate, " +
				"UPDATED_DATE = sysdate, " +
				"UPDATED_BY = 'SYSTEM' " +
			"where " +
				"CREATED_BY = ? and " +
				"LOG_CD = ? and " +
				"PLANT_CD = ? and " +
				"CONFIRM_DATE is null";

	/** �Ɩ����b�Z�[�W�e�[�u��--�X�V�p��SQL */
	private String _updateAllBusinessSql =
			"update " +
				"SYS_MSG_LOG " +
			"set " +
				"CONFIRM_DATE = sysdate, " +
				"UPDATED_DATE = sysdate, " +
				"UPDATED_BY = 'SYSTEM' " +
			"where " +
				"CREATED_BY = ? and " +
				"PLANT_CD = ? and " +
				"CONFIRM_DATE is null";

	/** �Ɩ����b�Z�[�W�e�[�u��--�폜�p��SQL */
	private String _deleteBusinessSql =
			"delete from " +
				"SYS_MSG_LOG " +
			"where " +
				"CREATED_BY = ? and " +
				"LOG_CD = ? and " +
				"PLANT_CD = ? and " +
				"NOT CONFIRM_DATE is null";

	/** �Ɩ����b�Z�[�W�e�[�u��--�폜�p��SQL */
	private String _deleteAllBusinessSql =
			"delete from " +
				"SYS_MSG_LOG " +
			"where " +
				"CREATED_BY = ? and " +
				"PLANT_CD = ? and " +
				"NOT CONFIRM_DATE is null";

	/** �Ɩ����b�Z�[�W�e�[�u��--�폜�p��SQL */
	private String _cleanUpSql =
			"delete from SYS_MSG_LOG where " +
			"ADD_MONTHS(CREATED_DATE, ?) < ?";

	/** �ێ����ԃe�[�u��--�����p��SQL */
	private String _getPeriodSql =
			"select MNT_PERIOD from SYS_MNT_PERIOD " +
			"where MNT_DATA_TYP = 6";

}
