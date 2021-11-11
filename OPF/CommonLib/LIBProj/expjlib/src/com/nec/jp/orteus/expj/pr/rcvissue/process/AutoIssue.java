/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/AutoIssue.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.text.ParseException;

import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.expj.pr.rcvissue.mst.ConsUnitCost;
import com.nec.jp.orteus.expj.util.Numbering;


/**
 * <pre>
 * �����o�ɂ̋��ʏ������s���܂��B
 * ���̃N���X�́A�ȉ��̋Ɩ���������Ăяo����܂��B
 * �@�P�D��Ǝ��ѓ���
 * �@�Q�D�o�������ѓ���
 * �@�R�D������ѓ��́A������у����e�i���X
 * </pre>
 *
 * @author $Author: li-lu $
 * @version $Revision: 1.8 $ $Date: 2014/12/29 07:36:57 $
 */

public class AutoIssue {

	private	IDbConnection _iconn;			// �g�����U�N�V�����R�l�N�V�������
	private	Connection _conn;				// �R�l�N�V�������
	private	String _plantCd;				// �H��R�[�h
	private	UpdateInfo _updInfo;			// ���p�ҊǗ����(�C���i�[�N���X)
	private	Log	_log;						// ���O���(�C���i�[�N���X)

	private WhAutoIssueProc.AutoIssueParam gin;	//�����o�ɋN���p�����[�^

	//���Ɍ��ʏo�͗p������i�o�Ɏw���ԍ��j
	static final  String strDtl = "T_ISSUE_INST.ISSUE_INST_CD:";
	
	/**
	 * �R���X�g���N�^
	 *
	 * @param conn �R�l�N�V�������
	 * @param plantCd �H��R�[�h
	 * @param userId ���[�UID
	 * @param businessName �Ɩ���
	 */
	public AutoIssue(IDbConnection conn, String plantCd, String userId, String businessName) {

		_iconn = conn;
		_conn =	_iconn.getConn();
		_plantCd = plantCd;
		_updInfo =	new	UpdateInfo(userId,businessName,0);

		// ���O�p���i�̏��������s��
		String className = this.getClass().getName();
		className	= className.substring(0,className.lastIndexOf("."));
		_log = new Log(className,_iconn);
	}
	
	//----------------------------------------------------
	//      ���J���\�b�h
	//----------------------------------------------------

