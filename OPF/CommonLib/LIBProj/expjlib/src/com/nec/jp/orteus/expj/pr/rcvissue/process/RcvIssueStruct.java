/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvIssueStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.util.Date;


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
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:03 $
 */

/**
 * �ۊǋ�ʓ��o�Ƀt�@�C���@�f�[�^�ێ��N���X
 * 
 */
public class RcvIssueStruct {
    /** ���o�ɊǗ��ԍ� */
	public String	m_RCV_ISSUE_CTRL_CD = null;
    /** ���o�ɋ敪 */
	public int		m_RCV_ISSUE_TYP = 0;
    /** �i�ڔԍ� */
	public String  m_ITEM_CD = null;
    /** �H��R�[�h */
	public String  m_PLANT_CD = null;
    /** �ۊǋ�R�[�h */
	public String  m_WH_CD = null;	
    /** ���� */
	public String  m_JOB_ODR_CD = null;
    /** ���Ԏ}�� */
	public int		m_JOB_ODR_DETAIL_NO = 0;	
    /** �����ԍ� */
	public String	m_PUCH_ODR_CD = null;
    /** ����� */
	public int		m_ACPT_NO = 0;
    /** ������ђ����� */
	public int		m_ACPT_RSLT_CRCT_NO = 0;
    /** �������ђ����� */
	public int		m_INSPEC_RSLT_CRCT_NO = 0;	
    /** ��ƌv��ԍ� */
	public String	m_WORK_ODR_CD = null;	
    /** �d�|��ƃR�[�h */
	public String	m_WORK_IN_PROC_CD = null;	
    /** ����� */
	public int		m_PARTIAL_PRD_NO = 0;	
    /** ��Ǝ��ђ����� */
	public int		m_OPR_RSLT_CRCT_NO = 0;	
    /** �o�Ɏw���ԍ� */
	public String	m_ISSUE_INST_CD = null;	
    /** ���o�ɐ� */
	public BigDecimal  m_RCV_ISSUE_QTY = null;	
    /** ���o�ɋ��z */
	public BigDecimal  m_RCV_ISSUE_AMOUNT = null;	
    /** ���o�ɔN���� */
	public Date		m_RCV_ISSUE_DATE = null;	
    /** ���o�ɔ����敪 */
	public int		m_RCV_ISSUE_GNR_TYP = 0;	
    /** ���o�ɒ[�� */
	public BigDecimal  m_RCV_ISSUE_ODD_QTY = null;	
    /** ���o�ɕs�Ǘ��R�R�[�h */
	public String  m_DEFECT_CAUSE_CD = null;	
    /** �݌ɍX�V�敪 */
	public int  	m_STOCK_UPD_TYP = 0;	
    /** ���o�Ɋ����t���O */
	public int  	m_RCV_ISSUE_CMPLT_FLG = 0;	
    /** �I�[�_�f�}���h�ԍ� */
	public String  m_OD_NO = null;	
	/** ���b�g�ԍ� */
	public String  m_LOT_NO = null;	
    /** ���[�J���b�g�ԍ� */
	public String  m_VEND_LOT_NO = null;	
    /** ���o�ɔ��l */
	public String  m_RCV_ISSUE_COMMENT = null;	
    /** ��ЃR�[�h */
	public String  m_COMPANY_CD = null;
    /** �����R�[�h */
	public String  m_VEND_CD = null;	
    /** �x���敪 */
	public int		m_CONS_TYP = 0;	
    /** �L���x�����ђ��o�� */
	public Date		m_CONS_EXEC_DATE = null;	
}
