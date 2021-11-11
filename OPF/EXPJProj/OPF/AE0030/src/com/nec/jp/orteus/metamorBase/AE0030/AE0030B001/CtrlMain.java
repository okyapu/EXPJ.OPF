/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0030.AE0030B001;

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
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.
        BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.expj.util.ExpjMessage;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.21 $ $Date: 2014/11/05 07:09:54 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2003/10/3),�V�K�쐬
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
	public medAE0030B001 m_med=null;

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
	public CtrlMain(medAE0030B001 med, BatchAppConductor cdr) throws BatchAppException
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
       
           /**
            * CtrlMain�N���X�̕W���R���X�g���N�^
            *
            * @return �Ȃ�
            */
           public CtrlMain(medAE0030B001 med) throws BatchAppException {
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
           public void finalize() {
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
           public int main() throws BatchAppException {
               /*
                 // todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
                */
               // ������
               int nret = 0;
               BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
               BusinessMessage businessMsg = new BusinessMessage();
               String errCode = ""; //�G���[�R�[�h�̏���
               String errMsg = ""; //�G���[���b�Z�[�W�̏���
               BusinessLock Lock = null;
               int lockCancelKey = 0; // ���b�N�����L�[
               IDbConnection conn = null; // DB�ڑ�
               String functionName = "SQLPUCHODRINST"; // �X�g�A�h�v���V�[�W����
               List callList; //�X�g�A�h�v���V�[�W���߂�l
       
               // �����󂯎��
               String args[] = m_med.getArgs();
       		   
           	   //�������_�u���N�H�[�e�[�V�����Ŋ����Ă����ꍇ�폜�iLINUX�Ή��j
			   for(int i = 0; i < args.length; i++){
			   		if((args[i].indexOf("\"") == 0 && args[i].lastIndexOf("\"") == args[i].length()-1)){
			   			args[i] = args[i].substring( args[i].indexOf("\"") + 1,args[i].lastIndexOf("\""));
			   		}
			   }
           	
               // �p�����[�^�m�F
               System.out.println("-----------------------------------------------");
               System.out.println("functionName:" + functionName); // �X�g�A�h�v���V�[�W����
               System.out.println("args[0]:" + args[0]);
               System.out.println("args[1]:" + args[1]);
               System.out.println("args[2]:" + args[2]);
               System.out.println("args[3]:" + args[3]);
               System.out.println("args[4]:" + args[4]);
               System.out.println("args[5]:" + args[5]);
               System.out.println("args[6]:" + args[6]);
               System.out.println("args[7]:" + args[7]);
               System.out.println("args[8]:" + args[8]);
               System.out.println("args[9]:" + args[9]);
               System.out.println("args[10]:" + args[10]);
               System.out.println("-----------------------------------------------");
               // �o�b�`�I�����b�Z�[�W�̏���
               
           	   //20070509 takahashi��
           	   //String memoText = ""; // ���l���b�Z�[�W
               //20070509 takahashi��
           	
               // ���Ɩ����̐ݒ�
               Class myClass = this.getClass();
               String myProgramName = myClass.getName();
               myProgramName = myProgramName.substring(myProgramName.length() - 19,
                                                       myProgramName.length() - 9);
               System.out.println("BAT_BRG:" + myProgramName); // �o�b�`�Ɩ���
       
               try {
                   try {
                       // DB�ڑ��擾����
                       conn = m_conductor.m_transactionConn;
       
                       // �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
                       businessMsgAcc.init(conn);
                       businessMsg.setBusinessOperatingName(args[0]);
                       businessMsg.setUser(args[1]);
                       businessMsg.setPlantCode(args[2]);
       
                       // �R�l�N�V�����E���[�U�h�c�E�H��R�[�h��n���āA�Ɩ����b�N�N���X���쐬
                       Lock = new BusinessLock(conn, args[1], args[2]);
       
                       // �Ɩ����b�N�擾
                       lockCancelKey = Lock.doLock(myProgramName);
                       // ���b�N�Ɏ��s�����ꍇ
           if (lockCancelKey == -1) {
            throw new Exception(); 
           }
                       conn.commit();
       
                       System.out.println("LOCK_KY:" + lockCancelKey);
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ01001";
                       // �Ɩ����b�Z�[�W�̓o�^
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                   	
                   	   //20070509 takahashi��
                       //memoText = errMsg; // ���l���b�Z�[�W
                       //20070509 takahashi��
                   	
                   	   System.out.println("errMsg:" + errMsg);
                       throw new BatchAppException("CtrlMain", "main", errMsg);
                   }
       
                   try {
                       // �����ݒ�
                       m_med.setPROGRAM_CD(args[0]);
                       m_med.setFUNCTION_NAME(functionName);
       
                       // �p�����[�^�Ǎ�
                       nret = m_med.getSelectSYS_BAT_PARM().read();
       
                       if (m_med.getSelectSYS_BAT_PARM().next() == false) {
                           throw new Exception();
                       } else {
                           // �߂�l�\��
                           System.out.println("nret:" + nret);
                           System.out.println("--------------------------------------");
                           System.out.println("PROGRAM_CD:" + m_med.getPROGRAM_CD());
                           System.out.println("FUNCTION_NAME:" +
                                              m_med.getFUNCTION_NAME());
                           System.out.println("LOG_MODE_TYP:" + m_med.getLOG_MODE_TYP());
                           System.out.println("OUTPUT_MODE_TYP:" +
                                              m_med.getOUTPUT_MODE_TYP());
                           System.out.println("FILE_PATH:" + m_med.getFILE_PATH());
                           System.out.println("FILE_NAME:" + m_med.getFILE_NAME());
                           System.out.println("BUSINESS_GROUP_CD:" +
                                              m_med.getBUSINESS_GROUP_CD());
                           System.out.println("BUSINESS_CD:" + m_med.getBUSINESS_CD());
                           System.out.println("--------------------------------------");
                       }
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ09007";
                       // �Ɩ����b�Z�[�W�̓o�^
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("(SBM0579)�ڂ�������1023byte�ȓ��ŋL�q���܂��B");
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                   	
                   	   //20070509 takahashi��
                       //memoText = errMsg; // ���l���b�Z�[�W
                       //20070509 takahashi��
                   	
                   	   System.out.println("errMsg:" + errMsg);
                       throw new BatchAppException("CtrlMain", "main", errMsg);
                   }
       
                   try {
                       // �����ݒ�
                       m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP().toString());
                       m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP().toString());
                       m_med.setpvc2OutputPath(m_med.getFILE_PATH());
                       m_med.setpvc2OutputName(m_med.getFILE_NAME());
                       m_med.setpvc2UserId(args[1]);
                       m_med.setpvc2BusinessName(args[0]);
                       m_med.setpvc2PlantCd(args[2]);
                       m_med.setpvc2StartDate(args[3]);
                       m_med.setpvc2DlvDate(args[4]);
                       m_med.setpvc2PuchOdrCd(args[5]);
                       m_med.setpvc2VendCd(args[6]);
                       m_med.setpvc2PuchOdrPerson(args[7]);
                       m_med.setpvc2JobOdrCd(args[8]);
                       m_med.setpvc2ApprPurInst(args[9]);
                       m_med.setpvc2ApprPowerTyp(args[10]);
       
                       System.out.println("--------------------------------------");
                       System.out.println("pvc2LogMode:" + m_med.getpvc2LogMode());
                       System.out.println("pvc2OutputMode:" + m_med.getpvc2OutputMode());
                       System.out.println("pvc2OutputPath:" + m_med.getpvc2OutputPath());
                       System.out.println("pvc2OutputName:" + m_med.getpvc2OutputName());
                       System.out.println("pvc2UserId:" + m_med.getpvc2UserId());
                       System.out.println("pvc2BusinessName:" +
                                          m_med.getpvc2BusinessName());
                       System.out.println("pvc2PlantCd:" + m_med.getpvc2PlantCd());
                       System.out.println("pvc2StartDate:" + m_med.getpvc2StartDate());
                       System.out.println("pvc2DlvDate:" + m_med.getpvc2DlvDate());
                       System.out.println("pvc2PuchOdrCd:" + m_med.getpvc2PuchOdrCd());
                       System.out.println("pvc2VendCd:" + m_med.getpvc2VendCd());
                       System.out.println("pvc2PuchOdrPerson:" +
                                          m_med.getpvc2PuchOdrPerson());
                       System.out.println("pvc2JobOdrCd:" + m_med.getpvc2JobOdrCd());
                       System.out.println("pvc2ApprPurInst:" + m_med.getpvc2ApprPurInst());
                       System.out.println("pvc2ApprPowerTyp:" + m_med.getpvc2ApprPowerTyp());
                       System.out.println("--------------------------------------");
                       // �������s
                       callList = m_med.getCallSQLPUCHODRINST().call();
                       if (callList != null) {
                           nret = callList.size();
                       } else {
                           throw new Exception();
                       }
       
                       // �߂�l�\��
                       System.out.println("nret:" + nret);
                       errCode = "ZZ09002";
       
                       // �ȉ��APL/SQL���ŏI�����b�Z�[�W��\�����Ă��邽�߁A
                       // �o�b�`�����W������܂ŃR�����g�A�E�g�Ƃ���B
           /*
                       // �Ɩ����b�Z�[�W�̓o�^�i����I�����j
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
                       */
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                   	   
                   	   //20070509 takahashi��
                       //memoText = errMsg; // ���l���b�Z�[�W
                       //20070509 takahashi��
                   	
                   	   System.out.println("errMsg:" + errMsg);
       
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ01106";
                       // �Ɩ����b�Z�[�W�̓o�^
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                       System.out.println("errMsg:" + errMsg);
                   	   
                   	   //20070509 takahashi��
                       //memoText = errMsg; // ���l���b�Z�[�W
                       //20070509 takahashi��
                   	
                   	   throw new BatchAppException("CtrlMain", "main", errMsg);
                   }
               } finally {
                   try {
                       // �Ɩ����b�N����
                       System.out.println("(SBM0658)�Ɩ����b�N����");
                       Lock.doUnLock(myProgramName, lockCancelKey);
                       conn.commit();
                   } catch (Exception e) {
                       e.printStackTrace();
       
                       errCode = "ZZ01004";
                       // �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
                       businessMsg.setMessageCode(errCode);
                       businessMsg.setData("");
                       try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                           businessMsgAcc.add(businessMsg);
                       } catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                       ExpjMessage msg = new ExpjMessage(errCode);
                       errMsg = errCode + " " + msg.getMessage(CoreTools.getLocale(args[1]));
                       System.out.println("errMsg:" + errMsg);
                   	
                   	   //20070509 takahashi��
                       //memoText = errMsg; // ���l���b�Z�[�W
                       //20070509 takahashi��
                   }
                   /*
                    �e�X�g�p�����[�X���̓R�����g��
                                  finally {
                           try { // �o�b�`�I�����b�Z�[�W���M
                                   System.out.println("�o�b�`�I�����b�Z�[�W���M");
                                   Business business = Business.getStartBusiness
                            (m_med.getBUSINESS_GROUP_CD(), args[1], m_med.getBUSINESS_CD());
                            business.setMessageDisplayLevel(1); // �\�����x��(�d�v�x)�̎w��
                                   business.setMessageReference(memoText); // ���l�̎w��
                                   business.complete();
                           }
                           catch(MessageApiException e) {
                                   e.printStackTrace();
                                   errCode = "ZZ09008";
                                   // �Ɩ����b�Z�[�W�̓o�^�i�o�b�`�I�����b�Z�[�W���M���s���j
                                   businessMsg.setMessageCode(errCode);
                                   businessMsg.setData("");
                                   try {
                           Numbering logCd = new Numbering(m_conductor.
                                   m_transactionConn,
                                   Numbering.LOG_CD,
                                   args[1],
                                   args[0],
                                   args[2]);
                           businessMsg.setLogCode(logCd.getNo());
                                           businessMsgAcc.add(businessMsg);
                                   }
                                           catch (Exception ex) {
                                           ex.printStackTrace();
                                   }
                                   AlarmMessage msg = new AlarmMessage(errCode);
                                   errMsg = errCode + " " + msg.getMessage();
                                   System.out.println("errMsg:" + errMsg);
                           }
                                    }
                                     �e�X�g�p�����[�X���̓R�����g��
                    */
               }
               return BREAK;
           }
       
       
           //////////////////////////////
       
           /**
            * object�^��Ԃ��܂�
            *
            * @return object�^
            */
           public int getType() {
               return m_control.getType();
           }
       
           /**
            * ��������
            *
            * @return <<�R�����g���L�q���Ă�������>>
            * @exception <<�R�����g���L�q���Ă�������>>
            */
           public int beginProc() throws BatchAppException {
       
               // todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
       
               return m_control.beginProc();
           }
       
           /**
            * �I������
            *
            * @exception <<�R�����g���L�q���Ă�������>>
            */
           public int endProc() throws BatchAppException {
       
               // todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
       
               return m_control.endProc();
           }
       
           /**
            * �I������
            *
            * @exception <<�R�����g���L�q���Ă�������>>
            */
           public int execute() throws BatchAppException {
       
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
		public medAE0030B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAE0030B001 med) throws BatchAppException
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
