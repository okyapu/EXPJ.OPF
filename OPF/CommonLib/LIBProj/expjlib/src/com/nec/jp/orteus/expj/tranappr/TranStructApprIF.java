/*	
* $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/tranappr/TranStructApprIF.java,v $	
*	
 * Copyright (c) 2003-2004 NEC Corporation.	
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.	
 */	
package com.nec.jp.orteus.expj.tranappr;	
	
/**	
 * <pre>	
 * �g�������F�C���^�t�F�[�X	
 * </pre>	
 * @author $Author: pang-zw $	
 * @version $Revision: 1.2 $ $Date: 2008/12/26 05:21:50 $	
 *	
 **/	
public abstract interface TranStructApprIF {	
	
	
	//KQ1070
	
	/**
	 * �ϐ��@PURPOSE_UNIT_PRICE_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP_name() ; 
	
	/**
	 * �ϐ��@PURPOSE_UNIT_PRICE_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP_val() ; 
	
	/**
	 * �ϐ��@AMOUNT_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP_name() ; 
	
	/**
	 * �ϐ��@AMOUNT_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP_val() ; 
	
	/**
	 * �ϐ��@EDI_DATA_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP_name() ; 
	
	/**
	 * �ϐ��@EDI_DATA_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP_val() ; 
	
	/**
	 * �ϐ��@DEPOT_PLAN_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP_name() ; 
	
	/**
	 * �ϐ��@DEPOT_PLAN_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP_val() ; 
	
	/**
	 * �ϐ��@ENTRY_TYP_2_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2_name() ; 
	
	/**
	 * �ϐ��@ENTRY_TYP_2_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2_val() ; 
	
	/**
	 * �ϐ��@COMPANY_CD_hidden�̎擾<BR>
	 * @return String
	 */
	public abstract String getCOMPANY_CD_hidden() ; 
	
	/**
	 * �ϐ��@BTN_DesinatedDlvDate�̎擾<BR>
	 * @return String
	 */
	public abstract String getBTN_DesinatedDlvDate() ; 
	
	/**
	 * �ϐ��@BUSINESSOPRDATE_hidden�̎擾<BR>
	 * @return String
	 */
	public abstract String getBUSINESSOPRDATE_hidden() ; 
	
	/**
	 * �ϐ��@UNCNFM_ODR_CTL_NO_BK�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_CTL_NO_BK() ; 
	
	/**
	 * �ϐ��@UNCNFM_PLAN_TAKE_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP_name() ; 
	
	/**
	 * �ϐ��@UNCNFM_PLAN_TAKE_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP_val() ; 
	
	/**
	 * �ϐ��@h_APR_JA_UNCNFM_ODR�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_APR_JA_UNCNFM_ODR() ; 
	
	/**
	 * �ϐ��@APPR_REMARKS�̎擾<BR>
	 * @return String
	 */
	public abstract String getAPPR_REMARKS() ; 
	
	/**
	 * �ϐ��@h_APPR_ID�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_APPR_ID() ; 
	
	/**
	 * �ϐ��@h_SCREENMOVE_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_SCREENMOVE_TYP() ; 
	
	/**
	 * �ϐ��@UNCNFM_ODR_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_CTL_NO() ; 
	
	/**
	 * �ϐ��@IN_COMPANY_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_COMPANY_CD() ; 
	
	/**
	 * �ϐ��@CUST_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_CD() ; 
	
	/**
	 * �ϐ��@CUST_ITEM_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_ITEM_CD() ; 
	
	/**
	 * �ϐ��@CUST_ITEM_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_ITEM_NAME() ; 
	
	/**
	 * �ϐ��@CUST_CHRG_ORG_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_ORG_CD() ; 
	
	/**
	 * �ϐ��@CUST_CHRG_PSN_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_PSN_CD() ; 
	
	/**
	 * �ϐ��@ACPT_ORG_CD_hidden�̎擾<BR>
	 * @return String
	 */
	public abstract String getACPT_ORG_CD_hidden() ; 
	
	/**
	 * �ϐ��@ACPT_PSN_CD_hidden�̎擾<BR>
	 * @return String
	 */
	public abstract String getACPT_PSN_CD_hidden() ; 
	
	/**
	 * �ϐ��@ITEM_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getITEM_CD() ; 
	
	/**
	 * �ϐ��@CUST_UNCNFM_ODR_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_UNCNFM_ODR_NO() ; 
	
	/**
	 * �ϐ��@FINAL_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getFINAL_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@CUST_DESINATED_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@CONCENTRATE_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@DESINATED_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE() ; 

	/**
	 * �ϐ��@CONCENTRATE_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DATE() ; 

	/**
	 * �ϐ��@SHIP_PLAN_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLAN_DATE() ; 

	/**
	 * �ϐ��@STNDRD_RCV_DESINATED_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getSTNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * �ϐ��@PURPOSE_UNIT_PRICE_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP() ; 

	/**
	 * �ϐ��@UNCNFM_ODR_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_QTY() ; 

	/**
	 * �ϐ��@AMOUNT_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP() ; 

	/**
	 * �ϐ��@DEPOT_PLAN_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP() ; 

	/**
	 * �ϐ��@DLV_LOC_OPTION_CHANGE_VALUE�̎擾<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * �ϐ��@ITEM_CD_OPTION_CHANGE_VALUE�̎擾<BR>
	 * @return String
	 */
	public abstract String getITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * �ϐ��@ENTRY_TYP_2�̎擾<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2() ; 

	/**
	 * �ϐ��@EDI_DATA_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP() ; 

	/**
	 * �ϐ��@EDI_DISCRIMINATION_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getEDI_DISCRIMINATION_CD() ; 

	/**
	 * �ϐ��@ARRANGEMENTS_CHARACTERISTIC�̎擾<BR>
	 * @return String
	 */
	public abstract String getARRANGEMENTS_CHARACTERISTIC() ; 

	/**
	 * �ϐ��@UNCNFM_PLAN_TAKE_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP() ; 

	/**
	 * �ϐ��@UNCNFM_REQUIRED_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_DATE() ; 

	/**
	 * �ϐ��@UNCNFM_REQUIRED_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_QTY() ; 

	/**
	 * �ϐ��@ORG_UNCNFM_REQUIRED_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * �ϐ��@LAST_UNCNFM_REQUIRED_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getLAST_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * �ϐ��@WORK_DAY_DIVISION_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getWORK_DAY_DIVISION_FLG() ; 

	/**
	 * �ϐ��@MANUAL_UPDATE_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getMANUAL_UPDATE_FLG() ; 

	/**
	 * �ϐ��@REMARKS�̎擾<BR>
	 * @return String
	 */
	public abstract String getREMARKS() ; 

	/**
	 * �ϐ��@UNCNFM_CUST_ODR_CREATE_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_CUST_ODR_CREATE_DATE() ; 

	/**
	 * �ϐ��@ORG_UNCNFM_ODR_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_ODR_CTL_NO() ; 

	/**
	 * �ϐ��@UNCNFM_ODR_IF_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_IF_CTL_NO() ; 

	/**
	 * �ϐ��@DEL_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEL_FLG() ; 

	/**
	 * �ϐ��@IN_MODIFY_COUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_MODIFY_COUNT() ; 

	/**
	 * �ϐ��@CUST_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_NAME() ; 

	/**
	 * �ϐ��@CUST_DESINATED_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@FINAL_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getFINAL_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@CONCENTRATE_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@ITEM_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getITEM_NAME() ; 

	/**
	 * �ϐ��@UNCNFM_ODR_QTY_STOCK_UNIT�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_QTY_STOCK_UNIT() ; 

	/**
	 * �ϐ��@LAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT�̎擾<BR>
	 * @return String
	 */
	public abstract String getLAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * �ϐ��@UNCNFM_REQUIRED_QTY_STOCK_UNIT�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * �ϐ��@ORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT�̎擾<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * �ϐ��@CUST_CHRG_ORG_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_ORG_NAME() ; 

	/**
	 * �ϐ��@CUST_CHRG_PSN_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_PSN_NAME() ; 

	/**
	 * �ϐ��@IN_BUSINESS_OPR_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_BUSINESS_OPR_DATE() ; 

	/**
	 * �ϐ��@APPR_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getAPPR_DATE() ; 

	/**
	 * �ϐ��@APPR_BY�̎擾<BR>
	 * @return String
	 */
	public abstract String getAPPR_BY() ; 

	/**
	 * �ϐ��@MOTO_UNCNFM_REQUIRED_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getMOTO_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * �ϐ��@chkCUST_DESINATED_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getchkCUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@UNIT_QTY_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNIT_QTY_TYP() ; 

	/**
	 * �ϐ��@dummy�̎擾<BR>
	 * @return String
	 */
	public abstract String getdummy() ; 

	/**
	 * �ϐ��@APPR_ID�̎擾<BR>
	 * @return String
	 */
	public abstract String getAPPR_ID() ; 

