/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0010/src/com/nec/jp/orteus/metamorBase/KM0010/KM0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0010;

import com.nec.jp.orteus.metamorBase.KM0010.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
import com.nec.jp.orteus.metamorBase.common08.ClassMaster.ClassMaster;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0010010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 02:13:27 $
 *
 */
//}}user_implement_code_header

public class KM0010010Control
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
	public KM0010010Struct getListvalue(int x) { return (KM0010010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KM0010010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KM0010010Struct createStruct() { return new KM0010010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KM0010010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	
	// ���Џ��
	private String COMPANY_CD = null;
	
	/** �Ɩ��^�p�� */
	private String _businessOprDate;
    // �Ɩ��^�p�����Q�b�g
	public String get_businessOprDate() {
		return _businessOprDate;
	}
	// �Ɩ��^�p�����Z�b�g	
	public void set_businessOprDate(String oprDate) {
		_businessOprDate = oprDate;
	}
	//---------- �R���{�{�b�N�X�f�[�^-- --------------------------------------------
	/** �Č��X�e�[�^�X */
	private ComboStruct _PROJECT_STAT= new ComboStruct();

	/** �Č��X�e�[�^�X�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setPROJECT_STAT(ComboStruct combo){ _PROJECT_STAT= combo; }

	/** �Č��X�e�[�^�X�擾
	 * @return �Č��X�e�[�^�X�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getPROJECT_STAT(){ return _PROJECT_STAT; }
	
	/** �m�x */
	private ComboStruct _ACCURACY_LEVEL= new ComboStruct();

	/** �m�x�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setACCURACY_LEVEL(ComboStruct combo){ _ACCURACY_LEVEL= combo; }

	/** �m�x�擾
	 * @return �m�x�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getACCURACY_LEVEL(){ return _ACCURACY_LEVEL; }
	
	/** �󒍊��� */
	private ComboStruct _ODR_COMP_FLG= new ComboStruct();

	/** �󒍊����ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setODR_COMP_FLG(ComboStruct combo){ _ODR_COMP_FLG= combo; }

	/** �󒍊����擾
	 * @return �󒍊����̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getODR_COMP_FLG(){ return _ODR_COMP_FLG; }
	
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
	
	/**  ���ރ}�X�^�� */
	private String _PJ_CLASS_01_TYP = new String();
	
	private String _PJ_CLASS_02_TYP = new String();
	
	private String _PJ_CLASS_03_TYP = new String();
	
	private String _PJ_CLASS_04_TYP = new String();
	
	private String _PJ_CLASS_05_TYP = new String();
	
	private String _PJ_CLASS_06_TYP = new String();
	
	private String _PJ_CLASS_07_TYP = new String();
	
	private String _PJ_CLASS_08_TYP = new String();
	
	private String _PJ_CLASS_09_TYP = new String();
	
	private String _PJ_CLASS_10_TYP = new String();
	
	private String _PJ_CLASS_11_TYP = new String();
	
	private String _PJ_CLASS_12_TYP = new String();
	//-----------��ʂ̏ڍ׍��ڂ�������------------------------------------------
    /**
     * ��ʂ̏ڍ׍��ڂ����������܂��B
     */
    private void initializeDetail(){
    	struct.setPROJECT_CD_FLG("false");
    	struct.setOD_COMP_FLG("false");
    	struct.setVend_Date(_businessOprDate);
    	struct.setPJ_USER_CD(sysUSER_CD);
    	struct.setCOMPANY_CD(COMPANY_CD);
    }
	
	//---------- ���b�Z�[�W�֘A�̏���-- --------------------------------------------
	
	String keyMessage = "";
	/**
	 * Exception���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		throw ee;
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
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
	
	//---------- �Č��`�F�b�N���� ----------------------
	/**
	 * �o�^�A�X�V�{�^���������`�F�b�N
	 * @param �Ȃ�
	 * @throws SQLException�AFoundationException 
	 * @return boolean true:OK false:NG
	 * @throws java.text.ParseException 
	 * @throws DataNotFoundException 
	 */
	public boolean operateCheck(String operateId) throws SQLException,FoundationException, java.text.ParseException, DataNotFoundException
	{
		boolean result = true; // �`�F�b�N���ʊi�[
		
		//�����Č��ԍ������݃`�F�b�N
		if(operateId.equals("insert")){
			List projectList = entity.mT_PROJECT.read(conn, struct);
			if(!projectList.isEmpty()){
				setErrorMessage("KM00004");
				result = false;
				return result;
		}
		
		}
		//���Ӑ�R�[�h���݃`�F�b�N
		 List custList = entity.mCkCust1.read(conn, struct);
		 if(custList.isEmpty()){
			 //���Ӑ�R�[�h���}�X�^�ɑ��݂��܂���B
			 setErrorMessage("KQ00014");
			 result = false;
			 return result;
		 }
		 if(struct.getDLV_LOC_CD() != null && !("".equals(struct.getDLV_LOC_CD()))){
			//�[�i�ꏊ�R�[�h���}�X�^�ɑ��݃`�F�b�N
			 List DlvLocCdList = entity.mcheckDLV_LOC_CD.read(conn, struct);
			 if(DlvLocCdList.isEmpty()){
				 //�[�i�ꏊ�R�[�h���}�X�^�ɑ��݂��܂���B
				 setErrorMessage("KQ00015");
				 result = false;
				 return result;
			 }
		 }
		 //����R�[�h������}�X�^�ɑ���
		 if(struct.getPJ_ORG_CD() != null && !"".equals(struct.getPJ_ORG_CD()) ){
			 List OrgCdList = entity.mcheckORG.read(conn, struct);
			 if(OrgCdList.isEmpty()){
				 //����R�[�h������}�X�^�ɑ��݂��܂���B
				 setErrorMessage("KM00006");
				 result = false;
				 return result;
			 }
		 }
		 //�S���҃R�[�h�����[�U�}�X�^�ɑ��݂��܂���B
		 if(struct.getPJ_USER_CD()!= null && !"".equals(struct.getPJ_USER_CD()) ){
			 List PJuserList = entity.mcheckUSER.read(conn, struct);
			 if(PJuserList.isEmpty()){
				 //�S���҃R�[�h�����[�U�}�X�^�ɑ��݂��܂���B
				 setErrorMessage("KM00013");
				 result = false;
				 return result;
			 } 
		 }
		 //�ʉ݃R�[�h���}�X�^�ɑ��݃`�F�b�N
		 List CurList = entity.mcheckM_cur.read(conn, struct);
		 if(CurList.isEmpty()){
			 //�ʉ݃R�[�h���}�X�^�ɑ��݂��܂���B
			 setErrorMessage("KQ00073");
			 result = false;
			 return result;
		 }
		 //�Č����ރR�[�h���݃`�F�b�N
		checkClass(struct);
		if(msgStruct.hasError()){
			result = false;
			return result;
		}
		 //[�Ɩ����t]���𕔕i���擾
		 DateCtrlStruct dcs = DateCtrlControl.getData(conn, this.sysPLANT_CD);
		//�z��[���`�F�b�N
			//[���].�g�z��[���h���Ɩ����t�̏ꍇ
			if(DateTool.compareYMD(struct.getAssumeDlv_date(), dcs.getBUSINESS_OPR_DATE())<0){
				 //�z��[�����ߋ����ł�
				setWarningMessage("KM00023");
			 }
			//�������`�F�b�N
			//[���].�g�������h���Ɩ����t�̏ꍇ
			if(DateTool.compareYMD(struct.getVend_Date(), dcs.getBUSINESS_OPR_DATE())>0){
				 //���������������ł�
				setWarningMessage("KM00024");
			 }
			//[���].�g�������h��[���].�g�z��[���h
			if(DateTool.compareYMD(struct.getVend_Date(),struct.getAssumeDlv_date())>0){
				setErrorMessage("KM00051");
				result = false;
			}
		return result;
	}

	/**
	 * �r���`�F�b�N
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public boolean exclusiveCheck() throws FoundationException, SQLException{
		boolean result = true;
		List list = entity.mT_PROJECT.read(conn, struct);
		if(list.size() <= 0){
			// �G���[���b�Z�[�W�쐬
			setErrorMessage("ZZ06001");
			result = false;
		}
		else{
			String modify = ((KM0010010Struct)list.get(0)).geth_MODIFY_COUNT();
			if (struct.geth_MODIFY_COUNT().equals(modify) == false)
			{
				// �G���[���b�Z�[�W�쐬
				setErrorMessage("ZZ01105");
				result = false;
			}
		}
		return result;
	}
	//------------------�ǉ��E�X�V���̕��ރ}�X�^�`�F�b�N-------------------------------------------------
	/** 
	 * ���ޒl�`�F�b�N�B
	 * NOT NULL���ڂɒl�������Ă��Ȃ��ꍇ�A�l�𑶍݃`�F�b�N����
	 * @param Struct �`�F�b�N�Ώۂ�Struct
	 * @throws SQLException 
	 */
	private void checkClass(KM0010010Struct checkStruct) throws SQLException {
		try {
			// �i�ڕ���01�`�F�b�N
			if (checkStruct.getPJ_CLASS_01_CD() != null && !"".equals(checkStruct.getPJ_CLASS_01_CD())) {
				boolean checkResult01 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD01,checkStruct.getPJ_CLASS_01_CD());
				if (!checkResult01) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD01);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_01_NAME("");
				} 
			}
			// �i�ڕ���02�`�F�b�N
			if (struct.getPJ_CLASS_02_CD() != null && !"".equals(checkStruct.getPJ_CLASS_02_CD())) {
				boolean checkResult02 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD02, checkStruct.getPJ_CLASS_02_CD());
				if (!checkResult02) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD02);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_02_NAME("");
				}
			}
			
			// �i�ڕ���03�`�F�b�N
			if (checkStruct.getPJ_CLASS_03_CD() != null && !"".equals(checkStruct.getPJ_CLASS_03_CD())) {
				boolean checkResult03 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD03, checkStruct.getPJ_CLASS_03_CD());
				if (!checkResult03) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD03);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_03_NAME("");
				}
			}
			// �i�ڕ���04�`�F�b�N
			if (checkStruct.getPJ_CLASS_04_CD() != null && !"".equals(checkStruct.getPJ_CLASS_04_CD())) {
				boolean checkResult04 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD04, checkStruct.getPJ_CLASS_04_CD());
				if (!checkResult04) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD04);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_04_NAME("");
				}
			}
			// �i�ڕ���05�`�F�b�N
			if (checkStruct.getPJ_CLASS_05_CD() != null && !"".equals(checkStruct.getPJ_CLASS_05_CD())) {
				boolean checkResult05 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD05, checkStruct.getPJ_CLASS_05_CD());
				if (!checkResult05) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD05);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_05_NAME("");
				}
			}
			// �i�ڕ���06�`�F�b�N
			if (checkStruct.getPJ_CLASS_06_CD() != null && !"".equals(checkStruct.getPJ_CLASS_06_CD())) {
				boolean checkResult06 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD06, checkStruct.getPJ_CLASS_06_CD());
				if (!checkResult06) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD06);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_06_NAME("");
				}
			}	
			// �i�ڕ���07�`�F�b�N
			if (checkStruct.getPJ_CLASS_07_CD() != null && !"".equals(checkStruct.getPJ_CLASS_07_CD())) {
				boolean checkResult07 = ClassMaster.checkMclass(conn, KM0010Common.CLASS_CD,KM0010Common.CLASS_CD07, checkStruct.getPJ_CLASS_07_CD());
				if (!checkResult07) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD07);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_07_NAME("");
				}
			}	
			// �i�ڕ���08�`�F�b�N
			if (checkStruct.getPJ_CLASS_08_CD() != null && !"".equals(checkStruct.getPJ_CLASS_08_CD())) {
				boolean checkResult08 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD08, checkStruct.getPJ_CLASS_08_CD());
				if (!checkResult08) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD08);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_08_NAME("");
				}
			}	
			// �i�ڕ���09�`�F�b�N
			if (checkStruct.getPJ_CLASS_09_CD() != null && !"".equals(checkStruct.getPJ_CLASS_09_CD())) {
				boolean checkResult09 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD09, checkStruct.getPJ_CLASS_09_CD());
				if (!checkResult09) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD09);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_08_NAME("");
				}
			}	
			// �i�ڕ���10�`�F�b�N
			if (checkStruct.getPJ_CLASS_10_CD() != null && !"".equals(checkStruct.getPJ_CLASS_10_CD())) {
				boolean checkResult10 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD10, checkStruct.getPJ_CLASS_10_CD());
				if (!checkResult10) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD10);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_10_NAME("");
				}
			}	
			// �i�ڕ���11�`�F�b�N
			if (checkStruct.getPJ_CLASS_11_CD() != null && !"".equals(checkStruct.getPJ_CLASS_11_CD())) {
				boolean checkResult11 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD11, checkStruct.getPJ_CLASS_11_CD());
				if (!checkResult11) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD11);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_11_NAME("");
				}
			}	
			// �i�ڕ���12�`�F�b�N
			if (checkStruct.getPJ_CLASS_12_CD() != null && !"".equals(checkStruct.getPJ_CLASS_12_CD())) {
				boolean checkResult12 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD12,checkStruct.getPJ_CLASS_12_CD());
				if (!checkResult12) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD12);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setPJ_CLASS_12_NAME("");
				}
			}		
			return;
		} catch (SQLException e) {
			throw e;
		}
	}
	//----------�Č��ԍ��������̔Ԃ���-- ---------------------------------------
	private String AutoCreatePjCd() throws FoundationException, SQLException{
		List projectCds = entity.mcreateProjectCd.read(conn, struct);
		KM0010010Struct tempInsertStruct =(KM0010010Struct)projectCds.get(0);
		String tempPjCd = tempInsertStruct.getAuto_PROJECT_CD();
		return tempPjCd;
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �L�[�ȊO�̍��ڂ�������
            initializeDetail();
            struct.seth_ESTIMATE("0");

			KM0010010Struct tmpStruct;
			KM0010010Struct structPjOdrAlc;
			
			int completeFlg = 0;
			int tempFlg = 1;
			boolean checkResult = false;
			struct.setCOMPANY_CD(COMPANY_CD);
			//�Č����݃`�F�b�N
			 List projectList = entity.mT_PROJECT.read(conn, struct);
			 if(projectList.isEmpty()){
				 //�Č������݂��܂���B
				 setErrorMessage("KM00001");
					return;
			 }
			 //���Ӑ�R�[�h���݃`�F�b�N
			 List custList = entity.mcheckCust.read(conn, struct);
			 if(custList.isEmpty()){
				 //���Ӑ�R�[�h���}�X�^�ɑ��݂��܂���B
				 setErrorMessage("KQ00014");
					return;
			 }else{
				 tmpStruct = (KM0010010Struct)custList.get(0);
				 struct.setCUST_NAME(tmpStruct.getCUST_NAME());
				 struct.setCUST_CD(tmpStruct.getCUST_CD());
			 }
			 //�ʉ݃R�[�h���݃`�F�b�N
			 List CurList = entity.mcheckM_cur.read(conn, struct);
			 if(CurList.isEmpty()){
				 //�ʉ݃R�[�h���}�X�^�ɑ��݂��܂���B
				 setErrorMessage("KQ00073");
				 return;
			 }else{
				 tmpStruct = (KM0010010Struct)CurList.get(0);
				 struct.setCurUnit(tmpStruct.getCurUnit());
			 }
			 
			 KM0010010Struct tempStruct = (KM0010010Struct)projectList.get(0);
			 tempStruct.setCOMPANY_CD(COMPANY_CD);
			 if(tempStruct.getDLV_LOC_CD() != null && !"".equals(tempStruct.getDLV_LOC_CD())){
				 
				 List DlvLocCdList = entity.mcheckDLV_LOC_CD.read(conn, tempStruct);
				 if(DlvLocCdList.isEmpty()){
					 //�[�i�ꏊ�R�[�h���}�X�^�ɑ��݂��܂���B
					 setWarningMessage("KQ00015");
				 }else{
					 tmpStruct = (KM0010010Struct)DlvLocCdList.get(0);
					 struct.setDLV_LOC_NAME(tmpStruct.getDLV_LOC_NAME());
				 }
				 
			 }else{
				 struct.setDLV_LOC_NAME("");
			 }
			 if(tempStruct.getPJ_ORG_CD() != null && !"".equals(tempStruct.getPJ_ORG_CD()) ){
				 List OrgCdList = entity.mcheckORG.read(conn, tempStruct);
				 if(OrgCdList.isEmpty()){
					 //����R�[�h������}�X�^�ɑ��݂��܂���B
					 setWarningMessage("KM00006");
				 }else{
					 tmpStruct = (KM0010010Struct)OrgCdList.get(0);
					 struct.setORG_NAME(tmpStruct.getORG_NAME());
				 }
			 }else{
				 struct.setORG_NAME(""); 
			 }	
			 
			 //�S���҃R�[�h���݃`�F�b�N
			 if(tempStruct.getPJ_USER_CD() != null && !"".equals(tempStruct.getPJ_USER_CD())){
				 List PJuserList = entity.mcheckUSER.read(conn, tempStruct);
				 if(PJuserList.isEmpty()){
					 //�S���҃R�[�h�����[�U�}�X�^�ɑ��݂��܂���B
					 setWarningMessage("KM00013");
				 }else{
					 tmpStruct = (KM0010010Struct)PJuserList.get(0);
					 struct.setUSER_NAME(tmpStruct.getUSER_NAME());
				 }
			 }else{
				 struct.setUSER_NAME("");
			 }
			 if(entity.mCheckEstimate1.check(conn, tempStruct)){
				 //[����]�̏�񂪂���
				 struct.seth_ESTIMATE("1");
			 }
			 //[�Č�].�g�Č��X�e�[�^�X�h��4:�m��󒍁A9:�����̏ꍇ�A�u�󒍊����v���擾����B
			 if("4".equals(tempStruct.getPROJECT_STAT()) || "9".equals(tempStruct.getPROJECT_STAT())){
				 // [����]�̏����擾����B
				List EstimateList2 = entity.mESTIMATE_SEARCH2.read(conn,tempStruct);
				if(!EstimateList2.isEmpty()){
					 completeFlg = 0;
				}
				else {
				 List EstimateList = entity.mESTIMATE_SEARCH.read(conn,tempStruct);
				 if(!EstimateList.isEmpty()){
					 for(int i=0; i<EstimateList.size();i++){
						 tmpStruct =(KM0010010Struct) EstimateList.get(i);
						 //[�Č��󒍕R�t]�̏����擾����
						 List pjOdrAlcList = entity.mT_PJ_ODR_ALC.read(conn, tmpStruct);
						 structPjOdrAlc = (KM0010010Struct)pjOdrAlcList.get(0);
						 if(tmpStruct.getESTIMATE_TYPE()!= null && "1".equals(tmpStruct.getESTIMATE_TYPE())){
							 //[���ϖ���].�h��z�i�ڎ�h=1:���i�̏ꍇ
							  List OdrList = entity.mT_ODR.read(conn, structPjOdrAlc);
							  if(!OdrList.isEmpty()){
								  tmpStruct = (KM0010010Struct)OdrList.get(0);
								  if(tmpStruct.getODR_CMPLT_FLG()!= null && !"1".equals(tmpStruct.getODR_CMPLT_FLG())){
									  tempFlg = 0;
									  break;
								  }
							  }
						 }
						 
						 if(tmpStruct.getESTIMATE_TYPE()!= null && "2".equals(tmpStruct.getESTIMATE_TYPE())){
							 //[���ϖ���].�h��z�i�ڎ�h=2:�𖱂̏ꍇ
							 List  odrUnStockList = entity.mT_ODR_UNSTOCK.read(conn, structPjOdrAlc);
							 if(!odrUnStockList.isEmpty()){
								 tmpStruct = (KM0010010Struct)odrUnStockList.get(0);
								  if(tmpStruct.getODR_CMPLT_FLG()!= null && !"1".equals(tmpStruct.getODR_CMPLT_FLG())){
									  tempFlg = 0;
									  break;
								  }
							 }
							 
						 }
					 }
					 //���ׂĂ̖��ׂ� �g�󒍊����t���O�h��1�̏ꍇ
					 if(tempFlg != 0){
						 completeFlg = 1;
					 }
				 }
				}
			 }
			 struct.setPROJECT_CD(tempStruct.getPROJECT_CD());
			 struct.seth_PROJECT_CD(tempStruct.getPROJECT_CD());
			 struct.setPROJECT_NAME(tempStruct.getPROJECT_NAME());
			 struct.setCUST_CD(tempStruct.getCUST_CD());
			 struct.seth_MODIFY_COUNT(tempStruct.geth_MODIFY_COUNT());
			 //�Č��X�e�[�^�X
			 struct.setPROJECT_STAT(tempStruct.getPROJECT_STAT());
			 struct.seth_PROJECT_STAT(tempStruct.getPROJECT_STAT());
			 //�󒍊���
			if(completeFlg==1){
				//����
				struct.setCOMPLETE_STAT(multcombo("ODR_COMP_FLG","1"));
				struct.seth_COMPLETE_STAT("1");
			}else{
	            //������
				struct.setCOMPLETE_STAT(multcombo("ODR_COMP_FLG","0"));
				struct.seth_COMPLETE_STAT("0");
			}
			//�m�x
			struct.setACCURACY_LEVEL(tempStruct.getACCURACY_LEVEL());
			//������
			struct.setVend_Date(tempStruct.getVend_Date());
			//�z��[��
			struct.setAssumeDlv_date(tempStruct.getAssumeDlv_date());
			//�����z����z
			struct.setAssumeAmount(tempStruct.getAssumeAmount());
			//�����z����z(�M��)
			struct.setASSUME_AMOUNT_EXCH_RATES(tempStruct.getASSUME_AMOUNT_EXCH_RATES());
			//�[�i�ꏊ�R�[�h
			struct.setDLV_LOC_CD(tempStruct.getDLV_LOC_CD());
			//�Č��S������R�[�h
			struct.setPJ_ORG_CD(tempStruct.getPJ_ORG_CD());
			//�Č��S���҃R�[�h
			struct.setPJ_USER_CD(tempStruct.getPJ_USER_CD());
			//���l�P
			struct.setREMARKS1(tempStruct.getREMARKS1());
			//���l2
			struct.setREMARKS2(tempStruct.getREMARKS2());
			//���l3
			struct.setREMARKS3(tempStruct.getREMARKS3());
			//���l4
			struct.setREMARKS4(tempStruct.getREMARKS4());
			//���l5
			struct.setREMARKS5(tempStruct.getREMARKS5());
			//�\�Z�Ϗ㊮���t���O(��ʂɃZ�b�g)
			struct.seth_OD_COMP_FLG(tempStruct.geth_OD_COMP_FLG());
			if(tempStruct.geth_OD_COMP_FLG()!= null && "1".equals(tempStruct.geth_OD_COMP_FLG()) ){
				struct.setOD_COMP_FLG("true");
			}else{
				struct.setOD_COMP_FLG("false");
			}
			//�Č�����
			struct.setPJ_CLASS_01_TYP(tempStruct.getPJ_CLASS_01_TYP());
			struct.setPJ_CLASS_01_CD(tempStruct.getPJ_CLASS_01_CD());
			struct.setPJ_CLASS_01_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD01,tempStruct.getPJ_CLASS_01_CD()));
			
			struct.setPJ_CLASS_02_TYP(tempStruct.getPJ_CLASS_02_TYP());
			struct.setPJ_CLASS_02_CD(tempStruct.getPJ_CLASS_02_CD());
			struct.setPJ_CLASS_02_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD02,tempStruct.getPJ_CLASS_02_CD()));
			
			struct.setPJ_CLASS_03_TYP(tempStruct.getPJ_CLASS_03_TYP());
			struct.setPJ_CLASS_03_CD(tempStruct.getPJ_CLASS_03_CD());
			struct.setPJ_CLASS_03_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD03,tempStruct.getPJ_CLASS_03_CD()));
			
			struct.setPJ_CLASS_04_TYP(tempStruct.getPJ_CLASS_04_TYP());
			struct.setPJ_CLASS_04_CD(tempStruct.getPJ_CLASS_04_CD());
			struct.setPJ_CLASS_04_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD04,tempStruct.getPJ_CLASS_04_CD()));
			
			struct.setPJ_CLASS_05_TYP(tempStruct.getPJ_CLASS_05_TYP());
			struct.setPJ_CLASS_05_CD(tempStruct.getPJ_CLASS_05_CD());
			struct.setPJ_CLASS_05_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD05,tempStruct.getPJ_CLASS_05_CD()));
			
			struct.setPJ_CLASS_06_TYP(tempStruct.getPJ_CLASS_06_TYP());
			struct.setPJ_CLASS_06_CD(tempStruct.getPJ_CLASS_06_CD());
			struct.setPJ_CLASS_06_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD06,tempStruct.getPJ_CLASS_06_CD()));
			
			struct.setPJ_CLASS_07_TYP(tempStruct.getPJ_CLASS_07_TYP());
			struct.setPJ_CLASS_07_CD(tempStruct.getPJ_CLASS_07_CD());
			struct.setPJ_CLASS_07_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD07,tempStruct.getPJ_CLASS_07_CD()));
			
			struct.setPJ_CLASS_08_TYP(tempStruct.getPJ_CLASS_08_TYP());
			struct.setPJ_CLASS_08_CD(tempStruct.getPJ_CLASS_08_CD());
			struct.setPJ_CLASS_08_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD08,tempStruct.getPJ_CLASS_08_CD()));
			
			struct.setPJ_CLASS_09_TYP(tempStruct.getPJ_CLASS_09_TYP());
			struct.setPJ_CLASS_09_CD(tempStruct.getPJ_CLASS_09_CD());
			struct.setPJ_CLASS_09_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD09,tempStruct.getPJ_CLASS_09_CD()));
			
			struct.setPJ_CLASS_10_TYP(tempStruct.getPJ_CLASS_10_TYP());
			struct.setPJ_CLASS_10_CD(tempStruct.getPJ_CLASS_10_CD());
			struct.setPJ_CLASS_10_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD10,tempStruct.getPJ_CLASS_10_CD()));
			
			struct.setPJ_CLASS_11_TYP(tempStruct.getPJ_CLASS_11_TYP());
			struct.setPJ_CLASS_11_CD(tempStruct.getPJ_CLASS_11_CD());
			struct.setPJ_CLASS_11_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD11,tempStruct.getPJ_CLASS_11_CD()));
			
			struct.setPJ_CLASS_12_TYP(tempStruct.getPJ_CLASS_12_TYP());
			struct.setPJ_CLASS_12_CD(tempStruct.getPJ_CLASS_12_CD());
			struct.setPJ_CLASS_12_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD12,tempStruct.getPJ_CLASS_12_CD()));
			
			// ������Ԃ��u�Ǎ������v�ɐݒ�
			setReadStatus(NORMAL);
			
		} catch(Exception e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			if(!operateCheck("insert")){
				return;
			} 
			//���Ӑ���̎擾
			KM0010010Struct tempInsertStruct = null;
			List custList = entity.mCkCust1.read(conn, struct);
			if(custList.isEmpty()){
				 setErrorMessage("KQ00014");
				 return ;
			}else{
				tempInsertStruct = (KM0010010Struct)custList.get(0);
			}
			ExchAmount exch = new ExchAmount(conn);
			// �M�݌v�Z����(�M�݌v�Z�����Łu�����z����z�i�M�݁j�v���擾����)
			boolean  result = exch.doExchAmount(
					struct.getAssumeAmount(),                              //�����z����z
					COMPANY_CD,
					tempInsertStruct.getCUR_CD(), 
					tempInsertStruct.getEXCH_TYP(), 
					tempInsertStruct.getDETAIL_ROUND_TYP(), 
					_businessOprDate);                                     // �Ɩ��^�p��
			if (!result) {
				setErrorMessage("KQ00038");
				return;
			}
		    String	dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT()); // �����z����z�i�M�݁j
			struct.setASSUME_AMOUNT_EXCH_RATES(dExchAmount);
			
			//�Č��ԍ����擾 
			if("true".equals(struct.getPROJECT_CD_FLG())){
				//�Č��ԍ��������̔Ԃ���
				struct.setPROJECT_CD(AutoCreatePjCd());
			}
			//�\�Z�Ϗ㊮���t���O
			if("true".equals(struct.getOD_COMP_FLG())){
				struct.seth_OD_COMP_FLG("1");
			}else{
				struct.seth_OD_COMP_FLG("0");
			}
			entity.mT_PROJECT.create(conn, struct);
			
			// ����
			controlselect();
			//�R�����g
			conn.commit();
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			keyMessage = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
			setSqlExceptionMsg(e, keyMessage);
		}catch(Exception e){
			setErrorMessage("ZZ01106");
			return;
		}finally{
            if (conn != null) {
                conn.rollback();
               }
              }
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//���Ӑ���̎擾
			KM0010010Struct tempInsertStruct = null;
			struct.setCOMPANY_CD(COMPANY_CD);
			List custList = entity.mCkCust1.read(conn, struct);
			if(custList.isEmpty()){
				 setErrorMessage("KQ00014");
				 return ;
			}else{
				tempInsertStruct = (KM0010010Struct)custList.get(0);
			}
			conn.beginTransWeb();
			if(!operateCheck("update")){
				return;
			}
			//�X�V�r���`�F�b�N
			if(!exclusiveCheck()){
				return;
			}
			// �M�݌v�Z����(�M�݌v�Z�����Łu�����z����z�i�M�݁j�v���擾����)
			ExchAmount exch = new ExchAmount(conn);
			boolean  result = exch.doExchAmount(
					struct.getAssumeAmount(),                              //�����z����z
					COMPANY_CD,
					tempInsertStruct.getCUR_CD(), 
					tempInsertStruct.getEXCH_TYP(), 
					tempInsertStruct.getDETAIL_ROUND_TYP(), 
					_businessOprDate);                                     // �Ɩ��^�p��
			if (!result) {
				setErrorMessage("KQ00038");
				return;
			}
		    String	dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());  // �����z����z�i�M�݁j
			struct.setASSUME_AMOUNT_EXCH_RATES(dExchAmount);
			
			//�\�Z�Ϗ㊮���t���O
			if("true".equals(struct.getOD_COMP_FLG())){
				struct.seth_OD_COMP_FLG("1");
			}else{
				struct.seth_OD_COMP_FLG("0");
			}
			entity.mT_PROJECT.update(conn, struct);
			//�R�~�b�g
			conn.commit();
			// ����
			controlselect();	
		} catch(SQLException ee) {
			// �G���[���b�Z�[�W�쐬
			keyMessage = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
			setSqlExceptionMsg(ee, keyMessage);
		} catch(Exception e){
			setErrorMessage("ZZ01106");
			return;
		}finally{
            if (conn != null) {
                conn.rollback();
               }
              }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {			
			conn.beginTransWeb();
			//�폜�r���`�F�b�N
			if(!exclusiveCheck()){
				return;
			}
			entity.mdelProject.update(conn, struct);
			//�R�~�b�g
			conn.commit();
	    	struct.initialize();
			initializeDetail();
			setReadStatus(INITIAL);
		} catch(SQLException ee) {
			// �G���[���b�Z�[�W�쐬
			keyMessage = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
			setSqlExceptionMsg(ee, keyMessage);
		}finally{
            if (conn != null) {
                conn.rollback();
               }
              }
                //}}user_implement_dev:<controldelete>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
    	    struct.initialize();
		    initializeDetail();

			// ������Ԃ��u������ԁv�ɐݒ�
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlclear>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{

			// �R���{�{�b�N�X�f�[�^�p��
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			_PROJECT_STAT = controller.getData("PROJECT_STAT");
			_ACCURACY_LEVEL = controller.getData("ACCURACY_LEVEL");
			_ODR_COMP_FLG = controller.getData("ODR_COMP_FLG");
		    //�󒍕���01�`12�����ޖ���
	        _PJ_CLASS_01_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD01,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_02_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD02,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_03_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD03,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_04_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD04,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_05_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD05,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_06_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD06,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_07_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD07,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_08_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD08,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_09_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD09,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_10_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD10,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_11_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD11,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_12_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD12,KM0010Common.CLASS_CD00);

			// ���ރ}�X�^��01�`12
			struct.setPJ_CLASS_01_TYP(_PJ_CLASS_01_TYP);
			struct.setPJ_CLASS_02_TYP(_PJ_CLASS_02_TYP);
			struct.setPJ_CLASS_03_TYP(_PJ_CLASS_03_TYP);
			struct.setPJ_CLASS_04_TYP(_PJ_CLASS_04_TYP);
			struct.setPJ_CLASS_05_TYP(_PJ_CLASS_05_TYP);
			struct.setPJ_CLASS_06_TYP(_PJ_CLASS_06_TYP);
			struct.setPJ_CLASS_07_TYP(_PJ_CLASS_07_TYP);
			struct.setPJ_CLASS_08_TYP(_PJ_CLASS_08_TYP);
			struct.setPJ_CLASS_09_TYP(_PJ_CLASS_09_TYP);
			struct.setPJ_CLASS_10_TYP(_PJ_CLASS_10_TYP);
			struct.setPJ_CLASS_11_TYP(_PJ_CLASS_11_TYP);
			struct.setPJ_CLASS_12_TYP(_PJ_CLASS_12_TYP);
		    
		    struct.copy(struct);
		    
		    //��ʂ�������
		    struct.setPJ_USER_CD(sysUSER_CD);
		    
			// =======================================
			// ���Џ��̎擾
			// =======================================
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,struct);
			if(listCompanyInfo.isEmpty() || listCompanyInfo.size()!= 1 ){
				//���Џ�񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KQ00039");
	            msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
	            sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
	            ExpjException ee = new ExpjException(emsg);
	            throw ee;
			}else{
				COMPANY_CD = ((KM0010010Struct)listCompanyInfo.get(0)).getCOMPANY_CD();
				struct.setCOMPANY_CD(COMPANY_CD);
			}
			//// �Ɩ��^�p���̎擾
			_businessOprDate = DateCtrlControl.getData(conn, this.sysPLANT_CD).getBUSINESS_OPR_DATE();
			struct.setVend_Date(_businessOprDate);
		} catch(SQLException e) {
			// �G���[�������L�q���Ă��������B
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			msgStruct.addError(emsg);
			throw ee;
		}catch(DataNotFoundException e){
			ExpjMessage emsg = new ExpjMessage( "KQ00026" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// �R���{�{�b�N�X�f�[�^�ݒ�
			struct.setList_PROJECT_STAT_val(_PROJECT_STAT.getValList());
			struct.setList_PROJECT_STAT_name(_PROJECT_STAT.getExplanList());
			struct.setList_ACCURACY_LEVEL_val(_ACCURACY_LEVEL.getValList());
			struct.setList_ACCURACY_LEVEL_name(_ACCURACY_LEVEL.getExplanList());

			// ���ރ}�X�^��01�`12
			struct.setPJ_CLASS_01_TYP(_PJ_CLASS_01_TYP);
			struct.setPJ_CLASS_02_TYP(_PJ_CLASS_02_TYP);
			struct.setPJ_CLASS_03_TYP(_PJ_CLASS_03_TYP);
			struct.setPJ_CLASS_04_TYP(_PJ_CLASS_04_TYP);
			struct.setPJ_CLASS_05_TYP(_PJ_CLASS_05_TYP);
			struct.setPJ_CLASS_06_TYP(_PJ_CLASS_06_TYP);
			struct.setPJ_CLASS_07_TYP(_PJ_CLASS_07_TYP);
			struct.setPJ_CLASS_08_TYP(_PJ_CLASS_08_TYP);
			struct.setPJ_CLASS_09_TYP(_PJ_CLASS_09_TYP);
			struct.setPJ_CLASS_10_TYP(_PJ_CLASS_10_TYP);
			struct.setPJ_CLASS_11_TYP(_PJ_CLASS_11_TYP);
			struct.setPJ_CLASS_12_TYP(_PJ_CLASS_12_TYP);
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
//			throw new FoundationException("KM0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KM0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KM0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KM0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KM0010010Entity entity;
	protected KM0010010Struct struct;
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

		entity = new KM0010010Entity();
		struct = new KM0010010Struct();

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
	 * KM0010010�N���X�̕W���R���X�g���N�^
	 */
	public KM0010010Control() throws BusinessProcessException, FoundationException
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
				KM0010010Struct key = (KM0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PROJECT_CD") && key.geth_PROJECT_CD() != null) {
					msgKey.setKeyValue("h_PROJECT_CD", key.geth_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT_name") && key.getPROJECT_STAT_name() != null) {
					msgKey.setKeyValue("PROJECT_STAT_name", key.getPROJECT_STAT_name());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT_val") && key.getPROJECT_STAT_val() != null) {
					msgKey.setKeyValue("PROJECT_STAT_val", key.getPROJECT_STAT_val());
				}
				if(msgKeyType.containsKeyColumn("COMPLETE_STAT") && key.getCOMPLETE_STAT() != null) {
					msgKey.setKeyValue("COMPLETE_STAT", key.getCOMPLETE_STAT());
				}
				if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_name") && key.getACCURACY_LEVEL_name() != null) {
					msgKey.setKeyValue("ACCURACY_LEVEL_name", key.getACCURACY_LEVEL_name());
				}
				if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_val") && key.getACCURACY_LEVEL_val() != null) {
					msgKey.setKeyValue("ACCURACY_LEVEL_val", key.getACCURACY_LEVEL_val());
				}
				if(msgKeyType.containsKeyColumn("OD_COMP_FLG") && key.getOD_COMP_FLG() != null) {
					msgKey.setKeyValue("OD_COMP_FLG", key.getOD_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_01_TYP") && key.getPJ_CLASS_01_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_01_TYP", key.getPJ_CLASS_01_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_01_NAME") && key.getPJ_CLASS_01_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_01_NAME", key.getPJ_CLASS_01_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_02_TYP") && key.getPJ_CLASS_02_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_02_TYP", key.getPJ_CLASS_02_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_02_NAME") && key.getPJ_CLASS_02_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_02_NAME", key.getPJ_CLASS_02_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_03_TYP") && key.getPJ_CLASS_03_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_03_TYP", key.getPJ_CLASS_03_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_03_NAME") && key.getPJ_CLASS_03_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_03_NAME", key.getPJ_CLASS_03_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_04_TYP") && key.getPJ_CLASS_04_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_04_TYP", key.getPJ_CLASS_04_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_04_NAME") && key.getPJ_CLASS_04_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_04_NAME", key.getPJ_CLASS_04_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_05_TYP") && key.getPJ_CLASS_05_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_05_TYP", key.getPJ_CLASS_05_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_05_NAME") && key.getPJ_CLASS_05_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_05_NAME", key.getPJ_CLASS_05_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_06_TYP") && key.getPJ_CLASS_06_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_06_TYP", key.getPJ_CLASS_06_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_06_NAME") && key.getPJ_CLASS_06_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_06_NAME", key.getPJ_CLASS_06_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_07_TYP") && key.getPJ_CLASS_07_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_07_TYP", key.getPJ_CLASS_07_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_07_NAME") && key.getPJ_CLASS_07_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_07_NAME", key.getPJ_CLASS_07_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_08_TYP") && key.getPJ_CLASS_08_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_08_TYP", key.getPJ_CLASS_08_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_08_NAME") && key.getPJ_CLASS_08_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_08_NAME", key.getPJ_CLASS_08_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_09_TYP") && key.getPJ_CLASS_09_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_09_TYP", key.getPJ_CLASS_09_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_09_NAME") && key.getPJ_CLASS_09_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_09_NAME", key.getPJ_CLASS_09_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_10_TYP") && key.getPJ_CLASS_10_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_10_TYP", key.getPJ_CLASS_10_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_10_NAME") && key.getPJ_CLASS_10_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_10_NAME", key.getPJ_CLASS_10_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_11_TYP") && key.getPJ_CLASS_11_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_11_TYP", key.getPJ_CLASS_11_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_11_NAME") && key.getPJ_CLASS_11_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_11_NAME", key.getPJ_CLASS_11_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_12_TYP") && key.getPJ_CLASS_12_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_12_TYP", key.getPJ_CLASS_12_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_12_NAME") && key.getPJ_CLASS_12_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_12_NAME", key.getPJ_CLASS_12_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD_FLG") && key.getPROJECT_CD_FLG() != null) {
					msgKey.setKeyValue("PROJECT_CD_FLG", key.getPROJECT_CD_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_PROJECT_STAT") && key.geth_PROJECT_STAT() != null) {
					msgKey.setKeyValue("h_PROJECT_STAT", key.geth_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE") && key.geth_ESTIMATE() != null) {
					msgKey.setKeyValue("h_ESTIMATE", key.geth_ESTIMATE());
				}
				if(msgKeyType.containsKeyColumn("h_COMPLETE_STAT") && key.geth_COMPLETE_STAT() != null) {
					msgKey.setKeyValue("h_COMPLETE_STAT", key.geth_COMPLETE_STAT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL") && key.getACCURACY_LEVEL() != null) {
					msgKey.setKeyValue("ACCURACY_LEVEL", key.getACCURACY_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("Vend_Date") && key.getVend_Date() != null) {
					msgKey.setKeyValue("Vend_Date", key.getVend_Date());
				}
				if(msgKeyType.containsKeyColumn("AssumeDlv_date") && key.getAssumeDlv_date() != null) {
					msgKey.setKeyValue("AssumeDlv_date", key.getAssumeDlv_date());
				}
				if(msgKeyType.containsKeyColumn("AssumeAmount") && key.getAssumeAmount() != null) {
					msgKey.setKeyValue("AssumeAmount", key.getAssumeAmount());
				}
				if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT_EXCH_RATES") && key.getASSUME_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("ASSUME_AMOUNT_EXCH_RATES", key.getASSUME_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_ORG_CD") && key.getPJ_ORG_CD() != null) {
					msgKey.setKeyValue("PJ_ORG_CD", key.getPJ_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_USER_CD") && key.getPJ_USER_CD() != null) {
					msgKey.setKeyValue("PJ_USER_CD", key.getPJ_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("REMARKS1") && key.getREMARKS1() != null) {
					msgKey.setKeyValue("REMARKS1", key.getREMARKS1());
				}
				if(msgKeyType.containsKeyColumn("REMARKS2") && key.getREMARKS2() != null) {
					msgKey.setKeyValue("REMARKS2", key.getREMARKS2());
				}
				if(msgKeyType.containsKeyColumn("REMARKS3") && key.getREMARKS3() != null) {
					msgKey.setKeyValue("REMARKS3", key.getREMARKS3());
				}
				if(msgKeyType.containsKeyColumn("REMARKS4") && key.getREMARKS4() != null) {
					msgKey.setKeyValue("REMARKS4", key.getREMARKS4());
				}
				if(msgKeyType.containsKeyColumn("REMARKS5") && key.getREMARKS5() != null) {
					msgKey.setKeyValue("REMARKS5", key.getREMARKS5());
				}
				if(msgKeyType.containsKeyColumn("h_OD_COMP_FLG") && key.geth_OD_COMP_FLG() != null) {
					msgKey.setKeyValue("h_OD_COMP_FLG", key.geth_OD_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_01_CD") && key.getPJ_CLASS_01_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_01_CD", key.getPJ_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_02_CD") && key.getPJ_CLASS_02_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_02_CD", key.getPJ_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_03_CD") && key.getPJ_CLASS_03_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_03_CD", key.getPJ_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_04_CD") && key.getPJ_CLASS_04_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_04_CD", key.getPJ_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_05_CD") && key.getPJ_CLASS_05_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_05_CD", key.getPJ_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_06_CD") && key.getPJ_CLASS_06_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_06_CD", key.getPJ_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_07_CD") && key.getPJ_CLASS_07_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_07_CD", key.getPJ_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_08_CD") && key.getPJ_CLASS_08_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_08_CD", key.getPJ_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_09_CD") && key.getPJ_CLASS_09_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_09_CD", key.getPJ_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_10_CD") && key.getPJ_CLASS_10_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_10_CD", key.getPJ_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_11_CD") && key.getPJ_CLASS_11_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_11_CD", key.getPJ_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_12_CD") && key.getPJ_CLASS_12_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_12_CD", key.getPJ_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAL_NO") && key.getDETAL_NO() != null) {
					msgKey.setKeyValue("DETAL_NO", key.getDETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("Auto_PROJECT_CD") && key.getAuto_PROJECT_CD() != null) {
					msgKey.setKeyValue("Auto_PROJECT_CD", key.getAuto_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("CurUnit") && key.getCurUnit() != null) {
					msgKey.setKeyValue("CurUnit", key.getCurUnit());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE") && key.getESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("ESTIMATE_TYPE", key.getESTIMATE_TYPE());
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
					KM0010010Struct key = new KM0010010Struct();
					if(msgKeyType.containsKeyColumn("h_PROJECT_CD")) {
						key.seth_PROJECT_CD(msgKey.getKeyValue("h_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT_name")) {
						key.setPROJECT_STAT_name(msgKey.getKeyValue("PROJECT_STAT_name"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT_val")) {
						key.setPROJECT_STAT_val(msgKey.getKeyValue("PROJECT_STAT_val"));
					}
					if(msgKeyType.containsKeyColumn("COMPLETE_STAT")) {
						key.setCOMPLETE_STAT(msgKey.getKeyValue("COMPLETE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_name")) {
						key.setACCURACY_LEVEL_name(msgKey.getKeyValue("ACCURACY_LEVEL_name"));
					}
					if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_val")) {
						key.setACCURACY_LEVEL_val(msgKey.getKeyValue("ACCURACY_LEVEL_val"));
					}
					if(msgKeyType.containsKeyColumn("OD_COMP_FLG")) {
						key.setOD_COMP_FLG(msgKey.getKeyValue("OD_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_01_TYP")) {
						key.setPJ_CLASS_01_TYP(msgKey.getKeyValue("PJ_CLASS_01_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_01_NAME")) {
						key.setPJ_CLASS_01_NAME(msgKey.getKeyValue("PJ_CLASS_01_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_02_TYP")) {
						key.setPJ_CLASS_02_TYP(msgKey.getKeyValue("PJ_CLASS_02_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_02_NAME")) {
						key.setPJ_CLASS_02_NAME(msgKey.getKeyValue("PJ_CLASS_02_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_03_TYP")) {
						key.setPJ_CLASS_03_TYP(msgKey.getKeyValue("PJ_CLASS_03_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_03_NAME")) {
						key.setPJ_CLASS_03_NAME(msgKey.getKeyValue("PJ_CLASS_03_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_04_TYP")) {
						key.setPJ_CLASS_04_TYP(msgKey.getKeyValue("PJ_CLASS_04_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_04_NAME")) {
						key.setPJ_CLASS_04_NAME(msgKey.getKeyValue("PJ_CLASS_04_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_05_TYP")) {
						key.setPJ_CLASS_05_TYP(msgKey.getKeyValue("PJ_CLASS_05_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_05_NAME")) {
						key.setPJ_CLASS_05_NAME(msgKey.getKeyValue("PJ_CLASS_05_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_06_TYP")) {
						key.setPJ_CLASS_06_TYP(msgKey.getKeyValue("PJ_CLASS_06_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_06_NAME")) {
						key.setPJ_CLASS_06_NAME(msgKey.getKeyValue("PJ_CLASS_06_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_07_TYP")) {
						key.setPJ_CLASS_07_TYP(msgKey.getKeyValue("PJ_CLASS_07_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_07_NAME")) {
						key.setPJ_CLASS_07_NAME(msgKey.getKeyValue("PJ_CLASS_07_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_08_TYP")) {
						key.setPJ_CLASS_08_TYP(msgKey.getKeyValue("PJ_CLASS_08_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_08_NAME")) {
						key.setPJ_CLASS_08_NAME(msgKey.getKeyValue("PJ_CLASS_08_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_09_TYP")) {
						key.setPJ_CLASS_09_TYP(msgKey.getKeyValue("PJ_CLASS_09_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_09_NAME")) {
						key.setPJ_CLASS_09_NAME(msgKey.getKeyValue("PJ_CLASS_09_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_10_TYP")) {
						key.setPJ_CLASS_10_TYP(msgKey.getKeyValue("PJ_CLASS_10_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_10_NAME")) {
						key.setPJ_CLASS_10_NAME(msgKey.getKeyValue("PJ_CLASS_10_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_11_TYP")) {
						key.setPJ_CLASS_11_TYP(msgKey.getKeyValue("PJ_CLASS_11_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_11_NAME")) {
						key.setPJ_CLASS_11_NAME(msgKey.getKeyValue("PJ_CLASS_11_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_12_TYP")) {
						key.setPJ_CLASS_12_TYP(msgKey.getKeyValue("PJ_CLASS_12_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_12_NAME")) {
						key.setPJ_CLASS_12_NAME(msgKey.getKeyValue("PJ_CLASS_12_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD_FLG")) {
						key.setPROJECT_CD_FLG(msgKey.getKeyValue("PROJECT_CD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_PROJECT_STAT")) {
						key.seth_PROJECT_STAT(msgKey.getKeyValue("h_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE")) {
						key.seth_ESTIMATE(msgKey.getKeyValue("h_ESTIMATE"));
					}
					if(msgKeyType.containsKeyColumn("h_COMPLETE_STAT")) {
						key.seth_COMPLETE_STAT(msgKey.getKeyValue("h_COMPLETE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL")) {
						key.setACCURACY_LEVEL(msgKey.getKeyValue("ACCURACY_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("Vend_Date")) {
						key.setVend_Date(msgKey.getKeyValue("Vend_Date"));
					}
					if(msgKeyType.containsKeyColumn("AssumeDlv_date")) {
						key.setAssumeDlv_date(msgKey.getKeyValue("AssumeDlv_date"));
					}
					if(msgKeyType.containsKeyColumn("AssumeAmount")) {
						key.setAssumeAmount(msgKey.getKeyValue("AssumeAmount"));
					}
					if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT_EXCH_RATES")) {
						key.setASSUME_AMOUNT_EXCH_RATES(msgKey.getKeyValue("ASSUME_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_ORG_CD")) {
						key.setPJ_ORG_CD(msgKey.getKeyValue("PJ_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_USER_CD")) {
						key.setPJ_USER_CD(msgKey.getKeyValue("PJ_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS1")) {
						key.setREMARKS1(msgKey.getKeyValue("REMARKS1"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS2")) {
						key.setREMARKS2(msgKey.getKeyValue("REMARKS2"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS3")) {
						key.setREMARKS3(msgKey.getKeyValue("REMARKS3"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS4")) {
						key.setREMARKS4(msgKey.getKeyValue("REMARKS4"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS5")) {
						key.setREMARKS5(msgKey.getKeyValue("REMARKS5"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_COMP_FLG")) {
						key.seth_OD_COMP_FLG(msgKey.getKeyValue("h_OD_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_01_CD")) {
						key.setPJ_CLASS_01_CD(msgKey.getKeyValue("PJ_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_02_CD")) {
						key.setPJ_CLASS_02_CD(msgKey.getKeyValue("PJ_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_03_CD")) {
						key.setPJ_CLASS_03_CD(msgKey.getKeyValue("PJ_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_04_CD")) {
						key.setPJ_CLASS_04_CD(msgKey.getKeyValue("PJ_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_05_CD")) {
						key.setPJ_CLASS_05_CD(msgKey.getKeyValue("PJ_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_06_CD")) {
						key.setPJ_CLASS_06_CD(msgKey.getKeyValue("PJ_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_07_CD")) {
						key.setPJ_CLASS_07_CD(msgKey.getKeyValue("PJ_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_08_CD")) {
						key.setPJ_CLASS_08_CD(msgKey.getKeyValue("PJ_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_09_CD")) {
						key.setPJ_CLASS_09_CD(msgKey.getKeyValue("PJ_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_10_CD")) {
						key.setPJ_CLASS_10_CD(msgKey.getKeyValue("PJ_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_11_CD")) {
						key.setPJ_CLASS_11_CD(msgKey.getKeyValue("PJ_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_12_CD")) {
						key.setPJ_CLASS_12_CD(msgKey.getKeyValue("PJ_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAL_NO")) {
						key.setDETAL_NO(msgKey.getKeyValue("DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Auto_PROJECT_CD")) {
						key.setAuto_PROJECT_CD(msgKey.getKeyValue("Auto_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CurUnit")) {
						key.setCurUnit(msgKey.getKeyValue("CurUnit"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE")) {
						key.setESTIMATE_TYPE(msgKey.getKeyValue("ESTIMATE_TYPE"));
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
