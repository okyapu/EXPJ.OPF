/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/LumpIssue.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;


/**
 * <pre>
 * �ꊇ�o�ɂ̋��ʏ������s���܂��B
 * ���̃N���X�́A�ȉ��̋Ɩ���������Ăяo����܂��B
 * �@�P�D�L�b�g�o��(�ꊇ�X�V)
 * �@�Q�D�}�j���A���o�Ɂi�ꊇ�X�V���j
 *
 * ���̃N���X��������́ASQLException����������\��������܂��B
 * </pre>
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2013/06/27 02:36:07 $
 */

public class LumpIssue implements RcvIssueConst {

	private	IDbConnection _iconn;			// �g�����U�N�V�����R�l�N�V�������
	private	Connection _conn;				// �R�l�N�V�������
	private	String _plantCd;				// �H��R�[�h
	private	UpdateInfo _updInfo;			// ���p�ҊǗ����(�C���i�[�N���X)
	private	Log	_log;						// ���O���(�C���i�[�N���X)
	private	IssueProcess _IssueProcess;		// �o�ɏ����̃I�u�W�F�N�g

	private	int		ginRCV_ISSUE_TYP;		//	�����o�ɏ����敪
	private	String	ginRCV_ISSUE_DATE;		//	�o�ɔN����
	private	int		ginRCV_ISSUE_CMPLT_FLG;	//	�o�Ɋ����t���O
	private	String	ginVEND_LOT_NO;			//	���[�J���b�g�ԍ�

	//���Ɍ��ʏo�͗p������i�o�Ɏw���ԍ��j
	static final  String strDtl = "T_ISSUE_INST.ISSUE_INST_CD:";

