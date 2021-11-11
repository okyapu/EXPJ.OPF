/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0030/src/com/nec/jp/orteus/metamorBase/KR0030/KR0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0030;

import com.nec.jp.orteus.metamorBase.KR0030.*;
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
import java.math.BigDecimal;
import com.nec.jp.orteus.expj.sa.amount.SaAmountCalculator;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;

import com.nec.jp.orteus.expj.sa.ArIf;
import com.nec.jp.orteus.expj.sa.ArIfIn;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KR0030010Control
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
        public KR0030010Struct getListvalue(int x) {
         return (KR0030010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public KR0030010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public KR0030010Struct createStruct() {
         return new KR0030010Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((KR0030010Struct) structname);
        } // Struct���Z�b�g���܂��B
        public void initializeStruct() {
         this.struct.initialize();
        } // Struct�̒l�����������܂��B
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
       
        // TOMATEC ADD BY WANGWENMEI 20140619 START
        /** �M�݃t���O */
        private boolean bIsJpCur;
        // TOMATEC ADD BY WANGWENMEI 20140619 END
        
        /** �̔ԗp�̍H��R�[�h */
        protected String salesPLANT_CD;
        public void setSalesPLANT_CD(String name) { this.salesPLANT_CD = name; };
        public String getSalesPLANT_CD() { return this.salesPLANT_CD; };
       
        /** �ʉݏ������� */
        private int decimalFig = 0;
        
        // ----- �V�X�e���ݒ�l�擾 ---------------	
    	private PrivateConfig privateConfig;
        // ----- �V�X�e���ݒ�l�擾 ---------------		
    	
    	/** �I�����F */
    	String aprSales = "";	
       
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
         * Struct�̒l���Z�b�g���܂��B
         * @param s ���������f�[�^
         */
        private void setStruct(KR0030010Struct s) {
         struct.seth_SALES_SEQ_NO(s.geth_SALES_SEQ_NO());
         struct.setSLIP_CD(s.getSLIP_CD());
         struct.setSALES_DATE(s.getSALES_DATE());
         struct.setCUST_CD(s.getCUST_CD());
         struct.setCUST_ANAME(s.getCUST_ANAME());
         struct.setSALES_DEPT_CD(s.getSALES_DEPT_CD());
         struct.setORG_NAME(s.getORG_NAME());
         struct.setCUST_CHRG_PSN_CD(s.getCUST_CHRG_PSN_CD());
         struct.setUSER_NAME(s.getUSER_NAME());
         struct.setITEM_CD(s.getITEM_CD());
         struct.setITEM_NAME(s.getITEM_NAME());
         struct.setCUST_ODR_NO(s.getCUST_ODR_NO());
         struct.setSALES_QTY(s.getSALES_QTY());
         struct.setSALES_UNIT_PRICE(s.getSALES_UNIT_PRICE());
         struct.setSALES_AMOUNT(s.getSALES_AMOUNT());
         struct.setCUR_UNIT(s.getCUR_UNIT());
         struct.setREMARKS(s.getREMARKS());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
       
         struct.seth_SLIP_CD(s.getSLIP_CD());
         struct.setCUR_UNIT2(s.getCUR_UNIT());
         struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
         struct.setUNIT_QTY_TYP(s.getUNIT_QTY_TYP());
         struct.setAI_AR_IF_FLG(s.getAI_AR_IF_FLG());
         struct.setTAX_CD(s.getTAX_CD());  //add 2014.08.29 nec
         struct.seth_TAX_CD(s.geth_TAX_CD());  //add 2014.08.19 nec
        }
       
        /**
         * Struct�̒l���Z�b�g���܂��B
         * @param s ���������f�[�^
         */
        private void setStructSystemData(KR0030010Struct s) {
         s.setsOraganization_CD(struct.getsOrganization_CD());
         s.setsSysdate(struct.getsSysdate());
         s.setsUser_ID(sysUSER_CD);
         
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        private void initializeAll() {
         struct.setSLIP_CD(null);
		 struct.seth_SALES_SEQ_NO(null);
       
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
         struct.setSALES_DATE(null);
         struct.setCUST_CD(null);
         struct.setCUST_ANAME(null);
         struct.setSALES_DEPT_CD(null);
         struct.setORG_NAME(null);
         struct.setCUST_CHRG_PSN_CD(null);
         struct.setUSER_NAME(null);
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setCUST_ODR_NO(null);
         struct.setSALES_QTY("0");
         struct.setSALES_UNIT_PRICE("0");
         struct.setSALES_AMOUNT("0");
         struct.setCUR_UNIT(null);
         struct.setREMARKS(null);
         struct.setTAX_CD(null);  //add 2014.08.19 nec
         struct.seth_TAX_CD(null);  //add 2014.08.29 nec
       
         struct.seth_SLIP_CD(null);
         struct.setCUR_UNIT2(null);
         struct.setSTOCK_UNIT(null);
         struct.setUNIT_QTY_TYP(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * �M�݊��Z�B
         * @param amount �Ώۋ��z
         * @param s �X�g���N�g�I�u�W�F�N�g
         * @return �M�݋��z
         * @throws SQLException �������s
         * @throws ExpjException  �������s
         */
        private String exchAmount(String amount, KR0030010Struct s)
         throws SQLException, ExpjException {
       
         ExchAmount exch = new ExchAmount(conn);
       
         boolean result =
          exch.doExchAmount(
           amount,
           s.getCOMPANY_CD(),
           s.getCUR_CD(),
           s.getEXCH_TYP(),
           s.getDETAIL_ROUND_TYP(),
           s.getSALES_DATE());
       
         if (!result) {
          setErrorMessage("KQ00038");
          setErrorParameter("M_EXCH_RATE", "CUR_CD", s.getCUR_CD());
          return "0";
         }
         double exchAmount = exch.getD_EXCH_AMOUNT();
         BigDecimal b = new BigDecimal(exchAmount);
       
         // TOMATEC ADD BY WANGWENMEI 20140618 START
         bIsJpCur = exch.isB_ISJPCUR();
         // TOMATEC ADD BY WANGWENMEI 20140618 END
         
         return b.toString();
        }
       
        /**
         * �ۂ߁B
         * @param amount �Ώۋ��z
         * @param s �X�g���N�g�I�u�W�F�N�g
         * @return �ۂߋ��z
         * @throws SQLException �������s
         * @throws ExpjException �������s
         */
        private String roundAmount(String amount, KR0030010Struct s)
         throws SQLException, ExpjException {
       
         ExchAmount exch = new ExchAmount(conn);
       
         boolean result =
          exch.doMarume(
           amount,
           s.getCOMPANY_CD(),
           s.getCUR_CD(),
           s.getEXCH_TYP(),
           s.getDETAIL_ROUND_TYP(),
           s.getSALES_DATE());
       
         if (!result) {
          throw new ExpjException("KQ00038");
         }
       
       //		double roundAmount = exch.getD_EXCH_AMOUNT();
       //		BigDecimal b = new BigDecimal(roundAmount);
       
       //		return b.toString();
         return exch.getS_EXCH_AMOUNT();
        }

      private void chkTaxCode(){
         // ����œK�p�敪��1:���i�}�X�^�̏���ŃR�[�h�̏ꍇ
         if("1".equals(struct.getTAX_APPLY_TYP())){
         	  if(null == struct.geth_TAX_CD() || "".equals(struct.geth_TAX_CD())){
			          setErrorMessage("KR00018");
			          setErrorParameter("M_CUST", "COMPANY_CD", struct.getCOMPANY_CD());
			          setErrorParameter("M_CUST", "CUST_CD", struct.getCUST_CD());
			          return;
	          }else{
                setWarningMessage("KR00019");
	          }
         }
      }
      
      /**
       * �V�X�e���p�����[�^�`�F�b�N       
       * @throws SQLException �������s
       * @throws ExpjException �������s
     * @throws FoundationException 
       */
      private void chkAprSales()
      throws SQLException, ExpjException, FoundationException {
    	  String installFlg = "";
          List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
          if(installOptionsList.size() > 0){
        	  installFlg = ((KR0030010Struct)installOptionsList.get(0)).getINSTALL_FLG();
        	  
          }
          if (installOptionsList.isEmpty() || "0".equals(installFlg)) {  
              // ���|�Ǘ����C���X�g�[������Ă��Ȃ��B
   	        
   	           /** �p�����[�^�u������я��F�v���擾*/
   	           privateConfig = new PrivateConfig(conn);
   	           aprSales = privateConfig.getString("APR_SALES");
   	           // �p�����[�^�u������я��F�v���擾�ł��Ȃ������ꍇ
   	          if(aprSales == null || "".equals(aprSales)){
    				String locale = CoreTools.getLocale(struct.getsUser_ID());
    				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
    				setErrorMessage("AZ00041", messages.getString("AZ00074"));
    				aprSales = "0";
   	            	return;
   	          }else if(!"1".equals(aprSales)){   	        	  
   				  // �P�ȊO�̏ꍇ
   	        	  aprSales = "0";
   	          }else{
   	        	  // �P�̏ꍇ
   	              aprSales = "1";
   	          }
   	          //������я��F��1�F�s���ꍇ
   	          if("1".equals(aprSales)){
   	   	          //�`�[�ԍ���[�������]���������A���F�󋵁�1:���F�҂��@�̏ꍇ
   	   	          List tSalesApprList = entity.mT_SALES_ApprFlg.read(conn,struct);
   	   	          if(tSalesApprList != null && tSalesApprList.size() > 0){
   	   	        	  setErrorMessage("KR00025");
   	   	        	  return;
   	   	          }   	        	  
   	          }   
          }
    	  
      }
 
      /**
       * �V�X�e���p�����[�^�`�F�b�N       
       * @throws SQLException �������s
       * @throws ExpjException �������s
     * @throws FoundationException 
       */
      private boolean blnchkAprSales()
      throws SQLException, ExpjException, FoundationException {
    	  
   	           /** �p�����[�^�u������я��F�v���擾*/
   	           privateConfig = new PrivateConfig(conn);
   	           aprSales = privateConfig.getString("APR_SALES");
   	           // �p�����[�^�u�������F�v���擾�ł��Ȃ������ꍇ
   	          if(aprSales == null || "".equals(aprSales)){
    				String locale = CoreTools.getLocale(struct.getsUser_ID());
    				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
    				setErrorMessage("AZ00041", messages.getString("AZ00074"));
    				aprSales = "0";
   	            	return false;
   	          }else if(!"1".equals(aprSales)){   	        	  
   				  // �P�ȊO�̏ꍇ
   	        	  return false;
   	          }else{
   	        	  // �P�̏ꍇ
   	        	 return true;
   	          }     	  
      }
        private KR0030010Struct createDebitRecord()
         throws FoundationException, SQLException, ExpjException {
         KR0030010Struct s = new KR0030010Struct();
         // ����敪
         s.setSALES_TYP("3");
         // ���Ӑ�R�[�h
         s.setCUST_CD(struct.getCUST_CD());
         // �i�ڔԍ�
         s.setITEM_CD(struct.getITEM_CD());
         // �i�ږ���
         s.setITEM_NAME(struct.getITEM_NAME());
         // ���Ӑ撍���ԍ�
         s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
         // ����v���
         s.setSALES_DATE(struct.getSALES_DATE());
         // ����v�㕔��
         s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
         // �����R�[�h
         s.setVEND_CD(null);
         // �����ꏊ�R�[�h
         s.setPRD_ODR_PLACE_CD(null);
         // �c�ƒS���҃R�[�h
         s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
         // ���s�S���҃R�[�h
         s.setODR_ACPT_PSN_CD(null);
         // ������ѐ���
         s.setSALES_QTY(struct.getSALES_QTY());
         // �P��
         s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
         // �P��
         s.setUNIT_CD(struct.getSTOCK_UNIT());
         // ������ы��z
         s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
         // ������ы��z(�M��)
         String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
         if (msgStruct.hasError()) {
          return s;
         }
         s.setSALES_AMOUNT_EXCH_RATES(salesAmountExchRates);
         // ��̌�����
         s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
         // ��̌�����
         s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
       
         // �O�őΏۋ��z
         String externalTaxSalesAmount =
          SaAmountCalculator.calcExternalTaxSalesAmount(
           struct.geth_TAX_CD(),
           s.getSALES_AMOUNT());
         s.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxSalesAmount);
         // ���őΏۋ��z
         String internalTaxSalesAmount =
          SaAmountCalculator.calcInternalTaxSalesAmount(
           struct.geth_TAX_CD(),
           s.getSALES_AMOUNT());
         s.setINTERNAL_TAX_SALES_AMOUNT(internalTaxSalesAmount);
         // ��ېőΏۋ��z
         String taxfreeSalesAmount =
          SaAmountCalculator.calcTaxfreeSalesAmount(
           struct.geth_TAX_CD(),
           s.getSALES_AMOUNT());
         s.setTAXFREE_SALES_AMOUNT(taxfreeSalesAmount);
         	
//ADD 2014.08.29 NEC STR
         //����ł̐ݒ�
         s.seth_TAX_CD(struct.geth_TAX_CD());
//ADD 2014.08.29 NEC END
         	
         // [�����]������
         List taxList = entity.mM_TAX.read(conn, struct);
         KR0030010Struct taxStruct = (KR0030010Struct) taxList.get(0);
         // [�M��]������
         List homeCurList = entity.mSYS_HOME_CUR.read(conn, struct);
         KR0030010Struct homeCurStruct = (KR0030010Struct) homeCurList.get(0);
       
         // �Ŋz�P
         String taxAmount1 =
          SaAmountCalculator.calcTaxAmount(
           struct.geth_TAX_CD(),
           s.getSALES_AMOUNT(),
           taxStruct.getTAX_RATE_1(),
           String.valueOf(this.decimalFig),
           taxStruct.getTAX_ROUND_TYP());
         s.setTAX_AMOUNT_1(taxAmount1);
         // �Ŋz�Q
         String taxAmount2 =
          SaAmountCalculator.calcTaxAmount(
           struct.geth_TAX_CD(),
           s.getSALES_AMOUNT(),
           taxStruct.getTAX_RATE_2(),
           String.valueOf(this.decimalFig),
           taxStruct.getTAX_ROUND_TYP());
         s.setTAX_AMOUNT_2(taxAmount2);
         // �Ŋz�R
         String taxAmount3 =
          SaAmountCalculator.calcTaxAmount(
           struct.geth_TAX_CD(),
           s.getSALES_AMOUNT(),
           taxStruct.getTAX_RATE_3(),
           String.valueOf(this.decimalFig),
           taxStruct.getTAX_ROUND_TYP());
         s.setTAX_AMOUNT_3(taxAmount3);
         // ����Ŋz�i�O�Łj
         String externalTaxAmount =
          SaAmountCalculator.calcExternalTaxAmount(
           struct.geth_TAX_CD(),
           s.getTAX_AMOUNT_1(),
           s.getTAX_AMOUNT_2(),
           s.getTAX_AMOUNT_3());
         s.setEXTERNAL_TAX_AMOUNT(externalTaxAmount);
         // ����Ŋz�i���Łj
         String internalTaxAmount =
          SaAmountCalculator.calcInternalTaxAmount(
           struct.geth_TAX_CD(),
           s.getTAX_AMOUNT_1(),
           s.getTAX_AMOUNT_2(),
           s.getTAX_AMOUNT_3());
         s.setINTERNAL_TAX_AMOUNT(internalTaxAmount);
       
         // �Ŕ�������z
         String taxCreditSalesAmount =
          SaAmountCalculator.calcTaxCreditSalesAmount(
           s.getEXTERNAL_TAX_SALES_AMOUNT(),
           s.getINTERNAL_TAX_SALES_AMOUNT(),
           s.getTAXFREE_SALES_AMOUNT(),
           s.getINTERNAL_TAX_AMOUNT());
         s.setTAX_CREDIT_SALES_AMOUNT(taxCreditSalesAmount);
       
         // �Ŕ�������z�i�M�݁j
         String taxCreditSalesAmountExchRates = exchAmount(taxCreditSalesAmount, struct);
         if (msgStruct.hasError()) {
          return s;
         }
         s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(taxCreditSalesAmountExchRates);
       
         // TOMATEC ADD BY WANGWENMEI 20140619 START
         // �בփ��[�g
         // �M�݂̏ꍇ
         if (bIsJpCur) {
        	// �בփ��[�g
        	 s.setEXCH_RATE("1");
         } else {
            List tempList = new ArrayList();
            // �בփ��[�g���擾
            tempList = entity.mselectM_EXCH_RATE.read(conn, struct);
            
            s.setEXCH_RATE(((KR0030010Struct)tempList.get(0)).getEXCH_RATE());
         }
         // TOMATEC ADD BY WANGWENMEI 20140619 END
         
         //������ъǗ��ԍ�
         s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
         // ���`�[�ԍ�
         s.setORG_SLIP_CD(null);
         // �ʉ݃R�[�h
         s.setCURRNCY_CD(struct.getCUR_CD());
         // ���l�敪
         s.setSPCL_PRICE_CO(null);
         // ���l
         s.setREMARKS(struct.getREMARKS());
         // �����敪
         s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
         // ��ԋ敪
         s.setSTATUS("20");
         // �폜�t���O
         s.setDEL_FLG("0");
     	  
         //�V�X�e���p�����[�^(���F)�`�F�b�N
    	  if(blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
    	  
         setStructSystemData(s);
       
         return s;
        }
       
        private KR0030010Struct createCreditRecord() throws ExpjException,FoundationException, SQLException {
         List l = entity.mT_SALES_CreditRecord.read(conn, struct);
         KR0030010Struct s = (KR0030010Struct) l.get(0);
         
         //������ъǗ��ԍ�
         s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
         
         //�V�X�e���p�����[�^(���F)�`�F�b�N
    	  if(blnchkAprSales() == true){
    	  	s.setAPPR_FLG("1");
    		s.setAPPR_ID(null);
    		s.setAPPR_DATE(null);
    	  }else{
    		s.setAPPR_FLG("3");
    		s.setAPPR_ID(getsysUSER_CD());
    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
    	  }	 
         setStructSystemData(s);
       
         return s;
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 // �Ɩ��^�p��
                 struct.setPLANT_CD(getsysPLANT_CD());
                 List dateList = entity.mSYS_DATE_CTRL.read(conn, struct);
                 if (!dateList.isEmpty()) {
                  KR0030010Struct dateStruct = (KR0030010Struct)dateList.get(0);
                  struct.setBUSINESS_OPR_DATE(dateStruct.getBUSINESS_OPR_DATE());
                 }
                 else {
                  struct.setBUSINESS_OPR_DATE("");
                 }
              
                 // ��ʕ\���p�f�[�^�Ǎ�
                 List formList = entity.mForm.read(conn, struct);
                 // ��ʕ\���p�f�[�^��0���̏ꍇ
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                  return;
                 }
              
                 KR0030010Struct formStruct = (KR0030010Struct) formList.get(0);
              
                 List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
                 if (installOptionsList.isEmpty()) {
                  // ���|�Ǘ����C���X�g�[������Ă��Ȃ��B
                  if (Calculate.compare(formStruct.getSTATUS(), "40") >= 0) {
                   setErrorMessage("BD00027");
                   setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                   return;
                  }
                 } else {
                  // ���|�Ǘ����C���X�g�[������Ă���B
              
                  // [���|���g�����w�b�_]."�`�[�ԍ�" = ��`�[�ԍ�� + [���|���g�����w�b�_]."�`�[���" = 14 �Ō���
                  // [���|���g�����w�b�_]."��ԋ敪" >= 40 �̏ꍇ
                  List arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
                  if (!arLedgerHTrnList.isEmpty()) {
                   KR0030010Struct arLedgerHTrnStruct = (KR0030010Struct) arLedgerHTrnList.get(0);
                   if (Calculate.compare(arLedgerHTrnStruct.getSTATUS(), "40") >= 0) {
                    setErrorMessage("BD00027");
                    setErrorParameter("T_AR_LEDGER_H_TRN", "SLIP_CD", struct.getSLIP_CD());
                    return;
                   }
                  }
                  // [���|�������w�b�_]."�`�[�ԍ�" = ��`�[�ԍ�� + [���|�������w�b�_]."�`�[���" = 14 �Ō���
                  // [���|�������w�b�_]."��ԋ敪" >= 40 �̏ꍇ
                  List arLedgerHList = entity.mT_AR_LEDGER_H.read(conn, struct);
                  if (!arLedgerHList.isEmpty()) {
                   KR0030010Struct arLedgerHStruct = (KR0030010Struct) arLedgerHList.get(0);
                   if (Calculate.compare(arLedgerHStruct.getSTATUS(), "40") >= 0) {
                    setErrorMessage("BD00027");
                    setErrorParameter("T_AR_LEDGER_H", "SLIP_CD", struct.getSLIP_CD());
                    return;
                   }
                  }
                 }
              
                 // ��ʃf�[�^��ݒ�
                 setStruct(formStruct);
              
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �Čv�Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRecalc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");
			//{{user_implement_dev:<controlRecalc>
                try {
                 // ����Ӑ�R�[�h���[���Ӑ�]�ɑ��݂��Ȃ��ꍇ
                 List custList = entity.mM_CUST.read(conn, struct);
                 if (custList.isEmpty()) {
                  setErrorMessage("KA00032");
                 }
                 // �����S������R�[�h���[����]�ɑ��݂��Ȃ��ꍇ
                 List orgList = entity.mM_ORG.read(conn, struct);
                 if (orgList.isEmpty()) {
                  setErrorMessage("KA00058");
                 }
                 // �����S���҃R�[�h���[���[�U]�ɑ��݂��Ȃ��ꍇ
                 List userList = entity.mUSER_MST.read(conn, struct);
                 if (userList.isEmpty()) {
                  setErrorMessage("KU01000");
                 }
                 // ����Ӑ�R�[�h���[���Ӑ�]."����ʉ݃R�[�h"��[�ʉ�]�ɑ��݂��Ȃ��ꍇ
                 List curList = entity.mM_CUR.read(conn, struct);
                 if (curList.isEmpty()) {
                  setErrorMessage("KQ00073");
                 } else {
                  // �������z��̏�������[�ʉ�]."��������"�𒴂��Ă����ꍇ
                  KR0030010Struct curStruct = (KR0030010Struct) curList.get(0);
                  this.decimalFig = Integer.parseInt(curStruct.getDECIMAL_FIG());
                  if (Calculate.compare(struct.getSALES_QTY(), "0") <= 0
                   && Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") <= 0) {
                   if (NumberTool.getRealScale(struct.getSALES_AMOUNT())
                    > Integer.parseInt(curStruct.getDECIMAL_FIG())) {
                    setErrorMessage("KU01003");
                   }
                  }
                 }
                //add 2014.08.29 nec str
                KR0030010Struct custStruct = (KR0030010Struct) custList.get(0);
                
                if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){
                	//���.����ŃR�[�h�����͂�����ĂȂ��ꍇ�A���Ӑ�̏���ŃR�[�h�ŏ�������
                	struct.seth_TAX_CD(custStruct.getw_TAX_CD());      
                }else {
                	//���.�����ŃR�[�h������͂����ꂽ�ꍇ�A���A[����ŋ敪�}�X�^]�ɑ��݂��Ȃ��ꍇ�G���[
                	struct.seth_TAX_CD(struct.getTAX_CD());    
                	List taxList = entity.mM_TAX_chk.read(conn, struct);
         			if (taxList.isEmpty()) {
						setErrorMessage("AA01001");
					}
                }
				//add 2014.08.29 nec end
                	
                 // �G���[���������ꍇ�͏����𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // [���Ӑ�]����ݒ�
                 //KR0030010Struct custStruct = (KR0030010Struct) custList.get(0);   2014.08.29 DEL
                 struct.setCOMPANY_CD(custStruct.getCOMPANY_CD());
                 struct.setCUST_CD(custStruct.getCUST_CD());
                 struct.setCUST_ANAME(custStruct.getCUST_ANAME());
                 struct.setCUR_CD(custStruct.getCUR_CD());
                 struct.setEXCH_TYP(custStruct.getEXCH_TYP());
                 struct.setINSPC_ACPT_TYP(custStruct.getINSPC_ACPT_TYP());
                 struct.setTAX_APPLY_TYP(custStruct.getTAX_APPLY_TYP());
                 struct.setDETAIL_ROUND_TYP(custStruct.getDETAIL_ROUND_TYP());
                 struct.setCUST_CD(custStruct.getCUST_CD());
                 // [����]����ݒ�
                 KR0030010Struct orgStruct = (KR0030010Struct) orgList.get(0);
                 struct.setORG_NAME(orgStruct.getORG_NAME());
                 // [���[�U]����ݒ�
                 KR0030010Struct userStruct = (KR0030010Struct) userList.get(0);
                 struct.setUSER_NAME(userStruct.getUSER_NAME());
                 // [�ʉ�]����ݒ�
                 KR0030010Struct curStruct = (KR0030010Struct) curList.get(0);
                 struct.setCUR_UNIT(curStruct.getCUR_UNIT());
                 struct.setCUR_UNIT2(curStruct.getCUR_UNIT());
                 // [�i��]����ݒ�
                 List itemList = entity.mM_ITEM.read(conn, struct);
                 if (!itemList.isEmpty()) {
                  KR0030010Struct itemStruct = (KR0030010Struct) itemList.get(0);
                  struct.setITEM_NAME(itemStruct.getITEM_NAME());
                  struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
                  struct.setUNIT_QTY_TYP(itemStruct.getUNIT_QTY_TYP());
                 }
                 else {
                  struct.setUNIT_QTY_TYP("");
                 }
              
                 // �����Ǘ��`�F�b�N
                 if ("1".equals(struct.getUNIT_QTY_TYP())) {
                  // �����Ǘ�
                  if (struct.getSALES_QTY().indexOf(".") >= 0) {
                   // �������͂̏ꍇ�F�؏グ
                   String tempString = struct.getSALES_QTY();
                   double tempDouble1 = Double.parseDouble(tempString);
                   struct.setSALES_QTY(Calculate.ceil(struct.getSALES_QTY(), 0));
                   double tempDouble2 = Double.parseDouble(struct.getSALES_QTY());
                   if (tempDouble1 != tempDouble2) {
                    // ".0"���͏��O
                    setWarningMessage("KQ20004");
                    setWarningParameter("T_SALES", "SALES_QTY", tempString);
                   }
                  }
                 }
              
                 // ����or�P�������͂���Ă����ꍇ�͋��z���v�Z
                 if (Calculate.compare(struct.getSALES_QTY(), "0") > 0
                  || Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") > 0) {
                  String work =
                   Calculate.multiply(struct.getSALES_QTY(), struct.getSALES_UNIT_PRICE());
                  work = roundAmount(work, struct);
                  struct.setSALES_AMOUNT(work);
                 }
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRecalc>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // �Čv�Z���W�b�N���Ăяo���āA�G���[�`�F�b�N�y�уf�[�^�Z�b�g���s���B
                 controlRecalc();
                 // �G���[���������ꍇ�͏����𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
//MOD 2014.08.19 NEC STR   �`�F�b�N�����ǉ�
                // ���.����ŃR�[�h��NULL�̏ꍇ�A���Ӑ�̏���ŃR�[�h�`�F�b�N���s��
                if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){
                 	chkTaxCode();
                 	if (msgStruct.hasError()) {
                 	 return;
                 	}
                }
//MOD 2014.08.19 NEC END
                 // [�������]�i���`�j�o�^�p�f�[�^�𐶐�
                 KR0030010Struct debitRecordStruct = createDebitRecord();
                 if (msgStruct.hasError()) {
                  return;
                 }
                 
                 // ������ъǗ��ԍ�(�A��)
                 List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
                 KR0030010Struct salesSeqNoStruct = (KR0030010Struct) salesSeqNoList.get(0);
                 debitRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
                 // �`�[�ԍ��������̔�
                 Numbering slipCdNum =
                  new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
                 debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
                 // ���`�[�ԍ���null��ݒ�
                 debitRecordStruct.setORG_SLIP_CD(null);
                          		
                 // [�������]�i���`�j�̓o�^
                 entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);
              
                 List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
              
                 if (!installOptionsList.isEmpty()) {
                  // ���|�Ǘ����C���X�g�[������Ă���ꍇ
//MOD 2014.08.19 NEC STR
                 //���.����ŃR�[�h���w�肳��ĂȂ��ꍇ�A���̏������W�b�N(���ʂ̔��|�Ǘ�IF���i)�ŁA�������s��
                 if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){
                  		// ���|�Ǘ��T�^�e(���i)�̌ďo
                  		// �������[�h:6
                  		// ���p�҃R�[�h:struct.getsUser_ID()
                  		// ���`�[�ԍ�:null
                  		// �ԓ`�[�ԍ�:null
                  		// ���`�[�ԍ�:debitRecordStruct.getSLIP_CD()
                  		ArIf arIf = new ArIf(conn);
                  		arIf.setParameter("6", struct.getsUser_ID(), null, null,
                  		      debitRecordStruct.getSLIP_CD());
                  		String msgNo = arIf.execute();
                  		if (!"0".equals(msgNo)) {
                  		 setErrorMessage(msgNo);
                  		 conn.rollback();
                  		 return;
                  		}
                 	}
                 //���.����ŃR�[�h���w�肳��Ă���ꍇ�A�V�K�̔��|�Ǘ�IF���i�i����ŃR�[�h��IN�p�����[�^�ɒǉ��j�ŁA�������s��
                 else{
                 		// ���|�Ǘ��T�^�e(���i)�̌ďo
                  		// �������[�h:6
                  		// ���p�҃R�[�h:struct.getsUser_ID()
                  		// ���`�[�ԍ�:null
                  		// �ԓ`�[�ԍ�:null
                  		// ���`�[�ԍ�:debitRecordStruct.getSLIP_CD()
                 		// ����ŃR�[�h:struct.getTAX_CD()  NewAdd
                  		ArIfIn arIfIn = new ArIfIn(conn);
                  		arIfIn.setParameter("6", struct.getsUser_ID(), null, null,
                  		      debitRecordStruct.getSLIP_CD(),struct.getTAX_CD());
                  		String msgNo = arIfIn.execute();
                  		if (!"0".equals(msgNo)) {
                  		 setErrorMessage(msgNo);
                  		 conn.rollback();
                  		 return;
                  		}
                 	}
                 	
                 }  //���|�Ǘ����C���X�g�[������Ă���ꍇ
//MOD 2014.08.19 NEC END
                 	
                 /*// ���|�g����/���|���� �o�^�X�VPL/SQL���Ăяo���B
                 struct.setPVC2SHUBETU("I");
                 struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
                 struct.setPVC2REDSLIP_CD(null);
                 struct.setPVC2BLKSLIP_CD(null);
                 struct.setPVC2RESULT(null);
                 List uriLinkList = entity.mSQLURILINK.call(conn, struct);
                 KR0030010Struct uriLinkStruct = (KR0030010Struct) uriLinkList.get(0);
                 // �G���[�`�F�b�N
                 if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
                  setErrorMessage(uriLinkStruct.getPVC2RESULT());
                  return;
                 }*/
              
                 // �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
                 struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
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
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
                 // ��`�[�ԍ�����A[�������]�ɑ��݂��Ȃ��ꍇ
                 List lockedList = entity.mT_SALES_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
                 KR0030010Struct lockedStruct = (KR0030010Struct) lockedList.get(0);
                 // [�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
              
                 // �Čv�Z���W�b�N���Ăяo���āA�G���[�`�F�b�N�y�уf�[�^�Z�b�g���s���B
                 controlRecalc();
                 // �G���[���������ꍇ�͏����𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
//MOD 2014.08.19 NEC STR
                // ���.����ŃR�[�h��NULL�̏ꍇ�A���Ӑ�̏���ŃR�[�h�`�F�b�N���s��
                if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){
                 	chkTaxCode();
                 	if (msgStruct.hasError()) {
                 	 return;
                 	}
                }
//MOD 2014.08.19 NEC END
                 //���|�������Ă��Ȃ��ꍇ�A�V�X�e���p�����[�^������я��F�`�F�b�N
                 chkAprSales();
                 if (msgStruct.hasError()) {                	 
                     return;
                 }
                 
                 List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
                 List arLedgerHTrnList = null;
                 List arLedgerHList = null;
              
                 if (installOptionsList.isEmpty()) {
                  // ���|�Ǘ����C���X�g�[������Ă��Ȃ��B
                  if (Calculate.compare(lockedStruct.getSTATUS(), "40") >= 0) {
                   setErrorMessage("BD00027");
                   setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                   return;
                  }
                 }
                 else {
                  // ���|�Ǘ����C���X�g�[������Ă���B
              
                  // [���|���g�����w�b�_]."�`�[�ԍ�" = ��`�[�ԍ�� + [���|���g�����w�b�_]."�`�[���" = 14 �Ō���
                  // [���|���g�����w�b�_]."��ԋ敪" >= 40 �̏ꍇ
                  arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
                  if (!arLedgerHTrnList.isEmpty()) {
                   KR0030010Struct arLedgerHTrnStruct = (KR0030010Struct) arLedgerHTrnList.get(0);
                   if (Calculate.compare(arLedgerHTrnStruct.getSTATUS(), "40") >= 0) {
                    setErrorMessage("BD00027");
                    setErrorParameter("T_AR_LEDGER_H_TRN", "SLIP_CD", struct.getSLIP_CD());
                    return;
                   }
                  }
              
                  // [���|�������w�b�_]."�`�[�ԍ�" = ��`�[�ԍ�� + [���|�������w�b�_]."�`�[���" = 14 �Ō���
                  // [���|�������w�b�_]."��ԋ敪" >= 40 �̏ꍇ
                  arLedgerHList = entity.mT_AR_LEDGER_H.read(conn, struct);
                  if (!arLedgerHList.isEmpty()) {
                   KR0030010Struct arLedgerHStruct = (KR0030010Struct) arLedgerHList.get(0);
                   if (Calculate.compare(arLedgerHStruct.getSTATUS(), "40") >= 0) {
                    setErrorMessage("BD00027");
                    setErrorParameter("T_AR_LEDGER_H", "SLIP_CD", struct.getSLIP_CD());
                    return;
                   }
                  }
                 }
              
                 //20090410 MOD START
                 //Ai�A�g�Ή��AAi�A�g���肩���M�ς̏ꍇ��[�������]�ԍ����ׂ��쐬
     			if("1".equals(struct.geth_INSTALL_FLG()) &&
     					"1".equals(struct.getAI_AR_IF_FLG())){
                    // [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
                    KR0030010Struct creditRecordStruct = createCreditRecord();
                    // ������ъǗ��ԍ�(�A��)
                    List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
                    KR0030010Struct creditSalesSeqNoStruct = (KR0030010Struct) creditSalesSeqNoList.get(0);
                    creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
                
                    // �ԓ`�[�ԍ��͢�`�[�ԍ�����g�p
                    creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
                    // ���`�[�ԍ�
                    creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
                    // [����`�[]�i�ԓ`�j��o�^
                    entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
                
                    // [����`�[]�i���`�j��_���폜
                    entity.mT_SALES_Delete.update(conn, struct);
                
                    // [����`�[]�i���`�j�o�^�p�f�[�^�𐶐�
                    KR0030010Struct debitRecordStruct = createDebitRecord();
                    if (msgStruct.hasError()) {
                     return;
                    }
                
                    // ������ъǗ��ԍ�(�A��)
                    List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
                    KR0030010Struct debitSalesSeqNoStruct = (KR0030010Struct) debitSalesSeqNoList.get(0);
                    debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
                    // ���`�[�ԍ��͢�`�[�ԍ�����g�p
                    debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());                    
                    // ���`�[�ԍ�
                    debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
                    // [����`�[]�i���`�j��o�^
                    entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);    
                    // �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
	                struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
	                controlSelect();
                 
     			}else{

	                 if (installOptionsList.isEmpty()
	                  || (!installOptionsList.isEmpty() && !arLedgerHTrnList.isEmpty())) {
	                  // ���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ
	                  // �܂��́A���|�Ǘ����C���X�g�[������Ă��邩�A[���|���g�����w�b�_]."�`�[���" = 14 �̏ꍇ
	        
	                  // [����`�[]�i���`�j�o�^�p�f�[�^�𐶐�
	                  KR0030010Struct debitRecordStruct = createDebitRecord();
	                  if (msgStruct.hasError()) {
	                   return;
	                  }
	              
	                  // �`�[�ԍ��͢�`�[�ԍ�����g�p����
	                  debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());
	                  // ���`�[�ԍ�
	                  debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
	                  // [�������]�i���`�j���X�V
	                  entity.mT_SALES_DebitRecord.update(conn, debitRecordStruct);
	              
	              
	              if (!installOptionsList.isEmpty()) {
	                   // ���|�Ǘ����C���X�g�[������Ă���ꍇ
//MOD 2014.08.19 NEC STR
                   //���.����ŃR�[�h���w�肳��ĂȂ��ꍇ�A���̏������W�b�N(���ʂ̔��|�Ǘ�IF���i)�ŁA�������s��
                   if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){ 
	                    // ���|�Ǘ��T�^�e(���i)�̌ďo
	                    // �������[�h:7
	                    // ���p�҃R�[�h:struct.getsUser_ID()
	                    // ���`�[�ԍ�:struct.getSLIP_CD()
	                    // �ԓ`�[�ԍ�:null
	                    // ���`�[�ԍ�:null
	                    ArIf arIf = new ArIf(conn);
	                    arIf.setParameter("7", struct.getsUser_ID(),
	                          struct.getSLIP_CD(), null, null);
	                    String msgNo = arIf.execute();
	                    if (!"0".equals(msgNo)) {
	                     setErrorMessage(msgNo);
	                     conn.rollback();
	                     return;
	                    }
	                  }
	               //���.����ŃR�[�h���w�肳��Ă���ꍇ�A�V�K�̔��|�Ǘ�IF���i�i����ŃR�[�h��IN�p�����[�^�ɒǉ��j�ŁA�������s��
                   else{
                 		// ���|�Ǘ��T�^�e(���i)�̌ďo
	                    // �������[�h:7
	                    // ���p�҃R�[�h:struct.getsUser_ID()
	                    // ���`�[�ԍ�:struct.getSLIP_CD()
	                    // �ԓ`�[�ԍ�:null
	                    // ���`�[�ԍ�:null
                 		// ����ŃR�[�h:struct.getTAX_CD()  NewAdd
                  		ArIfIn arIfIn = new ArIfIn(conn);
                  		arIfIn.setParameter("7", struct.getsUser_ID(),
	                          struct.getSLIP_CD(), null, null, struct.getTAX_CD());
                  		String msgNo = arIfIn.execute();
                  		if (!"0".equals(msgNo)) {
                  		 setErrorMessage(msgNo);
                  		 conn.rollback();
                  		 return;
                  		}
                 	 }
                 	
                   }  //���|�Ǘ����C���X�g�[������Ă���ꍇ
