/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DC0010/src/com/nec/jp/orteus/metamorBase/DC0010/DC0010B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.DC0010.DC0010B001;

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
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.14 $ $Date: 2014/11/05 07:22:48 $
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
	public medDC0010B001 m_med=null;

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
	public CtrlMain(medDC0010B001 med, BatchAppConductor cdr) throws BatchAppException
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
        public CtrlMain(medDC0010B001 med) throws BatchAppException {
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
        public void finalize() {
         // �e�����o�ϐ��̏�����
         m_med = null;
         m_control = null;
         objMessage = null;
       
         // todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
       
         return;
        }
       
        //////////////////////////////
       
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
        /** �o�b�`�p�����[�^(����2)���[�UID */
        private String _sysUserCd;
        /** �o�b�`�p�����[�^(����3)�H��R�[�h */
        private String _sysPlantCd;
        /** �o�b�`�p�����[�^(����4)�Ɩ�ID */
        private String _sysProgramId;
       
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
         * �Ɩ����b�N���s���܂�
         * @return ���b�N�L�����Z���L�[
         * @throws FoundationException
         */
        private int businessLock() throws FoundationException {
         lock = new BusinessLock(conn, _sysUserCd, _plantCd);
         System.out.println("_sysUserCd:"+_sysUserCd);
         System.out.println("_plantCd:"+_plantCd);

         // �����L�[�̎擾
         int lockCancelKey = lock.doLock(m_med.getProgname());
         System.out.println("m_med.getProgname():"+m_med.getProgname());
         
         if (lock.getLockingInfo()!=null){
        	 String info[] = (String [])lock.getLockingInfo().get(0);
        	 System.out.println("lock.getLockingInfo(0):"+info[0]);
        	 System.out.println("lock.getLockingInfo(1):"+info[1]);
        	 System.out.println("lock.getLockingInfo(2):"+info[2]);
        	 System.out.println("lock.getLockingInfo(3):"+info[3]);
        	 
         }
         System.out.println("lockCancelKey:"+lockCancelKey);
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
         * �o�b�`�p�����[�^�i���ʁj��ݒ肵�܂��B
         * @return �ݒ�ɐ��������ꍇ�� true �A���s�����ꍇ�� false ��Ԃ��܂��B
         * @throws BatchAppException
         */
        private boolean setCommonParams() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         // �o�b�`�p�����[�^�̌`�����s���ȏꍇ
         if (args.length != 9) {
          writeLogFiles(ERROR, "ZZ09022");
          return false;
         }

         _sysBatchType = args[0];
         _sysUserCd = args[1];
         _sysPlantCd = args[2];
         _sysProgramId = args[3];
       
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
       
         // �Ɩ�ID��Null�̏ꍇ
         if (isNull(_sysProgramId)) {
          writeLogFiles(ERROR, "ZZ09029");
          return false;
         }
       
         return true;
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
       
        // ���Ɩ����W�b�N
        /** �o�b�`�p�����[�^(5)�H��R�[�h */
        private String _plantCd;
        /** �o�b�`�p�����[�^(6)�N�x */
        private String _year;
        /** �o�b�`�p�����[�^(7)�����敪 */
        private String _halfTermTyp;
        /** �o�b�`�p�����[�^(8)������� */
        private String _costTyp;
        /** �o�b�`�p�����[�^(9)���s�敪 */
        private String _executeTyp;
       
        /** PL/SQL �W�������\���i���[�N�쐬���� ��\���萔 */
        static final int SQLSTDITEMPSWORKENTRY = 2;
        /** PL/SQL �W���ޗ���E���H��v�Z���� ��\���萔 */
        static final int SQLSTDMATRPROCCOST = 3;
        /** PL/SQL �i�ڕʕW�������Ϗ㏈�� ��\���萔 */
        static final int SQLSTDITEMCOSTACCOUNT = 4;
        /** PL/SQL �݌ɕ]�����z�쐬���� ��\���萔 */
        static final int SQLSTOCKVALUPDATE = 6;
       
        /**
         * �o�b�`�p�����[�^�i�Ɩ��ŗL�j�̐ݒ���s���܂��B
         * @return ����̏ꍇtrue�A�s���̏ꍇfalse
         * @throws BatchAppException
         * @throws FoundationException
         * @throws SQLException
         */
        private boolean setParams() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         if (!isNull(args[4])) {
          _plantCd = args[4];
         } else {
          _plantCd = _sysPlantCd;
         }
       
         // DB����A[�����Ǘ��p�����[�^]������
         m_med.setPLANT_CD(_plantCd);
         m_med.getSYS_COST_CTRL().read();
         m_med.getSYS_COST_CTRL().next();
       
         if (!isNull(args[5]) || isNumber(args[5])) {
          _year = args[5];
         } else {
          _year = m_med.getCURRENT_YEAR();
         }
       
         if (!isNull(args[6]) || isNumber(args[6])) {
          _halfTermTyp = args[6];
         } else {
          _halfTermTyp = m_med.getHALF_TERM_TYP();
         }
       
         if (!isNull(args[7]) || isNumber(args[7])) {
          _costTyp = args[7];
         } else {
          _costTyp = "1";
         }
       
         if (!isNull(args[8]) || isNumber(args[8])) {
          _executeTyp = args[8];
         } else {
          _executeTyp = "1";
         }
       
         return true;
        }
       
        /**
         * �o�b�`�p�����[�^�i�Ɩ��ŗL�j�̃`�F�b�N���s���܂��B
         * @return ����̏ꍇtrue�A�s���̏ꍇfalse
         * @throws BatchAppException
         * @throws FoundationException
         * @throws SQLException
         */
        private boolean checkParams() throws BatchAppException {
         // �����ΏۍH��R�[�h��[�H��]�ɑ��݂��Ȃ��ꍇ
         if (!isExistsMPlant(_plantCd)) {
          writeLogFiles(ERROR, "DC00002");
          return false;
         }
         // �����ΏۍH��R�[�h��[�����Ǘ��p�����[�^]�ɑ��݂��Ȃ��ꍇ
         if (!isExistsSysCostCtrl(_plantCd)) {
          writeLogFiles(ERROR, "DC00003");
          return false;
         }
         // �N�x�����l�ȊO�̏ꍇ
         if (!isNumber(_year)) {
          writeLogFiles(ERROR, "DC00004");
          return false;
         }
         // �����敪�����l�ȊO�܂���1or2�ȊO�̏ꍇ
         if (!isNumber(_halfTermTyp) || (!"1".equals(_halfTermTyp) && !"2".equals(_halfTermTyp))) {
          writeLogFiles(ERROR, "DC00005");
          return false;
         }
         // ������ʂ����l�ȊO�܂���1�ȊO�̏ꍇ
         if (!isNumber(_costTyp) || !"1".equals(_costTyp)) {
          writeLogFiles(ERROR, "DC00006");
          return false;
         }
         // ���s�敪�����l�ȊO�܂���1or2�ȊO�̏ꍇ
         if (!isNumber(_executeTyp) || (!"1".equals(_executeTyp) && !"2".equals(_executeTyp))) {
          writeLogFiles(ERROR, "DC00007");
          return false;
         }
       
         return true;
        }
       
        /**
         * [�����Ǘ��p�����[�^]�ɑ��݂��邩�𔻒肵�܂� �B
         * @param plantCd �H��R�[�h
         * @return [�����Ǘ��p�����[�^]�ɑ��݂���ꍇ��true�A���݂��Ȃ��ꍇ��false
         */
        private boolean isExistsSysCostCtrl(String plantCd) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.getSYS_COST_CTRL().read();
         return m_med.getSYS_COST_CTRL().hasRecord(false);
        }
       
        /**
         * �Ώە����񂪐��l������ł��邩���肵�܂��B
         * @param arg �Ώە�����
         * @return ���l������̏ꍇtrue�A����ȊO�̏ꍇfalse
         */
        private boolean isNumber(String arg) {
         try {
          Integer num = new Integer(arg);
       
          if (num.compareTo(new Integer("0")) <= 0) {
           return false;
          }
       
         } catch (NumberFormatException e) {
          return false;
         }
         return true;
        }
        // ���Ɩ����W�b�N
       
        /**
         * main�F ���[�U��`�p���\�b�h�ł�<br>
         * <<�������L�q���Ă�������>>
         *
         * @return <<�������L�q���Ă�������>>
         * @exception <<�������L�q���Ă�������>>
         */
        public int main() throws BatchAppException {
       
         // ���b�N�����L�[
         int lockCancelKey = LOCK_FAILD;
       
         // �p�����[�^�擾
         String args[] = m_med.getArgs();
       
         // �o�b�`�p�����[�^�o��
         System.out.println("-------------------------------------------------");
         System.out.println("execute " + m_med.getProgname());
         for (int i = 0; i < args.length; i++) {
          System.out.println("args[" + i + "]:" + args[i]);
         }
       
         // DB�ڑ��擾����
         conn = m_conductor.m_transactionConn;
         //SYSLOG�p�ꉻ�p
         if(args.length >= 2){
         	m_med.setUsername(args[1]);
         }
         // �o�b�`�p�����[�^�i���ʁj���p�����[�^�ϐ��ɐݒ�
         if (!setCommonParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
         // �o�b�`�p�����[�^�i���ʁj�`�F�b�N
         if (!checkCommonParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
       
         // ���Ɩ����W�b�N
         // �o�b�`�p�����[�^�i�Ɩ��ŗL�j���p�����[�^�ϐ��ɐݒ�
         if (!setParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
         // �o�b�`�p�����[�^�i�Ɩ��ŗL�j�`�F�b�N
         if (!checkParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
         // ���Ɩ����W�b�N
         // �g�����U�N�V�����̊J�n
         //conn.beginTrans();
         try {
         conn.beginTransWeb();
         }catch(Exception e){
        	 e.printStackTrace();
         }
         try {
          // DB���b�Z�[�W�X�V����
          IDbConnection conn_msg = m_conductor.m_defaultConn;
          numbering =
           new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _plantCd);
          businessMsgAcc.init(conn_msg);
          businessMsg.setBusinessOperatingName(_sysProgramId);
          businessMsg.setUser(_sysUserCd);
          businessMsg.setPlantCode(_plantCd);
       
       
          // �J�n���b�Z�[�W
          writeLog(INFOMATION, "ZZ09001");
       
          // ���Ɩ����W�b�N
          // [�����v�Z��������]���J�n��ԂƂ��ēo�^or�X�V
          // �p�����[�^�ݒ�
          m_med.setPLANT_CD(_plantCd);
          m_med.setYEAR(_year);
          m_med.setHALF_TERM_TYP(_halfTermTyp);
          m_med.setCOST_TYP(_costTyp);
          m_med.setBATCH_TYP(_sysBatchType);
          m_med.setEXECUTE_TYP(_executeTyp);
          m_med.setRESULT_STATUS_TYP("1");
          
          // �Ɩ����b�N
          System.out.println("(SBM0987)�Ɩ����b�N0:"+lockCancelKey);
          lockCancelKey = businessLock();
          System.out.println("(SBM0988)�Ɩ����b�N1:"+lockCancelKey);
          if (lockCancelKey == LOCK_FAILD) {
        	  System.out.println("(SBM0989)�Ɩ����b�Nerr!");
           writeLog(ERROR, "ZZ01008");
           return BREAK;
          }   
          
          // ���݃`�F�b�N���s���o�^�E�X�V��U�蕪��
          m_med.getSYS_CS_CALC_CTRL().read();
          if (m_med.getSYS_CS_CALC_CTRL().next()) {
           m_med.getSYS_CS_CALC_CTRL_Start().update();
          } else {
           m_med.getSYS_CS_CALC_CTRL_Start().create();
          }
          conn.commit();
       
          // �o�b�`�p�����[�^����s�敪�=1�̏ꍇ[�\���i���[�N]���폜����
          if ("1".equals(_executeTyp)) {
           m_med.setPLANT_CD(_plantCd);
           m_med.getT_CS_PS_T().delete();
           conn.commit();
          }
       
          // PL/SQL�̎��s����
          String result;
       
          // �W�������\���i���[�N�쐬����
          result = executeProcedure(SQLSTDITEMPSWORKENTRY);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [�����v�Z��������]���I����ԂƂ��čX�V
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }
       
          // �W�������ޗ���E���H��v�Z����
          result = executeProcedure(SQLSTDMATRPROCCOST);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [�����v�Z��������]���I����ԂƂ��čX�V
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }
       
          // �i�ڕʕW�������Ϗ�v�Z����
          result = executeProcedure(SQLSTDITEMCOSTACCOUNT);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [�����v�Z��������]���I����ԂƂ��čX�V
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }
       
          // �݌ɕ]�����z�쐬����
          result = executeProcedure(SQLSTOCKVALUPDATE);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [�����v�Z��������]���I����ԂƂ��čX�V
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }

          // [�����v�Z��������]���I����ԂƂ��čX�V
          m_med.getSYS_CS_CALC_CTRL_Stop().update();
       
          // ���Ɩ����W�b�N
       
          // �R�~�b�g
          conn.commit();
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
        	System.out.println("Ends By finally");
        	m_med.getSYS_CS_CALC_CTRL_Stop().update();
        	conn.commit();
        	System.out.println("SYS_CS_CALC_CTRL_Stop().update()");
       
           // �Ɩ����b�N����
           if (!businessUnLock(lockCancelKey)) {
            writeLog(ERROR, "ZZ01004");
           }
       
           // �I�����O
           writeLog(INFOMATION, "ZZ09002");
          } catch (Exception e) {
           e.printStackTrace();
           throw new BatchAppException("CtrlMain", "main", e.getMessage());
          }
         }
         return BREAK;
        }
       
        /**
         * 
         * @param csCalcProcNo
         * @return
         * @throws Exception
         */
        private String executeProcedure(int csCalcProcNo)
         throws BatchAppException, FoundationException {
         // [�o�b�`�p�����[�^]�̌���
         m_med.setPROGRAM_CD(m_med.getProgname());
         if (csCalcProcNo == SQLSTDITEMPSWORKENTRY) {
          m_med.setFUNCTION_NAME("SQLSTDITEMPSWORKENTRY");
         } else if (csCalcProcNo == SQLSTDMATRPROCCOST) {
          m_med.setFUNCTION_NAME("SQLSTDMATRPROCCOST");
         } else if (csCalcProcNo == SQLSTDITEMCOSTACCOUNT) {
          m_med.setFUNCTION_NAME("SQLSTDITEMCOSTACCOUNT");
         } else if (csCalcProcNo == SQLSTOCKVALUPDATE) {
          m_med.setFUNCTION_NAME("SQLSTOCKVALUPDATE");
         }
       
         int nret = m_med.getSYS_BAT_PARM().read();
         if (!m_med.getSYS_BAT_PARM().next()) {
          ExpjMessage emsg = new ExpjMessage("ZZ09030");
          throw new BatchAppException("CtrlMain", "excuteProcedure", emsg.getMessage(CoreTools.getLocale(_sysUserCd)));
         }
       
         // �߂�l�\��
         System.out.println("nret:" + nret);
         System.out.println("--------------------------------------");
         System.out.println("PROGRAM_CD:" + m_med.getPROGRAM_CD());
         System.out.println("FUNCTION_NAME:" + m_med.getFUNCTION_NAME());
         System.out.println("LOG_MODE_TYP:" + m_med.getLOG_MODE_TYP());
         System.out.println("OUTPUT_MODE_TYP:" + m_med.getOUTPUT_MODE_TYP());
         System.out.println("FILE_PATH:" + m_med.getFILE_PATH());
         System.out.println("FILE_NAME:" + m_med.getFILE_NAME());
         System.out.println("BUSINESS_GROUP_CD:" + m_med.getBUSINESS_GROUP_CD());
         System.out.println("BUSINESS_CD:" + m_med.getBUSINESS_CD());
       
         // [�����v�Z��������]�����݂̎��s��ԂōX�V�iPL/SQL���s���O�j
         m_med.setCS_CALC_PROC_NO(Integer.toString(csCalcProcNo));
         m_med.getSYS_CS_CALC_CTRL_Active().update();
         conn.commit();
       
         // PL/SQL�̎��s
         m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP().toString());
         m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP().toString());
         m_med.setpvc2OutputPath(m_med.getFILE_PATH());
         m_med.setpvc2OutputName(m_med.getFILE_NAME());
         m_med.setpvc2UserId(_sysUserCd);
         m_med.setpvc2BusinessName(_sysProgramId);
         m_med.setpvc2PlantCd(_plantCd);
         m_med.setpnumYear(_year);
         m_med.setpnumHalfTermTyp(_halfTermTyp);
         m_med.setpnumCostTyp(_costTyp);
         m_med.setpnumActTyp(_executeTyp);
       
         System.out.println("--------------------------------------");
         System.out.println("pvc2LogMode:" + m_med.getpvc2LogMode());
         System.out.println("pvc2OutputMode:" + m_med.getpvc2OutputMode());
         System.out.println("pvc2OutputPath:" + m_med.getpvc2OutputPath());
         System.out.println("pvc2OutputName:" + m_med.getpvc2OutputName());
         System.out.println("pvc2UserId:" + m_med.getpvc2UserId());
         System.out.println("pvc2BusinessName:" + m_med.getpvc2BusinessName());
         System.out.println("pvc2PlantCd:" + m_med.getpvc2PlantCd());
         System.out.println("pnumYear:" + m_med.getpnumYear());
         System.out.println("pnumHalfTermTyp:" + m_med.getpnumHalfTermTyp());
         System.out.println("pnumCostTyp:" + m_med.getpnumCostTyp());
         System.out.println("pnumActTyp:" + m_med.getpnumActTyp());
       
         List callList = null;
         if (csCalcProcNo == SQLSTDITEMPSWORKENTRY) {
          callList = m_med.getSQLSTDITEMPSWORKENTRY().call();
         } else if (csCalcProcNo == SQLSTDMATRPROCCOST) {
          callList = m_med.getSQLSTDMATRPROCCOST().call();
         } else if (csCalcProcNo == SQLSTDITEMCOSTACCOUNT) {
          callList = m_med.getSQLSTDITEMCOSTACCOUNT().call();
         } else if (csCalcProcNo == SQLSTOCKVALUPDATE) {
          callList = m_med.getSQLSTOCKVALUPDATE().call();
         }
       
         // PL/SQL�̎��s���ʂ��擾
         medDC0010B001 resultMed = (medDC0010B001) callList.get(0);
         String result = resultMed.getpnumReturn();
       
         // [�����v�Z��������]�����݂̎��s��ԂōX�V�iPL/SQL���s����j
         if (Integer.valueOf(result).intValue()
          > Integer.valueOf(m_med.getRESULT_STATUS_TYP()).intValue()) {
          m_med.setRESULT_STATUS_TYP(result);
         }
         m_med.setCS_CALC_PROC_NO(Integer.toString(csCalcProcNo));
         m_med.getSYS_CS_CALC_CTRL_Active().update();
         conn.commit();
       
         return result;
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
		public medDC0010B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medDC0010B001 med) throws BatchAppException
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
