/*	
* $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/tranappr/TranStructApprIF.java,v $	
*	
 * Copyright (c) 2003-2004 NEC Corporation.	
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.	
 */	
package com.nec.jp.orteus.expj.tranappr;	
	
/**	
 * <pre>	
 * g³FC^tF[X	
 * </pre>	
 * @author $Author: pang-zw $	
 * @version $Revision: 1.2 $ $Date: 2008/12/26 05:21:50 $	
 *	
 **/	
public abstract interface TranStructApprIF {	
	
	
	//KQ1070
	
	/**
	 * Ο@PURPOSE_UNIT_PRICE_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP_name() ; 
	
	/**
	 * Ο@PURPOSE_UNIT_PRICE_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP_val() ; 
	
	/**
	 * Ο@AMOUNT_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP_name() ; 
	
	/**
	 * Ο@AMOUNT_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP_val() ; 
	
	/**
	 * Ο@EDI_DATA_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP_name() ; 
	
	/**
	 * Ο@EDI_DATA_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP_val() ; 
	
	/**
	 * Ο@DEPOT_PLAN_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP_name() ; 
	
	/**
	 * Ο@DEPOT_PLAN_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP_val() ; 
	
	/**
	 * Ο@ENTRY_TYP_2_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2_name() ; 
	
	/**
	 * Ο@ENTRY_TYP_2_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2_val() ; 
	
	/**
	 * Ο@COMPANY_CD_hiddenΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCOMPANY_CD_hidden() ; 
	
	/**
	 * Ο@BTN_DesinatedDlvDateΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBTN_DesinatedDlvDate() ; 
	
	/**
	 * Ο@BUSINESSOPRDATE_hiddenΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBUSINESSOPRDATE_hidden() ; 
	
	/**
	 * Ο@UNCNFM_ODR_CTL_NO_BKΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_CTL_NO_BK() ; 
	
	/**
	 * Ο@UNCNFM_PLAN_TAKE_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP_name() ; 
	
	/**
	 * Ο@UNCNFM_PLAN_TAKE_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP_val() ; 
	
	/**
	 * Ο@h_APR_JA_UNCNFM_ODRΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_APR_JA_UNCNFM_ODR() ; 
	
	/**
	 * Ο@APPR_REMARKSΜζΎ<BR>
	 * @return String
	 */
	public abstract String getAPPR_REMARKS() ; 
	
	/**
	 * Ο@h_APPR_IDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_APPR_ID() ; 
	
	/**
	 * Ο@h_SCREENMOVE_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_SCREENMOVE_TYP() ; 
	
	/**
	 * Ο@UNCNFM_ODR_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_CTL_NO() ; 
	
	/**
	 * Ο@IN_COMPANY_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_COMPANY_CD() ; 
	
	/**
	 * Ο@CUST_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_CD() ; 
	
	/**
	 * Ο@CUST_ITEM_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_ITEM_CD() ; 
	
	/**
	 * Ο@CUST_ITEM_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_ITEM_NAME() ; 
	
	/**
	 * Ο@CUST_CHRG_ORG_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_ORG_CD() ; 
	
	/**
	 * Ο@CUST_CHRG_PSN_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_PSN_CD() ; 
	
	/**
	 * Ο@ACPT_ORG_CD_hiddenΜζΎ<BR>
	 * @return String
	 */
	public abstract String getACPT_ORG_CD_hidden() ; 
	
	/**
	 * Ο@ACPT_PSN_CD_hiddenΜζΎ<BR>
	 * @return String
	 */
	public abstract String getACPT_PSN_CD_hidden() ; 
	
	/**
	 * Ο@ITEM_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getITEM_CD() ; 
	
	/**
	 * Ο@CUST_UNCNFM_ODR_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_UNCNFM_ODR_NO() ; 
	
	/**
	 * Ο@FINAL_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getFINAL_DLV_LOC_CD() ; 

	/**
	 * Ο@CUST_DESINATED_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * Ο@CONCENTRATE_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DLV_LOC_CD() ; 

	/**
	 * Ο@DESINATED_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE() ; 

	/**
	 * Ο@CONCENTRATE_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DATE() ; 

	/**
	 * Ο@SHIP_PLAN_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLAN_DATE() ; 

	/**
	 * Ο@STNDRD_RCV_DESINATED_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSTNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * Ο@PURPOSE_UNIT_PRICE_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP() ; 

	/**
	 * Ο@UNCNFM_ODR_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_QTY() ; 

	/**
	 * Ο@AMOUNT_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP() ; 

	/**
	 * Ο@DEPOT_PLAN_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP() ; 

	/**
	 * Ο@DLV_LOC_OPTION_CHANGE_VALUEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * Ο@ITEM_CD_OPTION_CHANGE_VALUEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * Ο@ENTRY_TYP_2ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2() ; 

	/**
	 * Ο@EDI_DATA_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP() ; 

	/**
	 * Ο@EDI_DISCRIMINATION_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEDI_DISCRIMINATION_CD() ; 

	/**
	 * Ο@ARRANGEMENTS_CHARACTERISTICΜζΎ<BR>
	 * @return String
	 */
	public abstract String getARRANGEMENTS_CHARACTERISTIC() ; 

	/**
	 * Ο@UNCNFM_PLAN_TAKE_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP() ; 

	/**
	 * Ο@UNCNFM_REQUIRED_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_DATE() ; 

	/**
	 * Ο@UNCNFM_REQUIRED_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_QTY() ; 

	/**
	 * Ο@ORG_UNCNFM_REQUIRED_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * Ο@LAST_UNCNFM_REQUIRED_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getLAST_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * Ο@WORK_DAY_DIVISION_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getWORK_DAY_DIVISION_FLG() ; 

	/**
	 * Ο@MANUAL_UPDATE_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getMANUAL_UPDATE_FLG() ; 

	/**
	 * Ο@REMARKSΜζΎ<BR>
	 * @return String
	 */
	public abstract String getREMARKS() ; 

	/**
	 * Ο@UNCNFM_CUST_ODR_CREATE_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_CUST_ODR_CREATE_DATE() ; 

	/**
	 * Ο@ORG_UNCNFM_ODR_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_ODR_CTL_NO() ; 

	/**
	 * Ο@UNCNFM_ODR_IF_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_IF_CTL_NO() ; 

	/**
	 * Ο@DEL_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEL_FLG() ; 

	/**
	 * Ο@IN_MODIFY_COUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_MODIFY_COUNT() ; 

	/**
	 * Ο@CUST_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_NAME() ; 

	/**
	 * Ο@CUST_DESINATED_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * Ο@FINAL_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getFINAL_DLV_LOC_NAME() ; 

	/**
	 * Ο@CONCENTRATE_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DLV_LOC_NAME() ; 

	/**
	 * Ο@ITEM_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getITEM_NAME() ; 

	/**
	 * Ο@UNCNFM_ODR_QTY_STOCK_UNITΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_QTY_STOCK_UNIT() ; 

	/**
	 * Ο@LAST_UNCNFM_REQUIRED_QTY_STOCK_UNITΜζΎ<BR>
	 * @return String
	 */
	public abstract String getLAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * Ο@UNCNFM_REQUIRED_QTY_STOCK_UNITΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * Ο@ORG_UNCNFM_REQUIRED_QTY_STOCK_UNITΜζΎ<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * Ο@CUST_CHRG_ORG_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_ORG_NAME() ; 

	/**
	 * Ο@CUST_CHRG_PSN_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_PSN_NAME() ; 

	/**
	 * Ο@IN_BUSINESS_OPR_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_BUSINESS_OPR_DATE() ; 

	/**
	 * Ο@APPR_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getAPPR_DATE() ; 

	/**
	 * Ο@APPR_BYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getAPPR_BY() ; 

	/**
	 * Ο@MOTO_UNCNFM_REQUIRED_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getMOTO_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * Ο@chkCUST_DESINATED_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getchkCUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * Ο@UNIT_QTY_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNIT_QTY_TYP() ; 

	/**
	 * Ο@dummyΜζΎ<BR>
	 * @return String
	 */
	public abstract String getdummy() ; 

	/**
	 * Ο@APPR_IDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getAPPR_ID() ; 

	/**
	 * Ο@PURPOSE_UNIT_PRICE_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP_name(String val) ; 

	/**
	 * Ο@PURPOSE_UNIT_PRICE_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP_val(String val) ; 

	/**
	 * Ο@AMOUNT_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP_name(String val) ; 

	/**
	 * Ο@AMOUNT_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP_val(String val) ; 

	/**
	 * Ο@EDI_DATA_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP_name(String val) ; 

	/**
	 * Ο@EDI_DATA_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP_val(String val) ; 

	/**
	 * Ο@DEPOT_PLAN_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP_name(String val) ; 

	/**
	 * Ο@DEPOT_PLAN_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP_val(String val) ; 

	/**
	 * Ο@ENTRY_TYP_2_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2_name(String val) ; 

	/**
	 * Ο@ENTRY_TYP_2_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2_val(String val) ; 

	/**
	 * Ο@COMPANY_CD_hiddenΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCOMPANY_CD_hidden(String val) ; 

	/**
	 * Ο@BTN_DesinatedDlvDateΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBTN_DesinatedDlvDate(String val) ; 

	/**
	 * Ο@BUSINESSOPRDATE_hiddenΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBUSINESSOPRDATE_hidden(String val) ; 

	/**
	 * Ο@UNCNFM_ODR_CTL_NO_BKΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_CTL_NO_BK(String val) ; 

	/**
	 * Ο@UNCNFM_PLAN_TAKE_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP_name(String val) ; 

	/**
	 * Ο@UNCNFM_PLAN_TAKE_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP_val(String val) ; 

	/**
	 * Ο@h_APR_JA_UNCNFM_ODRΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_APR_JA_UNCNFM_ODR(String val) ; 

	/**
	 * Ο@APPR_REMARKSΜZbg<BR>
	 * @param String val
	 */
	public abstract void setAPPR_REMARKS(String val) ; 