	/**
	 * �ϐ��@PURPOSE_UNIT_PRICE_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP_name(String val) ; 

	/**
	 * �ϐ��@PURPOSE_UNIT_PRICE_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP_val(String val) ; 

	/**
	 * �ϐ��@AMOUNT_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP_name(String val) ; 

	/**
	 * �ϐ��@AMOUNT_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP_val(String val) ; 

	/**
	 * �ϐ��@EDI_DATA_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP_name(String val) ; 

	/**
	 * �ϐ��@EDI_DATA_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP_val(String val) ; 

	/**
	 * �ϐ��@DEPOT_PLAN_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP_name(String val) ; 

	/**
	 * �ϐ��@DEPOT_PLAN_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP_val(String val) ; 

	/**
	 * �ϐ��@ENTRY_TYP_2_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2_name(String val) ; 

	/**
	 * �ϐ��@ENTRY_TYP_2_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2_val(String val) ; 

	/**
	 * �ϐ��@COMPANY_CD_hidden�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCOMPANY_CD_hidden(String val) ; 

	/**
	 * �ϐ��@BTN_DesinatedDlvDate�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBTN_DesinatedDlvDate(String val) ; 

	/**
	 * �ϐ��@BUSINESSOPRDATE_hidden�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBUSINESSOPRDATE_hidden(String val) ; 

	/**
	 * �ϐ��@UNCNFM_ODR_CTL_NO_BK�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_CTL_NO_BK(String val) ; 

	/**
	 * �ϐ��@UNCNFM_PLAN_TAKE_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP_name(String val) ; 

	/**
	 * �ϐ��@UNCNFM_PLAN_TAKE_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP_val(String val) ; 

	/**
	 * �ϐ��@h_APR_JA_UNCNFM_ODR�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_APR_JA_UNCNFM_ODR(String val) ; 

	/**
	 * �ϐ��@APPR_REMARKS�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setAPPR_REMARKS(String val) ; 

	/**
	 * �ϐ��@h_APPR_ID�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_APPR_ID(String val) ; 

	/**
	 * �ϐ��@h_SCREENMOVE_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_SCREENMOVE_TYP(String val) ; 

	/**
	 * �ϐ��@UNCNFM_ODR_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * �ϐ��@IN_COMPANY_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_COMPANY_CD(String val) ; 

	/**
	 * �ϐ��@CUST_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_CD(String val) ; 

	/**
	 * �ϐ��@CUST_ITEM_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_ITEM_CD(String val) ; 

	/**
	 * �ϐ��@CUST_ITEM_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_ITEM_NAME(String val) ; 

	/**
	 * �ϐ��@CUST_CHRG_ORG_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_ORG_CD(String val) ; 

	/**
	 * �ϐ��@CUST_CHRG_PSN_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_PSN_CD(String val) ; 

	/**
	 * �ϐ��@ACPT_ORG_CD_hidden�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setACPT_ORG_CD_hidden(String val) ; 

	/**
	 * �ϐ��@ACPT_PSN_CD_hidden�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setACPT_PSN_CD_hidden(String val) ; 

	/**
	 * �ϐ��@ITEM_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setITEM_CD(String val) ; 

	/**
	 * �ϐ��@CUST_UNCNFM_ODR_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_UNCNFM_ODR_NO(String val) ; 

	/**
	 * �ϐ��@FINAL_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setFINAL_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@CUST_DESINATED_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@CONCENTRATE_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@DESINATED_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@CONCENTRATE_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DATE(String val) ; 

	/**
	 * �ϐ��@SHIP_PLAN_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLAN_DATE(String val) ; 

	/**
	 * �ϐ��@STNDRD_RCV_DESINATED_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSTNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@PURPOSE_UNIT_PRICE_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP(String val) ; 

	/**
	 * �ϐ��@UNCNFM_ODR_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_QTY(String val) ; 

	/**
	 * �ϐ��@AMOUNT_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP(String val) ; 

	/**
	 * �ϐ��@DEPOT_PLAN_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP(String val) ; 

	/**
	 * �ϐ��@DLV_LOC_OPTION_CHANGE_VALUE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * �ϐ��@ITEM_CD_OPTION_CHANGE_VALUE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * �ϐ��@ENTRY_TYP_2�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2(String val) ; 

	/**
	 * �ϐ��@EDI_DATA_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP(String val) ; 

	/**
	 * �ϐ��@EDI_DISCRIMINATION_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEDI_DISCRIMINATION_CD(String val) ; 

	/**
	 * �ϐ��@ARRANGEMENTS_CHARACTERISTIC�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setARRANGEMENTS_CHARACTERISTIC(String val) ; 

	/**
	 * �ϐ��@UNCNFM_PLAN_TAKE_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP(String val) ; 

	/**
	 * �ϐ��@UNCNFM_REQUIRED_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_DATE(String val) ; 

	/**
	 * �ϐ��@UNCNFM_REQUIRED_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * �ϐ��@ORG_UNCNFM_REQUIRED_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * �ϐ��@LAST_UNCNFM_REQUIRED_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setLAST_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * �ϐ��@WORK_DAY_DIVISION_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setWORK_DAY_DIVISION_FLG(String val) ; 

	/**
	 * �ϐ��@MANUAL_UPDATE_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setMANUAL_UPDATE_FLG(String val) ; 

	/**
	 * �ϐ��@REMARKS�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setREMARKS(String val) ; 

	/**
	 * �ϐ��@UNCNFM_CUST_ODR_CREATE_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_CUST_ODR_CREATE_DATE(String val) ; 

	/**
	 * �ϐ��@ORG_UNCNFM_ODR_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * �ϐ��@UNCNFM_ODR_IF_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_IF_CTL_NO(String val) ; 

	/**
	 * �ϐ��@DEL_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEL_FLG(String val) ; 

	/**
	 * �ϐ��@IN_MODIFY_COUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_MODIFY_COUNT(String val) ; 

	/**
	 * �ϐ��@CUST_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_NAME(String val) ; 

	/**
	 * �ϐ��@CUST_DESINATED_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@FINAL_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setFINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@CONCENTRATE_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@ITEM_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setITEM_NAME(String val) ; 

	/**
	 * �ϐ��@UNCNFM_ODR_QTY_STOCK_UNIT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_QTY_STOCK_UNIT(String val) ; 

	/**
	 * �ϐ��@LAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setLAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * �ϐ��@UNCNFM_REQUIRED_QTY_STOCK_UNIT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * �ϐ��@ORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * �ϐ��@CUST_CHRG_ORG_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_ORG_NAME(String val) ; 

	/**
	 * �ϐ��@CUST_CHRG_PSN_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_PSN_NAME(String val) ; 

	/**
	 * �ϐ��@IN_BUSINESS_OPR_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_BUSINESS_OPR_DATE(String val) ; 

	/**
	 * �ϐ��@APPR_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setAPPR_DATE(String val) ; 

	/**
	 * �ϐ��@APPR_BY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setAPPR_BY(String val) ; 

	/**
	 * �ϐ��@MOTO_UNCNFM_REQUIRED_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setMOTO_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * �ϐ��@chkCUST_DESINATED_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setchkCUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@UNIT_QTY_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNIT_QTY_TYP(String val) ; 

	/**
	 * �ϐ��@dummy�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setdummy(String val) ; 

	/**
	 * �ϐ��@APPR_ID�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setAPPR_ID(String val) ; 

	//KQ1080

	/**
	 * �ϐ��@PARTS_SUP_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP_name() ; 

	/**
	 * �ϐ��@PARTS_SUP_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP_val() ; 

	/**
	 * �ϐ��@EST_CONF_SET_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getEST_CONF_SET_FLG() ; 

	/**
	 * �ϐ��@BTN_SALES_UNIT_PRICE�̎擾<BR>
	 * @return String
	 */
	public abstract String getBTN_SALES_UNIT_PRICE() ; 

	/**
	 * �ϐ��@PURPOSE_KIND_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND_name() ; 

	/**
	 * �ϐ��@PURPOSE_KIND_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND_val() ; 

	/**
	 * �ϐ��@ODR_CTL_NO_BK�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_CTL_NO_BK() ; 

	/**
	 * �ϐ��@EXCH_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP_name() ; 

	/**
	 * �ϐ��@EXCH_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP_val() ; 

	/**
	 * �ϐ��@TAX_APPLY_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP_name() ; 

	/**
	 * �ϐ��@TAX_APPLY_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP_val() ; 

	/**
	 * �ϐ��@TAX_CALC_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP_name() ; 

	/**
	 * �ϐ��@TAX_CALC_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP_val() ; 

	/**
	 * �ϐ��@TRANSPORT_TYP_name�̎擾<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP_name() ; 

	/**
	 * �ϐ��@TRANSPORT_TYP_val�̎擾<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP_val() ; 

	/**
	 * �ϐ��@h_APR_JA_ODR�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_APR_JA_ODR() ; 

	/**
	 * �ϐ��@ODR_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_CTL_NO() ; 

	/**
	 * �ϐ��@CUST_ODR_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_ODR_NO() ; 

	/**
	 * �ϐ��@DESINATED_DLV_DATE_TIME�̎擾<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE_TIME() ; 

	/**
	 * �ϐ��@DESINATED_DLV_DATE_ALL�̎擾<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE_ALL() ; 

	/**
	 * �ϐ��@ODR_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_QTY() ; 

	/**
	 * �ϐ��@ODR_AMOUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_AMOUNT() ; 

	/**
	 * �ϐ��@UNIT_PRICE�̎擾<BR>
	 * @return String
	 */
	public abstract String getUNIT_PRICE() ; 

