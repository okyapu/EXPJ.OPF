/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.UnitCost;

import java.sql.*;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * �P���ǂݍ��ݐ���N���X
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:34 $
 */
public class UnitCostDataAccessController {
    /** DB�A�N�Z�X�p�̃R�l�N�V���� */
    private IDbConnection conn = null;

    /** �f�[�^�擾�p��SQL */
    private String selectSql
            = "select "
              + "  M_PUCH_UNIT_COST.UNIT_COST_TYP as UNIT_COST_TYP, "
              + "  M_PUCH_UNIT_COST.UNIT_COST as UNIT_COST, "
              + "  M_PUCH_UNIT_COST.PROCESSING_COST as PROCESSING_COST, "
              + "  M_PUCH_UNIT_COST.MATERIAL_COST as MATERIAL_COST, "
              + "  M_PUCH_UNIT_COST.OTHER_OVERHEADS as OTHER_OVERHEADS "
              + "from "
              + "  M_PUCH_UNIT_COST, "
              + "  SYS_MY_COMPANY "
              + "where "
              + "  M_PUCH_UNIT_COST.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
              + "  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
              + "  and M_PUCH_UNIT_COST.VEND_CD = ? "
              + "  and M_PUCH_UNIT_COST.PLANT_CD = ? "
              + "  and M_PUCH_UNIT_COST.ITEM_CD = ? "
              +
            "  and M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE <= TO_DATE(?, 'YYYY/MM/DD') "
            + "  and M_PUCH_UNIT_COST.PUCH_SIZE <= TO_NUMBER(?) "
            + "order by "
            + "  M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE desc, "
            + "  M_PUCH_UNIT_COST.PUCH_SIZE desc ";
    private String selectVendCtrlSql
            = "select "
              + "  M_VEND_CTRL.ROUND_TYP as ROUND_TYP, "
              + "  M_VEND_CTRL.TAX_APPLY_TYP as TAX_APPLY_TYP, "
              + "  M_VEND_CTRL.TAX_CD as TAX_CD "
              + "from "
              + "  M_VEND_CTRL "
              + "where "
              + "  M_VEND_CTRL.VEND_CD = ? ";
    private String selectItemSql
            = "select "
              + "  M_ITEM.TAX_CD as TAX_CD "
              + "from "
              + "  M_ITEM "
              + "where "
              + "  M_ITEM.ITEM_CD = ? ";
    private String selectTaxSql
            = "select "
              + "  M_TAX.OLD_TAX_RATE_1 as TAX_RATE_1, "
              + "  M_TAX.OLD_TAX_RATE_2 as TAX_RATE_2, "
              + "  M_TAX.OLD_TAX_RATE_3 as TAX_RATE_3, "
              + "  M_TAX.ROUND_TYP as TAX_ROUND_TYP "
              + "from "
              + "  M_TAX "
              + "where "
              + "  M_TAX.TAX_CD = ? "
              +
              "  and M_TAX.NEW_TAX_RATE_START_DATE > TO_DATE(?, 'YYYY/MM/DD') "
              + "union all "
              + "select "
              + "  M_TAX.NEW_TAX_RATE_1 as TAX_RATE_1, "
              + "  M_TAX.NEW_TAX_RATE_2 as TAX_RATE_2, "
              + "  M_TAX.NEW_TAX_RATE_3 as TAX_RATE_3, "
              + "  M_TAX.ROUND_TYP as TAX_ROUND_TYP "
              + "from "
              + "  M_TAX "
              + "where "
              + "  M_TAX.TAX_CD = ? "
              +
            "  and M_TAX.NEW_TAX_RATE_START_DATE <= TO_DATE(?, 'YYYY/MM/DD') ";

    /**
     * �I�u�W�F�N�g���\�z����B
     */
    public UnitCostDataAccessController() {
    }

