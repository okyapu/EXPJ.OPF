/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/lot/OrderHeader.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.lot;

import java.util.*;
import java.math.*;

import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * <pre>
 * �󒍃w�b�_�p�̃f�[�^�N���X
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.1 $
 *
 **/

public class OrderHeader
{
	/** �����敪�@*/
	public static final BigDecimal PROC_DIV_REG = BigDecimal.valueOf(1);    	// �����敪 1�i�o�^�j
	public static final BigDecimal PROC_DIV_UPD = BigDecimal.valueOf(2);     	// �����敪 2�i�X�V�j
	public static final BigDecimal PROC_DIV_DEL = BigDecimal.valueOf(3);     	// �����敪 3�i�폜�j

	public static final BigDecimal EXC_DIV_VAL  = BigDecimal.valueOf(1);     	// ���s�敪 1�i�m�F�j
	public static final BigDecimal EXC_DIV_EXC  = BigDecimal.valueOf(2);		// ���s�敪 2�i���s�j

	
	//-------------------------------------------------------------------------
	// �l�i�[�p�����o�ϐ�
	//-------------------------------------------------------------------------
	/** ��ЃR�[�h */
	private String  m_COMPANY_CD = null;
	/** �󒍓`�[�ԍ� */
	private String  m_ORDER_H_NO = null;
	/** �`�[�敪 */
	private BigDecimal m_SLIP_TYP = null;
	/** �����v��敪 */
	private BigDecimal  m_AUTO_APP_TYP = null;
	/** �󒍓� */
	private Date  m_ODR_DATE = null;
	/** �c�ƒS������R�[�h */
	private String  m_CUST_CHRG_ORG_CD = null;
	/** �c�ƒS�����喼 */
	private String  m_CUST_CHRG_ORG_NAME = null;
	/** �c�ƒS���҃R�[�h */
	private String  m_CUST_CHRG_PSN_CD = null;
	/** �c�ƒS���Җ� */
	private String  m_CUST_CHRG_PSN_NAME = null;
	/** ���s�S���ҕ���R�[�h */
	private String  m_ODR_ACPT_ORG_CD =null;
	/** ���s�S���ҕ��喼 */
	private String  m_ODR_ACPT_ORG_NAME =null;
	/** ���s�S���҃R�[�h */
	private String  m_ODR_ACPT_PSN_CD = null;
	/** ���s�S���Җ� */
	private String  m_ODR_ACPT_PSN_NAME = null;
	/** �ʉ݃R�[�h */
	private String  m_CURRNCY_CD = null;
	/** �ב֎�� */
	private BigDecimal  m_EXCH_TYP = null;
	/** ���͕��@ */
	private BigDecimal m_INPUT_TYP = null;
	/** ���Ӑ�R�[�h */
	private String  m_CUST_CD = null;
	/** ���Ӑ於 */
	private String  m_CUST_NAME = null;
	/** ���Ӑ於���� */
	private String  m_CUST_ANAME = null;
	/** ���Ӑ�S���� */
	private String  m_CUST_PSN = null;
	/** ������R�[�h */
	private String  m_BILL_ADDRESSEE_CD = null;
	/** �����於 */
	private String  m_BILL_ADDRESSEE_NAME = null;
	/** �[�i�ꏊ�R�[�h */
	private String  m_DLV_LOC_CD = null;
	/** �[�i�ꏊ�� */
	private String  m_DLV_LOC_NAME = null;
	/** �[�i�ꏊ���i�J�i�j */
	private String  m_DLV_LOC_KNAME = null;
	/** �[�i�ꏊ���i�p���j */
	private String  m_DLV_LOC_ENAME = null;
	/** �[�i�ꏊ�X�֔ԍ� */
	private String  m_DLV_LOC_ZIP_CD = null;
	/** �[�i�ꏊ�Z���P */
	private String  m_DLV_LOC_ADDRESS_1 = null;
	/** �[�i�ꏊ�Z���Q */
	private String  m_DLV_LOC_ADDRESS_2 = null;
	/** �[�i�ꏊ�Z���i�J�i�j�P */
	private String  m_DLV_LOC_ADDRESS_K_1 = null;
	/** �[�i�ꏊ�Z���i�J�i�j�Q */
	private String  m_DLV_LOC_ADDRESS_K_2 = null;
	/** �[�i�ꏊ�d�b�ԍ� */
	private String  m_DLV_LOC_TEL = null;
	/** �[�i�ꏊ�e�`�w�ԍ� */
	private String  m_DLV_LOC_FAX = null;
	/** �o�בq�ɃR�[�h */
	private String  m_SHIP_WH_CD = null;
	/** �o�בq�ɖ� */
	private String  m_SHIP_WH_NAME = null;
	/** �o�׎w��� */
	private Date  m_DESINATED_SHIP_DATE = null;
	/** �w��[�� */
	private Date  m_DESINATED_DLV_DATE = null;
	/** �^���փR�[�h */
	private String  m_TRANSPORT_CD = null;
	/** �^���֖� */
	private String  m_TRANSPORT_NAME = null;
	/** �[���\��֔ԍ� */
	private BigDecimal  m_CUST_DLV_PLAN_TRANS_NO = null;
	/** �����敪 */
	private BigDecimal  m_INSPC_ACPT_TYP = null;
	/** �{�̋��z�v */
	private BigDecimal  m_ODR_AMOUNT_SUM = null;
	/** ����ō��v */
	private BigDecimal  m_ODR_TAX_SUM = null;
	/** �󒍍��v���z */
	private BigDecimal  m_ODR_TAX_AMOUNT_SUM = null;
	/** ���Ӑ撍���ԍ� */
	private String  m_CUST_ODR_NO = null;
	/** �`�[������R�R�[�h */
	private String  m_ODR_H_CANCEL_CAUSE_CD = null;
	/** �`�[�E�v */
	private String  m_SLIP_REMARKS = null;
	/** �X�V�� */
	private BigDecimal  m_MODIFY_COUNT = null;
	/** �����敪 */
	private BigDecimal  m_PROC_DIV = null;
	/** ���s�敪 */
	private BigDecimal  m_EXC_DIV = null;
	/** �G���[�ԍ� */
	private String  m_ERROR_NO = null;
	/** �����T�C�N�� */
	private BigDecimal m_CLAIM_CYCLE_TYP = null;
	
	private List m_OrderLines = null;

	//-------------------------------------------------------------------------
	// �v�f�擾�֐�
	//-------------------------------------------------------------------------
	/** ��ЃR�[�h */
	public String  companyCd() { return m_COMPANY_CD; }
	/** �󒍓`�[�ԍ� */
	public String  orderHNo() { return m_ORDER_H_NO; }
	/** �`�[�敪 */
	public BigDecimal slipType() {return m_SLIP_TYP; }
	/** �����v��敪 */
	public BigDecimal autoAppType() {return m_AUTO_APP_TYP; }
	/** �󒍓� */
	public Date  orderDate() { return m_ODR_DATE; }
	/** ���Ӑ�R�[�h */
	public String  custCd() { return m_CUST_CD; }
	/** �[�i�ꏊ�R�[�h*/
	public String  dlvLocCd() { return m_DLV_LOC_CD; }
	/** ������R�[�h*/
	public String  billAddresseeCd() { return m_BILL_ADDRESSEE_CD; }
	/** �^���փR�[�h*/
	public String  transPortCd() { return m_TRANSPORT_CD; }
	/** �o�בq�ɃR�[�h*/
	public String  shipWhCd() { return m_SHIP_WH_CD ;}
	/** �c�ƒS������R�[�h*/
	public String  custChrgOrgCd() { return m_CUST_CHRG_ORG_CD; }
	/** �c�ƒS���҃R�[�h*/
	public String  custChrgPsnCd() { return m_CUST_CHRG_PSN_CD; }
	/** ���s�S���ҕ���R�[�h */
	public String  acptOrgCd() { return m_ODR_ACPT_ORG_CD; }
	/** ���s�S���҃R�[�h*/
	public String  acptPsnCd() { return m_ODR_ACPT_PSN_CD; }
	/** ���Ӑ於 */
	public String custName() { return m_CUST_NAME; }
	/** ���Ӑ於���� */
	public String custAName() { return m_CUST_ANAME; }
	/** ���Ӑ�S���� */
	public String custPsn() { return m_CUST_PSN; }
	/** �����於 */
	public String billAddresseeName() { return m_BILL_ADDRESSEE_NAME; }
	/** �[�i�ꏊ���@*/
	public String dlvLocName() { return m_DLV_LOC_NAME; }
	/** �[�i�ꏊ���i�J�i�j */
	public String dlvLocKName() { return m_DLV_LOC_KNAME; }
	/** �[�i�ꏊ���i�p���j */
	public String dlvLocEName() { return m_DLV_LOC_ENAME; }
	/** �[�i�ꏊ�X�֔ԍ� */
	public String dlvLocZipCd() { return m_DLV_LOC_ZIP_CD; }
	/** �[�i�ꏊ�Z���P */
	public String dlvLocAddress1() { return m_DLV_LOC_ADDRESS_1; }
	/** �[�i�ꏊ�Z���Q */
	public String dlvLocAddress2() { return m_DLV_LOC_ADDRESS_2; }
	/** �[�i�ꏊ�Z���i�J�i�j�P */
	public String dlvLocAddressK1() { return m_DLV_LOC_ADDRESS_K_1; }
	/** �[�i�ꏊ�Z���i�J�i�j�Q */
	public String dlvLocAddressK2() { return m_DLV_LOC_ADDRESS_K_2; }
	/** �[�i�ꏊ�d�b�ԍ� */
	public String dlvLocTel() { return m_DLV_LOC_TEL; }
	/** �[�i�ꏊ�e�`�w�ԍ� */
	public String dlvLocFax() { return m_DLV_LOC_FAX; }
	/** �o�בq�ɖ� */
	public String shipWhName() { return m_SHIP_WH_NAME; }
	/** �^���֖� */
	public String transPortName() { return m_TRANSPORT_NAME; }
	/** �c�ƒS�����喼 */
	public String custChrgOrgName() { return m_CUST_CHRG_ORG_NAME; }
	/** �c�ƒS���҃R�[�h */
	public String custChrgPsnName() { return m_CUST_CHRG_PSN_NAME; }
	/** ���s�S���ҕ��喼 */
	public String acptOrgName() { return m_ODR_ACPT_ORG_NAME; }
	/** ���s�S���Җ� */
	public String acptPsnName() { return m_ODR_ACPT_PSN_NAME; }
	/** �ʉ݃R�[�h */
	public String currncyCd() { return m_CURRNCY_CD; }
	/** �����敪 */
	public BigDecimal inspcAcptTyp() { return m_INSPC_ACPT_TYP; }
	/** �ב֎�� */
	public BigDecimal ExchTyp() { return m_EXCH_TYP; }
	/** �{�̋��z�v */
	public BigDecimal amountSum() { return m_ODR_AMOUNT_SUM; }
	/** ����ō��v */
	public BigDecimal taxSum() { return m_ODR_TAX_SUM; }
	/** �󒍍��v���z(�ō�) */
	public BigDecimal taxAmountSum() { return m_ODR_TAX_AMOUNT_SUM; }
	/** ���͕��@ */
	public BigDecimal  inputTyp() {  return m_INPUT_TYP; }
	/** �w��[�� */
	public Date  desinatedDlvDate() {  return m_DESINATED_DLV_DATE; }
	/** �o�׎w��� */
	public Date  desinatedShipDate() {  return m_DESINATED_SHIP_DATE; }
	/** �[���\��֔ԍ� */
	public BigDecimal  custDlvPlanTransNo() {  return m_CUST_DLV_PLAN_TRANS_NO; }
	/** ���Ӑ撍���ԍ� */
	public String  custOdrNo() {  return m_CUST_ODR_NO; }
	/** �`�[�E�v */
	public String  slipRemarks() {  return m_SLIP_REMARKS; }
	/** �`�[������R�R�[�h */
	public String  cancelCauseCd() {  return m_ODR_H_CANCEL_CAUSE_CD; }
	/** �X�V�� */
	public BigDecimal  modifyCount() {  return m_MODIFY_COUNT; }
	/** �����敪 */
	public BigDecimal  procDiv() {  return m_PROC_DIV; }
	/** ���s�敪 */
	public BigDecimal  excDiv() {  return m_EXC_DIV; }
	/** �G���[�ԍ� */
	public String  errorNo() {  return m_ERROR_NO; }
	/** �����T�C�N�� */
	public BigDecimal  claimCycleTyp() {  return m_CLAIM_CYCLE_TYP; }
	/** �󒍖��׃��X�g */
	public List  orderLines() {  return m_OrderLines; }
	
	//-------------------------------------------------------------------------
	// �v�f�ݒ�֐�
	//-------------------------------------------------------------------------
	/** ��ЃR�[�h */
	public void  companyCd(String val) {m_COMPANY_CD = val; }
	/** �󒍓`�[�ԍ� */
	public void orderHNo(String val) { m_ORDER_H_NO = val; }
	/** �`�[�敪 */
	public void  slipType(BigDecimal val) {m_SLIP_TYP= val; }
	/** �����v��敪 */
	public void  autoAppType(BigDecimal val) {m_AUTO_APP_TYP= val; }
	/** �󒍓� */
	public void  orderDate(Date val) { m_ODR_DATE= val; }
	/** ���Ӑ�R�[�h */
	public void custCd(String val) { m_CUST_CD = val; }
	/** �[�i�ꏊ�R�[�h */
	public void dlvLocCd(String val) { m_DLV_LOC_CD = val; }
	/** ������R�[�h */
	public void billAddresseeCd(String val) { m_BILL_ADDRESSEE_CD = val; }
	/** �o�בq�ɃR�[�h */
	public void shipWhCd(String val) { m_SHIP_WH_CD = val; }
	/** �^���փR�[�h */
	public void transPortCd(String val) { m_TRANSPORT_CD = val; }
	/** �c�ƒS������R�[�h */
	public void custChrgOrgCd(String val) { m_CUST_CHRG_ORG_CD = val; }
	/** �c�ƒS���҃R�[�h */
	public void custChrgPsnCd(String val) { m_CUST_CHRG_PSN_CD = val; }
	/** ���s�S���ҕ���R�[�h */
	public void acptOrgCd(String val) { m_ODR_ACPT_ORG_CD = val; }
	/** ���s�S���҃R�[�h */
	public void acptPsnCd(String val) { m_ODR_ACPT_PSN_CD = val; }
	/** ���͕��@ */
	public void  inputTyp(BigDecimal val) {  m_INPUT_TYP= val; }
	/** �w��[�� */
	public void  desinatedDlvDate(Date val) {  m_DESINATED_DLV_DATE= val; }
	/** �o�׎w��� */
	public void  desinatedShipDate(Date val) {  m_DESINATED_SHIP_DATE= val; }
	/** �[���\��֔ԍ� */
	public void  custDlvPlanTransNo(BigDecimal val) {  m_CUST_DLV_PLAN_TRANS_NO= val; }
	/** ���Ӑ撍���ԍ� */
	public void  custOdrNo(String val) {  m_CUST_ODR_NO= val; }
	/** �`�[�E�v */
	public void  slipRemarks(String val) {  m_SLIP_REMARKS= val; }
	/** �`�[������R�R�[�h */
	public void  cancelCauseCd(String val) {  m_ODR_H_CANCEL_CAUSE_CD= val; }
	/** �X�V�� */
	public void  modifyCount(BigDecimal val) {  m_MODIFY_COUNT= val; }
	/** �����敪 */
	public void  procDiv(BigDecimal val) {  m_PROC_DIV= val; }
	/** ���s�敪 */
	public void  excDiv(BigDecimal val) {  m_EXC_DIV= val; }
	/** �G���[�ԍ� */
	public void  errorNo(String val) {  m_ERROR_NO= val; }
	
	/** ���Ӑ於 */
	public void custName(String val) { m_CUST_NAME = val; }
	/** ���Ӑ於���� */
	public void custAName(String val) { m_CUST_ANAME = val; }
	/** ���Ӑ�S���� */
	public void custPsn(String val) {  m_CUST_PSN = val; }
	/** �����於 */
	public void billAddresseeName(String val) {  m_BILL_ADDRESSEE_NAME = val; }
	/** �[�i�ꏊ���@*/
	public void dlvLocName(String val) {  m_DLV_LOC_NAME = val; }
	/** �[�i�ꏊ���i�J�i�j */
	public void dlvLocKName(String val) {  m_DLV_LOC_KNAME = val; }
	/** �[�i�ꏊ���i�p���j */
	public void dlvLocEName(String val) {  m_DLV_LOC_ENAME = val; }
	/** �[�i�ꏊ�X�֔ԍ� */
	public void dlvLocZipCd(String val) {  m_DLV_LOC_ZIP_CD = val; }
	/** �[�i�ꏊ�Z���P */
	public void dlvLocAddress1(String val) {  m_DLV_LOC_ADDRESS_1 = val; }
	/** �[�i�ꏊ�Z���Q */
	public void dlvLocAddress2(String val) {  m_DLV_LOC_ADDRESS_2 = val; }
	/** �[�i�ꏊ�Z���i�J�i�j�P */
	public void dlvLocAddressK1(String val) {  m_DLV_LOC_ADDRESS_K_1 = val; }
	/** �[�i�ꏊ�Z���i�J�i�j�Q */
	public void dlvLocAddressK2(String val) {  m_DLV_LOC_ADDRESS_K_2 = val; }
	/** �[�i�ꏊ�d�b�ԍ� */
	public void dlvLocTel(String val) {  m_DLV_LOC_TEL = val; }
	/** �[�i�ꏊ�e�`�w�ԍ� */
	public void dlvLocFax(String val) {  m_DLV_LOC_FAX = val; }
	/** �o�בq�ɖ� */
	public void shipWhName(String val) {  m_SHIP_WH_NAME = val; }
	/** �^���֖� */
	public void transPortName(String val) {  m_TRANSPORT_NAME = val; }
	/** �c�ƒS�����喼 */
	public void custChrgOrgName(String val) {  m_CUST_CHRG_ORG_NAME = val; }
	/** �c�ƒS���҃R�[�h */
	public void custChrgPsnName(String val) {  m_CUST_CHRG_PSN_NAME = val; }
	/** ���s�S���ҕ��喼 */
	public void acptOrgName(String val) {  m_ODR_ACPT_ORG_NAME = val; }
	/** ���s�S���Җ� */
	public void acptPsnName(String val) {  m_ODR_ACPT_PSN_NAME = val; }
	/** �ʉ݃R�[�h */
	public void currncyCd(String val) {  m_CURRNCY_CD = val; }
	/** �����敪 */
	public void inspcAcptTyp(BigDecimal val) {  m_INSPC_ACPT_TYP = val; }
	/** �ב֎�� */
	public void exchTyp(BigDecimal val) {  m_EXCH_TYP = val; }
	/** �{�̋��z�v */
	public void amountSum(BigDecimal val) {  m_ODR_AMOUNT_SUM = val; }
	/** ����ō��v */
	public void taxSum(BigDecimal val) {  m_ODR_TAX_SUM = val; }
	/** �󒍍��v���z(�ō�) */
	public void taxAmountSum(BigDecimal val) {  m_ODR_TAX_AMOUNT_SUM = val; }
	/** �󒍖��׏�� */
	public void orderLines(List val) {  m_OrderLines = val; }
	/** �ʉ݃R�[�h */
	public void claimCycleTyp(BigDecimal val) {  m_CLAIM_CYCLE_TYP = val; }
	/**
	 * �R���X�g���N�^
	 *
	 * @param �Ȃ�
	 */
	public OrderHeader()
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
		/** ��ЃR�[�h */
		m_COMPANY_CD = null;
		
		/** �󒍓`�[�ԍ� */
		m_ORDER_H_NO = null;
		
		/** �`�[�敪 */
		m_SLIP_TYP = null;
		
		/** �����v��敪 */
		m_AUTO_APP_TYP = null;
		
		/** �󒍓� */
		m_ODR_DATE = null;
		
		/** �c�ƒS������R�[�h */
		m_CUST_CHRG_ORG_CD = null;
		
		/** �c�ƒS�����喼 */
		m_CUST_CHRG_ORG_NAME = null;
		
		/** �c�ƒS���҃R�[�h */
		m_CUST_CHRG_PSN_CD = null;
		
		/** �c�ƒS���Җ� */
		m_CUST_CHRG_PSN_NAME = null;
		
		/** ���s�S���ҕ���R�[�h */
		m_ODR_ACPT_ORG_CD =null;
		
		/** ���s�S���ҕ��喼 */
		m_ODR_ACPT_ORG_NAME =null;
		
		/** ���s�S���҃R�[�h */
		m_ODR_ACPT_PSN_CD = null;
		
		/** ���s�S���Җ� */
		m_ODR_ACPT_PSN_NAME = null;
		
		/** �ʉ݃R�[�h */
		m_CURRNCY_CD = null;
		
		/** �ב֎�� */
		m_EXCH_TYP = null;
		
		/** ���͕��@ */
		m_INPUT_TYP = null;
		
		/** ���Ӑ�R�[�h */
		m_CUST_CD = null;
		
		/** ���Ӑ於 */
		m_CUST_NAME = null;
		
		/** ���Ӑ於���� */
		m_CUST_ANAME = null;
		
		/** ���Ӑ�S���� */
		m_CUST_PSN = null;
		
		/** ������R�[�h */
		m_BILL_ADDRESSEE_CD = null;
		
		/** �����於 */
		m_BILL_ADDRESSEE_NAME = null;
		
		/** �[�i�ꏊ�R�[�h */
		m_DLV_LOC_CD = null;
		
		/** �[�i�ꏊ�� */
		m_DLV_LOC_NAME = null;
		
		/** �[�i�ꏊ���i�J�i�j */
		m_DLV_LOC_KNAME = null;
		
		/** �[�i�ꏊ���i�p���j */
		m_DLV_LOC_ENAME = null;
		
		/** �[�i�ꏊ�X�֔ԍ� */
		m_DLV_LOC_ZIP_CD = null;
		
		/** �[�i�ꏊ�Z���P */
		m_DLV_LOC_ADDRESS_1 = null;
		
		/** �[�i�ꏊ�Z���Q */
		m_DLV_LOC_ADDRESS_2 = null;
		
		/** �[�i�ꏊ�Z���i�J�i�j�P */
		m_DLV_LOC_ADDRESS_K_1 = null;
		
		/** �[�i�ꏊ�Z���i�J�i�j�Q */
		m_DLV_LOC_ADDRESS_K_2 = null;
		
		/** �[�i�ꏊ�d�b�ԍ� */
		m_DLV_LOC_TEL = null;
		
		/** �[�i�ꏊ�e�`�w�ԍ� */
		m_DLV_LOC_FAX = null;
		
		/** �o�בq�ɃR�[�h */
		m_SHIP_WH_CD = null;
		
		/** �o�בq�ɖ� */
		m_SHIP_WH_NAME = null;
		
		/** �o�׎w��� */
		m_DESINATED_SHIP_DATE = null;
		
		/** �w��[�� */
		m_DESINATED_DLV_DATE = null;
		
		/** �^���փR�[�h */
		m_TRANSPORT_CD = null;
		
		/** �^���֖� */
		m_TRANSPORT_NAME = null;
		
		/** �[���\��֔ԍ� */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		
		/** �����敪 */
		m_INSPC_ACPT_TYP = null;
		
		/** �{�̋��z�v */
		m_ODR_AMOUNT_SUM = null;
		
		/** ����ō��v */
		m_ODR_TAX_SUM = null;
		
		/** �󒍍��v���z */
		m_ODR_TAX_AMOUNT_SUM = null;
		
		/** ���Ӑ撍���ԍ� */
		m_CUST_ODR_NO = null;
		
		/** �`�[������R�R�[�h */
		m_ODR_H_CANCEL_CAUSE_CD = null;
		
		/** �`�[�E�v */
		m_SLIP_REMARKS = null;
		
		/** �X�V�� */
		m_MODIFY_COUNT = null;
		
		/** �����敪 */
		m_PROC_DIV = null;
		
		/** ���s�敪 */
		m_EXC_DIV = null;
		
		/** �G���[�ԍ� */
		m_ERROR_NO = null;
		
		/** �󒍖��׏�� */
		m_OrderLines = null;

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
		/** ��ЃR�[�h */
		m_COMPANY_CD = null;
		
		/** �󒍓`�[�ԍ� */
		m_ORDER_H_NO = null;
		
		/** �`�[�敪 */
		m_SLIP_TYP = null;
		
		/** �����v��敪 */
		m_AUTO_APP_TYP = null;
		
		/** �󒍓� */
		m_ODR_DATE = null;
		
		/** �c�ƒS������R�[�h */
		m_CUST_CHRG_ORG_CD = null;
		
		/** �c�ƒS�����喼 */
		m_CUST_CHRG_ORG_NAME = null;
		
		/** �c�ƒS���҃R�[�h */
		m_CUST_CHRG_PSN_CD = null;
		
		/** �c�ƒS���Җ� */
		m_CUST_CHRG_PSN_NAME = null;
		
		/** ���s�S���ҕ���R�[�h */
		m_ODR_ACPT_ORG_CD =null;
		
		/** ���s�S���ҕ��喼 */
		m_ODR_ACPT_ORG_NAME =null;
		
		/** ���s�S���҃R�[�h */
		m_ODR_ACPT_PSN_CD = null;
		
		/** ���s�S���Җ� */
		m_ODR_ACPT_PSN_NAME = null;
		
		/** �ʉ݃R�[�h */
		m_CURRNCY_CD = null;
		
		/** �ב֎�� */
		m_EXCH_TYP = null;
		
		/** ���͕��@ */
		m_INPUT_TYP = null;
		
		/** ���Ӑ�R�[�h */
		m_CUST_CD = null;
		
		/** ���Ӑ於 */
		m_CUST_NAME = null;
		
		/** ���Ӑ於���� */
		m_CUST_ANAME = null;
		
		/** ���Ӑ�S���� */
		m_CUST_PSN = null;
		
		/** ������R�[�h */
		m_BILL_ADDRESSEE_CD = null;
		
		/** �����於 */
		m_BILL_ADDRESSEE_NAME = null;
		
		/** �[�i�ꏊ�R�[�h */
		m_DLV_LOC_CD = null;
		
		/** �[�i�ꏊ�� */
		m_DLV_LOC_NAME = null;
		
		/** �[�i�ꏊ���i�J�i�j */
		m_DLV_LOC_KNAME = null;
		
		/** �[�i�ꏊ���i�p���j */
		m_DLV_LOC_ENAME = null;
		
		/** �[�i�ꏊ�X�֔ԍ� */
		m_DLV_LOC_ZIP_CD = null;
		
		/** �[�i�ꏊ�Z���P */
		m_DLV_LOC_ADDRESS_1 = null;
		
		/** �[�i�ꏊ�Z���Q */
		m_DLV_LOC_ADDRESS_2 = null;
		
		/** �[�i�ꏊ�Z���i�J�i�j�P */
		m_DLV_LOC_ADDRESS_K_1 = null;
		
		/** �[�i�ꏊ�Z���i�J�i�j�Q */
		m_DLV_LOC_ADDRESS_K_2 = null;
		
		
		/** �[�i�ꏊ�d�b�ԍ� */
		m_DLV_LOC_TEL = null;
		
		/** �[�i�ꏊ�e�`�w�ԍ� */
		m_DLV_LOC_FAX = null;
		
		/** �o�בq�ɃR�[�h */
		m_SHIP_WH_CD = null;
		
		/** �o�בq�ɖ� */
		m_SHIP_WH_NAME = null;
		
		/** �o�׎w��� */
		m_DESINATED_SHIP_DATE = null;
		
		/** �w��[�� */
		m_DESINATED_DLV_DATE = null;
		
		/** �^���փR�[�h */
		m_TRANSPORT_CD = null;
		
		/** �^���֖� */
		m_TRANSPORT_NAME = null;
		
		/** �[���\��֔ԍ� */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		
		/** �����敪 */
		m_INSPC_ACPT_TYP = null;
		
		/** �{�̋��z�v */
		m_ODR_AMOUNT_SUM = null;
		
		/** ����ō��v */
		m_ODR_TAX_SUM = null;
		
		/** �󒍍��v���z */
		m_ODR_TAX_AMOUNT_SUM = null;
		
		/** ���Ӑ撍���ԍ� */
		m_CUST_ODR_NO = null;
		
		/** �`�[������R�R�[�h */
		m_ODR_H_CANCEL_CAUSE_CD = null;
		
		/** �`�[�E�v */
		m_SLIP_REMARKS = null;
		
		/** �X�V�� */
		m_MODIFY_COUNT = null;
		
		/** �����敪 */
		m_PROC_DIV = null;
		
		/** ���s�敪 */
		m_EXC_DIV = null;
		
		/** �G���[�ԍ� */
		m_ERROR_NO = null;
		
		/** �󒍖��׏�� */
		m_OrderLines = null;
	}
}
