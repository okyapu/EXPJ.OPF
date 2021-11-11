/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KT0010/src/com/nec/jp/orteus/metamorBase/KT0010/KT0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KT0010;

import com.nec.jp.orteus.metamorBase.KT0010.*;
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
import java.text.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KT0010010Control
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
        protected List list;											// �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
       
        // �f�t�H���g�A�N�Z�T���\�b�h
        public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
        public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
       //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public KT0010010Struct getListvalue(int x) { return (KT0010010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public KT0010010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public KT0010010Struct createStruct() { return new KT0010010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((KT0010010Struct)structname); }	// Struct���Z�b�g���܂��B
        public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
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
         * �Ɩ��x���������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
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
         * ��ʂ̑S���ڂ����������܂��B
         * �����ł́A�L�[���ڂ̏������Əڍ׍��ڂ̏��������s���܂��B
         */
        private void initializeAll() {
         struct.setDESINATED_DLV_DATE(null);
                       struct.setODR_NO(null);
         struct.setr1_STS_TYP("true");
         struct.setr2_STS_TYP(null);
         struct.setCUST_CD(null);
         struct.setITEM_CD(null);
         struct.setCUST_CHRG_PSN_CD(null);
         struct.setCUST_ODR_NO(null);
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         * �����ł́A�L�[�ȊO�̍��ڂ̏��������s���܂��B
         */
        private void initializeDetail() {
         list = null;
         readStatus = INITIAL;
        }
       
        /**
         * �N���C�A���g�ŕҏW���ꂽView�̒l��Struct�Ɋi�[���ĕԂ��܂��B
         * �N���C�A���g��著�M���ꂽ�s�istruct.getList_XXXX���Ɋi�[���ꂽ�l�j
         * ��Struct���ɐݒ肵�܂��B
         * @param index �v�f�̃C���f�b�N�X
         * @return �N���C�A���g�ŕҏW���ꂽView�̒l���i�[����Struct
         * @throws IndexOutOfBoundsException ���M���ꂽView�̃C���f�b�N�X�͈̔͊O�̏ꍇ
         */
        private KT0010010Struct getStructAt(int index) {
         KT0010010Struct s = new KT0010010Struct();
         // �I����ݒ�
         s.setKT0010010view1_selected((String) struct.getList_KT0010010view1_selected().get(index));
         // �i�ڔԍ���ݒ�
         s.setl_ITEM_CD((String) struct.getList_l_ITEM_CD().get(index));
         // ���Ӑ撍���ԍ�
         s.setl_CUST_ODR_NO((String) struct.getList_l_CUST_ODR_NO().get(index));
         // �w��[����ݒ�
         s.setl_DESINATED_DLV_DATE((String) struct.getList_l_DESINATED_DLV_DATE().get(index));
         // �󒍔ԍ���ݒ�
         s.setl_ODR_NO((String) struct.getList_l_ODR_NO().get(index));
         // ���Ӑ�R�[�h
         s.setl_CUST_CD((String) struct.getList_l_CUST_CD().get(index));
         // �ڋq�i�ڔԍ���ݒ�
         s.setl_CUST_ITEM_CD((String) struct.getList_l_CUST_ITEM_CD().get(index));
         // �������ʂ�ݒ�
         s.setl_ODR_QTY((String) struct.getList_l_ODR_QTY().get(index));
         // �v��c��ݒ�
         s.setl_SHIP_PLAN_REMAIN_QTY((String) struct.getList_l_SHIP_PLAN_REMAIN_QTY().get(index));
         // �o�׎w�����ݒ�
         s.setl_DESINATED_SHIP_DATE((String) struct.getList_l_DESINATED_SHIP_DATE().get(index));
         // ���ʂ�ݒ�
         s.setl_DESINATED_SHIP_QTY((String) struct.getList_l_DESINATED_SHIP_QTY().get(index));
         // �P��
         s.setl_PKG_UNIT((String) struct.getList_l_PKG_UNIT().get(index));
         // �q�Ɂi�\���j��ݒ�
         s.setl_DEPO_TYP((String) struct.getList_l_DEPO_TYP().get(index));
         // �i�ږ�
         s.setl_ITEM_NAME((String) struct.getList_l_ITEM_NAME().get(index));
         // ���Ӑ於
         s.setl_CUST_NAME((String) struct.getList_l_CUST_NAME().get(index));
         // ���Ӑ�i�ږ���
         s.setl_CUST_ITEM_NAME((String) struct.getList_l_CUST_ITEM_NAME().get(index));
         // ����
         s.setl_JOB_ODR_CD((String) struct.getList_l_JOB_ODR_CD().get(index));
         // ���l
         s.setl_REMARKS((String) struct.getList_l_REMARKS().get(index));
         // �����s�i�\���j��ݒ�
         s.setl_PARTIAL_SHIP_INST_FLG((String) struct.getList_l_PARTIAL_SHIP_INST_FLG().get(index));
         // �����s��ݒ�
         s.setPARTIAL_SHIP_INST_FLG((String) struct.getList_PARTIAL_SHIP_INST_FLG().get(index));
         // ���[���Ԃ�ݒ�
         s.setl_PART_DLV_SEQ_NO((String) struct.getList_l_PART_DLV_SEQ_NO().get(index));
         // �o�׎w�萔�ʂ�ݒ�
         s.setl_bk_DESINATED_SHIP_QTY((String) struct.getList_l_bk_DESINATED_SHIP_QTY().get(index));
         // �X�V�񐔂�ݒ�
         s.setl_MODIFY_COUNT((String) struct.getList_l_MODIFY_COUNT().get(index));
         // �݌ɐ��P�ʋ敪
         s.setl_UNIT_QTY_TYP((String) struct.getList_l_UNIT_QTY_TYP().get(index));
         // �o�בq�ɃR�[�h
         s.setl_SHIP_WH_CD((String) struct.getList_l_SHIP_WH_CD().get(index));
         // �H��R�[�h
         s.setl_SHIP_PLANT_CD((String) struct.getList_l_SHIP_PLANT_CD().get(index));
       
         return s;
        }
       
        /**
         * �N���C�A���g�ŕҏW���ꂽ�l�� list ���ŐV�̏�ԂɍX�V���܂��B
         */
        private void refreshList() {
       
         if (list == null) {
          list = new ArrayList();
         } else {
          list.clear();
         }
         int listSize = (list == null ? 0 : struct.getList_l_ODR_NO().size());
         for (int i = 0; i < listSize; i++) {
          list.add(getStructAt(i));
         }
        }
       
        /**
         * [�o�׌v��]��� "�󒍔ԍ�" = �����̏����Ŏ擾�������[���Ԃ�
         * �ő�l + 1 �̕�����\����Ԃ��܂��B[�o�׌v��]�Ƀf�[�^��
         * ���݂��Ȃ��ꍇ�� "1" ��Ԃ��܂��B
         * @param odrNo �󒍔ԍ�
         * @return [�o�׌v��]."�󒍔ԍ�"�Ŏ擾�������[���Ԃ̍ő�l + 1
         * @throws FoundationException SQL����PDConnecter�ɑ��݂��Ȃ��ꍇ
         * @throws SQLException SQL�̎��s�ɂ����ė\�����Ȃ���O�����������ꍇ
         */
        private String getMaxPartDlvSeqNo(String odrNo)
         throws FoundationException, SQLException {
       
         struct.setl_ODR_NO(odrNo);
         List seqNoList = entity.mMax_PART_DLV_SEQ_NO.read(conn, struct);
       
         // ���[���Ԃ����݂��Ȃ��ꍇ�� "1" ��ԋp����
         if (seqNoList.isEmpty()) {
          return "1";
         }
         // �ő啪�[���� + 1 ��ԋp����
         KT0010010Struct seqNoStruct = (KT0010010Struct) seqNoList.get(0);
         return Calculate.add(seqNoStruct.getl_PART_DLV_SEQ_NO(), "1");
        }
       
        /**
         * �w��[���A�^���������w�肵�čœK�ȏo�׎w������v�Z���ĕԂ��܂��B
         * �o�ח\����̌v�Z�͋��ʕ��i���g�p���A�ȉ��̌v�Z�Ŏ擾�ł���ŏ���
         * �ғ����ŎZ�o����܂��B<p>
         * �u�w��[�� - �^������ - �o�׏������[�h�^�C���v<p>
         * ���̏������s���ꍇ�A������Struct�Ɏw��[���A�^���������w�肷��
         * �K�v������܂��B�^���������w�肵�Ȃ��ꍇ�́A�^������0�Ƃ��Čv�Z���܂��B
         * �w��[�����w�肵�Ȃ��ꍇ�͏������K�؂ɍs���Ȃ�����
         * IllegalArgumentException��throw���܂��B
         * @param s �o�׎w������v�Z���邽�߂ɕK�v��Struct
         * @return �o�׎w����̕�����\��
         * @throws IllegalArgumentException �w��[�����ݒ肳��Ă��Ȃ��ꍇ
         * @throws NumberFormatException �^�������A�o�׏���LT�����l�ł͂Ȃ��ꍇ
         * @throws ParseException �w��[�������t��͂ł��Ȃ��ꍇ
         * @throws FoundationException �Ɩ����t�v�Z���i�̌Ăяo���ŗ\�����Ȃ��G���[�����������ꍇ
         * @throws ExpjException �Ɩ����t�v�Z���i�����t���v�Z�ł��Ȃ������ꍇ
         */
        private String getDesinatedShipDate(KT0010010Struct s)
         throws ParseException, FoundationException, ExpjException {
       
         String desinatedDlvDateStr = s.getl_DESINATED_DLV_DATE();
       
         // �w��[�����w�肳��Ȃ��ꍇ�̓G���[
         if (desinatedDlvDateStr == null || desinatedDlvDateStr.equals("")) {
          throw new IllegalArgumentException();
         }
         String transportLt = s.getl_TRANSPORT_LT();
         // �^���������w�肳��Ȃ��ꍇ��0�Ƃ��x����\������B
         if (transportLt == null || transportLt.equals("")) {
          transportLt = "0";
          setWarningMessage("KT00006");
          setWarningParameter("T_ODR", "ODR_NO", s.getl_ODR_NO());
         }
       
         // �Ɩ����t�v�Z���i�ɓn�����Z��(�^������+�o�׏���LT)���v�Z����
         int amount = Integer.parseInt(Calculate.add(transportLt, shipLt));
       
         // �w��[����Date�ɕϊ�����
         //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
         //Date desinatedDlvDate = dateFormat.parse(desinatedDlvDateStr);
         Date desinatedDlvDate = Converter.strToDate(desinatedDlvDateStr, "yyyy/MM/dd");
       
         // �Ɩ����t�v�Z���i�̐���
         WorkCalendar workCal = new WorkCalendar(conn
          , sysUSER_CD
          , business.getBusinessCd()
          , s.getl_SHIP_PLANT_CD()
          , desinatedDlvDate
          , amount * (-1)  // �����Z�̂���-1��������
          , false);
       
         Date wkDate = workCal.calcDate();
       
         if (wkDate == null) {
          throw new ExpjException("KQ00040");
         }
       
         //return dateFormat.format(wkDate);
         return Converter.dateToStr(wkDate, "yyyy/MM/dd");
        }
       
        /** �Ɩ��^�p���B�����[�h���Ɏ擾����B*/
        private String businessOprDate;
        /** �o�׏������[�h�^�C���B�����[�h���Ɏ擾����B*/
        private String shipLt;
        /** �̔��p�H��R�[�h�B�����[�h���Ɏ擾����B*/
        private String plantCd;
	
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
              
                 initializeDetail();
              
                 struct.setCOMPANY_CD("00");
                                      List dateList = entity.mSYS_MY_COMPANY.read(conn, struct);
                                      if (!dateList.isEmpty()) {
                                              KT0010010Struct s = (KT0010010Struct)dateList.get(0);
                                              struct.setCOMPANY_CD(s.getCOMPANY_CD());
                                      }
              
                 // �ǉ��v��i�v��o�^�j���ǂ���
                 boolean isAddedPlan = "true".equals(struct.getr1_STS_TYP());
              
               
                 int maxLine = sp.getMaxLine(conn, 10);
                 if(maxLine !=0){
                	 struct.setROW_COUNT(String.valueOf(maxLine));
                 } else{
                	 struct.setROW_COUNT(null);
                 }
                 // �t�H�[����񌟍�
                 List viewList;
                 if (isAddedPlan) {
                  viewList = entity.mViewCnt.read(conn, struct);
                 } else {
                  viewList = entity.mView2Cnt.read(conn, struct);
                 }
                 long rowCount = Long.parseLong(((KT0010010Struct) viewList.get(0)).getl_COUNT());
                 // �������ʂ�0���̏ꍇ�̓G���[
                 if (rowCount ==0) {
                  setErrorMessage("ZZ06001");
                  readStatus = NOT_FOUND;
                  if(list!=null &&list.size()>0){
                	  list.clear();
                  }
                  return;
                 }
                 // �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
                 if ((maxLine != 0) && (rowCount == maxLine+1)) {
                  setErrorMessage("ZZ01115", String.valueOf(maxLine));
                  readStatus = TOO_MANY;
                  if(list!=null &&list.size()>0){
                	  list.clear();
                  }
                  return;
                 }
                 // �t�H�[����񌟍�
                
                 if (isAddedPlan) {
                  viewList = entity.mView.read(conn, struct);
                 } else {
                  viewList = entity.mVew2.read(conn, struct);
                 }
                 // ���v��̏ꍇ�͏o�׎w������v�Z����B
                 if (isAddedPlan) {
                  for (Iterator i = viewList.iterator(); i.hasNext();) {
                   KT0010010Struct s = (KT0010010Struct) i.next();
                   // �^�������̌���
                   List custBaseList = entity.mM_CUST_BASE.read(conn, s);
              
                   // �^���������擾�ł��Ȃ��ꍇ�͌x����\������B
                   if (custBaseList.isEmpty()) {
                    setWarningMessage("KT00006");
                    setWarningParameter("T_ODR", "ODR_NO", s.getl_ODR_NO());
                    setWarningParameter("T_ODR_CTL", "CUST_CD", s.getl_CUST_CD());
                    setWarningParameter("T_ODR", "DLV_LOC_CD", s.getl_DLV_LOC_CD());
                    s.setl_TRANSPORT_LT("0");
                   } else {
                    KT0010010Struct custBaseStruct = (KT0010010Struct) custBaseList.get(0);
                    s.setl_TRANSPORT_LT(custBaseStruct.getl_TRANSPORT_LT());
                   }
              
                   // �o�׎w����̎擾
                   s.setl_DESINATED_SHIP_DATE(getDesinatedShipDate(s));
                  }
                 }
              
                 // ���X�g�f�[�^�ݒ�
                 setList(viewList);
                 
                 KT0010010Struct TempStruct;
                 for (int i = 0; i < this.list.size(); i++) {
                 	TempStruct = (KT0010010Struct)list.get(i);
                 	TempStruct.setl_DEPO_TYP(this.multcombo("DEPO_TYP",TempStruct.getl_DEPO_TYP()));
                 	TempStruct.setl_PARTIAL_SHIP_INST_FLG(this.multcombo("PARTIAL_SHIP_INST_FLG",TempStruct.getPARTIAL_SHIP_INST_FLG()));
                 }
                               
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ParseException e) {
                 throw new ExpjException(e);
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �I��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                try {
                 // �ҏW���ꂽ���X�g�����X�V
                 refreshList();
                 // [�󒍖���]���v�Z���ʂōX�V���邽�߂ɁA�ꎞ�f�[�^���i�[����Map
                 Map map = new HashMap();
              
                 for (Iterator i = list.iterator(); i.hasNext();) {
                  // �s��Struct���擾
                  KT0010010Struct s = (KT0010010Struct)i.next();
              
                  // �I������ĂȂ��ꍇ�͎��̍s��ǂݍ���
                  if (!"true".equals(s.getKT0010010view1_selected())) {
                   continue;
                  }
              
                  // �I���s�̌v��c������
                  List odrList = entity.mT_ODR.read(conn, s);
              
                  // �󒍔ԍ��ɑΉ�����[�󒍖���]�����݂��Ȃ��ꍇ�̓G���[�B
                  if (odrList.isEmpty()) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  KT0010010Struct odrStruct = (KT0010010Struct) odrList.get(0);
                  // �Ǎ����̍X�V�񐔂ƈقȂ�ꍇ�̓G���[
                  if (!s.getl_MODIFY_COUNT().equals(odrStruct.getl_MODIFY_COUNT())) {
                   setErrorMessage("KQ00055");
                   return;
                  }
              
                                              // �����Ǘ��`�F�b�N
                                              //System.out.println("s.getl_UNIT_QTY_TYP()" + s.getl_UNIT_QTY_TYP());
                                              if ("1".equals(s.getl_UNIT_QTY_TYP())) {
                                                  // �����Ǘ�
                                                  if (s.getl_DESINATED_SHIP_QTY().indexOf(".") >= 0) {
                                                      // �������͂̏ꍇ�F�؏グ
                                                      String tempString = s.getl_DESINATED_SHIP_QTY();
                                                      double tempDouble1 = Double.parseDouble(tempString);
                                                      s.setl_DESINATED_SHIP_QTY(Calculate.ceil(s.getl_DESINATED_SHIP_QTY(), 0));
                                                      double tempDouble2 = Double.parseDouble(s.getl_DESINATED_SHIP_QTY());
                                                      if (tempDouble1 != tempDouble2) {
                                                          // ".0"���͏��O
                                                          setWarningMessage("KQ20004");
                                                          setWarningParameter("T_ANS_DLV_DATE", "DESINATED_SHIP_QTY", tempString);
                                                      }
                                                  }
                                              }
              
                  // �I���s��ODR_NO
                  String odrNo = s.getl_ODR_NO();
              
                  // �X�V�Ώۍs�̏o�׌v��c����Map�Ɋi�[����
                  if (!map.containsKey(odrNo)) {
                   map.put(odrNo, odrStruct.getl_SHIP_PLAN_REMAIN_QTY());
                  }
                  // �o�׌v��c�����琔�ʂ������Ďc�����v�Z����Map���X�V����
                  String qty = (String) map.get(odrNo);
                  qty = Calculate.subtract(qty, s.getl_DESINATED_SHIP_QTY());
                  map.put(odrNo, qty);
              
                  // [�o�׌v��]�o�^
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_PART_DLV_SEQ_NO(getMaxPartDlvSeqNo(odrNo));
                  struct.setl_DESINATED_SHIP_DATE(s.getl_DESINATED_SHIP_DATE());
                  struct.setl_DESINATED_SHIP_QTY(s.getl_DESINATED_SHIP_QTY());
                  entity.mT_ANS_DLV_DATE.create(conn, struct);
              
                 }
              
                 // �ݒ肳�ꂽMap��[�󒍖���]���X�V����
                 for (Iterator i = map.keySet().iterator(); i.hasNext();) {
                  String odrNo = (String) i.next();
                  String shipPlanRemainQty = (String) map.get(odrNo);
              
                  // �v�Z�����o�׌v�搔���v��c�������傫���ꍇ�̓G���[
                  if (Calculate.compare(shipPlanRemainQty, "0") < 0) {
                   setErrorMessage("KT00008", odrNo);
                  }
                  // [�󒍖���]�X�V
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_SHIP_PLAN_REMAIN_QTY(shipPlanRemainQty);
                  entity.mT_ODR.update(conn, struct);
                 }
              
                 // �G���[������ΏI��
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // �ēǍ�
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
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * ���[�s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
              
                // �ҏW���ꂽ���X�g�����X�V
                refreshList();
              
                if (!list.isEmpty()) {
                 KT0010010Struct s = getStructAt(0);
                 s.setl_DESINATED_DLV_DATE(null);
                 s.setl_DESINATED_SHIP_DATE(null);
                 list.add(s);
                }
              
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // ��ʂ�������
                initializeAll();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �I���X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                try {
                 // �ҏW���ꂽ���X�g�����X�V
                 refreshList();
                 // [�󒍖���]���v�Z���ʂōX�V���邽�߂ɁA�ꎞ�f�[�^���i�[����Map
                 Map map = new HashMap();
              
                 for (Iterator i = list.iterator(); i.hasNext();) {
              
                  // �s��Struct���擾
                  KT0010010Struct s = (KT0010010Struct) i.next();
              
                  // �I������ĂȂ��ꍇ�͎��̍s��ǂݍ���
                  if (!"true".equals(s.getKT0010010view1_selected())) {
                   continue;
                  }
              
                  // �I���s��[�o�׌v��]������
                  List ansDlvDateList = entity.mT_ANS_DLV_DATE.read(conn, s);
                  // �Ή�����[�o�׌v��]�����݂��Ȃ��ꍇ�̓G���[�B
                  if (ansDlvDateList.isEmpty()) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  KT0010010Struct ansDlvDateStruct = (KT0010010Struct) ansDlvDateList.get(0);
                  // �Ǎ����̍X�V�񐔂ƈقȂ�ꍇ�̓G���[
                  if (!s.getl_MODIFY_COUNT().equals(ansDlvDateStruct.getl_MODIFY_COUNT())) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  // �����Ǘ��`�F�b�N
                  if ("1".equals(s.getl_UNIT_QTY_TYP())) {
                      // �����Ǘ�
                      if (s.getl_DESINATED_SHIP_QTY().indexOf(".") >= 0) {
                          // �������͂̏ꍇ�F�؏グ
                          String tempString = s.getl_DESINATED_SHIP_QTY();
                          double tempDouble1 = Double.parseDouble(tempString);
                          s.setl_DESINATED_SHIP_QTY(Calculate.ceil(s.getl_DESINATED_SHIP_QTY(), 0));
                          double tempDouble2 = Double.parseDouble(s.getl_DESINATED_SHIP_QTY());
                          if (tempDouble1 != tempDouble2) {
                              // ".0"���͏��O
                              setWarningMessage("KQ20004");
                              setWarningParameter("T_ANS_DLV_DATE", "DESINATED_SHIP_QTY", tempString);
                          }
                      }
                  }
              
                  // �I���s��ODR_NO
                  String odrNo = s.getl_ODR_NO();
              
                  // �X�V�Ώۍs�̏o�׌v��c����Map�Ɋi�[����
                  if (!map.containsKey(odrNo)) {
                   // DB���������āA�ŐV�̏o�׌v��c�����擾����B
                   List odrList = entity.mT_ODR.read(conn, s);
                   KT0010010Struct odrStruct = (KT0010010Struct) odrList.get(0);
                   map.put(odrNo, odrStruct.getl_SHIP_PLAN_REMAIN_QTY());
                  }
                  // �o�׌v��c�����琔�ʂ������Ďc�����v�Z����Map���X�V����
                  String qty = (String) map.get(odrNo);
                  qty = Calculate.subtract(qty, s.getl_DESINATED_SHIP_QTY());
                  qty = Calculate.add(qty, s.getl_bk_DESINATED_SHIP_QTY());
                  map.put(odrNo, qty);
              
                  // [�o�׌v��]�X�V
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_PART_DLV_SEQ_NO(s.getl_PART_DLV_SEQ_NO());
                  struct.setl_DESINATED_SHIP_DATE(s.getl_DESINATED_SHIP_DATE());
                  struct.setl_DESINATED_SHIP_QTY(s.getl_DESINATED_SHIP_QTY());
                  entity.mT_ANS_DLV_DATE.update(conn, struct);
                 }
              
                 // �ݒ肳�ꂽMap��[�󒍖���]���X�V����
                 for (Iterator i = map.keySet().iterator(); i.hasNext();) {
                  String odrNo = (String) i.next();
                  String shipPlanRemainQty = (String) map.get(odrNo);
              
                  // �v�Z�����o�׌v�搔���v��c�������傫���ꍇ�̓G���[
                  if (Calculate.compare(shipPlanRemainQty, "0") < 0) {
                   setErrorMessage("KT00008", odrNo);
                  }
                  // [�󒍖���]�X�V
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_SHIP_PLAN_REMAIN_QTY(shipPlanRemainQty);
                  entity.mT_ODR.update(conn, struct);
                 }
              
                 // �G���[������ΏI��
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // �ēǍ�
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
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �I���폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
              
                try {
                 // �ҏW���ꂽ���X�g�����X�V
                 refreshList();
                 // [�󒍖���]���v�Z���ʂōX�V���邽�߂ɁA�ꎞ�f�[�^���i�[����Map
                 Map map = new HashMap();
              
                 for (Iterator i = list.iterator(); i.hasNext();) {
              
                  // �s��Struct���擾
                  KT0010010Struct s = (KT0010010Struct) i.next();
                  // �I������ĂȂ��ꍇ�͎��̍s��ǂݍ���
                  if (!"true".equals(s.getKT0010010view1_selected())) {
                   continue;
                  }
              
                  // �I���s��[�o�׌v��]������
                  List ansDlvDateList = entity.mT_ANS_DLV_DATE.read(conn, s);
                  // �Ή�����[�o�׌v��]�����݂��Ȃ��ꍇ�̓G���[�B
                  if (ansDlvDateList.isEmpty()) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  KT0010010Struct ansDlvDateStruct = (KT0010010Struct) ansDlvDateList.get(0);
                  // �Ǎ����̍X�V�񐔂ƈقȂ�ꍇ�̓G���[
                  if (!s.getl_MODIFY_COUNT().equals(ansDlvDateStruct.getl_MODIFY_COUNT())) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  // �I���s��ODR_NO
                  String odrNo = s.getl_ODR_NO();
              
                  // �X�V�Ώۍs�̏o�׌v��c����Map�Ɋi�[����
                  if (!map.containsKey(odrNo)) {
                   // DB���������āA�ŐV�̏o�׌v��c�����擾����B
                   List odrList = entity.mT_ODR.read(conn, s);
                   KT0010010Struct odrStruct = (KT0010010Struct) odrList.get(0);
                   map.put(odrNo, odrStruct.getl_SHIP_PLAN_REMAIN_QTY());
                  }
                  // �o�׌v��c�����琔�ʂ𑫂��Ďc�����v�Z����Map���X�V����
                  String qty = (String) map.get(odrNo);
                  qty = Calculate.add(qty, s.getl_bk_DESINATED_SHIP_QTY());
                  map.put(odrNo, qty);
              
                  // [�o�׌v��]�폜
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_PART_DLV_SEQ_NO(s.getl_PART_DLV_SEQ_NO());
                  entity.mT_ANS_DLV_DATE.delete(conn, struct);
                 }
              
                 // �ݒ肳�ꂽMap��[�󒍖���]���X�V����
                 for (Iterator i = map.keySet().iterator(); i.hasNext();) {
                  String odrNo = (String) i.next();
                  String shipPlanRemainQty = (String) map.get(odrNo);
              
                  // �v�Z�����o�׌v�搔���v��c�������傫���ꍇ�̓G���[
                  if (Calculate.compare(shipPlanRemainQty, "0") < 0) {
                   setErrorMessage("KT00008", odrNo);
                  }
                  // [�󒍖���]�X�V
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_SHIP_PLAN_REMAIN_QTY(shipPlanRemainQty);
                  entity.mT_ODR.update(conn, struct);
                 }
              
                 // �G���[������ΏI��
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // �ēǍ�
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
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUncheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");
			//{{user_implement_dev:<controlUncheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlUncheckAll>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
              
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // ��ʂ�������
                initializeAll();
                try {
                 // �̔��p�H��R�[�h�擾
                 struct.setCLASS_CODE("PLANT_WEB");
                 List plantCdList = entity.mSYS_CLASS_CODE.read(conn, struct);
                 if (plantCdList.isEmpty()) {
                  setErrorMessage("KR00017");
                  throw new ExpjException("KR00017");
                 }
                 KT0010010Struct plantCdStruct = (KT0010010Struct) plantCdList.get(0);
                 plantCd = plantCdStruct.getCODE();
              
                 // �Ɩ��^�p���擾
                 List sysDateCtrlList = entity.mSYS_DATE_CTRL.read(conn, plantCdStruct);
                 if (sysDateCtrlList.isEmpty()) {
                  setErrorMessage("KQ00039");
                  throw new ExpjException("KQ00039");
                 }
                 KT0010010Struct sysDateCtrlStruct = (KT0010010Struct) sysDateCtrlList.get(0);
                 businessOprDate = sysDateCtrlStruct.getBUSINESS_OPR_DATE();
              
                 // �o�׏������[�h�^�C���擾
                 struct.setCLASS_CODE("SHIP_LT");
                 List sysClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
                 if (sysClassCodeList.isEmpty()) {
                  setErrorMessage("KQ00037");
                  throw new ExpjException("KQ00037");
                 }
                 KT0010010Struct sysClassCodeStruct = (KT0010010Struct) sysClassCodeList.get(0);
                 shipLt = sysClassCodeStruct.getCODE();
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("UncheckAll") ) {
				controlUncheckAll();
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
//			throw new FoundationException("KT0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KT0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KT0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KT0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KT0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KT0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KT0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KT0010010Entity entity;
	protected KT0010010Struct struct;
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

		entity = new KT0010010Entity();
		struct = new KT0010010Struct();

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
	 * KT0010010�N���X�̕W���R���X�g���N�^
	 */
	public KT0010010Control() throws BusinessProcessException, FoundationException
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
				KT0010010Struct key = (KT0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG") && key.getl_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("l_PARTIAL_SHIP_INST_FLG", key.getl_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("r1_STS_TYP") && key.getr1_STS_TYP() != null) {
					msgKey.setKeyValue("r1_STS_TYP", key.getr1_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("r2_STS_TYP") && key.getr2_STS_TYP() != null) {
					msgKey.setKeyValue("r2_STS_TYP", key.getr2_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("KT0010010view1_selected") && key.getKT0010010view1_selected() != null) {
					msgKey.setKeyValue("KT0010010view1_selected", key.getKT0010010view1_selected());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_NO") && key.getl_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_NO", key.getl_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY") && key.getl_SHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("l_SHIP_PLAN_REMAIN_QTY", key.getl_SHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY") && key.getl_DESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_QTY", key.getl_DESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG") && key.getPARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG", key.getPARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PKG_UNIT") && key.getl_PKG_UNIT() != null) {
					msgKey.setKeyValue("l_PKG_UNIT", key.getl_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_NAME") && key.getl_CUST_NAME() != null) {
					msgKey.setKeyValue("l_CUST_NAME", key.getl_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD") && key.getl_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("l_SHIP_WH_CD", key.getl_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_PLANT_CD") && key.getl_SHIP_PLANT_CD() != null) {
					msgKey.setKeyValue("l_SHIP_PLANT_CD", key.getl_SHIP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO") && key.getl_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("l_PART_DLV_SEQ_NO", key.getl_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_bk_DESINATED_SHIP_QTY") && key.getl_bk_DESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_bk_DESINATED_SHIP_QTY", key.getl_bk_DESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CODE") && key.getCLASS_CODE() != null) {
					msgKey.setKeyValue("CLASS_CODE", key.getCLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT") && key.getl_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("l_TRANSPORT_LT", key.getl_TRANSPORT_LT());
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
					KT0010010Struct key = new KT0010010Struct();
					if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG")) {
						key.setl_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("l_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r1_STS_TYP")) {
						key.setr1_STS_TYP(msgKey.getKeyValue("r1_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r2_STS_TYP")) {
						key.setr2_STS_TYP(msgKey.getKeyValue("r2_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("KT0010010view1_selected")) {
						key.setKT0010010view1_selected(msgKey.getKeyValue("KT0010010view1_selected"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_NO")) {
						key.setl_ODR_NO(msgKey.getKeyValue("l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY")) {
						key.setl_SHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("l_SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY")) {
						key.setl_DESINATED_SHIP_QTY(msgKey.getKeyValue("l_DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG")) {
						key.setPARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PKG_UNIT")) {
						key.setl_PKG_UNIT(msgKey.getKeyValue("l_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_NAME")) {
						key.setl_CUST_NAME(msgKey.getKeyValue("l_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD")) {
						key.setl_SHIP_WH_CD(msgKey.getKeyValue("l_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_PLANT_CD")) {
						key.setl_SHIP_PLANT_CD(msgKey.getKeyValue("l_SHIP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO")) {
						key.setl_PART_DLV_SEQ_NO(msgKey.getKeyValue("l_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_bk_DESINATED_SHIP_QTY")) {
						key.setl_bk_DESINATED_SHIP_QTY(msgKey.getKeyValue("l_bk_DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CODE")) {
						key.setCLASS_CODE(msgKey.getKeyValue("CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT")) {
						key.setl_TRANSPORT_LT(msgKey.getKeyValue("l_TRANSPORT_LT"));
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
