/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

/**
 * <B>RcvStruct</B><BR>
 * ���ɏ����p�̃f�[�^�N���X<BR>
 * <BR>
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $
 */
public class RcvStruct
{

	//-------------------------------------------------------------------------
	// �l�i�[�p�����o�ϐ�
	//-------------------------------------------------------------------------
	/** ���o�ɊǗ��ԍ� */
	private String  m_RCV_ISSUE_CTRL_CD = null;
	/** ���o�ɋ敪 */
	private Integer m_RCV_ISSUE_TYP = null;
	/** �i�ڔԍ� */
	private String  m_ITEM_CD = null;
	/** �H��R�[�h */
	private String  m_PLANT_CD = null;
	/** �ۊǋ�R�[�h */
	private String  m_WH_CD = null;
	/** ���� */
	private String  m_JOB_ODR_CD = null;
	/** �����ԍ� */
	private String  m_PUCH_ODR_CD = null;
	/** ��ƌv��ԍ� */
	private String  m_WORK_ODR_CD = null;
	/** ��Ǝw���ԍ� */
	private String  m_ISSUE_INST_CD = null;
	/** ���o�ɐ� */
	private String  m_RCV_ISSUE_QTY = null;
	/** ���o�ɔN���� */
	private String  m_RCV_ISSUE_DATE = null;
	/** �݌ɍX�V�敪 */
	private Integer m_STOCK_UPD_TYP = null;
	/** ���o�ɔ����敪 */
	private Integer m_RCV_ISSUE_GNR_TYP = null;
	/** ���o�Ɋ����t���O */
	private Integer m_RCV_ISSUE_CMPLT_FLG = null;
	/** �I�[�_�f�}���h�ԍ� */
	private String  m_OD_NO = null;
	/** �݌Ƀ��b�g�ԍ� */
	private String  m_LOT_NO = null;
	/** �i�ڍ݌ɁD�莝�݌ɐ� */
	private String  m_ITEM_STOCK_ON_HAND_QTY = null;
	/** ���ԍ݌ɁD�莝�݌ɐ� */
	private String  m_JOB_STOCK_ON_HAND_QTY = null;
	/** �s�ǐ� */
	private String  m_DEFECT_QTY = null;
	/** �X�V�� */
	private String  m_UPDATED_BY = null;
	/** �X�V�v���O������ */
	private String  m_UPDATED_PRG_NM = null;
	/* �V�X�e������ */
	private String  m_SYSDATE = null;
	/** �ޔ�p�݌ɐ� */
	private String  m_SAVE_STOCK_QTY = null;
	/** ���b�g�Ǘ��t���O */
	private Integer m_LOT_CTRL_FLG = null;
	
