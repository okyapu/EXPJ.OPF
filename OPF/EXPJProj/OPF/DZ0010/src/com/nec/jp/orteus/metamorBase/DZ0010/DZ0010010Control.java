/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DZ0010/src/com/nec/jp/orteus/metamorBase/DZ0010/DZ0010010Control.java,v $
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
 * EXPJ    (2005/01/31),SRCGEN�Ή��A���[�c�[���A�g��KIND�Ή��AgetFlashTreeXML��Linux�Ή��A���b�Z�[�W�̑�����Ή�(MessageStruct)
 * EXPJ    (2004/10/14),user_implement_code_header ���̃��[�U�R�[�f�B���O��L���ɂ���
 * EXPJ    (2004/08/02),�a��������Ή�
 * EXPJ    (2004/07/14),�T�[�o������_�Ή�
 * EXPJ    (2004/06/28),����p�̃��W�b�N��啝����
 * EXPJ    (2004/06/24),FLASH�A�g���\�b�h�ǉ�
 * EXPJ    (2004/04/15),������̃v�����^���A�t�H���_�E�t�@�C�����̋󔒑Ή�
 * EXPJ    (2004/04/09),���\�b�h���C�� "getLabel"->"getlabel"
 * EXPJ    (2004/04/06),Print���\�b�h�̍Č����E�I���s����Ή�
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 * EXPJ    (2004/04/01),user_imprement���̃R�����g�ɕύX���Ă���conn.beginTransWeb();��user_imprement�O�̕K�{�����Ƃ��ĕ���
 * EXPJ    (2004/03/31),Print���\�b�h��null�����o�͑Ή�
 * EXPJ    (2004/03/30),�C���|�[�g���ꕔ�C��(print���폜,exception��ǉ��j
 * EXPJ    (2004/03/20),���r���[���ʂ𔽉f
 * EXPJ    (2004/03/13),���M���{�^���A�N�Z�T�ǉ�
 * EXPJ    (2004/03/09),Print���\�b�h�̏C���s�v�ȕ��������[�U�L�q���̊O�Ɉړ�
 * EXPJ    (2004/03/04),���b�Z�[�W�n���i�����Ή�
 * EXPJ    (2004/03/03),�������C��
 *                     ,FLASH��ʗp���\�b�hgetReadStsString��ǉ�
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 *                     ,CsvOut���\�b�h�̏�����ǉ�
 *                     ,Print���\�b�h�̏�����EXPLANNER/J�p�ɉ���
 * EXPJ    (2004/03/02),EXPLANNER/J�p�ɉ���
 * 4.0.1.3 (2004/12/02),���M�L�[�E��M�L�[��ݒ肷�郁�\�b�h��V�� (setOrMsgKey, getOrMsgKey)
 * 4.0.1.2 (2004/11/15),���[�c�[���A�g��KIND�Ή�
 * 4.0.1.1 (2004/06/16),���[�c�[���A�g��event-option�Ή�
 * 4.0.1.0 (2004/08/02),TRUST-V�v���W�F�N�g�̃t�B�[�h�o�b�N�i�y�[�W���䕔�i�Ή��j
 * 4.0.0.9 (2004/05/24),�_�E�����[�h�Ή���ǉ��Bevent-type=print,download����������ꍇ�ɑΉ�
 * 4.0.0.8 (2004/05/21),connect()�̏��������ǉ�
 * 4.0.0.7 (2004/04/19),event-type�Ή�
 * 4.0.0.6 (2004/04/12),FlashTree�p���\�b�h�Ɉ����ǉ��A���[�o�̓I�u�W�F�N�gNULL��������ύX
 * 4.0.0.5 (2004/02/23),���[�p�A�N�Z�T���\�b�h�ǉ�
 * 4.0.0.4 (2004/02/17),FlashTree�Ή���ǉ�
 * 4.0.0.3 (2004/01/23),���[�c�[���A�g�p�R�[�h��ǉ�
 * 4.0.0.2 (2003/09/08),ManageContainer�̎擾���@���C��
 * 4.0.0.1 (2003/06/05),javadoc�R�����g�G���[�C��
 * 4.0.0.0 (2003/04/23),�N���X���W�����Ή�
 * 3.0.0.0 (2003/03/19),mgrContainer�R���X�g���N�^�C��
 * 2.1.0.0 (2002/12/17),User OwnCode�����M���O�ǉ�,LoggingPackage�C��
 * 2.0.0.1 (2002/07/05),Connection�Ή�
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.DZ0010;

import com.nec.jp.orteus.metamorBase.DZ0010.*;
import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.lang.reflect.*;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.combobox.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.file.*;
import com.nec.jp.orteus.expj.csv.*;
import com.nec.jp.orteus.expj.util.MessageStruct;

//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class DZ0010010Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	/** �V�X�e���g�p�̃��[�U�R�[�h */
	protected String sysUSER_CD;
	public void setsysUSER_CD(String name) { this.sysUSER_CD = name; };
	public String getsysUSER_CD() { return this.sysUSER_CD; };

	/** �V�X�e���g�p�̍H��R�[�h */
	protected String sysPLANT_CD;
	public void setsysPLANT_CD(String name) { this.sysPLANT_CD = name; };
	public String getsysPLANT_CD() { return this.sysPLANT_CD; };

	/** �V�X�e���g�p�̃��[�U�� */
	protected String sysUSER_NAME;
	public void setsysUSER_NAME(String name) { this.sysUSER_NAME = name; };
	public String getsysUSER_NAME() { return this.sysUSER_NAME; };

	/** �V�X�e���g�p�̍H�ꖼ */
	protected String sysPLANT_NAME;
	public void setsysPLANT_NAME(String name) { this.sysPLANT_NAME = name; };
	public String getsysPLANT_NAME() { return this.sysPLANT_NAME; };

	/** ��ʑJ�ڃt���O */
	private boolean screenMoveFlg;
	public void setScreenMoveFlg(boolean flg){ this.screenMoveFlg = flg; };
	public boolean isScreenMove(){ return this.screenMoveFlg; };

	/** ���M�����ID */
	private String submitScreen;
	public void setScreenId(String ScreenId){ this.submitScreen = ScreenId; };
	public String getScreenId(){ return this.submitScreen; };

	/** ���M���v���O����ID */
	private String submitProgram;
	public void setProgramId(String ProgramId){ this.submitProgram = ProgramId; };
	public String getProgramId(){ return this.submitProgram; };

	/** ���M���{�^�� */
	private String submitButton;
	public void setButton(String Button){ this.submitButton = Button; };
	public String getButton(){ return this.submitButton; };

	/** �����{�^����� */
	private String submitButtonType;
	public void setButtonType(String ButtonType){ this.submitButtonType = ButtonType; };
	public String getButtonType(){ return this.submitButtonType; };

	/** �V�K��ʃt���O */
	private boolean newScreenFlg;
	public void setNewScreenFlg(boolean flg){ this.newScreenFlg = flg; };
	public boolean isNewScreen(){ return this.newScreenFlg; };

	/** �V�K�f�[�^�t���O */
	private boolean newDataFlg;
	public void setNewDataFlg(boolean flg){ this.newDataFlg = flg; };
	public boolean isNewData(){ return this.newDataFlg; };


	/** ��Ԑ��� */
	private int readStatus = INITIAL;
		/** �Ǎ����s */
		static final public int ERROR = -1;
		/** ������� */
		static final public int INITIAL = 0;
		/** �O���Ǎ� */
		static final public int NOT_FOUND = 1;
		/** �ő�s���I�[�o�[ */
		static final public int TOO_MANY = 2;
		/** �Ǎ����� */
		static final public int NORMAL = 3;
	public void setReadStatus(int ReadStatus) { readStatus = ReadStatus; }
	public int getReadStatus() { return readStatus; }
	public String getReadStatusString() {
		if (this.readStatus == NORMAL) {
			return "NORMAL"; 
		}
		else if (this.readStatus == TOO_MANY) {
			return "TOO_MANY"; 
		}
		else if (this.readStatus == NOT_FOUND) {
			return "NOT_FOUND"; 
		}
		else if (this.readStatus == ERROR) {
			return "ERROR"; 
		}
		else {
			return "INITIAL"; 
		}
	}
	public boolean isError(){ return (this.readStatus == ERROR); }
	public boolean isInitialized() { return (this.readStatus != ERROR); }
	public boolean isSelected() { return (this.readStatus > NOT_FOUND); }
	public boolean hasRecord() { return (this.readStatus > INITIAL); }
	public boolean isShown() { return (this.readStatus > TOO_MANY); }
	public boolean canAppend() { return ((this.readStatus == NOT_FOUND) || (this.readStatus == NORMAL) ); }

	/** ���[�o�̓^�C�v */
	private String pdfOutputType;
	public void setPdfOutputType(String PdfOutputType){ this.pdfOutputType = PdfOutputType; };
	public String getPdfOutputType(){ return this.pdfOutputType; };

	/** ���[�o�͐� */
	private String pdfOutputPrinter;
	public void setPdfOutputPrinter(String PdfOutputPrinter){ this.pdfOutputPrinter = PdfOutputPrinter; };
	public String getPdfOutputPrinter(){ return this.pdfOutputPrinter; };

	/** ���[�o�̓��X�g�p�^�[�� */
	private String pdfOutputListPattern;
	public void setPdfOutputListPattern(String PdfOutputListPattern){ this.pdfOutputListPattern = PdfOutputListPattern; };
	public String getPdfOutputListPattern(){ return this.pdfOutputListPattern; };

	/** ���[�o�̓��X�g�s */
	private String[] pdfOutputListLine;
	public void setPdfOutputListLine(String[] PdfOutputListLine){ this.pdfOutputListLine = PdfOutputListLine; };
	public String[] getPdfOutputListLine(){ return this.pdfOutputListLine; };

	protected SystemLog sysLog = null;
	protected boolean logInit = false;

	/** ���b�Z�[�W�X�g���N�g */
	private MessageStruct msgStruct = null;
	public MessageStruct getMsgStruct(){ return this.msgStruct;}

	/**
	 * ���b�Z�[�W�X�g���N�g�쐬�i������Ή��j
	 */
	public void createMsgStruct() {
		msgStruct = new MessageStruct(getsysUSER_CD(), false);
	}

	protected ScreenParam sp = null;

	private BusinessLock bLock = null;
	private String cancelId = "0";

	public boolean doUnBusinessLock() {
		//�����ł�Exception�����ݏ���
		boolean doUnLock = false;
		try {
			bLock = new BusinessLock(conn, getsysUSER_CD(), getsysPLANT_CD());
			doUnLock = bLock.doUnLock(this.sp.getProcId(),Integer.parseInt(cancelId));
			if(!doUnLock){
				//�Ɩ����b�N�������s
				throw new ExpjException("ZZ01004");
			}
		} catch ( Exception e ) {
			sysLog.severe("ZZ01004",getsysUSER_CD());//���b�N�������s
		}
		return doUnLock;
	}
	//{{user_implement_code_main
        protected List list; // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
       
        // �f�t�H���g�A�N�Z�T���\�b�h
        public List getList() {
         return this.list;
        } // ���X�g��Ԃ��܂��B
        public void setList(List listname) {
         this.list = listname;
        } // ���X�g���Z�b�g���܂��B
        public int getListsize() { // ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if (this.list != null) {
          nret = this.list.size();
         }
         return nret;
        }
        //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public DZ0010010Struct getListvalue(int x) {
         return (DZ0010010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public DZ0010010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public DZ0010010Struct createStruct() {
         return new DZ0010010Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((DZ0010010Struct) structname);
        } // Struct���Z�b�g���܂��B
        public void initializeStruct() {
         this.struct.initialize();
        } // Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter() {
         return this.csvWriter;
        }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr) {
         this.csvReader = cr;
        }
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        /** ��ЃR�[�h */
        private String _companyCd;
        /** ���O�C�����[�U�̍H��R�[�h���擾�����Ɩ��^�p�� */
        private String _myBusinessOprDate;
       
        /** ������敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _halfTermTypComboStruct = new ComboStruct();
        /** ����Y�Ǘ������t���O��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _pcFlgComboStruct = new ComboStruct();
        /** ��H���}�X�^�D��敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _mCsProcPriorityTypComboStruct = new ComboStruct();
        /** ����H��}�X�^�D��敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _mProcCostPriorityTypComboStruct = new ComboStruct();
        /** ��w���i�}�X�^�D��敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _mCsPuchPriorityTypComboStruct = new ComboStruct();
       
        /**
         * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setInformationMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addInfo(emsg);
        }
        /**
         * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setWarningMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         * @param value1 �u��������P
         */
        private void setWarningMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setErrorMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         * @param value1 �u��������P
         */
        private void setErrorMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����[�j���O�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
         * @param tableName �e�[�u����
         * @param columnName �J������
         * @param value �l
         */
        private void setWarningParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ��G���[�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
         * @param tableName �e�[�u����
         * @param columnName �J������
         * @param value �l
         */
        private void setErrorParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * Struct�̒l���Z�b�g���܂��B
         * @param s ���������f�[�^
         */
        private void setStruct(DZ0010010Struct s) {
         struct.setCURRENT_YEAR(s.getCURRENT_YEAR());
         struct.setCURRENT_MONTH(s.getCURRENT_MONTH());
         struct.setTERM(s.getTERM());
         struct.setHALF_TERM_TYP(s.getHALF_TERM_TYP());
         struct.setSTART_MONTH(s.getSTART_MONTH());
         struct.setCOMPANY_CD(s.getCOMPANY_CD());
         struct.setORG_CD(s.getORG_CD());
         struct.setORG_NAME(s.getORG_NAME());
         struct.setPC_FLG(s.getPC_FLG());
         struct.setM_CS_PROC_PRIORITY_TYP(s.getM_CS_PROC_PRIORITY_TYP());
         struct.setM_CS_PROC_PERIOD(s.getM_CS_PROC_PERIOD());
         struct.setM_PROC_COST_PRIORITY_TYP(s.getM_PROC_COST_PRIORITY_TYP());
         struct.setM_PROC_COST_PERIOD(s.getM_PROC_COST_PERIOD());
         struct.setM_CS_PUCH_PRIORITY_TYP(s.getM_CS_PUCH_PRIORITY_TYP());
         struct.setM_CS_PUCH_PERIOD(s.getM_CS_PUCH_PERIOD());
         struct.setCS_MAST_IF_PERIOD(s.getCS_MAST_IF_PERIOD());
         struct.setCS_CALC_TRN_PERIOD(s.getCS_CALC_TRN_PERIOD());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
       
         struct.seth_PLANT_CD(struct.getPLANT_CD());
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
       
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
         struct.seth_PLANT_CD(null);
       
         struct.setCURRENT_YEAR(getYear(_myBusinessOprDate));
         struct.setCURRENT_MONTH(getMonth(_myBusinessOprDate));
         struct.setTERM("1");
         struct.setHALF_TERM_TYP("1");
         struct.setSTART_MONTH("4");
         struct.setCOMPANY_CD(null);
         struct.setORG_CD(null);
         struct.setORG_NAME(null);
         struct.setPC_FLG("1");
         struct.setM_CS_PROC_PRIORITY_TYP("1");
         struct.setM_CS_PROC_PERIOD("3");
         struct.setM_PROC_COST_PRIORITY_TYP("1");
         struct.setM_PROC_COST_PERIOD("3");
         struct.setM_CS_PUCH_PRIORITY_TYP("1");
         struct.setM_CS_PUCH_PERIOD("3");
         struct.setCS_MAST_IF_PERIOD("3");
         struct.setCS_CALC_TRN_PERIOD("3");
         struct.setMODIFY_COUNT(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * ������敪���������x��Ƣ�J�n��������ɑÓ��ł��邩���`�F�b�N���܂��B
         * @param nowMonth ����
         * @param startMonth �J�n��
         * @param nowHalfTermTyp �����敪
         * @return �����敪���������ꍇtrue�A�s���̏ꍇfalse
         */
        private boolean isCorrectHarfTermTyp(
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
         * ����N�x����Ɩ��^�p���̔N�Ɠ��������𔻒肵�܂��B
         * @param businessOprDate �Ɩ��^�p��
         * @param startMonth �J�n��
         * @param nowMonth ���N�x
         * @return �������ꍇ�� true �A�����łȂ��ꍇ�� false ��Ԃ��܂��B
         */
        private boolean isEqualsBusinessOprYear(
         String businessOprDate,
         String startMonth,
         String nowYear) {
         String businessOprMonth = getMonth(businessOprDate);
         String businessOprYear = getYear(businessOprDate);
         if (Calculate.compare(businessOprMonth, startMonth) >= 0) {
          if (Calculate.compare(businessOprYear, nowYear) == 0) {
           return true;
          } else {
           return false;
          }
         } else {
          if (Calculate.compare(Calculate.subtract(businessOprYear, "1"), nowYear) == 0) {
           return true;
          } else {
           return false;
          }
         }
        }
        /**
         * ������x����Ɩ��^�p���̌��Ɠ��������𔻒肵�܂��B
         * @param businessOprDate �Ɩ��^�p��
         * @param nowMonth �����x
         * @return �������ꍇ�� true �A�����łȂ��ꍇ�� false ��Ԃ��܂��B
         */
        private boolean isEqualsBusinessOprMonth(String businessOprDate, String nowMonth) {
         String businessOprMonth = getMonth(businessOprDate);
         if (Calculate.compare(businessOprMonth, nowMonth) == 0) {
          return true;
         } else {
          return false;
         }
        }
        /**
         * ���t������i"YYYY/MM/DD"�j����A�N�iYYYY�j���擾���܂��B
         * @param dateStr ���t������
         * @return ���t��������؂�o�����N
         */
        private String getYear(String dateStr) {
         String[] ymd = dateStr.split("/");
         return ymd[0];
        }
        /**
         * ���t������i"YYYY/MM/DD"�j����A���iMM�j���擾���܂��B
         * @param dateStr ���t������
         * @return ���t��������؂�o������
         */
        private String getMonth(String dateStr) {
         String[] ymd = dateStr.split("/");
         return String.valueOf(Integer.parseInt(ymd[1]));
        }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DZ0010");
		logger.entering("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // �L�[�ȊO�̍��ڂ�������
                 initializeDetail();
              
                 // �L�[�ɑ΂��閼�̍��ڂ�����
                 // �H�ꖼ
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DZ0010010Struct plantStruct = (DZ0010010Struct) plantList.get(0);
                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
              
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // ���׏�������
                 List formList = entity.mForm.read(conn, struct);
              
                 // ���׏�񂪑��݂��Ȃ��ꍇ�B
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  return;
                 }
              
                 // �f�[�^���擾
                 DZ0010010Struct formStruct = (DZ0010010Struct) formList.get(0);
              
                 // ��ʂɕ\��
                 setStruct(formStruct);
              
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DZ0010");
		logger.entering("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
              
                 // �o�^�f�[�^�����łɑ��݂���ꍇ�̓G���[
                 List sysCostCtrlList = entity.mSYS_COST_CTRL.read(conn, struct);
                 if (!sysCostCtrlList.isEmpty()) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  return;
                 }
              
                 // [�H��}�X�^]���݃`�F�b�N
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // ������敪��G���[�`�F�b�N
                 if (!isCorrectHarfTermTyp(struct.getCURRENT_MONTH(),
                  struct.getSTART_MONTH(),
                  struct.getHALF_TERM_TYP())) {
                  setErrorMessage("DZ01001");
                 }
                 // ��K��l����R�[�h��̓��̓`�F�b�N
                 if (struct.getORG_CD() == null || struct.getORG_CD().length() == 0) {
                  // ��K��l����R�[�h������͂���Ă��Ȃ��ꍇ
                  struct.setCOMPANY_CD(null);
                  struct.setORG_CD(null);
                 } else {
                  // ��K��l����R�[�h������͂���Ă���ꍇ
                  // [����}�X�^]���݃`�F�b�N
                  struct.setCOMPANY_CD(_companyCd);
                  List mOrgList = entity.mM_ORG.read(conn, struct);
                  if (mOrgList.isEmpty()) {
                   setErrorMessage("ZZ11010");
                   setErrorParameter("M_ORG", "COMPANY_CD", struct.getPLANT_CD());
                   setErrorParameter("M_ORG", "ORG_CD", struct.getPLANT_CD());
                  }
                 }
                 // �Ɩ��^�p���̎擾
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00002");
                 }
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // ����N�x����[�j���O�`�F�b�N
                 if (!isEqualsBusinessOprYear(businessOprDate,
                  struct.getSTART_MONTH(),
                  struct.getCURRENT_YEAR())) {
                  setWarningMessage("DZ01002");
                 }
                 // ������x����[�j���O�`�F�b�N
                 if (!isEqualsBusinessOprMonth(businessOprDate, struct.getCURRENT_MONTH())) {
                  setWarningMessage("DZ01003");
                 }
              
                 // �f�[�^��o�^
                 entity.mSYS_COST_CTRL.create(conn, struct);
              
                 // �o�^�f�[�^����ʍĕ\��
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlInsert>
		logger.exiting("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DZ0010");
		logger.entering("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
              
                 // �}�X�^��񌟍�
                 List lockedList = entity.mSYS_COST_CTRL_Lock.read(conn, struct);
                 // �X�V����L�[�����݂��Ȃ��ꍇ�̓G���[�B
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  return;
                 }
                 // �ǂݍ��ݎ���[�����Ǘ��p�����[�^]."�X�V��"�ƈقȂ�ꍇ�̓G���[
                 DZ0010010Struct lockedStruct = (DZ0010010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("SYS_COST_CTRL", "MODIFY_COUNT", lockedStruct.getMODIFY_COUNT());
                  return;
                 }
              
                 // ������敪��G���[�`�F�b�N
                 if (!isCorrectHarfTermTyp(struct.getCURRENT_MONTH(),
                  struct.getSTART_MONTH(),
                  struct.getHALF_TERM_TYP())) {
                  setErrorMessage("DZ01001");
                 }
                 // ��K��l����R�[�h��̓��̓`�F�b�N
                 if (struct.getORG_CD() == null || struct.getORG_CD().length() == 0) {
                  // ��K��l����R�[�h������͂���Ă��Ȃ��ꍇ
                  struct.setCOMPANY_CD(null);
                  struct.setORG_CD(null);
                 } else {
                  // ��K��l����R�[�h������͂���Ă���ꍇ
                  // [����}�X�^]���݃`�F�b�N
                  struct.setCOMPANY_CD(_companyCd);
                  List mOrgList = entity.mM_ORG.read(conn, struct);
                  if (mOrgList.isEmpty()) {
                   setErrorMessage("ZZ11010");
                   setErrorParameter("M_ORG", "COMPANY_CD", struct.getPLANT_CD());
                   setErrorParameter("M_ORG", "ORG_CD", struct.getPLANT_CD());
                  }
                 }
                 // �Ɩ��^�p���̎擾
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00002");
                 }
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // ����N�x����[�j���O�`�F�b�N
                 if (!isEqualsBusinessOprYear(businessOprDate,
                  struct.getSTART_MONTH(),
                  struct.getCURRENT_YEAR())) {
                  setWarningMessage("DZ01002");
                 }
                 // ������x����[�j���O�`�F�b�N
                 if (!isEqualsBusinessOprMonth(businessOprDate, struct.getCURRENT_MONTH())) {
                  setWarningMessage("DZ01003");
                 }
              
                 // DB���X�V
                 entity.mSYS_COST_CTRL.update(conn, struct);
              
                 // �X�V�����f�[�^���Č������ĉ�ʂɕ\��
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DZ0010");
		logger.entering("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // ��ʂ�������
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DZ0010");
		logger.entering("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DZ0010");
		logger.entering("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // ��ЃR�[�h���擾
                 _companyCd = SystemInformation.getSysMyCompanyCd();
                 if (_companyCd == null) {
                  throw new ExpjException("DZ00001");
                 }
                 // �Ɩ��^�p�����擾
                 _myBusinessOprDate = SystemInformation.getBusinessOprDate(sysPLANT_CD);
                 if (_myBusinessOprDate == null) {
                  throw new ExpjException("DZ00002");
                 }
              
                 // �R���{�{�b�N�X�f�[�^���擾
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _halfTermTypComboStruct = comboBox.getData("HALF_TERM_TYP");
                 _pcFlgComboStruct = comboBox.getData("PC_FLG");
                 _mCsProcPriorityTypComboStruct = comboBox.getData("M_CS_PROC_PRIORITY_TYP");
                 _mProcCostPriorityTypComboStruct = comboBox.getData("M_PROC_COST_PRIORITY_TYP");
                 _mCsPuchPriorityTypComboStruct = comboBox.getData("M_CS_PUCH_PRIORITY_TYP");
                 comboBox.setConnection(null);
                 // �R���{�{�b�N�X�f�[�^�̐ݒ�
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                 struct.setList_PC_FLG_val(_pcFlgComboStruct.getValList());
                 struct.setList_PC_FLG_name(_pcFlgComboStruct.getExplanList());
                 struct.setList_M_CS_PROC_PRIORITY_TYP_val(_mCsProcPriorityTypComboStruct.getValList());
                 struct.setList_M_CS_PROC_PRIORITY_TYP_name(
                  _mCsProcPriorityTypComboStruct.getExplanList());
                 struct.setList_M_PROC_COST_PRIORITY_TYP_val(
                  _mProcCostPriorityTypComboStruct.getValList());
                 struct.setList_M_PROC_COST_PRIORITY_TYP_name(
                  _mProcCostPriorityTypComboStruct.getExplanList());
                 struct.setList_M_CS_PUCH_PRIORITY_TYP_val(_mCsPuchPriorityTypComboStruct.getValList());
                 struct.setList_M_CS_PUCH_PRIORITY_TYP_name(
                  _mCsPuchPriorityTypComboStruct.getExplanList());
              
                 // ��ʂ�������
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DZ0010");
		logger.entering("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

		this.msgStruct.clearAll();
		setNewDataFlg(true);
		this.sp = new ScreenParam(this.getClass());

		if (sysLog == null ) {
			sysLog = new SystemLog();
			logInit = sysLog.init(this.sp.getLogId());
			if(!logInit){
				//�V�X�e�����O�̏������Ɏ��s���܂���
				ExpjException ee = new ExpjException("ZZ01005");
				throw ee;
			}
		}

//		if(logInit){
//			sysLog.setConnection(conn);
//		}

		//���URL���ڎw��N���̋֎~
		try{
			if(ScreenPermission.isUseful(conn, getsysUSER_CD(), this.sp.getProcId()) == false) {
				throw new Exception();
			}
		}catch(Exception e){
			//���̋@�\�̎g�p����������܂���B
			ExpjException ee = new ExpjException(e, "ZZ01002");
			throw ee;
		}

		if( !( "initial".equals(button) ) && ( "1".equals(getButtonType()) ) ) {
			//�Ɩ����b�N���s����
			bLock = new BusinessLock(conn,getsysUSER_CD(),getsysPLANT_CD());
			int id = bLock.doLock(this.sp.getProcId());
			this.cancelId = "" + id;
			if(id == -1){
				//�Ɩ����b�N����Ă���
				ExpjMessage emsg = new ExpjMessage("ZZ01001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				List messageParameter = bLock.getLockingInfo();
				if(messageParameter != null) {
					int parameterSize = messageParameter.size();
					for(int i = 0; i < parameterSize; i++ ) {
						emsg = new ExpjMessage("ZZ01007", (String[])messageParameter.get(i));
						msgStruct.addError(emsg);
						sysLog.warning(emsg, getsysUSER_CD());
					}
				}
				BusinessLockException ble = new BusinessLockException();
				throw ble;
			}
		}

			conn.beginTransWeb();

		//{{user_implement_dev:<controlPREPARATION>
                // �R���{�{�b�N�X�f�[�^�̐ݒ�
                struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                struct.setList_PC_FLG_val(_pcFlgComboStruct.getValList());
                struct.setList_PC_FLG_name(_pcFlgComboStruct.getExplanList());
                struct.setList_M_CS_PROC_PRIORITY_TYP_val(_mCsProcPriorityTypComboStruct.getValList());
                struct.setList_M_CS_PROC_PRIORITY_TYP_name(_mCsProcPriorityTypComboStruct.getExplanList());
                struct.setList_M_PROC_COST_PRIORITY_TYP_val(_mProcCostPriorityTypComboStruct.getValList());
                struct.setList_M_PROC_COST_PRIORITY_TYP_name(
                 _mProcCostPriorityTypComboStruct.getExplanList());
                struct.setList_M_CS_PUCH_PRIORITY_TYP_val(_mCsPuchPriorityTypComboStruct.getValList());
                struct.setList_M_CS_PUCH_PRIORITY_TYP_name(_mCsPuchPriorityTypComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DZ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

		return;
	}

	/**
	 * �{�^���������ꂽ�ꍇ�̃C�x���g�n���h��
	 *
	 * @param buttun �{�^����
	 */
	public void control_eventHandller(String button) throws BusinessProcessException, FoundationException {

		try {
			controlPREPARATION(button);
			if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("DZ0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		} finally {
			if( !( "initial".equals(button) ) && ( "1".equals(getButtonType()) ) && (Integer.parseInt(cancelId) >= 0) ) {
				//���b�N����
				this.doUnBusinessLock();
			}
		}

		return;
	}

	//////////////////////////////


	//////////////////////////////

	/**
	 * CSV�o�̓��\�b�h
	 *
	 * @param list �e�[�u���񍀖ڃ��X�g�C���X�^���X
	 */
	public void createDefaultCSV(List list, String sTitle[]) throws BusinessProcessException, FoundationException {

		try {
			// ManageContainer �I�u�W�F�N�g��V�K�ɐ�������̂���߂��B
			// Singleton�Ŏ����Ă���I�u�W�F�N�g���g�p����悤�ɕύX�B
			// 2003.09.08 m-kasai
			//ManageContainer container = new ManageContainer(AppServerResources.getInstance());
			entity.mei_CSVOut.setPath(CoreTools.getContainer().getString("webroot")+"/csv/");
			entity.mei_CSVOut.setFname(entity.mei_CSVOut.m_ProjName
										+(struct.getsUser_ID() == null ? "" : "_"+struct.getsUser_ID())
										+(struct.getsSysdate() == null ? "" : "_"+struct.getsSysdate().substring(0,4)
																				 +struct.getsSysdate().substring(5,7)
																				 +struct.getsSysdate().substring(8,10)
																				 +struct.getsSysdate().substring(11,13)
																				 +struct.getsSysdate().substring(14,16)
																				 +struct.getsSysdate().substring(17,19))
										+".csv");
			entity.mei_CSVOut.create(list, sTitle);
		//{{user_implement_dev:<createDefaultCSV>
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DZ0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("DZ0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	/**
	 * �V�X�e�����t�擾���\�b�h
	 *
	 */
	public void beginTransaction() throws BusinessProcessException, FoundationException {
		String sToday = "";

		if(conn == null) { CoreTools.getTransConnection(); }

		try {
			if((sToday = entity.mei_Sysdate.read(conn))==null) {
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DZ0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("DZ0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DZ0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("DZ0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected DZ0010010Entity entity;
	protected DZ0010010Struct struct;
	protected IDbConnection conn;

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ���[�UID���Z�b�g���܂��B

	/**
	 * �����o�ϐ������������܂�
	 *
	 */
	public void initialize() throws FoundationException
	{
		conn = null;
		entity = null;
		struct = null;

		entity = new DZ0010010Entity();
		struct = new DZ0010010Struct();

		return;
	}

	/**
	 * �ڑ��������s���܂��B
	 *
	 * @return IDbConnection
	 */
	public IDbConnection connect() throws FoundationException
	{
		// DB�ڑ��������s���܂��B
		if( conn == null || conn.getConn() == null) {
			conn = CoreTools.getTransConnection();
		}
		return conn;
	}

	/**
	 * �ؒf�������s���܂��B
	 *
	 */
	public void disconnect(IDbConnection connect) throws FoundationException
	{
		// �Z�b�V�����̐ؒf�������s���܂��B
		if( connect != null ) {
			connect.commit();
			CoreTools.closeTransConnection(connect);
			connect = null;
		}
		return;
	}
	//////////////////////////////

	/**
	 * DZ0010010�N���X�̕W���R���X�g���N�^
	 */
	public DZ0010010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                try {
                } catch (MissingResourceException e) {
                 e.printStackTrace();
                }
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	protected void finalize() throws FoundationException
	{
		//{{user_implement_dev:control_destractor
                //}}user_implement_dev:control_destractor

		objMessage = null;

		return;
	}

	//////////////////////////////

	//////////////////////////////
	//  ��ʑJ�ڌ����@�֘A���\�b�h

	//////////////////////////////
	// ���M�L�[��ݒ�	
	public void setOrMsgKey(List keyList) throws MessageApiException {

		// ���t�ϊ��p
		SimpleDateFormat sdf = new SimpleDateFormat();

		ArrayList msgKeyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_SEND); //�Ɩ������M�\�ȃ��b�Z�[�W�L�[�̏ꍇ
		ArrayList msgKeyArray = new ArrayList();

		for (int i = 0; msgKeyTypeArray != null && i < msgKeyTypeArray.size(); i++) {
			// ���b�Z�[�W�L�[�̎�ނ̐������J��Ԃ�	
			MessageKeyType msgKeyType = (MessageKeyType)msgKeyTypeArray.get(i);

			// ���b�Z�[�W�L�[�̃e�[�u����	
			String tableName = msgKeyType.getTableName();

			// ���b�Z�[�W�L�[�̃L�[�J���������X�g	
			// �����L�[�̏ꍇ�AkeyColumnName�̔z�񐔂��Q�ȏ�ƂȂ�
			String [] keyColumnName = msgKeyType.getKeyColumnName();
			for(int j = 0; j < keyList.size(); j++) {
				DZ0010010Struct key = (DZ0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CURRENT_YEAR") && key.getCURRENT_YEAR() != null) {
					msgKey.setKeyValue("CURRENT_YEAR", key.getCURRENT_YEAR());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_MONTH") && key.getCURRENT_MONTH() != null) {
					msgKey.setKeyValue("CURRENT_MONTH", key.getCURRENT_MONTH());
				}
				if(msgKeyType.containsKeyColumn("TERM") && key.getTERM() != null) {
					msgKey.setKeyValue("TERM", key.getTERM());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP") && key.getHALF_TERM_TYP() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP", key.getHALF_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("START_MONTH") && key.getSTART_MONTH() != null) {
					msgKey.setKeyValue("START_MONTH", key.getSTART_MONTH());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("PC_FLG") && key.getPC_FLG() != null) {
					msgKey.setKeyValue("PC_FLG", key.getPC_FLG());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PROC_PRIORITY_TYP") && key.getM_CS_PROC_PRIORITY_TYP() != null) {
					msgKey.setKeyValue("M_CS_PROC_PRIORITY_TYP", key.getM_CS_PROC_PRIORITY_TYP());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PROC_PERIOD") && key.getM_CS_PROC_PERIOD() != null) {
					msgKey.setKeyValue("M_CS_PROC_PERIOD", key.getM_CS_PROC_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("M_PROC_COST_PRIORITY_TYP") && key.getM_PROC_COST_PRIORITY_TYP() != null) {
					msgKey.setKeyValue("M_PROC_COST_PRIORITY_TYP", key.getM_PROC_COST_PRIORITY_TYP());
				}
				if(msgKeyType.containsKeyColumn("M_PROC_COST_PERIOD") && key.getM_PROC_COST_PERIOD() != null) {
					msgKey.setKeyValue("M_PROC_COST_PERIOD", key.getM_PROC_COST_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PUCH_PRIORITY_TYP") && key.getM_CS_PUCH_PRIORITY_TYP() != null) {
					msgKey.setKeyValue("M_CS_PUCH_PRIORITY_TYP", key.getM_CS_PUCH_PRIORITY_TYP());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PUCH_PERIOD") && key.getM_CS_PUCH_PERIOD() != null) {
					msgKey.setKeyValue("M_CS_PUCH_PERIOD", key.getM_CS_PUCH_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("CS_MAST_IF_PERIOD") && key.getCS_MAST_IF_PERIOD() != null) {
					msgKey.setKeyValue("CS_MAST_IF_PERIOD", key.getCS_MAST_IF_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("CS_CALC_TRN_PERIOD") && key.getCS_CALC_TRN_PERIOD() != null) {
					msgKey.setKeyValue("CS_CALC_TRN_PERIOD", key.getCS_CALC_TRN_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name") && key.getHALF_TERM_TYP_name() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_name", key.getHALF_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val") && key.getHALF_TERM_TYP_val() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_val", key.getHALF_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PC_FLG_name") && key.getPC_FLG_name() != null) {
					msgKey.setKeyValue("PC_FLG_name", key.getPC_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("PC_FLG_val") && key.getPC_FLG_val() != null) {
					msgKey.setKeyValue("PC_FLG_val", key.getPC_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PROC_PRIORITY_TYP_name") && key.getM_CS_PROC_PRIORITY_TYP_name() != null) {
					msgKey.setKeyValue("M_CS_PROC_PRIORITY_TYP_name", key.getM_CS_PROC_PRIORITY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PROC_PRIORITY_TYP_val") && key.getM_CS_PROC_PRIORITY_TYP_val() != null) {
					msgKey.setKeyValue("M_CS_PROC_PRIORITY_TYP_val", key.getM_CS_PROC_PRIORITY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("M_PROC_COST_PRIORITY_TYP_name") && key.getM_PROC_COST_PRIORITY_TYP_name() != null) {
					msgKey.setKeyValue("M_PROC_COST_PRIORITY_TYP_name", key.getM_PROC_COST_PRIORITY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("M_PROC_COST_PRIORITY_TYP_val") && key.getM_PROC_COST_PRIORITY_TYP_val() != null) {
					msgKey.setKeyValue("M_PROC_COST_PRIORITY_TYP_val", key.getM_PROC_COST_PRIORITY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PUCH_PRIORITY_TYP_name") && key.getM_CS_PUCH_PRIORITY_TYP_name() != null) {
					msgKey.setKeyValue("M_CS_PUCH_PRIORITY_TYP_name", key.getM_CS_PUCH_PRIORITY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("M_CS_PUCH_PRIORITY_TYP_val") && key.getM_CS_PUCH_PRIORITY_TYP_val() != null) {
					msgKey.setKeyValue("M_CS_PUCH_PRIORITY_TYP_val", key.getM_CS_PUCH_PRIORITY_TYP_val());
				}
				//{{user_implement_dev:setOrMsgKey
					// TODO: �L�[���ݒ�̃R�[�h��ǉ����Ă�������
                                //}}user_implement_dev:setOrMsgKey

				// ���b�Z�[�W�L�[�ǉ�
				msgKeyArray.add(msgKey);

				// ���b�Z�[�W�L�[���Ɩ��ɓo�^����
				business.setSendMessageKey(tableName, keyColumnName, msgKeyArray);
			}
		}
	}

	//////////////////////////////
	// ��M�L�[���擾
	public List getOrMsgKey() throws MessageApiException {
		
		// ���t�ϊ��p
		SimpleDateFormat sdf = new SimpleDateFormat();

		ArrayList keyList = new ArrayList();
		ArrayList msgKeyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_RECEIVE);//�Ɩ�����M�\�ȃ��b�Z�[�W�L�[�̏ꍇ

		try {
			for (int i = 0; msgKeyTypeArray != null && i < msgKeyTypeArray.size(); i++) {
				// ���b�Z�[�W�L�[�̎�ނ̐������J��Ԃ�
				MessageKeyType msgKeyType = (MessageKeyType)msgKeyTypeArray.get(i);

				// ���b�Z�[�W�L�[�̃e�[�u����
				String tableName = msgKeyType.getTableName();

				// ���b�Z�[�W�L�[�̃L�[�J���������X�g
				// �����L�[�̏ꍇ�AkeyColumnName�̔z�񐔂��Q�ȏ�ƂȂ�
				String [] keyColumnName = msgKeyType.getKeyColumnName();

				// ���b�Z�[�W�L�[���擾����
				ArrayList msgKeyArray = business.getRecieveMessageKey(tableName, keyColumnName);//��M�������b�Z�[�W�L�[

				// ���b�Z�[�W�L�[�����݂���ꍇ�́A���b�Z�[�W�L�[�̐������J��Ԃ�
				for (int j = 0; msgKeyArray != null && j < msgKeyArray.size(); j++) {
					MessageKey msgKey = (MessageKey)msgKeyArray.get(j);
					DZ0010010Struct key = new DZ0010010Struct();
					if(msgKeyType.containsKeyColumn("CURRENT_YEAR")) {
						key.setCURRENT_YEAR(msgKey.getKeyValue("CURRENT_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_MONTH")) {
						key.setCURRENT_MONTH(msgKey.getKeyValue("CURRENT_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("TERM")) {
						key.setTERM(msgKey.getKeyValue("TERM"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP")) {
						key.setHALF_TERM_TYP(msgKey.getKeyValue("HALF_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("START_MONTH")) {
						key.setSTART_MONTH(msgKey.getKeyValue("START_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PC_FLG")) {
						key.setPC_FLG(msgKey.getKeyValue("PC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PROC_PRIORITY_TYP")) {
						key.setM_CS_PROC_PRIORITY_TYP(msgKey.getKeyValue("M_CS_PROC_PRIORITY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PROC_PERIOD")) {
						key.setM_CS_PROC_PERIOD(msgKey.getKeyValue("M_CS_PROC_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("M_PROC_COST_PRIORITY_TYP")) {
						key.setM_PROC_COST_PRIORITY_TYP(msgKey.getKeyValue("M_PROC_COST_PRIORITY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("M_PROC_COST_PERIOD")) {
						key.setM_PROC_COST_PERIOD(msgKey.getKeyValue("M_PROC_COST_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PUCH_PRIORITY_TYP")) {
						key.setM_CS_PUCH_PRIORITY_TYP(msgKey.getKeyValue("M_CS_PUCH_PRIORITY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PUCH_PERIOD")) {
						key.setM_CS_PUCH_PERIOD(msgKey.getKeyValue("M_CS_PUCH_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("CS_MAST_IF_PERIOD")) {
						key.setCS_MAST_IF_PERIOD(msgKey.getKeyValue("CS_MAST_IF_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("CS_CALC_TRN_PERIOD")) {
						key.setCS_CALC_TRN_PERIOD(msgKey.getKeyValue("CS_CALC_TRN_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name")) {
						key.setHALF_TERM_TYP_name(msgKey.getKeyValue("HALF_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val")) {
						key.setHALF_TERM_TYP_val(msgKey.getKeyValue("HALF_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PC_FLG_name")) {
						key.setPC_FLG_name(msgKey.getKeyValue("PC_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("PC_FLG_val")) {
						key.setPC_FLG_val(msgKey.getKeyValue("PC_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PROC_PRIORITY_TYP_name")) {
						key.setM_CS_PROC_PRIORITY_TYP_name(msgKey.getKeyValue("M_CS_PROC_PRIORITY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PROC_PRIORITY_TYP_val")) {
						key.setM_CS_PROC_PRIORITY_TYP_val(msgKey.getKeyValue("M_CS_PROC_PRIORITY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("M_PROC_COST_PRIORITY_TYP_name")) {
						key.setM_PROC_COST_PRIORITY_TYP_name(msgKey.getKeyValue("M_PROC_COST_PRIORITY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("M_PROC_COST_PRIORITY_TYP_val")) {
						key.setM_PROC_COST_PRIORITY_TYP_val(msgKey.getKeyValue("M_PROC_COST_PRIORITY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PUCH_PRIORITY_TYP_name")) {
						key.setM_CS_PUCH_PRIORITY_TYP_name(msgKey.getKeyValue("M_CS_PUCH_PRIORITY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("M_CS_PUCH_PRIORITY_TYP_val")) {
						key.setM_CS_PUCH_PRIORITY_TYP_val(msgKey.getKeyValue("M_CS_PUCH_PRIORITY_TYP_val"));
					}
					//{{user_implement_dev:getOrMsgKey
						// TODO: �L�[���擾�̃R�[�h��ǉ����Ă�������
                                        //}}user_implement_dev:getOrMsgKey
					keyList.add(key);
				}
			}
		} catch (Exception e) {
			// printStackTrace ��\���B
			e.printStackTrace();
		}
		return keyList;
	}
}
