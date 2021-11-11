/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/src/com/nec/jp/orteus/metamorBase/KA0100/KA0100020Control.java,v $
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
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KA0100020Control
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
        public KA0100020Struct getListvalue(int x) { return (KA0100020Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public KA0100020Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public KA0100020Struct createStruct() { return new KA0100020Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((KA0100020Struct)structname); }	// Struct���Z�b�g���܂��B
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
         * ��ʑJ�ڃL�[(�ڋq�R�[�h)
         */
        private String _dlvLocCd;

        /**
         * ��ʑJ�ڃL�[(�ڋq�R�[�h)�ݒ�
         * @param cd �ڋq�R�[�h
         */
        protected void setDlvLocCd(String cd){ _dlvLocCd = cd; };

        /**
         * ��ʑJ�ڃL�[(�ڋq�R�[�h)�擾
         * @return �ڋq�R�[�h
         */
        protected String getDlvLocCd(){ return _dlvLocCd; };

// add �W��G ��
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

       // ----- �V�X�^���ݒ�l�擾 ---------------	
    	private PrivateConfig privateConfig;
        // ----- �V�X�^���ݒ�l�擾 ---------------		        
        // ���Ӑ�[�i�ꏊ���F
        String aprMCustDlvLoc;		        
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
//    ------------------------------------------------------------------------------

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
        //MessageConfig _msgConfig = null;

        /** ���b�Z�[�W */
        //MessageStruct _msgStruct = msgStruct;

        /** �V�X�e�����O */
        SystemLog _sysLog = sysLog;

//-----------------------------------------------------------------------------
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;

        /**
         * �X�V�^�폜�\���`�F�b�N����<BR>
         * �P�D�������ʂ����݂��邱�Ɓi�������Ɠ��������œǂݍ��݁j
         * �Q�D�X�V�J�E���^���������Ɠ���ł��邱��
         *
         * @param KA0100020Struct Struct
         * @return boolean true:�X�V�폜�\ false:�X�V�폜�s��
         */
        private boolean isUpdatable(KA0100020Struct chk) throws FoundationException,SQLException
        {


                List listCheck = null;

                //�ǂݍ���

                listCheck = entity.mselect.read(conn,chk);

                if(listCheck == null || listCheck.size() != 1){
                        //�ǂݍ��ݎ��s�i�������ɃX�e�[�^�X���ω��������A�폜���ꂽ�ꍇ�j

                        //�G���[����
                        setErrorMessage("ZZ06001");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+chk.getDLV_LOC_CD());
                        return false;
                }
                KA0100020Struct rst = (KA0100020Struct)listCheck.get(0);
                //�X�V�J�E���^�`�F�b�N
                // �ޔ������Ă����J�E���^�ƁA�����œǂݍ��񂾌��ݒl���r����B


                double bef_mod = Double.parseDouble((String)struct.geth_MODIFY_COUNT());
                double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());
                if(bef_mod != aft_mod)
        {
                        //�X�V�J�E���^���ω�����



                        //�G���[����
                        setErrorMessage("AC50802");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+chk.getDLV_LOC_CD());
                        return false;
                }
                
                //�Y�����Ӑ�[�i�ꏊ���g�����a���q�ɋ敪=20�󒍖��ׂ̑��݃`�F�b�N
                List CheckOdr = entity.mselectT_ODR.read(conn,struct);
                if (CheckOdr != null && CheckOdr.size() != 0){
                	setErrorMessage("KA10099");
                	return false;
                }
                return true;
        }
//--------------------------------------------------------------------------------------------
        /**
         * DB�o�^/�X�V������ �ݒ���e�`�F�b�N
         *
         * @return  true:OK / false:NG
         */
        private boolean isValidContents()throws FoundationException, SQLException
        {
                boolean result = true;


                //�ڋq�R�[�h���݃`�F�b�N
                List listM_CUST = entity.mcheckM_CUST.read(conn, struct);

                if (listM_CUST == null || listM_CUST.size() == 0) {
                        result =false;
                        setErrorMessage("KA00032");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
			setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());

                } else {




			//���o�a���ۊǋ�̃`�F�b�N
                        String strWhTyp = ((KA0100020Struct)listM_CUST.get(0)).getDEPO_TYP() ;
                        String strDepoWhCd = struct.getDEPO_WH_CD() ;


                        if (strWhTyp != null && strWhTyp.equals("20")) {
                                if (strDepoWhCd == null || strDepoWhCd.equals("")) {

                                        result = false;
                                        setErrorMessage("KA00114");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
					setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                                }
                        }
                        if(strDepoWhCd != null && !"".equals(strDepoWhCd)){
                                boolean blnChkDepoCd = entity.mcheckDepoTyp.check(conn, struct);
                                if (blnChkDepoCd == false) {

                                        result =false;
                                        setErrorMessage("KA00115");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
					setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                                }
                        }

                }
                //�o�בq�ɃR�[�h�̃`�F�b�N
                if(struct.getSHIP_WH_CD() != null && !"".equals(struct.getSHIP_WH_CD())){
                          boolean blnChkShipCd = entity.mcheckShipWhCd.check(conn, struct);
                          if (blnChkShipCd == false) {

                                 result =false;
                                 setErrorMessage("KA00116");
				 setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				 setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                          }
                }


                listM_CUST.clear();

                return result;
        }