	private final static BigDecimal bdZero = new BigDecimal("0");
	/**
	 * <pre>
	 * �R���X�g���N�^
	 * new����Ƃ��ɂ͉��L�̃p�����[�^��ݒ肷��B
	 * �H��R�[�h,���[�UID,�Ɩ����͕ʓrsetter�Őݒ肵�������Ƃ��\�B
	 * </pre>
	 *
	 * @param conn �R�l�N�V�������
	 * @param plantCd �H��R�[�h
	 * @param userId ���[�UID
	 * @param businessName �Ɩ���
	 */
	public LumpIssue(IDbConnection conn, String plantCd, String userId, String businessName) {

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
	 * �ꊇ�o�ɏ����E���C������
	 *
	 * @param inRcvIssueTyp	   �����o�ɏ����敪
	 * @param inRcvIssueDate  �o�ɔN����(YYYY/MM/DD�`���j
	 * @param inCmpltFlg      �o�Ɋ����t���O
	 * @param inVendLotNo     ���[�J���b�g�ԍ�(�L�b�g�ꊇ�o�Ɏ��Ɏg�p�B��ʓ��͒l)
	 * @param iIssueInstList  �o�Ɏw����񃊃X�g(IssueInstStruct�N���X�̃��X�g�j
	 * 
	 * @return true:����I��(�x�����b�Z�[�W�܂ޏꍇ����j�@false:�G���[����
	 *  <pre>
	 *          ���b�Z�[�W�R�[�h���X�g�`��:  String[]��List 
	 *                                       String[0]--> ���b�Z�[�W�R�[�h
	 *                                       String[1]--> ���b�Z�[�W�ڍׁi�i�ڃR�[�h�j
	 *  </pre>
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public boolean LumpIssueOpr(int	inRcvIssueTyp,
	                          String	inRcvIssueDate,
	                          int		inCmpltFlg,
	                          String    inVendLotNo,
	                          List		iIssueInstList
			  )		
			throws SQLException, FoundationException {

		int	iIssueCount	= 0;
		boolean ret = false;	//�����o�ɏ�������
		String StrOdrCd = "";	//���ɏ������ʁi�ۊǋ�ʓ��o�ɊǗ��ԍ��j
		
		//���̓p�����[�^���擾
		ginRCV_ISSUE_TYP		= inRcvIssueTyp;		//�����o�ɏ����敪
		ginRCV_ISSUE_DATE		= inRcvIssueDate;		//�o�ɔN����
		ginRCV_ISSUE_CMPLT_FLG	= inCmpltFlg;			//�o�Ɋ����t���O
		ginVEND_LOT_NO          = inVendLotNo;			//���[�J���b�g�ԍ�
		try
		{
			_log.methodStart();
			//���̓p�����[�^���擾(�^�ϊ����s���j
			//DEBUG

//DEBUG			_log.message("�����o�ɏ����敪=["+inRcvIssueTyp+"]");
//DEBUG			_log.message("�o�ɔN����=["+inRcvIssueTyp+"]");
//DEBUG			_log.message("�o�Ɋ����t���O=["+inRcvIssueTyp+"]");

			//2.10.3 ���̓p�����[�^�`�F�b�N
			//�����o�ɏ����敪���u1�F�L�b�g�o�ɁA 4:�}�j���A���o�Ɂv�ȊO�̏ꍇ�G���[
			if (ginRCV_ISSUE_TYP != 1 && ginRCV_ISSUE_TYP != 4){
				_log.message("(SBM0908) �����o�ɏ����敪=["+ginRCV_ISSUE_TYP+"] ���s��(1,4�ȊO)�Ȃ̂ŁA" +
						"�������I�����܂��B");
				IllegalArgumentException e = new IllegalArgumentException(
                        this.getClass().getName());
				throw e;
			}

			//�����o�ɋN���p�����[�^�̐ݒ�
			WhAutoIssueProc wAi = new WhAutoIssueProc(_iconn,
                                                      _plantCd,
                                                      _updInfo.getUpdateBy(),
                                                      _updInfo.getUpdatePrgNm());			
			WhAutoIssueProc.AutoIssueParam inParam = wAi.new AutoIssueParam();

			inParam.m_RCV_ISSUE_TYP = inRcvIssueTyp;		//�����o�ɏ����敪
			inParam.m_RCV_ISSUE_DATE = inRcvIssueDate;		//�o�ɔN����
			inParam.m_RCV_ISSUE_CMPLT_FLG = inCmpltFlg;		//�o�Ɋ����t���O
			inParam.m_VEND_LOT_NO = inVendLotNo;			//���[�J���b�g�ԍ�
			inParam.m_PLANT_CD = _plantCd;					//�H��R�[�h
			
			//**************************************************
			//    �����w�肳�ꂽ�ꊇ�o�ɕi�ڂ́y�o��&���ɏ����z
			//**************************************************
			
			// �����o�ɏ����Ώەi�ڃZ�b�g��񂪂����
			iIssueCount	= iIssueInstList.size();
			//DEBUG
//			_log.message("�����o�ɏ����Ώەi�ڌ���=["+iIssueCount+"]");
			for(int cnt=0; cnt < iIssueCount; cnt++)
			{
			    
			    // �o�ɑΏەi�ڏ��̎��o��
				IssueInstStruct stII = (IssueInstStruct)iIssueInstList.get(cnt);

				//***********************
				//    �y�o�ɏ����z
				//***********************
				//--- <�����o�ɏ���> ------
				WhAutoIssueProc sProc = new WhAutoIssueProc(_iconn,
			            								_plantCd,
			                                            _updInfo.getUpdateBy(),
			                                            _updInfo.getUpdatePrgNm());
			    ret = sProc.exec(inParam, stII);
			    if (ret) {
			        _infoList.addAll(sProc.getInfoList());
			        _warnList.addAll(sProc.getWarnList());
			    } else {
				    _infoList.clear();	
				    _warnList.clear();
				    _errorList.addAll(sProc.getErrorList());
				    break;
			    }
			    
				//*************************
				//    �y���ɏ����z
				//*************************
					if (stII.m_WH_CD != null && "".equals(stII.m_WH_CD) == false) {
						ret = rcvProc(stII);
					} else {
						ret = true;
					}
			    if (!ret) {
			        break;
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
	/**
	 * 
	 * �H���ۊǏꏊ�ւ̓��ɂ̂��߂�[�ۊǋ�ʓ��o��]��ǉ����܂��B
	 * @param IssueInstStruct  �o�^���(�o�Ɏw�����)
	 * @return�@String �o�^�������R�[�h�̓��o�ɊǗ��ԍ�
	 * @throws SQLException
	 * @throws Exception
	 *
	 */
	private	boolean rcvProc(IssueInstStruct iIssueInstStruct)
			throws SQLException,FoundationException {
		String strOdrCd="";
		int	iCnt = 0;

		RcvProcess wRcvProc;		//���ɏ����N���X
		boolean ret;				//���ɏ�������
		String MsgCd = null;
		
		try
		{
			_log.methodStart();

			//�o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;
			
			//�o�^�f�[�^�ݒ�   -------------------------------
			RcvIssueStruct sData = new RcvIssueStruct();
			
			sData.m_RCV_ISSUE_TYP = 1;							//	���o�ɋ敪
			sData.m_ITEM_CD = stII.m_ITEM_CD;					//	�i�ڔԍ�
			sData.m_PLANT_CD = stII.m_PLANT_CD;					//	�H��R�[�h
			sData.m_WH_CD = stII.m_WH_CD;						//	�H���ۊǏꏊ�R�[�h
			//�e�i�ڂ����ԕi�̏ꍇ�̂݁A���ԏ����Z�b�g
			if ((stII.m_MRP_ODR_TYP == 1) || (stII.m_MRP_ODR_TYP == 2)) { 
			    sData.m_JOB_ODR_CD = stII.m_JOB_ODR_CD;					//	����
			    sData.m_JOB_ODR_DETAIL_NO = stII.m_JOB_ODR_DETAIL_NO;	//	���Ԏ}��
			} else {
			    sData.m_JOB_ODR_CD = null;					//	����
			    sData.m_JOB_ODR_DETAIL_NO = 0;				//	���Ԏ}��
			}
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD;			//	�����ԍ�
			sData.m_ACPT_NO = 0;								//	�����
			sData.m_ACPT_RSLT_CRCT_NO = 0;						//	������ђ�����
			sData.m_INSPEC_RSLT_CRCT_NO = 0;					//	�������ђ�����
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD;			//	��ƌv��ԍ�
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD;	//	�d�|��ƃR�[�h
			sData.m_PARTIAL_PRD_NO = 0;							//	�����
			sData.m_OPR_RSLT_CRCT_NO = 0;						//	��Ǝ��ђ�����
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD;		//	�o�Ɏw���ԍ�
			sData.m_RCV_ISSUE_QTY = stII.m_AUTO_ISSUE_QTY;		//	���o�ɐ�(�����o�ɐ�)
			sData.m_RCV_ISSUE_AMOUNT = bdZero;					//	���o�ɋ��z
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(
					 ginRCV_ISSUE_DATE,Converter.SLASH_DATE);	//	���o�ɔN����
			if (stII.m_CONS_TYP == 0) {
				sData.m_RCV_ISSUE_GNR_TYP = 61;						//	���o�ɔ����敪(61:�H���݌ɓ��Ɂj
			} else {
				sData.m_RCV_ISSUE_GNR_TYP = 81;						//	���o�ɔ����敪(81:�����݌ɓ��Ɂj
			}
			sData.m_RCV_ISSUE_ODD_QTY = bdZero;					//	���o�ɒ[��
			sData.m_DEFECT_CAUSE_CD = null;						//	���o�ɕs�Ǘ��R�R�[�h
			sData.m_STOCK_UPD_TYP = 1;							//	�݌ɍX�V�敪
			sData.m_RCV_ISSUE_CMPLT_FLG = ginRCV_ISSUE_CMPLT_FLG;	//	���o�Ɋ����t���O
			sData.m_OD_NO = stII.m_OD_NO;						//	�I�[�_�f�}���h�ԍ�
			sData.m_VEND_LOT_NO = ginVEND_LOT_NO;				//	���[�J���b�g�ԍ�
			//------------------------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = null;					//	���o�ɔ��l
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd();		//	��ЃR�[�h
			sData.m_VEND_CD = stII.m_VEND_CD;					//	�����R�[�h
			sData.m_CONS_TYP = stII.m_CONS_TYP;					//	�x���敪
			sData.m_CONS_EXEC_DATE = null;						//	�L���x�����ђ��o��
			//------------------------------------------------------------------------
			
			
//			<< �ۊǋ�ʓ��o�ɂ̓o�^ >>
			RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn,_updInfo);
			strOdrCd = sRcvIssueEntity.insert(sData);
			if (!strOdrCd.equals("")) {
			    sData.m_RCV_ISSUE_CTRL_CD = strOdrCd;		//���o�ɊǗ��ԍ�
			}
			
			//���ɏ������Ăяo��
			wRcvProc = new RcvProcess(_iconn, strOdrCd);
			ret = wRcvProc.execProcess();
			if (ret) {
			    //�C���t�H���[�V�������b�Z�[�W��ۑ�
			    for (Iterator itr=wRcvProc.getInfoList().iterator(); itr.hasNext(); ) {
			        MsgCd = (String)itr.next();
			        setInfoList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			    }
			    //���[�j���O���b�Z�[�W�͕ۑ����Ȃ��i���݁ARcvProcess����ԋp����Ă��Ȃ����߁j
			} else {
			    _infoList.clear();
			    _warnList.clear();
			    //�G���[���b�Z�[�W��ۑ�
			    for (Iterator itr=wRcvProc.getErrorList().iterator(); itr.hasNext(); ) {
			        MsgCd = (String)itr.next();
			        setErrorList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			    }
			    return false;
			}			
			_log.methodEnd();
		} catch(ParseException pe) {
				StackTraceElement e	= (new Throwable()).getStackTrace()[1];
				String className = e.getClassName();
				String methodName =	e.getMethodName();
				throw new FoundationException(className,methodName,"ParseException");
		} finally {
		}
		return true;
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
	 * ���[�j���O���b�Z�[�W�ݒ�
	 * @param iMsgCd�@���b�Z�[�W�R�[�h
	 * @param iMsgDetail�@���b�Z�[�W�ڍׁi�i�ڔԍ��j
	 */
	private void setWarnList(String iMsgCd, String iMsgDetail)
	{
	    String[] w_msg =  new String[2];
	    
	    w_msg[0] = iMsgCd;
	    w_msg[1] = iMsgDetail;
	    _warnList.add(w_msg);
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
	 * ���b�Z�[�W�擾 
	 * @return �G���[���X�g(���b�Z�[�W�R�[�h(String) �̃��X�g�j
	 */
	public ArrayList getErrorList()
	{
		return _errorList;
	}

	/**
	 * ���b�Z�[�W�擾 
	 * @return info���X�g
	 */
	public ArrayList getInfoList()
	{
		return _infoList;
	}

	/**
	 * ���b�Z�[�W�擾 
	 * @return warn���X�g
	 */
	public ArrayList getWarnList()
	{
		return _warnList;
	}
	//********************************************************************
	
	
	//********************************************************************
	//     ������ҏW
	//********************************************************************
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

		// �R���X�g���N�^	  // 2003/08/11	connection�擾���C��
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
