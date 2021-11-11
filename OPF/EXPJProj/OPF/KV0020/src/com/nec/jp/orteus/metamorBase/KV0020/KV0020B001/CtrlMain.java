/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B001;

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
 * @version $Revision: 1.10 $ $Date: 2015/12/03 08:55:45 $
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
	public medKV0020B001 m_med=null;

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
	public CtrlMain(medKV0020B001 med, BatchAppConductor cdr) throws BatchAppException
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
        /** EDI ���敪�R�[�h */
        private final static String INFO_TYP_0201  = "0201";	//���v�v����
        private final static String INFO_TYP_0203  = "0203";	//�\�񒍕����
        private final static String INFO_TYP_0501  = "0501";	//�����������
        private final static String INFO_TYP_0502  = "0502";	//�m�蒍�����
        private final static String INFO_TYP_0503  = "0503";	//�ύX�������
        private final static String INFO_TYP_0504  = "0504";	//����������
       
        /** ���̓t�@�C���̃G���R�[�h */
        private final static String FILE_ENCODING = "MS932";
       
        /** ���̓t�@�C���̍��ڒ���` */
        private final static int len_DATA_PROC_CD				= 5;			//1		ooo	(�����A�\��A�v��j
        private final static int len_INFO_TYP_CD					= 4;			//2		ooo
        private final static int len_DATA_CREATED_DATE			= 6;			//3		ooo
        private final static int len_CLIENT_CD					= 12;			//4		ooo
        private final static int len_TRUSTEE_CD					= 12;			//5		ooo
        private final static int len_BUYER_ORG_CD				= 8;			//6		ooo
        private final static int len_PUCH_ODR_CD					= 23;			//7		oxx	�����̂�
        private final static int len_PRDCT_ODR_CD				= 19;			//8		ooo
        private final static int len_MODIFICATION_CODE			= 1;			//9		ooo
        private final static int len_COCK_TYP					= 1;			//10	ooo
        private final static int len_PUCH_ODR_DATE				= 6;			//11	oxx	�����̂�		  
        private final static int len_UNIT						= 3;			//12	ooo
        private final static int len_UNIT_PRICE					= 13;			//13	oox	�����E�\��̂�
        private final static int len_PRICE_TYP					= 1;			//14	oox	�����E�\��̂�
        private final static int len_PUCH_ODR_QTY				= 12;			//15	oxx	�����̂�		  
        private final static int len_PUCH_ODR_AMOUNT				= 10;			//16	oxx	�����̂�		  
        private final static int len_CONS_TYP					= 1;			//17	ooo
        private final static int len_BUYER_NAME					= 7;			//18	ooo
        private final static int len_MATR_SPEC_SIZE				= 20;			//19	ooo
        private final static int len_SPECTP						= 1;			//20	ooo
        private final static int len_DROWING_EDITION				= 3;			//21	ooo
        private final static int len_PART_NAME					= 30;			//22	ooo
        private final static int len_OWN_ITEM_CD					= 25;			//23	ooo
        private final static int len_CUST_ITEM_CD				= 25;			//24	ooo
        private final static int len_DROW_SPEC_QTY				= 2;			//25	oxx	�����̂�		  
        private final static int len_PKG_UNIT					= 7;			//26	ooo
        private final static int len_DIRECT_DLV_TYP				= 1;			//27	oxx	�����̂�		  
        private final static int len_DLV_LOC_CD					= 8;			//28	oox	�����E�\��̂�
        private final static int len_INSPC_TYP					= 3;			//29	oxx	�����̂�		  
        private final static int len_DLV_INST_TYP				= 1;			//30	oxx	�����̂�		  
        //31��
         private final static int len_SCDL_DLV_DATE				= 6;		//31	ooo
         private final static int len_SCDL_DLV_QTY				= 12;		//32	ooo
         private final static int len_DLV_CD						= 8;		//34	oxx	�����̂�		  
        private final static int len_FREE_TEXT					= 100;			//55	oox	�����E�\��̂�
        private final static int len_REMARKS						= 30;			//56	ooo
        private final static int len_TAX_TYP						= 1;			//57	oox	�����E�\��̂�
        private final static int len_CUST_TAXATION_TYP			= 1;			//59	oox	�����E�\��̂�
        private final static int len_TAX_AMOUNT					= 10;			//60	oox	�����E�\��̂�
        private final static int len_CUST_TOTAL_AMOUNT			= 10;			//61	oox	�����E�\��̂�
        private final static int len_PLANNING_ODR_CD				= 23;			//62	xxo	�v��̂�
        private final static int len_PLANNING_ODR_DATE			= 6;			//63	xxo	�v��̂�
        private final static int len_UNCONFIRM_ODR_CD			= 23;			//68	xox	�\��̂�		  
        private final static int len_UNCONFIRM_ODR_DATE			= 6;			//69	xox	�\��̂�		  
        private final static int len_UNCONFIRM_ODR_QTY			= 12;			//70	xox	�\��̂�		  
        private final static int len_UNCONFIRM_ODR_AMOUNT		= 10;			//71	xox	�\��̂�		  
        private final static int len_ESTIMATE_REQST_CD			= 23;			//72	oxx	�����̂�		  
        private final static int len_STANDARD_DLV_TERM			= 3;			//81	xxo	�v��̂�
        private final static int len_STL_COND_CD					= 1;			//82	oxx	�����̂�		  
        private final static int len_END_USER_NAME				= 20;			//151	ooo
        private final static int len_DLV_ZIP_CD					= 8;			//152	oox	�����E�\��̂�
        private final static int len_DLV_ADDRESS					= 100;			//153	oox	�����E�\��̂�
        private final static int len_DLV_ADDRESSEE				= 100;			//154	oox	�����E�\��̂�
        private final static int len_CUST_COMM_SUBNAME			= 30;			//155	oox	�����E�\��̂�
        private final static int len_CUST_COMM_SUBCD				= 25;			//156	oox	�����E�\��̂�
        private final static int len_END_USER_ODR_CD				= 23;			//157	oxx	�����̂�		  
        private final static int len_CUST_DESINATED_MAKER		= 20;			//158	oox	�����E�\��̂�
        //31��
         private final static int len_DLV_KEY_NO					= 23;		//159	oxx	�����̂�		  
        private final static int len_DLV_LOC_NAME				= 20;			//160	oox	�����E�\��̂�
        private final static int len_CLIENT_BARCODE_INF			= 23;			//161	oxx	�����̂�		  
        private final static int len_CLIENT_REMARK				= 50;			//162	oxx	�����̂�		  
        private final static int len_REQUIRED_TERM				= 3;			//165	xxo	�v��̂�
        private final static int len_CONTRACT_COND_TYP			= 1;			//166	ooo
        private final static int len_PUCH_ODR_SHAP_TYP			= 2;			//167	oxx	�����̂�		  
        private final static int len_MASTER_PUCH_ODR_CD			= 23;			//168	oxx	�����̂�		  
        private final static int len_QTY_CONTRACT_TYP			= 1;			//169	oxx	�����̂�		  
        //3��
         private final static int len_ODR_MODIFICATION_TYP		= 2;		//170	oxx	�����̂�		  
        private final static int len_MACHINE_TYP_CD				= 20;			//171	ooo
        private final static int len_ENGINNERING_CHG_CD			= 12;			//172	oxx	�����̂�		  
        private final static int len_DROW_SPEC_CD				= 30;			//173	oxx	�����̂�		  
        //4��
         private final static int len_DLV_DOC_FORM				= 1;		//174	oxx	�����̂�		  
         private final static int len_DLV_DOC_COPY_NUM			= 2;		//175	oxx	�����̂�		  
         private final static int len_DLV_DOC_LANG				= 1;		//176	oxx	�����̂�		  
        private final static int len_STRATEGIC_GOODS_TYP			= 1;			//177	oxx
        //5��
         private final static int len_ORGN_PLACE_CD				= 3;		//178	oxx	�����̂�		  
        //31��
         private final static int len_DLV_TIME					= 4;		//179	oxx	�����̂�		  
        private final static int len_PACKAGE_DLV_CD				= 10;			//180	oxx	�����̂�		  
        private final static int len_SPEC						= 120;			//183	oxo	�����E�v��̂�		  
        private final static int len_BUYER_ORG_NAME				= 20;			//184	oxx
        //10��
         private final static int len_DLV_PART_LEN				= 12;		//185	oxx	�����̂�		  
         private final static int len_DLV_PART_QTY				= 4;		//186	oxx	�����̂�		  
        private final static int len_DLV_PART_UNIT				= 3;			//187	oxx	�����̂�		  
        private final static int len_CUST_CONSTRUCT_NAME			= 40;			//188	oxx	�����̂�		  
        private final static int len_MATERIAL_CD					= 2;			//189	oxx	�����̂�		  
        private final static int len_MATERIAL_UNIT_PRICE			= 13;			//190	oxx	�����̂�		  
        private final static int len_MATERIAL_UNIT				= 3;			//191	oxx	�����̂�		  
        private final static int len_TEST_REPORT_NEED_TYP		= 1;			//192	oxx	�����̂�		  
        private final static int len_TEST_REPORT_CHK_TYP			= 1;			//193	oxx	�����̂�		  
        private final static int len_TEST_REPORT_PRESENT_TYP		= 1;			//194	oxx	�����̂�		  
        private final static int len_MUNICIPAL_CD				= 7;			//195	oxx	�����̂�		  
        private final static int len_DLV_CONTACT_TEL				= 18;			//196	oxx	�����̂�		  
        private final static int len_SLIP_PRICE_PRINT_TYP		= 1;			//257	oxx	�����̂�		  
        private final static int len_BUYER_NAME_KANJI			= 14;			//260	oxx
        private final static int len_SPEC_KANJI					= 40;			//261	oxx
        private final static int len_ITEM_NAME_KANJI				= 60;			//262	oxx
        private final static int len_REMARKS_KANJI				= 60;			//263	oxx
        private final static int len_END_USER_NAME_KANJI			= 40;			//269	oxx
        private final static int len_DLV_ADDRESS_KANJI			= 100;			//270	oox	�����E�\��̂�
        private final static int len_DLV_ADDRESSEE_KANJI			= 100;			//271	oox	�����E�\��̂�
        private final static int len_END_USER_ITEM_NAME_KANJI	= 60;			//272	oox	�����E�\��̂�
        private final static int len_CUST_DESINATED_MAKER_KANJI	= 40;			//273	oxx
        private final static int len_DLV_LOC_NAME_KANJI			= 40;			//274	oox	�����E�\��̂�
        private final static int len_CLIENT_REMARK_KANJI			= 100;			//275	oxx	�����̂�		  
        private final static int len_MACHINE_TYPE_NAME_KANJI		= 40;			//277	oxx
        private final static int len_CUST_SPC_KANJI				= 240;			//278	oxo	�����E�v��̂�		  
        private final static int len_BUYER_ORG_NAME_KANJI		= 40;			//279	oxx
        private final static int len_CUST_CONSTRUCT_NAME_KANJI	= 80;			//280	oxx	�����̂�
        private final static int len_CUR_CD						= 3;			//281	oox	�����E�\��̂�
        private final static int len_UNIT_PRICE_EXCH_RATES		= 16;			//282	oox	�����E�\��̂�
        private final static int len_ODR_AMOUNT_EXCH_RATES		= 15;			//283	oxx	�����̂�		  
        private final static int len_TAX_AMOUNT_EXCH_RATES		= 15;			//287	oox	�����E�\��̂�
        private final static int len_TOTAL_AMOUNT_EXCH_RATES		= 15;			//288	oox	�����E�\��̂�
        private final static int len_UNCONFIRM_AMOUNT_EXCH_RATES		= 15;		//289	xox	�\��̂�		  
        private final static int len_MATERIAL_CD_EXCH_RATES		= 16;			//301	oxx	�����̂�		  
       
        /** �N������ */
        private String strBusinessName = null;
        private String strUserId = null;
        private String strPlantCd = null;
        private String strMsgPlantCd = null;
        private String strFilePath = null;
        private String strFileName = null;
       
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
         ExpjMessage am = new ExpjMessage(msgCd,if_no);
         CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
       
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
        /**
         * ���z�����_�ʒu�ɏ����_��ݒ肵���������ԋp
         *
         * @param String ���z�����_����
         * @param int ����������
         * @param int ����������
         */
        private String toDoubleString(String value,int pos1,int pos2) throws Exception,BatchAppException
        {
         String rv = null;
         if(value.length() != (pos1 + pos2)) throw new Exception();
         rv = value.substring(0,pos1) + "." + value.substring(pos1,pos1+pos2);
         return rv;
        }
       
       //-----------------------------------------------------------------------------
       
        /**
         * CtrlMain�N���X�̕W���R���X�g���N�^
         *
         * @return �Ȃ�
         */
        public CtrlMain(medKV0020B001 med) throws BatchAppException
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
               int nret = 0;
               List WhCdList = new ArrayList();
               List YukouSuList = new ArrayList();
       
               // �G���[���X�g
         List errCodeList = new ArrayList();
       
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
         strFilePath = args[3];
         strFileName = args[4];
       
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
			String strMsgCd = "KV02101";
			String strDataString = "(SBM0607)<< ����IF(EDI)���̓o�b�`�����J�n >>";
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
       //-----------------------------------------------------------------------------
       //		����IF(EDI)���͏����i��������j
       //-----------------------------------------------------------------------------
           int rec = 0;
           try{
            m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
            m_med.setUsername(strUserId);
           
            //=======================================
            // �Ώۃf�[�^�̎擾
            //=======================================
            FileReader fr;
            fr = new FileReader(strFilePath + "/" + strFileName,FILE_ENCODING);
       
            for(rec=0;fr.next();rec++){
             //=======================================
             // �P���R�[�h�����ڂɕ�������
             //=======================================
             int p = 0;
             byte b_data[] = fr.getValue().getBytes(FILE_ENCODING);
       
             //�f�[�^����NO
             String DATA_PROC_CD = new String(b_data,p,len_DATA_PROC_CD);p += len_DATA_PROC_CD;
             //���敪�R�[�h
             String INFO_TYP_CD = new String(b_data,p,len_INFO_TYP_CD);p += len_INFO_TYP_CD;
             if(INFO_TYP_CD == null || 
              (!INFO_TYP_0501.equals(INFO_TYP_CD) && !INFO_TYP_0502.equals(INFO_TYP_CD) &&
               !INFO_TYP_0503.equals(INFO_TYP_CD) && !INFO_TYP_0504.equals(INFO_TYP_CD))){
              throw new Exception();
             }
             //�f�[�^�쐬��
             String DATA_CREATED_DATE = new String(b_data,p,len_DATA_CREATED_DATE);p += len_DATA_CREATED_DATE;
             //�����҃R�[�h
             String CLIENT_CD = new String(b_data,p,len_CLIENT_CD);p += len_CLIENT_CD;
             //�󒍎҃R�[�h
             String TRUSTEE_CD = new String(b_data,p,len_TRUSTEE_CD);p += len_TRUSTEE_CD;
             //��������R�[�h
             String BUYER_ORG_CD = new String(b_data,p,len_BUYER_ORG_CD);p += len_BUYER_ORG_CD;
             //��
             String PUCH_ODR_CD = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����ԍ�
              PUCH_ODR_CD = new String(b_data,p,len_PUCH_ODR_CD);p += len_PUCH_ODR_CD;
             }
             //�����ԍ�
             String PRDCT_ODR_CD = new String(b_data,p,len_PRDCT_ODR_CD);p += len_PRDCT_ODR_CD;
             //�����R�[�h
             String MODIFICATION_CODE = new String(b_data,p,len_MODIFICATION_CODE);p += len_MODIFICATION_CODE;
             //�R�b�N�敪
             String COCK_TYP = new String(b_data,p,len_COCK_TYP);p += len_COCK_TYP;
             //��
             String PUCH_ODR_DATE = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����N����
              PUCH_ODR_DATE = new String(b_data,p,len_PUCH_ODR_DATE);p += len_PUCH_ODR_DATE;
             }
             //�P��
             String UNIT = new String(b_data,p,len_UNIT);p += len_UNIT;
             //��
             String UNIT_PRICE = "0";
             String PRICE_TYP = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //�P��
              UNIT_PRICE = toDoubleString(new String(b_data,p,len_UNIT_PRICE),10,3);p += len_UNIT_PRICE;
              //�P���敪
              PRICE_TYP = new String(b_data,p,len_PRICE_TYP);p += len_PRICE_TYP;
             }
             //��
             String PUCH_ODR_QTY = "0";
             String PUCH_ODR_AMOUNT = "0";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //��������
              PUCH_ODR_QTY = toDoubleString(new String(b_data,p,len_PUCH_ODR_QTY),9,3);p += len_PUCH_ODR_QTY;
              //�������z
              PUCH_ODR_AMOUNT = new String(b_data,p,len_PUCH_ODR_AMOUNT);p += len_PUCH_ODR_AMOUNT;
             }
             //�x���敪
             String CONS_TYP = new String(b_data,p,len_CONS_TYP);p += len_CONS_TYP;
             //�w���S��
             String BUYER_NAME = new String(b_data,p,len_BUYER_NAME);p += len_BUYER_NAME;
             //�ގ��E�K�i�E���@
             String MATR_SPEC_SIZE = new String(b_data,p,len_MATR_SPEC_SIZE);p += len_MATR_SPEC_SIZE;
             //�d�l���L��
             String SPECTP = new String(b_data,p,len_SPECTP);p += len_SPECTP;
             //�Ő�
             String DROWING_EDITION = new String(b_data,p,len_DROWING_EDITION);p += len_DROWING_EDITION;
             //�i���i�i���d�l�j
             String PART_NAME = new String(b_data,p,len_PART_NAME);p += len_PART_NAME;
             //�󒍎ҕi���R�[�h
             String OWN_ITEM_CD = new String(b_data,p,len_OWN_ITEM_CD);p += len_OWN_ITEM_CD;
             //�����ҕi���R�[�h
             String CUST_ITEM_CD = new String(b_data,p,len_CUST_ITEM_CD);p += len_CUST_ITEM_CD;
             //��
             String DROW_SPEC_QTY = "0";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�}�ʁE�d�l������
              DROW_SPEC_QTY = new String(b_data,p,len_DROW_SPEC_QTY);p += len_DROW_SPEC_QTY;
             }
             //�׎p�i��P�ʁj
             String PKG_UNIT = new String(b_data,p,len_PKG_UNIT);p += len_PKG_UNIT;
             //��
             String DIRECT_DLV_TYP = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //���[�敪
              DIRECT_DLV_TYP = new String(b_data,p,len_DIRECT_DLV_TYP);p += len_DIRECT_DLV_TYP;
             }
             //��
             String DLV_LOC_CD = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //��n�ꏊ
              DLV_LOC_CD = new String(b_data,p,len_DLV_LOC_CD);p += len_DLV_LOC_CD;
             }
             //��
             String INSPC_TYP = "";
             String DLV_INST_TYP = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����敪
              INSPC_TYP = new String(b_data,p,len_INSPC_TYP);p += len_INSPC_TYP;
              //�[���w���L���敪
              DLV_INST_TYP = new String(b_data,p,len_DLV_INST_TYP);p += len_DLV_INST_TYP;
             }
             //�R�P��
             String SCDL_DLV_DATE[] = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
             String SCDL_DLV_QTY[] = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
             String DLV_CD[] = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
             for(int i=0; i < 31; i++){
              //�[��
              SCDL_DLV_DATE[i] = new String(b_data,p,len_SCDL_DLV_DATE);p += len_SCDL_DLV_DATE;
              //�[���w������(���v�v�搔��)
              SCDL_DLV_QTY[i] = toDoubleString(new String(b_data,p,len_SCDL_DLV_QTY),9,3);p += len_SCDL_DLV_QTY;
              //��
              if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
               //�[��NO
               DLV_CD[i] = new String(b_data,p,len_DLV_CD);p += len_DLV_CD;
              }
             }
             //��
             String FREE_TEXT = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //���R�g�p��
              FREE_TEXT = new String(b_data,p,len_FREE_TEXT);p += len_FREE_TEXT;
             }
             //���l
             String REMARKS = new String(b_data,p,len_REMARKS);p += len_REMARKS;
             //��
             String TAX_TYP = "";
             String CUST_TAXATION_TYP = "";
             String TAX_AMOUNT = "0";
             String CUST_TOTAL_AMOUNT = "0";
             String PLANNING_ODR_CD = "";
             String PLANNING_ODR_DATE = "";
             String STANDARD_DLV_TERM = "0";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //����ŋ敪
              TAX_TYP = new String(b_data,p,len_TAX_TYP);p += len_TAX_TYP;
              //�ېŋ敪
              CUST_TAXATION_TYP = new String(b_data,p,len_CUST_TAXATION_TYP);p += len_CUST_TAXATION_TYP;
              //����Ŋz
              TAX_AMOUNT = new String(b_data,p,len_TAX_AMOUNT);p += len_TAX_AMOUNT;
              //���v�z
              CUST_TOTAL_AMOUNT = new String(b_data,p,len_CUST_TOTAL_AMOUNT);p += len_CUST_TOTAL_AMOUNT;
             }else{
              //62 �v��ԍ�
              PLANNING_ODR_CD = new String(b_data,p,len_PLANNING_ODR_CD);p += len_PLANNING_ODR_CD;
              //63 �v��N����
              PLANNING_ODR_DATE = new String(b_data,p,len_PLANNING_ODR_DATE);p += len_PLANNING_ODR_DATE;
              //81 �W���[������
              STANDARD_DLV_TERM = new String(b_data,p,len_STANDARD_DLV_TERM);p += len_STANDARD_DLV_TERM;
             }
             //��
             String UNCONFIRM_ODR_CD = "";
             String UNCONFIRM_ODR_DATE = "";
             String UNCONFIRM_ODR_QTY = "0";
             String UNCONFIRM_ODR_AMOUNT = "0";
             String ESTIMATE_REQST_CD = "";
             String STL_COND_CD = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //���ψ˗��ԍ�
              ESTIMATE_REQST_CD = new String(b_data,p,len_ESTIMATE_REQST_CD);p += len_ESTIMATE_REQST_CD;
              //���Ϗ����敪
              STL_COND_CD = new String(b_data,p,len_STL_COND_CD);p += len_STL_COND_CD;
             }else if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //�\��ԍ�
              UNCONFIRM_ODR_CD = new String(b_data,p,len_UNCONFIRM_ODR_CD);p += len_UNCONFIRM_ODR_CD;
              //�\��N����
              UNCONFIRM_ODR_DATE = new String(b_data,p,len_UNCONFIRM_ODR_DATE);p += len_UNCONFIRM_ODR_DATE;
              //�\�񐔗�
              UNCONFIRM_ODR_QTY = toDoubleString(new String(b_data,p,len_UNCONFIRM_ODR_QTY),9,3);p += len_UNCONFIRM_ODR_QTY;
              //�\����z
              UNCONFIRM_ODR_AMOUNT = new String(b_data,p,len_UNCONFIRM_ODR_AMOUNT);p += len_UNCONFIRM_ODR_AMOUNT;
             }
             //�G���h���[�U�[��
             String END_USER_NAME = new String(b_data,p,len_END_USER_NAME);p += len_END_USER_NAME;
             //��
             String DLV_ZIP_CD = "";
             String DLV_ADDRESS = "";
             String DLV_ADDRESSEE = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //�[����X�֔ԍ�
              DLV_ZIP_CD = new String(b_data,p,len_DLV_ZIP_CD);p += len_DLV_ZIP_CD;
              //�[����Z��
              DLV_ADDRESS = new String(b_data,p,len_DLV_ADDRESS);p += len_DLV_ADDRESS;
              //�[���戶�於
              DLV_ADDRESSEE = new String(b_data,p,len_DLV_ADDRESSEE);p += len_DLV_ADDRESSEE;
             }
             //��
             String CUST_COMM_SUBNAME = "";
             String CUST_COMM_SUBCD = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //�G���h���[�U�[�i��
              CUST_COMM_SUBNAME = new String(b_data,p,len_CUST_COMM_SUBNAME);p += len_CUST_COMM_SUBNAME;
              //�G���h���[�U�[�i���R�[�h
              CUST_COMM_SUBCD = new String(b_data,p,len_CUST_COMM_SUBCD);p += len_CUST_COMM_SUBCD;
             }
             //��
             String END_USER_ODR_CD = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�G���h���[�U�[�����ԍ�
              END_USER_ODR_CD = new String(b_data,p,len_END_USER_ODR_CD);p += len_END_USER_ODR_CD;
             }
             //�w�胁�[�J�[��
             String CUST_DESINATED_MAKER = new String(b_data,p,len_CUST_DESINATED_MAKER);p += len_CUST_DESINATED_MAKER;
             //��
             String DLV_KEY_NO[] = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�R�P��
              for(int i=0;i<31;i++){
               //�[�i�L�[�ԍ�
               DLV_KEY_NO[i] = new String(b_data,p,len_DLV_KEY_NO);p += len_DLV_KEY_NO;
              }
             }
             //��
             String DLV_LOC_NAME = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //��n�ꏊ��
              DLV_LOC_NAME = new String(b_data,p,len_DLV_LOC_NAME);p += len_DLV_LOC_NAME;
             }
             //��
             String CLIENT_BARCODE_INF = "";
             String CLIENT_REMARK = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����җp�o�[�R�[�h���
              CLIENT_BARCODE_INF = new String(b_data,p,len_CLIENT_BARCODE_INF);p += len_CLIENT_BARCODE_INF;
              //�����җp���l
              CLIENT_REMARK = new String(b_data,p,len_CLIENT_REMARK);p += len_CLIENT_REMARK;
             }
             //��
             String REQUIRED_TERM = "0";
             if(INFO_TYP_0201.equals(INFO_TYP_CD)){
              //���v����
              REQUIRED_TERM = new String(b_data,p,len_REQUIRED_TERM);p += len_REQUIRED_TERM;
             }
             //�_������敪
             String CONTRACT_COND_TYP = new String(b_data,p,len_CONTRACT_COND_TYP);p += len_CONTRACT_COND_TYP;
             //��
             String PUCH_ODR_SHAP_TYP = "";
             String MASTER_PUCH_ODR_CD = "";
             String QTY_CONTRACT_TYP = "";
             String ODR_MODIFICATION_TYP[] = {"","",""};
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����`�ԋ敪
              PUCH_ODR_SHAP_TYP = new String(b_data,p,len_PUCH_ODR_SHAP_TYP);p += len_PUCH_ODR_SHAP_TYP;
              //�e�����ԍ�
              MASTER_PUCH_ODR_CD = new String(b_data,p,len_MASTER_PUCH_ODR_CD);p += len_MASTER_PUCH_ODR_CD;
              //���ʌ_��敪
              QTY_CONTRACT_TYP = new String(b_data,p,len_QTY_CONTRACT_TYP);p += len_QTY_CONTRACT_TYP;
              //�R��
              for(int i=0;i<3;i++){
               //�ύX�����敪
               ODR_MODIFICATION_TYP[i] = new String(b_data,p,len_ODR_MODIFICATION_TYP);p += len_ODR_MODIFICATION_TYP;
              }
             }
             //�@��R�[�h
             String MACHINE_TYP_CD = new String(b_data,p,len_MACHINE_TYP_CD);p += len_MACHINE_TYP_CD;
             //��
             String ENGINNERING_CHG_CD = "";
             String DROW_SPEC_CD = "";
             String DLV_DOC_FORM[] = {"","","",""};
             String DLV_DOC_COPY_NUM[] = {"0","0","0","0"};
             String DLV_DOC_LANG[] = {"","","",""};
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�݌v�ύX�ԍ�
              ENGINNERING_CHG_CD = new String(b_data,p,len_ENGINNERING_CHG_CD);p += len_ENGINNERING_CHG_CD;
              //�}�ʁE�d�l���ԍ�
              DROW_SPEC_CD = new String(b_data,p,len_DROW_SPEC_CD);p += len_DROW_SPEC_CD;
              //�S��
              for(int i=0;i<4;i++){
               //�v�������
               DLV_DOC_FORM[i] = new String(b_data,p,len_DLV_DOC_FORM);p += len_DLV_DOC_FORM;
               //�v��������
               DLV_DOC_COPY_NUM[i] = new String(b_data,p,len_DLV_DOC_COPY_NUM);p += len_DLV_DOC_COPY_NUM;
               //�v��������
               DLV_DOC_LANG[i] = new String(b_data,p,len_DLV_DOC_LANG);p += len_DLV_DOC_LANG;
              }
             }
             //�헪�����敪
             String STRATEGIC_GOODS_TYP = new String(b_data,p,len_STRATEGIC_GOODS_TYP);p += len_STRATEGIC_GOODS_TYP;
             //��
             String ORGN_PLACE_CD[] = {"","","","",""};
             String DLV_TIME[] = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
             String PACKAGE_DLV_CD = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�T��
              for(int i=0;i<5;i++){
               //���Y�n�R�[�h
               ORGN_PLACE_CD[i] = new String(b_data,p,len_ORGN_PLACE_CD);p += len_ORGN_PLACE_CD;
              }
              //�R�P��
              for(int i=0;i<31;i++){
               //�[������
               DLV_TIME[i] = new String(b_data,p,len_DLV_TIME);p += len_DLV_TIME;
              }
              //�ꊇ�[���ԍ�
              PACKAGE_DLV_CD = new String(b_data,p,len_PACKAGE_DLV_CD);p += len_PACKAGE_DLV_CD;
             }
             //��
             String SPEC = "";
             if(!INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����i�d�l
              SPEC = new String(b_data,p,len_SPEC);p += len_SPEC;
             }
             //�������喼
             String BUYER_ORG_NAME = new String(b_data,p,len_BUYER_ORG_NAME);p += len_BUYER_ORG_NAME;
             //��
             String DLV_PART_LEN[] = {"0","0","0","0","0","0","0","0","0","0"};
             String DLV_PART_QTY[] = {"0","0","0","0","0","0","0","0","0","0"};
             String DLV_PART_UNIT = "";
             String CUST_CONSTRUCT_NAME = "";
             String MATERIAL_CD = "";
             String MATERIAL_UNIT_PRICE = "0";
             String MATERIAL_UNIT = "";
             String TEST_REPORT_NEED_TYP = "";
             String TEST_REPORT_CHK_TYP = "";
             String TEST_REPORT_PRESENT_TYP = "";
             String MUNICIPAL_CD = "";
             String DLV_CONTACT_TEL = "";
             String SLIP_PRICE_PRINT_TYP = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�P�O��
              for(int i=0;i<10;i++){
               //��
               DLV_PART_LEN[i] = toDoubleString(new String(b_data,p,len_DLV_PART_LEN),9,3);p += len_DLV_PART_LEN;
               //�𒷌�
               DLV_PART_QTY[i] = new String(b_data,p,len_DLV_PART_QTY);p += len_DLV_PART_QTY;
              }
              //�𒷒P��
              DLV_PART_UNIT = new String(b_data,p,len_DLV_PART_UNIT);p += len_DLV_PART_UNIT;
              //�H������
              CUST_CONSTRUCT_NAME = new String(b_data,p,len_CUST_CONSTRUCT_NAME);p += len_CUST_CONSTRUCT_NAME;
              //��ޗ��R�[�h
              MATERIAL_CD = new String(b_data,p,len_MATERIAL_CD);p += len_MATERIAL_CD;
              //��ޗ��x�[�X
              MATERIAL_UNIT_PRICE = toDoubleString(new String(b_data,p,len_MATERIAL_UNIT_PRICE),10,3);p += len_MATERIAL_UNIT_PRICE;
              //��ޗ��P��
              MATERIAL_UNIT = new String(b_data,p,len_MATERIAL_UNIT);p += len_MATERIAL_UNIT;
              //�������я��v�ۋ敪
              TEST_REPORT_NEED_TYP = new String(b_data,p,len_TEST_REPORT_NEED_TYP);p += len_TEST_REPORT_NEED_TYP;
              //�������я������敪
              TEST_REPORT_CHK_TYP = new String(b_data,p,len_TEST_REPORT_CHK_TYP);p += len_TEST_REPORT_CHK_TYP;
              //�������я���o���@
              TEST_REPORT_PRESENT_TYP = new String(b_data,p,len_TEST_REPORT_PRESENT_TYP);p += len_TEST_REPORT_PRESENT_TYP;
              //�s�����R�[�h
              MUNICIPAL_CD = new String(b_data,p,len_MUNICIPAL_CD);p += len_MUNICIPAL_CD;
              //�[�����A����
              DLV_CONTACT_TEL = new String(b_data,p,len_DLV_CONTACT_TEL);p += len_DLV_CONTACT_TEL;
              //�[�i�����i�\���敪
              SLIP_PRICE_PRINT_TYP = new String(b_data,p,len_SLIP_PRICE_PRINT_TYP);p += len_SLIP_PRICE_PRINT_TYP;
             }
             //�w���S��(����)
             String BUYER_NAME_KANJI = new String(b_data,p,len_BUYER_NAME_KANJI);p += len_BUYER_NAME_KANJI;
             //�ގ��E�K�i�E���@�i�����j
             String SPEC_KANJI = new String(b_data,p,len_SPEC_KANJI);p += len_SPEC_KANJI;
             //�i���i�i���d�l�j�i�����j
             String ITEM_NAME_KANJI = new String(b_data,p,len_ITEM_NAME_KANJI);p += len_ITEM_NAME_KANJI;
             //���l�i�����j
             String REMARKS_KANJI = new String(b_data,p,len_REMARKS_KANJI);p += len_REMARKS_KANJI;
             //�G���h���[�U�[���i�����j
             String END_USER_NAME_KANJI = new String(b_data,p,len_END_USER_NAME_KANJI);p += len_END_USER_NAME_KANJI;
       
             //��
             String DLV_ADDRESS_KANJI = "";
             String DLV_ADDRESSEE_KANJI = "";
             String END_USER_ITEM_NAME_KANJI = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //�[����Z���i�����j
              DLV_ADDRESS_KANJI = new String(b_data,p,len_DLV_ADDRESS_KANJI);p += len_DLV_ADDRESS_KANJI;
              //�[���戶�於�i�����j
              DLV_ADDRESSEE_KANJI = new String(b_data,p,len_DLV_ADDRESSEE_KANJI);p += len_DLV_ADDRESSEE_KANJI;
              //�G���h���[�U�[�i���i�����j
              END_USER_ITEM_NAME_KANJI = new String(b_data,p,len_END_USER_ITEM_NAME_KANJI);p += len_END_USER_ITEM_NAME_KANJI;
             }
       
             //�w�胁�[�J�[���i�����j
             String CUST_DESINATED_MAKER_KANJI = new String(b_data,p,len_CUST_DESINATED_MAKER_KANJI);p += len_CUST_DESINATED_MAKER_KANJI;
             //��
             String DLV_LOC_NAME_KANJI = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
             //��n�ꏊ���i�����j
              DLV_LOC_NAME_KANJI = new String(b_data,p,len_DLV_LOC_NAME_KANJI);p += len_DLV_LOC_NAME_KANJI;
             }
             //��
             String CLIENT_REMARK_KANJI = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����җp���l�i�����j
              CLIENT_REMARK_KANJI = new String(b_data,p,len_CLIENT_REMARK_KANJI);p += len_CLIENT_REMARK_KANJI;
             }
             //�@�햼�i�����j
             String MACHINE_TYPE_NAME_KANJI = new String(b_data,p,len_MACHINE_TYPE_NAME_KANJI);p += len_MACHINE_TYPE_NAME_KANJI;
             //��
             String CUST_SPC_KANJI = "";
             if(!INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�����i�d�l�i�����j
              CUST_SPC_KANJI = new String(b_data,p,len_CUST_SPC_KANJI);p += len_CUST_SPC_KANJI;
             }
             //�������喼�i�����j
             String BUYER_ORG_NAME_KANJI = new String(b_data,p,len_BUYER_ORG_NAME_KANJI);p += len_BUYER_ORG_NAME_KANJI;
             //��
             String CUST_CONSTRUCT_NAME_KANJI = "";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�H�������i�����j
              CUST_CONSTRUCT_NAME_KANJI = new String(b_data,p,len_CUST_CONSTRUCT_NAME_KANJI);p += len_CUST_CONSTRUCT_NAME_KANJI;
             }
             //��
             String CUR_CD = "";
             String UNIT_PRICE_EXCH_RATES = "0";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //�ʉ݃R�[�h
              CUR_CD = new String(b_data,p,len_CUR_CD);p += len_CUR_CD;
              //�P���i�O�݁j
              UNIT_PRICE_EXCH_RATES = toDoubleString(new String(b_data,p,len_UNIT_PRICE_EXCH_RATES),11,5);p += len_UNIT_PRICE_EXCH_RATES;
             }
             //��
             String ODR_AMOUNT_EXCH_RATES = "0";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //�������z�i�O�݁j
              ODR_AMOUNT_EXCH_RATES = toDoubleString(new String(b_data,p,len_ODR_AMOUNT_EXCH_RATES),12,3);p += len_ODR_AMOUNT_EXCH_RATES;
             }
             //��
             String TAX_AMOUNT_EXCH_RATES = "0";
             String TOTAL_AMOUNT_EXCH_RATES = "0";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //����Ŋz�i�O�݁j
              TAX_AMOUNT_EXCH_RATES = toDoubleString(new String(b_data,p,len_TAX_AMOUNT_EXCH_RATES),12,3);p += len_TAX_AMOUNT_EXCH_RATES;
              //���v�z�i�O�݁j
              TOTAL_AMOUNT_EXCH_RATES = toDoubleString(new String(b_data,p,len_TOTAL_AMOUNT_EXCH_RATES),12,3);p += len_TOTAL_AMOUNT_EXCH_RATES;
             }
             //��
             String UNCONFIRM_AMOUNT_EXCH_RATES = "0";
             String MATERIAL_CD_EXCH_RATES = "0";
             if(!INFO_TYP_0201.equals(INFO_TYP_CD) && !INFO_TYP_0203.equals(INFO_TYP_CD)){
              //��ޗ��x�[�X�i�O�݁j
              MATERIAL_CD_EXCH_RATES = toDoubleString(new String(b_data,p,len_MATERIAL_CD_EXCH_RATES),11,5);p += len_MATERIAL_CD_EXCH_RATES;
             }else if(!INFO_TYP_0201.equals(INFO_TYP_CD)){
              //�\����z�i�O�݁j
              UNCONFIRM_AMOUNT_EXCH_RATES = toDoubleString(new String(b_data,p,len_UNCONFIRM_AMOUNT_EXCH_RATES),12,3);p += len_UNCONFIRM_AMOUNT_EXCH_RATES;
             }
       
             m_med.setDATA_PROC_CD(Double.valueOf(DATA_PROC_CD));
             m_med.setINFO_TYP_CD(INFO_TYP_CD.trim());
             m_med.setDATA_CREATED_DATE(DATA_CREATED_DATE.trim());
             m_med.setCLIENT_CD(CLIENT_CD.trim());
             m_med.setTRUSTEE_CD(TRUSTEE_CD.trim());
             m_med.setBUYER_ORG_CD(BUYER_ORG_CD.trim());
             m_med.setPUCH_ODR_CD(PUCH_ODR_CD.trim());
             m_med.setPRDCT_ODR_CD(PRDCT_ODR_CD.trim());
             m_med.setMODIFICATION_CODE(MODIFICATION_CODE.trim());
             m_med.setCOCK_TYP(COCK_TYP.trim());
             m_med.setPUCH_ODR_DATE(PUCH_ODR_DATE.trim());
             m_med.setUNIT(UNIT.trim());
             m_med.setUNIT_PRICE(UNIT_PRICE.trim());
             m_med.setPRICE_TYP(PRICE_TYP.trim());
             m_med.setPUCH_ODR_QTY(Double.valueOf(PUCH_ODR_QTY));
             m_med.setPUCH_ODR_AMOUNT(Double.valueOf(PUCH_ODR_AMOUNT));
             m_med.setCONS_TYP(CONS_TYP.trim());
             m_med.setBUYER_NAME(BUYER_NAME.trim());
             m_med.setMATR_SPEC_SIZE(MATR_SPEC_SIZE.trim());
             m_med.setSPECTP(SPECTP.trim());
             m_med.setDROWING_EDITION(DROWING_EDITION.trim());
             m_med.setPART_NAME(PART_NAME.trim());
             m_med.setOWN_ITEM_CD(OWN_ITEM_CD.trim());
             m_med.setCUST_ITEM_CD(CUST_ITEM_CD.trim());
             m_med.setDROW_SPEC_QTY(Double.valueOf(DROW_SPEC_QTY));
             m_med.setPKG_UNIT(PKG_UNIT.trim());
             m_med.setDIRECT_DLV_TYP(DIRECT_DLV_TYP.trim());
             m_med.setDLV_LOC_CD(DLV_LOC_CD.trim());
             m_med.setINSPC_TYP(INSPC_TYP.trim());
             m_med.setDLV_INST_TYP(DLV_INST_TYP.trim());
             m_med.setSCDL_DLV_DATE_1(SCDL_DLV_DATE[0].trim());
             m_med.setSCDL_DLV_QTY_1(Double.valueOf(SCDL_DLV_QTY[0]));
             m_med.setDLV_CD_1(DLV_CD[0].trim());
             m_med.setSCDL_DLV_DATE_2(SCDL_DLV_DATE[1].trim());
             m_med.setSCDL_DLV_QTY_2(Double.valueOf(SCDL_DLV_QTY[1]));
             m_med.setDLV_CD_2(DLV_CD[1].trim());
             m_med.setSCDL_DLV_DATE_3(SCDL_DLV_DATE[2].trim());
             m_med.setSCDL_DLV_QTY_3(Double.valueOf(SCDL_DLV_QTY[2]));
             m_med.setDLV_CD_3(DLV_CD[2].trim());
             m_med.setSCDL_DLV_DATE_4(SCDL_DLV_DATE[3].trim());
             m_med.setSCDL_DLV_QTY_4(Double.valueOf(SCDL_DLV_QTY[3]));
             m_med.setDLV_CD_4(DLV_CD[3].trim());
             m_med.setSCDL_DLV_DATE_5(SCDL_DLV_DATE[4].trim());
             m_med.setSCDL_DLV_QTY_5(Double.valueOf(SCDL_DLV_QTY[4]));
             m_med.setDLV_CD_5(DLV_CD[4].trim());
             m_med.setSCDL_DLV_DATE_6(SCDL_DLV_DATE[5].trim());
             m_med.setSCDL_DLV_QTY_6(Double.valueOf(SCDL_DLV_QTY[5]));
             m_med.setDLV_CD_6(DLV_CD[5].trim());
             m_med.setSCDL_DLV_DATE_7(SCDL_DLV_DATE[6].trim());
             m_med.setSCDL_DLV_QTY_7(Double.valueOf(SCDL_DLV_QTY[6]));
             m_med.setDLV_CD_7(DLV_CD[6].trim());
             m_med.setSCDL_DLV_DATE_8(SCDL_DLV_DATE[7].trim());
             m_med.setSCDL_DLV_QTY_8(Double.valueOf(SCDL_DLV_QTY[7]));
             m_med.setDLV_CD_8(DLV_CD[7].trim());
             m_med.setSCDL_DLV_DATE_9(SCDL_DLV_DATE[8].trim());
             m_med.setSCDL_DLV_QTY_9(Double.valueOf(SCDL_DLV_QTY[8]));
             m_med.setDLV_CD_9(DLV_CD[8].trim());
             m_med.setSCDL_DLV_DATE_10(SCDL_DLV_DATE[9].trim());
             m_med.setSCDL_DLV_QTY_10(Double.valueOf(SCDL_DLV_QTY[9]));
             m_med.setDLV_CD_10(DLV_CD[9].trim());
             m_med.setSCDL_DLV_DATE_11(SCDL_DLV_DATE[10].trim());
             m_med.setSCDL_DLV_QTY_11(Double.valueOf(SCDL_DLV_QTY[10]));
             m_med.setDLV_CD_11(DLV_CD[10].trim());
             m_med.setSCDL_DLV_DATE_12(SCDL_DLV_DATE[11].trim());
             m_med.setSCDL_DLV_QTY_12(Double.valueOf(SCDL_DLV_QTY[11]));
             m_med.setDLV_CD_12(DLV_CD[11].trim());
             m_med.setSCDL_DLV_DATE_13(SCDL_DLV_DATE[12].trim());
             m_med.setSCDL_DLV_QTY_13(Double.valueOf(SCDL_DLV_QTY[12]));
             m_med.setDLV_CD_13(DLV_CD[12].trim());
             m_med.setSCDL_DLV_DATE_14(SCDL_DLV_DATE[13].trim());
             m_med.setSCDL_DLV_QTY_14(Double.valueOf(SCDL_DLV_QTY[13]));
             m_med.setDLV_CD_14(DLV_CD[13].trim());
             m_med.setSCDL_DLV_DATE_15(SCDL_DLV_DATE[14].trim());
             m_med.setSCDL_DLV_QTY_15(Double.valueOf(SCDL_DLV_QTY[14]));
             m_med.setDLV_CD_15(DLV_CD[14].trim());
             m_med.setSCDL_DLV_DATE_16(SCDL_DLV_DATE[15].trim());
             m_med.setSCDL_DLV_QTY_16(Double.valueOf(SCDL_DLV_QTY[15]));
             m_med.setDLV_CD_16(DLV_CD[15].trim());
             m_med.setSCDL_DLV_DATE_17(SCDL_DLV_DATE[16].trim());
             m_med.setSCDL_DLV_QTY_17(Double.valueOf(SCDL_DLV_QTY[16]));
             m_med.setDLV_CD_17(DLV_CD[16].trim());
             m_med.setSCDL_DLV_DATE_18(SCDL_DLV_DATE[17].trim());
             m_med.setSCDL_DLV_QTY_18(Double.valueOf(SCDL_DLV_QTY[17]));
             m_med.setDLV_CD_18(DLV_CD[17].trim());
             m_med.setSCDL_DLV_DATE_19(SCDL_DLV_DATE[18].trim());
             m_med.setSCDL_DLV_QTY_19(Double.valueOf(SCDL_DLV_QTY[18]));
             m_med.setDLV_CD_19(DLV_CD[18].trim());
             m_med.setSCDL_DLV_DATE_20(SCDL_DLV_DATE[19].trim());
             m_med.setSCDL_DLV_QTY_20(Double.valueOf(SCDL_DLV_QTY[19]));
             m_med.setDLV_CD_20(DLV_CD[19].trim());
             m_med.setSCDL_DLV_DATE_21(SCDL_DLV_DATE[20].trim());
             m_med.setSCDL_DLV_QTY_21(Double.valueOf(SCDL_DLV_QTY[20]));
             m_med.setDLV_CD_21(DLV_CD[20].trim());
             m_med.setSCDL_DLV_DATE_22(SCDL_DLV_DATE[21].trim());
             m_med.setSCDL_DLV_QTY_22(Double.valueOf(SCDL_DLV_QTY[21]));
             m_med.setDLV_CD_22(DLV_CD[21].trim());
             m_med.setSCDL_DLV_DATE_23(SCDL_DLV_DATE[22].trim());
             m_med.setSCDL_DLV_QTY_23(Double.valueOf(SCDL_DLV_QTY[22]));
             m_med.setDLV_CD_23(DLV_CD[22].trim());
             m_med.setSCDL_DLV_DATE_24(SCDL_DLV_DATE[23].trim());
             m_med.setSCDL_DLV_QTY_24(Double.valueOf(SCDL_DLV_QTY[23]));
             m_med.setDLV_CD_24(DLV_CD[23].trim());
             m_med.setSCDL_DLV_DATE_25(SCDL_DLV_DATE[24].trim());
             m_med.setSCDL_DLV_QTY_25(Double.valueOf(SCDL_DLV_QTY[24]));
             m_med.setDLV_CD_25(DLV_CD[24].trim());
             m_med.setSCDL_DLV_DATE_26(SCDL_DLV_DATE[25].trim());
             m_med.setSCDL_DLV_QTY_26(Double.valueOf(SCDL_DLV_QTY[25]));
             m_med.setDLV_CD_26(DLV_CD[25].trim());
             m_med.setSCDL_DLV_DATE_27(SCDL_DLV_DATE[26].trim());
             m_med.setSCDL_DLV_QTY_27(Double.valueOf(SCDL_DLV_QTY[26]));
             m_med.setDLV_CD_27(DLV_CD[26].trim());
             m_med.setSCDL_DLV_DATE_28(SCDL_DLV_DATE[27].trim());
             m_med.setSCDL_DLV_QTY_28(Double.valueOf(SCDL_DLV_QTY[27]));
             m_med.setDLV_CD_28(DLV_CD[27].trim());
             m_med.setSCDL_DLV_DATE_29(SCDL_DLV_DATE[28].trim());
             m_med.setSCDL_DLV_QTY_29(Double.valueOf(SCDL_DLV_QTY[28]));
             m_med.setDLV_CD_29(DLV_CD[28].trim());
             m_med.setSCDL_DLV_DATE_30(SCDL_DLV_DATE[29].trim());
             m_med.setSCDL_DLV_QTY_30(Double.valueOf(SCDL_DLV_QTY[29]));
             m_med.setDLV_CD_30(DLV_CD[29].trim());
             m_med.setSCDL_DLV_DATE_31(SCDL_DLV_DATE[30].trim());
             m_med.setSCDL_DLV_QTY_31(Double.valueOf(SCDL_DLV_QTY[30]));
             m_med.setDLV_CD_31(DLV_CD[30].trim());
             m_med.setFREE_TEXT(FREE_TEXT);												//trim���Ȃ�
             m_med.setREMARKS(REMARKS);													//trim���Ȃ�
             m_med.setTAX_TYP(TAX_TYP.trim());
             m_med.setCUST_TAXATION_TYP(CUST_TAXATION_TYP.trim());
             m_med.setTAX_AMOUNT(Double.valueOf(TAX_AMOUNT));
       
             m_med.setPLANNING_ODR_CD(PLANNING_ODR_CD.trim());
             m_med.setPLANNING_ODR_DATE(PLANNING_ODR_DATE.trim());
             m_med.setSTANDARD_DLV_TERM(Double.valueOf(STANDARD_DLV_TERM));
             m_med.setREQUIRED_TERM(Double.valueOf(REQUIRED_TERM));
       
             m_med.setCUST_TOTAL_AMOUNT(Double.valueOf(CUST_TOTAL_AMOUNT));
             m_med.setUNCONFIRM_ODR_CD(UNCONFIRM_ODR_CD.trim());
             m_med.setUNCONFIRM_ODR_DATE(UNCONFIRM_ODR_DATE.trim());
             m_med.setUNCONFIRM_ODR_QTY(Double.valueOf(UNCONFIRM_ODR_QTY));
             m_med.setUNCONFIRM_ODR_AMOUNT(Double.valueOf(UNCONFIRM_ODR_AMOUNT));
             m_med.setESTIMATE_REQST_CD(ESTIMATE_REQST_CD.trim());
             m_med.setSTL_COND_CD(STL_COND_CD.trim());
             m_med.setEND_USER_NAME(END_USER_NAME.trim());
             m_med.setDLV_ZIP_CD(DLV_ZIP_CD.trim());
             m_med.setDLV_ADDRESS(DLV_ADDRESS.trim());
             m_med.setDLV_ADDRESSEE(DLV_ADDRESSEE.trim());
             m_med.setCUST_COMM_SUBNAME(CUST_COMM_SUBNAME.trim());
             m_med.setCUST_COMM_SUBCD(CUST_COMM_SUBCD.trim());
             m_med.setEND_USER_ODR_CD(END_USER_ODR_CD.trim());
             m_med.setCUST_DESINATED_MAKER(CUST_DESINATED_MAKER.trim());
             m_med.setDLV_KEY_NO_1(DLV_KEY_NO[0].trim());
             m_med.setDLV_KEY_NO_2(DLV_KEY_NO[1].trim());
             m_med.setDLV_KEY_NO_3(DLV_KEY_NO[2].trim());
             m_med.setDLV_KEY_NO_4(DLV_KEY_NO[3].trim());
             m_med.setDLV_KEY_NO_5(DLV_KEY_NO[4].trim());
             m_med.setDLV_KEY_NO_6(DLV_KEY_NO[5].trim());
             m_med.setDLV_KEY_NO_7(DLV_KEY_NO[6].trim());
             m_med.setDLV_KEY_NO_8(DLV_KEY_NO[7].trim());
             m_med.setDLV_KEY_NO_9(DLV_KEY_NO[8].trim());
             m_med.setDLV_KEY_NO_10(DLV_KEY_NO[9].trim());
             m_med.setDLV_KEY_NO_11(DLV_KEY_NO[10].trim());
             m_med.setDLV_KEY_NO_12(DLV_KEY_NO[11].trim());
             m_med.setDLV_KEY_NO_13(DLV_KEY_NO[12].trim());
             m_med.setDLV_KEY_NO_14(DLV_KEY_NO[13].trim());
             m_med.setDLV_KEY_NO_15(DLV_KEY_NO[14].trim());
             m_med.setDLV_KEY_NO_16(DLV_KEY_NO[15].trim());
             m_med.setDLV_KEY_NO_17(DLV_KEY_NO[16].trim());
             m_med.setDLV_KEY_NO_18(DLV_KEY_NO[17].trim());
             m_med.setDLV_KEY_NO_19(DLV_KEY_NO[18].trim());
             m_med.setDLV_KEY_NO_20(DLV_KEY_NO[19].trim());
             m_med.setDLV_KEY_NO_21(DLV_KEY_NO[20].trim());
             m_med.setDLV_KEY_NO_22(DLV_KEY_NO[21].trim());
             m_med.setDLV_KEY_NO_23(DLV_KEY_NO[22].trim());
             m_med.setDLV_KEY_NO_24(DLV_KEY_NO[23].trim());
             m_med.setDLV_KEY_NO_25(DLV_KEY_NO[24].trim());
             m_med.setDLV_KEY_NO_26(DLV_KEY_NO[25].trim());
             m_med.setDLV_KEY_NO_27(DLV_KEY_NO[26].trim());
             m_med.setDLV_KEY_NO_28(DLV_KEY_NO[27].trim());
             m_med.setDLV_KEY_NO_29(DLV_KEY_NO[28].trim());
             m_med.setDLV_KEY_NO_30(DLV_KEY_NO[29].trim());
             m_med.setDLV_KEY_NO_31(DLV_KEY_NO[30].trim());
             m_med.setDLV_LOC_NAME(DLV_LOC_NAME.trim());
             m_med.setCLIENT_BARCODE_INF(CLIENT_BARCODE_INF.trim());
             m_med.setCLIENT_REMARK(CLIENT_REMARK);												//trim���Ȃ�
             m_med.setCONTRACT_COND_TYP(CONTRACT_COND_TYP.trim());
             m_med.setPUCH_ODR_SHAP_TYP(PUCH_ODR_SHAP_TYP.trim());
             m_med.setMASTER_PUCH_ODR_CD(MASTER_PUCH_ODR_CD.trim());
             m_med.setQTY_CONTRACT_TYP(QTY_CONTRACT_TYP.trim());
             m_med.setODR_MODIFICATION_TYP_1(ODR_MODIFICATION_TYP[0].trim());
             m_med.setODR_MODIFICATION_TYP_2(ODR_MODIFICATION_TYP[1].trim());
             m_med.setODR_MODIFICATION_TYP_3(ODR_MODIFICATION_TYP[2].trim());
             m_med.setMACHINE_TYP_CD(MACHINE_TYP_CD.trim());
             m_med.setENGINNERING_CHG_CD(ENGINNERING_CHG_CD.trim());
             m_med.setDROW_SPEC_CD(DROW_SPEC_CD.trim());
             m_med.setDLV_DOC_FORM_1(DLV_DOC_FORM[0].trim());
             m_med.setDLV_DOC_COPY_NUM_1(Double.valueOf(DLV_DOC_COPY_NUM[0]));
             m_med.setDLV_DOC_LANG_1(DLV_DOC_LANG[0].trim());
             m_med.setDLV_DOC_FORM_2(DLV_DOC_FORM[1].trim());
             m_med.setDLV_DOC_COPY_NUM_2(Double.valueOf(DLV_DOC_COPY_NUM[1]));
             m_med.setDLV_DOC_LANG_2(DLV_DOC_LANG[1].trim());
             m_med.setDLV_DOC_FORM_3(DLV_DOC_FORM[2].trim());
             m_med.setDLV_DOC_COPY_NUM_3(Double.valueOf(DLV_DOC_COPY_NUM[2]));
             m_med.setDLV_DOC_LANG_3(DLV_DOC_LANG[2].trim());
             m_med.setDLV_DOC_FORM_4(DLV_DOC_FORM[3].trim());
             m_med.setDLV_DOC_COPY_NUM_4(Double.valueOf(DLV_DOC_COPY_NUM[3]));
             m_med.setDLV_DOC_LANG_4(DLV_DOC_LANG[3].trim());
             m_med.setSTRATEGIC_GOODS_TYP(STRATEGIC_GOODS_TYP.trim());
             m_med.setORGN_PLACE_CD_1(ORGN_PLACE_CD[0].trim());
             m_med.setORGN_PLACE_CD_2(ORGN_PLACE_CD[1].trim());
             m_med.setORGN_PLACE_CD_3(ORGN_PLACE_CD[2].trim());
             m_med.setORGN_PLACE_CD_4(ORGN_PLACE_CD[3].trim());
             m_med.setORGN_PLACE_CD_5(ORGN_PLACE_CD[4].trim());
             m_med.setDLV_TIME_1(DLV_TIME[0].trim());
             m_med.setDLV_TIME_2(DLV_TIME[1].trim());
             m_med.setDLV_TIME_3(DLV_TIME[2].trim());
             m_med.setDLV_TIME_4(DLV_TIME[3].trim());
             m_med.setDLV_TIME_5(DLV_TIME[4].trim());
             m_med.setDLV_TIME_6(DLV_TIME[5].trim());
             m_med.setDLV_TIME_7(DLV_TIME[6].trim());
             m_med.setDLV_TIME_8(DLV_TIME[7].trim());
             m_med.setDLV_TIME_9(DLV_TIME[8].trim());
             m_med.setDLV_TIME_10(DLV_TIME[9].trim());
             m_med.setDLV_TIME_11(DLV_TIME[10].trim());
             m_med.setDLV_TIME_12(DLV_TIME[11].trim());
             m_med.setDLV_TIME_13(DLV_TIME[12].trim());
             m_med.setDLV_TIME_14(DLV_TIME[13].trim());
             m_med.setDLV_TIME_15(DLV_TIME[14].trim());
             m_med.setDLV_TIME_16(DLV_TIME[15].trim());
             m_med.setDLV_TIME_17(DLV_TIME[16].trim());
             m_med.setDLV_TIME_18(DLV_TIME[17].trim());
             m_med.setDLV_TIME_19(DLV_TIME[18].trim());
             m_med.setDLV_TIME_20(DLV_TIME[19].trim());
             m_med.setDLV_TIME_21(DLV_TIME[20].trim());
             m_med.setDLV_TIME_22(DLV_TIME[21].trim());
             m_med.setDLV_TIME_23(DLV_TIME[22].trim());
             m_med.setDLV_TIME_24(DLV_TIME[23].trim());
             m_med.setDLV_TIME_25(DLV_TIME[24].trim());
             m_med.setDLV_TIME_26(DLV_TIME[25].trim());
             m_med.setDLV_TIME_27(DLV_TIME[26].trim());
             m_med.setDLV_TIME_28(DLV_TIME[27].trim());
             m_med.setDLV_TIME_29(DLV_TIME[28].trim());
             m_med.setDLV_TIME_30(DLV_TIME[29].trim());
             m_med.setDLV_TIME_31(DLV_TIME[30].trim());
             m_med.setPACKAGE_DLV_CD(PACKAGE_DLV_CD.trim());
             m_med.setSPEC(SPEC.trim());
             m_med.setBUYER_ORG_NAME(BUYER_ORG_NAME.trim());
             m_med.setDLV_PART_LEN_1(Double.valueOf(DLV_PART_LEN[0]));
             m_med.setDLV_PART_QTY_1(Double.valueOf(DLV_PART_QTY[0]));
             m_med.setDLV_PART_LEN_2(Double.valueOf(DLV_PART_LEN[1]));
             m_med.setDLV_PART_QTY_2(Double.valueOf(DLV_PART_QTY[1]));
             m_med.setDLV_PART_LEN_3(Double.valueOf(DLV_PART_LEN[2]));
             m_med.setDLV_PART_QTY_3(Double.valueOf(DLV_PART_QTY[2]));
             m_med.setDLV_PART_LEN_4(Double.valueOf(DLV_PART_LEN[3]));
             m_med.setDLV_PART_QTY_4(Double.valueOf(DLV_PART_QTY[3]));
             m_med.setDLV_PART_LEN_5(Double.valueOf(DLV_PART_LEN[4]));
             m_med.setDLV_PART_QTY_5(Double.valueOf(DLV_PART_QTY[4]));
             m_med.setDLV_PART_LEN_6(Double.valueOf(DLV_PART_LEN[5]));
             m_med.setDLV_PART_QTY_6(Double.valueOf(DLV_PART_QTY[5]));
             m_med.setDLV_PART_LEN_7(Double.valueOf(DLV_PART_LEN[6]));
             m_med.setDLV_PART_QTY_7(Double.valueOf(DLV_PART_QTY[6]));
             m_med.setDLV_PART_LEN_8(Double.valueOf(DLV_PART_LEN[7]));
             m_med.setDLV_PART_QTY_8(Double.valueOf(DLV_PART_QTY[7]));
             m_med.setDLV_PART_LEN_9(Double.valueOf(DLV_PART_LEN[8]));
             m_med.setDLV_PART_QTY_9(Double.valueOf(DLV_PART_QTY[8]));
             m_med.setDLV_PART_LEN_10(Double.valueOf(DLV_PART_LEN[9]));
             m_med.setDLV_PART_QTY_10(Double.valueOf(DLV_PART_QTY[9]));
             m_med.setDLV_PART_UNIT(DLV_PART_UNIT.trim());
             m_med.setCUST_CONSTRUCT_NAME(CUST_CONSTRUCT_NAME.trim());
             m_med.setMATERIAL_CD(MATERIAL_CD.trim());
             m_med.setMATERIAL_UNIT_PRICE(Double.valueOf(MATERIAL_UNIT_PRICE));
             m_med.setMATERIAL_UNIT(MATERIAL_UNIT.trim());
             m_med.setTEST_REPORT_NEED_TYP(TEST_REPORT_NEED_TYP.trim());
             m_med.setTEST_REPORT_CHK_TYP(TEST_REPORT_CHK_TYP.trim());
             m_med.setTEST_REPORT_PRESENT_TYP(TEST_REPORT_PRESENT_TYP.trim());
             m_med.setMUNICIPAL_CD(MUNICIPAL_CD.trim());
             m_med.setDLV_CONTACT_TEL(DLV_CONTACT_TEL.trim());
             m_med.setSLIP_PRICE_PRINT_TYP(SLIP_PRICE_PRINT_TYP.trim());
             m_med.setBUYER_NAME_KANJI(BUYER_NAME_KANJI.trim());
             m_med.setSPEC_KANJI(SPEC_KANJI.trim());
             m_med.setITEM_NAME_KANJI(ITEM_NAME_KANJI.trim());
             m_med.setREMARKS_KANJI(REMARKS_KANJI.trim());
             m_med.setEND_USER_NAME_KANJI(END_USER_NAME_KANJI.trim());
             m_med.setDLV_ADDRESS_KANJI(DLV_ADDRESS_KANJI.trim());
             m_med.setDLV_ADDRESSEE_KANJI(DLV_ADDRESSEE_KANJI.trim());
             m_med.setEND_USER_ITEM_NAME_KANJI(END_USER_ITEM_NAME_KANJI.trim());
             m_med.setCUST_DESINATED_MAKER_KANJI(CUST_DESINATED_MAKER_KANJI.trim());
             m_med.setDLV_LOC_NAME_KANJI(DLV_LOC_NAME_KANJI.trim());
             m_med.setCLIENT_REMARK_KANJI(CLIENT_REMARK_KANJI.trim());
             m_med.setMACHINE_TYPE_NAME_KANJI(MACHINE_TYPE_NAME_KANJI.trim());
             m_med.setCUST_SPC_KANJI(CUST_SPC_KANJI.trim());
             m_med.setBUYER_ORG_NAME_KANJI(BUYER_ORG_NAME_KANJI.trim());
             m_med.setCUST_CONSTRUCT_NAME_KANJI(CUST_CONSTRUCT_NAME_KANJI.trim());
             m_med.setCUR_CD(CUR_CD.trim());
             m_med.setUNIT_PRICE_EXCH_RATES(Double.valueOf(UNIT_PRICE_EXCH_RATES));
             m_med.setODR_AMOUNT_EXCH_RATES(Double.valueOf(ODR_AMOUNT_EXCH_RATES));
             m_med.setTAX_AMOUNT_EXCH_RATES(Double.valueOf(TAX_AMOUNT_EXCH_RATES));
             m_med.setTOTAL_AMOUNT_EXCH_RATES(Double.valueOf(TOTAL_AMOUNT_EXCH_RATES));
             m_med.setUNCONFIRM_AMOUNT_EXCH_RATES(Double.valueOf(UNCONFIRM_AMOUNT_EXCH_RATES));
             m_med.setMATERIAL_CD_EXCH_RATES(Double.valueOf(MATERIAL_CD_EXCH_RATES));
       
             //=======================================
             // �������IF�Ǘ��ԍ����̔Ԃ���
             //=======================================
             if(m_med.getSEQ_ODR_INFO_IF_CTRL_NO().read() != SUCCESS){
              throw new Exception();
             }else if(m_med.getSEQ_ODR_INFO_IF_CTRL_NO().next() == false){
              //�󒍊Ǘ��ԍ��̔ԃG���[
              this.writeLogMessage("KV02104",m_med.getSEQ_ODR_INFO_IF_CTRL_NO().toString());
              continue;
             }
             
             //=======================================
             // �������IF(EDI)�ɍs��ǉ�����
             //=======================================
             int rv = m_med.getT_ODR_INFO_EDI_IF().create();
        
            }
            conn.commit();
            // =========================================
            // ���탍�O���o�͂��A���̃t�@�C������������
            // =========================================
            this.writeLogMessage("KV02106");
            this.writeLogMessageInfo("TotalRecord",Integer.toString(rec));
           }catch(Exception e){
           	try {
            conn.rollback();
            e.printStackTrace();
            // =========================================
            // �G���[���O���o�͂��A���̃t�@�C������������
            // =========================================
            this.writeLogMessage("KV02105");
            this.writeLogMessageInfo("ErrorRecord",Integer.toString(rec+1));
       
            // �R�l�N�V������n���āA�̔Ԃ̏���
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            // ����IF(EDI)���͑Ώۃf�[�^�̎擾�Ɏ��s���܂����B
            String strMsgCd = "KV02103";
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
            }
       
           }
       
       //-----------------------------------------------------------------------------
       //		����IF(EDI)���͏����i�����܂Łj
       //-----------------------------------------------------------------------------
          }catch(Exception e) {
           try {
           conn.rollback();
           e.printStackTrace();
            // �R�l�N�V������n���āA�̔Ԃ̏���
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            // ����IF(EDI)���͑Ώۃf�[�^�̎擾�Ɏ��s���܂����B
            String strMsgCd = "KV02103";
            String strDataString = "(SBM0608)<< ����IF(EDI)���̓o�b�`�ُ팟�o >>";
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
           // ����IF(EDI)���̓o�b�`�����ɂĒv���I�ȃG���[���������܂����B
           String strMsgCd = "KV02103";
           String strDataString = "(SBM0608)<< ����IF(EDI)���̓o�b�`�ُ팟�o >>";
           businessMsgAcc.init(conn);
           businessMsg.setBusinessOperatingName(strBusinessName);
           businessMsg.setUser(strUserId);
           businessMsg.setPlantCode(strMsgPlantCd);
           businessMsg.setLogCode(logCd.getNo());
       //kis businessMsg.setLogCode("d" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
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
				String strMsgCd = "KV02102";
				String strDataString = "(SBM0609)<< ����IF(EDI)���̓o�b�`�����I�� >>";
				//kis businessMsg.setLogCode("e" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
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
		public medKV0020B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0020B001 med) throws BatchAppException
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
