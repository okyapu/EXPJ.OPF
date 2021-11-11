/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0030/src/com/nec/jp/orteus/metamorBase/KV0030/KV0030B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0030.KV0030B001;

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
//-----------------------------------------------------------------------------
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/03 08:57:28 $
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
	public medKV0030B001 m_med=null;

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
	public CtrlMain(medKV0030B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
        /** �N������ */
        private String strBusinessName = null;
        private String strUserId = null;
        private String strPlantCd = null;
        private String strMsgPlantCd = null;
       
        /** DB�R�l�N�V���� */
           private IDbConnection conn = null;
        private String m_vMSG = "";				//���O�t�@�C���p���b�Z�[�W
       
           // �o�b�`�N���X���ʃG���[�����p
           private String errCode = null;		     // �o�b�`�G���[�R�[�h
           private String errMsg = null;		     // �o�b�`�G���[���b�Z�[�W
           private String errNote = "";             // �o�b�`�G���[���b�Z�[�W(���l) �K�v�ɉ����Ďg�p�B
         
           // �H��R�[�h�Ƃ���ɑ΂��郍�b�N�����L�[�̔z���ێ����郊�X�g
           private ArrayList plantList = new ArrayList();
         
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
         System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
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
         System.out.println(am.getMessage());
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
         System.out.println(am.getMessage());
        }
           /**
            * metamorBase�Ɩ����b�N���s���B
            * metamorBase�Ɩ����b�N�ɂ́A�Ɩ����A���[�U�R�[�h�A�H��R�[�h��K�v�Ƃ���
            *
            * @param conn DB�R�l�N�V����
            * @param strBusinessName �Ɩ���
            * @param strUserId ���[�U�R�[�h
            * @return �Ȃ�
            */
           protected void doBusinessLock(IDbConnection conn,
                                             String strBusinessName,
                                             String strUserId) throws Exception{
                                              
                   for (Iterator it = plantList.iterator(); it.hasNext();) {
                       Object plantData[] = (Object[]) it.next();
                       String plantCd = plantData[0].toString();
                       try {
       
                           BusinessLock lock = new BusinessLock(conn, strUserId, plantCd);
                           int lockCancelKey = lock.doLock(strBusinessName);  // �����L�[�̎擾
                           conn.commit();
                           if (lockCancelKey == -1) throw new Exception();
       
                           // ���b�N��ێ����Ă���
                           plantData[1] = lock;
                           plantData[2] = new Integer(lockCancelKey);
                       } catch (Exception e) {
            errCode = "ZZ01001"; // �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
            errNote = "(SBM0612)<< �Ɩ����b�N�������Ȃ� >>";
            this.writeLogMessage(errCode);
            throw e;
                       }
                   }   // -- end of for
           }
           /**
            * metamorBase�Ɩ����b�N�������s���B
            * metamorBase�Ɩ����b�N�����ɂ́A�Ɩ����A���[�U�R�[�h�A�H��R�[�h��K�v�Ƃ���
            *
            * @param conn DB�R�l�N�V����
            * @param strBusinessName �Ɩ���
            * @return �Ȃ�
            */
           protected void releaseBusinessLock(IDbConnection conn,
                                             String strBusinessName) throws Exception{
                                              
                   for (Iterator it = plantList.iterator(); it.hasNext();) {
       
                    Object plantData[] = (Object[]) it.next();
                       String plantCd = plantData[0].toString();
                       if (plantData[1] != null) {
                           BusinessLock lock = (BusinessLock) plantData[1];
                           int lockCancelKey = ((Integer) plantData[2]).intValue();
                           try {
                               // �Ɩ����b�N����
                               //System.out.println("�Ɩ����b�N����");
                               lock.doUnLock(strBusinessName, lockCancelKey);
                               conn.commit();
                        } catch (Exception e) {
             errCode = "ZZ01004"; // �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
             errNote = "(SBM0613)<< �Ɩ����b�N�����ł��Ȃ� >>";
             this.writeLogMessage(errCode);
             throw e;
                        }
                       }
                   }   // -- end of for
           }
           /**
            * metamorBase�Ɩ����b�Z�[�W�̏o�͂��s���B
            * metamorBase�Ɩ����b�Z�[�W�̏o�͂ɂ́A�Ɩ����A���[�U�R�[�h�A�H��R�[�h��K�v�Ƃ���
            *
            * @param conn DB�R�l�N�V����
            * @param businessName �Ɩ���
            * @param userId ���[�U�R�[�h
            * @param plantCd �H��R�[�h
            * @return �Ȃ�
            */
           protected void outBusinessMessage(IDbConnection conn,
                                             String businessName,
                                             String userId,
                                             String plantCd) {
       
               // ����̋Ɩ��G���[�R�[�h���Z�b�g����Ă��Ȃ��ꍇ
               if (errCode == null) {
                   errCode = "ZZ09009";  // �o�b�`�������J�n�ł��܂���ł����B
               }
       
               // �Ɩ����b�Z�[�W�̏���
               BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
               BusinessMessage businessMsg = new BusinessMessage();
               businessMsgAcc.init(conn);
               businessMsg.setBusinessOperatingName(businessName);
               businessMsg.setUser(userId);
               businessMsg.setPlantCode(plantCd);
               businessMsg.setMessageCode(errCode);
               businessMsg.setData(errNote);
               try {
          Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
          businessMsg.setLogCode(logCd.getNo());
                   businessMsgAcc.add(businessMsg);
                   // �Ɩ����b�Z�[�W�́A�Ɩ��v���O�������ŃR�l�N�V�������R�~�b�g����
                   // �K�v������B�o�׌v��h�^�e�́A�Ɩ��v���O�����Ńg�����U�N�V������
                   // �ӎ�����K�v���Ȃ����߁A���C�������Ɠ����R�l�N�V�����ɑ΂��s�x�R�~�b�g
                   // ����B
                   conn.commit();
               } catch (SQLException e) {
                   errCode = "AC00999"; // SQL���s���G���[�B
                setBatchErrorMessage(e);
          e.printStackTrace();
               } catch (Exception e) {
                   errCode = "KV03003";  // ���̑��@�d��������
                setBatchErrorMessage(e);
          e.printStackTrace();
               }
           }
           /**
            * �o�b�`�N���X���ʃG���[�����̃G���[���b�Z�[�W�������o�ϐ��ɃZ�b�g����B
            * �o�b�`�N���X���ʃG���[�����́A�d�l��A�����ɃG���[�R�[�h�ł͂Ȃ��G���[���b�Z�[�W�������K�v�Ƃ���B
            * ����āA�Ɩ��v���O�������ŃG���[�R�[�h���烁�b�Z�[�W���쐬����K�v������B
            *
            * @param e Exception�I�u�W�F�N�g
            * @return �Ȃ�
            */
           protected void setBatchErrorMessage(Exception e) {
       
               // ����̃o�b�`�G���[�R�[�h���Z�b�g����Ă��Ȃ��ꍇ
               if (errCode == null) {
                   errCode = "KV03003";  // ���̑��@�d��������
               }
               // �o�b�`�G���[���b�Z�[�W�̍쐬
               if (errMsg == null) {
                   //AlarmMessage msg = new AlarmMessage(errCode);
                   //errMsg = "[" + errCode + "]" + msg.getMessage();
               }
               // Exception�I�u�W�F�N�g�Ƀ��b�Z�[�W������ꍇ�A�t������B
               if (e.getMessage() != null) {
                   errMsg = errMsg + " " + e.getMessage();
               }
           }
           protected String getBatchErrorMessage() {
               return errMsg;
           }
       
        //////////////////////////////
        // �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���
       
        /**
         * CtrlMain�N���X�̕W���R���X�g���N�^
         *
         */
        public CtrlMain(medKV0030B001 med) throws BatchAppException
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
       
         try{
          // �����󂯎��
          String args[] = m_med.getArgs();
          if (args.length < 4 || args.length > 5) {
           throw new Exception();
          }
       
          strUserId = args[1];
          strMsgPlantCd = args[2];
          strBusinessName = args[3];
          if (args.length == 4) {
           strPlantCd = "%";
          } else {
           strPlantCd = args[4];
          }
       
          // �p�����[�^�m�F
          //System.out.println(">>>PRG_NAM:" + strBusinessName);	// �Ɩ���
          //System.out.println(">>>USER_ID:" + strUserId);	// ���[�U�h�c
          //System.out.println(">>>USER_PLNT_CD:" + strMsgPlantCd);	// ���[�U�H��R�[�h
          //System.out.println(">>>PLNT_CD:" + strPlantCd);	// �H��R�[�h
       
          conn = m_conductor.m_transactionConn;
          
          //�o�׌v��I/F�o�b�`�̊J�n���b�Z�[�W�o�^sww20040804�ǉ�
          // �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
          String strMsgCd = "KV03002";
          if(this.getSysMsg(strMsgCd)){
           CoreTools.write(strMsgCd);
          }else{
           throw new Exception();
          }
       
          // �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
          errCode = "KV03002";
          errNote = "(SBM0614)<< �o�׊Ǘ��h�^�e�o�b�`�����J�n >>";
          outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
       
          CoreTools.write("\n(SBM1249)******>>>> �o�׊Ǘ��h�^�e�X�^�[�g <<<******");
       //����������������������������������������������������������������������������������������������������������������������������������������������
       //-----------------------------------------------------------------------------
       //		����IF(EDI)�ϊ������i��������j
       //-----------------------------------------------------------------------------
       
          m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
          m_med.setUsername(strUserId);
          //=======================================
          // ���Џ��R�[�h
          //=======================================
          if(m_med.getreadSYS_MY_COMPANY().read() != SUCCESS){
           errCode = "KV03003";
           errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
           throw new Exception();
          }
          if(m_med.getreadSYS_MY_COMPANY().next() == false){
           //���Џ��R�[�h�擾���s
           errCode = "KQ00039";
           errNote = "(SBM0597)<< ���Џ��̎擾�Ɏ��s���܂��� >>";
           this.writeLogMessage(errCode);
       //				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
           throw new Exception();
          }
          CoreTools.write("BATCH COMPANY_CD=" + m_med.getCOMPANY_CD());
          //System.out.println("m_med.getCOMPANY_CD()="+m_med.getCOMPANY_CD());
          
          //=======================================
          // �ΏۍH��R�[�h
          //=======================================
          m_med.setinPLANT_CD(strPlantCd);
          if(m_med.getreadM_PLANT().read() != SUCCESS){
           errCode = "KV03003";
           errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
           throw new Exception();
          }
          if(m_med.getreadM_PLANT().next() == false){
           //�ΏۍH��R�[�h�擾���s
           errCode = "KV03001";
           errNote = "(SBM0595)<< �w�肵���H��R�[�h�͖��o�^�ł� >>";
           this.writeLogMessage(errCode);
       //				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
           throw new Exception();
          }
       
          do {
                       // �H��R�[�h�ƃ��b�N���i�[����z���p��
                       Object plantData[] = new Object[3];
                       plantData[0] = m_med.getPLANT_CD(); // �H��R�[�h���Z�b�g
                       plantData[1] = null;                // ���b�N�I�u�W�F�N�g�i�[�p
                       plantData[2] = null;                // ���b�N�����L�[�i�[�p
                       // ���X�g�ɔz���ێ�
                       plantList.add(plantData);
          } while (m_med.getreadM_PLANT().next() == true);
       
          //=======================================
          // �Ɩ����b�N
          //=======================================
                   // �S�Ă̍H��ɂ��ċƖ����b�N�������Ă���
                   doBusinessLock(conn, strBusinessName, strUserId);
       
          for (Iterator it = plantList.iterator(); it.hasNext(); ) {
                    // �e�H��R�[�h�̎擾
                       Object plantData[] = (Object[]) it.next();
                       String plantCd = plantData[0].toString();
           CoreTools.write("BATCH PLANT_CD=" + plantCd);
           //System.out.println("m_med.getPLANT_CD()="+plantCd);
           m_med.setPLANT_CD(plantCd);
       
          //=======================================
          // [�o�׌v��]�̑Ώۃ��R�[�h�𒊏o����
          //=======================================
           if(m_med.getreadT_ANS_DLV_DATE().read() != SUCCESS){
            errCode = "KV03003";
            errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
            throw new Exception();
           }
           while (m_med.getreadT_ANS_DLV_DATE().next() == true) {
       
          //=======================================
          // [�o�׌v��].�h�I�[�_�f�}���h�ԍ��h��Null�̏ꍇ�A
          // [���v��]�Ƀf�}���h��V�K�o�^����
          //=======================================
            if (m_med.getOD_NO() == null) {
             // �I�[�_�f�}���h�ԍ��̔ԃN���X�I�u�W�F�N�g����
             Numbering MyNo = new Numbering(conn,
                     Numbering.ODNO,
                     strUserId,
                     strBusinessName,
                     m_med.getPLANT_CD()
                     );
             String odNo = MyNo.getNo();
             if (odNo == null || odNo.trim().length() == 0) {
              errCode = "KV03003";
              errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
              throw new Exception();
             }
             m_med.setinOD_NO(odNo);
             if(m_med.getinsertT_OD().create() != SUCCESS){
              errCode = "KV03003";
              errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
              throw new Exception();
             }
       
          //=======================================
          // �����āA[�o�׌v��] ���X�V����
          //=======================================
             if(m_med.getupdateT_ANS_DLV_DATE().update() != SUCCESS){
              errCode = "KV03003";
              errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
              throw new Exception();
             }
       
          //=======================================
          // [�o�׌v��].�h�I�[�_�f�}���h�ԍ��h��Null�̏ꍇ�A
          // [���v��]�Ƀf�}���h���X�V����
          //=======================================
            } else {
             if(m_med.getupdateT_OD().update() != SUCCESS){
              errCode = "KV03003";
              errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
              throw new Exception();
             }
            }
           }
          //=======================================
          // [���v��]����폜�Ώۂ̃��R�[�h�𒊏o����
          //=======================================
           if(m_med.getdeleteT_OD().delete() != SUCCESS){
            errCode = "KV03003";
            errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
            throw new Exception();
           }
          }
       
       
          //�o�b�`�I�����b�Z�[�W�o�^
          errCode = "KV03004";
          errNote = "(SBM0615)<< �o�׊Ǘ��h�^�e�o�b�`�����I�� >>";
          outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
          conn.commit();
          CoreTools.write("\n(SBM1248)******>>>> �o�׊Ǘ��h�^�e�G���h <<<******");
       
         } catch (Exception e) {
            try {
                conn.rollback();
                e.printStackTrace();
                setBatchErrorMessage(e);
                outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
            } catch (Exception ee) {
               ee.printStackTrace();
            }
         } finally {
          
          //�o�׌v��I/F�o�b�`�̏I�����b�Z�[�W�o�^sww20040804�ǉ�
          // �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
          String strMsgCd = "KV03004";
          if(this.getSysMsg(strMsgCd)){
           CoreTools.write(strMsgCd);
          }
          //=======================================
          // �Ɩ����b�N
          //=======================================
                   // �S�Ă̍H��ɂ��ċƖ����b�N�������Ă���
          try {
                    releaseBusinessLock(conn, strBusinessName);
          } catch (Exception ee) {
           ee.printStackTrace();
           outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
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
		public medKV0030B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0030B001 med) throws BatchAppException
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