	//-------------------------------------------------------------------------
	// �v�f�擾�֐�
	//-------------------------------------------------------------------------
	/** ���o�ɊǗ��ԍ��̎擾 */
	public String  getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	/** ���o�ɋ敪�̎擾 */
	public Integer getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	/** �i�ڔԍ��̎擾 */
	public String  getITEM_CD() { return m_ITEM_CD; }
	/** �H��R�[�h�̎擾 */
	public String  getPLANT_CD() { return m_PLANT_CD; }
	/** �ۊǋ�R�[�h�̎擾 */
	public String  getWH_CD() { return m_WH_CD; }
	/** ���Ԃ̎擾 */
	public String  getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	/** �����ԍ��̎擾 */
	public String  getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	/** ��ƌv��ԍ��̎擾 */
	public String  getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	/** ��Ǝw���ԍ��̎擾 */
	public String  getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	/** ���o�ɐ��̎擾 */
	public String  getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	/** ���o�ɔN�����̎擾 */
	public String  getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	/** �݌ɍX�V�敪�̎擾 */
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	/** ���o�ɔ����敪�̎擾 */
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	/** ���o�Ɋ����t���O�̎擾 */
	public Integer getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	/** �I�[�_�f�}���h�ԍ��̎擾 */
	public String  getOD_NO() { return m_OD_NO; }
	/** �݌Ƀ��b�g�ԍ��̎擾 */
	public String  getLOT_NO() { return m_LOT_NO; }
	/** �i�ڍ݌ɁD�莝�݌ɐ��̎擾 */
	public String  getITEM_STOCK_ON_HAND_QTY() { return m_ITEM_STOCK_ON_HAND_QTY; }
	/** ���ԍ݌ɁD�莝�݌ɐ��̎擾 */
	public String  getJOB_STOCK_ON_HAND_QTY() { return m_JOB_STOCK_ON_HAND_QTY; }
	/** �s�ǐ��̎擾 */
	public String  getDEFECT_QTY() { return m_DEFECT_QTY; }
	/** �X�V�҂̎擾 */
	public String  getUPDATED_BY() { return m_UPDATED_BY; }
	/** �X�V�v���O�������̎擾 */
	public String  getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	/** �V�X�e�������̎擾 */
	public String  getSYSDATE() { return m_SYSDATE; }
	/** �ޔ�p�݌ɐ��擾 */
	public String getSAVE_STOCK_QTY() { return m_SAVE_STOCK_QTY; }
	/** ���b�g�Ǘ��t���O�擾 */
	public Integer getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	
	//-------------------------------------------------------------------------
	// �v�f�ݒ�֐�
	//-------------------------------------------------------------------------
	/** ���o�ɊǗ��ԍ��̐ݒ� */
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	/** ���o�ɋ敪�̐ݒ� */
	public void setRCV_ISSUE_TYP(Integer val) { m_RCV_ISSUE_TYP = val; }
	/** �i�ڔԍ��̐ݒ� */
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	/** �H��R�[�h�̐ݒ� */
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	/** �ۊǋ�R�[�h�̐ݒ� */
	public void setWH_CD(String val) { m_WH_CD = val; }
	/** ���Ԃ̐ݒ� */
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	/** �����ԍ��̐ݒ� */
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	/** ��ƌv��ԍ��̐ݒ� */
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	/** ��Ǝw���ԍ��̐ݒ� */
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	/** ���o�ɐ��̐ݒ� */
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	/** ���o�ɔN�����̐ݒ� */
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	/** �݌ɍX�V�敪�̐ݒ� */
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	/** ���o�ɔ����敪�̐ݒ� */
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	/** ���o�Ɋ����t���O�̐ݒ� */
	public void setRCV_ISSUE_CMPLT_FLG(Integer val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	/** �I�[�_�f�}���h�ԍ��̐ݒ� */
	public void setOD_NO(String val) { m_OD_NO = val; }
	/** �݌Ƀ��b�g�ԍ��̐ݒ� */
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	/** �i�ڍ݌ɁD�莝�݌ɐ��̐ݒ� */
	public void setITEM_STOCK_ON_HAND_QTY(String val) { m_ITEM_STOCK_ON_HAND_QTY = val; }
	/** ���ԍ݌ɁD�莝�݌ɐ��̐ݒ� */
	public void setJOB_STOCK_ON_HAND_QTY(String val) { m_JOB_STOCK_ON_HAND_QTY = val; }
	/** �s�ǐ��̐ݒ� */
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	/** �X�V�҂̐ݒ� */
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	/** �X�V�v���O�������̐ݒ� */
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	/** �V�X�e�����t�̐ݒ� */
	public void setSYSDATE(String val) { m_SYSDATE = val; }
	/** �ޔ�p�݌ɐ��ݒ� */
	public void setSAVE_STOCK_QTY(String val) { m_SAVE_STOCK_QTY = val; }
	/** ���b�g�Ǘ��t���O�ݒ� */
	public void setLOT_CTRL_FLG(Integer val) { m_LOT_CTRL_FLG = val; }
	
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
		m_LOT_NO = null;
		m_ITEM_STOCK_ON_HAND_QTY = null;
		m_JOB_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;
		m_SAVE_STOCK_QTY = null;
		m_LOT_CTRL_FLG = null;

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
		m_LOT_NO = null;
		m_ITEM_STOCK_ON_HAND_QTY = "0";
		m_JOB_STOCK_ON_HAND_QTY = "0";
		m_DEFECT_QTY = "0";
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;
		m_SAVE_STOCK_QTY = "0";
		m_LOT_CTRL_FLG = new Integer(0);

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
		if(struct.m_LOT_NO != null)
			 m_LOT_NO = struct.getLOT_NO();
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
		if(struct.m_SAVE_STOCK_QTY != null)
			 m_SAVE_STOCK_QTY = struct.getSAVE_STOCK_QTY();
		if(struct.m_LOT_CTRL_FLG != null)
			m_LOT_CTRL_FLG = struct.getLOT_CTRL_FLG();
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

	/** ���o�ɔ����敪 �H���݌ɓ���*/
	public static final int GNR_TYP_PROC_STOCK			= 61;
	
	/** ���o�ɔ����敪 �H���݌ɓ��Ɏ��*/
	public static final int GNR_TYP_PROC_STOCK_CANCEL			= 69;
	
	/** ���o�ɔ����敪 �����݌ɓ���*/
	public static final int GNR_TYP_VEND_STOCK			= 81;
	
	/** ���o�ɔ����敪 �����݌ɓ��Ɏ��*/
	public static final int GNR_TYP_VEND_STOCK_CANCEL			= 89;
	
	/** �݌ɍX�V�敪 �X�V��*/
	public static final int UPD_TYP_COMPLETED		= 2;
	
	/** ���b�g�Ǘ��t���O ���b�g�Ǘ�*/
	public static final int LOT_CTRL_LOT           = 1;

}
