/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0140/src/com/nec/jp/orteus/metamorBase/AC0140/AC0140B001/medAC0140B001.java,v $
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
 * EXPJ    (2004/03/21),EXPLANNER/J�p�ɉ���
 *                      SystemLog�̋L�q��ǉ��B
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.AC0140.AC0140B001;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.lang.Float;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
 // TODO: ������import�p�b�P�[�W���L�q���Ă�������
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.expj.util.SystemConfig;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.Numbering;
//}}user_implement_dev:import

/**
 * CLASS     : medAC0140B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:03:49 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medAC0140B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_currentPlantCd;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected Integer m_odCalcFlg;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_PLANT_CD;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_JOB_ODR_CD;

	/**
	 * readMPlant_all entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * readSysOdCalcCtrl_all entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * readSysJobOdCalcCtrl_all entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="AC0140B001";

	/**
	 * �v���O��������Ԃ��܂�
	 *
	 * @return �v���O������
	 */
	public String getProgname() { return m_Progname; }

	/**
	 * �v���O��������mediator�Ɋi�[���܂�
	 *
	 * @param �v���O������
		 */
	public void setProgname(String args) { m_Progname = args; }

	//////////////////////////////

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 */
	// java.util.Date mdate = new java.util.Date();
	// java.text.SimpleDateFormat dtformat = new java.text.SimpleDateFormat( "yyyy/MM/dd kk:mm:ss" );
	// protected String Sysdate = dtformat.format(mdate);
	protected String Sysdate = null;

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 *
	 * @return �������t
	 */
	public String getSysdate() { return Sysdate; }

	/**
	 * �������t��mediator�Ɋi�[���܂�
	 *
	 * @param �������t
		 */
	public void setSysdate( String arg ) { Sysdate = arg; }

	//////////////////////////////

	/**
	 * �o�^��/�X�V�҂��i�[���܂�
	 */
	protected String Username = "orteus_system";

	/**
	 * �o�^��/�X�V�҂��擾���܂�
	 *
	 * @return �o�^��/�X�V��
	 */
	public String getUsername() { return Username; }

	/**
	 * �o�^��/�X�V�҂�mediator�Ɋi�[���܂�
	 *
	 * @param �o�^��/�X�V��
		 */
	public void setUsername( String arg ) { Username = arg; }

	//////////////////////////////

	/**
	 * ���������i�[���܂�
	 */
	protected String[] m_args=null;

	//////////////////////////////

	/**
	 * �R�}���h���C���̈���������z���Ԃ��܂�
	 *
	 * @return ����������z��
	 */
	public String[] getArgs() { return m_args; }

	/**
	 * �R�}���h���C���̈���������z���mediator�Ɋi�[���܂�
	 *
	 * @param ����������z��
		 */
	public void setArgs(String[] args) { m_args = args; }

	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getcurrentPlantCd() { return m_currentPlantCd; }
	public Integer getodCalcFlg() { return m_odCalcFlg; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public void setcurrentPlantCd(String arg) { m_currentPlantCd = arg; }
	public void setodCalcFlg(Integer arg) { m_odCalcFlg = arg; }
	public void setPLANT_CD(String arg) { m_PLANT_CD = arg; }
	public void setJOB_ODR_CD(String arg) { m_JOB_ODR_CD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadMPlant_all() { return m_entity0; }
	public void setreadMPlant_all(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getreadSysOdCalcCtrl_all() { return m_entity1; }
	public void setreadSysOdCalcCtrl_all(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getreadSysJobOdCalcCtrl_all() { return m_entity2; }
	public void setreadSysJobOdCalcCtrl_all(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medAC0140B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medAC0140B001()
	{
		// mediator�ϐ������������܂�
		m_currentPlantCd = null;
		m_odCalcFlg = null;
		m_PLANT_CD = null;
		m_JOB_ODR_CD = null;

               //{{user_implement_dev:constractor
                // TODO: �����ɏ����������L�q���Ă�������
               //}}user_implement_dev:constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
		 */
	protected void finalize()
	{

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	/**
	 * �V�X�e�����O
	 * 
	 */
	protected SystemLog m_syslog = null;
	public void setSyslog(SystemLog syslog){m_syslog = syslog;}
	public SystemLog getSyslog(){return m_syslog;}

	//////////////////////////////

        //{{user_implement_dev:original
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
       // insert Original Code ===================================================
       
           // �����敪
           private int plantTyp = 1;                // 1:�w��H�� 2:�S�H��
       
           // ���v�ʌv�Z�p�����[�^
           private String userId = null;            // ���[�UID
           private String businessName = null;      // �Ɩ����i�o�b�`����ID�j
           private String plantCd = null;           // �H��R�[�h
           private String connectDbuser = null;     // Oracle���[�U
           private String connectDbpass = null;     // Oracle�p�X���[�h
           private String connectDbhost = null;     // Oracle�ڑ�������
           private String batchRollbackFlg= null;   // ���[���o�b�N�Z�O�����g�g�p�t���O
           private String batchRollbackSeg = null;  // ��p���[���o�b�N�Z�O�����g��
           private String batchLogPath = null;      // ���O�o�͐�
           private String mrpExeLogFile = null;     // ���O�t�@�C����
           private String batchLogFullPath = null;  // ���O�t�@�C�����i�t���p�X�j
           private String programPath = null;       // EXE�̃p�X
           private String mrpExeLogMode = null;     // ���O���[�h
           private String mrpExpMode = null;        // ���v�ʓW�J���[�h
           private String jobOdrCd = null;          // ����
       
           // �o�b�`�N���X���ʃG���[�����p
           private String errCode = null;		     // �o�b�`�G���[�R�[�h
           private String errMsg = null;		     // �o�b�`�G���[���b�Z�[�W
           private String errNote = "";             // �o�b�`�G���[���b�Z�[�W(���l) �K�v�ɉ����Ďg�p�B
       
           // metamorBase�Ɩ����b�Z�[�W�p
           private String businessErrCode = null;   // metamorBase�Ɩ����b�Z�[�W�R�[�h
       
           // Orteus�W���Ɩ����b�Z�[�W�p
           private String memoText = "";            // Orteus�Ɩ����b�Z�[�W ���l
       
           // setter
        protected void setBusinessName(String arg) { businessName = arg; }
           protected void setBatchLogFullPath() {
               batchLogFullPath = batchLogPath + "/" + plantCd + mrpExeLogFile;
           }
       
           // getter
           protected String getBatchErrorMessage() {
               return errMsg;
           }
       
       
           /**
            * ���v�ʌv�Z���s�o�b�`�N���X ���C������
            *
            * @param conn DB�R�l�N�V����
            * @return �Ȃ�
            */
           protected void main(IDbConnection conn) throws Exception {
       
               try {
       
                   //main�������擾���A�����o�ϐ��ɃZ�b�g����
                   setParamArgs();
       
                   // �H��R�[�h�Ƃ���ɑ΂��郍�b�N�����L�[�̔z���ێ����郊�X�g
                   ArrayList plantList = new ArrayList();
       
                   // �H��w��̏ꍇ ==============================================
                   if (plantTyp == 1) {
                       // �H��R�[�h�ƃ��b�N���i�[����z���p��
                       Object plantData[] = new Object[3];
                       plantData[0] = plantCd;   // �H��R�[�h���Z�b�g
                       plantData[1] = null;      // ���b�N�I�u�W�F�N�g�i�[�p
                       plantData[2] = null;      // ���b�N�����L�[�i�[�p
                       // ���X�g�ɔz���ێ�
                       plantList.add(plantData);
       
                   // �S�H��̏ꍇ ==============================================
                   } else {
                      // �H��R�[�h���H��}�X�^����擾
                       AbstractBatchAppEntity mPlantAll = getreadMPlant_all();
                       try {
                           mPlantAll.read();
                       } catch (Exception e) {
                           throw e;
                       }
                       // �H��f�[�^�����X�g�ɕێ����Ă���
                       while (mPlantAll.next()) {
                           // �H��R�[�h�ƃ��b�N���i�[����z���p��
                           Object plantData[] = new Object[3];
                           plantData[0] = getcurrentPlantCd(); // �H��R�[�h���Z�b�g
                           plantData[1] = null;                // ���b�N�I�u�W�F�N�g�i�[�p
                           plantData[2] = null;                // ���b�N�����L�[�i�[�p
                           // ���X�g�ɔz���ێ�
                           plantList.add(plantData);
                       }
                   }   // -- end of if
       
                   // ���v�ʌv�Z�������s��
                   executeAllBatch(conn, plantList);
       
               } catch (Exception e) {
                   throw e;
               }
       
           }
       
       
           /**
            * �S�Ă̍H��ɂ��āA���v�ʌv�Z���������s����B
            * �G���[�����������ꍇ�AmetamorBase�Ɩ����b�Z�[�W���o�͂���B
            * �܂��AOrteus���b�Z�[�W���o�͂���B
            * @param conn DB�R�l�N�V����
            * @param plantList �H��R�[�h�̃��X�g
            * @return �Ȃ�
            */
           protected void executeAllBatch(IDbConnection conn, ArrayList plantList) throws Exception{
       
               try {
       
                   // 1���ڂ̍H��R�[�h�̋Ɩ����b�Z�[�W�Ƃ��ďo�͂��鏈�� ------------------
                   // ��`�t�@�C������̃p�����[�^�̎擾�A���v�ʌv�Z���`�F�b�N���s���B
                   // ���̏����Ŕ��������G���[�Ɋւ��ẮA1���ڂ̍H��R�[�h�̋Ɩ����b�Z�[�W�Ƃ��ďo�͂���
       
                   // 1���ڂ̍H��R�[�h���擾
                   Object firstPlant[] = (Object[]) plantList.get(0);
                   String firstPlantCd = firstPlant[0].toString();
       
                   try {
       
                       // ��`�t�@�C���̃p�����[�^���擾���A���v�ʌv�Z�p�����o�ϐ��ɃZ�b�g����
                       setConfigParameters();
       
                       // ���v�ʌv�Z���`�F�b�N
                       AbstractBatchAppEntity sysOdCalcCtrl = getreadSysOdCalcCtrl_all();
                       sysOdCalcCtrl.read();
       
                       // 1���ł��i1�H��ł��j���v�ʌv�Z���ł���΁A�������I������B
                       if (sysOdCalcCtrl.next()) {
                           businessErrCode = "AC00107"; // ���v�ʌv�Z���s���ł��B
                           errCode = businessErrCode;
                           throw new Exception();
                       }
                       //���v�ʌv�Z��(����)�`�F�b�N
                       setPLANT_CD(plantCd);
                       setJOB_ODR_CD(jobOdrCd);
                       AbstractBatchAppEntity sysJobOdCalcCtrl = getreadSysJobOdCalcCtrl_all();
                       sysJobOdCalcCtrl.read();
       
                       // ���v�ʌv�Z��(����)�f�[�^������΁A�������I������B
                       if (sysJobOdCalcCtrl.next()) {
                    	   if(getodCalcFlg().intValue()==1){
                    		   businessErrCode = "AC00235"; // ���v�ʌv�Z(����)���s���ł��B
                               errCode = businessErrCode;
                               throw new Exception();
                    	   }                           
                       }else{
                    	   businessErrCode = "AC00237"; // ���v�ʌv�Z����i���ԁj�f�[�^�����݂��܂���B
                           errCode = businessErrCode;                           
                           throw new Exception();
                       }
       
                   // ����catch�ł́AmetamorBase�Ɩ����b�Z�[�W�����Orteus�Ɩ����b�Z�[�W�̏o�͂��s���B
                   } catch (Exception e) {
                       // �o�b�`�G���[���b�Z�[�W�̃Z�b�g
                       setBatchErrorMessage(e);
                       // metamorBase�Ɩ����b�Z�[�W�̏o��
                       outBusinessMessage(conn, businessName, userId, firstPlantCd);
                       // Orteus�Ɩ����b�Z�[�W�̔��l�Ƀ��b�Z�[�W���R�s�[���Ă���
                       memoText = errMsg;
                       throw e;
                   } finally {
                       // Orteus�Ɩ����b�Z�[�W�̑��M
                       sendOrteusMessage(conn, firstPlantCd);
                   }
       
       
                   // ���̓����ŃG���[�����������ꍇ�A���łɂ������Ă���Ɩ����b�N��
                   // �S�ĉ�������
                   try {
       
                       // �S�Ă̍H��ɂ��ċƖ����b�N�������Ă���
                       for (Iterator it = plantList.iterator(); it.hasNext();) {
                           Object plantData[] = (Object[]) it.next();
                           plantCd = plantData[0].toString();
                           try {
                               try {
       
                                   BusinessLock lock = new BusinessLock(conn, userId, plantCd);
                                   int lockCancelKey = lock.doLock(businessName);  // �����L�[�̎擾
                                   conn.commit();
                                   if (lockCancelKey == -1) throw new Exception();
       
                                   // ���b�N��ێ����Ă���
                                   plantData[1] = lock;
                                   plantData[2] = new Integer(lockCancelKey);
                               } catch (Exception e) {
                                   businessErrCode = "ZZ01001"; // �Ɩ����b�N����Ă��邽�ߋN���ł��܂���
                                   throw e;
                               }
                           } catch (Exception e) {
                               if (businessErrCode == null) {
                                   businessErrCode = "ZZ09009";  // �o�b�`�������J�n�ł��܂���ł����B
                               }
                               errCode = businessErrCode;
                               // �o�b�`�G���[���b�Z�[�W�̃Z�b�g
                               setBatchErrorMessage(e);
                               // metamorBase�Ɩ����b�Z�[�W�̏o��
                               outBusinessMessage(conn, businessName, userId, plantCd);
                               // Orteus�Ɩ����b�Z�[�W�̔��l�Ƀ��b�Z�[�W���R�s�[���Ă���
                               memoText = errMsg;
                               throw e;
                           } finally {
                               // Orteus���b�Z�[�W�̑��M
                               sendOrteusMessage(conn, plantCd);
                           }
                       }   // -- end of for
       
       
                       // �S�Ă̍H��ɂ��ď��v�ʌv�Z���������s����B
                       for(Iterator it = plantList.iterator(); it.hasNext();){
                           Object plantData[] = (Object[]) it.next();
                           plantCd = plantData[0].toString();
                           BusinessLock lock = (BusinessLock) plantData[1];
                           int lockCancelKey = ((Integer) plantData[2]).intValue();
       
                           try {
                               // ���O�o�̓p�X�i�t���p�X�j�������o�ϐ��ɃZ�b�g
                               setBatchLogFullPath();
                               // ���v�ʌv�Z�o�b�`���������s����
                               executeBatch();
                           } catch (Exception e) {
                               // �o�b�`�G���[���b�Z�[�W�̃Z�b�g
                               setBatchErrorMessage(e);
                               // metamorBase�Ɩ����b�Z�[�W�̏o��
                               outBusinessMessage(conn, businessName, userId, plantCd);
                               // Orteus�Ɩ����b�Z�[�W�̔��l�Ƀ��b�Z�[�W���R�s�[���Ă���
                               memoText = errMsg;
                               throw e;
                           } finally {
                               try {
                                   // �Ɩ����b�N����
       
                                   lock.doUnLock(businessName, lockCancelKey);
                                   conn.commit();
                               } catch (FoundationException e) {
                                   businessErrCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
                                   errCode = businessErrCode;
                                   // �o�b�`�G���[���b�Z�[�W�̃Z�b�g
                                   setBatchErrorMessage(e);
                                   // metamorBase�Ɩ����b�Z�[�W�̏o��
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus�Ɩ����b�Z�[�W�̔��l�Ƀ��b�Z�[�W���R�s�[���Ă���
                                   memoText = errMsg;
                                   throw e;
                               } catch (Exception e) {
                                   businessErrCode = "ZZ09009";  // �o�b�`�������J�n�ł��܂���ł����B
                                   errCode = businessErrCode;
                                   // �o�b�`�G���[���b�Z�[�W�̃Z�b�g
                                   setBatchErrorMessage(e);
                                   // metamorBase�Ɩ����b�Z�[�W�̏o��
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus�Ɩ����b�Z�[�W�̔��l�Ƀ��b�Z�[�W���R�s�[���Ă���
                                   memoText = errMsg;
                                   throw e;
                               } finally {
                                   // Orteus���b�Z�[�W�̑��M
                                   sendOrteusMessage(conn, plantCd);
                               }
                           }
                       }  // -- end of for
       
                   // 1���ł��G���[�����������ꍇ�A���ׂĂ̋Ɩ����b�N����������B
                   } catch (Exception e) {
       
                       for (Iterator it = plantList.iterator(); it.hasNext();) {
                           Object plantData[] = (Object[]) it.next();
                           plantCd = plantData[0].toString();
       
                           // ���b�N���������Ă���ꍇ�A�������s��
                           if (plantData[1] != null) {
                               BusinessLock lock = (BusinessLock) plantData[1];
                               int lockCancelKey = ((Integer) plantData[2]).intValue();
                               try {
                                   // �Ɩ����b�N����
       
                                   lock.doUnLock(businessName, lockCancelKey);
                                   conn.commit();
                               } catch (FoundationException fe) {
                                   businessErrCode = "ZZ01004";  // �Ɩ����b�N�̉����Ɏ��s���܂����B
                                   errCode = businessErrCode;
                                   // �o�b�`�G���[���b�Z�[�W�̃Z�b�g
                                   setBatchErrorMessage(e);
                                   // metamorBase�Ɩ����b�Z�[�W�̏o��
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus�Ɩ����b�Z�[�W�̔��l�Ƀ��b�Z�[�W���R�s�[���Ă���
                                   memoText = errMsg;
                                   throw e;
                               } catch (Exception ex) {
                                   businessErrCode = "ZZ09009";  // �o�b�`�������J�n�ł��܂���ł����B
                                   errCode = businessErrCode;
                                   // �o�b�`�G���[���b�Z�[�W�̃Z�b�g
                                   setBatchErrorMessage(e);
                                   // metamorBase�Ɩ����b�Z�[�W�̏o��
                                   outBusinessMessage(conn, businessName, userId, plantCd);
                                   // Orteus�Ɩ����b�Z�[�W�̔��l�Ƀ��b�Z�[�W���R�s�[���Ă���
                                   memoText = errMsg;
                                   throw e;
                               } finally {
                                   sendOrteusMessage(conn, plantCd); // Orteus���b�Z�[�W�̑��M
                               }
                           }  // -- end of if
                       }  // -- end of for
       
                       throw e;
                   }
       
               } catch (Exception e) {
                   throw e;
               }
           }
       
       
       
           /**
            * ���v�ʌv�Z�o�b�`���������s����
            *
            * @return �Ȃ�
            */
           protected void executeBatch() throws Exception {
       
               try {
//                   String cmd = programPath;
//                   cmd = cmd + " /U:" + userId;
//                   cmd = cmd + " /B:" + businessName ;
//                   cmd = cmd + " /K:" + plantCd ;
//                   cmd = cmd + " /O:" + connectDbuser ;
//                   cmd = cmd + " /P:" + connectDbpass ;
//                   cmd = cmd + " /D:" + connectDbhost ;
//                   cmd = cmd + " /R:" + batchRollbackFlg ;
//                   cmd = cmd + " /N:" + batchRollbackSeg ;
//                   cmd = cmd + " /L:" + batchLogFullPath ;
//                   cmd = cmd + " /M:" + mrpExeLogMode ;
//                   cmd = cmd + " /F:" + mrpExpMode ;
//                   cmd = cmd + " /J:" + jobOdrCd ;
//
//               Process p = Runtime.getRuntime().exec(cmd);
//                   p.waitFor();
       
                   List buffer = new ArrayList();
                   buffer.add(programPath);
                   buffer.add("/U:" + userId);
                   buffer.add("/B:" + businessName);
                   buffer.add("/K:" + plantCd);
                   buffer.add("/O:" + connectDbuser);
                   buffer.add("/P:" + connectDbpass);
                   buffer.add("/D:" + connectDbhost);
                   buffer.add("/R:" + batchRollbackFlg);
                   buffer.add("/N:" + batchRollbackSeg);
                   buffer.add("/L:" + batchLogFullPath);
                   buffer.add("/M:" + mrpExeLogMode);
                   buffer.add("/F:" + mrpExpMode);
                   buffer.add("/J:" + jobOdrCd);

                   // �o�b�`�������s
                   Process p = Runtime.getRuntime().exec((String[])buffer.toArray(new String[buffer.size()]));
                   p.waitFor();
               } catch (Exception e) {
                   businessErrCode = "ZZ09009"; // �o�b�`�������J�n�ł��܂���ł����B
                   errCode = businessErrCode;
                   throw e;
               }
       
           }
       
       
           /**
            * main�������擾���A�����o�ϐ��ɃZ�b�g����B
            * �����̑Ó����`�F�b�N���s���B
            *
            * @return �Ȃ�
            */
           protected void setParamArgs() throws Exception{
       
               // main�����󂯎��
               String args[] = getArgs();
               int argsLength = args.length;   // �����̌���ێ�
       
               // ������ϐ��ɃZ�b�g����B�Ó����`�F�b�N���s���B
               if (argsLength >= 4) {
                   userId = args[0];
                   mrpExpMode = args[1];
                   if (mrpExpMode.equals("2")){
                       jobOdrCd = args[2];
                       plantCd = args[3];
                   }
               } else {
                   errCode = "AC00111"; // �o�b�`���������̌`�����s���ł�
                   throw new Exception();
               }
           }
       
       
           /**
            * ��`�t�@�C�����珊�v�ʌv�Z�p�����[�^���擾���A�����o�ϐ��ɃZ�b�g����
            *
            * @return �Ȃ�
            */
           protected void setConfigParameters() throws Exception{
               try {
                   ResourceBundle config = SystemConfig.getBundle();
                   connectDbuser = SystemConfig.getProperty("CONNECT_DBUSER", config);
                   connectDbpass = SystemConfig.getProperty("CONNECT_DBPASS", config);
                   connectDbhost = SystemConfig.getProperty("CONNECT_DBHOST", config);
                   batchRollbackFlg = SystemConfig.getProperty("BATCH_ROLLBACK_FLG", config);
                   batchRollbackSeg = SystemConfig.getProperty("BATCH_ROLLBACK_SEG", config);
                   batchLogPath = SystemConfig.getProperty("BATCH_LOG_PATH", config);
                   mrpExeLogFile = SystemConfig.getProperty("MRP_EXE_LOG_FILE", config);
                   programPath = SystemConfig.getProperty("PROGRAM_PATH", config);
                   
                   mrpExeLogMode = SystemConfig.getProperty("MRP_EXE_LOG_MODE", config);
                   
                   if ( mrpExeLogMode == null ) { // ���O�o�̓��[�h�擾�Ɏ��s
                   		// �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂����B(�l�q�o���O�o�̓��[�h)
                   		getSyslog().warning( new ExpjMessage("ZZ09031"), getUsername() );
                   		mrpExeLogMode = "1";
                   } else if ( !mrpExeLogMode.equals("0") && !mrpExeLogMode.equals("1") ) {
                   	   // �l�q�o���O�o�̓��[�h���s���ł��B
                   	   ExpjMessage emsg = new ExpjMessage( "ZZ09032" );
                   	   getSyslog().severe( emsg, getUsername() );
                   	   emsg = new ExpjMessage( "ZZ01006", "MRP_EXE_LOG_MODE : " + mrpExeLogMode );
                   	   getSyslog().severe( emsg, getUsername() );
                   	   throw new ExpjException( emsg );
                   }
               } catch ( Exception e ) {
                   businessErrCode = "ZZ09009"; // �o�b�`�������J�n�ł��܂���ł����B
                   errCode = businessErrCode;
                   throw e;
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
                   errCode = "AC53402";  // ���̑��@�d��������
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
                                             String plantCd) throws Exception{
       
               // ����̋Ɩ��G���[�R�[�h���Z�b�g����Ă��Ȃ��ꍇ
               if (businessErrCode == null) {
                   businessErrCode = "ZZ09009";  // �o�b�`�������J�n�ł��܂���ł����B
               }
       
               // �Ɩ����b�Z�[�W�̏���
               BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
               BusinessMessage businessMsg = new BusinessMessage();
               businessMsgAcc.init(conn);
               businessMsg.setBusinessOperatingName(businessName);
               businessMsg.setUser(userId);
               businessMsg.setPlantCode(plantCd);
               businessMsg.setMessageCode(businessErrCode);
               businessMsg.setData(errNote);
               try {
          Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
          businessMsg.setLogCode(logCd.getNo());
                   businessMsgAcc.add(businessMsg);
                   // �Ɩ����b�Z�[�W�́A�Ɩ��v���O�������ŃR�l�N�V�������R�~�b�g����
                   // �K�v������B���v�ʌv�Z�w���́A�Ɩ��v���O�����Ńg�����U�N�V������
                   // �ӎ�����K�v���Ȃ����߁A���C�������Ɠ����R�l�N�V�����ɑ΂��s�x�R�~�b�g
                   // ����B
                   conn.commit();
               } catch (SQLException e) {
                   errCode = "AC00999"; // SQL���s���G���[�B
                   throw e;
               } catch (Exception e) {
                   errCode = "AC53402";  // ���̑��@�d��������
                   throw e;
               }
           }
       
       
           /**
            * Orteus�W���Ɩ����b�Z�[�W�̑��M���s���B
            *
            * @param conn DB�R�l�N�V����
            * @param plantCd �H��R�[�h
            * @return �Ȃ�
            */
           protected void sendOrteusMessage(IDbConnection conn, String plantCd) {
       
               /* �e�X�g�p�����[�X���̓R�����g�� *
               try {
       
                   //Business business = Business.getStartBusiness(getBUSINESS_GROUP_CD(), args[1], getBUSINESS_CD());
                   Business business = Business.getStartBusiness(getBUSINESS_GROUP_CD(), userId, getBUSINESS_CD());
                   business.setMessageDisplayLevel(1); // �\�����x��(�d�v�x)�̎w��
                   business.setMessageReference(memoText); // ���l�̎w��
                   business.complete();
               }
               catch(MessageApiException e) {
                   e.printStackTrace();
       
                   // �Ɩ����b�Z�[�W�̓o�^�i�o�b�`�I�����b�Z�[�W���M���s���j
                   businessErrCode = "ZZ09008";
       
                   // �Ɩ����b�Z�[�W�̏���
                   BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
                   businessMsgAcc.init(conn);
                   BusinessMessage businessMsg = new BusinessMessage();
                   businessMsg.setBusinessOperatingName(businessName);
                   businessMsg.setUser(userId);
                   businessMsg.setPlantCode(plantCd);
                   businessMsg.setMessageCode(businessErrCode);
                   businessMsg.setData("");
                   try {
           Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
           businessMsg.setLogCode(logCd.getNo());
                       businessMsgAcc.add(businessMsg);
                   }
                       catch (SQLException ex) {
                       ex.printStackTrace();
                   }
                   AlarmMessage msg = new AlarmMessage(businessErrCode);
                   errMsg = businessErrCode + " " + msg.getMessage();
       
               }
               �e�X�g�p�����[�X���̓R�����g�� */
               // =========================================================
       
           }
       //=========================================================================
       
        //}}user_implement_dev:original

	//////////////////////////////

}