	/**
	 * Ο@h_APPR_IDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_APPR_ID(String val) ; 

	/**
	 * Ο@h_SCREENMOVE_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_SCREENMOVE_TYP(String val) ; 

	/**
	 * Ο@UNCNFM_ODR_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * Ο@IN_COMPANY_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_COMPANY_CD(String val) ; 

	/**
	 * Ο@CUST_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_CD(String val) ; 

	/**
	 * Ο@CUST_ITEM_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_ITEM_CD(String val) ; 

	/**
	 * Ο@CUST_ITEM_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_ITEM_NAME(String val) ; 

	/**
	 * Ο@CUST_CHRG_ORG_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_ORG_CD(String val) ; 

	/**
	 * Ο@CUST_CHRG_PSN_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_PSN_CD(String val) ; 

	/**
	 * Ο@ACPT_ORG_CD_hiddenΜZbg<BR>
	 * @param String val
	 */
	public abstract void setACPT_ORG_CD_hidden(String val) ; 

	/**
	 * Ο@ACPT_PSN_CD_hiddenΜZbg<BR>
	 * @param String val
	 */
	public abstract void setACPT_PSN_CD_hidden(String val) ; 

	/**
	 * Ο@ITEM_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setITEM_CD(String val) ; 

	/**
	 * Ο@CUST_UNCNFM_ODR_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_UNCNFM_ODR_NO(String val) ; 

	/**
	 * Ο@FINAL_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setFINAL_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@CUST_DESINATED_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@CONCENTRATE_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@DESINATED_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE(String val) ; 

	/**
	 * Ο@CONCENTRATE_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DATE(String val) ; 

	/**
	 * Ο@SHIP_PLAN_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLAN_DATE(String val) ; 

	/**
	 * Ο@STNDRD_RCV_DESINATED_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSTNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * Ο@PURPOSE_UNIT_PRICE_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP(String val) ; 

	/**
	 * Ο@UNCNFM_ODR_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_QTY(String val) ; 

	/**
	 * Ο@AMOUNT_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP(String val) ; 

	/**
	 * Ο@DEPOT_PLAN_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP(String val) ; 

	/**
	 * Ο@DLV_LOC_OPTION_CHANGE_VALUEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * Ο@ITEM_CD_OPTION_CHANGE_VALUEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * Ο@ENTRY_TYP_2ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2(String val) ; 

	/**
	 * Ο@EDI_DATA_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP(String val) ; 

	/**
	 * Ο@EDI_DISCRIMINATION_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEDI_DISCRIMINATION_CD(String val) ; 

	/**
	 * Ο@ARRANGEMENTS_CHARACTERISTICΜZbg<BR>
	 * @param String val
	 */
	public abstract void setARRANGEMENTS_CHARACTERISTIC(String val) ; 

	/**
	 * Ο@UNCNFM_PLAN_TAKE_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP(String val) ; 

	/**
	 * Ο@UNCNFM_REQUIRED_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_DATE(String val) ; 

	/**
	 * Ο@UNCNFM_REQUIRED_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * Ο@ORG_UNCNFM_REQUIRED_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * Ο@LAST_UNCNFM_REQUIRED_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setLAST_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * Ο@WORK_DAY_DIVISION_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setWORK_DAY_DIVISION_FLG(String val) ; 

	/**
	 * Ο@MANUAL_UPDATE_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setMANUAL_UPDATE_FLG(String val) ; 

	/**
	 * Ο@REMARKSΜZbg<BR>
	 * @param String val
	 */
	public abstract void setREMARKS(String val) ; 

	/**
	 * Ο@UNCNFM_CUST_ODR_CREATE_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_CUST_ODR_CREATE_DATE(String val) ; 

	/**
	 * Ο@ORG_UNCNFM_ODR_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * Ο@UNCNFM_ODR_IF_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_IF_CTL_NO(String val) ; 

	/**
	 * Ο@DEL_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEL_FLG(String val) ; 

	/**
	 * Ο@IN_MODIFY_COUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_MODIFY_COUNT(String val) ; 

	/**
	 * Ο@CUST_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_NAME(String val) ; 

	/**
	 * Ο@CUST_DESINATED_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@FINAL_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setFINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@CONCENTRATE_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@ITEM_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setITEM_NAME(String val) ; 

	/**
	 * Ο@UNCNFM_ODR_QTY_STOCK_UNITΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_QTY_STOCK_UNIT(String val) ; 

	/**
	 * Ο@LAST_UNCNFM_REQUIRED_QTY_STOCK_UNITΜZbg<BR>
	 * @param String val
	 */
	public abstract void setLAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * Ο@UNCNFM_REQUIRED_QTY_STOCK_UNITΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * Ο@ORG_UNCNFM_REQUIRED_QTY_STOCK_UNITΜZbg<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * Ο@CUST_CHRG_ORG_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_ORG_NAME(String val) ; 

	/**
	 * Ο@CUST_CHRG_PSN_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_PSN_NAME(String val) ; 

	/**
	 * Ο@IN_BUSINESS_OPR_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_BUSINESS_OPR_DATE(String val) ; 

	/**
	 * Ο@APPR_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setAPPR_DATE(String val) ; 

	/**
	 * Ο@APPR_BYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setAPPR_BY(String val) ; 

	/**
	 * Ο@MOTO_UNCNFM_REQUIRED_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setMOTO_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * Ο@chkCUST_DESINATED_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setchkCUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@UNIT_QTY_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNIT_QTY_TYP(String val) ; 

	/**
	 * Ο@dummyΜZbg<BR>
	 * @param String val
	 */
	public abstract void setdummy(String val) ; 

	/**
	 * Ο@APPR_IDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setAPPR_ID(String val) ; 

	//KQ1080

	/**
	 * Ο@PARTS_SUP_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP_name() ; 

	/**
	 * Ο@PARTS_SUP_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP_val() ; 

	/**
	 * Ο@EST_CONF_SET_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEST_CONF_SET_FLG() ; 

	/**
	 * Ο@BTN_SALES_UNIT_PRICEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBTN_SALES_UNIT_PRICE() ; 

	/**
	 * Ο@PURPOSE_KIND_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND_name() ; 

	/**
	 * Ο@PURPOSE_KIND_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND_val() ; 

	/**
	 * Ο@ODR_CTL_NO_BKΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_CTL_NO_BK() ; 

	/**
	 * Ο@EXCH_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP_name() ; 

	/**
	 * Ο@EXCH_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP_val() ; 

	/**
	 * Ο@TAX_APPLY_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP_name() ; 

	/**
	 * Ο@TAX_APPLY_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP_val() ; 

	/**
	 * Ο@TAX_CALC_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP_name() ; 

	/**
	 * Ο@TAX_CALC_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP_val() ; 

	/**
	 * Ο@TRANSPORT_TYP_nameΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP_name() ; 

	/**
	 * Ο@TRANSPORT_TYP_valΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP_val() ; 

	/**
	 * Ο@h_APR_JA_ODRΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_APR_JA_ODR() ; 

	/**
	 * Ο@ODR_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_CTL_NO() ; 

	/**
	 * Ο@CUST_ODR_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_ODR_NO() ; 

	/**
	 * Ο@DESINATED_DLV_DATE_TIMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE_TIME() ; 

	/**
	 * Ο@DESINATED_DLV_DATE_ALLΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE_ALL() ; 

	/**
	 * Ο@ODR_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_QTY() ; 

	/**
	 * Ο@ODR_AMOUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_AMOUNT() ; 

	/**
	 * Ο@UNIT_PRICEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getUNIT_PRICE() ; 

	/**
	 * Ο@CUR_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUR_CD() ; 

	/**
	 * Ο@EXCH_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP() ; 

	/**
	 * Ο@TAX_APPLY_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP() ; 

	/**
	 * Ο@TAX_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_CD() ; 

	/**
	 * Ο@TAX_CALC_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP() ; 

	/**
	 * Ο@PART_DLV_COUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPART_DLV_COUNT() ; 

	/**
	 * Ο@SHIP_COUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_COUNT() ; 

	/**
	 * Ο@LAST_ODR_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getLAST_ODR_QTY() ; 

	/**
	 * Ο@ODR_AMOUNT_EXCH_RATESΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_AMOUNT_EXCH_RATES() ; 

	/**
	 * Ο@TOTAL_SHIP_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTOTAL_SHIP_QTY() ; 

	/**
	 * Ο@SHIP_AMOUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_AMOUNT() ; 

	/**
	 * Ο@SHIP_AMOUNT_EXCH_RATESΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_AMOUNT_EXCH_RATES() ; 

	/**
	 * Ο@RETURN_PRICEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getRETURN_PRICE() ; 

	/**
	 * Ο@RETURN_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getRETURN_QTY() ; 

	/**
	 * Ο@RETURN_AMOUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getRETURN_AMOUNT() ; 

	/**
	 * Ο@RETURN_AMOUNT_EXCH_RATESΜζΎ<BR>
	 * @return String
	 */
	public abstract String getRETURN_AMOUNT_EXCH_RATES() ; 