	/**
	 * �ϐ��@CUR_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUR_CD() ; 

	/**
	 * �ϐ��@EXCH_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP() ; 

	/**
	 * �ϐ��@TAX_APPLY_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP() ; 

	/**
	 * �ϐ��@TAX_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_CD() ; 

	/**
	 * �ϐ��@TAX_CALC_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP() ; 

	/**
	 * �ϐ��@PART_DLV_COUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getPART_DLV_COUNT() ; 

	/**
	 * �ϐ��@SHIP_COUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_COUNT() ; 

	/**
	 * �ϐ��@LAST_ODR_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getLAST_ODR_QTY() ; 

	/**
	 * �ϐ��@ODR_AMOUNT_EXCH_RATES�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_AMOUNT_EXCH_RATES() ; 

	/**
	 * �ϐ��@TOTAL_SHIP_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getTOTAL_SHIP_QTY() ; 

	/**
	 * �ϐ��@SHIP_AMOUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_AMOUNT() ; 

	/**
	 * �ϐ��@SHIP_AMOUNT_EXCH_RATES�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_AMOUNT_EXCH_RATES() ; 

	/**
	 * �ϐ��@RETURN_PRICE�̎擾<BR>
	 * @return String
	 */
	public abstract String getRETURN_PRICE() ; 

	/**
	 * �ϐ��@RETURN_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getRETURN_QTY() ; 

	/**
	 * �ϐ��@RETURN_AMOUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getRETURN_AMOUNT() ; 

	/**
	 * �ϐ��@RETURN_AMOUNT_EXCH_RATES�̎擾<BR>
	 * @return String
	 */
	public abstract String getRETURN_AMOUNT_EXCH_RATES() ; 

	/**
	 * �ϐ��@ODR_CMPLT_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_CMPLT_FLG() ; 

	/**
	 * �ϐ��@ODR_CMPLT_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_CMPLT_DATE() ; 

	/**
	 * �ϐ��@TRANSPORT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_CD() ; 

	/**
	 * �ϐ��@TRANSPORT_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP() ; 

	/**
	 * �ϐ��@SHIP_WH_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_WH_CD() ; 

	/**
	 * �ϐ��@IN_HOUSE_SHIP_PLAN_TRANS_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_HOUSE_SHIP_PLAN_TRANS_NO() ; 

	/**
	 * �ϐ��@CUST_DLV_PLAN_TRANS_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_DLV_PLAN_TRANS_NO() ; 

	/**
	 * �ϐ��@SEBANGO�̎擾<BR>
	 * @return String
	 */
	public abstract String getSEBANGO() ; 

	/**
	 * �ϐ��@KANBAN_PAPER_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getKANBAN_PAPER_QTY() ; 

	/**
	 * �ϐ��@SEQUENCE_ID�̎擾<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_ID() ; 

	/**
	 * �ϐ��@SEQUENCE_MARK�̎擾<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_MARK() ; 

	/**
	 * �ϐ��@SEQUENCE_LINE�̎擾<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_LINE() ; 

	/**
	 * �ϐ��@SEQUENCE_CTR_NO_WEIGHT�̎擾<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_CTR_NO_WEIGHT() ; 

	/**
	 * �ϐ��@SEQUENCE_CTR_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_CTR_NO() ; 

	/**
	 * �ϐ��@PURPOSE_KIND�̎擾<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND() ; 

	/**
	 * �ϐ��@KANBAN_CUST_ODR_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getKANBAN_CUST_ODR_FLG() ; 

	/**
	 * �ϐ��@CUS_DLV_KEY_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUS_DLV_KEY_CD() ; 

	/**
	 * �ϐ��@FIRST_LOT_CTL_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getFIRST_LOT_CTL_FLG() ; 

	/**
	 * �ϐ��@IMP_SAFE_PARTS_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getIMP_SAFE_PARTS_FLG() ; 

	/**
	 * �ϐ��@PARTS_SUP_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP() ; 

	/**
	 * �ϐ��@SUP_INFO�̎擾<BR>
	 * @return String
	 */
	public abstract String getSUP_INFO() ; 

	/**
	 * �ϐ��@INSP_INFO�̎擾<BR>
	 * @return String
	 */
	public abstract String getINSP_INFO() ; 

	/**
	 * �ϐ��@CUST_DLV_INFO�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_DLV_INFO() ; 

	/**
	 * �ϐ��@TRIAL_INFO�̎擾<BR>
	 * @return String
	 */
	public abstract String getTRIAL_INFO() ; 

	/**
	 * �ϐ��@DESIGN_CHANGE_INFO�̎擾<BR>
	 * @return String
	 */
	public abstract String getDESIGN_CHANGE_INFO() ; 

	/**
	 * �ϐ��@CUST_ODR_SUB_INFO�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_ODR_SUB_INFO() ; 

	/**
	 * �ϐ��@MANU_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getMANU_LOC_CD() ; 

	/**
	 * �ϐ��@SHIP_REMARKS�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_REMARKS() ; 

	/**
	 * �ϐ��@SALES_REMARKS�̎擾<BR>
	 * @return String
	 */
	public abstract String getSALES_REMARKS() ; 

	/**
	 * �ϐ��@ODR_IF_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_IF_CTL_NO() ; 

	/**
	 * �ϐ��@SHIP_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_FLG() ; 

	/**
	 * �ϐ��@STOCK_UNIT�̎擾<BR>
	 * @return String
	 */
	public abstract String getSTOCK_UNIT() ; 

	/**
	 * �ϐ��@CUR_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUR_NAME() ; 

	/**
	 * �ϐ��@TAX_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getTAX_NAME() ; 

	/**
	 * �ϐ��@IN_EST_CONF_SET_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_EST_CONF_SET_FLG() ; 

	/**
	 * �ϐ��@IN_DETAIL_ROUND_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_DETAIL_ROUND_TYP() ; 

	/**
	 * �ϐ��@HISTORY_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getHISTORY_CTL_NO() ; 

	/**
	 * �ϐ��@NEW_OLD_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getNEW_OLD_FLG() ; 

	/**
	 * �ϐ��@TRAN_TYPE�̎擾<BR>
	 * @return String
	 */
	public abstract String getTRAN_TYPE() ; 

	/**
	 * �ϐ��@IN_ODR_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_ODR_CTL_NO() ; 

	/**
	 * �ϐ��@chkCUST_DESINATED_DLV_LOC�̎擾<BR>
	 * @return String
	 */
	public abstract String getchkCUST_DESINATED_DLV_LOC() ; 

