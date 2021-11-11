/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0020/src/com/nec/jp/orteus/metamorBase/AB0020/AB0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AB0020;

import com.nec.jp.orteus.metamorBase.AB0020.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AB0020010Control
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
       
        public AB0020010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
       
       //-----------------------------------------------------------------------------
       
        /** �i�ڎ�z�敪 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /** �i�ڎ�z�敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** �i�ڎ�z�敪�擾
         * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }
       
       
        /** ���O��敪 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /** ���O��敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** ���O��敪�擾
         * @return ���O��敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }
       
       
        /** �݌ɐ��P�ʋ敪 */
        private ComboStruct _UNIT_QTY_TYP = new ComboStruct();
       
        /** �݌ɐ��P�ʋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }
       
        /** �݌ɐ��P�ʋ敪�擾
         * @return �݌ɐ��P�ʋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }
       
       
        /** ���Ԏ�� */
        private ComboStruct _JOB_ODR_TYP = new ComboStruct();
       
        /** ���Ԏ�ʐݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setJOB_ODR_TYP(ComboStruct combo){ _JOB_ODR_TYP = combo; }
       
        /** ���Ԏ�ʎ擾
         * @return ���Ԏ�ʂ̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getJOB_ODR_TYP(){ return _JOB_ODR_TYP; }
       
       
        /** �v��^�C�v */
        private ComboStruct _PLAN_TYP = new ComboStruct();
       
        /** �v��^�C�v�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setPLAN_TYP(ComboStruct combo){ _PLAN_TYP = combo; }
       
        /** �v��^�C�v�擾
         * @return �v��^�C�v�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getPLAN_TYP(){ return _PLAN_TYP; }
       
       
        /** ���ԏ�ԋ敪 */
        private ComboStruct _JOB_ODR_STS_TYP = new ComboStruct();
       
        /** ���ԏ�ԋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setJOB_ODR_STS_TYP(ComboStruct combo){ _JOB_ODR_STS_TYP = combo; }
       
        /** ���ԏ�ԋ敪�擾
         * @return ���ԏ�ԋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getJOB_ODR_STS_TYP(){ return _JOB_ODR_STS_TYP; }
       
       
        /** ���ԏ����敪 */
        private ComboStruct _JOB_ODR_EXP_TYP = new ComboStruct();
       
        /** ���ԏ����敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setJOB_ODR_EXP_TYP(ComboStruct combo){ _JOB_ODR_EXP_TYP = combo; }
       
        /** ���ԏ����敪�擾
         * @return ���ԏ����敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getJOB_ODR_EXP_TYP(){ return _JOB_ODR_EXP_TYP; }
       
       
        /** ���ԍ폜�t���O */
        private ComboStruct _JOB_ODR_DEL_FLG = new ComboStruct();
       
        /** ���ԍ폜�t���O�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setJOB_ODR_DEL_FLG(ComboStruct combo){ _JOB_ODR_DEL_FLG = combo; }
       
        /** ���ԍ폜�t���O�擾
         * @return ���ԍ폜�t���O�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getJOB_ODR_DEL_FLG(){ return _JOB_ODR_DEL_FLG; }
       
    	/** �V�X�p���A[�󒍎����ԓo�^]*/
    	private String PRD_REQ_JOB_ODR_TYP_2;
       //-----------------------------------------------------------------------------
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
       //-----------------------------------------------------------------------------
       
        // �X�V�Ώۂ̐���No
        private Integer _checkNo = null;
        
        /** �X�V�Ώۂ̐���No�擾
         * @return �X�V�Ώۂ̐���No
        */
        public Integer getCheckNumber(){ return _checkNo; }
        
        /** �X�V�Ώۂ̐���No�ݒ�
         * @param �X�V�Ώۂ̐���No
        */
        public void setCheckNumber(Integer no){ _checkNo = no; }
       
       
        /** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
        private AB0020010Struct _keyStruct = new AB0020010Struct();
       
        /** �L�[���Struct�̎擾 */
        public AB0020010Struct getKeyStruct(){ return _keyStruct; }
        
        /** �L�[���Struct�̐ݒ� */
        public void setKeyStruct(AB0020010Struct struct){ _keyStruct.copy(struct); }
       
       
       //-----------------------------------------------------------------------------
       
        /** ���ԃ��X�g */
        private List _jobOdrList = new ArrayList(0);
       
        /** 
         * ���ԃ��X�g�擾 
         * @return ���ԃ��X�g
        */
        public List getJobOdrList(){ return _jobOdrList; }
       
        /** 
         * ���ԃ��X�g�ݒ�
         * @param ���ԃ��X�g
         */
        public void setJobOdrList(List list){ _jobOdrList = list; }
       
       
       //-----------------------------------------------------------------------------
       
        /** [�V�X�e���p�����[�^]���ԍ폜�t���O */
        private String _sysJobOdrDelFlg = "0";
       
        /**
         * ���ԍ폜�t���O�ݒ�
         * @param jobOdrDelFlg
         */
        public void setSysJobOdrDelFlg(String jobOdrDelFlg){ _sysJobOdrDelFlg = jobOdrDelFlg; }
       
        /**
         * ���ԍ폜�t���O�擾
         * @return String ���ԍ폜�t���O
         */
        public String getSysJobOdrDelFlg(){ return _sysJobOdrDelFlg; }
       
        /** ���ԏ�ԋ敪 */
        private String _jobOdrStsTyp = "0";
       
        /**
         * ���ԏ�ԋ敪�ݒ�
         * @param jobOdrStsTyp
         */
        public void setJobOdrStsTyp(String jobOdrStsTyp){ _jobOdrStsTyp = jobOdrStsTyp; }
       
        /**
         * ���ԏ�ԋ敪�擾
         * @return String ���ԏ�ԋ敪
         */
         public String getJobOdrStsTyp(){ return _jobOdrStsTyp; }
       
       //-----------------------------------------------------------------------------
       
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
       
       //------------------------------------------------------------------------------
        // ���Ԃ̗\�蕶����\���p
       
        /** ���Ԃ̏�ԕ\�������� �Čv�Z���� */
        private String _expectRecalc = null;
        /** ���Ԃ̏�ԕ\�������� �폜���� */
        private String _expectDelete = null;
       
        /**
         * ���Ԃ̗\��\��������擾
         * @param p SYS_PARAMETER�A�N�Z�b�T
         */
        private boolean getExpectString(PrivateConfig p)
        {
         try{
          if((_expectDelete = p.getString("JOB_ODR_EXPECT_DELETE")) == null
          || (_expectRecalc = p.getString("JOB_ODR_EXPECT_RECALC")) == null)
           return false;
         }
         catch(Exception e){
          e.printStackTrace();
          return false;
         }
         return true;
        }
        /**
         * ���Ԃ̗\��\��������쐬
         * @param stsTyp ���ԏ�ԋ敪(STS_TYP)
         * @param expTyp ���ԏ����敪(EXP_TYP)
         * @param delFlg ���ԍ폜�t���O(DEL_FLG)
         * @return ���Ԃ̗\�蕶����  �쐬���s��null
         */
        private String makeExpectString(int stsTyp, int expTyp, int delFlg)
        {
         if(_expectDelete == null || _expectRecalc == null)  return null;
       
         AB0020ExpectJudge judge = new AB0020ExpectJudge();
         if(judge.expect(stsTyp,expTyp,delFlg) == false)  return null;
       
         String expect = null;
         if(judge.isRecalculate() == AB0020ExpectJudge.YES)
          expect = _expectRecalc;
         else if(judge.isDelete() == AB0020ExpectJudge.YES)
          expect = _expectDelete;
         else
          expect = new String("");
         return expect;
        }
       
       //-----------------------------------------------------------------------------
       
        /**
         * �i�ڏ��ݒ菈��
         * @param w_itemList �i�ڏ�񃊃X�g
         */
        private void setItemInfo(List w_itemList){
         AB0020010Struct itemStruct = (AB0020010Struct)w_itemList.get(0);
         _keyStruct.setITEM_NAME(itemStruct.getITEM_NAME());
         _keyStruct.setDRAW_CD(itemStruct.getDRAW_CD());
         _keyStruct.setSPEC(itemStruct.getSPEC());
         _keyStruct.setMRP_ODR_TYP(itemStruct.getMRP_ODR_TYP());
         _keyStruct.setOUTSIDE_TYP(itemStruct.getOUTSIDE_TYP());
         _keyStruct.setITEM_SPOIL(itemStruct.getITEM_SPOIL());
         _keyStruct.setUNIT_QTY_TYP(itemStruct.getUNIT_QTY_TYP());
         _keyStruct.setMUL_ODR_QTY(itemStruct.getMUL_ODR_QTY());
         _keyStruct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
        }
       
        /**
         * �i�ڏ��̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����
         */
        private void setTypeValueAboutItem(AB0020010Struct s)
        {
         s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
        }
       
        /**
         * ��ƌn����̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����
         */
        private void setTypeValueAboutProcGroup(AB0020010Struct s)
        {
         s.setJOB_ODR_NAME(getTypeName(_JOB_ODR_TYP,s.getJOB_ODR_TYP()));
         s.setPLAN_NAME(getTypeName(_PLAN_TYP,s.getPLAN_TYP()));
         s.setJOB_ODR_STS_NAME(getTypeName(_JOB_ODR_STS_TYP,s.getJOB_ODR_STS_TYP()));
        }
         
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param intType �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, Integer intType)
        {
         if(comboStruct == null || intType == null)  return null;
         String strTyp = TypeConverter.sanitizer(intType);
         String strTypName = strTyp;
         for(int i = 0; i < comboStruct.getValList().size(); i++){
          if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
           strTypName = (String)(comboStruct.getExplanList().get(i));
           break;
          }
         }
         if(strTypName == null) strTypName = strTyp;
         return strTypName;
        }
       
         
           /**
            * �T�u��ʏ��̐ݒ�
            *
            * @param temp_struct AB0020010Struct temp_struct
            * @return �Ȃ�
            */
        private void setSubParamInfo(AB0020010Struct temp_struct)
        {
         // �H��R�[�h
         struct.setPLANT_CD(temp_struct.getPLANT_CD());
         // �H�ꖼ
         struct.setPLANT_NAME(temp_struct.getPLANT_NAME());
         // �i�ڔԍ�
         struct.setITEM_CD(temp_struct.getITEM_CD());
         // �i�ږ�
         struct.setITEM_NAME(temp_struct.getITEM_NAME());
         // ���Y�v�����(FROM)
         struct.setw_DATE_FROM(temp_struct.getw_DATE_FROM());
         // ���Y�v�����(TO)
         struct.setw_DATE_TO(temp_struct.getw_DATE_TO());
         // �݌ɐ��P�ʋ敪
         struct.setUNIT_QTY_TYP(temp_struct.getUNIT_QTY_TYP());
         // �v�ʒP��
         struct.setSTOCK_UNIT(temp_struct.getSTOCK_UNIT());
        }
       //------------------------------------------------------------------------------
       
        /*
         * �f�t�H���g�l�ݒ菈��
         */
        private void setDefaultData() throws ExpjException
        {
         // ���H��R�[�h�ݒ�
         _keyStruct.setPLANT_CD(getsysPLANT_CD());
         
         // �f�t�H���g���Y�v����Ԏ擾�ݒ�
         setDefaultPeriodDate();
        	
         struct.setTIME_CTRL(_flgTimeCtrl);
        }
       
        /*
         * �f�t�H���g���Y�v����ԓ��t�擾�ݒ�
         *
         * @return	�Ȃ�
         */
        private void setDefaultPeriodDate() throws ExpjException
        {
         
         try
         {
          DateCtrl dctrl = new DateCtrl(conn);
          DateConverter dc = new DateConverter();
          String streBusinessOprDate = dctrl.getBusinessOprDate(getsysPLANT_CD());
          Date dateBusinessOprDate = dc.str2date(streBusinessOprDate);
       
          // �f�t�H���g���Y�v����ԓ��t�擾
          String strDefDate[] = {"", ""};
          boolean bResult = false;
       
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
          
          if(bResult == true)
          {
           // �擾����
           _keyStruct.setw_DATE_FROM(strDefDate[0]);
           _keyStruct.setw_DATE_TO(strDefDate[1]);
          }
          else
          {
           // �擾���s
           ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
           sysLog.severe(emsg, getsysUSER_CD());
           ExpjException ee = new ExpjException(emsg);
           
           throw ee;
          }
       
         }
         catch(SQLException se)
         {
          setSqlExceptionMsg(se);
         }
        }
       
       //------------------------------------------------------------------------------
        /**
         * SQLException�G���[���b�Z�[�W�ݒ�
         * @param SQLException
         * @param �o�̓G���[���b�Z�[�W
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
       
          throw ee;
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
    	 * @param �o�̓��b�Z�[�W
    	 */
    	private void setErrorMessage(String code, String value, String message) {
    		ExpjMessage emsg = new ExpjMessage(code, value);
    		msgStruct.addError(emsg);
    		sysLog.warning(emsg, getsysUSER_CD());
            emsg = new ExpjMessage( "ZZ01006", message );
            msgStruct.addError( emsg );
            sysLog.warning(emsg, getsysUSER_CD());
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
         * �G���[���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W(List)
         */
        private void setErrorMessage(String messageno, List message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         
         for(int i=0; i<message.size(); i++)
         {
          emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
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
       //------------------------------------------------------------------------------
		
       /** �����Ǘ��p�t���O */
		private String _flgTimeCtrl = null;
		
		//add 2008/3/27
		/** �C���X�g�[���I�v�V�����e�[�u�����'JA*','JF*'�����邩�ǂ����p */
		private String _SysInstallOptions = null;	
		private String _SysInstallOptions_JF = null;	

		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //---------------------------------------------------------------------
                 
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // ���ԃ��X�g�N���A
                 _jobOdrList.clear();
              
                 List calList = null; 	// �J�����_�ꗗ
                 DateConverter dc = new DateConverter();
              
                 // �H����擾�ƃ`�F�b�N
                 List plantList = entity.mselectM_PLANT.read(conn, struct);
                 if(plantList.size() <= 0){
                  Message = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
                  setErrorMessage("AB01001", Message);
                  
                  // �H��R�[�h�G���[�̂��ߍH�ꖼ�ɋ󔒂�ݒ�
                  _keyStruct.setPLANT_NAME("");
                 }
                 else{
                  AB0020010Struct plantStruct = (AB0020010Struct)plantList.get(0);
                  _keyStruct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
              
                 // �i�ڏ��擾�ƃ`�F�b�N
                 List itemList = entity.mselectM_ITEM.read(conn, struct);
                 if(itemList.size() <= 0){
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  setErrorMessage("AB01002", Message);
              
                  // �i�ڔԍ��G���[�̂��ߕi�ڏ��ɋ󔒂�ݒ�
                  struct.clearItem(_keyStruct);
                 }
                 else
                 {

//                	 2008/08/08 ADD S.AZUMA START
                	                 if(((AB0020010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
                	                  // �Ǎ��������s�F�i�ڔԍ��ɁA�H���Ǘ��i�ڂ͎w��ł��܂���B
                	                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                	                  setErrorMessage("AB00053", Message);
                	                 }
//                	 2008/08/08 ADD S.AZUMA END
                	              
                  // �i�ڎ�z�敪�s�������i�ڏ��͕\������
                  setItemInfo(itemList);
                  // [�ۊǋ�ʕi�ڍ݌�]��"�i�ڕʎ莝�݌ɐ���"�Z�o
                  String d_itemStock = "0.0";
                  List stockHandList = 
                   entity.mselectT_ITEM_STOCK_stock_on_hand_qty_sum.read(conn, struct);
                  if(stockHandList.size() > 0){
                   AB0020010Struct stockStruct = (AB0020010Struct)stockHandList.get(0);
                   if(stockStruct.getSTOCK_ON_HAND_QTY() != null)
                    d_itemStock = stockStruct.getSTOCK_ON_HAND_QTY();
                  }
              
                  // �莝�݌ɐݒ�
                  _keyStruct.setHAND_STOCK(d_itemStock);
                  
                  if(((AB0020010Struct)itemList.get(0)).getMRP_ODR_TYP().intValue() != 1 &&
                   ((AB0020010Struct)itemList.get(0)).getMRP_ODR_TYP().intValue() != 2){
              
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_ITEM.MRP_ODR_TYP:" + ((AB0020010Struct)itemList.get(0)).getMRP_ODR_TYP());
              
                   setErrorMessage("AB00016", listMessage);
                  }
                 }
              
                 // �ȉ��̏����͍H���񂨂�ѕi�ڏ�񂪎擾�ł��Ă���ꍇ�ɍs��
                 int Checkfg =0;
                 boolean calResult = true;
                 if(itemList.size() > 0  && plantList.size() > 0){
                  // �v����ԃ`�F�b�N
                  Date fromDate = dc.str2date(struct.getw_DATE_FROM());
                  Date toDate = dc.str2date(struct.getw_DATE_TO());
                  _keyStruct.setd_DATE_TO(toDate);
                  _keyStruct.setd_DATE_FROM(fromDate);
                  //�J�����_�擾�����i�����L�[�F�i�ڔԍ��j
                  List dateList = entity.mselectM_CAL_max_min1.read(conn, struct);
                  if(dateList.size() > 0)
                  {
                   AB0020010Struct dateStruct = (AB0020010Struct)dateList.get(0);
              
                   if(dateStruct.getMIN_DLV_DATE() != null && 
                     dateStruct.getMAX_DLV_DATE() != null){
                     
                    Date minDate = dc.str2date(dateStruct.getMIN_DLV_DATE());
                    Date maxDate = dc.str2date(dateStruct.getMAX_DLV_DATE());
              
                    if((minDate.getTime() > fromDate.getTime()) || 
                      (maxDate.getTime() < toDate.getTime())){
                     // �v����Ԃ��J�����_�͈̔͊O
                     		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                     		setErrorMessage("AB00011", Message);
                    }
                   }
                   else{
                   	// �J�����_�擾���s(�����L�[�F�i�ڔԍ��j
                    calResult = false;
                   }
                  }
                  else{
                   // �J�����_�擾���s(�����L�[�F�i�ڔԍ��j
                   calResult = false;
                  }
                   //�ȉ��̏����͕i�ڔԍ��ł̃J�����_�擾�Ɏ��s�����Ƃ��ɍs��
                  if(calResult ==false){
                  	    calResult = true;
                  	    Checkfg = 1;
                        dateList = entity.mselectM_CAL_max_min.read(conn, struct);
                  		if(dateList.size() > 0)
                  		{
                  		 AB0020010Struct dateStruct = (AB0020010Struct)dateList.get(0);
              
                   		if(dateStruct.getMIN_DLV_DATE() != null && 
                     		dateStruct.getMAX_DLV_DATE() != null){
                     
                    		Date minDate = dc.str2date(dateStruct.getMIN_DLV_DATE());
                    		Date maxDate = dc.str2date(dateStruct.getMAX_DLV_DATE());
              
                    		if((minDate.getTime() > fromDate.getTime()) || 
                      		(maxDate.getTime() < toDate.getTime())){
                     		// �v����Ԃ��J�����_�͈̔͊O
                     		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                     		setErrorMessage("AB00011", Message);
                     		calResult = false;
                    		}
                   		}
                   		else{
                    		// �J�����_�擾���s(�����L�[�F�H��ԍ��j
                    		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                    		setErrorMessage("AB00011", Message);
                    		calResult = false;
                   		}
                  		}
                  		else{
                   		// �J�����_�擾���s(�����L�[�F�H��ԍ��j
                   		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                   		setErrorMessage("AB00011", Message);
                   		calResult = false;
                  		}
                  		}
                  // �Ɩ��^�p���擾
                  dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
                  if(dateList.size() > 0){
                   AB0020010Struct dateStruct = (AB0020010Struct)dateList.get(0);
                   Date businessDay = dateStruct.getBUSINESS_OPR_DATE();
                   _keyStruct.setBUSINESS_OPR_DATE(businessDay);
                  }
                  else{
                   Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                   setErrorMessage("AB00026", Message);
                  }
              
                  // �J�����_�ꗗ�擾(FROM�`TO��)
                  if(calResult == true){
                  	//�i�ڂł̎擾���H��ł̎擾���𔻒�
                  	if(Checkfg == 0){
                   		calList = entity.mselectM_CAL1.read(conn, struct);
                  	}else{
                  		calList = entity.mselectM_CAL.read(conn, struct);
                  	}
                   if(calList.size() <= 0){
                    Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                    setErrorMessage("AB00026", Message);
                   }
                  }
                 }
              
                 //====================================
                 //  �ő�v����ԁi���j�`�F�b�N
                 //====================================
                 // �V�X�e���p�����[�^�̍ő�\�����ԁi���j���擾
                 List maxMonthList = entity.mselectMAX_DISPLAY_MONTH_SERIAL.read(conn, struct);
                 String MAX_DISPLAY_MONTH_SERIAL = null;
                 if(maxMonthList.size() > 0){
                   AB0020010Struct maxMonthStruct = (AB0020010Struct)maxMonthList.get(0);
                   if(null == maxMonthStruct.gets_MAX_DISPLAY_MONTH_SERIAL()){
                     MAX_DISPLAY_MONTH_SERIAL = "0";
                   }else{
                     MAX_DISPLAY_MONTH_SERIAL = maxMonthStruct.gets_MAX_DISPLAY_MONTH_SERIAL();
                   }
                 }
                 if(!"0".equals(MAX_DISPLAY_MONTH_SERIAL)){
                   Date dateFrom = dc.str2date(struct.getw_DATE_FROM());
                   Date dateTo = dc.str2date(struct.getw_DATE_TO());
                   Calendar calFrom = Calendar.getInstance();
                   Calendar calTo = Calendar.getInstance();
                   calFrom.setTime(dateFrom);
                   calTo.setTime(dateTo);
                   calFrom.add(Calendar.MONTH, Integer.parseInt(MAX_DISPLAY_MONTH_SERIAL));
                   long lForm = calFrom.getTimeInMillis();
                   long lTo = calTo.getTimeInMillis();
                   // �ő�\�����Ԃ𒴂���Ƃ�
                   if(lForm <= lTo){
                     // �G���[���b�Z�[�W�o��
                     ExpjMessage emsg = new ExpjMessage( "AB00050", MAX_DISPLAY_MONTH_SERIAL );
                     msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
                     sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
                   }
                 }
                 
                 
                 setTypeValueAboutItem(_keyStruct);
                 struct.copy(_keyStruct);
                 
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
              
                  for(int i = 0; i < calList.size(); i++)
                  {
                   AB0020010Struct calStruct = (AB0020010Struct)calList.get(i);
                   struct.setJOB_ODR_DLV_DATE(calStruct.getJOB_ODR_DLV_DATE());
              
                   // ���Ԏ擾
                   List jobList;
                   if(_flgTimeCtrl.equals("true")){
                      jobList = entity.mselect.read(conn, struct);
                   }else{
					  jobList = entity.mselect2.read(conn, struct);
                   }
                   if(jobList.size() <= 0){
                    // ���Ԉꗗ�ǉ�
                    calStruct.setJOB_ODR_TYP((Integer)null);
                    calStruct.setPLAN_TYP((Integer)null);
                    calStruct.setJOB_ODR_QTY((String)null);
                    calStruct.setd_JOB_ODR_DLV_DATE(calStruct.getJOB_ODR_DLV_DATE());
                    _jobOdrList.add(calStruct);
                   }
                   else{
                    for(int t = 0; t < jobList.size(); t++)
                    {
                     // �󒍐��Z�o
                     AB0020010Struct workStruct = (AB0020010Struct)jobList.get(t);
                     List workList = entity.mselectT_JOB_ODR_ODR_ALC_ALCD_QTY.read(conn, workStruct);
                     if(workList.size() <= 0)
                      workStruct.setALCD_QTY(new String("0.0"));
                     else{
                      AB0020010Struct orderStruct = (AB0020010Struct)workList.get(0);
                      if(orderStruct.getALCD_QTY() != null)
                       workStruct.setALCD_QTY(orderStruct.getALCD_QTY());
                      else
                       workStruct.setALCD_QTY(new String("0.0"));
                     }
              
                     // �R���{�{�b�N�X�̃f�[�^�ݒ�
                     setTypeValueAboutProcGroup((AB0020010Struct)(jobList.get(t)));
                     
                     // �����\���Z�o
                     workStruct.setALCD_ENABLE_QTY(new String(Calculate.subtract(
                         workStruct.getJOB_ODR_QTY(), workStruct.getALCD_QTY())));
              
                     // �x���t���O�ݒ�
                     workStruct.setHOLIDAY_FLG(calStruct.getHOLIDAY_FLG());
              
                     // ���ԗ\��ݒ�
                     workStruct.setJobOdrExpect(makeExpectString(workStruct.getJOB_ODR_STS_TYP().intValue(),
                      workStruct.getJOB_ODR_EXP_TYP().intValue(),workStruct.getJOB_ODR_DEL_FLG().intValue()));
              
                     // ���Ԉꗗ�ǉ�
                     workStruct.setd_JOB_ODR_DLV_DATE(workStruct.getJOB_ODR_DLV_DATE());
                     _jobOdrList.add(workStruct);
                    }
                   }
                  }
                  
                  list = _jobOdrList;
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }
                finally{
            	//add 2008/3/27��
            	 struct.setSYS_INSTALL_OPTIONS(_SysInstallOptions);
            	//add 2008/3/27��
				 struct.setOPTION_ID(_SysInstallOptions_JF);
            	 
                 if(msgStruct.sizeError() <= 0)
                 {
                  setReadStatus(NORMAL);
                 }
                 else
                 {
                  setReadStatus(INITIAL);
                 }
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
                //---------------------------------------------------------------------
              
                // �e��ʂ̏���ݒ�
                struct.copy(_keyStruct);             
                 
                // ���ԏ�ԋ敪�ݒ�(1:���v�ʌv�Z���Ώ�)
                struct.setJOB_ODR_STS_TYP(AB0020Common._JOB_ODR_STS_TYP);
              
                // ��z���ʐݒ�(0.0)
                struct.setJOB_ODR_QTY(AB0020Common._JOB_ODR_QTY);
              
                //�����Ǘ��t���O�ݒ�
                struct.setTIME_CTRL(_flgTimeCtrl);
                
                //[�󒍓o�^���̐��ԍ̔ԕ��@]�̃p�����[�^�ݒ�
                try {
                	
                    // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD START BY NESJN
                	// ���v�ʌv�Z���s���`�F�b�N
                    boolean odFlg = entity.mcheckSYS_OD_CALC_CTRL.check(conn,struct);
                    if(odFlg) {
                    	// ���v�ʌv�Z���s���̂��߃����e�i���X�ł��܂���B
						setErrorMessage("AC00206");
						return;
                    }
                    
                    // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD END BY NESJN
                	              	
					List sysparameterList = entity.mselectPRD_REQ_JOB_ODR_TYP_2.read(conn,struct);
					if(sysparameterList.isEmpty()){
						setErrorMessage("KQ00320");
						throw new ExpjException("KQ00320");
					}
					PRD_REQ_JOB_ODR_TYP_2 = ((AB0020010Struct)sysparameterList.get(0)).geth_PRD_REQ_JOB_ODR_TYP_2();
					if(!"0".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"1".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"2".equals(PRD_REQ_JOB_ODR_TYP_2)){
						setErrorMessage("KQ00320");
						throw new ExpjException("KQ00320");
					}
					struct.seth_PRD_REQ_JOB_ODR_TYP_2(PRD_REQ_JOB_ODR_TYP_2);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					struct.setOPTION_ID(_SysInstallOptions_JF);
				}
				
				
				
                
                
				
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                //---------------------------------------------------------------------
              
                // ���ԏ�ԋ敪�ݒ�
                setJobOdrStsTyp(struct.getJOB_ODR_STS_NAME().substring(0,1));
              
                // �Ώۂ̐��ԏ��R�s�[
                setSubParamInfo(_keyStruct);
                
                // �R�t�ς݂̐��Ԑݒ�
                try {
    				//�X�V���`�F�b�N
    				List modifyList = entity.mselectT_JOB_ODR_modify.read(conn,struct);
    				if(null == modifyList || modifyList.size() == 0){
    					//�f�[�^�����݂��Ȃ��̂Ƃ�
						setErrorMessage("AC00017");
						return;
    				}
    				String tempModify =((AB0020010Struct)modifyList.get(0)).getMODIFY_COUNT();
    				if(!tempModify.equals(struct.getMODIFY_COUNT())){
    					//�X�V�������ł͂Ȃ��̂Ƃ�
						setErrorMessage("AC00017");
						return;    				
    				}
                	
                    // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD START BY NESJN
                	// ���v�ʌv�Z���s���`�F�b�N
                    boolean odFlg = entity.mcheckSYS_OD_CALC_CTRL.check(conn,struct);
                    if(odFlg) {
                    	// ���v�ʌv�Z���s���̂��߃����e�i���X�ł��܂���B
						setErrorMessage("AC00206");
						return;
                    }
                    
                    // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD END BY NESJN
                    
					List workList = entity.mselectT_JOB_ODR_ODR_ALC_JOB_ODR_CD.read(conn,struct);
					if(workList != null && !workList.isEmpty()){
						AB0020010Struct workStruct = (AB0020010Struct) workList.get(0);
						struct.seth_JOB_ODR_CD(workStruct.geth_JOB_ODR_CD());
					}
				} catch (FoundationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					struct.setOPTION_ID(_SysInstallOptions_JF);
				}
                //�����Ǘ��t���O�ݒ�
                struct.setTIME_CTRL(_flgTimeCtrl);
                //�N�����E�����ݒ�
				if((struct.getJOB_ODR_DLV_DATE()).length() == 16){
					struct.setJOB_ODR_DLV_DATE_TIME((struct.getJOB_ODR_DLV_DATE()).substring(11,13)+(struct.getJOB_ODR_DLV_DATE()).substring(14,16));
				}else{
					struct.setJOB_ODR_DLV_DATE_TIME("");
				}
                struct.setJOB_ODR_DLV_DATE((struct.getJOB_ODR_DLV_DATE()).substring(0,10));
                struct.setDEL_FLG("NULL");
                struct.setSTS_FLG("NULL");
                struct.setEXP_FLG("NULL");
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //---------------------------------------------------------------------
				//add 2008/3/27��
              try{
              	//add2008/3/27��
                // ������
                _keyStruct.clear();
                struct.clear();
               
                // ���ԃ��X�g�N���A
                _jobOdrList.clear();
               
                // �f�t�H���g�l�ݒ�
                setDefaultData();
                struct.copy(_keyStruct);
				
				//add 2008/3/27��
                //�C���X�g�[���I�v�V�����e�[�u�����'JA*'�����邩�ǂ�������
                List SysInstallOpt = entity.mSYS_INSTALL_OPTIONS.read(conn,struct);
                if(SysInstallOpt == null || SysInstallOpt.size() <=0){
                	struct.setSYS_INSTALL_OPTIONS(null);
                }else{
                	struct.setSYS_INSTALL_OPTIONS(((AB0020010Struct)SysInstallOpt.get(0)).getSYS_INSTALL_OPTIONS());
                }
                _SysInstallOptions = struct.getSYS_INSTALL_OPTIONS();
				//add2008/3/27��
 
                //add 2009/1/7��
				//�C���X�g�[���I�v�V�����ɂ�鎞�n����o�ɗ\��ꗗ�{�^������
                List listInstOpt = entity.mselectSYS_INSTALL_OPTIONS.read(conn,struct);
				if(listInstOpt == null || listInstOpt.size() <=0){
					struct.setOPTION_ID(null);
				}else{
					struct.setOPTION_ID(((AB0020010Struct)listInstOpt.get(0)).getOPTION_ID());
					_SysInstallOptions_JF =((AB0020010Struct)listInstOpt.get(0)).getOPTION_ID();
				}
				//add 2009/1/7��
				
                // ���[�h�ݒ�
                setReadStatus(INITIAL);
              
              	//add 2008/3/27��
              	}
                catch(SQLException e)
                {
                 setSqlExceptionMsg(e);
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
                //---------------------------------------------------------------------
              
                struct.copy(_keyStruct);
                 
                      //�Č���
                      controlselect();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //---------------------------------------------------------------------
                 
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 boolean result = false;		// �`�F�b�N���ʊi�[
                 //�i�ڂ̃J�����_���`�F�b�N
                 result = entity.mcheckM_ITEM_CAL_NO.check(conn, struct);
                 // �[���`�F�b�N
                 if(result == true){
                		result = entity.mcheckT_JOB_ODR_dlv_date1.check(conn, struct);
                 }else{
                 	result = entity.mcheckT_JOB_ODR_dlv_date.check(conn, struct);
                 }
                 if(result == false){
                  Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  setErrorMessage("AB00021", Message);
                 }
              
                 result = entity.mcheckSYS_DATE_CTRL.check(conn, struct);
                 if(result == false){
                  Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  setErrorMessage("AB00025", Message);
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  Numbering number = new Numbering(conn,
                          Numbering.JOB_OD_CD, 
                          struct.getsUser_ID(), 
                          sp.getProcId(),
                          struct.getPLANT_CD());
              
                  // �����̔ԗL��
                  if(struct.geth_AUTO_NUM().intValue() == 1){
                   // ���ԍ̔�
                   String jobCd = null;
                   try{
                    jobCd = number.getNo();
                    if(jobCd == null)
                     throw new Exception();
                   }
                   catch(Exception ex){
                    ExpjMessage emsg = new ExpjMessage( "AB00023" );
                    sysLog.warning(emsg, getsysUSER_CD());
                    emsg = new ExpjMessage( "ZZ01006", "M_ITEM.ITEM_CD:" + struct.getITEM_CD() );
                    sysLog.warning(emsg, getsysUSER_CD());
                    emsg = new ExpjMessage( "ZZ01006", "M_PLANT.PLANT_CD:" + struct.getPLANT_CD() );
                    sysLog.warning(emsg, getsysUSER_CD());
                    
                    emsg = new ExpjMessage( "ZZ01106" );
                    sysLog.severe(emsg, getsysUSER_CD());
                    ExpjException ee = new ExpjException(ex, emsg);
              
                    throw ee;
                   }
                   struct.setJOB_ODR_CD(jobCd);
                  }
                  else{
                   // ���Ԕԍ��`�F�b�N
                   if(Numbering.checkNumber(
                     conn,
                     Numbering.JOB_OD_CD,
                     struct.getJOB_ODR_CD()) == true){
                    Message = "T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD();
                    setErrorMessage("AB00024", Message);
                   }
              
                   // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                   if(msgStruct.sizeError() <= 0){
              
                    // ���Ԍv��ɐ��Ԃ����݂��邩�ǂ����̃`�F�b�N
                    List jobList = entity.mT_JOB_ODR.read(conn, struct);
                    if(jobList.size() > 0)
                    {
                     Message = "T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD();
                     setErrorMessage("ZZ01102", Message);
                    }
                   }
                  }
              
              	//3����4���ɂ���
              	if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 3){
					struct.setJOB_ODR_DLV_DATE_TIME("0"+struct.getJOB_ODR_DLV_DATE_TIME());
				}
                            
                  // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                  if(msgStruct.sizeError() <= 0){
					//Null�̏ꍇ
					if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 0){
						//�����Ǘ�����ꍇ��2359��ݒ�
						if(_flgTimeCtrl.equals("true")){
							struct.setJOB_ODR_DLV_DATE_TIME("2359");
						//�����Ǘ����Ȃ��ꍇ��0000��ݒ�
						}else{
							struct.setJOB_ODR_DLV_DATE_TIME("0000");
						}
					}
                   //�N�����{����
                   struct.setJOB_ODR_DLV_DATE_ALL(struct.getJOB_ODR_DLV_DATE()+struct.getJOB_ODR_DLV_DATE_TIME());
                   // �ǉ�
                   entity.minsertT_JOB_ODR.create(conn, struct);
                   
                   // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD START BY NESJN
	               //[���v�ʌv�Z����i���ԁj]�ɑ��݃`�F�b�N
	               List odList = entity.mselectSYS_JOB_OD_CALC_CTRL.read(conn, struct);
	               if(odList.size() <=0) {
	               	  // [���v�ʌv�Z����i���ԁj]�ւ̒ǉ����e
	               	  entity.minsertSYS_JOB_OD_CALC_CTRL.create(conn, struct);
	               }                  
                   // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD START BY NESJN
               
                   // ����
                   controlselect();
                  }
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
				} finally{
				 struct.setOPTION_ID(_SysInstallOptions_JF);
				}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //---------------------------------------------------------------------
                
        String Message = "";
        List listMessage = new ArrayList();
                 
        try{       
            // �g�����U�N�V�����J�n
            conn.beginTransWeb(); 	
			//�X�V���`�F�b�N
			List modifyList = entity.mselectT_JOB_ODR_modify.read(conn,struct);
			if(null == modifyList || modifyList.size() == 0){
				//�f�[�^�����݂��Ȃ��̂Ƃ�
				setErrorMessage("AB00054");
				return;
		
			}
			String tempModify =((AB0020010Struct)modifyList.get(0)).getMODIFY_COUNT();
			if(!tempModify.equals(struct.getMODIFY_COUNT())){ 					
				//�X�V�������ł͂Ȃ��̂Ƃ�
				setErrorMessage("AB00054");
				return;    				
			}
            // ��ʂ̐��Y�v�����ύX�̏ꍇ
            if(!"1".equals(struct.getUPDATE_FLG())) {
              
                 boolean result = false;		// �`�F�b�N���ʊi�[
              
                 // ����/�X�V�`�F�b�N
              /*   List countList = entity.mselectT_JOB_ODR_modify_count.read(conn, struct);
                     
                 if(countList.size() <= 0){
                  listMessage.add("T_JOB_ODR.ITEM_CD:" + struct.getITEM_CD());
                  listMessage.add("T_JOB_ODR.PLANT_CD:" + struct.getPLANT_CD());
                  listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
              
                  setErrorMessage("ZZ06001", listMessage);
                 }
                 else{
                  String modify = ((AB0020010Struct)countList.get(0)).getMODIFY_COUNT();
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   listMessage.add("T_JOB_ODR.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("T_JOB_ODR.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
              
                   setErrorMessage("ZZ01105", listMessage);
                  }
                 }*/
                 // �Čv�Z�\���`�F�b�N
                 List listT_OD = entity.mselectT_OD.read(conn, struct);
                 if (listT_OD.size()>0 && listT_OD != null) {
               	     for (int i = 0; i < listT_OD.size(); i++) {
               		 AB0020010Struct tempDmSysTypstruct = (AB0020010Struct)listT_OD.get(i);
					     if (tempDmSysTypstruct.getDM_STS_TYP().compareTo("2")>=0) {
						     if(struct.getJOB_ODR_EXP_TYP().intValue() == 1){
						         Message = "JOB_ODR_CD:" + struct.getJOB_ODR_CD();
			                     setErrorMessage("AB00055",tempDmSysTypstruct.getJOB_ODR_CD_ALC(),Message);
					         }else if("true".equals(struct.getc_JOB_ODR_DEL_FLG())){
                                 Message = "JOB_ODR_CD:" + struct.getJOB_ODR_CD();
			                     setErrorMessage("AB00056",tempDmSysTypstruct.getJOB_ODR_CD_ALC(),Message);
					         }else{
					             Message = "JOB_ODR_CD:" + struct.getJOB_ODR_CD();
					             setErrorMessage("AB00057",tempDmSysTypstruct.getJOB_ODR_CD_ALC(),Message);
					         }
				         }
				     }
                 }
                 
                 //�i�ڂ̃J�����_���`�F�b�N
                 result = entity.mcheckM_ITEM_CAL_NO.check(conn, struct);
                 // �[���`�F�b�N
                 if(result == true){
                		result = entity.mcheckT_JOB_ODR_dlv_date1.check(conn, struct);
                 }else{
                 	result = entity.mcheckT_JOB_ODR_dlv_date.check(conn, struct);
                 }
                 if(result == false){
                  Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  setErrorMessage("AB00021", Message);
                 }
                 
				if(struct.getJOB_ODR_DEL_FLG().intValue() == 1 &&
               		 (struct.getJOB_ODR_STS_TYP().intValue() == 1 || 
               		  struct.getJOB_ODR_STS_TYP().intValue() == 2 || 
               			struct.getJOB_ODR_STS_TYP().intValue() == 3)){
               	 }else{
                 		result = entity.mcheckSYS_DATE_CTRL.check(conn, struct);
                 		if(result == false){
                  		Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  		setErrorMessage("AB00025", Message);
                 		}
               	 }
              
                 //3����4���ɂ���
              	if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 3){
					struct.setJOB_ODR_DLV_DATE_TIME("0"+struct.getJOB_ODR_DLV_DATE_TIME());
				}
              	
                // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD START BY NESJN
                // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                if(msgStruct.sizeError() <= 0){
                	//[���v�ʌv�Z����i���ԁj]�ɑ��݃`�F�b�N
                	List odList = entity.mselectSYS_JOB_OD_CALC_CTRL.read(conn, struct);
                	if(odList.size() <=0) {
                		// [���v�ʌv�Z����i���ԁj]�ւ̒ǉ����e
                		entity.minsertSYS_JOB_OD_CALC_CTRL.create(conn, struct);
                	} else {
                		AB0020010Struct odStruct = (AB0020010Struct)odList.get(0);
                		// ���v�ʌv�Z���t���O
                		if("1".equals(odStruct.getOD_CALC_FLG())) {
                			// ���v�ʌv�Z(����)���s���̂��߃����e�i���X�ł��܂���B
                      		setErrorMessage("AC00236");
                		}
                	}
                }
                // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD END BY NESJN 
                
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  if(struct.getJOB_ODR_DEL_FLG().intValue() == 1 &&
                   (struct.getJOB_ODR_STS_TYP().intValue() == 1 || 
                   struct.getJOB_ODR_STS_TYP().intValue() == 2)){
                   // �폜
                   entity.mdeleteT_JOB_ODR.delete(conn, struct);
                   
                   // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD START BY NESJN
                   // �u���Ԍv��v�Ńf�[�^�����݂��Ȃ��ꍇ
                   boolean chkFlg = entity.mcheckT_JOB_ODR.check(conn, struct);
                   if(!chkFlg) {
                       // �m���v�ʌv�Z����i���ԁj�n����폜����
                       entity.mdeleteSYS_JOB_OD_CALC_CTRL.delete(conn, struct);
                   }
                   // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD END BY NESJN
                   
                  }
                  else{
					//Null�̏ꍇ
					if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 0){
						//�����Ǘ�����ꍇ��2359��ݒ�
						if(_flgTimeCtrl.equals("true")){
							struct.setJOB_ODR_DLV_DATE_TIME("2359");
						//�����Ǘ����Ȃ��ꍇ��0000��ݒ�
						}else{
							struct.setJOB_ODR_DLV_DATE_TIME("0000");
						}
					}
                   //�N�����{����
                   struct.setJOB_ODR_DLV_DATE_ALL(struct.getJOB_ODR_DLV_DATE()+struct.getJOB_ODR_DLV_DATE_TIME());
                   // �X�V
                   entity.mupdateT_JOB_ODR.update(conn, struct);
                   
                   // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD START BY NESJN
                   // [���v�ʌv�Z����i���ԁj]�ւ̍X�V����
                   entity.mupdateSYS_JOB_OD_CALC_CTRL.update(conn, struct);
                   // -----2008/07/15 ���v�ʌv�Z�i���ԁj�̋����@ADD END BY NESJN
                   
                  }                       
              
                  // ����
                  controlselect();
                 }
                 else{
                  // ���[���o�b�N
                  conn.rollback();
                 }
            } else {
                // ��ʂ̐��Y�v�����ύX���Ȃ��ꍇ
                controlselect();
            }         
            // �R�~�b�g
            conn.commit();
              
        }catch(SQLException e){
         setSqlExceptionMsg(e);
      
		} finally{
			struct.setOPTION_ID(_SysInstallOptions_JF);
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}

	/**
	 * ���n����o�ɗ\��ꗗ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlScrmovToTimeInOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlScrmovToTimeInOut");
			//{{user_implement_dev:<controlScrmovToTimeInOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlScrmovToTimeInOut>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlScrmovToTimeInOut");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //---------------------------------------------------------------------
              
                try{
                 // �R���{�{�b�N�X�f�[�^�p��
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
              
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
                 _UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
                 _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
                 _JOB_ODR_TYP = controller.getData("JOB_ODR_TYP");
                 _PLAN_TYP = controller.getData("PLAN_TYP");
                 _JOB_ODR_STS_TYP = controller.getData("JOB_ODR_STS_TYP");
                 _JOB_ODR_EXP_TYP = controller.getData("JOB_ODR_EXP_TYP");
                 _JOB_ODR_DEL_FLG = controller.getData("JOB_ODR_DEL_FLG");
              
                 PrivateConfig privateConfig = new PrivateConfig(conn);
                 // ���Ԃ̏�ԕ\���p������擾
                 if(getExpectString(privateConfig) == false){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
                 
                 // [�V�X�e���p�����[�^]���ԍ폜�t���O�擾
                 List tempList = entity.mselectJOB_ODR_DEL_FLG.read(conn,struct);
                 if(tempList.isEmpty()) {
                  setSysJobOdrDelFlg("0");
                 } else {
                  setSysJobOdrDelFlg(((AB0020010Struct)tempList.get(0)).getSYS_JOB_ODR_DEL_FLG());
                 }

                List listTimeCtrl = entity.mselectTIME_CTRL.read(conn,struct);
				if(listTimeCtrl == null || listTimeCtrl.size() <=0){
					struct.setTIME_CTRL("false");
					_flgTimeCtrl = "false";
				}else{
					struct.setTIME_CTRL(((AB0020010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
					_flgTimeCtrl = struct.getTIME_CTRL();
				}			
                 
                 // �f�t�H���g�l�ݒ�
                 controlclear();
                 
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }catch(ComboException e){
                 // �G���[���b�Z�[�W�쐬
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
              
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("ScrmovToTimeInOut") ) {
				controlScrmovToTimeInOut();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //---------------------------------------------------------------------
                struct.setList_JOB_ODR_TYP_val(_JOB_ODR_TYP.getValList());
                struct.setList_JOB_ODR_TYP_name(_JOB_ODR_TYP.getExplanList());
                struct.setList_PLAN_TYP_val(_PLAN_TYP.getValList());
                struct.setList_PLAN_TYP_name(_PLAN_TYP.getExplanList());
                 
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)(ame.getMessages()));
                 throw ee;
                //---------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AB0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AB0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AB0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AB0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AB0020010Entity entity;
	protected AB0020010Struct struct;
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

		entity = new AB0020010Entity();
		struct = new AB0020010Struct();

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
	 * AB0020010�N���X�̕W���R���X�g���N�^
	 */
	public AB0020010Control() throws BusinessProcessException, FoundationException
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
				AB0020010Struct key = (AB0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name") && key.getJOB_ODR_TYP_name() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_name", key.getJOB_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val") && key.getJOB_ODR_TYP_val() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_val", key.getJOB_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP_name") && key.getPLAN_TYP_name() != null) {
					msgKey.setKeyValue("PLAN_TYP_name", key.getPLAN_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP_val") && key.getPLAN_TYP_val() != null) {
					msgKey.setKeyValue("PLAN_TYP_val", key.getPLAN_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ALCD_ENABLE_QTY") && key.getALCD_ENABLE_QTY() != null) {
					msgKey.setKeyValue("ALCD_ENABLE_QTY", key.getALCD_ENABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("HAND_STOCK") && key.getHAND_STOCK() != null) {
					msgKey.setKeyValue("HAND_STOCK", key.getHAND_STOCK());
				}
				if(msgKeyType.containsKeyColumn("h_AUTO_NUM") && key.geth_AUTO_NUM() != null) {
					msgKey.setKeyValue("h_AUTO_NUM", key.geth_AUTO_NUM().toString());
				}
				if(msgKeyType.containsKeyColumn("JobOdrExpect") && key.getJobOdrExpect() != null) {
					msgKey.setKeyValue("JobOdrExpect", key.getJobOdrExpect());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_NAME") && key.getJOB_ODR_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_NAME", key.getJOB_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLAN_NAME") && key.getPLAN_NAME() != null) {
					msgKey.setKeyValue("PLAN_NAME", key.getPLAN_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_NAME") && key.getJOB_ODR_STS_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_NAME", key.getJOB_ODR_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME") && key.getUNIT_QTY_NAME() != null) {
					msgKey.setKeyValue("UNIT_QTY_NAME", key.getUNIT_QTY_NAME());
				}
				if(msgKeyType.containsKeyColumn("c_AUTO_NUM") && key.getc_AUTO_NUM() != null) {
					msgKey.setKeyValue("c_AUTO_NUM", key.getc_AUTO_NUM());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_DEL_FLG") && key.getc_JOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("c_JOB_ODR_DEL_FLG", key.getc_JOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP") && key.getc_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c_JOB_ODR_STS_TYP", key.getc_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_EXP_TYP") && key.getc_JOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("c_JOB_ODR_EXP_TYP", key.getc_JOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME") && key.getJOB_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_TIME", key.getJOB_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("UPDATE_FLG") && key.getUPDATE_FLG() != null) {
					msgKey.setKeyValue("UPDATE_FLG", key.getUPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("STS_FLG") && key.getSTS_FLG() != null) {
					msgKey.setKeyValue("STS_FLG", key.getSTS_FLG());
				}
				if(msgKeyType.containsKeyColumn("EXP_FLG") && key.getEXP_FLG() != null) {
					msgKey.setKeyValue("EXP_FLG", key.getEXP_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_DATE_TO") && key.getd_DATE_TO() != null) {
					msgKey.setKeyValue("d_DATE_TO", sdf.format(key.getd_DATE_TO()));
				}
				if(msgKeyType.containsKeyColumn("d_DATE_FROM") && key.getd_DATE_FROM() != null) {
					msgKey.setKeyValue("d_DATE_FROM", sdf.format(key.getd_DATE_FROM()));
				}
				if(msgKeyType.containsKeyColumn("d_JOB_ODR_DLV_DATE") && key.getd_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("d_JOB_ODR_DLV_DATE", key.getd_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_SERIAL") && key.gets_MAX_DISPLAY_MONTH_SERIAL() != null) {
					msgKey.setKeyValue("s_MAX_DISPLAY_MONTH_SERIAL", key.gets_MAX_DISPLAY_MONTH_SERIAL());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP") && key.getPLAN_TYP() != null) {
					msgKey.setKeyValue("PLAN_TYP", key.getPLAN_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP") && key.getJOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_EXP_TYP", key.getJOB_ODR_EXP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("MAX_DLV_DATE") && key.getMAX_DLV_DATE() != null) {
					msgKey.setKeyValue("MAX_DLV_DATE", key.getMAX_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("MIN_DLV_DATE") && key.getMIN_DLV_DATE() != null) {
					msgKey.setKeyValue("MIN_DLV_DATE", key.getMIN_DLV_DATE());
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
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("MUL_ODR_QTY") && key.getMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("MUL_ODR_QTY", key.getMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT") && key.getPKG_UNIT() != null) {
					msgKey.setKeyValue("PKG_UNIT", key.getPKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP") && key.getw_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("w_MANHOUR_TYP", key.getw_MANHOUR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_ALL") && key.getJOB_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_ALL", key.getJOB_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", sdf.format(key.getBUSINESS_OPR_DATE()));
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("SYS_JOB_ODR_DEL_FLG") && key.getSYS_JOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("SYS_JOB_ODR_DEL_FLG", key.getSYS_JOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2") && key.geth_PRD_REQ_JOB_ODR_TYP_2() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_2", key.geth_PRD_REQ_JOB_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_INSTALL_OPTIONS") && key.getSYS_INSTALL_OPTIONS() != null) {
					msgKey.setKeyValue("SYS_INSTALL_OPTIONS", key.getSYS_INSTALL_OPTIONS());
				}
				if(msgKeyType.containsKeyColumn("OD_CALC_FLG") && key.getOD_CALC_FLG() != null) {
					msgKey.setKeyValue("OD_CALC_FLG", key.getOD_CALC_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD_ALC") && key.getJOB_ODR_CD_ALC() != null) {
					msgKey.setKeyValue("JOB_ODR_CD_ALC", key.getJOB_ODR_CD_ALC());
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
					AB0020010Struct key = new AB0020010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name")) {
						key.setJOB_ODR_TYP_name(msgKey.getKeyValue("JOB_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val")) {
						key.setJOB_ODR_TYP_val(msgKey.getKeyValue("JOB_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP_name")) {
						key.setPLAN_TYP_name(msgKey.getKeyValue("PLAN_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP_val")) {
						key.setPLAN_TYP_val(msgKey.getKeyValue("PLAN_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_ENABLE_QTY")) {
						key.setALCD_ENABLE_QTY(msgKey.getKeyValue("ALCD_ENABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("HAND_STOCK")) {
						key.setHAND_STOCK(msgKey.getKeyValue("HAND_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("h_AUTO_NUM")) {
						key.seth_AUTO_NUM(new Integer(msgKey.getKeyValue("h_AUTO_NUM")));
					}
					if(msgKeyType.containsKeyColumn("JobOdrExpect")) {
						key.setJobOdrExpect(msgKey.getKeyValue("JobOdrExpect"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_NAME")) {
						key.setJOB_ODR_NAME(msgKey.getKeyValue("JOB_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_NAME")) {
						key.setPLAN_NAME(msgKey.getKeyValue("PLAN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_NAME")) {
						key.setJOB_ODR_STS_NAME(msgKey.getKeyValue("JOB_ODR_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME")) {
						key.setUNIT_QTY_NAME(msgKey.getKeyValue("UNIT_QTY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("c_AUTO_NUM")) {
						key.setc_AUTO_NUM(msgKey.getKeyValue("c_AUTO_NUM"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_DEL_FLG")) {
						key.setc_JOB_ODR_DEL_FLG(msgKey.getKeyValue("c_JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP")) {
						key.setc_JOB_ODR_STS_TYP(msgKey.getKeyValue("c_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_EXP_TYP")) {
						key.setc_JOB_ODR_EXP_TYP(msgKey.getKeyValue("c_JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME")) {
						key.setJOB_ODR_DLV_DATE_TIME(msgKey.getKeyValue("JOB_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("UPDATE_FLG")) {
						key.setUPDATE_FLG(msgKey.getKeyValue("UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STS_FLG")) {
						key.setSTS_FLG(msgKey.getKeyValue("STS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("EXP_FLG")) {
						key.setEXP_FLG(msgKey.getKeyValue("EXP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_DATE_TO")) {
						key.setd_DATE_TO(sdf.parse(msgKey.getKeyValue("d_DATE_TO")));
					}
					if(msgKeyType.containsKeyColumn("d_DATE_FROM")) {
						key.setd_DATE_FROM(sdf.parse(msgKey.getKeyValue("d_DATE_FROM")));
					}
					if(msgKeyType.containsKeyColumn("d_JOB_ODR_DLV_DATE")) {
						key.setd_JOB_ODR_DLV_DATE(msgKey.getKeyValue("d_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_SERIAL")) {
						key.sets_MAX_DISPLAY_MONTH_SERIAL(msgKey.getKeyValue("s_MAX_DISPLAY_MONTH_SERIAL"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP")) {
						key.setPLAN_TYP(new Integer(msgKey.getKeyValue("PLAN_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP")) {
						key.setJOB_ODR_EXP_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_EXP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(new Integer(msgKey.getKeyValue("JOB_ODR_DEL_FLG")));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("MAX_DLV_DATE")) {
						key.setMAX_DLV_DATE(msgKey.getKeyValue("MAX_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MIN_DLV_DATE")) {
						key.setMIN_DLV_DATE(msgKey.getKeyValue("MIN_DLV_DATE"));
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
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("MUL_ODR_QTY")) {
						key.setMUL_ODR_QTY(msgKey.getKeyValue("MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT")) {
						key.setPKG_UNIT(msgKey.getKeyValue("PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP")) {
						key.setw_MANHOUR_TYP(new Double(msgKey.getKeyValue("w_MANHOUR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_ALL")) {
						key.setJOB_ODR_DLV_DATE_ALL(msgKey.getKeyValue("JOB_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(new Integer(msgKey.getKeyValue("HOLIDAY_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(sdf.parse(msgKey.getKeyValue("BUSINESS_OPR_DATE")));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(new Integer(msgKey.getKeyValue("CAL_NO")));
					}
					if(msgKeyType.containsKeyColumn("SYS_JOB_ODR_DEL_FLG")) {
						key.setSYS_JOB_ODR_DEL_FLG(msgKey.getKeyValue("SYS_JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_2(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_INSTALL_OPTIONS")) {
						key.setSYS_INSTALL_OPTIONS(msgKey.getKeyValue("SYS_INSTALL_OPTIONS"));
					}
					if(msgKeyType.containsKeyColumn("OD_CALC_FLG")) {
						key.setOD_CALC_FLG(msgKey.getKeyValue("OD_CALC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD_ALC")) {
						key.setJOB_ODR_CD_ALC(msgKey.getKeyValue("JOB_ODR_CD_ALC"));
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
