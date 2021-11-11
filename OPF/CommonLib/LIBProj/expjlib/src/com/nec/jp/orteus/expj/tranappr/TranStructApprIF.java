/*	
* $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/tranappr/TranStructApprIF.java,v $	
*	
 * Copyright (c) 2003-2004 NEC Corporation.	
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.	
 */	
package com.nec.jp.orteus.expj.tranappr;	
	
/**	
 * <pre>	
 * トラン承認インタフェース	
 * </pre>	
 * @author $Author: pang-zw $	
 * @version $Revision: 1.2 $ $Date: 2008/12/26 05:21:50 $	
 *	
 **/	
public abstract interface TranStructApprIF {	
	
	
	//KQ1070
	
	/**
	 * 変数　PURPOSE_UNIT_PRICE_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP_name() ; 
	
	/**
	 * 変数　PURPOSE_UNIT_PRICE_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP_val() ; 
	
	/**
	 * 変数　AMOUNT_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP_name() ; 
	
	/**
	 * 変数　AMOUNT_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP_val() ; 
	
	/**
	 * 変数　EDI_DATA_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP_name() ; 
	
	/**
	 * 変数　EDI_DATA_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP_val() ; 
	
	/**
	 * 変数　DEPOT_PLAN_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP_name() ; 
	
	/**
	 * 変数　DEPOT_PLAN_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP_val() ; 
	
	/**
	 * 変数　ENTRY_TYP_2_nameの取得<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2_name() ; 
	
	/**
	 * 変数　ENTRY_TYP_2_valの取得<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2_val() ; 
	
	/**
	 * 変数　COMPANY_CD_hiddenの取得<BR>
	 * @return String
	 */
	public abstract String getCOMPANY_CD_hidden() ; 
	
	/**
	 * 変数　BTN_DesinatedDlvDateの取得<BR>
	 * @return String
	 */
	public abstract String getBTN_DesinatedDlvDate() ; 
	
	/**
	 * 変数　BUSINESSOPRDATE_hiddenの取得<BR>
	 * @return String
	 */
	public abstract String getBUSINESSOPRDATE_hidden() ; 
	
	/**
	 * 変数　UNCNFM_ODR_CTL_NO_BKの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_CTL_NO_BK() ; 
	
	/**
	 * 変数　UNCNFM_PLAN_TAKE_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP_name() ; 
	
	/**
	 * 変数　UNCNFM_PLAN_TAKE_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP_val() ; 
	
	/**
	 * 変数　h_APR_JA_UNCNFM_ODRの取得<BR>
	 * @return String
	 */
	public abstract String geth_APR_JA_UNCNFM_ODR() ; 
	
	/**
	 * 変数　APPR_REMARKSの取得<BR>
	 * @return String
	 */
	public abstract String getAPPR_REMARKS() ; 
	
	/**
	 * 変数　h_APPR_IDの取得<BR>
	 * @return String
	 */
	public abstract String geth_APPR_ID() ; 
	
	/**
	 * 変数　h_SCREENMOVE_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_SCREENMOVE_TYP() ; 
	
	/**
	 * 変数　UNCNFM_ODR_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_CTL_NO() ; 
	
	/**
	 * 変数　IN_COMPANY_CDの取得<BR>
	 * @return String
	 */
	public abstract String getIN_COMPANY_CD() ; 
	
	/**
	 * 変数　CUST_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_CD() ; 
	
	/**
	 * 変数　CUST_ITEM_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_ITEM_CD() ; 
	
	/**
	 * 変数　CUST_ITEM_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_ITEM_NAME() ; 
	
	/**
	 * 変数　CUST_CHRG_ORG_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_ORG_CD() ; 
	
	/**
	 * 変数　CUST_CHRG_PSN_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_PSN_CD() ; 
	
	/**
	 * 変数　ACPT_ORG_CD_hiddenの取得<BR>
	 * @return String
	 */
	public abstract String getACPT_ORG_CD_hidden() ; 
	
	/**
	 * 変数　ACPT_PSN_CD_hiddenの取得<BR>
	 * @return String
	 */
	public abstract String getACPT_PSN_CD_hidden() ; 
	
	/**
	 * 変数　ITEM_CDの取得<BR>
	 * @return String
	 */
	public abstract String getITEM_CD() ; 
	
	/**
	 * 変数　CUST_UNCNFM_ODR_NOの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_UNCNFM_ODR_NO() ; 
	
	/**
	 * 変数　FINAL_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getFINAL_DLV_LOC_CD() ; 

	/**
	 * 変数　CUST_DESINATED_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * 変数　CONCENTRATE_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DLV_LOC_CD() ; 

	/**
	 * 変数　DESINATED_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE() ; 

	/**
	 * 変数　CONCENTRATE_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DATE() ; 

	/**
	 * 変数　SHIP_PLAN_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLAN_DATE() ; 

	/**
	 * 変数　STNDRD_RCV_DESINATED_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getSTNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * 変数　PURPOSE_UNIT_PRICE_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_UNIT_PRICE_TYP() ; 

	/**
	 * 変数　UNCNFM_ODR_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_QTY() ; 

	/**
	 * 変数　AMOUNT_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getAMOUNT_TYP() ; 

	/**
	 * 変数　DEPOT_PLAN_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getDEPOT_PLAN_TYP() ; 

	/**
	 * 変数　DLV_LOC_OPTION_CHANGE_VALUEの取得<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * 変数　ITEM_CD_OPTION_CHANGE_VALUEの取得<BR>
	 * @return String
	 */
	public abstract String getITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * 変数　ENTRY_TYP_2の取得<BR>
	 * @return String
	 */
	public abstract String getENTRY_TYP_2() ; 

	/**
	 * 変数　EDI_DATA_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getEDI_DATA_TYP() ; 

	/**
	 * 変数　EDI_DISCRIMINATION_CDの取得<BR>
	 * @return String
	 */
	public abstract String getEDI_DISCRIMINATION_CD() ; 

	/**
	 * 変数　ARRANGEMENTS_CHARACTERISTICの取得<BR>
	 * @return String
	 */
	public abstract String getARRANGEMENTS_CHARACTERISTIC() ; 

	/**
	 * 変数　UNCNFM_PLAN_TAKE_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_PLAN_TAKE_TYP() ; 

	/**
	 * 変数　UNCNFM_REQUIRED_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_DATE() ; 

	/**
	 * 変数　UNCNFM_REQUIRED_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_QTY() ; 

	/**
	 * 変数　ORG_UNCNFM_REQUIRED_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * 変数　LAST_UNCNFM_REQUIRED_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getLAST_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * 変数　WORK_DAY_DIVISION_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getWORK_DAY_DIVISION_FLG() ; 

	/**
	 * 変数　MANUAL_UPDATE_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getMANUAL_UPDATE_FLG() ; 

	/**
	 * 変数　REMARKSの取得<BR>
	 * @return String
	 */
	public abstract String getREMARKS() ; 

	/**
	 * 変数　UNCNFM_CUST_ODR_CREATE_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_CUST_ODR_CREATE_DATE() ; 

	/**
	 * 変数　ORG_UNCNFM_ODR_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_ODR_CTL_NO() ; 

	/**
	 * 変数　UNCNFM_ODR_IF_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_IF_CTL_NO() ; 

	/**
	 * 変数　DEL_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getDEL_FLG() ; 

	/**
	 * 変数　IN_MODIFY_COUNTの取得<BR>
	 * @return String
	 */
	public abstract String getIN_MODIFY_COUNT() ; 

	/**
	 * 変数　CUST_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_NAME() ; 

	/**
	 * 変数　CUST_DESINATED_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * 変数　FINAL_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getFINAL_DLV_LOC_NAME() ; 

	/**
	 * 変数　CONCENTRATE_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCONCENTRATE_DLV_LOC_NAME() ; 

	/**
	 * 変数　ITEM_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getITEM_NAME() ; 

	/**
	 * 変数　UNCNFM_ODR_QTY_STOCK_UNITの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_ODR_QTY_STOCK_UNIT() ; 

	/**
	 * 変数　LAST_UNCNFM_REQUIRED_QTY_STOCK_UNITの取得<BR>
	 * @return String
	 */
	public abstract String getLAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * 変数　UNCNFM_REQUIRED_QTY_STOCK_UNITの取得<BR>
	 * @return String
	 */
	public abstract String getUNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * 変数　ORG_UNCNFM_REQUIRED_QTY_STOCK_UNITの取得<BR>
	 * @return String
	 */
	public abstract String getORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT() ; 

	/**
	 * 変数　CUST_CHRG_ORG_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_ORG_NAME() ; 

	/**
	 * 変数　CUST_CHRG_PSN_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_CHRG_PSN_NAME() ; 

	/**
	 * 変数　IN_BUSINESS_OPR_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getIN_BUSINESS_OPR_DATE() ; 

	/**
	 * 変数　APPR_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getAPPR_DATE() ; 

	/**
	 * 変数　APPR_BYの取得<BR>
	 * @return String
	 */
	public abstract String getAPPR_BY() ; 

	/**
	 * 変数　MOTO_UNCNFM_REQUIRED_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getMOTO_UNCNFM_REQUIRED_QTY() ; 

	/**
	 * 変数　chkCUST_DESINATED_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getchkCUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * 変数　UNIT_QTY_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getUNIT_QTY_TYP() ; 

	/**
	 * 変数　dummyの取得<BR>
	 * @return String
	 */
	public abstract String getdummy() ; 

	/**
	 * 変数　APPR_IDの取得<BR>
	 * @return String
	 */
	public abstract String getAPPR_ID() ; 

	/**
	 * 変数　PURPOSE_UNIT_PRICE_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP_name(String val) ; 

	/**
	 * 変数　PURPOSE_UNIT_PRICE_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP_val(String val) ; 

	/**
	 * 変数　AMOUNT_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP_name(String val) ; 

	/**
	 * 変数　AMOUNT_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP_val(String val) ; 

	/**
	 * 変数　EDI_DATA_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP_name(String val) ; 

	/**
	 * 変数　EDI_DATA_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP_val(String val) ; 

	/**
	 * 変数　DEPOT_PLAN_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP_name(String val) ; 

	/**
	 * 変数　DEPOT_PLAN_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP_val(String val) ; 

	/**
	 * 変数　ENTRY_TYP_2_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2_name(String val) ; 

	/**
	 * 変数　ENTRY_TYP_2_valのセット<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2_val(String val) ; 

	/**
	 * 変数　COMPANY_CD_hiddenのセット<BR>
	 * @param String val
	 */
	public abstract void setCOMPANY_CD_hidden(String val) ; 

	/**
	 * 変数　BTN_DesinatedDlvDateのセット<BR>
	 * @param String val
	 */
	public abstract void setBTN_DesinatedDlvDate(String val) ; 

	/**
	 * 変数　BUSINESSOPRDATE_hiddenのセット<BR>
	 * @param String val
	 */
	public abstract void setBUSINESSOPRDATE_hidden(String val) ; 

	/**
	 * 変数　UNCNFM_ODR_CTL_NO_BKのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_CTL_NO_BK(String val) ; 

	/**
	 * 変数　UNCNFM_PLAN_TAKE_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP_name(String val) ; 

	/**
	 * 変数　UNCNFM_PLAN_TAKE_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP_val(String val) ; 

	/**
	 * 変数　h_APR_JA_UNCNFM_ODRのセット<BR>
	 * @param String val
	 */
	public abstract void seth_APR_JA_UNCNFM_ODR(String val) ; 

	/**
	 * 変数　APPR_REMARKSのセット<BR>
	 * @param String val
	 */
	public abstract void setAPPR_REMARKS(String val) ; 

