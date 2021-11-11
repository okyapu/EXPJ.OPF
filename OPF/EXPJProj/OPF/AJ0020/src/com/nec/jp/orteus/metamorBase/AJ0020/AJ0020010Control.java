/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0020/src/com/nec/jp/orteus/metamorBase/AJ0020/AJ0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0020;

import com.nec.jp.orteus.metamorBase.AJ0020.*;
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
import com.nec.jp.orteus.expj.util.PrivateConfig;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * ���ԕʐi���ꗗ�iAJ0020�j
 * 
 * �����@:�@���ԕʂ̐i���ꗗ��\�����܂��B
 * ��Ж�:  NEC�\�t�g
 * 
 * @version 0.01�@2006/06/28�@Ver2.4.2 PJ�����@�񓚔[����ǉ�
 */
//}}user_implement_code_header

public class AJ0020010Control
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
	public List getList() { return this.list; } 					// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AJ0020010Struct getListvalue(int x) { return (AJ0020010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AJ0020010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AJ0020010Struct createStruct() { return new AJ0020010Struct(); } // �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AJ0020010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@���O��敪�i�i���Ǘ��p�j */
	private final static String J_OUTSIDE_TYP_PARAMETER_NAME= "J_OUTSIDE_TYP";

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@���O��敪 */
	private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP";

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�i���X�e�[�^�X�i���ԕʐi���ꗗ�p�j */
	private final static String PROGRESS_STATUS_JOB_PARAMETER_NAME= "PROGRESS_STS_JOB";

	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�W�J���x�� */
	private final static String INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME = "INIT_DISPLAY_PS_LEVEL";

	/** �R���{�{�b�N�X�f�[�^�擾�p�@���O��敪 */
	ComboStruct OUTSIDE_TYP = null;

	/** �R���{�{�b�N�X�f�[�^�擾�p�@�i���X�e�[�^�X�i���ԕʐi���ꗗ�p�j */
	ComboStruct PROGRESS_STATUS_JOB = null;

	/** �R���{�{�b�N�X�f�[�^�擾�p�@���O��敪�i�i���Ǘ��p�j */
	ComboStruct J_OUTSIDE_TYP = null;

	/** ��ʑJ�ڃL�[(����) */
	private String _jobOdrCd;

	/** ��ʑJ�ڃL�[(���Ԏ�������ԍ�) */
	private String _jobOdrCancelNo;

	/** ��ʑJ�ڃL�[(�H��R�[�h) */
	private String _plantCd;

	/** �W�J���x�� */
	private int maxDevelopLevel = 0;

	/**
	 * ��ʑJ�ڃL�[(����)�̐ݒ�
	 * @param cd ����
	 */
	protected void setJobOdrCd(String cd) {
		_jobOdrCd = cd;
	}

	/**
	 * ��ʑJ�ڃL�[(���Ԏ�������ԍ�)�̐ݒ�
	 * @param cd ���Ԏ�������ԍ�
	 */
	protected void setJobOdrCancelNo(String cd) {
		_jobOdrCancelNo = cd;
	}

	/**
	 * ��ʑJ�ڃL�[(�H��R�[�h)�̐ݒ�
	 * @param cd �H��R�[�h
	 */
	protected void setPlantCd(String cd) {
		_plantCd = cd;
	}

	/**
	 * ��ʑJ�ڃL�[(����)�̎擾
	 * @return ����
	 */
	protected String getJobOdrCd() {
		return _jobOdrCd;
	}

	/**
	 * ��ʑJ�ڃL�[(���Ԏ�������ԍ�)�̎擾
	 * @return ���Ԏ�������ԍ�
	 */
	protected String getJobOdrCancelNo() {
		return _jobOdrCancelNo;
	}

	/**
	 * ��ʑJ�ڃL�[(�H��R�[�h)�̎擾
	 * @return �H��R�[�h
	 */
	protected String getPlantCd() {
		return _plantCd;
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
	 * �����������ɐ��W�J�������s��
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param jobOdrCd ����
	 * @param jobOdrCancelNo ���Ԏ�������ԍ�
	 * @param plantCd �H��R�[�h
	 * @param level ���x��
	 * @param emsg �G���[���b�Z�[�W
	 * @exception FoundationException �����������ɃG���[�����������ꍇ
	 * @exception SQLException �����������ɃG���[�����������ꍇ
	 * @exception ParseException �����������ɃG���[�����������ꍇ
	 */
	private void developForward(String odNo, String jobOdrCd,
			String jobOdrCancelNo, String plantCd, int level, ExpjMessage emsg,int maxLine)
			throws FoundationException, SQLException, ParseException {

		AJ0020010Struct aStruct = null;
		AJ0020010Struct childStruct = new AJ0020010Struct();
		List resultList = null;
		//Ver2.4.2 PJ�ǉ����ځ@�񓚔[��----------------------------------------------------------------
		List puchList;
		//Ver2.4.2 PJ�ǉ����ځ@�񓚔[�������܂�---------------------------------------------------------

		// �ő僌�x���ɒB�����ꍇ�͓W�J�I��
		if (level > maxDevelopLevel + 1) {
			return;
		}

		// ���������̐ݒ�
		childStruct.setPARENT_OD_NO(odNo);
		childStruct.setJOB_ODR_CD(jobOdrCd);
		childStruct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
		childStruct.setPLANT_CD(plantCd);

		if(maxLine != 0){
			childStruct.setROW_COUNT(String.valueOf(maxLine));
		}else{
			childStruct.setROW_COUNT(null);
		}
		// ���v�ʂ�����
		if (level == 1) {
			if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("")) {
				resultList = entity.mV_JOB_ODR_PROG_LST_ROOT.read(conn, childStruct);
			} else {
				String targetItemCd = struct.getITEM_CD();
				childStruct.setITEM_CD(targetItemCd);
				resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
				if (resultList.size() > 1) {
					emsg = new ExpjMessage("AJ00020");
					msgStruct.addWarn(emsg);
					sysLog.warning(emsg, sysUSER_CD);
				}
			}
		} else {
			resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
		}

		if( maxLine != 0 && (resultList.size() ==maxLine+1)){
			if(list!=null && list.size()>0){
				list.clear();
			}
			emsg = new ExpjMessage("ZZ01115");
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
			readStatus = TOO_MANY;
			return;
		}
		
		for (int i = 0; i < resultList.size(); i++) {
			aStruct = (AJ0020010Struct)resultList.get(i);
			try{
				aStruct.setl_OD_GNR_TYP_DN(multcombo("OD_GNR_TYP",aStruct.getOD_GNR_TYP().toString()));
				aStruct.setl_ODR_STS_TYP_DN(multcombo("ODR_STS_TYP",aStruct.getl_ODR_STS_TYP().toString()));
				aStruct.setl_DM_STS_TYP_DN(multcombo("DM_STS_TYP",aStruct.getl_DM_STS_TYP().toString()));
				aStruct.setl_MRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",aStruct.getl_MRP_ODR_TYP().toString()));
			}catch(Exception e){
				e.printStackTrace();
			}

			// ���΃��x��
			aStruct.setl_LEVEL(String.valueOf(level));

			// �I�[�_��ԋ敪
			if (aStruct.getl_ODR_STS_TYP().intValue() == 0) {
				aStruct.setl_ODR_STS_TYP_DN(null);
				// �����[����Null��ݒ肷��
				aStruct.setl_PRD_DUE_DATE(null);
			}

			// �f�}���h��ԋ敪
			if (aStruct.getl_DM_STS_TYP().intValue() == 0) {
				aStruct.setl_DM_STS_TYP_DN(null);
				// �v���[����Null��ݒ肷��
				aStruct.setl_DUE_DATE(null);
			}

			// �i���X�e�[�^�X
			setProgressStatus(aStruct);

			// ���O��敪
			setOutsideTyp(aStruct);
			
			//Ver2.4.2 PJ�ǉ����ځ@�񓚔[��
			puchList = entity.mT_RLSD_PUCH_ODR.read(conn, aStruct);
			if(puchList.size() != 0) {
				aStruct.setl_CONFIRM_DLV_DATE(((AJ0020010Struct)(puchList.get(0))).getl_CONFIRM_DLV_DATE());
			}
			puchList = null;
			//Ver2.4.2 PJ�ǉ����ځ@�񓚔[�������܂�---------------------------------------------------------
			
			
			list.add(resultList.get(i));	
			if (maxLine != 0 && list.size() == maxLine+1) {
					if(list!=null && list.size()>0){
						list.clear();
					}
					emsg = new ExpjMessage("ZZ01115");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					readStatus = TOO_MANY;
					return;
				}
			readStatus = NORMAL;
			

			// ���v�ʏ����敪���u3:�폜�v�ȊO�̏ꍇ�A���ʃ��x���̓W�J���s��
			if (aStruct.getMRP_TYP().intValue() != 3) {
				developForward(aStruct.getl_OD_NO(), jobOdrCd,
						jobOdrCancelNo, aStruct.getPLANT_CD(), level + 1, emsg,maxLine);
			}
		
		    if (readStatus == TOO_MANY) {
			    return;
		    }
	   }
	}
	

	/**
	 * �����������ɋt�W�J�������s��
	 * @param parentOdNo �e�I�[�_�f�}���h�ԍ�
	 * @param jobOdrCd ����
	 * @param jobOdrCancelNo ���Ԏ�������ԍ�
	 * @param plantCd �H��R�[�h
	 * @param level ���x��
	 * @param emsg �G���[���b�Z�[�W
	 * @exception FoundationException �����������ɃG���[�����������ꍇ
	 * @exception SQLException �����������ɃG���[�����������ꍇ
	 * @exception ParseException �����������ɃG���[�����������ꍇ
	 */
	private void developReverse(String parentOdNo, String jobOdrCd,
			String jobOdrCancelNo, String plantCd, int level, ExpjMessage emsg,int maxLine)
			throws FoundationException, SQLException, ParseException {

		AJ0020010Struct aStruct = null;
		AJ0020010Struct childStruct = new AJ0020010Struct();
		List resultList = null;
		//Ver2.4.2 PJ�ǉ����ځ@�񓚔[��----------------------------------------------------------------
		List puchList;
		//Ver2.4.2 PJ�ǉ����ځ@�񓚔[�������܂�---------------------------------------------------------

		// �ő僌�x���ɒB�����ꍇ�͓W�J�I��
		if (level > maxDevelopLevel  + 1) {
			return;
		}

		// ���������̐ݒ�
		childStruct.setOD_NO(parentOdNo);
		childStruct.setJOB_ODR_CD(jobOdrCd);
		childStruct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
		childStruct.setPLANT_CD(plantCd);
		
        if(maxLine != 0){
        	childStruct.setROW_COUNT(String.valueOf(maxLine));
        }else{
        	childStruct.setROW_COUNT(null);
        }
		// ���v�ʂ�����
		if (level == 1) {
			if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("")) {
				resultList = entity.mV_JOB_ODR_PROG_LST_ROOT.read(conn, childStruct);
			} else {
				String targetItemCd = struct.getITEM_CD();
				childStruct.setITEM_CD(targetItemCd);
				resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
				if (resultList.size() > 1) {
					emsg = new ExpjMessage("AJ00020");
					msgStruct.addWarn(emsg);
					sysLog.warning(emsg, sysUSER_CD);
				}
			}
		} else {
			resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
		}

		if( maxLine != 0 && (resultList.size() ==maxLine+1)){
			if(list!=null && list.size()>0){
				list.clear();
			}
			emsg = new ExpjMessage("ZZ01115");
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
			readStatus = TOO_MANY;
			return;
		}
		
		for (int i = 0; i < resultList.size(); i++) {
			aStruct = (AJ0020010Struct)resultList.get(i);
			try{
				aStruct.setl_OD_GNR_TYP_DN(multcombo("OD_GNR_TYP",aStruct.getOD_GNR_TYP().toString()));
				aStruct.setl_ODR_STS_TYP_DN(multcombo("ODR_STS_TYP",aStruct.getl_ODR_STS_TYP().toString()));
				aStruct.setl_DM_STS_TYP_DN(multcombo("DM_STS_TYP",aStruct.getl_DM_STS_TYP().toString()));
				aStruct.setl_MRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",aStruct.getl_MRP_ODR_TYP().toString()));
			}catch(Exception e){
				e.printStackTrace();
			}

			// ���΃��x��
			aStruct.setl_LEVEL(String.valueOf(level));

			// �I�[�_��ԋ敪
			if (aStruct.getl_ODR_STS_TYP().intValue() == 0) {
				aStruct.setl_ODR_STS_TYP_DN(null);
				// �����[����Null��ݒ肷��
				aStruct.setl_PRD_DUE_DATE(null);
			}

			// �f�}���h��ԋ敪
			if (aStruct.getl_DM_STS_TYP().intValue() == 0) {
				aStruct.setl_DM_STS_TYP_DN(null);
				// �v���[����Null��ݒ肷��
				aStruct.setl_DUE_DATE(null);
			}

			// �i���X�e�[�^�X
			setProgressStatus(aStruct);

			// ���O��敪
			setOutsideTyp(aStruct);
			//Ver2.4.2 PJ�ǉ����ځ@�񓚔[��----------------------------------------------------------------
			puchList = entity.mT_RLSD_PUCH_ODR.read(conn, aStruct);
			if(puchList.size() !=0) {
				aStruct.setl_CONFIRM_DLV_DATE(((AJ0020010Struct)(puchList.get(0))).getl_CONFIRM_DLV_DATE());
			}
			puchList = null;
			//Ver2.4.2 PJ�ǉ����ځ@�񓚔[�������܂�---------------------------------------------------------
			
			
			list.add(resultList.get(i));
			if (maxLine != 0 && list.size() == maxLine+1) {
				if(list!=null && list.size()>0){
					list.clear();
				}
				emsg = new ExpjMessage("ZZ01115");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = TOO_MANY;
				return;
			}
			readStatus = NORMAL;
		  

			// �e�I�[�_�f�}���h�ԍ����uNull�v�ȊO�A���A���v�ʏ����敪���u3:�폜�v�ȊO�̏ꍇ�A
			// ���ʃ��x���̓W�J���s��
			if (aStruct.getPARENT_OD_NO() != null
					&& aStruct.getPARENT_OD_NO().equals("") == false
					&& aStruct.getMRP_TYP().intValue() != 3) {
				developReverse(aStruct.getPARENT_OD_NO(), jobOdrCd,
						jobOdrCancelNo, aStruct.getPLANT_CD(), level + 1, emsg,maxLine);
			}
			if(readStatus==TOO_MANY){
				return;
			}
		}
	}

	/**
	 * �i���X�e�[�^�X�̕\�����e��ݒ肷��
	 * @param aStruct �i���X�e�[�^�X�̕\�����e��ݒ肷��Struct
	 * @exception SQLException �����������ɃG���[�����������ꍇ
	 * @exception ParseException
	 */
	private void setProgressStatus(AJ0020010Struct aStruct)
			throws SQLException, ParseException {
		String progressStatus = "";
		String progressStatusDisplayName = "";
		Date prdDueDate = null;
		Date dueDate = null;
		Date oprDate = Converter.strToDate(aStruct.getl_BUSINESS_OPR_DATE(), Converter.SLASH_DATE);
		boolean isDelayedPrdDueDate = false;
		boolean isDelayedDueDate = false;

		if (aStruct.getMRP_TYP().intValue() == 3) {
			// �폜
			progressStatus = "4";
			progressStatusDisplayName = getDisplayName(PROGRESS_STATUS_JOB, progressStatus);
		} else {
			if (aStruct.getl_ODR_STS_TYP().intValue() != 9
					&& aStruct.getl_DM_STS_TYP().intValue() != 9) {

				prdDueDate = Converter.strToDate(
						aStruct.getl_PRD_DUE_DATE(), Converter.SLASH_DATE);
				dueDate = Converter.strToDate(aStruct.getl_DUE_DATE(), Converter.SLASH_DATE);
				if (prdDueDate != null && oprDate.compareTo(prdDueDate) > 0) {
					isDelayedPrdDueDate = true;
				}
				if (dueDate != null && oprDate.compareTo(dueDate) > 0) {
					isDelayedDueDate = true;
				}
				if (isDelayedPrdDueDate == false && isDelayedDueDate == false) {
					// �x��Ȃ�
					progressStatus = "0";
					progressStatusDisplayName = "";
				} else {
					if (isDelayedPrdDueDate == true && isDelayedDueDate == true) {
						// ���o�ɒx��
						progressStatus = "3";
						progressStatusDisplayName = getDisplayName(
								PROGRESS_STATUS_JOB, progressStatus);
					} else {
						if (isDelayedPrdDueDate == true) {
							// ���ɒx��
							progressStatus = "2";
							progressStatusDisplayName = getDisplayName(
									PROGRESS_STATUS_JOB, progressStatus);
						} else {
							// �o�ɒx��
							progressStatus = "1";
							progressStatusDisplayName = getDisplayName(
									PROGRESS_STATUS_JOB, progressStatus);
						}
					}
				}
			}
		}
		aStruct.setl_PROGRESS_STATUS(progressStatus);
		aStruct.setl_PROGRESS_STATUS_DN(progressStatusDisplayName);
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
	 * ���O��敪�̐ݒ�
	 * @param aStruct ���O��敪��ݒ肷��Struct
	 */
	private void setOutsideTyp(AJ0020010Struct aStruct) {
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
			displayName = getDisplayName(OUTSIDE_TYP,
					aStruct.getOUTSIDE_TYP().toString());
			aStruct.setl_OUTSIDE_TYP_DN(displayName);
		}
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
		msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
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
		msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		String keyMessage = "";

		try {
			readStatus = INITIAL;
			struct.setPLANT_NAME(null);

			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}

			List resultList = null;
			AJ0020010Struct aStruct = null;
			int jobOdrDelFlg = 0;
			ExpjMessage emsg = null;

			// �H��R�[�h���݃`�F�b�N
			if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
				List tmpList = entity.mM_PLANT.read(conn, struct);
				if (tmpList.size() <= 0 ) {
					//�f�[�^�����݂��Ȃ�
					keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
					setErrorMessage("ZZ09028", keyMessage);
				} else {
					aStruct = (AJ0020010Struct)tmpList.get(0);
					struct.setPLANT_NAME(aStruct.getPLANT_NAME());
				}
			}

			// ��ʕҏW�s���ڃN���A
			struct.setJOB_ODR_TYP_DN(null);
			struct.setALC_GRP_CD(null);
			struct.setITEM_NAME(null);

			// ���Ԍv��̑��݃`�F�b�N
			AJ0020010Struct searchStruct = new AJ0020010Struct();
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			if (resultList.size() <= 0) {
				//�f�[�^�����݂��Ȃ�
				List key = new ArrayList();
				key.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				key.add("T_JOB_ODR.JOB_ODR_CANCEL_NO:" + struct.getJOB_ODR_CANCEL_NO());
				setErrorMessage("AJ00018", key);
			} else {
				aStruct = (AJ0020010Struct)resultList.get(0);
				if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
					if (aStruct.getPLANT_CD().equals(struct.getPLANT_CD()) == false) {
						keyMessage = "T_JOB_ODR.PLANT_CD:" + aStruct.getPLANT_CD();
						setErrorMessage("AJ00019", keyMessage);
					}
				}

				if (aStruct.getJOB_ODR_STS_TYP().intValue() == 1
					|| aStruct.getJOB_ODR_STS_TYP().intValue() == 2) {
					// ���v�ʌv�Z�����s���Ă��Ȃ�
					emsg = new ExpjMessage("AJ00016");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
				} else {
					// ���Ԏ�ʁA�����O���[�v�R�[�h�̐ݒ�
					struct.setJOB_ODR_TYP_DN(multcombo("JOB_ODR_TYP",aStruct.getJOB_ODR_TYP().toString()));
					struct.setALC_GRP_CD(aStruct.getALC_GRP_CD());
					// ���ԍ폜�t���O�̎擾
					jobOdrDelFlg = aStruct.getJOB_ODR_DEL_FLG().intValue();
				}
			}

			// �i�ڔԍ����w�肳��Ă���ꍇ
			if (struct.getITEM_CD() != null
					&& struct.getITEM_CD().equals("") == false) {
				resultList = entity.mM_ITEM.read(conn, struct);
				if (resultList.size() <= 0) {
					keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AJ00015", keyMessage);
				} else {
					aStruct = (AJ0020010Struct)resultList.get(0);
					struct.setITEM_NAME(aStruct.getITEM_NAME());
				}
			}

			// �G���[������ΏI��
			if (msgStruct.hasError()) {

				readStatus = NOT_FOUND;

				return;
			}

			// �W�J���x���i�����l�j
			maxDevelopLevel = Integer.parseInt(struct.getDEVELOP_LEVEL());

			int level = 1;
			int maxLine = sp.getMaxLine(conn, 10);
			if (struct.getDEVELOP_TYP().equals("1")) {
				// ���W�J
				developForward(null, struct.getJOB_ODR_CD(),
						struct.getJOB_ODR_CANCEL_NO(), struct.getPLANT_CD(), level, emsg,maxLine);
			} else {
				// �t�W�J
				developReverse(null, struct.getJOB_ODR_CD(),
						struct.getJOB_ODR_CANCEL_NO(), struct.getPLANT_CD(), level, emsg,maxLine);
			}

			if (jobOdrDelFlg == 1) {
				// �폜�Ώہi���[�j���O�j
				emsg = new ExpjMessage("AJ00017");
				msgStruct.addWarn(emsg);
				sysLog.warning(emsg, sysUSER_CD);
			}

			if ((list.size()== 0)&&(readStatus!=TOO_MANY)) {
				// �Ǎ��������s�F�������ʂ�0���ł�
				emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);

				readStatus = NOT_FOUND;

				return;
			}

		} catch(ParseException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			throw new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			throw new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		readStatus = INITIAL;

		if (list != null) {
			list.clear();
		} else {
			list = new ArrayList(0);
		}

		// �H��R�[�h���f�t�H���g�\��
		struct.setPLANT_CD(getsysPLANT_CD());

		// ��ʂ̏����l��ݒ�
		struct.setJOB_ODR_CD(null);
		struct.setJOB_ODR_TYP_DN(null);
		struct.setALC_GRP_CD(null);
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setJOB_ODR_CANCEL_NO("0");
		struct.setDEVELOP_TYP("1");
		// �W�J���x���̊���l�擾
		try {
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber(INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME);
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
		} catch (SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			throw new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		struct.setJOB_ODR_CANCEL_NO("0");
		// �W�J���x���̊���l�擾
		try {
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber(INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME);
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
		} catch (SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			throw new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		}
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try {

			readStatus = INITIAL;

			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber(INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME);
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);

			struct.setDEVELOP_TYP("1");


			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {

				struct.setJOB_ODR_CD(this._jobOdrCd);
				struct.setJOB_ODR_CANCEL_NO(this._jobOdrCancelNo);
				struct.setITEM_CD(null);
				struct.setPLANT_CD(this._plantCd);

				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				controlSelect();
			} else {
				// �H��R�[�h���f�t�H���g�\��
				struct.setPLANT_CD(getsysPLANT_CD());
			}

			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			throw new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
				ComboStruct DEVELOP_TYP = comboController.getData("DEVELOP_TYP");
				struct.setList_DEVELOP_TYP_val(DEVELOP_TYP.getValList());
				struct.setList_DEVELOP_TYP_name(DEVELOP_TYP.getExplanList());
				PROGRESS_STATUS_JOB = comboController.getData(PROGRESS_STATUS_JOB_PARAMETER_NAME);
				OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
				J_OUTSIDE_TYP = comboController.getData(J_OUTSIDE_TYP_PARAMETER_NAME);
			} catch (java.sql.SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AJ0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AJ0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AJ0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AJ0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AJ0020010Entity entity;
	protected AJ0020010Struct struct;
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

		entity = new AJ0020010Entity();
		struct = new AJ0020010Struct();

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
	 * AJ0020010�N���X�̕W���R���X�g���N�^
	 */
	public AJ0020010Control() throws BusinessProcessException, FoundationException
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
				AJ0020010Struct key = (AJ0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP") && key.getDEVELOP_TYP() != null) {
					msgKey.setKeyValue("DEVELOP_TYP", key.getDEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name") && key.getDEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_name", key.getDEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val") && key.getDEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_val", key.getDEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL") && key.getDEVELOP_LEVEL() != null) {
					msgKey.setKeyValue("DEVELOP_LEVEL", key.getDEVELOP_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("l_LEVEL") && key.getl_LEVEL() != null) {
					msgKey.setKeyValue("l_LEVEL", key.getl_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN") && key.getl_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_DN", key.getl_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP_DN") && key.getl_DM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP_DN", key.getl_DM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN") && key.getl_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_DN", key.getl_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN") && key.getl_MRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP_DN", key.getl_MRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN") && key.getl_OD_GNR_TYP_DN() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP_DN", key.getl_OD_GNR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS") && key.getl_PROGRESS_STATUS() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS", key.getl_PROGRESS_STATUS().toString());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN") && key.getl_PROGRESS_STATUS_DN() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS_DN", key.getl_PROGRESS_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
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
				if(msgKeyType.containsKeyColumn("l_DUE_DATE") && key.getl_DUE_DATE() != null) {
					msgKey.setKeyValue("l_DUE_DATE", key.getl_DUE_DATE());
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
				if(msgKeyType.containsKeyColumn("l_DM_QTY") && key.getl_DM_QTY() != null) {
					msgKey.setKeyValue("l_DM_QTY", key.getl_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY") && key.getl_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ISSUE_QTY", key.getl_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_CMPLT_DATE") && key.getl_ISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_CMPLT_DATE", key.getl_ISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP") && key.getl_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP", key.getl_OPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP") && key.getOD_GNR_TYP() != null) {
					msgKey.setKeyValue("OD_GNR_TYP", key.getOD_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP") && key.getl_DM_STS_TYP() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP", key.getl_DM_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY") && key.getl_RLSD_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_RLSD_PUCH_ODR_QTY", key.getl_RLSD_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY") && key.getl_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_QTY", key.getl_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE") && key.getl_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("l_BUSINESS_OPR_DATE", key.getl_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD") && key.getROOT_ITEM_CD() != null) {
					msgKey.setKeyValue("ROOT_ITEM_CD", key.getROOT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE") && key.getl_CONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE", key.getl_CONFIRM_DLV_DATE());
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
					AJ0020010Struct key = new AJ0020010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP")) {
						key.setDEVELOP_TYP(msgKey.getKeyValue("DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name")) {
						key.setDEVELOP_TYP_name(msgKey.getKeyValue("DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val")) {
						key.setDEVELOP_TYP_val(msgKey.getKeyValue("DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL")) {
						key.setDEVELOP_LEVEL(msgKey.getKeyValue("DEVELOP_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("l_LEVEL")) {
						key.setl_LEVEL(msgKey.getKeyValue("l_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN")) {
						key.setl_ODR_STS_TYP_DN(msgKey.getKeyValue("l_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP_DN")) {
						key.setl_DM_STS_TYP_DN(msgKey.getKeyValue("l_DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN")) {
						key.setl_OUTSIDE_TYP_DN(msgKey.getKeyValue("l_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN")) {
						key.setl_MRP_ODR_TYP_DN(msgKey.getKeyValue("l_MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN")) {
						key.setl_OD_GNR_TYP_DN(msgKey.getKeyValue("l_OD_GNR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS")) {
						key.setl_PROGRESS_STATUS(new Integer(msgKey.getKeyValue("l_PROGRESS_STATUS")));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN")) {
						key.setl_PROGRESS_STATUS_DN(msgKey.getKeyValue("l_PROGRESS_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
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
					if(msgKeyType.containsKeyColumn("l_DUE_DATE")) {
						key.setl_DUE_DATE(msgKey.getKeyValue("l_DUE_DATE"));
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
					if(msgKeyType.containsKeyColumn("l_DM_QTY")) {
						key.setl_DM_QTY(msgKey.getKeyValue("l_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY")) {
						key.setl_TOTAL_ISSUE_QTY(msgKey.getKeyValue("l_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_CMPLT_DATE")) {
						key.setl_ISSUE_CMPLT_DATE(msgKey.getKeyValue("l_ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP")) {
						key.setl_OPR_RSLT_TYP(new Integer(msgKey.getKeyValue("l_OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP")) {
						key.setOD_GNR_TYP(new Integer(msgKey.getKeyValue("OD_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(new Integer(msgKey.getKeyValue("l_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP")) {
						key.setl_DM_STS_TYP(new Integer(msgKey.getKeyValue("l_DM_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY")) {
						key.setl_RLSD_PUCH_ODR_QTY(msgKey.getKeyValue("l_RLSD_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY")) {
						key.setl_WORK_IN_PROC_QTY(msgKey.getKeyValue("l_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(new Integer(msgKey.getKeyValue("MRP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(new Integer(msgKey.getKeyValue("l_MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE")) {
						key.setl_BUSINESS_OPR_DATE(msgKey.getKeyValue("l_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD")) {
						key.setROOT_ITEM_CD(msgKey.getKeyValue("ROOT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(new Integer(msgKey.getKeyValue("JOB_ODR_DEL_FLG")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE")) {
						key.setl_CONFIRM_DLV_DATE(msgKey.getKeyValue("l_CONFIRM_DLV_DATE"));
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
