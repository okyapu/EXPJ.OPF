/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B002/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B002;

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
//-----------------------------------------------------------------------------
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
// import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
// import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/03 08:55:49 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2003/11/29),�V�K�쐬
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medKV0020B002 m_med=null;

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
	public CtrlMain(medKV0020B002 med, BatchAppConductor cdr) throws BatchAppException
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
       //-----------------------------------------------------------------------------
        /** �����敪�l */
       //	private final static String ODR_TYP_MIKOMI = "1";
        private final static String ODR_TYP_NAIJI = "2";
        private final static String ODR_TYP_KAKUTEI = "3";
       
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
       
        /** �V�X�e���p�����[�^�ǂݏo���L�[ */
        private final static String	SYSCLASS_UNIT_CD = "EIAJ_UNIT_CD";
        private final static String	SYSCLASS_CUR_CD = "EIAJ_CUR_CD";
        private final static String	SYSCLASS_CORP_CD = "UNIFIED_CORP_CD";
       //	private final static String	SYSCLASS_MATSUSHITA = "MATSUSHITA";
       
        /** �N������ */
        private String strBusinessName = null;
        private String strUserId = null;
        private String strPlantCd = null;
        private String strMsgPlantCd = null;
       
        /** DB�R�l�N�V���� */
           private IDbConnection conn = null;
       
        private String m_vMSG = "";				//���O�t�@�C���p���b�Z�[�W
       
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
         }catch (Exception e) {
          rv=false;
         }finally{
          return rv;
         }
        }
        /**
         * �G���[/�x�����b�Z�[�W���O�o�͏���(���ߍ��݂Ȃ�)
         *
         * @param String ���b�Z�[�W�R�[�h
         */
        private void writeLogMessage(String msgCd) throws Exception,BatchAppException
        {
         ExpjMessage am = new ExpjMessage(msgCd);
         CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
       
        }
        /**
         * �G���[/�x�����b�Z�[�W���O�o�͏���(IF���Ǘ��ԍ����ߍ���)
         *
         * @param String ���b�Z�[�W�R�[�h
         * @param String IF���Ǘ��ԍ�
         */
        private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException
        {
         AlarmMessage am = new AlarmMessage(msgCd,if_no);
         CoreTools.write(am.getMessage());
       
        }
        /**
         * �G���[/�x�����b�Z�[�W���O�o�͕⏕���(���ߍ���)
         *
         * @param String �⏕���
         * @param String �⏕���l
         */
        private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException
        {
         AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
         CoreTools.write(am.getMessage());
       
        }
       //-----------------------------------------------------------------------------
       
        /**
         * CtrlMain�N���X�̕W���R���X�g���N�^
         *
         * @return �Ȃ�
         */
        public CtrlMain(medKV0020B002 med) throws BatchAppException
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
         * @param �Ȃ�
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
       //-----------------------------------------------------------------------------
       
         // �f�t�H���g�A�N�Z�T���\�b�h
              // ������
               int rec = 0;
               
         BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
         BusinessMessage businessMsg = new BusinessMessage();
       
         Numbering logCd = null;		//���O���ʃR�[�h�̔Ԃ̏���
         
         // �Ɩ����b�N
         int lockCancelKey = -1;		//���b�N�L�����Z���L�[�̏���
         BusinessLock lock = null;	//���b�N����
       
         // �����󂯎��
         String args[] = m_med.getArgs();
       
         strBusinessName = args[0];
         strUserId = args[1];;
         strPlantCd = args[2];
         strMsgPlantCd = args[2];
       
         // �p�����[�^�m�F
       
       
       
         try{
          conn = m_conductor.m_transactionConn;
          //�o�b�`�J�n���b�Z�[�W�o�^
          try {
          	
            // �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
            businessMsgAcc.init(conn);
            businessMsg.setBusinessOperatingName(strBusinessName);
            businessMsg.setUser(strUserId);
            businessMsg.setPlantCode(strMsgPlantCd);
          	
            // �R�l�N�V������n���āA�̔Ԃ̏���
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            businessMsg.setLogCode(logCd.getNo());
          	
			// �Ɩ����b�N���s
			lock = new BusinessLock(conn, strUserId,strPlantCd);
			lockCancelKey = lock.doLock(m_med.getProgname());
			if ( lockCancelKey == -1) {
				// �Ɩ����b�Z�[�W�ǉ�
				String strMsgCd = "ZZ01001";
				businessMsg.setMessageCode(strMsgCd);
				businessMsgAcc.add(businessMsg);
				
				return BREAK;
			}
          	
			// �Ɩ����b�Z�[�W�ǉ�
			String strMsgCd = "KV02201";
			String strDataString = "(SBM0610)<< ����IF(EDI)�ϊ��o�b�`�����J�n >>";
			//kis businessMsg.setLogCode("a" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
			businessMsg.setMessageCode(strMsgCd);
			businessMsg.setData(strDataString);
			businessMsgAcc.add(businessMsg);
			if(this.getSysMsg(strMsgCd)){
				CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
			}else{
				throw new Exception();
			}
			conn.commit();
          }catch(Exception e) {
           e.printStackTrace();
           throw new Exception();
          }
          try{
           CoreTools.write("\n(SBM1246)******>>>> ����IF(EDI)�ϊ��Ώۃf�[�^�擾�X�^�[�g <<<******");
       //����������������������������������������������������������������������������������������������������������������������������������������������
       //-----------------------------------------------------------------------------
       //		����IF(EDI)�ϊ������i��������j
       //-----------------------------------------------------------------------------
       
           m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
           m_med.setUsername(strUserId);
           //=======================================
           // �o�b�`�p�H��R�[�h
           //=======================================
           if(m_med.getSYS_CLASS_CODE().read() != SUCCESS){
            throw new Exception();
           }else if(m_med.getSYS_CLASS_CODE().next() == false){
            //�o�b�`�p�H��R�[�h�擾���s
            this.writeLogMessage("KQ00153");
            throw new Exception();
           }
           CoreTools.write("BATCH PLANT_CD=" + m_med.getbtPLANT_CD());
           
           //=======================================
           // �Ɩ����t�擾
           //=======================================
           if(m_med.getBatchGyomuDate().read() != SUCCESS){
            throw new Exception();
           }else if(m_med.getBatchGyomuDate().next() == false){
            //�Ɩ����t�擾���s
            this.writeLogMessage("KV02204");
            throw new Exception();
           }
           CoreTools.write("BUSINESS_OPR_DATE=" + m_med.getbtBUSINESS_OPR_DATE());
       
           //=======================================
           // ���{�~�ʉ݃R�[�h�擾
           //=======================================
           if(m_med.getJpCurrency().read() != SUCCESS){
            throw new Exception();
           }else if(m_med.getJpCurrency().next() == false){
            //�ʉ݃R�[�h�擾���s
            this.writeLogMessage("KV02208");
            throw new Exception();
           }
           CoreTools.write("JP_CUR=" + m_med.getstrJP_CUR());
           
           //=======================================
           // �Ώۃf�[�^�̎擾
           //=======================================
           if(m_med.getT_ODR_INFO_EDI_IF().read() != SUCCESS){
            throw new Exception();
           }
           for(rec=0; m_med.getT_ODR_INFO_EDI_IF().next(); rec++ ){
            try{
             CoreTools.write("----------------------------------------");
             this.writeLogMessageInfo("ODR_INFO_IF_CTRL_NO",String.valueOf(m_med.getEdiODR_INFO_IF_CTRL_NO().intValue()));
             //=======================================
             // ����I/F�iEDI)�̃V�X�e�������敪���ُ�ɐݒ�
             //=======================================
             m_med.setEdiSYSTEM_PROC_TYP(SYS_PROC_TYP_NG);
             int rv = m_med.getT_ODR_INFO_EDI_IF().update();
             conn.commit();
       
             //========================================
             // ���Ӑ���̎擾
             //========================================
             m_med.setcustCUST_CD(null);
             m_med.setcustCUR_CD(null);
             m_med.setcustEDI_CUST_VEND_CD(m_med.getEdiCLIENT_CD());
             if(m_med.getM_CUST().read() != SUCCESS){
              throw new Exception();
             }else {
              if(m_med.getM_CUST().next() == false){
               //���Ӑ���擾���s(���b�Z�[�W�̂݁j
               this.writeLogMessage("KV02205");
               this.writeLogMessageInfo("CLIENT_CD",m_med.getEdiCLIENT_CD());
              }
              if(m_med.getM_CUST().next() == true){
               //�������������ꍇ���G���[(���b�Z�[�W�̂݁j
               this.writeLogMessage("KV02205");
               this.writeLogMessageInfo("CLIENT_CD",m_med.getEdiCLIENT_CD());
               m_med.setcustCUST_CD(null);
               m_med.setcustCUR_CD(null);
              }
             }
             if (m_med.getcustCUR_CD() == null) {
              m_med.setcustCUR_CD(m_med.getstrJP_CUR());
             }
       
             //========================================
             // �����敪�̃`�F�b�N
             //========================================
             if ( m_med.getEdiINSPC_TYP() == null ||
            	  m_med.getEdiINSPC_TYP().length() > 2 || 
            	  !Calculate.isInteger(m_med.getEdiINSPC_TYP())){
            	 //�����敪�s���l(���b�Z�[�W�̂݁j
                 this.writeLogMessage("KV22077");
                 this.writeLogMessageInfo("INSPC_TYP",m_med.getEdiINSPC_TYP());         	 
            	 m_med.setEdiINSPC_TYP(null);
             }             
             
             //========================================
             // �󒍏�񋤒�IF�ҏW�o��
             //========================================
             //������񋤒�I/F�Ǘ��ԍ��@���@�������I/F�Ǘ��ԍ�
             m_med.setODR_INFO_COM_IF_CTRL_NO(m_med.getEdiODR_INFO_IF_CTRL_NO());
             //����������
             m_med.setODR_ACPT_PROC_ODR(null);					
             //�����敪
             if(this.INFO_TYP_0201.equals(m_med.getEdiINFO_TYP_CD()) ||
              this.INFO_TYP_0203.equals(m_med.getEdiINFO_TYP_CD()) || 
              this.INFO_TYP_0501.equals(m_med.getEdiINFO_TYP_CD())){
              //����
              m_med.setODR_TYP(this.ODR_TYP_NAIJI);
             }else if(this.INFO_TYP_0502.equals(m_med.getEdiINFO_TYP_CD())){
              //�m��
              m_med.setODR_TYP(this.ODR_TYP_KAKUTEI);
             }else{
              //��L�ȊO
              m_med.setODR_TYP("0");
             }
             //���敪�R�[�h
             m_med.setINFO_TYP_CD(m_med.getEdiINFO_TYP_CD());
             //���Ӑ撍���ԍ�
             if(this.INFO_TYP_0201.equals(m_med.getEdiINFO_TYP_CD()) ||
              this.INFO_TYP_0203.equals(m_med.getEdiINFO_TYP_CD())) {
              //sww�폜20040727�J�n
              //|| this.INFO_TYP_0501.equals(m_med.getEdiINFO_TYP_CD())){
              //sww�폜20040727�I��
              m_med.setCUST_ODR_NO(m_med.getEdiUNCONFIRM_ODR_CD());
             } else {
              m_med.setCUST_ODR_NO(m_med.getEdiPUCH_ODR_CD());
             }
             //�󒍓�
             m_med.setODR_ACPT_DATE(m_med.getbtBUSINESS_OPR_DATE());
             //���Ӑ�R�[�h
             m_med.setCUST_CD(m_med.getcustCUST_CD());
             //��������R�[�h
             m_med.setBUYER_ORG_CD(m_med.getEdiBUYER_ORG_CD());
             //���Ӑ�i�ڔԍ�
             m_med.setCUST_ITEM_CD(m_med.getEdiCUST_ITEM_CD());
             //�i��
             m_med.setPART_NAME(m_med.getEdiPART_NAME());
             //�����敪
             m_med.setPROC_TYP(m_med.getEdiMODIFICATION_CODE());
             //�R�b�N�敪
             m_med.setCOCK_TYP(m_med.getEdiCOCK_TYP());
             //�P��
             m_med.setUNIT_CD(m_med.getEdiUNIT());
             //�ϊ��O�P��
             m_med.setUNIT_CD_ORG(m_med.getEdiUNIT());
             //�P��
             m_med.setUNIT_COST(m_med.getEdiUNIT_PRICE());
             //�P���敪
             m_med.setUNIT_COST_TYP(m_med.getEdiPRICE_TYP());
             //�w��[�� ���̃��W�b�N�Őݒ�
             //�������� ���̃��W�b�N�Őݒ�
             //����������
             m_med.setPUCH_ODR_QTY_TOTAL(m_med.getEdiPUCH_ODR_QTY());
             //�׎p
             m_med.setPKG_UNIT(m_med.getEdiPKG_UNIT());
             //�w���S��
             m_med.setBUYER_NAME(m_med.getEdiBUYER_NAME());
             //�����敪
             m_med.setINSPC_TYP(m_med.getEdiINSPC_TYP());
             //�[�i�ꏊ�R�[�h
             m_med.setDLV_LOC_CD(m_med.getEdiDLV_LOC_CD());
             //��n�ꏊ�R�[�h
             m_med.setDLV_LOC_CD_EIAJ(m_med.getEdiDLV_LOC_CD());
             //��n�ꏊ���i�����j
             m_med.setDLV_LOC_NAME_KANJI(m_med.getEdiDLV_LOC_NAME_KANJI());
             //�[��NO ���̃��W�b�N�Őݒ�
             //�[�i�L�[�ԍ� ���̃��W�b�N�Őݒ�
             //���R�g�p��
             m_med.setFREE_REMARK(m_med.getEdiFREE_TEXT());
             //���l
             m_med.setREMARK(m_med.getEdiREMARKS());
             //�����җp�o�[�R�[�h���
             m_med.setCLIENT_BARCODE_INF(m_med.getEdiCLIENT_BARCODE_INF());
             //�����җp���l�@���@�����җp���l
             m_med.setCLIENT_REMARK(m_med.getEdiCLIENT_REMARK());
             //�����җp���l(�����j
             m_med.setCLIENT_REMARK_KANJI(m_med.getEdiCLIENT_REMARK_KANJI());
             //�[�i�����i�\���敪
             m_med.setSLIP_PRICE_PRINT_TYP(m_med.getEdiSLIP_PRICE_PRINT_TYP());
             //�ʉ݃R�[�h
             m_med.setCUR_CD(m_med.getcustCUR_CD());
             //�[���P�`�R�P�̃��[�v
             for(int i = 0; i < 31; i++){
              m_med.setDESINATED_DLV_DATE(null);
              if (i == 0 && !(m_med.getEdiSCDL_DLV_DATE_1() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_1()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_1());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_1());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_1());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_1());
              } else if (i == 1 && !(m_med.getEdiSCDL_DLV_DATE_2() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_2()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_2());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_2());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_2());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_2());
              } else if (i == 2 && !(m_med.getEdiSCDL_DLV_DATE_3() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_3()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_3());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_3());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_3());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_3());
              } else if (i == 3 && !(m_med.getEdiSCDL_DLV_DATE_4() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_4()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_4());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_4());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_4());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_4());
              } else if (i == 4 && !(m_med.getEdiSCDL_DLV_DATE_5() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_5()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_5());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_5());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_5());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_5());
              } else if (i == 5 && !(m_med.getEdiSCDL_DLV_DATE_6() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_6()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_6());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_6());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_6());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_6());
              } else if (i == 6 && !(m_med.getEdiSCDL_DLV_DATE_7() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_7()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_7());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_7());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_7());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_7());
              } else if (i == 7 && !(m_med.getEdiSCDL_DLV_DATE_8() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_8()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_8());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_8());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_8());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_8());
              } else if (i == 8 && !(m_med.getEdiSCDL_DLV_DATE_9() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_9()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_9());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_9());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_9());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_9());
              } else if (i == 9 && !(m_med.getEdiSCDL_DLV_DATE_10() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_10()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_10());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_10());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_10());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_10());
              } else if (i == 10 && !(m_med.getEdiSCDL_DLV_DATE_11() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_11()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_11());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_11());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_11());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_11());
              } else if (i == 11 && !(m_med.getEdiSCDL_DLV_DATE_12() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_12()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_12());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_12());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_12());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_12());
              } else if (i == 12 && !(m_med.getEdiSCDL_DLV_DATE_13() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_13()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_13());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_13());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_13());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_13());
              } else if (i == 13 && !(m_med.getEdiSCDL_DLV_DATE_14() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_14()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_14());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_14());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_14());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_14());
              } else if (i == 14 && !(m_med.getEdiSCDL_DLV_DATE_15() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_15()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_15());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_15());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_15());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_15());
              } else if (i == 15 && !(m_med.getEdiSCDL_DLV_DATE_16() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_16()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_16());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_16());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_16());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_16());
              } else if (i == 16 && !(m_med.getEdiSCDL_DLV_DATE_17() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_17()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_17());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_17());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_17());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_17());
              } else if (i == 17 && !(m_med.getEdiSCDL_DLV_DATE_18() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_18()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_18());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_18());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_18());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_18());
              } else if (i == 18 && !(m_med.getEdiSCDL_DLV_DATE_19() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_19()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_19());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_19());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_19());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_19());
              } else if (i == 19 && !(m_med.getEdiSCDL_DLV_DATE_20() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_20()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_20());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_20());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_20());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_20());
              } else if (i == 20 && !(m_med.getEdiSCDL_DLV_DATE_21() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_21()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_21());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_21());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_21());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_21());
              } else if (i == 21 && !(m_med.getEdiSCDL_DLV_DATE_22() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_22()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_22());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_22());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_22());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_22());
              } else if (i == 22 && !(m_med.getEdiSCDL_DLV_DATE_23() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_23()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_23());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_23());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_23());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_23());
              } else if (i == 23 && !(m_med.getEdiSCDL_DLV_DATE_24() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_24()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_24());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_24());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_24());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_24());
              } else if (i == 24 && !(m_med.getEdiSCDL_DLV_DATE_25() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_25()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_25());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_25());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_25());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_25());
              } else if (i == 25 && !(m_med.getEdiSCDL_DLV_DATE_26() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_26()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_26());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_26());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_26());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_26());
              } else if (i == 26 && !(m_med.getEdiSCDL_DLV_DATE_27() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_27()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_27());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_27());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_27());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_27());
              } else if (i == 27 && !(m_med.getEdiSCDL_DLV_DATE_28() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_28()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_28());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_28());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_28());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_28());
              } else if (i == 28 && !(m_med.getEdiSCDL_DLV_DATE_29() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_29()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_29());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_29());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_29());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_29());
              } else if (i == 29 && !(m_med.getEdiSCDL_DLV_DATE_30() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_30()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_30());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_30());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_30());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_30());
              } else if (i == 30 && !(m_med.getEdiSCDL_DLV_DATE_31() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_31()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_31());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_31());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_31());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_31());
              }
              if (m_med.getDESINATED_DLV_DATE() != null && !"000000".equals(m_med.getDESINATED_DLV_DATE())) {
               m_med.setODR_SEQ(new Double(i + 1));
               this.writeLogMessageInfo("T_ODR_INFO_COM_IF insert SEQ=",String.valueOf(m_med.getODR_SEQ().intValue()) );
               rv = m_med.getT_ODR_INFO_COM_IF().create();
              }
             }
             //=======================================
             // ����I/F�iEDI)�̃V�X�e�������敪�𐳏�ɐݒ�
             //=======================================
             m_med.setEdiSYSTEM_PROC_TYP(SYS_PROC_TYP_SUMI);
             rv = m_med.getT_ODR_INFO_EDI_IF().update();
             conn.commit();
            }catch(Exception e) {
             try {
              conn.rollback();
       //							e.printStackTrace();
              // �R�l�N�V������n���āA�̔Ԃ̏���
              logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
              // ����IF(EDI)�ϊ��Ώۃf�[�^�̎擾�Ɏ��s���܂����B
              String strMsgCd = "KV02203";
              String strDataString = "LINE=" + (rec + 1);
              businessMsgAcc.init(conn);
              businessMsg.setBusinessOperatingName(strBusinessName);
              businessMsg.setUser(strUserId);
              businessMsg.setPlantCode(strMsgPlantCd);
              businessMsg.setLogCode(logCd.getNo());
       //kis businessMsg.setLogCode("b" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
              businessMsg.setMessageCode(strMsgCd);
              businessMsg.setData(strDataString);
              businessMsgAcc.add(businessMsg);
              if(this.getSysMsg(strMsgCd)){
               CoreTools.write(strMsgCd+" "+this.m_vMSG);
               this.writeLogMessageInfo(" ", e.getMessage());
               this.writeLogMessageInfo(" ", strDataString);
               this.writeLogMessageInfo(" ", "ODR_INFO_COM_IF_CTRL_NO=" + m_med.getODR_INFO_COM_IF_CTRL_NO());
               this.writeLogMessageInfo(" ", "ODR_SEQ=" + m_med.getODR_SEQ());
               this.writeLogMessageInfo(" ", "ODR_TYP=" + m_med.getODR_TYP());
               this.writeLogMessageInfo(" ", "INFO_TYP_CD=" + m_med.getINFO_TYP_CD());
               this.writeLogMessageInfo(" ", "CUST_ODR_NO=" + m_med.getCUST_ODR_NO());
               this.writeLogMessageInfo(" ", "ODR_ACPT_DATE=" + m_med.getODR_ACPT_DATE());
               this.writeLogMessageInfo(" ", "CUST_CD=" + m_med.getCUST_CD());
               this.writeLogMessageInfo(" ", "CUST_ITEM_CD=" + m_med.getCUST_ITEM_CD());
               this.writeLogMessageInfo(" ", "PART_NAME=" + m_med.getPART_NAME());
               this.writeLogMessageInfo(" ", "PROC_TYP=" + m_med.getPROC_TYP());
               this.writeLogMessageInfo(" ", "COCK_TYP=" + m_med.getCOCK_TYP());
               this.writeLogMessageInfo(" ", "UNIT_CD=" + m_med.getUNIT_CD());
               this.writeLogMessageInfo(" ", "UNIT_COST=" + m_med.getUNIT_COST());
               this.writeLogMessageInfo(" ", "UNIT_COST_TYP=" + m_med.getUNIT_COST_TYP());
               this.writeLogMessageInfo(" ", "DESINATED_DLV_DATE=" + m_med.getDESINATED_DLV_DATE());
               this.writeLogMessageInfo(" ", "PUCH_ODR_QTY=" + m_med.getPUCH_ODR_QTY());
               this.writeLogMessageInfo(" ", "PKG_UNIT=" + m_med.getPKG_UNIT());
               this.writeLogMessageInfo(" ", "INSPC_TYP=" + m_med.getINSPC_TYP());
               this.writeLogMessageInfo(" ", "DLV_LOC_CD=" + m_med.getDLV_LOC_CD());
               this.writeLogMessageInfo(" ", "DLV_LOC_CD_EIAJ=" + m_med.getDLV_LOC_CD_EIAJ());
               this.writeLogMessageInfo(" ", "DLV_LOC_NAME_KANJI=" + m_med.getDLV_LOC_NAME_KANJI());
               this.writeLogMessageInfo(" ", "CUS_DLV_CD=" + m_med.getCUS_DLV_CD());
               this.writeLogMessageInfo(" ", "CUS_DLV_KEY_CD=" + m_med.getCUS_DLV_KEY_CD());
               this.writeLogMessageInfo(" ", "FREE_REMARK=" + m_med.getFREE_REMARK());
               this.writeLogMessageInfo(" ", "REMARK=" + m_med.getREMARK());
               this.writeLogMessageInfo(" ", "CLIENT_BARCODE_INF=" + m_med.getCLIENT_BARCODE_INF());
               this.writeLogMessageInfo(" ", "CLIENT_REMARK=" + m_med.getCLIENT_REMARK());
               this.writeLogMessageInfo(" ", "CLIENT_REMARK_KANJI=" + m_med.getCLIENT_REMARK_KANJI());
               this.writeLogMessageInfo(" ", "SLIP_PRICE_PRINT_TYP=" + m_med.getSLIP_PRICE_PRINT_TYP());
               this.writeLogMessageInfo(" ", "CUR_CD=" + m_med.getCUR_CD());
               this.writeLogMessageInfo(" ", "UNIT_CD_ORG=" + m_med.getUNIT_CD_ORG());
               this.writeLogMessageInfo(" ", "PUCH_ODR_QTY_TOTAL=" + m_med.getPUCH_ODR_QTY_TOTAL());
               this.writeLogMessageInfo(" ", "BUYER_NAME=" + m_med.getBUYER_NAME());
               this.writeLogMessageInfo(" ", "ODR_ACPT_PROC_ODR=" + m_med.getODR_ACPT_PROC_ODR());
               this.writeLogMessageInfo(" ", "BUYER_ORG_CD=" + m_med.getBUYER_ORG_CD());
              }else{
               throw new Exception();
              }
              conn.commit();
             } catch (SQLException ex) {
              ex.printStackTrace();
             } catch (FoundationException ex) {
              ex.printStackTrace();
             }
            }
           }
       
           CoreTools.write("(SBM1247)����IF(EDI)�ϊ������I��");
           
       //-----------------------------------------------------------------------------
       //		����IF(EDI)�ϊ������i�����܂Łj
       //-----------------------------------------------------------------------------
       
          }catch(Exception e) {
           try {
            conn.rollback();
            e.printStackTrace();
            // �R�l�N�V������n���āA�̔Ԃ̏���
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            // ����IF(EDI)�ϊ��Ώۃf�[�^�̎擾�Ɏ��s���܂����B
            String strMsgCd = "KV02203";
            String strDataString = "LINE=" + (rec + 1);
            businessMsgAcc.init(conn);
            businessMsg.setBusinessOperatingName(strBusinessName);
            businessMsg.setUser(strUserId);
            businessMsg.setPlantCode(strMsgPlantCd);
            businessMsg.setLogCode(logCd.getNo());
       //kis businessMsg.setLogCode("b" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
            businessMsg.setMessageCode(strMsgCd);
            businessMsg.setData(strDataString);
            businessMsgAcc.add(businessMsg);
            if(this.getSysMsg(strMsgCd)){
             CoreTools.write(strMsgCd+" "+this.m_vMSG);
            }else{
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
           // ����IF(EDI)�ϊ��o�b�`�����ɂĒv���I�ȃG���[���������܂����B
           String strMsgCd = "KV02203";
            String strDataString = "LINE=" + (rec + 1);
           businessMsgAcc.init(conn);
           businessMsg.setBusinessOperatingName(strBusinessName);
           businessMsg.setUser(strUserId);
           businessMsg.setPlantCode(strMsgPlantCd);
           businessMsg.setLogCode(logCd.getNo());
       //kis businessMsg.setLogCode("c" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
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
          	
            // �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
            businessMsgAcc.init(conn);
            businessMsg.setBusinessOperatingName(strBusinessName);
            businessMsg.setUser(strUserId);
            businessMsg.setPlantCode(strMsgPlantCd);
          	
			// �R�l�N�V������n���āA�̔Ԃ̏���
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            businessMsg.setLogCode(logCd.getNo());
            
			//�Ɩ����b�N����
			boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
			if (result == false) {
				// �Ɩ����b�Z�[�W�ǉ�
				String strMsgCd = "ZZ01004";
				businessMsg.setMessageCode(strMsgCd);
				businessMsgAcc.add(businessMsg);
			}
			
			if (lockCancelKey != -1) {
				// �Ɩ����b�Z�[�W�ǉ�
				String strMsgCd = "KV02202";
				String strDataString = "(SBM0611)<<����IF(EDI)�ϊ��o�b�`�����I��>>";
				//kis businessMsg.setLogCode("d" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
				}
			}
          	
			conn.commit();
          } catch (SQLException ex) {
           ex.printStackTrace();
          } catch (FoundationException ex) {
           ex.printStackTrace();
          }
         }
       
       //-----------------------------------------------------------------------------
       
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
		public medKV0020B002 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0020B002 med) throws BatchAppException
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
