package com.nec.jp.orteus.metamorBase.common07.UnitCostAppr;


public class UnitCostApprStruct {

	/**
	 * �l�i�[�p�����o�ϐ�
	 */
	public String m_COMPANY_CD = null;  			// ��ЃR�[�h
	
	public String m_STATUS = null; 					// ��ԋ敪

	public String m_PLANT_CD = null; 				// �H��R�[�h

	public String m_RESERVE_CAUSE = null; 			// �ۗ����R

	public String m_PROC_TYP = null; 				// �����敪

	public String m_APPR_REMARKS = null; 			// ���F���l

	public String m_ITEM_CD = null; 				// �i�ڔԍ�

	public String m_ITEM_NAME = null; 				// �i�ږ�

	public String m_VEND_NAME = null; 				// ����於
	
	public String m_VEND_CD = null;  				// �����R�[�h

	public String m_CUST_NAME = null;				// ���Ӑ於
	
	public String m_CUST_CD = null; 				// ���Ӑ�R�[�h
	
	public String m_PROC_NAME = null;				// �i�ڕʍ�Ɩ�
	
	public String m_PROC_CD = null ; 				// �i�ڕʍ�ƃR�[�h

	public String m_EFF_PHASE_IN_DATE = null;		// �L���J�n��

	public String m_UNIT_COST = null;				// �P��
	
	public String m_UNIT_COST_TYP = null; 			// �P���敪

	public String m_PROCESSING_COST = null;			// ���H��

	public String m_MATERIAL_COST = null;			// �ޗ���

	public String m_OTHER_OVERHEADS = null;			// ���̑��o��

	public String m_CUR_NAME = null;				// �ʉݖ�

	public String m_SIZE = null;					// �T�C�Y

	public String m_ONEROUS_FLG = null;				// �L���t���O

	public String m_REQUEST_BY_NAME = null;			// �˗���
	
	public String m_REQUEST_BY = null;				// �˗��҃R�[�h
	
	public String m_APPR_BY = null; 				// ���F��
	
	public String m_CREATED_DATE = null;  			// �쐬��
	
	public String m_CREATED_BY = null;  			// �쐬��
	
	public String m_CREATED_PRG_NM = null; 			// �쐬�v���O������

	public String m_MODIFY_COUNT = null;  			// �X�V��
	
	public String  m_UPDATED_BY = null;				// �X�V��
	
	public String  m_UPDATED_PRG_NM = null;			// �X�V�v���O������
	
	public String  m_UPDATED_DATE = null;			// �V�X�e������
	
	public String  m_SYSDATE = null;				// �V�X�e������
	
	public String  m_PURPOSE_UNIT_PRICE_TYP = null; // �p�r�ʒP���敪
	
	
	/**
	 * �v�f�擾�֐�
	 */
	public String getM_COMPANY_CD() {
		return m_COMPANY_CD;
	}

	public String getM_APPR_REMARKS() {
		return m_APPR_REMARKS;
	}

	public String getM_CUR_NAME() {
		return m_CUR_NAME;
	}

	public String getM_CUST_CD() {
		return m_CUST_CD;
	}

	public String getM_CUST_NAME() {
		return m_CUST_NAME;
	}

	public String getM_EFF_PHASE_IN_DATE() {
		return m_EFF_PHASE_IN_DATE;
	}

	public String getM_ITEM_CD() {
		return m_ITEM_CD;
	}

	public String getM_ITEM_NAME() {
		return m_ITEM_NAME;
	}

	public String getM_MATERIAL_COST() {
		return m_MATERIAL_COST;
	}

	public String getM_MODIFY_COUNT() {
		return m_MODIFY_COUNT;
	}

	public String getM_ONEROUS_FLG() {
		return m_ONEROUS_FLG;
	}

	public String getM_OTHER_OVERHEADS() {
		return m_OTHER_OVERHEADS;
	}

	public String getM_PLANT_CD() {
		return m_PLANT_CD;
	}