	/**
	 * �����o�ɏ����E���C������
	 * @param inParam �����o�ɋN���p�����[�^<pre>
	 *   m_WORK_ODR_CD          ��ƌv��ԍ�
	 *   m_WORK_IN_PROC_CD      ��ƃR�[�h
	 *   m_PARTIAL_PRD_NO       �����
	 *   m_OPR_RSLT_CRCT_NO     ��Ǝ��ђ�����
	 *   m_PUCH_ODR_CD          �����ԍ�
	 *   m_ACPT_NO              �����
	 *   m_ACPT_RSLT_CRCT_NO    ���������
	 *   m_RCV_ISSUE_TYP        �����o�ɏ����敪
	 *   m_RCV_ISSUE_DATE       �o�ɔN����
	 *   m_RCV_ISSUE_RSLT_NO    �����Ώێ��ѐ�
	 *   m_RCV_ISSUE_CMPLT_FLG  �o�Ɋ����t���O
	 *   m_PLANT_CD             �H��R�[�h
	 * </pre>
	 * 
	 * @return true/false  (true;����I��(�x�����܂�) false; �ُ�I���j
	 *  <pre>
	 *  ���s���ʂ�false�̏ꍇ�́A�����o�Ɍ��ʂ̃��b�Z�[�W�R�[�h���X�g���擾����
	 *  �K�X�A�G���[���b�Z�[�W�o�͏������s���K�v������܂��B
	 *          ���b�Z�[�W�R�[�h���X�g�`��:  String[]��List 
	 *                                       String[0]--> ���b�Z�[�W�R�[�h
	 *                                       String[1]--> ���b�Z�[�W�ڍׁi�i�ڃR�[�h�܂��͏o�Ɏw���ԍ��j
	 *  </pre>
	 * @throws SQLException
	 */
	public boolean AutoIssueOpr(WhAutoIssueProc.AutoIssueParam inParam)		
			throws SQLException, FoundationException {

		int	iIssueCount	= 0;
		boolean ret = false;	//�����o�ɏ�������

		//�����o�ɑΏەi�ڂ̏o�Ɏw����񃊃X�g
		List alT_ISSUE_INST = null;
		
		try
		{
			_log.methodStart();
			//���̓p�����[�^���擾
			gin = inParam;

/**DEGUB**/			_log.message("(SBM0451) ��ƌv��ԍ�=["+gin.m_WORK_ODR_CD+"]");
/**DEGUB**/			_log.message("(SBM0873) ��ƃR�[�h=["+gin.m_WORK_IN_PROC_CD+"]");
/**DEGUB**/			_log.message("(SBM0874) �����=["+gin.m_PARTIAL_PRD_NO+"]");
/**DEGUB**/			_log.message("(SBM0875) ��Ǝ��ђ�����=["+gin.m_OPR_RSLT_CRCT_NO+"]");
/**DEGUB**/			_log.message("(SBM0452) �����ԍ�=["+gin.m_PUCH_ODR_CD+"]");
/**DEGUB**/			_log.message("(SBM0876) �����=["+gin.m_ACPT_NO+"]");
/**DEGUB**/			_log.message("(SBM0877) ���������=["+gin.m_ACPT_RSLT_CRCT_NO+"]");
/**DEGUB**/			_log.message("(SBM0878) �����o�ɏ����敪=["+gin.m_RCV_ISSUE_TYP+"]");
/**DEGUB**/			_log.message("(SBM0879) �o�ɔN����=["+gin.m_RCV_ISSUE_DATE+"]");
/**DEGUB**/			_log.message("(SBM0880) �����Ώێ��ѐ�=["+gin.m_RCV_ISSUE_RSLT_NO+"]");
/**DEGUB**/			_log.message("(SBM0881) �o�Ɋ����t���O=["+gin.m_RCV_ISSUE_CMPLT_FLG+"]");
/**DEGUB**/			_log.message("(SBM0399) �H��R�[�h=["+gin.m_PLANT_CD+"]");

			// �y���̓p�����[�^�`�F�b�N�z
			//�����o�ɏ����敪���Q�F�����o�Ɂ@�łȂ��ꍇ�G���[
			if (gin.m_RCV_ISSUE_TYP != 2){
				_log.message("(SBM0882) �����o�ɏ����敪=["+gin.m_RCV_ISSUE_TYP+"] ���s��(2�ȊO)�Ȃ̂ŁA" +
						"�������I�����܂��B");
				IllegalArgumentException e = new IllegalArgumentException(
                        this.getClass().getName());
				throw e;
			}

			if (gin.m_PUCH_ODR_CD == null || gin.m_PUCH_ODR_CD.equals(""))
			{
				if (inParam.m_OPR_RSLT_CRCT_NO < 0 )
				{
					_log.message("(SBM0883) ��Ǝ��ђ�����=["+inParam.m_OPR_RSLT_CRCT_NO+"] ���s���Ȃ̂ŁA" +
							"�������I�����܂��B");
					IllegalArgumentException e = new IllegalArgumentException(
					                               this.getClass().getName());
					throw e;
				};
			} else {
				if (gin.m_ACPT_RSLT_CRCT_NO < 0 )
				{
					_log.message("(SBM0884) ���������=["+gin.m_ACPT_RSLT_CRCT_NO+"] ���s���Ȃ̂ŁA" +
							"�������I�����܂��B");
					IllegalArgumentException e = new IllegalArgumentException(
                            this.getClass().getName());
					throw e;
				};
			}
			//**************************************************
			//    �O��o�ɍς̎����o�ɕi�ڂ́y�o�Ɏ�������z
			//**************************************************
			if (StringUtil.Validate(inParam.m_PUCH_ODR_CD))
			{
				if (inParam.m_ACPT_RSLT_CRCT_NO > 0)
				{
					//�u�����ԍ��v��NotNull�̏ꍇ�@���@��������񐔁@>�@0
					ret = cancel_AutoIssue("2");
				}
				else{
					ret = true;
				}
			} else {
				if (inParam.m_OPR_RSLT_CRCT_NO >	0 )
				{
					//�u�����ԍ��v��Null�̏ꍇ�@���@��Ǝ��ђ����񐔁@>�@0
					ret = cancel_AutoIssue("1");
				}
				else{
					ret = true;
				}
			}
			if (!ret) {
			    return false;
			}

			//**************************************************
			//    ����̎����o�ɕi�ڂ́y�o�ɏ����z
			//**************************************************

			// 	�������o�ɑΏەi�ڂ̌�����
			if (StringUtil.Validate(inParam.m_PUCH_ODR_CD))
			{
				//�����o�ɏ����Ώەi�ڌ����i�����ԍ��ɂ�錟���j
/**DEGUB**/			_log.message("(SBM0899) �����o�ɂ̔����ԍ�����");
			    alT_ISSUE_INST = getItemList("2");
			} else {
			    //�����o�ɏ����Ώەi�ڌ����i��ƌv��ԍ��ɂ�錟���j
/**DEGUB**/			_log.message("(SBM0900) �����o�ɂ̍�ƌv��ԍ�����");
			  	alT_ISSUE_INST = getItemList("1");
			}
			
			// �����o�ɏ����Ώەi�ڃZ�b�g��񂪂����
			iIssueCount	= alT_ISSUE_INST.size();
/**DEGUB**/		_log.message("(SBM0901) �����o�ɏ����Ώەi�ڌ���=["+iIssueCount+"]");

			for(int cnt=0; cnt < iIssueCount; cnt++)
			{
			    // �o�ɑΏەi�ڏ��̎��o��
				IssueInstStruct stII = (IssueInstStruct)alT_ISSUE_INST.get(cnt);
			    
			    WhAutoIssueProc sProc = new WhAutoIssueProc(_iconn,
			            								_plantCd,
			                                            _updInfo.getUpdateBy(),
			                                            _updInfo.getUpdatePrgNm());
			    ret = sProc.exec(inParam, stII);
			    if (ret) {
//			        _infoList.addAll(sProc.getInfoList());
//			        _warnList.addAll(sProc.getWarnList());
			    } else {
				    _infoList.clear();	
				    _warnList.clear();
				    _errorList.addAll(sProc.getErrorList());
			    }
			}
			if(iIssueCount == 0)  ret = true;

			_log.methodEnd();
		} catch (IllegalArgumentException ie) {
			StackTraceElement e	= (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName =	e.getMethodName();
		    throw new FoundationException(className,methodName,"(SBM0890) �����G���[");
		}
		finally {
		}

		return ret;
	}
	
	//-------------------------------------------------------
	//      ����J���\�b�h
	//-------------------------------------------------------
	/*
	 *   <pre>
	 *   �y	�o�ɍώ����o�ɕi�ڂ̏o�Ɏ�������@�z
	 * 
	 * 	�s�P�D�u�����ԍ��v��Null�̏ꍇ��[�ۊǋ�ʓ��o��]�ɑ΂��錟�������t
	 *	[�ۊǋ�ʓ��o��]."��ƌv��ԍ�"���u��ƌv��ԍ��v
	 *	[�ۊǋ�ʓ��o��]."��ƃR�[�h"���u��ƃR�[�h�v
	 *	[�ۊǋ�ʓ��o��]."�����"���u����񐔁v
	 *	[�ۊǋ�ʓ��o��]."��Ǝ��ђ�����"���u��Ǝ��ђ����񐔁v�|�P
	 *	[�ۊǋ�ʓ��o��]."�݌ɍX�V�敪"��2(�X�V��)
	 *	[�ۊǋ�ʓ��o��]."���o�ɊǗ��ԍ�"�̏���
	 *	[�o�Ɏw��]��1."�o�Ɏw���o�ɋ敪"��3(�����o��)
	 *
	 *	�s�Q�D�u�����ԍ��v��NotNull�̏ꍇ��[�ۊǋ�ʓ��o��]�ɑ΂��錟�������t
	 *	[�ۊǋ�ʓ��o��]."�����ԍ�"���u�����ԍ��v
	 *	[�ۊǋ�ʓ��o��]."�����"���u����񐔁v
	 *	[�ۊǋ�ʓ��o��]."������ђ�����"���u��������񐔁v�|�P
	 *	[�ۊǋ�ʓ��o��]."�݌ɍX�V�敪"��2�i�X�V�ρj
	 *	[�ۊǋ�ʓ��o��]."���o�ɊǗ��ԍ�"�̏���
	 *	[�o�Ɏw��]��1."�o�Ɏw���o�ɋ敪"��3(�����o��)
	 *
	 *  </pre>
	 * @throws SQLException
	 */
	private	boolean cancel_AutoIssue(String iTyp)	
	                       throws SQLException,FoundationException {

	    
	    /**
		 * [�ۊǋ�ʓ��o��]�ɑ΂��錟��������SELECT��̋��ʒ�`
		 */	
		final String SqlStr_SELECT_RCV_ISSUE = 
		    "select "
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
			+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE, "
			+" T_ISSUE_INST.COMPANY_CD as ISSUE_INST_COMPANY_CD, "
			+" T_ISSUE_INST.VEND_CD as ISSUE_INST_VEND_CD, "
			+" T_ISSUE_INST.PLANT_CD as ISSUE_INST_PLANT_CD, "
			+" DECODE(T_OD.MRP_ODR_TYP, 1, T_OD.JOB_ODR_CD, 2, T_OD.JOB_ODR_CD, null) as OD_JOB_ODR_CD, "
			+" DECODE(T_OD.MRP_ODR_TYP, 1, T_OD.JOB_ODR_DETAIL_NO, 2, T_OD.JOB_ODR_DETAIL_NO, 0) as OD_JOB_ODR_DETAIL_NO, "
			+" T_ISSUE_INST.ITEM_CD as ISSUE_INST_ITEM_CD, "
            +" T_ISSUE_INST.CONS_TYP as ISSUE_INST_CONS_TYP, "
            +" T_RCV_ISSUE.LOT_NO as LOT_NO "; // �݌Ƀ��b�g�ԍ�
		final String SqlStr_FROM_RCV_ISSUE = 
		    "from  T_RCV_ISSUE , T_ISSUE_INST, T_OD ";	//[�ۊǋ�ʓ��o��] , [�o�Ɏw��]
		final String SqlStr_ODRBY_RCV_ISSUE = 
			"order by T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";
		
	    PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sCtrlCd = "";	//���o�ɊǗ��ԍ�
		
		boolean ret_issue = false;		//�o�ɏ�������
		
		try
		{
			_log.methodStart();
			
			// << �ۊǋ�ʓ��o�ɂ����� >>
			
			if (iTyp.equals("1")) {
    			if(StringUtil.Validate(gin.m_WORK_IN_PROC_CD)) {
    				sql	= SqlStr_SELECT_RCV_ISSUE
    				+ SqlStr_FROM_RCV_ISSUE
    				+"where "
    				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
						+" and T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
    				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
    				+" and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
    				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
    				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
    				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
    				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
    				+ SqlStr_ODRBY_RCV_ISSUE;

    				ps = _conn.prepareStatement(sql);
    				ps.setString(1,	gin.m_WORK_ODR_CD);			//��ƌv��ԍ�
    				ps.setString(2,	gin.m_WORK_IN_PROC_CD);		//�d�|��ƃR�[�h
    				ps.setInt(3,	gin.m_PARTIAL_PRD_NO);			//�����
    				ps.setInt(4,	gin.m_OPR_RSLT_CRCT_NO	-1);	//��Ǝ��ђ�����

    			} else {
    				sql	= SqlStr_SELECT_RCV_ISSUE
    				+ SqlStr_FROM_RCV_ISSUE
    				+"where "
    				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
						+" and T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
    				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
    				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
    				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
    				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
    				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
    				+ SqlStr_ODRBY_RCV_ISSUE;
    				ps = _conn.prepareStatement(sql);
    				ps.setString(1,	gin.m_WORK_ODR_CD);			//��ƌv��ԍ�
    				ps.setInt(2,	gin.m_PARTIAL_PRD_NO);		//�����
    				ps.setInt(3,	gin.m_OPR_RSLT_CRCT_NO	-1);//��Ǝ��ђ�����
    			}
			} else if (iTyp.equals("2")) {
    			sql	= SqlStr_SELECT_RCV_ISSUE
				+ SqlStr_FROM_RCV_ISSUE
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD"
				+" and T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
				+" and T_RCV_ISSUE.PUCH_ODR_CD = ?"
				+" and T_RCV_ISSUE.ACPT_NO = ?"
				+" and T_RCV_ISSUE.ACPT_RSLT_CRCT_NO = ?"
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2"
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+ SqlStr_ODRBY_RCV_ISSUE;
    			ps = _conn.prepareStatement(sql);
    			ps.setString(1,	gin.m_PUCH_ODR_CD);				//�����ԍ�
    			ps.setInt(2,	gin.m_ACPT_NO);					//�����
    			ps.setInt(3,	gin.m_ACPT_RSLT_CRCT_NO - 1);	//���������
			}
			
/**DEGUB**/		_log.message(sql);
			rs = ps.executeQuery();
			
			IssueProcess wIssueProcess;		// �o�ɏ����̃I�u�W�F�N�g
			String MsgCd = null;
			
			ret_issue = true;
			while (rs.next())
			{
			    MsgCd = "";
			    //�o�Ɏ���̂��߂̕ۊǋ�ʓ��o�Ƀ��R�[�h�o�^
				sCtrlCd	= cancel_RcvIssue(rs);
				//�o�ɏ������Ăяo��
				_log.message("(SBM0903) �o�ɏ������Ăяo���܂��i�O��o�ɂ̎���j");
				wIssueProcess = new IssueProcess(_iconn, sCtrlCd);
				ret_issue = wIssueProcess.execProcess();
			    if (ret_issue) {
			        //�C���t�H���[�V�������b�Z�[�W��ۑ�
			        for (Iterator itr=wIssueProcess.getInfoList().iterator(); itr.hasNext(); ) {
			            MsgCd = (String)itr.next();
			            setInfoList(MsgCd, strDtl + rs.getString("ISSUE_INST_CD"));
			        }
			        //���[�j���O���b�Z�[�W�͕ۑ����Ȃ��i���݁AIssueProxess����ԋp����Ă��Ȃ����߁j
			    } else {
			        _infoList.clear();	
			        _warnList.clear();
			        //�G���[���b�Z�[�W��ۑ�
			        for (Iterator itr=wIssueProcess.getErrorList().iterator(); itr.hasNext(); ) {
			            MsgCd = (String)itr.next();
			            setErrorList(MsgCd, strDtl + rs.getString("ISSUE_INST_CD"));
			        }
			        break;
			    }
				// [�o�Ɏw��]."�x���敪"=1�F�L���x���̏ꍇ�A[�L���x������]�ɒǉ�����
				if (rs.getInt("ISSUE_INST_CONS_TYP") == 1) {
					// [�L���x������ǉ�]
					insertPastOnerousCons(_iconn, rs, sCtrlCd);
				}
			}
			
			_log.methodEnd();
		}
		finally {
			if (rs != null)		{ rs.close();}
			if (ps != null)		{ ps.close();}
		}
		
		return ret_issue;
	}

	/**
	 * 
	 * �O��̏o�Ɏ���̂��߂�[�ۊǋ�ʓ��o��]��ǉ����܂��B
	 * �i�ԃ��R�[�h�ǉ������j
	 * @param rs  �o�^���(ResultSet)
	 * @return�@String �o�^�������R�[�h�̓��o�ɊǗ��ԍ�
	 * @throws SQLException
	 * @throws Exception
	 *
	 */
	private	String cancel_RcvIssue(ResultSet rs	)
			throws SQLException,FoundationException {
		String strOdrCd="";

		try
		{
			_log.methodStart();
	
			//�o�^�f�[�^�̐ݒ�
			RcvIssueStruct sData = new RcvIssueStruct();
			
			sData.m_RCV_ISSUE_TYP = 2;											//	���o�ɋ敪
			sData.m_ITEM_CD = rs.getString("ITEM_CD");							//	�i�ڔԍ�
			sData.m_PLANT_CD = rs.getString("PLANT_CD");						//	�H��R�[�h
			sData.m_WH_CD = rs.getString("WH_CD");								//	�ۊǋ�R�[�h
			sData.m_JOB_ODR_CD = rs.getString("JOB_ODR_CD");					//	����
			sData.m_JOB_ODR_DETAIL_NO = rs.getInt("JOB_ODR_DETAIL_NO");			//	���Ԏ}��
			sData.m_PUCH_ODR_CD = rs.getString("PUCH_ODR_CD");					//	�����ԍ�
			sData.m_ACPT_NO = rs.getInt("ACPT_NO");								//	�����
			sData.m_ACPT_RSLT_CRCT_NO = rs.getInt("ACPT_RSLT_CRCT_NO");			//	������ђ�����
			sData.m_INSPEC_RSLT_CRCT_NO = rs.getInt("INSPEC_RSLT_CRCT_NO");		//	�������ђ�����
			sData.m_WORK_ODR_CD = rs.getString("WORK_ODR_CD");					//	��ƌv��ԍ�
			sData.m_WORK_IN_PROC_CD = rs.getString("WORK_IN_PROC_CD");			//	�d�|��ƃR�[�h
			sData.m_PARTIAL_PRD_NO = rs.getInt("PARTIAL_PRD_NO");				//	�����
			sData.m_OPR_RSLT_CRCT_NO = rs.getInt("OPR_RSLT_CRCT_NO");			//	��Ǝ��ђ�����
			sData.m_ISSUE_INST_CD = rs.getString("ISSUE_INST_CD");				//	�o�Ɏw���ԍ�
			sData.m_RCV_ISSUE_QTY = 
					rs.getBigDecimal("RCV_ISSUE_QTY").multiply(new BigDecimal(-1));	//	���o�ɐ�
			sData.m_RCV_ISSUE_AMOUNT = rs.getBigDecimal("RCV_ISSUE_AMOUNT");	//	���o�ɋ��z
			sData.m_RCV_ISSUE_DATE = rs.getDate("RCV_ISSUE_DATE");				//	���o�ɔN����
			sData.m_RCV_ISSUE_GNR_TYP = 29;										//	���o�ɔ����敪
			sData.m_RCV_ISSUE_ODD_QTY = rs.getBigDecimal("RCV_ISSUE_ODD_QTY");	//	���o�ɒ[��
			sData.m_DEFECT_CAUSE_CD = rs.getString("DEFECT_CAUSE_CD");			//	���o�ɕs�Ǘ��R�R�[�h
			sData.m_STOCK_UPD_TYP = 1;											//	�݌ɍX�V�敪
			sData.m_RCV_ISSUE_CMPLT_FLG = rs.getInt("RCV_ISSUE_CMPLT_FLG");		//	���o�Ɋ����t���O
			sData.m_OD_NO = rs.getString("OD_NO");								//	�I�[�_�f�}���h�ԍ�
			sData.m_VEND_LOT_NO = rs.getString("VEND_LOT_NO");					//	���[�J���b�g�ԍ�
			sData.m_RCV_ISSUE_COMMENT = rs.getString("RCV_ISSUE_COMMENT");		//	���o�ɔ��l
			sData.m_COMPANY_CD = rs.getString("COMPANY_CD");					//	��ЃR�[�h
			sData.m_VEND_CD = rs.getString("VEND_CD");							//	�����R�[�h
			sData.m_CONS_TYP = rs.getInt("CONS_TYP");							//	�x���敪
			sData.m_CONS_EXEC_DATE = rs.getDate("CONS_EXEC_DATE");				//	�L���x�����ђ��o��
            sData.m_LOT_NO = rs.getString("LOT_NO"); // �݌Ƀ��b�g�ԍ�
			//<< �ۊǋ�ʓ��o�ɂ̓o�^ >>
			RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn,_updInfo);
			strOdrCd = sRcvIssueEntity.insert(sData);

			_log.methodEnd();
		}
		finally {
		}
		return strOdrCd;
	};

