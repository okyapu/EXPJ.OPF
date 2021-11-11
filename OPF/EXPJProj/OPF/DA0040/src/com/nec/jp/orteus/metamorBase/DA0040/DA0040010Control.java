/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0040/src/com/nec/jp/orteus/metamorBase/DA0040/DA0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0040;

import com.nec.jp.orteus.metamorBase.DA0040.*;
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

public class DA0040010Control
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
        public DA0040010Struct getListvalue(int x) {
         return (DA0040010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public DA0040010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public DA0040010Struct createStruct() {
         return new DA0040010Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((DA0040010Struct) structname);
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
        /** �M�ݒP�� */
        private String _homeCurUnit;
       
        /** ���O�C�����[�U�̍H��R�[�h���L�[�Ɍ�������[�����Ǘ��p�����[�^]�f�[�^�I�u�W�F�N�g�i��ʏ������Ɏg�p�j */
        private DA0040010Struct _mySysCostCtrl;
       
        /** ������敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _halfTermTypComboStruct = new ComboStruct();
        /** �������ʣ�R���{�{�b�N�X�f�[�^ */
        private ComboStruct _costTypComboStruct = new ComboStruct();
        /** ��L���x���t���O��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _onerousConsFlgComboStruct = new ComboStruct();
       
        /** ���ɑJ�ڂ����ʂ�URL */
        private String _nextUrl;
       
        /** �q��ʂōs������ */
        private String operationMode;
        /** �q��ʂ̑��삪�o�^�ł��邱�Ƃ�\���萔 */
        static final private String INSERT = "INSERT";
        /** �q��ʂ̑��삪�X�V�ł��邱�Ƃ�\���萔 */
        static final private String UPDATE = "UPDATE";
       
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
         param.append(".");
         param.append(columnName);
         param.append(":");
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * ���ɑJ�ڂ����ʂ�URL���擾���܂��B
         */
        public String getNextUrl() {
         return _nextUrl;
        }
        /**
         * ���ɑJ�ڂ����ʂ�URL��ݒ肵�܂��B
         */
        public void setNextUrl(String url) {
         _nextUrl = url;
        }
       
        /**
         * �q��ʂōs����ƃ��[�h��Ԃ��܂��B
         * @return ��ƃ��[�h�iINSERT/UPDATE�j
         */
        public String getOperationMode() {
         return operationMode;
        }
       
        /**
         * Struct�̒l���Z�b�g���܂��B
         * @param s ���������f�[�^
         */
        private void setStruct(DA0040010Struct s) {
        }
       
        /**
         * Struct�̒l���Z�b�g���܂��B
         * @param s ���������f�[�^
         */
        private void setStructSub1(DA0040010Struct s) {
         struct.setITEM_CD(s.getITEM_CD());
         struct.setITEM_NAME(s.getITEM_NAME());
         struct.setPROC_COST_CLS_CD(s.getPROC_COST_CLS_CD());
         struct.setPROC_COST_CLS_NAME(s.getPROC_COST_CLS_NAME());
         struct.setPROC_COST_UNIT_QTY(s.getPROC_COST_UNIT_QTY());
         struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
         struct.setCLASIFICATION_CD(s.getCLASIFICATION_CD());
         struct.setONEROUS_CONS_FLG(s.getONEROUS_CONS_FLG());
         struct.setPROC_COST_01(s.getPROC_COST_01());
         struct.setPROC_COST_02(s.getPROC_COST_02());
         struct.setPROC_COST_03(s.getPROC_COST_03());
         struct.setPROC_COST_04(s.getPROC_COST_04());
         struct.setPROC_COST_05(s.getPROC_COST_05());
         struct.setPROC_COST_06(s.getPROC_COST_06());
         struct.setPROC_COST_07(s.getPROC_COST_07());
         struct.setPROC_COST_08(s.getPROC_COST_08());
         struct.setPROC_COST_09(s.getPROC_COST_09());
         struct.setPROC_COST_10(s.getPROC_COST_10());
         struct.setPROC_COST_11(s.getPROC_COST_11());
         struct.setPROC_COST_12(s.getPROC_COST_12());
         struct.setPROC_COST_SUM(s.getPROC_COST_SUM());
         struct.setHOME_CUR_UNIT(_homeCurUnit);
         struct.setPROC_COST_01_NAME(s.getPROC_COST_01_NAME());
         struct.setPROC_COST_02_NAME(s.getPROC_COST_02_NAME());
         struct.setPROC_COST_03_NAME(s.getPROC_COST_03_NAME());
         struct.setPROC_COST_04_NAME(s.getPROC_COST_04_NAME());
         struct.setPROC_COST_05_NAME(s.getPROC_COST_05_NAME());
         struct.setPROC_COST_06_NAME(s.getPROC_COST_06_NAME());
         struct.setPROC_COST_07_NAME(s.getPROC_COST_07_NAME());
         struct.setPROC_COST_08_NAME(s.getPROC_COST_08_NAME());
         struct.setPROC_COST_09_NAME(s.getPROC_COST_09_NAME());
         struct.setPROC_COST_10_NAME(s.getPROC_COST_10_NAME());
         struct.setPROC_COST_11_NAME(s.getPROC_COST_11_NAME());
         struct.setPROC_COST_12_NAME(s.getPROC_COST_12_NAME());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
       
         struct.setc_NoCheckClasificationCd("true");
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setCS_PROC_CD(null);
         struct.setYEAR(_mySysCostCtrl.getCURRENT_YEAR());
         struct.setHALF_TERM_TYP(_mySysCostCtrl.getHALF_TERM_TYP());
         struct.setCOST_TYP("1");
       
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setCS_PROC_NAME(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetailSub1() {
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setPROC_COST_CLS_CD(null);
         struct.setPROC_COST_CLS_NAME(null);
         struct.setCLASIFICATION_CD(null);
         struct.setONEROUS_CONS_FLG(null);
         struct.setPROC_COST_UNIT_QTY(null);
         struct.setSTOCK_UNIT(null);
         struct.setPROC_COST_01(null);
         struct.setPROC_COST_02(null);
         struct.setPROC_COST_03(null);
         struct.setPROC_COST_04(null);
         struct.setPROC_COST_05(null);
         struct.setPROC_COST_06(null);
         struct.setPROC_COST_07(null);
         struct.setPROC_COST_08(null);
         struct.setPROC_COST_09(null);
         struct.setPROC_COST_10(null);
         struct.setPROC_COST_11(null);
         struct.setPROC_COST_12(null);
         struct.setPROC_COST_SUM(null);
         struct.setHOME_CUR_UNIT(_homeCurUnit);
         struct.setPROC_COST_01_NAME(null);
         struct.setPROC_COST_02_NAME(null);
         struct.setPROC_COST_03_NAME(null);
         struct.setPROC_COST_04_NAME(null);
         struct.setPROC_COST_05_NAME(null);
         struct.setPROC_COST_06_NAME(null);
         struct.setPROC_COST_07_NAME(null);
         struct.setPROC_COST_08_NAME(null);
         struct.setPROC_COST_09_NAME(null);
         struct.setPROC_COST_10_NAME(null);
         struct.setPROC_COST_11_NAME(null);
         struct.setPROC_COST_12_NAME(null);
         struct.setMODIFY_COUNT(null);
       
         struct.setc_NoCheckClasificationCd("true");
       
         list = null;
       
         readStatus = INITIAL;
        }
	//�R���{�{�b�N�X�̐����擾�i������j
	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
		try {
			ComboBox com = new ComboBox(conn, sysUSER_CD);
			ComboStruct _comstruct = new ComboStruct();
			_comstruct = com.getData(comname);
			for (int j = 0; j < _comstruct.size(); j++) {
				if ((_comstruct.getData(j)[0]).equals(value)) {
					return _comstruct.getData(j)[1];
				}
			}
			return null;
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}  
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // �L�[�ȊO�̍��ڂ�������
                 initializeDetail();
              
                 // �L�[�ɑ΂��閼�̍��ڂ�����
                 // �H�ꖼ
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DA0040010Struct mPlantStruct = (DA0040010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // �����敪�\����
                 int halfTermTypIndex =
                  _halfTermTypComboStruct.getValList().indexOf(struct.getHALF_TERM_TYP());
                 struct.setHALF_TERM_TYP_DN(
                  (String) _halfTermTypComboStruct.getExplanList().get(halfTermTypIndex));
                 // ������ʕ\����
                 int costTypIndex = _costTypComboStruct.getValList().indexOf(struct.getCOST_TYP());
                 struct.setCOST_TYP_DN((String) _costTypComboStruct.getExplanList().get(costTypIndex));
                 // �H����
                 List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                 if (mCsProcList.isEmpty()) {
                  setErrorMessage("DA00001");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  struct.setCS_PROC_NAME(null);
                 } else {
                  DA0040010Struct mCsProcStruct = (DA0040010Struct) mCsProcList.get(0);
                  struct.setCS_PROC_NAME(mCsProcStruct.getCS_PROC_NAME());
                 }
                //���C���h�J�[�h�w�荀�ڂ̐ݒ�
                //�i�ڔԍ�
                if(struct.getIN_ITEM_CD() == null || "".equals(struct.getIN_ITEM_CD())){
                	struct.setIN_ITEM_CD("%");
                }
                	
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
                 int maxLine = sp.getMaxLine(conn, 10);
     			 if(maxLine != 0) {
     				struct.setROW_COUNT(String.valueOf(maxLine));
     			 } else {
     				struct.setROW_COUNT(null);
     			 }
     			 List viewList = entity.mViewCnt.read(conn, struct);
     			 long rowCount = Long.parseLong(((DA0040010Struct)viewList.get(0)).getl_COUNT());
     			 // �ꗗ�f�[�^��0���̏ꍇ
                 if (rowCount==0) {
                	setErrorMessage("ZZ06001");
                    readStatus = NOT_FOUND;
                    return;
                 }
                 // �ő�\���s���`�F�b�N
                 if ((maxLine != 0) && (rowCount == maxLine + 1)) {
                    setErrorMessage("ZZ01115", "" + maxLine);
                    setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                    setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                    setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                    setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                    setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                    readStatus = TOO_MANY;
                    return;
                 }
     			 // �ꗗ�����擾
                 viewList = entity.mView.read(conn, struct);
              
                 if("%".equals(struct.getIN_ITEM_CD())){
                 	struct.setIN_ITEM_CD(null);
                 }
                 // ��ʂɕ\��
                 setList(viewList);
                 DA0040010Struct TempStruct;
                 for (int i = 0; i < list.size(); i++) {
			     TempStruct = (DA0040010Struct)list.get(i);
    			 TempStruct.setl_ONEROUS_CONS_FLG_DN(this.multcombo("ONEROUS_CONS_FLG",TempStruct.getl_ONEROUS_CONS_FLG_DN()));
			    }
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
                initializeDetailSub1();
              
                readStatus = NORMAL;
              
                operationMode = INSERT;
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
                try {
                 initializeDetailSub1();
              
                 struct.setITEM_CD(struct.getl_ITEM_CD());
                 struct.setPROC_COST_CLS_CD(struct.getl_PROC_COST_CLS_CD());
              
                 // �f�[�^���擾
                 List formList = entity.mFormSub1.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
              
                  readStatus = ERROR;
                  return;
                 }
                 DA0040010Struct formStruct = (DA0040010Struct) formList.get(0);
              
                 setStructSub1(formStruct);
              
                 readStatus = NORMAL;
              
                 operationMode = UPDATE;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
                try {
                 initializeDetailSub1();
              
                 struct.setITEM_CD(struct.getl_ITEM_CD());
                 struct.setPROC_COST_CLS_CD(struct.getl_PROC_COST_CLS_CD());
              
                 // �f�[�^���擾
                 List formList = entity.mFormSub1.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
              
                  readStatus = ERROR;
                  return;
                 }
                 DA0040010Struct formStruct = (DA0040010Struct) formList.get(0);
              
                 setStructSub1(formStruct);
              
                 readStatus = NORMAL;
              
                 operationMode = INSERT;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
                try {
                 struct.setITEM_CD(struct.getl_ITEM_CD());
                 struct.setPROC_COST_CLS_CD(struct.getl_PROC_COST_CLS_CD());
              
                 // �}�X�^��񌟍�
                 List lockedList = entity.mM_ITEM_PROC_COST_Lock.read(conn, struct);
                 // �폜����L�[�����݂��Ȃ��ꍇ�̓G���[�B
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  return;
                 }
                 // �ǂݍ��ݎ���[�ʉ�]."�X�V��"�ƈقȂ�ꍇ�̓G���[
                 DA0040010Struct lockedStruct = (DA0040010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getl_MODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  return;
                 }
              
                 // �폜�������s
                 entity.mM_ITEM_PROC_COST.delete(conn, struct);
                 // ��ʂ�������
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // ��ʂ�������
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // �o�^����L�[��[�i�ڕʉ��H��}�X�^]������
                 List mItemProcCostList = entity.mM_ITEM_PROC_COST.read(conn, struct);
                 // �o�^�f�[�^�����łɑ��݂���ꍇ�̓G���[
                 if (!mItemProcCostList.isEmpty()) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
                 // �o�^�f�[�^�����łɑ��H���œo�^����Ă���ꍇ�̓G���[
                 List mItemProcCostOtherProcList = entity.mM_ITEM_PROC_COST_OtherProc.read(conn, struct);
                 if (!mItemProcCostOtherProcList.isEmpty()) {
                  setErrorMessage("DA04001");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // [�H��}�X�^]���݃`�F�b�N
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [�H���}�X�^]���݃`�F�b�N
                 List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                 if (mCsProcList.isEmpty()) {
                  setErrorMessage("DA00001");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                 } else {
                  // [�H���}�X�^]."�폜�t���O"=1�̏ꍇ�̓G���[
                  DA0040010Struct mCsProcStruct = (DA0040010Struct) mCsProcList.get(0);
                  if ("1".equals(mCsProcStruct.getDEL_FLG())) {
                   setErrorMessage("DA04002");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // [���H��ރ}�X�^]���݃`�F�b�N
                 List mProcCostClsList = entity.mM_PROC_COST_CLS.read(conn, struct);
                 if (mProcCostClsList.isEmpty()) {
                  setErrorMessage("DA00009");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 }
                 // [���H��}�X�^]���݃`�F�b�N
                 List mProcCostList = entity.mM_PROC_COST.read(conn, struct);
                 if (mProcCostList.isEmpty()) {
                  setErrorMessage("DA00003");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 } else {
                  // [���H��}�X�^]."�폜�t���O"=1�̏ꍇ�̓G���[
                  DA0040010Struct mProcCostStruct = (DA0040010Struct) mProcCostList.get(0);
                  if ("1".equals(mProcCostStruct.getDEL_FLG())) {
                   setErrorMessage("DA04003");
                   setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                   setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                   setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                   setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                   setErrorParameter(
                    "M_PROC_COST",
                    "PROC_COST_CLS_CD",
                    struct.getPROC_COST_CLS_CD());
                  }
                 }
                 // [�i�ڃ}�X�^]���݃`�F�b�N
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 } else {
                  DA0040010Struct mItemStruct = (DA0040010Struct) mItemList.get(0);
              
                  // ��i�ڊǗ��R�[�h���NULL�`�F�b�N���s��
                  if (struct.getCLASIFICATION_CD() == null
                   || struct.getCLASIFICATION_CD().length() == 0) {
                   // ��i�ڊǗ��R�[�h�=NULL�̏ꍇ�A[�i��]."�Ǘ��R�[�h"��ݒ肷��B
                   struct.setCLASIFICATION_CD(mItemStruct.getCLASIFICATION_CD());
                  } else {
                   // ��i�ڊǗ��R�[�h�!=NULL�̏ꍇ���A��i�ڏ��Ɣ�r���Ȃ��=off�̏ꍇ
                   if (!"true".equals(struct.getc_NoCheckClasificationCd())) {
                    // ��i�ڊǗ��R�[�h�!=[�i��]."�Ǘ��R�[�h"�̏ꍇ�̓G���[
                    if (!struct
                     .getCLASIFICATION_CD()
                     .equals(mItemStruct.getCLASIFICATION_CD())) {
                     setErrorMessage("DA04004");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
                 }
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // �f�[�^��o�^
                 entity.mM_ITEM_PROC_COST.create(conn, struct);
              
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
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
                 // �}�X�^��񌟍�
                 List lockedList = entity.mM_ITEM_PROC_COST_Lock.read(conn, struct);
                 // �X�V����L�[�����݂��Ȃ��ꍇ�̓G���[
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
                 // �ǂݍ��ݎ��̢�X�V����ƈقȂ�ꍇ�̓G���[
                 DA0040010Struct lockedStruct = (DA0040010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // [�H��}�X�^]���݃`�F�b�N
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [�H���}�X�^]���݃`�F�b�N
                 List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                 if (mCsProcList.isEmpty()) {
                  setErrorMessage("DA00001");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                 } else {
                  // [�H���}�X�^]."�폜�t���O"=1�̏ꍇ�̓G���[
                  DA0040010Struct mCsProcStruct = (DA0040010Struct) mCsProcList.get(0);
                  if ("1".equals(mCsProcStruct.getDEL_FLG())) {
                   setErrorMessage("DA04002");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // [���H��ރ}�X�^]���݃`�F�b�N
                 List mProcCostClsList = entity.mM_PROC_COST_CLS.read(conn, struct);
                 if (mProcCostClsList.isEmpty()) {
                  setErrorMessage("DA00009");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 }
                 // [���H��}�X�^]���݃`�F�b�N
                 List mProcCostList = entity.mM_PROC_COST.read(conn, struct);
                 if (mProcCostList.isEmpty()) {
                  setErrorMessage("DA00003");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 } else {
                  // [���H��}�X�^]."�폜�t���O"=1�̏ꍇ�̓G���[
                  DA0040010Struct mProcCostStruct = (DA0040010Struct) mProcCostList.get(0);
                  if ("1".equals(mProcCostStruct.getDEL_FLG())) {
                   setErrorMessage("DA04003");
                   setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                   setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                   setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                   setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                   setErrorParameter(
                    "M_PROC_COST",
                    "PROC_COST_CLS_CD",
                    struct.getPROC_COST_CLS_CD());
                  }
                 }
                 // [�i�ڃ}�X�^]���݃`�F�b�N
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 } else {
                  DA0040010Struct mItemStruct = (DA0040010Struct) mItemList.get(0);
                  // ��i�ڊǗ��R�[�h���NULL�`�F�b�N���s��
                  if (struct.getCLASIFICATION_CD() == null
                   || struct.getCLASIFICATION_CD().length() == 0) {
                   // ��i�ڊǗ��R�[�h�=NULL�̏ꍇ�A[�i��]."�Ǘ��R�[�h"��ݒ肷��B
                   struct.setCLASIFICATION_CD(mItemStruct.getCLASIFICATION_CD());
                  } else {
                   // ��i�ڊǗ��R�[�h�!=NULL�̏ꍇ���A��i�ڏ��Ɣ�r���Ȃ��=off�̏ꍇ
                   if (!"true".equals(struct.getc_NoCheckClasificationCd())) {
                    // ��i�ڊǗ��R�[�h�!=[�i��]."�Ǘ��R�[�h"�̏ꍇ�̓G���[
                    if (!struct
                     .getCLASIFICATION_CD()
                     .equals(mItemStruct.getCLASIFICATION_CD())) {
                     setErrorMessage("DA04004");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
                 }
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // DB���X�V
                 entity.mM_ITEM_PROC_COST.update(conn, struct);
              
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
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
                controlSelect();
                //}}user_implement_dev:<controlReturn>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // �u�M�ݒP�ʁv���擾
                 List mHomeCurList = entity.mM_HOME_CUR.read(conn, struct);
                 // �擾�Ɏ��s�����ꍇ�̓G���[
                 if (mHomeCurList.isEmpty()) {
                  throw new ExpjException();
                 } else {
                  DA0040010Struct mHomeCurStruct = (DA0040010Struct) mHomeCurList.get(0);
                  _homeCurUnit = mHomeCurStruct.getHOME_CUR_UNIT();
                 }
              
                 // ���O�C�����[�U�̍H��R�[�h���L�[��[�����Ǘ��p�����[�^]���擾����i��ʏ������Ɏg�p�j
                 struct.setPLANT_CD(sysPLANT_CD);
                 List sysCostCtrlList = entity.mSYS_COST_CTRL.read(conn, struct);
                 // [�����Ǘ��p�����[�^]�����݂��Ȃ��ꍇ�̓G���[���b�Z�[�W��\��
                 if (sysCostCtrlList.isEmpty()) {
                  setErrorMessage("DA00005");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  _mySysCostCtrl = new DA0040010Struct();
                 } else {
                  _mySysCostCtrl = (DA0040010Struct) sysCostCtrlList.get(0);
                 }
              
                 // �R���{�{�b�N�X�f�[�^���擾
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _halfTermTypComboStruct = comboBox.getData("HALF_TERM_TYP");
                 _costTypComboStruct = comboBox.getData("COST_TYP");
                 _onerousConsFlgComboStruct = comboBox.getData("ONEROUS_CONS_FLG");
                 comboBox.setConnection(null);
                 // �R���{�{�b�N�X�f�[�^�̐ݒ�
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                 struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                 struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
              
                 // ��ʂ�������
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                struct.setList_ONEROUS_CONS_FLG_val(_onerousConsFlgComboStruct.getValList());
                struct.setList_ONEROUS_CONS_FLG_name(_onerousConsFlgComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
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
//			throw new FoundationException("DA0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("DA0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("DA0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("DA0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected DA0040010Entity entity;
	protected DA0040010Struct struct;
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

		entity = new DA0040010Entity();
		struct = new DA0040010Struct();

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
	 * DA0040010�N���X�̕W���R���X�g���N�^
	 */
	public DA0040010Control() throws BusinessProcessException, FoundationException
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
				DA0040010Struct key = (DA0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name") && key.getHALF_TERM_TYP_name() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_name", key.getHALF_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val") && key.getHALF_TERM_TYP_val() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_val", key.getHALF_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_name") && key.getCOST_TYP_name() != null) {
					msgKey.setKeyValue("COST_TYP_name", key.getCOST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_val") && key.getCOST_TYP_val() != null) {
					msgKey.setKeyValue("COST_TYP_val", key.getCOST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN") && key.getHALF_TERM_TYP_DN() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_DN", key.getHALF_TERM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_DN") && key.getCOST_TYP_DN() != null) {
					msgKey.setKeyValue("COST_TYP_DN", key.getCOST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name") && key.getONEROUS_CONS_FLG_name() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_name", key.getONEROUS_CONS_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val") && key.getONEROUS_CONS_FLG_val() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_val", key.getONEROUS_CONS_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd") && key.getc_NoCheckClasificationCd() != null) {
					msgKey.setKeyValue("c_NoCheckClasificationCd", key.getc_NoCheckClasificationCd());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_CD") && key.getl_PROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("l_PROC_COST_CLS_CD", key.getl_PROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_NAME") && key.getl_PROC_COST_CLS_NAME() != null) {
					msgKey.setKeyValue("l_PROC_COST_CLS_NAME", key.getl_PROC_COST_CLS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CLASIFICATION_CD") && key.getl_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("l_CLASIFICATION_CD", key.getl_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ONEROUS_CONS_FLG_DN") && key.getl_ONEROUS_CONS_FLG_DN() != null) {
					msgKey.setKeyValue("l_ONEROUS_CONS_FLG_DN", key.getl_ONEROUS_CONS_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT") && key.getl_HOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_HOME_CUR_UNIT", key.getl_HOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_01") && key.getl_PROC_COST_01() != null) {
					msgKey.setKeyValue("l_PROC_COST_01", key.getl_PROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_02") && key.getl_PROC_COST_02() != null) {
					msgKey.setKeyValue("l_PROC_COST_02", key.getl_PROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_03") && key.getl_PROC_COST_03() != null) {
					msgKey.setKeyValue("l_PROC_COST_03", key.getl_PROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_04") && key.getl_PROC_COST_04() != null) {
					msgKey.setKeyValue("l_PROC_COST_04", key.getl_PROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_05") && key.getl_PROC_COST_05() != null) {
					msgKey.setKeyValue("l_PROC_COST_05", key.getl_PROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_06") && key.getl_PROC_COST_06() != null) {
					msgKey.setKeyValue("l_PROC_COST_06", key.getl_PROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_07") && key.getl_PROC_COST_07() != null) {
					msgKey.setKeyValue("l_PROC_COST_07", key.getl_PROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_08") && key.getl_PROC_COST_08() != null) {
					msgKey.setKeyValue("l_PROC_COST_08", key.getl_PROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_09") && key.getl_PROC_COST_09() != null) {
					msgKey.setKeyValue("l_PROC_COST_09", key.getl_PROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_10") && key.getl_PROC_COST_10() != null) {
					msgKey.setKeyValue("l_PROC_COST_10", key.getl_PROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_11") && key.getl_PROC_COST_11() != null) {
					msgKey.setKeyValue("l_PROC_COST_11", key.getl_PROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_12") && key.getl_PROC_COST_12() != null) {
					msgKey.setKeyValue("l_PROC_COST_12", key.getl_PROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_SUM") && key.getl_PROC_COST_SUM() != null) {
					msgKey.setKeyValue("l_PROC_COST_SUM", key.getl_PROC_COST_SUM());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("YEAR") && key.getYEAR() != null) {
					msgKey.setKeyValue("YEAR", key.getYEAR());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP") && key.getHALF_TERM_TYP() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP", key.getHALF_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP") && key.getCOST_TYP() != null) {
					msgKey.setKeyValue("COST_TYP", key.getCOST_TYP());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD") && key.getPROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_CD", key.getPROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME") && key.getPROC_COST_CLS_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_NAME", key.getPROC_COST_CLS_NAME());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG") && key.getONEROUS_CONS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG", key.getONEROUS_CONS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY") && key.getPROC_COST_UNIT_QTY() != null) {
					msgKey.setKeyValue("PROC_COST_UNIT_QTY", key.getPROC_COST_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_01") && key.getPROC_COST_01() != null) {
					msgKey.setKeyValue("PROC_COST_01", key.getPROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_02") && key.getPROC_COST_02() != null) {
					msgKey.setKeyValue("PROC_COST_02", key.getPROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_03") && key.getPROC_COST_03() != null) {
					msgKey.setKeyValue("PROC_COST_03", key.getPROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_04") && key.getPROC_COST_04() != null) {
					msgKey.setKeyValue("PROC_COST_04", key.getPROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_05") && key.getPROC_COST_05() != null) {
					msgKey.setKeyValue("PROC_COST_05", key.getPROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_06") && key.getPROC_COST_06() != null) {
					msgKey.setKeyValue("PROC_COST_06", key.getPROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_07") && key.getPROC_COST_07() != null) {
					msgKey.setKeyValue("PROC_COST_07", key.getPROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_08") && key.getPROC_COST_08() != null) {
					msgKey.setKeyValue("PROC_COST_08", key.getPROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_09") && key.getPROC_COST_09() != null) {
					msgKey.setKeyValue("PROC_COST_09", key.getPROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_10") && key.getPROC_COST_10() != null) {
					msgKey.setKeyValue("PROC_COST_10", key.getPROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_11") && key.getPROC_COST_11() != null) {
					msgKey.setKeyValue("PROC_COST_11", key.getPROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_12") && key.getPROC_COST_12() != null) {
					msgKey.setKeyValue("PROC_COST_12", key.getPROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_SUM") && key.getPROC_COST_SUM() != null) {
					msgKey.setKeyValue("PROC_COST_SUM", key.getPROC_COST_SUM());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_01_NAME") && key.getPROC_COST_01_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_01_NAME", key.getPROC_COST_01_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_02_NAME") && key.getPROC_COST_02_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_02_NAME", key.getPROC_COST_02_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_03_NAME") && key.getPROC_COST_03_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_03_NAME", key.getPROC_COST_03_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_04_NAME") && key.getPROC_COST_04_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_04_NAME", key.getPROC_COST_04_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_05_NAME") && key.getPROC_COST_05_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_05_NAME", key.getPROC_COST_05_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_06_NAME") && key.getPROC_COST_06_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_06_NAME", key.getPROC_COST_06_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_07_NAME") && key.getPROC_COST_07_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_07_NAME", key.getPROC_COST_07_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_08_NAME") && key.getPROC_COST_08_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_08_NAME", key.getPROC_COST_08_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_09_NAME") && key.getPROC_COST_09_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_09_NAME", key.getPROC_COST_09_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_10_NAME") && key.getPROC_COST_10_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_10_NAME", key.getPROC_COST_10_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_11_NAME") && key.getPROC_COST_11_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_11_NAME", key.getPROC_COST_11_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_12_NAME") && key.getPROC_COST_12_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_12_NAME", key.getPROC_COST_12_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_YEAR") && key.getCURRENT_YEAR() != null) {
					msgKey.setKeyValue("CURRENT_YEAR", key.getCURRENT_YEAR());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_NAME") && key.getCS_PROC_NAME() != null) {
					msgKey.setKeyValue("CS_PROC_NAME", key.getCS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					DA0040010Struct key = new DA0040010Struct();
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name")) {
						key.setHALF_TERM_TYP_name(msgKey.getKeyValue("HALF_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val")) {
						key.setHALF_TERM_TYP_val(msgKey.getKeyValue("HALF_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_name")) {
						key.setCOST_TYP_name(msgKey.getKeyValue("COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_val")) {
						key.setCOST_TYP_val(msgKey.getKeyValue("COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN")) {
						key.setHALF_TERM_TYP_DN(msgKey.getKeyValue("HALF_TERM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_DN")) {
						key.setCOST_TYP_DN(msgKey.getKeyValue("COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name")) {
						key.setONEROUS_CONS_FLG_name(msgKey.getKeyValue("ONEROUS_CONS_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val")) {
						key.setONEROUS_CONS_FLG_val(msgKey.getKeyValue("ONEROUS_CONS_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd")) {
						key.setc_NoCheckClasificationCd(msgKey.getKeyValue("c_NoCheckClasificationCd"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_CD")) {
						key.setl_PROC_COST_CLS_CD(msgKey.getKeyValue("l_PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_NAME")) {
						key.setl_PROC_COST_CLS_NAME(msgKey.getKeyValue("l_PROC_COST_CLS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CLASIFICATION_CD")) {
						key.setl_CLASIFICATION_CD(msgKey.getKeyValue("l_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ONEROUS_CONS_FLG_DN")) {
						key.setl_ONEROUS_CONS_FLG_DN(msgKey.getKeyValue("l_ONEROUS_CONS_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT")) {
						key.setl_HOME_CUR_UNIT(msgKey.getKeyValue("l_HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_01")) {
						key.setl_PROC_COST_01(msgKey.getKeyValue("l_PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_02")) {
						key.setl_PROC_COST_02(msgKey.getKeyValue("l_PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_03")) {
						key.setl_PROC_COST_03(msgKey.getKeyValue("l_PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_04")) {
						key.setl_PROC_COST_04(msgKey.getKeyValue("l_PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_05")) {
						key.setl_PROC_COST_05(msgKey.getKeyValue("l_PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_06")) {
						key.setl_PROC_COST_06(msgKey.getKeyValue("l_PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_07")) {
						key.setl_PROC_COST_07(msgKey.getKeyValue("l_PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_08")) {
						key.setl_PROC_COST_08(msgKey.getKeyValue("l_PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_09")) {
						key.setl_PROC_COST_09(msgKey.getKeyValue("l_PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_10")) {
						key.setl_PROC_COST_10(msgKey.getKeyValue("l_PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_11")) {
						key.setl_PROC_COST_11(msgKey.getKeyValue("l_PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_12")) {
						key.setl_PROC_COST_12(msgKey.getKeyValue("l_PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_SUM")) {
						key.setl_PROC_COST_SUM(msgKey.getKeyValue("l_PROC_COST_SUM"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("YEAR")) {
						key.setYEAR(msgKey.getKeyValue("YEAR"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP")) {
						key.setHALF_TERM_TYP(msgKey.getKeyValue("HALF_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP")) {
						key.setCOST_TYP(msgKey.getKeyValue("COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD")) {
						key.setPROC_COST_CLS_CD(msgKey.getKeyValue("PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME")) {
						key.setPROC_COST_CLS_NAME(msgKey.getKeyValue("PROC_COST_CLS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG")) {
						key.setONEROUS_CONS_FLG(msgKey.getKeyValue("ONEROUS_CONS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY")) {
						key.setPROC_COST_UNIT_QTY(msgKey.getKeyValue("PROC_COST_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_01")) {
						key.setPROC_COST_01(msgKey.getKeyValue("PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_02")) {
						key.setPROC_COST_02(msgKey.getKeyValue("PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_03")) {
						key.setPROC_COST_03(msgKey.getKeyValue("PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_04")) {
						key.setPROC_COST_04(msgKey.getKeyValue("PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_05")) {
						key.setPROC_COST_05(msgKey.getKeyValue("PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_06")) {
						key.setPROC_COST_06(msgKey.getKeyValue("PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_07")) {
						key.setPROC_COST_07(msgKey.getKeyValue("PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_08")) {
						key.setPROC_COST_08(msgKey.getKeyValue("PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_09")) {
						key.setPROC_COST_09(msgKey.getKeyValue("PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_10")) {
						key.setPROC_COST_10(msgKey.getKeyValue("PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_11")) {
						key.setPROC_COST_11(msgKey.getKeyValue("PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_12")) {
						key.setPROC_COST_12(msgKey.getKeyValue("PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_SUM")) {
						key.setPROC_COST_SUM(msgKey.getKeyValue("PROC_COST_SUM"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_01_NAME")) {
						key.setPROC_COST_01_NAME(msgKey.getKeyValue("PROC_COST_01_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_02_NAME")) {
						key.setPROC_COST_02_NAME(msgKey.getKeyValue("PROC_COST_02_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_03_NAME")) {
						key.setPROC_COST_03_NAME(msgKey.getKeyValue("PROC_COST_03_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_04_NAME")) {
						key.setPROC_COST_04_NAME(msgKey.getKeyValue("PROC_COST_04_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_05_NAME")) {
						key.setPROC_COST_05_NAME(msgKey.getKeyValue("PROC_COST_05_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_06_NAME")) {
						key.setPROC_COST_06_NAME(msgKey.getKeyValue("PROC_COST_06_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_07_NAME")) {
						key.setPROC_COST_07_NAME(msgKey.getKeyValue("PROC_COST_07_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_08_NAME")) {
						key.setPROC_COST_08_NAME(msgKey.getKeyValue("PROC_COST_08_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_09_NAME")) {
						key.setPROC_COST_09_NAME(msgKey.getKeyValue("PROC_COST_09_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_10_NAME")) {
						key.setPROC_COST_10_NAME(msgKey.getKeyValue("PROC_COST_10_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_11_NAME")) {
						key.setPROC_COST_11_NAME(msgKey.getKeyValue("PROC_COST_11_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_12_NAME")) {
						key.setPROC_COST_12_NAME(msgKey.getKeyValue("PROC_COST_12_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_YEAR")) {
						key.setCURRENT_YEAR(msgKey.getKeyValue("CURRENT_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_NAME")) {
						key.setCS_PROC_NAME(msgKey.getKeyValue("CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
