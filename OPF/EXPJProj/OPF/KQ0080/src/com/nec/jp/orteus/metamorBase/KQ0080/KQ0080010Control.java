/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0080/src/com/nec/jp/orteus/metamorBase/KQ0080/KQ0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0080;

import com.nec.jp.orteus.metamorBase.KQ0080.*;
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
 * CLASS     : KQ0080010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.7 $ $Date: 2015/11/23 08:55:25 $
 *
 */
//}}user_implement_code_header

public class KQ0080010Control
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
	public KQ0080010Struct getListvalue(int x) { return (KQ0080010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KQ0080010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KQ0080010Struct createStruct() { return new KQ0080010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KQ0080010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
	
	public int getListsize(List _list) {
		int nret = 0;
		if( _list != null ) {nret = _list.size();}
		return nret;
	}
	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	// ���Ԗ��׍sList
	protected List job_odrlist;											
	//	 ���ʃ��X�g�̃C���X�^���X
	public List getJob_odrlist() {
		return job_odrlist;
	}
	// ���X�g���Z�b�g���܂��B
	public void setJob_odrlist(List job_odrlist) {
		this.job_odrlist = job_odrlist;
	}
	// ���X�g�^�̃T�C�Y��Ԃ��܂��B
	public int getJob_odrlistsize() {										
		int nret = 0;
		if( this.job_odrlist != null ) {nret = this.job_odrlist.size();}
		return nret;
	}
	// ���X�g�̒l��Ԃ��܂��B
	public KQ0080010Struct getJob_odrlistvalue(int x) { return (KQ0080010Struct)(this.job_odrlist.get(x)); }
	
	/** [�R���{�{�b�N�X�f�[�^]���i�j */
	private ComboStruct _jobodrTypStruct = new ComboStruct();
	private ComboStruct _odrStatusStruct = new ComboStruct();
	
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
     * ��ʂ����������܂��B
     * @throws ParseException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     */
    private void initializeScreen()
    {
        // �Ǎ���ԁi������ԁj��ݒ�
        setReadStatus(INITIAL);
        // struct��������
        struct.initialize();
        if(list != null){
			list.clear();
		}
		if(job_odrlist != null){
			job_odrlist.clear();
		}
        struct.setw_PLANT_CD(sysPLANT_CD);
        struct.setPLANT_NAME(sysPLANT_NAME);
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			if(list != null){
				list.clear();
			}
			if(job_odrlist != null){
				job_odrlist.clear();
			}		
			// �u�H��R�[�h�v���m�H��n�ɑ��݂̃`�F�b�N
			List plantList = entity.mSelectM_PLANT.read(conn, struct);
			if(plantList.isEmpty() && struct.getw_PLANT_CD() !=null && !"".equals(struct.getw_PLANT_CD())){
				setErrorMessage("ZZ09028");
				struct.setPLANT_NAME("");
			}
			String plant_name = "";
			if(plantList != null && !plantList.isEmpty()){
				plant_name = ((KQ0080010Struct)plantList.get(0)).getPLANT_NAME();
			}
			struct.setPLANT_NAME(plant_name);
			// �u�i�ڔԍ��v���m�i�ځn�ɑ��݂̃`�F�b�N
			List itemList = entity.mSelectM_ITEM.read(conn, struct);
			if(itemList.isEmpty()){
				setErrorMessage("AL50004");
				struct.setITEM_NAME("");			
			}
			String item_name = "";
			if(itemList != null && !itemList.isEmpty()){
				item_name = ((KQ0080010Struct)itemList.get(0)).getITEM_NAME();
			}
			struct.setITEM_NAME(item_name);
			if (msgStruct.hasError()) {
				return;
			}
		    //�󒍖��׃f�[�^�̍ő匟�����̃`�F�b�N
			int maxOdrLine = sp.getMaxLine(conn, 10);
			 if(maxOdrLine != 0) {
  				struct.setROW_COUNT(String.valueOf(maxOdrLine));
  			} else {
  				struct.setROW_COUNT(null);
  			}
			// �󒍖��ׂ𒊏o
			list = entity.mSelectT_ODRCnt.read(conn, struct);
			long rowCount = Long.parseLong(((KQ0080010Struct)list.get(0)).getl_COUNT());
			if((maxOdrLine != 0) && (rowCount ==maxOdrLine+1) && rowCount != 0){
				setErrorMessage("ZZ01115",String.valueOf(maxOdrLine));
				setReadStatus(TOO_MANY);
				if(list != null && list.size() > 0){
                	list.clear(); 
                 }
			}else{
				list = entity.mSelectT_ODR.read(conn, struct);
				for(int i=0;i<list.size();i++){
					String odr_statusTyp = ((KQ0080010Struct)list.get(i)).getl1_ODR_STATUS_TYP();
					((KQ0080010Struct)list.get(i)).setl1_ODR_STATUS_TYP(getComboData(_odrStatusStruct,odr_statusTyp));
				}
			}
			
			int maxJobOdrLine = sp.getMaxLine(conn,20);
			if(maxJobOdrLine != 0) {
	  			struct.setROW_COUNT(String.valueOf(maxJobOdrLine));
	  		} else {
	  			struct.setROW_COUNT(null);
	  		}
			 //���Ԗ��׃f�[�^�̍ő匟�����̃`�F�b�N 
			if("0".equals(struct.geth_JOB_ODR_SET_FLG())){
				job_odrlist = entity.mSelectT_JOB_ODR1Cnt.read(conn, struct);
			}else{
				job_odrlist = entity.mSelectT_JOB_ODR2Cnt.read(conn, struct);
			}
			long rowCount1 = Long.parseLong(((KQ0080010Struct)job_odrlist.get(0)).getl_COUNT());
			
			if((rowCount == 0 && rowCount1 != 0) || (rowCount != 0 && rowCount1 == 0)){
				setWarningMessage("ZZ06001");
			}else{
				if(rowCount == 0 && rowCount1 == 0){
					setErrorMessage("ZZ06001");
					setReadStatus(NOT_FOUND);
					return ;
				}
			}

			if((maxJobOdrLine != 0) && (rowCount1==maxJobOdrLine+1) && rowCount1 != 0){
				setErrorMessage("ZZ01115",String.valueOf(maxJobOdrLine));
				setReadStatus(TOO_MANY);
				if(job_odrlist != null && job_odrlist.size() > 0){
					job_odrlist.clear();
				}
			}else{
				// ���Ԗ��ׂ𒊏o
				if("0".equals(struct.geth_JOB_ODR_SET_FLG())){
					job_odrlist = entity.mSelectT_JOB_ODR1.read(conn, struct);
				}else{
					job_odrlist = entity.mSelectT_JOB_ODR2.read(conn, struct);
				}
			}
			// [���Ԍv��].�g���ԏ�ԋ敪�h��\������
			for(int i=0;i<job_odrlist.size();i++){
				String job_odrTyp = ((KQ0080010Struct)job_odrlist.get(i)).getl2_JOB_ODR_STS_TYP();
				((KQ0080010Struct)job_odrlist.get(i)).setl2_JOB_ODR_STS_TYP(getComboData(_jobodrTypStruct,job_odrTyp));
			}
			setReadStatus(NORMAL);
		} catch (SQLException e) {
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�

			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // �G�N�Z�v�V�����̏ڍ׏��
			setReadStatus(ERROR);
			throw ee;

		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			setReadStatus(ERROR);
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		initializeScreen();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �I��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �s��
			int _tempLstCnt = 0;
			// �s���擾
			_tempLstCnt = getListsize(struct.getList_l1_ODR_NO());
			KQ0080010Struct _tempStruct = new KQ0080010Struct();
			KQ0080010Struct checkStruct = new KQ0080010Struct();
			
			// �󒍐�
			String odrQty = "0";  
			for (int i = 0; i < _tempLstCnt; i++) {
                 odrQty = Calculate.add(odrQty,(String)struct.getList_l1_ODR_QTY().get(i));
			}
			// �����\��
			String subtractQty = struct.getl2_ALCD_ENABLE_QTY();
			
			// �`�F�b�N
			int chkFlg = Calculate.compare(odrQty,subtractQty);
			if (chkFlg ==1){
				this.setWarningMessage("KQ00328",struct.getl2_JOB_ODR_CD());
			}
	
			//�@�g�����U�N�V�����X�^�[�g
			conn.beginTransWeb();
			for( int i = 0;i < _tempLstCnt; i++){
				_tempStruct.clear();
				_tempStruct.setl2_JOB_ODR_CD((String)struct.getList_l2_JOB_ODR_CD().get(0));
				_tempStruct.setl1_ODR_NO((String)struct.getList_l1_ODR_NO().get(i));
				_tempStruct.seth_COMPANY_CD(struct.geth_COMPANY_CD());
				_tempStruct.setl1_PLANT_CD((String)struct.getList_l1_PLANT_CD().get(i));
				_tempStruct.setl1_ODR_QTY((String)struct.getList_l1_ODR_QTY().get(i));
				_tempStruct.setsUser_ID(struct.getsUser_ID());
				_tempStruct.setsSysdate(struct.getsSysdate());
				// �X�V���`�F�b�N
				_tempStruct.setSET_JOB_ODR_CD((String)struct.getList_l2_JOB_ODR_CD().get(0));
				List checkList = entity.mCheckDATA.read(conn, _tempStruct);
				if (checkList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return ;
				}
				String oldModifyCount = (String)struct.getList_l1_MODIFY_COUNT().get(i);
				List checkModifyCountList = entity.mCheckT_ODR.read(conn, _tempStruct);
				if (checkModifyCountList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return ;
				}else{
					checkStruct = (KQ0080010Struct)checkModifyCountList.get(0);
					if (!oldModifyCount.equals(checkStruct.getSEL_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return ;
					}
				}
				// [���Ԏ󒍕R�t]�ւ̒ǉ�
				entity.mT_JOB_ODR_ODR_ALC.create(conn, _tempStruct);
				// [�󒍖���]�ւ̍X�V
				_tempStruct.setJOB_ODR_SET_FLG("1");
				entity.mT_ODR.update(conn,_tempStruct);
			}
			conn.commit();
			_tempStruct = null;
			// �ēǍ�
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // �G�N�Z�v�V�����̏ڍ׏��
			setReadStatus(ERROR);
			throw ee;
		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			setReadStatus(ERROR);
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �I���폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �s��
			int _tempLstCnt = 0;
			_tempLstCnt = getListsize(struct.getList_l1_ODR_NO());
			KQ0080010Struct _tempStruct = new KQ0080010Struct();
			KQ0080010Struct checkStruct = new KQ0080010Struct();
			String oldModifyCount = null;
			// �g�����U�N�V�����X�^�[�g
			conn.beginTransWeb();
			for (int i = 0; i < _tempLstCnt; i++) {
				_tempStruct.setl1_ODR_NO((String)struct.getList_l1_ODR_NO().get(i));
				_tempStruct.setJOB_ODR_SET_FLG("0");
				_tempStruct.setsUser_ID(struct.getsUser_ID());
				_tempStruct.setsSysdate(struct.getsSysdate());
				// �X�V���`�F�b�N
				oldModifyCount = (String) struct.getList_l1_MODIFY_COUNT().get(i);
				List checkList = entity.mCheckT_ODR.read(conn, _tempStruct);
				if (checkList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}else {
					checkStruct = (KQ0080010Struct)checkList.get(0);
					if (!oldModifyCount.equals(checkStruct.getSEL_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return;
					}
				}
				// [�󒍖���]�ւ̍X�V
				entity.mT_ODR.update(conn,_tempStruct);
				_tempStruct.setl1_JOB_ODR_CD((String)struct.getList_l1_JOB_ODR_CD().get(i));
				// [���Ԏ󒍕R�t] �̍폜
				entity.mT_JOB_ODR_ODR_ALC.delete(conn,_tempStruct);
			}
			conn.commit();
			_tempStruct.clear();
			// �ēǍ�
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // �G�N�Z�v�V�����̏ڍ׏��
			throw ee;

		} catch (Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �g�����U�N�V�����X�^�[�g
			conn.beginTransWeb();
			KQ0080010Struct _tempStruct = new KQ0080010Struct();
			_tempStruct.setl2_JOB_ODR_CD((String)struct.getList_l2_JOB_ODR_CD().get(0));
			//  �o�׎w���ς݂̎󒍂̃`�F�b�N
			boolean blcheck = entity.mcheckT_ANS_DLV_DATE.check(conn,_tempStruct);
			if(blcheck == true){
				setErrorMessage("KQ00334");
				return ;
			}
			_tempStruct.setsUser_ID(struct.getsUser_ID());
			_tempStruct.setsSysdate(struct.getsSysdate());
			// �r������
			List selList = entity.mSELECT_T_ODR.read(conn, _tempStruct);
			if (!selList.isEmpty()) {
				// [�󒍖���]�ւ̍X�V
				entity.mUpdateT_ODR.update(conn,_tempStruct);
			}
			// [���Ԏ󒍕R�t] �̍폜
			entity.mDeleteT_JOB_ODR_ODR_ALC.delete(conn,_tempStruct);
			conn.commit();
			_tempStruct.clear();
			// �ēǍ�
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�

			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // �G�N�Z�v�V�����̏ڍ׏��
			throw ee;
		} catch (ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        	initializeScreen();
        
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			String SysMyCompany = SystemInformation.getSysMyCompanyCd();
			try{
			if(SysMyCompany==null||SysMyCompany.length()==0){
				throw new Exception();
			}
			}catch(Exception e){
				ExpjException ee = new ExpjException(e, "KQ00039");
				throw ee;
			}
			struct.seth_COMPANY_CD(SysMyCompany);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			try {
				//  [���Ԍv��].�g���ԏ�ԋ敪�h�̃R���{�{�b�N�X�f�[�^��ݒ�
				ComboBox cb = new ComboBox(conn, sysUSER_CD);
				_jobodrTypStruct = cb.getData("JOB_ODR_STS_TYP");
				_odrStatusStruct = cb.getData("ODR_STATUS_KBN");
			} catch (SQLException se) {
                // �G���[�F�T�[�o�ŃG���[���������܂����B
                ExpjMessage emsg = new ExpjMessage("ZZ01106");
                sysLog.severe(emsg, getsysUSER_CD());
                ExpjException ee = new ExpjException(se, emsg);
                emsg = new ExpjMessage("ZZ01006", se.toString());
                sysLog.severe(emsg, getsysUSER_CD());
                throw ee;
            }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
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
//			throw new FoundationException("KQ0080010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0080010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KQ0080010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0080010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KQ0080010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0080010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KQ0080010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KQ0080010Entity entity;
	protected KQ0080010Struct struct;
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

		entity = new KQ0080010Entity();
		struct = new KQ0080010Struct();

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
	 * KQ0080010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0080010Control() throws BusinessProcessException, FoundationException
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
				KQ0080010Struct key = (KQ0080010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r2_JOB_ODR_SET_FLG") && key.getr2_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("r2_JOB_ODR_SET_FLG", key.getr2_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("r1_JOB_ODR_SET_FLG") && key.getr1_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("r1_JOB_ODR_SET_FLG", key.getr1_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP") && key.getc_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c_JOB_ODR_STS_TYP", key.getc_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE") && key.geth_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("h_JOB_ODR_DLV_DATE", key.geth_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l1_ODR_NO") && key.getl1_ODR_NO() != null) {
					msgKey.setKeyValue("l1_ODR_NO", key.getl1_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l1_CUST_NAME") && key.getl1_CUST_NAME() != null) {
					msgKey.setKeyValue("l1_CUST_NAME", key.getl1_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("l1_DLV_LOC_NAME") && key.getl1_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l1_DLV_LOC_NAME", key.getl1_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l1_DESINATED_DLV_DATE") && key.getl1_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l1_DESINATED_DLV_DATE", key.getl1_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l1_ODR_QTY") && key.getl1_ODR_QTY() != null) {
					msgKey.setKeyValue("l1_ODR_QTY", key.getl1_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l1_JOB_ODR_CD") && key.getl1_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l1_JOB_ODR_CD", key.getl1_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l1_PLANT_CD") && key.getl1_PLANT_CD() != null) {
					msgKey.setKeyValue("l1_PLANT_CD", key.getl1_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l1_ODR_STATUS_TYP") && key.getl1_ODR_STATUS_TYP() != null) {
					msgKey.setKeyValue("l1_ODR_STATUS_TYP", key.getl1_ODR_STATUS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l1_MODIFY_COUNT") && key.getl1_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l1_MODIFY_COUNT", key.getl1_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_CUST_CD") && key.getw_CUST_CD() != null) {
					msgKey.setKeyValue("w_CUST_CD", key.getw_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_NO") && key.getw_ODR_NO() != null) {
					msgKey.setKeyValue("w_ODR_NO", key.getw_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_SET_FLG") && key.geth_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("h_JOB_ODR_SET_FLG", key.geth_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_CD") && key.getl2_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_CD", key.getl2_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_COMPANY_CD") && key.geth_COMPANY_CD() != null) {
					msgKey.setKeyValue("h_COMPANY_CD", key.geth_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG") && key.getJOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_SET_FLG", key.getJOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("l2_PLANT_NAME") && key.getl2_PLANT_NAME() != null) {
					msgKey.setKeyValue("l2_PLANT_NAME", key.getl2_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_DLV_DATE") && key.getl2_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_DLV_DATE", key.getl2_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_QTY") && key.getl2_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_QTY", key.getl2_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_STS_TYP") && key.getl2_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_STS_TYP", key.getl2_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l2_PLANT_CD") && key.getl2_PLANT_CD() != null) {
					msgKey.setKeyValue("l2_PLANT_CD", key.getl2_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l2_ALCD_ENABLE_QTY") && key.getl2_ALCD_ENABLE_QTY() != null) {
					msgKey.setKeyValue("l2_ALCD_ENABLE_QTY", key.getl2_ALCD_ENABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l2_h_JOB_ODR_CD") && key.getl2_h_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l2_h_JOB_ODR_CD", key.getl2_h_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_STS_TYP") && key.geth_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("h_JOB_ODR_STS_TYP", key.geth_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT") && key.getSEL_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SEL_MODIFY_COUNT", key.getSEL_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_JOB_ODR_CD") && key.getSEL_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SEL_JOB_ODR_CD", key.getSEL_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SET_JOB_ODR_CD") && key.getSET_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SET_JOB_ODR_CD", key.getSET_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_ODR_NO") && key.getSEL_ODR_NO() != null) {
					msgKey.setKeyValue("SEL_ODR_NO", key.getSEL_ODR_NO());
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
					KQ0080010Struct key = new KQ0080010Struct();
					if(msgKeyType.containsKeyColumn("r2_JOB_ODR_SET_FLG")) {
						key.setr2_JOB_ODR_SET_FLG(msgKey.getKeyValue("r2_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r1_JOB_ODR_SET_FLG")) {
						key.setr1_JOB_ODR_SET_FLG(msgKey.getKeyValue("r1_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP")) {
						key.setc_JOB_ODR_STS_TYP(msgKey.getKeyValue("c_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE")) {
						key.seth_JOB_ODR_DLV_DATE(msgKey.getKeyValue("h_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l1_ODR_NO")) {
						key.setl1_ODR_NO(msgKey.getKeyValue("l1_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l1_CUST_NAME")) {
						key.setl1_CUST_NAME(msgKey.getKeyValue("l1_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l1_DLV_LOC_NAME")) {
						key.setl1_DLV_LOC_NAME(msgKey.getKeyValue("l1_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l1_DESINATED_DLV_DATE")) {
						key.setl1_DESINATED_DLV_DATE(msgKey.getKeyValue("l1_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l1_ODR_QTY")) {
						key.setl1_ODR_QTY(msgKey.getKeyValue("l1_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l1_JOB_ODR_CD")) {
						key.setl1_JOB_ODR_CD(msgKey.getKeyValue("l1_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l1_PLANT_CD")) {
						key.setl1_PLANT_CD(msgKey.getKeyValue("l1_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l1_ODR_STATUS_TYP")) {
						key.setl1_ODR_STATUS_TYP(msgKey.getKeyValue("l1_ODR_STATUS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l1_MODIFY_COUNT")) {
						key.setl1_MODIFY_COUNT(msgKey.getKeyValue("l1_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_CUST_CD")) {
						key.setw_CUST_CD(msgKey.getKeyValue("w_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_NO")) {
						key.setw_ODR_NO(msgKey.getKeyValue("w_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_SET_FLG")) {
						key.seth_JOB_ODR_SET_FLG(msgKey.getKeyValue("h_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_CD")) {
						key.setl2_JOB_ODR_CD(msgKey.getKeyValue("l2_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_COMPANY_CD")) {
						key.seth_COMPANY_CD(msgKey.getKeyValue("h_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG")) {
						key.setJOB_ODR_SET_FLG(msgKey.getKeyValue("JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l2_PLANT_NAME")) {
						key.setl2_PLANT_NAME(msgKey.getKeyValue("l2_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_DLV_DATE")) {
						key.setl2_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l2_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_QTY")) {
						key.setl2_JOB_ODR_QTY(msgKey.getKeyValue("l2_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_STS_TYP")) {
						key.setl2_JOB_ODR_STS_TYP(msgKey.getKeyValue("l2_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l2_PLANT_CD")) {
						key.setl2_PLANT_CD(msgKey.getKeyValue("l2_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l2_ALCD_ENABLE_QTY")) {
						key.setl2_ALCD_ENABLE_QTY(msgKey.getKeyValue("l2_ALCD_ENABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l2_h_JOB_ODR_CD")) {
						key.setl2_h_JOB_ODR_CD(msgKey.getKeyValue("l2_h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_STS_TYP")) {
						key.seth_JOB_ODR_STS_TYP(msgKey.getKeyValue("h_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT")) {
						key.setSEL_MODIFY_COUNT(msgKey.getKeyValue("SEL_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_JOB_ODR_CD")) {
						key.setSEL_JOB_ODR_CD(msgKey.getKeyValue("SEL_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SET_JOB_ODR_CD")) {
						key.setSET_JOB_ODR_CD(msgKey.getKeyValue("SET_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ODR_NO")) {
						key.setSEL_ODR_NO(msgKey.getKeyValue("SEL_ODR_NO"));
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
