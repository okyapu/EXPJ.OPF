/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0090/src/com/nec/jp/orteus/metamorBase/KQ0090/KQ0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0090;

import com.nec.jp.orteus.metamorBase.KQ0090.*;
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
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
import java.text.ParseException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KQ0090010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhang-yan $
 * @version $Revision: 1.3 $ $Date: 2014/06/25 04:43:22 $
 *
 */
//}}user_implement_code_header

public class KQ0090010Control
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
	//Add Anken Start 20140416 shang-j
	/** �N���A�{�^���t���O */
	private String _ClearFlg = "0";
	//Add Anken End   20140416 shang-j
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
	public KQ0090010Struct getListvalue(int x) { return (KQ0090010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KQ0090010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KQ0090010Struct createStruct() { return new KQ0090010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KQ0090010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
	//add nec 20140613 str
	// �󒍏��F
	private String _APR_ODR;
	////add nec 20140613 end 
		
	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/** �V�X�e���I�v�V�������ʎq */
	private String _option_id = EXPLANNER_J;
	
	/** Explanner/J*/
	static final public String EXPLANNER_J = "J*";
	
	/** Explanner/Ja*/
	static final public String EXPLANNER_JA = "JA*";
	
	/** Explanner/Jf*/
	static final public String EXPLANNER_JF = "JF*";
	
	/** Explanner/JaSCM*/
	static final public String EXPLANNER_JASCM = "SCM*";
	
	/** ���O�C�����[�U�̉�ЃR�[�h */
	private String _sysCompanyCd = new String();
	
	/** ��݌ɕi���̊���l */
	private String _itemNameDefault = new String();
	
	/**
	 * Exception���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	public void setAppErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
		
    /**
     * ���[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     */
    private void setWarningMessage(String code) {
    	ExpjMessage emsg = new ExpjMessage(code);
    	msgStruct.addWarn(emsg);
    	sysLog.info(emsg, sysUSER_CD);
    }
    
    /**
     * �o�^�ƍX�V�̋��ʃT�[�o�`�F�b�N
     * @param optionId �V�X�e���I�v�V�������ʎq
     * @param struct KQ0090010Struct
     * @param custStruct ���Ӑ���
     * @return true�F�`�F�b�N�G���[���Ȃ�    false:�`�F�b�N�G���[������
     * @throws FoundationException
     * @throws ExpjException
     */
    private boolean DBCheck(String optionId, KQ0090010Struct struct, KQ0090010Struct custStruct) throws FoundationException, ExpjException{
    	// KQ00341�y�w�肵�����󒍔ԍ��͖��o�^�ł��B�z
    	try {
			// KQ20006 �y�c�ƒS���҃R�[�h�����[�U�}�X�^�ɑ��݂��܂���B�z
			// Explanner/JaScm�̏ꍇ
			if(EXPLANNER_JASCM.equals(_option_id)){
				if(struct.getCUST_CHRG_PSN_CD() != null && !"".equals(struct.getCUST_CHRG_PSN_CD())){
					List userList = entity.mcheckUSER_MST_SCM.read(conn, struct);
					if(userList.isEmpty()){
						struct.setUSER_NAME("");
						setErrorMessage("KQ20006");
						return false;
					}
					struct.setUSER_NAME(((KQ0090010Struct)userList.get(0)).getUSER_NAME());
				}
			}
			// Explanner/J�AExplanner/Jf�AExplanner/Ja�̏ꍇ
			else{
				if(struct.getCUST_CHRG_PSN_CD() != null && !"".equals(struct.getCUST_CHRG_PSN_CD())){
					List userList = entity.mcheckUSER_MST_J.read(conn, struct);
					if(userList.isEmpty()){
						struct.setUSER_NAME("");
						setErrorMessage("KQ20006");
						return false;
					}
					struct.setUSER_NAME(((KQ0090010Struct)userList.get(0)).getUSER_NAME());
				}
			}
			
			// AA01001 �y�w�肵������ŃR�[�h�͖��o�^�ł��B�z
			if(!entity.mcheckM_TAX.check(conn, struct)){
				setErrorMessage("AA01001");
				return false;
			}
			
			// KQ00073 �y�ʉ݃R�[�h���}�X�^�ɑ��݂��܂���B�z
			List curList = entity.mselectM_CUR.read(conn, custStruct);
			if(curList == null || curList.isEmpty()){
				setErrorMessage("KQ00073");
				return false;
			}
			KQ0090010Struct curStruct = (KQ0090010Struct)curList.get(0);
			
			// KQ00347 �y�󒍋��z�̏�������������������܂���B�z
			if (NumberTool.getRealScale(struct.getODR_AMOUNT()) > Integer.parseInt(curStruct.getw_DECIMAL_FIG())) {
				setErrorMessage("KQ00347");
				return false;
			}
		} catch (SQLException e) {
			setSqlExceptionMsg(e);
		}
		return true;
    }
    
    /**
     * �i�ږ��Z�b�g
     * @param struct�@KQ0090010Struct
     * @throws ExpjException
     * @throws FoundationException
     */
    private void setItemName(KQ0090010Struct struct) throws ExpjException, FoundationException{
    	try{
	    	// �i�ږ� = NULL�̏ꍇ
			if(struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())){
				// �i�ڔԍ� = NULL�̏ꍇ
				if(struct.getITEM_CD() == null || "".equals(struct.getITEM_CD())){
					struct.setITEM_NAME(_itemNameDefault);
				}
				// �i�ڔԍ� <> NULL�̏ꍇ
				else{
					List itemList = entity.mselectM_ITEM.read(conn, struct);
					// �i�ڂ����݂��Ȃ��̏ꍇ 
					if(itemList.isEmpty()){
						struct.setITEM_NAME(_itemNameDefault);
					}
					// �i�ڂ����݂̏ꍇ
					else{
						String strItemName = ((KQ0090010Struct)itemList.get(0)).getITEM_NAME();
						// �i�ږ���NULL�̏ꍇ
						if(strItemName == null || "".equals(strItemName)){
							struct.setITEM_NAME(_itemNameDefault);
						}
						else{
							struct.setITEM_NAME(strItemName);
						}
					}
				}
			}
    	} catch (SQLException e){
    		setSqlExceptionMsg(e);
    	}
    }
    
    /**
	 * �M�݊��Z�B
	 * @param amount �Ώۋ��z
	 * @param s �X�g���N�g�I�u�W�F�N�g
	 * @return �M�݋��z
	 * @throws SQLException �������s
	 * @throws ExpjException  �������s
	 */
	private String exchAmount(String amount, KQ0090010Struct s, String optionId)
		throws SQLException, ExpjException {

		ExchAmount exch = new ExchAmount(conn);
		boolean result =
				exch.doExchAmount(
					amount,
					_sysCompanyCd,
					s.getw_CURRNCY_CD(),
					s.getw_EXCH_TYP(),
					s.getw_DETAIL_ROUND_TYP(),
					struct.getDESINATED_DLV_DATE());

		if (!result) {
			throw new ExpjException("KQ00038");
		}

		double exchAmount = exch.getD_EXCH_AMOUNT();

		return String.valueOf(exchAmount);
	}
	
	//Add Anken Start 20140416 shang-j
	 /**
     * ��ʂ̏ڍ׍��ڂ����������܂��B
     */
    private void initializeDetail() {
     struct.setORGN_ODR_NO(null);
     struct.setCUST_ODR_NO(null);
     struct.setCUST_CD(null);
     struct.setCUST_ANAME(null);
     struct.setCUST_CHRG_PSN_CD(null);
     struct.setUSER_NAME(null);
     struct.setITEM_CD(null);
     struct.setITEM_NAME(null);
     struct.setDESINATED_DLV_DATE(null);
     struct.setODR_UNIT_PRICE("0");
     struct.setCUR_UNIT_PRICE(null);
     struct.setODR_QTY("0");
     struct.setSTOCK_UNIT(null);
     struct.setODR_AMOUNT("0");
     struct.setCUR_UNIT_AMOUNT(null);
     struct.setTAX_CD(null);
     struct.setREMARKS(null);
    }
	//Add Anken End   20140416 shang-j
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		List odrUnstockList = new ArrayList();
		KQ0090010Struct odrUnstockStruct = new KQ0090010Struct();
		try {
			// Explanner/JaScm�ꍇ
			if(EXPLANNER_JASCM.equals(_option_id)){
				odrUnstockList = entity.mselectT_ODR_UNSTOCK_SCM.read(conn, struct);
			}
			// Explanner/JaScm�ȊO�ꍇ
			else{
				odrUnstockList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
			}
			if(odrUnstockList.isEmpty()){
				//Add Anken Start 20140416 shang-j
				if ( EXPLANNER_J.equals(_option_id) && isScreenMove() == true ){
					initializeDetail();
				}
				//Add Anken End   20140416 shang-j
				readStatus = NOT_FOUND;
				struct.setODR_ACPT_DATE(struct.geth_BUSINESS_OPR_DATE());
				setErrorMessage("ZZ01101");
				return;
			}
			//Add Anken Start 20140507 shang-j
			if(EXPLANNER_J.equals(_option_id)){
				List pjOdrAlcList = entity.mselectT_PJ_ODR_ALC.read(conn, struct);
				if(!pjOdrAlcList.isEmpty()){	
					struct.setODR_ACPT_DATE(struct.geth_BUSINESS_OPR_DATE());
					setErrorMessage("KQ00353");
					return;
				}
			}
			//Add Anken End   20140507 shang-j
			
			odrUnstockStruct = (KQ0090010Struct)odrUnstockList.get(0);
			// �X�V���i��\�����ځj
			struct.seth_MODIFY_COUNT(odrUnstockStruct.geth_MODIFY_COUNT());
			// ���󒍔ԍ�
			struct.setORGN_ODR_NO(odrUnstockStruct.getORGN_ODR_NO());
			// ���z��
			if(odrUnstockStruct.getw_ADD_ODR_FLG() == null){
				struct.setchkADD_ODR_FLG("false");
			}
			else{
				if("1".equals(odrUnstockStruct.getw_ADD_ODR_FLG())){
					struct.setchkADD_ODR_FLG("true");
				}
				else{
					struct.setchkADD_ODR_FLG("false");
				}
			}
			// �󒍓�
			struct.setODR_ACPT_DATE(odrUnstockStruct.getODR_ACPT_DATE());
			// ���Ӑ撍���ԍ�
			struct.setCUST_ODR_NO(odrUnstockStruct.getCUST_ODR_NO());
			// ���Ӑ�R�[�h
			struct.setCUST_CD(odrUnstockStruct.getCUST_CD());
			// ���Ӑ於��
			struct.setCUST_ANAME(odrUnstockStruct.getCUST_ANAME());
			// �c�ƒS���҃R�[�h
			struct.setCUST_CHRG_PSN_CD(odrUnstockStruct.getCUST_CHRG_PSN_CD());
			// �c�ƒS���Җ���
			struct.setUSER_NAME(odrUnstockStruct.getUSER_NAME());
			// �i�ڔԍ�
			struct.setITEM_CD(odrUnstockStruct.getITEM_CD());
			// �i�ږ�
			struct.setITEM_NAME(odrUnstockStruct.getITEM_NAME());
			// �w�E�[��
			struct.setDESINATED_DLV_DATE(odrUnstockStruct.getDESINATED_DLV_DATE());
			// �P��
			struct.setODR_UNIT_PRICE(odrUnstockStruct.getODR_UNIT_PRICE());
			// �ʉݒP��
			struct.setCUR_UNIT_PRICE(odrUnstockStruct.getCUR_UNIT_PRICE());
			// �󒍐���
			struct.setODR_QTY(odrUnstockStruct.getODR_QTY());
			// �P��
			struct.setSTOCK_UNIT(odrUnstockStruct.getSTOCK_UNIT());
			// �󒍋��z
			struct.setODR_AMOUNT(odrUnstockStruct.getODR_AMOUNT());
			// �ʉݒP��
			struct.setCUR_UNIT_AMOUNT(odrUnstockStruct.getCUR_UNIT_PRICE());
			// ����ŃR�[�h
			struct.setTAX_CD(odrUnstockStruct.getTAX_CD());
			// ���l
			struct.setREMARKS(odrUnstockStruct.getREMARKS());
			
			readStatus = NORMAL;
		} catch(SQLException e) {
			readStatus = ERROR;
			this.setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		List custList = new ArrayList();
		
		try {
			conn.beginTrans();
			
			//move 20140617 NEC str
			// �S���R�[�h�̓o�^����
			boolean appSucessFlg = false;
			
			// (Explanner/J�̏ꍇ�����F�̂��߁A�Ď擾)
			if(EXPLANNER_J.equals(_option_id)){
				try{
					// ���ЃR�[�h�h���擾����B
					_sysCompanyCd = SystemInformation.getSysMyCompanyCd();
					if(_sysCompanyCd == null || "".equals(_sysCompanyCd)){
						setErrorMessage("KQ00039");
						throw new ExpjException("KQ00039");
					}
				} catch (FoundationException e) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
			}
			//move 20140617 NEC end
			
			// KQ00014 �y���Ӑ�R�[�h���}�X�^�ɑ��݂��܂���B�z
			if(struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())){
				custList = entity.mselectM_CUST.read(conn, struct);
				if(custList.isEmpty()){
					struct.setCUST_ANAME("");
					setErrorMessage("KQ00014");
					return;
				}
				
				// ���󒍔ԍ��̃`�F�b�N
				if(struct.getORGN_ODR_NO() != null && !"".equals(struct.getORGN_ODR_NO())){
					// Explanner/J�̏ꍇ
		    		if(EXPLANNER_J.equals(_option_id)){
						if(!entity.mcheckT_ODR_J.check(conn, struct)){
							setErrorMessage("KQ00341");
							return;
						}
					}
					// Explanner/Ja�̏ꍇ
		    		else if(EXPLANNER_JA.equals(_option_id)){
						if(!entity.mcheckT_ODR_JA.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
					// Explanner/Jf�̏ꍇ
		    		else if(EXPLANNER_JF.equals(_option_id)){
						if(!entity.mcheckT_ODR_JF.check(conn, struct)){
							setErrorMessage("KQ00349");
							return;
						}
					}
					// Explanner/JaScm�̏ꍇ
					else{
						if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
				}
			}
			// ���Ӑ�R�[�h��NULL�̏ꍇ�A�e�[�u��[�󒍊Ǘ�]�܂���[�m���]����擾
			else{
				List custCdList = new ArrayList();
				
				// Explanner/J�̏ꍇ
	    		if(EXPLANNER_J.equals(_option_id)){
					if(!entity.mcheckT_ODR_J.check(conn, struct)){
						setErrorMessage("KQ00341");
						return;
					}
					custCdList = entity.mselectCUST_CD_J.read(conn, struct);
				}
				// Explanner/Ja�̏ꍇ
	    		else if(EXPLANNER_JA.equals(_option_id)){
					if(!entity.mcheckT_ODR_JA.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_JA.read(conn, struct);
				}
				// Explanner/Jf�̏ꍇ
	    		else if(EXPLANNER_JF.equals(_option_id)){
					if(!entity.mcheckT_ODR_JF.check(conn, struct)){
						setErrorMessage("KQ00349");
						return;
					}
					custCdList = entity.mselectCUST_CD_JF.read(conn, struct);
				}
				// Explanner/JaScm�̏ꍇ
				else{
					if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_SCM.read(conn, struct);
				}
	    		KQ0090010Struct custCdStruct = (KQ0090010Struct)custCdList.get(0);
	    		custCdStruct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    		custList = entity.mselectM_CUST.read(conn, custCdStruct);
			}
			
			// ���Ӑ���̎擾
			KQ0090010Struct custStruct = (KQ0090010Struct)custList.get(0);
			
			if(!DBCheck(_option_id, struct, custStruct)){
				return;
			}
			
			// KQ00345�y���Ӑ�R�[�h�������͂��߁A���󒍏��̓��Ӑ�R�[�h��ݒ肵�܂����B�z
			if(struct.getCUST_CD() == null || "".equals(struct.getCUST_CD())){
				setWarningMessage("KQ00345");
				struct.setCUST_CD(custStruct.getCUST_CD());
				struct.setCUST_ANAME(custStruct.getCUST_ANAME());
			}
			//Add nec 20140613 str
			// �󒍒S������̎擾
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    	List custCheckList = entity.mcheckM_CUST.read(conn, struct);
			
			if(EXPLANNER_J.equals(_option_id) && !custCheckList.isEmpty()){
				//�󒍒S������ƒS���҂̎擾
				struct.setl_OWN_PERSON_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_PERSON_CD());
				struct.setl_OWN_ORG_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD());
			}
			
			// EJ�̏ꍇ ���� �p�����[�^�u�󒍏��F�v��1�̎�
			if (EXPLANNER_J.equals(_option_id) && "1".equals(struct.geth_APR_ODR())) {

				// �󒍒S�����呶�݃`�F�b�N				
				if(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD() == null || "".equals(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD())){
					setErrorMessage("KQ00335");
					return;
				}
				// �y�󒍏��F�˗������z�����s����
				ApprProc.execInsertProcess(conn, struct, this);
				appSucessFlg = true;
			}

			if (appSucessFlg) {
				/** ���F�˗��������b�Z�W�[���o��*/
		    	setAppErrorMessage("AZ00042");
				conn.commit();
				// ��ʃN���A
				controlClear();
				
			//���F�Ȃ��̏ꍇ�A�o�^������
			} else {
				
			//Add nec 20140613 end
				
			// [��݌Ɏ�]�֒ǉ�����B
			// �i�ږ�
			setItemName(struct);
			// �󒍔ԍ�
			String strOdrNo = ((KQ0090010Struct)entity.mselectSEQ.read(conn, struct).get(0)).getw_SEQ();
			struct.setw_SEQ(strOdrNo);
			// ���s�S���҃R�[�h
			struct.setSYS_USER_CD(sysUSER_CD);
			// �ʉ݃R�[�h
			struct.setw_CURRNCY_CD(custStruct.getw_CURRNCY_CD());
			// �ב֎��
			struct.setw_EXCH_TYP(custStruct.getw_EXCH_TYP());
			// �󒍋��z(�M��)
			struct.setw_ODR_AMOUNT_EXCH_RATES(exchAmount(struct.getODR_AMOUNT(), custStruct, _option_id));
			// ����œK�p�敪
			struct.setw_TAX_APPLY_TYP(custStruct.getw_TAX_APPLY_TYP());
			// ����Ōv�Z�敪
			struct.setw_TAX_CALC_TYP(custStruct.getw_TAX_CALC_TYP());
			// ���z�󒍃t���O
			struct.setw_ADD_ODR_FLG("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0");
			
			struct.setsUser_ID(sysUSER_CD);       //Add 20140618 Nec 
				
			entity.minsertT_ODR_UNSTOCK.create(conn, struct);
			
			conn.commit();
			
			struct.setODR_NO(strOdrNo);
			// �ēǍ�
			controlSelect();
			}
			
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		List custList = new ArrayList();
		KQ0090010Struct custStruct = new KQ0090010Struct();
		
		try {
			conn.beginTrans();
			//move 20140617 NEC str
			// �S���R�[�h�̓o�^����
			boolean appSucessFlg = false;

			// (Explanner/J�̏ꍇ�����F�̂��߁A�Ď擾)
			if(EXPLANNER_J.equals(_option_id)){
				try{
					//���ЃR�[�h�h���擾����B
					_sysCompanyCd = SystemInformation.getSysMyCompanyCd();
					if(_sysCompanyCd == null || "".equals(_sysCompanyCd)){
						setErrorMessage("KQ00039");
						throw new ExpjException("KQ00039");
					}
				} catch (FoundationException e) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
				
			}
			
			//move 20140617 NEC end
			
			// KQ00014 �y���Ӑ�R�[�h���}�X�^�ɑ��݂��܂���B�z
			if(struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())){
				custList = entity.mselectM_CUST.read(conn, struct);
				if(custList.isEmpty()){
					struct.setCUST_ANAME("");
					setErrorMessage("KQ00014");
					return;
				}
				
				// ���󒍔ԍ��̃`�F�b�N
				if(struct.getORGN_ODR_NO() != null && !"".equals(struct.getORGN_ODR_NO())){
					// Explanner/J�̏ꍇ
		    		if(EXPLANNER_J.equals(_option_id)){
						if(!entity.mcheckT_ODR_J.check(conn, struct)){
							setErrorMessage("KQ00341");
							return;
						}
					}
					// Explanner/Ja�̏ꍇ
		    		else if(EXPLANNER_JA.equals(_option_id)){
						if(!entity.mcheckT_ODR_JA.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
					// Explanner/Jf�̏ꍇ
		    		else if(EXPLANNER_JF.equals(_option_id)){
						if(!entity.mcheckT_ODR_JF.check(conn, struct)){
							setErrorMessage("KQ00349");
							return;
						}
					}
					// Explanner/JaScm�̏ꍇ
					else{
						if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
				}
			}
			else{
				List custCdList = new ArrayList();
				// Explanner/J�̏ꍇ
	    		if(EXPLANNER_J.equals(_option_id)){
					if(!entity.mcheckT_ODR_J.check(conn, struct)){
						setErrorMessage("KQ00341");
						return;
					}
					custCdList = entity.mselectCUST_CD_J.read(conn, struct);
				}
				// Explanner/Ja�̏ꍇ
	    		else if(EXPLANNER_JA.equals(_option_id)){
					if(!entity.mcheckT_ODR_JA.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_JA.read(conn, struct);
				}
				// Explanner/Jf�̏ꍇ
	    		else if(EXPLANNER_JF.equals(_option_id)){
					if(!entity.mcheckT_ODR_JF.check(conn, struct)){
						setErrorMessage("KQ00349");
						return;
					}
					custCdList = entity.mselectCUST_CD_JF.read(conn, struct);
				}
				// Explanner/JaScm�̏ꍇ
				else{
					if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_SCM.read(conn, struct);
				}
	    		KQ0090010Struct custCdStruct = (KQ0090010Struct)custCdList.get(0);
	    		custCdStruct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    		custList = entity.mselectM_CUST.read(conn, custCdStruct);
			}
			
			// ���Ӑ���̎擾
			custStruct = (KQ0090010Struct)custList.get(0);
			if(!DBCheck(_option_id, struct, custStruct)){
				return;
			}
			
			// KQ00342�y������т����݂���̂ōX�V�ł��܂���B�z
			if(EXPLANNER_JF.equals(_option_id)){
				if(entity.mcheckT_SALES_JF.check(conn, struct)){
					setErrorMessage("KQ00342");
					return;
				}
			}
			else{
				if(entity.mcheckT_SALES.check(conn, struct)){
					setErrorMessage("KQ00342");
					return;
				}
			}
			// Explanner/Ja��Explanner/JaScm�̏ꍇ
			if(EXPLANNER_JA.equals(_option_id) || EXPLANNER_JASCM.equals(_option_id)){
				if(entity.mcheckT_SALES_TEMP.check(conn, struct)){
					setErrorMessage("KQ00342");
					return;
				}
			}
			
			// �r���`�F�b�N
			List modifyList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
			if(modifyList == null || modifyList.isEmpty()){
				setErrorMessage("KQ00055");
				return;
			}
			if(!struct.geth_MODIFY_COUNT().equals(((KQ0090010Struct)modifyList.get(0)).geth_MODIFY_COUNT())){
				setErrorMessage("KQ00055");
				return;
			}
			
			// KQ00345�y���Ӑ�R�[�h�������͂��߁A���󒍏��̓��Ӑ�R�[�h��ݒ肵�܂����B�z
			if(struct.getCUST_CD() == null || "".equals(struct.getCUST_CD())){
				setWarningMessage("KQ00345");
				struct.setCUST_CD(custStruct.getCUST_CD());
				struct.setCUST_ANAME(custStruct.getCUST_ANAME());
			}
			//Add nec 20140613 str
			// �󒍒S������̎擾
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    	List custCheckList = entity.mcheckM_CUST.read(conn, struct);
			
			if(EXPLANNER_J.equals(_option_id) && !custCheckList.isEmpty()){
				//�󒍒S������ƒS���҂̎擾
				struct.setl_OWN_PERSON_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_PERSON_CD());
				struct.setl_OWN_ORG_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD());
			}
			
			// EJ�̏ꍇ ���� �p�����[�^�u�󒍏��F�v��1�̎�
			if (EXPLANNER_J.equals(_option_id) && "1".equals(struct.geth_APR_ODR())) {

				// �󒍒S�����呶�݃`�F�b�N				
				if(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD() == null || "".equals(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD())){
					setErrorMessage("KQ00335");
					return;
				}
				
				// �y�󒍏��F�˗������z�����s����
				ApprProc.execUpdateProcess(conn, struct, this,"2");
				appSucessFlg = true;
			}

			if (appSucessFlg) {
				/** ���F�˗��������b�Z�W�[���o��*/
		    	setAppErrorMessage("AZ00042");
				conn.commit();
				// ��ʃN���A
				controlClear();
				
			//���F�Ȃ��̏ꍇ�A�o�^������
			} else {
			//Add nec 20140613 end
			
			// [��݌Ɏ�]�̍X�V
			// �i�ږ�
			setItemName(struct);
			// �ʉ݃R�[�h
			struct.setw_CURRNCY_CD(custStruct.getw_CURRNCY_CD());
			// �ב֎��
			struct.setw_EXCH_TYP(custStruct.getw_EXCH_TYP());
			// ����œK�p�敪
			struct.setw_TAX_APPLY_TYP(custStruct.getw_TAX_APPLY_TYP());
			// ����Ōv�Z�敪
			struct.setw_TAX_CALC_TYP(custStruct.getw_TAX_CALC_TYP());
			// �󒍋��z(�M��)
			struct.setw_ODR_AMOUNT_EXCH_RATES(exchAmount(struct.getODR_AMOUNT(), custStruct, _option_id));
			// ���z�󒍃t���O
			struct.setw_ADD_ODR_FLG("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0");
			
			struct.setsUser_ID(sysUSER_CD);    //Add 20140618 Nec 
				
			entity.mupdateT_ODR_UNSTOCK.update(conn, struct);
				
			//�R�����g
			conn.commit();
			
			// �ēǍ�
			controlSelect();
			}
			
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
		try {
			// �S���R�[�h�̓o�^����
			boolean appSucessFlg = false;
			
			conn.beginTrans();
			
			// KQ00343�y������т����݂���̂ō폜�ł��܂���B�z
			if(EXPLANNER_JF.equals(_option_id)){
				if(entity.mcheckT_SALES_JF.check(conn, struct)){
					setErrorMessage("KQ00343");
					return;
				}
			}
			else{
				if(entity.mcheckT_SALES.check(conn, struct)){
					setErrorMessage("KQ00343");
					return;
				}
			}
			// Explanner/Ja��Explanner/JaScm�̏ꍇ
			if(EXPLANNER_JA.equals(_option_id) || EXPLANNER_JASCM.equals(_option_id)){
				if(entity.mcheckT_SALES_TEMP.check(conn, struct)){
					setErrorMessage("KQ00343");
					return;
				}
			}
			//Add nec 20140613 str
			// �󒍒S������̎擾
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    	List custCheckList = entity.mcheckM_CUST.read(conn, struct);
			
			if(EXPLANNER_J.equals(_option_id) && !custCheckList.isEmpty()){
				//�󒍒S������ƒS���҂̎擾
				struct.setl_OWN_PERSON_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_PERSON_CD());
				struct.setl_OWN_ORG_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD());
			}
			
			// EJ�̏ꍇ ���� �p�����[�^�u�󒍏��F�v��1�̎�
			if (EXPLANNER_J.equals(_option_id) && "1".equals(struct.geth_APR_ODR())) {

				// �󒍒S�����呶�݃`�F�b�N				
				if(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD() == null || "".equals(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD())){
					setErrorMessage("KQ00335");
					return;
				}
				
				// �y�󒍏��F�˗������z�����s����
				ApprProc.execUpdateProcess(conn, struct, this,"3");
				appSucessFlg = true;
			}

			if (appSucessFlg) {
				/** ���F�˗��������b�Z�W�[���o��*/
		    	setAppErrorMessage("AZ00042");
				conn.commit();
				// ��ʃN���A
				controlClear();
				
			//���F�Ȃ��̏ꍇ�A�o�^������
			} else {
			//Add nec 20140613 end
			
			// �r���`�F�b�N
			List modifyList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
			if(modifyList == null || modifyList.isEmpty()){
				setErrorMessage("KQ00055");
				return;
			}
			if(!struct.geth_MODIFY_COUNT().equals(((KQ0090010Struct)modifyList.get(0)).geth_MODIFY_COUNT())){
				setErrorMessage("KQ00055");
				return;
			}
			struct.setsUser_ID(sysUSER_CD);    //Add 20140618 Nec 
				
			entity.mdeleteT_ODR_UNSTOCK.update(conn, struct);
			
			//�R�����g
			conn.commit();
			
			// �ēǍ�
			controlClear();
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		//Add Anken Start 20140416 shang-j
		_ClearFlg = "1";
		//Add Anken End   20140416 shang-j
		struct.initialize();
		controlRELOAD();
		
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���󒍏��擾�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlGetDefault() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlGetDefault");
			//{{user_implement_dev:<controlGetDefault>
		List defaultList = new ArrayList();
		try {
			// Explanner/J�̏ꍇ
    		if(EXPLANNER_J.equals(_option_id)){
    			defaultList = entity.mselectDEFAULT_J.read(conn, struct);
    			if(defaultList.isEmpty()){
    				setErrorMessage("KQ00341");
    				return;
    			}
			}
			// Explanner/Ja�̏ꍇ
    		else if(EXPLANNER_JA.equals(_option_id)){
				defaultList = entity.mselectDEFAULT_JA.read(conn, struct);
				if(defaultList.isEmpty()){
					setErrorMessage("KQ00348");
					return;
				}
			}
			// Explanner/Jf�̏ꍇ
    		else if(EXPLANNER_JF.equals(_option_id)){
				defaultList = entity.mselectDEFAULT_JF.read(conn, struct);
				if(defaultList.isEmpty()){
					setErrorMessage("KQ00349");
					return;
				}
			}
			// Explanner/JaScm�̏ꍇ
    		else{
				defaultList = entity.mselectDEFAULT_SCM.read(conn, struct);
				if(defaultList.isEmpty()){
					setErrorMessage("KQ00348");
					return;
				}
			}
			
			KQ0090010Struct defaultStruct = (KQ0090010Struct)defaultList.get(0);
			
			// �������ʂ���ʂɐݒ�
			// �󒍓�
			struct.setODR_ACPT_DATE(defaultStruct.getODR_ACPT_DATE());
			// ���Ӑ撍���ԍ�
			struct.setCUST_ODR_NO(defaultStruct.getCUST_ODR_NO());
			// ���Ӑ�R�[�h
			struct.setCUST_CD(defaultStruct.getCUST_CD());
			// ���Ӑ於
			struct.setCUST_ANAME(defaultStruct.getCUST_ANAME());
			// �c�ƒS���҃R�[�h
			struct.setCUST_CHRG_PSN_CD(defaultStruct.getCUST_CHRG_PSN_CD());
			// �c�ƒS���Җ�
			struct.setUSER_NAME(defaultStruct.getUSER_NAME());
			// �w��[��
			struct.setDESINATED_DLV_DATE(defaultStruct.getDESINATED_DLV_DATE());
			// �󒍐���
			struct.setODR_QTY(defaultStruct.getODR_QTY());
			// ����ŃR�[�h
			struct.setTAX_CD(defaultStruct.getTAX_CD());
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlGetDefault>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlGetDefault");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		struct.initialize();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			List optionIdList = new ArrayList();
			List resultList = new ArrayList();
			// �����ꍀ�ڎ擾�Ή�
            String locale = CoreTools.getLocale(sysUSER_CD);
            String property = "OrteusUserDic";
            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
            
			// [�C���X�g�[���I�v�V����]���I�v�V�����̎��ʎq���擾����B
            struct.setw_OPTION_ID(EXPLANNER_JASCM);
			optionIdList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
			if(!optionIdList.isEmpty()){
				_option_id = EXPLANNER_JASCM;
				struct.setw_OPTION_ID(_option_id);
				// ���󒍊Ǘ��ԍ�
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
			}
			else{
				struct.setw_OPTION_ID(EXPLANNER_JF);
				optionIdList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
				if(!optionIdList.isEmpty()){
					_option_id = EXPLANNER_JF;
					struct.setw_OPTION_ID(_option_id);
					// ���󒍓`�[�ԍ�
					struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_2", resource));
				}
				else{
					struct.setw_OPTION_ID(EXPLANNER_JA);
					optionIdList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
					if(!optionIdList.isEmpty()){
						_option_id = EXPLANNER_JA;
						struct.setw_OPTION_ID(_option_id);
						// ���󒍊Ǘ��ԍ�
						struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
					}
					else{
						_option_id = EXPLANNER_J;
						struct.setw_OPTION_ID(_option_id);
						// ���󒍔ԍ�
						struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO", resource));
					}
				}
			}
			
			// ���ЃR�[�h�h���擾����B(Explanner/JaScm�ȊO�̏ꍇ)
			if(!EXPLANNER_JASCM.equals(_option_id)){
				try{
					_sysCompanyCd = SystemInformation.getSysMyCompanyCd();
					if(_sysCompanyCd == null || "".equals(_sysCompanyCd)){
						setErrorMessage("KQ00039");
						throw new ExpjException("KQ00039");
					}
				} catch (FoundationException e) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
			}
			// �u���O�C�����[�U�̏�����ЃR�[�h�v�̎擾���s���B(Explanner/JaScm�̏ꍇ)
			else{
				struct.setsysPLANT_CD(sysPLANT_CD);
				_sysCompanyCd = ((KQ0090010Struct)entity.mselectM_PLANT.read(conn, struct).get(0)).getsysCOMPANY_CD();
			}
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
			
			// ���t�v�Z�p�H��R�[�h���擾����B
			if(EXPLANNER_J.equals(_option_id)){
				struct.setw_SYS_CLASS("SALES");
			}
			else if(EXPLANNER_JF.equals(_option_id)){
				struct.setw_SYS_CLASS("FD_SALES");
			}
			else{
				struct.setw_SYS_CLASS("MP_SALES");
			}
			List sysClassCodeList = entity.mselectSYS_CLASS_CODE.read(conn, struct);
			if(sysClassCodeList.isEmpty()){
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			// �Ɩ��^�p�����擾����B
			String sysBusinessOprDate = DateCtrl.getBusinessOprDate(conn, ((KQ0090010Struct)sysClassCodeList.get(0)).getw_PLANT_CD());
			if(sysBusinessOprDate == null || "".equals(sysBusinessOprDate)){
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			struct.seth_BUSINESS_OPR_DATE(sysBusinessOprDate);
			// �󒍓�
			struct.setODR_ACPT_DATE(sysBusinessOprDate);
			
			// �i�ڔԍ��̊���l���擾����B
			struct.setNAME("UNSTOCK_ITEM_NAME");  ////Add nec 20140613
			List sysParameterList = entity.mselectSYS_PARAMETER.read(conn, struct);
			if(sysParameterList.isEmpty()){
				setErrorMessage("KQ00340");
				throw new ExpjException("KQ00340");
			}
			_itemNameDefault = ((KQ0090010Struct)sysParameterList.get(0)).getw_VALUE();
			if(_itemNameDefault == null || "".equals(_itemNameDefault)){
				setErrorMessage("KQ00340");
				throw new ExpjException("KQ00340");
			}
			// �i�ږ�
			struct.setITEM_NAME("");
			readStatus = INITIAL;
			//Add Anken Start 20140416 shang-j
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if( EXPLANNER_J.equals(_option_id) && !"1".equals(_ClearFlg)){
				if (isScreenMove() == true) {
					// �����̃R���g���[�����\�b�h���Ăяo���܂��B
					controlSelect();
				}
			}
			_ClearFlg = "0";
			//Add Anken End   20140416 shang-j
			//Add nec 20140613 str 
			// �󒍏��F
			struct.setNAME("APR_ODR");
			resultList = entity.mselectSYS_PARAMETER.read(conn, struct);
			if (resultList.isEmpty()) {
		        // �����ꍀ�ڎ擾�Ή�
				ExpjMessage message = new ExpjMessage("AZ00041", CoreTools.getRBString("Expj.Cmt6707",resource));
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_APR_ODR = ((KQ0090010Struct)resultList.get(0)).getw_VALUE();
				//EXPLANNER_J ���� ���F�p�����[�^=�P �ꍇ �̂݁A�󒍏��F�@�\���s���܂�
				if (EXPLANNER_J.equals(_option_id) && "1".equals(_APR_ODR) ) {
					struct.seth_APR_ODR(_APR_ODR);
				} else {
					_APR_ODR = "0";
					struct.seth_APR_ODR("0");
				}
				
			}
			//Add nec 20140613 end
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("GetDefault") ) {
				controlGetDefault();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// ���x���u���󒍔ԍ��v�̐ݒ�
			// �����ꍀ�ڎ擾�Ή�
            String locale = CoreTools.getLocale(sysUSER_CD);
            String property = "OrteusUserDic";
            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
            
			if(EXPLANNER_JASCM.equals(_option_id) || EXPLANNER_JA.equals(_option_id)){
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
			}
			else if(EXPLANNER_JF.equals(_option_id)){
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_2", resource));
			}
			else{
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO", resource));
			}
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KQ0090010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0090010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KQ0090010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0090010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KQ0090010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0090010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KQ0090010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KQ0090010Entity entity;
	protected KQ0090010Struct struct;
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

		entity = new KQ0090010Entity();
		struct = new KQ0090010Struct();

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
	 * KQ0090010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0090010Control() throws BusinessProcessException, FoundationException
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
				KQ0090010Struct key = (KQ0090010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("chkADD_ODR_FLG") && key.getchkADD_ODR_FLG() != null) {
					msgKey.setKeyValue("chkADD_ODR_FLG", key.getchkADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT") && key.getCUR_UNIT_AMOUNT() != null) {
					msgKey.setKeyValue("CUR_UNIT_AMOUNT", key.getCUR_UNIT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO") && key.getlbORGN_ODR_NO() != null) {
					msgKey.setKeyValue("lbORGN_ODR_NO", key.getlbORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ODR") && key.geth_APR_ODR() != null) {
					msgKey.setKeyValue("h_APR_ODR", key.geth_APR_ODR());
				}
				if(msgKeyType.containsKeyColumn("APPROVED_COMMENT") && key.getAPPROVED_COMMENT() != null) {
					msgKey.setKeyValue("APPROVED_COMMENT", key.getAPPROVED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_TYP") && key.geth_ODR_TYP() != null) {
					msgKey.setKeyValue("h_ODR_TYP", key.geth_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE") && key.getl_h_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_h_ESTIMATE_TYPE", key.getl_h_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OPTION_ID") && key.getw_OPTION_ID() != null) {
					msgKey.setKeyValue("w_OPTION_ID", key.getw_OPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("sysCOMPANY_CD") && key.getsysCOMPANY_CD() != null) {
					msgKey.setKeyValue("sysCOMPANY_CD", key.getsysCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("sysPLANT_CD") && key.getsysPLANT_CD() != null) {
					msgKey.setKeyValue("sysPLANT_CD", key.getsysPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SYS_CLASS") && key.getw_SYS_CLASS() != null) {
					msgKey.setKeyValue("w_SYS_CLASS", key.getw_SYS_CLASS());
				}
				if(msgKeyType.containsKeyColumn("w_VALUE") && key.getw_VALUE() != null) {
					msgKey.setKeyValue("w_VALUE", key.getw_VALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("ORGN_ODR_NO") && key.getORGN_ODR_NO() != null) {
					msgKey.setKeyValue("ORGN_ODR_NO", key.getORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("w_ADD_ODR_FLG") && key.getw_ADD_ODR_FLG() != null) {
					msgKey.setKeyValue("w_ADD_ODR_FLG", key.getw_ADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE") && key.getCUR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("CUR_UNIT_PRICE", key.getCUR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("w_SEQ") && key.getw_SEQ() != null) {
					msgKey.setKeyValue("w_SEQ", key.getw_SEQ());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_COMPANY_CODE") && key.geth_SYS_COMPANY_CODE() != null) {
					msgKey.setKeyValue("h_SYS_COMPANY_CODE", key.geth_SYS_COMPANY_CODE());
				}
				if(msgKeyType.containsKeyColumn("SYS_USER_CD") && key.getSYS_USER_CD() != null) {
					msgKey.setKeyValue("SYS_USER_CD", key.getSYS_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CURRNCY_CD") && key.getw_CURRNCY_CD() != null) {
					msgKey.setKeyValue("w_CURRNCY_CD", key.getw_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_EXCH_TYP") && key.getw_EXCH_TYP() != null) {
					msgKey.setKeyValue("w_EXCH_TYP", key.getw_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_AMOUNT_EXCH_RATES") && key.getw_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("w_ODR_AMOUNT_EXCH_RATES", key.getw_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_APPLY_TYP") && key.getw_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("w_TAX_APPLY_TYP", key.getw_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_CALC_TYP") && key.getw_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("w_TAX_CALC_TYP", key.getw_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_DETAIL_ROUND_TYP") && key.getw_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("w_DETAIL_ROUND_TYP", key.getw_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_USER_CD") && key.getw_USER_CD() != null) {
					msgKey.setKeyValue("w_USER_CD", key.getw_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("w_DECIMAL_FIG") && key.getw_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("w_DECIMAL_FIG", key.getw_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("haveFlag") && key.gethaveFlag() != null) {
					msgKey.setKeyValue("haveFlag", key.gethaveFlag());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CUST_CD") && key.getw_CUST_CD() != null) {
					msgKey.setKeyValue("w_CUST_CD", key.getw_CUST_CD());
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
					KQ0090010Struct key = new KQ0090010Struct();
					if(msgKeyType.containsKeyColumn("chkADD_ODR_FLG")) {
						key.setchkADD_ODR_FLG(msgKey.getKeyValue("chkADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT")) {
						key.setCUR_UNIT_AMOUNT(msgKey.getKeyValue("CUR_UNIT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO")) {
						key.setlbORGN_ODR_NO(msgKey.getKeyValue("lbORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ODR")) {
						key.seth_APR_ODR(msgKey.getKeyValue("h_APR_ODR"));
					}
					if(msgKeyType.containsKeyColumn("APPROVED_COMMENT")) {
						key.setAPPROVED_COMMENT(msgKey.getKeyValue("APPROVED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_TYP")) {
						key.seth_ODR_TYP(msgKey.getKeyValue("h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE")) {
						key.setl_h_ESTIMATE_TYPE(msgKey.getKeyValue("l_h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OPTION_ID")) {
						key.setw_OPTION_ID(msgKey.getKeyValue("w_OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("sysCOMPANY_CD")) {
						key.setsysCOMPANY_CD(msgKey.getKeyValue("sysCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("sysPLANT_CD")) {
						key.setsysPLANT_CD(msgKey.getKeyValue("sysPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SYS_CLASS")) {
						key.setw_SYS_CLASS(msgKey.getKeyValue("w_SYS_CLASS"));
					}
					if(msgKeyType.containsKeyColumn("w_VALUE")) {
						key.setw_VALUE(msgKey.getKeyValue("w_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_ODR_NO")) {
						key.setORGN_ODR_NO(msgKey.getKeyValue("ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_ADD_ODR_FLG")) {
						key.setw_ADD_ODR_FLG(msgKey.getKeyValue("w_ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE")) {
						key.setCUR_UNIT_PRICE(msgKey.getKeyValue("CUR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_SEQ")) {
						key.setw_SEQ(msgKey.getKeyValue("w_SEQ"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_COMPANY_CODE")) {
						key.seth_SYS_COMPANY_CODE(msgKey.getKeyValue("h_SYS_COMPANY_CODE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_USER_CD")) {
						key.setSYS_USER_CD(msgKey.getKeyValue("SYS_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CURRNCY_CD")) {
						key.setw_CURRNCY_CD(msgKey.getKeyValue("w_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_EXCH_TYP")) {
						key.setw_EXCH_TYP(msgKey.getKeyValue("w_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_AMOUNT_EXCH_RATES")) {
						key.setw_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("w_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_APPLY_TYP")) {
						key.setw_TAX_APPLY_TYP(msgKey.getKeyValue("w_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_CALC_TYP")) {
						key.setw_TAX_CALC_TYP(msgKey.getKeyValue("w_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_DETAIL_ROUND_TYP")) {
						key.setw_DETAIL_ROUND_TYP(msgKey.getKeyValue("w_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_USER_CD")) {
						key.setw_USER_CD(msgKey.getKeyValue("w_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_DECIMAL_FIG")) {
						key.setw_DECIMAL_FIG(msgKey.getKeyValue("w_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("haveFlag")) {
						key.sethaveFlag(msgKey.getKeyValue("haveFlag"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CUST_CD")) {
						key.setw_CUST_CD(msgKey.getKeyValue("w_CUST_CD"));
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