	/**
	 * Ο@ODR_CMPLT_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_CMPLT_FLG() ; 

	/**
	 * Ο@ODR_CMPLT_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_CMPLT_DATE() ; 

	/**
	 * Ο@TRANSPORT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_CD() ; 

	/**
	 * Ο@TRANSPORT_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP() ; 

	/**
	 * Ο@SHIP_WH_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_WH_CD() ; 

	/**
	 * Ο@IN_HOUSE_SHIP_PLAN_TRANS_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_HOUSE_SHIP_PLAN_TRANS_NO() ; 

	/**
	 * Ο@CUST_DLV_PLAN_TRANS_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_DLV_PLAN_TRANS_NO() ; 

	/**
	 * Ο@SEBANGOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSEBANGO() ; 

	/**
	 * Ο@KANBAN_PAPER_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getKANBAN_PAPER_QTY() ; 

	/**
	 * Ο@SEQUENCE_IDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_ID() ; 

	/**
	 * Ο@SEQUENCE_MARKΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_MARK() ; 

	/**
	 * Ο@SEQUENCE_LINEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_LINE() ; 

	/**
	 * Ο@SEQUENCE_CTR_NO_WEIGHTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_CTR_NO_WEIGHT() ; 

	/**
	 * Ο@SEQUENCE_CTR_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_CTR_NO() ; 

	/**
	 * Ο@PURPOSE_KINDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND() ; 

	/**
	 * Ο@KANBAN_CUST_ODR_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getKANBAN_CUST_ODR_FLG() ; 

	/**
	 * Ο@CUS_DLV_KEY_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUS_DLV_KEY_CD() ; 

	/**
	 * Ο@FIRST_LOT_CTL_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getFIRST_LOT_CTL_FLG() ; 

	/**
	 * Ο@IMP_SAFE_PARTS_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIMP_SAFE_PARTS_FLG() ; 

	/**
	 * Ο@PARTS_SUP_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP() ; 

	/**
	 * Ο@SUP_INFOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSUP_INFO() ; 

	/**
	 * Ο@INSP_INFOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getINSP_INFO() ; 

	/**
	 * Ο@CUST_DLV_INFOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_DLV_INFO() ; 

	/**
	 * Ο@TRIAL_INFOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTRIAL_INFO() ; 

	/**
	 * Ο@DESIGN_CHANGE_INFOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDESIGN_CHANGE_INFO() ; 

	/**
	 * Ο@CUST_ODR_SUB_INFOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_ODR_SUB_INFO() ; 

	/**
	 * Ο@MANU_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getMANU_LOC_CD() ; 

	/**
	 * Ο@SHIP_REMARKSΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_REMARKS() ; 

	/**
	 * Ο@SALES_REMARKSΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSALES_REMARKS() ; 

	/**
	 * Ο@ODR_IF_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_IF_CTL_NO() ; 

	/**
	 * Ο@SHIP_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_FLG() ; 

	/**
	 * Ο@STOCK_UNITΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSTOCK_UNIT() ; 

	/**
	 * Ο@CUR_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUR_NAME() ; 

	/**
	 * Ο@TAX_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTAX_NAME() ; 

	/**
	 * Ο@IN_EST_CONF_SET_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_EST_CONF_SET_FLG() ; 

	/**
	 * Ο@IN_DETAIL_ROUND_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_DETAIL_ROUND_TYP() ; 

	/**
	 * Ο@HISTORY_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getHISTORY_CTL_NO() ; 

	/**
	 * Ο@NEW_OLD_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNEW_OLD_FLG() ; 

	/**
	 * Ο@TRAN_TYPEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getTRAN_TYPE() ; 

	/**
	 * Ο@IN_ODR_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_ODR_CTL_NO() ; 

	/**
	 * Ο@chkCUST_DESINATED_DLV_LOCΜζΎ<BR>
	 * @return String
	 */
	public abstract String getchkCUST_DESINATED_DLV_LOC() ; 

	/**
	 * Ο@JOB_OD_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_OD_CD() ; 

	/**
	 * Ο@SHIP_PLANT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLANT_CD() ; 

	/**
	 * Ο@JOB_ODR_DLV_DATE_ALLΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE_ALL() ; 

	/**
	 * Ο@JOB_ODR_SET_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_SET_FLG() ; 

	/**
	 * Ο@ALCD_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getALCD_QTY() ; 

	/**
	 * Ο@T_ODR_PLANT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getT_ODR_PLANT_CD() ; 
	
	/**
	 * Ο@PARTS_SUP_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP_name(String val) ; 

	/**
	 * Ο@PARTS_SUP_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP_val(String val) ; 

	/**
	 * Ο@EST_CONF_SET_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEST_CONF_SET_FLG(String val) ; 

	/**
	 * Ο@BTN_SALES_UNIT_PRICEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBTN_SALES_UNIT_PRICE(String val) ; 

	/**
	 * Ο@PURPOSE_KIND_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND_name(String val) ; 

	/**
	 * Ο@PURPOSE_KIND_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND_val(String val) ; 

	/**
	 * Ο@ODR_CTL_NO_BKΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_CTL_NO_BK(String val) ; 

	/**
	 * Ο@EXCH_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP_name(String val) ; 

	/**
	 * Ο@EXCH_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP_val(String val) ; 

	/**
	 * Ο@TAX_APPLY_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP_name(String val) ; 

	/**
	 * Ο@TAX_APPLY_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP_val(String val) ; 

	/**
	 * Ο@TAX_CALC_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP_name(String val) ; 

	/**
	 * Ο@TAX_CALC_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP_val(String val) ; 

	/**
	 * Ο@TRANSPORT_TYP_nameΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP_name(String val) ; 

	/**
	 * Ο@TRANSPORT_TYP_valΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP_val(String val) ; 

	/**
	 * Ο@h_APR_JA_ODRΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_APR_JA_ODR(String val) ; 

	/**
	 * Ο@ODR_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_CTL_NO(String val) ; 

	/**
	 * Ο@CUST_ODR_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_ODR_NO(String val) ; 

	/**
	 * Ο@DESINATED_DLV_DATE_TIMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE_TIME(String val) ; 

	/**
	 * Ο@DESINATED_DLV_DATE_ALLΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE_ALL(String val) ; 

	/**
	 * Ο@ODR_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_QTY(String val) ; 

	/**
	 * Ο@ODR_AMOUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_AMOUNT(String val) ; 

	/**
	 * Ο@UNIT_PRICEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setUNIT_PRICE(String val) ; 

	/**
	 * Ο@CUR_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUR_CD(String val) ; 

	/**
	 * Ο@EXCH_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP(String val) ; 

	/**
	 * Ο@TAX_APPLY_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP(String val) ; 

	/**
	 * Ο@TAX_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_CD(String val) ; 

	/**
	 * Ο@TAX_CALC_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP(String val) ; 

	/**
	 * Ο@PART_DLV_COUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPART_DLV_COUNT(String val) ; 

	/**
	 * Ο@SHIP_COUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_COUNT(String val) ; 

	/**
	 * Ο@LAST_ODR_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setLAST_ODR_QTY(String val) ; 

	/**
	 * Ο@ODR_AMOUNT_EXCH_RATESΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * Ο@TOTAL_SHIP_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTOTAL_SHIP_QTY(String val) ; 

	/**
	 * Ο@SHIP_AMOUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_AMOUNT(String val) ; 

	/**
	 * Ο@SHIP_AMOUNT_EXCH_RATESΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * Ο@RETURN_PRICEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setRETURN_PRICE(String val) ; 

	/**
	 * Ο@RETURN_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setRETURN_QTY(String val) ; 

	/**
	 * Ο@RETURN_AMOUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setRETURN_AMOUNT(String val) ; 

	/**
	 * Ο@RETURN_AMOUNT_EXCH_RATESΜZbg<BR>
	 * @param String val
	 */
	public abstract void setRETURN_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * Ο@ODR_CMPLT_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_CMPLT_FLG(String val) ; 

	/**
	 * Ο@ODR_CMPLT_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_CMPLT_DATE(String val) ; 

	/**
	 * Ο@TRANSPORT_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_CD(String val) ; 

	/**
	 * Ο@TRANSPORT_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP(String val) ; 

	/**
	 * Ο@SHIP_WH_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_WH_CD(String val) ; 

	/**
	 * Ο@IN_HOUSE_SHIP_PLAN_TRANS_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_HOUSE_SHIP_PLAN_TRANS_NO(String val) ; 

	/**
	 * Ο@CUST_DLV_PLAN_TRANS_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_DLV_PLAN_TRANS_NO(String val) ; 

	/**
	 * Ο@SEBANGOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSEBANGO(String val) ; 

	/**
	 * Ο@KANBAN_PAPER_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setKANBAN_PAPER_QTY(String val) ; 

	/**
	 * Ο@SEQUENCE_IDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_ID(String val) ; 

	/**
	 * Ο@SEQUENCE_MARKΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_MARK(String val) ; 

	/**
	 * Ο@SEQUENCE_LINEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_LINE(String val) ; 

	/**
	 * Ο@SEQUENCE_CTR_NO_WEIGHTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_CTR_NO_WEIGHT(String val) ; 

	/**
	 * Ο@SEQUENCE_CTR_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_CTR_NO(String val) ; 

	/**
	 * Ο@PURPOSE_KINDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND(String val) ; 

	/**
	 * Ο@KANBAN_CUST_ODR_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setKANBAN_CUST_ODR_FLG(String val) ; 

	/**
	 * Ο@CUS_DLV_KEY_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUS_DLV_KEY_CD(String val) ; 

	/**
	 * Ο@FIRST_LOT_CTL_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setFIRST_LOT_CTL_FLG(String val) ; 

	/**
	 * Ο@IMP_SAFE_PARTS_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIMP_SAFE_PARTS_FLG(String val) ; 

	/**
	 * Ο@PARTS_SUP_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP(String val) ; 

	/**
	 * Ο@SUP_INFOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSUP_INFO(String val) ; 

	/**
	 * Ο@INSP_INFOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setINSP_INFO(String val) ; 

	/**
	 * Ο@CUST_DLV_INFOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_DLV_INFO(String val) ; 

	/**
	 * Ο@TRIAL_INFOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTRIAL_INFO(String val) ; 

	/**
	 * Ο@DESIGN_CHANGE_INFOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDESIGN_CHANGE_INFO(String val) ; 

	/**
	 * Ο@CUST_ODR_SUB_INFOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_ODR_SUB_INFO(String val) ; 

	/**
	 * Ο@MANU_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setMANU_LOC_CD(String val) ; 

	/**
	 * Ο@SHIP_REMARKSΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_REMARKS(String val) ; 

	/**
	 * Ο@SALES_REMARKSΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSALES_REMARKS(String val) ; 

	/**
	 * Ο@ODR_IF_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_IF_CTL_NO(String val) ; 

	/**
	 * Ο@SHIP_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_FLG(String val) ; 

	/**
	 * Ο@STOCK_UNITΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSTOCK_UNIT(String val) ; 

	/**
	 * Ο@CUR_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUR_NAME(String val) ; 

	/**
	 * Ο@TAX_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTAX_NAME(String val) ; 

	/**
	 * Ο@IN_EST_CONF_SET_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_EST_CONF_SET_FLG(String val) ; 

	/**
	 * Ο@IN_DETAIL_ROUND_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_DETAIL_ROUND_TYP(String val) ; 

	/**
	 * Ο@HISTORY_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setHISTORY_CTL_NO(String val) ; 

	/**
	 * Ο@NEW_OLD_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNEW_OLD_FLG(String val) ; 

	/**
	 * Ο@TRAN_TYPEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setTRAN_TYPE(String val) ; 

	/**
	 * Ο@IN_ODR_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_ODR_CTL_NO(String val) ; 

	/**
	 * Ο@chkCUST_DESINATED_DLV_LOCΜZbg<BR>
	 * @param String val
	 */
	public abstract void setchkCUST_DESINATED_DLV_LOC(String val) ; 

