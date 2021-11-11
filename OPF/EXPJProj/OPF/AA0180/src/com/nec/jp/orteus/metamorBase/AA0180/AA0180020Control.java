/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0180;

import com.nec.jp.orteus.metamorBase.AA0180.*;
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

import java.text.ParseException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.psmaintenance.PsMaintenance;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.ExpjBadException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0180020Control
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
        public AA0180020Struct getListvalue(int x) { return (AA0180020Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AA0180020Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AA0180020Struct createStruct() { return new AA0180020Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AA0180020Struct)structname); }	// Struct���Z�b�g���܂��B
        public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        /** �W�J�敪�F���W�J */
        private static final String DEVELOP_NORMAL = "1";
       
        /** �W�J�敪�F�t�W�J */
        private static final String DEVELOP_REVERSE = "2";
       
        /** �Ώۓ��t */
        private String _targetDate = null;
       
        /** ���i�\�������e�i���X���i�A�N�Z�X�p�I�u�W�F�N�g */
        private PsMaintenance _psMaint = null;
       
        /** �i�ڔԍ��i��ʑJ�ڎ��j */
        private String _givenItemCd = null;
       
        /** �Ώۓ��t�i��ʑJ�ڎ��j */
        private String _givenTargetDate = null;
       
        /** �W�J�敪�i��ʑJ�ڎ��j */
        private String _givenDevelopTyp = null;
       
        /** �����敪�i��ʑJ�ڎ��j */
        private String _givenProcTyp = null;
       
        /**
         * �f�[�^�Ȃ���O�N���X�ł��B
         */
        private class AA0180020NoDataException extends ExpjBadException
        {
         /**
             * AA0180020NoDataException�I�u�W�F�N�g���\�z���܂��B
          *
          * @param em �G���[���b�Z�[�W�I�u�W�F�N�g
          */
         private AA0180020NoDataException(ExpjMessage em)
         {
          super(em);
         }
        }
       
        /**
         * ����i�ڔԍ���O�N���X�ł��B
         */
        private class AA0180020SameItemCdException extends ExpjBadException
        {
         /**
             * AA0180020SameItemCdException�I�u�W�F�N�g���\�z���܂��B
          *
          * @param em �G���[���b�Z�[�W�I�u�W�F�N�g
          */
         private AA0180020SameItemCdException(ExpjMessage em)
         {
          super(em);
         }
        }
       
        /**
         * �����\���̈ꗗ���擾���܂��B
         *
         * @param  �i�ڔԍ�
         * @return �����\���̈ꗗ
         * @throws SQLException DB�A�N�Z�X�Ɏ��s
         * @throws ParseException ���t�̌`���ϊ��Ɏ��s
         */
        private List getPsList(String itemCd)
          throws SQLException, ParseException
        {
         if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
          // ���W�J�̏ꍇ
          if (_targetDate == null || _targetDate.equals("") == true) {
           // �Ώۓ��t�Ȃ��̏ꍇ
           return _psMaint.getCompPsList(itemCd);
          } else {
           // �Ώۓ��t����̏ꍇ
           return _psMaint.getCompPsList(itemCd, _targetDate);
          }
         } else {
          // �t�W�J�̏ꍇ
          if (_targetDate == null || _targetDate.equals("") == true) {
           // �Ώۓ��t�Ȃ��̏ꍇ
           return _psMaint.getParentPsList(itemCd);
          } else {
           // �Ώۓ��t����̏ꍇ
           return _psMaint.getParentPsList(itemCd, _targetDate);
          }
         }
        }
       
        /**
         * �R�s�[�������\���̕i�ڔԍ����R�s�[������\���̎q�i�ڔԍ��Ɉ�v���邩�������܂��B
         *
         * @param  �R�s�[��̐e�i�ڔԍ�
         * @param  �R�s�[�������\���̎q�i�ڔԍ�
         * @throws SQLException DB�A�N�Z�X�Ɏ��s
         * @throws FoundationException
         * @throws AA0180020SameItemCdException �R�s�[�������\���̕i�ڂ��R�s�[������\���̕i�ڂɈ�v
         */
        private void testCompAlreadyExist(String toParentItemCd, String fromCompItemCd)
          throws SQLException, FoundationException, AA0180020SameItemCdException
        {
         AA0180020Struct workStruct = new AA0180020Struct();
         workStruct.setToUp_ITEM_CD(toParentItemCd);
         workStruct.setFrLo_ITEM_CD(fromCompItemCd);
         List workList = entity.mSelectCompM_PS.read(conn, workStruct);
         if (workList != null && workList.size() > 0) {
          // �R�s�[�������\���̕i�ڂ��R�s�[������\���̕i�ڂɈ�v�����ꍇ
          throw new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
            "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + toParentItemCd + "," + fromCompItemCd));
         }
        }
       
        /**
         * �R�s�[�������\���̕i�ڔԍ����R�s�[������\���̐e�i�ڔԍ��Ɉ�v���邩�������܂��B
         *
         * @param  �R�s�[�������\���̐e�i�ڔԍ�
         * @param  �R�s�[��̎q�i�ڔԍ�
         * @throws FoundationException
         * @throws SQLException DB�A�N�Z�X�Ɏ��s
         * @throws AA0180020SameItemCdException �R�s�[�������\���̕i�ڂ��R�s�[������\���̕i�ڂɈ�v
         */
        private void testParentAlreadyExist(String fromParentItemCd, String toCompItemCd)
          throws FoundationException, SQLException, AA0180020SameItemCdException
        {
         AA0180020Struct workStruct = new AA0180020Struct();
         workStruct.setFrLo_ITEM_CD(fromParentItemCd);
         workStruct.setToUp_ITEM_CD(toCompItemCd);
         List workList = entity.mSelectParentM_PS.read(conn, workStruct);
         if (workList != null && workList.size() > 0) {
          // �R�s�[�������\���̕i�ڂ��R�s�[������\���̕i�ڂɈ�v�����ꍇ
          throw new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
            "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + fromParentItemCd + "," + toCompItemCd));
         }
        }
       
        /**
         * �i�ڔԍ��ɑ΂���i�ږ����擾���܂�
         *
         * @param  �i�ڔԍ�
         * @return �i�ږ�
         * @throws FoundationException
         * @throws SQLException DB�A�N�Z�X�Ɏ��s
         * @throws AA0180020NoDataException �i�ڔԍ������݂��Ȃ�
         */
        private String getItemName(String itemCd)
          throws FoundationException, SQLException, AA0180020NoDataException
        {
         AA0180020Struct workStruct = new AA0180020Struct();
         workStruct.setFrUp_ITEM_CD(itemCd);
         List workList = entity.mSelect.read(conn, workStruct);
         if (workList == null || workList.isEmpty()) {
          // �i�ڔԍ������݂��Ȃ��ꍇ
          throw new AA0180020NoDataException(new ExpjMessage("ZZ01006",
            "M_ITEM.ITEM_CD:" + itemCd));
         }
         workStruct = (AA0180020Struct)workList.get(0);
         return workStruct.getFrUp_ITEM_NAME();
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
         * ��ʂ��������܂��B
         *
         * @throws BusinessProcessException
         * @throws FoundationException
         */
        private void clearScreen()
          throws BusinessProcessException, FoundationException
        {
         // ���͂��ꂽ�p�����[�^��ޔ�
         String saveFrUpItemCd = struct.getFrUp_ITEM_CD();
         String saveh_FrUpItemCd = struct.geth_FrUp_ITEM_CD();
         String saveToUpItemCd = struct.getToUp_ITEM_CD();
         String saveh_ToUpItemCd = struct.geth_ToUp_ITEM_CD();
         String saveTargetDate = struct.getTargetDate();
         String saveh_TargetDate = struct.geth_TargetDate();
         String saveDevelopTyp = struct.getDEVELOP_TYP();
         String saveh_DevelopTyp = struct.geth_DEVELOP_TYP();
         // struct��������
         struct.initialize();
         // ���͂��ꂽ�p�����[�^�𕜌�
         struct.setFrUp_ITEM_CD(saveFrUpItemCd);
         struct.seth_FrUp_ITEM_CD(saveh_FrUpItemCd);
         struct.setToUp_ITEM_CD(saveToUpItemCd);
         struct.seth_ToUp_ITEM_CD(saveh_ToUpItemCd);
         struct.setTargetDate(saveTargetDate);
         struct.seth_TargetDate(saveh_TargetDate);
         struct.setDEVELOP_TYP(saveDevelopTyp);
         struct.seth_DEVELOP_TYP(saveh_DevelopTyp);
       
         // list��������
         if (list != null) {
          list.clear();
         }
         if (_toList != null) {
          _toList.clear();
         }
       
         // �Ǎ���ԁi������ԁj��ݒ�
         setReadStatus(INITIAL);
        }
       
        /**
         * ��ʂ����������܂��B
         *
         * @throws BusinessProcessException
         * @throws FoundationException
         */
        private void initializeScreen()
          throws BusinessProcessException, FoundationException
        {
         // �ʃT�[�u���b�g�̉�ʂ���Ăяo���ꂽ�Ƃ��n���ꂽ�p�����[�^��ޔ�
         String saveh_FrUpItemCd = struct.geth_FrUp_ITEM_CD();
         String saveh_ToUpItemCd = struct.geth_ToUp_ITEM_CD();
         String saveh_TargetDate = struct.geth_TargetDate();
         String saveh_DevelopTyp = struct.geth_DEVELOP_TYP();
         // struct��������
         struct.initialize();
         // �ʃT�[�u���b�g�̉�ʂ���Ăяo���ꂽ�Ƃ��n���ꂽ�p�����[�^�𕜌�
         struct.setFrUp_ITEM_CD(saveh_FrUpItemCd);
         struct.seth_FrUp_ITEM_CD(saveh_FrUpItemCd);
         struct.setToUp_ITEM_CD(saveh_ToUpItemCd);
         struct.seth_ToUp_ITEM_CD(saveh_ToUpItemCd);
         struct.setTargetDate(saveh_TargetDate);
         struct.seth_TargetDate(saveh_TargetDate);
         struct.setDEVELOP_TYP(saveh_DevelopTyp);
         struct.seth_DEVELOP_TYP(saveh_DevelopTyp);
       
         // list��������
         if (list != null) {
          list.clear();
         }
         if (_toList != null) {
          _toList.clear();
         }
       
         // �Ǎ���ԁi������ԁj��ݒ�
         setReadStatus(INITIAL);
       
         if (struct.geth_DEVELOP_TYP() != null && struct.geth_DEVELOP_TYP().equals("") == false) {
          // �ʃT�[�u���b�g�̉�ʂ���Ăяo���ꂽ�Ƃ��́A�Ǎ����������s
          selectByInputData();
         }
        }
       
        /**
         * �Ǎ��������s���܂��B
         * �i�Ǎ��̈�̓��͍��ڂɑ΂��Č����������s���A��ʂɕ\�����邽�߂ɒl��ݒ肵�܂��j
         *
         * @throws BusinessProcessException
         * @throws FoundationException
         * @throws ExpjException �V�X�e���G���[
         */
        private void selectByInputData()
          throws BusinessProcessException, FoundationException, ExpjException
        {
         try {
          //�i�ڑ��݊m�F�t���O�̒�`
          boolean FrUp_ITEM_CD_flg = false;
          boolean ToUp_ITEM_CD_flg = false;
          
          // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
          beginTransaction();		// �V�X�e���������擾
          _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
            struct.getsSysdate());
          // �Ώۓ��t�̐ݒ�
          _targetDate = struct.getTargetDate();
       
          // �R�s�[���i�ڔԍ��̑��݃`�F�b�N
           if (struct.getFrUp_ITEM_CD() != null
             && struct.getFrUp_ITEM_CD().equals("") == false){
               struct.setCK_ITEM_CD(struct.getFrUp_ITEM_CD());
               if(!entity.mCheckItem_cd.check(conn, struct)){
                   // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                   setReadStatus(ERROR);
                   // �x���F�Ώۃf�[�^�����݂��܂���B
                   ExpjMessage emsg = new ExpjMessage("ZZ06001");
                   msgStruct.addError(emsg);
                   setErrorParameter("M_ITEM","ITEM_CD",struct.getFrUp_ITEM_CD());
                   
               }else{
            	   //�R�s�[���i�ڑ��݊m�F
            	   FrUp_ITEM_CD_flg =true;
            	   
                   // �R�s�[�������\���̎擾
                   List frPs = getPsList(struct.getFrUp_ITEM_CD());
                   int frPsSize = 0;
                   if (frPs != null) {
                	   frPsSize = frPs.size();
                   }
                   if (list == null) {
                	   list = new ArrayList(0);
                   } else {
                	   list.clear();
                   }
                   if (frPsSize == 0 && struct.getFrUp_ITEM_CD() != null
                     && struct.getFrUp_ITEM_CD().equals("") == false) {
                       // �R�s�[���i�ڔԍ��̊����\�������݂��Ȃ��ꍇ
                       AA0180020NoDataException nde = null;
                       if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                           // ���W�J�̏ꍇ
                           nde = new AA0180020NoDataException(new ExpjMessage("ZZ01006",
                             "M_PS.PARENT_ITEM_CD:" + struct.getFrUp_ITEM_CD()));
                       } else {
                           // �t�W�J�̏ꍇ
                           nde = new AA0180020NoDataException(new ExpjMessage("ZZ01006",
                             "M_PS.COMP_ITEM_CD:" + struct.getFrUp_ITEM_CD()));
                       }
                       throw nde;
                   }
                   for (int i = 0; i < frPsSize; i++) {
                       AA0180020Struct workStruct = new AA0180020Struct();
                       String[] frPss = (String[])frPs.get(i);
                       workStruct.setFrLo_ITEM_CD(frPss[0]);
                       workStruct.setFr_PS_EDITION(frPss[1]);
                       workStruct.setFrLo_ITEM_NAME(getItemName(frPss[0]));
                       workStruct.setFr_EFF_PHASE_IN_DATE(frPss[2]);
                       workStruct.setFr_EFF_PHASE_OUT_DATE(frPss[3]);
                       workStruct.seth_Fr_MODIFY_COUNT(frPss[4]);
                       list.add(workStruct);
                   }
               }
           }
           // �R�s�[��i�ڔԍ��̑��݃`�F�b�N
           if (struct.getToUp_ITEM_CD() != null
             && struct.getToUp_ITEM_CD().equals("") == false)
           {
               struct.setCK_ITEM_CD(struct.getToUp_ITEM_CD());
               if(!entity.mCheckItem_cd.check(conn, struct)){
                   // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                   setReadStatus(ERROR);
                   // �x���F�Ώۃf�[�^�����݂��܂���B
                   ExpjMessage emsg = new ExpjMessage("ZZ06001" ,"M_ITEM.ITEM_CD:" + struct.geth_ToUp_ITEM_CD());
                   msgStruct.addError(emsg);
                   setErrorParameter("M_ITEM","ITEM_CD",struct.getToUp_ITEM_CD());
               }else{
            	   //�R�s�[��i�ڑ��݊m�F
            	   ToUp_ITEM_CD_flg =true;
            	   
                   // �R�s�[������\���̎擾
                   List toPs = getPsList(struct.getToUp_ITEM_CD());
                   int toPsSize = 0;
                   if (toPs != null) {
                	   toPsSize = toPs.size();
                   }
                   if (_toList == null) {
                	   _toList = new ArrayList(0);
                   } else {
                	   _toList.clear();
                   }
                   for (int i = 0; i < toPsSize; i++) {
                       AA0180020Struct workStruct = new AA0180020Struct();
                       String[] toPss = (String[])toPs.get(i);
                       workStruct.setToLo_ITEM_CD(toPss[0]);
                       workStruct.setTo_PS_EDITION(toPss[1]);
                       workStruct.setToLo_ITEM_NAME(getItemName(toPss[0]));
                       workStruct.setTo_EFF_PHASE_IN_DATE(toPss[2]);
                       workStruct.setTo_EFF_PHASE_OUT_DATE(toPss[3]);
                       _toList.add(workStruct);
                   }
               }
           }
          if (FrUp_ITEM_CD_flg&&ToUp_ITEM_CD_flg)
          {
           // �Ǎ���ԁi�Ǎ������j��ݒ�
           setReadStatus(NORMAL);
          }
       
         } catch (AA0180020NoDataException nde) {
          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
          setReadStatus(ERROR);
          // �x���F�Ώۃf�[�^�����݂��܂���B
          ExpjMessage emsg = new ExpjMessage("ZZ06001");
          msgStruct.addError(emsg);
          sysLog.warning(emsg, getsysUSER_CD());
          emsg = nde.getExpjMessage();
          if (emsg != null) {
           msgStruct.addError(emsg);
           sysLog.warning(emsg, getsysUSER_CD());
          }
          return;
         } catch (ParseException pe) {
          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
          setReadStatus(ERROR);
          // �G���[�F�T�[�o�ŃG���[���������܂����B
          ExpjMessage emsg = new ExpjMessage("ZZ01106");
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(pe, emsg);
          if (_psMaint != null) {
           emsg = _psMaint.getErrorInfo();
           if (emsg != null) {
            sysLog.severe(emsg, getsysUSER_CD());
           }
          }
          throw ee;
         } catch (SQLException se) {
          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
          setReadStatus(ERROR);
          // �G���[�F�T�[�o�ŃG���[���������܂����B
          ExpjMessage emsg = new ExpjMessage("ZZ01106");
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(se, emsg);
          if (_psMaint != null) {
           emsg = _psMaint.getErrorInfo();
           if (emsg != null) {
            sysLog.severe(emsg, getsysUSER_CD());
           }
          }
          emsg = new ExpjMessage("ZZ01006", se.toString());
          sysLog.severe(emsg, getsysUSER_CD());
          throw ee;
         }
        }
       
        /**
         * �R�s�[��̈ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
         */
        protected List _toList;
       
        /**
         * �i�ڔԍ��i��ʑJ�ڎ��j��ݒ肵�܂��B
         *
         * @param val �i�ڔԍ�
         */
        protected void setITEM_CD(String val)
        {
         _givenItemCd = val;
        }
       
        /**
         * �i�ڔԍ��i��ʑJ�ڎ��j���擾���܂��B
         *
         * @return �i�ڔԍ�
         */
        protected String getITEM_CD()
        {
         return _givenItemCd;
        }
       
        /**
         * �Ώۓ��t�i��ʑJ�ڎ��j��ݒ肵�܂��B
         *
         * @param val �Ώۓ��t
         */
        protected void setTargetDate(String val)
        {
         _givenTargetDate = val;
        }
       
        /**
         * �Ώۓ��t�i��ʑJ�ڎ��j���擾���܂��B
         *
         * @return �Ώۓ��t
         */
        protected String getTargetDate()
        {
         return _givenTargetDate;
        }
       
        /**
         * �W�J�敪�i��ʑJ�ڎ��j��ݒ肵�܂��B
         *
         * @param val �W�J�敪
         */
        protected void setDEVELOP_TYP(String val)
        {
         _givenDevelopTyp = val;
        }
       
        /**
         * �W�J�敪�i��ʑJ�ڎ��j���擾���܂��B
         *
         * @return �W�J�敪
         */
        protected String getDEVELOP_TYP()
        {
         return _givenDevelopTyp;
        }
       
        /**
         * �����敪�i��ʑJ�ڎ��j��ݒ肵�܂��B
         *
         * @param val �����敪
         */
        protected void setProcTyp(String val) {
         _givenProcTyp = val;
        }
       
        /**
         * �����敪�i��ʑJ�ڎ��j���擾���܂��B
         *
         * @return �����敪
         */
        protected String getProcTyp()
        {
         return _givenProcTyp;
        }
       
        /**
         * �R�s�[��̈ꗗ�����̌��ʃ��X�g��Ԃ��܂��B
         *
         * @return �R�s�[��̈ꗗ�����̌��ʃ��X�g
         */
        public List getToList() {
         return _toList;
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                // ��ʂ��N���A
                clearScreen();
              
                // �Ǎ����������s
                selectByInputData();
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                try {
                 // �g�����U�N�V�������J�n
                 conn.beginTransWeb();
              
                 // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
                 beginTransaction();		// �V�X�e���������擾
                 _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                   struct.getsSysdate());
                 // �Ώۓ��t�̐ݒ�
                 _targetDate = struct.getTargetDate();
              
                 // �R�s�[�������\���̃��X�g����
                 List frLoItemCdList = struct.getList_FrLo_ITEM_CD();
                 List frPsEditionList = struct.getList_Fr_PS_EDITION();
                 List frEffPhaseInDateList = struct.getList_Fr_EFF_PHASE_IN_DATE();
                 List frEffPhaseOutDateList = struct.getList_Fr_EFF_PHASE_OUT_DATE();
                 List frModifyCountList = struct.getList_h_Fr_MODIFY_COUNT();
                 int frLoItemCdListSize = 0;
                 if (frLoItemCdList != null) {
                  frLoItemCdListSize = frLoItemCdList.size();
                 }
                 for (int i = 0; i < frLoItemCdListSize; i++) {
                  String frLoItemCd = (String)frLoItemCdList.get(i);
                  if (frLoItemCd.equals(struct.getToUp_ITEM_CD()) == true) {
                   // �R�s�[�������\���̕i�ڔԍ����R�s�[��i�ڔԍ��Ɉ�v
                   AA0180020SameItemCdException sice = null;
                   if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                    // ���W�J�̏ꍇ
                    sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                      "M_PS.COMP_ITEM_CD:" + frLoItemCd));
                   } else {
                    // �t�W�J�̏ꍇ
                    sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                      "M_PS.PARENT_ITEM_CD:" + frLoItemCd));
                   }
                   throw sice;
                  }
                  String frPsEdition = (String)frPsEditionList.get(i);
                  int toListSize = _toList.size();
                  for (int j = 0; j < toListSize; j++) {
                   AA0180020Struct workStruct = (AA0180020Struct)_toList.get(j);
                   if (workStruct.getToLo_ITEM_CD().equals(frLoItemCd) == true
                     && workStruct.getTo_PS_EDITION().equals(frPsEdition) == true)
                   {
                    // �R�s�[�������\���̕i�ڔԍ����R�s�[������\���̕i�ڔԍ��Ɉ�v
                    AA0180020SameItemCdException sice = null;
                    if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                     // ���W�J�̏ꍇ
                     sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                       "M_PS.COMP_ITEM_CD:" + frLoItemCd));
                    } else {
                     // �t�W�J�̏ꍇ
                     sice = new AA0180020SameItemCdException(new ExpjMessage("ZZ01006",
                       "M_PS.PARENT_ITEM_CD:" + frLoItemCd));
                    }
                    throw sice;
                   }
                  }
                  String frEffPhaseInDate = (String)frEffPhaseInDateList.get(i);
                  String frEffPhaseOutDate = (String)frEffPhaseOutDateList.get(i);
                  if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                   // ���W�J�̏ꍇ
                   // �R�s�[�������\���̕i�ڔԍ����R�s�[������\���̕i�ڔԍ��Ɉ�v
                   testCompAlreadyExist(struct.getToUp_ITEM_CD(), frLoItemCd);
                   // ���i�\���̕i�ڎ�z�敪����
                   _psMaint.testMrpOrderType(struct.getToUp_ITEM_CD(), frLoItemCd);
                   // ���i�\���̏d�����Ԍ���
                   _psMaint.testConflictEffPhase(struct.getToUp_ITEM_CD(), frLoItemCd,
                     frPsEdition, frEffPhaseInDate, frEffPhaseInDate);
                   // ���i�\���̃��[�s���O����
                   _psMaint.testLoopingCompPs(struct.getToUp_ITEM_CD(), frLoItemCd);
                  } else {
                   // �t�W�J�̏ꍇ
                   // �R�s�[�������\���̕i�ڔԍ����R�s�[������\���̕i�ڔԍ��Ɉ�v
                   testParentAlreadyExist(frLoItemCd, struct.getToUp_ITEM_CD());
                   // ���i�\���̕i�ڎ�z�敪����
                   _psMaint.testMrpOrderType(frLoItemCd, struct.getToUp_ITEM_CD());
                   // ���i�\���̏d�����Ԍ���
                   _psMaint.testConflictEffPhase(frLoItemCd, struct.getToUp_ITEM_CD(),
                     frPsEdition, frEffPhaseInDate, frEffPhaseInDate);
                   // ���i�\���̃��[�s���O����
                   _psMaint.testLoopingCompPs(frLoItemCd, struct.getToUp_ITEM_CD());
                  }
                 }
                 for (int i = 0; i < frLoItemCdListSize; i++) {
                  String frLoItemCd = (String)frLoItemCdList.get(i);
                  String frPsEdition = (String)frPsEditionList.get(i);
                  String frModifyCount = (String)frModifyCountList.get(i);
                  if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                   // ���W�J�̏ꍇ
                   // �R�s�[�������q�\�����R�s�[
                   _psMaint.copyCompPs(struct.getFrUp_ITEM_CD(), frLoItemCd, frPsEdition,
                     frModifyCount, struct.getToUp_ITEM_CD());
                  } else {
                   // �t�W�J�̏ꍇ
                   // �R�s�[�������e�\�����R�s�[
                   _psMaint.copyParentPs(frLoItemCd, struct.getFrUp_ITEM_CD(), frPsEdition,
                     frModifyCount, struct.getToUp_ITEM_CD());
                  }
                 }
              
                 // �f�[�^���m��
                 conn.commit();
              
                 // �ĕ\��
                 controlSelect();
              
                } catch (AA0180020SameItemCdException sice) {
                 // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                 setReadStatus(ERROR);
                 // �x���F����i�ڔԍ��͒ǉ��ł��܂���B
                 ExpjMessage emsg = new ExpjMessage("AA00051");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = sice.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (PsMrpOdrTypException pmote) {
                 // �x���F���̍\���͎�z�敪�ɖ���������܂��B
                 ExpjMessage emsg = new ExpjMessage("AA00052");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = pmote.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (PsEffPhaseException pepe) {
                 // �x���F�L�������d�����Ă��܂��B
                 ExpjMessage emsg = new ExpjMessage("AA00054");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = pepe.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (PsLoopException ple) {
                 // �x���F�\�����ɖ���������܂��B
                 ExpjMessage emsg = new ExpjMessage("AA00055");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = ple.getExpjMessage();
                 if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
                 }
                 return;
                } catch (NoDataException nde) {
                 // �x���F�Ώۃf�[�^�����݂��܂���B
                 ExpjMessage emsg = new ExpjMessage("ZZ06001");
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 if (_psMaint != null) {
                  emsg = _psMaint.getErrorInfo();
                  if (emsg != null) {
                   msgStruct.addError(emsg);
                   sysLog.warning(emsg, getsysUSER_CD());
                  }
                 }
                 return;
                } catch (ExpjBadException ebe) {
                 ExpjMessage emsg = ebe.getExpjMessage();
                 if (emsg == null) {
                  // �G���[�F�T�[�o�ŃG���[���������܂����B
                  emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(ebe, emsg);
                  throw ee;
                 }
                 // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
                 // �x���F�w��L�[�̃f�[�^�����łɑ��݂��܂��B
                 String code = emsg.getCode();
                 String value = emsg.getValue();
                 emsg = new ExpjMessage(code);
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", value);
                 msgStruct.addError(emsg);
                 sysLog.warning(emsg, getsysUSER_CD());
                 return;
                } catch (ParseException pe) {
                 // �G���[�F�T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(pe, emsg);
                 emsg = _psMaint.getErrorInfo();
                 if (emsg != null) {
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } catch (SQLException se) {
                 // �G���[�F�T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = _psMaint.getErrorInfo();
                 if (emsg != null) {
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // ��ʂ��������istruct�Clist���������j
                initializeScreen();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
                if (isScreenMove() == true) {
                 if (_givenProcTyp != null && _givenProcTyp.equals("CopyFrom") == true) {
                  // �R�s�[�o�^�F������R�s�[
                  struct.setFrUp_ITEM_CD(_givenItemCd);
                  struct.seth_FrUp_ITEM_CD(_givenItemCd);
                 } else {
                  // �R�s�[�o�^�F�����փR�s�[
                  struct.setToUp_ITEM_CD(_givenItemCd);
                  struct.seth_ToUp_ITEM_CD(_givenItemCd);
                 }
                 struct.setTargetDate(_givenTargetDate);
                 struct.seth_TargetDate(_givenTargetDate);
                 struct.setDEVELOP_TYP(_givenDevelopTyp);
                 struct.seth_DEVELOP_TYP(_givenDevelopTyp);
                }
              
                // ��ʂ��������istruct�Clist���������j
                initializeScreen();
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              
                try {
                 // �W�J�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                 ComboStruct DEVELOP_TYP = comboController.getData("DEVELOP_TYP");
                 struct.setList_DEVELOP_TYP_val(DEVELOP_TYP.getValList());
                 struct.setList_DEVELOP_TYP_name(DEVELOP_TYP.getExplanList());
                } catch (SQLException se) {
                 // �G���[�F�T�[�o�ŃG���[���������܂����B
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                }
              
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0180020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              //		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
              //		} catch(AlarmMessageException ame){
              //			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0180020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0180020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0180020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0180020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0180020Entity entity;
	protected AA0180020Struct struct;
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

		entity = new AA0180020Entity();
		struct = new AA0180020Struct();

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
	 * AA0180020�N���X�̕W���R���X�g���N�^
	 */
	public AA0180020Control() throws BusinessProcessException, FoundationException
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
				AA0180020Struct key = (AA0180020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ToUp_ITEM_NAME") && key.getToUp_ITEM_NAME() != null) {
					msgKey.setKeyValue("ToUp_ITEM_NAME", key.getToUp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("TargetDate") && key.getTargetDate() != null) {
					msgKey.setKeyValue("TargetDate", key.getTargetDate());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP") && key.getDEVELOP_TYP() != null) {
					msgKey.setKeyValue("DEVELOP_TYP", key.getDEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("Fr_PS_EDITION") && key.getFr_PS_EDITION() != null) {
					msgKey.setKeyValue("Fr_PS_EDITION", key.getFr_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_IN_DATE") && key.getFr_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("Fr_EFF_PHASE_IN_DATE", key.getFr_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_OUT_DATE") && key.getFr_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("Fr_EFF_PHASE_OUT_DATE", key.getFr_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_Fr_MODIFY_COUNT") && key.geth_Fr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_Fr_MODIFY_COUNT", key.geth_Fr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ToLo_ITEM_CD") && key.getToLo_ITEM_CD() != null) {
					msgKey.setKeyValue("ToLo_ITEM_CD", key.getToLo_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("To_PS_EDITION") && key.getTo_PS_EDITION() != null) {
					msgKey.setKeyValue("To_PS_EDITION", key.getTo_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ToLo_ITEM_NAME") && key.getToLo_ITEM_NAME() != null) {
					msgKey.setKeyValue("ToLo_ITEM_NAME", key.getToLo_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("To_EFF_PHASE_IN_DATE") && key.getTo_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("To_EFF_PHASE_IN_DATE", key.getTo_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("To_EFF_PHASE_OUT_DATE") && key.getTo_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("To_EFF_PHASE_OUT_DATE", key.getTo_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_FrUp_ITEM_CD") && key.geth_FrUp_ITEM_CD() != null) {
					msgKey.setKeyValue("h_FrUp_ITEM_CD", key.geth_FrUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ToUp_ITEM_CD") && key.geth_ToUp_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ToUp_ITEM_CD", key.geth_ToUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TargetDate") && key.geth_TargetDate() != null) {
					msgKey.setKeyValue("h_TargetDate", key.geth_TargetDate());
				}
				if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP") && key.geth_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("h_DEVELOP_TYP", key.geth_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name") && key.getDEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_name", key.getDEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val") && key.getDEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_val", key.getDEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("FrUp_ITEM_NAME") && key.getFrUp_ITEM_NAME() != null) {
					msgKey.setKeyValue("FrUp_ITEM_NAME", key.getFrUp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("FrUp_ITEM_CD") && key.getFrUp_ITEM_CD() != null) {
					msgKey.setKeyValue("FrUp_ITEM_CD", key.getFrUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FrLo_ITEM_CD") && key.getFrLo_ITEM_CD() != null) {
					msgKey.setKeyValue("FrLo_ITEM_CD", key.getFrLo_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ToUp_ITEM_CD") && key.getToUp_ITEM_CD() != null) {
					msgKey.setKeyValue("ToUp_ITEM_CD", key.getToUp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FrLo_ITEM_NAME") && key.getFrLo_ITEM_NAME() != null) {
					msgKey.setKeyValue("FrLo_ITEM_NAME", key.getFrLo_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CK_ITEM_CD") && key.getCK_ITEM_CD() != null) {
					msgKey.setKeyValue("CK_ITEM_CD", key.getCK_ITEM_CD());
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
					AA0180020Struct key = new AA0180020Struct();
					if(msgKeyType.containsKeyColumn("ToUp_ITEM_NAME")) {
						key.setToUp_ITEM_NAME(msgKey.getKeyValue("ToUp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TargetDate")) {
						key.setTargetDate(msgKey.getKeyValue("TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP")) {
						key.setDEVELOP_TYP(msgKey.getKeyValue("DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Fr_PS_EDITION")) {
						key.setFr_PS_EDITION(msgKey.getKeyValue("Fr_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_IN_DATE")) {
						key.setFr_EFF_PHASE_IN_DATE(msgKey.getKeyValue("Fr_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Fr_EFF_PHASE_OUT_DATE")) {
						key.setFr_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("Fr_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_Fr_MODIFY_COUNT")) {
						key.seth_Fr_MODIFY_COUNT(msgKey.getKeyValue("h_Fr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ToLo_ITEM_CD")) {
						key.setToLo_ITEM_CD(msgKey.getKeyValue("ToLo_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("To_PS_EDITION")) {
						key.setTo_PS_EDITION(msgKey.getKeyValue("To_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ToLo_ITEM_NAME")) {
						key.setToLo_ITEM_NAME(msgKey.getKeyValue("ToLo_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("To_EFF_PHASE_IN_DATE")) {
						key.setTo_EFF_PHASE_IN_DATE(msgKey.getKeyValue("To_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("To_EFF_PHASE_OUT_DATE")) {
						key.setTo_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("To_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_FrUp_ITEM_CD")) {
						key.seth_FrUp_ITEM_CD(msgKey.getKeyValue("h_FrUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ToUp_ITEM_CD")) {
						key.seth_ToUp_ITEM_CD(msgKey.getKeyValue("h_ToUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TargetDate")) {
						key.seth_TargetDate(msgKey.getKeyValue("h_TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP")) {
						key.seth_DEVELOP_TYP(msgKey.getKeyValue("h_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name")) {
						key.setDEVELOP_TYP_name(msgKey.getKeyValue("DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val")) {
						key.setDEVELOP_TYP_val(msgKey.getKeyValue("DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("FrUp_ITEM_NAME")) {
						key.setFrUp_ITEM_NAME(msgKey.getKeyValue("FrUp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("FrUp_ITEM_CD")) {
						key.setFrUp_ITEM_CD(msgKey.getKeyValue("FrUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FrLo_ITEM_CD")) {
						key.setFrLo_ITEM_CD(msgKey.getKeyValue("FrLo_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ToUp_ITEM_CD")) {
						key.setToUp_ITEM_CD(msgKey.getKeyValue("ToUp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FrLo_ITEM_NAME")) {
						key.setFrLo_ITEM_NAME(msgKey.getKeyValue("FrLo_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CK_ITEM_CD")) {
						key.setCK_ITEM_CD(msgKey.getKeyValue("CK_ITEM_CD"));
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
