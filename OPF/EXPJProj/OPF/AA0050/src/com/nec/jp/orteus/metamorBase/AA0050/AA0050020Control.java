/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/src/com/nec/jp/orteus/metamorBase/AA0050/AA0050020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0050;

import com.nec.jp.orteus.metamorBase.AA0050.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import java.util.ArrayList;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0050020Control
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

	public AA0050020Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B


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
	 * SQLException���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(Exception e) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		throw ee;
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

	/**
	 * ���[�j���O���b�Z�[�W�ݒ�
	 * @param �R�[�h
	 * @param �L�[����
	 */
	private void setWarnMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.info(emsg, getsysUSER_CD()); //�G���[���e
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addWarn( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.info(emsg, getsysUSER_CD()); //�G���[�ڍ�
	}

//-----------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

//---------- �L�[���ڎ擾�֘A�̏��� --------------------------------------------

	/** �L�[���ێ��ׂ̈�Struct */
	private AA0050020Struct _keyStruct = new AA0050020Struct();

	/** �L�[���Struct�̎擾 */
	public AA0050020Struct getKeyStruct(){ return _keyStruct; }
	
	/** �L�[���Struct�̐ݒ� */
	public void setKeyStruct(AA0050020Struct struct){ _keyStruct.copy(struct); }

//---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------

	/** �i�ڎ�z�敪 */
	ComboStruct _MRP_ODR_TYP = null;

	/** �i�ڎ�z�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** �i�ڎ�z�敪�擾
	 * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }

	/** �i�ړ��O��敪 */
	ComboStruct _OUTSIDE_TYP = null;

	/** �i�ړ��O��敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setOUTSIDE_TYP_comb(ComboStruct combo){ _OUTSIDE_TYP = combo; }

	/** �i�ړ��O��敪�擾
	 * @return �i�ړ��O��敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getOUTSIDE_TYP_comb(){ return _OUTSIDE_TYP; }

//-------------------------------------------------------------------------
	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param intType �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, Integer intType)
	{
		String strTyp = TypeConverter.sanitizer(intType);
		return getTypeName(comboStruct,strTyp);
	}
	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param strTyp �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp)
	{
		String strTypName = strTyp;
		for(int i = 0; i < comboStruct.getValList().size(); i++){
			if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
	/**
	 * �i�ڏ��̃t���O�̕\����ݒ�
	 * @param s �t���O�̒l���ݒ肳��Ă�����
	 */
	private void setTypeValueAboutItem(AA0050020Struct s)
	{
		/** �i�ڎ�z�敪 */
		s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
		/** �i�ړ��O��敪 */
		s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
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

		// �R���{�f�[�^�̎擾
		setComboData(struct);

		_usersIntialized = true;
		return ;
	}


//------------------------------------------------------------------------
	/**
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
	 private void setComboData(AA0050020Struct data) throws ExpjException
	 {
		ComboBox controller = new ComboBox(conn, sysUSER_CD);

		try{
			//�R���{�f�[�^�̎擾
			ComboStruct MRP_ODR_TYP_comb = controller.getData("MRP_ODR_TYP");
			ComboStruct OUTSIDE_TYP_comb = controller.getData("OUTSIDE_TYP");

			controller.setConnection(null);

			//�����Ɏ擾�f�[�^�ݒ�
			setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
			setOUTSIDE_TYP_comb(OUTSIDE_TYP_comb);

		}catch(SQLException e) {
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}

	//------------------------------------------------------------------------------

	/** �����Ώ�Struct�ޔ�p */
	private AA0050020Struct _save_struct = new AA0050020Struct();