	/**
	 * 変数　h_APPR_IDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_APPR_ID(String val) ; 

	/**
	 * 変数　h_SCREENMOVE_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_SCREENMOVE_TYP(String val) ; 

	/**
	 * 変数　UNCNFM_ODR_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * 変数　IN_COMPANY_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_COMPANY_CD(String val) ; 

	/**
	 * 変数　CUST_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_CD(String val) ; 

	/**
	 * 変数　CUST_ITEM_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_ITEM_CD(String val) ; 

	/**
	 * 変数　CUST_ITEM_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_ITEM_NAME(String val) ; 

	/**
	 * 変数　CUST_CHRG_ORG_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_ORG_CD(String val) ; 

	/**
	 * 変数　CUST_CHRG_PSN_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_PSN_CD(String val) ; 

	/**
	 * 変数　ACPT_ORG_CD_hiddenのセット<BR>
	 * @param String val
	 */
	public abstract void setACPT_ORG_CD_hidden(String val) ; 

	/**
	 * 変数　ACPT_PSN_CD_hiddenのセット<BR>
	 * @param String val
	 */
	public abstract void setACPT_PSN_CD_hidden(String val) ; 

	/**
	 * 変数　ITEM_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setITEM_CD(String val) ; 

	/**
	 * 変数　CUST_UNCNFM_ODR_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_UNCNFM_ODR_NO(String val) ; 

	/**
	 * 変数　FINAL_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setFINAL_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　CUST_DESINATED_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　CONCENTRATE_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　DESINATED_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE(String val) ; 

	/**
	 * 変数　CONCENTRATE_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DATE(String val) ; 

	/**
	 * 変数　SHIP_PLAN_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLAN_DATE(String val) ; 

	/**
	 * 変数　STNDRD_RCV_DESINATED_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setSTNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * 変数　PURPOSE_UNIT_PRICE_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_UNIT_PRICE_TYP(String val) ; 

	/**
	 * 変数　UNCNFM_ODR_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_QTY(String val) ; 

	/**
	 * 変数　AMOUNT_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setAMOUNT_TYP(String val) ; 

	/**
	 * 変数　DEPOT_PLAN_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setDEPOT_PLAN_TYP(String val) ; 

	/**
	 * 変数　DLV_LOC_OPTION_CHANGE_VALUEのセット<BR>
	 * @param String val
	 */
	public abstract void setDLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * 変数　ITEM_CD_OPTION_CHANGE_VALUEのセット<BR>
	 * @param String val
	 */
	public abstract void setITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * 変数　ENTRY_TYP_2のセット<BR>
	 * @param String val
	 */
	public abstract void setENTRY_TYP_2(String val) ; 

	/**
	 * 変数　EDI_DATA_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setEDI_DATA_TYP(String val) ; 

	/**
	 * 変数　EDI_DISCRIMINATION_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setEDI_DISCRIMINATION_CD(String val) ; 

	/**
	 * 変数　ARRANGEMENTS_CHARACTERISTICのセット<BR>
	 * @param String val
	 */
	public abstract void setARRANGEMENTS_CHARACTERISTIC(String val) ; 

	/**
	 * 変数　UNCNFM_PLAN_TAKE_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_PLAN_TAKE_TYP(String val) ; 

	/**
	 * 変数　UNCNFM_REQUIRED_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_DATE(String val) ; 

	/**
	 * 変数　UNCNFM_REQUIRED_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * 変数　ORG_UNCNFM_REQUIRED_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * 変数　LAST_UNCNFM_REQUIRED_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setLAST_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * 変数　WORK_DAY_DIVISION_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setWORK_DAY_DIVISION_FLG(String val) ; 

	/**
	 * 変数　MANUAL_UPDATE_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setMANUAL_UPDATE_FLG(String val) ; 

	/**
	 * 変数　REMARKSのセット<BR>
	 * @param String val
	 */
	public abstract void setREMARKS(String val) ; 

	/**
	 * 変数　UNCNFM_CUST_ODR_CREATE_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_CUST_ODR_CREATE_DATE(String val) ; 

	/**
	 * 変数　ORG_UNCNFM_ODR_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * 変数　UNCNFM_ODR_IF_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_IF_CTL_NO(String val) ; 

	/**
	 * 変数　DEL_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setDEL_FLG(String val) ; 

	/**
	 * 変数　IN_MODIFY_COUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_MODIFY_COUNT(String val) ; 

	/**
	 * 変数　CUST_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_NAME(String val) ; 

	/**
	 * 変数　CUST_DESINATED_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　FINAL_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setFINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　CONCENTRATE_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCONCENTRATE_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　ITEM_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setITEM_NAME(String val) ; 

	/**
	 * 変数　UNCNFM_ODR_QTY_STOCK_UNITのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_ODR_QTY_STOCK_UNIT(String val) ; 

	/**
	 * 変数　LAST_UNCNFM_REQUIRED_QTY_STOCK_UNITのセット<BR>
	 * @param String val
	 */
	public abstract void setLAST_UNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * 変数　UNCNFM_REQUIRED_QTY_STOCK_UNITのセット<BR>
	 * @param String val
	 */
	public abstract void setUNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * 変数　ORG_UNCNFM_REQUIRED_QTY_STOCK_UNITのセット<BR>
	 * @param String val
	 */
	public abstract void setORG_UNCNFM_REQUIRED_QTY_STOCK_UNIT(String val) ; 

	/**
	 * 変数　CUST_CHRG_ORG_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_ORG_NAME(String val) ; 

	/**
	 * 変数　CUST_CHRG_PSN_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_CHRG_PSN_NAME(String val) ; 

	/**
	 * 変数　IN_BUSINESS_OPR_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_BUSINESS_OPR_DATE(String val) ; 

	/**
	 * 変数　APPR_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setAPPR_DATE(String val) ; 

	/**
	 * 変数　APPR_BYのセット<BR>
	 * @param String val
	 */
	public abstract void setAPPR_BY(String val) ; 

	/**
	 * 変数　MOTO_UNCNFM_REQUIRED_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setMOTO_UNCNFM_REQUIRED_QTY(String val) ; 

	/**
	 * 変数　chkCUST_DESINATED_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setchkCUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　UNIT_QTY_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setUNIT_QTY_TYP(String val) ; 

	/**
	 * 変数　dummyのセット<BR>
	 * @param String val
	 */
	public abstract void setdummy(String val) ; 

	/**
	 * 変数　APPR_IDのセット<BR>
	 * @param String val
	 */
	public abstract void setAPPR_ID(String val) ; 

	//KQ1080

	/**
	 * 変数　PARTS_SUP_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP_name() ; 

	/**
	 * 変数　PARTS_SUP_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP_val() ; 

	/**
	 * 変数　EST_CONF_SET_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getEST_CONF_SET_FLG() ; 

	/**
	 * 変数　BTN_SALES_UNIT_PRICEの取得<BR>
	 * @return String
	 */
	public abstract String getBTN_SALES_UNIT_PRICE() ; 

	/**
	 * 変数　PURPOSE_KIND_nameの取得<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND_name() ; 

	/**
	 * 変数　PURPOSE_KIND_valの取得<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND_val() ; 

	/**
	 * 変数　ODR_CTL_NO_BKの取得<BR>
	 * @return String
	 */
	public abstract String getODR_CTL_NO_BK() ; 

	/**
	 * 変数　EXCH_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP_name() ; 

	/**
	 * 変数　EXCH_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP_val() ; 

	/**
	 * 変数　TAX_APPLY_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP_name() ; 

	/**
	 * 変数　TAX_APPLY_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP_val() ; 

	/**
	 * 変数　TAX_CALC_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP_name() ; 

	/**
	 * 変数　TAX_CALC_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP_val() ; 

	/**
	 * 変数　TRANSPORT_TYP_nameの取得<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP_name() ; 

	/**
	 * 変数　TRANSPORT_TYP_valの取得<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP_val() ; 

	/**
	 * 変数　h_APR_JA_ODRの取得<BR>
	 * @return String
	 */
	public abstract String geth_APR_JA_ODR() ; 

	/**
	 * 変数　ODR_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getODR_CTL_NO() ; 

	/**
	 * 変数　CUST_ODR_NOの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_ODR_NO() ; 

	/**
	 * 変数　DESINATED_DLV_DATE_TIMEの取得<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE_TIME() ; 

	/**
	 * 変数　DESINATED_DLV_DATE_ALLの取得<BR>
	 * @return String
	 */
	public abstract String getDESINATED_DLV_DATE_ALL() ; 

	/**
	 * 変数　ODR_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getODR_QTY() ; 

	/**
	 * 変数　ODR_AMOUNTの取得<BR>
	 * @return String
	 */
	public abstract String getODR_AMOUNT() ; 

	/**
	 * 変数　UNIT_PRICEの取得<BR>
	 * @return String
	 */
	public abstract String getUNIT_PRICE() ; 

	/**
	 * 変数　CUR_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCUR_CD() ; 

	/**
	 * 変数　EXCH_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getEXCH_TYP() ; 

	/**
	 * 変数　TAX_APPLY_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_APPLY_TYP() ; 

	/**
	 * 変数　TAX_CDの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_CD() ; 

	/**
	 * 変数　TAX_CALC_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_CALC_TYP() ; 

	/**
	 * 変数　PART_DLV_COUNTの取得<BR>
	 * @return String
	 */
	public abstract String getPART_DLV_COUNT() ; 

	/**
	 * 変数　SHIP_COUNTの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_COUNT() ; 

	/**
	 * 変数　LAST_ODR_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getLAST_ODR_QTY() ; 

	/**
	 * 変数　ODR_AMOUNT_EXCH_RATESの取得<BR>
	 * @return String
	 */
	public abstract String getODR_AMOUNT_EXCH_RATES() ; 

	/**
	 * 変数　TOTAL_SHIP_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getTOTAL_SHIP_QTY() ; 

	/**
	 * 変数　SHIP_AMOUNTの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_AMOUNT() ; 

	/**
	 * 変数　SHIP_AMOUNT_EXCH_RATESの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_AMOUNT_EXCH_RATES() ; 

	/**
	 * 変数　RETURN_PRICEの取得<BR>
	 * @return String
	 */
	public abstract String getRETURN_PRICE() ; 

	/**
	 * 変数　RETURN_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getRETURN_QTY() ; 

	/**
	 * 変数　RETURN_AMOUNTの取得<BR>
	 * @return String
	 */
	public abstract String getRETURN_AMOUNT() ; 

	/**
	 * 変数　RETURN_AMOUNT_EXCH_RATESの取得<BR>
	 * @return String
	 */
	public abstract String getRETURN_AMOUNT_EXCH_RATES() ; 

	/**
	 * 変数　ODR_CMPLT_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getODR_CMPLT_FLG() ; 

	/**
	 * 変数　ODR_CMPLT_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getODR_CMPLT_DATE() ; 

	/**
	 * 変数　TRANSPORT_CDの取得<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_CD() ; 

	/**
	 * 変数　TRANSPORT_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getTRANSPORT_TYP() ; 

	/**
	 * 変数　SHIP_WH_CDの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_WH_CD() ; 

	/**
	 * 変数　IN_HOUSE_SHIP_PLAN_TRANS_NOの取得<BR>
	 * @return String
	 */
	public abstract String getIN_HOUSE_SHIP_PLAN_TRANS_NO() ; 

	/**
	 * 変数　CUST_DLV_PLAN_TRANS_NOの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_DLV_PLAN_TRANS_NO() ; 

	/**
	 * 変数　SEBANGOの取得<BR>
	 * @return String
	 */
	public abstract String getSEBANGO() ; 

