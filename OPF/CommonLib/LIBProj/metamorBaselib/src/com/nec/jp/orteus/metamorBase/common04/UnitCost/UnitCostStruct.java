/*
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.UnitCost;

/**
 * 単価読み込み用のデータクラス。<BR>
 * @author HNES上田
 * @version 1.00
 */
public class UnitCostStruct {
    private String TAX_CD = null;
    private String UNIT_COST_TYP = null;
    private String UNIT_COST = null;
    private String PROCESSING_COST = null;
    private String MATERIAL_COST = null;
    private String OTHER_OVERHEADS = null;
    private String COST_TOTAL = null;
    private String PUCH_ODR_AMOUNT = null;
    private String TAX_RATE_1 = null;
    private String TAX_RATE_2 = null;
    private String TAX_RATE_3 = null;
    private String NET_AMOUNT = null;
    private String DISC_AMOUNT = null;
    private String TAX_AMOUNT_1 = null;
    private String TAX_AMOUNT_2 = null;
    private String TAX_AMOUNT_3 = null;
    private String TAX_AMOUNT_TOTAL = null;
    private String AMOUNT_INCLUDE_TAX = null;
    private String TAX_ROUND_TYP = null;
    private String ROUND_TYP = null;


    /**
     * オブジェクトを構築する。
     */
    public UnitCostStruct() {
    }

    public String getTAX_CD() {
        return TAX_CD;
    }

    public String getUNIT_COST_TYP() {
        return UNIT_COST_TYP;
    }

    public String getUNIT_COST() {
        return UNIT_COST;
    }

    public String getPROCESSING_COST() {
        return PROCESSING_COST;
    }

    public String getMATERIAL_COST() {
        return MATERIAL_COST;
    }

    public String getOTHER_OVERHEADS() {
        return OTHER_OVERHEADS;
    }

    public String getCOST_TOTAL() {
        return COST_TOTAL;
    }

    public String getPUCH_ODR_AMOUNT() {
        return PUCH_ODR_AMOUNT;
    }

    public String getTAX_RATE_1() {
        return TAX_RATE_1;
    }

    public String getTAX_RATE_2() {
        return TAX_RATE_2;
    }

    public String getTAX_RATE_3() {
        return TAX_RATE_3;
    }

    public String getNET_AMOUNT() {
        return NET_AMOUNT;
    }

    public String getDISC_AMOUNT() {
        return DISC_AMOUNT;
    }

    public String getTAX_AMOUNT_1() {
        return TAX_AMOUNT_1;
    }

    public String getTAX_AMOUNT_2() {
        return TAX_AMOUNT_2;
    }

    public String getTAX_AMOUNT_3() {
        return TAX_AMOUNT_3;
    }

    public String getTAX_AMOUNT_TOTAL() {
        return TAX_AMOUNT_TOTAL;
    }

    public String getAMOUNT_INCLUDE_TAX() {
        return AMOUNT_INCLUDE_TAX;
    }

    public String getTAX_ROUND_TYP() {
        return TAX_ROUND_TYP;
    }

    public String getROUND_TYP() {
        return ROUND_TYP;
    }

    public void setTAX_CD(String s) {
        TAX_CD = s;
    }

    public void setUNIT_COST_TYP(String s) {
        UNIT_COST_TYP = s;
    }

    public void setUNIT_COST(String s) {
        UNIT_COST = s;
    }

    public void setPROCESSING_COST(String s) {
        PROCESSING_COST = s;
    }

    public void setMATERIAL_COST(String s) {
        MATERIAL_COST = s;
    }

    public void setOTHER_OVERHEADS(String s) {
        OTHER_OVERHEADS = s;
    }

    public void setCOST_TOTAL(String s) {
        COST_TOTAL = s;
    }

    public void setPUCH_ODR_AMOUNT(String s) {
        PUCH_ODR_AMOUNT = s;
    }

    public void setTAX_RATE_1(String s) {
        TAX_RATE_1 = s;
    }

    public void setTAX_RATE_2(String s) {
        TAX_RATE_2 = s;
    }

    public void setTAX_RATE_3(String s) {
        TAX_RATE_3 = s;
    }

    public void setNET_AMOUNT(String s) {
        NET_AMOUNT = s;
    }

    public void setDISC_AMOUNT(String s) {
        DISC_AMOUNT = s;
    }

    public void setTAX_AMOUNT_1(String s) {
        TAX_AMOUNT_1 = s;
    }

    public void setTAX_AMOUNT_2(String s) {
        TAX_AMOUNT_2 = s;
    }

    public void setTAX_AMOUNT_3(String s) {
        TAX_AMOUNT_3 = s;
    }

    public void setTAX_AMOUNT_TOTAL(String s) {
        TAX_AMOUNT_TOTAL = s;
    }

    public void setAMOUNT_INCLUDE_TAX(String s) {
        AMOUNT_INCLUDE_TAX = s;
    }

    public void setTAX_ROUND_TYP(String s) {
        TAX_ROUND_TYP = s;
    }

    public void setROUND_TYP(String s) {
        ROUND_TYP = s;
    }
}