	/**
	 * �ϐ��@JOB_OD_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_OD_CD() ; 

	/**
	 * �ϐ��@SHIP_PLANT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLANT_CD() ; 

	/**
	 * �ϐ��@JOB_ODR_DLV_DATE_ALL�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE_ALL() ; 

	/**
	 * �ϐ��@JOB_ODR_SET_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_SET_FLG() ; 

	/**
	 * �ϐ��@ALCD_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getALCD_QTY() ; 

	/**
	 * �ϐ��@T_ODR_PLANT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getT_ODR_PLANT_CD() ; 
	
	/**
	 * �ϐ��@PARTS_SUP_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP_name(String val) ; 

	/**
	 * �ϐ��@PARTS_SUP_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP_val(String val) ; 

	/**
	 * �ϐ��@EST_CONF_SET_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEST_CONF_SET_FLG(String val) ; 

	/**
	 * �ϐ��@BTN_SALES_UNIT_PRICE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBTN_SALES_UNIT_PRICE(String val) ; 

	/**
	 * �ϐ��@PURPOSE_KIND_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND_name(String val) ; 

	/**
	 * �ϐ��@PURPOSE_KIND_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND_val(String val) ; 

	/**
	 * �ϐ��@ODR_CTL_NO_BK�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_CTL_NO_BK(String val) ; 

	/**
	 * �ϐ��@EXCH_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP_name(String val) ; 

	/**
	 * �ϐ��@EXCH_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP_val(String val) ; 

	/**
	 * �ϐ��@TAX_APPLY_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP_name(String val) ; 

	/**
	 * �ϐ��@TAX_APPLY_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP_val(String val) ; 

	/**
	 * �ϐ��@TAX_CALC_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP_name(String val) ; 

	/**
	 * �ϐ��@TAX_CALC_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP_val(String val) ; 

	/**
	 * �ϐ��@TRANSPORT_TYP_name�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP_name(String val) ; 

	/**
	 * �ϐ��@TRANSPORT_TYP_val�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP_val(String val) ; 

	/**
	 * �ϐ��@h_APR_JA_ODR�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_APR_JA_ODR(String val) ; 

	/**
	 * �ϐ��@ODR_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_CTL_NO(String val) ; 

	/**
	 * �ϐ��@CUST_ODR_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_ODR_NO(String val) ; 

	/**
	 * �ϐ��@DESINATED_DLV_DATE_TIME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE_TIME(String val) ; 

	/**
	 * �ϐ��@DESINATED_DLV_DATE_ALL�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE_ALL(String val) ; 

	/**
	 * �ϐ��@ODR_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_QTY(String val) ; 

	/**
	 * �ϐ��@ODR_AMOUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_AMOUNT(String val) ; 

	/**
	 * �ϐ��@UNIT_PRICE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setUNIT_PRICE(String val) ; 

	/**
	 * �ϐ��@CUR_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUR_CD(String val) ; 

	/**
	 * �ϐ��@EXCH_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP(String val) ; 

	/**
	 * �ϐ��@TAX_APPLY_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP(String val) ; 

	/**
	 * �ϐ��@TAX_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_CD(String val) ; 

	/**
	 * �ϐ��@TAX_CALC_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP(String val) ; 

	/**
	 * �ϐ��@PART_DLV_COUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPART_DLV_COUNT(String val) ; 

	/**
	 * �ϐ��@SHIP_COUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_COUNT(String val) ; 

	/**
	 * �ϐ��@LAST_ODR_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setLAST_ODR_QTY(String val) ; 

	/**
	 * �ϐ��@ODR_AMOUNT_EXCH_RATES�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * �ϐ��@TOTAL_SHIP_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTOTAL_SHIP_QTY(String val) ; 

	/**
	 * �ϐ��@SHIP_AMOUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_AMOUNT(String val) ; 

	/**
	 * �ϐ��@SHIP_AMOUNT_EXCH_RATES�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * �ϐ��@RETURN_PRICE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setRETURN_PRICE(String val) ; 

	/**
	 * �ϐ��@RETURN_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setRETURN_QTY(String val) ; 

	/**
	 * �ϐ��@RETURN_AMOUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setRETURN_AMOUNT(String val) ; 

	/**
	 * �ϐ��@RETURN_AMOUNT_EXCH_RATES�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setRETURN_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * �ϐ��@ODR_CMPLT_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_CMPLT_FLG(String val) ; 

	/**
	 * �ϐ��@ODR_CMPLT_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_CMPLT_DATE(String val) ; 

	/**
	 * �ϐ��@TRANSPORT_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_CD(String val) ; 

	/**
	 * �ϐ��@TRANSPORT_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP(String val) ; 

	/**
	 * �ϐ��@SHIP_WH_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_WH_CD(String val) ; 

	/**
	 * �ϐ��@IN_HOUSE_SHIP_PLAN_TRANS_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_HOUSE_SHIP_PLAN_TRANS_NO(String val) ; 

	/**
	 * �ϐ��@CUST_DLV_PLAN_TRANS_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_DLV_PLAN_TRANS_NO(String val) ; 

	/**
	 * �ϐ��@SEBANGO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSEBANGO(String val) ; 

	/**
	 * �ϐ��@KANBAN_PAPER_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setKANBAN_PAPER_QTY(String val) ; 

	/**
	 * �ϐ��@SEQUENCE_ID�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_ID(String val) ; 

	/**
	 * �ϐ��@SEQUENCE_MARK�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_MARK(String val) ; 

	/**
	 * �ϐ��@SEQUENCE_LINE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_LINE(String val) ; 

	/**
	 * �ϐ��@SEQUENCE_CTR_NO_WEIGHT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_CTR_NO_WEIGHT(String val) ; 

	/**
	 * �ϐ��@SEQUENCE_CTR_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_CTR_NO(String val) ; 

	/**
	 * �ϐ��@PURPOSE_KIND�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND(String val) ; 

	/**
	 * �ϐ��@KANBAN_CUST_ODR_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setKANBAN_CUST_ODR_FLG(String val) ; 

	/**
	 * �ϐ��@CUS_DLV_KEY_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUS_DLV_KEY_CD(String val) ; 

	/**
	 * �ϐ��@FIRST_LOT_CTL_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setFIRST_LOT_CTL_FLG(String val) ; 

	/**
	 * �ϐ��@IMP_SAFE_PARTS_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIMP_SAFE_PARTS_FLG(String val) ; 

	/**
	 * �ϐ��@PARTS_SUP_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP(String val) ; 

	/**
	 * �ϐ��@SUP_INFO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSUP_INFO(String val) ; 

	/**
	 * �ϐ��@INSP_INFO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setINSP_INFO(String val) ; 

	/**
	 * �ϐ��@CUST_DLV_INFO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_DLV_INFO(String val) ; 

	/**
	 * �ϐ��@TRIAL_INFO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTRIAL_INFO(String val) ; 

	/**
	 * �ϐ��@DESIGN_CHANGE_INFO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDESIGN_CHANGE_INFO(String val) ; 

	/**
	 * �ϐ��@CUST_ODR_SUB_INFO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_ODR_SUB_INFO(String val) ; 

	/**
	 * �ϐ��@MANU_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setMANU_LOC_CD(String val) ; 

	/**
	 * �ϐ��@SHIP_REMARKS�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_REMARKS(String val) ; 

	/**
	 * �ϐ��@SALES_REMARKS�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSALES_REMARKS(String val) ; 

	/**
	 * �ϐ��@ODR_IF_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_IF_CTL_NO(String val) ; 

	/**
	 * �ϐ��@SHIP_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_FLG(String val) ; 

	/**
	 * �ϐ��@STOCK_UNIT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSTOCK_UNIT(String val) ; 

	/**
	 * �ϐ��@CUR_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUR_NAME(String val) ; 

	/**
	 * �ϐ��@TAX_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTAX_NAME(String val) ; 

	/**
	 * �ϐ��@IN_EST_CONF_SET_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_EST_CONF_SET_FLG(String val) ; 

	/**
	 * �ϐ��@IN_DETAIL_ROUND_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_DETAIL_ROUND_TYP(String val) ; 

	/**
	 * �ϐ��@HISTORY_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setHISTORY_CTL_NO(String val) ; 

	/**
	 * �ϐ��@NEW_OLD_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNEW_OLD_FLG(String val) ; 

	/**
	 * �ϐ��@TRAN_TYPE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setTRAN_TYPE(String val) ; 

	/**
	 * �ϐ��@IN_ODR_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_ODR_CTL_NO(String val) ; 

	/**
	 * �ϐ��@chkCUST_DESINATED_DLV_LOC�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setchkCUST_DESINATED_DLV_LOC(String val) ; 

	/**
	 * �ϐ��@JOB_OD_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setJOB_OD_CD(String val) ; 

	/**
	 * �ϐ��@SHIP_PLANT_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLANT_CD(String val) ; 

	/**
	 * �ϐ��@JOB_ODR_DLV_DATE_ALL�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE_ALL(String val) ; 

	/**
	 * �ϐ��@JOB_ODR_SET_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_SET_FLG(String val) ; 

	/**
	 * �ϐ��@ALCD_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setALCD_QTY(String val) ; 
	
	
	//KQ1090

	/**
	 * �ϐ��@ODR_QTY_AutoCalc�̎擾<BR>
	 * @return String
	 */
	public abstract String getODR_QTY_AutoCalc() ; 

	/**
	 * �ϐ��@SHIP_PLAN_DATE_AutoCalc�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLAN_DATE_AutoCalc() ; 

	/**
	 * �ϐ��@IN_PKG_UNIT_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getIN_PKG_UNIT_QTY() ; 

	/**
	 * �ϐ��@ODR_QTY_AutoCalc�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setODR_QTY_AutoCalc(String val) ; 

	/**
	 * �ϐ��@SHIP_PLAN_DATE_AutoCalc�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLAN_DATE_AutoCalc(String val) ; 

	/**
	 * �ϐ��@IN_PKG_UNIT_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setIN_PKG_UNIT_QTY(String val) ; 

	//KQ1130

	/**
	 * �ϐ��@h_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_NO() ; 

	/**
	 * �ϐ��@h_ENTRY_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_ENTRY_TYP() ; 

	/**
	 * �ϐ��@c_CUST_ODR_NO_NUMBERING�̎擾<BR>
	 * @return String
	 */
	public abstract String getc_CUST_ODR_NO_NUMBERING() ; 

