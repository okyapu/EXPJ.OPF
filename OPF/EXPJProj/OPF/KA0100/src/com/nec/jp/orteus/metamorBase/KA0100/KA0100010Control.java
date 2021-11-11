/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/src/com/nec/jp/orteus/metamorBase/KA0100/KA0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0100;

import com.nec.jp.orteus.metamorBase.KA0100.*;
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
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KA0100010Control
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
	public KA0100010Struct getListvalue(int x) { return (KA0100010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KA0100010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public KA0100010Struct createStruct() { return new KA0100010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KA0100010Struct)structname); }	// Struct���Z�b�g���܂��B
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

// add �W��G ��	
//	------------------------------------------------------------------------------
    
    // ----- �V�X�^���ݒ�l�擾 ---------------	
	private PrivateConfig privateConfig;
    // ----- �V�X�^���ݒ�l�擾 ---------------		        
    // ���Ӑ揳�F
    String aprMCust;		        
    // ��ʑJ�ڃp�����[�^
    String _SCREENMOVE_TYP;	
    String _APPR_ID;
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
//------------------------------------------------------------------------------

	
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

	/** ���b�Z�[�W */
	//MessageStruct _msgStruct = msgStruct;

	/** �V�X�e�����O */
	SystemLog _sysLog = sysLog;