	/**
	 * Ο@JOB_OD_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setJOB_OD_CD(String val) ; 

	/**
	 * Ο@SHIP_PLANT_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLANT_CD(String val) ; 

	/**
	 * Ο@JOB_ODR_DLV_DATE_ALLΜZbg<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE_ALL(String val) ; 

	/**
	 * Ο@JOB_ODR_SET_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_SET_FLG(String val) ; 

	/**
	 * Ο@ALCD_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setALCD_QTY(String val) ; 
	
	
	//KQ1090

	/**
	 * Ο@ODR_QTY_AutoCalcΜζΎ<BR>
	 * @return String
	 */
	public abstract String getODR_QTY_AutoCalc() ; 

	/**
	 * Ο@SHIP_PLAN_DATE_AutoCalcΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLAN_DATE_AutoCalc() ; 

	/**
	 * Ο@IN_PKG_UNIT_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getIN_PKG_UNIT_QTY() ; 

	/**
	 * Ο@ODR_QTY_AutoCalcΜZbg<BR>
	 * @param String val
	 */
	public abstract void setODR_QTY_AutoCalc(String val) ; 

	/**
	 * Ο@SHIP_PLAN_DATE_AutoCalcΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLAN_DATE_AutoCalc(String val) ; 

	/**
	 * Ο@IN_PKG_UNIT_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setIN_PKG_UNIT_QTY(String val) ; 

	//KQ1130

	/**
	 * Ο@h_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_NO() ; 

	/**
	 * Ο@h_ENTRY_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_ENTRY_TYP() ; 

	/**
	 * Ο@c_CUST_ODR_NO_NUMBERINGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getc_CUST_ODR_NO_NUMBERING() ; 

	/**
	 * Ο@h_SHIP_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_SHIP_FLG() ; 

	/**
	 * Ο@h_UNIT_COST_READ_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_UNIT_COST_READ_FLG() ; 

	/**
	 * Ο@h_DLV_LOC_OPTION_CHANGE_VALUEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * Ο@h_DEL_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_DEL_FLG() ; 

	/**
	 * Ο@h_FINAL_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_FINAL_DLV_LOC_CD() ; 

	/**
	 * Ο@h_FINAL_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_FINAL_DLV_LOC_NAME() ; 

	/**
	 * Ο@h_ITEM_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_ITEM_NAME() ; 

	/**
	 * Ο@h_TOTAL_SHIP_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_TOTAL_SHIP_QTY() ; 

	/**
	 * Ο@h_ODR_CMPLT_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_ODR_CMPLT_FLG() ; 

	/**
	 * Ο@h_READ_CUST_ODR_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_READ_CUST_ODR_NO() ; 

	/**
	 * Ο@l_APPR_REMARKSΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_APPR_REMARKS() ; 

	/**
	 * Ο@l_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_NO() ; 

	/**
	 * Ο@l_c_DEL_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_c_DEL_FLG() ; 

	/**
	 * Ο@l_CUST_ODR_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ODR_NO() ; 

	/**
	 * Ο@l_CUST_ITEM_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ITEM_CD() ; 

	/**
	 * Ο@l_CUST_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_CUST_CD() ; 

	/**
	 * Ο@l_CUST_ANAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ANAME() ; 

	/**
	 * Ο@l_CUST_DESINATED_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_CUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * Ο@l_DESINATED_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_DESINATED_DLV_DATE() ; 

	/**
	 * Ο@l_ODR_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ODR_QTY() ; 

	/**
	 * Ο@l_STOCK_UNITΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_STOCK_UNIT() ; 

	/**
	 * Ο@l_UNIT_PRICEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_UNIT_PRICE() ; 

	/**
	 * Ο@l_PURPOSE_UNIT_PRICE_TYP_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_PURPOSE_UNIT_PRICE_TYP_NAME() ; 

	/**
	 * Ο@l_AMOUNT_TYP_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_AMOUNT_TYP_NAME() ; 

	/**
	 * Ο@l_ODR_AMOUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ODR_AMOUNT() ; 

	/**
	 * Ο@l_ITEM_CD_OPTION_CHANGE_VALUEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * Ο@l_ARRANGEMENTS_CHARACTERISTICΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ARRANGEMENTS_CHARACTERISTIC() ; 

	/**
	 * Ο@l_REMARKSΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_REMARKS() ; 

	/**
	 * Ο@l_CUST_ITEM_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ITEM_NAME() ; 

	/**
	 * Ο@l_ITEM_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_CD() ; 

	/**
	 * Ο@l_ITEM_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_NAME() ; 

	/**
	 * Ο@l_CUST_DESINATED_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_CUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * Ο@l_FINAL_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_FINAL_DLV_LOC_CD() ; 

	/**
	 * Ο@l_FINAL_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_FINAL_DLV_LOC_NAME() ; 

	/**
	 * Ο@l_DISP_SHIP_PLAN_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_DISP_SHIP_PLAN_DATE() ; 

	/**
	 * Ο@h_l_ODR_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_CTL_NO() ; 

	/**
	 * Ο@h_l_CUST_CHRG_ORG_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_CUST_CHRG_ORG_CD() ; 

	/**
	 * Ο@h_l_CUST_CHRG_PSN_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_CUST_CHRG_PSN_CD() ; 

	/**
	 * Ο@h_l_CONCENTRATE_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_CONCENTRATE_DLV_LOC_CD() ; 

	/**
	 * Ο@h_l_CONCENTRATE_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_CONCENTRATE_DATE() ; 

	/**
	 * Ο@h_l_SHIP_PLAN_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_PLAN_DATE() ; 

	/**
	 * Ο@h_l_STNDRD_RCV_DESINATED_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_STNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * Ο@h_l_DESINATED_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_DESINATED_DLV_DATE() ; 

	/**
	 * Ο@h_l_DESINATED_DLV_TIMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_DESINATED_DLV_TIME() ; 

	/**
	 * Ο@h_l_PURPOSE_UNIT_PRICE_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_PURPOSE_UNIT_PRICE_TYP() ; 

	/**
	 * Ο@h_l_CUR_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_CUR_CD() ; 

	/**
	 * Ο@h_l_EXCH_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_EXCH_TYP() ; 

	/**
	 * Ο@h_l_AMOUNT_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_AMOUNT_TYP() ; 

	/**
	 * Ο@h_l_TAX_APPLY_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_APPLY_TYP() ; 

	/**
	 * Ο@h_l_TAX_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_CD() ; 

	/**
	 * Ο@h_l_TAX_CALC_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_CALC_TYP() ; 

	/**
	 * Ο@h_l_ODR_AMOUNT_EXCH_RATESΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_AMOUNT_EXCH_RATES() ; 

	/**
	 * Ο@h_l_ODR_CMPLT_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_CMPLT_FLG() ; 

	/**
	 * Ο@h_l_TOTAL_SHIP_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_TOTAL_SHIP_QTY() ; 

	/**
	 * Ο@h_l_TRANSPORT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_TRANSPORT_CD() ; 

	/**
	 * Ο@h_l_TRANSPORT_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_TRANSPORT_TYP() ; 

	/**
	 * Ο@h_l_SHIP_WH_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_WH_CD() ; 

	/**
	 * Ο@h_l_PURPOSE_KINDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_PURPOSE_KIND() ; 

	/**
	 * Ο@h_l_DEPOT_PLAN_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_DEPOT_PLAN_TYP() ; 

	/**
	 * Ο@h_l_DLV_LOC_OPTION_CHANGE_VALUEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * Ο@h_l_ENTRY_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_ENTRY_TYP() ; 

	/**
	 * Ο@h_l_SHIP_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_FLG() ; 

	/**
	 * Ο@h_l_MODIFY_COUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_MODIFY_COUNT() ; 

	/**
	 * Ο@h_l_DATA_EDIT_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_DATA_EDIT_FLG() ; 

	/**
	 * Ο@SELECT_CUST_ODR_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSELECT_CUST_ODR_NO() ; 

	/**
	 * Ο@w_LAST_ODR_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_LAST_ODR_QTY() ; 

	/**
	 * Ο@w_CODEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CODE() ; 

	/**
	 * Ο@w_CODE2ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CODE2() ; 

	/**
	 * Ο@w_SYS_CLASSΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_SYS_CLASS() ; 

	/**
	 * Ο@w_CLASS_CODEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CLASS_CODE() ; 

	/**
	 * Ο@w_CUST_ANAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ANAME() ; 

	/**
	 * Ο@w_OWN_ORG_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_OWN_ORG_CD() ; 

	/**
	 * Ο@w_OWN_PERSON_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_OWN_PERSON_CD() ; 

	/**
	 * Ο@w_CUR_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CUR_CD() ; 

	/**
	 * Ο@w_EXCH_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_EXCH_TYP() ; 

	/**
	 * Ο@w_TAX_APPLY_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_TAX_APPLY_TYP() ; 

	/**
	 * Ο@w_TAX_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_TAX_CD() ; 

	/**
	 * Ο@w_TAX_CALC_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_TAX_CALC_TYP() ; 

	/**
	 * Ο@w_DETAIL_ROUND_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_DETAIL_ROUND_TYP() ; 

	/**
	 * Ο@w_COMPANY_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_COMPANY_CD() ; 

	/**
	 * Ο@w_CUST_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CUST_CD() ; 

	/**
	 * Ο@w_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_NAME() ; 

	/**
	 * Ο@w_CNCNTRT_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CNCNTRT_DLV_LOC_CD() ; 

	/**
	 * Ο@w_SHIP_CTL_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_CTL_TYP() ; 

	/**
	 * Ο@w_TRANSPORT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_TRANSPORT_CD() ; 

	/**
	 * Ο@w_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_CD() ; 

	/**
	 * Ο@w_CUST_ODR_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ODR_NO() ; 

	/**
	 * Ο@w_ACPT_PSN_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_ACPT_PSN_CD() ; 

	/**
	 * Ο@w_UNCNFM_CUST_ODR_CREATE_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_CUST_ODR_CREATE_DATE() ; 

	/**
	 * Ο@w_NEW_OLD_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_NEW_OLD_FLG() ; 

	/**
	 * Ο@w_TRAN_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_TRAN_TYP() ; 

	/**
	 * Ο@w_USER_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_USER_CD() ; 

	/**
	 * Ο@w_PRG_NMΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_PRG_NM() ; 

	/**
	 * Ο@w_SHIP_WH_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_WH_CD() ; 

	/**
	 * Ο@w_ITEM_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_CD() ; 

	/**
	 * Ο@w_PURPOSE_KINDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_PURPOSE_KIND() ; 

	/**
	 * Ο@w_CUST_ITEM_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ITEM_CD() ; 

	/**
	 * Ο@w_ITEM_CD_OPTION_CHANGE_VALUEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * Ο@w_DESINATED_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_DESINATED_DLV_DATE() ; 

	/**
	 * Ο@w_ITEM_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_NAME() ; 

	/**
	 * Ο@w_STOCK_UNITΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_STOCK_UNIT() ; 

	/**
	 * Ο@w_UNIT_QTY_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_UNIT_QTY_TYP() ; 

	/**
	 * Ο@w_CUST_DESINATED_DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * Ο@w_CUST_DESINATED_DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * Ο@w_DLV_LOC_OPTION_CHANGE_VALUEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * Ο@w_ODR_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_ODR_CTL_NO() ; 

	/**
	 * Ο@CUST_ANAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCUST_ANAME() ; 

	/**
	 * Ο@JOB_ODR_DLV_DATE_TIMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE_TIME() ; 

	/**
	 * Ο@DLV_LOC_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_CD() ; 
	/**
	 * Ο@SHIP_CTL_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getSHIP_CTL_TYP() ; 
	/**
	 * Ο@h_l_JOB_ODR_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_JOB_ODR_DLV_DATE() ; 

	/**
	 * Ο@h_l_JOB_ODR_DLV_TIMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_l_JOB_ODR_DLV_TIME() ; 	
	
	/**
	 * Ο@JOB_ODR_DLV_TIMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_TIME() ; 	
	
	/**
	 * Ο@h_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_NO(String val) ; 

	/**
	 * Ο@h_ENTRY_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_ENTRY_TYP(String val) ; 

	/**
	 * Ο@c_CUST_ODR_NO_NUMBERINGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setc_CUST_ODR_NO_NUMBERING(String val) ; 

	/**
	 * Ο@h_SHIP_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_SHIP_FLG(String val) ; 

	/**
	 * Ο@h_UNIT_COST_READ_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_UNIT_COST_READ_FLG(String val) ; 

	/**
	 * Ο@h_DLV_LOC_OPTION_CHANGE_VALUEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * Ο@h_DEL_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_DEL_FLG(String val) ; 

	/**
	 * Ο@h_FINAL_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_FINAL_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@h_FINAL_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_FINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@h_ITEM_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_ITEM_NAME(String val) ; 

	/**
	 * Ο@h_TOTAL_SHIP_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_TOTAL_SHIP_QTY(String val) ; 

	/**
	 * Ο@h_ODR_CMPLT_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_ODR_CMPLT_FLG(String val) ; 

	/**
	 * Ο@h_READ_CUST_ODR_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_READ_CUST_ODR_NO(String val) ; 

	/**
	 * Ο@l_APPR_REMARKSΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_APPR_REMARKS(String val) ; 

	/**
	 * Ο@l_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_NO(String val) ; 

	/**
	 * Ο@l_c_DEL_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_c_DEL_FLG(String val) ; 

	/**
	 * Ο@l_CUST_ODR_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ODR_NO(String val) ; 

	/**
	 * Ο@l_CUST_ITEM_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ITEM_CD(String val) ; 

	/**
	 * Ο@l_CUST_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_CD(String val) ; 

	/**
	 * Ο@l_CUST_ANAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ANAME(String val) ; 

	/**
	 * Ο@l_CUST_DESINATED_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@l_DESINATED_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_DESINATED_DLV_DATE(String val) ; 

	/**
	 * Ο@l_ODR_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_ODR_QTY(String val) ; 

	/**
	 * Ο@l_STOCK_UNITΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_STOCK_UNIT(String val) ; 

	/**
	 * Ο@l_UNIT_PRICEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_UNIT_PRICE(String val) ; 

	/**
	 * Ο@l_PURPOSE_UNIT_PRICE_TYP_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_PURPOSE_UNIT_PRICE_TYP_NAME(String val) ; 

	/**
	 * Ο@l_AMOUNT_TYP_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_AMOUNT_TYP_NAME(String val) ; 

	/**
	 * Ο@l_ODR_AMOUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_ODR_AMOUNT(String val) ; 

	/**
	 * Ο@l_ITEM_CD_OPTION_CHANGE_VALUEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * Ο@l_ARRANGEMENTS_CHARACTERISTICΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_ARRANGEMENTS_CHARACTERISTIC(String val) ; 

	/**
	 * Ο@l_REMARKSΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_REMARKS(String val) ; 

	/**
	 * Ο@l_CUST_ITEM_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ITEM_NAME(String val) ; 

	/**
	 * Ο@l_ITEM_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_CD(String val) ; 

	/**
	 * Ο@l_ITEM_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_NAME(String val) ; 

	/**
	 * Ο@l_CUST_DESINATED_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@l_FINAL_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_FINAL_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@l_FINAL_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_FINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@l_DISP_SHIP_PLAN_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setl_DISP_SHIP_PLAN_DATE(String val) ; 

	/**
	 * Ο@h_l_ODR_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_CTL_NO(String val) ; 

	/**
	 * Ο@h_l_CUST_CHRG_ORG_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUST_CHRG_ORG_CD(String val) ; 

	/**
	 * Ο@h_l_CUST_CHRG_PSN_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUST_CHRG_PSN_CD(String val) ; 

	/**
	 * Ο@h_l_CONCENTRATE_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_CONCENTRATE_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@h_l_CONCENTRATE_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_CONCENTRATE_DATE(String val) ; 

	/**
	 * Ο@h_l_SHIP_PLAN_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_PLAN_DATE(String val) ; 

	/**
	 * Ο@h_l_STNDRD_RCV_DESINATED_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_STNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * Ο@h_l_DESINATED_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_DESINATED_DLV_DATE(String val) ; 

	/**
	 * Ο@h_l_DESINATED_DLV_TIMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_DESINATED_DLV_TIME(String val) ; 

	/**
	 * Ο@h_l_PURPOSE_UNIT_PRICE_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_PURPOSE_UNIT_PRICE_TYP(String val) ; 

	/**
	 * Ο@h_l_CUR_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUR_CD(String val) ; 

	/**
	 * Ο@h_l_EXCH_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_EXCH_TYP(String val) ; 

	/**
	 * Ο@h_l_AMOUNT_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_AMOUNT_TYP(String val) ; 

	/**
	 * Ο@h_l_TAX_APPLY_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_APPLY_TYP(String val) ; 

	/**
	 * Ο@h_l_TAX_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_CD(String val) ; 

	/**
	 * Ο@h_l_TAX_CALC_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_CALC_TYP(String val) ; 

	/**
	 * Ο@h_l_ODR_AMOUNT_EXCH_RATESΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * Ο@h_l_ODR_CMPLT_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_CMPLT_FLG(String val) ; 

	/**
	 * Ο@h_l_TOTAL_SHIP_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_TOTAL_SHIP_QTY(String val) ; 

	/**
	 * Ο@h_l_TRANSPORT_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_TRANSPORT_CD(String val) ; 

	/**
	 * Ο@h_l_TRANSPORT_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_TRANSPORT_TYP(String val) ; 

	/**
	 * Ο@h_l_SHIP_WH_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_WH_CD(String val) ; 

	/**
	 * Ο@h_l_PURPOSE_KINDΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_PURPOSE_KIND(String val) ; 

	/**
	 * Ο@h_l_DEPOT_PLAN_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_DEPOT_PLAN_TYP(String val) ; 

	/**
	 * Ο@h_l_DLV_LOC_OPTION_CHANGE_VALUEΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * Ο@h_l_ENTRY_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_ENTRY_TYP(String val) ; 

	/**
	 * Ο@h_l_SHIP_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_FLG(String val) ; 

	/**
	 * Ο@h_l_MODIFY_COUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_MODIFY_COUNT(String val) ; 

	/**
	 * Ο@h_l_DATA_EDIT_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_l_DATA_EDIT_FLG(String val) ; 

	/**
	 * Ο@SELECT_CUST_ODR_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setSELECT_CUST_ODR_NO(String val) ; 

	/**
	 * Ο@w_LAST_ODR_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_LAST_ODR_QTY(String val) ; 

	/**
	 * Ο@w_CODEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CODE(String val) ; 

	/**
	 * Ο@w_CODE2ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CODE2(String val) ; 

	/**
	 * Ο@w_SYS_CLASSΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_SYS_CLASS(String val) ; 

	/**
	 * Ο@w_CLASS_CODEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CLASS_CODE(String val) ; 

	/**
	 * Ο@w_CUST_ANAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ANAME(String val) ; 

	/**
	 * Ο@w_OWN_ORG_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_OWN_ORG_CD(String val) ; 

	/**
	 * Ο@w_OWN_PERSON_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_OWN_PERSON_CD(String val) ; 

	/**
	 * Ο@w_CUR_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CUR_CD(String val) ; 

	/**
	 * Ο@w_EXCH_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_EXCH_TYP(String val) ; 

	/**
	 * Ο@w_TAX_APPLY_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_APPLY_TYP(String val) ; 

	/**
	 * Ο@w_TAX_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_CD(String val) ; 

	/**
	 * Ο@w_TAX_CALC_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_CALC_TYP(String val) ; 

	/**
	 * Ο@w_DETAIL_ROUND_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_DETAIL_ROUND_TYP(String val) ; 

	/**
	 * Ο@w_COMPANY_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_COMPANY_CD(String val) ; 

	/**
	 * Ο@w_CUST_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_CD(String val) ; 

	/**
	 * Ο@w_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@w_CNCNTRT_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CNCNTRT_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@w_SHIP_CTL_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_CTL_TYP(String val) ; 

	/**
	 * Ο@w_TRANSPORT_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_TRANSPORT_CD(String val) ; 

	/**
	 * Ο@w_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@w_CUST_ODR_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ODR_NO(String val) ; 

	/**
	 * Ο@w_ACPT_PSN_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_ACPT_PSN_CD(String val) ; 

	/**
	 * Ο@w_UNCNFM_CUST_ODR_CREATE_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_CUST_ODR_CREATE_DATE(String val) ; 

	/**
	 * Ο@w_NEW_OLD_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_NEW_OLD_FLG(String val) ; 

	/**
	 * Ο@w_TRAN_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_TRAN_TYP(String val) ; 

	/**
	 * Ο@w_USER_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_USER_CD(String val) ; 

	/**
	 * Ο@w_PRG_NMΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_PRG_NM(String val) ; 

	/**
	 * Ο@w_SHIP_WH_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_WH_CD(String val) ; 

	/**
	 * Ο@w_ITEM_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_CD(String val) ; 

	/**
	 * Ο@w_PURPOSE_KINDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_PURPOSE_KIND(String val) ; 

	/**
	 * Ο@w_CUST_ITEM_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ITEM_CD(String val) ; 

	/**
	 * Ο@w_ITEM_CD_OPTION_CHANGE_VALUEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * Ο@w_DESINATED_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_DESINATED_DLV_DATE(String val) ; 

	/**
	 * Ο@w_ITEM_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_NAME(String val) ; 

	/**
	 * Ο@w_STOCK_UNITΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_STOCK_UNIT(String val) ; 

	/**
	 * Ο@w_UNIT_QTY_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_UNIT_QTY_TYP(String val) ; 

	/**
	 * Ο@w_CUST_DESINATED_DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * Ο@w_CUST_DESINATED_DLV_LOC_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * Ο@w_DLV_LOC_OPTION_CHANGE_VALUEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * Ο@w_ODR_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_ODR_CTL_NO(String val) ; 

	/**
	 * Ο@CUST_ANAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setCUST_ANAME(String val) ; 

	//KQ1140

	/**
	 * Ο@DISP_DAY_1ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_1() ; 

	/**
	 * Ο@DISP_DAY_2ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_2() ; 

	/**
	 * Ο@DISP_DAY_3ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_3() ; 

	/**
	 * Ο@DISP_DAY_4ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_4() ; 

	/**
	 * Ο@DISP_DAY_5ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_5() ; 

	/**
	 * Ο@DISP_DAY_6ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_6() ; 

	/**
	 * Ο@DISP_DAY_7ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_7() ; 

	/**
	 * Ο@DISP_DAY_8ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_8() ; 

	/**
	 * Ο@DISP_DAY_9ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_9() ; 

	/**
	 * Ο@DISP_DAY_10ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_10() ; 

	/**
	 * Ο@DISP_NEXT_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_NEXT_MONTH() ; 

	/**
	 * Ο@NOW_QTY_DAY_1ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_1() ; 

	/**
	 * Ο@NOW_QTY_DAY_2ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_2() ; 

	/**
	 * Ο@NOW_QTY_DAY_3ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_3() ; 

	/**
	 * Ο@NOW_QTY_DAY_4ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_4() ; 

	/**
	 * Ο@NOW_QTY_DAY_5ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_5() ; 

	/**
	 * Ο@NOW_QTY_DAY_6ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_6() ; 

	/**
	 * Ο@NOW_QTY_DAY_7ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_7() ; 

	/**
	 * Ο@NOW_QTY_DAY_8ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_8() ; 

	/**
	 * Ο@NOW_QTY_DAY_9ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_9() ; 

	/**
	 * Ο@NOW_QTY_DAY_10ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_10() ; 

	/**
	 * Ο@NOW_QTY_NEXT_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_NEXT_MONTH() ; 

	/**
	 * Ο@BEF_QTY_DAY_1ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_1() ; 

	/**
	 * Ο@BEF_QTY_DAY_2ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_2() ; 

	/**
	 * Ο@BEF_QTY_DAY_3ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_3() ; 

	/**
	 * Ο@BEF_QTY_DAY_4ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_4() ; 

	/**
	 * Ο@BEF_QTY_DAY_5ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_5() ; 

	/**
	 * Ο@BEF_QTY_DAY_6ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_6() ; 

	/**
	 * Ο@BEF_QTY_DAY_7ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_7() ; 

	/**
	 * Ο@BEF_QTY_DAY_8ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_8() ; 

	/**
	 * Ο@BEF_QTY_DAY_9ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_9() ; 

	/**
	 * Ο@BEF_QTY_DAY_10ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_10() ; 

	/**
	 * Ο@BEF_QTY_NEXT_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_NEXT_MONTH() ; 

	/**
	 * Ο@DEF_QTY_DAY_1ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_1() ; 

	/**
	 * Ο@DEF_QTY_DAY_2ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_2() ; 

	/**
	 * Ο@DEF_QTY_DAY_3ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_3() ; 

	/**
	 * Ο@DEF_QTY_DAY_4ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_4() ; 

	/**
	 * Ο@DEF_QTY_DAY_5ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_5() ; 

	/**
	 * Ο@DEF_QTY_DAY_6ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_6() ; 

	/**
	 * Ο@DEF_QTY_DAY_7ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_7() ; 

	/**
	 * Ο@DEF_QTY_DAY_8ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_8() ; 

	/**
	 * Ο@DEF_QTY_DAY_9ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_9() ; 

	/**
	 * Ο@DEF_QTY_DAY_10ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_10() ; 

	/**
	 * Ο@DEF_QTY_NEXT_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_NEXT_MONTH() ; 

	/**
	 * Ο@DISP_DAY_11ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_11() ; 

	/**
	 * Ο@DISP_DAY_12ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_12() ; 

	/**
	 * Ο@DISP_DAY_13ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_13() ; 

	/**
	 * Ο@DISP_DAY_14ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_14() ; 

	/**
	 * Ο@DISP_DAY_15ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_15() ; 

	/**
	 * Ο@DISP_DAY_16ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_16() ; 

	/**
	 * Ο@DISP_DAY_17ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_17() ; 

	/**
	 * Ο@DISP_DAY_18ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_18() ; 

	/**
	 * Ο@DISP_DAY_19ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_19() ; 

	/**
	 * Ο@DISP_DAY_20ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_20() ; 

	/**
	 * Ο@DISP_2ND_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_2ND_MONTH() ; 

	/**
	 * Ο@NOW_QTY_DAY_11ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_11() ; 

	/**
	 * Ο@NOW_QTY_DAY_12ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_12() ; 

	/**
	 * Ο@NOW_QTY_DAY_13ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_13() ; 

	/**
	 * Ο@NOW_QTY_DAY_14ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_14() ; 

	/**
	 * Ο@NOW_QTY_DAY_15ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_15() ; 

	/**
	 * Ο@NOW_QTY_DAY_16ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_16() ; 

	/**
	 * Ο@NOW_QTY_DAY_17ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_17() ; 

	/**
	 * Ο@NOW_QTY_DAY_18ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_18() ; 

	/**
	 * Ο@NOW_QTY_DAY_19ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_19() ; 

	/**
	 * Ο@NOW_QTY_DAY_20ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_20() ; 

	/**
	 * Ο@NOW_QTY_2ND_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_2ND_MONTH() ; 

	/**
	 * Ο@BEF_QTY_DAY_11ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_11() ; 

	/**
	 * Ο@BEF_QTY_DAY_12ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_12() ; 

	/**
	 * Ο@BEF_QTY_DAY_13ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_13() ; 

	/**
	 * Ο@BEF_QTY_DAY_14ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_14() ; 

	/**
	 * Ο@BEF_QTY_DAY_15ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_15() ; 

	/**
	 * Ο@BEF_QTY_DAY_16ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_16() ; 

	/**
	 * Ο@BEF_QTY_DAY_17ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_17() ; 

	/**
	 * Ο@BEF_QTY_DAY_18ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_18() ; 

	/**
	 * Ο@BEF_QTY_DAY_19ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_19() ; 

	/**
	 * Ο@BEF_QTY_DAY_20ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_20() ; 

	/**
	 * Ο@BEF_QTY_2ND_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_2ND_MONTH() ; 

	/**
	 * Ο@DEF_QTY_DAY_11ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_11() ; 

	/**
	 * Ο@DEF_QTY_DAY_12ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_12() ; 

	/**
	 * Ο@DEF_QTY_DAY_13ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_13() ; 

	/**
	 * Ο@DEF_QTY_DAY_14ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_14() ; 

	/**
	 * Ο@DEF_QTY_DAY_15ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_15() ; 

	/**
	 * Ο@DEF_QTY_DAY_16ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_16() ; 

	/**
	 * Ο@DEF_QTY_DAY_17ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_17() ; 

	/**
	 * Ο@DEF_QTY_DAY_18ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_18() ; 

	/**
	 * Ο@DEF_QTY_DAY_19ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_19() ; 

	/**
	 * Ο@DEF_QTY_DAY_20ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_20() ; 

	/**
	 * Ο@DEF_QTY_2ND_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_2ND_MONTH() ; 

	/**
	 * Ο@DISP_DAY_21ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_21() ; 

	/**
	 * Ο@DISP_DAY_22ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_22() ; 

	/**
	 * Ο@DISP_DAY_23ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_23() ; 

	/**
	 * Ο@DISP_DAY_24ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_24() ; 

	/**
	 * Ο@DISP_DAY_25ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_25() ; 

	/**
	 * Ο@DISP_DAY_26ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_26() ; 

	/**
	 * Ο@DISP_DAY_27ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_27() ; 

	/**
	 * Ο@DISP_DAY_28ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_28() ; 

	/**
	 * Ο@DISP_DAY_29ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_29() ; 

	/**
	 * Ο@DISP_DAY_30ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_30() ; 

	/**
	 * Ο@DISP_DAY_31ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_31() ; 

	/**
	 * Ο@NOW_QTY_DAY_21ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_21() ; 

	/**
	 * Ο@NOW_QTY_DAY_22ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_22() ; 

	/**
	 * Ο@NOW_QTY_DAY_23ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_23() ; 

	/**
	 * Ο@NOW_QTY_DAY_24ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_24() ; 

	/**
	 * Ο@NOW_QTY_DAY_25ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_25() ; 

	/**
	 * Ο@NOW_QTY_DAY_26ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_26() ; 

	/**
	 * Ο@NOW_QTY_DAY_27ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_27() ; 

	/**
	 * Ο@NOW_QTY_DAY_28ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_28() ; 

	/**
	 * Ο@NOW_QTY_DAY_29ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_29() ; 

	/**
	 * Ο@NOW_QTY_DAY_30ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_30() ; 

	/**
	 * Ο@NOW_QTY_DAY_31ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_31() ; 

	/**
	 * Ο@BEF_QTY_DAY_21ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_21() ; 

	/**
	 * Ο@BEF_QTY_DAY_22ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_22() ; 

	/**
	 * Ο@BEF_QTY_DAY_23ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_23() ; 

	/**
	 * Ο@BEF_QTY_DAY_24ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_24() ; 

	/**
	 * Ο@BEF_QTY_DAY_25ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_25() ; 

	/**
	 * Ο@BEF_QTY_DAY_26ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_26() ; 

	/**
	 * Ο@BEF_QTY_DAY_27ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_27() ; 

	/**
	 * Ο@BEF_QTY_DAY_28ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_28() ; 

	/**
	 * Ο@BEF_QTY_DAY_29ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_29() ; 

	/**
	 * Ο@BEF_QTY_DAY_30ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_30() ; 

	/**
	 * Ο@BEF_QTY_DAY_31ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_31() ; 

	/**
	 * Ο@DEF_QTY_DAY_21ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_21() ; 

	/**
	 * Ο@DEF_QTY_DAY_22ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_22() ; 

	/**
	 * Ο@DEF_QTY_DAY_23ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_23() ; 

	/**
	 * Ο@DEF_QTY_DAY_24ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_24() ; 

	/**
	 * Ο@DEF_QTY_DAY_25ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_25() ; 

	/**
	 * Ο@DEF_QTY_DAY_26ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_26() ; 

	/**
	 * Ο@DEF_QTY_DAY_27ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_27() ; 

	/**
	 * Ο@DEF_QTY_DAY_28ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_28() ; 

	/**
	 * Ο@DEF_QTY_DAY_29ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_29() ; 

	/**
	 * Ο@DEF_QTY_DAY_30ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_30() ; 

	/**
	 * Ο@DEF_QTY_DAY_31ΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_31() ; 

	/**
	 * Ο@NOW_SUM_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getNOW_SUM_QTY() ; 

	/**
	 * Ο@BEFORE_SUM_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getBEFORE_SUM_QTY() ; 

	/**
	 * Ο@h_MASK_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_MASK_FLG() ; 

	/**
	 * Ο@w_PLANT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_PLANT_CD() ; 

	/**
	 * Ο@OWN_ORG_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getOWN_ORG_CD() ; 

	/**
	 * Ο@DLV_LOC_NAMEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_NAME() ; 

	/**
	 * Ο@w_CAL_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CAL_DATE() ; 

	/**
	 * Ο@w_HOLIDAY_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_HOLIDAY_FLG() ; 

	/**
	 * Ο@w_UNCNFM_REQUIRED_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_REQUIRED_DATE() ; 

	/**
	 * Ο@w_UNCNFM_ODR_CTL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_CTL_NO() ; 

	/**
	 * Ο@w_UNCNFM_ODR_QTY_NOWΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_QTY_NOW() ; 

	/**
	 * Ο@w_UNCNFM_ODR_QTY_BEFΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_QTY_BEF() ; 

	/**
	 * Ο@w_MODIFY_COUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_MODIFY_COUNT() ; 

	/**
	 * Ο@w_COUNTΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_COUNT() ; 

	/**
	 * Ο@w_EDI_DATA_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_EDI_DATA_TYP() ; 

	/**
	 * Ο@w_BUSINESS_OPR_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_BUSINESS_OPR_DATE() ; 

	/**
	 * Ο@w_LAST_DAYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_LAST_DAY() ; 

	/**
	 * Ο@YEAR_MONTHΜζΎ<BR>
	 * @return String
	 */
	public abstract String getYEAR_MONTH() ; 

