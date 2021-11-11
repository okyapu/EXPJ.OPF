/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0090/src/com/nec/jp/orteus/metamorBase/KA0090/KA0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0090;

import com.nec.jp.orteus.metamorBase.KA0090.*;
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
//}}user_implement_code_header

public class KA0090010Control
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
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public KA0090010Struct getListvalue(int x) { return (KA0090010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KA0090010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public KA0090010Struct createStruct() { return new KA0090010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KA0090010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

//------------------------------------------------------------------------------
// add �W��G ��

        /**
         * ��ʑJ�ڃL�[(����R�[�h)
         */
	private String _orgCd;

        /**
         * ��ʑJ�ڃL�[(����R�[�h)�ݒ�
         * @param cd ����R�[�h
         */
	protected void setOrgCd(String cd){ _orgCd = cd; };

        /**
         * ��ʑJ�ڃL�[(����R�[�h)�擾
         * @return ����R�[�h
         */
	protected String getOrgCd(){ return _orgCd; };

// add �W��G ��
//------------------------------------------------------------------------------

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

//------------------------------------------------------------------------------

	/** ���[�h */
	private String _mode = null;

	/** ���[�h�̎擾
	 * @return ���[�h
	*/
	public String getMode(){ return _mode; }

	/** ���[�h�̐ݒ�
	 * @param mode ���[�h
	*/
	public void setMode(String mode){ _mode = mode; }

	/** ��ʃ��[�h �������� */
	private final static String _SELECT = "select";

	/** ��ʃ��[�h ����/����ȊO�̏��� */
	private final static String _NORMAL = "normal";

	/** ��ʃ��[�h ���鏈�� */
	private final static String _CLOSE = "close";

//------------------------------------------------------------------------------

	/** ���b�Z�[�W��`�t�@�C�� */
//	MessageConfig _msgConfig = null;

	/** ���b�Z�[�W */
	//MessageStruct _msgStruct = msgStruct;

	/** �V�X�e�����O */
	SystemLog _sysLog = sysLog;

//-----------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

	//------------------------------------------------------------------------
	/**
	 * DB�o�^/�X�V������ �ݒ���e�`�F�b�N
	 *
	 * @return  true:OK / false:NG
	 */
	//------------------------------------------------------------------------
	// 2003/08/23 K.Shiraki
	//            �o�^/�X�V��������؂�o��
	//------------------------------------------------------------------------
	private boolean isValidContents()throws FoundationException, SQLException
	{
		boolean result = true;

		// �l�Z������
//		struct.revise();

		return result;
	}
	//------------------------------------------------------------------------
	/**
	 * �X�V�^�폜�\���`�F�b�N����<BR>
	 * �P�D�������ʂ����݂��邱�Ɓi�������Ɠ��������œǂݍ��݁j
	 * �Q�D�X�V�J�E���^���������Ɠ���ł��邱��
	 *
	 * @param KA0090010Struct Struct
	 * @return boolean true:�X�V�폜�\ false:�X�V�폜�s��
	 */
	private boolean isUpdatable(KA0090010Struct chk) throws FoundationException,SQLException
	{


		List listCheck = null;

		//��ЃR�[�h��Ǎ�
		listCheck = entity.mread_COMPANY_CD.read(conn, struct);
		chk.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

		//�ǂݍ���
		listCheck = entity.mselect.read(conn,chk);

		if(listCheck == null || listCheck.size() != 1){
			//�ǂݍ��ݎ��s�i�������ɃX�e�[�^�X���ω��������A�폜���ꂽ�ꍇ�j

			//�G���[����
			setErrorMessage("ZZ06001");
//			setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+chk.getSYS_COMPANY_CD());
			setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+chk.getORG_CD());
			return false;
		}
		KA0090010Struct rst = (KA0090010Struct)listCheck.get(0);
		//�X�V�J�E���^�`�F�b�N
		// �ޔ������Ă����J�E���^�ƁA�����œǂݍ��񂾌��ݒl���r����B


		double bef_mod = Double.parseDouble((String)struct.geth_MODIFY_COUNT());
		double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());
		if(bef_mod != aft_mod){
			//�X�V�J�E���^���ω�����



			//�G���[����
			setErrorMessage("AC50802");
//			setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+chk.getSYS_COMPANY_CD());
			setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+chk.getORG_CD());
			return false;
		}
		return true;
	}