//-----------------------------------------------------------------------------
	/** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

//------------------------------------------------------------------------
	/**
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
	 private void setComboData(KA0100010Struct data)throws BusinessProcessException, FoundationException
	 {

	 	try {
	 		// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);

			ComboStruct combo1 = cdac.getData("EXCH_TYP");
            ComboStruct combo2 = cdac.getData("INSPC_ACPT_TYP");
			ComboStruct combo3 = cdac.getData("TAX_APPLY_TYP_SAAR");
			ComboStruct combo4 = cdac.getData("TAX_CALC_TYP_SAAR");
            //ComboStruct combo5 = cdac.getData("PRICE_ROUND_TYP");
            ComboStruct combo6 = cdac.getData("DETAIL_ROUND_TYP");
			ComboStruct combo7 = cdac.getData("UNCONFIRM_ODR_EFF_TERM_FLG");
			ComboStruct combo8 = cdac.getData("PARTIAL_SHIP_INST_FLG");
			//ComboStruct combo9 = cdac.getData("DEPO_TYP");

			// �f�[�^�ݒ�
			data.setList_EXCH_TYP_val(combo1.getValList());
			data.setList_EXCH_TYP_name(combo1.getExplanList());
                        data.setList_INSPC_ACPT_TYP_val(combo2.getValList());
			data.setList_INSPC_ACPT_TYP_name(combo2.getExplanList());
			data.setList_TAX_APPLY_TYP_val(combo3.getValList());
			data.setList_TAX_APPLY_TYP_name(combo3.getExplanList());
			data.setList_TAX_CALC_TYP_val(combo4.getValList());
			data.setList_TAX_CALC_TYP_name(combo4.getExplanList());
            //data.setList_PRICE_ROUND_TYP_val(combo5.getValList());
			//data.setList_PRICE_ROUND_TYP_name(combo5.getExplanList());
            data.setList_DETAIL_ROUND_TYP_val(combo6.getValList());
			data.setList_DETAIL_ROUND_TYP_name(combo6.getExplanList());
			//data.setList_UNCONFIRM_ODR_EFF_TERM_FLG_val(combo7.getValList());
			//data.setList_UNCONFIRM_ODR_EFF_TERM_FLG_name(combo7.getExplanList());
			data.setList_PARTIAL_SHIP_INST_FLG_val(combo8.getValList());
			data.setList_PARTIAL_SHIP_INST_FLG_name(combo8.getExplanList());
			//data.setList_DEPO_TYP_val(combo9.getValList());
			//data.setList_DEPO_TYP_name(combo9.getExplanList());

			cdac.setConnection(null);

        } catch (SQLException e) {
            throw new ExpjException(e);
        } catch (ComboException e) {
            throw new ExpjException(e);
		}
	 }

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
		String strTest = null;


		// ����ŃR�[�h���݊m�F
		if(struct.getTAX_CD() != null && struct.getTAX_CD().equals("") == false){
			List list1 = entity.mselectM_TAX.read(conn, struct);
			if (list1 == null || list1.size() == 0) {

				setErrorMessage("AA01001");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				result = false;
			}
		}


		// ���ВS������R�[�h���݊m�F
		if(struct.getOWN_ORG_CD() != null && struct.getOWN_ORG_CD().equals("") == false){
		        List list2 = entity.mcheckOWN_ORG_CD.read(conn, struct);
		        if (list2 == null || list2.size() == 0) {

		                setErrorMessage("KA00111");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
		                result = false;
		        }
		}

                // ���ВS���҃R�[�h���݊m�F
                if(struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false){
                        List list3 = entity.mcheckOWN_PERSON_CD.read(conn, struct);
                        if (list3 == null || list3.size() == 0) {

                                setErrorMessage("KA00112");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
                                result = false;
                        }
                }

                // �ʉ݃R�[�h���݊m�F
                if(struct.getCUR_CD() != null && struct.getCUR_CD().equals("") == false){
                        List list4 = entity.mcheckCUR_CD.read(conn, struct);
                        if (list4 == null || list4.size() == 0) {

                                setErrorMessage("KA00113");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
                                result = false;
                        }
                }
                
                // �C�O����ł��邩�m�F
                KA0100010Struct check_struct = new KA0100010Struct();
                List list5 = entity.mselectSYS_HOME_CUR.read(conn, struct);
                if(list5 ==null || list5.size() == 0){
                	// ��ʋƖ��G���[�o��:�M�݃R�[�h�̎擾�Ɏ��s���܂����B
                	setErrorMessage("KA20039");
                	result = false;
                }else{
                	check_struct.setStruct((KA0100010Struct)list5.get(0));
                	if(!struct.getCUR_CD().equals(check_struct.getHOME_CUR_CD())){
                 	    if(!"1".equals(struct.getTAX_CALC_TYP())){
                            // ��ʋƖ��G���[�o�́F���׈ȊO�̏���Ōv�Z�敪�͊C�O����ɓK�p�ł��܂���B
                            setErrorMessage("BA00107");
                            result = false;
                 	    }
                    }
                }

		return result;
	}
	//------------------------------------------------------------------------
	/**
	 * �X�V�^�폜�\���`�F�b�N����<BR>
	 * �P�D�������ʂ����݂��邱�Ɓi�������Ɠ��������œǂݍ��݁j
	 * �Q�D�X�V�J�E���^���������Ɠ���ł��邱��
	 *
	 * @param KA0100010Struct Struct
	 * @return boolean true:�X�V�폜�\ false:�X�V�폜�s��
	 */
	private boolean isUpdatable(KA0100010Struct chk) throws FoundationException,SQLException
	{
		List listCheck = null;

		//��ЃR�[�h��Ǎ�
		listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
		chk.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());
		struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

		//�ǂݍ���
		listCheck = entity.mselect.read(conn,chk);

		if(listCheck == null || listCheck.size() != 1){
			//�ǂݍ��ݎ��s�i�������ɃX�e�[�^�X���ω��������A�폜���ꂽ�ꍇ�j

			//�G���[����
			setErrorMessage("ZZ06001");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			return false;
		}

		KA0100010Struct rst = (KA0100010Struct)listCheck.get(0);
		//�X�V�J�E���^�`�F�b�N
		// �ޔ������Ă����J�E���^�ƁA�����œǂݍ��񂾌��ݒl���r����B
		double bef_mod = Double.parseDouble(struct.geth_MODIFY_COUNT());
		double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());


		if(bef_mod != aft_mod){
			//�X�V�J�E���^���ω�����



			//�G���[����
			setErrorMessage("AC50802");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			return false;
		}

		return true;
	}
	
	/**
	 * ���F����o�^
	 * @param button
	 * @throws SQLException
	 */
    private boolean insertAppr(String button) throws SQLException{   	
    	/** ���F�˗����݃`�F�b�N */
		ArrayList keyValueList = new ArrayList();
		// �ϐ��ݒ�(��ЃR�[�h)
		MstColumns key1 = new MstColumns();
		key1.setColumnname("COMPANY_CD");
		key1.setColumnvalue(struct.getSYS_COMPANY_CD());
		keyValueList.add(key1);
		
		// �ϐ��ݒ�(���Ӑ�R�[�h)
		MstColumns key2 = new MstColumns();
		key2.setColumnname("CUST_CD");
		key2.setColumnvalue(struct.getCUST_CD());
		keyValueList.add(key2);
		
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100010","KA0100010Servlet");
		// ���F�˗����݃`�F�b�N
		boolean rtnFlg = mstappr.checkMST_APPR("M_CUST", keyValueList);
		if(rtnFlg) {
			// �L�[�����݂��Ă���
			ExpjMessage emsg = new ExpjMessage("KA00125");
			msgStruct.addError(emsg); // ���[�j���O���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
			return false;
		}
		
    	/** ���F�˗��\�֓o�^�@*/
    	MstApprStruct mstApprStruct = new MstApprStruct();
    	// ���URL
    	mstApprStruct.setSCREEN_URL("KA0100010Servlet");
    	// �H��R�[�h
    	mstApprStruct.setPLANT_CD(getsysPLANT_CD());
    	// �����敪
    	mstApprStruct.setPROC_TYP(button);
    	// ���F���l
    	mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   	
    	// ���F���(���F�҂�)
    	mstApprStruct.setSTATUS("1");
    	// �˗���
    	mstApprStruct.setREQUEST_BY(struct.getsUser_ID());
    	// �F�˗��\�Ƀf�[�^��ǉ�
    	String appr_ID = mstappr.insertMST_APPR(mstApprStruct);
    	
    	
    	/** ���F�L�[�֓o�^ */
    	MstApprKeyStruct keyStruct = new MstApprKeyStruct();
    	// ���FID
    	keyStruct.setAPPR_ID(appr_ID);
    	// �e�[�u����
    	keyStruct.setTABLE_NAME("M_CUST");
    	// �L�[��(��ЃR�[�h)
    	keyStruct.setKEY_NAME("COMPANY_CD");
    	// �L�[�l(��ЃR�[�h)
    	keyStruct.setKEY_VALUE(struct.getSYS_COMPANY_CD());
    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(��ЃR�[�h)��ǉ�����
    	mstappr.insertMST_APPR_KEY(keyStruct);
    	
    	// �L�[��(���Ӑ�R�[�h)
    	keyStruct.setKEY_NAME("CUST_CD");
    	// �L�[�l(���Ӑ�R�[�h)
    	keyStruct.setKEY_VALUE(struct.getCUST_CD());
    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[��ǉ�����
    	mstappr.insertMST_APPR_KEY(keyStruct);
    	

    	
    	/** ���F���ו\�֓o�^ */
    	// ��ЃR�[�h
		String columnID = mstappr.getColumnID( "M_CUST", "COMPANY_CD");
		mstappr.setDetailByColumnID(struct.getSYS_COMPANY_CD(),columnID);	
		// ���Ӑ�R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CD");
		mstappr.setDetailByColumnID(struct.getCUST_CD(),columnID);		
		// ���Ӑ搳����
		columnID = mstappr.getColumnID( "M_CUST", "CUST_FNAME");
		mstappr.setDetailByColumnID("",columnID);
		// ���Ӑ於
		columnID = mstappr.getColumnID( "M_CUST", "CUST_NAME");
		mstappr.setDetailByColumnID(struct.getCUST_NAME(),columnID);				
		// ���Ӑ於�i�J�i�j
		columnID = mstappr.getColumnID( "M_CUST", "CUST_KNAME");
		mstappr.setDetailByColumnID(struct.getCUST_KNAME(),columnID);		
		// ���Ӑ於�i�p���j
		columnID = mstappr.getColumnID( "M_CUST", "CUST_ENAME");
		mstappr.setDetailByColumnID("",columnID);		
		// ���Ӑ於����
		columnID = mstappr.getColumnID( "M_CUST", "CUST_ANAME");
		mstappr.setDetailByColumnID(struct.getCUST_ANAME(),columnID);			
		//��\�Җ�E��
		columnID = mstappr.getColumnID( "M_CUST", "OWNER_EXECUTIVE");
		mstappr.setDetailByColumnID("",columnID);		
		// ��\�Җ�
		columnID = mstappr.getColumnID( "M_CUST", "OWNER_NAME");
		mstappr.setDetailByColumnID("",columnID);	
		// ���Ӑ敪�ދ敪�P
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_TYP1");
		mstappr.setDetailByColumnID("21",columnID);		
		// ���Ӑ敪�ނP
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_1");
		mstappr.setDetailByColumnID("",columnID);		
		// ���Ӑ敪�ދ敪2
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_TYP2");
		mstappr.setDetailByColumnID("22",columnID);		
		// ���Ӑ敪��2
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_2");
		mstappr.setDetailByColumnID("",columnID);	
		// ���Ӑ敪�ދ敪3
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_TYP3");
		mstappr.setDetailByColumnID("23",columnID);		
		// ���Ӑ敪��3
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_3");
		mstappr.setDetailByColumnID("",columnID);		
		//���Ӑ�O���[�v�R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "CUST_GRP_CD");
		mstappr.setDetailByColumnID("",columnID);
		// ���Ӑ揸��
		columnID = mstappr.getColumnID( "M_CUST", "CUST_SEQ_CD");
		mstappr.setDetailByColumnID("",columnID);
		// �ʉ݃R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "CUR_CD");
		mstappr.setDetailByColumnID(struct.getCUR_CD(),columnID);
		// �ב֎��
		columnID = mstappr.getColumnID( "M_CUST", "EXCH_TYP");
		mstappr.setDetailByColumnID(struct.getEXCH_TYP(),columnID);
		// �����T�C�N��
		columnID = mstappr.getColumnID( "M_CUST", "CLAIM_CYCLE_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// �����敪
		columnID = mstappr.getColumnID( "M_CUST", "INSPC_ACPT_TYP");
		mstappr.setDetailByColumnID(struct.getINSPC_ACPT_TYP(),columnID);
		// �A�o����敪
		columnID = mstappr.getColumnID( "M_CUST", "EXPORT_TRN_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// �A�o�����敪
		columnID = mstappr.getColumnID( "M_CUST", "EXPORT_INSPC_ACPT_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// ���P������v��t���O
		columnID = mstappr.getColumnID( "M_CUST", "TEMP_UNIT_PRICE_SALES_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// �������͋敪
		columnID = mstappr.getColumnID( "M_CUST", "RM_INP_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// ����œK�p�敪
		columnID = mstappr.getColumnID( "M_CUST", "TAX_APPLY_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_APPLY_TYP(),columnID);
		// ����ŃR�[�h
		columnID = mstappr.getColumnID( "M_CUST", "TAX_CD");
		mstappr.setDetailByColumnID(struct.getTAX_CD(),columnID);
		// ����Ōv�Z�敪
		columnID = mstappr.getColumnID( "M_CUST", "TAX_CALC_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_CALC_TYP(),columnID);
		// �P�������N
		columnID = mstappr.getColumnID( "M_CUST", "PRICE_RANK_CD");
		mstappr.setDetailByColumnID("",columnID);
		// �P���v�Z�܂�ߋ敪
		columnID = mstappr.getColumnID( "M_CUST", "PRICE_ROUND_TYP");
		if(struct.getPRICE_ROUND_TYP() != null && !"".equals(struct.getPRICE_ROUND_TYP())){
			mstappr.setDetailByColumnID(struct.getPRICE_ROUND_TYP(),columnID);			
		}else{
			mstappr.setDetailByColumnID("1",columnID);						
		}
		// ���׌v�Z�܂�ߋ敪
		columnID = mstappr.getColumnID( "M_CUST", "DETAIL_ROUND_TYP");
		mstappr.setDetailByColumnID(struct.getDETAIL_ROUND_TYP(),columnID);
		// �������v�Z�敪
		columnID = mstappr.getColumnID( "M_CUST", "DISCOUNT_RATE_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// �W��������
		columnID = mstappr.getColumnID( "M_CUST", "STD_DISCOUNT_RATE");
		mstappr.setDetailByColumnID("1",columnID);
		// �W���P���K�p�敪
		columnID = mstappr.getColumnID( "M_CUST", "STD_PRICE_APPLY_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// ���[�o�׎w���t���O
		columnID = mstappr.getColumnID( "M_CUST", "PARTIAL_SHIP_INST_FLG");
		mstappr.setDetailByColumnID(struct.getPARTIAL_SHIP_INST_FLG(),columnID);
		// �Г��`�[���s�t���O
		columnID = mstappr.getColumnID( "M_CUST", "OWN_SLIP_ISS_FLG");
		mstappr.setDetailByColumnID("1",columnID);
		// ����`�[�h�c
		columnID = mstappr.getColumnID( "M_CUST", "SALES_SLIP_ID");
		mstappr.setDetailByColumnID("",columnID);
		// �`�[�󎚐���P
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_1");
		mstappr.setDetailByColumnID("0",columnID);
		// �`�[�󎚐���2
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_2");
		mstappr.setDetailByColumnID("0",columnID);
		// �`�[�󎚐���3
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_3");
		mstappr.setDetailByColumnID("0",columnID);
		// �`�[�󎚐���4
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_4");
		mstappr.setDetailByColumnID("0",columnID);
		// �`�[�󎚐���5
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_5");
		mstappr.setDetailByColumnID("0",columnID);
		// �����R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "VEND_CD");
		mstappr.setDetailByColumnID("",columnID);
		// ����J�n��
		columnID = mstappr.getColumnID( "M_CUST", "TRN_START_DATE");
		mstappr.setDetailByColumnID("",columnID);
		// ����I����
		columnID = mstappr.getColumnID( "M_CUST", "TRN_END_DATE");
		mstappr.setDetailByColumnID("",columnID);
		// �d�c�h����敪�i���v�v��j
		columnID = mstappr.getColumnID( "M_CUST", "EDI_REQ_PLAN_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// �d�c�h����敪�i�󒍁j
		columnID = mstappr.getColumnID( "M_CUST", "EDI_ODR_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// �d�c�h����敪�i�[���w���j
		columnID = mstappr.getColumnID( "M_CUST", "EDI_DLV_INST_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// �d�c�h����敪�i��́j
		columnID = mstappr.getColumnID( "M_CUST", "EDI_RCV_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// �d�c�h��������R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "EDI_CUST_VEND_CD");
		mstappr.setDetailByColumnID(struct.getEDI_CUST_VEND_CD(),columnID);
		// �d�c�h���Ў����R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "EDI_OWN_VEND_CD");
		mstappr.setDetailByColumnID("",columnID);
		// �^�M���x�z���|
		columnID = mstappr.getColumnID( "M_CUST", "CREDIT_LIMIT_AR");
		mstappr.setDetailByColumnID("0",columnID);
		// �^�M���x�z��
		columnID = mstappr.getColumnID( "M_CUST", "CREDIT_LIMIT_CR");
		mstappr.setDetailByColumnID("0",columnID);
		// ���Ӑ惉���N
		columnID = mstappr.getColumnID( "M_CUST", "CUST_RANK_CD");
		mstappr.setDetailByColumnID("",columnID);
		// �������Ӑ�敪
		columnID = mstappr.getColumnID( "M_CUST", "CUST_VARIOUS_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// �d�_���Ӑ�敪
		columnID = mstappr.getColumnID( "M_CUST", "PRIORITY_CUST_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// ���x�[�g�t���O
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�v�Z�敪
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_CALC_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�v�Z�N�Z��
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_CALC_START_MONTH");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�����敪
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_COND_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// ���x�[�g�������z
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_COND_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g��������
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_COND_QTY");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g�Ώۋ敪
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_TARGET_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// ���x�[�g��
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_RATE");
		mstappr.setDetailByColumnID("0",columnID);
		// ���x�[�g���z
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// ���ВS������R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "OWN_ORG_CD");
		mstappr.setDetailByColumnID(struct.getOWN_ORG_CD(),columnID);
		// ���ВS���҃R�[�h
		columnID = mstappr.getColumnID( "M_CUST", "OWN_PERSON_CD");
		mstappr.setDetailByColumnID(struct.getOWN_PERSON_CD(),columnID);
		//�����L������
		columnID = mstappr.getColumnID( "M_CUST", "UNCONFIRM_ODR_EFF_PRIOD");
		if(struct.getUNCONFIRM_ODR_EFF_PRIOD() == null || "".equals(struct.getUNCONFIRM_ODR_EFF_PRIOD())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getUNCONFIRM_ODR_EFF_PRIOD(),columnID);			
		}
		//�����L�����ԃt���O
		columnID = mstappr.getColumnID( "M_CUST", "UNCONFIRM_ODR_EFF_TERM_FLG");
		if(struct.getUNCONFIRM_ODR_EFF_TERM_FLG() == null || "".equals(struct.getUNCONFIRM_ODR_EFF_TERM_FLG())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getUNCONFIRM_ODR_EFF_TERM_FLG(),columnID);			
		}
		// �a���q�ɋ敪
		columnID = mstappr.getColumnID( "M_CUST", "DEPO_TYP");
		mstappr.setDetailByColumnID("10",columnID);
		// �쐬��
		columnID = mstappr.getColumnID("M_CUST","CREATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// �쐬��
		columnID = mstappr.getColumnID("M_CUST","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �쐬�v���O������
		columnID = mstappr.getColumnID("M_CUST","CREATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_CUST","UPDATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_CUST","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �X�V�v���O������
		columnID = mstappr.getColumnID("M_CUST","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_CUST","MODIFY_COUNT");
		mstappr.setDetailByColumnID("0",columnID);  
		//���Ӑ敪�ނO�P
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_01_TYP");
		mstappr.setDetailByColumnID("1001",columnID);   
		//���Ӑ敪�ނO�P�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_01_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO�P����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_01_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO2
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_02_TYP");
		mstappr.setDetailByColumnID("1002",columnID);   
		//���Ӑ敪�ނO2�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_02_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO2����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_02_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO3
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_03_TYP");
		mstappr.setDetailByColumnID("1003",columnID);   
		//���Ӑ敪�ނO3�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_03_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO3����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_03_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO4
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_04_TYP");
		mstappr.setDetailByColumnID("1004",columnID);   
		//���Ӑ敪�ނO4�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_04_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO4����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_04_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO5
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_05_TYP");
		mstappr.setDetailByColumnID("1005",columnID);   
		//���Ӑ敪�ނO5�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_05_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO5����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_05_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO6
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_06_TYP");
		mstappr.setDetailByColumnID("1006",columnID);   
		//���Ӑ敪�ނO6�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_06_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO6����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_06_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO7
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_07_TYP");
		mstappr.setDetailByColumnID("1007",columnID);   
		//���Ӑ敪�ނO7�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_07_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO7����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_07_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO8
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_08_TYP");
		mstappr.setDetailByColumnID("1008",columnID);   
		//���Ӑ敪�ނO8�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_08_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO8����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_08_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO9
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_09_TYP");
		mstappr.setDetailByColumnID("1009",columnID);   
		//���Ӑ敪�ނO9�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_09_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪�ނO9����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_09_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪��10
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_10_TYP");
		mstappr.setDetailByColumnID("1010",columnID);   
		//���Ӑ敪��10�R�[�h
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_10_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//���Ӑ敪��10����
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_10_NM");
		mstappr.setDetailByColumnID("",columnID);
		
		// ���F���ׂɃf�[�^��ǉ�����B
		mstappr.insertMST_APPR_DETAIL("M_CUST",appr_ID);
    	
		// ���F���˗����܂����B
		setInfoMessage("AZ00042");
		
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

			boolean ok_flg = true;

			//��ʃ��[�h�擾
			String strKMode="";
			strKMode = (String)struct.getk_MODE();

			if("INSERT".equals(strKMode)){

				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				//�o�^�̎��`�F�b�N
				// �ڋq���̑��݊m�F
				List w = entity.mselect.read(conn, struct);
				if (w.size() > 0) {
					ok_flg = false;
					setErrorMessage("ZZ01102");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				}else if(!isValidContents()){
					// ���͓��e�`�F�b�N
					ok_flg = false;
				}
			}else if("UPDATE".equals(strKMode)){

				//�X�V�̎��`�F�b�N
				// �X�V�m�F
				KA0100010Struct st = (KA0100010Struct)list.get(0);
				if(isUpdatable(st) == false){
					//�X�V�ł��Ȃ����
					//�G���[����
					ok_flg =false;
				}else if(!isValidContents()){
					// ���͓��e�`�F�b�N
					ok_flg = false;
				}
			}else if("DELETE".equals(strKMode)){

				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				//�폜�̎��`�F�b�N
				// �ڋq���̑��݊m�F
				List w = entity.mselect.read(conn, struct);
				if (w.size() == 0) {
					ok_flg = false;
					setErrorMessage("ZZ01105");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				}
				//��������
				boolean blnChkT_ODR_CTL = entity.mcheckT_ODR_CTL.check(conn, struct);
				if (blnChkT_ODR_CTL == true) {
					ok_flg = false;
					setErrorMessage("KA00026");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				}
			}else{

				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				
				MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100010","KA0100010Servlet");
				
				// ���F��ʂ́u���F��v�{�^������J�ڂ��鎞
				if("1".equals(struct.geth_APR_CUST()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){				
					list = mstappr.selectMST_APPR_DETAIL(_APPR_ID);
				} else {
					// ����̓Ǎ��Ə��F��ʂ́u���F�O�v�{�^������J�ڂ��鎞
					list = entity.mselect.read(conn, struct);
				}
				
				//list = entity.mselect.read(conn, struct);

				if (list.size() != 0) {
					if("1".equals(struct.geth_APR_CUST()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
						list.clear();
						String columnID;
						// ���Ӑ於
						columnID = mstappr.getColumnID( "M_CUST", "CUST_NAME");
						struct.setCUST_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));
						
						// ���Ӑ於����
						columnID = mstappr.getColumnID( "M_CUST", "CUST_ANAME");
						struct.setCUST_ANAME(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ���Ӑ於�i�J�i�j
						columnID = mstappr.getColumnID( "M_CUST", "CUST_KNAME");
						struct.setCUST_KNAME(mstappr.getDetailByColumnID(tempStruct,columnID));	
						// ���ВS������R�[�h
						columnID = mstappr.getColumnID( "M_CUST", "OWN_ORG_CD");
						struct.setOWN_ORG_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ���ВS�����喼
						List mOrgList = entity.mcheckOWN_ORG_CD.read(conn,struct);
						if(mOrgList.size() > 0){
							struct.setORG_NAME(((KA0100010Struct)mOrgList.get(0)).getORG_NAME());
						}
						// ���ВS���҃R�[�h
						columnID = mstappr.getColumnID( "M_CUST", "OWN_PERSON_CD");
						struct.setOWN_PERSON_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ���ВS���Җ�
						List userMstList = entity.mcheckOWN_PERSON_CD.read(conn,struct);
						if(userMstList.size() > 0){
							struct.setUSER_NAME(((KA0100010Struct)userMstList.get(0)).getUSER_NAME());
						}
						// �ʉ݃R�[�h
						columnID = mstappr.getColumnID( "M_CUST", "CUR_CD");
						struct.setCUR_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// �ʉݖ�
						List mCurList = entity.mcheckCUR_CD.read(conn,struct);
						if(mCurList.size() > 0){
							struct.setCUR_NAME(((KA0100010Struct)mCurList.get(0)).getCUR_NAME());
						}
						// �ב֎��
						columnID = mstappr.getColumnID( "M_CUST", "EXCH_TYP");
						struct.setEXCH_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// �����敪
						columnID = mstappr.getColumnID( "M_CUST", "INSPC_ACPT_TYP");
						struct.setINSPC_ACPT_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ����œK�p�敪
						columnID = mstappr.getColumnID( "M_CUST", "TAX_APPLY_TYP");
						struct.setTAX_APPLY_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ����ŃR�[�h
						columnID = mstappr.getColumnID( "M_CUST", "TAX_CD");
						struct.setTAX_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ����Ŗ�
						List mTaxList = entity.mselectM_TAX.read(conn,struct);
						if(mTaxList.size() > 0){
							struct.setTAX_NAME(((KA0100010Struct)mTaxList.get(0)).getTAX_NAME());							
						}
						// ����Ōv�Z�敪
						columnID = mstappr.getColumnID( "M_CUST", "TAX_CALC_TYP");
						struct.setTAX_CALC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ���[�o�׎w���t���O
						columnID = mstappr.getColumnID( "M_CUST", "PARTIAL_SHIP_INST_FLG");
						struct.setPARTIAL_SHIP_INST_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
						// �d�c�h��������R�[�h
						columnID = mstappr.getColumnID( "M_CUST", "EDI_CUST_VEND_CD");
						struct.setEDI_CUST_VEND_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ���׌v�Z�܂�ߋ敪
						columnID = mstappr.getColumnID( "M_CUST", "DETAIL_ROUND_TYP");
						struct.setDETAIL_ROUND_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
					}else{
						struct.copy((KA0100010Struct)list.get(0));
						//��ʑJ�ڃp�����[�^���Ď擾
						struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
					}
					_mode = _SELECT;
				} else {
					ok_flg = false;
					setErrorMessage("ZZ06001");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
					
					// �f�[�^�����݂��Ȃ��ꍇ�̃N���A����
					String w_custcd = struct.getCUST_CD();	// �L�[���̑ޔ�
					struct.initialize();                    // �\�����ڂ��f�t�H���g�ɖ߂�
					struct.setCUST_CD(w_custcd);			// �L�[���̐ݒ�

				}
			}
			setComboData(struct);

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(NORMAL);
			struct.seth_CUST_CD(struct.getCUST_CD());

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
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// �������ʃt���O��NG�ɐݒ�
			//struct.seth_RESULT("NG");

			//��ЃR�[�h��Ǎ�
			List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			// �ڋq���̑��݊m�F
			List w = entity.mselect.read(conn, struct);
			if (w.size() > 0) {
				setErrorMessage("ZZ01102");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());

			}else{
				// ���͓��e�`�F�b�N
				isValidContents();

			}
			// �G���[���������Ă��Ȃ��ꍇ�A�o�^�������{
			if(msgStruct.sizeError() <= 0){
				
				if("1".equals(struct.geth_APR_CUST())){				
					// ���Ӑ揳�F�̓o�^
					boolean rtn = insertAppr("1");
					if(!rtn) return;
				} else {
					// ���Ӑ�̓o�^
					entity.minsertM_CUST.create(conn, struct);
				}
				//�R�����g
                conn.commit();
                
                if("0".equals(struct.geth_APR_CUST())){
    				// ����
    				struct.setk_MODE("RESELECT");
    				controlselect();                	
                }
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
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			conn.beginTransWeb();		// �g�����U�N�V�����J�n

			//�X�V�̎��`�F�b�N
			// �X�V�m�F
			KA0100010Struct st = (KA0100010Struct)list.get(0);
			if(isUpdatable(st) == false){
				//�X�V�ł��Ȃ����
				//�G���[����
			}else{
				// ���͓��e�`�F�b�N
				isValidContents();
			}
			// �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
			if(msgStruct.sizeError() <= 0)
			{
				//��ЃR�[�h��Ǎ�
				List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());
				//�u���Ӑ揳�F�v���P�̏ꍇ
				if("1".equals(struct.geth_APR_CUST())){				
					// ���F���̓o�^
					boolean rtn = insertAppr("2");
					if(!rtn) return;
				} else {	
					//�u���Ӑ揳�F�v���P�ȊO�̏ꍇ

					entity.mupdateM_CUST.update(conn, struct);
				}
				//�R�����g
				conn.commit();
                
                if("0".equals(struct.geth_APR_CUST())){
    				// ����
    				struct.setk_MODE("RESELECT");
    				controlselect();                	
                }
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
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			struct.initialize();
			setComboData(struct);
			// ���[�h�ݒ�
			_mode = _NORMAL;

			// �Ǎ��X�e�[�^�X�ݒ�
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlclear>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		String OPTION_ID="B*";
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

			//��ЃR�[�h��Ǎ�
			List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			//�󒍊Ǘ���������
			boolean blnChkT_ODR_CTL = entity.mcheckT_ODR_CTL.check(conn, struct);
			if (blnChkT_ODR_CTL == true) {
				setErrorMessage("KA00026");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
			}
			
			// ���i�}�X�^�̑��݃`�F�b�N
			if (entity.mcheckM_ITEM_SPEC.check(conn, struct)) {
				// �G���[���b�Z�[�W�ݒ�
				setErrorMessage("AA00173");
				setErrorMessage("ZZ01006", "M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD() );
			}
    
			// ���i�P���}�X�^�̑��݃`�F�b�N
			if (entity.mcheckM_UNIT_COST.check(conn, struct)) {
				// �G���[���b�Z�[�W�ݒ�
				setErrorMessage("AA00174");
				setErrorMessage("ZZ01006", "M_UNIT_COST.CUST_CD:" + struct.getCUST_CD() );
			}
			
			// ���Ӑ�[�i�ꏊ�̑��݃`�F�b�N
			if (entity.mcheckM_CUST_BASE.check(conn, struct)) {
				// �G���[���b�Z�[�W�ݒ�
				setErrorMessage("KA20029");
				setErrorMessage("ZZ01006", "M_CUST_BASE.CUST_CD:" + struct.getCUST_CD() );
			}
            // �̔����v�v��}�X�^�̑��݃`�F�b�N
    		if(entity.mcheckT_SALES_PLAN.check(conn, struct)){
    			setErrorMessage("CA00185");
    			setErrorMessage("ZZ01006","T_SALES_PLAN.CUST_CD:"+struct.getCUST_CD());
    		}
    	    // �󒍃w�b�_�}�X�^�̑��݃`�F�b�N
    		if(entity.mcheckT_ODR_H.check(conn, struct)){
    			setErrorMessage("CA00186");
    			setErrorMessage("ZZ01006","T_ODR_H.CUST_CD:"+struct.getCUST_CD());
    	    }
    		// �o�׎w���}�X�^�̑��݃`�F�b�N
    		if(entity.mcheckT_SHIP_ODR.check(conn, struct)){
    			setErrorMessage("CA00187");
    			setErrorMessage("ZZ01006","T_SHIP_ODR.CUST_CD:"+struct.getCUST_CD());
    	    }
    		// �o�׎��у}�X�^�̑��݃`�F�b�N
    		if(entity.mcheckT_SHIP.check(conn, struct)){
    			setErrorMessage("CA00188");
    			setErrorMessage("ZZ01006","T_SHIP.CUST_CD:"+struct.getCUST_CD());
    		}
    		// ������у}�X�^�̑��݃`�F�b�N
    		if(entity.mcheckT_SALES.check(conn, struct)){
    			setErrorMessage("CA00189");
    			setErrorMessage("ZZ01006","T_SALES.CUST_CD:"+struct.getCUST_CD());
    		}
			struct.setOPTION_ID(OPTION_ID);
			List tempList  = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			KA0100010Struct tempStruct = new KA0100010Struct();
			if(tempList!=null&&tempList.size()>0){
				tempStruct = (KA0100010Struct)tempList.get(0);
				struct.setINSTALL_FLG(tempStruct.getINSTALL_FLG());
			}
			if("1".equals(struct.getINSTALL_FLG())){
				//���������`�F�b�N
				if (entity.mcheckM_CUST_STL_CTRL.check(conn, struct)) {
					setErrorMessage("BA90005");
					setErrorMessage("ZZ01006","M_CUST_STL_CTRL.CUST_CD:"+struct.getCUST_CD());
				}
				// ���|���g�����w�b�_�}�X�^�̑��݃`�F�b�N
				if(entity.mcheckT_AR_LEDGER_H_TRN.check(conn, struct)){
	    			setErrorMessage("BA90004");
	    			setErrorMessage("ZZ01006","T_AR_LEDGER_H_TRN.CUST_CD:"+struct.getCUST_CD());
	    		}
	            // ���|�������w�b�_�}�X�^�̑��݃`�F�b�N
	    		if(entity.mcheckT_AR_LEDGER_H.check(conn, struct)){
	    			setErrorMessage("BA90003");
	    			setErrorMessage("ZZ01006","T_AR_LEDGER_H.CUST_CD:"+struct.getCUST_CD());
	    		}
	            // ���|���c���}�X�^�̑��݃`�F�b�N
	    		if(entity.mcheckT_AR_BALANCE.check(conn, struct)){
	    			setErrorMessage("CA00191");
	    			setErrorMessage("ZZ01006","T_AR_BALANCE.CUST_CD:"+struct.getCUST_CD());
	    		}
	    		// �c�����׃}�X�^�̑��݃`�F�b�N
	    		if(entity.mcheckT_AR_BALANCE_D.check(conn, struct)){
	    			setErrorMessage("CA00192");
	    			setErrorMessage("ZZ01006","T_AR_BALANCE_D.CUST_CD:"+struct.getCUST_CD());
	    		}
	    		// ���������w�b�_�}�X�^�̑��݃`�F�b�N
	    		if(entity.mcheckT_RM_LEDGER_H.check(conn, struct)){
	    			setErrorMessage("CA00193");
	    			setErrorMessage("ZZ01006","T_RM_LEDGER_H.CUST_CD:"+struct.getCUST_CD());
	    	    }
	    		// �����g�����w�b�_�}�X�^�̑��݃`�F�b�N
	    		if(entity.mcheckT_RM_LEDGER_H_TRN.check(conn, struct)){
	    			setErrorMessage("CA00194");
	    			setErrorMessage("ZZ01006","T_RM_LEDGER_H_TRN.CUST_CD:"+struct.getCUST_CD());
	    	    }
			}
			//MODIFYCOUNT�̃`�F�b�N
            isUpdatable(struct);
			// �G���[���������Ă��Ȃ��ꍇ�A�폜�������{
			if(msgStruct.sizeError() <= 0) {
				
				//�u���Ӑ揳�F�v���P�̏ꍇ
				if("1".equals(struct.geth_APR_CUST())){				
					// ���F���̓o�^
					boolean rtn = insertAppr("3");
					if(!rtn) return;
				} else {	
					//�u���Ӑ揳�F�v���P�ȊO�̏ꍇ
					entity.mdeleteM_CUST.delete(conn, struct);
				}
                //�R�~�b�g				
                conn.commit();
				controlclear();
				_mode = _NORMAL;
                struct.initialize();
			}

			//��ʂ�������
			setComboData(struct);

		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			//��ʑJ�ڃp�����[�^���擾
			_SCREENMOVE_TYP = struct.geth_SCREENMOVE_TYP();
			_APPR_ID = struct.geth_APPR_ID();
			// �N���A����
			controlclear();

           	setComboData(struct);

			// ���[�h�ݒ�
			_mode = _NORMAL;
	        
	        /** �p�����[�^�u���Ӑ揳�F�v���擾*/
	        privateConfig = new PrivateConfig(conn);	        
	        // ���Ӑ揳�F
	        aprMCust = privateConfig.getString("APR_CUST");
	        // �p�����[�^�u���Ӑ揳�F�v���擾�ł��Ȃ������ꍇ
			if(aprMCust ==null || "".equals(aprMCust)) {
 				String locale = CoreTools.getLocale(struct.getsUser_ID());
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				//ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00045"));
				setErrorMessage("AZ00041" , messages.getString("AZ00045"));
				struct.seth_APR_CUST("0");
			} else if("1".equals(aprMCust)) {
				// �P�̏ꍇ
				struct.seth_APR_CUST("1");
			} else {
				// �P�ȊO�̏ꍇ
				struct.seth_APR_CUST("0");
			}

            // add �W��G ��
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
			if ( isScreenMove()== true ) {
				struct.setCUST_CD( _custCd );
				//���F�˗���񂩂�p�����[�^���擾
				if("1".equals(_SCREENMOVE_TYP) || "0".equals(_SCREENMOVE_TYP)){
					struct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());
					struct.setSYS_COMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
					struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
				}
				controlselect();
			}
            // add �W��G ��

		}catch (ComboException e) {
			throw new ExpjException(e);
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" ," (SBM1093)�����[�h�����͎��s���܂����B");
			msgStruct.addWarn( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		// ���X�g�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B

		//�ʉ݃R�[�h���擾
		/*try{
			List curList = new ArrayList();
			List curNameList = new ArrayList();
			List curValueList = new ArrayList();

			curList = entity.mselectM_CUR.read(conn, struct);

			for(int i = 0; i < curList.size(); i++) {
				curNameList.add(((KA0100010Struct)curList.get(i)).getCUR_CD_name());
				curValueList.add(((KA0100010Struct)curList.get(i)).getCUR_CD_val());
			}
			struct.setList_CUR_CD_name(curNameList);
			struct.setList_CUR_CD_val(curValueList);
		}
		catch(SQLException e){
			throw new ExpjException(e);
		}

		//�ڋq�d�_�敪�̃��X�g�p�f�[�^�擾
		try{
			List ciList = new ArrayList();
			List ciNameList = new ArrayList();
			List ciValueList = new ArrayList();

			ciList = entity.mselectCUST_IMPORTANT_TYP.read(conn, struct);

			for(int i = 0; i < ciList.size(); i++) {
				ciNameList.add(((KA0100010Struct)ciList.get(i)).getCUST_IMPORTANT_TYP_name());
				ciValueList.add(((KA0100010Struct)ciList.get(i)).getCUST_IMPORTANT_TYP_val());
			}
			struct.setList_CUST_IMPORTANT_TYP_name(ciNameList);
			struct.setList_CUST_IMPORTANT_TYP_val(ciValueList);
		}
		catch(SQLException e){
			throw new ExpjException(e);
		}*/

		setComboData(struct); 
		if("1".equals(aprMCust)) {
			// �P�̏ꍇ
			struct.seth_APR_CUST("1");
		} else {
			// �P�ȊO�̏ꍇ
			struct.seth_APR_CUST("0");
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
//			throw new FoundationException("KA0100010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KA0100010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KA0100010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KA0100010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KA0100010Entity entity;
	protected KA0100010Struct struct;
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

		entity = new KA0100010Entity();
		struct = new KA0100010Struct();

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
	 * KA0100010�N���X�̕W���R���X�g���N�^
	 */
	public KA0100010Control() throws BusinessProcessException, FoundationException
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
				KA0100010Struct key = (KA0100010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("EXCH_TYP_name") && key.getEXCH_TYP_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_name", key.getEXCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_val") && key.getEXCH_TYP_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_val", key.getEXCH_TYP_val());
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
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_name") && key.getPARTIAL_SHIP_INST_FLG_name() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG_name", key.getPARTIAL_SHIP_INST_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_val") && key.getPARTIAL_SHIP_INST_FLG_val() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG_val", key.getPARTIAL_SHIP_INST_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_name") && key.getINSPC_ACPT_TYP_name() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP_name", key.getINSPC_ACPT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_val") && key.getINSPC_ACPT_TYP_val() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP_val", key.getINSPC_ACPT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_name") && key.getDETAIL_ROUND_TYP_name() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP_name", key.getDETAIL_ROUND_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_val") && key.getDETAIL_ROUND_TYP_val() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP_val", key.getDETAIL_ROUND_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_CUR_CD") && key.geth_CUR_CD() != null) {
					msgKey.setKeyValue("h_CUR_CD", key.geth_CUR_CD().toString());
				}
				if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP") && key.geth_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("h_INSPC_ACPT_TYP", key.geth_INSPC_ACPT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CALC_TYP") && key.geth_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("h_TAX_CALC_TYP", key.geth_TAX_CALC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP") && key.geth_PRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("h_PRICE_ROUND_TYP", key.geth_PRICE_ROUND_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("h_CUST_CD") && key.geth_CUST_CD() != null) {
					msgKey.setKeyValue("h_CUST_CD", key.geth_CUST_CD());
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
				if(msgKeyType.containsKeyColumn("h_APR_CUST") && key.geth_APR_CUST() != null) {
					msgKey.setKeyValue("h_APR_CUST", key.geth_APR_CUST());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("T_CUST_CD") && key.getT_CUST_CD() != null) {
					msgKey.setKeyValue("T_CUST_CD", key.getT_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_KNAME") && key.getCUST_KNAME() != null) {
					msgKey.setKeyValue("CUST_KNAME", key.getCUST_KNAME());
				}
				if(msgKeyType.containsKeyColumn("OWN_ORG_CD") && key.getOWN_ORG_CD() != null) {
					msgKey.setKeyValue("OWN_ORG_CD", key.getOWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_CD") && key.getOWN_PERSON_CD() != null) {
					msgKey.setKeyValue("OWN_PERSON_CD", key.getOWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_PRIOD") && key.getUNCONFIRM_ODR_EFF_PRIOD() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_EFF_PRIOD", key.getUNCONFIRM_ODR_EFF_PRIOD());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_TERM_FLG") && key.getUNCONFIRM_ODR_EFF_TERM_FLG() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_EFF_TERM_FLG", key.getUNCONFIRM_ODR_EFF_TERM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG") && key.getPARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG", key.getPARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRICE_ROUND_TYP") && key.getPRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("PRICE_ROUND_TYP", key.getPRICE_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("EDI_CUST_VEND_CD") && key.getEDI_CUST_VEND_CD() != null) {
					msgKey.setKeyValue("EDI_CUST_VEND_CD", key.getEDI_CUST_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME") && key.getTAX_NAME() != null) {
					msgKey.setKeyValue("TAX_NAME", key.getTAX_NAME());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
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
					KA0100010Struct key = new KA0100010Struct();
					if(msgKeyType.containsKeyColumn("EXCH_TYP_name")) {
						key.setEXCH_TYP_name(msgKey.getKeyValue("EXCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_val")) {
						key.setEXCH_TYP_val(msgKey.getKeyValue("EXCH_TYP_val"));
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
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_name")) {
						key.setPARTIAL_SHIP_INST_FLG_name(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_val")) {
						key.setPARTIAL_SHIP_INST_FLG_val(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_name")) {
						key.setINSPC_ACPT_TYP_name(msgKey.getKeyValue("INSPC_ACPT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_val")) {
						key.setINSPC_ACPT_TYP_val(msgKey.getKeyValue("INSPC_ACPT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_name")) {
						key.setDETAIL_ROUND_TYP_name(msgKey.getKeyValue("DETAIL_ROUND_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_val")) {
						key.setDETAIL_ROUND_TYP_val(msgKey.getKeyValue("DETAIL_ROUND_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_CUR_CD")) {
						key.seth_CUR_CD(new Double(msgKey.getKeyValue("h_CUR_CD")));
					}
					if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP")) {
						key.seth_INSPC_ACPT_TYP(new Double(msgKey.getKeyValue("h_INSPC_ACPT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CALC_TYP")) {
						key.seth_TAX_CALC_TYP(new Double(msgKey.getKeyValue("h_TAX_CALC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP")) {
						key.seth_PRICE_ROUND_TYP(new Double(msgKey.getKeyValue("h_PRICE_ROUND_TYP")));
					}
					if(msgKeyType.containsKeyColumn("h_CUST_CD")) {
						key.seth_CUST_CD(msgKey.getKeyValue("h_CUST_CD"));
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
					if(msgKeyType.containsKeyColumn("h_APR_CUST")) {
						key.seth_APR_CUST(msgKey.getKeyValue("h_APR_CUST"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_CUST_CD")) {
						key.setT_CUST_CD(msgKey.getKeyValue("T_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_KNAME")) {
						key.setCUST_KNAME(msgKey.getKeyValue("CUST_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ORG_CD")) {
						key.setOWN_ORG_CD(msgKey.getKeyValue("OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_CD")) {
						key.setOWN_PERSON_CD(msgKey.getKeyValue("OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_PRIOD")) {
						key.setUNCONFIRM_ODR_EFF_PRIOD(msgKey.getKeyValue("UNCONFIRM_ODR_EFF_PRIOD"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_TERM_FLG")) {
						key.setUNCONFIRM_ODR_EFF_TERM_FLG(msgKey.getKeyValue("UNCONFIRM_ODR_EFF_TERM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG")) {
						key.setPARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRICE_ROUND_TYP")) {
						key.setPRICE_ROUND_TYP(msgKey.getKeyValue("PRICE_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EDI_CUST_VEND_CD")) {
						key.setEDI_CUST_VEND_CD(msgKey.getKeyValue("EDI_CUST_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME")) {
						key.setTAX_NAME(msgKey.getKeyValue("TAX_NAME"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
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
