/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0020/src/com/nec/jp/orteus/metamorBase/AC0020/AC0020B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0020.AC0020B001;

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
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.expj.util.Converter;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:01:33 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain �N���X
 * VERSION   : 1.0.0.0
 * DATE      : 2003/08/12
 * AUTHOR    : NEXS
 * HISTORY
 *           : 1.0.0.0�@2003/08/08,�V�K�쐬
 *           : 1.0.0.0�@2003/08/12,���ԑΉ��B
 *                                 �E�o�b�`�����敪"1" ��ԃo�b�`�i�����^�]�j�̏ꍇ�A
 *                                   �I�[�_�������s����e�[�u���̐��Ԃ̒l���A�󕶎���""��
 *                                   �ꍇ�A�X�g�A�h�v���V�[�W��������null�Ƃ���悤�ύX�B
 *                                 �E�o�b�`�����敪"2" �}�j���A���i�����^�]�Ȃ��j�̏ꍇ
 *                                   ���ԂɃ_�~�[������"jobOdrCd"�����M���ꂽ�Ƃ��A
 *                                   �X�g�A�h�v���V�[�W��������null�Ƃ���悤�ύX�B
 *
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 * @see main()���\�b�h���ŁA�I�[�_�������s�������s���B
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medAC0020B001 m_med=null;

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
	public CtrlMain(medAC0020B001 med, BatchAppConductor cdr) throws BatchAppException
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
        public CtrlMain(medAC0020B001 med) throws BatchAppException
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
       /*
       
         // todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
       
       */
       
       
       //------- start of Original Code -------
       
        // ���ʕϐ� ========================================================
        IDbConnection conn = null;          // DB�R�l�N�V����
        BusinessLock Lock = null;     // �Ɩ����b�N
        int lockCancelKey = 0;              // ���b�N�����L�[
        Numbering logCd = null;       //���O���ʃR�[�h�̔Ԃ̏���
       
        // �o�b�`�������ʃG���[����
        String errCode = null;                  // �G���[�R�[�h
        String errMsg = null;                  // �G���[���b�Z�[�W
        String errNote = "";          // �G���[���b�Z�[�W(���l)
       
        // metamorBase�Ɩ����b�Z�[�W
        BusinessMessageAccessor businessMsgAcc = null;
        BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W
        String businessErrCode = null;          // metamorBase�Ɩ����b�Z�[�W�R�[�h
       
        // Orteus�Ɩ����b�Z�[�W
        String memoText = "";         // Orteus�Ɩ����b�Z�[�W ���l
       
        // ��ԃo�b�`���}�j���A����
        int batchProcessingTyp = 0;   // 1: ��ԃo�b�`�i�����^�]�j2: �}�j���A���i�����^�]�Ȃ��j
       
        // �X�g�A�h�v���V�[�W����
        String functionName = null;
       
        // �X�g�A�h�v���V�[�W���p�����[�^
        String logMode = null;        // ���O���[�h
        String outputMode = null;     // �o�̓��[�h
        String outputPath = null;     // �o�̓p�X
        String outputName = null;     // �o�̓t�@�C����
        String userId = null;         // ���[�UID
        String businessName = null;   // �Ɩ����i�o�b�`����ID�j
        String plantCd = null;        // �H��R�[�h
        String managementTyp = null;  // �Ǘ��敪  1�F�l�q�o �Q�F����
        String outsideTyp = null;     // ���O��敪  1�F���� 2�F�O�� 9�F���O�염��
        String jobOdrCd = null;       // ����
        String jobOdrDetailNo= null;  // ���Ԏ}�ԁiSI�Ή����� metamorBase�ł͖��g�p�j
        String entry1Typ = null;      // �G���g���敪�P 1�F��z����� 2�F��������� 3�F�����[��
        String entry2Typ = null;      // �G���g���敪�Q 1�F����� 2�F���T 3�F���{ 4�F����
        String entryDate = null;      // �G���g�����t
        // ===============================================================
       
        // ���ʏ��� =======================================================
       
        // �Œ�l���Z�b�g
        functionName = "SQLODRELEASE";  // �I�[�_����
       
        // �Ɩ����i�o�b�`����ID�j�̎擾
        Class myClass = this.getClass();
        businessName = myClass.getName();
        businessName = businessName.substring(businessName.length()-19, businessName.length()-9);
       
        // main�����󂯎��
        String args[] = m_med.getArgs();
        int argsLength = args.length;   // �����̌���ێ�
       
        try {   // try0 --
       
        // ��������A�o�b�`�����敪���擾����
        if (argsLength >= 2) {
         try {
          batchProcessingTyp = Integer.parseInt(args[0]);
         } catch (NumberFormatException e) {
          errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
          throw e;
         }
        } else {
         errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
         Exception e = new Exception();
         throw e;
        }
       
        // �o�b�`�p�����[�^table����A�X�g�A�h���ʃp�����[�^��ǂݍ���
        m_med.setprogramCd(businessName);
        m_med.setfunctionName(functionName);
       
       
        AbstractBatchAppEntity sysBatParam = m_med.getreadSysBatParm();
        try {
         sysBatParam.read();
         if (sysBatParam.next()) {
          logMode = m_med.getlogModeTyp().toString();
          outputMode = m_med.getoutputModeTyp().toString();
          outputPath = m_med.getfilePath();
          outputName = m_med.getfileName();
         } else {
          errCode = "AC00109"; // �o�b�`�p�����[�^�f�[�^�����݂��܂���
          Exception e = new Exception();
          throw e;
         }
        } catch (Exception e) {
         if ( errCode == null ) {
          errCode = "AC00113"; // �o�b�`�p�����[�^�̓ǂݍ��݂Ɏ��s���܂���
         }
         throw e;
        }
        // ���ʏ��� �I��� =============================================
       
       
        // ��ԃo�b�`�i�����^�]�j�̏ꍇ ==================================
        if ( batchProcessingTyp == 1 ) {
       
         // �������烆�[�UID���擾����
         userId = args[1];
       
         // �I�[�_�������s����table����A�X�g�A�h�v���V�[�W�����s�p�p�����[�^��
         // �S���ǂݍ���
         AbstractBatchAppEntity sysOdReleaseCtrl =
          m_med.getreadSysOdReleaseCtrl();
         try {
         sysOdReleaseCtrl.read();
         } catch (Exception e) {
          errCode = "AC00114"; // �I�[�_�������s����̓ǂݍ��݂Ɏ��s���܂���
          throw e;
         }
       
         // �R�l�N�V�����̎擾
         conn = m_conductor.m_transactionConn;
       
         // �o�^����Ă��郌�R�[�h�������A�X�g�A�h�v���V�[�W�������s����
         while (sysOdReleaseCtrl.next()) {
       
          // �X�g�A�h�v���V�[�W���p�p�����[�^�̎擾
          plantCd = m_med.getplantCd();
          managementTyp = m_med.getmanagementTyp().toString();
          if(null != m_med.getoutsideTyp() && !"".equals(m_med.getoutsideTyp())){
          	outsideTyp = m_med.getoutsideTyp().toString();
          }
          if (managementTyp.equals("2")) {
           jobOdrCd = m_med.getjobOdrCd();
           if (null == jobOdrCd || "".equals(jobOdrCd)) {
            jobOdrCd = null;     // �󕶎��̏ꍇ��null�Ƃ��Ĉ���
           }
          } else {
           jobOdrCd = null;
          }
          jobOdrDetailNo= null;        // SI�Ή����� metamorBase�ł͖��g�p
          if(null != m_med.getentry1Typ()){
          	entry1Typ = m_med.getentry1Typ().toString();
          }
          if(null != m_med.getentry2Typ()){
          	entry2Typ = m_med.getentry2Typ().toString();
          }
       
          // �Ɩ����b�Z�[�W�̏���
          businessMsgAcc = new BusinessMessageAccessor();
          businessMsg = new BusinessMessage();
          businessMsgAcc.init(conn);
          businessMsg.setBusinessOperatingName(businessName);
          businessMsg.setUser(userId);
          businessMsg.setPlantCode(plantCd);
       
          try {   // try1 --
       
           // �Ɩ����b�N��������
           try {
            Lock = new BusinessLock(conn, userId, plantCd);
            lockCancelKey = Lock.doLock(businessName);  // �����L�[�̎擾
            conn.commit();
            if (lockCancelKey == -1) throw new Exception();
           } catch (Exception e) {
            businessErrCode = "ZZ01001"; // �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
            errCode = businessErrCode;
            throw e;
           }
       
           // �G���g�����t���Z�o���� -------------------------------
       if(null != m_med.getentry2Typ()){
           // Calendar�^�̃G���g�����t��p��
           Calendar calEntryDate = Calendar.getInstance();
       
           // "yyyy/MM/dd"�̓��t�t�H�[�}�b�g�𐶐�
           //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
           //df.setLenient(false);  // ���t���߂̂����܂������Ȃ���
       
           // �G���g���敪�Q�ƋƖ��^�p�����A�G���g�����t���Z�o����
           int type = m_med.getentry2Typ().intValue();
       
           // �G���g���敪�Q��"�����"�w��̏ꍇ
           if (type == 1) {
            // table�ɓo�^����Ă���G���g�����t�i������j���擾����
            entryDate = m_med.getentryDate();
       			
            // �擾�������t���Ó��ł��邩
            try {
     					if(null != entryDate && !"".equals(entryDate)){
             		//calEntryDate.setTime(df.parse(entryDate));
             		calEntryDate.setTime(Converter.strToDate(entryDate, "yyyy/MM/dd"));
            	}
            } catch (ParseException e) {
             errCode = "AC00116"; // �o�^����Ă���G���g�����t�̌`�����s���ł�
             throw e;
            }
       
           // �G���g���敪�Q��"�����"�ȊO�̏ꍇ
           } else {
            java.util.Date businessOrpDate = null; // �Ɩ��^�p���iDate�^�j
       
            // ���t����table����A�Ɩ��^�p�����擾����
            m_med.setplantCd(plantCd);
            AbstractBatchAppEntity sysDateCtrl = m_med.getreadSysDateCtrl();
            try {
             sysDateCtrl.read();
            } catch (Exception e) {
             errCode = "AC00115"; // ���t����̓ǂݍ��݂Ɏ��s���܂���
             throw e;
            }
            if (sysDateCtrl.next()) {
             businessOrpDate = m_med.getbusinessOprDate();
            } else {
             errCode = "AC50537"; // ���t����f�[�^�����݂��܂���
             Exception e = new Exception();
             throw e;
            }
            calEntryDate.setTime(businessOrpDate);
       
            // �G���g���敪�Q��"���T"�w��̏ꍇ
            if (type == 2) {
             // ���T�������G���g�����t�ɃZ�b�g����
             int END_DAY_OF_WEEK = Calendar.SATURDAY; // �T���Ƃ���j��
             int difference = END_DAY_OF_WEEK -
             calEntryDate.get(Calendar.DAY_OF_WEEK);
             if (difference < 0) {
              difference += 7;
             }
             calEntryDate.add(Calendar.DATE, difference);
       
            // �G���g���敪�Q��"���{"�w��̏ꍇ
            } else if (type == 3) {
             //���{�������G���g�����t�ɃZ�b�g����
             int date = calEntryDate.get(Calendar.DAY_OF_MONTH);
             if (date <= 10 ) {
              calEntryDate.set(Calendar.DAY_OF_MONTH, 10);
             } else if (date > 10 && date <= 20) {
              calEntryDate.set(Calendar.DAY_OF_MONTH, 20);
             } else {
              calEntryDate.set(
              Calendar.DAY_OF_MONTH,
              calEntryDate.getActualMaximum(Calendar.DAY_OF_MONTH)
             );
            }
       
            // �G���g���敪�Q��"����"�w��̏ꍇ
            } else if (type == 4) {
             //�����������G���g�����t�ɃZ�b�g����
             calEntryDate.set(
             Calendar.DAY_OF_MONTH,
             calEntryDate.getActualMaximum(Calendar.DAY_OF_MONTH)
             );
            }
           }
           // ���t�^�𕶎���i"yyyy/MM/dd"�j�ɕϊ�
           //entryDate = df.format(calEntryDate.getTime());
           
           if (type == 1 && (null == entryDate || "".equals(entryDate))) {
           		entryDate = null;
           }else{
           		entryDate = Converter.dateToStr(calEntryDate.getTime(), "yyyy/MM/dd");
           }
           // �G���g�����t���Z�o���� �I��� -------------------------
       }
           // �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
           m_med.setpvc2LogMode(logMode);
           m_med.setpvc2OutputMode(outputMode);
           m_med.setpvc2OutputPath(outputPath);
           m_med.setpvc2OutputName(outputName);
           m_med.setpvc2UserId(userId);
           m_med.setpvc2BusinessName(businessName);
           m_med.setpvc2PlantCd(plantCd);
           m_med.setpvc2ManagementTyp(managementTyp);
           m_med.setpvc2OutsideTyp(outsideTyp);
           m_med.setpvc2JobOdrCd(jobOdrCd);
           m_med.setpvc2JobOdrDetailNo(jobOdrDetailNo);
           m_med.setpvc2Entry1Typ(entry1Typ);
           m_med.setpvc2Entry2Typ(entry2Typ);
           m_med.setpvc2EntryDate(entryDate);
       
       //�ǉ�
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
           // �X�g�A�h�v���V�[�W���̎��s
           try {
            m_med.getcallSqlOdRelease().call();
           } catch (Exception e) {
            errCode = "AC00117"; // �X�g�A�h�v���V�[�W�����s���G���[
            // ������������G���[���l�ɃZ�b�g
            StringBuffer sb = new StringBuffer();
            sb.append("(SBM0582)�X�g�A�h�v���V�[�W�������F");
            sb.append(logMode + " ");
            sb.append(outputMode + " ");
            sb.append(outputPath + " ");
            sb.append(outputName + " ");
            sb.append(userId + " ");
            sb.append(businessName + " ");
            sb.append(plantCd + " ");
            sb.append(managementTyp + " ");
            sb.append(outsideTyp + " ");
            sb.append(jobOdrCd + " ");
            sb.append(jobOdrDetailNo + " ");
            sb.append(entry1Typ + " ");
            sb.append(entry2Typ + " ");
            sb.append(entryDate);
            errNote = sb.toString();
            throw e;
           }
       
          } catch (Exception e) { // -- try1 catch
       
           if (errCode == null) {
            errCode = "AC53402";  // ���̑��@�d��������
           }
       
           // �G���[���b�Z�[�W�̍쐬
           AlarmMessage msg = new AlarmMessage(errCode);
           errMsg = "[" + errCode + "]" + msg.getMessage();
           if (e.getMessage() != null) {
            errMsg = errMsg + " " + e.getMessage();
           }
       
           // �Ɩ����b�Z�[�W�̓o�^
           if (businessMsg != null) {
            // �Ɩ��G���[���Z�b�g����Ă��Ȃ��ꍇ
            if (businessErrCode == null) {
             businessErrCode = "ZZ09009"; // �o�b�`�������J�n�ł��܂���ł����B
            }
            businessMsg.setMessageCode(businessErrCode);
            businessMsg.setData(errNote);
            try {
             logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
             businessMsg.setLogCode(logCd.getNo());
             businessMsgAcc.add(businessMsg);
            } catch (SQLException ex) {
             ex.printStackTrace();
            }
           }
           memoText = errMsg; // ���l���b�Z�[�W
           throw e;
       
          } finally {  // -- try1 finally
           try {
            // �Ɩ����b�N����
       
            Lock.doUnLock(businessName, lockCancelKey);
            conn.commit();
           } catch (FoundationException e) {
           e.printStackTrace();
           businessErrCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
       
           // �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
           businessMsg.setMessageCode(businessErrCode);
           businessMsg.setData("");
           try {
            logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
            businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
           } catch (SQLException ex) {
            ex.printStackTrace();
           }
           AlarmMessage msg = new AlarmMessage(businessErrCode);
           errMsg = "[" + businessErrCode + "]" + msg.getMessage();
           memoText = errMsg; // ���l���b�Z�[�W
       
           }
           // =========================================================
           /* �e�X�g�p�����[�X���̓R�����g�� *
           finally {
            try { // �o�b�`�I�����b�Z�[�W���M
       
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
              logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
              businessMsg.setLogCode(logCd.getNo());
              businessMsgAcc.add(businessMsg);
             }
             catch (SQLException ex) {
              ex.printStackTrace();
             }
             AlarmMessage msg = new AlarmMessage(businessErrCode);
             errMsg = businessErrCode + " " + msg.getMessage();
       
            }
           }
            �e�X�g�p�����[�X���̓R�����g�� */
           // =========================================================
       
          }   // -- end try1
       
         }   // -- end while
       
        // ��ԃo�b�`�i�����^�]�j�̏ꍇ �I��� ===============================
       
       
        // �}�j���A���i�����^�]�Ȃ��j�̏ꍇ ==================================
        } else if ( batchProcessingTyp == 2 ) {
       
         // �����̑Ó������`�F�b�N���A�ϐ��ɃZ�b�g���� -------------------
         if (argsLength == 10) {
          userId = args[1];
          plantCd = args[2];
          managementTyp = args[3];
          outsideTyp = args[4];
          if (managementTyp.equals("2")) {
           jobOdrCd = args[5];   // ���Ԃ̏ꍇ�̂݃Z�b�g
           if (jobOdrCd.equals("jobOdrCd")) {
            jobOdrCd = null;  // �_�~�[������̏ꍇ�Anull���Z�b�g
           }
          } else {
           jobOdrCd = null;
          }
          jobOdrDetailNo= null;   // SI�Ή����� metamorBase�ł͖��g�p
          entry1Typ = args[7];
          entry2Typ = args[8];
          entryDate = args[9];
       
          // ���l�^�C�v�̈����ɔ��p�������Z�b�g����Ă��邩
          try {
           Integer.parseInt(managementTyp);
           Integer.parseInt(outsideTyp);
           Integer.parseInt(entry1Typ);
           Integer.parseInt(entry2Typ);
          } catch (NumberFormatException e) {
           errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
           throw e;
          }
         } else {
          errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
          Exception e = new Exception();
          throw e;
         }
         // �����̃Z�b�g �I��� ---------------------------------------
       
         // �R�l�N�V�����̎擾
         conn = m_conductor.m_transactionConn;
       
         // �Ɩ����b�Z�[�W�̏���
         businessMsgAcc = new BusinessMessageAccessor();
         businessMsg = new BusinessMessage();
         businessMsgAcc.init(conn);
         businessMsg.setBusinessOperatingName(businessName);
         businessMsg.setUser(userId);
         businessMsg.setPlantCode(plantCd);
       
         try {   // try2 --
          // �Ɩ����b�N��������
          try {
           Lock = new BusinessLock(conn, userId, plantCd);
           lockCancelKey = Lock.doLock(businessName);  // �����L�[�̎擾
           conn.commit();
           if (lockCancelKey == -1) throw new Exception();
          } catch (Exception e) {
           businessErrCode = "ZZ01001"; // �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
           errCode = businessErrCode;
           throw e;
          }
       
          // �X�g�A�h�v���V�[�W���̃p�����[�^���Z�b�g����
          m_med.setpvc2LogMode(logMode);
          m_med.setpvc2OutputMode(outputMode);
          m_med.setpvc2OutputPath(outputPath);
          m_med.setpvc2OutputName(outputName);
          m_med.setpvc2UserId(userId);
          m_med.setpvc2BusinessName(businessName);
          m_med.setpvc2PlantCd(plantCd);
          m_med.setpvc2ManagementTyp(managementTyp);
          m_med.setpvc2OutsideTyp(outsideTyp);
          m_med.setpvc2JobOdrCd(jobOdrCd);
          m_med.setpvc2JobOdrDetailNo(jobOdrDetailNo);
          m_med.setpvc2Entry1Typ(entry1Typ);
          m_med.setpvc2Entry2Typ(entry2Typ);
          m_med.setpvc2EntryDate(entryDate);
       //�ǉ�
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
          // �X�g�A�h�v���V�[�W���̎��s
          try {
           m_med.getcallSqlOdRelease().call();
          } catch (Exception e) {
           errCode = "AC00117"; // �X�g�A�h�v���V�[�W�����s���G���[
           // ������������G���[���l�ɃZ�b�g
           StringBuffer sb = new StringBuffer();
           sb.append("(SBM0582)�X�g�A�h�v���V�[�W�������F");
           sb.append(logMode + " ");
           sb.append(outputMode + " ");
           sb.append(outputPath + " ");
           sb.append(outputName + " ");
           sb.append(userId + " ");
           sb.append(businessName + " ");
           sb.append(plantCd + " ");
           sb.append(managementTyp + " ");
           sb.append(outsideTyp + " ");
           sb.append(jobOdrCd + " ");
           sb.append(jobOdrDetailNo + " ");
           sb.append(entry1Typ + " ");
           sb.append(entry2Typ + " ");
           sb.append(entryDate);
           errNote = sb.toString();
           throw e;
          }
       
         } catch (Exception e) { // -- try2 catch
       
          if (errCode == null) {
           errCode = "AC53402";  // ���̑��@�d��������
          }
       
          // �G���[���b�Z�[�W�̍쐬
          AlarmMessage msg = new AlarmMessage(errCode);
          errMsg = "[" + errCode + "]" + msg.getMessage();
          if (e.getMessage() != null) {
           errMsg = errMsg + " " + e.getMessage();
          }
       
          // �Ɩ����b�Z�[�W�̓o�^
          if (businessMsg != null) {
           // �Ɩ��G���[���Z�b�g����Ă��Ȃ��ꍇ
           if (businessErrCode == null) {
            businessErrCode = "ZZ09009"; // �o�b�`�������J�n�ł��܂���ł����B
           }
           businessMsg.setMessageCode(businessErrCode);
           businessMsg.setData(errNote);
           try {
            logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
            businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
           } catch (SQLException ex) {
            ex.printStackTrace();
           }
          }
          memoText = errMsg; // ���l���b�Z�[�W
          throw e;
       
         } finally { // -- try2 finally
          try {
           // �Ɩ����b�N����
       
       
       
           Lock.doUnLock(businessName, lockCancelKey);
           conn.commit();
          } catch (FoundationException e) {
           e.printStackTrace();
           businessErrCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
       
           // �Ɩ����b�Z�[�W�̓o�^�i�Ɩ����b�N�������s���j
           businessMsg.setMessageCode(businessErrCode);
           businessMsg.setData("");
           try {
            logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
            businessMsg.setLogCode(logCd.getNo());
            businessMsgAcc.add(businessMsg);
           } catch (SQLException ex) {
            ex.printStackTrace();
           }
           AlarmMessage msg = new AlarmMessage(businessErrCode);
           errMsg = "[" + businessErrCode + "]" + msg.getMessage();
           memoText = errMsg; // ���l���b�Z�[�W
       
          }
          // =========================================================
          /* �e�X�g�p�����[�X���̓R�����g�� *
          finally {
           try { // �o�b�`�I�����b�Z�[�W���M
       
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
             logCd = new Numbering(m_conductor.m_transactionConn,Numbering.LOG_CD,args[1],businessName,plantCd);
             businessMsg.setLogCode(logCd.getNo());
             businessMsgAcc.add(businessMsg);
            }
            catch (SQLException ex) {
             ex.printStackTrace();
            }
            AlarmMessage msg = new AlarmMessage(businessErrCode);
            errMsg = businessErrCode + " " + msg.getMessage();
       
           }
          }
           �e�X�g�p�����[�X���̓R�����g�� */
          // =========================================================
       
         }   // -- end try2
       
        } // �}�j���A���i�����^�]�Ȃ��j�̏ꍇ �I��� =========================
       
        } catch (Exception e) {     // -- catch try0
       
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
       
       //------- end of Original Code -------
       
       
       
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
		public medAC0020B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAC0020B001 med) throws BatchAppException
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