	/**
	 * 変数　KANBAN_PAPER_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getKANBAN_PAPER_QTY() ; 

	/**
	 * 変数　SEQUENCE_IDの取得<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_ID() ; 

	/**
	 * 変数　SEQUENCE_MARKの取得<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_MARK() ; 

	/**
	 * 変数　SEQUENCE_LINEの取得<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_LINE() ; 

	/**
	 * 変数　SEQUENCE_CTR_NO_WEIGHTの取得<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_CTR_NO_WEIGHT() ; 

	/**
	 * 変数　SEQUENCE_CTR_NOの取得<BR>
	 * @return String
	 */
	public abstract String getSEQUENCE_CTR_NO() ; 

	/**
	 * 変数　PURPOSE_KINDの取得<BR>
	 * @return String
	 */
	public abstract String getPURPOSE_KIND() ; 

	/**
	 * 変数　KANBAN_CUST_ODR_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getKANBAN_CUST_ODR_FLG() ; 

	/**
	 * 変数　CUS_DLV_KEY_CDの取得<BR>
	 * @return String
	 */
	public abstract String getCUS_DLV_KEY_CD() ; 

	/**
	 * 変数　FIRST_LOT_CTL_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getFIRST_LOT_CTL_FLG() ; 

	/**
	 * 変数　IMP_SAFE_PARTS_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getIMP_SAFE_PARTS_FLG() ; 

	/**
	 * 変数　PARTS_SUP_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getPARTS_SUP_TYP() ; 

	/**
	 * 変数　SUP_INFOの取得<BR>
	 * @return String
	 */
	public abstract String getSUP_INFO() ; 

	/**
	 * 変数　INSP_INFOの取得<BR>
	 * @return String
	 */
	public abstract String getINSP_INFO() ; 

	/**
	 * 変数　CUST_DLV_INFOの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_DLV_INFO() ; 

	/**
	 * 変数　TRIAL_INFOの取得<BR>
	 * @return String
	 */
	public abstract String getTRIAL_INFO() ; 

	/**
	 * 変数　DESIGN_CHANGE_INFOの取得<BR>
	 * @return String
	 */
	public abstract String getDESIGN_CHANGE_INFO() ; 

	/**
	 * 変数　CUST_ODR_SUB_INFOの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_ODR_SUB_INFO() ; 

	/**
	 * 変数　MANU_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getMANU_LOC_CD() ; 

	/**
	 * 変数　SHIP_REMARKSの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_REMARKS() ; 

	/**
	 * 変数　SALES_REMARKSの取得<BR>
	 * @return String
	 */
	public abstract String getSALES_REMARKS() ; 

	/**
	 * 変数　ODR_IF_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getODR_IF_CTL_NO() ; 

	/**
	 * 変数　SHIP_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_FLG() ; 

	/**
	 * 変数　STOCK_UNITの取得<BR>
	 * @return String
	 */
	public abstract String getSTOCK_UNIT() ; 

	/**
	 * 変数　CUR_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCUR_NAME() ; 

	/**
	 * 変数　TAX_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getTAX_NAME() ; 

	/**
	 * 変数　IN_EST_CONF_SET_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getIN_EST_CONF_SET_FLG() ; 

	/**
	 * 変数　IN_DETAIL_ROUND_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getIN_DETAIL_ROUND_TYP() ; 

	/**
	 * 変数　HISTORY_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getHISTORY_CTL_NO() ; 

	/**
	 * 変数　NEW_OLD_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getNEW_OLD_FLG() ; 

	/**
	 * 変数　TRAN_TYPEの取得<BR>
	 * @return String
	 */
	public abstract String getTRAN_TYPE() ; 

	/**
	 * 変数　IN_ODR_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getIN_ODR_CTL_NO() ; 

	/**
	 * 変数　chkCUST_DESINATED_DLV_LOCの取得<BR>
	 * @return String
	 */
	public abstract String getchkCUST_DESINATED_DLV_LOC() ; 

	/**
	 * 変数　JOB_OD_CDの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_OD_CD() ; 

	/**
	 * 変数　SHIP_PLANT_CDの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLANT_CD() ; 

	/**
	 * 変数　JOB_ODR_DLV_DATE_ALLの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE_ALL() ; 

	/**
	 * 変数　JOB_ODR_SET_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_SET_FLG() ; 

	/**
	 * 変数　ALCD_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getALCD_QTY() ; 

	/**
	 * 変数　T_ODR_PLANT_CDの取得<BR>
	 * @return String
	 */
	public abstract String getT_ODR_PLANT_CD() ; 
	
	/**
	 * 変数　PARTS_SUP_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP_name(String val) ; 

	/**
	 * 変数　PARTS_SUP_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP_val(String val) ; 

	/**
	 * 変数　EST_CONF_SET_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setEST_CONF_SET_FLG(String val) ; 

	/**
	 * 変数　BTN_SALES_UNIT_PRICEのセット<BR>
	 * @param String val
	 */
	public abstract void setBTN_SALES_UNIT_PRICE(String val) ; 

	/**
	 * 変数　PURPOSE_KIND_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND_name(String val) ; 

	/**
	 * 変数　PURPOSE_KIND_valのセット<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND_val(String val) ; 

	/**
	 * 変数　ODR_CTL_NO_BKのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_CTL_NO_BK(String val) ; 

	/**
	 * 変数　EXCH_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP_name(String val) ; 

	/**
	 * 変数　EXCH_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP_val(String val) ; 

	/**
	 * 変数　TAX_APPLY_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP_name(String val) ; 

	/**
	 * 変数　TAX_APPLY_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP_val(String val) ; 

	/**
	 * 変数　TAX_CALC_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP_name(String val) ; 

	/**
	 * 変数　TAX_CALC_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP_val(String val) ; 

	/**
	 * 変数　TRANSPORT_TYP_nameのセット<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP_name(String val) ; 

	/**
	 * 変数　TRANSPORT_TYP_valのセット<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP_val(String val) ; 

	/**
	 * 変数　h_APR_JA_ODRのセット<BR>
	 * @param String val
	 */
	public abstract void seth_APR_JA_ODR(String val) ; 

	/**
	 * 変数　ODR_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_CTL_NO(String val) ; 

	/**
	 * 変数　CUST_ODR_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_ODR_NO(String val) ; 

	/**
	 * 変数　DESINATED_DLV_DATE_TIMEのセット<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE_TIME(String val) ; 

	/**
	 * 変数　DESINATED_DLV_DATE_ALLのセット<BR>
	 * @param String val
	 */
	public abstract void setDESINATED_DLV_DATE_ALL(String val) ; 

	/**
	 * 変数　ODR_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_QTY(String val) ; 

	/**
	 * 変数　ODR_AMOUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_AMOUNT(String val) ; 

	/**
	 * 変数　UNIT_PRICEのセット<BR>
	 * @param String val
	 */
	public abstract void setUNIT_PRICE(String val) ; 

	/**
	 * 変数　CUR_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCUR_CD(String val) ; 

	/**
	 * 変数　EXCH_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setEXCH_TYP(String val) ; 

	/**
	 * 変数　TAX_APPLY_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_APPLY_TYP(String val) ; 

	/**
	 * 変数　TAX_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_CD(String val) ; 

	/**
	 * 変数　TAX_CALC_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_CALC_TYP(String val) ; 

	/**
	 * 変数　PART_DLV_COUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setPART_DLV_COUNT(String val) ; 

	/**
	 * 変数　SHIP_COUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_COUNT(String val) ; 

	/**
	 * 変数　LAST_ODR_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setLAST_ODR_QTY(String val) ; 

	/**
	 * 変数　ODR_AMOUNT_EXCH_RATESのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * 変数　TOTAL_SHIP_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setTOTAL_SHIP_QTY(String val) ; 

	/**
	 * 変数　SHIP_AMOUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_AMOUNT(String val) ; 

	/**
	 * 変数　SHIP_AMOUNT_EXCH_RATESのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * 変数　RETURN_PRICEのセット<BR>
	 * @param String val
	 */
	public abstract void setRETURN_PRICE(String val) ; 

	/**
	 * 変数　RETURN_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setRETURN_QTY(String val) ; 

	/**
	 * 変数　RETURN_AMOUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setRETURN_AMOUNT(String val) ; 

	/**
	 * 変数　RETURN_AMOUNT_EXCH_RATESのセット<BR>
	 * @param String val
	 */
	public abstract void setRETURN_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * 変数　ODR_CMPLT_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_CMPLT_FLG(String val) ; 

	/**
	 * 変数　ODR_CMPLT_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_CMPLT_DATE(String val) ; 

	/**
	 * 変数　TRANSPORT_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_CD(String val) ; 

	/**
	 * 変数　TRANSPORT_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setTRANSPORT_TYP(String val) ; 

	/**
	 * 変数　SHIP_WH_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_WH_CD(String val) ; 

	/**
	 * 変数　IN_HOUSE_SHIP_PLAN_TRANS_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_HOUSE_SHIP_PLAN_TRANS_NO(String val) ; 

	/**
	 * 変数　CUST_DLV_PLAN_TRANS_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_DLV_PLAN_TRANS_NO(String val) ; 

	/**
	 * 変数　SEBANGOのセット<BR>
	 * @param String val
	 */
	public abstract void setSEBANGO(String val) ; 

	/**
	 * 変数　KANBAN_PAPER_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setKANBAN_PAPER_QTY(String val) ; 

	/**
	 * 変数　SEQUENCE_IDのセット<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_ID(String val) ; 

	/**
	 * 変数　SEQUENCE_MARKのセット<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_MARK(String val) ; 

	/**
	 * 変数　SEQUENCE_LINEのセット<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_LINE(String val) ; 

	/**
	 * 変数　SEQUENCE_CTR_NO_WEIGHTのセット<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_CTR_NO_WEIGHT(String val) ; 

	/**
	 * 変数　SEQUENCE_CTR_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setSEQUENCE_CTR_NO(String val) ; 

	/**
	 * 変数　PURPOSE_KINDのセット<BR>
	 * @param String val
	 */
	public abstract void setPURPOSE_KIND(String val) ; 

	/**
	 * 変数　KANBAN_CUST_ODR_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setKANBAN_CUST_ODR_FLG(String val) ; 

	/**
	 * 変数　CUS_DLV_KEY_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setCUS_DLV_KEY_CD(String val) ; 

	/**
	 * 変数　FIRST_LOT_CTL_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setFIRST_LOT_CTL_FLG(String val) ; 

	/**
	 * 変数　IMP_SAFE_PARTS_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setIMP_SAFE_PARTS_FLG(String val) ; 

	/**
	 * 変数　PARTS_SUP_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setPARTS_SUP_TYP(String val) ; 

	/**
	 * 変数　SUP_INFOのセット<BR>
	 * @param String val
	 */
	public abstract void setSUP_INFO(String val) ; 

	/**
	 * 変数　INSP_INFOのセット<BR>
	 * @param String val
	 */
	public abstract void setINSP_INFO(String val) ; 

	/**
	 * 変数　CUST_DLV_INFOのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_DLV_INFO(String val) ; 

	/**
	 * 変数　TRIAL_INFOのセット<BR>
	 * @param String val
	 */
	public abstract void setTRIAL_INFO(String val) ; 

	/**
	 * 変数　DESIGN_CHANGE_INFOのセット<BR>
	 * @param String val
	 */
	public abstract void setDESIGN_CHANGE_INFO(String val) ; 

	/**
	 * 変数　CUST_ODR_SUB_INFOのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_ODR_SUB_INFO(String val) ; 

	/**
	 * 変数　MANU_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setMANU_LOC_CD(String val) ; 

	/**
	 * 変数　SHIP_REMARKSのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_REMARKS(String val) ; 

	/**
	 * 変数　SALES_REMARKSのセット<BR>
	 * @param String val
	 */
	public abstract void setSALES_REMARKS(String val) ; 