	/**
	 * Ο@w_CONCENTRATE_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_CONCENTRATE_DATE() ; 

	/**
	 * Ο@w_SHIP_PLAN_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_PLAN_DATE() ; 

	/**
	 * Ο@w_STNDRD_RCV_DESINATED_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_STNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * Ο@w_DEPOT_PLAN_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getw_DEPOT_PLAN_TYP() ; 

	/**
	 * Ο@MAX_CAL_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getMAX_CAL_DATE() ; 

	/**
	 * Ο@DISP_DAY_1ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_1(String val) ; 

	/**
	 * Ο@DISP_DAY_2ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_2(String val) ; 

	/**
	 * Ο@DISP_DAY_3ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_3(String val) ; 

	/**
	 * Ο@DISP_DAY_4ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_4(String val) ; 

	/**
	 * Ο@DISP_DAY_5ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_5(String val) ; 

	/**
	 * Ο@DISP_DAY_6ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_6(String val) ; 

	/**
	 * Ο@DISP_DAY_7ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_7(String val) ; 

	/**
	 * Ο@DISP_DAY_8ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_8(String val) ; 

	/**
	 * Ο@DISP_DAY_9ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_9(String val) ; 

	/**
	 * Ο@DISP_DAY_10ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_10(String val) ; 

	/**
	 * Ο@DISP_NEXT_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_NEXT_MONTH(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_1ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_1(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_2ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_2(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_3ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_3(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_4ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_4(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_5ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_5(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_6ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_6(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_7ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_7(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_8ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_8(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_9ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_9(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_10ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_10(String val) ; 

	/**
	 * Ο@NOW_QTY_NEXT_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_NEXT_MONTH(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_1ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_1(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_2ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_2(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_3ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_3(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_4ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_4(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_5ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_5(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_6ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_6(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_7ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_7(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_8ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_8(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_9ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_9(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_10ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_10(String val) ; 

	/**
	 * Ο@BEF_QTY_NEXT_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_NEXT_MONTH(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_1ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_1(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_2ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_2(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_3ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_3(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_4ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_4(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_5ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_5(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_6ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_6(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_7ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_7(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_8ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_8(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_9ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_9(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_10ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_10(String val) ; 

	/**
	 * Ο@DEF_QTY_NEXT_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_NEXT_MONTH(String val) ; 

	/**
	 * Ο@DISP_DAY_11ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_11(String val) ; 

	/**
	 * Ο@DISP_DAY_12ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_12(String val) ; 

	/**
	 * Ο@DISP_DAY_13ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_13(String val) ; 

	/**
	 * Ο@DISP_DAY_14ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_14(String val) ; 

	/**
	 * Ο@DISP_DAY_15ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_15(String val) ; 

	/**
	 * Ο@DISP_DAY_16ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_16(String val) ; 

	/**
	 * Ο@DISP_DAY_17ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_17(String val) ; 

	/**
	 * Ο@DISP_DAY_18ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_18(String val) ; 

	/**
	 * Ο@DISP_DAY_19ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_19(String val) ; 

	/**
	 * Ο@DISP_DAY_20ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_20(String val) ; 

	/**
	 * Ο@DISP_2ND_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_2ND_MONTH(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_11ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_11(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_12ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_12(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_13ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_13(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_14ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_14(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_15ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_15(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_16ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_16(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_17ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_17(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_18ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_18(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_19ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_19(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_20ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_20(String val) ; 

	/**
	 * Ο@NOW_QTY_2ND_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_2ND_MONTH(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_11ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_11(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_12ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_12(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_13ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_13(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_14ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_14(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_15ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_15(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_16ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_16(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_17ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_17(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_18ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_18(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_19ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_19(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_20ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_20(String val) ; 

	/**
	 * Ο@BEF_QTY_2ND_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_2ND_MONTH(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_11ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_11(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_12ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_12(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_13ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_13(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_14ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_14(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_15ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_15(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_16ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_16(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_17ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_17(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_18ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_18(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_19ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_19(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_20ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_20(String val) ; 

	/**
	 * Ο@DEF_QTY_2ND_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_2ND_MONTH(String val) ; 

	/**
	 * Ο@DISP_DAY_21ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_21(String val) ; 

	/**
	 * Ο@DISP_DAY_22ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_22(String val) ; 

	/**
	 * Ο@DISP_DAY_23ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_23(String val) ; 

	/**
	 * Ο@DISP_DAY_24ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_24(String val) ; 

	/**
	 * Ο@DISP_DAY_25ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_25(String val) ; 

	/**
	 * Ο@DISP_DAY_26ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_26(String val) ; 

	/**
	 * Ο@DISP_DAY_27ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_27(String val) ; 

	/**
	 * Ο@DISP_DAY_28ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_28(String val) ; 

	/**
	 * Ο@DISP_DAY_29ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_29(String val) ; 

	/**
	 * Ο@DISP_DAY_30ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_30(String val) ; 

	/**
	 * Ο@DISP_DAY_31ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_31(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_21ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_21(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_22ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_22(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_23ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_23(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_24ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_24(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_25ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_25(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_26ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_26(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_27ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_27(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_28ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_28(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_29ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_29(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_30ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_30(String val) ; 

	/**
	 * Ο@NOW_QTY_DAY_31ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_31(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_21ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_21(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_22ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_22(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_23ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_23(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_24ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_24(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_25ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_25(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_26ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_26(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_27ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_27(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_28ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_28(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_29ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_29(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_30ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_30(String val) ; 

	/**
	 * Ο@BEF_QTY_DAY_31ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_31(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_21ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_21(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_22ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_22(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_23ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_23(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_24ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_24(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_25ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_25(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_26ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_26(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_27ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_27(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_28ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_28(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_29ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_29(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_30ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_30(String val) ; 

	/**
	 * Ο@DEF_QTY_DAY_31ΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_31(String val) ; 

	/**
	 * Ο@NOW_SUM_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setNOW_SUM_QTY(String val) ; 

	/**
	 * Ο@BEFORE_SUM_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setBEFORE_SUM_QTY(String val) ; 

	/**
	 * Ο@h_MASK_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void seth_MASK_FLG(String val) ; 

	/**
	 * Ο@w_PLANT_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_PLANT_CD(String val) ; 

	/**
	 * Ο@OWN_ORG_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setOWN_ORG_CD(String val) ; 

	/**
	 * Ο@DLV_LOC_NAMEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setDLV_LOC_NAME(String val) ; 

	/**
	 * Ο@w_CAL_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CAL_DATE(String val) ; 

	/**
	 * Ο@w_HOLIDAY_FLGΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_HOLIDAY_FLG(String val) ; 

	/**
	 * Ο@w_UNCNFM_REQUIRED_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_REQUIRED_DATE(String val) ; 

	/**
	 * Ο@w_UNCNFM_ODR_CTL_NOΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * Ο@w_UNCNFM_ODR_QTY_NOWΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_QTY_NOW(String val) ; 

	/**
	 * Ο@w_UNCNFM_ODR_QTY_BEFΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_QTY_BEF(String val) ; 

	/**
	 * Ο@w_MODIFY_COUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_MODIFY_COUNT(String val) ; 

	/**
	 * Ο@w_COUNTΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_COUNT(String val) ; 

	/**
	 * Ο@w_EDI_DATA_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_EDI_DATA_TYP(String val) ; 

	/**
	 * Ο@w_BUSINESS_OPR_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_BUSINESS_OPR_DATE(String val) ; 

	/**
	 * Ο@w_LAST_DAYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_LAST_DAY(String val) ; 

	/**
	 * Ο@YEAR_MONTHΜZbg<BR>
	 * @param String val
	 */
	public abstract void setYEAR_MONTH(String val) ; 