//------------------------------------------------------------------------------

	/** DB�X�V�O�`�F�b�N�i�s�C���|�X�V�A�s�폜�A�S�폜�A�ԍ��ĐU�j
	 * @param �Ȃ�
	 * @return true:���� false:���s
	*/
	public boolean checkListData() throws FoundationException, ExpjException
	{
		List key = new ArrayList();

		// �߂�l�ϐ�������
		boolean bResult = true;

		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();  // Connection��AutoCommit�t���O�𐧌䂵�܂�

			// ���݂̓Ǎ��L�[�Ńf�[�^��Ǎ�(select for update no wait�������Ă���Ǎ�����)
			List temp_list = new ArrayList();
			temp_list = entity.mselectRetry.read(conn, struct);

			// �ǂݍ��񂾃f�[�^���������ݓǂݍ���ł��錏���Ɠ������ǂ����̃`�F�b�N
			if(temp_list.size() != this.getListsize())
			{
				// �G���[���b�Z�[�W�쐬
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// �ǂݍ��񂾊e�f�[�^���e�����ݓǂݍ���ł���f�[�^���e�Ɠ������ǂ����̃`�F�b�N
				AA0050020Struct now_struct = new AA0050020Struct();
				AA0050020Struct temp_struct = new AA0050020Struct();
				for(int i = 0; i < this.getListsize(); i++)
				{
					// �e���X�g����f�[�^���擾
					now_struct = (AA0050020Struct)this.getListvalue(i);
					temp_struct = (AA0050020Struct)temp_list.get(i);

					// �ۊǋ�R�[�h�A�D�揇�ʔԍ����������ǂ����̃`�F�b�N
					if((now_struct.getWH_CD().equals(temp_struct.getWH_CD()) != true)
					|| (Calculate.compare(now_struct.getWH_PRIORITY_REF_NO(), temp_struct.getWH_PRIORITY_REF_NO()) != 0) )
					{
						// �G���[���b�Z�[�W�쐬
						key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
						key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
						setErrorMessage("ZZ01105", key);
						break;
					}
				}
			}

			// �G���[���Ȃ�
			if(msgStruct.sizeError() == 0)
			{
				// �R�~�b�g
				conn.commit();

				// �����t���O�ݒ�
				bResult = true;
			}
			else
			{
				// ���[���o�b�N
				conn.rollback();

				// ���s�t���O�ݒ�
				bResult = false;
			}

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			// ���s�t���O�ݒ�
			bResult = false;

			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ���[���o�b�N
			conn.rollback();

			// ���s�t���O�ݒ�
			bResult = false;

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		return bResult;
	}

	//------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		List key = new ArrayList();
		String keyMessage = "";

		try {
			// ���p�ҍH��R�[�h�ݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// �L�[���ړǂݍ��ݏ���
			List temp_list = new ArrayList(0);
			temp_list = entity.mselectM_ITEM.read(conn, struct);
			if(temp_list.size() > 0){
				_keyStruct.copy((AA0050020Struct)temp_list.get(0));

				// �ǂݍ��ݏ���
				list = entity.mselect.read(conn, struct);
				if(list.size() == 0){
					// �ǂݍ��݃L�[�ݒ�
					_keyStruct.seth_ITEM_CD(struct.getITEM_CD());

					// ������Ԃ��u�O���Ǎ��v�ɐݒ�
					setReadStatus(NOT_FOUND);

				} else if(list.size() > 0) {
					// �Ō�̓ǂݍ��ݐ����L�[�ݒ�
					_keyStruct.seth_ITEM_CD(struct.getITEM_CD());

					// ������Ԃ��u�Ǎ������v�ɐݒ�
					setReadStatus(NORMAL);
				}

				// [���ɐ�ۊǋ�]�̓Ǎ�����
				List wklist = entity.mM_ITEM_RCV_WH.read(conn, struct);
				if( wklist.size() > 0 ){
					AA0050020Struct wkStruct = (AA0050020Struct)wklist.get(0);
					_keyStruct.setRCV_WH_CD(wkStruct.getRCV_WH_CD());
					_keyStruct.setRCV_WH_NAME(wkStruct.getRCV_WH_NAME());
				}

				// �R���{�{�b�N�X�l�ɑΉ����閼�̂��Z�b�g
				setTypeValueAboutItem(_keyStruct);
				struct.setStruct(_keyStruct);

			}else{
				// �ŏI���͒l�Ƃ��Đݒ�
				_keyStruct.copy(struct);
				// ��������0���̏ꍇ
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA01002", keyMessage);

				// ������Ԃ��u������ԁv�ɐݒ�
				setReadStatus(INITIAL);

				// �f�[�^�����݂��Ȃ��ꍇ�̃N���A����
				// hidden�̃N���A
				struct.seth_ITEM_CD("");

				// �i�ڏ��̃N���A
				struct.setITEM_NAME("");

				// �ꗗ�̃N���A
				if(list != null){
					list.clear();
				}
				else{
					list = new ArrayList(0);
				}
				String w_itemCd = this._keyStruct.getITEM_CD();	// �L�[���̑ޔ�
				this._keyStruct.initialize();					// �\�����ڂ��f�t�H���g�ɖ߂�
				this._keyStruct.setITEM_CD(w_itemCd);			// �L�[���̐ݒ�
			}

		} catch(SQLException e) {
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			setSqlExceptionMsg(e);

		}catch(Exception e){
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
		List key = new ArrayList();

		try{
			// �����l�ݒ�
			struct.initialize();

			// ���p�ҍH��R�[�h�ݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// �i�ڔԍ��ݒ�
			struct.setITEM_CD(_keyStruct.getITEM_CD());

			// �i�ږ��ݒ�
			struct.setITEM_NAME(_keyStruct.getITEM_NAME());

		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
		List key = new ArrayList();

		try {
			// �Ώۂ̃f�[�^���R�s�[
			AA0050020Struct target_struct = new AA0050020Struct();
			target_struct.copy(struct);

			// ���p�ҍH��R�[�h�ݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());// �G���[���b�Z�[�W�p
			target_struct.setw_PLANT_CD(getsysPLANT_CD());

			// �i�ڔԍ��ݒ�
			target_struct.setITEM_CD(_keyStruct.getITEM_CD());

			// �i�ږ��ݒ�
			target_struct.setITEM_NAME(_keyStruct.getITEM_NAME());

			// �����Ώۃf�[�^���݃`�F�b�N
			List temp_list = new ArrayList(0);
			AA0050020Struct temp_struct = new AA0050020Struct();
			temp_list = entity.mselectTargetData.read(conn, target_struct);
			if(temp_list.size() <= 0)
			{
				// �G���[���b�Z�[�W�쐬
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
				key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(target_struct.getw_MODIFY_COUNT().equals(temp_struct.getw_MODIFY_COUNT()) != true)
				{
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("ZZ01105", key);
				}
			}

			// �G���[���Ȃ��ꍇ�A�������s
			if(msgStruct.sizeError() <= 0)
			{
				// ��ʕ\��Struct�փf�[�^���R�s�[
				struct.copy(target_struct);

				// �X�V�O�Ώۃf�[�^����ޔ�
				_save_struct.copy(target_struct);

			}

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcopy");
			//{{user_implement_dev:<controlcopy>
		List key = new ArrayList();

		try{
			// ���p�ҍH��R�[�h�ݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// �i�ڔԍ��ݒ�
			struct.setITEM_CD(_keyStruct.getITEM_CD());

			// �i�ږ��ݒ�
			struct.setITEM_NAME(_keyStruct.getITEM_NAME());

		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcopy>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlerase() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlerase");
			//{{user_implement_dev:<controlerase>
		List key = new ArrayList();

		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();  // Connection��AutoCommit�t���O�𐧌䂵�܂�

			// �Ώۂ̃f�[�^���R�s�[
			AA0050020Struct target_struct = new AA0050020Struct();
			target_struct.copy(struct);

			// ���p�ҍH��R�[�h�ݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());// �G���[���b�Z�[�W�p
			target_struct.setw_PLANT_CD(getsysPLANT_CD());

			// �i�ڔԍ��ݒ�
			target_struct.setITEM_CD(_keyStruct.getITEM_CD());

			// �����Ώۃf�[�^���݃`�F�b�N
			List temp_list = new ArrayList(0);
			AA0050020Struct temp_struct = new AA0050020Struct();
			temp_list = entity.mselectTargetDataForUpdate.read(conn, target_struct);
			if(temp_list.size() <= 0)
			{
				// �G���[���b�Z�[�W�쐬
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
				key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(target_struct.getw_MODIFY_COUNT().equals(temp_struct.getw_MODIFY_COUNT()) != true)
				{
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("ZZ01105", key);
				}
			}

			// �G���[���Ȃ��ꍇ�A�������s
			if(msgStruct.sizeError() <= 0)
			{
				// �폜
				entity.mdeleteM_WH_PRIORITY.delete(conn, target_struct);

				// �R�~�b�g
				conn.commit();

				// �Ǎ��ݏ���
				controlselect();
			}
			else
			{
				// ���[���o�b�N
				conn.rollback();
			}

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controlerase>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlerase");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controleraseAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controleraseAll");
			//{{user_implement_dev:<controleraseAll>
		List key = new ArrayList();

		try {
			// ���p�ҍH��R�[�h�ݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// �����O�̃��X�g�f�[�^�`�F�b�N����
			if(checkListData() == false)
			{
				return;
			}

		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}

		try {

			// �g�����U�N�V�����J�n
			conn.beginTransWeb();  // Connection��AutoCommit�t���O�𐧌䂵�܂�

			// �폜����
			for(int i = 0 ;i < this.getListsize() ;i++){

				// �w��C���f�b�N�X�̃��X�g�f�[�^��struct�֎擾�ݒ�
				struct.copy((AA0050020Struct)this.getListvalue(i));

				// �i�ڔԍ��ݒ�
				struct.setITEM_CD(_keyStruct.getITEM_CD());

				// �폜
				entity.mdeleteM_WH_PRIORITY.delete(conn, struct);

			}

			// �R�~�b�g
			conn.commit();

			// �i�ڔԍ��ݒ�
			struct.setITEM_CD(_keyStruct.getITEM_CD());

			controlselect();

		}
		catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controleraseAll>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controleraseAll");

		return;
	}

	/**
	 * �ԍ��ĐU�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlchange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlchange");
			//{{user_implement_dev:<controlchange>
		List key = new ArrayList();

		try {
			// ���p�ҍH��R�[�h�ݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());

			// �����O�̃��X�g�f�[�^�`�F�b�N����
			if(checkListData() == false)
			{
				return;
			}

		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}

		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();  // Connection��AutoCommit�t���O�𐧌䂵�܂�

			// �i�ڔԍ���ޔ�
			String sITEM_CD = struct.getITEM_CD();

			// �폜����
			String strWH_PRIORITY_REF_NO = new String("0");
			for(int i = 0 ;i < this.getListsize() ;i++ ){

				// �w��C���f�b�N�X�̃��X�g�f�[�^��struct�֎擾�ݒ�
				struct.copy((AA0050020Struct)this.getListvalue(i));
				// �i�ڔԍ��ݒ�
				struct.setITEM_CD(sITEM_CD);
				boolean result = false;			// �`�F�b�N���ʊi�[�p

				// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
				result = entity.mcheckMODIFY_COUNT.check(conn, struct);
				if(result == false){
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.MODIFY_COUNT:" + struct.getw_MODIFY_COUNT());
					setErrorMessage("ZZ01105", key);
					break;
				}

				// �G���[���Ȃ��ꍇ�A�X�V����
				if(msgStruct.sizeError() <= 0){

					// �D�揇�ʔԍ���10�Ԃ���10���݂Őݒ�
					strWH_PRIORITY_REF_NO = Calculate.add(strWH_PRIORITY_REF_NO, "10");
					struct.setWH_PRIORITY_REF_NO(strWH_PRIORITY_REF_NO);

					// �X�V����
					entity.mupdateM_WH_PRIORITY.update(conn, struct);

				}
			}

			// �G���[���Ȃ��ꍇ�A�X�V����
			if(msgStruct.sizeError() <= 0){
				// �R�~�b�g
				conn.commit();

				// �Ǎ�����
				controlselect();

			} else {

				// ���[���o�b�N
				conn.rollback();

			}

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controlchange>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlchange");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		List key = new ArrayList();

		try{
			if(list != null){
				list.clear();
			}
			else{
				list = new ArrayList(0);
			}
			this.struct.initialize();
			this._keyStruct.initialize();
			this._save_struct.initialize();

			// ������Ԃ��u������ԁv�ɐݒ�
			setReadStatus(INITIAL);

		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
		// ���[�h�ݒ�
		struct.setStruct(_keyStruct);
		controlselect();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
		List key = new ArrayList();
		String keyMessage = "";

		try{
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();  // Connection��AutoCommit�t���O�𐧌䂵�܂�

			boolean result = false;			// �`�F�b�N���ʊi�[�p

			List temp_list = new ArrayList(0);
			AA0050020Struct temp_struct = new AA0050020Struct();

			// ���v�ʑΏۃt���O�`�F�b�N
			struct.setw_PLANT_CD(getsysPLANT_CD());
			result = entity.mCHECK_MRP_WH.check(conn, struct);
			if( result ){
				key.add("M_WH.WH_CD:" + struct.getWH_CD());
				key.add("M_WH.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH.MRP_FLG:<>1");
				setErrorMessage("AA00149", key);
			}

			// �����Ώۃf�[�^���݃`�F�b�N
			temp_list = entity.mselectTargetDataForUpdate.read(conn, _save_struct);
			if(temp_list.size() <= 0)
			{
				// �G���[���b�Z�[�W�쐬
				key.add("M_WH_PRIORITY.PLANT_CD:" + _save_struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + _save_struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD());
				key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + _save_struct.getWH_PRIORITY_REF_NO());
				setErrorMessage("ZZ01105", key);
			}
			else
			{
				// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(struct.getw_MODIFY_COUNT().equals(temp_struct.getw_MODIFY_COUNT()) != true)
				{
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH_PRIORITY.PLANT_CD:" + _save_struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + _save_struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + _save_struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("ZZ01105", key);
				}
			}

			// �D�揇�ʔԍ��̏d���`�F�b�N
			// �ŐV��Ԏ擾�̂��߂̓Ǎ�
			temp_list = entity.mselect.read(conn, struct);
			for(int i = 0; i < temp_list.size(); i++)
			{
				// �ŐV�f�[�^�擾
				temp_struct = (AA0050020Struct)temp_list.get(i);

				// �������g�̃f�[�^�̗D�揇�ʂ̓`�F�b�N�ΏۂƂ��Ȃ�
				if(struct.getWH_CD().equals(temp_struct.getWH_CD()) == true)
				{
					continue;
				}

				// �D�揇�ʔԍ����������ǂ����̃`�F�b�N
				if(Calculate.compare(struct.getWH_PRIORITY_REF_NO(), temp_struct.getWH_PRIORITY_REF_NO()) == 0)
				{
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("AA00080", key);
					break;
				}
			}

			// �ۊǋ摶�݃`�F�b�N
			result = entity.mcheckM_WH.check(conn, struct);
			if(result == false){
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD();
				setErrorMessage("AA01009", keyMessage);
			}

			// �G���[���Ȃ��ꍇ�A�X�V����
			if(msgStruct.sizeError() <= 0){

				// �X�V
				entity.mupdateM_WH_PRIORITY.update(conn, struct);

				// �R�~�b�g
				conn.commit();

				// �ۊǋ�}�X�^�̎����R�[�h���݃`�F�b�N
				temp_list = entity.mselectVEND_CD_IN_WH.read(conn, struct);
				if(temp_list.size() > 0)
				{
					temp_struct = (AA0050020Struct)temp_list.get(0);
					if( temp_struct.getw_VEND_CD() != null ){
						// ���[�j���O���b�Z�[�W�쐬
						keyMessage = "M_WH_PRIORITY.WH_CD:" + _save_struct.getWH_CD();
						setWarnMessage("AA60004", keyMessage);
					}
				}

				// �Ǎ��ݏ���
				controlselect();

			} else {

				// ���[���o�b�N
				conn.rollback();

			}

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			setSqlExceptionMsg(e);

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
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
		List key = new ArrayList();
		String keyMessage = "";

		try{
			//�s�ǉ�,�s����
			boolean result = false;			// �`�F�b�N���ʊi�[�p

			// �ۊǋ摶�݃`�F�b�N
			result = entity.mcheckM_WH.check(conn, struct);
			if(result == false){
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_WH_PRIORITY.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AA01009", keyMessage);

			}

			// ���v�ʑΏۃt���O�`�F�b�N
			struct.setw_PLANT_CD(getsysPLANT_CD());
			result = entity.mCHECK_MRP_WH.check(conn, struct);
			if( result ){
				key.add("M_WH.WH_CD:" + struct.getWH_CD());
				key.add("M_WH.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH.MRP_FLG:<>1");
				setErrorMessage("AA00149", key);
			}

			// �ۊǐ�D�揇�ʑ��݃`�F�b�N
			result = entity.mcheckM_WH_PRIORITY.check(conn, struct);
			if(result == true){
				// �G���[���b�Z�[�W�쐬
				key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
				key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
				key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
				setErrorMessage("ZZ01102", key);

			}

 			// �ۊǋ�.�H��R�[�h �� ���p�ҍH��R�[�h �`�F�b�N
			List temp_list = new ArrayList();
			AA0050020Struct temp_struct = new AA0050020Struct();
			temp_list = entity.mselectPLANT_CD_IN_WH.read(conn, struct);
			if(temp_list.size() > 0)
			{
				temp_struct = (AA0050020Struct)temp_list.get(0);
				if(temp_struct.getw_PLANT_CD().equals(struct.getw_PLANT_CD()) != true)
				{
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA01007", keyMessage);
				}
			}

			// �D�揇�ʔԍ��̏d���`�F�b�N
			// �ŐV��Ԏ擾�̂��߂̓Ǎ�
			temp_list = entity.mselect.read(conn, struct);
			for(int i = 0; i < temp_list.size(); i++)
			{
				// �ŐV�f�[�^�擾
				temp_struct = (AA0050020Struct)temp_list.get(i);

				// �D�揇�ʔԍ����������ǂ����̃`�F�b�N
				if(Calculate.compare(struct.getWH_PRIORITY_REF_NO(), temp_struct.getWH_PRIORITY_REF_NO()) == 0)
				{
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH_PRIORITY.PLANT_CD:" + struct.getw_PLANT_CD());
					key.add("M_WH_PRIORITY.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_WH_PRIORITY.WH_CD:" + struct.getWH_CD());
					key.add("M_WH_PRIORITY.WH_PRIORITY_REF_NO:" + struct.getWH_PRIORITY_REF_NO());
					setErrorMessage("AA00080", key);
					break;
				}
			}

			// �G���[���Ȃ��ꍇ�A�ǉ�����
			if(msgStruct.sizeError() <= 0){

				// �o�^
				entity.minsertM_WH_PRIORITY.create(conn, struct);

				// �ۊǋ�}�X�^�̎����R�[�h���݃`�F�b�N
				temp_list = entity.mselectVEND_CD_IN_WH.read(conn, struct);
				if(temp_list.size() > 0)
				{
					temp_struct = (AA0050020Struct)temp_list.get(0);
					if( temp_struct.getw_VEND_CD() != null ){
						// ���[�j���O���b�Z�[�W�쐬
						keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
						setWarnMessage("AA60004", keyMessage);
					}
				}

				// �Ǎ��ݏ���
				controlselect();
			}

		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>

		List wkList = null;
		List listMessage = new ArrayList();
		String strMessage = "";
		AA0050020Struct wkStruct = null;
		boolean transFlg = false;

		try{

			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			transFlg = true;

			struct.setw_PLANT_CD(getsysPLANT_CD());

			if( struct.getRCV_WH_CD() == null || 
				"".equals(struct.getRCV_WH_CD()) ){		// ���ɐ�ۊǋ�R�[�h�������͂̏ꍇ

				// [�i�ڕʓ��ɐ�ۊǋ�]�ɑ��݂���΍폜����
				wkList = entity.mM_ITEM_RCV_WH_LOCK.read(conn, struct);
				if( wkList.size() > 0 ){
					entity.mM_ITEM_RCV_WH.delete(conn, struct);
				}

			} else {	// ���ɐ�ۊǋ�R�[�h�����͂��ꂽ�ꍇ

				// [�ۊǋ�]�̑��݃`�F�b�N
				wkList = entity.mCHECK_MRP_FLG_M_WH.read(conn, struct);
				if( wkList.size() <= 0 ){
					strMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
					setErrorMessage("AA01009", strMessage);
					return;
				}
				wkStruct = (AA0050020Struct)wkList.get(0);

				// �H��R�[�h�̃`�F�b�N
				if( !struct.getw_PLANT_CD().equals(wkStruct.getw_PLANT_CD()) ){
					strMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
					setErrorMessage("AA01007", strMessage);
				}

				// ���v�ʑΏۃt���O�`�F�b�N
				if( wkStruct.getw_MRP_FLG().intValue() != AA0050Const._MRP_TARGET ){
					strMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
					setErrorMessage("AA00149", strMessage);
				}

				if( msgStruct.sizeError() <= 0 ){
					// [�i�ڕʓ��ɐ�ۊǋ�]�ɑ��݂��Ȃ���Βǉ�
					// ���݂���΍X�V
					wkList = entity.mM_ITEM_RCV_WH_LOCK.read(conn, struct);
					if( wkList.size() <= 0 ){
						entity.mM_ITEM_RCV_WH.create(conn, struct);
					} else {
						entity.mM_ITEM_RCV_WH.update(conn, struct);
					}
				} else {
					return;
				}

			}

            // �R�~�b�g
            conn.commit();
            transFlg = false;

            controlselect();

		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally {
            try {
                if( transFlg ){
                    conn.rollback();
                    transFlg = false;
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		List key = new ArrayList();

		try {
			//�R���{�f�[�^�̐ݒ�
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
			ComboStruct _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
			controller.setConnection(null);
			
			//Struct�Ƀf�[�^�ݒ�
			setMRP_ODR_TYP_comb(_MRP_ODR_TYP);
			setOUTSIDE_TYP_comb(_OUTSIDE_TYP);

			// ������Ԃ��u������ԁv�ɐݒ�
			setReadStatus(INITIAL);

		} catch(SQLException e) {
			setSqlExceptionMsg(e);

		} catch(ComboException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		try {
			//�R���{�f�[�^�̐ݒ�
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			ComboStruct _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
			ComboStruct _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
			controller.setConnection(null);
		}catch(Exception e){
			e.printStackTrace();
		}
			// �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0050020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("append") ) {
				controlappend();
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("copy") ) {
				controlcopy();
			} else if( button.equals("erase") ) {
				controlerase();
			} else if( button.equals("eraseAll") ) {
				controleraseAll();
			} else if( button.equals("change") ) {
				controlchange();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		// �R���{�{�b�N�X�f�[�^�ݒ�
		struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
		struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
		struct.setList_OUTSIDE_TYP_val(_OUTSIDE_TYP.getValList());
		struct.setList_OUTSIDE_TYP_name(_OUTSIDE_TYP.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0050020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0050020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0050020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0050020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0050020Entity entity;
	protected AA0050020Struct struct;
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

		entity = new AA0050020Entity();
		struct = new AA0050020Struct();

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
	 * AA0050020�N���X�̕W���R���X�g���N�^
	 */
	public AA0050020Control() throws BusinessProcessException, FoundationException
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
				AA0050020Struct key = (AA0050020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_PRIORITY_REF_NO") && key.getWH_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("WH_PRIORITY_REF_NO", key.getWH_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_CD") && key.getRCV_WH_CD() != null) {
					msgKey.setKeyValue("RCV_WH_CD", key.getRCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_NAME") && key.getRCV_WH_NAME() != null) {
					msgKey.setKeyValue("RCV_WH_NAME", key.getRCV_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val().toString());
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
					AA0050020Struct key = new AA0050020Struct();
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_PRIORITY_REF_NO")) {
						key.setWH_PRIORITY_REF_NO(msgKey.getKeyValue("WH_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_CD")) {
						key.setRCV_WH_CD(msgKey.getKeyValue("RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_NAME")) {
						key.setRCV_WH_NAME(msgKey.getKeyValue("RCV_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(new Integer(msgKey.getKeyValue("w_MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(new Integer(msgKey.getKeyValue("MRP_ODR_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(new Integer(msgKey.getKeyValue("OUTSIDE_TYP_val")));
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
