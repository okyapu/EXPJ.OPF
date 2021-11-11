/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvCancelStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.stock;
package com.nec.jp.orteus.expj.pr.rcvissue.process;

/**
 * <B>RcvCancelStruct</B><BR>
 * ���ɏ����p�̃f�[�^�N���X<BR>
 * <BR>
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $
 */
public class RcvCancelStruct
{

	/**
	 * �l�i�[�p�����o�ϐ�
	 */
	public String  m_RCV_ISSUE_CTRL_CD = null;			// ���o�ɊǗ��ԍ�
	public String m_RCV_ISSUE_TYP = null;				// ���o�ɋ敪
	public String  m_ITEM_CD = null;					// �i�ڔԍ�
	public String  m_WORK_IN_PROC_CD = null;			// �d�|��ƃR�[�h
	public String  m_WH_CD = null;						// �ۊǋ�R�[�h
	public String  m_JOB_ODR_CD = null;					// ����
	public String  m_JOB_ODR_DETAIL_NO = null;			// ���Ԏ}��
	public String  m_PUCH_ODR_CD = null;				// �����ԍ�
	public String  m_ACPT_NO = null;					// �����
	public String  m_WORK_ODR_CD = null;				// ��ƌv��ԍ�
	public String  m_ISSUE_INST_CD = null;				// �o�Ɏw���ԍ�
	public String  m_RCV_ISSUE_QTY = null;				// ���o�ɐ�
	public String  m_RCV_ISSUE_DATE = null;				// ���o�ɔN����
	public String m_RCV_ISSUE_GNR_TYP = null;			// ���o�ɔ����敪
	public String m_RCV_ISSUE_CMPLT_FLG = null;			// ���o�Ɋ����t���O
	public String m_OPR_RSLT_CRCT_NO = null;			// ��Ǝ��ђ�����
	public String  m_OD_NO = null;						// �I�[�_�f�}���h�ԍ�
	public String  m_PARTIAL_PRD_NO = null;				// �����
	public String  m_PLANT_CD = null;					// �H��R�[�h
	public String  m_MRP_ODR_TYP = null;				// �i�ڎ�z�敪
	public String  m_LOT_NO = null;						// �݌Ƀ��b�g�ԍ�
	public String  m_UPDATED_BY = null;					// �X�V��
	public String  m_UPDATED_PRG_NM = null;				// �X�V�v���O������
	public String  m_SYSDATE = null;					// �V�X�e������

	/**
	 * �v�f�擾�֐�
	 */
	public String  getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String  getITEM_CD() { return m_ITEM_CD; }
	public String  getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String  getWH_CD() { return m_WH_CD; }
	public String  getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String  getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String  getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String  getACPT_NO() { return m_ACPT_NO; }
	public String  getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String  getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String  getOPR_RSLT_CRCT_NO() { return m_OPR_RSLT_CRCT_NO; }
	public String  getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String  getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public String  getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String  getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String  getOD_NO() { return m_OD_NO; }
	public String  getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String  getPLANT_CD() { return m_PLANT_CD; }
	public String  getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String  getLOT_NO() { return m_LOT_NO; }
	public String  getUPDATED_BY() { return m_UPDATED_BY; }
	public String  getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String  getSYSDATE() { return m_SYSDATE; }

	/**
	 * �v�f�ݒ�֐�
	 */
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setOPR_RSLT_CRCT_NO(String val) { m_OPR_RSLT_CRCT_NO = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD= val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO= val; }
	public void setPLANT_CD(String val) { m_PLANT_CD= val; }
	public void setMRP_ODR_TYP(String val){m_MRP_ODR_TYP=val;}
	public void setLOT_NO(String val){m_LOT_NO=val;}
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void setSYSDATE(String val) { m_SYSDATE = val; }

	/**
	 * �R���X�g���N�^
	 *
	 * @param �Ȃ�
	 */
	public RcvCancelStruct()
	{
		// ������
		initialize();
		return;
	}

