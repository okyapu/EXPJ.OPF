/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0060/src/com/nec/jp/orteus/metamorBase/AC0060/AC0060B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0060.AC0060B001;

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
//------------------------------------------------------------------
// 2004/02/17 M.Hotokebuchi
//------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common01.ExtPlanExp.ExtPlanExpProcess;
import com.nec.jp.orteus.expj.util.*;
//------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.17 $ $Date: 2016/05/23 08:00:00 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2004/2/17),�V�K�쐬
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
	public medAC0060B001 m_med=null;

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
	public CtrlMain(medAC0060B001 med, BatchAppConductor cdr) throws BatchAppException
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
        //////////////////////////////
        // �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���
        //------------------------------------------------------------------
        // 2004/02/17 M.Hotokebuchi
        //------------------------------------------------------------------
        ////////////////////////////////////////////////////////////////////////////
        // �G���[���X�g
        List errCodeList = new ArrayList();
        // �G���[�m�[�g
        Hashtable errNoteHash = new Hashtable();
        //�G���[�m�[�g�Z�b�^�[
        public void setErrNote(String note){
         errNoteHash.put(Integer.toString(errCodeList.size()-1),note);
        }
       
        ////////////////////////////////////////////////////////////////////////////
        /**
         * �Ɩ����b�Z�[�W�o�^����
         *
         * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
         * @param	userId			���[�U�R�[�h
         * @param	plantCd			�H��R�[�h
         * @param	businessName	�Ɩ���
         * @return	true:���� / false:���s
         */
        private boolean businessMessageWrite(
         IDbConnection conn, 
         String userId, 
         String plantCd, 
         String businessName)
        {
         boolean bResult = true;
         try
         {
          // metamorBase�Ɩ����b�Z�[�W
          BusinessMessageAccessor businessMsgAcc = null;
          BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W
       
          // �Ɩ����b�Z�[�W�̏���
          businessMsgAcc = new BusinessMessageAccessor();
          businessMsg = new BusinessMessage();
          businessMsgAcc.init(conn);
          businessMsg.setBusinessOperatingName(businessName);
          businessMsg.setUser(userId);
          businessMsg.setPlantCode(plantCd);
       
          // �Ɩ����b�Z�[�W�̓o�^
          String errCode;
          String errNote;
          for(int i = 0; i < errCodeList.size(); i++)
          {
           errCode = (String)errCodeList.get(i);
           errNote = (String)errNoteHash.get(Integer.toString(i));
           try{
            Numbering numbering = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
            businessMsg.setLogCode(numbering.getNo());
            businessMsg.setMessageCode(errCode);
            businessMsg.setData(errNote);
            businessMsgAcc.add(businessMsg);
            System.out.println("(SBM0836)�������@�Ɩ����b�Z�[�W�̓o�^�@������ <" + (i+1) + "/" + errCodeList.size() + ">");
            System.out.println("�@�@��No:" + businessMsg.getLogCode() + " errCode:" + errCode + " errNote:" + errNote + " businessMsg:" + businessMsg);
       
           } catch (Exception ex) {
            ex.printStackTrace();
           }
          }
         }
         catch(Exception e)
         {
          e.printStackTrace();
       
          // �G���[
          bResult = false;
         }
         return bResult;
        }
       
        /**
         * CtrlMain�N���X�̕W���R���X�g���N�^
         *
         * @return �Ȃ�
         */
        public CtrlMain(medAC0060B001 med) throws BatchAppException
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
               //------------------------------------------------------------------
         // 2004/02/17 M.Hotokebuchi
               //------------------------------------------------------------------
         System.out.println("(SBM0837)�o�b�`�����J�n");
         // ���ʕϐ� ========================================================
         IDbConnection conn = null;		// DB�R�l�N�V����
         BusinessLock Lock = null;		// �Ɩ����b�N
         int lockCancelKey = -1;			// ���b�N�����L�[
       
         // �o�b�`�������ʃG���[����
         String errMsg = "";				// �G���[���b�Z�[�W
       
         // ��ԃo�b�`���}�j���A����
         int batchProcessingTyp = 0;		// 1: ��ԃo�b�`�i�����^�]�j2: �}�j���A���i�����^�]�Ȃ��j
       
         // �p�����[�^
         String businessName = null;		// �Ɩ����i�o�b�`����ID�j
         String userId = null;			// ���[�UID
         String plantCd = null;			// �H��R�[�h
       
         // ���ʏ��� ========================================================
         // �Ɩ����i�o�b�`����ID�j�̎擾(AC0060B0001)
         Class myClass = this.getClass();
         businessName = myClass.getName();
         businessName = businessName.substring(businessName.length()-19, businessName.length()-9);
       
         // main�����󂯎��
         String args[] = m_med.getArgs();
         int argsLength = args.length;   // �����̌���ێ�
       
         try {
          // �R�l�N�V�����̎擾
          ScreenParam sp = new ScreenParam(this.getClass());
          conn = m_conductor.m_transactionConn;
       
          // �����̌��`�F�b�N ----------------------------------------------
          if(argsLength != 4)
          {
           // �o�b�`���������̌`�����s���ł�
           userId = "SYSTEM";
           plantCd = "##";
           errCodeList.add("AC10034");
           setErrNote("(SBM0617)�o�b�`�����������F[ " + argsLength + " ]");
           System.out.println("(SBM0838)�����̐����s���ł��B");
           throw new Exception();
          }
       
          // �����擾�ݒ� ----------------------------------------------------
          // ���[�U�R�[�h�擾
          userId = args[1];
       
          // �H��R�[�h�擾
          plantCd = args[2];
       
          // �܂�߃t���O�擾
          Boolean roundFlg = new Boolean(args[3]);
       
          // �������e�́unull�v�`�F�b�N�i�K�{���ځj---------------------------
          if(userId == null || userId.equals("null") || userId.equals("Null") || userId.equals("NULL"))
          {
           // �o�b�`���������̌`�����s���ł�
           errCodeList.add("AC10034");
           setErrNote("(SBM0619)���[�U�R�[�h�F[ " + userId + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           System.out.println("(SBM0839)���[�U�R�[�h�������͂ł��B");
           throw new Exception();
          }
          if(plantCd == null || plantCd.equals("null") || plantCd.equals("Null") || plantCd.equals("NULL"))
          {
           // �o�b�`���������̌`�����s���ł�
           errCodeList.add("AC10034");
           setErrNote("(SBM0620)�H��R�[�h�F[ " + plantCd + " ]");
           userId = "SYSTEM";
           plantCd = "##";
           System.out.println("(SBM0840)�H��R�[�h�������͂ł��B");
           throw new Exception();
          }
       
          // �o�b�`�����敪�擾
          try {
           batchProcessingTyp = Integer.parseInt(args[0]);	
          } catch (NumberFormatException e) {
           batchProcessingTyp = 0;
          }
          if(batchProcessingTyp != 1 && batchProcessingTyp != 2)
          {
           // �o�b�`���������̌`�����s���ł�
           errCodeList.add("AC10034");
           setErrNote("(SBM0621)�o�b�`�v���Z�X�^�C�v�F[ " + batchProcessingTyp + " ]");
           System.out.println("(SBM0841)�o�b�`�v���Z�X�^�C�v���s���ł��B");
           throw new Exception();
          }
       
          // �Ɩ����b�N��������
          System.out.println("(SBM0842)�������@�Ɩ����b�N�J�n�@������");
          Lock = new BusinessLock(conn, userId, plantCd);
          lockCancelKey = Lock.doLock(businessName);  // �����L�[�̎擾
          conn.commit();
          if(lockCancelKey == -1)
          {
           errCodeList.add("ZZ01001");// �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
           setErrNote("(SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]");
           System.out.println("(SBM0843)�Ɩ����b�N����Ă��邽�ߋN���ł��܂���B");
           throw new Exception();
          }
       
         ///////////////////////////////////////////////////////////////////
         // OPF��p���� �͂���
       
          // �����v�ʓW�J����
          ExtPlanExpProcess extTest = new ExtPlanExpProcess(conn, userId, plantCd, businessName, roundFlg.booleanValue());
          extTest.execute();
       
         // OPF��p���� �����
         ///////////////////////////////////////////////////////////////////
       
         } catch (Exception e) {
          e.printStackTrace();
          if(errCodeList.size() == 0)
          {
           // �G���[���b�Z�[�W�̍쐬
           if (e.getMessage() != null)
           {
            errMsg += " " + e.getMessage();
           }
           errMsg += " (SBM0580)���[�U�R�[�h�F[ " + userId + " ] �H��R�[�h�F[ " + plantCd + " ]";
           errCodeList.add("AC53402");//���̑��@�d��������
           setErrNote(errMsg);
           System.out.println("(SBM0844)���̑��@�d���������F");
          }
       
         } finally {
       
          // �Ɩ����b�Z�[�W�o�^����
          businessMessageWrite(conn, userId, plantCd, businessName);
       
          try {
           if(lockCancelKey != -1)
           {
            // �Ɩ����b�N����
            System.out.println("(SBM1344)�������@�Ɩ����b�N�����@������");
            Lock.doUnLock(businessName, lockCancelKey);
            conn.commit();
           }
       
          } catch (FoundationException e) {
           e.printStackTrace();
           errCodeList.add("ZZ01004");// �Ɩ����b�N�̉����Ɏ��s���܂����B
           setErrNote("");
           System.out.println("(SBM0846)�Ɩ����b�N�̉����Ɏ��s���܂����B");
       
           // �Ɩ����b�Z�[�W�o�^����
           businessMessageWrite(conn, userId, plantCd, businessName);
          }
         }
         // ���ʏ��� �I��� =============================================
               //------------------------------------------------------------------
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
		public medAC0060B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAC0060B001 med) throws BatchAppException
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
