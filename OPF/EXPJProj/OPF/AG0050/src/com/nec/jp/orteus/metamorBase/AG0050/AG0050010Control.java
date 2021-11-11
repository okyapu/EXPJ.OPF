/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0050/src/com/nec/jp/orteus/metamorBase/AG0050/AG0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0050;

import com.nec.jp.orteus.metamorBase.AG0050.*;
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
import com.nec.jp.orteus.expj.util.Calculate;
import java.util.Comparator;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : UC2040010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.22 $ $Date: 2015/11/24 03:20:45 $
 *
 *[�C������]
 * 2006/09/14 �󒍃f�}���h�ŁA[�󒍖���]."�o�ג����敪"���u2�F��������v�̏ꍇ�A
 *            �o�׏����k�s���O�Ƃ���iEntity�j
 * 2006/10/31 �󒍏���\������ꍇ�A�o�ɒP�ʊ��Z�l�̌v�Z���s���悤�ɏC��
 *            �󒍖��ׁD�o�ג����敪���u�����v�̏ꍇ�A���t�v�Z���̉^���������O
 *            �ɏC���iEntity�j
 * 2006/11/14 �m��I�[�_�̎擾������[�����c]."��������`�[���s�t���O"=0�F�ΏۊO
 *            ��ǉ��iEntity�j
 * 2009/03/04 J��Ja�̋@�\�𓝍�����           
 * 2015/08/12 EJaSCM�^EJa�@�\�����Ή�
 */
//}}user_implement_code_header

public class AG0050010Control
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
//20150813 ADD START BY SYSCOM
	/** �󒍃f�}���h�쐬��e�[�u�� */
	private String tempDM_CREATE_BASE_TBL = null;
//2050813 ADD START BY SYSCOM
		
	/** �^�p���敪�FExplanner/J */
	private final static int EXPLANNER_J = 1;
	
	/** �^�p���敪�FExplanner/Ja */
	private final static int EXPLANNER_JA = 2;

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�I�[�_��ԋ敪 */
	private final static String ODR_STATUS_PARAMETER_NAME= "MP_ODR_STATUS"; 
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�I�[�_��ԋ敪 */
	private final static String ODR_STS_TYP_PARAMETER_NAME= "ODR_STS_TYP"; 
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@���v�ʔ��������敪 */
	private final static String ODR_GNR_TYP_PARAMETER_NAME= "OD_GNR_TYP"; 
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�������������敪 */
	private final static String PUCH_ODR_GNR_TYP_PARAMETER_NAME= "PUCH_ODR_GNR_TYP"; 
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�I�[�_��ԋ敪 */
	private ComboStruct COM_ODR_STATUS = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�I�[�_��ԋ敪 */
	private ComboStruct COM_ODR_STS_TYP = null;

	/** �R���{�{�b�N�X�f�[�^�擾�p�@���������敪 */
	private ComboStruct COM_ODR_GNR_TYP = null;

	/** �R���{�{�b�N�X�f�[�^�擾�p�@�������������敪 */
	private ComboStruct COM_PUCH_ODR_GNR_TYP = null;

	// �^�s��
	private int Environment = 0;
	
	private int getEnvironment() {
		return Environment;
	}
	private void setEnvironment(int environment) {
		Environment = environment;
	}
	
	/** �V�X�e���g�p�̉�ЃR�[�h */
	protected String SysMyCompany;
	public void setsysMY_COMPANY(String name) { this.SysMyCompany = name; };
	public String getsysMY_COMPANY() { return this.SysMyCompany; };
	
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
	public AG0050010Struct getListvalue(int x) { return (AG0050010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AG0050010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AG0050010Struct createStruct() { return new AG0050010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AG0050010Struct)structname); }	// Struct���Z�b�g���܂��B
//	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** CSV�f�[�^���X�g */
	private List _csvList = null;

	/**
	 * NULL��"0"�ϊ� 
	 * @return ���b�Z�[�W
	 */
	public String NullToZero(String value)
	{
		if((value == null || value.length() == 0 || value.equalsIgnoreCase("null"))){
			value = "0";
		}
		return value;
	}

//-------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;


//---------- ���b�Z�[�W�֘A�̏���-- --------------------------------------------

	/**
	 * ���b�Z�[�W�擾 
	 * @return ���b�Z�[�W
	 */
	public MessageStruct getMessage()
	{
		return msgStruct;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W
	 */
	public void setMessage(MessageStruct msg)
	{
		msgStruct = msg;
	}


//---------- �L�[���̑ޔ����� ---------------------------------------------------

	/** �L�[���ێ��ׂ̈�Struct */
	private AG0050010Struct _keyStruct = new AG0050010Struct();

	/** �L�[���Struct�̎擾 */
	public AG0050010Struct getKeyStruct(){ return _keyStruct; }
	
	/** �L�[���Struct�̐ݒ� */
	public void setKeyStruct(AG0050010Struct struct){ _keyStruct.copy(struct); }


//---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------

	/** �i�ڎ�z�敪 */
	ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** ��ʑJ�ڃp�����[�^�i�H��R�[�h�j */
	private String plantCd = null;
	
	/** ��ʑJ�ڃp�����[�^�i�i�ڔԍ��j */
	private String itemCd = null;
	
	/** ��ʑJ�ڃp�����[�^�i�H��R�[�h�j���擾���܂��B */
	public String getPlantCd() {
		return plantCd;
	}
	
	/** ��ʑJ�ڃp�����[�^�i�H��R�[�h�j��ݒ肵�܂��B */
	public void setPlantCd(String s) {
		plantCd = s;
	}
	
	/** ��ʑJ�ڃp�����[�^�i�i�ڔԍ��j���擾���܂��B */
	public String getItemCd() {
		return itemCd;
	}
	
	/** ��ʑJ�ڃp�����[�^�i�i�ڔԍ��j��ݒ肵�܂��B */
	public void setItemCd(String s) {
		itemCd = s;
	}

//------------------------------------------------------------------------

	/** ���[�U��`�̏������σt���O */
	private boolean _usersIntialized = false;

	/**
	 * ���[�U��` ����������
	 */
	private void usersInitialize() throws ExpjException
	{
		if(_usersIntialized) return;

		_usersIntialized = true;
		return ;
	}

//------------------------------------------------------------------------
	/**
	 * SQLException�G���[���b�Z�[�W�ݒ�
	 * @param SQLException
	 * @param �o�̓G���[���b�Z�[�W
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
	}

		
	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setErrorMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addError( emsg );
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
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 * @param �u��������P
	 */
	private void setErrorMessage(String messageno, String message, String value1)
	{
		ExpjMessage emsg = new ExpjMessage( messageno , value1 );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * ���O���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}
//20150813 ADD START BY SYSCOM
	/**
	 * �����ݒ�ł̃G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 */
	private void setFatalMessage(String messageno) throws ExpjException {
		ExpjMessage emsg = new ExpjMessage(messageno);
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
		ExpjException ee = new ExpjException(emsg);
		throw ee;
	}
//20150813 ADD END BY SYSCOM
	/**
	 * Explanner/J���ł̓Ǎ�����
	 *
	 */
	private void selectInExplannerJ(List workList, List listMessage){

		try{
			AG0050010Struct readStruct = new AG0050010Struct();
			// �o��LT�擾
			readStruct.setw_CLASS_CODE("SHIP_LT");
			List codeList = entity.mgetSYS_CLASS_CODE.read(conn,readStruct);
			if (codeList.size() <= 0){
				// �o�׏���L/T�̎擾�Ɏ��s���܂����B
				listMessage.add("SYS_CLASS_CODE.SYS_CLASS:SALES");
				listMessage.add("SYS_CLASS_CODE.CLASS_CODE:" + readStruct.getw_CLASS_CODE());
				setErrorMessage("AG00501", listMessage);
				struct.copy(getKeyStruct());
				return;
			}
			AG0050010Struct setCodeStruct = (AG0050010Struct)codeList.get(0);
			struct.setw_SHIP_LT(setCodeStruct.getw_SHIP_LT());
	
			setReadStatus(INITIAL);
			List tempList = null;
	
			//�ڍ׃f�[�^���擾
			struct.setw_MRP_FLG(null);
			struct.setw_CHECK_FLG(null);
			struct.setw_UNCONFIRM_FLG(null);
			struct.setw_ENV_FLG("1");
			if("true".equals(struct.getcheckMrpFlg())){
				struct.setw_MRP_FLG(null);
			} else {
				struct.setw_MRP_FLG("1");
			}
			if("true".equals(struct.getcheckProdPlan())){
				struct.setw_CHECK_FLG("1");
			} else {
				struct.setw_CHECK_FLG("0");
			}
			if("true".equals(struct.getcheckUncnfm())){
				struct.setw_UNCONFIRM_FLG("1");
			} else {
				struct.setw_UNCONFIRM_FLG("0");
			}
			if("true".equals(struct.getcheckQty())){
				struct.setw_QTY_FLG("1");
			} else {
				struct.setw_QTY_FLG("0");
			}

			// �ő�\���s��
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0){
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
				struct.setROW_COUNT(null);
			}
			List tempList1 = entity.mgetDETAL_DATACnt.read(conn, struct);
			long rowCount1 = Long.parseLong(((AG0050010Struct) tempList1.get(0)).getl_COUNT());
			
			List tempList2 = entity.mgetDETAL_DATA_JCnt.read(conn, struct);
			long rowCount2 = Long.parseLong(((AG0050010Struct) tempList2.get(0)).getl_COUNT());

			// ��������0���̏ꍇ
			if (rowCount1 ==0 && rowCount2 == 0) { // �Y���f�[�^�Ȃ�
				listMessage.add("ITEM_CD:" + struct.getw_ITEM_CD());
				listMessage.add("PLANT_CD:" + struct.getw_PLANT_CD());
				setErrorMessage("ZZ06001", listMessage);
				setReadStatus(NOT_FOUND);
				struct.copy(getKeyStruct());
				if(tempList!=null && tempList.size()>0){
					tempList.clear();
				}
				return;
			}else{
				// �\���ő�s����������
				if (maxLine != 0 && ((rowCount1 == maxLine + 1)||(rowCount2 == maxLine + 1))||(rowCount1+rowCount2 >= maxLine + 1)) {
					// �Ǎ��X�e�[�^�X�ݒ�
					setErrorMessage("ZZ01115", "", String.valueOf(maxLine));
					readStatus = TOO_MANY;
					listMessage.clear();
					// �\���p���X�g�ɃZ�b�g
					if(tempList!=null && tempList.size()>0){
						tempList.clear();
					}
					return;
				}else{
					tempList1 = entity.mgetDETAIL_DATA.read(conn, struct);
					tempList2 = entity.mgetDETAIL_DATA_J.read(conn, struct);
					tempList1.addAll(tempList2);
					
					tempList = tempList1;

					// �Ǎ��X�e�[�^�X�ݒ�
					setReadStatus(NORMAL);
					
					String effectStockQty = "0";
					String scdlRcvTotalFix = "0";
					String scdlRcvTotalNoFix = "0";
					String scdlIssueTotalFix = "0";
					String scdlIssueTotalNoFix = "0";
					
					AG0050010Struct tempStruct = null;
					String insideOdrQty = "0";// �����󒍐�
					String demandQty = "0";// �f�}���h��
					
					for(int k = 0; k < tempList.size(); k++ ) {
						tempStruct = (AG0050010Struct)tempList.get(k);
						if ("6".equals(tempStruct.getSORT_NO()) 
								|| "7".equals(tempStruct.getSORT_NO())) {
							try{
								String userCd = getsysUSER_CD();
								String businessCd = "AG0050010";
								String m_wh_plantCd = tempStruct.getM_WH_PLANT_CD();
								String itemCd = struct.getw_ITEM_CD();
								Date iDate = null;
								int margin = 0;
								boolean moveFlg = true;
					      
								// �w��[��
								if(null != tempStruct.getDESINATED_DLV_DATE() && !"".equals(tempStruct.getDESINATED_DLV_DATE())){
									iDate = new Date(tempStruct.getDESINATED_DLV_DATE());
								} 
								// �^������
								String TRANSPORT_LT = tempStruct.getTRANSPORT_LT();
								int iTRANSPORT_LT = 0;
								if(null != tempStruct.getTRANSPORT_LT() && !"".equals(tempStruct.getTRANSPORT_LT())){
									iTRANSPORT_LT = Integer.parseInt(TRANSPORT_LT);
								}
								// �o�׏����k�s
								String SHIP_LT = struct.getw_SHIP_LT();
								int iSHIP_LT = 0;
								if(null != struct.getw_SHIP_LT() && !"".equals(struct.getw_SHIP_LT())){
									iSHIP_LT = Integer.parseInt(SHIP_LT);
								}
								// ���Z��
								margin = -(iTRANSPORT_LT + iSHIP_LT);
								// �ғ����v�Z���s���N���X
								WorkDay workDay = new WorkDay(userCd,businessCd,m_wh_plantCd,iDate,margin,moveFlg);
								// �Ώۓ��t����Z�o�����ғ������t��ԋp����B
								Date DELIVERY_DATE = workDay.calcDate();
								if(null == DELIVERY_DATE){
									tempStruct.setDELIVERY_DATE(null);
								}else{
									SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
									String strDELIVERY_DATE = df.format(DELIVERY_DATE);
									tempStruct.setDELIVERY_DATE(strDELIVERY_DATE);
								}
							}catch(FoundationException fe){
								fe.printStackTrace();
							}
						}
						
						if(null == tempStruct.getDELIVERY_DATE()){
							tempStruct.setDELIVERY_DATE("");
						}
						
					}
			
					Collections.sort(tempList,new Sort());
											
					for(int i = 0; i < tempList.size(); i++ ) {
						tempStruct = (AG0050010Struct)tempList.get(i);
						
						// �󒍏�񂩂�A�l���擾���Ă���ꍇ�́A�o�גP�ʊ��Z�l�̌v�Z���s��
						insideOdrQty = "0";
						demandQty = "0";
						if ("6".equals(tempStruct.getSORT_NO()) || "7".equals(tempStruct.getSORT_NO())) {
							// �Q�l�P�ʊ��Z�l��null�܂���0�ȊO�̏ꍇ�A�v�Z���s��
							// �v�Z���F�󒍖��ׁD�������ʁ~�w���P�ʊ��Z�l
							if (tempStruct.getw_PKG_UNIT_QTY() != null && !"".equals(tempStruct.getw_PKG_UNIT_QTY()) && !"0".equals(tempStruct.getw_PKG_UNIT_QTY())) {
								// �����󒍐��̌v�Z
								if (tempStruct.getINSIDE_ODR_QTY() != null && !"".equals(tempStruct.getINSIDE_ODR_QTY()) && !"0".equals(tempStruct.getINSIDE_ODR_QTY())) {
									//1�F�����Ǘ� �̏ꍇ������P�ʐ؂�グ
									//2�F�����Ǘ� �̏ꍇ������T�ʐ؂�グ
									if ("1".equals(tempStruct.getw_UNIT_QTY_TYP())) {
										insideOdrQty = Calculate.ceil(tempStruct.getINSIDE_ODR_QTY(),0);
									} else {
										insideOdrQty = Calculate.ceil(tempStruct.getINSIDE_ODR_QTY(),4);
									}
									tempStruct.setINSIDE_ODR_QTY(insideOdrQty);
								} else {
									tempStruct.setINSIDE_ODR_QTY("0");
								}
								// �f�}���h���̌v�Z
								if (tempStruct.getDEMAND_QTY() != null && !"".equals(tempStruct.getDEMAND_QTY()) && !"0".equals(tempStruct.getDEMAND_QTY())) {
									//1�F�����Ǘ� �̏ꍇ������P�ʐ؂�グ
									//2�F�����Ǘ� �̏ꍇ������T�ʐ؂�グ
									if ("1".equals(tempStruct.getw_UNIT_QTY_TYP())) {
										demandQty = Calculate.ceil(Calculate.multiply(tempStruct.getDEMAND_QTY(),"1"),0);
									} else {
										demandQty = Calculate.ceil(Calculate.multiply(tempStruct.getDEMAND_QTY(),"1"),4);
									}
									tempStruct.setDEMAND_QTY(demandQty);
								} else {
									tempStruct.setDEMAND_QTY("0");
								}
								
							} else {
								tempStruct.setINSIDE_ODR_QTY("0");
								tempStruct.setDEMAND_QTY("0");
							}
						}
						
			
						// (2)	�m��f�}���h�Őe�I�[�_�ԍ��A�e�I�[�_�i�ڔԍ��A�e�I�[�_�i�ږ��̐ݒ�
						if ("4".equals(tempStruct.getSORT_NO())) {
							// �i�ڕʎd�|.��ƌv��ԍ�
							String WORK_ODR_CD = tempStruct.getWORK_ODR_CD();
							// �����c.�����ԍ�
							String PARENT_ORDER_NO = tempStruct.getPARENT_ORDER_NO();
							AG0050010Struct itemInfoStruct = new AG0050010Struct();
							List itemList = new ArrayList(0);
							// �i�ڕʎd�|.��ƌv��ԍ����擾�ł���
							if(null != WORK_ODR_CD){
								tempStruct.setPARENT_ORDER_NO(WORK_ODR_CD);
								itemInfoStruct.setODR_CD(WORK_ODR_CD);
			          itemList = entity.mgetT_WORK_ITEM_INFO.read(conn, itemInfoStruct);
			          if(itemList.size() > 0){
			            itemInfoStruct = (AG0050010Struct)itemList.get(0);
				          // �e�I�[�_�i�ڔԍ�
				          tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
				          // �e�I�[�_�i�ږ�
				          tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
			          }
							}else{
								itemInfoStruct.setODR_CD(PARENT_ORDER_NO);
			          itemList = entity.mgetT_RLSD_ITEM_INFO.read(conn, itemInfoStruct);
			          if(itemList.size() > 0){
			            itemInfoStruct = (AG0050010Struct)itemList.get(0);
				          // �e�I�[�_�i�ڔԍ�
				          tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
				          // �e�I�[�_�i�ږ�
				          tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
			          }
							}
						}
					 if ("5".equals(tempStruct.getSORT_NO())) {
							AG0050010Struct odInfoStruct = new AG0050010Struct();
							List odList = new ArrayList(0);
							if(null != tempStruct.getPARENT_ORDER_NO()){
								odInfoStruct.setODR_CD(tempStruct.getPARENT_ORDER_NO());
								odList = entity.mgetT_OD_INFO.read(conn, odInfoStruct);
								if(odList.size() > 0){
									odInfoStruct = (AG0050010Struct)odList.get(0);
									// �e�I�[�_�i�ڔԍ�
									tempStruct.setPARENT_ORDER_ITEM_NO(odInfoStruct.getPARENT_ORDER_ITEM_NO());
									// �e�I�[�_�i�ږ�
									tempStruct.setPARENT_ORDER_ITEM_NAME(odInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}
						}
						if ("1".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else 	if ("2".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							// �X�e�[�^�X���u�T�F����v�A�u�U�F������s�ρv�A�u�V�F��������v�A�u�W�F���������v�̏ꍇ�A���Z���ꂢ�ĂȂ�
							if(!"5".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"6".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"7".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"8".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())) {
								//�L���݌ɐ��쐬
								effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
								//�m��I�[�_(���ɗ\�荇�v(�m��))�쐬
								scdlRcvTotalFix = Calculate.add(scdlRcvTotalFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else if ("3".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�v��I�[�_(���ɗ\�荇�v(���m��))�쐬
							scdlRcvTotalNoFix = Calculate.add(scdlRcvTotalNoFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
						} else if ("4".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("5".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�v��f�}���h(�o�ɗ\�荇�v(���m��))�쐬
							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("6".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINSIDE_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�v��f�}���h(�o�ɗ\�荇�v(���m��))�쐬
							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getINSIDE_ODR_QTY());
						} else if ("7".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						}
						
						// �R���{�{�b�N�X�f�[�^������Ή�
						/** �R���{�{�b�N�X�f�[�^�擾�p�@�I�[�_��ԋ敪 */
						tempStruct.setSTATUS(getDisplayName(COM_ODR_STATUS, tempStruct.getNUMBER_STATUS()));
						if("2".equals(tempStruct.getSORT_NO())) {
							if("1".equals(tempStruct.getGNR())){
						      tempStruct.setSTATUS(getDisplayName(COM_ODR_STS_TYP, tempStruct.getNUMBER_STATUS()));
							}
					    }

						/** �R���{�{�b�N�X�f�[�^�擾�p�@�������������敪 */
						if(null != tempStruct.getGNR() && "2".equals(tempStruct.getGNR())){
					      tempStruct.setGNR_TYP(getDisplayName(COM_PUCH_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
					    }else{
					      tempStruct.setGNR_TYP(getDisplayName(COM_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
					    }
					}
										
					//�w�b�_�\���Z�b�g
					struct.setSCDL_RCV_TOTAL_FIX(scdlRcvTotalFix);
					struct.setSCDL_RCV_TOTAL_NOFIX(scdlRcvTotalNoFix);
					struct.setSCDL_ISSUE_TOTAL_FIX(scdlIssueTotalFix);
					struct.setSCDL_ISSUE_TOTAL_NOFIX(scdlIssueTotalNoFix);
					
					struct.setSCDL_ISSUE_TOTAL(Calculate.add(scdlIssueTotalFix, scdlIssueTotalNoFix));
					struct.setSCDL_RCV_TOTAL(Calculate.add(scdlRcvTotalFix, scdlRcvTotalNoFix));
						
					// �\���p���X�g�ɃZ�b�g
					setList(tempList);
					
					// �Ǎ��f�[�^��CSV���X�g�ɑޔ�
					_csvList = tempList;
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Explanner/Ja���ł̓Ǎ�����
	 *
	 */
	private void selectInExplannerJa(List workList, List listMessage){
		try{

//			List tempList = null;
//
//			//�ڍ׃f�[�^���擾
//			if (("true".equals(struct.getcheckProdPlan()))){
//				//�y���Y�v��̖��m����܂߂Ȃ��z��ON�̏ꍇ
//				// �v��f�}���h�A�v��I�[�_�̎擾�͍s��Ȃ�
//				tempList = entity.mgetDETAIL_DATA_JA.read(conn, struct);
//			} else {
//				//�y���Y�v��̖��m����܂߂Ȃ��z��OFF�̏ꍇ
//				// �v��f�}���h�A�v��I�[�_�̎擾���s��
//				tempList = entity.mgetDETAIL_DATA_PLAN_JA.read(conn, struct);
//			}
			
			List tempList = null;
			long count = 0;
			HashSet set = new HashSet();
			HashSet odrSet = new HashSet();
			HashSet deptSet = new HashSet();
			HashSet coeSet = new HashSet();
			
			//�ڍ׃f�[�^���擾
			struct.setw_MRP_FLG(null);
			struct.setw_CHECK_FLG(null);
			struct.setw_ENV_FLG("2");
			if("true".equals(struct.getcheckMrpFlg())){
				struct.setw_MRP_FLG(null);
			} else {
				struct.setw_MRP_FLG("1");
			}
			if("true".equals(struct.getcheckProdPlan())){
				struct.setw_CHECK_FLG("1");
			} else {
				struct.setw_CHECK_FLG("0");
			}
			if("true".equals(struct.getcheckQty())){
				struct.setw_QTY_FLG("1");
			} else {
				struct.setw_QTY_FLG("0");
			}
			
			// �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
			ScreenParam sp = new ScreenParam(this.getClass());
		    int maxLine = sp.getMaxLine(conn,10);
		    if (maxLine != 0){
			   struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
			   struct.setROW_COUNT(null);
			}
			List tempList1 = entity.mgetDETAL_DATACnt.read(conn, struct);
			long rowCount1 = Long.parseLong(((AG0050010Struct) tempList1.get(0)).getl_COUNT());
//20150813 MOD START BY SYSCOM
//			List tempList2 = entity.mgetDETAIL_DATA_JACnt.read(conn, struct);
			List tempList2 =  new ArrayList();
			//�u�󒍃f�}���h�쐬��e�[�u���v��1�F�����󒍂̏ꍇ
			if("1".equals(struct.geth_DM_CREATE_BASE_TBL())){
				tempList2 = entity.mgetDETAIL_DATA_JACnt.read(conn, struct);
			//�u�󒍃f�}���h�쐬��e�[�u���v��1�F�����󒍂̏ꍇ
			} else {
				tempList2 = entity.mgetDETAIL_DATA_JA_WORKCnt.read(conn, struct);
			}
//20150813 MOD END BY SYSCOM
			long rowCount2 = Long.parseLong(((AG0050010Struct) tempList2.get(0)).getl_COUNT());
			// ��������0���̏ꍇ
			if (rowCount1 ==0 && rowCount2 == 0) { // �Y���f�[�^�Ȃ�
				listMessage.add("ITEM_CD:" + struct.getw_ITEM_CD());
				listMessage.add("PLANT_CD:" + struct.getw_PLANT_CD());
				setErrorMessage("ZZ06001", listMessage);
				setReadStatus(NOT_FOUND);
				struct.copy(getKeyStruct());
				if(tempList!=null && tempList.size()>0){
					tempList.clear();
				}
				return;
			}else{
				// �\���ő�s����������
			    if (maxLine != 0 && ((rowCount1 == maxLine + 1)||(rowCount2 == maxLine + 1))||(rowCount1+rowCount2 >= maxLine + 1)) {
				    // �Ǎ��X�e�[�^�X�ݒ�
				    setErrorMessage("ZZ01115", "", String.valueOf(maxLine));
				    readStatus = TOO_MANY;
				    listMessage.clear();
				    // �\���p���X�g�ɃZ�b�g
				   if(tempList!=null && tempList.size()>0){
					  tempList.clear();
				   }
				   return;
			    }else{
					tempList1 = entity.mgetDETAIL_DATA.read(conn, struct);
//20150813 MOD START BY SYSCOM
//					tempList2 = entity.mgetDETAIL_DATA_JA.read(conn, struct);
			    	//�u�󒍃f�}���h�쐬��e�[�u���v��1�F�����󒍂̏ꍇ
			    	if("1".equals(struct.geth_DM_CREATE_BASE_TBL())){
			    		tempList2 = entity.mgetDETAIL_DATA_JA.read(conn, struct);
			    	//�u�󒍃f�}���h�쐬��e�[�u���v��1�F�����󒍂̏ꍇ
					} else {
						tempList2 = entity.mgetDETAIL_DATA_JA_WORK.read(conn, struct);
					}
//20150813 MOD END BY SYSCOM
					tempList1.addAll(tempList2);					
					tempList = tempList1;
					// �Ǎ��X�e�[�^�X�ݒ�
					setReadStatus(NORMAL);
					String effectStockQty = "0";
					String scdlRcvTotalFix = "0";
					String scdlRcvTotalNoFix = "0";
					String scdlIssueTotalFix = "0";
					String scdlIssueTotalNoFix = "0";
					
					AG0050010Struct tempStruct = null;

					Collections.sort(tempList,new Sort());									

					for(int i = 0; i < tempList.size(); i++ ) {
						tempStruct = (AG0050010Struct)tempList.get(i);

						// (2)	�m��f�}���h�Őe�I�[�_�ԍ��A�e�I�[�_�i�ڔԍ��A�e�I�[�_�i�ږ��̐ݒ�
						if ("4".equals(tempStruct.getSORT_NO())) {
							// �i�ڕʎd�|.��ƌv��ԍ�
							String WORK_ODR_CD = tempStruct.getWORK_ODR_CD();
							// �����c.�����ԍ�
							String PARENT_ORDER_NO = tempStruct.getPARENT_ORDER_NO();
							AG0050010Struct itemInfoStruct = new AG0050010Struct();
							List itemList = new ArrayList(0);
							// �i�ڕʎd�|.��ƌv��ԍ����擾�ł���
							if(null != WORK_ODR_CD){
								tempStruct.setPARENT_ORDER_NO(WORK_ODR_CD);
								itemInfoStruct.setODR_CD(WORK_ODR_CD);
								itemList = entity.mgetT_WORK_ITEM_INFO.read(conn, itemInfoStruct);
								if(itemList.size() > 0){
									itemInfoStruct = (AG0050010Struct)itemList.get(0);
									// �e�I�[�_�i�ڔԍ�
									tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
									// �e�I�[�_�i�ږ�
									tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}else{
								itemInfoStruct.setODR_CD(PARENT_ORDER_NO);
								itemList = entity.mgetT_RLSD_ITEM_INFO.read(conn, itemInfoStruct);
								if(itemList.size() > 0){
									itemInfoStruct = (AG0050010Struct)itemList.get(0);
									// �e�I�[�_�i�ڔԍ�
									tempStruct.setPARENT_ORDER_ITEM_NO(itemInfoStruct.getPARENT_ORDER_ITEM_NO());
									// �e�I�[�_�i�ږ�
									tempStruct.setPARENT_ORDER_ITEM_NAME(itemInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}
						}
						if ("5".equals(tempStruct.getSORT_NO())) {
							AG0050010Struct odInfoStruct = new AG0050010Struct();
							List odList = new ArrayList(0);
							if(null != tempStruct.getPARENT_ORDER_NO()){
								odInfoStruct.setODR_CD(tempStruct.getPARENT_ORDER_NO());
								odList = entity.mgetT_OD_INFO.read(conn, odInfoStruct);
								if(odList.size() > 0){
									odInfoStruct = (AG0050010Struct)odList.get(0);
									// �e�I�[�_�i�ڔԍ�
									tempStruct.setPARENT_ORDER_ITEM_NO(odInfoStruct.getPARENT_ORDER_ITEM_NO());
									// �e�I�[�_�i�ږ�
									tempStruct.setPARENT_ORDER_ITEM_NAME(odInfoStruct.getPARENT_ORDER_ITEM_NAME());
								}
							}
						}					
						if ("1".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else 	if ("2".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							// �X�e�[�^�X���u�T�F����v�A�u�U�F������s�ρv�A�u�V�F��������v�A�u�W�F���������v�̏ꍇ�A���Z���ꂢ�ĂȂ�
							if(!"5".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"6".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"7".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())
									&& !"8".equals(((AG0050010Struct)tempList.get(i)).getNUMBER_STATUS())) {
								// �L���݌ɐ��쐬
								effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
								//�m��I�[�_(���ɗ\�荇�v(�m��))�쐬
								scdlRcvTotalFix = Calculate.add(scdlRcvTotalFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);

						} else if ("3".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.add(effectStockQty,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�v��I�[�_(���ɗ\�荇�v(���m��))�쐬
							scdlRcvTotalNoFix = Calculate.add(scdlRcvTotalNoFix,((AG0050010Struct)tempList.get(i)).getSTOCK_ODR_QTY());
						} else if ("4".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("5".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							//�L���݌ɐ��쐬
							effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
							//�v��f�}���h(�o�ɗ\�荇�v(���m��))�쐬
							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getDEMAND_QTY());
						} else if ("6".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							count = set.size();
							// �I�[�_�f�}���h�ԍ���ۑ�
							set.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// ���łɃ}�C�i�X�����I�[�_�f�}���h�ԍ��̎󒍂ł���΃}�C�i�X���Ȃ�
							if(count == set.size()){
								//�L���݌ɐ��쐬
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
								//�����󒍃f�[�^�E�v��f�}���h(�o�ɗ\�荇�v(���m��))�쐬
								scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else if ("7".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							count = odrSet.size();
							// �I�[�_�f�}���h�ԍ���ۑ�
							odrSet.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// ���łɃ}�C�i�X�����I�[�_�f�}���h�ԍ��̎󒍂ł���΃}�C�i�X���Ȃ�
							if(count == odrSet.size()){
								// �L���݌ɐ��쐬
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
								//�m��󒍃f�[�^�E�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
								scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else if ("8".equals(((AG0050010Struct)tempList.get(i)).getSORT_NO())) {
							count = deptSet.size();
							// �I�[�_�f�}���h�ԍ���ۑ�
							deptSet.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// ���łɃ}�C�i�X�����I�[�_�f�}���h�ԍ��̎󒍂ł���΃}�C�i�X���Ȃ�
							if(count == deptSet.size()){
								// �L���݌ɐ��쐬
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
								//�f�|�v��f�[�^�E�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
								scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());	
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
						} else {
							//���݂̗L���݌Ɍv�Z
							count = coeSet.size();
							// �I�[�_�f�}���h�ԍ���ۑ�
							coeSet.add(((AG0050010Struct)tempList.get(i)).getOD_NO());
							count ++;
							// ���łɃ}�C�i�X�����I�[�_�f�}���h�ԍ��̎󒍂ł���΃}�C�i�X���Ȃ�
							if(count == coeSet.size()){
								//�L���݌ɐ��쐬
								effectStockQty = Calculate.subtract(effectStockQty,((AG0050010Struct)tempList.get(i)).getINTEGRATE_ODR_QTY_ZH());
							}
							((AG0050010Struct)tempList.get(i)).setEFFECT_STOCK_QTY(effectStockQty);
//20150813 MOD START BY SYSCOM
//							//�����󒍃f�[�^�E�v��f�}���h(�o�ɗ\�荇�v(���m��))�쐬
//							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getUNOFFICIAL_ODR_QTY());
//							//�m��󒍃f�[�^�E�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
//							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getFIX_ODR_QTY());
//							//�f�|�v��f�[�^�E�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
//							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEPOT_QTY());
							if("1".equals(struct.geth_DM_CREATE_BASE_TBL())){
	 							//�����󒍃f�[�^�E�v��f�}���h(�o�ɗ\�荇�v(���m��))�쐬
	 							scdlIssueTotalNoFix = Calculate.add(scdlIssueTotalNoFix,((AG0050010Struct)tempList.get(i)).getUNOFFICIAL_ODR_QTY());
	 							//�m��󒍃f�[�^�E�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
	 							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getFIX_ODR_QTY());
	 							//�f�|�v��f�[�^�E�m��f�}���h(�o�ɗ\�荇�v(�m��))�쐬
	 							scdlIssueTotalFix = Calculate.add(scdlIssueTotalFix,((AG0050010Struct)tempList.get(i)).getDEPOT_QTY());
							}
//20150813 MOD END BY SYSCOM
						}
						
						// �R���{�{�b�N�X�f�[�^������Ή�
						/** �R���{�{�b�N�X�f�[�^�擾�p�@�I�[�_��ԋ敪 */
					  tempStruct.setSTATUS(getDisplayName(COM_ODR_STATUS, tempStruct.getNUMBER_STATUS()));
						if("2".equals(tempStruct.getSORT_NO())) {
							if("1".equals(tempStruct.getGNR())){
					      tempStruct.setSTATUS(getDisplayName(COM_ODR_STS_TYP, tempStruct.getNUMBER_STATUS()));
						  }
				    }
						
						/** �R���{�{�b�N�X�f�[�^�擾�p�@�������������敪 */
						if(null != tempStruct.getGNR() && "2".equals(tempStruct.getGNR())){
				      tempStruct.setGNR_TYP(getDisplayName(COM_PUCH_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
				    }else{
				      tempStruct.setGNR_TYP(getDisplayName(COM_ODR_GNR_TYP, tempStruct.getNUMBER_GNR_TYP()));
				    }
											
					}
										
					//�w�b�_�\���Z�b�g
					struct.setSCDL_RCV_TOTAL_FIX(scdlRcvTotalFix);
					struct.setSCDL_RCV_TOTAL_NOFIX(scdlRcvTotalNoFix);
					struct.setSCDL_ISSUE_TOTAL_FIX(scdlIssueTotalFix);
					struct.setSCDL_ISSUE_TOTAL_NOFIX(scdlIssueTotalNoFix);
					
					struct.setSCDL_ISSUE_TOTAL(Calculate.add(scdlIssueTotalFix, scdlIssueTotalNoFix));
					struct.setSCDL_RCV_TOTAL(Calculate.add(scdlRcvTotalFix, scdlRcvTotalNoFix));
						
					// �\���p���X�g�ɃZ�b�g
					setList(tempList);
					
					//�Ǎ��f�[�^��CSV���X�g�ɑޔ�
					_csvList = tempList;						
				
			    }
			}
					
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			struct.seth_INSTALL_FLG("1");
		}
		
	}

	//�󒍃f�[�^�̕��я��̂���
	public class Sort implements Comparator{
		public int compare(Object o1,Object o2){
			int i  = 0;
			try{
				if (((AG0050010Struct)o1).getDELIVERY_DATE() == null || ((AG0050010Struct)o2).getDELIVERY_DATE() == null){
					i = 0;					
				}else if ((((AG0050010Struct)o1).getDELIVERY_DATE()).compareTo(((AG0050010Struct)o2).getDELIVERY_DATE())==0){
					i = 0;					
				}else if ((((AG0050010Struct)o1).getDELIVERY_DATE()).compareTo(((AG0050010Struct)o2).getDELIVERY_DATE()) < 0){
					i = -1;					
				}else{
					i = 1;					
				}
			}catch(Exception e){
		            e.printStackTrace();
			}
			return i;
		}
	}

		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		// ���O�o�͏��i�[�p
		String logMessage = "";
		List listMessage = new ArrayList();

		try {

			// �L�[���ڃ��O�\��
			logMessage = "ITEM_CD:" + struct.getw_ITEM_CD()
					+ ", PLANT_CD:" + struct.getw_PLANT_CD();
			setSyslogConfig(logMessage);
			setReadStatus(INITIAL);
			
			// ���i�ڔԍ�
			String SELF_ITEM_CD = struct.getw_ITEM_CD();
			String RDO_SELF_ITEM_CD = struct.getrdoItemCd();
			// �e�i�ڔԍ�
			String PARENT_ITEM_CD = struct.getw_PARENT_ITEM_CD();
			String RDO_PARENT_ITEM_CD = struct.getrdoParentItemCd();
			// �q�i�ڔԍ�
			String COMP_ITEM_CD = struct.getw_COMP_ITEM_CD();
			String RDO_COMP_ITEM_CD = struct.getrdoCompItemCd();
			// ���X�g�N���A
			if(list != null){
				list.clear();
			}
			struct.setw_PARENT_ITEM_NAME("");
			struct.setw_COMP_ITEM_NAME("");
			struct.setw_ITEM_NAME("");
			
			// �G���[�`�F�b�N
			// �H��R�[�h���w�肳�ꂽ�ꍇ
			if(struct.getw_PLANT_CD() != null && "".equals(struct.getw_PLANT_CD()) == false){
				// �H��R�[�h�̑��݃`�F�b�N
				List tmpList = entity.mcheckM_PLANT.read(conn, struct);
				if(tmpList.size() <= 0) {
					// �Ǎ��������s�F�H��R�[�h�����݂��܂���
					struct.setw_PLANT_NAME("");
					logMessage = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
					setErrorMessage("ZZ11001", logMessage);
					struct.copy(getKeyStruct());
					return;
				}
				else{
					AG0050010Struct tmpStruct = (AG0050010Struct)tmpList.get(0);
					struct.setw_PLANT_NAME(tmpStruct.getw_PLANT_NAME());
				}
			}
			// �i�ڔԍ��̑��݃`�F�b�N
			if("true".equals(struct.getrdoParentItemCd())){
				List itemList = entity.mselect.read(conn, struct);
				if(itemList.size() <= 0) {
					// �Ǎ��������s�F�i�ڔԍ������݂��܂���
					logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
					setErrorMessage("ZZ11002", logMessage);
					struct.copy(getKeyStruct());
					return;
				}else{
					AG0050010Struct itemStruct = (AG0050010Struct)itemList.get(0);
					struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
				}
				struct.setw_ITEM_CD(PARENT_ITEM_CD);
			}
			if("true".equals(struct.getrdoCompItemCd())){
				List itemList = entity.mselect.read(conn, struct);
				if(itemList.size() <= 0) {
					// �Ǎ��������s�F�i�ڔԍ������݂��܂���
					logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
					setErrorMessage("ZZ11002", logMessage);
					struct.copy(getKeyStruct());
					return;
				}else{
					AG0050010Struct itemStruct = (AG0050010Struct)itemList.get(0);
					struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
				}
				struct.setw_ITEM_CD(COMP_ITEM_CD);
			}
			
			List workList = entity.mselect.read(conn, struct);
			if(workList.size() <= 0) {
				// �Ǎ��������s�F�i�ڔԍ������݂��܂���
				logMessage = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
				setErrorMessage("ZZ11002", logMessage);
				struct.copy(getKeyStruct());
				return;
			}
			
			// ���i�\���}�X�^�����݃`�F�b�N
			if("true".equals(struct.getrdoParentItemCd())){
			  AG0050010Struct m_psStruct = new AG0050010Struct();
			  m_psStruct.setw_PARENT_ITEM_CD(PARENT_ITEM_CD);
			  m_psStruct.setw_COMP_ITEM_CD(SELF_ITEM_CD);
			  boolean b = entity.mcheckM_PS.check(conn, m_psStruct);
			  if(!b){
				  // �Ǎ��������s�F���i�\���}�X�^�����݂��Ȃ�
				  String logMessage1 = "M_PS.PARENT_ITEM_CD:" + PARENT_ITEM_CD;
				  String logMessage2 = "M_PS.COMP_ITEM_CD:" + SELF_ITEM_CD;
				  ExpjMessage emsg = new ExpjMessage( "AG00502" );
				  msgStruct.addError( emsg );
				  sysLog.warning(emsg, getsysUSER_CD());
				  emsg = new ExpjMessage( "ZZ01006", logMessage1 );
				  msgStruct.addError( emsg );
				  emsg = new ExpjMessage( "ZZ01006", logMessage2 );
				  msgStruct.addError( emsg );
				  sysLog.warning(emsg, getsysUSER_CD());
				  struct.copy(getKeyStruct());
				  return;
			  }
			}
			
			if("true".equals(struct.getrdoCompItemCd())){
			  AG0050010Struct m_psStruct = new AG0050010Struct();
			  m_psStruct.setw_PARENT_ITEM_CD(SELF_ITEM_CD);
			  m_psStruct.setw_COMP_ITEM_CD(COMP_ITEM_CD);
			  boolean b = entity.mcheckM_PS.check(conn, m_psStruct);
			  if(!b){
					// �Ǎ��������s�F���i�\���}�X�^�����݂��Ȃ�
					String logMessage1 = "M_PS.PARENT_ITEM_CD:" + SELF_ITEM_CD;
					String logMessage2 = "M_PS.COMP_ITEM_CD:" + COMP_ITEM_CD;
					ExpjMessage emsg = new ExpjMessage( "AG00502" );
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					emsg = new ExpjMessage( "ZZ01006", logMessage1 );
					msgStruct.addError( emsg );
					emsg = new ExpjMessage( "ZZ01006", logMessage2 );
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					struct.copy(getKeyStruct());
					return;
			  }
			}
			
			// �f�[�^�Ǎ�
			if(msgStruct.sizeError() <= 0){
				// �i�ڃ}�X�^���
				if(workList.size() > 0) {
					AG0050010Struct workStruct = (AG0050010Struct)workList.get(0);
					if("true".equals(struct.getrdoItemCd())){
					  struct.setw_ITEM_NAME(workStruct.getw_ITEM_NAME());
					}
					if("true".equals(struct.getrdoParentItemCd())){
					  struct.setw_PARENT_ITEM_NAME(workStruct.getw_ITEM_NAME());
					}
					if("true".equals(struct.getrdoCompItemCd())){
					  struct.setw_COMP_ITEM_NAME(workStruct.getw_ITEM_NAME());
					}
					struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
				}

				if(this.getEnvironment() == EXPLANNER_J){
					this.selectInExplannerJ(workList, listMessage);
				}
				if(this.getEnvironment() == EXPLANNER_JA){
					this.selectInExplannerJa(workList, listMessage);
				}
			}
			
			struct.setw_ITEM_CD(SELF_ITEM_CD);
			struct.setw_PARENT_ITEM_CD(PARENT_ITEM_CD);
			struct.setw_COMP_ITEM_CD(COMP_ITEM_CD);
			struct.setrdoItemCd(RDO_SELF_ITEM_CD);
			struct.setrdoParentItemCd(RDO_PARENT_ITEM_CD);
			struct.setrdoCompItemCd(RDO_COMP_ITEM_CD);

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------

		// ���X�g�N���A
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}
				
		// ������
		struct.clear();
		struct.initialize();
		_keyStruct = new AG0050010Struct();

//20150813 ADD START BY SYSCOM
		struct.seth_DM_CREATE_BASE_TBL(tempDM_CREATE_BASE_TBL);
//20150813 ADD END BY SYSCOM
				
		// �H��R�[�h���f�t�H���g�\��
		struct.setw_PLANT_CD(getsysPLANT_CD());
		// ��ЃR�[�h���f�t�H���g�\��
		struct.setCOMPANY_CD(getsysMY_COMPANY());
		if(this.getEnvironment() == EXPLANNER_JA){
			struct.seth_INSTALL_FLG("1");
		}
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
		List csvList = new ArrayList();
		
		if(this.getEnvironment() == EXPLANNER_J){
		      String[] title = {
		      	"Expj.Cmt0135" ,
		      	"Expj.Cmt3110" ,
		      	"Expj.DM_QTY" ,
		      	"Expj.Cmt3111" ,
		      	"Expj.Cmt3112" ,
		      	"Expj.Cmt3122" ,
		      	"Expj.STOCK_UNIT_1" ,
		      	"Expj.Cmt0721" ,
		      	"Expj.Cmt3114" ,
		      	"Expj.Cmt3118" ,
		      	"Expj.Cmt3119" ,
		      	"Expj.Cmt3115" ,
		      	"Expj.Cmt3116" ,
		      	"Expj.JOB_ODR_CD" ,
		      	"Expj.WH_CD" ,
		      	"Expj.WH_NAME" ,
		      	"Expj.Cmt3117" ,
		      	"Expj.JOB_ODR_CANCEL_NO" ,
		      	"Expj.CUST_CD" ,
		      	"Expj.CUST_NAME",
		      	"Expj.DLV_LOC_CD" ,
		      	"Expj.DESINATED_DLV_DATE",	// �w��[��
		      	"Expj.ODR_ACPT_DATE",		// �󒍓�
		      	"Expj.VEND_CD" ,
		      	"Expj.VEND_NAME",
		      	"Expj.Cmt3120" ,
		      	"Expj.Cmt3121" 

		      };
		      csvList.add(title);
		      for (Iterator i = _csvList.iterator(); i.hasNext();) {
		        AG0050010Struct csvStruct = (AG0050010Struct) i.next();
		        String[] csvStr = new String[title.length];
		        csvStr[0] = csvStruct.getDELIVERY_DATE();
		        csvStr[1] = NullToZero(csvStruct.getINSIDE_ODR_QTY());
		        csvStr[2] = NullToZero(csvStruct.getDEMAND_QTY());
		        csvStr[3] = NullToZero(csvStruct.getSTOCK_ODR_QTY());
		        csvStr[4] = csvStruct.getADD_SUBTRACT();
		        csvStr[5] = NullToZero(csvStruct.getEFFECT_STOCK_QTY());
		        csvStr[6] = csvStruct.getPURCHASE_UNIT();
		        csvStr[7] = csvStruct.getSTATUS();
		        csvStr[8] = csvStruct.getPARENT_ORDER_NO();
		        csvStr[9] = csvStruct.getPARENT_ORDER_ITEM_NO();
		        csvStr[10] = csvStruct.getPARENT_ORDER_ITEM_NAME();
		        csvStr[11] = csvStruct.getDEMAND_NO();
		        csvStr[12] = csvStruct.getORDER_NO();
		        csvStr[13] = csvStruct.getJOB_ODR_CD();
		        csvStr[14] = csvStruct.getWH_CD();
		        csvStr[15] = csvStruct.getWH_NAME();
		        csvStr[16] = csvStruct.getGNR_TYP();
		        csvStr[17] = csvStruct.getJOB_ODR_CANCEL_NO();
		        csvStr[18] = csvStruct.getCUST_CD();
		        csvStr[19] = csvStruct.getCUST_ANAME();
		        csvStr[20] = csvStruct.getDLV_LOC_CD();
		        csvStr[21] = csvStruct.getDESINATED_DLV_DATE();	// �w��[��
		        csvStr[22] = csvStruct.getODR_ACPT_DATE();		//�@�󒍓�
		        csvStr[23] = csvStruct.getVEND_CD();
		        csvStr[24] = csvStruct.getVEND_ANAME();
		        csvStr[25] = csvStruct.getODR_START_DATE();
		        csvStr[26] = csvStruct.getPUCH_ODR_START_DATE();
		      	
		        csvList.add(csvStr);
		      }
		}
		if(this.getEnvironment() == EXPLANNER_JA){
		      String[] title = {
		      	"Expj.Cmt0135" ,
		      	"Expj.Cmt3180" ,
		      	"Expj.DM_QTY" ,
		      	"Expj.Cmt3111" ,
		      	"Expj.Cmt3112" ,
		      	"Expj.Cmt3122" ,
		      	"Expj.STOCK_UNIT_1" ,
		      	"Expj.Cmt0721" ,
		      	"Expj.Cmt3114" ,
		      	"Expj.Cmt3118" ,
		      	"Expj.Cmt3119" ,
		      	"Expj.Cmt3115" ,
		      	"Expj.Cmt3116" ,
		      	"Expj.JOB_ODR_CD" ,
		      	"Expj.WH_CD" ,
		      	"Expj.WH_NAME" ,
		      	"Expj.Cmt3117" ,
		      	"Expj.JOB_ODR_CANCEL_NO" ,
		      	"Expj.CUST_CD" ,
		      	"Expj.CUST_NAME",
		      	"Expj.DLV_LOC_CD" ,
		      	"Expj.VEND_CD" ,
		      	"Expj.VEND_NAME" ,
		      	"Expj.Cmt3120" ,
		      	"Expj.Cmt3121" ,
		      	"Expj.Cmt3070" ,
		      	"Expj.Cmt3069" ,
//20150813 MOD START BY SYSCOM
//		      	"Expj.Cmt3179" 
		      	"Expj.Cmt3179" ,
		      	"Expj.ODR_DEPOT_CTL_NO",  //�󒍁E�f�|�v��Ǘ��ԍ�
		      	"Expj.CUST_ODR_NO",       //���Ӑ撍���ԍ�
		      	"Expj.ODR_CHARACTERISTIC" //�󒍓���
//20150813 MOD END BY SYSCOM

		      };
		      csvList.add(title);
		      for (Iterator i = _csvList.iterator(); i.hasNext();) {
		        AG0050010Struct csvStruct = (AG0050010Struct) i.next();
		        String[] csvStr = new String[title.length];
		        csvStr[0] = csvStruct.getDELIVERY_DATE();
		        csvStr[1] = NullToZero(csvStruct.getINTEGRATE_ODR_QTY());
		        csvStr[2] = NullToZero(csvStruct.getDEMAND_QTY());
		        csvStr[3] = NullToZero(csvStruct.getSTOCK_ODR_QTY());
		        csvStr[4] = csvStruct.getADD_SUBTRACT();
		        csvStr[5] = NullToZero(csvStruct.getEFFECT_STOCK_QTY());
		        csvStr[6] = csvStruct.getPURCHASE_UNIT();
		        csvStr[7] = csvStruct.getSTATUS();
		        csvStr[8] = csvStruct.getPARENT_ORDER_NO();
		        csvStr[9] = csvStruct.getPARENT_ORDER_ITEM_NO();
		        csvStr[10] = csvStruct.getPARENT_ORDER_ITEM_NAME();
		        csvStr[11] = csvStruct.getDEMAND_NO();
		        csvStr[12] = csvStruct.getORDER_NO();
		        csvStr[13] = csvStruct.getJOB_ODR_CD();
		        csvStr[14] = csvStruct.getWH_CD();
		        csvStr[15] = csvStruct.getWH_NAME();
		        csvStr[16] = csvStruct.getGNR_TYP();
		        csvStr[17] = csvStruct.getJOB_ODR_CANCEL_NO();
		        csvStr[18] = csvStruct.getCUST_CD();
		        csvStr[19] = csvStruct.getCUST_ANAME();
		        csvStr[20] = csvStruct.getDLV_LOC_CD();
		        csvStr[21] = csvStruct.getVEND_CD();
		        csvStr[22] = csvStruct.getVEND_ANAME();
		        csvStr[23] = csvStruct.getODR_START_DATE();
		        csvStr[24] = csvStruct.getPUCH_ODR_START_DATE();
		        csvStr[25] = NullToZero(csvStruct.getFIX_ODR_QTY());
		        csvStr[26] = NullToZero(csvStruct.getUNOFFICIAL_ODR_QTY());
		        csvStr[27] = NullToZero(csvStruct.getDEPOT_QTY());
//20150813 ADD START BY SYSCOM
		      	csvStr[28] = csvStruct.getODR_DEPOT_CTL_NO();
		      	csvStr[29] = csvStruct.getCUST_ODR_NO();
		      	csvStr[30] = csvStruct.getODR_CHARACTERISTIC();
//20150813 ADD END BY SYSCOM
	
		        csvList.add(csvStr);
		      }
		}
		      
	      if (csvList != null && !csvList.isEmpty()) {
	        // CsvWriter�𐶐�
	        csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
	        csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
	        struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
	      }

                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		try {
			struct.setu_OPTION_ID("JA*");
			List tempList = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			AG0050010Struct tempStruct = new AG0050010Struct();
			if(tempList != null && tempList.size()>0){
				tempStruct = (AG0050010Struct)tempList.get(0);
				struct.seth_INSTALL_FLG(tempStruct.geth_INSTALL_FLG());
			}
			if("1".equals(struct.geth_INSTALL_FLG())){
				this.setEnvironment(EXPLANNER_JA);
			}else{
				this.setEnvironment(EXPLANNER_J);
			}
			
//20150813 ADD START BY SYSCOM
			// Explanner/Ja���̏ꍇ�A�󒍃f�}���h�쐬��e�[�u���擾
			if(this.getEnvironment() == EXPLANNER_JA){
				List baseTblList = entity.mgetDM_CREATE_BASE_TBL.read(conn, struct);
				AG0050010Struct baseTblStruct = new AG0050010Struct();
				if(baseTblList != null && baseTblList.size()>0){
					baseTblStruct = (AG0050010Struct)baseTblList.get(0);
					struct.seth_DM_CREATE_BASE_TBL(baseTblStruct.getw_DM_CREATE_BASE_TBL());
					
					if(!"1".equals(struct.geth_DM_CREATE_BASE_TBL()) && !"2".equals(struct.geth_DM_CREATE_BASE_TBL())){
						// �擾�l��1(������)�A2(�����󒍃��[�N)�ȊO�̏ꍇ�A�v���I�G���[
						setFatalMessage("KQ22019");
					}
				}
				else
				{
					// �擾�ł��Ȃ��ꍇ�A�v���I�G���[
					setFatalMessage("KQ22019");
				}
			}
			tempDM_CREATE_BASE_TBL = struct.geth_DM_CREATE_BASE_TBL();
//20150813 ADD END BY SYSCOM
		} catch (SQLException e) {
			e.printStackTrace();
//20150813 DEL START BY SYSCOM
//		} catch (Exception e){
//			e.printStackTrace();
//20150813 DEL END BY SYSCOM
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();

		try {
			struct.setu_OPTION_ID("JA*");
			List tempList = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			AG0050010Struct tempStruct = new AG0050010Struct();
			if(tempList != null && tempList.size()>0){
				tempStruct = (AG0050010Struct)tempList.get(0);
				struct.seth_INSTALL_FLG(tempStruct.geth_INSTALL_FLG());
			}
			if("1".equals(struct.geth_INSTALL_FLG())){
				this.setEnvironment(EXPLANNER_JA);
			}else{
				this.setEnvironment(EXPLANNER_J);
			}
			//���Џ��
			SysMyCompany = SystemInformation.getSysMyCompanyCd();
			if(SysMyCompany==null||SysMyCompany.length()==0){
				ExpjMessage emsg = new ExpjMessage("KQ00039");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
			}
			struct.setCOMPANY_CD(getsysMY_COMPANY());
		} catch (SQLException e) {
			e.printStackTrace();
//20150813 DEL START BY SYSCOM	
//		} catch (Exception e){
//			e.printStackTrace();
//20150813 DEL END BY SYSCOM	
		}
		
		if (isScreenMove() == true) {
			// ������
			struct.clear();
			struct.initialize();
			_keyStruct = new AG0050010Struct();
			struct.setw_ITEM_CD(itemCd);
			struct.setw_PLANT_CD(plantCd);
			struct.setrdoItemCd("true");
			controlselect();
		} else {
			// �H��R�[�h���f�t�H���g�\��
			struct.setw_PLANT_CD(getsysPLANT_CD());
		}
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��
			try{
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				// �R���v�{�b�N�X�̓��e������Ή�
				COM_ODR_STATUS = comboController.getData(ODR_STATUS_PARAMETER_NAME);
				COM_ODR_STS_TYP = comboController.getData(ODR_STS_TYP_PARAMETER_NAME);
				COM_ODR_GNR_TYP = comboController.getData(ODR_GNR_TYP_PARAMETER_NAME);
				COM_PUCH_ODR_GNR_TYP = comboController.getData(PUCH_ODR_GNR_TYP_PARAMETER_NAME);
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AG0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("select") ) {
				controlselect();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------

//		�\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
		//------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AG0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AG0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AG0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AG0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AG0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AG0050010Entity entity;
	protected AG0050010Struct struct;
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

		entity = new AG0050010Entity();
		struct = new AG0050010Struct();

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
	 * AG0050010�N���X�̕W���R���X�g���N�^
	 */
	public AG0050010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//------------------------------------------------------------------
		list = new ArrayList(0);
        //------------------------------------------------------------------
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
				AG0050010Struct key = (AG0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_3") && key.getSTOCK_UNIT_3() != null) {
					msgKey.setKeyValue("STOCK_UNIT_3", key.getSTOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_1") && key.getSTOCK_UNIT_1() != null) {
					msgKey.setKeyValue("STOCK_UNIT_1", key.getSTOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_4") && key.getSTOCK_UNIT_4() != null) {
					msgKey.setKeyValue("STOCK_UNIT_4", key.getSTOCK_UNIT_4());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL") && key.getSCDL_ISSUE_TOTAL() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_TOTAL", key.getSCDL_ISSUE_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_2") && key.getSTOCK_UNIT_2() != null) {
					msgKey.setKeyValue("STOCK_UNIT_2", key.getSTOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL") && key.getSCDL_RCV_TOTAL() != null) {
					msgKey.setKeyValue("SCDL_RCV_TOTAL", key.getSCDL_RCV_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_5") && key.getSTOCK_UNIT_5() != null) {
					msgKey.setKeyValue("STOCK_UNIT_5", key.getSTOCK_UNIT_5());
				}
				if(msgKeyType.containsKeyColumn("rdoItemCd") && key.getrdoItemCd() != null) {
					msgKey.setKeyValue("rdoItemCd", key.getrdoItemCd());
				}
				if(msgKeyType.containsKeyColumn("rdoParentItemCd") && key.getrdoParentItemCd() != null) {
					msgKey.setKeyValue("rdoParentItemCd", key.getrdoParentItemCd());
				}
				if(msgKeyType.containsKeyColumn("rdoCompItemCd") && key.getrdoCompItemCd() != null) {
					msgKey.setKeyValue("rdoCompItemCd", key.getrdoCompItemCd());
				}
				if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_NAME") && key.getw_PARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_PARENT_ITEM_NAME", key.getw_PARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_COMP_ITEM_NAME") && key.getw_COMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_COMP_ITEM_NAME", key.getw_COMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("checkMrpFlg") && key.getcheckMrpFlg() != null) {
					msgKey.setKeyValue("checkMrpFlg", key.getcheckMrpFlg());
				}
				if(msgKeyType.containsKeyColumn("checkProdPlan") && key.getcheckProdPlan() != null) {
					msgKey.setKeyValue("checkProdPlan", key.getcheckProdPlan());
				}
				if(msgKeyType.containsKeyColumn("checkUncnfm") && key.getcheckUncnfm() != null) {
					msgKey.setKeyValue("checkUncnfm", key.getcheckUncnfm());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("checkQty") && key.getcheckQty() != null) {
					msgKey.setKeyValue("checkQty", key.getcheckQty());
				}
				if(msgKeyType.containsKeyColumn("h_DM_CREATE_BASE_TBL") && key.geth_DM_CREATE_BASE_TBL() != null) {
					msgKey.setKeyValue("h_DM_CREATE_BASE_TBL", key.geth_DM_CREATE_BASE_TBL());
				}
				if(msgKeyType.containsKeyColumn("u_OPTION_ID") && key.getu_OPTION_ID() != null) {
					msgKey.setKeyValue("u_OPTION_ID", key.getu_OPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_FIX") && key.getSCDL_ISSUE_TOTAL_FIX() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_TOTAL_FIX", key.getSCDL_ISSUE_TOTAL_FIX());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_NOFIX") && key.getSCDL_ISSUE_TOTAL_NOFIX() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_TOTAL_NOFIX", key.getSCDL_ISSUE_TOTAL_NOFIX());
				}
				if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_FIX") && key.getSCDL_RCV_TOTAL_FIX() != null) {
					msgKey.setKeyValue("SCDL_RCV_TOTAL_FIX", key.getSCDL_RCV_TOTAL_FIX());
				}
				if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_NOFIX") && key.getSCDL_RCV_TOTAL_NOFIX() != null) {
					msgKey.setKeyValue("SCDL_RCV_TOTAL_NOFIX", key.getSCDL_RCV_TOTAL_NOFIX());
				}
				if(msgKeyType.containsKeyColumn("SORT_NO") && key.getSORT_NO() != null) {
					msgKey.setKeyValue("SORT_NO", key.getSORT_NO());
				}
				if(msgKeyType.containsKeyColumn("DELIVERY_DATE") && key.getDELIVERY_DATE() != null) {
					msgKey.setKeyValue("DELIVERY_DATE", key.getDELIVERY_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSIDE_ODR_QTY") && key.getINSIDE_ODR_QTY() != null) {
					msgKey.setKeyValue("INSIDE_ODR_QTY", key.getINSIDE_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY") && key.getINTEGRATE_ODR_QTY() != null) {
					msgKey.setKeyValue("INTEGRATE_ODR_QTY", key.getINTEGRATE_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEMAND_QTY") && key.getDEMAND_QTY() != null) {
					msgKey.setKeyValue("DEMAND_QTY", key.getDEMAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ODR_QTY") && key.getSTOCK_ODR_QTY() != null) {
					msgKey.setKeyValue("STOCK_ODR_QTY", key.getSTOCK_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ADD_SUBTRACT") && key.getADD_SUBTRACT() != null) {
					msgKey.setKeyValue("ADD_SUBTRACT", key.getADD_SUBTRACT());
				}
				if(msgKeyType.containsKeyColumn("EFFECT_STOCK_QTY") && key.getEFFECT_STOCK_QTY() != null) {
					msgKey.setKeyValue("EFFECT_STOCK_QTY", key.getEFFECT_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("PURCHASE_UNIT") && key.getPURCHASE_UNIT() != null) {
					msgKey.setKeyValue("PURCHASE_UNIT", key.getPURCHASE_UNIT());
				}
				if(msgKeyType.containsKeyColumn("NUMBER_STATUS") && key.getNUMBER_STATUS() != null) {
					msgKey.setKeyValue("NUMBER_STATUS", key.getNUMBER_STATUS());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ORDER_NO") && key.getPARENT_ORDER_NO() != null) {
					msgKey.setKeyValue("PARENT_ORDER_NO", key.getPARENT_ORDER_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NO") && key.getPARENT_ORDER_ITEM_NO() != null) {
					msgKey.setKeyValue("PARENT_ORDER_ITEM_NO", key.getPARENT_ORDER_ITEM_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NAME") && key.getPARENT_ORDER_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ORDER_ITEM_NAME", key.getPARENT_ORDER_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEMAND_NO") && key.getDEMAND_NO() != null) {
					msgKey.setKeyValue("DEMAND_NO", key.getDEMAND_NO());
				}
				if(msgKeyType.containsKeyColumn("ORDER_NO") && key.getORDER_NO() != null) {
					msgKey.setKeyValue("ORDER_NO", key.getORDER_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("GNR") && key.getGNR() != null) {
					msgKey.setKeyValue("GNR", key.getGNR());
				}
				if(msgKeyType.containsKeyColumn("NUMBER_GNR_TYP") && key.getNUMBER_GNR_TYP() != null) {
					msgKey.setKeyValue("NUMBER_GNR_TYP", key.getNUMBER_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("GNR_TYP") && key.getGNR_TYP() != null) {
					msgKey.setKeyValue("GNR_TYP", key.getGNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("w_PKG_UNIT_QTY") && key.getw_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("w_PKG_UNIT_QTY", key.getw_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP());
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
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("M_WH_PLANT_CD") && key.getM_WH_PLANT_CD() != null) {
					msgKey.setKeyValue("M_WH_PLANT_CD", key.getM_WH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_LT") && key.getTRANSPORT_LT() != null) {
					msgKey.setKeyValue("TRANSPORT_LT", key.getTRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("FIX_ODR_QTY") && key.getFIX_ODR_QTY() != null) {
					msgKey.setKeyValue("FIX_ODR_QTY", key.getFIX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNOFFICIAL_ODR_QTY") && key.getUNOFFICIAL_ODR_QTY() != null) {
					msgKey.setKeyValue("UNOFFICIAL_ODR_QTY", key.getUNOFFICIAL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEPOT_QTY") && key.getDEPOT_QTY() != null) {
					msgKey.setKeyValue("DEPOT_QTY", key.getDEPOT_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_DEPOT_CTL_NO") && key.getODR_DEPOT_CTL_NO() != null) {
					msgKey.setKeyValue("ODR_DEPOT_CTL_NO", key.getODR_DEPOT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_CHARACTERISTIC") && key.getODR_CHARACTERISTIC() != null) {
					msgKey.setKeyValue("ODR_CHARACTERISTIC", key.getODR_CHARACTERISTIC());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_ENV_FLG") && key.getw_ENV_FLG() != null) {
					msgKey.setKeyValue("w_ENV_FLG", key.getw_ENV_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CHECK_FLG") && key.getw_CHECK_FLG() != null) {
					msgKey.setKeyValue("w_CHECK_FLG", key.getw_CHECK_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_QTY_FLG") && key.getw_QTY_FLG() != null) {
					msgKey.setKeyValue("w_QTY_FLG", key.getw_QTY_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_LOG_MODE_TYP") && key.getw_LOG_MODE_TYP() != null) {
					msgKey.setKeyValue("w_LOG_MODE_TYP", key.getw_LOG_MODE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTPUT_MODE_TYP") && key.getw_OUTPUT_MODE_TYP() != null) {
					msgKey.setKeyValue("w_OUTPUT_MODE_TYP", key.getw_OUTPUT_MODE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_PROGRAM_CD") && key.getw_PROGRAM_CD() != null) {
					msgKey.setKeyValue("w_PROGRAM_CD", key.getw_PROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_FUNCTION_NAME") && key.getw_FUNCTION_NAME() != null) {
					msgKey.setKeyValue("w_FUNCTION_NAME", key.getw_FUNCTION_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_LT") && key.getw_SHIP_LT() != null) {
					msgKey.setKeyValue("w_SHIP_LT", key.getw_SHIP_LT());
				}
				if(msgKeyType.containsKeyColumn("w_CLASS_CODE") && key.getw_CLASS_CODE() != null) {
					msgKey.setKeyValue("w_CLASS_CODE", key.getw_CLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_CD") && key.getw_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("w_PARENT_ITEM_CD", key.getw_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMP_ITEM_CD") && key.getw_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("w_COMP_ITEM_CD", key.getw_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_CD") && key.getODR_CD() != null) {
					msgKey.setKeyValue("ODR_CD", key.getODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY_ZH") && key.getINTEGRATE_ODR_QTY_ZH() != null) {
					msgKey.setKeyValue("INTEGRATE_ODR_QTY_ZH", key.getINTEGRATE_ODR_QTY_ZH());
				}
				if(msgKeyType.containsKeyColumn("DEPOT_CTL_NO") && key.getDEPOT_CTL_NO() != null) {
					msgKey.setKeyValue("DEPOT_CTL_NO", key.getDEPOT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("w_UNCONFIRM_FLG") && key.getw_UNCONFIRM_FLG() != null) {
					msgKey.setKeyValue("w_UNCONFIRM_FLG", key.getw_UNCONFIRM_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_DM_CREATE_BASE_TBL") && key.getw_DM_CREATE_BASE_TBL() != null) {
					msgKey.setKeyValue("w_DM_CREATE_BASE_TBL", key.getw_DM_CREATE_BASE_TBL());
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
					AG0050010Struct key = new AG0050010Struct();
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_3")) {
						key.setSTOCK_UNIT_3(msgKey.getKeyValue("STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_1")) {
						key.setSTOCK_UNIT_1(msgKey.getKeyValue("STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_4")) {
						key.setSTOCK_UNIT_4(msgKey.getKeyValue("STOCK_UNIT_4"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL")) {
						key.setSCDL_ISSUE_TOTAL(msgKey.getKeyValue("SCDL_ISSUE_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_2")) {
						key.setSTOCK_UNIT_2(msgKey.getKeyValue("STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL")) {
						key.setSCDL_RCV_TOTAL(msgKey.getKeyValue("SCDL_RCV_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_5")) {
						key.setSTOCK_UNIT_5(msgKey.getKeyValue("STOCK_UNIT_5"));
					}
					if(msgKeyType.containsKeyColumn("rdoItemCd")) {
						key.setrdoItemCd(msgKey.getKeyValue("rdoItemCd"));
					}
					if(msgKeyType.containsKeyColumn("rdoParentItemCd")) {
						key.setrdoParentItemCd(msgKey.getKeyValue("rdoParentItemCd"));
					}
					if(msgKeyType.containsKeyColumn("rdoCompItemCd")) {
						key.setrdoCompItemCd(msgKey.getKeyValue("rdoCompItemCd"));
					}
					if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_NAME")) {
						key.setw_PARENT_ITEM_NAME(msgKey.getKeyValue("w_PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_COMP_ITEM_NAME")) {
						key.setw_COMP_ITEM_NAME(msgKey.getKeyValue("w_COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("checkMrpFlg")) {
						key.setcheckMrpFlg(msgKey.getKeyValue("checkMrpFlg"));
					}
					if(msgKeyType.containsKeyColumn("checkProdPlan")) {
						key.setcheckProdPlan(msgKey.getKeyValue("checkProdPlan"));
					}
					if(msgKeyType.containsKeyColumn("checkUncnfm")) {
						key.setcheckUncnfm(msgKey.getKeyValue("checkUncnfm"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("checkQty")) {
						key.setcheckQty(msgKey.getKeyValue("checkQty"));
					}
					if(msgKeyType.containsKeyColumn("h_DM_CREATE_BASE_TBL")) {
						key.seth_DM_CREATE_BASE_TBL(msgKey.getKeyValue("h_DM_CREATE_BASE_TBL"));
					}
					if(msgKeyType.containsKeyColumn("u_OPTION_ID")) {
						key.setu_OPTION_ID(msgKey.getKeyValue("u_OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_FIX")) {
						key.setSCDL_ISSUE_TOTAL_FIX(msgKey.getKeyValue("SCDL_ISSUE_TOTAL_FIX"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_TOTAL_NOFIX")) {
						key.setSCDL_ISSUE_TOTAL_NOFIX(msgKey.getKeyValue("SCDL_ISSUE_TOTAL_NOFIX"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_FIX")) {
						key.setSCDL_RCV_TOTAL_FIX(msgKey.getKeyValue("SCDL_RCV_TOTAL_FIX"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_RCV_TOTAL_NOFIX")) {
						key.setSCDL_RCV_TOTAL_NOFIX(msgKey.getKeyValue("SCDL_RCV_TOTAL_NOFIX"));
					}
					if(msgKeyType.containsKeyColumn("SORT_NO")) {
						key.setSORT_NO(msgKey.getKeyValue("SORT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DELIVERY_DATE")) {
						key.setDELIVERY_DATE(msgKey.getKeyValue("DELIVERY_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSIDE_ODR_QTY")) {
						key.setINSIDE_ODR_QTY(msgKey.getKeyValue("INSIDE_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY")) {
						key.setINTEGRATE_ODR_QTY(msgKey.getKeyValue("INTEGRATE_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEMAND_QTY")) {
						key.setDEMAND_QTY(msgKey.getKeyValue("DEMAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ODR_QTY")) {
						key.setSTOCK_ODR_QTY(msgKey.getKeyValue("STOCK_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ADD_SUBTRACT")) {
						key.setADD_SUBTRACT(msgKey.getKeyValue("ADD_SUBTRACT"));
					}
					if(msgKeyType.containsKeyColumn("EFFECT_STOCK_QTY")) {
						key.setEFFECT_STOCK_QTY(msgKey.getKeyValue("EFFECT_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PURCHASE_UNIT")) {
						key.setPURCHASE_UNIT(msgKey.getKeyValue("PURCHASE_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("NUMBER_STATUS")) {
						key.setNUMBER_STATUS(msgKey.getKeyValue("NUMBER_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ORDER_NO")) {
						key.setPARENT_ORDER_NO(msgKey.getKeyValue("PARENT_ORDER_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NO")) {
						key.setPARENT_ORDER_ITEM_NO(msgKey.getKeyValue("PARENT_ORDER_ITEM_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ORDER_ITEM_NAME")) {
						key.setPARENT_ORDER_ITEM_NAME(msgKey.getKeyValue("PARENT_ORDER_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEMAND_NO")) {
						key.setDEMAND_NO(msgKey.getKeyValue("DEMAND_NO"));
					}
					if(msgKeyType.containsKeyColumn("ORDER_NO")) {
						key.setORDER_NO(msgKey.getKeyValue("ORDER_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("GNR")) {
						key.setGNR(msgKey.getKeyValue("GNR"));
					}
					if(msgKeyType.containsKeyColumn("NUMBER_GNR_TYP")) {
						key.setNUMBER_GNR_TYP(msgKey.getKeyValue("NUMBER_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("GNR_TYP")) {
						key.setGNR_TYP(msgKey.getKeyValue("GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_PKG_UNIT_QTY")) {
						key.setw_PKG_UNIT_QTY(msgKey.getKeyValue("w_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(msgKey.getKeyValue("w_UNIT_QTY_TYP"));
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
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("M_WH_PLANT_CD")) {
						key.setM_WH_PLANT_CD(msgKey.getKeyValue("M_WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_LT")) {
						key.setTRANSPORT_LT(msgKey.getKeyValue("TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("FIX_ODR_QTY")) {
						key.setFIX_ODR_QTY(msgKey.getKeyValue("FIX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNOFFICIAL_ODR_QTY")) {
						key.setUNOFFICIAL_ODR_QTY(msgKey.getKeyValue("UNOFFICIAL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEPOT_QTY")) {
						key.setDEPOT_QTY(msgKey.getKeyValue("DEPOT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_DEPOT_CTL_NO")) {
						key.setODR_DEPOT_CTL_NO(msgKey.getKeyValue("ODR_DEPOT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CHARACTERISTIC")) {
						key.setODR_CHARACTERISTIC(msgKey.getKeyValue("ODR_CHARACTERISTIC"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(msgKey.getKeyValue("w_MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_ENV_FLG")) {
						key.setw_ENV_FLG(msgKey.getKeyValue("w_ENV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CHECK_FLG")) {
						key.setw_CHECK_FLG(msgKey.getKeyValue("w_CHECK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_QTY_FLG")) {
						key.setw_QTY_FLG(msgKey.getKeyValue("w_QTY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_LOG_MODE_TYP")) {
						key.setw_LOG_MODE_TYP(msgKey.getKeyValue("w_LOG_MODE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTPUT_MODE_TYP")) {
						key.setw_OUTPUT_MODE_TYP(msgKey.getKeyValue("w_OUTPUT_MODE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_PROGRAM_CD")) {
						key.setw_PROGRAM_CD(msgKey.getKeyValue("w_PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_FUNCTION_NAME")) {
						key.setw_FUNCTION_NAME(msgKey.getKeyValue("w_FUNCTION_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_LT")) {
						key.setw_SHIP_LT(msgKey.getKeyValue("w_SHIP_LT"));
					}
					if(msgKeyType.containsKeyColumn("w_CLASS_CODE")) {
						key.setw_CLASS_CODE(msgKey.getKeyValue("w_CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("w_PARENT_ITEM_CD")) {
						key.setw_PARENT_ITEM_CD(msgKey.getKeyValue("w_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMP_ITEM_CD")) {
						key.setw_COMP_ITEM_CD(msgKey.getKeyValue("w_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CD")) {
						key.setODR_CD(msgKey.getKeyValue("ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INTEGRATE_ODR_QTY_ZH")) {
						key.setINTEGRATE_ODR_QTY_ZH(msgKey.getKeyValue("INTEGRATE_ODR_QTY_ZH"));
					}
					if(msgKeyType.containsKeyColumn("DEPOT_CTL_NO")) {
						key.setDEPOT_CTL_NO(msgKey.getKeyValue("DEPOT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_UNCONFIRM_FLG")) {
						key.setw_UNCONFIRM_FLG(msgKey.getKeyValue("w_UNCONFIRM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_DM_CREATE_BASE_TBL")) {
						key.setw_DM_CREATE_BASE_TBL(msgKey.getKeyValue("w_DM_CREATE_BASE_TBL"));
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
