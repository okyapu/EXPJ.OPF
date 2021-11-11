/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0030/src/com/nec/jp/orteus/metamorBase/KA0030/KA0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0030;

import com.nec.jp.orteus.metamorBase.KA0030.*;
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

public class KA0030010Control
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
	public KA0030010Struct getListvalue(int x) { return (KA0030010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KA0030010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public KA0030010Struct createStruct() { return new KA0030010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KA0030010Struct)structname); }	// Struct���Z�b�g���܂��B
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
         * ��ʑJ�ڃL�[(�ڋq�R�[�h)
         */
	private String _custCd;

        /**
         * ��ʑJ�ڃL�[(�ڋq�R�[�h)�ݒ�
         * @param cd �ڋq�R�[�h
         */
	protected void setCustCd(String cd){ _custCd = cd; };

        /**
         * ��ʑJ�ڃL�[(�ڋq�R�[�h)�擾
         * @return �ڋq�R�[�h
         */
	protected String getCustCd(){ return _custCd; };

        /**
         * ��ʑJ�ڃL�[(�ڋq�i�ڔԍ�)
         */
	private String _custItemCd;

        /**
         * ��ʑJ�ڃL�[(�ڋq�i�ڔԍ�)�ݒ�
         * @param cd �ڋq�i�ڔԍ�
         */
	protected void setCustItemCd(String cd){ _custItemCd = cd; };

        /**
         * ��ʑJ�ڃL�[(�ڋq�i�ڔԍ�)�擾
         * @return �ڋq�i�ڔԍ�
         */
	protected String getCustItemCd(){ return _custItemCd; };
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
	//sww�ǉ�20040728�J�n
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
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
	 private void setComboData(KA0030010Struct data)throws BusinessProcessException, FoundationException
	 {

	 	try {
			//sww�C��20040728�J�n
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cb = new ComboBox(conn, sysUSER_CD);			
			ComboStruct _depoTypStruct = cb.getData("DEPO_TYP");			
			// �f�[�^�ݒ�
			data.setList_DEPO_TYP_val(_depoTypStruct.getValList());
			data.setList_DEPO_TYP_name(_depoTypStruct.getExplanList());

			cb.setConnection(null);
			//sww�C��20040728�I��		
            } catch (SQLException e) {
            	throw new ExpjException(e);
            } catch (ComboException e) {
                throw new ExpjException(e);
		}
	 }
		
	//sww�ǉ�20040728�I��

		
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
//	private MessageConfig _msgConfig = null;

	/** �V�X�e�����O */
	SystemLog _sysLog = sysLog;

	/** ���b�Z�[�W */
	//MessageStruct _msgStruct = msgStruct;

//-----------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

	//------------------------------------------------------------------------
	/** ���Џ��̎擾 */
	private void companyData() throws SQLException, FoundationException
	{
		List listCompanyInfo;
		listCompanyInfo = entity.mgetCompanyInfo.read(conn, struct);

		if(listCompanyInfo == null || listCompanyInfo.size() != 1){
			//���Џ�񂪖���/������
			setErrorMessage("KA00060");

		}else{
			struct.setstrCOMPANY_CD(((KA0030010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
		}
		listCompanyInfo = null;
		return;
	}
	//------------------------------------------------------------------------
	/**
	 * �X�V�^�폜�\���`�F�b�N����<BR>
	 * �P�D�������ʂ����݂��邱�Ɓi�������Ɠ��������œǂݍ��݁j
	 * �Q�D�X�V�J�E���^���������Ɠ���ł��邱��
	 *
	 * @param KA0030010Struct Struct
	 * @return boolean true:�X�V�폜�\ false:�X�V�폜�s��
	 */
	private boolean isUpdatable(KA0030010Struct chk) throws FoundationException,SQLException
	{


		List listCheck = null;

		//�ǂݍ���

		listCheck = entity.mselect.read(conn,chk);

		if(listCheck == null || listCheck.size() != 1){
			//�ǂݍ��ݎ��s�i�������ɃX�e�[�^�X���ω��������A�폜���ꂽ�ꍇ�j
			//�G���[����
                        setErrorMessage("ZZ06001");
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + chk.getCUST_CD());
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + chk.getCUST_ITEM_CD());

			return false;
		}
		KA0030010Struct rst = (KA0030010Struct)listCheck.get(0);
		//�X�V�J�E���^�`�F�b�N
		// �ޔ������Ă����J�E���^�ƁA�����œǂݍ��񂾌��ݒl���r����B


		double bef_mod = Double.parseDouble((String)struct.geth_MODIFY_COUNT());
		double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());
		if(bef_mod != aft_mod){
			//�X�V�J�E���^���ω�����



			//�G���[����
			setErrorMessage("AC50802");
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + chk.getCUST_CD());
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + chk.getCUST_ITEM_CD());
			return false;
		}

		return true;
	}

	/**
	 * DB�o�^/�X�V������ �ݒ���e�`�F�b�N
	 *
	 * @return  true:OK / false:NG
	 */
	private boolean isValidContents()throws FoundationException, SQLException
	{
		boolean result = true;


		//�i�ԑ��݃`�F�b�N
		List listM_ITEM = entity.mcheckM_ITEM.read(conn, struct);
		if ( listM_ITEM == null || listM_ITEM.size() == 0 ) {
			result =false;
			setErrorMessage("AL50004");
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
		}else{
			struct.setMRP_ODR_TYP(((KA0030010Struct)listM_ITEM.get(0)).getMRP_ODR_TYP());
			/* �^���i�ڂ̏ꍇ */
			if( 8 == Integer.parseInt(struct.getMRP_ODR_TYP()) ){
				result = false;
				setErrorMessage("KA00117");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
		}
		
		//�ڋq�R�[�h���݃`�F�b�N
		if(struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())){
			boolean blnChkM_CUST = entity.mcheckM_CUST.check(conn, struct);
			if (blnChkM_CUST == false) {
				result =false;
				setErrorMessage("KA00032");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
		}

		//����v�㕔�呶�݃`�F�b�N
		if(struct.getSALES_DEPT_CD() != null && !"".equals(struct.getSALES_DEPT_CD())){
			boolean blnChkM_ORG = entity.mcheckM_ORG.check(conn, struct);
			if (blnChkM_ORG == false) {
			    result =false;
			    setErrorMessage("KA00058");
        	            setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	    setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
		}

		// ����ŃR�[�h���݊m�F
		if(struct.getTAX_CD() != null && struct.getTAX_CD().equals("") == false){
			List list1 = entity.mselectM_TAX.read(conn, struct);
			if (list1 == null || list1.size() == 0) {

				setErrorMessage("AA01001");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				result = false;
			}
		}


		return result;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			boolean ok_flg = true;
			boolean result = false;		// �`�F�b�N���ʊi�[

			// ��ʃ��[�h�擾
			String strKMode="";
			strKMode = (String)struct.getk_MODE();

			// ��ЃR�[�h�擾
			companyData();

			if("INSERT".equals(strKMode)){
				//�o�^�̎��`�F�b�N
				//���i�d�l���d���`�F�b�N
				result = entity.mselect.check(conn, struct);
				if (result == true) {

					ok_flg =false;
					setErrorMessage("ZZ01102");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				}else if(!isValidContents()){
					// ���͓��e�`�F�b�N
					ok_flg = false;
				}

			}else if("UPDATE".equals(strKMode)){
				//�X�V�̎��`�F�b�N

				// �X�V�m�F
				KA0030010Struct st = (KA0030010Struct)list.get(0);
				if(isUpdatable(st) == false){
					//�X�V�ł��Ȃ����
					//�G���[����

					ok_flg =false;
				}else if(!isValidContents()){
					// ���͓��e�`�F�b�N
					ok_flg = false;
				}
			}else if("DELETE".equals(strKMode)){
				//�폜�̎��`�F�b�N

				// ���i�d�l���̑��݊m�F
				List w = entity.mselect.read(conn, struct);
				if (w.size() == 0) {
					ok_flg =false;
					setErrorMessage("ZZ06001");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				}

				//�w�萻�i�̎󒍏����󋵃`�F�b�N
				boolean blnChkODR = entity.mcheckODR.check(conn, struct);
				if (blnChkODR == true) {
					ok_flg =false;
					setErrorMessage("KA00059");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
				}

			}else{

				list = entity.mselect.read(conn, struct);

				if (list.size() != 0) {
					struct.copy((KA0030010Struct)list.get(0));
					_mode = _SELECT;
//System.out.println("���" + struct.getstrCOMPANY_CD());
//System.out.println("���Ӑ�R�[�h" + struct.getCUST_CD());
//System.out.println("���ӕi�ڔԍ�" + struct.getCUST_ITEM_CD());
//System.out.println("�i�ڔԍ�" + struct.getITEM_CD());
//System.out.println("���Ӑ�i�ږ���" + struct.getCUST_ITEM_NAME());
//System.out.println("����v�㕔��" + struct.getSALES_DEPT_CD());
//System.out.println("���L�����P" + struct.getNOTE1());
//System.out.println("���L�����Q" + struct.getNOTE2());
//System.out.println("�ŃR�[�h" + struct.getTAX_CD());
//System.out.println("�X�V��" + struct.geth_MODIFY_COUNT());					
//System.out.println("�a���敪" + struct.getDEPO_TYP());					
				} else {
					ok_flg =false;
					setErrorMessage("ZZ06001");
        		                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                		        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());

				}
			}
			setComboData(struct);
			
			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(NORMAL);

			if(!"RESELECT".equals(strKMode)){
				//�x���ȊO�̃G���[�������Ȃ��ꍇOK�ɂ���
				if(ok_flg == true){

//					struct.seth_RESULT("OK");
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
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

			boolean result = false;		// �`�F�b�N���ʊi�[

			// ��ЃR�[�h�擾
			companyData();

			// ���i�d�l��� �d���`�F�b�N
			result = entity.mselect.check(conn, struct);
			if (result == true) {

				setErrorMessage("ZZ01102");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			} else{
				// ���͓��e�`�F�b�N
				isValidContents();

			}

			// �G���[���������Ă��Ȃ��ꍇ�A�o�^�������{
			if(msgStruct.sizeError() <= 0){




				//�o�^����
				entity.minsertM_ITEM_SPEC.create(conn, struct);
				
				//�R�~�b�g
				conn.commit();
				


				// ����
				struct.setk_MODE("RESELECT");
				controlselect();


			}
			setComboData(struct);			

		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			conn.beginTransWeb();		// �g�����U�N�V�����J�n

			// ��ЃR�[�h�擾
			companyData();

			//�X�V�̎��`�F�b�N

			// �X�V�m�F
			KA0030010Struct st = (KA0030010Struct)list.get(0);
			if(isUpdatable(st) == false){
				//�X�V�ł��Ȃ����
				//�G���[����

			} else{

				// ���͓��e�`�F�b�N
				isValidContents();
			}
			// �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
			if(msgStruct.sizeError() <= 0)
			{

				entity.mupdateM_ITEM_SPEC.update(conn, struct);
				conn.commit();

				// ����
				struct.setk_MODE("RESELECT");
				controlselect();
			}
			setComboData(struct);
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
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
//			sysLog.finest_d("Control�Fcontrolclear", struct.getsUser_ID());

			struct.initialize();
			setComboData(struct);
			// ���[�h�ݒ�
			_mode = _NORMAL;

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);

		}catch(Exception e){
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlclear>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			conn.beginTransWeb();

			if(isUpdatable(struct) == false){
				//�폜�ł��Ȃ����
				//�G���[����

			}

			// ���i�d�l���̑��݊m�F
			List w = entity.mselect.read(conn, struct);
			if (w.size() == 0) {
				setErrorMessage("ZZ06001");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}

			//�w�萻�i�̎󒍏����󋵃`�F�b�N
			boolean blnChkODR = entity.mcheckODR.check(conn, struct);
			if (blnChkODR == true) {
				setErrorMessage("KA00059");
        	                setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
                	        setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
			
			// �̔����v�v��̑��݃`�F�b�N
			boolean b = entity.mcheckT_SALES_PLAN.check(conn,struct);
			if (b == true) {
          setErrorMessage("KA00123");
          setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD());
          setErrorMessage("ZZ01006","M_ITEM_SPEC.CUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
			}
			
			// �G���[���������Ă��Ȃ��ꍇ�A�폜�������{
			if(msgStruct.sizeError() <= 0){

				entity.mremoveM_ITEM_SPEC.delete(conn, struct);

				controlclear();
				//�R�~�b�g
				conn.commit();

				_mode = _NORMAL;
			}

		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

			
			
			// �N���A����
			controlclear();

			// ���[�h�ݒ�
			_mode = _NORMAL;

// add �W��G ��
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��



			if ( isScreenMove()== true ) {


				struct.setCUST_CD( _custCd );
				struct.setCUST_ITEM_CD( _custItemCd );
				controlselect();
			}
// add �W��G ��

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0030");
		logger.entering("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		//�g�p�p�r�R�[�h�̃��X�g�p�f�[�^�擾
		try{
			List PURPOSEList = new ArrayList();
			List PURPOSENameList = new ArrayList();
			List PURPOSEValueList = new ArrayList();

			PURPOSEList = entity.mselectSYS_CLASS_CODE.read(conn, struct);

			for(int i = 0; i < PURPOSEList.size(); i++) {
				PURPOSENameList.add(((KA0030010Struct)PURPOSEList.get(i)).getPURPOSE_name());
				PURPOSEValueList.add(((KA0030010Struct)PURPOSEList.get(i)).getPURPOSE_val());
			}
			struct.setList_PURPOSE_name(PURPOSENameList);
			struct.setList_PURPOSE_val(PURPOSEValueList);
			
			//sww�ǉ�20040728�J�n
			setComboData(struct);			
			//struct.setList_DEPO_TYP_val(_depoTypStruct.getValList());
			//struct.setList_DEPO_TYP_name(_depoTypStruct.getExplanList());
			//sww�ǉ�20040728�I��			
		}catch(SQLException e){
			throw new ExpjException(e);
		}
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
//			throw new FoundationException("KA0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KA0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KA0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KA0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KA0030010Entity entity;
	protected KA0030010Struct struct;
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

		entity = new KA0030010Entity();
		struct = new KA0030010Struct();

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
	 * KA0030010�N���X�̕W���R���X�g���N�^
	 */
	public KA0030010Control() throws BusinessProcessException, FoundationException
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
				KA0030010Struct key = (KA0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_name") && key.getDEPO_TYP_name() != null) {
					msgKey.setKeyValue("DEPO_TYP_name", key.getDEPO_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_val") && key.getDEPO_TYP_val() != null) {
					msgKey.setKeyValue("DEPO_TYP_val", key.getDEPO_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_DEPO_TYP") && key.geth_DEPO_TYP() != null) {
					msgKey.setKeyValue("h_DEPO_TYP", key.geth_DEPO_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("NOTE1") && key.getNOTE1() != null) {
					msgKey.setKeyValue("NOTE1", key.getNOTE1());
				}
				if(msgKeyType.containsKeyColumn("NOTE2") && key.getNOTE2() != null) {
					msgKey.setKeyValue("NOTE2", key.getNOTE2());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME") && key.getTAX_NAME() != null) {
					msgKey.setKeyValue("TAX_NAME", key.getTAX_NAME());
				}
				if(msgKeyType.containsKeyColumn("ch_ITEM_CD") && key.getch_ITEM_CD() != null) {
					msgKey.setKeyValue("ch_ITEM_CD", key.getch_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("chM_ORG_CD") && key.getchM_ORG_CD() != null) {
					msgKey.setKeyValue("chM_ORG_CD", key.getchM_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("chITEM_CD") && key.getchITEM_CD() != null) {
					msgKey.setKeyValue("chITEM_CD", key.getchITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("chCUST_CD") && key.getchCUST_CD() != null) {
					msgKey.setKeyValue("chCUST_CD", key.getchCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("PURPOSE_val") && key.getPURPOSE_val() != null) {
					msgKey.setKeyValue("PURPOSE_val", key.getPURPOSE_val());
				}
				if(msgKeyType.containsKeyColumn("PURPOSE_name") && key.getPURPOSE_name() != null) {
					msgKey.setKeyValue("PURPOSE_name", key.getPURPOSE_name());
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
					KA0030010Struct key = new KA0030010Struct();
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_name")) {
						key.setDEPO_TYP_name(msgKey.getKeyValue("DEPO_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_val")) {
						key.setDEPO_TYP_val(msgKey.getKeyValue("DEPO_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_DEPO_TYP")) {
						key.seth_DEPO_TYP(new Double(msgKey.getKeyValue("h_DEPO_TYP")));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("NOTE1")) {
						key.setNOTE1(msgKey.getKeyValue("NOTE1"));
					}
					if(msgKeyType.containsKeyColumn("NOTE2")) {
						key.setNOTE2(msgKey.getKeyValue("NOTE2"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME")) {
						key.setTAX_NAME(msgKey.getKeyValue("TAX_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ch_ITEM_CD")) {
						key.setch_ITEM_CD(msgKey.getKeyValue("ch_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chM_ORG_CD")) {
						key.setchM_ORG_CD(msgKey.getKeyValue("chM_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("chITEM_CD")) {
						key.setchITEM_CD(msgKey.getKeyValue("chITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("chCUST_CD")) {
						key.setchCUST_CD(msgKey.getKeyValue("chCUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PURPOSE_val")) {
						key.setPURPOSE_val(msgKey.getKeyValue("PURPOSE_val"));
					}
					if(msgKeyType.containsKeyColumn("PURPOSE_name")) {
						key.setPURPOSE_name(msgKey.getKeyValue("PURPOSE_name"));
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
