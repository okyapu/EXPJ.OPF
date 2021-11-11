/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common03/CommonIssue/CommonIssue.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.stock;
package com.nec.jp.orteus.metamorBase.common03.CommonIssue;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.RcvIssue.IssueProcess;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
//import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
/**
 * <pre>
 * �����o�ɂ̋��ʏ������s��
 *
 * ���̃N���X��������́ASQLException����������\��������܂��B
 * </pre>
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2013/06/27 03:38:17 $
 */

public class CommonIssue {

	private	IDbConnection _iconn;					// �g�����U�N�V�����R�l�N�V�������
	private	Connection _conn;						// �R�l�N�V�������
	private	String _plantCd;						// �H��R�[�h
	private	UserInfo _userInfo;						// ���p�ҊǗ����(�C���i�[�N���X)
	private	Log	_log;								// ���O���(�C���i�[�N���X)
	private	IssueProcess _IssueProcess;				// �o�ɏ����̃I�u�W�F�N�g


	private		String	ginWORK_ODR_CD			  ;	//	��ƌv��ԍ�
	private		String	ginWORK_IN_PROC_CD		  ;	//	��ƃR�[�h
	private		String	ginPARTIAL_PRD_NO		  ;	//	�����
	private		String	ginOPR_RSLT_CRCT_NO		  ;	//	��Ǝ��ђ�����
//	private		String	ginPRE_OPR_RSLT_CRCT_NO	  ;	//	�O���Ǝ��ђ�����??????
	private		String	ginPUCH_ODR_CD			  ;	//	�����ԍ�
	private		String	ginACPT_NO				  ;	//	�����
	private		String	ginACPT_RSLT_CRCT_NO	  ;	//	���������???????????
//	private		String	ginPRE_ACPT_RSLT_CRCT_NO  ;	//	�O����������?????????????
	private		String	ginRCV_ISSUE_TYP		  ;	//	�����o�ɏ����敪?????
	private		String	ginRCV_ISSUE_DATE		  ;	//	�o�ɔN����
	private		String	ginRCV_ISSUE_RSLT_NO	  ;	//	�����Ώێ��ѐ�????
	private		String	ginRCV_ISSUE_CMPLT_FLG	  ;	//	�o�Ɋ����t���O
	private		String	ginPLANT_CD				  ;	//	�H��R�[�h

	//�o�Ɏw���̏��ۑ�
	private	ArrayList alT_ISSUE_INST = new ArrayList();
	private	Hashtable htT_ISSUE_INST = new Hashtable();
	//�ۊǋ�ʓ��o�ɂ̏��
	private	Hashtable htT_RCV_ISSUE	= new Hashtable();

	private	Hashtable	htIssueNO=new Hashtable();			//�����o�ɐ�
	private	Hashtable	htUNIT_QTY_TYP=new Hashtable();		//�݌ɐ��P�ʋ敪
	private	Hashtable	htMRP_ODR_TYP=new Hashtable();		//�i�ڎ�z�敪

	private	Hashtable	htT_OD=new Hashtable();				//���v�ʏ��
	private	String gsJOB_ODR_CD	= "";						//���ԕi�̕��o�ۊǋ�̏����̌��������u���ԁv
															//�u�ʎ�z���o�ɉ\������̏o�Ɂv�̏ꍇ�A[�o�Ɏw��]."�I�[�_�f�}���h�ԍ�"�ň�v����[���v��]�̐��ԁB
															//�u���Ԉ������o�ɉ\������̏o�Ɂv�̏ꍇ�A��������[���Ԉ���]."����"

	/**
	 * �R���X�g���N�^
	 * new����Ƃ��ɂ͉��L�̃p�����[�^�𑗂�B�H��R�[�h,���[�UID,�Ɩ����͕ʓrsetter�Őݒ肵�������Ƃ��\
	 *
	 * @param conn �R�l�N�V�������
	 * @param plantCd �H��R�[�h
	 * @param userId ���[�UID
	 * @param businessName �Ɩ���
	 */
	public CommonIssue(IDbConnection conn, String plantCd, String userId, String businessName) {

		_iconn = conn;
		_conn =	_iconn.getConn();
		_plantCd = plantCd;
		_userInfo =	new	UserInfo(userId,businessName);

		// ���O�p���i�̏��������s��
		String className = this.getClass().getName();
		className	= className.substring(0,className.lastIndexOf("."));
		_log = new Log(className,_iconn);
	}
	// setter
	public void	setPlantCd(String plantCd) {
		this._plantCd =	plantCd;
	}
	public void	setUserId(String userId) {
		_userInfo.userId = userId;
	}
	public void	setBusinessName(String businessName) {
		_userInfo.businessName = businessName;
	}

	/**
	 * �������ɏ����E���C������
	 *
	 * @param inWORK_ODR_CD					  ��ƌv��ԍ�
	 * @param inWORK_IN_PROC_CD				  ��ƃR�[�h
	 * @param inPARTIAL_PRD_NO				  �����
	 * @param inOPR_RSLT_CRCT_NO			  ��Ǝ��ђ�����
	 * @param inPUCH_ODR_CD					  �����ԍ�
	 * @param inACPT_NO						  �����
	 * @param inACPT_RSLT_CRCT_NO			  ���������
	 * @param inRCV_ISSUE_TYP				  �����o�ɏ����敪
	 * @param inRCV_ISSUE_DATE				  �o�ɔN����
	 * @param inRCV_ISSUE_RSLT_NO			  �����Ώێ��ѐ�
	 * @param inRCV_ISSUE_CMPLT_FLG			  �o�Ɋ����t���O
	 * @param inPLANT_CD					  �H��R�[�h
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void	AutoIssueOpr(
		String	inWORK_ODR_CD			,	//��ƌv��ԍ�
		String	inWORK_IN_PROC_CD		,	//��ƃR�[�h
		String	inPARTIAL_PRD_NO		,	//�����
		String	inOPR_RSLT_CRCT_NO		,	//��Ǝ��ђ�����
		String	inPUCH_ODR_CD			,	//�����ԍ�
		String	inACPT_NO				,	//�����
		String	inACPT_RSLT_CRCT_NO		,	//���������
		String	inRCV_ISSUE_TYP			,	//�����o�ɏ����敪
		String	inRCV_ISSUE_DATE		,	//�o�ɔN����
		String	inRCV_ISSUE_RSLT_NO		,	//�����Ώێ��ѐ�
		String	inRCV_ISSUE_CMPLT_FLG	,	//�o�Ɋ����t���O
		String	inPLANT_CD			  )		//�H��R�[�h
			throws SQLException,Exception{

		//�ϐ�������������
//20031121		ResultSet rs=null;
		String sRC = "";
		double dIssueNO=0;
		double dRC = 0;
		double dRC1 = 0;
		Hashtable htRC = new Hashtable();
		int	iRC	= 0;
		int	iMRP_ODR_TYP = 0;
		double	dAutoIssueNo = 0;
		int	iIssueCount	= 0;
		//double	dIssueNO = 0;
		boolean	bRC;

		try
		{
			_log.methodStart();
			//���̓p�����[�^���擾
			ginWORK_ODR_CD			=inWORK_ODR_CD			;//��ƌv��ԍ�
			ginWORK_IN_PROC_CD		=inWORK_IN_PROC_CD		;//��ƃR�[�h
			ginPARTIAL_PRD_NO		=inPARTIAL_PRD_NO		;//�����
			ginOPR_RSLT_CRCT_NO		=inOPR_RSLT_CRCT_NO		;//��Ǝ��ђ�����
			ginPUCH_ODR_CD			=inPUCH_ODR_CD			;//�����ԍ�
			ginACPT_NO				=inACPT_NO				;//�����
			ginACPT_RSLT_CRCT_NO	=inACPT_RSLT_CRCT_NO	;//���������
			ginRCV_ISSUE_TYP		=inRCV_ISSUE_TYP		;//�����o�ɏ����敪
			ginRCV_ISSUE_DATE		=inRCV_ISSUE_DATE		;//�o�ɔN����
			ginRCV_ISSUE_RSLT_NO	=inRCV_ISSUE_RSLT_NO	;//�����Ώێ��ѐ�
			ginRCV_ISSUE_CMPLT_FLG	=inRCV_ISSUE_CMPLT_FLG	;//�o�Ɋ����t���O
			ginPLANT_CD				=inPLANT_CD				;//�H��R�[�h
			//DEBUG
			_log.message("(SBM0451)��ƌv��ԍ�=["+ginWORK_ODR_CD+"]");
//20031104			_log.message("��ƃR�[�h=["+ginWORK_IN_PROC_CD+"]");
//20031104			_log.message("�����=["+ginPARTIAL_PRD_NO+"]");
//20031104			_log.message("��Ǝ��ђ�����=["+ginOPR_RSLT_CRCT_NO+"]");
//20031104			_log.message("�����ԍ�=["+ginPUCH_ODR_CD+"]");
//20031104			_log.message("�����=["+ginACPT_NO+"]");
//20031104			_log.message("���������=["+ginACPT_RSLT_CRCT_NO+"]");
//20031104			_log.message("�����o�ɏ����敪=["+ginRCV_ISSUE_TYP+"]");
//20031104			_log.message("�o�ɔN����=["+ginRCV_ISSUE_DATE+"]");
//20031104			_log.message("�����Ώێ��ѐ�=["+ginRCV_ISSUE_RSLT_NO+"]");
//20031104			_log.message("�o�Ɋ����t���O=["+ginRCV_ISSUE_CMPLT_FLG+"]");
//20031104			_log.message("�H��R�[�h=["+ginPLANT_CD+"]");
			//2.10.3 ���̓p�����[�^�`�F�b�N
			if (ginPUCH_ODR_CD == null || ginPUCH_ODR_CD.equals(""))
			{
				if ((ginOPR_RSLT_CRCT_NO == null) || (Integer.parseInt(ginOPR_RSLT_CRCT_NO) < 0) ) //20031008�C��(0�̎��G���[�łȂ�����)
				{
					_log.message("(SBM1197)��Ǝ��ђ�����=["+ginOPR_RSLT_CRCT_NO+"] ���s���Ȃ̂ŁA�����͏I������B");  //20031010�C��
					return;
				};
			} else {
				if ((ginACPT_RSLT_CRCT_NO == null) || (Integer.parseInt(ginACPT_RSLT_CRCT_NO) < 0) ) //20031008�C��(0�̎��G���[�łȂ�����)
				{
					_log.message("(SBM1198)���������=["+ginACPT_RSLT_CRCT_NO+"] ���s���Ȃ̂ŁA�����͏I������B");  //20031010�C��
					return;
				};
			}

			//2.10.3.1	�o�ɍώ����o�ɕi�ڂ̏o�Ɏ������
			if (ginRCV_ISSUE_TYP.equals("2"))
			{
				if (ginPUCH_ODR_CD == null || ginPUCH_ODR_CD.equals(""))
				{
					if (Integer.parseInt(ginOPR_RSLT_CRCT_NO) >	0 )
					{
						//�u�����ԍ��v��Null�̏ꍇ�@���@��Ǝ��ђ����񐔁@>�@0
// 20031121�C���J�n
						JDB0001();
/*
						rs = JDB0001();
						while (rs.next())
						{
							sRC	= JDB0003(rs);
							//DEBUG
//20031104							_log.message("���o�ɊǗ��ԍ�JDB0001=["+sRC+"]");
							//�o�ɏ������Ăяo��
							_log.message("�o�ɏ������Ăяo��......");
							_IssueProcess = new IssueProcess(_iconn, sRC);
							_IssueProcess.execProcess();
						}
*/
// 20031121�C���I��
					}
				} else {
					if (Integer.parseInt(ginACPT_RSLT_CRCT_NO) > 0)
					{
						//�u�����ԍ��v��NotNull�̏ꍇ�@���@��������񐔁@>�@0

// 20031121�C���J�n
						JDB0002();
/*
						rs = JDB0002();
						while (rs.next())
						{
							sRC	= JDB0003(rs);
							//DEBUG
//20031104							_log.message("���o�ɊǗ��ԍ�JDB0002=["+sRC+"]");
							//�o�ɏ���
							_log.message("�o�ɏ������Ăяo��......");
							_IssueProcess = new IssueProcess(_iconn, sRC);
							_IssueProcess.execProcess();
						}
*/
// 20031121�C���I��
					}
				}
			}
			// 2.10.4	�����o�ɑΏەi�ڂ̌���
			if (ginRCV_ISSUE_TYP.equals("2"))
			{
				if (ginPUCH_ODR_CD==null || ginPUCH_ODR_CD.equals(""))
				{
					//�����o�ɏ����Ώەi�ڌ����i�o�Ɏw���̎����o�ɂ̍�ƌv��ԍ������j
					//�����o�ɏ����Ώەi�ڃZ�b�g��񐶐��i�����o�ɐ��̎Z�o�j
					//DEBUG
//20031104					_log.message("�o�Ɏw���̎����o�ɂ̍�ƌv��ԍ�����");
					dIssueNO = JDB0004("1");
				} else {
					//�����o�ɏ����Ώەi�ڌ����i�o�Ɏw���̎����o�ɂ̔����ԍ������j
					//�����o�ɏ����Ώەi�ڃZ�b�g��񐶐��i�����o�ɐ��̎Z�o�j
					//DEBUG
//20031104					_log.message("�o�Ɏw���̎����o�ɂ̔����ԍ�����");
					dIssueNO = JDB0004("2");
				}
			}
			// �����o�ɏ����Ώەi�ڃZ�b�g��񂪂����
			iIssueCount	= htIssueNO.size();
			//DEBUG
//20031104			_log.message("�����o�ɏ����Ώەi�ڌ���=["+iIssueCount+"]");
			while (iIssueCount > 0)
			{
				//[�����o�ɐ�]���擾
				dAutoIssueNo = Double.parseDouble((String)htIssueNO.get(Integer.toString(iIssueCount)));
				//DEBUG
//20031104				_log.message("�����o�ɐ�=["+dAutoIssueNo+"]");
				//2.10.5	�u�����o�ɐ��v��Zero�̂Ƃ�
				if (dAutoIssueNo ==	0)
				{
					//�ۊǋ�ʓ��o��]�֒ǉ����s��
					sRC	= JDB0006(iIssueCount);
					//DEBUG
//20031104					_log.message("���o�ɊǗ��ԍ�JDB0006=["+sRC+"]");
//20031103			//�o�ɏ������Ăяo��
//20031103			_log.message("�o�ɏ������Ăяo��......");
//20031103			_IssueProcess = new IssueProcess(_iconn, sRC);
//20031103			_IssueProcess.execProcess();
					// return ;
				} else {
					//2.10.6	MRP�i�ڂ̎����o�ɏ���
					//�o�ɕi�ڂ̕i�ڎ�z�敪���P(�ʎ�z�i��)�A�Q(�݌Ɉ����^�ʎ�z�i��)�A�R(����)�ȊO�ł���Ƃ�
					iMRP_ODR_TYP = Integer.parseInt((String)htMRP_ODR_TYP.get(Integer.toString(iIssueCount)));
					//DEBUG
//20031104					_log.message("�o�ɕi�ڂ̕i�ڎ�z�敪=["+iMRP_ODR_TYP+"]");
					if (iMRP_ODR_TYP !=1 &&	iMRP_ODR_TYP !=	2 && iMRP_ODR_TYP != 3)
					{
						//�i�ڕʕۊǐ�D�揇�ʂ̌���
//20031121				rs = JDB0007(iIssueCount);
						//�����o�ɐ���S�ďo�ɂ���܂�
						//�y�l�q�o�i�̕��o�ۊǋ�̏����z
//20031121				dRC	= JDB0008(rs, iIssueCount, dAutoIssueNo, 1);
						dRC	= JDB0008(iIssueCount, dAutoIssueNo, 1);
						//DEBUG
//20031104						_log.message("�����o�ɐ���S�ďo��=�y�l�q�o�i�̕��o�ۊǋ�̏����zJDB0008");
					} else {
						// 09-25 �d�l�m�F���C��
						if (iMRP_ODR_TYP ==1 ||	iMRP_ODR_TYP ==	2){
							dIssueNO = Double.parseDouble((String)htIssueNO.get(Integer.toString(iIssueCount)));
							//2.10.7.1 �ʎ�z���o�ɉ\���̎Z�o
							dRC	= JDB0009(iIssueCount, dIssueNO);
							//DEBUG
//20031104							_log.message("�ʎ�z���o�ɉ\��=["+dRC+"]");
							//�ʎ�z���o�ɉ\���@���@0
							if (dRC	> 0)
							{
								//�i�ڕʕۊǐ�D�揇�ʂ̌���
//20031121						rs = JDB0007(iIssueCount);
								//�����o�ɐ���S�ďo�ɂ���܂�
								//�y���ԕi�̕��o�ۊǋ�̏����z
//20031121						dRC1 = JDB0018(rs, iIssueCount, dRC);
								dRC1 = JDB0018(iIssueCount, dRC);
							}
							dIssueNO = dIssueNO	- dRC1;
							//DEBUG
//20031104							_log.message("�o�ɗv����JDB0011�i���Ԉ������o�ɉ\���i���ꐻ�ԁj�j=["+dIssueNO+"]");
							//2.10.7.2 ���Ԉ������o�ɉ\���i���ꐻ�ԁj�̎Z�o
							dRC	= JDB0011(iIssueCount, dIssueNO);
							dIssueNO = dIssueNO	- dRC;
							//DEBUG
//20031104							_log.message("�o�ɗv����JDB0013�i���Ԉ������o�ɉ\���i�����ԁj�j=["+dIssueNO+"]");
							//2.10.7.2 ���Ԉ������o�ɉ\���i�����ԁj�̎Z�o
							dRC	= JDB0013(iIssueCount, dIssueNO);
							dIssueNO = dIssueNO	- dRC;
							//DEBUG
//20031104							_log.message("�o�ɗv����JDB0014�i�݌Ɉ������o�ɉ\���j=["+dIssueNO+"]");
							//2.10.7.3 �݌Ɉ������o�ɉ\���̎Z�o
							dRC	= JDB0014(iIssueCount, dIssueNO);
							dIssueNO = dIssueNO	- dRC;
							//DEBUG
//20031104							_log.message("�o�ɗv����JDB0015�i�i�ڍ݌ɏo�ɉ\���j=["+dIssueNO+"]");
							//2.10.7.4 �i�ڍ݌ɏo�ɉ\���̎Z�o
							dRC	= JDB0015(iIssueCount, dIssueNO);
							//DEBUG
//20031104							_log.message("�i�ڍ݌ɏo�ɉ\��=["+dRC+"]");
							if (dRC	> 0)
							{
								//�i�ڕʕۊǐ�D�揇�ʂ̌���
//20031121						rs = JDB0007(iIssueCount);
								//�����o�ɐ���S�ďo�ɂ���܂�
								//�y�l�q�o�i�̕��o�ۊǋ�̏����z
//20031121						dRC1 = JDB0008(rs, iIssueCount, dRC, 3);
								dRC1 = JDB0008(iIssueCount, dRC, 3);
							}
						}
					}
				}
				iIssueCount--;
			}
			//_conn.commit();
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
// 20031121�C���J�n
/*
			if (rs != null)
			{
				rs.close();
			}
*/
// 20031121�C���I��
			//_conn.rollback();
		}

		return;
	}

	//2.10.3.1	�o�ɍώ����o�ɕi�ڂ̏o�Ɏ������ �u�����ԍ��v��Null�̏ꍇ
	//	�s�u�����ԍ��v��Null�̏ꍇ��[�ۊǋ�ʓ��o��]�ɑ΂��錟�������t
	//	[�ۊǋ�ʓ��o��]."��ƌv��ԍ�"���u��ƌv��ԍ��v
	//	[�ۊǋ�ʓ��o��]."��ƃR�[�h"���u��ƃR�[�h�v
	//	[�ۊǋ�ʓ��o��]."�����"���u����񐔁v
	//	[�ۊǋ�ʓ��o��]."��Ǝ��ђ�����"���u��Ǝ��ђ����񐔁v�|�P
	//	[�ۊǋ�ʓ��o��]."�݌ɍX�V�敪"��2(�X�V��)
	//	[�ۊǋ�ʓ��o��]."���o�ɊǗ��ԍ�"�̏���
	//	[�o�Ɏw��]��1."�o�Ɏw���o�ɋ敪"��3(�����o��)
