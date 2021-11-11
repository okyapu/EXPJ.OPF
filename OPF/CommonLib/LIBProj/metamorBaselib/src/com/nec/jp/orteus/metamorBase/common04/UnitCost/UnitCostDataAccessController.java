/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.UnitCost;

import java.sql.*;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 単価読み込み制御クラス
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2008/03/26 07:28:34 $
 */
public class UnitCostDataAccessController {
    /** DBアクセス用のコネクション */
    private IDbConnection conn = null;

    /** データ取得用のSQL */
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
     * オブジェクトを構築する。
     */
    public UnitCostDataAccessController() {
    }

    /**
     * 指定のコネクションを持つオブジェクトを構築する。
     *
     * @param  connect コネクションがOPENされているIDbConnection
     */
    public UnitCostDataAccessController(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * コネクション設定。<BR>
     * コネクションの参照を無効にする場合、引数にnullを設定すること。
     *
     * @param  connect コネクションがOPENされているIDbConnection
     */
    public void setConnection(IDbConnection connect) {
        this.conn = connect;
    }

    /**
     * 単価情報取得
     * @param venderCode 取引先コード
     * @param plantCode 工場コード
     * @param itemCode 品目番号
     * @param effPhaseInDate 発注予定日
     * @param puchSize 発注数
     * @return 取得したデータ
     * @throws SQLException SQLの発行に失敗した場合
     * @throws UnitCostException 消費税データが0件の場合
     */
    public UnitCostStruct getData(String venderCode,
                                  String plantCode,
                                  String itemCode,
                                  String effPhaseInDate,
                                  String puchSize) throws SQLException,
            UnitCostException {

        // データ
        UnitCostStruct rUnitCost = new UnitCostStruct();

        // 単価マスタ用ステートメント
        PreparedStatement unitCostPs = null;
        // 単価マスタ用リザルトセット
        ResultSet unitCostRs = null;
        // 取引先マスタ用ステートメント
        PreparedStatement vendCtrlPs = null;
        // 取引先マスタ用リザルトセット
        ResultSet vendCtrlRs =null;
        // 品目マスタ用ステートメント
        PreparedStatement itemPs = null;
        // 品目マスタ用リザルトセット
        ResultSet itemRs = null;
        // 消費税区分マスタ用ステートメント
        PreparedStatement taxPs = null;
        // 消費税区分マスタ用リザルトセット
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
            // SQL作成
            unitCostPs = this.conn.getConn().prepareStatement(this.selectSql);
            unitCostPs.setString(1, venderCode);
            unitCostPs.setString(2, plantCode);
            unitCostPs.setString(3, itemCode);
            unitCostPs.setString(4, effPhaseInDate);
            unitCostPs.setString(5, puchSize);

            // SQL実行
            unitCostRs = unitCostPs.executeQuery();

            // 結果を設定
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

            // 取引先マスタを検索
            vendCtrlPs = this.conn.getConn().prepareStatement(
                    this.selectVendCtrlSql);
            vendCtrlPs.setString(1, venderCode);
            vendCtrlRs = vendCtrlPs.executeQuery();
            // 存在しない場合はエラー
            if (!vendCtrlRs.next()) {
                throw new UnitCostException();
            }

            roundTyp = vendCtrlRs.getString("ROUND_TYP");

            // 品目番号がnullまたは、
            // ［取引先］.”消費税適用区分”が、
            // 1(品目)の場合、［品目］.”消費税コード”キーにする
            // 2(取引先)の場合、[取引先コード]."消費税コード”をキーにする
            if (itemCode == null
                || itemCode.length() <= 0
                || "2".equals(vendCtrlRs.getString("TAX_APPLY_TYP"))) {

                taxCd = vendCtrlRs.getString("TAX_CD");
            } else {
                // 品目マスタを検索
                itemPs = this.conn.getConn().prepareStatement(this.
                        selectItemSql);
                itemPs.setString(1, itemCode);
                itemRs = itemPs.executeQuery();
                // 存在しない場合はエラー
                if (!itemRs.next()) {
                    throw new UnitCostException();
                }

                taxCd = itemRs.getString("TAX_CD");
            }


            // 消費税区分マスタを検索
            taxPs = this.conn.getConn().prepareStatement(this.selectTaxSql);
            taxPs.setString(1, taxCd);
            taxPs.setString(2, effPhaseInDate);
            taxPs.setString(3, taxCd);
            taxPs.setString(4, effPhaseInDate);
            taxRs = taxPs.executeQuery();

            // 存在しない場合はエラー
            if (!taxRs.next()) {
                throw new UnitCostException();
            }

            taxRoundTyp = taxRs.getString("TAX_ROUND_TYP");
            // TAX_CDの下1桁が1以外の場合は税率を0とする。
            if (taxCd.substring(taxCd.length() - 1).equals("1")) {
                taxRate1 = taxRs.getString("TAX_RATE_1");
                taxRate2 = taxRs.getString("TAX_RATE_2");
                taxRate3 = taxRs.getString("TAX_RATE_3");
            } else {
                taxRate1 = "0";
                taxRate2 = "0";
                taxRate3 = "0";
            }

            // 各金額の計算
            // 値引き
            discAmount = "0";
            // 経費計の計算
            costTotal = Calculate.add(materialCost, otherOverheads);
            costTotal = Calculate.add(processingCost, costTotal);
            // 発注金額の計算
            puchOdrAmount = Calculate.multiply(unitCost, puchSize);
            if (roundTyp.equals("2")) {
                puchOdrAmount = Calculate.ceil(puchOdrAmount, 0);
            } else if (roundTyp.equals("3")) {
                puchOdrAmount = Calculate.floor(puchOdrAmount, 0);
            } else {
                puchOdrAmount = Calculate.round(puchOdrAmount, 0);
            }
            // 本体金額の計算
            netAmount = Calculate.subtract(puchOdrAmount, discAmount);

            // TAX_CDの下1桁が1以外の場合は税率が0なので、税額も0にする。
            if (taxCd.substring(taxCd.length() - 1).equals("1")) {
                // 税額１の計算
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
                // 税額２の計算
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
                // 税額３の計算
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
                // 税額１～３の計算
                taxAmount1 = "0";
                taxAmount2 = "0";
                taxAmount3 = "0";
            }

            // 税額計の計算
            taxAmountTotal = Calculate.add(taxAmount1, taxAmount2);
            taxAmountTotal = Calculate.add(taxAmountTotal, taxAmount3);
            // 税込み金額の計算
            amountIncludeTax = Calculate.add(netAmount, taxAmountTotal);

            // 金額を小数点4桁で丸め（四捨五入）
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

            // 金額にゼロを付加
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

            // UnitCostStructにデータ設定
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