//MOD 2014.08.19 NEC END
	                  /*// ���|�g����/���|���� �o�^�X�VPL/SQL���Ăяo���B
	                  struct.setPVC2SHUBETU("U");
	                  struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
	                  struct.setPVC2REDSLIP_CD(null);
	                  struct.setPVC2BLKSLIP_CD(null);
	                  struct.setPVC2RESULT(null);
	                  List uriLinkList = entity.mSQLURILINK.call(conn, struct);
	                  KR0030010Struct uriLinkStruct = (KR0030010Struct) uriLinkList.get(0);
	                  // �G���[�`�F�b�N
	                  if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
	                   setErrorMessage(uriLinkStruct.getPVC2RESULT());
	                   return;
	                  }*/
	              
	                  // �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
	                  struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
	                  controlSelect();
	                 } else if (!installOptionsList.isEmpty() && !arLedgerHList.isEmpty()) {
	                  // ���|�Ǘ����C���X�g�[������Ă��邩�A[���|�������w�b�_]."�`�[���" = 14 �̏ꍇ
	              
	                  // [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
	                  KR0030010Struct creditRecordStruct = createCreditRecord();
	                  // ������ъǗ��ԍ�(�A��)
	                  List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
	                  KR0030010Struct creditSalesSeqNoStruct = (KR0030010Struct) creditSalesSeqNoList.get(0);
	                  creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
	              
	                  // �ԓ`�[�ԍ��͢�`�[�ԍ�����g�p
	                  //creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
	              
	                  // �ԓ`�[�ԍ��������̔�
	                  Numbering redSlipCdNum =
	                   new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
	                  creditRecordStruct.setSLIP_CD(redSlipCdNum.getNo());
	              
	                  // ���`�[�ԍ�
	                  creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
	                  // [����`�[]�i�ԓ`�j��o�^
	                  entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
	              
	                  // [����`�[]�i���`�j��_���폜
	                  entity.mT_SALES_Delete.update(conn, struct);
	              
	                  // [����`�[]�i���`�j�o�^�p�f�[�^�𐶐�
	                  KR0030010Struct debitRecordStruct = createDebitRecord();
	                  if (msgStruct.hasError()) {
	                   return;
	                  }
	              
	                  // ������ъǗ��ԍ�(�A��)
	                  List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
	                  KR0030010Struct debitSalesSeqNoStruct = (KR0030010Struct) debitSalesSeqNoList.get(0);
	                  debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
	                  // ���`�[�ԍ��������̔�
	                  Numbering slipCdNum =
	                   new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
	                  debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
	                  // ���`�[�ԍ�
	                  debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
	                  // [����`�[]�i���`�j��o�^
	                  entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);
	                 	