	/**
	 * 変数　ODR_IF_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_IF_CTL_NO(String val) ; 

	/**
	 * 変数　SHIP_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_FLG(String val) ; 

	/**
	 * 変数　STOCK_UNITのセット<BR>
	 * @param String val
	 */
	public abstract void setSTOCK_UNIT(String val) ; 

	/**
	 * 変数　CUR_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCUR_NAME(String val) ; 

	/**
	 * 変数　TAX_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setTAX_NAME(String val) ; 

	/**
	 * 変数　IN_EST_CONF_SET_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_EST_CONF_SET_FLG(String val) ; 

	/**
	 * 変数　IN_DETAIL_ROUND_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_DETAIL_ROUND_TYP(String val) ; 

	/**
	 * 変数　HISTORY_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setHISTORY_CTL_NO(String val) ; 

	/**
	 * 変数　NEW_OLD_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setNEW_OLD_FLG(String val) ; 

	/**
	 * 変数　TRAN_TYPEのセット<BR>
	 * @param String val
	 */
	public abstract void setTRAN_TYPE(String val) ; 

	/**
	 * 変数　IN_ODR_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_ODR_CTL_NO(String val) ; 

	/**
	 * 変数　chkCUST_DESINATED_DLV_LOCのセット<BR>
	 * @param String val
	 */
	public abstract void setchkCUST_DESINATED_DLV_LOC(String val) ; 

	/**
	 * 変数　JOB_OD_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setJOB_OD_CD(String val) ; 

	/**
	 * 変数　SHIP_PLANT_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLANT_CD(String val) ; 

	/**
	 * 変数　JOB_ODR_DLV_DATE_ALLのセット<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE_ALL(String val) ; 

	/**
	 * 変数　JOB_ODR_SET_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_SET_FLG(String val) ; 

	/**
	 * 変数　ALCD_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setALCD_QTY(String val) ; 
	
	
	//KQ1090

	/**
	 * 変数　ODR_QTY_AutoCalcの取得<BR>
	 * @return String
	 */
	public abstract String getODR_QTY_AutoCalc() ; 

	/**
	 * 変数　SHIP_PLAN_DATE_AutoCalcの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_PLAN_DATE_AutoCalc() ; 

	/**
	 * 変数　IN_PKG_UNIT_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getIN_PKG_UNIT_QTY() ; 

	/**
	 * 変数　ODR_QTY_AutoCalcのセット<BR>
	 * @param String val
	 */
	public abstract void setODR_QTY_AutoCalc(String val) ; 

	/**
	 * 変数　SHIP_PLAN_DATE_AutoCalcのセット<BR>
	 * @param String val
	 */
	public abstract void setSHIP_PLAN_DATE_AutoCalc(String val) ; 

	/**
	 * 変数　IN_PKG_UNIT_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setIN_PKG_UNIT_QTY(String val) ; 

	//KQ1130

	/**
	 * 変数　h_NOの取得<BR>
	 * @return String
	 */
	public abstract String geth_NO() ; 

	/**
	 * 変数　h_ENTRY_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_ENTRY_TYP() ; 

	/**
	 * 変数　c_CUST_ODR_NO_NUMBERINGの取得<BR>
	 * @return String
	 */
	public abstract String getc_CUST_ODR_NO_NUMBERING() ; 

	/**
	 * 変数　h_SHIP_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_SHIP_FLG() ; 

	/**
	 * 変数　h_UNIT_COST_READ_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_UNIT_COST_READ_FLG() ; 

	/**
	 * 変数　h_DLV_LOC_OPTION_CHANGE_VALUEの取得<BR>
	 * @return String
	 */
	public abstract String geth_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * 変数　h_DEL_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_DEL_FLG() ; 

	/**
	 * 変数　h_FINAL_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_FINAL_DLV_LOC_CD() ; 

	/**
	 * 変数　h_FINAL_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String geth_FINAL_DLV_LOC_NAME() ; 

	/**
	 * 変数　h_ITEM_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String geth_ITEM_NAME() ; 

	/**
	 * 変数　h_TOTAL_SHIP_QTYの取得<BR>
	 * @return String
	 */
	public abstract String geth_TOTAL_SHIP_QTY() ; 

	/**
	 * 変数　h_ODR_CMPLT_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_ODR_CMPLT_FLG() ; 

	/**
	 * 変数　h_READ_CUST_ODR_NOの取得<BR>
	 * @return String
	 */
	public abstract String geth_READ_CUST_ODR_NO() ; 

	/**
	 * 変数　l_APPR_REMARKSの取得<BR>
	 * @return String
	 */
	public abstract String getl_APPR_REMARKS() ; 

	/**
	 * 変数　l_NOの取得<BR>
	 * @return String
	 */
	public abstract String getl_NO() ; 

	/**
	 * 変数　l_c_DEL_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getl_c_DEL_FLG() ; 

	/**
	 * 変数　l_CUST_ODR_NOの取得<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ODR_NO() ; 

	/**
	 * 変数　l_CUST_ITEM_CDの取得<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ITEM_CD() ; 

	/**
	 * 変数　l_CUST_CDの取得<BR>
	 * @return String
	 */
	public abstract String getl_CUST_CD() ; 

	/**
	 * 変数　l_CUST_ANAMEの取得<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ANAME() ; 

	/**
	 * 変数　l_CUST_DESINATED_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getl_CUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * 変数　l_DESINATED_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getl_DESINATED_DLV_DATE() ; 

	/**
	 * 変数　l_ODR_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getl_ODR_QTY() ; 

	/**
	 * 変数　l_STOCK_UNITの取得<BR>
	 * @return String
	 */
	public abstract String getl_STOCK_UNIT() ; 

	/**
	 * 変数　l_UNIT_PRICEの取得<BR>
	 * @return String
	 */
	public abstract String getl_UNIT_PRICE() ; 

	/**
	 * 変数　l_PURPOSE_UNIT_PRICE_TYP_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getl_PURPOSE_UNIT_PRICE_TYP_NAME() ; 

	/**
	 * 変数　l_AMOUNT_TYP_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getl_AMOUNT_TYP_NAME() ; 

	/**
	 * 変数　l_ODR_AMOUNTの取得<BR>
	 * @return String
	 */
	public abstract String getl_ODR_AMOUNT() ; 

	/**
	 * 変数　l_ITEM_CD_OPTION_CHANGE_VALUEの取得<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * 変数　l_ARRANGEMENTS_CHARACTERISTICの取得<BR>
	 * @return String
	 */
	public abstract String getl_ARRANGEMENTS_CHARACTERISTIC() ; 

	/**
	 * 変数　l_REMARKSの取得<BR>
	 * @return String
	 */
	public abstract String getl_REMARKS() ; 

	/**
	 * 変数　l_CUST_ITEM_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getl_CUST_ITEM_NAME() ; 

	/**
	 * 変数　l_ITEM_CDの取得<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_CD() ; 

	/**
	 * 変数　l_ITEM_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getl_ITEM_NAME() ; 

	/**
	 * 変数　l_CUST_DESINATED_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getl_CUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * 変数　l_FINAL_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getl_FINAL_DLV_LOC_CD() ; 

	/**
	 * 変数　l_FINAL_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getl_FINAL_DLV_LOC_NAME() ; 

	/**
	 * 変数　l_DISP_SHIP_PLAN_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getl_DISP_SHIP_PLAN_DATE() ; 

	/**
	 * 変数　h_l_ODR_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_CTL_NO() ; 

	/**
	 * 変数　h_l_CUST_CHRG_ORG_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_CUST_CHRG_ORG_CD() ; 

	/**
	 * 変数　h_l_CUST_CHRG_PSN_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_CUST_CHRG_PSN_CD() ; 

	/**
	 * 変数　h_l_CONCENTRATE_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_CONCENTRATE_DLV_LOC_CD() ; 

	/**
	 * 変数　h_l_CONCENTRATE_DATEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_CONCENTRATE_DATE() ; 

	/**
	 * 変数　h_l_SHIP_PLAN_DATEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_PLAN_DATE() ; 

	/**
	 * 変数　h_l_STNDRD_RCV_DESINATED_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_STNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * 変数　h_l_DESINATED_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_DESINATED_DLV_DATE() ; 

	/**
	 * 変数　h_l_DESINATED_DLV_TIMEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_DESINATED_DLV_TIME() ; 

	/**
	 * 変数　h_l_PURPOSE_UNIT_PRICE_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_PURPOSE_UNIT_PRICE_TYP() ; 

	/**
	 * 変数　h_l_CUR_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_CUR_CD() ; 

	/**
	 * 変数　h_l_EXCH_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_EXCH_TYP() ; 

	/**
	 * 変数　h_l_AMOUNT_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_AMOUNT_TYP() ; 

	/**
	 * 変数　h_l_TAX_APPLY_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_APPLY_TYP() ; 

	/**
	 * 変数　h_l_TAX_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_CD() ; 

	/**
	 * 変数　h_l_TAX_CALC_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_TAX_CALC_TYP() ; 

	/**
	 * 変数　h_l_ODR_AMOUNT_EXCH_RATESの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_AMOUNT_EXCH_RATES() ; 

	/**
	 * 変数　h_l_ODR_CMPLT_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_ODR_CMPLT_FLG() ; 

	/**
	 * 変数　h_l_TOTAL_SHIP_QTYの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_TOTAL_SHIP_QTY() ; 

	/**
	 * 変数　h_l_TRANSPORT_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_TRANSPORT_CD() ; 

	/**
	 * 変数　h_l_TRANSPORT_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_TRANSPORT_TYP() ; 

	/**
	 * 変数　h_l_SHIP_WH_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_WH_CD() ; 

	/**
	 * 変数　h_l_PURPOSE_KINDの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_PURPOSE_KIND() ; 

	/**
	 * 変数　h_l_DEPOT_PLAN_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_DEPOT_PLAN_TYP() ; 

	/**
	 * 変数　h_l_DLV_LOC_OPTION_CHANGE_VALUEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * 変数　h_l_ENTRY_TYPの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_ENTRY_TYP() ; 

	/**
	 * 変数　h_l_SHIP_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_SHIP_FLG() ; 

	/**
	 * 変数　h_l_MODIFY_COUNTの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_MODIFY_COUNT() ; 

	/**
	 * 変数　h_l_DATA_EDIT_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_DATA_EDIT_FLG() ; 

	/**
	 * 変数　SELECT_CUST_ODR_NOの取得<BR>
	 * @return String
	 */
	public abstract String getSELECT_CUST_ODR_NO() ; 

	/**
	 * 変数　w_LAST_ODR_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getw_LAST_ODR_QTY() ; 

	/**
	 * 変数　w_CODEの取得<BR>
	 * @return String
	 */
	public abstract String getw_CODE() ; 

	/**
	 * 変数　w_CODE2の取得<BR>
	 * @return String
	 */
	public abstract String getw_CODE2() ; 

	/**
	 * 変数　w_SYS_CLASSの取得<BR>
	 * @return String
	 */
	public abstract String getw_SYS_CLASS() ; 

	/**
	 * 変数　w_CLASS_CODEの取得<BR>
	 * @return String
	 */
	public abstract String getw_CLASS_CODE() ; 