	/**
	 * Ο@w_CONCENTRATE_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_CONCENTRATE_DATE(String val) ; 

	/**
	 * Ο@w_SHIP_PLAN_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_PLAN_DATE(String val) ; 

	/**
	 * Ο@w_STNDRD_RCV_DESINATED_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_STNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * Ο@w_DEPOT_PLAN_TYPΜZbg<BR>
	 * @param String val
	 */
	public abstract void setw_DEPOT_PLAN_TYP(String val) ; 

	/**
	 * Ο@MAX_CAL_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setMAX_CAL_DATE(String val) ; 
	
	// σ»ΤRtπYΑ
	/**
	 * Ο@PREPARE_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getPREPARE_QTY() ; 

	/**
	 * Ο@JOB_ODR_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE() ; 

	/**
	 * Ο@ALC_GRP_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getALC_GRP_CD() ; 

	/**
	 * Ο@JOB_ODR_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_CD() ; 


	/**
	 * Ο@PRD_REQ_JOB_ODR_TYP_1ΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_PRD_REQ_JOB_ODR_TYP_1() ;

	/**
	 * Ο@PRD_REQ_JOB_ODR_TYP_2ΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_PRD_REQ_JOB_ODR_TYP_2() ;

	/**
	 * Ο@h_JOB_UPDATE_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_JOB_UPDATE_FLG() ;

	/**
	 * Ο@c_DOODRΜζΎ<BR>
	 * @return String
	 */
	public abstract String getc_DOODR() ;