//MOD 2014.08.25 NEC STR
                  //���.����ŃR�[�h���w�肳��ĂȂ��ꍇ�A���̏������W�b�N(���ʂ̔��|�Ǘ�IF���i)�ŁA�������s��
                  if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){
	                  // ���|�Ǘ��T�^�e(���i)�̌ďo
	                  // �������[�h:7
	                  // ���p�҃R�[�h:struct.getsUser_ID()
	                  // ���`�[�ԍ�:struct.getSLIP_CD()
	                  // �ԓ`�[�ԍ�:creditRecordStruct.getSLIP_CD()
	                  // ���`�[�ԍ�:debitRecordStruct.getSLIP_CD()
	                  ArIf arIf = new ArIf(conn);
	                  arIf.setParameter("7", struct.getsUser_ID(),
	                        struct.getSLIP_CD(),
	                        creditRecordStruct.getSLIP_CD(),
	                        debitRecordStruct.getSLIP_CD());
	                  String msgNo = arIf.execute();
	                  if (!"0".equals(msgNo)) {
	                   setErrorMessage(msgNo);
	                   conn.rollback();
	                   return;
	                  }
                   }
                 	//���.����ŃR�[�h���w�肳��Ă���ꍇ�A�V�K�̔��|�Ǘ�IF���i�i����ŃR�[�h��IN�p�����[�^�ɒǉ��j�ŁA�������s��
                   else{
                 		// ���|�Ǘ��T�^�e(���i)�̌ďo
	                    // �������[�h:7
	                    // ���p�҃R�[�h:struct.getsUser_ID()
	                    // ���`�[�ԍ�:struct.getSLIP_CD()
	                    // �ԓ`�[�ԍ�:creditRecordStruct.getSLIP_CD()
	                    // ���`�[�ԍ�:debitRecordStruct.getSLIP_CD()
                 		// ����ŃR�[�h:struct.getTAX_CD()  NewAdd
                  		ArIfIn arIfIn = new ArIfIn(conn);
                  		arIfIn.setParameter("7", struct.getsUser_ID(),
	                        struct.getSLIP_CD(),
	                        creditRecordStruct.getSLIP_CD(),
	                        debitRecordStruct.getSLIP_CD(), struct.getTAX_CD());
                  		String msgNo = arIfIn.execute();
                  		if (!"0".equals(msgNo)) {
                  		 setErrorMessage(msgNo);
                  		 conn.rollback();
                  		 return;
                  		}
                 	 }