	/**
	 * 変数　w_CUST_ANAMEの取得<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ANAME() ; 

	/**
	 * 変数　w_OWN_ORG_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_OWN_ORG_CD() ; 

	/**
	 * 変数　w_OWN_PERSON_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_OWN_PERSON_CD() ; 

	/**
	 * 変数　w_CUR_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_CUR_CD() ; 

	/**
	 * 変数　w_EXCH_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_EXCH_TYP() ; 

	/**
	 * 変数　w_TAX_APPLY_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_TAX_APPLY_TYP() ; 

	/**
	 * 変数　w_TAX_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_TAX_CD() ; 

	/**
	 * 変数　w_TAX_CALC_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_TAX_CALC_TYP() ; 

	/**
	 * 変数　w_DETAIL_ROUND_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_DETAIL_ROUND_TYP() ; 

	/**
	 * 変数　w_COMPANY_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_COMPANY_CD() ; 

	/**
	 * 変数　w_CUST_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_CUST_CD() ; 

	/**
	 * 変数　w_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_NAME() ; 

	/**
	 * 変数　w_CNCNTRT_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_CNCNTRT_DLV_LOC_CD() ; 

	/**
	 * 変数　w_SHIP_CTL_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_CTL_TYP() ; 

	/**
	 * 変数　w_TRANSPORT_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_TRANSPORT_CD() ; 

	/**
	 * 変数　w_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_CD() ; 

	/**
	 * 変数　w_CUST_ODR_NOの取得<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ODR_NO() ; 

	/**
	 * 変数　w_ACPT_PSN_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_ACPT_PSN_CD() ; 

	/**
	 * 変数　w_UNCNFM_CUST_ODR_CREATE_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_CUST_ODR_CREATE_DATE() ; 

	/**
	 * 変数　w_NEW_OLD_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getw_NEW_OLD_FLG() ; 

	/**
	 * 変数　w_TRAN_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_TRAN_TYP() ; 

	/**
	 * 変数　w_USER_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_USER_CD() ; 

	/**
	 * 変数　w_PRG_NMの取得<BR>
	 * @return String
	 */
	public abstract String getw_PRG_NM() ; 

	/**
	 * 変数　w_SHIP_WH_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_WH_CD() ; 

	/**
	 * 変数　w_ITEM_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_CD() ; 

	/**
	 * 変数　w_PURPOSE_KINDの取得<BR>
	 * @return String
	 */
	public abstract String getw_PURPOSE_KIND() ; 

	/**
	 * 変数　w_CUST_ITEM_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_CUST_ITEM_CD() ; 

	/**
	 * 変数　w_ITEM_CD_OPTION_CHANGE_VALUEの取得<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_CD_OPTION_CHANGE_VALUE() ; 

	/**
	 * 変数　w_DESINATED_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_DESINATED_DLV_DATE() ; 

	/**
	 * 変数　w_ITEM_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getw_ITEM_NAME() ; 

	/**
	 * 変数　w_STOCK_UNITの取得<BR>
	 * @return String
	 */
	public abstract String getw_STOCK_UNIT() ; 

	/**
	 * 変数　w_UNIT_QTY_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_UNIT_QTY_TYP() ; 

	/**
	 * 変数　w_CUST_DESINATED_DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getw_CUST_DESINATED_DLV_LOC_NAME() ; 

	/**
	 * 変数　w_CUST_DESINATED_DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_CUST_DESINATED_DLV_LOC_CD() ; 

	/**
	 * 変数　w_DLV_LOC_OPTION_CHANGE_VALUEの取得<BR>
	 * @return String
	 */
	public abstract String getw_DLV_LOC_OPTION_CHANGE_VALUE() ; 

	/**
	 * 変数　w_ODR_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getw_ODR_CTL_NO() ; 

	/**
	 * 変数　CUST_ANAMEの取得<BR>
	 * @return String
	 */
	public abstract String getCUST_ANAME() ; 

	/**
	 * 変数　JOB_ODR_DLV_DATE_TIMEの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE_TIME() ; 

	/**
	 * 変数　DLV_LOC_CDの取得<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_CD() ; 
	/**
	 * 変数　SHIP_CTL_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getSHIP_CTL_TYP() ; 
	/**
	 * 変数　h_l_JOB_ODR_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_JOB_ODR_DLV_DATE() ; 

	/**
	 * 変数　h_l_JOB_ODR_DLV_TIMEの取得<BR>
	 * @return String
	 */
	public abstract String geth_l_JOB_ODR_DLV_TIME() ; 	
	
	/**
	 * 変数　JOB_ODR_DLV_TIMEの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_TIME() ; 	
	
	/**
	 * 変数　h_NOのセット<BR>
	 * @param String val
	 */
	public abstract void seth_NO(String val) ; 

	/**
	 * 変数　h_ENTRY_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_ENTRY_TYP(String val) ; 

	/**
	 * 変数　c_CUST_ODR_NO_NUMBERINGのセット<BR>
	 * @param String val
	 */
	public abstract void setc_CUST_ODR_NO_NUMBERING(String val) ; 

	/**
	 * 変数　h_SHIP_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_SHIP_FLG(String val) ; 

	/**
	 * 変数　h_UNIT_COST_READ_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_UNIT_COST_READ_FLG(String val) ; 

	/**
	 * 変数　h_DLV_LOC_OPTION_CHANGE_VALUEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * 変数　h_DEL_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_DEL_FLG(String val) ; 

	/**
	 * 変数　h_FINAL_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_FINAL_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　h_FINAL_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_FINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　h_ITEM_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_ITEM_NAME(String val) ; 

	/**
	 * 変数　h_TOTAL_SHIP_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void seth_TOTAL_SHIP_QTY(String val) ; 

	/**
	 * 変数　h_ODR_CMPLT_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_ODR_CMPLT_FLG(String val) ; 

	/**
	 * 変数　h_READ_CUST_ODR_NOのセット<BR>
	 * @param String val
	 */
	public abstract void seth_READ_CUST_ODR_NO(String val) ; 

	/**
	 * 変数　l_APPR_REMARKSのセット<BR>
	 * @param String val
	 */
	public abstract void setl_APPR_REMARKS(String val) ; 

	/**
	 * 変数　l_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setl_NO(String val) ; 

	/**
	 * 変数　l_c_DEL_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setl_c_DEL_FLG(String val) ; 

	/**
	 * 変数　l_CUST_ODR_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ODR_NO(String val) ; 

	/**
	 * 変数　l_CUST_ITEM_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ITEM_CD(String val) ; 

	/**
	 * 変数　l_CUST_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_CD(String val) ; 

	/**
	 * 変数　l_CUST_ANAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ANAME(String val) ; 

	/**
	 * 変数　l_CUST_DESINATED_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　l_DESINATED_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_DESINATED_DLV_DATE(String val) ; 

	/**
	 * 変数　l_ODR_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setl_ODR_QTY(String val) ; 

	/**
	 * 変数　l_STOCK_UNITのセット<BR>
	 * @param String val
	 */
	public abstract void setl_STOCK_UNIT(String val) ; 

	/**
	 * 変数　l_UNIT_PRICEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_UNIT_PRICE(String val) ; 

	/**
	 * 変数　l_PURPOSE_UNIT_PRICE_TYP_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_PURPOSE_UNIT_PRICE_TYP_NAME(String val) ; 

	/**
	 * 変数　l_AMOUNT_TYP_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_AMOUNT_TYP_NAME(String val) ; 

	/**
	 * 変数　l_ODR_AMOUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setl_ODR_AMOUNT(String val) ; 

	/**
	 * 変数　l_ITEM_CD_OPTION_CHANGE_VALUEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * 変数　l_ARRANGEMENTS_CHARACTERISTICのセット<BR>
	 * @param String val
	 */
	public abstract void setl_ARRANGEMENTS_CHARACTERISTIC(String val) ; 

	/**
	 * 変数　l_REMARKSのセット<BR>
	 * @param String val
	 */
	public abstract void setl_REMARKS(String val) ; 

	/**
	 * 変数　l_CUST_ITEM_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_ITEM_NAME(String val) ; 

	/**
	 * 変数　l_ITEM_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_CD(String val) ; 

	/**
	 * 変数　l_ITEM_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_ITEM_NAME(String val) ; 

	/**
	 * 変数　l_CUST_DESINATED_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_CUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　l_FINAL_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setl_FINAL_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　l_FINAL_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_FINAL_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　l_DISP_SHIP_PLAN_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setl_DISP_SHIP_PLAN_DATE(String val) ; 

	/**
	 * 変数　h_l_ODR_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_CTL_NO(String val) ; 

	/**
	 * 変数　h_l_CUST_CHRG_ORG_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUST_CHRG_ORG_CD(String val) ; 

	/**
	 * 変数　h_l_CUST_CHRG_PSN_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUST_CHRG_PSN_CD(String val) ; 

	/**
	 * 変数　h_l_CONCENTRATE_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_CONCENTRATE_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　h_l_CONCENTRATE_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_CONCENTRATE_DATE(String val) ; 

	/**
	 * 変数　h_l_SHIP_PLAN_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_PLAN_DATE(String val) ; 

	/**
	 * 変数　h_l_STNDRD_RCV_DESINATED_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_STNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * 変数　h_l_DESINATED_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_DESINATED_DLV_DATE(String val) ; 

	/**
	 * 変数　h_l_DESINATED_DLV_TIMEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_DESINATED_DLV_TIME(String val) ; 

	/**
	 * 変数　h_l_PURPOSE_UNIT_PRICE_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_PURPOSE_UNIT_PRICE_TYP(String val) ; 

	/**
	 * 変数　h_l_CUR_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_CUR_CD(String val) ; 

	/**
	 * 変数　h_l_EXCH_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_EXCH_TYP(String val) ; 

	/**
	 * 変数　h_l_AMOUNT_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_AMOUNT_TYP(String val) ; 

	/**
	 * 変数　h_l_TAX_APPLY_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_APPLY_TYP(String val) ; 

	/**
	 * 変数　h_l_TAX_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_CD(String val) ; 

	/**
	 * 変数　h_l_TAX_CALC_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_TAX_CALC_TYP(String val) ; 

	/**
	 * 変数　h_l_ODR_AMOUNT_EXCH_RATESのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_AMOUNT_EXCH_RATES(String val) ; 

	/**
	 * 変数　h_l_ODR_CMPLT_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_ODR_CMPLT_FLG(String val) ; 

	/**
	 * 変数　h_l_TOTAL_SHIP_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_TOTAL_SHIP_QTY(String val) ; 

	/**
	 * 変数　h_l_TRANSPORT_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_TRANSPORT_CD(String val) ; 

	/**
	 * 変数　h_l_TRANSPORT_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_TRANSPORT_TYP(String val) ; 

	/**
	 * 変数　h_l_SHIP_WH_CDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_WH_CD(String val) ; 

	/**
	 * 変数　h_l_PURPOSE_KINDのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_PURPOSE_KIND(String val) ; 

	/**
	 * 変数　h_l_DEPOT_PLAN_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_DEPOT_PLAN_TYP(String val) ; 

	/**
	 * 変数　h_l_DLV_LOC_OPTION_CHANGE_VALUEのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * 変数　h_l_ENTRY_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_ENTRY_TYP(String val) ; 

	/**
	 * 変数　h_l_SHIP_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_SHIP_FLG(String val) ; 

	/**
	 * 変数　h_l_MODIFY_COUNTのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_MODIFY_COUNT(String val) ; 

	/**
	 * 変数　h_l_DATA_EDIT_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_l_DATA_EDIT_FLG(String val) ; 

	/**
	 * 変数　SELECT_CUST_ODR_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setSELECT_CUST_ODR_NO(String val) ; 

	/**
	 * 変数　w_LAST_ODR_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setw_LAST_ODR_QTY(String val) ; 

	/**
	 * 変数　w_CODEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CODE(String val) ; 

	/**
	 * 変数　w_CODE2のセット<BR>
	 * @param String val
	 */
	public abstract void setw_CODE2(String val) ; 