//	private	ResultSet JDB0001()
	private	void JDB0001()
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sRC = "";
		try
		{
			_log.methodStart();
			// << �ۊǋ�ʓ��o�ɂ����� >>
			if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals("")) {
				sql	= "select "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD, "
				+" T_RCV_ISSUE.RCV_ISSUE_TYP as RCV_ISSUE_TYP,"
				+" T_RCV_ISSUE.ITEM_CD as ITEM_CD,"
				+" T_RCV_ISSUE.PLANT_CD as PLANT_CD,"
				+" T_RCV_ISSUE.WH_CD as WH_CD,"
				+" T_RCV_ISSUE.JOB_ODR_CD as JOB_ODR_CD,"
				+" T_RCV_ISSUE.JOB_ODR_DETAIL_NO as JOB_ODR_DETAIL_NO,"
				+" T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD,"
				+" T_RCV_ISSUE.ACPT_NO as ACPT_NO,"
				+" T_RCV_ISSUE.ACPT_RSLT_CRCT_NO as ACPT_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO as INSPEC_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.WORK_ODR_CD as WORK_ODR_CD,"
				+" T_RCV_ISSUE.WORK_IN_PROC_CD as WORK_IN_PROC_CD,"
				+" T_RCV_ISSUE.PARTIAL_PRD_NO as PARTIAL_PRD_NO,"
				+" T_RCV_ISSUE.OPR_RSLT_CRCT_NO as OPR_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.ISSUE_INST_CD as ISSUE_INST_CD,"
				+" T_RCV_ISSUE.RCV_ISSUE_QTY as RCV_ISSUE_QTY,"
				+" T_RCV_ISSUE.RCV_ISSUE_AMOUNT as RCV_ISSUE_AMOUNT,"
				+" T_RCV_ISSUE.RCV_ISSUE_DATE as RCV_ISSUE_DATE,"
				+" T_RCV_ISSUE.RCV_ISSUE_GNR_TYP as RCV_ISSUE_GNR_TYP,"
				+" T_RCV_ISSUE.RCV_ISSUE_ODD_QTY as RCV_ISSUE_ODD_QTY,"
				+" T_RCV_ISSUE.DEFECT_CAUSE_CD as DEFECT_CAUSE_CD,"
				+" T_RCV_ISSUE.STOCK_UPD_TYP as STOCK_UPD_TYP,"
				+" T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG as RCV_ISSUE_CMPLT_FLG,"
				+" T_RCV_ISSUE.OD_NO as OD_NO,"
				+" T_RCV_ISSUE.VEND_LOT_NO as VEND_LOT_NO,"
				+" T_RCV_ISSUE.RCV_ISSUE_COMMENT as RCV_ISSUE_COMMENT,"
				+" T_RCV_ISSUE.COMPANY_CD as COMPANY_CD,"
				+" T_RCV_ISSUE.VEND_CD as VEND_CD,"
				+" T_RCV_ISSUE.CONS_TYP as CONS_TYP,"
				+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE,"
				+" T_RCV_ISSUE.CREATED_DATE as CREATED_DATE,"
				+" T_RCV_ISSUE.CREATED_BY as CREATED_BY,"
				+" T_RCV_ISSUE.CREATED_PRG_NM as CREATED_PRG_NM,"
				+" T_RCV_ISSUE.UPDATED_DATE as UPDATED_DATE,"
				+" T_RCV_ISSUE.UPDATED_BY as UPDATED_BY,"
				+" T_RCV_ISSUE.UPDATED_PRG_NM as UPDATED_PRG_NM,"
				+" T_RCV_ISSUE.MODIFY_COUNT as MODIFY_COUNT "
				+"from "
				+" T_RCV_ISSUE , T_ISSUE_INST "
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
//20031017�폜				+" and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+" order by "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";
			} else {
				sql	= "select "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD, "
				+" T_RCV_ISSUE.RCV_ISSUE_TYP as RCV_ISSUE_TYP,"
				+" T_RCV_ISSUE.ITEM_CD as ITEM_CD,"
				+" T_RCV_ISSUE.PLANT_CD as PLANT_CD,"
				+" T_RCV_ISSUE.WH_CD as WH_CD,"
				+" T_RCV_ISSUE.JOB_ODR_CD as JOB_ODR_CD,"
				+" T_RCV_ISSUE.JOB_ODR_DETAIL_NO as JOB_ODR_DETAIL_NO,"
				+" T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD,"
				+" T_RCV_ISSUE.ACPT_NO as ACPT_NO,"
				+" T_RCV_ISSUE.ACPT_RSLT_CRCT_NO as ACPT_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO as INSPEC_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.WORK_ODR_CD as WORK_ODR_CD,"
				+" T_RCV_ISSUE.WORK_IN_PROC_CD as WORK_IN_PROC_CD,"
				+" T_RCV_ISSUE.PARTIAL_PRD_NO as PARTIAL_PRD_NO,"
				+" T_RCV_ISSUE.OPR_RSLT_CRCT_NO as OPR_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.ISSUE_INST_CD as ISSUE_INST_CD,"
				+" T_RCV_ISSUE.RCV_ISSUE_QTY as RCV_ISSUE_QTY,"
				+" T_RCV_ISSUE.RCV_ISSUE_AMOUNT as RCV_ISSUE_AMOUNT,"
				+" T_RCV_ISSUE.RCV_ISSUE_DATE as RCV_ISSUE_DATE,"
				+" T_RCV_ISSUE.RCV_ISSUE_GNR_TYP as RCV_ISSUE_GNR_TYP,"
				+" T_RCV_ISSUE.RCV_ISSUE_ODD_QTY as RCV_ISSUE_ODD_QTY,"
				+" T_RCV_ISSUE.DEFECT_CAUSE_CD as DEFECT_CAUSE_CD,"
				+" T_RCV_ISSUE.STOCK_UPD_TYP as STOCK_UPD_TYP,"
				+" T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG as RCV_ISSUE_CMPLT_FLG,"
				+" T_RCV_ISSUE.OD_NO as OD_NO,"
				+" T_RCV_ISSUE.VEND_LOT_NO as VEND_LOT_NO,"
				+" T_RCV_ISSUE.RCV_ISSUE_COMMENT as RCV_ISSUE_COMMENT,"
				+" T_RCV_ISSUE.COMPANY_CD as COMPANY_CD,"
				+" T_RCV_ISSUE.VEND_CD as VEND_CD,"
				+" T_RCV_ISSUE.CONS_TYP as CONS_TYP,"
				+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE,"
				+" T_RCV_ISSUE.CREATED_DATE as CREATED_DATE,"
				+" T_RCV_ISSUE.CREATED_BY as CREATED_BY,"
				+" T_RCV_ISSUE.CREATED_PRG_NM as CREATED_PRG_NM,"
				+" T_RCV_ISSUE.UPDATED_DATE as UPDATED_DATE,"
				+" T_RCV_ISSUE.UPDATED_BY as UPDATED_BY,"
				+" T_RCV_ISSUE.UPDATED_PRG_NM as UPDATED_PRG_NM,"
				+" T_RCV_ISSUE.MODIFY_COUNT as MODIFY_COUNT "
				+"from "
				+" T_RCV_ISSUE , T_ISSUE_INST "
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
				+" and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+" order by "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";
			}

			ps = _conn.prepareStatement(sql);
			if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals("")) {
				ps.setString(1,	ginWORK_ODR_CD);				//��ƌv��ԍ�
//				ps.setString(2,	ginWORK_IN_PROC_CD);				//��ƃR�[�h
				ps.setDouble(2,	Double.parseDouble(ginPARTIAL_PRD_NO));		//�����
				ps.setDouble(3,	Double.parseDouble(ginOPR_RSLT_CRCT_NO)	-1);	//��Ǝ��ђ�����
			} else {
				ps.setString(1,	ginWORK_ODR_CD);				//��ƌv��ԍ�
				ps.setString(2,	ginWORK_IN_PROC_CD);				//��ƃR�[�h
				ps.setDouble(3,	Double.parseDouble(ginPARTIAL_PRD_NO));		//�����
				ps.setDouble(4,	Double.parseDouble(ginOPR_RSLT_CRCT_NO)	-1);	//��Ǝ��ђ�����
			}
			
//200031017�C��			ps.setString(1,	ginWORK_ODR_CD);				//��ƌv��ԍ�
//200031017�C��			ps.setString(2,	ginWORK_IN_PROC_CD);				//��ƃR�[�h
//200031017�C��			ps.setDouble(3,	Double.parseDouble(ginPARTIAL_PRD_NO));		//�����
//200031017�C��			ps.setDouble(4,	Double.parseDouble(ginOPR_RSLT_CRCT_NO)	-1);	//��Ǝ��ђ�����

//20031104			_log.message(sql);
			rs = ps.executeQuery();

//20031121�C���J�n
			while (rs.next())
			{
				sRC	= JDB0003(rs);
				//DEBUG
				//�o�ɏ������Ăяo��
				_log.message("(SBM1199)�o�ɏ������Ăяo��......");
				_IssueProcess = new IssueProcess(_iconn, sRC);
				_IssueProcess.execProcess();
			}
//20031121�C���I��

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121�C���J�n
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
//20031121�C���I��
//			if (rs != null)
//			{
//				rs.close();
//			}
//			if (ps != null)
//			{
//				ps.close();
//			}
		}
	};

	//2.10.3.1	�o�ɍώ����o�ɕi�ڂ̏o�Ɏ������ �u�����ԍ��v��NotNull�̏ꍇ
	//	�s�u�����ԍ��v��NotNull�̏ꍇ��[�ۊǋ�ʓ��o��]�ɑ΂��錟�������t
	//	[�ۊǋ�ʓ��o��]."�����ԍ�"���u�����ԍ��v
	//	[�ۊǋ�ʓ��o��]."�����"���u����񐔁v
	//	[�ۊǋ�ʓ��o��]."������ђ�����"���u��������񐔁v�|�P
	//	[�ۊǋ�ʓ��o��]."�݌ɍX�V�敪"��2�i�X�V�ρj
	//	[�ۊǋ�ʓ��o��]."���o�ɊǗ��ԍ�"�̏���
	//	[�o�Ɏw��]��1."�o�Ɏw���o�ɋ敪"��3(�����o��)
//	private	ResultSet JDB0002()
	private	void JDB0002()
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sRC = "";
		try
		{
			_log.methodStart();
			// << �ۊǋ�ʓ��o�ɂ̌��� >>
			sql	= "select "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD, "
				+" T_RCV_ISSUE.RCV_ISSUE_TYP as RCV_ISSUE_TYP,"
				+" T_RCV_ISSUE.ITEM_CD as ITEM_CD,"
				+" T_RCV_ISSUE.PLANT_CD as PLANT_CD,"
				+" T_RCV_ISSUE.WH_CD as WH_CD,"
				+" T_RCV_ISSUE.JOB_ODR_CD as JOB_ODR_CD,"
				+" T_RCV_ISSUE.JOB_ODR_DETAIL_NO as JOB_ODR_DETAIL_NO,"
				+" T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD,"
				+" T_RCV_ISSUE.ACPT_NO as ACPT_NO,"
				+" T_RCV_ISSUE.ACPT_RSLT_CRCT_NO as ACPT_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO as INSPEC_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.WORK_ODR_CD as WORK_ODR_CD,"
				+" T_RCV_ISSUE.WORK_IN_PROC_CD as WORK_IN_PROC_CD,"
				+" T_RCV_ISSUE.PARTIAL_PRD_NO as PARTIAL_PRD_NO,"
				+" T_RCV_ISSUE.OPR_RSLT_CRCT_NO as OPR_RSLT_CRCT_NO,"
				+" T_RCV_ISSUE.ISSUE_INST_CD as ISSUE_INST_CD,"
				+" T_RCV_ISSUE.RCV_ISSUE_QTY as RCV_ISSUE_QTY,"
				+" T_RCV_ISSUE.RCV_ISSUE_AMOUNT as RCV_ISSUE_AMOUNT,"
				+" T_RCV_ISSUE.RCV_ISSUE_DATE as RCV_ISSUE_DATE,"
				+" T_RCV_ISSUE.RCV_ISSUE_GNR_TYP as RCV_ISSUE_GNR_TYP,"
				+" T_RCV_ISSUE.RCV_ISSUE_ODD_QTY as RCV_ISSUE_ODD_QTY,"
				+" T_RCV_ISSUE.DEFECT_CAUSE_CD as DEFECT_CAUSE_CD,"
				+" T_RCV_ISSUE.STOCK_UPD_TYP as STOCK_UPD_TYP,"
				+" T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG as RCV_ISSUE_CMPLT_FLG,"
				+" T_RCV_ISSUE.OD_NO as OD_NO,"
				+" T_RCV_ISSUE.VEND_LOT_NO as VEND_LOT_NO,"
				+" T_RCV_ISSUE.RCV_ISSUE_COMMENT as RCV_ISSUE_COMMENT,"
				+" T_RCV_ISSUE.COMPANY_CD as COMPANY_CD,"
				+" T_RCV_ISSUE.VEND_CD as VEND_CD,"
				+" T_RCV_ISSUE.CONS_TYP as CONS_TYP,"
				+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE,"
				+" T_RCV_ISSUE.CREATED_DATE as CREATED_DATE,"
				+" T_RCV_ISSUE.CREATED_BY as CREATED_BY,"
				+" T_RCV_ISSUE.CREATED_PRG_NM as CREATED_PRG_NM,"
				+" T_RCV_ISSUE.UPDATED_DATE as UPDATED_DATE,"
				+" T_RCV_ISSUE.UPDATED_BY as UPDATED_BY,"
				+" T_RCV_ISSUE.UPDATED_PRG_NM as UPDATED_PRG_NM,"
				+" T_RCV_ISSUE.MODIFY_COUNT as MODIFY_COUNT "
				+"from "
				+" T_RCV_ISSUE , T_ISSUE_INST "
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD"
				+" and T_RCV_ISSUE.PUCH_ODR_CD = ?"
				+" and T_RCV_ISSUE.ACPT_NO = ?"
				+" and T_RCV_ISSUE.ACPT_RSLT_CRCT_NO = ?"
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2"
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+"order by "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	ginPUCH_ODR_CD);								//�����ԍ�
			ps.setDouble(2,	Double.parseDouble(ginACPT_NO));				//�����
			ps.setDouble(3,	Double.parseDouble(ginACPT_RSLT_CRCT_NO) - 1);	//���������
//20031104			_log.message(sql);
			rs = ps.executeQuery();

//20031121�C���J�n
			while (rs.next())
			{
				sRC	= JDB0003(rs);
				//DEBUG
				//�o�ɏ���
				_log.message("(SBM1199)�o�ɏ������Ăяo��......");
				_IssueProcess = new IssueProcess(_iconn, sRC);
				_IssueProcess.execProcess();
			}
//20031121�C���I��

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121�C���J�n
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
//20031121�C���I��
//			if (rs != null)
//			{
//				rs.close();
//			}
//			if (ps != null)
//			{
//				ps.close();
//			}
		}
	};

	//[�ۊǋ�ʓ��o��]�ւ̒ǉ����e
	private	String JDB0003(ResultSet rs	)
			throws SQLException,Exception{
		String strOdrCd="";
		String sql="";
		PreparedStatement ps=null;
		int	iIndex = 1;
		CollectNumber ODR_CD=null;

		try
		{
			_log.methodStart();
			//���o�ɔԍ��̍̔�
			ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD	,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
			strOdrCd = ODR_CD.getNo();

			// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
			sql	= "insert into "
				+" T_RCV_ISSUE( "
				+" RCV_ISSUE_CTRL_CD,"			//	���o�ɊǗ��ԍ�
				+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
				+	"ITEM_CD,"			//	�i�ڔԍ�
				+	"PLANT_CD,"			//	�H��R�[�h
				+	"WH_CD,"			//	�ۊǋ�R�[�h
				+	"JOB_ODR_CD,"			//	����
				+	"JOB_ODR_DETAIL_NO,"		//	���Ԏ}��
				+	"PUCH_ODR_CD,"			//	�����ԍ�
				+	"ACPT_NO,"			//	�����
				+	"ACPT_RSLT_CRCT_NO,"		//	������ђ�����
				+	"INSPEC_RSLT_CRCT_NO,"		//	�������ђ�����
				+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
				+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
				+	"PARTIAL_PRD_NO,"		//	�����
				+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
				+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
				+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
				+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
				+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
				+	"RCV_ISSUE_GNR_TYP,"		//	���o�ɔ����敪
				+	"RCV_ISSUE_ODD_QTY,"		//	���o�ɒ[��
				+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
				+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
				+	"RCV_ISSUE_CMPLT_FLG,"		//	���o�Ɋ����t���O
				+	"OD_NO,"			//	�I�[�_�f�}���h�ԍ�
				+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
				+	"RCV_ISSUE_COMMENT,"		//	���o�ɔ��l
				+	"COMPANY_CD,"			//	��ЃR�[�h
				+	"VEND_CD,"			//	�����R�[�h
				+	"CONS_TYP,"			//	�x���敪
				+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//				+	"CREATED_DATE,"			//	�쐬��
				+	"CREATED_BY,"			//	�쐬��
				+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//				+	"UPDATED_DATE,"			//	�X�V��
				+	"UPDATED_BY,"			//	�X�V��
				+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
				+	"MODIFY_COUNT) "		//	�X�V��
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = _conn.prepareStatement(sql);

			ps.setString(iIndex++, strOdrCd);								//	���o�ɊǗ��ԍ�
			ps.setDouble(iIndex++, 2);										//	���o�ɋ敪
			ps.setString(iIndex++, rs.getString("ITEM_CD"));				//	�i�ڔԍ�
			ps.setString(iIndex++, rs.getString("PLANT_CD"));				//	�H��R�[�h
			ps.setString(iIndex++, rs.getString("WH_CD"));					//	�ۊǋ�R�[�h
			ps.setString(iIndex++, rs.getString("JOB_ODR_CD"));				//	����
			ps.setDouble(iIndex++, rs.getDouble("JOB_ODR_DETAIL_NO"));		//	���Ԏ}��
			ps.setString(iIndex++, rs.getString("PUCH_ODR_CD"));			//	�����ԍ�
			ps.setDouble(iIndex++, rs.getDouble("ACPT_NO"));				//	�����
			ps.setDouble(iIndex++, rs.getDouble("ACPT_RSLT_CRCT_NO"));		//	������ђ�����
			ps.setDouble(iIndex++, rs.getDouble("INSPEC_RSLT_CRCT_NO"));	//	�������ђ�����
			ps.setString(iIndex++, rs.getString("WORK_ODR_CD"));			//	��ƌv��ԍ�
			ps.setString(iIndex++, rs.getString("WORK_IN_PROC_CD"));		//	�d�|��ƃR�[�h
			ps.setDouble(iIndex++, rs.getDouble("PARTIAL_PRD_NO"));			//	�����
			ps.setDouble(iIndex++, rs.getDouble("OPR_RSLT_CRCT_NO"));		//	��Ǝ��ђ�����
			ps.setString(iIndex++, rs.getString("ISSUE_INST_CD"));			//	�o�Ɏw���ԍ�
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_QTY") * -1);		//	���o�ɐ�
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_AMOUNT"));		//	���o�ɋ��z
			ps.setDate(iIndex++, rs.getDate("RCV_ISSUE_DATE"));				//	���o�ɔN����
			ps.setDouble(iIndex++, 29);										//	���o�ɔ����敪
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_ODD_QTY"));		//	���o�ɒ[��
			ps.setString(iIndex++, rs.getString("DEFECT_CAUSE_CD"));		//	���o�ɕs�Ǘ��R�R�[�h
			ps.setDouble(iIndex++, 1);										//	�݌ɍX�V�敪
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_CMPLT_FLG"));	//	���o�Ɋ����t���O
			ps.setString(iIndex++, rs.getString("OD_NO"));					//	�I�[�_�f�}���h�ԍ�
			//-----------------------------------------------------------------
			ps.setString(iIndex++, rs.getString("VEND_LOT_NO"));			//	���[�J���b�g�ԍ�
			ps.setString(iIndex++, rs.getString("RCV_ISSUE_COMMENT"));		//	���o�ɔ��l
			ps.setString(iIndex++, rs.getString("COMPANY_CD"));				//	��ЃR�[�h
			ps.setString(iIndex++, rs.getString("VEND_CD"));				//	�����R�[�h
			ps.setDouble(iIndex++, rs.getDouble("CONS_TYP"));				//	�x���敪
			ps.setDate(iIndex++, rs.getDate("CONS_EXEC_DATE"));				//	�L���x�����ђ��o��
//			ps.setDate(iIndex++, rs.getDate("CREATED_DATE"));				//	�쐬��
			ps.setString(iIndex++, rs.getString("CREATED_BY"));				//	�쐬��
			ps.setString(iIndex++, rs.getString("CREATED_PRG_NM"));			//	�쐬�v���O������
//			ps.setDate(iIndex++, rs.getDate("UPDATED_DATE"));				//	�X�V��
			ps.setString(iIndex++, rs.getString("UPDATED_BY"));				//	�X�V��
			ps.setString(iIndex++, rs.getString("UPDATED_PRG_NM"));			//	�X�V�v���O������
			ps.setString(iIndex++, rs.getString("MODIFY_COUNT"));			//	�X�V��

			htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);												//���o�ɊǗ��ԍ�
			htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");															//���o�ɋ敪
			if (rs.getString("ITEM_CD") == null)
			{
				htT_RCV_ISSUE.put("ITEM_CD","");
			}else{
				htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));											//�i�ڔԍ�
			}
			if (rs.getString("PLANT_CD") == null)
			{
				htT_RCV_ISSUE.put("PLANT_CD","");
			}else{
				htT_RCV_ISSUE.put("PLANT_CD",rs.getString("PLANT_CD"));											//�H��R�[�h
			}
			if (rs.getString("WH_CD") == null)
			{
				htT_RCV_ISSUE.put("WH_CD","");
			}else{
				htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));												//�ۊǋ�R�[�h
			}
			if (rs.getString("JOB_ODR_CD") == null)
			{
				htT_RCV_ISSUE.put("JOB_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("JOB_ODR_CD",rs.getString("JOB_ODR_CD"));										//����
			}
			if (rs.getString("PUCH_ODR_CD") == null)
			{
				htT_RCV_ISSUE.put("PUCH_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("PUCH_ODR_CD",rs.getString("PUCH_ODR_CD"));									//�����ԍ�
			}
			if (rs.getString("WORK_ODR_CD") == null)
			{
				htT_RCV_ISSUE.put("WORK_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_ODR_CD",rs.getString("WORK_ODR_CD"));									//��ƌv��ԍ�
			}
			if (rs.getString("WORK_IN_PROC_CD") == null)
			{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD",rs.getString("WORK_IN_PROC_CD"));							//�d�|��ƃR�[�h
			}
			if (rs.getString("ISSUE_INST_CD") == null)
			{
				htT_RCV_ISSUE.put("ISSUE_INST_CD","");
			}else{
				htT_RCV_ISSUE.put("ISSUE_INST_CD",rs.getString("ISSUE_INST_CD"));								//�o�Ɏw���ԍ�
			}
			if (rs.getString("RCV_ISSUE_DATE") == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
			}else{
				
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE",Converter.dateToStr(rs.getDate("RCV_ISSUE_DATE"),Converter.SLASH_DATE));	//���o�ɔN����
			}
			if (rs.getString("DEFECT_CAUSE_CD") == null)
			{
				htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");
			}else{
				htT_RCV_ISSUE.put("DEFECT_CAUSE_CD",rs.getString("DEFECT_CAUSE_CD"));							//���o�ɕs�Ǘ��R�R�[�h
			}
			if (rs.getString("OD_NO") == null)
			{
				htT_RCV_ISSUE.put("OD_NO","");
			}else{
				htT_RCV_ISSUE.put("OD_NO",rs.getString("OD_NO"));												//�I�[�_�f�}���h�ԍ�
			}
			if (rs.getString("VEND_LOT_NO") == null)
			{
				htT_RCV_ISSUE.put("VEND_LOT_NO","");
			}else{
				htT_RCV_ISSUE.put("VEND_LOT_NO",rs.getString("VEND_LOT_NO"));									//���[�J���b�g�ԍ�
			}
			if (rs.getString("RCV_ISSUE_COMMENT") == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");
			}else{
				htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT",rs.getString("RCV_ISSUE_COMMENT"));						//���o�ɔ��l
			}
			if (rs.getString("COMPANY_CD") == null)
			{
				htT_RCV_ISSUE.put("COMPANY_CD","");
			}else{
				htT_RCV_ISSUE.put("COMPANY_CD",rs.getString("COMPANY_CD"));										//��ЃR�[�h
			}
			if (rs.getString("VEND_CD") == null)
			{
				htT_RCV_ISSUE.put("VEND_CD","");
			}else{
				htT_RCV_ISSUE.put("VEND_CD",rs.getString("VEND_CD"));											//�����R�[�h
			}
			if (rs.getString("CONS_EXEC_DATE") == null)
			{
				htT_RCV_ISSUE.put("CONS_EXEC_DATE","");
			}else{
				htT_RCV_ISSUE.put("CONS_EXEC_DATE",Converter.dateToStr(rs.getDate("CONS_EXEC_DATE"),Converter.SLASH_DATE));	//�L���x�����ђ��o��
			}
			htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO",Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO")));		//���Ԏ}��
			htT_RCV_ISSUE.put("ACPT_NO",Double.toString(rs.getDouble("ACPT_NO")));							//�����
			htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",Double.toString(rs.getDouble("ACPT_RSLT_CRCT_NO")));		//������ђ�����
			htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO",Double.toString(rs.getDouble("INSPEC_RSLT_CRCT_NO")));	//�������ђ�����
			htT_RCV_ISSUE.put("PARTIAL_PRD_NO",Double.toString(rs.getDouble("PARTIAL_PRD_NO")));			//�����
			htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",Double.toString(rs.getDouble("OPR_RSLT_CRCT_NO")));		//��Ǝ��ђ�����
			htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(rs.getDouble("RCV_ISSUE_QTY")	* -1));			//���o�ɐ�
			htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT",Double.toString(rs.getDouble("RCV_ISSUE_AMOUNT")));		//���o�ɋ��z
			htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","29");													//���o�ɔ����敪
			htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY",Double.toString(rs.getDouble("RCV_ISSUE_ODD_QTY")));		//���o�ɒ[��
			htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");															//�݌ɍX�V�敪
			htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",Double.toString(rs.getDouble("RCV_ISSUE_CMPLT_FLG")));	//���o�Ɋ����t���O
			htT_RCV_ISSUE.put("CONS_TYP",Double.toString(rs.getDouble("CONS_TYP")));						//�x���敪

			iIndex=ps.executeUpdate();
			ps.close();
			//DEBUG