	/**
	 * �ϐ��@h_SHIP_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_SHIP_FLG() ; 

	/**
	 * �ϐ��@h_UNIT_COST_READ_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_UNIT_COST_READ_FLG() ; 

	/**
	 * �ϐ��@h_DLV_LOC_OPTION_CHANGE_VALUE�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * �ϐ��@h_DEL_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_DEL_FLG() ; 

	/**
	 * �ϐ��@h_FINAL_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_FINAL_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@h_FINAL_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_FINAL_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@h_ITEM_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_ITEM_NAME() ; 

	/**
	 * �ϐ��@h_TOTAL_SHIP_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_TOTAL_SHIP_QTY() ; 

	/**
	 * �ϐ��@h_ODR_CMPLT_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_ODR_CMPLT_FLG() ; 

	/**
	 * �ϐ��@h_READ_CUST_ODR_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_READ_CUST_ODR_NO() ; 

	/**
	 * �ϐ��@l_APPR_REMARKS�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_APPR_REMARKS() ; 

	/**
	 * �ϐ��@l_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_NO() ; 

	/**
	 * �ϐ��@l_c_DEL_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_c_DEL_FLG() ; 

	/**
	 * �ϐ��@l_CUST_ODR_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ODR_NO() ; 

	/**
	 * �ϐ��@l_CUST_ITEM_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ITEM_CD() ; 

	/**
	 * �ϐ��@l_CUST_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_CUST_CD() ; 

	/**
	 * �ϐ��@l_CUST_ANAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ANAME() ; 

	/**
	 * �ϐ��@l_CUST_DESINATED_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_CUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@l_DESINATED_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_DESINATED_DLV_DATE() ; 

	/**
	 * �ϐ��@l_ODR_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ODR_QTY() ; 

	/**
	 * �ϐ��@l_STOCK_UNIT�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_STOCK_UNIT() ; 

	/**
	 * �ϐ��@l_UNIT_PRICE�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_UNIT_PRICE() ; 

	/**
	 * �ϐ��@l_PURPOSE_UNIT_PRICE_TYP_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_PURPOSE_UNIT_PRICE_TYP_NAME() ; 

	/**
	 * �ϐ��@l_AMOUNT_TYP_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_AMOUNT_TYP_NAME() ; 

	/**
	 * �ϐ��@l_ODR_AMOUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ODR_AMOUNT() ; 

	/**
	 * �ϐ��@l_ITEM_CD_OPTION_CHANGE_VALUE�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * �ϐ��@l_ARRANGEMENTS_CHARACTERISTIC�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ARRANGEMENTS_CHARACTERISTIC() ; 

	/**
	 * �ϐ��@l_REMARKS�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_REMARKS() ; 

	/**
	 * �ϐ��@l_CUST_ITEM_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ITEM_NAME() ; 

	/**
	 * �ϐ��@l_ITEM_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_CD() ; 

	/**
	 * �ϐ��@l_ITEM_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_NAME() ; 

	/**
	 * �ϐ��@l_CUST_DESINATED_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_CUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@l_FINAL_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_FINAL_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@l_FINAL_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_FINAL_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@l_DISP_SHIP_PLAN_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_DISP_SHIP_PLAN_DATE() ; 

	/**
	 * �ϐ��@h_l_ODR_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_CTL_NO() ; 

	/**
	 * �ϐ��@h_l_CUST_CHRG_ORG_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_CUST_CHRG_ORG_CD() ; 

	/**
	 * �ϐ��@h_l_CUST_CHRG_PSN_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_CUST_CHRG_PSN_CD() ; 

	/**
	 * �ϐ��@h_l_CONCENTRATE_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_CONCENTRATE_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@h_l_CONCENTRATE_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_CONCENTRATE_DATE() ; 

	/**
	 * �ϐ��@h_l_SHIP_PLAN_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_PLAN_DATE() ; 

	/**
	 * �ϐ��@h_l_STNDRD_RCV_DESINATED_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_STNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * �ϐ��@h_l_DESINATED_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_DESINATED_DLV_DATE() ; 

	/**
	 * �ϐ��@h_l_DESINATED_DLV_TIME�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_DESINATED_DLV_TIME() ; 

	/**
	 * �ϐ��@h_l_PURPOSE_UNIT_PRICE_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_PURPOSE_UNIT_PRICE_TYP() ; 

	/**
	 * �ϐ��@h_l_CUR_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_CUR_CD() ; 

	/**
	 * �ϐ��@h_l_EXCH_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_EXCH_TYP() ; 

	/**
	 * �ϐ��@h_l_AMOUNT_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_AMOUNT_TYP() ; 

	/**
	 * �ϐ��@h_l_TAX_APPLY_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_APPLY_TYP() ; 

	/**
	 * �ϐ��@h_l_TAX_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_CD() ; 

	/**
	 * �ϐ��@h_l_TAX_CALC_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_CALC_TYP() ; 

	/**
	 * �ϐ��@h_l_ODR_AMOUNT_EXCH_RATES�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_AMOUNT_EXCH_RATES() ; 

	/**
	 * �ϐ��@h_l_ODR_CMPLT_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_CMPLT_FLG() ; 

	/**
	 * �ϐ��@h_l_TOTAL_SHIP_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_TOTAL_SHIP_QTY() ; 

	/**
	 * �ϐ��@h_l_TRANSPORT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_TRANSPORT_CD() ; 

	/**
	 * �ϐ��@h_l_TRANSPORT_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_TRANSPORT_TYP() ; 

	/**
	 * �ϐ��@h_l_SHIP_WH_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_WH_CD() ; 

	/**
	 * �ϐ��@h_l_PURPOSE_KIND�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_PURPOSE_KIND() ; 

	/**
	 * �ϐ��@h_l_DEPOT_PLAN_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_DEPOT_PLAN_TYP() ; 

	/**
	 * �ϐ��@h_l_DLV_LOC_OPTION_CHANGE_VALUE�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * �ϐ��@h_l_ENTRY_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_ENTRY_TYP() ; 

	/**
	 * �ϐ��@h_l_SHIP_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_FLG() ; 

	/**
	 * �ϐ��@h_l_MODIFY_COUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_MODIFY_COUNT() ; 

	/**
	 * �ϐ��@h_l_DATA_EDIT_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_DATA_EDIT_FLG() ; 

	/**
	 * �ϐ��@SELECT_CUST_ODR_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getSELECT_CUST_ODR_NO() ; 

	/**
	 * �ϐ��@w_LAST_ODR_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_LAST_ODR_QTY() ; 

	/**
	 * �ϐ��@w_CODE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CODE() ; 

	/**
	 * �ϐ��@w_CODE2�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CODE2() ; 

	/**
	 * �ϐ��@w_SYS_CLASS�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_SYS_CLASS() ; 

	/**
	 * �ϐ��@w_CLASS_CODE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CLASS_CODE() ; 

	/**
	 * �ϐ��@w_CUST_ANAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ANAME() ; 

	/**
	 * �ϐ��@w_OWN_ORG_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_OWN_ORG_CD() ; 

	/**
	 * �ϐ��@w_OWN_PERSON_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_OWN_PERSON_CD() ; 

	/**
	 * �ϐ��@w_CUR_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CUR_CD() ; 

	/**
	 * �ϐ��@w_EXCH_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_EXCH_TYP() ; 

	/**
	 * �ϐ��@w_TAX_APPLY_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_TAX_APPLY_TYP() ; 

	/**
	 * �ϐ��@w_TAX_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_TAX_CD() ; 

	/**
	 * �ϐ��@w_TAX_CALC_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_TAX_CALC_TYP() ; 

	/**
	 * �ϐ��@w_DETAIL_ROUND_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_DETAIL_ROUND_TYP() ; 

	/**
	 * �ϐ��@w_COMPANY_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_COMPANY_CD() ; 

	/**
	 * �ϐ��@w_CUST_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CUST_CD() ; 

	/**
	 * �ϐ��@w_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@w_CNCNTRT_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CNCNTRT_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@w_SHIP_CTL_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_CTL_TYP() ; 

	/**
	 * �ϐ��@w_TRANSPORT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_TRANSPORT_CD() ; 

	/**
	 * �ϐ��@w_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@w_CUST_ODR_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ODR_NO() ; 

	/**
	 * �ϐ��@w_ACPT_PSN_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_ACPT_PSN_CD() ; 

	/**
	 * �ϐ��@w_UNCNFM_CUST_ODR_CREATE_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_CUST_ODR_CREATE_DATE() ; 

	/**
	 * �ϐ��@w_NEW_OLD_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_NEW_OLD_FLG() ; 

	/**
	 * �ϐ��@w_TRAN_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_TRAN_TYP() ; 

	/**
	 * �ϐ��@w_USER_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_USER_CD() ; 

	/**
	 * �ϐ��@w_PRG_NM�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_PRG_NM() ; 

	/**
	 * �ϐ��@w_SHIP_WH_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_WH_CD() ; 

	/**
	 * �ϐ��@w_ITEM_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_CD() ; 

	/**
	 * �ϐ��@w_PURPOSE_KIND�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_PURPOSE_KIND() ; 

	/**
	 * �ϐ��@w_CUST_ITEM_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ITEM_CD() ; 

	/**
	 * �ϐ��@w_ITEM_CD_OPTION_CHANGE_VALUE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * �ϐ��@w_DESINATED_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_DESINATED_DLV_DATE() ; 

	/**
	 * �ϐ��@w_ITEM_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_NAME() ; 

	/**
	 * �ϐ��@w_STOCK_UNIT�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_STOCK_UNIT() ; 

	/**
	 * �ϐ��@w_UNIT_QTY_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_UNIT_QTY_TYP() ; 

	/**
	 * �ϐ��@w_CUST_DESINATED_DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * �ϐ��@w_CUST_DESINATED_DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * �ϐ��@w_DLV_LOC_OPTION_CHANGE_VALUE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * �ϐ��@w_ODR_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_ODR_CTL_NO() ; 

	/**
	 * �ϐ��@CUST_ANAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getCUST_ANAME() ; 

	/**
	 * �ϐ��@JOB_ODR_DLV_DATE_TIME�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE_TIME() ; 

	/**
	 * �ϐ��@DLV_LOC_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_CD() ; 
	/**
	 * �ϐ��@SHIP_CTL_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getSHIP_CTL_TYP() ; 
	/**
	 * �ϐ��@h_l_JOB_ODR_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_JOB_ODR_DLV_DATE() ; 

	/**
	 * �ϐ��@h_l_JOB_ODR_DLV_TIME�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_l_JOB_ODR_DLV_TIME() ; 	
	
	/**
	 * �ϐ��@JOB_ODR_DLV_TIME�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_TIME() ; 	
	
	/**
	 * �ϐ��@h_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_NO(String val) ; 

	/**
	 * �ϐ��@h_ENTRY_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_ENTRY_TYP(String val) ; 

	/**
	 * �ϐ��@c_CUST_ODR_NO_NUMBERING�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setc_CUST_ODR_NO_NUMBERING(String val) ; 

	/**
	 * �ϐ��@h_SHIP_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_SHIP_FLG(String val) ; 

	/**
	 * �ϐ��@h_UNIT_COST_READ_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_UNIT_COST_READ_FLG(String val) ; 

	/**
	 * �ϐ��@h_DLV_LOC_OPTION_CHANGE_VALUE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * �ϐ��@h_DEL_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_DEL_FLG(String val) ; 

	/**
	 * �ϐ��@h_FINAL_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_FINAL_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@h_FINAL_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_FINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@h_ITEM_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_ITEM_NAME(String val) ; 

	/**
	 * �ϐ��@h_TOTAL_SHIP_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_TOTAL_SHIP_QTY(String val) ; 

	/**
	 * �ϐ��@h_ODR_CMPLT_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_ODR_CMPLT_FLG(String val) ; 

	/**
	 * �ϐ��@h_READ_CUST_ODR_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_READ_CUST_ODR_NO(String val) ; 

	/**
	 * �ϐ��@l_APPR_REMARKS�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_APPR_REMARKS(String val) ; 

	/**
	 * �ϐ��@l_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_NO(String val) ; 

	/**
	 * �ϐ��@l_c_DEL_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_c_DEL_FLG(String val) ; 

	/**
	 * �ϐ��@l_CUST_ODR_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ODR_NO(String val) ; 

	/**
	 * �ϐ��@l_CUST_ITEM_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ITEM_CD(String val) ; 

	/**
	 * �ϐ��@l_CUST_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_CD(String val) ; 

	/**
	 * �ϐ��@l_CUST_ANAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ANAME(String val) ; 

	/**
	 * �ϐ��@l_CUST_DESINATED_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@l_DESINATED_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_DESINATED_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@l_ODR_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_ODR_QTY(String val) ; 

	/**
	 * �ϐ��@l_STOCK_UNIT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_STOCK_UNIT(String val) ; 

	/**
	 * �ϐ��@l_UNIT_PRICE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_UNIT_PRICE(String val) ; 

	/**
	 * �ϐ��@l_PURPOSE_UNIT_PRICE_TYP_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_PURPOSE_UNIT_PRICE_TYP_NAME(String val) ; 

	/**
	 * �ϐ��@l_AMOUNT_TYP_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_AMOUNT_TYP_NAME(String val) ; 

	/**
	 * �ϐ��@l_ODR_AMOUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_ODR_AMOUNT(String val) ; 

	/**
	 * �ϐ��@l_ITEM_CD_OPTION_CHANGE_VALUE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * �ϐ��@l_ARRANGEMENTS_CHARACTERISTIC�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_ARRANGEMENTS_CHARACTERISTIC(String val) ; 

	/**
	 * �ϐ��@l_REMARKS�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_REMARKS(String val) ; 

	/**
	 * �ϐ��@l_CUST_ITEM_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ITEM_NAME(String val) ; 

	/**
	 * �ϐ��@l_ITEM_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_CD(String val) ; 

	/**
	 * �ϐ��@l_ITEM_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_NAME(String val) ; 

	/**
	 * �ϐ��@l_CUST_DESINATED_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@l_FINAL_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_FINAL_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@l_FINAL_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_FINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@l_DISP_SHIP_PLAN_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setl_DISP_SHIP_PLAN_DATE(String val) ; 

	/**
	 * �ϐ��@h_l_ODR_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_CTL_NO(String val) ; 

	/**
	 * �ϐ��@h_l_CUST_CHRG_ORG_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUST_CHRG_ORG_CD(String val) ; 

	/**
	 * �ϐ��@h_l_CUST_CHRG_PSN_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUST_CHRG_PSN_CD(String val) ; 

	/**
	 * �ϐ��@h_l_CONCENTRATE_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_CONCENTRATE_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@h_l_CONCENTRATE_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_CONCENTRATE_DATE(String val) ; 

	/**
	 * �ϐ��@h_l_SHIP_PLAN_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_PLAN_DATE(String val) ; 

	/**
	 * �ϐ��@h_l_STNDRD_RCV_DESINATED_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_STNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@h_l_DESINATED_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_DESINATED_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@h_l_DESINATED_DLV_TIME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_DESINATED_DLV_TIME(String val) ; 

	/**
	 * �ϐ��@h_l_PURPOSE_UNIT_PRICE_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_PURPOSE_UNIT_PRICE_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_CUR_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUR_CD(String val) ; 

	/**
	 * �ϐ��@h_l_EXCH_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_EXCH_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_AMOUNT_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_AMOUNT_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_TAX_APPLY_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_APPLY_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_TAX_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_CD(String val) ; 

	/**
	 * �ϐ��@h_l_TAX_CALC_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_CALC_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_ODR_AMOUNT_EXCH_RATES�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * �ϐ��@h_l_ODR_CMPLT_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_CMPLT_FLG(String val) ; 

	/**
	 * �ϐ��@h_l_TOTAL_SHIP_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_TOTAL_SHIP_QTY(String val) ; 

	/**
	 * �ϐ��@h_l_TRANSPORT_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_TRANSPORT_CD(String val) ; 

	/**
	 * �ϐ��@h_l_TRANSPORT_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_TRANSPORT_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_SHIP_WH_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_WH_CD(String val) ; 

	/**
	 * �ϐ��@h_l_PURPOSE_KIND�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_PURPOSE_KIND(String val) ; 

	/**
	 * �ϐ��@h_l_DEPOT_PLAN_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_DEPOT_PLAN_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_DLV_LOC_OPTION_CHANGE_VALUE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * �ϐ��@h_l_ENTRY_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_ENTRY_TYP(String val) ; 

	/**
	 * �ϐ��@h_l_SHIP_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_FLG(String val) ; 

	/**
	 * �ϐ��@h_l_MODIFY_COUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_MODIFY_COUNT(String val) ; 

	/**
	 * �ϐ��@h_l_DATA_EDIT_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_l_DATA_EDIT_FLG(String val) ; 

	/**
	 * �ϐ��@SELECT_CUST_ODR_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setSELECT_CUST_ODR_NO(String val) ; 

	/**
	 * �ϐ��@w_LAST_ODR_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_LAST_ODR_QTY(String val) ; 

	/**
	 * �ϐ��@w_CODE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CODE(String val) ; 

	/**
	 * �ϐ��@w_CODE2�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CODE2(String val) ; 

	/**
	 * �ϐ��@w_SYS_CLASS�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_SYS_CLASS(String val) ; 

	/**
	 * �ϐ��@w_CLASS_CODE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CLASS_CODE(String val) ; 

	/**
	 * �ϐ��@w_CUST_ANAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ANAME(String val) ; 

	/**
	 * �ϐ��@w_OWN_ORG_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_OWN_ORG_CD(String val) ; 

	/**
	 * �ϐ��@w_OWN_PERSON_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_OWN_PERSON_CD(String val) ; 

	/**
	 * �ϐ��@w_CUR_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CUR_CD(String val) ; 

	/**
	 * �ϐ��@w_EXCH_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_EXCH_TYP(String val) ; 

	/**
	 * �ϐ��@w_TAX_APPLY_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_APPLY_TYP(String val) ; 

	/**
	 * �ϐ��@w_TAX_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_CD(String val) ; 

	/**
	 * �ϐ��@w_TAX_CALC_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_CALC_TYP(String val) ; 

	/**
	 * �ϐ��@w_DETAIL_ROUND_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_DETAIL_ROUND_TYP(String val) ; 

	/**
	 * �ϐ��@w_COMPANY_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_COMPANY_CD(String val) ; 

	/**
	 * �ϐ��@w_CUST_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_CD(String val) ; 

	/**
	 * �ϐ��@w_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@w_CNCNTRT_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CNCNTRT_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@w_SHIP_CTL_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_CTL_TYP(String val) ; 

	/**
	 * �ϐ��@w_TRANSPORT_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_TRANSPORT_CD(String val) ; 

	/**
	 * �ϐ��@w_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@w_CUST_ODR_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ODR_NO(String val) ; 

	/**
	 * �ϐ��@w_ACPT_PSN_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_ACPT_PSN_CD(String val) ; 

	/**
	 * �ϐ��@w_UNCNFM_CUST_ODR_CREATE_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_CUST_ODR_CREATE_DATE(String val) ; 

	/**
	 * �ϐ��@w_NEW_OLD_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_NEW_OLD_FLG(String val) ; 

	/**
	 * �ϐ��@w_TRAN_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_TRAN_TYP(String val) ; 

	/**
	 * �ϐ��@w_USER_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_USER_CD(String val) ; 

	/**
	 * �ϐ��@w_PRG_NM�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_PRG_NM(String val) ; 

	/**
	 * �ϐ��@w_SHIP_WH_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_WH_CD(String val) ; 

	/**
	 * �ϐ��@w_ITEM_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_CD(String val) ; 

	/**
	 * �ϐ��@w_PURPOSE_KIND�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_PURPOSE_KIND(String val) ; 

	/**
	 * �ϐ��@w_CUST_ITEM_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ITEM_CD(String val) ; 

	/**
	 * �ϐ��@w_ITEM_CD_OPTION_CHANGE_VALUE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * �ϐ��@w_DESINATED_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_DESINATED_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@w_ITEM_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_NAME(String val) ; 

	/**
	 * �ϐ��@w_STOCK_UNIT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_STOCK_UNIT(String val) ; 

	/**
	 * �ϐ��@w_UNIT_QTY_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_UNIT_QTY_TYP(String val) ; 

	/**
	 * �ϐ��@w_CUST_DESINATED_DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@w_CUST_DESINATED_DLV_LOC_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@w_DLV_LOC_OPTION_CHANGE_VALUE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * �ϐ��@w_ODR_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_ODR_CTL_NO(String val) ; 

	/**
	 * �ϐ��@CUST_ANAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setCUST_ANAME(String val) ; 

	//KQ1140

	/**
	 * �ϐ��@DISP_DAY_1�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_1() ; 

	/**
	 * �ϐ��@DISP_DAY_2�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_2() ; 

	/**
	 * �ϐ��@DISP_DAY_3�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_3() ; 

	/**
	 * �ϐ��@DISP_DAY_4�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_4() ; 

	/**
	 * �ϐ��@DISP_DAY_5�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_5() ; 

	/**
	 * �ϐ��@DISP_DAY_6�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_6() ; 

	/**
	 * �ϐ��@DISP_DAY_7�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_7() ; 

	/**
	 * �ϐ��@DISP_DAY_8�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_8() ; 

	/**
	 * �ϐ��@DISP_DAY_9�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_9() ; 

	/**
	 * �ϐ��@DISP_DAY_10�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_10() ; 

	/**
	 * �ϐ��@DISP_NEXT_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_NEXT_MONTH() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_1�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_1() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_2�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_2() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_3�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_3() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_4�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_4() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_5�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_5() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_6�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_6() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_7�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_7() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_8�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_8() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_9�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_9() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_10�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_10() ; 

	/**
	 * �ϐ��@NOW_QTY_NEXT_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_NEXT_MONTH() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_1�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_1() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_2�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_2() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_3�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_3() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_4�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_4() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_5�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_5() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_6�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_6() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_7�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_7() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_8�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_8() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_9�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_9() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_10�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_10() ; 

	/**
	 * �ϐ��@BEF_QTY_NEXT_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_NEXT_MONTH() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_1�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_1() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_2�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_2() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_3�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_3() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_4�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_4() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_5�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_5() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_6�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_6() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_7�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_7() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_8�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_8() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_9�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_9() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_10�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_10() ; 

	/**
	 * �ϐ��@DEF_QTY_NEXT_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_NEXT_MONTH() ; 

	/**
	 * �ϐ��@DISP_DAY_11�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_11() ; 

	/**
	 * �ϐ��@DISP_DAY_12�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_12() ; 

	/**
	 * �ϐ��@DISP_DAY_13�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_13() ; 

	/**
	 * �ϐ��@DISP_DAY_14�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_14() ; 

	/**
	 * �ϐ��@DISP_DAY_15�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_15() ; 

	/**
	 * �ϐ��@DISP_DAY_16�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_16() ; 

	/**
	 * �ϐ��@DISP_DAY_17�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_17() ; 

	/**
	 * �ϐ��@DISP_DAY_18�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_18() ; 

	/**
	 * �ϐ��@DISP_DAY_19�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_19() ; 

	/**
	 * �ϐ��@DISP_DAY_20�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_20() ; 

	/**
	 * �ϐ��@DISP_2ND_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_2ND_MONTH() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_11�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_11() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_12�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_12() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_13�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_13() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_14�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_14() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_15�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_15() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_16�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_16() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_17�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_17() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_18�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_18() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_19�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_19() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_20�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_20() ; 

	/**
	 * �ϐ��@NOW_QTY_2ND_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_2ND_MONTH() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_11�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_11() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_12�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_12() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_13�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_13() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_14�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_14() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_15�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_15() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_16�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_16() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_17�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_17() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_18�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_18() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_19�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_19() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_20�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_20() ; 

	/**
	 * �ϐ��@BEF_QTY_2ND_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_2ND_MONTH() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_11�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_11() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_12�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_12() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_13�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_13() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_14�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_14() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_15�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_15() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_16�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_16() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_17�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_17() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_18�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_18() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_19�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_19() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_20�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_20() ; 

	/**
	 * �ϐ��@DEF_QTY_2ND_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_2ND_MONTH() ; 

	/**
	 * �ϐ��@DISP_DAY_21�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_21() ; 

	/**
	 * �ϐ��@DISP_DAY_22�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_22() ; 

	/**
	 * �ϐ��@DISP_DAY_23�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_23() ; 

	/**
	 * �ϐ��@DISP_DAY_24�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_24() ; 

	/**
	 * �ϐ��@DISP_DAY_25�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_25() ; 

	/**
	 * �ϐ��@DISP_DAY_26�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_26() ; 

	/**
	 * �ϐ��@DISP_DAY_27�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_27() ; 

	/**
	 * �ϐ��@DISP_DAY_28�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_28() ; 

	/**
	 * �ϐ��@DISP_DAY_29�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_29() ; 

	/**
	 * �ϐ��@DISP_DAY_30�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_30() ; 

	/**
	 * �ϐ��@DISP_DAY_31�̎擾<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_31() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_21�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_21() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_22�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_22() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_23�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_23() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_24�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_24() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_25�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_25() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_26�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_26() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_27�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_27() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_28�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_28() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_29�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_29() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_30�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_30() ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_31�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_31() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_21�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_21() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_22�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_22() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_23�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_23() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_24�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_24() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_25�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_25() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_26�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_26() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_27�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_27() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_28�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_28() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_29�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_29() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_30�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_30() ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_31�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_31() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_21�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_21() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_22�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_22() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_23�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_23() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_24�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_24() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_25�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_25() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_26�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_26() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_27�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_27() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_28�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_28() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_29�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_29() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_30�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_30() ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_31�̎擾<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_31() ; 

	/**
	 * �ϐ��@NOW_SUM_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getNOW_SUM_QTY() ; 

	/**
	 * �ϐ��@BEFORE_SUM_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getBEFORE_SUM_QTY() ; 

	/**
	 * �ϐ��@h_MASK_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_MASK_FLG() ; 

	/**
	 * �ϐ��@w_PLANT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_PLANT_CD() ; 

	/**
	 * �ϐ��@OWN_ORG_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getOWN_ORG_CD() ; 

	/**
	 * �ϐ��@DLV_LOC_NAME�̎擾<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_NAME() ; 

	/**
	 * �ϐ��@w_CAL_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CAL_DATE() ; 

	/**
	 * �ϐ��@w_HOLIDAY_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_HOLIDAY_FLG() ; 

	/**
	 * �ϐ��@w_UNCNFM_REQUIRED_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_REQUIRED_DATE() ; 

	/**
	 * �ϐ��@w_UNCNFM_ODR_CTL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_CTL_NO() ; 

	/**
	 * �ϐ��@w_UNCNFM_ODR_QTY_NOW�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_QTY_NOW() ; 

	/**
	 * �ϐ��@w_UNCNFM_ODR_QTY_BEF�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_QTY_BEF() ; 

	/**
	 * �ϐ��@w_MODIFY_COUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_MODIFY_COUNT() ; 

	/**
	 * �ϐ��@w_COUNT�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_COUNT() ; 

	/**
	 * �ϐ��@w_EDI_DATA_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_EDI_DATA_TYP() ; 

	/**
	 * �ϐ��@w_BUSINESS_OPR_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_BUSINESS_OPR_DATE() ; 

	/**
	 * �ϐ��@w_LAST_DAY�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_LAST_DAY() ; 

	/**
	 * �ϐ��@YEAR_MONTH�̎擾<BR>
	 * @return String
	 */
	public abstract String getYEAR_MONTH() ; 