// --------------------------------------------------------------------------------------------
        
    	
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
    		
    		// �ϐ��ݒ�(�[�i�ꏊ�R�[�h)
    		MstColumns key3 = new MstColumns();
    		key3.setColumnname("DLV_LOC_CD");
    		key3.setColumnvalue(struct.getDLV_LOC_CD());
    		keyValueList.add(key3);
    		
    		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100020","KA0100020Servlet");
    		// ���F�˗����݃`�F�b�N
    		boolean rtnFlg = mstappr.checkMST_APPR("M_CUST_BASE", keyValueList);
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
        	mstApprStruct.setSCREEN_URL("KA0100020Servlet");
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
        	keyStruct.setTABLE_NAME("M_CUST_BASE");
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
        	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(�����Ǘ��R�[�h)��ǉ�����
        	mstappr.insertMST_APPR_KEY(keyStruct);
        	
        	// �L�[��(�[�i�ꏊ�R�[�h)
        	keyStruct.setKEY_NAME("DLV_LOC_CD");
        	// �L�[�l(�[�i�ꏊ�R�[�h)
        	keyStruct.setKEY_VALUE(struct.getDLV_LOC_CD());
        	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[��ǉ�����
        	mstappr.insertMST_APPR_KEY(keyStruct);
        	
        	/** ���F���ו\�֓o�^ */
        	// ��ЃR�[�h
    		String columnID = mstappr.getColumnID( "M_CUST_BASE", "COMPANY_CD");
    		mstappr.setDetailByColumnID(struct.getSYS_COMPANY_CD(),columnID);	
    		// ���Ӑ�R�[�h
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "CUST_CD");
    		mstappr.setDetailByColumnID(struct.getCUST_CD(),columnID);		
    		// �[�i�ꏊ�R�[�h
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_CD");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_CD(),columnID);
    		// �[�i�ꏊ��
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_NAME");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_NAME(),columnID);				
    		// �[�i�ꏊ���i�J�i�j
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_KNAME");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_KNAME(),columnID);		
    		// �[�i�ꏊ���i�p���j
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_ENAME");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_ENAME(),columnID);		
    		// �X�֔ԍ�
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ZIP_CD");
    		mstappr.setDetailByColumnID(struct.getZIP_CD(),columnID);			
    		//�Z���P
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_1");
    		mstappr.setDetailByColumnID(struct.getADDRESS_1(),columnID);		
    		//�Z��2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_2");
    		mstappr.setDetailByColumnID(struct.getADDRESS_2(),columnID);		
    		// �Z���i�J�i�j�P
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_1");
    		mstappr.setDetailByColumnID(struct.getADDRESS_K_1(),columnID);			
    		// �Z���i�J�i�j2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_2");
    		mstappr.setDetailByColumnID(struct.getADDRESS_K_2(),columnID);
    		// �d�b�ԍ�
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TEL");
    		mstappr.setDetailByColumnID(struct.getTEL(),columnID);		
    		// �e�`�w�ԍ�
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "FAX");
    		mstappr.setDetailByColumnID(struct.getFAX(),columnID);		
    		// �o�בq�ɃR�[�h
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "SHIP_WH_CD");
    		mstappr.setDetailByColumnID(struct.getSHIP_WH_CD(),columnID);		
    		// ���o�a���ۊǋ�
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DEPO_WH_CD");
    		mstappr.setDetailByColumnID(struct.getDEPO_WH_CD(),columnID);	
    		// �^���փR�[�h
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_CD");
    		mstappr.setDetailByColumnID(struct.getTRANSPORT_CD(),columnID);		
    		// �^���֖���
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_NAME");
    		mstappr.setDetailByColumnID("",columnID);		
    		// �^������
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_LT");
    		mstappr.setDetailByColumnID(struct.getTRANSPORT_LT(),columnID);
    		// �J�����_�ԍ�
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "CAL_NO");
    		mstappr.setDetailByColumnID("",columnID);
    		// �A���`�ԋ敪
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_TYP");
    		mstappr.setDetailByColumnID("",columnID);
    		// �[�i�J�n����
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_START_TIME");
    		mstappr.setDetailByColumnID("",columnID);
    		// �[�i�I������
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_END_TIME");
    		mstappr.setDetailByColumnID("",columnID);
    		// �n�敪�ދ敪�P
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_TYP1");
    		mstappr.setDetailByColumnID("",columnID);
    		// �n�敪�ނP
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_1");
    		mstappr.setDetailByColumnID("",columnID);
    		// �n�敪�ދ敪2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_TYP2");
    		mstappr.setDetailByColumnID("",columnID);
    		// �n�敪��2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_2");
    		mstappr.setDetailByColumnID("",columnID);
    		// �n�敪�ދ敪3
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_TYP3");
    		mstappr.setDetailByColumnID("",columnID);
    		// �n�敪��3
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_3");
    		mstappr.setDetailByColumnID("",columnID);
    		// ���l�P
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "REMARKS_1");
    		mstappr.setDetailByColumnID("",columnID);
    		// ���l2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "REMARKS_2");
    		mstappr.setDetailByColumnID("",columnID);
    		// ���l3
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "REMARKS_3");
    		mstappr.setDetailByColumnID("",columnID);
    		// �쐬��
    		columnID = mstappr.getColumnID("M_CUST_BASE","CREATED_DATE");
    		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
    		// �쐬��
    		columnID = mstappr.getColumnID("M_CUST_BASE","CREATED_BY");
    		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
    		// �쐬�v���O������
    		columnID = mstappr.getColumnID("M_CUST_BASE","CREATED_PRG_NM");
    		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
    		// �X�V��
    		columnID = mstappr.getColumnID("M_CUST_BASE","UPDATED_DATE");
    		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
    		// �X�V��
    		columnID = mstappr.getColumnID("M_CUST_BASE","UPDATED_BY");
    		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
    		// �X�V�v���O������
    		columnID = mstappr.getColumnID("M_CUST_BASE","UPDATED_PRG_NM");
    		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
    		// �X�V��
    		columnID = mstappr.getColumnID("M_CUST_BASE","MODIFY_COUNT");
    		mstappr.setDetailByColumnID("0",columnID); 
    		
    		// ���F���ׂɃf�[�^��ǉ�����B
    		mstappr.insertMST_APPR_DETAIL("M_CUST_BASE",appr_ID);
        	
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
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        try {
            boolean ok_flg = true;
            boolean result = false; // �`�F�b�N���ʊi�[

            // �������ʃt���O��NG�ɐݒ�
            struct.seth_RESULT("NG");

            //��ʃ��[�h�擾
            String strKMode = "";
            strKMode = (String) struct.getk_MODE();

            if ("INSERT".equals(strKMode)) {
                //�o�^�̎��`�F�b�N

                // �ڋq�[�i�ꏊ��� �d���`�F�b�N
                result = entity.mselect.check(conn, struct);
                if (result == true) {
                    ok_flg = false;
                    setErrorMessage("ZZ01102");
		    setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
		    setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                }
                else if (!isValidContents()) {
                    // ���͓��e�`�F�b�N
                    ok_flg = false;
                }
            }
            else if ("UPDATE".equals(strKMode)) {
                //�X�V�̎��`�F�b�N

                // �X�V�m�F
                KA0100020Struct st = (KA0100020Struct) list.get(0);
                if (isUpdatable(st) == false) {
                    //�X�V�ł��Ȃ����
                    //�G���[����

                    ok_flg = false;
                }
                else if (!isValidContents()) {
                    // ���͓��e�`�F�b�N
                    ok_flg = false;
                }
            }
            else if ("DELETE".equals(strKMode)) {
                //�폜�̎��`�F�b�N

                // �ڋq�[�i�ꏊ���̑��݊m�F
                List w = entity.mselect.read(conn, struct);
                if (w.size() == 0) {
                    ok_flg = false;
                    setErrorMessage("ZZ01105");
		    setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
		    setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                }
            }
            else {
				
				MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100020","KA0100020Servlet");
				
				// ���F��ʂ́u���F��v�{�^������J�ڂ��鎞
				if("1".equals(struct.geth_APR_CUST_DLV_LOC()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){				
					list = mstappr.selectMST_APPR_DETAIL(_APPR_ID);
				} else {
					// ����̓Ǎ��Ə��F��ʂ́u���F�O�v�{�^������J�ڂ��鎞
					list = entity.mselect.read(conn, struct);
				}
	
                //list = entity.mselect.read(conn, struct);

                if (list.size() != 0) {
					if("1".equals(struct.geth_APR_CUST_DLV_LOC()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
						list.clear();
						String columnID;
						// ���Ӑ�R�[�h
						columnID = mstappr.getColumnID( "M_CUST_BASE", "CUST_CD");
						struct.setCUST_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ���Ӑ於
						struct.seth_CUST_CD(struct.getCUST_CD());
						List custList  = entity.mcheckM_CUST.read(conn,struct);
						if(custList.size() > 0){
							struct.setCUST_NAME(((KA0100020Struct)custList.get(0)).getCUST_NAME());
						}	
			    		// �[�i�ꏊ�R�[�h
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_CD");
						struct.setDLV_LOC_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
			    		// �[�i�ꏊ��
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_NAME");
						struct.setDLV_LOC_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));			
			    		// �[�i�ꏊ���i�J�i�j
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_KNAME");
						struct.setDLV_LOC_KNAME(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// �[�i�ꏊ���i�p���j
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_ENAME");
						struct.setDLV_LOC_ENAME(mstappr.getDetailByColumnID(tempStruct,columnID));		
			    		// �X�֔ԍ�
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ZIP_CD");
						struct.setZIP_CD(mstappr.getDetailByColumnID(tempStruct,columnID));			
			    		//�Z���P
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_1");
						struct.setADDRESS_1(mstappr.getDetailByColumnID(tempStruct,columnID));		
			    		//�Z��2
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_2");
						struct.setADDRESS_2(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// �Z���i�J�i�j�P
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_1");
						struct.setADDRESS_K_1(mstappr.getDetailByColumnID(tempStruct,columnID));		
			    		// �Z���i�J�i�j2
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_2");
						struct.setADDRESS_K_2(mstappr.getDetailByColumnID(tempStruct,columnID));
			    		// �d�b�ԍ�
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TEL");
						struct.setTEL(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// �e�`�w�ԍ�
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "FAX");
						struct.setFAX(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// �o�בq�ɃR�[�h
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "SHIP_WH_CD");
						struct.setSHIP_WH_CD(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// �o�בq�ɖ�	
						List shipWh = entity.mselectShipWhCd.read(conn,struct);
						if(shipWh.size() > 0){
							struct.setSHIP_WH_NAME(((KA0100020Struct)shipWh.get(0)).getSHIP_WH_NAME());
						}
			    		// ���o�a���ۊǋ�
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DEPO_WH_CD");
						struct.setDEPO_WH_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
			    		// ���o�a���ۊǋ於
						List depoTyp = entity.mselectDepoTyp.read(conn,struct);
						if(depoTyp.size() > 0){
							struct.setDEPO_WH_NAME(((KA0100020Struct)depoTyp.get(0)).getDEPO_WH_NAME());
						}
			    		// �^���փR�[�h
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_CD");
						struct.setTRANSPORT_CD(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// �^������
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_LT");
						struct.setTRANSPORT_LT(mstappr.getDetailByColumnID(tempStruct,columnID));		
						
					}else{
	                    struct.copy( (KA0100020Struct) list.get(0));
						//��ʑJ�ڃp�����[�^���Ď擾
						struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);						
					}
                    _mode = _SELECT;
                }
                else {
                    ok_flg = false;
                    setErrorMessage("ZZ06001");
		    setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
		    setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                }
            }
            // �Ǎ��X�e�[�^�X�ݒ�
            setReadStatus(NORMAL);
            struct.seth_CUST_CD(struct.getCUST_CD());
            struct.seth_DLV_LOC_CD(struct.getDLV_LOC_CD());

            if (!"RESELECT".equals(strKMode)) {
                //�x���ȊO�̃G���[�������Ȃ��ꍇOK�ɂ���
                if (ok_flg == true) {
                    setReadStatus(NORMAL);
                    //struct.seth_RESULT("OK");
                }
                else {
                    setReadStatus(NOT_FOUND);
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            // �G���[�������L�q���Ă��������B
            setReadStatus(ERROR);
            throw new ExpjException(e);
        }
                //}}user_implement_dev:<controlselect>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                        boolean result = false;		// �`�F�b�N���ʊi�[

                        // �ڋq�[�i�ꏊ��� �d���`�F�b�N
                        result = entity.mselect.check(conn, struct);
                        if (result == true) {
                                setErrorMessage("ZZ01102");
				setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
				setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                        }else{
                                // ���͓��e�`�F�b�N
                                isValidContents();

                        }
                        // �G���[���������Ă��Ȃ��ꍇ�A�o�^�������{
                        if(msgStruct.sizeError() <= 0){

                                //��ЃR�[�h��Ǎ�
                                list = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                                struct.setSYS_COMPANY_CD(((KA0100020Struct)list.get(0)).getSYS_COMPANY_CD());
                				
                				if("1".equals(struct.geth_APR_CUST_DLV_LOC())){				
                					// ���Ӑ�[�i�ꏊ���F�̓o�^
                					boolean rtn = insertAppr("1");
                					if(!rtn) return;
                				} else {                                	
                                    //�o�^����
                                    entity.minsertM_CUST_BASE.create(conn, struct);
                				}

                                conn.commit();
                                
                                if("0".equals(struct.geth_APR_CUST_DLV_LOC())){
                    				// ����
                    				struct.setk_MODE("RESELECT");
                    				controlselect();                	
                                }

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
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                        conn.beginTransWeb();		// �g�����U�N�V�����J�n

                        //�X�V�̎��`�F�b�N

                        // �X�V�m�F
                        KA0100020Struct st = (KA0100020Struct)list.get(0);
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
        					struct.setSYS_COMPANY_CD(((KA0100020Struct)listCheck.get(0)).getSYS_COMPANY_CD());
            				//�u���Ӑ�[�i�ꏊ���F�v���P�̏ꍇ
            				if("1".equals(struct.geth_APR_CUST_DLV_LOC())){				
            					// ���F���̓o�^
            					boolean rtn = insertAppr("2");
            					if(!rtn) return;
            				} else {	
            					//�u���Ӑ�[�i�ꏊ���F�v���P�ȊO�̏ꍇ

            					entity.mupdateM_CUST_BASE.update(conn, struct);
            				}
                                
                             conn.commit();
                             
                             if("0".equals(struct.geth_APR_CUST_DLV_LOC())){
                 				// ����
                 				struct.setk_MODE("RESELECT");
                 				controlselect();                	
                             }
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
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {

                        //MODIFYCOUNT�̃`�F�b�N
                        isUpdatable(struct);

                        // �G���[���������Ă��Ȃ��ꍇ�A�폜�������{
                        if(msgStruct.sizeError() <= 0){
        					//��ЃR�[�h��Ǎ�
        					List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
        					struct.setSYS_COMPANY_CD(((KA0100020Struct)listCheck.get(0)).getSYS_COMPANY_CD());
            				
            				//�u���Ӑ�[�i�ꏊ���F�v���P�̏ꍇ
            				if("1".equals(struct.geth_APR_CUST_DLV_LOC())){				
            					// ���F���̓o�^
            					boolean rtn = insertAppr("3");
            					if(!rtn) return;
            				} else {	
            					//�u���Ӑ�[�i�ꏊ���F�v���P�ȊO�̏ꍇ
            					entity.mdeleteM_CUST_BASE.delete(conn, struct);
            				}
                                
                                conn.commit();
                                controlclear();
                                _mode = _NORMAL;
                        }

                } catch(SQLException e) {
                        e.printStackTrace();
                        // �G���[�������L�q���Ă��������B
                }
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
                        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
                try{
        			    //��ʑJ�ڃp�����[�^���擾
        			    _SCREENMOVE_TYP = struct.geth_SCREENMOVE_TYP();
        			    _APPR_ID = struct.geth_APPR_ID();

                        // �N���A����
                        controlclear();

                        // ���[�h�ݒ�
                        _mode = _NORMAL;
            	        
            	        /** �p�����[�^�u���Ӑ�[�i�ꏊ���F�v���擾*/
            	        privateConfig = new PrivateConfig(conn);	        
            	        // ���Ӑ�[�i�ꏊ���F
            	        aprMCustDlvLoc = privateConfig.getString("APR_CUST_DESINATED_DLV_LOC");
            	        // �p�����[�^�u���Ӑ�[�i�ꏊ���F�v���擾�ł��Ȃ������ꍇ
            			if(aprMCustDlvLoc ==null || "".equals(aprMCustDlvLoc)) {
             				String locale = CoreTools.getLocale(struct.getsUser_ID());
             				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
             				//ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00045"));
            				setErrorMessage("AZ00041" , messages.getString("AZ00046"));
            				struct.seth_APR_CUST_DLV_LOC("0");
            			} else if("1".equals(aprMCustDlvLoc)) {
            				// ���Ӑ�[�i�ꏊ���F���P�̏ꍇ
            				struct.seth_APR_CUST_DLV_LOC("1");
            			} else {
            				// �P�ȊO�̏ꍇ
            				struct.seth_APR_CUST_DLV_LOC("0");
            			}

// add �W��G ��
                        // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��



                        if ( isScreenMove()== true ) {
                                struct.setCUST_CD( _custCd );
                                struct.setDLV_LOC_CD( _dlvLocCd );
                				//���F�˗���񂩂�p�����[�^���擾
                				if("1".equals(_SCREENMOVE_TYP) || "0".equals(_SCREENMOVE_TYP)){
                					struct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());
                					struct.setDLV_LOC_CD(keyvalueMap.get("DLV_LOC_CD").toString());
                					//struct.setSYS_COMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
                					struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
                				}
                                controlselect();
                        }
// add �W��G ��

			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
                } catch(SQLException e) {
        			ExpjMessage emsg = new ExpjMessage( "ZZ01006" ," (SBM1093)�����[�h�����͎��s���܂����B");
        			msgStruct.addWarn( emsg );
        			sysLog.info(emsg, getsysUSER_CD());
                }

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		if("1".equals(aprMCustDlvLoc)) {
			// ���Ӑ�[�i�ꏊ���F���P�̏ꍇ
			struct.seth_APR_CUST_DLV_LOC("1");
		} else {
			// �P�ȊO�̏ꍇ
			struct.seth_APR_CUST_DLV_LOC("0");
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
//			throw new FoundationException("KA0100020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100020-E999","CSV�̏o�͏���"));
			throw new FoundationException("KA0100020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KA0100020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KA0100020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KA0100020Entity entity;
	protected KA0100020Struct struct;
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

		entity = new KA0100020Entity();
		struct = new KA0100020Struct();

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
	 * KA0100020�N���X�̕W���R���X�g���N�^
	 */
	public KA0100020Control() throws BusinessProcessException, FoundationException
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
				KA0100020Struct key = (KA0100020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD") && key.geth_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("h_DLV_LOC_CD", key.geth_DLV_LOC_CD());
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
				if(msgKeyType.containsKeyColumn("h_APR_CUST_DLV_LOC") && key.geth_APR_CUST_DLV_LOC() != null) {
					msgKey.setKeyValue("h_APR_CUST_DLV_LOC", key.geth_APR_CUST_DLV_LOC());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_KNAME") && key.getDLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("DLV_LOC_KNAME", key.getDLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_ENAME") && key.getDLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("DLV_LOC_ENAME", key.getDLV_LOC_ENAME());
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
				if(msgKeyType.containsKeyColumn("TRANSPORT_CD") && key.getTRANSPORT_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_CD", key.getTRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_LT") && key.getTRANSPORT_LT() != null) {
					msgKey.setKeyValue("TRANSPORT_LT", key.getTRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("DEPO_WH_CD") && key.getDEPO_WH_CD() != null) {
					msgKey.setKeyValue("DEPO_WH_CD", key.getDEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_WH_CD") && key.getSHIP_WH_CD() != null) {
					msgKey.setKeyValue("SHIP_WH_CD", key.getSHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEPO_WH_NAME") && key.getDEPO_WH_NAME() != null) {
					msgKey.setKeyValue("DEPO_WH_NAME", key.getDEPO_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("SHIP_WH_NAME") && key.getSHIP_WH_NAME() != null) {
					msgKey.setKeyValue("SHIP_WH_NAME", key.getSHIP_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
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
					KA0100020Struct key = new KA0100020Struct();
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD")) {
						key.seth_DLV_LOC_CD(msgKey.getKeyValue("h_DLV_LOC_CD"));
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
					if(msgKeyType.containsKeyColumn("h_APR_CUST_DLV_LOC")) {
						key.seth_APR_CUST_DLV_LOC(msgKey.getKeyValue("h_APR_CUST_DLV_LOC"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_KNAME")) {
						key.setDLV_LOC_KNAME(msgKey.getKeyValue("DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_ENAME")) {
						key.setDLV_LOC_ENAME(msgKey.getKeyValue("DLV_LOC_ENAME"));
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
					if(msgKeyType.containsKeyColumn("TRANSPORT_CD")) {
						key.setTRANSPORT_CD(msgKey.getKeyValue("TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_LT")) {
						key.setTRANSPORT_LT(msgKey.getKeyValue("TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_WH_CD")) {
						key.setDEPO_WH_CD(msgKey.getKeyValue("DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_WH_CD")) {
						key.setSHIP_WH_CD(msgKey.getKeyValue("SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_WH_NAME")) {
						key.setDEPO_WH_NAME(msgKey.getKeyValue("DEPO_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_WH_NAME")) {
						key.setSHIP_WH_NAME(msgKey.getKeyValue("SHIP_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
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
