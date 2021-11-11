/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0010/src/com/nec/jp/orteus/metamorBase/AJ0010/AJ0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0010;

import com.nec.jp.orteus.metamorBase.AJ0010.*;
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AJ0010010Control
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
	public AJ0010010Struct getListvalue(int x) { return (AJ0010010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AJ0010010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AJ0010010Struct createStruct() { return new AJ0010010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AJ0010010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	/** ��ʑJ�ڃL�[(�H��R�[�h) */
	private String _plantCd;
	/** ��ʑJ�ڃL�[(�i�ڔԍ�) */
	private String _itemCd;
	/** ��ʑJ�ڃL�[(�����[���@FROM) */
	private String _prdDueDateFrom;
	/** ��ʑJ�ڃL�[(�����[���@TO) */
	private String _prdDueDateTo;

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@���O��敪�i�i���Ǘ��p�j */
	private final static String J_OUTSIDE_TYP_PARAMETER_NAME= "J_OUTSIDE_TYP";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@���O��敪 */
	private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�i���X�e�[�^�X�i�I�[�_�ʐi���ꗗ�p�j */
	private final static String PROGRESS_STS_ODR_PARAMETER_NAME= "PROGRESS_STS_ODR";

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�I�[�_��ԋ敪 */
	private final static String ODR_STS_TYP_PARAMETER_NAME= "ODR_STS_TYP";	

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�i�ڎ�z�敪 */
	private final static String MRP_ODR_TYP_PARAMETER_NAME= "MRP_ODR_TYP";	
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@���Ԏ�� */
	private final static String JOB_ODR_TYP_PARAMETER_NAME= "JOB_ODR_TYP";	
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@���v�ʔ��������敪 */
	private final static String OD_GNR_TYP_PARAMETER_NAME= "OD_GNR_TYP";	
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@���O��敪 */
	private ComboStruct OUTSIDE_TYP = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�i���X�e�[�^�X�i�I�[�_�ʐi���ꗗ�p�j */
	private ComboStruct PROGRESS_STS_ODR = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@���O��敪�i�i���Ǘ��p�j */
	private ComboStruct J_OUTSIDE_TYP = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�I�[�_��ԋ敪 */
	private ComboStruct ODR_STS_TYP = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�i�ڎ�z�敪 */
	private ComboStruct MRP_ODR_TYP = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@���Ԏ�� */
	private ComboStruct JOB_ODR_TYP = null;
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@���v�ʔ��������敪 */
	private ComboStruct OD_GNR_TYP = null;
	
	/** CSV�f�[�^���X�g */
	private List csvList = null;
	
	/**
	* ��ʑJ�ڃL�[(�H��R�[�h)�擾
	* @return �H��R�[�h
	*/
	public String getPlantCd() {
		return _plantCd;
	}
	/**
	* ��ʑJ�ڃL�[(�H��R�[�h)�ݒ�
	* @param cd �H��R�[�h
	*/
	public void setPlantCd(String cd) {
		_plantCd = cd;
	}
	/**
	* ��ʑJ�ڃL�[(�i�ڔԍ�)�擾
	* @return �i�ڔԍ�
	*/
	public String getItemCd() {
		return _itemCd;
	}
	/**
	* ��ʑJ�ڃL�[(�i�ڔԍ�)�ݒ�
	* @param cd �i�ڔԍ�
	*/
	public void setItemCd(String cd) {
		_itemCd = cd;
	}
	/**
	* ��ʑJ�ڃL�[(�����[�� FROM)�擾
	* @return �����[�� FROM
	*/
	public String getPrdDueDateFrom() {
		return _prdDueDateFrom;
	}
	/**
	* ��ʑJ�ڃL�[(�����[�� FROM)�ݒ�
	* @param cd �����[�� FROM
	*/
	public void setPrdDueDateFrom(String cd) {
		_prdDueDateFrom = cd;
	}
	/**
	* ��ʑJ�ڃL�[(�����[�� TO)�擾
	* @return �����[�� TO
	*/
	public String getPrdDueDateTo() {
		return _prdDueDateTo;
	}
	/**
	* ��ʑJ�ڃL�[(�����[�� TO)�ݒ�
	* @param cd �����[�� TO
	*/
	public void setPrdDueDateTo(String cd) {
		_prdDueDateTo = cd;
	}
		
	/**
	* �����̐���
	* @param ���t����
	* @param ���t����
	*/
	private String formatHM(String inDate){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
			if(inDate.length() < 16){
				return inDate ;
			}
			return inDate.replaceAll("00:00","     ");					
	}
	
	/**
	 * ���������̐ݒ�
	 */
	private void setSearchCondition() {
		
		// �f�[�^�����N���A
		struct.setl_PRD_DUE_DATE_FROM(null);
	  struct.setl_PRD_DUE_DATE_TO(null);
	  struct.setl_PRD_START_DATE_FROM(null);
		struct.setl_PRD_START_DATE_TO(null);
		struct.setl_PRD_DUE_DATE_FROM_ZERO(null);
	  struct.setl_PRD_DUE_DATE_TO_ZERO(null);
	  struct.setl_PRD_START_DATE_FROM_ZERO(null);
		struct.setl_PRD_START_DATE_TO_ZERO(null);
		
		// �\���Ώ�
		struct.setMRP_ODR_TYP_1(null);
		struct.setMRP_ODR_TYP_2(null);
		struct.setMRP_ODR_TYP_3(null);
		struct.setMRP_ODR_TYP_4(null);
		struct.setMRP_ODR_TYP_5(null);
		struct.setMRP_ODR_TYP_6(null);
		struct.setMRP_ODR_TYP_7(null);
		struct.setMRP_ODR_TYP_8(null);
		if (struct.getr1_MRP_ODR_TYP().equals("true")) {
			// �u�l�q�o�I�[�_�v��I��
			struct.setMRP_ODR_TYP_4("4");
			struct.setMRP_ODR_TYP_5("5");
			struct.setMRP_ODR_TYP_6("6");
			struct.setMRP_ODR_TYP_7("7");
		} else if (struct.getr2_MRP_ODR_TYP().equals("true")) {
			// �u���ԃI�[�_�v��I��
			struct.setMRP_ODR_TYP_1("1");
			struct.setMRP_ODR_TYP_2("2");
		} else if (struct.getr3_MRP_ODR_TYP().equals("true")) {
			// �u�S�āv��I��
			struct.setMRP_ODR_TYP_1("1");
			struct.setMRP_ODR_TYP_2("2");
			struct.setMRP_ODR_TYP_4("4");
			struct.setMRP_ODR_TYP_5("5");
			struct.setMRP_ODR_TYP_6("6");
			struct.setMRP_ODR_TYP_7("7");
		}
		
		// �i���X�e�[�^�X
		// �u�x�ꂠ��v�`�F�b�N�{�b�N�X�̓��͒l
		struct.setODR_STS_TYP_9_DELAYED(null);
		if (struct.getc1_PROGRESS_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_9_DELAYED("9");
			struct.setDELAY_TYP("1");
		} else {
			struct.setDELAY_TYP("2");
		}
		// �u�x��Ȃ��v�`�F�b�N�{�b�N�X�̓��͒l
		struct.setODR_STS_TYP_9_NOT_DELAYED(null);
		if (struct.getc2_PROGRESS_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_9_NOT_DELAYED("9");
			struct.setNOT_DELAY_TYP("1");
		} else {
			struct.setNOT_DELAY_TYP("2");
		}
		
		// �I�[�_��ԋ敪
		struct.setODR_STS_TYP_1(null);
		struct.setODR_STS_TYP_2(null);
		struct.setODR_STS_TYP_9(null);
		// �u�v��i�������j�v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc1_ODR_STS_TYP() != null 
				&& struct.getc1_ODR_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_1("1");
		}
		// �u�m��i�����j�v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc2_ODR_STS_TYP() != null 
				&& struct.getc2_ODR_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_2("2");
		}
		// �u�����v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc3_ODR_STS_TYP() != null 
				&& struct.getc3_ODR_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_9("9");
		}
		
		// ���o�����i���t�̐ݒ�j
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			// �����[���iFrom�j
			if(null == struct.getPRD_DUE_DATE_FROM() || "".equals(struct.getPRD_DUE_DATE_FROM())){
			  struct.setl_PRD_DUE_DATE_FROM(null);
		  }else{
				// �����ݒ�
				if(null == struct.getPRD_DUE_TIME_FROM() || "".equals(struct.getPRD_DUE_TIME_FROM())){
			    struct.setl_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " 00:00");
				}else{
				  struct.setPRD_DUE_TIME_FROM(AppendZero(struct.getPRD_DUE_TIME_FROM(),4));
			    struct.setl_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " " + 
			                                  struct.getPRD_DUE_TIME_FROM().substring(0,2) + ":" + 
			                                  struct.getPRD_DUE_TIME_FROM().substring(2));
				}
		  }
		  // �����[���iTo�j
		  if(null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
		    struct.setl_PRD_DUE_DATE_TO(null);
			}else{
				// �����ݒ�
				if(null == struct.getPRD_DUE_TIME_TO() || "".equals(struct.getPRD_DUE_TIME_TO())){
				  struct.setl_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
				}else{
				  struct.setPRD_DUE_TIME_TO(AppendZero(struct.getPRD_DUE_TIME_TO(),4));
			    struct.setl_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " " + 
			                                struct.getPRD_DUE_TIME_TO().substring(0,2) + ":" + 
			                                struct.getPRD_DUE_TIME_TO().substring(2));
				}
		  }
		  // ���������(From)
			if(null == struct.getPRD_START_DATE_FROM() || "".equals(struct.getPRD_START_DATE_FROM())){
				struct.setl_PRD_START_DATE_FROM(null);
			}else{
				// �����ݒ�
				if(null == struct.getPRD_START_TIME_FROM() || "".equals(struct.getPRD_START_TIME_FROM())){
					struct.setl_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " 00:00");
				}else{
				  struct.setPRD_START_TIME_FROM(AppendZero(struct.getPRD_START_TIME_FROM(),4));
					struct.setl_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " " + 
					                                struct.getPRD_START_TIME_FROM().substring(0,2) + ":" + 
					                                struct.getPRD_START_TIME_FROM().substring(2));
				}
		  }
		  // ���������(To)
			if(null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setl_PRD_START_DATE_TO(null);
			}else{
				// �����ݒ�
				if(null == struct.getPRD_START_TIME_TO() || "".equals(struct.getPRD_START_TIME_TO())){
					struct.setl_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
				}else{
				  struct.setPRD_START_TIME_TO(AppendZero(struct.getPRD_START_TIME_TO(),4));
					struct.setl_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " " + 
					                              struct.getPRD_START_TIME_TO().substring(0,2) + ":" + 
					                              struct.getPRD_START_TIME_TO().substring(2));
				}
		  }
	  }else{
			struct.setl_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
			if(null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
		  	struct.setl_PRD_DUE_DATE_TO(null);
			}else{
		  	struct.setl_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
			}
		  struct.setl_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM());
			if(null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setl_PRD_START_DATE_TO(null);
			}else{
				struct.setl_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
			}
	  }
	}
	/**
	 * �����̐ݒ�
	 * @param  input    ����String
	 * @param  cnt      ����
	 * @return String   ���Ƀ[���𖄂߂�
	 */
	private String AppendZero(String input,int cnt){
	  int nCount = cnt - input.length() ;
	  for(int i = 1; i <= nCount;i++)
	  {
	  	input = "0" + input;
	  }
	  return input;
	}
	/**
	 * �i���X�e�[�^�X�̐ݒ�
	 * @param aStruct �i���X�e�[�^�X��ݒ肷��Struct
	 * @exception ParseException �i���X�e�[�^�X�ݒ菈�����ɃG���[�����������ꍇ
	 */
	private void setProgressStatus(AJ0010010Struct aStruct) 
			throws ExpjException {
		try {
			String progressStatus = "";
			String progressStatusDisplayName = "";
			Date oprDate = null;
			Date prdDueDate = null;
			oprDate = Converter.strToDate(aStruct.getl_BUSINESS_OPR_DATE(), Converter.SLASH_DATE);
			prdDueDate = Converter.strToDate(aStruct.getl_PRD_DUE_DATE(), Converter.SLASH_DATE);
			
			if (aStruct.getMRP_TYP().intValue() == 3) {
				// �폜
				progressStatus = "2";
				progressStatusDisplayName = getDisplayName(PROGRESS_STS_ODR, progressStatus);
			} else {
				if (aStruct.getl_ODR_STS_TYP().intValue() != 9 
						&& oprDate.compareTo(prdDueDate) > 0) {
					// �x�ꂠ��
					progressStatus = "1";
					progressStatusDisplayName = getDisplayName(PROGRESS_STS_ODR, progressStatus);
				} else {
					// �x��Ȃ��A�܂��́A����
					progressStatus = "0";
					progressStatusDisplayName = "";
				}
			}
			aStruct.setl_PROGRESS_STATUS(progressStatus);
			aStruct.setl_PROGRESS_STATUS_DN(progressStatusDisplayName);
		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			throw new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		}
	}
	
	/**
	 * ���O��敪�̐ݒ�
	 * @param aStruct ���O��敪��ݒ肷��Struct
	 */
	private void setOutsideTyp(AJ0010010Struct aStruct) {
		String displayName = "";  // �R���{�{�b�N�X�f�[�^�\���p
		int workInProcQty = 0;
		int rlsdPuchOdrQty = 0;
		workInProcQty = Integer.parseInt(aStruct.getl_WORK_IN_PROC_QTY());
		rlsdPuchOdrQty = Integer.parseInt(aStruct.getl_RLSD_PUCH_ODR_QTY());
		
		// �I�[�_�f�}���h�ԍ��̑��݃`�F�b�N
		if (rlsdPuchOdrQty > 0 || workInProcQty > 0) {
			// ���O��敪�i�i���Ǘ��p�j
			if (rlsdPuchOdrQty > 0 && workInProcQty > 0) {
				// �����c�E�i�ڕʎd�|�ɑ��݂���
				displayName = getDisplayName(J_OUTSIDE_TYP, "9");
			} else if (rlsdPuchOdrQty > 0) {
				// �����c�̂ݑ��݂���
				displayName = getDisplayName(J_OUTSIDE_TYP, "2");
			} else if (workInProcQty > 0) {
				// �i�ڕʎd�|�̂ݑ��݂���
				displayName = getDisplayName(J_OUTSIDE_TYP, "1");
			} else {
				displayName = null;
			}
			aStruct.setl_OUTSIDE_TYP_DN(displayName);
		} else {
			// ���O��敪
			displayName = getDisplayName(OUTSIDE_TYP, aStruct.getOUTSIDE_TYP().toString());
			aStruct.setl_OUTSIDE_TYP_DN(displayName);
		}
	}
	
	private void othercomboTyp(AJ0010010Struct aStruct) {
		
		aStruct.setl_ODR_STS_TYP_DN(getDisplayName(ODR_STS_TYP, aStruct.getl_ODR_STS_TYP().toString()));
		aStruct.setl_MRP_ODR_TYP_DN(getDisplayName(MRP_ODR_TYP, aStruct.getl_MRP_ODR_TYP().toString()));
		if(aStruct.getJOB_ODR_TYP()!=null){
			aStruct.setl_JOB_ODR_TYP_DN(getDisplayName(JOB_ODR_TYP, aStruct.getJOB_ODR_TYP().toString()));
		}
		aStruct.setl_OD_GNR_TYP_DN(getDisplayName(OD_GNR_TYP, aStruct.getOD_GNR_TYP().toString()));
		
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
	 * �����������K�؂��ۂ����`�F�b�N����
	 * @return �����������K�؂ł����true�A�����łȂ����false
	 */
	 private boolean checkSearchCondition() {
		boolean isCheckboxDelayedChecked = false;
		boolean isCheckboxNotDelayedChecked = false;
		boolean isCheckboxNotEffectiveChecked = false;
		boolean isCheckboxEffectiveChecked = false;
		boolean isCheckboxCompletedChecked = false;
		boolean result = true;
		
		// �i���X�e�[�^�X
		// �u�x�ꂠ��v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc1_PROGRESS_STS_TYP() != null 
				&& struct.getc1_PROGRESS_STS_TYP().equals("true")) {
			isCheckboxDelayedChecked = true;
		}
		
		// �u�x��Ȃ��v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc2_PROGRESS_STS_TYP() != null 
				&& struct.getc2_PROGRESS_STS_TYP().equals("true")) {
			isCheckboxNotDelayedChecked = true;
		}
		
		// �I�[�_��ԋ敪
		// �u�v��i�������j�v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc1_ODR_STS_TYP() != null 
				&& struct.getc1_ODR_STS_TYP().equals("true")) {
			isCheckboxNotEffectiveChecked = true;
		}
		// �u�m��i�����j�v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc2_ODR_STS_TYP() != null 
				&& struct.getc2_ODR_STS_TYP().equals("true")) {
			isCheckboxEffectiveChecked = true;
		}
		// �u�����v�`�F�b�N�{�b�N�X�̓��͒l
		if (struct.getc3_ODR_STS_TYP() != null 
				&& struct.getc3_ODR_STS_TYP().equals("true")) {
			isCheckboxCompletedChecked = true;
		}
		
		struct.setl_DELAY_BASE_DATE(null);
		struct.setl_NOT_DELAY_BASE_DATE(null);
		// �u�x�ꂠ��v�A�u�x��Ȃ��v�Ƀ`�F�b�N���Ȃ��ꍇ
		if (isCheckboxDelayedChecked == false 
				&& isCheckboxNotDelayedChecked == false) {
			if (isCheckboxCompletedChecked == false) {
				// �u�����v�Ƀ`�F�b�N���Ȃ��ꍇ
				result = false;
			} else {
				// �u�v��i�������j�v�A�u�m��i�����j�v�̌��������𖳌��ɂ���
				struct.setODR_STS_TYP_1(null);
				struct.setODR_STS_TYP_2(null);
				// �u�x�ꂠ��v�u�x��Ȃ��v�̌��������𖳌��ɂ���
				struct.setl_DELAY_BASE_DATE("0001-01-01");
				struct.setl_NOT_DELAY_BASE_DATE("9999-12-31");
			}
		} else {
			if (isCheckboxNotEffectiveChecked == false 
					&& isCheckboxEffectiveChecked == false) {
				// �u�x�ꂠ��v�̌��������𖳌�
				struct.setODR_STS_TYP_9_DELAYED(null);
				struct.setl_DELAY_BASE_DATE("0001-01-01");
				// �u�x��Ȃ��v�̌��������𖳌�
				struct.setODR_STS_TYP_9_NOT_DELAYED(null);
				struct.setl_NOT_DELAY_BASE_DATE("9999-12-31");
			} else {
				if (isCheckboxDelayedChecked == true 
						&& isCheckboxNotDelayedChecked == false) {
					// �u�x��Ȃ��v�̌��������𖳌�
					struct.setl_NOT_DELAY_BASE_DATE("9999-12-31");
					struct.setODR_STS_TYP_9_NOT_DELAYED(null);
				} else if (isCheckboxDelayedChecked == false 
						&& isCheckboxNotDelayedChecked == true) {
					// �u�x�ꂠ��v�̌��������𖳌�
					struct.setODR_STS_TYP_9_DELAYED(null);
					struct.setl_DELAY_BASE_DATE("0001-01-01");
				}
			}
		}
		
		// �u�v��i�������j�v�A�u�m��i�����j�v�A�u�����v�Ƀ`�F�b�N���Ȃ��ꍇ
		if (isCheckboxNotEffectiveChecked == false
				&& isCheckboxEffectiveChecked == false
				&& isCheckboxCompletedChecked == false) {
			result = false;
		}
		
		return result;
	}

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
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W(List)
	 */
	private void setErrorMessage(String code, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		String keyMessage = "";

		try {
			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}
			
			if (csvList != null) {
				csvList.clear();
			} else {
				csvList = new ArrayList(0);
			}
			
			struct.setDOWNLOAD_FILE(null);
			readStatus = INITIAL;
			struct.setPLANT_NAME(null);
			// �ϐ���`
			AJ0010010Struct aStruct = null;
			ExpjMessage emsg = null;
			int maxLine = 0;
			//�H��R�[�h���݃`�F�b�N
			if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
				List tmpList = entity.mM_PLANT.read(conn, struct);
				if (tmpList.size() <= 0 ) {
					//�f�[�^�����݂��Ȃ�
					keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
					setErrorMessage("ZZ09028", keyMessage);
					return;
				} else {
					AJ0010010Struct checkStruct = (AJ0010010Struct)tmpList.get(0);
					struct.setPLANT_NAME(checkStruct.getPLANT_NAME());
				}
			}
			// ���������̐ݒ�
			setSearchCondition();
			
			// �����������`�F�b�N����
			if (checkSearchCondition() == false) {
				if (list != null) {
					list.clear();
				} else {
					list = new ArrayList(0);
				}
				// �������ʂ�0���ł�
				emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				
				readStatus = NOT_FOUND;
				
				return;
			}
			// �\���ő�s����������
			maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			List viewList = entity.mV_ODR_PROG_LSTCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AJ0010010Struct)viewList.get(0)).getl_COUNT());
			if (rowCount== 0) {
				// �Ǎ��������s�F�������ʂ�0���ł�
				emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = NOT_FOUND;
				if(list!=null && list.size()>0){
					list.clear();
				}
				return;
			}
			if(maxLine != 0 && rowCount == maxLine + 1){
				
				// �Ǎ��������s�F�������ʂ��ő�s�𒴂��Ă��܂��B
				emsg = new ExpjMessage("ZZ01115", "" + maxLine);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = TOO_MANY;
				if(list!=null && list.size()>0){
					list.clear();
				}
				return;
				
			}
			viewList = entity.mV_ODR_PROG_LST.read(conn, struct);
			csvList = viewList;
			setList(viewList);
			for (int i = 0; i < list.size(); i++) {
				aStruct = (AJ0010010Struct)list.get(i);
					
				// �i���X�e�[�^�X
				setProgressStatus(aStruct);
					
				// ���O��敪
				setOutsideTyp(aStruct);
					
				//���̑��R���{�{�b�N�X�̎擾
				othercomboTyp(aStruct);
					

			}
			
			readStatus = NORMAL;
			
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			throw new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		List csvList = new ArrayList();
		String[] title = {
			"Expj.Cmt0436" ,
			"Expj.ODR_STS_TYP" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.OUTSIDE_TYP" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.PLANT_CD" ,
			"Expj.PRD_DUE_DATE" ,
			"Expj.PRD_START_DATE" ,
			"Expj.ODR_START_DATE" ,
			"Expj.ODR_QTY_2" ,
			"Expj.TOTAL_RCV_QTY_2" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.RCV_CMPLT_DATE_1" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.JOB_ODR_CANCEL_NO" ,
			"Expj.JOB_ODR_TYP" ,
			"Expj.ALC_GRP_CD" ,
			"Expj.OD_GNR_TYP" ,
			"Expj.Cmt0434" 
		};
		csvList.add(title);
		
		for (Iterator i = this.csvList.iterator(); i.hasNext();) {
			AJ0010010Struct csvStruct = (AJ0010010Struct) i.next();
			String[] csvStr = new String[title.length];
			csvStr[0] = csvStruct.getl_PROGRESS_STATUS_DN();
			csvStr[1] = csvStruct.getl_ODR_STS_TYP_DN();
			csvStr[2] = csvStruct.getl_ITEM_CD();
			csvStr[3] = csvStruct.getl_ITEM_NAME();
			csvStr[4] = csvStruct.getl_OUTSIDE_TYP_DN();
			csvStr[5] = csvStruct.getl_MRP_ODR_TYP_DN();
			csvStr[6] = csvStruct.getl_PLANT_CD();
			csvStr[7] = csvStruct.getl_PRD_DUE_DATE();
			csvStr[8] = csvStruct.getl_PRD_START_DATE();
			csvStr[9] = csvStruct.getl_ODR_START_DATE();
			csvStr[10] = csvStruct.getl_ODR_QTY();
			csvStr[11] = csvStruct.getl_TOTAL_RCV_QTY();
			csvStr[12] = csvStruct.getl_STOCK_UNIT();
			csvStr[13] = csvStruct.getl_RCV_CMPLT_DATE();
			csvStr[14] = csvStruct.getl_JOB_ODR_CD();
			csvStr[15] = csvStruct.getl_JOB_ODR_CANCEL_NO();
			csvStr[16] = csvStruct.getl_JOB_ODR_TYP_DN();
			csvStr[17] = csvStruct.getl_ALC_GRP_CD();
			csvStr[18] = csvStruct.getl_OD_GNR_TYP_DN();
			csvStr[19] = csvStruct.getl_EXTERNAL_PLAN_CD();
			csvList.add(csvStr);
		}
		if (csvList != null && !csvList.isEmpty()) {
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	  try{
			readStatus = INITIAL;
			
			if (list != null) {
				list.clear();
			}
			if (csvList != null) {
				csvList.clear();
			}
			
			// struct�̃N���A
			struct.clear();

			// �H��R�[�h���f�t�H���g�\��
			struct.setPLANT_CD(getsysPLANT_CD());

			// ��ʍ��ڂ̏�����
			// �\���Ώ�
			struct.setr1_MRP_ODR_TYP("true");
			struct.setr2_MRP_ODR_TYP(null);
			struct.setr3_MRP_ODR_TYP(null);
			struct.setPRD_DUE_DATE_FROM(null);
			struct.setPRD_DUE_DATE_TO(null);
			struct.setPRD_START_DATE_FROM(null);
			struct.setPRD_START_DATE_TO(null);
			struct.setJOB_ODR_CD(null);
			struct.setITEM_CD(null);
			struct.setl_PRD_DUE_DATE_FROM(null);
		  struct.setl_PRD_DUE_DATE_TO(null);
		  struct.setl_PRD_START_DATE_FROM(null);
			struct.setl_PRD_START_DATE_TO(null);
			struct.setl_PRD_DUE_DATE_FROM_ZERO(null);
		  struct.setl_PRD_DUE_DATE_TO_ZERO(null);
		  struct.setl_PRD_START_DATE_FROM_ZERO(null);
			struct.setl_PRD_START_DATE_TO_ZERO(null);
			struct.setPRD_DUE_TIME_FROM(null);
			struct.setPRD_DUE_TIME_TO(null);
			struct.setPRD_START_TIME_FROM(null);
			struct.setPRD_START_TIME_TO(null);
			// �i���X�e�[�^�X
			struct.setc1_PROGRESS_STS_TYP("true"); // �x�ꂠ��
			struct.setc2_PROGRESS_STS_TYP(null);   // �x��Ȃ�
			// �I�[�_��ԋ敪
			struct.setc1_ODR_STS_TYP(null);    // �v��i�������j
			struct.setc2_ODR_STS_TYP("true");  // �m��i�����j
			struct.setc3_ODR_STS_TYP(null);    // ����
			
			
			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AJ0010010Struct TIME_CTRLStruct = new AJ0010010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AJ0010010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
		} catch(SQLException e) {
			e.printStackTrace(); 
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ���ԕʐi���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlJobOdrProgLst() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgLst");
			//{{user_implement_dev:<controlJobOdrProgLst>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlJobOdrProgLst>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgLst");

		return;
	}

	/**
	 * ��Ǝw���i���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlWorkProgLst() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlWorkProgLst");
			//{{user_implement_dev:<controlWorkProgLst>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlWorkProgLst>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlWorkProgLst");

		return;
	}

	/**
	 * �����w���i���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPuchProgLst() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPuchProgLst");
			//{{user_implement_dev:<controlPuchProgLst>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlPuchProgLst>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPuchProgLst");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			readStatus = INITIAL;
			struct.setDOWNLOAD_FILE(null);
			
			// ��ʍ��ڂ̏�����
			
			// �H��R�[�h���f�t�H���g�\��
			struct.setPLANT_CD(getsysPLANT_CD());
							
			// �\���Ώ�
			struct.setr1_MRP_ODR_TYP("true");
			struct.setr2_MRP_ODR_TYP(null);
			struct.setr3_MRP_ODR_TYP(null);
			struct.setPRD_DUE_DATE_FROM(null);
			struct.setPRD_DUE_DATE_TO(null);
			struct.setPRD_START_DATE_FROM(null);
			struct.setPRD_START_DATE_TO(null);
			struct.setJOB_ODR_CD(null);
			struct.setITEM_CD(null);
			struct.setl_PRD_DUE_DATE_FROM(null);
		  struct.setl_PRD_DUE_DATE_TO(null);
		  struct.setl_PRD_START_DATE_FROM(null);
			struct.setl_PRD_START_DATE_TO(null);
			struct.setl_PRD_DUE_DATE_FROM_ZERO(null);
		  struct.setl_PRD_DUE_DATE_TO_ZERO(null);
		  struct.setl_PRD_START_DATE_FROM_ZERO(null);
			struct.setl_PRD_START_DATE_TO_ZERO(null);
			struct.setPRD_DUE_TIME_FROM(null);
			struct.setPRD_DUE_TIME_TO(null);
			struct.setPRD_START_TIME_FROM(null);
			struct.setPRD_START_TIME_TO(null);
			
			// �i���X�e�[�^�X
			struct.setc1_PROGRESS_STS_TYP("true"); // �x�ꂠ��
			struct.setc2_PROGRESS_STS_TYP(null);   // �x��Ȃ�
			// �I�[�_��ԋ敪
			struct.setc1_ODR_STS_TYP(null);    // �v��i�������j
			struct.setc2_ODR_STS_TYP("true");  // �m��i�����j
			struct.setc3_ODR_STS_TYP(null);    // ����
			
			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			AJ0010010Struct TIME_CTRLStruct = new AJ0010010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AJ0010010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
			
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				struct.setPRD_DUE_DATE_FROM(_prdDueDateFrom);
				struct.setPRD_DUE_DATE_TO(_prdDueDateTo);
				struct.setPLANT_CD(_plantCd);
				struct.setITEM_CD(_itemCd);

				// �i���X�e�[�^�X
				struct.setc1_PROGRESS_STS_TYP("true"); // �x�ꂠ��
				struct.setc2_PROGRESS_STS_TYP("true");   // �x��Ȃ�
				// �I�[�_��ԋ敪
				struct.setc1_ODR_STS_TYP("true");    // �v��i�������j
				struct.setc2_ODR_STS_TYP("true");  // �m��i�����j
				struct.setc3_ODR_STS_TYP("true");    // ����

				controlSelect();
			}

			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			try {
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
				PROGRESS_STS_ODR = comboController.getData(PROGRESS_STS_ODR_PARAMETER_NAME);
				J_OUTSIDE_TYP = comboController.getData(J_OUTSIDE_TYP_PARAMETER_NAME);
				ODR_STS_TYP = comboController.getData(ODR_STS_TYP_PARAMETER_NAME);
				MRP_ODR_TYP = comboController.getData(MRP_ODR_TYP_PARAMETER_NAME);
				JOB_ODR_TYP = comboController.getData(JOB_ODR_TYP_PARAMETER_NAME);
				OD_GNR_TYP = comboController.getData(OD_GNR_TYP_PARAMETER_NAME);			
				
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("JobOdrProgLst") ) {
				controlJobOdrProgLst();
			} else if( button.equals("WorkProgLst") ) {
				controlWorkProgLst();
			} else if( button.equals("PuchProgLst") ) {
				controlPuchProgLst();
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
//			throw new FoundationException("AJ0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AJ0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AJ0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AJ0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AJ0010010Entity entity;
	protected AJ0010010Struct struct;
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

		entity = new AJ0010010Entity();
		struct = new AJ0010010Struct();

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
	 * AJ0010010�N���X�̕W���R���X�g���N�^
	 */
	public AJ0010010Control() throws BusinessProcessException, FoundationException
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
				AJ0010010Struct key = (AJ0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_MRP_ODR_TYP") && key.getr1_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("r1_MRP_ODR_TYP", key.getr1_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("r2_MRP_ODR_TYP") && key.getr2_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("r2_MRP_ODR_TYP", key.getr2_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("r3_MRP_ODR_TYP") && key.getr3_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("r3_MRP_ODR_TYP", key.getr3_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("c1_PROGRESS_STS_TYP") && key.getc1_PROGRESS_STS_TYP() != null) {
					msgKey.setKeyValue("c1_PROGRESS_STS_TYP", key.getc1_PROGRESS_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM") && key.getPRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM", key.getPRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO") && key.getPRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO", key.getPRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("c2_PROGRESS_STS_TYP") && key.getc2_PROGRESS_STS_TYP() != null) {
					msgKey.setKeyValue("c2_PROGRESS_STS_TYP", key.getc2_PROGRESS_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM") && key.getPRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_START_DATE_FROM", key.getPRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO") && key.getPRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_START_DATE_TO", key.getPRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP") && key.getc1_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c1_ODR_STS_TYP", key.getc1_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_ODR_STS_TYP") && key.getc2_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c2_ODR_STS_TYP", key.getc2_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_ODR_STS_TYP") && key.getc3_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c3_ODR_STS_TYP", key.getc3_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN") && key.getl_PROGRESS_STATUS_DN() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS_DN", key.getl_PROGRESS_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN") && key.getl_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_DN", key.getl_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN") && key.getl_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_DN", key.getl_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN") && key.getl_MRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP_DN", key.getl_MRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP_DN") && key.getl_JOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_JOB_ODR_TYP_DN", key.getl_JOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN") && key.getl_OD_GNR_TYP_DN() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP_DN", key.getl_OD_GNR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS") && key.getl_PROGRESS_STATUS() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS", key.getl_PROGRESS_STATUS().toString());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_FROM") && key.getPRD_DUE_TIME_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME_FROM", key.getPRD_DUE_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_TO") && key.getPRD_DUE_TIME_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME_TO", key.getPRD_DUE_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_TIME_FROM") && key.getPRD_START_TIME_FROM() != null) {
					msgKey.setKeyValue("PRD_START_TIME_FROM", key.getPRD_START_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_TIME_TO") && key.getPRD_START_TIME_TO() != null) {
					msgKey.setKeyValue("PRD_START_TIME_TO", key.getPRD_START_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_START_DATE") && key.getl_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_ODR_START_DATE", key.getl_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE") && key.getl_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE", key.getl_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP") && key.getOD_GNR_TYP() != null) {
					msgKey.setKeyValue("OD_GNR_TYP", key.getOD_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY") && key.getl_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_RCV_QTY", key.getl_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE") && key.getl_RCV_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_RCV_CMPLT_DATE", key.getl_RCV_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG") && key.getEXTERNAL_DM_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_DM_FLG", key.getEXTERNAL_DM_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("l_EXTERNAL_PLAN_CD") && key.getl_EXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("l_EXTERNAL_PLAN_CD", key.getl_EXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY") && key.getl_RLSD_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_RLSD_PUCH_ODR_QTY", key.getl_RLSD_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY") && key.getl_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_QTY", key.getl_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP") && key.getl_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP", key.getl_OPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE") && key.getl_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("l_BUSINESS_OPR_DATE", key.getl_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM") && key.getl_PRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_FROM", key.getl_PRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO") && key.getl_PRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_TO", key.getl_PRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM_ZERO") && key.getl_PRD_DUE_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_FROM_ZERO", key.getl_PRD_DUE_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO_ZERO") && key.getl_PRD_DUE_DATE_TO_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_TO_ZERO", key.getl_PRD_DUE_DATE_TO_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM") && key.getl_PRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_FROM", key.getl_PRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO") && key.getl_PRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_TO", key.getl_PRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM_ZERO") && key.getl_PRD_START_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_FROM_ZERO", key.getl_PRD_START_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO_ZERO") && key.getl_PRD_START_DATE_TO_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_TO_ZERO", key.getl_PRD_START_DATE_TO_ZERO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_1") && key.getODR_STS_TYP_1() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_1", key.getODR_STS_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_2") && key.getODR_STS_TYP_2() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_2", key.getODR_STS_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_DELAYED") && key.getODR_STS_TYP_9_DELAYED() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_9_DELAYED", key.getODR_STS_TYP_9_DELAYED());
				}
				if(msgKeyType.containsKeyColumn("l_DELAY_BASE_DATE") && key.getl_DELAY_BASE_DATE() != null) {
					msgKey.setKeyValue("l_DELAY_BASE_DATE", key.getl_DELAY_BASE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_NOT_DELAYED") && key.getODR_STS_TYP_9_NOT_DELAYED() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_9_NOT_DELAYED", key.getODR_STS_TYP_9_NOT_DELAYED());
				}
				if(msgKeyType.containsKeyColumn("l_NOT_DELAY_BASE_DATE") && key.getl_NOT_DELAY_BASE_DATE() != null) {
					msgKey.setKeyValue("l_NOT_DELAY_BASE_DATE", key.getl_NOT_DELAY_BASE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9") && key.getODR_STS_TYP_9() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_9", key.getODR_STS_TYP_9());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_1") && key.getMRP_ODR_TYP_1() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_1", key.getMRP_ODR_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_2") && key.getMRP_ODR_TYP_2() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_2", key.getMRP_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_3") && key.getMRP_ODR_TYP_3() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_3", key.getMRP_ODR_TYP_3());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_4") && key.getMRP_ODR_TYP_4() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_4", key.getMRP_ODR_TYP_4());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_5") && key.getMRP_ODR_TYP_5() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_5", key.getMRP_ODR_TYP_5());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_6") && key.getMRP_ODR_TYP_6() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_6", key.getMRP_ODR_TYP_6());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_7") && key.getMRP_ODR_TYP_7() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_7", key.getMRP_ODR_TYP_7());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_8") && key.getMRP_ODR_TYP_8() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_8", key.getMRP_ODR_TYP_8());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DELAY_TYP") && key.getDELAY_TYP() != null) {
					msgKey.setKeyValue("DELAY_TYP", key.getDELAY_TYP());
				}
				if(msgKeyType.containsKeyColumn("NOT_DELAY_TYP") && key.getNOT_DELAY_TYP() != null) {
					msgKey.setKeyValue("NOT_DELAY_TYP", key.getNOT_DELAY_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
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
					AJ0010010Struct key = new AJ0010010Struct();
					if(msgKeyType.containsKeyColumn("r1_MRP_ODR_TYP")) {
						key.setr1_MRP_ODR_TYP(msgKey.getKeyValue("r1_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r2_MRP_ODR_TYP")) {
						key.setr2_MRP_ODR_TYP(msgKey.getKeyValue("r2_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r3_MRP_ODR_TYP")) {
						key.setr3_MRP_ODR_TYP(msgKey.getKeyValue("r3_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c1_PROGRESS_STS_TYP")) {
						key.setc1_PROGRESS_STS_TYP(msgKey.getKeyValue("c1_PROGRESS_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM")) {
						key.setPRD_DUE_DATE_FROM(msgKey.getKeyValue("PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO")) {
						key.setPRD_DUE_DATE_TO(msgKey.getKeyValue("PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("c2_PROGRESS_STS_TYP")) {
						key.setc2_PROGRESS_STS_TYP(msgKey.getKeyValue("c2_PROGRESS_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM")) {
						key.setPRD_START_DATE_FROM(msgKey.getKeyValue("PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO")) {
						key.setPRD_START_DATE_TO(msgKey.getKeyValue("PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP")) {
						key.setc1_ODR_STS_TYP(msgKey.getKeyValue("c1_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_ODR_STS_TYP")) {
						key.setc2_ODR_STS_TYP(msgKey.getKeyValue("c2_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_ODR_STS_TYP")) {
						key.setc3_ODR_STS_TYP(msgKey.getKeyValue("c3_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN")) {
						key.setl_PROGRESS_STATUS_DN(msgKey.getKeyValue("l_PROGRESS_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN")) {
						key.setl_ODR_STS_TYP_DN(msgKey.getKeyValue("l_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN")) {
						key.setl_OUTSIDE_TYP_DN(msgKey.getKeyValue("l_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN")) {
						key.setl_MRP_ODR_TYP_DN(msgKey.getKeyValue("l_MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP_DN")) {
						key.setl_JOB_ODR_TYP_DN(msgKey.getKeyValue("l_JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN")) {
						key.setl_OD_GNR_TYP_DN(msgKey.getKeyValue("l_OD_GNR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS")) {
						key.setl_PROGRESS_STATUS(new Integer(msgKey.getKeyValue("l_PROGRESS_STATUS")));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_FROM")) {
						key.setPRD_DUE_TIME_FROM(msgKey.getKeyValue("PRD_DUE_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_TO")) {
						key.setPRD_DUE_TIME_TO(msgKey.getKeyValue("PRD_DUE_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_TIME_FROM")) {
						key.setPRD_START_TIME_FROM(msgKey.getKeyValue("PRD_START_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_TIME_TO")) {
						key.setPRD_START_TIME_TO(msgKey.getKeyValue("PRD_START_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(new Integer(msgKey.getKeyValue("l_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(new Integer(msgKey.getKeyValue("l_MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_START_DATE")) {
						key.setl_ODR_START_DATE(msgKey.getKeyValue("l_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE")) {
						key.setl_PRD_START_DATE(msgKey.getKeyValue("l_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP")) {
						key.setOD_GNR_TYP(new Integer(msgKey.getKeyValue("OD_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY")) {
						key.setl_TOTAL_RCV_QTY(msgKey.getKeyValue("l_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE")) {
						key.setl_RCV_CMPLT_DATE(msgKey.getKeyValue("l_RCV_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG")) {
						key.setEXTERNAL_DM_FLG(new Integer(msgKey.getKeyValue("EXTERNAL_DM_FLG")));
					}
					if(msgKeyType.containsKeyColumn("l_EXTERNAL_PLAN_CD")) {
						key.setl_EXTERNAL_PLAN_CD(msgKey.getKeyValue("l_EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(new Integer(msgKey.getKeyValue("MRP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY")) {
						key.setl_RLSD_PUCH_ODR_QTY(msgKey.getKeyValue("l_RLSD_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY")) {
						key.setl_WORK_IN_PROC_QTY(msgKey.getKeyValue("l_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(new Integer(msgKey.getKeyValue("OD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP")) {
						key.setl_OPR_RSLT_TYP(new Integer(msgKey.getKeyValue("l_OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE")) {
						key.setl_BUSINESS_OPR_DATE(msgKey.getKeyValue("l_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM")) {
						key.setl_PRD_DUE_DATE_FROM(msgKey.getKeyValue("l_PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO")) {
						key.setl_PRD_DUE_DATE_TO(msgKey.getKeyValue("l_PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM_ZERO")) {
						key.setl_PRD_DUE_DATE_FROM_ZERO(msgKey.getKeyValue("l_PRD_DUE_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO_ZERO")) {
						key.setl_PRD_DUE_DATE_TO_ZERO(msgKey.getKeyValue("l_PRD_DUE_DATE_TO_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM")) {
						key.setl_PRD_START_DATE_FROM(msgKey.getKeyValue("l_PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO")) {
						key.setl_PRD_START_DATE_TO(msgKey.getKeyValue("l_PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM_ZERO")) {
						key.setl_PRD_START_DATE_FROM_ZERO(msgKey.getKeyValue("l_PRD_START_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO_ZERO")) {
						key.setl_PRD_START_DATE_TO_ZERO(msgKey.getKeyValue("l_PRD_START_DATE_TO_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_1")) {
						key.setODR_STS_TYP_1(msgKey.getKeyValue("ODR_STS_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_2")) {
						key.setODR_STS_TYP_2(msgKey.getKeyValue("ODR_STS_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_DELAYED")) {
						key.setODR_STS_TYP_9_DELAYED(msgKey.getKeyValue("ODR_STS_TYP_9_DELAYED"));
					}
					if(msgKeyType.containsKeyColumn("l_DELAY_BASE_DATE")) {
						key.setl_DELAY_BASE_DATE(msgKey.getKeyValue("l_DELAY_BASE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_NOT_DELAYED")) {
						key.setODR_STS_TYP_9_NOT_DELAYED(msgKey.getKeyValue("ODR_STS_TYP_9_NOT_DELAYED"));
					}
					if(msgKeyType.containsKeyColumn("l_NOT_DELAY_BASE_DATE")) {
						key.setl_NOT_DELAY_BASE_DATE(msgKey.getKeyValue("l_NOT_DELAY_BASE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9")) {
						key.setODR_STS_TYP_9(msgKey.getKeyValue("ODR_STS_TYP_9"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_1")) {
						key.setMRP_ODR_TYP_1(msgKey.getKeyValue("MRP_ODR_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_2")) {
						key.setMRP_ODR_TYP_2(msgKey.getKeyValue("MRP_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_3")) {
						key.setMRP_ODR_TYP_3(msgKey.getKeyValue("MRP_ODR_TYP_3"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_4")) {
						key.setMRP_ODR_TYP_4(msgKey.getKeyValue("MRP_ODR_TYP_4"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_5")) {
						key.setMRP_ODR_TYP_5(msgKey.getKeyValue("MRP_ODR_TYP_5"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_6")) {
						key.setMRP_ODR_TYP_6(msgKey.getKeyValue("MRP_ODR_TYP_6"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_7")) {
						key.setMRP_ODR_TYP_7(msgKey.getKeyValue("MRP_ODR_TYP_7"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_8")) {
						key.setMRP_ODR_TYP_8(msgKey.getKeyValue("MRP_ODR_TYP_8"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DELAY_TYP")) {
						key.setDELAY_TYP(msgKey.getKeyValue("DELAY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NOT_DELAY_TYP")) {
						key.setNOT_DELAY_TYP(msgKey.getKeyValue("NOT_DELAY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
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