	/**
	 * �����o�ϐ��̃N���A
	 *
	 * @param �Ȃ�
	 */
	public void clear()
	{
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_ITEM_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_PUCH_ODR_CD = null;
		m_ACPT_NO = null;
		m_WORK_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_OPR_RSLT_CRCT_NO = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_OD_NO = null;
		m_PARTIAL_PRD_NO = null;
		m_PLANT_CD = null;
		m_MRP_ODR_TYP = null;
		m_LOT_NO = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 * @param �Ȃ�
	 */
	public void finalize()
	{
		// �N���A
		clear();
		return;
	}

	/**
	 * ������
	 */
	public void initialize()
	{
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_ITEM_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_PUCH_ODR_CD = null;
		m_ACPT_NO = null;
		m_WORK_ODR_CD = null;
		m_OPR_RSLT_CRCT_NO = null;
		m_RCV_ISSUE_QTY = "0";
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_OD_NO = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;
		m_ISSUE_INST_CD = null;
		m_PARTIAL_PRD_NO = null;
		m_MRP_ODR_TYP = null;
		m_LOT_NO = null;
		m_PLANT_CD = null;

	}

	/**
	 * �R�s�[
	 */
	public void copy(RcvCancelStruct struct)
	{
		clear();
		if(struct.m_RCV_ISSUE_CTRL_CD != null)
			 m_RCV_ISSUE_CTRL_CD = new String(struct.getRCV_ISSUE_CTRL_CD());
		if(struct.m_RCV_ISSUE_TYP != null)
			 m_RCV_ISSUE_TYP = new String(struct.getRCV_ISSUE_TYP());
		if(struct.m_ITEM_CD != null)
			 m_ITEM_CD = new String(struct.getITEM_CD());
		if(struct.m_WORK_IN_PROC_CD != null)
			 m_WORK_IN_PROC_CD = new String(struct.getWORK_IN_PROC_CD());
		if(struct.m_WH_CD != null)
			 m_WH_CD = new String(struct.getWH_CD());
		if(struct.m_JOB_ODR_CD != null)
			 m_JOB_ODR_CD = new String(struct.getJOB_ODR_CD());
		if(struct.m_JOB_ODR_DETAIL_NO != null)
			 m_JOB_ODR_DETAIL_NO = new String(struct.getJOB_ODR_DETAIL_NO());
		if(struct.m_PUCH_ODR_CD != null)
			 m_PUCH_ODR_CD = new String(struct.getPUCH_ODR_CD());
		if(struct.m_ACPT_NO != null)
			 m_ACPT_NO = new String(struct.getACPT_NO());
		if(struct.m_WORK_ODR_CD != null)
			 m_WORK_ODR_CD = new String(struct.getWORK_ODR_CD());
		if(struct.m_ISSUE_INST_CD != null)
			 m_ISSUE_INST_CD = new String(struct.getISSUE_INST_CD());
		if(struct.m_OPR_RSLT_CRCT_NO != null)
			 m_OPR_RSLT_CRCT_NO = new String(struct.getOPR_RSLT_CRCT_NO());
		if(struct.m_RCV_ISSUE_QTY != null)
			 m_RCV_ISSUE_QTY = new String(struct.getRCV_ISSUE_QTY());
		if(struct.m_RCV_ISSUE_DATE != null)
			 m_RCV_ISSUE_DATE = new String(struct.getRCV_ISSUE_DATE());
		if(struct.m_RCV_ISSUE_GNR_TYP != null)
			 m_RCV_ISSUE_GNR_TYP = new String(struct.getRCV_ISSUE_GNR_TYP());
		if(struct.m_RCV_ISSUE_CMPLT_FLG != null)
			 m_RCV_ISSUE_CMPLT_FLG = new String(struct.getRCV_ISSUE_CMPLT_FLG());
		if(struct.m_OD_NO != null)
			 m_OD_NO = new String(struct.getOD_NO());
		if(struct.m_UPDATED_BY != null)
			 m_UPDATED_BY = new String(struct.getUPDATED_BY());
		if(struct.m_UPDATED_PRG_NM != null)
			 m_UPDATED_PRG_NM = new String(struct.getUPDATED_PRG_NM());
		if(struct.m_SYSDATE != null)
			 m_SYSDATE = new String(struct.getSYSDATE());
		if(struct.m_PARTIAL_PRD_NO != null)
			 m_PARTIAL_PRD_NO = new String(struct.getPARTIAL_PRD_NO());
		if(struct.m_MRP_ODR_TYP != null)
			 m_MRP_ODR_TYP = new String(struct.getMRP_ODR_TYP());
		if(struct.m_LOT_NO != null)
			 m_LOT_NO = new String(struct.getLOT_NO());
		if(struct.m_PLANT_CD != null)
			 m_PLANT_CD = new String(struct.getPLANT_CD());
	}
}

