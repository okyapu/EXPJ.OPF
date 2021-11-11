/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0040/src/com/nec/jp/orteus/metamorBase/KP0040/KP0040B002/CtrlMain.java,v $
 *
 * Copyright (c) 2003-2005 NEC Corporation.
 * Copyright (c) 2003-2005 NEC Informatec Systems,Ltd.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * �e���v���[�g�����F
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 *                     ,EXPLANNER/J�p�ɉ���
 * 3.0.0.0 (2003/12/10),�������ʂ𗘗p�\�ɂ���C��
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.KP0040.KP0040B002;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;

//{{user_implement_dev:import
// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/03 08:53:23 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medKP0040B002 m_med=null;

	/**
	 * control�N���X �C���X�^���X
	 */
	protected interControl m_control=null;

	/**
	 * �R���_�N�^�N���X�C���X�^���X
	 */
	protected BatchAppConductor m_conductor;

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * �������ʃX�e�[�^�X
	 */
	public static int m_status = 0;
	public static int getExecuteStatus() { return m_status; }
	public static void setExecuteStatus(int status) { m_status = status; }

	//////////////////////////////

	/**
	 * CtrlMain�N���X�̃R���X�g���N�^
	 *
		 */
	public CtrlMain(medKP0040B002 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code

	//////////////////////////////
	// �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���
	/** �V�X�e�������敪 */
	private final static String	SYS_PROC_TYP_MI = "0";
	private final static String	SYS_PROC_TYP_SUMI = "1";
	private final static String	SYS_PROC_TYP_NG = "2";
	private final static String	SYS_PROC_TYP_ETC = "9";

	/** EDI ���敪�R�[�h */
	private final static String INFO_TYP_0201  = "0201";	//���v�v����
	private final static String INFO_TYP_0203  = "0203";	//�\�񒍕����
	private final static String INFO_TYP_0501  = "0501";	//�����������
	private final static String INFO_TYP_0502  = "0502";	//�m�蒍�����
	private final static String INFO_TYP_0503  = "0503";	//�ύX�������
	private final static String INFO_TYP_0504  = "0504";	//����������

	/** �N������ */
	private String strBusinessName = null;
	private String strUserId = null;
	private String strPlantCd = null;
	private String strMsgPlantCd = null;

	/** DB�R�l�N�V���� */
	private IDbConnection conn = null;

	private String m_vMSG = "";				//���O�t�@�C���p���b�Z�[�W
	
	private List _msgList = new ArrayList();
	
	/**
	* ���[�O�t�@�C���̃��b�Z�[�W�̎擾
	*
	* @param String strMsgCd		�L�[:SYS�R���g���[���R�[�h
	*
	*/
	private boolean getSysMsg(String strMsgCd) throws BatchAppException{
		boolean rv = true;
		try{
			//�L�[�ݒ�
		
			m_med.setsysBusinessIN_MEG_CD(strMsgCd);
		
			if(m_med.getreadSysBusinessMessage().read() != SUCCESS){
				rv = false;
			}else{
				if(m_med.getreadSysBusinessMessage().next()){
					this.m_vMSG = m_med.getsysBusinessMEG();
				}else{
					throw new Exception();
				}
			}
		} catch (Exception e) {
			rv=false;
		}finally{
			return rv;
		}
	}
	
	/**
	* �G���[/�x�����b�Z�[�W�����p�����N���X�u�n
	*
	*/
	private class msgVO {
		String STATUS;
		String MSSGE_CD;
		String MSSGE;
		String CUST_CD;
		String CUST_ITEM_CD;
		String ITEM_CD;
		String CUST_ODR_NO;
		String CUST_CHRG_PSN_CD;
		String ERR_REC_TYPE;
		String PROC_TYP;
		Double ACTUAL_UNIT_PRICE;
		Double MASTER_UNIT_PRICE;
		Double QTY;
		String ODR_NO;
		String DESINATED_DLV_DATE;
		String SLIP_NO;
		Double IF_CTL_NO;
		Double ODR_SEQ;								// 2004/1/5
	}
	/**
	* �G���[/�x�����b�Z�[�W�ݒ�(�G���[�x�����X�g)
	*
	* @param String status	(E:�G���[/W:�x��)
	* @param String msgCd		(�G���[�R�[�h)
	*/
	private void setErrWngMessage(String status,String msgCd) throws Exception,BatchAppException {
		msgVO ms = new msgVO();
		ms.STATUS = status;
		ms.MSSGE_CD = msgCd;
		ExpjMessage am = new ExpjMessage(msgCd,Integer.toString((m_med.getEdiODR_INFO_IF_CTRL_NO() == null) ? 0 : m_med.getEdiODR_INFO_IF_CTRL_NO().intValue()));
		ms.MSSGE = am.getMessage(CoreTools.getLocale(strUserId));
		if(ms.MSSGE.indexOf("]") != -1){
			ms.MSSGE = ms.MSSGE.substring(ms.MSSGE.indexOf("]") + 1).trim();
		}
		ms.CUST_CD = m_med.getEdiCLIENT_CD();
		ms.CUST_ITEM_CD = m_med.getEdiCUST_ITEM_CD();
		ms.ITEM_CD = null;
		ms.CUST_ODR_NO = null;
		ms.CUST_CHRG_PSN_CD = null;
		ms.ERR_REC_TYPE = null;
		ms.PROC_TYP = m_med.getEdiMODIFICATION_CODE();
		ms.ACTUAL_UNIT_PRICE = null;
		ms.MASTER_UNIT_PRICE = null;
		ms.QTY = null;
		//ms.ODR_NO = m_med.getEdiPLANNING_ODR_CD();
		ms.ODR_NO = null;
		ms.DESINATED_DLV_DATE = null;
		ms.SLIP_NO = "";		//�󒍂ł͐ݒ肵�Ȃ�
		ms.IF_CTL_NO = m_med.getEdiODR_INFO_IF_CTRL_NO();
		ms.ODR_SEQ = null;
		_msgList.add(ms);
	}
	/**
	* �G���[/�x�����b�Z�[�W�������ݏ���(�G���[�x�����X�g)
	*/
	private void writeErrWngMessage() throws Exception,BatchAppException {
		msgVO mv = null;
		String msgCd = "";
		String msgBody = "";
		String msgStatus = "2";
		if(_msgList.size() > 0){
			for(int i = 0 ; i < _msgList.size(); i++){
				mv = (msgVO)_msgList.get(i);
				msgCd += "[" + mv.MSSGE_CD + "]";
				msgBody += "[" + mv.MSSGE + "]";
				if(mv.STATUS.equals("1")){
					msgStatus = mv.STATUS;
				}
			}
			if(!msgCd.equals("")){
				if(m_med.getgetSEQ_ERR_WNG_LST().read() != SUCCESS){
					throw new Exception();
				}
				if(m_med.getgetSEQ_ERR_WNG_LST().next() == false){
					//�G���[�x�����X�g�ԍ��̔ԃG���[
					this.writeLogMessage("KQ00143");
					throw new Exception();
				}
				m_med.seterrMSSGE_CD(msgCd);
				m_med.seterrMSSGE(msgBody);
				m_med.seterrSTATUS(msgStatus);
				m_med.seterrCUST_CD(mv.CUST_CD);
				m_med.seterrCUST_ITEM_CD(mv.CUST_ITEM_CD);
				m_med.seterrITEM_CD(mv.ITEM_CD);
				m_med.seterrCUST_ODR_NO(mv.CUST_ODR_NO);
				m_med.seterrCUST_CHRG_PSN_CD(mv.CUST_CHRG_PSN_CD);
				m_med.seterrERR_REC_TYPE(mv.ERR_REC_TYPE);
				m_med.seterrPROC_TYP(mv.PROC_TYP);
				m_med.seterrACTUAL_UNIT_PRICE(mv.ACTUAL_UNIT_PRICE);
				m_med.seterrMASTER_UNIT_PRICE(mv.MASTER_UNIT_PRICE);
				m_med.seterrQTY(mv.QTY);
				m_med.seterrODR_NO(mv.ODR_NO);
				m_med.seterrDESINATED_DLV_DATE(mv.DESINATED_DLV_DATE);
				m_med.seterrSLIP_NO(mv.SLIP_NO);
				m_med.seterrIF_CTL_NO(mv.IF_CTL_NO);
				//m_med.seterrODR_SEQ(mv.ODR_SEQ);
				int rv = m_med.getwriteErrWngLst().create();
			}
			try {
			conn.commit();
		    } catch (Exception ex) {
				ex.printStackTrace();
			}
			_msgList.clear();
		}
	}
		
	/**
	* �G���[/�x�����b�Z�[�W���O�o�͏���(���ߍ��݂Ȃ�)
	*
	* @param String ���b�Z�[�W�R�[�h
	*/
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException {
		ExpjMessage  am = new ExpjMessage (msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	
	/**
	* �G���[/�x�����b�Z�[�W���O�o�͏���(IF���Ǘ��ԍ����ߍ���)
	*
	* @param String ���b�Z�[�W�R�[�h
	* @param String IF���Ǘ��ԍ�
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException {
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	/**
	* �G���[/�x�����b�Z�[�W���O�o�͕⏕���(���ߍ���)
	*
	* @param String �⏕���
	* @param String �⏕���l
	*/
	private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException {
		AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
		CoreTools.write(am.getMessage());
	}
	
	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
	 */
	public CtrlMain(medKP0040B002 med) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_med = med;
		m_control = new interControl(med);

		// todo: �C���X�^���X���������Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	*/
	public void finalize()
	{
		// �e�����o�ϐ��̏�����
		m_med = null;
		m_control = null;
		objMessage = null;

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	//////////////////////////////

	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException
	{
		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		// �f�t�H���g�A�N�Z�T���\�b�h
		// ������
		
		boolean enterFlg = true;
		boolean termFlg = true;
		String EdiDate[] = new String[31];
		Double EdiQTY[] = new Double[31];
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		Numbering logCd = null;		//���O���ʃR�[�h�̔Ԃ̏���

		// �����󂯎��
		String args[] = m_med.getArgs();

		strBusinessName = args[0];
		strUserId = args[1];
		strPlantCd = args[2];
		strMsgPlantCd = args[2];
		
		try{
			conn = m_conductor.m_transactionConn;
			//�o�b�`�J�n���b�Z�[�W�o�^
			try {
				// �R�l�N�V������n���āA�̔Ԃ̏���
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
				String strMsgCd = "KP04201";
				String strDataString = "(SBM0586)<< �̔����v�v����捞�o�b�`�����J�n >>";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
				} else {
					throw new Exception();
				}
					conn.commit();
			} catch(Exception e) {
				e.printStackTrace();
				throw new Exception();
			}
			
			try{
				//-----------------------------------------------------------------------------
				//		�̔����v�v����捞�o�b�`�����i��������j
				//-----------------------------------------------------------------------------
				int rv = 0;
				int rec = 0;
				try{
					m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
					m_med.setUsername(strUserId);
					
					//======================================
					//��ЃR�[�h�̎擾
					//======================================
					if(m_med.getgetCOMPANY_CD().read() != SUCCESS){
						this.writeLogMessage("KQ00039");
						throw new Exception();
					}
					if(m_med.getgetCOMPANY_CD().next() == false){
						//��ЃR�[�h�擾���s
						this.writeLogMessage("KQ00039");
						throw new Exception();
					}
					if(m_med.getgetCOMPANY_CD().next() == true) {
						//��ЃR�[�h���������������ꍇ���G���[
						this.writeLogMessage("KQ00039");
						m_med.setCOMPANY_CD(null);
						throw new Exception();
					}
					//=======================================
					// �Ώۃf�[�^�̎擾
					//=======================================
					if(m_med.getT_ODR_INFO_EDI_IF().read() != SUCCESS){
						throw new Exception();
					}
					
					for(rec=0; m_med.getT_ODR_INFO_EDI_IF().next(); rec++){
						this.writeLogMessageInfo("ODR_INFO_IF_CTRL_NO",String.valueOf(m_med.getEdiODR_INFO_IF_CTRL_NO().intValue()));
						//=============================================
						// ����I/F�iEDI)�̃V�X�e�������敪���ُ�ɐݒ�
						//=============================================
						m_med.setEdiSYSTEM_PROC_TYP(SYS_PROC_TYP_NG);
						rv = m_med.getT_ODR_INFO_EDI_IF().update();
						conn.commit();
						//========================================
						// ���Ӑ���̎擾
						//========================================
						m_med.setCUST_CD(null);
						m_med.setIN_CUST_CD(m_med.getEdiCLIENT_CD());
						if(m_med.getgetCUSTinfo().read() != SUCCESS){
							throw new Exception();
						}
						if(m_med.getgetCUSTinfo().next() == false){
							//���Ӑ���擾���s
							this.writeLogMessage("KV02205");
							this.writeLogMessageInfo("CLIENT_CD",m_med.getEdiCLIENT_CD());
							this.setErrWngMessage("1","KV02205");
							this.writeErrWngMessage();
							enterFlg = false;
						}
					
						if(m_med.getgetCUSTinfo().next() == true){
							//�������������ꍇ���G���[(���b�Z�[�W�̂݁j
							this.writeLogMessage("KV02205");
							this.writeLogMessageInfo("CLIENT_CD",m_med.getEdiCLIENT_CD());
							this.setErrWngMessage("1","KV02205");
							this.writeErrWngMessage();
							m_med.setCUST_CD(null);
							enterFlg = false;
						}
						//========================================
						//���Ӑ�i�ڏ��̎擾
						//========================================
						m_med.setCUST_ITEM_CD(null);
						m_med.setIN_CUST_ITEM_CD(m_med.getEdiCUST_ITEM_CD());
						if(m_med.getgetITEMinfo().read() != SUCCESS){
							throw new Exception();
						}
						if(m_med.getgetITEMinfo().next() == false){
							//���Ӑ�i�ڏ��擾���s
							this.writeLogMessage("KP04202");
							this.writeLogMessageInfo("CUST_ITEM_CD",m_med.getEdiCUST_ITEM_CD());
							this.setErrWngMessage("1","KP04202");
							this.writeErrWngMessage();
							enterFlg = false;
						}
						if(m_med.getgetITEMinfo().next() == true){
							//�������������ꍇ���G���[
							this.writeLogMessage("KP04202");
							this.writeLogMessageInfo("CUST_ITEM_CD",m_med.getEdiCUST_ITEM_CD());
							this.setErrWngMessage("1","KP04202");
							this.writeErrWngMessage();
							m_med.setCUST_ITEM_CD(null);
							enterFlg = false;
						}
							
						//========================================
						//���Ӑ�[�i�ꏊ���̎擾
						//========================================
						if(m_med.getgetM_CUST_BASEinfoWhenNoC().read() != SUCCESS){
							throw new Exception();
						}
						if(m_med.getgetM_CUST_BASEinfoWhenNoC().next() == false){
							//���Ӑ�[�i�ꏊ���擾���s
							this.writeLogMessage("KP04203");
							this.writeLogMessageInfo("CUST_CD",m_med.getCUST_CD());
							this.setErrWngMessage("1","KP04203");
							this.writeErrWngMessage();
							enterFlg = false;
						}
						/*
						if(m_med.getgetM_CUST_BASEinfoWhenNoC().next() == true){
							//�������������ꍇ���G���[
							this.writeLogMessage("KP04203");
							this.writeLogMessageInfo("CUST_CD",m_med.getCUST_CD());
							m_med.setDLV_LOC_CD(null);
							enterFlg = false;
						}
						*/
						if (enterFlg) {
							//========================================
							// �󒍏�񋤒�IF�ҏW�o��
							//========================================
							m_med.setTERM_DAYS("1");
							m_med.setPLN_TERM_TYP("1");
							
							m_med.setPLN_CD(m_med.getEdiPLANNING_ODR_CD());
							m_med.setCUST_SORT_NO(m_med.getEdiDATA_PROC_CD());
							
							
							boolean mprOdrTypFlg = false;
							
							if(m_med.getMRP_ODR_TYP().equals("4")||m_med.getMRP_ODR_TYP().equals("5")||m_med.getMRP_ODR_TYP().equals("6")||m_med.getMRP_ODR_TYP().equals("7")){
								mprOdrTypFlg = true;
							}
							
							if(mprOdrTypFlg) {
								m_med.setADD_TO_OD_FLG("1");
							} else {
								m_med.setADD_TO_OD_FLG("0");
							}
							
							//�[������є[���w�����ʂ̊i�[
							EdiDate[0] =	m_med.getEdiSCDL_DLV_DATE_1();
							EdiQTY[0] =		m_med.getEdiSCDL_DLV_QTY_1();
							EdiDate[1] =	m_med.getEdiSCDL_DLV_DATE_2();
							EdiQTY[1] =		m_med.getEdiSCDL_DLV_QTY_2();
							EdiDate[2] =	m_med.getEdiSCDL_DLV_DATE_3();
							EdiQTY[2] =		m_med.getEdiSCDL_DLV_QTY_3();
							EdiDate[3] =	m_med.getEdiSCDL_DLV_DATE_4();
							EdiQTY[3] =		m_med.getEdiSCDL_DLV_QTY_4();
							EdiDate[4] =	m_med.getEdiSCDL_DLV_DATE_5();
							EdiQTY[4] =		m_med.getEdiSCDL_DLV_QTY_5();
							EdiDate[5] =	m_med.getEdiSCDL_DLV_DATE_6();
							EdiQTY[5] =		m_med.getEdiSCDL_DLV_QTY_6();
							EdiDate[6] =	m_med.getEdiSCDL_DLV_DATE_7();
							EdiQTY[6] =		m_med.getEdiSCDL_DLV_QTY_7();
							EdiDate[7] =	m_med.getEdiSCDL_DLV_DATE_8();
							EdiQTY[7] =		m_med.getEdiSCDL_DLV_QTY_8();
							EdiDate[8] =	m_med.getEdiSCDL_DLV_DATE_9();
							EdiQTY[8] =		m_med.getEdiSCDL_DLV_QTY_9();
							EdiDate[9] =	m_med.getEdiSCDL_DLV_DATE_10();
							EdiQTY[9] =		m_med.getEdiSCDL_DLV_QTY_10();
							EdiDate[10] =	m_med.getEdiSCDL_DLV_DATE_11();
							EdiQTY[10] =	m_med.getEdiSCDL_DLV_QTY_11();
							EdiDate[11] =	m_med.getEdiSCDL_DLV_DATE_12();
							EdiQTY[11] =	m_med.getEdiSCDL_DLV_QTY_12();
							EdiDate[12] =	m_med.getEdiSCDL_DLV_DATE_13();
							EdiQTY[12] =	m_med.getEdiSCDL_DLV_QTY_13();
							EdiDate[13] =	m_med.getEdiSCDL_DLV_DATE_14();
							EdiQTY[13] =	m_med.getEdiSCDL_DLV_QTY_14();
							EdiDate[14] =	m_med.getEdiSCDL_DLV_DATE_15();
							EdiQTY[14] =	m_med.getEdiSCDL_DLV_QTY_15();
							EdiDate[15] =	m_med.getEdiSCDL_DLV_DATE_16();
							EdiQTY[15] =	m_med.getEdiSCDL_DLV_QTY_16();
							EdiDate[16] =	m_med.getEdiSCDL_DLV_DATE_17();
							EdiQTY[16] =	m_med.getEdiSCDL_DLV_QTY_17();
							EdiDate[17] =	m_med.getEdiSCDL_DLV_DATE_18();
							EdiQTY[17] =	m_med.getEdiSCDL_DLV_QTY_18();
							EdiDate[18] =	m_med.getEdiSCDL_DLV_DATE_19();
							EdiQTY[18] =	m_med.getEdiSCDL_DLV_QTY_19();
							EdiDate[19] =	m_med.getEdiSCDL_DLV_DATE_20();
							EdiQTY[19] =	m_med.getEdiSCDL_DLV_QTY_20();
							EdiDate[20] =	m_med.getEdiSCDL_DLV_DATE_21();
							EdiQTY[20] =	m_med.getEdiSCDL_DLV_QTY_21();
							EdiDate[21] =	m_med.getEdiSCDL_DLV_DATE_22();
							EdiQTY[21] =	m_med.getEdiSCDL_DLV_QTY_22();
							EdiDate[22] =	m_med.getEdiSCDL_DLV_DATE_23();
							EdiQTY[22] =	m_med.getEdiSCDL_DLV_QTY_23();
							EdiDate[23] =	m_med.getEdiSCDL_DLV_DATE_24();
							EdiQTY[23] =	m_med.getEdiSCDL_DLV_QTY_24();
							EdiDate[24] =	m_med.getEdiSCDL_DLV_DATE_25();
							EdiQTY[24] =	m_med.getEdiSCDL_DLV_QTY_25();
							EdiDate[25] =	m_med.getEdiSCDL_DLV_DATE_26();
							EdiQTY[25] =	m_med.getEdiSCDL_DLV_QTY_26();
							EdiDate[26] =	m_med.getEdiSCDL_DLV_DATE_27();
							EdiQTY[26] =	m_med.getEdiSCDL_DLV_QTY_27();
							EdiDate[27] =	m_med.getEdiSCDL_DLV_DATE_28();
							EdiQTY[27] =	m_med.getEdiSCDL_DLV_QTY_28();
							EdiDate[28] =	m_med.getEdiSCDL_DLV_DATE_29();
							EdiQTY[28] =	m_med.getEdiSCDL_DLV_QTY_29();
							EdiDate[29] =	m_med.getEdiSCDL_DLV_DATE_30();
							EdiQTY[29] =	m_med.getEdiSCDL_DLV_QTY_30();
							EdiDate[30] =	m_med.getEdiSCDL_DLV_DATE_31();
							EdiQTY[30] =	m_med.getEdiSCDL_DLV_QTY_31();


							//�[���P�`�R�P�̃��[�v
							for(int i = 0; i < 31; i++){
								enterFlg =true;
								termFlg =(Integer.parseInt(EdiDate[i]) >= 000101 && Integer.parseInt(EdiDate[i]) <= 991231);
								
								if(termFlg != true){
									//�Ώۊ��Ԃ̎w�肪�s���ł��B
									this.writeLogMessage("ZZ05101");
									this.writeLogMessageInfo("EdiSCDL_DLV_DATE_"+(i+1),EdiDate[i]);
									this.setErrWngMessage("1","ZZ05101");
									this.writeErrWngMessage();
									enterFlg = false;
								}
								if (!(EdiDate[i] == null || "".equals(EdiDate[i])) &&
									termFlg
								){
									m_med.setPLN_STR_DATE(EdiDate[i]);
									m_med.setPLN_END_DATE(EdiDate[i]);
									m_med.setPLN_QTY(EdiQTY[i]);
									
									if(m_med.getcheckPLN_STR_DATE().read() != SUCCESS){
										//�Ώۊ��Ԃ̎w�肪�s���ł��B
										this.writeLogMessage("ZZ05101");
										this.writeLogMessageInfo("EdiSCDL_DLV_DATE_"+(i+1),EdiDate[i]);
										this.setErrWngMessage("1","ZZ05101");
										this.writeErrWngMessage();
										enterFlg = false;
									}
									if(m_med.getcheckPLN_STR_DATE().next() != false){
										//�v����Ԃɏd��������܂��B
										this.writeLogMessage("KP00001");
										this.writeLogMessageInfo("EdiSCDL_DLV_DATE_"+(i+1),EdiDate[i]);
										this.setErrWngMessage("1","KP00001");
										this.writeErrWngMessage();
										enterFlg = false;
									}
								}
								
								if(enterFlg == true) {
									//======================================
									//	�̔����v�v��ԍ��̎擾
									//======================================
									if(m_med.getgetSEQ_SALES_PLAN_CD().read() != SUCCESS){
										this.writeLogMessage("KP00003");
										throw new Exception();
									}
									if(m_med.getgetSEQ_SALES_PLAN_CD().next() == false){
										//�̔����v�v��ԍ��擾���s
										this.writeLogMessage("KP00003");
										throw new Exception();
									}
									//=======================================
									// �̔����v�v��ɍs��ǉ�����
									//=======================================
									rv = m_med.getinsertT_SALES_PLAN().create();
									conn.commit();
									//=============================================
									// �̔����v�v��I/F�iEDI)�̃V�X�e�������敪�������ςɐݒ�
									//=============================================
									m_med.setEdiSYSTEM_PROC_TYP(SYS_PROC_TYP_SUMI);
									rv = m_med.getT_ODR_INFO_EDI_IF().update();
									conn.commit();
									// =========================================
									// ���탍�O���o�͂��A���̃t�@�C������������
									// =========================================
									this.writeLogMessage("KP04207");
									this.writeLogMessageInfo("TotalRecord",Integer.toString(rec));
								}
							}
						}
					}
				} catch(Exception e) {
					try {
					conn.rollback();
					e.printStackTrace();
					// =========================================
					// �G���[���O���o�͂��A���̃��R�[�h����������
					// =========================================
					this.writeLogMessage("KP04206");
					this.writeLogMessageInfo("ErrorRecord",Integer.toString(rec+1));
					
					// �R�l�N�V������n���āA�̔Ԃ̏���
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// �̔����v�v����捞�o�b�`�����ɂĒv���I�G���[���������܂����B
					String strMsgCd = "KP04204";
					String strDataString = "LINE=" + (rec + 1);
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG);
					} else {
						throw new Exception();
					}
					conn.commit();
				    } catch (SQLException ex) {
					ex.printStackTrace();
				    } catch (FoundationException ex) {
					ex.printStackTrace();
				    }
				}
			
			//-----------------------------------------------------------------------------
			//		�̔����v�v����捞�o�b�`�����i�����܂Łj
			//-----------------------------------------------------------------------------
			} catch (Exception e) {
				try {
					conn.rollback();
					e.printStackTrace();
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// �̔����v�v����捞�o�b�`�����ɂĒv���I�G���[���������܂����B
					String strMsgCd = "KP04204";
					String strDataString = "(SBM0587)<< �̔����v�v����捞�o�b�`�ُ팟�o >>";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsg.setData(strDataString);
					businessMsgAcc.add(businessMsg);
					
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG);
					} else{
						throw new Exception();
					}
					conn.commit();
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
		} catch (Exception e) {
			try {
				conn.rollback();
				e.printStackTrace();
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// �̔����v�v����捞�o�b�`�����ɂĒv���I�G���[���������܂����B
				String strMsgCd = "KP04204";
				String strDataString = "(SBM0587)<< �̔����v�v����捞�o�b�`�ُ팟�o >>";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				}
				conn.commit();
			} catch (SQLException ex) {
				ex.printStackTrace();
			} catch (FoundationException ex) {
				ex.printStackTrace();
			}
		} finally {
			//�o�b�`�I�����b�Z�[�W�o�^
			// �R�l�N�V������n���āA�̔Ԃ̏���
			try {
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
				String strMsgCd = "KP04205";
				String strDataString = "(SBM0588)<< �̔����v�v����捞�o�b�`�����I�� >>";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
				}
				conn.commit();
			} catch (SQLException ex) {
				ex.printStackTrace();
			} catch (FoundationException ex) {
				ex.printStackTrace();
			}
		}
		return BREAK;
	}


	//////////////////////////////

	/**
	 * object�^��Ԃ��܂�
	 *
	 * @return object�^
	 */
	public int getType()
	{
		return m_control.getType();
	}

	/**
	 * ��������
	 *
	 * @return <<�R�����g���L�q���Ă�������>>
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int beginProc() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		return m_control.beginProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int endProc() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		return m_control.endProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int execute() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		// �������ʂ����^�[���l�Ƃ������Ƃ��͂����Őݒ肵�܂��B
		// setExecuteStatus(0);

		return m_control.execute();
	}

        //}}user_implement_code

	//{{control_class(wizard code)

	//////////////////////////////

	class interControl
		implements IBatchAppCommon
	{

		//////////////////////////////

		/**
		 * mediator�N���X �C���X�^���X
		 */
		public medKP0040B002 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKP0040B002 med) throws BatchAppException
		{
			// �e�����o�ϐ��̏�����
			m_med = med;

			try {
				m_container = new ManageContainer();
			} catch(FoundationException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "constractor", "DB�ւ̐ڑ��Ɏ��s���܂���");
			}
			return;
		}

		protected void finalize()
		{
			m_med = null;
			return;
		}

		//////////////////////////////



		//////////////////////////////

		public int getType()
		{
			return TYPE_CONTROL;
		}

		public int beginProc() throws BatchAppException
		{
			return IBatchAppCommon.SUCCESS;
		}

		public int endProc() throws BatchAppException
		{
			int ret;

			return IBatchAppCommon.SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret;

			try {
				if((ret=main())!=IBatchAppCommon.SUCCESS ) return ret;
			} catch(Exception ex) {
				throw new BatchAppException("CtrlMain", "execute", "execute�̏����Ɏ��s���܂���");
			}

			return IBatchAppCommon.SUCCESS;
		}

		public void commit() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().commit();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "commit", "DB�ւ̃R�~�b�g���Ɏ��s���܂���(SQLException)");
			}

			return;
		}

		public void rollback() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().rollback();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "rollback", "DB�ւ̃��[���o�b�N���Ɏ��s���܂���(SQLException)");
			}

			return;
		}

		//////////////////////////////

	}

	//}}control_class(wizard code)

}
