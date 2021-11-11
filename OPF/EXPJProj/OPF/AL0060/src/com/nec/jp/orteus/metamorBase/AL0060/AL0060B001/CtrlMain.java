/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0060/src/com/nec/jp/orteus/metamorBase/AL0060/AL0060B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0060.AL0060B001;

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

import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import java.text.SimpleDateFormat;
import java.text.ParseException;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:19:54 $
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
	public medAL0060B001 m_med=null;

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
	public CtrlMain(medAL0060B001 med, BatchAppConductor cdr) throws BatchAppException
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
         */
        public CtrlMain(medAL0060B001 med) throws BatchAppException
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
       
           // �ϐ��錾 ========================================================
           int nret = 0;
           IDbConnection conn = null;	  // DB�R�l�N�V����
           BusinessLock Lock = null;     // �Ɩ����b�N
           int lockCancelKey = 0;	      // ���b�N�����L�[
       
           // �o�b�`�������ʃG���[����
        String errCode = null;		  // �G���[�R�[�h
        String errMsg = null;		  // �G���[���b�Z�[�W
           String errNote = "";          // �G���[���b�Z�[�W(���l)
       
           // metamorBase�Ɩ����b�Z�[�W
           BusinessMessageAccessor businessMsgAcc = null;
        BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W
           String businessErrCode = null;          // metamorBase�Ɩ����b�Z�[�W�R�[�h
       
           // Orteus�Ɩ����b�Z�[�W
           String memoText = "";         // Orteus�Ɩ����b�Z�[�W ���l
       
           // �X�g�A�h�v���V�[�W����
           String functionName = null;
       
           // �X�g�A�h�v���V�[�W���p�����[�^
           String LogMode = null;        // ���O���[�h
           String OutputMode = null;     // �o�̓��[�h
           String OutputPath = null;     // �o�̓p�X
           String OutputName = null;     // �o�̓t�@�C����
           String UserId = null;         // ���[�UID
           String BusinessName = null;   // �Ɩ����i�o�b�`����ID�j
           String PlantCd = null;        // �H��R�[�h
           String CalcFromDate = null;   // ���׎R�ϑΏۊ���(FROM)
           String CalcToDate = null;     // ���׎R�ϑΏۊ���(To)
           // ===============================================================
       
        //���� ===========================================================
       
        //�t�@���N�V������
        functionName = "SQLLOADCALCBAT"; //���׎R��
       
        //�����󂯎��
        String args[] = m_med.getArgs();
        int argsLength = args.length; //�����̌��ێ�
       
        //�o�b�`����ID(�Ɩ���)�擾
        Class myClass = this.getClass();
        String myBusinessName = myClass.getName();
        myBusinessName = myBusinessName.substring(myBusinessName.length()-19,myBusinessName.length()-9);
       
        try{
         //2003.10.27 �Ɩ����b�N�����C��
            try{
             if(argsLength == 5){
             }else{
                       businessErrCode = "AL60004"; // �������s�����Ă��܂�
                       errCode = businessErrCode;
                    // �G���[���b�Z�[�W�̍쐬
                    AlarmMessage msg = new AlarmMessage(errCode);
                    errMsg = "[" + errCode + "]" + msg.getMessage();
                    throw new Exception();
             }
             //2003.11.06 �R�}���h�p�@�����Ɂunull�v�������Ă����ꍇ�̃`�F�b�N
          if(myBusinessName == null || myBusinessName.equals("null") || myBusinessName.equals("Null") || myBusinessName.equals("NULL")){
                       businessErrCode = "ZZ09007"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[1] == null || args[1].equals("null") || args[1].equals("Null") || args[1].equals("NULL")){
                       businessErrCode = "ZZ09007"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[2] == null || args[2].equals("null") || args[2].equals("Null") || args[2].equals("NULL")){
                       businessErrCode = "ZZ09007"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[3] == null || args[3].equals("null") || args[3].equals("Null") || args[3].equals("NULL")){
                       businessErrCode = "ZZ09007"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
                       errCode = businessErrCode;
           throw new Exception();
          }
          if(args[4] == null || args[4].equals("null") || args[4].equals("Null") || args[4].equals("NULL")){
                       businessErrCode = "ZZ09007"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
                       errCode = businessErrCode;
           throw new Exception();
          }
             //������ϐ��ɃZ�b�g
             BusinessName = myBusinessName;
             UserId = args[1];
             PlantCd = args[2];
             CalcFromDate = args[3];
             CalcToDate = args[4];
                //DB�ڑ��擾����
                conn = m_conductor.m_transactionConn;
       
                //�Ɩ����b�Z�[�W����
                   businessMsgAcc = new BusinessMessageAccessor();
                   businessMsg = new BusinessMessage();
                businessMsgAcc.init(conn);
                businessMsg.setBusinessOperatingName(BusinessName);
                   businessMsg.setUser(UserId);
                   businessMsg.setPlantCode(PlantCd);
       
                   try {
                    //�Ɩ����b�N����
                    Lock = new BusinessLock(conn,UserId,PlantCd);
                    //�Ɩ����b�N�擾
                    lockCancelKey = Lock.doLock(myBusinessName);
                       // lockCancelKey==-1�̏ꍇ�Ɩ����b�N����Ă���̂ŃG���[
                       if(lockCancelKey == -1){
                           businessErrCode = "ZZ01001"; //�Ɩ����b�N����Ă��邽�ߋN���ł��܂���
                           errCode = businessErrCode;
                           errNote = "(SBM0580)���[�U�R�[�h�F[ " + UserId + " ] �H��R�[�h�F[ " + PlantCd + " ]";
                           throw new Exception();
                       }
                    conn.commit();
                   } catch (FoundationException e) {
                    businessErrCode = "ZZ01001"; //�Ɩ����b�N����Ă��邽�ߋN���ł��܂���
                       errCode = businessErrCode;
                       throw e;
                   }
       
          //===�o�b�`�p�����[�^Table���A�X�g�A�h���ʃp�����[�^�̓ǂݍ���
       
          try {
                 //DB�ڑ��擾����
                 //conn = m_conductor.m_transactionConn;
       
           m_med.setPROGRAM_CD(myBusinessName);
           m_med.setFUNCTION_NAME(functionName);
       
           nret = m_med.getreadSysBatParm().read();
       
           conn.commit();
       
           if(m_med.getreadSysBatParm().next() == false ) {
            throw new Exception();
           }else{
                        LogMode = m_med.getLOG_MODE_TYP().toString();
                        OutputMode = m_med.getOUTPUT_MODE_TYP().toString();
                        OutputPath = m_med.getFILE_PATH();
                        OutputName = m_med.getFILE_NAME();
           }
           //sysBatParam.read();
          } catch (Exception e) {
                       businessErrCode = "ZZ09007"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
                       errCode = businessErrCode;
                       errNote = "(SBM0581)�t�@���N�V�������F[ " + functionName + " ] ";
                       throw e;
          }
       
                   //�X�g�A�h�v���V�[�W���̃p�����[�^�Z�b�g
                   m_med.setpvc2LogMode(LogMode);
                   m_med.setpvc2OutputMode(OutputMode);
                   m_med.setpvc2OutputPath(OutputPath);
                   m_med.setpvc2OutputName(OutputName);
                   m_med.setpvc2UserId(UserId);
                   m_med.setpvc2BusinessName(BusinessName);
                   m_med.setpvc2PlantCd(PlantCd);
                   m_med.setpdtmCalcFromDate(CalcFromDate);
                   m_med.setpdtmCalcToDate(CalcToDate);
       
                   //�X�g�A�h�v���V�[�W�����s
                   try {
                    m_med.getcallSqlLoadCalcBat().call();
                   } catch (Exception e) {
                    //System.out.println("�X�g�A�h�G���[");
                    errCode = "AL30006"; //���s���G���[
                    // ������������G���[���l�ɃZ�b�g
                    StringBuffer sb = new StringBuffer();
                    sb.append("(SBM0582)�X�g�A�h�v���V�[�W�������F");
                    sb.append(LogMode + " ");
                    sb.append(OutputMode + " ");
                    sb.append(OutputPath + " ");
                    sb.append(OutputName + " ");
                    sb.append(UserId + " ");
                    sb.append(BusinessName + " ");
                    sb.append(PlantCd + " ");
                    sb.append(CalcFromDate + " ");
                    sb.append(CalcToDate + " ");
                    errNote = sb.toString();
                    throw e;
                   }
               } catch (Exception e) {
                if (errCode == null) {
                 errCode = "AL30007"; //���̑���Error
                }
       
                // �G���[���b�Z�[�W�̍쐬
                   AlarmMessage msg = new AlarmMessage(errCode);
                   errMsg = "[" + errCode + "]" + msg.getMessage();
                   if (e.getMessage() != null) {
                       errMsg = errMsg + " " + e.getMessage();
                   }
       
                   // �Ɩ����b�Z�[�W�̓o�^
                   if (businessMsg != null) {
                    //System.out.println("�Ɩ����b�Z�[�W");
                       // �Ɩ��G���[���Z�b�g����Ă��Ȃ��ꍇ
                       if (businessErrCode == null) {
                           businessErrCode = "ZZ09009"; // �o�b�`�������J�n�ł��܂���ł����B
                       }
                       Numbering numbering = new Numbering(conn,Numbering.LOG_CD,UserId,BusinessName,PlantCd);
                       businessMsg.setLogCode(numbering.getNo());
                       businessMsg.setMessageCode(businessErrCode);
                       businessMsg.setData(errNote);
                       try {
                           businessMsgAcc.add(businessMsg);
                           conn.commit();
                       } catch (SQLException ex) {
                        conn.rollback();
                           ex.printStackTrace();
                       }
                   }
                   memoText = errMsg; // ���l���b�Z�[�W
                   throw e;
       
               } finally {
                   try {
                       // �Ɩ����b�N����
                       //System.out.println("�Ɩ����b�N����");
                       if(!Lock.doUnLock(myBusinessName, lockCancelKey)){
                           //System.out.println("�Ɩ����b�N�̉����Ɏ��s���܂���");
                           businessErrCode = "ZZ01004"; //�Ɩ����b�N�̉����Ɏ��s���܂���
                           errCode = businessErrCode;
                           throw new Exception();
                       }
                       conn.commit();
                   } catch (FoundationException e) {
                       e.printStackTrace();
                       businessErrCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
       
                       // �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
                       errNote = "(SBM0580)���[�U�R�[�h�F[ " + UserId + " ] �H��R�[�h�F[ " + PlantCd + " ]";
                       Numbering numbering = new Numbering(conn,Numbering.LOG_CD,UserId,BusinessName,PlantCd);
                       businessMsg.setLogCode(numbering.getNo());
                       businessMsg.setMessageCode(businessErrCode);
                       businessMsg.setData(errNote);
                       try {
                           businessMsgAcc.add(businessMsg);
                           conn.commit();
                       } catch (SQLException ex) {
                        conn.rollback();
                           ex.printStackTrace();
                       }
                       AlarmMessage msg = new AlarmMessage(businessErrCode);
                       errMsg = "[" + businessErrCode + "]" + msg.getMessage();
                       memoText = errMsg; // ���l���b�Z�[�W
                       //System.out.println("errMsg:" + errMsg);
                   }
                   // =========================================================
                   /* �e�X�g�p�����[�X���̓R�����g�� *
                   finally {
                       try { // �o�b�`�I�����b�Z�[�W���M
                           System.out.println("�o�b�`�I�����b�Z�[�W���M");
                           Business business = Business.getStartBusiness(m_med.getBUSINESS_GROUP_CD(), args[1], m_med.getBUSINESS_CD());
                           business.setMessageDisplayLevel(1); // �\�����x��(�d�v�x)�̎w��
                           business.setMessageReference(memoText); // ���l�̎w��
                           business.complete();
                       }
                       catch(MessageApiException e) {
                           e.printStackTrace();
       
                           businessErrCode = "ZZ09008";
                           // �Ɩ����b�Z�[�W�̓o�^�i�o�b�`�I�����b�Z�[�W���M���s���j
                           businessMsg.setMessageCode(businessErrCode);
                           businessMsg.setData("");
                           try {
                               businessMsgAcc.add(businessMsg);
                           }
                               catch (SQLException ex) {
                               ex.printStackTrace();
                           }
                           AlarmMessage msg = new AlarmMessage(businessErrCode);
                           errMsg = businessErrCode + " " + msg.getMessage();
                           System.out.println("errMsg:" + errMsg);
                       }
                   }
                    �e�X�g�p�����[�X���̓R�����g�� */
                   // =========================================================
               }
       
       
           } catch (Exception e) {
       
               if (errCode == null) {
                   errCode = "AC53402";  // ���̑��@�d��������
               }
       
               // �G���[���b�Z�[�W�̍쐬
               if (errMsg == null) {
                   AlarmMessage msg = new AlarmMessage(errCode);
                   errMsg = "[" + errCode + "]" + msg.getMessage();
                   if (e.getMessage() != null) {
                       errMsg = errMsg + " " + e.getMessage();
                   }
               }
               e.printStackTrace();
               throw new BatchAppException("CtrlMain", "main", errMsg);
       
           }       // -- end try0
       
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
		public medAL0060B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAL0060B001 med) throws BatchAppException
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
