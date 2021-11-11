/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0010/src/com/nec/jp/orteus/metamorBase/DE0010/DE0010B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.DE0010.DE0010B001;

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
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.Numbering;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:25:38 $
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
	public medDE0010B001 m_med=null;

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
	public CtrlMain(medDE0010B001 med, BatchAppConductor cdr) throws BatchAppException
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
        public CtrlMain(medDE0010B001 med) throws BatchAppException {
         // �����o�ϐ������������܂�
         m_med = med;
         m_control = new interControl(med);
       
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
         lock = new BusinessLock(conn, getSysUserCd(), getTargetPlantCd());
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
         * �o�b�`�p�����[�^�̃`�F�b�N���s���܂��B
         * @return ����̏ꍇtrue�A�s���̏ꍇfalse
         * @throws BatchAppException
         */
        private boolean checkArgs() throws BatchAppException {
         // �o�b�`�p�����[�^�̌`�����s���ȏꍇ
         if (m_med.getArgs().length != 9) {
          writeLogFiles(ERROR, "ZZ09022");
          return false;
         }
       
         // �o�b�`�����敪��Null�̏ꍇ
         if (isNull(getSysBatchType())) {
          writeLogFiles(ERROR, "ZZ09023");
          return false;
         }
       
         // �o�b�`�����敪���P�A�Q�ȊO�̏ꍇ
         if ((!getSysBatchType().equals("1") && !getSysBatchType().equals("2"))) {
          writeLogFiles(ERROR, "ZZ09024");
          return false;
         }
       
         // ���[�U�[�R�[�h��Null�̏ꍇ
         if (isNull(getSysUserCd())) {
          writeLogFiles(ERROR, "ZZ09025");
          return false;
         }
       
         // [���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
         if (!isExsistsUserMst(getSysUserCd())) {
          writeLogFiles(ERROR, "ZZ09026");
          return false;
         }
       
         // �H��R�[�h��Null�̏ꍇ
         if (isNull(getSysPlantCd())) {
          writeLogFiles(ERROR, "ZZ09027");
          return false;
         }
         // [�H��]�ɑ��݂��Ȃ��ꍇ
         if (!isExistsMPlant(getSysPlantCd())) {
          writeLogFiles(ERROR, "ZZ09028");
          return false;
         }
       
         // �Ɩ�ID��Null�̏ꍇ
         if (isNull(getSysProgramId())) {
          writeLogFiles(ERROR, "ZZ09029");
          return false;
         }
       
         // �����ΏۍH��R�[�h��[�H��]�ɑ��݂��Ȃ��ꍇ
         if (!isExistsMPlant(getTargetPlantCd())) {
          writeLogFiles(ERROR, "DE00004");
          return false;
         }
       
         // �����ΏۍH��R�[�h��[�����Ǘ��p�����[�^]�ɑ��݂��Ȃ��ꍇ
         // �N�x�J�n�����擾���邱�ƂŔ��肵�Ă��܂��B
         String startMonth = getStartMonth();
         if (startMonth == null) {
          writeLogFiles(ERROR, "DE00005");
          return false;
         }
       
         // �w�肳�ꂽ�X�V���x���P�`�P�Q�ȊO
         if (!isCorrectAfterMonth(getAfterMonth())) {
          writeLogFiles(ERROR, "DE01106");
          return false;
         }
       
         // �w�肳�ꂽ�X�V�㔼���敪���A���x�ƍ���Ȃ��ꍇ�B
         if (!isCorrectHalfTermTyp(getAfterMonth(), startMonth, getAfterHalfTermTyp())) {
          writeLogFiles(ERROR, "DE01105");
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
       
        /**
         * �o�b�`�p�����[�^(����1) �o�b�`�����敪��Ԃ��܂��B
         * @return �o�b�`�����敪
         */
        private String getSysBatchType() {
         return m_med.getArgs()[0];
        }
       
        /**
         * �o�b�`�p�����[�^(����2)���[�UID��Ԃ��܂��B
         * @return ���[�UID
         */
        private String getSysUserCd() {
         return m_med.getArgs()[1];
        }
       
        /**
         * �o�b�`�p�����[�^(����3)�H��R�[�h��Ԃ��܂��B
         * @return �H��R�[�h
         */
        private String getSysPlantCd() {
         return m_med.getArgs()[2];
        }
       
        /**
         * �o�b�`�p�����[�^(����4)�Ɩ�ID��Ԃ��܂��B
         * @return �Ɩ�ID
         */
        private String getSysProgramId() {
         return m_med.getArgs()[3];
        }
       
        /**
         * �o�b�`�p�����[�^(5)�����ΏۍH��R�[�h��Ԃ��܂��B<br>
         * Null�̏ꍇ�o�b�`�p�����[�^�i����3�j��Ԃ��܂��B
         * @return �����ΏۍH��R�[�h
         */
        private String getTargetPlantCd() {
         String[] args = m_med.getArgs();
         if (!isNull(args[4])) {
          return args[4];
         }
         return getSysPlantCd();
        }
       
        /**
         * �o�b�`�p�����[�^(6)�X�V��N�x��Ԃ��܂��B<br>
         * Null�A���l�ȊO�̏ꍇ�����l�i[�����Ǘ��p�����[�^]����擾�j��Ԃ��܂��B
         * @return �X�V��N�x
         */
        private String getAfterYear() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         // args[5]��null�ȊO���A���l�̏ꍇ��args[5]��Ԃ��B
         if (!isNull(args[5])) {
          return args[5];
         }
       
         // m_med.getAFTER_YEAR()��null�łȂ��ꍇ
         // ����x�ł�m_med.getSYS_COST_CTRL().read()�����s����Ă���ꍇ
         // ���̒l��Ԃ��B
         if (!isNull(m_med.getAFTER_YEAR())) {
          return m_med.getAFTER_YEAR();
         }
       
         // DB����A[�����Ǘ��p�����[�^]."�X�V��N�x"���擾
         m_med.setPLANT_CD(getTargetPlantCd());
         m_med.getSYS_COST_CTRL().read();
         m_med.getSYS_COST_CTRL().next();
       
         return m_med.getAFTER_YEAR();
        }
       
        /**
         * �o�b�`�p�����[�^(7)�X�V�㌎�x��Ԃ��܂��B<br>
         * Null�A���l�ȊO�̏ꍇ�����l�i[�����Ǘ��p�����[�^]����擾�j��Ԃ��܂��B
         * @return �X�V�㌎�x
         */
        private String getAfterMonth() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         // args[6]��null�ȊO���A���l�̏ꍇ��args[6]��Ԃ��B
         if (!isNull(args[6])) {
          return args[6];
         }
       
         // m_med.getAFTER_MONTH()��null�łȂ��ꍇ
         // ����x�ł�m_med.getSYS_COST_CTRL().read()�����s����Ă���ꍇ
         // ���̒l��Ԃ��B
         if (!isNull(m_med.getAFTER_MONTH())) {
          return m_med.getAFTER_MONTH();
         }
       
         // DB����A[�����Ǘ��p�����[�^]."�X�V�㌎�x"���擾
         m_med.setPLANT_CD(getTargetPlantCd());
         m_med.getSYS_COST_CTRL().read();
         m_med.getSYS_COST_CTRL().next();
       
         return m_med.getAFTER_MONTH();
        }
       
        /**
         * �o�b�`�p�����[�^(8)�X�V�㔼���敪��Ԃ��܂��B
         * Null�A���l�ȊO�̏ꍇ�����l�i[�����Ǘ��p�����[�^]����擾�j��Ԃ��܂��B
         * @return �X�V�㔼���敪
         */
        private String getAfterHalfTermTyp() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         // args[7]��null�ȊO���A���l�̏ꍇ��args[7]��Ԃ��B
         if (!isNull(args[7])) {
          return args[7];
         }
       
         // m_med.getAFTER_MONTH()��null�łȂ��ꍇ
         // ����x�ł�m_med.getSYS_COST_CTRL().read()�����s����Ă���ꍇ
         // ���̒l��Ԃ��B
         if (!isNull(m_med.getAFTER_HALF_TERM_TYP())) {
          return m_med.getAFTER_HALF_TERM_TYP();
         }
       
         // DB����A[�����Ǘ��p�����[�^]."�X�V�㔼���敪"���擾
         m_med.setPLANT_CD(getTargetPlantCd());
         m_med.getSYS_COST_CTRL().read();
         m_med.getSYS_COST_CTRL().next();
         return m_med.getAFTER_HALF_TERM_TYP();
        }
       
        /**
         * �o�b�`�p�����[�^(9)�X�V�����Ԃ��܂��B
         * Null�A���l�ȊO�̏ꍇ�����l�i[�����Ǘ��p�����[�^]����擾�j��Ԃ��܂��B
         * @return �X�V���
         */
        private String getAfterTerm() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         if (!isNull(args[8])) {
          return args[8];
         }
         // m_med.getAFTER_TERM()��null�łȂ��ꍇ
         // ����x�ł�m_med.getSYS_COST_CTRL().read()�����s����Ă���ꍇ
         // ���̒l��Ԃ��B
         if (!isNull(m_med.getAFTER_TERM())) {
          return m_med.getAFTER_TERM();
         }
       
         // DB����A[�����Ǘ��p�����[�^]."�X�V���"���擾
         m_med.setPLANT_CD(getTargetPlantCd());
         m_med.getSYS_COST_CTRL().read();
         m_med.getSYS_COST_CTRL().next();
       
         return m_med.getAFTER_TERM();
        }
       
        /**
         * �N�x�J�n����Ԃ��܂�
         * @return [�����Ǘ��p�����[�^]."�N�x�J�n��"
         * ���݂��Ȃ��ꍇ��null��Ԃ��B
         */
        private String getStartMonth() throws BatchAppException {
         // m_med.getSTART_MONTH()��null�łȂ��ꍇ
         // ����x�ł�m_med.getSYS_COST_CTRL().read()�����s����Ă���ꍇ
         // ���̒l��Ԃ��B
         if (!isNull(m_med.getSTART_MONTH())) {
          return m_med.getSTART_MONTH();
         }
       
         m_med.setPLANT_CD(getTargetPlantCd());
         m_med.getSYS_COST_CTRL().read();
         m_med.getSYS_COST_CTRL().next();
       
         return m_med.getSTART_MONTH();
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
       
        /**
         * �X�V�㌎�x�������������肵�܂��B
         * @param arg �X�V�㌎�x
         * @return �������ꍇtrue�A����ȊO�̏ꍇfalse
         */
        private boolean isCorrectAfterMonth(String arg) {
       
         if (!isNumber(arg)) {
          return false;
         }
       
         Integer num = new Integer(arg);
       
         if (num.compareTo(new Integer("1")) < 0 || num.compareTo(new Integer("12")) > 0) {
          return false;
         }
       
         return true;
        }
       
        /**
         * �����敪���`�F�b�N���܂��B
         * @param nowMonth ����
         * @param startMonth �J�n��
         * @param nowHalfTerm �����敪
         * @return �����敪���������ꍇtrue�A�s���̏ꍇfalse
         */
        private boolean isCorrectHalfTermTyp(
         String nowMonth,
         String startMonth,
         String nowHalfTermTyp) {
       
         int halfTermTyp =
          ((((Integer.parseInt(nowMonth) + 12) - Integer.parseInt(startMonth)) % 12) / 6) + 1;
       
         if (halfTermTyp == Integer.parseInt(nowHalfTermTyp)) {
          return true;
         } else {
          return false;
         }
       
        }
       
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
         String[] args = m_med.getArgs();
       
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
         	m_med.setUsername(getSysUserCd());
         }	 
         // �����`�F�b�N
         if (!checkArgs()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
       
         try {
       
          // DB���b�Z�[�W�X�V����
          IDbConnection conn_msg = m_conductor.m_defaultConn;
          numbering =
           new Numbering(
            conn_msg,
            Numbering.LOG_CD,
            getSysUserCd(),
            getSysProgramId(),
            getTargetPlantCd());
          businessMsgAcc.init(conn_msg);
          businessMsg.setBusinessOperatingName(getSysProgramId());
          businessMsg.setUser(getSysUserCd());
          businessMsg.setPlantCode(getTargetPlantCd());
       

       
          // �J�n���b�Z�[�W
          writeLog(INFOMATION, "ZZ09001");
       
          // �Ɩ����b�N
          lockCancelKey = businessLock();
          if (lockCancelKey == LOCK_FAILD) {
           writeLog(ERROR, "ZZ01008");
           return BREAK;
          }
       
          // �g�����U�N�V�����̊J�n
          //			conn.beginTrans();
          conn.beginTransWeb();
       
          // �����Ǘ��p�����[�^���X�V
          m_med.setPLANT_CD(getTargetPlantCd());
          m_med.setCURRENT_YEAR(getAfterYear());
          m_med.setCURRENT_MONTH(getAfterMonth());
          m_med.setTERM(getAfterTerm());
          m_med.setHALF_TERM_TYP(getAfterHalfTermTyp());
       
          m_med.getSYS_COST_CTRL().read();
          if (m_med.getSYS_COST_CTRL().next()) {
           m_med.getSYS_COST_CTRL().update();
          } else {
           writeLog(ERROR, "DE00005");
           return BREAK;
          }
       
          // �R�~�b�g
          conn.commit();
       
         } catch (SQLException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (FoundationException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (Exception e) {
          // ����͖{��Exception���L���b�`���Ă͂����Ȃ�
          // main���\�b�h���Ăяo���Ă���execute���\�b�h��StackTrace���s��Ȃ����߃L���b�`���Ă��܂��B
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } finally {
          try {
           // ���[���o�b�N
           conn.rollback();
       
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
       
         return m_control.beginProc();
        }
       
        /**
         * �I������
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int endProc() throws BatchAppException {
       
         return m_control.endProc();
        }
       
        /**
         * �I������
         *
         * @exception <<�R�����g���L�q���Ă�������>>
         */
        public int execute() throws BatchAppException {
       
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
		public medDE0010B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medDE0010B001 med) throws BatchAppException
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
