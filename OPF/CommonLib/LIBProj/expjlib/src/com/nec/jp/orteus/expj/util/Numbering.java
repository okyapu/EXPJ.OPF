/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/Numbering.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import com.nec.jp.orteus.xaf.util.FoundationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * �̔Ԃ��s���N���X
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2013/06/27 02:53:18 $
 */
public class Numbering {

	/**
	 * ��ƌv��ԍ��̔ԃL�[
	 */
	static final public int ODR_CD = 1;

	/**
	 * ��Ǝw���ԍ��̔ԃL�[
	 */
	static final public int INST_CD = ODR_CD + 1;

	/**
	 * �����ԍ��̔ԃL�[
	 */
	static final public int PUCH_CD = INST_CD + 1;

	/**
	 * �o�Ɏw���ԍ��̔ԃL�[
	 */
	static final public int ISS_INST_CD = PUCH_CD + 1;

	/**
	 * ���o�ɔԍ��̔ԃL�[
	 */
	static final public int ISSUE_CD = ISS_INST_CD + 1;

	/**
	 * �o�������єԍ��̔ԃL�[
	 */
	static final public int OUT_RSLT_CD = ISSUE_CD + 1;

	/**
	 * ���׎��ʔԍ��̔ԃL�[
	 */
	static final public int LOAD_CD = OUT_RSLT_CD + 1;

	/**
	 * �v�掯�ʔԍ��̔ԃL�[
	 */
	static final public int LOAD_PLAN_CD = LOAD_CD + 1;

	/**
	 * �\����ʃL�[�̔ԃL�[
	 */
	static final public int LOAD_PS_CD = LOAD_PLAN_CD + 1;

	/**
	 * �L���x���ԍ��̔ԃL�[
	 */
	static final public int ONERCONS_CD = LOAD_PS_CD + 1;

	/**
	 * �ϑ��`�[�ԍ��̔ԃL�[
	 */
	static final public int TRANSLIP_CD = ONERCONS_CD + 1;

	/**
	 * ���ԍ̔ԃL�[
	 */
	static final public int JOB_OD_CD = TRANSLIP_CD + 1;

	/**
	 * LOG���ʔԍ��̔ԃL�[
	 */
	static final public int LOG_CD = JOB_OD_CD + 1;

	/**
	 * �I�[�_�f�}���h�ԍ��̔ԃL�[
	 */
	static final public int ODNO = LOG_CD + 1;

	/**
	 * ���Ԉ����Ǘ��ԍ��̔ԃL�[
	 */
	static final public int JOB_OD_ALC_CD = ODNO + 1;

	/**
	 * �N�G���[�ԍ��̔ԃL�[
	 */
	static final public int QUERY_CD = JOB_OD_ALC_CD + 1;

	/**
	 * �O���v��ԍ��̔ԃL�[
	 */
	static final public int EXTERNAL_PLAN_CD = QUERY_CD + 1;

	/**
	 * �o�ד`�[�ԍ��̔ԃL�[
	 */
	static final public int SLIP_CD = EXTERNAL_PLAN_CD + 1;

	/**
	 * �o�׎w���ԍ��̔ԃL�[
	 */
	static final public int SHIP_ODR_NO = SLIP_CD + 1;

	/**
	 * �����ꊇ�o�^�G���[�ԍ��̔ԃL�[
	 */
	static final public int CS_ERROR_CD = SHIP_ODR_NO + 1;

	/**
	 * �ő�
	 */
	static final public int MAX = CS_ERROR_CD;

	protected int collectKey = 0;
	protected String userCd = null;
	protected String businessCd = null;
	protected String plantCd = null;
	protected String logMode = null;
	protected String outPutMode = null;
	protected String outPutPath = null;
	protected String outPutName = null;
	protected Integer resultStatus = null;
	protected SystemLog sysLog = null;
	protected IDbConnection conn = null;