	/**
	 * 
	 *   [�L���x������]�t�@�C���ւ̃��R�[�h�ǉ�
	 * @param conn �R�l�N�V�������
	 * @param rs �ۊǋ�ʓ��o�Ƀf�[�^ 
	 * @param sCtrlCd ���o�ɊǗ��ԍ�
	 * @throws SQLException
	 * @throws Exception
	 *
	 */
	private	void insertPastOnerousCons(IDbConnection conn, ResultSet rs, String sCtrlCd) 
			throws SQLException, FoundationException {
		PreparedStatement ps=null;
		String sql="";
		int	iIndex =0;
		int	iRC	= 0;
		String strOdrCd="";
		boolean ret;
		
		java.util.Date dtDate = null;
		try
		{
			_log.methodStart();
			//[�x���P��]������
			ConsUnitCost sCost = new ConsUnitCost(_iconn);
			ret = false;
			ret = sCost.read(rs.getString("ISSUE_INST_COMPANY_CD"), rs.getString("ISSUE_INST_VEND_CD"),
			                 rs.getString("ISSUE_INST_PLANT_CD"), rs.getString("ISSUE_INST_ITEM_CD"),
			                 gin.m_RCV_ISSUE_DATE);
			                 
			_log.message("(SBM0905) �L���x���ԍ��̍̔�");
			//�L���x���ԍ��̍̔�
			Numbering ODR_CD = new Numbering(_iconn,Numbering.ONERCONS_CD,
				                             _updInfo.getUpdateBy(),
				                             _updInfo.getUpdatePrgNm(),
				                             _plantCd);
			strOdrCd = ODR_CD.getNo();
			//Insert
			sql	= " INSERT INTO  T_PAST_ONEROUS_CONS ( "
				+" ONEROUS_CONS_NO	,"				//�L���x���ԍ�
				+" COMPANY_CD ,"					//��ЃR�[�h
				+" VEND_CD ,"						//�����R�[�h
				+" PLANT_CD ,"						//�H��R�[�h
				+" JOB_ODR_CD ,"					//����
				+" JOB_ODR_DETAIL_NO ,"				//���Ԏ}��
				+" ITEM_CD ,"						//�i�ڔԍ�
				+" ISSUE_DATE ,"					//�o�ɓ�
				+" ISSUE_QTY ,"						//�o�ɐ�
				+" UNIT_COST ,"						//�P��
				+" UNIT_COST_TYP ,"					//�P���敪
				+" ONEROUS_CONS_COMMENT ,"			//�L���x�����l
				+" VEND_LOT_NO ,"					//���[�J���b�g�ԍ�
				+" RCV_ISSUE_CTRL_CD ,"				//���o�ɊǗ��ԍ�
				+" WORK_ODR_CD ,"					//��ƌv��ԍ�
				+" WORK_IN_PROC_CD ,"				//�d�|��ƃR�[�h
				+" PUCH_ODR_CD ,"					//�����ԍ�
				+" ISSUE_INST_CD ,"					//�o�Ɏw���ԍ�
				+" RETURNED_WH_CD ,"					//�ԕi��ۊǋ�R�[�h
				+" RETURNED_CAUSE_CD ,"					//�ԕi���R�R�[�h
				+" RETURNED_GNR_TYP ,"					//�ԕi���������敪
				+" AP_PROC_TYP ,"					//���|�����敪
				+" CREATED_BY ,"					//�쐬��
				+" CREATED_PRG_NM ,"				//�쐬�v���O������
				+" UPDATED_BY ,"					//�X�V��
				+" UPDATED_PRG_NM ,"				//�X�V�v���O������
				+" MODIFY_COUNT , "					//�X�V��
				+" LOT_NO )"
				+" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
				+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
			iIndex = 1;
			ps = _conn.prepareStatement(sql);
			ps.setString(iIndex++, strOdrCd);						//�L���x���ԍ�
			ps.setString(iIndex++, rs.getString("ISSUE_INST_COMPANY_CD"));				//��ЃR�[�h
			ps.setString(iIndex++, rs.getString("ISSUE_INST_VEND_CD"));				//�����R�[�h
			ps.setString(iIndex++, rs.getString("ISSUE_INST_PLANT_CD"));				//�H��R�[�h
			setNvl(iIndex++, rs.getString("OD_JOB_ODR_CD"), ps);				//����
			ps.setInt(iIndex++, rs.getInt("OD_JOB_ODR_DETAIL_NO"));		//���Ԏ}��
			ps.setString(iIndex++, rs.getString("ISSUE_INST_ITEM_CD"));		//�i�ڔԍ�

			dtDate = Converter.strToDate(gin.m_INSPC_ACPT_DATE,Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//���o�ɔN����
			ps.setBigDecimal(iIndex++, rs.getBigDecimal("RCV_ISSUE_QTY"));//�o�ɐ�
			if (ret) {	//�x���P�����R�[�h�����݂����ꍇ
				//�P��
				if (sCost.getOnerousFlg() == 1) {
					ps.setBigDecimal(iIndex++, sCost.getUnitCost());
				} else if (sCost.getOnerousFlg() == 0) {
					ps.setDouble(iIndex++, 0);
				}
				//�P���敪
			    ps.setInt(iIndex++, sCost.getUnitCostTyp());
			} else {	//�x���P�����R�[�h�����݂��Ȃ������ꍇ				
				ps.setDouble(iIndex++, 0);		//�P��
			    ps.setInt(iIndex++, 0);			//�P���敪		    
			}
			ps.setNull(iIndex++, Types.VARCHAR);					//�L���x�����l
			setNvl(iIndex++, rs.getString("VEND_LOT_NO"), ps);				//���[�J���b�g�ԍ�
			ps.setString(iIndex++, sCtrlCd);		//���o�ɊǗ��ԍ�
			ps.setString(iIndex++, rs.getString("WORK_ODR_CD"));					//��ƌv��ԍ�
			ps.setString(iIndex++, rs.getString("WORK_IN_PROC_CD"));					//�d�|��ƃR�[�h
			ps.setString(iIndex++, rs.getString("PUCH_ODR_CD"));			//�����ԍ�
			ps.setString(iIndex++, rs.getString("ISSUE_INST_CD"));			//�o�Ɏw���ԍ�
			ps.setString(iIndex++, rs.getString("WH_CD"));				//�ԕi��ۊǋ�R�[�h
			ps.setNull(iIndex++, Types.VARCHAR);				//�ԕi���R�R�[�h
			ps.setInt(iIndex++, 3);			//�ԕi���������敪
			ps.setInt(iIndex++, 0);			//���|�����敪
			//-----------------------------------------------------------------------
			ps.setString(iIndex++, _updInfo.getUpdateBy());			//�쐬��
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm());		//�쐬�v���O������
			ps.setString(iIndex++, _updInfo.getUpdateBy());			//�X�V��
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm());		//�X�V�v���O������
			ps.setDouble(iIndex++, 0);								//�X�V��
            ps.setString(iIndex++, rs.getString("LOT_NO")); // �݌Ƀ��b�g�ԍ�
			iRC	= ps.executeUpdate();
			
			_log.methodEnd();
		} catch(ParseException pe) {
			StackTraceElement e	= (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName =	e.getMethodName();
			throw new FoundationException(className,methodName,"ParseException");
		} finally {
			if (ps != null){
				try{
					ps.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				ps = null;
			}
		}
		return ;
	}

	/**
	 * <pre>
	 * �y�����o�ɑΏەi�ڂ̌����z	
	 * �����o�ɏ����Ώەi�ڃZ�b�g��񐶐��i�����o�ɐ��̎Z�o�j
	 * </pre>
�@�@ * 
     */
	private	List getItemList(String sTyp)
		throws SQLException {
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sql_select = "SELECT " +
				" A.ISSUE_INST_CD," +
				" A.PLANT_CD," +
				" A.OD_NO," +
				" A.ITEM_CD," +
				" A.PS_EDITION," +
				" A.PUCH_ODR_CD," +
				" A.COMPANY_CD, " +
				" A.VEND_CD," +
				" A.CONS_TYP," +
				" A.WORK_ODR_CD," +
				" A.WORK_IN_PROC_CD," +
				" A.WS_CD," +
				" A.WH_CD," +
				" A.ISSUE_INST_UNIT_QTY," +
				" A.ISSUE_INST_UNIT_DENOMINATOR," +
				" A.ISSUE_INST_UNIT_NUMERATOR," +
				" A.ISSUE_INST_QTY," +
				" A.TOTAL_ISSUE_QTY," +
				" A.SCDL_ISSUE_DATE," +
				" A.ISSUE_CMPLT_DATE," +
				" A.ISSUE_TYP," +
				" A.ISSUE_CMPLT_FLG," +
				" A.ISSUE_INST_ISS_FLG," +
				" A.ISSUE_INST_ISS_DATE," +
				" A.ISSUE_INST_COMMENT," +
				" B.UNIT_QTY_TYP," +
				" C.MRP_ODR_TYP "; 	

		String sql_from = " FROM T_ISSUE_INST A, M_ITEM B, T_OD C ";
		String sql_where = " WHERE A.ITEM_CD = B.ITEM_CD  AND A.OD_NO = C.OD_NO ";

		IssueInstStruct stIssueInst;
		
		List alT_ISSUE_INST = new ArrayList();
		
		int	iCount = 0;
		int	iIndex = 0;
		int	wUnitQtyTyp = 0;
		BigDecimal bdIssueNO0=null;
		BigDecimal bdIssueNO1=null;
		BigDecimal bdIssueNO2=null;
		BigDecimal bdIssueNO3=null;
		try
		{
			_log.methodStart();

			if (!sTyp.equals("1") && !sTyp.equals("2")) {
				return alT_ISSUE_INST;
			}

			if (sTyp.equals("1")) {		//--- ��ƌv��ԍ��ɂ�錟�� ---
				//�s�u�����ԍ��v��Null�̂Ƃ��t
				//"��ƌv��ԍ�"���u��ƌv��ԍ��v
				//"��ƃR�[�h"���u��ƃR�[�h�v
				//"�o�ɋ敪"��3(�����o��)
				//"�o�Ɏw���ԍ�"�̏���
			    if(StringUtil.Validate(gin.m_WORK_IN_PROC_CD))
			    {
			        sql	= sql_select + sql_from +
			        sql_where +
			        " AND (A.WORK_ODR_CD=? AND A.WORK_IN_PROC_CD=?" +
			        " AND A.ISSUE_TYP=3) " +
			        " ORDER BY A.ISSUE_INST_CD ";
			        ps = _conn.prepareStatement(sql);
			        ps.setString(1,	gin.m_WORK_ODR_CD);
			        ps.setString(2,	gin.m_WORK_IN_PROC_CD);
			    } else {
			        sql	= sql_select + sql_from +
			        sql_where +
			        " AND (A.WORK_ODR_CD=? AND A.ISSUE_TYP=3) " +
			        " ORDER BY A.ISSUE_INST_CD ";
			        ps = _conn.prepareStatement(sql);
			        ps.setString(1,	gin.m_WORK_ODR_CD);
			    }
			} else if (sTyp.equals("2")) {	//--- �����ԍ��ɂ�錟��
				//�s�u�����ԍ��v��Not Null�̂Ƃ��t
				//"�����ԍ�"���u�����ԍ��v
				//"�o�ɋ敪"��3(�����o��)
				//"�o�Ɏw���ԍ�"�̏���
				sql	= sql_select + sql_from +
				      sql_where + 
				      " AND (A.PUCH_ODR_CD=? AND A.ISSUE_TYP=3) " +
				      " ORDER BY A.ISSUE_INST_CD " ;
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	gin.m_PUCH_ODR_CD);
			}
/**DEGUB**/			_log.message("(SBM0906) �����o�ɏ����Ώەi�ڌ���(��ƌv��ԍ�����or�����ԍ�����)sTyp=["+sTyp+"]");
/**DEGUB**/			_log.message("������=["+sql+"]");

			rs = ps.executeQuery();

			while (rs.next())
			{							
				
				//�i�ڂ��Ƃ̎����o�ɐ����Z�o
				bdIssueNO1 = new BigDecimal(gin.m_RCV_ISSUE_RSLT_NO);	//�����Ώێ��ѐ�
				bdIssueNO2 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_NUMERATOR"));//���q
				bdIssueNO3 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_DENOMINATOR"));//����
				wUnitQtyTyp = rs.getInt("UNIT_QTY_TYP");		//�݌ɐ��P�ʋ敪;

				//�o�Ɏw���� =   �����Ώێ��ѐ� * �o�ɒP�ʐ����q / �o�ɒP�ʐ�����
				bdIssueNO0 = ((bdIssueNO1.multiply
								(bdIssueNO2)).divide
								(bdIssueNO3, 10, BigDecimal.ROUND_UP));

				if (wUnitQtyTyp == 1) {				// �����Ǘ�
					//�����؏グ
					bdIssueNO0 = bdIssueNO0.setScale(0,	BigDecimal.ROUND_UP);

				} else if (wUnitQtyTyp == 2) {		// �����Ǘ�
					//������T�ʐ؏グ�؏グ
					bdIssueNO0 = bdIssueNO0.setScale(4,	BigDecimal.ROUND_UP);
					
/**DEGUB**/		_log.message("(SBM0907) �����Ǘ�=["+bdIssueNO1.toString()+"]");
				}

				//�o�ɑΏەi�ڏ���ޔ�
				stIssueInst = new IssueInstStruct();
				
				stIssueInst.m_AUTO_ISSUE_QTY = bdIssueNO0;		//�����Ώێ��ѐ������ɎZ�o���������o�ɐ�
				stIssueInst.m_ISSUE_INST_CD =	Nvl(rs.getString("ISSUE_INST_CD"));	//�o�Ɏw���ԍ�
				stIssueInst.m_PLANT_CD =		Nvl(rs.getString("PLANT_CD"));		//�H��R�[�h			
				stIssueInst.m_OD_NO =			Nvl(rs.getString("OD_NO"));			//�I�[�_�f�}���h�ԍ�
				stIssueInst.m_ITEM_CD =			Nvl(rs.getString("ITEM_CD"));		//�i�ڃR�[�h	
				stIssueInst.m_PUCH_ODR_CD =		Nvl(rs.getString("PUCH_ODR_CD"));	//�����ԍ�		
				stIssueInst.m_COMPANY_CD =		Nvl(rs.getString("COMPANY_CD"));	//��ЃR�[�h		
				stIssueInst.m_VEND_CD =			Nvl(rs.getString("VEND_CD"));		//�����R�[�h	
				stIssueInst.m_WORK_ODR_CD =		Nvl(rs.getString("WORK_ODR_CD"));	//��ƌv��ԍ�		
				stIssueInst.m_WORK_IN_PROC_CD =	Nvl(rs.getString("WORK_IN_PROC_CD"));//�d�|��ƃR�[�h			
				stIssueInst.m_WS_CD =		 	Nvl(rs.getString("WS_CD"));			//��Ƌ�R�[�h
				stIssueInst.m_WH_CD =		 	Nvl(rs.getString("WH_CD"));			//�H���ۊǏꏊ�R�[�h			
				stIssueInst.m_CONS_TYP =		rs.getInt("CONS_TYP");				//�x���敪
				stIssueInst.m_MRP_ODR_TYP = 	rs.getInt("MRP_ODR_TYP");			//�i�ڎ�z�敪
				stIssueInst.m_UNIT_QTY_TYP = 	rs.getInt("UNIT_QTY_TYP");			//�݌ɐ��P�ʋ敪
				
				alT_ISSUE_INST.add(stIssueInst);
			};
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (rs != null)	{ rs.close(); }
			if (ps != null)	{ ps.close(); }
		}
		return alT_ISSUE_INST;
	};