//20031104			_log.message("�ۊǋ�ʓ��o�ɂ̓o�^��=["+iIndex+"]");

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return strOdrCd;
	};

	//2.10.4	�����o�ɑΏەi�ڂ̌���
	//�����o�ɏ����Ώەi�ڃZ�b�g��񐶐��i�����o�ɐ��̎Z�o�j
	private	double JDB0004(String sTyp)
		throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String lsTyp="";
		String sql="";
		double dIssueNO	= 0;
		int	iCount = 0;
		int	iIndex = 0;
		int	iTyp = 0;
		BigDecimal bdIssueNO0=null; //20031211
		BigDecimal bdIssueNO1=null;
		BigDecimal bdIssueNO2=null;
		BigDecimal bdIssueNO3=null;
		try
		{
			_log.methodStart();

			lsTyp =	sTyp;
			htIssueNO = new Hashtable();
			if (lsTyp.equals("1"))
			{
				//�����o�ɏ����Ώەi�ڌ����i�o�Ɏw���̎����o�ɂ̍�ƌv��ԍ������j
				//�s�u�����ԍ��v��Null�̂Ƃ��t
				//"��ƌv��ԍ�"���u��ƌv��ԍ��v
				//"��ƃR�[�h"���u��ƃR�[�h�v
				//"�o�ɋ敪"��3(�����o��)
				//"�o�Ɏw���ԍ�"�̏���
				if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals(""))
				{
					sql	= "SELECT T_ISSUE_INST.ISSUE_INST_CD, T_ISSUE_INST.PLANT_CD, T_ISSUE_INST.OD_NO, "
					+" T_ISSUE_INST.ITEM_CD, T_ISSUE_INST.PS_EDITION, T_ISSUE_INST.PUCH_ODR_CD, T_ISSUE_INST.COMPANY_CD, "
					+" T_ISSUE_INST.VEND_CD, T_ISSUE_INST.CONS_TYP, T_ISSUE_INST.WORK_ODR_CD, T_ISSUE_INST.WORK_IN_PROC_CD, "
					+" T_ISSUE_INST.WS_CD, T_ISSUE_INST.WH_CD, T_ISSUE_INST.ISSUE_INST_UNIT_QTY, T_ISSUE_INST.ISSUE_INST_UNIT_DENOMINATOR, "
					+" T_ISSUE_INST.ISSUE_INST_UNIT_NUMERATOR, T_ISSUE_INST.ISSUE_INST_QTY, T_ISSUE_INST.TOTAL_ISSUE_QTY, "
					+" T_ISSUE_INST.SCDL_ISSUE_DATE, T_ISSUE_INST.ISSUE_CMPLT_DATE, T_ISSUE_INST.ISSUE_TYP, T_ISSUE_INST.ISSUE_CMPLT_FLG, "
					+" T_ISSUE_INST.ISSUE_INST_ISS_FLG, T_ISSUE_INST.ISSUE_INST_ISS_DATE, T_ISSUE_INST.ISSUE_INST_COMMENT, "
					+" T_ISSUE_INST.CREATED_DATE, T_ISSUE_INST.CREATED_BY, T_ISSUE_INST.CREATED_PRG_NM, T_ISSUE_INST.UPDATED_DATE, "
					+" T_ISSUE_INST.UPDATED_BY, T_ISSUE_INST.UPDATED_PRG_NM, T_ISSUE_INST.MODIFY_COUNT "
					+" FROM T_ISSUE_INST "
//20031017�폜					+" WHERE (((T_ISSUE_INST.WORK_ODR_CD)=?) AND ((T_ISSUE_INST.WORK_IN_PROC_CD)=?) AND ((T_ISSUE_INST.ISSUE_TYP)=3)) "
					+" WHERE (((T_ISSUE_INST.WORK_ODR_CD)=?) AND ((T_ISSUE_INST.ISSUE_TYP)=3)) "
					+" ORDER BY T_ISSUE_INST.ISSUE_INST_CD " ;
				} else {
					sql	= "SELECT T_ISSUE_INST.ISSUE_INST_CD, T_ISSUE_INST.PLANT_CD, T_ISSUE_INST.OD_NO, "
					+" T_ISSUE_INST.ITEM_CD, T_ISSUE_INST.PS_EDITION, T_ISSUE_INST.PUCH_ODR_CD, T_ISSUE_INST.COMPANY_CD, "
					+" T_ISSUE_INST.VEND_CD, T_ISSUE_INST.CONS_TYP, T_ISSUE_INST.WORK_ODR_CD, T_ISSUE_INST.WORK_IN_PROC_CD, "
					+" T_ISSUE_INST.WS_CD, T_ISSUE_INST.WH_CD, T_ISSUE_INST.ISSUE_INST_UNIT_QTY, T_ISSUE_INST.ISSUE_INST_UNIT_DENOMINATOR, "
					+" T_ISSUE_INST.ISSUE_INST_UNIT_NUMERATOR, T_ISSUE_INST.ISSUE_INST_QTY, T_ISSUE_INST.TOTAL_ISSUE_QTY, "
					+" T_ISSUE_INST.SCDL_ISSUE_DATE, T_ISSUE_INST.ISSUE_CMPLT_DATE, T_ISSUE_INST.ISSUE_TYP, T_ISSUE_INST.ISSUE_CMPLT_FLG, "
					+" T_ISSUE_INST.ISSUE_INST_ISS_FLG, T_ISSUE_INST.ISSUE_INST_ISS_DATE, T_ISSUE_INST.ISSUE_INST_COMMENT, "
					+" T_ISSUE_INST.CREATED_DATE, T_ISSUE_INST.CREATED_BY, T_ISSUE_INST.CREATED_PRG_NM, T_ISSUE_INST.UPDATED_DATE, "
					+" T_ISSUE_INST.UPDATED_BY, T_ISSUE_INST.UPDATED_PRG_NM, T_ISSUE_INST.MODIFY_COUNT "
					+" FROM T_ISSUE_INST "
					+" WHERE (((T_ISSUE_INST.WORK_ODR_CD)=?) AND ((T_ISSUE_INST.WORK_IN_PROC_CD)=?) AND ((T_ISSUE_INST.ISSUE_TYP)=3)) "
					+" ORDER BY T_ISSUE_INST.ISSUE_INST_CD " ;
				}

				ps = _conn.prepareStatement(sql);
				ps.setString(1,	ginWORK_ODR_CD);
				if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals(""))
				{ 
				} else {
					ps.setString(2,	ginWORK_IN_PROC_CD);
				}
			} else if (lsTyp.equals("2"))
			{
				//�����o�ɏ����Ώەi�ڌ����i�o�Ɏw���̎����o�ɂ̔����ԍ������j
				//�s�u�����ԍ��v��Not Null�̂Ƃ��t
				//"�����ԍ�"���u�����ԍ��v
				//"�o�ɋ敪"��3(�����o��)
				//"�o�Ɏw���ԍ�"�̏���
				sql	= "SELECT T_ISSUE_INST.ISSUE_INST_CD, T_ISSUE_INST.PLANT_CD, T_ISSUE_INST.OD_NO, "
				+" T_ISSUE_INST.ITEM_CD, T_ISSUE_INST.PS_EDITION, T_ISSUE_INST.PUCH_ODR_CD, T_ISSUE_INST.COMPANY_CD, "
				+" T_ISSUE_INST.VEND_CD, T_ISSUE_INST.CONS_TYP, T_ISSUE_INST.WORK_ODR_CD, T_ISSUE_INST.WORK_IN_PROC_CD, "
				+" T_ISSUE_INST.WS_CD, T_ISSUE_INST.WH_CD, T_ISSUE_INST.ISSUE_INST_UNIT_QTY, T_ISSUE_INST.ISSUE_INST_UNIT_DENOMINATOR, "
				+" T_ISSUE_INST.ISSUE_INST_UNIT_NUMERATOR, T_ISSUE_INST.ISSUE_INST_QTY, T_ISSUE_INST.TOTAL_ISSUE_QTY, "
				+" T_ISSUE_INST.SCDL_ISSUE_DATE, T_ISSUE_INST.ISSUE_CMPLT_DATE, T_ISSUE_INST.ISSUE_TYP, T_ISSUE_INST.ISSUE_CMPLT_FLG, "
				+" T_ISSUE_INST.ISSUE_INST_ISS_FLG, T_ISSUE_INST.ISSUE_INST_ISS_DATE, T_ISSUE_INST.ISSUE_INST_COMMENT, "
				+" T_ISSUE_INST.CREATED_DATE, T_ISSUE_INST.CREATED_BY, T_ISSUE_INST.CREATED_PRG_NM, T_ISSUE_INST.UPDATED_DATE, "
				+" T_ISSUE_INST.UPDATED_BY, T_ISSUE_INST.UPDATED_PRG_NM, T_ISSUE_INST.MODIFY_COUNT "
				+" FROM T_ISSUE_INST "
				+" WHERE ((T_ISSUE_INST.PUCH_ODR_CD=?) AND (T_ISSUE_INST.ISSUE_TYP=3)) "
				+" ORDER BY T_ISSUE_INST.ISSUE_INST_CD " ;
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	ginPUCH_ODR_CD);
			}else{
				ps = _conn.prepareStatement(sql);
			}
			//DEBUG
//20031104			_log.message("�����o�ɏ����Ώەi�ڌ���(��ƌv��ԍ�����or�����ԍ�����)lsTyp=["+lsTyp+"]");
//20031104			_log.message("������=["+sql+"]");

			rs = ps.executeQuery();

			iCount = 0;
			while (rs.next())
			{
				iIndex = ++iCount;
				// �i�ڂ�����
				JDB0005(iIndex,	rs.getString("ITEM_CD"));

				//DEBUG
//20031104				_log.message("�o�Ɏw���P�ʐ����q=["+rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")+"]");
//20031104				_log.message("�o�Ɏw���P�ʐ�����=["+rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR")+"]");
				iTyp = Integer.parseInt((String)htUNIT_QTY_TYP.get(Integer.toString(iIndex)));

//20031211 ins ��
				//�����o�ɐ����Z�o
				bdIssueNO1 = new BigDecimal(ginRCV_ISSUE_RSLT_NO);
				bdIssueNO2 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_NUMERATOR"));
				bdIssueNO3 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_DENOMINATOR"));

				//�o�Ɏw���� =   �����w���� * �o�ɒP�ʐ����q / �o�ɒP�ʐ�����
				bdIssueNO0 = ((bdIssueNO1.multiply
								(bdIssueNO2)).divide
								(bdIssueNO3, 10, BigDecimal.ROUND_UP));

//20031211 ins ��

				if (iTyp ==	1)				// �����Ǘ�
				{
/* 20031211 del
					//�o�Ɏw���� =   �����w���� * �o�ɒP�ʐ����q / �o�ɒP�ʐ�����
					//�����؏グ
//20031017�C��					dIssueNO = Integer.parseInt(ginRCV_ISSUE_RSLT_NO) *	rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")
//20031017�C��								/ rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR");
					dIssueNO = Double.parseDouble(ginRCV_ISSUE_RSLT_NO) *	rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")
								/ rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR");
					htIssueNO.put(Integer.toString(iIndex),	Integer.toString((new Double(dIssueNO)).intValue()));
					//DEBUG
//20031104					_log.message("�����Ǘ�=["+dIssueNO+"]");
*/
					//�����؏グ
					bdIssueNO0 = bdIssueNO0.setScale(0,	BigDecimal.ROUND_UP); //20031211

				} else if (iTyp	== 2)		// �����Ǘ�
				{
/* 20031211
					//�o�ɒP�ʐ� = �e�f�[�^.�o�ɒP�ʐ� * �q�f�[�^�o�ɒP�ʐ�
					//������T�ʐ؏グ�؏グ
//20031211					bdIssueNO1 = new BigDecimal(Double.parseDouble(ginRCV_ISSUE_RSLT_NO));
//20031211					bdIssueNO2 = new BigDecimal(rs.getDouble("ISSUE_INST_UNIT_NUMERATOR"));
//20031211					bdIssueNO3 = new BigDecimal(rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR"));
					bdIssueNO1 = (bdIssueNO1.multiply
									(bdIssueNO2)).divide
									(bdIssueNO3,BigDecimal.ROUND_HALF_DOWN);
*/
					//������T�ʐ؏グ�؏グ
					bdIssueNO0 = bdIssueNO0.setScale(4,	BigDecimal.ROUND_UP);

//20031211					htIssueNO.put(Integer.toString(iIndex),	bdIssueNO1.toString());
					//DEBUG
//20031104					_log.message("�����Ǘ�=["+bdIssueNO1.toString()+"]");
				}

				htIssueNO.put(Integer.toString(iIndex),	bdIssueNO0.toString()); //20031211
				dIssueNO = Double.parseDouble(bdIssueNO0.toString()); //20031211

				//�ق������擾
				htT_ISSUE_INST = new Hashtable();
				if (rs.getString("ISSUE_INST_CD") == null)
				{
					htT_ISSUE_INST.put("ISSUE_INST_CD",	"");									//�o�Ɏw���ԍ�
				}else{
					htT_ISSUE_INST.put("ISSUE_INST_CD",	rs.getString("ISSUE_INST_CD"));									//�o�Ɏw���ԍ�
				}
				if (rs.getString("PLANT_CD") == null)
				{
					htT_ISSUE_INST.put("PLANT_CD",	"");		
				}else{
					htT_ISSUE_INST.put("PLANT_CD",	rs.getString("PLANT_CD"));			
				}
				if (rs.getString("OD_NO") == null)
				{
					htT_ISSUE_INST.put("OD_NO",	"");		
				}else{
					htT_ISSUE_INST.put("OD_NO",	rs.getString("OD_NO"));
				}
				if (rs.getString("ITEM_CD") == null)
				{
					htT_ISSUE_INST.put("ITEM_CD",	"");		
				}else{
					htT_ISSUE_INST.put("ITEM_CD",	rs.getString("ITEM_CD"));			
				}
				if (rs.getString("PS_EDITION") == null)
				{
					htT_ISSUE_INST.put("PS_EDITION",	"");		
				}else{
					htT_ISSUE_INST.put("PS_EDITION",	rs.getString("PS_EDITION"));			
				}
				if (rs.getString("PUCH_ODR_CD") == null)
				{
					htT_ISSUE_INST.put("PUCH_ODR_CD",	"");		
				}else{
					htT_ISSUE_INST.put("PUCH_ODR_CD",	rs.getString("PUCH_ODR_CD"));			
				}
				if (rs.getString("COMPANY_CD") == null)
				{
					htT_ISSUE_INST.put("COMPANY_CD",	"");		
				}else{
					htT_ISSUE_INST.put("COMPANY_CD",	rs.getString("COMPANY_CD"));			
				}
				if (rs.getString("VEND_CD") == null)
				{
					htT_ISSUE_INST.put("VEND_CD",	"");		
				}else{
					htT_ISSUE_INST.put("VEND_CD",	rs.getString("VEND_CD"));			
				}
				if (rs.getString("WORK_ODR_CD") == null)
				{
					htT_ISSUE_INST.put("WORK_ODR_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WORK_ODR_CD",	rs.getString("WORK_ODR_CD"));			
				}
				if (rs.getString("WORK_IN_PROC_CD") == null)
				{
					htT_ISSUE_INST.put("WORK_IN_PROC_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WORK_IN_PROC_CD",	rs.getString("WORK_IN_PROC_CD"));			
				}
				if (rs.getString("WS_CD") == null)
				{
					htT_ISSUE_INST.put("WS_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WS_CD",	rs.getString("WS_CD"));			
				}
				if (rs.getString("WH_CD") == null)
				{
					htT_ISSUE_INST.put("WH_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WH_CD",	rs.getString("WH_CD"));			
				}
				if (rs.getString("SCDL_ISSUE_DATE") == null)
				{
					htT_ISSUE_INST.put("SCDL_ISSUE_DATE",	"");		
				}else{
					htT_ISSUE_INST.put("SCDL_ISSUE_DATE",
						Converter.dateToStr(rs.getDate("SCDL_ISSUE_DATE"),Converter.SLASH_DATE));								//�o�ɗ\���
				}
				if (rs.getString("ISSUE_CMPLT_DATE") == null)
				{
					htT_ISSUE_INST.put("ISSUE_CMPLT_DATE",	"");		
				}else{
					htT_ISSUE_INST.put("ISSUE_CMPLT_DATE",
						Converter.dateToStr(rs.getDate("ISSUE_CMPLT_DATE"),Converter.SLASH_DATE));							//�o�Ɋ�����
				}
				if (rs.getString("ISSUE_INST_ISS_DATE") == null)
				{
					htT_ISSUE_INST.put("ISSUE_INST_ISS_DATE",	"");		
				}else{
					htT_ISSUE_INST.put("ISSUE_INST_ISS_DATE",
						Converter.dateToStr(rs.getDate("ISSUE_INST_ISS_DATE"),Converter.SLASH_DATE));						//�o�Ɏw�������s��
				}
				if (rs.getString("ISSUE_INST_COMMENT") == null)
				{
					htT_ISSUE_INST.put("ISSUE_INST_COMMENT",	"");		
				}else{
					htT_ISSUE_INST.put("ISSUE_INST_COMMENT",	rs.getString("ISSUE_INST_COMMENT"));			
				}

//				htT_ISSUE_INST.put("PLANT_CD", rs.getString("PLANT_CD"));											//�H��R�[�h
//				htT_ISSUE_INST.put("OD_NO",	rs.getString("OD_NO"));													//�I�[�_�f�}���h�ԍ�
//				htT_ISSUE_INST.put("ITEM_CD", rs.getString("ITEM_CD"));												//�o�ɕi�ڔԍ�
//				htT_ISSUE_INST.put("PS_EDITION", rs.getString("PS_EDITION"));										//�o�ɕi�ڍ\���Ő�
//				htT_ISSUE_INST.put("PUCH_ODR_CD", rs.getString("PUCH_ODR_CD"));										//�����ԍ�
//				htT_ISSUE_INST.put("COMPANY_CD", rs.getString("COMPANY_CD"));										//��ЃR�[�h
//				htT_ISSUE_INST.put("VEND_CD", rs.getString("VEND_CD"));												//�����R�[�h
				htT_ISSUE_INST.put("CONS_TYP", Double.toString(rs.getDouble("CONS_TYP")));							//�x���敪
//				htT_ISSUE_INST.put("WORK_ODR_CD", rs.getString("WORK_ODR_CD"));										//��ƌv��ԍ�
//				htT_ISSUE_INST.put("WORK_IN_PROC_CD", rs.getString("WORK_IN_PROC_CD"));								//�d�|��ƃR�[�h
//				htT_ISSUE_INST.put("WS_CD",	rs.getString("WS_CD"));													//��Ƌ�R�[�h
//				htT_ISSUE_INST.put("WH_CD",	rs.getString("WH_CD"));													//�H���ۊǏꏊ�R�[�h
				htT_ISSUE_INST.put("ISSUE_INST_UNIT_QTY", Double.toString(rs.getDouble("ISSUE_INST_UNIT_QTY")));	//�o�Ɏw���P�ʐ�
				htT_ISSUE_INST.put("ISSUE_INST_UNIT_DENOMINATOR", Double.toString(rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR")));		//�o�Ɏw���P�ʐ�����
				htT_ISSUE_INST.put("ISSUE_INST_UNIT_NUMERATOR",	Double.toString(rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")));			//�o�Ɏw���P�ʐ����q
				htT_ISSUE_INST.put("ISSUE_INST_QTY", Double.toString(rs.getDouble("ISSUE_INST_QTY")));								//�o�Ɏw����
				htT_ISSUE_INST.put("TOTAL_ISSUE_QTY", Double.toString(rs.getDouble("TOTAL_ISSUE_QTY")));								//�o�ɗ݌v��
//				htT_ISSUE_INST.put("SCDL_ISSUE_DATE",
//					Converter.dateToStr(rs.getDate("SCDL_ISSUE_DATE"),Converter.SLASH_DATE));								//�o�ɗ\���
//				htT_ISSUE_INST.put("ISSUE_CMPLT_DATE",
//					Converter.dateToStr(rs.getDate("ISSUE_CMPLT_DATE"),Converter.SLASH_DATE));							//�o�Ɋ�����
				htT_ISSUE_INST.put("ISSUE_TYP",	Double.toString(rs.getDouble("ISSUE_TYP")));						//�o�Ɏw���o�ɋ敪
				htT_ISSUE_INST.put("ISSUE_CMPLT_FLG", Double.toString(rs.getDouble("ISSUE_CMPLT_FLG")));			//�o�Ɋ����t���O
				htT_ISSUE_INST.put("ISSUE_INST_ISS_FLG", Double.toString(rs.getDouble("ISSUE_INST_ISS_FLG")));		//�o�Ɏw�������s�ς݃t���O
//				htT_ISSUE_INST.put("ISSUE_INST_ISS_DATE",
//					Converter.dateToStr(rs.getDate("ISSUE_INST_ISS_DATE"),Converter.SLASH_DATE));						//�o�Ɏw�������s��
//				htT_ISSUE_INST.put("ISSUE_INST_COMMENT", rs.getString("ISSUE_INST_COMMENT"));						//�o�Ɏw�����l
	//			htT_ISSUE_INST.put("CREATED_DATE", rs.getString("CREATED_DATE"));									//�쐬��
	//			htT_ISSUE_INST.put("CREATED_BY", rs.getString("CREATED_BY"));										//�쐬��
	//			htT_ISSUE_INST.put("CREATED_PRG_NM", rs.getString("CREATED_PRG_NM"));								//�쐬�v���O������
	//			htT_ISSUE_INST.put("UPDATED_DATE", rs.getString("UPDATED_DATE"));									//�X�V��
	//			htT_ISSUE_INST.put("UPDATED_BY", rs.getString("UPDATED_BY"));										//�X�V��
	//			htT_ISSUE_INST.put("UPDATED_PRG_NM", rs.getString("UPDATED_PRG_NM"));								//�X�V�v���O������
	//			htT_ISSUE_INST.put("MODIFY_COUNT", rs.getString("MODIFY_COUNT"));									//�X�V��
				alT_ISSUE_INST.add(htT_ISSUE_INST);
	//			  htISSUE_INST_CD.put(Integer.toString(iIndex),	rs.getString("ISSUE_INST_CD"));	  //�o�Ɏw���ԍ�
	//			  htPLANT_CD.put(Integer.toString(iIndex), rs.getString("PLANT_CD"));			  //�H��R�[�h
	//			  htOD_NO.put(Integer.toString(iIndex),	rs.getString("OD_NO"));					  //�I�[�_�f�}���h�ԍ�
	//			  htITEM_CD.put(Integer.toString(iIndex), rs.getString("ITEM_CD"));				  //�o�ɕi�ڔԍ�
			};
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dIssueNO;
	};

	// �i�ڂ�����
	private	void JDB0005(int iIndex, String	sITEM_CD)
		throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String lsTyp="";
		String sql="";
		try
		{
			_log.methodStart();
			// �i�ڂ�����
			sql	= "SELECT M_ITEM.ITEM_CD, M_ITEM.UNIT_QTY_TYP, M_ITEM.MRP_ODR_TYP "
				+ " FROM M_ITEM "
				+ " WHERE ((M_ITEM.ITEM_CD=?)) ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	sITEM_CD);
			rs = ps.executeQuery();
			if (rs.next())
			{
				htUNIT_QTY_TYP.put(Integer.toString(iIndex), Integer.toString((new Double(rs.getDouble("UNIT_QTY_TYP"))).intValue()));	//�݌ɐ��P�ʋ敪
				htMRP_ODR_TYP.put(Integer.toString(iIndex),Integer.toString((new Double(rs.getDouble("MRP_ODR_TYP"))).intValue()));		//�i�ڎ�z�敪
			}
			//DEBUG
//20031104			_log.message("iIndex=["+iIndex+"]");
//20031104			_log.message("�i�ځE�i�ڔԍ�sITEM_CD=["+sITEM_CD+"]");
//20031104			_log.message("�i�ځE�݌ɐ��P�ʋ敪htUNIT_QTY_TYP=["+rs.getDouble("UNIT_QTY_TYP")+"]");
//20031104			_log.message("�i�ځE�i�ڎ�z�敪htMRP_ODR_TYP=["+rs.getDouble("MRP_ODR_TYP")+"]");
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}

		return ;
	};


	//2.10.5	�u�����Ώێ��ѐ��v��Zero�̂Ƃ�
	// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
	private	String JDB0006(int iInIndex)
			throws SQLException,Exception{
		String strOdrCd="";
		String sql="";
		PreparedStatement ps=null;
		java.util.Date dtDate = null;
		int	iIndex = 1;
		Hashtable htT =	new	Hashtable();
		CollectNumber ODR_CD=null;
		try
		{
			_log.methodStart();
//System.out.println("start������������������������������������������������������������");
//System.out.println("<< �ۊǋ�ʓ��o�ɂ̓o�^ >>");
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			//���o�ɔԍ��̍̔�
			ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD	,
				_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
			strOdrCd = ODR_CD.getNo();

			// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
			sql	= "insert into "
				+"	T_RCV_ISSUE( "
				+" RCV_ISSUE_CTRL_CD,"		//	���o�ɊǗ��ԍ�
				+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
				+	"ITEM_CD,"				//	�i�ڔԍ�
				+	"PLANT_CD,"				//	�H��R�[�h
				+	"WH_CD,"				//	�ۊǋ�R�[�h
				+	"JOB_ODR_CD,"			//	����
				+	"JOB_ODR_DETAIL_NO,"	//	���Ԏ}��
				+	"PUCH_ODR_CD,"			//	�����ԍ�
				+	"ACPT_NO,"				//	�����
				+	"ACPT_RSLT_CRCT_NO,"	//	������ђ�����
				+	"INSPEC_RSLT_CRCT_NO,"	//	�������ђ�����
				+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
				+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
				+	"PARTIAL_PRD_NO,"		//	�����
				+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
				+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
				+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
				+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
				+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
				+	"RCV_ISSUE_GNR_TYP,"	//	���o�ɔ����敪
				+	"RCV_ISSUE_ODD_QTY,"	//	���o�ɒ[��
				+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
				+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
				+	"RCV_ISSUE_CMPLT_FLG,"	//	���o�Ɋ����t���O
				+	"OD_NO,"				//	�I�[�_�f�}���h�ԍ�
				+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
				+	"RCV_ISSUE_COMMENT,"	//	���o�ɔ��l
				+	"COMPANY_CD,"			//	��ЃR�[�h
				+	"VEND_CD,"				//	�����R�[�h
				+	"CONS_TYP,"				//	�x���敪
				+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//				+	"CREATED_DATE,"			//	�쐬��
				+	"CREATED_BY,"			//	�쐬��
				+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//				+	"UPDATED_DATE,"			//	�X�V��
				+	"UPDATED_BY,"			//	�X�V��
				+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
				+	"MODIFY_COUNT)	 "		//	�X�V��
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
					+" ?, ?, ?, ?, ?)";
			ps = _conn.prepareStatement(sql);

			ps.setString(iIndex++, strOdrCd);												//	���o�ɊǗ��ԍ�
			ps.setDouble(iIndex++, 2);														//	���o�ɋ敪
			ps.setString(iIndex++, (String)htT.get("ITEM_CD"));								//	�i�ڔԍ�
			ps.setString(iIndex++, (String)htT.get("PLANT_CD"));							//	�H��R�[�h
			ps.setNull(iIndex++,Types.VARCHAR);												//	�ۊǋ�R�[�h
			ps.setNull(iIndex++,Types.VARCHAR);												//	����
			ps.setDouble(iIndex++,0);														//	���Ԏ}��
			ps.setString(iIndex++, ginPUCH_ODR_CD);											//	�����ԍ�
			ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));							//	�����
			ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	���������
			ps.setDouble(iIndex++, 0);														//	�������ђ�����
			ps.setString(iIndex++, ginWORK_ODR_CD);											//	��ƌv��ԍ�
			ps.setString(iIndex++, ginWORK_IN_PROC_CD);										//	�d�|��ƃR�[�h
			ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	�����
			ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	��Ǝ��ђ�����
			ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));						//	�o�Ɏw���ԍ�
			ps.setDouble(iIndex++, 0);														//	���o�ɐ�
			ps.setDouble(iIndex++, 0);														//	���o�ɋ��z
			dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  ���o�ɔN����????????