	public String getM_PROC_CD() {
		return m_PROC_CD;
	}

	public String getM_PROC_NAME() {
		return m_PROC_NAME;
	}

	public String getM_PROC_TYP() {
		return m_PROC_TYP;
	}

	public String getM_PROCESSING_COST() {
		return m_PROCESSING_COST;
	}

	public String getM_SIZE() {
		return m_SIZE;
	}

	public String getM_REQUEST_BY_NAME() {
		return m_REQUEST_BY_NAME;
	}

	public String getM_RESERVE_CAUSE() {
		return m_RESERVE_CAUSE;
	}

	public String getM_STATUS() {
		return m_STATUS;
	}

	public String getM_UNIT_COST() {
		return m_UNIT_COST;
	}

	public String getM_VEND_CD() {
		return m_VEND_CD;
	}

	public String getM_VEND_NAME() {
		return m_VEND_NAME;
	}
	
	public String getM_UPDATED_DATE() {
		return m_UPDATED_DATE;
	}

	public String getM_UPDATED_BY() {
		return m_UPDATED_BY;
	}

	public String getM_UPDATED_PRG_NM() {
		return m_UPDATED_PRG_NM;
	}

	public String getM_CREATED_BY() {
		return m_CREATED_BY;
	}

	public String getM_CREATED_DATE() {
		return m_CREATED_DATE;
	}

	public String getM_CREATED_PRG_NM() {
		return m_CREATED_PRG_NM;
	}
	
	public String getM_UNIT_COST_TYP() {
		return m_UNIT_COST_TYP;
	}

	public String getM_SYSDATE() {
		return m_SYSDATE;
	}
	public String getM_REQUEST_BY() {
		return m_REQUEST_BY;
	}

	public String getM_APPR_BY() {
		return m_APPR_BY;
	}
	
	public String getM_PURPOSE_UNIT_PRICE_TYP() {
		return m_PURPOSE_UNIT_PRICE_TYP;
	}

	/**
	 * �v�f�ݒ�֐�
	 */
	
	public void setM_UNIT_COST_TYP(String m_unit_cost_typ) {
		m_UNIT_COST_TYP = m_unit_cost_typ;
	}
	
	public void setM_COMPANY_CD(String m_company_cd) {
		m_COMPANY_CD = m_company_cd;
	}

	public void setM_APPR_REMARKS(String m_appr_remarks) {
		m_APPR_REMARKS = m_appr_remarks;
	}

	public void setM_CUR_NAME(String m_cur_name) {
		m_CUR_NAME = m_cur_name;
	}

	public void setM_CUST_CD(String m_cust_cd) {
		m_CUST_CD = m_cust_cd;
	}

	public void setM_CUST_NAME(String m_cust_name) {
		m_CUST_NAME = m_cust_name;
	}

	public void setM_EFF_PHASE_IN_DATE(String m_eff_phase_in_date) {
		m_EFF_PHASE_IN_DATE = m_eff_phase_in_date;
	}

	public void setM_ITEM_CD(String m_item_cd) {
		m_ITEM_CD = m_item_cd;
	}

	public void setM_ITEM_NAME(String m_item_name) {
		m_ITEM_NAME = m_item_name;
	}

	public void setM_MATERIAL_COST(String m_material_cost) {
		m_MATERIAL_COST = m_material_cost;
	}

	public void setM_MODIFY_COUNT(String m_modify_count) {
		m_MODIFY_COUNT = m_modify_count;
	}

	public void setM_ONEROUS_FLG(String m_onerous_flg) {
		m_ONEROUS_FLG = m_onerous_flg;
	}

	public void setM_OTHER_OVERHEADS(String m_other_overheads) {
		m_OTHER_OVERHEADS = m_other_overheads;
	}

	public void setM_PLANT_CD(String m_plant_cd) {
		m_PLANT_CD = m_plant_cd;
	}

