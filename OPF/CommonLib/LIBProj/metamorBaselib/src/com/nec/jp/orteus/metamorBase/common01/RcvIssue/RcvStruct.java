//------------------------------------------------------------------------------
// (#)RcvStruct.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/21 �V�K�쐬 M.Hotokebuchi
// 2003/08/26 M.Hotokebuchi
//            �EgetISSUE_INST_CD()�̖߂�l���s�����������ߏC��
//            �E���ʂ�Integer �� Double (int �� double) �ɕϊ�
// 2003/08/27 M.Hotokebuchi
//           �Eupdate���ɒǉ�����X�V��,�X�V��,�X�V�v���O�����p�̋L�q��ǉ�
// 2003/09/01 M.Hotokebuchi
//           �EDouble��String �Ή�
// 2003/10/20 M.Hotokebuchi
//           �E�Ɩ��^�p�����v����ɕύX
// 2003/12/05 M.Hotokebuchi
//           �E�v������菈���̍폜�ɔ����A�֘A���ڂ��폜
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.RcvIssue;

/**
 * <B>RcvStruct</B><BR>
 * ���ɏ����p�̃f�[�^�N���X<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.00
 */
public class RcvStruct
{

	/**
	 * �l�i�[�p�����o�ϐ�
	 */
	public String  m_RCV_ISSUE_CTRL_CD = null;			// ���o�ɊǗ��ԍ�
	public Integer m_RCV_ISSUE_TYP = null;				// ���o�ɋ敪
	public String  m_ITEM_CD = null;					// �i�ڔԍ�
	public String  m_PLANT_CD = null;					// �H��R�[�h
	public String  m_WH_CD = null;						// �ۊǋ�R�[�h
	public String  m_JOB_ODR_CD = null;					// ����
	public String  m_PUCH_ODR_CD = null;				// �����ԍ�
	public String  m_WORK_ODR_CD = null;				// ��ƌv��ԍ�
	public String  m_ISSUE_INST_CD = null;				// ��Ǝw���ԍ�
	public String  m_RCV_ISSUE_QTY = null;				// ���o�ɐ�
	public String  m_RCV_ISSUE_DATE = null;				// ���o�ɔN����
	public Integer m_STOCK_UPD_TYP = null;				// �݌ɍX�V�敪
	public Integer m_RCV_ISSUE_GNR_TYP = null;			// ���o�ɔ����敪
	public Integer m_RCV_ISSUE_CMPLT_FLG = null;		// ���o�Ɋ����t���O
	public String  m_OD_NO = null;						// �I�[�_�f�}���h�ԍ�
	public String  m_ITEM_STOCK_ON_HAND_QTY = null;		// �i�ڍ݌� �莝�݌ɐ�
	public String  m_JOB_STOCK_ON_HAND_QTY = null;		// ���ԍ݌� �莝�݌ɐ�
	public String  m_DEFECT_QTY = null;					// �s�ǐ�
	public String  m_UPDATED_BY = null;					// �X�V��
	public String  m_UPDATED_PRG_NM = null;				// �X�V�v���O������
	public String  m_SYSDATE = null;					// �V�X�e������

	/**
	 * �v�f�擾�֐�
	 */
	public String  getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public Integer getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String  getITEM_CD() { return m_ITEM_CD; }
	public String  getPLANT_CD() { return m_PLANT_CD; }
	public String  getWH_CD() { return m_WH_CD; }
	public String  getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String  getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String  getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String  getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String  getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String  getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public Integer getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String  getOD_NO() { return m_OD_NO; }
	public String  getITEM_STOCK_ON_HAND_QTY() { return m_ITEM_STOCK_ON_HAND_QTY; }
	public String  getJOB_STOCK_ON_HAND_QTY() { return m_JOB_STOCK_ON_HAND_QTY; }
	public String  getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String  getUPDATED_BY() { return m_UPDATED_BY; }
	public String  getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String  getSYSDATE() { return m_SYSDATE; }