//			ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//	���o�ɔN���� ????
			ps.setDouble(iIndex++, 21);														//	���o�ɔ����敪
			ps.setDouble(iIndex++, 0);														//	���o�ɒ[��
			ps.setNull(iIndex++, Types.VARCHAR);											//	���o�ɕs�Ǘ��R�R�[�h
//20031103	ps.setDouble(iIndex++, 1);														//	�݌ɍX�V�敪
			ps.setDouble(iIndex++, 2);														//	�݌ɍX�V�敪(�X�V�ς�)
			ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	���o�Ɋ����t���O
			ps.setString(iIndex++, (String)htT.get("OD_NO"));								//	�I�[�_�f�}���h�ԍ�
			//-----------------------------------------------------------------
			ps.setString(iIndex++, "");														//	���[�J���b�g�ԍ�
			ps.setString(iIndex++, "");														//	���o�ɔ��l
			ps.setString(iIndex++, "");														//	��ЃR�[�h
			ps.setString(iIndex++, "");														//	�����R�[�h
			ps.setDouble(iIndex++, 0);														//	�x���敪
			ps.setNull(iIndex++, Types.DATE);												//	�L���x�����ђ��o��
	//			ps.setDate(iIndex++, "");		//	�쐬��
				ps.setString(iIndex++, _userInfo.getUserId());			//	�쐬��
				ps.setString(iIndex++, _userInfo.getBusinessName());	//	�쐬�v���O������
	//			ps.setString(iIndex++, "");		//	�X�V��
				ps.setString(iIndex++, _userInfo.getUserId());			//	�X�V��
				ps.setString(iIndex++, _userInfo.getBusinessName());	//	�X�V�v���O������
				ps.setDouble(iIndex++, 0);		//	�X�V��

			iIndex=ps.executeUpdate();
			ps.close();
			if ( ginPUCH_ODR_CD== null)
			{
				htT_RCV_ISSUE.put("PUCH_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);					//�����ԍ�
			}
			if ( ginACPT_NO== null)
			{
				htT_RCV_ISSUE.put("ACPT_NO","");
			}else{
				htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);							//�����
			}
			if ( ginACPT_RSLT_CRCT_NO== null)
			{
				htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
			}else{
				htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);		//������ђ�����
			}
			if (ginWORK_ODR_CD == null)
			{
				htT_RCV_ISSUE.put("WORK_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);					//��ƌv��ԍ�
			}
			if (ginWORK_IN_PROC_CD == null)
			{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);			//�d�|��ƃR�[�h
			}
			if (ginPARTIAL_PRD_NO == null)
			{
				htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
			}else{
				htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);				//�����
			}
			if (ginOPR_RSLT_CRCT_NO == null)
			{
				htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
			}else{
				htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);			//��Ǝ��ђ�����
			}
			if (ginRCV_ISSUE_DATE == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
			}else{
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);				//���o�ɔN����
			}
			if (ginRCV_ISSUE_CMPLT_FLG == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
			}else{
				htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);	//���o�Ɋ����t���O
			}

			htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);					//���o�ɊǗ��ԍ�
			htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");								//���o�ɋ敪
			htT_RCV_ISSUE.put("ITEM_CD",(String)htT.get("ITEM_CD"));			//�i�ڔԍ�
			htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));			//�H��R�[�h
			htT_RCV_ISSUE.put("WH_CD","");										//�ۊǋ�R�[�h
			htT_RCV_ISSUE.put("JOB_ODR_CD","");									//����
			htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");							//���Ԏ}��
			htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");						//�������ђ�����
			htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));//�o�Ɏw���ԍ�
			htT_RCV_ISSUE.put("RCV_ISSUE_QTY","0");								//���o�ɐ�
			htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");							//���o�ɋ��z
			htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");						//���o�ɔ����敪
			htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");							//���o�ɒ[��
			htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");							//���o�ɕs�Ǘ��R�R�[�h
			htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");								//�݌ɍX�V�敪
			htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));				//�I�[�_�f�}���h�ԍ�
			htT_RCV_ISSUE.put("VEND_LOT_NO","");								//���[�J���b�g�ԍ�
			htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");							//���o�ɔ��l
			htT_RCV_ISSUE.put("COMPANY_CD","");									//��ЃR�[�h
			htT_RCV_ISSUE.put("VEND_CD","");									//�����R�[�h
			htT_RCV_ISSUE.put("CONS_TYP","");									//�x���敪
			htT_RCV_ISSUE.put("CONS_EXEC_DATE","");								//�L���x�����ђ��o��

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return strOdrCd;
	};

//20031121�C���J�n
/*
	//�i�ڕʕۊǐ�D�揇�ʂ̌���
	private	ResultSet JDB0007(int iIndex)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		Hashtable htT=null;
		String sITEM_CD="";
		String sPLANT_CD="";
		try
		{
			_log.methodStart();

			htT	= (Hashtable)alT_ISSUE_INST.get(iIndex-1);
			sITEM_CD = (String)htT.get("ITEM_CD");
			sPLANT_CD =	(String)htT.get("PLANT_CD");


			// << �i�ڕʕۊǐ�D�揇�ʂ̌��� >>
			sql	= "SELECT M_WH_PRIORITY.ITEM_CD, M_WH_PRIORITY.WH_CD, M_WH_PRIORITY.PLANT_CD, "
			+" M_WH_PRIORITY.WH_PRIORITY_REF_NO "
			+" FROM M_WH_PRIORITY "
			+" WHERE ((M_WH_PRIORITY.ITEM_CD=?) AND (M_WH_PRIORITY.PLANT_CD=?)) "
			+" ORDER BY WH_PRIORITY_REF_NO ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	sITEM_CD);
			ps.setString(2,	sPLANT_CD);
			rs = ps.executeQuery();

			//DEBUG
//20031104			_log.message("iIndex=["+iIndex+"]");
//20031104			_log.message("�i�ڕʕۊǐ�D�揇�ʁE�i�ځEsITEM_CD=["+sITEM_CD+"]");
//20031104			_log.message("�i�ڕʕۊǐ�D�揇�ʁE�H��R�[�h�EsPLANT_CD=["+sPLANT_CD+"]");
//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//			if (rs != null)
//			{
//				rs.close();
//			}
//			if (ps != null)
//			{
//				ps.close();
//			}
		}
		return rs;
	};
*/
//20031121�C���I��

	//�y�l�q�o�i�̕��o�ۊǋ�̏����z
//20031121�C���J�n
//	private	double	JDB0008(ResultSet rsIN, int iInIndex,	double	dInISSUE_NO, int iInTyp)
//			throws SQLException,Exception{
	private	double	JDB0008(int iInIndex,	double	dInISSUE_NO, int iInTyp)
			throws SQLException,Exception{
		ResultSet rsIN=null;
		PreparedStatement psIN=null;
		PreparedStatement psREAD=null;
//20031121�C���I��
		CollectNumber ODR_CD=null;
		String strOdrCd="";
		ResultSet rs=null;
		PreparedStatement ps=null;
		String sql="";
		int	iCount =0;
		int	iIndex =1;
		double	dIssueNO =0;
		double	dIssueNOOld	=0;
		double	dIssueCountTemp=0;
		Hashtable htT =	new	Hashtable();
		java.util.Date dtDate = null;

		String sITEM_CD_MIN	= "";				//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�
		String sWH_CD_MIN =	"";				//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�
		String sPLANT_CD_MIN = "";				//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�
		String sWH_PRIORITY_REF_NO_MIN = "";			//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�

		String sITEM_CD="";
		String sWH_CD="";
		String sPLANT_CD="";
		String sWH_PRIORITY_REF_NO="";
		String sPlantWH_CD = "";
		double dISSUECOUNT = 0;

		int WH_PRIORITY_FLG = 0;				//�i�ڕʕۊǐ�D�揇�ʃt���O�F�f�[�^���Ȃ��ꍇ�O�@20031012�ǋL

		try
		{
			_log.methodStart();

			//�����o�ɐ����擾
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);

//20031121�C���J�n
			// << �i�ڕʕۊǐ�D�揇�ʂ̌��� >>
			sql= "SELECT M_WH_PRIORITY.ITEM_CD, M_WH_PRIORITY.WH_CD, M_WH_PRIORITY.PLANT_CD, "
			+" M_WH_PRIORITY.WH_PRIORITY_REF_NO "
			+" FROM M_WH_PRIORITY "
			+" WHERE ((M_WH_PRIORITY.ITEM_CD=?) AND (M_WH_PRIORITY.PLANT_CD=?)) "
			+" ORDER BY WH_PRIORITY_REF_NO ";
			psIN = _conn.prepareStatement(sql);
			psIN.setString(1,	(String)htT.get("ITEM_CD"));
			psIN.setString(2,	(String)htT.get("PLANT_CD"));
			rsIN = psIN.executeQuery();
//20031121�C���I��

			dIssueNO = dInISSUE_NO;
			dIssueNOOld	= dIssueNO;

			//DEBUG
//20031104			_log.message("�L���x������o�^����");
//20031104			_log.message("�o�Ɏw���E�����ԍ��EPUCH_ODR_CD=["+(String)htT.get("PUCH_ODR_CD")+"]");
//20031104			_log.message("�o�Ɏw���E��ƌv��ԍ��EWORK_ODR_CD=["+(String)htT.get("WORK_ODR_CD")+"]");
//20031104			_log.message("�o�Ɏw���E�x���敪�ECONS_TYP=["+(String)htT.get("CONS_TYP")+"]");

			while (rsIN.next())
			{

				WH_PRIORITY_FLG = 1;

				sITEM_CD=rsIN.getString("ITEM_CD");
				sWH_CD=rsIN.getString("WH_CD");
				sPLANT_CD=rsIN.getString("PLANT_CD");
				sWH_PRIORITY_REF_NO=rsIN.getString("WH_PRIORITY_REF_NO");
				if (sWH_CD_MIN.equals(""))
				{
					sITEM_CD_MIN=rsIN.getString("ITEM_CD");
					sWH_CD_MIN=rsIN.getString("WH_CD");
					sPLANT_CD_MIN=rsIN.getString("PLANT_CD");
					sWH_PRIORITY_REF_NO_MIN=rsIN.getString("WH_PRIORITY_REF_NO");
				}
				//DEBUG
//20031104				_log.message("iCount=["+iCount+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�i�ڔԍ��EsITEM_CD=["+sITEM_CD+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�ۊǋ�R�[�h�EsWH_CD=["+sWH_CD+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�H��R�[�h�EsPLANT_CD=["+sPLANT_CD+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�i�ڕʕۊǐ�D�揇�ʁEsWH_PRIORITY_REF_NO=["+sWH_PRIORITY_REF_NO+"]");

				// << �ۊǋ�ʕi�ڍ݌ɂ̌��� >>
				sql	= "SELECT T_ITEM_STOCK.ITEM_CD, T_ITEM_STOCK.WH_CD, T_ITEM_STOCK.PLANT_CD, "
				+" T_ITEM_STOCK.STOCK_ON_HAND_QTY, T_ITEM_STOCK.DEFECT_QTY, T_ITEM_STOCK.PRVS_DAYEND_STOCK_QTY, "
				+" T_ITEM_STOCK.PRVS_MONTHEND_STOCK_QTY, T_ITEM_STOCK.PRVS_TERMEND_STOCK_QTY "
				+" FROM T_ITEM_STOCK , M_WH "
				+" WHERE ((T_ITEM_STOCK.ITEM_CD=?) AND (T_ITEM_STOCK.WH_CD=?) AND (T_ITEM_STOCK.PLANT_CD=?) "
				+" AND (T_ITEM_STOCK.STOCK_ON_HAND_QTY>0) "
				+" AND (T_ITEM_STOCK.WH_CD = M_WH.WH_CD) "
				+" AND (M_WH.MRP_FLG = 1)) ";

//20031121�C���J�n
				psREAD = _conn.prepareStatement(sql);
				psREAD.setString(1,	sITEM_CD);
				psREAD.setString(2,	sWH_CD);
				psREAD.setString(3,	sPLANT_CD);
				rs = psREAD.executeQuery();
//				ps = _conn.prepareStatement(sql);
//				ps.setString(1,	sITEM_CD);
//				ps.setString(2,	sWH_CD);
//				ps.setString(3,	sPLANT_CD);
//				//DEBUG
////20031104				_log.message("sql=["+sql+"]");
//				rs = ps.executeQuery();
//20031121�C���I��

				if (rs.next())
				{
					//���o�ɔԍ��̍̔�
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,
						_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"		//	���o�ɊǗ��ԍ�
						+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
						+	"ITEM_CD,"				//	�i�ڔԍ�
						+	"PLANT_CD,"				//	�H��R�[�h
						+	"WH_CD,"				//	�ۊǋ�R�[�h
						+	"JOB_ODR_CD,"			//	����
						+	"JOB_ODR_DETAIL_NO,"	//	���Ԏ}��
						+	"PUCH_ODR_CD,"			//	�����ԍ�
						+	"ACPT_NO,"				//	�����
						+	"ACPT_RSLT_CRCT_NO,"	//	������ђ�����
						+	"INSPEC_RSLT_CRCT_NO,"	//	�������ђ�����
						+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
						+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
						+	"PARTIAL_PRD_NO,"		//	�����
						+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
						+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
						+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
						+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
						+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
						+	"RCV_ISSUE_GNR_TYP,"	//	���o�ɔ����敪
						+	"RCV_ISSUE_ODD_QTY,"	//	���o�ɒ[��
						+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
						+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
						+	"RCV_ISSUE_CMPLT_FLG,"	//	���o�Ɋ����t���O
						+	"OD_NO,"				//	�I�[�_�f�}���h�ԍ�
						+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
						+	"RCV_ISSUE_COMMENT,"	//	���o�ɔ��l
						+	"COMPANY_CD,"			//	��ЃR�[�h
						+	"VEND_CD,"				//	�����R�[�h
						+	"CONS_TYP,"				//	�x���敪
						+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//						+	"CREATED_DATE,"			//	�쐬��
						+	"CREATED_BY,"			//	�쐬��
						+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//						+	"UPDATED_DATE,"			//	�X�V��
						+	"UPDATED_BY,"			//	�X�V��
						+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
						+	"MODIFY_COUNT) "		//	�X�V��
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+"sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+"?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					ps.setString(iIndex++, strOdrCd);												//	���o�ɊǗ��ԍ�
					ps.setDouble(iIndex++, 2);														//	���o�ɋ敪
					ps.setString(iIndex++, rs.getString("ITEM_CD"));								//	�i�ڔԍ�
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));							//	�H��R�[�h
					ps.setString(iIndex++, rs.getString("WH_CD"));									//	�ۊǋ�R�[�h
					//09-25�d�l�m�F���C���A�ĕύX�\��������B
//					if (iInTyp == 3)
//					{
//						ps.setString(iIndex++, (String)htT_OD.get("JOB_ODR_CD"));					//	����			OK?
//						ps.setDouble(iIndex++, 0);													//	���Ԏ}��		OK?
//					} else {
//						ps.setNull(iIndex++, Types.VARCHAR);										//	����			OK?
//						ps.setNull(iIndex++, Types.NUMERIC);										//	���Ԏ}��		OK?
//					}
					ps.setNull(iIndex++, Types.VARCHAR);											//	����			OK?
					ps.setDouble(iIndex++, 0);														//	���Ԏ}��		OK?
					ps.setString(iIndex++, ginPUCH_ODR_CD);											//	�����ԍ�
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));							//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	���������
					ps.setDouble(iIndex++, 0);														//	�������ђ�����
					ps.setString(iIndex++, ginWORK_ODR_CD);											//	��ƌv��ԍ�
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);										//	��ƃR�[�h
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	��Ǝ��ђ�����
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));						//	�o�Ɏw���ԍ�
					dIssueCountTemp	= rs.getDouble("STOCK_ON_HAND_QTY");
					if (dIssueCountTemp	>= dIssueNO)
					{
						dIssueCountTemp	= dIssueNO;

//						dIssueNO = 0;
//					} else {
//						dIssueNO = dIssueNO	- dIssueCountTemp;
					}
					ps.setDouble(iIndex++, dIssueCountTemp * -1);									//	���o�ɐ�
					ps.setDouble(iIndex++, 0);														//	���o�ɋ��z
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  ���o�ɔN����????????
					ps.setDouble(iIndex++, 21);														//	���o�ɔ����敪
					ps.setDouble(iIndex++, 0);														//	���o�ɒ[��
					ps.setNull(iIndex++, Types.VARCHAR);											//	���o�ɕs�Ǘ��R�R�[�h	OK?
					ps.setDouble(iIndex++, 1);														//	�݌ɍX�V�敪
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	���o�Ɋ����t���O
					ps.setString(iIndex++, (String)htT.get("OD_NO"));								//	�I�[�_�f�}���h�ԍ�
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");														//	���[�J���b�g�ԍ�
					ps.setString(iIndex++, "");														//	���o�ɔ��l
					ps.setString(iIndex++, "");														//	��ЃR�[�h
					ps.setString(iIndex++, "");														//	�����R�[�h
					ps.setDouble(iIndex++, 0);														//	�x���敪
					ps.setNull(iIndex++, Types.DATE);												//	�L���x�����ђ��o��
		//			ps.setDate(iIndex++, "");		//	�쐬��
					ps.setString(iIndex++, _userInfo.getUserId());			//	�쐬��
					ps.setString(iIndex++, _userInfo.getBusinessName());	//	�쐬�v���O������
		//			ps.setString(iIndex++, "");		//	�X�V��
					ps.setString(iIndex++, _userInfo.getUserId());			//	�X�V��
					ps.setString(iIndex++, _userInfo.getBusinessName());	//	�X�V�v���O������
					ps.setDouble(iIndex++, 0);		//	�X�V��

					iIndex=ps.executeUpdate();
					if (iIndex > 0)
					{
						iCount++;
						dISSUECOUNT = dISSUECOUNT + dIssueCountTemp;
						dIssueNO = dIssueNO	- dIssueCountTemp;

					}
					ps.close();
					ps = null;
					//DEBUG
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^�ԍ�01=["+strOdrCd+"]");
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^����01=["+iIndex+"]");

					//�o�ɏ������Ăяo��
					_log.message("(SBM1199)�o�ɏ������Ăяo��......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("�L���x������o�^");
						// �o�^�����ۊǋ�ʓ��o�ɂ�ۑ�
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);							//	���o�ɊǗ��ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");										//	���o�ɋ敪
						htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));					//	�H��R�[�h
//						//09-25�d�l�m�F���C���A�ĕύX�\��������B
//						if (iInTyp == 3)
//						{
//							htT_RCV_ISSUE.put("JOB_ODR_CD",(String)htT_OD.get("JOB_ODR_CD"));		//	����OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");								//	���Ԏ}��OK?
//						} else {
//							htT_RCV_ISSUE.put("JOB_ODR_CD","");										//	����OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","");								//	���Ԏ}��OK?
//						}
						if (rs.getString("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));						//	�i�ڔԍ�
						}
						if (rs.getString("WH_CD") == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));							//	�ۊǋ�R�[�h
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);							//	�����ԍ�
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);									//	�����
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);				//	������ђ�����
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);							//	��ƌv��ԍ�
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);					//	�d�|��ƃR�[�h
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);						//	�����
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);					//	��Ǝ��ђ�����
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);						//	���o�ɔN����
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);			//	���o�Ɋ����t���O
						}
						htT_RCV_ISSUE.put("JOB_ODR_CD","");											//	����OK?
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");									//	���Ԏ}��OK?
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");								//	�������ђ�����
						htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));		//	�o�Ɏw���ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueCountTemp *	-1));	//	���o�ɐ�
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");									//	���o�ɋ��z
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");								//	���o�ɔ����敪
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");									//	���o�ɒ[��
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");									//	���o�ɕs�Ǘ��R�R�[�h
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");										//	�݌ɍX�V�敪
						htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));						//	�I�[�_�f�}���h�ԍ�
						htT_RCV_ISSUE.put("VEND_LOT_NO","");										//	���[�J���b�g�ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");									//	���o�ɔ��l
						htT_RCV_ISSUE.put("COMPANY_CD","");											//	��ЃR�[�h
						htT_RCV_ISSUE.put("VEND_CD","");											//	�����R�[�h
						htT_RCV_ISSUE.put("CONS_TYP","");											//	�x���敪
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");										//	�L���x�����ђ��o��
						// [�L���x������]�ւ̒ǉ�
						JDB0016(iInIndex,1);
					}
				}
