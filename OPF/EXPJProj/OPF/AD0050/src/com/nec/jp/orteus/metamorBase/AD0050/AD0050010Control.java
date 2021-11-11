/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0050/src/com/nec/jp/orteus/metamorBase/AD0050/AD0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0050;

import com.nec.jp.orteus.metamorBase.AD0050.*;
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
import java.text.ParseException;

import com.nec.jp.orteus.expj.flash.Kind;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc.AutoIssueParam;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0050010Control
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
	public AD0050010Struct getListvalue(int x) { return (AD0050010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0050010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0050010Struct createStruct() { return new AD0050010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0050010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//------------------------------------------------------------------------------
	
	/** [�R���{�{�b�N�X�f�[�^]���i��Ǝ��ԒP�ʋ敪�j */
	private ComboStruct _oprTimeUnitTypStruct = new ComboStruct();
	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage;
	/** �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O */
	private int _screenMoveFlg = 0;

	//�ۊǋ�ʓ��o�ɍX�V�����^�C�v 0:�o�^ 1:�X�V
	public int _issueExeType = 0;
	/*��ЃR�[�h*/
	public String _company_cd = null;
	//��Ǝ��эX�V�Ώ�Struct
	private AD0050010Struct rsltStruct = new AD0050010Struct();
	//��Ǝ��ѕۊ�Struct
	private AD0050010Struct keepRsltStruct = new AD0050010Struct();
	//�ۊǋ�ʓ��o�ɍX�V�Ώ�Struct
	private AD0050010Struct issueStruct = new AD0050010Struct();
	//�ۊǋ�ʓ��o�ɕۊ�Struct
	private AD0050010Struct issueKeepStruct = new AD0050010Struct();
	//�i�ڕʎd�|�X�V�Ώ�Struct
	private AD0050010Struct procByItemStruct = new AD0050010Struct();

	/**
	 * �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O�̎擾
	 * @return 0:ERR�Ȃ�  1:ERR����
	 */
	public int getScreenMoveFlg() {
		return _screenMoveFlg;
	}

	/**
	 * �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O�̐ݒ�
	 * @param cd �ꗗ�\�̍ő�\�������I�[�o�[���̂d�q�q�\���t���O
	 */
	public void setScreenMoveFlg(int cd) {
		_screenMoveFlg = cd;
	}

	/**
	 * Orteus�W��Struct�̒l��Ώ�Struct�ɃR�s�[���܂��B
	 * @param target �R�s�[�ΏۂƂȂ�Struct
	 */
	public void setStandardItem(AD0050010Struct target){

		target.setsUser_ID(struct.getsUser_ID());
		target.setsSysdate(struct.getsSysdate());
		target.setsOraganization_CD(struct.getsOrganization_CD());
	}

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
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 * @param value2 �u��������Q
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param list ���b�Z�[�W���X�g
	 */
	private void setErrorMessage(List list) {
		ExpjMessage emsg;
		if (list != null && !list.isEmpty() && list.size() > 0){
			for(int l = 0; l < list.size(); l++){
				emsg = new ExpjMessage((String)list.get(l));
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
			}
		}
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}

    /**
     * �G���[���b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W(List)
     */
    private void setErrorMessage(String messageno, List message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addError( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
     
     for(int i=0; i<message.size(); i++)
     {
      emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
      msgStruct.addError( emsg );
      sysLog.warning(emsg, getsysUSER_CD());
     }
    }
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
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
	 * �Ɩ����W�b�N�̃V�X�e�����O�i���[�j���O�j�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setInfoSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.info(emsg, getsysUSER_CD());
	}

	/** ���X�g���N���A���܂��B */
	private void listClear() {
		if(this.list != null && this.list.size() > 0){
			this.list.clear();
		}
	}
    /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�o�ɋ敪 */
    private final static String ISSUE_TYP_PARAMETER_NAME= "ISSUE_TYP"; 

    /** �R���{�{�b�N�X�f�[�^�擾�p�@�o�ɋ敪*/
    private ComboStruct ISSUE_TYP = null;
    
    /** �R���{�{�b�N�X�f�[�^�擾�p�萔�@��z�敪 */
    private final static String MRP_ODR_TYP_PARAMETER_NAME= "MRP_ODR_TYP"; 

    /** �R���{�{�b�N�X�f�[�^�擾�p�@��z�敪*/
    private ComboStruct MRP_ODR_TYP = null;
    

    /** �R���{�{�b�N�X�f�[�^�擾�p�@�s�Ǘ��R*/
    private ComboStruct DEFECT_CAUSE_CD = new ComboStruct();
    
    
    /** ���b�g�Ǘ������σ`�F�b�N **/
	private boolean lotCtrlFlg = false;
    
    private void othercomboTyp(AD0050010Struct aStruct) {

	 aStruct.setISSUE_TYP_DN(getDisplayName(ISSUE_TYP, aStruct.getISSUE_TYP()));
	 aStruct.setMRP_ODR_TYP_DN(getDisplayName(MRP_ODR_TYP, aStruct.getMRP_ODR_TYP()));
  
	}
	/**
	 * �R���{�{�b�N�X�f�[�^����\���������擾����
	 * @param combo �R���{�{�b�N�X�f�[�^
	 * @param value �R���{�{�b�N�X�f�[�^�̒l
	 * @return �R���{�{�b�N�X�f�[�^�̕\������
	 */
	private String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * ��Ǝ��ѕۊ�Struct�̎擾
	 * @return ��Ǝ��ѕۊ�Struct
	 */
	public AD0050010Struct getKeepRsltStruct() {
		return this.keepRsltStruct;
	}

	/**
	 * ��ʐ��l���ڂ̏����ݒ�����܂��B
	 */
	private void initializeNumber() {

		this.struct.setACPT_QTY("0.0");
		this.struct.setDEFECT_QTY("0.0");
		this.struct.setPRE_ARRANGEMENT_TIME("0.0");
		this.struct.setOPR_TIME("0.0");
		this.struct.setPOST_ARRANGEMENT_TIME("0.0");
		this.struct.setCESSATION_TIME("0.0");
		this.struct.seth_UNIT_QTY_TYP(Kind.NUMBER);//�v�ʒP��
		this.struct.setl_UNIT_QTY_TYP(Kind.NUMBER);//�v�ʒP��
	}

	/**
	 * ���C����ʍ��ڂ��N���A���܂��B(key���ڈȊO) 
	 */
	private void initializMain() {

		struct.setOUTPUT_RSLT_CD(null);
		struct.setPLANT_CD(null);
		struct.setITEM_CD(null);
		struct.setWS_CD(null);
		struct.setOPR_DATE(null);
		struct.setWH_CD(null);
		struct.setOUTPUT_RSLT_COMMENT(null);
		struct.setLOT_NO(null);
		struct.setVEND_LOT_NO(null);
		struct.setDEFECT_CAUSE_CD(null);
		struct.setOUTPUT_RSLT_PERSON(null);
		struct.setOPR_TIME_UNIT_TYP(null);
		struct.setCESSATION_CAUSE(null);
		struct.seth_RSLT_MODIFY_COUNT(null);
		struct.setITEM_NAME(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.seth_UNIT_QTY_TYP(Kind.NUMBER);
		struct.setl_UNIT_QTY_TYP(Kind.NUMBER);
		struct.setSTOCK_UNIT(null);
		struct.setWS_NAME(null);
		struct.setWH_NAME(null);
		struct.setOPR_INST_CD(null);
		struct.seth_WORK_ODR_CD(null);
		struct.setWORK_ODR_DLV_DATE(null);
		struct.setOD_NO(null);
	}

	/**
	 * ���l�^�C�v���ڂ�null�̏ꍇ�A0���Z�b�g���܂��B
	 * @throws Exception
	 */
	private void zeroSet()
			throws Exception {
		//�Ǖi����null�̏ꍇ�A0���Z�b�g
		if (this.struct.getACPT_QTY() == null 
				|| this.struct.getACPT_QTY().length() == 0) {
			this.struct.setACPT_QTY("0.0");
		}
		//�s�Ǖi����null�̏ꍇ�A0���Z�b�g
		if (this.struct.getDEFECT_QTY() == null 
				|| this.struct.getDEFECT_QTY().length() == 0) {
			this.struct.setDEFECT_QTY("0.0");
		}
		//�O�i��莞�Ԃ�null�̏ꍇ�A0���Z�b�g
		if (this.struct.getPRE_ARRANGEMENT_TIME() == null 
				|| this.struct.getPRE_ARRANGEMENT_TIME().length() == 0) {
			this.struct.setPRE_ARRANGEMENT_TIME("0.0");
		}
		//��Ǝ��Ԃ�null�̏ꍇ�A0���Z�b�g
		if (this.struct.getOPR_TIME() == null 
				|| this.struct.getOPR_TIME().length() == 0) {
			this.struct.setOPR_TIME("0.0");
		}
		//��i��莞�Ԃ�null�̏ꍇ�A0���Z�b�g
		if (this.struct.getPOST_ARRANGEMENT_TIME() == null 
				|| this.struct.getPOST_ARRANGEMENT_TIME().length() == 0) {
			this.struct.setPOST_ARRANGEMENT_TIME("0.0");
		}
		//��~���Ԃ�null�̏ꍇ�A0���Z�b�g
		if (this.struct.getCESSATION_TIME() == null 
				|| this.struct.getCESSATION_TIME().length() == 0) {
			this.struct.setCESSATION_TIME("0.0");
		}
	}


	/**
	 * �o�Ɏw�����X�g��ݒ肵�܂��B
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void setIssueList(List mainIssueList) 
			throws FoundationException, SQLException {

		BigDecimal acptQty = new BigDecimal(struct.getACPT_QTY());
		BigDecimal defectQty = new BigDecimal(struct.getDEFECT_QTY());

		//��Ɠ�(���t����.�Ɩ��^�p��)�̃Z�b�g
		this.struct.setPLANT_CD(getsysPLANT_CD());
		List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
		if (oprDateList.isEmpty()) {
			setErrorMessage("ZZ06001");
			setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
			setReadStatus(ERROR);
			return;
		}
		AD0050010Struct oprDateStruct = new AD0050010Struct();
		oprDateStruct = (AD0050010Struct)oprDateList.get(0);
		setStandardItem(oprDateStruct);
		this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());


		for (int i = 0; i < mainIssueList.size(); i++ ) {
				
			BigDecimal planSum = acptQty.add(defectQty);
			AD0050010Struct tempIssueStruct = (AD0050010Struct)mainIssueList.get(i);
			setStandardItem(tempIssueStruct);
			//�v��g�p���ʂ̎擾
			int round = Integer.parseInt(tempIssueStruct.getl_UNIT_QTY_TYP());
			BigDecimal denominator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_DENOMINATOR());
			
			BigDecimal numerator = 
					new BigDecimal(tempIssueStruct.getISSUE_INST_UNIT_NUMERATOR());
			


			//���b�g�Ǘ��ΏۊO�̏ꍇ�A���邢�͐V�K�o�^�̏ꍇ
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator,0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator,4, BigDecimal.ROUND_UP);
				}
				// ���b�g���蓖�čς݂̏ꍇ
			} else {
				// [���b�g�ʎg�p����]�̎g�p�\�萔�ʂ��v��g�p���ʂɐݒ�
				planSum = new BigDecimal(tempIssueStruct.getSUPPLIED_ISSUE_QTY());
			}
			tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());
			
			//�g�p�ϐ��ʁA�v��O�g�p�ϐ��ʁA�X�V�g�p���ʂ̎擾
			tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
			tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
			tempIssueStruct.setTEMP_USE_QTY("0.0");
			
			//��ƌv��ԍ��ɏo�������єԍ����Z�b�g
			List tempList = new ArrayList();
			AD0050010Struct tempStruct = null;
			tempStruct = new AD0050010Struct();
			setStandardItem(tempStruct);
			tempStruct.seth_WORK_ODR_CD(this.struct.getIN_OUTPUT_RSLT_CD());  
			tempStruct.setITEM_CD(tempIssueStruct.getITEM_CD());
			tempStruct.seth_ISSUE_INST_CD(tempIssueStruct.geth_ISSUE_INST_CD());

			// ���b�g�Ǘ��ΏۊO�̏ꍇ�A���邢�͐V�K�o�^�̏ꍇ
			if (tempIssueStruct.getLOT_NO() == null || tempIssueStruct.getLOT_NO().equals("")) {
				// �ۊǋ�ʓ��o�ɂ̌���
				tempList = new ArrayList();
				tempList = entity.mSelectRecvIssue.read(conn, tempStruct);
				if (tempList != null && tempList.size() != 0) {
					tempStruct = (AD0050010Struct) tempList.get(0);
					setStandardItem(tempStruct);
					BigDecimal bdIssue = new BigDecimal(tempStruct.getRCV_ISSUE_QTY());
					tempIssueStruct.setTEMP_USEOVER_QTY(bdIssue.negate().toString());
					if ("0".equals(tempStruct.getcount_RCV_ISSUE())) {
						tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
						tempIssueStruct.setTEMP_USE_QTY(planSum.toString());
					} else {
						BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
						BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
						tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
						tempIssueStruct.setTEMP_USE_QTY("0.0");
					}
				}
				// ���b�g���蓖�čς݂̏ꍇ
			} else {
				// [���b�g�ʎg�p����]�̎g�p�ϐ��ʂ��g�p�ϐ��ʂɐݒ�
				tempIssueStruct.setTEMP_USEOVER_QTY(tempIssueStruct.getTOTAL_ISSUE_QTY());

				// �v��O�g�p�ϐ��ʂɌv��g�p����-�g�p�ϐ��ʁA�X�V�g�p���ʂ�0��ݒ�
				BigDecimal useoverQty = new BigDecimal(tempIssueStruct.getTEMP_USEOVER_QTY());
				BigDecimal planoutQty = (planSum.subtract(useoverQty)).multiply(new BigDecimal(-1));
				tempIssueStruct.setTEMP_PLANOUT_QTY(planoutQty.toString());
				tempIssueStruct.setTEMP_USE_QTY("0.0");
			}

			//���חp�̕ϐ��Ƀ��b�g�ԍ��ݒ�
			tempIssueStruct.setl_LOT_NO(tempIssueStruct.getLOT_NO());
			
			tempIssueStruct.setRCV_ISSUE_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());

		}
	}


	/**
	 * �Ǎ��݌�̍��ړ��e�ƍX�V���̍��ړ��e�ɕύX�����邩�Ȃ�����r���܂��B
	 * @param rslt �X�V���̍��ړ��e
	 * @param keep �Ǎ��݌�̍��ړ��e
	 * @return true(�ύX����)/false(�ύX�Ȃ�)
	 * @throws ParseException
	 */
	private boolean CompareRsltStruct(AD0050010Struct rslt, AD0050010Struct keep) 
			throws ParseException {

		BigDecimal rsltACPT_QTY = new BigDecimal(rslt.getACPT_QTY());
		BigDecimal keepACPT_QTY = new BigDecimal(keep.getACPT_QTY());

		BigDecimal rsltDEFECT_QTY = new BigDecimal(rslt.getDEFECT_QTY());
		BigDecimal keepDEFECT_QTY = new BigDecimal(keep.getDEFECT_QTY());

		Date rsltOPR_DATE = Converter.strToDate(rslt.getOPR_DATE(),Converter.SLASH_DATE);
		Date keepOPR_DATE = Converter.strToDate(keep.getOPR_DATE(),Converter.SLASH_DATE);
		if ((rsltACPT_QTY.compareTo(keepACPT_QTY) != 0) 
				|| (rsltDEFECT_QTY.compareTo(keepDEFECT_QTY) != 0) 
				|| (rsltOPR_DATE.compareTo(keepOPR_DATE) != 0) 
				|| ((rslt.getWH_CD() != null && !rslt.getWH_CD().equals(keep.getWH_CD())) 
				|| (rslt.getWH_CD() == null && keep.getWH_CD() != null) 
				|| (rslt.getWH_CD() != null && keep.getWH_CD() == null)) 
				|| ((rslt.getWS_CD() != null && !rslt.getWS_CD().equals(keep.getWS_CD())) 
				|| (rslt.getWS_CD() == null && keep.getWS_CD() != null) 
				|| (rslt.getWS_CD() != null && keep.getWS_CD() == null))
				|| ((rslt.getLOT_NO() != null && !rslt.getLOT_NO().equals(keep.getLOT_NO())) 
				|| (rslt.getLOT_NO() == null && keep.getLOT_NO() != null) 
				|| (rslt.getLOT_NO() != null && keep.getLOT_NO() == null))) {
			return false;
		}
		return true;
	}

	/**
	 * �����o�ɂ��Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws SQLException
	 * @throws Exception
	 */
	private void callCommonIssue( String sFLG ) 
			throws SQLException, Exception {

		//�����o�ɌĂяo��
		BigDecimal bdQty = new BigDecimal("0");
		if (this.rsltStruct.getACPT_QTY()!=null) {
			bdQty = new BigDecimal(this.rsltStruct.getACPT_QTY());
		}
		if (this.rsltStruct.getDEFECT_QTY()!=null) {
			bdQty = bdQty.add(new BigDecimal(this.rsltStruct.getDEFECT_QTY()));
		}
		if (this.rsltStruct.getOPR_CRCT_NO() == null 
				|| this.rsltStruct.getOPR_CRCT_NO().length() == 0) {
			this.rsltStruct.setOPR_CRCT_NO("0");
		}
		
		/********************
		 * �����o�ɏ����J�n *
		 *******************/
		WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
				this.sysPLANT_CD,
				this.sysUSER_CD,
				this.sp.getProcId());
		WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
		
		// �p�����[�^�̃Z�b�g
		autoIssueParam.m_WORK_ODR_CD = procByItemStruct.geth_WORK_ODR_CD();
		autoIssueParam.m_WORK_IN_PROC_CD = "";
		autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(this.rsltStruct.getPARTIAL_PRD_NO());
		autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(this.rsltStruct.getOPR_CRCT_NO());
		autoIssueParam.m_PUCH_ODR_CD = "";
		autoIssueParam.m_ACPT_NO = 0;
		autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
		autoIssueParam.m_RCV_ISSUE_TYP = 2;
		autoIssueParam.m_RCV_ISSUE_DATE = this.rsltStruct.getOPR_DATE();
		autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
		autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
		autoIssueParam.m_PLANT_CD = this.sysPLANT_CD;
		
		AutoIssue autoIssue = new AutoIssue(conn,
				this.sysPLANT_CD,this.sysUSER_CD,this.sp.getProcId());
		
		// �����o�Ɏ��s
		boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

		String[] message;
		if(result){
			// �Ɩ��A���[��������Ώo�͂���B
			for(int i=0; i<autoIssue.getWarnList().size(); i++){
				message = (String[])autoIssue.getWarnList().get(i);
				setWarningMessage(message[0], message[1]);
			}
		}else{
			// �Ɩ��G���[�̏o��
			for(int i=0; i<autoIssue.getErrorList().size(); i++){
				message = (String[])autoIssue.getErrorList().get(i);
				setErrorMessage(message[0], message[1]);
			}
			return;
		}
	}

	/**
	 * ���ɏ������Ăяo���܂��B
	 * @param sFLG ��Ɗ����t���O(0:��Ɩ����� 1:��Ɗ���)
	 * @throws Exception
	 */
	private void callRcvCancel( String sFLG ) 
			throws Exception {

		//���o�ɊǗ��ԍ��̔�
		CollectNumber collectNum = 
				new CollectNumber(
					CollectNumber.ISSUE_CD,
					this.sysUSER_CD,
					this.sp.getProcId(),
					this.sysPLANT_CD);
		String no = collectNum.getNo();
		if (no == null || no.length() == 0) {
			//�̔Ԍ��ʂ��Ȃ�
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
			return;
		}
		AD0050010Struct rcvIssueStruct = new AD0050010Struct();
		setStandardItem(rcvIssueStruct);

		rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);				//���o�ɊǗ��ԍ�
		rcvIssueStruct.setRCV_ISSUE_TYP("1");					//���o�ɋ敪
		rcvIssueStruct.setITEM_CD(this.rsltStruct.getITEM_CD());//�i�ڔԍ�
		rcvIssueStruct.setPLANT_CD(this.sysPLANT_CD);			//�H��R�[�h
		rcvIssueStruct.setWH_CD(this.rsltStruct.getWH_CD());	//�ۊǋ�R�[�h
		rcvIssueStruct.setJOB_ODR_CD(null);					//����
		rcvIssueStruct.setJOB_ODR_DETAIL_NO("0");				//���Ԏ}��
		rcvIssueStruct.setPUCH_ODR_CD(null);					//�����ԍ�
		rcvIssueStruct.setACPT_NO("0");							//�����
		rcvIssueStruct.setACPT_RSLT_CRCT_NO("0");				//������ђ�����
		rcvIssueStruct.setINSPEC_RSLT_CRCT_NO("0");				//�������ђ�����

		rcvIssueStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD()); //��ƌv��ԍ�
		rcvIssueStruct.setWORK_IN_PROC_CD(null);							  //�d�|��ƃR�[�h
		rcvIssueStruct.setPARTIAL_PRD_NO(this.rsltStruct.getPARTIAL_PRD_NO());//�����
		rcvIssueStruct.setOPR_RSLT_CRCT_NO(this.rsltStruct.getOPR_CRCT_NO());//��Ǝ��ђ�����
		rcvIssueStruct.seth_ISSUE_INST_CD(null);							  //�o�Ɏw���ԍ�
		rcvIssueStruct.setRCV_ISSUE_QTY(this.rsltStruct.getACPT_QTY());	  //���o�ɐ�
		rcvIssueStruct.setRCV_ISSUE_AMOUNT("0");							  //���o�ɋ��z
		rcvIssueStruct.setRCV_ISSUE_DATE(this.rsltStruct.getOPR_DATE());	  //���o�ɔN����
		rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");							  //���o�ɔ����敪
		rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0");				//���o�ɒ[��
		rcvIssueStruct.setDEFECT_CAUSE_CD(null);				//���o�ɕs�Ǘ��R�R�[�h
		rcvIssueStruct.setSTOCK_UPD_TYP("1");					//�݌ɍX�V�敪
		rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG(sFLG);			//���o�Ɋ����t���O

		rcvIssueStruct.setOD_NO(procByItemStruct.getOD_NO());	//�I�[�_�f�}���h�ԍ�
		rcvIssueStruct.setLOT_NO(this.rsltStruct.getLOT_NO());	//�݌Ƀ��b�g�ԍ�
		rcvIssueStruct.setVEND_LOT_NO(null);					//���[�J���b�g�ԍ�
		rcvIssueStruct.setRCV_ISSUE_COMMENT(null);				//���o�ɔ��l
		rcvIssueStruct.setCONS_TYP("0");						//�x���敪

		// �ޔ�p�莝���݌ɐ���������
		rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");


		//���ɏ���
		RcvCancel RCan = 
				new RcvCancel(conn,rcvIssueStruct.getRCV_ISSUE_CTRL_CD(),this.sysUSER_CD);
		//��ЃR�[�h
		rcvIssueStruct.setCOMPANY_CD(_company_cd);
		
        //�ۊǋ�ʓ��o�ɓo�^
		entity.mInsertRecvIssue.create(conn, rcvIssueStruct);
		boolean bRSLT = RCan.execProcess();
        
		if (!bRSLT) {
			//���ɏ������s
			//throw new Exception();
			setErrorMessage(RCan.getErrorList());
			conn.rollback();
		}
	}	

	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AD0050010Struct sysParameterStruct = (AD0050010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPAST_RESULT_ENTRY_TYP() && !"".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
				if("false".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
					b = false;
				}
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return b;
	}
	/**
	 * ���ی����Ǘ��p�����[�^�̑Ώ۔N�����擾
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AD0050010Struct procExecDateStruct = (AD0050010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	
  // ���ی����̒��߂��������Ă�����t�ł͓��͂ł��܂���
	private String ProcExecDateError = "AE00160";
	
	/**
	 * �Ώ۔N�����Ɠ��͔N�����̔�r
	 * ���ی����̒��߂��������Ă�����t�ł̎��т̓o�^��s�Ƃ���
	 * ���ی����̒��߂��������Ă�����t���̎��я��̏C����s�Ƃ���
	 * @param  doType      �o�^�i'1'�j�܂��X�V�i'2'�j�܂��폜�i'3'�j
	 * @param  selOutDate  �X�V�O���͔N����
	 * @param  inputDate �@�X�V����͔N����
	 * @return boolean �@  �`�F�b�N�Ԃ��l
	 */
	private boolean chkProcExecDate(String doType,String selOutDate,String inputDate) throws BusinessProcessException, FoundationException {
		boolean b = true;
		
		// ���ی����Ǘ��p�����[�^�̑Ώ۔N����
		BigDecimal ProcExecDate = getProcExecDate();
		if(null == ProcExecDate) return b;
		ProcExecDateError = "AE00160";
		
		// �o�^�̏ꍇ
		if("1".equals(doType)){
			// ��ʓ��͔N����
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			b = compDecimal(input,ProcExecDate);
			
		}
		// �X�V�̏ꍇ
		if("2".equals(doType)){
			
			// �X�V�O���͔N����
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// �X�V����͔N����
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			// �Ǎ��񂾎��я��̓��t�̔�r
			b = compDecimal(selOut,ProcExecDate);
			if(b == false){
				// ���ی����̒��߂��������Ă�����t���̎��я��͏C���ł��܂���
				ProcExecDateError = "AE00161";
				return b;
			}
			// ���͂̓��t�̔�r
			b = compDecimal(input,ProcExecDate);
			
		}
		// �폜�̏ꍇ
		if("3".equals(doType)){
			// �X�V�O���͔N����
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// �Ǎ��񂾎��я��̓��t�̔�r
			b = compDecimal(selOut,ProcExecDate);
			// ���ی����̒��߂��������Ă�����t���̎��я��͏C���ł��܂���
			ProcExecDateError = "AE00161";
			
		}
		
		return b;
	}
	
	/**
	 * ��r
	 * @param  bd1      ���͈���1
	 * @param  bd2 �@   ���͈���2
	 * @return boolean  �`�F�b�N�Ԃ��l
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
		}
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

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			//��ʏ����ݒ�
			initializMain();
			initializeNumber();
			listClear();

			
			//�o�������ь���
			List selectList = entity.mSelect.read(conn, struct);
			if (selectList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}

			AD0050010Struct selectStruct = new AD0050010Struct();
			selectStruct = (AD0050010Struct)selectList.get(0);
			setStandardItem(selectStruct);
			selectStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());
									
			if (!this.sysPLANT_CD.equals(selectStruct.getPLANT_CD())) {
				setErrorMessage("AD00022");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
				setReadStatus(ERROR);
				setScreenMoveFlg(1);
				return;
			}


			this.struct.setStructM(selectStruct);
			this.keepRsltStruct.setStructM(this.struct);
			int maxLine = sp.getMaxLine(conn,10);//�q�i�ڕ\������
			if(maxLine != 0) {
				selectStruct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				selectStruct.setROW_COUNT(null);
			}
			this.list = entity.mSelectIssueCnt.read(conn, selectStruct);
			long rowCount = Long.parseLong(((AD0050010Struct)list.get(0)).getl_COUNT());
			if (maxLine != 0 && rowCount ==maxLine+1) {
				if(list != null && list.size() > 0){
					this.listClear();
				}
				setErrorMessage("AD00065",""+maxLine);
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
				setReadStatus(TOO_MANY);
				setScreenMoveFlg(1);
			} else {
			
				//�o�Ɏw�����X�g�擾
				this.list = entity.mSelectIssue.read(conn, selectStruct);
				AD0050010Struct TempStruct;
            	for (int i = 0; i < list.size(); i++) {
		    		TempStruct = (AD0050010Struct)list.get(i);

				    //�R���{�{�b�N�X�̎擾
				    othercomboTyp(TempStruct);
		    	}
				setIssueList(this.list);
				setReadStatus(NORMAL);
			}
			// ��Ɠ�
			struct.seth_OPR_DATE(struct.getOPR_DATE());
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert10() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert10");
			//{{user_implement_dev:<controlInsert10>


		try {
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getOPR_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			//���l�^�C�v���ڂ�NULL�̏ꍇZERO���Z�b�g����
			zeroSet();

			AD0050010Struct insertStruct = new AD0050010Struct();
			insertStruct.setStructM(this.struct);
			setStandardItem(insertStruct);

			AD0050010Struct tempStruct = new AD0050010Struct();
			String unitQtyTyp = null;
			
			//�i�ڔԍ����݃`�F�b�N�����݂��Ȃ���΃G���[
			List tempList = new ArrayList();			
			tempList = entity.mSelectItem.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00019");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());//�i��.�i�ڔԍ�
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				// �i�ږ��A�}�ʔԍ��A�K�i�A�P�ʃZ�b�g�A���b�g�ԍ��̔ԋ敪�A���b�g�Ǘ��t���O
				insertStruct.setITEM_NAME(tempStruct.getITEM_NAME());
				insertStruct.setDRAW_CD(tempStruct.getDRAW_CD());
				insertStruct.setSPEC(tempStruct.getSPEC());
				insertStruct.setSTOCK_UNIT(tempStruct.getSTOCK_UNIT());
				insertStruct.setLOT_NUMBERING_TYP(tempStruct.getLOT_NUMBERING_TYP());
				insertStruct.setLOT_CTRL_FLG(tempStruct.getLOT_CTRL_FLG());

				unitQtyTyp = tempStruct.geth_UNIT_QTY_TYP() ;  //�݌ɐ��P�ʋ敪�Z�b�g����
				
			}
			
							
			//��Ƌ�R�[�h���݃`�F�b�N�����݂��Ȃ���΃G���[
			tempList = new ArrayList();
			tempList = entity.mSelectChkWsCd.read(conn,this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD20029");
				setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//��Ƌ�.��Ƌ�R�[�h
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				//��Ƌ�R�[�h�̍H��R�[�h�ƃ��O�C�����[�U�̍H��R�[�h�`�F�b�N���s��v�̓G���[
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00004");
					setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//��Ƌ�.��Ƌ�R�[�h
				}
				//��Ƌ於�Z�b�g
				insertStruct.setWS_NAME(tempStruct.getWS_NAME());
			}
			
			
				
			//�ۊǋ�R�[�h���݃`�F�b�N�����݂��Ȃ���΃G���[
			tempList = new ArrayList();
			tempList = entity.mSelectChkWhCd.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00020");
				setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);

				//�ۊǋ�R�[�h�̍H��R�[�h�ƃ��O�C�����[�U�̍H��R�[�h�`�F�b�N���s��v�̓G���[
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
				}
			
				//�ۊǋ於�Z�b�g
				insertStruct.setWH_NAME(tempStruct.getWH_NAME());
			}
			
			
			//�i�ڕʎd�|���݃`�F�b�N���ȉ��̏����̃f�[�^�����݂��Ȃ��ꍇ�̓G���[
			//�i�ڔԍ�����ʂ̕i�ڔԍ��A��Ǝ��ы敪���P�A��Ə�ԋ敪���Q�A
			//�H��R�[�h�����[�U�̏�������H��R�[�h
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			tempList = new ArrayList();
			tempList = entity.mSelectChkProcByItem.read(conn, this.struct);
			
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", this.struct.getITEM_CD());//�i�ڕʎd�|.�i�ڔԍ�
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", this.struct.getPLANT_CD());//�i�ڕʎd�|.�H��R�[�h
			}

			// ���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
			if("1".equals(insertStruct.getLOT_CTRL_FLG())){
				BigDecimal acptQty = new BigDecimal(insertStruct.getACPT_QTY());

				//�Ǖi�� > 0�̏ꍇ
				if (acptQty.doubleValue() > 0){
					//���b�g�ԍ��̔ԋ敪 = 0(�����̔Ԃ��Ȃ�)�̏ꍇ
					if(insertStruct.getLOT_NUMBERING_TYP().equals("0")){
						//�݌Ƀ��b�g�ԍ��������͂̏ꍇ
						if (insertStruct.getLOT_NO() == null || insertStruct.getLOT_NO().equals("")){
							setErrorMessage("AE20600");
							setWarningSysLogMessage("M_ITEM.ITEM_CD", insertStruct.getITEM_CD());//�i��.�i�ڔԍ�
						} else {
							//���b�g�Ǘ�����
							tempList = entity.mT_LOT_CTRL.read(conn,insertStruct);

							//[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", insertStruct.getLOT_NO());
							}
						}
					//���b�g�ԍ��̔ԋ敪 = 0(�����̔Ԃ��Ȃ�)�łȂ��ꍇ
					}else{
						//���b�g�ԍ���null�̏ꍇ
						if (this.struct.getLOT_NO() == null || "".equals(this.struct.getLOT_NO())) {
							// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List retList = bc.getsetLotNumberingFd(insertStruct.getITEM_CD(), insertStruct.getOPR_DATE());

							//����I���̏ꍇ
							if(bc.getResultStatus().intValue() == 1){
								//�݌Ƀ��b�g�ԍ��̎擾
								if(retList != null && retList.size() > 0){
									String result1 = (String)retList.get(0);
									insertStruct.setLOT_NO(result1);
								}
								//�x�� or �ُ�I���̏ꍇ
							}else{
								//�G���[���b�Z�[�W�̎擾
								if(retList != null && retList.size() > 1){
									String result2 = (String)retList.get(1);
									setErrorMessage(result2);
								}
							}
							//�X�V�O�̃��b�g�ԍ���null�łȂ��ꍇ
						} else {
							//���b�g�Ǘ�����
							tempList = entity.mT_LOT_CTRL.read(conn,this.struct);
							//[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
							}
						}
					}
				}
			// ���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�łȂ��ꍇ
			} else {
				//�݌Ƀ��b�g�ԍ������͂���Ă���ꍇ
				if (insertStruct.getLOT_NO() != null && !insertStruct.getLOT_NO().equals("")){
					setErrorMessage("AE20601");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", insertStruct.getITEM_CD());//�i��.�i�ڔԍ�
				}
			}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}


			BigDecimal inAcptQty	= new BigDecimal(this.struct.getACPT_QTY());
			BigDecimal inAcptQty2   = new BigDecimal("0");
			BigDecimal inDefectQty  = new BigDecimal(this.struct.getDEFECT_QTY());
			BigDecimal inDefectQty2 = new BigDecimal("0");
			
			if (unitQtyTyp != null && "1".equals(unitQtyTyp)) {
				inAcptQty2 = inAcptQty.setScale(0,BigDecimal.ROUND_DOWN);
				inDefectQty2 = inDefectQty.setScale(0,BigDecimal.ROUND_DOWN);
				//�؂艺�������O�ƌ�Œl���قȂ��Ă����珬�������͂���Ă����Ɣ��f�����[�j���O�Ƃ���
				if ( (inAcptQty.doubleValue() != inAcptQty2.doubleValue())
						|| (inDefectQty.doubleValue() != inDefectQty2.doubleValue() )) {
					//�i�ڂ������Ǘ��i�̏ꍇ�ŏ��������͂��ꂽ�ꍇ���[�j���O
					setWarningMessage("AD00087");
					setInfoSysLogMessage("ITEM_CD", this.struct.getITEM_CD());//�i�ڔԍ�		
					setInfoSysLogMessage("ACPT_QTY", inAcptQty.toString());//�Ǖi��			
					setInfoSysLogMessage("DEFECT_QTY", inDefectQty.toString());//�s�ǐ�			

					insertStruct.setACPT_QTY(inAcptQty2.toString());
					insertStruct.setDEFECT_QTY(inDefectQty2.toString());
				}
			}
			
			//�o�������єԍ��̎����̔�
			CollectNumber collectNum = 
					new CollectNumber(CollectNumber.OUT_RSLT_CD,
						this.sysUSER_CD,
						this.sp.getProcId(),
						this.sysPLANT_CD);
			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԍ��ʂ��Ȃ�
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
				return;
			}
			insertStruct.setOUTPUT_RSLT_CD(no);
			
			//�o�������т̓o�^
			entity.mInsertOutputRslt.create(conn, insertStruct);
			this.struct.setStructM(insertStruct);


			//���ьv�㏈��
			tempList = new ArrayList();
			tempList = entity.mSelectTargetProcByItem.read(conn, this.struct);
			//�Ώۃf�[�^�����݂��Ȃ��ꍇ
			if (tempList.isEmpty()) {
			
				//�Œx�[���̊����ςݕi�ڕʎd�|�ɑS�����v�シ��B
				List temp2List = entity.mSelectCompleteProcByItem.read(conn,this.struct);
				if (temp2List.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", this.struct.getITEM_CD());//�i�ڕʎd�|.�i�ڔԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", this.struct.getPLANT_CD());//�i�ڕʎd�|.�H��R�[�h
					setReadStatus(ERROR);
					struct.setLOT_NO(null);
					return;
				}
				//�i�ڕʎd�|���Z�b�g����
				procByItemStruct = new AD0050010Struct();
				procByItemStruct = (AD0050010Struct)temp2List.get(0);
				setStandardItem(procByItemStruct);
				
				this.rsltStruct = new AD0050010Struct();
				setStandardItem(this.rsltStruct);
				this.rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD()); //��Ǝw���ԍ�

				//�ő啪��񐔁{�P�̃Z�b�g
				List temp3List = entity.mSelectMaxPrdNo.read(conn, this.rsltStruct);

				//�������ʂ͕K������
				AD0050010Struct temp3Struct = (AD0050010Struct)temp3List.get(0);
				setStandardItem(temp3Struct);
				this.rsltStruct.setPARTIAL_PRD_NO(temp3Struct.getPARTIAL_PRD_NO());//�����
				this.rsltStruct.setITEM_CD(this.struct.getITEM_CD());	//�i�ڔԍ�
				this.rsltStruct.setWS_CD(this.struct.getWS_CD());		//��Ƌ�R�[�h
				this.rsltStruct.setACPT_QTY(this.struct.getACPT_QTY());//�Ǖi��
				this.rsltStruct.setDEFECT_QTY(this.struct.getDEFECT_QTY());//�s�ǐ�
				this.rsltStruct.setOPR_DATE(this.struct.getOPR_DATE());//��Ɠ�
				this.rsltStruct.setWH_CD(this.struct.getWH_CD());		//�ۊǋ�R�[�h
				this.rsltStruct.setOPR_RSLT_PERSON(null);				//��Ǝ�
				this.rsltStruct.setOPR_RSLT_COMMENT(null);			//��Ɣ��l
				this.rsltStruct.setOPR_TIME_UNIT_TYP("1");				//��Ǝ��ԒP�ʋ敪
				this.rsltStruct.setPRE_ARRANGEMENT_TIME("0");			//�O�i�掞��
				this.rsltStruct.setPOST_ARRANGEMENT_TIME("0");			//��i�掞��
				this.rsltStruct.setOPR_TIME("0");						//��Ǝ���
				this.rsltStruct.setCESSATION_TIME("0");				//��~����
				this.rsltStruct.setCESSATION_CAUSE(null);				//��~���R
				this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());//�o�������єԍ�
				this.rsltStruct.setPLANT_CD(this.struct.getPLANT_CD());//�H��R�[�h
				this.rsltStruct.setLOT_NO(insertStruct.getLOT_NO());//�݌Ƀ��b�g�ԍ�
				this.rsltStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());//���[�J���b�g�ԍ�
				this.rsltStruct.setOPR_CRCT_NO("0");					//��ƒ�����
			
				//��Ǝ��т̓o�^
				entity.mInsertOprRslt.create(conn, this.rsltStruct);
			
				AD0050010Struct completeStruct = new AD0050010Struct();
				setStandardItem(completeStruct);
				completeStruct.setWORK_STS_TYP("9");
				completeStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD());
				completeStruct.setOPR_INST_CD(this.rsltStruct.getOPR_INST_CD());

				//����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
				List oprRsltList = entity.mT_OPR_RSLT.read(conn, completeStruct);
				if (oprRsltList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
					struct.setLOT_NO(null);
					return;
				}
				tempStruct = (AD0050010Struct)oprRsltList.get(0);
				completeStruct.setWORK_CMPLT_DATE(tempStruct.getOPR_DATE());

				entity.mUpdateProcByItem.update(conn, completeStruct);

				//���ʕ��i�̎����o�ɏ���
				String sFLG = "1";	//��Ɗ���
				this.callCommonIssue(sFLG);
				//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
				this.callRcvCancel(sFLG);
			
			} else {
				//��ʂ̗Ǖi��
				BigDecimal AcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//���ьv�オ�K�v�ȗǕi�̎c��
				BigDecimal TempAcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//��ʂ̕s�ǐ�
				BigDecimal DefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//���ьv�オ�K�v�ȕs�ǂ̎c��
				BigDecimal TempDefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//��ʂ̗Ǖi���{�s�ǐ�
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty) ;
				//���ьv��Ώۂ̕i�ڕʎd�|�̍�Ǝw����
				BigDecimal TargetOprInstQty  = new BigDecimal("0");
				//���ьv��Ώۂ̕i�ڕʎd�|�̍�Ǝw���ԍ�������Ǝ��т�SUM(�Ǖi��+�s�ǐ�)
				BigDecimal SumOprRsltQty	 = new BigDecimal("0");	
				//���ьv��Ώۂ̕i�ڕʎd�|�Ɏ��ьv��ł���c��
				BigDecimal TempOprInstQty	= new BigDecimal("0");
				//���ьv�オ�K�v�ȗǕi�c���{�s�ǎc��
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");
			
				int i=0 ;
				int ExitFlg=0 ;		 //while�����o���t���OOFF
				int CompleteFlg=0 ;	 //�i�ڕʎd�|�����t���OOFF
			
			
				while ( i < tempList.size() && ExitFlg == 0 ) {
			
					//�Ώەi�ڕʎd�|���Z�b�g
					procByItemStruct = (AD0050010Struct)tempList.get(i);
					setStandardItem(procByItemStruct);
			
					//�Ώۃ��R�[�h�̍�Ǝw�������Z�b�g
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
			
					//�Ώەi�ڕʎd�|�̍�Ǝw���ԍ��Ɠ���̍�Ǝ��т�SUM(�Ǖi���{�s�ǐ�)�擾
					List temp3List = entity.mSelectSumOprRsltQty.read(conn, procByItemStruct);
					if (temp3List.isEmpty()) {
						//��Ǝ��т��������߁ASUM(�Ǖi��+�s�ǐ�)��ZERO�Ƃ���
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//�i�ڕʎd�|���Z�b�g����
						tempStruct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(tempStruct);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}
			
					// 20070611 NES KOIZUMI ADD START
					// ��Ǝw���������ѐ����傫���ꍇ�̂ݎc�w�����v�Z���s���B
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
					//��Ǝw����-SUM(�Ǖi��+�s�ǐ�)
					TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty );
					};
					// 20070611 NES KOIZUMI ADD END
					
                    //�@���ьv�オ�K�v�Ȑ����Z�o
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);
			
					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//��Ǝw���c���������ьv�オ�K�v�Ȑ��̏ꍇ�F�i�ڕʎd�|����
			
							if ( i + 1 == tempList.size() ) {
								//�i�ڕʎd�|�Ō��1���ł���Ύc����S�Čv�シ��
								this.rsltStruct.setACPT_QTY(TempAcptQty.toString());	//�Ǖi��
								this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//�s�ǐ�
								TempAcptQty	= new BigDecimal("0");		//�Ǖi�c��ZERO
								TempDefectQty  = new BigDecimal("0");	//�s�ǎc��ZERO
								TempOprInstQty = new BigDecimal("0");	//���юc��ZERO
								CompleteFlg = 1 ;						//�i�ڕʎd�|�����t���OON
							} else {
								//����ȊO�͕i�ڕʎd�|�Ɍv��ł��镪�����v�シ��
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {
			
									this.rsltStruct.setACPT_QTY(
											TempOprInstQty.toString());		//�Ǖi��
									this.rsltStruct.setDEFECT_QTY("0.0");	//�s�ǐ�
									TempAcptQty = 
											TempAcptQty.subtract(TempOprInstQty);//�Ǖi�c��
									CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
								} else {
									//�s�ǂ��g��
									if ( TempAcptQty.doubleValue() > 0 ) {
										//�Ǖi�{�s�ǐ��ŏ�������
										this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
									} else {
									//�s�ǐ������ŏ�������
										this.rsltStruct.setACPT_QTY("0.0");
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										// 20150403 NES CHOEN ADD STR
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
										// 20150403 NES CHOEN ADD STR
									}
								}
							}
						} else {
							//�i�ڕʎd�|���������̏ꍇ
			
							this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
							this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//�Ǖi�c��ZERO
							TempDefectQty = new BigDecimal("0");	//�s�ǎc��ZERO
							ExitFlg=1;  //while�����o���t���OON
						}
			
						//��Ǝ��т̓o�^����
						setStandardItem(rsltStruct);
						this.rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());//��Ǝw���ԍ�

						//�ő啪��񐔁{�P�̃Z�b�g
						temp3List = entity.mSelectMaxPrdNo.read(conn, this.rsltStruct);

						//�������ʂ͕K������
						AD0050010Struct temp3Struct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(temp3Struct);

						this.rsltStruct.setPARTIAL_PRD_NO(temp3Struct.getPARTIAL_PRD_NO());//�����
						this.rsltStruct.setITEM_CD(this.struct.getITEM_CD());//�i�ڔԍ�
						this.rsltStruct.setWS_CD(this.struct.getWS_CD());	//��Ƌ�R�[�h
						this.rsltStruct.setOPR_DATE(this.struct.getOPR_DATE());//��Ɠ�
						this.rsltStruct.setWH_CD(this.struct.getWH_CD());	//�ۊǋ�R�[�h
						this.rsltStruct.setOPR_RSLT_PERSON(null);			//��Ǝ�
						this.rsltStruct.setOPR_RSLT_COMMENT(null);		//��Ɣ��l
						this.rsltStruct.setOPR_TIME_UNIT_TYP("1");			//��Ǝ��ԒP�ʋ敪
						this.rsltStruct.setPRE_ARRANGEMENT_TIME("0");		//�O�i�掞��
						this.rsltStruct.setPOST_ARRANGEMENT_TIME("0");		//��i�掞��
						this.rsltStruct.setOPR_TIME("0");					//��Ǝ���
						this.rsltStruct.setCESSATION_TIME("0");			//��~����
						this.rsltStruct.setCESSATION_CAUSE(null);			//��~���R
						this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());//�o�������єԍ�
						this.rsltStruct.setPLANT_CD(this.struct.getPLANT_CD());//�H��R�[�h
						this.rsltStruct.setLOT_NO(this.struct.getLOT_NO());//�݌Ƀ��b�g�ԍ�
						this.rsltStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());//���[�J���b�g�ԍ�
						this.rsltStruct.setOPR_CRCT_NO("0");				//��ƒ�����
			
						//��Ǝ��т̓o�^
						entity.mInsertOprRslt.create(conn, this.rsltStruct);
						String sFLG = "0";	//�����l�Z�b�g�i��Ɩ������j
						//��Ǝw�������̎��т��v�コ��Ă���Εi�ڕʎd�|���X�V����
						if ( CompleteFlg == 1 ) {
							AD0050010Struct completeStruct = new AD0050010Struct();
							setStandardItem(completeStruct);
							completeStruct.setWORK_STS_TYP("9");
							completeStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD());
							completeStruct.setOPR_INST_CD(this.rsltStruct.getOPR_INST_CD());

							//����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
							List oprRsltList = entity.mT_OPR_RSLT.read(conn, completeStruct);
							if (oprRsltList.isEmpty()) {
								setErrorMessage("ZZ01101");
								setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
								struct.setLOT_NO(null);
								return;
							}
							tempStruct = (AD0050010Struct)oprRsltList.get(0);
							completeStruct.setWORK_CMPLT_DATE(tempStruct.getOPR_DATE());

							entity.mUpdateProcByItem.update(conn, completeStruct);
							sFLG = "1";	//��Ɗ���
						}	
			
						//���ʕ��i�̎����o�ɏ���
						this.callCommonIssue(sFLG);
						//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
						this.callRcvCancel(sFLG);
						CompleteFlg=0 ;	 //�i�ڕʎd�|�����t���O�ēxOFF
						i = i + 1 ;
					} else {
					//���ьv�オ�K�v�Ȑ����O�ȉ��Ȃ̂Ŏ��ьv��͍s��Ȃ�
			
						ExitFlg=1;  //while�����o���t���OON
					}
				}
			}

			if (msgStruct.hasError()) {
				struct.setLOT_NO(null);
				return;
			}
			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
			if(insertStruct.getLOT_CTRL_FLG().equals("1")){
				//�݌Ƀ��b�g�ԍ���Null�łȂ��ꍇ
				if(insertStruct.getLOT_NO() != null && !insertStruct.getLOT_NO().equals("")){
					//���b�g�Ǘ��e�[�u���X�V
					entity.mT_LOT_CTRL.update(conn,insertStruct);
				}
			}
			conn.commit();

			this.struct.setIN_OUTPUT_RSLT_CD(no);
				
			//�Č���
			controlSelect();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlInsert10>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert10");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate10() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate10");
			//{{user_implement_dev:<controlUpdate10>


		try {
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("2",struct.geth_OPR_DATE(),struct.getOPR_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			//���l�^�C�v���ڂ�NULL�̏ꍇZERO���Z�b�g����
			zeroSet();
			
			if (this.struct.getOUTPUT_RSLT_CD() != null 
					&& !this.struct.getOUTPUT_RSLT_CD().equals(
						this.struct.getIN_OUTPUT_RSLT_CD())) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//�o��������.�������o�������єԍ�
				setWarningSysLogMessage("IN_OUTPUT_RSLT_CD", this.struct.getIN_OUTPUT_RSLT_CD());//�X�V���o�������єԍ�
				return;
			}
			
			AD0050010Struct tempStruct = new AD0050010Struct();
			//��Ƌ�R�[�h���݃`�F�b�N�����݂��Ȃ���΃G���[
			List tempList = entity.mSelectChkWsCd.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD20029");
				setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//��Ƌ�.��Ƌ�R�[�h
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				//��Ƌ�R�[�h�̍H��R�[�h�ƃ��O�C�����[�U�̍H��R�[�h�`�F�b�N���s��v�̓G���[
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00004");
					setWarningSysLogMessage("M_WS.WS_CD", this.struct.getWS_CD());//��Ƌ�.��Ƌ�R�[�h
				}
				//��Ƌ於�Z�b�g
				this.struct.setWS_NAME(tempStruct.getWS_NAME());
			}
			
				
			//�ۊǋ�R�[�h���݃`�F�b�N�����݂��Ȃ���΃G���[
			tempList = new ArrayList();
			tempList = entity.mSelectChkWhCd.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00020");
				setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
			
				//�ۊǋ�R�[�h�̍H��R�[�h�ƃ��O�C�����[�U�̍H��R�[�h�`�F�b�N���s��v�̓G���[
				if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
				}
				//�ۊǋ於�Z�b�g
				this.struct.setWH_NAME(tempStruct.getWH_NAME());
			}

			// ���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
			if(this.struct.getLOT_CTRL_FLG().equals("1")){
				BigDecimal acptQty = new BigDecimal(this.struct.getACPT_QTY());

				//�Ǖi�� > 0�̏ꍇ
				if (acptQty.doubleValue() > 0){
					//���b�g�ԍ��̔ԋ敪 = 0(�����̔Ԃ��Ȃ�)�̏ꍇ
					if(this.struct.getLOT_NUMBERING_TYP().equals("0")){
						//�݌Ƀ��b�g�ԍ��������͂̏ꍇ
						if (this.struct.getLOT_NO() == null || this.struct.getLOT_NO().equals("")){
							setErrorMessage("AE20600");
							setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());//�i��.�i�ڔԍ�
						} else {
							//���b�g�Ǘ�����
							tempList = entity.mT_LOT_CTRL.read(conn,this.struct);

							//[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
							}
						}
					//���b�g�ԍ��̔ԋ敪 = 0(�����̔Ԃ��Ȃ�)�łȂ��ꍇ
					}else{
						//�X�V�O�̃��b�g�ԍ���null�̏ꍇ
						if (this.keepRsltStruct.getLOT_NO() == null || this.keepRsltStruct.getLOT_NO().equals("")) {
							// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List retList = bc.getsetLotNumberingFd(this.struct.getITEM_CD(), this.struct.getOPR_DATE());

							//����I���̏ꍇ
							if(bc.getResultStatus().intValue() == 1){
								//�݌Ƀ��b�g�ԍ��̎擾
								if(retList != null && retList.size() > 0){
									String result1 = (String)retList.get(0);
									this.struct.setLOT_NO(result1);
								}
							//�x�� or �ُ�I���̏ꍇ
							}else{
								//�G���[���b�Z�[�W�̎擾
								if(retList != null && retList.size() > 1){
									String result2 = (String)retList.get(1);
									setErrorMessage(result2);
								}
							}
						//�X�V�O�̃��b�g�ԍ���null�łȂ��ꍇ
						} else {
							//�X�V�O�̃��b�g�ԍ��������p��
							this.struct.setLOT_NO(this.keepRsltStruct.getLOT_NO());
						}
					}
				}
			// ���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�łȂ��ꍇ
			} else {
				//�݌Ƀ��b�g�ԍ������͂���Ă���ꍇ
				if (this.struct.getLOT_NO() != null && !this.struct.getLOT_NO().equals("")){
					setErrorMessage("AE20601");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", this.struct.getITEM_CD());//�i��.�i�ڔԍ�
				}
			}


			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				struct.setLOT_NO(null);
				return;
			}


			//�r������{ModifyCount�`�F�b�N
			tempList = new ArrayList();
			tempList = entity.mSelectChkOutputRslt.read(conn, this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
				setReadStatus(ERROR);
				struct.setLOT_NO(null);
				return;
			}
			tempStruct = (AD0050010Struct)tempList.get(0);
			setStandardItem(tempStruct);
			if (this.struct.geth_RSLT_MODIFY_COUNT() != null 
					&& !this.struct.geth_RSLT_MODIFY_COUNT().equals(
					tempStruct.geth_RSLT_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
				setReadStatus(ERROR);
				struct.setLOT_NO(null);
				return;
			}
			
			//�o�������эX�V����
			entity.mUpdateOutputRslt.update(conn, this.struct);
			
			if (!this.CompareRsltStruct(this.struct, this.keepRsltStruct)) {
				//����̍��ڂ��ύX����Ă����ꍇ�̂݁A�ȉ��̏������s��
				//�O��o�͂��ꂽ��Ǝ��т̃L�[�l���擾�i�Ō�ɂ܂Ƃ߂�ZERO�X�V���s���j

				List zeroList = entity.mSelectModifyZeroOprRslt.read(conn, this.struct);
				if (zeroList.isEmpty()) {
					//�O����уf�[�^�����F�G���[
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
					setReadStatus(ERROR);
					struct.setLOT_NO(null);
					return;
				}
			
				//�o�������єԍ��Ŏ��т��������Ă���i�ڕʎd�|
				//and���i�ڂŊ�������Ă��Ȃ����R�[�h������
				tempList = new ArrayList();
				tempList = entity.mSelectModifyTargetProcByItem.read(conn, this.struct);
				if (tempList.isEmpty()) {
					//�v��斳���F�G���[
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.ITEM_CD", this.struct.getITEM_CD());//�i�ڕʎd�|.�i�ڔԍ�
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.PLANT_CD", this.struct.getPLANT_CD());//�i�ڕʎd�|.�H��R�[�h
					setReadStatus(ERROR);
					struct.setLOT_NO(null);
					return;
				}
			
				//��ʂ̗Ǖi��
				BigDecimal AcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//���ьv�オ�K�v�ȗǕi�̎c��
				BigDecimal TempAcptQty = new BigDecimal(this.struct.getACPT_QTY());
				//��ʂ̕s�ǐ�
				BigDecimal DefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//���ьv�オ�K�v�ȕs�ǂ̎c��
				BigDecimal TempDefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				//��ʂ̗Ǖi���{�s�ǐ�
				BigDecimal TotalQty = new BigDecimal("0");
				TotalQty = AcptQty.add(DefectQty) ;
			
				//���ьv��Ώۂ̕i�ڕʎd�|�̍�Ǝw����
				BigDecimal TargetOprInstQty = new BigDecimal("0");
				//���ьv��Ώۂ́V�i�ڕʎd�|�̍�Ǝw���ԍ�������Ǝ��т�SUM(�Ǖi��+�s�ǐ�)
				BigDecimal SumOprRsltQty = new BigDecimal("0");
				//���ьv��Ώۂ̕i�ڕʎd�|�Ɏ��ьv��ł���c��
				BigDecimal TempOprInstQty = new BigDecimal("0");
				//���ьv�オ�K�v�ȗǕi�c���{�s�ǎc��
				BigDecimal TempSumOprRsltQty = new BigDecimal("0");
			
				int i=0 ;
				int ExitFlg=0 ;		 //while�����o���t���OOFF
				int CompleteFlg=0 ;	 //�i�ڕʎd�|�����t���OOFF
			
				while ( i < tempList.size() && ExitFlg == 0 ) {
					//�Ώەi�ڕʎd�|���Z�b�g
					procByItemStruct = (AD0050010Struct)tempList.get(i);
					setStandardItem(procByItemStruct);
			
					//�Ώۃ��R�[�h�̍�Ǝw�������Z�b�g
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
			
					//�Ώەi�ڕʎd�|�̍�Ǝw���ԍ��Ɠ���̍�Ǝ��т�
					//SUM(�Ǖi���{�s�ǐ���������������)�擾
					procByItemStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());	//�o�������єԍ�
					List temp3List = 
							entity.mSelectSumOprRsltQtyExceptCancel.read(conn, procByItemStruct);
					if (temp3List.isEmpty()) {
						//��Ǝ��т��������߁ASUM(�Ǖi��+�s�ǐ�)��ZERO�Ƃ���
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//�i�ڕʎd�|���Z�b�g����
						tempStruct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(tempStruct);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}

					// 20070611 NES KOIZUMI ADD START
					// ��Ǝw���������ѐ����傫���ꍇ�̂ݎc�w�����v�Z���s���B
					if (TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue()){
					//��Ǝw����-SUM(�Ǖi��+�s�ǐ���������������)
					TempOprInstQty = TargetOprInstQty.subtract(SumOprRsltQty);
					}
                    // 20070611 NES KOIZUMI ADD END
			
                    //���ьv�オ�K�v�Ȑ����Z�o
					TempSumOprRsltQty = TempAcptQty.add(TempDefectQty);
					
					if ( TempSumOprRsltQty.doubleValue() > 0 ) {
						this.rsltStruct = new AD0050010Struct();
						setStandardItem(rsltStruct);

						if ( TempOprInstQty.doubleValue() <= TempSumOprRsltQty.doubleValue() ) {
							//��Ǝw���c���������ьv�オ�K�v�Ȑ��̏ꍇ�F�i�ڕʎd�|����
							
							if ( i + 1 == tempList.size() ) {
								//�i�ڕʎd�|�Ō��1���ł���Ύc����S�Čv�シ��
								this.rsltStruct.setACPT_QTY(TempAcptQty.toString());	//�Ǖi��
								this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());//�s�ǐ�
								TempAcptQty	= new BigDecimal("0");   //�Ǖi�c��ZERO
								TempDefectQty  = new BigDecimal("0");//�s�ǎc��ZERO
								TempOprInstQty = new BigDecimal("0");//���юc��ZERO
								CompleteFlg = 1;                     //�i�ڕʎd�|�����t���OON
							} else {
								//����ȊO�͕i�ڕʎd�|�Ɍv��ł��镪�����v�シ��
								if ( TempOprInstQty.doubleValue() <= TempAcptQty.doubleValue() ) {
									this.rsltStruct.setACPT_QTY(TempOprInstQty.toString());
									this.rsltStruct.setDEFECT_QTY("0.0");
									TempAcptQty = TempAcptQty.subtract(TempOprInstQty);
									CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
								} else {
									//�s�ǂ��g��
									if ( TempAcptQty.doubleValue() > 0 ) {
										//�Ǖi�{�s�ǐ��ŏ�������
										this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
										TempOprInstQty = TempOprInstQty.subtract(TempAcptQty);
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
									} else {
										//�s�ǐ������ŏ�������
										this.rsltStruct.setACPT_QTY("0.0");
										this.rsltStruct.setDEFECT_QTY(TempOprInstQty.toString());
										TempDefectQty =  TempDefectQty.subtract(TempOprInstQty);
										TempAcptQty = new BigDecimal("0");	//�Ǖi�c��ZERO
										// 20150403 NES CHOEN ADD STR
										CompleteFlg = 1 ;	//�i�ڕʎd�|�����t���OON
										// 20150403 NES CHOEN ADD STR
									}
								}
							}
						} else {
							//�i�ڕʎd�|���������̏ꍇ
							this.rsltStruct.setACPT_QTY(TempAcptQty.toString());
							this.rsltStruct.setDEFECT_QTY(TempDefectQty.toString());
							TempAcptQty   = new BigDecimal("0");	//�Ǖi�c��ZERO
							TempDefectQty = new BigDecimal("0");	//�s�ǎc��ZERO
							ExitFlg=1;  //while�����o���t���OON
						}
						//��Ǝ��т̓o�^����
						this.rsltStruct.setOPR_INST_CD(procByItemStruct.getOPR_INST_CD());
						
						//�ő啪��񐔁{�P�̃Z�b�g
						temp3List = new ArrayList();
						temp3List = entity.mSelectMaxPrdNo.read(conn, this.rsltStruct);

						//�������ʂ͕K������
						AD0050010Struct temp3Struct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(temp3Struct);
						this.rsltStruct.setPARTIAL_PRD_NO(temp3Struct.getPARTIAL_PRD_NO());//�����
						this.rsltStruct.setITEM_CD(this.struct.getITEM_CD());//�i�ڔԍ�
						this.rsltStruct.setWS_CD(this.struct.getWS_CD());	//��Ƌ�R�[�h
						this.rsltStruct.setOPR_DATE(this.struct.getOPR_DATE());//��Ɠ�
						this.rsltStruct.setWH_CD(this.struct.getWH_CD());	//�ۊǋ�R�[�h
						this.rsltStruct.setOPR_RSLT_PERSON(null);			//��Ǝ�
						this.rsltStruct.setOPR_RSLT_COMMENT(null);		//��Ɣ��l
						this.rsltStruct.setOPR_TIME_UNIT_TYP("1");			//��Ǝ��ԒP�ʋ敪
						this.rsltStruct.setPRE_ARRANGEMENT_TIME("0");		//�O�i�掞��
						this.rsltStruct.setPOST_ARRANGEMENT_TIME("0");		//��i�掞��
						this.rsltStruct.setOPR_TIME("0");					//��Ǝ���
						this.rsltStruct.setCESSATION_TIME("0");			//��~����
						this.rsltStruct.setCESSATION_CAUSE(null);			//��~���R
						this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());//�o�������єԍ�
						this.rsltStruct.setPLANT_CD(this.struct.getPLANT_CD());//�H��R�[�h
						this.rsltStruct.setLOT_NO(this.struct.getLOT_NO());//�݌Ƀ��b�g�ԍ�
						this.rsltStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());//���[�J���b�g�ԍ�
						this.rsltStruct.setOPR_CRCT_NO("0");				//��ƒ�����

						//��Ǝ��т̓o�^
						entity.mInsertOprRslt.create(conn, this.rsltStruct);
						String sFLG = "0";	//�����l�Z�b�g�i��Ɩ������j

						//��Ǝw�������̎��т��v�コ��Ă���Εi�ڕʎd�|���X�V����
						if ( CompleteFlg == 1 ) {
							if (!"9".equals(procByItemStruct.getWORK_STS_TYP())) {
								AD0050010Struct completeStruct = new AD0050010Struct();
								setStandardItem(completeStruct);
								completeStruct.setWORK_STS_TYP("9");
								completeStruct.seth_WORK_ODR_CD(procByItemStruct.geth_WORK_ODR_CD());
								completeStruct.setOPR_INST_CD(this.rsltStruct.getOPR_INST_CD());

								//����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
								List oprRsltList = entity.mT_OPR_RSLT.read(conn, completeStruct);
								if (oprRsltList.isEmpty()) {
									setErrorMessage("ZZ01101");
									setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
									setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.rsltStruct.getOPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
									return;
								}
								tempStruct = (AD0050010Struct)oprRsltList.get(0);
								completeStruct.setWORK_CMPLT_DATE(tempStruct.getOPR_DATE());

								entity.mUpdateProcByItem.update(conn, completeStruct);

								sFLG = "1";	//��Ɗ���
							}
						}
						//���ʕ��i�̎����o�ɏ���
						this.callCommonIssue(sFLG);
						//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
						this.callRcvCancel(sFLG);
			
						CompleteFlg=0 ;	 //�i�ڕʎd�|�����t���O�ēxOFF
						i = i + 1 ;
					} else {
					//���ьv�オ�K�v�Ȑ����O�ȉ��Ȃ̂Ŏ��ьv��͍s��Ȃ�
						ExitFlg=1;  //while�����o���t���OON
					}
				}
			
				//�O�񕪂̍�Ǝ��т̗Ǖi���ƕs�ǐ���ZERO�ɍX�V����i�L�����Z������j
				for (i = 0; i < zeroList.size(); i++ ) {
			
					//�Ώۍ�Ǝ��т��Z�b�g����
					AD0050010Struct zerorsltStruct = (AD0050010Struct)zeroList.get(i);
					setStandardItem(zerorsltStruct);
			
					setStandardItem(rsltStruct);
					this.rsltStruct.setOPR_INST_CD(zerorsltStruct.getOPR_INST_CD());
					this.rsltStruct.setPARTIAL_PRD_NO(
							zerorsltStruct.getPARTIAL_PRD_NO());	//ZERO�X�V�Ώە����
					this.rsltStruct.setOUTPUT_RSLT_CD(this.struct.getOUTPUT_RSLT_CD());
					this.rsltStruct.setACPT_QTY("0.0");			//�Ǖi��
					this.rsltStruct.setDEFECT_QTY("0.0");			//�s�ǐ�
					this.rsltStruct.setOPR_CRCT_NO("1");			//��ƒ�����
					
					entity.mUpdateOprRslt.update(conn, this.rsltStruct);
						
					//�Ή�����i�ڕʎd�|�̎w�������擾
					tempList = new ArrayList();
					tempList = entity.mSelectModifyZeroProcByItem.read(conn, this.rsltStruct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", this.struct.getOUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.rsltStruct.getOPR_INST_CD());//�i�ڕʎd�|.��Ǝw���ԍ�
						setReadStatus(ERROR);
						struct.setLOT_NO(null);
						return;
					}
					procByItemStruct = new AD0050010Struct();
					procByItemStruct = (AD0050010Struct)tempList.get(0);
					setStandardItem(procByItemStruct);
					
					//�Ώۃ��R�[�h�̎w�������Z�b�g
					TargetOprInstQty = new BigDecimal(procByItemStruct.getOPR_INST_QTY());
					//�X�ɑΉ�����v��ςݎ��ѐ����擾
					//�Ώەi�ڕʎd�|�̍�Ǝw���ԍ��Ɠ���̍�Ǝ��т�SUM(�Ǖi���{�s�ǐ�)�擾
					procByItemStruct.setOPR_INST_CD(zerorsltStruct.getOPR_INST_CD());

					List temp3List = entity.mSelectSumOprRsltQty.read(conn, procByItemStruct);
					if (temp3List.isEmpty()) {
						//��Ǝ��т��������߁ASUM(�Ǖi��+�s�ǐ�)��ZERO�Ƃ���
						SumOprRsltQty = new BigDecimal("0");
					} else {
						//�v��ςݎ��ѐ����Z�b�g����
						tempStruct = (AD0050010Struct)temp3List.get(0);
						setStandardItem(tempStruct);
						SumOprRsltQty = new BigDecimal(tempStruct.getSUM_OPR_RSLT_QTY());
					}
			
					String sFLG = "0";   //�����l�Z�b�g�i��Ɩ������j
					//�w�������v��ςݎ��ѐ��̏ꍇ�A�X�e�[�^�X��߂��A���������N���A����
					if ( TargetOprInstQty.doubleValue() > SumOprRsltQty.doubleValue() ) {
						if (!"2".equals(procByItemStruct.getWORK_STS_TYP())) {
							setStandardItem(procByItemStruct);
							procByItemStruct.setWORK_STS_TYP("2");//��Ə�ԋ敪�F�Q�i�w���ς݁j
							procByItemStruct.setWORK_CMPLT_DATE(null);	//�������F�m�t�k�k

							entity.mUpdateProcByItem.update(conn, procByItemStruct);
						}
					} else {
						sFLG = "1";	//��Ɗ���
					}	
					//���ʕ��i�̎����o�ɏ���
					this.callCommonIssue(sFLG);
					//���ɏ����i�ۊǋ�ʓ��o�ɒǉ������ɏ����j
					this.callRcvCancel(sFLG);
				}

				if (msgStruct.hasError()) {
					struct.setLOT_NO(null);
					return;
				}
			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
			if(this.struct.getLOT_CTRL_FLG().equals("1")){
				//�݌Ƀ��b�g�ԍ���Null�łȂ��ꍇ
				if(this.rsltStruct.getLOT_NO() != null && !this.rsltStruct.getLOT_NO().equals("")){
					//���b�g�ԍ����ύX���ꂽ�ꍇ
					if (!this.rsltStruct.getLOT_NO().equals(this.keepRsltStruct.getLOT_NO())) {
						//���b�g�ʎg�p���ю擾
						AD0050010Struct tempSelectStruct = new AD0050010Struct();
						tempSelectStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());
						tempList = entity.mT_LOT_USE_RSLT.read(conn,tempSelectStruct);
						if (tempList != null && !tempList.isEmpty()) {
							for (i = 0; i < tempList.size(); i++ ) {
								tempStruct = (AD0050010Struct)tempList.get(i);

								//���b�g�g���[�X�o�^�E�X�V����
								BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(),
									getsysPLANT_CD());
								List lotTraceList = bc.excMakeLotTraceFd(tempStruct.getITEM_CD(),
									tempStruct.getLOT_NO(), this.struct.getITEM_CD(),
									this.struct.getLOT_NO(), "3");
								//����I���̏ꍇ
								if(bc.getResultStatus().intValue() == 1){
									tempStruct.setFROM_ITEM_CD(tempStruct.getITEM_CD());
									tempStruct.setFROM_LOT_NO(tempStruct.getLOT_NO());
									tempStruct.setTO_ITEM_CD(this.struct.getITEM_CD());
									tempStruct.setTO_LOT_NO(this.struct.getLOT_NO());
									tempStruct.setTO_PUCH_ODR_CD(null);
									tempStruct.setsUser_ID(getsysUSER_CD());
									
									// �������ԍ����擾����
									List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,tempStruct);
									if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
										AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
										tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
									} else {
										tempStruct.setFROM_PUCH_ODR_CD(null);
									}
									//���b�g�g���[�X�̔����ԍ����X�V����
									entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
								}
								//�ُ�I���̏ꍇ
								if(bc.getResultStatus().intValue() == 3){
									//�G���[���b�Z�[�W�擾
									if(lotTraceList != null && lotTraceList.size() > 0){
										setErrorMessage((String)lotTraceList.get(0));
									}
									struct.setLOT_NO(null);
									return;
								}
							}
						}
					}

					//���b�g�Ǘ��e�[�u���X�V
					setStandardItem(this.rsltStruct);
					entity.mT_LOT_CTRL.update(conn,this.struct);
					
					//���b�g�ʎg�p���т��X�V
					String temp;
					int round;
					BigDecimal denominator;
					BigDecimal numerator;
					BigDecimal planSum;
					//���b�g�g�p�ʎ��т̍X�V����
					tempList = entity.mUpdateT_LOT_USE_RSLT.read(conn, this.struct);
					if (tempList.size() > 0) {
						for (int m = 0; m < tempList.size(); m++) {
							tempStruct = (AD0050010Struct)tempList.get(m);
							round = Integer.parseInt(tempStruct.getUNIT_QTY_TYP());
							denominator = new BigDecimal(tempStruct.getISSUE_INST_UNIT_DENOMINATOR());
							numerator = new BigDecimal(tempStruct.getISSUE_INST_UNIT_NUMERATOR());
							///////////////////////////////////////////////
							//�Ǖi��
							temp = this.struct.getACPT_QTY();
							planSum = new BigDecimal(temp);
							//�q�i�ڂ̎g�p���̌v�Z
							if (round == 1) {
								planSum = planSum.multiply(numerator).divide(denominator, 0, BigDecimal.ROUND_UP).setScale(1);
							} else {
								planSum = planSum.multiply(numerator).divide(denominator, 4, BigDecimal.ROUND_UP);
							
							}
							//�g�p�\�萔�ʂ̌v�Z�F�u�Ǖi���v-SUM�i[���b�g�ʎg�p����].�h�g�p�\�萔�ʁh�j+MAX�i���b�g�ԍ��j�̎g�p�\�萔��
							if (Calculate.compare(planSum.toString(),tempStruct.getSUPPLIED_ISSUE_QTY_SUM()) != 0) {
								temp = Calculate.add(tempStruct.getSUPPLIED_ISSUE_QTY(),
										Calculate.subtract(planSum.toString(),tempStruct.getSUPPLIED_ISSUE_QTY_SUM()));
								tempStruct.setSUPPLIED_ISSUE_QTY(temp);
								setStandardItem(tempStruct);
								entity.mUpdateT_LOT_USE_RSLT.update(conn, tempStruct);
							}
						}
					}
				}
			}
		}
			
			conn.commit();

			//�Č���	
			controlSelect();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlUpdate10>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate10");

		return;
	}

	/**
	 * �q���i�ǉ��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUseParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUseParts");
			//{{user_implement_dev:<controlUseParts>

			
		try {				
			this.issueStruct = new AD0050010Struct();
			setStandardItem(issueStruct);
			
			this.issueStruct.setIN_OUTPUT_RSLT_CD(struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.issueStruct.seth_WORK_ODR_CD(struct.geth_WORK_ODR_CD());
			
			this.issueStruct.setTEMP_PLAN_QTY("0.0");
			this.issueStruct.setTEMP_USEOVER_QTY("0.0");
			this.issueStruct.setTEMP_PLANOUT_QTY("0.0");
			this.issueStruct.setTEMP_USE_QTY("0.0");
			this.issueStruct.setl_UNIT_QTY_TYP(Kind.NUMBER);

			//��Ɠ�(���t����.�Ɩ��^�p��)�̃Z�b�g
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.issueStruct.setRCV_ISSUE_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			this.issueStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			this.struct.setStructM(this.issueStruct);
			this.issueKeepStruct.setStructM(this.issueStruct);

			_issueExeType = 0;
			
			setReadStatus(NORMAL);

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlUseParts>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUseParts");

		return;
	}

	/**
	 * �������o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlNoUserParts() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");
			//{{user_implement_dev:<controlNoUserParts>


		try {		
			//�o�Ɏw�����X�g�Ď擾	
			List formList = entity.mSelectIssueForUpdate.read(conn, struct);
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", struct.geth_WORK_ODR_CD());
				setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", struct.geth_ISSUE_INST_CD());
				return;
			}
			AD0050010Struct TempStruct;
             for (int i = 0; i < formList.size(); i++) {
		     TempStruct = (AD0050010Struct)formList.get(i);

		     //�R���{�{�b�N�X�̎擾
		     othercomboTyp(TempStruct);
		    }
			setIssueList(formList);

			this.issueStruct = new AD0050010Struct();
			issueStruct = (AD0050010Struct) formList.get(0);
			setStandardItem(issueStruct);
			this.issueStruct.setIN_OUTPUT_RSLT_CD(struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.issueStruct.seth_WORK_ODR_CD(struct.geth_WORK_ODR_CD());

			//�Ɩ��^�p���̃Z�b�g
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.issueStruct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());

			this.issueStruct.seth_LOT_NO(issueStruct.getLOT_NO());
			
			this.struct.setStructM(this.issueStruct);
			this.issueKeepStruct.setStructM(this.issueStruct);

			_issueExeType = 1;
			
			setReadStatus(NORMAL);

		} catch (FoundationException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlNoUserParts>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlNoUserParts");

		return;
	}

	/**
	 * �ꊇ�X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdateAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");
			//{{user_implement_dev:<controlUpdateAll>


		try {
			//�o�Ɏw�����X�g�Ď擾
			List UpdateAllList = new ArrayList();
			UpdateAllList = entity.mSelectIssue.read(conn, this.struct);
			if (UpdateAllList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_ISSUE_INST.WORK_ODR_CD", struct.geth_WORK_ODR_CD());
				return;				
			}
			AD0050010Struct TempStruct;
             for (int i = 0; i < UpdateAllList.size(); i++) {
		     TempStruct = (AD0050010Struct)UpdateAllList.get(i);

		     //�R���{�{�b�N�X�̎擾
		     othercomboTyp(TempStruct);
		    }
			setIssueList(UpdateAllList);
			
			for (int i = 0; i < UpdateAllList.size(); i++ ) {
			
				this.issueStruct = new AD0050010Struct();
				this.issueStruct = (AD0050010Struct)UpdateAllList.get(i);
				setStandardItem(issueStruct);
				
				this.issueStruct.setPARTIAL_PRD_NO("0");   //ZERO���Z�b�g����
				this.issueStruct.setJOB_ODR_CD(null);	  //���ԕi�ڂ͏����ΏۊO�Ƃ���
			
				if (this.issueStruct.getTEMP_USE_QTY() == null 
						|| Double.parseDouble(this.issueStruct.getTEMP_USE_QTY()) == 0) {
					continue;	//�X�V�g�p���ʂ�ZERO�̈׈ȉ��̏����͍s�킸�A���̍s�Ɉڂ�
				}

				CollectNumber collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
			
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//�̔Ԍ��ʂ��Ȃ�
					setErrorMessage("ZZ01106");
					return;
				}

				BigDecimal keepUseQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				BigDecimal planQty = new BigDecimal(this.issueStruct.getTEMP_PLAN_QTY());
				BigDecimal useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				if (this.issueStruct.getl_UNIT_QTY_TYP() != null 
						&& "1".equals(this.issueStruct.getl_UNIT_QTY_TYP())) {
					//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
					useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
				}
				//�C�����e��ێ�
				this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
				this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
				this.issueStruct.seth_WORK_ODR_CD(this.struct.getOUTPUT_RSLT_CD());//�o�������єԍ�
				this.issueStruct.setWORK_IN_PROC_CD(null);

				this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
				if (useQty.doubleValue() > 0) {
					//�H���݌ɏo��
					this.issueStruct.setRCV_ISSUE_GNR_TYP("51");
				} else {
					//�H���݌ɏo�Ɏ��
					this.issueStruct.setRCV_ISSUE_GNR_TYP("59");
				}

				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
				this.issueStruct.setOD_NO(null);
				this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				this.issueStruct.setSTOCK_UPD_TYP("2");
				this.issueStruct.setRCV_ISSUE_TYP("2");



				//�ۊǋ�R�[�h��NULL�`�F�b�N
				if (this.issueStruct.getWH_CD() == null 
						|| "".equals(this.issueStruct.getWH_CD())) {
					setErrorMessage("AD20060");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�o�Ɏw��.�i�ڔԍ�
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw��.�o�Ɏw���ԍ�
					continue;
				}

				//�ۊǋ�R�[�h�`�F�b�N
				List tempList = entity.mSelectChkWhCd.read(conn, this.issueStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("AD00020");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("M_WH.WH_CD",this.issueStruct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�o�Ɏw��.�i�ڔԍ�
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw��.�o�Ɏw���ԍ�
					continue;
				}
				AD0050010Struct tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
			
				//�o�Ɏw���D�ۊǋ�R�[�h�̍H��R�[�h�Ƃ̃��[�U�̏�������
				//�H��R�[�h�̓���`�F�b�N
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.struct.getPLANT_CD())) {
					setErrorMessage("AD00021");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�o�Ɏw��.�i�ڔԍ�
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw��.�o�Ɏw���ԍ�
					continue;
				}
			

				useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				BigDecimal stockQty = null;
				//�H���d�|�݌ɏo�ɏ���
			
				//�ۊǋ�ʕi�ڍ݌ɍX�V
				tempList = new ArrayList();
				tempList = entity.mSelectItemStock.read(conn, this.issueStruct);
				AD0050010Struct stockStruct = new AD0050010Struct();
				stockStruct.setStructM(this.issueStruct);
				setStandardItem(stockStruct);
				
				// �ޔ�p�莝���݌ɐ���������
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			
				if (tempList.isEmpty()) {
					//�o�^
					useQty = useQty.negate();
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
					
					entity.mInsertItemStock.create(conn, stockStruct);
				} else {
					//�X�V
					tempStruct = new AD0050010Struct();
					tempStruct = (AD0050010Struct)tempList.get(0);
					setStandardItem(tempStruct);
					issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
					stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
					if (useQty.doubleValue() > 0) { //�o��
						useQty = stockQty.subtract(useQty) ;
					} else { //����
						useQty = stockQty.add(useQty.negate()) ;
					}
					stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
					
					entity.mUpdateItemStock.update(conn, stockStruct);
				}
			
				this.issueStruct.setJOB_ODR_CD(null);			//����
				this.issueStruct.setJOB_ODR_DETAIL_NO("0");	//���Ԏ}��
				this.issueStruct.setACPT_NO("0");				//�����
				this.issueStruct.setACPT_RSLT_CRCT_NO("0");	//������ђ�����
				this.issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//�������ђ�����
				this.issueStruct.setOPR_RSLT_CRCT_NO("0");		//��Ǝ��ђ�����
				this.issueStruct.setRCV_ISSUE_AMOUNT("0");		//���o�ɋ��z
				this.issueStruct.setCONS_TYP("0");				//�x���敪
				//��ЃR�[�h
				this.issueStruct.setCOMPANY_CD(_company_cd);
				
				// ���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
				if(issueStruct.getLOT_CTRL_FLG().equals("1")){
					this.issueStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());//�o�������єԍ�

					//�o�Ɏ��і��׎擾
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					//�f�[�^���Ȃ��ꍇ
					if (lotIssueList == null || lotIssueList.size() == 0) {
						setErrorMessage("AD20135");
						setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",this.issueStruct.geth_ISSUE_INST_CD());
																										//�o�Ɏw���ԍ�
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�i�ڔԍ�
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//��ƌv��ԍ�
						return;
					}

					//�g�p�c���ݒ�
					BigDecimal remainQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());

					AD0050010Struct lotUseStruct = new AD0050010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					for (int j = 0; j < lotIssueList.size(); j++ ) {
						AD0050010Struct lotIssueStruct = (AD0050010Struct)lotIssueList.get(j);

						//�������ĉ\���ݒ�
						BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());//�o�Ɏ��ѐ���
						BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());//�g�p��
						BigDecimal availQty = issueQty.subtract(spentQty);

						//���b�g�ʎg�p���ъǗ��ԍ��̔�
						List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
						if(seqList != null && seqList.size() > 0){
							lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
						}

						//�o�Ɏw���ԍ��A���b�g�ԍ��ݒ�
						lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
						lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

						BigDecimal useLotQty = null;

						//�������ĉ\�� >= �g�p�c���̏ꍇ
						if(availQty.doubleValue() >= remainQty.doubleValue()){
							//�g�p�c�����������Đ��ɐݒ�
							useLotQty = remainQty;
						//�������ĉ\�� < �g�p�c���̏ꍇ
						} else {
							//�ŏI�f�[�^�̏ꍇ
							if (j == lotIssueList.size() - 1) {
								//�g�p�c�����g�p���ɐݒ�
								useLotQty = remainQty;
							//�ŏI�f�[�^�łȂ��ꍇ
							} else {
								//�����\����0���傫���ꍇ
								if(availQty.doubleValue() > 0){
									//�g�p�c�����g�p���ɐݒ�
									useLotQty = remainQty;

									//�����R�[�h�ȍ~���擾
									for (int k = j + 1; k < lotIssueList.size(); k++ ) {
										AD0050010Struct nextLotIssueStruct = (AD0050010Struct)lotIssueList.get(k);

										//�������ĉ\���ݒ�
										BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
										BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
										BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

										//�����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
										if (nextAvailQty.doubleValue() > 0) {
											//�������ĉ\�����g�p���ɐݒ�
											useLotQty = availQty;
											break;
										}
									}
								//�����\����0�ȉ��̏ꍇ
								} else {
									//���̃f�[�^���擾
									continue;
								}
							}
						}

						//�g�p���������\�����傫���ꍇ
						if(useLotQty.doubleValue() > availQty.doubleValue()){
							//�x�����b�Z�[�W�o��
							setWarningMessage("AD20136");
							setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
									this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw���ԍ�
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
																											//�i�ڔԍ�
							setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//��ƌv��ԍ�
						}

						//�g�p�ϐ��ʁA�g�p�\�萔�ʂɏ�L�Őݒ肵���g�p����ݒ�
						lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
						lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

						//���ѓ����g�p���ɐݒ�
						lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

						//[���b�g�ʎg�p����]�̒ǉ�
						entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

						//[�o�Ɏ��і���]�̍X�V
						lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
						entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

						this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
						this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

						//���b�g�ʕi�ڍ݌Ɍ���
						tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

						//�X�V�O�̍݌ɐ��ݒ�
						if (tempList.isEmpty()) {
							issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						} else {
							tempStruct = (AD0050010Struct)tempList.get(0);
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						}

						//2���ڈȍ~�̃f�[�^�̏ꍇ
						if (j > 0) {
							//���o�ɊǗ��ԍ��̔�
							collectNum = 
									new CollectNumber(
										CollectNumber.ISSUE_CD,
										this.sysUSER_CD,
										this.sp.getProcId(),
										this.sysPLANT_CD);
							no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								//�̔Ԍ��ʂ��Ȃ�
								setErrorMessage("ZZ01106");
								return;
							}
							this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
						}

						//�ۊǋ�ʓ��o�ɓo�^
						entity.mInsertRecvIssue.create(conn, this.issueStruct);

						//���b�g�ʕi�ڍ݌ɍX�V
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						List updateLotStockList = bc.excUpdateLotStockFd(no, "");

						//�ُ�I���̏ꍇ
						if(bc.getResultStatus().intValue() == 3){
							//�G���[���b�Z�[�W�擾
							if(updateLotStockList != null && updateLotStockList.size() > 0){
								setErrorMessage((String)updateLotStockList.get(0));
							}
							return;
						}

						//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
						if(this.struct.getLOT_CTRL_FLG().equals("1")){
							//�e�i�ڂ̍݌Ƀ��b�g�ԍ����w�肳��Ă���ꍇ
							if(this.struct.getLOT_NO() != null && !this.struct.getLOT_NO().equals("")){
								//���b�g�g���[�X�o�^�E�X�V����
								List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
									this.issueStruct.getLOT_NO(), this.struct.getITEM_CD(), this.struct.getLOT_NO(),
									"3");
								//����I���̏ꍇ
								if(bc.getResultStatus().intValue() == 1){
									AD0050010Struct updateStruct = new AD0050010Struct();
									updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
									updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
									updateStruct.setTO_ITEM_CD(this.struct.getITEM_CD());
									updateStruct.setTO_LOT_NO(this.struct.getLOT_NO());
									updateStruct.setTO_PUCH_ODR_CD(null);
									updateStruct.setsUser_ID(getsysUSER_CD());
									
									// �������ԍ����擾����
									List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
									if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
										AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
										updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
									} else {
										updateStruct.setFROM_PUCH_ODR_CD(null);
									}
									//���b�g�g���[�X�̔����ԍ����X�V����
									entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
								}
								//�ُ�I���̏ꍇ
								if(bc.getResultStatus().intValue() == 3){
									//�G���[���b�Z�[�W�擾
									if(lotTraceList != null && lotTraceList.size() > 0){
										setErrorMessage((String)lotTraceList.get(0));
									}
									return;
								}
							}
						}

						//�g�p�c�����Z
						remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

						//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
						if (remainQty.doubleValue() <= 0) {
							break;
						}
					}
				//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�łȂ��ꍇ
				} else {
					//�ۊǋ�ʓ��o�ɓo�^
					entity.mInsertRecvIssue.create(conn, this.issueStruct);
				}
			}


			conn.commit();

			
			//�Č���
			controlSelect();

		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}


                //}}user_implement_dev:<controlUpdateAll>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAll");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
	
	
		try {
			//��ʏ����ݒ�
			listClear();
			if (this.struct != null) {
				this.struct.clear();
			}			
			initializeNumber();
			
			//��Ɠ�(���t����.�Ɩ��^�p��)�̃Z�b�g
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.setOPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE()); //��Ɠ�
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
	
			setReadStatus(INITIAL);
	
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}
	
	
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert11() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert11");
			//{{user_implement_dev:<controlInsert11>


		try {
			
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			issueStruct = new AD0050010Struct();
			setStandardItem(issueStruct);
			
			CollectNumber collectNum = 
					new CollectNumber(
						CollectNumber.ISSUE_CD,
						this.sysUSER_CD,
						this.sp.getProcId(),
						this.sysPLANT_CD);
			
			String no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԍ��ʂ��Ȃ�
				setErrorMessage("ZZ01106");
				return;
			}
			
			BigDecimal keepUseQty = new BigDecimal(this.issueKeepStruct.getTEMP_USE_QTY());			
			BigDecimal planQty = new BigDecimal(this.struct.getTEMP_PLAN_QTY());
			BigDecimal useQty = new BigDecimal(this.struct.getTEMP_USE_QTY());

			//�C�����e��ێ�
			this.issueStruct.setITEM_CD(this.struct.getITEM_CD());
			this.issueStruct.setITEM_NAME(this.struct.getITEM_NAME());
			this.issueStruct.setWH_CD(this.struct.getWH_CD());
			this.issueStruct.setWH_NAME(this.struct.getWH_NAME());
			this.issueStruct.setTEMP_PLAN_QTY(this.struct.getTEMP_PLAN_QTY());
			this.issueStruct.setSTOCK_UNIT(this.struct.getSTOCK_UNIT());
			this.issueStruct.setTEMP_USEOVER_QTY(this.struct.getTEMP_USEOVER_QTY());
			this.issueStruct.setTEMP_PLANOUT_QTY(this.struct.getTEMP_PLANOUT_QTY());
			this.issueStruct.setTEMP_USE_QTY(this.struct.getTEMP_USE_QTY());
			this.issueStruct.setRCV_ISSUE_DATE(this.struct.getRCV_ISSUE_DATE());
			this.issueStruct.setLOT_NO(this.struct.getLOT_NO());
			this.issueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());
			this.issueStruct.setRCV_ISSUE_COMMENT(this.struct.getRCV_ISSUE_COMMENT());
			this.issueStruct.setMRP_ODR_TYP_DN(this.struct.getMRP_ODR_TYP_DN());
			this.issueStruct.setISSUE_TYP_DN(this.struct.getISSUE_TYP_DN());
			this.issueStruct.seth_BUSINESS_OPR_DATE(this.struct.geth_BUSINESS_OPR_DATE());
			this.issueStruct.setIN_OUTPUT_RSLT_CD(this.struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.seth_ISSUE_INST_CD(this.struct.geth_ISSUE_INST_CD());

			this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
			this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
			this.issueStruct.setJOB_ODR_CD(null);
			this.issueStruct.seth_WORK_ODR_CD(this.struct.getIN_OUTPUT_RSLT_CD());
			this.issueStruct.setWORK_IN_PROC_CD(null);
			this.issueStruct.setOD_NO(null);
			this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
			this.issueStruct.setSTOCK_UPD_TYP("2");
			this.issueStruct.setRCV_ISSUE_TYP("2");

			AD0050010Struct selectStruct = new AD0050010Struct();
			
			AD0050010Struct tempStruct = new AD0050010Struct();
			//�ۊǋ�R�[�h�`�F�b�N
			List tempList = entity.mSelectChkWhCd.read(conn, this.issueStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00020");
				setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
				//�ۊǋ�R�[�h�̍H��R�[�h�ƃ��O�C�����[�U����������H��R�[�h�̓���`�F�b�N
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.getsysPLANT_CD())) {
					setErrorMessage("AD00021");
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
				}
			}
			
			//�i�ڂ����݂��Ȃ��A�i��.�i�ڎ�z�敪��0�y���ԁz�A1�y���Ԍv��z�ȊO��
			//���Ԃ���͂��ꂽ�ꍇ�G���[
			tempList = new ArrayList();
			tempList = entity.mSelectItem.read(conn,this.issueStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD00019");
				setWarningSysLogMessage("M_ITEM.ITEM_CD", tempStruct.getITEM_CD());//�i��.�i�ڔԍ�
			} else {
				tempStruct = new AD0050010Struct();
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				//�i��.�i�ڎ�z�敪��1(����)�A2(�݌Ɉ����^����)�A 3(����)�̏ꍇ�G���[
				if (tempStruct.getMRP_ODR_TYP() != null 
						&& ("1".equals(tempStruct.getMRP_ODR_TYP()) 
						|| "2".equals(tempStruct.getMRP_ODR_TYP()) 
						|| "3".equals(tempStruct.getMRP_ODR_TYP()))) {
					setErrorMessage("AD00082");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", tempStruct.getITEM_CD());//�i��.�i�ڔԍ�
				}
				
				this.issueStruct.setLOT_NUMBERING_TYP(tempStruct.getLOT_NUMBERING_TYP());
				this.issueStruct.setLOT_CTRL_FLG(tempStruct.getLOT_CTRL_FLG());
				
				if (_issueExeType == 0 && "1".equals(tempStruct.geth_UNIT_QTY_TYP())) {
					if (tempStruct.geth_UNIT_QTY_TYP() != null 
							&& "1".equals(tempStruct.geth_UNIT_QTY_TYP())) {
						BigDecimal useQty2   = new BigDecimal("0");
						useQty2 = useQty.setScale(0,BigDecimal.ROUND_UP);
						//�؂�グ�����O�ƌ�Œl���قȂ��Ă����珬�������͂���Ă����Ɣ��f��
						//���[�j���O�Ƃ���
						if ( useQty.doubleValue() != useQty2.doubleValue()) { 
							//�i�ڂ������Ǘ��i�̏ꍇ�ŏ��������͂��ꂽ�ꍇ���[�j���O
							setWarningMessage("AD00043");
							setInfoSysLogMessage("ITEM_CD", this.struct.getITEM_CD());//�i�ڔԍ�
							setInfoSysLogMessage("TEMP_USE_QTY", useQty.toString());//�X�V�g�p����
						}
						//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
						useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
					}
				}

			//�o�������ь���
			List selectList = entity.mSelect.read(conn, struct);
			if (selectList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("T_OUTPUT_RSLT.OUTPUT_RSLT_CD", struct.getIN_OUTPUT_RSLT_CD());//�o��������.�o�������єԍ�
				setReadStatus(NOT_FOUND);
				setScreenMoveFlg(1);
				return;
			}
			selectStruct = (AD0050010Struct)selectList.get(0);

			//���͂����q�i�ڔԍ��ƍ�Ǝ��ѕi�ڂ������ꍇ
			if(this.issueStruct.getITEM_CD().equals(selectStruct.getITEM_CD())){
				setErrorMessage("AD20138");
				setWarningSysLogMessage("ITEM_CD", this.issueStruct.getITEM_CD());
				return;
			}
			
			//���͂����q�i�ڔԍ���e�i�ځA��Ǝ��ѕi�ڂ��q�i�ڂƂ��Đ��i�\������
			this.issueStruct.setPARENT_ITEM_CD(this.issueStruct.getITEM_CD());
			this.issueStruct.setCOMP_ITEM_CD(selectStruct.getITEM_CD());

			tempList = entity.mM_PS.read(conn, this.issueStruct);
			//�f�[�^�����݂���ꍇ
			if(tempList != null && tempList.size() > 0){
				//�G���[���b�Z�[�W�o��
				setErrorMessage("AD20137");
				setWarningSysLogMessage("M_PS.PARENT_ITEM_CD", this.issueStruct.getITEM_CD());
				setWarningSysLogMessage("M_PS.COMP_ITEM_CD", selectStruct.getITEM_CD());
				return;
			}

			//���͂��ꂽ�q�i�ڂ̃��b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̎�
			if (this.issueStruct.getLOT_CTRL_FLG().equals("1")) {
				// ���b�g�ԍ������͂̏ꍇ
				if (this.issueStruct.getLOT_NO() == null || this.issueStruct.getLOT_NO().trim().equals("")) {
					// �G���[���b�Z�[�W�o��
					setErrorMessage("AE20600");
					// ���b�g�ԍ������͂��ꂽ�ꍇ
				} else {
					// ���b�g�Ǘ�����
					tempList = entity.mT_LOT_CTRL.read(conn, this.issueStruct);

					// [���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
					if (tempList == null || tempList.size() == 0) {
						// �G���[���b�Z�[�W�o��
						setErrorMessage("AE20615");
						setWarningSysLogMessage("T_LOTL_CTRL.LOT_NO",this.issueStruct.getLOT_NO());
						// [���b�g�Ǘ�]�ɑ��݂���ꍇ
					} else {
						// �ܖ����� < �g�p�� - [SYSTEM�p�����[�^].�hBEST_BEFORE_DATA_PARA�h�̏ꍇ
						
						if (useQty.doubleValue() > 0) {
							// �o�Ɏw���ԍ���Null�̏ꍇ
							if (issueStruct.geth_ISSUE_INST_CD() == null || issueStruct.geth_ISSUE_INST_CD().equals("")) {
								// �V�X�e���p�����[�^�̏ܖ������`�F�b�N�t���O���擾
								List sysParaList = entity.mSYS_PARAMETER.read(conn, this.issueStruct);
								if (sysParaList.size() > 0) {
									AD0050010Struct sysParaStruct = (AD0050010Struct) sysParaList.get(0);
									this.issueStruct.setBEST_BEFORE_DATE_CHECK_FLG(sysParaStruct.getBEST_BEFORE_DATE_CHECK_FLG());
								} else {
									this.issueStruct.setBEST_BEFORE_DATE_CHECK_FLG("1");
								}
									// [���b�g�Ǘ�].�h�ܖ������h��  �u�o�ɓ��v�̏ꍇ
								List bbdList = entity.mc_BEST_BEFORE_DATE.read(conn, this.issueStruct);
								if (bbdList.size() > 0) {
									AD0050010Struct bbdStruct = (AD0050010Struct) bbdList.get(0);
									// �ܖ������`�F�b�N�t���O��1:�G���[�̏ꍇ
									if (bbdStruct.getBBD_c_FLG().equals("1")&& this.issueStruct.getBEST_BEFORE_DATE_CHECK_FLG().equals("1")) {
										// �ܖ��������؂�Ă��܂��B
										setErrorMessage("AD00114");
										setWarningSysLogMessage("T_LOTL_CTRL.LOT_NO",this.issueStruct.getLOT_NO());
									}// �ܖ������`�F�b�N�t���O��2:�x���̏ꍇ
									else if (bbdStruct.getBBD_c_FLG().equals("1")&& this.issueStruct.getBEST_BEFORE_DATE_CHECK_FLG().equals("2")) {
										// �ܖ������؂�̃��b�g���g�p���܂����B
										setWarningMessage("AD00115");
										setWarningSysLogMessage("T_LOTL.LOT_NO",this.issueStruct.getLOT_NO());
									}
								}
							}
						}
					}
				}
				//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�łȂ��ꍇ
			}else {
				//���b�g�ԍ������͂��ꂽ�ꍇ
				if (this.issueStruct.getLOT_NO() != null&& !this.issueStruct.getLOT_NO().trim().equals("")) {
					//�G���[���b�Z�[�W�o��
					setErrorMessage("AE20601");
				}
			}
		}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}

			//�g�p���ݒ�
			//BigDecimal useLotQty = useQty;

			this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
			if (useQty.doubleValue() > 0) {
				//�H���݌ɏo��
				this.issueStruct.setRCV_ISSUE_GNR_TYP("51");
			} else {
				//�H���݌ɏo�Ɏ��
				this.issueStruct.setRCV_ISSUE_GNR_TYP("59");
			}
			if (_issueExeType == 0) {
				//�o�^����
				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.toString());
			} else {
				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
			}
			
			// �ޔ�p�莝���݌ɐ��̏�����
			issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			
			BigDecimal stockQty = null;
			//�H���d�|�݌ɏo�ɏ���
			//�ۊǋ�ʕi�ڍ݌ɍX�V
			tempList = new ArrayList();
			tempList = entity.mSelectItemStock.read(conn, this.issueStruct);
			AD0050010Struct stockStruct = new AD0050010Struct();
			stockStruct.setStructM(this.issueStruct);
			setStandardItem(stockStruct);
			
			if (tempList.isEmpty()) {
				//�o�^
				useQty = useQty.negate();
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
				
				entity.mInsertItemStock.create(conn, stockStruct);
			} else {
				//�X�V
				tempStruct = (AD0050010Struct)tempList.get(0);
				setStandardItem(tempStruct);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
				if (useQty.doubleValue() > 0) { 
					//�o��
					useQty = stockQty.subtract(useQty) ;
				} else { 
					//����
					useQty = stockQty.add(useQty.negate()) ;
				}
				stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
			
				entity.mUpdateItemStock.update(conn, stockStruct);
			}
			this.issueStruct.setJOB_ODR_CD(null);			//����
			this.issueStruct.setJOB_ODR_DETAIL_NO("0");	//���Ԏ}��
			this.issueStruct.setACPT_NO("0");				//�����
			this.issueStruct.setACPT_RSLT_CRCT_NO("0");	//������ђ�����
			this.issueStruct.setINSPEC_RSLT_CRCT_NO("0");	//�������ђ�����
			this.issueStruct.setPARTIAL_PRD_NO("0");		//�����
			this.issueStruct.setOPR_RSLT_CRCT_NO("0");		//��Ǝ��ђ�����
			this.issueStruct.setRCV_ISSUE_AMOUNT("0");		//���o�ɋ��z
			this.issueStruct.setCONS_TYP("0");				//�x���敪
			
			//��ЃR�[�h
			this.issueStruct.setCOMPANY_CD(_company_cd);
			
			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
			if(issueStruct.getLOT_CTRL_FLG().equals("1")){
				//�o�Ɏw���ԍ���null�łȂ��ꍇ
				if(issueStruct.geth_ISSUE_INST_CD() != null && !issueStruct.geth_ISSUE_INST_CD().equals("")){
					//�o�Ɏ��і��׎擾
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					//�f�[�^���Ȃ��ꍇ
					if (lotIssueList == null || lotIssueList.size() == 0) {
						setErrorMessage("AD20135");
						setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",this.issueStruct.geth_ISSUE_INST_CD());
																										//�o�Ɏw���ԍ�
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�i�ڔԍ�
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//��ƌv��ԍ�
						return;
					}
					
					//�g�p�c���ݒ�
					BigDecimal remainQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());

					AD0050010Struct lotUseStruct = new AD0050010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					//���ʑ����̏ꍇ
					if (remainQty.doubleValue() > 0){
						for (int j = 0; j < lotIssueList.size(); j++ ) {
							AD0050010Struct lotIssueStruct = (AD0050010Struct)lotIssueList.get(j);

							//�������ĉ\���ݒ�
							BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
							BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
							BigDecimal availQty = issueQty.subtract(spentQty);

							//�o�Ɏw���ԍ��A���b�g�ԍ��ݒ�
							lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
							lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

							BigDecimal useLotQty = null;

							//�������ĉ\�� >= �g�p�c���̏ꍇ
							if(availQty.doubleValue() >= remainQty.doubleValue()){
								//�g�p�c�����������Đ��ɐݒ�
								useLotQty = remainQty;
							//�������ĉ\�� < �g�p�c���̏ꍇ
							} else {
								//�ŏI�f�[�^�̏ꍇ
								if (j == lotIssueList.size() - 1) {
									//�g�p�c�����g�p���ɐݒ�
									useLotQty = remainQty;
								//�ŏI�f�[�^�łȂ��ꍇ
								} else {
									//�����\����0���傫���ꍇ
									if(availQty.doubleValue() > 0){
										//�g�p�c�����g�p���ɐݒ�
										useLotQty = remainQty;

										//�����R�[�h�ȍ~���擾
										for (int k = j + 1; k < lotIssueList.size(); k++ ) {
											AD0050010Struct nextLotIssueStruct = (AD0050010Struct)lotIssueList.get(k);

											//�������ĉ\���ݒ�
											BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
											BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
											BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

											//�����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
											if (nextAvailQty.doubleValue() > 0) {
												//�������ĉ\�����g�p���ɐݒ�
												useLotQty = availQty;
												break;
											}
										}
									//�����\����0�ȉ��̏ꍇ
									} else {
										//���̃f�[�^���擾
										continue;
									}
								}
							}

							//�g�p���������\�����傫���ꍇ
							if(useLotQty.doubleValue() > availQty.doubleValue()){
								//�x�����b�Z�[�W�o��
								setWarningMessage("AD20136");
								setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
										this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw���ԍ�
								setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
																											//�i�ڔԍ�
								setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD", this.issueStruct.getWORK_ODR_CD());
																										//��ƌv��ԍ�
							}

							//�����ϐ��ݒ�
							spentQty = spentQty.add(useLotQty);

							//���ѓ����g�p���ɐݒ�
							lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

							//���b�g�����蓖�Ă̏ꍇ
							if (this.issueKeepStruct.getLOT_NO() == null || this.issueKeepStruct.getLOT_NO().equals("")){
								//�g�p�ϐ��Ɉ����ϐ���ݒ�
								lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
								//�g�p�\�萔�ʂɉ�ʂ̎g�p�\�萔�ʂ�ݒ�
								lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

								//���b�g�ʎg�p���ъǗ��ԍ��̔�
								List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
								if(seqList != null && seqList.size() > 0){
									lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
								}
								//[���b�g�ʎg�p����]�̒ǉ�
								entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
							//���b�g���蓖�čς݂̏ꍇ
							} else {
								//���b�g�ʎg�p���ю擾
								lotIssueStruct.setIN_OUTPUT_RSLT_CD(this.issueStruct.getIN_OUTPUT_RSLT_CD());
								tempList = entity.mT_LOT_USE_RSLT.read(conn,lotIssueStruct);

								//�f�[�^�����݂��Ȃ��ꍇ
								if (tempList == null || tempList.isEmpty()) {
									//�g�p�ϐ��Ɉ����ϐ���ݒ�
									lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
									//�g�p�\�萔�ʂ�0��ݒ�
									lotUseStruct.setSUPPLIED_ISSUE_QTY("0");

									//���b�g�ʎg�p���ъǗ��ԍ��̔�
									List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
									if(seqList != null && seqList.size() > 0){
										lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
									}
									//[���b�g�ʎg�p����]�̒ǉ�
									entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);
								} else {
									tempStruct = (AD0050010Struct)tempList.get(0);
		
									//�g�p�ϐ��擾
									BigDecimal totalIssueQty = new BigDecimal(tempStruct.getTOTAL_ISSUE_QTY());

									//�g�p�ϐ��Ɉ����ϐ���ݒ�
									lotUseStruct.setTOTAL_ISSUE_QTY(totalIssueQty.add(useLotQty).toString());

									//[���b�g�ʎg�p����]�̍X�V
									entity.mT_LOT_USE_RSLT.update(conn, lotUseStruct);
								}
							}

							//[�o�Ɏ��і���]�̍X�V
							lotUseStruct.setSPENT_QTY(spentQty.toString());
							entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

							this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
							this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

							//���b�g�ʕi�ڍ݌Ɍ���
							tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

							//�X�V�O�̍݌ɐ��ݒ�
							if (tempList.isEmpty()) {
								issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
							} else {
								tempStruct = (AD0050010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
							}

							//2���ڈȍ~�̃f�[�^�̏ꍇ
							if (j > 0) {
								//���o�ɊǗ��ԍ��̔�
								collectNum = 
										new CollectNumber(
										CollectNumber.ISSUE_CD,
										this.sysUSER_CD,
										this.sp.getProcId(),
										this.sysPLANT_CD);
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//�̔Ԍ��ʂ��Ȃ�
									setErrorMessage("ZZ01106");
									return;
								}
								this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
							}

							//�ۊǋ�ʓ��o�ɓo�^
							entity.mInsertRecvIssue.create(conn, this.issueStruct);

							//���b�g�ʕi�ڍ݌ɍX�V
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List updateLotStockList = bc.excUpdateLotStockFd(no, "");

							//�ُ�I���̏ꍇ
							if(bc.getResultStatus().intValue() == 3){
								//�G���[���b�Z�[�W�擾
								if(updateLotStockList != null && updateLotStockList.size() > 0){
									setErrorMessage((String)updateLotStockList.get(0));
								}
								return;
							}

							//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
							if(selectStruct.getLOT_CTRL_FLG().equals("1")){
								//���b�g�g���[�X�o�^�E�X�V����
								List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
									this.issueStruct.getLOT_NO(), selectStruct.getITEM_CD(), selectStruct.getLOT_NO(),
									"3");
								//����I���̏ꍇ
								if(bc.getResultStatus().intValue() == 1){
									AD0050010Struct updateStruct = new AD0050010Struct();
									updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
									updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
									updateStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
									updateStruct.setTO_LOT_NO(selectStruct.getLOT_NO());
									updateStruct.setTO_PUCH_ODR_CD(null);
									updateStruct.setsUser_ID(getsysUSER_CD());
									
									// �������ԍ����擾����
									List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
									if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
										AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
										updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
									} else {
										updateStruct.setFROM_PUCH_ODR_CD(null);
									}
									//���b�g�g���[�X�̔����ԍ����X�V����
									entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
								}
								//�ُ�I���̏ꍇ
								if(bc.getResultStatus().intValue() == 3){
									//�G���[���b�Z�[�W�擾
									if(lotTraceList != null && lotTraceList.size() > 0){
										setErrorMessage((String)lotTraceList.get(0));
									}
									return;
								}
							}
							//�g�p�c�����Z
							remainQty = remainQty.subtract(useLotQty);

							//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
							if (remainQty.doubleValue() <= 0) {
								break;
							}
						}
					//���ʌ����̏ꍇ
					} else {
						for (int j = lotIssueList.size() - 1; j >= 0; j-- ) {
							AD0050010Struct lotIssueStruct = (AD0050010Struct)lotIssueList.get(j);

							//���b�g�ʎg�p���ю擾
							lotIssueStruct.setIN_OUTPUT_RSLT_CD(this.issueStruct.getIN_OUTPUT_RSLT_CD());
							tempList = entity.mT_LOT_USE_RSLT.read(conn,lotIssueStruct);

							//�f�[�^�����݂��Ȃ��ꍇ
							if (tempList == null || tempList.isEmpty()) {
								//���̃f�[�^���擾
								continue;
							}

							tempStruct = (AD0050010Struct)tempList.get(0);

							//�������ĉ\���ݒ�
							BigDecimal availQty = new BigDecimal(tempStruct.getTOTAL_ISSUE_QTY());

							//�o�Ɏw���ԍ��A���b�g�ԍ��ݒ�
							lotUseStruct.seth_ISSUE_INST_CD(lotIssueStruct.geth_ISSUE_INST_CD());
							lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

							BigDecimal useLotQty = null;

							//�������ĉ\�� >= �g�p�c���̏ꍇ
							if(availQty.doubleValue() >= remainQty.negate().doubleValue()){
								//�g�p�c�����������Đ��ɐݒ�
								useLotQty = remainQty;
							//�������ĉ\�� < �g�p�c���̏ꍇ
							} else {
								//�ŏI�f�[�^�̏ꍇ
								if (j == 0) {
									//�g�p�c�����g�p���ɐݒ�
									useLotQty = remainQty;
								//�ŏI�f�[�^�łȂ��ꍇ
								} else {
									//�����\����0���傫���ꍇ
									if(availQty.doubleValue() > 0){
										useLotQty = availQty.negate();
									//�����\����0�ȉ��̏ꍇ
									} else {
										//���̃f�[�^���擾
										continue;
									}
								}
							}

							//�g�p�ϐ���ݒ�
							lotUseStruct.setTOTAL_ISSUE_QTY(availQty.add(useLotQty).toString());

							//���ѓ����g�p���ɐݒ�
							lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

							//[���b�g�ʎg�p����]�̍X�V
							entity.mT_LOT_USE_RSLT.update(conn, lotUseStruct);

							//�����ϐ��ݒ�
							BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
							spentQty = spentQty.add(useLotQty);

							//[�o�Ɏ��і���]�̍X�V
							lotUseStruct.setSPENT_QTY(spentQty.toString());
							entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

							this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
							this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

							//���b�g�ʕi�ڍ݌Ɍ���
							tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

							//�X�V�O�̍݌ɐ��ݒ�
							if (tempList.isEmpty()) {
								issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
							} else {
								tempStruct = (AD0050010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
							}

							//2���ڈȍ~�̃f�[�^�̏ꍇ
							if (j < lotIssueList.size() - 1) {
								//���o�ɊǗ��ԍ��̔�
								collectNum = 
										new CollectNumber(
										CollectNumber.ISSUE_CD,
										this.sysUSER_CD,
										this.sp.getProcId(),
										this.sysPLANT_CD);
								no = collectNum.getNo();
								if (no == null || no.length() == 0) {
									//�̔Ԍ��ʂ��Ȃ�
									setErrorMessage("ZZ01106");
									return;
								}
								this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
							}
							//�ۊǋ�ʓ��o�ɓo�^
							entity.mInsertRecvIssue.create(conn, this.issueStruct);

							//���b�g�ʕi�ڍ݌ɍX�V
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
							List updateLotStockList = bc.excUpdateLotStockFd(no, "");

							//�ُ�I���̏ꍇ
							if(bc.getResultStatus().intValue() == 3){
								//�G���[���b�Z�[�W�擾
								if(updateLotStockList != null && updateLotStockList.size() > 0){
									setErrorMessage((String)updateLotStockList.get(0));
								}
								return;
							}

							//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
							if(selectStruct.getLOT_CTRL_FLG().equals("1")){
								//�e�i�ڂ̍݌Ƀ��b�g�ԍ����w�肳��Ă���ꍇ
								if (selectStruct.getLOT_NO() != null && !selectStruct.getLOT_NO().equals("")){
									//���b�g�g���[�X�o�^�E�X�V����
									List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
										this.issueStruct.getLOT_NO(), selectStruct.getITEM_CD(),
										selectStruct.getLOT_NO(), "3");
									//����I���̏ꍇ
									if(bc.getResultStatus().intValue() == 1){
										AD0050010Struct updateStruct = new AD0050010Struct();
										updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
										updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
										updateStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
										updateStruct.setTO_LOT_NO(selectStruct.getLOT_NO());
										updateStruct.setTO_PUCH_ODR_CD(null);
										updateStruct.setsUser_ID(getsysUSER_CD());
										
										// �������ԍ����擾����
										List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
										if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
											AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
											updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
										} else {
											updateStruct.setFROM_PUCH_ODR_CD(null);
										}
										//���b�g�g���[�X�̔����ԍ����X�V����
										entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
									}
									//�ُ�I���̏ꍇ
									if(bc.getResultStatus().intValue() == 3){
										//�G���[���b�Z�[�W�擾
										if(lotTraceList != null && lotTraceList.size() > 0){
											setErrorMessage((String)lotTraceList.get(0));
										}
										return;
									}
								}
							}
							//�g�p�c�����Z
							remainQty = remainQty.subtract(useLotQty);

							//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
							if (remainQty.doubleValue() >= 0) {
								break;
							}
						}
					}
				//�o�Ɏw���ԍ���null�̏ꍇ
			} else {
				AD0050010Struct lotUseStruct = new AD0050010Struct();
				lotUseStruct.setStructM(this.issueStruct);
				setStandardItem(lotUseStruct);

				//�g�p�ϐ��ɉ�ʂ̎g�p�\�萔�ʂ�ݒ�
				lotUseStruct.setTOTAL_ISSUE_QTY(this.issueStruct.getTEMP_USE_QTY());
				//�g�p�\�萔�ʂ�0��ݒ�
				lotUseStruct.setSUPPLIED_ISSUE_QTY("0.0");

				//���ѓ����g�p���ɐݒ�
				lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

				//���b�g�ʎg�p���ъǗ��ԍ��̔�
				List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
				if(seqList != null && seqList.size() > 0){
					lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0050010Struct)seqList.get(0)).getNEXTVAL());
				}
				//[���b�g�ʎg�p����]�̒ǉ�
				entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

			//���b�g�ʕi�ڍ݌Ɍ���
			tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

			//�X�V�O�̍݌ɐ��ݒ�
			if (tempList.isEmpty()) {
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
			} else {
				tempStruct = (AD0050010Struct)tempList.get(0);
				issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
			}

			//�ۊǋ�ʓ��o�ɓo�^
			entity.mInsertRecvIssue.create(conn, this.issueStruct);

			//���b�g�ʕi�ڍ݌ɍX�V
			BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
			List updateLotStockList = bc.excUpdateLotStockFd(no, "");

			//�ُ�I���̏ꍇ
			if(bc.getResultStatus().intValue() == 3){
				//�G���[���b�Z�[�W�擾
				if(updateLotStockList != null && updateLotStockList.size() > 0){
					setErrorMessage((String)updateLotStockList.get(0));
				}
				return;
			}

			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�̏ꍇ
			if(selectStruct.getLOT_CTRL_FLG().equals("1")){
				//�e�i�ڂ̍݌Ƀ��b�g�ԍ����w�肳��Ă���ꍇ
				if (selectStruct.getLOT_NO() != null && !selectStruct.getLOT_NO().equals("")){
					//���b�g�g���[�X�o�^�E�X�V����
					List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
						this.issueStruct.getLOT_NO(), selectStruct.getITEM_CD(),
						selectStruct.getLOT_NO(), "3");
					//����I���̏ꍇ
					if(bc.getResultStatus().intValue() == 1){
						AD0050010Struct updateStruct = new AD0050010Struct();
						updateStruct.setFROM_ITEM_CD(this.issueStruct.getITEM_CD());
						updateStruct.setFROM_LOT_NO(this.issueStruct.getLOT_NO());
						updateStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
						updateStruct.setTO_LOT_NO(selectStruct.getLOT_NO());
						updateStruct.setTO_PUCH_ODR_CD(null);
						updateStruct.setsUser_ID(getsysUSER_CD());
						
						// �������ԍ����擾����
						List fromPuchOrdList = entity.mgetFROM_PUCH_ODR_CD.read(conn,updateStruct);
						if (fromPuchOrdList != null && fromPuchOrdList.size() > 0) {
							AD0050010Struct orderStruct = (AD0050010Struct) fromPuchOrdList.get(0);
							updateStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
						} else {
							updateStruct.setFROM_PUCH_ODR_CD(null);
						}
						//���b�g�g���[�X�̔����ԍ����X�V����
						entity.mupdateT_LOT_TRACE.update(conn, updateStruct);
					}
					//�ُ�I���̏ꍇ
					if(bc.getResultStatus().intValue() == 3){
						//�G���[���b�Z�[�W�擾
						if(lotTraceList != null && lotTraceList.size() > 0){
							setErrorMessage((String)lotTraceList.get(0));
						}
						return;
					}
				}
			}
			}
			//���b�g�Ǘ��t���O = 1(���b�g�g���[�X�Ǘ����s���B)�łȂ��ꍇ
			} else {
				//�ۊǋ�ʓ��o�ɓo�^
				entity.mInsertRecvIssue.create(conn, this.issueStruct);
			}

			
			conn.commit();
			
			this.struct.setStructM(this.issueStruct);
			
			//�Č���
			controlSelect();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}



                //}}user_implement_dev:<controlInsert11>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlInsert11");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate11() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate11");
			//{{user_implement_dev:<controlUpdate11>


		controlInsert11();


                //}}user_implement_dev:<controlUpdate11>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlUpdate11");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>

			
		//�e��ʍČ���
		controlSelect();


                //}}user_implement_dev:<controlReturn>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		try {
			setReadStatus(INITIAL);

			//��ʏ����ݒ�
			listClear();
			if (this.struct != null) {
				this.struct.clear();
			}			
			initializeNumber();

			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_oprTimeUnitTypStruct = cdac.getData("OPR_TIME_UNIT_TYP");
			DEFECT_CAUSE_CD = cdac.getData("DEFECT_CAUSE_CD_INNER");
			cdac.setConnection(null);

			//��Ɠ�(���t����.�Ɩ��^�p��)�̃Z�b�g
			this.struct.setPLANT_CD(getsysPLANT_CD());
			List oprDateList = entity.mSelectDateCtrl.read(conn, struct);
			if (oprDateList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
				setReadStatus(ERROR);
				return;
			}
			AD0050010Struct oprDateStruct = new AD0050010Struct();
			oprDateStruct = (AD0050010Struct)oprDateList.get(0);
			setStandardItem(oprDateStruct);
			this.struct.setOPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE()); //��Ɠ�
			this.struct.seth_BUSINESS_OPR_DATE(oprDateStruct.geth_BUSINESS_OPR_DATE());
			
			lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			
			// ��ЃR�[�h�擾
			_company_cd = SystemInformation.getSysMyCompanyCd();
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;			
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0050");
		logger.entering("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
//			struct.setDOWNLOAD_FILE((String)null);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��
			try {
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);	
                 ISSUE_TYP = comboController.getData(ISSUE_TYP_PARAMETER_NAME);
                 MRP_ODR_TYP = comboController.getData(MRP_ODR_TYP_PARAMETER_NAME);

                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert10") ) {
				controlInsert10();
			} else if( button.equals("Update10") ) {
				controlUpdate10();
			} else if( button.equals("UseParts") ) {
				controlUseParts();
			} else if( button.equals("NoUserParts") ) {
				controlNoUserParts();
			} else if( button.equals("UpdateAll") ) {
				controlUpdateAll();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Insert11") ) {
				controlInsert11();
			} else if( button.equals("Update11") ) {
				controlUpdate11();
			} else if( button.equals("Return") ) {
				controlReturn();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>


			// �R���{�{�b�N�X�̃Z�b�g
			struct.setList_OPR_TIME_UNIT_TYP_val(_oprTimeUnitTypStruct.getValList());
			struct.setList_OPR_TIME_UNIT_TYP_name(_oprTimeUnitTypStruct.getExplanList());
			
			struct.setList_DEFECT_CAUSE_CD_val(DEFECT_CAUSE_CD.getValList());
			struct.setList_DEFECT_CAUSE_CD_name(DEFECT_CAUSE_CD.getExplanList());
			
			if(lotCtrlFlg){
				struct.seth_SYS_LOT_CTRL_FLG("true");
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
			}


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
//			throw new FoundationException("AD0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0050010Entity entity;
	protected AD0050010Struct struct;
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

		entity = new AD0050010Entity();
		struct = new AD0050010Struct();

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
	 * AD0050010�N���X�̕W���R���X�g���N�^
	 */
	public AD0050010Control() throws BusinessProcessException, FoundationException
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
				AD0050010Struct key = (AD0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY") && key.getTEMP_PLAN_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLAN_QTY", key.getTEMP_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY") && key.getTEMP_USEOVER_QTY() != null) {
					msgKey.setKeyValue("TEMP_USEOVER_QTY", key.getTEMP_USEOVER_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY") && key.getTEMP_PLANOUT_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLANOUT_QTY", key.getTEMP_PLANOUT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USE_QTY") && key.getTEMP_USE_QTY() != null) {
					msgKey.setKeyValue("TEMP_USE_QTY", key.getTEMP_USE_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name") && key.getOPR_TIME_UNIT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_name", key.getOPR_TIME_UNIT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val") && key.getOPR_TIME_UNIT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_val", key.getOPR_TIME_UNIT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_DN") && key.getISSUE_TYP_DN() != null) {
					msgKey.setKeyValue("ISSUE_TYP_DN", key.getISSUE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_DATE") && key.geth_OPR_DATE() != null) {
					msgKey.setKeyValue("h_OPR_DATE", key.geth_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("param1") && key.getparam1() != null) {
					msgKey.setKeyValue("param1", key.getparam1());
				}
				if(msgKeyType.containsKeyColumn("param2") && key.getparam2() != null) {
					msgKey.setKeyValue("param2", key.getparam2());
				}
				if(msgKeyType.containsKeyColumn("param3") && key.getparam3() != null) {
					msgKey.setKeyValue("param3", key.getparam3());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NO") && key.geth_LOT_NO() != null) {
					msgKey.setKeyValue("h_LOT_NO", key.geth_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_name") && key.getDEFECT_CAUSE_CD_name() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD_name", key.getDEFECT_CAUSE_CD_name());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_val") && key.getDEFECT_CAUSE_CD_val() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD_val", key.getDEFECT_CAUSE_CD_val());
				}
				if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY") && key.getSAVE_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SAVE_STOCK_ON_HAND_QTY", key.getSAVE_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT") && key.getOUTPUT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_COMMENT", key.getOUTPUT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD") && key.getDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD", key.getDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT") && key.getDEFECT_COMMENT() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT", key.getDEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON") && key.getOUTPUT_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_PERSON", key.getOUTPUT_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("h_RSLT_MODIFY_COUNT") && key.geth_RSLT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_RSLT_MODIFY_COUNT", key.geth_RSLT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("IN_OUTPUT_RSLT_CD") && key.getIN_OUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("IN_OUTPUT_RSLT_CD", key.getIN_OUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR") && key.getISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_DENOMINATOR", key.getISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR") && key.getISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_NUMERATOR", key.getISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("count_RCV_ISSUE") && key.getcount_RCV_ISSUE() != null) {
					msgKey.setKeyValue("count_RCV_ISSUE", key.getcount_RCV_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM") && key.getMODIFY_COUNT_BY_ITEM() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_BY_ITEM", key.getMODIFY_COUNT_BY_ITEM());
				}
				if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY") && key.getSUM_OPR_RSLT_QTY() != null) {
					msgKey.setKeyValue("SUM_OPR_RSLT_QTY", key.getSUM_OPR_RSLT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON") && key.getOPR_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OPR_RSLT_PERSON", key.getOPR_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT") && key.getOPR_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OPR_RSLT_COMMENT", key.getOPR_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_CRCT_NO") && key.getOPR_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_CRCT_NO", key.getOPR_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE") && key.getWORK_CMPLT_DATE() != null) {
					msgKey.setKeyValue("WORK_CMPLT_DATE", key.getWORK_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO") && key.getACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_CRCT_NO", key.getACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO") && key.getINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_CRCT_NO", key.getINSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT") && key.getRCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_AMOUNT", key.getRCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_RSLT") && key.getMODIFY_COUNT_OPR_RSLT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_OPR_RSLT", key.getMODIFY_COUNT_OPR_RSLT());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPENT_QTY") && key.getSPENT_QTY() != null) {
					msgKey.setKeyValue("SPENT_QTY", key.getSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG") && key.getBEST_BEFORE_DATE_CHECK_FLG() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE_CHECK_FLG", key.getBEST_BEFORE_DATE_CHECK_FLG());
				}
				if(msgKeyType.containsKeyColumn("BBD_c_FLG") && key.getBBD_c_FLG() != null) {
					msgKey.setKeyValue("BBD_c_FLG", key.getBBD_c_FLG());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO") && key.getRSLT_CTRL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTRL_SEQ_NO", key.getRSLT_CTRL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_SUM") && key.getSUPPLIED_ISSUE_QTY_SUM() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY_SUM", key.getSUPPLIED_ISSUE_QTY_SUM());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD") && key.getFROM_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("FROM_PUCH_ODR_CD", key.getFROM_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD") && key.getTO_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("TO_PUCH_ODR_CD", key.getTO_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_ITEM_CD") && key.getFROM_ITEM_CD() != null) {
					msgKey.setKeyValue("FROM_ITEM_CD", key.getFROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_LOT_NO") && key.getFROM_LOT_NO() != null) {
					msgKey.setKeyValue("FROM_LOT_NO", key.getFROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("TO_ITEM_CD") && key.getTO_ITEM_CD() != null) {
					msgKey.setKeyValue("TO_ITEM_CD", key.getTO_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_LOT_NO") && key.getTO_LOT_NO() != null) {
					msgKey.setKeyValue("TO_LOT_NO", key.getTO_LOT_NO());
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
					AD0050010Struct key = new AD0050010Struct();
					if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY")) {
						key.setTEMP_PLAN_QTY(msgKey.getKeyValue("TEMP_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY")) {
						key.setTEMP_USEOVER_QTY(msgKey.getKeyValue("TEMP_USEOVER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY")) {
						key.setTEMP_PLANOUT_QTY(msgKey.getKeyValue("TEMP_PLANOUT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USE_QTY")) {
						key.setTEMP_USE_QTY(msgKey.getKeyValue("TEMP_USE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name")) {
						key.setOPR_TIME_UNIT_TYP_name(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val")) {
						key.setOPR_TIME_UNIT_TYP_val(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_DN")) {
						key.setISSUE_TYP_DN(msgKey.getKeyValue("ISSUE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_DATE")) {
						key.seth_OPR_DATE(msgKey.getKeyValue("h_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("param1")) {
						key.setparam1(msgKey.getKeyValue("param1"));
					}
					if(msgKeyType.containsKeyColumn("param2")) {
						key.setparam2(msgKey.getKeyValue("param2"));
					}
					if(msgKeyType.containsKeyColumn("param3")) {
						key.setparam3(msgKey.getKeyValue("param3"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NO")) {
						key.seth_LOT_NO(msgKey.getKeyValue("h_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_name")) {
						key.setDEFECT_CAUSE_CD_name(msgKey.getKeyValue("DEFECT_CAUSE_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD_val")) {
						key.setDEFECT_CAUSE_CD_val(msgKey.getKeyValue("DEFECT_CAUSE_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY")) {
						key.setSAVE_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SAVE_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_COMMENT")) {
						key.setOUTPUT_RSLT_COMMENT(msgKey.getKeyValue("OUTPUT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD")) {
						key.setDEFECT_CAUSE_CD(msgKey.getKeyValue("DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT")) {
						key.setDEFECT_COMMENT(msgKey.getKeyValue("DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_PERSON")) {
						key.setOUTPUT_RSLT_PERSON(msgKey.getKeyValue("OUTPUT_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("h_RSLT_MODIFY_COUNT")) {
						key.seth_RSLT_MODIFY_COUNT(msgKey.getKeyValue("h_RSLT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("IN_OUTPUT_RSLT_CD")) {
						key.setIN_OUTPUT_RSLT_CD(msgKey.getKeyValue("IN_OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR")) {
						key.setISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("count_RCV_ISSUE")) {
						key.setcount_RCV_ISSUE(msgKey.getKeyValue("count_RCV_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_BY_ITEM")) {
						key.setMODIFY_COUNT_BY_ITEM(msgKey.getKeyValue("MODIFY_COUNT_BY_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OPR_RSLT_QTY")) {
						key.setSUM_OPR_RSLT_QTY(msgKey.getKeyValue("SUM_OPR_RSLT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON")) {
						key.setOPR_RSLT_PERSON(msgKey.getKeyValue("OPR_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT")) {
						key.setOPR_RSLT_COMMENT(msgKey.getKeyValue("OPR_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CRCT_NO")) {
						key.setOPR_CRCT_NO(msgKey.getKeyValue("OPR_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE")) {
						key.setWORK_CMPLT_DATE(msgKey.getKeyValue("WORK_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_CRCT_NO")) {
						key.setACPT_RSLT_CRCT_NO(msgKey.getKeyValue("ACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_CRCT_NO")) {
						key.setINSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("INSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_AMOUNT")) {
						key.setRCV_ISSUE_AMOUNT(msgKey.getKeyValue("RCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_OPR_RSLT")) {
						key.setMODIFY_COUNT_OPR_RSLT(msgKey.getKeyValue("MODIFY_COUNT_OPR_RSLT"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPENT_QTY")) {
						key.setSPENT_QTY(msgKey.getKeyValue("SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE_CHECK_FLG")) {
						key.setBEST_BEFORE_DATE_CHECK_FLG(msgKey.getKeyValue("BEST_BEFORE_DATE_CHECK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BBD_c_FLG")) {
						key.setBBD_c_FLG(msgKey.getKeyValue("BBD_c_FLG"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO")) {
						key.setRSLT_CTRL_SEQ_NO(msgKey.getKeyValue("RSLT_CTRL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_SUM")) {
						key.setSUPPLIED_ISSUE_QTY_SUM(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY_SUM"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD")) {
						key.setFROM_PUCH_ODR_CD(msgKey.getKeyValue("FROM_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD")) {
						key.setTO_PUCH_ODR_CD(msgKey.getKeyValue("TO_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ITEM_CD")) {
						key.setFROM_ITEM_CD(msgKey.getKeyValue("FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_LOT_NO")) {
						key.setFROM_LOT_NO(msgKey.getKeyValue("FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("TO_ITEM_CD")) {
						key.setTO_ITEM_CD(msgKey.getKeyValue("TO_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_LOT_NO")) {
						key.setTO_LOT_NO(msgKey.getKeyValue("TO_LOT_NO"));
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
