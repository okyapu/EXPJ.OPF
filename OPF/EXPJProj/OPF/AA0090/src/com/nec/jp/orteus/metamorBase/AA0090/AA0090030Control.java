/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0090/src/com/nec/jp/orteus/metamorBase/AA0090/AA0090030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0090;

import com.nec.jp.orteus.metamorBase.AA0090.*;
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
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailListStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.xaf.common.XafTools;

//}}user_implement_code_import

//{{user_implement_code_header

//}}user_implement_code_header

public class AA0090030Control
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
	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	public AA0090030Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	/** ���p�҃}�X�^�e�[�u���̍X�V�� */
	private String _USER_MST_count = null;

//------------------------------------------------------------------------------

	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;
//------------------------------------------------------------------------------
		
/**������ */
	private ComboStruct _LOCALE = new ComboStruct();

	/** ������ݒ� */
	/** @param �R���{�{�b�N�X�f�[�^*/
		
	public void setLOCALE(ComboStruct combo){ _LOCALE = combo; }

	/** ������擾
	 * @return ������̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getLOCALE(){ return _LOCALE; }		
		
	private ComboStruct _APPR_POWER_TYP = new ComboStruct();
	
	public ComboStruct get_APPR_POWER_TYP() {
		return _APPR_POWER_TYP;
	}
	public void set_APPR_POWER_TYP(ComboStruct _appr_power_typ) {
		_APPR_POWER_TYP = _appr_power_typ;
	}
//---------- ���b�Z�[�W�֘A�̏���-- --------------------------------------------

	
	/**
	 * ���b�Z�[�W�擾 
	 * @@return ���b�Z�[�W
	 */
	public MessageStruct getMessage()
	{
		return msgStruct;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * @@param ���b�Z�[�W
	 */
	public void setMessage(MessageStruct msg)
	{
		msgStruct = msg;
	}

	/**
	 * SQLException���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		// emsg = new ExpjMessage( "ZZ01006", key );
		// sysLog.severe(emsg ,getsysUSER_CD()); //�G���[�ڍ�
		// ee.add(emsg);

		// emsg = new ExpjMessage( "ZZ01006", e.toString());
		// sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
		throw ee;
	}

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

//------------------------------------------------------------------

	/** �ŏI�Ǎ��L�[�i���p�҃R�[�h�j�i�[�p�ϐ� */
	private String _lastUSER_CD = "";

	/** 
	 * �ŏI�Ǎ��L�[�i���p�҃R�[�h�j�擾����
	 *
	 * @return String
	 */
	public String getLastUSER_CD()
	{
		return _lastUSER_CD;
	}

	public void setLastUSER_CD(String user_cd){
		_lastUSER_CD = user_cd;
	}
	/** ��ЃR�[�h�i�[�p�ϐ� */
	private String _COMPANY_CD = null;

	/** 
	 * ��ЃR�[�h�Ǎ�����
	 *
	 * @return boolean
	 */
	private boolean readCOMPANY_CD() throws BusinessProcessException, FoundationException
	{
		String keyMessage = "";

		try {

			List workList = new ArrayList(0);
			_COMPANY_CD = null;

			// ��ЃR�[�h�Ǎ�
			workList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			if(workList.size() <= 0){
				return false;
			}

			AA0090030Struct workStruct = (AA0090030Struct)workList.get(0);
			_COMPANY_CD = workStruct.getCOMPANY_CD();

		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

			return false;

		}

		return true;
	}

	/** 
	 * �Ɩ��^�p���Ǎ�����
	 *
	 * @return boolean
	 */
	private String readBUSINESS_OPR_DATE(String plantCd) throws BusinessProcessException, FoundationException
	{
		String businessDate = null;
		try {
			// �Ɩ��^�p���Ǎ�
			List businessList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
			if(businessList.size() > 0){
				businessDate = ((AA0090030Struct)businessList.get(0)).getBUSINESS_OPR_DATE();
			}
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			setSqlExceptionMsg(e, "");
		}
		return businessDate;
	}
	
	/** 
	 * �Ώۃf�[�^���ݔ��菈��
	 * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
	 *
	 * @param target_struct �Ώۃf�[�^
	 * @return boolean true:���݂��� false:���݂��Ȃ�
	 */
	private boolean isTargetData(AA0090030Struct target_struct) throws FoundationException, SQLException
	{
		// �����Ώۃf�[�^�̑��݃`�F�b�N
		List temp_list = new ArrayList(0);
		temp_list = entity.mselectRetry.read(conn, target_struct);
		if(temp_list.size() <= 0)
		{
			return false;
		}
		return true;
	}

	/** 
	 * �Ώۃf�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
	 * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
	 *
	 * @param target_struct �Ώۃf�[�^���
	 * @param modify_count �Ώۃf�[�^MODIFY_COUNT
	 * @return boolean true:�G���[���� false:�G���[�Ȃ�
	 */
	private boolean checkTargetData(AA0090030Struct target_struct, String modify_count) throws FoundationException, SQLException
	{
		String keyMessage = "";

		// �����Ώۃf�[�^�̑��݃`�F�b�N
		List temp_list = new ArrayList(0);
		temp_list = entity.mselectRetry.read(conn, target_struct);
		if(temp_list.size() <= 0)
		{
			// �G���[���b�Z�[�W�쐬
			keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
			setErrorMessage("ZZ06001", keyMessage);
			return true;
		}
		else
		{
			// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
			AA0090030Struct temp_struct = (AA0090030Struct)temp_list.get(0);

			if(temp_struct.getMODIFY_COUNT().equals(modify_count) != true)
			{
				// �G���[���b�Z�[�W�쐬
				keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
				setErrorMessage("ZZ01105", keyMessage);
				return true;
			}
		}

		return false;
	}

	/** 
	 * �Ɩ��O���[�v�f�[�^�o�^����
	 *
	 * @return �X�V��
	 */
	private void insertBusinessGroup() throws FoundationException, SQLException {
		List _flgs = struct.getList_BUSINESS_GROUP_VALID_FLG();
		List _ids = struct.getList_BUSINESS_GROUP_CD();

		for (int idx = 0; idx < _ids.size(); idx++) {
			String _flg = (String) _flgs.get(idx);
			String _id = (String) _ids.get(idx);

			// �������Ă��Ȃ�����͓o�^���Ȃ�
			if (("true").equals(_flg) == false) {
				continue;
			}

			// �o�^����Ɩ��O���[�v��ݒ肵�A�o�^����
			AA0090030Struct _createStruct = new AA0090030Struct();
			_createStruct.basicCopy(struct);
			_createStruct.setStruct(struct);

			_createStruct.setBUSINESS_GROUP_CD(_id);

			entity.minsertBELONG_MST_BY_USER.create(conn, _createStruct);

		}
		return;
	}

// ------------------------------------------------------------------

	/** ��\���Ɩ��O���[�v���A�N�Z�X�L�[ */
	private final static String _DISABLE_BUSINESS_GROUP_ACCESS_KEY = "DISABLE_BUSINESS_G";

	/** �Ɩ��O���[�v�f�[�^�i�[�p */
	private List _listBusinessGroup = null;

	/** 
	 * �Ɩ��O���[�v���X�g�T�C�Y�擾
	 *
	 * @return size �Ɩ��O���[�v���X�g�T�C�Y
	 */
	public int getBusinessGroupListSize()
	{
		int num = 0;
		if(_listBusinessGroup != null)
		{
			num = _listBusinessGroup.size();
		}
		return num;
	}

	/** 
	 * �w�肳�ꂽ�Ɩ��O���[�v���X�g�f�[�^�擾
	 *
	 * @param index
	 * @return Object �Ɩ��O���[�v���X�g�f�[�^
	 */
	public Object getBusinessGroupListValue(int index)
	{
		return _listBusinessGroup.get(index);
	}




	/** �Ɩ��O���[�v�f�[�^�i�[�p�i�w�胆�[�U�p�j */
	private List _listBusinessGroupByUser = null;

	/** 
	 * �Ɩ��O���[�v���X�g�T�C�Y�擾�i�w�胆�[�U�p�j
	 *
	 * @return size �Ɩ��O���[�v���X�g�T�C�Y
	 */
	public int getBusinessGroupListSizeByUser()
	{
		int num = 0;
		if(_listBusinessGroupByUser != null)
		{
			num = _listBusinessGroupByUser.size();
		}
		return num;
	}

	/** 
	 * �w�肳�ꂽ�Ɩ��O���[�v���X�g�f�[�^�擾�i�w�胆�[�U�p�j
	 *
	 * @param index
	 * @return Object �Ɩ��O���[�v���X�g�f�[�^
	 */
	public Object getBusinessGroupListValueByUser(int index)
	{
		return _listBusinessGroupByUser.get(index);
	}

	/**
	 * �J�ڗތ^�@
	 * 0:�@�}�X�^���
	 * 1:�@���F���
	 */
	private String screen_move_typ = null;
	
	/**
	 * @return Returns the screen_move_typ.
	 */
	public String getScreen_move_typ() {
		return screen_move_typ;
	}
	/**
	 * @param screen_move_typ The screen_move_typ to set.
	 */
	public void setScreen_move_typ(String screen_move_typ) {
		this.screen_move_typ = screen_move_typ;
	}
	
	/**
	 * �}�X�^�L�[�̏W��
	 */
	private HashMap keyvalueMap = new HashMap();
	
	/**
	 * @return Returns the keyvalueMap.
	 */
	public HashMap getKeyvalueMap() {
		return keyvalueMap;
	}
	/**
	 * @param keyvalueMap The keyvalueMap to set.
	 */
	public void setKeyvalueMap(HashMap keyvalueMap) {
		this.keyvalueMap = keyvalueMap;
	}
	/** ���p�ҏ��F */
	private String _APR_USER_MST = null;
		
	/**
	 * �o�^/�X�V�� �ˑ��}�X�^�̃`�F�b�N
	 * ���b�Z�[�W�o�^/�֘A���ڂ̃N���A���s��
	 * @return true:OK / false:NG
	 */
	private boolean existDependsMaster() throws SQLException, FoundationException
	{
		boolean result = true;
		String keyMessage = "";

		// �H��R�[�h���݃`�F�b�N
		List temp_list = entity.mselectM_PLANT.read(conn, struct);
		if(temp_list.size() <= 0)
		{
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
			setErrorMessage("AA01012", keyMessage);
			struct.setPLANT_NAME("");
			result = false;
		}
		
		// ����R�[�h���ݒ肳��Ă���ꍇ�͂̑��݃`�F�b�N���s��
		if (struct.getSECTION_CD() != null && !"".equals(struct.getSECTION_CD())) {
		 	struct.setCOMPANY_CD(_COMPANY_CD);
			temp_list = entity.mselectM_ORG.read(conn, struct);
			if(temp_list.size() <= 0)
			{
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_ORG.ORG_CD:" + struct.getSECTION_CD();
				setErrorMessage("AA20054", keyMessage);
				struct.setPLANT_NAME("");
				result = false;
			}
		}
		return result;
	}

	/**
	 * �폜�� ���Ӑ�}�X�^�̈ˑ��̃`�F�b�N
	 * @return true:OK / false:NG
	 */
	private boolean existDependsMasterForDel() throws SQLException, FoundationException
	{
		boolean result = true;
		String keyMessage = "";

		// ���Ӑ�}�X�^.���ВS���҃R�[�h���݃`�F�b�N
		List temp_list = entity.mselectM_CUST.read(conn, struct);
		if(temp_list.size() > 0)
		{
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_CUST.OWN_PERSON_CD:" + ((AA0090030Struct)temp_list.get(0)).getOWN_PERSON_CD();
			setErrorMessage("AA01017", keyMessage);
			result = false;
		}

		// ���Ӑ�x�X.���ВS���҃R�[�h���݃`�F�b�N
		temp_list = entity.mselectM_CUST_BRANCH.read(conn, struct);
		if(temp_list.size() > 0)
		{
			// �G���[���b�Z�[�W�쐬
			keyMessage = "USER_MST.USER_CD:" + ((AA0090030Struct)temp_list.get(0)).getOWN_PERSON_CD();
			setErrorMessage("AA02015", keyMessage);
			result = false;
		}
		return result;
	}


	/**
	 * �`�F�b�N�{�b�N�X�̏������Ƀ��X�g��
	 * �č쐬����
	 */
	private void reMakeList()
	{
		list.clear();
		for(int i = 0; i < struct.getList_BUSINESS_GROUP_VALID_FLG().size(); i++) {
		
			AA0090030Struct tmpStruct = new AA0090030Struct();
			
			// �I���s�̏����擾
        	tmpStruct.importData(struct, i);
			
			list.add(tmpStruct);
		
		}
	}
	
	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setInfoMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}
	
	/**
	 * ��ʑJ�ڎ��A�L�[�̎擾
	 *
	 */
	private void getKey(){
		struct.setUSER_CD(keyvalueMap.get("USER_CD").toString());
	}
	/**
	 * ���F����o�^
	 * @param button
	 * @throws SQLException
	 */
	private void insertAppr(String button) throws SQLException{
		// �}�X�^���F���i
		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0090030","AA0090030Servlet");
		String appr_ID = null;                             // ���FID��ۑ��p�̗Վ��ϐ� 
		MstApprStruct mstApprStruct = new MstApprStruct(); // 
		String columnID = null;                            //
		MstApprKeyStruct keyStruct = new MstApprKeyStruct();
		// 	���F�˗����݃`�F�b�N
		ArrayList keyvalueList = new ArrayList();
		MstColumns keyvalue = new MstColumns();
		keyvalue.setColumnname("USER_CD");
		keyvalue.setColumnvalue(struct.getUSER_CD());
		keyvalueList.add(keyvalue);
		if(mstappr.checkMST_APPR("USER_MST",keyvalueList)){
			setErrorMessage("KA00125");
			return;
		}
		
		// 	���F�˗��\�Ƀf�[�^��ǉ�	
		mstApprStruct.setSCREEN_URL("AA0090030Servlet");          // ���URL
		mstApprStruct.setPLANT_CD(this.getsysPLANT_CD());         // �H��̎��ʃR�[�h�B
		if("insert".equals(button)){
			mstApprStruct.setPROC_TYP("1");                       // �o�^
		}
		if("update".equals(button)){
			mstApprStruct.setPROC_TYP("2");                       // �X�V
		}
		if("delete".equals(button)){
			mstApprStruct.setPROC_TYP("3");                       // �폜
		}
		mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   // ���F���l
		mstApprStruct.setSTATUS("1");                              // ��ԋ敪
		mstApprStruct.setREQUEST_BY(struct.getsUser_ID());         // �˗���
		appr_ID = mstappr.insertMST_APPR(mstApprStruct);
		
		// ���F�L�[�Ή��\�o�^
		keyStruct.setAPPR_ID(appr_ID);
		keyStruct.setTABLE_NAME("USER_MST");
		keyStruct.setKEY_NAME("USER_CD");
		keyStruct.setKEY_VALUE(struct.getUSER_CD());
		mstappr.insertMST_APPR_KEY(keyStruct);
		
		// ���F���ו\�Ƀ}�X�^����ǉ�
		String nowdate = mstappr.readSystemDateTime();
		// ���p�҃}�X�^�𐮗�	
		// ���[�U�R�[�h
		columnID = mstappr.getColumnID("USER_MST","USER_CD");
		mstappr.setDetailByColumnID(struct.getUSER_CD(),columnID);
		// ���[�U��
		columnID = mstappr.getColumnID("USER_MST","USER_NAME");
		mstappr.setDetailByColumnID(struct.getUSER_NAME(),columnID);
		// �H��R�[�h
		columnID = mstappr.getColumnID("USER_MST","PLANT_CD");
		mstappr.setDetailByColumnID(struct.getPLANT_CD(),columnID);
		// �p�X���[�h
		columnID = mstappr.getColumnID("USER_MST","PASSWORD");
		mstappr.setDetailByColumnID(struct.getPASSWORD(),columnID);
		// ��ЃR�[�h
		columnID = mstappr.getColumnID("USER_MST","COMPANY_CD");
		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
		// ���[���A�h���X
		columnID = mstappr.getColumnID("USER_MST","ADDRESS");
		mstappr.setDetailByColumnID(struct.getADDRESS(),columnID);
		// ������
		columnID = mstappr.getColumnID("USER_MST","LOCALE");
		mstappr.setDetailByColumnID(struct.getLOCALE(),columnID);
		// ���F����
		columnID = mstappr.getColumnID("USER_MST","APPR_POWER_TYP");
		mstappr.setDetailByColumnID(struct.getAPPR_POWER_TYP(),columnID);
		// �p�X���[�h�ύX��
		columnID = mstappr.getColumnID("USER_MST","PASSWORD_CHG_DATE");
		mstappr.setDetailByColumnID(struct.getPASSWORD_CHG_DATE(),columnID);
		// ���R�[�h
		columnID = mstappr.getColumnID("USER_MST","SECTION_CD");
		mstappr.setDetailByColumnID(struct.getSECTION_CD(),columnID);
		// �쐬��
		columnID = mstappr.getColumnID("USER_MST","CREATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// �쐬��
		columnID = mstappr.getColumnID("USER_MST","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �쐬�v���O������
		columnID = mstappr.getColumnID("USER_MST","CREATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0090030",columnID);
		// �X�V��
		columnID = mstappr.getColumnID("USER_MST","UPDATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// �X�V��
		columnID = mstappr.getColumnID("USER_MST","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �X�V�v���O������
		columnID = mstappr.getColumnID("USER_MST","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0090030",columnID);
		// �X�V��
		columnID = mstappr.getColumnID("USER_MST","MODIFY_COUNT");
		mstappr.setDetailByColumnID("0",columnID);
		
		// ���F���ׂɃf�[�^��ǉ�����B
		mstappr.insertMST_APPR_DETAIL("USER_MST",appr_ID);
		
		// �����Ɩ��O���[�v�f�[�^�𐮗�
		List _flgs = struct.getList_BUSINESS_GROUP_VALID_FLG();
		List _ids = struct.getList_BUSINESS_GROUP_CD();	
		for(int idx = 0; idx < _ids.size(); idx++)
		{
			String _flg = (String)_flgs.get(idx);
			String _id = (String)_ids.get(idx);
			// �������Ă��Ȃ�����͓o�^���Ȃ�
			if(("true").equals(_flg) == false ){
				continue;
			}
			// �o�^����Ɩ��O���[�v��ݒ肵�A�o�^����
			AA0090030Struct _createStruct = new AA0090030Struct();
			_createStruct.basicCopy(struct);
			_createStruct.setStruct(struct);
			_createStruct.setBUSINESS_GROUP_CD(_id);
	        //�@�Ɩ��O���[�v�R�[�h
			columnID = mstappr.getColumnID("BELONG_MST","BUSINESS_GROUP_CD");
			mstappr.setListByColumnID(_createStruct.getBUSINESS_GROUP_CD(),columnID);
			// ���[�U�R�[�h
			columnID = mstappr.getColumnID("BELONG_MST","USER_CD");
			mstappr.setListByColumnID(_createStruct.getUSER_CD(),columnID);
			// �쐬��
			columnID = mstappr.getColumnID("BELONG_MST","CREATED_DATE");
			mstappr.setListByColumnID(nowdate,columnID);
			// �쐬��
			columnID = mstappr.getColumnID("BELONG_MST","CREATED_BY");
			mstappr.setListByColumnID(this.getsysUSER_CD(),columnID);
			// �쐬�v���O������
			columnID = mstappr.getColumnID("BELONG_MST","CREATED_PRG_NM");
			mstappr.setListByColumnID("AA0090030",columnID);
			// �X�V��
			columnID = mstappr.getColumnID("BELONG_MST","UPDATED_DATE");
			mstappr.setListByColumnID(nowdate,columnID);
			// �X�V��
			columnID = mstappr.getColumnID("BELONG_MST","UPDATED_BY");
			mstappr.setListByColumnID(this.getsysUSER_CD(),columnID);
			// �X�V�v���O������
			columnID = mstappr.getColumnID("BELONG_MST","UPDATED_PRG_NM");
			mstappr.setListByColumnID("AA0090030",columnID);
			// �X�V��
			columnID = mstappr.getColumnID("BELONG_MST","MODIFY_COUNT");
			mstappr.setListByColumnID("0",columnID);

			// ���F�����ׂɃf�[�^��ǉ�����B
			mstappr.insertMST_APPR_DETAIL_LIST("BELONG_MST",appr_ID,Integer.toString(idx));		
		}
		setInfoMessage("AZ00042");
	}
		
//------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0090030","AA0090030Servlet");
		String keyMessage = "";
		try {
			// ����
			List temp_list = null;
			struct.setCOMPANY_CD(_COMPANY_CD);
			// ERROR�t���O�N���A
			struct.seth_INSERT_ERROR_FLG(null);
			// �J�ڂ��鎞
			if(screenMoveFlg){
				// ���F��ʂ́u���F��v�{�^������J�ڂ��鎞
				if("1".equals(struct.geth_SCREENMOVE_TYP())){
					temp_list = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
				}else{ //  ���F��ʂ́u���F�O�v�{�^������J�ڂ��鎞
					temp_list = entity.mselect.read(conn, struct);
				}
			}else{ 
				// ����̓Ǎ�
				temp_list = entity.mselect.read(conn, struct);
			}
			
			// ��������0���̏ꍇ
			if(temp_list.size() <= 0){
				// �G���[���b�Z�[�W�쐬
				keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
				setErrorMessage("ZZ01101", keyMessage);

				// �f�[�^�����݂��Ȃ��ꍇ�̃N���A����
				String w_userCd = struct.getUSER_CD();	// �L�[���̑ޔ�
				String h_APR_USER_MST = struct.geth_APR_USER_MST();
				controlclear();
				struct.setUSER_CD(w_userCd);			// �L�[���̐ݒ�
				struct.seth_APR_USER_MST(h_APR_USER_MST);

				// ���[�U�p�Ɩ��O���[�v�f�[�^���X�g�̏�����
				if(_listBusinessGroupByUser != null)
				{
					_listBusinessGroupByUser.clear();
				}
				else
				{
					_listBusinessGroupByUser = new ArrayList(0);
				}

				// �X�V��������
				_USER_MST_count = null;
			}
			else
			{
				_listBusinessGroupByUser = new ArrayList();
				// �w�胆�[�U�̋Ɩ��O���[�v���擾
				if("1".equals(struct.geth_APR_USER_MST()) && "1".equals(struct.geth_SCREENMOVE_TYP())){
					List tempList = mstappr.selectMST_APPR_DETAIL_LIST(struct.geth_APPR_ID());
					MstApprDetailListStruct apprStruct = new MstApprDetailListStruct();
					// ���F�����ו\�̍���ID�����肷��B
					String columnID = null;
					columnID = mstappr.getColumnID("BELONG_MST","BUSINESS_GROUP_CD");
					for(int i=0;i<tempList.size();i++){
						apprStruct = (MstApprDetailListStruct) tempList.get(i);
						AA0090030Struct opfStruct = new AA0090030Struct();
						opfStruct.setBUSINESS_GROUP_CD(mstappr.getListByColumnID(apprStruct,columnID));
						_listBusinessGroupByUser.add(opfStruct);
						
					}
				}else{
					_listBusinessGroupByUser = entity.mselectBELONG_MST_BY_USER.read(conn, struct);
				}
			}

			// �G���[���Ȃ��ꍇ�A�Ǎ����ݒ菈��
			if(msgStruct.sizeError() <= 0)
			{
				// ���X�g�N���A
				if(list != null){
					list.clear();
				}
				else {
					list = new ArrayList(0);
				}

				// �ǂݍ��񂾃f�[�^���擾
				AA0090030Struct workStruct = new AA0090030Struct();
				if("1".equals(struct.geth_APR_USER_MST()) && "1".equals(struct.geth_SCREENMOVE_TYP())){
					MstApprDetailStruct tempStruct = (MstApprDetailStruct) temp_list.get(0);
					String columnID = null;
					// ���[�U�ԍ�
					columnID = mstappr.getColumnID( "USER_MST", "USER_CD");
					workStruct.setUSER_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// ���[�U����
					columnID = mstappr.getColumnID( "USER_MST", "USER_NAME");
					workStruct.setUSER_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �H��R�[�h
					columnID = mstappr.getColumnID( "USER_MST", "PLANT_CD");
					workStruct.setPLANT_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					// �H�ꖼ
					List templist = entity.mselectM_PLANT.read(conn, workStruct);
					if(!templist.isEmpty()){
						workStruct.setPLANT_NAME(((AA0090030Struct)templist.get(0)).getPLANT_NAME());
					}
					
					// �p�X���[�h
					columnID = mstappr.getColumnID( "USER_MST", "PASSWORD");
					workStruct.setPASSWORD(mstappr.getDetailByColumnID(tempStruct,columnID));
					// �`�F�b�N�g�p�̃p�X���[�h
					workStruct.seth_PASSWORD(workStruct.getPASSWORD());

					// ���[���A�h���X
					columnID = mstappr.getColumnID( "USER_MST", "ADDRESS");
					workStruct.setADDRESS(mstappr.getDetailByColumnID(tempStruct,columnID));

					// ���F����
					columnID = mstappr.getColumnID( "USER_MST", "APPR_POWER_TYP");
					workStruct.setAPPR_POWER_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// ������
					columnID = mstappr.getColumnID( "USER_MST", "LOCALE");
					workStruct.setLOCALE(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// ���R�[�h
					columnID = mstappr.getColumnID( "USER_MST", "SECTION_CD");
					workStruct.setSECTION_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// ������
					columnID = mstappr.getColumnID( "USER_MST", "ORG_NAME");
					workStruct.setCOMPANY_CD(_COMPANY_CD);
					List nameList = entity.mselectM_ORG.read(conn, workStruct);
					if(!nameList.isEmpty()){
						workStruct.setORG_NAME(((AA0090030Struct)nameList.get(0)).getORG_NAME());
					}
					
					// �p�X���[�h�ύX��
					columnID = mstappr.getColumnID( "USER_MST", "PASSWORD_CHG_DATE");
					workStruct.setPASSWORD_CHG_DATE(mstappr.getDetailByColumnID(tempStruct,columnID));
					
				} else {
					workStruct = (AA0090030Struct) temp_list.get(0);

					// ��ʑJ�ڃt���O
					workStruct.seth_SCREENMOVE_TYP("0");
					// �`�F�b�N�g�p�̃p�X���[�h
					workStruct.seth_PASSWORD(workStruct.getPASSWORD());
				}
				// MODIFY_COUNT��ޔ�
				_USER_MST_count = workStruct.getMODIFY_COUNT();

				// �Ǎ��f�[�^��struct�փR�s�[
				struct.copy(workStruct);
				//�R���{�{�b�N�X�p�f�[�^�擾
				StringTokenizer std;
				int size = 0;
				int losize = 0;
				String loca = null;
				String[]  lolist = null;
				if (struct.getLOCALE() != null){
					while(losize < _LOCALE.size()){
						lolist = _LOCALE.getData(losize);
						while( size<lolist.length){
							if(!lolist[size].equals("")){
								std = new StringTokenizer(lolist[size],":");
								loca = std.nextToken();
								if(struct.getLOCALE().equals(loca)){
									struct.setLOCALE(lolist[size]);
								}
							}
							size++;
						}
						size = 0;
						losize++;
					}
				}
				
				// ��������Ɩ��O���[�v�̈ꗗ�𐶐�
				List belongGroupList = new ArrayList();
				for(int n = 0; n < _listBusinessGroupByUser.size(); n++)
				{
					AA0090030Struct belongGroupStruct = (AA0090030Struct)_listBusinessGroupByUser.get(n);
					belongGroupList.add(belongGroupStruct.getBUSINESS_GROUP_CD());
				}
				// �\���plist�Ɏ擾�����Ɩ��ꗗ��ݒ肵�A�������镔��Ƀ`�F�b�N��t����
				for(int i = 0; i < _listBusinessGroup.size(); i++)
				{
					AA0090030Struct temp_struct = new AA0090030Struct();
					temp_struct.setStructM((AA0090030Struct)_listBusinessGroup.get(i));

					if(belongGroupList.contains(temp_struct.getBUSINESS_GROUP_CD())){

						temp_struct.setBUSINESS_GROUP_VALID_FLG("true");
					}else{

						temp_struct.setBUSINESS_GROUP_VALID_FLG("NULL");
					}
					list.add(temp_struct);
				}

				// �ŏI�Ǎ��L�[�i���p�҃R�[�h�j�Ƃ��đޔ�����
				_lastUSER_CD = struct.getUSER_CD();

				// �p�X���[�h�i�V�K�j������Ƃ��́A��ɂ���B
				struct.setNEW_PASSWORD("");
				
				// ������Ԃ��u�Ǎ������v�ɐݒ�
				setReadStatus(NORMAL);
			}
			else
			{
				// ������Ԃ�������Ԃ�
				setReadStatus(INITIAL);
			}
		} catch(SQLException e) {

			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			// �G���[���b�Z�[�W�쐬
			keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
			setSqlExceptionMsg(e, keyMessage);

		} catch(Exception e){
			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------

                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		String keyMessage = "";
		try {
			// ���X�g�č쐬
			reMakeList();
			// ERROR�t���O�N���A
			struct.seth_INSERT_ERROR_FLG(null);
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			// �o�^���郌�R�[�h���e�[�u���ɗL/��?
			if(isTargetData(struct) == true)
			{
				// �G���[���b�Z�[�W�쐬
				keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
				setErrorMessage("ZZ01102", keyMessage);
			}
			// �ˑ�����}�X�^�̃`�F�b�N
			existDependsMaster();
			
			// �w�肳�ꂽ�p�X���[�h�ƃ��[�U�R�[�h�̃`�F�b�N
			if(struct.getUSER_CD().equals(struct.getPASSWORD())) {
				// ���[�U�R�[�h�ƃp�X���[�h�͈قȂ镶����Őݒ肵�Ă��������B
				keyMessage = "USER_MST.PASSWORD:" + struct.getPASSWORD();
				setErrorMessage("AA00206", keyMessage);
			}
			
			// �V�p�X���[�h�̌����`�F�b�N
			Map chkMap = UserPassWordInputRule.compareMinLength(conn, struct.getPASSWORD());
			if("false".equals(String.valueOf(chkMap.get("2")))) {
				ExpjMessage expjMessage = new ExpjMessage("AA00207",String.valueOf(chkMap.get("1")));
				msgStruct.addError(expjMessage);
			}


			// �p�X���[�h�̉p�������`�F�b�N
			if(!UserPassWordInputRule.checkWordRule(conn, struct.getPASSWORD())) {
				// �p�X���[�h�ɂ͉p���A�y�сA�������܂�Őݒ肵�Ă��������B
				keyMessage = "USER_MST.PASSWORD:" + struct.getPASSWORD();
				setErrorMessage("AA00208", keyMessage);
			}
			
			// �V�p�X���[�h���擾���鎞
			if(struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD())) {
				
				// �w�肳�ꂽ�p�X���[�h�ƃ��[�U�R�[�h�̃`�F�b�N
				if(struct.getUSER_CD().equals(struct.getNEW_PASSWORD())) {
					// ���[�U�R�[�h�ƃp�X���[�h�͈قȂ镶����Őݒ肵�Ă��������B
					keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
					setErrorMessage("AA00206", keyMessage);
				}
				// �V�p�X���[�h�̌����`�F�b�N
				chkMap = UserPassWordInputRule.compareMinLength(conn, struct.getNEW_PASSWORD());
				if("false".equals(String.valueOf(chkMap.get("2")))) {
					ExpjMessage expjMessage = new ExpjMessage("AA00207",String.valueOf(chkMap.get("1")));
					msgStruct.addError(expjMessage);
				}
				// �p�X���[�h�̉p�������`�F�b�N
				if(!UserPassWordInputRule.checkWordRule(conn, struct.getNEW_PASSWORD())) {
					// �p�X���[�h�ɂ͉p���A�y�сA�������܂�Őݒ肵�Ă��������B
					keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
					setErrorMessage("AA00208", keyMessage);
				}
			}
			
			// �G���[���Ȃ��ꍇ�A�o�^����
			if(msgStruct.sizeError() <= 0){
				// ��ЃR�[�h�Ǎ�
				readCOMPANY_CD();
				struct.setCOMPANY_CD(_COMPANY_CD);
				//�R���{�{�b�N�X
				if (!struct.getLOCALE().equals("")){
					StringTokenizer std = new StringTokenizer(struct.getLOCALE(),":");
					struct.setLOCALE(std.nextToken());
				}else {
					struct.setLOCALE(null);
				}
				
				String temoPASSWORD = struct.getPASSWORD();
			   
			/*	// �f�[�^�Í���
				if (getReadStatus() == NORMAL && !struct.getNEW_PASSWORD().equals("")) {
					struct.setPASSWORD(XafTools.getCryptString(struct.getNEW_PASSWORD()));
				} else if (getReadStatus() == INITIAL || getReadStatus() == ERROR) {
					// �ǂݍ���ł��Ȃ�
					struct.setPASSWORD(XafTools.getCryptString(struct.getPASSWORD()));
				}*/
				
				struct.setPASSWORD(XafTools.getCryptString(struct.getPASSWORD()));
				// �`�F�b�N�g�p�̃p�X���[�h
				struct.seth_PASSWORD(struct.getPASSWORD());
				// �Ɩ��^�p����ǂ�
				String businessDate = readBUSINESS_OPR_DATE(struct.getPLANT_CD());
				struct.setPASSWORD_CHG_DATE(businessDate);
				
				// �f�[�^�}��
				if("0".equals(struct.geth_APR_USER_MST())) {		// �p�����[�^�u���p�ҏ��F�v��0�̎��A
					entity.minsertUSER_MST.create(conn, struct);
					
					// ���ɓo�^�ς݂̋Ɩ��O���[�v�f�[�^���폜
					entity.mdeleteBELONG_MST_BY_USER.delete(conn, struct);
					
					// �Ɩ��O���[�v�f�[�^�o�^
					insertBusinessGroup();
					// �R�~�b�g
					conn.commit();
					// ����
					controlselect();
				} else {												
					// �p�����[�^�u���p�ҏ��F�v��1�̎��A
					// ���F���̓o�^
					insertAppr("insert");
					if(!msgStruct.hasError()){
						// �R�~�b�g
						conn.commit();
						struct.setPASSWORD(temoPASSWORD);
						setReadStatus(INITIAL);
					}else{
						// ���[���o�b�N
						conn.rollback();
						struct.setPASSWORD(temoPASSWORD);
						setReadStatus(ERROR);
					}
					// �`�F�b�N�g�p�̃p�X���[�h
					struct.seth_PASSWORD(struct.getPASSWORD());
					//�R���{�{�b�N�X�p�f�[�^�擾
					StringTokenizer std;
					int size = 0;
					int losize = 0;
					String loca = null;
					String[]  lolist = null;
					if (struct.getLOCALE() != null){
						while(losize < _LOCALE.size()){
							lolist = _LOCALE.getData(losize);
							while( size<lolist.length){
								if(!lolist[size].equals("")){
									std = new StringTokenizer(lolist[size],":");
									loca = std.nextToken();
									if(struct.getLOCALE().equals(loca)){
										struct.setLOCALE(lolist[size]);
									}
								}
								size++;
							}
							size = 0;
							losize++;
						}
					}
					// ���F�̏ꍇ�A�u�o�^�v�{�^�����p�A�u�X�V�v�A�u�폜�v�{�^�����p�s��
					struct.seth_INSERT_ERROR_FLG("1");
				}
			}
			else
			{
				// ���[���o�b�N
				conn.rollback();
				// �G���[�ꍇ�A�u�o�^�v�{�^�����p�A�u�X�V�v�A�u�폜�v�{�^�����p�s��
				struct.seth_INSERT_ERROR_FLG("1");
				setReadStatus(ERROR);
			}
		}catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
			setSqlExceptionMsg(e, keyMessage);

		}catch(Exception e){
			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}

		//------------------------------------------------------------------

                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		String keyMessage = "";

		try {
			
			// ���X�g�č쐬
			reMakeList();
			// ERROR�t���O�N���A
			struct.seth_INSERT_ERROR_FLG(null);
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();

			// �����Ώۃf�[�^���X�V����Ă��Ȃ����`�F�b�N
			checkTargetData(struct, _USER_MST_count);

			// �ˑ�����}�X�^�̃`�F�b�N
			existDependsMaster();
			
			// �ύX�O�ύX��Ŏw�肳�ꂽ�p�X���[�h�������̃`�F�b�N
			if(XafTools.getCryptString(struct.getNEW_PASSWORD()).equals(struct.geth_PASSWORD())) {
				// �p�X���[�h�͕ύX�̑O��ŕς��Đݒ肵�Ă��������B
				keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
				setErrorMessage("AA00209", keyMessage);
			}
			
			// �w�肳�ꂽ�p�X���[�h�ƃ��[�U�R�[�h�̃`�F�b�N
			if(struct.getUSER_CD().equals(struct.getNEW_PASSWORD())) {
				// ���[�U�R�[�h�ƃp�X���[�h�͈قȂ镶����Őݒ肵�Ă��������B
				keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
				setErrorMessage("AA00206", keyMessage);
			}
			
			// �V�p�X���[�h�̌����`�F�b�N
			if(struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD())) {
				Map chkMap = UserPassWordInputRule.compareMinLength(conn, struct.getNEW_PASSWORD());
				if("false".equals(String.valueOf(chkMap.get("2")))) {
					ExpjMessage expjMessage = new ExpjMessage("AA00207",String.valueOf(chkMap.get("1")));
					msgStruct.addError(expjMessage);
				}
			}
			
			// �p�X���[�h�̉p�������`�F�b�N
			if(struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD()) &&
					!UserPassWordInputRule.checkWordRule(conn, struct.getNEW_PASSWORD())) {
				// �p�X���[�h�ɂ͉p���A�y�сA�������܂�Őݒ肵�Ă��������B
				keyMessage = "USER_MST.PASSWORD:" + struct.getNEW_PASSWORD();
				setErrorMessage("AA00208", keyMessage);
			}

			// �G���[���Ȃ��ꍇ�A�X�V����
			if(msgStruct.sizeError() <= 0){

				// ��ЃR�[�h�Ǎ�
				readCOMPANY_CD();
				struct.setCOMPANY_CD(_COMPANY_CD);
				
				//�R���{�{�b�N�X
				
				if (!struct.getLOCALE().equals("")){
					StringTokenizer std = new StringTokenizer(struct.getLOCALE(),":");
					struct.setLOCALE(std.nextToken());
				}else {
					struct.setLOCALE(null);
				}
				
				//�f�[�^�Í���
				if (struct.getNEW_PASSWORD() != null && !"".equals(struct.getNEW_PASSWORD())) {
					struct.setPASSWORD(XafTools.getCryptString(struct.getNEW_PASSWORD()));
					// �`�F�b�N�g�p�̃p�X���[�h
					struct.seth_PASSWORD(struct.getPASSWORD());
					// �Ɩ��^�p����ǂ�
					String businessDate = readBUSINESS_OPR_DATE(struct.getPLANT_CD());
					// �p�X���[�h�ύX��
					struct.setPASSWORD_CHG_DATE(businessDate);
				}
			
				if("0".equals(struct.geth_APR_USER_MST())){		// �p�����[�^�u���p�ҏ��F�v��0�̎��A
					//�f�[�^�X�V
					entity.mupdateUSER_MST.update(conn, struct);

					// ���ɓo�^�ς݂̋Ɩ��O���[�v�f�[�^���폜
					entity.mdeleteBELONG_MST_BY_USER.delete(conn, struct);

					// �Ɩ��O���[�v�f�[�^�o�^
					insertBusinessGroup();
					// �R�~�b�g
					conn.commit();
					// ����
					controlselect();
				}else{												// �p�����[�^�u���p�ҏ��F�v��1�̎��A
					// ���F���̓o�^
					insertAppr("update");
					if(!msgStruct.hasError()){
						// �R�~�b�g
						conn.commit();
					}else{
						// ���[���o�b�N
						conn.rollback();
					}

					//�R���{�{�b�N�X�p�f�[�^�擾
					StringTokenizer std;
					int size = 0;
					int losize = 0;
					String loca = null;
					String[]  lolist = null;
					if (struct.getLOCALE() != null){
						while(losize < _LOCALE.size()){
							lolist = _LOCALE.getData(losize);
							while( size<lolist.length){
								if(!lolist[size].equals("")){
									std = new StringTokenizer(lolist[size],":");
									loca = std.nextToken();
									if(struct.getLOCALE().equals(loca)){
										struct.setLOCALE(lolist[size]);
									}
								}
								size++;
							}
							size = 0;
							losize++;
						}
					}
				}
			} else {
				// ���[���o�b�N
				conn.rollback();
			}
		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
			setSqlExceptionMsg(e, keyMessage);
		}catch(Exception e){
			// ���[���o�b�N
			conn.rollback();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		String keyMessage = "";
		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			// ERROR�t���O�N���A
			struct.seth_INSERT_ERROR_FLG(null);
			// �����Ώۃf�[�^���X�V����Ă��Ȃ����`�F�b�N
			checkTargetData(struct, _USER_MST_count);
			// �ˑ�����}�X�^�̃`�F�b�N�i���Ӑ�}�X�^�j
			existDependsMasterForDel();
			String h_APR_USER_MST = struct.geth_APR_USER_MST();
			// �G���[���Ȃ��ꍇ�A�폜����
			if(msgStruct.sizeError() <= 0){
				
				//�R���{�{�b�N�X
				
				if (!struct.getLOCALE().equals("")){
					StringTokenizer std = new StringTokenizer(struct.getLOCALE(),":");
					struct.setLOCALE(std.nextToken());
				}else {
					struct.setLOCALE(null);
				}

				if("0".equals(struct.geth_APR_USER_MST())){		// �p�����[�^�u���p�ҏ��F�v��0�̎��A
					// �폜
					entity.mdeleteUSER_MST.delete(conn, struct);

					// ���ɓo�^�ς݂̋Ɩ��O���[�v�f�[�^���폜
					entity.mdeleteBELONG_MST_BY_USER.delete(conn, struct);
					// �R�~�b�g
					conn.commit();
					
				}else{												// �p�����[�^�u���p�ҏ��F�v��1�̎��A
					insertAppr("delete");
					if(!msgStruct.hasError()){
						// �R�~�b�g
						conn.commit();
						//�R���{�{�b�N�X�p�f�[�^�擾
						StringTokenizer std;
						int size = 0;
						int losize = 0;
						String loca = null;
						String[]  lolist = null;
						if (struct.getLOCALE() != null){
							while(losize < _LOCALE.size()){
								lolist = _LOCALE.getData(losize);
								while( size<lolist.length){
									if(!lolist[size].equals("")){
										std = new StringTokenizer(lolist[size],":");
										loca = std.nextToken();
										if(struct.getLOCALE().equals(loca)){
											struct.setLOCALE(lolist[size]);
										}
									}
									size++;
								}
								size = 0;
								losize++;
							}
						}
					}else{
						
						// ���[���o�b�N
						conn.rollback();
						//�R���{�{�b�N�X�p�f�[�^�擾
						StringTokenizer std;
						int size = 0;
						int losize = 0;
						String loca = null;
						String[]  lolist = null;
						if (struct.getLOCALE() != null){
							while(losize < _LOCALE.size()){
								lolist = _LOCALE.getData(losize);
								while( size<lolist.length){
									if(!lolist[size].equals("")){
										std = new StringTokenizer(lolist[size],":");
										loca = std.nextToken();
										if(struct.getLOCALE().equals(loca)){
											struct.setLOCALE(lolist[size]);
										}
									}
									size++;
								}
								size = 0;
								losize++;
							}
						}
						return;
					}


				}

	            // ��ʂ��N���A
				controlclear();
			}
			else
			{
				// ���[���o�b�N
				conn.rollback();
			}
			struct.seth_APR_USER_MST(h_APR_USER_MST);

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			keyMessage = "USER_MST.USER_CD:" + struct.getUSER_CD();
			setSqlExceptionMsg(e, keyMessage);

		}catch(Exception e){
			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		// struct�N���A
		this.struct.initialize();
		// ERROR�t���O�N���A
		struct.seth_INSERT_ERROR_FLG(null);
		// ���X�g�N���A
		if(list != null){
			list.clear();
		}
		else {
			list = new ArrayList(0);
		}

		// �\���plist�ɋƖ��O���[�v��ݒ�
		for(int i = 0; i < _listBusinessGroup.size(); i++)
		{
			list.add((AA0090030Struct)_listBusinessGroup.get(i));
		}

		// �X�V��������
		_USER_MST_count = null;
		

		// �p�����[�^�u���p�ҏ��F�v���擾
		struct.seth_APR_USER_MST(_APR_USER_MST);

		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
		
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		String keyMessage = "";

		try{
			// �e�[�u���p�Ɩ��O���[�v�f�[�^���X�g�̏�����
			if(_listBusinessGroup != null)
			{
				_listBusinessGroup.clear();
			}
			else
			{
				_listBusinessGroup = new ArrayList(0);
			}
			
			// ���ЃR�[�h�̎擾
			if (!readCOMPANY_CD() ){
				return;
			}
			
			// ����������擾
			List _tempBusinessGroup = entity.mselectBUSINESS_GROUP_MST.read(conn, struct);

			// ��\���Ɩ��O���[�v���擾
			PrivateConfig privateConfig = new PrivateConfig(conn);
			ArrayList listNotBusinessGroupCD = new ArrayList(0);
			listNotBusinessGroupCD = privateConfig.getStrings(_DISABLE_BUSINESS_GROUP_ACCESS_KEY);

			// ��\���Ƃ���Ɩ��O���[�v�R�[�h�̃t���O��ݒ�
			for(int i = 0; i < _tempBusinessGroup.size(); i++)
			{
				AA0090030Struct temp_struct = (AA0090030Struct)_tempBusinessGroup.get(i);
				boolean bFound = false;
				for(int j = 0; j < listNotBusinessGroupCD.size(); j++)
				{
					String strBusinessGroupCD = (String)listNotBusinessGroupCD.get(j);
					if(strBusinessGroupCD.equals(temp_struct.getBUSINESS_GROUP_CD()) == true)
					{
						bFound = true;
						break;
					}
				}
				if(bFound == false)
				{
					_listBusinessGroup.add(_tempBusinessGroup.get(i));
				}
			}

			// ���X�g�N���A
			if(list != null){
				list.clear();
			}
			else {
				list = new ArrayList(0);
			}
			
			/*�Ɩ��O���[�v�ꗗ�̑�����\��*/
            AA0090030Struct setStruct = new AA0090030Struct();
			String locale = CoreTools.getLocale(sysUSER_CD);
		    String property = "OrteusMenuDic";
            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
            String key = "Orteus.BUSINESS_GROUP_MST.BUSINESS_GROUP_NAME.";

			// �\���plist�ɋƖ��O���[�v��ݒ�
			for(int i = 0; i < _listBusinessGroup.size(); i++){
			 	setStruct = (AA0090030Struct)_listBusinessGroup.get(i);
            	setStruct.setBUSINESS_GROUP_NAME(CoreTools.getRBString(key + setStruct.getBUSINESS_GROUP_CD(), resource));
				list.add(setStruct);
			}
			
			// �R���{�{�b�N�X�f�[�^�p��
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			_LOCALE = controller.getData("LOCALE");
			_APPR_POWER_TYP = controller.getData("APPR_POWER_TYP");
			

			// �p�����[�^�u���p�ҏ��F�v���擾
			List tempList = entity.mselectSYS_PARAM.read(conn,struct);
			
			if(tempList.isEmpty()){
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00043"));
 				msgStruct.addError(emsg);
 			    sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_USER_MST("0");
			}else{
				if("1".equals(((AA0090030Struct)tempList.get(0)).geth_APR_USER_MST())){
					struct.seth_APR_USER_MST("1");
				}else{
					struct.seth_APR_USER_MST("0");
				}
			}
			_APR_USER_MST = struct.geth_APR_USER_MST();
			
			// �L�[���擾
			if("1".equals(struct.geth_APR_USER_MST()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
				getKey();
			}
	        
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

		}catch(ComboException e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0090");
		logger.entering("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// �_�E�����[�h�t�@�C�����N���A
			// PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
//			struct.setDOWNLOAD_FILE((String)null);
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
			// �R���{�{�b�N�X�f�[�^�p��
			
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0090030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			struct.setList_LOCALE_val(_LOCALE.getExplanList());
			struct.setList_LOCALE_name(_LOCALE.getExplanList());
			//struct.setList_LOCALE_val(_LOCALE.getValList());
			
			
			struct.setList_APPR_POWER_TYP_name(_APPR_POWER_TYP.getExplanList());
			struct.setList_APPR_POWER_TYP_val(_APPR_POWER_TYP.getValList());
			
			struct.copy(struct);
			
  		} catch(AlarmMessageException ame){
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0090030Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0090030-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0090030Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0090030-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0090030Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0090030-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0090030Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0090030Entity entity;
	protected AA0090030Struct struct;
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

		entity = new AA0090030Entity();
		struct = new AA0090030Struct();

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
	 * AA0090030�N���X�̕W���R���X�g���N�^
	 */
	public AA0090030Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		
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
				AA0090030Struct key = (AA0090030Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_VALID_FLG") && key.getBUSINESS_GROUP_VALID_FLG() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_VALID_FLG", key.getBUSINESS_GROUP_VALID_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOCALE_name") && key.getLOCALE_name() != null) {
					msgKey.setKeyValue("LOCALE_name", key.getLOCALE_name());
				}
				if(msgKeyType.containsKeyColumn("LOCALE_val") && key.getLOCALE_val() != null) {
					msgKey.setKeyValue("LOCALE_val", key.getLOCALE_val());
				}
				if(msgKeyType.containsKeyColumn("NEW_PASSWORD") && key.getNEW_PASSWORD() != null) {
					msgKey.setKeyValue("NEW_PASSWORD", key.getNEW_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_name") && key.getAPPR_POWER_TYP_name() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP_name", key.getAPPR_POWER_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_val") && key.getAPPR_POWER_TYP_val() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP_val", key.getAPPR_POWER_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_INSERT_ERROR_FLG") && key.geth_INSERT_ERROR_FLG() != null) {
					msgKey.setKeyValue("h_INSERT_ERROR_FLG", key.geth_INSERT_ERROR_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_PASSWORD") && key.geth_PASSWORD() != null) {
					msgKey.setKeyValue("h_PASSWORD", key.geth_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_DISP_FLG") && key.getBUSINESS_GROUP_DISP_FLG() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_DISP_FLG", key.getBUSINESS_GROUP_DISP_FLG());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_CD") && key.getOWN_PERSON_CD() != null) {
					msgKey.setKeyValue("OWN_PERSON_CD", key.getOWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PASSWORD") && key.getPASSWORD() != null) {
					msgKey.setKeyValue("PASSWORD", key.getPASSWORD());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS") && key.getADDRESS() != null) {
					msgKey.setKeyValue("ADDRESS", key.getADDRESS());
				}
				if(msgKeyType.containsKeyColumn("LOCALE") && key.getLOCALE() != null) {
					msgKey.setKeyValue("LOCALE", key.getLOCALE());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("SECTION_CD") && key.getSECTION_CD() != null) {
					msgKey.setKeyValue("SECTION_CD", key.getSECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("PASSWORD_CHG_DATE") && key.getPASSWORD_CHG_DATE() != null) {
					msgKey.setKeyValue("PASSWORD_CHG_DATE", key.getPASSWORD_CHG_DATE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD") && key.getBUSINESS_GROUP_CD() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_CD", key.getBUSINESS_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_NAME") && key.getBUSINESS_GROUP_NAME() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_NAME", key.getBUSINESS_GROUP_NAME());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_APR_USER_MST") && key.geth_APR_USER_MST() != null) {
					msgKey.setKeyValue("h_APR_USER_MST", key.geth_APR_USER_MST());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
					AA0090030Struct key = new AA0090030Struct();
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_VALID_FLG")) {
						key.setBUSINESS_GROUP_VALID_FLG(msgKey.getKeyValue("BUSINESS_GROUP_VALID_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOCALE_name")) {
						key.setLOCALE_name(msgKey.getKeyValue("LOCALE_name"));
					}
					if(msgKeyType.containsKeyColumn("LOCALE_val")) {
						key.setLOCALE_val(msgKey.getKeyValue("LOCALE_val"));
					}
					if(msgKeyType.containsKeyColumn("NEW_PASSWORD")) {
						key.setNEW_PASSWORD(msgKey.getKeyValue("NEW_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_name")) {
						key.setAPPR_POWER_TYP_name(msgKey.getKeyValue("APPR_POWER_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP_val")) {
						key.setAPPR_POWER_TYP_val(msgKey.getKeyValue("APPR_POWER_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_INSERT_ERROR_FLG")) {
						key.seth_INSERT_ERROR_FLG(msgKey.getKeyValue("h_INSERT_ERROR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_PASSWORD")) {
						key.seth_PASSWORD(msgKey.getKeyValue("h_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_DISP_FLG")) {
						key.setBUSINESS_GROUP_DISP_FLG(msgKey.getKeyValue("BUSINESS_GROUP_DISP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_CD")) {
						key.setOWN_PERSON_CD(msgKey.getKeyValue("OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PASSWORD")) {
						key.setPASSWORD(msgKey.getKeyValue("PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS")) {
						key.setADDRESS(msgKey.getKeyValue("ADDRESS"));
					}
					if(msgKeyType.containsKeyColumn("LOCALE")) {
						key.setLOCALE(msgKey.getKeyValue("LOCALE"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SECTION_CD")) {
						key.setSECTION_CD(msgKey.getKeyValue("SECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PASSWORD_CHG_DATE")) {
						key.setPASSWORD_CHG_DATE(msgKey.getKeyValue("PASSWORD_CHG_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD")) {
						key.setBUSINESS_GROUP_CD(msgKey.getKeyValue("BUSINESS_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_NAME")) {
						key.setBUSINESS_GROUP_NAME(msgKey.getKeyValue("BUSINESS_GROUP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_USER_MST")) {
						key.seth_APR_USER_MST(msgKey.getKeyValue("h_APR_USER_MST"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