	/**
	 * �ϐ��@w_CONCENTRATE_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_CONCENTRATE_DATE() ; 

	/**
	 * �ϐ��@w_SHIP_PLAN_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_PLAN_DATE() ; 

	/**
	 * �ϐ��@w_STNDRD_RCV_DESINATED_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_STNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * �ϐ��@w_DEPOT_PLAN_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getw_DEPOT_PLAN_TYP() ; 

	/**
	 * �ϐ��@MAX_CAL_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getMAX_CAL_DATE() ; 

	/**
	 * �ϐ��@DISP_DAY_1�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_1(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_2�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_2(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_3�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_3(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_4�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_4(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_5�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_5(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_6�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_6(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_7�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_7(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_8�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_8(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_9�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_9(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_10�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_10(String val) ; 

	/**
	 * �ϐ��@DISP_NEXT_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_NEXT_MONTH(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_1�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_1(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_2�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_2(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_3�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_3(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_4�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_4(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_5�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_5(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_6�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_6(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_7�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_7(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_8�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_8(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_9�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_9(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_10�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_10(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_NEXT_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_NEXT_MONTH(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_1�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_1(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_2�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_2(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_3�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_3(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_4�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_4(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_5�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_5(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_6�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_6(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_7�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_7(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_8�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_8(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_9�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_9(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_10�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_10(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_NEXT_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_NEXT_MONTH(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_1�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_1(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_2�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_2(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_3�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_3(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_4�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_4(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_5�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_5(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_6�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_6(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_7�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_7(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_8�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_8(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_9�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_9(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_10�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_10(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_NEXT_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_NEXT_MONTH(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_11�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_11(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_12�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_12(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_13�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_13(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_14�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_14(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_15�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_15(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_16�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_16(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_17�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_17(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_18�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_18(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_19�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_19(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_20�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_20(String val) ; 

	/**
	 * �ϐ��@DISP_2ND_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_2ND_MONTH(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_11�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_11(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_12�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_12(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_13�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_13(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_14�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_14(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_15�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_15(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_16�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_16(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_17�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_17(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_18�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_18(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_19�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_19(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_20�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_20(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_2ND_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_2ND_MONTH(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_11�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_11(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_12�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_12(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_13�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_13(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_14�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_14(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_15�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_15(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_16�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_16(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_17�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_17(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_18�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_18(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_19�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_19(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_20�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_20(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_2ND_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_2ND_MONTH(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_11�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_11(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_12�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_12(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_13�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_13(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_14�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_14(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_15�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_15(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_16�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_16(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_17�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_17(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_18�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_18(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_19�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_19(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_20�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_20(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_2ND_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_2ND_MONTH(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_21�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_21(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_22�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_22(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_23�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_23(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_24�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_24(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_25�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_25(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_26�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_26(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_27�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_27(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_28�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_28(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_29�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_29(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_30�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_30(String val) ; 

	/**
	 * �ϐ��@DISP_DAY_31�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_31(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_21�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_21(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_22�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_22(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_23�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_23(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_24�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_24(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_25�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_25(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_26�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_26(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_27�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_27(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_28�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_28(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_29�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_29(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_30�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_30(String val) ; 

	/**
	 * �ϐ��@NOW_QTY_DAY_31�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_31(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_21�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_21(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_22�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_22(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_23�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_23(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_24�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_24(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_25�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_25(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_26�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_26(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_27�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_27(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_28�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_28(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_29�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_29(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_30�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_30(String val) ; 

	/**
	 * �ϐ��@BEF_QTY_DAY_31�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_31(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_21�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_21(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_22�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_22(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_23�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_23(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_24�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_24(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_25�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_25(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_26�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_26(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_27�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_27(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_28�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_28(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_29�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_29(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_30�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_30(String val) ; 

	/**
	 * �ϐ��@DEF_QTY_DAY_31�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_31(String val) ; 

	/**
	 * �ϐ��@NOW_SUM_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setNOW_SUM_QTY(String val) ; 

	/**
	 * �ϐ��@BEFORE_SUM_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setBEFORE_SUM_QTY(String val) ; 

	/**
	 * �ϐ��@h_MASK_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void seth_MASK_FLG(String val) ; 

	/**
	 * �ϐ��@w_PLANT_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_PLANT_CD(String val) ; 

	/**
	 * �ϐ��@OWN_ORG_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setOWN_ORG_CD(String val) ; 

	/**
	 * �ϐ��@DLV_LOC_NAME�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setDLV_LOC_NAME(String val) ; 

	/**
	 * �ϐ��@w_CAL_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CAL_DATE(String val) ; 

	/**
	 * �ϐ��@w_HOLIDAY_FLG�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_HOLIDAY_FLG(String val) ; 

	/**
	 * �ϐ��@w_UNCNFM_REQUIRED_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_REQUIRED_DATE(String val) ; 

	/**
	 * �ϐ��@w_UNCNFM_ODR_CTL_NO�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * �ϐ��@w_UNCNFM_ODR_QTY_NOW�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_QTY_NOW(String val) ; 

	/**
	 * �ϐ��@w_UNCNFM_ODR_QTY_BEF�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_QTY_BEF(String val) ; 

	/**
	 * �ϐ��@w_MODIFY_COUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_MODIFY_COUNT(String val) ; 

	/**
	 * �ϐ��@w_COUNT�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_COUNT(String val) ; 

	/**
	 * �ϐ��@w_EDI_DATA_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_EDI_DATA_TYP(String val) ; 

	/**
	 * �ϐ��@w_BUSINESS_OPR_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_BUSINESS_OPR_DATE(String val) ; 

	/**
	 * �ϐ��@w_LAST_DAY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_LAST_DAY(String val) ; 

	/**
	 * �ϐ��@YEAR_MONTH�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setYEAR_MONTH(String val) ; 

	/**
	 * �ϐ��@w_CONCENTRATE_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_CONCENTRATE_DATE(String val) ; 

	/**
	 * �ϐ��@w_SHIP_PLAN_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_PLAN_DATE(String val) ; 

	/**
	 * �ϐ��@w_STNDRD_RCV_DESINATED_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_STNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@w_DEPOT_PLAN_TYP�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setw_DEPOT_PLAN_TYP(String val) ; 

	/**
	 * �ϐ��@MAX_CAL_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setMAX_CAL_DATE(String val) ; 
	
	// �󒍐��ԕR�t��Y��
	/**
	 * �ϐ��@PREPARE_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getPREPARE_QTY() ; 

	/**
	 * �ϐ��@JOB_ODR_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE() ; 

	/**
	 * �ϐ��@ALC_GRP_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getALC_GRP_CD() ; 

	/**
	 * �ϐ��@JOB_ODR_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_CD() ; 


	/**
	 * �ϐ��@PRD_REQ_JOB_ODR_TYP_1�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_PRD_REQ_JOB_ODR_TYP_1() ;

	/**
	 * �ϐ��@PRD_REQ_JOB_ODR_TYP_2�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_PRD_REQ_JOB_ODR_TYP_2() ;

	/**
	 * �ϐ��@h_JOB_UPDATE_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_JOB_UPDATE_FLG() ;

	/**
	 * �ϐ��@c_DOODR�̎擾<BR>
	 * @return String
	 */
	public abstract String getc_DOODR() ;