//20031121�ǉ�
//20031125
				if (psREAD != null)
				{
					psREAD.close();
				}
				if (dIssueNO==0)
				{
					break;
				}
			}
			//

//200310112�폜			if (iCount != 0	&& dIssueNO	> 0)
			if (WH_PRIORITY_FLG == 1 && dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʂ̍ŏ��ۊǋ悩��A�o��");
				//���o�ɔԍ��̍̔�
				ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
				strOdrCd = ODR_CD.getNo();
				// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
				sql	= "insert into "
					+"	T_RCV_ISSUE( "
					+" RCV_ISSUE_CTRL_CD,"			//	���o�ɊǗ��ԍ�
					+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
					+	"ITEM_CD,"			//	�i�ڔԍ�
					+	"PLANT_CD,"			//	�H��R�[�h
					+	"WH_CD,"			//	�ۊǋ�R�[�h
					+	"JOB_ODR_CD,"			//	����
					+	"JOB_ODR_DETAIL_NO,"		//	���Ԏ}��
					+	"PUCH_ODR_CD,"			//	�����ԍ�
					+	"ACPT_NO,"			//	�����
					+	"ACPT_RSLT_CRCT_NO,"		//	������ђ�����
					+	"INSPEC_RSLT_CRCT_NO,"		//	�������ђ�����
					+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
					+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
					+	"PARTIAL_PRD_NO,"		//	�����
					+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
					+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
					+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
					+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
					+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
					+	"RCV_ISSUE_GNR_TYP,"		//	���o�ɔ����敪
					+	"RCV_ISSUE_ODD_QTY,"		//	���o�ɒ[��
					+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
					+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
					+	"RCV_ISSUE_CMPLT_FLG,"		//	���o�Ɋ����t���O
					+	"OD_NO,"			//	�I�[�_�f�}���h�ԍ�
					+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
					+	"RCV_ISSUE_COMMENT,"		//	���o�ɔ��l
					+	"COMPANY_CD,"			//	��ЃR�[�h
					+	"VEND_CD,"			//	�����R�[�h
					+	"CONS_TYP,"			//	�x���敪
					+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//					+	"CREATED_DATE,"			//	�쐬��
					+	"CREATED_BY,"			//	�쐬��
					+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//					+	"UPDATED_DATE,"			//	�X�V��
					+	"UPDATED_BY,"			//	�X�V��
					+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
					+	"MODIFY_COUNT) "		//	�X�V��
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" ?, ?, ?, ?, ?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
					+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				ps = _conn.prepareStatement(sql);
				iIndex = 1;
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("iIndex=["+iIndex+"]");
//20031104				_log.message("strOdrCd=["+strOdrCd+"]");
				ps.setString(iIndex++, strOdrCd);								//	���o�ɊǗ��ԍ�
				ps.setDouble(iIndex++, 2);									//	���o�ɋ敪
				ps.setString(iIndex++, sITEM_CD_MIN);								//	�i�ڔԍ�
				ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//	�H��R�[�h
				ps.setString(iIndex++, sWH_CD_MIN);								//	�ۊǋ�R�[�h
//				//09-25�d�l�m�F���C���A�ĕύX�\��������B
//				if (iInTyp == 3)
//				{
//					ps.setString(iIndex++, (String)htT_OD.get("JOB_ODR_CD"));					//	����			OK?
//					ps.setDouble(iIndex++, 0);													//	���Ԏ}��		OK?
//				} else {
//					ps.setNull(iIndex++, Types.VARCHAR);										//	����			OK?
//					ps.setNull(iIndex++, Types.NUMERIC);										//	���Ԏ}��		OK?
//				}
				ps.setNull(iIndex++, Types.VARCHAR);								//	����			OK?
				ps.setDouble(iIndex++, 0);									//	���Ԏ}��		OK?
				ps.setString(iIndex++, ginPUCH_ODR_CD);								//	�����ԍ�
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	�����
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	���������
				ps.setDouble(iIndex++, 0);									//	�������ђ�����
				ps.setString(iIndex++, ginWORK_ODR_CD);								//	��ƌv��ԍ�
				ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	�d�|��ƃR�[�h
				ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	�����
				ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	��Ǝ��ђ�����
				ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//	�o�Ɏw���ԍ�
				ps.setDouble(iIndex++, dIssueNO	* -1);								//	���o�ɐ�
				ps.setDouble(iIndex++, 0);									//	���o�ɋ��z
				dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
				ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  ���o�ɔN����????????
//				ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//	���o�ɔN����?????????
				ps.setDouble(iIndex++, 21);									//	���o�ɔ����敪
				ps.setDouble(iIndex++, 0);									//	���o�ɒ[��
				ps.setNull(iIndex++, Types.VARCHAR);								//	���o�ɕs�Ǘ��R�R�[�h?
				ps.setDouble(iIndex++, 1);									//	�݌ɍX�V�敪
				ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	���o�Ɋ����t���O
				ps.setString(iIndex++, (String)htT.get("OD_NO"));						//	�I�[�_�f�}���h�ԍ�
				//-----------------------------------------------------------------
				ps.setString(iIndex++, "");									//	���[�J���b�g�ԍ�
				ps.setString(iIndex++, "");									//	���o�ɔ��l
				ps.setString(iIndex++, "");									//	��ЃR�[�h
				ps.setString(iIndex++, "");									//	�����R�[�h
				ps.setDouble(iIndex++, 0);									//	�x���敪
				ps.setNull(iIndex++, Types.DATE);								//	�L���x�����ђ��o��
	//			ps.setDate(iIndex++, "");		//	�쐬��
				ps.setString(iIndex++, _userInfo.getUserId());							//	�쐬��
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	�쐬�v���O������
	//			ps.setString(iIndex++, "");		//	�X�V��
				ps.setString(iIndex++, _userInfo.getUserId());							//	�X�V��
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	�X�V�v���O������
				ps.setDouble(iIndex++, 0);									//	�X�V��

				iIndex=ps.executeUpdate();
				ps.close();
				if (iIndex > 0)
				{
					iCount++;  //20031012�ǋL
					dISSUECOUNT = dISSUECOUNT + dIssueNO;
				}
				//DEBUG
//20031104				_log.message("�ۊǋ�ʓ��o�ɂ̓o�^�ԍ�02=["+strOdrCd+"]");
//20031104				_log.message("�ۊǋ�ʓ��o�ɂ̓o�^����02=["+iIndex+"]");

				//�o�ɏ������Ăяo��
				_log.message("(SBM1199)�o�ɏ������Ăяo��......");
				_IssueProcess = new IssueProcess(_iconn, strOdrCd);
				_IssueProcess.execProcess();

				if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
					(((String)htT.get("WORK_ODR_CD")).equals("")) &&
					(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
				{
					//DEBUG
//20031104					_log.message("�L���x������o�^");
					// �o�^�����ۊǋ�ʓ��o�ɂ�ۑ�
					htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);									//	���o�ɊǗ��ԍ�
					htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");												//	���o�ɋ敪
					htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));							//	�H��R�[�h
//					//09-25�d�l�m�F���C���A�ĕύX�\��������B
//					if (iInTyp == 3)
//					{
//						htT_RCV_ISSUE.put("JOB_ODR_CD",(String)htT_OD.get("JOB_ODR_CD"));				//	����OK?
//						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");										//	���Ԏ}��OK?
//					} else {
//						htT_RCV_ISSUE.put("JOB_ODR_CD","");												//	����OK?
//						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","");										//	���Ԏ}��OK?
//					}
					if (sITEM_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("ITEM_CD","");
					}else{
						htT_RCV_ISSUE.put("ITEM_CD",sITEM_CD_MIN);											//	�i�ڔԍ�
					}
					if (sWH_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("WH_CD","");
					}else{
						htT_RCV_ISSUE.put("WH_CD",sWH_CD_MIN);												//	�ۊǋ�R�[�h
					}
					if (ginPUCH_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("PUCH_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);									//	�����ԍ�
					}
					if (ginACPT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);											//	�����
					}
					if (ginACPT_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);						//	������ђ�����
					}
					if (ginWORK_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);									//	��ƌv��ԍ�
					}
					if (ginWORK_IN_PROC_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);							//	�d�|��ƃR�[�h
					}
					if (ginPARTIAL_PRD_NO == null)
					{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
					}else{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);								//	�����
					}
					if (ginOPR_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);							//	��Ǝ��ђ�����
					}
					if (ginRCV_ISSUE_DATE == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);								//	���o�ɔN����
					}
					if (ginRCV_ISSUE_CMPLT_FLG == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);					//	���o�Ɋ����t���O
					}
					htT_RCV_ISSUE.put("JOB_ODR_CD","");													//	����OK?
					htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");											//	���Ԏ}��OK?
					htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");										//	�������ђ�����
					htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));				//	�o�Ɏw���ԍ�
					htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO *	-1));				//	���o�ɐ�
					htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");											//	���o�ɋ��z
					htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");										//	���o�ɔ����敪
					htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");											//	���o�ɒ[��
					htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");											//	���o�ɕs�Ǘ��R�R�[�h
					htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");												//	�݌ɍX�V�敪
					htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));								//	�I�[�_�f�}���h�ԍ�
					htT_RCV_ISSUE.put("VEND_LOT_NO","");												//	���[�J���b�g�ԍ�
					htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");											//	���o�ɔ��l
					htT_RCV_ISSUE.put("COMPANY_CD","");													//	��ЃR�[�h
					htT_RCV_ISSUE.put("VEND_CD","");													//	�����R�[�h
					htT_RCV_ISSUE.put("CONS_TYP","");													//	�x���敪
					htT_RCV_ISSUE.put("CONS_EXEC_DATE","");												//	�L���x�����ђ��o��
					// [�L���x������]�ւ̒ǉ�
					JDB0016(iInIndex,1);
				}
			}
//20031012�C��
			//�C�@�ő��݂��Ȃ��ꍇ�́A[�H��]���ȉ��̏����Ō������A�u��\�[���ꏊ�R�[�h�v���擾����B
			if (iCount == 0	&& dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("�u��\�[���ꏊ�R�[�h�v����A�o��");
				// << �ۊǋ�ʕi�ڍ݌ɂ̌��� >>
				sql	= "SELECT M_PLANT.PLANT_CD, M_PLANT.WH_CD "
					+" FROM M_PLANT "
					+" WHERE (((M_PLANT.PLANT_CD)=?)) ";
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	(String)htT.get("PLANT_CD"));
				rs = ps.executeQuery();
				if (rs.next())
				{
					sPlantWH_CD	= rs.getString("WH_CD");
				}
				ps.close();
				rs.close();

				if (sPlantWH_CD == null || sPlantWH_CD.equals(""))	// 20031031�ǉ�
				{
					// << �ۊǋ�̌��� >>
					sql	= "SELECT M_WH.WH_CD "
						+ " FROM M_WH "
						+ " WHERE ((M_WH.PLANT_CD=?) "	// 20031031�ǉ�
						+ " AND (M_WH.MRP_FLG = 1)) "	// 20031031�ǉ�
						+ " ORDER BY M_WH.WH_CD ";
//20031121�C���J�n
					psREAD = _conn.prepareStatement(sql);
					psREAD.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031�ǉ�
					rs = psREAD.executeQuery();
//					ps = _conn.prepareStatement(sql);
//					ps.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031�ǉ�
//					rs = ps.executeQuery();
//20031121�C���I��


					if (rs.next())
					{
						sPlantWH_CD	= rs.getString("WH_CD");
					}
				}
				
//20031012�폜				// << �ۊǋ�ʕi�ڍ݌ɂ̌��� >>
//20031012�폜				sql	= "SELECT T_ITEM_STOCK.ITEM_CD, T_ITEM_STOCK.WH_CD, T_ITEM_STOCK.PLANT_CD, "
//20031012�폜				+" T_ITEM_STOCK.STOCK_ON_HAND_QTY, T_ITEM_STOCK.DEFECT_QTY, T_ITEM_STOCK.PRVS_DAYEND_STOCK_QTY, "
//20031012�폜				+" T_ITEM_STOCK.PRVS_MONTHEND_STOCK_QTY, T_ITEM_STOCK.PRVS_TERMEND_STOCK_QTY "
//20031012�폜				+" FROM T_ITEM_STOCK , M_WH "
//20031012�폜				+" WHERE ((T_ITEM_STOCK.ITEM_CD=?) AND (T_ITEM_STOCK.WH_CD=?) AND (T_ITEM_STOCK.PLANT_CD=?) "
//20031012�폜				+" AND (T_ITEM_STOCK.WH_CD = M_WH.WH_CD) "
//20031012�폜				+" AND (M_WH.MRP_FLG = 1)) ";

//20031012�폜				ps = _conn.prepareStatement(sql);
//20031012�폜				ps.setString(1,	(String)htT.get("ITEM_CD"));
//20031012�폜				ps.setString(2,	sPlantWH_CD);
//20031012�폜				ps.setString(3,	(String)htT.get("PLANT_CD"));
//20031012�폜				rs = ps.executeQuery();
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("�o�Ɏw���E�i�ڔԍ��EITEM_CD=["+(String)htT.get("ITEM_CD")+"]");
//20031104				_log.message("��\�[���ꏊ�R�[�h�EsPlantWH_CD=["+sPlantWH_CD+"]");
//20031104				_log.message("�o�Ɏw���E�H��R�[�h�EPLANT_CD=["+(String)htT.get("PLANT_CD")+"]");

//20031012�폜				if (rs.next())
//20031012�폜				{
				if(sPlantWH_CD != null || !sPlantWH_CD.equals(""))
				{
					//���o�ɔԍ��̍̔�
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"			//	���o�ɊǗ��ԍ�
						+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
						+	"ITEM_CD,"			//	�i�ڔԍ�
						+	"PLANT_CD,"			//	�H��R�[�h
						+	"WH_CD,"			//	�ۊǋ�R�[�h
						+	"JOB_ODR_CD,"			//	����
						+	"JOB_ODR_DETAIL_NO,"		//	���Ԏ}��
						+	"PUCH_ODR_CD,"			//	�����ԍ�
						+	"ACPT_NO,"			//	�����
						+	"ACPT_RSLT_CRCT_NO,"		//	������ђ�����
						+	"INSPEC_RSLT_CRCT_NO,"		//	�������ђ�����
						+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
						+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
						+	"PARTIAL_PRD_NO,"		//	�����
						+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
						+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
						+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
						+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
						+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
						+	"RCV_ISSUE_GNR_TYP,"		//	���o�ɔ����敪
						+	"RCV_ISSUE_ODD_QTY,"		//	���o�ɒ[��
						+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
						+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
						+	"RCV_ISSUE_CMPLT_FLG,"		//	���o�Ɋ����t���O
						+	"OD_NO,"			//	�I�[�_�f�}���h�ԍ�
						+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
						+	"RCV_ISSUE_COMMENT,"		//	���o�ɔ��l
						+	"COMPANY_CD,"			//	��ЃR�[�h
						+	"VEND_CD,"			//	�����R�[�h
						+	"CONS_TYP,"			//	�x���敪
						+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//						+	"CREATED_DATE,"			//	�쐬��
						+	"CREATED_BY,"			//	�쐬��
						+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//						+	"UPDATED_DATE,"			//	�X�V��
						+	"UPDATED_BY,"			//	�X�V��
						+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
						+	"MODIFY_COUNT) "		//	�X�V��
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+"?, ?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					iIndex = 1;
					ps.setString(iIndex++, strOdrCd);								//	���o�ɊǗ��ԍ�
					ps.setDouble(iIndex++, 2);									//	���o�ɋ敪
//20031012�C��					ps.setString(iIndex++, rs.getString("ITEM_CD"));						//	�i�ڔԍ�
					ps.setString(iIndex++, (String)htT.get("ITEM_CD"));						//	�i�ڔԍ�
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//  �H��R�[�h
//20031012�C��					ps.setString(iIndex++, rs.getString("WH_CD"));							//	�ۊǋ�R�[�h
					ps.setString(iIndex++, sPlantWH_CD);

//					//09-25�d�l�m�F���C���A�ĕύX�\��������B
//					if (iInTyp == 3)
//					{
//						ps.setString(iIndex++, (String)htT_OD.get("JOB_ODR_CD"));				//	����			OK?
//						ps.setDouble(iIndex++, 0);								//	���Ԏ}��		OK?
//					} else {
//						ps.setNull(iIndex++, Types.VARCHAR);							//	����			OK?
//						ps.setNull(iIndex++, Types.NUMERIC);							//	���Ԏ}��		OK?
//					}
					ps.setNull(iIndex++, Types.VARCHAR);								//	����			OK?
					ps.setDouble(iIndex++, 0);									//	���Ԏ}��		OK?
					ps.setString(iIndex++, ginPUCH_ODR_CD);								//	�����ԍ�
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	������ђ�����
					ps.setDouble(iIndex++, 0);									//	�������ђ�����
					ps.setString(iIndex++, ginWORK_ODR_CD);								//	��ƌv��ԍ�
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	�d�|��ƃR�[�h
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	��Ǝ��ђ�����
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//  �o�Ɏw���ԍ�
					ps.setDouble(iIndex++, dIssueNO	* -1);								//	���o�ɐ�
					ps.setDouble(iIndex++, 0);									//	���o�ɋ��z
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  ���o�ɔN����????????
//					ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));//  ���o�ɔN����
					ps.setDouble(iIndex++, 21);									//	���o�ɔ����敪
					ps.setDouble(iIndex++, 0);									//	���o�ɒ[��
					ps.setString(iIndex++, "");									//	���o�ɕs�Ǘ��R�R�[�h?
					ps.setDouble(iIndex++, 1);									//	�݌ɍX�V�敪
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	���o�Ɋ����t���O
					ps.setString(iIndex++, (String)htT.get("OD_NO"));						//  �I�[�_�f�}���h�ԍ�
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");									//	���[�J���b�g�ԍ�
					ps.setString(iIndex++, "");									//	���o�ɔ��l
					ps.setString(iIndex++, "");									//	��ЃR�[�h
					ps.setString(iIndex++, "");									//	�����R�[�h
					ps.setDouble(iIndex++, 0);									//	�x���敪
					ps.setNull(iIndex++, Types.DATE);								//  �L���x�����ђ��o��
		//			ps.setDate(iIndex++, "");		//	�쐬��
					ps.setString(iIndex++, _userInfo.getUserId());							//	�쐬��
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	�쐬�v���O������
		//			ps.setString(iIndex++, "");		//	�X�V��
					ps.setString(iIndex++, _userInfo.getUserId());							//	�X�V��
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	�X�V�v���O������
					ps.setDouble(iIndex++, 0);		//	�X�V��

					iIndex=ps.executeUpdate();
					if (iIndex > 0)
					{
						dISSUECOUNT = dISSUECOUNT + dIssueNO;
					}
					ps.close();
					//DEBUG
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^�ԍ�03=["+strOdrCd+"]");
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^����03=["+iIndex+"]");

					//�o�ɏ������Ăяo��
					_log.message("(SBM1199)�o�ɏ������Ăяo��......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("�L���x������o�^");
						// �o�^�����ۊǋ�ʓ��o�ɂ�ۑ�
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);							//	���o�ɊǗ��ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");										//	���o�ɋ敪
						htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));					//	�H��R�[�h
//						//09-25�d�l�m�F���C���A�ĕύX�\��������B
//						if (iInTyp == 3)
//						{
//							htT_RCV_ISSUE.put("JOB_ODR_CD",(String)htT_OD.get("JOB_ODR_CD"));		//	����OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");								//	���Ԏ}��OK?
//						} else {
//							htT_RCV_ISSUE.put("JOB_ODR_CD","");										//	����OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","");								//	���Ԏ}��OK?
//						}
/*20031012�C��
						if (rs.getString("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));						//	�i�ڔԍ�
						}
*/
						if ((String)htT.get("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",(String)htT.get("ITEM_CD"));						//	�i�ڔԍ�
						}
/*20031012�C��
						if (rs.getString("WH_CD") == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));							//	�ۊǋ�R�[�h
						}
*/
						if (sPlantWH_CD == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",sPlantWH_CD);							//	�ۊǋ�R�[�h
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);							//	�����ԍ�
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);									//	�����
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);				//	������ђ�����
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);							//	��ƌv��ԍ�
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);					//	�d�|��ƃR�[�h
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);						//	�����
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);					//	��Ǝ��ђ�����
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);						//	���o�ɔN����
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);			//	���o�Ɋ����t���O
						}
						htT_RCV_ISSUE.put("JOB_ODR_CD","");											//	����OK?
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");									//	���Ԏ}��OK?
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");								//	�������ђ�����
						htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));		//	�o�Ɏw���ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO *	-1));		//	���o�ɐ�
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");									//	���o�ɋ��z
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");								//	���o�ɔ����敪
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");									//	���o�ɒ[��
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");									//	���o�ɕs�Ǘ��R�R�[�h
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");										//	�݌ɍX�V�敪
						htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));						//	�I�[�_�f�}���h�ԍ�
						htT_RCV_ISSUE.put("VEND_LOT_NO","");										//	���[�J���b�g�ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");									//	���o�ɔ��l
						htT_RCV_ISSUE.put("COMPANY_CD","");											//	��ЃR�[�h
						htT_RCV_ISSUE.put("VEND_CD","");											//	�����R�[�h
						htT_RCV_ISSUE.put("CONS_TYP","");											//	�x���敪
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");										//	�L���x�����ђ��o��
						// [�L���x������]�ւ̒ǉ�
						JDB0016(iInIndex,1);
					}
				} else {
					_log.message("(SBM1200)�ۊǋ�R�[�h���擾�ł��܂���ł����̂ŁA�o�ɏ����͍s���܂���ł����B");
				}
