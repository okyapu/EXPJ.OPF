/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060010Control.java,v $
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
import java.text.ParseException;
import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.*;
import com.nec.jp.orteus.expj.lot.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0060010Control
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
	public AE0060010Struct getListvalue(int x) {
		return (AE0060010Struct) (this.list.get(x));
	} // ���X�g�̒l��Ԃ��܂��B
	public AE0060010Struct getStruct() {
		return this.struct;
	} // Struct��Ԃ��܂��B
	public AE0060010Struct createStruct() {
		return new AE0060010Struct();
	} // �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) {
		this.struct.setStruct((AE0060010Struct) structname);
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
	/** [�R���{�{�b�N�X�f�[�^]���i�P���敪�j */
	private ComboStruct _unitCostTypStruct = new ComboStruct();

	/** ��ʑJ�ڃL�[(�����ԍ�) */
	private String _puchOdrCd;
	
	/** �V�X�e�������t���O*/
	private boolean _lotCtrlFlg;
	
	/** ���������t���O*/
	private String _inspcvalue;
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
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
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
	 * ��ʑJ�ڃL�[(�����ԍ�)�擾
	 * @return �i�ڔԍ�
	 */
	public String getPuchOdrCd() {
		return _puchOdrCd;
	}
	/**
	 * ��ʑJ�ڃL�[(�����ԍ�)�ݒ�
	 * @param cd �i�ڔԍ�
	 */
	public void setPuchOdrCd(String cd) {
		_puchOdrCd = cd;
	}

	/**
	 * Struct�̒l���Z�b�g���܂��B
	 * @param s ���������f�[�^
	 */
	private void setStruct(AE0060010Struct s) throws SQLException, FoundationException{
		struct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());								// �����ԍ�
		struct.setACPT_NO(s.getACPT_NO());										// �����
		struct.setPUCH_ODR_MODIFY_COUNT(s.getPUCH_ODR_MODIFY_COUNT());			// �X�V��
		struct.setITEM_CD(s.getITEM_CD());										// �t�H�[��[�i�ڔԍ�]
		struct.setITEM_NAME(s.getITEM_NAME());									// �t�H�[��[�i�ږ�]
		struct.setACPT_QTY(s.getACPT_QTY());									// �����
		struct.seth_ACPT_QTY(s.geth_ACPT_QTY());								// ������i�B�����ځj
		struct.setODR_CANCEL_SLIP_ISS_FLG(s.getODR_CANCEL_SLIP_ISS_FLG());		// ������`�[���s�t���O
		struct.seth_ODR_CANCEL_SLIP_ISS_FLG(s.getODR_CANCEL_SLIP_ISS_FLG());	// ������`�[���s�t���O�i�B�����ځj
		struct.setSTOCK_UNIT(s.getSTOCK_UNIT());								// �v�ʒP��
		struct.setACPT_DATE(s.getACPT_DATE());									// �����
		struct.setVEND_LOT_NO(s.getVEND_LOT_NO());								// ���[�J���b�g�ԍ�
		struct.setWH_CD(s.getWH_CD());											// ����ꏊ
		struct.setWH_NAME(s.getWH_NAME());										// ����ꏊ��
		if (s.getACPT_INSPC_TYP().equals("1")) {
			struct.setINSPC_WH_CD(null);										// �t�H�[��[�����҂��ۊǋ�]
			struct.setINSPC_WH_NAME(null);										// �t�H�[��[�����҂��ۊǋ於]
		} else {
			struct.setINSPC_WH_CD(s.getINSPC_WH_CD());							// �t�H�[��[�����҂��ۊǋ�]
			struct.setINSPC_WH_NAME(s.getINSPC_WH_NAME());						// �t�H�[��[�����҂��ۊǋ於]
		}
		struct.setCUR_CD(s.getCUR_CD());										// ����ʉ݃R�[�h
		struct.setCUR_NAME(s.getCUR_NAME());									// ����ʉݖ�
		struct.setVEND_CUR_UNIT(s.getVEND_CUR_UNIT());							// �ʉݒP��
		struct.setVEND_DECIMAL_FIG(s.getVEND_DECIMAL_FIG());					// ��������
		struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());							// �P���敪
		struct.setUNIT_COST(s.getUNIT_COST());									// �P��
		struct.setPROCESSING_COST(s.getPROCESSING_COST());						// ���H��
		struct.setMATERIAL_COST(s.getMATERIAL_COST());							// �ޗ���
		struct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());						// ���̑��o��
		struct.setPUCH_ODR_AMOUNT(s.getPUCH_ODR_AMOUNT());						// ������z
		struct.setDISC_AMOUNT(s.getDISC_AMOUNT());								// �l�������z
		struct.setNET_AMOUNT(s.getNET_AMOUNT());								// �{�̋��z
		struct.setTAX_AMOUNT_1(s.getTAX_AMOUNT_1());							// �Ŋz�P
		struct.setTAX_AMOUNT_2(s.getTAX_AMOUNT_2());							// �Ŋz�Q
		struct.setTAX_AMOUNT_3(s.getTAX_AMOUNT_3());							// �Ŋz�R
		struct.setTAX_RATE_1(s.getTAX_RATE_1());								// �ŗ��P
		struct.setTAX_RATE_2(s.getTAX_RATE_2());								// �ŗ��Q
		struct.setTAX_RATE_3(s.getTAX_RATE_3());								// �ŗ��R
		struct.setAMOUNT_INCLUDE_TAX(s.getAMOUNT_INCLUDE_TAX());				// �ō����z
		struct.setHOME_CUR_AMOUNT(s.getHOME_CUR_AMOUNT());						// �M�݋��z
		struct.setEXCH_RATE(s.getEXCH_RATE());									// �בփ��[�g
		struct.setDLV_CD(s.getDLV_CD());										// �[�i���ԍ�
		struct.setACPT_RSLT_COMMENT(s.getACPT_RSLT_COMMENT());					// ������l

		struct.setITEM_CD_DW(s.getITEM_CD());								// �ڍ׃E�C���h�E[�i�ڔԍ�]
		struct.setITEM_NAME_DW(s.getITEM_NAME());							// �ڍ׃E�C���h�E[�i�ږ�]
		struct.setJOB_ODR_CD(s.getJOB_ODR_CD());							// ����
		struct.setDRAW_CD(s.getDRAW_CD());									// �}�ʔԍ�
		struct.setSPEC(s.getSPEC());										// ���
		struct.setUNIT_QTY_TYP_DN(s.getUNIT_QTY_TYP_DN());					// �݌ɐ��P�ʋ敪
		struct.setUNIT_QTY_TYP(s.getUNIT_QTY_TYP());						// �݌ɐ��P�ʋ敪
		struct.setVEND_CD(s.getVEND_CD());									// �����R�[�h
		struct.setVEND_NAME(s.getVEND_NAME());								// ����於
		struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());						// ������
		struct.setSUM_ACPT_QTY(s.getSUM_ACPT_QTY());						// ����݌v��
		struct.setACPT_INSPC_TYP_DN(s.getACPT_INSPC_TYP_DN());				// ��������敪
		struct.setACPT_INSPC_TYP(s.getACPT_INSPC_TYP());					// ��������敪
		struct.setPUCH_ODR_SLIP_ISS_DATE(s.getPUCH_ODR_SLIP_ISS_DATE());	// ������
		struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());				// �����[��
		struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());				// �����񓚔[��
		struct.setWORK_IN_PROC_CD(s.getWORK_IN_PROC_CD());					// ��ƃR�[�h
		struct.setPROC_NAME(s.getPROC_NAME());								// ��Ɩ�
		struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());					// �����S���҃R�[�h
		struct.setUSER_NAME(s.getUSER_NAME());								// ���[�U��
		struct.setPUCH_ODR_STS_TYP_DN(s.getPUCH_ODR_STS_TYP_DN());			// ������ԋ敪
		struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());				// ������ԋ敪
		struct.setINSPC_CMPLT_FLG_DN(s.getINSPC_CMPLT_FLG_DN());			// ���������t���O
		struct.setINSPC_CMPLT_FLG(s.getINSPC_CMPLT_FLG());					// ���������t���O
		struct.setSPL_ITEM_TYP_DN(s.getSPL_ITEM_TYP_DN());					// �󋋕i�敪
		struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());						// �󋋕i�敪
		struct.setPRODUCT_TYP_DN(s.getPRODUCT_TYP_DN());					// ���i�敪
		struct.setPRODUCT_TYP(s.getPRODUCT_TYP());							// ���i�敪
		struct.setNON_NO_ITEM_FLG_DN(s.getNON_NO_ITEM_FLG_DN());			// ���i�����t���O
		struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());					// ���i�����t���O

		struct.setPLANT_CD(s.getPLANT_CD());							// �H��R�[�h
		struct.setCOMPANY_CD(s.getCOMPANY_CD());						// ��ЃR�[�h
		struct.setTAX_CD(s.getTAX_CD());								// �ŃR�[�h
		struct.setROUND_TYP(s.getROUND_TYP());							// �[���敪
		struct.setTAX_ROUND_TYP(s.getTAX_ROUND_TYP());					// �Œ[���敪
		struct.setPUCH_ODR_START_DATE(s.getPUCH_ODR_START_DATE());		// ���������
		struct.setBUSINESS_OPR_DATE(s.getBUSINESS_OPR_DATE());			// �Ɩ��^�p��
		struct.seth_DATE_FLG(s.geth_DATE_FLG());                        // ���t�t���O

		if (_lotCtrlFlg == true) {
			struct.seth_LOT_CTRL_FLG(s.geth_LOT_CTRL_FLG());             //���b�g�Ǘ��t���O
			struct.seth_LOT_NUMBERING_TYP(s.geth_LOT_NUMBERING_TYP());   //���b�g�ԍ��̔ԋ敪	
		} else {
			struct.seth_LOT_CTRL_FLG(null);                              //���b�g�Ǘ��t���O
			struct.seth_LOT_NUMBERING_TYP(null);                         //���b�g�ԍ��̔ԋ敪
		}
		struct.seth_FINAL_PROC_CD(s.geth_FINAL_PROC_CD());               //�ŏI�n��t���O
		struct.seth_WORK_ODR_CD(s.geth_WORK_ODR_CD());                   //��ƌv��ԍ�
		
		if ("1".equals(struct.getACPT_INSPC_TYP())) {
			struct.setACPT_STS_TYP("2");					// ��������
		} else {
			struct.setACPT_STS_TYP("1");					// ������
		}

		struct.setc_COMPLETE("true");						// �S�������

		// ��������z��̌v�Z
		String puchOdrAmount =
			AmountCalculator.calcPuchOdrAmount(
				struct.getUNIT_COST(),
				struct.getACPT_QTY(),
				struct.getROUND_TYP(),
				struct.getVEND_DECIMAL_FIG());
		struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
		// ��{�̋��z��̌v�Z
		String netAmount =
			AmountCalculator.calcNetAmount(struct.getPUCH_ODR_AMOUNT(), struct.getDISC_AMOUNT());
		struct.setNET_AMOUNT(netAmount);
		
        //20090428 ADD START
        //���ł̏ꍇ�ɐŊz���v�Z����
 		String lowerTaxCd =
 			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
 		if (!lowerTaxCd.equals("1")) {
			//�o�b�`�p�����[�^�ďo
			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
			if(!batList.isEmpty()){
				//�Ōv�Z���i���R�[��
				AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
				struct.setPVC2USERID(this.sysUSER_CD);
				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
				struct.setPVC2PLANTCD(this.sysPLANT_CD);
				struct.setPVC2TAXID("5");
				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
				batStruct = (AE0060010Struct)batList.get(0);
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
     	}
		// ��M�݋��z��̌v�Z
		String homeCurAmount =
			AmountCalculator.calcHomeCurAmount(
				struct.getAMOUNT_INCLUDE_TAX(),
				struct.getEXCH_RATE(),
				struct.getROUND_TYP(),
				_homeCurStruct.getDECIMAL_FIG());
		struct.setHOME_CUR_AMOUNT(homeCurAmount);

		struct.seth_PUCH_ODR_CD(s.getPUCH_ODR_CD());			// �����ԍ��i�B�����ځj

		struct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());	// �������l
		struct.setINSTALL_FLG(s.getINSTALL_FLG());				// �V�X�e�������t���O
		struct.setTHIS_MONTH(s.getTHIS_MONTH());				// ���N���x
	}

	/**
	 * Struct�̒l���Z�b�g���܂��B
	 * @param s ���������f�[�^
	 */
	private void setStructSystemData(AE0060010Struct s) {
		s.setsOraganization_CD(struct.getsOrganization_CD());
		s.setsSysdate(struct.getsSysdate());
		s.setsUser_ID(struct.getsUser_ID());
	}

	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
		struct.setPUCH_ODR_CD(null);

		initializeDetail();
	}

	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {
		struct.setACPT_NO("1");
		struct.setPUCH_ODR_MODIFY_COUNT(null);
		struct.setACPT_QTY("0");
		struct.setSTOCK_UNIT(null);
		struct.setACPT_DATE(null);
		struct.setVEND_LOT_NO(null);
		struct.setWH_CD(null);
		struct.setWH_NAME(null);
		struct.setCUR_CD(null);
		struct.setCUR_NAME(null);
		struct.setVEND_CUR_UNIT(null);
		struct.setVEND_DECIMAL_FIG("4");
		struct.setUNIT_COST_TYP("1");
		struct.setUNIT_COST("0");
		struct.setPROCESSING_COST("0");
		struct.setMATERIAL_COST("0");
		struct.setOTHER_OVERHEADS("0");
		struct.setPUCH_ODR_AMOUNT("0");
		struct.setDISC_AMOUNT("0");
		struct.setNET_AMOUNT("0");
		struct.setTAX_AMOUNT_1("0");
		struct.setTAX_AMOUNT_2("0");
		struct.setTAX_AMOUNT_3("0");
		struct.setTAX_RATE_1("0");
		struct.setTAX_RATE_2("0");
		struct.setTAX_RATE_3("0");
		struct.setAMOUNT_INCLUDE_TAX("0");
		struct.setHOME_CUR_AMOUNT("0");
		struct.setEXCH_RATE("1");
		struct.setDLV_CD(null);
		struct.setACPT_RSLT_COMMENT(null);

		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setJOB_ODR_CD(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setUNIT_QTY_TYP_DN(null);
		struct.setUNIT_QTY_TYP(Kind.NUMBER);
		struct.setVEND_CD(null);
		struct.setVEND_NAME(null);
		struct.setPUCH_ODR_QTY("0");
		struct.setSUM_ACPT_QTY("0");
		struct.setACPT_INSPC_TYP_DN(null);
		struct.setACPT_INSPC_TYP(null);
		struct.setPUCH_ODR_SLIP_ISS_DATE(null);
		struct.setPUCH_ODR_DLV_DATE(null);
		struct.setCONFIRM_DLV_DATE(null);
		struct.setWORK_IN_PROC_CD(null);
		struct.setPROC_NAME(null);
		struct.setPUCH_ODR_PERSON(null);
		struct.setUSER_NAME(null);
		struct.setPUCH_ODR_STS_TYP_DN(null);
		struct.setPUCH_ODR_STS_TYP(null);
		struct.setINSPC_CMPLT_FLG_DN(null);
		struct.setINSPC_CMPLT_FLG(null);
		struct.setSPL_ITEM_TYP_DN(null);
		struct.setSPL_ITEM_TYP(null);
		struct.setPRODUCT_TYP_DN(null);
		struct.setPRODUCT_TYP(null);
		struct.setNON_NO_ITEM_FLG_DN(null);
		struct.setNON_NO_ITEM_FLG(null);

		struct.setPLANT_CD(null);
		struct.setCOMPANY_CD(null);
		struct.setTAX_CD(null);
		struct.setROUND_TYP(Kind.FLOOR);
		struct.setTAX_ROUND_TYP(Kind.FLOOR);
		struct.setPUCH_ODR_START_DATE(null);
		struct.setBUSINESS_OPR_DATE(null);

		struct.setc_COMPLETE(null);

		struct.seth_PUCH_ODR_CD(null);

		struct.setSelectUnitCostFlag("false");

		struct.setLOT_NO(null);
		struct.seth_FINAL_PROC_CD(null);
		struct.seth_LOT_NUMBERING_TYP(null);
		struct.seth_LOT_CTRL_FLG(null);
		struct.seth_WORK_ODR_CD(null);
		// Add Start 20140113 fang-xf
		struct.seth_PUCH_ODR_CD_1(null);
		// Add End 20140113 fang-xf
		
		list = null;

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
	 * �����̕\���X�P�[������
	 * @param SuppliedUnitVal 
	 */
	public BigDecimal setDisplayscale(BigDecimal SuppliedUnitVal)
	{
		BigDecimal intVal = new BigDecimal("" + SuppliedUnitVal.intValue());
		BigDecimal decimalVal = SuppliedUnitVal.subtract(intVal).multiply(new BigDecimal(10000));
		int decVal = decimalVal.intValue();
		int roundCount = 1;
		while (true)
		{
			decVal = decVal / 10;
			if (decVal == 0) 
			{
				// ���[�v�𔲂���B
				break;
			} 
			roundCount++;
		} // END WHILE
		return SuppliedUnitVal.setScale(roundCount,BigDecimal.ROUND_UP);
	}
	/**
	 * ����̍ő���񐔂����߂鏈��
	 * @param Bigvala
	 */
	public BigDecimal getgcd(BigDecimal Bigvala,BigDecimal Bigvalb)
	{
		BigInteger gcdval = new BigInteger("0");
		gcdval = Bigvala.toBigInteger().gcd(Bigvalb.toBigInteger()); 
		return new BigDecimal(gcdval);
	}

	//�x���i�g�p�e�[�u����[�g�p�\�萔��]�E[�x���i�g�p�P�ʐ�����]�E[�x���i�g�p�P�ʐ����q]�̍ő�l 2006/05/22 up
	BigDecimal Decival = new BigDecimal("100000000000000");
	

	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AE0060010Struct sysParameterStruct = (AE0060010Struct) sysParameterList.get(0);
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
			AE0060010Struct procExecDateStruct = (AE0060010Struct) procExecDateList.get(0);
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
	 * �I���N���V�[�P���X�̔�
	 */
	private String getNextval(){
		try{
		    List l = entity.mSelectSEQ_JF_RSLT.read(conn, struct);
		    if(l != null && l.size() > 0){
			    return ((AE0060010Struct)l.get(0)).getNEXTVAL();
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * [�x���i�g�p].�h�����R�[�h�h��[�ۊǋ�].�g�����R�[�h�h�A[�x���i�g�p].�h�H��R�[�h�h��[�ۊǋ�].�g�H��R�[�h�h�ƂȂ�MIN([�ۊǋ�].�h�ۊǋ�R�[�h�h)
	 */
    private String getWh_cd(AE0060010Struct s){
    	try{
    	    List list = entity.mSelectWH_CD.read(conn, s);
    	    if(list != null && list.size() > 0){
    		    return ((AE0060010Struct)list.get(0)).getreadWH_CD();
    	    }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return null;
    }
    
    List lotNoList = new ArrayList();
    /**
     * [���b�g�ʎg�p����]�̒ǉ�,[�o�Ɏ��і���]�̍X�V
     */
    private boolean insertT_LOT_USE_RSLT(AE0060010Struct s){

    	try{
    	    String vendCd = s.getVEND_CD();                  //�����R�[�h
    	    String plantCd = s.getPLANT_CD();                //�H��R�[�h
    	    String issueInstCd = s.getsetISSUE_INST_CD();    //�o�Ɏw���ԍ�
    	    String puchOdrCd = s.getsetPUCH_ODR_CD();        //�����ԍ�
    	    String acptNo = s.getsetACPT_NO();               //�����
    	    String itemCd = s.getsetITEM_CD();               //�i�ڔԍ�
    	    String suppliedDate = s.getsetSUPPLIED_DATE();   //�g�p��
    	
    	    List qtyList = entity.mSelectQty.read(conn, s);
    	
    	    if(qtyList != null && qtyList.size() > 0){
    		    String supplied_issue_qty = ((AE0060010Struct)qtyList.get(0)).getreadSUPPLIED_ISSUE_QTY();  //[�x���i�g�p].�h�g�p�\�萔�ʁh
    		    System.out.println("supplied_issue_qty="+supplied_issue_qty);
    		    if("0".equals(supplied_issue_qty)){
    		    	//return true;
    		    }
                AE0060010Struct whcdStruct = new AE0060010Struct();
                whcdStruct.setVEND_CD(vendCd);               //�����R�[�h
                whcdStruct.setPLANT_CD(plantCd);             //�H��R�[�h
                String wh_cdStr = getWh_cd(whcdStruct);      //�ۊǋ�R�[�h
            
                int listSize = qtyList.size();
                for(int i=0; i<listSize; i++){
            	    AE0060010Struct rStruct = (AE0060010Struct)qtyList.get(i);
                    String lot_no = rStruct.getreadLOT_NO();  //�݌Ƀ��b�g�ԍ�
                    String qty = rStruct.getreadQTY();        //[�o�Ɏ��і���].�h�o�Ɏx�����ʁh�|[�o�Ɏ��і���].�h�g�p�ϐ��ʁh
                    
                    if(lotNoList == null){
                    	lotNoList = new ArrayList();
                    }

                    AE0060010Struct insertStruct = new AE0060010Struct();
                    insertStruct.setsetSEQ_NO(getNextval());          //�I���N���V�[�P���X�̔�
                    insertStruct.setsetISSUE_INST_CD(issueInstCd);    //�o�Ɏw���ԍ�
                    insertStruct.setsetLOT_NO(lot_no);                //�݌Ƀ��b�g�ԍ�
                    insertStruct.setsetPUCH_ODR_CD(puchOdrCd);        //�����ԍ�
                    insertStruct.setsetACPT_NO(acptNo);               //�����
                    insertStruct.setsetITEM_CD(itemCd);               //�x���i�ڔԍ�
                    insertStruct.setsetWH_CD(wh_cdStr);               //�ۊǋ�R�[�h
                    insertStruct.setsetSUPPLIED_DATE(suppliedDate);   //�g�p��
                    insertStruct.setsUser_ID(getsysUSER_CD());        //���[�U�R�[�h

                    //�Ōヌ�R�[�h
                    if(i == (listSize-1)){
                    	
                    	if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    		//�x���i�̃��b�g�g�p�����o�Ɏx�����ʂ𒴂��Ă��܂��B�x���i�ڔԍ�{0},�݌Ƀ��b�g�ԍ�{0}
                    		setWarningMessage("AE20610", itemCd, lot_no);
                    		setWarningParameter("T_PART_SUPPLIED_ISSUE", "ITEM_CD", itemCd);
                    		setWarningParameter("T_LOT_ISSUE_INST", "LOT_NO", lot_no);
                    	}
                        lotNoList.add(lot_no);                                      //�݌Ƀ��b�g�ԍ�
                        lotNoList.add(supplied_issue_qty);                          //�g�p�ϐ���
                	    insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);     //�g�p�ϐ���
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty);  //�g�p�\�萔��
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);    //[���b�g�ʎg�p����]�̒ǉ�

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);           //�g�p�ϐ���
                        updateStruct.setISSUE_INST_CD(issueInstCd);                 //�o�Ɏw���ԍ�
                        updateStruct.setLOT_NO(lot_no);                             //�݌Ƀ��b�g�ԍ�
                        updateStruct.setITEM_CD(itemCd);                            //�o�ɕi�ڔԍ�
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                     //�����ԍ�
                        updateStruct.setsUser_ID(getsysUSER_CD());                  //���[�U�R�[�h
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct);  //[�o�Ɏ��і���]�̍X�V
                        break;
                    }
                    System.out.println("qty="+qty);

                    if("0".equals(qty)){
                    	continue;
                    }
                    //[�x���i�g�p].�h�g�p�\�萔�ʁh>[�o�Ɏ��і���].�h�o�Ɏx�����ʁh�|[�o�Ɏ��і���].�h�g�p�ϐ��ʁh
                    if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    	//[�x���i�g�p].�h�g�p�\�萔�ʁh �| �P���ڂōX�V��������
                        supplied_issue_qty = Calculate.subtract(supplied_issue_qty, qty);
                        lotNoList.add(lot_no);
                        lotNoList.add(qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(qty);                   //�g�p�ϐ���
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(qty);                //�g�p�\�萔��
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[���b�g�ʎg�p����]�̒ǉ�

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(qty);                         //�g�p�ϐ���
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //�o�Ɏw���ԍ�
                        updateStruct.setLOT_NO(lot_no);                            //�݌Ƀ��b�g�ԍ�
                        updateStruct.setITEM_CD(itemCd);                           //�o�ɕi�ڔԍ�
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //�����ԍ�
                        updateStruct.setsUser_ID(getsysUSER_CD());                 //���[�U�R�[�h
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[�o�Ɏ��і���]�̍X�V

                    }else{
                    	//[�o�Ɏ��і���].�h�o�Ɏx�����ʁh �| [�o�Ɏ��і���].�h�g�p�ϐ��ʁh �� [�x���i�g�p].�h�g�p�\�萔�ʁh
                    	//�̏ꍇ�� [�x���i�g�p].�h�g�p�\�萔�ʁh���Z�b�g����
                    	lotNoList.add(lot_no);
                        lotNoList.add(supplied_issue_qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);    //�g�p�ϐ���
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty); //�g�p�\�萔��
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[���b�g�ʎg�p����]�̒ǉ�

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);          //�g�p�ϐ���
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //�o�Ɏw���ԍ�
                        updateStruct.setLOT_NO(lot_no);                            //�݌Ƀ��b�g�ԍ�
                        updateStruct.setITEM_CD(itemCd);                           //�o�ɕi�ڔԍ�
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //�����ԍ�
                        updateStruct.setsUser_ID(getsysUSER_CD());                 //���[�U�R�[�h
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[�o�Ɏ��і���]�̍X�V
                        break;
                    }
                }
    	    }else{
    	    	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���
                setErrorMessage("AE20609");
                return false;
            }
        }catch(Exception e){
        	e.printStackTrace();
        	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���
        	setErrorMessage("AE20609");
            return false;
        }
        return true;
    }

    /**
     * ���[�s���O�`�F�b�N�B�t�W�J���s�����i�ڔԍ������� �L��
     * @param repository ���i�\�����|�W�g��
     * @param checkItem �Ώەi�ڔԍ�
     * @param item ��r����i�ڔԍ�
     * @return true:�L  false:��
    */
    private boolean checkReverseRooping(ProductStructureRepository repository, 
                   String targetItem, String item)
         throws SQLException
    {
        // �e�i�ڔԍ��ꗗ�擾
        ArrayList itemList = repository.reverseDeployment(item);
        checkItemList(itemList);

        for(int i = 0; i < itemList.size(); i++){
            if(targetItem.equals((String)itemList.get(i)) == false){
                // �e�i�ڔԍ��ꗗ����X�ɏ�̐e�i�ڎ擾
                boolean result = checkReverseRooping(repository, 
                                       targetItem, (String)itemList.get(i));
                if(result == true){
                    return true;
                }
            }else{
                return true;
            }
        }
        return false;
    }
    
    /** �d���`�F�b�N
     * @param itemList �d���`�F�b�N����i�ڃ��X�g
    */
    private void checkItemList(ArrayList itemList){
        List workList = new ArrayList(0);
        for(int i = 0; i < itemList.size(); i++){
            boolean result =true;
            String item_cd = (String)itemList.get(i);
            for(int t = 0; t < workList.size(); t++){
                if(item_cd.equals((String)workList.get(t)) == true){
                    result = false;
                }
            }
            if(result == true){
                workList.add(item_cd);
            }
        }

        itemList.clear();
        for(int i = 0; i < workList.size(); i++){
            itemList.add(workList.get(i));
        }
    }
    private double getDoubleValue(String numString){
    	if(numString == null || "".equals(numString.trim())){
    		return 0.0;
    	}
    	BigDecimal bd = new BigDecimal(0);
    	bd = new BigDecimal(numString);
    	return bd.doubleValue();
    }

    /** �����҂��ۊǋ���Z�b�g
     * @param formStruct �������p�����[�^
    */
    private void setInspcWhStruct(AE0060010Struct whStruct) throws SQLException, FoundationException {
        AE0060010Struct readStruct = new AE0060010Struct();
		readStruct.setPLANT_CD(whStruct.getPLANT_CD());
		List inspcWhList = entity.mselectM_WH.read(conn, readStruct);
		
		// [�ۊǋ�]."�H��R�[�h"=[�����c]."�H��R�[�h"����[�ۊǋ�]."�q�ɋ敪"=40(�����҂��ۊǋ�)
		// �ɊY������f�[�^�����݂��Ȃ��ꍇ
		if (inspcWhList.isEmpty()) {
			// �����҂��ۊǋ悪���݂��܂���B
			setErrorMessage("AE00163");
			return;
		} else {
			AE0060010Struct inspcWhStruct = (AE0060010Struct)inspcWhList.get(0);
			
			whStruct.setINSPC_WH_CD(inspcWhStruct.getINSPC_WH_CD());
			whStruct.setINSPC_WH_NAME(inspcWhStruct.getINSPC_WH_NAME());
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
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
			// �L�[�ȊO�̍��ڂ�������
			initializeDetail();

			// ������ё��݃`�F�b�N
			List acptList = entity.mT_ACPT_RSLT.read(conn, struct);
			// ������т̌����ɂ��A�ǂݍ��ݐ��ς���B
			List formList = null;
			if (acptList.isEmpty()) {
				formList = entity.mFormFirst.read(conn, struct);
			} else {
				formList = entity.mFormAfter.read(conn, struct);
			}

			// ������ԍ���ɓ��͂��ꂽ�l���A[�����c]�ɑ��݂��Ă��Ȃ��B
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// �f�[�^���擾
			AE0060010Struct formStruct = (AE0060010Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));

			// ���O�C�����[�U�̢�H��R�[�h� != [�����c]."�H��R�[�h"�̏ꍇ
			if (!sysPLANT_CD.equals(formStruct.getPLANT_CD())) {
				setErrorMessage("AE05002");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", formStruct.getPLANT_CD());
				return;
			}
			// [�����c]."������ԋ敪" = 1:���w���̏ꍇ
			if ("1".equals(formStruct.getPUCH_ODR_STS_TYP())) {
				setErrorMessage("AE30803");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			// [�����c]."�ŃR�[�h"�ŁA[����ŋ敪]���������A���݂��Ȃ������ꍇ
			if (formStruct.getTAX_CD() == null || formStruct.getTAX_CD().length() <= 0) {
				try {
					TaxStruct ts =
						TaxControl.getData(
							conn,
							_myCompanyStruct.getCOMPANY_CD(),
							formStruct.getVEND_CD(),
							formStruct.getITEM_CD(),
							formStruct.getPUCH_ODR_START_DATE());

					formStruct.setTAX_CD(ts.getTAX_CD());
					formStruct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
				} catch (DataNotFoundException e) {
					setErrorMessage("AE05003");
					setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", formStruct.getVEND_CD());
					setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", formStruct.getITEM_CD());
					setErrorParameter(
						"T_RLSD_PUCH_ODR",
						"PUCH_ODR_START_DATE",
						formStruct.getPUCH_ODR_START_DATE());
					return;
				}
			}
			List taxList = entity.mM_TAX.read(conn, formStruct);
			if (taxList.isEmpty()) {
				setErrorMessage("AE05003");
				setErrorParameter("T_RLSD_PUCH_ODR", "TAX_CD", formStruct.getTAX_CD());
				return;
			}
			
			if ("2".equals(formStruct.getSPL_ITEM_TYP()) == false) {
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
				AE0060010Struct readStruct = new AE0060010Struct();
				List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
				if (installOptionsList.size() > 0) {
					AE0060010Struct installOptionsStruct = (AE0060010Struct)installOptionsList.get(0);
					formStruct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
				} else {
					formStruct.setINSTALL_FLG("0");
				}
				
				// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
				if ("1".equals(formStruct.getINSTALL_FLG())) {
					List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
					if (debtCtrlList.size() > 0) {
						AE0060010Struct debtCtrlStruct = (AE0060010Struct)debtCtrlList.get(0);
						formStruct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					} else {
						// ���|�V�X�e���Ǘ��̓��N���x���ݒ肳��Ă��܂���B
						setErrorMessage("AE00145");
						return;
					}
				}
			}
			
			// [�����c]."������ԋ敪" = 9:��������̏ꍇ
			if ("9".equals(formStruct.getPUCH_ODR_STS_TYP())) {
				if ("0".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [�����c]."����`�[���s�t���O" = 0:�ΏۊO�̏ꍇ
					setWarningMessage("AE05005");
				} else if ("1".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [�����c]."����`�[���s�t���O" = 1:�����s�̏ꍇ
					setWarningMessage("AE00086");
				} else if ("2".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [�����c]."����`�[���s�t���O" = 2:���s�ς̏ꍇ
					setWarningMessage("AE00087");
				}
				setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
				setWarningParameter("T_RLSD_PUCH_ODR", "ODR_CANCEL_SLIP_ISS_FLG", formStruct.getODR_CANCEL_SLIP_ISS_FLG());
			}
			
			// [�����c]."��������������敪"��2:����ƌ������s�Ȃ� �̏ꍇ
			if ("2".equals(formStruct.getACPT_INSPC_TYP())) {
				setInspcWhStruct(formStruct);
			} else {
				// [�����c]."��������������敪"��1:����̂� �̏ꍇ
				formStruct.setINSPC_WH_CD(null);
				formStruct.setINSPC_WH_NAME(null);
			}

			formStruct.seth_ACPT_QTY(formStruct.getACPT_QTY());
			// Add Start 20140113 fang-xf
			struct.seth_PUCH_ODR_CD_1(struct.getPUCH_ODR_CD());
			// Add End 20140113 fang-xf

			// ��ʂɕ\��
			setStruct(formStruct);

			readStatus = NORMAL;

			struct.setSelectUnitCostFlag("true");
		} catch (SQLException e) {
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
		try {

			UnitCostStruct ucs;

			// �����A�w���P���A�ʉ݁A����ł��擾
			try {
				ucs =
					UnitCostControl.getData(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						struct.getVEND_CD(),
						struct.getPLANT_CD(),
						struct.getITEM_CD(),
						struct.getWORK_IN_PROC_CD(),
						struct.getACPT_DATE(),
						struct.getACPT_DATE(),
						// Mod Start 20131216 fang-xf
						//struct.getACPT_QTY());
						struct.getACPT_QTY(),
						struct.geth_PUCH_ODR_CD_1());// �����ԍ�
						// Mod End 20131216 fang-xf

				struct.setTAX_CD(ucs.getTAX_CD());
				struct.setUNIT_COST_TYP(ucs.getUNIT_COST_TYP());
				struct.setUNIT_COST(ucs.getUNIT_COST());
				struct.setPROCESSING_COST(ucs.getPROCESSING_COST());
				struct.setMATERIAL_COST(ucs.getMATERIAL_COST());
				struct.setOTHER_OVERHEADS(ucs.getOTHER_OVERHEADS());
				struct.setPUCH_ODR_AMOUNT(ucs.getPUCH_ODR_AMOUNT());
				struct.setTAX_RATE_1(ucs.getTAX_RATE_1());
				struct.setTAX_RATE_2(ucs.getTAX_RATE_2());
				struct.setTAX_RATE_3(ucs.getTAX_RATE_3());
				struct.setNET_AMOUNT(ucs.getNET_AMOUNT());
				struct.setDISC_AMOUNT(ucs.getDISC_AMOUNT());
				struct.setTAX_ROUND_TYP(ucs.getTAX_ROUND_TYP());
				struct.setROUND_TYP(ucs.getROUND_TYP());
				struct.setCUR_CD(ucs.getCUR_CD());
				struct.setCUR_NAME(ucs.getCUR_NAME());
				struct.setVEND_CUR_UNIT(ucs.getCUR_UNIT());
				struct.setVEND_DECIMAL_FIG(ucs.getDECIMAL_FIG());
				
				//20090428 ADD START
                //���ł̏ꍇ�ɐŊz���v�Z����
        		String lowerTaxCd =
        			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
	       		if (!lowerTaxCd.equals("1")) {
	       			//�o�b�`�p�����[�^�ďo
	       			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
	       			if(!batList.isEmpty()){
	       				//�Ōv�Z���i���R�[��
	       				AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
	       				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
	       				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
	       				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
	       				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
	       				struct.setPVC2USERID(this.sysUSER_CD);
	       				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
	       				struct.setPVC2PLANTCD(this.sysPLANT_CD);
	       				struct.setPVC2TAXID("5");
	       				batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
	       				batStruct = (AE0060010Struct)batList.get(0);
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
      				struct.setTAX_AMOUNT_1(ucs.getTAX_AMOUNT_1());
    				struct.setTAX_AMOUNT_2(ucs.getTAX_AMOUNT_2());
    				struct.setTAX_AMOUNT_3(ucs.getTAX_AMOUNT_3());
    				struct.setAMOUNT_INCLUDE_TAX(ucs.getAMOUNT_INCLUDE_TAX());
            	  }
	       		 //20090428 ADD END
			} catch (DataNotFoundException e) {
				setErrorMessage("AE00060", e.getMessage());
				setErrorParameter("T_ACPT_RSLT", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("T_ACPT_RSLT", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_ACPT_RSLT", "ITEM_CD", struct.getITEM_CD());
				setErrorParameter("T_ACPT_RSLT", "WORK_IN_PROC_CD", struct.getWORK_IN_PROC_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_DATE", struct.getACPT_DATE());
				setErrorParameter("T_ACPT_RSLT", "ACPT_QTY", struct.getACPT_QTY());
				return;
			}

			// �בփ��[�g�����݂��Ȃ��ꍇ�̓��[�j���O�����Ƃ��邽�ߕʂɎ擾
			try {
				ExchRateStruct ers =
					ExchRateControl.getData(
						conn,
						_myCompanyStruct.getCOMPANY_CD(),
						ucs.getCUR_CD(),
						ucs.getEXCH_TYP(),
						null,
						struct.getACPT_DATE());
				// ��בփ��[�g���ݒ�
				struct.setEXCH_RATE(ers.getEXCH_RATE());
				// ��M�݋��z��̌v�Z
				String homeCurAmount =
					AmountCalculator.calcHomeCurAmount(
						ucs.getAMOUNT_INCLUDE_TAX(),
						ers.getEXCH_RATE(),
						ucs.getROUND_TYP(),
						_homeCurStruct.getDECIMAL_FIG());

				struct.setHOME_CUR_AMOUNT(homeCurAmount);

			} catch (DataNotFoundException e) {

				struct.setHOME_CUR_AMOUNT("0");
				struct.setEXCH_RATE("0");
				setWarningMessage("AE00061");
				setWarningParameter("T_ACPT_RSLT", "VEND_CD", struct.getVEND_CD());
				setWarningParameter("T_ACPT_RSLT", "PLANT_CD", struct.getPLANT_CD());
				setWarningParameter("T_ACPT_RSLT", "ITEM_CD", struct.getITEM_CD());
				setWarningParameter("T_ACPT_RSLT", "WORK_IN_PROC_CD", struct.getWORK_IN_PROC_CD());
				setWarningParameter("T_ACPT_RSLT", "ACPT_DATE", struct.getACPT_DATE());
				setWarningParameter("T_ACPT_RSLT", "ACPT_QTY", struct.getACPT_QTY());
			}
			struct.setSelectUnitCostFlag("true");
		} catch (SQLException e) {
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		String itemCdBak = struct.getITEM_CD();
		String itemQty = struct.getACPT_QTY();
		double acptQty = Double.parseDouble(itemQty);
		try {
			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				if(chkProcExecDate("1","",struct.getACPT_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			
			// [�����c]�ɑ��݂��Ȃ��ꍇ
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}


			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			
			// ������ԍ�� + �����񐔣��[�������]�ɂ��łɑ��݂���ꍇ
			if (entity.mT_ACPT_RSLT.check(conn, struct)) {
				setErrorMessage("ZZ01102");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}

			/*
			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}*/

			// �����ꏊ����A[�ۊǋ�]�ɑ��݂��Ȃ��ꍇ
			List whList = entity.mM_WH.read(conn, struct);
			if (whList.isEmpty()) {
				setErrorMessage("AE00018");
				setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
			} else {
				// [�ۊǋ�]."�H��R�[�h" != ��H��R�[�h��̏ꍇ
				AE0060010Struct whStruct = (AE0060010Struct) whList.get(0);
				if (!sysPLANT_CD.equals(whStruct.getPLANT_CD())) {
					setErrorMessage("AE00032");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
					setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
				}
			}

			//�o�^�{�^���`�F�b�N
			// [�o�Ɏw��]�f�[�^���擾����B
			List issueList = entity.mT_ISSUE_INST.read(conn, struct);
			// [�o�Ɏw��]�ɖ����݂̏ꍇ�B
			if (issueList.isEmpty()) 
			{
			} else {
				// ���[�v�`�F�b�N
				for (int i = 0; i < issueList.size(); i++ ) 
				{
					AE0060010Struct issueStruct = (AE0060010Struct) issueList.get(i);
					// [�o�Ɏw��]."�����"=[�ۊǋ�}�X�^]."�ۊǋ�R�[�h"�̑��݃`�F�b�N
					struct.setsetVEND_CD(issueStruct.getreadVEND_CD());
					struct.setsetPLANT_CD(issueStruct.getreadPLANT_CD());
					List m_whList = entity.mreadM_WH.read(conn, struct);
					// �x����ƈ�v��������ۊǂ����݂��Ȃ��ꍇ
					if (m_whList.isEmpty()) 
					{
						// AE00068:�x����ƈ�v��������ۊǋ悪���݂��܂���B�ۊǋ�R�[�h�̓o�^���K�v�ł��B
						setErrorMessage("AE00068");
						setErrorParameter("T_ISSUE_INST", "VEND_CD", issueStruct.getreadVEND_CD());
						setErrorParameter("T_ISSUE_INST", "PLANT_CD", issueStruct.getreadPLANT_CD());
						// �����𔲂���B
						return;
					}
				} // FOR END
			}
			//���b�g�Ǘ�������
			if (_lotCtrlFlg == true ) {
				//������Off�A���b�g�Ǘ����s���A
				if (!"true".equals(struct.getc_CANCEL()) && "1".equals(struct.geth_LOT_CTRL_FLG())) {
					//�݌Ƀ��b�g��Null�ȊO�A
					if (!"".equals(struct.getLOT_NO()) && struct.getLOT_NO() != null) {
						if (!entity.mcheckLOT_NO.check(conn, struct)) {
							//[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
							setErrorMessage("AE20603");
							setErrorParameter("T_LOT_CTRL", "LOT_NO", struct.getLOT_NO());
							return;
						}
					} else if (!"1".equals(struct.getNON_NO_ITEM_FLG()) 
							&& !"0".equals(struct.geth_LOT_NUMBERING_TYP())
							&& !(struct.geth_WORK_ODR_CD() != null && !"".equals(struct.geth_WORK_ODR_CD())
							&& "0".equals(struct.geth_FINAL_PROC_CD()))
							&& acptQty > 0){
						//�݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
                        String itemCdStr = struct.getITEM_CD();              //�i�ڔԍ�
		                String acptDateStr = struct.getACPT_DATE();          //�����
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						//���b�g�̔ԋ��ʕ��i
						List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
						//���ʃX�e�[�^�X������I��
			            if(bc.getResultStatus().intValue() == 1){
			                if(resultList != null && resultList.size() > 0){
			        	        String result1 = (String)resultList.get(0);
			        	        struct.setLOT_NO(result1);                   //���b�g�ԍ�
			                }
			            }else{
			            	//���ʃX�e�[�^�X������I���ȊO
			                if(resultList != null && resultList.size() > 1){
			                	//�����̃G���[�R�[�h�ŃG���[���b�Z�[�W��\����
			        	        String result2 = (String)resultList.get(1);
			        	        setErrorMessage(result2);
			        	        struct.setLOT_NO(null);
			        	        return;
			                }
			            }
					}
				} else {
					struct.setLOT_NO(null);
				}
			}
			
			
			String lotNumberingTypBak = struct.geth_LOT_NUMBERING_TYP();
			String lotControlFlgBak = struct.geth_LOT_CTRL_FLG();
			String finalProcFlgBak = struct.geth_FINAL_PROC_CD();
			String vendlotno_bak = struct.getLOT_NO();
			//String puch_odr_cd_bak = struct.getPUCH_ODR_CD();
			// �G���[���������珈���𒆒f
			if (msgStruct.hasError()) {
				return;
			}

			// JavaScript�̌v�Z�ł́A�ۂߌ덷���������Ă���\�������邽�ߍČv�Z
			// ��������z��̌v�Z
			String puchOdrAmount =
				AmountCalculator.calcPuchOdrAmount(
					struct.getACPT_QTY(),
					struct.getUNIT_COST(),
					struct.getROUND_TYP(),
					struct.getVEND_DECIMAL_FIG());
			struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
            if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                // �����ꍀ�ڎ擾�Z�b�g
               String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_1", resource);
               setErrorMessage("AA00215",ErrInfo);
           	   return;
            }
			// ��l�����z��̌v�Z
			String discAmount =
				AmountCalculator.calcDiscAmount(
					struct.getPUCH_ODR_AMOUNT(),
					struct.getNET_AMOUNT());
			struct.setDISC_AMOUNT(discAmount);
			
			// Add Start 20131227 fang-xf
			TaxStruct ts =
				TaxControl.getDataTax(
					conn,
					_myCompanyStruct.getCOMPANY_CD(),
					struct.getVEND_CD(),
					struct.getITEM_CD(),
					struct.getACPT_DATE(),
					struct.getTAX_CD());
			// �ŗ��P
			struct.setTAX_RATE_1(ts.getTAX_RATE_1());
			// �ŗ��Q
			struct.setTAX_RATE_2(ts.getTAX_RATE_2());
			// �ŗ��R
			struct.setTAX_RATE_3(ts.getTAX_RATE_3());
			// �Œ[�������敪
			struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
			// Add End 20131227 fang-xf
			
	        //20090428 ADD START
	        //���ł̏ꍇ�ɐŊz���v�Z����
	 		String lowerTaxCd =
	 			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
	 		if (!lowerTaxCd.equals("1")) {
				//�o�b�`�p�����[�^�ďo
				List batList = entity.mSYS_BAT_PARM.read(conn, struct);
				if(!batList.isEmpty()){
					//�Ōv�Z���i���R�[��
					AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
					struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
					struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
					struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
					struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
					struct.setPVC2USERID(this.sysUSER_CD);
					struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
					struct.setPVC2PLANTCD(this.sysPLANT_CD);
					struct.setPVC2TAXID("5");
					batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
					batStruct = (AE0060010Struct)batList.get(0);
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
	 		//20090428 ADD END
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
			//�@[�����c]."��������敪"��2:�����Ɍ������s�����������=0����"���������t���O"=1�@2009/07/14
			if("2".equals(struct.getACPT_INSPC_TYP()) &&
			   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
			   "1".equals(_inspcvalue)){
				struct.setACPT_STS_TYP("2");
			}
						
			// [�����c]."��������������敪"��1:����̂� �̏ꍇ
			if ("1".equals(struct.getACPT_INSPC_TYP())) {
				struct.setINSPC_WH_CD(null);
			}

			//���������ON�̏ꍇ���A[�����c]."��������敪"��2:�����Ɍ������s���̏ꍇ�A�����ԋ敪��2:���������ɃZ�b�g 2006/05/22 up
			if(("2".equals(struct.getACPT_INSPC_TYP())) && "true".equals(struct.getc_CANCEL())){
				struct.setACPT_STS_TYP("2");
			}
			// [�����c]."���i�����t���O"��0:���i�ȊO�i�ʏ�d���i�j�������ꍇ
			if (struct.getNON_NO_ITEM_FLG().equals("0")) {
				struct.setITEM_NAME(null);
			}
			// [�����c]."��������������敪"��1:����̂� �������ꍇ
			if (struct.getACPT_INSPC_TYP().equals("1")) {
				struct.setINSPC_WH_CD(null);
			}
			// [�������]��o�^
			entity.mT_ACPT_RSLT.create(conn, struct);

			// [�����c]."��������敪"��1:����݂̂̏ꍇ�܂���"��������敪"��2:�����Ɍ������s�������������ON�̏ꍇ�̏ꍇ2006/04/14up
			if ("1".equals(struct.getACPT_INSPC_TYP())
				||  ("2".equals(struct.getACPT_INSPC_TYP())) && "true".equals(struct.getc_CANCEL())) {
				// [��������]��o�^
				entity.mT_INSPC_RSLT.create(conn, struct);
			}

			// �S��������̏ꍇ
			if ("true".equals(struct.getc_COMPLETE())) {
				List aList = entity.mT_RLSD_PUCH_ODRForComplete.read(conn, struct);
				AE0060010Struct aStruct = (AE0060010Struct) aList.get(0);
				setStructSystemData(aStruct);
				
				// ���������ON�̏ꍇ�A����`�[���s�t���O=1:������
				// ���������OFF�̏ꍇ�A����`�[���s�t���O=0:�ΏۊO
				if ("true".equals(struct.getc_CANCEL())) {
					aStruct.setODR_CANCEL_SLIP_ISS_FLG("1");
					//[�����c]."��������敪"��2:�����Ɍ������s���̏ꍇ�A
					//[�����c]."���������t���O",[�����c]."����������"��[���]."�����"���Z�b�g���� 2006/04/14up
					if ("2".equals(struct.getACPT_INSPC_TYP())){
						aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
						aStruct.setINSPC_CMPLT_FLG("1");
					}
				} else {
					aStruct.setODR_CANCEL_SLIP_ISS_FLG("0");
				}
				
				//�@[�����c]."��������敪"��2:�����Ɍ������s�����������=0����"���������t���O"=1�@2009/07/14
				if("2".equals(struct.getACPT_INSPC_TYP()) &&
						   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
						   "1".equals(_inspcvalue)){
					aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
					aStruct.setINSPC_CMPLT_FLG("1");
				}
				aStruct.setODR_CANCEL_CAUSE_CD(struct.getODR_CANCEL_CAUSE_CD());
				
				// [�����c]���X�V
				entity.mT_RLSD_PUCH_ODRForComplete.update(conn, aStruct);
			}

			// ������ъ֘A�̃e�[�u�����X�V
			String[] message;
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			boolean result = ia.addAcpt(struct.getPUCH_ODR_CD(), struct.getACPT_NO(), struct.getEXCH_RATE(), _myCompanyStruct.getCOMPANY_CD());
			if (!result) {
				if (ia.getErrorList() != null && !ia.getErrorList().isEmpty() ) {
					if ("BZ00180".equals(ia.getErrorList().get(0).toString())) {
						setErrorMessage("BZ00180");
						return;
					}
				}
				setErrorMessage("AE05017");
				setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_ACPT_RSLT", "ACPT_NO", struct.getACPT_NO());
				return;
			}

			// �Ɩ����[�j���O�̏o��
			for(int i=0; i<ia.getWarnList().size(); i++){
				message = (String[])ia.getErrorList().get(i);
				if("AD10003".equals(message[0])){
					setWarningMessage("AE00162");
				}
			}
			if(!ia.getErrorList().isEmpty()){
				for(int i=0; i<ia.getErrorList().size(); i++){
					message = (String[])ia.getErrorList().get(i);
					setErrorMessage(message[0], message[1]);
				}
				conn.rollback();
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
			//���������ON�̏ꍇ���A[�����c]."��������敪"��2:�����Ɍ������s���̏ꍇ�A
			//[�����c]."���������t���O"=0:��,[�����c]."����������"��NULL���Z�b�g���� 2006/04/14up
			/*if ("true".equals(struct.getc_CANCEL()) && "2".equals(struct.getACPT_INSPC_TYP())) {
				entity.mupdateT_RLSD_PUCH_ODR_INSPC_CMPLT.update(conn, struct);
			}*/
			
			//�x���i�݂Ȃ��o�ɏ���
			BigDecimal planSum     = new BigDecimal(0);			// �����(��ʍ���)
			BigDecimal denominator = new BigDecimal(0);			// �o�Ɏw���P�ʐ����q
			BigDecimal numerator   = new BigDecimal(0);			// �o�Ɏw���P�ʐ�����

			boolean mHantei = false ;							// �݌ɐ��}�C�i�X�m�F�t���O
			boolean lHantei = false ;							// �݌ɐ��}�C�i�X�m�F�t���O

			// [�o�Ɏw��]�f�[�^���擾����B
			List issueInstList = entity.mT_ISSUE_INST.read(conn, struct);
			//String flgForT_PART_SUPPLIED_ISSUE = "insert";
			if (issueInstList.isEmpty()) 
			{
			} else {
				for (int i = 0; i < issueInstList.size(); i++ ) 
				{
					AE0060010Struct tempIssueStruct = (AE0060010Struct) issueInstList.get(i);
					// �g�p�\�萔�ʂ̌v�Z
					planSum = new BigDecimal(struct.getACPT_QTY());										// ���:�����
					denominator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �o�Ɏw���P�ʐ����q
					numerator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �o�Ɏw���P�ʐ�����

					double beforeQty = 0;		// �X�V�O�莝�݌ɐ�(������)
					double afterQty = 0;		// �X�V��莝�݌ɐ�(������)
					double rcvissueQty = 0;		// �ۊǋ�ʓ��o�ɓ��o�ɐ�(������)

					// �݌ɐ��P�ʋ敪�̔���
					if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
					{
						// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
						// �v�Z���ɑg�ݍ��܂Ȃ��B
						// 1:�����Ǘ�
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							// �P�ʕ���A���q��0�̏ꍇ�B
							planSum = planSum.setScale(0,BigDecimal.ROUND_UP);
						} else {
							planSum = planSum.multiply(numerator).divide(denominator,0,BigDecimal.ROUND_UP).setScale(1);
						}
					} else {
						// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
						// �v�Z���ɑg�ݍ��܂Ȃ��B
						// 2:�����Ǘ�
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							planSum = planSum.setScale(4,BigDecimal.ROUND_HALF_UP);
						} else {
							// ������5�ʂ��l�̌ܓ�
							planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
							// �����̕\���X�P�[�����������\�b�h��2006/04/11up
							//planSum = setDisplayscale(planSum);
							//�����̕\���X�P�[������
							/*BigDecimal intVal = new BigDecimal("" + planSum.intValue());
							BigDecimal decimalVal = planSum.subtract(intVal).multiply(new BigDecimal(10000));
							int decVal = decimalVal.intValue();
							int roundCount = 1;
							while (true)
							{
								decVal = decVal / 10;
								if (decVal == 0) 
								{
									// ���[�v�𔲂���B
									break;
								} 
								roundCount++;
							} // END WHILE
							planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);*/
							
						}
					}

					//�x���i�e�[�u���̎�L�[�����݂���ꍇ�̑Ή�(�i�ڍ\���ɋ[���i�ڂ�����A�����i�ڂ��݂Ȃ��o�ɂ���ꍇ)2006/04/11up
					
					//System.out.println("�����ԍ�" + struct.getPUCH_ODR_CD());
					//System.out.println("�����" + struct.getACPT_NO());
					//System.out.println("�i�ڔԍ�" + tempIssueStruct.getreadITEM_CD());
					String parentITEM_CD = struct.getITEM_CD();
					AE0060010Struct tempStruct = new AE0060010Struct();
					tempStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
					tempStruct.setACPT_NO(struct.getACPT_NO());
					tempStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());
					List PartSuppliedIssueList = entity.mreadT_PART_SUPPLIED_ISSUE.read(conn, tempStruct);
					if(PartSuppliedIssueList.isEmpty()){//�x���i�g�p�e�[�u���ɓ����L�[�����݂��Ȃ��ꍇ
						if(parentITEM_CD != null && !"".equals(parentITEM_CD.trim())){
							String subITEM_CD = tempIssueStruct.getreadITEM_CD();
							// ���i�\�����|�W�g���쐬
                            ProductStructureRepository repository = new ProductStructureRepository(conn);
					        if(checkReverseRooping(repository, subITEM_CD, parentITEM_CD)){
                                setErrorMessage("AE20607");
                                if(_lotCtrlFlg == true && !"0".equals(struct.geth_LOT_NUMBERING_TYP())){
			                        struct.setLOT_NO(null);
			                    }
                				conn.rollback();
                                return;
                            }
						}
						
						// 1�x���i�g�p�e�[�u��(T_PART_SUPPLIED_ISSUE)�̓o�^����
						struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());												// �����ԍ�(��ʒl)
						struct.setsetACPT_NO(struct.getACPT_NO());														// �����
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());											// �x���i�i�ڔԍ�
						struct.setsetACPT_QTY(struct.getACPT_QTY());													// �����(��ʒl)
						struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());									// ��ЃR�[�h
						struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());											// �����R�[�h
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());									// ����
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());						// ���Ԏ}��
						struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());										// �H��R�[�h
						struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());								// �o�Ɏw���ԍ�
						struct.setsetMRP_ODR_TYP(tempIssueStruct.getreadMRP_ODR_TYP());									// �i�ڎ�z�敪
						struct.setsetSUPPLIED_ISSUE_GNR_TYP("1");														// �����敪(1:�݂Ȃ��o��)
						struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));										// �g�p�\�萔��
						struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));											// �g�p�ϐ���
						struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �x���i�g�p�P�ʐ�����
						struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �x���i�g�p�P�ʐ����q
						struct.setsetSUPPLIED_DATE(struct.getACPT_DATE());												// �g�p��(��ʒl)
						struct.setsetPART_SUPPLIED_COMMENT(null);														// �x���i�g�p���l
						entity.mT_PART_SUPPLIED_ISSUE.create(conn, struct);
					}else{
						//flgForT_PART_SUPPLIED_ISSUE= "update";
						///�x���i�g�p�e�[�u���ɓ����L�[�����݂���ꍇ
						AE0060010Struct tempSuppliedStruct = (AE0060010Struct) PartSuppliedIssueList.get(0);
						BigDecimal Denominator = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_DENOMINATOR());	// ���������x���i�g�p�P�ʐ�����
						BigDecimal Numerator   = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_NUMERATOR());		// ���������x���i�g�p�P�ʐ����q
						BigDecimal newDenominator = new BigDecimal(0); //�v�Z��̎x���i�g�p�P�ʐ�����
						BigDecimal newNumerator = new BigDecimal(0);  //�v�Z��̎x���i�g�p�P�ʐ����q
						BigDecimal gcd = new BigDecimal(0); //���ꓯ�m�̍ő���� 2006/05/22 up
						
						//�x���i�g�p�P�ʐ�����E���q�̌v�Z���s��
						if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
						{
							// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
							// �l��ύX���Ȃ��B
							// 1:�����Ǘ�
							if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
								"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
							{
								// �P�ʕ���A���q��0�̏ꍇ�B
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �x���i�g�p�P�ʐ�����
								struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �x���i�g�p�P�ʐ����q
							} else {
								//newDenominator = Denominator.multiply(denominator).setScale(0);
								//newNumerator = numerator.multiply(Denominator).add(Numerator.multiply(denominator)).setScale(0);
								gcd = getgcd(Denominator,denominator);//���ꓯ�m�̍ŏ����{�����X�V���镪��Ƃ��� 2006/05/22 up
								newDenominator = Denominator.multiply(denominator).divide(gcd,0,BigDecimal.ROUND_UP); //����i�ŏ����{���j
								newNumerator = Numerator.multiply(newDenominator).divide(Denominator,0,BigDecimal.ROUND_UP).add(numerator.multiply(newDenominator).divide(denominator,0,BigDecimal.ROUND_UP));//���q�̌v�Z
								//���ꓯ�m�̍ŏ����{�����X�V���镪��Ƃ��� 2006/05/22 end
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
								struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
							}
						} else {
							// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
							// �l��ύX���Ȃ��B
							// 2:�����Ǘ�
							if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
								"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
							{
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �x���i�g�p�P�ʐ�����
								struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �x���i�g�p�P�ʐ����q
							} else {
								// ������5�ʂ��l�̌ܓ�
								//planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
								//newDenominator = setDisplayscale(Denominator.multiply(denominator).setScale(4,BigDecimal.ROUND_HALF_UP));
								//newNumerator = setDisplayscale(numerator.multiply(Denominator).add(Numerator.multiply(denominator)).setScale(4,BigDecimal.ROUND_HALF_UP));
								if(Denominator.compareTo(denominator) >= 0){ //�傫���ق��̕���𕪕�Ƃ��čX�V����2006/05/22 up
									newDenominator = Denominator;
									newNumerator = Numerator.add((numerator.multiply(Denominator)).divide(denominator,4,BigDecimal.ROUND_UP));
								}else{
									newDenominator = denominator;
									newNumerator = numerator.add((Numerator.multiply(denominator)).divide(Denominator,4,BigDecimal.ROUND_UP))/*.setScale(4,BigDecimal.ROUND_HALF_UP))*/;
								}//�傫���ق��̕���𕪕�Ƃ��čX�V���� 2006/05/22 end
								struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
								struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
							}
						}
						BigDecimal SuppliedIssueQty = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_ISSUE_QTY());	// ���������g�p�\�萔��
						struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));				// �g�p�\�萔��
						struct.setsetTOTAL_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));
						struct.setITEM_CD(tempIssueStruct.getreadITEM_CD());					
						// �g�p�ϐ���
						//struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));							// �x���i�g�p�P�ʐ�����
						//struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));								// �x���i�g�p�P�ʐ����q

						//�o�^���錅���`�F�b�N 2006/05/22 up
						
						if(newDenominator.compareTo(Decival) > 0 ||
							newNumerator.compareTo(Decival) > 0 ||
							SuppliedIssueQty.compareTo(Decival) > 0){//�o�^���鐔�l�������ӂꂪ�N����ꍇ
							setErrorMessage("ZZ05109");
							setErrorParameter("T_PART_SUPPLIED_ISSUE", "ITEM_CD", tempIssueStruct.getreadITEM_CD());
							return ;
						}//�o�^���錅���`�F�b�N 2006/05/22 end
						entity.mupdateT_PART_SUPPLIED_ISSUE.update(conn, struct);
					}
				    if(lotNoList != null){
                        lotNoList.clear();
                    }
					//���b�g�Ǘ������ρA���b�g�Ǘ����s���A����������`�F�b�N Off 
					if(_lotCtrlFlg == true
							&& "1".equals(tempIssueStruct.getreadLOT_CONTROL_FLG()) 
							&& Calculate.compare(struct.getACPT_QTY(), "0") != 0
							&& !"true".equals(struct.getc_CANCEL())){
                        AE0060010Struct chkStruct = new AE0060010Struct();
                        chkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());           //�����ԍ�
                        chkStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());      //�i�ڔԍ�
                        chkStruct.setACPT_NO(struct.getACPT_NO());                   //�����
                        //�o�Ɏ��і��ׂɑ��݃`�F�b�N
                        if(entity.mcheckT_LOT_ISSUE_INST.check(conn, chkStruct)){
                    	    AE0060010Struct tmpStruct = new AE0060010Struct();
                    	    tmpStruct.setACPT_NO(struct.getACPT_NO());               //�����
                    	    tmpStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());       //�����ԍ�
                    	    tmpStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());  //�i�ڔԍ�
                    	    tmpStruct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());    //�����ԍ�
                    	    tmpStruct.setsetACPT_NO(struct.getACPT_NO());            //�����
                    	    tmpStruct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());//�i�ڔԍ�
                        	//[�x���i�g�p]�̓Ǎ�
                    	    List tmpList = entity.mSelectT_PART_SUPPLIED_ISSUE.read(conn, tmpStruct);
                    	    if(tmpList != null && tmpList.size() > 0){
                    		    AE0060010Struct tpsiStruct = (AE0060010Struct)tmpList.get(0);
                    		    tmpStruct.setVEND_CD(tpsiStruct.getreadVEND_CD());                //�����R�[�h
                		        tmpStruct.setPLANT_CD(tpsiStruct.getreadPLANT_CD());              //�H��R�[�h
                		        tmpStruct.setISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD());    //�o�Ɏw���ԍ�
                		        tmpStruct.setsetISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD()); //�o�Ɏw���ԍ�
                		        tmpStruct.setsetSUPPLIED_DATE(tpsiStruct.getreadSUPPLIED_DATE()); //�g�p��
                		        //[���b�g�ʎg�p����]�̒ǉ�
                		        if(!insertT_LOT_USE_RSLT(tmpStruct)){
                		        	if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
			                            struct.setLOT_NO(null);
			                        }
                			        return;
                		        }
                    	    }else{
                    	    	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���B
                    		    setErrorMessage("AE20609");
                    		    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
			                        struct.setLOT_NO(null);
			                    }
    						    conn.rollback();
                	            return;
                    	    }
                        }else{
                        	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���B
                    	    setErrorMessage("AE20609");
                    	    if(!"0".equals(struct.geth_LOT_NUMBERING_TYP())){
				                struct.setLOT_NO(null);
				            }
						    conn.rollback();
                    	    return;
                        }
                    }
					// �A�ۊǋ�ʕi�ڍ݌�(T_ITEM_STOCK)�A�ۊǋ�ʐ��ԍ݌�(T_JOB_ODR_CD_STOCK)�̓o�^�E�X�V����
					// �i�ڎ�z�敪�ɂ��X�V�Ώۂ̕ύX
					// MRP�Ǘ��i  4:�ƭ�َ�z�i�ځA5:ۯĎ�z�i�ځA6:��ʎ�z�i�ځA7:�����_��z�i��
					// ���ԊǗ��i 1:���ԁA2 :�݌Ɉ����^����

					// �ۊǋ�R�[�h�擾
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());                       //�����R�[�h
					struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());                     //�H��R�[�h
					List mWhList = entity.mreadM_WH.read(conn, struct);
					AE0060010Struct tempWhStruct = (AE0060010Struct) mWhList.get(0);

					if (("4".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("5".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
					   ("6".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("7".equals(tempIssueStruct.getreadMRP_ODR_TYP())))
					{
						// MRP�Ǘ��i(�ۊǋ�ʕi�ڍ݌ɑΏ�)
						// �ۊǋ�ʕi�ڍ݌Ƀ`�F�b�N
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
						List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);

						// �X�V�`�F�b�N
						if (itemStList.isEmpty()) 
						{
							// �ۊǋ�ʕi�ڍ݌ɓo�^
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 01.�i�ڔԍ�
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 02.�ۊǋ�R�[�h
							struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 03.�H��R�[�h
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 04.�i�ڕʎ莝�݌ɐ�
							entity.minsertT_ITEM_STOCK.create(conn, struct);

							// �X�V�O�莝�݌ɐ��Z�b�g
							beforeQty = 0;								// �X�V�O
							afterQty = planSum.doubleValue() * -1;		// �X�V��
							rcvissueQty = planSum.doubleValue() * -1;	// ���o�ɐ�
							// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
							mHantei = true;
						} else {
							AE0060010Struct tempItemStStruct = (AE0060010Struct) itemStList.get(0);
							// �ۊǋ�ʕi�ڍ݌ɍX�V
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue()));						// 01.�i�ڕʎ莝�݌ɐ�
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// ����.�i�ڔԍ�
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// ����.�ۊǋ�R�[�h
							entity.mupdateT_ITEM_STOCK.update(conn, struct);

							// �X�V�O�莝�݌ɐ��Z�b�g
							beforeQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY());	// �X�V�O
							afterQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue();						// �X�V��
							rcvissueQty = planSum.doubleValue() * -1;										// ���o�ɐ�
							// �݌ɐ��̃}�C�i�X�`�F�b�N
							if (afterQty < 0 && lHantei == false)
							{
								// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
								mHantei = true;
								lHantei = true; //2006/05/22 up
							}
						}
					} else if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) {
						// ���ԊǗ��i(�ۊǋ�ʐ��ԍ݌ɑΏ�)
						// �ۊǋ�ʐ��ԍ݌Ƀ`�F�b�N
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// ����
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// ���Ԏ}��
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());								// �i�ڔԍ�
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());									// �ۊǋ�R�[�h
						List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

						// �X�V�`�F�b�N
						if (itemJobList.isEmpty()) 
						{
							// �ۊǋ�ʐ��ԍ݌ɓo�^
							struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// 01.����
							struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// 02.���Ԏ}��
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 03.�i�ڔԍ�
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 04.�ۊǋ�R�[�h
							struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 05.�H��R�[�h
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 06.���ԕʎ莝�݌ɐ�
							entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);
							// �X�V�O�莝�݌ɐ��Z�b�g
							beforeQty = 0;								// �X�V�O
							afterQty = planSum.doubleValue() * -1;		// �X�V��
							rcvissueQty = planSum.doubleValue() * -1;	// ���o�ɐ�
							// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
							mHantei = true;
						} else {
							AE0060010Struct tempJobStruct = (AE0060010Struct) itemJobList.get(0);
							// �ۊǋ�ʐ��ԍ݌ɍX�V
							struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue()));						// 01.���ԕʎ莝�݌ɐ�
							struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// ����.����
							struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// ����.���Ԏ}��
							struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// ����.�i�ڔԍ�
							struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// ����.�ۊǋ�R�[�h
							entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);
							// �X�V�O�莝�݌ɐ��Z�b�g
							beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());		// �X�V�O
							afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
															- planSum.doubleValue();						// �X�V��
							rcvissueQty = planSum.doubleValue() * -1;										// ���o�ɐ�
							// �݌ɐ��̃}�C�i�X�`�F�b�N
							if (afterQty < 0 && lHantei == false)
							{
								// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
								mHantei = true;
								lHantei = true; //2006/05/22 up
							}
						}
					} // END IF�ۊǋ�ʕi�ڍ݌ɁA�ۊǋ�ʐ��ԍ݌ɂ̓o�^�E�X�V����

					// �}�C�i�X����̃C���t�H���[�V�����\�� //�R�����g�A�E�g 2006/05/22 up
					/*if (mHantei == true && lHantei == false)
					{
						// AE00069:�x���i�݂Ȃ��o�ɂŎ����ۊǋ�̕i�ڂ܂���
						// ���Ԏ莝�݌ɐ����ꕔ�}�C�i�X�ƂȂ�܂����B
						//setErrorMessage("AE00069");
						setWarningMessage("AE00069");
						// ����t���O��"true"���Z�b�g
						lHantei = true;
					}*/

					// �B�ۊǋ�ʓ��o��(T_RCV_ISSUE)�̓o�^����
					// ���o�ɔԍ��̔�
					CollectNumber collectNum = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
												this.sp.getProcId(),this.sysPLANT_CD);
					String no = collectNum.getNo();
					if (no == null || no.length() == 0) 
					{
						//�̔Ԍ��ʂ��Ȃ�
						setErrorMessage("ZZ01106");
						return;
					}
					struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.���o�ɊǗ��ԍ�
					struct.setsetRCV_ISSUE_TYP("2");														// 02.���o�ɋ敪(2:�Œ�)
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());									// 03.�i�ڔԍ�
					struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());								// 04.�H��R�[�h
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.�ۊǋ�R�[�h

					// �i�ڎ�z�敪�ɂ��X�V�l�ύX
					if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
					    ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) 
					{
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// 06.����
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// 07.���Ԏ}��
					}
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.���:�����ԍ�
					struct.setsetACPT_NO(struct.getACPT_NO());												// 09.���:�����
					struct.setsetACPT_RSLT_CRCT_NO("0");													// 10.������ђ�����(0:�Œ�)
					struct.setsetINSPEC_RSLT_CRCT_NO("0");													// 11.�������ђ�����(0:�Œ�)
					struct.setsetWORK_ODR_CD(null);															// 12.��ƌv��ԍ�(null)
					struct.setWORK_IN_PROC_CD(null);														// 13.�d�|��ƃR�[�h(null)
					struct.setsetPARTIAL_PRD_NO("0");														// 14.�����(0:�Œ�)
					struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.��Ǝ��ђ�����(0:�Œ�)
					struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());						// 16.�o�Ɏw���ԍ�
					struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.���o�ɑO�݌ɐ�
					struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.���o�ɐ�
					struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.���o�Ɍ�݌ɐ�
					struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.���o�ɋ��z(0:�Œ�)
					struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.���o�ɔN����
					struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.���o�ɔ����敪(71:�Œ�)
					struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.���o�ɒ[��(0:�Œ�)
					struct.setsetDEFECT_CAUSE_CD(null);														// 24.���o�ɕs�Ǘ��R�R�[�h
					struct.setsetSTOCK_UPD_TYP("2");														// 25.�݌ɍX�V�敪(2:�Œ�)
					struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.���o�Ɋ����t���O
					struct.setsetOD_NO(tempIssueStruct.getreadOD_NO());										// 27.�I�[�_�f�}���h�ԍ�
					struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 28.���:���[�J���b�g�ԍ�
					struct.setsetRCV_ISSUE_COMMENT(null);													// 30.���o�ɔ��l(null)
					struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());							// 31.��ЃR�[�h
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());									// 32.�����R�[�h
					struct.setsetCONS_TYP(tempIssueStruct.getreadCONS_TYP());								// 33.�x���敪
					struct.setsetCONS_EXEC_DATE(null);														// 34.�L���x�����ђ��o��
					
					if(lotNoList != null && lotNoList.size() > 0){
					    for(int l=0; l<lotNoList.size(); l++){
						    if(l > 0){
							    no = null;
						        CollectNumber collectNum1 = new CollectNumber(CollectNumber.ISSUE_CD,this.sysUSER_CD,
									                		this.sp.getProcId(),this.sysPLANT_CD);
					            no = collectNum1.getNo();
					            if (no == null || no.length() == 0) 
					            {
					                //�̔Ԍ��ʂ��Ȃ�
					                setErrorMessage("ZZ01106");
					                if(!"0".equals(lotNumberingTypBak)){
				                        struct.setLOT_NO(null);
				                    }
								    conn.rollback();
					                return;
					            }
					            beforeQty = afterQty;
					        }
					        struct.setsetRCV_ISSUE_CTRL_CD(no);
					        struct.setsetLOT_NO((String)lotNoList.get(l));                                          // 29.�݌Ƀ��b�g�ԍ�
					        rcvissueQty = getDoubleValue((String)lotNoList.get(l+1)) * -1;
					        afterQty = beforeQty + rcvissueQty;
					        struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.���o�ɑO�݌ɐ�
					        struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.���o�ɐ�
					        struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.���o�Ɍ�݌ɐ�
					        entity.minsertT_RCV_ISSUE.create(conn, struct);
						    //���b�g�ʕi�ڍ݌ɓo�^�D�X�V
					        BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					        List updateLotStockList = bc.excUpdateLotStockFd(no, "");
             
					        if(bc.getResultStatus().intValue() == 1){
					        }else{
					            if(updateLotStockList != null && updateLotStockList.size() > 0){
					        	    setErrorMessage((String)updateLotStockList.get(0));
					        	    if(!"0".equals(lotNumberingTypBak)){
				                        struct.setLOT_NO(null);
				                    }
								    conn.rollback();
				                    return;
					            }else{
					        	    setErrorMessage("ZZ22001");
								    conn.rollback();
				                    return;
					            }
					        }

					        if("1".equals(lotControlFlgBak)){
					        	if(acptQty != 0 && vendlotno_bak != null){
					        		  List lotTraceList = bc.excMakeLotTraceFd(tempIssueStruct.getreadITEM_CD(),       //[���b�g�ʎg�p����].�h�x���i�ڔԍ��h
			                                   								   (String)lotNoList.get(l),               //[���b�g�ʎg�p����].�h�݌Ƀ��b�g�ԍ��h
			                                   								   itemCdBak,                              //[���].�h�����ԍ��h�Ō�������[�����c]�D�h�i�ڔԍ��h
					        				                                   vendlotno_bak,                          //[�������].�h�݌Ƀ��b�g�ԍ��h
					        				                                   "1");                                   //1:���
							            if(bc.getResultStatus().intValue() == 1){
							            	// ���b�g�g���[�X�o�^�E�X�V�����������ꍇ�A�m���b�g�g���[�X�n�̍X�V���s��
							            	tempStruct = new AE0060010Struct();
							            	// [���b�g�g���[�X].�g���i�ڔԍ��h��[���b�g�ʎg�p����].�h�x���i�ڔԍ��h
							            	tempStruct.setFROM_ITEM_CD(tempIssueStruct.getreadITEM_CD());
							            	// [���b�g�g���[�X].�g�����b�g�ԍ��h��[���b�g�ʎg�p����].�h�݌Ƀ��b�g�ԍ��h
							            	tempStruct.setFROM_LOT_NO((String)lotNoList.get(l));
							            	// [���b�g�g���[�X].�g��i�ڔԍ��h��[���].�h�����ԍ��h�Ō�������[�����c]�D�h�i�ڔԍ��h
							            	tempStruct.setTO_ITEM_CD(itemCdBak);
							            	// [���b�g�g���[�X].�g�惍�b�g�ԍ��h��[�������].�h�݌Ƀ��b�g�ԍ��h
							            	tempStruct.setTO_LOT_NO(vendlotno_bak);
							            	// [���b�g�g���[�X].�g�攭���ԍ��h=[���].�h�����ԍ��h
							            	tempStruct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
							            	// ���[�U�R�[�h
							            	tempStruct.setsUser_ID(getsysUSER_CD());
							            	//[�������]�Ŕ����ԍ����擾
							            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
							            	if((formList != null && formList.size() > 0)){
							            		//�����ԍ����\�[�g���i�~���j�ɂ��A�P���ڂ̃��R�[�h���擾����B
								            	AE0060010Struct orderStruct = (AE0060010Struct) formList.get(0);
								            	//[���b�g�g���[�X].�g�������ԍ��h = [�������]."�����ԍ�"
								            	tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
							            	}else{
							            		tempStruct.setFROM_PUCH_ODR_CD("");
							            	}
							            	// �m���b�g�g���[�X�n�̍X�V���s��
							            	entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
							            }else{
							                if(lotTraceList != null && lotTraceList.size() > 0){
							         	        setErrorMessage((String)lotTraceList.get(0));
							         	        if(!"0".equals(lotNumberingTypBak)){
						                            struct.setLOT_NO(null);
						                        }
											    conn.rollback();
						                        return;
							                }else{
								        	    setErrorMessage("ZZ22016");
											    conn.rollback();
							                    return;
							                }
							            }							        
					        	   }
					          }else{
					        }
					        l = l+1;
					    }
					}else{
						struct.setsetLOT_NO(null);
					    entity.minsertT_RCV_ISSUE.create(conn, struct);
					}
				} // END FOR
			}
			if (mHantei == true ){ //2006/05/22 up
			// AE00069:�x���i�݂Ȃ��o�ɂŎ����ۊǋ�̕i�ڂ܂���
			// ���Ԏ莝�݌ɐ����ꕔ�}�C�i�X�ƂȂ�܂����B
			//setErrorMessage("AE00069");
			setWarningMessage("AE00069");
			}

			// �ȉ��A��ʍĕ\�����ꏈ��
			// ���ח̈���폜�i�������A����񐔂͑ޔ��A��������B�j
			String acptNo = struct.getACPT_NO();
			initializeDetail();
			struct.setACPT_NO(acptNo);

			// �o�^�����u�����ԍ��v�u����񐔁v�ōŐV�̃f�[�^��ǂݒ����B
			List formList = entity.mFormUpdate.read(conn, struct);

			// ������ԍ���ɓ��͂��ꂽ�l���A[�����c]�ɑ��݂��Ă��Ȃ��B
			if (formList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// �f�[�^���擾
			AE0060010Struct formStruct = (AE0060010Struct) formList.get(0);
			
			formStruct.setACPT_INSPC_TYP_DN(multcombo("ACPT_INSPC_TYP",formStruct.getACPT_INSPC_TYP()));
			formStruct.setPUCH_ODR_STS_TYP_DN(multcombo("PUCH_ODR_STS_TYP",formStruct.getPUCH_ODR_STS_TYP()));
			formStruct.setINSPC_CMPLT_FLG_DN(multcombo("INSPC_CMPLT_FLG",formStruct.getINSPC_CMPLT_FLG()));
			formStruct.setSPL_ITEM_TYP_DN(multcombo("SPL_ITEM_TYP",formStruct.getSPL_ITEM_TYP()));
			formStruct.setPRODUCT_TYP_DN(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
			formStruct.setNON_NO_ITEM_FLG_DN(multcombo("NON_NO_ITEM_FLG",formStruct.getNON_NO_ITEM_FLG()));
			formStruct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",formStruct.getUNIT_QTY_TYP()));


			// [�����c]."������ԋ敪" = 9:��������̏ꍇ
			if ("9".equals(formStruct.getPUCH_ODR_STS_TYP())) {
				if ("0".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [�����c]."����`�[���s�t���O" = 0:�ΏۊO�̏ꍇ
					setWarningMessage("AE05005");
				} else if ("1".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [�����c]."����`�[���s�t���O" = 1:�����s�̏ꍇ
					setWarningMessage("AE00089");
				} else if ("2".equals(formStruct.getODR_CANCEL_SLIP_ISS_FLG())) {
					// [�����c]."����`�[���s�t���O" = 2:���s�ς̏ꍇ
					setWarningMessage("AE00087");
				}
				setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", formStruct.getPUCH_ODR_CD());
			}
			
			// [�����c]."��������������敪"��2:����ƌ������s�Ȃ� �̏ꍇ
			if ("2".equals(formStruct.getACPT_INSPC_TYP())) {
				setInspcWhStruct(formStruct);
			} else {
				// [�����c]."��������������敪"��1:����̂� �̏ꍇ
				formStruct.setINSPC_WH_CD(null);
				formStruct.setINSPC_WH_NAME(null);
			}

			// ��ʂɕ\��
			setStruct(formStruct);
			if ("9".equals(struct.getPUCH_ODR_STS_TYP())) {
				struct.setc_COMPLETE("true");
			} else {
				struct.setc_COMPLETE(null);
			}

			readStatus = NORMAL;

			struct.setSelectUnitCostFlag("true");
			
			if(StringUtil.Validate(struct.getJOB_ODR_CD()) &&
					"true".equals(struct.getc_COMPLETE())){
				// �����Ϗo�Ɏc�������ԍ݌Ɂi�莝�݌Ɂj�̏ꍇ
				// ��S�����������`�F�b�N����Ă��鎞�Ƀ`�F�b�N
				if(!(new IssueRemain(conn)).isEnoughAlcdQty(getsysPLANT_CD(),
						struct.getITEM_CD(), struct.getJOB_ODR_CD(),
						0)){
					setWarningMessage("AE00080");
				}
			}
			
			// �����o�ɂ̋Ɩ��A���[��������Ώo�͂���B
			for(int i=0; i<ia.getWarnList().size(); i++){
				message = (String[])ia.getWarnList().get(i);
				setWarningMessage(message[0], message[1]);
			}
			if (_lotCtrlFlg == true){
	            if(vendlotno_bak != null && !"".equals(vendlotno_bak)){
	                AE0060010Struct setStructForTlot = new AE0060010Struct();
	                setStructForTlot.setsetLOT_NO(vendlotno_bak);               //�݌Ƀ��b�g�ԍ�
	                setStructForTlot.setsetITEM_CD(itemCdBak);        //�i�ڔԍ�
	                setStructForTlot.setsUser_ID(getsysUSER_CD());
	                entity.mupdateT_LOT_CTRL.update(conn, setStructForTlot);    //[���b�g�Ǘ�]�̍X�V
	            }
	            struct.seth_LOT_NUMBERING_TYP(lotNumberingTypBak);
				struct.seth_LOT_CTRL_FLG(lotControlFlgBak);
				struct.seth_FINAL_PROC_CD(finalProcFlgBak);
				struct.setLOT_NO(vendlotno_bak);
				
			}
			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch (Exception e) {
			throw new ExpjException(e);
		} finally {
			struct.setITEM_CD(itemCdBak);
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * ���������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelComplete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");
			//{{user_implement_dev:<controlCancelComplete>
		try {
			// [�����c]�ɑ��݂��Ȃ��Ƃ�
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// �G���[���������ꍇ�͏����𒆒f
			if (msgStruct.hasError()) {
				return;
			}

			// [�����c]���X�V
			entity.mT_RLSD_PUCH_ODRForCancel.update(conn, struct);
			// ���������ɔ����֘A�e�[�u���̍X�V����
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			ia.cancelAcpt(struct.getPUCH_ODR_CD());

			// ��ʍĕ\��
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
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// ��ʂ�������
		initializeAll();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ��������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelOdrCancel() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelOdrCancel");
			//{{user_implement_dev:<controlCancelOdrCancel>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// [�����c]�ɑ��݂��Ȃ��Ƃ�
			List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
			if (lockedList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}
			AE0060010Struct lockedStruct = (AE0060010Struct) lockedList.get(0);
			// [�����c]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
			if (!lockedStruct
				.getPUCH_ODR_MODIFY_COUNT()
				.equals(struct.getPUCH_ODR_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				return;
			}

			// �G���[���������ꍇ�͏����𒆒f
			if (msgStruct.hasError()) {
				return;
			}
			
			// [�����c]���X�V
			entity.mT_RLSD_PUCH_ODR_FOR_CANCEL_ODR_CANCEL.update(conn, struct);

			// ���������ɔ����֘A�e�[�u���̍X�V����
			InspcAcpt ia = new InspcAcpt(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			ia.cancelAcpt(struct.getPUCH_ODR_CD());
			
			// [�������]���폜
			AE0060010Struct aStruct = new AE0060010Struct();
			setStructSystemData(aStruct);
			aStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			aStruct.setACPT_NO("1");
			entity.mT_ACPT_RSLT_FOR_CANCEL_ODR_CANCEL.delete(conn, aStruct);
			
			// [��������]���폜
//			entity.mT_INSPC_RSLT_FOR_CANCEL_ODR_CANCEL.delete(conn, struct);
			
			// ��ʍĕ\��
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
                //}}user_implement_dev:<controlCancelOdrCancel>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelOdrCancel");

		return;
	}

	/**
	 * ���b�g�Ǘ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLotInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");
			//{{user_implement_dev:<controlLotInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlLotInsert>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			// [����]���𕔕i���擾
			_myCompanyStruct = MyCompanyControl.getData(conn);
			// [�Ŗ�]���𕔕i���擾
			_taxNameStruct = TaxNameControl.getData(conn);
			// [�M��]���𕔕i���擾
			_homeCurStruct = HomeCurControl.getData(conn);

			// �R���{�{�b�N�X�f�[�^�擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
			cdac.setConnection(null);

			//�V�X�e�������t���O�擾
			_lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			
			// �p�����[�^[���������t���O]���擾
			PrivateConfig pc = new PrivateConfig(conn);
		    _inspcvalue = pc.getString("INSPC_CMPLT_FLG");

			// ��ʂ�������
			initializeAll();

			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
			if (isScreenMove()) {
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
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AE0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CancelComplete") ) {
				controlCancelComplete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CancelOdrCancel") ) {
				controlCancelOdrCancel();
			} else if( button.equals("LotInsert") ) {
				controlLotInsert();
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

			struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
			struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
			
			if (_lotCtrlFlg == true) {
				struct.seth_LOTCTRL("true");
			} else {
				struct.seth_LOTCTRL("false");
			}
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
//			throw new FoundationException("AE0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0060010Entity entity;
	protected AE0060010Struct struct;
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

		entity = new AE0060010Entity();
		struct = new AE0060010Struct();

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
	 * AE0060010�N���X�̕W���R���X�g���N�^
	 */
	public AE0060010Control() throws BusinessProcessException, FoundationException
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
				AE0060010Struct key = (AE0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_COMPLETE") && key.getc_COMPLETE() != null) {
					msgKey.setKeyValue("c_COMPLETE", key.getc_COMPLETE());
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
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_DN") && key.getACPT_INSPC_TYP_DN() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_DN", key.getACPT_INSPC_TYP_DN());
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
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN") && key.getINSPC_CMPLT_FLG_DN() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG_DN", key.getINSPC_CMPLT_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("c_CANCEL") && key.getc_CANCEL() != null) {
					msgKey.setKeyValue("c_CANCEL", key.getc_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_QTY") && key.geth_ACPT_QTY() != null) {
					msgKey.setKeyValue("h_ACPT_QTY", key.geth_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG") && key.geth_ODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG", key.geth_ODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD_DW") && key.getITEM_CD_DW() != null) {
					msgKey.setKeyValue("ITEM_CD_DW", key.getITEM_CD_DW());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_DW") && key.getITEM_NAME_DW() != null) {
					msgKey.setKeyValue("ITEM_NAME_DW", key.getITEM_NAME_DW());
				}
				if(msgKeyType.containsKeyColumn("h_LOTCTRL") && key.geth_LOTCTRL() != null) {
					msgKey.setKeyValue("h_LOTCTRL", key.geth_LOTCTRL());
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
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD_1") && key.geth_PUCH_ODR_CD_1() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD_1", key.geth_PUCH_ODR_CD_1());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME") && key.getNON_NO_ITEM_NAME() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_NAME", key.getNON_NO_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
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
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT") && key.getACPT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("ACPT_RSLT_COMMENT", key.getACPT_RSLT_COMMENT());
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
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
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
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG") && key.getINSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG", key.getINSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
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
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT") && key.getPUCH_ODR_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_MODIFY_COUNT", key.getPUCH_ODR_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_CAUSE_CD") && key.getODR_CANCEL_CAUSE_CD() != null) {
					msgKey.setKeyValue("ODR_CANCEL_CAUSE_CD", key.getODR_CANCEL_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG") && key.getODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_FLG", key.getODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG") && key.geth_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CTRL_FLG", key.geth_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP") && key.geth_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_NUMBERING_TYP", key.geth_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD") && key.geth_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("h_WORK_ODR_CD", key.geth_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_FINAL_PROC_CD") && key.geth_FINAL_PROC_CD() != null) {
					msgKey.setKeyValue("h_FINAL_PROC_CD", key.geth_FINAL_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("h_DATE_FLG") && key.geth_DATE_FLG() != null) {
					msgKey.setKeyValue("h_DATE_FLG", key.geth_DATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("ACPT_STS_TYP") && key.getACPT_STS_TYP() != null) {
					msgKey.setKeyValue("ACPT_STS_TYP", key.getACPT_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_WH_CD") && key.getINSPC_WH_CD() != null) {
					msgKey.setKeyValue("INSPC_WH_CD", key.getINSPC_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_DATE") && key.getINSPC_CMPLT_DATE() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_DATE", key.getINSPC_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("readISSUE_INST_CD") && key.getreadISSUE_INST_CD() != null) {
					msgKey.setKeyValue("readISSUE_INST_CD", key.getreadISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLANT_CD") && key.getreadPLANT_CD() != null) {
					msgKey.setKeyValue("readPLANT_CD", key.getreadPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readOD_NO") && key.getreadOD_NO() != null) {
					msgKey.setKeyValue("readOD_NO", key.getreadOD_NO());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readPUCH_ODR_CD") && key.getreadPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("readPUCH_ODR_CD", key.getreadPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("readCOMPANY_CD") && key.getreadCOMPANY_CD() != null) {
					msgKey.setKeyValue("readCOMPANY_CD", key.getreadCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("readCONS_TYP") && key.getreadCONS_TYP() != null) {
					msgKey.setKeyValue("readCONS_TYP", key.getreadCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_DENOMINATOR") && key.getreadISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("readISSUE_INST_UNIT_DENOMINATOR", key.getreadISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_NUMERATOR") && key.getreadISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("readISSUE_INST_UNIT_NUMERATOR", key.getreadISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_CD") && key.getreadJOB_ODR_CD() != null) {
					msgKey.setKeyValue("readJOB_ODR_CD", key.getreadJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("readJOB_ODR_DETAIL_NO") && key.getreadJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("readJOB_ODR_DETAIL_NO", key.getreadJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP") && key.getreadMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("readMRP_ODR_TYP", key.getreadMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("readUNIT_QTY_TYP") && key.getreadUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("readUNIT_QTY_TYP", key.getreadUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("readLOT_CONTROL_FLG") && key.getreadLOT_CONTROL_FLG() != null) {
					msgKey.setKeyValue("readLOT_CONTROL_FLG", key.getreadLOT_CONTROL_FLG());
				}
				if(msgKeyType.containsKeyColumn("setPUCH_ODR_CD") && key.getsetPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("setPUCH_ODR_CD", key.getsetPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("setACPT_NO") && key.getsetACPT_NO() != null) {
					msgKey.setKeyValue("setACPT_NO", key.getsetACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("setITEM_CD") && key.getsetITEM_CD() != null) {
					msgKey.setKeyValue("setITEM_CD", key.getsetITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setACPT_QTY") && key.getsetACPT_QTY() != null) {
					msgKey.setKeyValue("setACPT_QTY", key.getsetACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("setCOMPANY_CD") && key.getsetCOMPANY_CD() != null) {
					msgKey.setKeyValue("setCOMPANY_CD", key.getsetCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("setVEND_CD") && key.getsetVEND_CD() != null) {
					msgKey.setKeyValue("setVEND_CD", key.getsetVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("setJOB_ODR_CD") && key.getsetJOB_ODR_CD() != null) {
					msgKey.setKeyValue("setJOB_ODR_CD", key.getsetJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("setJOB_ODR_DETAIL_NO") && key.getsetJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("setJOB_ODR_DETAIL_NO", key.getsetJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("setPLANT_CD") && key.getsetPLANT_CD() != null) {
					msgKey.setKeyValue("setPLANT_CD", key.getsetPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("setISSUE_INST_CD") && key.getsetISSUE_INST_CD() != null) {
					msgKey.setKeyValue("setISSUE_INST_CD", key.getsetISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("setMRP_ODR_TYP") && key.getsetMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("setMRP_ODR_TYP", key.getsetMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_GNR_TYP") && key.getsetSUPPLIED_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("setSUPPLIED_ISSUE_GNR_TYP", key.getsetSUPPLIED_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_QTY") && key.getsetSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("setSUPPLIED_ISSUE_QTY", key.getsetSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setTOTAL_ISSUE_QTY") && key.getsetTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("setTOTAL_ISSUE_QTY", key.getsetTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_DENOMINATOR") && key.getsetSUPPLIED_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("setSUPPLIED_UNIT_DENOMINATOR", key.getsetSUPPLIED_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_NUMERATOR") && key.getsetSUPPLIED_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("setSUPPLIED_UNIT_NUMERATOR", key.getsetSUPPLIED_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("setSUPPLIED_DATE") && key.getsetSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("setSUPPLIED_DATE", key.getsetSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("setPART_SUPPLIED_COMMENT") && key.getsetPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("setPART_SUPPLIED_COMMENT", key.getsetPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("readSTOCK_ON_HAND_QTY") && key.getreadSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("readSTOCK_ON_HAND_QTY", key.getreadSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setWH_CD") && key.getsetWH_CD() != null) {
					msgKey.setKeyValue("setWH_CD", key.getsetWH_CD());
				}
				if(msgKeyType.containsKeyColumn("readWH_CD") && key.getreadWH_CD() != null) {
					msgKey.setKeyValue("readWH_CD", key.getreadWH_CD());
				}
				if(msgKeyType.containsKeyColumn("setSTOCK_ON_HAND_QTY") && key.getsetSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("setSTOCK_ON_HAND_QTY", key.getsetSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CTRL_CD") && key.getsetRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_CTRL_CD", key.getsetRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_TYP") && key.getsetRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_TYP", key.getsetRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("setACPT_RSLT_CRCT_NO") && key.getsetACPT_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("setACPT_RSLT_CRCT_NO", key.getsetACPT_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("setINSPEC_RSLT_CRCT_NO") && key.getsetINSPEC_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("setINSPEC_RSLT_CRCT_NO", key.getsetINSPEC_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("setWORK_ODR_CD") && key.getsetWORK_ODR_CD() != null) {
					msgKey.setKeyValue("setWORK_ODR_CD", key.getsetWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("setWORK_IN_PROC_CD") && key.getsetWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("setWORK_IN_PROC_CD", key.getsetWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("setPARTIAL_PRD_NO") && key.getsetPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("setPARTIAL_PRD_NO", key.getsetPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("setOPR_RSLT_CRCT_NO") && key.getsetOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("setOPR_RSLT_CRCT_NO", key.getsetOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_BEFORE_QTY") && key.getsetRCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_BEFORE_QTY", key.getsetRCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_QTY") && key.getsetRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_QTY", key.getsetRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AFTER_QTY") && key.getsetRCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_AFTER_QTY", key.getsetRCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AMOUNT") && key.getsetRCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_AMOUNT", key.getsetRCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_DATE") && key.getsetRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_DATE", key.getsetRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_GNR_TYP") && key.getsetRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_GNR_TYP", key.getsetRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_ODD_QTY") && key.getsetRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_ODD_QTY", key.getsetRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("setDEFECT_CAUSE_CD") && key.getsetDEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("setDEFECT_CAUSE_CD", key.getsetDEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("setSTOCK_UPD_TYP") && key.getsetSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("setSTOCK_UPD_TYP", key.getsetSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CMPLT_FLG") && key.getsetRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_CMPLT_FLG", key.getsetRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("setOD_NO") && key.getsetOD_NO() != null) {
					msgKey.setKeyValue("setOD_NO", key.getsetOD_NO());
				}
				if(msgKeyType.containsKeyColumn("setLOT_NO") && key.getsetLOT_NO() != null) {
					msgKey.setKeyValue("setLOT_NO", key.getsetLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("setVEND_LOT_NO") && key.getsetVEND_LOT_NO() != null) {
					msgKey.setKeyValue("setVEND_LOT_NO", key.getsetVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("setRCV_ISSUE_COMMENT") && key.getsetRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("setRCV_ISSUE_COMMENT", key.getsetRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("setCONS_TYP") && key.getsetCONS_TYP() != null) {
					msgKey.setKeyValue("setCONS_TYP", key.getsetCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("setCONS_EXEC_DATE") && key.getsetCONS_EXEC_DATE() != null) {
					msgKey.setKeyValue("setCONS_EXEC_DATE", key.getsetCONS_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_QTY") && key.getreadSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("readSUPPLIED_ISSUE_QTY", key.getreadSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("readTOTAL_ISSUE_QTY") && key.getreadTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("readTOTAL_ISSUE_QTY", key.getreadTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_DENOMINATOR") && key.getreadSUPPLIED_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("readSUPPLIED_UNIT_DENOMINATOR", key.getreadSUPPLIED_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_NUMERATOR") && key.getreadSUPPLIED_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("readSUPPLIED_UNIT_NUMERATOR", key.getreadSUPPLIED_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_WH_NAME") && key.getINSPC_WH_NAME() != null) {
					msgKey.setKeyValue("INSPC_WH_NAME", key.getINSPC_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("readLOT_NO") && key.getreadLOT_NO() != null) {
					msgKey.setKeyValue("readLOT_NO", key.getreadLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("readQTY") && key.getreadQTY() != null) {
					msgKey.setKeyValue("readQTY", key.getreadQTY());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("setSEQ_NO") && key.getsetSEQ_NO() != null) {
					msgKey.setKeyValue("setSEQ_NO", key.getsetSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("readSUPPLIED_DATE") && key.getreadSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("readSUPPLIED_DATE", key.getreadSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("setSPENT_QTY") && key.getsetSPENT_QTY() != null) {
					msgKey.setKeyValue("setSPENT_QTY", key.getsetSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
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
					AE0060010Struct key = new AE0060010Struct();
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_COMPLETE")) {
						key.setc_COMPLETE(msgKey.getKeyValue("c_COMPLETE"));
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
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_DN")) {
						key.setACPT_INSPC_TYP_DN(msgKey.getKeyValue("ACPT_INSPC_TYP_DN"));
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
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG_DN")) {
						key.setINSPC_CMPLT_FLG_DN(msgKey.getKeyValue("INSPC_CMPLT_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("c_CANCEL")) {
						key.setc_CANCEL(msgKey.getKeyValue("c_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_QTY")) {
						key.seth_ACPT_QTY(msgKey.getKeyValue("h_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG")) {
						key.seth_ODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD_DW")) {
						key.setITEM_CD_DW(msgKey.getKeyValue("ITEM_CD_DW"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_DW")) {
						key.setITEM_NAME_DW(msgKey.getKeyValue("ITEM_NAME_DW"));
					}
					if(msgKeyType.containsKeyColumn("h_LOTCTRL")) {
						key.seth_LOTCTRL(msgKey.getKeyValue("h_LOTCTRL"));
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
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD_1")) {
						key.seth_PUCH_ODR_CD_1(msgKey.getKeyValue("h_PUCH_ODR_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_NAME")) {
						key.setNON_NO_ITEM_NAME(msgKey.getKeyValue("NON_NO_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
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
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT")) {
						key.setACPT_RSLT_COMMENT(msgKey.getKeyValue("ACPT_RSLT_COMMENT"));
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
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
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
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG")) {
						key.setINSPC_CMPLT_FLG(msgKey.getKeyValue("INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
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
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_MODIFY_COUNT")) {
						key.setPUCH_ODR_MODIFY_COUNT(msgKey.getKeyValue("PUCH_ODR_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_CAUSE_CD")) {
						key.setODR_CANCEL_CAUSE_CD(msgKey.getKeyValue("ODR_CANCEL_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG")) {
						key.seth_LOT_CTRL_FLG(msgKey.getKeyValue("h_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP")) {
						key.seth_LOT_NUMBERING_TYP(msgKey.getKeyValue("h_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_WORK_ODR_CD")) {
						key.seth_WORK_ODR_CD(msgKey.getKeyValue("h_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_FINAL_PROC_CD")) {
						key.seth_FINAL_PROC_CD(msgKey.getKeyValue("h_FINAL_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_DATE_FLG")) {
						key.seth_DATE_FLG(msgKey.getKeyValue("h_DATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_STS_TYP")) {
						key.setACPT_STS_TYP(msgKey.getKeyValue("ACPT_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_WH_CD")) {
						key.setINSPC_WH_CD(msgKey.getKeyValue("INSPC_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_DATE")) {
						key.setINSPC_CMPLT_DATE(msgKey.getKeyValue("INSPC_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("readISSUE_INST_CD")) {
						key.setreadISSUE_INST_CD(msgKey.getKeyValue("readISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLANT_CD")) {
						key.setreadPLANT_CD(msgKey.getKeyValue("readPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readOD_NO")) {
						key.setreadOD_NO(msgKey.getKeyValue("readOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPUCH_ODR_CD")) {
						key.setreadPUCH_ODR_CD(msgKey.getKeyValue("readPUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("readCOMPANY_CD")) {
						key.setreadCOMPANY_CD(msgKey.getKeyValue("readCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("readCONS_TYP")) {
						key.setreadCONS_TYP(msgKey.getKeyValue("readCONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_DENOMINATOR")) {
						key.setreadISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("readISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("readISSUE_INST_UNIT_NUMERATOR")) {
						key.setreadISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("readISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_CD")) {
						key.setreadJOB_ODR_CD(msgKey.getKeyValue("readJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("readJOB_ODR_DETAIL_NO")) {
						key.setreadJOB_ODR_DETAIL_NO(msgKey.getKeyValue("readJOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP")) {
						key.setreadMRP_ODR_TYP(msgKey.getKeyValue("readMRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("readUNIT_QTY_TYP")) {
						key.setreadUNIT_QTY_TYP(msgKey.getKeyValue("readUNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("readLOT_CONTROL_FLG")) {
						key.setreadLOT_CONTROL_FLG(msgKey.getKeyValue("readLOT_CONTROL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("setPUCH_ODR_CD")) {
						key.setsetPUCH_ODR_CD(msgKey.getKeyValue("setPUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("setACPT_NO")) {
						key.setsetACPT_NO(msgKey.getKeyValue("setACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setITEM_CD")) {
						key.setsetITEM_CD(msgKey.getKeyValue("setITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setACPT_QTY")) {
						key.setsetACPT_QTY(msgKey.getKeyValue("setACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setCOMPANY_CD")) {
						key.setsetCOMPANY_CD(msgKey.getKeyValue("setCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("setVEND_CD")) {
						key.setsetVEND_CD(msgKey.getKeyValue("setVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("setJOB_ODR_CD")) {
						key.setsetJOB_ODR_CD(msgKey.getKeyValue("setJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("setJOB_ODR_DETAIL_NO")) {
						key.setsetJOB_ODR_DETAIL_NO(msgKey.getKeyValue("setJOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("setPLANT_CD")) {
						key.setsetPLANT_CD(msgKey.getKeyValue("setPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("setISSUE_INST_CD")) {
						key.setsetISSUE_INST_CD(msgKey.getKeyValue("setISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("setMRP_ODR_TYP")) {
						key.setsetMRP_ODR_TYP(msgKey.getKeyValue("setMRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_GNR_TYP")) {
						key.setsetSUPPLIED_ISSUE_GNR_TYP(msgKey.getKeyValue("setSUPPLIED_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_ISSUE_QTY")) {
						key.setsetSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("setSUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setTOTAL_ISSUE_QTY")) {
						key.setsetTOTAL_ISSUE_QTY(msgKey.getKeyValue("setTOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_DENOMINATOR")) {
						key.setsetSUPPLIED_UNIT_DENOMINATOR(msgKey.getKeyValue("setSUPPLIED_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_UNIT_NUMERATOR")) {
						key.setsetSUPPLIED_UNIT_NUMERATOR(msgKey.getKeyValue("setSUPPLIED_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("setSUPPLIED_DATE")) {
						key.setsetSUPPLIED_DATE(msgKey.getKeyValue("setSUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setPART_SUPPLIED_COMMENT")) {
						key.setsetPART_SUPPLIED_COMMENT(msgKey.getKeyValue("setPART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("readSTOCK_ON_HAND_QTY")) {
						key.setreadSTOCK_ON_HAND_QTY(msgKey.getKeyValue("readSTOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setWH_CD")) {
						key.setsetWH_CD(msgKey.getKeyValue("setWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readWH_CD")) {
						key.setreadWH_CD(msgKey.getKeyValue("readWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("setSTOCK_ON_HAND_QTY")) {
						key.setsetSTOCK_ON_HAND_QTY(msgKey.getKeyValue("setSTOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CTRL_CD")) {
						key.setsetRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("setRCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_TYP")) {
						key.setsetRCV_ISSUE_TYP(msgKey.getKeyValue("setRCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setACPT_RSLT_CRCT_NO")) {
						key.setsetACPT_RSLT_CRCT_NO(msgKey.getKeyValue("setACPT_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setINSPEC_RSLT_CRCT_NO")) {
						key.setsetINSPEC_RSLT_CRCT_NO(msgKey.getKeyValue("setINSPEC_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setWORK_ODR_CD")) {
						key.setsetWORK_ODR_CD(msgKey.getKeyValue("setWORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("setWORK_IN_PROC_CD")) {
						key.setsetWORK_IN_PROC_CD(msgKey.getKeyValue("setWORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("setPARTIAL_PRD_NO")) {
						key.setsetPARTIAL_PRD_NO(msgKey.getKeyValue("setPARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("setOPR_RSLT_CRCT_NO")) {
						key.setsetOPR_RSLT_CRCT_NO(msgKey.getKeyValue("setOPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_BEFORE_QTY")) {
						key.setsetRCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("setRCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_QTY")) {
						key.setsetRCV_ISSUE_QTY(msgKey.getKeyValue("setRCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AFTER_QTY")) {
						key.setsetRCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("setRCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_AMOUNT")) {
						key.setsetRCV_ISSUE_AMOUNT(msgKey.getKeyValue("setRCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_DATE")) {
						key.setsetRCV_ISSUE_DATE(msgKey.getKeyValue("setRCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_GNR_TYP")) {
						key.setsetRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("setRCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_ODD_QTY")) {
						key.setsetRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("setRCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setDEFECT_CAUSE_CD")) {
						key.setsetDEFECT_CAUSE_CD(msgKey.getKeyValue("setDEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("setSTOCK_UPD_TYP")) {
						key.setsetSTOCK_UPD_TYP(msgKey.getKeyValue("setSTOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_CMPLT_FLG")) {
						key.setsetRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("setRCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("setOD_NO")) {
						key.setsetOD_NO(msgKey.getKeyValue("setOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("setLOT_NO")) {
						key.setsetLOT_NO(msgKey.getKeyValue("setLOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setVEND_LOT_NO")) {
						key.setsetVEND_LOT_NO(msgKey.getKeyValue("setVEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("setRCV_ISSUE_COMMENT")) {
						key.setsetRCV_ISSUE_COMMENT(msgKey.getKeyValue("setRCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("setCONS_TYP")) {
						key.setsetCONS_TYP(msgKey.getKeyValue("setCONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setCONS_EXEC_DATE")) {
						key.setsetCONS_EXEC_DATE(msgKey.getKeyValue("setCONS_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_ISSUE_QTY")) {
						key.setreadSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("readSUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readTOTAL_ISSUE_QTY")) {
						key.setreadTOTAL_ISSUE_QTY(msgKey.getKeyValue("readTOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_DENOMINATOR")) {
						key.setreadSUPPLIED_UNIT_DENOMINATOR(msgKey.getKeyValue("readSUPPLIED_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_UNIT_NUMERATOR")) {
						key.setreadSUPPLIED_UNIT_NUMERATOR(msgKey.getKeyValue("readSUPPLIED_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_WH_NAME")) {
						key.setINSPC_WH_NAME(msgKey.getKeyValue("INSPC_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("readLOT_NO")) {
						key.setreadLOT_NO(msgKey.getKeyValue("readLOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readQTY")) {
						key.setreadQTY(msgKey.getKeyValue("readQTY"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setSEQ_NO")) {
						key.setsetSEQ_NO(msgKey.getKeyValue("setSEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("readSUPPLIED_DATE")) {
						key.setreadSUPPLIED_DATE(msgKey.getKeyValue("readSUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setSPENT_QTY")) {
						key.setsetSPENT_QTY(msgKey.getKeyValue("setSPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
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
