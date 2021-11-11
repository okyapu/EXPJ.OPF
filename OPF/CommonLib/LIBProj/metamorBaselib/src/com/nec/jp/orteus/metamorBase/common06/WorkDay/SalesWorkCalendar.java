/**
 *(#)SalesWorkCalendar.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author T.Taniguchi
 * Date : 2003/12/02
 * @version 1.00
 * History 2003/12/02 WorkCalender���R�s�[���ĐV�K�쐬 T.Taniguchi
 */
package com.nec.jp.orteus.metamorBase.common06.WorkDay;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * �ғ����v�Z���s���N���X
 */
public class SalesWorkCalendar{

	public String userCd = null;
	public String businessCd = null;
	public String plantCd = null;
	public int calenderCd = 0;
	public Date date = null;
	public int margin = 0;
	public boolean moveFlg = false;
	public String logMode = null;
	public String outPutMode = null;
	public String outPutPath = null;
	public String outPutName = null;
	protected Integer resultStatus = null;
	protected SystemLog sysLog = null;
	protected IDbConnection conn = null;


	/**
	 * �R���X�g���N�^
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 * @param  calenderCd   �J�����_�[�R�[�h
	 * @param  date         �Ώۓ��t
	 * @param  margin       ���Z��
	 * @param  moveFlg      �O�|���t���O�i�Ώۓ��t���x���̏ꍇ�ɂ��̓��ȍ~�̏��ғ�������ɂ���(true)�����̓��ȑO�̏��ғ�������ɂ���(false)���j
	 * @throws FoundationException �v���p�e�B�t�@�C���Ǎ����s
	*/
	public SalesWorkCalendar(IDbConnection conn,String userCd,String businessCd,
							String plantCd,int calenderCd,Date date,int margin,boolean moveFlg) throws FoundationException{
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.calenderCd = calenderCd;
		this.date = date;
		this.margin = margin;
		this.moveFlg = moveFlg;

		this.readProperty();
	}


	/**
	 * �R���X�g���N�^
	 *
	 * @param  conn         DB�R�l�N�V����
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 * @param  calenderCd   �J�����_�[�R�[�h
	 * @param  date         �Ώۓ��t
	 * @throws FoundationException �v���p�e�B�t�@�C���Ǎ����s
	*/
	public SalesWorkCalendar(IDbConnection conn,String userCd,String businessCd,
							String plantCd,int calenderCd,Date date) throws FoundationException{
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.calenderCd = calenderCd;
		this.date = date;
		this.margin = 0;
		this.moveFlg = false;

		this.readProperty();
	}


	/**
	 * �Ώۓ��t����Z�o�����ғ������t��ԋp����B�iSP���i�g�p�j
	 *
	 * @return         �Z�o���ꂽ���t��ԋp
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public Date calcDate() throws FoundationException{
		if(this.userCd == null || this.businessCd == null || this.plantCd == null ||  this.date == null){
			return null;
		}
		int moveFlgInt = 0;
		if(this.moveFlg){
			moveFlgInt = 1;
		}

		this.resultStatus = null;
		Date calcDate = null;
		IDbAdapter adapt = null;

		try{
			adapt = conn.getSpAdapter("begin SQLSALESWORKDAYCALC(?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
			adapt.setString(1,this.logMode);//LOG���[�h
			adapt.setString(2,this.outPutMode);//�o�̓��[�h
			adapt.setString(3,this.outPutPath);//�o�̓t�@�C���p�X
			adapt.setString(4,this.outPutName);//�o�̓t�@�C����
			adapt.setString(5,this.userCd);//���[�UID
			adapt.setString(6,this.businessCd);//�Ɩ���
			adapt.setString(7,this.plantCd);//�H��R�[�h
			adapt.setInt(8,this.calenderCd);//�J�����_�[�R�[�h
			adapt.setDate(9,this.date);//�Ώۓ��t
			adapt.setInt(10,this.margin);//���Z��
			adapt.setInt(11,moveFlgInt);//�O�|���t���O
			adapt.setOutDate(12);//�v�Z����
			adapt.setOutInteger(13);//�v�Z����

			adapt.execUpdate();

			calcDate = adapt.getOutDate(12);
			this.resultStatus = adapt.getOutInteger(13);
		}finally{
			if(adapt != null){
				adapt.close();
				adapt = null;
			}
		}

		return calcDate;
	}


	/**
	 * �Ώۓ��t����Z�o�����ғ������t��ԋp����B�iSP���i�g�p�j
	 *
	 * @param  date       �Ώۓ��t
	 * @param  margin     ���Z��
	 * @param  moveFlg    �O�|���t���O
	 * @return         �Z�o���ꂽ���t��ԋp
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public Date calcDate(Date date,int margin,boolean moveFlg) throws FoundationException{
		this.date = date;
		this.margin = margin;
		this.moveFlg = moveFlg;

		return this.calcDate();
	}


	/**
	 * �ғ������ǂ������f����B�iSP���i�g�p�j
	 *
	 * @return         �ғ����̏ꍇtrue�A����ȊOfalse
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public boolean isWorkDate() throws FoundationException{
		if(this.userCd == null || this.businessCd == null || this.plantCd == null || this.date == null){
			return false;
		}

		this.resultStatus = null;
		boolean checkOk = false;

		IDbAdapter adapt = null;

		try{
			adapt = conn.getSpAdapter("begin SQLISSALESWORKDAY(?,?,?,?,?,?,?,?,?,?,?); end;");
			adapt.setString(1,this.logMode);//LOG���[�h
			adapt.setString(2,this.outPutMode);//�o�̓��[�h
			adapt.setString(3,this.outPutPath);//�o�̓t�@�C���p�X
			adapt.setString(4,this.outPutName);//�o�̓t�@�C����
			adapt.setString(5,this.userCd);//���[�UID
			adapt.setString(6,this.businessCd);//�Ɩ���
			adapt.setString(7,this.plantCd);//�H��R�[�h
			adapt.setInt(8,this.calenderCd);//�J�����_�[�R�[�h
			adapt.setDate(9,this.date);//�Ώۓ��t
			adapt.setOutInteger(10);//�v�Z����
			adapt.setOutInteger(11);//�v�Z����

			adapt.execUpdate();

			Integer resultInt = adapt.getOutInteger(10);
			this.resultStatus = adapt.getOutInteger(11);

			if(resultInt == null){
				checkOk = false;
			}
			if(resultInt.intValue() == 0){
				checkOk = false;
			}else{
				checkOk = true;
			}

		}finally{
			if(adapt != null){
				adapt.close();
				adapt = null;
			}
		}

		return checkOk;
	}


	/**
	 * �ғ������ǂ������f����B�iSP���i�g�p�j
	 *
	 * @param  date       �Ώۓ��t
	 * @return         �ғ����̏ꍇtrue�A����ȊOfalse
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public boolean isWorkDate(Date date) throws FoundationException{
		this.date = date;
		return this.isWorkDate();
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
			FoundationException fe = new FoundationException("WorkCalendar",mre.getMessage(),"(SBM0854)�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
			fe.setPreviousException(mre);
			throw fe;
		}
	}


	/**
	 * �������ʂ��擾����
	 * @return         �`�F�b�N���ʂ̃X�e�[�^�X���擾
	 */
	public Integer getResultStatus(){
		return this.resultStatus;
	}
}