	/**
	 * �v�f�ݒ�֐�
	 */
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(Integer val) { m_RCV_ISSUE_TYP = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(Integer val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setITEM_STOCK_ON_HAND_QTY(String val) { m_ITEM_STOCK_ON_HAND_QTY = val; }
	public void setJOB_STOCK_ON_HAND_QTY(String val) { m_JOB_STOCK_ON_HAND_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void setSYSDATE(String val) { m_SYSDATE = val; }

	/**
	 * �R���X�g���N�^
	 *
	 * @param �Ȃ�
	 */
	public RcvStruct()
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
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_PUCH_ODR_CD = null;
		m_WORK_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_OD_NO = null;
		m_ITEM_STOCK_ON_HAND_QTY = null;
		m_JOB_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
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
		m_RCV_ISSUE_TYP = new Integer(0);
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_PUCH_ODR_CD = null;
		m_WORK_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_RCV_ISSUE_QTY = "0";
		m_RCV_ISSUE_DATE = null;
		m_STOCK_UPD_TYP = new Integer(0);
		m_RCV_ISSUE_GNR_TYP = new Integer(0);
		m_RCV_ISSUE_CMPLT_FLG = new Integer(0);
		m_OD_NO = null;
		m_ITEM_STOCK_ON_HAND_QTY = "0";
		m_JOB_STOCK_ON_HAND_QTY = "0";
		m_DEFECT_QTY = "0";
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;

	}

	/**
	 * �R�s�[
	 */
	public void copy(RcvStruct struct)
	{
		clear();
		if(struct.m_RCV_ISSUE_CTRL_CD != null)
			 m_RCV_ISSUE_CTRL_CD = new String(struct.getRCV_ISSUE_CTRL_CD());
		if(struct.m_RCV_ISSUE_TYP != null)
			 m_RCV_ISSUE_TYP = new Integer(struct.getRCV_ISSUE_TYP().intValue());
		if(struct.m_ITEM_CD != null)
			 m_ITEM_CD = new String(struct.getITEM_CD());
		if(struct.m_PLANT_CD != null)
			 m_PLANT_CD = new String(struct.getPLANT_CD());
		if(struct.m_WH_CD != null)
			 m_WH_CD = new String(struct.getWH_CD());
		if(struct.m_JOB_ODR_CD != null)
			 m_JOB_ODR_CD = new String(struct.getJOB_ODR_CD());
		if(struct.m_PUCH_ODR_CD != null)
			 m_PUCH_ODR_CD = new String(struct.getPUCH_ODR_CD());
		if(struct.m_WORK_ODR_CD != null)
			 m_WORK_ODR_CD = new String(struct.getWORK_ODR_CD());
		if(struct.m_ISSUE_INST_CD != null)
			 m_ISSUE_INST_CD = new String(struct.getISSUE_INST_CD());
		if(struct.m_RCV_ISSUE_QTY != null)
			 m_RCV_ISSUE_QTY = new String(struct.getRCV_ISSUE_QTY());
		if(struct.m_RCV_ISSUE_DATE != null)
			 m_RCV_ISSUE_DATE = new String(struct.getRCV_ISSUE_DATE());
		if(struct.m_STOCK_UPD_TYP != null)
			 m_STOCK_UPD_TYP = new Integer(struct.getSTOCK_UPD_TYP().intValue());
		if(struct.m_RCV_ISSUE_GNR_TYP != null)
			 m_RCV_ISSUE_GNR_TYP = new Integer(struct.getRCV_ISSUE_GNR_TYP().intValue());
		if(struct.m_RCV_ISSUE_CMPLT_FLG != null)
			 m_RCV_ISSUE_CMPLT_FLG = new Integer(struct.getRCV_ISSUE_CMPLT_FLG().intValue());
		if(struct.m_OD_NO != null)
			 m_OD_NO = new String(struct.getOD_NO());
		if(struct.m_ITEM_STOCK_ON_HAND_QTY != null)
			 m_ITEM_STOCK_ON_HAND_QTY = new String(struct.getITEM_STOCK_ON_HAND_QTY());
		if(struct.m_JOB_STOCK_ON_HAND_QTY != null)
			 m_JOB_STOCK_ON_HAND_QTY = new String(struct.getJOB_STOCK_ON_HAND_QTY());
		if(struct.m_DEFECT_QTY != null)
			 m_DEFECT_QTY = new String(struct.getDEFECT_QTY());
		if(struct.m_UPDATED_BY != null)
			 m_UPDATED_BY = new String(struct.getUPDATED_BY());
		if(struct.m_UPDATED_PRG_NM != null)
			 m_UPDATED_PRG_NM = new String(struct.getUPDATED_PRG_NM());
		if(struct.m_SYSDATE != null)
			 m_SYSDATE = new String(struct.getSYSDATE());
	}


	/**
	 * �R�s�[�R���X�g���N�^
	 */
	 public RcvStruct(RcvStruct struct)
	 {
	 	copy(struct);
	 }

	/** ���o�ɋ敪 ����*/
	public static final int ISSUE_RCV_TYP_RCV		= 1;

	/** ���o�ɋ敪 �o��*/
	public static final int ISSUE_RCV_TYP_ISSUE		= 2;

	/** ���o�ɋ敪 �s�Ǔ���*/
	public static final int ISSUE_RCV_TYP_DEF_RCV	= 3;

	/** ���o�ɋ敪 �s�Ǐo��*/
	public static final int ISSUE_RCV_TYP_DEF_ISSUE	= 4;

	/** ���o�ɔ����敪 �ʏ����*/
	public static final int GNR_TYP_DEFAULT			= 11;

	/** ���o�ɔ����敪 �v��O����*/
	public static final int GNR_TYP_OUTSIDE_OF_PLAN	= 12;

	/** ���o�ɔ����敪 �ړ�����*/
	public static final int GNR_TYP_MOVE			= 13;

	/** ���o�ɔ����敪 �U�֓���*/
	public static final int GNR_TYP_TRANSFER		= 14;

	/** ���o�ɔ����敪 ���Ɏ��*/
	public static final int GNR_TYP_CANCEL			= 19;

	/** �݌ɍX�V�敪 �X�V��*/
	public static final int UPD_TYP_COMPLETED		= 2;

}
