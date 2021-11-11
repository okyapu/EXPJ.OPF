/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/lot/OrderLine.java,v $
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

public class OrderLine
{
	/** �����敪�@*/
	public static final BigDecimal PROC_DIV_REG = BigDecimal.valueOf(1);    	// �����敪 1�i�o�^�j
	public static final BigDecimal PROC_DIV_UPD = BigDecimal.valueOf(2);     	// �����敪 2�i�X�V�j
	public static final BigDecimal PROC_DIV_DEL = BigDecimal.valueOf(3);     	// �����敪 3�i�폜�j

	public static final BigDecimal EXC_DIV_VAL  = BigDecimal.valueOf(1);     	// ���s�敪 1�i�m�F�j
	public static final BigDecimal EXC_DIV_EXC  = BigDecimal.valueOf(2);		// ���s�敪 2�i���s�j

	public static final BigDecimal ENTRY_TYPE_BATCH  = BigDecimal.valueOf(1);		// ���s�敪 1 (�o�b�`)�@
	public static final BigDecimal ENTRY_TYPE_ONLINE = BigDecimal.valueOf(2);		// ���s�敪 2�iO/L�j

	
	//-------------------------------------------------------------------------
	// �l�i�[�p�����o�ϐ�
	//-------------------------------------------------------------------------
	/** ��ЃR�[�h */
	private String  m_COMPANY_CD = null;
	/** �󒍓`�[�ԍ� */
	private String  m_ORDER_H_NO = null;
	/** �󒍖��׍s�ԍ� */
	private BigDecimal  m_ODR_D_LINE_NO = null;
	/** �󒍖��ה����A�� */
	private BigDecimal  m_ODR_D_SEQ_NO = null;
	/** �`�[�敪 */
	private BigDecimal m_SLIP_TYP = null;
	/** �����v��敪 */
	private BigDecimal  m_AUTO_APP_TYP = null;
	/** ���Ӑ撍���ԍ� */
	private String  m_CUST_ODR_NO = null;
	/** �c�ƒS������R�[�h */
	private String  m_CUST_CHRG_ORG_CD = null;
	/** �c�ƒS���҃R�[�h */
	private String  m_CUST_CHRG_PSN_CD = null;
	/** ���s�S���ҕ���R�[�h */
	private String  m_ODR_ACPT_ORG_CD =null;
	/** ���s�S���҃R�[�h */
	private String  m_ODR_ACPT_PSN_CD = null;
	/** ���Ӑ�R�[�h */
	private String  m_CUST_CD = null;
	/** �[�i�ꏊ�R�[�h */
	private String  m_DLV_LOC_CD = null;
	/** �o�בq�ɃR�[�h */
	private String  m_SHIP_WH_CD = null;
	/** �o�בq�ɖ� */
	private String  m_SHIP_WH_NAME = null;
	/** �i�ڔԍ� */
	private String  m_ITEM_CD = null;
	/** �i�ږ� */
	private String  m_ITEM_NAME = null;
	/** ����敪 */
	private BigDecimal  m_TRANS_TYP = null;
	/** ���׎�����R�R�[�h */
	private String  m_ODR_D_CANCEL_CAUSE_CD = null;
	/** �[���\��֔ԍ� */
	private BigDecimal  m_CUST_DLV_PLAN_TRANS_NO = null;
	/** �Г��o�ח\��֔ԍ� */
	private BigDecimal  m_IN_HOUSE_SHIP_PLAN_TRANS_NO = null;
	/** �󒍒P�� */
	private BigDecimal  m_ODR_UNIT_PRICE = null;
	/** �[���\����� */
	private Date  m_SCDL_DLV_DATE = null;
	/** �o�ח\����� */
	private Date  m_SHIP_PLAN_DATE = null;
	/** �Z�b�g�J�n���� */
	private Date  m_SET_ST_DATE = null;
	/** �^���փR�[�h */
	private String  m_TRANSPORT_CD = null;
	/** �^���֖� */
	private String  m_TRANSPORT_NAME = null;
	/** �󒍐��� */
	private BigDecimal  m_ODR_QTY = null;
	/** �󒍒P�� */
	private String  m_UNIT_CD = null;
	/** �w�胍�b�g�ԍ� */
	private String  m_LOT_NO = null;
	/** ���l */
	private String  m_REMARKS = null;
	/** �󒍓� */
	private Date  m_ODR_DATE = null;
	/** IF���Ǘ��ԍ� */
	private BigDecimal  m_IF_CTL_NO = null;
	/** �������� */
	private BigDecimal  m_ODR_SEQ = null;
	/** �f�[�^���͋敪 */
	private BigDecimal  m_ENTRY_TYP = null;
	/** �󒍋��z */
	private BigDecimal  m_ODR_AMOUNT = null;
	/** �󒍋��z(�M��) */
	private BigDecimal  m_ODR_AMOUNT_EXCH_RATES = null;
	/** ����Ŋz */
	private BigDecimal  m_TAX_AMOUNT = null;
	/** �󒍋��z(�ō���) */
	private BigDecimal  m_ODR_AMOUNT_TAX = null;
	/** �󒍋��z(�Ŕ�) */
	private BigDecimal  m_ODR_AMOUNT_EXC_TAX = null;
	