//20031121�ǉ�
//20031125
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031012�폜				}
			}

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121�C���J�n
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (psIN != null)
			{
				psIN.close();
			}
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031121�C���I��
			if (ps != null)
			{
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if (rsIN != null){
				try{
					rsIN.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsIN = null;
			}
		}
		return dISSUECOUNT;
	};

	//2.10.7.1	�ʎ�z���o�ɉ\������̏o��
	private	double	JDB0009(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		double dODR_QTY	= 0;
		double dTOTAL_ISSUE_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dRC = 0;
		int	iRC=0;
		Hashtable htT =	new	Hashtable();
		try
		{
			_log.methodStart();

			if (dInISSUENO <= 0)
			{
				return 0;
			}
			htT_OD = new Hashtable();
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << ���v�ʂ̌��� >>
			sql	= "SELECT T_OD.OD_NO, T_OD.ODR_QTY, T_OD.TOTAL_ISSUE_QTY , T_OD.JOB_ODR_CD , "
				+ " T_OD.JOB_ODR_DETAIL_NO, T_OD.ITEM_CD "
				+ " FROM T_OD "
				+ " WHERE (((T_OD.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				dODR_QTY = rs.getDouble("ODR_QTY");
				dTOTAL_ISSUE_QTY = rs.getDouble("TOTAL_ISSUE_QTY");
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("���v�ʁE�I�[�_���EdODR_QTY=["+dODR_QTY+"]");
//20031104				_log.message("���v�ʁE�o�ɗ݌v���EdTOTAL_ISSUE_QTY=["+dTOTAL_ISSUE_QTY+"]");
//20031104				_log.message("���v�ʁE���ԁEJOB_ODR_CD=["+rs.getString("JOB_ODR_CD")+"]");
//20031104				_log.message("���v�ʁE���ʕϐ��u���ԁv�EgsJOB_ODR_CD=["+rs.getString("JOB_ODR_CD")+"]");
//20031104				_log.message("���v�ʁE�i�ڔԍ��EITEM_CD=["+rs.getString("ITEM_CD")+"]");

				if (rs.getString("OD_NO") == null)
				{
					htT_OD.put("OD_NO","");
				}else{
					htT_OD.put("OD_NO",	rs.getString("OD_NO"));											//�I�[�_�f�}���h�ԍ�
				}
				if (rs.getString("JOB_ODR_CD") == null)
				{
					htT_OD.put("JOB_ODR_CD","");
				}else{
					htT_OD.put("JOB_ODR_CD", rs.getString("JOB_ODR_CD"));								//����
				}
				if (rs.getString("ITEM_CD") == null)
				{
					htT_OD.put("ITEM_CD","");
				}else{
					htT_OD.put("ITEM_CD", rs.getString("ITEM_CD"));										//�i�ڔԍ�
				}
				if (rs.getString("JOB_ODR_CD") == null)
				{
					gsJOB_ODR_CD="";
				}else{
					gsJOB_ODR_CD=rs.getString("JOB_ODR_CD");
				}
				htT_OD.put("ODR_QTY", Double.toString(rs.getDouble("ODR_QTY")));					//�I�[�_��
				htT_OD.put("TOTAL_ISSUE_QTY", Double.toString(rs.getDouble("TOTAL_ISSUE_QTY")));	//�o�ɗ݌v��
				htT_OD.put("JOB_ODR_DETAIL_NO",	Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO")));//���Ԏ}��
			}

			rs.close();
			ps.close();

			// << ���Ԉ����̌��� >>
			sql	= "	SELECT	SUM(T_JOB_ODR_ALC.ISSUEED_QTY) AS ISSUEED_QTY_SUM "
				+ "	FROM T_JOB_ODR_ALC "
				+ "	WHERE (((T_JOB_ODR_ALC.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				dISSUEED_QTY_SUM = rs.getDouble("ISSUEED_QTY_SUM");
			}
			rs.close();
			ps.close();

			dRC	= dODR_QTY - dTOTAL_ISSUE_QTY -	dISSUEED_QTY_SUM;
			//iRC	= (new Double(dRC)).intValue();
			if (dRC	>= dInISSUENO)
			{
				dRC	= dInISSUENO;
			}
			//DEBUG
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("���Ԉ����E�o�ɍςݐ����v�EdISSUEED_QTY_SUM=["+dISSUEED_QTY_SUM+"]");
//20031104			_log.message("�o�ɗv�����EdInISSUENO=["+dInISSUENO+"]");
//20031104			_log.message("�o�ɎZ�o���EdRC=["+dRC+"]");
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dRC;
	};

	//2.10.7.2 ���Ԉ������o�ɉ\���i���ꐻ�ԁj�̎Z�o
	private	double	JDB0011(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		ResultSet rsTmp=null;
		String sql="";
		double dALCD_QTY = 0;
		double dISSUEED_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dRC = 0;
		double dRC1 = 0;
		double dISSUENO = 0;
		double	dAllCount =	0;
		boolean	bRC=true;
		Hashtable htT =	new	Hashtable();
		String sJOB_ODR_CD = "";
		try
		{
			_log.methodStart();

			if (dInISSUENO <=0)
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << ���v�ʂ̌��� >>
			sql	= "SELECT T_OD.OD_NO, T_OD.ODR_QTY, T_OD.TOTAL_ISSUE_QTY ,JOB_ODR_CD , JOB_ODR_DETAIL_NO, ITEM_CD "
				+ " FROM T_OD "
				+ " WHERE (((T_OD.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				sJOB_ODR_CD=rs.getString("JOB_ODR_CD");
			}

			//DEBUG
//20031104			_log.message("���v�ʂ̌���");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("�o�Ɏw���E�I�[�_�f�}���h�ԍ��EOD_NO=["+(String)htT.get("OD_NO")+"]");
//20031104			_log.message("���v�ʁE���ԁEsJOB_ODR_CD=["+sJOB_ODR_CD+"]");

			rs.close();
			ps.close();

			// << ���Ԉ����̌��� >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=2)  "
				+ " AND (T_JOB_ODR_ALC.JOB_ODR_CD=?) ) "
				+ " ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			ps.setString(2,	sJOB_ODR_CD);
			rs = ps.executeQuery();
			//DEBUG
//20031104			_log.message("���Ԉ����̌���");
//20031104			_log.message("sql=["+sql+"]");
			while (rs.next())
			{
				if (rs.getString("JOB_ODR_CD") == null)
				{
					gsJOB_ODR_CD = "";
				}else{
					gsJOB_ODR_CD = rs.getString("JOB_ODR_CD");
				}

				dALCD_QTY =	rs.getDouble("ALCD_QTY");
				dISSUEED_QTY = rs.getDouble("ISSUEED_QTY");
				dRC	= dALCD_QTY	- dISSUEED_QTY;
//				iRC	= (new Double(dRC)).intValue();

				//DEBUG
//20031104				_log.message("���v�ʁE���ʕϐ��u���ԁv�EgsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");
//20031104				_log.message("���Ԉ����E�����ςݐ��EdALCD_QTY=["+dALCD_QTY+"]");
//20031104				_log.message("���Ԉ����E�o�ɍςݐ��EdISSUEED_QTY=["+dISSUEED_QTY+"]");
//20031104				_log.message("dRC=["+dRC+"]");

				if (dRC	> 0)
				{
					if (dRC	>= dISSUENO)
					{
						dRC	= dISSUENO;
					}
					//DEBUG
//20031104					_log.message("�o�ɗv�����EdISSUENO=["+dISSUENO+"]");
//20031104					_log.message("�o�ɉ\���EdRC=["+dRC+"]");
					//���Ԉ������o�ɉ\���i���ꐻ�ԁj�@���@0�@���A�����o�Ɏc���@���@0
					//�i�ڕʕۊǐ�D�揇�ʂ̌���
//20031121			rsTmp =	JDB0007(iInIndex);
					//�����o�ɐ���S�ďo�ɂ���܂�
					//�y���ԕi�̕��o�ۊǋ�̏����z
//20031121			dRC1 = JDB0018(rsTmp, iInIndex, dRC);
					dRC1 = JDB0018(iInIndex, dRC);

					dISSUENO = dISSUENO	- dRC1;
					dAllCount =	dAllCount +	dRC1;
					//DEBUG
//20031104					_log.message("�o�ɗv���c���EdISSUENO=["+dISSUENO+"]");
//20031104					_log.message("�o�ɐ����v�EdAllCount=["+dAllCount+"]");
					if (dISSUENO == 0)
					{
						break;
					}
				}
			}
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (rsTmp != null)
			{
				rsTmp.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dAllCount;
	};

	//2.10.7.2 ���Ԉ������o�ɉ\���i�����ԁj�̎Z�o
	private	double	JDB0013(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		ResultSet rsTmp=null;
		String sql="";
		double dALCD_QTY = 0;
		double dISSUEED_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dISSUENO = 0;
		double dRC = 0;
		double dRC1 = 0;
		double	dAllCount =	0;
		boolean	bRC=true;
		Hashtable htT =	new	Hashtable();
		String sJOB_ODR_CD = "";
		String sTmp = "";

		try
		{
			_log.methodStart();

			if (dInISSUENO <=0)
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << ���v�ʂ̌��� >>
			sql	= "SELECT T_OD.OD_NO, T_OD.ODR_QTY, T_OD.TOTAL_ISSUE_QTY ,JOB_ODR_CD , JOB_ODR_DETAIL_NO, ITEM_CD "
				+ " FROM T_OD "
				+ " WHERE (((T_OD.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				sJOB_ODR_CD=rs.getString("JOB_ODR_CD");
			}
			//DEBUG
//20031104			_log.message("���v�ʂ̌���");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("�o�Ɏw���E�I�[�_�f�}���h�ԍ��EOD_NO=["+(String)htT.get("OD_NO")+"]");
//20031104			_log.message("���v�ʁE���ԁEsJOB_ODR_CD=["+sJOB_ODR_CD+"]");

			rs.close();
			ps.close();

			// << ���Ԉ����̌��� >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=2)  "
//				+ " AND (T_JOB_ODR_ALC.JOB_ODR_CD != ?)  "
				+ " ) ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
//			ps.setString(2,	sJOB_ODR_CD);
			rs = ps.executeQuery();
			//DEBUG
//20031104			_log.message("���Ԉ����̌���");
//20031104			_log.message("sql=["+sql+"]");
			while (rs.next())
			{
				if (rs.getString("JOB_ODR_CD") == null)
				{
					sTmp = "";
				}else{
					sTmp = rs.getString("JOB_ODR_CD");
				}
				if (!sTmp.equals(sJOB_ODR_CD))
				{
					if (rs.getString("JOB_ODR_CD") == null)
					{
						gsJOB_ODR_CD = "";
					}else{
						gsJOB_ODR_CD = rs.getString("JOB_ODR_CD");
					}

					dALCD_QTY =	rs.getDouble("ALCD_QTY");
					dISSUEED_QTY = rs.getDouble("ISSUEED_QTY");
					dRC	= dALCD_QTY	- dISSUEED_QTY;
	//				iRC	= (new Double(dRC)).intValue() ;
					//DEBUG
//20031104					_log.message("���v�ʁE���ʕϐ��u���ԁv�EgsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");
//20031104					_log.message("���Ԉ����E�����ςݐ��EdALCD_QTY=["+dALCD_QTY+"]");
//20031104					_log.message("���Ԉ����E�o�ɍςݐ��EdISSUEED_QTY=["+dISSUEED_QTY+"]");
//20031104					_log.message("dRC=["+dRC+"]");

					if (dRC	> 0)
					{
						if (dRC	>= dISSUENO)
						{
							dRC	= dISSUENO;
						}
						//DEBUG
//20031104						_log.message("�o�ɗv�����EdISSUENO=["+dISSUENO+"]");
//20031104						_log.message("�o�ɉ\���EdRC=["+dRC+"]");
						//���Ԉ������o�ɉ\���i���ꐻ�ԁj�@���@0�@���A�����o�Ɏc���@���@0
						//�i�ڕʕۊǐ�D�揇�ʂ̌���
//20031121				rsTmp =	JDB0007(iInIndex);
						//�����o�ɐ���S�ďo�ɂ���܂�
						//�y���ԕi�̕��o�ۊǋ�̏����z
//20031121				dRC1 = JDB0018(rsTmp, iInIndex, dRC);
						dRC1 = JDB0018(iInIndex, dRC);

						dISSUENO = dISSUENO	- dRC1;
						dAllCount =	dAllCount +	dRC1;
						//DEBUG
//20031104						_log.message("�o�ɗv���c�����EdISSUENO=["+dISSUENO+"]");
//20031104						_log.message("�o�ɐ����v�EdAllCount=["+dAllCount+"]");
						if (dISSUENO == 0)
						{
							break;
						}
					}
				}
			}
			rs.close();
			ps.close();

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (rsTmp != null)
			{
				rsTmp.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dAllCount;
	};

	//2.10.7.3 �݌Ɉ������o�ɉ\���̎Z�o
	private	double	JDB0014(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		double dALCD_QTY = 0;
		double dISSUEED_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dISSUENO	= 0;
		double dRC = 0;
		double dRC1 = 0;
		boolean	bRC=true;
		double	dAllCount =	0;
		Hashtable htT =	new	Hashtable();
		try
		{
			_log.methodStart();
			if (dInISSUENO <=0)
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << ���Ԉ����̌��� >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=1))  "
				+ " ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			//DEBUG
//20031104			_log.message("���Ԉ����̌���");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("�o�Ɏw���E�I�[�_�f�}���h�ԍ��EOD_NO=["+(String)htT.get("OD_NO")+"]");
			while (rs.next())
			{
	//			  htRC.put("JOB_ODR_CD", rs.getString("JOB_ODR_CD"));
	//			  htRC.put("JOB_ODR_DETAIL_NO",	rs.getString("JOB_ODR_DETAIL_NO"));
	//			  htRC.put("ITEM_CD", rs.getString("ITEM_CD"));
				dALCD_QTY =	rs.getDouble("ALCD_QTY");
				dISSUEED_QTY = rs.getDouble("ISSUEED_QTY");
				dRC	= dALCD_QTY	- dISSUEED_QTY;
//				iRC	= (new Double(dRC)).intValue() ;
				//DEBUG
//20031104				_log.message("���Ԉ����E�����ςݐ��EdALCD_QTY=["+dALCD_QTY+"]");
//20031104				_log.message("���Ԉ����E�o�ɍςݐ��EdISSUEED_QTY=["+dISSUEED_QTY+"]");
//20031104				_log.message("dRC=["+dRC+"]");

				if (dRC	> 0)
				{
					if (dRC	>= dISSUENO)
					{
						dRC	= dISSUENO;
					}
					//DEBUG
//20031104					_log.message("�o�ɗv�����EdISSUENO=["+dISSUENO+"]");
//20031104					_log.message("�o�ɉ\���EdRC=["+dRC+"]");
					//�i�ڕʕۊǐ�D�揇�ʂ̌���
//20031121			rs = JDB0007(iInIndex);
					//�����o�ɐ���S�ďo�ɂ���܂�
					//�y�l�q�o�i�̕��o�ۊǋ�̏����z
//20031121			dRC1 = JDB0008(rs, iInIndex, dRC, 3);
					dRC1 = JDB0008(iInIndex, dRC, 3);

					dISSUENO = dISSUENO	- dRC1;
					dAllCount =	dAllCount +	dRC1;
					//DEBUG
//20031104					_log.message("�o�ɗv���c�����EdISSUENO=["+dISSUENO+"]");
//20031104					_log.message("�o�ɐ����v�EdAllCount=["+dAllCount+"]");
					if (dISSUENO == 0)
					{
						break;
					}
				}
			}
			rs.close();
			ps.close();
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dAllCount;
	};

	//2.10.7.4 �i�ڍ݌ɏo�ɉ\���̎Z�o
	private	double	JDB0015(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
//20031121�ǉ�
		PreparedStatement psREAD=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sJOB_ODR_ALC_CD="";
		String strOdrCd="";
		double dALCD_QTY = 0;
		double dTOTAL_ISSUE_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dRC = 0;
		int iRC = 0;
		double	dISSUENO = 0;
		boolean	bRC=true;
		int	iIndex=0;
		Hashtable htT =	new	Hashtable();
		try
		{
			_log.methodStart();

			if (dInISSUENO <=0 )
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);

			// << ���Ԉ����̌��� >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_ALC_CD, T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ITEM_CD=?)  "
//20031012�C���F���������Q���P				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=2))  "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=1))  "
				+ " ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
//20031121�C���J�n
			psREAD = _conn.prepareStatement(sql);
			psREAD.setString(1,	(String)htT.get("OD_NO"));
			psREAD.setString(2,	(String)htT.get("ITEM_CD"));
			rs = psREAD.executeQuery();
//			ps = _conn.prepareStatement(sql);
//			ps.setString(1,	(String)htT.get("OD_NO"));
//			ps.setString(2,	(String)htT.get("ITEM_CD"));
//			rs = ps.executeQuery();
//20031121�C���I��
			//DEBUG
//20031104			_log.message("���Ԉ����̌���");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("�o�Ɏw���E�I�[�_�f�}���h�ԍ��EOD_NO=["+(String)htT.get("OD_NO")+"]");
//20031104			_log.message("�o�Ɏw���E�i�ڔԍ��EITEM_CD=["+(String)htT.get("ITEM_CD")+"]");
//20031104			_log.message("�o�Ɏw���E�H��R�[�h�EPLANT_CD=["+(String)htT.get("PLANT_CD")+"]");
			if (rs.next())
			{
				sJOB_ODR_ALC_CD	= rs.getString("JOB_ODR_ALC_CD");	//????????????
				dALCD_QTY =	rs.getDouble("ALCD_QTY");
				//Update
				sql	= "	UPDATE T_JOB_ODR_ALC SET "
					+ "	ALCD_QTY = ? "
					+ "	WHERE JOB_ODR_ALC_CD = ? ";
				ps = _conn.prepareStatement(sql);
				ps.setDouble(1,	dALCD_QTY +	dISSUENO);
				ps.setString(2,	sJOB_ODR_ALC_CD);
				iRC	= ps.executeUpdate();
				//DEBUG
//20031104				_log.message("���Ԉ����̍X�V");
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("���Ԉ����E�����ςݐ��EdALCD_QTY +iInISSUENO=["+(dALCD_QTY +dISSUENO)+"]");
//20031104				_log.message("���Ԉ����Ǘ��ԍ��EsJOB_ODR_ALC_CD=["+sJOB_ODR_ALC_CD+"]");

			} else {
//				//���Ԍv��̍̔� --20031012�C���@���Ԃ̍̔Ԃł͂Ȃ����Ԍv��̍̔ԁ@����Ő��Ԍv��̍̔ԂɕύX����
//				CollectNumber ODR_CD = new CollectNumber(CollectNumber.JOB_OD_CD ,
//					_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);

				//���Ԍv��̍̔� --20031017�C���@���Ԃ̍̔Ԃł͂Ȃ����Ԍv��̍̔�
				CollectNumber ODR_CD = new CollectNumber(CollectNumber.JOB_OD_ALC_CD ,
					_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);

				strOdrCd = ODR_CD.getNo();
				//Insert
				sql	= " INSERT INTO  T_JOB_ODR_ALC ( "
					+" JOB_ODR_ALC_CD, "
					+" OD_NO, "
					+" PLANT_CD, "
					+" ITEM_CD, "
					+" ALC_STOCK_TYP, "
					+" JOB_ODR_CD, "
					+" JOB_ODR_DETAIL_NO, "
					+" ALCD_QTY, "
					+" ISSUEED_QTY, "
					+" ISSUE_CMPLT_FLG, "
//					+" CREATED_DATE, "
					+" CREATED_BY, "
					+" CREATED_PRG_NM, "
//					+" UPDATED_DATE, "
					+" UPDATED_BY, "
					+" UPDATED_PRG_NM, "
					+" MODIFY_COUNT "
					+" ) "
					+" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
				iIndex = 1;
				ps = _conn.prepareStatement(sql);
				ps.setString(iIndex++, strOdrCd);				// ���Ԉ����Ǘ��ԍ�
				ps.setString(iIndex++, (String)htT.get("OD_NO"));		// �I�[�_�f�}���h�ԍ�
				ps.setString(iIndex++, (String)htT.get("PLANT_CD"));		// �H��R�[�h
				ps.setString(iIndex++, (String)htT.get("ITEM_CD"));		// �i�ڔԍ�
//20031012�C���F�o�^�l�Q���P				ps.setDouble(iIndex++, 2);					// �����݌ɋ敪
				ps.setDouble(iIndex++, 1);					// �����݌ɋ敪
				ps.setNull(iIndex++, Types.VARCHAR);				// ����
				ps.setDouble(iIndex++, 0 );					// ���Ԏ}��
				ps.setDouble(iIndex++, dISSUENO);				// �����ςݐ�
				ps.setDouble(iIndex++, 0);					// �o�ɍςݐ�
	//			ps.setString(iIndex++, "Off");					// �o�Ɋ����t���O?????
				ps.setDouble(iIndex++, 0);					// �o�Ɋ����t���O?????
				ps.setString(iIndex++, _userInfo.getUserId());			// 
				ps.setString(iIndex++, _userInfo.getBusinessName());			// 
				ps.setString(iIndex++, _userInfo.getUserId());			// 
				ps.setString(iIndex++, _userInfo.getBusinessName());			// 
				ps.setDouble(iIndex++, 0);									// 
//20031104				_log.message("���Ԉ����̓o�^");
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("���Ԉ����̊Ǘ��ԍ�=["+strOdrCd+"]");
				iRC	= ps.executeUpdate();
				//DEBUG
			}

			rs.close();
			ps.close();
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
//20031121�C���J�n
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031121�C���I��
		}
		return dISSUENO;
	};

	//[�L���x������]�ւ̒ǉ�
	private	void JDB0016(int iInIndex,int iTyp)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		int	iIndex =0;
		int	iRC	= 0;
		String strOdrCd="";
		Hashtable htTmp	= new Hashtable();
		Hashtable htT =	new	Hashtable();
		java.util.Date dtDate = null;
		try
		{
			_log.methodStart();
			//�o�Ɏw�������擾
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			//[�x���P��]������
			htTmp =	JDB0017(iInIndex);
			
			if (htTmp.size() == 0)
			{
				return;
			}
			_log.message("(SBM0905)�L���x���ԍ��̍̔�");
			//�L���x���ԍ��̍̔�
			CollectNumber ODR_CD = new CollectNumber(CollectNumber.ONERCONS_CD	,
				_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
			strOdrCd = ODR_CD.getNo();
			//Insert
			sql	= " INSERT INTO  T_PAST_ONEROUS_CONS ( "
				+" ONEROUS_CONS_NO	,"				//�L���x���ԍ�
				+" COMPANY_CD ,"					//��ЃR�[�h
				+" VEND_CD ,"						//�����R�[�h
				+" PLANT_CD ,"						//�H��R�[�h
				+" JOB_ODR_CD ,"					//����
				+" JOB_ODR_DETAIL_NO ,"					//���Ԏ}��
				+" ITEM_CD ,"						//�i�ڔԍ�
				+" ISSUE_DATE ,"					//�o�ɓ�
				+" ISSUE_QTY ,"						//�o�ɐ�
				+" UNIT_COST ,"						//�P��
				+" UNIT_COST_TYP ,"					//�P���敪
				+" ONEROUS_CONS_COMMENT ,"				//�L���x�����l
				+" VEND_LOT_NO ,"					//���[�J���b�g�ԍ�
				+" RCV_ISSUE_CTRL_CD ,"					//���o�ɊǗ��ԍ�
				+" WORK_ODR_CD ,"					//��ƌv��ԍ�
				+" WORK_IN_PROC_CD ,"					//�d�|��ƃR�[�h
				+" PUCH_ODR_CD ,"					//�����ԍ�
//				+" CREATED_DATE ,"					//�쐬��
				+" CREATED_BY ,"					//�쐬��
				+" CREATED_PRG_NM ,"					//�쐬�v���O������
//				+" UPDATED_DATE ,"					//�X�V��
				+" UPDATED_BY ,"					//�X�V��
				+" UPDATED_PRG_NM ,"					//�X�V�v���O������
				+" MODIFY_COUNT )"						//�X�V��
				+" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
				+" ?, ?, ?,	?,? ) ";

			iIndex = 1;
			ps = _conn.prepareStatement(sql);
			ps.setString(iIndex++, strOdrCd);										//�L���x���ԍ�
			ps.setString(iIndex++, (String)htT.get("COMPANY_CD"));					//��ЃR�[�h
			ps.setString(iIndex++, (String)htT.get("VEND_CD"));						//�����R�[�h
			ps.setString(iIndex++, (String)htT.get("PLANT_CD"));					//�H��R�[�h
			if (iTyp == 1)
			{
				ps.setNull(iIndex++, Types.VARCHAR);								//����
				ps.setDouble(iIndex++, 0);											//���Ԏ}��
			}else if (iTyp == 2)
			{
				ps.setString(iIndex++, (String)htT_RCV_ISSUE.get("JOB_ODR_CD"));				//����	09-24-13-35?
				ps.setDouble(iIndex++, Double.parseDouble((String)htT_RCV_ISSUE.get("JOB_ODR_DETAIL_NO")));	//���Ԏ}��09-24-13-35?
			}
			ps.setString(iIndex++, (String)htT.get("ITEM_CD"));						//�i�ڔԍ�

			dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  ���o�ɔN����????????
//			ps.setDate(iIndex++,
//				(java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//�o�ɓ�
			ps.setDouble(iIndex++, Double.parseDouble((String)htT_RCV_ISSUE.get("RCV_ISSUE_QTY")) *	-1);	//�o�ɐ�
			if (((String)htTmp.get("COMPANY_CD")).equals(""))									//�P��
			{
				ps.setDouble(iIndex++, 0);
			} else {
				if (((String)htTmp.get("EFF_PHASE_IN_DATE")).compareTo(ginRCV_ISSUE_DATE) <= 0)		//???????????
				{
					if (htTmp.get("ONEROUS_FLG").equals("1"))
					{
						ps.setDouble(iIndex++, Double.parseDouble(((String)htTmp.get("UNIT_COST"))));
					} else if (htTmp.get("ONEROUS_FLG").equals("0"))
					{
						ps.setDouble(iIndex++, 0);
					}
				} else {
					ps.setDouble(iIndex++, 0);
				}
			}
			if (htTmp.get("COMPANY_CD").equals(""))									//�P���敪
			{
				ps.setDouble(iIndex++, 0);
			} else {
				ps.setDouble(iIndex++, Double.parseDouble((String)htTmp.get("UNIT_COST_TYP")));
			}
			ps.setNull(iIndex++, Types.VARCHAR);									//�L���x�����l
			ps.setNull(iIndex++, Types.VARCHAR);									//���[�J���b�g�ԍ�
			ps.setString(iIndex++, (String)htT_RCV_ISSUE.get("RCV_ISSUE_CTRL_CD"));	//���o�ɊǗ��ԍ�
			ps.setNull(iIndex++, Types.VARCHAR);									//��ƌv��ԍ�
			ps.setNull(iIndex++, Types.VARCHAR);									//�d�|��ƃR�[�h
			ps.setString(iIndex++, (String)htT.get("PUCH_ODR_CD"));					//�����ԍ�
			ps.setString(iIndex++, _userInfo.getUserId());					//
			ps.setString(iIndex++, _userInfo.getBusinessName());					//
			ps.setString(iIndex++, _userInfo.getUserId());					//
			ps.setString(iIndex++, _userInfo.getBusinessName());					//
			ps.setDouble(iIndex++, 0);
			iRC	= ps.executeUpdate();

			//DEBUG
//20031104			_log.message("�L���x�������̓o�^");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("�L���x�������̊Ǘ��ԍ�=["+strOdrCd+"]");
//20031104			_log.message("�L���x�������̓o�^����=["+iRC+"]");
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return ;
	}

	//[�x���P��]������
	private	Hashtable JDB0017(int iIndex)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";

		//�����������擾
		Hashtable htRC = new Hashtable();
		Hashtable htT =	new	Hashtable();
		String sCOMPANY_CD = "";
		String sVEND_CD	= "";
		String sITEM_CD	= "";
		try
		{
			_log.methodStart();

			htT	= (Hashtable)alT_ISSUE_INST.get(iIndex-1);
			sCOMPANY_CD	= (String)htT.get("COMPANY_CD");
			sVEND_CD = (String)htT.get("VEND_CD");
			sITEM_CD = (String)htT.get("ITEM_CD");
			//�ԋp�l������������B
			htRC.put("COMPANY_CD","");
			htRC.put("VEND_CD","");
			htRC.put("PLANT_CD","");
			htRC.put("ITEM_CD","");
			htRC.put("EFF_PHASE_IN_DATE","");
			htRC.put("UNIT_COST","");
			htRC.put("UNIT_COST_TYP","");
			htRC.put("ONEROUS_FLG","");
			//[�x���P��]������
			sql	= "SELECT M_CONS_UNIT_COST.COMPANY_CD, M_CONS_UNIT_COST.VEND_CD, M_CONS_UNIT_COST.PLANT_CD, "
				+ " M_CONS_UNIT_COST.ITEM_CD, M_CONS_UNIT_COST.UNIT_COST, M_CONS_UNIT_COST.UNIT_COST_TYP, "
				+ " M_CONS_UNIT_COST.EFF_PHASE_IN_DATE , M_CONS_UNIT_COST.ONEROUS_FLG"
				+ " FROM M_CONS_UNIT_COST "
				+ " WHERE ((M_CONS_UNIT_COST.COMPANY_CD=?) AND (M_CONS_UNIT_COST.VEND_CD=?) "
				+ " AND (M_CONS_UNIT_COST.ITEM_CD=?)) ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	sCOMPANY_CD);
			ps.setString(2,	sVEND_CD);
			ps.setString(3,	sITEM_CD);
			rs = ps.executeQuery();

			//DEBUG
//20031104			_log.message("�x���P���̌���");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("�o�Ɏw���E��ЃR�[�h�EsCOMPANY_CD=["+sCOMPANY_CD+"]");
//20031104			_log.message("�o�Ɏw���E�����R�[�h�EsVEND_CD=["+sVEND_CD+"]");
//20031104			_log.message("�o�Ɏw���E�o�ɕi�ڔԍ��EsITEM_CD=["+sITEM_CD+"]");

			if (rs.next())
			{
				if (rs.getString("COMPANY_CD") == null)
				{
					htRC.put("COMPANY_CD","");
				}else{
					htRC.put("COMPANY_CD",rs.getString("COMPANY_CD"));					//��ЃR�[�h
				}
				if (rs.getString("VEND_CD") == null)
				{
					htRC.put("VEND_CD","");
				}else{
					htRC.put("VEND_CD",rs.getString("VEND_CD"));						//�����R�[�h
				}
				if (rs.getString("PLANT_CD") == null)
				{
					htRC.put("PLANT_CD","");
				}else{
					htRC.put("PLANT_CD",rs.getString("PLANT_CD"));						//�H��R�[�h
				}
				if (rs.getString("ITEM_CD") == null)
				{
					htRC.put("ITEM_CD","");
				}else{
					htRC.put("ITEM_CD",rs.getString("ITEM_CD"));						//�i�ڔԍ�
				}
				if (rs.getDate("EFF_PHASE_IN_DATE") == null)
				{
					htRC.put("EFF_PHASE_IN_DATE","");
				}else{
					htRC.put("EFF_PHASE_IN_DATE",
						Converter.dateToStr(
							rs.getDate("EFF_PHASE_IN_DATE"),
							Converter.SLASH_DATE));							//�x���P���L���J�n��
				}
				if (rs.getString("UNIT_COST") == null)
				{
					htRC.put("UNIT_COST","");
				}else{
					htRC.put("UNIT_COST",rs.getString("UNIT_COST"));					//�P��
				}
				if (rs.getString("UNIT_COST_TYP") == null)
				{
					htRC.put("UNIT_COST_TYP","");
				}else{
					htRC.put("UNIT_COST_TYP",rs.getString("UNIT_COST_TYP"));			//�P���敪
				}
				if (rs.getString("ONEROUS_FLG") == null)
				{
					htRC.put("ONEROUS_FLG","");
				}else{
					htRC.put("ONEROUS_FLG",rs.getString("ONEROUS_FLG"));				//�L���t���O
				}
				//DEBUG
//20031104				_log.message("�x���P���L���J�n��=["+Converter.dateToStr(rs.getDate("EFF_PHASE_IN_DATE"),Converter.SLASH_DATE)+"]");
//20031104				_log.message("�P��=["+rs.getString("UNIT_COST")+"]");
//20031104				_log.message("�P���敪=["+rs.getString("UNIT_COST_TYP")+"]");
//20031104				_log.message("�L���t���O=["+rs.getString("ONEROUS_FLG")+"]");
			}
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return htRC;
	}

	//�y���ԕi�̕��o�ۊǋ�̏����z
//20031121�C���J�n
//	private	double	JDB0018(ResultSet rsIN, int iInIndex,	double	dInISSUENO)
//			throws SQLException,Exception{
	private	double	JDB0018(int iInIndex,	double	dInISSUENO)
			throws SQLException,Exception{
		ResultSet rsIN=null;
		PreparedStatement psIN=null;
		PreparedStatement psREAD=null;
//20031121�C���I��
		CollectNumber ODR_CD=null;
		String strOdrCd="";
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		int	iCount =0;
		int	iIndex =1;
		double	dIssueNO =0;
		double	dIssueNOOld	=0;
		double dIssueCountTemp=0;
		java.util.Date dtDate = null;
		Hashtable htT =	new	Hashtable();
		String sITEM_CD_MIN	= "";				//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�̕i�ڔԍ�
		String sWH_CD_MIN =	"";				//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�̕ۊǋ�R�[�h
		String sPLANT_CD_MIN = "";				//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�̍H��R�[�h
		String sWH_PRIORITY_REF_NO_MIN = "";			//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�
		String sJOB_ODR_CD_MIN = "";				//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�
		String sJOB_ODR_DETAIL_NO_MIN = "0";			//�u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�

		String sITEM_CD="";
		String sWH_CD="";
		String sPLANT_CD="";
		String sWH_PRIORITY_REF_NO="";
		String sPlantWH_CD = "";
		double dISSUECOUNT = 0;

		int WH_PRIORITY_FLG = 0;				//�i�ڕʕۊǐ�D�揇�ʃt���O�F�f�[�^���Ȃ��ꍇ�O�@20031012�ǋL

		try
		{
			_log.methodStart();
			//�����o�ɐ����擾
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);

//20031121�C���J�n
			// << �i�ڕʕۊǐ�D�揇�ʂ̌��� >>
			sql= "SELECT M_WH_PRIORITY.ITEM_CD, M_WH_PRIORITY.WH_CD, M_WH_PRIORITY.PLANT_CD, "
			+" M_WH_PRIORITY.WH_PRIORITY_REF_NO "
			+" FROM M_WH_PRIORITY "
			+" WHERE ((M_WH_PRIORITY.ITEM_CD=?) AND (M_WH_PRIORITY.PLANT_CD=?)) "
			+" ORDER BY WH_PRIORITY_REF_NO ";
			psIN = _conn.prepareStatement(sql);
			psIN.setString(1,	(String)htT.get("ITEM_CD"));
			psIN.setString(2,	(String)htT.get("PLANT_CD"));
			rsIN = psIN.executeQuery();
//20031121�C���I��

			dIssueNO = dInISSUENO;
			dIssueNOOld	= dIssueNO;

			//DEBUG
//20031104			_log.message("�L���x������o�^����");
//20031104			_log.message("�o�Ɏw���E�����ԍ��EPUCH_ODR_CD=["+(String)htT.get("PUCH_ODR_CD")+"]");
//20031104			_log.message("�o�Ɏw���E��ƌv��ԍ��EWORK_ODR_CD=["+(String)htT.get("WORK_ODR_CD")+"]");
//20031104			_log.message("�o�Ɏw���E�x���敪�ECONS_TYP=["+(String)htT.get("CONS_TYP")+"]");
			while (rsIN.next())
			{

				WH_PRIORITY_FLG = 1;

				sITEM_CD=rsIN.getString("ITEM_CD");
				sWH_CD=rsIN.getString("WH_CD");
				sPLANT_CD=rsIN.getString("PLANT_CD");
				sWH_PRIORITY_REF_NO=rsIN.getString("WH_PRIORITY_REF_NO");
				//DEBUG
//20031104				_log.message("iCount=["+iCount+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�i�ڔԍ��EsITEM_CD=["+sITEM_CD+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�ۊǋ�R�[�h�EsWH_CD=["+sWH_CD+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�H��R�[�h�EsPLANT_CD=["+sPLANT_CD+"]");
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʁE�i�ڕʕۊǐ�D�揇�ʁEsWH_PRIORITY_REF_NO=["+sWH_PRIORITY_REF_NO+"]");
//20031104				_log.message("���v�ʁE���ʕϐ��u���ԁv�EgsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");

				//20031011�ړ����P
				if (sWH_CD_MIN.equals(""))
				{
					sITEM_CD_MIN=sITEM_CD;
					sWH_CD_MIN=sWH_CD;
					sPLANT_CD_MIN=sPLANT_CD;
					sWH_PRIORITY_REF_NO_MIN=sWH_PRIORITY_REF_NO;
					sJOB_ODR_CD_MIN=gsJOB_ODR_CD;   //20031011�C���@(��)rs.getString("JOB_ODR_CD");
					sJOB_ODR_DETAIL_NO_MIN="0";       //20031011�C���@(��)Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO"));
					//DEBUG
//20031104					_log.message("iCount=["+iCount+"]");
//20031104					_log.message("�ۊǋ�ʐ��ԍ݌Ɂi�ŏ����j�E�i�ڔԍ��EsITEM_CD=["+sITEM_CD+"]");
//20031104					_log.message("�ۊǋ�ʐ��ԍ݌Ɂi�ŏ����j�E�ۊǋ�R�[�h�EsWH_CD=["+sWH_CD+"]");
//20031104					_log.message("�ۊǋ�ʐ��ԍ݌Ɂi�ŏ����j�E�H��R�[�h�EsPLANT_CD=["+sPLANT_CD+"]");
//20031104					_log.message("�ۊǋ�ʐ��ԍ݌Ɂi�ŏ����j�E���ԁEsJOB_ODR_CD_MIN=["+sJOB_ODR_CD_MIN+"]");
//20031104					_log.message("�ۊǋ�ʐ��ԍ݌Ɂi�ŏ����j�E���Ԏ}sJOB_ODR_DETAIL_NO_MIN=["+sJOB_ODR_DETAIL_NO_MIN+"]");
				}

				// << �ۊǋ�ʐ��ԍ݌ɂ̌��� >>
				sql	= "SELECT T_JOB_ODR_CD_STOCK.JOB_ODR_CD, T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
					+ " T_JOB_ODR_CD_STOCK.ITEM_CD, T_JOB_ODR_CD_STOCK.WH_CD, T_JOB_ODR_CD_STOCK.PLANT_CD, "
					+ " T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, T_JOB_ODR_CD_STOCK.PRVS_DAYEND_STOCK_QTY,  "
					+ " T_JOB_ODR_CD_STOCK.PRVS_MONTHEND_STOCK_QTY, T_JOB_ODR_CD_STOCK.PRVS_TERMEND_STOCK_QTY "
					+ " FROM T_JOB_ODR_CD_STOCK,M_WH "
					+ " WHERE ((T_JOB_ODR_CD_STOCK.ITEM_CD=?) AND (T_JOB_ODR_CD_STOCK.WH_CD=?) "
					+ " AND (T_JOB_ODR_CD_STOCK.PLANT_CD=?) AND (T_JOB_ODR_CD_STOCK.JOB_ODR_CD=?)  "
					+ " AND (T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY>0) "
					+" AND (T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD) "
					+" AND (M_WH.MRP_FLG = 1)) ";

//20031121�C���J�n
				psREAD = _conn.prepareStatement(sql);
				psREAD.setString(1,	(String)htT.get("ITEM_CD"));
				psREAD.setString(2,	sWH_CD);
				psREAD.setString(3,	(String)htT.get("PLANT_CD"));
				psREAD.setString(4,	gsJOB_ODR_CD);				//�O�����Ɏ擾�������ԁH�H�H
				rs = psREAD.executeQuery();
//				ps = _conn.prepareStatement(sql);
//				ps.setString(1,	(String)htT.get("ITEM_CD"));
//				ps.setString(2,	sWH_CD);
//				ps.setString(3,	(String)htT.get("PLANT_CD"));
//				ps.setString(4,	gsJOB_ODR_CD);				//�O�����Ɏ擾�������ԁH�H�H
//
//				//DEBUG
////20031104				_log.message("sql=["+sql+"]");
//				rs = ps.executeQuery();
//20031121�C���I��

				if (rs.next())
				{

					//20031011�ړ����P

					//���o�ɔԍ��̍̔�
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,
						_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"			//	���o�ɊǗ��ԍ�
						+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
						+	"ITEM_CD,"			//	�i�ڔԍ�
						+	"PLANT_CD,"			//	�H��R�[�h
						+	"WH_CD,"			//	�ۊǋ�R�[�h
						+	"JOB_ODR_CD,"			//	����
						+	"JOB_ODR_DETAIL_NO,"		//	���Ԏ}��
						+	"PUCH_ODR_CD,"			//	�����ԍ�
						+	"ACPT_NO,"			//	�����
						+	"ACPT_RSLT_CRCT_NO,"		//	������ђ�����
						+	"INSPEC_RSLT_CRCT_NO,"		//	�������ђ�����
						+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
						+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
						+	"PARTIAL_PRD_NO,"		//	�����
						+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
						+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
						+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
						+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
						+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
						+	"RCV_ISSUE_GNR_TYP,"		//	���o�ɔ����敪
						+	"RCV_ISSUE_ODD_QTY,"		//	���o�ɒ[��
						+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
						+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
						+	"RCV_ISSUE_CMPLT_FLG,"		//	���o�Ɋ����t���O
						+	"OD_NO,"			//	�I�[�_�f�}���h�ԍ�
						+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
						+	"RCV_ISSUE_COMMENT,"		//	���o�ɔ��l
						+	"COMPANY_CD,"			//	��ЃR�[�h
						+	"VEND_CD,"			//	�����R�[�h
						+	"CONS_TYP,"			//	�x���敪
						+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//						+	"CREATED_DATE,"			//	�쐬��
						+	"CREATED_BY,"			//	�쐬��
						+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//						+	"UPDATED_DATE,"			//	�X�V��
						+	"UPDATED_BY,"			//	�X�V��
						+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
						+	"MODIFY_COUNT) "		//	�X�V��
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+ "?, ?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					ps.setString(iIndex++, strOdrCd);								//	���o�ɊǗ��ԍ�
					ps.setDouble(iIndex++, 2);									//	���o�ɋ敪
					ps.setString(iIndex++, rs.getString("ITEM_CD"));						//	�i�ڔԍ�
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//	�H��R�[�h
					ps.setString(iIndex++, rs.getString("WH_CD"));							//	�ۊǋ�R�[�h
					ps.setString(iIndex++, rs.getString("JOB_ODR_CD"));						//	����	09-24-13-30?
					ps.setDouble(iIndex++, rs.getDouble("JOB_ODR_DETAIL_NO"));					//	 ���Ԏ}��09-24-13-30?
					ps.setString(iIndex++, ginPUCH_ODR_CD);								//	�����ԍ�
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	���������
					ps.setDouble(iIndex++, 0);									//	�������ђ�����
					ps.setString(iIndex++, ginWORK_ODR_CD);								//	��ƌv��ԍ�
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	��ƃR�[�h
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	��Ǝ��ђ�����
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//	�o�Ɏw���ԍ�
					dIssueCountTemp	= rs.getDouble("STOCK_ON_HAND_QTY");
//					dIssueCountTemp	= (new Double(dIssueCountTemp)).intValue();
					if (dIssueCountTemp	>= dIssueNO)
					{
						dIssueCountTemp	= dIssueNO;
//						dIssueNO = 0;
//					} else {
//						dIssueNO = dIssueNO	- dIssueCountTemp;
					}
					ps.setDouble(iIndex++, dIssueCountTemp * -1);							//	���o�ɐ�
					ps.setDouble(iIndex++, 0);									//	���o�ɋ��z
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  ���o�ɔN����????????
//					ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//  ���o�ɔN����???????????
					ps.setDouble(iIndex++, 21);														//	���o�ɔ����敪
					ps.setDouble(iIndex++, 0);														//	���o�ɒ[��
					ps.setNull(iIndex++, Types.VARCHAR);											//	���o�ɕs�Ǘ��R�R�[�h	OK?
					ps.setDouble(iIndex++, 1);														//	�݌ɍX�V�敪
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	���o�Ɋ����t���O
					ps.setString(iIndex++, (String)htT.get("OD_NO"));								//  �I�[�_�f�}���h�ԍ�
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");														//	���[�J���b�g�ԍ�
					ps.setString(iIndex++, "");														//	���o�ɔ��l
					ps.setString(iIndex++, "");														//	��ЃR�[�h
					ps.setString(iIndex++, "");														//	�����R�[�h
					ps.setDouble(iIndex++, 0);														//  �x���敪
					ps.setNull(iIndex++, Types.DATE);												//  �L���x�����ђ��o��
		//			ps.setDate(iIndex++, "");		//	�쐬��
					ps.setString(iIndex++, _userInfo.getUserId());		//	�쐬��
					ps.setString(iIndex++, _userInfo.getBusinessName());		//	�쐬�v���O������
		//			ps.setString(iIndex++, "");		//	�X�V��
					ps.setString(iIndex++, _userInfo.getUserId());		//	�X�V��
					ps.setString(iIndex++, _userInfo.getBusinessName());		//	�X�V�v���O������
					ps.setDouble(iIndex++, 0);		//	�X�V��

					iIndex=ps.executeUpdate();
					ps.close();
					if (iIndex > 0)
					{
						iCount++;
						dISSUECOUNT = dISSUECOUNT + dIssueCountTemp;
						dIssueNO = dIssueNO	- dIssueCountTemp;
					}
					//DEBUG
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^�ԍ�01=["+strOdrCd+"]");
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^����01=["+iIndex+"]");

					//�o�ɏ������Ăяo��
					_log.message("(SBM1199)�o�ɏ������Ăяo��......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("�L���x������o�^");
						// �o�^�����ۊǋ�ʓ��o�ɂ�ۑ�
						if (rs.getString("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));					//	�i�ڔԍ�
						}
						if (rs.getString("WH_CD") == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));					//	�ۊǋ�R�[�h
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);					//	�����ԍ�
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);						//	�����
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);				//	������ђ�����
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);					//	��ƌv��ԍ�
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);				//	�d�|��ƃR�[�h
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);					//	�����
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);				//	��Ǝ��ђ�����
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);					//	���o�ɔN����
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);			//	���o�Ɋ����t���O
						}
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);						//	���o�ɊǗ��ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");								//	���o�ɋ敪
						htT_RCV_ISSUE.put("PLANT_CD",htT.get("PLANT_CD"));						//	�H��R�[�h
						if (rs.getString("JOB_ODR_CD") == null)
						{
							htT_RCV_ISSUE.put("JOB_ODR_CD","");							//	����
						}else{
							htT_RCV_ISSUE.put("JOB_ODR_CD",rs.getString("JOB_ODR_CD"));				//	����
						}
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO",Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO")));	//	���Ԏ}��
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");							//	�������ђ�����
						htT_RCV_ISSUE.put("ISSUE_INST_CD",htT.get("ISSUE_INST_CD"));					//	�o�Ɏw���ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueCountTemp *	-1));			//	���o�ɐ�
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");							//	���o�ɋ��z
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");							//	���o�ɔ����敪
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");							//	���o�ɒ[��
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");							//	���o�ɕs�Ǘ��R�R�[�h
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");								//	�݌ɍX�V�敪
						htT_RCV_ISSUE.put("OD_NO",htT.get("OD_NO"));							//	�I�[�_�f�}���h�ԍ�
						htT_RCV_ISSUE.put("VEND_LOT_NO","");								//	���[�J���b�g�ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");							//	���o�ɔ��l
						htT_RCV_ISSUE.put("COMPANY_CD","");								//	��ЃR�[�h
						htT_RCV_ISSUE.put("VEND_CD","");								//	�����R�[�h
						htT_RCV_ISSUE.put("CONS_TYP","");								//	�x���敪
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");								//	�L���x�����ђ��o��

						// [�L���x������]�ւ̒ǉ�
						JDB0016(iInIndex, 2);
					}
				}