//--------------------------------------------------------------------------------------------

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			boolean ok_flg = true;
			boolean result = false;		// �`�F�b�N���ʊi�[

			//��ʃ��[�h�擾
			String strKMode="";
			strKMode = (String)struct.getk_MODE();

			if("INSERT".equals(strKMode)){
				//�o�^�̎��`�F�b�N
				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				// ������ �d���`�F�b�N
				result = entity.mselect.check(conn, struct);
				if (result == true) {
					ok_flg =false;
					setErrorMessage("ZZ01102");
//					setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
					setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
				}
			}else if("UPDATE".equals(strKMode)){
				//�X�V�̎��`�F�b�N

				// �X�V�m�F
				KA0090010Struct st = (KA0090010Struct)list.get(0);
				if(isUpdatable(st) == false){
					//�X�V�ł��Ȃ����
					//�G���[����

					ok_flg =false;
				}
			}else if("DELETE".equals(strKMode)){
				//�폜�̎��`�F�b�N
				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				// ������̑��݊m�F
				List w = entity.mselect.read(conn, struct);
				if (w.size() == 0) {
					ok_flg =false;
					setErrorMessage("ZZ01105");
//					setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
					setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
				}
			}else{
				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				list = entity.mselect.read(conn, struct);

				if (list.size() != 0) {
					struct.copy((KA0090010Struct)list.get(0));
					_mode = _SELECT;
				} else {
					ok_flg = false;
					setErrorMessage("ZZ06001");
//					setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
					setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
				}
			}

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(NORMAL);
			struct.seth_ORG_CD(struct.getORG_CD());

			if(!"RESELECT".equals(strKMode)){
				//�x���ȊO�̃G���[�������Ȃ��ꍇOK�ɂ���
				if(ok_flg == true){
					setReadStatus(NORMAL);
				}else{

					setReadStatus(NOT_FOUND);
				}
			}

		} catch(SQLException e) {
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			boolean result = false;		// �`�F�b�N���ʊi�[

			//��ЃR�[�h��Ǎ�
			List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			// ������ �d���`�F�b�N
			result = entity.mselect.check(conn, struct);
			if (result == true) {
				setErrorMessage("ZZ01102");
//				setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
			}

			// �G���[���������Ă��Ȃ��ꍇ�A�o�^�������{
			if(msgStruct.sizeError() <= 0){

				//��ЃR�[�h��Ǎ�
				list = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)list.get(0)).getSYS_COMPANY_CD());
				//�o�^����
				entity.minsertM_ORG.create(conn, struct);

				conn.commit();


				// ����
				struct.setk_MODE("RESELECT");

				controlselect();

			}

		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			conn.beginTransWeb();		// �g�����U�N�V�����J�n

			//�X�V�̎��`�F�b�N

			// �X�V�m�F
			KA0090010Struct st = (KA0090010Struct)list.get(0);
			if(isUpdatable(st) == false){
				//�X�V�ł��Ȃ����
				//�G���[����

			}

			// �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
			if(msgStruct.sizeError() <= 0)
			{
				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				entity.mupdateM_ORG.update(conn, struct);
				conn.commit();
				// �ŐV�̏���Ǎ�

				struct.setk_MODE("RESELECT");

				// ����
				controlselect();
			}


		} catch(SQLException e) {
			throw new ExpjException(e);
		} finally {
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			struct.initialize();
			// ���[�h�ݒ�
			_mode = _NORMAL;

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);

		}catch(Exception e){
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlclear>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//MODIFYCOUNT�̃`�F�b�N
			if(isUpdatable(struct) == false){
				//�폜�ł��Ȃ����
				//�G���[����

			}

			//��ЃR�[�h��Ǎ�
			List listCheck = entity.mread_COMPANY_CD.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			// ������̑��݊m�F
			List w = entity.mselect.read(conn, struct);
			if (w.size() == 0) {
				setErrorMessage("ZZ01105");
				setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
			}
			
			// �����񐮍����`�F�b�N�t���O
			boolean b = false;
			// �������`�F�b�N -----------��1
			// ���Ӑ�}�X�^�ɕ�����̑��݊m�F
			b = entity.mcheckM_CUST.check(conn, struct);
			if (b) {
				setErrorMessage("KA00118");
				setErrorMessage("ZZ01006","M_CUST.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_CUST.OWN_ORG_CD:"+struct.getORG_CD());
			}
			// �������`�F�b�N -----------��2
			// ���Ӑ�x�X�}�X�^�ɕ�����̑��݊m�F
			b = entity.mcheckM_CUST_BRANCH.check(conn, struct);
			if (b) {
				setErrorMessage("KA00119");
				setErrorMessage("ZZ01006","M_CUST_BRANCH.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_CUST_BRANCH.OWN_ORG_CD:"+struct.getORG_CD());
			}
			// �������`�F�b�N -----------��3
			// ���������ɕ�����̑��݊m�F
			b = entity.mcheckM_CUST_STL_CTRL.check(conn, struct);
			if (b) {
				setErrorMessage("KA00120");
				setErrorMessage("ZZ01006","M_CUST_STL_CTRL.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_CUST_STL_CTRL.CLAIM_ORG_CD:"+struct.getORG_CD());
			}
			// �������`�F�b�N -----------��4
			// ���|���g�����w�b�_�ɕ�����̑��݊m�F
			b = entity.mcheckT_AR_LEDGER_H_TRN.check(conn, struct);
			if (b) {
				setErrorMessage("KA00121");
				setErrorMessage("ZZ01006","T_AR_LEDGER_H_TRN.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","T_AR_LEDGER_H_TRN.SALES_ORG_CD:"+struct.getORG_CD());
			}
			// �������`�F�b�N -----------��5
			// ���|�������w�b�_�ɕ�����̑��݊m�F
			b = entity.mcheckT_AR_LEDGER_H.check(conn, struct);
			if (b) {
				setErrorMessage("KA00122");
				setErrorMessage("ZZ01006","T_AR_LEDGER_H.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","T_AR_LEDGER_H.SALES_ORG_CD:"+struct.getORG_CD());
			}
            // �������`�F�b�N -----------��6
			// ���[�U�}�X�^�ɕ�����̑��݊m�F
			b = entity.mcheckM_ORG.check(conn, struct);
			if (b) {
				setErrorMessage("BZ00198");
				setErrorMessage("ZZ01006","M_ORG.COMPANY_CD:"+struct.getSYS_COMPANY_CD());
				setErrorMessage("ZZ01006","M_ORG.ORG_CD:"+struct.getORG_CD());
			}
			
			// �G���[���������Ă��Ȃ��ꍇ�A�폜�������{
			if(msgStruct.sizeError() <= 0){
				//��ЃR�[�h��Ǎ�
				listCheck = entity.mread_COMPANY_CD.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0090010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				entity.mdeleteM_ORG.delete(conn, struct);
				conn.commit();
				controlclear();
				_mode = _NORMAL;
				struct.initialize();
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �N���A����
			controlclear();

			// ���[�h�ݒ�
			_mode = _NORMAL;

// add �W��G ��
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��



			if ( isScreenMove()== true ) {


				struct.setORG_CD( _orgCd );



				controlselect();
			}
// add �W��G ��

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0090");
		logger.entering("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KA0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("close") ) {
				controlclose();
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
//			throw new FoundationException("KA0090010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0090010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KA0090010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0090010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KA0090010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0090010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KA0090010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KA0090010Entity entity;
	protected KA0090010Struct struct;
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

		entity = new KA0090010Entity();
		struct = new KA0090010Struct();

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
	 * KA0090010�N���X�̕W���R���X�g���N�^
	 */
	public KA0090010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
			_mode = _NORMAL;
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
				KA0090010Struct key = (KA0090010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("h_ORG_CD") && key.geth_ORG_CD() != null) {
					msgKey.setKeyValue("h_ORG_CD", key.geth_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_ANAME") && key.getORG_ANAME() != null) {
					msgKey.setKeyValue("ORG_ANAME", key.getORG_ANAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_KNAME") && key.getORG_KNAME() != null) {
					msgKey.setKeyValue("ORG_KNAME", key.getORG_KNAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_ENAME") && key.getORG_ENAME() != null) {
					msgKey.setKeyValue("ORG_ENAME", key.getORG_ENAME());
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
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD") && key.getBILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("BILL_ADDRESSEE_CD", key.getBILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TYP") && key.getSLIP_TYP() != null) {
					msgKey.setKeyValue("SLIP_TYP", key.getSLIP_TYP());
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
					KA0090010Struct key = new KA0090010Struct();
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("h_ORG_CD")) {
						key.seth_ORG_CD(msgKey.getKeyValue("h_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_ANAME")) {
						key.setORG_ANAME(msgKey.getKeyValue("ORG_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_KNAME")) {
						key.setORG_KNAME(msgKey.getKeyValue("ORG_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_ENAME")) {
						key.setORG_ENAME(msgKey.getKeyValue("ORG_ENAME"));
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
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD")) {
						key.setBILL_ADDRESSEE_CD(msgKey.getKeyValue("BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TYP")) {
						key.setSLIP_TYP(msgKey.getKeyValue("SLIP_TYP"));
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