	/**
	 * 変数　w_SYS_CLASSのセット<BR>
	 * @param String val
	 */
	public abstract void setw_SYS_CLASS(String val) ; 

	/**
	 * 変数　w_CLASS_CODEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CLASS_CODE(String val) ; 

	/**
	 * 変数　w_CUST_ANAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ANAME(String val) ; 

	/**
	 * 変数　w_OWN_ORG_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_OWN_ORG_CD(String val) ; 

	/**
	 * 変数　w_OWN_PERSON_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_OWN_PERSON_CD(String val) ; 

	/**
	 * 変数　w_CUR_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CUR_CD(String val) ; 

	/**
	 * 変数　w_EXCH_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_EXCH_TYP(String val) ; 

	/**
	 * 変数　w_TAX_APPLY_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_APPLY_TYP(String val) ; 

	/**
	 * 変数　w_TAX_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_CD(String val) ; 

	/**
	 * 変数　w_TAX_CALC_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_TAX_CALC_TYP(String val) ; 

	/**
	 * 変数　w_DETAIL_ROUND_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_DETAIL_ROUND_TYP(String val) ; 

	/**
	 * 変数　w_COMPANY_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_COMPANY_CD(String val) ; 

	/**
	 * 変数　w_CUST_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_CD(String val) ; 

	/**
	 * 変数　w_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　w_CNCNTRT_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CNCNTRT_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　w_SHIP_CTL_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_CTL_TYP(String val) ; 

	/**
	 * 変数　w_TRANSPORT_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_TRANSPORT_CD(String val) ; 

	/**
	 * 変数　w_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　w_CUST_ODR_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ODR_NO(String val) ; 

	/**
	 * 変数　w_ACPT_PSN_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_ACPT_PSN_CD(String val) ; 

	/**
	 * 変数　w_UNCNFM_CUST_ODR_CREATE_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_CUST_ODR_CREATE_DATE(String val) ; 

	/**
	 * 変数　w_NEW_OLD_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setw_NEW_OLD_FLG(String val) ; 

	/**
	 * 変数　w_TRAN_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_TRAN_TYP(String val) ; 

	/**
	 * 変数　w_USER_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_USER_CD(String val) ; 

	/**
	 * 変数　w_PRG_NMのセット<BR>
	 * @param String val
	 */
	public abstract void setw_PRG_NM(String val) ; 

	/**
	 * 変数　w_SHIP_WH_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_WH_CD(String val) ; 

	/**
	 * 変数　w_ITEM_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_CD(String val) ; 

	/**
	 * 変数　w_PURPOSE_KINDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_PURPOSE_KIND(String val) ; 

	/**
	 * 変数　w_CUST_ITEM_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_ITEM_CD(String val) ; 

	/**
	 * 変数　w_ITEM_CD_OPTION_CHANGE_VALUEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_CD_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * 変数　w_DESINATED_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_DESINATED_DLV_DATE(String val) ; 

	/**
	 * 変数　w_ITEM_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_ITEM_NAME(String val) ; 

	/**
	 * 変数　w_STOCK_UNITのセット<BR>
	 * @param String val
	 */
	public abstract void setw_STOCK_UNIT(String val) ; 

	/**
	 * 変数　w_UNIT_QTY_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_UNIT_QTY_TYP(String val) ; 

	/**
	 * 変数　w_CUST_DESINATED_DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_DESINATED_DLV_LOC_NAME(String val) ; 

	/**
	 * 変数　w_CUST_DESINATED_DLV_LOC_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CUST_DESINATED_DLV_LOC_CD(String val) ; 

	/**
	 * 変数　w_DLV_LOC_OPTION_CHANGE_VALUEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_DLV_LOC_OPTION_CHANGE_VALUE(String val) ; 

	/**
	 * 変数　w_ODR_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setw_ODR_CTL_NO(String val) ; 

	/**
	 * 変数　CUST_ANAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setCUST_ANAME(String val) ; 

	//KQ1140

	/**
	 * 変数　DISP_DAY_1の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_1() ; 

	/**
	 * 変数　DISP_DAY_2の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_2() ; 

	/**
	 * 変数　DISP_DAY_3の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_3() ; 

	/**
	 * 変数　DISP_DAY_4の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_4() ; 

	/**
	 * 変数　DISP_DAY_5の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_5() ; 

	/**
	 * 変数　DISP_DAY_6の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_6() ; 

	/**
	 * 変数　DISP_DAY_7の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_7() ; 

	/**
	 * 変数　DISP_DAY_8の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_8() ; 

	/**
	 * 変数　DISP_DAY_9の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_9() ; 

	/**
	 * 変数　DISP_DAY_10の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_10() ; 

	/**
	 * 変数　DISP_NEXT_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getDISP_NEXT_MONTH() ; 

	/**
	 * 変数　NOW_QTY_DAY_1の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_1() ; 

	/**
	 * 変数　NOW_QTY_DAY_2の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_2() ; 

	/**
	 * 変数　NOW_QTY_DAY_3の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_3() ; 

	/**
	 * 変数　NOW_QTY_DAY_4の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_4() ; 

	/**
	 * 変数　NOW_QTY_DAY_5の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_5() ; 

	/**
	 * 変数　NOW_QTY_DAY_6の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_6() ; 

	/**
	 * 変数　NOW_QTY_DAY_7の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_7() ; 

	/**
	 * 変数　NOW_QTY_DAY_8の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_8() ; 

	/**
	 * 変数　NOW_QTY_DAY_9の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_9() ; 

	/**
	 * 変数　NOW_QTY_DAY_10の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_10() ; 

	/**
	 * 変数　NOW_QTY_NEXT_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_NEXT_MONTH() ; 

	/**
	 * 変数　BEF_QTY_DAY_1の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_1() ; 

	/**
	 * 変数　BEF_QTY_DAY_2の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_2() ; 

	/**
	 * 変数　BEF_QTY_DAY_3の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_3() ; 

	/**
	 * 変数　BEF_QTY_DAY_4の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_4() ; 

	/**
	 * 変数　BEF_QTY_DAY_5の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_5() ; 

	/**
	 * 変数　BEF_QTY_DAY_6の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_6() ; 

	/**
	 * 変数　BEF_QTY_DAY_7の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_7() ; 

	/**
	 * 変数　BEF_QTY_DAY_8の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_8() ; 

	/**
	 * 変数　BEF_QTY_DAY_9の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_9() ; 

	/**
	 * 変数　BEF_QTY_DAY_10の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_10() ; 

	/**
	 * 変数　BEF_QTY_NEXT_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_NEXT_MONTH() ; 

	/**
	 * 変数　DEF_QTY_DAY_1の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_1() ; 

	/**
	 * 変数　DEF_QTY_DAY_2の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_2() ; 

	/**
	 * 変数　DEF_QTY_DAY_3の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_3() ; 

	/**
	 * 変数　DEF_QTY_DAY_4の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_4() ; 

	/**
	 * 変数　DEF_QTY_DAY_5の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_5() ; 

	/**
	 * 変数　DEF_QTY_DAY_6の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_6() ; 

	/**
	 * 変数　DEF_QTY_DAY_7の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_7() ; 

	/**
	 * 変数　DEF_QTY_DAY_8の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_8() ; 

	/**
	 * 変数　DEF_QTY_DAY_9の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_9() ; 

	/**
	 * 変数　DEF_QTY_DAY_10の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_10() ; 

	/**
	 * 変数　DEF_QTY_NEXT_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_NEXT_MONTH() ; 

	/**
	 * 変数　DISP_DAY_11の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_11() ; 

	/**
	 * 変数　DISP_DAY_12の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_12() ; 

	/**
	 * 変数　DISP_DAY_13の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_13() ; 

	/**
	 * 変数　DISP_DAY_14の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_14() ; 

	/**
	 * 変数　DISP_DAY_15の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_15() ; 

	/**
	 * 変数　DISP_DAY_16の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_16() ; 

	/**
	 * 変数　DISP_DAY_17の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_17() ; 

	/**
	 * 変数　DISP_DAY_18の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_18() ; 

	/**
	 * 変数　DISP_DAY_19の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_19() ; 

	/**
	 * 変数　DISP_DAY_20の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_20() ; 

	/**
	 * 変数　DISP_2ND_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getDISP_2ND_MONTH() ; 

	/**
	 * 変数　NOW_QTY_DAY_11の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_11() ; 

	/**
	 * 変数　NOW_QTY_DAY_12の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_12() ; 

	/**
	 * 変数　NOW_QTY_DAY_13の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_13() ; 

	/**
	 * 変数　NOW_QTY_DAY_14の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_14() ; 

	/**
	 * 変数　NOW_QTY_DAY_15の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_15() ; 

	/**
	 * 変数　NOW_QTY_DAY_16の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_16() ; 

	/**
	 * 変数　NOW_QTY_DAY_17の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_17() ; 

	/**
	 * 変数　NOW_QTY_DAY_18の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_18() ; 

	/**
	 * 変数　NOW_QTY_DAY_19の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_19() ; 

	/**
	 * 変数　NOW_QTY_DAY_20の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_20() ; 

	/**
	 * 変数　NOW_QTY_2ND_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_2ND_MONTH() ; 

	/**
	 * 変数　BEF_QTY_DAY_11の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_11() ; 

	/**
	 * 変数　BEF_QTY_DAY_12の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_12() ; 

	/**
	 * 変数　BEF_QTY_DAY_13の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_13() ; 

	/**
	 * 変数　BEF_QTY_DAY_14の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_14() ; 

	/**
	 * 変数　BEF_QTY_DAY_15の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_15() ; 

	/**
	 * 変数　BEF_QTY_DAY_16の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_16() ; 

	/**
	 * 変数　BEF_QTY_DAY_17の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_17() ; 

	/**
	 * 変数　BEF_QTY_DAY_18の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_18() ; 

	/**
	 * 変数　BEF_QTY_DAY_19の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_19() ; 

	/**
	 * 変数　BEF_QTY_DAY_20の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_20() ; 

	/**
	 * 変数　BEF_QTY_2ND_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_2ND_MONTH() ; 

	/**
	 * 変数　DEF_QTY_DAY_11の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_11() ; 

	/**
	 * 変数　DEF_QTY_DAY_12の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_12() ; 

	/**
	 * 変数　DEF_QTY_DAY_13の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_13() ; 

	/**
	 * 変数　DEF_QTY_DAY_14の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_14() ; 

	/**
	 * 変数　DEF_QTY_DAY_15の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_15() ; 

	/**
	 * 変数　DEF_QTY_DAY_16の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_16() ; 

	/**
	 * 変数　DEF_QTY_DAY_17の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_17() ; 

	/**
	 * 変数　DEF_QTY_DAY_18の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_18() ; 

	/**
	 * 変数　DEF_QTY_DAY_19の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_19() ; 

	/**
	 * 変数　DEF_QTY_DAY_20の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_20() ; 

	/**
	 * 変数　DEF_QTY_2ND_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_2ND_MONTH() ; 

	/**
	 * 変数　DISP_DAY_21の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_21() ; 

	/**
	 * 変数　DISP_DAY_22の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_22() ; 

	/**
	 * 変数　DISP_DAY_23の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_23() ; 

	/**
	 * 変数　DISP_DAY_24の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_24() ; 

	/**
	 * 変数　DISP_DAY_25の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_25() ; 

	/**
	 * 変数　DISP_DAY_26の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_26() ; 

	/**
	 * 変数　DISP_DAY_27の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_27() ; 

	/**
	 * 変数　DISP_DAY_28の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_28() ; 

	/**
	 * 変数　DISP_DAY_29の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_29() ; 

	/**
	 * 変数　DISP_DAY_30の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_30() ; 

	/**
	 * 変数　DISP_DAY_31の取得<BR>
	 * @return String
	 */
	public abstract String getDISP_DAY_31() ; 