//20031121�ǉ�
//20031125
				if (psREAD != null)
				{
					psREAD.close();
				}
				if (dIssueNO==0)
				{
					break;
				}

			}
			//
//20031012�폜			if (iCount != 0	&& dIssueNO	> 0)
			if (WH_PRIORITY_FLG == 1 && dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("�i�ڕʕۊǐ�D�揇�ʂ̍ŏ��ۊǋ悩��A�o��");
				//���o�ɔԍ��̍̔�
				ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
				strOdrCd = ODR_CD.getNo();

				// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
				sql	= "insert into "
					+" T_RCV_ISSUE( "
					+" RCV_ISSUE_CTRL_CD,"			//	���o�ɊǗ��ԍ�
					+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
					+	"ITEM_CD,"			//	�i�ڔԍ�
					+	"PLANT_CD,"			//	�H��R�[�h
					+	"WH_CD,"			//	�ۊǋ�R�[�h
					+	"JOB_ODR_CD,"			//	����
					+	"JOB_ODR_DETAIL_NO,"		//	���Ԏ}��
					+	"PUCH_ODR_CD,"			//	�����ԍ�
					+	"ACPT_NO,"			//	�����
					+	"ACPT_RSLT_CRCT_NO,"		//	������ђ�����
					+	"INSPEC_RSLT_CRCT_NO,"		//	�������ђ�����
					+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
					+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
					+	"PARTIAL_PRD_NO,"		//	�����
					+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
					+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
					+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
					+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
					+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
					+	"RCV_ISSUE_GNR_TYP,"		//	���o�ɔ����敪
					+	"RCV_ISSUE_ODD_QTY,"		//	���o�ɒ[��
					+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
					+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
					+	"RCV_ISSUE_CMPLT_FLG,"		//	���o�Ɋ����t���O
					+	"OD_NO,"			//	�I�[�_�f�}���h�ԍ�
					+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
					+	"RCV_ISSUE_COMMENT,"		//	���o�ɔ��l
					+	"COMPANY_CD,"			//	��ЃR�[�h
					+	"VEND_CD,"			//	�����R�[�h
					+	"CONS_TYP,"			//	�x���敪
					+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//					+	"CREATED_DATE,"			//	�쐬��
					+	"CREATED_BY,"			//	�쐬��
					+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//					+	"UPDATED_DATE,"			//	�X�V��
					+	"UPDATED_BY,"			//	�X�V��
					+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
					+	"MODIFY_COUNT)	"		//	�X�V��
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
					+" ?, ?, ?, ?, ?, ?, ?, ?)";
				ps = _conn.prepareStatement(sql);
				iIndex = 1;
				ps.setString(iIndex++, strOdrCd);								//	���o�ɊǗ��ԍ�
				ps.setDouble(iIndex++, 2);									//	���o�ɋ敪
				ps.setString(iIndex++, sITEM_CD_MIN);								//	�i�ڔԍ�
				ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//  �H��R�[�h
				ps.setString(iIndex++, sWH_CD_MIN);								//	�ۊǋ�R�[�h
				ps.setString(iIndex++, sJOB_ODR_CD_MIN);							//	 ����			 OK?
				ps.setDouble(iIndex++, Double.parseDouble(sJOB_ODR_DETAIL_NO_MIN));				//  ���Ԏ}��		  OK?
//20031012				ps.setDouble(iIndex++, 0);									//  ���Ԏ}��		  OK?
				ps.setString(iIndex++, ginPUCH_ODR_CD);								//	�����ԍ�
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	�����
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	������ђ�����
				ps.setDouble(iIndex++, 0);									//	�������ђ�����
				ps.setString(iIndex++, ginWORK_ODR_CD);								//	��ƌv��ԍ�
				ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	�d�|��ƃR�[�h
				ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	�����
				ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	��Ǝ��ђ�����
				ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//  �o�Ɏw���ԍ�
				ps.setDouble(iIndex++, dIssueNO	* -1);								//	���o�ɐ�
				ps.setDouble(iIndex++, 0);									//	���o�ɋ��z
				dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
				ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  ���o�ɔN����????????
//				ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));//	���o�ɔN����???????????
				ps.setDouble(iIndex++, 21);									//	���o�ɔ����敪
				ps.setDouble(iIndex++, 0);									//	���o�ɒ[��
				ps.setNull(iIndex++, Types.VARCHAR);								//	 ���o�ɕs�Ǘ��R�R�[�h		 ?
				ps.setDouble(iIndex++, 1);									//	�݌ɍX�V�敪
				ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	���o�Ɋ����t���O
				ps.setString(iIndex++, (String)htT.get("OD_NO"));						//  �I�[�_�f�}���h�ԍ�
				//-----------------------------------------------------------------
				ps.setString(iIndex++, "");									//	���[�J���b�g�ԍ�
				ps.setString(iIndex++, "");									//	���o�ɔ��l
				ps.setString(iIndex++, "");									//	��ЃR�[�h
				ps.setString(iIndex++, "");									//	�����R�[�h
				ps.setDouble(iIndex++, 0);									//  �x���敪
				ps.setNull(iIndex++, Types.DATE);								//  �L���x�����ђ��o��
	//			ps.setDate(iIndex++, "");		//	�쐬��
				ps.setString(iIndex++, _userInfo.getUserId());							//	�쐬��
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	�쐬�v���O������
	//			ps.setString(iIndex++, "");				//	�X�V��
				ps.setString(iIndex++, _userInfo.getUserId());							//	�X�V��
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	�X�V�v���O������
				ps.setDouble(iIndex++, 0);									//	�X�V��

				iIndex=ps.executeUpdate();
				if (iIndex > 0)
				{
					iCount++;  //20031012�ǋL
					dISSUECOUNT = dISSUECOUNT + dIssueNO;
				}
				ps.close();
				//DEBUG
//20031104				_log.message("�ۊǋ�ʓ��o�ɂ̓o�^�ԍ�02=["+strOdrCd+"]");
//20031104				_log.message("�ۊǋ�ʓ��o�ɂ̓o�^����02=["+iIndex+"]");

				//�o�ɏ������Ăяo��
				_log.message("(SBM1199)�o�ɏ������Ăяo��......");
				_IssueProcess = new IssueProcess(_iconn, strOdrCd);
				_IssueProcess.execProcess();

				if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
					(((String)htT.get("WORK_ODR_CD")).equals("")) &&
					(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
				{
					//DEBUG
//20031104					_log.message("�L���x������o�^");
					// �o�^�����ۊǋ�ʓ��o�ɂ�ۑ�
					if (sITEM_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("ITEM_CD","");
					}else{
						htT_RCV_ISSUE.put("ITEM_CD",sITEM_CD_MIN);					//	�i�ڔԍ�
					}
					if (sWH_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("WH_CD","");
					}else{
						htT_RCV_ISSUE.put("WH_CD",sWH_CD_MIN);						//	�ۊǋ�R�[�h
					}
					if (ginPUCH_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("PUCH_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);				//	�����ԍ�
					}
					if (ginACPT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);					//	�����
					}
					if (ginACPT_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);			//	������ђ�����
					}
					if (ginWORK_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);				//	��ƌv��ԍ�
					}
					if (ginWORK_IN_PROC_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);			//	�d�|��ƃR�[�h
					}
					if (ginPARTIAL_PRD_NO == null)
					{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
					}else{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);				//	�����
					}
					if (ginOPR_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);			//	��Ǝ��ђ�����
					}
					if (ginRCV_ISSUE_DATE == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);				//	���o�ɔN����
					}
					if (ginRCV_ISSUE_CMPLT_FLG == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);		//	���o�Ɋ����t���O
					}
					htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);					//	���o�ɊǗ��ԍ�
					htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");							//	���o�ɋ敪
					htT_RCV_ISSUE.put("PLANT_CD",htT.get("PLANT_CD"));					//	�H��R�[�h
					if (sJOB_ODR_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("JOB_ODR_CD","");						//	����
					}else{
						htT_RCV_ISSUE.put("JOB_ODR_CD",sJOB_ODR_CD_MIN);				//	����
					}
					htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO",sJOB_ODR_DETAIL_NO_MIN);				//	���Ԏ}��
//20031012					htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");						//	���Ԏ}��
					htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");						//	�������ђ�����
					htT_RCV_ISSUE.put("ISSUE_INST_CD",htT.get("ISSUE_INST_CD"));				//	�o�Ɏw���ԍ�
					htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO * -1));			//	���o�ɐ�
					htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");						//	���o�ɋ��z
					htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");						//	���o�ɔ����敪
					htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");						//	���o�ɒ[��
					htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");						//	���o�ɕs�Ǘ��R�R�[�h
					htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");							//	�݌ɍX�V�敪
					htT_RCV_ISSUE.put("OD_NO",htT.get("OD_NO"));						//	�I�[�_�f�}���h�ԍ�
					htT_RCV_ISSUE.put("VEND_LOT_NO","");							//	���[�J���b�g�ԍ�
					htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");						//	���o�ɔ��l
					htT_RCV_ISSUE.put("COMPANY_CD","");							//	��ЃR�[�h
					htT_RCV_ISSUE.put("VEND_CD","");							//	�����R�[�h
					htT_RCV_ISSUE.put("CONS_TYP","");							//	�x���敪
					htT_RCV_ISSUE.put("CONS_EXEC_DATE","");							//	�L���x�����ђ��o��

					// [�L���x������]�ւ̒ǉ�
					JDB0016(iInIndex,2);
				}
			}

//---20031010�C����
			//�C�@�ő��݂��Ȃ��ꍇ�́A[�H��]���ȉ��̏����Ō������A�u��\�[���ꏊ�R�[�h�v���擾����B
			if (iCount == 0	&& dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("�u��\�[���ꏊ�R�[�h�v����A�o��");
				// << �H��̌��� >>
				sql	= "SELECT M_PLANT.PLANT_CD, M_PLANT.WH_CD "
					+" FROM M_PLANT "
					+" WHERE (((M_PLANT.PLANT_CD)=?)) ";
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	(String)htT.get("PLANT_CD"));
				rs = ps.executeQuery();
				if (rs.next())
				{
					sPlantWH_CD	= rs.getString("WH_CD");
				}
				ps.close();
				rs.close();

				if (sPlantWH_CD == null || sPlantWH_CD.equals(""))	// 20031031�ǉ�
				{
					// << �ۊǋ�̌��� >>
					sql	= "SELECT M_WH.WH_CD "
						+ " FROM M_WH "
						+ " WHERE ((M_WH.PLANT_CD=?) "	// 20031031�ǉ�
						+ " AND (M_WH.MRP_FLG = 1)) "	// 20031031�ǉ�
						+ " ORDER BY M_WH.WH_CD ";
//20031121�C���J�n
					psREAD = _conn.prepareStatement(sql);
					psREAD.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031�ǉ�
					rs = psREAD.executeQuery();
//					ps = _conn.prepareStatement(sql);
//					ps.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031�ǉ�
//					rs = ps.executeQuery();
//20031121�C���I��


					if (rs.next())
					{
						sPlantWH_CD	= rs.getString("WH_CD");
					}
				}
				// << �ۊǋ�ʐ��ԍ݌ɂ̌��� >>
//20031010				sql	= "SELECT T_JOB_ODR_CD_STOCK.JOB_ODR_CD, T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
//					+ " T_JOB_ODR_CD_STOCK.ITEM_CD, T_JOB_ODR_CD_STOCK.WH_CD, T_JOB_ODR_CD_STOCK.PLANT_CD, "
//					+ " T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, T_JOB_ODR_CD_STOCK.PRVS_DAYEND_STOCK_QTY,  "
//					+ " T_JOB_ODR_CD_STOCK.PRVS_MONTHEND_STOCK_QTY, T_JOB_ODR_CD_STOCK.PRVS_TERMEND_STOCK_QTY "
//					+ " FROM T_JOB_ODR_CD_STOCK,M_WH "
//					+ " WHERE ((T_JOB_ODR_CD_STOCK.ITEM_CD=?) AND (T_JOB_ODR_CD_STOCK.WH_CD=?) "
//					+ " AND (T_JOB_ODR_CD_STOCK.PLANT_CD=?) AND (T_JOB_ODR_CD_STOCK.JOB_ODR_CD=?)  "
//					+" AND (T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD) "
//					+" AND (M_WH.MRP_FLG = 1)) ";
//				ps = _conn.prepareStatement(sql);
//				ps.setString(1,	(String)htT.get("ITEM_CD"));
//				ps.setString(2,	sPlantWH_CD);
//				ps.setString(3,	(String)htT.get("PLANT_CD"));
//				ps.setString(4,	gsJOB_ODR_CD);				//�O�����Ɏ擾�������ԁH�H�H
//				rs = ps.executeQuery();
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("ITEM_CD=["+(String)htT.get("ITEM_CD")+"]");
//20031104				_log.message("sPlantWH_CD=["+sPlantWH_CD+"]");
//20031104				_log.message("PLANT_CD=["+(String)htT.get("PLANT_CD")+"]");
//20031104				_log.message("gsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");

//20031010				if (rs.next())
				if(sPlantWH_CD != null || !sPlantWH_CD.equals(""))
				{
					//���o�ɔԍ��̍̔�
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,
						_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"			//	���o�ɊǗ��ԍ�
						+	"RCV_ISSUE_TYP,"		//	���o�ɋ敪
						+	"ITEM_CD,"			//	�i�ڔԍ�
						+	"PLANT_CD,"			//	�H��R�[�h
						+	"WH_CD,"			//	�ۊǋ�R�[�h
						+	"JOB_ODR_CD,"			//	����
						+	"JOB_ODR_DETAIL_NO,"		//	���Ԏ}��
						+	"PUCH_ODR_CD,"			//	�����ԍ�
						+	"ACPT_NO,"			//	�����
						+	"ACPT_RSLT_CRCT_NO,"		//	������ђ�����
						+	"INSPEC_RSLT_CRCT_NO,"		//	�������ђ�����
						+	"WORK_ODR_CD,"			//	��ƌv��ԍ�
						+	"WORK_IN_PROC_CD,"		//	�d�|��ƃR�[�h
						+	"PARTIAL_PRD_NO,"		//	�����
						+	"OPR_RSLT_CRCT_NO,"		//	��Ǝ��ђ�����
						+	"ISSUE_INST_CD,"		//	�o�Ɏw���ԍ�
						+	"RCV_ISSUE_QTY,"		//	���o�ɐ�
						+	"RCV_ISSUE_AMOUNT,"		//	���o�ɋ��z
						+	"RCV_ISSUE_DATE,"		//	���o�ɔN����
						+	"RCV_ISSUE_GNR_TYP,"		//	���o�ɔ����敪
						+	"RCV_ISSUE_ODD_QTY,"		//	���o�ɒ[��
						+	"DEFECT_CAUSE_CD,"		//	���o�ɕs�Ǘ��R�R�[�h
						+	"STOCK_UPD_TYP,"		//	�݌ɍX�V�敪
						+	"RCV_ISSUE_CMPLT_FLG,"		//	���o�Ɋ����t���O
						+	"OD_NO,"			//	�I�[�_�f�}���h�ԍ�
						+	"VEND_LOT_NO,"			//	���[�J���b�g�ԍ�
						+	"RCV_ISSUE_COMMENT,"		//	���o�ɔ��l
						+	"COMPANY_CD,"			//	��ЃR�[�h
						+	"VEND_CD,"			//	�����R�[�h
						+	"CONS_TYP,"			//	�x���敪
						+	"CONS_EXEC_DATE,"		//	�L���x�����ђ��o��
//						+	"CREATED_DATE,"			//	�쐬��
						+	"CREATED_BY,"			//	�쐬��
						+	"CREATED_PRG_NM,"		//	�쐬�v���O������
//						+	"UPDATED_DATE,"			//	�X�V��
						+	"UPDATED_BY,"			//	�X�V��
						+	"UPDATED_PRG_NM,"		//	�X�V�v���O������
						+	"MODIFY_COUNT)	"		//	�X�V��
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+"?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+"?, ?, ?, ?, ?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					iIndex = 1;
					ps.setString(iIndex++, strOdrCd);								//	���o�ɊǗ��ԍ�
					ps.setDouble(iIndex++, 2);									//	���o�ɋ敪
//20031010					ps.setString(iIndex++, rs.getString("ITEM_CD"));						//	�i�ڔԍ�
					ps.setString(iIndex++, (String)htT.get("ITEM_CD"));						//	�i�ڔԍ�
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//  �H��R�[�h
//20031010					ps.setString(iIndex++, rs.getString("WH_CD"));							//	�ۊǋ�R�[�h
					ps.setString(iIndex++, sPlantWH_CD);								//	�ۊǋ�R�[�h
//20031010					ps.setString(iIndex++, rs.getString("JOB_ODR_CD"));						//	 ����		 OK?
					ps.setString(iIndex++, gsJOB_ODR_CD);								//	 ����		 OK?
//20031010					ps.setDouble(iIndex++, rs.getDouble("JOB_ODR_DETAIL_NO"));					//  ���Ԏ}��	  OK?
					ps.setDouble(iIndex++, 0);									//  ���Ԏ}��	  OK?
					ps.setString(iIndex++, ginPUCH_ODR_CD);								//	�����ԍ�
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	������ђ�����
					ps.setDouble(iIndex++, 0);									//	�������ђ�����
					ps.setString(iIndex++, ginWORK_ODR_CD);								//	��ƌv��ԍ�
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	�d�|��ƃR�[�h
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	�����
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	��Ǝ��ђ�����
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//  �o�Ɏw���ԍ�
					ps.setDouble(iIndex++, dIssueNO * -1);								//	���o�ɐ�
					ps.setDouble(iIndex++, 0);									//	���o�ɋ��z
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  ���o�ɔN����????????
//					ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));//  ���o�ɔN����????????
					ps.setDouble(iIndex++, 21);									//	���o�ɔ����敪
					ps.setDouble(iIndex++, 0);									//	���o�ɒ[��
					ps.setString(iIndex++, "");									//	���o�ɕs�Ǘ��R�R�[�h?
					ps.setDouble(iIndex++, 1);									//	�݌ɍX�V�敪
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	���o�Ɋ����t���O
					ps.setString(iIndex++, (String)htT.get("OD_NO"));						//  �I�[�_�f�}���h�ԍ�
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");									//	���[�J���b�g�ԍ�
					ps.setString(iIndex++, "");									//	���o�ɔ��l
					ps.setString(iIndex++, "");									//	��ЃR�[�h
					ps.setString(iIndex++, "");									//	�����R�[�h
					ps.setDouble(iIndex++, 0);									//	�x���敪
					ps.setNull(iIndex++, Types.DATE);								//  �L���x�����ђ��o��
		//			ps.setDate(iIndex++, "");		//	�쐬��
					ps.setString(iIndex++, _userInfo.getUserId());							//	�쐬��
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	�쐬�v���O������
		//			ps.setString(iIndex++, "");		//	�X�V��
					ps.setString(iIndex++, _userInfo.getUserId());							//	�X�V��
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	�X�V�v���O������
					ps.setDouble(iIndex++, 0);									//	�X�V��

					iIndex=ps.executeUpdate();
					if (iIndex > 0)
					{
						dISSUECOUNT = dISSUECOUNT + dIssueNO;
					}
					ps.close();
					//DEBUG
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^�ԍ�03=["+strOdrCd+"]");
//20031104					_log.message("�ۊǋ�ʓ��o�ɂ̓o�^����03=["+iIndex+"]");

					//�o�ɏ������Ăяo��
					_log.message("(SBM1199)�o�ɏ������Ăяo��......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("�L���x������o�^");
						// �o�^�����ۊǋ�ʓ��o�ɂ�ۑ�
						if ((String)htT.get("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",(String)htT.get("ITEM_CD"));			//	�i�ڔԍ�
						}
						if (sPlantWH_CD == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",sPlantWH_CD);						//	�ۊǋ�R�[�h
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);				//	�����ԍ�
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);					//	�����
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);			//	������ђ�����
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);				//	��ƌv��ԍ�
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);			//	�d�|��ƃR�[�h
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);				//	�����
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);			//	��Ǝ��ђ�����
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);				//	���o�ɔN����
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);		//	���o�Ɋ����t���O
						}
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);					//	���o�ɊǗ��ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");							//	���o�ɋ敪
						htT_RCV_ISSUE.put("PLANT_CD",htT.get("PLANT_CD"));					//	�H��R�[�h
						if (gsJOB_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("JOB_ODR_CD","");						//	����
						}else{
							htT_RCV_ISSUE.put("JOB_ODR_CD",gsJOB_ODR_CD);					//	����
						}
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");						//	���Ԏ}��
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");						//	�������ђ�����
						htT_RCV_ISSUE.put("ISSUE_INST_CD",htT.get("ISSUE_INST_CD"));				//	�o�Ɏw���ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO * -1));			//	���o�ɐ�
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");						//	���o�ɋ��z
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");						//	���o�ɔ����敪
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");						//	���o�ɒ[��
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");						//	���o�ɕs�Ǘ��R�R�[�h
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");							//	�݌ɍX�V�敪
						htT_RCV_ISSUE.put("OD_NO",htT.get("OD_NO"));						//	�I�[�_�f�}���h�ԍ�
						htT_RCV_ISSUE.put("VEND_LOT_NO","");							//	���[�J���b�g�ԍ�
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");						//	���o�ɔ��l
						htT_RCV_ISSUE.put("COMPANY_CD","");							//	��ЃR�[�h
						htT_RCV_ISSUE.put("VEND_CD","");							//	�����R�[�h
						htT_RCV_ISSUE.put("CONS_TYP","");							//	�x���敪
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");							//	�L���x�����ђ��o��

						// [�L���x������]�ւ̒ǉ�
						JDB0016(iInIndex,2);
					}
				} else {
					_log.message("(SBM1200)�ۊǋ�R�[�h���擾�ł��܂���ł����̂ŁA�o�ɏ����͍s���܂���ł����B");
				}
//20031121�ǉ�
//20031125
				if (psREAD != null)
				{
					psREAD.close();
				}
			}

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121�C���J�n
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (psIN != null)
			{
				psIN.close();
			}
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031121�C���I��
			if (ps != null)
			{
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if (rsIN != null) {
				try {
					rsIN.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsIN = null;
			}
		}
		return dISSUECOUNT;
	};

	// -------------------------------------------------------------------------------------------
	//	 Common	Sub	Class
	// -------------------------------------------------------------------------------------------
	/**
	 *�@���[�U���ێ��p�N���X(�C���i�[�N���X)
	 */
	class UserInfo {

		private	String userId;			   // ���[�UID
		private	String businessName;	   // �Ɩ���

		public UserInfo(String userId, String businessName)	{
			this.userId	= userId;
			this.businessName =	businessName;
		}
		public String getUserId() {
			return userId;
		}
		public String getBusinessName()	{
			return businessName;
		}
	}
	/**
	 * ���O�o��(�C���i�[�N���X)
	 */
	class Log {
		private	int	indent = 0;
		private	SystemLog _syslog =	new	SystemLog();   // �������O�o�̓N���X

		// �R���X�g���N�^	  // 2003/08/11	connection�擾���C��
		public Log(String className,IDbConnection	conn){
			// ����	������
			_syslog.init(className);
			_syslog.setConnection(conn);
		}

		public void	methodStart() {
			log("start");
			indent++;
		}
		public void	methodEnd()	{
			indent--;
			log("end");
		}
		public void	message(String message)	{
			log(message);
		}
		private	void log(String	message) {

			// ���̃��\�b�h���Ăяo�������\�b�h���擾
			// (JDK1.3�̏ꍇSecurityManager#getStackTrace()���g��)
			StackTraceElement e	= (new Throwable()).getStackTrace()[2];
//			SecurityManager	e =	(new Throwable()).getStackTrace()[2];

			String className = e.getClassName();
			String methodName =	e.getMethodName();

			// �p�b�P�[�W���������N���X�����擾
			StringTokenizer	st = new StringTokenizer(className,	".");
			String lastClassName = "";
			while (st.hasMoreTokens()) {
				lastClassName =	st.nextToken();
			}
			// ���̎��Ԃ��擾
			Date now = new Date();
			SimpleDateFormat f = new SimpleDateFormat("M/d HH:mm:ss.SSS");
			String sNow	= f.format(now);
			String out = sNow +	" <" + indent +	"> [" +	lastClassName +	"/"	+ methodName + "] "	+  message;

			// ����	���O�o��
			_syslog.fine_d(	out, _userInfo.getUserId() );

			// ���O�o��(System.out��)
//			System.out.println(out);
		}
	}
}