	/** �󒍒P�ʐ� */
	private BigDecimal  m_OODR_UNIT_QTY = null;
	/** ���Ӑ�i�ڔԍ� */
	private String  m_CUST_ITEM_CD = null;
	/** ���Ӑ�i�ږ��� */
	private String  m_CUST_ITEM_NAME = null;
	/** �X�V�� */
	private BigDecimal  m_MODIFY_COUNT = null;
	/** �����敪 */
	private BigDecimal  m_PROC_DIV = null;
	/** ���s�敪 */
	private BigDecimal  m_EXC_DIV = null;
	/** �G���[�ԍ� */
	private String  m_ERROR_NO = null;
	/** JAN�R�[�h */
	private String  m_JANCODE = null;
	

	//-------------------------------------------------------------------------
	// �v�f�擾�֐�
	//-------------------------------------------------------------------------
	/** ��ЃR�[�h */
	public String  companyCd() { return m_COMPANY_CD; }
	/** �󒍓`�[�ԍ� */
	public String  orderHNo() { return m_ORDER_H_NO; }
	/** �󒍖��׍s�ԍ� */
	public BigDecimal  lineNo() { return m_ODR_D_LINE_NO; }
	/** �󒍖��ה����A�� */
	public BigDecimal  seqNo() { return m_ODR_D_SEQ_NO; }
	/** �`�[�敪 */
	public BigDecimal slipType() {return m_SLIP_TYP; }
	/** �����v��敪 */
	public BigDecimal autoAppType() {return m_AUTO_APP_TYP; }
	/** ���Ӑ撍���ԍ� */
	public String  custOdrNo() {  return m_CUST_ODR_NO; }
	/** �c�ƒS������R�[�h*/
	public String  custChrgOrgCd() { return m_CUST_CHRG_ORG_CD; }
	/** �c�ƒS���҃R�[�h*/
	public String  custChrgPsnCd() { return m_CUST_CHRG_PSN_CD; }
	/** ���s�S���ҕ���R�[�h */
	public String  acptOrgCd() { return m_ODR_ACPT_ORG_CD; }
	/** ���s�S���҃R�[�h*/
	public String  acptPsnCd() { return m_ODR_ACPT_PSN_CD; }
	/** ���Ӑ�R�[�h */
	public String  custCd() { return m_CUST_CD; }
	/** �[�i�ꏊ�R�[�h */
	public String  dlvLocCd() { return m_DLV_LOC_CD; }
	/** �o�בq�ɃR�[�h */
	public String  shipWhCd() { return m_SHIP_WH_CD ;}
	/** �o�בq�ɖ� */
	public String shipWhName() { return m_SHIP_WH_NAME; }
	/** �i�ڔԍ� */
	public String  itemCd() { return m_ITEM_CD; }
	/** �i�ږ��� */
	public String  itemName() { return m_ITEM_NAME; }
	/** ����敪 */
	public BigDecimal  transType() {  return m_TRANS_TYP; }
	/** ���׎�����R�R�[�h */
	public String  cancelCauseCd() { return m_ODR_D_CANCEL_CAUSE_CD; }
	/** �[���\��֔ԍ� */
	public BigDecimal  custDlvPlanTransNo() {  return m_CUST_DLV_PLAN_TRANS_NO; }
	/** �Г��o�ח\��֔ԍ� */
	public BigDecimal  inHouseShipPlanTransNo() {  return m_IN_HOUSE_SHIP_PLAN_TRANS_NO; }
	/** �󒍒P�� */
	public BigDecimal  orderUnitPrice() {  return m_ODR_UNIT_PRICE; }
	/** �[���\����� */
	public Date  scdlDlvDate() {  return m_SCDL_DLV_DATE; }
	/** �o�ח\��� */
	public Date  shipPlanDate() {  return m_SHIP_PLAN_DATE; }
	/** �Z�b�g�J�n���� */
	public Date  setStDate() {  return m_SET_ST_DATE; }
	/** �^���փR�[�h*/
	public String  transPortCd() { return m_TRANSPORT_CD; }
	/** �^���֖� */
	public String transPortName() { return m_TRANSPORT_NAME; }
	/** �󒍐��� */
	public BigDecimal  orderQty() {  return m_ODR_QTY; }
	/** �󒍒P�� */
	public String  orderUnitCd() { return m_UNIT_CD; }
	/** �w�胍�b�g�ԍ� */
	public String  lotNo() { return m_LOT_NO; }
	/** ���l */
	public String  remarks() {  return m_REMARKS; }
	/** �󒍓� */
	public Date  orderDate() { return m_ODR_DATE; }
	/** IF���Ǘ��ԍ� */
	public BigDecimal  ifCtlNo() {  return m_IF_CTL_NO; }
	/** �������� */
	public BigDecimal  orderSqe() {  return m_ODR_SEQ; }
	/** �f�[�^���͋敪 */
	public BigDecimal  entryType() {  return m_ENTRY_TYP; }
	/** �󒍋��z  */
	public BigDecimal orderAmount() { return m_ODR_AMOUNT; }
	/** �󒍋��z(�M��)  */
	public BigDecimal orderAmountExchRates() { return m_ODR_AMOUNT_EXCH_RATES; }
	/** ����Ŋz */
	public BigDecimal taxAmount() { return m_TAX_AMOUNT; }
	/** �󒍋��z(�ō���) */
	public BigDecimal orderAmountTax() { return m_ODR_AMOUNT_TAX; }
	/** �󒍋��z(�Ŕ�) */
	public BigDecimal orderAmountExcTax() { return m_ODR_AMOUNT_EXC_TAX; }
	/** �󒍒P�ʐ� */
	public BigDecimal orderUnitQty() { return m_OODR_UNIT_QTY; }
	/** ���Ӑ�i�ڔԍ� */
	public String custItemCd() { return m_CUST_ITEM_CD; }
	/** ���Ӑ�i�ږ��� */
	public String custItemName() { return m_CUST_ITEM_NAME; }
	/** �X�V�� */
	public BigDecimal  modifyCount() {  return m_MODIFY_COUNT; }
	/** �����敪 */
	public BigDecimal  procDiv() {  return m_PROC_DIV; }
	/** ���s�敪 */
	public BigDecimal  excDiv() {  return m_EXC_DIV; }
	/** �G���[�ԍ� */
	public String  errorNo() {  return m_ERROR_NO; }
	/** JAN�R�[�h */
	public String  janCode() {  return m_JANCODE; }
	//-------------------------------------------------------------------------
	// �v�f�ݒ�֐�
	//-------------------------------------------------------------------------
	/** ��ЃR�[�h */
	public void  companyCd(String val) {  m_COMPANY_CD = val; }
	/** �󒍓`�[�ԍ� */
	public void  orderHNo(String val) {  m_ORDER_H_NO = val; }
	/** �󒍖��׍s�ԍ� */
	public void  lineNo(BigDecimal val) {  m_ODR_D_LINE_NO = val; }
	/** �󒍖��ה����A�� */
	public void  seqNo(BigDecimal val) {  m_ODR_D_SEQ_NO = val; }
	/** �`�[�敪 */
	public void slipType(BigDecimal val) { m_SLIP_TYP = val; }
	/** �����v��敪 */
	public void autoAppType(BigDecimal val) { m_AUTO_APP_TYP = val; }
	/** ���Ӑ撍���ԍ� */
	public void  custOdrNo(String val) {   m_CUST_ODR_NO = val; }
	/** �c�ƒS������R�[�h*/
	public void  custChrgOrgCd(String val) {  m_CUST_CHRG_ORG_CD = val; }
	/** �c�ƒS���҃R�[�h*/
	public void  custChrgPsnCd(String val) {  m_CUST_CHRG_PSN_CD = val; }
	/** ���s�S���ҕ���R�[�h */
	public void  acptOrgCd(String val) {  m_ODR_ACPT_ORG_CD = val; }
	/** ���s�S���҃R�[�h*/
	public void  acptPsnCd(String val) {  m_ODR_ACPT_PSN_CD = val; }
	/** ���Ӑ�R�[�h */
	public void  custCd(String val) {  m_CUST_CD = val; }
	/** �[�i�ꏊ�R�[�h */
	public void  dlvLocCd(String val) {  m_DLV_LOC_CD = val; }
	/** �o�בq�ɃR�[�h */
	public void  shipWhCd(String val) {  m_SHIP_WH_CD  = val; }
	/** �o�בq�ɖ� */
	public void shipWhName(String val) {  m_SHIP_WH_NAME = val; }
	/** �i�ڔԍ� */
	public void  itemCd(String val) {  m_ITEM_CD = val; }
	/** �i�ږ��� */
	public void  itemName(String val) {  m_ITEM_NAME = val; }
	/** ����敪 */
	public void  transType(BigDecimal val) {   m_TRANS_TYP = val; }
	/** ���׎�����R�R�[�h */
	public void  cancelCauseCd(String val) {  m_ODR_D_CANCEL_CAUSE_CD = val; }
	/** �[���\��֔ԍ� */
	public void  custDlvPlanTransNo(BigDecimal val) {   m_CUST_DLV_PLAN_TRANS_NO = val; }
	/** �Г��o�ח\��֔ԍ� */
	public void  inHouseShipPlanTransNo(BigDecimal val) {   m_IN_HOUSE_SHIP_PLAN_TRANS_NO = val; }
	/** �󒍒P�� */
	public void  orderUnitPrice(BigDecimal val) {   m_ODR_UNIT_PRICE= val; }
	/** �[���\����� */
	public void  scdlDlvDate(Date val) {   m_SCDL_DLV_DATE = val; }
	/** �o�ח\��� */
	public void  shipPlanDate(Date val) {   m_SHIP_PLAN_DATE = val; }
	/** �Z�b�g�J�n���� */
	public void  setStDate(Date val) {   m_SET_ST_DATE = val; }
	/** �^���փR�[�h*/
	public void  transPortCd(String val) {  m_TRANSPORT_CD = val; }
	/** �^���֖� */
	public void transPortName(String val) {  m_TRANSPORT_NAME = val; }
	/** �󒍐��� */
	public void  orderQty(BigDecimal val) {   m_ODR_QTY = val; }
	/** �󒍒P�� */
	public void  orderUnitCd(String val) {  m_UNIT_CD = val; }
	/** �w�胍�b�g�ԍ� */
	public void  lotNo(String val) {  m_LOT_NO = val; }
	/** ���l */
	public void  remarks(String val) {   m_REMARKS = val; }
	/** �󒍓� */
	public void  orderDate(Date val) {  m_ODR_DATE = val; }
	/** IF���Ǘ��ԍ� */
	public void  ifCtlNo(BigDecimal val) {   m_IF_CTL_NO = val; }
	/** �������� */
	public void  orderSqe(BigDecimal val) {   m_ODR_SEQ = val; }
	/** �f�[�^���͋敪 */
	public void  entryType(BigDecimal val) {   m_ENTRY_TYP = val; }
	/** �󒍋��z  */
	public void orderAmount(BigDecimal val) {  m_ODR_AMOUNT = val; }
	/** �󒍋��z(�M��)  */
	public void orderAmountExchRates(BigDecimal val) {  m_ODR_AMOUNT_EXCH_RATES = val; }
	/** ����Ŋz */
	public void taxAmount(BigDecimal val) {  m_TAX_AMOUNT = val; }
	/** �󒍋��z(�ō���) */
	public void orderAmountTax(BigDecimal val) {  m_ODR_AMOUNT_TAX = val; }
	/** �󒍋��z(�Ŕ�) */
	public void orderAmountExcTax(BigDecimal val) {  m_ODR_AMOUNT_EXC_TAX = val; }
	/** �󒍒P�ʐ� */
	public void orderUnitQty(BigDecimal val) { m_OODR_UNIT_QTY= val; }
	/** ���Ӑ�i�ڔԍ� */
	public void custItemCd(String val) {  m_CUST_ITEM_CD = val; }
	/** ���Ӑ�i�ږ��� */
	public void custItemName(String val) {  m_CUST_ITEM_NAME = val; }
	/** �X�V�� */
	public void  modifyCount(BigDecimal val) {   m_MODIFY_COUNT = val; }
	/** �����敪 */
	public void  procDiv(BigDecimal val) {   m_PROC_DIV = val; }
	/** ���s�敪 */
	public void  excDiv(BigDecimal val) {   m_EXC_DIV = val; }
	/** �G���[�ԍ� */
	public void  errorNo(String val) {   m_ERROR_NO = val; }
	/** JAN�R�[�h */
	public void  janCode(String val) {   m_JANCODE = val; }
	