	/**
	 * 変数　NOW_QTY_DAY_21の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_21() ; 

	/**
	 * 変数　NOW_QTY_DAY_22の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_22() ; 

	/**
	 * 変数　NOW_QTY_DAY_23の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_23() ; 

	/**
	 * 変数　NOW_QTY_DAY_24の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_24() ; 

	/**
	 * 変数　NOW_QTY_DAY_25の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_25() ; 

	/**
	 * 変数　NOW_QTY_DAY_26の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_26() ; 

	/**
	 * 変数　NOW_QTY_DAY_27の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_27() ; 

	/**
	 * 変数　NOW_QTY_DAY_28の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_28() ; 

	/**
	 * 変数　NOW_QTY_DAY_29の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_29() ; 

	/**
	 * 変数　NOW_QTY_DAY_30の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_30() ; 

	/**
	 * 変数　NOW_QTY_DAY_31の取得<BR>
	 * @return String
	 */
	public abstract String getNOW_QTY_DAY_31() ; 

	/**
	 * 変数　BEF_QTY_DAY_21の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_21() ; 

	/**
	 * 変数　BEF_QTY_DAY_22の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_22() ; 

	/**
	 * 変数　BEF_QTY_DAY_23の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_23() ; 

	/**
	 * 変数　BEF_QTY_DAY_24の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_24() ; 

	/**
	 * 変数　BEF_QTY_DAY_25の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_25() ; 

	/**
	 * 変数　BEF_QTY_DAY_26の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_26() ; 

	/**
	 * 変数　BEF_QTY_DAY_27の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_27() ; 

	/**
	 * 変数　BEF_QTY_DAY_28の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_28() ; 

	/**
	 * 変数　BEF_QTY_DAY_29の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_29() ; 

	/**
	 * 変数　BEF_QTY_DAY_30の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_30() ; 

	/**
	 * 変数　BEF_QTY_DAY_31の取得<BR>
	 * @return String
	 */
	public abstract String getBEF_QTY_DAY_31() ; 

	/**
	 * 変数　DEF_QTY_DAY_21の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_21() ; 

	/**
	 * 変数　DEF_QTY_DAY_22の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_22() ; 

	/**
	 * 変数　DEF_QTY_DAY_23の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_23() ; 

	/**
	 * 変数　DEF_QTY_DAY_24の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_24() ; 

	/**
	 * 変数　DEF_QTY_DAY_25の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_25() ; 

	/**
	 * 変数　DEF_QTY_DAY_26の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_26() ; 

	/**
	 * 変数　DEF_QTY_DAY_27の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_27() ; 

	/**
	 * 変数　DEF_QTY_DAY_28の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_28() ; 

	/**
	 * 変数　DEF_QTY_DAY_29の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_29() ; 

	/**
	 * 変数　DEF_QTY_DAY_30の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_30() ; 

	/**
	 * 変数　DEF_QTY_DAY_31の取得<BR>
	 * @return String
	 */
	public abstract String getDEF_QTY_DAY_31() ; 

	/**
	 * 変数　NOW_SUM_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getNOW_SUM_QTY() ; 

	/**
	 * 変数　BEFORE_SUM_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getBEFORE_SUM_QTY() ; 

	/**
	 * 変数　h_MASK_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_MASK_FLG() ; 

	/**
	 * 変数　w_PLANT_CDの取得<BR>
	 * @return String
	 */
	public abstract String getw_PLANT_CD() ; 

	/**
	 * 変数　OWN_ORG_CDの取得<BR>
	 * @return String
	 */
	public abstract String getOWN_ORG_CD() ; 

	/**
	 * 変数　DLV_LOC_NAMEの取得<BR>
	 * @return String
	 */
	public abstract String getDLV_LOC_NAME() ; 

	/**
	 * 変数　w_CAL_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_CAL_DATE() ; 

	/**
	 * 変数　w_HOLIDAY_FLGの取得<BR>
	 * @return String
	 */
	public abstract String getw_HOLIDAY_FLG() ; 

	/**
	 * 変数　w_UNCNFM_REQUIRED_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_REQUIRED_DATE() ; 

	/**
	 * 変数　w_UNCNFM_ODR_CTL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_CTL_NO() ; 

	/**
	 * 変数　w_UNCNFM_ODR_QTY_NOWの取得<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_QTY_NOW() ; 

	/**
	 * 変数　w_UNCNFM_ODR_QTY_BEFの取得<BR>
	 * @return String
	 */
	public abstract String getw_UNCNFM_ODR_QTY_BEF() ; 

	/**
	 * 変数　w_MODIFY_COUNTの取得<BR>
	 * @return String
	 */
	public abstract String getw_MODIFY_COUNT() ; 

	/**
	 * 変数　w_COUNTの取得<BR>
	 * @return String
	 */
	public abstract String getw_COUNT() ; 

	/**
	 * 変数　w_EDI_DATA_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_EDI_DATA_TYP() ; 

	/**
	 * 変数　w_BUSINESS_OPR_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_BUSINESS_OPR_DATE() ; 

	/**
	 * 変数　w_LAST_DAYの取得<BR>
	 * @return String
	 */
	public abstract String getw_LAST_DAY() ; 

	/**
	 * 変数　YEAR_MONTHの取得<BR>
	 * @return String
	 */
	public abstract String getYEAR_MONTH() ; 

