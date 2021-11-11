package com.nec.jp.orteus.metamorBase.AA0010;

import java.sql.SQLException;
import java.util.List;

import com.nec.jp.orteus.expj.mstappr.MstItemControlApprIF;
import com.nec.jp.orteus.expj.mstappr.MstItemStructApprIF;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.MessageStruct;
import com.nec.jp.orteus.metamorBase.AA0010.AA0010010Control;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;

public class AA0010010ControlAppr extends AA0010010Control implements
		MstItemControlApprIF {

	public AA0010010ControlAppr() throws BusinessProcessException,
			FoundationException {
		super();
	}

	/**
	 * ���b�Z�[�W�X�g���N�g�쐬
	 */
	public void createMsgStruct() {
		super.createMsgStruct();
	}

	/**
	 * �V�X�e�����O
	 * @param systemLog
	 */
	public void setSysLog(SystemLog systemLog) {
		super.setSysLog(systemLog);
	}

	/** 
	 * �V�X�e���g�p�̃��[�U�R�[�h
	 * @param sysUSER_CD
	 */
	public void setsysUSER_CD(String sysUSER_CD) {
		super.setsysUSER_CD(sysUSER_CD);
	}

	/**
	 * DB�ڑ�����
	 * @param conn
	 */
	public void setConn(IDbConnection conn) {
		super.setConn(conn);
	}

	/**
	 * ���X�g�̃Z�b�g
	 * @param list
	 */
	public void setList(List list) {
		super.setList(list);
	}

	/**
	 * Struct�̃Z�b�g
	 * @param struct
	 */
	public void setStruct(MstItemStructApprIF struct) {
		super.setStruct(struct);
	}

	/**
	 * ���b�Z�[�W�X�g���N�g�擾
	 * @param struct
	 */
	public MessageStruct getMsgStruct() {
		return super.getMsgStruct();
	}

	/**
	 * �o�^�`�F�b�N
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public boolean insertCheck() throws SQLException, FoundationException {
		return super.insertCheck();
	}

	/**
	 * �X�V�`�F�b�N
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public boolean updateCheck() throws SQLException, FoundationException {
		return super.updateCheck();
	}

	/**
	 * �폜�`�F�b�N
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public boolean deleteCheck() throws SQLException, FoundationException {
		return super.deleteCheck();
	}

}