    /**
     * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����B
     *
     * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
     */
    public UnitCostDataAccessController(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * �R�l�N�V�����ݒ�B<BR>
     * �R�l�N�V�����̎Q�Ƃ𖳌��ɂ���ꍇ�A������null��ݒ肷�邱�ƁB
     *
     * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
     */
    public void setConnection(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * �P�����擾
     * @param venderCode �����R�[�h
     * @param plantCode �H��R�[�h
     * @param itemCode �i�ڔԍ�
     * @param effPhaseInDate �����\���
     * @param puchSize ������
     * @return �擾�����f�[�^
     * @throws SQLException SQL�̔��s�Ɏ��s�����ꍇ
     * @throws UnitCostException ����Ńf�[�^��0���̏ꍇ
     */
    public UnitCostStruct getData(String venderCode,
                                  String plantCode,
                                  String itemCode,
                                  String effPhaseInDate,
                                  String puchSize) throws SQLException,
            UnitCostException {

        // �f�[�^
        UnitCostStruct rUnitCost = new UnitCostStruct();

        // �P���}�X�^�p�X�e�[�g�����g
        PreparedStatement unitCostPs = null;
        // �P���}�X�^�p���U���g�Z�b�g
        ResultSet unitCostRs = null;
        // �����}�X�^�p�X�e�[�g�����g
        PreparedStatement vendCtrlPs = null;
        // �����}�X�^�p���U���g�Z�b�g
        ResultSet vendCtrlRs =null;
        // �i�ڃ}�X�^�p�X�e�[�g�����g
        PreparedStatement itemPs = null;
        // �i�ڃ}�X�^�p���U���g�Z�b�g
        ResultSet itemRs = null;
        // ����ŋ敪�}�X�^�p�X�e�[�g�����g
        PreparedStatement taxPs = null;
        // ����ŋ敪�}�X�^�p���U���g�Z�b�g
        ResultSet taxRs = null;


        String unitCostTyp = null;
        String unitCost = null;
        String processingCost = null;
        String materialCost = null;
        String otherOverheads = null;

        String taxCd = null;
        String taxRate1 = null;
        String taxRate2 = null;
        String taxRate3 = null;
        String taxRoundTyp = null;
        String roundTyp = null;

        String costTotal = null;
        String puchOdrAmount = null;
        String netAmount = null;
        String discAmount = null;
        String taxAmount1 = null;
        String taxAmount2 = null;
        String taxAmount3 = null;
        String taxAmountTotal = null;
        String amountIncludeTax = null;

        try {
            // SQL�쐬
            unitCostPs = this.conn.getConn().prepareStatement(this.selectSql);
            unitCostPs.setString(1, venderCode);
            unitCostPs.setString(2, plantCode);
            unitCostPs.setString(3, itemCode);
            unitCostPs.setString(4, effPhaseInDate);
            unitCostPs.setString(5, puchSize);

            // SQL���s
            unitCostRs = unitCostPs.executeQuery();

            // ���ʂ�ݒ�
            if (unitCostRs.next()) {
                // UNIT_COST_TYP
                unitCostTyp = unitCostRs.getString(1);
                // UNIT_COST
                unitCost = unitCostRs.getString(2);
                // PROCESSING_COST
                processingCost = unitCostRs.getString(3);
                // MATERIAL_COST
                materialCost = unitCostRs.getString(4);
                // OTHER_OVERHEADS
                otherOverheads = unitCostRs.getString(5);
            } else {
                // UNIT_COST_TYP
                unitCostTyp = "0";
                // UNIT_COST
                unitCost = "0.0000";
                // PROCESSING_COST
                processingCost = "0.0000";
                // MATERIAL_COST
                materialCost = "0.0000";
                // OTHER_OVERHEADS
                otherOverheads = "0.0000";
            }

            // �����}�X�^������
            vendCtrlPs = this.conn.getConn().prepareStatement(
                    this.selectVendCtrlSql);
            vendCtrlPs.setString(1, venderCode);
            vendCtrlRs = vendCtrlPs.executeQuery();
            // ���݂��Ȃ��ꍇ�̓G���[
            if (!vendCtrlRs.next()) {
                throw new UnitCostException();
            }

            roundTyp = vendCtrlRs.getString("ROUND_TYP");

            // �i�ڔԍ���null�܂��́A
            // �m�����n.�h����œK�p�敪�h���A
            // 1(�i��)�̏ꍇ�A�m�i�ځn.�h����ŃR�[�h�h�L�[�ɂ���
            // 2(�����)�̏ꍇ�A[�����R�[�h]."����ŃR�[�h�h���L�[�ɂ���
            if (itemCode == null
                || itemCode.length() <= 0
                || "2".equals(vendCtrlRs.getString("TAX_APPLY_TYP"))) {

                taxCd = vendCtrlRs.getString("TAX_CD");
            } else {
                // �i�ڃ}�X�^������
                itemPs = this.conn.getConn().prepareStatement(this.
                        selectItemSql);
                itemPs.setString(1, itemCode);
                itemRs = itemPs.executeQuery();
                // ���݂��Ȃ��ꍇ�̓G���[
                if (!itemRs.next()) {
                    throw new UnitCostException();
                }

                taxCd = itemRs.getString("TAX_CD");
            }


            // ����ŋ敪�}�X�^������
            taxPs = this.conn.getConn().prepareStatement(this.selectTaxSql);
            taxPs.setString(1, taxCd);
            taxPs.setString(2, effPhaseInDate);
            taxPs.setString(3, taxCd);
            taxPs.setString(4, effPhaseInDate);
            taxRs = taxPs.executeQuery();

            // ���݂��Ȃ��ꍇ�̓G���[
            if (!taxRs.next()) {
                throw new UnitCostException();
            }

            taxRoundTyp = taxRs.getString("TAX_ROUND_TYP");
            // TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ƃ���B
            if (taxCd.substring(taxCd.length() - 1).equals("1")) {
                taxRate1 = taxRs.getString("TAX_RATE_1");
                taxRate2 = taxRs.getString("TAX_RATE_2");
                taxRate3 = taxRs.getString("TAX_RATE_3");
            } else {
                taxRate1 = "0";
                taxRate2 = "0";
                taxRate3 = "0";
            }

            // �e���z�̌v�Z
            // �l����
            discAmount = "0";
            // �o��v�̌v�Z
            costTotal = Calculate.add(materialCost, otherOverheads);
            costTotal = Calculate.add(processingCost, costTotal);
            // �������z�̌v�Z
            puchOdrAmount = Calculate.multiply(unitCost, puchSize);
            if (roundTyp.equals("2")) {
                puchOdrAmount = Calculate.ceil(puchOdrAmount, 0);
            } else if (roundTyp.equals("3")) {
                puchOdrAmount = Calculate.floor(puchOdrAmount, 0);
            } else {
                puchOdrAmount = Calculate.round(puchOdrAmount, 0);
            }
            // �{�̋��z�̌v�Z
            netAmount = Calculate.subtract(puchOdrAmount, discAmount);

            // TAX_CD�̉�1����1�ȊO�̏ꍇ�͐ŗ���0�Ȃ̂ŁA�Ŋz��0�ɂ���B
            if (taxCd.substring(taxCd.length() - 1).equals("1")) {
                // �Ŋz�P�̌v�Z
                taxAmount1 = Calculate.divide(taxRate1, "100", 4,
                                              Calculate._FLOOR);
                taxAmount1 = Calculate.multiply(netAmount, taxAmount1);
                if (taxRoundTyp.equals("2")) {
                    taxAmount1 = Calculate.ceil(taxAmount1, 0);
                } else if (taxRoundTyp.equals("3")) {
                    taxAmount1 = Calculate.floor(taxAmount1, 0);
                } else {
                    taxAmount1 = Calculate.round(taxAmount1, 0);
                }
                // �Ŋz�Q�̌v�Z
                taxAmount2 = Calculate.divide(taxRate2, "100", 4,
                                              Calculate._FLOOR);
                taxAmount2 = Calculate.multiply(netAmount, taxAmount2);
                if (taxRoundTyp.equals("2")) {
                    taxAmount2 = Calculate.ceil(taxAmount2, 0);
                } else if (taxRoundTyp.equals("3")) {
                    taxAmount2 = Calculate.floor(taxAmount2, 0);
                } else {
                    taxAmount2 = Calculate.round(taxAmount2, 0);
                }
                // �Ŋz�R�̌v�Z
                taxAmount3 = Calculate.divide(taxRate3, "100", 4,
                                              Calculate._FLOOR);
                taxAmount3 = Calculate.multiply(netAmount, taxAmount3);
                if (taxRoundTyp.equals("2")) {
                    taxAmount3 = Calculate.ceil(taxAmount3, 0);
                } else if (taxRoundTyp.equals("3")) {
                    taxAmount3 = Calculate.floor(taxAmount3, 0);
                } else {
                    taxAmount3 = Calculate.round(taxAmount3, 0);
                }
            } else {
                // �Ŋz�P�`�R�̌v�Z
                taxAmount1 = "0";
                taxAmount2 = "0";
                taxAmount3 = "0";
            }

            // �Ŋz�v�̌v�Z
            taxAmountTotal = Calculate.add(taxAmount1, taxAmount2);
            taxAmountTotal = Calculate.add(taxAmountTotal, taxAmount3);
            // �ō��݋��z�̌v�Z
            amountIncludeTax = Calculate.add(netAmount, taxAmountTotal);

            // ���z�������_4���Ŋۂ߁i�l�̌ܓ��j
            unitCost = Calculate.round(unitCost, 4);
            processingCost = Calculate.round(processingCost, 4);
            materialCost = Calculate.round(materialCost, 4);
            otherOverheads = Calculate.round(otherOverheads, 4);
            taxRate1 = Calculate.round(taxRate1, 4);
            taxRate2 = Calculate.round(taxRate2, 4);
            taxRate3 = Calculate.round(taxRate3, 4);
            costTotal = Calculate.round(costTotal, 4);
            puchOdrAmount = Calculate.round(puchOdrAmount, 4);
            netAmount = Calculate.round(netAmount, 4);
            discAmount = Calculate.round(discAmount, 4);
            taxAmount1 = Calculate.round(taxAmount1, 4);
            taxAmount2 = Calculate.round(taxAmount2, 4);
            taxAmount3 = Calculate.round(taxAmount3, 4);
            taxAmountTotal = Calculate.round(taxAmountTotal, 4);
            amountIncludeTax = Calculate.round(amountIncludeTax, 4);

            // ���z�Ƀ[����t��
            unitCost = Calculate.formatNumric(unitCost, 1);
            processingCost = Calculate.formatNumric(processingCost, 1);
            materialCost = Calculate.formatNumric(materialCost, 1);
            otherOverheads = Calculate.formatNumric(otherOverheads, 1);
            taxRate1 = Calculate.formatNumric(taxRate1, 1);
            taxRate2 = Calculate.formatNumric(taxRate2, 1);
            taxRate3 = Calculate.formatNumric(taxRate3, 1);
            costTotal = Calculate.formatNumric(costTotal, 1);
            puchOdrAmount = Calculate.formatNumric(puchOdrAmount, 1);
            netAmount = Calculate.formatNumric(netAmount, 1);
            discAmount = Calculate.formatNumric(discAmount, 1);
            taxAmount1 = Calculate.formatNumric(taxAmount1, 1);
            taxAmount2 = Calculate.formatNumric(taxAmount2, 1);
            taxAmount3 = Calculate.formatNumric(taxAmount3, 1);
            taxAmountTotal = Calculate.formatNumric(taxAmountTotal, 1);
            amountIncludeTax = Calculate.formatNumric(amountIncludeTax, 1);

            // UnitCostStruct�Ƀf�[�^�ݒ�
            rUnitCost.setTAX_CD(taxCd);
            rUnitCost.setUNIT_COST_TYP(unitCostTyp);
            rUnitCost.setUNIT_COST(unitCost);
            rUnitCost.setPROCESSING_COST(processingCost);
            rUnitCost.setMATERIAL_COST(materialCost);
            rUnitCost.setOTHER_OVERHEADS(otherOverheads);
            rUnitCost.setCOST_TOTAL(costTotal);
            rUnitCost.setPUCH_ODR_AMOUNT(puchOdrAmount);
            rUnitCost.setTAX_RATE_1(taxRate1);
            rUnitCost.setTAX_RATE_2(taxRate2);
            rUnitCost.setTAX_RATE_3(taxRate3);
            rUnitCost.setNET_AMOUNT(netAmount);
            rUnitCost.setDISC_AMOUNT(discAmount);
            rUnitCost.setTAX_AMOUNT_1(taxAmount1);
            rUnitCost.setTAX_AMOUNT_2(taxAmount2);
            rUnitCost.setTAX_AMOUNT_3(taxAmount3);
            rUnitCost.setTAX_AMOUNT_TOTAL(taxAmountTotal);
            rUnitCost.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
            rUnitCost.setTAX_ROUND_TYP(taxRoundTyp);
            rUnitCost.setROUND_TYP(roundTyp);

            return rUnitCost;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (unitCostRs != null) {
                 unitCostRs.close();
            }
            if (unitCostPs != null) {
                unitCostPs.close();
            }
            if (vendCtrlRs != null) {
                 vendCtrlRs.close();
            }
            if (vendCtrlPs != null) {
                 vendCtrlPs.close();
            }
            if (itemRs != null) {
                 itemRs.close();
            }
            if (itemPs != null) {
                 itemPs.close();
            }
            if (taxRs != null) {
                 taxRs.close();
            }
            if (taxPs != null) {
                 taxPs.close();
            }
        }
    }
}