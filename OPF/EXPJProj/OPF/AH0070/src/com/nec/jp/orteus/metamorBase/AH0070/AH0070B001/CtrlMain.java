/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0070/src/com/nec/jp/orteus/metamorBase/AH0070/AH0070B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0070.AH0070B001;

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
//------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageControl;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageInformation;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.util.Date;
//------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.10 $ $Date: 2014/11/05 07:13:46 $
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
	public medAH0070B001 m_med=null;

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
	public CtrlMain(medAH0070B001 med, BatchAppConductor cdr) throws BatchAppException
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
        //------------------------------------------------------------------
        ////////////////////////////////////////////////////////////////////////////
		
		/** ���O���x�� �C���t�H���[�V���� */
        private static final int INFOMATION = 0;
        /** ���O���x�� ���[�j���O */
        private static final int WORNING = 1;
        /** ���O���x�� �G���[ */
        private static final int ERROR = 2;
       
        /** DB�R�l�N�V���� */
        private IDbConnection conn = null;
       
        /** �Ɩ����b�Z�[�W���O�pNumbering�N���X */
        private Numbering numbering = null;
        /** �Ɩ����b�Z�[�W���O�pBusinessMessageAccessor�N���X */
        private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
        /** �Ɩ����b�Z�[�W���O�pBusinessMessage�N���X */
        private BusinessMessage businessMsg = new BusinessMessage();
       
        /** �Ɩ����b�N�N���X */
        private BusinessLock lock = null;
       
        /** ���b�N���s�����b�N�L�[ */
        private static final int LOCK_FAILD = -1;
       
        /** �o�b�`�p�����[�^(����1) �o�b�`�����敪 */
        private String _sysBatchType;
        /** �o�b�`�p�����[�^(����2)�Ɩ�ID */
        private String _sysProgramId;
        /** �o�b�`�p�����[�^(����3)���[�UID */
        private String _sysUserCd;
        /** �o�b�`�p�����[�^(����4)�H��R�[�h */
        private String _sysPlantCd;
        // �o�b�`�N���X���ʃG���[�����p
        private String errCode = null;		     // �o�b�`�G���[�R�[�h
        private String errMsg = null;		     // �o�b�`�G���[���b�Z�[�W
        private String errNote = "";             // �o�b�`�G���[���b�Z�[�W(���l) �K�v�ɉ����Ďg�p�B
    
        // metamorBase�Ɩ����b�Z�[�W�p
        private String businessErrCode = null;   // metamorBase�Ɩ����b�Z�[�W�R�[�h
		
        /**
         * ���O�t�@�C���o��
         * @param logLevel ���O���x��
         * @param code ���b�Z�[�W�R�[�h
         * @param value �u��������
         */
        private void writeLogFiles(int logLevel, String code, String value) {
         ExpjMessage emsg;
         // �u�������񔻒�
         if (!isNull(value)) {
          emsg = new ExpjMessage(code, value);
         } else {
          emsg = new ExpjMessage(code);
         }
       
         // ���O���x���ɂ���ă��O�^�C�v�𕪂���
         switch (logLevel) {
          case INFOMATION :
           m_med.getSyslog().info(emsg, m_med.getUsername());
           break;
          case WORNING :
           m_med.getSyslog().warning(emsg, m_med.getUsername());
           break;
          case ERROR :
           m_med.getSyslog().severe(emsg, m_med.getUsername());
           break;
         }
        }
       
        /**
         * ���O�t�@�C���o��
         * @param logLevel ���O���x��
         * @param code ���b�Z�[�W�R�[�h
         */
        private void writeLogFiles(int logLevel, String code) {
         writeLogFiles(logLevel, code, null);
        }
       
        /**
         * ���ODB�o��
         * @param code ���b�Z�[�W�R�[�h
         * @param value �u��������
         * @param dataStr �f�[�^�X�g�����O
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLogDB(String code, String value, String dataStr)
         throws FoundationException, SQLException {
         if (numbering == null) {
          throw new NullPointerException();
         }
         businessMsg.setLogCode(numbering.getNo());
         businessMsg.setMessageCode(code);
         businessMsg.setData(dataStr);
         businessMsgAcc.add(businessMsg);
        }
       
        /**
         * ���ODB�o��
         * @param code ���b�Z�[�W�R�[�h
         * @param dataStr �f�[�^�X�g�����O
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLogDB(String code, String dataStr) throws FoundationException, SQLException {
         writeLogDB(code, null, dataStr);
        }
       
        /**
         * ���O�t�@�C���A���ODB�o�͂��s���܂��B
         * @param logLevel ���O���x��
         * @param code ���b�Z�[�W�R�[�h
         * @param value �u��������
         * @param dataStr �f�[�^�X�g�����O
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code, String value, String dataStr)
         throws FoundationException, SQLException {
         writeLogFiles(logLevel, code, value);
         if (!isNull(dataStr)) {
          writeLogFiles(logLevel, "ZZ01006", dataStr);
         }
         writeLogDB(code, value, dataStr);
        }
       
        /**
         * ���O�t�@�C���A���ODB�o�͂��s���܂��B
         * @param logLevel ���O���x��
         * @param code ���b�Z�[�W�R�[�h
         * @param dataStr �f�[�^�X�g�����O
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code, String dataStr)
         throws FoundationException, SQLException {
         writeLog(logLevel, code, null, dataStr);
        }
       
        /**
         * ���O�t�@�C���A���ODB�o�͂��s���܂��B
         * @param logLevel ���O���x��
         * @param code ���b�Z�[�W�R�[�h
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code) throws FoundationException, SQLException {
         writeLog(logLevel, code, null, null);
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
        * �o�b�`�p�����[�^�i���ʁj��ݒ肵�܂��B
        * @return �ݒ�ɐ��������ꍇ�� true �A���s�����ꍇ�� false ��Ԃ��܂��B
        * @throws BatchAppException
        */
        private boolean setCommonParams() throws BatchAppException {
         String[] args = m_med.getArgs();

         // �o�b�`�p�����[�^�̌`�����s���ȏꍇ
         if (args.length != 5) {
         writeLogFiles(ERROR, "ZZ09022");
         return false;
         }

         _sysBatchType = args[0];
         _sysProgramId = args[1];
         _sysUserCd = args[2];
         _sysPlantCd = args[3];

         return true;
        }

        /**
        * �o�b�`�p�����[�^�i���ʁj�̃`�F�b�N���s���܂��B
        * @return ����̏ꍇtrue�A�s���̏ꍇfalse
        * @throws BatchAppException
        */
        private boolean checkCommonParams() throws BatchAppException {
         // �o�b�`�����敪��Null�̏ꍇ
         if (isNull(_sysBatchType)) {
         	writeLogFiles(ERROR, "ZZ09023");
         	return false;
         }

         // �o�b�`�����敪���P�A�Q�ȊO�̏ꍇ
         if ((!_sysBatchType.equals("1") && !_sysBatchType.equals("2"))) {
         	writeLogFiles(ERROR, "ZZ09024");
         	return false;
         }

         // ���[�U�[�R�[�h��Null�̏ꍇ
         if (isNull(_sysUserCd)) {
         	writeLogFiles(ERROR, "ZZ09025");
         	return false;
         }

         // [���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
         if (!isExsistsUserMst(_sysUserCd)) {
         	writeLogFiles(ERROR, "ZZ09026");
         	return false;
         }

         // �H��R�[�h��Null�̏ꍇ
         if (isNull(_sysPlantCd)) {
         	writeLogFiles(ERROR, "ZZ09027");
         	return false;
         }
         // [�H��]�ɑ��݂��Ȃ��ꍇ
         if (!isExistsMPlant(_sysPlantCd)) {
         	writeLogFiles(ERROR, "ZZ09028");
         	return false;
         }
         	
         // �Ɩ�����Null�̏ꍇ
         if (isNull(_sysProgramId)) {
             writeLogFiles(ERROR, "ZZ09029");
             return false;
         }

        return true;
        }

        /**
        * [���[�U�}�X�^]�ɑ��݂��邩�𔻒肵�܂� �B
        * @return [���[�U�}�X�^]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
        */
        private boolean isExsistsUserMst(String userCd) throws BatchAppException {
         m_med.setUSER_CD(userCd);
         m_med.getUSER_MST().read();
         return m_med.getUSER_MST().hasRecord(false);
        }

        /**
        * [�H��]�ɑ��݂��邩�𔻒肵�܂� �B
        * @param plantCd �H��R�[�h
        * @return [�H��]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
        */
        private boolean isExistsMPlant(String plantCd) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.getM_PLANT().read();
         return m_med.getM_PLANT().hasRecord(false);
        }

        /**
        * �I�����A�H��R�[�h��[�I������]�ɒI�����F�敪��2�F�I�����F�ρ@�ł͂Ȃ��̃f�[�^�����݂��邩�𔻒肵�܂� �B
        * @param plantCd �H��R�[�h
        * @param invDate �I����
        * @return [�I������]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
        */
        private boolean isExistsMTInvCtrL(String plantCd,String invDate) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.setINV_DATE(invDate);
         m_med.getT_INV_CTRL().read();
         return m_med.getT_INV_CTRL().hasRecord(false);
        }

        /** �o�b�`�p�����[�^(�Ɩ��ŗL)�I���� */
        private String _InvDate;

        /**
        * �o�b�`�p�����[�^�i�Ɩ��ŗL�j�̐ݒ���s���܂��B
        * @return ����̏ꍇtrue�A�s���̏ꍇfalse
        * @throws BatchAppException
        * @throws FoundationException
        * @throws SQLException
        */
        private boolean setParams() throws BatchAppException {
         String[] args = m_med.getArgs();

         _InvDate = args[4];

         return true;
        }

         /**
         * �Ɩ����b�N���s���܂�
         * @return ���b�N�L�����Z���L�[
         * @throws FoundationException
         */
        private int businessLock() throws FoundationException {
         lock = new BusinessLock(conn, _sysUserCd, _sysPlantCd);
         // �����L�[�̎擾
         int lockCancelKey = lock.doLock(m_med.getProgname());
         conn.commit();
         return lockCancelKey;
        }
       
        /**
         * �Ɩ����b�N���������܂�
         * @param lockCancelKey ���b�N�L�����Z���L�[
         * @return ���b�N����������true�A���s��false
         * @throws FoundationException
         */
        private boolean businessUnLock(int lockCancelKey) throws FoundationException {
       
         if (lockCancelKey == LOCK_FAILD) {
          return true;
         }
         boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
         conn.commit();
         return result;
        }

        /**
         * �Ώۂ̕�����Null�i�󕶎����邢��Null�j�ł��邩�𔻒肵�܂��B
         * @param str �Ώە�����
         * @return Null�̏ꍇ��true�ANull�ł͂Ȃ��ꍇ��false
         */
        private boolean isNull(String str) {
        	if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
        		return true;
        	}
        	return false;
        }
       
        ////////////////////////////////////////////////////////////////////////////
        /*
         * �Ɩ����b�Z�[�W�o�͗p���b�Z�[�W�萔
         */
        private final String MES_UPDATE_START					= "(SBM0641)<< �I���X�V�����J�n >>";
        private final String MES_UPDATE_END						= "(SBM0642)<< �I���X�V�����I�� >>";
        private final String MES_UPDATE_START4INV_CTRL			= "(SBM0643)<< �I������X�V�J�n >>";
        private final String MES_UPDATE_END4INV_CTRL			= "(SBM0644)<< �I������X�V�I�� >>";
        private final String MES_UPDATE_START4ITEM_STOCK		= "(SBM0645)<< �ۊǋ�ʕi�ڍ݌ɍX�V�J�n >>";
        private final String MES_UPDATE_END4ITEM_STOCK			= "(SBM0646)<< �ۊǋ�ʕi�ڍ݌ɍX�V�I�� >>";
        private final String MES_UPDATE_START4JOB_ODR_CD_STOCK	= "(SBM0647)<< �ۊǋ�ʐ��ԍ݌ɍX�V�J�n >>";
        private final String MES_UPDATE_END4JOB_ODR_CD_STOCK	= "(SBM0648)<< �ۊǋ�ʐ��ԍ݌ɍX�V�I�� >>";
        private final String MES_UPDATE_START4LOT_STOCK         = "(SBM0649)<< ���b�g�ʕi�ڍ݌ɍX�V�J�n >>";
        private final String MES_UPDATE_END4LOT_STOCK			= "(SBM0650)<< ���b�g�ʕi�ڍ݌ɍX�V�I�� >>";
        ////////////////////////////////////////////////////////////////////////////
       /**
         * �����������̃��b�Z�[�W���H�ݒ菈��
         *
         * @param	invAccessor		�I���A�N�Z�b�T�N���X
         * @param	strMessageCode	���b�Z�[�W�R�[�h
         * @param	strAddMessage	�ǉ����b�Z�[�W
         * @return	�Ȃ�
         */
        private void resultMessage4Success(
         InvAccessor invAccessor,
         String strMessageCode,
         String strAddMessage) throws FoundationException, SQLException 
        {
         InvMessageInformation invMessageInfo = null;
         InvMessageControl msg = invAccessor.getMessage();
         String strResultNote = "";
         for(int i = 0; ((invMessageInfo = msg.get(i)) != null); i++)
         {
          if(invMessageInfo.getType() == InvMessageControl.TYP_SUCCESS)
          {
           strResultNote = invMessageInfo.getNote();
           System.out.println(strAddMessage + strResultNote);
           writeLog(INFOMATION,strMessageCode,strAddMessage + strResultNote);
           break;
          }
         }
         return;
        }

        /**
         * �������s���̃��b�Z�[�W���H�ݒ菈��
         *
         * @param	invAccessor	�I���A�N�Z�b�T�N���X
         * @return	�Ȃ�
         * @throws  FoundationException
         */
        private void resultMessage4Error(
         InvAccessor invAccessor) throws FoundationException, SQLException 
        {
         InvMessageInformation invMessageInfo = null;
         InvMessageControl msg = invAccessor.getMessage();
         String strErrorCode = "";
         String strResultNote = "";
         for(int i = 0; ((invMessageInfo = msg.get(i)) != null); i++)
         {
          strResultNote = invMessageInfo.getNote();
          if(invMessageInfo.getParentType() == InvMessageControl.TYP_ERROR)
          {
           if(invMessageInfo.getType() == InvMessageControl.TYP_SQL_ERROR)
           {
            strErrorCode = "AH53401";// SQL�G���[
           }
           else
           {
            strErrorCode = invMessageInfo.getCode();
            if(strErrorCode == null || "".equals(strErrorCode) == true)
            {
             strErrorCode = "AH53402";// ���̑��G���[
            }
           }
           writeLog(ERROR,strErrorCode,strResultNote);
          }
          System.out.println(strResultNote);
          break;
         }
         return;
        }
       
        ////////////////////////////////////////////////////////////////////////////
        /**
         * �X�V�������C��
         *
         * @param	conn			DB�A�N�Z�X�p�̃R�l�N�V����
         * @param	userId			���[�U�R�[�h
         * @param	plantCd			�H��R�[�h
         * @param	strProgramName	�v���O������
         * @param	arg				���̑��̈����̕�����
         * @return	�Ȃ�
         */
        private void updateCore(
         IDbConnection conn, 
         String userId, 
         String plantCd, 
         String strProgramName, 
         String arg) throws Exception
        {
         // DB�X�V���t���O������
         boolean bDBUpdate = false;
       
         // �p�����[�^
         String strInvDate = null;	// �I����
         try
         {
          // �����擾 ********************************************************
          StringTokenizer tokEtcPrm = new StringTokenizer(arg, ",");	// ���̑��̈����F�I����
          int i = 0;
          while(tokEtcPrm.hasMoreTokens())
          {
           if(i == 0)
           {
            strInvDate = (String)tokEtcPrm.nextElement();  // �I����
            i++;
           }
          }
          // ���̓`�F�b�N ****************************************************
          // �G���[�t���O������
          boolean bError = false;
       
          // �I�����擾
          if(strInvDate == null || strInvDate.equals("null") || strInvDate.equals("Null") || strInvDate.equals("NULL"))
          {
           strInvDate = null;
          }
       
          // �I���������̓`�F�b�N
          if(strInvDate == null || "".equals(strInvDate) == true)
          {
           bError = true;
          }
          else
          {
           // ���t�`���`�F�b�N
           DateConverter dateConv = new DateConverter();
           Date dateWork = dateConv.str2date(strInvDate);
           if(dateWork == null)
           {
            bError = true;
           }
          }
          if(bError == true)
          {
           System.out.println("(SBM0639)�I�����F[ " + strInvDate + " ]");
           System.out.println("(SBM1018)�I�����Ɏw�肳�ꂽ���t�̌`�����s���ł��B");
           writeLog(ERROR, "AH50805","(SBM0639)�I�����F[ " + strInvDate + " ]");
           throw new Exception();
          }
       
          // �X�V���� ********************************************************
          // �������s�O���� --------------------------------------------------
          String strResultNote;
          String strErrorCode;
          boolean bSuccess;
       
          // �g�����U�N�V�����J�n
          conn.beginTransWeb();
       
          // �I���A�N�Z�b�T�N���X����
          InvAccessor invAccessor = new InvAccessor(plantCd, userId, strProgramName);
       
          // DB�X�V���t���OON
          bDBUpdate = true;
       
          // �������s --------------------------------------------------------
          System.out.println(MES_UPDATE_START + "�I�����F[ " + strInvDate + " ]");
          System.out.println("(SBM0992)�o�b�`�������J�n���܂����B");
          writeLog(INFOMATION, "ZZ09001",MES_UPDATE_START + "�I�����F[ " + strInvDate + " ]");// �o�b�`�������J�n���܂����B
       
          // �I������X�V���s ------------------------------------------------
          System.out.println(MES_UPDATE_START4INV_CTRL);
          System.out.println("(SBM0993)�I������̍X�V���J�n���܂����B");
          writeLog(INFOMATION, "AH50810",MES_UPDATE_START4INV_CTRL);// �I������̍X�V���J�n���܂����B
          bSuccess = invAccessor.updateInvCtrl(conn, strInvDate);
          if(bSuccess == true)
          {
           // �X�V����
           System.out.println("(SBM0994)�I������̍X�V���I�����܂����B");
           resultMessage4Success(invAccessor, "AH50811", MES_UPDATE_END4INV_CTRL);//�I������̍X�V���I�����܂����B
          }
          else
          {
           // �X�V���s
           resultMessage4Error(invAccessor);
           System.out.println("(SBM0995)�I������̍X�V�ŃG���[���������܂����B");

           throw new Exception();
          }
       
          // �ۊǋ�ʕi�ڍ݌ɍX�V���s ----------------------------------------
          System.out.println(MES_UPDATE_START4ITEM_STOCK);
          System.out.println("(SBM0996)�ۊǋ�ʕi�ڍ݌ɂ̍X�V���J�n���܂����B");
          writeLog(INFOMATION, "AH50806",MES_UPDATE_START4ITEM_STOCK);
          bSuccess = invAccessor.updateItemStock(conn, strInvDate);
          if(bSuccess == true)
          {
           // �X�V����
           System.out.println("(SBM0997)�ۊǋ�ʕi�ڍ݌ɂ̍X�V���I�����܂����B");
           resultMessage4Success(invAccessor, "AH50807", MES_UPDATE_END4ITEM_STOCK);
          }
          else
          {
           // �X�V���s
           resultMessage4Error(invAccessor);
           System.out.println("(SBM0998)�ۊǋ�ʕi�ڍ݌ɂ̍X�V�ŃG���[���������܂����B");
           throw new Exception();
          }
       
          // �ۊǋ�ʐ��ԍ݌ɍX�V���s ----------------------------------------
          System.out.println(MES_UPDATE_START4JOB_ODR_CD_STOCK);
          System.out.println("(SBM0999)�ۊǋ�ʐ��ԍ݌ɂ̍X�V���J�n���܂����B");
          writeLog(INFOMATION, "AH50808",MES_UPDATE_START4JOB_ODR_CD_STOCK);
          bSuccess = invAccessor.updateJobOdrCdStock(conn, strInvDate);
          if(bSuccess == true)
          {
           // �X�V����
           resultMessage4Success(invAccessor, "AH50809", MES_UPDATE_END4JOB_ODR_CD_STOCK);
           System.out.println("(SBM1000)�ۊǋ�ʐ��ԍ݌ɂ̍X�V���I�����܂����B");
          }
          else
          {
           // �X�V���s
           resultMessage4Error(invAccessor);
           System.out.println("(SBM1001)�ۊǋ�ʐ��ԍ݌ɂ̍X�V�ŃG���[���������܂����B");
           throw new Exception();
          }
          
          // ���b�g�ʕi�ڍ݌ɍX�V���s ----------------------------------------         
	      if(LotCtrl.checkLotCtrl(conn)){
	    	System.out.println("(SBM1002)���b�g�ʕi�ڍ݌ɂ̍X�V���J�n���܂����B");
	    	writeLog(INFOMATION, "AH50812",MES_UPDATE_START4LOT_STOCK);         
	    	bSuccess = invAccessor.updateLotStock(conn, strInvDate);
	    	if(bSuccess)
	    	{
	    		// �X�V����
	    		System.out.println("(SBM1003)���b�g�ʕi�ڍ݌ɂ̍X�V���I�����܂����B");
	    		resultMessage4Success(invAccessor, "AH50813", MES_UPDATE_END4LOT_STOCK);
	    	}
	    	else
	    	{
	    		// �X�V���s
	    		resultMessage4Error(invAccessor);
	    		System.out.println("(SBM1004)���b�g�ʕi�ڍ݌ɂ̍X�V�ŃG���[���������܂����B");
	    		throw new Exception();
	    	}  
	      }
          // �������� --------------------------------------------------------
          // �R�~�b�g
          conn.commit();
       
          // DB�X�V���t���OOFF
          bDBUpdate = false;
       
          // �����I�� --------------------------------------------------------
       
         } finally {
          if(bDBUpdate == true)
          {
           try {
            // ���[���o�b�N
            conn.rollback();
            System.out.println("CtrlMain�Fmain - rollback ok");
           } catch(FoundationException fe) {
            System.out.println("(SBM0640)���[���o�b�N�Ɏ��s���܂����B");
            System.out.println("CtrlMain�Fmain - rollback failed");
            writeLog(INFOMATION, "AH53402","(SBM0640)���[���o�b�N�Ɏ��s���܂����B");
           }
          }
         }
         return;
        }
        
        //------------------------------------------------------------------
       
        /**
         * CtrlMain�N���X�̕W���R���X�g���N�^
         *
         * @return �Ȃ�
         */
        public CtrlMain(medAH0070B001 med) throws BatchAppException
        {
         // �����o�ϐ������������܂�
         m_med = med;
         m_control = new interControl(med);
       
       
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
         // ���b�N�����L�[
		int lockCancelKey = LOCK_FAILD;
		
		// �p�����[�^�擾
		String[] args = m_med.getArgs();
		
		// �o�b�`�p�����[�^�o��
		System.out.println("-------------------------------------------------");
		System.out.println("execute " + m_med.getProgname());
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}
		
		// DB�ڑ��擾����
		conn = m_conductor.m_transactionConn;

          if(args.length >= 2){
            m_med.setUsername(args[1]);
          }
		
		// �o�b�`�p�����[�^�i���ʁj���p�����[�^�ϐ��ɐݒ�
		if (!setCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		// ���Ɩ����W�b�N
		// �o�b�`�p�����[�^�i�Ɩ��ŗL�j���p�����[�^�ϐ��ɐݒ�
		if (!setParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		// �o�b�`�p�����[�^�i���ʁj�`�F�b�N
		if (!checkCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		try{
	         //////////////////////////////////////////////////////     		
     		PrivateConfig privateConfig = new PrivateConfig(conn);
     		String aprInvCtrl = privateConfig.getString("APR_INV_CTRL");
     		// �p�����[�^�u�I�����F�v���擾�ł��Ȃ������ꍇ
     		if(aprInvCtrl == null || "".equals(aprInvCtrl)){

  				String locale = CoreTools.getLocale(_sysUserCd);
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  	    		//ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00070"));
             	writeLogFiles(ERROR, "AZ00041", messages.getString("AZ00070"));
                businessErrCode = "KV03005"; //                 
                errCode = businessErrCode;
                errNote = messages.getString("AZ00070");
                //writeLogDB("AZ00041",errNote ,errNote);
                //AlarmMessage msg = new AlarmMessage(errCode);
                //errMsg = "[" + errCode + "]" + msg.getMessage();
        		outBusinessMessage(conn, _sysProgramId, _sysUserCd, _sysPlantCd);
                throw new Exception();		
     		}
     		if("1".equals(aprInvCtrl)){
     	         // [�I�����F]�ɑ��ݏꍇ
     	         if (isExistsMTInvCtrL(_sysPlantCd,_InvDate)) {
     	         	writeLogFiles(ERROR, "AH00047");
                    businessErrCode = "AH00047"; // 
                    errCode = businessErrCode;
            		outBusinessMessage(conn, _sysProgramId, _sysUserCd, _sysPlantCd);
                    throw new Exception();
     	         }
     		}	         
	        /////////////////////////////////////////////////////////
			// DB���b�Z�[�W�X�V����
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _sysPlantCd);
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(_sysProgramId);
			businessMsg.setUser(_sysUserCd);
			businessMsg.setPlantCode(_sysPlantCd);
			
			// �Ɩ����b�N
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01001");
				return BREAK;
			}
       
         ///////////////////////////////////////////////////////////////////
         // OPF��p���� �͂���
       
          // �X�V����
          updateCore(conn, _sysUserCd, _sysPlantCd, _sysProgramId, _InvDate);
       
         // OPF��p���� �����
         ///////////////////////////////////////////////////////////////////
         } catch (SQLException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (FoundationException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (Exception e) {
          // ������Exception���L���b�`���Ă͂����Ȃ��̂ł����Amain���\�b�h��
          // �Ăяo���Ă���execute���\�b�h��StackTrace���s��Ȃ����߃L���b�`���Ă��܂��B
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } finally { 
          try {
           // �Ɩ����b�N����
            if (!businessUnLock(lockCancelKey)) {
             writeLog(ERROR, "ZZ01004");
            }
          	if (lockCancelKey != LOCK_FAILD) {
            System.out.println(MES_UPDATE_END);
            System.out.println("(SBM1005)�o�b�`�������I�����܂����B");
            writeLog(INFOMATION, "ZZ09002",MES_UPDATE_END);
          	}
           } catch (Exception ee) {
           	ee.printStackTrace();
           	throw new BatchAppException("CtrlMain", "main", ee.getMessage());
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
       
       
         return m_control.beginProc();
        }
       
        /**
         * �I������
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int endProc() throws BatchAppException
        {
       
       
         return m_control.endProc();
        }
       
        /**
         * �I������
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int execute() throws BatchAppException
        {
       
       
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
		public medAH0070B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAH0070B001 med) throws BatchAppException
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