	/**
	 * Ο@c_INPUTODRCDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getc_INPUTODRCD() ;

	/**
	 * Ο@h_SHIP_PLANT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_SHIP_PLANT_CD() ;

	/**
	 * Ο@JOB_OD_CD_PREFIXΜζΎ<BR>
	 * @return String
	 */
	public abstract String getJOB_OD_CD_PREFIX() ;

	/**
	 * Ο@l_ALCD_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ALCD_QTY() ;

	/**
	 * Ο@h_DOODRΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_DOODR() ;

	/**
	 * Ο@l_JOB_ODR_QTYΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_PREPARE_QTY() ;

	/**
	 * Ο@l_JOB_ODR_DLV_DATEΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_JOB_ODR_DLV_DATE() ;

	/**
	 * Ο@l_ALC_GRP_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_ALC_GRP_CD() ;

	/**
	 * Ο@h_INPUTODRCDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_INPUTODRCD() ;

	/**
	 * Ο@l_JOB_ODR_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getl_JOB_ODR_CD() ;

	/**
	 * Ο@MRP_ODR_TYPΜζΎ<BR>
	 * @return String
	 */
	public abstract String getMRP_ODR_TYP() ;

	/**
	 * Ο@h_ODR_QTY_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_ODR_QTY_FLG() ;

	/**
	 * Ο@h_UPD_DEL_FLGΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_UPD_DEL_FLG() ;

	/**
	 * Ο@h_PLANT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String geth_PLANT_CD() ;

	/**
	 * Ο@T_JOB_ODR_PLANT_CDΜζΎ<BR>
	 * @return String
	 */
	public abstract String getT_JOB_ODR_PLANT_CD() ;

