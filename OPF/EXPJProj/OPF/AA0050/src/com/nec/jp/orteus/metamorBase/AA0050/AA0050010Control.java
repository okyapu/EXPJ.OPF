/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/src/com/nec/jp/orteus/metamorBase/AA0050/AA0050010Control.java,v $
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
import com.nec.jp.orteus.metamorBase.AA0050.AA0050Const;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0050010Control
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

	public AA0050010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	/* �����\�t���O�̃`�F�b�N�t���O true �� ON */
	boolean _WH_INSIDE_FLG = false;

	/* �O���\�t���O�̃`�F�b�N�t���O true �� ON */
	boolean _WH_OUTSIDE_FLG = false;

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
	 * �G���[���b�Z�[�W�ݒ�(����)
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
	 * �x�����b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 */
	private void setWarnMessage(String messageno)
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

//-----------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

//------------ �R���{�{�b�N�X�f�[�^--------------------------------------

	/** �q�ɋ敪 */
	private ComboStruct _WH_TYP = new ComboStruct();

	/** �q�ɋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setWH_TYP(ComboStruct combo){ _WH_TYP = combo; }

	/** �q�ɋ敪�擾
	 * @return �q�ɋ敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getWH_TYP(){ return _WH_TYP; }


	/** ���v�ʌv�Z�Ώۃt���O */
	private ComboStruct _MRP_FLG = new ComboStruct();

	/** ���v�ʌv�Z�Ώۃt���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMRP_FLG(ComboStruct combo){ _MRP_FLG = combo; }

	/** ���v�ʌv�Z�Ώۃt���O�擾
	 * @return ���v�ʌv�Z�Ώۃt���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMRP_FLG(){ return _MRP_FLG; }

//------------------------------------------------------------------------------

	/** �Ǎ��t���O�ݒ�p�ϐ� */
	private String _read_flag = null;

	/**
	 * �Ǎ��t���O�ݒ�
	 * @param String
	 */
	public String getReadFlag()
	{
		return _read_flag;
	}

	/** 
	 * �Ώۃf�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
	 * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
	 *
	 * @param target_struct �Ώۃf�[�^���
	 * @param modify_count �Ώۃf�[�^MODIFY_COUNT
	 * @return boolean true:�G���[���� false:�G���[�Ȃ�
	 */
	private boolean checkTargetData(AA0050010Struct target_struct, String modify_count) throws FoundationException, SQLException
	{
		String keyMessage = "";

		// �����Ώۃf�[�^�̑��݃`�F�b�N
		List temp_list = new ArrayList(0);

		temp_list = entity.mselectRetry.read(conn, target_struct);

		if(temp_list.size() <= 0)
		{

			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setErrorMessage("ZZ06001", keyMessage);
			return true;
		}
		else
		{

			// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
			AA0050010Struct temp_struct = (AA0050010Struct)temp_list.get(0);
			if(temp_struct.getMODIFY_COUNT().equals(modify_count) != true)
			{

				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("ZZ01105", keyMessage);
				return true;
			}

          
		}

		return false;
	}

	/** 
	 * �����R�[�h�`�F�b�N����
	 *
	 * @param target_struct �Ώۃf�[�^���
	 * @return boolean true:�G���[���� false:�G���[�Ȃ�
	 */
	private boolean checkVEND_CD(AA0050010Struct target_struct) throws FoundationException, SQLException
	{
		String keyMessage = "";

		// �`�F�b�N�t���O������
		boolean bResult = false;

		//����悪�w�肳�ꂽ�ꍇ
		if( (!"".equals(target_struct.getVEND_CD())) && (null != target_struct.getVEND_CD()) ) {
			//�G���[�`�F�b�N
			AA0050010Struct temp_struct = new AA0050010Struct();
			temp_struct.setWH_CD(target_struct.getWH_CD());
			temp_struct.setVEND_CD(target_struct.getVEND_CD());
			temp_struct.setWH_PLANT_CD(getsysPLANT_CD());
			List temp_list = new ArrayList();
			int count = 0;

			//����悪���݂��Ȃ�
			temp_list = entity.mcheck_vend.read(conn, temp_struct);
			count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
			if(count == 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_WH.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("AA01004", keyMessage);

				bResult = true;
			}

			//�����̏d���`�F�b�N
			temp_list = entity.mcheck_vend_in_wh.read(conn, temp_struct);
			count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
			if(count > 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_WH.VEND_CD:" + struct.getVEND_CD();
				setErrorMessage("AA01008", keyMessage);

				bResult = true;
			}
		}
		return bResult;
	}

	/** 
	 * �X�V���̃��[�j���O�`�F�b�N����
	 */
	private void checkUpdateWarn() throws FoundationException, SQLException
	{
		boolean result = false;			// �`�F�b�N���ʊi�[�p
		String keyMessage = "";
		List wkList = null;

		// ����v�ʌv�Z�Ώۃt���O����O�̏ꍇ
		if( struct.getMRP_FLG().intValue() == AA0050Const._MRP_NON ){
			result = entity.mcheck_wh_cd_in_wh_priority.check(conn, struct);
			// [�i�ڕʕۊǐ�D�揇��]�ɓo�^�ς݂̏ꍇ
			if(result == true) {
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setWarnMessage("AA60010", keyMessage);
			}

			wkList = entity.mM_ITEM_RCV_WH.read(conn, struct);
			// [�i�ڕʓ��ɐ�ۊǋ�]�ɓo�^�ς݂̏ꍇ
			if( wkList.size() > 0 ){
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setWarnMessage("AA60011", keyMessage);
			}
		}

		wkList = entity.mM_WS.read(conn, struct);
		// �q�ɋ敪���P��[��Ƌ�]�ɓo�^�ς݂̏ꍇ
		if( struct.getWH_TYP().intValue() != AA0050Const._WH_KEEP_PLACE &&
			wkList.size() > 0 ){
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setWarnMessage("AA60012", keyMessage);
		}
	}

	/** 
	 * �o�^�E�X�V���ʏ����i�G���[�`�F�b�N�j
	 */
  private void commonInstUpErr(String checkMode) throws FoundationException, SQLException
	{

		String keyMessage = "";
		List wkList = null;

		struct.setw_PLANT_CD(getsysPLANT_CD());

		// �����\�t���O���P�̃J�E���g
		wkList = entity.mcheck_INCOUNT_M_WH.read(conn, struct);
		AA0050010Struct wkInStruct = (AA0050010Struct)wkList.get(0);

		// �O���\�t���O���P�̃J�E���g
		wkList = entity.mcheck_OUTCOUNT_M_WH.read(conn, struct);
		AA0050010Struct wkOutStruct = (AA0050010Struct)wkList.get(0);

		// �����̑�\�ۊǋ�Ƃ��飂�ON�ŁA����H�����
		// ������\�t���O���ON�̑��ۊǋ悪���݂���ꍇ
		if( struct.getWH_INSIDE_FLG().equals("true") &&
			wkInStruct.getw_INSIDE_COUNT().intValue() > 0 ){
			keyMessage = "M_WH.PLANT_CD:" + struct.getw_PLANT_CD();
			setErrorMessage("AA00153", keyMessage);
		}
		
		// ��O��̑�\�ۊǋ�Ƃ��飂�ON�ŁA����H�����
		// ��O���\�t���O���ON�̑��ۊǋ悪���݂���ꍇ
		if( struct.getWH_OUTSIDE_FLG().equals("true") &&
			wkOutStruct.getw_OUTSIDE_COUNT().intValue() > 0 ){
			keyMessage = "M_WH.PLANT_CD:" + struct.getw_PLANT_CD();
			setErrorMessage("AA00154", keyMessage);
		}
		// �����ҕۊǋ悪�������݂��邩�`�F�b�N
		if( !struct.getWH_TYP().toString().equals(struct.geth_WH_TYP()) ||
				checkMode.equals("INSERT") ){
            if( struct.getWH_TYP().intValue() == 40 ){
        	    boolean result = false;
        	    result = entity.mcheckINPCT_WH.check(conn, struct);
        	    if(result){
                    //�G���[���b�Z�[�W�쐬
		            keyMessage = "WH_CD:" + struct.getWH_CD();
		            setErrorMessage("AA00221", keyMessage);
        	    }
            }
		}

      //�o�Ɏw���ɐݒ肳��Ă���ۊǋ�R�[�h��ύX�����ꍇ
      if (checkMode.equals("UPDATE")) {
          
        wkList = entity.mselect.read(conn, struct);
        wkInStruct = (AA0050010Struct)wkList.get(0);
      
        String oldVendCd = wkInStruct.getVEND_CD();
        String newVendCd = struct.getVEND_CD();
        if (oldVendCd == null){
        	oldVendCd = "";
        }
        if (newVendCd == null){
        	newVendCd = "";
        }
        
        if( ("".equals(oldVendCd) && !"".equals(newVendCd)) 
        		|| (!oldVendCd.equals(newVendCd)) ){
          AA0050010Struct issue_struct = new AA0050010Struct();            
          boolean result = false;

          issue_struct.setw_PLANT_CD(sysPLANT_CD);
          issue_struct.setWH_CD(struct.getWH_CD());

          result = entity.mcheckT_ISSUE_INST.check(conn, issue_struct);

          if ( result == true ) {
          
            // �G���[���b�Z�[�W�쐬
            keyMessage = "T_ISSUE_INST:" + struct.getWH_CD();
            setErrorMessage("AA00160", keyMessage);
          }
        
        }

      }

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
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		String keyMessage = "";
		List key = new ArrayList();

		try {
			// �N���A����
			AA0050010Struct structCopy = new AA0050010Struct();
			structCopy.copy(struct);				// �\�����ڑޔ�
			struct.clear();							// �\�����ڑS�N���A
			struct.initialize();					// �����l�ݒ�
			struct.setWH_CD(structCopy.getWH_CD());	// �L�[�l�̂ݍĐݒ�
			struct.setw_PLANT_CD(structCopy.getw_PLANT_CD());// �K�v�ȍ��ڂ�ݒ�
			_WH_INSIDE_FLG = false;		// �����\�t���O�̃`�F�b�N�t���O
			_WH_OUTSIDE_FLG = false;	// �O���\�t���O�̃`�F�b�N�t���O

			// �f�[�^�Ǎ�
			AA0050010Struct temp_struct = new AA0050010Struct();
			list = entity.mselect.read(conn, struct);
			if(list.size() <= 0)
			{

				// ������Ԃ��u������ԁv�ɐݒ�
				setReadStatus(INITIAL);

				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("ZZ06001", keyMessage);

			}
			else
			{

				// �Ǎ��f�[�^�擾
				temp_struct.copy((AA0050010Struct)this.getListvalue(0));

				// ���p�҂̍H��R�[�h�ݒ�
				temp_struct.setw_PLANT_CD(struct.getw_PLANT_CD());

			}

			// ���̑��`�F�b�N����
			if(msgStruct.sizeError() <= 0)
			{
				// �ۊǋ�.�H��R�[�h �� ���p�ҍH��R�[�h �`�F�b�N
				if(temp_struct.getw_PLANT_CD().equals(temp_struct.getWH_PLANT_CD()) != true)
				{
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH.WH_PLANT_CD:" + temp_struct.getWH_PLANT_CD());
					key.add("M_WH.PLANT_CD:" + temp_struct.getw_PLANT_CD());
					setErrorMessage("AA01007", key);
				}
			}

			// �G���[�Ȃ�
			if(msgStruct.sizeError() <= 0)
			{
				list = null;

				// �����\�t���O�̃Z�b�g
				if( temp_struct.getw_WH_INSIDE_FLG().equals(AA0050Const._WH_INSIDE_NON) ){
					temp_struct.setWH_INSIDE_FLG("false");
				} else {
					temp_struct.setWH_INSIDE_FLG("true");
					_WH_INSIDE_FLG = true;
				}

				// �O���\�t���O�̃Z�b�g
				if( temp_struct.getw_WH_OUTSIDE_FLG().equals(AA0050Const._WH_OUTSIDE_NON) ){
					temp_struct.setWH_OUTSIDE_FLG("false");
				} else {
					temp_struct.setWH_OUTSIDE_FLG("true");
					_WH_OUTSIDE_FLG = true;
				}

				// �\���pstruct�փf�[�^�R�s�[
				struct.copy(temp_struct);

				// �Ō�̓ǂݍ��ݐ����L�[�ݒ�
				struct.seth_LastWH_CD(struct.getWH_CD());
				
				// �q�ɋ敪Hidden����
				struct.seth_WH_TYP(struct.getWH_TYP().toString());

				// �Ǎ��t���O�ݒ�
				_read_flag = "readok";

				// ������Ԃ��u�Ǎ������v�ɐݒ�
				setReadStatus(NORMAL);
			}
			else
			{
				// ������Ԃ��u������ԁv�ɐݒ�
				setReadStatus(INITIAL);
			}

		} catch(SQLException e) {

			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setSqlExceptionMsg(e, keyMessage);

		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		String keyMessage = "";

		try {
			//�ۊǋ摶�݃`�F�b�N
			list = entity.mselect.read(conn, struct);
			if(list.size() > 0) {
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("ZZ01102", keyMessage);
			}

			// �����R�[�h�`�F�b�N
			checkVEND_CD(struct);

			// �o�^�E�X�V���ʏ����i�G���[�`�F�b�N�j
			commonInstUpErr("INSERT");

			// �G���[���Ȃ��ꍇ�A�o�^����
			if(msgStruct.sizeError() == 0){

				// �o�^�p�����\�t���O�̃Z�b�g
				if( struct.getWH_INSIDE_FLG().equals("true") ){
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_TYPICAL);
				} else {
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_NON);
				}

				// �o�^�p�O���\�t���O�̃Z�b�g
				if( struct.getWH_OUTSIDE_FLG().equals("true") ){
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_TYPICAL);
				} else {
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_NON);
				}

				//�f�[�^�}��
				int ret = entity.minsertM_WH.create(conn, struct);

				// �ǂݍ��ݏ���
				controlselect();
			}
		}
		catch(SQLException e) {
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
			setSqlExceptionMsg(e, keyMessage);
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		String keyMessage = "";
		List wkList = null;

		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();  // Connection��AutoCommit�t���O�𐧌䂵�܂�

			boolean result = false;			// �`�F�b�N���ʊi�[�p

			// �����Ώۃf�[�^���X�V����Ă��Ȃ����`�F�b�N
			checkTargetData(struct, struct.getMODIFY_COUNT());

			// �����R�[�h�`�F�b�N
			checkVEND_CD(struct);

			// �o�^�E�X�V���ʏ����i�G���[�`�F�b�N�j
			commonInstUpErr("UPDATE");

			// �G���[���Ȃ��ꍇ�A�X�V����
			if(msgStruct.sizeError() == 0){

				// �o�^�p�����\�t���O�̃Z�b�g
				if( struct.getWH_INSIDE_FLG().equals("true") ){
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_TYPICAL);
				} else {
					struct.setw_WH_INSIDE_FLG(AA0050Const._WH_INSIDE_NON);
				}

				// �o�^�p�O���\�t���O�̃Z�b�g
				if( struct.getWH_OUTSIDE_FLG().equals("true") ){
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_TYPICAL);
				} else {
					struct.setw_WH_OUTSIDE_FLG(AA0050Const._WH_OUTSIDE_NON);
				}

				//�f�[�^�X�V
				entity.mupdateM_WH.update(conn, struct);

				// �R�~�b�g
				conn.commit();

				// �����\�t���O��ON����OFF�ɕύX���ꂽ�ꍇ
				if( _WH_INSIDE_FLG && struct.getw_WH_INSIDE_FLG().equals(AA0050Const._WH_INSIDE_NON) ){
					setWarnMessage("AA60013");
				}

				// �O���\�t���O��ON����OFF�ɕύX���ꂽ�ꍇ
				if( _WH_OUTSIDE_FLG && struct.getw_WH_OUTSIDE_FLG().equals(AA0050Const._WH_OUTSIDE_NON) ){
					setWarnMessage("AA60014");
				}

				// �ǂݍ��ݏ���
				controlselect();

				//����悪�w�肳�ꂽ�ꍇ
				if( (!"".equals(struct.getVEND_CD())) && (null != struct.getVEND_CD()) ) {
					//�ۊǋ�̑��݃`�F�b�N�i�ۊǋ�ʗD�揇�ʃ}�X�^�j
					result = entity.mcheck_wh_cd_in_wh_priority.check(conn, struct);
					if(result == true) {
						keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
						setWarnMessage("AA60008", keyMessage);
					}
				}







              
				// �X�V���̃��[�j���O�`�F�b�N����
				checkUpdateWarn();
			} else {

				// ���[���o�b�N
				conn.rollback();

			}

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
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
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		String keyMessage = "";
		List key = new ArrayList();

		try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();

			// �����Ώۃf�[�^���X�V����Ă��Ȃ����`�F�b�N
			checkTargetData(struct, struct.getMODIFY_COUNT());

			// ���̑��`�F�b�N����
			if(msgStruct.sizeError() <= 0)
			{
				int count;
				List temp_list;	

				// �ۊǋ�.�H��R�[�h �� ���p�ҍH��R�[�h �`�F�b�N
				if(struct.getw_PLANT_CD().equals(struct.getWH_PLANT_CD()) != true)
				{
					// �G���[���b�Z�[�W�쐬
					key.add("M_WH.WH_PLANT_CD:" + struct.getWH_PLANT_CD());
					key.add("M_WH.PLANT_CD:" + struct.getw_PLANT_CD());
					setErrorMessage("AA01007", key);
				}

				//��Ǝ��т̑��݃`�F�b�N
				temp_list = entity.mcheck_opr_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00072", keyMessage);
				}

				//������т̑��݃`�F�b�N
				temp_list = entity.mcheck_acpt_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00073", keyMessage);
				}

				//�������т̑��݃`�F�b�N
				temp_list = entity.mcheck_inspc_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00074", keyMessage);
				}

				//�ۊǋ�ʕi�ڍ݌ɂ̑��݃`�F�b�N
				temp_list = entity.mcheck_item_stock.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00075", keyMessage);
				}

				//�ۊǋ�ʐ��ԍ݌ɂ̑��݃`�F�b�N
				temp_list = entity.mcheck_job_odr_cd_stock.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00076", keyMessage);
				}

				//�ۊǋ�ʓ��o�ɂ̑��݃`�F�b�N
				temp_list = entity.mcheck_rcv_issue.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00077", keyMessage);
				}

				//��Ƌ�̑��݃`�F�b�N
				temp_list = entity.mcheck_wh_cd_in_ws.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00124", keyMessage);
				}

				//�o�������т̑��݃`�F�b�N
				temp_list = entity.mcheck_output_rslt.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00078", keyMessage);
				}

				//�H��}�X�^�̑��݃`�F�b�N
				temp_list = entity.mcheck_plant.read(conn, struct);
				count = ((AA0050010Struct)temp_list.get(0)).getCOUNT().intValue();
				if(count > 0) {
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AA00125", keyMessage);
				}

                //�i�ڕʓ��ɐ�ۊǋ�Ƃ̎Q�Ɛ������`�F�b�N
                temp_list = entity.mM_ITEM_RCV_WH.read(conn, struct);
                // [�i�ڕʓ��ɐ�ۊǋ�]�ɓo�^�ς݂̏ꍇ
                if( !temp_list.isEmpty() && temp_list.size() > 0 ){

                  keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
                  setErrorMessage("AA00161", keyMessage);
                }

				// �����c�̑��݃`�F�b�N
				boolean bT_RLSD_PUCH_ODR = false;
				bT_RLSD_PUCH_ODR = entity.mcheckT_RLSD_PUCH_ODR.check(conn,struct);
				if(bT_RLSD_PUCH_ODR){
						// �G���[���b�Z�[�W�쐬
						keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
						setErrorMessage("AA00172", keyMessage);
				}
				
				//�o�Ɏw���̑��݃`�F�b�N
		        boolean result = false;
		        struct.setw_PLANT_CD(sysPLANT_CD);
		        result = entity.mcheckT_ISSUE_INST.check(conn, struct);
		        if ( result == true ) {		          
			          // �G���[���b�Z�[�W�쐬
			          keyMessage = "T_ISSUE_INST:" + struct.getWH_CD();
			          setErrorMessage("AA00163", keyMessage);
		        }
			}
			

			// �G���[���Ȃ��ꍇ�A�폜����
			if(msgStruct.sizeError() <= 0){

				// �폜
				entity.mdeleteM_WH.delete(conn, struct);

				// �R�~�b�g
				conn.commit();

				// �����\�t���O��ON�̃f�[�^���폜���ꂽ�ꍇ
				if( _WH_INSIDE_FLG  ){
					setWarnMessage("AA60013");
				}

				// �O���\�t���O��ON�̃f�[�^���폜���ꂽ�ꍇ
				if( _WH_OUTSIDE_FLG  ){
					setWarnMessage("AA60014");
				}

				// �N���A����
				controlclear();
			}
			else
			{

				// ���[���o�b�N
				conn.rollback();
			}

		} catch(SQLException e) {
			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
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
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}
		this.struct.initialize();

		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);

                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0050");
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		String keyMessage = "";

		try {
			// �R���{�{�b�N�X�f�[�^�p��
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			_WH_TYP = controller.getData("WH_TYP");
			_MRP_FLG = controller.getData("MRP_FLG");

		}catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

		}catch(ComboException e){
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
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			struct.setList_WH_TYP_val(_WH_TYP.getValList());
			struct.setList_WH_TYP_name(_WH_TYP.getExplanList());
			struct.setList_MRP_FLG_val(_MRP_FLG.getValList());
			struct.setList_MRP_FLG_name(_MRP_FLG.getExplanList());
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0050010Entity entity;
	protected AA0050010Struct struct;
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

		entity = new AA0050010Entity();
		struct = new AA0050010Struct();

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
	 * AA0050010�N���X�̕W���R���X�g���N�^
	 */
	public AA0050010Control() throws BusinessProcessException, FoundationException
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
				AA0050010Struct key = (AA0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("WH_TYP_name") && key.getWH_TYP_name() != null) {
					msgKey.setKeyValue("WH_TYP_name", key.getWH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP_val") && key.getWH_TYP_val() != null) {
					msgKey.setKeyValue("WH_TYP_val", key.getWH_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_name") && key.getMRP_FLG_name() != null) {
					msgKey.setKeyValue("MRP_FLG_name", key.getMRP_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG_val") && key.getMRP_FLG_val() != null) {
					msgKey.setKeyValue("MRP_FLG_val", key.getMRP_FLG_val().toString());
				}
				if(msgKeyType.containsKeyColumn("h_LastWH_CD") && key.geth_LastWH_CD() != null) {
					msgKey.setKeyValue("h_LastWH_CD", key.geth_LastWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_INSIDE_FLG") && key.getWH_INSIDE_FLG() != null) {
					msgKey.setKeyValue("WH_INSIDE_FLG", key.getWH_INSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_OUTSIDE_FLG") && key.getWH_OUTSIDE_FLG() != null) {
					msgKey.setKeyValue("WH_OUTSIDE_FLG", key.getWH_OUTSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_WH_TYP") && key.geth_WH_TYP() != null) {
					msgKey.setKeyValue("h_WH_TYP", key.geth_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_INSIDE_COUNT") && key.getw_INSIDE_COUNT() != null) {
					msgKey.setKeyValue("w_INSIDE_COUNT", key.getw_INSIDE_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_COUNT") && key.getw_OUTSIDE_COUNT() != null) {
					msgKey.setKeyValue("w_OUTSIDE_COUNT", key.getw_OUTSIDE_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("w_WH_INSIDE_FLG") && key.getw_WH_INSIDE_FLG() != null) {
					msgKey.setKeyValue("w_WH_INSIDE_FLG", key.getw_WH_INSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_OUTSIDE_FLG") && key.getw_WH_OUTSIDE_FLG() != null) {
					msgKey.setKeyValue("w_WH_OUTSIDE_FLG", key.getw_WH_OUTSIDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("WH_ADDR1") && key.getWH_ADDR1() != null) {
					msgKey.setKeyValue("WH_ADDR1", key.getWH_ADDR1());
				}
				if(msgKeyType.containsKeyColumn("WH_ADDR2") && key.getWH_ADDR2() != null) {
					msgKey.setKeyValue("WH_ADDR2", key.getWH_ADDR2());
				}
				if(msgKeyType.containsKeyColumn("WH_TEL") && key.getWH_TEL() != null) {
					msgKey.setKeyValue("WH_TEL", key.getWH_TEL());
				}
				if(msgKeyType.containsKeyColumn("WH_PERSON") && key.getWH_PERSON() != null) {
					msgKey.setKeyValue("WH_PERSON", key.getWH_PERSON());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WH_PLANT_CD") && key.getWH_PLANT_CD() != null) {
					msgKey.setKeyValue("WH_PLANT_CD", key.getWH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD") && key.getw_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("w_ISSUE_INST_CD", key.getw_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_INSPC_WH_CD") && key.getw_INSPC_WH_CD() != null) {
					msgKey.setKeyValue("w_INSPC_WH_CD", key.getw_INSPC_WH_CD());
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
					AA0050010Struct key = new AA0050010Struct();
					if(msgKeyType.containsKeyColumn("WH_TYP_name")) {
						key.setWH_TYP_name(msgKey.getKeyValue("WH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP_val")) {
						key.setWH_TYP_val(new Integer(msgKey.getKeyValue("WH_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_name")) {
						key.setMRP_FLG_name(msgKey.getKeyValue("MRP_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG_val")) {
						key.setMRP_FLG_val(new Integer(msgKey.getKeyValue("MRP_FLG_val")));
					}
					if(msgKeyType.containsKeyColumn("h_LastWH_CD")) {
						key.seth_LastWH_CD(msgKey.getKeyValue("h_LastWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_INSIDE_FLG")) {
						key.setWH_INSIDE_FLG(msgKey.getKeyValue("WH_INSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_OUTSIDE_FLG")) {
						key.setWH_OUTSIDE_FLG(msgKey.getKeyValue("WH_OUTSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_TYP")) {
						key.seth_WH_TYP(msgKey.getKeyValue("h_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(new Long(msgKey.getKeyValue("COUNT")));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_INSIDE_COUNT")) {
						key.setw_INSIDE_COUNT(new Integer(msgKey.getKeyValue("w_INSIDE_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_COUNT")) {
						key.setw_OUTSIDE_COUNT(new Integer(msgKey.getKeyValue("w_OUTSIDE_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("w_WH_INSIDE_FLG")) {
						key.setw_WH_INSIDE_FLG(msgKey.getKeyValue("w_WH_INSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_OUTSIDE_FLG")) {
						key.setw_WH_OUTSIDE_FLG(msgKey.getKeyValue("w_WH_OUTSIDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(new Integer(msgKey.getKeyValue("WH_TYP")));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(new Integer(msgKey.getKeyValue("MRP_FLG")));
					}
					if(msgKeyType.containsKeyColumn("WH_ADDR1")) {
						key.setWH_ADDR1(msgKey.getKeyValue("WH_ADDR1"));
					}
					if(msgKeyType.containsKeyColumn("WH_ADDR2")) {
						key.setWH_ADDR2(msgKey.getKeyValue("WH_ADDR2"));
					}
					if(msgKeyType.containsKeyColumn("WH_TEL")) {
						key.setWH_TEL(msgKey.getKeyValue("WH_TEL"));
					}
					if(msgKeyType.containsKeyColumn("WH_PERSON")) {
						key.setWH_PERSON(msgKey.getKeyValue("WH_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WH_PLANT_CD")) {
						key.setWH_PLANT_CD(msgKey.getKeyValue("WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ISSUE_INST_CD")) {
						key.setw_ISSUE_INST_CD(msgKey.getKeyValue("w_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_INSPC_WH_CD")) {
						key.setw_INSPC_WH_CD(msgKey.getKeyValue("w_INSPC_WH_CD"));
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
