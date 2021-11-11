/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/mstappr/MstStructApprIF.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.mstappr;

/**
 * <pre>
 * マスタ承認インタフェース
 * </pre>
 * @author $Author: xing-qy $
 * @version $Revision: 1.2 $ $Date: 2008/10/23 05:36:53 $
 *
 **/
public abstract interface MstStructApprIF {
	
	
	//	 得意先コード
	public abstract void setCUST_CD(String CUST_CD);
	
	//	納品場所コード
	public abstract void setDLV_LOC_CD(String DLV_LOC_CD);
	
	
	
	
	/**　KA1030用変数　*/
	
	//	 会社コード	
	public abstract void setSYS_COMPANY_CD(String SYS_COMPANY_CD);	
	
	//	 消費税コード
	public abstract void setTAX_CD(String TAX_CD);
	
	//	 自社担当部門コード
	public abstract void setOWN_ORG_CD(String OWN_ORG_CD);
	
	//	 自社担当者コード
	public abstract void setOWN_PERSON_CD(String OWN_PERSON_CD);
	
	//	 通貨コード
	public abstract void setCUR_CD(String CUR_CD);
	
	//	 得意先グループコード
	public abstract void setCUST_GRP_CD(String CUST_GRP_CD);
	
	
	
	/**　KA1040用変数　*/
	
	//	 会社コード
	public abstract void seth_COMPANY_CD(String h_COMPANY_CD);

	//	集結場所コード
	public abstract void setCNCNTRT_DLV_LOC_CD(String CNCNTRT_DLV_LOC_CD);
	
	//	出荷管理先区分
	public abstract void setSHIP_CTL_TYP(String SHIP_CTL_TYP);
	
	//	運送便コード
	public abstract void setTRANSPORT_CD(String TRANSPORT_CD);
	

	
	
	/**　KA1080用変数　*/
	
	//	 会社コード
	public abstract void setCOMPANY_CD(String COMPANY_CD );

	//	 得意先指定納品場所コード
	public abstract void setCUST_DESINATED_DLV_LOC_CD(String CUST_DESINATED_DLV_LOC_CD );
	
	//	 納品場所任意変換値
	public abstract void setDLV_LOC_OPTION_CHANGE_VALUE(String DLV_LOC_OPTION_CHANGE_VALUE );

}