	//************************************************************************************
	//      ���b�Z�[�W�����p���\�b�h
	//************************************************************************************
	/** ��񃁃b�Z�[�W�i�[���X�g */
	private ArrayList _infoList = new ArrayList();
	/** �x�����b�Z�[�W�i�[���X�g */
	private ArrayList _warnList = new ArrayList();
	/** �G���[���b�Z�[�W�i�[���X�g */
	private ArrayList _errorList = new ArrayList();

	/**
	 * �C���t�H���[�V�������b�Z�[�W�ݒ�
	 * @param iMsgCd�@���b�Z�[�W�R�[�h
	 * @param iMsgDetail�@���b�Z�[�W�ڍׁi�o�Ɏw���ԍ��j
	 */
	private void setInfoList(String iMsgCd, String iMsgDetail)
	{
	    String[] w_msg =  new String[2];
	    
	    w_msg[0] = iMsgCd;
	    w_msg[1] = iMsgDetail;
	    _infoList.add(w_msg);
		return;
	}
	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param iMsgCd�@���b�Z�[�W�R�[�h
	 * @param iMsgDetail�@���b�Z�[�W�ڍׁi�o�Ɏw���ԍ��j
	 */
	private void setErrorList(String iMsgCd,String iMsgDetail)
	{
	    String[] w_msg =  new String[2];

	    _infoList.clear();	
	    _warnList.clear();
	    w_msg[0] = iMsgCd;
	    w_msg[1] = iMsgDetail;
	    _errorList.add(w_msg);
		return;
	}
	
	/**
	 * �G���[���b�Z�[�W���擾���܂��B 
	 * @return �G���[���X�g(���b�Z�[�W�R�[�h(String) �̃��X�g�j
	 * 	<pre> ���b�Z�[�W�R�[�h���X�g�`��:
	 *                     String[]��List 
	 *                     String[0]--> ���b�Z�[�W�R�[�h
	 *                     String[1]--> ���b�Z�[�W�ڍׁi�o�Ɏw���ԍ��j
     *  </pre>
	 * 
	 */
	public ArrayList getErrorList()
	{
		return _errorList;
	}

	/**
	 * �C���t�H���[�V�������b�Z�[�W���擾���܂��B 
	 * @return info���X�g
	 * 	<pre> ���b�Z�[�W�R�[�h���X�g�`��:
	 *                     String[]��List 
	 *                     String[0]--> ���b�Z�[�W�R�[�h
	 *                     String[1]--> ���b�Z�[�W�ڍׁi�o�Ɏw���ԍ��j
     *  </pre>
	 */
	public ArrayList getInfoList()
	{
		return _infoList;
	}

	/**
	 * �x�����b�Z�[�W���擾���܂��B 
	 * @return warn���X�g
	 * 	<pre> ���b�Z�[�W�R�[�h���X�g�`��:
	 *                     String[]��List 
	 *                     String[0]--> ���b�Z�[�W�R�[�h
	 *                     String[1]--> ���b�Z�[�W�ڍׁi�i�ڔԍ��j
     *  </pre>
	 */
	public ArrayList getWarnList()
	{
		return _warnList;
	}
	
	/**
	 * �P�D�w�肳�ꂽ������NULL�̏ꍇ�A�����O�̕������ԋp���܂��B
	 * �Q�D�w�肳�ꂽ������NUll�łȂ��ꍇ�́A�w�肳�ꂽ�������
	 *     ���̂܂ܕԋp���܂��B
	 */
	private String Nvl(String iStr) {
		String ret_str;
		if (iStr == null) {
			ret_str = "";
		}else{
			ret_str = iStr;
		}
		return ret_str;
		
	}
	/**
	 * �P�D�w�肳�ꂽ���t�^��NULL�̏ꍇ�A�����O�̕������ԋp���܂��B
	 * �Q�D�w�肳�ꂽ���t�^��NUll�łȂ��ꍇ�́A
	 *     �w�肳�ꂽ������(���t)��/�t���ɕϊ����ĕԋp���܂��B
	 */
	private String Nvl(Date iDate) {
		String ret_str;

		if (iDate == null) {
			ret_str = "";
		}else{
			ret_str = Converter.dateToStr(iDate,Converter.SLASH_DATE);
		}
		return ret_str;
	}
	//***************************************************************
	
	/**
	 * PrearedStatment�ɁA�w�肳�ꂽ�l��ݒ肵�܂��B
	 * @param idx    ���ڈʒu���
	 * @param iStr   �ݒ蕶����   
	 * @param iPs    PreparedStatement
	 * @throws SQLException
	 *
	 */
	private void setNvl(int idx, String iStr, PreparedStatement iPs) 
	                throws SQLException {
		
		if (iStr == null) {
			iPs.setNull(idx,Types.VARCHAR);
		} else {
			iPs.setString(idx,iStr);
		}
	}
	private void setNvl(int idx, Date iDate, PreparedStatement iPs) 
					throws SQLException {
		
		if (iDate == null) {
			iPs.setNull(idx,Types.DATE);
		} else {
			iPs.setDate(idx,new java.sql.Date(iDate.getTime()));
		}
	}

	// -------------------------------------------------------------------------------------------
	//	 Common	Sub	Class
	// -------------------------------------------------------------------------------------------

	/**
	 * ���O�o��(�C���i�[�N���X)
	 */
	class Log {
		private	int	indent = 0;
		private	SystemLog _syslog =	new	SystemLog();   // �������O�o�̓N���X

		// �R���X�g���N�^
		public Log(String className,IDbConnection	conn){
			// ����	������
//			_syslog.init(className);
			_syslog.init("AUTO_ISSUE");
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
			StackTraceElement e	= (new Throwable()).getStackTrace()[2];

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
			_syslog.fine_d(	out, _updInfo.getUpdateBy() );

			// ���O�o��(System.out��)
//			System.out.println(out);
		}
	}
}