	/**
	 * �ϐ��@c_INPUTODRCD�̎擾<BR>
	 * @return String
	 */
	public abstract String getc_INPUTODRCD() ;

	/**
	 * �ϐ��@h_SHIP_PLANT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_SHIP_PLANT_CD() ;

	/**
	 * �ϐ��@JOB_OD_CD_PREFIX�̎擾<BR>
	 * @return String
	 */
	public abstract String getJOB_OD_CD_PREFIX() ;

	/**
	 * �ϐ��@l_ALCD_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ALCD_QTY() ;

	/**
	 * �ϐ��@h_DOODR�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_DOODR() ;

	/**
	 * �ϐ��@l_JOB_ODR_QTY�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_PREPARE_QTY() ;

	/**
	 * �ϐ��@l_JOB_ODR_DLV_DATE�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_JOB_ODR_DLV_DATE() ;

	/**
	 * �ϐ��@l_ALC_GRP_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_ALC_GRP_CD() ;

	/**
	 * �ϐ��@h_INPUTODRCD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_INPUTODRCD() ;

	/**
	 * �ϐ��@l_JOB_ODR_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getl_JOB_ODR_CD() ;

	/**
	 * �ϐ��@MRP_ODR_TYP�̎擾<BR>
	 * @return String
	 */
	public abstract String getMRP_ODR_TYP() ;

