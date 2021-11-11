/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0190/src/com/nec/jp/orteus/metamorBase/AE0190/AE0190010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0190;

import com.nec.jp.orteus.metamorBase.AE0190.*;
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
// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0190010Control
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
        public AE0190010Struct getListvalue(int x) {
         return (AE0190010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public AE0190010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public AE0190010Struct createStruct() {
         return new AE0190010Struct();
        } // �V����Struct������ĕԂ��܂��B
       
        public void setStruct(Object structname) {
         this.struct.setStruct((AE0190010Struct) structname);
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
        /** [����]��� */
        private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
        /** [�Ŗ�]��� */
        private TaxNameStruct _taxNameStruct = new TaxNameStruct();
        /** [�M��]��� */
        private HomeCurStruct _homeCurStruct = new HomeCurStruct();

        /** [�R���{�{�b�N�X�f�[�^]���i�j */
        private ComboStruct _splItemTypStruct = new ComboStruct();
        /** [�R���{�{�b�N�X�f�[�^]���i�P���敪�j */
        private ComboStruct _unitCostTypStruct = new ComboStruct();
       
        /** ��ʑJ�ڃL�[(�H��R�[�h) */
        private String _plantCd;
        /** ��ʑJ�ڃL�[(�����ԍ�) */
        private String _puchOdrCd;
        /** ���͕i�ڑ��݊m�F�t���O */
		private boolean _Itemflg = true;
		
		/** �P���Ǎ����A����ŃR�[�h*/
		private String _taxCd = "";

		/** EJa-ASPROVA�A�g�I�v�V���������t���O�擾�p */
		private String _SysInstallOptions_ASP = null;
		
		/** JF�����t���O�擾�p */
		private String _SysInstallOptions_JF = null;
        // �����ꍀ�ڎ擾�Ή�
        ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));
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
         * �C���t�H���[�V�����������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
         * @param tableName �e�[�u����
         * @param columnName �J������
         * @param value �l
         */
        private void setInformationParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addInfo(emsg);
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
         * ��ʑJ�ڃL�[(�H��R�[�h)�擾
         * @return �H��R�[�h
         */
        public String getPlantCd() {
         return _plantCd;
        }
        /**
         * ��ʑJ�ڃL�[(�H��R�[�h)�ݒ�
         * @param cd �H��R�[�h
         */
        public void setPlantCd(String cd) {
         _plantCd = cd;
        }
        /**
         * ��ʑJ�ڃL�[(�����ԍ�)�擾
         * @return �����ԍ�
         */
        public String getPuchOdrCd() {
         return _puchOdrCd;
        }
        /**
         * ��ʑJ�ڃL�[(�����ԍ�)�ݒ�
         * @param cd �����ԍ�
         */
        public void setPuchOdrCd(String cd) {
         _puchOdrCd = cd;
        }
       
        /**
         * �ғ����`�F�b�N��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
         * @param dateString ���t������
         * @return �ғ����̏ꍇ�� true�A ��ғ����̏ꍇ��false��Ԃ��܂��B
         * @throws FoundationException  ���ʕ��i�����Ŏ��s
         * @throws ParseException �^�ϊ��Ɏ��s
         */
        private boolean isWorkDay(String dateString) throws FoundationException, ParseException {
         // DateFormat������
         //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
         // �^�ϊ�
         //Date date = df.parse(dateString);
         Date date = Converter.strToDate(dateString, "yyyy/MM/dd");
       
         // �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
         WorkCalendar wc;
         if(_Itemflg){
         	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), date);
         }else{
         	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(), date);
         }
         boolean reslt = wc.isWorkDate();
         return reslt;
        }
       
        /**
         * �ғ������Z��������t������Ŏg����悤�ɂ����Ϗ����\�b�h�ł��B
         * @param dateString ���t������
         * @return ���Z���ʂ̓��t������
         * @throws FoundationException ���ʕ��i�����Ŏ��s
         * @throws ParseException �^�ϊ��Ɏ��s
         */
        private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg)
         throws FoundationException, ParseException {
         // DateFormat������
         //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
         // �^�ϊ�
         //Date date = df.parse(dateString);

         // �n����Ă���������hh24:mi:ss�`���ɐ�����
         timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

         // �����̔N�����ƌ`���𐮂����������������A���t�^�ɕϊ�����
         Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
         int lt = Integer.parseInt(ltString);
       
         // �ғ������ʕ��i�𐶐����A�`�F�b�N���������s
         WorkCalendar wc =
          new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), date, lt, flg);
         Date resultDate = wc.calcDate();

         if (resultDate == null || "".equals(resultDate)){
        	 return ""; 
         }
         // �����Z�o���ꂽ���t�𕶎��^�ɕϊ����ĕێ�����
         String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

         // �����Z�o���ꂽ���t��yyyy/mm/dd hh24mi�`���ɐ�����
         tidydate = tidydate.substring(0,10) + tidydate.substring(11,13) + tidydate.substring(14,16);

         //return df.format(tidydate);
         return tidydate;
        }
       
        /**
         * Struct�̒l���Z�b�g���܂��B
         * @param s ���������f�[�^
         */
        private void setStruct(AE0190010Struct s) {
         struct.setPLANT_CD(s.getPLANT_CD());
         struct.setPLANT_NAME(s.getPLANT_NAME());
         struct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());
         struct.setITEM_CD(s.getITEM_CD());
         struct.setITEM_NAME(s.getITEM_NAME());
         struct.setJOB_ODR_CD(s.getJOB_ODR_CD());
         struct.seth_JOB_ODR_CD(s.getJOB_ODR_CD());
         struct.setDRAW_CD(s.getDRAW_CD());
         struct.setSPEC(s.getSPEC());
         struct.setMRP_ODR_TYP_DN(s.getMRP_ODR_TYP_DN());
         struct.setMRP_ODR_TYP(s.getMRP_ODR_TYP());
         struct.setPUCH_ODR_START_DATE(s.getPUCH_ODR_START_DATE());
         struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());
         struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());
         struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());
         struct.setSTOCK_UNIT(s.getSTOCK_UNIT());

         struct.setVEND_CD(s.getVEND_CD());
         struct.setVEND_NAME(s.getVEND_NAME());
         struct.setWH_CD(s.getWH_CD());
         struct.setWH_NAME(s.getWH_NAME());
         struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());
         struct.setUSER_NAME(s.getUSER_NAME());
         struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());
         struct.setPRODUCT_TYP(s.getPRODUCT_TYP());
         struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());
         struct.setUNIT_COST(s.getUNIT_COST());
         struct.setPUCH_ODR_AMOUNT(s.getPUCH_ODR_AMOUNT());
         struct.setAMOUNT_INCLUDE_TAX(s.getAMOUNT_INCLUDE_TAX());
         struct.setNET_AMOUNT(s.getNET_AMOUNT());
         struct.setDISC_AMOUNT(s.getDISC_AMOUNT());
         struct.setTAX_RATE_1(s.getTAX_RATE_1());
         struct.setTAX_RATE_2(s.getTAX_RATE_2());
         struct.setTAX_RATE_3(s.getTAX_RATE_3());
         struct.setTAX_AMOUNT_1(s.getTAX_AMOUNT_1());
         struct.setTAX_AMOUNT_2(s.getTAX_AMOUNT_2());
         struct.setTAX_AMOUNT_3(s.getTAX_AMOUNT_3());
         struct.setPROCESSING_COST(s.getPROCESSING_COST());
         struct.setMATERIAL_COST(s.getMATERIAL_COST());
         struct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());
         struct.setHOME_CUR_AMOUNT(s.getHOME_CUR_AMOUNT());
         struct.setEXCH_RATE(s.getEXCH_RATE());
         struct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());
         struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());
         struct.setINV_CTRL_FLG(s.getINV_CTRL_FLG());
         struct.setOD_NO(s.getOD_NO());
         struct.setTAX_CD(s.getTAX_CD());
         struct.setTAX_ROUND_TYP(s.getTAX_ROUND_TYP());
         struct.setROUND_TYP(s.getROUND_TYP());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
         struct.setCUR_CD(s.getCUR_CD());
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setVEND_CUR_UNIT(s.getVEND_CUR_UNIT());
         struct.setVEND_DECIMAL_FIG(s.getVEND_DECIMAL_FIG());
         struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());
       
         struct.seth_PLANT_CD(s.getPLANT_CD());
         struct.seth_PUCH_ODR_CD(s.getPUCH_ODR_CD());
         struct.seth_ITEM_CD(s.getITEM_CD());
         struct.seth_PUCH_ODR_QTY(s.getPUCH_ODR_QTY());
         struct.seth_SPL_ITEM_TYP(s.getSPL_ITEM_TYP());
         struct.setOUTSIDE_TYP(s.getOUTSIDE_TYP());
         
         struct.setALC_GRP_CD(s.getALC_GRP_CD());
         struct.seth_ALC_GRP_CD(s.getALC_GRP_CD());
         struct.setPROJECT_CD(s.getPROJECT_CD());
         struct.setPROJECT_NAME(s.getPROJECT_NAME());
       
       
         struct.setCONFIRM_DLV_DATE_COMMENT(s.getCONFIRM_DLV_DATE_COMMENT());
         struct.setPUCH_ODR_START_TIME(s.getPUCH_ODR_START_TIME());
         struct.setCONFIRM_DLV_TIME(s.getCONFIRM_DLV_TIME());
         struct.setPUCH_ODR_DLV_TIME(s.getPUCH_ODR_DLV_TIME());
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setPUCH_ODR_CD(null);
 		
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setJOB_ODR_CD(null);
         struct.setDRAW_CD(null);
         struct.setSPEC(null);
         struct.setMRP_ODR_TYP_DN(null);
         struct.setMRP_ODR_TYP(null);
         struct.setPUCH_ODR_START_DATE(null);
         struct.setCONFIRM_DLV_DATE(null);
         struct.setPUCH_ODR_DLV_DATE(null);
         struct.setPUCH_ODR_QTY("0");
         struct.setSTOCK_UNIT(null);
         struct.setOUTSIDE_TYP(null);
         struct.setVEND_CD(null);
         struct.setVEND_NAME(null);
         struct.setWH_CD(null);
         struct.setWH_NAME(null);
         struct.setPUCH_ODR_PERSON(sysUSER_CD);
         struct.setUSER_NAME(null);
         struct.setSPL_ITEM_TYP("0");
         struct.setPRODUCT_TYP(null);
         struct.setUNIT_COST_TYP("1");
         struct.setUNIT_COST("0");
         struct.setPUCH_ODR_AMOUNT("0");
         struct.setAMOUNT_INCLUDE_TAX("0");
         struct.setNET_AMOUNT("0");
         struct.setDISC_AMOUNT("0");
         struct.setTAX_RATE_1("0");
         struct.setTAX_RATE_2("0");
         struct.setTAX_RATE_3("0");
         struct.setTAX_AMOUNT_1("0");
         struct.setTAX_AMOUNT_2("0");
         struct.setTAX_AMOUNT_3("0");
         struct.setPROCESSING_COST("0");
         struct.setMATERIAL_COST("0");
         struct.setOTHER_OVERHEADS("0");
         struct.setHOME_CUR_AMOUNT("0");
         struct.setEXCH_RATE("1");
         struct.setPUCH_ODR_COMMENT(null);
         struct.setPUCH_ODR_STS_TYP(null);
         struct.setINV_CTRL_FLG(null);
         struct.setOD_NO(null);
         struct.setTAX_CD(null);
         struct.setTAX_ROUND_TYP(Kind.FLOOR);
         struct.setROUND_TYP(Kind.FLOOR);
         struct.setMODIFY_COUNT(null);
         struct.setCUR_CD(null);
         struct.setCUR_NAME(null);
         struct.setVEND_CUR_UNIT(null);
         struct.setVEND_DECIMAL_FIG("4");
         struct.setOD_NO(null);
         struct.setNON_NO_ITEM_FLG(null);
       
         struct.seth_PLANT_CD(null);
         struct.seth_PUCH_ODR_CD(null);
         struct.seth_ITEM_CD(null);
         struct.seth_PUCH_ODR_QTY(null);
         struct.seth_SPL_ITEM_TYP(null);
       
         struct.setJOB_ODR_CD(null);
         struct.seth_JOB_ODR_CD(null);
         struct.setc_JOB_ODR("false");
         struct.setALC_GRP_CD(null);
         struct.seth_ALC_GRP_CD(null);
         struct.setPROJECT_CD(null);
         struct.setPROJECT_NAME(null);
         
       
         struct.setCONFIRM_DLV_DATE_COMMENT(null);
         
         struct.setPUCH_ODR_START_TIME(null);
         struct.setCONFIRM_DLV_TIME(null);
         struct.setPUCH_ODR_DLV_TIME(null);

         struct.setPUCH_ODR_START_DATE_ALL(null);
         struct.setCONFIRM_DLV_DATE_ALL(null);
         struct.setPUCH_ODR_DLV_DATE_ALL(null); 
         struct.setSelectUnitCostFlag("false");
       
         list = null;
         
 		//����ŃR�[�h
 		_taxCd = "";
 		
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
	

	public Date StrngToDt(String in){
		Date out = null;
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return out;
		try{
			if((out = fm.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	
	public String DtToStrng(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return null;
		return fm.format(in);
	}
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
	}

	public String DtGetTime(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("HHmm");
		if(in == null) return null;
		return fm.format(in);
	}

	/** �f�o�b�O�p���b�Z�[�W�쐬�p�ϐ� */
    private String _debugMsg = "";
	// 20081222 ADD��

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // �L�[�ȊO�̍��ڂ�������
                 initializeDetail();
              
                 // �L�[���ڂ̖��̎擾
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  struct.setPLANT_NAME(null);
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  return;
                 } else {
                  AE0190010Struct plantStruct = (AE0190010Struct) plantList.get(0);
                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
              
                 // ���i���׍��ڂ�����
                 List formList = entity.mForm.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                  return;
                 }
              
                 // ���i���׍��ڃf�[�^���擾
                 AE0190010Struct formStruct = (AE0190010Struct) formList.get(0);
                 
                 formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP_DN()));
                 formStruct.setOUTSIDE_TYP(multcombo("OUTSIDE_TYP",formStruct.getOUTSIDE_TYP()));
                 formStruct.setPRODUCT_TYP(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
                              
                 //[�����c].�g�����v�惁���e�i���X�t���O�h �� 0:�i�����v�惁���e�i���X�i���Ԑ�s��z�j�œo�^�����f�[�^�łȂ��j�̏ꍇ
                 //�f�[�^�͏C���^�폜�s�ƂȂ�B
                 if("0".equals(formStruct.getPUCH_MAINT_FLG())){
                	 setErrorMessage("AE01012");
                	 setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());   
                	 return;
                 }
                 //�w���ς݂̏ꍇ�ł������񓚔[���A�����񓚔[�����l�͏C���\              
                 // [�����c]."������ԋ敪" = 2:�w���ς̏ꍇ
                 if ("2".equals(formStruct.getPUCH_ODR_STS_TYP())) {
                  setWarningMessage("AE32610");
                  setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                 }
                 
                 // [�����c]."������ԋ敪" = 9:��������̏ꍇ
                 if ("9".equals(formStruct.getPUCH_ODR_STS_TYP())) {
                  setWarningMessage("AE00151");
                  setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                 }
                 
                //�����Ǘ����Ȃ��Ƃ��͎�����\�����Ȃ�
                if(!(struct.getTIME_CTRL()).equals("true")){
                    formStruct.setPUCH_ODR_START_TIME("");
                    formStruct.setPUCH_ODR_DLV_TIME("");
                    formStruct.setCONFIRM_DLV_TIME("");
                }
              
                 // ���i���׍��ڃf�[�^���Z�b�g
                 setStruct(formStruct);
                 struct.setSelectUnitCostFlag("true");
                 
         		/** �Ǎ����A����ŃR�[�h��ݒ�*/
                 _taxCd = struct.getTAX_CD();
         		         		
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
        AE0190010Struct itemStruct = null;   
		PuchUnitCostStruct pucs;
        // �����A�w���P���A�ʉ݁A����ł��擾
        try { 					
    		// ������\������Null�̏ꍇ�A������\�������Z�o����B
			if (struct.getPUCH_ODR_START_DATE() == null
					|| "".equals(struct.getPUCH_ODR_START_DATE())) {
				
	        	// �i�ڏ����擾
	    		List itemList = entity.mM_ITEM.read(conn, struct);
	    		if (itemList.isEmpty()) {
	    			setErrorMessage("AE50509");
	    			setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
	    			return;
	    		} else {
	    			// [�i��]."�i�ڎ�z�敪"��1/4/5/6/7/8�̏ꍇ
	    			itemStruct = (AE0190010Struct) itemList.get(0);
	    			if (("1".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("4".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("5".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("6".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("7".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("8".equals(itemStruct.getMRP_ODR_TYP()))) {
	    				setErrorMessage("AE32601");
	    				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
	    				return;
	    			}
	    		}
	    		
	    		// �����[���̐ݒ�
				String PUCH_ODR_DLV_TIME = struct.getPUCH_ODR_DLV_TIME();
				// ���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
				if ("true".equals(struct.getTIME_CTRL())) {
					// �@�����[��(����)�̃`�F�b�N
					if ((PUCH_ODR_DLV_TIME).length() == 3) {
						// �R���͓��ɂO��t����
						PUCH_ODR_DLV_TIME = "0" + PUCH_ODR_DLV_TIME;
					} else {
						// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
						PUCH_ODR_DLV_TIME = "0000";
					}
				} else {
					// �����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
					PUCH_ODR_DLV_TIME = "0000";
				}
				
				// [�Ɩ����t]���𕔕i���擾
				DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());
				// �ʏ�i�̏ꍇ�͢�����[��������ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
				String resultDate = null;

				// ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
				if (!"1".equals(_SysInstallOptions_ASP)) {
					String fixedLt = itemStruct.getFIXED_LT();
					String propLt = itemStruct.getPROP_LT();
					String safetyLt = itemStruct.getSAFETY_LT();
					String propLotSize = itemStruct.getPROP_LOT_SIZE();

					String itemLt = Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
					itemLt = Calculate.multiply(itemLt, propLt);
					itemLt = Calculate.add(itemLt, fixedLt);
					itemLt = Calculate.add(itemLt, safetyLt);
					itemLt = Calculate.multiply(itemLt, "-1");

					resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(),PUCH_ODR_DLV_TIME, itemLt, true);
					if ("".equals(resultDate)) {
						setErrorMessage("AE00198");
						return;
					}
					// �Z�o���������\��� <
					// [���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
					if (DateTool.compareYMD(resultDate.substring(0, 10), dcs.getBUSINESS_OPR_DATE()) < 0) {
						struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
					} else {
						// �����v�Z�������ʂ𔭒��\����Ƃ���
						struct.setPUCH_ODR_START_DATE(resultDate.substring(0, 10));
					}
					// ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂ̃��[�h�^�C���v�Z���s���B
				} else {

					String propLotSize = itemStruct.getPROP_LOT_SIZE();
					String sWkDate, sShiftMin, sWkTime;

					ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD,this.sysUSER_CD, this.getProgramId());
					ATWorkCalendar atWC = new ATWorkCalendar(conn, this.sysUSER_CD, this.getProgramId(),
							this.sysPLANT_CD);
					Date puchOdrStartDate = null; // �����\���
					Date puchOdrDlvDate = null; // �����[��

					// �����[��������̏��
					puchOdrDlvDate = StrngToDt(this.struct.getPUCH_ODR_DLV_DATE()
							+ " " + (PUCH_ODR_DLV_TIME).substring(0, 2)
							+ ":" + (PUCH_ODR_DLV_TIME).substring(2, 4));
					// �����\���LT�V�t�g(�|)
					sShiftMin = ab.getProdLtMin(struct.getITEM_CD(), struct.getPUCH_ODR_QTY(), propLotSize, "U");
					sShiftMin = Calculate.multiply(sShiftMin, "-1"); // �ߋ���
					puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START); // Conv
					sWkDate = DtGetDate(puchOdrStartDate);
					sWkTime = DtGetTime(puchOdrStartDate);
					struct.setPUCH_ODR_START_DATE(sWkDate);
					struct.setPUCH_ODR_START_TIME(sWkTime);
					_debugMsg = ("(AD0010/EJa-ASP)TIME: "
							+ "PUCH_ODR_DLV_DATE" + "["
							+ this.struct.getPUCH_ODR_DLV_DATE() + "],"
							+ "PUCH_ODR_DLV_TIME" + "[" + PUCH_ODR_DLV_TIME
							+ "]," + "PUCH_ODR_START_DATE" + "["
							+ this.struct.getPUCH_ODR_START_DATE() + "],"
							+ "PUCH_ODR_START_TIME" + "["
							+ struct.getPUCH_ODR_START_TIME() + "], "
							+ "sShiftMin" + "[" + sShiftMin + "] ");
					sysLog.info("ZZ01006", struct.getsUser_ID(), _debugMsg);
				}
			}
                 pucs =

                 PuchUnitCostControl.getDataTax(
                         conn,
                         _myCompanyStruct.getCOMPANY_CD(),
                         struct.getVEND_CD(),
                         struct.getPLANT_CD(),
                         struct.getITEM_CD(),
                         struct.getPUCH_ODR_START_DATE(),
                         struct.getPUCH_ODR_DLV_DATE(),
                         struct.getPUCH_ODR_QTY(),
                         _taxCd);  
                 
                 struct.setTAX_CD(pucs.getTAX_CD());   
                 
                 struct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
                 struct.setUNIT_COST(pucs.getUNIT_COST());
                 struct.setPROCESSING_COST(pucs.getPROCESSING_COST());
                 struct.setMATERIAL_COST(pucs.getMATERIAL_COST());
                 struct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
                 struct.setPUCH_ODR_AMOUNT(pucs.getPUCH_ODR_AMOUNT());
                 struct.setTAX_RATE_1(pucs.getTAX_RATE_1());
                 struct.setTAX_RATE_2(pucs.getTAX_RATE_2());
                 struct.setTAX_RATE_3(pucs.getTAX_RATE_3());
                 struct.setNET_AMOUNT(pucs.getNET_AMOUNT());
                 struct.setDISC_AMOUNT(pucs.getDISC_AMOUNT());
                 struct.setTAX_AMOUNT_1(pucs.getTAX_AMOUNT_1());
                 struct.setTAX_AMOUNT_2(pucs.getTAX_AMOUNT_2());
                 struct.setTAX_AMOUNT_3(pucs.getTAX_AMOUNT_3());
                 struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
                 struct.setTAX_ROUND_TYP(pucs.getTAX_ROUND_TYP());
                 struct.setROUND_TYP(pucs.getROUND_TYP());
                 struct.setCUR_CD(pucs.getCUR_CD());
                 struct.setCUR_NAME(pucs.getCUR_NAME());
                 struct.setVEND_CUR_UNIT(pucs.getCUR_UNIT());
                 struct.setVEND_DECIMAL_FIG(pucs.getDECIMAL_FIG());
                 

                 //���ł̏ꍇ�ɐŊz���v�Z����
         		String lowerTaxCd =
         			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
        		if (!lowerTaxCd.equals("1")) {
        			//�o�b�`�p�����[�^�ďo
        			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
        			if(!batList.isEmpty()){
        				//�Ōv�Z���i���R�[��
        				AE0190010Struct batStruct = (AE0190010Struct)batList.get(0);
        				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
        				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
        				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
        				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
        				struct.setPVC2USERID(this.sysUSER_CD);
        				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
        				struct.setPVC2PLANTCD(this.sysPLANT_CD);
        				struct.setPVC2TAXID("5");
        				batList = entity.mcallSQLCALCTAXCALCAMTFD.call(conn, struct);
        				batStruct = (AE0190010Struct)batList.get(0);
        				if(!"1".equals(batStruct.getPNUMSTATUS())){
        					setErrorMessage(batStruct.getPVC2ERRCD());
        					return;      				       				
        				}
        				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
        				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
        				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
        				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
        			}else{
        				setErrorMessage("ZZ09007");        				
        			}
             	  }
 
                } catch (DataNotFoundException e) {
                 setErrorMessage("AE00060", e.getMessage());
                 setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
                 setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                 setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
                 setErrorParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_START_DATE",
                  struct.getPUCH_ODR_START_DATE());
                 setErrorParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_DLV_DATE",
                  struct.getPUCH_ODR_DLV_DATE());
                 setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getPUCH_ODR_QTY());
                 return;
                } catch (Exception e) {
                 throw new ExpjException(e);
                }
              
                // �בփ��[�g�����݂��Ȃ��ꍇ�̓��[�j���O�����Ƃ��邽�ߕʂɎ擾
                try {
                 ExchRateStruct ers =
                  ExchRateControl.getData(
                   conn,
                   _myCompanyStruct.getCOMPANY_CD(),
                   pucs.getCUR_CD(),
                   pucs.getEXCH_TYP(),
                   null,
                   struct.getPUCH_ODR_DLV_DATE());
                 // ��בփ��[�g���ݒ�
                 struct.setEXCH_RATE(ers.getEXCH_RATE());
                 // ��M�݋��z��̌v�Z
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   pucs.getAMOUNT_INCLUDE_TAX(),
                   ers.getEXCH_RATE(),
                   pucs.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
              
                 struct.setHOME_CUR_AMOUNT(homeCurAmount);
              
                } catch (DataNotFoundException e) {
                 struct.setHOME_CUR_AMOUNT("0");
                 struct.setEXCH_RATE("0");
                 setWarningMessage("AE00061");
                 setWarningParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
                 setWarningParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                 setWarningParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
                 setWarningParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_START_DATE",
                  struct.getPUCH_ODR_START_DATE());
                 setWarningParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_DLV_DATE",
                  struct.getPUCH_ODR_DLV_DATE());
                 setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getPUCH_ODR_QTY());
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
              
                struct.setSelectUnitCostFlag("true");
              
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
		         // �t���O��������
		         _Itemflg = true;
 	             
                 String PUCH_ODR_START_TIME = struct.getPUCH_ODR_START_TIME();
	             String PUCH_ODR_DLV_TIME = struct.getPUCH_ODR_DLV_TIME();
	             String CONFIRM_DLV_TIME = struct.getCONFIRM_DLV_TIME();
                                   	
                 //���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
                 if((struct.getTIME_CTRL()).equals("true")){
                 	

                     //�@�����\���(����)�̃`�F�b�N
                     if((PUCH_ODR_START_TIME).length() == 3 ){
                         //�R���͓��ɂO��t����
                     	 PUCH_ODR_START_TIME = "0" + PUCH_ODR_START_TIME;
                     }
                     
                     //�A�����[��(����)�̃`�F�b�N
                     if((PUCH_ODR_DLV_TIME).length() == 3 ){
                      	//�R���͓��ɂO��t����
                         PUCH_ODR_DLV_TIME = "0" + PUCH_ODR_DLV_TIME;
                     }
                     
                     //�B�����񓚔[��(����)�̃`�F�b�N
                     if((CONFIRM_DLV_TIME).length() == 3 ){
                     	//�R���͓��ɂO��t����
                         CONFIRM_DLV_TIME = "0" + CONFIRM_DLV_TIME;
                     }
                 }else{
                 	 //�����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
                 	 PUCH_ODR_START_TIME = "0000";
	                 PUCH_ODR_DLV_TIME = "0000";
	                 CONFIRM_DLV_TIME = "0000";
                 }

                 // ��H��R�[�h���[�H��]���������A���݂��Ȃ������ꍇ
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
              
                 // ��i�ڔԍ����null�̏ꍇ�ȉ��̃`�F�b�N���s��Ȃ�
                 AE0190010Struct itemStruct = null;
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // ��i�ڔԍ���ŁA[�i��]�ɑ��݂��Ȃ������ꍇ
                  List itemList = entity.mM_ITEM.read(conn, struct);
                  if (itemList.isEmpty()) {
                   setErrorMessage("AE50509");
                   setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   _Itemflg = false;
                  } else {
                   // [�i��]."�i�ڎ�z�敪"��1/4/5/6/7/8�̏ꍇ
                   itemStruct = (AE0190010Struct) itemList.get(0);
                   if (("1".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("4".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("5".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("6".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("7".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("8".equals(itemStruct.getMRP_ODR_TYP()))) {
                    setErrorMessage("AE32601");
                    setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   }
                  }
                 }
                 
                 //�u���ԁv �� Null�̏ꍇ�A[���Ԍv��]���������P���ł����Ԍv�悪���݂����ꍇ
                 if(!(struct.getJOB_ODR_CD() == null || struct.getJOB_ODR_CD().length()<=0)){
                	 List tjobodrList = entity.mT_JOB_ODR_CHK.read(conn, struct);
                     if(!tjobodrList.isEmpty()){
                    	 setErrorMessage("AE01010");
                         setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
                     }
                 }
                 
                 //�u�Č��ԍ��v �� Null�̏ꍇ�A[�Č�]�����������݂��Ȃ������ꍇ
                if(!(struct.getPROJECT_CD() == null || struct.getPROJECT_CD().length() <= 0)){
                	List projectList =entity.mT_PROJECT_CHK.read(conn, struct);
                	if(projectList.isEmpty()){
                		setErrorMessage("AE01011");
                        setErrorParameter("T_PROJECT", "PROJECT_CD", struct.getPROJECT_CD());
                	}
                }
              
                 if (!plantList.isEmpty()) {
                  // [�Ɩ����t]���𕔕i���擾
                  DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());
              
                  if (!isWorkDay(struct.getPUCH_ODR_DLV_DATE())) {
                   setErrorMessage("AE00028");
                   setErrorParameter(
                    "T_RLSD_PUCH_ODR",
                    "PUCH_ODR_DLV_DATE",
                    struct.getPUCH_ODR_DLV_DATE());
                  }
                 
                 
                 // ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
                 if(!"1".equals(_SysInstallOptions_ASP)){	
                	 	// ������[��� < [���t����]." �Ɩ��^�p��"�̏ꍇ
                	 	if (DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())
                	 			< 0) {
                	 					setErrorMessage("AE00030");
                	 					setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                	 					setErrorParameter(
                	 							"SYS_DATE_CTRL",
                	 							"BUSINESS_OPR_DATE",
                	 							dcs.getBUSINESS_OPR_DATE());
                	 					setErrorParameter(
                	 							"T_RLSD_PUCH_ODR",
                	 							"PUCH_ODR_DLV_DATE",
                	 							struct.getPUCH_ODR_DLV_DATE());
                	 					}
                  }

                 // ������\������ != Null�̏ꍇ�A�ȉ��̃`�F�b�N���s���B
                  if (struct.getPUCH_ODR_START_DATE() != null
                   && !"".equals(struct.getPUCH_ODR_START_DATE())) {
                   // ������\��������ғ����̏ꍇ
                   if (!isWorkDay(struct.getPUCH_ODR_START_DATE())) {
                    setErrorMessage("AE00029");
                    setErrorParameter(
                     "T_RLSD_PUCH_ODR",
                     "PUCH_ODR_START_DATE",
                     struct.getPUCH_ODR_START_DATE());
                   }

                   // ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
                   if(!"1".equals(_SysInstallOptions_ASP)){	
                	   	// ������\���� < [���t����]." �Ɩ��^�p��"�̏ꍇ
                	   	if (DateTool
                	   			.compareYMD(struct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())
                	   			< 0) {
                	   					setErrorMessage("AE00031");
                	   					setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                	   					setErrorParameter(
                	   							"SYS_DATE_CTRL",
                	   							"BUSINESS_OPR_DATE",
                	   							dcs.getBUSINESS_OPR_DATE());
                	   					setErrorParameter(
                	   							"T_RLSD_PUCH_ODR",
                	   							"PUCH_ODR_START_DATE",
                	   							struct.getPUCH_ODR_START_DATE());
                	   					}
                   }

                  }
                 }
                 // ������R�[�h����A[�����]�ɑ��݂��Ȃ��ꍇ
                 List vendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                 AE0190010Struct vendCtrlStruct = null;
                 if (vendCtrlList.isEmpty()) {
                  setErrorMessage("AE20030");
                  setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                 } else {
                  // ������."�����ԃt���O" = 1:�����~�̏ꍇ
                  vendCtrlStruct = (AE0190010Struct) vendCtrlList.get(0);
                  if ("1".equals(vendCtrlStruct.getDEAL_STS_FLG())) {
                   setErrorMessage("AE00002");
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                  }
                 }
                 // �����ꏊ����A[�ۊǋ�]�ɑ��݂��Ȃ��ꍇ
                 List whList = entity.mM_WH.read(conn, struct);
                 if (whList.isEmpty()) {
                  setErrorMessage("AE00018");
                  setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                 } else {
                  // [�ۊǋ�]."�H��R�[�h" != ��H��R�[�h��̏ꍇ
                  AE0190010Struct whStruct = (AE0190010Struct) whList.get(0);
                  if (!struct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
                   setErrorMessage("AE00032");
                   setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                   setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
                   setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                  }
                 }
                 // ������S���ң != Null�ŁA����[���[�U�}�X�^]�ɑ��݂��Ȃ��Ƃ�
                 if ((struct.getPUCH_ODR_PERSON() != null)
                  && (struct.getPUCH_ODR_PERSON().length() > 0)) {
                  List userList = entity.mUSER_MST.read(conn, struct);
                  if (userList.isEmpty()) {
                   setErrorMessage("AE00005");
                   setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                  }
                 }
                 // �G���[������ΏI��
                 if (msgStruct.hasError()) {
                  return;
                 }
                 TaxStruct ts = new TaxStruct();
                 CurStruct cs = new CurStruct();
                 // ��ʊO�̕K�v�ȃf�[�^��ݒ�
                 try {
                  // [����ŋ敪]�����擾
                  ts =
                   TaxControl.getData(
                    conn,
                    struct.getCOMPANY_CD(),
                    struct.getVEND_CD(),
                    struct.getITEM_CD(),
                    struct.getPUCH_ODR_DLV_DATE());       
                  } catch (DataNotFoundException e) {
                	  setErrorMessage("AE00017");
                	  return;
                  }
                  
                  // [�ʉ�]�����擾
                  try {
                   cs =
                    CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
                  } catch (DataNotFoundException e) {
                	  setErrorMessage(e.getCode());
                	  return;
                  }
						//�������z���܂�ߏ���
						String tempOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							struct.getPUCH_ODR_QTY(),
							struct.getUNIT_COST(),
							cs.getROUND_TYP(),
							cs.getDECIMAL_FIG());
		                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(tempOdrAmount)){
		                     // �����ꍀ�ڎ擾�Z�b�g
		                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
		                	setErrorMessage("AA00215",ErrInfo);
		                	 return;
		                 }
						String tempNetAmount = Calculate.subtract(tempOdrAmount, struct.getDISC_AMOUNT());			             
                   struct.setTAX_CD(ts.getTAX_CD());

                   struct.setTAX_RATE_1(ts.getTAX_RATE_1());
                   struct.setTAX_RATE_2(ts.getTAX_RATE_2());
                   struct.setTAX_RATE_3(ts.getTAX_RATE_3());
                   
                  struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());            
                  struct.setROUND_TYP(cs.getROUND_TYP());
                  struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
              

              
                 // ������\������Null�̏ꍇ�A������\�������Z�o����B
                 if (struct.getPUCH_ODR_START_DATE() == null
                  || "".equals(struct.getPUCH_ODR_START_DATE())) {
                  // [�Ɩ����t]���𕔕i���擾
                  DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());
               // ������[��������ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
                  
            	  String resultDate = null;
            	  
            	  // ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
            	  if(!"1".equals(_SysInstallOptions_ASP)){	
            
            		  String fixedLt = itemStruct.getFIXED_LT();
            		  String propLt = itemStruct.getPROP_LT();
            		  String safetyLt = itemStruct.getSAFETY_LT();
            		  String propLotSize = itemStruct.getPROP_LOT_SIZE();
          
            		  String itemLt =
            			  Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
            		  itemLt = Calculate.multiply(itemLt, propLt);
            		  itemLt = Calculate.add(itemLt, fixedLt);
            		  itemLt = Calculate.add(itemLt, safetyLt);
            		  itemLt = Calculate.multiply(itemLt, "-1");

            		  resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(), PUCH_ODR_DLV_TIME, itemLt, true);

            		  if ("".equals(resultDate)){
            			  setErrorMessage("AE00198");
            			  return;
            		  }
            		  // �Z�o���������\��� < [���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
            		  if (DateTool.compareYMD(resultDate.substring(0,10), dcs.getBUSINESS_OPR_DATE()) < 0) {
            			  struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
            			  //�����͔����[���̎������Z�b�g
            			  PUCH_ODR_START_TIME = PUCH_ODR_DLV_TIME;
            		  } else {
            			  //�����v�Z�������ʂ𔭒��\����Ƃ���
            			  struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
            			  PUCH_ODR_START_TIME = resultDate.substring(10);
            		  }
            	  // ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂ̃��[�h�^�C���v�Z���s���B
            	  }else{
               
            		  String propLotSize = itemStruct.getPROP_LOT_SIZE();
            		  String sWkDate, sShiftMin,sWkTime ;
	        	
            		  ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
            				  this.sysUSER_CD, 
            				  this.getProgramId());
            		  ATWorkCalendar atWC = new ATWorkCalendar(conn, 
            				  this.sysUSER_CD , 
            				  this.getProgramId(), 
            				  this.sysPLANT_CD) ;
            		  Date puchOdrStartDate = null;	  // �����\���
            		  Date puchOdrDlvDate = null;	  // �����[��

            		  //�����[��������̏��
            		  puchOdrDlvDate = StrngToDt(this.struct.getPUCH_ODR_DLV_DATE() + " " + (PUCH_ODR_DLV_TIME).substring(0,2) + ":" + (PUCH_ODR_DLV_TIME).substring(2,4));
            		  //��CHG 20081222 �����\���LT�V�t�g(�|)-----------------------------
            		  //struct.getPUCH_ODR_QTY(), propLotSize				
            		  sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),struct.getPUCH_ODR_QTY(),propLotSize,"U");
            		  sShiftMin = Calculate.multiply(sShiftMin,"-1"); //�ߋ���
            		  puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
            		  sWkDate =DtGetDate(puchOdrStartDate);
            		  sWkTime =DtGetTime(puchOdrStartDate);
            		  this.struct.setPUCH_ODR_START_DATE(sWkDate);
            		  this.struct.setPUCH_ODR_START_TIME(sWkTime);
            		  PUCH_ODR_START_TIME = sWkTime;
            		  _debugMsg = ("(AD0010/EJa-ASP)TIME: "
            				  + "PUCH_ODR_DLV_DATE" + "[" + this.struct.getPUCH_ODR_DLV_DATE() + "]," 
            				  + "PUCH_ODR_DLV_TIME" + "[" + PUCH_ODR_DLV_TIME + "],"  
            				  + "PUCH_ODR_START_DATE" + "[" + this.struct.getPUCH_ODR_START_DATE() + "],"  
            				  + "PUCH_ODR_START_TIME" + "[" + struct.getPUCH_ODR_START_TIME() + "], "
            				  + "sShiftMin" + "[" + sShiftMin + "] " );
            		  sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
		        
            		  resultDate = struct.getPUCH_ODR_START_DATE() + " " +  PUCH_ODR_START_TIME;
            	  
            		  // �����v�Z�������ʂ𔭒��\����Ƃ���
        			  struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
        			  PUCH_ODR_START_TIME = resultDate.substring(11);
            	  
            	  }
            	  if("".equals(struct.getPUCH_ODR_START_DATE()))
            	  {
                      // [�Ɩ����t]."�Ɩ��^�p��"�𔭒��\����Ƃ���B
                      struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
                      //�����͔����[���̎������Z�b�g
                      PUCH_ODR_START_TIME = PUCH_ODR_DLV_TIME;
            	  }
                 }
                 
                 //[�i��] �����݂����ꍇ�A[���i�\��]���������P���ł����i�\�������݂����ꍇ
                 List mpsList = entity.mM_PS.read(conn, struct);
                 if(!mpsList.isEmpty()){
               	  setErrorMessage("AE01009");
                     setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                     return;
                 }
              	
                 /** �����\����i�����܂ށj*/
                 struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
				 /** �����[���i�����܂ށj*/
			     struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
				 /** �����񓚔[���i�����܂ށj*/
                 if(struct.getCONFIRM_DLV_DATE() != null && !("".equals(struct.getCONFIRM_DLV_DATE()))){
                 	struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
                 }
                 
                 if(Calculate.compare(struct.getNET_AMOUNT(), tempNetAmount) != 0){
                 	//�w���P����Ǎ��݁A���݂���ΒP���Ǎ��𑣂��G���[�A���݂��Ȃ�(�������͉��P�����P��0)�̏ꍇ�́A
                	//���[�j���O�Ƃ��Ċۂߌ�̋��z��{�̋��z�Ƃ��A�������s         
                    //�A���A���i�����ł��A��i�ڔԍ����Null�̏ꍇ�͂��̎��_�Ń��[�j���O(�w���P�������݂��Ȃ�����)
                     if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
 	                 	PuchUnitCostStruct pucs;
	                 	pucs =
	                         PuchUnitCostControl.getData(
	                          conn,
	                          _myCompanyStruct.getCOMPANY_CD(),
	                          struct.getVEND_CD(),
	                          struct.getPLANT_CD(),
	                          struct.getITEM_CD(),
	                          struct.getPUCH_ODR_START_DATE(),
	                          struct.getPUCH_ODR_DLV_DATE(),
	                          struct.getPUCH_ODR_QTY());	 
	                 	
	                 	if("1".equals(pucs.getUNIT_COST_TYP()) &&
	                 			"0.00".equals(pucs.getUNIT_COST()) &&
	                 			"0.00".equals(pucs.getPROCESSING_COST()) &&
	                 			"0.00".equals(pucs.getMATERIAL_COST()) &&
	                 			"0.00".equals(pucs.getOTHER_OVERHEADS())){
	                 			struct.setNET_AMOUNT(tempNetAmount);
							    setWarningMessage("AE00200");                 		
	                 	}else{
							    setErrorMessage("AE00147");
								return;
	                 	}

                     }else{
                    	 	struct.setNET_AMOUNT(tempNetAmount);
						    setWarningMessage("AE00200"); 
                     }
				}
				
                 // ��i�ڔԍ����Null�̏ꍇ�͈ȉ��̏������s��Ȃ�
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // �����Ǘ��i�ڂ̏ꍇ�A����������؂�グ
                  if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
                   String ceilPuchOdrQty = Calculate.ceil(struct.getPUCH_ODR_QTY(), 0);
                   if (Calculate.compare(ceilPuchOdrQty, struct.getPUCH_ODR_QTY()) != 0) {
                    struct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                    setWarningMessage("AE00034");
                    setWarningParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   }
                  }
                 }
                 // ��������z��̌v�Z
                 String puchOdrAmount =
                  AmountCalculator.calcPuchOdrAmount(
                   struct.getPUCH_ODR_QTY(),
                   struct.getUNIT_COST(),
                   struct.getROUND_TYP(),
                   struct.getVEND_DECIMAL_FIG());
                 struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                     // �����ꍀ�ڎ擾�Z�b�g
                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
                	setErrorMessage("AA00215",ErrInfo);
                	 return;
                 }
                 // ��l�����z��̌v�Z
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                   struct.getPUCH_ODR_AMOUNT(),
                   struct.getNET_AMOUNT());
                 struct.setDISC_AMOUNT(discAmount);
                 
                //���ł̏ꍇ�ɐŊz���v�Z����
         		String lowerTaxCd =
         			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
         		if (!lowerTaxCd.equals("1")) {
        			//�o�b�`�p�����[�^�ďo
        			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
        			if(!batList.isEmpty()){
        				//�Ōv�Z���i���R�[��
        				AE0190010Struct batStruct = (AE0190010Struct)batList.get(0);
        				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
        				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
        				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
        				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
        				struct.setPVC2USERID(this.sysUSER_CD);
        				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
        				struct.setPVC2PLANTCD(this.sysPLANT_CD);
        				struct.setPVC2TAXID("5");
        				batList = entity.mcallSQLCALCTAXCALCAMTFD.call(conn, struct);
        				batStruct = (AE0190010Struct)batList.get(0);
        				if(!"1".equals(batStruct.getPNUMSTATUS())){
        					setErrorMessage(batStruct.getPVC2ERRCD());
        					return;      				       				
        				}
        				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
        				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
        				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
        				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
        			}else{
        				setErrorMessage("ZZ09007");        				
        			}
             	}else{
	                 // ��Ŋz1��̌v�Z
	                 String taxAmount1 =
	                  AmountCalculator.calcTaxAmount(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_RATE_1(),
	                   struct.getTAX_ROUND_TYP(),
	                   struct.getVEND_DECIMAL_FIG());
	                 struct.setTAX_AMOUNT_1(taxAmount1);
	                 // ��Ŋz2��̌v�Z
	                 String taxAmount2 =
	                  AmountCalculator.calcTaxAmount(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_RATE_2(),
	                   struct.getTAX_ROUND_TYP(),
	                   struct.getVEND_DECIMAL_FIG());
	                 struct.setTAX_AMOUNT_2(taxAmount2);
	                 // ��Ŋz3��̌v�Z
	                 String taxAmount3 =
	                  AmountCalculator.calcTaxAmount(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_RATE_3(),
	                   struct.getTAX_ROUND_TYP(),
	                   struct.getVEND_DECIMAL_FIG());
	                 struct.setTAX_AMOUNT_3(taxAmount3);
	                 // ��ō����z��̌v�Z
	                 String amountIncludeTax =
	                  AmountCalculator.calcAmountIncludeTax(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_AMOUNT_1(),
	                   struct.getTAX_AMOUNT_2(),
	                   struct.getTAX_AMOUNT_3());
	                 struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
	                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
	                     // �����ꍀ�ڎ擾�Z�b�g
	                    String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
	                	setErrorMessage("AA00215",ErrInfo);
	                	 return;
	                 }
             	}
         		
                 // ��M�݋��z��̌v�Z
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   struct.getAMOUNT_INCLUDE_TAX(),
                   struct.getEXCH_RATE(),
                   struct.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 struct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                      // �����ꍀ�ڎ擾�Z�b�g
                     String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
                	 setErrorMessage("AA00215",ErrInfo);
                	 return;
                 }
 
                  struct.setNON_NO_ITEM_FLG("0");
                  struct.setITEM_NAME(null);
                  struct.setPRODUCT_TYP("0");
                  struct.setSTOCK_UNIT(null);
                  struct.setINV_CTRL_FLG("1");

                  //�@����
				 String strJobOdrCD = "";
				 //
				 if("true".equals(struct.getc_JOB_ODR())) {
					 //���Ԃ������̔Ԃ��邪�A�`�F�b�NOn �̏ꍇ�A�̔Ԃ��s��
				  try{	
					    Numbering number = new Numbering(conn,Numbering.JOB_OD_CD, struct.getsUser_ID(),sp.getProcId(),struct.getPLANT_CD());
				         strJobOdrCD = number.getNo();
				
				    }catch(Exception e){
				    	setErrorMessage(e.getMessage());
					    setErrorMessage("AB00023");
					    return;
				    }

					 if(strJobOdrCD == null){
						 setErrorMessage("AB00023");
						 return;
					 }
					 struct.setJOB_ODR_CD(strJobOdrCD);
					 //���Ԃ������̔Ԃ��邪�`�F�b�NOn �̏ꍇ  0:�����̔�
					 struct.seth_JOB_ODR_INPUT_FLG("0");
				 }else{
					 strJobOdrCD = struct.getJOB_ODR_CD();
					 //���ԓ��͋敪 ���Ԃ������̔Ԃ��邪�`�F�b�NOff �̏ꍇ  1:�����
					 struct.seth_JOB_ODR_INPUT_FLG("1");
				 }
                
                 //�ݒ肳�ꂽ�V�K�̐��ԏ����A�\�ɏ]��[���Ԍv��]�֒ǉ�����B
				 entity.mT_JOB_ODR.create(conn, struct);
				 
                 //�u���ԁv�A�u���Ԏ}�ԁv�A�g���Ԏ�����הԍ��h= 0 �̑g�ݍ��킹��
                 //[���v��]��ŏd�����Ă���ꍇ
				 struct.setJOB_ODR_CD(strJobOdrCD);
                 List todList = entity.mT_OD_CHK.read(conn, struct);
                 if(!todList.isEmpty()){
               	  setErrorMessage("ZZ01102");
               	  return;
                 }
				 
                 //�u�H��R�[�h�v�A�o�^�ς݁u���ԁv�̑g�ݍ��킹��[���v�ʌv�Z����i���ԁj]�ɑ��݂��Ă��Ȃ��ꍇ�A
				// �\�ɏ]��[���v�ʌv�Z����i���ԁj]�֒ǉ�����B
				List sysjobList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, struct);
				if(sysjobList.isEmpty()){
					entity.mSYS_JOB_OD_CALC_CTRL.create(conn, struct);
				}
				
				//�I�[�_�f�}���h�ԍ��̔�
				String odNo = "";
				CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), this.sp.getProcId(), struct.getPLANT_CD());
				// �I�[�_�f�}���h�ԍ��擾
				odNo = collect.getNo();
				if(odNo == null){
					setErrorMessage("AB00045");
					return;
				}
				//�I�[�_�f�}���h�ԍ���ݒ�
				struct.setOD_NO(odNo);
				 itemStruct = null;
                 // ���v��] �̒ǉ��̂��߁A[�i��]����f�[�^���擾
                 List itemList = entity.mM_ITEM.read(conn, struct);
                 itemStruct =(AE0190010Struct)itemList.get(0);
                 
                //���v�ʏo�ɋ敪 = [�i��].�g�o�ɋ敪�h
				struct.setISSUE_TYP(itemStruct.getISSUE_TYP());
				
				//��z���[�h�^�C��  = [�i��].�g��z���[�h�^�C���h
				struct.setODR_LT(itemStruct.getODR_LT());
				
				//�Œ蕪���[�h�^�C��	= [�i��].�g�Œ蕪���[�h�^�C���h
				struct.setFIXED_LT(itemStruct.getFIXED_LT());
				
				//��ᕪ���[�h�^�C��	= [�i��].�g��ᕪ���[�h�^�C���h
				struct.setPROP_LT(itemStruct.getPROP_LT());
				
				//���S����	    = [�i��].�g���S�����h
				struct.setSAFETY_LT(itemStruct.getSAFETY_LT());
				
				//���o���[�h�^�C��	= [�i��].�g���o���[�h�^�C���h
				struct.setISSUE_LT(itemStruct.getISSUE_LT());
				
				//��ᕪ���b�g�T�C�Y	= [�i��].�g��ᕪ���b�g�T�C�Y�h
				struct.setPROP_LOT_SIZE(itemStruct.getPROP_LOT_SIZE());
				
				//���v�ʕi�ڎd���� = [�i��].�g�i�ڎd�����h
				struct.setITEM_SPOIL(itemStruct.getITEM_SPOIL());
				
				//�i�ڎ�z�敪 =[�i��].�g�i�ڎ�z�敪�h
				struct.setMRP_ODR_TYP(itemStruct.getMRP_ODR_TYP());
				
				//���v��] �̒ǉ����s���B
				entity.mT_OD.create(conn, struct);
              
                 // �����ԍ��������̔�
                 Numbering puchCdNumbering =
                  new Numbering(
                   conn,
                   Numbering.PUCH_CD,
                   sysUSER_CD,
                   sp.getProcId(),
                   struct.getPLANT_CD());
                 struct.setPUCH_ODR_CD(puchCdNumbering.getNo());
                 
                 //��������������敪 = [�i��].�g��������敪�h
                 struct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
                 // [�����c]��o�^
                 entity.mT_RLSD_PUCH_ODR.create(conn, struct);
              
                 // �o�^��f�[�^�ĕ\��
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } catch (ParseException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
		         // �t���O��������
		         _Itemflg = true;
		         String tempNetAmount = null;         	 
                 String PUCH_ODR_START_TIME = struct.getPUCH_ODR_START_TIME();
	             String PUCH_ODR_DLV_TIME = struct.getPUCH_ODR_DLV_TIME();
	             String CONFIRM_DLV_TIME = struct.getCONFIRM_DLV_TIME();
                       	                                 
                 //���͎����̃`�F�b�N(�����Ǘ�����ꍇ�̂�)
                 if((struct.getTIME_CTRL()).equals("true")){
                 	
                     //�@�����\���(����)�̃`�F�b�N
                     if((PUCH_ODR_START_TIME).length() == 3 ){
                         //�R���͓��ɂO��t����
                     	 PUCH_ODR_START_TIME = "0" + PUCH_ODR_START_TIME;
                     }
                     
                     //�A�����[��(����)�̃`�F�b�N
                     if((PUCH_ODR_DLV_TIME).length() == 3 ){
                         //�R���͓��ɂO��t����
                         PUCH_ODR_DLV_TIME = "0" + PUCH_ODR_DLV_TIME;
                     }
                     
                     //�B�����񓚔[��(����)�̃`�F�b�N
                     if((CONFIRM_DLV_TIME).length() == 3 ){
                     	//�R���͓��ɂO��t����
                        CONFIRM_DLV_TIME = "0" + CONFIRM_DLV_TIME;

                     }
                 }else{
                 	 //�����Ǘ����Ȃ��ꍇ��0000�ɐݒ�
                 	 PUCH_ODR_START_TIME = "0000";
	                 PUCH_ODR_DLV_TIME = "0000";
	                 CONFIRM_DLV_TIME = "0000";
                 }

                 // ��H��R�[�h�+������ԍ�����A[�����c]�ɑ��݂��Ȃ��Ƃ�
                 List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  return;
                 }
                 AE0190010Struct lockedStruct = (AE0190010Struct) lockedList.get(0);
                 // [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
                 if("2".equals(lockedStruct.getPUCH_ODR_STS_TYP())){
    				 /** �����񓚔[���i�����܂ށj*/
                     if(struct.getCONFIRM_DLV_DATE() != null && !("".equals(struct.getCONFIRM_DLV_DATE()))){
                     	struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
                     }
                     
                     //�u�Č��ԍ��v �� Null�̏ꍇ�A[�Č�]�����������݂��Ȃ������ꍇ
                     if(!(struct.getPROJECT_CD() == null || struct.getPROJECT_CD().length() <= 0)){
                     	List projectList =entity.mT_PROJECT_CHK.read(conn, struct);
                     	if(projectList.isEmpty()){
                     		setErrorMessage("AE01011");
                             setErrorParameter("T_PROJECT", "PROJECT_CD", struct.getPROJECT_CD());
                     	}
                     }
                     
                     // �f�[�^�X�V����
                     entity.mT_RLSD_PUCH_ODR_2.update(conn, struct);
                     conn.commit();
                     // �X�V��f�[�^�ĕ\��
                     controlSelect();   
                     return;
                 }
              
                 // ��i�ڔԍ����null�̏ꍇ�ȉ��̃`�F�b�N���s��Ȃ�
                 AE0190010Struct itemStruct = null;
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // ��i�ڔԍ�����A[�i��]�ɑ��݂��Ȃ������ꍇ
                  List itemList = entity.mM_ITEM.read(conn, struct);
                  if (itemList.isEmpty()) {
                   setErrorMessage("AE50509");
                   setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   _Itemflg = false;
                  } else {
                   itemStruct = (AE0190010Struct) itemList.get(0);
                  }
                 }
              
                //�u�Č��ԍ��v �� Null�̏ꍇ�A[�Č�]�����������݂��Ȃ������ꍇ
                if(!(struct.getPROJECT_CD() == null || struct.getPROJECT_CD().length() <= 0)){
                	List projectList =entity.mT_PROJECT_CHK.read(conn, struct);
                	if(projectList.isEmpty()){
                		setErrorMessage("AE01011");
                        setErrorParameter("T_PROJECT", "PROJECT_CD", struct.getPROJECT_CD());
                	}
                }
              
                 // [�Ɩ����t]���𕔕i���擾
                 DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());

                  // ������[�������ғ����̏ꍇ
                  if (!isWorkDay(struct.getPUCH_ODR_DLV_DATE())) {
                   setErrorMessage("AE00028");
                   setErrorParameter(
                    "T_RLSD_PUCH_ODR",
                    "PUCH_ODR_DLV_DATE",
                    struct.getPUCH_ODR_DLV_DATE());
                  }

                  
                  // ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
                  if(!"1".equals(_SysInstallOptions_ASP)){	 
                  
                	  // ������[��� < [���t����]."�Ɩ��^�p��"�̏ꍇ
                	  if (DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())
                			  < 0) {
                		  setErrorMessage("AE00030");
                		  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                		  setErrorParameter("SYS_DATE_CTRL", "BUSINESS_OPR_DATE", dcs.getBUSINESS_OPR_DATE());
                		  setErrorParameter(
                				  "T_RLSD_PUCH_ODR",
                				  "PUCH_ODR_DLV_DATE",
                				  struct.getPUCH_ODR_DLV_DATE());
                	  }
                  }
                 
                  // ������\������NotNull�̏ꍇ�A�ȉ��̃`�F�b�N���s���B
                  if (struct.getPUCH_ODR_START_DATE() != null
                   && !"".equals(struct.getPUCH_ODR_START_DATE())) {
                   // ������\��������ғ����̏ꍇ
                   if (!isWorkDay(struct.getPUCH_ODR_START_DATE())) {
                    setErrorMessage("AE00029");
                    setErrorParameter(
                     "T_RLSD_PUCH_ODR",
                     "PUCH_ODR_START_DATE",
                     struct.getPUCH_ODR_START_DATE());
                   }

                   // ASPROVA�A�g�I�v�V�����������̏ꍇ(�����ς̏ꍇ�A�ߋ����t�̓o�^��)
                   if(!"1".equals(_SysInstallOptions_ASP)){	
                   
                   		// ������\���� < [���t����]."�Ɩ��^�p��"�̏ꍇ
                	   if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())< 0) {
                		   setErrorMessage("AE00031");
                		   setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                		   setErrorParameter(
                				   "SYS_DATE_CTRL",
                				   "BUSINESS_OPR_DATE",
                				   dcs.getBUSINESS_OPR_DATE());
                		   setErrorParameter(
                				   "T_RLSD_PUCH_ODR",
                				   "PUCH_ODR_START_DATE",
                				   struct.getPUCH_ODR_START_DATE());
                	   }
                   }
                
                  }
              
                 // ����̏ꍇ�̓`�F�b�N���Ȃ�
                 if (!"1".equals(struct.getOUTSIDE_TYP())) {
                  // ������R�[�h����A[�����]�ɑ��݂��Ȃ��ꍇ
                  List vendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (vendCtrlList.isEmpty()) {
                   setErrorMessage("AE20030");
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                  } else {
                   // ������."�����ԃt���O" = 1:�����~�̏ꍇ
                   AE0190010Struct vendCtrlStruct = (AE0190010Struct) vendCtrlList.get(0);
                   if (vendCtrlStruct.getDEAL_STS_FLG().equals("1")) {
                    setErrorMessage("AE00002");
                    setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                   }
                  }
                  // �����ꏊ����A[�ۊǋ�]�ɑ��݂��Ȃ��ꍇ
                  List whList = entity.mM_WH.read(conn, struct);
                  if (whList.isEmpty()) {
                   setErrorMessage("AE00018");
                   setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                  } else {
                   // [�ۊǋ�]."�H��R�[�h" != ��H��R�[�h��̏ꍇ
                   AE0190010Struct whStruct = (AE0190010Struct) whList.get(0);
                   if (!struct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
                    setErrorMessage("AE00032");
                    setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                    setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
                    setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                   }
                  }
                  // ������S���ң != Null ���A[���[�U�}�X�^]�ɑ��݂��Ȃ��ꍇ
                  if ((struct.getPUCH_ODR_PERSON() != null)
                   && (struct.getPUCH_ODR_PERSON().length() > 0)) {
                   List userList = entity.mUSER_MST.read(conn, struct);
                   if (userList.isEmpty()) {
                    setErrorMessage("AE00005");
                    setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                   }
                  }
                 }
              
                 // [�����c]."�I�[�_�f�}���h�ԍ�"��[���v��]������
                 // [���v��]."����" != Null �̏ꍇ�̂݁A�ȉ��̃`�F�b�N�������s��
                 AE0190010Struct odStruct = null;
                 List odList = entity.mT_OD.read(conn, struct);
                 odStruct = (AE0190010Struct) odList.get(0);
                 if (odStruct.getJOB_ODR_CD() != null) {
                  // ����ԣ�ŁA[���Ԍv��]���������A[���Ԍv��]."���Ԕ[���[��" < ������[����̏ꍇ
                  List jobOdrList = entity.mT_JOB_ODR.read(conn, odStruct);
                  AE0190010Struct jobOdrStruct = (AE0190010Struct) jobOdrList.get(0);
					if(DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
						//[���Ԍv��].�g�[���h���Ɩ��^�p���ȍ~�̏ꍇ
						if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){
							setErrorMessage("AE32604");
							setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
							setErrorParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
							setErrorParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
							setErrorParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
						}else{
							//[���Ԍv��].�g�[���h���Ɩ��^�p�����ߋ��̏ꍇ
							setWarningMessage("AE32605");
							setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
							setWarningParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
							setWarningParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
							setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
						}
					}
					//[���v��].�g���ԁh�� [���Ԍv��] ���������A[���Ԍv��].�g���Ԕ[���h ���� �u�����[���v
					if(DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())!=0){
						//����[���Ԍv��].�g�[���h���Ɩ��^�p���ȍ~�̏ꍇ
						if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())>=0){
							setWarningMessage("AE01015");
							setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
							setWarningParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
							setWarningParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
							setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
						}				
					}
                 }
                 
                 // �G���[���������ꍇ�͏����𒆒f
                 if (msgStruct.hasError()) {
                     return;
                 }
                 
				//  �O��̏ꍇ�̂�
                 if ( !"1".equals(struct.getOUTSIDE_TYP()) 
						 && ( (struct.getVEND_CD() != null) && (struct.getVEND_CD().length() > 0) ) ) {
                	 TaxStruct ts = new TaxStruct();
                	 CurStruct cs = new CurStruct();
                    // [����ŋ敪]�����擾
                	 try{
                        ts =
                        TaxControl.getDataTax(
                                conn,
                                struct.getCOMPANY_CD(),
                                struct.getVEND_CD(),
                                struct.getITEM_CD(),
                                struct.getPUCH_ODR_DLV_DATE(),
                                _taxCd);
                   
                	 } catch (DataNotFoundException e){
                		 setErrorMessage("AE00017"); 
                		 return;
                	 }

 					// [�ʉ�]�����擾         
                	 try {
                	  cs =
                         CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
                	 } catch (DataNotFoundException e) {
                		 setErrorMessage(e.getCode()); 
                		 return;
                	 }
					//�������z���܂�ߏ���
					String tempOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
						struct.getPUCH_ODR_QTY(),
						struct.getUNIT_COST(),
						cs.getROUND_TYP(),
						cs.getDECIMAL_FIG());
	                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(tempOdrAmount)){
	                      // �����ꍀ�ڎ擾�Z�b�g
	                     String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
	                	 setErrorMessage("AA00215",ErrInfo);
	                	 return;
	                 }
					tempNetAmount = Calculate.subtract(tempOdrAmount, struct.getDISC_AMOUNT());
		             
                    // �G���[���������ꍇ�͏����𒆒f
                   if (msgStruct.hasError()) {
                       return;
                   }
 
                 // [����ŋ敪]�����Z�b�g

                   struct.setTAX_CD(ts.getTAX_CD());
                   struct.setTAX_RATE_1(ts.getTAX_RATE_1());
                   struct.setTAX_RATE_2(ts.getTAX_RATE_2());
                   struct.setTAX_RATE_3(ts.getTAX_RATE_3());

                  struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
  	  
	  			  struct.setROUND_TYP(cs.getROUND_TYP());
                  struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
				  }

                 // ������\������Null�̏ꍇ�A������\�������Z�o����B
                 if (struct.getPUCH_ODR_START_DATE() == null
                  || "".equals(struct.getPUCH_ODR_START_DATE())) {
                	 // �ʏ�i�̏ꍇ�͢�����[��������ɔ����\������Z�o�����̌��ʂ𔭒��\����Ƃ���B
               	  
               	  String resultDate = null;
               	  
               	  // ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
               	  if(!"1".equals(_SysInstallOptions_ASP)){	
               		  String fixedLt = odStruct.getFIXED_LT();
               		  String propLt = odStruct.getPROP_LT();
               		  String safetyLt = odStruct.getSAFETY_LT();
               		  String propLotSize = odStruct.getPROP_LOT_SIZE();
             
               		  String itemLt =
               			  Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
               		  itemLt = Calculate.multiply(itemLt, propLt);
               		  itemLt = Calculate.add(itemLt, fixedLt);
               		  itemLt = Calculate.add(itemLt, safetyLt);
               		  itemLt = Calculate.multiply(itemLt, "-1");
                 	
               		  resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(), PUCH_ODR_DLV_TIME, itemLt, true);
               		  if ("".equals(resultDate)){
               			  setErrorMessage("AE00198");
               			  return;
               		  }
               		  // �Z�o���������\��� < [���t����]."�Ɩ��^�p��"�̏ꍇ��[���t����]."�Ɩ��^�p��"�𢔭���\�����Ƃ���B
               		  if (DateTool.compareYMD(resultDate.substring(0,10), dcs.getBUSINESS_OPR_DATE()) < 0) {
                             struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
      	                   //�����͔����[���̎������Z�b�g
      		               PUCH_ODR_START_TIME = PUCH_ODR_DLV_TIME;
                         } else {
                             
                       	  //�����v�Z�������ʂ𔭒��\����Ƃ���
                             struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
                             PUCH_ODR_START_TIME = resultDate.substring(10);
                         }
                     // ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂ̃��[�h�^�C���v�Z���s���B  
               	  }else{
               		  String propLotSize = itemStruct.getPROP_LOT_SIZE();
               		  String sWkDate, sShiftMin,sWkTime ;
    	        	
    					 	ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
    					 			this.sysUSER_CD, 
    					 			this.getProgramId());
    					 	ATWorkCalendar atWC = new ATWorkCalendar(conn, 
    					 			this.sysUSER_CD , 
    					 			this.getProgramId(), 
    					 			this.sysPLANT_CD) ;
    					 	Date puchOdrStartDate = null;	  // �����\���
    					 	Date puchOdrDlvDate = null;	  // �����[��

    					 	//�����[��������̏��
    					 	puchOdrDlvDate = StrngToDt(this.struct.getPUCH_ODR_DLV_DATE() + " " + (PUCH_ODR_DLV_TIME).substring(0,2) + ":" + (PUCH_ODR_DLV_TIME).substring(2,4));
    					 	//��CHG 20081222 �����\���LT�V�t�g(�|)-----------------------------
    					 	//struct.getPUCH_ODR_QTY(), propLotSize				
    					 	sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),struct.getPUCH_ODR_QTY(),propLotSize,"U");
    					 	sShiftMin = Calculate.multiply(sShiftMin,"-1"); //�ߋ���
    					 	puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
    					 	sWkDate =DtGetDate(puchOdrStartDate);
    					 	sWkTime =DtGetTime(puchOdrStartDate);
    					 	this.struct.setPUCH_ODR_START_DATE(sWkDate);
    					 	this.struct.setPUCH_ODR_START_TIME(sWkTime);
    					 	PUCH_ODR_START_TIME = sWkTime;
    					 	_debugMsg = ("(AD0010/EJa-ASP)TIME: "
    					 			+ "PUCH_ODR_DLV_DATE" + "[" + this.struct.getPUCH_ODR_DLV_DATE() + "]," 
    					 			+ "PUCH_ODR_DLV_TIME" + "[" + PUCH_ODR_DLV_TIME + "],"  
    					 			+ "PUCH_ODR_START_DATE" + "[" + this.struct.getPUCH_ODR_START_DATE() + "],"  
    					 			+ "PUCH_ODR_START_TIME" + "[" + struct.getPUCH_ODR_START_TIME() + "], "
    					 			+ "sShiftMin" + "[" + sShiftMin + "] " );
    					 	sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
    		        
    					 	resultDate = struct.getPUCH_ODR_START_DATE() + " " +  PUCH_ODR_START_TIME;
    					 	
    					 	// �����v�Z�������ʂ𔭒��\����Ƃ���
                           struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
                           PUCH_ODR_START_TIME = resultDate.substring(11);
               	  
               	  }
                 }

                 /** �����\����i�����܂ށj*/
                 struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
				 /** �����[���i�����܂ށj*/
   			     struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
				 /** �����񓚔[���i�����܂ށj*/
                 if(struct.getCONFIRM_DLV_DATE() != null && !("".equals(struct.getCONFIRM_DLV_DATE()))){
                 	struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
                 }

                 // ������\���� < [���v��]."��z�����"�̏ꍇ
                 if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), odStruct.getODR_START_DATE()) < 0) {
  	                   setWarningMessage("AE00016");
  	                   setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
  	                   setWarningParameter("T_OD", "ODR_START_DATE", odStruct.getODR_START_DATE());
  	                   setWarningParameter(
  	                    "T_RLSD_PUCH_ODR",
  	                    "PUCH_ODR_START_DATE",
  	                    struct.getPUCH_ODR_START_DATE());
  	                  }
  	                 
                 // ������\���� = [���v��]."��z�����"�̏ꍇ
                 if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), odStruct.getODR_START_DATE()) == 0)
                 {
                     //�u�����\����v�̎��� < [���v��]."��z�����"�̏ꍇ
                     if (Double.parseDouble(PUCH_ODR_START_TIME) < Double.parseDouble(odStruct.getODR_START_TIME()))
                     {
                          setWarningMessage("AE00016");
                          setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
                          setWarningParameter("T_OD", "ODR_START_DATE", odStruct.getODR_START_DATE() + " " + odStruct.getODR_START_TIME());
                          setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_START_DATE",struct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
                     }
                 }
	                
	                 
 				//  �O��̏ꍇ�̂�
                 if ( !"1".equals(struct.getOUTSIDE_TYP()) 
						 && ( (struct.getVEND_CD() != null) && (struct.getVEND_CD().length() > 0) ) ) {
	                 if(Calculate.compare(struct.getNET_AMOUNT(), tempNetAmount) != 0){
	                  	//�w���P����Ǎ��݁A���݂���ΒP���Ǎ��𑣂��G���[�A���݂��Ȃ�(�������͉��P�����P��0)�̏ꍇ�̓��[�j���O�Ƃ��ď������s         
	                 	//���[�j���O�Ƃ��Ċۂߌ�̋��z��{�̋��z�Ƃ��A�������s         
	                	 //�A���A���i�����ł��A��i�ڔԍ����Null�̏ꍇ�͂��̎��_�Ń��[�j���O(�w���P�������݂��Ȃ�����)
	                      if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
	  	                 	PuchUnitCostStruct pucs;
	 	                 	pucs =
	 	                   PuchUnitCostControl.getDataTax(
		 	                          conn,
		 	                          _myCompanyStruct.getCOMPANY_CD(),
		 	                          struct.getVEND_CD(),
		 	                          struct.getPLANT_CD(),
		 	                          struct.getITEM_CD(),
		 	                          struct.getPUCH_ODR_START_DATE(),
		 	                          struct.getPUCH_ODR_DLV_DATE(),
		 	                          struct.getPUCH_ODR_QTY(),
	 	                 	          _taxCd);
	 	                 	
	 	                 	if("1".equals(pucs.getUNIT_COST_TYP()) &&
	 	                 			"0.00".equals(pucs.getUNIT_COST()) &&
	 	                 			"0.00".equals(pucs.getPROCESSING_COST()) &&
	 	                 			"0.00".equals(pucs.getMATERIAL_COST()) &&
	 	                 			"0.00".equals(pucs.getOTHER_OVERHEADS())){
	 	                 			struct.setNET_AMOUNT(tempNetAmount);
	 							    setWarningMessage("AE00200");                 		
	 	                 	}else{
	 							    setErrorMessage("AE00147");
	 								return;
	 	                 	}
	
	                      }else{
	                    	  	struct.setNET_AMOUNT(tempNetAmount);
	 						    setWarningMessage("AE00200"); 
	                      }
	 				}
                 }
                 // �����Ǘ��i�ڂ̏ꍇ�͔�������؂�グ�čČv�Z
                 // �i�ڔԍ���Null�̏ꍇ�͈ȉ��̏������s��Ȃ�
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // �����Ǘ��i�ڂ̏ꍇ�A��������؂�グ
                  if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
                   String ceilPuchOdrQty = Calculate.ceil(struct.getPUCH_ODR_QTY(), 0);
                   if (Calculate.compare(ceilPuchOdrQty, struct.getPUCH_ODR_QTY()) != 0) {
                    struct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                    setWarningMessage("AE00034");
                    setWarningParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   }
                  }
                 }
              
                 // DB�X�V����          
                 // <<����O��敪� = 2:�O��̏ꍇ>>
                 // �ʏ�̔����c�X�V����
             
                 // ��������z��̌v�Z
                 String puchOdrAmount =
                  AmountCalculator.calcPuchOdrAmount(
                   struct.getPUCH_ODR_QTY(),
                   struct.getUNIT_COST(),
                   struct.getROUND_TYP(),
                   struct.getVEND_DECIMAL_FIG());
                 struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                     // �����ꍀ�ڎ擾�Z�b�g
                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
                	setErrorMessage("AA00215",ErrInfo);
                	 return;
                 }
                 // ��l�����z��̌v�Z
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                   struct.getPUCH_ODR_AMOUNT(),
                   struct.getNET_AMOUNT());
                 struct.setDISC_AMOUNT(discAmount);
                 
               //���ł̏ꍇ�ɐŊz���v�Z����
          		String lowerTaxCd =
          			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
          		if (!lowerTaxCd.equals("1")) {
         			//�o�b�`�p�����[�^�ďo
         			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
         			if(!batList.isEmpty()){
         				//�Ōv�Z���i���R�[��
         				AE0190010Struct batStruct = (AE0190010Struct)batList.get(0);
         				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
         				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
         				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
         				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
         				struct.setPVC2USERID(this.sysUSER_CD);
         				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
         				struct.setPVC2PLANTCD(this.sysPLANT_CD);
         				struct.setPVC2TAXID("5");
         				batList = entity.mcallSQLCALCTAXCALCAMTFD.call(conn, struct);
         				batStruct = (AE0190010Struct)batList.get(0);
         				if(!"1".equals(batStruct.getPNUMSTATUS())){
         					setErrorMessage(batStruct.getPVC2ERRCD());
         					return;      				       				
         				}
         				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
         				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
         				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
         				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
         			}else{
         				setErrorMessage("ZZ09007");        				
         			}
              	}else{
	                  // ��Ŋz1��̌v�Z
	                  String taxAmount1 =
	                   AmountCalculator.calcTaxAmount(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_RATE_1(),
	                    struct.getTAX_ROUND_TYP(),
	                    struct.getVEND_DECIMAL_FIG());
	                  struct.setTAX_AMOUNT_1(taxAmount1);
	                  // ��Ŋz2��̌v�Z
	                  String taxAmount2 =
	                   AmountCalculator.calcTaxAmount(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_RATE_2(),
	                    struct.getTAX_ROUND_TYP(),
	                    struct.getVEND_DECIMAL_FIG());
	                  struct.setTAX_AMOUNT_2(taxAmount2);
	                  // ��Ŋz3��̌v�Z
	                  String taxAmount3 =
	                   AmountCalculator.calcTaxAmount(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_RATE_3(),
	                    struct.getTAX_ROUND_TYP(),
	                    struct.getVEND_DECIMAL_FIG());
	                  struct.setTAX_AMOUNT_3(taxAmount3);
	                  // ��ō����z��̌v�Z
	                  String amountIncludeTax =
	                   AmountCalculator.calcAmountIncludeTax(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_AMOUNT_1(),
	                    struct.getTAX_AMOUNT_2(),
	                    struct.getTAX_AMOUNT_3());
	                  struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
	                  if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
	                      // �����ꍀ�ڎ擾�Z�b�g
	                     String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
	                	 setErrorMessage("AA00215",ErrInfo);
	                	 return;
	                  }
              	}

                 // ��M�݋��z��̌v�Z
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   struct.getAMOUNT_INCLUDE_TAX(),
                   struct.getEXCH_RATE(),
                   struct.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 struct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                     // �����ꍀ�ڎ擾�Z�b�g
                    String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
               	 setErrorMessage("AA00215",ErrInfo);
               	 return;
                 }
                 // ��ʊO�̕K�v�ȃf�[�^��ݒ�
                  //���i�����i�ږ�
                  struct.setITEM_NAME(null);
                  //���i�������i�敪
                  struct.setPRODUCT_TYP("0"); 
                  //���i�����t���O
                  struct.setNON_NO_ITEM_FLG("0");
             
                 // �f�[�^�X�V����
                 entity.mT_RLSD_PUCH_ODR.update(conn, struct);
             
                 // [���v��]�̍X�V���s���B
                 
              	  // ASPROVA�A�g�I�v�V�����������̏ꍇ�F���P�ʂ̃��[�h�^�C���v�Z���s���B
              	  if(!"1".equals(_SysInstallOptions_ASP)){	
              		  
              		  CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
              		  od.changeOdInfo(struct.getOD_NO(), -1);
                    
              	  // ASPROVA�A�g�I�v�V���������ς̏ꍇ�F���ԒP�ʂ̃��[�h�^�C���v�Z���s���B
              	  }else{
              		  
              		  ATCommonOd od = new ATCommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
              		  od.changeOdInfo(struct.getOD_NO(), -1,new Integer(this.struct.getOUTSIDE_TYP()).intValue());
              	  }
                 // �X�V��f�[�^�ĕ\��
                 controlSelect();
                 
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } catch (ParseException e) {
                 throw new ExpjException(e);
                } catch (ApsComException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
                try {
                	
                  //�w���ς݂̏ꍇ�ł������񓚔[���A�����񓚔[�����l�͏C���\              

                 // ��H��R�[�h�+������ԍ�����A[�����c]�ɑ��݂��Ȃ��Ƃ�
                 List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  return;
                 }
                 
                 AE0190010Struct lockedStruct = (AE0190010Struct) lockedList.get(0);
                 // [�����c]."������ԋ敪" = 2:�w���ς̏ꍇ
                 if (!"1".equals(lockedStruct.getPUCH_ODR_STS_TYP())) {
               	     setErrorMessage("AE32610");
                     setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                     return;
                 }
                 // [�����c]."�X�V��"���Z�[�u�X�V��(hidden�g�p)�̏ꍇ
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
              
                 // �G���[���������ꍇ�͏����𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // [�����c]�̍폜
                 entity.mT_RLSD_PUCH_ODR.delete(conn, struct);
              
                 // [���v��]�̍X�V �y���ʁ@���v�ʍX�V�������Q�Ɓz�@�����ʕ��i���g�p����
                  CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
                  od.changeOdInfo(struct.getOD_NO(), -1);

              
                 // ��ʂ�������
                 controlClear();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ApsComException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
				try{
					readStatus = INITIAL;
	                // ��ʂ�������
	                initializeAll();
					// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
					AE0190010Struct TIME_CTRLStruct = new AE0190010Struct();
					List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
					if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
						TIME_CTRLStruct = (AE0190010Struct)TIME_CTRLList.get(0);
						struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
					}else{
						struct.setTIME_CTRL(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// �G���[�������L�q���Ă��������B
					// 
				}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // [����]���𕔕i���擾			
                 _myCompanyStruct = MyCompanyControl.getData(conn);
                 // [�Ŗ�]���𕔕i���擾			
                 _taxNameStruct = TaxNameControl.getData(conn);
                 // [�M��]���𕔕i���擾			
                 _homeCurStruct = HomeCurControl.getData(conn);
                 // �R���{�{�b�N�X�f�[�^�𕔕i���擾
                 ComboBox cdac = new ComboBox(conn, sysUSER_CD);
                 _splItemTypStruct = cdac.getData("SPL_ITEM_TYP");
                 _unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
                 cdac.setConnection(null);
              
                 // ��ʂ�������
                 initializeAll();
              
				 // �V�X�e���p�����[�^�iTIME_CTRL�j�擾
				 AE0190010Struct TIME_CTRLStruct = new AE0190010Struct();
				 List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				 if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
			 		TIME_CTRLStruct = (AE0190010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				 }else{
					struct.setTIME_CTRL(null);
				 }
				 
				 
				 // ASPROVA�A�g�I�v�V�����C���X�g�[���t���O�̎擾
				 List InstallOptionList_ASP = entity.mSYS_INSTALL_OPTIONS_ASP.read(conn, struct);
				 if (InstallOptionList_ASP.isEmpty()) {
				  	 struct.setASP_INSTALL_FLG(null);			
				 }else{
					 struct.setASP_INSTALL_FLG(((AE0190010Struct)InstallOptionList_ASP.get(0)).getASP_INSTALL_FLG());
				 }
				 
				 _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
				 
				 // JF�C���X�g�[���t���O�̎擾
				 List InstallOptionList_JF = entity.mSYS_INSTALL_OPTIONS_JF.read(conn, struct);
				 if (InstallOptionList_JF.isEmpty()) {
				  	 struct.setJF_INSTALL_FLG(null);			
				 }else{
					 struct.setJF_INSTALL_FLG(((AE0190010Struct)InstallOptionList_JF.get(0)).getJF_INSTALL_FLG());
				 }
				 
				 _SysInstallOptions_JF = struct.getJF_INSTALL_FLG();
				 
                 // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
                 if (isScreenMove() == true) {
                  // �L�[�ƂȂ鍀�ڂ�struct�Ɋi�[���āA�����̃R���g���[�����\�b�h���Ăяo���܂��B
                  struct.setPLANT_CD(_plantCd);
                  struct.setPUCH_ODR_CD(_puchOdrCd);
                  controlSelect();
                 }
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                // �_�E�����[�h�t�@�C�����N���A
                // PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŢDOWNLOAD_FILE����`���A���̍s�̃R�����g���O���Ă��������B
                //			struct.setDOWNLOAD_FILE((String)null);
                // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                 // ���X�g�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                 struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
              
                 struct.setHOME_CUR_UNIT(_homeCurStruct.getCUR_UNIT());
                 struct.setHOME_DECIMAL_FIG(_homeCurStruct.getDECIMAL_FIG());
              
                 struct.setList_SPL_ITEM_TYP_val(_splItemTypStruct.getValList());
                 struct.setList_SPL_ITEM_TYP_name(_splItemTypStruct.getExplanList());
                 struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
                 struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
              
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0190010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0190010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0190010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0190010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0190010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0190010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0190010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0190010Entity entity;
	protected AE0190010Struct struct;
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

		entity = new AE0190010Entity();
		struct = new AE0190010Struct();

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
	 * AE0190010�N���X�̕W���R���X�g���N�^
	 */
	public AE0190010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                // TODO: �����ɏ����������L�q���Ă�������
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
                // TODO: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
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
				AE0190010Struct key = (AE0190010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_QTY") && key.geth_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_QTY", key.geth_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name") && key.getSPL_ITEM_TYP_name() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_name", key.getSPL_ITEM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val") && key.getSPL_ITEM_TYP_val() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_val", key.getSPL_ITEM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP") && key.geth_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("h_SPL_ITEM_TYP", key.geth_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR") && key.getc_JOB_ODR() != null) {
					msgKey.setKeyValue("c_JOB_ODR", key.getc_JOB_ODR());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ALC_GRP_CD") && key.geth_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("h_ALC_GRP_CD", key.geth_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_TIME") && key.getCONFIRM_DLV_TIME() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_TIME", key.getCONFIRM_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_MAINT_FLG") && key.getPUCH_MAINT_FLG() != null) {
					msgKey.setKeyValue("PUCH_MAINT_FLG", key.getPUCH_MAINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_COMMENT") && key.getCONFIRM_DLV_DATE_COMMENT() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE_COMMENT", key.getCONFIRM_DLV_DATE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL") && key.getPUCH_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_ALL", key.getPUCH_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL") && key.getPUCH_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_ALL", key.getPUCH_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_ALL") && key.getCONFIRM_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE_ALL", key.getCONFIRM_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_LT") && key.getODR_LT() != null) {
					msgKey.setKeyValue("ODR_LT", key.getODR_LT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_LT") && key.getISSUE_LT() != null) {
					msgKey.setKeyValue("ISSUE_LT", key.getISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("DEAL_STS_FLG") && key.getDEAL_STS_FLG() != null) {
					msgKey.setKeyValue("DEAL_STS_FLG", key.getDEAL_STS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_TIME") && key.getODR_START_TIME() != null) {
					msgKey.setKeyValue("ODR_START_TIME", key.getODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_INPUT_FLG") && key.geth_JOB_ODR_INPUT_FLG() != null) {
					msgKey.setKeyValue("h_JOB_ODR_INPUT_FLG", key.geth_JOB_ODR_INPUT_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("PVC2TAXID") && key.getPVC2TAXID() != null) {
					msgKey.setKeyValue("PVC2TAXID", key.getPVC2TAXID());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT") && key.getPNUMTAXOUTAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXOUTAMOUNT", key.getPNUMTAXOUTAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT") && key.getPNUMTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXAMOUNT", key.getPNUMTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT") && key.getPNUMEXTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXSALESAMOUNT", key.getPNUMEXTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT") && key.getPNUMINTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXSALESAMOUNT", key.getPNUMINTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT") && key.getPNUMTAXFREESALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXFREESALESAMOUNT", key.getPNUMTAXFREESALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT") && key.getPNUMEXTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXAMOUNT", key.getPNUMEXTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT") && key.getPNUMINTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXAMOUNT", key.getPNUMINTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PVC2ERRCD") && key.getPVC2ERRCD() != null) {
					msgKey.setKeyValue("PVC2ERRCD", key.getPVC2ERRCD());
				}
				if(msgKeyType.containsKeyColumn("PNUMSTATUS") && key.getPNUMSTATUS() != null) {
					msgKey.setKeyValue("PNUMSTATUS", key.getPNUMSTATUS());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JF_INSTALL_FLG") && key.getJF_INSTALL_FLG() != null) {
					msgKey.setKeyValue("JF_INSTALL_FLG", key.getJF_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
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
					AE0190010Struct key = new AE0190010Struct();
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_QTY")) {
						key.seth_PUCH_ODR_QTY(msgKey.getKeyValue("h_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name")) {
						key.setSPL_ITEM_TYP_name(msgKey.getKeyValue("SPL_ITEM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val")) {
						key.setSPL_ITEM_TYP_val(msgKey.getKeyValue("SPL_ITEM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP")) {
						key.seth_SPL_ITEM_TYP(msgKey.getKeyValue("h_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR")) {
						key.setc_JOB_ODR(msgKey.getKeyValue("c_JOB_ODR"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ALC_GRP_CD")) {
						key.seth_ALC_GRP_CD(msgKey.getKeyValue("h_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_TIME")) {
						key.setCONFIRM_DLV_TIME(msgKey.getKeyValue("CONFIRM_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_MAINT_FLG")) {
						key.setPUCH_MAINT_FLG(msgKey.getKeyValue("PUCH_MAINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_COMMENT")) {
						key.setCONFIRM_DLV_DATE_COMMENT(msgKey.getKeyValue("CONFIRM_DLV_DATE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL")) {
						key.setPUCH_ODR_START_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL")) {
						key.setPUCH_ODR_DLV_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_ALL")) {
						key.setCONFIRM_DLV_DATE_ALL(msgKey.getKeyValue("CONFIRM_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_LT")) {
						key.setODR_LT(msgKey.getKeyValue("ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_LT")) {
						key.setISSUE_LT(msgKey.getKeyValue("ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("DEAL_STS_FLG")) {
						key.setDEAL_STS_FLG(msgKey.getKeyValue("DEAL_STS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_TIME")) {
						key.setODR_START_TIME(msgKey.getKeyValue("ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_INPUT_FLG")) {
						key.seth_JOB_ODR_INPUT_FLG(msgKey.getKeyValue("h_JOB_ODR_INPUT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2TAXID")) {
						key.setPVC2TAXID(msgKey.getKeyValue("PVC2TAXID"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT")) {
						key.setPNUMTAXOUTAMOUNT(msgKey.getKeyValue("PNUMTAXOUTAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT")) {
						key.setPNUMTAXAMOUNT(msgKey.getKeyValue("PNUMTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT")) {
						key.setPNUMEXTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT")) {
						key.setPNUMINTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT")) {
						key.setPNUMTAXFREESALESAMOUNT(msgKey.getKeyValue("PNUMTAXFREESALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT")) {
						key.setPNUMEXTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT")) {
						key.setPNUMINTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PVC2ERRCD")) {
						key.setPVC2ERRCD(msgKey.getKeyValue("PVC2ERRCD"));
					}
					if(msgKeyType.containsKeyColumn("PNUMSTATUS")) {
						key.setPNUMSTATUS(msgKey.getKeyValue("PNUMSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JF_INSTALL_FLG")) {
						key.setJF_INSTALL_FLG(msgKey.getKeyValue("JF_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
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
