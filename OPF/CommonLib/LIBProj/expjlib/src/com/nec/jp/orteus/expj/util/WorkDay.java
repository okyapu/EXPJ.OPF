/**
 *(#)WorkDay.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/08/05
 * @version 1.00
 * History 2003/07/29 �V�K�쐬 S.Takahashi
 * @version 1.01
 * History 2003/08/08 S.Takahashi
 * �R���X�g���N�^�ǉ�
 * �ғ����v�Z�i�����F�Ώۓ��t�A���Z���A�O�|���t���O�j���\�b�h�ǉ�(calcDate)
 * �ғ������胁�\�b�h�ǉ�(isWorkDate)
 * �ғ�������i�����F�Ώۓ��j���\�b�h�ǉ�(isWorkDate)
 * @version 1.02
 * History 2003/08/13 T.Taniguchi
 * �E�g�p����R�l�N�V�������O�����w�肷��`���ɕύX�B
 * @version 1.03
 * History 2003/08/17 ���Ԃ�WorkCalender()�Ƃ��A���̊g���Ƃ��čč쐬 T.Taniguchi
 */
package com.nec.jp.orteus.expj.util;

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
public class WorkDay extends WorkCalendar{

	/**
	 * �R���X�g���N�^
	 *
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 * @param  date         �Ώۓ��t
	 * @param  margin       ���Z��
	 * @param  moveFlg      �O�|���t���O�i�Ώۓ��t���x���̏ꍇ�ɂ��̓��ȍ~�̏��ғ�������ɂ���(true)�����̓��ȑO�̏��ғ�������ɂ���(false)���j
	 * @throws FoundationException �v���p�e�B�t�@�C���Ǎ����s
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,Date date,int margin,boolean moveFlg) throws FoundationException{
		super(null,userCd,businessCd,plantCd,date,margin,moveFlg);
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.date = date;
		this.margin = margin;
		this.moveFlg = moveFlg;

		this.readProperty();
	}


	/**
	 * �R���X�g���N�^
	 *
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 * @param  date         �Ώۓ��t
	 * @throws FoundationException �v���p�e�B�t�@�C���Ǎ����s
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,Date date) throws FoundationException{
		super(null,userCd,businessCd,plantCd,date);
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.date = date;
		this.margin = 0;
		this.moveFlg = false;

		this.readProperty();
	}
	/**
	 * �R���X�g���N�^
	 *
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 * @param  itemcd       �i�ڔԍ�
	 * @param  date         �Ώۓ��t
	 * @param  margin       ���Z��
	 * @param  moveFlg      �O�|���t���O�i�Ώۓ��t���x���̏ꍇ�ɂ��̓��ȍ~�̏��ғ�������ɂ���(true)�����̓��ȑO�̏��ғ�������ɂ���(false)���j
	 * @throws FoundationException �v���p�e�B�t�@�C���Ǎ����s
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,String itemCd,Date date,int margin,boolean moveFlg) throws FoundationException{
		super(null,userCd,businessCd,plantCd,itemCd,date,margin,moveFlg);
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.itemCd = itemCd;
		this.date = date;
		this.margin = margin;
		this.moveFlg = moveFlg;

		this.readProperty();
	}


	/**
	 * �R���X�g���N�^
	 *
	 * @param  userCd       ���[�U�R�[�h
	 * @param  businessCd   �Ɩ��R�[�h
	 * @param  plantCd      �H��R�[�h
	 * @param  itemcd       �i�ڔԍ�
	 * @param  date         �Ώۓ��t
	 * @throws FoundationException �v���p�e�B�t�@�C���Ǎ����s
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,String itemCd,Date date) throws FoundationException{
		super(null,userCd,businessCd,plantCd,itemCd,date);
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.itemCd = itemCd;
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
		if(this.userCd == null || this.businessCd == null || this.plantCd == null || this.date == null){
			return null;
		}
		int moveFlgInt = 0;
		if(this.moveFlg){
			moveFlgInt = 1;
		}

		this.resultStatus = null;
		Date calcDate = null;
		IDbConnection conn = null;
		try{
			conn = CoreTools.getTransConnection();
			WorkCalendar MyCal;
			MyCal = new WorkCalendar(conn,userCd,businessCd,plantCd,itemCd,date,margin,moveFlg);
			calcDate = MyCal.calcDate();
			this.resultStatus =MyCal.getResultStatus();
			MyCal = null;

		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
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
		IDbConnection conn = null;

		try{
			conn = CoreTools.getTransConnection();
			WorkCalendar MyCal;
			MyCal = new WorkCalendar(conn,userCd,businessCd,plantCd,itemCd,date,margin,moveFlg);
			checkOk = MyCal.isWorkDate();
			this.resultStatus =MyCal.getResultStatus();
			MyCal = null;

		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
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
			FoundationException fe = new FoundationException("WorkDay",mre.getMessage(),"(SBM0854)�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
			fe.setPreviousException(mre);
			throw fe;
		}
	}
}