	public void setM_PROC_CD(String m_proc_cd) {
		m_PROC_CD = m_proc_cd;
	}

	public void setM_PROC_NAME(String m_proc_name) {
		m_PROC_NAME = m_proc_name;
	}

	public void setM_PROC_TYP(String m_proc_typ) {
		m_PROC_TYP = m_proc_typ;
	}

	public void setM_PROCESSING_COST(String m_processing_cost) {
		m_PROCESSING_COST = m_processing_cost;
	}

	public void setM_SIZE(String m_size) {
		m_SIZE = m_size;
	}

	public void setM_REQUEST_BY_NAME(String m_request_by_name) {
		m_REQUEST_BY_NAME = m_request_by_name;
	}

	public void setM_RESERVE_CAUSE(String m_reserve_cause) {
		m_RESERVE_CAUSE = m_reserve_cause;
	}

	public void setM_STATUS(String m_STATUS) {
		this.m_STATUS = m_STATUS;
	}

	public void setM_UNIT_COST(String m_unit_cost) {
		m_UNIT_COST = m_unit_cost;
	}

	public void setM_VEND_CD(String m_vend_cd) {
		m_VEND_CD = m_vend_cd;
	}

	public void setM_VEND_NAME(String m_vend_name) {
		m_VEND_NAME = m_vend_name;
	}

	public void setM_UPDATED_DATE(String m_update_date) {
		m_UPDATED_DATE = m_update_date;
	}

	public void setM_UPDATED_BY(String m_updated_by) {
		m_UPDATED_BY = m_updated_by;
	}

	public void setM_UPDATED_PRG_NM(String m_updated_prg_nm) {
		m_UPDATED_PRG_NM = m_updated_prg_nm;
	}
	
	public void setM_CREATED_BY(String m_created_by) {
		m_CREATED_BY = m_created_by;
	}

	public void setM_CREATED_DATE(String m_created_date) {
		m_CREATED_DATE = m_created_date;
	}

	public void setM_CREATED_PRG_NM(String m_created_prg_nm) {
		m_CREATED_PRG_NM = m_created_prg_nm;
	}
	
	public void setM_SYSDATE(String m_sysdate) {
		m_SYSDATE = m_sysdate;
	}
	
	public void setM_REQUEST_BY(String m_request_by) {
		m_REQUEST_BY = m_request_by;
	}

	

	public void setM_APPR_BY(String m_appr_by) {
		m_APPR_BY = m_appr_by;
	}

	public void setM_PURPOSE_UNIT_PRICE_TYP(String m_purpose_unit_price_typ) {
		m_PURPOSE_UNIT_PRICE_TYP = m_purpose_unit_price_typ;
	}

	/**
	 * �R���X�g���N�^
	 * 
	 * @param �Ȃ�
	 */
	public UnitCostApprStruct() {
		// ������
		initialize();
		return;
	}

