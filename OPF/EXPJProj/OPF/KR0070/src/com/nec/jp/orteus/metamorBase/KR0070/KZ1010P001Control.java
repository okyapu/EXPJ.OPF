/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KZ1010P001Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0070;

import com.nec.jp.orteus.metamorBase.KR0070.*;
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
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KZ1010P001Control
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
		protected List list; // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
		
		// �f�t�H���g�A�N�Z�T���\�b�h
		public List getList() { return this.list; } // ���X�g��Ԃ��܂��B
		public void setList(List listname) { this.list = listname; } // ���X�g���Z�b�g���܂��B
		public int getListsize() {  // ���X�g�^�̃T�C�Y��Ԃ��܂��B
			int nret = 0;
			if( this.list != null ) {nret = this.list.size();}
			return nret;
		}
		public KZ1010P001Struct getListvalue(int x) { return (KZ1010P001Struct)(this.list.get(x)); } // ���X�g�̒l��Ԃ��܂��B
		public KZ1010P001Struct getStruct() { return this.struct; } // Struct��Ԃ��܂��B
		public KZ1010P001Struct createStruct() { return new KZ1010P001Struct(); } // �V����Struct������ĕԂ��܂��B
		public void setStruct(Object structname) { this.struct.setStruct((KZ1010P001Struct)structname); } // Struct���Z�b�g���܂��B
		public void initializeStruct() { this.struct.initialize(); } // Struct�̒l�����������܂��B
		
		// CSV�o�͗p���X�g
		private CsvWriter csvWriter = null;
		public CsvWriter getCsvWriter(){ return this.csvWriter; }
		
		private CsvReader csvReader = null;
		public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
		
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		private KZ1010P001Struct tempStruct;
		
	    // ����ŃR�[�h
	    private String _taxCd = null;
	    
	    /**
	     * ����ŃR�[�h�Z�b�g
	     * @param taxCd
	     */
	    protected void setTaxCd(String taxCd) {
	    	_taxCd = taxCd;
	    }
		
		//�̔��P���̃��[�j���O���X�g
		private List _salesUnitPriceWarningList = new ArrayList();
		
		/**
		 * 
		 * @return �̔��P���̃��[�j���O���X�g
		 */
		public List getSalesUnitPriceWarningList() {
			return _salesUnitPriceWarningList;
		}
		
		/**
		 * 
		 * @param info �̔��P���̃��[�j���O�̓��e
		 */
		protected void setSalesUnitPriceWarningList(String info){
			_salesUnitPriceWarningList.add(info);
		}
		
		/**
		 * ���[�UID�Z�b�g<BR>
		 *
		 * @param userId ���`�[�ԍ�
		 */
		protected void setUserId(String userId) {
			struct.setsUser_ID(userId);
		}
		
		/**
		 * ���Џ�񒊏o<BR>
		 * ����<BR>
		 */
		protected String selectMyCompany() {
			try {
				list = entity.mSelectSYS_MY_COMPANY.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00026";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setCOMPANY_CD(tempStruct.getCOMPANY_CD());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * ���|�V�X�e���Ǘ��}�X�^���o<BR>
		 * ����<BR>
		 */
		protected String selectArCtrl() {
			try {
				list = entity.mSelectSYS_AR_CTRL.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00006";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setSLIP_CTRL_GRP(tempStruct.getSLIP_CTRL_GRP());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �敪�R�[�h���o<BR>
		 * ����<BR>
		 */
		protected String selectClassCode() {
			try {
				list = entity.mSelectSYS_CLASS_CODE.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00007";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setSLIP_TRN_CD(tempStruct.getSLIP_TRN_CD());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �`�[�敪�}�X�^���o<BR>
		 * ����<BR>
		 */
		protected String selectSlipTrn() {
			try {
				list = entity.mSelectM_SLIP_TRN.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00008";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setSTOCK_CLASS_CD(tempStruct.getSTOCK_CLASS_CD());
				struct.setBALANCE_CLASS_CD(tempStruct.getBALANCE_CLASS_CD());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �M�ݒ��o<BR>
		 * ����<BR>
		 */
		protected String selectHomeCur() {
			try {
				list = entity.mSelectSYS_HOME_CUR.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00014";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setHOME_CUR_CD(tempStruct.getHOME_CUR_CD());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}

    /**
     * �`�[�ԍ��Z�b�g<BR>
     *
     * @param SlipCd �`�[�ԍ�
     */
    protected void setSlipCd(String slipCd) {
        struct.setSLIP_CD(slipCd);
    }

		/**
		 * �`�[�ԍ��Z�b�g2<BR>
		 *
		 * @param SlipCd2 �`�[�ԍ�
		 */
		protected void setSlipCd2(String slipCd) {
		    struct.setSLIP_CD2(slipCd);
		}
		
		/**
		 * ������ђ��o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectSales() {
			try {
				list = entity.mSelectT_SALES.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00001";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setSALES_DATE(tempStruct.getSALES_DATE());
				struct.setSALES_DEPT_CD(tempStruct.getSALES_DEPT_CD());
				struct.setCUST_CHRG_PSN_CD(tempStruct.getCUST_CHRG_PSN_CD());
				struct.setCUST_CD(tempStruct.getCUST_CD());
				struct.setITEM_CD(tempStruct.getITEM_CD());
				struct.setITEM_NAME(tempStruct.getITEM_NAME());
				struct.setCUST_ODR_NO(tempStruct.getCUST_ODR_NO());
				struct.setSALES_AMOUNT(tempStruct.getSALES_AMOUNT());
				struct.setREMARKS(tempStruct.getREMARKS());
				struct.setSALES_AMOUNT_EXCH_RATES(tempStruct.getSALES_AMOUNT_EXCH_RATES());
				struct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(tempStruct.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				struct.setSALES_UNIT_PRICE(tempStruct.getSALES_UNIT_PRICE());
				struct.setSALES_QTY(tempStruct.getSALES_QTY());
				struct.setINSPC_ACPT_DATE(tempStruct.getINSPC_ACPT_DATE());
				struct.setINSPC_ACPT_QTY(tempStruct.getINSPC_ACPT_QTY());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �o�׎��ђ��o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectShip() {
			try {
				list = entity.mSelectT_SHIP.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00002";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setDLV_LOC_CD(tempStruct.getFINAL_DLV_LOC_CD());
				struct.setSHIP_DATE(tempStruct.getSHIP_DATE());
				struct.setODR_CTL_NO(tempStruct.getODR_CTL_NO());
				struct.setCUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());
				struct.setCUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());
				struct.setPART_DLV_SEQ_NO(tempStruct.getPART_DLV_SEQ_NO());
				struct.setSHIP_ODR_NO(tempStruct.getSHIP_ODR_NO());
				struct.setPURPOSE_UNIT_PRICE_TYP(tempStruct.getPURPOSE_UNIT_PRICE_TYP());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �o�׎w�����o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectShipOdr() {
			try {
				list = entity.mSelectT_SHIP_ODR.read(conn, struct);
				if (list.isEmpty()) {
					return "0";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setSHIP_ODR_NO(tempStruct.getSHIP_ODR_NO());
				struct.setSHIP_PLAN_DATE(tempStruct.getSHIP_PLAN_DATE());
				struct.setSCDL_DLV_DATE(tempStruct.getSCDL_DLV_DATE());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �m��󒍒��o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectOdr() {
			try {
				list = entity.mSelectT_ODR.read(conn, struct);
				if (list.isEmpty()) {
					return "KR10015";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setUNCNFM_CUST_ODR_CREATE_DATE(tempStruct.getUNCNFM_CUST_ODR_CREATE_DATE());
				struct.setCUS_DLV_KEY_CD(tempStruct.getCUS_DLV_KEY_CD());
				struct.setAMOUNT_TYP(tempStruct.getAMOUNT_TYP());
				struct.setODR_CMPLT_FLG(tempStruct.getODR_CMPLT_FLG());
				struct.setSHIP_COUNT(tempStruct.getSHIP_COUNT());
				struct.setODR_QTY(tempStruct.getODR_QTY());
				// Add Start 20131230 liu-chy
				struct.setT_ODR_TAX_CD(tempStruct.getT_ODR_TAX_CD());
				// Add End 20131230 liu-chy
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �̔��P�����o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectUnitCost() {
			String tempString = struct.getAMOUNT_TYP();
			try {
				//���ʕ��i�ďo�N���X
				Common mstCommonUtil = new Common(conn, struct.getsUser_ID(), "KZ1010P001","PLANT_CD",struct.getCOMPANY_CD());
				if ((tempString == null) || "0".equals(tempString)) {
				//�P���敪 = null or 0
					//�̔��P�����o���i�ďo
					//�󒍐��ʂ̃`�F�b�N
					if(null == struct.getODR_QTY() || "".equals(struct.getODR_QTY())){
						struct.setODR_QTY("0");
					} 
					list = mstCommonUtil.getSalesUnitCost(struct.getCOMPANY_CD(), struct.getCUST_CD(), struct.getITEM_CD(), struct.getPURPOSE_UNIT_PRICE_TYP(), struct.getSALES_DATE(), struct.getODR_QTY());						
					if (list.isEmpty()) {
						String warningInfo = "T_SALES_TEMP.SLIP_CD:" + struct.getSLIP_CD();//���`�[�ԍ�
					    warningInfo += "@T_SALES_TEMP.CUST_CD:" + struct.getCUST_CD();//���Ӑ�R�[�h
						warningInfo += "@T_SALES_TEMP.ITEM_CD:" + struct.getITEM_CD();//�i�ڔԍ�
						warningInfo += "@T_SHIP.PURPOSE_UNIT_PRICE_TYP:" + struct.getPURPOSE_UNIT_PRICE_TYP() ;//�p�r�ʒP���敪
						warningInfo += "@T_SALES.SALES_DATE:" + struct.getSALES_DATE();//���t
						warningInfo += "@T_ODR.ODR_QTY:" + struct.getODR_QTY();//�󒍐���
						setSalesUnitPriceWarningList(warningInfo);
						struct.setUNIT_COST_TYP("2"); // 2:���P��
					} else{
						struct.setUNIT_COST_TYP((String)list.get(1));
					}
					
				} else {
					// �P���敪 != null or 0
					struct.setUNIT_COST_TYP("2"); // 2:���P��
				}
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * ���Ӑ�}�X�^���o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectCust() {
			try {
				list = entity.mSelectM_CUST.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00009";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setCUST_NAME(tempStruct.getCUST_NAME());
				struct.setTAX_CALC_TYP(tempStruct.getTAX_CALC_TYP());
				struct.setTAX_APPLY_TYP(tempStruct.getTAX_APPLY_TYP());
				struct.setTEMP_UNIT_PRICE_SALES_FLG(tempStruct.getTEMP_UNIT_PRICE_SALES_FLG());
				struct.setCLAIM_CYCLE_TYP(tempStruct.getCLAIM_CYCLE_TYP());
				struct.setRM_INP_TYP(tempStruct.getRM_INP_TYP());
				struct.setCUR_CD(tempStruct.getCUR_CD());
				struct.setEXCH_TYP(tempStruct.getEXCH_TYP());
				//struct.setTAX_CD(tempStruct.getTAX_CD());
				struct.setTAX_CD(_taxCd);
				struct.setCUST_VARIOUS_TYP(tempStruct.getCUST_VARIOUS_TYP());
				struct.setSLIP_PRINTING_TYP_1(tempStruct.getSLIP_PRINTING_TYP_1());
				struct.setSLIP_PRINTING_TYP_2(tempStruct.getSLIP_PRINTING_TYP_2());
				struct.setSLIP_PRINTING_TYP_3(tempStruct.getSLIP_PRINTING_TYP_3());
				struct.setSLIP_PRINTING_TYP_4(tempStruct.getSLIP_PRINTING_TYP_4());
				struct.setSLIP_PRINTING_TYP_5(tempStruct.getSLIP_PRINTING_TYP_5());
				struct.setPRICE_RANK_CD(tempStruct.getPRICE_RANK_CD());
				struct.setINSPC_ACPT_TYP(tempStruct.getINSPC_ACPT_TYP());
				struct.setPRICE_ROUND_TYP(tempStruct.getPRICE_ROUND_TYP());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * ���Ӑ�x�X�}�X�^���o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectCustBranch() {
			try {
				list = entity.mSelectM_CUST_BRANCH.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00010";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setSHIP_SLIP_ID(tempStruct.getSHIP_SLIP_ID());
				struct.setCARRIAGE_CHARGE_TYP(tempStruct.getCARRIAGE_CHARGE_TYP());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �������Ӑ撊�o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectClaimCustCtrl() {
			try {
				list = entity.mSelectM_CLAIM_CUST_CTRL.read(conn, struct);
				if (list.isEmpty()) {
					return "KI00011";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setBILL_ADDRESSEE_CD(tempStruct.getBILL_ADDRESSEE_CD());
				struct.setSTL_COND_CD(tempStruct.getSTL_COND_CD());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �[�i�ꏊ���o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectCustBase() {
			try {
				list = entity.mSelectM_CUST_BASE.read(conn, struct);
				if (list.isEmpty()) {
					return "KR10017";
				}
				tempStruct = (KZ1010P001Struct)list.get(0);
				struct.setDLV_LOC_NAME(tempStruct.getDLV_LOC_NAME());
				struct.setZIP_CD(tempStruct.getZIP_CD());
				struct.setADDRESS_1(tempStruct.getADDRESS_1());
				struct.setADDRESS_2(tempStruct.getADDRESS_2());
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �בփ��[�g�}�X�^���o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectHomeCurCd() {
			String homeCurCd = struct.getHOME_CUR_CD();
			String curCd = struct.getCUR_CD();
			try {
				//�בփ��[�g�擾�N���X
				ExchAmount exchAmount = new ExchAmount(conn);
				if ((homeCurCd == null) || (!homeCurCd.equals(curCd))) {
					exchAmount.doExchAmount("1", struct.getCOMPANY_CD(), struct.getCUR_CD(), struct.getEXCH_TYP(), struct.getPRICE_ROUND_TYP(), struct.getSALES_DATE());
					struct.setEXCH_RATE(exchAmount.getS_EXCH_AMOUNT());
				} else {
					struct.setEXCH_RATE("1");
				}
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * �i�ڒ��o<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String selectItem() {
			try {
				list = entity.mSelectM_ITEM.read(conn, struct);
				if (!(list.isEmpty())) {
					tempStruct = (KZ1010P001Struct)list.get(0);
					struct.setSPEC(tempStruct.getSPEC());
				} else {
					struct.setSPEC("");
				}
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "ZZ01106";
			}
		}
		
		/**
		 * ���|���g�����w�b�_�쐬<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @param  mode �������[�h
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String insertArLedgerHTrn(String mode) {
			try {
				// �o�׎��ѓ`�[�ԍ�
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
				struct.setSHIP_SLIP_CD(""); // �N���A
				} else {
					// �������[�h1:�o�׎���-�o�^
					// �������[�h3:�o�׎���-�ԕi
					struct.setSHIP_SLIP_CD(struct.getSLIP_CD()); // �`�[�ԍ�
				}
				
				// �`�[���t�E�����
				// �������[�h1:�o�׎���-�o�^
				// �������[�h3:�o�׎���-�ԕi
				// �������[�h6:���̑�����-�o�^
				// �������[�h7:���̑�����-�X�V
				struct.setSLIP_DATE(struct.getSALES_DATE()); // ����v���
				
				// EDI�f�[�^���
					// �������[�h1:�o�׎���-�o�^
					// �������[�h3:�o�׎���-�ԕi
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
				struct.setEDI_DATA_TYP("9"); // 9:EDI�ΏۊO
				
				// ��ԋ敪
				struct.setSTATUS("0"); // �����l(Not Null)
				if (("1".equals(mode)) || ("3".equals(mode)) || ("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h4:��̔���-�o�^
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					// �������[�h9:�a������I/F
					struct.setSTATUS("20"); // 20:���|�v��\��
				}
				
				// �����敪
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					struct.setINSPC_ACPT_TYP("3"); // 3:����
				} else if ("9".equals(mode)) {
					// �������[�h9:�a������I/F
					struct.setINSPC_ACPT_TYP("1"); // 1:�o�׊
				}
				
				// �N���A
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					struct.setDLV_LOC_CD(""); // �[�i�ꏊ�R�[�h
					struct.setDLV_LOC_NAME(""); // �[�i�ꏊ��
					struct.setZIP_CD(""); // (�[�i��)�X�֔ԍ�
					struct.setADDRESS_1(""); // (�[�i��)�Z��1
					struct.setADDRESS_2(""); // (�[�i��)�Z��2
					struct.setUNCNFM_CUST_ODR_CREATE_DATE(""); // ��(�`�[)��
					struct.setSHIP_PLAN_DATE(""); // �o�ח\����E�o�׎w���`�[�ԍ�
					struct.setSCDL_DLV_DATE(""); // �[�i�\���
					struct.setSHIP_DATE(""); // �o�׎���(�`�[)��
					struct.setODR_CTL_NO(""); // ��(�`�[)�ԍ�
					struct.setSHIP_ODR_NO(""); // �o�׎w��(�`�[)�ԍ�
					struct.setCUS_DLV_KEY_CD(""); // �[�i�L�[�ԍ�
				}
				// ���|���g�����w�b�_
				entity.mInsertT_AR_LEDGER_H_TRN.create(conn, struct);
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "KI00016";
			}
		}
		
		/**
		 * ���|���g�������׍쐬<BR>
		 * ���|���g�����ǉ�<BR>
		 *
		 * @param  mode �������[�h
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String insertArLedgerTrn(String mode) {
			try {
				String taxCalcTyp = struct.getTAX_CALC_TYP(); // ����Ōv�Z�敪
				// ���׍쐬
				struct.setSEQ_NO("1"); // ���ה����A��
				struct.setLINE_NO("1"); // �s
				struct.setLINE_TYP("1"); // �Ǝ��
				struct.setCOMM_CD(struct.getCUST_ITEM_CD()); // ���i�R�[�h(���Ӑ�i�ڔԍ�)
				struct.setCOMM_NAME(struct.getCUST_ITEM_NAME()); // ���i��(���Ӑ�i�ږ���)
				struct.setINP_UNIT_PRICE(struct.getSALES_UNIT_PRICE()); // ���͒P��(����P��)
				
				// ���z�敪
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					struct.setAMOUNT_TYP("2"); // 2:���P��
					// �P���敪���Z�b�g
					struct.setUNIT_COST_TYP("2"); // 2:���P��
				} else {
					// �������[�h1:�o�׎���-�o�^
					// �������[�h3:�o�׎���-�ԕi
					if ( (struct.getAMOUNT_TYP() == null) || ("0".equals(struct.getAMOUNT_TYP()))) {
						struct.setAMOUNT_TYP(struct.getAMOUNT_TYP());
					} else {
						struct.setAMOUNT_TYP("2"); // 2:���P��
					}
				}
				
				// �������[�h1:�o�׎���-�o�^
				// �������[�h3:�o�׎���-�ԕi
				// �������[�h6:���̑�����-�o�^
				// �������[�h7:���̑�����-�X�V
				struct.setSLIP_QTY(struct.getSALES_QTY()); // ������ѐ�
				struct.setINSPC_ACPT_QTY(struct.getSALES_QTY()); // ������ѐ�
				
				// ���[��
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					struct.setPART_DLV_TIMES("0");
				} else {
					// �������[�h1:�o�׎���-�o�^
					// �������[�h3:�o�׎���-�ԕi
					// �������[�h4:��̔���-�o�^
					// �������[�h9:�a������I/F
					struct.setPART_DLV_TIMES(struct.getPART_DLV_SEQ_NO()); // ���[����
				}
				// ���[�敪
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					struct.setPART_DLV_TYP("1"); // 1:���[�Ȃ�
				} else {
					// �������[�h1:�o�׎���-�o�^
					// �������[�h3:�o�׎���-�ԕi
					if (("1".equals(struct.getODR_CMPLT_FLG())) && ("1".equals(struct.getSHIP_COUNT()))) {
						// �󒍊����t���O=1, �o�׉�=1
						struct.setPART_DLV_TYP("1"); // 1:���[�Ȃ�
					} else if ( ("1".equals(struct.getODR_CMPLT_FLG())) && (!"1".equals(struct.getSHIP_COUNT()))) {
						// �󒍊����t���O=1, �o�׉�!=1
						struct.setPART_DLV_TYP("3"); // 3:���[
					} else {
						struct.setPART_DLV_TYP("2"); // 2:���[����
					}
				}
				struct.setCUST_COMM_CD(struct.getCUST_ITEM_CD()); // ���菤�i�R�[�h(���Ӑ�i�ڔԍ�)
				struct.setCUST_COMM_NAME(struct.getCUST_ITEM_NAME()); // ���菤�i��(���Ӑ�i�ږ���)
				struct.setCUST_ODR_SLIP_CD(struct.getCUST_ODR_NO()); // ���蒍���ԍ�(���Ӑ撍���ԍ�)
				struct.setCUST_UNIT_PRICE_TYP("1"); // ����P���敪(1:�m��)
				struct.setINSPC_ACPT_DATE(struct.getSALES_DATE()); // ��̌�����(����v���)
				// �ŏ���
				String exTax = "0";
				String inTax = "0";
				String tax1 = "0";
				String tax2 = "0";
				String tax3 = "0";
				if ("2".equals(taxCalcTyp)) {
					// �`�[�P��(����Ŗ��׍쐬)
					// �Ŋz�ޔ�
					exTax = struct.getEXTERNAL_TAX_AMOUNT();
					inTax = struct.getINTERNAL_TAX_AMOUNT();
					tax1 = struct.getTAX_AMOUNT_1();
					tax2 = struct.getTAX_AMOUNT_2();
					tax3 = struct.getTAX_AMOUNT_3();
					// �Ŋz�N���A
					struct.setEXTERNAL_TAX_AMOUNT("0"); // ����Ŋz�i�O�Łj
					struct.setINTERNAL_TAX_AMOUNT("0"); // ����Ŋz�i���Łj
					struct.setTAX_AMOUNT_1("0");        // �Ŋz�P
					struct.setTAX_AMOUNT_2("0");        // �Ŋz�Q
					struct.setTAX_AMOUNT_3("0");        // �Ŋz�R
				}
				struct.setOWN_CUR_SALES_AMOUNT(struct.getSALES_AMOUNT_EXCH_RATES()); // ������z(�M��)(������ы��z(�M��))
				
				// �݌ɊǗ��Ώۃt���O
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					struct.setSTOCK_CTRL_FLG("0"); // 0:�݌ɊǗ����Ȃ�
				} else {
					// �������[�h1:�o�׎���-�o�^
					// �������[�h3:�o�׎���-�ԕi
					struct.setSTOCK_CTRL_FLG("1"); // 1:�݌ɊǗ�����
				}
				// �N���A
				if (("6".equals(mode)) || ("7".equals(mode))) {
					// �������[�h6:���̑�����-�o�^
					// �������[�h7:���̑�����-�X�V
					struct.setCOMM_CD(""); // ���i�R�[�h
					struct.setSPEC(""); // �K�i
					struct.setCUST_COMM_CD(""); // ���菤�i�R�[�h
					struct.setCUST_COMM_NAME(""); // ���菤�i��
					struct.setCUST_ODR_SLIP_CD(""); // ���蒍���ԍ�
				}
				// ���|���g��������
				entity.mInsertT_AR_LEDGER_TRN.create(conn, struct);
				// ����Ŗ��׍쐬�L�����f
				if ("2".equals(taxCalcTyp)) {
					// ����Ŗ��׍쐬
					struct.setSEQ_NO("999999"); // ���ה����A��
					struct.setLINE_NO("999999"); // �s
					struct.setLINE_TYP("99"); // �Ǝ��
					struct.setCOMM_CD(""); // ���i�R�[�h(�N���A)
					struct.setCOMM_NAME(""); // ���i��(�N���A)
					struct.setITEM_CD(""); // �i�ڔԍ�(�N���A)
					struct.setSPEC(""); // �K�i(�N���A)
					struct.setPRICE_RANK_CD(""); // �P�������N(�N���A)
					struct.setINP_UNIT_PRICE("0"); // ���͒P��(�Œ�l)
					struct.setAMOUNT_TYP("2"); // ���z�敪(�Œ�l)
					struct.setSLIP_QTY("0"); // ���㐔(�Œ�l)
					struct.setPART_DLV_TIMES("0"); // ���[��(�Œ�l)
					struct.setPART_DLV_TYP("0"); // ���[�敪(�Œ�l)
					struct.setCUST_COMM_CD(""); // ���菤�i�R�[�h(�N���A)
					struct.setCUST_COMM_NAME(""); // ���菤�i��(�N���A)
					struct.setCUST_ODR_SLIP_CD(""); // ���蒍���ԍ�(�N���A)
					struct.setCUST_UNIT_PRICE_TYP("0"); // ����P���敪(�Œ�l)
					struct.setINSPC_ACPT_DATE(""); // ��̌�����(�N���A)
					struct.setINSPC_ACPT_QTY("0"); // ��̌�����(�Œ�l)
					struct.setSALES_AMOUNT("0"); // ������z(�Œ�l)
					
					// �Ŋz�i�[
					struct.setEXTERNAL_TAX_AMOUNT(exTax); // ����Ŋz�i�O�Łj
					struct.setINTERNAL_TAX_AMOUNT(inTax); // ����Ŋz�i���Łj
					struct.setTAX_AMOUNT_1(tax1);         // �Ŋz�P
					struct.setTAX_AMOUNT_2(tax2);         // �Ŋz�Q
					struct.setTAX_AMOUNT_3(tax3);         // �Ŋz�R
					
					// ���z�N���A
					struct.setEXTERNAL_TAX_SALES_AMOUNT("0"); // �O�őΏۋ��z
					struct.setINTERNAL_TAX_SALES_AMOUNT("0"); // ���őΏۋ��z
					struct.setTAXFREE_SALES_AMOUNT("0");      // ��ېőΏۋ��z
					struct.setTAX_CREDIT_SALES_AMOUNT("0");   // �Ŕ�������z
					
					struct.setOWN_CUR_SALES_AMOUNT("0"); // ������z(�M��)(�Œ�l)
					struct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT("0"); // �Ŕ�������z(�M��)(�Œ�l)
					
					// ���|���g��������
					entity.mInsertT_AR_LEDGER_TRN.create(conn, struct);
				}
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "KI00017";
			}
		}
		
		/**
		 * ���|���g�����w�b�_���݃`�F�b�N<BR>
		 *
		 * @return ���ݗL��
		 */
		protected boolean isSelectArLedgerHTrn() {
			try {
				list = entity.mSelectT_AR_LEDGER_H_TRN.read(conn, struct);
				if (!(list.isEmpty())) {
					return true; // ����
				} else {
					return false; // ������
				}
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		
		/**
		 * ���|�������w�b�_���݃`�F�b�N<BR>
		 *
		 * @return ���ݗL��
		 */
		protected boolean isSelectArLedgerH() {
			try {
				list = entity.mSelectT_AR_LEDGER_H.read(conn, struct);
				if (!(list.isEmpty())) {
					return true; // ����
				} else {
					return false; // ������
				}
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		/**
		 * ���|���g�����w�b�_�폜<BR>
		 * ���|���g�����폜<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String deleteArLedgerHTrn() {
			try {
				int ret = entity.mDeleteT_AR_LEDGER_H_TRN.delete(conn, struct);
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "KI00018";
			}
		}
		
		/**
		 * ���|���g�������׍폜<BR>
		 * ���|���g�����폜<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String deleteArLedgerTrn() {
			try {
				int ret = entity.mDeleteT_AR_LEDGER_TRN.delete(conn, struct);
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "KI00019";
			}
		}
			
		/**
		 * ���|���g���������w�b�_�ԓ`�X�V<BR>
		 * ���|���g�����ԓ`�ǉ��E�X�V<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String updateArLedgerH() {
			try {
				int ret = entity.mUpdateT_AR_LEDGER_H.update(conn, struct);
				if (ret == 0) {
					return "KI00020";
				}
					return "0";
				} catch (Exception e) {
					e.printStackTrace();
					return "KI00021";
			}
		}
		
		/**
		 * ���|���g�����w�b�_�ԓ`�ǉ�<BR>
		 * ���|���g�����ԓ`�ǉ��E�X�V<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String insertIntoeArLedgerHTrn() {
			try {
				// �V�X�e�����t�̎擾
				// ���L�̃��\�b�h�ōs��
				beginTransaction();
				struct.setSYSTEMDATE(struct.getsSysdate());
				struct.setSYSTEMUSER(struct.getsUser_ID());
				struct.setPROGRAMID("KZ1010P001");
				entity.mInsertIntoT_AR_LEDGER_H_TRN.create(conn, struct);
				return "0";
			} catch (Exception e) {
				e.printStackTrace();
				return "KI00016";
			}
		}
		
		/**
		 * ���|���g�������אԓ`�ǉ�<BR>
		 * ���|���g�����ԓ`�ǉ��E�X�V<BR>
		 *
		 * @return ���b�Z�[�W�ԍ�(����I����:0)
		 */
		protected String insertIntoeArLedgerTrn() {
			 try {
			 	list = entity.mSelectT_AR_LEDGER.read(conn, struct);
			 	if (list.isEmpty()) {
			 		return "KI00024";
			 	}
			 	entity.mInsertIntoT_AR_LEDGER_TRN.create(conn, struct);
			 	return "0";
			 } catch (Exception e) {
			 	e.printStackTrace();
			 	return "KI00017";
			 }
		}
		/**
		 * ����Ōv�Z����
		 * ���|���g�����ǉ�<BR>
		 */
		protected void calculateTax(String mode) {
			// ��������
			String taxCalcTyp = struct.getTAX_CALC_TYP(); // ����Ōv�Z�敪
			String taxCd = struct.getTAX_CD(); // ����ŃR�[�h
			System.out.println("11111111-------"+taxCd);
			//Add Start 20131230 liu-chy
			if ("1".equals(mode) || "3".equals(mode)) {
	        	taxCd = struct.getT_ODR_TAX_CD();
	        	struct.setTAX_CD(struct.getT_ODR_TAX_CD()); // ����ŃR�[�h
	        	System.out.println("2222222222222-------"+taxCd);
			}
			System.out.println(struct.getT_ODR_TAX_CD());
			//Add End 20131230 liu-chy
			String balanceClassCd = struct.getBALANCE_CLASS_CD(); // �c�����ރR�[�h
			String amount = struct.getSALES_AMOUNT(); // ������ы��z
			String taxDate = struct.getSALES_DATE(); // ����v���
			// ���z
			if ((amount == null) || (amount.length() == 0)) {
			    amount = "0";
			}
			
			// ����Ōv�Z�敪���f
			if ("99".equals(balanceClassCd)) {
				// �c�����ރR�[�h = "99"
				taxCalcTyp = "0"; // �Ōv�Z����
			} else if ((taxCalcTyp == null) || (taxCalcTyp.length() == 0)) {
				// ����Ōv�Z�敪���ݒ�
				taxCalcTyp = "0"; // �Ōv�Z����
			} else if ((!"1".equals(taxCalcTyp)) && (!"2".equals(taxCalcTyp)) &&
				(!"3".equals(taxCalcTyp))) {
				// ����Ōv�Z�敪��ݒ�
				taxCalcTyp = "0"; // �Ōv�Z����
			}
			// �ېŕ��@
			String taxCd2 = "";
			if ((taxCd == null) || (taxCd.length() < 3)) {
				// ����ŃR�[�h�R������
				taxCalcTyp = "0"; // �Ōv�Z����
			} else {
				taxCd2 = taxCd.substring(2, 3);
			}
			struct.setTAX_CD_2(taxCd2);
			
			// �ŗ��擾
			String taxRate1 = "0"; // �ŗ��P
			String taxRate2 = "0"; // �ŗ��Q
			String taxRate3 = "0"; // �ŗ��R
			String roundTyp = "1"; // �[�������敪
			int roundTyp2 = BigDecimal.ROUND_HALF_UP; // �P�������敪 (BigDecimal)
			try {
				list = entity.mSelectM_TAX.read(conn, struct);
				if (!(list.isEmpty())) {
					tempStruct = (KZ1010P001Struct) list.get(0);
					String newTaxDate = tempStruct.getNEW_TAX_RATE_START_DATE(); // �V����ŃR�[�h�J�n��
					if ((taxDate != null) && (taxDate.compareTo(newTaxDate) < 0)) {
						// ���ŗ��K�p
						taxRate1 = tempStruct.getOLD_TAX_RATE_1();
						taxRate2 = tempStruct.getOLD_TAX_RATE_2();
						taxRate3 = tempStruct.getOLD_TAX_RATE_3();
					} else {
						// �V�ŗ��K�p
						taxRate1 = tempStruct.getNEW_TAX_RATE_1();
						taxRate2 = tempStruct.getNEW_TAX_RATE_2();
						taxRate3 = tempStruct.getNEW_TAX_RATE_3();
					}
					roundTyp = tempStruct.getROUND_TYP();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// �P�������敪 (BigDecimal)
			if ("2".equals(roundTyp)) {
				// �؂�グ
				roundTyp2 = BigDecimal.ROUND_UP;
			} else if ("3".equals(roundTyp)) {
				// �؎̂�
				roundTyp2 = BigDecimal.ROUND_DOWN;
			}
			
			// �ʉݗL������ (�����_�ȉ�)
			String decimalFig = "0";
			int decimalFig2 = 0;
			try {
				list = entity.mSelectM_CUR.read(conn, struct);
				if (!(list.isEmpty())) {
					tempStruct = (KZ1010P001Struct) list.get(0);
					decimalFig = tempStruct.getDECIMAL_FIG();
				}
				decimalFig2 = Integer.parseInt(decimalFig);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// �����l (���Œl)
			struct.setEXTERNAL_TAX_SALES_AMOUNT("0");  // �O�őΏۋ��z
			struct.setINTERNAL_TAX_SALES_AMOUNT("0");  // ���őΏۋ��z
			struct.setTAXFREE_SALES_AMOUNT(amount);    // ��ېőΏۋ��z
			struct.setTAX_CREDIT_SALES_AMOUNT(amount); // �Ŕ�������z
			struct.setEXTERNAL_TAX_AMOUNT("0");        // ����Ŋz�i�O�Łj
			struct.setINTERNAL_TAX_AMOUNT("0");        // ����Ŋz�i���Łj
			struct.setTAX_AMOUNT_1("0");               // �Ŋz�P
			struct.setTAX_AMOUNT_2("0");               // �Ŋz�Q
			struct.setTAX_AMOUNT_3("0");               // �Ŋz�R
			if ("0".equals(taxCalcTyp)) {
				// ����
			} else if ("1".equals(taxCalcTyp)) {
				// ���גP�ʌv�Z
				if ("1".equals(taxCd2)) {
					// �ېŕ��@:1 (�O��)
					struct.setEXTERNAL_TAX_SALES_AMOUNT(amount); // �O�őΏۋ��z
					struct.setTAXFREE_SALES_AMOUNT("0");         // ��ېőΏۋ��z
					// �O�Ōv�Z
					String tax1 = exTax(amount, taxRate1, decimalFig2, roundTyp2);
					String tax2 = exTax(amount, taxRate2, decimalFig2, roundTyp2);
					String tax3 = exTax(amount, taxRate3, decimalFig2, roundTyp2);
					String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
					struct.setTAX_AMOUNT_1(tax1); // �Ŋz�P
					struct.setTAX_AMOUNT_2(tax2); // �Ŋz�Q
					struct.setTAX_AMOUNT_3(tax3); // �Ŋz�R
					struct.setEXTERNAL_TAX_AMOUNT(tax); // ����Ŋz�i�O�Łj
				} else if (("5".equals(taxCd2)) || ("9".equals(taxCd2))) {
					// �ېŕ��@:5 or 9 (����)
					struct.setINTERNAL_TAX_SALES_AMOUNT(amount); // ���őΏۋ��z
					struct.setTAXFREE_SALES_AMOUNT("0");         // ��ېőΏۋ��z
					// ���Ōv�Z
					String tax1 = inTax(amount, taxRate1, decimalFig2, roundTyp2);
					String tax2 = inTax(amount, taxRate2, decimalFig2, roundTyp2);
					String tax3 = inTax(amount, taxRate3, decimalFig2, roundTyp2);
					String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
					struct.setTAX_AMOUNT_1(tax1); // �Ŋz�P
					struct.setTAX_AMOUNT_2(tax2); // �Ŋz�Q
					struct.setTAX_AMOUNT_3(tax3); // �Ŋz�R
					struct.setINTERNAL_TAX_AMOUNT(tax); // ����Ŋz�i���Łj
					struct.setTAX_CREDIT_SALES_AMOUNT(Calculate.subtract (amount, tax)); // �Ŕ�������z
				}
			} else if ("2".equals(taxCalcTyp)) {
				// �`�[�P�ʌv�Z
				if ("1".equals(taxCd2)) {
					// �ېŕ��@:1 (�O��)
					struct.setEXTERNAL_TAX_SALES_AMOUNT(amount); // �O�őΏۋ��z
					struct.setTAXFREE_SALES_AMOUNT("0");         // ��ېőΏۋ��z
					// �O�Ōv�Z
					String tax1 = exTax(amount, taxRate1, decimalFig2, roundTyp2);
					String tax2 = exTax(amount, taxRate2, decimalFig2, roundTyp2);
					String tax3 = exTax(amount, taxRate3, decimalFig2, roundTyp2);
					String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
					struct.setTAX_AMOUNT_1(tax1); // �Ŋz�P
					struct.setTAX_AMOUNT_2(tax2); // �Ŋz�Q
					struct.setTAX_AMOUNT_3(tax3); // �Ŋz�R
					struct.setEXTERNAL_TAX_AMOUNT(tax); // ����Ŋz�i�O��
				} else if (("5".equals(taxCd2)) || ("9".equals(taxCd2))) {
					// �ېŕ��@:5 or 9 (����)
					struct.setINTERNAL_TAX_SALES_AMOUNT(amount); // ���őΏۋ��z
					struct.setTAXFREE_SALES_AMOUNT("0");         // ��ېőΏۋ��z
					// ���Ōv�Z
					String tax1 = inTax(amount, taxRate1, decimalFig2, roundTyp2);
					String tax2 = inTax(amount, taxRate2, decimalFig2, roundTyp2);
					String tax3 = inTax(amount, taxRate3, decimalFig2, roundTyp2);
					String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
					struct.setTAX_AMOUNT_1(tax1); // �Ŋz�P
					struct.setTAX_AMOUNT_2(tax2); // �Ŋz�Q
					struct.setTAX_AMOUNT_3(tax3); // �Ŋz�R
					struct.setINTERNAL_TAX_AMOUNT(tax); // ����Ŋz�i���Łj
					struct.setTAX_CREDIT_SALES_AMOUNT(Calculate.subtract (amount, tax)); // �Ŕ�������z
				}
			} else if ("3".equals(taxCalcTyp)) {
				// �����P�ʌv�Z
				if ("1".equals(taxCd2)) {
					// �ېŕ��@:1 (�O��)
					struct.setEXTERNAL_TAX_SALES_AMOUNT(amount); // �O�őΏۋ��z
					struct.setTAXFREE_SALES_AMOUNT("0");         // ��ېőΏۋ��z
				} else if (("5".equals(taxCd2)) || ("9".equals(taxCd2)))  {
					// �ېŕ��@:5 or 9 (����)
					struct.setINTERNAL_TAX_SALES_AMOUNT(amount); // ���őΏۋ��z
					struct.setTAXFREE_SALES_AMOUNT("0");         // ��ېőΏۋ��z
					// ���Ōv�Z
					String tax1 = inTax(amount, taxRate1, decimalFig2, roundTyp2);
					String tax2 = inTax(amount, taxRate2, decimalFig2, roundTyp2);
					String tax3 = inTax(amount, taxRate3, decimalFig2, roundTyp2);
					String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
					struct.setTAX_CREDIT_SALES_AMOUNT(Calculate.subtract (amount, tax)); // �Ŕ�������z
				}
			}
			return;
		}
		
		/**
		 * �O�Ōv�Z (���Z�N���X�g�p)
		 *
		 * @param amount     ���z
		 * @param taxRate    �ŗ�
		 * @param decimalFig �L������(�����_�ȉ�)
		 * @param roundTyp   �ۂ߃^�C�v
		 *
		 * @return �Ŋz
		*/
		private String exTax(String amount, String taxRate, int decimalFig, int roundTyp) {
			return Calculate.divide(Calculate.multiply(amount, taxRate),"100", decimalFig, roundTyp);
		}
		
		/**
		 * ���Ōv�Z (���Z�N���X�g�p)
		 *
		 * @param amount     ���z
		 * @param taxRate    �ŗ�
		 * @param decimalFig �L������(�����_�ȉ�)
		 * @param roundTyp   �ۂ߃^�C�v
		 *
		 * @return �Ŋz
		 */
		private String inTax(String amount, String taxRate, int decimalFig, int roundTyp) {
			return Calculate.divide(Calculate.multiply(amount, taxRate), Calculate.add("100", taxRate), decimalFig, roundTyp);
		}
        //}}user_implement_code_main

	//////////////////////////////


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.expj.motorparts.KZ1010");
		logger.entering("KZ1010P001Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KZ1010P001Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.expj.motorparts.KZ1010");
		logger.entering("KZ1010P001Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
*/
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
//				controlSelect();
			}

/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			//
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KZ1010P001Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.expj.motorparts.KZ1010");
		logger.entering("KZ1010P001Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KZ1010P001Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("initial") ) {
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
//			throw new FoundationException("KZ1010P001Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KZ1010P001-E999","CSV�̏o�͏���"));
			throw new FoundationException("KZ1010P001Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KZ1010P001-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KZ1010P001Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KZ1010P001-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KZ1010P001Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KZ1010P001Entity entity;
	protected KZ1010P001Struct struct;
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

		entity = new KZ1010P001Entity();
		struct = new KZ1010P001Struct();

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
	 * KZ1010P001�N���X�̕W���R���X�g���N�^
	 */
	public KZ1010P001Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
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
				KZ1010P001Struct key = (KZ1010P001Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP") && key.getSLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("SLIP_CTRL_GRP", key.getSLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TRN_CD") && key.getSLIP_TRN_CD() != null) {
					msgKey.setKeyValue("SLIP_TRN_CD", key.getSLIP_TRN_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_CLASS_CD") && key.getSTOCK_CLASS_CD() != null) {
					msgKey.setKeyValue("STOCK_CLASS_CD", key.getSTOCK_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("BALANCE_CLASS_CD") && key.getBALANCE_CLASS_CD() != null) {
					msgKey.setKeyValue("BALANCE_CLASS_CD", key.getBALANCE_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES") && key.getSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_EXCH_RATES", key.getSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("FINAL_DLV_LOC_CD") && key.getFINAL_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("FINAL_DLV_LOC_CD", key.getFINAL_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DATE") && key.getSHIP_DATE() != null) {
					msgKey.setKeyValue("SHIP_DATE", key.getSHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_CTL_NO") && key.getODR_CTL_NO() != null) {
					msgKey.setKeyValue("ODR_CTL_NO", key.getODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO") && key.getPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("PART_DLV_SEQ_NO", key.getPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_NO") && key.getSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("SHIP_ODR_NO", key.getSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("PURPOSE_UNIT_PRICE_TYP") && key.getPURPOSE_UNIT_PRICE_TYP() != null) {
					msgKey.setKeyValue("PURPOSE_UNIT_PRICE_TYP", key.getPURPOSE_UNIT_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE") && key.getSHIP_PLAN_DATE() != null) {
					msgKey.setKeyValue("SHIP_PLAN_DATE", key.getSHIP_PLAN_DATE());
				}
				if(msgKeyType.containsKeyColumn("SCDL_DLV_DATE") && key.getSCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("SCDL_DLV_DATE", key.getSCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("UNCNFM_CUST_ODR_CREATE_DATE") && key.getUNCNFM_CUST_ODR_CREATE_DATE() != null) {
					msgKey.setKeyValue("UNCNFM_CUST_ODR_CREATE_DATE", key.getUNCNFM_CUST_ODR_CREATE_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD") && key.getCUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_KEY_CD", key.getCUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_TYP") && key.getAMOUNT_TYP() != null) {
					msgKey.setKeyValue("AMOUNT_TYP", key.getAMOUNT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("SHIP_COUNT") && key.getSHIP_COUNT() != null) {
					msgKey.setKeyValue("SHIP_COUNT", key.getSHIP_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("T_ODR_TAX_CD") && key.getT_ODR_TAX_CD() != null) {
					msgKey.setKeyValue("T_ODR_TAX_CD", key.getT_ODR_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_UNIT_PRICE_SALES_FLG") && key.getTEMP_UNIT_PRICE_SALES_FLG() != null) {
					msgKey.setKeyValue("TEMP_UNIT_PRICE_SALES_FLG", key.getTEMP_UNIT_PRICE_SALES_FLG());
				}
				if(msgKeyType.containsKeyColumn("CLAIM_CYCLE_TYP") && key.getCLAIM_CYCLE_TYP() != null) {
					msgKey.setKeyValue("CLAIM_CYCLE_TYP", key.getCLAIM_CYCLE_TYP());
				}
				if(msgKeyType.containsKeyColumn("RM_INP_TYP") && key.getRM_INP_TYP() != null) {
					msgKey.setKeyValue("RM_INP_TYP", key.getRM_INP_TYP());
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
				if(msgKeyType.containsKeyColumn("CUST_VARIOUS_TYP") && key.getCUST_VARIOUS_TYP() != null) {
					msgKey.setKeyValue("CUST_VARIOUS_TYP", key.getCUST_VARIOUS_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_1") && key.getSLIP_PRINTING_TYP_1() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_1", key.getSLIP_PRINTING_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_2") && key.getSLIP_PRINTING_TYP_2() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_2", key.getSLIP_PRINTING_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_3") && key.getSLIP_PRINTING_TYP_3() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_3", key.getSLIP_PRINTING_TYP_3());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_4") && key.getSLIP_PRINTING_TYP_4() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_4", key.getSLIP_PRINTING_TYP_4());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_5") && key.getSLIP_PRINTING_TYP_5() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_5", key.getSLIP_PRINTING_TYP_5());
				}
				if(msgKeyType.containsKeyColumn("PRICE_RANK_CD") && key.getPRICE_RANK_CD() != null) {
					msgKey.setKeyValue("PRICE_RANK_CD", key.getPRICE_RANK_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRICE_ROUND_TYP") && key.getPRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("PRICE_ROUND_TYP", key.getPRICE_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("SHIP_SLIP_ID") && key.getSHIP_SLIP_ID() != null) {
					msgKey.setKeyValue("SHIP_SLIP_ID", key.getSHIP_SLIP_ID());
				}
				if(msgKeyType.containsKeyColumn("CARRIAGE_CHARGE_TYP") && key.getCARRIAGE_CHARGE_TYP() != null) {
					msgKey.setKeyValue("CARRIAGE_CHARGE_TYP", key.getCARRIAGE_CHARGE_TYP());
				}
				if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD") && key.getBILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("BILL_ADDRESSEE_CD", key.getBILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("STL_COND_CD") && key.getSTL_COND_CD() != null) {
					msgKey.setKeyValue("STL_COND_CD", key.getSTL_COND_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
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
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_DATE") && key.getSLIP_DATE() != null) {
					msgKey.setKeyValue("SLIP_DATE", key.getSLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_SLIP_CD") && key.getSHIP_SLIP_CD() != null) {
					msgKey.setKeyValue("SHIP_SLIP_CD", key.getSHIP_SLIP_CD());
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
				if(msgKeyType.containsKeyColumn("EDI_DATA_TYP") && key.getEDI_DATA_TYP() != null) {
					msgKey.setKeyValue("EDI_DATA_TYP", key.getEDI_DATA_TYP());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1") && key.getOLD_TAX_RATE_1() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_1", key.getOLD_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2") && key.getOLD_TAX_RATE_2() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_2", key.getOLD_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3") && key.getOLD_TAX_RATE_3() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_3", key.getOLD_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE") && key.getNEW_TAX_RATE_START_DATE() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_START_DATE", key.getNEW_TAX_RATE_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1") && key.getNEW_TAX_RATE_1() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_1", key.getNEW_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2") && key.getNEW_TAX_RATE_2() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_2", key.getNEW_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3") && key.getNEW_TAX_RATE_3() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_3", key.getNEW_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("LINE_NO") && key.getLINE_NO() != null) {
					msgKey.setKeyValue("LINE_NO", key.getLINE_NO());
				}
				if(msgKeyType.containsKeyColumn("LINE_TYP") && key.getLINE_TYP() != null) {
					msgKey.setKeyValue("LINE_TYP", key.getLINE_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMM_CD") && key.getCOMM_CD() != null) {
					msgKey.setKeyValue("COMM_CD", key.getCOMM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMM_NAME") && key.getCOMM_NAME() != null) {
					msgKey.setKeyValue("COMM_NAME", key.getCOMM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD_2") && key.getTAX_CD_2() != null) {
					msgKey.setKeyValue("TAX_CD_2", key.getTAX_CD_2());
				}
				if(msgKeyType.containsKeyColumn("INP_UNIT_PRICE") && key.getINP_UNIT_PRICE() != null) {
					msgKey.setKeyValue("INP_UNIT_PRICE", key.getINP_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_QTY") && key.getSLIP_QTY() != null) {
					msgKey.setKeyValue("SLIP_QTY", key.getSLIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_TIMES") && key.getPART_DLV_TIMES() != null) {
					msgKey.setKeyValue("PART_DLV_TIMES", key.getPART_DLV_TIMES());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_TYP") && key.getPART_DLV_TYP() != null) {
					msgKey.setKeyValue("PART_DLV_TYP", key.getPART_DLV_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_COMM_CD") && key.getCUST_COMM_CD() != null) {
					msgKey.setKeyValue("CUST_COMM_CD", key.getCUST_COMM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_COMM_NAME") && key.getCUST_COMM_NAME() != null) {
					msgKey.setKeyValue("CUST_COMM_NAME", key.getCUST_COMM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_SLIP_CD") && key.getCUST_ODR_SLIP_CD() != null) {
					msgKey.setKeyValue("CUST_ODR_SLIP_CD", key.getCUST_ODR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_UNIT_PRICE_TYP") && key.getCUST_UNIT_PRICE_TYP() != null) {
					msgKey.setKeyValue("CUST_UNIT_PRICE_TYP", key.getCUST_UNIT_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_SALES_AMOUNT") && key.getOWN_CUR_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_SALES_AMOUNT", key.getOWN_CUR_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG") && key.getSTOCK_CTRL_FLG() != null) {
					msgKey.setKeyValue("STOCK_CTRL_FLG", key.getSTOCK_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("DUMMY") && key.getDUMMY() != null) {
					msgKey.setKeyValue("DUMMY", key.getDUMMY());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD2") && key.getSLIP_CD2() != null) {
					msgKey.setKeyValue("SLIP_CD2", key.getSLIP_CD2());
				}
				if(msgKeyType.containsKeyColumn("SYSTEMDATE") && key.getSYSTEMDATE() != null) {
					msgKey.setKeyValue("SYSTEMDATE", key.getSYSTEMDATE());
				}
				if(msgKeyType.containsKeyColumn("SYSTEMUSER") && key.getSYSTEMUSER() != null) {
					msgKey.setKeyValue("SYSTEMUSER", key.getSYSTEMUSER());
				}
				if(msgKeyType.containsKeyColumn("PROGRAMID") && key.getPROGRAMID() != null) {
					msgKey.setKeyValue("PROGRAMID", key.getPROGRAMID());
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
					KZ1010P001Struct key = new KZ1010P001Struct();
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP")) {
						key.setSLIP_CTRL_GRP(msgKey.getKeyValue("SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TRN_CD")) {
						key.setSLIP_TRN_CD(msgKey.getKeyValue("SLIP_TRN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_CLASS_CD")) {
						key.setSTOCK_CLASS_CD(msgKey.getKeyValue("STOCK_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("BALANCE_CLASS_CD")) {
						key.setBALANCE_CLASS_CD(msgKey.getKeyValue("BALANCE_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES")) {
						key.setSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_DLV_LOC_CD")) {
						key.setFINAL_DLV_LOC_CD(msgKey.getKeyValue("FINAL_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DATE")) {
						key.setSHIP_DATE(msgKey.getKeyValue("SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CTL_NO")) {
						key.setODR_CTL_NO(msgKey.getKeyValue("ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO")) {
						key.setPART_DLV_SEQ_NO(msgKey.getKeyValue("PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_NO")) {
						key.setSHIP_ODR_NO(msgKey.getKeyValue("SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("PURPOSE_UNIT_PRICE_TYP")) {
						key.setPURPOSE_UNIT_PRICE_TYP(msgKey.getKeyValue("PURPOSE_UNIT_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE")) {
						key.setSHIP_PLAN_DATE(msgKey.getKeyValue("SHIP_PLAN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_DLV_DATE")) {
						key.setSCDL_DLV_DATE(msgKey.getKeyValue("SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UNCNFM_CUST_ODR_CREATE_DATE")) {
						key.setUNCNFM_CUST_ODR_CREATE_DATE(msgKey.getKeyValue("UNCNFM_CUST_ODR_CREATE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD")) {
						key.setCUS_DLV_KEY_CD(msgKey.getKeyValue("CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_TYP")) {
						key.setAMOUNT_TYP(msgKey.getKeyValue("AMOUNT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_COUNT")) {
						key.setSHIP_COUNT(msgKey.getKeyValue("SHIP_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("T_ODR_TAX_CD")) {
						key.setT_ODR_TAX_CD(msgKey.getKeyValue("T_ODR_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_UNIT_PRICE_SALES_FLG")) {
						key.setTEMP_UNIT_PRICE_SALES_FLG(msgKey.getKeyValue("TEMP_UNIT_PRICE_SALES_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CLAIM_CYCLE_TYP")) {
						key.setCLAIM_CYCLE_TYP(msgKey.getKeyValue("CLAIM_CYCLE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RM_INP_TYP")) {
						key.setRM_INP_TYP(msgKey.getKeyValue("RM_INP_TYP"));
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
					if(msgKeyType.containsKeyColumn("CUST_VARIOUS_TYP")) {
						key.setCUST_VARIOUS_TYP(msgKey.getKeyValue("CUST_VARIOUS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_1")) {
						key.setSLIP_PRINTING_TYP_1(msgKey.getKeyValue("SLIP_PRINTING_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_2")) {
						key.setSLIP_PRINTING_TYP_2(msgKey.getKeyValue("SLIP_PRINTING_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_3")) {
						key.setSLIP_PRINTING_TYP_3(msgKey.getKeyValue("SLIP_PRINTING_TYP_3"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_4")) {
						key.setSLIP_PRINTING_TYP_4(msgKey.getKeyValue("SLIP_PRINTING_TYP_4"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_5")) {
						key.setSLIP_PRINTING_TYP_5(msgKey.getKeyValue("SLIP_PRINTING_TYP_5"));
					}
					if(msgKeyType.containsKeyColumn("PRICE_RANK_CD")) {
						key.setPRICE_RANK_CD(msgKey.getKeyValue("PRICE_RANK_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRICE_ROUND_TYP")) {
						key.setPRICE_ROUND_TYP(msgKey.getKeyValue("PRICE_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_SLIP_ID")) {
						key.setSHIP_SLIP_ID(msgKey.getKeyValue("SHIP_SLIP_ID"));
					}
					if(msgKeyType.containsKeyColumn("CARRIAGE_CHARGE_TYP")) {
						key.setCARRIAGE_CHARGE_TYP(msgKey.getKeyValue("CARRIAGE_CHARGE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD")) {
						key.setBILL_ADDRESSEE_CD(msgKey.getKeyValue("BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STL_COND_CD")) {
						key.setSTL_COND_CD(msgKey.getKeyValue("STL_COND_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
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
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_DATE")) {
						key.setSLIP_DATE(msgKey.getKeyValue("SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_SLIP_CD")) {
						key.setSHIP_SLIP_CD(msgKey.getKeyValue("SHIP_SLIP_CD"));
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
					if(msgKeyType.containsKeyColumn("EDI_DATA_TYP")) {
						key.setEDI_DATA_TYP(msgKey.getKeyValue("EDI_DATA_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1")) {
						key.setOLD_TAX_RATE_1(msgKey.getKeyValue("OLD_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2")) {
						key.setOLD_TAX_RATE_2(msgKey.getKeyValue("OLD_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3")) {
						key.setOLD_TAX_RATE_3(msgKey.getKeyValue("OLD_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE")) {
						key.setNEW_TAX_RATE_START_DATE(msgKey.getKeyValue("NEW_TAX_RATE_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1")) {
						key.setNEW_TAX_RATE_1(msgKey.getKeyValue("NEW_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2")) {
						key.setNEW_TAX_RATE_2(msgKey.getKeyValue("NEW_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3")) {
						key.setNEW_TAX_RATE_3(msgKey.getKeyValue("NEW_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("LINE_NO")) {
						key.setLINE_NO(msgKey.getKeyValue("LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("LINE_TYP")) {
						key.setLINE_TYP(msgKey.getKeyValue("LINE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMM_CD")) {
						key.setCOMM_CD(msgKey.getKeyValue("COMM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMM_NAME")) {
						key.setCOMM_NAME(msgKey.getKeyValue("COMM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD_2")) {
						key.setTAX_CD_2(msgKey.getKeyValue("TAX_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("INP_UNIT_PRICE")) {
						key.setINP_UNIT_PRICE(msgKey.getKeyValue("INP_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_QTY")) {
						key.setSLIP_QTY(msgKey.getKeyValue("SLIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_TIMES")) {
						key.setPART_DLV_TIMES(msgKey.getKeyValue("PART_DLV_TIMES"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_TYP")) {
						key.setPART_DLV_TYP(msgKey.getKeyValue("PART_DLV_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_COMM_CD")) {
						key.setCUST_COMM_CD(msgKey.getKeyValue("CUST_COMM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_COMM_NAME")) {
						key.setCUST_COMM_NAME(msgKey.getKeyValue("CUST_COMM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_SLIP_CD")) {
						key.setCUST_ODR_SLIP_CD(msgKey.getKeyValue("CUST_ODR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_UNIT_PRICE_TYP")) {
						key.setCUST_UNIT_PRICE_TYP(msgKey.getKeyValue("CUST_UNIT_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_SALES_AMOUNT")) {
						key.setOWN_CUR_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG")) {
						key.setSTOCK_CTRL_FLG(msgKey.getKeyValue("STOCK_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DUMMY")) {
						key.setDUMMY(msgKey.getKeyValue("DUMMY"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD2")) {
						key.setSLIP_CD2(msgKey.getKeyValue("SLIP_CD2"));
					}
					if(msgKeyType.containsKeyColumn("SYSTEMDATE")) {
						key.setSYSTEMDATE(msgKey.getKeyValue("SYSTEMDATE"));
					}
					if(msgKeyType.containsKeyColumn("SYSTEMUSER")) {
						key.setSYSTEMUSER(msgKey.getKeyValue("SYSTEMUSER"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAMID")) {
						key.setPROGRAMID(msgKey.getKeyValue("PROGRAMID"));
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