	/**
	 * �R���X�g���N�^
	 *
	 * @param �Ȃ�
	 */
	public OrderLine()
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
		/** �󒍖��׍s�ԍ� */
		m_ODR_D_LINE_NO = null;
		/** �󒍖��ה����A�� */
		m_ODR_D_SEQ_NO = null;
		/** �`�[�敪 */
		m_SLIP_TYP = null;
		/** �����v��敪 */
		m_AUTO_APP_TYP = null;
		/** ���Ӑ撍���ԍ� */
		m_CUST_ODR_NO = null;
		/** �c�ƒS������R�[�h */
		m_CUST_CHRG_ORG_CD = null;
		/** �c�ƒS���҃R�[�h */
		m_CUST_CHRG_PSN_CD = null;
		/** ���s�S���ҕ���R�[�h */
		m_ODR_ACPT_ORG_CD =null;
		/** ���s�S���҃R�[�h */
		m_ODR_ACPT_PSN_CD = null;
		/** ���Ӑ�R�[�h */
		m_CUST_CD = null;
		/** �[�i�ꏊ�R�[�h */
		m_DLV_LOC_CD = null;
		/** �o�בq�ɃR�[�h */
		m_SHIP_WH_CD = null;
		/** �o�בq�ɖ� */
		m_SHIP_WH_NAME = null;
		/** �i�ڔԍ� */
		m_ITEM_CD = null;
		/** �i�ږ� */
		m_ITEM_NAME = null;
		/** ����敪 */
		m_TRANS_TYP = null;
		/** ���׎�����R�R�[�h */
		m_ODR_D_CANCEL_CAUSE_CD = null;
		/** �[���\��֔ԍ� */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		/** �Г��o�ח\��֔ԍ� */
		m_IN_HOUSE_SHIP_PLAN_TRANS_NO = null;
		/** �󒍒P�� */
		m_ODR_UNIT_PRICE = null;
		/** �[���\����� */
		m_SCDL_DLV_DATE = null;
		/** �o�ח\����� */
		m_SHIP_PLAN_DATE = null;
		/** �Z�b�g�J�n���� */
		m_SET_ST_DATE = null;
		/** �^���փR�[�h */
		m_TRANSPORT_CD = null;
		/** �^���֖� */
		m_TRANSPORT_NAME = null;
		/** �󒍐��� */
		m_ODR_QTY = null;
		/** �󒍒P�� */
		m_UNIT_CD = null;
		/** �w�胍�b�g�ԍ� */
		m_LOT_NO = null;
		/** ���l */
		m_REMARKS = null;
		/** �󒍓� */
		m_ODR_DATE = null;
		/** IF���Ǘ��ԍ� */
		m_IF_CTL_NO = null;
		/** �������� */
		m_ODR_SEQ = null;
		/** �f�[�^���͋敪 */
		m_ENTRY_TYP = null;
		/** �󒍋��z */
		m_ODR_AMOUNT = null;
		/** �󒍋��z(�M��) */
		m_ODR_AMOUNT_EXCH_RATES = null;
		/** ����Ŋz */
		m_TAX_AMOUNT = null;
		/** �󒍋��z(�ō���) */
		m_ODR_AMOUNT_TAX = null;
		/** ���Ӑ�i�ڔԍ� */
		m_CUST_ITEM_CD = null;
		/** ���Ӑ�i�ږ��� */
		m_CUST_ITEM_NAME = null;
		/** �X�V�� */
		m_MODIFY_COUNT = null;
		/** �����敪 */
		m_PROC_DIV = null;
		/** ���s�敪 */
		m_EXC_DIV = null;
		/** �G���[�ԍ� */
		m_ERROR_NO = null;
		

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
		/** �󒍖��׍s�ԍ� */
		m_ODR_D_LINE_NO = null;
		/** �󒍖��ה����A�� */
		m_ODR_D_SEQ_NO = null;
		/** �`�[�敪 */
		m_SLIP_TYP = null;
		/** �����v��敪 */
		m_AUTO_APP_TYP = null;
		/** ���Ӑ撍���ԍ� */
		m_CUST_ODR_NO = null;
		/** �c�ƒS������R�[�h */
		m_CUST_CHRG_ORG_CD = null;
		/** �c�ƒS���҃R�[�h */
		m_CUST_CHRG_PSN_CD = null;
		/** ���s�S���ҕ���R�[�h */
		m_ODR_ACPT_ORG_CD =null;
		/** ���s�S���҃R�[�h */
		m_ODR_ACPT_PSN_CD = null;
		/** ���Ӑ�R�[�h */
		m_CUST_CD = null;
		/** �[�i�ꏊ�R�[�h */
		m_DLV_LOC_CD = null;
		/** �o�בq�ɃR�[�h */
		m_SHIP_WH_CD = null;
		/** �o�בq�ɖ� */
		m_SHIP_WH_NAME = null;
		/** �i�ڔԍ� */
		m_ITEM_CD = null;
		/** �i�ږ� */
		m_ITEM_NAME = null;
		/** ����敪 */
		m_TRANS_TYP = null;
		/** ���׎�����R�R�[�h */
		m_ODR_D_CANCEL_CAUSE_CD = null;
		/** �[���\��֔ԍ� */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		/** �Г��o�ח\��֔ԍ� */
		m_IN_HOUSE_SHIP_PLAN_TRANS_NO = null;
		/** �󒍒P�� */
		m_ODR_UNIT_PRICE = null;
		/** �[���\����� */
		m_SCDL_DLV_DATE = null;
		/** �o�ח\����� */
		m_SHIP_PLAN_DATE = null;
		/** �Z�b�g�J�n���� */
		m_SET_ST_DATE = null;
		/** �^���փR�[�h */
		m_TRANSPORT_CD = null;
		/** �^���֖� */
		m_TRANSPORT_NAME = null;
		/** �󒍐��� */
		m_ODR_QTY = null;
		/** �󒍒P�� */
		m_UNIT_CD = null;
		/** �w�胍�b�g�ԍ� */
		m_LOT_NO = null;
		/** ���l */
		m_REMARKS = null;
		/** �󒍓� */
		m_ODR_DATE = null;
		/** IF���Ǘ��ԍ� */
		m_IF_CTL_NO = null;
		/** �������� */
		m_ODR_SEQ = null;
		/** �f�[�^���͋敪 */
		m_ENTRY_TYP = null;
		/** �󒍋��z */
		m_ODR_AMOUNT = null;
		/** �󒍋��z(�M��) */
		m_ODR_AMOUNT_EXCH_RATES = null;
		/** ����Ŋz */
		m_TAX_AMOUNT = null;
		/** �󒍋��z(�ō���) */
		m_ODR_AMOUNT_TAX = null;
		/** ���Ӑ�i�ڔԍ� */
		m_CUST_ITEM_CD = null;
		/** ���Ӑ�i�ږ��� */
		m_CUST_ITEM_NAME = null;
		/** �X�V�� */
		m_MODIFY_COUNT = null;
		/** �����敪 */
		m_PROC_DIV = null;
		/** ���s�敪 */
		m_EXC_DIV = null;
		/** �G���[�ԍ� */
		m_ERROR_NO = null;
		

	}

	

}