/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0010/src/com/nec/jp/orteus/metamorBase/KP0010/KP0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0010;

import com.nec.jp.orteus.metamorBase.KP0010.*;
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
 * CLASS     : KP0010010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shao-guangfeng $
 * @version $Revision: 1.9 $ $Date: 2011/01/30 04:03:07 $
 *
 */
//}}user_implement_code_header

public class KP0010010Control
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
	public KP0010010Struct getListvalue(int x) { return (KP0010010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KP0010010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KP0010010Struct createStruct() { return new KP0010010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KP0010010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		
		//** ��ЃR�[�h */
		private String _companyCD;
		
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
			
		/**���Џ��̎擾���\�b�h<br>
		 *�ϐ� _companyCD�ɉ�ЃR�[�h���Q�Ƃ�����B
		 */
		private void setCompanyCD() throws ExpjException {
			try {
				List myCompanyList = entity.mgetCOMPANY_CD.read(conn, struct);
				if (myCompanyList.isEmpty()) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				KP0010010Struct myCompanyStruct = (KP0010010Struct) myCompanyList.get(0);
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
		 * ��ʂ̏ڍ׍��ڂ����������܂��B
		 * @param clearFlg �N���A�t���O
		 */
		private void initializeForm(boolean clearFlg) {
			if (clearFlg) {
				struct.setIN_CUST_CD(null);
				struct.setIN_CUST_ITEM_CD(null);
				struct.setIN_DLV_LOC_CD(null);
				struct.setIN_PLN_TERM_TYP("1");
				struct.setIN_PLN_STR_DATE(null);
				struct.setIN_PLN_END_DATE(null);
				struct.setIN_PLN_QTY(null);
			}
			readStatus = INITIAL;
		}
		
		/**
		 * ��ʂ̈ꗗ���ڂ����������܂��B
		 */
		private void initializeList() {
			list = null;
			readStatus = INITIAL;
		}
		
		/**
		 * ��ʂ̑S���ڂ����������܂��B
		 */
		private void initializeAll() {
			initializeForm(true);
			initializeList();
		}
		
		/**
		 * �ꗗ�ɓo�^���ꂽ�v����ԂƓ��͂����v����Ԃ��r����B
		 * @param s ��r����Struct
		 * @param lis ��r�����List
		 */
		public void checkPlnTerm(KP0010010Struct s, List lis) throws BusinessProcessException, FoundationException {
			//List lis��NULL�̏ꍇ�͐V�������X�g�����B
			try {
				if (lis == null) {
					lis = new ArrayList(0);
				}
				//lis�̃��R�[�h��������؂���B
				for (int i = 0; i < lis.size(); i++) {
					KP0010010Struct tempStruct = (KP0010010Struct) lis.get(i);
					if (
						(tempStruct.getCUST_CD().equals(s.getCUST_CD())) &&
						(tempStruct.getCUST_ITEM_CD().equals(s.getCUST_ITEM_CD())) &&
						(tempStruct.getDLV_LOC_CD().equals(s.getDLV_LOC_CD())) &&
						!(tempStruct.getNO().equals(s.getNO()))
					) {
						
						if(
							((DateTool.compareYMD(tempStruct.getPLN_STR_DATE(), s.getPLN_STR_DATE())) <= 0) &&
							((DateTool.compareYMD(tempStruct.getPLN_END_DATE(), s.getPLN_STR_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
						
						if(
							((DateTool.compareYMD(s.getPLN_STR_DATE(), tempStruct.getPLN_STR_DATE())) <= 0) &&
							((DateTool.compareYMD(s.getPLN_END_DATE(), tempStruct.getPLN_STR_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
						
						if(
							((DateTool.compareYMD(tempStruct.getPLN_STR_DATE(), s.getPLN_END_DATE())) <= 0) &&
							((DateTool.compareYMD(tempStruct.getPLN_END_DATE(), s.getPLN_END_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
						
						if(
							((DateTool.compareYMD(s.getPLN_STR_DATE(), tempStruct.getPLN_END_DATE())) <= 0) &&
							((DateTool.compareYMD(s.getPLN_END_DATE(), tempStruct.getPLN_END_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00002");
				return;
			}
		}
		
		/**
		 * DB�ɓo�^���ꂽ�v����ԂƓ��͂����v����Ԃ��r����B
		 * @param s ��r����Struct
		 */
		public boolean checkPlnTermFromDB(KP0010010Struct s) throws BusinessProcessException, FoundationException {
			try {
				//�f�[�^�x�[�X��̃��R�[�h�Ɠ��t�̏d�������������`�F�b�N
				List psDateList = entity.mcheckPLN_DATE.read(conn, s);
				if (psDateList.size() > 0) {
					setErrorMessage("KP00001");
					return true;
				}
				return false;
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
		 * @param s �����i�[����Struct
		 */
		public void setListData(KP0010010Struct s) throws BusinessProcessException, FoundationException {
			try {
				//�����Ŏw�肵��Struct�ɉ�ЃR�[�h���Z�b�g
				setCompanyCD();
				s.setCOMPANY_CD(this._companyCD);
				
				// ���Ӑ���̎擾
				List custList = entity.mgetCUSTinfo.read(conn, s);
				if (custList.isEmpty()) {
					setErrorMessage("KQ00014");
					setErrorParameter("M_CUST", "CUST_CD", s.getIN_CUST_CD());
					return;
				}
				// ���Ӑ���̃f�[�^�Z�b�g
				KP0010010Struct custStruct = (KP0010010Struct) custList.get(0);
				s.setCUST_CD(custStruct.getCUST_CD());
				s.setCUST_ANAME(custStruct.getCUST_ANAME());
				
				// �[�i�ꏊ���̎擾
				// �[�i�ꏊ�R�[�h�����͂���Ă��Ȃ��ꍇ
				List custBaseList = null;
				if (("".equals(s.getIN_DLV_LOC_CD())) || (s.getIN_DLV_LOC_CD() == null)) {
					custBaseList = entity.mgetM_CUST_BASEinfoWhenNoC.read(conn, s);
					if (custBaseList.isEmpty()) {
						setErrorMessage("KQ00015");
						setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getCOMPANY_CD());
						setErrorParameter("M_CUST_BASE", "CUST_CD", s.getIN_CUST_CD());
						return;
					} else if (custBaseList.size() > 1) {
						setErrorMessage("KP00005");
						setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getCOMPANY_CD());
						setErrorParameter("M_CUST_BASE", "CUST_CD", s.getIN_CUST_CD());
						return;
					}
				} else {
					// �[�i�ꏊ�R�[�h�����͂���Ă���ꍇ
					custBaseList = entity.mgetM_CUST_BASEinfo.read(conn, s);
					if (custBaseList.isEmpty()) {
						setErrorMessage("KQ00015");
						setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getCOMPANY_CD());
						setErrorParameter("M_CUST_BASE", "CUST_CD", s.getIN_CUST_CD());
						setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", s.getIN_DLV_LOC_CD());
						return;
					}
				}
				// �[�i�ꏊ���̃f�[�^�Z�b�g
				KP0010010Struct custBaseStruct = (KP0010010Struct) custBaseList.get(0);
				s.setDLV_LOC_CD(custBaseStruct.getDLV_LOC_CD());
				s.setDLV_LOC_NAME(custBaseStruct.getDLV_LOC_NAME());
				s.setPLANT_CD(custBaseStruct.getPLANT_CD());
				
				// ���i���̎擾
				List itemSpecList = entity.mgetITEMinfo.read(conn, s);
				if (itemSpecList.isEmpty()) {
					setErrorMessage("KQ00017");
					setErrorParameter("M_ITEM_SPEC", "CUST_ITEM_CD", s.getIN_CUST_ITEM_CD());
					return;
				}
				// ���i���f�[�^�Z�b�g
				KP0010010Struct itemSpecStruct = (KP0010010Struct) itemSpecList.get(0);
				s.setCUST_ITEM_CD(itemSpecStruct.getCUST_ITEM_CD());
				s.setCUST_ITEM_NAME(itemSpecStruct.getCUST_ITEM_NAME());
				s.setITEM_CD(itemSpecStruct.getITEM_CD());
				s.setITEM_NAME(itemSpecStruct.getITEM_NAME());
				s.setPLN_QTY(itemSpecStruct.getPLN_QTY());
				s.setUNIT_QTY_TYP(itemSpecStruct.getUNIT_QTY_TYP());
				s.setSTOCK_UNIT(itemSpecStruct.getSTOCK_UNIT());
				s.setMRP_ODR_TYP(itemSpecStruct.getMRP_ODR_TYP());
				
				//�v�搔�̃f�[�^�Z�b�g
				// �����Ǘ��`�F�b�N
				if ("1".equals(s.getUNIT_QTY_TYP())) {
					// �����Ǘ�
					if (s.getIN_PLN_QTY().indexOf(".") >= 0) {
						// �������͂̏ꍇ�F�؏グ
						String tempString = s.getIN_PLN_QTY();
						double tempDouble1 = Double.parseDouble(tempString);
						s.setPLN_QTY(Calculate.ceil(s.getIN_PLN_QTY(), 0));
						double tempDouble2 = Double.parseDouble(s.getPLN_QTY());
						if (tempDouble1 != tempDouble2) {
							// ".0"���͏��O
							setWarningMessage("KQ20004");
							setWarningParameter("T_SALES_PLAN", "PLN_QTY", tempString);
						}
					} else {
						s.setPLN_QTY(s.getIN_PLN_QTY());
					}
				} else {
					//�����Ǘ��i�ڂł͂Ȃ��ꍇ
					s.setPLN_QTY(s.getIN_PLN_QTY());
				}
				
				//�v����ԃ^�C�v�i�\�������j�̃Z�b�g
				s.setPLN_TERM_TYP(s.getIN_PLN_TERM_TYP());
				//�v����ԃ^�C�v�i�l�j�̃Z�b�g
				//s.setPLN_TERM_TYP_DN(getComboData(_plnTermTypStruct, s.getPLN_TERM_TYP()));
				s.setPLN_TERM_TYP_DN(this.multcombo("PLN_TERM_TYP", s.getPLN_TERM_TYP()));
				
				//�v��J�n���̃Z�b�g
				s.setPLN_STR_DATE(s.getIN_PLN_STR_DATE());
				
				
				//�v��I�����̃Z�b�g
				//�v����ԃ^�C�v���u�P�v�i���j�̏ꍇ
				if ("1".equals(s.getPLN_TERM_TYP())) {
					s.setPLN_END_DATE(s.getIN_PLN_STR_DATE());
				//�v����ԃ^�C�v���u�Q�v�i�T�E�{���j�̏ꍇ
				} else if ("2".equals(s.getPLN_TERM_TYP())){
					s.setPLN_END_DATE(s.getIN_PLN_END_DATE());
				//�v����ԃ^�C�v���u�R�v�i���j�̏ꍇ
				} else {
					try {
						Calendar cal = Calendar.getInstance();
						Date tempDate = new Date();
					
						tempDate = Converter.strToDate(s.getIN_PLN_STR_DATE() ,"yyyy/MM/dd");
					
						cal.setTime(tempDate);
					
						cal.set(cal.DAY_OF_MONTH, cal.getActualMaximum(cal.DAY_OF_MONTH));
						tempDate = cal.getTime();
					
						s.setPLN_END_DATE(Converter.dateToStr(tempDate ,"yyyy/MM/dd"));
					} catch(Exception e) {
						e.printStackTrace();
						setErrorMessage("KP00006");
						return;
					}
				}
				
				//�v����Ԃ̃Z�b�g
				int termDays = 1;
				//�v��J�n���ƌv��I�������r
				String tempDay = new String(s.getPLN_STR_DATE());
				try {
					if ((DateTool.compareYMD(s.getPLN_END_DATE(), tempDay)) < 0){
						setErrorMessage("KP00002");
						return;
					}
					//�v����Ԃ��v�Z
					while(DateTool.compareYMD(s.getPLN_END_DATE(), tempDay) != 0){
						tempDay = DateTool.addDay(tempDay, "1");
						termDays++;
						//�P�O�O�O�����z����v��͗��Ă��Ȃ��B
						if (termDays >= 1000) {
							setErrorMessage("KP00007");
							return;
						}
					}
					
					s.setTERM_DAYS(String.valueOf(termDays));
					
					//DB�ɓo�^���ꂽ�v����ԂƓ��͂����v����Ԃ��r����B
					if(checkPlnTermFromDB(s)){
						return;
					}
				} catch(Exception e) {
					e.printStackTrace();
					setErrorMessage("KP00002");
					return;
				}
				
				//���Y�v��o�^�t���O�̒l�̃Z�b�g
				//�i�ڎ�z�敪�̃`�F�b�N
				
				boolean mprOdrTypFlg = false;
				
				if(s.getMRP_ODR_TYP().equals("4")||s.getMRP_ODR_TYP().equals("5")||s.getMRP_ODR_TYP().equals("6")||s.getMRP_ODR_TYP().equals("7")){
					mprOdrTypFlg = true;
				}
				
				if (s.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == true) {
					//���Y�v��o�^�t���O�̃Z�b�g
					s.setADD_TO_OD_FLG("1");
					s.setTEMP_ADD_TO_OD_FLG("true");
					s.setchkADD_TO_OD("true");
				}else if (s.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == false){
					//���Y�v��o�^�t���O�̃Z�b�g
					s.setADD_TO_OD_FLG("0");
					//���Y�v��o�^�t���O�iTEMP�j�̃Z�b�g
					s.setTEMP_ADD_TO_OD_FLG("NULL");
					s.setchkADD_TO_OD("NULL");
					setWarningMessage("KP00010");
					setWarningParameter("M_ITEM", "ITEM_CD", s.getITEM_CD());
				} else {
					//���Y�v��o�^�t���O�̃Z�b�g
					s.setADD_TO_OD_FLG("0");
					//���Y�v��o�^�t���O�iTEMP�j�̃Z�b�g
					s.setTEMP_ADD_TO_OD_FLG("NULL");
					s.setchkADD_TO_OD("NULL");
				}
				
				// ���Y�v��o�^�t���O�i�\�������j�̎擾
				List addToOdList = entity.mgetADD_TO_OD_FLGinfo.read(conn, s);
				//���Y�v��o�^�t���O�i�\�������j�̃Z�b�g
				KP0010010Struct addToOdStruct = (KP0010010Struct) addToOdList.get(0);
				//s.setADD_TO_OD_FLG_DN(addToOdStruct.getADD_TO_OD_FLG_DN());
				s.setADD_TO_OD_FLG_DN(this.multcombo("ADD_TO_OD_FLG",addToOdStruct.getADD_TO_OD_FLG_DN()));
				
				// �i�ڎ�z�敪�i�\�������j�̎擾
				List mprOdrTypList = entity.mgetMPR_ODR_TYPinfo.read(conn, s);
				//�i�ڎ�z�敪�i�\�������j�̃Z�b�g
				KP0010010Struct mprOdrTypStruct = (KP0010010Struct) mprOdrTypList.get(0);
				//s.setMRP_ODR_TYP_DN(mprOdrTypStruct.getMRP_ODR_TYP_DN());
				s.setMRP_ODR_TYP_DN(this.multcombo("MRP_ODR_TYP",mprOdrTypStruct.getMRP_ODR_TYP_DN()));
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				setErrorMessage("KP00004");
				return;
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00004");
				return;
			}
		}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAddition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");
			//{{user_implement_dev:<controlAddition>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
				//���X�g��null�̏ꍇ�͐�������B
				if (list == null) {
					list = new ArrayList(0);
				}
				
				// �uNO�v�����߂�B
				int no = list.size() + 1;
				
				//�ꗗ�f�[�^���ő�\���s���𒴂��Ă����ꍇ
				// �i�ǉ��O�̎��O�`�F�b�N�̂��߁Asize + 1�Ɣ�r����j
				int maxLine = sp.getMaxLine(conn, 10);
				if ((maxLine != 0) && (list.size() + 1 > maxLine)) {
					setErrorMessage("KQ00100", String.valueOf(maxLine));
					return;
				}
				
				// ���͓��e���ꗗ�p�X�g���N�g���쐬
				KP0010010Struct newListStruct = new KP0010010Struct();
				newListStruct.setNO(String.valueOf(no));
				newListStruct.setIN_CUST_CD(struct.getIN_CUST_CD());
				newListStruct.setIN_CUST_ITEM_CD(struct.getIN_CUST_ITEM_CD());
				newListStruct.setIN_DLV_LOC_CD(struct.getIN_DLV_LOC_CD());
				newListStruct.setIN_PLN_TERM_TYP(struct.getIN_PLN_TERM_TYP());
				newListStruct.setIN_PLN_STR_DATE(struct.getIN_PLN_STR_DATE());
				newListStruct.setIN_PLN_END_DATE(struct.getIN_PLN_END_DATE());
				newListStruct.setIN_PLN_QTY(struct.getIN_PLN_QTY());
				newListStruct.setchkADD_TO_OD(struct.getchkADD_TO_OD());
				
				// �}�X�^�Q�Ə������s���B
				setListData(newListStruct);
				
				// �ꗗ��ɏ��Ɗ��Ԃ̏d�����������̃`�F�b�N
				checkPlnTerm(newListStruct, list);
				
				// �G���[������Ώ����𒆒f
				if (msgStruct.hasError()) {
					return;
				}
				
				// �ꗗ��ǉ�
				list.add(newListStruct);
				
				// �ҏW�t�H�[����������
				initializeForm(false);
				
                //}}user_implement_dev:<controlAddition>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");

		return;
	}

	/**
	 * �C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
				for (int i = 0; i < list.size(); i++) {
					// �C���Ώۂ́uNO�v��T���B
					KP0010010Struct listStruct = (KP0010010Struct) list.get(i);
					if (listStruct.getNO().equals(struct.geth_NO())) {
						KP0010010Struct newListStruct = new KP0010010Struct();
						newListStruct.setNO(struct.geth_NO());
						newListStruct.setIN_CUST_CD(struct.getIN_CUST_CD());
						newListStruct.setIN_CUST_ITEM_CD(struct.getIN_CUST_ITEM_CD());
						newListStruct.setIN_DLV_LOC_CD(struct.getIN_DLV_LOC_CD());
						newListStruct.setIN_PLN_TERM_TYP(struct.getIN_PLN_TERM_TYP());
						newListStruct.setIN_PLN_STR_DATE(struct.getIN_PLN_STR_DATE());
						newListStruct.setIN_PLN_END_DATE(struct.getIN_PLN_END_DATE());
						newListStruct.setIN_PLN_QTY(struct.getIN_PLN_QTY());
						newListStruct.setchkADD_TO_OD(struct.getchkADD_TO_OD());
						
						// �}�X�^�Q�Ə������s���B
						setListData(newListStruct);
						
						// �ꗗ��ɏ��Ɗ��Ԃ̏d�����������̃`�F�b�N
						checkPlnTerm(newListStruct, list);
						
						// �G���[������Ώ����𒆒f
						if (msgStruct.hasError()) {
							return;
						}
						// �ꗗ�f�[�^���㏑������B
						list.set(i, newListStruct);
						
						// �ҏW�t�H�[����������
						initializeForm(false);
						return;
					}
				}
                //}}user_implement_dev:<controlModify>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * �����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlEliminate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");
			//{{user_implement_dev:<controlEliminate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
				for (int i = 0; i < list.size(); i++) {
					// �폜�Ώۂ́uNO�v��T���B
					KP0010010Struct listStruct = (KP0010010Struct) list.get(i);
					if (listStruct.getNO().equals(struct.geth_NO())) {
						// �Ώۃf�[�^���ꗗ����폜
						list.remove(i);
						// �폜�����f�[�^�ȍ~�Ƀf�[�^����ꍇ�͂��̃f�[�^�́uNO�v��1�J��グ��B
						for (int j = i; j < list.size(); j++) {
							KP0010010Struct modifyListStruct = (KP0010010Struct) list.get(j);
							int newNo = Integer.valueOf(modifyListStruct.getNO()).intValue() - 1;
							modifyListStruct.setNO(String.valueOf(newNo));
							list.set(j, modifyListStruct);
						}
						// �ҏW�t�H�[����������
						initializeForm(true);
						return;
					}
				}
                //}}user_implement_dev:<controlEliminate>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			//���[���o�b�N����t���O
			boolean rollbackFlg = false;
				
			try {
				int nRet = 0;
				//���X�g�ɂ���f�[�^��̔����v�v��e�[�u���ɓo�^
				for (int i = 0; i < list.size(); i++) {
					
					KP0010010Struct listStruct = (KP0010010Struct) list.get(i);
					
					//�̔����v�v��ԍ��̎擾
					try{
						List salesPlanCdList = entity.mgetSEQ_SALES_PLAN_CD.read(conn, listStruct);
						if (salesPlanCdList.isEmpty()) {
							setErrorMessage("KP00003");
							return;
						}
						
						KP0010010Struct salesPlanCdStruct = (KP0010010Struct) salesPlanCdList.get(0);
						
						//�v��ԍ����Z�b�g
						listStruct.setSALES_PLAN_CD(salesPlanCdStruct.getSALES_PLAN_CD());
						
					} catch (Exception ex) {
						ex.printStackTrace();
						rollbackFlg = true;
						setErrorMessage("KP00003");
						return;
					}
					
					//���[�U���Z�b�g
					listStruct.setsUser_ID(struct.getsUser_ID());
					
					//�d���̗L�����`�F�b�N
					
					if(checkPlnTermFromDB(listStruct)){
						return;
					}
					
					nRet = entity.minsertT_SALES_PLAN.create(conn, listStruct);
					
				}
			} catch(SQLException e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			}catch(Exception e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} finally {
				if(rollbackFlg == false) {
					conn.commit();
					//��ʂ̏���������
					initializeAll();
				} else {
					conn.rollback();
				}
			}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
				initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			initializeAll();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			//�R���{�{�b�N�X�Ƀf�[�^�ɓo�^����f�[�^���擾����_plnTermTypStruct�Ɋi�[
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			_plnTermTypStruct = cb.getData("PLN_TERM_TYP");
			cb.setConnection(null);
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
//				controlSelect();
			}
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Addition") ) {
				controlAddition();
			} else if( button.equals("Modify") ) {
				controlModify();
			} else if( button.equals("Eliminate") ) {
				controlEliminate();
			} else if( button.equals("Insert") ) {
				controlInsert();
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
//			throw new FoundationException("KP0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KP0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KP0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KP0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KP0010010Entity entity;
	protected KP0010010Struct struct;
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

		entity = new KP0010010Entity();
		struct = new KP0010010Struct();

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
	 * KP0010010�N���X�̕W���R���X�g���N�^
	 */
	public KP0010010Control() throws BusinessProcessException, FoundationException
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
				KP0010010Struct key = (KP0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO());
				}
				if(msgKeyType.containsKeyColumn("PLN_TERM_TYP_DN") && key.getPLN_TERM_TYP_DN() != null) {
					msgKey.setKeyValue("PLN_TERM_TYP_DN", key.getPLN_TERM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("TEMP_ADD_TO_OD_FLG") && key.getTEMP_ADD_TO_OD_FLG() != null) {
					msgKey.setKeyValue("TEMP_ADD_TO_OD_FLG", key.getTEMP_ADD_TO_OD_FLG());
				}
				if(msgKeyType.containsKeyColumn("chkADD_TO_OD") && key.getchkADD_TO_OD() != null) {
					msgKey.setKeyValue("chkADD_TO_OD", key.getchkADD_TO_OD());
				}
				if(msgKeyType.containsKeyColumn("h_NO") && key.geth_NO() != null) {
					msgKey.setKeyValue("h_NO", key.geth_NO());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP") && key.getIN_PLN_TERM_TYP() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP", key.getIN_PLN_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name") && key.getIN_PLN_TERM_TYP_name() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_name", key.getIN_PLN_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val") && key.getIN_PLN_TERM_TYP_val() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_val", key.getIN_PLN_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE") && key.getIN_PLN_STR_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_STR_DATE", key.getIN_PLN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE") && key.getIN_PLN_END_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_END_DATE", key.getIN_PLN_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_QTY") && key.getIN_PLN_QTY() != null) {
					msgKey.setKeyValue("IN_PLN_QTY", key.getIN_PLN_QTY());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_PLAN_CD") && key.getSALES_PLAN_CD() != null) {
					msgKey.setKeyValue("SALES_PLAN_CD", key.getSALES_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_CD") && key.getIN_CUST_CD() != null) {
					msgKey.setKeyValue("IN_CUST_CD", key.getIN_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD") && key.getIN_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_CUST_ITEM_CD", key.getIN_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_DLV_LOC_CD") && key.getIN_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("IN_DLV_LOC_CD", key.getIN_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("PLN_STR_DATE") && key.getPLN_STR_DATE() != null) {
					msgKey.setKeyValue("PLN_STR_DATE", key.getPLN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLN_END_DATE") && key.getPLN_END_DATE() != null) {
					msgKey.setKeyValue("PLN_END_DATE", key.getPLN_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("TERM_DAYS") && key.getTERM_DAYS() != null) {
					msgKey.setKeyValue("TERM_DAYS", key.getTERM_DAYS());
				}
				if(msgKeyType.containsKeyColumn("PLN_TERM_TYP") && key.getPLN_TERM_TYP() != null) {
					msgKey.setKeyValue("PLN_TERM_TYP", key.getPLN_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLN_QTY") && key.getPLN_QTY() != null) {
					msgKey.setKeyValue("PLN_QTY", key.getPLN_QTY());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG") && key.getADD_TO_OD_FLG() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG", key.getADD_TO_OD_FLG());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG_DN") && key.getADD_TO_OD_FLG_DN() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG_DN", key.getADD_TO_OD_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
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
					KP0010010Struct key = new KP0010010Struct();
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(msgKey.getKeyValue("NO"));
					}
					if(msgKeyType.containsKeyColumn("PLN_TERM_TYP_DN")) {
						key.setPLN_TERM_TYP_DN(msgKey.getKeyValue("PLN_TERM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_ADD_TO_OD_FLG")) {
						key.setTEMP_ADD_TO_OD_FLG(msgKey.getKeyValue("TEMP_ADD_TO_OD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("chkADD_TO_OD")) {
						key.setchkADD_TO_OD(msgKey.getKeyValue("chkADD_TO_OD"));
					}
					if(msgKeyType.containsKeyColumn("h_NO")) {
						key.seth_NO(msgKey.getKeyValue("h_NO"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP")) {
						key.setIN_PLN_TERM_TYP(msgKey.getKeyValue("IN_PLN_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name")) {
						key.setIN_PLN_TERM_TYP_name(msgKey.getKeyValue("IN_PLN_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val")) {
						key.setIN_PLN_TERM_TYP_val(msgKey.getKeyValue("IN_PLN_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE")) {
						key.setIN_PLN_STR_DATE(msgKey.getKeyValue("IN_PLN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE")) {
						key.setIN_PLN_END_DATE(msgKey.getKeyValue("IN_PLN_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_QTY")) {
						key.setIN_PLN_QTY(msgKey.getKeyValue("IN_PLN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_PLAN_CD")) {
						key.setSALES_PLAN_CD(msgKey.getKeyValue("SALES_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_CD")) {
						key.setIN_CUST_CD(msgKey.getKeyValue("IN_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD")) {
						key.setIN_CUST_ITEM_CD(msgKey.getKeyValue("IN_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_DLV_LOC_CD")) {
						key.setIN_DLV_LOC_CD(msgKey.getKeyValue("IN_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLN_STR_DATE")) {
						key.setPLN_STR_DATE(msgKey.getKeyValue("PLN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLN_END_DATE")) {
						key.setPLN_END_DATE(msgKey.getKeyValue("PLN_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TERM_DAYS")) {
						key.setTERM_DAYS(msgKey.getKeyValue("TERM_DAYS"));
					}
					if(msgKeyType.containsKeyColumn("PLN_TERM_TYP")) {
						key.setPLN_TERM_TYP(msgKey.getKeyValue("PLN_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLN_QTY")) {
						key.setPLN_QTY(msgKey.getKeyValue("PLN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG")) {
						key.setADD_TO_OD_FLG(msgKey.getKeyValue("ADD_TO_OD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG_DN")) {
						key.setADD_TO_OD_FLG_DN(msgKey.getKeyValue("ADD_TO_OD_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
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
