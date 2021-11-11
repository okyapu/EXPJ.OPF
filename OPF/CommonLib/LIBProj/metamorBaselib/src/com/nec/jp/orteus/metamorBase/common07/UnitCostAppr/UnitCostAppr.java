package com.nec.jp.orteus.metamorBase.common07.UnitCostAppr;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

public class UnitCostAppr {

	/**
	 * �f�t�H���g�R���X�g���N�^
	 */
	private UnitCostAppr() {
	}

	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 * 
	 * @param connect
	 *            �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param userCd
	 *            ���O�C�����[�U�̃R�[�h
	 * @param programId
	 *            �v���O����ID
	 */
	public UnitCostAppr(IDbConnection connect, String userCd, String programId,String installFlg) {
		conn = connect;
		this.userCd = userCd;
		this.programId = programId;
		this.jaInstallFlg = installFlg;
	}

	/**
	 * �Ǎ�������main���\�b�h
	 * 
	 * @param plantCd
	 *            �H��R�[�h
	 * @param unitCostApprTyp
	 *            �ΏےP���}�X�^
	 * @param status
	 *            ��ԋ敪
	 * 
	 * @return resultList
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public List selectUnitCostAppr(String plantCd, String unitCostApprTyp, String status) throws SQLException, FoundationException {
		List resultList = null;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);
		switch (Integer.parseInt(unitCostApprTyp)) {
		// �w���P�����F�˗����𒊏o
		case 1:
			resultList = dbAccessor.selectM_PUCH_UNIT_COST_APPR(plantCd, status);
			break;
		// �x���i�P�����F�˗����𒊏o
		case 2:
			resultList = dbAccessor.selectM_CONS_UNIT_COST_APPR(plantCd, status);
			break;
		// �O���P�����F�˗����𒊏o
		case 3:
			resultList = dbAccessor.selectM_SBCNT_UNIT_COST_APPR(plantCd, status);
			break;
		
		case 4:
			// ���i�P�����F�˗����𒊏o
			if("0".equals(jaInstallFlg)){
				resultList = dbAccessor.selectM_UNIT_COST_APPR(status);
			}
			// �̔��P�����F�˗����𒊏o
			else{
				resultList = dbAccessor.selectM_SALES_UNIT_COST_APPR(status);
			}
			break;
		}
		return resultList;
	}

	/**
	 * ���F������main���\�b�h
	 * 
	 * @param unitCostApprTyp
	 *            �ΏےP���}�X�^
	 * @param companyCd
	 *            ��ЃR�[�h
	 * @param plantCd
	 *            �H��R�[�h
	 * @param vendCd
	 *            �����R�[�h
	 * @param itemCd
	 *            �i�ڃR�[�h
	 * @param effPhaseInDate
	 *            �L���J�n��
	 * @param size
	 *            �T�C�Y
	 * @param procCd
	 *            �i�ڍ�ʍ�ƃR�[�h
	 * @param custCd
	 *            ���Ӑ�R�[�h
	 * 
	 * @return nRet �s��
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public int applyUnitCostAppr(int unitCostApprTyp, String companyCd, String plantCd, String vendCd, String itemCd, String purposeUnitPriceTyp, String effPhaseInDate, String size, String procCd, String custCd) throws SQLException, FoundationException {

		int nRet = 0;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);

		UnitCostApprStruct struct = new UnitCostApprStruct();
		// SYSTEM�����̎擾
		struct = dbAccessor.selectSYSDATE(struct);
		struct.setM_COMPANY_CD(companyCd);
		struct.setM_PLANT_CD(plantCd);
		struct.setM_VEND_CD(vendCd);
		struct.setM_ITEM_CD(itemCd);
		struct.setM_PURPOSE_UNIT_PRICE_TYP(purposeUnitPriceTyp);
		struct.setM_EFF_PHASE_IN_DATE(effPhaseInDate);
		struct.setM_SIZE(size);
		struct.setM_PROC_CD(procCd);
		struct.setM_CUST_CD(custCd);
		struct.setM_STATUS("3");
		struct.setM_APPR_BY(userCd);
		struct.setM_CREATED_BY(userCd);
		struct.setM_CREATED_PRG_NM(programId);
		struct.setM_UPDATED_BY(userCd);
		struct.setM_UPDATED_PRG_NM(programId);
		switch (unitCostApprTyp) {
		// �w���P�����F�˗������X�V
		case 1:
			nRet = dbAccessor.updateM_PUCH_UNIT_COST_APPR(struct);
			// �w���P�����F�˗����𒊏o
			struct = dbAccessor.selectM_PUCH_UNIT_COST_APPR_record(struct);
			// �����敪�͓o�^�̏ꍇ
			if ("1".equals(struct.getM_PROC_TYP())) {
				dbAccessor.insertM_PUCH_UNIT_COST(struct);
			}
			// �����敪�͍X�V�̏ꍇ
			if ("2".equals(struct.getM_PROC_TYP())) {
				dbAccessor.updateM_PUCH_UNIT_COST(struct);
			}
			// �����敪�͍폜�̏ꍇ
			if ("3".equals(struct.getM_PROC_TYP())) {
				dbAccessor.deleteM_PUCH_UNIT_COST(struct);
				if(false == dbAccessor.checkM_PUCH_UNIT_COST_H(struct)){
					dbAccessor.deleteM_PUCH_UNIT_COST_H(struct);
				}
			}
			break;
		// �x���i�P�����F�˗������X�V
		case 2:
			nRet = dbAccessor.updateM_CONS_UNIT_COST_APPR(struct);
			// �x���i�P�����F�˗����𒊏o
			struct = dbAccessor.selectM_CONS_UNIT_COST_APPR_record(struct);
			// �����敪�͓o�^�̏ꍇ
			if ("1".equals(struct.getM_PROC_TYP())) {
				dbAccessor.insertM_CONS_UNIT_COST(struct);
			}
			// �����敪�͍X�V�̏ꍇ
			if ("2".equals(struct.getM_PROC_TYP())) {
				dbAccessor.updateM_CONS_UNIT_COST(struct);
			}
			// �����敪�͍폜�̏ꍇ
			if ("3".equals(struct.getM_PROC_TYP())) {
				dbAccessor.deleteM_CONS_UNIT_COST(struct);
			}
			break;
		// �O���P�����F�˗������X�V
		case 3:
			nRet = dbAccessor.updateM_SBCNT_UNIT_COST_APPR(struct);
			// �O���P�����F�˗����𒊏o
			struct = dbAccessor.selectM_SBCNT_UNIT_COST_APPR_record(struct);
			// �����敪�͓o�^�̏ꍇ
			if ("1".equals(struct.getM_PROC_TYP())) {
				dbAccessor.insertM_SBCNT_UNIT_COST(struct);
			}
			// �����敪�͍X�V�̏ꍇ
			if ("2".equals(struct.getM_PROC_TYP())) {
				dbAccessor.updateM_SBCNT_UNIT_COST(struct);
			}
			// �����敪�͍폜�̏ꍇ
			if ("3".equals(struct.getM_PROC_TYP())) {
				dbAccessor.deleteM_SBCNT_UNIT_COST(struct);
				if(false == dbAccessor.checkM_SBCNT_UNIT_COST_H(struct)){
					dbAccessor.deleteM_SBCNT_UNIT_COST_H(struct);
				}
			}
			break;
		// ���i�P�����F�˗������X�V
		case 4:
			// Explanner/J�̏ꍇ
			if("0".equals(jaInstallFlg)){
				nRet = dbAccessor.updateM_UNIT_COST_APPR(struct);
				// ���i�P�����F�˗����𒊏o
				struct = dbAccessor.selectM_UNIT_COST_APPR_record(struct);
				// �����敪�͓o�^�̏ꍇ
				if ("1".equals(struct.getM_PROC_TYP())) {
					dbAccessor.insertM_UNIT_COST(struct);
				}
				// �����敪�͍X�V�̏ꍇ
				if ("2".equals(struct.getM_PROC_TYP())) {
					dbAccessor.updateM_UNIT_COST(struct);
				}
				// �����敪�͍폜�̏ꍇ
				if ("3".equals(struct.getM_PROC_TYP())) {
					dbAccessor.deleteM_UNIT_COST(struct);
				}
			}else{// Explanner/Ja�̏ꍇ
				nRet = dbAccessor.updateM_SALES_UNIT_COST_APPR(struct);
				// �̔��P�����F�˗����𒊏o
				struct = dbAccessor.selectM_SALES_UNIT_COST_APPR_record(struct);
				// �����敪�͓o�^�̏ꍇ
				if ("1".equals(struct.getM_PROC_TYP())) {
					dbAccessor.insertM_SALES_UNIT_COST(struct);
				}
				// �����敪�͍X�V�̏ꍇ
				if ("2".equals(struct.getM_PROC_TYP())) {
					dbAccessor.updateM_SALES_UNIT_COST(struct);
				}
				// �����敪�͍폜�̏ꍇ
				if ("3".equals(struct.getM_PROC_TYP())) {
					dbAccessor.deleteM_SALES_UNIT_COST(struct);
				}
			}
			
			break;

		}
		return nRet;
	}

	/**
	 * �ۗ�������main���\�b�h
	 * 
	 * @param unitCostApprTyp  �ΏےP���}�X�^
	 * @param companyCd  ��ЃR�[�h
	 * @param plantCd  �H��R�[�h
	 * @param vendCd  �����R�[�h
	 * @param itemCd  �i�ڃR�[�h
	 * @param effPhaseInDate  �L���J�n��
	 * @param size  �T�C�Y
	 * @param procCd  �i�ڍ�ʍ�ƃR�[�h
	 * @param custCd  ���Ӑ�R�[�h
	 * 
	 * @param reserveCause  �ۗ����R
	 * @return nRet  �s��
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public int reserveUnitCostAppr(int unitCostApprTyp, String companyCd, String plantCd, String vendCd, String itemCd, String purposeUnitPriceTyp, String effPhaseInDate, String size, String procCd, String custCd, String reserveCause) throws SQLException, FoundationException {

		int nRet = 0;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);
		UnitCostApprStruct struct = new UnitCostApprStruct();
		// SYSTEM�����̎擾
		struct = dbAccessor.selectSYSDATE(struct);
		struct.setM_COMPANY_CD(companyCd);
		struct.setM_PLANT_CD(plantCd);
		struct.setM_VEND_CD(vendCd);
		struct.setM_ITEM_CD(itemCd);
		struct.setM_PURPOSE_UNIT_PRICE_TYP(purposeUnitPriceTyp);
		struct.setM_EFF_PHASE_IN_DATE(effPhaseInDate);
		struct.setM_SIZE(size);
		struct.setM_PROC_CD(procCd);
		struct.setM_CUST_CD(custCd);
		struct.setM_RESERVE_CAUSE(reserveCause);
		struct.setM_STATUS("2"); // ��ԋ敪�͂Q�F�ۗ�
		struct.setM_APPR_BY(userCd);
		struct.setM_UPDATED_BY(userCd);
		struct.setM_UPDATED_PRG_NM(programId);
		switch (unitCostApprTyp) {
		// �w���P�����F�˗�����ۗ�
		case 1:
			nRet = dbAccessor.updateM_PUCH_UNIT_COST_APPR(struct);
			break;
		// �x���i�P�����F�˗�����ۗ�
		case 2:
			nRet = dbAccessor.updateM_CONS_UNIT_COST_APPR(struct);
			break;
		// �O���P�����F�˗�����ۗ�
		case 3:
			nRet = dbAccessor.updateM_SBCNT_UNIT_COST_APPR(struct);
			break;
		// ���i�P�����F�˗�����ۗ�
		case 4:
			// Explanner/J�̏ꍇ
			if("0".equals(jaInstallFlg)){
				nRet = dbAccessor.updateM_UNIT_COST_APPR(struct);
			}else{// Explanner/Ja�̏ꍇ
				nRet = dbAccessor.updateM_SALES_UNIT_COST_APPR(struct);
			}
			
			break;

		}
		return nRet;
	}

	/**
	 * �ۗ�����������main���\�b�h
	 * 
	 * @param unitCostApprTyp  �ΏےP���}�X�^
	 * @param companyCd  ��ЃR�[�h
	 * @param plantCd  �H��R�[�h
	 * @param vendCd  �����R�[�h
	 * @param itemCd  �i�ڃR�[�h
	 * @param effPhaseInDate  �L���J�n��
	 * @param size  �T�C�Y
	 * @param procCd  �i�ڍ�ʍ�ƃR�[�h
	 * @param custCd  ���Ӑ�R�[�h
	 * 
	 * @return nRet  �s��
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public int nreserveUnitCostAppr(int unitCostApprTyp,String companyCd, String plantCd, String vendCd, String itemCd, String purposeUnitPriceTyp, String effPhaseInDate, String size, String procCd, String custCd) throws SQLException, FoundationException {

		int nRet = 0;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);
		UnitCostApprStruct struct = new UnitCostApprStruct();
		// SYSTEM�����̎擾
		struct = dbAccessor.selectSYSDATE(struct);
		struct.setM_COMPANY_CD(companyCd);
		struct.setM_PLANT_CD(plantCd);
		struct.setM_VEND_CD(vendCd);
		struct.setM_ITEM_CD(itemCd);
		struct.setM_PURPOSE_UNIT_PRICE_TYP(purposeUnitPriceTyp);
		struct.setM_EFF_PHASE_IN_DATE(effPhaseInDate);
		struct.setM_SIZE(size);
		struct.setM_PROC_CD(procCd);
		struct.setM_CUST_CD(custCd);
		struct.setM_STATUS("1");
		struct.setM_UPDATED_BY(userCd);
		struct.setM_UPDATED_PRG_NM(programId);
		switch (unitCostApprTyp) {
		// �w���P�����F�˗�����ۗ�����
		case 1:
			nRet = dbAccessor.updateM_PUCH_UNIT_COST_APPR(struct);
			break;
		// �x���i�P�����F�˗�����ۗ�����
		case 2:
			nRet = dbAccessor.updateM_CONS_UNIT_COST_APPR(struct);
			break;
		// �O���P�����F�˗�����ۗ�����
		case 3:
			nRet = dbAccessor.updateM_SBCNT_UNIT_COST_APPR(struct);
			break;
		// ���i�P�����F�˗�����ۗ�����
		case 4:
			// Explanner/J�̏ꍇ
			if("0".equals(jaInstallFlg)){
				nRet = dbAccessor.updateM_UNIT_COST_APPR(struct);
			}else{// Explanner/Ja�̏ꍇ
				nRet = dbAccessor.updateM_SALES_UNIT_COST_APPR(struct);
			}

		}
		return nRet;
	}

	/** String�v�Z�����N���X */
	protected Calculate _calc;

	/** �P�����F�����R�l�N�V�����N���X */
	protected IDbConnection conn;

	/** ���[�U�R�[�h */
	protected String userCd;

	/** �v���O����ID */
	protected String programId;

	/** �G���[���b�Z�[�W�i�[���X�g */
	protected ArrayList errorList = new ArrayList();
	
	/** Ja�̔��Ǘ��𓱓��t���O */
	protected String jaInstallFlg ;

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return �G���[���X�g
	 */
	public ArrayList getErrorList() {
		return errorList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * 
	 * @param ���b�Z�[�W���X�g
	 */
	public void setErrorList(ArrayList list) {
		errorList = list;
	}

	/** ��񃁃b�Z�[�W�i�[���X�g */
	protected ArrayList infoList = new ArrayList();

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return info���X�g
	 */
	public ArrayList getInfoList() {
		return infoList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * 
	 * @param ���b�Z�[�W���X�g
	 */
	public void setInfoList(ArrayList list) {
		infoList = list;
	}

	/** �x�����b�Z�[�W�i�[���X�g */
	protected ArrayList warnList = new ArrayList();

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return warn���X�g
	 */
	public ArrayList getWarnList() {
		return warnList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * 
	 * @param ���b�Z�[�W���X�g
	 */
	public void setWarnList(ArrayList list) {
		warnList = list;
	}

}
