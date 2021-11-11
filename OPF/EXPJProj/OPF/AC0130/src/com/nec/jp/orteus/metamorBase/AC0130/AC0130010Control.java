/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0130/src/com/nec/jp/orteus/metamorBase/AC0130/AC0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0130;

import com.nec.jp.orteus.metamorBase.AC0130.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AC0130010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2014/11/05 07:03:24 $
 *
 */
//}}user_implement_code_header

public class AC0130010Control
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
	public AC0130010Struct getListvalue(int x) { return (AC0130010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AC0130010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AC0130010Struct createStruct() { return new AC0130010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AC0130010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

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

	/** ���Ԃ̌v�Z�Ώە\�������� �Ώ� */
	public String _expectObject = null;

	/**
	 * ���Ԃ̗\��\��������擾
	 * 
	 * @param p
	 *            SYS_PARAMETER�A�N�Z�b�T
	 */
	private boolean getExpectString(PrivateConfig p) {
		try {
			if((_expectObject = p.getString("JOB_ODR_EXPECT_OBJECT")) == null)
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * ���Ԃ̌v�Z�Ώە\��������쐬
	 * 
	 * @param JobOdrExpectFlg
	 * @return ���Ԃ̌v�Z�Ώ� �쐬���s��null
	 */
	private String makeExpectString(int JobOdrExpectFlg) {
		if (_expectObject == null)
			return null;
		String expect = null;
		if (JobOdrExpectFlg == 1)
			expect = _expectObject;
		else
			expect = new String("");
		return expect;
	}
   
   // -----------------------------------------------------------------------------
	/**
     * ��ʃG���[���b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
     sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
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
     * �o�b�`�����N���X���Ăяo��
     *
     * @param userID ���[�UID
     * @param plantTyp �����敪�i�H��w��^�C�v�j
     * @param plantCd �H��R�[�h
     * @return �Ȃ�
     */
    private void executeBatchProgram(String userID, String jobOdrCd, String plantCd) throws Exception {

			// �o�b�`���������s���� -------------------------------------------
			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				// �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
				ExpjMessage emsg = new ExpjMessage("ZZ09010", new String[0]);
				msgStruct.addError(emsg);
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				// �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
				ExpjMessage emsg = new ExpjMessage("ZZ09012", new String[0]);
				msgStruct.addError(emsg);
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				// "�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)"
				ExpjMessage emsg = new ExpjMessage("ZZ09011", new String[0]);
				msgStruct.addError(emsg);
			}

			// �S�Ă̒�`��񂪎擾�ł��Ă���΁A���������s����B
			if ((javaPath != null) && (ClassPath != null)
					&& (batchPath != null)) {

				// ���v�ʓW�J���[�h���H��w��̏ꍇ
				String mrpExpMode = "2";
//				String cmd = "";
//				cmd = cmd + javaPath; // �i�u�l
//				cmd = cmd + " -cp ";
//				cmd = cmd + ClassPath; // Java ClassPath
//				cmd = cmd + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//				cmd = cmd + batchPath; // D:/OrteusStudio/lib/logging.properties";
//				// // �N���ݒ�
//				cmd = cmd + " " + "com.nec.jp.orteus.metamorBase.AC0140.AC0140B001.mainAC0140B001"; // �Ăяo����N���X
//				cmd = cmd + " " + userID; // ���[�UID
//				cmd = cmd + " " + mrpExpMode; // ���v�ʓW�J���[�h
//				cmd = cmd + " " + jobOdrCd; // ����
//				cmd = cmd + " " + plantCd; // �H��R�[�h
//
//				Runtime runtime = Runtime.getRuntime();
//				Process p = runtime.exec(cmd);

				List buffer = new ArrayList();
				buffer.add(javaPath);            // �i�u�l
				buffer.add("-cp");
				buffer.add(ClassPath);          // Java ClassPath
				buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // �N���ݒ�
				buffer.add("com.nec.jp.orteus.metamorBase.AC0140.AC0140B001.mainAC0140B001"); // �Ăяo����N���X
				buffer.add(userID);             //  ���[�UID
				buffer.add(mrpExpMode);         // ���v�ʓW�J���[�h
				buffer.add(jobOdrCd);           // ����
				buffer.add(plantCd);            // �H��R�[�h

				// �o�b�`�������s
				Runtime runtime = Runtime.getRuntime();
				runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
				//
				/*
				 * // ��Q���m�F�p�B�Ăяo�����v���O�������Ď����A�W���o�͂��擾����B // �^�p���̓R�����g�A�E�g����B
				 * BufferedReader brE = new BufferedReader(new
				 * InputStreamReader(p. getErrorStream())); BufferedReader brO =
				 * new BufferedReader(new InputStreamReader(p.
				 * getInputStream())); String s; while ( (s = brO.readLine()) !=
				 * null) { } while ( (s = brE.readLine()) != null) { } //
				 */

				// �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
				// AlarmMessage almMsg = new AlarmMessage("ZZ09013", new
				// String[0]);
				// msgStruct.getInfo().add(almMsg.getMessage());
				ExpjMessage emsg = new ExpjMessage("ZZ09013", new String[0]);
				msgStruct.addInfo(emsg);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		try {
			// �Ǎ��O�̏�Ԃ̏�����
            setReadStatus(INITIAL);
            setList(null);
            //���ԏ�ԋ敪�̏�����
            struct.setInC1_JOB_ODR_STS_TYP("");
            struct.setInC2_JOB_ODR_STS_TYP("");
            struct.setInC3_JOB_ODR_STS_TYP("");
            struct.setInC4_JOB_ODR_STS_TYP("");
            struct.setInC5_JOB_ODR_STS_TYP("");
            struct.setInC9_JOB_ODR_STS_TYP("");
            
            //���Ԏ���̏�����
            struct.setInC1_JOB_ODR_CANCEL("");
            struct.setInC2_JOB_ODR_CANCEL("");
            
            //���Ԕԍ��̑��݃`�F�b�N
            if (!"".equals(struct.getJOB_ODR_CD())){
            	if(!entity.mCHK_T_JOB_ODR.check(conn, struct)){
            		setErrorMessage("AD00029");
            		setList(null);
            		return;
            	}
            }
            //���Ԏ���̃`�F�b�N
            if (!"".equals(struct.getJOB_ODR_CD())){
            	if(!entity.mCHK_T_JOB_ODR.check(conn, struct)){
            		setErrorMessage("AD00029");
            		setList(null);
            		return;
            	}
            }
            //�i�ڔԍ��̑��݃`�F�b�N
            if (!"".equals(struct.getITEM_CD())){
            	if(!entity.mCHK_M_ITEM.check(conn, struct)){
            		setErrorMessage("AC00220");
            		setList(null);
            		return;
            	}
            }
            //���H��ݒ�
            struct.setsys_PLANT_CD(this.sysPLANT_CD);
            
            //���ԏ�ԋ敪�ݒ�
            if("true".equals(struct.getc1_JOB_ODR_STS())){
            	//1:���v�ʌv�Z���Ώ�
            	struct.setInC1_JOB_ODR_STS_TYP("1");
            }
            if("true".equals(struct.getc2_JOB_ODR_STS())){
            	//2:���v�ʌv�Z�Ώ�
            	struct.setInC2_JOB_ODR_STS_TYP("2");
            }
            if("true".equals(struct.getc3_JOB_ODR_STS())){
            	//3:�W�J�ς�
            	struct.setInC3_JOB_ODR_STS_TYP("3");
            }
            if("true".equals(struct.getc4_JOB_ODR_STS())){
            	//4:���ʕi�ڊm��ς�
            	struct.setInC4_JOB_ODR_STS_TYP("4");
            }
            if("true".equals(struct.getc5_JOB_ODR_STS())){
            	//5:���i�ڊm��ς�
            	struct.setInC5_JOB_ODR_STS_TYP("5");
            }
            if("true".equals(struct.getc9_JOB_ODR_STS())){
            	//9:����
            	struct.setInC9_JOB_ODR_STS_TYP("9");
            }
            
            
            //���Ԏ���̐ݒ�
            if("true".equals(struct.getc1_JOB_ODR_CANCEL())){
            	//1:�����
            	struct.setInC1_JOB_ODR_CANCEL("0");
            }
            if("true".equals(struct.getc2_JOB_ODR_CANCEL())){
            	//2:����ς�
            	struct.setInC2_JOB_ODR_CANCEL("1");
            }
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else {
				struct.setROW_COUNT(null);
		    }
			List WorkList = entity.mselectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AC0130010Struct)WorkList.get(0)).getl_COUNT());
			//�f�[�^�����݂��Ȃ��ꍇ
            if (rowCount==0){
				setErrorMessage("ZZ06001");
				if(list!=null && list.size()>0){
				   setList(null);
				}
				setReadStatus(NOT_FOUND);
				return;
            }
            // �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
          	if ((maxLine != 0) && (rowCount== maxLine + 1)) {
            	setErrorMessage("ZZ01115", String.valueOf(maxLine));
            	if(list!=null && list.size()>0){
 				   setList(null);
 				}
            	setReadStatus(TOO_MANY);
            	return;
          	}
            //�Ǎ�����
            WorkList = entity.mselect.read(conn, struct);
          	//�f�[�^�̕\������
          	for (int i=0;i<WorkList.size();i++){
          		AC0130010Struct WorkStruct = (AC0130010Struct)WorkList.get(i);
          		//�敪���̐ݒ�
          		WorkStruct.setl_JOB_ODR_NAME(this.multcombo("JOB_ODR_TYP",WorkStruct.getl_JOB_ODR_TYP()));
          		WorkStruct.setl_JOB_ODR_STS_NAME(this.multcombo("JOB_ODR_STS_TYP",WorkStruct.getl_JOB_ODR_STS_TYP()));
          		WorkStruct.setl_PLAN_NAME(this.multcombo("PLAN_TYP",WorkStruct.getl_PLAN_TYP()));
          		//���v�ʃ����e�t���O�̃`�F�b�N
          		WorkStruct.setsys_PLANT_CD(this.sysPLANT_CD);
          		if (entity.mSYS_JOB_OD_CALC_CTRL.check(conn, WorkStruct)){
          			WorkStruct.setJobOdrExpectFlg("1");
          		}
          		// �Čv�Z�̐ݒ�
          		WorkStruct.setl_JobOdrExpect(makeExpectString(Integer
						.parseInt(WorkStruct.getJobOdrExpectFlg())));
          	}
          	//�������ʂ̕\��
          	setList(WorkList);
      		setReadStatus(NORMAL);
			
		} catch(Exception e) {
			setReadStatus(ERROR);	
			e.printStackTrace();
			// �G���[�������L�q���܂�
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(emsg);

			throw ee;
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			setList(null);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���v�ʌv�Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlMRP() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlMRP");
			//{{user_implement_dev:<controlMRP>
			//struct.setJOB_ODR_CD(struct.getl_JOB_ODR_CD());
		try{
			executeBatchProgram(sysUSER_CD, struct.getl_JOB_ODR_CD(), sysPLANT_CD);
		} catch (Exception e) {
			// �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
			ExpjMessage emsg = new ExpjMessage("ZZ09016", new String[0]);
			msgStruct.addError(emsg);
		}
			
                //}}user_implement_dev:<controlMRP>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlMRP");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		setReadStatus(INITIAL);
		
		PrivateConfig privateConfig = new PrivateConfig(conn);
		// ���Ԃ̌v�Z�Ώە\���p������擾
		if (getExpectString(privateConfig) == false) {
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(emsg);

			throw ee;
		}
/*
 * // �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B try{
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
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0130");
		logger.entering("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		try{	
			ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			ComboStruct JOB_ODR_TYP = comboController.getData("JOB_ODR_TYP");
			struct.setList_JOB_ODR_TYP_val(JOB_ODR_TYP.getValList());
			struct.getList_JOB_ODR_TYP_val().add(0, "0");
			struct.setList_JOB_ODR_TYP_name(JOB_ODR_TYP.getExplanList());
			struct.getList_JOB_ODR_TYP_name().add(0, "");
		}catch(Exception e){
			e.printStackTrace();
			ExpjException ee = new ExpjException(e,"ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("MRP") ) {
				controlMRP();
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
//			throw new FoundationException("AC0130010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0130010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0130010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0130010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0130010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0130010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0130010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0130010Entity entity;
	protected AC0130010Struct struct;
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

		entity = new AC0130010Entity();
		struct = new AC0130010Struct();

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
	 * AC0130010�N���X�̕W���R���X�g���N�^
	 */
	public AC0130010Control() throws BusinessProcessException, FoundationException
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
				AC0130010Struct key = (AC0130010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("c1_JOB_ODR_STS") && key.getc1_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c1_JOB_ODR_STS", key.getc1_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c4_JOB_ODR_STS") && key.getc4_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c4_JOB_ODR_STS", key.getc4_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c2_JOB_ODR_STS") && key.getc2_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c2_JOB_ODR_STS", key.getc2_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c5_JOB_ODR_STS") && key.getc5_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c5_JOB_ODR_STS", key.getc5_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c3_JOB_ODR_STS") && key.getc3_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c3_JOB_ODR_STS", key.getc3_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("c9_JOB_ODR_STS") && key.getc9_JOB_ODR_STS() != null) {
					msgKey.setKeyValue("c9_JOB_ODR_STS", key.getc9_JOB_ODR_STS());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_NAME") && key.getl_JOB_ODR_STS_NAME() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_NAME", key.getl_JOB_ODR_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_NAME") && key.getl_JOB_ODR_NAME() != null) {
					msgKey.setKeyValue("l_JOB_ODR_NAME", key.getl_JOB_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PLAN_NAME") && key.getl_PLAN_NAME() != null) {
					msgKey.setKeyValue("l_PLAN_NAME", key.getl_PLAN_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_JobOdrExpect") && key.getl_JobOdrExpect() != null) {
					msgKey.setKeyValue("l_JobOdrExpect", key.getl_JobOdrExpect());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name") && key.getJOB_ODR_TYP_name() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_name", key.getJOB_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val") && key.getJOB_ODR_TYP_val() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_val", key.getJOB_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c1_JOB_ODR_CANCEL") && key.getc1_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("c1_JOB_ODR_CANCEL", key.getc1_JOB_ODR_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("c2_JOB_ODR_CANCEL") && key.getc2_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("c2_JOB_ODR_CANCEL", key.getc2_JOB_ODR_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY") && key.getl_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l_JOB_ODR_QTY", key.getl_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP") && key.getl_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_STS_TYP", key.getl_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP") && key.getl_JOB_ODR_TYP() != null) {
					msgKey.setKeyValue("l_JOB_ODR_TYP", key.getl_JOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PLAN_TYP") && key.getl_PLAN_TYP() != null) {
					msgKey.setKeyValue("l_PLAN_TYP", key.getl_PLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DEL_FLG") && key.getl_JOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DEL_FLG", key.getl_JOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_ENABLE_QTY") && key.getl_ALCD_ENABLE_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_ENABLE_QTY", key.getl_ALCD_ENABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("JobOdrExpectFlg") && key.getJobOdrExpectFlg() != null) {
					msgKey.setKeyValue("JobOdrExpectFlg", key.getJobOdrExpectFlg());
				}
				if(msgKeyType.containsKeyColumn("sys_PLANT_CD") && key.getsys_PLANT_CD() != null) {
					msgKey.setKeyValue("sys_PLANT_CD", key.getsys_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_FROM") && key.getJOB_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_FROM", key.getJOB_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TO") && key.getJOB_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_TO", key.getJOB_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_STS_TYP") && key.getInC1_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC1_JOB_ODR_STS_TYP", key.getInC1_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_STS_TYP") && key.getInC2_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC2_JOB_ODR_STS_TYP", key.getInC2_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC3_JOB_ODR_STS_TYP") && key.getInC3_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC3_JOB_ODR_STS_TYP", key.getInC3_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC4_JOB_ODR_STS_TYP") && key.getInC4_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC4_JOB_ODR_STS_TYP", key.getInC4_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC5_JOB_ODR_STS_TYP") && key.getInC5_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC5_JOB_ODR_STS_TYP", key.getInC5_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC9_JOB_ODR_STS_TYP") && key.getInC9_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC9_JOB_ODR_STS_TYP", key.getInC9_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_CANCEL") && key.getInC1_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("InC1_JOB_ODR_CANCEL", key.getInC1_JOB_ODR_CANCEL());
				}
				if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_CANCEL") && key.getInC2_JOB_ODR_CANCEL() != null) {
					msgKey.setKeyValue("InC2_JOB_ODR_CANCEL", key.getInC2_JOB_ODR_CANCEL());
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
					AC0130010Struct key = new AC0130010Struct();
					if(msgKeyType.containsKeyColumn("c1_JOB_ODR_STS")) {
						key.setc1_JOB_ODR_STS(msgKey.getKeyValue("c1_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c4_JOB_ODR_STS")) {
						key.setc4_JOB_ODR_STS(msgKey.getKeyValue("c4_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c2_JOB_ODR_STS")) {
						key.setc2_JOB_ODR_STS(msgKey.getKeyValue("c2_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c5_JOB_ODR_STS")) {
						key.setc5_JOB_ODR_STS(msgKey.getKeyValue("c5_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c3_JOB_ODR_STS")) {
						key.setc3_JOB_ODR_STS(msgKey.getKeyValue("c3_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("c9_JOB_ODR_STS")) {
						key.setc9_JOB_ODR_STS(msgKey.getKeyValue("c9_JOB_ODR_STS"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_NAME")) {
						key.setl_JOB_ODR_STS_NAME(msgKey.getKeyValue("l_JOB_ODR_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_NAME")) {
						key.setl_JOB_ODR_NAME(msgKey.getKeyValue("l_JOB_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PLAN_NAME")) {
						key.setl_PLAN_NAME(msgKey.getKeyValue("l_PLAN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_JobOdrExpect")) {
						key.setl_JobOdrExpect(msgKey.getKeyValue("l_JobOdrExpect"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name")) {
						key.setJOB_ODR_TYP_name(msgKey.getKeyValue("JOB_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val")) {
						key.setJOB_ODR_TYP_val(msgKey.getKeyValue("JOB_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c1_JOB_ODR_CANCEL")) {
						key.setc1_JOB_ODR_CANCEL(msgKey.getKeyValue("c1_JOB_ODR_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("c2_JOB_ODR_CANCEL")) {
						key.setc2_JOB_ODR_CANCEL(msgKey.getKeyValue("c2_JOB_ODR_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY")) {
						key.setl_JOB_ODR_QTY(msgKey.getKeyValue("l_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_STS_TYP")) {
						key.setl_JOB_ODR_STS_TYP(msgKey.getKeyValue("l_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP")) {
						key.setl_JOB_ODR_TYP(msgKey.getKeyValue("l_JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PLAN_TYP")) {
						key.setl_PLAN_TYP(msgKey.getKeyValue("l_PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DEL_FLG")) {
						key.setl_JOB_ODR_DEL_FLG(msgKey.getKeyValue("l_JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_ENABLE_QTY")) {
						key.setl_ALCD_ENABLE_QTY(msgKey.getKeyValue("l_ALCD_ENABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JobOdrExpectFlg")) {
						key.setJobOdrExpectFlg(msgKey.getKeyValue("JobOdrExpectFlg"));
					}
					if(msgKeyType.containsKeyColumn("sys_PLANT_CD")) {
						key.setsys_PLANT_CD(msgKey.getKeyValue("sys_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_FROM")) {
						key.setJOB_ODR_DLV_DATE_FROM(msgKey.getKeyValue("JOB_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TO")) {
						key.setJOB_ODR_DLV_DATE_TO(msgKey.getKeyValue("JOB_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_STS_TYP")) {
						key.setInC1_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC1_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_STS_TYP")) {
						key.setInC2_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC2_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC3_JOB_ODR_STS_TYP")) {
						key.setInC3_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC3_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC4_JOB_ODR_STS_TYP")) {
						key.setInC4_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC4_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC5_JOB_ODR_STS_TYP")) {
						key.setInC5_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC5_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC9_JOB_ODR_STS_TYP")) {
						key.setInC9_JOB_ODR_STS_TYP(msgKey.getKeyValue("InC9_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InC1_JOB_ODR_CANCEL")) {
						key.setInC1_JOB_ODR_CANCEL(msgKey.getKeyValue("InC1_JOB_ODR_CANCEL"));
					}
					if(msgKeyType.containsKeyColumn("InC2_JOB_ODR_CANCEL")) {
						key.setInC2_JOB_ODR_CANCEL(msgKey.getKeyValue("InC2_JOB_ODR_CANCEL"));
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