//MOD 2014.08.25 NEC END
	                  /*// ���|�g����/���|���� �o�^�X�VPL/SQL���Ăяo���B
	                  struct.setPVC2SHUBETU("U");
	                  struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
	                  struct.setPVC2REDSLIP_CD(creditRecordStruct.getSLIP_CD());
	                  struct.setPVC2BLKSLIP_CD(debitRecordStruct.getSLIP_CD());
	                  struct.setPVC2RESULT(null);
	                  List uriLinkList = entity.mSQLURILINK.call(conn, struct);
	                  KR0030010Struct uriLinkStruct = (KR0030010Struct) uriLinkList.get(0);
	                  // �G���[�`�F�b�N
	                  if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
	                   setErrorMessage(uriLinkStruct.getPVC2RESULT());
	                   return;
	                  }*/
	              
	                  // �o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
	                  struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
	                  controlSelect();
	                 }
     			}
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
                try {
                 // ��`�[�ԍ�����A[�������]�ɑ��݂��Ȃ��ꍇ
                 List lockedList = entity.mT_SALES_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
                 KR0030010Struct lockedStruct = (KR0030010Struct) lockedList.get(0);
                 // [�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
                 
                 //���|�������Ă��Ȃ��ꍇ�A�V�X�e���p�����[�^������я��F�`�F�b�N
                 chkAprSales();
                 if (msgStruct.hasError()) {                	 
                     return;
                 }
              
                 List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
                 List arLedgerHTrnList = null;
                 List arLedgerHList = null;
              
                 if (installOptionsList.isEmpty()) {
                  // ���|�Ǘ����C���X�g�[������Ă��Ȃ��B
                  if (Calculate.compare(lockedStruct.getSTATUS(), "40") >= 0) {
                   setErrorMessage("BD00027");
                   setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                   return;
                  }
                 }
                 else {
                  // ���|�Ǘ����C���X�g�[������Ă���B
              
                  // [���|���g�����w�b�_]."�`�[�ԍ�" = ��`�[�ԍ�� + [���|���g�����w�b�_]."�`�[���" = 14 �Ō���
                  // [���|���g�����w�b�_]."��ԋ敪" >= 40 �̏ꍇ
                  arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
                  if (!arLedgerHTrnList.isEmpty()) {
                   KR0030010Struct arLedgerHTrnStruct = (KR0030010Struct) arLedgerHTrnList.get(0);
                   if (Calculate.compare(arLedgerHTrnStruct.getSTATUS(), "40") >= 0) {
                    setErrorMessage("BD00027");
                    setErrorParameter("T_AR_LEDGER_H_TRN", "SLIP_CD", struct.getSLIP_CD());
                    return;
                   }
                  }
              
                  // [���|�������w�b�_]."�`�[�ԍ�" = ��`�[�ԍ�� + [���|�������w�b�_]."�`�[���" = 14 �Ō���
                  // [���|�������w�b�_]."��ԋ敪" >= 40 �̏ꍇ
                  arLedgerHList = entity.mT_AR_LEDGER_H.read(conn, struct);
                  if (!arLedgerHList.isEmpty()) {
                   KR0030010Struct arLedgerHStruct = (KR0030010Struct) arLedgerHList.get(0);
                   if (Calculate.compare(arLedgerHStruct.getSTATUS(), "40") >= 0) {
                    setErrorMessage("BD00027");
                    setErrorParameter("T_AR_LEDGER_H", "SLIP_CD", struct.getSLIP_CD());
                    return;
                   }
                  }
                 }
              
		
 				 if (installOptionsList.isEmpty()
 		                  || (!installOptionsList.isEmpty() && !arLedgerHTrnList.isEmpty())) {
 		                  // ���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ
 		                  // �܂��́A���|�Ǘ����C���X�g�[������Ă��邩�A[���|���g�����w�b�_]."�`�[���" = 14 �̏ꍇ
 		              
 		                  // [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
 		                  KR0030010Struct creditRecordStruct = createCreditRecord();
 		                  // ������ъǗ��ԍ�(�A��)
 		                  List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
 		                  KR0030010Struct salesSeqNoStruct = (KR0030010Struct) salesSeqNoList.get(0);
 		                  creditRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
 		                  // �`�[�ԍ��͢�`�[�ԍ�����g�p
 		                  creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
 		                  // ���`�[�ԍ�
 		                  creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
 		                  // [����`�[]�i�ԓ`�j��o�^
 		                  entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
 		              
 		                  // [����`�[]�i���`�j��_���폜
 		                  entity.mT_SALES_Delete.update(conn, struct);
 		                 //20090410 MOD START		              
   		                 //Ai�A�g����܂��͔��|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ�͔��|I/F�����s���Ȃ�	
 		                  if (!"1".equals(struct.geth_INSTALL_FLG()) && 
 		                		 !installOptionsList.isEmpty()) {		              
//MOD 2014.08.25 NEC STR
 		                		if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){
 		                		   // ���|�Ǘ��T�^�e(���i)�̌ďo
 		                		   // �������[�h:8
 		                		   // ���p�҃R�[�h:struct.getsUser_ID()
 		                		   // ���`�[�ԍ�:struct.getSLIP_CD()
 		                		   // �ԓ`�[�ԍ�:creditRecordStruct.getSLIP_CD()
 		                		   // ���`�[�ԍ�:null
 		                		   ArIf arIf = new ArIf(conn);
 		                		   arIf.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
 		                		         creditRecordStruct.getSLIP_CD(), null);
 		                		   String msgNo = arIf.execute();
 		                		   if (!"0".equals(msgNo)) {
 		                		    setErrorMessage(msgNo);
 		                		    conn.rollback();
 		                		    return;
 		                		   }
 		                		}
 		                		else{
 		                		   // ���|�Ǘ��T�^�e(���i)�̌ďo
 		                		   // �������[�h:8
 		                		   // ���p�҃R�[�h:struct.getsUser_ID()
 		                		   // ���`�[�ԍ�:struct.getSLIP_CD()
 		                		   // �ԓ`�[�ԍ�:creditRecordStruct.getSLIP_CD()
 		                		   // ���`�[�ԍ�:null
                 				   // ����ŃR�[�h:struct.getTAX_CD()  NewAdd
                  				ArIfIn arIfIn = new ArIfIn(conn);
                  				arIfIn.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
 		                		         creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
                  				String msgNo = arIfIn.execute();
                  				if (!"0".equals(msgNo)) {
                  				 setErrorMessage(msgNo);
                  				 conn.rollback();
                  				 return;
                  				}
                 	 		   }
//MOD 2014.08.25 NEC END
 		                  }
 		                 //20090410 MOD END
 		              
 		                  /*// ���|�g����/���|���� �o�^�X�VPL/SQL���Ăяo���B
 		                  struct.setPVC2SHUBETU("D");
 		                  struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
 		                  struct.setPVC2REDSLIP_CD(creditRecordStruct.getSLIP_CD());
 		                  struct.setPVC2BLKSLIP_CD(null);
 		                  struct.setPVC2RESULT(null);
 		                  List uriLinkList = entity.mSQLURILINK.call(conn, struct);
 		                  KR0030010Struct uriLinkStruct = (KR0030010Struct) uriLinkList.get(0);
 		                  // �G���[�`�F�b�N
 		                  if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
 		                   setErrorMessage(uriLinkStruct.getPVC2RESULT());
 		                   return;
 		                  }*/
 		              
 		                  // ��ʂ��N���A
 		                  controlClear();
 		                 } else if (!installOptionsList.isEmpty() && !arLedgerHList.isEmpty()) {
 		                  // ���|�Ǘ����C���X�g�[������Ă��邩�A[���|�������w�b�_]."�`�[���" = 14 �̏ꍇ
 		              
 		                  // [����`�[]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
 		                  KR0030010Struct creditRecordStruct = createCreditRecord();
 		                  // ������ъǗ��ԍ�(�A��)
 		                  List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
 		                  KR0030010Struct salesSeqNoStruct = (KR0030010Struct) salesSeqNoList.get(0);
 		                  creditRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
 		                  // �`�[�ԍ��������̔�
 		                  Numbering slipCdNum =
 		                   new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
 		                  creditRecordStruct.setSLIP_CD(slipCdNum.getNo());
 		                  // ���`�[�ԍ�
 		                  creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
 		                  // [����`�[]�i�ԓ`�j��o�^
 		                  entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
 		              
 		                  // [����`�[]�i���`�j��_���폜
 		                  entity.mT_SALES_Delete.update(conn, struct);
  		                 //20090410 MOD START
  		                 //Ai�A�g����̏ꍇ�͔��|I/F�����s���Ȃ�	
 		                  if (!"1".equals(struct.geth_INSTALL_FLG())) {
//MOD 2014.08.25 NEC STR
 		                	if(struct.getTAX_CD() == null || "".equals(struct.getTAX_CD())){
	 		                  // ���|�Ǘ��T�^�e(���i)�̌ďo
	 		                  // �������[�h:8
	 		                  // ���p�҃R�[�h:struct.getsUser_ID()
	 		                  // ���`�[�ԍ�:struct.getSLIP_CD()
	 		                  // �ԓ`�[�ԍ�:creditRecordStruct.getSLIP_CD()
	 		                  // ���`�[�ԍ�:null
	 		                  ArIf arIf = new ArIf(conn);
	 		                  arIf.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
	 		                        creditRecordStruct.getSLIP_CD(), null);
	 		                  String msgNo = arIf.execute();
	 		                  if (!"0".equals(msgNo)) {
	 		                   setErrorMessage(msgNo);
	 		                   conn.rollback();
	 		                   return;
	 		                  }
 		                	}
 		                	else{
 		                	  // ���|�Ǘ��T�^�e(���i)�̌ďo
	 		                  // �������[�h:8
	 		                  // ���p�҃R�[�h:struct.getsUser_ID()
	 		                  // ���`�[�ԍ�:struct.getSLIP_CD()
	 		                  // �ԓ`�[�ԍ�:creditRecordStruct.getSLIP_CD()
	 		                  // ���`�[�ԍ�:null
                 			  // ����ŃR�[�h:struct.getTAX_CD()  NewAdd
                  			ArIfIn arIfIn = new ArIfIn(conn);
                  			arIfIn.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
	 		                        creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
                  			String msgNo = arIfIn.execute();
                  			if (!"0".equals(msgNo)) {
                  			 setErrorMessage(msgNo);
                  			 conn.rollback();
                  			 return;
                  			 }
                 	 		}
//MOD 2014.08.25 NEC END      		
 		                  }
  		                 //20090410 MOD END
 		              
 		                  /*// ���|�g����/���|���� �o�^�X�VPL/SQL���Ăяo���B
 		                  struct.setPVC2SHUBETU("D");
 		                  struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
 		                  struct.setPVC2REDSLIP_CD(creditRecordStruct.getSLIP_CD());
 		                  struct.setPVC2BLKSLIP_CD(null);
 		                  struct.setPVC2RESULT(null);
 		                  List uriLinkList = entity.mSQLURILINK.call(conn, struct);
 		                  KR0030010Struct uriLinkStruct = (KR0030010Struct) uriLinkList.get(0);
 		                  // �G���[�`�F�b�N
 		                  if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
 		                   setErrorMessage(uriLinkStruct.getPVC2RESULT());
 		                   return;
 		                  }*/
 		              
 		                  // ��ʂ��N���A
 		                  controlClear();
 		                 }
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                initializeAll();
                
                //}}user_implement_dev:<controlClear>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                initializeAll();
              
                try {
                 // �̔��p�H��R�[�h
                 List codeList = entity.mSYS_CLASS_CODE.read(conn, struct);
                 if (!codeList.isEmpty()) {
                  KR0030010Struct codeStruct = (KR0030010Struct)codeList.get(0);
                  this.setSalesPLANT_CD(codeStruct.getSYS_CLASS_CODE());
                 }
                 else {
                  this.setSalesPLANT_CD("");
                 }
              
                 // �Ɩ��^�p��
                 struct.setPLANT_CD(this.getSalesPLANT_CD());
                 List dateList = entity.mSYS_DATE_CTRL.read(conn, struct);
                 if (!dateList.isEmpty()) {
                  KR0030010Struct dateStruct = (KR0030010Struct)dateList.get(0);
                  struct.setBUSINESS_OPR_DATE(dateStruct.getBUSINESS_OPR_DATE());
                 }
                 else {
                  struct.setBUSINESS_OPR_DATE("");
                 }
                 
     			 // �C���X�g�[���I�v�V�����̎擾
     			 List InstallOptionList = entity.mSYS_INSTALL_OPTIONS_Ai.read(conn, struct);
     			 if (InstallOptionList.isEmpty()) {
     				struct.seth_INSTALL_FLG(null);			
     			 }else{
     				struct.seth_INSTALL_FLG(((KR0030010Struct)InstallOptionList.get(0)).geth_INSTALL_FLG());
     			 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0030");
		logger.entering("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KR0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Recalc") ) {
				controlRecalc();
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
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KR0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KR0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KR0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KR0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KR0030010Entity entity;
	protected KR0030010Struct struct;
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

		entity = new KR0030010Entity();
		struct = new KR0030010Struct();

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
	 * KR0030010�N���X�̕W���R���X�g���N�^
	 */
	public KR0030010Control() throws BusinessProcessException, FoundationException
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
				KR0030010Struct key = (KR0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_SLIP_CD") && key.geth_SLIP_CD() != null) {
					msgKey.setKeyValue("h_SLIP_CD", key.geth_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT2") && key.getCUR_UNIT2() != null) {
					msgKey.setKeyValue("CUR_UNIT2", key.getCUR_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO") && key.geth_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("h_SALES_SEQ_NO", key.geth_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG") && key.getAI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("AI_AR_IF_FLG", key.getAI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_CD") && key.getw_TAX_CD() != null) {
					msgKey.setKeyValue("w_TAX_CD", key.getw_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("SALES_SEQ_NO") && key.getSALES_SEQ_NO() != null) {
					msgKey.setKeyValue("SALES_SEQ_NO", key.getSALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_TYP") && key.getSALES_TYP() != null) {
					msgKey.setKeyValue("SALES_TYP", key.getSALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD") && key.getPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("PRD_ODR_PLACE_CD", key.getPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES") && key.getSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_EXCH_RATES", key.getSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT") && key.getEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_SALES_AMOUNT", key.getEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT") && key.getINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_SALES_AMOUNT", key.getINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT") && key.getTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAXFREE_SALES_AMOUNT", key.getTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT") && key.getTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_CREDIT_SALES_AMOUNT", key.getTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT") && key.getEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_AMOUNT", key.getEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT") && key.getINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_AMOUNT", key.getINTERNAL_TAX_AMOUNT());
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
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ORG_SLIP_CD") && key.getORG_SLIP_CD() != null) {
					msgKey.setKeyValue("ORG_SLIP_CD", key.getORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO") && key.getSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("SPCL_PRICE_CO", key.getSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("ORG_TAX_CD") && key.getORG_TAX_CD() != null) {
					msgKey.setKeyValue("ORG_TAX_CD", key.getORG_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("PVC2SHUBETU") && key.getPVC2SHUBETU() != null) {
					msgKey.setKeyValue("PVC2SHUBETU", key.getPVC2SHUBETU());
				}
				if(msgKeyType.containsKeyColumn("PVC2ORGSLIP_CD") && key.getPVC2ORGSLIP_CD() != null) {
					msgKey.setKeyValue("PVC2ORGSLIP_CD", key.getPVC2ORGSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("PVC2REDSLIP_CD") && key.getPVC2REDSLIP_CD() != null) {
					msgKey.setKeyValue("PVC2REDSLIP_CD", key.getPVC2REDSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("PVC2BLKSLIP_CD") && key.getPVC2BLKSLIP_CD() != null) {
					msgKey.setKeyValue("PVC2BLKSLIP_CD", key.getPVC2BLKSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("PVC2RESULT") && key.getPVC2RESULT() != null) {
					msgKey.setKeyValue("PVC2RESULT", key.getPVC2RESULT());
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
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE") && key.getSYS_CLASS_CODE() != null) {
					msgKey.setKeyValue("SYS_CLASS_CODE", key.getSYS_CLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_NAME") && key.getw_TAX_NAME() != null) {
					msgKey.setKeyValue("w_TAX_NAME", key.getw_TAX_NAME());
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
					KR0030010Struct key = new KR0030010Struct();
					if(msgKeyType.containsKeyColumn("h_SLIP_CD")) {
						key.seth_SLIP_CD(msgKey.getKeyValue("h_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT2")) {
						key.setCUR_UNIT2(msgKey.getKeyValue("CUR_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO")) {
						key.seth_SALES_SEQ_NO(msgKey.getKeyValue("h_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG")) {
						key.setAI_AR_IF_FLG(msgKey.getKeyValue("AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_CD")) {
						key.setw_TAX_CD(msgKey.getKeyValue("w_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("SALES_SEQ_NO")) {
						key.setSALES_SEQ_NO(msgKey.getKeyValue("SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TYP")) {
						key.setSALES_TYP(msgKey.getKeyValue("SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD")) {
						key.setPRD_ODR_PLACE_CD(msgKey.getKeyValue("PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES")) {
						key.setSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT")) {
						key.setINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT")) {
						key.setTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT")) {
						key.setTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT")) {
						key.setEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT")) {
						key.setINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_AMOUNT"));
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
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ORG_SLIP_CD")) {
						key.setORG_SLIP_CD(msgKey.getKeyValue("ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO")) {
						key.setSPCL_PRICE_CO(msgKey.getKeyValue("SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("ORG_TAX_CD")) {
						key.setORG_TAX_CD(msgKey.getKeyValue("ORG_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2SHUBETU")) {
						key.setPVC2SHUBETU(msgKey.getKeyValue("PVC2SHUBETU"));
					}
					if(msgKeyType.containsKeyColumn("PVC2ORGSLIP_CD")) {
						key.setPVC2ORGSLIP_CD(msgKey.getKeyValue("PVC2ORGSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2REDSLIP_CD")) {
						key.setPVC2REDSLIP_CD(msgKey.getKeyValue("PVC2REDSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BLKSLIP_CD")) {
						key.setPVC2BLKSLIP_CD(msgKey.getKeyValue("PVC2BLKSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2RESULT")) {
						key.setPVC2RESULT(msgKey.getKeyValue("PVC2RESULT"));
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
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE")) {
						key.setSYS_CLASS_CODE(msgKey.getKeyValue("SYS_CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_NAME")) {
						key.setw_TAX_NAME(msgKey.getKeyValue("w_TAX_NAME"));
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