	/**
	 * Ο@CAL_NOΜζΎ<BR>
	 * @return String
	 */
	public abstract String getCAL_NO() ;
	
	
	
	
	/**
	 * Ο@PREPARE_QTYΜZbg<BR>
	 * @param String val
	 */
	public abstract void setPREPARE_QTY(String val) ; 

	/**
	 * Ο@JOB_ODR_DLV_DATEΜZbg<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE(String val) ; 

	/**
	 * Ο@ALC_GRP_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setALC_GRP_CD(String val) ; 

	/**
	 * Ο@JOB_ODR_CDΜZbg<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_CD(String val) ; 

	/**
	 * Ο@PRD_REQ_JOB_ODR_TYP_1ΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_PRD_REQ_JOB_ODR_TYP_1(String val) ; 

	/**
	 * Ο@PRD_REQ_JOB_ODR_TYP_2ΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_PRD_REQ_JOB_ODR_TYP_2(String val) ; 

	/**
	 * Ο@h_JOB_UPDATE_FLGΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_JOB_UPDATE_FLG(String val) ; 

	/**
	 * Ο@c_DOODRΜZbg<BR>
	  * @param String val
	 */
	public abstract void setc_DOODR(String val) ; 

	/**
	 * Ο@c_INPUTODRCDΜZbg<BR>
	  * @param String val
	 */
	public abstract void setc_INPUTODRCD(String val) ; 

	/**
	 * Ο@h_SHIP_PLANT_CDΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_SHIP_PLANT_CD(String val) ; 

	/**
	 * Ο@JOB_OD_CD_PREFIXΜZbg<BR>
	  * @param String val
	 */
	public abstract void setJOB_OD_CD_PREFIX(String val) ; 

	/**
	 * Ο@l_ALCD_QTYΜZbg<BR>
	  * @param String val
	 */
	public abstract void setl_ALCD_QTY(String val) ; 

	/**
	 * Ο@h_DOODRΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_DOODR(String val) ; 

	/**
	 * Ο@l_PREPARE_QTYΜZbg<BR>
	  * @param String val
	 */
	public abstract void setl_PREPARE_QTY(String val) ; 

	/**
	 * Ο@l_JOB_ODR_DLV_DATEΜZbg<BR>
	  * @param String val
	 */
	public abstract void setl_JOB_ODR_DLV_DATE(String val) ; 

	/**
	 * Ο@l_ALC_GRP_CDΜZbg<BR>
	  * @param String val
	 */
	public abstract void setl_ALC_GRP_CD(String val) ; 

	/**
	 * Ο@h_INPUTODRCDΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_INPUTODRCD(String val) ; 

	/**
	 * Ο@l_JOB_ODR_CDΜZbg<BR>
	  * @param String val
	 */
	public abstract void setl_JOB_ODR_CD(String val) ; 

	/**
	 * Ο@MRP_ODR_TYPΜZbg<BR>
	  * @param String val
	 */
	public abstract void setMRP_ODR_TYP(String val) ; 

	/**
	 * Ο@h_ODR_QTY_FLGΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_ODR_QTY_FLG(String val) ; 

	/**
	 * Ο@h_UPD_DEL_FLGΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_UPD_DEL_FLG(String val) ; 

	/**
	 * Ο@h_PLANT_CDΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_PLANT_CD(String val) ; 

	/**
	 * Ο@T_ODR_PLANT_CDΜZbg<BR>
	  * @param String val
	 */
	public abstract void setT_ODR_PLANT_CD(String val) ; 

	/**
	 * Ο@T_ODR_PLANT_CDΜZbg<BR>
	  * @param String val
	 */
	public abstract void setT_JOB_ODR_PLANT_CD(String val) ; 

	/**
	 * Ο@CAL_NOΜZbg<BR>
	  * @param String val
	 */
	public abstract void setCAL_NO(String val) ; 


	/**
	 * Ο@JOB_ODR_DLV_DATE_TIMEΜZbg<BR>
	  * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE_TIME(String val) ; 
	

	/**
	 * Ο@DLV_LOC_CDΜZbg<BR>
	  * @param String val
	 */
	public abstract void setDLV_LOC_CD(String val) ; 

	/**
	 * Ο@SHIP_CTL_TYPΜZbg<BR>
	  * @param String val
	 */
	public abstract void setSHIP_CTL_TYP(String val) ; 
	/**
	 * Ο@h_l_JOB_ODR_DLV_DATEΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_l_JOB_ODR_DLV_DATE(String val) ; 
	/**
	 * Ο@h_l_JOB_ODR_DLV_TIMEΜZbg<BR>
	  * @param String val
	 */
	public abstract void seth_l_JOB_ODR_DLV_TIME(String val) ; 
	
	/**
	 * Ο@JOB_ODR_DLV_TIMEΜZbg<BR>
	  * @param String val
	 */
	public abstract void setJOB_ODR_DLV_TIME(String val) ; 
} 	
