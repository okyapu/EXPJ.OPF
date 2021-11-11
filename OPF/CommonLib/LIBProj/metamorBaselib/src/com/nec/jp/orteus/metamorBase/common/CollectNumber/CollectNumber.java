/**
 *(#)CollectNumber.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/07/29
 * @version 1.00
 * History 2003/07/29 �V�K�쐬 S.Takahashi
 * @version 1.01
 * History 2003/08/01 �p�b�P�[�W���̕ύX S.Takahashi
 * @version 1.02
 * History 2003/08/06 S.Takahashi
 * �E��ƌv��ԍ��A��Ǝw���ԍ��A�����ԍ��A�o�Ɏw���ԍ��A���o�ɔԍ��A�o�������єԍ��̍̔ԏ�����ǉ��B
 * �E���׎��ʔԍ��A�v�掯�ʔԍ��A�L���x���ԍ��A�ϑ��`�[�ԍ��̍̔ԏ�����ǉ�
 * �E���Ԃ̔ԍ��̌n�`�F�b�N���\�b�h�̒ǉ�(checkNumber,checkJOB_OD_CD�j
 * @version 1.02
 * History 2003/08/06 S.Takahashi
 * �E���Ԃ̔ԍ��̌n�`�F�b�N�����ύX�B(prefix + �H��R�[�h + �A��)
 * �E�H��R�[�h��1���̏ꍇ�A�H��R�[�h�̑O��"_"��t������
 * �E���Ԃ̔ԍ��̌n�`�F�b�N���\�b�h�i�����ɐ��Ԃ̂݁j�ǉ��B(checkNumber,checkJOB_OD_CD)
 * �E���ԁALOG���ʔԍ��̍̔ԏ�����ǉ�
 * @version 1.03
 * History 2003/08/10 K.Murakami
 * �E���׎��ʔԍ��A�v�掯�ʔԍ��̍̔ԏ�������ύX�A���׍\����ʃL�[�ALOG���ʔԍ��̍̔ԏ�����ǉ��B
 * @version 1.04
 * History 2003/08/13 T.Taniguchi
 * �E�g�p����R�l�N�V�������O�����w�肷��`���ɕύX�B
 * @version 1.05
 * History 2003/08/16 ���Ԃ�Numbering�Ƃ��A���̊g���Ƃ��čč쐬 T.Taniguchi
 */
package com.nec.jp.orteus.metamorBase.common.CollectNumber;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.xaf.util.FoundationException;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * �̔Ԃ��s���N���X
 */
public class CollectNumber extends Numbering {


	/**
	 * �R���X�g���N�^
	 *
	 * @param  collectKey   �̔ԃL�[
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	*/
	public CollectNumber(int collectKey,String userCd,String businessCd,String plantCd) throws FoundationException{
		super(null,collectKey,userCd,businessCd,plantCd);
		this.collectKey = collectKey;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;

		this.readProperty();
	}


	/**
	 * �̔Ԃ����ԍ���ԋp����B�iSP���i�g�p�j
	 *
	 * @return         �̔Ԃ��ꂽ�ԍ���ԋp�A�̔Ԃ���Ȃ������ꍇnull��ԋp
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public String getNo() throws FoundationException{
		String returnNo = null;
		//�����`�F�b�N
		if(collectKey < 1 || collectKey > this.MAX || this.userCd == null || 
			this.businessCd == null || this.plantCd == null || logMode == null || 
			outPutMode == null || outPutPath == null || outPutName == null){
			return null;
		}

		this.resultStatus = null;
		IDbConnection conn = null;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,collectKey,userCd,businessCd,plantCd);
			returnNo = MyNo.getNo();
			this.resultStatus =MyNo.getResultStatus();
			MyNo = null;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}

		return returnNo;
	}


	/**
	 * LOG�o�͏����v���p�e�B�t�@�C������ǂݍ���
	*/
	private void readProperty() throws FoundationException{
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			this.logMode = SystemConfig.getProperty("LOG_MODE",rb);
			this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE",rb);
			this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH",rb);
			this.outPutName = SystemConfig.getProperty("OUTPUT_NAME",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("CollectNumber",mre.getMessage(),"(SBM0854)�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
			fe.setPreviousException(mre);
			throw fe;
		}
	}


	/**
	 * �������ʂ��擾����
	 * @return         �̔Ԍ��ʂ̃X�e�[�^�X���擾
	 */
	public Integer getResultStatus(){
		return this.resultStatus;
	}


	/**
	 * �̔ԑ̌n���`�F�b�N����i����͐��Ԃ̂ݑΉ��j
	 *
	 * @param  collectKey   �̔ԃL�[
	 * @param  plantCd      �H��R�[�h
	 * @param  number       �`�F�b�N�Ώ۔ԍ�
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException
	 */
	public static boolean checkNumber(int collectKey,String plantCd,String number) throws FoundationException{

		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkNumber(conn,collectKey,plantCd,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return true;
	}


	/**
	 * ���ԑ̌n���`�F�b�N����
	 *
	 * @param  plantCd      �H��R�[�h
	 * @param  number       ����
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(String plantCd,String number) throws FoundationException,SQLException{

		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkJOB_OD_CD(conn,plantCd,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return flag;
	} 


	/**
	 * �̔ԑ̌n���`�F�b�N����i����͐��Ԃ̂ݑΉ��j
	 *
	 * @param  collectKey   �̔ԃL�[
	 * @param  number       �`�F�b�N�Ώ۔ԍ�
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException
	 */
	public static boolean checkNumber(int collectKey,String number) throws FoundationException{
		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkNumber(conn,collectKey,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return flag;
	} 


	/**
	 * ���ԑ̌n���`�F�b�N����
	 *
	 * @param  number       ����
	 * @return         �`�F�b�NOK�Ȃ��true�ANG�Ȃ��false
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(String number) throws FoundationException,SQLException{
		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkJOB_OD_CD(conn,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return flag;
	} 
}