	/**
	 * �R���X�g���N�^
	 * @param  conn         DB�R�l�N�V����
	 * @param  collectKey   �̔ԃL�[
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 */
	public Numbering(IDbConnection conn, int collectKey, String userCd,
					 String businessCd, String plantCd) throws
		FoundationException {
		this.conn = conn;
		this.collectKey = collectKey;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;

		this.readProperty();
	}

	/**
	 * �̔Ԃ����ԍ���ԋp���܂��B�iSP���i�g�p�j
	 *
	 * @return	�̔Ԃ��ꂽ�ԍ���ԋp���܂��B�̔Ԃ���Ȃ������ꍇ�́Anull ��ԋp���܂��B
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public String getNo() throws FoundationException {
		//�����`�F�b�N
		if (collectKey < 1 || collectKey > this.MAX || this.userCd == null ||
			this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd); //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd); //�H��R�[�h
			adapt.setOutString(8); //�̔Ԍ���
			adapt.setOutInteger(9); //�̔Ԍ���

			adapt.execUpdate();

			returnNo = adapt.getOutString(8);
			this.resultStatus = adapt.getOutInteger(9);

		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return returnNo;
	}

	/**
	 * IDbAdapter��ԋp���܂�
	 *
	 * @param  conn IDbConnection
	 * @return	collectKey�ɂ��IDbAdapter���擾
	 * @throws FoundationException
	 */
	private IDbAdapter getAdapt(IDbConnection conn) throws FoundationException {

		//collectKey�ɂ��SP���i�̌Ăяo����؂蕪����
		switch (this.collectKey) {
			case ODR_CD: //��ƌv��
				return conn.getSpAdapter("begin SQLGETNEWODRCD(?,?,?,?,?,?,?,?,?); end;");
			case INST_CD: //��Ǝw��
				return conn.getSpAdapter("begin SQLGETNEWINSTCD(?,?,?,?,?,?,?,?,?); end;");
			case PUCH_CD: //�����ԍ�
				return conn.getSpAdapter("begin SQLGETNEWPUCHCD(?,?,?,?,?,?,?,?,?); end;");
			case ISS_INST_CD: //�o�Ɏw��
				return conn.getSpAdapter("begin SQLGETNEWISSINSTCD(?,?,?,?,?,?,?,?,?); end;");
			case ISSUE_CD: //���o��
				return conn.getSpAdapter("begin SQLGETNEWISSUECD(?,?,?,?,?,?,?,?,?); end;");
			case OUT_RSLT_CD: //�o��������
				return conn.getSpAdapter("begin SQLGETNEWOUTRSLTCD(?,?,?,?,?,?,?,?,?); end;");
			case LOAD_CD: //���׎���
				return conn.getSpAdapter("begin SQLGETNEWLOADCD(?,?,?,?,?,?,?,?,?); end;");
			case LOAD_PLAN_CD: //�v�掯��
				return conn.getSpAdapter("begin SQLGETNEWLOADPLANCD(?,?,?,?,?,?,?,?,?); end;");
			case LOAD_PS_CD: //�v�掯��
				return conn.getSpAdapter("begin SQLGETNEWLOADPSCD(?,?,?,?,?,?,?,?,?); end;");
			case ONERCONS_CD: //�L���x��
				return conn.getSpAdapter("begin SQLGETNEWONERCONSCD(?,?,?,?,?,?,?,?,?); end;");
			case TRANSLIP_CD: //�ϑ��`�[
				return conn.getSpAdapter("begin SQLGETNEWTRANSLIPCD(?,?,?,?,?,?,?,?,?); end;");
			case JOB_OD_CD: //����
				return conn.getSpAdapter("begin SQLGETNEWJOBODRCD(?,?,?,?,?,?,?,?,?); end;");
			case LOG_CD: //LOG���ʔԍ�
				return conn.getSpAdapter("begin SQLGETNEWLOGCD(?,?,?,?,?,?,?,?,?); end;");
			case ODNO: //�I�[�_�f�}���h
				return conn.getSpAdapter("begin SQLGETNEWODNO(?,?,?,?,?,?,?,?,?); end;");
			case JOB_OD_ALC_CD: //���Ԉ���
				return conn.getSpAdapter("begin SQLGETNEWJOBODRALCD(?,?,?,?,?,?,?,?,?); end;");
			case QUERY_CD: //�N�G���[�ԍ�
				return conn.getSpAdapter("begin SQLGETNEWQUERYCD(?,?,?,?,?,?,?,?,?); end;");
			case EXTERNAL_PLAN_CD: //�O���v��ԍ�
				return conn.getSpAdapter("begin SQLGETNEWEXTPLANCD(?,?,?,?,?,?,?,?,?); end;");
			case SLIP_CD: //�o�ד`�[�ԍ�
				return conn.getSpAdapter("begin SQLGETNEWSLIPCD(?,?,?,?,?,?,?,?,?); end;");
			case SHIP_ODR_NO: //�o�׎w���ԍ�
				return conn.getSpAdapter("begin SQLGETNEWSHIPODRNO(?,?,?,?,?,?,?,?,?); end;");
			case CS_ERROR_CD: //�����ꊇ�o�^�G���[�ԍ�
				return conn.getSpAdapter("begin SQLGETNEWCSERRORCD(?,?,?,?,?,?,?,?,?); end;");
			default:
				throw new FoundationException("Numbering", "getAdapt", "(SBM0855)��`����Ă��Ȃ��̔ԃL�[���Z�b�g����܂����B");
		}
	}

