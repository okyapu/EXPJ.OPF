/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/src/com/nec/jp/orteus/metamorBase/AA0020/AA0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0020;

import com.nec.jp.orteus.metamorBase.AA0020.*;
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
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0020010Control
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
        protected List list;										    // ���ʃ��X�g�̃C���X�^���X
        public List getList() { return this.list; }					     // ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
        public int getListsize() {									      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public AA0020010Struct getStruct() { return this.struct; }      // Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
       //------------------------------------------------------------------------------
       
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
       //---------- �����W�J���x�� ---------------------------------------------------
       
        /** �ő�W�J���x�� */
        String _level = null;
       
        /** �����W�J���x�� */
        String _initlevel = null;
       
       //---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------
       
        /** �W�J�敪 */
        ComboStruct _DEVELOP_TYP = new ComboStruct();
       
        /** �W�J�敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setDEVELOP_TYP(ComboStruct combo){ _DEVELOP_TYP = combo; }
       
        /** �W�J�敪�擾
         * @return �W�J�敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getDEVELOP_TYP(){ return _DEVELOP_TYP; }
       
// 2008/07/11 SYSCOM ���� ADD START
        /** �H���Ǘ��i�ڋ敪 */
        ComboStruct _MANHOUR_TYP = new ComboStruct();
       
        /** �H���Ǘ��i�ڋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setMANHOUR_TYP(ComboStruct combo){ _MANHOUR_TYP = combo; }
       
        /** �H���Ǘ��i�ڋ敪
         * @return �H���Ǘ��i�ڋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getMANHOUR_TYP(){ return _MANHOUR_TYP; }
// 2008/07/11 SYSCOM ���� ADD END
        
        /** �x���敪 */
        ComboStruct _CONS_TYP = new ComboStruct();
       
        /** �x���敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setCONS_TYP(ComboStruct combo){ _CONS_TYP = combo; }
       
        /** �x���敪�擾
         * @return �x���敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getCONS_TYP(){ return _CONS_TYP; }
       
       
        /** �����ςݏグ�L�� */
        ComboStruct _COST_UP_TYP = new ComboStruct();
       
        /** �����ςݏグ�L�� �ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setCOST_UP_TYP(ComboStruct combo){ _COST_UP_TYP = combo; }
       
        /** �����ςݏグ�L�� �擾
         * @return �����ςݏグ�L�� �̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getCOST_UP_TYP(){ return _COST_UP_TYP; }
        
        
        /** MRP�W�J�L�� */
        ComboStruct _MRP_EXP_TYP = new ComboStruct();
        
        /** MRP�W�J�L���ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setMRP_EXP_TYP(ComboStruct combo){ _MRP_EXP_TYP = combo; }
       
        /** MRP�W�J�L���擾
         * @return MRP�W�J�L���̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getMRP_EXP_TYP(){ return _MRP_EXP_TYP; }
       
       
        /** ���i�\��L/T�̎g�p�L�� */
        ComboStruct _PS_LT_FLG = new ComboStruct();
        
        /** ���i�\��L/T�̎g�p�L���ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setPS_LT_FLG(ComboStruct combo){ _PS_LT_FLG = combo; }
       
        /** ���i�\��L/T�̎g�p�L���擾
         * @return ���i�\��L/T�̎g�p�L���̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getPS_LT_FLG(){ return _PS_LT_FLG; }
        
        /** ���i�\���L���I�����t     */
        private static final String END_DATE = "2999/12/31";        
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param iTyp �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, Integer iTyp)
        {
         if(comboStruct == null || iTyp == null)  return null;
         return getTypeName(comboStruct,TypeConverter.sanitizer(iTyp));
        }
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param strTyp �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         if(comboStruct == null || strTyp == null)  return null;
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
         * ���i�\�����̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����A�\����ݒ肷����
         */
        private void setTypeValueAboutPs(AA0020010Struct s)
        {
// 2008/07/11 SYSCOM ���� ADD START
         s.setCOMP_MANHOUR_NAME(getTypeName(_MANHOUR_TYP,s.getCOMP_MANHOUR_TYP()));
// 2008/07/11 SYSCOM ���� ADD END
         s.sets_CONS_NAME(getTypeName(_CONS_TYP,s.gets_CONS_TYP()));
         s.setPS_LT_NAME(getTypeName(_PS_LT_FLG,s.getPS_LT_FLG()));
         s.setCOST_UP_NAME(getTypeName(_COST_UP_TYP,s.gets_COST_UP_TYP()));
         s.setMRP_EXP_NAME(getTypeName(_MRP_EXP_TYP,s.gets_MRP_EXP_TYP()));
        }
       
       //---------- �e�q��ʊ֘A�̏��� -------------------------------------------
       
        /** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
        private AA0020010Struct _keyStruct = new AA0020010Struct();
       
        /** �L�[���Struct�̎擾 */
        public AA0020010Struct getKeyStruct(){ return _keyStruct; }
        
        /** �L�[���Struct�̐ݒ� */
        public void setKeyStruct(AA0020010Struct struct){ _keyStruct.copy(struct); }
       
       
       //---------- �ǉ��E�X�V���̓��͒l�`�F�b�N--------------------------------------
       
        /** 
         * ���͒l�`�F�b�N�B
         * NOT NULL���ڂɒl�������Ă��Ȃ��ꍇ�A�f�t�H���g�l��ݒ肷��
         * @param checkStruct �`�F�b�N�Ώۂ�Struct
         */
        private void checkStruct(AA0020010Struct checkStruct)
        {
         // �Ɖ��
         if(checkStruct.getPS_REF_NO() == null
         || "".equals(checkStruct.getPS_REF_NO()))
          checkStruct.setPS_REF_NO(AA0020Common._PS_REF_NO);
       
         // �\���d����
         if(checkStruct.getPS_SPOIL() == null
         || "".equals(checkStruct.getPS_SPOIL()))
          checkStruct.setPS_SPOIL(AA0020Common._PS_SPOIL);
       
         // �\���Œ蕪���[�h�^�C��
         if(checkStruct.getPS_FIXED_LT() == null
         || "".equals(checkStruct.getPS_FIXED_LT()))
          checkStruct.setPS_FIXED_LT(AA0020Common._PS_FIXED_LT);
       
         // �\����ᕪ���[�h�^�C��
         if(checkStruct.getPS_PROP_LT() == null
         || "".equals(checkStruct.getPS_PROP_LT()))
          checkStruct.setPS_PROP_LT(AA0020Common._PS_PROP_LT);
       
         // �\����ᕪ���b�g�T�C�Y
         if(checkStruct.getPS_PROP_LOT_SIZE() == null
         || "".equals(checkStruct.getPS_PROP_LOT_SIZE()))
          checkStruct.setPS_PROP_LOT_SIZE(AA0020Common._PS_PROP_LOT_SIZE);
       
        }
       
       
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
       
       //---------- ���[�s���O�`�F�b�N���� -------------------------------------------
       
        /**
         * ���[�s���O�`�F�b�N�B�t�W�J���s�����i�ڔԍ������� �L��
         * @param repository ���i�\�����|�W�g��
         * @param checkItem �Ώەi�ڔԍ�
         * @param item ��r����i�ڔԍ�
         * @return true:�L  false:��
         */
        private boolean checkReverseRooping(ProductStructureRepository repository, 
                   String targetItem, String item)
         throws SQLException
        {
         // �e�i�ڔԍ��ꗗ�擾
         ArrayList itemList = repository.reverseDeployment(item);
         checkItemList(itemList);
       
         for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
           // �e�i�ڔԍ��ꗗ����X�ɏ�̐e�i�ڎ擾
           boolean result = checkReverseRooping(repository, 
                targetItem, (String)itemList.get(i));
           if(result == true) return true;
          }
          else{
           return true;
          }
         }
         return false;
        }
       
       
        /**
         * ���[�s���O�`�F�b�N�B���W�J���s�����i�ڔԍ������� �L��
         * @param repository ���i�\�����|�W�g��
         * @param checkItem �Ώەi�ڔԍ�
         * @param item ��r����i�ڔԍ�
         * @return true:�L  false:��
         */
        private boolean checkRooping(ProductStructureRepository repository, 
                String targetItem, String item)
         throws SQLException
        {
         // �q�i�ڔԍ��ꗗ�擾
         ArrayList itemList = repository.orderDeployment(item);
         checkItemList(itemList);
       
         for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
           // �q�i�ڔԍ��ꗗ����X�ɉ��̎q�i�ڎ擾
           boolean result = checkRooping(repository, targetItem, (String)itemList.get(i));
           if(result == true) return true;
          }
          else{
           return true;
          }
         }
         return false;
        }
       
       
       //---------- �L�����̏d���`�F�b�N���� -----------------------------------------
       
        /**
         * �L�����̏d���`�F�b�N
         * @param parentItem �e�i�ڔԍ�
         * @param compItem �q�i�ڔԍ�
         * @param psedition �\���Ő�
         * @param inDate �L���J�n��
         * @param outDate �L���I����
         * @return true:OK  false:NG
        */
        private boolean checkEffectiveDate_update(String parentItem, String compItem, String psedition,
             String inDate, String outDate)
         throws SQLException, FoundationException, ParseException
        {
         // �e�i�ځA�q�i�ڂ���v����\�����擾
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(parentItem);
         workStruct.setCOMP_ITEM_CD(compItem);
         List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
       
         // ���\�����͔�r�Ώۂ���폜
         for(int i = 0; i < dateList.size(); i++){
          AA0020010Struct checkStruct = (AA0020010Struct)dateList.get(i);
          if(parentItem.equals(checkStruct.getPARENT_ITEM_CD()) &&
           compItem.equals(checkStruct.getCOMP_ITEM_CD()) &&
           psedition.equals(checkStruct.getPS_EDITION())){
           dateList.remove(i);
           break;
          }
         }
         return checkEffectiveDate(dateList, inDate, outDate);
        }
       
        /**
         * �L�����̏d���`�F�b�N
         * @param parentItem �e�i�ڔԍ�
         * @param compItem �q�i�ڔԍ�
         * @param inDate �L���J�n��
         * @param outDate �L���I����
         * @return true:OK  false:NG
        */
        private boolean checkEffectiveDate_insert(String parentItem, String compItem,
             String inDate, String outDate)
         throws SQLException, FoundationException, ParseException
        {
         // �e�i�ځA�q�i�ڂ���v����\�����擾
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(parentItem);
         workStruct.setCOMP_ITEM_CD(compItem);
         List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
         return checkEffectiveDate(dateList, inDate, outDate);
        }
       
       
        /**
         * �L�����̏d���`�F�b�N
         * @param dateList �d���`�F�b�N����\�����
         * @param inDate �L���J�n��
         * @param outDate �L���I����
         * @return true:OK  false:NG
        */
        private boolean checkEffectiveDate(List dateList, String inDate, String outDate)
         throws SQLException, FoundationException, ParseException
        {
         boolean result = true;	  // �`�F�b�N���ʊi�[
         Date d_inDate = stringToDate(inDate);
         Date d_outDate = stringToDate(outDate);
         for(int i = 0; i < dateList.size(); i++)
         {
          String targetInDate = ((AA0020010Struct)dateList.get(i)).getEFF_PHASE_IN_DATE();
          String targetOutDate = ((AA0020010Struct)dateList.get(i)).getEFF_PHASE_OUT_DATE();
       
          Date d_targetInDate = stringToDate(targetInDate);
          Date d_targetOutDate =  stringToDate(targetOutDate);
       
          if(d_targetInDate.getTime() > d_inDate.getTime()){
           // �J�n���t �� �`�F�b�N�Ώۂ̊J�n���t�̏ꍇ
           if(d_targetInDate.getTime() <= d_outDate.getTime()){
            // �J�n���t �� �`�F�b�N�Ώۂ̏I�����t�̏ꍇ
            result = false;
            break;
           }
          }
          else if(d_targetInDate.getTime() < d_inDate.getTime()){
           // �J�n���t �� �`�F�b�N�Ώۂ̏I�����t�̏ꍇ
           if(d_targetOutDate.getTime() >= d_inDate.getTime()){
            // �`�F�b�N�Ώۂ̏I�����t ���� �J�n���t
            result = false;
            break;
           }
          }
          else{
           // �J�n���t == �`�F�b�N�Ώۂ̊J�n���t
           result = false;
           break;
          }
         }
         return result;
        }
        //---------- �L���J�n���t�ƗL���I�����t��ݒ� -------------------------------------
        /**
         * �T�u�P�L���J�n���t�ƗL���I�����t�����������܂��B
         */
        private void initialDate() throws BusinessProcessException, FoundationException
        {
           try{
        	   beginTransaction();     // �V�X�e���������擾
        	   struct.setEFF_PHASE_IN_DATE(null);
        	   struct.setEFF_PHASE_OUT_DATE(null);
        	   //[�p�����[�^]�D"���O"��ݒ肵�܂�
        	   struct.setP_NAME("PS_EFF_PHASE_IN_DATE");
        	   Date t;
        	   //[�p�����[�^]�D"�ݒ�l"���擾
        	   List dateInList = entity.mselectSYS_PARAMETER.read(conn, struct);
        	   if (dateInList.isEmpty()){
        		   return;
        	   }
        	   AA0020010Struct dateInStruct = (AA0020010Struct) dateInList.get(0);
        	   if ( dateInStruct.getP_VALUE() != null && !dateInStruct.getP_VALUE().equals("")
        			   && !(dateInStruct.getP_VALUE().toLowerCase()).equals("null")){
        		   if(dateInStruct.getP_VALUE().equals("*"))
        		   {
        			  //�V�X�e�����[�U���擾
        			  struct.setP_USER_CD(struct.getsUser_ID());
        			  List userList = entity.mselectUSER_MST.read(conn,struct);
        			  if (userList.isEmpty()){
        				  ExpjMessage emsg = new ExpjMessage("KR00017");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, sysUSER_CD);
                          throw new ExpjException("KR00017");
        			  }
        			  AA0020010Struct userStruct = (AA0020010Struct) userList.get(0);
        			  
        			  //�H��R�[�h���擾
        			  List sysDateCtrlList = entity.mselectSYS_DATE_CTRL.read(conn, userStruct);
                      if (sysDateCtrlList.isEmpty()){
                          ExpjMessage emsg = new ExpjMessage("KQ00039");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, sysUSER_CD);
                          throw new ExpjException("KQ00039");
                      }
	                  AA0020010Struct sysDateStruct = (AA0020010Struct) sysDateCtrlList.get(0);
                      struct.setEFF_PHASE_IN_DATE(sysDateStruct.getP_BUSINESS_DATE());
        		   }else{
        			   if(checkDate(dateInStruct.getP_VALUE()) == true){
        				   try{
    	        			   //���t�`���𔻕�
    	        			   t = stringToDate(dateInStruct.getP_VALUE());
    	        			   //[�p�����[�^]�D"�ݒ�l"!=null�̏ꍇ�A�L���J�n���t�@= [�p�����[�^]�D"�ݒ�l"
    	        			   struct.setEFF_PHASE_IN_DATE(dateToString(t));
    	        		   }catch(ParseException   e){
    	        			   //"�L���J�n���̃p�����[�^���s���ł��B"
    	        			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
    	                       msgStruct.addError(emsg);
    	                       sysLog.warning(emsg, getsysUSER_CD());
    	        		   }
        			   }else{
        				   //"�L���J�n���̃p�����[�^���s���ł��B"
	        			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
	                       msgStruct.addError(emsg);
	                       sysLog.warning(emsg, getsysUSER_CD());
        			   }
        		   }
        	   }else{
        		   struct.setEFF_PHASE_IN_DATE(null);
        	   }
               //[�p�����[�^]�D"���O"��ݒ肵�܂�
        	   struct.setP_NAME("PS_EFF_PHASE_OUT_DATE");
        	   //[�p�����[�^]�D"�ݒ�l"���擾
        	   List dateOutList = entity.mselectSYS_PARAMETER.read(conn, struct);
        	   if (dateOutList.isEmpty()){
        		   return;
        	   }
        	   AA0020010Struct dateOutStruct = (AA0020010Struct) dateOutList.get(0);        	   
        	   if ( dateOutStruct.getP_VALUE() != null && !dateOutStruct.getP_VALUE().equals("")
        			   && !(dateOutStruct.getP_VALUE().toLowerCase()).equals("null")){
        		   if(dateOutStruct.getP_VALUE().equals("*")){
         			  //�V�X�e�����[�U���擾
         			  struct.setP_USER_CD(struct.getsUser_ID());
         			  List userList = entity.mselectUSER_MST.read(conn,struct);
         			  if (userList.isEmpty()){
         				 ExpjMessage emsg = new ExpjMessage("KR00017");
                         msgStruct.addError(emsg);
                         sysLog.warning(emsg, sysUSER_CD);
                         throw new ExpjException("KR00017");
         			  }
         			  AA0020010Struct userStruct = (AA0020010Struct) userList.get(0);
         			  
         			  //�H��R�[�h���擾
         			  List sysDateCtrlList = entity.mselectSYS_DATE_CTRL.read(conn, userStruct);
	                  if (sysDateCtrlList.isEmpty()){
	                      ExpjMessage emsg = new ExpjMessage("KQ00039");
	                      msgStruct.addError(emsg);
	                      sysLog.warning(emsg, sysUSER_CD);
	                    throw new ExpjException("KQ00039");
	                  }
	                  AA0020010Struct sysDateStruct = (AA0020010Struct) sysDateCtrlList.get(0);
                      struct.setEFF_PHASE_OUT_DATE(sysDateStruct.getP_BUSINESS_DATE());
        		   }else{
        			   if(checkDate(dateOutStruct.getP_VALUE()) == true){
        				   try{
    	        			   //���t�`���𔻕�
    	        			   t = stringToDate(dateOutStruct.getP_VALUE());
    	        			   //[�p�����[�^]�D"�ݒ�l"!=null�̏ꍇ�A�L���I�����t�@= [�p�����[�^]�D"�ݒ�l"
    	        			   struct.setEFF_PHASE_OUT_DATE(dateToString(t));
    	        		   }catch(ParseException   e){
    	        			   //"�L���I�����̃p�����[�^���s���ł��B"
    	        			   ExpjMessage emsg = new ExpjMessage("ZZ13002");
    	                       msgStruct.addError(emsg);
    	                       sysLog.warning(emsg, getsysUSER_CD());
    	        		   }
        			   }else{
        				   //"�L���I�����̃p�����[�^���s���ł��B"
	        			   ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                       msgStruct.addError(emsg);
	                       sysLog.warning(emsg, getsysUSER_CD());
        			   }
	        	   }
        	   }else{
        		   struct.setEFF_PHASE_OUT_DATE(null);
        	   }
           }catch(FoundationException e){
        	   e.printStackTrace();
           }
           catch(SQLException ee){
              ee.printStackTrace();            	   
           }            	   
        }
       //---------- �i�ڎ�z�敪�\���`�F�b�N���� -------------------------------------
       
        /**
         * �i�ڎ�z�敪�ʍ\���`�F�b�N
         * @param repository ���i�\�����|�W�g��
         * @param parent �e�i�ڔԍ�
         * @param comp �q�i�ڔԍ�
         * @return true�FOK  false:NG
        */
        private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
                    String parent, String comp)
         throws SQLException, FoundationException
        {
         AA0020010Struct workStruct = new AA0020010Struct();
         List workList = null;
         Integer parent_typ = null;
         Integer comp_typ = null;
       
         // �e�̎�z�敪�擾
         workStruct.setITEM_CD(parent);
         workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
         parent_typ = ((AA0020010Struct)workList.get(0)).getMRP_ODR_TYP();
       
         // �q�̎�z�敪�擾
         workStruct.setITEM_CD(comp);
         workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
         comp_typ = ((AA0020010Struct)workList.get(0)).getMRP_ODR_TYP();
       
         //  �e�i�� �C�}�j���A����z�i�ځA�D���b�g��z�i�ځA�E��ʎ�z�i�ځA�F�����_��z�i��
         if(parent_typ.intValue() == 4 || parent_typ.intValue() == 5 ||
          parent_typ.intValue() == 6 || parent_typ.intValue() == 7){
          
          //  �q�i�� �@�ʕi�� �A�݌Ɉ����^�ʕi��
          if(comp_typ.intValue() == 1 || comp_typ.intValue() == 2) return false;
         }
         
         ArrayList itemList = null;
         // �e�i�� �G�[���i��
         if(parent_typ.intValue() == 8)
         {
          // �q�i�� �G�[���i��
          if(comp_typ.intValue() == 8) return false;
          else if(comp_typ.intValue() == 4 || comp_typ.intValue() == 5 ||
            comp_typ.intValue() == 6 || comp_typ.intValue() == 7) return true;
          else{
           // �e�i�ڂ��q�i�ڂƂȂ�\�����̐e�i�ڎ擾
           itemList = repository.reverseDeployment(parent);
           checkItemList(itemList);
           for(int i = 0; i < itemList.size(); i++)
           {
            // �擾�����e�i�ڂ̎�z�敪�擾
            workStruct.setITEM_CD((String)itemList.get(i));
            List parentList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
            Integer typ = ((AA0020010Struct)parentList.get(0)).getMRP_ODR_TYP();
            
            if(typ.intValue() == 4 || typ.intValue() == 5 ||
             typ.intValue() == 6 || typ.intValue() == 7) return false;
           }
          }
         }
       
         // �q�i�� �G�[���i��
         if(comp_typ.intValue() == 8)
         {
          // �e�i�� �G�[���i��
          if(parent_typ.intValue() == 8) return false;
          else if(parent_typ.intValue() == 1 || parent_typ.intValue() == 2) return true;
          else{
           // �q�i�ڂ��e�i�ڂƂȂ�\�����̎q�i�ڎ擾
           itemList = repository.orderDeployment(comp);
           checkItemList(itemList);
           for(int i = 0; i < itemList.size(); i++)
           {
            // �擾�����q�i�ڂ̎�z�敪�擾
            workStruct.setITEM_CD((String)itemList.get(i));
            List compList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
            Integer typ = ((AA0020010Struct)compList.get(0)).getMRP_ODR_TYP();
            
            if(typ.intValue() == 1 || typ.intValue() == 2 ) return false;
           }
          }
         }
       
         return true;
        }
       
       
       //---------- ���i�\�����|�W�g���֘A�̏��� -------------------------------------------
       
        /** �d���`�F�b�N
         * @param itemList �d���`�F�b�N����i�ڃ��X�g
        */
        private void checkItemList(ArrayList itemList)
        {
         List workList = new ArrayList(0);
         for(int i = 0; i < itemList.size(); i++){
          boolean result =true;
          String item_cd = (String)itemList.get(i);
          for(int t = 0; t < workList.size(); t++){
           if(item_cd.equals((String)workList.get(t)) == true)
            result = false;
          }
          if(result == true)
           workList.add(item_cd);
         }
       
         itemList.clear();
         for(int i = 0; i < workList.size(); i++)
          itemList.add(workList.get(i));
        }
       
       
       //---------- ���i�\���擾�֘A�̏��� -------------------------------------------
       
        /** ���i�\�����X�g */
        private ArrayList _deployList = new ArrayList(0);
       
        /** ���i�\�����X�g�擾 
         * @return ���i�\�����X�g
        */
        public ArrayList getDeployList(){ return _deployList; }
       
        /** ���t�t�H�[�}�b�g */
        //private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       
        /**
         * Date�^ �� String�^�B
         * @return String YYYY/MM/DD�`��
         */
        public String dateToString(Date date)
        {
         //return _dateFormat.format(date);
         return Converter.dateToStr(date, "yyyy/MM/dd");
        }
       
        /**
         * String�^ �� Date�^�B
         * @return Date 
         */
        public Date stringToDate(String date) throws ParseException
        {
         //return _dateFormat.parse(date);
         return Converter.strToDate(date, "yyyy/MM/dd");
        }
        /**    
         * check ���t�`���Fyyyy/MM/dd
         * @param sourceDate    
         * @return    
         */     
         public static boolean checkDate(String sourceDate){     
         if(sourceDate==null){     
         return false;     
         }     
         try {     
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");     
         dateFormat.setLenient(false);     
         dateFormat.parse(sourceDate);     
         return true;     
         } catch (Exception e) {     
         }     
         return false;     
         }        
        //---------- ���W�J --------------------------------------------------------
       
        /** ���W�J �Ώۓ��t���� 
         * @param repository ���i�\�����|�W�g��
         * @param item �e�i��
         * @param deployLevel �W�J���x��
         * @param tagetDate �Ώۓ��t
         * @param no �K�w���x��
        */
        public void getDeploy(ProductStructureRepository repository, 
             String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
       
         // �q�i�ڔԍ��ꗗ�擾
         ArrayList itemList = repository.orderDeployment(item, targetDate);
         checkItemList(itemList);
       
         // �e�i�ڂƎq�i�ڂ̍\�����擾
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(item);
         workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
         workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS_set_date.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // �W�J���x���`�F�b�N
         if(deployLevel.intValue() <= 1){
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // �\����񂩂�X�ɉ��̎q�i�ڎ擾
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getCOMP_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        /** ���W�J �Ώۓ��t�Ȃ� 
         * @param repository ���i�\�����|�W�g��
         * @param item �e�i��
         * @param deployLevel �W�J���x��
         * @param no �K�w���x��
        */
        public void getDeploy(ProductStructureRepository repository, 
              String item, Integer deployLevel, Integer no)
         throws SQLException, FoundationException
        {
         // �q�i�ڔԍ��ꗗ�擾
         ArrayList itemList = repository.orderDeployment(item);
         checkItemList(itemList);
       
         // �e�i�ڂƎq�i�ڂ̍\�����擾
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(item);
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // �W�J���x���`�F�b�N
         if(deployLevel.intValue() <= 1){
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // �\����񂩂�X�ɉ��̎q�i�ڎ擾
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getCOMP_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        //---------- �t�W�J --------------------------------------------------------
       
        /** �t�W�J �Ώۓ��t���� 
         * @param repository ���i�\�����|�W�g��
         * @param item �q�i��
         * @param deployLevel �W�J���x��
         * @param tagetDate �Ώۓ��t
         * @param no �K�w���x��
        */
        public void getReverseDeploy(ProductStructureRepository repository, 
            String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
       
         // �e�i�ڔԍ��ꗗ�擾
         ArrayList itemList = repository.reverseDeployment(item, targetDate);
         checkItemList(itemList);
       
         // �e�i�ڂƎq�i�ڂ̍\�����擾
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setCOMP_ITEM_CD(item);
         workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
         workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS_set_date.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // �W�J���x���`�F�b�N
         if(deployLevel.intValue() <= 1){
          // �ő�W�J���x��
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // �\����񂩂�X�ɏ�̐e�i�ڎ擾
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getReverseDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getPARENT_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
       
        /** �t�W�J �Ώۓ��t�Ȃ� 
         * @param repository ���i�\�����|�W�g��
         * @param item �q�i��
         * @param deployLevel �W�J���x��
         * @param no �K�w���x��
        */
        public void getReverseDeploy(ProductStructureRepository repository, 
               String item, Integer deployLevel, Integer no)
         throws SQLException, FoundationException
        {
       
         // �e�i�ڔԍ��ꗗ�擾
         ArrayList itemList = repository.reverseDeployment(item);
         checkItemList(itemList);
       
         // �e�i�ڂƎq�i�ڂ̍\�����擾
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setCOMP_ITEM_CD(item);
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // �W�J���x���`�F�b�N
         if(deployLevel.intValue() <= 1){
          // �ő�W�J���x��
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // �\����񂩂�X�ɏ�̐e�i�ڎ擾
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getReverseDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getPARENT_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               new Integer(no.intValue() + 1));
          }
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
         * SQLException�G���[���b�Z�[�W�ݒ�
         * @param �o�̓G���[���b�Z�[�W
         */
        private void setSqlExceptionMsg(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.severe(emsg, getsysUSER_CD());
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
         sysLog.severe(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.severe(emsg, getsysUSER_CD());
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
         sysLog.severe(emsg, getsysUSER_CD());
         
         for(int i=0; i<message.size(); i++)
         {
          emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
          msgStruct.addError( emsg );
          sysLog.severe(emsg, getsysUSER_CD());
         }
        }
         
        /**
         * �G���[���b�Z�[�W�ݒ�
         * @param ���O�o�̓��b�Z�[�W
         */
        private void setErrorLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.severe(emsg, getsysUSER_CD());
        }
         
        /**
         * �G���[���b�Z�[�W�ݒ�(�L�[�o�͂Ȃ�)
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setErrorMessageNoKey(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.severe(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.severe(emsg, getsysUSER_CD());
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
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * �x�����b�Z�[�W�ݒ�
         * @param �o�̓��b�Z�[�W
         */
        private void setWarnMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * �x�����b�Z�[�W�ݒ�
         * @param ���O�o�̓��b�Z�[�W
         */
        private void setWarnLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.warning(emsg, getsysUSER_CD());
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
         sysLog.info(emsg, getsysUSER_CD());
        }
       
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param �o�̓��b�Z�[�W
         */
        private void setInfoMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addInfo( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param ���O�o�̓��b�Z�[�W
         */
        private void setInfoLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.info(emsg, getsysUSER_CD());
        }
       
        // DB�X�V���t���O
        private boolean bDBUpdate;
       
         
        /** 
         * @param target_struct �Ώۃf�[�^���
         * @param devType       �W�J�t���O(1:���W�J)
         * @return delList      �폜�Ώۃf�[�^
         */
        private List checkTargetDataIn(AA0020010Struct target_struct, int devType) throws FoundationException, SQLException
        {
         String Message = "";
         
         // �폜����Ώۃf�[�^
         List delList = null;
         
         // ���v���R�[�h����
         HashSet set = new HashSet(); 
       
         // ���v�t���O
         boolean chekflg;
       
         // �폜���郌�R�[�h���擾
         delList = entity.mselectM_PS_ps_edition.read(conn, target_struct);
         
         
         for(int i=1; i<_deployList.size(); i++) {
          
          String depParItem = null;	// �����e�i�ڔԍ�
          String depComItem = null;	// �����q�i�ڔԍ�
          String depEdition = null;	// �������i�\���Ő�
          
          // �W�J���x���`�F�b�N
          if(devType == 1) {
           chekflg = checkDataExistence(target_struct.getPARENT_ITEM_CD(), ((AA0020010Struct)_deployList.get(i)).getPARENT_ITEM_CD());
          } else {
           chekflg = checkDataExistence(target_struct.getCOMP_ITEM_CD(), ((AA0020010Struct)_deployList.get(i)).getCOMP_ITEM_CD());
          }
          
          if(chekflg) {
           
           // ���v�����e���ڂ�������X�g���擾
           depParItem = ((AA0020010Struct)_deployList.get(i)).getPARENT_ITEM_CD();
           depComItem = ((AA0020010Struct)_deployList.get(i)).getCOMP_ITEM_CD();
           depEdition = ((AA0020010Struct)_deployList.get(i)).getPS_EDITION();
           
           // ���v���R�[�h�̌��������Z
           if(devType == 1) {
        	   set.add(depComItem.trim() + depEdition.trim());
           } else {
        	   set.add(depParItem.trim() + depEdition.trim());
           }
           
           // �f�[�^���݃t���O������
           boolean isExist = false;
           
           String modify = null;
           
           for(int j=0; j<delList.size(); j++) {
            if(depParItem.equals(((AA0020010Struct)delList.get(j)).getPARENT_ITEM_CD()) &&
             depComItem.equals(((AA0020010Struct)delList.get(j)).getCOMP_ITEM_CD())  &&
             depEdition.equals(((AA0020010Struct)delList.get(j)).getPS_EDITION())   ) {
              
              // �f�[�^���݃t���OON
              isExist = true;
              
              // �X�V�񐔎擾
              modify = ((AA0020010Struct)delList.get(j)).getMODIFY_COUNT();
              break;
            } 
           }
           
           // �f�[�^�ˍ����G���[
           if(isExist == false) {
            Message = "Data is rewritten by other processings.";
            setErrorMessageNoKey("ZZ01105", Message);
            
            return null;
           } else {
            // �X�V�񐔃`�F�b�N
            if(((AA0020010Struct)_deployList.get(i)).getMODIFY_COUNT().equals(modify) == false) {
             Message = "Data is rewritten by other processings.";
             setErrorMessageNoKey("ZZ01105", Message);
             
             return null;
            }
           }
          }
         }
         // �폜����f�[�^���������ɂ���f�[�^��葽���ꍇ
         if(set.size() != delList.size()) {
          Message = "Data is rewritten by other processings.";
          setErrorMessageNoKey("ZZ01105", Message);
          
          return null;
         }
         
         return delList;
        }
         
        /** 
         * @param sTarget �`�F�b�N����e�^�q�i�ڔԍ�
         * @param gChkData �������X�g�̐e�^�q�i�ڔԍ�
         * @return boolean true:�f�[�^���� false:�f�[�^�Ȃ�
         */
        private boolean checkDataExistence(String sTarget, String gChkData) throws FoundationException
        {
         if(sTarget.equals(gChkData) == true) {
          return true;
         } else {
          return false;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
                String Message = "";
              
                try
                {
              
                 Integer inLevel;
                 
                 // �\����񃊃X�g�N���A
                 _deployList.clear();
              
                 List workList = null;	   // �Ώەi�ڏ��i�[
              
                 // �W�J���x���̃`�F�b�N
                 Integer level = Integer.valueOf(_level);
              
                 // ���͂����W�J���x����Integer�^�ɕϊ����Ď擾����
                 inLevel = IntegerConverter.Convert(struct.getw_LEVEL());
              
                 if(level.intValue() < inLevel.intValue()){
                  setErrorMessageNoKey("AA00104", "");
                 }
              
                 // �Ώەi�ڏ��擾
                 workList = entity.mselectM_ITEM.read(conn, struct);
                 if(workList.size() <= 0){       // �Ώەi�ڂ̎擾���s
                  setReadStatus(INITIAL);
              
                  Message = "M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD();
                  setErrorMessage("ZZ06001", Message);
// 2008/07/11 SYSCOM ���� ORIGINAL START
//                 } else {
//                  setReadStatus(NORMAL);
//                 }
// 2008/07/11 SYSCOM ���� ORIGINAL END
// 2008/07/11 SYSCOM ���� UPD START
                 } else {
                  // �H���Ǘ��i�ڋ敪�`�F�b�N
                  if(((AA0020010Struct)workList.get(0)).getCOMP_MANHOUR_TYP().equals("1") 
                     && struct.gets_DEVELOP_TYP().intValue() == 1){
                   Message = "M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD();
                   setErrorMessage("AA00178", Message);
                  }else{
                   setReadStatus(NORMAL);
                  }
                 }
// 2008/07/11 SYSCOM ���� UPD END
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  AA0020010Struct targetStruct = new AA0020010Struct();
                  targetStruct.clear();
                  AA0020010Struct workStruct = (AA0020010Struct)workList.get(0);
                  targetStruct.setPARENT_ITEM_CD(workStruct.getPARENT_ITEM_CD());
                  targetStruct.setPARENT_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
                  targetStruct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
                  targetStruct.setNO(new Integer(1));
                  _deployList.add(targetStruct);
               
                  // �W�J���x��'0'�łȂ��ꍇ�A�W�J�������{
                  if(inLevel.intValue() != 0){
               
                   // ���i�\�����|�W�g���쐬
                   ProductStructureRepository repository = new ProductStructureRepository(conn);
               
                   // ���W�J?�t�W�J?
                   if(struct.gets_DEVELOP_TYP().intValue() == 1){
                    // ���W�J
                    if(struct.getw_TARGET_DATE() == null ||
                      "".equals(struct.getw_TARGET_DATE()) == true){
                     // �Ώۓ��t��
                     getDeploy(repository, struct.getw_TARGET_ITEM_CD(), inLevel, new Integer(2));
                    }
                    else{
                     // �Ώۓ��t�L
                     Date targetDate = stringToDate(struct.getw_TARGET_DATE());
                     getDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                          inLevel, targetDate, new Integer(2));
                    }
                   }
                   else{
                    // �t�W�J
                    if(struct.getw_TARGET_DATE() == null ||
                      "".equals(struct.getw_TARGET_DATE()) == true){
                     // �Ώۓ��t��
                     getReverseDeploy(repository, struct.getw_TARGET_ITEM_CD(), inLevel, new Integer(2));
                    }
                    else{
                     // �Ώۓ��t�L
                     Date targetDate = stringToDate(struct.getw_TARGET_DATE());
                     getReverseDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                           inLevel, targetDate, new Integer(2));
                    }
                   }
                  }
                 }
              
                 // �t���O�̕\��������ݒ�
                 for(int n = 0; n < _deployList.size(); n++){
                  setTypeValueAboutPs((AA0020010Struct)(_deployList.get(n)));
                 }
              
                 list = _deployList;
              
                }catch(ParseException e){
                 // �ϊ����s
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e) {
                 setReadStatus(ERROR);
                 setSqlExceptionMsg(e);
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                //------------------------------------------------------------------
                
                // �Ώۂ̍\�������R�s�[
                AA0020010Struct workStruct = (struct);
                AA0020010Struct insertStruct = new AA0020010Struct();
              
                // ���W�J
                if(struct.gets_DEVELOP_TYP().intValue() == 1){
                 // �擪�s(�i�ڂ݂̂̍s)�̏ꍇ �e�i�ڔԍ����T�u��ʂ̕i�ڔԍ�
                 if(struct.getNO().intValue() == 1){
                  insertStruct.setPARENT_ITEM_CD(workStruct.getPARENT_ITEM_CD());
                  insertStruct.setPARENT_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
                 }
                 // 2�s�ڈȍ~�� ���̍s�̍\���i�ڔԍ����T�u��ʂ̕i�ڔԍ�
                 else{
                  insertStruct.setPARENT_ITEM_CD(workStruct.getCOMP_ITEM_CD());
                  insertStruct.setPARENT_ITEM_NAME(workStruct.getCOMP_ITEM_NAME());
                 }
                }
                else{
                 // �t�W�J�̂Ƃ��� ��ɐe�i�ڔԍ��� �T�u��ʂ̍\���i�ڔԍ�
                 insertStruct.setCOMP_ITEM_CD(workStruct.getPARENT_ITEM_CD());
                 insertStruct.setCOMP_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
                 insertStruct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
                }
                //�L���J�n���t�ƗL���I�����t�����������܂��B
            	initialDate();
                insertStruct.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
                insertStruct.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
                insertStruct.sets_DEVELOP_TYP(workStruct.gets_DEVELOP_TYP());
                struct.copy(insertStruct);
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
              
                // �Ώۂ̍\�������R�s�[
                //struct.copy(struct);
              
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                //------------------------------------------------------------------
                 
                String Message = "";
                 
                // DB�X�V���t���O������
                bDBUpdate = false;
                 
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTrans();
                 
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 // ����/�X�V�`�F�b�N
                 List countList = entity.mselectM_PS_modify_count.read(conn, struct);
                 if(countList.size() <= 0){
                  Message = "The target data does not exist";
                  setErrorMessageNoKey("ZZ06001", Message);
                 }
                 else{
                  String modify = ((AA0020010Struct)countList.get(0)).getMODIFY_COUNT();
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "Data is rewritten by other processings.";
                   setErrorMessageNoKey("ZZ01105", Message);
                  }
                 }
                 
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                 
                  
                  AA0020010Struct targetStruct = struct;
                  
                  
                  // ���i�\���g�����U�N�V�����ւ̒ǉ�
                  AA0020010Struct addStruct = new AA0020010Struct();
                  addStruct.setsUser_ID(new String(struct.getsUser_ID()));		// ���[�UID�ݒ�
              
                  List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
                  Long no = null;	 // �V�[�P���V����No
                  if(workList.size() <= 0 || 
                    ((AA0020010Struct)workList.get(0)).getSEQ_NO() == null){
                   no = new Long(0);
                  }
                  else{
                   no = ((AA0020010Struct)workList.get(0)).getSEQ_NO();
                  }
                  addStruct.setACCESS_TYP(new Integer(2));	// �������@ 2:�폜
                  addStruct.setCMPLT_FLG(new Integer(0));	 // �����t���O 0:��
              
                  if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                   // ���W�J
                   addStruct.setCOMP_ITEM_CD(targetStruct.getCOMP_ITEM_CD());
                   addStruct.setPARENT_ITEM_CD(targetStruct.getPARENT_ITEM_CD());
                   addStruct.setSEQ_NO(new Long(no.longValue() + 1));
                   addStruct.setPS_EDITION(targetStruct.getPS_EDITION());
                   //List addList = entity.mselectM_PS_ps_edition.read(conn, addStruct);
                   //for(int i = 0; i < addList.size(); i++){
                   // addStruct.setSEQ_NO(new Long(no.longValue() + i + 1));
                   // addStruct.setPARENT_ITEM_CD(((AA0020010Struct)addList.get(i)).getPARENT_ITEM_CD());
                   // addStruct.setPS_EDITION(((AA0020010Struct)addList.get(i)).getPS_EDITION());
                    entity.minsertSYS_PS_T.create(conn, addStruct);
                   //}
                  }
                  else{
                   // �t�W�J
                   addStruct.setPARENT_ITEM_CD(targetStruct.getPARENT_ITEM_CD());
                   addStruct.setCOMP_ITEM_CD(targetStruct.getCOMP_ITEM_CD());
                   addStruct.setSEQ_NO(new Long(no.longValue() + 1));
                   addStruct.setPS_EDITION(targetStruct.getPS_EDITION());
                   //List addList = entity.mselectM_PS_ps_edition.read(conn, addStruct);
                   //for(int i = 0; i < addList.size(); i++){
                   // addStruct.setSEQ_NO(new Long(no.longValue() + i + 1));
                   // addStruct.setCOMP_ITEM_CD(((AA0020010Struct)addList.get(i)).getCOMP_ITEM_CD());
                   // addStruct.setPS_EDITION(((AA0020010Struct)addList.get(i)).getPS_EDITION());
                    entity.minsertSYS_PS_T.create(conn, addStruct);
                   //}
                  }
                  
                  // �폜
                  entity.mdeleteM_PS.delete(conn, targetStruct);
              
                  // �R�~�b�g
                  conn.commit();
                  
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
              
                  // ����
                  struct.copy(_keyStruct);
                  controlselect();
                 }
                  
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                 }
                }
              
                //------------------------------------------------------------------
                
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �ꊇ�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldeleteAll");
			//{{user_implement_dev:<controldeleteAll>
                //------------------------------------------------------------------
                 
                // DB�X�V���t���O������
                bDBUpdate = false;
              
                try{
              
                 // �g�����U�N�V�����J�n
                 conn.beginTrans();
                 
                 // DB�X�V���t���OON
                 bDBUpdate = true;
                 
                 // �폜
                 
                 AA0020010Struct targetStruct = new AA0020010Struct();
                 targetStruct.copy(struct);
              
                 // �V�[�P���V����No�擾
                 List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
                 Long no = null;	 // �V�[�P���V����No
                 if(workList.size() <= 0 || 
                   ((AA0020010Struct)workList.get(0)).getSEQ_NO() == null){
                  no = new Long(0);
                 }
                 else{
                  no = ((AA0020010Struct)workList.get(0)).getSEQ_NO();
                 }
                 AA0020010Struct addStruct = new AA0020010Struct();
                 addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ���[�UID�ݒ�
                 addStruct.setACCESS_TYP(new Integer(2));					// �������@ 2:�폜
                 addStruct.setCMPLT_FLG(new Integer(0));					 // �����t���O 0:��
              
                 List deleteList = null;
                 if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                  // ���W�J
                  targetStruct.setCOMP_ITEM_CD(null);
                 }
                 else{
                  // �t�W�J
                  targetStruct.setPARENT_ITEM_CD(null);
                 }
              
                 deleteList = checkTargetDataIn(targetStruct, _keyStruct.gets_DEVELOP_TYP().intValue());
                 
                 // �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
                 if(deleteList != null)
                 {
                 
                  for(int i = 0; i < deleteList.size(); i++){
                   // �폜
                   entity.mdeleteM_PS.delete(conn, (AA0020010Struct)deleteList.get(i));
                  }
                  
                  // ���i�\���g�����U�N�V�����ǉ�
                  for(int i = 0; i < deleteList.size(); i++){
                   addStruct.setSEQ_NO(new Long(no.longValue() + 1 + i));
                   addStruct.setPARENT_ITEM_CD(((AA0020010Struct)deleteList.get(i)).getPARENT_ITEM_CD());
                   addStruct.setCOMP_ITEM_CD(((AA0020010Struct)deleteList.get(i)).getCOMP_ITEM_CD());
                   addStruct.setPS_EDITION(((AA0020010Struct)deleteList.get(i)).getPS_EDITION());
                   entity.minsertSYS_PS_T.create(conn, addStruct);
                  }
              
                  // �R�~�b�g
                  conn.commit();
                  
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
              
                  // ����
                  struct.copy(_keyStruct);
                  controlselect();
                 }
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                 }
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controldeleteAll>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldeleteAll");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //------------------------------------------------------------------
              
                String Message = "";
                
                // DB�X�V���t���O������
                bDBUpdate = false;
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTrans();
                 
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 boolean result = false;		 // �`�F�b�N���ʊi�[�p
              
                 
                 // ����/�X�V�`�F�b�N
                 List countList = entity.mselectM_PS_modify_count.read(conn, struct);
                 if(countList.size() <= 0){
                  Message = "The target data does not exist";
                  setErrorMessageNoKey("ZZ06001", Message);
                 }
                 else{
                  String modify = ((AA0020010Struct)countList.get(0)).getMODIFY_COUNT();
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "Data is rewritten by other processings.";
                   setErrorMessageNoKey("ZZ01105", Message);
                  }
                 }
                 
                 // �L�����͈͂̏d���`�F�b�N
                 result = checkEffectiveDate_update(struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD(),
                   struct.getPS_EDITION(), struct.getEFF_PHASE_IN_DATE(), struct.getEFF_PHASE_OUT_DATE());
                 if(result == false){
                  Message = "Data is rewritten by other processings.";
                  setErrorMessageNoKey("AA00054", "");
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // ���͒l�`�F�b�N
                  checkStruct(struct);
              
                  // �X�V
                  entity.mupdateSub1M_PS.update(conn, struct);
               
                  // �R�~�b�g
                  conn.commit();
                  
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
               
                  // ����
                  struct.copy(_keyStruct);
                  controlselect();
              
                 }
              
                }catch(ParseException e){
                 // �ϊ����s
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
                 }
                }
              
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //------------------------------------------------------------------
                // �L�[�R�s�[
                struct.copy(_keyStruct);
              
                //�Č���
                controlselect();
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
              
                // ������
                _keyStruct = new AA0020010Struct();
                struct.initialize();
                struct.setw_LEVEL(_initlevel);
              
                // ���i�\�����X�g�N���A
                _deployList.clear();
              
                // ���x���ݒ�
                _keyStruct.setw_LEVEL(_initlevel);
              
                setReadStatus(INITIAL);
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //------------------------------------------------------------------
              
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTrans();
              
                 boolean result = false;		 // �`�F�b�N���ʊi�[�p
              
                 // ���i�\�����|�W�g���쐬
                 ProductStructureRepository repository = new ProductStructureRepository(conn);
              
                 // �ǉ��i�ڏ��`�F�b�N
                 if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                  // ���W�J
                  struct.setITEM_CD(struct.getCOMP_ITEM_CD());
                  result = entity.mcheckM_ITEM.check(conn, struct);
                  if(result == false){    // �Ώەi�ڂ̎擾���s
                   Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                   setErrorMessage("ZZ06001", Message);
                  }
                 }
                 else{
                  // �t�W�J
                  struct.setITEM_CD(struct.getPARENT_ITEM_CD());
                  result = entity.mcheckM_ITEM.check(conn, struct);
                  if(result == false){    // �Ώەi�ڂ̎擾���s
                   Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                   setErrorMessage("ZZ06001", Message);
                  }
                 }
              
// 2008/07/11 SYSCOM ���� ADD START
                 // �H���Ǘ��i�ڋ敪�`�F�b�N
                 AA0020010Struct checkStruct = new AA0020010Struct();
                 checkStruct.setw_TARGET_ITEM_CD(struct.getPARENT_ITEM_CD());
                 List checkList = entity.mselectM_ITEM.read(conn, checkStruct);
                 if(checkList.size() > 0){
                  if(((AA0020010Struct)checkList.get(0)).getCOMP_MANHOUR_TYP().equals("1")){
                   Message = "M_ITEM.ITEM_CD:" + struct.getPARENT_ITEM_CD();
                   setErrorMessage("AA00178", Message);
                  }
                 }
// 2008/07/11 SYSCOM ���� ADD END
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �i�ڎ�z�敪�ʍ\���`�F�b�N
                  if(checkMRP_ODR_TYP(repository, 
                    struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD()) == false){
                   Message = "Item arrangements classification composition is inaccurate";
                   setErrorMessageNoKey("AA00052", Message);
                  }
                  
                  // ���i�\���d���`�F�b�N
                  result = entity.mcheckM_PS_ps_edition.check(conn, struct);
                  if(result == true){
                   listMessage.add("M_PS.PARENT_ITEM_CD:" + struct.getPARENT_ITEM_CD());
                   listMessage.add("M_PS.COMP_ITEM_CD:" + struct.getCOMP_ITEM_CD());
                   listMessage.add("M_PS.PS_EDITION:" + struct.getPS_EDITION());
                   setErrorMessage("ZZ01102", listMessage);
                  }
              
                  // �L�����͈͂̏d���`�F�b�N
                  result = checkEffectiveDate_insert(struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD(),
                    struct.getEFF_PHASE_IN_DATE(), struct.getEFF_PHASE_OUT_DATE());
                  if(result == false){
                   setErrorMessageNoKey("AA00054", "");
                  }
              
                  // ���[�s���O�`�F�b�N true:�L  false:��
                  if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                   if(checkReverseRooping(repository, 
                    struct.getCOMP_ITEM_CD(), struct.getPARENT_ITEM_CD()) == true){
                     setErrorMessageNoKey("AA00055", "");
                   }
                  }
                  else{
                   if(checkRooping(repository, 
                    struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD()) == true){
                     setErrorMessageNoKey("AA00055", "");
                   }
                  }
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // ���͒l�`�F�b�N
                  checkStruct(struct);
              
                  // �o�^
                  entity.minsertSub1M_PS.create(conn, struct);
                
                  // ���i�\���g�����U�N�V�����o�^
                  List workList = entity.mselectSYS_PS_T.read(conn, struct);
                  Long no = null;	 // �V�[�P���V����No
                  if(workList.size() <= 0 || 
                    ((AA0020010Struct)workList.get(0)).getSEQ_NO() == null){
                   no = new Long(0);
                  }
                  else{
                   no = ((AA0020010Struct)workList.get(0)).getSEQ_NO();
                  }
                  AA0020010Struct addStruct = new AA0020010Struct();
                  addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ���[�UID�ݒ�
                  addStruct.setACCESS_TYP(new Integer(1));					// �������@ 1:�폜
                  addStruct.setCMPLT_FLG(new Integer(0));					 // �������@ 0:��
                  addStruct.setSEQ_NO(new Long(no.longValue() + 1));
                  addStruct.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
                  addStruct.setCOMP_ITEM_CD(struct.getCOMP_ITEM_CD());
                  addStruct.setPS_EDITION(struct.getPS_EDITION());
                  entity.minsertSYS_PS_T.create(conn, addStruct);
                
                  // �R�~�b�g
                  conn.commit();
                
                  // ����
                  struct.copy(_keyStruct);
                  controlselect();
                 }
              
                }catch(ParseException e){
                 // �ϊ����s
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
               //------------------------------------------------------------------
              
                try{
              
                 PrivateConfig c = new PrivateConfig(conn);
              
                 // �����W�J���x���擾
                 Integer initlevel = c.getNumber("INIT_DISPLAY_PS_LEVEL");
                 if(initlevel == null){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The initial deployment level is not defined" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
                 else if(initlevel.intValue() < 0){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The value of an initial deployment level is not right" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
                 // �ő�W�J���x���擾
                 Integer level = c.getNumber("MAX_DISPLAY_PS_LEVEL");
                 if(level == null){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max deployment level is not defined" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
                 else if(level.intValue() < 0){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max of an initial deployment level is not right" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
              
                 _level = level.toString();
                 _initlevel = initlevel.toString();
                 _keyStruct.setw_LEVEL(_initlevel);
              
                 // �R���{�{�b�N�X�f�[�^�p��
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);
              
                 _DEVELOP_TYP = comboController.getData("DEVELOP_TYP");
// 2008/07/11 SYSCOM ���� ADD START
                 _MANHOUR_TYP = comboController.getData("MANHOUR_TYP");
// 2008/07/11 SYSCOM ���� ADD END
                 _CONS_TYP = comboController.getData("CONS_TYP");
                 _COST_UP_TYP = comboController.getData("COST_UP_TYP");
                 _MRP_EXP_TYP = comboController.getData("MRP_EXP_TYP");
                 _PS_LT_FLG = comboController.getData("PS_LT_FLG");
                 comboController.setConnection(null);
              
                 controlclear();
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }catch(ComboException e){
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                }
                
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("deleteAll") ) {
				controldeleteAll();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
               //------------------------------------------------------------------
                struct.setList_s_DEVELOP_TYP_val(_DEVELOP_TYP.getValList());
                struct.setList_s_DEVELOP_TYP_name(_DEVELOP_TYP.getExplanList());
                struct.setList_s_CONS_TYP_val(_CONS_TYP.getValList());
                struct.setList_s_CONS_TYP_name(_CONS_TYP.getExplanList());
                struct.setList_s_COST_UP_TYP_val(_COST_UP_TYP.getValList());
                struct.setList_s_COST_UP_TYP_name(_COST_UP_TYP.getExplanList());
                struct.setList_s_MRP_EXP_TYP_val(_MRP_EXP_TYP.getValList());
                struct.setList_s_MRP_EXP_TYP_name(_MRP_EXP_TYP.getExplanList());
                struct.setList_s_MRP_EXP_TYP_val(_MRP_EXP_TYP.getValList());
                struct.setList_s_MRP_EXP_TYP_name(_MRP_EXP_TYP.getExplanList());
              
              //	      } catch(AlarmMessageException ame){
              //		      ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //		      throw ee;
               //------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0020010Entity entity;
	protected AA0020010Struct struct;
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

		entity = new AA0020010Entity();
		struct = new AA0020010Struct();

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
	 * AA0020010�N���X�̕W���R���X�g���N�^
	 */
	public AA0020010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
              
                list = new ArrayList(0);
                
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
				AA0020010Struct key = (AA0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_TARGET_DATE") && key.getw_TARGET_DATE() != null) {
					msgKey.setKeyValue("w_TARGET_DATE", key.getw_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP") && key.gets_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP", key.gets_DEVELOP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_name") && key.gets_DEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP_name", key.gets_DEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_val") && key.gets_DEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP_val", key.gets_DEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_LEVEL") && key.getw_LEVEL() != null) {
					msgKey.setKeyValue("w_LEVEL", key.getw_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO().toString());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_TYP_name") && key.gets_CONS_TYP_name() != null) {
					msgKey.setKeyValue("s_CONS_TYP_name", key.gets_CONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_TYP_val") && key.gets_CONS_TYP_val() != null) {
					msgKey.setKeyValue("s_CONS_TYP_val", key.gets_CONS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_name") && key.gets_COST_UP_TYP_name() != null) {
					msgKey.setKeyValue("s_COST_UP_TYP_name", key.gets_COST_UP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_val") && key.gets_COST_UP_TYP_val() != null) {
					msgKey.setKeyValue("s_COST_UP_TYP_val", key.gets_COST_UP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_name") && key.gets_MRP_EXP_TYP_name() != null) {
					msgKey.setKeyValue("s_MRP_EXP_TYP_name", key.gets_MRP_EXP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_val") && key.gets_MRP_EXP_TYP_val() != null) {
					msgKey.setKeyValue("s_MRP_EXP_TYP_val", key.gets_MRP_EXP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_NAME") && key.gets_CONS_NAME() != null) {
					msgKey.setKeyValue("s_CONS_NAME", key.gets_CONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_NAME") && key.getPS_LT_NAME() != null) {
					msgKey.setKeyValue("PS_LT_NAME", key.getPS_LT_NAME());
				}
				if(msgKeyType.containsKeyColumn("COST_UP_NAME") && key.getCOST_UP_NAME() != null) {
					msgKey.setKeyValue("COST_UP_NAME", key.getCOST_UP_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_EXP_NAME") && key.getMRP_EXP_NAME() != null) {
					msgKey.setKeyValue("MRP_EXP_NAME", key.getMRP_EXP_NAME());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_CHECK") && key.getPS_LT_CHECK() != null) {
					msgKey.setKeyValue("PS_LT_CHECK", key.getPS_LT_CHECK());
				}
				if(msgKeyType.containsKeyColumn("COMP_MANHOUR_NAME") && key.getCOMP_MANHOUR_NAME() != null) {
					msgKey.setKeyValue("COMP_MANHOUR_NAME", key.getCOMP_MANHOUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_TYP") && key.gets_CONS_TYP() != null) {
					msgKey.setKeyValue("s_CONS_TYP", key.gets_CONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_FLG") && key.getPS_LT_FLG() != null) {
					msgKey.setKeyValue("PS_LT_FLG", key.getPS_LT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("PS_FIXED_LT") && key.getPS_FIXED_LT() != null) {
					msgKey.setKeyValue("PS_FIXED_LT", key.getPS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LT") && key.getPS_PROP_LT() != null) {
					msgKey.setKeyValue("PS_PROP_LT", key.getPS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE") && key.getPS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PS_PROP_LOT_SIZE", key.getPS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("PS_REF_NO") && key.getPS_REF_NO() != null) {
					msgKey.setKeyValue("PS_REF_NO", key.getPS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("s_COST_UP_TYP") && key.gets_COST_UP_TYP() != null) {
					msgKey.setKeyValue("s_COST_UP_TYP", key.gets_COST_UP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP") && key.gets_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("s_MRP_EXP_TYP", key.gets_MRP_EXP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME") && key.getCOMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("COMP_ITEM_NAME", key.getCOMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("COMP_MANHOUR_TYP") && key.getCOMP_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("COMP_MANHOUR_TYP", key.getCOMP_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ACCESS_TYP") && key.getACCESS_TYP() != null) {
					msgKey.setKeyValue("ACCESS_TYP", key.getACCESS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("CMPLT_FLG") && key.getCMPLT_FLG() != null) {
					msgKey.setKeyValue("CMPLT_FLG", key.getCMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD") && key.getw_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("w_TARGET_ITEM_CD", key.getw_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("P_VALUE") && key.getP_VALUE() != null) {
					msgKey.setKeyValue("P_VALUE", key.getP_VALUE());
				}
				if(msgKeyType.containsKeyColumn("P_NAME") && key.getP_NAME() != null) {
					msgKey.setKeyValue("P_NAME", key.getP_NAME());
				}
				if(msgKeyType.containsKeyColumn("P_PLANT_CD") && key.getP_PLANT_CD() != null) {
					msgKey.setKeyValue("P_PLANT_CD", key.getP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("P_USER_CD") && key.getP_USER_CD() != null) {
					msgKey.setKeyValue("P_USER_CD", key.getP_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("P_BUSINESS_DATE") && key.getP_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("P_BUSINESS_DATE", key.getP_BUSINESS_DATE());
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
					AA0020010Struct key = new AA0020010Struct();
					if(msgKeyType.containsKeyColumn("w_TARGET_DATE")) {
						key.setw_TARGET_DATE(msgKey.getKeyValue("w_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP")) {
						key.sets_DEVELOP_TYP(new Integer(msgKey.getKeyValue("s_DEVELOP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_name")) {
						key.sets_DEVELOP_TYP_name(msgKey.getKeyValue("s_DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_val")) {
						key.sets_DEVELOP_TYP_val(msgKey.getKeyValue("s_DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_LEVEL")) {
						key.setw_LEVEL(msgKey.getKeyValue("w_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(new Integer(msgKey.getKeyValue("NO")));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_TYP_name")) {
						key.sets_CONS_TYP_name(msgKey.getKeyValue("s_CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_TYP_val")) {
						key.sets_CONS_TYP_val(msgKey.getKeyValue("s_CONS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_name")) {
						key.sets_COST_UP_TYP_name(msgKey.getKeyValue("s_COST_UP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_val")) {
						key.sets_COST_UP_TYP_val(msgKey.getKeyValue("s_COST_UP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_name")) {
						key.sets_MRP_EXP_TYP_name(msgKey.getKeyValue("s_MRP_EXP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_val")) {
						key.sets_MRP_EXP_TYP_val(msgKey.getKeyValue("s_MRP_EXP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_NAME")) {
						key.sets_CONS_NAME(msgKey.getKeyValue("s_CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_NAME")) {
						key.setPS_LT_NAME(msgKey.getKeyValue("PS_LT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COST_UP_NAME")) {
						key.setCOST_UP_NAME(msgKey.getKeyValue("COST_UP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_EXP_NAME")) {
						key.setMRP_EXP_NAME(msgKey.getKeyValue("MRP_EXP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_CHECK")) {
						key.setPS_LT_CHECK(msgKey.getKeyValue("PS_LT_CHECK"));
					}
					if(msgKeyType.containsKeyColumn("COMP_MANHOUR_NAME")) {
						key.setCOMP_MANHOUR_NAME(msgKey.getKeyValue("COMP_MANHOUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_TYP")) {
						key.sets_CONS_TYP(new Integer(msgKey.getKeyValue("s_CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_FLG")) {
						key.setPS_LT_FLG(new Integer(msgKey.getKeyValue("PS_LT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("PS_FIXED_LT")) {
						key.setPS_FIXED_LT(msgKey.getKeyValue("PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LT")) {
						key.setPS_PROP_LT(msgKey.getKeyValue("PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE")) {
						key.setPS_PROP_LOT_SIZE(msgKey.getKeyValue("PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("PS_REF_NO")) {
						key.setPS_REF_NO(msgKey.getKeyValue("PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_COST_UP_TYP")) {
						key.sets_COST_UP_TYP(new Integer(msgKey.getKeyValue("s_COST_UP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP")) {
						key.sets_MRP_EXP_TYP(new Integer(msgKey.getKeyValue("s_MRP_EXP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME")) {
						key.setCOMP_ITEM_NAME(msgKey.getKeyValue("COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("COMP_MANHOUR_TYP")) {
						key.setCOMP_MANHOUR_TYP(msgKey.getKeyValue("COMP_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(new Long(msgKey.getKeyValue("SEQ_NO")));
					}
					if(msgKeyType.containsKeyColumn("ACCESS_TYP")) {
						key.setACCESS_TYP(new Integer(msgKey.getKeyValue("ACCESS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("CMPLT_FLG")) {
						key.setCMPLT_FLG(new Integer(msgKey.getKeyValue("CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD")) {
						key.setw_TARGET_ITEM_CD(msgKey.getKeyValue("w_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("P_VALUE")) {
						key.setP_VALUE(msgKey.getKeyValue("P_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("P_NAME")) {
						key.setP_NAME(msgKey.getKeyValue("P_NAME"));
					}
					if(msgKeyType.containsKeyColumn("P_PLANT_CD")) {
						key.setP_PLANT_CD(msgKey.getKeyValue("P_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("P_USER_CD")) {
						key.setP_USER_CD(msgKey.getKeyValue("P_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("P_BUSINESS_DATE")) {
						key.setP_BUSINESS_DATE(msgKey.getKeyValue("P_BUSINESS_DATE"));
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
