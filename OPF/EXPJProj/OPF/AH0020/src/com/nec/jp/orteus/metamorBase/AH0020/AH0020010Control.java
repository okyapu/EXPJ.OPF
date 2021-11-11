/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0020/src/com/nec/jp/orteus/metamorBase/AH0020/AH0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0020;

import com.nec.jp.orteus.metamorBase.AH0020.*;
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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0020010Control
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
        public AH0020010Struct getListvalue(int x) { return (AH0020010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AH0020010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AH0020010Struct createStruct() { return new AH0020010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AH0020010Struct)structname); }	// Struct���Z�b�g���܂��B
       //	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        //------------------------------------------------------------------------
       
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
        //------------------------------------------------------------------------
       
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
       
        //------------------------------------------------------------------------
       
        /**
         * �敪���擾�i���ʁj
         *
         * @param	comboStruct	�敪��񃊃X�g
         * @param	strTyp		�敪�R�[�h
         * @return	�敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getTypName(ComboStruct comboStruct, String strTyp)
        {
         String strTypName = strTyp;
         if((comboStruct != null) && (strTyp != null))
         {
          for(int i = 0; i < comboStruct.getValList().size(); i++)
          {
           if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
           {
            strTypName = (String)(comboStruct.getExplanList().get(i));
            break;
           }
          }
         }
         return strTypName;
        }
       
        /** �I����ԋ敪 */
        private ComboStruct _INV_STS_TYP = new ComboStruct();
       
        /**
         * �I����ԋ敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getINV_STS_TYP_name(String typ)
        {
         return (getTypName(_INV_STS_TYP, typ));
        }
       
        /** ���v�ʌv�Z�Ώۃt���O */
        private ComboStruct _MRP_FLG = new ComboStruct();
       
        /**
         * ���v�ʌv�Z�Ώۃt���O���e�擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getMRP_FLG_name(String typ)
        {
         return (getTypName(_MRP_FLG, typ));
        }
       
        /** �q�ɋ敪 */
        private ComboStruct _WH_TYP = new ComboStruct();
       
        /**
         * �q�ɋ敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getWH_TYP_name(String typ)
        {
         return (getTypName(_WH_TYP, typ));
        }
       
        /** �i�ڎ�z�敪 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /**
         * �i�ڎ�z�敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getMRP_ODR_TYP_name(String typ)
        {
         return (getTypName(_MRP_ODR_TYP, typ));
        }
       
        /** ���O��敪 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /**
         * ���O��敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getOUTSIDE_TYP_name(String typ)
        {
         return (getTypName(_OUTSIDE_TYP, typ));
        }
       
        /** �I���敪 */
        private ComboStruct _ABC_TYP = new ComboStruct();
       
        /**
         * �I���敪���擾
         *
         * @param	String �敪�R�[�h
         * @return	String �敪����(�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�)
         */
        private String getABC_TYP_name(String typ)
        {
         return (getTypName(_ABC_TYP, typ));
        }
       
        /** ��ʗp�u�I���敪�v�R���{�{�b�N�X�f�[�^�i�[�p */
        private ComboStruct _comboAbcTyp = new ComboStruct();
       
        /**
         * ��ʗp�u�I���敪�v�R���{�{�b�N�X���X�g�f�[�^�ݒ�
         *
         * @param	comboAbcTyp �I���敪�R���{���X�g�f�[�^
         * @return	�Ȃ�
         */
        private void makeAbcTypComboData(ComboStruct comboAbcTyp)
        {
         _comboAbcTyp = new ComboStruct();
         _comboAbcTyp.addData("", "");// �P���ڂɋ󔒃f�[�^�ݒ�
         for(int i = 0; i < comboAbcTyp.size(); i++)
         {
          String[] str = comboAbcTyp.getData(i);
          if("9".equals(str[0]) == true)
          {
           // �I���敪��9�̃f�[�^�͒ǉ����Ȃ�
           continue;
          }
          _comboAbcTyp.addData(str[0], str[1]);
         }
        }
       
        //------------------------------------------------------------------
       
        /**
         * �\���ő�s����������
         *
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean checkMaxDispLine(int key, long rowCount) throws FoundationException, SQLException
        {
         ScreenParam sp = new ScreenParam(this.getClass());
         int maxLine = sp.getMaxLine(conn,key);
         if(maxLine != 0 && rowCount == maxLine + 1)
         {
          ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return false;
         }
         return true;
        }
       
        //------------------------------------------------------------------
       
        /** �T�u1��ʃp�����[�^�i�ő�\���s���j�擾�A�N�Z�X�L�[ */
        private final int DISPLAY_CD_SUB1 = 20;
       
        /** �T�u2��ʃp�����[�^�i�ő�\���s���j�擾�A�N�Z�X�L�[ */
        private final int DISPLAY_CD_SUB2 = 30;
       
        /** �e���struct���ꎞ�ޔ�p */
        private AH0020010Struct _save_struct = new AH0020010Struct();
       
        /**
         * �e��ʂ�struct����ޔ�
         */
        private void saveParentStruct()
        {
         _save_struct.copy(struct);
        }
       
        /**
         * �e��ʂ�struct���𕜋A
         */
        private void loadParentStruct()
        {
         struct.copy(_save_struct);
        }
       
        /** �q���struct���ꎞ�ޔ�p */
        private AH0020010Struct _structSaveSub = new AH0020010Struct();
       
        /**
         * �q��ʂ�struct����ޔ�
         */
        private void saveSubStruct()
        {
         _structSaveSub.copy(struct);
        }
       
        /**
         * �q��ʂ�struct���𕜋A
         */
        private void loadSubStruct()
        {
         struct.copy(_structSaveSub);
        }
       
        /**
         * �Ɩ��^�p���擾
         *
         * @param	String �H��R�[�h
         * @return	String ���� ���t������(YYYY/MM/DD�`��) ���s null
         */
        private String getBUSINESS_OPR_DATE(String plant_cd) throws FoundationException, SQLException
        {
         String Message = "";
         
         AH0020010Struct search_struct = new AH0020010Struct();
         String strBUSINESS_OPR_DATE = null;
       
         // �Ǎ������ݒ�
         search_struct.setPLANT_CD(plant_cd);
       
         // �Ɩ��^�p���Ǎ����s
         List temp_list = entity.mSYS_DATE_CTRL.read(conn, search_struct);
         if(temp_list.size() <= 0)
         {
          // �Ɩ��^�p�����R�[�h�Ȃ�
          Message = "SYS_DATE_CTRL.PLANT_CD:" + search_struct.getPLANT_CD();
          setErrorMessage("AH00024", Message);
          return null;
         }
       
         // �擾�Ɩ��^�p���`�F�b�N
         AH0020010Struct read_struct = (AH0020010Struct)temp_list.get(0);
         strBUSINESS_OPR_DATE = read_struct.getBUSINESS_OPR_DATE();
         if((strBUSINESS_OPR_DATE == null) || ("".equals(strBUSINESS_OPR_DATE) == true) )
         {
          // �擾�Ɩ��^�p��null
          Message = "SYS_DATE_CTRL.PLANT_CD:" + search_struct.getPLANT_CD();
          setErrorMessage("AH00024", Message);
          return null;
         }
         return strBUSINESS_OPR_DATE;
        }
       
        /** 
         * �Ώۃf�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
         * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� �ŐV�̓Ǎ���� �G���[ null
         */
        private AH0020010Struct checkTargetData(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �Ǎ����i�[�p�ϐ��錾
         AH0020010Struct new_struct = new AH0020010Struct();
       
         // �����Ώۃf�[�^�̑��݃`�F�b�N
         List temp_list = entity.mT_INV_CTRL4Update.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          // �X�V�Ώۃf�[�^�����݂��Ȃ������ꍇ
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorMessage("ZZ01101", listMessage);
          return null;
         }
         else
         {
          // ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
          new_struct = (AH0020010Struct)temp_list.get(0);
          if(new_struct.getMODIFY_COUNT().equals(target_struct.getMODIFY_COUNT()) != true)
          {
           // ���Ƀ��R�[�h���X�V
           listMessage.clear();
           listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
           listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
           setErrorMessage("ZZ01105", listMessage);
           return null;
          }
         }
         return new_struct;
        }
       
        /** 
         * �Ώۃf�[�^�ēǍ�����
         *
         * @param target_struct �Ώۃf�[�^���
         * @return ���� �ŐV�Ǎ���� �G���[ null
         */
        private AH0020010Struct readTargetData(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �Ǎ����i�[�p�ϐ��錾
         AH0020010Struct new_struct = new AH0020010Struct();
       
         // �����Ώۃf�[�^�̑��݃`�F�b�N
         List temp_list = entity.mT_INV_CTRL.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          // �����Ώۃf�[�^�����݂��Ȃ������ꍇ
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          return null;
         }
         else
         {
          // �Ǎ����擾
          new_struct = (AH0020010Struct)temp_list.get(0);
         }
         return new_struct;
        }
       
        /** 
         * �I����ԋ敪��0�i���{�O�j�łȂ����ǂ����̔��菈��
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean checkINV_STS_TYP_notequalZERO(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // ���ʃt���O������
         boolean bResult = true;
       
         // �I����ԋ敪��0�i���{�O�j���ǂ����̃`�F�b�N
         if("0".equals(target_struct.geth_INV_STS_TYP()) != true)
         {
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:" + target_struct.geth_INV_STS_TYP());
          setErrorMessage("AH00008", listMessage);
          bResult = false;
         }
         return bResult;
        }
       
        /** 
         * �T�u��ʗp�I����ԋ敪�`�F�b�N����
         *
         * @param target_struct �Ώۃf�[�^���
         * @return �ُ�Ȃ� true �G���[ false
         */
        private boolean checkINV_STS_TYP(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         // ���ʃt���O������
         boolean bResult = true;
       
         // �e�f�[�^�ēǍ�
         AH0020010Struct new_struct = readTargetData(struct);
         if(new_struct == null)
         {
          bResult = false;
         }
         else
         {
          // �I����ԋ敪��0�i���{�O�j�łȂ����ǂ����̃`�F�b�N
          if(checkINV_STS_TYP_notequalZERO(new_struct) != true)
          {
           bResult = false;
          }
         }
         return bResult;
        }
       
       
        //---------- CSV�捞���ʃ��b�Z�[�W����֘A -------------------------
       
        /** CSV�捞���ʃ��b�Z�[�W���i�[�p���X�g */
        ArrayList _listResultMessageCsv = new ArrayList(0);
       
        /**
         * CSV�捞���ʏ��ǉ�
         *
         * @return	�Ȃ�
         */
        public void csvResultListAdd(String strMessage, int intRow, int intCol)
        {
            // �����ꍀ�ڎ擾�Ή�
         String locale = CoreTools.getLocale(sysUSER_CD);
           	// ���b�Z�[�W���i�[�p
         AH0020010Struct structTemp = new AH0020010Struct();
       
         // �s�A����u{0}���ڂ�{1}���ځv
         ExpjMessage emsg = new ExpjMessage("AH00045", ""+(intRow+1), ""+(intCol+1));
         structTemp.setERR_ADR(emsg.getMessage(locale));
         sysLog.warning(emsg, getsysUSER_CD());
       
         // �ڍד��e
         structTemp.setERR_MSG(strMessage);
       
         // ���X�g�֏��ǉ�
         _listResultMessageCsv.add(structTemp);
       
         return;
        }
       
        /**
         * CSV�捞���ʏ�񃊃X�g�擾
         *
         * @return	CSV�捞���ʏ�񃊃X�g
         */
        public List getCsvResultList()
        {
         return _listResultMessageCsv;
        }
       
        /**
         * CSV�捞���ʏ�񃊃X�g�T�C�Y�擾
         *
         * @return	CSV�捞���ʏ�񃊃X�g�T�C�Y
         */
        public int getCsvResultListSize()
        {
         return _listResultMessageCsv.size();
        }
       
        /**
         *  CSV�捞���ʏ�񃊃X�g�N���A
         *
         * @return	�Ȃ�
         */
        public void csvResultListClear()
        {
         _listResultMessageCsv.clear();
        }
       
        /** �ۊǋ�b�r�u�捞�f�[�^���ʃt���O�萔 */
        public final static String FLG_INV_TARGET_WH = "0";
        /** �i�ڂb�r�u�捞�f�[�^���ʃt���O�萔 */
        public final static String FLG_INV_TARGET_ITEM = "1";
       
        /** �b�r�u�捞�f�[�^���ʃt���O */
        private String _strInvTargetFlg;
        /**
         *  �b�r�u�捞�f�[�^���ʃt���O�ݒ�
         *
         * @param	strInvTargetFlg
         * @return	�Ȃ�
         */
        public void setInvTargetFlg(String strInvTargetFlg)
        {
         _strInvTargetFlg = strInvTargetFlg;
        }
        /**
         *  �b�r�u�捞�f�[�^���ʃt���O�擾
         *
         * @return	�b�r�u�捞�f�[�^���ʃt���O
         */
        public String getInvTargetFlg()
        {
         return _strInvTargetFlg;
        }
       
       
        /** �b�r�u���ڔԍ���`�i�ۊǋ�w��p�j */
        private final int CSV_COLNO_WH_CD4WH = 0;
        /** �b�r�u�捞�f�[�^�K�v���ڐ��i�ۊǋ�w��p */
        private final int CSV_NECESSARY_COLUMN4WH = (CSV_COLNO_WH_CD4WH+1);
       
        /** �b�r�u���ڔԍ���`�i�i�ڎw��p�j */
        private final int CSV_COLNO_ITEM_CD4ITEM = 0;
        /** �b�r�u�捞�f�[�^�K�v���ڐ��i�i�ڎw��p�j */
        private final int CSV_NECESSARY_COLUMN4ITEM = (CSV_COLNO_ITEM_CD4ITEM+1);
       
       
        /**
         * �b�r�u�f�[�^�擾�ƃ��X�g�f�[�^��
         *
         * @return	CSV�f�[�^���X�g
         */
        private List readCsvData() throws FoundationException, ExpjException
        {
       
         // ���O�o�͏��i�[�p
         String logMessage = "";
         
         String [] strsCsvData = null;
         List listCsv = null;
         try {
       
          // �b�r�u�f�[�^�̃A�b�v���[�h
          strsCsvData = (String [])csvReader.lineRead();
          if(null != strsCsvData)
          {
           logMessage = "strsCsvData.length:" + strsCsvData.length;
           setSyslogConfig(logMessage);
       
           // CSV�f�[�^�ő區�ڐ�����
           int intMaxColNum;
           if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
           {
            intMaxColNum = CSV_NECESSARY_COLUMN4WH;
           }
           else
           {
            intMaxColNum = CSV_NECESSARY_COLUMN4ITEM;
           }
       
           // �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
           listCsv = new ArrayList(0);
           for(int i = 0; i < strsCsvData.length; i++)
           {
            // ���s�݂̂̃��R�[�h��EOF�Ɣ��f���܂�
            if(strsCsvData[i].length() == 0)
            {
             break;
            }
            // �^�C�g���s�ǂݔ�΂�
            if(i == 0)
            {
             continue;
            }
       
            // ���R�[�h�����ږ��ɂ΂炷
            AH0020010Struct structCsv = new AH0020010Struct();
            Vector v = csvReader.importCSVLine(strsCsvData[i]);
            if(null != v)
            {
             // ���ڐ��`�F�b�N
             int intColNum = v.size();
             if(intMaxColNum <= intColNum)
             {
              // �����Ɋ֘A����p�����[�^��ݒ�
              structCsv.setPLANT_CD(getsysPLANT_CD());
              structCsv.setINV_DATE(_save_struct.getINV_DATE());
       
              // �b�r�u�̍��ڂ����X�g�f�[�^��
              if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
              {
               // �ۊǋ�w��
               structCsv.setWH_CD((String) v.get(0));
              }
              else
              {
               // �i�ڎw��
               structCsv.setITEM_CD((String) v.get(0));
              }
             }
             else
             {
              // ���ڐ����K�v���ڐ������̂Ƃ��͍��ڐ��s���G���[
              structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
             }
             // ���X�g�ǉ�
             listCsv.add(structCsv);
            }
            else
            {
             //�x�N�^�[�������s�G���[
             logMessage = "csvReader.Vector was Failed... line:" + strsCsvData[i];
             setSyslogConfig(logMessage);
             listCsv = null;
             break;
            }
           }
           // �b�r�u�f�[�^�����i�^�C�g���s�͏Ȃ��j
           if((listCsv == null) || (listCsv.size() <= 0))
           {
            // �捞���s�܂��̓f�[�^�Ȃ�
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            msgStruct.addError( emsg );
            sysLog.warning(emsg, getsysUSER_CD());
            listCsv = null;
           }
           else
           {
            // �b�r�u�Ǎ��݌������O�\��
            ExpjMessage emsg = new ExpjMessage( "AH00043", ""+listCsv.size());
            sysLog.config(emsg, getsysUSER_CD());
           }
          }
       
         } catch( ExpjException ee ) {
          throw ee;
          
         } catch( FoundationException fe ) {
          // CsvReader�ŃG���[���������܂����B
          ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          listCsv = null;
          
          // �捞���s
          emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(fe, emsg);
          throw ee;
         
         } catch(Exception e){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
         }
         return listCsv;
        }
       
        /**
         * �b�r�u�f�[�^���e�`�F�b�N����
         *
         * @param	listCsv	CSV�f�[�^���X�g
         * @return	����:true / �G���[:false
         */
        private boolean checkCsvData(List listCsv) throws FoundationException, ExpjException
        {
       
         // ���O�o�͏��i�[�p
         String logMessage = "";
 		 // �����ꍀ�ڎ擾�Ή�
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         boolean bSuccess = true;	// ���������t���O������
         int intSuccessCount = 0;	// �`�F�b�N���탌�R�[�h����
         int intCsvDataCount = 0;	// �Ώۃf�[�^����
         List listRead;				// ��Ɨp
         try {
       
          AH0020010Struct structCsv;
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           ExpjMessage emsg = new ExpjMessage();
           
           // CSV���擾
           structCsv = (AH0020010Struct)listCsv.get(i);
       
           // ���ڐ��s���G���[�s�̓`�F�b�N���Ȃ�
           if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true)
           {
            // CSV�f�[�^�ő區�ڐ�����
            int intMaxColNum;
            if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
            {
             intMaxColNum = CSV_NECESSARY_COLUMN4WH;
            }
            else
            {
             intMaxColNum = CSV_NECESSARY_COLUMN4ITEM;
            }
            // ���ڐ��s���G���[
            emsg = new ExpjMessage( "AH00044", ""+intMaxColNum );
            csvResultListAdd(emsg.getMessage(locale) , i , Integer.parseInt(structCsv.getw_COLUMN_FLG()));
            sysLog.warning(emsg, getsysUSER_CD());
            continue;
           }
       
           ////////////////////////////////////////////////////////////////////////////////////
           // �ʃ`�F�b�N�����J�n
           ////////////////////////////////////////////////////////////////////////////////////
           boolean bError = false;
           if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
           {
            // ---------- �ۊǋ�w��`�F�b�N�J�n ----------
            // �ۊǋ�`�F�b�N
            if(structCsv.getWH_CD() == null || ("").equals(structCsv.getWH_CD()) == true)
            {
             // �ۊǋ悪null
             emsg = new ExpjMessage( "AH00014" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD4WH);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.WH_CD:" + structCsv.getWH_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
             // �ۊǋ�Ǎ���
             listRead = entity.mM_WH.read(conn, structCsv);
             if(listRead.size() <= 0)
             {
              // �ۊǋ悪���݂��Ȃ�
              emsg = new ExpjMessage( "AH00019" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD4WH);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_WH.WH_CD:" + structCsv.getWH_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             else
             {
              AH0020010Struct readStructWh = new AH0020010Struct();
              readStructWh = (AH0020010Struct)listRead.get(0);
              if(getsysPLANT_CD().equals(readStructWh.getPLANT_CD()) != true)
              {
               // �ۊǋ�̍H��R�[�h�����O�C�����[�U�̍H��łȂ�
               emsg = new ExpjMessage( "AH00020" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD4WH);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "M_WH.PLANT_CD:" + readStructWh.getPLANT_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             }
            }
            // ---------- �ۊǋ�w��`�F�b�N�I�� ----------
           }
           else
           {
            // ---------- �i�ڎw��`�F�b�N�J�n ----------
            // �i�ڔԍ��`�F�b�N
            if(structCsv.getITEM_CD() == null || ("").equals(structCsv.getITEM_CD()) == true)
            {
             // �i�ڔԍ���null
             emsg = new ExpjMessage( "AH00001" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
             // �i�ړǍ���
             listRead = entity.mM_ITEM.read(conn, structCsv);
             if(listRead.size() <= 0)
             {
              // �i�ڂ����݂��Ȃ�
              emsg = new ExpjMessage( "AH00002" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             else
             {
              AH0020010Struct readStructItem = new AH0020010Struct();
              readStructItem = (AH0020010Struct)listRead.get(0);
              structCsv.setUNIT_QTY_TYP(readStructItem.getUNIT_QTY_TYP());
              if("8".equals(readStructItem.getMRP_ODR_TYP()) == true)
              {
               // �w�肳�ꂽ�i�ڂ��[���i��
               emsg = new ExpjMessage( "AH00028" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
              // �i�ڂ̒I���敪��9�i�I�����Ȃ��j���ǂ����̃`�F�b�N
              if("9".equals(readStructItem.getABC_TYP()) == true)
              {
               // �w�肳�ꂽ�i�ڂ̒I���敪��9�I�����Ȃ��j
               emsg = new ExpjMessage( "AH00016" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             }
            }
            // ---------- �i�ڎw��`�F�b�N�I�� ----------
       
           }// if()
       
           // �`�F�b�N�G���[�ƂȂ��Ă��Ȃ��ꍇ�A���탌�R�[�h�Ƃ��ăJ�E���g
           if(bError != true)
           {
            intSuccessCount++;
           }
           ////////////////////////////////////////////////////////////////////////////////////
           // �ʃ`�F�b�N�����I��
           ////////////////////////////////////////////////////////////////////////////////////
       
          } // for()
       
          // �`�F�b�N���ʏ���
          if(getCsvResultListSize() > 0)
          {
           bSuccess = false;
          }
       
          if(bSuccess != true)
          {
           // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
           ExpjMessage emsg = new ExpjMessage( "AH00041",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
         }catch(SQLException e){
          setSqlExceptionMsg(e);
         }
         return bSuccess;
        }
       
        /**
         * �b�r�u�f�[�^�c�a���f����
         *
         * @param	listCsv	CSV�f�[�^���X�g
         * @return	����:true / �G���[:false
         */
        private boolean csvData2Db(List listCsv) throws FoundationException, ExpjException
        {
       
         // ���O�o�͏��i�[�p
         String logMessage = "";
         
         boolean bSuccess = false;	// ���������t���O������
         boolean bDBUpdate = false;	// DB�X�V���t���O������
         int intCsvDataCount = 0;	// �Ώۃf�[�^����
       
         // �������O��struct����ޔ�
         AH0020010Struct structCopy = new AH0020010Struct();
         structCopy.copy(struct);
         try
         {
          // �g�����U�N�V�����J�n
          conn.beginTransWeb();
       
          // DB�X�V���t���OON
          bDBUpdate = true;
       
          // �I�������ۊǋ�w��A�܂��́A�I�������i�ڎw��e�[�u�����̊Y�����R�[�h���폜
          if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
          {
           // �ۊǋ�w��
           struct.setWH_CD("%");
           entity.mT_INV_TARGET_WH.delete(conn, struct);
          }
          else
          {
           // �i�ڎw��
           struct.setITEM_CD("%");
           entity.mT_INV_TARGET_ITEM.delete(conn, struct);
          }
       
          // �f�[�^�����������J��Ԃ�
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV���擾
           struct.copy((AH0020010Struct)listCsv.get(i));
       
           List t_inv_target_list = null;
           // �I�������ۊǋ�w��A�܂��́A�I�������i�ڎw��e�[�u���փ��R�[�h�ǉ�
           if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
           {
            logMessage = "T_INV_TARGET_WH.PLANT_CD:" +  struct.getPLANT_CD()
               + ", T_INV_TARGET_WH.WH_CD:" +  struct.getWH_CD();
            
            // �ۊǋ�w��f�[�^�̑��݃`�F�b�N
            t_inv_target_list = entity.mT_INV_TARGET_WH_CHK.read(conn, struct);
            
            if(t_inv_target_list == null || t_inv_target_list.size() <= 0){
            	//�ۊǋ�w��f�[�^�̓o�^
                entity.mT_INV_TARGET_WH.create(conn, struct);
            }
           }
           else
           {
            logMessage = "T_INV_TARGET_ITEM.PLANT_CD:" +  struct.getPLANT_CD()
               + ", T_INV_TARGET_ITEM.ITEM_CD:" +  struct.getITEM_CD();
            
            // �i�ڎw��f�[�^�̑��݃`�F�b�N
            t_inv_target_list = entity.mT_INV_TARGET_ITEM_CHK.read(conn, struct);
            
            if(t_inv_target_list == null || t_inv_target_list.size() <= 0){ 
            	//�i�ڎw��f�[�^�̓o�^
            	 entity.mT_INV_TARGET_ITEM.create(conn, struct);
            }
           }
          } // for()
       
          // �R�~�b�g
          conn.commit();
       
          // DB�X�V���t���OOFF
          bDBUpdate = false;
       
          // ���������t���O�ݒ�
          bSuccess = true;
       
         } catch(SQLException e) {
          ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
          sysLog.severe(emsg, getsysUSER_CD());
          setSqlExceptionMsg(e);
       
         } finally {
          // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
          if(bDBUpdate == true)
          {
           // ���[���o�b�N
           conn.rollback();
           logMessage = "Control�FcsvData2Db - rollback!! ";
           setSyslogConfig(logMessage);
       
           // �������O��struct��񕜋A
           struct.copy(structCopy);
       
           // �X�V���s�̃��b�Z�[�W�\��
           ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0");
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
          if(bSuccess == true)
          {
           // ����I���̃��b�Z�[�W�\��
           ExpjMessage emsg = new ExpjMessage( "AH60005", ""+intCsvDataCount, "0");
           msgStruct.addInfo( emsg );
           sysLog.config(emsg, getsysUSER_CD());
          }
       
          // �������O��struct��񕜋A
          setInvTarget2RadioValue(getInvTargetFlg());
         }
         return bSuccess;
        }
       
        /**
         * �ۊǋ�w��A�i�ڎw�胉�W�I�{�^���I��l�ݒ�
         * @param	flag	CSV�捞��ގ��ʃt���O�i�ۊǋ�w��FFLG_INV_TARGET_WH �i�ڎw�莯�ʃt���O�FFLG_INV_TARGET_ITEM�j
         */
        private void setInvTarget2RadioValue(String flag)
        {
         if(FLG_INV_TARGET_WH.equals(flag) == true)
         {
          // �ۊǋ�w��ON�A�i�ڎw��OFF
          struct.setr1_inv_target("true");
          struct.setr2_inv_target(null);
         }
         else
         {
          // �ۊǋ�w��OFF�A�i�ڎw��ON
          struct.setr1_inv_target(null);
          struct.setr2_inv_target("true");
         }
        }
       
         
        /**
         * SQLException�G���[���b�Z�[�W�ݒ�
         * @param SQLException
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
         sysLog.severe(emsg, getsysUSER_CD());
         ExpjException ee = new ExpjException(e, emsg);
         throw ee;
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
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �u��������P
         */
        private void setInfoMessage(String messageno, String value1)
        {
         ExpjMessage emsg = new ExpjMessage( messageno , value1 );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
         
        /**
         * ���O���b�Z�[�W�ݒ�
         * @param �o�̓��b�Z�[�W
         */
        private void setSyslogConfig(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.config(emsg, getsysUSER_CD());
        }
         
         
         
        //------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                 
                // ���O�o�͏��i�[�p
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // �Ǎ����������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
              
                // ������Ԃ�������
                setReadStatus(INITIAL);
                try {
              
                 // struct������
                 struct.initializeParent();
                 // �����Ɋ֘A����p�����[�^��ݒ�
                 struct.setPLANT_CD(getsysPLANT_CD());
                 struct.setINV_DATE(copy_struct.getINV_DATE());
              
                 // �Ǎ����s
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mT_INV_CTRL.read(conn, struct);
              
                 // ���R�[�h�����`�F�b�N
                 if(temp_list.size() <= 0)
                 {
                  // ���R�[�h�������O(�[��)���̏ꍇ
                  listMessage.add("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                  setErrorMessage("ZZ06001", listMessage);
                 }
                 else
                 {
                  // �Ǎ��f�[�^�擾
                  AH0020010Struct temp_struct = (AH0020010Struct)temp_list.get(0);
              
                  // �\���pstruct�֓Ǎ��f�[�^��ݒ�
                  struct.copy(temp_struct);
              
                  // �I����ԋ敪���擾�ݒ�
                  struct.setw_INV_STS_TYP(getINV_STS_TYP_name(struct.geth_INV_STS_TYP()));
              
                  // ��ʏ�̐ݒ�l���Đݒ�
                  struct.setINV_DATE(copy_struct.getINV_DATE());
              
                  // �Ǎ����������t���O�ݒ�
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                  setReadStatus(NORMAL);
              
                  // �Ǎ��������̃L�[����ޔ�
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                  struct.seth_saveINV_STS_TYP(struct.geth_INV_STS_TYP());
                  struct.seth_saveTEMP_INV_FLG(struct.geth_TEMP_INV_FLG());
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �ۊǋ�w��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect_wh() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_wh");
			//{{user_implement_dev:<controlselect_wh>
                //---------------------------------------------------------------------
              
                // �e��ʂ�struct��ޔ�
                saveParentStruct();
              
                // �T�u��ʕ\����񏉊���
                controlclear_sub1();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_wh>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_wh");

		return;
	}

	/**
	 * �i�ڎw��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect_item() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_item");
			//{{user_implement_dev:<controlselect_item>
                //---------------------------------------------------------------------
              
                // �e��ʂ�struct��ޔ�
                saveParentStruct();
              
                // �T�u��ʕ\����񏉊���
                controlclear_sub2();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_item>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_item");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                //---------------------------------------------------------------------
              
                List listMessage = new ArrayList();
                
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
              
                // �o�^���������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 // �o�^�ɕK�v�ȓ����f�[�^��ݒ�
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // �I�����f�[�^���݃`�F�b�N
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mT_INV_CTRL.read(conn, struct);
                 if(temp_list.size() > 0)
                 {
                  // ���łɓ��f�[�^�����݂����ꍇ
                  listMessage.add("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                  setErrorMessage("ZZ01102", listMessage);
                 }
              
                 // �Ɩ��^�p���擾
                 String strBUSINESS_OPR_DATE = getBUSINESS_OPR_DATE(struct.getPLANT_CD());
                 if(strBUSINESS_OPR_DATE != null)
                 {
                  // �I�������Ɩ��^�p�����ߋ��ɂȂ��Ă��Ȃ����ǂ����̃`�F�b�N
                  DateConverter dateConv = new DateConverter();
                  Date dateINV_DATE = dateConv.str2date(struct.getINV_DATE());
                  Date dateBUSINESS_OPR_DATE = dateConv.str2date(strBUSINESS_OPR_DATE);
                  if(dateINV_DATE.getTime() < dateBUSINESS_OPR_DATE.getTime())
                  {
                   listMessage.clear();
                   listMessage.add("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                   listMessage.add("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                   setErrorMessage("AH00006", listMessage);
                  }
                 }
              
                 // �G���[�Ȃ��̏ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �o�^���s
                  entity.mT_INV_CTRL.create(conn, struct);
              
                  // �R�~�b�g
                  conn.commit();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
              
                  // �ēǍ�����
                  controlselect();
              
                  // �o�^���������t���O�ݒ�
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
                 }
              
                 // �o�^�����Ŏ��s�����ꍇ
                 if(bSuccess != true)
                 {
                  // �������O�̏�Ԃɖ߂�����
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //---------------------------------------------------------------------
              
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
              
                // �X�V���������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 // �X�V�Ώۃf�[�^�`�F�b�N
                 AH0020010Struct new_struct = new AH0020010Struct();
                 new_struct = checkTargetData(struct);
                 if(new_struct == null)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                 }
                 else
                 {
                  // �I����ԋ敪��0�i���{�O�j�łȂ����ǂ����̃`�F�b�N
                  if(checkINV_STS_TYP_notequalZERO(new_struct) != true)
                  {
                   // �G���[�t���O�ݒ�
                   bError = true;
                  }
                 }
              
                 // �G���[�Ȃ��̏ꍇ
                 if(bError != true)
                 {
                  // �Վ��I����off�̏ꍇ
                  if("0".equals(struct.geth_TEMP_INV_FLG()) == true)
                  {
                   // �I�������ۊǋ�w��e�[�u���̊Y�����R�[�h���폜
                   struct.setWH_CD("%");
                   entity.mT_INV_TARGET_WH.delete(conn, struct);
              
                   // �I�������i�ڎw��e�[�u���̊Y�����R�[�h���폜
                   struct.setITEM_CD("%");
                   entity.mT_INV_TARGET_ITEM.delete(conn, struct);
                  }
              
                  // �I������e�[�u���̊Y�����R�[�h���X�V
                  entity.mT_INV_CTRL.update(conn, struct);
              
                  // �R�~�b�g
                  conn.commit();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
              
                  // �ēǍ�����
                  controlselect();
              
                  // �X�V���������t���O�ݒ�
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
                 }
              
                 // �X�V�����Ŏ��s�����ꍇ
                 if(bSuccess != true)
                 {
                  // �������O�̏�Ԃɖ߂�����
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                //---------------------------------------------------------------------
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
              
                // �폜���������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 // �X�V�Ώۃf�[�^�`�F�b�N
                 checkTargetData(struct);
              
                 // �G���[�Ȃ��̏ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �I�������ۊǋ�w��e�[�u���̊Y�����R�[�h���폜
                  struct.setWH_CD("%");
                  entity.mT_INV_TARGET_WH.delete(conn, struct);
              
                  // �I�������i�ڎw��e�[�u���̊Y�����R�[�h���폜
                  struct.setITEM_CD("%");
                  entity.mT_INV_TARGET_ITEM.delete(conn, struct);
              
                  // �I������e�[�u���̊Y�����R�[�h���폜
                  entity.mT_INV_CTRL.delete(conn, struct);
              
                  // �R�~�b�g
                  conn.commit();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
              
                  // �N���A����
                  controlclear();
              
                  // �폜���������t���O�ݒ�
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
                 }
              
                 // �폜�����Ŏ��s�����ꍇ
                 if(bSuccess != true)
                 {
                  // �������O�̏�Ԃɖ߂�����
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
              
                // struct������
                struct.initializeParent();
              
                // ���[�h�ݒ�
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");
			//{{user_implement_dev:<controlselect_sub1>
                //------------------------------------------------------------------
              
                List listMessage = new ArrayList();
              
                // �Ǎ����������t���O������
                boolean bSuccess = false;
              
                // ������Ԃ�������
                setReadStatus(INITIAL);
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �Ǎ���������
                 struct.setPLANT_CD(getsysPLANT_CD());
                 // �\���ő�s��
                 ScreenParam sp = new ScreenParam(this.getClass());
                 int maxLine = sp.getMaxLine(conn,DISPLAY_CD_SUB1);
                 if(maxLine != 0) {
 					struct.setROW_COUNT(String.valueOf(maxLine));
 				} else {
 					struct.setROW_COUNT(null);
 				}
                 List list1 = entity.mT_INV_TARGET_WHCnt.read(conn, struct);
                 long rowCount = Long.parseLong(((AH0020010Struct)list1.get(0)).getl_COUNT());
                 // �\�����X�g�T�C�Y�̃`�F�b�N
                 if(rowCount== 0)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                  setReadStatus(NOT_FOUND);
              
                  // ���R�[�h�������O(�[��)���̏ꍇ
                  listMessage.add("T_INV_TARGET_WH.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_TARGET_WH.PLANT_CD:" + struct.getPLANT_CD());
                  listMessage.add("T_INV_TARGET_WH.WH_CD:" + struct.getw_WH_CD());
                  setErrorMessage("ZZ06001", listMessage);
                  if(list != null && list.size() > 0){
						list.clear();
					}
                  return;
                 }
              
                 // �\���ő�s����������
                 if(checkMaxDispLine(DISPLAY_CD_SUB1, rowCount) != true)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                  setReadStatus(TOO_MANY);
                  if(list != null && list.size() > 0){
						list.clear();
                    }
                  return;
                 }
                 // �Ǎ����s
                 List temp_list = entity.mT_INV_TARGET_WH.read(conn, struct);
                 
                 // �\���p�f�[�^���H
                 List disp_list = new ArrayList(0);
                 for(int i = 0; i < temp_list.size(); i++)
                 {
                  // �\���p�f�[�^�擾
                  AH0020010Struct temp_struct = (AH0020010Struct)temp_list.get(i);
              
                  // ���v�ʌv�Z�Ώۃt���O���e�擾�ݒ�
                  temp_struct.setw_MRP_FLG(getMRP_FLG_name(temp_struct.getMRP_FLG()));
              
                  // �q�ɋ敪���擾�ݒ�
                  temp_struct.setw_WH_TYP(getWH_TYP_name(temp_struct.getWH_TYP()));
              
                  // �ꗗ�u�Ώہv�`�F�b�N�{�b�N�X�̏�����Ԑݒ�
                  if( (temp_struct.getINV_WH_CD() != null) && ("".equals(temp_struct.getINV_WH_CD()) != true) )
                  {
                   temp_struct.setw_target("1");
                   temp_struct.setc_target("true");
                  }
                  else
                  {
                   temp_struct.setw_target("0");
                   temp_struct.setc_target("NULL");
                  }
                  // �\���Ώۃf�[�^�ݒ�
                  if( (struct.geth_disp_entry_wh() != null) && ("1".equals(struct.geth_disp_entry_wh()) == true) )
                  {
                   // �u�o�^�ςݕۊǋ�̂ݕ\������v�ŁA�o�^�ς݃f�[�^�̏ꍇ�Ƀf�[�^�ǉ�
                   if("1".equals(temp_struct.getw_target()) == true)
                   {
                    disp_list.add(temp_struct);
                   }
                  }
                  else
                  {
                   // �u�o�^�ςݕۊǋ�̂ݕ\������v�Ƀ`�F�b�N���Ȃ��ꍇ�͖������Ƀf�[�^�ǉ�
                   disp_list.add(temp_struct);
                  }
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �\���p���X�g���X�V
                  setList(disp_list);
              
                  // �Ǎ����������t���O�ݒ�
                  bSuccess = true;
                  setReadStatus(NORMAL);
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                 }
                 else
                 {
                  // �G���[�̏ꍇ�A�\�����X�g���N���A
                  list.clear();
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");
			//{{user_implement_dev:<controlupdate_sub1>
                //---------------------------------------------------------------------
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
              
                // �X�V���������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 // �X�V��񏀔�
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // �e�f�[�^�ǂݒ�����̒I����ԋ敪��0�i���{�O�j�łȂ����ǂ����̃`�F�b�N
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �I�������ۊǋ�w��e�[�u���̊Y�����R�[�h���폜
                  if( (struct.getw_WH_CD() == null) || ("".equals(struct.getw_WH_CD()) == true) )
                  {
                   struct.setWH_CD("%");
                  }
                  else
                  {
                   struct.setWH_CD(struct.getw_WH_CD());
                  }
                  entity.mT_INV_TARGET_WH.delete(conn, struct);
              
                  for(int i = 0; i < getListsize(); i++)
                  {
                   // �ꗗ�u�Ώہv���̃`�F�b�N����Ă���f�[�^�̂ݒǉ�
                   AH0020010Struct update_struct = (AH0020010Struct)getListvalue(i);
                   if( (update_struct.getw_target() != null) && ("1".equals(update_struct.getw_target()) == true) )
                   {
                    struct.setWH_CD(update_struct.getWH_CD());
                    entity.mT_INV_TARGET_WH.create(conn, struct);
                   }
                  }
              
                  // �R�~�b�g
                  conn.commit();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
              
                  // �ēǍ�����
                  controlselect_sub1();
              
                  // �X�V���������t���O�ݒ�
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
                 }
              
                 // �X�V�����Ŏ��s�����ꍇ
                 if(bSuccess != true)
                 {
                  // �������O�̏�Ԃɖ߂�����
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub1");
			//{{user_implement_dev:<controlclear_sub1>
                //------------------------------------------------------------------
              
                // struct������
                struct.initializeSub1();
                struct.setINV_DATE(_save_struct.getINV_DATE());
              
                // list������
                list.clear();
              
                // ���[�h�ݒ�
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
              
                // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                loadParentStruct();
              
                // �ēǍ�����
                controlselect();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub2");
			//{{user_implement_dev:<controlselect_sub2>
                //------------------------------------------------------------------
              
                List listMessage = new ArrayList();
              
                // �Ǎ������t���O������
                boolean bSuccess = false;
              
                // ������Ԃ�������
                setReadStatus(INITIAL);
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �Ǎ���������
                 struct.setPLANT_CD(getsysPLANT_CD());
                  
                 // �\���ő�s��
                 ScreenParam sp = new ScreenParam(this.getClass());
                 int maxLine = sp.getMaxLine(conn,DISPLAY_CD_SUB2);
                 if(maxLine != 0) {
 					struct.setROW_COUNT(String.valueOf(maxLine));
 				} else {
 					struct.setROW_COUNT(null);
 				}
                 List list2 = entity.mT_INV_TARGET_ITEMCnt.read(conn, struct);
                 long rowCount = Long.parseLong(((AH0020010Struct)list2.get(0)).getl_COUNT());
                 // �\�����X�g�T�C�Y�̃`�F�b�N
                 if(rowCount== 0)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                  setReadStatus(NOT_FOUND);
              
                  // ���R�[�h�������O(�[��)���̏ꍇ
                  listMessage.add("T_INV_TARGET_ITEM.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_TARGET_ITEM.PLANT_CD:" + struct.getPLANT_CD());
                  listMessage.add("T_INV_TARGET_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  setErrorMessage("ZZ06001", listMessage);
                  if(list != null && list.size() > 0){
						list.clear();
					}
                  return;
                 }
              
                 // �\���ő�s����������
                 if(checkMaxDispLine(DISPLAY_CD_SUB2, rowCount) != true)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                  setReadStatus(TOO_MANY);
                  if(list != null && list.size() > 0){
						list.clear();
					}
                  return;
                 }
                 // �Ǎ����s
                 List temp_list = entity.mT_INV_TARGET_ITEM.read(conn, struct);
              
                 // �\���p�f�[�^���H
                 List disp_list = new ArrayList(0);
                 for(int i = 0; i < temp_list.size(); i++)
                 {
                  // �\���p�f�[�^�擾
                  AH0020010Struct temp_struct = (AH0020010Struct)temp_list.get(i);
              
                  // �i�ڎ�z�敪���擾�ݒ�
                  temp_struct.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(temp_struct.getMRP_ODR_TYP()));
              
                  // ���O��敪���擾�ݒ�
                  temp_struct.setw_OUTSIDE_TYP(getOUTSIDE_TYP_name(temp_struct.getOUTSIDE_TYP()));
              
                  // �I���敪���擾�ݒ�
                  temp_struct.setw_ABC_TYP(getABC_TYP_name(temp_struct.getABC_TYP()));
              
                  // �ꗗ�u�Ώہv�`�F�b�N�{�b�N�X�̏�����Ԑݒ�
                  if( (temp_struct.getINV_ITEM_CD() != null) && ("".equals(temp_struct.getINV_ITEM_CD()) != true) )
                  {
                   temp_struct.setw_target("1");
                   temp_struct.setc_target("true");
                  }
                  else
                  {
                   temp_struct.setw_target("0");
                   temp_struct.setc_target("NULL");
                  }
              
                  // �\���Ώۃf�[�^�ݒ�
                  if( (struct.geth_disp_entry_item() != null) && ("1".equals(struct.geth_disp_entry_item()) == true) )
                  {
                   // �u�o�^�ς݂̕i�ڂ̂ݕ\������v�ŁA�o�^�ς݃f�[�^�̏ꍇ�Ƀf�[�^�ǉ�
                   if("1".equals(temp_struct.getw_target()) == true)
                   {
                    disp_list.add(temp_struct);
                   }
                  }
                  else
                  {
                   // �u�o�^�ς݂̕i�ڂ̂ݕ\������v�Ƀ`�F�b�N���Ȃ��ꍇ�͖������Ƀf�[�^�ǉ�
                   disp_list.add(temp_struct);
                  }
                 }
              
                
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �\���p���X�g���X�V
                  setList(disp_list);
              
                  // �Ǎ����������t���O�ݒ�
                  bSuccess = true;
                  setReadStatus(NORMAL);
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                 }
                 else
                 {
                  // �G���[�̏ꍇ�A�\�����X�g���N���A
                  list.clear();
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub2");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub2");
			//{{user_implement_dev:<controlupdate_sub2>
                //---------------------------------------------------------------------
              
                // DB�X�V���t���O������
                boolean bDBUpdate = false;
              
                // �X�V���������t���O������
                boolean bSuccess = false;
              
                // �������O��struct����ޔ�
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 // DB�X�V���t���OON
                 bDBUpdate = true;
              
                 // �X�V��񏀔�
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // �e�f�[�^�ǂݒ�����̒I����ԋ敪��0�i���{�O�j�łȂ����ǂ����̃`�F�b�N
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �I�������i�ڎw��e�[�u���̊Y�����R�[�h���폜
                  if( (struct.getw_ITEM_CD() == null) || ("".equals(struct.getw_ITEM_CD()) == true) )
                  {
                   struct.setITEM_CD("%");
                  }
                  else
                  {
                   struct.setITEM_CD(struct.getw_ITEM_CD());
                  }
                  entity.mT_INV_TARGET_ITEM.delete(conn, struct);
              
                  for(int i = 0; i < getListsize(); i++)
                  {
                   // �ꗗ�u�Ώہv���̃`�F�b�N����Ă���f�[�^�̂ݒǉ�
                   AH0020010Struct update_struct = (AH0020010Struct)getListvalue(i);
                   if( (update_struct.getw_target() != null) && ("1".equals(update_struct.getw_target()) == true) )
                   {
                    struct.setITEM_CD(update_struct.getITEM_CD());
                    entity.mT_INV_TARGET_ITEM.create(conn, struct);
                   }
                  }
              
                  // �R�~�b�g
                  conn.commit();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
              
                  // �ēǍ�����
                  controlselect_sub2();
              
                  // �X�V���������t���O�ݒ�
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
                 if(bDBUpdate == true)
                 {
                  // ���[���o�b�N
                  conn.rollback();
                 }
              
                 // �X�V�����Ŏ��s�����ꍇ
                 if(bSuccess != true)
                 {
                  // �������O�̏�Ԃɖ߂�����
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub2");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub2");
			//{{user_implement_dev:<controlclear_sub2>
                //------------------------------------------------------------------
              
                // struct������
                struct.initializeSub2();
                struct.setINV_DATE(_save_struct.getINV_DATE());
              
                // list������
                list.clear();
              
                // ���[�h�ݒ�
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub2");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");
			//{{user_implement_dev:<controlreturn_sub2>
                //---------------------------------------------------------------------
              
                // �q��ʂɑJ�ڂ���O�̐e��ʂ�struct�𕜋A
                loadParentStruct();
              
                // �ēǍ�����
                controlselect();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub3() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub3");
			//{{user_implement_dev:<controlreturn_sub3>
                //---------------------------------------------------------------------
                // �N���A����
                if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
                {
                 // �ۊǋ�w��
                 controlclear_sub1();
                }
                else
                {
                 // �i�ڎw��
                 controlclear_sub2();
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub3>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub3");

		return;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvImportWh() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportWh");
			//{{user_implement_dev:<controlCsvImportWh>
                //---------------------------------------------------------------------
              
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �Ǎ���������
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // �e�f�[�^�ǂݒ�����̒I����ԋ敪��0�i���{�O�j�łȂ����ǂ����̃`�F�b�N
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �G���[���\���p���X�g�N���A
                  list.clear();
              
                  // �I�������ۊǋ�w��ɑ΂��鏈���������t���O��ݒ�
                  setInvTargetFlg(FLG_INV_TARGET_WH);
                  setInvTarget2RadioValue(getInvTargetFlg());
              
                  // �q��ʂ�struct��ޔ�
                  saveSubStruct();
              
                  // CSV��ʃG���[���X�g�N���A
                  csvResultListClear();
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImportWh>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportWh");

		return;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvImportItem() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportItem");
			//{{user_implement_dev:<controlCsvImportItem>
                //---------------------------------------------------------------------
              
                try {
                 // �G���[�t���O������
                 boolean bError = false;
              
                 // �Ǎ���������
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // �e�f�[�^�ǂݒ�����̒I����ԋ敪��0�i���{�O�j�łȂ����ǂ����̃`�F�b�N
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // �G���[�t���O�ݒ�
                  bError = true;
                 }
              
                 // �G���[���Ȃ��ꍇ
                 if(bError != true)
                 {
                  // �G���[���\���p���X�g�N���A
                  list.clear();
              
                  // �I�������i�ڎw��ɑ΂��鏈���������t���O��ݒ�
                  setInvTargetFlg(FLG_INV_TARGET_ITEM);
                  setInvTarget2RadioValue(getInvTargetFlg());
              
                  // �q��ʂ�struct��ޔ�
                  saveSubStruct();
              
                  // CSV��ʃG���[���X�g�N���A
                  csvResultListClear();
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImportItem>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportItem");

		return;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
                //---------------------------------------------------------------------
                try {
                 // ��ʏ�̓���̏�񂵂��T�u�~�b�g�ł��Ȃ����߁A�����ŉ�ʏ����\�����̒l���Đݒ�
                 struct.setINV_DATE(_structSaveSub.getINV_DATE());
                 struct.setPLANT_CD(_structSaveSub.getPLANT_CD());
                 struct.setr1_inv_target(_structSaveSub.getr1_inv_target());
                 struct.setr2_inv_target(_structSaveSub.getr2_inv_target());
              
                 // �G���[�t���O������
                 boolean bError = false;
                 // ��ʕ\���p�G���[���X�g�N���A
                 csvResultListClear();
              
                 // �b�r�u�f�[�^�擾
                 List listCsv = readCsvData();
                 if(listCsv == null)
                 {
                  bError = true;
                 }
              
                 // �b�r�u�f�[�^�擾����
                 if(bError != true)
                 {
                  // �b�r�u�f�[�^���e�`�F�b�N
                  if(checkCsvData(listCsv) != true)
                  {
                   bError = true;
                  }
                 }
              
                 // �b�r�u�f�[�^���e�Ɉُ�Ȃ�
                 if(bError != true)
                 {
                  // �b�r�u�f�[�^���f
                  csvData2Db(listCsv);
                 }
              
                } finally{
                 if(getMessage().sizeError() <= 0)
                 {
                  // ���������̏ꍇ�͑O��ʂ֖߂邽�߁A�߂鏈���������Ȃ�
                  controlreturn_sub3();
                 }
                 else {
                  // ���X�g�ɃG���[���e�Z�b�g
                  setList(_listResultMessageCsv);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselectall");
			//{{user_implement_dev:<controlselectall>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlselectall>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselectall");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcancelselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");
			//{{user_implement_dev:<controlcancelselectall>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlcancelselectall>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
                try {
              
                 // �R���{�f�[�^�̎擾
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _INV_STS_TYP = controller.getData("INV_STS_TYP");	// �I����ԋ敪
                 _MRP_FLG	 = controller.getData("MRP_FLG");		// ���v�ʌv�Z�Ώۃt���O
                 _WH_TYP		 = controller.getData("WH_TYP");		// �q�ɋ敪
                 _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");	// �i�ڎ�z�敪
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");	// ���O��敪
                 _ABC_TYP	 = controller.getData("ABC_TYP");		// �I���敪
              
                 // ��ʗp�u�I���敪�v�R���{�{�b�N�X���X�g�f�[�^�쐬
                 makeAbcTypComboData(_ABC_TYP);
              
                 // �N���A����
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
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("select_wh") ) {
				controlselect_wh();
			} else if( button.equals("select_item") ) {
				controlselect_item();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("select_sub1") ) {
				controlselect_sub1();
			} else if( button.equals("update_sub1") ) {
				controlupdate_sub1();
			} else if( button.equals("clear_sub1") ) {
				controlclear_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("select_sub2") ) {
				controlselect_sub2();
			} else if( button.equals("update_sub2") ) {
				controlupdate_sub2();
			} else if( button.equals("clear_sub2") ) {
				controlclear_sub2();
			} else if( button.equals("return_sub2") ) {
				controlreturn_sub2();
			} else if( button.equals("return_sub3") ) {
				controlreturn_sub3();
			} else if( button.equals("CsvImportWh") ) {
				controlCsvImportWh();
			} else if( button.equals("CsvImportItem") ) {
				controlCsvImportItem();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("selectall") ) {
				controlselectall();
			} else if( button.equals("cancelselectall") ) {
				controlcancelselectall();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //---------------------------------------------------------------------
                struct.setList_s_ABC_TYP_val(_comboAbcTyp.getValList());
                struct.setList_s_ABC_TYP_name(_comboAbcTyp.getExplanList());
                  } catch(AlarmMessageException ame){
                 //ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 //throw ee;
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
//			throw new FoundationException("AH0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AH0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AH0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AH0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AH0020010Entity entity;
	protected AH0020010Struct struct;
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

		entity = new AH0020010Entity();
		struct = new AH0020010Struct();

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
	 * AH0020010�N���X�̕W���R���X�g���N�^
	 */
	public AH0020010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
                list = new ArrayList(0);
                //---------------------------------------------------------------------
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
				AH0020010Struct key = (AH0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_STS_TYP") && key.getw_INV_STS_TYP() != null) {
					msgKey.setKeyValue("w_INV_STS_TYP", key.getw_INV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP") && key.getw_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP", key.getw_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ABC_TYP") && key.getw_ABC_TYP() != null) {
					msgKey.setKeyValue("w_ABC_TYP", key.getw_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_name") && key.gets_ABC_TYP_name() != null) {
					msgKey.setKeyValue("s_ABC_TYP_name", key.gets_ABC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_val") && key.gets_ABC_TYP_val() != null) {
					msgKey.setKeyValue("s_ABC_TYP_val", key.gets_ABC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ERR_ADR") && key.getERR_ADR() != null) {
					msgKey.setKeyValue("ERR_ADR", key.getERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("ERR_MSG") && key.getERR_MSG() != null) {
					msgKey.setKeyValue("ERR_MSG", key.getERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("h_saveINV_DATE") && key.geth_saveINV_DATE() != null) {
					msgKey.setKeyValue("h_saveINV_DATE", key.geth_saveINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("c_REGULAR_INV_FLG") && key.getc_REGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("c_REGULAR_INV_FLG", key.getc_REGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_CYCLE_INV_FLG") && key.getc_CYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("c_CYCLE_INV_FLG", key.getc_CYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_TEMP_INV_FLG") && key.getc_TEMP_INV_FLG() != null) {
					msgKey.setKeyValue("c_TEMP_INV_FLG", key.getc_TEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_disp_entry_wh") && key.getc_disp_entry_wh() != null) {
					msgKey.setKeyValue("c_disp_entry_wh", key.getc_disp_entry_wh());
				}
				if(msgKeyType.containsKeyColumn("c_disp_entry_item") && key.getc_disp_entry_item() != null) {
					msgKey.setKeyValue("c_disp_entry_item", key.getc_disp_entry_item());
				}
				if(msgKeyType.containsKeyColumn("c_target") && key.getc_target() != null) {
					msgKey.setKeyValue("c_target", key.getc_target());
				}
				if(msgKeyType.containsKeyColumn("h_saveINV_STS_TYP") && key.geth_saveINV_STS_TYP() != null) {
					msgKey.setKeyValue("h_saveINV_STS_TYP", key.geth_saveINV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_target") && key.getw_target() != null) {
					msgKey.setKeyValue("w_target", key.getw_target());
				}
				if(msgKeyType.containsKeyColumn("r1_inv_target") && key.getr1_inv_target() != null) {
					msgKey.setKeyValue("r1_inv_target", key.getr1_inv_target());
				}
				if(msgKeyType.containsKeyColumn("r2_inv_target") && key.getr2_inv_target() != null) {
					msgKey.setKeyValue("r2_inv_target", key.getr2_inv_target());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("h_saveTEMP_INV_FLG") && key.geth_saveTEMP_INV_FLG() != null) {
					msgKey.setKeyValue("h_saveTEMP_INV_FLG", key.geth_saveTEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_DATE") && key.getINV_DATE() != null) {
					msgKey.setKeyValue("INV_DATE", key.getINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_REGULAR_INV_FLG") && key.geth_REGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("h_REGULAR_INV_FLG", key.geth_REGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_CYCLE_INV_FLG") && key.geth_CYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("h_CYCLE_INV_FLG", key.geth_CYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_TEMP_INV_FLG") && key.geth_TEMP_INV_FLG() != null) {
					msgKey.setKeyValue("h_TEMP_INV_FLG", key.geth_TEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_INV_STS_TYP") && key.geth_INV_STS_TYP() != null) {
					msgKey.setKeyValue("h_INV_STS_TYP", key.geth_INV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_START_DATE") && key.getINV_START_DATE() != null) {
					msgKey.setKeyValue("INV_START_DATE", key.getINV_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE") && key.getSTOCK_SAVE_DATE() != null) {
					msgKey.setKeyValue("STOCK_SAVE_DATE", key.getSTOCK_SAVE_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE") && key.getINV_UPDATED_DATE() != null) {
					msgKey.setKeyValue("INV_UPDATED_DATE", key.getINV_UPDATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_COMMENT") && key.getINV_COMMENT() != null) {
					msgKey.setKeyValue("INV_COMMENT", key.getINV_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_WH_CD") && key.getINV_WH_CD() != null) {
					msgKey.setKeyValue("INV_WH_CD", key.getINV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_VEND_CD") && key.getWH_VEND_CD() != null) {
					msgKey.setKeyValue("WH_VEND_CD", key.getWH_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_ITEM_CD") && key.getINV_ITEM_CD() != null) {
					msgKey.setKeyValue("INV_ITEM_CD", key.getINV_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP") && key.gets_ABC_TYP() != null) {
					msgKey.setKeyValue("s_ABC_TYP", key.gets_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("CHK_PLANT_CD") && key.getCHK_PLANT_CD() != null) {
					msgKey.setKeyValue("CHK_PLANT_CD", key.getCHK_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CHK_INV_DATE") && key.getCHK_INV_DATE() != null) {
					msgKey.setKeyValue("CHK_INV_DATE", key.getCHK_INV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CHK_WH_CD") && key.getCHK_WH_CD() != null) {
					msgKey.setKeyValue("CHK_WH_CD", key.getCHK_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("CHK_ITEM_CD") && key.getCHK_ITEM_CD() != null) {
					msgKey.setKeyValue("CHK_ITEM_CD", key.getCHK_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_disp_entry_wh") && key.geth_disp_entry_wh() != null) {
					msgKey.setKeyValue("h_disp_entry_wh", key.geth_disp_entry_wh());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_disp_entry_item") && key.geth_disp_entry_item() != null) {
					msgKey.setKeyValue("h_disp_entry_item", key.geth_disp_entry_item());
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
					AH0020010Struct key = new AH0020010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_STS_TYP")) {
						key.setw_INV_STS_TYP(msgKey.getKeyValue("w_INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(msgKey.getKeyValue("w_MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(msgKey.getKeyValue("w_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP")) {
						key.setw_OUTSIDE_TYP(msgKey.getKeyValue("w_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ABC_TYP")) {
						key.setw_ABC_TYP(msgKey.getKeyValue("w_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_name")) {
						key.sets_ABC_TYP_name(msgKey.getKeyValue("s_ABC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_val")) {
						key.sets_ABC_TYP_val(msgKey.getKeyValue("s_ABC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ERR_ADR")) {
						key.setERR_ADR(msgKey.getKeyValue("ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("ERR_MSG")) {
						key.setERR_MSG(msgKey.getKeyValue("ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("h_saveINV_DATE")) {
						key.seth_saveINV_DATE(msgKey.getKeyValue("h_saveINV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("c_REGULAR_INV_FLG")) {
						key.setc_REGULAR_INV_FLG(msgKey.getKeyValue("c_REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_CYCLE_INV_FLG")) {
						key.setc_CYCLE_INV_FLG(msgKey.getKeyValue("c_CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_TEMP_INV_FLG")) {
						key.setc_TEMP_INV_FLG(msgKey.getKeyValue("c_TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_disp_entry_wh")) {
						key.setc_disp_entry_wh(msgKey.getKeyValue("c_disp_entry_wh"));
					}
					if(msgKeyType.containsKeyColumn("c_disp_entry_item")) {
						key.setc_disp_entry_item(msgKey.getKeyValue("c_disp_entry_item"));
					}
					if(msgKeyType.containsKeyColumn("c_target")) {
						key.setc_target(msgKey.getKeyValue("c_target"));
					}
					if(msgKeyType.containsKeyColumn("h_saveINV_STS_TYP")) {
						key.seth_saveINV_STS_TYP(msgKey.getKeyValue("h_saveINV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_target")) {
						key.setw_target(msgKey.getKeyValue("w_target"));
					}
					if(msgKeyType.containsKeyColumn("r1_inv_target")) {
						key.setr1_inv_target(msgKey.getKeyValue("r1_inv_target"));
					}
					if(msgKeyType.containsKeyColumn("r2_inv_target")) {
						key.setr2_inv_target(msgKey.getKeyValue("r2_inv_target"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("h_saveTEMP_INV_FLG")) {
						key.seth_saveTEMP_INV_FLG(msgKey.getKeyValue("h_saveTEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_DATE")) {
						key.setINV_DATE(msgKey.getKeyValue("INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_REGULAR_INV_FLG")) {
						key.seth_REGULAR_INV_FLG(msgKey.getKeyValue("h_REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_CYCLE_INV_FLG")) {
						key.seth_CYCLE_INV_FLG(msgKey.getKeyValue("h_CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_TEMP_INV_FLG")) {
						key.seth_TEMP_INV_FLG(msgKey.getKeyValue("h_TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_STS_TYP")) {
						key.seth_INV_STS_TYP(msgKey.getKeyValue("h_INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_START_DATE")) {
						key.setINV_START_DATE(msgKey.getKeyValue("INV_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE")) {
						key.setSTOCK_SAVE_DATE(msgKey.getKeyValue("STOCK_SAVE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE")) {
						key.setINV_UPDATED_DATE(msgKey.getKeyValue("INV_UPDATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_COMMENT")) {
						key.setINV_COMMENT(msgKey.getKeyValue("INV_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_WH_CD")) {
						key.setINV_WH_CD(msgKey.getKeyValue("INV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_VEND_CD")) {
						key.setWH_VEND_CD(msgKey.getKeyValue("WH_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_ITEM_CD")) {
						key.setINV_ITEM_CD(msgKey.getKeyValue("INV_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(msgKey.getKeyValue("ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP")) {
						key.sets_ABC_TYP(msgKey.getKeyValue("s_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("CHK_PLANT_CD")) {
						key.setCHK_PLANT_CD(msgKey.getKeyValue("CHK_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CHK_INV_DATE")) {
						key.setCHK_INV_DATE(msgKey.getKeyValue("CHK_INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CHK_WH_CD")) {
						key.setCHK_WH_CD(msgKey.getKeyValue("CHK_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("CHK_ITEM_CD")) {
						key.setCHK_ITEM_CD(msgKey.getKeyValue("CHK_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_disp_entry_wh")) {
						key.seth_disp_entry_wh(msgKey.getKeyValue("h_disp_entry_wh"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_disp_entry_item")) {
						key.seth_disp_entry_item(msgKey.getKeyValue("h_disp_entry_item"));
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
