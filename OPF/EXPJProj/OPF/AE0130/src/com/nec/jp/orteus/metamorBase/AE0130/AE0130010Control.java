/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0130/src/com/nec/jp/orteus/metamorBase/AE0130/AE0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0130;

import com.nec.jp.orteus.metamorBase.AE0130.*;
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

import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;


	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0130010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.12 $ $Date: 2014/12/22 02:44:58 $
 *
 */
//}}user_implement_code_header

public class AE0130010Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// PDF�p�A�N�Z�T���\�b�h
	private String queryFileName = null;
	public String getQueryfileName() { return this.queryFileName; }
	public void setQueryFileName(String queryFileName) { this.queryFileName = queryFileName; }
	private String frmFileName = null;
	public String getFrmfileName() { return this.frmFileName; }
	public void setFrmFileName(String frmFileName) { this.frmFileName = frmFileName; }
	private String pdfFileName = null;
	public String getPdfFileName() { return this.pdfFileName; }
	public void setPdfFileName(String pdfFileName) { this.pdfFileName = pdfFileName; }
	private String dbUID = null;
	private String dbPWD = null;
	private String dbDBQ = null;
	private String dbKIND = null;
	private String pdfFilePath = null;
	public String getPdfFilePath() { return this.pdfFilePath; }
	public void setPdfFilePath(String pdfFilePath) { this.pdfFilePath = pdfFilePath; }

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
	private String lotctrl;
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
	public AE0130010Struct getListvalue(int x) { return (AE0130010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0130010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0130010Struct createStruct() { return new AE0130010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0130010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	/** [���t����]��� */
	private DateCtrlStruct _dateCtrlStruct = new DateCtrlStruct();
	/** CSV�f�[�^���X�g */
	private List _csvList = null;


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
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
      struct.setPLANT_CD(sysPLANT_CD);

      struct.setPUCH_RTN_DATE_FROM(null);
      struct.setPUCH_RTN_DATE_TO(null);

      struct.setJOB_ODR_CD(null);
      
      struct.setVEND_CD(null);
      struct.setITEM_CD(null);
      struct.setPUCH_ODR_PERSON(null);
      struct.setPUCH_ODR_CD(null);
      struct.setWH_CD(null);

      struct.setr1_RTN_DEL_FLG("true");
      struct.setr2_RTN_DEL_FLG("false");
      struct.setr3_RTN_DEL_FLG("false");      

      initializeDetail();
	}
	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {
      struct.setPLANT_NAME(null);
      struct.setVEND_NAME(null);
      struct.setITEM_NAME(null);
      struct.setWH_NAME(null);
      struct.setUSER_NAME(null);
      
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

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
          //���̍��ڂ̃N���A
          initializeDetail();

          // DB���[�H��]."�H�ꖼ"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")) {
            List plantList = entity.mselectM_PLANT.read(conn, struct);
            if (plantList.isEmpty()) {
              setErrorMessage("AE00027");
              setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
            } else {
              // �����ł����ꍇ�́u�H�ꖼ�v��ݒ肷��B
              AE0130010Struct plantStruct = (AE0130010Struct) plantList.get(0);
              struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
            }
          }
          
          // DB���[�����]."����於"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
            List vendList = entity.mselectM_VEND_CTRL.read(conn, struct);
            if (vendList.isEmpty()) {
              setErrorMessage("AE20030");
              setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
            } else {
              // �����ł����ꍇ�́u����於�v��ݒ肷��B
              AE0130010Struct vendStruct = (AE0130010Struct) vendList.get(0);
              struct.setVEND_NAME(vendStruct.getVEND_NAME());
            }
          }
          
          // DB���[�i��]."�i�ږ�"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals("")) {
            List itemList = entity.mselectM_ITEM.read(conn, struct);
            if (itemList.isEmpty()) {
              setErrorMessage("AE00118");
              setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            } else {
            // �����ł����ꍇ�́u����於�v��ݒ肷��B
              AE0130010Struct itemStruct = (AE0130010Struct) itemList.get(0);
              struct.setITEM_NAME(itemStruct.getITEM_NAME());
            }
          }

          // DB���[���[�U�}�X�^]."���[�U��"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getPUCH_ODR_PERSON() != null && !struct.getPUCH_ODR_PERSON().equals("")) {
            List userList = entity.mselectUSER_MST.read(conn, struct);
            if (userList.isEmpty()) {
              setErrorMessage("AE00149");
              setErrorParameter("USER_MST", "PUCH_ODR_PERSON", struct.getPUCH_ODR_PERSON());
            } else {
            // �����ł����ꍇ�́u����於�v��ݒ肷��B
              AE0130010Struct userStruct = (AE0130010Struct) userList.get(0);
              struct.setUSER_NAME(userStruct.getUSER_NAME());
            }
          }
          
          // DB���[�w���ԕi����]���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getPUCH_ODR_CD() != null && !struct.getPUCH_ODR_CD().equals("")) {
            boolean result = entity.mcheckT_PUCH_ODR_RTN_RSLT.check(conn, struct);
            if (result == false) {
              setErrorMessage("AE00150");
              setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
            } 
          }
          
          // DB���[�ۊǋ�]."�ۊǋ於"���������A���݂��Ȃ��ꍇ�̓G���[
          if (struct.getWH_CD() != null && !struct.getWH_CD().equals("")) {
            List whList = entity.mselectM_WH.read(conn, struct);
            if (whList.isEmpty()) {
              setErrorMessage("AE00111");
              setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
            } else {
            // �����ł����ꍇ�́u����ꏊ���v��ݒ肷��B
              AE0130010Struct whStruct = (AE0130010Struct) whList.get(0);
              struct.setWH_NAME(whStruct.getWH_NAME());
              //��ʏ�œ��͂��ꂽ�H��R�[�h�ƕۊǋ�R�[�h����擾�����H��R�[�h�ɐH���Ⴂ������Ƃ��G���[
              if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")) {
                if (struct.getPLANT_CD().equals(whStruct.getPLANT_CD()) == false ) {
                  setErrorMessage("AE00116");
                  setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                }
              }
            }
          }

          //��ʁE�ԕi����敪���璊�o������ݒ肷��
          if (struct.getr1_RTN_DEL_FLG().equals("true")) {
            struct.setRTN_DEL_FLG("0");
          }
          if (struct.getr2_RTN_DEL_FLG().equals("true")) {
            struct.setRTN_DEL_FLG("1");
          }
          if (struct.getr3_RTN_DEL_FLG().equals("true")) {
            struct.setRTN_DEL_FLG(null);
          }
        
          // �G���[������ΏI��
          if (msgStruct.hasError()) {
            return;
          }
          
          //�ő�\���s��
          int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0){
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
				struct.setROW_COUNT(null);
			}

			List viewList = entity.mSelectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0130010Struct) viewList.get(0))
					.getl_COUNT());

          //���o������0���̏ꍇ�̓G���[�Ƃ���
          if (rowCount==0) {
        	
            setErrorMessage("ZZ06001");
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_DATE_FROM", struct.getPUCH_RTN_DATE_FROM());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_DATE_TO", struct.getPUCH_RTN_DATE_TO());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "JOB_ODR_CD", struct.getJOB_ODR_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_PERSON", struct.getPUCH_ODR_PERSON());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "WH_CD", struct.getWH_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "RTN_DEL_FLG", struct.getRTN_DEL_FLG());

            readStatus = NOT_FOUND;
            if(list !=null &&list.size()>0){
            	list.clear();
            }
            return;
          }
            // �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
          
            if ((maxLine != 0) && (rowCount == maxLine+1)) {
              setErrorMessage("ZZ01115", String.valueOf(maxLine));
              readStatus = TOO_MANY;
              if(list !=null &&list.size()>0){
              	list.clear();
              }
              return;
            }
            viewList = entity.mSelect.read(conn, struct);
            _csvList = viewList;
            // ���X�g�f�[�^��ݒ�
            setList(viewList);
	          AE0130010Struct TempStruct;
	          for (int i = 0; i < list.size(); i++) {
			     TempStruct = (AE0130010Struct)list.get(i);
			     TempStruct.setl_RTN_DEL_FLG_DN(multcombo("RTN_DEL_FLG",TempStruct.getl_RTN_DEL_FLG_DN()));
			     TempStruct.setl_INV_CTRL_FLG_DN(multcombo("INV_CTRL_FLG",TempStruct.getl_INV_CTRL_FLG_DN()));
			     TempStruct.setl_UNIT_COST_TYP_DN(multcombo("UNIT_COST_TYP",TempStruct.getl_UNIT_COST_TYP_DN()));
			     TempStruct.setl_TAX_ROUND_TYP_DN(multcombo("TAX_ROUND_TYP",TempStruct.getl_TAX_ROUND_TYP_DN()));
			    }
            readStatus = NORMAL;
            
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

      List csvList = new ArrayList();
      String[] title = {
      	"Expj.PLANT_CD" ,
		"Expj.PUCH_ODR_CD_2" ,
		"Expj.VEND_CD" ,
		"Expj.VEND_NAME" ,
		"Expj.ITEM_CD" ,
		"Expj.ITEM_NAME" ,
		"Expj.STOCK_LOT_CD" ,
		"Expj.JOB_ODR_CD" ,
		"Expj.INV_CTRL_FLG" ,
		"Expj.PUCH_ODR_PERSON_2" ,
		"Expj.ISSUE_DATE_2" ,
		"Expj.ISSUE_QTY_3" ,
		"Expj.WH_CD_11" ,
		"Expj.WH_NAME_6" ,
		"Expj.VEND_LOT_NO" ,
		"Expj.Cmt1112" ,
		"Expj.Cmt1111" ,
		"Expj.PROCESSING_COST" ,
		"Expj.MATERIAL_COST" ,
		"Expj.OTHER_OVERHEADS" ,
		"Expj.PUCH_ODR_AMOUNT_3" ,
		"Expj.SAVING_AMOUNT" ,
		"Expj.NET_AMOUNT" ,
		"Expj.RETURNED_CAUSE_CD" ,
		"Expj.RATE_JUDGE_DATE" ,
		"Expj.EXCH_RATE" ,
		"Expj.TAX_RATE_1" ,
		"Expj.TAX_RATE_2" ,
		"Expj.TAX_RATE_3" ,
		"Expj.TAX_AMOUNT_1" ,
		"Expj.TAX_AMOUNT_2" ,
		"Expj.TAX_AMOUNT_3" ,
		"Expj.AMOUNT_INCLUDE_TAX" ,
		"Expj.HOME_CUR_AMOUNT" ,
		"Expj.TAX_CD_1" ,
		"Expj.TAX_ROUND_TYP" ,
		"Expj.RTN_DEL_FLG" ,
		"Expj.RTN_DEL_DATE" 
      };
      csvList.add(title);
      for (Iterator i = _csvList.iterator(); i.hasNext();) {
        AE0130010Struct csvStruct = (AE0130010Struct) i.next();
        if("false".equals(struct.geth_lotCtrl())){
        	csvStruct.setl_LOT_NO("");
        }
        String[] csvStr = new String[title.length];
        csvStr[0] = csvStruct.getl_PLANT_CD();
        csvStr[1] = csvStruct.getl_PUCH_ODR_CD();
        csvStr[2] = csvStruct.getl_VEND_CD();
        csvStr[3] = csvStruct.getl_VEND_ANAME();
        csvStr[4] = csvStruct.getl_ITEM_CD();
        csvStr[5] = csvStruct.getl_ITEM_NAME();
        csvStr[6] = csvStruct.getl_LOT_NO();
        csvStr[7] = csvStruct.getl_JOB_ODR_CD();
        csvStr[8] = csvStruct.getl_INV_CTRL_FLG_DN();
        csvStr[9] = csvStruct.getl_PUCH_ODR_PERSON();
        csvStr[10] = csvStruct.getl_PUCH_RTN_DATE();
        csvStr[11] = csvStruct.getl_PUCH_RTN_QTY();
        csvStr[12] = csvStruct.getl_WH_CD();
        csvStr[13] = csvStruct.getl_WH_NAME();
        csvStr[14] = csvStruct.getl_VEND_LOT_NO();
        csvStr[15] = csvStruct.getl_UNIT_COST_TYP_DN();
        csvStr[16] = csvStruct.getl_UNIT_COST();
        csvStr[17] = csvStruct.getl_PROCESSING_COST();
        csvStr[18] = csvStruct.getl_MATERIAL_COST();
        csvStr[19] = csvStruct.getl_OTHER_OVERHEADS();
        csvStr[20] = csvStruct.getl_PUCH_ODR_AMOUNT();
        csvStr[21] = csvStruct.getl_DISC_AMOUNT();
        csvStr[22] = csvStruct.getl_NET_AMOUNT();
        csvStr[23] = csvStruct.getl_PUCH_RTN_COMMENT();
        csvStr[24] = csvStruct.getl_RATE_JUDGE_DATE();
        csvStr[25] = csvStruct.getl_EXCH_RATE();
        csvStr[26] = csvStruct.getl_TAX_RATE_1();
        csvStr[27] = csvStruct.getl_TAX_RATE_2();
        csvStr[28] = csvStruct.getl_TAX_RATE_3();
        csvStr[29] = csvStruct.getl_TAX_AMOUNT_1();
        csvStr[30] = csvStruct.getl_TAX_AMOUNT_2();
        csvStr[31] = csvStruct.getl_TAX_AMOUNT_3();
        csvStr[32] = csvStruct.getl_AMOUNT_INCLUDE_TAX();
        csvStr[33] = csvStruct.getl_HOME_CUR_AMOUNT();
        csvStr[34] = csvStruct.getl_TAX_CD();
        csvStr[35] = csvStruct.getl_TAX_ROUND_TYP_DN();
        csvStr[36] = csvStruct.getl_RTN_DEL_FLG_DN();
        csvStr[37] = csvStruct.getl_RTN_DEL_DATE();

        csvList.add(csvStr);
      }
      if (csvList != null && !csvList.isEmpty()) {
        // CsvWriter�𐶐�
        csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
        csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
        struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
      }
      
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

		// ��ʂ�������
		initializeAll();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
