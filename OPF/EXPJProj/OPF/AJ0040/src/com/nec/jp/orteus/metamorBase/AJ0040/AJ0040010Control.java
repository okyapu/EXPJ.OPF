/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0040/src/com/nec/jp/orteus/metamorBase/AJ0040/AJ0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0040;

import com.nec.jp.orteus.metamorBase.AJ0040.*;
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

public class AJ0040010Control
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
	public AJ0040010Struct getListvalue(int x) { return (AJ0040010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AJ0040010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AJ0040010Struct createStruct() { return new AJ0040010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AJ0040010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	/** �i���X�e�[�^�X �R���{�{�b�N�X�f�[�^�擾�萔 */
	private static final String PROGRESS_STATUS_PARAMETER_NAME = "PROGRESS_STS_INST";
	
	/** �i���X�e�[�^�X �R���{�{�b�N�X�f�[�^*/
	private ComboStruct PROGRESS_STATUS = null;
	
	/** �Ɩ��^�p�� */
	private String oprDate = null;
	
	/**
	 * ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�)
	 */
	protected String odNo;
	
	/**
	 * ��ʑJ�ڃL�[(��ƌv��ԍ�)
	 */
	protected String workOdrCd;
	
	/**
	 * ��ʑJ�ڃL�[(�d�|��ƃR�[�h)
	 */
	protected String workInProcCd;
	
	/**
	 * �Ɩ��^�p���̎擾
	 */
	public String getOprDate() {
		return this.oprDate;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�)�ݒ�
	 * @param cd �I�[�_�f�}���h�ԍ�
	 */
	public void setOdNo(String cd) {
		odNo = cd;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�I�[�_�f�}���h�ԍ�)�擾
	 * @return �I�[�_�f�}���h�ԍ�
	 */
	public String getOdNo() {
		return odNo;
	}
	
	/**
	 * ��ʑJ�ڃL�[(��ƌv��ԍ�)�ݒ�
	 * @param cd ��ƌv��ԍ�
	 */
	public void setWorkOdrCd(String cd) {
		workOdrCd = cd;
	}
	
	/**
	 * ��ʑJ�ڃL�[(��ƌv��ԍ�)�擾
	 * @return ��ƌv��ԍ�
	 */
	public String getWorkOdrCd() {
		return workOdrCd;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�d�|��ƃR�[�h)�ݒ�
	 * @param cd �d�|��ƃR�[�h
	 */
	public void setWorkInProcCd(String cd) {
		workInProcCd = cd;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�d�|��ƃR�[�h)�擾
	 * @return �d�|��ƃR�[�h
	 */
	public String getWorkInProcCd() {
		return workInProcCd;
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
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
//				controlSelect();
			}
			
			this.struct.clear();
			
			//�w�b�_��񌟍�
			this.struct.setPARAMETER_OD_NO(odNo);
			List tOdList = entity.mT_OD.read(conn, this.struct);
			if (tOdList == null || tOdList.size() == 0) {
				//�w��L�[�̃f�[�^�����݂��܂���B
				ExpjMessage emsg = new ExpjMessage("ZZ01101");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			AJ0040010Struct headerStruct = (AJ0040010Struct)tOdList.get(0);
			this.struct.setStructM(headerStruct);
			
			//�Ɩ��^�p���̃Z�b�g
			List tempList = entity.mSYS_DATE_CTRL.read(conn, this.struct);
			if(tempList == null || tempList.size() == 0){
				//�w��L�[�̃f�[�^�����݂��܂���B
				ExpjMessage emsg = new ExpjMessage("ZZ01101");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			AJ0040010Struct tempStruct = (AJ0040010Struct)tempList.get(0);
			this.oprDate = null;
			this.oprDate = tempStruct.getBUSINESS_OPR_DATE();
			
			//���ԏ��̎擾
			if(headerStruct.getJOB_ODR_CD() != null
					&& !headerStruct.getJOB_ODR_CD().equals("")){
				
				List tJobOdrList = entity.mT_JOB_ODR.read(conn, headerStruct);
				
				if (tJobOdrList == null || tJobOdrList.size() == 0) {
					//�w��L�[�̃f�[�^�����݂��܂���B
					ExpjMessage emsg = new ExpjMessage("ZZ01101");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					return;
				}
				AJ0040010Struct jobOdrStruct = (AJ0040010Struct)tJobOdrList.get(0);
				this.struct.setJOB_ODR_TYP(jobOdrStruct.getJOB_ODR_TYP());
				this.struct.setJOB_ODR_TYP_DN(multcombo("JOB_ODR_TYP",jobOdrStruct.getJOB_ODR_TYP()));
				this.struct.setALC_GRP_CD(jobOdrStruct.getALC_GRP_CD());
				this.struct.setJOB_ODR_QTY(jobOdrStruct.getJOB_ODR_QTY());
				this.struct.setJOB_ODR_DLV_DATE(jobOdrStruct.getJOB_ODR_DLV_DATE());
						
				DateTimeFormat dtf = new DateTimeFormat(conn);
				this.struct.setJOB_ODR_DLV_TIME(dtf.getCoronTimePart(jobOdrStruct.getJOB_ODR_DLV_DATE()));

			} else {
				this.struct.setJOB_ODR_CANCEL_NO("");
			}
			
			//�ꗗ���̌���
			this.struct.setPARAMETER_OD_NO( odNo );
			this.struct.setPARAMETER_WORK_ODR_CD( workOdrCd );
			this.struct.setPARAMETER_WORK_IN_PROC_CD( workInProcCd );
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				this.struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				this.struct.setROW_COUNT(null);
			}
			this.list = entity.mT_RLSD_PUCH_ODRCnt.read(conn, this.struct);
			long rowCount = Long.parseLong(((AJ0040010Struct)this.list.get(0)).getl_COUNT());
			if(rowCount==0){
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = NOT_FOUND;
				if(this.list!=null && this.list.size()>0){
					this.list.clear();
				}
				return;
			}
			//�\�������`�F�b�N
			if (maxLine != 0 && rowCount== maxLine + 1) {
				//�\���������K��l(%0)�𒴂��Ă��܂��B
				if(this.list!=null && this.list.size()>0){
					this.list.clear();
				}
				setReadStatus(TOO_MANY);
				ExpjMessage emsg = new ExpjMessage("ZZ01115", "" + maxLine);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			this.list = entity.mT_RLSD_PUCH_ODR.read(conn, this.struct);
			
			for (int i = 0; i < this.list.size(); i++) {
				AJ0040010Struct tableStruct = (AJ0040010Struct)this.list.get(i);
				tableStruct.setl_ACPT_INSPC_TYP_DN(this.multcombo("ACPT_INSPC_TYP",tableStruct.getACPT_INSPC_TYP()));
				tableStruct.setl_PUCH_ODR_STS_TYP_DN(this.multcombo("PUCH_ODR_STS_TYP",tableStruct.getl_PUCH_ODR_STS_TYP()));	
				//�i���X�e�[�^�X�̐ݒ�
				//"�x��":�Ɩ��^�p���������[���������ȊO�𖞂������R�[�h
				String workPuchOdrDlvDate 
						= tableStruct.getl_PUCH_ODR_DLV_DATE(); //�����[��
				String procPuchOdrStsTyp 
						= tableStruct.getl_PUCH_ODR_STS_TYP();   //������ԋ敪
				
				Date dateWorkPuchOdrDlvDate = null; //�����[��
				Date dateOprDate = null;                       //�Ɩ��^�p��
				try {
					dateWorkPuchOdrDlvDate = Converter.strToDate(
							workPuchOdrDlvDate,Converter.SLASH_DATE); //�����[��
					dateOprDate = Converter.strToDate(
							oprDate,Converter.SLASH_DATE);            //�Ɩ��^�p��
				} catch (ParseException pe) {
					pe.printStackTrace();
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, getsysUSER_CD());
					throw new ExpjException(pe, emsg);
				}
				
				if (procPuchOdrStsTyp != null && !procPuchOdrStsTyp.equals("9")) {
					//�Ɩ��^�p���������[��
					if(dateOprDate.compareTo(dateWorkPuchOdrDlvDate) > 0){
						//�i���X�e�[�^�X��"�x��"
						String displayName = getDisplayName(PROGRESS_STATUS, "1");
						tableStruct.setl_PROGRESS_STATUS_DN(displayName);
					}else{
						tableStruct.setl_PROGRESS_STATUS_DN("");
					}
				} else {
					tableStruct.setl_PROGRESS_STATUS_DN("");
				}
				tableStruct.setl_PUCH_ODR_INST_DATE(tableStruct.getl_PUCH_ODR_INST_DATE());
				tableStruct.setl_PUCH_ODR_EDI_ISS_DATE(tableStruct.getl_PUCH_ODR_EDI_ISS_DATE());
				tableStruct.setl_PUCH_ODR_SLIP_ISS_DATE(tableStruct.getl_PUCH_ODR_SLIP_ISS_DATE());
				tableStruct.setl_PUCH_ODR_START_DATE(tableStruct.getl_PUCH_ODR_START_DATE());
				tableStruct.setl_PUCH_ODR_DLV_DATE(tableStruct.getl_PUCH_ODR_DLV_DATE());
				tableStruct.setl_CONFIRM_DLV_DATE(tableStruct.getl_CONFIRM_DLV_DATE());
				tableStruct.setl_ACPT_CMPLT_DATE(tableStruct.getl_ACPT_CMPLT_DATE());
				tableStruct.setl_INSPC_CMPLT_DATE(tableStruct.getl_INSPC_CMPLT_DATE());
				tableStruct.setJOB_ODR_DLV_DATE(tableStruct.getJOB_ODR_DLV_DATE());
			}
			
			
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
				PROGRESS_STATUS = comboController.getData(PROGRESS_STATUS_PARAMETER_NAME);
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Close") ) {
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
//			throw new FoundationException("AJ0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AJ0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AJ0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AJ0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AJ0040010Entity entity;
	protected AJ0040010Struct struct;
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

		entity = new AJ0040010Entity();
		struct = new AJ0040010Struct();

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
	 * AJ0040010�N���X�̕W���R���X�g���N�^
	 */
	public AJ0040010Control() throws BusinessProcessException, FoundationException
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
				AJ0040010Struct key = (AJ0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP_DN") && key.getl_PUCH_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_STS_TYP_DN", key.getl_PUCH_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP_DN") && key.getl_ACPT_INSPC_TYP_DN() != null) {
					msgKey.setKeyValue("l_ACPT_INSPC_TYP_DN", key.getl_ACPT_INSPC_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN") && key.getl_PROGRESS_STATUS_DN() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS_DN", key.getl_PROGRESS_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_TIME") && key.getJOB_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_TIME", key.getJOB_ODR_DLV_TIME());
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
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PARAMETER_OD_NO") && key.getPARAMETER_OD_NO() != null) {
					msgKey.setKeyValue("PARAMETER_OD_NO", key.getPARAMETER_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP") && key.getl_PUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_STS_TYP", key.getl_PUCH_ODR_STS_TYP());
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
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_DATE") && key.getl_PUCH_ODR_INST_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_INST_DATE", key.getl_PUCH_ODR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE") && key.getl_PUCH_ODR_EDI_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_EDI_ISS_DATE", key.getl_PUCH_ODR_EDI_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE") && key.getl_PUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_SLIP_ISS_DATE", key.getl_PUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE") && key.getl_CONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE", key.getl_CONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ACPT_QTY") && key.getl_TOTAL_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ACPT_QTY", key.getl_TOTAL_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_CMPLT_DATE") && key.getl_ACPT_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_CMPLT_DATE", key.getl_ACPT_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_INSPECTED_QTY") && key.getl_TOTAL_INSPECTED_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_INSPECTED_QTY", key.getl_TOTAL_INSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ACCEPTED_QTY") && key.getl_TOTAL_ACCEPTED_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ACCEPTED_QTY", key.getl_TOTAL_ACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_DEFECTED_QTY") && key.getl_TOTAL_DEFECTED_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_DEFECTED_QTY", key.getl_TOTAL_DEFECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_DATE") && key.getl_INSPC_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_INSPC_CMPLT_DATE", key.getl_INSPC_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE_COMMENT") && key.getl_CONFIRM_DLV_DATE_COMMENT() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE_COMMENT", key.getl_CONFIRM_DLV_DATE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PARAMETER_WORK_ODR_CD") && key.getPARAMETER_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("PARAMETER_WORK_ODR_CD", key.getPARAMETER_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARAMETER_WORK_IN_PROC_CD") && key.getPARAMETER_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("PARAMETER_WORK_IN_PROC_CD", key.getPARAMETER_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
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
					AJ0040010Struct key = new AJ0040010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP_DN")) {
						key.setl_PUCH_ODR_STS_TYP_DN(msgKey.getKeyValue("l_PUCH_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP_DN")) {
						key.setl_ACPT_INSPC_TYP_DN(msgKey.getKeyValue("l_ACPT_INSPC_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN")) {
						key.setl_PROGRESS_STATUS_DN(msgKey.getKeyValue("l_PROGRESS_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_TIME")) {
						key.setJOB_ODR_DLV_TIME(msgKey.getKeyValue("JOB_ODR_DLV_TIME"));
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
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PARAMETER_OD_NO")) {
						key.setPARAMETER_OD_NO(msgKey.getKeyValue("PARAMETER_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP")) {
						key.setl_PUCH_ODR_STS_TYP(msgKey.getKeyValue("l_PUCH_ODR_STS_TYP"));
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
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_DATE")) {
						key.setl_PUCH_ODR_INST_DATE(msgKey.getKeyValue("l_PUCH_ODR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE")) {
						key.setl_PUCH_ODR_EDI_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_EDI_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE")) {
						key.setl_PUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE")) {
						key.setl_CONFIRM_DLV_DATE(msgKey.getKeyValue("l_CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ACPT_QTY")) {
						key.setl_TOTAL_ACPT_QTY(msgKey.getKeyValue("l_TOTAL_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_CMPLT_DATE")) {
						key.setl_ACPT_CMPLT_DATE(msgKey.getKeyValue("l_ACPT_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_INSPECTED_QTY")) {
						key.setl_TOTAL_INSPECTED_QTY(msgKey.getKeyValue("l_TOTAL_INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ACCEPTED_QTY")) {
						key.setl_TOTAL_ACCEPTED_QTY(msgKey.getKeyValue("l_TOTAL_ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_DEFECTED_QTY")) {
						key.setl_TOTAL_DEFECTED_QTY(msgKey.getKeyValue("l_TOTAL_DEFECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_DATE")) {
						key.setl_INSPC_CMPLT_DATE(msgKey.getKeyValue("l_INSPC_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE_COMMENT")) {
						key.setl_CONFIRM_DLV_DATE_COMMENT(msgKey.getKeyValue("l_CONFIRM_DLV_DATE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PARAMETER_WORK_ODR_CD")) {
						key.setPARAMETER_WORK_ODR_CD(msgKey.getKeyValue("PARAMETER_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARAMETER_WORK_IN_PROC_CD")) {
						key.setPARAMETER_WORK_IN_PROC_CD(msgKey.getKeyValue("PARAMETER_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
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
