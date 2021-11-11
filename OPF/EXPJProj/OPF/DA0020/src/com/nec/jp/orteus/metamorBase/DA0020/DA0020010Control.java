/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0020/src/com/nec/jp/orteus/metamorBase/DA0020/DA0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0020;

import com.nec.jp.orteus.metamorBase.DA0020.*;
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

public class DA0020010Control
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
        public DA0020010Struct getListvalue(int x) {
         return (DA0020010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public DA0020010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public DA0020010Struct createStruct() {
         return new DA0020010Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((DA0020010Struct) structname);
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
        /** �M�݃R�[�h */
        private String _homeCurCd;
       
        /** ���O�C�����[�U�̍H��R�[�h���L�[�Ɍ�������[�����Ǘ��p�����[�^]�f�[�^�I�u�W�F�N�g�i��ʏ������Ɏg�p�j */
        private DA0020010Struct _mySysCostCtrl;
       
        /** ������敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _halfTermTypComboStruct = new ComboStruct();
        /** �������ʣ�R���{�{�b�N�X�f�[�^ */
        private ComboStruct _costTypComboStruct = new ComboStruct();
        /** ��P���敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _unitCostTypComboStruct = new ComboStruct();
        /** ��P���̗p�敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _unitCostAcceptTypComboStruct = new ComboStruct();
        /** ��w���i�P����ʣ�R���{�{�b�N�X�f�[�^ */
        private ComboStruct _csPuchTypComboStruct = new ComboStruct();
        /** ��L���x���敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _onerousConsFlgComboStruct = new ComboStruct();
       
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
        private void setStruct(DA0020010Struct s) {
         struct.seth_PLANT_CD(struct.getPLANT_CD());
         struct.seth_YEAR(struct.getYEAR());
         struct.seth_HALF_TERM_TYP(struct.getHALF_TERM_TYP());
         struct.seth_COST_TYP(struct.getCOST_TYP());
         struct.seth_ITEM_CD(struct.getITEM_CD());
       
         struct.setCS_PUCH_TYP(s.getCS_PUCH_TYP());
         struct.setCS_PROC_CD(s.getCS_PROC_CD());
         struct.setCS_PROC_NAME(s.getCS_PROC_NAME());
         struct.setUNIT_COST_ACCEPT_TYP(s.getUNIT_COST_ACCEPT_TYP());
         struct.setCLASIFICATION_CD(s.getCLASIFICATION_CD());
         struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
         struct.setCOMPANY_CD(s.getCOMPANY_CD());
         struct.setORG_CD(s.getORG_CD());
         struct.setORG_NAME(s.getORG_NAME());
         struct.setONEROUS_CONS_FLG(s.getONEROUS_CONS_FLG());
         struct.setVEND_CD(s.getVEND_CD());
         struct.setVEND_NAME(s.getVEND_NAME());
         struct.setUNIT_COST(s.getUNIT_COST());
         struct.setCUR_UNIT(s.getCUR_UNIT());
         struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());
         struct.setPUCH_UNIT_QTY(s.getPUCH_UNIT_QTY());
         struct.setCUR_CD(s.getCUR_CD());
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setEXCH_RATE(s.getEXCH_RATE());
         struct.setSUB_VEND_CD(s.getSUB_VEND_CD());
         struct.setSUB_VEND_NAME(s.getSUB_VEND_NAME());
         struct.setSUB_UNIT_COST(s.getSUB_UNIT_COST());
         struct.setSUB_CUR_UNIT(s.getSUB_CUR_UNIT());
         struct.setSUB_UNIT_COST_TYP(s.getSUB_UNIT_COST_TYP());
         struct.setSUB_PUCH_UNIT_QTY(s.getSUB_PUCH_UNIT_QTY());
         struct.setSUB_CUR_CD(s.getSUB_CUR_CD());
         struct.setSUB_CUR_NAME(s.getSUB_CUR_NAME());
         struct.setSUB_EXCH_RATE(s.getSUB_EXCH_RATE());
         struct.setDEL_FLG(s.getDEL_FLG());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
       
         struct.seth_CS_PUCH_TYP(s.getCS_PUCH_TYP());
       
         struct.setc_NoCheckClasificationCd("true");
         struct.setc_NoCheckStockUnit("true");
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setPLANT_NAME(null);
         struct.setYEAR(_mySysCostCtrl.getCURRENT_YEAR());
         struct.setHALF_TERM_TYP(_mySysCostCtrl.getHALF_TERM_TYP());
         struct.setCOST_TYP("1");
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setCS_PROC_CD("*");
       
         struct.seth_PLANT_CD(null);
         struct.seth_YEAR(null);
         struct.seth_HALF_TERM_TYP(null);
         struct.seth_COST_TYP(null);
         struct.seth_ITEM_CD(null);
       
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
         struct.setCS_PUCH_TYP(null);
         struct.setCS_PROC_CD(null);
         struct.setCS_PROC_NAME(null);
         struct.setUNIT_COST_ACCEPT_TYP(null);
         struct.setCLASIFICATION_CD(null);
         struct.setSTOCK_UNIT(null);
         struct.setCOMPANY_CD(_companyCd);
         struct.setORG_CD(null);
         struct.setORG_NAME(null);
         struct.setONEROUS_CONS_FLG(null);
         struct.setVEND_CD(null);
         struct.setVEND_NAME(null);
         struct.setUNIT_COST("0");
         struct.setCUR_UNIT(null);
         struct.setUNIT_COST_TYP("1");
         struct.setPUCH_UNIT_QTY("1");
         struct.setCUR_CD(null);
         struct.setCUR_NAME(null);
         struct.setEXCH_RATE("1");
         struct.setSUB_VEND_CD(null);
         struct.setSUB_VEND_NAME(null);
         struct.setSUB_UNIT_COST("0");
         struct.setSUB_CUR_UNIT(null);
         struct.setSUB_UNIT_COST_TYP("1");
         struct.setSUB_PUCH_UNIT_QTY("1");
         struct.setSUB_CUR_CD(null);
         struct.setSUB_CUR_NAME(null);
         struct.setSUB_EXCH_RATE("1");
         struct.setDEL_FLG(null);
         struct.setMODIFY_COUNT(null);
         
         struct.setc_NoCheckClasificationCd("true");
         struct.setc_NoCheckStockUnit("true");
       
         list = null;
       
         readStatus = INITIAL;
        }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // �L�[�ȊO�̍��ڂ�������
                 initializeDetail();
              
                 // �Ɩ��^�p�����擾
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00003");
                  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  struct.setBUSINESS_OPR_DATE(businessOprDate);
                 }
              
                 // �L�[�ɑ΂��閼�̍��ڂ�����
                 // �H�ꖼ
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DA0020010Struct mPlantStruct = (DA0020010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // �i�ږ�
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                  struct.setITEM_NAME(null);
                 } else {
                  DA0020010Struct mItemStruct = (DA0020010Struct) mItemList.get(0);
                  struct.setITEM_NAME(mItemStruct.getITEM_NAME());
                 }
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // ���׏�������
                 List formList = entity.mForm.read(conn, struct);
                 // ���׏�񂪑��݂��Ȃ��ꍇ�̓G���[
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  return;
                 }
              
                 // �f�[�^���擾
                 DA0020010Struct formStruct = (DA0020010Struct) formList.get(0);
              
                 if ("1".equals(formStruct.getDEL_FLG())) {
                  setWarningMessage("DA00006");
                 }
              
                 // ��ʂɕ\��
                 setStruct(formStruct);
              
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // �o�^����L�[��[�w���i�}�X�^]������
                 List mCsPuchList = entity.mM_CS_PUCH.read(conn, struct);
                 // �o�^�f�[�^�����łɑ��݂���ꍇ�̓G���[
                 if (!mCsPuchList.isEmpty()) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
              
                 // �Ɩ��^�p�����擾
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00003");
                  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  struct.setBUSINESS_OPR_DATE(businessOprDate);
                 }
              
                 // [�H��}�X�^]���݃`�F�b�N
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [�i�ڃ}�X�^]���݃`�F�b�N
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 }
                 // ��H���R�[�h������͂��ꂽ�ꍇ�A�ȉ��̃`�F�b�N���s��
                 if (struct.getCS_PROC_CD() != null && struct.getCS_PROC_CD().length() != 0) {
                  // [�H���}�X�^]���݃`�F�b�N
                  List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                  if (mCsProcList.isEmpty()) {
                   setErrorMessage("DA00001");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // �����R�[�h������͂��ꂽ�ꍇ�A�ȉ��̃`�F�b�N���s��
                 if (struct.getORG_CD() != null && struct.getORG_CD().length() != 0) {
                  // [����}�X�^]���݂��Ȃ��ꍇ�̓G���[
                  List mOrgList = entity.mM_ORG.read(conn, struct);
                  if (mOrgList.isEmpty()) {
                   setErrorMessage("ZZ11010");
                   setErrorParameter("M_ORG", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_ORG", "ORG_CD", struct.getVEND_CD());
                  }
                 }
                 // [�����}�X�^]���݃`�F�b�N�i�������R�[�h�j
                 List mVendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                 if (mVendCtrlList.isEmpty()) {
                  setErrorMessage("ZZ11005");
                  setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
                  setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                 }
                 // �����ʉ݃R�[�h������͂���Ă��Ȃ��ꍇ
                 if (struct.getCUR_CD() == null || struct.getCUR_CD().length() == 0) {
                  // ��ʉ݃R�[�h���[�����}�X�^]."����ʉ݃R�[�h"��ݒ肷��B
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   // [�����}�X�^]."����ʉ݃R�[�h"��null�̏ꍇ��[�M�݃}�X�^]."�M�݃R�[�h"��ݒ肷��B
                   if (mVendCtrlStruct.getCUR_CD() == null) {
                    struct.setCUR_CD(_homeCurCd);
                   } else {
                    struct.setCUR_CD(mVendCtrlStruct.getCUR_CD());
                   }
                  }
                 }
                 // [�ʉ݃}�X�^]���݃`�F�b�N�i���ʉ݃R�[�h�j
                 List mCurList = entity.mM_CUR.read(conn, struct);
                 if (mCurList.isEmpty()) {
                  setErrorMessage("DA02001");
                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
                 }
              
                 // ��בփ��[�g���0�̏ꍇ��[�בփ��[�g�}�X�^]."�בփ��[�g"��ݒ肷��B
                 if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   struct.setEXCH_TYP(mVendCtrlStruct.getEXCH_TYP());
              
                   List mExchRateList = entity.mM_EXCH_RATE.read(conn, struct);
                   if (mExchRateList.isEmpty()) {
                    setErrorMessage("DA02002");
                    setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                   } else {
                    DA0020010Struct mExchRateStruct = (DA0020010Struct) mExchRateList.get(0);
                    struct.setEXCH_RATE(mExchRateStruct.getEXCH_RATE());
                   }
                  }
                 }
                 // ��������R�[�h������͂��ꂽ�ꍇ�A�ȉ��̃`�F�b�N���s��
                 if (struct.getSUB_VEND_CD() != null && struct.getSUB_VEND_CD().length() != 0) {
                  // [�����}�X�^]���݃`�F�b�N�i�������R�[�h�j
                  List mVendCtrlSubList = entity.mM_VEND_CTRL_Sub.read(conn, struct);
                  if (mVendCtrlSubList.isEmpty()) {
                   setErrorMessage("DA02003");
                   setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getSUB_VEND_CD());
                  }
                  // �����ʉ݃R�[�h������͂���Ă��Ȃ��ꍇ
                  if (struct.getSUB_CUR_CD() == null || struct.getSUB_CUR_CD().length() == 0) {
                   // ��ʉ݃R�[�h���[�����}�X�^]."����ʉ݃R�[�h"��ݒ肷��B
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    // [�����}�X�^]."����ʉ݃R�[�h"��null�̏ꍇ��[�M�݃}�X�^]."�M�݃R�[�h"��ݒ肷��B
                    if (mVendCtrlSubStruct.getSUB_CUR_CD() == null) {
                     struct.setSUB_CUR_CD(_homeCurCd);
                    } else {
                     struct.setSUB_CUR_CD(mVendCtrlSubStruct.getSUB_CUR_CD());
                    }
                   }
                  }
                  // [�ʉ݃}�X�^]���݃`�F�b�N�i���ʉ݃R�[�h�j
                  List mCurSubList = entity.mM_CUR_Sub.read(conn, struct);
                  if (mCurSubList.isEmpty()) {
                   setErrorMessage("DA02004");
                   setErrorParameter("M_CUR", "CUR_CD", struct.getSUB_CUR_CD());
                  }
                  // ��בփ��[�g���0�̏ꍇ��[�בփ��[�g�}�X�^]."�בփ��[�g"��ݒ肷��B
                  if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    struct.setSUB_EXCH_TYP(mVendCtrlSubStruct.getSUB_EXCH_TYP());
              
                    List mExchRateSubList = entity.mM_EXCH_RATE_Sub.read(conn, struct);
                    if (mExchRateSubList.isEmpty()) {
                     setErrorMessage("DA02005");
                     setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                    } else {
                     DA0020010Struct mExchRateSubStruct =
                      (DA0020010Struct) mExchRateSubList.get(0);
                     struct.setSUB_EXCH_RATE(mExchRateSubStruct.getSUB_EXCH_RATE());
                    }
                   }
                  }
                 } else {
                  // ��������R�[�h������͂���Ă��Ȃ��ꍇ�͂��ׂĂ̑��XX���ڂɏ����l��ݒ肷��B
                  struct.setSUB_UNIT_COST("0");
                  struct.setSUB_UNIT_COST_TYP("1");
                  struct.setSUB_PUCH_UNIT_QTY("1");
                  struct.setSUB_CUR_CD(null);
                  struct.setSUB_EXCH_RATE("1");
                 }
              
                 // �i�ڃ}�X�^���݃`�F�b�N�ŃG���[�ɂȂ�Ȃ������ꍇ�͈ȉ��̏������s���B
                 if (!mItemList.isEmpty()) {
                  // [�i�ڃ}�X�^]������
                  DA0020010Struct mItemStruct = (DA0020010Struct) mItemList.get(0);
              
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
                     setErrorMessage("DA02006");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
              
                  // ��v�ʒP�ʣ��NULL�`�F�b�N���s��
                  if (struct.getSTOCK_UNIT() == null || struct.getSTOCK_UNIT().length() == 0) {
                   // ��v�ʒP�ʣ=NULL�̏ꍇ�A[�i��]."�v�ʒP��"��ݒ肷��B
                   struct.setSTOCK_UNIT(mItemStruct.getSTOCK_UNIT());
                  } else {
                   // ��v�ʒP�ʣ!=NULL�̏ꍇ���A��i�ڏ��Ɣ�r���Ȃ��=off�̏ꍇ
                   if (!"true".equals(struct.getc_NoCheckStockUnit())) {
                    // ��v�ʒP�ʣ!=[�i��]."�v�ʒP��"�̏ꍇ�̓G���[
                    if (!struct.getSTOCK_UNIT().equals(mItemStruct.getSTOCK_UNIT())) {
                     setErrorMessage("DA02007");
                     setErrorParameter("M_ITEM", "STOCK_UNIT", mItemStruct.getSTOCK_UNIT());
                    }
                   }
                  }
                 }
              
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // �f�[�^��o�^
                 entity.mM_CS_PUCH.create(conn, struct);
              
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
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
                 // [�w���i�}�X�^]���݃`�F�b�N
                 List lockedList = entity.mM_CS_PUCH_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [�w���i�}�X�^]�X�V���`�F�b�N
                 DA0020010Struct lockedStruct = (DA0020010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PUCH", "MODIFY_COUNT", lockedStruct.getMODIFY_COUNT());
                  return;
                 }
                 // �Ɩ��^�p�����擾
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00003");
                  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  struct.setBUSINESS_OPR_DATE(businessOprDate);
                 }
                 // [�H��}�X�^]���݃`�F�b�N
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [�i�ڃ}�X�^]���݃`�F�b�N
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 }
                 // ��H���R�[�h������͂��ꂽ�ꍇ�A�ȉ��̃`�F�b�N���s��
                 if (struct.getCS_PROC_CD() != null && struct.getCS_PROC_CD().length() != 0) {
                  // [�H���}�X�^]���݃`�F�b�N
                  List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                  if (mCsProcList.isEmpty()) {
                   setErrorMessage("DA00001");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // �����R�[�h������͂��ꂽ�ꍇ�A�ȉ��̃`�F�b�N���s��
                 if (struct.getORG_CD() != null && struct.getORG_CD().length() != 0) {
                  // [����}�X�^]���݂��Ȃ��ꍇ�̓G���[
                  List mOrgList = entity.mM_ORG.read(conn, struct);
                  if (mOrgList.isEmpty()) {
                   setErrorMessage("ZZ11010");
                   setErrorParameter("M_ORG", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_ORG", "ORG_CD", struct.getVEND_CD());
                  }
                 }
                 // [�����}�X�^]���݃`�F�b�N�i�������R�[�h�j
                 List mVendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                 if (mVendCtrlList.isEmpty()) {
                  setErrorMessage("ZZ11005");
                  setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                 }
                 // �����ʉ݃R�[�h������͂���Ă��Ȃ��ꍇ
                 if (struct.getCUR_CD() == null || struct.getCUR_CD().length() == 0) {
                  // ��ʉ݃R�[�h���[�����}�X�^]."����ʉ݃R�[�h"��ݒ肷��B
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   // [�����}�X�^]."����ʉ݃R�[�h"��null�̏ꍇ��[�M�݃}�X�^]."�M�݃R�[�h"��ݒ肷��B
                   if (mVendCtrlStruct.getCUR_CD() == null) {
                    struct.setCUR_CD(_homeCurCd);
                   } else {
                    struct.setCUR_CD(mVendCtrlStruct.getCUR_CD());
                   }
                  }
                 }
                 // [�ʉ݃}�X�^]���݃`�F�b�N�i���ʉ݃R�[�h�j
                 List mCurList = entity.mM_CUR.read(conn, struct);
                 if (mCurList.isEmpty()) {
                  setErrorMessage("DA02001");
                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
                 }
              
                 // ��בփ��[�g���0�̏ꍇ��[�בփ��[�g�}�X�^]."�בփ��[�g"��ݒ肷��B
                 if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   struct.setEXCH_TYP(mVendCtrlStruct.getEXCH_TYP());
              
                   List mExchRateList = entity.mM_EXCH_RATE.read(conn, struct);
                   if (mExchRateList.isEmpty()) {
                    setErrorMessage("DA02002");
                    setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                   } else {
                    DA0020010Struct mExchRateStruct = (DA0020010Struct) mExchRateList.get(0);
                    struct.setEXCH_RATE(mExchRateStruct.getEXCH_RATE());
                   }
                  }
                 }
                 // ��������R�[�h������͂��ꂽ�ꍇ�A�ȉ��̃`�F�b�N���s��
                 if (struct.getSUB_VEND_CD() != null && struct.getSUB_VEND_CD().length() != 0) {
                  // [�����}�X�^]���݃`�F�b�N�i�������R�[�h�j
                  List mVendCtrlSubList = entity.mM_VEND_CTRL_Sub.read(conn, struct);
                  if (mVendCtrlSubList.isEmpty()) {
                   setErrorMessage("DA02003");
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getSUB_VEND_CD());
                  }
                  // �����ʉ݃R�[�h������͂���Ă��Ȃ��ꍇ
                  if (struct.getSUB_CUR_CD() == null || struct.getSUB_CUR_CD().length() == 0) {
                   // ��ʉ݃R�[�h���[�����}�X�^]."����ʉ݃R�[�h"��ݒ肷��B
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    // [�����}�X�^]."����ʉ݃R�[�h"��null�̏ꍇ��[�M�݃}�X�^]."�M�݃R�[�h"��ݒ肷��B
                    if (mVendCtrlSubStruct.getSUB_CUR_CD() == null) {
                     struct.setSUB_CUR_CD(_homeCurCd);
                    } else {
                     struct.setSUB_CUR_CD(mVendCtrlSubStruct.getSUB_CUR_CD());
                    }
                   }
                  }
                  // [�ʉ݃}�X�^]���݃`�F�b�N�i���ʉ݃R�[�h�j
                  List mCurSubList = entity.mM_CUR_Sub.read(conn, struct);
                  if (mCurSubList.isEmpty()) {
                   setErrorMessage("DA02004");
                   setErrorParameter("M_CUR", "CUR_CD", struct.getSUB_CUR_CD());
                  }
                  // ��בփ��[�g���0�̏ꍇ��[�בփ��[�g�}�X�^]."�בփ��[�g"��ݒ肷��B
                  if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    struct.setSUB_EXCH_TYP(mVendCtrlSubStruct.getSUB_EXCH_TYP());
              
                    List mExchRateSubList = entity.mM_EXCH_RATE_Sub.read(conn, struct);
                    if (mExchRateSubList.isEmpty()) {
                     setErrorMessage("DA02005");
                     setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                    } else {
                     DA0020010Struct mExchRateSubStruct =
                      (DA0020010Struct) mExchRateSubList.get(0);
                     struct.setSUB_EXCH_RATE(mExchRateSubStruct.getSUB_EXCH_RATE());
                    }
                   }
                  }
                 } else {
                  struct.setSUB_UNIT_COST("0");
                  struct.setSUB_UNIT_COST_TYP("1");
                  struct.setSUB_PUCH_UNIT_QTY("1");
                  struct.setSUB_CUR_CD(null);
                  struct.setSUB_EXCH_RATE("1");
                 }
              
                 if (!mItemList.isEmpty()) {
                  DA0020010Struct mItemStruct = (DA0020010Struct) mItemList.get(0);
                  if (struct.getCLASIFICATION_CD() == null
                   || struct.getCLASIFICATION_CD().length() == 0) {
                   struct.setCLASIFICATION_CD(mItemStruct.getCLASIFICATION_CD());
                  } else {
                   if (!"true".equals(struct.getc_NoCheckClasificationCd())) {
                    if (!struct
                     .getCLASIFICATION_CD()
                     .equals(mItemStruct.getCLASIFICATION_CD())) {
                     setErrorMessage("DA02006");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
              
                  if (struct.getSTOCK_UNIT() == null || struct.getSTOCK_UNIT().length() == 0) {
                   struct.setSTOCK_UNIT(mItemStruct.getSTOCK_UNIT());
                  } else {
                   if (!"true".equals(struct.getc_NoCheckStockUnit())) {
                    if (!struct.getSTOCK_UNIT().equals(mItemStruct.getSTOCK_UNIT())) {
                     setErrorMessage("DA02007");
                     setErrorParameter("M_ITEM", "STOCK_UNIT", mItemStruct.getSTOCK_UNIT());
                    }
                   }
                  }
                 }
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // DB���X�V
                 entity.mM_CS_PUCH.update(conn, struct);
              
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
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
                try {
                 // [�w���i�}�X�^]���݃`�F�b�N
                 List lockedList = entity.mM_CS_PUCH_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [�w���i�}�X�^]�X�V���`�F�b�N
                 DA0020010Struct lockedStruct = (DA0020010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PUCH", "MODIFY_COUNT", lockedStruct.getMODIFY_COUNT());
                  return;
                 }
              
                 // [�w���i�}�X�^]���X�V�i�_���폜�j
                 entity.mM_CS_PUCH_Delete.update(conn, struct);
              
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
                //}}user_implement_dev:<controlDelete>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �폜����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlCancelDelete");
			//{{user_implement_dev:<controlCancelDelete>
                try {
                 // [�w���i�}�X�^]���݃`�F�b�N
                 List lockedList = entity.mM_CS_PUCH_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [�w���i�}�X�^]�X�V���`�F�b�N
                 DA0020010Struct lockedStruct = (DA0020010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PUCH", "MODIFY_COUNT", lockedStruct.getMODIFY_COUNT());
                  return;
                 }
              
                 // [�w���i�}�X�^]���X�V�i�폜����j
                 entity.mM_CS_PUCH_CancelDelete.update(conn, struct);
              
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
                //}}user_implement_dev:<controlCancelDelete>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlCancelDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // ��ʂ�������
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // ���O�C�����[�U�̍H��R�[�h���L�[��[�����Ǘ��p�����[�^]���擾����i��ʏ������Ɏg�p�j
                 struct.setPLANT_CD(sysPLANT_CD);
                 List sysCostCtrlList = entity.mSYS_COST_CTRL.read(conn, struct);
                 // [�����Ǘ��p�����[�^]�����݂��Ȃ��ꍇ�̓G���[���b�Z�[�W��\��
                 if (sysCostCtrlList.isEmpty()) {
                  setErrorMessage("DA00005");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  _mySysCostCtrl = new DA0020010Struct();
                 } else {
                  _mySysCostCtrl = (DA0020010Struct) sysCostCtrlList.get(0);
                 }
              
                 // ��ЃR�[�h���擾
                 _companyCd = SystemInformation.getSysMyCompanyCd();
                 if (_companyCd == null) {
                  throw new ExpjException("DA00007");
                 }
                 // �M�݃R�[�h���擾
                 _homeCurCd = SystemInformation.getSysHomeCurCd();
                 if (_homeCurCd == null) {
                  throw new ExpjException("DA00007");
                 }
              
                 // �R���{�{�b�N�X�f�[�^���擾
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _halfTermTypComboStruct = comboBox.getData("HALF_TERM_TYP");
                 _costTypComboStruct = comboBox.getData("COST_TYP");
                 _unitCostTypComboStruct = comboBox.getData("UNIT_COST_TYP");
                 _unitCostAcceptTypComboStruct = comboBox.getData("UNIT_COST_ACCEPT_TYP");
                 _csPuchTypComboStruct = comboBox.getData("CS_PUCH_TYP");
                 _onerousConsFlgComboStruct = comboBox.getData("ONEROUS_CONS_FLG");
                 comboBox.setConnection(null);
                 // �R���{�{�b�N�X�f�[�^�̐ݒ�
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                 struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                 struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                 struct.setList_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                 struct.setList_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                 struct.setList_SUB_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                 struct.setList_SUB_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                 struct.setList_UNIT_COST_ACCEPT_TYP_val(_unitCostAcceptTypComboStruct.getValList());
                 struct.setList_UNIT_COST_ACCEPT_TYP_name(_unitCostAcceptTypComboStruct.getExplanList());
                 struct.setList_CS_PUCH_TYP_val(_csPuchTypComboStruct.getValList());
                 struct.setList_CS_PUCH_TYP_name(_csPuchTypComboStruct.getExplanList());
                 struct.setList_ONEROUS_CONS_FLG_val(_onerousConsFlgComboStruct.getValList());
                 struct.setList_ONEROUS_CONS_FLG_name(_onerousConsFlgComboStruct.getExplanList());
              
                 // ��ʂ�������
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                struct.setList_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                struct.setList_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                struct.setList_SUB_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                struct.setList_SUB_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                struct.setList_UNIT_COST_ACCEPT_TYP_val(_unitCostAcceptTypComboStruct.getValList());
                struct.setList_UNIT_COST_ACCEPT_TYP_name(_unitCostAcceptTypComboStruct.getExplanList());
                struct.setList_CS_PUCH_TYP_val(_csPuchTypComboStruct.getValList());
                struct.setList_CS_PUCH_TYP_name(_csPuchTypComboStruct.getExplanList());
                struct.setList_ONEROUS_CONS_FLG_val(_onerousConsFlgComboStruct.getValList());
                struct.setList_ONEROUS_CONS_FLG_name(_onerousConsFlgComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("CancelDelete") ) {
				controlCancelDelete();
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
//			throw new FoundationException("DA0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("DA0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("DA0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("DA0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected DA0020010Entity entity;
	protected DA0020010Struct struct;
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

		entity = new DA0020010Entity();
		struct = new DA0020010Struct();

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
	 * DA0020010�N���X�̕W���R���X�g���N�^
	 */
	public DA0020010Control() throws BusinessProcessException, FoundationException
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
				DA0020010Struct key = (DA0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CS_PUCH_TYP") && key.getCS_PUCH_TYP() != null) {
					msgKey.setKeyValue("CS_PUCH_TYP", key.getCS_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_NAME") && key.getCS_PROC_NAME() != null) {
					msgKey.setKeyValue("CS_PROC_NAME", key.getCS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP") && key.getUNIT_COST_ACCEPT_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_ACCEPT_TYP", key.getUNIT_COST_ACCEPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG") && key.getONEROUS_CONS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG", key.getONEROUS_CONS_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_UNIT_QTY") && key.getPUCH_UNIT_QTY() != null) {
					msgKey.setKeyValue("PUCH_UNIT_QTY", key.getPUCH_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("SUB_VEND_CD") && key.getSUB_VEND_CD() != null) {
					msgKey.setKeyValue("SUB_VEND_CD", key.getSUB_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_VEND_NAME") && key.getSUB_VEND_NAME() != null) {
					msgKey.setKeyValue("SUB_VEND_NAME", key.getSUB_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST") && key.getSUB_UNIT_COST() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST", key.getSUB_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("SUB_CUR_UNIT") && key.getSUB_CUR_UNIT() != null) {
					msgKey.setKeyValue("SUB_CUR_UNIT", key.getSUB_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP") && key.getSUB_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST_TYP", key.getSUB_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("SUB_PUCH_UNIT_QTY") && key.getSUB_PUCH_UNIT_QTY() != null) {
					msgKey.setKeyValue("SUB_PUCH_UNIT_QTY", key.getSUB_PUCH_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUB_CUR_CD") && key.getSUB_CUR_CD() != null) {
					msgKey.setKeyValue("SUB_CUR_CD", key.getSUB_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_CUR_NAME") && key.getSUB_CUR_NAME() != null) {
					msgKey.setKeyValue("SUB_CUR_NAME", key.getSUB_CUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUB_EXCH_RATE") && key.getSUB_EXCH_RATE() != null) {
					msgKey.setKeyValue("SUB_EXCH_RATE", key.getSUB_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_YEAR") && key.getCURRENT_YEAR() != null) {
					msgKey.setKeyValue("CURRENT_YEAR", key.getCURRENT_YEAR());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB_EXCH_TYP") && key.getSUB_EXCH_TYP() != null) {
					msgKey.setKeyValue("SUB_EXCH_TYP", key.getSUB_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_YEAR") && key.geth_YEAR() != null) {
					msgKey.setKeyValue("h_YEAR", key.geth_YEAR());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name") && key.getHALF_TERM_TYP_name() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_name", key.getHALF_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val") && key.getHALF_TERM_TYP_val() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_val", key.getHALF_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_HALF_TERM_TYP") && key.geth_HALF_TERM_TYP() != null) {
					msgKey.setKeyValue("h_HALF_TERM_TYP", key.geth_HALF_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_name") && key.getCOST_TYP_name() != null) {
					msgKey.setKeyValue("COST_TYP_name", key.getCOST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_val") && key.getCOST_TYP_val() != null) {
					msgKey.setKeyValue("COST_TYP_val", key.getCOST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_COST_TYP") && key.geth_COST_TYP() != null) {
					msgKey.setKeyValue("h_COST_TYP", key.geth_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_name") && key.getCS_PUCH_TYP_name() != null) {
					msgKey.setKeyValue("CS_PUCH_TYP_name", key.getCS_PUCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_val") && key.getCS_PUCH_TYP_val() != null) {
					msgKey.setKeyValue("CS_PUCH_TYP_val", key.getCS_PUCH_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_CS_PUCH_TYP") && key.geth_CS_PUCH_TYP() != null) {
					msgKey.setKeyValue("h_CS_PUCH_TYP", key.geth_CS_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_name") && key.getUNIT_COST_ACCEPT_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_ACCEPT_TYP_name", key.getUNIT_COST_ACCEPT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_val") && key.getUNIT_COST_ACCEPT_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_ACCEPT_TYP_val", key.getUNIT_COST_ACCEPT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name") && key.getONEROUS_CONS_FLG_name() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_name", key.getONEROUS_CONS_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val") && key.getONEROUS_CONS_FLG_val() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_val", key.getONEROUS_CONS_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_name") && key.getSUB_UNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST_TYP_name", key.getSUB_UNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_val") && key.getSUB_UNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST_TYP_val", key.getSUB_UNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd") && key.getc_NoCheckClasificationCd() != null) {
					msgKey.setKeyValue("c_NoCheckClasificationCd", key.getc_NoCheckClasificationCd());
				}
				if(msgKeyType.containsKeyColumn("c_NoCheckStockUnit") && key.getc_NoCheckStockUnit() != null) {
					msgKey.setKeyValue("c_NoCheckStockUnit", key.getc_NoCheckStockUnit());
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
					DA0020010Struct key = new DA0020010Struct();
					if(msgKeyType.containsKeyColumn("CS_PUCH_TYP")) {
						key.setCS_PUCH_TYP(msgKey.getKeyValue("CS_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_NAME")) {
						key.setCS_PROC_NAME(msgKey.getKeyValue("CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP")) {
						key.setUNIT_COST_ACCEPT_TYP(msgKey.getKeyValue("UNIT_COST_ACCEPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG")) {
						key.setONEROUS_CONS_FLG(msgKey.getKeyValue("ONEROUS_CONS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_UNIT_QTY")) {
						key.setPUCH_UNIT_QTY(msgKey.getKeyValue("PUCH_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB_VEND_CD")) {
						key.setSUB_VEND_CD(msgKey.getKeyValue("SUB_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_VEND_NAME")) {
						key.setSUB_VEND_NAME(msgKey.getKeyValue("SUB_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST")) {
						key.setSUB_UNIT_COST(msgKey.getKeyValue("SUB_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("SUB_CUR_UNIT")) {
						key.setSUB_CUR_UNIT(msgKey.getKeyValue("SUB_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP")) {
						key.setSUB_UNIT_COST_TYP(msgKey.getKeyValue("SUB_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SUB_PUCH_UNIT_QTY")) {
						key.setSUB_PUCH_UNIT_QTY(msgKey.getKeyValue("SUB_PUCH_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUB_CUR_CD")) {
						key.setSUB_CUR_CD(msgKey.getKeyValue("SUB_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_CUR_NAME")) {
						key.setSUB_CUR_NAME(msgKey.getKeyValue("SUB_CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUB_EXCH_RATE")) {
						key.setSUB_EXCH_RATE(msgKey.getKeyValue("SUB_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_YEAR")) {
						key.setCURRENT_YEAR(msgKey.getKeyValue("CURRENT_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB_EXCH_TYP")) {
						key.setSUB_EXCH_TYP(msgKey.getKeyValue("SUB_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_YEAR")) {
						key.seth_YEAR(msgKey.getKeyValue("h_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name")) {
						key.setHALF_TERM_TYP_name(msgKey.getKeyValue("HALF_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val")) {
						key.setHALF_TERM_TYP_val(msgKey.getKeyValue("HALF_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_HALF_TERM_TYP")) {
						key.seth_HALF_TERM_TYP(msgKey.getKeyValue("h_HALF_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_name")) {
						key.setCOST_TYP_name(msgKey.getKeyValue("COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_val")) {
						key.setCOST_TYP_val(msgKey.getKeyValue("COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_COST_TYP")) {
						key.seth_COST_TYP(msgKey.getKeyValue("h_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_name")) {
						key.setCS_PUCH_TYP_name(msgKey.getKeyValue("CS_PUCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_val")) {
						key.setCS_PUCH_TYP_val(msgKey.getKeyValue("CS_PUCH_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_CS_PUCH_TYP")) {
						key.seth_CS_PUCH_TYP(msgKey.getKeyValue("h_CS_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_name")) {
						key.setUNIT_COST_ACCEPT_TYP_name(msgKey.getKeyValue("UNIT_COST_ACCEPT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_val")) {
						key.setUNIT_COST_ACCEPT_TYP_val(msgKey.getKeyValue("UNIT_COST_ACCEPT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name")) {
						key.setONEROUS_CONS_FLG_name(msgKey.getKeyValue("ONEROUS_CONS_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val")) {
						key.setONEROUS_CONS_FLG_val(msgKey.getKeyValue("ONEROUS_CONS_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_name")) {
						key.setSUB_UNIT_COST_TYP_name(msgKey.getKeyValue("SUB_UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_val")) {
						key.setSUB_UNIT_COST_TYP_val(msgKey.getKeyValue("SUB_UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd")) {
						key.setc_NoCheckClasificationCd(msgKey.getKeyValue("c_NoCheckClasificationCd"));
					}
					if(msgKeyType.containsKeyColumn("c_NoCheckStockUnit")) {
						key.setc_NoCheckStockUnit(msgKey.getKeyValue("c_NoCheckStockUnit"));
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
