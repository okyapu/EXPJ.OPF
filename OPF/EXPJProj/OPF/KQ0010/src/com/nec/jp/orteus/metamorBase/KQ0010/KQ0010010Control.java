/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

import com.nec.jp.orteus.metamorBase.KQ0010.*;
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
import java.text.SimpleDateFormat;
import java.text.ParseException;

import utils.system;

import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
import com.nec.jp.orteus.expj.util.PrivateConfig;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KQ0010010Control
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
	public KQ0010010Struct getListvalue(int x) {
		return (KQ0010010Struct) (this.list.get(x));
	} // ���X�g�̒l��Ԃ��܂��B
	public KQ0010010Struct getStruct() {
		return this.struct;
	} // Struct��Ԃ��܂��B
	public KQ0010010Struct createStruct() {
		return new KQ0010010Struct();
	} // �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) {
		this.struct.setStruct((KQ0010010Struct) structname);
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
	// ��ЃR�[�h���Q�b�g
	public String get_companyCd() {
		return _companyCd;
	}
	// ��ЃR�[�h���Z�b�g
	public void set_companyCd(String cd) {
		_companyCd = cd;
	}
	/** �̔��Ǘ��p�H��R�[�h */
	private String _plantWeb;
	// �̔��Ǘ��p�H��R�[�h���Q�b�g
	public String get_plantWeb() {
		return _plantWeb;
	}
	// �̔��Ǘ��p�H��R�[�h���Z�b�g
	public void set_plantWeb(String web) {
		_plantWeb = web;
	}
	/** �Ɩ��^�p�� */
	private String _businessOprDate;
    // �Ɩ��^�p�����Q�b�g
	public String get_businessOprDate() {
		return _businessOprDate;
	}
	// �Ɩ��^�p�����Z�b�g	
	public void set_businessOprDate(String oprDate) {
		_businessOprDate = oprDate;
	}
	/** �M�݃R�[�h */
	private String _homeCurCd;
	//  �M�݃R�[�h���Q�b�g
	public String get_homeCurCd() {
		return _homeCurCd;
	}
	//  �M�݃R�[�h���Z�b�g
	public void set_homeCurCd(String curCd) {
		_homeCurCd = curCd;
	}
	/** �o�׏���L/T */
	private String _shipLt;
	// �o�׏���L/T���Q�b�g
	public String get_shipLt() {
		return _shipLt;
	}
	// �o�׏���L/T���Z�b�g
	public void set_shipLt(String lt) {
		_shipLt = lt;
	}
	/** �Z�[���̔������ */
	private String _dlvDateCdt;
	// �Z�[���̔���������Q�b�g
	public String get_dlvDateCdt() {
		return _dlvDateCdt;
	}
	// �Z�[���̔���������Z�b�g
	public void set_dlvDateCdt(String dateCdt) {
		_dlvDateCdt = dateCdt;
	}
	/** �V�X�p���@[�󒍎����ԓo�^]*/
	private String PRD_REQ_JOB_ODR_TYP_1;
	// �V�X�p���@[�󒍎����ԓo�^]���Q�b�g
	public String getPRD_REQ_JOB_ODR_TYP_1() {
		return PRD_REQ_JOB_ODR_TYP_1;
	}
	// �V�X�p���@[�󒍎����ԓo�^]���Z�b�g
	public void setPRD_REQ_JOB_ODR_TYP_1(String prd_req_job_odr_typ_1) {
		PRD_REQ_JOB_ODR_TYP_1 = prd_req_job_odr_typ_1;
	}
	/** �V�X�p���A[�󒍎����ԓo�^]*/
	private String PRD_REQ_JOB_ODR_TYP_2;
	// �V�X�p���A[�󒍎����ԓo�^]���Q�b�g
	public String getPRD_REQ_JOB_ODR_TYP_2() {
		return PRD_REQ_JOB_ODR_TYP_2;
	}
	// �V�X�p���A[�󒍎����ԓo�^]���Z�b�g
	public void setPRD_REQ_JOB_ODR_TYP_2(String prd_req_job_odr_typ_2) {
		PRD_REQ_JOB_ODR_TYP_2 = prd_req_job_odr_typ_2;
	}

	/** [�R���{�{�b�N�X�f�[�^]���i�j */
	private ComboStruct _odrTypStruct = new ComboStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i�j */
	private ComboStruct _spclPriceTypStruct = new ComboStruct();
	/** [�R���{�{�b�N�X�f�[�^]���i�j */
	private ComboStruct _depoTypStruct = new ComboStruct();
    /** �V�X�^���ݒ�l  */	
	private PrivateConfig privateConfig;
	/** �󒍏��F�t���O */
	private String _APR_ODR ;
	// �󒍏��F�t���O���Q�b�g
	public String get_APR_ODR() {
		return _APR_ODR;
	}
    // �󒍏��F�t���O���Z�b�g
	public void set_APR_ODR(String _apr_odr) {
		_APR_ODR = _apr_odr;
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
	 * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public void setInfoMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	

	/**
	 * �M�݊��Z�B
	 * @param amount �Ώۋ��z
	 * @param s �X�g���N�g�I�u�W�F�N�g
	 * @return �M�݋��z
	 * @throws SQLException �������s
	 * @throws ExpjException  �������s
	 */
	private String exchAmount(String amount, KQ0010010Struct s)
		throws SQLException, ExpjException {

		ExchAmount exch = new ExchAmount(conn);

		boolean result =
			exch.doExchAmount(
				amount,
				_companyCd,
				s.getl_CURRNCY_CD(),
				s.getl_EXCH_TYP(),
				s.getl_DETAIL_ROUND_TYP(),
				_businessOprDate);

		if (!result) {
			throw new ExpjException("KQ00038");
		}

		double exchAmount = exch.getD_EXCH_AMOUNT();

		return String.valueOf(exchAmount);
	}

	/**
	 * �ۂ߁B
	 * @param amount �Ώۋ��z
	 * @param s �X�g���N�g�I�u�W�F�N�g
	 * @return �ۂߋ��z
	 * @throws SQLException �������s
	 * @throws ExpjException �������s
	 */
	private String roundAmount(String amount, KQ0010010Struct s)
		throws SQLException, ExpjException {

		ExchAmount exch = new ExchAmount(conn);

		boolean result =
			exch.doMarume(
				amount,
				_companyCd,
				s.getl_CURRNCY_CD(),
				s.getl_EXCH_TYP(),
				s.getl_DETAIL_ROUND_TYP(),
				_businessOprDate);

		if (!result) {
			throw new ExpjException("KQ00038");
		}

		double roundAmount = exch.getD_EXCH_AMOUNT();

		return String.valueOf(roundAmount);
	}

	/**
	 * �Ɩ��^�p���v�Z���\�b�h�𕶎���Ŏ�舵�����߂̕ϊ����\�b�h
	 * @param dateValue ���t������
	 * @param margin ����������
     * @param plantCd �H��R�[�h
	 * @param moveFlg �O�|���t���O
	 * @return �v�Z���ʓ�
	 * @throws ParseException ������̓��t/���l�ϊ��Ɏ��s�����ꍇ�B
	 * @throws FoundationException ���ʕ��i�����Ŏ��s�����ꍇ
	 * @throws ExpjException �ғ����擾�Ɏ��s�����ꍇ
	 */
	private String calcWorkDate(String dateValue, String margin, String plantCd, boolean moveFlg)
		throws ParseException, FoundationException, ExpjException {

	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
		Date date = Converter.strToDate(dateValue, "yyyy/MM/dd");

		//�Ɩ����t�v�Z
		WorkCalendar wkd =
			new WorkCalendar(
				conn,
				sysUSER_CD,
				business.getBusinessCd(),
				plantCd,
				date,
				Integer.parseInt(margin),
				moveFlg);
		Date calcDate = wkd.calcDate();
		if (calcDate == null) {
			throw new ExpjException("KQ00040");
		}

		return Converter.dateToStr(calcDate, "yyyy/MM/dd");
	}

	private String calcWorkDate(String dateValue, String margin, String plantCd)
		throws ParseException, FoundationException, ExpjException {

		if (Integer.parseInt(margin) < 0) {
			return calcWorkDate(dateValue, margin, plantCd, true);
		} else {
			return calcWorkDate(dateValue, margin, plantCd, false);
		}
	}

	/**
	 * �o�׎w����v�Z
	 * @param desinatedDlvDate �w��[��
	 * @param transportLt �^������
	 * @param shipLt �o�׏���L/T
     * @param plantCd �H��R�[�h
	 * @return �o�׎w���
	 * @throws ParseException ������̓��t/���l�ϊ��Ɏ��s�����ꍇ�B
	 * @throws FoundationException ���ʕ��i�����Ŏ��s�����ꍇ
	 */
	private String calcDesinatedShipDate(
		String desinatedDlvDate,
		String transportLt,
		String shipLt,
        String plantCd)
		throws ParseException, FoundationException, ExpjException {

		// �O�|�����������߂�B
		String margin = Calculate.subtract("0", Calculate.add(transportLt, shipLt));
		// �o�׎w��������߂�B
		String desinatedShipDate = calcWorkDate(desinatedDlvDate, margin, plantCd, true);

		// �o�׎w������Ɩ��^�p���̏ꍇ�͋Ɩ��^�p����Ԃ��B
		if (DateTool.compareYMD(desinatedShipDate, _businessOprDate) < 0) {
			return _businessOprDate;
		} else {
			return desinatedShipDate;
		}
	}

	/**
	 * �Z�[������
	 * @param s �X�g���N�g�I�u�W�F�N�g
	 * @return �Z�[���̏ꍇ��true�A�����łȂ��ꍇ��false
	 * @throws ParseException ���t�f�[�^���s���ȏꍇ�B
	 */
	private boolean isQuickDelivery(KQ0010010Struct s)
		throws ParseException, FoundationException, ExpjException {
		String quickDeliveryDate = calcWorkDate(_businessOprDate, _dlvDateCdt, _plantWeb);

		// �Z�[��
		if (DateTool.compareYMD(quickDeliveryDate, s.getl_DESINATED_DLV_DATE()) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {

		initializeForm(true);
		initializeList();
	}

	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeList() {
		list = null;

		readStatus = INITIAL;
	}

	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
     * @param clearFlg �N���A�t���O
	 */
	private void initializeForm(boolean clearFlg) {

        if (clearFlg) {
            struct.setNO(null);
            struct.setODR_TYP("2");
            struct.setCUST_ODR_NO(null);
            struct.setCUST_ITEM_CD(null);
            struct.setCUST_CD(null);
            struct.setDLV_LOC_CD(null);
            struct.setDESINATED_DLV_DATE(null);
            struct.setODR_QTY("0");
            struct.setODR_UNIT_PRICE("0");
            struct.setSPCL_PRICE_TYP("0");
            struct.setREMARKS(null);
            struct.seth_BUSINESS_OPR_DATE(_businessOprDate);
            struct.setODR_ACPT_DATE(_businessOprDate);
            struct.seth_PRD_REQ_JOB_ODR_TYP_1(PRD_REQ_JOB_ODR_TYP_1);
            struct.seth_PRD_REQ_JOB_ODR_TYP_2(PRD_REQ_JOB_ODR_TYP_2);
            struct.setJOB_ODR_QTY("0");
            struct.setJOB_ODR_DLV_DATE(null);
            struct.setALC_GRP_CD(null);
            struct.setJOB_ODR_CD(null);
            struct.setAPPR_REMARKS(null); // ���F���l
            readStatus = INITIAL;
        }
		//readStatus = INITIAL;
	}

	/**
	 * �u�ǉ��v�u�C���v�{�^���������ɉ�ʕ\���Ɠo�^�ɕK�v�ȃf�[�^���擾���܂��B
	 * @param s �Q�ƑΏۂ�struct
	 * @throws BusinessProcessException �Ɩ���O�����ꍇ
	 * @throws FoundationException �Ɩ���O�����������ꍇ
	 */
	public void refer2Master(KQ0010010Struct s)
		throws BusinessProcessException, FoundationException {
		try {

			s.setl_COMPANY_CD(_companyCd);
			s.setBUSINESS_OPR_DATE(_businessOprDate);

			// ���Ӑ���̎擾
			List custList = entity.mM_CUST.read(conn, s);
			if (custList.isEmpty()) {
				setErrorMessage("KQ00014");
				setErrorParameter("M_CUST", "CUST_CD", s.getl_CUST_CD());
				return;
			}
			// ���Ӑ���̃f�[�^�Z�b�g
			KQ0010010Struct custStruct = (KQ0010010Struct) custList.get(0);
			s.setl_CUST_ANAME(custStruct.getl_CUST_ANAME());
			s.setl_OWN_ORG_CD(custStruct.getl_OWN_ORG_CD());
			s.setl_OWN_PERSON_CD(custStruct.getl_OWN_PERSON_CD());
			if (custStruct.getl_CUR_CD() == null || "".equals(custStruct.getl_CUR_CD())) {
				s.setl_CUR_CD(_homeCurCd);
				s.setl_CURRNCY_CD(_homeCurCd);
			} else {
				s.setl_CUR_CD(custStruct.getl_CUR_CD());
				s.setl_CURRNCY_CD(custStruct.getl_CUR_CD());
			}
			s.setl_EXCH_TYP(custStruct.getl_EXCH_TYP());
			s.setl_TAX_APPLY_TYP(custStruct.getl_TAX_APPLY_TYP());
			
			s.setl_TAX_CD(custStruct.getl_TAX_CD());
			s.setl_TAX_CALC_TYP(custStruct.getl_TAX_CALC_TYP());
			s.setl_DETAIL_ROUND_TYP(custStruct.getl_DETAIL_ROUND_TYP());
			s.setl_PARTIAL_SHIP_INST_FLG(custStruct.getl_PARTIAL_SHIP_INST_FLG());

			// �ʉݏ��̎擾
			List curList = entity.mM_CUR.read(conn, s);
			if (curList.isEmpty()) {
				setErrorMessage("KQ00073");
				setErrorParameter("M_CUR", "CUR_CD", s.getl_CUR_CD());
				return;
			}
			// �ʉݏ��̃f�[�^�Z�b�g
			KQ0010010Struct curStruct = (KQ0010010Struct) curList.get(0);
			s.setl_CUR_UNIT(curStruct.getl_CUR_UNIT());

			// �[�i�ꏊ���̃`�F�b�N
			List custBaseList = entity.mM_CUST_BASE.read(conn, s);
			if (custBaseList.isEmpty()) {
				setErrorMessage("KQ00015");
				setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getl_COMPANY_CD());
				setErrorParameter("M_CUST_BASE", "CUST_CD", s.getl_CUST_CD());
				setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", s.getl_DLV_LOC_CD());
				return;
			} else if (custBaseList.size() > 1) {
				setErrorMessage("KQ00016");
				setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getl_COMPANY_CD());
				setErrorParameter("M_CUST_BASE", "CUST_CD", s.getl_CUST_CD());
				setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", s.getl_DLV_LOC_CD());
				return;
			}
			// �[�i�ꏊ���̃f�[�^�Z�b�g
			KQ0010010Struct custBaseStruct = (KQ0010010Struct) custBaseList.get(0);
			s.setl_DLV_LOC_CD(custBaseStruct.getl_DLV_LOC_CD());
			s.setl_DLV_LOC_NAME(custBaseStruct.getl_DLV_LOC_NAME());
			s.setl_TRANSPORT_CD(custBaseStruct.getl_TRANSPORT_CD());
			s.setl_TRANSPORT_LT(custBaseStruct.getl_TRANSPORT_LT());
			s.setl_TRANSPORT_TYP(custBaseStruct.getl_TRANSPORT_TYP());
            s.seth_SHIP_PLANT_CD(custBaseStruct.geth_SHIP_PLANT_CD());

			String yotaku_DEPO_WH_CD=custBaseStruct.getl_DEPO_WH_CD();//sww�ǉ�20040727���o�a���ۊǋ�̎擾

			// ���i���̎擾
			List itemSpecList = entity.mM_ITEM_SPEC.read(conn, s);
			if (itemSpecList.isEmpty()) {
				setErrorMessage("KQ00017");
				setErrorParameter("M_ITEM_SPEC", "CUST_ITEM_CD", s.getl_CUST_ITEM_CD());
				return;
			}
			// ���i���f�[�^�Z�b�g
			KQ0010010Struct itemSpecStruct = (KQ0010010Struct) itemSpecList.get(0);
			s.setl_ITEM_CD(itemSpecStruct.getl_ITEM_CD());
			s.setl_CUST_ITEM_NAME(itemSpecStruct.getl_CUST_ITEM_NAME());
			// �J�n���i����̗a���q�ɋ敪�̎擾
			s.setl_DEPO_TYP(itemSpecStruct.getl_DEPO_TYP());
			
			// Add Start 20131217 liu-chy
			if("1".equals(custStruct.getl_TAX_APPLY_TYP())){
				// ���i���̎擾
				s.setl_TAX_CD(itemSpecStruct.getl_TAX_CD());
			}
			// Add END 20131217 liu-chy
			
			// �a���敪��20�A���A�����敪��3:�m��̏ꍇ�̓G���[
			if ("20".equals(s.getl_DEPO_TYP()) && "3".equals(s.getl_ODR_TYP())) {
				setErrorMessage("KQ00081");
				return;
			}

			s.setl_DEPO_TYP_DN(getComboData(_depoTypStruct, itemSpecStruct.getl_DEPO_TYP()));

			// �u���l�敪�v��"0:���K"�̏ꍇ�A�P�������擾
			if ("0".equals(s.getl_SPCL_PRICE_TYP())) {
				s.setl_EFF_PHASE_IN_DATE(_businessOprDate);
				List unitCostList = entity.mM_UNIT_COST.read(conn, s);
				if (unitCostList.isEmpty()) {
					// �P����񂪖�����΃G���[
					setErrorMessage("KQ00021");
					setErrorParameter("M_UNIT_COST", "COMPANY_CD", s.getl_COMPANY_CD());
					setErrorParameter("M_UNIT_COST", "CUST_CD", s.getl_CUST_CD());
					setErrorParameter("M_UNIT_COST", "ITEM_CD", s.getl_ITEM_CD());
					setErrorParameter("M_UNIT_COST", "EFF_PHASE_IN_DATE", s.getl_EFF_PHASE_IN_DATE());
					return;
				}
				KQ0010010Struct unitCostStruct = (KQ0010010Struct) unitCostList.get(0);
				//�P����񂪂���Ύ擾�����l��ݒ�
				s.setl_ODR_UNIT_PRICE(unitCostStruct.getl_UNIT_COST());
				s.setl_UNIT_PRICE(unitCostStruct.getl_UNIT_COST());
			} else {
				s.setl_UNIT_PRICE(s.getl_ODR_UNIT_PRICE());
			}
            // �P���C���i���͗��j
            struct.setODR_UNIT_PRICE(s.getl_ODR_UNIT_PRICE());

			// �i�ڏ��̃`�F�b�N
			List itemList = entity.mM_ITEM.read(conn, s);
			if (itemList.isEmpty()) {
				setErrorMessage("KQ00027");
				setErrorParameter("M_ITEM", "ITEM_CD", s.getl_ITEM_CD());
				return;
			}
			//�a���q�ɋ敪�̔�NULL�`�F�b�N
			if ("20".equals(s.getl_DEPO_TYP()) && (yotaku_DEPO_WH_CD==null)) {
				setErrorMessage("KQ20001");
				return;
			}
			// �f�[�^�Z�b�g
			KQ0010010Struct itemStruct = (KQ0010010Struct) itemList.get(0);
			s.setl_ITEM_NAME(itemStruct.getl_ITEM_NAME());
			s.setl_UNIT_CD(itemStruct.getl_STOCK_UNIT());
            s.setl_UNIT_QTY_TYP(itemStruct.getl_UNIT_QTY_TYP());
            s.seth_MRP_ODR_TYP(itemStruct.geth_MRP_ODR_TYP());

            // �����Ǘ��`�F�b�N
            if ("1".equals(s.getl_UNIT_QTY_TYP())) {
                // �����Ǘ�
                if (s.getl_ODR_QTY().indexOf(".") >= 0) {
                    // �������͂̏ꍇ�F�؏グ
                    String tempString = s.getl_ODR_QTY();
                    double tempDouble1 = Double.parseDouble(tempString);
                    s.setl_ODR_QTY(Calculate.ceil(s.getl_ODR_QTY(), 0));
                    double tempDouble2 = Double.parseDouble(s.getl_ODR_QTY());
                    if (tempDouble1 != tempDouble2) {
                        // ".0"���͏��O
                        setWarningMessage("KQ20004");
                        setWarningParameter("T_ODR", "ODR_QTY", tempString);
                    }
                }
            }
            // �����Ǘ��`�F�b�N	
            if ("1".equals(s.getl_UNIT_QTY_TYP()) && "true".equals(s.geth_DOODRFLG())) {
                // �����Ǘ�
                if (s.getl_JOB_ODR_QTY().indexOf(".") >= 0) {
                    // �������͂̏ꍇ�F�؏グ
                    String tempString = s.getl_JOB_ODR_QTY();
                    double tempDouble1 = Double.parseDouble(tempString);
                    s.setl_JOB_ODR_QTY(Calculate.ceil(s.getl_JOB_ODR_QTY(), 0));
                    double tempDouble2 = Double.parseDouble(s.getl_JOB_ODR_QTY());
                    if (tempDouble1 != tempDouble2) {
                        // ".0"���͏��O
                        setWarningMessage("KQ20004");
                        setWarningParameter("T_JOB_ODR", "JOB_ODR_QTY", tempString);
                    }
                }
            }

		} /*catch (ParseException e) {
			throw new ExpjException(e);
		}*/ catch (SQLException e) {
			throw new ExpjException(e);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");
			//{{user_implement_dev:<controlAddition>

		// ���X�g��null�̏ꍇ�͐�������B
		if (list == null) {
			list = new ArrayList(0);
		}

		// �ꗗ�f�[�^���ő�\���s���𒴂��Ă����ꍇ
		// �i�ǉ��O�̎��O�`�F�b�N�̂��߁Asize + 1�Ɣ�r����j
		int maxLine = sp.getMaxLine(conn, 10);
		if ((maxLine != 0) && (list.size() + 1 > maxLine)) {
			setErrorMessage("KQ00100", String.valueOf(maxLine));
			// �ő�s���I�[�o�[
			readStatus = TOO_MANY;
			return;
		}

		// �uNO�v�����߂�B
		int no = list.size() + 1;

		// ���͓��e���ꗗ�p�X�g���N�g���쐬
		KQ0010010Struct newListStruct = new KQ0010010Struct();
		newListStruct.setl_NO(String.valueOf(no));
		newListStruct.setl_ODR_TYP(struct.getODR_TYP());
		newListStruct.setl_ODR_TYP_DN(getComboData(_odrTypStruct, struct.getODR_TYP()));
		newListStruct.setl_CUST_ODR_NO(struct.getCUST_ODR_NO());
		newListStruct.setl_CUST_ITEM_CD(struct.getCUST_ITEM_CD());
		newListStruct.setl_CUST_CD(struct.getCUST_CD());
		newListStruct.setl_DLV_LOC_CD(struct.getDLV_LOC_CD());
		newListStruct.setl_DESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
		newListStruct.setl_ODR_QTY(struct.getODR_QTY());
		newListStruct.setl_ODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
		newListStruct.setl_SPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
		newListStruct.setl_SPCL_PRICE_TYP_DN(getComboData(_spclPriceTypStruct, struct.getSPCL_PRICE_TYP()));
		newListStruct.setl_REMARKS(struct.getREMARKS());
		newListStruct.setl_ODR_ACPT_DATE(struct.getODR_ACPT_DATE());
		newListStruct.setl_APPR_REMARKS(struct.getAPPR_REMARKS());  // ���F���l
		// ��ʂ�"���Ԏ�z�𓯎��ɍs��"���`�F�b�N����Ă���ꍇ�A��z���ʁA���Ԕ[���ƈ����O���[�v�R�[�h���擾�B
		if("true".equals(struct.getc_DOODR())){
			newListStruct.seth_DOODRFLG("true");
			newListStruct.setl_JOB_ODR_QTY(struct.getJOB_ODR_QTY());
			newListStruct.setl_JOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			newListStruct.setl_ALC_GRP_CD(struct.getALC_GRP_CD());
			struct.seth_CHECK_STATUS("true");
			// ���Ԃ��擾�B
			if("true".equals(struct.getc_INPUTODRCD())){
				newListStruct.setl_JOB_ODR_CD(struct.getJOB_ODR_CD());
				newListStruct.seth_INPUTODRCDFLG("true");
			}else{
				newListStruct.setl_JOB_ODR_CD(null);
				newListStruct.seth_INPUTODRCDFLG("false");
			}
		}else{
			newListStruct.seth_DOODRFLG("null");
			newListStruct.setl_JOB_ODR_QTY(null);
			newListStruct.setl_JOB_ODR_DLV_DATE(null);
			newListStruct.setl_ALC_GRP_CD(null);
			newListStruct.seth_INPUTODRCDFLG("null");
			newListStruct.setl_JOB_ODR_CD(null);
			struct.seth_CHECK_STATUS("false");
		}
		

		// �}�X�^�Q�Ə������s���B
		refer2Master(newListStruct);
		// �G���[������Ώ����𒆒f
		if (msgStruct.hasError()) {
			return;
		}

		// �ꗗ��ǉ�
		list.add(newListStruct);

		// �Ǎ�����
		readStatus = NORMAL;
		
		// �ҏW�t�H�[����������
		initializeForm(false);

                //}}user_implement_dev:<controlAddition>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");

		return;
	}

	/**
	 * �C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>

		for (int i = 0; i < list.size(); i++) {
			// �C���Ώۂ́uNO�v��T���B
			KQ0010010Struct listStruct = (KQ0010010Struct) list.get(i);
			if (listStruct.getl_NO().equals(struct.getNO())) {

				// �C���Ώۂ̃X�g���N�g����͓��e�����蒼���B
				KQ0010010Struct newListStruct = new KQ0010010Struct();
				newListStruct.setl_NO(struct.getNO());
				newListStruct.setl_ODR_TYP(struct.getODR_TYP());
				newListStruct.setl_ODR_TYP_DN(getComboData(_odrTypStruct, struct.getODR_TYP()));
				newListStruct.setl_CUST_ODR_NO(struct.getCUST_ODR_NO());
				newListStruct.setl_CUST_ITEM_CD(struct.getCUST_ITEM_CD());
				newListStruct.setl_CUST_CD(struct.getCUST_CD());
				newListStruct.setl_DLV_LOC_CD(struct.getDLV_LOC_CD());
				newListStruct.setl_DESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
				newListStruct.setl_ODR_QTY(struct.getODR_QTY());
				newListStruct.setl_ODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
				newListStruct.setl_SPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
				newListStruct.setl_SPCL_PRICE_TYP_DN(getComboData(_spclPriceTypStruct, struct.getSPCL_PRICE_TYP()));
				newListStruct.setl_REMARKS(struct.getREMARKS());
				newListStruct.setl_APPR_REMARKS(struct.getAPPR_REMARKS());  // ���F���l
				newListStruct.setl_ODR_ACPT_DATE(struct.getODR_ACPT_DATE());
				// ��ʂ�"���Ԏ�z�𓯎��ɍs��"���`�F�b�N����Ă���ꍇ�A��z���ʁA���Ԕ[���ƈ����O���[�v�R�[�h���擾�B
				if("true".equals(struct.getc_DOODR())){
					newListStruct.seth_DOODRFLG("true");
					newListStruct.setl_JOB_ODR_QTY(struct.getJOB_ODR_QTY());
					newListStruct.setl_JOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
					newListStruct.setl_ALC_GRP_CD(struct.getALC_GRP_CD());
					struct.seth_CHECK_STATUS("true");
					// ��ʂ�"���Ԃ�����͂���"���`�F�b�N����Ă���ꍇ�A���Ԃ��擾�B
					if("true".equals(struct.getc_INPUTODRCD())){
						newListStruct.setl_JOB_ODR_CD(struct.getJOB_ODR_CD());
						newListStruct.seth_INPUTODRCDFLG("true");
					}else{
						newListStruct.setl_JOB_ODR_CD(null);
						newListStruct.seth_INPUTODRCDFLG("false");
					}
				}else{
					newListStruct.seth_DOODRFLG("null");
					newListStruct.setl_JOB_ODR_QTY(null);
					newListStruct.setl_JOB_ODR_DLV_DATE(null);
					newListStruct.setl_ALC_GRP_CD(null);
					newListStruct.seth_INPUTODRCDFLG("null");
					newListStruct.setl_JOB_ODR_CD(null);
					struct.seth_CHECK_STATUS("false");
				}
				// �}�X�^�Q�Ƃ��s���B
				refer2Master(newListStruct);
				// �G���[������Ώ����𒆒f
				if (msgStruct.hasError()) {
					return;
				}

				// �ꗗ�f�[�^���㏑������B
				list.set(i, newListStruct);

				// �Ǎ�����
				readStatus = NORMAL;
				
				// �ҏW�t�H�[����������
				initializeForm(false);

				return;
			}
		}
                //}}user_implement_dev:<controlModify>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * �����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlEliminate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");
			//{{user_implement_dev:<controlEliminate>
		for (int i = 0; i < list.size(); i++) {

			// �폜�Ώۂ́uNO�v��T���B
			KQ0010010Struct listStruct = (KQ0010010Struct) list.get(i);
			if (listStruct.getl_NO().equals(struct.getNO())) {

				// �Ώۃf�[�^���ꗗ����폜
				list.remove(i);

				// �폜�����f�[�^�ȍ~�Ƀf�[�^����ꍇ�͂��̃f�[�^�́uNO�v��1�J��グ��B
				for (int j = i; j < list.size(); j++) {
					KQ0010010Struct modifyListStruct = (KQ0010010Struct) list.get(j);
					int newNo = Integer.valueOf(modifyListStruct.getl_NO()).intValue() - 1;
					modifyListStruct.setl_NO(String.valueOf(newNo));
					list.set(j, modifyListStruct);
				}

				// �ҏW�t�H�[����������
				initializeForm(true);

				//return;
			}
		}
		// �r���[�̏�Ԑݒ�
	  int cnt = list.size();         // �폜�ς݁A���X�g�̃T�C�Y
	  if(cnt != 0){
				// �Ǎ�����
				readStatus = NORMAL;
	  }else{
				// �������
				readStatus = INITIAL;
	  }
	  
                //}}user_implement_dev:<controlEliminate>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try {
			// �S���R�[�h�̓o�^����
			boolean appSucessFlg = false;
			
			for (int i = 0; i < list.size();) {
				KQ0010010Struct listStruct = (KQ0010010Struct) list.get(i);

				// ���F�������A�ۑ��f�[�^�ă`�F�b�N
				if ("3".equals(listStruct.geth_APR_ODR())) {
					refer2Master(listStruct);
				}
				
				
				// �o�^/�X�V�p�V�X�e���f�[�^��ݒ�
				listStruct.setsOraganization_CD(struct.getsOrganization_CD());
				listStruct.setsSysdate(struct.getsSysdate());
				listStruct.setsUser_ID(struct.getsUser_ID());
			
				// [���].�h���Ԏ�z�𓯎��ɍs���h���`�F�b�NON�̏�ԂŁA�ȉ��̃`�F�b�N���s��
				if("true".equals(listStruct.geth_DOODRFLG())){
					// [���]. "���ԓ��͂���"���`�F�b�NON�̏�ԂŁA���͂������Ԃ�[���Ԍv��]�ɑ��݂̃`�F�b�N
					if("true".equals(listStruct.geth_INPUTODRCDFLG())){
						if(Numbering.checkNumber(conn, Numbering.JOB_OD_CD,listStruct.getJOB_ODR_CD()) == true){
			                    String Message = "T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD();
			                    setErrorMessage("AB00024", Message);
			                   }
						boolean blnRepeat = false;
						blnRepeat = entity.mCHECK_JOB_ODR_CD.check(conn,listStruct);
						if(blnRepeat){
							setErrorMessage("ZZ01102");
							setErrorParameter("","",listStruct.getl_JOB_ODR_CD());
							return;
						}
					}
					// [�i��]."�i�ڎ�z�敪"�@���P�F���ԁA2�F�݌Ɉ����^���ԈȊO�̃`�F�b�N
					if(!"1".equals(listStruct.geth_MRP_ODR_TYP())&&!"2".equals(listStruct.geth_MRP_ODR_TYP())){
						setErrorMessage("KQ00324",listStruct.getl_CUST_ITEM_CD());
						return;
					}
					// ���Y�H��i�[�i�ꏊ�R�[�h���炻�̏o�בq�ɂ�����H��擾�j�̃J�����_�[���擾�̃`�F�b�N
					boolean blnCalendaExist = false;
					blnCalendaExist = entity.mCHECK_CAL.check(conn,listStruct);
					if(!blnCalendaExist){
						setErrorMessage("KQ00325");
						setErrorParameter("","",listStruct.getl_DLV_LOC_CD());
						return;
					}
					// ���Ԕ[��
					String strJobOdrDlvDate = listStruct.getl_JOB_ODR_DLV_DATE();
					// �u�H��R�[�h�v�͔[�i�ꏊ�R�[�h���炻�̏o�׌��q�ɂ�����H����擾����
					String plant_cd = listStruct.geth_SHIP_PLANT_CD();
					if(plant_cd == null || "".equals(plant_cd)){
						setErrorMessage("AB00023");
						return ;
					}
					// ���Ԕ[����Null�ȊO�A���Y�H��łŔ�ғ����̂̃`�F�b�N
					if(strJobOdrDlvDate != null && !"".equals(strJobOdrDlvDate)){
						boolean blnHoliday = false;
						blnHoliday = entity.mCHECK_HOLIDAY.check(conn,listStruct);
						if(blnHoliday){
							setErrorMessage("KQ00326");
							setErrorParameter("","",listStruct.getl_JOB_ODR_DLV_DATE());
							return;
						}
					}
					else{
						// �Ɩ����t�v�Z���i�ɓn�����Z��(�^������+�o�׏���LT)���v�Z����
						String transportLt = listStruct.getl_TRANSPORT_LT();
						int amount = Integer.parseInt(Calculate.add(transportLt, _shipLt));
						// �Ɩ����t�v�Z���i�̐���
						WorkCalendar wkd = new WorkCalendar(conn,sysUSER_CD,business.getBusinessCd(),plant_cd,Converter.strToDate(listStruct.getl_DESINATED_DLV_DATE(), "yyyy/MM/dd"),amount*(-1),true);
						Date calcDate = wkd.calcDate();
						// ���Ԕ[����Null�̏ꍇ�A���Ԕ[���Z�o�����炩�̗��R�łł��Ȃ��Ƃ�
						if (calcDate == null) {
							throw new ExpjException("KQ00327");
						}
						strJobOdrDlvDate = Converter.dateToStr(calcDate, "yyyy/MM/dd");
						listStruct.setl_JOB_ODR_DLV_DATE(strJobOdrDlvDate);
					}
					//�@���Ԑ��ʂ��擾
					if(listStruct.getl_JOB_ODR_QTY() == null || listStruct.getl_JOB_ODR_QTY().equals("") || Float.parseFloat(listStruct.getl_JOB_ODR_QTY())==0){
						listStruct.setl_JOB_ODR_QTY(listStruct.getl_ODR_QTY());
					}
					//�@����
					String strJobOdrCD = "";
					//�@���Ԃ���͂���
					if("true".equals(listStruct.geth_INPUTODRCDFLG())){
						strJobOdrCD = listStruct.getl_JOB_ODR_CD();
					} else {
						//�@���Ԃ���͂��܂���A�V�X�p���A�u�󒍓o�^���̐��ԍ̔ԕ��@�v���O�F�����̔ԁi�P�������j�̏ꍇ�B[���ԍ̔�].�g�̔ԍςݐ��ԁh�̒l �� ���݂̒l�{�P �ōX�V����B
						if ("0".equals(PRD_REQ_JOB_ODR_TYP_2)) {
							Numbering number = new Numbering(conn,Numbering.JOB_OD_CD, struct.getsUser_ID(),sp.getProcId(), listStruct.geth_SHIP_PLANT_CD());
							strJobOdrCD = number.getNo();
							if (strJobOdrCD == null) {
								setErrorMessage("AB00023");
								return ;
							}
							listStruct.setl_JOB_ODR_CD(strJobOdrCD);
						} 
					}
				}
                
				/** ���F�˗�����ꍇ�A�y�󒍏��F�˗������z���Ăяo�� */
				if ("1".equals(struct.geth_APR_ODR())) {
				    //�@�S�����呶�݃`�F�b�N
					if (listStruct.getl_OWN_ORG_CD() == null || "".equals(listStruct.getl_OWN_ORG_CD())  ) {
						setErrorMessage("KQ00335");
						return;
					}
					beginTransaction();
					ApprProc.execInsertProcess(conn, listStruct, this);
					appSucessFlg = true;
					
					// ��ʏ㕔��list����1���폜����
					list.remove(i);
					continue;
				}	
				
				// [�󒍊Ǘ�]���̓o�^
				List odrCtlList = entity.mT_ODR_CTL.read(conn, listStruct);
				if (odrCtlList.isEmpty()) {
					// �󒍊Ǘ���񂪖����ꍇ�A�󒍊Ǘ��ԍ����̔Ԃ��A�󒍊Ǘ��e�[�u���Ƀ��R�[�h��o�^����
					// [�󒍊Ǘ�]."�󒍊Ǘ��ԍ�"�̍̔�
					List seqOdrCtlList = entity.mSEQ_ODR_CTL.read(conn, listStruct);
					if (seqOdrCtlList.isEmpty()) {
						setErrorMessage("KQ00030", String.valueOf(i + 1));
						return;
					}
					KQ0010010Struct seqOdrCtlStruct = (KQ0010010Struct) seqOdrCtlList.get(0);
					// [�󒍊Ǘ�]�o�^�p�f�[�^�̐ݒ�
					listStruct.setl_ODR_CTL_NO(seqOdrCtlStruct.getl_ODR_CTL_NO());
					// [�󒍊Ǘ�]�̓o�^
					entity.mT_ODR_CTL.create(conn, listStruct);
				} else if (odrCtlList.size() > 1) {
					// �󒍊Ǘ���񂪕��������݂���ꍇ�A�G���[���b�Z�[�W�o��
					setErrorMessage("KQ00029", String.valueOf(i + 1));
					setErrorParameter("T_ODR_CTL", "CUST_CD", listStruct.getl_CUST_CD());
					setErrorParameter("T_ODR_CTL", "CUST_ITEM_CD", listStruct.getl_CUST_ITEM_CD());
					return;
				} else {
					KQ0010010Struct odrCtlStruct = (KQ0010010Struct) odrCtlList.get(0);
					listStruct.setl_ODR_CTL_NO(odrCtlStruct.getl_ODR_CTL_NO());
				}

				// [�󒍖���]."�󒍔ԍ�"�̎擾
				List seqOdrList = entity.mSEQ_ODR.read(conn, listStruct);
				if (seqOdrList.isEmpty()) {
					setErrorMessage("KQ00031", String.valueOf(i + 1));
					return;
				}
				KQ0010010Struct seqOdrStruct = (KQ0010010Struct) seqOdrList.get(0);

				// [�󒍖���]�o�^�p�f�[�^�̐ݒ�
				listStruct.setl_ODR_NO(seqOdrStruct.getl_ODR_NO());
				listStruct.setl_CUST_CHRG_ORG_CD(listStruct.getl_OWN_ORG_CD());
				listStruct.setl_CUST_CHRG_PSN_CD(listStruct.getl_OWN_PERSON_CD());
				listStruct.setl_ODR_ACPT_ORG_CD(null);
				listStruct.setl_ODR_ACPT_PSN_CD(sysUSER_CD);
				listStruct.setl_CURRNCY_CD(listStruct.getl_CUR_CD());
				listStruct.setl_DLV_LOC_NAME_KANJI(listStruct.getl_DLV_LOC_NAME());
				listStruct.setl_STD_DESINATED_RCV_DATE(listStruct.getl_DESINATED_DLV_DATE());
				if ("2".equals(listStruct.getl_ODR_TYP())) {
					listStruct.setl_REMAIN_UNCONFIRM_ODR_QTY(listStruct.getl_ODR_QTY());
				} else {
					listStruct.setl_REMAIN_UNCONFIRM_ODR_QTY("0");
				}
				if ("2".equals(listStruct.getl_ODR_TYP())) {
					String unconfirmOdrBalance =
						Calculate.multiply(listStruct.getl_REMAIN_UNCONFIRM_ODR_QTY(),listStruct.getl_ODR_UNIT_PRICE());

					try {
						listStruct.setl_UNCONFIRM_ODR_BALANCE(roundAmount(unconfirmOdrBalance, listStruct));
					} catch (ExpjException e) {
						setErrorMessage("KQ00038");
						setErrorParameter("", "AMOUNT", unconfirmOdrBalance);
						setErrorParameter("", "COMPANY_CD", _companyCd);
						setErrorParameter("", "CURRNCY_CD", listStruct.getl_CURRNCY_CD());
						setErrorParameter("", "EXCH_TYP", listStruct.getl_EXCH_TYP());
						setErrorParameter("","DETAIL_ROUND_TYP",listStruct.getl_DETAIL_ROUND_TYP());
						setErrorParameter("", "BUSINESS_OPR_DATE", _businessOprDate);
						return;
					}
				} else {
					listStruct.setl_UNCONFIRM_ODR_BALANCE("0");
				}

				String odrAmount = Calculate.multiply(listStruct.getl_ODR_QTY(), listStruct.getl_ODR_UNIT_PRICE());
				try {
					listStruct.setl_ODR_AMOUNT(roundAmount(odrAmount, listStruct));
					listStruct.setl_ODR_AMOUNT_EXCH_RATES(exchAmount(odrAmount, listStruct));
				} catch (ExpjException e) {
					setErrorMessage("KQ00038");
					setErrorParameter("", "AMOUNT", odrAmount);
					setErrorParameter("", "COMPANY_CD", _companyCd);
					setErrorParameter("", "CURRNCY_CD", listStruct.getl_CURRNCY_CD());
					setErrorParameter("", "EXCH_TYP", listStruct.getl_EXCH_TYP());
					setErrorParameter("", "DETAIL_ROUND_TYP", listStruct.getl_DETAIL_ROUND_TYP());
					setErrorParameter("", "BUSINESS_OPR_DATE", _businessOprDate);
					return;
				}
				if (isQuickDelivery(listStruct)
					&& ("3".equals(listStruct.getl_ODR_TYP())
						|| ("2".equals(listStruct.getl_ODR_TYP())
							&& "20".equals(listStruct.getl_DEPO_TYP())))) {
					listStruct.setl_SHIP_PLAN_REMAIN_QTY("0");
				} else {
					listStruct.setl_SHIP_PLAN_REMAIN_QTY(listStruct.getl_ODR_QTY());
				}
				//�@���Ԑݒ�t���O��0
				listStruct.setl_JOB_ODR_SET_FLG("0");
				

	            //�V�X�e���p�����^���擾�̕��@
				PrivateConfig privateConfig = new PrivateConfig(conn);				
				// �p�����[�^�iCAR_PLAN_DEPO_AREA�j���擾
				String shipSlipPartName = privateConfig.getString("SHIP_SLIP_PART_NAME");	

				//��ʕi���ݒ�
				if(!"2".equals(shipSlipPartName) && !"1".equals(shipSlipPartName)){
					listStruct.setPART_NAME("");
				}else if("1".equals(shipSlipPartName)){
					listStruct.setPART_NAME(listStruct.getl_ITEM_NAME());
				}else{
					listStruct.setPART_NAME(listStruct.getl_CUST_ITEM_NAME());
				}

				
				// [�󒍖���]�̓o�^
				entity.mT_ODR.create(conn, listStruct);

				// [�󒍗���]."�󒍗���ԍ�"���̔�
				List seqRsltOdrList = entity.mSEQ_RSLT_ODR.read(conn, listStruct);
				if (seqRsltOdrList.isEmpty()) {
					setErrorMessage("KQ00035", String.valueOf(i + 1));
					return;
				}
				KQ0010010Struct seqRsltOdrStruct = (KQ0010010Struct) seqRsltOdrList.get(0);

				// [�󒍗���]�o�^�p�f�[�^�̐ݒ�
				listStruct.setl_RSLT_CTL_SEQ_CD(seqRsltOdrStruct.getl_RSLT_CTL_SEQ_CD());
				// �P�ʐݒ�
				listStruct.setl_UNIT(listStruct.getl_UNIT_CD());
                //�@�[�i�ꏊ�R�[�h
				listStruct.setl_DLV_PLACE_CD(listStruct.getl_DLV_LOC_CD());
				// [�󒍗���]�̓o�^
				entity.mT_ODR_ACPT_RSLT.create(conn, listStruct);

				// �u�����敪�v��"3:�m��"�̏ꍇ�͓����m�蒍������������s��
				if ("3".equals(listStruct.getl_ODR_TYP())) {

					List odrUnconfirmList = entity.mT_ODR_Unconfirm.read(conn, listStruct);

					String odrQty = listStruct.getl_ODR_QTY();

					for (int j = 0; j < odrUnconfirmList.size(); j++) {
						KQ0010010Struct odrUnconfirmStruct = (KQ0010010Struct) odrUnconfirmList.get(j);

						// �o�^/�X�V�p�V�X�e���f�[�^��ݒ�
						odrUnconfirmStruct.setsOraganization_CD(struct.getsOrganization_CD());
						odrUnconfirmStruct.setsSysdate(struct.getsSysdate());
						odrUnconfirmStruct.setsUser_ID(struct.getsUser_ID());

						// [�����m�蒍�����]�f�[�^��ݒ�
						odrUnconfirmStruct.setl_FIXED_ODR_NO(listStruct.getl_ODR_NO());
						odrUnconfirmStruct.setl_ALCTED_SEQ_CD(String.valueOf(j + 1));
						odrUnconfirmStruct.setl_ALCTED_UNCONFIRM_ODR_NO(
							odrUnconfirmStruct.getl_ODR_NO());
						if (Calculate.compare(odrQty, odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY())> 0) {
							odrUnconfirmStruct.setl_ALCTED_UNCONFIRM_ODR_QTY(odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY());
						} else {
							odrUnconfirmStruct.setl_ALCTED_UNCONFIRM_ODR_QTY(odrQty);
						}
						// [�����m�蒍�����]�̓o�^
						entity.mT_ALLOC_FIXED_ODR_RSLT.create(conn, odrUnconfirmStruct);
						// [�󒍖���]�X�V�p�f�[�^��ݒ�
						String remainUnconfirmOdrQty =Calculate.subtract(odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY(),odrUnconfirmStruct.getl_ALCTED_UNCONFIRM_ODR_QTY());
						odrUnconfirmStruct.setl_REMAIN_UNCONFIRM_ODR_QTY(remainUnconfirmOdrQty);
						String unconfirmOdrBalance = Calculate.multiply(odrUnconfirmStruct.getl_REMAIN_UNCONFIRM_ODR_QTY(),odrUnconfirmStruct.getl_ODR_UNIT_PRICE());
						try {
							odrUnconfirmStruct.setl_UNCONFIRM_ODR_BALANCE(roundAmount(unconfirmOdrBalance, listStruct));
						} catch (ExpjException e) {
							setErrorMessage("KQ00038");
							setErrorParameter("", "AMOUNT", unconfirmOdrBalance);
							setErrorParameter("", "COMPANY_CD", _companyCd);
							setErrorParameter("", "CURRNCY_CD", listStruct.getl_CURRNCY_CD());
							setErrorParameter("", "EXCH_TYP", listStruct.getl_EXCH_TYP());
							setErrorParameter("","DETAIL_ROUND_TYP",listStruct.getl_DETAIL_ROUND_TYP());
							setErrorParameter("", "BUSINESS_OPR_DATE", _businessOprDate);
							return;
						}
						// [�󒍖���]�̍X�V
						entity.mT_ODR_Unconfirm.update(conn, odrUnconfirmStruct);
						// ����������������������A�c��̒����������߂�
						odrQty = Calculate.subtract(odrQty,odrUnconfirmStruct.getl_ALCTED_UNCONFIRM_ODR_QTY());
						// �������������Ȃ����珈�����I��
						if (Calculate.compare(odrQty, "0") == 0) {
							break;
						}
					}
				}
				// "�Z�[�� and (�m�蒍�� or (���� and �a��))" �̏ꍇ�A�o�׌v���o�^����B
				if (isQuickDelivery(listStruct)
					&& ("3".equals(listStruct.getl_ODR_TYP())
						|| ("2".equals(listStruct.getl_ODR_TYP())
							&& "20".equals(listStruct.getl_DEPO_TYP())))) {

					// [�o�׌v��]�o�^�p�f�[�^�̐ݒ�
					listStruct.setl_ODR_NO(listStruct.getl_ODR_NO());

					String desinatedShipDate = calcDesinatedShipDate(listStruct.getl_DESINATED_DLV_DATE(),listStruct.getl_TRANSPORT_LT(),_shipLt,listStruct.geth_SHIP_PLANT_CD());

					String lastAnsDlvDateRcd = calcWorkDate(desinatedShipDate, listStruct.getl_TRANSPORT_LT(), _plantWeb);

					listStruct.setl_LAST_ANS_DLV_DATE_RCD(lastAnsDlvDateRcd);
					listStruct.setl_DESINATED_SHIP_DATE(desinatedShipDate);
					listStruct.setl_DESINATED_SHIP_QTY(listStruct.getl_ODR_QTY());
					listStruct.setl_REST_SHIP_ODR_QTY(listStruct.getl_ODR_QTY());
					// [�o�׌v��]�̓o�^
					entity.mT_ANS_DLV_DATE.create(conn, listStruct);
				}
				//���Ԃ𓯎��ɓo�^����ꍇ�A�󒍊֘A�f�[�^���쐬����
				if("true".equals(listStruct.geth_DOODRFLG())){
					// [�󒍖���]�X�V�p�f�[�^�̐ݒ�
					listStruct.setl_ODR_NO(listStruct.getl_ODR_NO());
					listStruct.setl_JOB_ODR_SET_FLG("1");
					//[�󒍖���]�X�V
					entity.mUPDATE_T_ODR.update(conn,listStruct);
					
					//�V�X�p���A�u�󒍓o�^���̐��ԍ̔ԕ��@�v���P�F�����i�ړ������{�󒍔ԍ��j�̏ꍇ�A���Ԑړ����{�m�󒍖��ׁn�̎󒍔ԍ��i�󒍔ԍ��̐ړ����͏����j���琻�Ԃ��쐬����B
					if("false".equals(listStruct.geth_INPUTODRCDFLG()) && PRD_REQ_JOB_ODR_TYP_2.equals("1")){
						StringBuffer strOdrNO = new StringBuffer(listStruct.getl_ODR_NO().substring(3));
						StringBuffer strJobOdrCDPrefix = null;
						List prefixList = entity.mSYS_JOB_ODR_CD_CTRL.read(conn,listStruct);
						strJobOdrCDPrefix = new StringBuffer(((KQ0010010Struct)prefixList.get(0)).getJOB_OD_CD_PREFIX());
						String strJobOdrCD = strJobOdrCDPrefix.append(strOdrNO).toString();
						listStruct.setl_JOB_ODR_CD(strJobOdrCD);
					}
					entity.mT_JOB_ODR.create(conn,listStruct);
                	//[���v�ʌv�Z����i���ԁj]�ɑ��݃`�F�b�N
                	List odList = entity.mselectSYS_JOB_OD_CALC_CTRL.read(conn, struct);
                   	if(odList.size() <=0) {
    					//[���v�ʌv�Z����i���ԁj]�֓o�^
    					entity.mSYS_JOB_OD_CALC_CTRL.create(conn,listStruct);	
                   	}else{
                   		entity.mupdateSYS_JOB_OD_CALC_CTRL.update(conn, struct);
                   	}
					//[���Ԏ󒍕R�t]�o�^�p�f�[�^�̐ݒ�
					listStruct.setl_COMPANY_CD(_companyCd);
					if(Calculate.compare(listStruct.getl_ODR_QTY(),listStruct.getl_JOB_ODR_QTY())>=0){
						listStruct.setl_ALCD_QTY(listStruct.getl_JOB_ODR_QTY());
					}else{
						listStruct.setl_ALCD_QTY(listStruct.getl_ODR_QTY());
					}
					entity.mT_JOB_ODR_ODR_ALC.create(conn,listStruct);
				}
				// 1�����R�~�b�g
				conn.commit();
				
				// �R�~�b�g����ʏ㕔��list����1���폜����
				list.remove(i);
			}
			if (appSucessFlg) {
				/** ���F�˗��������b�Z�W�[���o��*/
		    	setInfoMessage("AZ00042");
			}
			// ��ʃN���A
			initializeAll();

			conn.commit();
		} catch (ParseException e) {
			throw new ExpjException(e);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}

                //}}user_implement_dev:<controlInsert>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {

			// ���Џ��̎擾
			List myCompanyList = entity.mSYS_MY_COMPANY.read(conn, struct);
			if (myCompanyList.isEmpty()) {
				setErrorMessage("KQ00039");
				throw new ExpjException("KQ00039");
			}
			KQ0010010Struct myCompanyStruct = (KQ0010010Struct) myCompanyList.get(0);
			_companyCd = myCompanyStruct.getCOMPANY_CD();

			// ���t�v�Z�p�̍H��R�[�h�擾
			struct.setCLASS_CODE("PLANT_WEB");
			List plantWebClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
			if (plantWebClassCodeList.isEmpty()) {
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			KQ0010010Struct plantWebClassCodeStruct =
				(KQ0010010Struct) plantWebClassCodeList.get(0);
			_plantWeb = plantWebClassCodeStruct.getCODE();

			// �Ɩ��^�p���̎擾
			struct.setPLANT_CD(_plantWeb);
			List dateCtrlList = entity.mSYS_DATE_CTRL.read(conn, struct);
			if (dateCtrlList.isEmpty()) {
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			KQ0010010Struct dateCtrlStruct = (KQ0010010Struct) dateCtrlList.get(0);
			_businessOprDate = dateCtrlStruct.getBUSINESS_OPR_DATE();
            // ��ʂ̋Ɩ��^�p�����Z�b�g����
			struct.seth_BUSINESS_OPR_DATE(_businessOprDate);
			struct.setODR_ACPT_DATE(_businessOprDate);
			// ���{�~�ʉ݃R�[�h�擾
			List homeCurList = entity.mSYS_HOME_CUR.read(conn, struct);
			if (homeCurList.isEmpty()) {
				setErrorMessage("KQ00041");
				throw new ExpjException("KQ00041");
			}
			KQ0010010Struct homeCurStruct = (KQ0010010Struct) homeCurList.get(0);
			_homeCurCd = homeCurStruct.getHOME_CUR_CD();

			// �o�׏���L/T�擾
			struct.setCLASS_CODE("SHIP_LT");
			List shipLtClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
			if (shipLtClassCodeList.isEmpty()) {
				setErrorMessage("KQ00037");
				throw new ExpjException("KQ00037");
			}
			KQ0010010Struct shipLtClassCodeStruct = (KQ0010010Struct) shipLtClassCodeList.get(0);
			_shipLt = shipLtClassCodeStruct.getCODE();

			// �Z�[���̔�������擾
			struct.setCLASS_CODE("DLV_DATE_CDT");
			List dlvDateCdtClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
			if (shipLtClassCodeList.isEmpty()) {
				setErrorMessage("KQ00056");
				throw new ExpjException("KQ00056");
			}
			KQ0010010Struct dlvDateCdtClassCodeStruct =
				(KQ0010010Struct) dlvDateCdtClassCodeList.get(0);
			_dlvDateCdt = dlvDateCdtClassCodeStruct.getCODE();

			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			_odrTypStruct = cb.getData("ODR_ODR_TYP");
			_spclPriceTypStruct = cb.getData("ODR_SPCL_PRICE");
			_depoTypStruct = cb.getData("ODR_DEPO_TYP");
			
			//�V�X�p���@[�󒍎����ԓo�^]���擾
			List value1List = null;
			String value1 = null;
			value1List = entity.mPRD_REQ_JOB_ODR_TYP_1.read(conn,struct);
			if(value1List.isEmpty()){
				setErrorMessage("KQ00319");
				throw new ExpjException("KQ00319");
			}
			PRD_REQ_JOB_ODR_TYP_1 = ((KQ0010010Struct)value1List.get(0)).geth_PRD_REQ_JOB_ODR_TYP_1();
			if(!"0".equals(PRD_REQ_JOB_ODR_TYP_1)&&!"1".equals(PRD_REQ_JOB_ODR_TYP_1)&&!"2".equals(PRD_REQ_JOB_ODR_TYP_1)){
				setErrorMessage("KQ00319");
				throw new ExpjException("KQ00319");
			}
			//�V�X�p���A[�󒍎����ԓo�^]���擾
			List value2List = null;
			value2List = entity.mPRD_REQ_JOB_ODR_TYP_2.read(conn,struct);
			if(value2List.isEmpty()){
				setErrorMessage("KQ00320");
				throw new ExpjException("KQ00320");
			}
			PRD_REQ_JOB_ODR_TYP_2 = ((KQ0010010Struct)value2List.get(0)).geth_PRD_REQ_JOB_ODR_TYP_2();
			if(!"0".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"1".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"2".equals(PRD_REQ_JOB_ODR_TYP_2)){
				setErrorMessage("KQ00320");
				throw new ExpjException("KQ00320");
			}
			cb.setConnection(null);
			
			// �󒍏��F���擾
            privateConfig = new PrivateConfig(conn);
			String aprCompany = privateConfig.getString("APR_ODR");
			// �p�����[�^�u�󒍏��F�v���Z�b�g
			if (aprCompany == null || "".equals(aprCompany)) {
				String locale = CoreTools.getLocale(struct.getsUser_ID());
				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00072"));
				msgStruct.addError(emsg); // ���[�j���O���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
				struct.seth_APR_ODR("0");
			} else if (!"1".equals(aprCompany)) {
				// �P�ȊO�̏ꍇ
				struct.seth_APR_ODR("0");
			} else {
				struct.seth_APR_ODR("1");
			}
			_APR_ODR = struct.geth_APR_ODR();

			// ��ʂ�������
			initializeAll();

		} catch (SQLException e) {
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		// �V�X�e���p�����[�^
			struct.seth_APR_ODR(_APR_ODR);
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			struct.setList_ODR_TYP_val(_odrTypStruct.getValList());
			struct.setList_ODR_TYP_name(_odrTypStruct.getExplanList());
			struct.setList_SPCL_PRICE_TYP_val(_spclPriceTypStruct.getValList());
			struct.setList_SPCL_PRICE_TYP_name(_spclPriceTypStruct.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KQ0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KQ0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KQ0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KQ0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KQ0010010Entity entity;
	protected KQ0010010Struct struct;
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

		entity = new KQ0010010Entity();
		struct = new KQ0010010Struct();

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
	 * KQ0010010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0010010Control() throws BusinessProcessException, FoundationException
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
				KQ0010010Struct key = (KQ0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_NO") && key.getl_NO() != null) {
					msgKey.setKeyValue("l_NO", key.getl_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN") && key.getl_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_TYP_DN", key.getl_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN") && key.getl_SPCL_PRICE_TYP_DN() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP_DN", key.getl_SPCL_PRICE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN") && key.getl_DEPO_TYP_DN() != null) {
					msgKey.setKeyValue("l_DEPO_TYP_DN", key.getl_DEPO_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP") && key.getODR_TYP() != null) {
					msgKey.setKeyValue("ODR_TYP", key.getODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP_name") && key.getODR_TYP_name() != null) {
					msgKey.setKeyValue("ODR_TYP_name", key.getODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP_val") && key.getODR_TYP_val() != null) {
					msgKey.setKeyValue("ODR_TYP_val", key.getODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_name") && key.getSPCL_PRICE_TYP_name() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP_name", key.getSPCL_PRICE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_val") && key.getSPCL_PRICE_TYP_val() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP_val", key.getSPCL_PRICE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("c_DOODR") && key.getc_DOODR() != null) {
					msgKey.setKeyValue("c_DOODR", key.getc_DOODR());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("c_INPUTODRCD") && key.getc_INPUTODRCD() != null) {
					msgKey.setKeyValue("c_INPUTODRCD", key.getc_INPUTODRCD());
				}
				if(msgKeyType.containsKeyColumn("h_DOODRFLG") && key.geth_DOODRFLG() != null) {
					msgKey.setKeyValue("h_DOODRFLG", key.geth_DOODRFLG());
				}
				if(msgKeyType.containsKeyColumn("h_INPUTODRCDFLG") && key.geth_INPUTODRCDFLG() != null) {
					msgKey.setKeyValue("h_INPUTODRCDFLG", key.geth_INPUTODRCDFLG());
				}
				if(msgKeyType.containsKeyColumn("h_CHECK_STATUS") && key.geth_CHECK_STATUS() != null) {
					msgKey.setKeyValue("h_CHECK_STATUS", key.geth_CHECK_STATUS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ODR") && key.geth_APR_ODR() != null) {
					msgKey.setKeyValue("h_APR_ODR", key.geth_APR_ODR());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_REMARKS") && key.getl_APPR_REMARKS() != null) {
					msgKey.setKeyValue("l_APPR_REMARKS", key.getl_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_PROJECT_CD") && key.getl_PROJECT_CD() != null) {
					msgKey.setKeyValue("l_PROJECT_CD", key.getl_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO") && key.getl_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("l_ESTIMATE_NO", key.getl_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO") && key.getl_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("l_ODR_CTL_NO", key.getl_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_NO") && key.getl_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_NO", key.getl_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP") && key.getl_ODR_TYP() != null) {
					msgKey.setKeyValue("l_ODR_TYP", key.getl_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_CD") && key.getl_CUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_ORG_CD", key.getl_CUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_CD") && key.getl_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("l_CUST_CHRG_PSN_CD", key.getl_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_ORG_CD") && key.getl_ODR_ACPT_ORG_CD() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_ORG_CD", key.getl_ODR_ACPT_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_CD") && key.getl_ODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_PSN_CD", key.getl_ODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CURRNCY_CD") && key.getl_CURRNCY_CD() != null) {
					msgKey.setKeyValue("l_CURRNCY_CD", key.getl_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_TYP") && key.getl_EXCH_TYP() != null) {
					msgKey.setKeyValue("l_EXCH_TYP", key.getl_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME_KANJI") && key.getl_DLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME_KANJI", key.getl_DLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP") && key.getl_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP", key.getl_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STD_DESINATED_RCV_DATE") && key.getl_STD_DESINATED_RCV_DATE() != null) {
					msgKey.setKeyValue("l_STD_DESINATED_RCV_DATE", key.getl_STD_DESINATED_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_REMAIN_UNCONFIRM_ODR_QTY") && key.getl_REMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("l_REMAIN_UNCONFIRM_ODR_QTY", key.getl_REMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNCONFIRM_ODR_BALANCE") && key.getl_UNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("l_UNCONFIRM_ODR_BALANCE", key.getl_UNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES") && key.getl_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT_EXCH_RATES", key.getl_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_CD") && key.getl_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("l_TRANSPORT_CD", key.getl_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP") && key.getl_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("l_TRANSPORT_TYP", key.getl_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP") && key.getl_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("l_TAX_APPLY_TYP", key.getl_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CD") && key.getl_TAX_CD() != null) {
					msgKey.setKeyValue("l_TAX_CD", key.getl_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP") && key.getl_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("l_TAX_CALC_TYP", key.getl_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE") && key.getl_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_DATE", key.getl_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY") && key.getl_SHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("l_SHIP_PLAN_REMAIN_QTY", key.getl_SHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG") && key.getl_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("l_PARTIAL_SHIP_INST_FLG", key.getl_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("PART_NAME") && key.getPART_NAME() != null) {
					msgKey.setKeyValue("PART_NAME", key.getPART_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_RSLT_CTL_SEQ_CD") && key.getl_RSLT_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("l_RSLT_CTL_SEQ_CD", key.getl_RSLT_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT") && key.getl_UNIT() != null) {
					msgKey.setKeyValue("l_UNIT", key.getl_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_PLACE_CD") && key.getl_DLV_PLACE_CD() != null) {
					msgKey.setKeyValue("l_DLV_PLACE_CD", key.getl_DLV_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_PRICE") && key.getl_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_UNIT_PRICE", key.getl_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_CD") && key.getl_CUR_CD() != null) {
					msgKey.setKeyValue("l_CUR_CD", key.getl_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_CO") && key.getl_SPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_CO", key.getl_SPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_DLV_CD") && key.getl_CUST_DLV_CD() != null) {
					msgKey.setKeyValue("l_CUST_DLV_CD", key.getl_CUST_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_DLV_KEY_CD") && key.getl_CUST_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("l_CUST_DLV_KEY_CD", key.getl_CUST_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_FIXED_ODR_NO") && key.getl_FIXED_ODR_NO() != null) {
					msgKey.setKeyValue("l_FIXED_ODR_NO", key.getl_FIXED_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ALCTED_SEQ_CD") && key.getl_ALCTED_SEQ_CD() != null) {
					msgKey.setKeyValue("l_ALCTED_SEQ_CD", key.getl_ALCTED_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_NO") && key.getl_ALCTED_UNCONFIRM_ODR_NO() != null) {
					msgKey.setKeyValue("l_ALCTED_UNCONFIRM_ODR_NO", key.getl_ALCTED_UNCONFIRM_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_QTY") && key.getl_ALCTED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ALCTED_UNCONFIRM_ODR_QTY", key.getl_ALCTED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_LAST_ANS_DLV_DATE_RCD") && key.getl_LAST_ANS_DLV_DATE_RCD() != null) {
					msgKey.setKeyValue("l_LAST_ANS_DLV_DATE_RCD", key.getl_LAST_ANS_DLV_DATE_RCD());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY") && key.getl_DESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_QTY", key.getl_DESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_REST_SHIP_ODR_QTY") && key.getl_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("l_REST_SHIP_ODR_QTY", key.getl_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ANAME") && key.getl_CUST_ANAME() != null) {
					msgKey.setKeyValue("l_CUST_ANAME", key.getl_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DETAIL_ROUND_TYP") && key.getl_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("l_DETAIL_ROUND_TYP", key.getl_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_COMPANY_CD") && key.getl_COMPANY_CD() != null) {
					msgKey.setKeyValue("l_COMPANY_CD", key.getl_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME") && key.getl_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME", key.getl_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT") && key.getl_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("l_TRANSPORT_LT", key.getl_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_WH_CD") && key.getl_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("l_DEPO_WH_CD", key.getl_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD") && key.getl_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("l_SHIP_WH_CD", key.getl_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_SHIP_PLANT_CD") && key.geth_SHIP_PLANT_CD() != null) {
					msgKey.setKeyValue("h_SHIP_PLANT_CD", key.geth_SHIP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_EFF_PHASE_IN_DATE") && key.getl_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("l_EFF_PHASE_IN_DATE", key.getl_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP") && key.geth_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("h_MRP_ODR_TYP", key.geth_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CODE") && key.getCLASS_CODE() != null) {
					msgKey.setKeyValue("CLASS_CODE", key.getCLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1") && key.geth_PRD_REQ_JOB_ODR_TYP_1() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_1", key.geth_PRD_REQ_JOB_ODR_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2") && key.geth_PRD_REQ_JOB_ODR_TYP_2() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_2", key.geth_PRD_REQ_JOB_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_OD_CD") && key.getJOB_OD_CD() != null) {
					msgKey.setKeyValue("JOB_OD_CD", key.getJOB_OD_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX") && key.getJOB_OD_CD_PREFIX() != null) {
					msgKey.setKeyValue("JOB_OD_CD_PREFIX", key.getJOB_OD_CD_PREFIX());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_SET_FLG") && key.getl_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("l_JOB_ODR_SET_FLG", key.getl_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY") && key.getl_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l_JOB_ODR_QTY", key.getl_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("OD_CALC_FLG") && key.getOD_CALC_FLG() != null) {
					msgKey.setKeyValue("OD_CALC_FLG", key.getOD_CALC_FLG());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
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
					KQ0010010Struct key = new KQ0010010Struct();
					if(msgKeyType.containsKeyColumn("l_NO")) {
						key.setl_NO(msgKey.getKeyValue("l_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN")) {
						key.setl_ODR_TYP_DN(msgKey.getKeyValue("l_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN")) {
						key.setl_SPCL_PRICE_TYP_DN(msgKey.getKeyValue("l_SPCL_PRICE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN")) {
						key.setl_DEPO_TYP_DN(msgKey.getKeyValue("l_DEPO_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP")) {
						key.setODR_TYP(msgKey.getKeyValue("ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP_name")) {
						key.setODR_TYP_name(msgKey.getKeyValue("ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP_val")) {
						key.setODR_TYP_val(msgKey.getKeyValue("ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(msgKey.getKeyValue("NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_name")) {
						key.setSPCL_PRICE_TYP_name(msgKey.getKeyValue("SPCL_PRICE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP_val")) {
						key.setSPCL_PRICE_TYP_val(msgKey.getKeyValue("SPCL_PRICE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("c_DOODR")) {
						key.setc_DOODR(msgKey.getKeyValue("c_DOODR"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_INPUTODRCD")) {
						key.setc_INPUTODRCD(msgKey.getKeyValue("c_INPUTODRCD"));
					}
					if(msgKeyType.containsKeyColumn("h_DOODRFLG")) {
						key.seth_DOODRFLG(msgKey.getKeyValue("h_DOODRFLG"));
					}
					if(msgKeyType.containsKeyColumn("h_INPUTODRCDFLG")) {
						key.seth_INPUTODRCDFLG(msgKey.getKeyValue("h_INPUTODRCDFLG"));
					}
					if(msgKeyType.containsKeyColumn("h_CHECK_STATUS")) {
						key.seth_CHECK_STATUS(msgKey.getKeyValue("h_CHECK_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ODR")) {
						key.seth_APR_ODR(msgKey.getKeyValue("h_APR_ODR"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_REMARKS")) {
						key.setl_APPR_REMARKS(msgKey.getKeyValue("l_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_PROJECT_CD")) {
						key.setl_PROJECT_CD(msgKey.getKeyValue("l_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO")) {
						key.setl_ESTIMATE_NO(msgKey.getKeyValue("l_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO")) {
						key.setl_ODR_CTL_NO(msgKey.getKeyValue("l_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_NO")) {
						key.setl_ODR_NO(msgKey.getKeyValue("l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP")) {
						key.setl_ODR_TYP(msgKey.getKeyValue("l_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_ORG_CD")) {
						key.setl_CUST_CHRG_ORG_CD(msgKey.getKeyValue("l_CUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CHRG_PSN_CD")) {
						key.setl_CUST_CHRG_PSN_CD(msgKey.getKeyValue("l_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_ORG_CD")) {
						key.setl_ODR_ACPT_ORG_CD(msgKey.getKeyValue("l_ODR_ACPT_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_PSN_CD")) {
						key.setl_ODR_ACPT_PSN_CD(msgKey.getKeyValue("l_ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CURRNCY_CD")) {
						key.setl_CURRNCY_CD(msgKey.getKeyValue("l_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_TYP")) {
						key.setl_EXCH_TYP(msgKey.getKeyValue("l_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME_KANJI")) {
						key.setl_DLV_LOC_NAME_KANJI(msgKey.getKeyValue("l_DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP")) {
						key.setl_SPCL_PRICE_TYP(msgKey.getKeyValue("l_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STD_DESINATED_RCV_DATE")) {
						key.setl_STD_DESINATED_RCV_DATE(msgKey.getKeyValue("l_STD_DESINATED_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_REMAIN_UNCONFIRM_ODR_QTY")) {
						key.setl_REMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("l_REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNCONFIRM_ODR_BALANCE")) {
						key.setl_UNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("l_UNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT_EXCH_RATES")) {
						key.setl_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("l_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_CD")) {
						key.setl_TRANSPORT_CD(msgKey.getKeyValue("l_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP")) {
						key.setl_TRANSPORT_TYP(msgKey.getKeyValue("l_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_APPLY_TYP")) {
						key.setl_TAX_APPLY_TYP(msgKey.getKeyValue("l_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CD")) {
						key.setl_TAX_CD(msgKey.getKeyValue("l_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CALC_TYP")) {
						key.setl_TAX_CALC_TYP(msgKey.getKeyValue("l_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE")) {
						key.setl_ODR_ACPT_DATE(msgKey.getKeyValue("l_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY")) {
						key.setl_SHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("l_SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG")) {
						key.setl_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("l_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PART_NAME")) {
						key.setPART_NAME(msgKey.getKeyValue("PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_RSLT_CTL_SEQ_CD")) {
						key.setl_RSLT_CTL_SEQ_CD(msgKey.getKeyValue("l_RSLT_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT")) {
						key.setl_UNIT(msgKey.getKeyValue("l_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_PLACE_CD")) {
						key.setl_DLV_PLACE_CD(msgKey.getKeyValue("l_DLV_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_PRICE")) {
						key.setl_UNIT_PRICE(msgKey.getKeyValue("l_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_CD")) {
						key.setl_CUR_CD(msgKey.getKeyValue("l_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_CO")) {
						key.setl_SPCL_PRICE_CO(msgKey.getKeyValue("l_SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_DLV_CD")) {
						key.setl_CUST_DLV_CD(msgKey.getKeyValue("l_CUST_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_DLV_KEY_CD")) {
						key.setl_CUST_DLV_KEY_CD(msgKey.getKeyValue("l_CUST_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_FIXED_ODR_NO")) {
						key.setl_FIXED_ODR_NO(msgKey.getKeyValue("l_FIXED_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCTED_SEQ_CD")) {
						key.setl_ALCTED_SEQ_CD(msgKey.getKeyValue("l_ALCTED_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_NO")) {
						key.setl_ALCTED_UNCONFIRM_ODR_NO(msgKey.getKeyValue("l_ALCTED_UNCONFIRM_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCTED_UNCONFIRM_ODR_QTY")) {
						key.setl_ALCTED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("l_ALCTED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_LAST_ANS_DLV_DATE_RCD")) {
						key.setl_LAST_ANS_DLV_DATE_RCD(msgKey.getKeyValue("l_LAST_ANS_DLV_DATE_RCD"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY")) {
						key.setl_DESINATED_SHIP_QTY(msgKey.getKeyValue("l_DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_REST_SHIP_ODR_QTY")) {
						key.setl_REST_SHIP_ODR_QTY(msgKey.getKeyValue("l_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ANAME")) {
						key.setl_CUST_ANAME(msgKey.getKeyValue("l_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAIL_ROUND_TYP")) {
						key.setl_DETAIL_ROUND_TYP(msgKey.getKeyValue("l_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_COMPANY_CD")) {
						key.setl_COMPANY_CD(msgKey.getKeyValue("l_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME")) {
						key.setl_DLV_LOC_NAME(msgKey.getKeyValue("l_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT")) {
						key.setl_TRANSPORT_LT(msgKey.getKeyValue("l_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_WH_CD")) {
						key.setl_DEPO_WH_CD(msgKey.getKeyValue("l_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD")) {
						key.setl_SHIP_WH_CD(msgKey.getKeyValue("l_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_SHIP_PLANT_CD")) {
						key.seth_SHIP_PLANT_CD(msgKey.getKeyValue("h_SHIP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_EFF_PHASE_IN_DATE")) {
						key.setl_EFF_PHASE_IN_DATE(msgKey.getKeyValue("l_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP")) {
						key.seth_MRP_ODR_TYP(msgKey.getKeyValue("h_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CODE")) {
						key.setCLASS_CODE(msgKey.getKeyValue("CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_1")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_1(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_2(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_OD_CD")) {
						key.setJOB_OD_CD(msgKey.getKeyValue("JOB_OD_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_OD_CD_PREFIX")) {
						key.setJOB_OD_CD_PREFIX(msgKey.getKeyValue("JOB_OD_CD_PREFIX"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_SET_FLG")) {
						key.setl_JOB_ODR_SET_FLG(msgKey.getKeyValue("l_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY")) {
						key.setl_JOB_ODR_QTY(msgKey.getKeyValue("l_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OD_CALC_FLG")) {
						key.setOD_CALC_FLG(msgKey.getKeyValue("OD_CALC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
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
