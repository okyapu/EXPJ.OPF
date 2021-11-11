/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0070/src/com/nec/jp/orteus/metamorBase/AA0070/AA0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0070;

import com.nec.jp.orteus.metamorBase.AA0070.*;
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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0070010Control
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

	public AA0070010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	//------------------------------------------------------------------------------

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

	//-----------------------------------------------------------------------------

	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

	//------------------------------------------------------------------------------
	/** �������z�܂�ߋ敪 */
	private ComboStruct _ROUND_TYP = new ComboStruct();

	/** �������z�܂�ߋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setROUND_TYP(ComboStruct combo){ _ROUND_TYP = combo; }

	/** �������z�܂�ߋ敪�擾
	 * @return �P���敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getROUND_TYP(){ return _ROUND_TYP; }

	/** ����œK�p�敪�敪 */
	private ComboStruct _TAX_APPLY_TYP = new ComboStruct();

	/** ����œK�p�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setTAX_APPLY_TYP(ComboStruct combo){ _TAX_APPLY_TYP = combo; }

	/** ����œK�p�敪�擾
	 * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getTAX_APPLY_TYP(){ return _TAX_APPLY_TYP; }
		
	/** ����Ōv�Z�敪 */
	private ComboStruct _TAX_CALC_TYP = new ComboStruct();

	/** ����Ōv�Z�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setTAX_CALC_TYP(ComboStruct combo){ _TAX_CALC_TYP = combo; }

	/** ����Ōv�Z�敪�擾
	 * @return ���O�쐬�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getTAX_CALC_TYP(){ return _TAX_CALC_TYP; }
		
	/** �ב֎�� */
	private ComboStruct _EXCH_TYP = new ComboStruct();

	/** �ב֎�ʐݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setEXCH_TYP(ComboStruct combo){ _EXCH_TYP = combo; }

	/** �ב֎�ʎ擾
	 * @return ���O�쐬�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getEXCH_TYP(){ return _EXCH_TYP; }
		
	/** �A������敪 */
	private ComboStruct _IMPORT_TRN_TYP = new ComboStruct();

	/** �A������敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setIMPORT_TRN_TYP(ComboStruct combo){ _IMPORT_TRN_TYP = combo; }

	/** �A������敪�擾
	 * @return ���O�쐬�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getIMPORT_TRN_TYP(){ return _IMPORT_TRN_TYP; }

	/** �����v��敪 */
	private ComboStruct _INSPC_ACPT_APP_TYP = new ComboStruct();

	/** �����v��敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setINSPC_ACPT_APP_TYP(ComboStruct combo){ _INSPC_ACPT_APP_TYP = combo; }

	/** �����v��敪�擾
	 * @return ���O�쐬�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getINSPC_ACPT_APP_TYP(){ return _INSPC_ACPT_APP_TYP; }

		
	//------------------------------------------------------------------------------
		
	/**
	 * �`�F�b�N�{�b�N�X�l�ϊ��擾����
	 * �w�肳�ꂽ������"1"�̏ꍇ��"true"��Ԃ��A����ȊO��""��Ԃ�
	 *
	 * @return �`�F�b�N����: "true" / �`�F�b�N�Ȃ�: "false"
	 */
	public String convCheckBoxValue(String strValue)
	{
		String strCheckBoxValue = "false";
		if( (strValue != null) && ("1".equals(strValue) == true) )
		{
			strCheckBoxValue = "true";
		}
		return strCheckBoxValue;
	}
		
	//------------------------------------------------------------------------
	/** ���[�U��`�̏������σt���O */
	private boolean _usersIntialized = false;
	/**
	 * ���[�U��` ����������
	 */
	private void usersInitialize()
	{
		if(_usersIntialized) return;

		_usersIntialized = true;
		return ;
	}

	//------------------------------------------------------------------------

	/*
	 * �f�t�H���g�l�ݒ菈��
	*/
	private void setDefaultData() throws SQLException, FoundationException
	{
		try{
			// ���O�C�����[�U�i�S���҃R�[�h�j�̏����l�ݒ�
			struct.setOWN_PERSON_CD(getsysUSER_CD());

			// �M�݃R�[�h�A����œK�p�敪�����l�ݒ�
			struct.setCUR_CD("");
			struct.setCUR_NAME("");
			struct.setCTRL_CD("SYSTEM");
			struct.setTAX_APPLY_TYP("2");
			AA0070010Struct aStruct = null;
			AA0070010Struct bStruct = null;

			List tmpList = entity.mSYS_HOME_CUR.read(conn, struct);
			if (tmpList.size() >= 0 ) {
				aStruct = (AA0070010Struct)tmpList.get(0);
				struct.setCUR_CD(aStruct.getCUR_CD());
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
	}

	//------------------------------------------------------------------------
	/**
	 * DB�o�^/�X�V������ �ݒ���e�`�F�b�N
	 * 
	 * @return  true:OK / false:NG
	 */
	//------------------------------------------------------------------------
	private boolean isValidContents()throws FoundationException, SQLException
	{
		boolean result = true;
		String strTest = null;
		String Message = "";

		// �l�Z������
		struct.revise();
		// ����ŃR�[�h���݊m�F
		if(struct.getTAX_CD() != null && struct.getTAX_CD().equals("") == false){
			List list1 = entity.mselectM_TAX.read(conn, struct);
			if (list1.size() == 0) {
				Message = "M_TAX.TAX_CD:" + struct.getTAX_CD();
				setErrorMessage("AA01001", Message);
				
				result = false;
			}
		}
		
		// �ʉ݃R�[�h���݊m�F
		if(struct.getCUR_CD() != null && struct.getCUR_CD().equals("") == false){
			List list2 = entity.mM_CUR.read(conn, struct);
			if(list2.size() == 0) {
				// �ʉݖ��̂̃N���A
				struct.setCUR_NAME("");
				
				Message = "M_CUR.CUR_CD:" + struct.getCUR_CD();
				setErrorMessage("AA10011", Message);
				
				return false;
			}
		}
		
		// �S���҃R�[�h���݊m�F
		if (struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false) {
			List list3 = entity.mselectOWN_PERSON_CD.read(conn, struct);
			if (list3.size() == 0) {
				// �S���Җ��̃N���A
				struct.setOWN_PERSON_NAME("");
				// <�G���[:AA00158>�S���҃R�[�h�����p�҃}�X�^�ɓo�^����Ă��܂���B
				Message = "USER_MST.USER_CD:" + struct.getOWN_PERSON_CD();
				setErrorMessage("AA00158", Message);
				
				return false;
			} else {
				struct.setOWN_PERSON_NAME(((AA0070010Struct)list3.get(0)).getOWN_PERSON_NAME());
			}				
		}

		return result;
	}

	//------------------------------------------------------------------------
		
	/**
	 * SQLException�G���[���b�Z�[�W�ݒ�
	 * @param SQLException
	 * @param �o�̓G���[���b�Z�[�W
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
		setReadStatus(ERROR);
	
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());
		ExpjException ee = new ExpjException(e, emsg);

		throw ee;
	}

	/**
     * �G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     */
    private void setErrorMessage(String code) {
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError(emsg);
     sysLog.warning(emsg, sysUSER_CD);
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
	 * �x�����b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
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
     sysLog.config(emsg, getsysUSER_CD());
    }

	//------------------------------------------------------------------------------
	private PrivateConfig privateConfig;
	//------------------------------------------------------------------------------
	 /**
	 * �}�X�^�L�[�̏W��
	 */
	private HashMap keyvalueMap = new HashMap();
	
	/**�}�X�^�L�[�̏W���̎擾
	 * @return �}�X�^�L�[�̏W��
	 */
	public HashMap getKeyvalueMap() {
		return keyvalueMap;
	}
	/**�}�X�^�L�[�̏W���̐ݒ�
	 * @param �}�X�^�L�[�̏��
	 */
	public void setKeyvalueMap(HashMap keyvalueMap) {
		this.keyvalueMap = keyvalueMap;
	}
	/** ����揳�F */
	private String _APR_VEND_CTRL = null;
	//-------------------------------------------------------------------------
    /**
	 * ��ʑJ�ڎ��A�L�[�̎擾
	 *
	 */
	private void getKey(){
		struct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
		struct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());
	}
//	---------------------------------------------------------------------------------
    /**
	 * ���F
	 * @param button
	 * @throws SQLException
	 */
	private void insertAppr(String button) throws SQLException{
		// �}�X�^���F���i
		MstAppr mstappr = new MstAppr(conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0070010","AA0070010Servlet");
		List listMessage = new ArrayList();                     
		String appr_ID = null;                             // ���FID��ۑ��p�̗Վ��ϐ� 
		MstApprStruct mstApprStruct = new MstApprStruct();
		String columnID = null;                            
		MstApprKeyStruct keyStruct = new MstApprKeyStruct();
		// 	���F�˗����݃`�F�b�N
		ArrayList keyvalueList = new ArrayList();
		// ��ЃR�[�h
		MstColumns keyvalue1 = new MstColumns();
		keyvalue1.setColumnname("COMPANY_CD");
		keyvalue1.setColumnvalue(struct.getCOMPANY_CD());
		keyvalueList.add(keyvalue1);
		// �����R�[�h
		MstColumns keyvalue2 = new MstColumns();
		keyvalue2.setColumnname("VEND_CD");
		keyvalue2.setColumnvalue(struct.getVEND_CD());
		keyvalueList.add(keyvalue2);
		
		if(mstappr.checkMST_APPR("M_VEND_CTRL",keyvalueList)){
			setErrorMessage("KA00125");
			return;
		}
		
		// 	���F�˗��\�Ƀf�[�^��ǉ�	
		mstApprStruct.setSCREEN_URL("AA0070010Servlet");          // ���URL
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
		// ��ЃR�[�h
		keyStruct.setTABLE_NAME("M_VEND_CTRL");
		keyStruct.setKEY_NAME("COMPANY_CD");
		keyStruct.setKEY_VALUE(struct.getCOMPANY_CD());
		mstappr.insertMST_APPR_KEY(keyStruct);
		// �����R�[�h
		keyStruct.setTABLE_NAME("M_VEND_CTRL");
		keyStruct.setKEY_NAME("VEND_CD");
		keyStruct.setKEY_VALUE(struct.getVEND_CD());
		mstappr.insertMST_APPR_KEY(keyStruct);
		
		// ���F���ו\�Ƀ}�X�^����ǉ�
		String nowdate = mstappr.readSystemDateTime();
		// ���i�P���𐮗�	
		// ��ЃR�[�h
		columnID = mstappr.getColumnID("M_VEND_CTRL","COMPANY_CD");
		mstappr.setDetailByColumnID(struct.getCOMPANY_CD(),columnID);
		// �����R�[�h
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CD");
		mstappr.setDetailByColumnID(struct.getVEND_CD(),columnID);
		// ����於��
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_NAME");
		mstappr.setDetailByColumnID(struct.getVEND_NAME(),columnID);
		// ����旪��
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_ANAME");
		mstappr.setDetailByColumnID(struct.getVEND_ANAME(),columnID);
		// �����J�i����
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_KNAME");
		mstappr.setDetailByColumnID(struct.getVEND_KNAME(),columnID);
		// �X�֔ԍ�
		columnID = mstappr.getColumnID("M_VEND_CTRL","ZIP_CD");
		mstappr.setDetailByColumnID(struct.getZIP_CD(),columnID);
		// �Z��1
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_1");
		mstappr.setDetailByColumnID(struct.getADDRESS_1().toString(),columnID);
		// �Z��2
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_2");
		mstappr.setDetailByColumnID(struct.getADDRESS_2().toString(),columnID);	
		// �Z��(�J�i)1
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_1");
		mstappr.setDetailByColumnID(struct.getADDRESS_K_1(),columnID);
		// �Z��(�J�i)2
		columnID = mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_2");
		mstappr.setDetailByColumnID(struct.getADDRESS_K_2(),columnID);
		// �d�b�ԍ�
		columnID = mstappr.getColumnID("M_VEND_CTRL","TEL");
		mstappr.setDetailByColumnID(struct.getTEL(),columnID);
		// FAX�ԍ�
		columnID = mstappr.getColumnID("M_VEND_CTRL","FAX");
		mstappr.setDetailByColumnID(struct.getFAX(),columnID);
		// ���[���A�h���X
		columnID = mstappr.getColumnID("M_VEND_CTRL","EMAIL");
		mstappr.setDetailByColumnID(struct.getEMAIL(),columnID);
		// �����S������
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_ORG");
		mstappr.setDetailByColumnID(struct.getVEND_ORG(),columnID);
		// �����S����
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_PERSON");
		mstappr.setDetailByColumnID(struct.getVEND_PERSON(),columnID);
		// ���ВS������R�[�h
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_ORG_CD");
		mstappr.setDetailByColumnID(struct.getOWN_ORG_CD(),columnID);
		// ���ВS�����喼
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_ORG_NAME");
		mstappr.setDetailByColumnID(struct.getOWN_ORG_NAME(),columnID);
		// ���ВS���҃R�[�h
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_PERSON_CD");
		mstappr.setDetailByColumnID(struct.getOWN_PERSON_CD(),columnID);
		// ���ВS���Җ�
		columnID = mstappr.getColumnID("M_VEND_CTRL","OWN_PERSON_NAME");
		mstappr.setDetailByColumnID(struct.getOWN_PERSON_NAME(),columnID);
		// ����ʉ݃R�[�h
		columnID = mstappr.getColumnID("M_VEND_CTRL","CUR_CD");
		mstappr.setDetailByColumnID(struct.getCUR_CD(),columnID);
		// �ב֎��
		columnID = mstappr.getColumnID("M_VEND_CTRL","EXCH_TYP");
		mstappr.setDetailByColumnID(struct.getEXCH_TYP(),columnID);
		// �������z�܂�ߋ敪
		columnID = mstappr.getColumnID("M_VEND_CTRL","ROUND_TYP");
		mstappr.setDetailByColumnID(struct.getROUND_TYP().toString(),columnID);
		// �����v��敪
		columnID = mstappr.getColumnID("M_VEND_CTRL","INSPC_ACPT_APP_TYP");
		mstappr.setDetailByColumnID(struct.getINSPC_ACPT_APP_TYP(),columnID);
		// ���l
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_REM");
		mstappr.setDetailByColumnID(struct.getVEND_REM(),columnID);
		// �x����ݒ�t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","PAYEE_FIX_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// ����
		columnID = mstappr.getColumnID("M_VEND_CTRL","DEADLINE");
		mstappr.setDetailByColumnID("1",columnID);
		// �x����
		columnID = mstappr.getColumnID("M_VEND_CTRL","SCH_MONTH");
		mstappr.setDetailByColumnID("0",columnID);
		// �x���\���
		columnID = mstappr.getColumnID("M_VEND_CTRL","SCH_DAY");
		mstappr.setDetailByColumnID("1",columnID);
		
		// �c���Ǘ��t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","BALANCE_CTRL_FLG");
		mstappr.setDetailByColumnID("1",columnID);
		// �����ԃt���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","DEAL_STS_FLG");
		mstappr.setDetailByColumnID("0",columnID);
	
		// ����t���O1(�d��)
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_FLG_1");
		mstappr.setDetailByColumnID("0",columnID);
		// ����t���O2(����)
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_FLG_2");
		mstappr.setDetailByColumnID("0",columnID);		
		// ����t���O3(�L��)
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_FLG_3");
		mstappr.setDetailByColumnID("0",columnID);
		// �����������t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_FORM_FLG");
		mstappr.setDetailByColumnID(struct.getODR_FORM_FLG(),columnID);
		// FAX�����t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_FAX_FLG");
		mstappr.setDetailByColumnID(struct.getODR_FAX_FLG(),columnID);
		// EDI�����t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_EDI_FLG");
		mstappr.setDetailByColumnID(struct.getODR_EDI_FLG(),columnID);
		// ���[�������t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","ODR_MAIL_FLG");
		mstappr.setDetailByColumnID(struct.getODR_MAIL_FLG(),columnID);
		// ���x�z
		columnID = mstappr.getColumnID("M_VEND_CTRL","LIMIT_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// �x���ʒm�����t�t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","PAY_NOTICE_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// �X�|�b�g�����t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","SPOT_VEND_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// �����������t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","BILL_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�t���O
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�����敪
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_COND_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// ���x�[�g�������z
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_COND_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g��������
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_COND_QTY");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�Ώۋ敪
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_TARGET_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// ���x�[�g��
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_RATE");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�z
		columnID = mstappr.getColumnID("M_VEND_CTRL","REBATE_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// ����œK�p�敪
		columnID = mstappr.getColumnID("M_VEND_CTRL","TAX_APPLY_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_APPLY_TYP().toString(),columnID);
		// ����ŃR�[�h
		columnID = mstappr.getColumnID("M_VEND_CTRL","TAX_CD");
		mstappr.setDetailByColumnID(struct.getTAX_CD(),columnID);
		// ����Ōv�Z�敪
		columnID = mstappr.getColumnID("M_VEND_CTRL","TAX_CALC_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_CALC_TYP().toString(),columnID);
		// �A������敪
		columnID = mstappr.getColumnID("M_VEND_CTRL","IMPORT_TRN_TYP");
		mstappr.setDetailByColumnID(struct.getIMPORT_TRN_TYP(),columnID);
		// ����敪�ނO�P
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_01_TYP");
		mstappr.setDetailByColumnID("2001",columnID);
		// ����敪�ނO�Q
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_02_TYP");
		mstappr.setDetailByColumnID("2002",columnID);
		// ����敪�ނO�R
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_03_TYP");
		mstappr.setDetailByColumnID("2003",columnID);
		// ����敪�ނO�S
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_04_TYP");
		mstappr.setDetailByColumnID("2004",columnID);
		// ����敪�ނO�T
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_05_TYP");
		mstappr.setDetailByColumnID("2005",columnID);
		// ����敪�ނO�U
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_06_TYP");
		mstappr.setDetailByColumnID("2006",columnID);
		// ����敪�ނO�V
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_07_TYP");
		mstappr.setDetailByColumnID("2007",columnID);
		// ����敪�ނO�W
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_08_TYP");
		mstappr.setDetailByColumnID("2008",columnID);
		// ����敪�ނO�X
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_09_TYP");
		mstappr.setDetailByColumnID("2009",columnID);
		// ����敪�ނP�O
		columnID = mstappr.getColumnID("M_VEND_CTRL","VEND_CLASS_10_TYP");
		mstappr.setDetailByColumnID("2010",columnID);
		// �쐬��
		columnID = mstappr.getColumnID("M_VEND_CTRL","CREATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// �쐬��
		columnID = mstappr.getColumnID("M_VEND_CTRL","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �쐬�v���O������
		columnID = mstappr.getColumnID("M_VEND_CTRL","CREATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0070010",columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_VEND_CTRL","UPDATED_DATE");
		mstappr.setDetailByColumnID(nowdate,columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_VEND_CTRL","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �X�V�v���O������
		columnID = mstappr.getColumnID("M_VEND_CTRL","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID("AA0070010",columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_VEND_CTRL","MODIFY_COUNT");
		mstappr.setDetailByColumnID("0",columnID);
		
		// ���F���ׂɃf�[�^��ǉ�����B
		mstappr.insertMST_APPR_DETAIL("M_VEND_CTRL",appr_ID);
		
		setInfoMessage("AZ00042");
	}

//---------------------------------------------------------------------------------

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
			
		String Message = "";
		setReadStatus(INITIAL);
			
		try {
			if("1".equals(struct.geth_APR_VEND_CTRL()) && this.isScreenMove() && !"".equals(struct.geth_SCREENMOVE_TYP())){
				
				// ���F��ʂ́u�ύX��v�{�^������J�ڂ��鎞
				if("1".equals(struct.geth_SCREENMOVE_TYP())){
					MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0070010","AA0070010Servlet");
					list = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
					MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
					String columnID = null;
					// ��ЃR�[�h
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "COMPANY_CD");
					struct.setCOMPANY_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// �����R�[�h
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_CD");
					struct.setVEND_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// ����於��
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_NAME");
					struct.setVEND_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					// ����旪��
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_ANAME");
					struct.setVEND_ANAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �����J�i����
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_KNAME");
					struct.setVEND_KNAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �X�֔ԍ�
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ZIP_CD");
					struct.setZIP_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �Z��1
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_1");
					struct.setADDRESS_1(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �Z��2
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_2");
					struct.setADDRESS_2(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �Z��(�J�i)1
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_K_1");
					struct.setADDRESS_K_1(mstappr.getDetailByColumnID(tempStruct,columnID));
					// �Z��(�J�i)2
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ADDRESS_K_2");
					struct.setADDRESS_K_2(mstappr.getDetailByColumnID(tempStruct,columnID));
					// �d�b�ԍ�
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TEL");
					struct.setTEL(mstappr.getDetailByColumnID(tempStruct,columnID));

					// FAX�ԍ�
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "FAX");
					struct.setFAX(mstappr.getDetailByColumnID(tempStruct,columnID));

					// ���[���A�h���X
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "EMAIL");
					struct.setEMAIL(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �����S������
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_ORG");
					struct.setVEND_ORG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �����S����
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_PERSON");
					struct.setVEND_PERSON(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �S������R�[�h
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "OWN_ORG_CD");
					struct.setOWN_ORG_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �S������
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "OWN_ORG_NAME");
					struct.setOWN_ORG_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �S���҃R�[�h
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "OWN_PERSON_CD");
					struct.setOWN_PERSON_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �S���Җ�
					list = entity.mselectOWN_PERSON_CD.read(conn,struct);
					if(list.size()>0){
						struct.setOWN_PERSON_NAME(((AA0070010Struct)list.get(0)).getOWN_PERSON_NAME());
					}
					
					// �������z�܂��
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ROUND_TYP");
					struct.setROUND_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// ����ŃR�[�h
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TAX_CD");
					struct.setTAX_CD(mstappr.getDetailByColumnID(tempStruct,columnID));

					// ����œK�p�敪
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TAX_APPLY_TYP");
					struct.setTAX_APPLY_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// ����Ōv�Z�敪
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "TAX_CALC_TYP");
					struct.setTAX_CALC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �����v��敪
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "INSPC_ACPT_APP_TYP");
					struct.setINSPC_ACPT_APP_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �����������t���O
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_FORM_FLG");
					struct.setODR_FORM_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// FAX�����t���O
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_FAX_FLG");
					struct.setODR_FAX_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// EDI�����t���O
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_EDI_FLG");
					struct.setODR_EDI_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));

					// ���[�������t���O
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "ODR_MAIL_FLG");
					struct.setODR_MAIL_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));

					// ���l
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "VEND_REM");
					struct.setVEND_REM(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �ʉ݃R�[�h
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "CUR_CD");
					struct.setCUR_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
					
					List tempList = entity.mselectCUR_NAME.read(conn,struct);
					if(tempList.size() >0){
						// �ʉݖ�
						struct.setCUR_NAME(((AA0070010Struct)tempList.get(0)).getCUR_NAME());
					}

					// �ב֎��
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "EXCH_TYP");
					struct.setEXCH_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

					// �A������敪
					columnID = mstappr.getColumnID( "M_VEND_CTRL", "IMPORT_TRN_TYP");
					struct.setIMPORT_TRN_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));

				}else{ 
					//���F��ʂ́u�ύX�O�v�{�^������J�ڂ��鎞
					list = entity.mselect.read(conn, struct);
					if (list.size() != 0) {
						String apr_Vend_Ctrl = struct.geth_APR_VEND_CTRL();
						String appr_id = struct.geth_APPR_ID();
						String screen_Move_Typ = struct.geth_SCREENMOVE_TYP();
						struct.copy((AA0070010Struct)list.get(0));
						struct.seth_APR_VEND_CTRL(apr_Vend_Ctrl);
						struct.seth_SCREENMOVE_TYP(screen_Move_Typ);
						struct.seth_APPR_ID(appr_id);

						struct.setOWN_PERSON_NAME("");

						struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
						struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));

						if (struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false) {
							List list3 = entity.mselectOWN_PERSON_CD.read(conn, struct);
							if (list3.size() != 0) {
								AA0070010Struct checkStruct = (AA0070010Struct)list3.get(0);
								struct.setOWN_PERSON_NAME(checkStruct.getOWN_PERSON_NAME());
							}
						}

						setReadStatus(NORMAL);
					} else {
						// �G���[���b�Z�[�W�ݒ�
						Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
						setErrorMessage("ZZ06001", Message);

						// �f�[�^�����݂��Ȃ��ꍇ�̃N���A����
						String w_vendCd = struct.getVEND_CD();	// �L�[���̑ޔ�
						struct.init();							// �\�����ڂ��f�t�H���g�ɖ߂�
						struct.setVEND_CD(w_vendCd);			// �L�[���̐ݒ�
					}
				}
			}else{ 
				// ����̓Ǎ�
				list = entity.mselect.read(conn, struct);
				if (list.size() != 0) {
					String apr_Vend_Ctrl = struct.geth_APR_VEND_CTRL();
					String appr_id = struct.geth_APPR_ID();
					String screen_Move_Typ = struct.geth_SCREENMOVE_TYP();
					struct.copy((AA0070010Struct)list.get(0));
					struct.seth_APR_VEND_CTRL(apr_Vend_Ctrl);
					struct.seth_SCREENMOVE_TYP(screen_Move_Typ);
					struct.seth_APPR_ID(appr_id);

					struct.setOWN_PERSON_NAME("");

					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));

					if (struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false) {
						List list3 = entity.mselectOWN_PERSON_CD.read(conn, struct);
						if (list3.size() != 0) {
							AA0070010Struct checkStruct = (AA0070010Struct)list3.get(0);
							struct.setOWN_PERSON_NAME(checkStruct.getOWN_PERSON_NAME());
						}
					}

					setReadStatus(NORMAL);
				} else {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("ZZ06001", Message);

					// �f�[�^�����݂��Ȃ��ꍇ�̃N���A����
					String w_vendCd = struct.getVEND_CD();	// �L�[���̑ޔ�
					struct.init();							// �\�����ڂ��f�t�H���g�ɖ߂�
					struct.setVEND_CD(w_vendCd);			// �L�[���̐ݒ�
				}
			}
		} catch(SQLException e) {
			// �Ǎ����s
			setSqlExceptionMsg(e);
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------
			
		String Message = "";
		boolean transFlg = false;
		try {

			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			transFlg = true;
			
			// �������̑��݊m�F
			List w = entity.mselect.read(conn, struct);
			if (w.size() > 0) {
				// �G���[���b�Z�[�W�ݒ�
				Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("ZZ01102", Message);
			}
			// ���͓��e�`�F�b�N
			isValidContents();

			// �G���[���������Ă��Ȃ��ꍇ�A�o�^�������{
			if(msgStruct.sizeError() <= 0){
				if("0".equals(struct.geth_APR_VEND_CTRL())){
					entity.minsertM_VEND_CTRL.create(conn, struct);
					conn.commit();
					transFlg = false;
					// �ŐV�̏���Ǎ�
					controlselect();
				}else{
					// ��ЃR�[�h�擾
					List list = entity.mselectCOMPANY_CD_1.read(conn, struct);
					if (list.size() != 0) {
						String company = ((AA0070010Struct)list.get(0)).getCOMPANY_CD();
						struct.setCOMPANY_CD(company);
					}
					insertAppr("insert");
					if(!msgStruct.hasError()){
						// �R�~�b�g
						conn.commit();
						transFlg = false;
					}
					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
				}
			} else {
				struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
				struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
			}
		} catch(SQLException e) {
			conn.rollback();
			setSqlExceptionMsg(e);
		}finally{
			try {
				if(transFlg == true){
					// ���[���o�b�N
					conn.rollback();
				}

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//---------------------------------------------------------------------
			
		String Message = "";
		boolean transFlg = false;
		try {
			conn.beginTransWeb();		// �g�����U�N�V�����J�n
			transFlg = true;

			// �X�V�m�F
			List w = entity.mselectMODIFY_COUNT.read(conn, struct);
			if(w.size() == 0){
				// �G���[���b�Z�[�W�ݒ�
				Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("ZZ06001", Message);
				struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
				struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
			}
			else{
				// �X�V�J�E���gOK?
				if(struct.getMODIFY_COUNT().equals(((AA0070010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("ZZ01105", Message);
					struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
					struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
				}
				else{
					isValidContents();
					// �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
					if(msgStruct.sizeError() <= 0){
						// ��ЃR�[�h�擾
						List list = entity.mselectCOMPANY_CD_1.read(conn, struct);
						if (list.size() != 0) {
							String company = ((AA0070010Struct)list.get(0)).getCOMPANY_CD();
							struct.setCOMPANY_CD(company);
						}
						if("0".equals(struct.geth_APR_VEND_CTRL())){
							entity.mupdateM_VEND_CTRL.update(conn, struct);
							conn.commit();
							// �ŐV�̏���Ǎ�
							controlselect();
						}else{
							
							insertAppr("update");
							if(!msgStruct.hasError()){
								// �R�~�b�g
								conn.commit();
								transFlg = false;
							}
							struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
							struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
						}
					} else {
						struct.setODR_FORM_FLG(convCheckBoxValue(struct.getODR_FORM_FLG()));
						struct.setODR_EDI_FLG(convCheckBoxValue(struct.getODR_EDI_FLG()));
					}
				}
			}
			
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally {
			try {
				if(transFlg){
					conn.rollback();
				}
			} catch(Exception e) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//---------------------------------------------------------------------
		String OPTION_ID="C*";
		String Message = "";
		boolean transFlg = false;
		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			transFlg = true;
			// �������̑��݊m�F
			List w = entity.mselect.read(conn, struct);
			if (w.size() == 0) {
				// �G���[���b�Z�[�W�ݒ�
				Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("ZZ06001", Message);
			}
			else{
				// �X�V�J�E���gOK?
				if(struct.getMODIFY_COUNT().equals(((AA0070010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("ZZ01105", Message);
				}
			}

			// ��ЃR�[�h�擾
			List list = entity.mselectCOMPANY_CD.read(conn, struct);
			if (list.size() != 0) {
				String company = ((AA0070010Struct)list.get(0)).getCOMPANY_CD();
				struct.setCOMPANY_CD(company);
				// �Q�Ɛ��������؁F��ƌn��
				List list1 = entity.mselectM_PROC_GRP.read(conn, struct);
				if (list1.size() != 0) {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00094", Message);
				}

				// �Q�Ɛ��������؁F�ۊǋ�
				List list2 = entity.mselectM_WH.read(conn, struct);
				if (list2.size() != 0) {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00095", Message);
				}

				// �Q�Ɛ��������؁F�w���P���w�b�_
				List list3 = entity.mselectM_PUCH_UNIT_COST_H.read(conn, struct);
				if (list3.size() != 0) {
				// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00096", Message);
				}

				// �Q�Ɛ��������؁F�O���P���w�b�_
				List list4 = entity.mselectM_SBCNT_UNIT_COST_H.read(conn, struct);
				if (list4.size() != 0) {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00097", Message);
				}

				// �Q�Ɛ��������؁F��ƌn��ʎd�|
				List list5 = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
				if (list5.size() != 0) {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00098", Message);
				}

				// �Q�Ɛ��������؁F�����c
				List list6 = entity.mselectT_RLSD_PUSH_ODR.read(conn, struct);
				if (list6.size() != 0) {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00099", Message);
				}

                // �Q�Ɛ��������؁F�L���x������
                List list7 = entity.mselectT_PAST_ONEROUS_CONS.read(conn, struct);
                if (list7.size() != 0 ) {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA00999", Message);
				}

                // �Q�Ɛ��������؁F�w���ԕi����
                List list8 = entity.mselectT_PUCH_ODR_RTN_RSLT.read(conn, struct);
                if (list8.size() != 0 ) {
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
					setErrorMessage("AA01000", Message);
				}
                
                // �Q�Ɛ��������؁F�x���P��
                List list9 = entity.mselectM_CONS_UNIT_COST.read(conn, struct);
                if(list9.size() != 0){
					// �G���[���b�Z�[�W�ݒ�
					Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                	setErrorMessage("AA02011", Message);
                }
                // �Q�Ɛ��������؁F�ϑ��݌�T_TRANSPORT_STOCK
                List list10 = entity.mselect_T_TRANSPORT_STOCK.read(conn, struct);
                if(list10.size()!=0){
                	// �G���[���b�Z�[�W�ݒ�
                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                	setErrorMessage("CA00133", Message);
                }
                //�Q�Ɛ��������؁F�o�Ɏw���@T_ISSUE_INST
                List list11 = entity.mselect_T_ISSUE_INST.read(conn, struct);
                if(list11.size()!=0){
                	// �G���[���b�Z�[�W�ݒ�
                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                	setErrorMessage("CA00134", Message);
                }
				struct.setOPTION_ID(OPTION_ID);
				List tempList  = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
				AA0070010Struct tempStruct = new AA0070010Struct();
				if(tempList!=null&&tempList.size()>0){
					tempStruct = (AA0070010Struct)tempList.get(0);
					struct.setINSTALL_FLG(tempStruct.getINSTALL_FLG());
				}
				if("1".equals(struct.getINSTALL_FLG())){
				//�Q�Ɛ��������؁F���|���c�� T_DEBT_BALANCE
	                List list12 = entity.mselect_T_DEBT_BALANCE.read(conn, struct);
	                if(list12.size()!=0){
	                	// �G���[���b�Z�[�W�ݒ�
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00135", Message);
	                }
	              //�Q�Ɛ��������؁F���|���c�����ׁ@�@�@�@�@�@�@�@�@T_DEBT_BALANCE_D
	                List list13 = entity.mselect_T_DEBT_BALANCE_D.read(conn, struct);
	                if(list13.size()!=0){
	                	// �G���[���b�Z�[�W�ݒ�
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00136", Message);
	                }
	              //�Q�Ɛ��������؁F���|�������w�b�_�@�@�@�@�@�@�@�@T_DEBT_LEDGER_H
	                List list14 = entity.mselect_T_DEBT_LEDGER_H.read(conn, struct);
	                if(list14.size()!=0){
	                	// �G���[���b�Z�[�W�ݒ�
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00137", Message);
	                }
	              //�Q�Ɛ��������؁F���|���g�����w�b�_�@�@�@�@�@�@�@�@T_DEBT_LEDGER_H_TRN
	                List list15 = entity.mselect_T_DEBT_LEDGER_H_TRN.read(conn, struct);
	                if(list15.size()!=0){
	                	// �G���[���b�Z�[�W�ݒ�
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00138", Message);
	                }
	              //�Q�Ɛ��������؁F�x���@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@T_PAYMENT
	                List list16 = entity.mselect_T_PAYMENT.read(conn, struct);
	                if(list16.size()!=0){
	                	// �G���[���b�Z�[�W�ݒ�
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00139", Message);
	                }
	              //�Q�Ɛ��������؁F�x���W�v�@�@�@�@�@�@�@�@�@�@�@�@�@�@T_PAYMENT_CALC
	                List list17 = entity.mselect_T_PAYMENT_CALC.read(conn, struct);
	                if(list17.size()!=0){ 
	                	// �G���[���b�Z�[�W�ݒ�
	                	Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
	                	setErrorMessage("CA00140", Message);
	                }
				}
				// �G���[���������Ă��Ȃ��ꍇ�A�폜�������{
				if(msgStruct.sizeError() <= 0){
					if("0".equals(struct.geth_APR_VEND_CTRL())){
						entity.mdeleteM_VEND_CTRL.delete(conn, struct);
						// �R�~�b�g
						conn.commit();
						// �f�[�^�N���A
						struct.clear();
						controlclear();	
					}else{
						insertAppr("delete");
						if(!msgStruct.hasError()){
							// �R�~�b�g
							conn.commit();
							transFlg = false;
							// �f�[�^�N���A
							struct.clear();
							controlclear();
						}
						
					}
					
				}
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}finally{
			try {
				if(transFlg == true){
					// ���[���o�b�N
					conn.rollback();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		try
		{
			// �f�t�H���g�l�ݒ�
			setDefaultData();	

			struct.seth_APR_VEND_CTRL(_APR_VEND_CTRL);
			// ���[�h�ݒ�
			setReadStatus(INITIAL);
			
		}
		catch(SQLException e)
		{
			setSqlExceptionMsg(e);
		}
				
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//----------------------------------------------------------------------
		// ���[�U��`������
		usersInitialize();
		//----------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
	try{
	 		// �R���{�{�b�N�X�f�[�^�p��
	 		ComboBox controller = new ComboBox(conn, sysUSER_CD);
	 		
			// �R���{�{�b�N�X�̃f�[�^���擾
			_ROUND_TYP = controller.getData("ROUND_TYP");
			_TAX_APPLY_TYP = controller.getData("TAX_APPLY_TYP");
			_TAX_CALC_TYP = controller.getData("TAX_CALC_TYP");
			_EXCH_TYP = controller.getData("EXCH_TYP");
			_IMPORT_TRN_TYP = controller.getData("IMPORT_TRN_TYP");
			_INSPC_ACPT_APP_TYP = controller.getData("INSPC_ACPT_APP_TYP");
			
			struct.setList_ROUND_TYP_val(_ROUND_TYP.getValList());
			struct.setList_ROUND_TYP_name(_ROUND_TYP.getExplanList());
			struct.setList_TAX_APPLY_TYP_val(_TAX_APPLY_TYP.getValList());
			struct.setList_TAX_APPLY_TYP_name(_TAX_APPLY_TYP.getExplanList());
			struct.setList_TAX_CALC_TYP_val(_TAX_CALC_TYP.getValList());
			struct.setList_TAX_CALC_TYP_name(_TAX_CALC_TYP.getExplanList());
			struct.setList_EXCH_TYP_val(_EXCH_TYP.getValList());
			struct.setList_EXCH_TYP_name(_EXCH_TYP.getExplanList());
			struct.setList_IMPORT_TRN_TYP_val(_IMPORT_TRN_TYP.getValList());
			struct.setList_IMPORT_TRN_TYP_name(_IMPORT_TRN_TYP.getExplanList());
			struct.setList_INSPC_ACPT_APP_TYP_val(_INSPC_ACPT_APP_TYP.getValList());
			struct.setList_INSPC_ACPT_APP_TYP_name(_INSPC_ACPT_APP_TYP.getExplanList());			

		 	// �N���A����
			controlclear();
			/** �p�����[�^�u����揳�F�v���擾*/
	        privateConfig = new PrivateConfig(conn);	        
	        // ����揳�F
	        String apr_Vend_Ctrl = privateConfig.getString("APR_VEND_CTRL");
	        // �p�����[�^�u����揳�F�v���擾�ł��Ȃ������ꍇ
			if(apr_Vend_Ctrl ==null || "".equals(apr_Vend_Ctrl)) {
	
				// �p�����[�^�u����揳�F�v���擾�ł��Ȃ������ꍇ
				String locale = CoreTools.getLocale(struct.getsUser_ID());
				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
				ExpjMessage emsg =new ExpjMessage("AZ00041" , messages.getString("AZ00051"));
				msgStruct.addError(emsg);
 			    sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_VEND_CTRL("0");
			} else if(!"1".equals(apr_Vend_Ctrl)) {
				// �P�ȊO�̏ꍇ
				struct.seth_APR_VEND_CTRL("0");
			} else {
				struct.seth_APR_VEND_CTRL("1");
			}
			_APR_VEND_CTRL = struct.geth_APR_VEND_CTRL();
			// �L�[���擾
	        if("1".equals(struct.geth_APR_VEND_CTRL()) && this.isScreenMove() && null != struct.geth_SCREENMOVE_TYP()){
				getKey();
			}
		}catch(SQLException e) {
			setSqlExceptionMsg(e);
		}catch(ComboException e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			
			throw ee;
		}
	 		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0070");
		logger.entering("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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

				struct.setList_ROUND_TYP_val(_ROUND_TYP.getValList());
				struct.setList_ROUND_TYP_name(_ROUND_TYP.getExplanList());
				struct.setList_TAX_APPLY_TYP_val(_TAX_APPLY_TYP.getValList());
				struct.setList_TAX_APPLY_TYP_name(_TAX_APPLY_TYP.getExplanList());
				struct.setList_TAX_CALC_TYP_val(_TAX_CALC_TYP.getValList());
				struct.setList_TAX_CALC_TYP_name(_TAX_CALC_TYP.getExplanList());
				struct.setList_EXCH_TYP_val(_EXCH_TYP.getValList());
				struct.setList_EXCH_TYP_name(_EXCH_TYP.getExplanList());
				struct.setList_IMPORT_TRN_TYP_val(_IMPORT_TRN_TYP.getValList());
				struct.setList_IMPORT_TRN_TYP_name(_IMPORT_TRN_TYP.getExplanList());
				struct.setList_INSPC_ACPT_APP_TYP_val(_INSPC_ACPT_APP_TYP.getValList());
				struct.setList_INSPC_ACPT_APP_TYP_name(_INSPC_ACPT_APP_TYP.getExplanList());			


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
//			throw new FoundationException("AA0070010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0070010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0070010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0070010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0070010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0070010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0070010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0070010Entity entity;
	protected AA0070010Struct struct;
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

		entity = new AA0070010Entity();
		struct = new AA0070010Struct();

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
	 * AA0070010�N���X�̕W���R���X�g���N�^
	 */
	public AA0070010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		//---------------------------------------------------------------------
		setReadStatus(INITIAL);
		//---------------------------------------------------------------------
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
				AA0070010Struct key = (AA0070010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ROUND_TYP_name") && key.getROUND_TYP_name() != null) {
					msgKey.setKeyValue("ROUND_TYP_name", key.getROUND_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP_val") && key.getROUND_TYP_val() != null) {
					msgKey.setKeyValue("ROUND_TYP_val", key.getROUND_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_name") && key.getTAX_APPLY_TYP_name() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP_name", key.getTAX_APPLY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_val") && key.getTAX_APPLY_TYP_val() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP_val", key.getTAX_APPLY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_name") && key.getTAX_CALC_TYP_name() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP_name", key.getTAX_CALC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_val") && key.getTAX_CALC_TYP_val() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP_val", key.getTAX_CALC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_name") && key.getEXCH_TYP_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_name", key.getEXCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_val") && key.getEXCH_TYP_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_val", key.getEXCH_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_name") && key.getIMPORT_TRN_TYP_name() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP_name", key.getIMPORT_TRN_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_val") && key.getIMPORT_TRN_TYP_val() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP_val", key.getIMPORT_TRN_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_name") && key.getINSPC_ACPT_APP_TYP_name() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP_name", key.getINSPC_ACPT_APP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_val") && key.getINSPC_ACPT_APP_TYP_val() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP_val", key.getINSPC_ACPT_APP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_VEND_CTRL") && key.geth_APR_VEND_CTRL() != null) {
					msgKey.setKeyValue("h_APR_VEND_CTRL", key.geth_APR_VEND_CTRL());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_01_TYP") && key.getVEND_CLASS_01_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_01_TYP", key.getVEND_CLASS_01_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_02_TYP") && key.getVEND_CLASS_02_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_02_TYP", key.getVEND_CLASS_02_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_03_TYP") && key.getVEND_CLASS_03_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_03_TYP", key.getVEND_CLASS_03_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_04_TYP") && key.getVEND_CLASS_04_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_04_TYP", key.getVEND_CLASS_04_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_05_TYP") && key.getVEND_CLASS_05_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_05_TYP", key.getVEND_CLASS_05_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_06_TYP") && key.getVEND_CLASS_06_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_06_TYP", key.getVEND_CLASS_06_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_07_TYP") && key.getVEND_CLASS_07_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_07_TYP", key.getVEND_CLASS_07_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_08_TYP") && key.getVEND_CLASS_08_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_08_TYP", key.getVEND_CLASS_08_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_09_TYP") && key.getVEND_CLASS_09_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_09_TYP", key.getVEND_CLASS_09_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_10_TYP") && key.getVEND_CLASS_10_TYP() != null) {
					msgKey.setKeyValue("VEND_CLASS_10_TYP", key.getVEND_CLASS_10_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("h_VEND_CD") && key.geth_VEND_CD() != null) {
					msgKey.setKeyValue("h_VEND_CD", key.geth_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_KNAME") && key.getVEND_KNAME() != null) {
					msgKey.setKeyValue("VEND_KNAME", key.getVEND_KNAME());
				}
				if(msgKeyType.containsKeyColumn("ZIP_CD") && key.getZIP_CD() != null) {
					msgKey.setKeyValue("ZIP_CD", key.getZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_1") && key.getADDRESS_1() != null) {
					msgKey.setKeyValue("ADDRESS_1", key.getADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_2") && key.getADDRESS_2() != null) {
					msgKey.setKeyValue("ADDRESS_2", key.getADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_K_1") && key.getADDRESS_K_1() != null) {
					msgKey.setKeyValue("ADDRESS_K_1", key.getADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_K_2") && key.getADDRESS_K_2() != null) {
					msgKey.setKeyValue("ADDRESS_K_2", key.getADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("TEL") && key.getTEL() != null) {
					msgKey.setKeyValue("TEL", key.getTEL());
				}
				if(msgKeyType.containsKeyColumn("FAX") && key.getFAX() != null) {
					msgKey.setKeyValue("FAX", key.getFAX());
				}
				if(msgKeyType.containsKeyColumn("EMAIL") && key.getEMAIL() != null) {
					msgKey.setKeyValue("EMAIL", key.getEMAIL());
				}
				if(msgKeyType.containsKeyColumn("VEND_ORG") && key.getVEND_ORG() != null) {
					msgKey.setKeyValue("VEND_ORG", key.getVEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("VEND_PERSON") && key.getVEND_PERSON() != null) {
					msgKey.setKeyValue("VEND_PERSON", key.getVEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OWN_ORG_CD") && key.getOWN_ORG_CD() != null) {
					msgKey.setKeyValue("OWN_ORG_CD", key.getOWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_ORG_NAME") && key.getOWN_ORG_NAME() != null) {
					msgKey.setKeyValue("OWN_ORG_NAME", key.getOWN_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_CD") && key.getOWN_PERSON_CD() != null) {
					msgKey.setKeyValue("OWN_PERSON_CD", key.getOWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME") && key.getOWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("OWN_PERSON_NAME", key.getOWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP") && key.getINSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP", key.getINSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ODR_FORM_FLG") && key.getODR_FORM_FLG() != null) {
					msgKey.setKeyValue("ODR_FORM_FLG", key.getODR_FORM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_EDI_FLG") && key.getODR_EDI_FLG() != null) {
					msgKey.setKeyValue("ODR_EDI_FLG", key.getODR_EDI_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_FAX_FLG") && key.getODR_FAX_FLG() != null) {
					msgKey.setKeyValue("ODR_FAX_FLG", key.getODR_FAX_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_MAIL_FLG") && key.getODR_MAIL_FLG() != null) {
					msgKey.setKeyValue("ODR_MAIL_FLG", key.getODR_MAIL_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_REM") && key.getVEND_REM() != null) {
					msgKey.setKeyValue("VEND_REM", key.getVEND_REM());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP") && key.getIMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP", key.getIMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("CTRL_CD") && key.getCTRL_CD() != null) {
					msgKey.setKeyValue("CTRL_CD", key.getCTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
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
					AA0070010Struct key = new AA0070010Struct();
					if(msgKeyType.containsKeyColumn("ROUND_TYP_name")) {
						key.setROUND_TYP_name(msgKey.getKeyValue("ROUND_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP_val")) {
						key.setROUND_TYP_val(msgKey.getKeyValue("ROUND_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_name")) {
						key.setTAX_APPLY_TYP_name(msgKey.getKeyValue("TAX_APPLY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_val")) {
						key.setTAX_APPLY_TYP_val(msgKey.getKeyValue("TAX_APPLY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_name")) {
						key.setTAX_CALC_TYP_name(msgKey.getKeyValue("TAX_CALC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_val")) {
						key.setTAX_CALC_TYP_val(msgKey.getKeyValue("TAX_CALC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_name")) {
						key.setEXCH_TYP_name(msgKey.getKeyValue("EXCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_val")) {
						key.setEXCH_TYP_val(msgKey.getKeyValue("EXCH_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_name")) {
						key.setIMPORT_TRN_TYP_name(msgKey.getKeyValue("IMPORT_TRN_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP_val")) {
						key.setIMPORT_TRN_TYP_val(msgKey.getKeyValue("IMPORT_TRN_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_name")) {
						key.setINSPC_ACPT_APP_TYP_name(msgKey.getKeyValue("INSPC_ACPT_APP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP_val")) {
						key.setINSPC_ACPT_APP_TYP_val(msgKey.getKeyValue("INSPC_ACPT_APP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_VEND_CTRL")) {
						key.seth_APR_VEND_CTRL(msgKey.getKeyValue("h_APR_VEND_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(new Integer(msgKey.getKeyValue("COUNT")));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_01_TYP")) {
						key.setVEND_CLASS_01_TYP(msgKey.getKeyValue("VEND_CLASS_01_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_02_TYP")) {
						key.setVEND_CLASS_02_TYP(msgKey.getKeyValue("VEND_CLASS_02_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_03_TYP")) {
						key.setVEND_CLASS_03_TYP(msgKey.getKeyValue("VEND_CLASS_03_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_04_TYP")) {
						key.setVEND_CLASS_04_TYP(msgKey.getKeyValue("VEND_CLASS_04_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_05_TYP")) {
						key.setVEND_CLASS_05_TYP(msgKey.getKeyValue("VEND_CLASS_05_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_06_TYP")) {
						key.setVEND_CLASS_06_TYP(msgKey.getKeyValue("VEND_CLASS_06_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_07_TYP")) {
						key.setVEND_CLASS_07_TYP(msgKey.getKeyValue("VEND_CLASS_07_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_08_TYP")) {
						key.setVEND_CLASS_08_TYP(msgKey.getKeyValue("VEND_CLASS_08_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_09_TYP")) {
						key.setVEND_CLASS_09_TYP(msgKey.getKeyValue("VEND_CLASS_09_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_10_TYP")) {
						key.setVEND_CLASS_10_TYP(msgKey.getKeyValue("VEND_CLASS_10_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_VEND_CD")) {
						key.seth_VEND_CD(msgKey.getKeyValue("h_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_KNAME")) {
						key.setVEND_KNAME(msgKey.getKeyValue("VEND_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("ZIP_CD")) {
						key.setZIP_CD(msgKey.getKeyValue("ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_1")) {
						key.setADDRESS_1(msgKey.getKeyValue("ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_2")) {
						key.setADDRESS_2(msgKey.getKeyValue("ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_K_1")) {
						key.setADDRESS_K_1(msgKey.getKeyValue("ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_K_2")) {
						key.setADDRESS_K_2(msgKey.getKeyValue("ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("TEL")) {
						key.setTEL(msgKey.getKeyValue("TEL"));
					}
					if(msgKeyType.containsKeyColumn("FAX")) {
						key.setFAX(msgKey.getKeyValue("FAX"));
					}
					if(msgKeyType.containsKeyColumn("EMAIL")) {
						key.setEMAIL(msgKey.getKeyValue("EMAIL"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ORG")) {
						key.setVEND_ORG(msgKey.getKeyValue("VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_PERSON")) {
						key.setVEND_PERSON(msgKey.getKeyValue("VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ORG_CD")) {
						key.setOWN_ORG_CD(msgKey.getKeyValue("OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ORG_NAME")) {
						key.setOWN_ORG_NAME(msgKey.getKeyValue("OWN_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_CD")) {
						key.setOWN_PERSON_CD(msgKey.getKeyValue("OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME")) {
						key.setOWN_PERSON_NAME(msgKey.getKeyValue("OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(new Integer(msgKey.getKeyValue("ROUND_TYP")));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP")) {
						key.setINSPC_ACPT_APP_TYP(msgKey.getKeyValue("INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(new Integer(msgKey.getKeyValue("TAX_APPLY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(new Integer(msgKey.getKeyValue("TAX_CALC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ODR_FORM_FLG")) {
						key.setODR_FORM_FLG(msgKey.getKeyValue("ODR_FORM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_EDI_FLG")) {
						key.setODR_EDI_FLG(msgKey.getKeyValue("ODR_EDI_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_FAX_FLG")) {
						key.setODR_FAX_FLG(msgKey.getKeyValue("ODR_FAX_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_MAIL_FLG")) {
						key.setODR_MAIL_FLG(msgKey.getKeyValue("ODR_MAIL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_REM")) {
						key.setVEND_REM(msgKey.getKeyValue("VEND_REM"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP")) {
						key.setIMPORT_TRN_TYP(msgKey.getKeyValue("IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CTRL_CD")) {
						key.setCTRL_CD(msgKey.getKeyValue("CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
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
