/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0060;

import com.nec.jp.orteus.metamorBase.AE0060.*;
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

import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0060030Control
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
	public AE0060030Struct getListvalue(int x) {
		return (AE0060030Struct) (this.list.get(x));
	} // ���X�g�̒l��Ԃ��܂��B
	public AE0060030Struct getStruct() {
		return this.struct;
	} // Struct��Ԃ��܂��B
	public AE0060030Struct createStruct() {
		return new AE0060030Struct();
	} // �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) {
		this.struct.setStruct((AE0060030Struct) structname);
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
	/** ���b�g����*/
	private String _lotCtrl;
	/** ��ʑJ�ڃL�[(�����ԍ�) */
	private String _puchOdrCd;
    private String _acptNo;
    private int _readMode = 0; // 1:�ǉ����[�h 2:�X�V���[�h
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
	 * ��ʑJ�ڃL�[(�����ԍ�)�擾
	 * @return �����
	 */
	public String getAcptNo() {
		return _acptNo;
	}
	/**
	 * ��ʑJ�ڃL�[(�����ԍ�)�ݒ�
	 * @param cd �����
	 */
	public void setAcptNo(String cd) {
		_acptNo = cd;
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
	 * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setInfoMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setWarnMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
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
	 * �x�����b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}

	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setInfoMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
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
	private void setStruct(AE0060030Struct s) {
		struct.setITEM_CD_M(s.getITEM_CD_M());
		struct.setITEM_NAME_M(s.getITEM_NAME_M());
		struct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());
		struct.setACPT_NO(s.getACPT_NO());
		struct.setPUCH_ODR_MODIFY_COUNT(s.getPUCH_ODR_MODIFY_COUNT());
		struct.setACPT_MODIFY_COUNT(s.getACPT_MODIFY_COUNT());
		struct.setINSPC_MODIFY_COUNT(s.getINSPC_MODIFY_COUNT());
		struct.setACPT_QTY(s.getACPT_QTY());
		struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
		struct.setACPT_STS_TYP_DN(s.getACPT_STS_TYP_DN());
		struct.setACPT_STS_TYP(s.getACPT_STS_TYP());
		struct.setINSPECTED_QTY(s.getINSPECTED_QTY());
		struct.setACCEPTED_QTY(s.getACCEPTED_QTY());
		struct.setDEFECTED_QTY(s.getDEFECTED_QTY());
		struct.setINSPEC_DATE(s.getINSPEC_DATE());
		struct.seth_INSPEC_DATE(s.getINSPEC_DATE());      // ������
		struct.setVEND_LOT_NO(s.getVEND_LOT_NO());
		struct.setINSPEC_RSLT_COMMENT(s.getINSPEC_RSLT_COMMENT());
		struct.setWH_CD(s.getWH_CD());
		struct.setWH_NAME(s.getWH_NAME());
		struct.setINSPC_WH_CD(s.getINSPC_WH_CD());
		struct.setINSPC_WH_NAME(s.getINSPC_WH_NAME());

		struct.setITEM_CD(s.getITEM_CD());
		struct.setITEM_NAME(s.getITEM_NAME());
		struct.setJOB_ODR_CD(s.getJOB_ODR_CD());
		struct.setDRAW_CD(s.getDRAW_CD());
		struct.setSPEC(s.getSPEC());
		struct.setUNIT_QTY_TYP_DN(s.getUNIT_QTY_TYP_DN());
		struct.setUNIT_QTY_TYP(s.getUNIT_QTY_TYP());
		struct.setVEND_CD(s.getVEND_CD());
		struct.setVEND_NAME(s.getVEND_NAME());
		struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());
		struct.setSUM_ACPT_QTY(s.getSUM_ACPT_QTY());
		struct.setINSPC_CMPLT_FLG_DN(s.getINSPC_CMPLT_FLG_DN());
		struct.setINSPC_CMPLT_FLG(s.getINSPC_CMPLT_FLG());
		struct.setPUCH_ODR_SLIP_ISS_DATE(s.getPUCH_ODR_SLIP_ISS_DATE());
		struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());
		struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());
		struct.setWORK_IN_PROC_CD(s.getWORK_IN_PROC_CD());
		struct.setPROC_NAME(s.getPROC_NAME());
		struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());
		struct.setUSER_NAME(s.getUSER_NAME());
		struct.setPUCH_ODR_STS_TYP_DN(s.getPUCH_ODR_STS_TYP_DN());
		struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());
		struct.setSPL_ITEM_TYP_DN(s.getSPL_ITEM_TYP_DN());
		struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());
		struct.setACPT_INSPC_TYP_DN(s.getACPT_INSPC_TYP_DN());
		struct.setACPT_INSPC_TYP(s.getACPT_INSPC_TYP());
		struct.setPRODUCT_TYP_DN(s.getPRODUCT_TYP_DN());
		struct.setPRODUCT_TYP(s.getPRODUCT_TYP());
		struct.setNON_NO_ITEM_FLG_DN(s.getNON_NO_ITEM_FLG_DN());
		struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());

		struct.setPLANT_CD(s.getPLANT_CD());
		struct.setTAX_CD(s.getTAX_CD());
		struct.setBUSINESS_OPR_DATE(s.getBUSINESS_OPR_DATE());
		// Add Start 20140211 fang-xf
		struct.setACPT_DATE(s.getACPT_DATE());
		// Add End 20140211 fang-xf
		struct.setEXCH_RATE(s.getEXCH_RATE());
		

		//���b�g�Ǘ��������Ă��Ȃ��ꍇ�A�݌Ƀ��b�g�ԍ���\���s��
		if("false".equals(_lotCtrl)){
			struct.setLOT_NO(null);
		}else{
			struct.setLOT_NO(s.getLOT_NO());
		}
		
		if ("2".equals(s.getACPT_STS_TYP())) {
			struct.setc_COMPLETE("true");
		} else {
			struct.setc_COMPLETE(null);
		}

		struct.seth_PUCH_ODR_CD(s.getPUCH_ODR_CD());
		struct.seth_ACPT_NO(s.getACPT_NO());
		
		struct.setTHIS_MONTH(s.getTHIS_MONTH());
		struct.setINSTALL_FLG(s.getINSTALL_FLG());

        struct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());
      
	}

	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
		struct.setPUCH_ODR_CD(null);
		struct.setACPT_NO("1");

		initializeDetail();
	}

	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {
		struct.setPUCH_ODR_MODIFY_COUNT(null);
		struct.setACPT_MODIFY_COUNT(null);
		struct.setINSPC_MODIFY_COUNT(null);
		struct.setACPT_QTY(null);
		struct.setSTOCK_UNIT(null);
		struct.setACPT_STS_TYP_DN(null);
		struct.setACPT_STS_TYP(null);
		struct.setINSPECTED_QTY("0");
		struct.setACCEPTED_QTY("0");
		struct.setDEFECTED_QTY("0");
		struct.setINSPEC_DATE(null);
		struct.setVEND_LOT_NO(null);
		struct.setLOT_NO(null);
		struct.setINSPEC_RSLT_COMMENT(null);
		struct.setWH_CD(null);
		struct.setWH_NAME(null);

		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setJOB_ODR_CD(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setUNIT_QTY_TYP_DN(null);
		struct.setUNIT_QTY_TYP("2");
		struct.setVEND_CD(null);
		struct.setVEND_NAME(null);
		struct.setPUCH_ODR_QTY("0");
		struct.setSUM_ACPT_QTY("0");
		struct.setINSPC_CMPLT_FLG_DN(null);
		struct.setINSPC_CMPLT_FLG(null);
		struct.setPUCH_ODR_SLIP_ISS_DATE(null);
		struct.setPUCH_ODR_DLV_DATE(null);
		struct.setCONFIRM_DLV_DATE(null);
		struct.setWORK_IN_PROC_CD(null);
		struct.setPROC_NAME(null);
		struct.setPUCH_ODR_PERSON(null);
		struct.setUSER_NAME(null);
		struct.setPUCH_ODR_STS_TYP_DN(null);
		struct.setPUCH_ODR_STS_TYP(null);
		struct.setSPL_ITEM_TYP_DN(null);
		struct.setSPL_ITEM_TYP(null);
		struct.setACPT_INSPC_TYP_DN(null);
		struct.setACPT_INSPC_TYP(null);
		struct.setPRODUCT_TYP_DN(null);
		struct.setPRODUCT_TYP(null);
		struct.setNON_NO_ITEM_FLG_DN(null);
		struct.setNON_NO_ITEM_FLG(null);

		struct.setPLANT_CD(null);
		struct.setTAX_CD(null);
		struct.setBUSINESS_OPR_DATE(null);
		// Add Start 20140211 fang-xf
		struct.setACPT_DATE(null);
		// Add End 20140211 fang-xf
		struct.setEXCH_RATE("1");
		struct.setc_COMPLETE(null);

		struct.seth_PUCH_ODR_CD(null);
		struct.seth_ACPT_NO(null);
		
		list = new ArrayList(0);
		// �s�Ǘ��R�ꗗ�̋�̓��͍s��15�s�ǉ�����B
		for (int i = 0; i < 15; i++) {
			AE0060030Struct viewStruct = new AE0060030Struct();
			viewStruct.setl_DEFECT_INSPC_QTY("0");
			list.add(viewStruct);
		}

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


	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AE0060030Struct sysParameterStruct = (AE0060030Struct) sysParameterList.get(0);
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
			AE0060030Struct procExecDateStruct = (AE0060030Struct) procExecDateList.get(0);
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
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �L�[�ȊO�̍��ڂ�������
			initializeDetail();

			// ������ԍ����[�����c]���������A�Ώۃf�[�^�����݂��Ȃ��ꍇ
			List rlsdPuchOdrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
			if (rlsdPuchOdrList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			AE0060030Struct rlsdPuchOdrStruct = (AE0060030Struct) rlsdPuchOdrList.get(0);

			// ���O�C�����[�U�̢�H��R�[�h� != [�����c]."�H��R�[�h"�̏ꍇ
			if (!sysPLANT_CD.equals(rlsdPuchOdrStruct.getPLANT_CD())) {
				setErrorMessage("AE05002");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", rlsdPuchOdrStruct.getPLANT_CD());
				return;
			}
			// [�����c]."������ԋ敪" = 1:���w���̏ꍇ
			if ("1".equals(rlsdPuchOdrStruct.getPUCH_ODR_STS_TYP())) {
				setErrorMessage("AE30803");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			// [�����c]."����`�[���s�t���O" = 1:�����s�̏ꍇ
			if ("1".equals(rlsdPuchOdrStruct.getODR_CANCEL_SLIP_ISS_FLG())
                && "2".equals(rlsdPuchOdrStruct.getACPT_INSPC_TYP())) {
				setErrorMessage("AE00104");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			// [�����c]."����`�[���s�t���O" = 2:���s�ς̏ꍇ
			} else if ("2".equals(rlsdPuchOdrStruct.getODR_CANCEL_SLIP_ISS_FLG())
                && "2".equals(rlsdPuchOdrStruct.getACPT_INSPC_TYP())) {
				setErrorMessage("AE00105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			// [�����c]."��������敪" = 1:����݂̂̏ꍇ
			if ("1".equals(rlsdPuchOdrStruct.getACPT_INSPC_TYP())) {
				setErrorMessage("AE05013");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			// ������ԍ�� + �����񐔣��[�������]���������A�Ώۃf�[�^�����݂��Ȃ��ꍇ
			List acptRsltList = entity.mT_ACPT_RSLT.read(conn, struct);
			if (acptRsltList.isEmpty()) {
				setErrorMessage("AE05008");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}

			// ��ʕ\���p�f�[�^�̌���
			List inspcRsltList = entity.mT_INSPC_RSLT.read(conn, struct);
			List formList = null;
			String h_INSPECTED_QTY = null;
			if (inspcRsltList.isEmpty()) {
				formList = entity.mFormInsert.read(conn, struct);
				_readMode = 1;
			} else {
				formList = entity.mFormUpdate.read(conn, struct);
				_readMode = 2;
			}

			// �Ώۃf�[�^�����݂��Ȃ��ꍇ
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_INSPC_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_INSPC_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}

			AE0060030Struct formStruct = (AE0060030Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));
			formStruct.setACPT_STS_TYP_DN(multcombo("ACPT_STS_TYP",formStruct.getACPT_STS_TYP()));
			if (!inspcRsltList.isEmpty()){
			    h_INSPECTED_QTY = formStruct.getINSPECTED_QTY();
			}

			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			AE0060030Struct readStruct = new AE0060030Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0060030Struct installOptionsStruct = (AE0060030Struct)installOptionsList.get(0);
				formStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				formStruct.setINSTALL_FLG("0");
			}
			
			// �ۊǋ�}�X�^����A�����҂��ۊǋ於�̂��擾
			List whList = entity.mM_WH.read(conn, formStruct);
			if (whList.size() > 0) {
				AE0060030Struct whStruct = (AE0060030Struct)whList.get(0);
				formStruct.setINSPC_WH_NAME(whStruct.getINSPC_WH_NAME());
			} else {
				formStruct.setINSPC_WH_NAME(null);
			}
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			if ("1".equals(formStruct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0060030Struct debtCtrlStruct = (AE0060030Struct)debtCtrlList.get(0);
					formStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
				} else {
					// ���|�V�X�e���Ǘ��̓��N���x���ݒ肳��Ă��܂���B
					setErrorMessage("AE00145");
					return;
				}
			}
			
			// ��ʂɃf�[�^��ݒ�
			setStruct(formStruct);
			struct.seth_INSPECTED_QTY(h_INSPECTED_QTY);
			//��ʂ̈בփ��[�g�̃Z�b�g
			List ratelist = entity.mT_PAST_INSPC_ACPT.read(conn, struct);
			if (ratelist.size() > 0) {
				AE0060030Struct rateStruct = (AE0060030Struct)ratelist.get(0);
				struct.setEXCH_RATE(rateStruct.getEXCH_RATE());
			}
			if (inspcRsltList.isEmpty()) {
				struct.setc_COMPLETE("true");
				struct.setACCEPTED_QTY(formStruct.getACPT_QTY());
				struct.setINSPECTED_QTY(formStruct.getACPT_QTY());
			}
			 //�ő�\���s���`�F�b�N
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			List viewList = entity.mViewCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0060030Struct)viewList.get(0)).getl_COUNT());
			if ((maxLine != 0) && (rowCount ==maxLine+1) && (rowCount !=0)) {
				setErrorMessage("ZZ01115", "" + maxLine);
				setErrorParameter("T_INSPC_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_INSPC_RSLT", "ACPT_NO", struct.getACPT_NO());
				readStatus = TOO_MANY;
				if(list != null && list.size() > 0){
					list = new ArrayList(0);	
				}
				return;
			}
			// �ꗗ�f�[�^������
		    viewList = entity.mView.read(conn, struct);
			// �s�Ǘ��R�ꗗ�̋�̓��͍s��15�s�ǉ�����B
			for (int i = 0; i < 15; i++) {
				AE0060030Struct viewStruct = new AE0060030Struct();
				viewStruct.setl_DEFECT_INSPC_QTY("0");
				viewList.add(viewStruct);
			}

			// [�������]."�����ԋ敪" = 2:���������̏ꍇ
			AE0060030Struct acptRsltStruct = (AE0060030Struct) acptRsltList.get(0);
			if ("2".equals(acptRsltStruct.getACPT_STS_TYP())) {
				setWarningMessage("AE05014");
				setWarningParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setWarningParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
			}
			setList(viewList);
			readStatus = NORMAL;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		try {
			String InspecDate = null;
			String logMessage = "";
			if (_readMode == 1) {	// �ǉ����[�h
				// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
				if(getSysParameter() == false){
					if(chkProcExecDate("1","",struct.getINSPEC_DATE()) == false){
						setErrorMessage(ProcExecDateError);
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				}
					// [��������]�ɑ��݂��Ȃ��ꍇ
				List lockedList3 = entity.mT_INSPC_RSLT.read(conn, struct);
				if (!lockedList3.isEmpty()) {
					setErrorMessage("ZZ01105");
					setErrorParameter("T_INSPC_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
					setErrorParameter("T_INSPC_RSLT", "ACPT_NO", struct.getACPT_NO());
					return;
				}
				
			}else{		// �X�V���[�h
				// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
				if(getSysParameter() == false){
					if(chkProcExecDate("2",struct.geth_INSPEC_DATE(),struct.getINSPEC_DATE()) == false){
						setErrorMessage(ProcExecDateError);
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				}
				// [��������]�ɑ��݂��Ȃ��ꍇ
				List lockedList3 = entity.mT_INSPC_RSLT.read(conn, struct);
				if (lockedList3.isEmpty()) {
					setErrorMessage("ZZ01105");
					setErrorParameter("T_INSPC_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
					setErrorParameter("T_INSPC_RSLT", "ACPT_NO", struct.getACPT_NO());
					return;
				}
				AE0060030Struct lockedStruct3 = (AE0060030Struct) lockedList3.get(0);
				// [��������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
				if (!lockedStruct3
					.getINSPC_MODIFY_COUNT()
					.equals(struct.getINSPC_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					setErrorParameter("T_INSPC_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
					setErrorParameter("T_INSPC_RSLT", "ACPT_NO", struct.getACPT_NO());
					return;
				}


			}
			// [�������]�ɑ��݂��Ȃ��ꍇ
			List lockedList2 = entity.mT_ACPT_RSLT_Lock.read(conn, struct);
			if (lockedList2.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}
			AE0060030Struct lockedStruct2 = (AE0060030Struct) lockedList2.get(0);
			// [�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct2.getACPT_MODIFY_COUNT().equals(struct.getACPT_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}
			// [�����c]�ɑ��݂��Ȃ��ꍇ
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060030Struct lockedStruct = (AE0060030Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			//�ꗗ�́u�s�Ǘ��R�R�[�h�v���d���t���O
			boolean defectCauseCdFlag = false;
			//�ꗗ�́u�s�Ǘ��R�R�[�h�v���d���`�F�b�N
			List defectCauseCdListChk = struct.getList_l_DEFECT_CAUSE_CD();
			for (int i = 0; i < defectCauseCdListChk.size()-1; i++) {
				String defectCauseCd = (String) defectCauseCdListChk.get(i);
				if("0".equals(defectCauseCd)){
					continue;
				}
				for(int j = i+1; j < defectCauseCdListChk.size(); j++){
					String defectCauseCd2 = (String) defectCauseCdListChk.get(j);
					if(defectCauseCd.equals(defectCauseCd2)){
						defectCauseCdFlag = true;
						break;
					}					
				}				
			}
			//�ꗗ�́u�s�Ǘ��R�R�[�h�v���d���̏ꍇ
			if(defectCauseCdFlag){
				//�s�Ǘ��R�R�[�h���Đݒ�
				List viewList = new ArrayList(0);
				List defectCauseCdListNew = struct.getList_l_DEFECT_CAUSE_CD();
				List defectInspcQtyListNew = struct.getList_l_DEFECT_INSPC_QTY();
				List defectCommentListNew = struct.getList_l_DEFECT_COMMENT();
				String defectCauseCd;
				String defectInspcQty;
				String defectComment;
				for (int i = 0; i < defectCauseCdListNew.size(); i++) {
					defectCauseCd = (String) defectCauseCdListNew.get(i);
					defectInspcQty = (String) defectInspcQtyListNew.get(i);
					defectComment = (String) defectCommentListNew.get(i);
					AE0060030Struct defectStruct = new AE0060030Struct();
					defectStruct.setl_DEFECT_CAUSE_CD(defectCauseCd);
					defectStruct.setl_DEFECT_INSPC_QTY(defectInspcQty);
					defectStruct.setl_DEFECT_COMMENT(defectComment);
					viewList.add(defectStruct);
				}
				setList(viewList);
				setErrorMessage("AE05062");
				return;				
			}
			
			// �������тɊY�����R�[�h�����݂��邩�H
			if (_readMode == 1) {
				// ���݂��Ȃ�������A�ǉ����[�h
				entity.mT_INSPC_RSLT.create(conn, struct);
			} else {
				// ���݂�����A�X�V���[�h
				entity.mT_INSPC_RSLT.update(conn, struct);
			}

			// [�s�Ǘ��R]�̓o�^
			// ��x���ׂẴ��R�[�h���폜����B
			entity.mT_INSPC_DEFECT.delete(conn, struct);

			List defectCauseCdList = struct.getList_l_DEFECT_CAUSE_CD();
			List defectInspcQtyList = struct.getList_l_DEFECT_INSPC_QTY();
			List defectCommentList = struct.getList_l_DEFECT_COMMENT();
			for (int i = 0; i < defectCauseCdList.size(); i++) {
				String defectCauseCd = (String) defectCauseCdList.get(i);
				if ("0".equals(defectCauseCd)) {
					continue;
				}
				String defectInspcQty = (String) defectInspcQtyList.get(i);
				String defectComment = (String) defectCommentList.get(i);

				struct.setl_DEFECT_CAUSE_CD(defectCauseCd);
				struct.setl_DEFECT_INSPC_QTY(defectInspcQty);
				struct.setl_DEFECT_COMMENT(defectComment);

				entity.mT_INSPC_DEFECT.create(conn, struct);
			}

			// ���������̎�
			if ("true".equals(struct.getc_COMPLETE())) {
				// [�������]�̍X�V
				entity.mT_ACPT_RSLTForComplete.update(conn, struct);

				List aList = entity.mT_RLSD_PUCH_ODRForComplete.read(conn, struct);
				if (!aList.isEmpty()) {
					AE0060030Struct aStruct = (AE0060030Struct) aList.get(0);
					if ("9".equals(aStruct.getPUCH_ODR_STS_TYP())
					  && "2".equals(aStruct.getACPT_STS_TYP())) {
						// [�����c]�̍X�V
						aStruct.setsOraganization_CD(struct.getsOrganization_CD());
						aStruct.setsSysdate(struct.getsSysdate());
						aStruct.setsUser_ID(struct.getsUser_ID());
						entity.mT_RLSD_PUCH_ODRForComplete.update(conn, aStruct);
						InspecDate = aStruct.getINSPEC_DATE();
					}
				}
			}

			if (InspecDate == null){
				InspecDate = struct.getINSPEC_DATE();
			}
			// �֘A���錟���^�����e�[�u���̍X�V�i���i�Ăяo���j
			// ������ъ֘A�̃e�[�u�����X�V
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			boolean result = false;
			result = ia.addInspc(struct.getPUCH_ODR_CD(), struct.getACPT_NO(),InspecDate,struct.geth_INSPECTED_QTY(), struct.getEXCH_RATE(), _myCompanyStruct.getCOMPANY_CD());
			if (!result) {
				if (ia.getErrorList() != null && !ia.getErrorList().isEmpty() ) {
					if ("BZ00180".equals(ia.getErrorList().get(0).toString())) {
						setErrorMessage("BZ00180");
						return;
					}
				}
				setErrorMessage("AE05017");
				setErrorParameter("T_INSPC_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_INSPC_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}
			// ������ъ֘A�������������b�Z�[�W�擾
			for(int idx = 0; idx < ia.getErrorList().size(); idx++){
				setErrorMessage((String)ia.getErrorList().get(idx));
			}
			if (ia.getErrorList().size() > 0) {
				return;
			}
			String RiMessage;
			if(!ia.getRiErrorList().isEmpty()){
				for(int i=0; i<ia.getRiErrorList().size(); i++){
					RiMessage = ia.getRiErrorList().get(i).toString();
					setErrorMessage(RiMessage);
				}
				conn.rollback();
				return;
			}
			// ��ʍēǍ�
			controlSelect();

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

                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * ���������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelComplete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");
			//{{user_implement_dev:<controlCancelComplete>
		try {
			// ���O�o�͏��i�[�p
			String logMessage = "";
			List puchOdrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
			// [�������]�ɑ��݂��Ȃ��ꍇ
			List lockedList2 = entity.mT_ACPT_RSLT_Lock.read(conn, struct);
			if (lockedList2.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}
			AE0060030Struct lockedStruct2 = (AE0060030Struct) lockedList2.get(0);
			// [�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct2.getACPT_MODIFY_COUNT().equals(struct.getACPT_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}
			// [�����c]�ɑ��݂��Ȃ��Ƃ�
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060030Struct lockedStruct = (AE0060030Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct.getPUCH_ODR_MODIFY_COUNT().equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			
			// [�������]�̍X�V�i���������j
			entity.mT_ACPT_RSLTForCancel.update(conn, struct);
			// [�����c]�̍X�V�i���������j
			entity.mT_RLSD_PUCH_ODRForCancel.update(conn, struct);
			// ���������̊֘A����e�[�u�����X�V�i�ʃN���X�j
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			ia.cancelInspc(struct.getPUCH_ODR_CD(), struct.getACPT_NO());
			// ���������̊֘A�������������b�Z�[�W�擾
			for(int idx = 0; idx < ia.getErrorList().size(); idx++){
					setErrorMessage((String)ia.getErrorList().get(idx));
				}
			if (ia.getErrorList().size() > 0) {
				return;
			}
			// ��ʍēǍ�
			controlSelect();

			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (ApsComException e) {
			throw new ExpjException(e);
		} catch (ParseException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlCancelComplete>
		logger.exiting("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// ��ʂ�������
		initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		// ��ʂ�������
		initializeAll();
		//��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
		if (isScreenMove()) {
		  struct.setPUCH_ODR_CD(_puchOdrCd);
		  struct.setACPT_NO(_acptNo);
		  controlSelect();
		}
		try {
			// [����]���𕔕i���擾
			_myCompanyStruct = MyCompanyControl.getData(conn);
			if(LotCtrl.checkLotCtrl(conn)){
				_lotCtrl = "true";
			}else{
				_lotCtrl = "false";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (DataNotFoundException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
             // �s�Ǘ��R�R�[�h�̃R���{�{�b�N�X�f�[�^��ݒ�
             ComboBox comboController = new ComboBox(conn, sysUSER_CD);
             ComboStruct DEFECT_CAUSE_CD = comboController.getData("DEFECT_CAUSE_CD_OUTER");
             struct.setList_l_DEFECT_CAUSE_CD_val(DEFECT_CAUSE_CD.getValList());
             struct.setList_l_DEFECT_CAUSE_CD_name(DEFECT_CAUSE_CD.getExplanList());
            } catch (SQLException se) {
             // �G���[�F�T�[�o�ŃG���[���������܂����B
             ExpjMessage emsg = new ExpjMessage("ZZ01106");
             sysLog.severe(emsg, getsysUSER_CD());
             ExpjException ee = new ExpjException(se, emsg);
             emsg = new ExpjMessage("ZZ01006", se.toString());
             sysLog.severe(emsg, getsysUSER_CD());
             throw ee;
            }
		// �_�E�����[�h�t�@�C�����N���A
		// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŢDOWNLOAD_FILE����`���A���̍s�̃R�����g���O���Ă��������B
		//			struct.setDOWNLOAD_FILE((String)null);
		// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
		// �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0060030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CancelComplete") ) {
				controlCancelComplete();
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

			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŢDOWNLOAD_FILE����`���A���̍s�̃R�����g���O���Ă��������B
			//			struct.setDOWNLOAD_FILE((String)null);
			//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
			//		} catch(AlarmMessageException ame){
			//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			//			throw ee;
			//		
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0060030Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060030-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0060030Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060030-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0060030Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060030-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0060030Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0060030Entity entity;
	protected AE0060030Struct struct;
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

		entity = new AE0060030Entity();
		struct = new AE0060030Struct();

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
	 * AE0060030�N���X�̕W���R���X�g���N�^
	 */
	public AE0060030Control() throws BusinessProcessException, FoundationException
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
				AE0060030Struct key = (AE0060030Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ACPT_STS_TYP_DN") && key.getACPT_STS_TYP_DN() != null) {
					msgKey.setKeyValue("ACPT_STS_TYP_DN", key.getACPT_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("c_COMPLETE") && key.getc_COMPLETE() != null) {
					msgKey.setKeyValue("c_COMPLETE", key.getc_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_DN") && key.getACPT_INSPC_TYP_DN() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_DN", key.getACPT_INSPC_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN") && key.getINSPC_CMPLT_FLG_DN() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG_DN", key.getINSPC_CMPLT_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_DN") && key.getSPL_ITEM_TYP_DN() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_DN", key.getSPL_ITEM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_DN") && key.getPRODUCT_TYP_DN() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_DN", key.getPRODUCT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP_DN") && key.getPUCH_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP_DN", key.getPUCH_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG_DN") && key.getNON_NO_ITEM_FLG_DN() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG_DN", key.getNON_NO_ITEM_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_NO") && key.geth_ACPT_NO() != null) {
					msgKey.setKeyValue("h_ACPT_NO", key.geth_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("h_INSPEC_DATE") && key.geth_INSPEC_DATE() != null) {
					msgKey.setKeyValue("h_INSPEC_DATE", key.geth_INSPEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name") && key.getl_DEFECT_CAUSE_CD_name() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_name", key.getl_DEFECT_CAUSE_CD_name());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val") && key.getl_DEFECT_CAUSE_CD_val() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_val", key.getl_DEFECT_CAUSE_CD_val());
				}
				if(msgKeyType.containsKeyColumn("h_INSPECTED_QTY") && key.geth_INSPECTED_QTY() != null) {
					msgKey.setKeyValue("h_INSPECTED_QTY", key.geth_INSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD") && key.getl_DEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD", key.getl_DEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_INSPC_QTY") && key.getl_DEFECT_INSPC_QTY() != null) {
					msgKey.setKeyValue("l_DEFECT_INSPC_QTY", key.getl_DEFECT_INSPC_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT") && key.getl_DEFECT_COMMENT() != null) {
					msgKey.setKeyValue("l_DEFECT_COMMENT", key.getl_DEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD_M") && key.getITEM_CD_M() != null) {
					msgKey.setKeyValue("ITEM_CD_M", key.getITEM_CD_M());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_M") && key.getITEM_NAME_M() != null) {
					msgKey.setKeyValue("ITEM_NAME_M", key.getITEM_NAME_M());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT") && key.getPUCH_ODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_MODIFY_COUNT", key.getPUCH_ODR_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_MODIFY_COUNT") && key.getACPT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ACPT_MODIFY_COUNT", key.getACPT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("INSPC_MODIFY_COUNT") && key.getINSPC_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("INSPC_MODIFY_COUNT", key.getINSPC_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_STS_TYP") && key.getACPT_STS_TYP() != null) {
					msgKey.setKeyValue("ACPT_STS_TYP", key.getACPT_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPECTED_QTY") && key.getINSPECTED_QTY() != null) {
					msgKey.setKeyValue("INSPECTED_QTY", key.getINSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACCEPTED_QTY") && key.getACCEPTED_QTY() != null) {
					msgKey.setKeyValue("ACCEPTED_QTY", key.getACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECTED_QTY") && key.getDEFECTED_QTY() != null) {
					msgKey.setKeyValue("DEFECTED_QTY", key.getDEFECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_DATE") && key.getINSPEC_DATE() != null) {
					msgKey.setKeyValue("INSPEC_DATE", key.getINSPEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_RSLT_COMMENT") && key.getINSPEC_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("INSPEC_RSLT_COMMENT", key.getINSPEC_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("INSPC_WH_CD") && key.getINSPC_WH_CD() != null) {
					msgKey.setKeyValue("INSPC_WH_CD", key.getINSPC_WH_CD());
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
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY") && key.getSUM_ACPT_QTY() != null) {
					msgKey.setKeyValue("SUM_ACPT_QTY", key.getSUM_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG") && key.getINSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG", key.getINSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE") && key.getPUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_SLIP_ISS_DATE", key.getPUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG") && key.getODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_FLG", key.getODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_WH_NAME") && key.getINSPC_WH_NAME() != null) {
					msgKey.setKeyValue("INSPC_WH_NAME", key.getINSPC_WH_NAME());
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
					AE0060030Struct key = new AE0060030Struct();
					if(msgKeyType.containsKeyColumn("ACPT_STS_TYP_DN")) {
						key.setACPT_STS_TYP_DN(msgKey.getKeyValue("ACPT_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("c_COMPLETE")) {
						key.setc_COMPLETE(msgKey.getKeyValue("c_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_DN")) {
						key.setACPT_INSPC_TYP_DN(msgKey.getKeyValue("ACPT_INSPC_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN")) {
						key.setINSPC_CMPLT_FLG_DN(msgKey.getKeyValue("INSPC_CMPLT_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_DN")) {
						key.setSPL_ITEM_TYP_DN(msgKey.getKeyValue("SPL_ITEM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_DN")) {
						key.setPRODUCT_TYP_DN(msgKey.getKeyValue("PRODUCT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP_DN")) {
						key.setPUCH_ODR_STS_TYP_DN(msgKey.getKeyValue("PUCH_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG_DN")) {
						key.setNON_NO_ITEM_FLG_DN(msgKey.getKeyValue("NON_NO_ITEM_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_NO")) {
						key.seth_ACPT_NO(msgKey.getKeyValue("h_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("h_INSPEC_DATE")) {
						key.seth_INSPEC_DATE(msgKey.getKeyValue("h_INSPEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name")) {
						key.setl_DEFECT_CAUSE_CD_name(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val")) {
						key.setl_DEFECT_CAUSE_CD_val(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("h_INSPECTED_QTY")) {
						key.seth_INSPECTED_QTY(msgKey.getKeyValue("h_INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD")) {
						key.setl_DEFECT_CAUSE_CD(msgKey.getKeyValue("l_DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_INSPC_QTY")) {
						key.setl_DEFECT_INSPC_QTY(msgKey.getKeyValue("l_DEFECT_INSPC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT")) {
						key.setl_DEFECT_COMMENT(msgKey.getKeyValue("l_DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD_M")) {
						key.setITEM_CD_M(msgKey.getKeyValue("ITEM_CD_M"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_M")) {
						key.setITEM_NAME_M(msgKey.getKeyValue("ITEM_NAME_M"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT")) {
						key.setPUCH_ODR_MODIFY_COUNT(msgKey.getKeyValue("PUCH_ODR_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_MODIFY_COUNT")) {
						key.setACPT_MODIFY_COUNT(msgKey.getKeyValue("ACPT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_MODIFY_COUNT")) {
						key.setINSPC_MODIFY_COUNT(msgKey.getKeyValue("INSPC_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_STS_TYP")) {
						key.setACPT_STS_TYP(msgKey.getKeyValue("ACPT_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPECTED_QTY")) {
						key.setINSPECTED_QTY(msgKey.getKeyValue("INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACCEPTED_QTY")) {
						key.setACCEPTED_QTY(msgKey.getKeyValue("ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECTED_QTY")) {
						key.setDEFECTED_QTY(msgKey.getKeyValue("DEFECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_DATE")) {
						key.setINSPEC_DATE(msgKey.getKeyValue("INSPEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_RSLT_COMMENT")) {
						key.setINSPEC_RSLT_COMMENT(msgKey.getKeyValue("INSPEC_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_WH_CD")) {
						key.setINSPC_WH_CD(msgKey.getKeyValue("INSPC_WH_CD"));
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
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY")) {
						key.setSUM_ACPT_QTY(msgKey.getKeyValue("SUM_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG")) {
						key.setINSPC_CMPLT_FLG(msgKey.getKeyValue("INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE")) {
						key.setPUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_WH_NAME")) {
						key.setINSPC_WH_NAME(msgKey.getKeyValue("INSPC_WH_NAME"));
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
