/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0100/src/com/nec/jp/orteus/metamorBase/AC0100/AC0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0100;

import com.nec.jp.orteus.metamorBase.AC0100.*;
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
import java.text.ParseException;

import com.nec.jp.orteus.expj.util.*;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0100010Control
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
	public AC0100010Struct getListvalue(int x) { return (AC0100010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AC0100010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AC0100010Struct createStruct() { return new AC0100010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AC0100010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔 �����敪 */
	private final static String ALC_TYP_2 = "ALC_TYP_2";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔 �݌ɐ��P�ʋ敪 */
	private final static String UNIT_QTY_TYP = "UNIT_QTY_TYP";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔 �I�[�_��ԋ敪 */
	private final static String ODR_STS_TYP = "ODR_STS_TYP";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔 �f�}���h��ԋ敪 */
	private final static String DM_STS_TYP = "DM_STS_TYP";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔 ���ԏ�ԋ敪 */
	private final static String JOB_ODR_STS_TYP = "JOB_ODR_STS_TYP";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p �����敪 */
	private ComboStruct alcTyp2Combo = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p �݌ɐ��P�ʋ敪 */
	private ComboStruct unitQtyTypCombo = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p �I�[�_��ԋ敪 */
	private ComboStruct odrStsTypCombo = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p �f�}���h��ԋ敪 */
	private ComboStruct dmStsTypCombo = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p ���ԏ�ԋ敪 */
	private ComboStruct jobOdrStsTypCombo = null;
	
	/** ���Ԉ����ꗗ�\�����X�g */
	private List jobOdrAlcdList = null;
	
	/** �����\�ꗗ�\�����X�g */
	private List allocatableList = null;
		
	/** �J�ڐ�URL */
	private String nextUrl = null;
	
	/** ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�) */
	private String odNo = null;
	
	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage;
	
	private String mode = null;
	
	/**
	 * �T�u��ʂ̋N�����[�h�i�ǉ��A�C���j���擾���܂��B
	 * @return ���[�h
	 */
	public String getMode() {
		return mode;
	}
	
	/**
	 * �T�u��ʂ̋N�����[�h�i�ǉ��A�C���j��ݒ肵�܂��B
	 * @param s ���[�h
	 */
	public void setMode(String s) {
		mode = s;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�)���擾���܂��B
	 * @return �I�[�_�f�}���h�ԍ�
	 */
	public String getOdNo() {
		return odNo;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�)��ݒ肵�܂��B
	 * @param s �I�[�_�f�}���h�ԍ�
	 */
	public void setOdNo(String s) {
		odNo = s;
	}
	
	/**
	 * �J�ڐ�URL���擾���܂��B
	 * @return �J�ڐ�URL
	 */
	public String getNextUrl() {
		return nextUrl;
	}
	
	/**
	 * �J�ڐ�URL��ݒ肵�܂��B
	 * @param s �J�ڐ�URL
	 */
	public void setNextUrl(String s) {
		nextUrl = s;
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
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
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
	 * Exception���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		throw ee;
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
	 * �Ɩ����W�b�N�̃V�X�e�����O(�G���[)�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.warning(emsg, getsysUSER_CD());
	}
	
	/**
	 * �R���{�{�b�N�X�f�[�^�̕\���������擾���܂��B
	 * @param combo �R���{�{�b�N�X�f�[�^
	 * @param value �R���{�{�b�N�X�f�[�^�̒l
	 * @return �R���{�{�b�N�X�f�[�^�̕\������
	 */
	private String getComboDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * ���Ԉ����ꗗ���擾���܂��B
	 */
	public List getJobOdrAlcdList() {
		if (jobOdrAlcdList == null) {
			jobOdrAlcdList = new ArrayList(0);
		}
		return jobOdrAlcdList;
	}
	
	/**
	 * �����\�ꗗ���擾���܂��B
	 */
	public List getAllocatableList() {
		if (allocatableList == null) {
			allocatableList = new ArrayList(0);
		}
		return allocatableList;
	}
	
	/**
	 * �]��݌Ɉ����\�����Z�o���܂��B
	 * 
	 * @param plantCd - �H��R�[�h
	 * @param itemCd - �i�ڔԍ�
	 * @return - �Z�o����
	 */
	private Double getAllocatableStockQty(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double sumOfItemStockOnHandQty = null;
		Double sumOfAllocatedQty = null;
		Double result = null;
		
		// [1][�ۊǋ�ʕi�ڍ݌�]."�i�ڕʎ莝�݌ɐ�"�̍��v
		sumOfItemStockOnHandQty = getSumOfStockOnHandQtyByItem(plantCd, itemCd);
		
		// [2]([���Ԉ���]."�����ςݐ�" - [���Ԉ���].�o�ɍςݐ�")�̍��v
		sumOfAllocatedQty = getSumOfAlcdQtyByItem(plantCd, itemCd);
		
		// �]��݌Ɉ����\�� = [1] - [2]
		String strAllocatableStockQty = Calculate.subtract(
				sumOfItemStockOnHandQty.toString(), sumOfAllocatedQty.toString());
		
		result = new Double(strAllocatableStockQty);
		return result;
	}
	
	/**
	 * [�ۊǋ�ʕi�ڍ݌�]."�i�ڕʎ莝�݌ɐ�"�̍��v���擾���܂��B
	 * 
	 * @param plantCd - �H��R�[�h
	 * @param itemCd - �i�ڔԍ�
	 * @return �Z�o����
	 */
	private Double getSumOfStockOnHandQtyByItem(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		List searchList = null;
		String sumOfStockOnHandQty = null;
		
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setITEM_CD(itemCd);
		searchList = entity.mSUM_OF_STOCK_ON_HAND_QTY_BY_ITEM.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			sumOfStockOnHandQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfStockOnHandQty = resultStruct.getSUM_OF_STOCK_ON_HAND_QTY();
			if (sumOfStockOnHandQty == null || sumOfStockOnHandQty.equals("")){
				sumOfStockOnHandQty = "0";
			}
		}
		result = new Double(sumOfStockOnHandQty);
		return result;
	}
	
	/**
	 * ([���Ԉ���]."�����ςݐ�" - [���Ԉ���]."�o�ɍςݐ�")�̍��v���擾���܂��B
	 * 
	 * @param plantCd - �H��R�[�h
	 * @param itemCd - �i�ڔԍ�
	 * @return �Z�o����
	 */
	private Double getSumOfAlcdQtyByItem(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		List searchList = null;
		String sumOfAlcdQty = null;
		
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setITEM_CD(struct.getITEM_CD());
		searchList = entity.mSUM_OF_ALCD_QTY_BY_ITEM.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			sumOfAlcdQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfAlcdQty = resultStruct.getSUM_OF_ALCD_QTY();
			if (sumOfAlcdQty == null || sumOfAlcdQty.equals("")) {
				sumOfAlcdQty = "0";
			}
		}
		
		result = new Double(sumOfAlcdQty);
		return result;
	}
	
	/**
	 * [���Ԉ���]."�o�ɍςݐ�"�̍��v���擾���܂��B
	 * 
	 * @param plantCd - �H��R�[�h
	 * @param odNo - �I�[�_�f�}���h�ԍ�
	 * @param �Z�o����
	 */
	private Double getSumOfIssuedQty(String plantCd, String odNo) 
			throws FoundationException, SQLException {
		
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		List searchList = null;
		String sumOfIssuedQty = "0";
		
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setOD_NO(odNo);
		searchList = entity.mT_JOB_ODR_ALC_5.read(conn, searchStruct);
		if (searchList.size() > 0) {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			if (resultStruct.getSUM_OF_ISSUEED_QTY() != null 
					&& resultStruct.getSUM_OF_ISSUEED_QTY().equals("") == false) {
				sumOfIssuedQty = resultStruct.getSUM_OF_ISSUEED_QTY();
			} else {
				sumOfIssuedQty = "0";
			}
		}
		result = new Double(sumOfIssuedQty);
		return result;
	}
	
	/**
	 * ���Ԉ����\�����Z�o���܂��B
	 * 
	 * @param itemCd - �i�ڔԍ�
	 * @param �Z�o����
	 */
	private Double getJobOdrCdStockAllocatableQty(String itemCd, 
			boolean ctrlFlg1, boolean ctrlFlg2, boolean ctrlFlg3, boolean ctrlFlg4) 
			throws FoundationException, SQLException {
		
		return getJobOdrCdStockAllocatableQty(null, null, itemCd, 
				ctrlFlg1, ctrlFlg2, ctrlFlg3, ctrlFlg4);
	}
	
	/**
	 * ���Ԉ����\�����Z�o���܂��B
	 * 
	 * @param jobOdrCd - ����
	 * @param jobOdrDetailNo - ���Ԏ}��
	 * @param itemCd - �i�ڔԍ�
	 * @param ctrlFlg1 - ���ԑ��莝�݌ɐ����v�Z����ꍇ��true�A�����łȂ��ꍇ��false
	 * @param ctrlFlg2 - ��s���Ԏd�|�����v�Z����ꍇ��true�A�����łȂ��ꍇ��false
	 * @param ctrlFlg3 - �����ԍ݌ɐ����v�Z����ꍇ��true�A�����łȂ��ꍇ��false
	 * @param ctrlFlg4 - �������݌v�����v�Z����ꍇ��true�A�����łȂ��ꍇ��false
	 * @param �v�Z����
	 */
	private Double getJobOdrCdStockAllocatableQty(String jobOdrCd, String jobOdrDetailNo, 
			String itemCd, boolean ctrlFlg1, boolean ctrlFlg2, boolean ctrlFlg3, boolean ctrlFlg4) 
			throws FoundationException, SQLException {
		
		Double result = null;
		Double jobOdrCdStockQty = null;
		Double sumOfWorkInProcQty = null;
		Double sumOfOdQty = null;
		Double sumOfJobOdrCdStockAlcdQty = null;
		
		// [1]���ԑ��莝�݌ɐ�
		if (ctrlFlg1 == true) {
			jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			jobOdrCdStockQty = new Double("0");
		}
		
		// [2]��s���Ԏd�|��
		if (ctrlFlg2 == true) {
			sumOfWorkInProcQty = getSumOfWorkInProcQty(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			sumOfWorkInProcQty = new Double("0");
		}
		
		// [3]�����ԍ݌ɐ�
		if (ctrlFlg3 == true) {
			sumOfOdQty = getSumOfOdQty(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			sumOfOdQty = new Double("0");
		}
		
		// [4]�������݌v��
		if (ctrlFlg4 == true) {
			sumOfJobOdrCdStockAlcdQty = getSumOfAlcdQtyByJobOdrCd(jobOdrCd, jobOdrDetailNo, itemCd);
		} else {
			sumOfJobOdrCdStockAlcdQty = new Double("0");
		}
		
		// [1] + [2] - [3] - [4]
		String s1 = jobOdrCdStockQty.toString();
		String s2 = sumOfWorkInProcQty.toString();
		String s3 = sumOfOdQty.toString();
		String s4 = sumOfJobOdrCdStockAlcdQty.toString();
		String s = Calculate.add(s1, s2);
		s = Calculate.subtract(s, s3);
		s = Calculate.subtract(s, s4);
		
		result = new Double(s);
		return result;
	}
	
	/**
	 * ���Ԏ莝�݌ɐ��̍��v���Z�o���܂��B
	 *
	 * @param jobOdrCd - ����
	 * @param jobOdrDetailNo - ���Ԏ}��
	 * @param itemCd - �i�ڔԍ�
	 * @param jobOdrCdStockQty - ���Ԏ莝�݌ɐ��̍��v
	 */
	private Double getSumOfStockOnHandQtyByJobOdrCd(
			String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		String jobOdrCdStockQty = "0";
		Double result = null;
		
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		List searchList = entity.mSUM_OF_STOCK_ON_HAND_QTY_BY_JOB_ODR_CD.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			jobOdrCdStockQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			jobOdrCdStockQty = resultStruct.getSUM_OF_STOCK_ON_HAND_QTY();
			if (jobOdrCdStockQty == null || jobOdrCdStockQty.equals("")){
				jobOdrCdStockQty = "0";
			}
		}
		result = new Double(jobOdrCdStockQty);
		return result;
	}
	
	/**
	 * ��s���Ԏd�|�����Z�o���܂��B
	 *
	 * @param jobOdrCd - ����
	 * @param jobOdrDetailNo - ���Ԏ}��
	 * @param itemCd - �i�ڔԍ�
	 * @return �Z�o����
	 */
	private Double getSumOfWorkInProcQty(String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = null;
		String sumOfWorkInProcQty = "0";
		List searchList = null;
		
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		searchList = entity.mSUM_OF_WORK_IN_PROC_QTY.read(conn, searchStruct);
		if (searchList.size() <= 0) {
			sumOfWorkInProcQty = "0";
		} else {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfWorkInProcQty = resultStruct.getSUM_OF_WORK_IN_PROC_QTY();
			if (sumOfWorkInProcQty == null || sumOfWorkInProcQty.equals("")){
				sumOfWorkInProcQty = "0";
			}
		}
		result = new Double(sumOfWorkInProcQty);
		return result;
	}
	
	
	/**
	 * �����ԍ݌ɐ����Z�o���܂��B
	 *
	 * @param jobOdrCd - ����
	 * @param jobOdrDetailNo - ���Ԏ}��
	 * @param itemCd - �i�ڔԍ�
	 * @return �Z�o����
	 */
	private Double getSumOfOdQty(String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		List searchList = entity.mT_OD.read(conn, searchStruct);
		String totalRcvQty = null;
		String totalIssueQty = null;
		String sumOfOdrQty = "0";
		if (searchList.size() > 0) {
			List searchList2 = null;
			Iterator iterator = searchList.iterator();
			while (iterator.hasNext()) {
				resultStruct = (AC0100010Struct)(iterator.next());
				totalRcvQty = resultStruct.getTOTAL_RCV_QTY();
				totalIssueQty = resultStruct.getTOTAL_ISSUE_QTY();
				
				// ���Ԉ�������
				AC0100010Struct searchStruct2 = new AC0100010Struct();
				searchStruct2.setOD_NO(resultStruct.getOD_NO());
				searchStruct2.setPLANT_CD(sysPLANT_CD);
				searchList2 = entity.mSUM_OF_ISSUED_QTY.read(conn, searchStruct2);
				String sumOfIssuedQty = null;
				if (searchList2.size() <= 0) {
					sumOfIssuedQty = "0";
				} else {
					AC0100010Struct resultStruct2 = (AC0100010Struct)(searchList2.get(0));
					sumOfIssuedQty = resultStruct2.getSUM_OF_ISSUED_QTY();
				}
				
				// �Z�o
				sumOfOdrQty = Calculate.add(sumOfOdrQty, totalRcvQty);
				sumOfOdrQty = Calculate.subtract(sumOfOdrQty, totalIssueQty);
				sumOfOdrQty = Calculate.add(sumOfOdrQty, sumOfIssuedQty);
			}
		}
		result = new Double(sumOfOdrQty);
		return result;
	}
	
	/**
	 * �����ςݐ��̍��v���Z�o���܂��B
	 * �i[���Ԉ���]."�����ςݐ�" - [���Ԉ���]."�o�ɍςݐ�"�j�̍��v
	 *
	 * @param jobOdrCd - ����
	 * @param jobOdrCancelNo - ���Ԏ}��
	 * @param itemCd - �i�ڔԍ�
	 * @return �Z�o����
	 */
	 private Double getSumOfAlcdQtyByJobOdrCd(String jobOdrCd, String jobOdrDetailNo, String itemCd) 
			throws FoundationException, SQLException {
		Double result = null;
		AC0100010Struct searchStruct = new AC0100010Struct();
		AC0100010Struct resultStruct = null;
		String sumOfJobOdrCdAlcdQty = "0";
		
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setITEM_CD(itemCd);
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		List searchList = entity.mSUM_OF_ALCD_QTY_BY_JOB_ODR_CD.read(conn, searchStruct);
		if (searchList.size() > 0) {
			resultStruct = (AC0100010Struct)(searchList.get(0));
			sumOfJobOdrCdAlcdQty = resultStruct.getSUM_OF_ALCD_QTY();
			if (sumOfJobOdrCdAlcdQty == null || sumOfJobOdrCdAlcdQty.equals("")){
				sumOfJobOdrCdAlcdQty = "0";
			}
		}
		result = new Double(sumOfJobOdrCdAlcdQty);
		return result;
	}
	
	/**
	 * ���Ԉ����ꗗ���쐬���܂��B
	 */
	private List buildJobOdrAlcdList(String plantCd, String odNo, String jobOdrDetailNo) 
			throws FoundationException, SQLException {
		
		List resultList = new ArrayList(0);
		Iterator iterator = null;
		int maxLine = sp.getMaxLine(conn, 10);
		// [1]�]��݌Ɉ������
		AC0100010Struct searchStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setOD_NO(odNo);
		List searchList = entity.mT_JOB_ODR_ALC_2.read(conn, searchStruct);
		if (searchList.size() > 0) {

			iterator = searchList.iterator();
			while (iterator.hasNext()) {				
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				
				// �����敪
				String comboValue = "1";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// �����敪 �\������
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// �����搻��
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
				
				// �����ςݐ�
				aStruct.setl_ALCD_QTY(aStruct.getALCD_QTY());
				
				// �����o�ɍϐ�
				aStruct.setl_ISSUEED_QTY(aStruct.getISSUEED_QTY());
				
				// �����o�Ɏc��
				aStruct.setl_ISSUE_REMAIN_QTY(aStruct.getISSUE_REMAIN_QTY());
				
				// �X�V��
				aStruct.setl_MODIFY_COUNT(aStruct.getMODIFY_COUNT());
				
				// ���ԏ����敪
				aStruct.setl_JOB_ODR_EXP_TYP(aStruct.getJOB_ODR_EXP_TYP());
				
				// ���v�ʏ����敪
				aStruct.setl_MRP_TYP(aStruct.getMRP_TYP());
				
				// �I�[�_��
				aStruct.setl_ODR_QTY("");
				
				// ���ɗ݌v��
				aStruct.setl_TOTAL_RCV_QTY("");
				
				// �����\���̎Z�o
				String itemCd = aStruct.getITEM_CD();
				Double allocatableStockQty = null;
				allocatableStockQty = getAllocatableStockQty(plantCd, itemCd);
				aStruct.setl_ALLOCATABLE_QTY(allocatableStockQty.toString());
				
				// �莝�݌ɐ�
				Double sumOfItemStockOnHandQty = getSumOfStockOnHandQtyByItem(plantCd, itemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(sumOfItemStockOnHandQty.toString());
				
				resultList.add(aStruct);
				if  (maxLine != 0 && resultList.size()> maxLine){
					return resultList;
				}
				
			}
		}
		
		// [2]�����Ԉ������
		searchStruct = new AC0100010Struct();
		searchStruct.setOD_NO(odNo);

		searchList = entity.mT_JOB_ODR_ALC_3.read(conn, searchStruct);
		if (searchList.size() > 0) {

			iterator = searchList.iterator();
			while (iterator.hasNext()) {
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				
				String keyJobOdrCd = aStruct.getJOB_ODR_CD();
				String keyJobOdrDetailNo = aStruct.getJOB_ODR_DETAIL_NO();
				String keyItemCd = aStruct.getITEM_CD();
				
				String comboValue = "2";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				
				// �����敪
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// �����敪 �\������
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// �����搻��
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
					
				// �����搻�Ԏ}��
				aStruct.setl_JOB_ODR_DETAIL_NO(aStruct.getJOB_ODR_DETAIL_NO());
				
				// �����ςݐ�
				aStruct.setl_ALCD_QTY(aStruct.getALCD_QTY());
				
				// �����o�ɍϐ�
				aStruct.setl_ISSUEED_QTY(aStruct.getISSUEED_QTY());
				
				// �����o�Ɏc��
				aStruct.setl_ISSUE_REMAIN_QTY(aStruct.getISSUE_REMAIN_QTY());
				
				// �X�V��
				aStruct.setl_MODIFY_COUNT(aStruct.getMODIFY_COUNT());
				
				// ���ԏ����敪
				aStruct.setl_JOB_ODR_EXP_TYP(aStruct.getJOB_ODR_EXP_TYP());
				
				// ���v�ʏ����敪
				aStruct.setl_MRP_TYP(aStruct.getMRP_TYP());
				
				// ���Ԉ����\��
				Double jobOdrCdStockAllocatableQty = null;
				jobOdrCdStockAllocatableQty 
					= getJobOdrCdStockAllocatableQty(keyJobOdrCd, keyJobOdrDetailNo, keyItemCd,
						true, true, true, true);
				// �}�C�i�X�̏ꍇ�̓[��
				if (Calculate.compare(jobOdrCdStockAllocatableQty.toString(), "0") == -1) {
					jobOdrCdStockAllocatableQty = new Double("0");
				}
				aStruct.setl_ALLOCATABLE_QTY(jobOdrCdStockAllocatableQty.toString());
				
				// ���ԑ��莝�݌ɐ�
				Double jobOdrCdStockQty = null;
				jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(
						keyJobOdrCd, keyJobOdrDetailNo, keyItemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(jobOdrCdStockQty.toString());
				
				// ���v�ʂ�����
				searchStruct = new AC0100010Struct();
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(keyJobOdrCd);
				searchStruct.setJOB_ODR_DETAIL_NO(keyJobOdrDetailNo);
				searchStruct.setITEM_CD(keyItemCd);
				searchList = entity.mT_OD_2.read(conn, searchStruct);
				if (searchList.size() > 0) {
					AC0100010Struct aStruct2 = (AC0100010Struct)(searchList.get(0));
					String odrQty = aStruct2.getODR_QTY();
					String alcGrpCd = aStruct2.getALC_GRP_CD();
					String jobOdrStsTyp = aStruct2.getJOB_ODR_STS_TYP();
					String jobOdrStsTypDn = aStruct2.getJOB_ODR_STS_TYP_DN();
					String odrStsTyp = aStruct2.getODR_STS_TYP();
					String odrStsTypDn = aStruct2.getODR_STS_TYP_DN();
					String prdDueDate = aStruct2.getPRD_DUE_DATE();
					String totalRcvQty = aStruct2.getTOTAL_RCV_QTY();
					String odrStartDate = aStruct2.getODR_START_DATE();
					String prdStartDate = aStruct2.getPRD_START_DATE();
					aStruct.setl_JOB_ODR_CANCEL_NO(aStruct2.getJOB_ODR_CANCEL_NO());
					aStruct.setl_ODR_STS_TYP(odrStsTyp);
					aStruct.setl_ODR_STS_TYP_DN(odrStsTypDn);
					aStruct.setl_PRD_DUE_DATE(prdDueDate);
					aStruct.setl_TOTAL_RCV_QTY(totalRcvQty);
					aStruct.setl_ODR_START_DATE(odrStartDate);
					aStruct.setl_PRD_START_DATE(prdStartDate);
					aStruct.setl_ODR_QTY(odrQty);
					aStruct.setl_ALC_GRP_CD(alcGrpCd);
					aStruct.setl_JOB_ODR_STS_TYP(jobOdrStsTyp);
					aStruct.setl_JOB_ODR_STS_TYP_DN(jobOdrStsTypDn);
				}
				resultList.add(aStruct);
				if  (maxLine != 0 && resultList.size()> maxLine){
					return resultList;
				}
			}
		}
		
		
		// [3]�����Ԉ������
		searchStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(sysPLANT_CD);
		searchStruct.setOD_NO(odNo);
		searchList = entity.mT_OD_4.read(conn, searchStruct);
		if (searchList.size() > 0) {		
			AC0100010Struct aStruct = (AC0100010Struct)(searchList.get(0));			
			if ("0".equals(aStruct.getODR_STS_TYP()) == false) {
				
				String keyJobOdrCd = aStruct.getJOB_ODR_CD();
				String keyJobOdrDetailNo = aStruct.getJOB_ODR_DETAIL_NO();
				String keyItemCd = aStruct.getITEM_CD();
				
				// �莝�݌ɐ��i[�ۊǋ�ʐ��ԍ݌�]."���ԕʎ莝�݌ɐ�"�̍��v�j
				Double jobOdrCdStockQty = null;
				jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(
						keyJobOdrCd, keyJobOdrDetailNo, keyItemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(jobOdrCdStockQty.toString());
				
				aStruct.setl_ODR_STS_TYP_DN(aStruct.getODR_STS_TYP_DN());
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
				
				String odrStsTyp = aStruct.getODR_STS_TYP();
				String prdDueDate = aStruct.getPRD_DUE_DATE();
				String totalRcvQty = aStruct.getTOTAL_RCV_QTY();
				String totalIssueQty = aStruct.getTOTAL_ISSUE_QTY();
				String odrStartDate = aStruct.getODR_START_DATE();
				String prdStartDate = aStruct.getPRD_START_DATE();
				String odrQty = aStruct.getODR_QTY();
				aStruct.setl_PRD_DUE_DATE(prdDueDate);
				aStruct.setl_TOTAL_RCV_QTY(totalRcvQty);
				aStruct.setl_ODR_START_DATE(odrStartDate);
				aStruct.setl_PRD_START_DATE(prdStartDate);
				
				String comboValue = "3";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				
				// �����敪
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// �����敪 �\������
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// �����搻��
				aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
				
				// �����o�ɍϐ�
				Double sumOfIssuedQty = getSumOfIssuedQty(sysPLANT_CD, odNo);
				String issuedQty = "0";
				issuedQty = Calculate.subtract(totalIssueQty, sumOfIssuedQty.toString());
				// �}�C�i�X�̏ꍇ�̓[��
				if (Calculate.compare(issuedQty, "0") == -1) {
					issuedQty = "0";
				}
				aStruct.setl_ISSUEED_QTY(issuedQty);
				
				// �����ςݐ�
				String numerator = "0";
				// �I�[�_��ԋ敪 = 9�̏ꍇ�̓[��
				if (("9".equals(aStruct.getODR_STS_TYP()))
						|| (Calculate.compare(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY()) == -1)) {
					numerator = "0";
				} else {
					numerator = Calculate.subtract(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY());
				}
				
				String denominator = Calculate.divide(aStruct.getITEM_SPOIL(), "100", 8, Calculate.ROUND);
				denominator = Calculate.add("1", denominator);
				String alcdQty = Calculate.divide(numerator, denominator, 8, Calculate.ROUND);
				
				// �����o�ɍϐ������Z
				alcdQty = Calculate.add(alcdQty, issuedQty);
				
				// �f�}���h��ԋ敪 <> 9 �̏ꍇ�A�����Ԏ莝�݌ɐ������Z
				if (aStruct.getDM_STS_TYP() == null || aStruct.getDM_STS_TYP().equals("9") == false) {
					alcdQty = Calculate.add(alcdQty, jobOdrCdStockQty.toString());
				}
				
				// �[������
				alcdQty = round(alcdQty, aStruct.getUNIT_QTY_TYP());
				aStruct.setl_ALCD_QTY(Calculate.formatNumric(alcdQty, 1));
				
				// �����o�Ɏc��
				String issueRemainQty = Calculate.subtract(alcdQty, issuedQty);
				aStruct.setl_ISSUE_REMAIN_QTY(issueRemainQty);
				
				// �����\��
				Double jobOdrCdStockAllocatableQty = null;
				jobOdrCdStockAllocatableQty 
					= getJobOdrCdStockAllocatableQty(aStruct.getJOB_ODR_CD(), 
						aStruct.getJOB_ODR_DETAIL_NO(), aStruct.getITEM_CD(),
						true, false, true, true);
				// �}�C�i�X�̏ꍇ�̓[��
				if (Calculate.compare(jobOdrCdStockAllocatableQty.toString(), "0") == -1) {
					jobOdrCdStockAllocatableQty = new Double("0");
				}
				aStruct.setl_ALLOCATABLE_QTY(jobOdrCdStockAllocatableQty.toString());
				
				// �I�[�_��
				aStruct.setl_ODR_QTY(aStruct.getODR_QTY());
				
				// ���ɗ݌v��
				aStruct.setl_TOTAL_RCV_QTY(aStruct.getTOTAL_RCV_QTY());
				
				// �I�[�_��ԋ敪
				aStruct.setl_ODR_STS_TYP(aStruct.getODR_STS_TYP());
				
				// �I�[�_��ԋ敪 �\������
				aStruct.setl_ODR_STS_TYP_DN(aStruct.getODR_STS_TYP_DN());
				
				// �����O���[�v�R�[�h
				aStruct.setl_ALC_GRP_CD(aStruct.getALC_GRP_CD());
				
				// ���ԏ�ԋ敪
				aStruct.setl_JOB_ODR_STS_TYP(aStruct.getJOB_ODR_STS_TYP());
				
				// ���ԏ�ԋ敪 �\������
				aStruct.setl_JOB_ODR_STS_TYP_DN(aStruct.getJOB_ODR_STS_TYP_DN());
				
				// �����[��
				aStruct.setl_PRD_DUE_DATE(aStruct.getPRD_DUE_DATE());
				
				// ��z�����
				aStruct.setl_ODR_START_DATE(aStruct.getODR_START_DATE());
				
				// ���������
				aStruct.setl_PRD_START_DATE(aStruct.getPRD_START_DATE());
				
				// ���ԏ����敪
				aStruct.setl_JOB_ODR_EXP_TYP(aStruct.getJOB_ODR_EXP_TYP());
				
				// ���v�ʏ����敪
				aStruct.setl_MRP_TYP(aStruct.getMRP_TYP());
			
				resultList.add(aStruct);

				if  (maxLine != 0 && resultList.size()> maxLine){
					return resultList;
				}
			}
		}
		
		for (int x = 0; x < resultList.size(); x++) {
			AC0100010Struct tableStruct = (AC0100010Struct)resultList.get(x);
			
		}
		
		return resultList;
	}
	
	/**
	 * �݌ɐ��P�ʋ敪�ɏ]���Ē[���������s���܂��B
	 *
	 * @param num �[���������s�����l
	 * @param unitQtyTyp �݌ɐ��P�ʋ敪
	 * @return ��������
	 */
	private String round(String num, String unitQtyTyp) {
		
		String result = null;
		
		if (unitQtyTyp.equals("1")) {
			
			// 1:�����Ǘ�
			result = Calculate.ceil(num, 0);
			
		} else if (unitQtyTyp.equals("2")) {
			
			// 2:�����Ǘ�
			// �����_��5�ʂ��[��
			String s1 = Calculate.ceil(Calculate.multiply(num, "10000"), 0);
			s1 = Calculate.divide(s1, "10", 1, Calculate.FLOOR);
			String s2 = Calculate.ceil(s1, 0);
			
			if (Calculate.compare(s1, s2) == 0) {
				// �����_��5�ʂŐ؂�̂�
				result = Calculate.floor(num, 4);
			} else {
				// �����_��5�ʂŐ؂�グ
				result = Calculate.ceil(num, 4);
			}
		}
		return result;
	}
	
	/**
	 * �����\�ꗗ���쐬���܂��B
	 */
	private List buildAllocatableList(String plantCd, String itemCd, String odNo, 
			String jobOdrCd, String jobOdrDetailNo) 
			throws FoundationException, SQLException {
		
		List resultList = new ArrayList(0);
		Iterator iterator = null;
		
		//[1] �]��݌ɏ��̌���
		AC0100010Struct searchStruct = new AC0100010Struct();
		searchStruct.setPLANT_CD(plantCd);
		searchStruct.setOD_NO(odNo);
		List searchList = entity.mT_JOB_ODR_ALC_2.read(conn, searchStruct);
		// �\���ő�s������
		int maxLine = sp.getMaxLine(conn, 11);

		// ���݂��Ȃ��ꍇ�i�����Ԉ����ꗗ�ɕ\������Ă��Ȃ��j
		if (searchList.size() <= 0) {
			
			AC0100010Struct aStruct = new AC0100010Struct();

			// �����\���̎Z�o

			Double allocatableStockQty = getAllocatableStockQty(plantCd, itemCd);
			
			// �����\�� > �[���̏ꍇ�ɕ\��
			if (Calculate.compare(allocatableStockQty.toString(), "0") == 1) {
				
				// �����\��
				aStruct.setl_ALLOCATABLE_QTY(allocatableStockQty.toString());
				
				String comboValue = "1";
				String comboName = ALC_TYP_2;
				String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
				
				// �����敪
				aStruct.setl_ALC_TYP_2(comboValue);
				
				// �����敪 �\������
				aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
				
				// �����o�Ɏc��
				Double sumOfAlcdQty = getSumOfAlcdQtyByItem(plantCd, itemCd);
				aStruct.setl_ALCD_QTY(sumOfAlcdQty.toString());
				
				// �莝�݌ɐ�
				Double sumOfItemStockOnHandQty = getSumOfStockOnHandQtyByItem(plantCd, itemCd);
				aStruct.setl_STOCK_ON_HAND_QTY(sumOfItemStockOnHandQty.toString());
				
				// �I�[�_��
				aStruct.setl_ODR_QTY("");
				
				// ���ɗ݌v��
				aStruct.setl_TOTAL_RCV_QTY("");
				
				resultList.add(aStruct);
				if (maxLine != 0 && resultList.size() > maxLine) {
					return resultList;
				}
			}
		}
		
		// [2]�����Ԉ������̌���
		searchStruct = new AC0100010Struct();
		searchStruct.setITEM_CD(itemCd);
		searchList = entity.mM_ITEM.read(conn, searchStruct);
		String unitQtyTyp = "";
		if (searchList.size() > 0) {
			unitQtyTyp = ((AC0100010Struct)(searchList.get(0))).getUNIT_QTY_TYP();
		}
		
		searchStruct.setJOB_ODR_CD(jobOdrCd);
		searchStruct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
		searchStruct.setOD_NO(odNo);
		searchStruct.setPLANT_CD(plantCd);
		searchList = entity.mT_OD_5.read(conn, searchStruct);
		if (searchList.size() > 0) {
				iterator = searchList.iterator();
				while (iterator.hasNext()) {
				
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				jobOdrCd = aStruct.getJOB_ODR_CD();
				jobOdrDetailNo = aStruct.getJOB_ODR_DETAIL_NO();
				String jobOdrCancelNo = aStruct.getJOB_ODR_CANCEL_NO();
				String parentOdNo = aStruct.getPARENT_OD_NO();
				String jobOdrTyp = aStruct.getJOB_ODR_TYP();
				String dmStsTyp = aStruct.getDM_STS_TYP();
				
				// �����\��
				Double allocatableQty = null;
				if ((parentOdNo == null || parentOdNo.equals("")) && ("2".equals(jobOdrTyp))) {
						
					if (("9".equals(aStruct.getODR_STS_TYP()))
							|| (Calculate.compare(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY()) == -1)
							|| ("0".equals(jobOdrCancelNo) == false)) {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, false, false, true);
					} else {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, true, false, true);
					}
				} else {
					if ("9".equals(dmStsTyp)) {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, false, false, true);
					} else {
						allocatableQty = getJobOdrCdStockAllocatableQty(jobOdrCd, jobOdrDetailNo, itemCd,
								true, false, true, true);
					}
				}
				
				// �����\�� > �[���̏ꍇ�͕\������
				if (Calculate.compare(allocatableQty.toString(), "0") == 1) {
					
					// �����\��
					aStruct.setl_ALLOCATABLE_QTY(allocatableQty.toString());
					
					// �����敪
					String comboValue = "2";
					String comboName = ALC_TYP_2;
					String comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
					aStruct.setl_ALC_TYP_2(comboValue);
					
					// �����敪 �\������
					aStruct.setl_ALC_TYP_2_DN(comboDisplayName);
					
					// �����搻��
					aStruct.setl_JOB_ODR_CD(aStruct.getJOB_ODR_CD());
					
					// �����搻�Ԏ}��
					aStruct.setl_JOB_ODR_DETAIL_NO(jobOdrDetailNo);
					
					// �����搻�Ԏ�������ԍ�
					aStruct.setl_JOB_ODR_CANCEL_NO(jobOdrCancelNo);
					
					// �莝�݌�
					Double jobOdrCdStockQty = null;
					jobOdrCdStockQty = getSumOfStockOnHandQtyByJobOdrCd(aStruct.getJOB_ODR_CD(), 
							aStruct.getJOB_ODR_DETAIL_NO(), itemCd);
					aStruct.setl_STOCK_ON_HAND_QTY(jobOdrCdStockQty.toString());
					
					// �����o�Ɏc��
					String alcdQty = "0";
					// �e�I�[�_�f�}���h�ԍ� IS NULL
					if (parentOdNo == null || parentOdNo.equals("")) {
						if (("2".equals(jobOdrTyp))) {
							// ([���Ԉ���]."�����ςݐ�" - [���Ԉ���]."�o�ɍςݐ�")�̍��v
							Double sumOfAlcdQty = getSumOfAlcdQtyByJobOdrCd(
									aStruct.getJOB_ODR_CD(), jobOdrDetailNo, itemCd);
							aStruct.setl_ALCD_QTY(sumOfAlcdQty.toString());
							alcdQty = sumOfAlcdQty.toString();
						}
					} else {
						// �����ςݐ�
						String odrQty = "0";
						if (aStruct.getODR_QTY() != null) {
							odrQty = aStruct.getODR_QTY();
						}
						String totalRcvQty = "0";
						if (aStruct.getTOTAL_RCV_QTY() != null) {
							totalRcvQty = aStruct.getTOTAL_RCV_QTY();
						}
						String itemSpoil = "0";
						if (aStruct.getITEM_SPOIL() != null) {
							itemSpoil = aStruct.getITEM_SPOIL();
						}
						String denominator = Calculate.divide(itemSpoil, "100", 8, Calculate.ROUND);
						denominator = Calculate.add("1", denominator);
						String numerator = Calculate.subtract(odrQty, totalRcvQty);
						if (("9".equals(aStruct.getODR_STS_TYP()))
								|| (Calculate.compare(aStruct.getODR_QTY(), aStruct.getTOTAL_RCV_QTY()) == -1)) {
							numerator = "0";
						}
						alcdQty = Calculate.divide(numerator, denominator, 8, Calculate.ROUND);
						
						// �f�}���h��ԋ敪 <> 9 �̏ꍇ�A�����Ԏ莝�݌ɐ������Z
						if (aStruct.getDM_STS_TYP() == null || aStruct.getDM_STS_TYP().equals("9") == false) {
							alcdQty = Calculate.add(alcdQty, jobOdrCdStockQty.toString());
						}
						
						// �[������
						alcdQty = round(alcdQty, unitQtyTyp);
						aStruct.setl_ALCD_QTY(alcdQty);
					}
					
					// �I�[�_��
					aStruct.setl_ODR_QTY(aStruct.getODR_QTY());
					
					// ���ɗ݌v��
					aStruct.setl_TOTAL_RCV_QTY(aStruct.getTOTAL_RCV_QTY());
					
					// �I�[�_��ԋ敪
					aStruct.setl_ODR_STS_TYP(aStruct.getODR_STS_TYP());
					
					// �I�[�_��ԋ敪 �\������
					comboValue = aStruct.getODR_STS_TYP();
					comboName = ODR_STS_TYP;
					comboDisplayName = getComboDisplayName(odrStsTypCombo, comboValue);
					aStruct.setl_ODR_STS_TYP_DN(comboDisplayName);
					
					// �����O���[�v�R�[�h
					aStruct.setl_ALC_GRP_CD(aStruct.getALC_GRP_CD());
					
					// ���ԏ�ԋ敪
					aStruct.setl_JOB_ODR_STS_TYP(aStruct.getJOB_ODR_STS_TYP());
					
					// ���ԏ�ԋ敪 �\������
					comboValue = aStruct.getJOB_ODR_STS_TYP();
					comboName = JOB_ODR_STS_TYP;
					comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
					aStruct.setl_JOB_ODR_STS_TYP_DN(comboDisplayName);
					
					// �����[��
					aStruct.setl_PRD_DUE_DATE(aStruct.getPRD_DUE_DATE());
					
					// ��z�����
					aStruct.setl_ODR_START_DATE(aStruct.getODR_START_DATE());
					
					// ���������
					aStruct.setl_PRD_START_DATE(aStruct.getPRD_START_DATE());
					
					resultList.add(aStruct);
					if (maxLine != 0 && resultList.size() > maxLine){
					return 	resultList;
					}
					
				}
			}
		}
		
		for (int x = 0; x < resultList.size(); x++) {
			AC0100010Struct tableStruct = (AC0100010Struct)resultList.get(x);
			
		}
		return resultList;
	}
	
	/**
	 * �����\���̍��v���Z�o���܂��B
	 * 
	 * @param plantCd - �H��R�[�h
	 * @param itemCd - �i�ڔԍ�
	 * @return �Z�o����
	 */
	private Double getAllocatableQty(String plantCd, String itemCd) 
			throws FoundationException, SQLException {
		
		Double result = null;
		Double allocatableStockQty = null;
		Double jobOdrCdStockAllocatableQty = null;
		
		// [1]�]��݌Ɉ����\���i�i�ڒP�ʁj
		allocatableStockQty = getAllocatableStockQty(plantCd, itemCd);
		// �}�C�i�X�̏ꍇ�̓[��
		if (Calculate.compare(allocatableStockQty.toString(), "0") == -1) {
			allocatableStockQty = new Double("0");
		}
		
		// [2]���Ԉ����\���i�i�ڒP�ʁj
		jobOdrCdStockAllocatableQty = 
				getJobOdrCdStockAllocatableQty(itemCd, true, true, true, true);
		// �}�C�i�X�̏ꍇ�̓[��
		if (Calculate.compare(jobOdrCdStockAllocatableQty.toString(), "0") == -1) {
			jobOdrCdStockAllocatableQty = new Double("0");
		}
		
		// �����\���̍��v = [1] + [2]
		String allocatableQty = Calculate.add(allocatableStockQty.toString(), 
				jobOdrCdStockAllocatableQty.toString());
				
		result = new Double(allocatableQty);
		return result;
	}
	
	/**
	 * �����ςݐ����v���Z�o���܂��B
	 */
	private Double getSumOfAlcdQty(List jobOdrAlcdList) 
			throws FoundationException, SQLException {
		Double result = null;
		String strSumOfAlcdQty = "0";
		if (jobOdrAlcdList != null) {
			Iterator iterator = jobOdrAlcdList.iterator();
			while (iterator.hasNext()) {
				AC0100010Struct aStruct = (AC0100010Struct)(iterator.next());
				String alcdQty = aStruct.getl_ALCD_QTY();
				if (alcdQty != null && alcdQty.equals("") == false) {
					strSumOfAlcdQty = Calculate.add(strSumOfAlcdQty, alcdQty);
				}
			}
		}
		result = new Double(strSumOfAlcdQty);
		return result;
	}
	
	/**
	* �����̐���
	* @param ���t�����܂�����
	* @param ���t�����܂�����
	*/
	private String formatHM(String inDate , String inFlag){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
			
			if("0".equals(inFlag) &&  inDate.length() < 16){
				return inDate ;
			}else if("1".equals(inFlag) &&  inDate.length() < 5){
				return inDate ;
			}
			
			return inDate.replaceAll("00:00","     ");					
	}
	
	/**
	* �N���������𕪂���
	* @param ���t����
	* @param ���t�܂�����
	*/
	private String formatYMDHM(String inDate , String inFlag){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
		
			if(inDate.length() < 10){
				return inDate ;
			}
			
			if("0".equals(inFlag)){
				return inDate.substring(0,10);
			}
			
			if("1".equals(inFlag) && inDate.length() == 10){
				return "     ";
			}
			
			return inDate.substring(11);				
	}
				
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}
			
			if (jobOdrAlcdList != null) {
				jobOdrAlcdList.clear();
			} else {
				jobOdrAlcdList = new ArrayList(0);
			}
			
			if (allocatableList != null) {
				allocatableList.clear();
			} else {
				allocatableList = new ArrayList(0);
			}
			ExpjMessage emsg = null;
			
			if (isScreenMove() == false) {
				// ���ԁA���Ԏ�������ԍ��̑��݃`�F�b�N
				AC0100010Struct searchStruct = new AC0100010Struct();
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
				List resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				if (resultList.size() <= 0) {
					setErrorMessage("AC00204");
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", searchStruct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR", "JOB_ODR_CANCEL_NO", searchStruct.getJOB_ODR_CANCEL_NO());
				}
				
				// �i�ڔԍ��̑��݃`�F�b�N
				searchStruct = new AC0100010Struct();
				searchStruct.setITEM_CD(struct.getITEM_CD());
				resultList = entity.mM_ITEM.read(conn, searchStruct);
				if (resultList.size() <= 0) {
					setErrorMessage("AC00220");
					setErrorParameter("M_ITEM", "ITEM_CD", searchStruct.getITEM_CD());
				} else {
					AC0100010Struct resultStruct = (AC0100010Struct)(resultList.get(0));
					if (resultStruct.getMRP_ODR_TYP().equals("1") == false && 
							resultStruct.getMRP_ODR_TYP().equals("2") == false) {
						setErrorMessage("AC00211");
						setErrorParameter("M_ITEM", "ITEM_CD", searchStruct.getITEM_CD());
					}
				}
			}
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// ���v�ʌ���
/*			if (isScreenMove() == true) {
				struct.setOD_NO(odNo);
			}
*/			
			struct.setPLANT_CD(sysPLANT_CD);
			List searchList = null;
			searchList = entity.mT_JOB_ODR_ALC.read(conn, struct);

			if (searchList.size() <= 0) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
				readStatus = NOT_FOUND;
				return;
			}
			
			if (searchList.size() > 1) {
				setErrorMessage("AC00209");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
				readStatus = ERROR;
				return;
			}
			
			// ���v��
			AC0100010Struct resultStruct = ((AC0100010Struct)(searchList.get(0)));
			
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
			String itemName = resultStruct.getITEM_NAME();
			String odNo = resultStruct.getOD_NO();
			String stockUnit = resultStruct.getSTOCK_UNIT();
			String jobOdrDetailNo = resultStruct.getJOB_ODR_DETAIL_NO();
			String odrQty = resultStruct.getODR_QTY();
			String dmQty = resultStruct.getDM_QTY();
			String alcGrpCd = resultStruct.getALC_GRP_CD();
			String dmStsTyp = resultStruct.getDM_STS_TYP();
			String jobOdrStsTyp = resultStruct.getJOB_ODR_STS_TYP();
			String totalIssueQty = resultStruct.getTOTAL_ISSUE_QTY();
			String dueDate = resultStruct.getDUE_DATE();
			String jobOdrExpTyp = resultStruct.getJOB_ODR_EXP_TYP();
			String odCalcFlg = resultStruct.getOD_CALC_FLG();
			String mrpTyp = resultStruct.getMRP_TYP();
			String unitQtyTyp = resultStruct.getUNIT_QTY_TYP();
			String itemCd = resultStruct.getITEM_CD();
			String jobOdrCd = resultStruct.getJOB_ODR_CD();
			String jobOdrCancelNo = resultStruct.getJOB_ODR_CANCEL_NO();
			
			// struct�֐ݒ�
			struct.setITEM_NAME(itemName);
			struct.seth_OD_NO(odNo);
			struct.setSTOCK_UNIT(stockUnit);
			struct.setSTOCK_UNIT_1(stockUnit);
			struct.setSTOCK_UNIT_2(stockUnit);
			struct.setSTOCK_UNIT_3(stockUnit);
			struct.setITEM_CD(itemCd);
			struct.setJOB_ODR_CD(jobOdrCd);
			struct.setJOB_ODR_DETAIL_NO(jobOdrDetailNo);
			struct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
			struct.setODR_QTY(odrQty);
			struct.setDM_QTY(dmQty);
			struct.setALC_GRP_CD(alcGrpCd);
			struct.setDM_STS_TYP(dmStsTyp);
			struct.setJOB_ODR_STS_TYP(jobOdrStsTyp);
			struct.setTOTAL_ISSUE_QTY(totalIssueQty);
			
		    struct.setDUE_DATE(dtf.getDatePart(dueDate));
	        struct.setDUE_TIME(dtf.getCoronTimePart(dueDate));
			
	        struct.setJOB_ODR_EXP_TYP(jobOdrExpTyp);
			struct.setOD_CALC_FLG(odCalcFlg);
			struct.setMRP_TYP(mrpTyp);
			struct.setUNIT_QTY_TYP(unitQtyTyp);
			
			String comboValue = struct.getDM_STS_TYP();
			String comboName = DM_STS_TYP;
			String comboDisplayName = getComboDisplayName(dmStsTypCombo, comboValue);
			struct.setDM_STS_TYP_DN(comboDisplayName);
			
			comboValue = struct.getJOB_ODR_STS_TYP();
			comboName = JOB_ODR_STS_TYP;
			comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
			struct.setJOB_ODR_STS_TYP_DN(comboDisplayName);
			
			if (resultStruct.getMRP_TYP().equals("3")) {
				setErrorMessage("AC00210");
				setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_JOB_ODR", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
			}
			if (resultStruct.getPARENT_OD_NO() == null || resultStruct.getPARENT_OD_NO().equals("")) {
				setErrorMessage("AC00212");
				setErrorParameter("T_OD", "OD_NO", struct.geth_OD_NO());
			}
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �����\���̍��v
			Double allocatableQty = getAllocatableQty(sysPLANT_CD, itemCd);
			struct.setSUM_OF_ALLOCATABLE_QTY(allocatableQty.toString());
			
			// ���Ԉ����ꗗ
			jobOdrAlcdList = buildJobOdrAlcdList(sysPLANT_CD, odNo, jobOdrDetailNo);
			
			// �����\�ꗗ
			allocatableList = buildAllocatableList(sysPLANT_CD, itemCd, odNo, jobOdrCd, jobOdrDetailNo);
			
			
			// �����ςݐ����v
			Double sumOfAlcdQty = getSumOfAlcdQty(jobOdrAlcdList);
			// �}�C�i�X�̏ꍇ�[��
			if (Calculate.compare(sumOfAlcdQty.toString(), "0") == -1) {
				sumOfAlcdQty = new Double("0");
			}
			struct.setSUM_OF_ALCD_QTY(sumOfAlcdQty.toString());
			
			// �����c�����v
			struct.setSUM_OF_ALC_REMAIN_QTY(
					Calculate.subtract(struct.getDM_QTY(), struct.getSUM_OF_ALCD_QTY()));
			
			// �\���ő�s���`�F�b�N
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0 && jobOdrAlcdList.size() > maxLine){
				jobOdrAlcdList.clear();
				setErrorMessage("AC00221", "" + maxLine);
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
			}
			int maxLine2 = sp.getMaxLine(conn, 11);
			if(maxLine2 != 0 && allocatableList.size() > maxLine2){
				allocatableList.clear();
				setErrorMessage("AC00222", "" + maxLine);
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
			}
			list = jobOdrAlcdList;
			if ((maxLine != 0 && jobOdrAlcdList.size() > maxLine) && 
					(maxLine2 != 0 && allocatableList.size() > maxLine2)) {
				readStatus = TOO_MANY;
			} else {
				readStatus = NORMAL;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		
		if (list != null) {
			list.clear();
		} else {
			list = new ArrayList(0);
		}
		
		if (jobOdrAlcdList != null) {
			jobOdrAlcdList.clear();
		} else {
			jobOdrAlcdList = new ArrayList(0);
		}
		
		if (allocatableList != null) {
			allocatableList.clear();
		} else {
			allocatableList = new ArrayList(0);
		}
		
		odNo = null;
		mode = null;
		struct.clear();
		struct.setJOB_ODR_CANCEL_NO("0");
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �����C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAlcUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcUpdate");
			//{{user_implement_dev:<controlAlcUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			
		mode = "AlcUpdate";
		
		try{
		DateTimeFormat dtf = new DateTimeFormat(conn);

		String comboValue = struct.getUNIT_QTY_TYP();
		String comboName = UNIT_QTY_TYP;
		String comboDisplayName = getComboDisplayName(unitQtyTypCombo, comboValue);
		struct.setUNIT_QTY_TYP_DN(comboDisplayName);
		struct.setALC_TYP_2(struct.getl_ALC_TYP_2());
		comboValue = struct.getl_ALC_TYP_2();
		comboName = ALC_TYP_2;
		comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
		struct.setALC_TYP_2_DN(comboDisplayName);
		struct.setJOB_ODR_CD_2(struct.getl_JOB_ODR_CD());
		struct.setJOB_ODR_DETAIL_NO_2(struct.getl_JOB_ODR_DETAIL_NO());
		struct.setJOB_ODR_CANCEL_NO_2(struct.getl_JOB_ODR_CANCEL_NO());
		struct.setALCD_QTY(struct.getl_ALCD_QTY());
		struct.setISSUEED_QTY(struct.getl_ISSUEED_QTY());
		struct.setISSUE_REMAIN_QTY(struct.getl_ISSUE_REMAIN_QTY());
		struct.setALLOCATABLE_QTY(struct.getl_ALLOCATABLE_QTY());
		struct.setSTOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
		struct.setODR_QTY(struct.getl_ODR_QTY());
		struct.setTOTAL_RCV_QTY(struct.getl_TOTAL_RCV_QTY());
		struct.setODR_STS_TYP(struct.getl_ODR_STS_TYP());
		comboValue = struct.getl_ODR_STS_TYP();
		comboName = ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(odrStsTypCombo, comboValue);
		struct.setODR_STS_TYP_DN(comboDisplayName);
		struct.setALC_GRP_CD_2(struct.getl_ALC_GRP_CD());
		struct.setJOB_ODR_STS_TYP_2(struct.getl_JOB_ODR_STS_TYP());
		comboValue = struct.getl_JOB_ODR_STS_TYP();
		comboName = JOB_ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
		struct.setJOB_ODR_STS_TYP_DN_2(comboDisplayName);
		
	    struct.setPRD_DUE_DATE(dtf.getDatePart(struct.getl_PRD_DUE_DATE()));
        struct.setODR_START_DATE(dtf.getDatePart(struct.getl_ODR_START_DATE()));
	    struct.setPRD_START_DATE(dtf.getDatePart(struct.getl_PRD_START_DATE()));
        struct.setPRD_DUE_TIME(dtf.getCoronTimePart(struct.getl_PRD_DUE_DATE()));
	    struct.setODR_START_TIME(dtf.getCoronTimePart(struct.getl_ODR_START_DATE()));
        struct.setPRD_START_TIME(dtf.getCoronTimePart(struct.getl_PRD_START_DATE()));
				
		struct.setSTOCK_UNIT(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_1(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_2(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_3(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_4(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_5(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_6(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_7(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_8(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_9(struct.getSTOCK_UNIT());
		// �I�[�_���A���ɗ݌v���̌v�ʒP�ʂ�null��ݒ�
		if (struct.getl_ALC_TYP_2().equals("1")) {
			struct.setSTOCK_UNIT_10(null);
			struct.setSTOCK_UNIT_11(null);
		} else {
			struct.setSTOCK_UNIT_10(struct.getSTOCK_UNIT());
			struct.setSTOCK_UNIT_11(struct.getSTOCK_UNIT());
		}
		struct.setMODIFY_COUNT(struct.getl_MODIFY_COUNT());
		
		} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
		}
				
                //}}user_implement_dev:<controlAlcUpdate>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcUpdate");

		return;
	}

	/**
	 * �����폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAlcDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcDelete");
			//{{user_implement_dev:<controlAlcDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		String keyMessage = "";
		try {
			
			// �g�����U�N�V�����J�n
			
			AC0100010Struct deleteStruct = new AC0100010Struct();
			AC0100010Struct searchStruct = new AC0100010Struct();
			
			searchStruct.setPLANT_CD(sysPLANT_CD);
			List resultList = entity.mSYS_OD_CALC_CTRL.read(conn, searchStruct);
			String odCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			//String odMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CD_2(struct.getl_JOB_ODR_CD());
			resultList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, searchStruct);
			String jobOdCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			String jobOdMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			if(jobOdCalcFlg==null||"".equals(jobOdCalcFlg)){
				jobOdCalcFlg = "0";
			}
			if(jobOdMntFlg==null||"".equals(jobOdMntFlg)){
				jobOdMntFlg = "0";
			}
			
			// ���������Ԃ̐��ԏ����敪
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			String jobOdrExpTyp = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			
			// �����搻�Ԃ̐��ԏ����敪
			String jobOdrExpTyp2 = null;
			if (struct.getl_ALC_TYP_2().equals("2")) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getl_JOB_ODR_DETAIL_NO());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
				resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				jobOdrExpTyp2 = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			}
			if (odCalcFlg.equals("1")) {
				setErrorMessage("AC00206");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}
			if (Integer.parseInt(jobOdCalcFlg)>0) {
				setErrorMessage("AC00236");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD", struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}

			if (Integer.parseInt(jobOdMntFlg)>0 || "9".equals(jobOdrExpTyp) == false 
					|| ("2".equals(struct.getALC_TYP_2()) && "9".equals(jobOdrExpTyp2) == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			/*
			if (odMntFlg.equals("1") || jobOdrExpTyp.equals("9") == false 
					|| (struct.getl_ALC_TYP_2().equals("2") && jobOdrExpTyp2.equals("9") == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}*/
			searchStruct.setPLANT_CD(sysPLANT_CD);
			searchStruct.setOD_NO(struct.geth_OD_NO());
			resultList = entity.mT_OD_3.read(conn, searchStruct);
			String mrpTyp = ((AC0100010Struct)resultList.get(0)).getMRP_TYP();
			if (mrpTyp.equals("3")) {
				setErrorMessage("AC00213");
				setErrorParameter("T_OD", "OD_NO", searchStruct.getOD_NO());
			}
			
			if (struct.getl_ALC_TYP_2().equals("1")) {
				deleteStruct.setPLANT_CD(sysPLANT_CD);
				deleteStruct.setOD_NO(struct.geth_OD_NO());
				deleteStruct.setALC_STOCK_TYP("1");
				deleteStruct.setISSUE_CMPLT_FLG("0");
				deleteStruct.setITEM_CD("");
				deleteStruct.setJOB_ODR_CD("");
				deleteStruct.setJOB_ODR_DETAIL_NO("");
			} else if (struct.getl_ALC_TYP_2().equals("2")) {
				deleteStruct.setPLANT_CD(sysPLANT_CD);
				deleteStruct.setOD_NO(struct.geth_OD_NO());
				deleteStruct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());
				deleteStruct.setJOB_ODR_DETAIL_NO(struct.getl_JOB_ODR_DETAIL_NO());
				deleteStruct.setJOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
				deleteStruct.setALC_STOCK_TYP("2");
				deleteStruct.setISSUE_CMPLT_FLG("0");
			}
			
			// �X�V�񐔃`�F�b�N
			resultList = entity.mT_JOB_ODR_ALC_LOCK.read(conn, deleteStruct);
			String modifyCount = ((AC0100010Struct)resultList.get(0)).getMODIFY_COUNT();
			String issueedQty = ((AC0100010Struct)resultList.get(0)).getISSUEED_QTY();
			if (struct.getl_MODIFY_COUNT().equals(modifyCount) == false) {
				setErrorMessage("ZZ01105");
				if (struct.getl_ALC_TYP_2().equals("1")) {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.getOD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				} else if (struct.getl_ALC_TYP_2().equals("2")) {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.getOD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", deleteStruct.getJOB_ODR_CD());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
							deleteStruct.getJOB_ODR_DETAIL_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				}
			}
			
			if (Calculate.compare(issueedQty, "0") == 1) {
				setErrorMessage("AC00214");
				if (struct.getl_ALC_TYP_2().equals("1")) {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.geth_OD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				} else {
					setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", deleteStruct.getPLANT_CD());
					setErrorParameter("T_JOB_ODR_ALC", "OD_NO", deleteStruct.geth_OD_NO());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", deleteStruct.getl_JOB_ODR_CD());
					setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
							deleteStruct.getl_JOB_ODR_DETAIL_NO());
					setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", deleteStruct.getALC_STOCK_TYP());
					setErrorParameter("T_JOB_ODR_ALC", "ISSUE_CMPLT_FLG", deleteStruct.getISSUE_CMPLT_FLG());
				}
			}
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			int cnt = 0;
			deleteStruct.setsUser_ID(struct.getsUser_ID());
			deleteStruct.setsSysdate(struct.getsSysdate());
			deleteStruct.setsOraganization_CD(struct.getsOrganization_CD());
			if (msgStruct.sizeError() <= 0) {
				if (struct.getl_ALC_TYP_2().equals("1")) {
					cnt = entity.mdeleteT_JOB_ODR_ALC_2.delete(conn, deleteStruct);
				} else {
					cnt = entity.mdeleteT_JOB_ODR_ALC.delete(conn, deleteStruct);
				}
				AC0100010Struct updateStruct = new AC0100010Struct();
				updateStruct.setsUser_ID(struct.getsUser_ID());
				updateStruct.setsSysdate(struct.getsSysdate());
				updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
				updateStruct.setOD_GNR_TYP("1");
				updateStruct.setOD_NO(struct.geth_OD_NO());
				updateStruct.setPLANT_CD(sysPLANT_CD);
				List todList = entity.mSELECT_T_OD.read(conn, updateStruct);
				cnt = entity.mupdateT_OD.update(conn, updateStruct);
				conn.commit();
			}
			controlSelect();
		} catch (ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
			}
		}
                //}}user_implement_dev:<controlAlcDelete>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcDelete");

		return;
	}

	/**
	 * �����ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAlcInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcInsert");
			//{{user_implement_dev:<controlAlcInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		
		mode = "AlcInsert";
		
		try{
		DateTimeFormat dtf = new DateTimeFormat(conn);
		String comboValue = struct.getUNIT_QTY_TYP();
		String comboName = UNIT_QTY_TYP;
		String comboDisplayName = getComboDisplayName(unitQtyTypCombo, comboValue);
		struct.setUNIT_QTY_TYP_DN(comboDisplayName);
		struct.setALC_TYP_2(struct.getl_ALC_TYP_2());
		comboValue = struct.getl_ALC_TYP_2();
		comboName = ALC_TYP_2;
		comboDisplayName = getComboDisplayName(alcTyp2Combo, comboValue);
		struct.setALC_TYP_2_DN(comboDisplayName);
		struct.setJOB_ODR_CD_2(struct.getl_JOB_ODR_CD());
		struct.setJOB_ODR_DETAIL_NO_2(struct.getl_JOB_ODR_DETAIL_NO());
		struct.setJOB_ODR_CANCEL_NO_2(struct.getl_JOB_ODR_CANCEL_NO());
		struct.setALCD_QTY("0");
		struct.setISSUEED_QTY(null);
		struct.setISSUE_REMAIN_QTY(struct.getl_ALCD_QTY());
		struct.setALLOCATABLE_QTY(struct.getl_ALLOCATABLE_QTY());
		struct.setSTOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
		struct.setODR_QTY(struct.getl_ODR_QTY());
		struct.setTOTAL_RCV_QTY(struct.getl_TOTAL_RCV_QTY());
		struct.setODR_STS_TYP(struct.getl_ODR_STS_TYP());
		comboValue = struct.getl_ODR_STS_TYP();
		comboName = ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(odrStsTypCombo, comboValue);
		struct.setODR_STS_TYP_DN(comboDisplayName);
		struct.setALC_GRP_CD_2(struct.getl_ALC_GRP_CD());
		struct.setJOB_ODR_STS_TYP_2(struct.getl_JOB_ODR_STS_TYP());
		comboValue = struct.getl_JOB_ODR_STS_TYP();
		comboName = JOB_ODR_STS_TYP;
		comboDisplayName = getComboDisplayName(jobOdrStsTypCombo, comboValue);
		struct.setJOB_ODR_STS_TYP_DN_2(comboDisplayName);
				
	    struct.setPRD_DUE_DATE(dtf.getDatePart(struct.getl_PRD_DUE_DATE()));
        struct.setODR_START_DATE(dtf.getDatePart(struct.getl_ODR_START_DATE()));
	    struct.setPRD_START_DATE(dtf.getDatePart(struct.getl_PRD_START_DATE()));
        struct.setPRD_DUE_TIME(dtf.getCoronTimePart(struct.getl_PRD_DUE_DATE()));
	    struct.setODR_START_TIME(dtf.getCoronTimePart(struct.getl_ODR_START_DATE()));
        struct.setPRD_START_TIME(dtf.getCoronTimePart(struct.getl_PRD_START_DATE()));
				
		struct.setSTOCK_UNIT(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_1(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_2(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_3(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_4(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_5(struct.getSTOCK_UNIT());
		// �����o�ɍϐ��̌v�ʒP�ʂ�null��ݒ�
		struct.setSTOCK_UNIT_6(null);
		struct.setSTOCK_UNIT_7(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_8(struct.getSTOCK_UNIT());
		struct.setSTOCK_UNIT_9(struct.getSTOCK_UNIT());
		// �I�[�_���A���ɗ݌v���̌v�ʒP�ʂ�null��ݒ�
		if (struct.getl_ALC_TYP_2().equals("1")) {
			struct.setSTOCK_UNIT_10(null);
			struct.setSTOCK_UNIT_11(null);
		} else {
			struct.setSTOCK_UNIT_10(struct.getSTOCK_UNIT());
			struct.setSTOCK_UNIT_11(struct.getSTOCK_UNIT());
		}
		
		} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
		}
				
                //}}user_implement_dev:<controlAlcInsert>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlAlcInsert");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			String errorUrl = "/AC0100011.jsp";
			setNextUrl("/AC0100010.jsp");
			AC0100010Struct searchStruct = new AC0100010Struct();
			searchStruct.setPLANT_CD(sysPLANT_CD);
			List resultList = entity.mSYS_OD_CALC_CTRL.read(conn, searchStruct);
			String odCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			//String odMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CD_2(struct.getJOB_ODR_CD_2());
			resultList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, searchStruct);
			String jobOdCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			String jobOdMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			if(jobOdCalcFlg==null||"".equals(jobOdCalcFlg)){
				jobOdCalcFlg = "0";
			}
			if(jobOdMntFlg==null||"".equals(jobOdMntFlg)){
				jobOdMntFlg = "0";
			}
			
			// ���������Ԃ̐��ԏ����敪
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			String jobOdrExpTyp = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			
			// �����搻�Ԃ̐��ԏ����敪
			String jobOdrExpTyp2 = null;
			if ("2".equals(struct.getALC_TYP_2())) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO_2());
				resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				jobOdrExpTyp2 = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			}
			
			if ("1".equals(odCalcFlg)) {
				setErrorMessage("AC00206");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}
			
			if (Integer.parseInt(jobOdCalcFlg)>0) {
				setErrorMessage("AC00236");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			
			if (Integer.parseInt(jobOdMntFlg)>0 || "9".equals(jobOdrExpTyp) == false 
					|| ("2".equals(struct.getALC_TYP_2()) && "9".equals(jobOdrExpTyp2) == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			
			searchStruct.setPLANT_CD(sysPLANT_CD);
			searchStruct.setOD_NO(struct.geth_OD_NO());
			resultList = entity.mT_OD_3.read(conn, searchStruct);
			String mrpTyp = ((AC0100010Struct)resultList.get(0)).getMRP_TYP();
			
			if ("3".equals(mrpTyp)) {
				setErrorMessage("AC00213");
				setErrorParameter("T_OD", "OD_NO", searchStruct.getOD_NO());
			}
			
			if (Calculate.compare(struct.getALCD_QTY(), "0") == 0) {
				setErrorMessage("AC00216");
			}
			
			Double allocatableStockQty = new Double("0");
			if ("1".equals(struct.getALC_TYP_2())) {
				allocatableStockQty = getAllocatableStockQty(sysPLANT_CD, struct.getITEM_CD());
			} else if (struct.getALC_TYP_2().equals("2")) {
				allocatableStockQty = getJobOdrCdStockAllocatableQty(
						struct.getJOB_ODR_CD_2(), struct.getJOB_ODR_DETAIL_NO_2(), struct.getITEM_CD(),
						true, true, true, true);
			}
			
			if (Calculate.compare(allocatableStockQty.toString(), struct.getALCD_QTY()) == -1) {
				setErrorMessage("AC00215");
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				setNextUrl(errorUrl);
				return;
			}
			AC0100010Struct insertStruct = new AC0100010Struct();
			insertStruct.setALCD_QTY(struct.getALCD_QTY());
			if ("1".equals(struct.getUNIT_QTY_TYP())) {
				String ceilAlcdQty = Calculate.ceil(struct.getALCD_QTY(), 0);
				if (Calculate.compare(ceilAlcdQty, struct.getALCD_QTY()) != 0) {
					insertStruct.setALCD_QTY(ceilAlcdQty);
					setWarningMessage("AC00217");
				}
			}
			if (struct.getALC_GRP_CD().equals(struct.getALC_GRP_CD_2()) == false) {
				setWarningMessage("AC00223");
			}
			if (struct.getDUE_DATE() != null && struct.getDUE_DATE().equals("") == false
					&& struct.getPRD_DUE_DATE() != null && struct.getPRD_DUE_DATE().equals("") == false) {
				if (DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) < 0) {
					setWarningMessage("AC00218");
				}else if(DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) == 0){	
							String sDueTime = struct.getDUE_TIME();
							if(null == sDueTime || "".equals(sDueTime.trim())){
								sDueTime = "00:00";
							}
							String sPrdDueTime = struct.getPRD_DUE_TIME();
							if(null == sPrdDueTime || "".equals(sPrdDueTime.trim())){
								sPrdDueTime = "00:00";
							}
							if(sDueTime.compareTo(sPrdDueTime) < 0){
								setWarningMessage("AC00218");
							}
				}
			}
			
			Numbering jobOdrAlcCdNumbering = null;
			String jobOdrAlcCd = null;
			List searchList = null;
			AC0100010Struct resultStruct = null;
			AC0100010Struct updateStruct = new AC0100010Struct();
			jobOdrAlcCdNumbering = 
					new Numbering(
							conn,
							Numbering.JOB_OD_ALC_CD,
							sysUSER_CD,
							sp.getProcId(),
							sysPLANT_CD);
			jobOdrAlcCd = jobOdrAlcCdNumbering.getNo();
			insertStruct.setJOB_ODR_ALC_CD(jobOdrAlcCd);
			
			// �I�[�_�f�}���h�ԍ�
			insertStruct.setOD_NO(struct.geth_OD_NO());
			
			// �H��R�[�h
			insertStruct.setPLANT_CD(sysPLANT_CD);
			
			// �i�ڔԍ�
			insertStruct.setITEM_CD(struct.getITEM_CD());
			
			if (struct.getALC_TYP_2().equals("1")) {
				
				// �����݌ɋ敪
				insertStruct.setALC_STOCK_TYP("1");
				
				// ����
				insertStruct.setJOB_ODR_CD("");
				
				// ���Ԏ}��
				insertStruct.setJOB_ODR_DETAIL_NO("0");
				
			} else if (struct.getALC_TYP_2().equals("2")) {
				
				// �����݌ɋ敪
				insertStruct.setALC_STOCK_TYP("2");
				
				// ����
				insertStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				
				// ���Ԏ}��
				insertStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				
			}
			
			// �o�ɍςݐ�
			insertStruct.setISSUEED_QTY("0");
			
			// �o�Ɋ����t���O
			insertStruct.setISSUE_CMPLT_FLG("0");
			
			insertStruct.setsUser_ID(struct.getsUser_ID());
			insertStruct.setsSysdate(struct.getsSysdate());
			insertStruct.setsOraganization_CD(struct.getsOrganization_CD());
			
			int cnt = 0;
			if (msgStruct.sizeError() <= 0) {
				cnt = entity.minsertT_JOB_ODR_ALC.create(conn, insertStruct);
				updateStruct.setsUser_ID(struct.getsUser_ID());
				updateStruct.setsSysdate(struct.getsSysdate());
				updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
				updateStruct.setOD_GNR_TYP("1");  // ���v�ʔ��������敪 1:�}�j���A���o�^
				updateStruct.setOD_NO(struct.geth_OD_NO()); // �I�[�_�f�}���h�ԍ�
				updateStruct.setPLANT_CD(sysPLANT_CD); // �H��R�[�h
				cnt = entity.mupdateT_OD.update(conn, updateStruct);
				conn.commit();
			}
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			String errorUrl = "/AC0100011.jsp";
			setNextUrl("/AC0100010.jsp");
			
			Numbering jobOdrAlcCdNumbering = null;
			String jobOdrAlcCd = null;
			List searchList = null;
			AC0100010Struct searchStruct = null;
			AC0100010Struct resultStruct = null;
			AC0100010Struct updateStruct = new AC0100010Struct();
			
			searchStruct = new AC0100010Struct();
			
			searchStruct.setPLANT_CD(sysPLANT_CD);
			List resultList = entity.mSYS_OD_CALC_CTRL.read(conn, searchStruct);
			String odCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			//String odMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CD_2(struct.getJOB_ODR_CD_2());
			resultList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, searchStruct);
			String jobOdCalcFlg = ((AC0100010Struct)resultList.get(0)).getOD_CALC_FLG();
			String jobOdMntFlg = ((AC0100010Struct)resultList.get(0)).getOD_MNT_FLG();
			if(jobOdCalcFlg==null||"".equals(jobOdCalcFlg)){
				jobOdCalcFlg = "0";
			}
			if(jobOdMntFlg==null||"".equals(jobOdMntFlg)){
				jobOdMntFlg = "0";
			}
			
			// ���������Ԃ̐��ԏ����敪
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			String jobOdrExpTyp = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			
			String jobOdrExpTyp2 = null;
			if (struct.getALC_TYP_2().equals("2")) {
				// �����搻�Ԃ̐��ԏ����敪
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO_2());
				resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
				jobOdrExpTyp2 = ((AC0100010Struct)resultList.get(0)).getJOB_ODR_EXP_TYP();
			}
							
			// [���v�ʌv�Z����]."���v�ʌv�Z���t���O" = 1 �̏ꍇ�G���[
			// ���v�ʌv�Z���s���̂��߃����e�i���X�ł��܂���B
			if (odCalcFlg.equals("1")) {
				setErrorMessage("AC00206");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}
			
			// [���v�ʌv�Z����(����)]."���v�ʌv�Z���t���O" = 1 �̏ꍇ�G���[
			// ���v�ʌv�Z���s���̂��߃����e�i���X�ł��܂���B			
			if (Integer.parseInt(jobOdCalcFlg)>0) {
				setErrorMessage("AC00236");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}

			// [���v�ʌv�Z����(����)]."���v�ʃ����e�i���X���t���O" = 1
			// or ���������Ԃ̐��ԏ����敪 <> 9
			// or �����搻�Ԃ̐��ԏ����敪 <> 9 �̏ꍇ�G���[
			// ���Ԉ��������e�i���X���s���ɂ́A���v�ʌv�Z�����s����K�v������܂��B
			if (Integer.parseInt(jobOdMntFlg)>0 || "9".equals(jobOdrExpTyp) == false 
					|| ("2".equals(struct.getALC_TYP_2()) && "9".equals(jobOdrExpTyp2) == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
				setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD",  struct.getJOB_ODR_CD()+" OR "+searchStruct.getJOB_ODR_CD_2());
			}
			/*
			// [���v�ʌv�Z����]."���v�ʃ����e�i���X���t���O" = 1
			// or ���������Ԃ̐��ԏ����敪 <> 9
			// or �����搻�Ԃ̐��ԏ����敪 <> 9 �̏ꍇ�G���[
			// ���Ԉ��������e�i���X���s���ɂ́A���v�ʌv�Z�����s����K�v������܂��B
			if (odMntFlg.equals("1") || jobOdrExpTyp.equals("9") == false 
					|| (struct.getALC_TYP_2().equals("2") && jobOdrExpTyp2.equals("9") == false)) {
				setErrorMessage("AC00205");
				setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", searchStruct.getPLANT_CD());
			}*/
			
			// [���v��]."���v�ʏ����敪" = 3 �̏ꍇ�G���[
			// �w�肳�ꂽ���v�ʂ͘_���폜����Ă��邽�߃����e�i���X�ł��܂���B
			searchStruct.setPLANT_CD(sysPLANT_CD);
			searchStruct.setOD_NO(struct.geth_OD_NO());
			resultList = entity.mT_OD_3.read(conn, searchStruct);
			String mrpTyp = ((AC0100010Struct)resultList.get(0)).getMRP_TYP();
			if (mrpTyp.equals("3")) {
				setErrorMessage("AC00213");
				setErrorParameter("T_OD", "OD_NO", searchStruct.getOD_NO());
			}
			
			Double allocatableStockQty = new Double("0");
			if (struct.getALC_TYP_2().equals("1")) {
				allocatableStockQty = getAllocatableStockQty(sysPLANT_CD, struct.getITEM_CD());
			} else if (struct.getALC_TYP_2().equals("2")) {
				allocatableStockQty = getJobOdrCdStockAllocatableQty(
						struct.getJOB_ODR_CD_2(), struct.getJOB_ODR_DETAIL_NO_2(), struct.getITEM_CD(),
						true, true, true, true);
			}
			
			searchStruct = new AC0100010Struct();
			searchList = null;
			if (struct.getALC_TYP_2().equals("1")) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setOD_NO(struct.geth_OD_NO());
				searchStruct.setALC_STOCK_TYP("1");
				searchStruct.setISSUE_CMPLT_FLG("0");
			} else if (struct.getALC_TYP_2().equals("2")) {
				searchStruct.setPLANT_CD(sysPLANT_CD);
				searchStruct.setOD_NO(struct.geth_OD_NO());
				searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
				searchStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				searchStruct.setALC_STOCK_TYP("2");
				searchStruct.setISSUE_CMPLT_FLG("0");
			}
			searchList = entity.mT_JOB_ODR_ALC_4.read(conn, searchStruct);
			resultStruct = (AC0100010Struct)(searchList.get(0));
			String alcdQtyBefore = resultStruct.getALCD_QTY();
			String sum = Calculate.add(allocatableStockQty.toString(), alcdQtyBefore);
			
			if (Calculate.compare(sum, struct.getALCD_QTY()) == -1) {
				setErrorMessage("AC00215");
			}
			
			if (Calculate.compare(alcdQtyBefore, struct.getALCD_QTY()) != 0) {
				
				// �I�[�_�f�}���h�ԍ�
				updateStruct.setOD_NO(struct.geth_OD_NO());
				
				// �H��R�[�h
				updateStruct.setPLANT_CD(sysPLANT_CD);
				
				// �i�ڔԍ�
				updateStruct.setITEM_CD(struct.getITEM_CD());
				
				if (struct.getALC_TYP_2().equals("1")) {
					
					// �����݌ɋ敪
					updateStruct.setALC_STOCK_TYP("1");
					
					// ����
					updateStruct.setJOB_ODR_CD("");
					
					// ���Ԏ}��
					updateStruct.setJOB_ODR_DETAIL_NO("");
					
				} else if (struct.getALC_TYP_2().equals("2")) {
					
					// �����݌ɋ敪
					updateStruct.setALC_STOCK_TYP("2");
					
					// ����
					updateStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD_2());
					
					// ���Ԏ}��
					updateStruct.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO_2());
				}
				
				// �����ςݐ�
				updateStruct.setALCD_QTY(struct.getALCD_QTY());
				
				updateStruct.setsUser_ID(struct.getsUser_ID());
				updateStruct.setsSysdate(struct.getsSysdate());
				updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
				
				// �X�V�񐔃`�F�b�N���s���b�N
				resultList = entity.mT_JOB_ODR_ALC_LOCK.read(conn, updateStruct);
				String modifyCount = ((AC0100010Struct)resultList.get(0)).getMODIFY_COUNT();
				String issueedQty = ((AC0100010Struct)resultList.get(0)).getISSUEED_QTY();
				
				if (struct.getMODIFY_COUNT().equals(modifyCount) == false) {
					setErrorMessage("ZZ01105");
					if (struct.getALC_TYP_2().equals("1")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					} else if (struct.getALC_TYP_2().equals("2")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", updateStruct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
								updateStruct.getJOB_ODR_DETAIL_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					}
				}
				
				if (Calculate.compare(issueedQty, struct.getALCD_QTY()) == 1) {
					setErrorMessage("AC00219");
					if (struct.getALC_TYP_2().equals("1")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					} else if (struct.getALC_TYP_2().equals("2")) {
						setErrorParameter("T_JOB_ODR_ALC", "PLANT_CD", updateStruct.getPLANT_CD());
						setErrorParameter("T_JOB_ODR_ALC", "OD_NO", updateStruct.getOD_NO());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_CD", updateStruct.getJOB_ODR_CD());
						setErrorParameter("T_JOB_ODR_ALC", "JOB_ODR_DETAIL_NO", 
								updateStruct.getJOB_ODR_DETAIL_NO());
						setErrorParameter("T_JOB_ODR_ALC", "ALC_STOCK_TYP", updateStruct.getALC_STOCK_TYP());
					}
				}
				
				// �G���[������ΏI��
				if (msgStruct.hasError()) {
					setNextUrl(errorUrl);
					return;
				}
				
				if ("1".equals(struct.getUNIT_QTY_TYP())) {
					String ceilAlcdQty = Calculate.ceil(struct.getALCD_QTY(), 0);
					if (Calculate.compare(ceilAlcdQty, struct.getALCD_QTY()) != 0) {
						updateStruct.setALCD_QTY(ceilAlcdQty);
						setWarningMessage("AC00217");
					}
				}
				
				if (struct.getALC_GRP_CD().equals(struct.getALC_GRP_CD_2()) == false) {
					setWarningMessage("AC00223");
				}
				
				if (struct.getDUE_DATE() != null && struct.getDUE_DATE().equals("") == false
						&& struct.getPRD_DUE_DATE() != null && struct.getPRD_DUE_DATE().equals("") == false) {
					if (DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) < 0) {
						setWarningMessage("AC00218");
					}else if(DateTool.compareYMD(struct.getDUE_DATE(), struct.getPRD_DUE_DATE()) == 0){	
							String sDueTime = struct.getDUE_TIME();
							if(null == sDueTime || "".equals(sDueTime.trim())){
								sDueTime = "00:00";
							}
							String sPrdDueTime = struct.getPRD_DUE_TIME();
							if(null == sPrdDueTime || "".equals(sPrdDueTime.trim())){
								sPrdDueTime = "00:00";
							}
							if(sDueTime.compareTo(sPrdDueTime) < 0){
								setWarningMessage("AC00218");
							}
					}
				}
				
				int cnt = 0;
				if (msgStruct.sizeError() <= 0) {
					if (struct.getALC_TYP_2().equals("1")) {
						cnt = entity.mupdateT_JOB_ODR_ALC_2.update(conn, updateStruct);
					} else {
						cnt = entity.mupdateT_JOB_ODR_ALC.update(conn, updateStruct);
					}
					updateStruct.setOD_GNR_TYP("1");  // ���v�ʔ��������敪 1:�}�j���A���o�^
					updateStruct.setOD_NO(struct.geth_OD_NO()); // �I�[�_�f�}���h�ԍ�
					updateStruct.setPLANT_CD(sysPLANT_CD); // �H��R�[�h
					cnt = entity.mupdateT_OD.update(conn, updateStruct);
					conn.commit();
				}
			}
			controlSelect();
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
				throw new ExpjException(e);
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		
		controlSelect();
		
                //}}user_implement_dev:<controlReturn>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		
		// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
		if ( isScreenMove() == true ) {
			
			struct.setOD_NO(odNo);
			
			// �����̃R���g���[�����\�b�h���Ăяo���܂��B
			controlSelect();
		}
		
		mode = null;
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try {
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				alcTyp2Combo = comboController.getData(ALC_TYP_2);
				unitQtyTypCombo = comboController.getData(UNIT_QTY_TYP);
				odrStsTypCombo = comboController.getData(ODR_STS_TYP);
				dmStsTypCombo = comboController.getData(DM_STS_TYP);
				jobOdrStsTypCombo = comboController.getData(JOB_ODR_STS_TYP);
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("AlcUpdate") ) {
				controlAlcUpdate();
			} else if( button.equals("AlcDelete") ) {
				controlAlcDelete();
			} else if( button.equals("AlcInsert") ) {
				controlAlcInsert();
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
//			throw new FoundationException("AC0100010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0100010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0100010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0100010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0100010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0100010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0100010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0100010Entity entity;
	protected AC0100010Struct struct;
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

		entity = new AC0100010Entity();
		struct = new AC0100010Struct();

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
	 * AC0100010�N���X�̕W���R���X�g���N�^
	 */
	public AC0100010Control() throws BusinessProcessException, FoundationException
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
				AC0100010Struct key = (AC0100010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY") && key.getl_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("l_STOCK_ON_HAND_QTY", key.getl_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN") && key.getl_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_DN", key.getl_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY") && key.getl_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_RCV_QTY", key.getl_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_START_DATE") && key.getl_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_ODR_START_DATE", key.getl_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE") && key.getl_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE", key.getl_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP_DN") && key.getl_JOB_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_TYP_DN", key.getl_JOB_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP") && key.getl_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_TYP", key.getl_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALLOCATABLE_QTY") && key.getALLOCATABLE_QTY() != null) {
					msgKey.setKeyValue("ALLOCATABLE_QTY", key.getALLOCATABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALLOCATABLE_QTY") && key.getl_ALLOCATABLE_QTY() != null) {
					msgKey.setKeyValue("l_ALLOCATABLE_QTY", key.getl_ALLOCATABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ALLOCATABLE_QTY") && key.getSUM_OF_ALLOCATABLE_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ALLOCATABLE_QTY", key.getSUM_OF_ALLOCATABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_2") && key.getSTOCK_UNIT_2() != null) {
					msgKey.setKeyValue("STOCK_UNIT_2", key.getSTOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_3") && key.getSTOCK_UNIT_3() != null) {
					msgKey.setKeyValue("STOCK_UNIT_3", key.getSTOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_1") && key.getSTOCK_UNIT_1() != null) {
					msgKey.setKeyValue("STOCK_UNIT_1", key.getSTOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_4") && key.getSTOCK_UNIT_4() != null) {
					msgKey.setKeyValue("STOCK_UNIT_4", key.getSTOCK_UNIT_4());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_5") && key.getSTOCK_UNIT_5() != null) {
					msgKey.setKeyValue("STOCK_UNIT_5", key.getSTOCK_UNIT_5());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_6") && key.getSTOCK_UNIT_6() != null) {
					msgKey.setKeyValue("STOCK_UNIT_6", key.getSTOCK_UNIT_6());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_7") && key.getSTOCK_UNIT_7() != null) {
					msgKey.setKeyValue("STOCK_UNIT_7", key.getSTOCK_UNIT_7());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_8") && key.getSTOCK_UNIT_8() != null) {
					msgKey.setKeyValue("STOCK_UNIT_8", key.getSTOCK_UNIT_8());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_9") && key.getSTOCK_UNIT_9() != null) {
					msgKey.setKeyValue("STOCK_UNIT_9", key.getSTOCK_UNIT_9());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_10") && key.getSTOCK_UNIT_10() != null) {
					msgKey.setKeyValue("STOCK_UNIT_10", key.getSTOCK_UNIT_10());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_11") && key.getSTOCK_UNIT_11() != null) {
					msgKey.setKeyValue("STOCK_UNIT_11", key.getSTOCK_UNIT_11());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ALC_REMAIN_QTY") && key.getSUM_OF_ALC_REMAIN_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ALC_REMAIN_QTY", key.getSUM_OF_ALC_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO") && key.getl_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DETAIL_NO", key.getl_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_EXP_TYP") && key.getl_JOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_EXP_TYP", key.getl_JOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_TYP") && key.getl_MRP_TYP() != null) {
					msgKey.setKeyValue("l_MRP_TYP", key.getl_MRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_2") && key.getJOB_ODR_STS_TYP_2() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_2", key.getJOB_ODR_STS_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD_2") && key.getALC_GRP_CD_2() != null) {
					msgKey.setKeyValue("ALC_GRP_CD_2", key.getALC_GRP_CD_2());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_TYP_2") && key.getl_ALC_TYP_2() != null) {
					msgKey.setKeyValue("l_ALC_TYP_2", key.getl_ALC_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_TYP_2_DN") && key.getl_ALC_TYP_2_DN() != null) {
					msgKey.setKeyValue("l_ALC_TYP_2_DN", key.getl_ALC_TYP_2_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUEED_QTY") && key.getl_ISSUEED_QTY() != null) {
					msgKey.setKeyValue("l_ISSUEED_QTY", key.getl_ISSUEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_TYP_2") && key.getALC_TYP_2() != null) {
					msgKey.setKeyValue("ALC_TYP_2", key.getALC_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO_2") && key.getJOB_ODR_DETAIL_NO_2() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO_2", key.getJOB_ODR_DETAIL_NO_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO_2") && key.getJOB_ODR_CANCEL_NO_2() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO_2", key.getJOB_ODR_CANCEL_NO_2());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_REMAIN_QTY") && key.getl_ISSUE_REMAIN_QTY() != null) {
					msgKey.setKeyValue("l_ISSUE_REMAIN_QTY", key.getl_ISSUE_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_OD_NO") && key.geth_OD_NO() != null) {
					msgKey.setKeyValue("h_OD_NO", key.geth_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN") && key.getDM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("DM_STS_TYP_DN", key.getDM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN") && key.getODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DN", key.getODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ALC_TYP_2_DN") && key.getALC_TYP_2_DN() != null) {
					msgKey.setKeyValue("ALC_TYP_2_DN", key.getALC_TYP_2_DN());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN_2") && key.getJOB_ODR_STS_TYP_DN_2() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_DN_2", key.getJOB_ODR_STS_TYP_DN_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN") && key.getJOB_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_DN", key.getJOB_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DUE_TIME") && key.getDUE_TIME() != null) {
					msgKey.setKeyValue("DUE_TIME", key.getDUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME") && key.getPRD_DUE_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME", key.getPRD_DUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_TIME") && key.getODR_START_TIME() != null) {
					msgKey.setKeyValue("ODR_START_TIME", key.getODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_TIME") && key.getPRD_START_TIME() != null) {
					msgKey.setKeyValue("PRD_START_TIME", key.getPRD_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_CALC_FLG") && key.getOD_CALC_FLG() != null) {
					msgKey.setKeyValue("OD_CALC_FLG", key.getOD_CALC_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP") && key.getJOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_EXP_TYP", key.getJOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_WORK_IN_PROC_QTY") && key.getSUM_OF_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_WORK_IN_PROC_QTY", key.getSUM_OF_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_RCV_QTY") && key.getTOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("TOTAL_RCV_QTY", key.getTOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_MNT_FLG") && key.getOD_MNT_FLG() != null) {
					msgKey.setKeyValue("OD_MNT_FLG", key.getOD_MNT_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD") && key.getJOB_ODR_ALC_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_ALC_CD", key.getJOB_ODR_ALC_CD());
				}
				if(msgKeyType.containsKeyColumn("ALC_STOCK_TYP") && key.getALC_STOCK_TYP() != null) {
					msgKey.setKeyValue("ALC_STOCK_TYP", key.getALC_STOCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUEED_QTY") && key.getISSUEED_QTY() != null) {
					msgKey.setKeyValue("ISSUEED_QTY", key.getISSUEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ISSUEED_QTY") && key.getSUM_OF_ISSUEED_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ISSUEED_QTY", key.getSUM_OF_ISSUEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_REMAIN_QTY") && key.getISSUE_REMAIN_QTY() != null) {
					msgKey.setKeyValue("ISSUE_REMAIN_QTY", key.getISSUE_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP") && key.getOD_GNR_TYP() != null) {
					msgKey.setKeyValue("OD_GNR_TYP", key.getOD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ISSUED_QTY") && key.getSUM_OF_ISSUED_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ISSUED_QTY", key.getSUM_OF_ISSUED_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_STOCK_ON_HAND_QTY") && key.getSUM_OF_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_STOCK_ON_HAND_QTY", key.getSUM_OF_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OF_ALCD_QTY") && key.getSUM_OF_ALCD_QTY() != null) {
					msgKey.setKeyValue("SUM_OF_ALCD_QTY", key.getSUM_OF_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD_2") && key.getJOB_ODR_CD_2() != null) {
					msgKey.setKeyValue("JOB_ODR_CD_2", key.getJOB_ODR_CD_2());
				}
				if(msgKeyType.containsKeyColumn("SEL_OD_NO") && key.getSEL_OD_NO() != null) {
					msgKey.setKeyValue("SEL_OD_NO", key.getSEL_OD_NO());
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
					AC0100010Struct key = new AC0100010Struct();
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_ON_HAND_QTY")) {
						key.setl_STOCK_ON_HAND_QTY(msgKey.getKeyValue("l_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN")) {
						key.setl_ODR_STS_TYP_DN(msgKey.getKeyValue("l_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY")) {
						key.setl_TOTAL_RCV_QTY(msgKey.getKeyValue("l_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_START_DATE")) {
						key.setl_ODR_START_DATE(msgKey.getKeyValue("l_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE")) {
						key.setl_PRD_START_DATE(msgKey.getKeyValue("l_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP_DN")) {
						key.setl_JOB_ODR_STS_TYP_DN(msgKey.getKeyValue("l_JOB_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(msgKey.getKeyValue("l_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP")) {
						key.setl_JOB_ODR_STS_TYP(msgKey.getKeyValue("l_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALLOCATABLE_QTY")) {
						key.setALLOCATABLE_QTY(msgKey.getKeyValue("ALLOCATABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALLOCATABLE_QTY")) {
						key.setl_ALLOCATABLE_QTY(msgKey.getKeyValue("l_ALLOCATABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ALLOCATABLE_QTY")) {
						key.setSUM_OF_ALLOCATABLE_QTY(msgKey.getKeyValue("SUM_OF_ALLOCATABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_2")) {
						key.setSTOCK_UNIT_2(msgKey.getKeyValue("STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_3")) {
						key.setSTOCK_UNIT_3(msgKey.getKeyValue("STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_1")) {
						key.setSTOCK_UNIT_1(msgKey.getKeyValue("STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_4")) {
						key.setSTOCK_UNIT_4(msgKey.getKeyValue("STOCK_UNIT_4"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_5")) {
						key.setSTOCK_UNIT_5(msgKey.getKeyValue("STOCK_UNIT_5"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_6")) {
						key.setSTOCK_UNIT_6(msgKey.getKeyValue("STOCK_UNIT_6"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_7")) {
						key.setSTOCK_UNIT_7(msgKey.getKeyValue("STOCK_UNIT_7"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_8")) {
						key.setSTOCK_UNIT_8(msgKey.getKeyValue("STOCK_UNIT_8"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_9")) {
						key.setSTOCK_UNIT_9(msgKey.getKeyValue("STOCK_UNIT_9"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_10")) {
						key.setSTOCK_UNIT_10(msgKey.getKeyValue("STOCK_UNIT_10"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_11")) {
						key.setSTOCK_UNIT_11(msgKey.getKeyValue("STOCK_UNIT_11"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ALC_REMAIN_QTY")) {
						key.setSUM_OF_ALC_REMAIN_QTY(msgKey.getKeyValue("SUM_OF_ALC_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO")) {
						key.setl_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("l_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_EXP_TYP")) {
						key.setl_JOB_ODR_EXP_TYP(msgKey.getKeyValue("l_JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_TYP")) {
						key.setl_MRP_TYP(msgKey.getKeyValue("l_MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_2")) {
						key.setJOB_ODR_STS_TYP_2(msgKey.getKeyValue("JOB_ODR_STS_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD_2")) {
						key.setALC_GRP_CD_2(msgKey.getKeyValue("ALC_GRP_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_TYP_2")) {
						key.setl_ALC_TYP_2(msgKey.getKeyValue("l_ALC_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_TYP_2_DN")) {
						key.setl_ALC_TYP_2_DN(msgKey.getKeyValue("l_ALC_TYP_2_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUEED_QTY")) {
						key.setl_ISSUEED_QTY(msgKey.getKeyValue("l_ISSUEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_TYP_2")) {
						key.setALC_TYP_2(msgKey.getKeyValue("ALC_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO_2")) {
						key.setJOB_ODR_DETAIL_NO_2(msgKey.getKeyValue("JOB_ODR_DETAIL_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO_2")) {
						key.setJOB_ODR_CANCEL_NO_2(msgKey.getKeyValue("JOB_ODR_CANCEL_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_REMAIN_QTY")) {
						key.setl_ISSUE_REMAIN_QTY(msgKey.getKeyValue("l_ISSUE_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_NO")) {
						key.seth_OD_NO(msgKey.getKeyValue("h_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN")) {
						key.setDM_STS_TYP_DN(msgKey.getKeyValue("DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN")) {
						key.setODR_STS_TYP_DN(msgKey.getKeyValue("ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ALC_TYP_2_DN")) {
						key.setALC_TYP_2_DN(msgKey.getKeyValue("ALC_TYP_2_DN"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN_2")) {
						key.setJOB_ODR_STS_TYP_DN_2(msgKey.getKeyValue("JOB_ODR_STS_TYP_DN_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_DN")) {
						key.setJOB_ODR_STS_TYP_DN(msgKey.getKeyValue("JOB_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DUE_TIME")) {
						key.setDUE_TIME(msgKey.getKeyValue("DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME")) {
						key.setPRD_DUE_TIME(msgKey.getKeyValue("PRD_DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_TIME")) {
						key.setODR_START_TIME(msgKey.getKeyValue("ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_TIME")) {
						key.setPRD_START_TIME(msgKey.getKeyValue("PRD_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_CALC_FLG")) {
						key.setOD_CALC_FLG(msgKey.getKeyValue("OD_CALC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP")) {
						key.setJOB_ODR_EXP_TYP(msgKey.getKeyValue("JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_WORK_IN_PROC_QTY")) {
						key.setSUM_OF_WORK_IN_PROC_QTY(msgKey.getKeyValue("SUM_OF_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_RCV_QTY")) {
						key.setTOTAL_RCV_QTY(msgKey.getKeyValue("TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_MNT_FLG")) {
						key.setOD_MNT_FLG(msgKey.getKeyValue("OD_MNT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_ALC_CD")) {
						key.setJOB_ODR_ALC_CD(msgKey.getKeyValue("JOB_ODR_ALC_CD"));
					}
					if(msgKeyType.containsKeyColumn("ALC_STOCK_TYP")) {
						key.setALC_STOCK_TYP(msgKey.getKeyValue("ALC_STOCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUEED_QTY")) {
						key.setISSUEED_QTY(msgKey.getKeyValue("ISSUEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(msgKey.getKeyValue("ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ISSUEED_QTY")) {
						key.setSUM_OF_ISSUEED_QTY(msgKey.getKeyValue("SUM_OF_ISSUEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_REMAIN_QTY")) {
						key.setISSUE_REMAIN_QTY(msgKey.getKeyValue("ISSUE_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP")) {
						key.setOD_GNR_TYP(msgKey.getKeyValue("OD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ISSUED_QTY")) {
						key.setSUM_OF_ISSUED_QTY(msgKey.getKeyValue("SUM_OF_ISSUED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_STOCK_ON_HAND_QTY")) {
						key.setSUM_OF_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SUM_OF_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OF_ALCD_QTY")) {
						key.setSUM_OF_ALCD_QTY(msgKey.getKeyValue("SUM_OF_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD_2")) {
						key.setJOB_ODR_CD_2(msgKey.getKeyValue("JOB_ODR_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OD_NO")) {
						key.setSEL_OD_NO(msgKey.getKeyValue("SEL_OD_NO"));
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
