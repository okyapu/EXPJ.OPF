package com.nec.jp.orteus.metamorBase.common03.ContractUnitCost;

/**
 * �P�����ێ��N���X
 */
public class ContractUnitCostStruct{
	//�O���P���L���J�n��
	private String EFF_PHASE_IN_DATE = null;
	//�T�C�Y
	private String SBCNT_SIZE = null;
	//�O���P���敪
	private String UNIT_COST_TYP = null;
	//�O���P��
	private String UNIT_COST = null;
	//�O�����H��
	private String PROCESSING_COST = null;
	//�O���ޗ���
	private String MATERIAL_COST = null;
	//�O�����̑��o��
	private String OTHER_OVERHEADS = null;
	//�󒍋��z
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

