/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

/**
 * <pre>
 * �o�ɏ����p�̃f�[�^�N���X
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $
 *
 **/

public class IssueStruct
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
	/** �����݌ɋ敪 */
	private Integer m_ALC_STOCK_TYP = null;
	/** �i�ڍ݌ɁD�莝�݌ɐ� */
	private String  m_ITEM_STOCK_ON_HAND_QTY = null;
	/** ���ԍ݌ɁD�莝�݌ɐ� */
	private String  m_JOB_STOCK_ON_HAND_QTY = null;
	/** �s�ǐ� */
	private String  m_DEFECT_QTY = null;
	/** �����ϐ� */
	private String  m_ALCD_QTY = null;
	/** �o�ɍϐ� */
	private String  m_ISSUEED_QTY = null;
	/** �X�V�� */
	private String  m_UPDATED_BY = null;
	/** �X�V�v���O������ */
	private String  m_UPDATED_PRG_NM = null;
	/** �V�X�e������ */
	private String  m_SYSDATE = null;
	/** �ޔ�p�݌ɐ� */
	private String  m_SAVE_STOCK_QTY = null;
	/** ���Ԏ}�� */
	private String  m_JOB_ODR_DETAIL_NO = null;
	/** �I�[�_�� */
	private String  m_ODR_QTY = null;
	/** �o�ɗ݌v�� */
	private String  m_TOTAL_RCV_QTY = null;
	/** [���v��]."����" */
	private String  m_JOB_ODR_CD_BY_T_OD = null;
	/** [���v��]."���Ԏ}��" */
	private String  m_JOB_ODR_DETAIL_NO_BY_T_OD = null;
	/** ���Ԉ����Ǘ��ԍ� */
	private String  m_JOB_ODR_ALC_CD = null;
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
	/** �����݌ɋ敪�̎擾 */
	public Integer getALC_STOCK_TYP() { return m_ALC_STOCK_TYP; }
	/** �i�ڍ݌ɁD�莝�݌ɐ��̎擾 */
	public String  getITEM_STOCK_ON_HAND_QTY() { return m_ITEM_STOCK_ON_HAND_QTY; }
	/** ���ԍ݌ɁD�莝�݌ɐ��̎擾 */
	public String  getJOB_STOCK_ON_HAND_QTY() { return m_JOB_STOCK_ON_HAND_QTY; }
	/** �s�ǐ��̎擾 */
	public String  getDEFECT_QTY() { return m_DEFECT_QTY; }
	/** �����ϐ��̎擾 */
	public String  getALCD_QTY() { return m_ALCD_QTY; }
	/* �o�ɍϐ��̎擾 */
	public String  getISSUEED_QTY() { return m_ISSUEED_QTY; }
	/** �X�V�҂̎擾 */
	public String  getUPDATED_BY() { return m_UPDATED_BY; }
	/** �X�V�v���O�������̎擾 */
	public String  getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	/** �V�X�e�������̎擾 */
	public String  getSYSDATE() { return m_SYSDATE; }
	/** �ޔ�p�݌ɐ��擾 */
	public String getSAVE_STOCK_QTY() { return m_SAVE_STOCK_QTY; }
	/** ���Ԏ}�Ԏ擾 */
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	/** �I�[�_���擾 */
	public String getODR_QTY() { return m_ODR_QTY; }
	/** �o�ɗ݌v���擾 */
	public String getTOTAL_RCV_QTY() { return m_TOTAL_RCV_QTY; }
	/** [���v��]."����"�擾 */
	public String getJOB_ODR_CD_BY_T_OD() { return m_JOB_ODR_CD_BY_T_OD; }
	/** [���v��]."���Ԏ}��"�擾 */
	public String getJOB_ODR_DETAIL_NO_BY_T_OD() { return m_JOB_ODR_DETAIL_NO_BY_T_OD; }
	/** ���Ԉ����Ǘ��ԍ��擾 */
	public String getJOB_ODR_ALC_CD() { return m_JOB_ODR_ALC_CD; }
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
	/** �����݌ɋ敪�̐ݒ� */
	public void setALC_STOCK_TYP(Integer val) { m_ALC_STOCK_TYP = val; }
	/** �i�ڍ݌ɁD�莝�݌ɐ��̐ݒ� */
	public void setITEM_STOCK_ON_HAND_QTY(String val) { m_ITEM_STOCK_ON_HAND_QTY = val; }
	/** ���ԍ݌ɁD�莝�݌ɐ��̐ݒ� */
	public void setJOB_STOCK_ON_HAND_QTY(String val) { m_JOB_STOCK_ON_HAND_QTY = val; }
	/** �s�ǐ��̐ݒ� */
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	/** �����ϐ��̐ݒ� */
	public void setALCD_QTY(String val) { m_ALCD_QTY = val; }
	/** �o�ɍϐ��̐ݒ� */
	public void setISSUEED_QTY(String val) { m_ISSUEED_QTY = val; }
	/** �X�V�҂̐ݒ� */
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	/** �X�V�v���O�������̐ݒ� */
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	/** �V�X�e�����t�̐ݒ� */
	public void setSYSDATE(String val) { m_SYSDATE = val; }
	/** �ޔ�p�݌ɐ��ݒ� */
	public void setSAVE_STOCK_QTY(String val) { m_SAVE_STOCK_QTY = val; }
	/** ���Ԏ}�Ԑݒ� */
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	/** �I�[�_���ݒ� */
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	/** �o�ɗ݌v���ݒ� */
	public void setTOTAL_RCV_QTY(String val) { m_TOTAL_RCV_QTY = val; }
	/** [���v��]."����"�ݒ� */
	public void setJOB_ODR_CD_BY_T_OD(String val) { m_JOB_ODR_CD_BY_T_OD = val; }
	/** [���v��]."���Ԏ}��"�ݒ� */
	public void setJOB_ODR_DETAIL_NO_BY_T_OD(String val) { m_JOB_ODR_DETAIL_NO_BY_T_OD = val; }
	/** ���Ԉ����Ǘ��ԍ��ݒ� */
	public void setJOB_ODR_ALC_CD(String val) { m_JOB_ODR_ALC_CD = val; }
	/** ���b�g�Ǘ��t���O�ݒ� */
	public void setLOT_CTRL_FLG(Integer val) { m_LOT_CTRL_FLG = val; }
	
	/**
	 * �R���X�g���N�^
	 *
	 * @param �Ȃ�
	 */
	public IssueStruct()
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
		m_ALC_STOCK_TYP = null;
		m_ITEM_STOCK_ON_HAND_QTY = null;
		m_JOB_STOCK_ON_HAND_QTY = null;
		m_DEFECT_QTY = null;
		m_ALCD_QTY = null;
		m_ISSUEED_QTY = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;
		m_SAVE_STOCK_QTY = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_ODR_QTY = null;
		m_TOTAL_RCV_QTY = null;
		m_JOB_ODR_CD_BY_T_OD = null;
		m_JOB_ODR_DETAIL_NO_BY_T_OD = null;
		m_JOB_ODR_ALC_CD = null;
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
		m_ALC_STOCK_TYP = new Integer(0);
		m_ITEM_STOCK_ON_HAND_QTY = "0";
		m_JOB_STOCK_ON_HAND_QTY = "0";
		m_DEFECT_QTY = "0";
		m_ALCD_QTY = "0";
		m_ISSUEED_QTY = "0";
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_SYSDATE = null;
		m_SAVE_STOCK_QTY = "0";
		m_JOB_ODR_DETAIL_NO = null;
		m_ODR_QTY = null;
		m_TOTAL_RCV_QTY = null;
		m_JOB_ODR_CD_BY_T_OD = null;
		m_JOB_ODR_DETAIL_NO_BY_T_OD = null;
		m_JOB_ODR_ALC_CD = null;
		m_LOT_CTRL_FLG = new Integer(0);

	}

	/**
	 * �R�s�[
	 */
	public void copy(IssueStruct struct)
	{
		clear();
		if(struct.m_RCV_ISSUE_CTRL_CD != null)
			 m_RCV_ISSUE_CTRL_CD = struct.getRCV_ISSUE_CTRL_CD();
		if(struct.m_RCV_ISSUE_TYP != null)
			 m_RCV_ISSUE_TYP = struct.getRCV_ISSUE_TYP();
		if(struct.m_ITEM_CD != null)
			 m_ITEM_CD = struct.getITEM_CD();
		if(struct.m_PLANT_CD != null)
			 m_PLANT_CD = struct.getPLANT_CD();
		if(struct.m_WH_CD != null)
			 m_WH_CD = struct.getWH_CD();
		if(struct.m_JOB_ODR_CD != null)
			 m_JOB_ODR_CD = struct.getJOB_ODR_CD();
		if(struct.m_PUCH_ODR_CD != null)
			 m_PUCH_ODR_CD = struct.getPUCH_ODR_CD();
		if(struct.m_WORK_ODR_CD != null)
			 m_WORK_ODR_CD = struct.getWORK_ODR_CD();
		if(struct.m_ISSUE_INST_CD != null)
			 m_ISSUE_INST_CD = struct.getISSUE_INST_CD();
		if(struct.m_RCV_ISSUE_QTY != null)
			 m_RCV_ISSUE_QTY = struct.getRCV_ISSUE_QTY();
		if(struct.m_RCV_ISSUE_DATE != null)
			 m_RCV_ISSUE_DATE = struct.getRCV_ISSUE_DATE();
		if(struct.m_STOCK_UPD_TYP != null)
			 m_STOCK_UPD_TYP = struct.getSTOCK_UPD_TYP();
		if(struct.m_RCV_ISSUE_GNR_TYP != null)
			 m_RCV_ISSUE_GNR_TYP = struct.getRCV_ISSUE_GNR_TYP();
		if(struct.m_RCV_ISSUE_CMPLT_FLG != null)
			 m_RCV_ISSUE_CMPLT_FLG = struct.getRCV_ISSUE_CMPLT_FLG();
		if(struct.m_OD_NO != null)
			 m_OD_NO = struct.getOD_NO();
		if(struct.m_LOT_NO != null)
			 m_LOT_NO = struct.getLOT_NO();
		if(struct.m_ALC_STOCK_TYP != null)
			 m_ALC_STOCK_TYP = struct.getALC_STOCK_TYP();
		if(struct.m_ITEM_STOCK_ON_HAND_QTY != null)
			 m_ITEM_STOCK_ON_HAND_QTY = struct.getITEM_STOCK_ON_HAND_QTY();
		if(struct.m_JOB_STOCK_ON_HAND_QTY != null)
			 m_JOB_STOCK_ON_HAND_QTY = struct.getJOB_STOCK_ON_HAND_QTY();
		if(struct.m_DEFECT_QTY != null)
			 m_DEFECT_QTY = struct.getDEFECT_QTY();
		if(struct.m_ALCD_QTY != null)
			 m_ALCD_QTY = struct.getALCD_QTY();
		if(struct.m_ISSUEED_QTY != null)
			 m_ISSUEED_QTY = struct.getISSUEED_QTY();
		if(struct.m_UPDATED_BY != null)
			 m_UPDATED_BY = struct.getUPDATED_BY();
		if(struct.m_UPDATED_PRG_NM != null)
			 m_UPDATED_PRG_NM = struct.getUPDATED_PRG_NM();
		if(struct.m_SYSDATE != null)
			 m_SYSDATE = struct.getSYSDATE();
		if(struct.m_SAVE_STOCK_QTY != null)
			 m_SAVE_STOCK_QTY = struct.getSAVE_STOCK_QTY();
		if(struct.m_JOB_ODR_DETAIL_NO != null)
			 m_JOB_ODR_DETAIL_NO = struct.getJOB_ODR_DETAIL_NO();
		if(struct.m_ODR_QTY != null)
			 m_ODR_QTY = struct.getODR_QTY();
		if(struct.m_TOTAL_RCV_QTY != null)
			 m_TOTAL_RCV_QTY = struct.getTOTAL_RCV_QTY();
		if(struct.m_JOB_ODR_CD_BY_T_OD != null)
			 m_JOB_ODR_CD_BY_T_OD = struct.getJOB_ODR_CD_BY_T_OD();
		if(struct.m_JOB_ODR_DETAIL_NO_BY_T_OD != null)
			 m_JOB_ODR_DETAIL_NO_BY_T_OD = struct.getJOB_ODR_DETAIL_NO_BY_T_OD();
		if(struct.m_JOB_ODR_ALC_CD != null)
			 m_JOB_ODR_ALC_CD = struct.getJOB_ODR_ALC_CD();
		if(struct.m_LOT_CTRL_FLG != null)
			m_LOT_CTRL_FLG = struct.getLOT_CTRL_FLG();
	}


	/**
	 * �R�s�[�R���X�g���N�^
	 */
	 public IssueStruct(IssueStruct struct)
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

	/** ���o�ɔ����敪 �ʏ�o��*/
	public static final int GNR_TYP_DEFAULT			= 21;

	/** ���o�ɔ����敪 �v��O�o��*/
	public static final int GNR_TYP_OUTSIDE_OF_PLAN	= 22;

	/** ���o�ɔ����敪 �ړ��o��*/
	public static final int GNR_TYP_MOVE			= 23;

	/** ���o�ɔ����敪 �U�֏o��*/
	public static final int GNR_TYP_TRANSFER		= 24;

	/** ���o�ɔ����敪 �o�Ɏ��*/
	public static final int GNR_TYP_CANCEL			= 29;

	/** �݌ɍX�V�敪 �X�V��*/
	public static final int UPD_TYP_COMPLETED		= 2;

	/** �f�}���h��ԋ敪 �m��*/
	public static final int DM_STS_TYP_DECIDE		= 2;

	/** �f�}���h��ԋ敪 ����*/
	public static final int DM_STS_TYP_COMPLETED	= 9;

	/** �����݌ɋ敪 �i��*/
	public static final int ALC_STOCK_TYP_ITEM		= 1;

	/** �����݌ɋ敪 ����*/
	public static final int ALC_STOCK_TYP_JOB		= 2;

	/** ���o�Ɋ����t���O ����*/
	public static final int ISSUE_CMPLT_FLG_COMPLETED = 1;
	
	/** ���b�g�Ǘ��t���O ���b�g�Ǘ�*/
	public static final int LOT_CTRL_LOT           = 1;

}