	/**
	 * 変数　w_CONCENTRATE_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_CONCENTRATE_DATE() ; 

	/**
	 * 変数　w_SHIP_PLAN_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_SHIP_PLAN_DATE() ; 

	/**
	 * 変数　w_STNDRD_RCV_DESINATED_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getw_STNDRD_RCV_DESINATED_DLV_DATE() ; 

	/**
	 * 変数　w_DEPOT_PLAN_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getw_DEPOT_PLAN_TYP() ; 

	/**
	 * 変数　MAX_CAL_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getMAX_CAL_DATE() ; 

	/**
	 * 変数　DISP_DAY_1のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_1(String val) ; 

	/**
	 * 変数　DISP_DAY_2のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_2(String val) ; 

	/**
	 * 変数　DISP_DAY_3のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_3(String val) ; 

	/**
	 * 変数　DISP_DAY_4のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_4(String val) ; 

	/**
	 * 変数　DISP_DAY_5のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_5(String val) ; 

	/**
	 * 変数　DISP_DAY_6のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_6(String val) ; 

	/**
	 * 変数　DISP_DAY_7のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_7(String val) ; 

	/**
	 * 変数　DISP_DAY_8のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_8(String val) ; 

	/**
	 * 変数　DISP_DAY_9のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_9(String val) ; 

	/**
	 * 変数　DISP_DAY_10のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_10(String val) ; 

	/**
	 * 変数　DISP_NEXT_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_NEXT_MONTH(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_1のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_1(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_2のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_2(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_3のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_3(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_4のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_4(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_5のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_5(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_6のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_6(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_7のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_7(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_8のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_8(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_9のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_9(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_10のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_10(String val) ; 

	/**
	 * 変数　NOW_QTY_NEXT_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_NEXT_MONTH(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_1のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_1(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_2のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_2(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_3のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_3(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_4のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_4(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_5のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_5(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_6のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_6(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_7のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_7(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_8のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_8(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_9のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_9(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_10のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_10(String val) ; 

	/**
	 * 変数　BEF_QTY_NEXT_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_NEXT_MONTH(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_1のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_1(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_2のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_2(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_3のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_3(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_4のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_4(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_5のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_5(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_6のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_6(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_7のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_7(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_8のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_8(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_9のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_9(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_10のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_10(String val) ; 

	/**
	 * 変数　DEF_QTY_NEXT_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_NEXT_MONTH(String val) ; 

	/**
	 * 変数　DISP_DAY_11のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_11(String val) ; 

	/**
	 * 変数　DISP_DAY_12のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_12(String val) ; 

	/**
	 * 変数　DISP_DAY_13のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_13(String val) ; 

	/**
	 * 変数　DISP_DAY_14のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_14(String val) ; 

	/**
	 * 変数　DISP_DAY_15のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_15(String val) ; 

	/**
	 * 変数　DISP_DAY_16のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_16(String val) ; 

	/**
	 * 変数　DISP_DAY_17のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_17(String val) ; 

	/**
	 * 変数　DISP_DAY_18のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_18(String val) ; 

	/**
	 * 変数　DISP_DAY_19のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_19(String val) ; 

	/**
	 * 変数　DISP_DAY_20のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_20(String val) ; 

	/**
	 * 変数　DISP_2ND_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_2ND_MONTH(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_11のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_11(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_12のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_12(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_13のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_13(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_14のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_14(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_15のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_15(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_16のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_16(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_17のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_17(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_18のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_18(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_19のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_19(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_20のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_20(String val) ; 

	/**
	 * 変数　NOW_QTY_2ND_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_2ND_MONTH(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_11のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_11(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_12のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_12(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_13のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_13(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_14のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_14(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_15のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_15(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_16のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_16(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_17のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_17(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_18のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_18(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_19のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_19(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_20のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_20(String val) ; 

	/**
	 * 変数　BEF_QTY_2ND_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_2ND_MONTH(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_11のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_11(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_12のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_12(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_13のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_13(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_14のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_14(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_15のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_15(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_16のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_16(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_17のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_17(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_18のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_18(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_19のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_19(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_20のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_20(String val) ; 

	/**
	 * 変数　DEF_QTY_2ND_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_2ND_MONTH(String val) ; 

	/**
	 * 変数　DISP_DAY_21のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_21(String val) ; 

	/**
	 * 変数　DISP_DAY_22のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_22(String val) ; 

	/**
	 * 変数　DISP_DAY_23のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_23(String val) ; 

	/**
	 * 変数　DISP_DAY_24のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_24(String val) ; 

	/**
	 * 変数　DISP_DAY_25のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_25(String val) ; 

	/**
	 * 変数　DISP_DAY_26のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_26(String val) ; 

	/**
	 * 変数　DISP_DAY_27のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_27(String val) ; 

	/**
	 * 変数　DISP_DAY_28のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_28(String val) ; 

	/**
	 * 変数　DISP_DAY_29のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_29(String val) ; 

	/**
	 * 変数　DISP_DAY_30のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_30(String val) ; 

	/**
	 * 変数　DISP_DAY_31のセット<BR>
	 * @param String val
	 */
	public abstract void setDISP_DAY_31(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_21のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_21(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_22のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_22(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_23のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_23(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_24のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_24(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_25のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_25(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_26のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_26(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_27のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_27(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_28のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_28(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_29のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_29(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_30のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_30(String val) ; 

	/**
	 * 変数　NOW_QTY_DAY_31のセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_QTY_DAY_31(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_21のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_21(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_22のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_22(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_23のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_23(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_24のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_24(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_25のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_25(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_26のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_26(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_27のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_27(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_28のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_28(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_29のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_29(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_30のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_30(String val) ; 

	/**
	 * 変数　BEF_QTY_DAY_31のセット<BR>
	 * @param String val
	 */
	public abstract void setBEF_QTY_DAY_31(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_21のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_21(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_22のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_22(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_23のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_23(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_24のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_24(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_25のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_25(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_26のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_26(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_27のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_27(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_28のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_28(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_29のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_29(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_30のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_30(String val) ; 

	/**
	 * 変数　DEF_QTY_DAY_31のセット<BR>
	 * @param String val
	 */
	public abstract void setDEF_QTY_DAY_31(String val) ; 

	/**
	 * 変数　NOW_SUM_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setNOW_SUM_QTY(String val) ; 

	/**
	 * 変数　BEFORE_SUM_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setBEFORE_SUM_QTY(String val) ; 

	/**
	 * 変数　h_MASK_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void seth_MASK_FLG(String val) ; 

	/**
	 * 変数　w_PLANT_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setw_PLANT_CD(String val) ; 

	/**
	 * 変数　OWN_ORG_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setOWN_ORG_CD(String val) ; 

	/**
	 * 変数　DLV_LOC_NAMEのセット<BR>
	 * @param String val
	 */
	public abstract void setDLV_LOC_NAME(String val) ; 

	/**
	 * 変数　w_CAL_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CAL_DATE(String val) ; 

	/**
	 * 変数　w_HOLIDAY_FLGのセット<BR>
	 * @param String val
	 */
	public abstract void setw_HOLIDAY_FLG(String val) ; 

	/**
	 * 変数　w_UNCNFM_REQUIRED_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_REQUIRED_DATE(String val) ; 

	/**
	 * 変数　w_UNCNFM_ODR_CTL_NOのセット<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_CTL_NO(String val) ; 

	/**
	 * 変数　w_UNCNFM_ODR_QTY_NOWのセット<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_QTY_NOW(String val) ; 

	/**
	 * 変数　w_UNCNFM_ODR_QTY_BEFのセット<BR>
	 * @param String val
	 */
	public abstract void setw_UNCNFM_ODR_QTY_BEF(String val) ; 

	/**
	 * 変数　w_MODIFY_COUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setw_MODIFY_COUNT(String val) ; 

	/**
	 * 変数　w_COUNTのセット<BR>
	 * @param String val
	 */
	public abstract void setw_COUNT(String val) ; 

	/**
	 * 変数　w_EDI_DATA_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_EDI_DATA_TYP(String val) ; 

	/**
	 * 変数　w_BUSINESS_OPR_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_BUSINESS_OPR_DATE(String val) ; 

	/**
	 * 変数　w_LAST_DAYのセット<BR>
	 * @param String val
	 */
	public abstract void setw_LAST_DAY(String val) ; 

	/**
	 * 変数　YEAR_MONTHのセット<BR>
	 * @param String val
	 */
	public abstract void setYEAR_MONTH(String val) ; 

	/**
	 * 変数　w_CONCENTRATE_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_CONCENTRATE_DATE(String val) ; 

	/**
	 * 変数　w_SHIP_PLAN_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_SHIP_PLAN_DATE(String val) ; 

	/**
	 * 変数　w_STNDRD_RCV_DESINATED_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setw_STNDRD_RCV_DESINATED_DLV_DATE(String val) ; 

	/**
	 * 変数　w_DEPOT_PLAN_TYPのセット<BR>
	 * @param String val
	 */
	public abstract void setw_DEPOT_PLAN_TYP(String val) ; 

	/**
	 * 変数　MAX_CAL_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setMAX_CAL_DATE(String val) ; 
	
	// 受注製番紐付を添加
	/**
	 * 変数　PREPARE_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getPREPARE_QTY() ; 

	/**
	 * 変数　JOB_ODR_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_DLV_DATE() ; 

	/**
	 * 変数　ALC_GRP_CDの取得<BR>
	 * @return String
	 */
	public abstract String getALC_GRP_CD() ; 

	/**
	 * 変数　JOB_ODR_CDの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_ODR_CD() ; 


	/**
	 * 変数　PRD_REQ_JOB_ODR_TYP_1の取得<BR>
	 * @return String
	 */
	public abstract String geth_PRD_REQ_JOB_ODR_TYP_1() ;

	/**
	 * 変数　PRD_REQ_JOB_ODR_TYP_2の取得<BR>
	 * @return String
	 */
	public abstract String geth_PRD_REQ_JOB_ODR_TYP_2() ;

	/**
	 * 変数　h_JOB_UPDATE_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_JOB_UPDATE_FLG() ;

	/**
	 * 変数　c_DOODRの取得<BR>
	 * @return String
	 */
	public abstract String getc_DOODR() ;

	/**
	 * 変数　c_INPUTODRCDの取得<BR>
	 * @return String
	 */
	public abstract String getc_INPUTODRCD() ;

	/**
	 * 変数　h_SHIP_PLANT_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_SHIP_PLANT_CD() ;

	/**
	 * 変数　JOB_OD_CD_PREFIXの取得<BR>
	 * @return String
	 */
	public abstract String getJOB_OD_CD_PREFIX() ;

	/**
	 * 変数　l_ALCD_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getl_ALCD_QTY() ;

	/**
	 * 変数　h_DOODRの取得<BR>
	 * @return String
	 */
	public abstract String geth_DOODR() ;

	/**
	 * 変数　l_JOB_ODR_QTYの取得<BR>
	 * @return String
	 */
	public abstract String getl_PREPARE_QTY() ;

	/**
	 * 変数　l_JOB_ODR_DLV_DATEの取得<BR>
	 * @return String
	 */
	public abstract String getl_JOB_ODR_DLV_DATE() ;

	/**
	 * 変数　l_ALC_GRP_CDの取得<BR>
	 * @return String
	 */
	public abstract String getl_ALC_GRP_CD() ;

	/**
	 * 変数　h_INPUTODRCDの取得<BR>
	 * @return String
	 */
	public abstract String geth_INPUTODRCD() ;

	/**
	 * 変数　l_JOB_ODR_CDの取得<BR>
	 * @return String
	 */
	public abstract String getl_JOB_ODR_CD() ;

	/**
	 * 変数　MRP_ODR_TYPの取得<BR>
	 * @return String
	 */
	public abstract String getMRP_ODR_TYP() ;

	/**
	 * 変数　h_ODR_QTY_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_ODR_QTY_FLG() ;

	/**
	 * 変数　h_UPD_DEL_FLGの取得<BR>
	 * @return String
	 */
	public abstract String geth_UPD_DEL_FLG() ;

	/**
	 * 変数　h_PLANT_CDの取得<BR>
	 * @return String
	 */
	public abstract String geth_PLANT_CD() ;

	/**
	 * 変数　T_JOB_ODR_PLANT_CDの取得<BR>
	 * @return String
	 */
	public abstract String getT_JOB_ODR_PLANT_CD() ;

	/**
	 * 変数　CAL_NOの取得<BR>
	 * @return String
	 */
	public abstract String getCAL_NO() ;
	
	
	
	
	/**
	 * 変数　PREPARE_QTYのセット<BR>
	 * @param String val
	 */
	public abstract void setPREPARE_QTY(String val) ; 

	/**
	 * 変数　JOB_ODR_DLV_DATEのセット<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE(String val) ; 

	/**
	 * 変数　ALC_GRP_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setALC_GRP_CD(String val) ; 

	/**
	 * 変数　JOB_ODR_CDのセット<BR>
	 * @param String val
	 */
	public abstract void setJOB_ODR_CD(String val) ; 

	/**
	 * 変数　PRD_REQ_JOB_ODR_TYP_1のセット<BR>
	  * @param String val
	 */
	public abstract void seth_PRD_REQ_JOB_ODR_TYP_1(String val) ; 

	/**
	 * 変数　PRD_REQ_JOB_ODR_TYP_2のセット<BR>
	  * @param String val
	 */
	public abstract void seth_PRD_REQ_JOB_ODR_TYP_2(String val) ; 

	/**
	 * 変数　h_JOB_UPDATE_FLGのセット<BR>
	  * @param String val
	 */
	public abstract void seth_JOB_UPDATE_FLG(String val) ; 

	/**
	 * 変数　c_DOODRのセット<BR>
	  * @param String val
	 */
	public abstract void setc_DOODR(String val) ; 

	/**
	 * 変数　c_INPUTODRCDのセット<BR>
	  * @param String val
	 */
	public abstract void setc_INPUTODRCD(String val) ; 

	/**
	 * 変数　h_SHIP_PLANT_CDのセット<BR>
	  * @param String val
	 */
	public abstract void seth_SHIP_PLANT_CD(String val) ; 

	/**
	 * 変数　JOB_OD_CD_PREFIXのセット<BR>
	  * @param String val
	 */
	public abstract void setJOB_OD_CD_PREFIX(String val) ; 

	/**
	 * 変数　l_ALCD_QTYのセット<BR>
	  * @param String val
	 */
	public abstract void setl_ALCD_QTY(String val) ; 

	/**
	 * 変数　h_DOODRのセット<BR>
	  * @param String val
	 */
	public abstract void seth_DOODR(String val) ; 

	/**
	 * 変数　l_PREPARE_QTYのセット<BR>
	  * @param String val
	 */
	public abstract void setl_PREPARE_QTY(String val) ; 

	/**
	 * 変数　l_JOB_ODR_DLV_DATEのセット<BR>
	  * @param String val
	 */
	public abstract void setl_JOB_ODR_DLV_DATE(String val) ; 

	/**
	 * 変数　l_ALC_GRP_CDのセット<BR>
	  * @param String val
	 */
	public abstract void setl_ALC_GRP_CD(String val) ; 

	/**
	 * 変数　h_INPUTODRCDのセット<BR>
	  * @param String val
	 */
	public abstract void seth_INPUTODRCD(String val) ; 

	/**
	 * 変数　l_JOB_ODR_CDのセット<BR>
	  * @param String val
	 */
	public abstract void setl_JOB_ODR_CD(String val) ; 

	/**
	 * 変数　MRP_ODR_TYPのセット<BR>
	  * @param String val
	 */
	public abstract void setMRP_ODR_TYP(String val) ; 

	/**
	 * 変数　h_ODR_QTY_FLGのセット<BR>
	  * @param String val
	 */
	public abstract void seth_ODR_QTY_FLG(String val) ; 

	/**
	 * 変数　h_UPD_DEL_FLGのセット<BR>
	  * @param String val
	 */
	public abstract void seth_UPD_DEL_FLG(String val) ; 

	/**
	 * 変数　h_PLANT_CDのセット<BR>
	  * @param String val
	 */
	public abstract void seth_PLANT_CD(String val) ; 

	/**
	 * 変数　T_ODR_PLANT_CDのセット<BR>
	  * @param String val
	 */
	public abstract void setT_ODR_PLANT_CD(String val) ; 

	/**
	 * 変数　T_ODR_PLANT_CDのセット<BR>
	  * @param String val
	 */
	public abstract void setT_JOB_ODR_PLANT_CD(String val) ; 

	/**
	 * 変数　CAL_NOのセット<BR>
	  * @param String val
	 */
	public abstract void setCAL_NO(String val) ; 


	/**
	 * 変数　JOB_ODR_DLV_DATE_TIMEのセット<BR>
	  * @param String val
	 */
	public abstract void setJOB_ODR_DLV_DATE_TIME(String val) ; 
	

	/**
	 * 変数　DLV_LOC_CDのセット<BR>
	  * @param String val
	 */
	public abstract void setDLV_LOC_CD(String val) ; 

	/**
	 * 変数　SHIP_CTL_TYPのセット<BR>
	  * @param String val
	 */
	public abstract void setSHIP_CTL_TYP(String val) ; 
	/**
	 * 変数　h_l_JOB_ODR_DLV_DATEのセット<BR>
	  * @param String val
	 */
	public abstract void seth_l_JOB_ODR_DLV_DATE(String val) ; 
	/**
	 * 変数　h_l_JOB_ODR_DLV_TIMEのセット<BR>
	  * @param String val
	 */
	public abstract void seth_l_JOB_ODR_DLV_TIME(String val) ; 
	
	/**
	 * 変数　JOB_ODR_DLV_TIMEのセット<BR>
	  * @param String val
	 */
	public abstract void setJOB_ODR_DLV_TIME(String val) ; 
} 	
