/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvCancel.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.stock;
package com.nec.jp.orteus.expj.pr.rcvissue.process;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.*;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.*;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * <B>RcvCancel</B><BR>
 * ���ɏ������C������<BR>
 * <BR>
 *  : 1.0.0.1�A<2003/10/12>�A�C������
 * 1.���Ɏ����������Ăяo����ɁA���v�ʂ̍X�V���鏈����ǉ��B
 *  : 1.0.0.2�A<2003/10/13>�A�C������
 * 1.���v�ʍX�V���ɁA�X�V�v���O���������Ɩ��R�[�h�ɂȂ��Ă��܂��Ă���̂��A�Ɩ����ɏC���B
 * 2.�ۊǋ�ʓ��o�ɍX�V���ɁA�X�V�v���O���������Ɩ��R�[�h�ɂȂ��Ă��܂��Ă���̂��A�Ɩ����ɏC���B
 * 3.�ۊǋ�ʓ��o�ɂ֓o�^���ɁA�ۊǋ�ʓ��o�ɂ���擾�����X�V�v���O��������o�^����悤�ɏC���B
 * 4.�O�����ѐ��̓ǂݍ��݂̏����ŁA�n��ԍ���null�������Ă����ꍇ�ɁA�n��ԍ���null�̃f�[�^�������ł��Ȃ��o�O���C���B
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $
 */
public class RcvCancel
{

	/**
	 * �f�t�H���g�R���X�g���N�^
	 */
	private RcvCancel(){}
	
	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param  rcvIssueCtrlCd ���ɏ������s�����o�ɊǗ��ԍ�
	 * @param  UserId �������Ăяo�����[�U��ID
	 */
	public RcvCancel(IDbConnection connect, String rcvIssueCtrlCd, String UserId)
	{
		_conn = connect;
		_ctrlCd = rcvIssueCtrlCd;
		_userId = UserId;
	}

	/**
	 * ���ɏ�����main���\�b�h
	 *
	 * @return boolean ���������Ȃ�true�A�������s�Ȃ�false��Ԃ�
	 * @throws SQLException
	 *         SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public boolean execProcess() throws SQLException
	{
		RcvCancelStruct _struct = new RcvCancelStruct();
		RcvCancelDBAccessor _dbAccessor = new RcvCancelDBAccessor(_conn);
		//���O�o��
		SystemLog sysLog = new SystemLog();
		boolean logInit = false;
		
		try{
			logInit = sysLog.init("com.nec.jp.orteus.metamorBase.common03.RcvCancel");
			if(!logInit) throw new AlarmMessageException("ZZ01005",new String[0]); //���������s
			// �ۊǋ�ʓ��o�Ƀe�[�u���̓Ǎ���
			_struct = _dbAccessor.selectRcvIssue(_ctrlCd);
			String UpdatedPrgNm = _struct.getUPDATED_PRG_NM(); //20031013�ǋL

			if(_struct == null)
			{
				_errorList.add("AD00078");//�װ���ފm�F
				sysLog.setConnection(_conn);
				sysLog.warning("AD00078",_userId);
				return false;
			}

			// --- 2.4.2 �G���[�`�F�b�N --->
			// ���o�ɋ敪��"1"(����)�łȂ�
			if(_struct.getRCV_ISSUE_TYP()!=null
					&& !_struct.getRCV_ISSUE_TYP().equals("1")){
				_errorList.add("AD00069");//�װ���ފm�F
				sysLog.setConnection(_conn);
				sysLog.warning("AD00069",_userId);
				return false;
			}

			// ���o�ɔ����敪��"11"(�ʏ����)�łȂ�
			if(_struct.getRCV_ISSUE_GNR_TYP()!=null 
					&& !_struct.getRCV_ISSUE_GNR_TYP().equals("11")){
				_errorList.add("AD00070");//�װ���ފm�F
				sysLog.setConnection(_conn);
				sysLog.warning("AD00070",_userId);
				return false;
			}

			// ���o�ɐ��ʂ��O��菬����
			if(_struct.getRCV_ISSUE_QTY()!=null
					&& _struct.getRCV_ISSUE_QTY().compareTo("0")<0)
			{
				_errorList.add("AD00071");
				sysLog.setConnection(_conn);
				sysLog.warning("AD00071",_userId);
				return false;
			}

			// �i�ڎ�z�敪��"8"(�[���i��)
			if(_struct.getMRP_ODR_TYP()!=null 
				&& _struct.getMRP_ODR_TYP().equals("8"))
			{
				_errorList.add("AD00072");
				sysLog.setConnection(_conn);
				sysLog.warning("AD00072",_userId);
				return false;
			}
			//<------------------------

			// 2.4.3 ���ɏ����̌Ăяo��
			RcvProcess RcvP = new RcvProcess(_conn,_ctrlCd);
			boolean bRslt = RcvP.execProcess();
			if( !bRslt ) return false;

			// 2.4.4 ���v�ʂ̍X�V --20031012.CommonOd�Ɉ����n���Ɩ������C��
			CommonOd C_Od = new CommonOd(_conn,_struct.getPLANT_CD(),_userId,_struct.getUPDATED_PRG_NM());
			C_Od.updateOrderForReceive(_struct.getOD_NO()
										,Double.parseDouble(_struct.getRCV_ISSUE_QTY())
										,Long.parseLong("-1"));

			// 2.4.5 ���Ɏ���������
			// �O����Ɏ��т̌���
			if(_struct.getPUCH_ODR_CD()==null
					&& _struct.getOPR_RSLT_CRCT_NO()!=null
					&& _struct.getOPR_RSLT_CRCT_NO().compareTo("1")>=0){
				_struct = _dbAccessor.selectLstRslt(_struct);
			}else{
				return true;	//�O����Ɏ��т��������Ȃ��ꍇ�͏������̂𔲂���B�װ�ł͂Ȃ� ---20031010�C���G���[�ł͂Ȃ��̂�true�ŕԂ��B
			}

			if(_struct == null)
			{
				_errorList.add("AD00078");//�װ���ފm�F
				sysLog.setConnection(_conn);
				sysLog.warning("AD00078",_userId);
				return false;
			}

			//�ۊǋ�ʓ��o�ɂւ̒ǉ�
			BigDecimal bQty = new BigDecimal(_struct.getRCV_ISSUE_QTY());
			_struct.setRCV_ISSUE_QTY(bQty.negate().toString());
			CollectNumber IssueCd = new CollectNumber(CollectNumber.ISSUE_CD,_userId,"RcvCancel",_struct.getPLANT_CD());
			_struct.setRCV_ISSUE_CTRL_CD(IssueCd.getNo());//�̔Ԃ��������
			_struct.setUPDATED_BY(_userId);
//20031012�C��			_struct.setUPDATED_PRG_NM("RcvCancel");
			_struct.setUPDATED_PRG_NM(UpdatedPrgNm);
			int iROWS = _dbAccessor.insertRcvIssue(_struct);

/*bak20031010
			//�ۊǋ�ʓ��o�ɂւ̒ǉ�
			BigDecimal bQty = new BigDecimal(_struct.getRCV_ISSUE_QTY());
			_struct.setRCV_ISSUE_QTY(bQty.negate().toString());
			CollectNumber IssueCd = new CollectNumber(CollectNumber.ISSUE_CD,_userId,"RcvCancel",_struct.getPLANT_CD());
			String No = IssueCd.getNo();
			_struct.setRCV_ISSUE_CTRL_CD(No);//�̔Ԃ��������
			_struct.setUPDATED_BY(_userId);
			_struct.setUPDATED_PRG_NM("RcvCancel");
			int iROWS = _dbAccessor.insertRcvIssue(_struct);
*/
			// ���Ɏ����������Ăяo��
			RcvP = new RcvProcess(_conn,_struct.getRCV_ISSUE_CTRL_CD());
			bRslt = RcvP.execProcess();
			if( !bRslt ) {
				if (RcvP.getErrorList() != null && !RcvP.getErrorList().isEmpty() && RcvP.getErrorList().size() > 0) {
					for (int m = 0; m < RcvP.getErrorList().size(); m++){
						_errorList.add((String)RcvP.getErrorList().get(m));
					}
				}
				return false;
			}

			// ���v�ʂ̍X�V ---20031010�ǉ�
			C_Od = new CommonOd(_conn,_struct.getPLANT_CD(),_userId,_struct.getUPDATED_PRG_NM());
			C_Od.updateOrderForReceive(_struct.getOD_NO()
										,Double.parseDouble(_struct.getRCV_ISSUE_QTY())
										,Long.parseLong("-1"));

			return true;

		}catch(Exception e){
			e.printStackTrace();
			sysLog.setConnection(_conn);
			sysLog.severe("ZZ01106",_userId);
			return false;
		}
	}

	/** ���ɏ����R�l�N�V�����N���X */
	protected IDbConnection _conn;

	/** ���ɏ����f�[�^�N���X */
	protected RcvCancelStruct _struct;

	/** ���ɏ��� DB�A�N�Z�X�N���X */
	protected RcvCancelDBAccessor _dbAccessor;

	/** ���o�ɊǗ��ԍ� */
	protected String _ctrlCd;

	/** ���[�U�h�c */
	protected String _userId;

	/** �G���[���b�Z�[�W�i�[���X�g */
	protected ArrayList _errorList = new ArrayList();

	/**
	 * ���b�Z�[�W�擾 
	 * @return �G���[���X�g
	 */
	public ArrayList getErrorList()
	{
		return _errorList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W���X�g
	 */
	public void setErrorList(ArrayList list)
	{
		_errorList = list;
	}

	/** ��񃁃b�Z�[�W�i�[���X�g */
	protected ArrayList _infoList = new ArrayList();

	/**
	 * ���b�Z�[�W�擾 
	 * @return info���X�g
	 */
	public ArrayList getInfoList()
	{
		return _infoList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W���X�g
	 */
	public void setInfoList(ArrayList list)
	{
		_infoList = list;
	}

	/** �x�����b�Z�[�W�i�[���X�g */
	protected ArrayList _warnList = new ArrayList();

	/**
	 * ���b�Z�[�W�擾 
	 * @return warn���X�g
	 */
	public ArrayList getWarnList()
	{
		return _warnList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W���X�g
	 */
	public void setWarnList(ArrayList list)
	{
		_warnList = list;
	}

	/** ���t�t�H�[�}�b�g */
	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * String�^ �� Date�^�B
	 * @return Date 
	 */
	public Date convertDate(String date)
	{
		try{
			return _dateFormat.parse(date);

		}catch(ParseException ex){}

		return null;
	}
}