/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0020/src/com/nec/jp/orteus/metamorBase/KP0020/KP0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0020;

import com.nec.jp.orteus.metamorBase.KP0020.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KP0020010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shao-guangfeng $
 * @version $Revision: 1.12 $ $Date: 2011/01/30 04:03:45 $
 *
 */
//}}user_implement_code_header

public class KP0020010Control
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
		
	// �f�t�H���g�A�N�Z�T���\�b�h
	protected List list;											// ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public KP0020010Struct getListvalue(int x) { return (KP0020010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KP0020010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KP0020010Struct createStruct() { return new KP0020010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KP0020010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		
		/** ��ʑJ�ڃL�[(�̔����v�v��ԍ�) */
		private String _IN_SALES_PLAN_CD;

		/**
		 * ��ʑJ�ڃL�[(�̔����v�v��ԍ�)�擾
		 * @return �̔����v�v��
		 */
		public String getIN_SALES_PLAN_CD() {
			return _IN_SALES_PLAN_CD;
		}
		/**
		 * ��ʑJ�ڃL�[(�̔����v�v��ԍ�)�ݒ�
		 * @param cd �̔����v�v��
		 */
		public void setIN_SALES_PLAN_CD(String cd) {
			_IN_SALES_PLAN_CD = cd;
		}
		
		//** ��ЃR�[�h */
		private String _companyCD;
		
		//** �A�b�v�f�[�g���ۑ��p�X�g���N�g
		private KP0020010Struct _updateStruct = new KP0020010Struct();
		private KP0020010Struct _deleteStruct = new KP0020010Struct();
		
		/** [�R���{�{�b�N�X�f�[�^]���i�v����ԃ^�C�v�j */
		private ComboStruct _plnTermTypStruct = new ComboStruct();
		
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
		 * ���Џ��̎擾���\�b�h
		 * �ϐ� _companyCD�ɉ�ЃR�[�h���Q�Ƃ�����B
		 */
		private void setCompanyCD() throws ExpjException {
			try {
				List myCompanyList = entity.mgetCOMPANY_CD.read(conn, struct);
				if (myCompanyList.isEmpty()) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				KP0020010Struct myCompanyStruct = (KP0020010Struct) myCompanyList.get(0);
				this._companyCD = myCompanyStruct.getCOMPANY_CD();
			} catch(Exception e) {
				setErrorMessage("KQ00039");
				throw new ExpjException("KQ00039");
			}
		}
		
		/**
		 * �R���{�{�b�N�X�̒l�����ɕ\����������擾���܂��B
		 * @param cs �R���{�{�b�N�X�X�g���N�g�I�u�W�F�N�g
		 * @param val �R���{�{�b�N�X�̒l
		 * @return �R���{�{�b�N�X�̕\���p�f�[�^������
		 */
		private String getComboData(ComboStruct cs, String val) {
			List valList = cs.getValList();
			List explanList = cs.getExplanList();
			for (int i = 0; i < valList.size(); i++) {
				String listVal = (String) valList.get(i);
				if (val.equals(listVal)) {
					return (String) explanList.get(i);
				}
			}
			return null;
		}
		
		/**
		 * ��ʂ̏�i�E���i�t�H�[�������������܂��B
		 * @param clearFlg �N���A�t���O
		 */
		private void initializeUpperForm(boolean clearFlg) {
			if (clearFlg) {
				struct.setIN_SALES_PLAN_CD(null);
			}
			readStatus = INITIAL;
		}
		
		/**
		 * ��ʂ̍��ڂ����������܂��B
		 * @param clearFlg �N���A�t���O
		 */
		private void initializeLowerForm(boolean clearFlg) {
			if (clearFlg) {
				struct.setchkADD_TO_OD("false");
				struct.setIN_PLN_QTY(null);
				struct.setIN_PLN_TERM_TYP("1");
				struct.setIN_PLN_STR_DATE(null);
				struct.setIN_PLN_END_DATE(null);
				struct.setCUST_CD(null);
				struct.setCUST_ANAME(null);
				struct.setCUST_ITEM_CD(null);
				struct.setCUST_ITEM_NAME(null);
				struct.setITEM_CD(null);
				struct.setITEM_NAME(null);
				struct.setDLV_LOC_CD(null);
				struct.setDLV_LOC_NAME(null);
				struct.setSTOCK_UNIT(null);
				struct.setPLN_CD(null);
				struct.setMODIFY_COUNT(null);
			}
			readStatus = INITIAL;
		}
		
		/**
		 * ��ʂ̑S���ڂ����������܂��B
		 */
		private void initializeAll() {
			initializeUpperForm(true);
			initializeLowerForm(true);
			_updateStruct.clear();
			_deleteStruct.clear();
			struct.clear();
		}
		
		/**
		* DB�ɓo�^���ꂽ�v����ԂƓ��͂����v����Ԃ��r����B
		* @param s ��r����Struct
		*/
		public boolean checkPlnTermFromDB(KP0020010Struct s) throws BusinessProcessException, FoundationException {
			try {
				//�f�[�^�x�[�X��̃��R�[�h�Ɠ��t�̏d�������������`�F�b�N
				
				List psDateList = entity.mcheckPLN_DATE.read(conn, s);
		
				if(psDateList.size() == 1){
					//�v����Ԃ̈ȓ��̃��R�[�h�����������Ȃ��ꍇ�A�X�V������
					if(((KP0020010Struct) psDateList.get(0)).getD_SALES_PLAN_CD().equals(s.getIN_SALES_PLAN_CD())){
						return false;
					//�v����Ԃ̈ȓ��̃��R�[�h�������ł͂Ȃ��ꍇ�A���ԏd���̂��߁A�X�V�������Ȃ�
					}else{
						setErrorMessage("KP00001");
						return true;
					}
				//�v����Ԃ̈ȓ��̃��R�[�h�͑��݂��ĂȂ��ꍇ�A�X�V������	
				}else if(psDateList.size() == 0){
						return false;
				}
			
				//�v����Ԃ̈ȓ��̃��R�[�h���������݂��Ă���ꍇ�A���ԏd���̂��߁A�X�V�������Ȃ�
				setErrorMessage("KP00001");
				return true;
				
			} catch (SQLException e) {
				e.printStackTrace();
				setErrorMessage("KP00002");
				return true;
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00002");
				return true;
			}
		}
		
		/**
		* ��ʓ��͏������ƂɃf�[�^�x�[�X��������擾����B
		* @param s �f�[�^��o�^����Struct
		*/
		public void setListData(KP0020010Struct s) throws BusinessProcessException, FoundationException {
			try {
				
				//�����Ŏw�肵��Struct�ɉ�ЃR�[�h���Z�b�g
				setCompanyCD();
				s.setCOMPANY_CD(this._companyCD);
				
				//�̔����v�v��ԍ�������DB���������A���ʂ�tempList��
				List tempList = entity.mgetT_SALES_PLANinfo.read(conn, s);
				
				//�Ώۃf�[�^�����݂��Ȃ��ꍇ�A���b�Z�[�W���o�͂��ďI������B
				if (tempList.isEmpty()) {
					//�Ώۃf�[�^�����݂��܂���B
					setErrorMessage("ZZ06001");
					setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", s.getIN_SALES_PLAN_CD());
					return;
				}
				
				//readStatus�̐ݒ�
				readStatus = NORMAL;
				
				//tempList�̈�ڂ̃��R�[�h��tempStruct��
				KP0020010Struct tempStruct = (KP0020010Struct) tempList.get(0);
				
				//���Y�v��o�^�t���O
				if("1".equals(tempStruct.getADD_TO_OD_FLG())) {
					s.setchkADD_TO_OD("true");
				} else {
					s.setchkADD_TO_OD("false");
				}
				
				s.setIN_PLN_QTY(tempStruct.getIN_PLN_QTY());
				s.setIN_PLN_TERM_TYP(tempStruct.getIN_PLN_TERM_TYP());
				s.setIN_PLN_STR_DATE(tempStruct.getIN_PLN_STR_DATE());
				s.setIN_PLN_END_DATE(tempStruct.getIN_PLN_END_DATE());
				s.setCUST_CD(tempStruct.getCUST_CD());
				s.setCUST_ANAME(tempStruct.getCUST_ANAME());
				s.setDLV_LOC_CD(tempStruct.getDLV_LOC_CD());
				s.setDLV_LOC_NAME(tempStruct.getDLV_LOC_NAME());
				s.setCUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());
				s.setCUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());
				
				s.setPLN_CD(tempStruct.getPLN_CD());
				s.setCOMPANY_CD(tempStruct.getCOMPANY_CD());
				s.setMODIFY_COUNT(tempStruct.getMODIFY_COUNT());
				
				// ���i���̎擾
				List itemSpecList = entity.mgetITEMinfo.read(conn, s);
				if (itemSpecList.isEmpty()) {
					setErrorMessage("KQ00017");
					setErrorParameter("M_ITEM_SPEC", "CUST_ITEM_CD", s.getCUST_ITEM_CD());
					return;
				}
				
				// ���i���f�[�^�Z�b�g
				KP0020010Struct itemSpecStruct = (KP0020010Struct) itemSpecList.get(0);
				s.setUNIT_QTY_TYP(itemSpecStruct.getUNIT_QTY_TYP());
				s.setSTOCK_UNIT(itemSpecStruct.getSTOCK_UNIT());
				s.setMRP_ODR_TYP(itemSpecStruct.getMRP_ODR_TYP());
				s.setITEM_CD(itemSpecStruct.getITEM_CD());
				s.setITEM_NAME(itemSpecStruct.getITEM_NAME());
				
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00008");
				setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", s.getIN_SALES_PLAN_CD());
				return;
			}
		}
		
		/**
		* �X�V�������s��
		* @param updateDataStruct �X�V�p�f�[�^��o�^����Struct
		* @param tempDataStruct �f�[�^�̎擾����Struct
		* tempDataStruct�̏���updateDataStruct�ɃR�s�[���āA�X�V�pStruct���쐬����B
		*/
		public void setUpdateData(KP0020010Struct updateDataStruct, KP0020010Struct tempDataStruct) throws BusinessProcessException, FoundationException {
			//���[���o�b�N����t���O
			boolean rollbackFlg = false;
			
			try {
				
				//�̔����v�v��ԍ��̃Z�b�g
				updateDataStruct.setIN_SALES_PLAN_CD(tempDataStruct.getIN_SALES_PLAN_CD());
				
				
				//�v�搔�̃f�[�^�Z�b�g
				// �����Ǘ��`�F�b�N
				if ("1".equals(tempDataStruct.getUNIT_QTY_TYP())) {
					// �����Ǘ�
					if (tempDataStruct.getIN_PLN_QTY().indexOf(".") >= 0) {
						// �������͂̏ꍇ�F�؏グ
						String tempString = tempDataStruct.getIN_PLN_QTY();
						double tempDouble1 = Double.parseDouble(tempString);
						updateDataStruct.setIN_PLN_QTY(Calculate.ceil(tempDataStruct.getIN_PLN_QTY(), 0));
						double tempDouble2 = Double.parseDouble(updateDataStruct.getIN_PLN_QTY());
						if (tempDouble1 != tempDouble2) {
							// ".0"���͏��O
							setWarningMessage("KQ20004");
							setWarningParameter("T_SALES_PLAN", "PLN_QTY", tempString);
						}
					} else {
						updateDataStruct.setIN_PLN_QTY(tempDataStruct.getIN_PLN_QTY());
					}
				} else {
					//�����Ǘ��i�ڂł͂Ȃ��ꍇ
					updateDataStruct.setIN_PLN_QTY(tempDataStruct.getIN_PLN_QTY());
				}
				
				updateDataStruct.setIN_PLN_TERM_TYP(tempDataStruct.getIN_PLN_TERM_TYP());
				updateDataStruct.setIN_PLN_STR_DATE(tempDataStruct.getIN_PLN_STR_DATE());
				updateDataStruct.setIN_PLN_END_DATE(tempDataStruct.getIN_PLN_END_DATE());
				
				updateDataStruct.setCOMPANY_CD(this._companyCD);
				updateDataStruct.setCUST_CD(tempDataStruct.getCUST_CD());
				updateDataStruct.setCUST_ITEM_CD(tempDataStruct.getCUST_ITEM_CD());
				updateDataStruct.setDLV_LOC_CD(tempDataStruct.getDLV_LOC_CD());
				
				//�v��I�����̃Z�b�g
				//�v����ԃ^�C�v���u�P�v�i���j�̏ꍇ
				if ("1".equals(tempDataStruct.getIN_PLN_TERM_TYP())) {
					updateDataStruct.setIN_PLN_END_DATE(tempDataStruct.getIN_PLN_STR_DATE());
				//�v����ԃ^�C�v���u�Q�v�i�T�E�{���j�̏ꍇ
				} else if ("2".equals(tempDataStruct.getIN_PLN_TERM_TYP())){
					updateDataStruct.setIN_PLN_END_DATE(tempDataStruct.getIN_PLN_END_DATE());
				//�v����ԃ^�C�v���u�R�v�i���j�̏ꍇ
				} else {
					try {
						Calendar cal = Calendar.getInstance();
						Date tempDate = new Date();
					
						tempDate = Converter.strToDate(tempDataStruct.getIN_PLN_STR_DATE() ,"yyyy/MM/dd");
					
						cal.setTime(tempDate);
					
						cal.set(cal.DAY_OF_MONTH, cal.getActualMaximum(cal.DAY_OF_MONTH));
						tempDate = cal.getTime();
					
						updateDataStruct.setIN_PLN_END_DATE(Converter.dateToStr(tempDate ,"yyyy/MM/dd"));
					} catch(Exception e) {
						e.printStackTrace();
						setErrorMessage("KP00006");
						return;
					}
				}
				
				//�v����Ԃ̃Z�b�g
				int termDays = 1;
				String tempDay = new String(updateDataStruct.getIN_PLN_STR_DATE());
				if ((DateTool.compareYMD(updateDataStruct.getIN_PLN_END_DATE(), tempDay)) < 0){
					setErrorMessage("KP00002");
					return;
				}
				//�v����Ԃ��v�Z
				while(DateTool.compareYMD(updateDataStruct.getIN_PLN_END_DATE(), tempDay) != 0){
					tempDay = DateTool.addDay(tempDay, "1");
					termDays++;
					//�P�O�O�O�����z����v��͗��Ă��Ȃ��B
					if (termDays >= 1000) {
						setErrorMessage("KP00007");
						return;
					}
				}
				
				updateDataStruct.setTERM_DAYS(String.valueOf(termDays));
					
				//DB�ɓo�^���ꂽ�v����ԂƓ��͂����v����Ԃ��r����B
				if(checkPlnTermFromDB(updateDataStruct)){
					return;
				}
				
				//���Y�v��o�^�t���O�̒l�̃Z�b�g
				//�i�ڎ�z�敪�̃`�F�b�N
				
				boolean mprOdrTypFlg = false;
				
				if(tempDataStruct.getMRP_ODR_TYP().equals("4")||tempDataStruct.getMRP_ODR_TYP().equals("5")||tempDataStruct.getMRP_ODR_TYP().equals("6")||tempDataStruct.getMRP_ODR_TYP().equals("7")){
					mprOdrTypFlg = true;
				}
				
				if (tempDataStruct.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == true) {
					//���Y�v��o�^�t���O�̃Z�b�g
					updateDataStruct.setADD_TO_OD_FLG("1");
					tempDataStruct.setchkADD_TO_OD("true");
				}else if (tempDataStruct.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == false){
					//���Y�v��o�^�t���O�̃Z�b�g
					updateDataStruct.setADD_TO_OD_FLG("0");
					tempDataStruct.setchkADD_TO_OD("NULL");
					setWarningMessage("KP00010");
					setWarningParameter("M_ITEM", "ITEM_CD", tempDataStruct.getITEM_CD());
				} else {
					//���Y�v��o�^�t���O�̃Z�b�g
					updateDataStruct.setADD_TO_OD_FLG("0");
					tempDataStruct.setchkADD_TO_OD("NULL");
				}
				
				//�X�V�J�E���^�`�F�b�N
				List chkList = entity.mselectMODIFY_COUNT.read(conn, updateDataStruct);
				KP0020010Struct wStruct = (KP0020010Struct) chkList.get(0);
				
				if(!tempDataStruct.getMODIFY_COUNT().equals(wStruct.getD_MODIFY_COUNT())) {
					//�X�V�J�E���^���ω�����
					ExpjMessage emsg = new ExpjMessage("KQ00055");
					msgStruct.addError(emsg);
					sysLog.warning("KQ00055", getsysUSER_CD());
					emsg = new ExpjMessage("ZZ01006","IN_SALES_PLAN_CD:" + updateDataStruct.getIN_SALES_PLAN_CD());
					sysLog.warning(emsg, getsysUSER_CD());
					setReadStatus(ERROR);
					return;
				}
				
				int nRet = entity.minsrtT_SALES_PLAN.update(conn, updateDataStruct);
				setInformationMessage("KP00009");
				
			} catch (SQLException e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} catch(Exception e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} finally {
				if(rollbackFlg == false) {
					conn.commit();
				} else {
					conn.rollback();
				}
			}
		}
		
		/**
		 * �폜�������s��
		 * @param deleteDataStruct �폜�p�f�[�^��o�^����Struct
		 * @param tempDataStruct �f�[�^�̎擾����Struct
		 */
		public void setDeleteData(KP0020010Struct deleteDataStruct, KP0020010Struct tempDataStruct) throws BusinessProcessException, FoundationException {
			//���[���o�b�N����t���O
			boolean rollbackFlg = false;
			try {
				deleteDataStruct.setIN_SALES_PLAN_CD(tempDataStruct.getIN_SALES_PLAN_CD());
				
				//�X�V�J�E���^�`�F�b�N
				List chkList = entity.mselectMODIFY_COUNT.read(conn, deleteDataStruct);
				KP0020010Struct wStruct = (KP0020010Struct) chkList.get(0);
				
				if(!tempDataStruct.getMODIFY_COUNT().equals(wStruct.getD_MODIFY_COUNT())) {
					//�X�V�J�E���^���ω�����
					ExpjMessage emsg = new ExpjMessage("KQ00055");
					msgStruct.addError( emsg );
					sysLog.warning("KQ00055", getsysUSER_CD());
					emsg = new ExpjMessage("ZZ01006","IN_SALES_PLAN_CD:" + deleteDataStruct.getIN_SALES_PLAN_CD());
					sysLog.warning(emsg, getsysUSER_CD());
					setReadStatus(ERROR);
					return;
				}
				
				int nRet = entity.mdeleteT_SALES_PLAN.update(conn, deleteDataStruct);
				setInformationMessage("KP00009");
				
			} catch (SQLException e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} catch(Exception e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} finally {
				if(rollbackFlg == false) {
					conn.commit();
				} else {
					conn.rollback();
				}
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			setListData(struct);
			
		} catch(Exception e) {
			// �G���[�������L�q���Ă��������B
			e.printStackTrace();
			setErrorMessage("KP00008");
			setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", struct.getIN_SALES_PLAN_CD());
			return;
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
				
			String tempIN_SALES_PLAN_CD = new String(struct.getIN_SALES_PLAN_CD());
				
		try {
			//���[�U���Z�b�g
			_updateStruct.setsUser_ID(struct.getsUser_ID());
			setUpdateData(_updateStruct, struct);
			
			initializeAll();
			struct.setIN_SALES_PLAN_CD(tempIN_SALES_PLAN_CD);
			controlSelect();
			
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setErrorMessage("KP00004");
			setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", _updateStruct.getIN_SALES_PLAN_CD());
			return;
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			
			String tempIN_SALES_PLAN_CD = new String(struct.getIN_SALES_PLAN_CD());
			
		try {
			
			_deleteStruct.setsUser_ID(struct.getsUser_ID());
			setDeleteData(_deleteStruct, struct);
			
			initializeAll();
			struct.setIN_SALES_PLAN_CD(tempIN_SALES_PLAN_CD);
			
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			setErrorMessage("KP00004");
			setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", _deleteStruct.getIN_SALES_PLAN_CD());
			return;
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
				initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			initializeAll();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			//�R���{�{�b�N�X�Ƀf�[�^�ɓo�^����f�[�^���擾����_plnTermTypStruct�Ɋi�[
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			_plnTermTypStruct = cb.getData("PLN_TERM_TYP");
			cb.setConnection(null);
			initializeAll();
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				struct.setIN_SALES_PLAN_CD(getIN_SALES_PLAN_CD());
				controlSelect();
			}
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Delete") ) {
				controlDelete();
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
			//�R���{�{�b�N�X�Ƀf�[�^��o�^�B
			struct.setList_IN_PLN_TERM_TYP_val(_plnTermTypStruct.getValList());
			struct.setList_IN_PLN_TERM_TYP_name(_plnTermTypStruct.getExplanList());
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
//			throw new FoundationException("KP0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KP0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KP0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KP0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KP0020010Entity entity;
	protected KP0020010Struct struct;
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

		entity = new KP0020010Entity();
		struct = new KP0020010Struct();

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
	 * KP0020010�N���X�̕W���R���X�g���N�^
	 */
	public KP0020010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
		try {
		} catch(MissingResourceException e) {
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
				KP0020010Struct key = (KP0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("chkADD_TO_OD") && key.getchkADD_TO_OD() != null) {
					msgKey.setKeyValue("chkADD_TO_OD", key.getchkADD_TO_OD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name") && key.getIN_PLN_TERM_TYP_name() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_name", key.getIN_PLN_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val") && key.getIN_PLN_TERM_TYP_val() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_val", key.getIN_PLN_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TERM_DAYS") && key.getTERM_DAYS() != null) {
					msgKey.setKeyValue("TERM_DAYS", key.getTERM_DAYS());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG") && key.getADD_TO_OD_FLG() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG", key.getADD_TO_OD_FLG());
				}
				if(msgKeyType.containsKeyColumn("D_SALES_PLAN_CD") && key.getD_SALES_PLAN_CD() != null) {
					msgKey.setKeyValue("D_SALES_PLAN_CD", key.getD_SALES_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("D_MODIFY_COUNT") && key.getD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("D_MODIFY_COUNT", key.getD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE") && key.getIN_PLN_STR_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_STR_DATE", key.getIN_PLN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE") && key.getIN_PLN_END_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_END_DATE", key.getIN_PLN_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP") && key.getIN_PLN_TERM_TYP() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP", key.getIN_PLN_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_QTY") && key.getIN_PLN_QTY() != null) {
					msgKey.setKeyValue("IN_PLN_QTY", key.getIN_PLN_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLN_CD") && key.getPLN_CD() != null) {
					msgKey.setKeyValue("PLN_CD", key.getPLN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("IN_SALES_PLAN_CD") && key.getIN_SALES_PLAN_CD() != null) {
					msgKey.setKeyValue("IN_SALES_PLAN_CD", key.getIN_SALES_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
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
					KP0020010Struct key = new KP0020010Struct();
					if(msgKeyType.containsKeyColumn("chkADD_TO_OD")) {
						key.setchkADD_TO_OD(msgKey.getKeyValue("chkADD_TO_OD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name")) {
						key.setIN_PLN_TERM_TYP_name(msgKey.getKeyValue("IN_PLN_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val")) {
						key.setIN_PLN_TERM_TYP_val(msgKey.getKeyValue("IN_PLN_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TERM_DAYS")) {
						key.setTERM_DAYS(msgKey.getKeyValue("TERM_DAYS"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG")) {
						key.setADD_TO_OD_FLG(msgKey.getKeyValue("ADD_TO_OD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("D_SALES_PLAN_CD")) {
						key.setD_SALES_PLAN_CD(msgKey.getKeyValue("D_SALES_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("D_MODIFY_COUNT")) {
						key.setD_MODIFY_COUNT(msgKey.getKeyValue("D_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE")) {
						key.setIN_PLN_STR_DATE(msgKey.getKeyValue("IN_PLN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE")) {
						key.setIN_PLN_END_DATE(msgKey.getKeyValue("IN_PLN_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP")) {
						key.setIN_PLN_TERM_TYP(msgKey.getKeyValue("IN_PLN_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_QTY")) {
						key.setIN_PLN_QTY(msgKey.getKeyValue("IN_PLN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLN_CD")) {
						key.setPLN_CD(msgKey.getKeyValue("PLN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_SALES_PLAN_CD")) {
						key.setIN_SALES_PLAN_CD(msgKey.getKeyValue("IN_SALES_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
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