*/
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
//				controlSelect();
			}

/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}
*/
		// ��ʂ�������
		initializeAll();
		try {
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_lotCtrl("true");
			    lotctrl = "true";
			}else{
				struct.seth_lotCtrl("false");
				lotctrl = "false";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A

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
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			struct.seth_lotCtrl(lotctrl);
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
//			throw new FoundationException("AE0130010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0130010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0130010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0130010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0130010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0130010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0130010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0130010Entity entity;
	protected AE0130010Struct struct;
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

		entity = new AE0130010Entity();
		struct = new AE0130010Struct();

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
	 * AE0130010�N���X�̕W���R���X�g���N�^
	 */
	public AE0130010Control() throws BusinessProcessException, FoundationException
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
				AE0130010Struct key = (AE0130010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("r1_RTN_DEL_FLG") && key.getr1_RTN_DEL_FLG() != null) {
					msgKey.setKeyValue("r1_RTN_DEL_FLG", key.getr1_RTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("r2_RTN_DEL_FLG") && key.getr2_RTN_DEL_FLG() != null) {
					msgKey.setKeyValue("r2_RTN_DEL_FLG", key.getr2_RTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("r3_RTN_DEL_FLG") && key.getr3_RTN_DEL_FLG() != null) {
					msgKey.setKeyValue("r3_RTN_DEL_FLG", key.getr3_RTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
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
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_DN") && key.getl_INV_CTRL_FLG_DN() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG_DN", key.getl_INV_CTRL_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON") && key.getl_PUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_PERSON", key.getl_PUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_DATE") && key.getl_PUCH_RTN_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_DATE", key.getl_PUCH_RTN_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_QTY") && key.getl_PUCH_RTN_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_QTY", key.getl_PUCH_RTN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_LOT_NO") && key.getl_VEND_LOT_NO() != null) {
					msgKey.setKeyValue("l_VEND_LOT_NO", key.getl_VEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN") && key.getl_UNIT_COST_TYP_DN() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP_DN", key.getl_UNIT_COST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_PROCESSING_COST") && key.getl_PROCESSING_COST() != null) {
					msgKey.setKeyValue("l_PROCESSING_COST", key.getl_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("l_MATERIAL_COST") && key.getl_MATERIAL_COST() != null) {
					msgKey.setKeyValue("l_MATERIAL_COST", key.getl_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("l_OTHER_OVERHEADS") && key.getl_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("l_OTHER_OVERHEADS", key.getl_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT") && key.getl_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_AMOUNT", key.getl_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT") && key.getl_DISC_AMOUNT() != null) {
					msgKey.setKeyValue("l_DISC_AMOUNT", key.getl_DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_NET_AMOUNT") && key.getl_NET_AMOUNT() != null) {
					msgKey.setKeyValue("l_NET_AMOUNT", key.getl_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_COMMENT") && key.getl_PUCH_RTN_COMMENT() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_COMMENT", key.getl_PUCH_RTN_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_RATE_JUDGE_DATE") && key.getl_RATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("l_RATE_JUDGE_DATE", key.getl_RATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_RATE") && key.getl_EXCH_RATE() != null) {
					msgKey.setKeyValue("l_EXCH_RATE", key.getl_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_RATE_1") && key.getl_TAX_RATE_1() != null) {
					msgKey.setKeyValue("l_TAX_RATE_1", key.getl_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_RATE_2") && key.getl_TAX_RATE_2() != null) {
					msgKey.setKeyValue("l_TAX_RATE_2", key.getl_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_RATE_3") && key.getl_TAX_RATE_3() != null) {
					msgKey.setKeyValue("l_TAX_RATE_3", key.getl_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1") && key.getl_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_1", key.getl_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2") && key.getl_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_2", key.getl_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3") && key.getl_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_3", key.getl_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("l_AMOUNT_INCLUDE_TAX") && key.getl_AMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("l_AMOUNT_INCLUDE_TAX", key.getl_AMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_AMOUNT") && key.getl_HOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("l_HOME_CUR_AMOUNT", key.getl_HOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CD") && key.getl_TAX_CD() != null) {
					msgKey.setKeyValue("l_TAX_CD", key.getl_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_ROUND_TYP_DN") && key.getl_TAX_ROUND_TYP_DN() != null) {
					msgKey.setKeyValue("l_TAX_ROUND_TYP_DN", key.getl_TAX_ROUND_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_RTN_DEL_FLG_DN") && key.getl_RTN_DEL_FLG_DN() != null) {
					msgKey.setKeyValue("l_RTN_DEL_FLG_DN", key.getl_RTN_DEL_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_RTN_DEL_DATE") && key.getl_RTN_DEL_DATE() != null) {
					msgKey.setKeyValue("l_RTN_DEL_DATE", key.getl_RTN_DEL_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_FROM") && key.getPUCH_RTN_DATE_FROM() != null) {
					msgKey.setKeyValue("PUCH_RTN_DATE_FROM", key.getPUCH_RTN_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_TO") && key.getPUCH_RTN_DATE_TO() != null) {
					msgKey.setKeyValue("PUCH_RTN_DATE_TO", key.getPUCH_RTN_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("RTN_DEL_FLG") && key.getRTN_DEL_FLG() != null) {
					msgKey.setKeyValue("RTN_DEL_FLG", key.getRTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
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
					AE0130010Struct key = new AE0130010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("r1_RTN_DEL_FLG")) {
						key.setr1_RTN_DEL_FLG(msgKey.getKeyValue("r1_RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r2_RTN_DEL_FLG")) {
						key.setr2_RTN_DEL_FLG(msgKey.getKeyValue("r2_RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r3_RTN_DEL_FLG")) {
						key.setr3_RTN_DEL_FLG(msgKey.getKeyValue("r3_RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
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
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_DN")) {
						key.setl_INV_CTRL_FLG_DN(msgKey.getKeyValue("l_INV_CTRL_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON")) {
						key.setl_PUCH_ODR_PERSON(msgKey.getKeyValue("l_PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_DATE")) {
						key.setl_PUCH_RTN_DATE(msgKey.getKeyValue("l_PUCH_RTN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_QTY")) {
						key.setl_PUCH_RTN_QTY(msgKey.getKeyValue("l_PUCH_RTN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_LOT_NO")) {
						key.setl_VEND_LOT_NO(msgKey.getKeyValue("l_VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN")) {
						key.setl_UNIT_COST_TYP_DN(msgKey.getKeyValue("l_UNIT_COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_PROCESSING_COST")) {
						key.setl_PROCESSING_COST(msgKey.getKeyValue("l_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_MATERIAL_COST")) {
						key.setl_MATERIAL_COST(msgKey.getKeyValue("l_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_OTHER_OVERHEADS")) {
						key.setl_OTHER_OVERHEADS(msgKey.getKeyValue("l_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT")) {
						key.setl_PUCH_ODR_AMOUNT(msgKey.getKeyValue("l_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT")) {
						key.setl_DISC_AMOUNT(msgKey.getKeyValue("l_DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_NET_AMOUNT")) {
						key.setl_NET_AMOUNT(msgKey.getKeyValue("l_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_COMMENT")) {
						key.setl_PUCH_RTN_COMMENT(msgKey.getKeyValue("l_PUCH_RTN_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_RATE_JUDGE_DATE")) {
						key.setl_RATE_JUDGE_DATE(msgKey.getKeyValue("l_RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_RATE")) {
						key.setl_EXCH_RATE(msgKey.getKeyValue("l_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_RATE_1")) {
						key.setl_TAX_RATE_1(msgKey.getKeyValue("l_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_RATE_2")) {
						key.setl_TAX_RATE_2(msgKey.getKeyValue("l_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_RATE_3")) {
						key.setl_TAX_RATE_3(msgKey.getKeyValue("l_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1")) {
						key.setl_TAX_AMOUNT_1(msgKey.getKeyValue("l_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2")) {
						key.setl_TAX_AMOUNT_2(msgKey.getKeyValue("l_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3")) {
						key.setl_TAX_AMOUNT_3(msgKey.getKeyValue("l_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("l_AMOUNT_INCLUDE_TAX")) {
						key.setl_AMOUNT_INCLUDE_TAX(msgKey.getKeyValue("l_AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_AMOUNT")) {
						key.setl_HOME_CUR_AMOUNT(msgKey.getKeyValue("l_HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CD")) {
						key.setl_TAX_CD(msgKey.getKeyValue("l_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_ROUND_TYP_DN")) {
						key.setl_TAX_ROUND_TYP_DN(msgKey.getKeyValue("l_TAX_ROUND_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_RTN_DEL_FLG_DN")) {
						key.setl_RTN_DEL_FLG_DN(msgKey.getKeyValue("l_RTN_DEL_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_RTN_DEL_DATE")) {
						key.setl_RTN_DEL_DATE(msgKey.getKeyValue("l_RTN_DEL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_FROM")) {
						key.setPUCH_RTN_DATE_FROM(msgKey.getKeyValue("PUCH_RTN_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_TO")) {
						key.setPUCH_RTN_DATE_TO(msgKey.getKeyValue("PUCH_RTN_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("RTN_DEL_FLG")) {
						key.setRTN_DEL_FLG(msgKey.getKeyValue("RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
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
