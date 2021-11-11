/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0080/src/com/nec/jp/orteus/metamorBase/AE0080/AE0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0080;

import com.nec.jp.orteus.metamorBase.AE0080.*;
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
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0080010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.4 $ $Date: 2012/10/26 02:23:51 $
 *
 */
//}}user_implement_code_header

public class AE0080010Control
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
	public AE0080010Struct getListvalue(int x) { return (AE0080010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0080010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0080010Struct createStruct() { return new AE0080010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0080010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	/** [�M��]��� */
	private HomeCurStruct _homeCurStruct = new HomeCurStruct();
	
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
	 * EDI�����p��Struct�𐶐����܂��B
	 * @param s �Q�Ƃ���Struct
	 *	 */
	private AE0080010Struct createEDI_PUCH_ODRStruct(AE0080010Struct s)
		throws SQLException, DataNotFoundException {

		// �ʉݏ��̎擾
		CurStruct curStruct = CurControl.getData(conn, s.getCOMPANY_CD(), s.getVEND_CD());
		String rate = s.getEXCH_RATE();

		AE0080010Struct newStruct = new AE0080010Struct();
		newStruct.setINFO_TYP_CD(s.getINFO_TYP_CD());
		newStruct.setCOMPANY_CD(s.getCOMPANY_CD());
		newStruct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());
		newStruct.setDATA_PROC_CD("0");
		newStruct.setDATA_CREATE_DATE(s.getDATA_CREATE_DATE());
		newStruct.setVEND_CD(s.getVEND_CD());
		newStruct.setPLANT_CD(s.getPLANT_CD());
		newStruct.setJOB_ODR_CD(s.getJOB_ODR_CD());
		newStruct.setCRCT_TYP("1");
		newStruct.setCOCK_TYP("1");
		newStruct.setPUCH_ODR_DATE(s.getPUCH_ODR_DATE());
		newStruct.setPUCH_ODR_UNIT(s.getPUCH_ODR_UNIT());
		if (isHOME_CUR(curStruct)) {
			newStruct.setUNIT_COST(s.getUNIT_COST());
		} else {
			newStruct.setUNIT_COST(computeAmount(s.getUNIT_COST(), rate, curStruct.getROUND_TYP(), curStruct.getDECIMAL_FIG()));
		}
		newStruct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());
		newStruct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());
		if (isHOME_CUR(curStruct)) {
			newStruct.setPUCH_ODR_AMOUNT(s.getPUCH_ODR_AMOUNT());
		} else {
			newStruct.setPUCH_ODR_AMOUNT(computeAmount(s.getPUCH_ODR_AMOUNT()
				, rate, curStruct.getROUND_TYP()
				, _homeCurStruct.getDECIMAL_FIG()));
		}
		newStruct.setEDI_CONS_TYP("1");
		newStruct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());
		newStruct.setITEM_SPEC(s.getITEM_SPEC());
		newStruct.setITEM_DRAW_TYP("1");
		newStruct.setITEM_VERSION(null);
		newStruct.setITEM_NAME(null);
		newStruct.setVEND_ITEM_CD(s.getVEND_ITEM_CD());
		newStruct.setITEM_CD(s.getITEM_CD());
		newStruct.setITEM_DRAW_QTY("0");
		newStruct.setITEM_PKG_UNIT(s.getITEM_PKG_UNIT());
		newStruct.setDIRECT_DLV_TYP("1");
		newStruct.setWH_CD(s.getWH_CD());
		newStruct.setACPT_INSPC_TYP(s.getACPT_INSPC_TYP());
		newStruct.setDLV_INST_TYP("1");
		newStruct.setDLV_DATE_1(s.getDLV_DATE_1());
		newStruct.setDLV_INST_QTY_1(s.getDLV_INST_QTY_1());
		newStruct.setDLV_INST_CD_1("1");
		newStruct.setDLV_DATE_2(null);
		newStruct.setDLV_INST_QTY_2("0");
		newStruct.setDLV_INST_CD_2(null);
		newStruct.setDLV_DATE_3(null);
		newStruct.setDLV_INST_QTY_3("0");
		newStruct.setDLV_INST_CD_3(null);
		newStruct.setDLV_DATE_4(null);
		newStruct.setDLV_INST_QTY_4("0");
		newStruct.setDLV_INST_CD_4(null);
		newStruct.setDLV_DATE_5(null);
		newStruct.setDLV_INST_QTY_5("0");
		newStruct.setDLV_INST_CD_5(null);
		newStruct.setFREE_COLUMN(s.getFREE_COLUMN());
		newStruct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());
		newStruct.setINCLUDING_TAX_TYP("1");
		newStruct.setTAX_RELATION_TYP("1");
		if (isHOME_CUR(curStruct)) {
			newStruct.setTAX_AMOUNT(s.getTAX_AMOUNT());
			newStruct.setNET_AMOUNT(s.getNET_AMOUNT());
		} else {
			newStruct.setTAX_AMOUNT(computeAmount(s.getTAX_AMOUNT()
				, rate, curStruct.getROUND_TYP()
				, _homeCurStruct.getDECIMAL_FIG()));
			newStruct.setNET_AMOUNT(computeAmount(s.getNET_AMOUNT()
				, rate, curStruct.getROUND_TYP()
				, _homeCurStruct.getDECIMAL_FIG()));
		}
		newStruct.setRESERVE_CD(null);
		newStruct.setCOST_PLAN_CD(null);
		newStruct.setSTL_COND_TYP("1");
		newStruct.setEND_USER_NAME(null);
		newStruct.setDLV_ADDRESS_CD(null);
		newStruct.setDLV_ADDRESS(null);
		newStruct.setDLV_NAME(null);
		newStruct.setEND_USER_ITEM_NAME(null);
		newStruct.setEND_USER_ITEM_CD(null);
		newStruct.setEND_USER_ODR_CD(null);
		newStruct.setMAKER_NAME(null);
		newStruct.setDLV_KEY_CD_1(null);
		newStruct.setDLV_KEY_CD_2(null);
		newStruct.setDLV_KEY_CD_3(null);
		newStruct.setDLV_KEY_CD_4(null);
		newStruct.setDLV_KEY_CD_5(null);
		newStruct.setWH_NAME(null);
		newStruct.setPUCH_BCODE_INF(null);
		newStruct.setPUCH_COMMENT(null);
		newStruct.setCONTRACT_COND_TYP(null);
		newStruct.setPUCH_ODR_SHAP_TYP(null);
		newStruct.setOWNER_ODR_CD(null);
		newStruct.setQTY_CONTRACT_TYP("1");
		newStruct.setODR_MODIFY_TYP_1(null);
		newStruct.setODR_MODIFY_TYP_2(null);
		newStruct.setODR_MODIFY_TYP_3(null);
		newStruct.setMACHINE_CD(null);
		newStruct.setENGINNERING_CHG_CD(null);
		newStruct.setITEM_DRAW_CD(s.getITEM_DRAW_CD());
		newStruct.setDLV_DOC_FORM_1(null);
		newStruct.setDLV_DOC_COPY_NUM_1("0");
		newStruct.setDLV_DOC_LANG_1("J");
		newStruct.setDLV_DOC_FORM_2(null);
		newStruct.setDLV_DOC_COPY_NUM_2("0");
		newStruct.setDLV_DOC_LANG_2("J");
		newStruct.setDLV_DOC_FORM_3(null);
		newStruct.setDLV_DOC_COPY_NUM_3("0");
		newStruct.setDLV_DOC_LANG_3("J");
		newStruct.setDLV_DOC_FORM_4(null);
		newStruct.setDLV_DOC_COPY_NUM_4("0");
		newStruct.setDLV_DOC_LANG_4("J");
		newStruct.setSTRATEGIC_GOODS_TYP("2");
		newStruct.setORGN_PLACE_CD_1(null);
		newStruct.setORGN_PLACE_CD_2(null);
		newStruct.setORGN_PLACE_CD_3(null);
		newStruct.setORGN_PLACE_CD_4(null);
		newStruct.setORGN_PLACE_CD_5(null);
		newStruct.setDLV_TIME_1(null);
		newStruct.setDLV_TIME_2(null);
		newStruct.setDLV_TIME_3(null);
		newStruct.setDLV_TIME_4(null);
		newStruct.setDLV_TIME_5(null);
		newStruct.setPACKAGE_DLV_CD(null);
		newStruct.setODR_ITEM_SPEC(null);
		newStruct.setODR_ORG_NAME(null);
		newStruct.setDLV_PART_LEN_1("0");
		newStruct.setDLV_PART_QTY_1("0");
		newStruct.setDLV_PART_LEN_2("0");
		newStruct.setDLV_PART_QTY_2("0");
		newStruct.setDLV_PART_LEN_3("0");
		newStruct.setDLV_PART_QTY_3("0");
		newStruct.setDLV_PART_LEN_4("0");
		newStruct.setDLV_PART_QTY_4("0");
		newStruct.setDLV_PART_LEN_5("0");
		newStruct.setDLV_PART_QTY_5("0");
		newStruct.setDLV_PART_UNIT(null);
		newStruct.setCUST_CONSTRUCT_NAME(null);
		newStruct.setMATERIAL_CD(null);
		newStruct.setMATERIAL_UNIT_PRICE(null);
		newStruct.setMATRRIAL_UNIT(null);
		newStruct.setTEST_REPORT_NEED_TYP(null);
		newStruct.setTEST_REPORT_CHK_TYP(null);
		newStruct.setTEST_REPORT_PRESENT_TYP(null);
		newStruct.setMUNICIPAL_CD(null);
		newStruct.setDLV_CONTACT_TEL(s.getDLV_CONTACT_TEL());
		newStruct.setDLV_PRICE_OPEN_TYP("1");
		newStruct.setODR_STAFF_NAME_J(s.getODR_STAFF_NAME_J());
		newStruct.setITEM_SPEC_NAME_J(null);
		newStruct.setITEM_NAME_J(s.getITEM_NAME_J());
		newStruct.setCOMMENT_J(s.getCOMMENT_J());
		newStruct.setEND_USER_NAME_J(null);
		newStruct.setDLV_ADDRESS_J(s.getDLV_ADDRESS_J());
		newStruct.setDLV_NAME_J(null);
		newStruct.setEND_USER_ITEM_NAME_J(null);
		newStruct.setMAKER_NAME_J(null);
		newStruct.setWH_NAME_J(s.getWH_NAME());
		newStruct.setPUCH_ODR_COMMENT_J(null);
		newStruct.setMACHINE_NAME_J(null);
		newStruct.setODR_SPEC_J(null);
		newStruct.setODR_ORG_NAME_J(null);
		newStruct.setCUST_CONSTRUCT_NAME_J(null);
		if (isHOME_CUR(curStruct)) {
			newStruct.setCUR_CD(null);
			newStruct.setUNIT_COST_FOREIGN("0");
			newStruct.setODR_AMOUNT_FOREIGN("0");
			newStruct.setTAX_AMOUNT_FOREIGN("0");
			newStruct.setNET_AMOUNT_FOREIGN("0");
		} else {
			newStruct.setCUR_CD(curStruct.getCUR_UNIT());
			newStruct.setUNIT_COST_FOREIGN(s.getUNIT_COST_FOREIGN());
			newStruct.setODR_AMOUNT_FOREIGN(s.getODR_AMOUNT_FOREIGN());
			newStruct.setTAX_AMOUNT_FOREIGN(s.getTAX_AMOUNT_FOREIGN());
			newStruct.setNET_AMOUNT_FOREIGN(s.getNET_AMOUNT_FOREIGN());
		}
		newStruct.setMATERIAL_UNIT_PRICE_FOREIGN("0");
		newStruct.setBEFORE_ODR_QTY("0");
		newStruct.setBEFORE_UNIT_COST("0");
		newStruct.setBEFORE_UNIT_COST_FOREIGN("0");
		newStruct.setBEFORE_DLV_DATE_1(null);
		newStruct.setBEFORE_DLV_QTY_1("0");
		newStruct.setBEFORE_DLV_DATE_2(null);
		newStruct.setBEFORE_DLV_QTY_2("0");
		newStruct.setBEFORE_DLV_DATE_3(null);
		newStruct.setBEFORE_DLV_QTY_3("0");
		newStruct.setBEFORE_DLV_DATE_4(null);
		newStruct.setBEFORE_DLV_QTY_4("0");
		newStruct.setBEFORE_DLV_DATE_5(null);
		newStruct.setBEFORE_DLV_QTY_5("0");
		newStruct.setODR_RETURN_DATE(null);
		newStruct.setREJECT_RETURN_TYP("1");
		newStruct.setEDI_ODR_ISS_FLG("0");
		newStruct.setEDI_ODR_ISS_DATE(null);
		newStruct.setsOraganization_CD(struct.sOrganization_CD);
		newStruct.setsSysdate(struct.sSysdate);
		newStruct.setsUser_ID(struct.sUser_ID);

		return newStruct;
	}
	/**
	 * [�����c]�X�V�p��Struct�𐶐����܂��B
	 * @param s �Q�Ƃ���Struct
	 * @return ��������Struct
	 */
	private AE0080010Struct createT_RLSD_PUCH_ODRStruct(AE0080010Struct s) throws SQLException, DataNotFoundException {
		
		DateCtrlStruct dcs = DateCtrlControl.getData(conn, s.getPLANT_CD());

		AE0080010Struct newStruct = new AE0080010Struct();
		newStruct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());
		newStruct.setPUCH_ODR_EDI_ISS_FLG("3");
		newStruct.setODR_CANCEL_EDI_ISS_DATE(dcs.getBUSINESS_OPR_DATE());
		newStruct.setsOraganization_CD(struct.sOrganization_CD);
		newStruct.setsSysdate(struct.sSysdate);
		newStruct.setsUser_ID(struct.sUser_ID);
		return newStruct;
	}
	/**
	 * "�ʉ݃R�[�h"���u�M�݁v�ł��邩�𔻒肵�܂��B
	 * [�����]."����ʉ݃R�[�h"��Null�܂���[�M��]."�M�݃R�[�h"�Ɠ�����
	 * �ꍇ��true��Ԃ��܂��B
	 * @param s �ʉݏ��f�[�^�N���X
	 * @return �M�݂ł���ꍇ��true�A�O�݂̏ꍇ��false�B
	 */
	private boolean isHOME_CUR(CurStruct s) {

		String curCd = s.getCUR_CD();
		if (curCd == null || curCd.equals(_homeCurStruct.getCUR_CD())) {
			return true;
		}
		return false;
	}
	/**
	 * �M�݊��Z���z���v�Z���܂��B
	 * @param amount �ۂߑΏۂ̋��z
	 * @param exch �בփ��[�g
	 * @param round �ۂߋ敪
	 * @param decimal ��������
	 * @return �܂�ߕϊ���̋��z
	 */
	private String computeAmount(String amount
		, String exch, String round, String decimal) {
		
		return AmountCalculator.calcHomeCurAmount(
			amount,
			exch,
			round,
			decimal);
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0080");
		logger.entering("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			readStatus = INITIAL;
			
			// �\�����ځA�ꗗ�̃N���A
			struct.setPLANT_NAME(null);
			struct.setVEND_NAME(null);
			struct.setITEM_NAME(null);
			struct.setUSER_NAME(null);
			if (list != null) {
				list.clear();
			}
			
			// �H�ꖼ���������A���݂��Ȃ��ꍇ�̓G���[
			List plantList = entity.mM_PLANT.read(conn, struct);
			if (plantList.isEmpty()) {
				setErrorMessage("AE00027");
				setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
			} else {
				AE0080010Struct plantStruct = (AE0080010Struct) plantList.get(0);
				struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
			}
			
			// �����ԍ����������A���݂��Ȃ��ꍇ�̓G���[
			if (struct.getPUCH_ODR_CD() != null && "".equals(struct.getPUCH_ODR_CD()) == false) {
				List rlsdPuchOdrList = entity.mcheckT_RLSD_PUCH_ODR.read(conn, struct);
				if (rlsdPuchOdrList.isEmpty()) {
					setErrorMessage("AE00090");
					setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				}
			}
			
			// ����於���������A���݂��Ȃ��ꍇ�̓G���[
			if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
				List vandList = entity.mM_VEND_CTRL.read(conn, struct);
				if (vandList.isEmpty()) {
					setErrorMessage("AE20030");
					setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
				} else {
					AE0080010Struct vendStruct = (AE0080010Struct) vandList.get(0);
					struct.setVEND_NAME(vendStruct.getVEND_NAME());
				}
			}
			// �i�ږ����������A���݂��Ȃ��ꍇ�̓G���[
			if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals("")) {
				List itemList = entity.mM_ITEM.read(conn, struct);
				if (itemList.isEmpty()) {
					setErrorMessage("AE50509");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					AE0080010Struct itemStruct = (AE0080010Struct)itemList.get(0);
					struct.setITEM_NAME(itemStruct.getITEM_NAME());
				}
			}
			// �����S���Җ����������A���݂��Ȃ��ꍇ�̓G���[
			if (struct.getPUCH_ODR_PERSON() != null && !struct.getPUCH_ODR_PERSON().equals("")) {
				List userList = entity.mUSER_MST.read(conn, struct);
				if (userList.isEmpty()) {
					setErrorMessage("AE00005");
					setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
				} else {
					AE0080010Struct userStruct = (AE0080010Struct) userList.get(0);
					struct.setUSER_NAME(userStruct.getUSER_NAME());
				}
			}
			
			// �G���[������ΏI��
			if (msgStruct.hasError()) {
				return;
			}
			
			// �`�F�b�N�{�b�N�X�̒l��ݒ�
			if ("true".equals(struct.getReOutputFlg())) {
				struct.setPUCH_ODR_EDI_ISS_FLG("3");
			} else {
				struct.setPUCH_ODR_EDI_ISS_FLG("2");
			}
			

			// �ő�\���s��
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0)
				struct.setROW_COUNT(String.valueOf(maxLine));
			else
				struct.setROW_COUNT(null);

			List viewList = entity.mSelectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0080010Struct) viewList.get(0))
					.getl_COUNT());

			// �Ώی���=0���̏ꍇ�G���[
			if (rowCount == 0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if(list !=null &&list.size()>0){
					list.clear();
				}
				return;
			}

			// �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
			if ((maxLine != 0) && (rowCount == maxLine + 1)) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				readStatus = TOO_MANY;
				if(list !=null &&list.size()>0){
					list.clear();
				}
				return;
			}
			viewList = entity.mSelect.read(conn, struct);
			// ���X�g�f�[�^��ݒ�
			setList(viewList);
			readStatus = NORMAL;
			
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �I��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0080");
		logger.entering("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			
			// �I���̎擾
			List selectedList = struct.getList_l_PUCH_ODR_CD();
			
			for (int i = 0; i < selectedList.size(); i++) {
				// �I�����ꂽ�s�̔����ԍ���ݒ�
				struct.setl_PUCH_ODR_CD((String) selectedList.get(i));
				
				// �I���s�̍Č���
				List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
				// �X�V����L�[�����݂��Ȃ��ꍇ�̓G���[�B
				if (lockedList.isEmpty()) {
					setErrorMessage("ZZ01105");
					return;
				} 
				// �ǂݍ��ݎ���"�X�V��"�ƈقȂ�ꍇ�̓G���[
				AE0080010Struct lockedStruct = (AE0080010Struct) lockedList.get(0);
				if (!lockedStruct.getMODIFY_COUNT().equals(struct.getList_l_MODIFY_COUNT().get(i))) {
					setErrorMessage("ZZ01105");
					return;
				}
				
				// �I�����ꂽ�s�̏ڍׂ�����
				List puchOdrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
				AE0080010Struct puchOdrStruct = (AE0080010Struct) puchOdrList.get(0);
				
				try {
					// [EDI����]�X�V����
					entity.mT_EDI_PUCH_ODR.delete(conn, puchOdrStruct);
					entity.mT_EDI_PUCH_ODR.create(conn, createEDI_PUCH_ODRStruct(puchOdrStruct));
					// [�����c]�X�V����
					entity.mT_RLSD_PUCH_ODR.update(conn,
						createT_RLSD_PUCH_ODRStruct(puchOdrStruct));
				} catch (DataNotFoundException e) {
					setErrorMessage(e.getCode());
					setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
					return;
				}
			}
			
			// �ēǍ����s
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
		logger.exiting("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0080");
		logger.entering("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0080");
		logger.entering("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			readStatus = INITIAL;
			
			if (struct != null) {
				struct.clear();
			}
			if (list != null) {
				list.clear();
			}
			
			struct.setPLANT_CD(sysPLANT_CD);
			struct.setPLANT_NAME(sysPLANT_NAME);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0080");
		logger.entering("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0080");
		logger.entering("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			
		readStatus = INITIAL;
		
		if (struct != null) {
			struct.clear();
		}
		if (list != null) {
			list.clear();
		}
		
		struct.setPLANT_CD(sysPLANT_CD);
		struct.setPLANT_NAME(sysPLANT_NAME);
		
		try {
			// [�M��]���𕔕i���擾			
			_homeCurStruct = HomeCurControl.getData(conn);
		} catch (SQLException e) {
			throw new ExpjException(e);
		} catch (DataNotFoundException e) {
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0080");
		logger.entering("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AE0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Clear") ) {
				controlClear();
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
//			throw new FoundationException("AE0080010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0080010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0080010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0080010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0080010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0080010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0080010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0080010Entity entity;
	protected AE0080010Struct struct;
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

		entity = new AE0080010Entity();
		struct = new AE0080010Struct();

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
	 * AE0080010�N���X�̕W���R���X�g���N�^
	 */
	public AE0080010Control() throws BusinessProcessException, FoundationException
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
				AE0080010Struct key = (AE0080010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ReOutputFlg") && key.getReOutputFlg() != null) {
					msgKey.setKeyValue("ReOutputFlg", key.getReOutputFlg());
				}
				if(msgKeyType.containsKeyColumn("INFO_TYP_CD") && key.getINFO_TYP_CD() != null) {
					msgKey.setKeyValue("INFO_TYP_CD", key.getINFO_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("DATA_PROC_CD") && key.getDATA_PROC_CD() != null) {
					msgKey.setKeyValue("DATA_PROC_CD", key.getDATA_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("DATA_CREATE_DATE") && key.getDATA_CREATE_DATE() != null) {
					msgKey.setKeyValue("DATA_CREATE_DATE", key.getDATA_CREATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("CRCT_TYP") && key.getCRCT_TYP() != null) {
					msgKey.setKeyValue("CRCT_TYP", key.getCRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("COCK_TYP") && key.getCOCK_TYP() != null) {
					msgKey.setKeyValue("COCK_TYP", key.getCOCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DATE") && key.getPUCH_ODR_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DATE", key.getPUCH_ODR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_UNIT") && key.getPUCH_ODR_UNIT() != null) {
					msgKey.setKeyValue("PUCH_ODR_UNIT", key.getPUCH_ODR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EDI_CONS_TYP") && key.getEDI_CONS_TYP() != null) {
					msgKey.setKeyValue("EDI_CONS_TYP", key.getEDI_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPEC") && key.getITEM_SPEC() != null) {
					msgKey.setKeyValue("ITEM_SPEC", key.getITEM_SPEC());
				}
				if(msgKeyType.containsKeyColumn("ITEM_DRAW_TYP") && key.getITEM_DRAW_TYP() != null) {
					msgKey.setKeyValue("ITEM_DRAW_TYP", key.getITEM_DRAW_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_VERSION") && key.getITEM_VERSION() != null) {
					msgKey.setKeyValue("ITEM_VERSION", key.getITEM_VERSION());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ITEM_CD") && key.getVEND_ITEM_CD() != null) {
					msgKey.setKeyValue("VEND_ITEM_CD", key.getVEND_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_DRAW_QTY") && key.getITEM_DRAW_QTY() != null) {
					msgKey.setKeyValue("ITEM_DRAW_QTY", key.getITEM_DRAW_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PKG_UNIT") && key.getITEM_PKG_UNIT() != null) {
					msgKey.setKeyValue("ITEM_PKG_UNIT", key.getITEM_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DIRECT_DLV_TYP") && key.getDIRECT_DLV_TYP() != null) {
					msgKey.setKeyValue("DIRECT_DLV_TYP", key.getDIRECT_DLV_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_TYP") && key.getDLV_INST_TYP() != null) {
					msgKey.setKeyValue("DLV_INST_TYP", key.getDLV_INST_TYP());
				}
				if(msgKeyType.containsKeyColumn("DLV_DATE_1") && key.getDLV_DATE_1() != null) {
					msgKey.setKeyValue("DLV_DATE_1", key.getDLV_DATE_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_QTY_1") && key.getDLV_INST_QTY_1() != null) {
					msgKey.setKeyValue("DLV_INST_QTY_1", key.getDLV_INST_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_CD_1") && key.getDLV_INST_CD_1() != null) {
					msgKey.setKeyValue("DLV_INST_CD_1", key.getDLV_INST_CD_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_DATE_2") && key.getDLV_DATE_2() != null) {
					msgKey.setKeyValue("DLV_DATE_2", key.getDLV_DATE_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_QTY_2") && key.getDLV_INST_QTY_2() != null) {
					msgKey.setKeyValue("DLV_INST_QTY_2", key.getDLV_INST_QTY_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_CD_2") && key.getDLV_INST_CD_2() != null) {
					msgKey.setKeyValue("DLV_INST_CD_2", key.getDLV_INST_CD_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_DATE_3") && key.getDLV_DATE_3() != null) {
					msgKey.setKeyValue("DLV_DATE_3", key.getDLV_DATE_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_QTY_3") && key.getDLV_INST_QTY_3() != null) {
					msgKey.setKeyValue("DLV_INST_QTY_3", key.getDLV_INST_QTY_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_CD_3") && key.getDLV_INST_CD_3() != null) {
					msgKey.setKeyValue("DLV_INST_CD_3", key.getDLV_INST_CD_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_DATE_4") && key.getDLV_DATE_4() != null) {
					msgKey.setKeyValue("DLV_DATE_4", key.getDLV_DATE_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_QTY_4") && key.getDLV_INST_QTY_4() != null) {
					msgKey.setKeyValue("DLV_INST_QTY_4", key.getDLV_INST_QTY_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_CD_4") && key.getDLV_INST_CD_4() != null) {
					msgKey.setKeyValue("DLV_INST_CD_4", key.getDLV_INST_CD_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_DATE_5") && key.getDLV_DATE_5() != null) {
					msgKey.setKeyValue("DLV_DATE_5", key.getDLV_DATE_5());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_QTY_5") && key.getDLV_INST_QTY_5() != null) {
					msgKey.setKeyValue("DLV_INST_QTY_5", key.getDLV_INST_QTY_5());
				}
				if(msgKeyType.containsKeyColumn("DLV_INST_CD_5") && key.getDLV_INST_CD_5() != null) {
					msgKey.setKeyValue("DLV_INST_CD_5", key.getDLV_INST_CD_5());
				}
				if(msgKeyType.containsKeyColumn("FREE_COLUMN") && key.getFREE_COLUMN() != null) {
					msgKey.setKeyValue("FREE_COLUMN", key.getFREE_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("INCLUDING_TAX_TYP") && key.getINCLUDING_TAX_TYP() != null) {
					msgKey.setKeyValue("INCLUDING_TAX_TYP", key.getINCLUDING_TAX_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_RELATION_TYP") && key.getTAX_RELATION_TYP() != null) {
					msgKey.setKeyValue("TAX_RELATION_TYP", key.getTAX_RELATION_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT") && key.getTAX_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_AMOUNT", key.getTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CD") && key.getRESERVE_CD() != null) {
					msgKey.setKeyValue("RESERVE_CD", key.getRESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("COST_PLAN_CD") && key.getCOST_PLAN_CD() != null) {
					msgKey.setKeyValue("COST_PLAN_CD", key.getCOST_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("STL_COND_TYP") && key.getSTL_COND_TYP() != null) {
					msgKey.setKeyValue("STL_COND_TYP", key.getSTL_COND_TYP());
				}
				if(msgKeyType.containsKeyColumn("END_USER_NAME") && key.getEND_USER_NAME() != null) {
					msgKey.setKeyValue("END_USER_NAME", key.getEND_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_ADDRESS_CD") && key.getDLV_ADDRESS_CD() != null) {
					msgKey.setKeyValue("DLV_ADDRESS_CD", key.getDLV_ADDRESS_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_ADDRESS") && key.getDLV_ADDRESS() != null) {
					msgKey.setKeyValue("DLV_ADDRESS", key.getDLV_ADDRESS());
				}
				if(msgKeyType.containsKeyColumn("DLV_NAME") && key.getDLV_NAME() != null) {
					msgKey.setKeyValue("DLV_NAME", key.getDLV_NAME());
				}
				if(msgKeyType.containsKeyColumn("END_USER_ITEM_NAME") && key.getEND_USER_ITEM_NAME() != null) {
					msgKey.setKeyValue("END_USER_ITEM_NAME", key.getEND_USER_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("END_USER_ITEM_CD") && key.getEND_USER_ITEM_CD() != null) {
					msgKey.setKeyValue("END_USER_ITEM_CD", key.getEND_USER_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("END_USER_ODR_CD") && key.getEND_USER_ODR_CD() != null) {
					msgKey.setKeyValue("END_USER_ODR_CD", key.getEND_USER_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MAKER_NAME") && key.getMAKER_NAME() != null) {
					msgKey.setKeyValue("MAKER_NAME", key.getMAKER_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_KEY_CD_1") && key.getDLV_KEY_CD_1() != null) {
					msgKey.setKeyValue("DLV_KEY_CD_1", key.getDLV_KEY_CD_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_KEY_CD_2") && key.getDLV_KEY_CD_2() != null) {
					msgKey.setKeyValue("DLV_KEY_CD_2", key.getDLV_KEY_CD_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_KEY_CD_3") && key.getDLV_KEY_CD_3() != null) {
					msgKey.setKeyValue("DLV_KEY_CD_3", key.getDLV_KEY_CD_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_KEY_CD_4") && key.getDLV_KEY_CD_4() != null) {
					msgKey.setKeyValue("DLV_KEY_CD_4", key.getDLV_KEY_CD_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_KEY_CD_5") && key.getDLV_KEY_CD_5() != null) {
					msgKey.setKeyValue("DLV_KEY_CD_5", key.getDLV_KEY_CD_5());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_BCODE_INF") && key.getPUCH_BCODE_INF() != null) {
					msgKey.setKeyValue("PUCH_BCODE_INF", key.getPUCH_BCODE_INF());
				}
				if(msgKeyType.containsKeyColumn("PUCH_COMMENT") && key.getPUCH_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_COMMENT", key.getPUCH_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("CONTRACT_COND_TYP") && key.getCONTRACT_COND_TYP() != null) {
					msgKey.setKeyValue("CONTRACT_COND_TYP", key.getCONTRACT_COND_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_SHAP_TYP") && key.getPUCH_ODR_SHAP_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_SHAP_TYP", key.getPUCH_ODR_SHAP_TYP());
				}
				if(msgKeyType.containsKeyColumn("OWNER_ODR_CD") && key.getOWNER_ODR_CD() != null) {
					msgKey.setKeyValue("OWNER_ODR_CD", key.getOWNER_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("QTY_CONTRACT_TYP") && key.getQTY_CONTRACT_TYP() != null) {
					msgKey.setKeyValue("QTY_CONTRACT_TYP", key.getQTY_CONTRACT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_MODIFY_TYP_1") && key.getODR_MODIFY_TYP_1() != null) {
					msgKey.setKeyValue("ODR_MODIFY_TYP_1", key.getODR_MODIFY_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("ODR_MODIFY_TYP_2") && key.getODR_MODIFY_TYP_2() != null) {
					msgKey.setKeyValue("ODR_MODIFY_TYP_2", key.getODR_MODIFY_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("ODR_MODIFY_TYP_3") && key.getODR_MODIFY_TYP_3() != null) {
					msgKey.setKeyValue("ODR_MODIFY_TYP_3", key.getODR_MODIFY_TYP_3());
				}
				if(msgKeyType.containsKeyColumn("MACHINE_CD") && key.getMACHINE_CD() != null) {
					msgKey.setKeyValue("MACHINE_CD", key.getMACHINE_CD());
				}
				if(msgKeyType.containsKeyColumn("ENGINNERING_CHG_CD") && key.getENGINNERING_CHG_CD() != null) {
					msgKey.setKeyValue("ENGINNERING_CHG_CD", key.getENGINNERING_CHG_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_DRAW_CD") && key.getITEM_DRAW_CD() != null) {
					msgKey.setKeyValue("ITEM_DRAW_CD", key.getITEM_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_1") && key.getDLV_DOC_FORM_1() != null) {
					msgKey.setKeyValue("DLV_DOC_FORM_1", key.getDLV_DOC_FORM_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_1") && key.getDLV_DOC_COPY_NUM_1() != null) {
					msgKey.setKeyValue("DLV_DOC_COPY_NUM_1", key.getDLV_DOC_COPY_NUM_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_1") && key.getDLV_DOC_LANG_1() != null) {
					msgKey.setKeyValue("DLV_DOC_LANG_1", key.getDLV_DOC_LANG_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_2") && key.getDLV_DOC_FORM_2() != null) {
					msgKey.setKeyValue("DLV_DOC_FORM_2", key.getDLV_DOC_FORM_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_2") && key.getDLV_DOC_COPY_NUM_2() != null) {
					msgKey.setKeyValue("DLV_DOC_COPY_NUM_2", key.getDLV_DOC_COPY_NUM_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_2") && key.getDLV_DOC_LANG_2() != null) {
					msgKey.setKeyValue("DLV_DOC_LANG_2", key.getDLV_DOC_LANG_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_3") && key.getDLV_DOC_FORM_3() != null) {
					msgKey.setKeyValue("DLV_DOC_FORM_3", key.getDLV_DOC_FORM_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_3") && key.getDLV_DOC_COPY_NUM_3() != null) {
					msgKey.setKeyValue("DLV_DOC_COPY_NUM_3", key.getDLV_DOC_COPY_NUM_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_3") && key.getDLV_DOC_LANG_3() != null) {
					msgKey.setKeyValue("DLV_DOC_LANG_3", key.getDLV_DOC_LANG_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_4") && key.getDLV_DOC_FORM_4() != null) {
					msgKey.setKeyValue("DLV_DOC_FORM_4", key.getDLV_DOC_FORM_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_4") && key.getDLV_DOC_COPY_NUM_4() != null) {
					msgKey.setKeyValue("DLV_DOC_COPY_NUM_4", key.getDLV_DOC_COPY_NUM_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_4") && key.getDLV_DOC_LANG_4() != null) {
					msgKey.setKeyValue("DLV_DOC_LANG_4", key.getDLV_DOC_LANG_4());
				}
				if(msgKeyType.containsKeyColumn("STRATEGIC_GOODS_TYP") && key.getSTRATEGIC_GOODS_TYP() != null) {
					msgKey.setKeyValue("STRATEGIC_GOODS_TYP", key.getSTRATEGIC_GOODS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_1") && key.getORGN_PLACE_CD_1() != null) {
					msgKey.setKeyValue("ORGN_PLACE_CD_1", key.getORGN_PLACE_CD_1());
				}
				if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_2") && key.getORGN_PLACE_CD_2() != null) {
					msgKey.setKeyValue("ORGN_PLACE_CD_2", key.getORGN_PLACE_CD_2());
				}
				if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_3") && key.getORGN_PLACE_CD_3() != null) {
					msgKey.setKeyValue("ORGN_PLACE_CD_3", key.getORGN_PLACE_CD_3());
				}
				if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_4") && key.getORGN_PLACE_CD_4() != null) {
					msgKey.setKeyValue("ORGN_PLACE_CD_4", key.getORGN_PLACE_CD_4());
				}
				if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_5") && key.getORGN_PLACE_CD_5() != null) {
					msgKey.setKeyValue("ORGN_PLACE_CD_5", key.getORGN_PLACE_CD_5());
				}
				if(msgKeyType.containsKeyColumn("DLV_TIME_1") && key.getDLV_TIME_1() != null) {
					msgKey.setKeyValue("DLV_TIME_1", key.getDLV_TIME_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_TIME_2") && key.getDLV_TIME_2() != null) {
					msgKey.setKeyValue("DLV_TIME_2", key.getDLV_TIME_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_TIME_3") && key.getDLV_TIME_3() != null) {
					msgKey.setKeyValue("DLV_TIME_3", key.getDLV_TIME_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_TIME_4") && key.getDLV_TIME_4() != null) {
					msgKey.setKeyValue("DLV_TIME_4", key.getDLV_TIME_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_TIME_5") && key.getDLV_TIME_5() != null) {
					msgKey.setKeyValue("DLV_TIME_5", key.getDLV_TIME_5());
				}
				if(msgKeyType.containsKeyColumn("PACKAGE_DLV_CD") && key.getPACKAGE_DLV_CD() != null) {
					msgKey.setKeyValue("PACKAGE_DLV_CD", key.getPACKAGE_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ITEM_SPEC") && key.getODR_ITEM_SPEC() != null) {
					msgKey.setKeyValue("ODR_ITEM_SPEC", key.getODR_ITEM_SPEC());
				}
				if(msgKeyType.containsKeyColumn("ODR_ORG_NAME") && key.getODR_ORG_NAME() != null) {
					msgKey.setKeyValue("ODR_ORG_NAME", key.getODR_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_LEN_1") && key.getDLV_PART_LEN_1() != null) {
					msgKey.setKeyValue("DLV_PART_LEN_1", key.getDLV_PART_LEN_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_QTY_1") && key.getDLV_PART_QTY_1() != null) {
					msgKey.setKeyValue("DLV_PART_QTY_1", key.getDLV_PART_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_LEN_2") && key.getDLV_PART_LEN_2() != null) {
					msgKey.setKeyValue("DLV_PART_LEN_2", key.getDLV_PART_LEN_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_QTY_2") && key.getDLV_PART_QTY_2() != null) {
					msgKey.setKeyValue("DLV_PART_QTY_2", key.getDLV_PART_QTY_2());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_LEN_3") && key.getDLV_PART_LEN_3() != null) {
					msgKey.setKeyValue("DLV_PART_LEN_3", key.getDLV_PART_LEN_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_QTY_3") && key.getDLV_PART_QTY_3() != null) {
					msgKey.setKeyValue("DLV_PART_QTY_3", key.getDLV_PART_QTY_3());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_LEN_4") && key.getDLV_PART_LEN_4() != null) {
					msgKey.setKeyValue("DLV_PART_LEN_4", key.getDLV_PART_LEN_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_QTY_4") && key.getDLV_PART_QTY_4() != null) {
					msgKey.setKeyValue("DLV_PART_QTY_4", key.getDLV_PART_QTY_4());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_LEN_5") && key.getDLV_PART_LEN_5() != null) {
					msgKey.setKeyValue("DLV_PART_LEN_5", key.getDLV_PART_LEN_5());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_QTY_5") && key.getDLV_PART_QTY_5() != null) {
					msgKey.setKeyValue("DLV_PART_QTY_5", key.getDLV_PART_QTY_5());
				}
				if(msgKeyType.containsKeyColumn("DLV_PART_UNIT") && key.getDLV_PART_UNIT() != null) {
					msgKey.setKeyValue("DLV_PART_UNIT", key.getDLV_PART_UNIT());
				}
				if(msgKeyType.containsKeyColumn("CUST_CONSTRUCT_NAME") && key.getCUST_CONSTRUCT_NAME() != null) {
					msgKey.setKeyValue("CUST_CONSTRUCT_NAME", key.getCUST_CONSTRUCT_NAME());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_CD") && key.getMATERIAL_CD() != null) {
					msgKey.setKeyValue("MATERIAL_CD", key.getMATERIAL_CD());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_UNIT_PRICE") && key.getMATERIAL_UNIT_PRICE() != null) {
					msgKey.setKeyValue("MATERIAL_UNIT_PRICE", key.getMATERIAL_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("MATRRIAL_UNIT") && key.getMATRRIAL_UNIT() != null) {
					msgKey.setKeyValue("MATRRIAL_UNIT", key.getMATRRIAL_UNIT());
				}
				if(msgKeyType.containsKeyColumn("TEST_REPORT_NEED_TYP") && key.getTEST_REPORT_NEED_TYP() != null) {
					msgKey.setKeyValue("TEST_REPORT_NEED_TYP", key.getTEST_REPORT_NEED_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEST_REPORT_CHK_TYP") && key.getTEST_REPORT_CHK_TYP() != null) {
					msgKey.setKeyValue("TEST_REPORT_CHK_TYP", key.getTEST_REPORT_CHK_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEST_REPORT_PRESENT_TYP") && key.getTEST_REPORT_PRESENT_TYP() != null) {
					msgKey.setKeyValue("TEST_REPORT_PRESENT_TYP", key.getTEST_REPORT_PRESENT_TYP());
				}
				if(msgKeyType.containsKeyColumn("MUNICIPAL_CD") && key.getMUNICIPAL_CD() != null) {
					msgKey.setKeyValue("MUNICIPAL_CD", key.getMUNICIPAL_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_CONTACT_TEL") && key.getDLV_CONTACT_TEL() != null) {
					msgKey.setKeyValue("DLV_CONTACT_TEL", key.getDLV_CONTACT_TEL());
				}
				if(msgKeyType.containsKeyColumn("DLV_PRICE_OPEN_TYP") && key.getDLV_PRICE_OPEN_TYP() != null) {
					msgKey.setKeyValue("DLV_PRICE_OPEN_TYP", key.getDLV_PRICE_OPEN_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_STAFF_NAME_J") && key.getODR_STAFF_NAME_J() != null) {
					msgKey.setKeyValue("ODR_STAFF_NAME_J", key.getODR_STAFF_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPEC_NAME_J") && key.getITEM_SPEC_NAME_J() != null) {
					msgKey.setKeyValue("ITEM_SPEC_NAME_J", key.getITEM_SPEC_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_J") && key.getITEM_NAME_J() != null) {
					msgKey.setKeyValue("ITEM_NAME_J", key.getITEM_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("COMMENT_J") && key.getCOMMENT_J() != null) {
					msgKey.setKeyValue("COMMENT_J", key.getCOMMENT_J());
				}
				if(msgKeyType.containsKeyColumn("END_USER_NAME_J") && key.getEND_USER_NAME_J() != null) {
					msgKey.setKeyValue("END_USER_NAME_J", key.getEND_USER_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("DLV_ADDRESS_J") && key.getDLV_ADDRESS_J() != null) {
					msgKey.setKeyValue("DLV_ADDRESS_J", key.getDLV_ADDRESS_J());
				}
				if(msgKeyType.containsKeyColumn("DLV_NAME_J") && key.getDLV_NAME_J() != null) {
					msgKey.setKeyValue("DLV_NAME_J", key.getDLV_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("END_USER_ITEM_NAME_J") && key.getEND_USER_ITEM_NAME_J() != null) {
					msgKey.setKeyValue("END_USER_ITEM_NAME_J", key.getEND_USER_ITEM_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("MAKER_NAME_J") && key.getMAKER_NAME_J() != null) {
					msgKey.setKeyValue("MAKER_NAME_J", key.getMAKER_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME_J") && key.getWH_NAME_J() != null) {
					msgKey.setKeyValue("WH_NAME_J", key.getWH_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT_J") && key.getPUCH_ODR_COMMENT_J() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT_J", key.getPUCH_ODR_COMMENT_J());
				}
				if(msgKeyType.containsKeyColumn("MACHINE_NAME_J") && key.getMACHINE_NAME_J() != null) {
					msgKey.setKeyValue("MACHINE_NAME_J", key.getMACHINE_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("ODR_SPEC_J") && key.getODR_SPEC_J() != null) {
					msgKey.setKeyValue("ODR_SPEC_J", key.getODR_SPEC_J());
				}
				if(msgKeyType.containsKeyColumn("ODR_ORG_NAME_J") && key.getODR_ORG_NAME_J() != null) {
					msgKey.setKeyValue("ODR_ORG_NAME_J", key.getODR_ORG_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("CUST_CONSTRUCT_NAME_J") && key.getCUST_CONSTRUCT_NAME_J() != null) {
					msgKey.setKeyValue("CUST_CONSTRUCT_NAME_J", key.getCUST_CONSTRUCT_NAME_J());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_FOREIGN") && key.getUNIT_COST_FOREIGN() != null) {
					msgKey.setKeyValue("UNIT_COST_FOREIGN", key.getUNIT_COST_FOREIGN());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_FOREIGN") && key.getODR_AMOUNT_FOREIGN() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_FOREIGN", key.getODR_AMOUNT_FOREIGN());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_FOREIGN") && key.getTAX_AMOUNT_FOREIGN() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_FOREIGN", key.getTAX_AMOUNT_FOREIGN());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT_FOREIGN") && key.getNET_AMOUNT_FOREIGN() != null) {
					msgKey.setKeyValue("NET_AMOUNT_FOREIGN", key.getNET_AMOUNT_FOREIGN());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_UNIT_PRICE_FOREIGN") && key.getMATERIAL_UNIT_PRICE_FOREIGN() != null) {
					msgKey.setKeyValue("MATERIAL_UNIT_PRICE_FOREIGN", key.getMATERIAL_UNIT_PRICE_FOREIGN());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_ODR_QTY") && key.getBEFORE_ODR_QTY() != null) {
					msgKey.setKeyValue("BEFORE_ODR_QTY", key.getBEFORE_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_UNIT_COST") && key.getBEFORE_UNIT_COST() != null) {
					msgKey.setKeyValue("BEFORE_UNIT_COST", key.getBEFORE_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_UNIT_COST_FOREIGN") && key.getBEFORE_UNIT_COST_FOREIGN() != null) {
					msgKey.setKeyValue("BEFORE_UNIT_COST_FOREIGN", key.getBEFORE_UNIT_COST_FOREIGN());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_1") && key.getBEFORE_DLV_DATE_1() != null) {
					msgKey.setKeyValue("BEFORE_DLV_DATE_1", key.getBEFORE_DLV_DATE_1());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_1") && key.getBEFORE_DLV_QTY_1() != null) {
					msgKey.setKeyValue("BEFORE_DLV_QTY_1", key.getBEFORE_DLV_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_2") && key.getBEFORE_DLV_DATE_2() != null) {
					msgKey.setKeyValue("BEFORE_DLV_DATE_2", key.getBEFORE_DLV_DATE_2());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_2") && key.getBEFORE_DLV_QTY_2() != null) {
					msgKey.setKeyValue("BEFORE_DLV_QTY_2", key.getBEFORE_DLV_QTY_2());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_3") && key.getBEFORE_DLV_DATE_3() != null) {
					msgKey.setKeyValue("BEFORE_DLV_DATE_3", key.getBEFORE_DLV_DATE_3());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_3") && key.getBEFORE_DLV_QTY_3() != null) {
					msgKey.setKeyValue("BEFORE_DLV_QTY_3", key.getBEFORE_DLV_QTY_3());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_4") && key.getBEFORE_DLV_DATE_4() != null) {
					msgKey.setKeyValue("BEFORE_DLV_DATE_4", key.getBEFORE_DLV_DATE_4());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_4") && key.getBEFORE_DLV_QTY_4() != null) {
					msgKey.setKeyValue("BEFORE_DLV_QTY_4", key.getBEFORE_DLV_QTY_4());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_5") && key.getBEFORE_DLV_DATE_5() != null) {
					msgKey.setKeyValue("BEFORE_DLV_DATE_5", key.getBEFORE_DLV_DATE_5());
				}
				if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_5") && key.getBEFORE_DLV_QTY_5() != null) {
					msgKey.setKeyValue("BEFORE_DLV_QTY_5", key.getBEFORE_DLV_QTY_5());
				}
				if(msgKeyType.containsKeyColumn("ODR_RETURN_DATE") && key.getODR_RETURN_DATE() != null) {
					msgKey.setKeyValue("ODR_RETURN_DATE", key.getODR_RETURN_DATE());
				}
				if(msgKeyType.containsKeyColumn("REJECT_RETURN_TYP") && key.getREJECT_RETURN_TYP() != null) {
					msgKey.setKeyValue("REJECT_RETURN_TYP", key.getREJECT_RETURN_TYP());
				}
				if(msgKeyType.containsKeyColumn("EDI_ODR_ISS_FLG") && key.getEDI_ODR_ISS_FLG() != null) {
					msgKey.setKeyValue("EDI_ODR_ISS_FLG", key.getEDI_ODR_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("EDI_ODR_ISS_DATE") && key.getEDI_ODR_ISS_DATE() != null) {
					msgKey.setKeyValue("EDI_ODR_ISS_DATE", key.getEDI_ODR_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE") && key.getl_PUCH_ODR_EDI_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_EDI_ISS_DATE", key.getl_PUCH_ODR_EDI_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE") && key.getl_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("l_BUSINESS_OPR_DATE", key.getl_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_EDI_ISS_FLG") && key.getPUCH_ODR_EDI_ISS_FLG() != null) {
					msgKey.setKeyValue("PUCH_ODR_EDI_ISS_FLG", key.getPUCH_ODR_EDI_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("Not_PUCH_ODR_EDI_ISS_FLG") && key.getNot_PUCH_ODR_EDI_ISS_FLG() != null) {
					msgKey.setKeyValue("Not_PUCH_ODR_EDI_ISS_FLG", key.getNot_PUCH_ODR_EDI_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_EDI_ISS_DATE") && key.getODR_CANCEL_EDI_ISS_DATE() != null) {
					msgKey.setKeyValue("ODR_CANCEL_EDI_ISS_DATE", key.getODR_CANCEL_EDI_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE") && key.getl_PUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_SLIP_ISS_DATE", key.getl_PUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_DATE") && key.getl_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_DATE", key.getl_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_DATE") && key.getl_ODR_CANCEL_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_SLIP_ISS_DATE", key.getl_ODR_CANCEL_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON") && key.getl_PUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_PERSON", key.getl_PUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_CAUSE_CD") && key.getl_ODR_CANCEL_CAUSE_CD() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_CAUSE_CD", key.getl_ODR_CANCEL_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_RSLT_COMMENT") && key.getl_ACPT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("l_ACPT_RSLT_COMMENT", key.getl_ACPT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_FROM") && key.getPUCH_ODR_START_DATE_FROM() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_FROM", key.getPUCH_ODR_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_TO") && key.getPUCH_ODR_START_DATE_TO() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_TO", key.getPUCH_ODR_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_FROM") && key.getPUCH_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_FROM", key.getPUCH_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_TO") && key.getPUCH_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_TO", key.getPUCH_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE_FROM") && key.getACPT_DATE_FROM() != null) {
					msgKey.setKeyValue("ACPT_DATE_FROM", key.getACPT_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE_TO") && key.getACPT_DATE_TO() != null) {
					msgKey.setKeyValue("ACPT_DATE_TO", key.getACPT_DATE_TO());
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
					AE0080010Struct key = new AE0080010Struct();
					if(msgKeyType.containsKeyColumn("ReOutputFlg")) {
						key.setReOutputFlg(msgKey.getKeyValue("ReOutputFlg"));
					}
					if(msgKeyType.containsKeyColumn("INFO_TYP_CD")) {
						key.setINFO_TYP_CD(msgKey.getKeyValue("INFO_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("DATA_PROC_CD")) {
						key.setDATA_PROC_CD(msgKey.getKeyValue("DATA_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DATA_CREATE_DATE")) {
						key.setDATA_CREATE_DATE(msgKey.getKeyValue("DATA_CREATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_TYP")) {
						key.setCRCT_TYP(msgKey.getKeyValue("CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COCK_TYP")) {
						key.setCOCK_TYP(msgKey.getKeyValue("COCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DATE")) {
						key.setPUCH_ODR_DATE(msgKey.getKeyValue("PUCH_ODR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_UNIT")) {
						key.setPUCH_ODR_UNIT(msgKey.getKeyValue("PUCH_ODR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EDI_CONS_TYP")) {
						key.setEDI_CONS_TYP(msgKey.getKeyValue("EDI_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPEC")) {
						key.setITEM_SPEC(msgKey.getKeyValue("ITEM_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_DRAW_TYP")) {
						key.setITEM_DRAW_TYP(msgKey.getKeyValue("ITEM_DRAW_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_VERSION")) {
						key.setITEM_VERSION(msgKey.getKeyValue("ITEM_VERSION"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ITEM_CD")) {
						key.setVEND_ITEM_CD(msgKey.getKeyValue("VEND_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_DRAW_QTY")) {
						key.setITEM_DRAW_QTY(msgKey.getKeyValue("ITEM_DRAW_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PKG_UNIT")) {
						key.setITEM_PKG_UNIT(msgKey.getKeyValue("ITEM_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DIRECT_DLV_TYP")) {
						key.setDIRECT_DLV_TYP(msgKey.getKeyValue("DIRECT_DLV_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_TYP")) {
						key.setDLV_INST_TYP(msgKey.getKeyValue("DLV_INST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DATE_1")) {
						key.setDLV_DATE_1(msgKey.getKeyValue("DLV_DATE_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_QTY_1")) {
						key.setDLV_INST_QTY_1(msgKey.getKeyValue("DLV_INST_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_CD_1")) {
						key.setDLV_INST_CD_1(msgKey.getKeyValue("DLV_INST_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DATE_2")) {
						key.setDLV_DATE_2(msgKey.getKeyValue("DLV_DATE_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_QTY_2")) {
						key.setDLV_INST_QTY_2(msgKey.getKeyValue("DLV_INST_QTY_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_CD_2")) {
						key.setDLV_INST_CD_2(msgKey.getKeyValue("DLV_INST_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DATE_3")) {
						key.setDLV_DATE_3(msgKey.getKeyValue("DLV_DATE_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_QTY_3")) {
						key.setDLV_INST_QTY_3(msgKey.getKeyValue("DLV_INST_QTY_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_CD_3")) {
						key.setDLV_INST_CD_3(msgKey.getKeyValue("DLV_INST_CD_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DATE_4")) {
						key.setDLV_DATE_4(msgKey.getKeyValue("DLV_DATE_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_QTY_4")) {
						key.setDLV_INST_QTY_4(msgKey.getKeyValue("DLV_INST_QTY_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_CD_4")) {
						key.setDLV_INST_CD_4(msgKey.getKeyValue("DLV_INST_CD_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DATE_5")) {
						key.setDLV_DATE_5(msgKey.getKeyValue("DLV_DATE_5"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_QTY_5")) {
						key.setDLV_INST_QTY_5(msgKey.getKeyValue("DLV_INST_QTY_5"));
					}
					if(msgKeyType.containsKeyColumn("DLV_INST_CD_5")) {
						key.setDLV_INST_CD_5(msgKey.getKeyValue("DLV_INST_CD_5"));
					}
					if(msgKeyType.containsKeyColumn("FREE_COLUMN")) {
						key.setFREE_COLUMN(msgKey.getKeyValue("FREE_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("INCLUDING_TAX_TYP")) {
						key.setINCLUDING_TAX_TYP(msgKey.getKeyValue("INCLUDING_TAX_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RELATION_TYP")) {
						key.setTAX_RELATION_TYP(msgKey.getKeyValue("TAX_RELATION_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT")) {
						key.setTAX_AMOUNT(msgKey.getKeyValue("TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CD")) {
						key.setRESERVE_CD(msgKey.getKeyValue("RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("COST_PLAN_CD")) {
						key.setCOST_PLAN_CD(msgKey.getKeyValue("COST_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STL_COND_TYP")) {
						key.setSTL_COND_TYP(msgKey.getKeyValue("STL_COND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("END_USER_NAME")) {
						key.setEND_USER_NAME(msgKey.getKeyValue("END_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_ADDRESS_CD")) {
						key.setDLV_ADDRESS_CD(msgKey.getKeyValue("DLV_ADDRESS_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_ADDRESS")) {
						key.setDLV_ADDRESS(msgKey.getKeyValue("DLV_ADDRESS"));
					}
					if(msgKeyType.containsKeyColumn("DLV_NAME")) {
						key.setDLV_NAME(msgKey.getKeyValue("DLV_NAME"));
					}
					if(msgKeyType.containsKeyColumn("END_USER_ITEM_NAME")) {
						key.setEND_USER_ITEM_NAME(msgKey.getKeyValue("END_USER_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("END_USER_ITEM_CD")) {
						key.setEND_USER_ITEM_CD(msgKey.getKeyValue("END_USER_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("END_USER_ODR_CD")) {
						key.setEND_USER_ODR_CD(msgKey.getKeyValue("END_USER_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAKER_NAME")) {
						key.setMAKER_NAME(msgKey.getKeyValue("MAKER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_KEY_CD_1")) {
						key.setDLV_KEY_CD_1(msgKey.getKeyValue("DLV_KEY_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_KEY_CD_2")) {
						key.setDLV_KEY_CD_2(msgKey.getKeyValue("DLV_KEY_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_KEY_CD_3")) {
						key.setDLV_KEY_CD_3(msgKey.getKeyValue("DLV_KEY_CD_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_KEY_CD_4")) {
						key.setDLV_KEY_CD_4(msgKey.getKeyValue("DLV_KEY_CD_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_KEY_CD_5")) {
						key.setDLV_KEY_CD_5(msgKey.getKeyValue("DLV_KEY_CD_5"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_BCODE_INF")) {
						key.setPUCH_BCODE_INF(msgKey.getKeyValue("PUCH_BCODE_INF"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_COMMENT")) {
						key.setPUCH_COMMENT(msgKey.getKeyValue("PUCH_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("CONTRACT_COND_TYP")) {
						key.setCONTRACT_COND_TYP(msgKey.getKeyValue("CONTRACT_COND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_SHAP_TYP")) {
						key.setPUCH_ODR_SHAP_TYP(msgKey.getKeyValue("PUCH_ODR_SHAP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OWNER_ODR_CD")) {
						key.setOWNER_ODR_CD(msgKey.getKeyValue("OWNER_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("QTY_CONTRACT_TYP")) {
						key.setQTY_CONTRACT_TYP(msgKey.getKeyValue("QTY_CONTRACT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_MODIFY_TYP_1")) {
						key.setODR_MODIFY_TYP_1(msgKey.getKeyValue("ODR_MODIFY_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("ODR_MODIFY_TYP_2")) {
						key.setODR_MODIFY_TYP_2(msgKey.getKeyValue("ODR_MODIFY_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("ODR_MODIFY_TYP_3")) {
						key.setODR_MODIFY_TYP_3(msgKey.getKeyValue("ODR_MODIFY_TYP_3"));
					}
					if(msgKeyType.containsKeyColumn("MACHINE_CD")) {
						key.setMACHINE_CD(msgKey.getKeyValue("MACHINE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ENGINNERING_CHG_CD")) {
						key.setENGINNERING_CHG_CD(msgKey.getKeyValue("ENGINNERING_CHG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_DRAW_CD")) {
						key.setITEM_DRAW_CD(msgKey.getKeyValue("ITEM_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_1")) {
						key.setDLV_DOC_FORM_1(msgKey.getKeyValue("DLV_DOC_FORM_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_1")) {
						key.setDLV_DOC_COPY_NUM_1(msgKey.getKeyValue("DLV_DOC_COPY_NUM_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_1")) {
						key.setDLV_DOC_LANG_1(msgKey.getKeyValue("DLV_DOC_LANG_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_2")) {
						key.setDLV_DOC_FORM_2(msgKey.getKeyValue("DLV_DOC_FORM_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_2")) {
						key.setDLV_DOC_COPY_NUM_2(msgKey.getKeyValue("DLV_DOC_COPY_NUM_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_2")) {
						key.setDLV_DOC_LANG_2(msgKey.getKeyValue("DLV_DOC_LANG_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_3")) {
						key.setDLV_DOC_FORM_3(msgKey.getKeyValue("DLV_DOC_FORM_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_3")) {
						key.setDLV_DOC_COPY_NUM_3(msgKey.getKeyValue("DLV_DOC_COPY_NUM_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_3")) {
						key.setDLV_DOC_LANG_3(msgKey.getKeyValue("DLV_DOC_LANG_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_FORM_4")) {
						key.setDLV_DOC_FORM_4(msgKey.getKeyValue("DLV_DOC_FORM_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_COPY_NUM_4")) {
						key.setDLV_DOC_COPY_NUM_4(msgKey.getKeyValue("DLV_DOC_COPY_NUM_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_DOC_LANG_4")) {
						key.setDLV_DOC_LANG_4(msgKey.getKeyValue("DLV_DOC_LANG_4"));
					}
					if(msgKeyType.containsKeyColumn("STRATEGIC_GOODS_TYP")) {
						key.setSTRATEGIC_GOODS_TYP(msgKey.getKeyValue("STRATEGIC_GOODS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_1")) {
						key.setORGN_PLACE_CD_1(msgKey.getKeyValue("ORGN_PLACE_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_2")) {
						key.setORGN_PLACE_CD_2(msgKey.getKeyValue("ORGN_PLACE_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_3")) {
						key.setORGN_PLACE_CD_3(msgKey.getKeyValue("ORGN_PLACE_CD_3"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_4")) {
						key.setORGN_PLACE_CD_4(msgKey.getKeyValue("ORGN_PLACE_CD_4"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_PLACE_CD_5")) {
						key.setORGN_PLACE_CD_5(msgKey.getKeyValue("ORGN_PLACE_CD_5"));
					}
					if(msgKeyType.containsKeyColumn("DLV_TIME_1")) {
						key.setDLV_TIME_1(msgKey.getKeyValue("DLV_TIME_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_TIME_2")) {
						key.setDLV_TIME_2(msgKey.getKeyValue("DLV_TIME_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_TIME_3")) {
						key.setDLV_TIME_3(msgKey.getKeyValue("DLV_TIME_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_TIME_4")) {
						key.setDLV_TIME_4(msgKey.getKeyValue("DLV_TIME_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_TIME_5")) {
						key.setDLV_TIME_5(msgKey.getKeyValue("DLV_TIME_5"));
					}
					if(msgKeyType.containsKeyColumn("PACKAGE_DLV_CD")) {
						key.setPACKAGE_DLV_CD(msgKey.getKeyValue("PACKAGE_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ITEM_SPEC")) {
						key.setODR_ITEM_SPEC(msgKey.getKeyValue("ODR_ITEM_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ORG_NAME")) {
						key.setODR_ORG_NAME(msgKey.getKeyValue("ODR_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_LEN_1")) {
						key.setDLV_PART_LEN_1(msgKey.getKeyValue("DLV_PART_LEN_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_QTY_1")) {
						key.setDLV_PART_QTY_1(msgKey.getKeyValue("DLV_PART_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_LEN_2")) {
						key.setDLV_PART_LEN_2(msgKey.getKeyValue("DLV_PART_LEN_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_QTY_2")) {
						key.setDLV_PART_QTY_2(msgKey.getKeyValue("DLV_PART_QTY_2"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_LEN_3")) {
						key.setDLV_PART_LEN_3(msgKey.getKeyValue("DLV_PART_LEN_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_QTY_3")) {
						key.setDLV_PART_QTY_3(msgKey.getKeyValue("DLV_PART_QTY_3"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_LEN_4")) {
						key.setDLV_PART_LEN_4(msgKey.getKeyValue("DLV_PART_LEN_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_QTY_4")) {
						key.setDLV_PART_QTY_4(msgKey.getKeyValue("DLV_PART_QTY_4"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_LEN_5")) {
						key.setDLV_PART_LEN_5(msgKey.getKeyValue("DLV_PART_LEN_5"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_QTY_5")) {
						key.setDLV_PART_QTY_5(msgKey.getKeyValue("DLV_PART_QTY_5"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PART_UNIT")) {
						key.setDLV_PART_UNIT(msgKey.getKeyValue("DLV_PART_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CONSTRUCT_NAME")) {
						key.setCUST_CONSTRUCT_NAME(msgKey.getKeyValue("CUST_CONSTRUCT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_CD")) {
						key.setMATERIAL_CD(msgKey.getKeyValue("MATERIAL_CD"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_UNIT_PRICE")) {
						key.setMATERIAL_UNIT_PRICE(msgKey.getKeyValue("MATERIAL_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("MATRRIAL_UNIT")) {
						key.setMATRRIAL_UNIT(msgKey.getKeyValue("MATRRIAL_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("TEST_REPORT_NEED_TYP")) {
						key.setTEST_REPORT_NEED_TYP(msgKey.getKeyValue("TEST_REPORT_NEED_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEST_REPORT_CHK_TYP")) {
						key.setTEST_REPORT_CHK_TYP(msgKey.getKeyValue("TEST_REPORT_CHK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEST_REPORT_PRESENT_TYP")) {
						key.setTEST_REPORT_PRESENT_TYP(msgKey.getKeyValue("TEST_REPORT_PRESENT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MUNICIPAL_CD")) {
						key.setMUNICIPAL_CD(msgKey.getKeyValue("MUNICIPAL_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CONTACT_TEL")) {
						key.setDLV_CONTACT_TEL(msgKey.getKeyValue("DLV_CONTACT_TEL"));
					}
					if(msgKeyType.containsKeyColumn("DLV_PRICE_OPEN_TYP")) {
						key.setDLV_PRICE_OPEN_TYP(msgKey.getKeyValue("DLV_PRICE_OPEN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STAFF_NAME_J")) {
						key.setODR_STAFF_NAME_J(msgKey.getKeyValue("ODR_STAFF_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPEC_NAME_J")) {
						key.setITEM_SPEC_NAME_J(msgKey.getKeyValue("ITEM_SPEC_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_J")) {
						key.setITEM_NAME_J(msgKey.getKeyValue("ITEM_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("COMMENT_J")) {
						key.setCOMMENT_J(msgKey.getKeyValue("COMMENT_J"));
					}
					if(msgKeyType.containsKeyColumn("END_USER_NAME_J")) {
						key.setEND_USER_NAME_J(msgKey.getKeyValue("END_USER_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("DLV_ADDRESS_J")) {
						key.setDLV_ADDRESS_J(msgKey.getKeyValue("DLV_ADDRESS_J"));
					}
					if(msgKeyType.containsKeyColumn("DLV_NAME_J")) {
						key.setDLV_NAME_J(msgKey.getKeyValue("DLV_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("END_USER_ITEM_NAME_J")) {
						key.setEND_USER_ITEM_NAME_J(msgKey.getKeyValue("END_USER_ITEM_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("MAKER_NAME_J")) {
						key.setMAKER_NAME_J(msgKey.getKeyValue("MAKER_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME_J")) {
						key.setWH_NAME_J(msgKey.getKeyValue("WH_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT_J")) {
						key.setPUCH_ODR_COMMENT_J(msgKey.getKeyValue("PUCH_ODR_COMMENT_J"));
					}
					if(msgKeyType.containsKeyColumn("MACHINE_NAME_J")) {
						key.setMACHINE_NAME_J(msgKey.getKeyValue("MACHINE_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("ODR_SPEC_J")) {
						key.setODR_SPEC_J(msgKey.getKeyValue("ODR_SPEC_J"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ORG_NAME_J")) {
						key.setODR_ORG_NAME_J(msgKey.getKeyValue("ODR_ORG_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CONSTRUCT_NAME_J")) {
						key.setCUST_CONSTRUCT_NAME_J(msgKey.getKeyValue("CUST_CONSTRUCT_NAME_J"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_FOREIGN")) {
						key.setUNIT_COST_FOREIGN(msgKey.getKeyValue("UNIT_COST_FOREIGN"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_FOREIGN")) {
						key.setODR_AMOUNT_FOREIGN(msgKey.getKeyValue("ODR_AMOUNT_FOREIGN"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_FOREIGN")) {
						key.setTAX_AMOUNT_FOREIGN(msgKey.getKeyValue("TAX_AMOUNT_FOREIGN"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT_FOREIGN")) {
						key.setNET_AMOUNT_FOREIGN(msgKey.getKeyValue("NET_AMOUNT_FOREIGN"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_UNIT_PRICE_FOREIGN")) {
						key.setMATERIAL_UNIT_PRICE_FOREIGN(msgKey.getKeyValue("MATERIAL_UNIT_PRICE_FOREIGN"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_ODR_QTY")) {
						key.setBEFORE_ODR_QTY(msgKey.getKeyValue("BEFORE_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_UNIT_COST")) {
						key.setBEFORE_UNIT_COST(msgKey.getKeyValue("BEFORE_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_UNIT_COST_FOREIGN")) {
						key.setBEFORE_UNIT_COST_FOREIGN(msgKey.getKeyValue("BEFORE_UNIT_COST_FOREIGN"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_1")) {
						key.setBEFORE_DLV_DATE_1(msgKey.getKeyValue("BEFORE_DLV_DATE_1"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_1")) {
						key.setBEFORE_DLV_QTY_1(msgKey.getKeyValue("BEFORE_DLV_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_2")) {
						key.setBEFORE_DLV_DATE_2(msgKey.getKeyValue("BEFORE_DLV_DATE_2"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_2")) {
						key.setBEFORE_DLV_QTY_2(msgKey.getKeyValue("BEFORE_DLV_QTY_2"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_3")) {
						key.setBEFORE_DLV_DATE_3(msgKey.getKeyValue("BEFORE_DLV_DATE_3"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_3")) {
						key.setBEFORE_DLV_QTY_3(msgKey.getKeyValue("BEFORE_DLV_QTY_3"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_4")) {
						key.setBEFORE_DLV_DATE_4(msgKey.getKeyValue("BEFORE_DLV_DATE_4"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_4")) {
						key.setBEFORE_DLV_QTY_4(msgKey.getKeyValue("BEFORE_DLV_QTY_4"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_DATE_5")) {
						key.setBEFORE_DLV_DATE_5(msgKey.getKeyValue("BEFORE_DLV_DATE_5"));
					}
					if(msgKeyType.containsKeyColumn("BEFORE_DLV_QTY_5")) {
						key.setBEFORE_DLV_QTY_5(msgKey.getKeyValue("BEFORE_DLV_QTY_5"));
					}
					if(msgKeyType.containsKeyColumn("ODR_RETURN_DATE")) {
						key.setODR_RETURN_DATE(msgKey.getKeyValue("ODR_RETURN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("REJECT_RETURN_TYP")) {
						key.setREJECT_RETURN_TYP(msgKey.getKeyValue("REJECT_RETURN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EDI_ODR_ISS_FLG")) {
						key.setEDI_ODR_ISS_FLG(msgKey.getKeyValue("EDI_ODR_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("EDI_ODR_ISS_DATE")) {
						key.setEDI_ODR_ISS_DATE(msgKey.getKeyValue("EDI_ODR_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE")) {
						key.setl_PUCH_ODR_EDI_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_EDI_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE")) {
						key.setl_BUSINESS_OPR_DATE(msgKey.getKeyValue("l_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_EDI_ISS_FLG")) {
						key.setPUCH_ODR_EDI_ISS_FLG(msgKey.getKeyValue("PUCH_ODR_EDI_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Not_PUCH_ODR_EDI_ISS_FLG")) {
						key.setNot_PUCH_ODR_EDI_ISS_FLG(msgKey.getKeyValue("Not_PUCH_ODR_EDI_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_EDI_ISS_DATE")) {
						key.setODR_CANCEL_EDI_ISS_DATE(msgKey.getKeyValue("ODR_CANCEL_EDI_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE")) {
						key.setl_PUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_DATE")) {
						key.setl_ACPT_DATE(msgKey.getKeyValue("l_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_DATE")) {
						key.setl_ODR_CANCEL_SLIP_ISS_DATE(msgKey.getKeyValue("l_ODR_CANCEL_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON")) {
						key.setl_PUCH_ODR_PERSON(msgKey.getKeyValue("l_PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_CAUSE_CD")) {
						key.setl_ODR_CANCEL_CAUSE_CD(msgKey.getKeyValue("l_ODR_CANCEL_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_RSLT_COMMENT")) {
						key.setl_ACPT_RSLT_COMMENT(msgKey.getKeyValue("l_ACPT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_FROM")) {
						key.setPUCH_ODR_START_DATE_FROM(msgKey.getKeyValue("PUCH_ODR_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_TO")) {
						key.setPUCH_ODR_START_DATE_TO(msgKey.getKeyValue("PUCH_ODR_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_FROM")) {
						key.setPUCH_ODR_DLV_DATE_FROM(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_TO")) {
						key.setPUCH_ODR_DLV_DATE_TO(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE_FROM")) {
						key.setACPT_DATE_FROM(msgKey.getKeyValue("ACPT_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE_TO")) {
						key.setACPT_DATE_TO(msgKey.getKeyValue("ACPT_DATE_TO"));
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