	/**
	 * �ϐ��@h_ODR_QTY_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_ODR_QTY_FLG() ;

	/**
	 * �ϐ��@h_UPD_DEL_FLG�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_UPD_DEL_FLG() ;

	/**
	 * �ϐ��@h_PLANT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String geth_PLANT_CD() ;

	/**
	 * �ϐ��@T_JOB_ODR_PLANT_CD�̎擾<BR>
	 * @return String
	 */
	public abstract String getT_JOB_ODR_PLANT_CD() ;

	/**
	 * �ϐ��@CAL_NO�̎擾<BR>
	 * @return String
	 */
	public abstract String getCAL_NO() ;
	
	
	
	
	/**
	 * �ϐ��@PREPARE_QTY�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setPREPARE_QTY(String val) ; 

	/**
	 * �ϐ��@JOB_ODR_DLV_DATE�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@ALC_GRP_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setALC_GRP_CD(String val) ; 

	/**
	 * �ϐ��@JOB_ODR_CD�̃Z�b�g<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_CD(String val) ; 

	/**
	 * �ϐ��@PRD_REQ_JOB_ODR_TYP_1�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_PRD_REQ_JOB_ODR_TYP_1(String val) ; 

	/**
	 * �ϐ��@PRD_REQ_JOB_ODR_TYP_2�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_PRD_REQ_JOB_ODR_TYP_2(String val) ; 

	/**
	 * �ϐ��@h_JOB_UPDATE_FLG�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_JOB_UPDATE_FLG(String val) ; 

	/**
	 * �ϐ��@c_DOODR�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setc_DOODR(String val) ; 

	/**
	 * �ϐ��@c_INPUTODRCD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setc_INPUTODRCD(String val) ; 

	/**
	 * �ϐ��@h_SHIP_PLANT_CD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_SHIP_PLANT_CD(String val) ; 

	/**
	 * �ϐ��@JOB_OD_CD_PREFIX�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setJOB_OD_CD_PREFIX(String val) ; 

	/**
	 * �ϐ��@l_ALCD_QTY�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setl_ALCD_QTY(String val) ; 

	/**
	 * �ϐ��@h_DOODR�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_DOODR(String val) ; 

	/**
	 * �ϐ��@l_PREPARE_QTY�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setl_PREPARE_QTY(String val) ; 

	/**
	 * �ϐ��@l_JOB_ODR_DLV_DATE�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setl_JOB_ODR_DLV_DATE(String val) ; 

	/**
	 * �ϐ��@l_ALC_GRP_CD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setl_ALC_GRP_CD(String val) ; 

	/**
	 * �ϐ��@h_INPUTODRCD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_INPUTODRCD(String val) ; 

	/**
	 * �ϐ��@l_JOB_ODR_CD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setl_JOB_ODR_CD(String val) ; 

	/**
	 * �ϐ��@MRP_ODR_TYP�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setMRP_ODR_TYP(String val) ; 

	/**
	 * �ϐ��@h_ODR_QTY_FLG�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_ODR_QTY_FLG(String val) ; 

	/**
	 * �ϐ��@h_UPD_DEL_FLG�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_UPD_DEL_FLG(String val) ; 

	/**
	 * �ϐ��@h_PLANT_CD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_PLANT_CD(String val) ; 

	/**
	 * �ϐ��@T_ODR_PLANT_CD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setT_ODR_PLANT_CD(String val) ; 

	/**
	 * �ϐ��@T_ODR_PLANT_CD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setT_JOB_ODR_PLANT_CD(String val) ; 

	/**
	 * �ϐ��@CAL_NO�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setCAL_NO(String val) ; 


	/**
	 * �ϐ��@JOB_ODR_DLV_DATE_TIME�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE_TIME(String val) ; 
	

	/**
	 * �ϐ��@DLV_LOC_CD�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setDLV_LOC_CD(String val) ; 

	/**
	 * �ϐ��@SHIP_CTL_TYP�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setSHIP_CTL_TYP(String val) ; 
	/**
	 * �ϐ��@h_l_JOB_ODR_DLV_DATE�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_l_JOB_ODR_DLV_DATE(String val) ; 
	/**
	 * �ϐ��@h_l_JOB_ODR_DLV_TIME�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void seth_l_JOB_ODR_DLV_TIME(String val) ; 
	
	/**
	 * �ϐ��@JOB_ODR_DLV_TIME�̃Z�b�g<BR>
	  * @param String val
	 */
	public abstract void setJOB_ODR_DLV_TIME(String val) ; 
} 	