	/**
	 * �����o�ϐ��̃N���A
	 * 
	 * @param �Ȃ�
	 */
	public void clear() {
		m_STATUS = null;
		m_PLANT_CD = null;
		m_RESERVE_CAUSE = null;
		m_PROC_TYP = null;
		m_APPR_REMARKS = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_VEND_NAME = null;
		m_VEND_CD = null;
		m_CUST_NAME = null;
		m_CUST_CD = null;
		m_PROC_NAME = null;
		m_PROC_CD = null;
		m_EFF_PHASE_IN_DATE = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_CUR_NAME = null;
		m_SIZE = null;
		m_ONEROUS_FLG = null;
		m_REQUEST_BY_NAME = null;
		m_MODIFY_COUNT = null;
		m_PURPOSE_UNIT_PRICE_TYP = null;

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 * 
	 * @param �Ȃ�
	 */
	public void finalize() {
		// �N���A
		clear();
		return;
	}

	/**
	 * ������
	 */
	public void initialize() {
		m_STATUS = null;
		m_PLANT_CD = null;
		m_RESERVE_CAUSE = null;
		m_PROC_TYP = null;
		m_APPR_REMARKS = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_VEND_NAME = null;
		m_VEND_CD = null;
		m_CUST_NAME = null;
		m_CUST_CD = null;
		m_PROC_NAME = null;
		m_PROC_CD = null;
		m_EFF_PHASE_IN_DATE = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_CUR_NAME = null;
		m_SIZE = null;
		m_ONEROUS_FLG = null;
		m_REQUEST_BY_NAME = null;
		m_MODIFY_COUNT = null;
		m_PURPOSE_UNIT_PRICE_TYP = null;
	}

	/**
	 * �R�s�[
	 */
	public void copy(UnitCostApprStruct struct) {
		clear();
		if (struct.m_APPR_REMARKS != null)
			m_STATUS = new String(struct.getM_STATUS());
		if (struct.m_PLANT_CD != null)
			m_PLANT_CD = new String(struct.getM_PLANT_CD());
		if (struct.m_RESERVE_CAUSE != null)
			m_RESERVE_CAUSE = new String(struct.getM_RESERVE_CAUSE());
		if (struct.m_PROC_TYP != null)
			m_PROC_TYP = struct.getM_PROC_TYP();
		if (struct.m_ITEM_CD != null)
			m_ITEM_CD = new String(struct.getM_ITEM_CD());
		if (struct.m_ITEM_NAME != null)
			m_ITEM_NAME = new String(struct.getM_ITEM_NAME());
		if (struct.m_VEND_NAME != null)
			m_VEND_NAME = new String(struct.getM_VEND_NAME());
		if (struct.m_VEND_CD != null)
			m_VEND_CD = new String(struct.getM_VEND_CD());
		if (struct.m_CUST_NAME != null)
			m_CUST_NAME = new String(struct.getM_CUST_NAME());
		if (struct.m_CUST_CD != null)
			m_CUST_CD = new String(struct.getM_CUST_CD());
		if (struct.m_PROC_NAME != null)
			m_PROC_NAME = new String(struct.getM_PROC_NAME());
		if (struct.m_PROC_CD != null)
			m_PROC_CD = new String(struct.getM_PROC_CD());
		if (struct.m_EFF_PHASE_IN_DATE != null)
			m_EFF_PHASE_IN_DATE = struct.getM_EFF_PHASE_IN_DATE();
		if (struct.m_UNIT_COST != null)
			m_UNIT_COST = new String(struct.getM_UNIT_COST());
		if (struct.m_PROCESSING_COST != null)
			m_PROCESSING_COST = new String(struct.getM_PROCESSING_COST());
		if (struct.m_MATERIAL_COST != null)
			m_MATERIAL_COST = new String(struct.getM_MATERIAL_COST());
		if (struct.m_OTHER_OVERHEADS != null)
			m_OTHER_OVERHEADS = new String(struct.getM_OTHER_OVERHEADS());
		if (struct.m_CUR_NAME != null)
			m_CUR_NAME = new String(struct.getM_CUR_NAME());
		if (struct.m_SIZE != null)
			m_SIZE = new String(struct.getM_SIZE());
		if (struct.m_ONEROUS_FLG != null)
			m_ONEROUS_FLG = new String(struct.getM_ONEROUS_FLG());
		if (struct.m_REQUEST_BY_NAME != null)
			m_REQUEST_BY_NAME = new String(struct.getM_REQUEST_BY_NAME());
		if (struct.m_MODIFY_COUNT != null)
			m_MODIFY_COUNT = new String(struct.getM_MODIFY_COUNT());
		if (struct.m_PURPOSE_UNIT_PRICE_TYP != null)
			m_PURPOSE_UNIT_PRICE_TYP = new String(struct.getM_PURPOSE_UNIT_PRICE_TYP());
	}

	/**
	 * �R�s�[�R���X�g���N�^
	 */
	public UnitCostApprStruct(UnitCostApprStruct struct) {
		copy(struct);
	}
	
}
