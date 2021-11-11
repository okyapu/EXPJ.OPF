/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/arap/ArApNumbering.java,v $
 * 
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 * 
 */
package com.nec.jp.orteus.expj.arap;

import com.nec.jp.orteus.expj.util.SystemConfig;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * <pre>
 * ���|���|�`�[�̓`�[�ԍ��̔Ԃ��s���N���X�ł�
 * �`�[�R���g���[���e�[�u���ɓo�^���Ă���`�[��ނɂ��Ă̂݁A
 * �`�[�ԍ��̔Ԃ������Ȃ����Ƃ��ł��܂�
 * �X�g�A�h�v���V�W�����i(SqlGetSlipCd4ARAP.sql)�𗘗p���Ă��܂��B</pre>
 * <ul type=disc>�@�\����  :
 * <li><pre>(1)������ށ��P�ł������̔Ԃ̏ꍇ�A�������������Ƃ�
 *        �`�[�ԍ����̔Ԃ���`�[�̔ԃR���g���[���}�X�^�̍ŏI�`�[�ԍ����X�V����
 *        �� �`�[�̔ԃR���g���[���}�X�^�����݂���ꍇ�͍ŏI�`�[�ԍ����X�V���
 *           ���݂��Ȃ��ꍇ�̓��R�[�h��ǉ�����</pre>
 *
 * <li><pre>(2)������ށ��O�A�܂��͏�����ށ��P�ł��蓮�̔Ԃ̏ꍇ�A����������
 *        ���Ƃɓ`�[�ԍ��ȊO�̍��ڂ�ʒm����`�[�̔ԃR���g���[���}�X�^��
 *        �ŏI�`�[�ԍ��̍X�V�͍s��Ȃ��(���݁A���T�|�[�g)</pre>
 * </ul>
 * 
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $ $Date: 2014/11/20 01:12:36 $
 *
 */
public class ArApNumbering {
	
	private IDbConnection _conn = null;
	private String _userCd = null;       // ���[�U�R�[�h
	private String _businessCd = null;   // �Ɩ��R�[�h
	private String _plantCd = null;      // �H��R�[�h
	private String _companyCd = null;    // ��ЃR�[�h
	private String _actionTyp = null;    // �������
	private String _slipTyp = null;      // �`�[���
	private String _slipDate  = null;    // �`�[���t
	private String _logMode = null;      // LOG���[�h
	private String _outPutMode = null;   // �o�̓��[�h
	private String _outPutPath = null;   // �o�̓t�@�C���p�X
	private String _outPutName = null;   // �o�̓t�@�C����
	private String _gdate = null;        // �N���x
	private String _numberingcd = null;  // �̔ԃR�[�h
	private String _slipcd = null;       // �ŏI�`�[�ԍ�
	private String _term = null;         // �
	private Integer _resultStatus = null;// ���ʃX�e�[�^�X
	 
	
	/**
	 * �R���X�g���N�^
	 * @param  iConn         DB�R�l�N�V����
	 * @param  iUserCd       ���[�U�R�[�h
	 * @param  iBusinessCd   �Ɩ��R�[�h
	 * @param  iPlantCd      �H��R�[�h
	 * @param  iCompanyCd    ��ЃR�[�h
	 * @param  iActionTyp    �������
	 * @param  iSlipTyp      �`�[���
	 * @param  iSlipDate     �`�[���t
	*/
	public ArApNumbering(IDbConnection iConn,
	                      String iUserCd,
	                      String iBusinessCd,
	                      String iPlantCd,
	                      String iCompanyCd,
	                      String iActionTyp,
	                      String iSlipTyp,
	                      String iSlipDate)
			throws FoundationException {

		_conn = iConn;
		_userCd = iUserCd;
		_businessCd = iBusinessCd;
		_plantCd = iPlantCd;
		_companyCd = iCompanyCd;
		_actionTyp = iActionTyp;
		_slipTyp = iSlipTyp;
		_slipDate = iSlipDate;

		this.readProperty();
	}
	
	/**
	 * �̔Ԃ����ԍ���ԋp���܂��B<br>
	 * (SP���i SqlGetSlipCd4ARAP.sql �g�p�j
	 *
	 * @return	�̔Ԃ��ꂽ�ԍ���ԋp���܂��B�̔Ԃ���Ȃ������ꍇ�́Anull ��ԋp���܂��B
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public String getSlipCd()
			throws FoundationException {
		//�����`�F�b�N
		if (_userCd == null     ||
		    _businessCd == null ||
		    _plantCd == null    ||
		    _actionTyp == null  ||
		    _slipTyp == null    ||
		    _slipDate == null   ||
		    _companyCd == null  ||
		    _logMode == null    ||
		    _outPutMode == null ||
		    _outPutPath == null ||
		    _outPutName == null)  {
				return null;
		}

		_resultStatus = null;
		_slipcd = null;
		IDbAdapter adapt = null;
		
		try{
			adapt = _conn.getSpAdapter("begin SQLGETSLIPCD4ARAP(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
			adapt.setString(1,_logMode);     // LOG���[�h
			adapt.setString(2,_outPutMode);  // �o�̓��[�h
			adapt.setString(3,_outPutPath);  // �o�̓t�@�C���p�X
			adapt.setString(4,_outPutName);  // �o�̓t�@�C����
			adapt.setString(5,_userCd);      // ���[�UID
			adapt.setString(6,_businessCd);  // �Ɩ���
			adapt.setString(7,_plantCd);     // �H��R�[�h
			adapt.setString(8,_companyCd);   // ��ЃR�[�h
			adapt.setString(9,_actionTyp);   // �������
			adapt.setString(10,_slipTyp);    // �`�[���
			adapt.setString(11,_slipDate);   // �`�[���t
			adapt.setOutString(12);          // �N���x
			adapt.setOutString(13);          // �̔ԃR�[�h
			adapt.setOutString(14);          // �ŏI�`�[�ԍ�
			adapt.setOutString(15);          // ����
			adapt.setOutInteger(16);         // �X�e�[�^�X

			adapt.execUpdate();

			_gdate = adapt.getOutString(12);
			_numberingcd = adapt.getOutString(13);
			_slipcd = adapt.getOutString(14);
			_term = adapt.getOutString(15);
			_resultStatus = adapt.getOutInteger(16);

		}finally{
			if (adapt != null){
				adapt.close();
				adapt = null;
			}
		}
		return _slipcd;
	}
	
	
	/**
	 * LOG�o�͏����v���p�e�B�t�@�C������ǂݍ��݂܂�
	*/
	private void readProperty()
			throws FoundationException {
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			_logMode = SystemConfig.getProperty("LOG_MODE",rb);
			_outPutMode = SystemConfig.getProperty("OUTPUT_MODE",rb);
			_outPutPath = SystemConfig.getProperty("OUTPUT_PATH",rb);
			_outPutName = SystemConfig.getProperty("OUTPUT_NAME",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException(
                                        "ArApNumbering",mre.getMessage(),
                                        "Can Not Open PropertyFile(SystemConfig)");
			fe.setPreviousException(mre);
			throw fe;
		}
	}

	/**
	 * �������ʂ��擾���܂�
	 * @return	�̔Ԍ��ʂ̃X�e�[�^�X���擾
	 */
	public Integer getResultStatus() {
		return _resultStatus;
	}	
}