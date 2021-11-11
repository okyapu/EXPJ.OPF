package com.nec.jp.orteus.expj.mstappr;

import java.sql.SQLException;
import java.util.List;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.MessageStruct;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

public interface MstItemControlApprIF {
	/**
	 * ���b�Z�[�W�X�g���N�g�쐬
	 */
	public abstract void createMsgStruct();
	
	/**
	 * �V�X�e�����O
	 * @param systemLog
	 */
	public abstract void setSysLog(SystemLog systemLog);
	
	/** 
	 * �V�X�e���g�p�̃��[�U�R�[�h
	 * @param sysUSER_CD
	 */
	public abstract void setsysUSER_CD(String sysUSER_CD);
	
	/**
	 * DB�ڑ�����
	 * @param conn
	 */
	public abstract void setConn(IDbConnection conn);
	
	/**
	 * ���X�g�̃Z�b�g
	 * @param list
	 */
	public abstract void setList(List list);
	
	/**
	 * Struct�̃Z�b�g
	 * @param struct
	 */
	public abstract void setStruct(MstItemStructApprIF struct);
	
	/**
	 * ���b�Z�[�W�X�g���N�g�擾
	 * @param struct
	 */
	public abstract MessageStruct getMsgStruct();
	
	/**
	 * �o�^�`�F�b�N
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public abstract boolean insertCheck()throws SQLException,FoundationException;
	
	/**
	 * �X�V�`�F�b�N
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public abstract boolean updateCheck()throws SQLException,FoundationException;
	
	/**
	 * �폜�`�F�b�N
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public abstract boolean deleteCheck()throws SQLException,FoundationException;
	
}
