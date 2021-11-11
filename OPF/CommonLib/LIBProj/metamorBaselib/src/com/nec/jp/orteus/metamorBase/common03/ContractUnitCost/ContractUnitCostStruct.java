package com.nec.jp.orteus.metamorBase.common03.ContractUnitCost;

/**
 * 単価情報保持クラス
 */
public class ContractUnitCostStruct{
	//外注単価有効開始日
	private String EFF_PHASE_IN_DATE = null;
	//サイズ
	private String SBCNT_SIZE = null;
	//外注単価区分
	private String UNIT_COST_TYP = null;
	//外注単価
	private String UNIT_COST = null;
	//外注加工費
	private String PROCESSING_COST = null;
	//外注材料費
	private String MATERIAL_COST = null;
	//外注その他経費
	private String OTHER_OVERHEADS = null;
	//受注金額
	private String PUCH_ODR_AMOUNT = null;

	public void setEFF_PHASE_IN_DATE(String val){ this.EFF_PHASE_IN_DATE = val; }
	public void setSBCNT_SIZE(String val){ this.SBCNT_SIZE = val; }
	public void setUNIT_COST_TYP(String val){ this.UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val){ this.UNIT_COST = val; }
	public void setPROCESSING_COST(String val){ this.PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val){ this.MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val){ this.OTHER_OVERHEADS = val; }
	public void setPUCH_ODR_AMOUNT(String val){ this.PUCH_ODR_AMOUNT = val; }

	public String getEFF_PHASE_IN_DATE(){ return this.EFF_PHASE_IN_DATE; }
	public String getSBCNT_SIZE(){ return this.SBCNT_SIZE; }
	public String getUNIT_COST_TYP(){ return this.UNIT_COST_TYP; }
	public String getUNIT_COST(){ return this.UNIT_COST; }
	public String getPROCESSING_COST(){ return this.PROCESSING_COST; }
	public String getMATERIAL_COST(){ return this.MATERIAL_COST; }
	public String getOTHER_OVERHEADS(){ return this.OTHER_OVERHEADS; }
	public String getPUCH_ODR_AMOUNT(){ return this.PUCH_ODR_AMOUNT; }
}