	/**
	 * LOG�o�͏����v���p�e�B�t�@�C������ǂݍ��݂܂�
	 */
	private void readProperty() throws FoundationException {
		try {
			ResourceBundle rb = SystemConfig.getBundle();
			this.logMode = SystemConfig.getProperty("LOG_MODE", rb);
			this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE", rb);
			this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH", rb);
			this.outPutName = SystemConfig.getProperty("OUTPUT_NAME", rb);
		}
		catch (MissingResourceException mre) {
			FoundationException fe = new FoundationException("Numbering",
				mre.getMessage(), "(SBM0854)�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
			fe.setPreviousException(mre);
			throw fe;
		}
	}

	/**
	 * �������ʂ��擾���܂�
	 * @return	�̔Ԍ��ʂ̃X�e�[�^�X���擾
	 */
	public Integer getResultStatus() {
		return this.resultStatus;
	}

	/**
	 * �̔ԑ̌n���`�F�b�N���܂��i����͐��Ԃ̂ݑΉ��j
	 *
	 * @param	conn         DB�R�l�N�V����
	 * @param	collectKey   �̔ԃL�[
	 * @param	plantCd      �H��R�[�h
	 * @param	number       �`�F�b�N�Ώ۔ԍ�
	 * @return	�`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException
	 */
	public static boolean checkNumber(IDbConnection conn, int collectKey,
									  String plantCd, String number) throws
		FoundationException {
		if (plantCd == null || number == null) {
			return false;
		}
		try {
			switch (collectKey) {
				case JOB_OD_CD:
					return checkJOB_OD_CD(conn, plantCd, number);
				default:
					throw new FoundationException("Numbering", "checkNumber",
												  "(SBM0856)�̔ԃL�[���s���ł�");
			}
		}
		catch (SQLException e) {
			FoundationException fe = new FoundationException("Numbering",
				"checkNumber", "(SBM0857)�̌n�`�F�b�N����DB�G���[���������܂���");
			fe.setPreviousException(e);
			throw fe;
		}
	}

	/**
	 * ���ԑ̌n���`�F�b�N���܂�
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  plantCd      �H��R�[�h
	 * @param  number       ����
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(IDbConnection conn, String plantCd,
										 String number) throws
		FoundationException, SQLException {
		String query = "select length(JOB_OD_CD) as LENGTH,JOB_OD_CD_PREFIX AS PREFIX from SYS_JOB_ODR_CD_CTRL ";
		query = query + "WHERE PLANT_CD=?";

		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.getConn().prepareStatement(query);
			stmt.setString(1, plantCd);
			rs = stmt.executeQuery();
			if (!rs.next()) {
				return false;
			}
			int strLength = rs.getInt("LENGTH"); //�ԍ��̌���
			String prefix = rs.getString("PREFIX"); //PREFIX

			if (plantCd == null || prefix == null) {
				return false;
			}

			//�H��R�[�h��1���̏ꍇ"_"��t������
			if (plantCd.length() == 1) {
				plantCd = "_" + plantCd;
			}

			//�Ώ۔ԍ��̌����`�F�b�N
			if (number.length() !=
				prefix.length() + plantCd.length() + strLength) {
				return false;
			}

			String numberPrefix = number.substring(0, prefix.length());
			//�v���t�B�b�N�X�`�F�b�N
			if (!prefix.equals(numberPrefix)) {
				return false;
			}

			//�H��R�[�h�`�F�b�N
			int index = prefix.length();
			String numberPlantCd = number.substring(index,
				index + plantCd.length());
			if (!plantCd.equals(numberPlantCd)) {
				return false;
			}
		}
		finally {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		}
		return true;
	}

	/**
	 * �̔ԑ̌n���`�F�b�N���܂��i����͐��Ԃ̂ݑΉ��j
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  collectKey   �̔ԃL�[
	 * @param  number       �`�F�b�N�Ώ۔ԍ�
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException
	 */
	public static boolean checkNumber(IDbConnection conn, int collectKey,
									  String number) throws FoundationException {
		if (number == null) {
			return false;
		}
		try {
			switch (collectKey) {
				case JOB_OD_CD: //����
					return checkJOB_OD_CD(conn, number);
				default:
					throw new FoundationException("Numbering", "checkNumber",
												  "(SBM0856)�̔ԃL�[���s���ł�");
			}
		}
		catch (SQLException e) {
			FoundationException fe = new FoundationException("Numbering",
				"checkNumber", "(SBM0857)�̌n�`�F�b�N����DB�G���[���������܂���");
			fe.setPreviousException(e);
			throw fe;
		}
	}

	/**
	 * ���ԑ̌n���`�F�b�N���܂�
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  number       ����
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(IDbConnection conn, String number) throws
		FoundationException, SQLException {
		String query = "select PLANT_CD,length(JOB_OD_CD) as LENGTH,JOB_OD_CD_PREFIX AS PREFIX from SYS_JOB_ODR_CD_CTRL";

		IDbAdapter adapt = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean checkNumber = false;
		try {
			stmt = conn.getConn().prepareStatement(query);
			rs = stmt.executeQuery();

			while (!checkNumber && rs.next()) {
				String plantCd = rs.getString("PLANT_CD");
				int strLength = rs.getInt("LENGTH"); //�ԍ��̌���
				String prefix = rs.getString("PREFIX"); //PREFIX

				if (plantCd == null || prefix == null) {
					continue;
				}

				//�H��R�[�h��1���̏ꍇ"_"��t������
				if (plantCd.length() == 1) {
					plantCd = "_" + plantCd;
				}

				//�Ώ۔ԍ��̌����`�F�b�N
				if (number.length() !=
					prefix.length() + plantCd.length() + strLength) {
					continue;
				}

				String numberPrefix = number.substring(0, prefix.length());
				//�v���t�B�b�N�X�`�F�b�N
				if (!prefix.equals(numberPrefix)) {
					continue;
				}

				//�H��R�[�h�`�F�b�N
				int index = prefix.length();
				String numberPlantCd = number.substring(index,
					index + plantCd.length());
				if (!plantCd.equals(numberPlantCd)) {
					continue;
				}

				checkNumber = true;
			}
		}
		finally {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		}
		return checkNumber;
	}
}
