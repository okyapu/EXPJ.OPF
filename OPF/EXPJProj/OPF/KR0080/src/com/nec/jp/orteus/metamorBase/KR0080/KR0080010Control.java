/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0080/src/com/nec/jp/orteus/metamorBase/KR0080/KR0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0080;

import com.nec.jp.orteus.metamorBase.KR0080.*;
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
	//TODO: ������import�p�b�P�[�W���L�q���Ă�������
import java.math.BigDecimal;
import com.nec.jp.orteus.expj.sa.amount.SaAmountCalculator;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KR0080010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.2 $ $Date: 2015/11/16 05:14:46 $
 *
 */
//}}user_implement_code_header

public class KR0080010Control
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
	//�f�t�H���g�A�N�Z�T���\�b�h
	protected List list;											//���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }						//���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	//���X�g���Z�b�g���܂��B
	public int getListsize() {										//���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	//���X�g�̒l��Ԃ��܂��B
	public KR0080010Struct getListvalue(int x) { return (KR0080010Struct)(this.list.get(x)); }	//���X�g�̒l��Ԃ��܂��B
	public KR0080010Struct getStruct() { return this.struct; }	//Struct�̒l��Ԃ��܂��B
	public KR0080010Struct createStruct() { return new KR0080010Struct(); }	//�V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KR0080010Struct)structname); }	//Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	//Struct�̒l�����������܂��B

	//CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	
	/** �̔ԗp�̍H��R�[�h */
    protected String salesPLANT_CD;
    public void setSalesPLANT_CD(String name) { this.salesPLANT_CD = name; };
    public String getSalesPLANT_CD() { return this.salesPLANT_CD; };
    //----- �V�X�e���ݒ�l�擾 ---------------	
	private PrivateConfig privateConfig;
    //----- �V�X�e���ݒ�l�擾 ---------------		
	
	/** �I�����F */
	String aprSales = "";	
	
	/** �ʉݏ������� */
    private int decimalFig = 0;
	private String _businessOprDate = null; //�Ɩ��^�p��
	/**
	 * �Ɩ��^�p���ݒ�
	 * 
	 * @param businessOprDate
	 *            �Ɩ��^�p��
	 */
	public void setBusinessOprDate(String businessOprDate) {
		_businessOprDate = businessOprDate;
	}
	/**
	 * �Ɩ��^�p���擾
	 * 
	 * @return String
	 */
	public String getBusinessOprDate() {
		return _businessOprDate;
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
     * Struct�̒l���Z�b�g���܂��B
     * @param s ���������f�[�^
     */
    private void setStruct(KR0080010Struct s) {
    	
     struct.setSLIP_CD(s.getSLIP_CD());
     struct.setSLIP_TRN_CD(s.getSLIP_CD());
     struct.setPROJECT_CD(s.getPROJECT_CD());     
     struct.setPROJECT_NAME(s.getPROJECT_NAME()); 
     struct.setESTIMATE_NO(s.getESTIMATE_NO());
     struct.setDETAIL_NO(s.getDETAIL_NO());
     struct.setSALSE_MODIFY_COUNT(s.getSALSE_MODIFY_COUNT());
     struct.setITEM_NAME(s.getITEM_NAME());
     struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
     struct.setSALES_DATE(s.getSALES_DATE());
     struct.setSALES_DEPT_CD(s.getSALES_DEPT_CD());
     struct.setSALES_DEPT_NAME(s.getSALES_DEPT_NAME());
     struct.setCUST_CHRG_PSN_CD(s.getCUST_CHRG_PSN_CD());
     struct.setCUST_CHRG_PSN_NAME(s.getCUST_CHRG_PSN_NAME());
     struct.setSALES_QTY(s.getSALES_QTY());
     struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
     struct.setSALES_UNIT_PRICE(s.getSALES_UNIT_PRICE());
     struct.seth_SALES_UNIT_PRICE(s.getSALES_UNIT_PRICE());
     struct.setCUR_UNIT(s.getCUR_UNIT());
     struct.setSALES_AMOUNT(s.getSALES_AMOUNT());
     struct.setSALES_AMOUNT_YEN(s.getSALES_AMOUNT_YEN());
     struct.setTAX_CD(s.getTAX_CD());
     struct.setREMARKS(s.getREMARKS());
     struct.setWORK_REMARKS(s.getWORK_REMARKS());
     struct.setWORK_DATE(s.getWORK_DATE());
     struct.setWORK_TIME(s.getWORK_TIME());
     struct.setPAY_RATE(s.getPAY_RATE());
     struct.setWORK_PERSON_CD(s.getWORK_PERSON_CD());
     struct.setWORK_PERSON_NAME(s.getWORK_PERSON_NAME());
     struct.setCUST_CD(s.getCUST_CD());
     struct.setCUST_NAME(s.getCUST_NAME());
     struct.setITEM_CD(s.getITEM_CD());
     struct.setITEM_NAME_1(s.getITEM_NAME_1());
     struct.setCUST_ODR_NO(s.getCUST_ODR_NO());
     struct.setDESINATED_DLV_DATE(s.getDESINATED_DLV_DATE());
     struct.setUNSTOCK_MODIFY_COUNT(s.getUNSTOCK_MODIFY_COUNT());
     struct.setHS_CTL_SEQ_CD(s.getHS_CTL_SEQ_CD());
     if("1".equals(s.getJOB_ODR_COMP_FLG())){
    	 struct.setJOB_ODR_COMP_FLG("true");
     }else{
    	 struct.setJOB_ODR_COMP_FLG("false");
     }
     struct.setBUSINESS_OPR_DATE(getBusinessOprDate());
    }
   
    /**
     * Struct�̒l���Z�b�g���܂��B
     * @param s ���������f�[�^
     */
    private void setStructSystemData(KR0080010Struct s) {
     s.setsOraganization_CD(struct.getsOrganization_CD());
     s.setsSysdate(struct.getsSysdate());
     s.setsUser_ID(sysUSER_CD);
     
    }
    /**
	 * �o�^/�X�V�� �ˑ��}�X�^�̃`�F�b�N
	 * ���b�Z�[�W�o�^/�֘A���ڂ̃N���A���s��
	 * @return true:OK / false:NG
	 */
	private boolean existDependsMaster() throws SQLException, FoundationException
	{
		boolean result = true;
		//����S������R�[�h
        List checkList = entity.mM_ORG.read(conn, struct);
        if (checkList.isEmpty()) {
	         setErrorMessage("KA00058");
	         result = false;
        }else{
        	KR0080010Struct orgStruct = (KR0080010Struct) checkList.get(0);
        	//����v�㕔�喼
        	struct.setORG_NAME(orgStruct.getORG_NAME());
        }
        //�c�ƒS���҃R�[�h 
        checkList = entity.mUSER_MST_CUSTCHK.read(conn, struct);
        if (checkList.isEmpty()) {
	         setErrorMessage("KM00048");
	         result = false;
        }else{
        	KR0080010Struct custStruct = (KR0080010Struct) checkList.get(0);
        	//�c�ƒS���Җ�
        	struct.setCUST_CHRG_PSN_NAME(custStruct.getUSER_NAME());
        }
        
        if(!(struct.getWORK_PERSON_CD() == null || "".equals(struct.getWORK_PERSON_CD()))){
        	//��ƒS���҃R�[�h 
            checkList = entity.mUSER_MST_CUSTWORK.read(conn, struct);
            if (checkList.isEmpty()) {
	             setErrorMessage("KM00027");
	             result = false;
            }else{
            	KR0080010Struct workStruct = (KR0080010Struct) checkList.get(0);
            	//��ƒS���Җ�
            	struct.setWORK_PERSON_NAME(workStruct.getUSER_NAME());
            }
        }
        
        //����ŃR�[�h
		checkList = entity.mM_TAX.read(conn, struct);
		if (checkList.isEmpty()) {
			setErrorMessage("AA01001");
			result = false;
		} else {
			KR0080010Struct taxStruct = (KR0080010Struct) checkList.get(0);
			//���ŗ�1
			struct.setTAX_RATE_1(taxStruct.getTAX_RATE_1());
			//���ŗ�2
			struct.setTAX_RATE_2(taxStruct.getTAX_RATE_2());
			//���ŗ�3
			struct.setTAX_RATE_3(taxStruct.getTAX_RATE_3());
			//�[���敪
			struct.setTAX_ROUND_TYP(taxStruct.getTAX_ROUND_TYP());
		}
		//���Ӑ�擾
		List custList = entity.mM_CUST.read(conn, struct);
		if (custList.isEmpty()) {
            setErrorMessage("KA00032");
            result = false;
        }else{
        	KR0080010Struct custStruct = (KR0080010Struct) custList.get(0);
    		//�ʉ݃R�[�h
    		struct.setCURRNCY_CD(custStruct.getCUR_CD());
            //�����敪
    		struct.setINSPC_ACPT_TYP(custStruct.getINSPC_ACPT_TYP());
    		//�ב֎��
    		struct.setEXCH_TYP(custStruct.getEXCH_TYP());
    		//���z�܂�ߋ敪
    		struct.setDETAIL_ROUND_TYP(custStruct.getDETAIL_ROUND_TYP());
        }
		
		//����Ӑ�R�[�h���[���Ӑ�]."����ʉ݃R�[�h"��[�ʉ�]�ɑ��݂��Ȃ��ꍇ
        List curList = entity.mM_CUR.read(conn, struct);
        if (curList.isEmpty()) {
         setErrorMessage("KQ00073");
         result = false;
        } else {
         //�������z��̏�������[�ʉ�]."��������"�𒴂��Ă����ꍇ
         KR0080010Struct curStruct = (KR0080010Struct) curList.get(0);
         this.decimalFig = Integer.parseInt(curStruct.getDECIMAL_FIG());
         if (Calculate.compare(struct.getSALES_QTY(), "0") <= 0
          && Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") <= 0) {
          if (NumberTool.getRealScale(struct.getSALES_AMOUNT())
           > Integer.parseInt(curStruct.getDECIMAL_FIG())) {
           setErrorMessage("KU01003");
           result = false;
          }
         }
        }
		return result;
	}

    /**
     * ��ʂ̏ڍ׍��ڂ����������܂��B
     */
    private void initializeDetail() {
     struct.setSLIP_CD(null);
     struct.setPROJECT_CD(null);
     struct.setPROJECT_NAME(null);
     struct.setJOB_ODR_COMP_FLG("true");
     struct.setESTIMATE_NO(null);
     struct.setDETAIL_NO(null);
     struct.setITEM_NAME(null);
     struct.setSALES_DATE(getBusinessOprDate());
     struct.setSALES_DEPT_CD(null);
     struct.setSALES_DEPT_NAME(null);
     struct.setCUST_CHRG_PSN_CD(null);
     struct.setCUST_CHRG_PSN_NAME(null);
     struct.setSALES_QTY("0");
     struct.setSTOCK_UNIT(null);
     struct.setSALES_UNIT_PRICE("0");
     struct.seth_SALES_UNIT_PRICE("0");
     struct.setCUR_UNIT(null);
     struct.setSALES_AMOUNT("0");
     struct.setSALES_AMOUNT_YEN("0");
     struct.setTAX_CD(null);
     struct.setREMARKS(null);
     struct.setWORK_DATE("");
     struct.setWORK_TIME(null);
     struct.setPAY_RATE("0");
     struct.setWORK_PERSON_CD(null);
     struct.setWORK_PERSON_NAME(null);
     struct.setWORK_REMARKS(null);
     struct.setCUST_CD(null);
     struct.setCUST_NAME(null);
     struct.setITEM_CD(null);
     struct.setITEM_NAME_1(null);
     struct.setCUST_ODR_NO(null);
     struct.setDESINATED_DLV_DATE(null);
     
     struct.seth_CTL_SEQ_CD(null);
     struct.seth_SALES_SEQ_NO(null);
     list = null;
   
     readStatus = INITIAL;
    }
   
    /**
     * �M�݊��Z�B
     * @param amount �Ώۋ��z
     * @param s �X�g���N�g�I�u�W�F�N�g
     * @return �M�݋��z
     * @throws SQLException �������s
     * @throws ExpjException  �������s
     */
    private String exchAmount(String amount, KR0080010Struct s)
     throws SQLException, ExpjException {
   
	     ExchAmount exch = new ExchAmount(conn);
	   
	     boolean result =
	      exch.doExchAmount(
	       amount,
	       s.getCOMPANY_CD(),
	       s.getCURRNCY_CD(),
	       s.getEXCH_TYP(),
	       s.getDETAIL_ROUND_TYP(),
	       s.getSALES_DATE());
	   
	     if (!result) {
	      setErrorMessage("KQ00038");
	      return "0";
	     }
	     double exchAmount = exch.getD_EXCH_AMOUNT();
	     BigDecimal b = new BigDecimal(exchAmount);
	   
	     return b.toString();
    }
    
    /**
     * �V�X�e���p�����[�^�`�F�b�N       
     * @throws SQLException �������s
     * @throws ExpjException �������s
   * @throws FoundationException 
     */
    private boolean blnchkAprSales()
    throws SQLException, ExpjException, FoundationException {
  	  
       /** �p�����[�^�u������я��F�v���擾*/
       privateConfig = new PrivateConfig(conn);
       aprSales = privateConfig.getString("APR_SALES");
       //�p�����[�^�u�������F�v���擾�ł��Ȃ������ꍇ
      if(aprSales == null || "".equals(aprSales)){
			String locale = CoreTools.getLocale(struct.getsUser_ID());
			ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
			setErrorMessage("AZ00041", messages.getString("AZ00074"));
			aprSales = "0";
        	return false;
      }else if(!"1".equals(aprSales)){   	        	  
    	  	//�P�ȊO�̏ꍇ
    	  	return false;
      }else{
    	  	//�P�̏ꍇ
    	  	return true;
      }     	  
    }
    
    /**
     * �V�X�e���p�����[�^�`�F�b�N       
     * @throws SQLException �������s
     * @throws ExpjException �������s
   * @throws FoundationException 
     */
    private void chkAprSales()
    throws SQLException, ExpjException, FoundationException {
  	  String installFlg = "";
        List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
        if(installOptionsList.size() > 0){
      	  installFlg = ((KR0080010Struct)installOptionsList.get(0)).getINSTALL_FLG();
      	  
        }
        if (installOptionsList.isEmpty() || "0".equals(installFlg)) {  
          //���|�Ǘ����C���X�g�[������Ă��Ȃ��B
 	        
          //�p�����[�^�u������я��F�v���擾
          privateConfig = new PrivateConfig(conn);
          aprSales = privateConfig.getString("APR_SALES");
          //�p�����[�^�u������я��F�v���擾�ł��Ȃ������ꍇ
          if(aprSales == null || "".equals(aprSales)){
			String locale = CoreTools.getLocale(struct.getsUser_ID());
			ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
			setErrorMessage("AZ00041", messages.getString("AZ00074"));
			aprSales = "0";
            return;
          }else if(!"1".equals(aprSales)){   	        	  
			  //�P�ȊO�̏ꍇ
        	  aprSales = "0";
          }else{
        	  //�P�̏ꍇ
              aprSales = "1";
          }
          //������я��F��1�F�s���ꍇ
          if("1".equals(aprSales)){
   	          //�`�[�ԍ���[�������]���������A���F�󋵁�1:���F�҂��@�̏ꍇ
   	          List tSalesApprList = entity.mT_SALES_ApprFlg.read(conn,struct);
   	          if(tSalesApprList != null && tSalesApprList.size() > 0){
   	        	  setErrorMessage("KR00025");
   	        	  return;
   	          }   	        	  
          }   
        }
  	  
    }
    
	private KR0080010Struct createDebitRecord()
	         throws FoundationException, SQLException, ExpjException {
			
			KR0080010Struct s = new KR0080010Struct();
	         //����敪:�g4�h (��݌ɕi����)
	         s.setSALES_TYP("4");
	         //���Ӑ�R�[�h
	         s.setCUST_CD(struct.getCUST_CD());
	         //�i�ڔԍ�
	         s.setITEM_CD(struct.getITEM_CD());
	         //�i�ږ���
	         if(struct.getITEM_CD() == null || "".equals(struct.getITEM_CD())){
	        	 //�i�ڔԍ���null�̏ꍇ�́A[���].�g�i�ږ��h
	        	 s.setITEM_NAME(struct.getITEM_NAME());
	         }else{
	        	 //�i�ږ���
	        	 s.setITEM_NAME(struct.getITEM_NAME_1());
	         }
	         //���Ӑ撍���ԍ�
	         s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
	         //����v���
	         s.setSALES_DATE(struct.getSALES_DATE());
	         //����v�㕔��
	         s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
	         //�����R�[�h
	         s.setVEND_CD(null);
	         //�����ꏊ�R�[�h
	         s.setPRD_ODR_PLACE_CD(null);
	         //�c�ƒS���҃R�[�h
	         s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
	         //���s�S���҃R�[�h
	         s.setODR_ACPT_PSN_CD(null);
	         //������ѐ���
	         s.setSALES_QTY(struct.getSALES_QTY());
	         //�P��
	         s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
	         //�i�ڎ擾
			 List itemList = entity.mM_ITEM.read(conn, struct);
			 if(!itemList.isEmpty()){
				KR0080010Struct itemStruct = (KR0080010Struct) itemList.get(0);
				//�P��
		        s.setUNIT_CD(itemStruct.getSTOCK_UNIT());
			 }
	         //������ы��z
	         s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
	         //�ʉ݃R�[�h
	         s.setCURRNCY_CD(struct.getCURRNCY_CD());
	         //������ы��z(�M��)
	         String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
	         if (msgStruct.hasError()) {
	          return s;
	         }
	         s.setSALES_AMOUNT_YEN(salesAmountExchRates);
	         //��̌�����
	         s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
	         //��̌�����
	         s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
	       
	         //�O�őΏۋ��z
	         String externalTaxSalesAmount =
	          SaAmountCalculator.calcExternalTaxSalesAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT());
	         s.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxSalesAmount);
	         //���őΏۋ��z
	         String internalTaxSalesAmount =
	          SaAmountCalculator.calcInternalTaxSalesAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT());
	         s.setINTERNAL_TAX_SALES_AMOUNT(internalTaxSalesAmount);
	         //��ېőΏۋ��z
	         String taxfreeSalesAmount =
	          SaAmountCalculator.calcTaxfreeSalesAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT());
	         s.setTAXFREE_SALES_AMOUNT(taxfreeSalesAmount);
	       
	         //�Ŋz�P
	         String taxAmount1 =
	          SaAmountCalculator.calcTaxAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT(),
	           struct.getTAX_RATE_1(),
	           String.valueOf(this.decimalFig),
	           struct.getTAX_ROUND_TYP());
	         s.setTAX_AMOUNT_1(taxAmount1);
	         //�Ŋz�Q
	         String taxAmount2 =
	          SaAmountCalculator.calcTaxAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT(),
	           struct.getTAX_RATE_2(),
	           String.valueOf(this.decimalFig),
	           struct.getTAX_ROUND_TYP());
	         s.setTAX_AMOUNT_2(taxAmount2);
	         //�Ŋz�R
	         String taxAmount3 =
	          SaAmountCalculator.calcTaxAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT(),
	           struct.getTAX_RATE_3(),
	           String.valueOf(this.decimalFig),
	           struct.getTAX_ROUND_TYP());
	         s.setTAX_AMOUNT_3(taxAmount3);
	         //����Ŋz�i�O�Łj
	         String externalTaxAmount =
	          SaAmountCalculator.calcExternalTaxAmount(
	           struct.getTAX_CD(),
	           s.getTAX_AMOUNT_1(),
	           s.getTAX_AMOUNT_2(),
	           s.getTAX_AMOUNT_3());
	         s.setEXTERNAL_TAX_AMOUNT(externalTaxAmount);
	         //����Ŋz�i���Łj
	         String internalTaxAmount =
	          SaAmountCalculator.calcInternalTaxAmount(
	           struct.getTAX_CD(),
	           s.getTAX_AMOUNT_1(),
	           s.getTAX_AMOUNT_2(),
	           s.getTAX_AMOUNT_3());
	         s.setINTERNAL_TAX_AMOUNT(internalTaxAmount);
	       
	         //�Ŕ�������z
	         String taxCreditSalesAmount =
	          SaAmountCalculator.calcTaxCreditSalesAmount(
	           s.getEXTERNAL_TAX_SALES_AMOUNT(),
	           s.getINTERNAL_TAX_SALES_AMOUNT(),
	           s.getTAXFREE_SALES_AMOUNT(),
	           s.getINTERNAL_TAX_AMOUNT());
	         s.setTAX_CREDIT_SALES_AMOUNT(taxCreditSalesAmount);
	       
	         //�Ŕ�������z�i�M�݁j
	         String taxCreditSalesAmountExchRates = exchAmount(taxCreditSalesAmount, struct);
	         if (msgStruct.hasError()) {
	          return s;
	         }
	         s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(taxCreditSalesAmountExchRates);
	       
	 		 //�����敪
	 		 s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
	         //������ъǗ��ԍ�
	         s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
	         //���`�[�ԍ�
	         s.setORG_SLIP_CD(null);
	         //���l�敪
	         s.setSPCL_PRICE_CO(null);
	         //���l
	         s.setREMARKS(struct.getREMARKS());
	         //��ԋ敪:�g20�h (���|�v��\��)
	         s.setSTATUS("20");
	         //�폜�t���O
	         s.setDEL_FLG("0");
	     	  
	         //�V�X�e���p�����[�^(���F)�`�F�b�N
	    	  if(blnchkAprSales() == true){
	    	  	s.setAPPR_FLG("1");
	    		s.setAPPR_ID(null);
	    		s.setAPPR_DATE(null);
	    	  }else{
	    		s.setAPPR_FLG("3");
	    		s.setAPPR_ID(getsysUSER_CD());
	    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
	    	  }	 
	    	  
	         setStructSystemData(s);
	       
	         return s;
	        }
	
    private KR0080010Struct createCreditRecord() throws ExpjException,FoundationException, SQLException {
        List l = entity.mT_SALES_CreditRecord.read(conn, struct);
	        KR0080010Struct s = (KR0080010Struct) l.get(0);
	        
	      //������ъǗ��ԍ�
	      s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
	        
	      //�V�X�e���p�����[�^(���F)�`�F�b�N
	   	  if(blnchkAprSales() == true){
	   	  	s.setAPPR_FLG("1");
	   		s.setAPPR_ID(null);
	   		s.setAPPR_DATE(null);
	   	  }else{
	   		s.setAPPR_FLG("3");
	   		s.setAPPR_ID(getsysUSER_CD());
	   		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
	   	  }	 
	        setStructSystemData(s);
	      
	        return s;
       }
    
	private KR0080010Struct createServiceRecord()
	         throws FoundationException, SQLException, ExpjException {
			
	         KR0080010Struct s = new KR0080010Struct();
	         //�󒍔ԍ�
	         s.setODR_NO(struct.getODR_NO());
	         //����v���
	         s.setSALES_DATE(struct.getSALES_DATE());
	         //����v�㕔��R�[�h
	         s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
	         //�c�ƒS���҃R�[�h
	         s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
	         //�P��
	         s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
	         //����
	         s.setSALES_QTY(struct.getSALES_QTY());
	         //���z
	         s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
	         //���z�i�M�݁j
	         String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
	         if (msgStruct.hasError()) {
	          return s;
	         }
	         s.setSALES_AMOUNT_YEN(salesAmountExchRates);
	         //����ŃR�[�h
	         s.setTAX_CD(struct.getTAX_CD());
	         //�w��[��
	         s.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());       
	         //���Ӑ撍���ԍ�
	         s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
	         //���Ӑ�R�[�h
	         s.setCUST_CD(struct.getCUST_CD());
	         //�i�ڔԍ�
	         s.setITEM_CD(struct.getITEM_CD());
	         //�i�ږ�
	         s.setITEM_NAME(struct.getITEM_NAME());
	         //���l
	         s.setREMARKS(struct.getREMARKS());
	         //��Ǝ���
	         s.setWORK_TIME(struct.getWORK_TIME());
	         //����
	         s.setPAY_RATE(struct.getPAY_RATE());
	         //��Ɠ�
	         s.setWORK_DATE(struct.getWORK_DATE());
	         //��ƒS���҃R�[�h
	         s.setWORK_PERSON_CD(struct.getWORK_PERSON_CD());
	         //��Ɣ��l
	         s.setWORK_REMARKS(struct.getWORK_REMARKS());
	         s.seth_CTL_SEQ_CD(struct.geth_CTL_SEQ_CD());
	         //�ʉ݃R�[�h
             s.setCURRNCY_CD(struct.getCURRNCY_CD());
	         //�`�[�ԍ�
             s.setSLIP_CD(struct.getSLIP_CD());
	         setStructSystemData(s);
	       
	         return s;
	        }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//[�������]�̍X�V��
			 String salseModifyCount = null;
			 //[��݌Ɏ�]�̍X�V��
			 String unstockModifyCount = null;
			 
			List chkUnstokList = entity.mselsectT_ODR_UNSTOCK.read(conn, struct);
			List chkOdrAlcList = entity.mselectT_PJ_ODR_ALC.read(conn, struct);
			List chkProjectList = entity.mselectT_ESTIMATE_DETAL.read(conn, struct);
			
			 if (chkUnstokList.isEmpty()) {
				//[��݌Ɏ�]�̏�񂪑��݂��Ȃ��ꍇ
				 setErrorMessage("ZZ06001");
				 return;
			 }else if(chkOdrAlcList.isEmpty()){
				 //�󒍔ԍ���[�Č��󒍕R�t]�ɑ��݂��Ȃ��ꍇ
				 setErrorMessage("KM00001");
				 return;
			 }else if(chkProjectList.isEmpty()){
				 //�Č��ԍ���[���ϖ���]�ɑ��݂��Ȃ��ꍇ
				 setErrorMessage("KM00010");
				 return;
			 }
			 
			//[��݌Ɏ�]�̍X�V��
			KR0080010Struct unstokStruct = (KR0080010Struct) chkUnstokList.get(0);
			unstockModifyCount = unstokStruct.getUNSTOCK_MODIFY_COUNT();
				
			 //�𖱎��т���������
			 List serviceDataList = entity.mselectT_SERVICE.read(conn, struct);
			 if(serviceDataList.isEmpty()){
				 //[�𖱎���]�Ƀf�[�^�����݂��Ȃ��ꍇ
				//��ʕ\���p�f�[�^�Ǎ�
                 list = entity.mselectNoData.read(conn, struct);
                 readStatus = NOT_FOUND;
			 }else{
				 KR0080010Struct serviceStruct = (KR0080010Struct) serviceDataList.get(0);
				 struct.seth_CTL_SEQ_CD(serviceStruct.geth_CTL_SEQ_CD());
				 //�`�[�ԍ�
				 struct.setSLIP_TRN_CD(serviceStruct.getSLIP_TRN_CD());
				 //[�𖱎���]�Ƀf�[�^�����݂���ꍇ
				 List sysInstallList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
				 
				 if(!sysInstallList.isEmpty()){
	                  //[���|���g�����w�b�_]������
	                  List arLedgerHTrnList = entity.mselectT_AR_LEDGER_H_TRN.read(conn, struct);
	                  if (arLedgerHTrnList.isEmpty()) {
	                	//[���|�������w�b�_]������
		                  List arLedgerHList = entity.mselectT_AR_LEDGER_H.read(conn, struct);
		                  if (arLedgerHList.isEmpty()) {
			                    setErrorMessage("BD00027");
			                    return;
			              }
	                  } 
	               }
				 List slipCdList = entity.mselectT_SALES.read(conn, struct);
				 if(slipCdList.isEmpty()){
					 //�g�`�[�ԍ��h��[�������]�ɑ��݂��Ȃ��ꍇ
					 setErrorMessage("KM00025");
					 return;
				 }
				 
				 KR0080010Struct slipCdStruct = (KR0080010Struct) slipCdList.get(0);
				 salseModifyCount = slipCdStruct.getSALSE_MODIFY_COUNT();
				 struct.seth_SALES_SEQ_NO(slipCdStruct.geth_SALES_SEQ_NO());
				//��ʕ\���p�f�[�^�Ǎ�
				 list = entity.mselectData.read(conn, struct); 
				 readStatus = NORMAL;
			 }
			 
			 KR0080010Struct formStruct = (KR0080010Struct) list.get(0); 
			 //�X�V��
             formStruct.setSALSE_MODIFY_COUNT(salseModifyCount);
             formStruct.setUNSTOCK_MODIFY_COUNT(unstockModifyCount);
			if( readStatus == NOT_FOUND){
				formStruct.setJOB_ODR_COMP_FLG("1");
			}
			//��ʃf�[�^��ݒ�
             setStruct(formStruct); 
                 
		} catch(SQLException e) {
			//������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);
			throw new ExpjException(e);
			//�G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//�ˑ�����}�X�^�̃`�F�b�N
			if(!existDependsMaster()){
				return;
			}
            
			//[�������]�i���`�j�o�^�p�f�[�^�𐶐�
            KR0080010Struct debitRecordStruct = createDebitRecord();
            if (msgStruct.hasError()) {
                return;
            }
			
	        //������ъǗ��ԍ�(�A��)
            List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
            KR0080010Struct salesSeqNoStruct = (KR0080010Struct) salesSeqNoList.get(0);
            debitRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
            //�`�[�ԍ��������̔�
            Numbering slipCdNum =
            new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
            debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
            
            //[�������]�i���`�j�̓o�^
            entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);
			//�u���|�Ǘ��v�T�u�V�X�e��
            List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
            
	        if (!installOptionsList.isEmpty()) {
				//���|�Ǘ����C���X�g�[������Ă���ꍇ�A���|�Ǘ��T�^�e(���i)�̌ďo
	        	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
	        	tempKZ0010P001.setParameter("6", struct.getsUser_ID(), null, null, debitRecordStruct.getSLIP_CD(), struct.getTAX_CD());
				String msgNo = tempKZ0010P001.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
            //[�𖱎���]�A[�𖱎��ї���]�o�^�p�f�[�^�𐶐�
            KR0080010Struct serviceRecordStruct = createServiceRecord();
            if (msgStruct.hasError()) {
                return;
               }
 
            //�𖱎��ъǗ��ԍ�(�A��)
            List serviceSeqNoList = entity.mSEQ_CTL_SEQ_CD.read(conn, struct);
            KR0080010Struct serviceSeqNoStruct = (KR0080010Struct) serviceSeqNoList.get(0);
            serviceRecordStruct.setCTL_SEQ_CD(serviceSeqNoStruct.getCTL_SEQ_CD());
            //�`�[�ԍ�
            serviceRecordStruct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
            //[�𖱎���]�̓o�^
            entity.mT_SERVICE_CreditRecord.create(conn, serviceRecordStruct);
            //�����Ǘ��ԍ�(�A��)
            List hsServiceSeqNoList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
            KR0080010Struct hsServiceSeqNoStruct = (KR0080010Struct) hsServiceSeqNoList.get(0);
            serviceRecordStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoStruct.getHS_CTL_SEQ_CD());
            //�󒍔ԍ�
            serviceRecordStruct.setODR_NO(struct.getODR_NO());
            //�V���t���O
            serviceRecordStruct.setNEW_OLD_FLG("1");
            //�����敪
            serviceRecordStruct.setTRAN_TYPE("1");
            //�����敪
            serviceRecordStruct.setCRCT_TYP("2");
            //[�𖱎��ї���]�̓o�^
            entity.mHS_T_SERVICE_CreditRecord.create(conn, serviceRecordStruct);
            
            //�g�����t���O�h���A�`�F�b�NOn�̏ꍇ
            if("true".equals(struct.getJOB_ODR_COMP_FLG())){
				// �r������
				List modifyCountList = entity.mselectT_ODR_UNSTOCK_MODIFY_COUNT.read(conn, struct);
				if (modifyCountList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}else{
					KR0080010Struct modifyCountStruct = (KR0080010Struct)modifyCountList.get(0);
					if (struct.getUNSTOCK_MODIFY_COUNT() != null && !"".equals(struct.getUNSTOCK_MODIFY_COUNT()) && !struct.getUNSTOCK_MODIFY_COUNT().equals(modifyCountStruct.getSEL_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return;
					}
				}
            	//[��݌Ɏ�]�̍X�V
            	entity.mupdateT_ODR_UNSTOCK.update(conn, struct);
            }
            conn.commit();
            //��ʂ��Č���
            controlSelect();

		} catch(SQLException e) {
			ExpjMessage emsg;
			emsg = new ExpjMessage("ZZ01006","�o�^�Ɏ��s���܂����B");
			msgStruct.addError(emsg);
			e.printStackTrace();
			//�G���[�������L�q���Ă��������B
		}finally {
	         if (conn != null) {
	             conn.rollback();
	            }
	   		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {			
			//[�𖱎��ї���]�p�ԓ`�̓`�[�ԍ�
			String strSLIP_CD = null;
			//�ˑ�����}�X�^�̃`�F�b�N
			if(!existDependsMaster()){
				return;
			}
			
			//��󒍔ԍ�����A[�������]�ɑ��݂��Ȃ��ꍇ
			List odrNoList = entity.mselectT_SALES.read(conn, struct);
			if(odrNoList.isEmpty()){
				setErrorMessage("ZZ01105");
                return;
			}
			
			KR0080010Struct odrNoStruct = (KR0080010Struct) odrNoList.get(0);
			//AI���|�C���^�t�F�[�X�t���O
			struct.setAI_AR_IF_FLG(odrNoStruct.getAI_AR_IF_FLG());
            //[�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
            if (!odrNoStruct.getSALSE_MODIFY_COUNT().equals(struct.getSALSE_MODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //�𖱎��т���������
			List serviceDataList = entity.mselectT_SERVICE.read(conn, struct);
			if(serviceDataList.isEmpty()){
			 //[�𖱎���]�Ƀf�[�^�����݂��Ȃ��ꍇ
				setErrorMessage("ZZ01105");
                return;
			 }
			
			KR0080010Struct serviceStruct = (KR0080010Struct) serviceDataList.get(0);
            //[�𖱎���]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
            if (!serviceStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
			
            //��݌Ɏ󒍂���������
            List chkUnstokList = entity.mselsectT_ODR_UNSTOCK.read(conn, struct);
			if(chkUnstokList.isEmpty()){
			 //[��݌Ɏ�]�Ƀf�[�^�����݂��Ȃ��ꍇ
				setErrorMessage("ZZ01105");
                return;
			 }
			
			KR0080010Struct unstokStruct = (KR0080010Struct) chkUnstokList.get(0);
            //[��݌Ɏ�]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
            if (!unstokStruct.getUNSTOCK_MODIFY_COUNT().equals(struct.getUNSTOCK_MODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //���|�������Ă��Ȃ��ꍇ�A�V�X�e���p�����[�^������я��F�`�F�b�N
            chkAprSales();
            if (msgStruct.hasError()) {                	 
                return;
            }
            //�C���X�g�[���I�v�V�����̎擾
			List tempList = entity.mSYS_INSTALL_OPTIONS_Ai.read(conn, struct);
			if (tempList.isEmpty()) {
				struct.seth_INSTALL_FLG(null);			
			}else{
				struct.seth_INSTALL_FLG(((KR0080010Struct)tempList.get(0)).geth_INSTALL_FLG());
			}
			//�u���|�Ǘ��v�T�u�V�X�e��
			List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
			//[���|���g�����w�b�_] ����������
			List listLedgerHTrn = entity.mselectT_AR_LEDGER_H_TRN.read(conn, struct);
			//[���|�������w�b�_] ����������
			List listLedgerH = entity.mselectT_AR_LEDGER_H.read(conn, struct);
			 
			//Ai�A�g�Ή��AAi�A�g���肩���M�ς̏ꍇ��[�������]�ԍ����ׂ��쐬
  			if("1".equals(struct.geth_INSTALL_FLG()) &&
  					"1".equals(struct.getAI_AR_IF_FLG())){
  				
  				//[�������]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
                KR0080010Struct creditRecordStruct = createCreditRecord();
                //������ъǗ��ԍ�(�A��)
                List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
                KR0080010Struct creditSalesSeqNoStruct = (KR0080010Struct) creditSalesSeqNoList.get(0);
                creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
            
                //�ԓ`�[�ԍ��������̔�
                Numbering redSlipCdNum =
                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
                creditRecordStruct.setSLIP_CD(redSlipCdNum.getNo());
                
				//[�𖱎��ї���]�p�ԓ`�̓`�[�ԍ�
				strSLIP_CD = creditRecordStruct.getSLIP_CD();
                //���`�[�ԍ�
                creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
                //[�������]�i�ԓ`�j��o�^
                entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
            
                //[�������]�i���`�j��_���폜
                entity.mT_SALES_Delete.update(conn, struct);
            
                //[�������]�i���`�j�o�^�p�f�[�^�𐶐�
                KR0080010Struct debitRecordStruct = createDebitRecord();
                if (msgStruct.hasError()) {
                 return;
                }
    			
                //������ъǗ��ԍ�(�A��)
                List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
                KR0080010Struct debitSalesSeqNoStruct = (KR0080010Struct) debitSalesSeqNoList.get(0);
                debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());

                //���`�[�ԍ��������̔�
                Numbering slipCdNum =
                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
                debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
                
				//���`�[�ԍ�
				debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
                //[�������]�i���`�j��o�^
                entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);    
                //�o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
				struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
  			}else{
  				if (installOptionsList.isEmpty()
  	                  || (!installOptionsList.isEmpty() && !listLedgerHTrn.isEmpty())) {
  	                  //���|�Ǘ����C���X�g�[������Ă��Ȃ��ꍇ
  	                  //�܂��́A���|�Ǘ����C���X�g�[������Ă��邩�A�Y���f�[�^�� [���|���g�����w�b�_] �ɑ��݂���ꍇ
  					  //[�𖱎��ї���]�p�ԓ`�̓`�[�ԍ�
  					  strSLIP_CD = struct.getSLIP_CD();
  	                  //[�������]�i���`�j�o�^�p�f�[�^�𐶐�
  	                  KR0080010Struct debitRecordStruct = createDebitRecord();
  	                  if (msgStruct.hasError()) {
  	                   return;
  	                  }
  	                  //�`�[�ԍ��͢�`�[�ԍ�����g�p����
  	                  debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());
  	                  //[�������]�i���`�j���X�V
  	                  entity.mT_SALES_DebitRecord.update(conn, debitRecordStruct);
  	                  
  	                if (!installOptionsList.isEmpty()) {
						//���|�Ǘ����C���X�g�[������Ă���ꍇ
						//���|�Ǘ��h�^�e
  	                	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
  	                	tempKZ0010P001.setParameter("7", struct.getsUser_ID(), struct.getSLIP_CD(), null, null, struct.getTAX_CD());
						String msgNo = tempKZ0010P001.execute();
						if (!"0".equals(msgNo)) {
							setErrorMessage(msgNo);
							conn.rollback();
							return;
						}
					}
  	                //�o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
  				}else if(!installOptionsList.isEmpty() && !listLedgerH.isEmpty()){
  					//�u���|�Ǘ��v�T�u�V�X�e�� ���� ���� �Y���f�[�^�� [���|�������w�b�_] �ɑ��݂���ꍇ
  					
  					//[�������]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
  	                KR0080010Struct creditRecordStruct = createCreditRecord();
  	                //������ъǗ��ԍ�(�A��)
  	                List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
  	                KR0080010Struct creditSalesSeqNoStruct = (KR0080010Struct) creditSalesSeqNoList.get(0);
  	                creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
  	            
  	                //�ԓ`�[�ԍ��������̔�
  	                Numbering redSlipCdNum =
  	                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
  	                creditRecordStruct.setSLIP_CD(redSlipCdNum.getNo());
  	                //[�𖱎��ї���]�p�ԓ`�̓`�[�ԍ�
  	                strSLIP_CD = creditRecordStruct.getSLIP_CD();
  	                //���`�[�ԍ�
  	                creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
  	                //[�������]�i�ԓ`�j��o�^
  	                entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
  	            
  	                //[�������]�i���`�j��_���폜
  	                entity.mT_SALES_Delete.update(conn, struct);
  	            
  	                //[�������]�i���`�j�o�^�p�f�[�^�𐶐�
  	                KR0080010Struct debitRecordStruct = createDebitRecord();
  	                if (msgStruct.hasError()) {
  	                 return;
  	                }
  	                //������ъǗ��ԍ�(�A��)
  	                List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
  	                KR0080010Struct debitSalesSeqNoStruct = (KR0080010Struct) debitSalesSeqNoList.get(0);
  	                debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
  	                //���`�[�ԍ��������̔�
  	                Numbering slipCdNum =
  	                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
  	                debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
  	                //���`�[�ԍ�
					debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
  	                //[�������]�i���`�j��o�^
  	                entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);  
  	                
  	                if (!installOptionsList.isEmpty()) {
                  	//���|�Ǘ����C���X�g�[������Ă���ꍇ
                    
  	                	//���|�Ǘ��h�^�e
	                  	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
	                  	tempKZ0010P001.setParameter("7", struct.getsUser_ID(),
	  							struct.getSLIP_CD(),
	  							creditRecordStruct.getSLIP_CD(),
	  							debitRecordStruct.getSLIP_CD(),
	  							struct.getTAX_CD());
	  					String msgNo = tempKZ0010P001.execute();
	  					if (!"0".equals(msgNo)) {
	  						setErrorMessage(msgNo);
	  						conn.rollback();
	  						return;
  					}
                   }
  	                //�o�^�������`�̓`�[�ԍ��ŉ�ʂ��Č���
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
  				}   
                
  			}
				 //[�𖱎��ї���]�o�^�p�f�[�^�𐶐�
				 List beforeHsTServiceList = entity.mselectData.read(conn, struct);
		         KR0080010Struct beforeHsTServiceStruct = (KR0080010Struct) beforeHsTServiceList.get(0);
	         	 //�����Ǘ��ԍ�(�A��)
	             List hsServiceSeqNoList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
	             KR0080010Struct hsServiceSeqNoStruct = (KR0080010Struct) hsServiceSeqNoList.get(0);
	             beforeHsTServiceStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoStruct.getHS_CTL_SEQ_CD());
	             //�`�[�ԍ�
	             beforeHsTServiceStruct.setSLIP_CD(strSLIP_CD);
	             //�󒍔ԍ�
	             beforeHsTServiceStruct.setODR_NO(struct.getODR_NO());
		         //�V���t���O
		         beforeHsTServiceStruct.setNEW_OLD_FLG("0");
	             //�����敪
		         beforeHsTServiceStruct.setTRAN_TYPE("2");
	             //�����敪
		         beforeHsTServiceStruct.setCRCT_TYP("1");
		         setStructSystemData(beforeHsTServiceStruct);
		         //�X�V�O�̃f�[�^��[�𖱎��ї���] �ɓo�^����
		         entity.mHS_T_SERVICE_CreditRecord.create(conn, beforeHsTServiceStruct);
		        
		         //[�𖱎���]�X�V�p�f�[�^�𐶐�
                 KR0080010Struct serviceRecordStruct = createServiceRecord();
                 if (msgStruct.hasError()) {
                  return;
                 }
                 //[�𖱎���]�X�V
                 entity.mT_SERVICE_update.update(conn, serviceRecordStruct);
                  
                 //�����Ǘ��ԍ�(�A��)
  	             List hsServiceSeqNoafterList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
  	             KR0080010Struct hsServiceSeqNoafterStruct = (KR0080010Struct) hsServiceSeqNoafterList.get(0);
  	             serviceRecordStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoafterStruct.getHS_CTL_SEQ_CD());
  	             //�󒍔ԍ�
  	             serviceRecordStruct.setODR_NO(struct.getODR_NO());
                 //�V���t���O
                 serviceRecordStruct.setNEW_OLD_FLG("1");
 	             //�����敪
                 serviceRecordStruct.setTRAN_TYPE("2");
 	             //�����敪
                 serviceRecordStruct.setCRCT_TYP("2");
                 //�X�V��̃f�[�^��[�𖱎��ї���] �ɓo�^����
 		         entity.mHS_T_SERVICE_CreditRecord.create(conn, serviceRecordStruct);
 		         
 		         //[��݌Ɏ�] ���X�V����
 		         if("true".equals(struct.getJOB_ODR_COMP_FLG())){
 		        	//�g�����t���O�h���A�`�F�b�NOn�̏ꍇ�A1:����
  	            	entity.mupdateT_ODR_UNSTOCK.update(conn, struct);
 		         }else{
 		        	//�g�����t���O�h���A�`�F�b�NOff�̏ꍇ�A0:������
 		        	entity.mupdateT_ODR_UNSTOCK1.update(conn, struct);
 		         }
 		        conn.commit();
 		        //�o�^���e�� ��ʂɕ\������
 		        controlSelect();
 		        
		} catch(SQLException e) {
			throw new ExpjException(e);
        } finally {
         if (conn != null) {
          conn.rollback();
         }
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			//��󒍔ԍ�����A[�������]�ɑ��݂��Ȃ��ꍇ
			List odrNoList = entity.mselectT_SALES.read(conn, struct);
			if(odrNoList.isEmpty()){
				setErrorMessage("ZZ01105");
                return;
			}
			
			KR0080010Struct odrNoStruct = (KR0080010Struct) odrNoList.get(0);
            //[�������]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
            if (!odrNoStruct.getSALSE_MODIFY_COUNT().equals(struct.getSALSE_MODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //�𖱎��т���������
			List serviceDataList = entity.mselectT_SERVICE.read(conn, struct);
			if(serviceDataList.isEmpty()){
			 //[�𖱎���]�Ƀf�[�^�����݂��Ȃ��ꍇ
				setErrorMessage("ZZ01105");
                return;
			 }
			
			KR0080010Struct serviceStruct = (KR0080010Struct) serviceDataList.get(0);
            //[�𖱎���]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
            if (!serviceStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //���|�������Ă��Ȃ��ꍇ�A�V�X�e���p�����[�^������я��F�`�F�b�N
            chkAprSales();
            if (msgStruct.hasError()) {                	 
                return;
            }
            //�u���|�Ǘ��v�T�u�V�X�e��
			List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
			//[���|���g�����w�b�_] ����������
			List listLedgerHTrn = entity.mselectT_AR_LEDGER_H_TRN.read(conn, struct);
			//[���|�������w�b�_] ����������
			List listLedgerH = entity.mselectT_AR_LEDGER_H.read(conn, struct);
			
            //[�������]�i�ԓ`�j�o�^�p�f�[�^�𐶐�
            KR0080010Struct creditRecordStruct = createCreditRecord();
            
            //������ъǗ��ԍ�(�A��)
            List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
            KR0080010Struct creditSalesSeqNoStruct = (KR0080010Struct) creditSalesSeqNoList.get(0);
            creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
            
            if (installOptionsList.isEmpty()
					|| (!installOptionsList.isEmpty() && !listLedgerHTrn.isEmpty())) {
            	// �`�[�ԍ��͢�`�[�ԍ�����g�p
				creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
            }else if (!installOptionsList.isEmpty() && !listLedgerH.isEmpty()) {
            	//�ԓ`�[�ԍ��������̔�
                Numbering redSlipCdNum =
                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
                creditRecordStruct.setSLIP_CD(redSlipCdNum.getNo());
            }
            
            //���`�[�ԍ�
            creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
            //[�������]�i�ԓ`�j��o�^
            entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
        
            //[�������]�i���`�j��_���폜
            entity.mT_SALES_Delete.update(conn, struct);
            
            //�C���X�g�[���I�v�V�����̎擾
			List tempList = entity.mSYS_INSTALL_OPTIONS_Ai.read(conn, struct);
			if (tempList.isEmpty()) {
				struct.seth_INSTALL_FLG(null);			
			}else{
				struct.seth_INSTALL_FLG(((KR0080010Struct)tempList.get(0)).geth_INSTALL_FLG());
			}
			
	        if (!installOptionsList.isEmpty() && !"1".equals(struct.geth_INSTALL_FLG())){
	            //���|�Ǘ����C���X�g�[������Ă���ꍇ
	        	
	        	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
	        	tempKZ0010P001.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
						creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
				String msgNo = tempKZ0010P001.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
	        }
	         //[�𖱎��ї���]�o�^�p�f�[�^�𐶐�
			 List hsTServiceList = entity.mselectData.read(conn, struct);
	         KR0080010Struct hsTServiceStruct = (KR0080010Struct) hsTServiceList.get(0);
	         
	         KR0080010Struct tServiceStruct = new KR0080010Struct();
	         //�`�[�ԍ�
	         tServiceStruct.setSLIP_CD(creditRecordStruct.getSLIP_CD());
	         //�󒍔ԍ�
	         tServiceStruct.setODR_NO(struct.getODR_NO());
	         //�𖱎��ъǗ��ԍ�
	         tServiceStruct.seth_CTL_SEQ_CD(struct.geth_CTL_SEQ_CD());
	         setStructSystemData(tServiceStruct);
	         //[�𖱎���] ��_���폜����
	         entity.mT_SERVICE_Delete.update(conn, tServiceStruct);
	         
	         //�����Ǘ��ԍ�(�A��)
             List hsServiceSeqNoList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
             KR0080010Struct hsServiceSeqNoStruct = (KR0080010Struct) hsServiceSeqNoList.get(0);
             hsTServiceStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoStruct.getHS_CTL_SEQ_CD());
             //�`�[�ԍ�
             hsTServiceStruct.setSLIP_CD(creditRecordStruct.getSLIP_CD());
             //�󒍔ԍ�
             hsTServiceStruct.setODR_NO(struct.getODR_NO());
	         //�V���t���O
	         hsTServiceStruct.setNEW_OLD_FLG("1");
             //�����敪
	         hsTServiceStruct.setTRAN_TYPE("3");
             //�����敪
	         hsTServiceStruct.setCRCT_TYP("1");
	         setStructSystemData(hsTServiceStruct);
	         //[�𖱎��ї���] �ɓo�^����
	         entity.mHS_T_SERVICE_CreditRecord.create(conn, hsTServiceStruct);
	         
	         //��݌Ɏ󒍂���������
             List chkUnstokList = entity.mselsectT_ODR_UNSTOCK.read(conn, struct);
			 if(chkUnstokList.isEmpty()){
			  //[��݌Ɏ�]�Ƀf�[�^�����݂��Ȃ��ꍇ
				setErrorMessage("ZZ01105");
                return;
			 }
			
			 KR0080010Struct unstokStruct = (KR0080010Struct) chkUnstokList.get(0);
			 
			 if("1".equals(unstokStruct.getODR_CMPLT_FLG())){
				//[��݌Ɏ�]."�X�V��" != ��X�V���(hidden�g�p)�̏ꍇ
	             if (!unstokStruct.getUNSTOCK_MODIFY_COUNT().equals(struct.getUNSTOCK_MODIFY_COUNT())) {
	              setErrorMessage("ZZ01105");
	              return;
	             }
	            
	        	 //��݌Ɏ󒍂̍X�V�A0:������
	        	 entity.mupdateT_ODR_UNSTOCK1.update(conn, struct);
			 }
             
	      //�󒍔ԍ����N���A
          struct.setODR_NO(null);
	      //��ʂ��N���A
          controlClear();
           
          conn.commit();
		} catch(SQLException e) {
			throw new ExpjException(e);
//			e.printStackTrace();
			//�G���[�������L�q���Ă��������B
		}finally {
	         if (conn != null) {
	             conn.rollback();
	            }
	   		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		initializeDetail();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		
		try {
            //�̔��p�H��R�[�h
            List codeList = entity.mSYS_CLASS_CODE.read(conn, struct);
            if (!codeList.isEmpty()) {
             KR0080010Struct codeStruct = (KR0080010Struct)codeList.get(0);
             this.setSalesPLANT_CD(codeStruct.getSYS_CLASS_CODE());
            }
            else {
             this.setSalesPLANT_CD("");
            }
         
            //���ЃR�[�h
            List companyCodeList = entity.mselectCOMPANY_CD.read(conn, struct);
            if(companyCodeList.isEmpty()){
            	//���ЃR�[�h ���擾�ł��Ȃ������ꍇ
            	ExpjMessage emsg = new ExpjMessage( "KQ00039" );
        		sysLog.severe(emsg, getsysUSER_CD());
        		ExpjException ee = new ExpjException(emsg);
        		throw ee;
            }
            //���ЃR�[�h
            KR0080010Struct companyCodeStruct = (KR0080010Struct)companyCodeList.get(0);
            struct.setCOMPANY_CD(companyCodeStruct.getCOMPANY_CD());
            
            //�Ɩ����t
            List businessDateList = entity.mselectBUSINESS_DATE.read(conn, struct);
            if(businessDateList.isEmpty()){
            	//���t�v�Z�p�H��R�[�h ���擾�ł��Ȃ������ꍇ�A���邢�͋Ɩ��^�p�� ���擾�ł��Ȃ������ꍇ
            	ExpjMessage emsg = new ExpjMessage( "KQ00026" );
        		sysLog.severe(emsg, getsysUSER_CD());
        		ExpjException ee = new ExpjException(emsg);
        		throw ee;
            }
            //�Ɩ����t
            KR0080010Struct businessDateStruct = (KR0080010Struct)businessDateList.get(0);
            setBusinessOprDate(businessDateStruct.getBUSINESS_OPR_DATE());
            
            //����
            List payRateList = entity.mselectPAY_RATE.read(conn, struct);
            if(payRateList.isEmpty()){
            	//�����̃V�X�e���p�����[�^���擾�ł��Ȃ������ꍇ
            	ExpjMessage emsg = new ExpjMessage( "KM00028" );
        		sysLog.severe(emsg, getsysUSER_CD());
        		ExpjException ee = new ExpjException(emsg);
        		throw ee;
            }else{
            	KR0080010Struct payRateStruct = (KR0080010Struct)payRateList.get(0);
            	if(Calculate.compare(payRateStruct.getPAY_RATE(), "0") <= 0){
            		//0���傫�����l�łȂ������ꍇ
            		ExpjMessage emsg = new ExpjMessage( "KM00028" );
            		sysLog.severe(emsg, getsysUSER_CD());
            		ExpjException ee = new ExpjException(emsg);
            		throw ee;
            	}
            }
            
           } catch (SQLException e) {
            throw new ExpjException(e);
           }
		
		//������
		initializeDetail();
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			//�R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
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
//			throw new FoundationException("KR0080010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0080010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KR0080010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0080010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KR0080010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			//TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0080010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KR0080010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KR0080010Entity entity;
	protected KR0080010Struct struct;
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

		entity = new KR0080010Entity();
		struct = new KR0080010Struct();

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
	 * KR0080010�N���X�̕W���R���X�g���N�^
	 */
	public KR0080010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			//TODO: �����ɏ����������L�q���Ă�������
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
			//TODO: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������
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
				KR0080010Struct key = (KR0080010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_SALES_UNIT_PRICE") && key.geth_SALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("h_SALES_UNIT_PRICE", key.geth_SALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO_2") && key.getODR_NO_2() != null) {
					msgKey.setKeyValue("ODR_NO_2", key.getODR_NO_2());
				}
				if(msgKeyType.containsKeyColumn("UNSTOCK_MODIFY_COUNT") && key.getUNSTOCK_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("UNSTOCK_MODIFY_COUNT", key.getUNSTOCK_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("haveFlag") && key.gethaveFlag() != null) {
					msgKey.setKeyValue("haveFlag", key.gethaveFlag());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_CTL_SEQ_CD") && key.geth_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("h_CTL_SEQ_CD", key.geth_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TRN_CD") && key.getSLIP_TRN_CD() != null) {
					msgKey.setKeyValue("SLIP_TRN_CD", key.getSLIP_TRN_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_COMP_FLG") && key.getJOB_ODR_COMP_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_COMP_FLG", key.getJOB_ODR_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_NO") && key.getDETAIL_NO() != null) {
					msgKey.setKeyValue("DETAIL_NO", key.getDETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME") && key.getCUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_NAME", key.getCUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_YEN") && key.getSALES_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_YEN", key.getSALES_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_RATE") && key.getPAY_RATE() != null) {
					msgKey.setKeyValue("PAY_RATE", key.getPAY_RATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_1") && key.getITEM_NAME_1() != null) {
					msgKey.setKeyValue("ITEM_NAME_1", key.getITEM_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SALSE_MODIFY_COUNT") && key.getSALSE_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SALSE_MODIFY_COUNT", key.getSALSE_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO") && key.geth_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("h_SALES_SEQ_NO", key.geth_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG") && key.getAI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("AI_AR_IF_FLG", key.getAI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("SALES_SEQ_NO") && key.getSALES_SEQ_NO() != null) {
					msgKey.setKeyValue("SALES_SEQ_NO", key.getSALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_TYP") && key.getSALES_TYP() != null) {
					msgKey.setKeyValue("SALES_TYP", key.getSALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD") && key.getPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("PRD_ODR_PLACE_CD", key.getPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT") && key.getEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_SALES_AMOUNT", key.getEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT") && key.getINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_SALES_AMOUNT", key.getINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT") && key.getTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAXFREE_SALES_AMOUNT", key.getTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT") && key.getTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_CREDIT_SALES_AMOUNT", key.getTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT") && key.getEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_AMOUNT", key.getEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT") && key.getINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_AMOUNT", key.getINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ORG_SLIP_CD") && key.getORG_SLIP_CD() != null) {
					msgKey.setKeyValue("ORG_SLIP_CD", key.getORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO") && key.getSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("SPCL_PRICE_CO", key.getSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("CTL_SEQ_CD") && key.getCTL_SEQ_CD() != null) {
					msgKey.setKeyValue("CTL_SEQ_CD", key.getCTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_TIME") && key.getWORK_TIME() != null) {
					msgKey.setKeyValue("WORK_TIME", key.getWORK_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_DATE") && key.getWORK_DATE() != null) {
					msgKey.setKeyValue("WORK_DATE", key.getWORK_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_PERSON_CD") && key.getWORK_PERSON_CD() != null) {
					msgKey.setKeyValue("WORK_PERSON_CD", key.getWORK_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_REMARKS") && key.getWORK_REMARKS() != null) {
					msgKey.setKeyValue("WORK_REMARKS", key.getWORK_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("HS_CTL_SEQ_CD") && key.getHS_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("HS_CTL_SEQ_CD", key.getHS_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("NEW_OLD_FLG") && key.getNEW_OLD_FLG() != null) {
					msgKey.setKeyValue("NEW_OLD_FLG", key.getNEW_OLD_FLG());
				}
				if(msgKeyType.containsKeyColumn("TRAN_TYPE") && key.getTRAN_TYPE() != null) {
					msgKey.setKeyValue("TRAN_TYPE", key.getTRAN_TYPE());
				}
				if(msgKeyType.containsKeyColumn("CRCT_TYP") && key.getCRCT_TYP() != null) {
					msgKey.setKeyValue("CRCT_TYP", key.getCRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("APR_SALES_VALUE") && key.getAPR_SALES_VALUE() != null) {
					msgKey.setKeyValue("APR_SALES_VALUE", key.getAPR_SALES_VALUE());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_NAME") && key.getSALES_DEPT_NAME() != null) {
					msgKey.setKeyValue("SALES_DEPT_NAME", key.getSALES_DEPT_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_PERSON_NAME") && key.getWORK_PERSON_NAME() != null) {
					msgKey.setKeyValue("WORK_PERSON_NAME", key.getWORK_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
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
				if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE") && key.getSYS_CLASS_CODE() != null) {
					msgKey.setKeyValue("SYS_CLASS_CODE", key.getSYS_CLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT") && key.getSEL_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SEL_MODIFY_COUNT", key.getSEL_MODIFY_COUNT());
				}
				//{{user_implement_dev:setOrMsgKey
					//TODO: �L�[���ݒ�̃R�[�h��ǉ����Ă�������
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
					KR0080010Struct key = new KR0080010Struct();
					if(msgKeyType.containsKeyColumn("h_SALES_UNIT_PRICE")) {
						key.seth_SALES_UNIT_PRICE(msgKey.getKeyValue("h_SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO_2")) {
						key.setODR_NO_2(msgKey.getKeyValue("ODR_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("UNSTOCK_MODIFY_COUNT")) {
						key.setUNSTOCK_MODIFY_COUNT(msgKey.getKeyValue("UNSTOCK_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("haveFlag")) {
						key.sethaveFlag(msgKey.getKeyValue("haveFlag"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_CTL_SEQ_CD")) {
						key.seth_CTL_SEQ_CD(msgKey.getKeyValue("h_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TRN_CD")) {
						key.setSLIP_TRN_CD(msgKey.getKeyValue("SLIP_TRN_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_COMP_FLG")) {
						key.setJOB_ODR_COMP_FLG(msgKey.getKeyValue("JOB_ODR_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_NO")) {
						key.setDETAIL_NO(msgKey.getKeyValue("DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME")) {
						key.setCUST_CHRG_PSN_NAME(msgKey.getKeyValue("CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_YEN")) {
						key.setSALES_AMOUNT_YEN(msgKey.getKeyValue("SALES_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_RATE")) {
						key.setPAY_RATE(msgKey.getKeyValue("PAY_RATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_1")) {
						key.setITEM_NAME_1(msgKey.getKeyValue("ITEM_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALSE_MODIFY_COUNT")) {
						key.setSALSE_MODIFY_COUNT(msgKey.getKeyValue("SALSE_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO")) {
						key.seth_SALES_SEQ_NO(msgKey.getKeyValue("h_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG")) {
						key.setAI_AR_IF_FLG(msgKey.getKeyValue("AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SALES_SEQ_NO")) {
						key.setSALES_SEQ_NO(msgKey.getKeyValue("SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TYP")) {
						key.setSALES_TYP(msgKey.getKeyValue("SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD")) {
						key.setPRD_ODR_PLACE_CD(msgKey.getKeyValue("PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT")) {
						key.setINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT")) {
						key.setTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT")) {
						key.setTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT")) {
						key.setEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT")) {
						key.setINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ORG_SLIP_CD")) {
						key.setORG_SLIP_CD(msgKey.getKeyValue("ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO")) {
						key.setSPCL_PRICE_CO(msgKey.getKeyValue("SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CTL_SEQ_CD")) {
						key.setCTL_SEQ_CD(msgKey.getKeyValue("CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_TIME")) {
						key.setWORK_TIME(msgKey.getKeyValue("WORK_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_DATE")) {
						key.setWORK_DATE(msgKey.getKeyValue("WORK_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_PERSON_CD")) {
						key.setWORK_PERSON_CD(msgKey.getKeyValue("WORK_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_REMARKS")) {
						key.setWORK_REMARKS(msgKey.getKeyValue("WORK_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("HS_CTL_SEQ_CD")) {
						key.setHS_CTL_SEQ_CD(msgKey.getKeyValue("HS_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEW_OLD_FLG")) {
						key.setNEW_OLD_FLG(msgKey.getKeyValue("NEW_OLD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TRAN_TYPE")) {
						key.setTRAN_TYPE(msgKey.getKeyValue("TRAN_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_TYP")) {
						key.setCRCT_TYP(msgKey.getKeyValue("CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("APR_SALES_VALUE")) {
						key.setAPR_SALES_VALUE(msgKey.getKeyValue("APR_SALES_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_NAME")) {
						key.setSALES_DEPT_NAME(msgKey.getKeyValue("SALES_DEPT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_PERSON_NAME")) {
						key.setWORK_PERSON_NAME(msgKey.getKeyValue("WORK_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
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
					if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE")) {
						key.setSYS_CLASS_CODE(msgKey.getKeyValue("SYS_CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT")) {
						key.setSEL_MODIFY_COUNT(msgKey.getKeyValue("SEL_MODIFY_COUNT"));
					}
					//{{user_implement_dev:getOrMsgKey
						//TODO: �L�[���擾�̃R�[�h��ǉ����Ă�������
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
