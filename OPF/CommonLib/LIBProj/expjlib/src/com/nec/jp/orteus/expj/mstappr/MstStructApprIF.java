/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/mstappr/MstStructApprIF.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.mstappr;

/**
 * <pre>
 * �}�X�^���F�C���^�t�F�[�X
 * </pre>
 * @author $Author: xing-qy $
 * @version $Revision: 1.2 $ $Date: 2008/10/23 05:36:53 $
 *
 **/
public abstract interface MstStructApprIF {
	
	
	//	 ���Ӑ�R�[�h
	public abstract void setCUST_CD(String CUST_CD);
	
	//	�[�i�ꏊ�R�[�h
	public abstract void setDLV_LOC_CD(String DLV_LOC_CD);
	
	
	
	
	/**�@KA1030�p�ϐ��@*/
	
	//	 ��ЃR�[�h	
	public abstract void setSYS_COMPANY_CD(String SYS_COMPANY_CD);	
	
	//	 ����ŃR�[�h
	public abstract void setTAX_CD(String TAX_CD);
	
	//	 ���ВS������R�[�h
	public abstract void setOWN_ORG_CD(String OWN_ORG_CD);
	
	//	 ���ВS���҃R�[�h
	public abstract void setOWN_PERSON_CD(String OWN_PERSON_CD);
	
	//	 �ʉ݃R�[�h
	public abstract void setCUR_CD(String CUR_CD);
	
	//	 ���Ӑ�O���[�v�R�[�h
	public abstract void setCUST_GRP_CD(String CUST_GRP_CD);
	
	
	
	/**�@KA1040�p�ϐ��@*/
	
	//	 ��ЃR�[�h
	public abstract void seth_COMPANY_CD(String h_COMPANY_CD);

	//	�W���ꏊ�R�[�h
	public abstract void setCNCNTRT_DLV_LOC_CD(String CNCNTRT_DLV_LOC_CD);
	
	//	�o�׊Ǘ���敪
	public abstract void setSHIP_CTL_TYP(String SHIP_CTL_TYP);
	
	//	�^���փR�[�h
	public abstract void setTRANSPORT_CD(String TRANSPORT_CD);
	

	
	
	/**�@KA1080�p�ϐ��@*/
	
	//	 ��ЃR�[�h
	public abstract void setCOMPANY_CD(String COMPANY_CD );

	//	 ���Ӑ�w��[�i�ꏊ�R�[�h
	public abstract void setCUST_DESINATED_DLV_LOC_CD(String CUST_DESINATED_DLV_LOC_CD );
	
	//	 �[�i�ꏊ�C�ӕϊ��l
	public abstract void setDLV_LOC_OPTION_CHANGE_VALUE(String DLV_LOC_OPTION_CHANGE_VALUE );

}
