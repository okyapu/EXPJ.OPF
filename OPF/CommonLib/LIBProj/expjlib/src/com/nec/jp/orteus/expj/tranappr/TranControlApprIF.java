/*	
* $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/tranappr/TranControlApprIF.java,v $	
	
*	
* Copyright (c) 2003-2004 NEC Corporation.	
* Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.	
*/	
package com.nec.jp.orteus.expj.tranappr;	
	
import java.util.List;	
import com.nec.jp.orteus.xaf.foundation.IDbConnection;	
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.msg.util.Business;	
import com.nec.jp.orteus.expj.systemlog.SystemLog;	
import com.nec.jp.orteus.expj.util.MessageStruct;	
	
/**	
 * <pre>	
 * �g�������F�C���^�t�F�[�X	
 * </pre>	
 * @author $Author: wang-derui $	
 * @version $Revision: 1.1 $ $Date: 2008/10/20 08:53:03 $	
 *	
 **/	
public abstract interface TranControlApprIF {	
	
	
	/**
	 * Struct�̒l�̃Z�b�g���܂�<BR>
	 * @param TranStructApprIF tempstruct
	 */
	public abstract void setApprStruct(TranStructApprIF tempstruct) ; 
	
	/**
	 * conn�̃Z�b�g<BR>
	 * @param IDbConnection conn
	 */
	public abstract void setConn(IDbConnection conn) ; 
	
	/**
	 * Business�I�u�W�F�N�g�A�N�Z�T���\�b�h<BR>
	 * @param Business business
	 */
	public abstract void setBusiness(Business business) ; 
	
	/**
	 * ���b�Z�[�W�X�g���N�g�쐬�i������Ή��j<BR>
	 */
	public abstract void createMsgStruct() ; 
	
	/**
	 * ���F�҂̃Z�b�g<BR>
	 * @param String apprBy
	 */
	public abstract void setAPPR_BY(String apprBy) ; 
	
	/**
	 * ���F���t�̃Z�b�g<BR>
	 * @param String apprDate
	 */
	public abstract void setAPPR_DATE(String apprDate) ; 
	
	/**
	 * ���b�Z�[�W�X�g���N�g<BR>
	 * @return MessageStruct
	 */
	public abstract MessageStruct getMsgStruct() ; 
	
	/**
	 * �V�X���O<BR>
	 * @param SystemLog sysLog
	 */
	public abstract void setSysLog(SystemLog sysLog) ; 
	
	/**
	 * ���X�g�̃Z�b�g<BR>
	 * @param List list
	 */
	public abstract void setList(List list) ; 
	
	//1/2�I��
	
	/**
	 * Ja�m��󒍏��F�̃Q�b�g<BR>
	 * @param String aprJaOdr
	 */
	public abstract void set_APR_JA_ODR(String aprJaOdr) ; 
	
	/**
	 * Ja�����󒍏��F<BR>
	 * @param String aprJaUncnfmOdr
	 */
	public abstract void set_APR_JA_UNCNFM_ODR(String aprJaUncnfmOdr) ; 
	
	//KQ1070010Control
	
	/**
	 * ���[�U�R�[�h<BR>
	 * @param String sysUSER_CD
	 */
	public abstract void setsysUSER_CD(String sysUSER_CD) ; 
	
	/**
	 * ���[�U��<BR>
	 * @param String sysUSER_NAME
	 */
	public abstract void setsysUSER_NAME(String sysUSER_NAME) ; 
	
	/**
	 * �H��R�[�h<BR>
	 * @param String sysPLANT_CD
	 */
	public abstract void setsysPLANT_CD(String sysPLANT_CD) ; 
	
	/**
	 * �H�ꖼ   <BR>
	 * @param String sysPLANT_NAME
	 */
	public abstract void setsysPLANT_NAME(String sysPLANT_NAME) ; 
	
	/**
	 * �Ɩ�ID<BR>
	 * @param String ScreenId
	 */
	public abstract void setScreenId(String ScreenId) ; 
	
	/**
	 * <BR>
	 */
	public abstract void controlInsert()throws BusinessProcessException, FoundationException ; 
	
	/**
	 * <BR>
	 */
	public abstract void controlUpdate()throws BusinessProcessException, FoundationException ; 
	
	/**
	 * <BR>
	 */
	public abstract void controlDelete()throws BusinessProcessException, FoundationException ; 
	
	//KQ1080010Control
	
	/**
	 * ��ЃR�[�h<BR>
	 * @param String COMPANY_CD
	 */
	public abstract void setCOMPANY_CD(String COMPANY_CD) ; 
	
	/**
	 * ����l�ݒ�m�F�L���t���O<BR>
	 * @param String EST_CONF_SET_FLG
	 */
	public abstract void setEST_CONF_SET_FLG(String EST_CONF_SET_FLG) ; 
	
	/**
	 * �Ɩ����t<BR>
	 * @param String BUSINESSOPRDATE
	 */
	public abstract void setBUSINESSOPRDATE(String BUSINESSOPRDATE) ; 
	
	//KQ1090010Control
	
	//KQ1130010Control
	
	/**
	 * ���ЃR�[�h<BR>
	 * @param String MyCompanyCd
	 */
	public abstract void setMyCompanyCd(String MyCompanyCd) ; 
	
	/**
	 * �̔��Ǘ��H��R�[�h<BR>
	 * @param String MpSalesPlantCd
	 */
	public abstract void setMpSalesPlantCd(String MpSalesPlantCd) ; 
	
	/**
	 * �Ɩ��^�p��<BR>
	 * @param String BusinessOprDate
	 */
	public abstract void setBusinessOprDate(String BusinessOprDate) ; 
	
	/**
	 * ����l�ݒ�m�F�L���t���O<BR>
	 * @param String EstConfSetFlg
	 */
	public abstract void setEstConfSetFlg(String EstConfSetFlg) ; 
	
	/**
	 * �o�׎w�����<BR>
	 * @param String ShipOdrCnd
	 */
	public abstract void setShipOdrCnd(String ShipOdrCnd) ; 
	
	//KQ1140010Control
	
	/**
	 * ���Џ��<BR>
	 * @param String _myCompanyCode
	 */
	public abstract void set_myCompanyCode(String _myCompanyCode) ; 
	
	/**
	 * �Ɩ��^�p��<BR>
	 * @param String _businessOprDate
	 */
	public abstract void set_businessOprDate(String _businessOprDate) ; 

	/**
	 * ���Џ��<BR>
	 * @param String _plantCd
	 */
	public abstract void set_plantCd(String _plantCd) ; 

	/**
	 * �����Ǘ��ԍ�,�ҏW�\�t���O,�X�V���ێ��p�z�� <BR>
	 * @param String dayArrayList[][]
	 */
	public abstract void set_dayArrayList(String dayArrayList[][]) ; 

} 	
