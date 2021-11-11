/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0030/src/com/nec/jp/orteus/metamorBase/AA0030/AA0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0030;

import com.nec.jp.orteus.metamorBase.AA0030.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0030010Control
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
        public List getList() { return this.list; } 					// ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
        public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public AA0030010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
       //------------------------------------------------------------------------------
       
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
       //---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------
       
        /** �i�ڎ�z�敪 */
        ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /** �i�ڎ�z�敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** �i�ڎ�z�敪�擾
         * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }
       
       /**************/
       
        /** ���O��敪(�i�ڕʁE��ƌn���) */
        ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /** ���O��敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setOUTSIDE_TYP_comb(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** ���O��敪�擾
         * @return ���O��敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getOUTSIDE_TYP_comb(){ return _OUTSIDE_TYP; }
       
       /**************/
       
        /** �i�ڕʍ�Ǝ��ы敪 */
        ComboStruct _OPR_RSLT_TYP = new ComboStruct();
       
        /** �i�ڕʍ�Ǝ��ы敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setOPR_RSLT_TYP_comb(ComboStruct combo){ _OPR_RSLT_TYP = combo; }
       
        /** �i�ڕʍ�Ǝ��ы敪�擾
         * @return �i�ڕʍ�Ǝ��ы敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getOPR_RSLT_TYP_comb(){ return _OPR_RSLT_TYP; }
       
       /**************/
       
        /** ��������敪 */
        ComboStruct _ACPT_INSPC_TYP = new ComboStruct();
       
        /** ��������敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setACPT_INSPC_TYP_comb(ComboStruct combo){ _ACPT_INSPC_TYP = combo; }
       
        /** ��������敪�擾
         * @return ��������敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getACPT_INSPC_TYP_comb(){ return _ACPT_INSPC_TYP; }
       
// 2008/07/15 SYSCOM ���� ADD START
       /**************/
       
        /** �H���Ǘ��i�ڋ敪 */
        ComboStruct _MANHOUR_TYP = new ComboStruct();
       
        /** �H���Ǘ��i�ڋ敪
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setMANHOUR_TYP_comb(ComboStruct combo){ _MANHOUR_TYP = combo; }
       
        /** �H���Ǘ��i�ڋ敪
         * @return �H���Ǘ��i�ڋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getMANHOUR_TYP_comb(){ return _MANHOUR_TYP; }
// 2008/07/15 SYSCOM ���� ADD END

       //-------------------------------------------------------------------------
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param intType �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, Integer intType)
        {
         String strTyp = TypeConverter.sanitizer(intType);
         return getTypeName(comboStruct,strTyp);
        }
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param strTyp �敪�R�[�h
         * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         String strTypName = strTyp;
         for(int i = 0; i < comboStruct.getValList().size(); i++){
          if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
           strTypName = (String)(comboStruct.getExplanList().get(i));
           break;
          }
         }
         return strTypName;
        }
        /**
         * �i�ڏ��̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����
         */
        private void setTypeValueAboutItem(AA0030010Struct s)
        {
         s.setITEM_MRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setITEM_OUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getITEM_OUTSIDE_TYP()));
         s.setITEM_OPR_RSLT_NAME(getTypeName(_OPR_RSLT_TYP,s.getOPR_RSLT_TYP()));
// 2008/07/15 SYSCOM ���� ADD START
         s.setITEM_MANHOUR_NAME(getTypeName(_MANHOUR_TYP,s.getMANHOUR_TYP()));
// 2008/07/15 SYSCOM ���� ADD END
        }
        /**
         * ��ƌn����̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����
         */
        private void setTypeValueAboutProcGroup(AA0030010Struct s)
        {
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setACPT_INSPC_NAME(getTypeName(_ACPT_INSPC_TYP,s.getACPT_INSPC_TYP()));
        }
       
       //------------------------------------------------------------------------
       
        /** ���[�U��`�̏������σt���O */
        private boolean _usersIntialized = false;
       
        /**
         * ���[�U��` ����������
         */
        private void usersInitialize() throws ExpjException
        {
         if(_usersIntialized) return;
       
         // �R���{�f�[�^�̎擾
         setComboData(struct);
       
         _usersIntialized = true;
         return ;
        }
       
       
       //------------------------------------------------------------------------
        /**
         * �R���{�{�b�N�X�̒��g���擾���܂��B
         *
         * @param data �f�[�^�̔�
         */
         private void setComboData(AA0030010Struct data) throws ExpjException
         {
         ComboBox comboController = new ComboBox(conn, sysUSER_CD);
         try{
          //�R���{�f�[�^�̎擾
          ComboStruct MRP_ODR_TYP_comb = comboController.getData("MRP_ODR_TYP");
          ComboStruct OUTSIDE_TYP_comb = comboController.getData("OUTSIDE_TYP");
          ComboStruct OPR_RSLT_TYP_comb = comboController.getData("OPR_RSLT_TYP");
          ComboStruct ACPT_INSPC_TYP_comb = comboController.getData("ACPT_INSPC_TYP");
// 2008/07/15 SYSCOM ���� ADD START
          ComboStruct MANHOUR_TYP_comb = comboController.getData("MANHOUR_TYP");
// 2008/07/15 SYSCOM ���� ADD END
       
          comboController.setConnection(null);
       
          //�����Ɏ擾�f�[�^�ݒ�
          setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
          setOUTSIDE_TYP_comb(OUTSIDE_TYP_comb);
          setOPR_RSLT_TYP_comb(OPR_RSLT_TYP_comb);
          setACPT_INSPC_TYP_comb(ACPT_INSPC_TYP_comb);
// 2008/07/15 SYSCOM ���� ADD START
          setMANHOUR_TYP_comb(MANHOUR_TYP_comb);
// 2008/07/15 SYSCOM ���� ADD END
       
         }catch(SQLException e) {
          setSqlExceptionMsg(e);
       
         }catch(ComboException e){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
         }
        }
       
       //-------------------------------------------------------------------------
        // �X�V�Ώۂ̍�ƌn����No
        private Integer _checkNo = null;
        
        /** �X�V�Ώۂ̍�ƌn����No�擾
         * @return ��ƌn����No
        */
        public Integer getCheckNumber(){ return _checkNo; }
        
        /** �X�V�Ώۂ̍�ƌn����No�ݒ�
         * @param �X�V�Ώۂ̍�ƌn����No
        */
        public void setCheckNumber(Integer no){ _checkNo = no; }
       
       
        /** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
        private AA0030010Struct _keyStruct = new AA0030010Struct();
       
        /** �L�[���Struct�̎擾 */
        public AA0030010Struct getKeyStruct(){ return _keyStruct; }
        
        /** �L�[���Struct�̐ݒ� */
        public void setKeyStruct(AA0030010Struct struct){ _keyStruct.copy(struct); }
       
       
       //-------------------------------------------------------------------------
       
        /** ��ƌn�񃊃X�g */
        private List _procedureList = new ArrayList(0);
       
        /** 
         * ��ƌn�񃊃X�g�擾	
         * @return ��ƌn�񃊃X�g
        */
        public List getProcedureList(){ return _procedureList; }
       
        /** 
         * ��ƌn�񃊃X�g�ݒ�
         * @param ��ƌn�񃊃X�g
         */
        public void setProcedureList(List list){ _procedureList = list; }
       
       
       //-------------------------------------------------------------------------
       
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
       
       //-------------------------------------------------------------------------
       
        /**
         * ���͒l�`�F�b�N�B
         * NOT NULL���ڂɒl�������Ă��Ȃ��ꍇ�A�����l��ݒ肷��
         * @param checkStruct �`�F�b�N�Ώۂ�Struct
         */
        // 2003/09/30 �S�Ă�String�^�̔��蕶�� �󕶎���łȂ����̏������ǉ�  K.Shiraki
        private void checkStruct(AA0030010Struct checkStruct)
        {
         // ��ƌn��ԍ�
         if(checkStruct.getPROC_NO() == null
         || "".equals(checkStruct.getPROC_NO()))
          checkStruct.setPROC_NO(AA0030Common._PROC_NO);
       
         // ��ƌn��Œ蕪���[�h�^�C��
         if(checkStruct.getFIXED_LT() == null
         || "".equals(checkStruct.getFIXED_LT()))
          checkStruct.setFIXED_LT(AA0030Common._FIXED_LT);
       
         // ��ƌn���ᕪ���[�h�^�C��
         if(checkStruct.getPROP_LT() == null
         || "".equals(checkStruct.getPROP_LT()))
          checkStruct.setPROP_LT(AA0030Common._PROP_LT);	
       
         // ��ƌn����S����
         if(checkStruct.getSAFETY_LT() == null
         || "".equals(checkStruct.getSAFETY_LT()))
          checkStruct.setSAFETY_LT(AA0030Common._SAFETY_LT);
       
         // ��ƌn���ᕪ���b�g�T�C�Y
         if(checkStruct.getPROP_LOT_SIZE() == null
         || "".equals(checkStruct.getPROP_LOT_SIZE()))
          checkStruct.setPROP_LOT_SIZE(AA0030Common._PROP_LOT_SIZE);
       
         // ��ƌn��d����
         if(checkStruct.getSPOIL() == null
         || "".equals(checkStruct.getSPOIL()))
          checkStruct.setSPOIL(AA0030Common._SPOIL);
       
         // �W���H��
         if(checkStruct.getSTANDARD_COST() == null
         || "".equals(checkStruct.getSTANDARD_COST()))
          checkStruct.setSTANDARD_COST(AA0030Common._STANDARD_COST);
       
         return;
        }
       
       //-----------------------------------------------------------------------------
        /**
         * �Œ胊�[�h�^�C���`�F�b�N
         * @param itemStruct �i�ڏ��Struct
         */
         private void checkLT(AA0030010Struct itemStruct)
         {
          
         // �Œ蕪���[�h�^�C���`�F�b�N
         long fixed_lt = 0;
         long prop_lt = 0;
         for(int i = 0; i < _procedureList.size(); i++){
          AA0030010Struct workStruct = (AA0030010Struct)_procedureList.get(i);
          fixed_lt = fixed_lt + (Long.valueOf(workStruct.getFIXED_LT())).longValue();
          prop_lt = prop_lt + (Long.valueOf(workStruct.getPROP_LT())).longValue();
         }
       
         // �i�ڂ̔�ᕪ���[�h�^�C�� == 0 && �S��ƌn���ᕪ���[�h�^�C�� == 0
         if(itemStruct.getITEM_PROP_LT().longValue() == 0 && prop_lt == 0){
          if(itemStruct.getITEM_FIXED_LT().longValue() < fixed_lt){
           setInfoMessage("AA60003", "");
          }
         }
        }
       
       //-----------------------------------------------------------------------------
        /**
         * �Œ胊�[�h�^�C���`�F�b�N
         * @param itemStruct �i�ڏ��Struct�AbomStruct ASP����BOM���Struct
         */
         private void checkLTBom(AA0030010Struct itemStruct, AA0030010Struct bomStruct)
         {
          
         // �Œ蕪���[�h�^�C���`�F�b�N
         long fixed_lt = 0;
         long prop_lt = 0;
         for(int i = 0; i < _procedureList.size(); i++){
          AA0030010Struct workStruct = (AA0030010Struct)_procedureList.get(i);
          fixed_lt = fixed_lt + (Long.valueOf(workStruct.getFIXED_LT())).longValue();
          prop_lt = prop_lt + (Long.valueOf(workStruct.getPROP_LT())).longValue();
         }
       
         // �i�ڂ̔�ᕪ���[�h�^�C�� == 0 && �S��ƌn���ᕪ���[�h�^�C�� == 0
         if(itemStruct.getITEM_PROP_LT().longValue() == 0 && prop_lt == 0){
          if(bomStruct.getBOM_FIXED_LT().longValue() < fixed_lt){
           setInfoMessage("AA60003", "");
          }
         }
        }
       
       //-----------------------------------------------------------------------------
       
        /** 
         * �Ώۃf�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
         * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
         *
         * @param target_struct �Ώۃf�[�^���
         * @param modify_count �Ώۃf�[�^MODIFY_COUNT
         * @return boolean true:�G���[���� false:�G���[�Ȃ�
         */
        private boolean checkTargetDataInM_PROC_GRP(AA0030010Struct target_struct, String modify_count) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �����Ώۃf�[�^�̑��݃`�F�b�N
         List temp_list = new ArrayList(0);
         temp_list = entity.mSelectOne_for_update_nowait.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          
          listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
          listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
          listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getPROC_CD());
       
          setErrorMessage("ZZ06001", listMessage);
          return true;
         }
         else
         {
          // ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
          AA0030010Struct temp_struct = (AA0030010Struct)temp_list.get(0);
          if(temp_struct.getMODIFY_COUNT().equals(modify_count) != true)
          {
           
           listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
           listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
           listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getPROC_CD());
       
           setErrorMessage("ZZ01105", listMessage);
           return true;
          }
         }
       
         return false;
        }
       
        /** 
         * �ΏۑS�f�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
         * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
         *
         * @param target_struct �Ώۃf�[�^���
         * @return boolean true:�G���[���� false:�G���[�Ȃ�
         */
        private boolean checkTargetAllDataInM_PROC_GRP(AA0030010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // ���݂̓Ǎ��L�[�Ńf�[�^��Ǎ�(select for update no wait�������Ă���Ǎ�����)
         List new_list = new ArrayList();
         new_list = entity.mSelect_for_update_nowait.read(conn, struct);
       
         // �ǂݍ��񂾃f�[�^���������ݓǂݍ���ł��錏���Ɠ������ǂ����̃`�F�b�N
         if(new_list.size() != _procedureList.size())
         {
          
          listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
          listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
       
          setErrorMessage("ZZ01105", listMessage);
          return true;
         }
         else
         {
          // �ǂݍ��񂾊e�f�[�^���e�����ݓǂݍ���ł���f�[�^���e�Ɠ������ǂ����̃`�F�b�N
          AA0030010Struct now_struct = new AA0030010Struct();
          AA0030010Struct new_struct = new AA0030010Struct();
          for(int i = 0; i < _procedureList.size(); i++)
          {
           // �e���X�g����f�[�^���擾
           now_struct = (AA0030010Struct)_procedureList.get(i);
           new_struct = (AA0030010Struct)new_list.get(i);
       
           // �e���ڂ̏�񂪓������ǂ����̃`�F�b�N
           if(	((now_struct.getPROC_CD() == null && new_struct.getPROC_CD() != null) || (now_struct.getPROC_CD() != null && now_struct.getPROC_CD().equals(new_struct.getPROC_CD()) != true) )
           ||	((now_struct.getPROC_NO() == null && new_struct.getPROC_NO() != null) || (now_struct.getPROC_NO() != null && now_struct.getPROC_NO().equals(new_struct.getPROC_NO()) != true) )
           ||	((now_struct.getPROC_NAME() == null && new_struct.getPROC_NAME() != null) || (now_struct.getPROC_NAME() != null && now_struct.getPROC_NAME().equals(new_struct.getPROC_NAME()) != true) )
           ||	((now_struct.getWS_CD() == null && new_struct.getWS_CD() != null) || (now_struct.getWS_CD() != null && now_struct.getWS_CD().equals(new_struct.getWS_CD()) != true) )
           ||	((now_struct.getCOMPANY_CD() == null && new_struct.getCOMPANY_CD() != null) || (now_struct.getCOMPANY_CD() != null && now_struct.getCOMPANY_CD().equals(new_struct.getCOMPANY_CD()) != true) )
           ||	((now_struct.getVEND_CD() == null && new_struct.getVEND_CD() != null) || (now_struct.getVEND_CD() != null && now_struct.getVEND_CD().equals(new_struct.getVEND_CD()) != true) )
           ||	((now_struct.getFIXED_LT() == null && new_struct.getFIXED_LT() != null) || (now_struct.getFIXED_LT() != null && now_struct.getFIXED_LT().equals(new_struct.getFIXED_LT()) != true) )
           ||	((now_struct.getPROP_LT() == null && new_struct.getPROP_LT() != null) || (now_struct.getPROP_LT() != null && now_struct.getPROP_LT().equals(new_struct.getPROP_LT()) != true) )
           ||	((now_struct.getSAFETY_LT() == null && new_struct.getSAFETY_LT() != null) || (now_struct.getSAFETY_LT() != null && now_struct.getSAFETY_LT().equals(new_struct.getSAFETY_LT()) != true) )
           ||	((now_struct.getPROP_LOT_SIZE() == null && new_struct.getPROP_LOT_SIZE() != null) || (now_struct.getPROP_LOT_SIZE() != null && now_struct.getPROP_LOT_SIZE().equals(new_struct.getPROP_LOT_SIZE()) != true) )
           ||	((now_struct.getSPOIL() == null && new_struct.getSPOIL() != null) || (now_struct.getSPOIL() != null && now_struct.getSPOIL().equals(new_struct.getSPOIL()) != true) )
           ||	((now_struct.getOUTSIDE_TYP() == null && new_struct.getOUTSIDE_TYP() != null) || (now_struct.getOUTSIDE_TYP() != null && now_struct.getOUTSIDE_TYP().equals(new_struct.getOUTSIDE_TYP()) != true) )
           ||	((now_struct.getACPT_INSPC_TYP() == null && new_struct.getACPT_INSPC_TYP() != null) || (now_struct.getACPT_INSPC_TYP() != null && now_struct.getACPT_INSPC_TYP().equals(new_struct.getACPT_INSPC_TYP()) != true) )
           ||	((now_struct.getSTANDARD_COST() == null && new_struct.getSTANDARD_COST() != null) || (now_struct.getSTANDARD_COST() != null && now_struct.getSTANDARD_COST().equals(new_struct.getSTANDARD_COST()) != true) )
           ||	((now_struct.getMODIFY_COUNT() == null && new_struct.getMODIFY_COUNT() != null) || (now_struct.getMODIFY_COUNT() != null && now_struct.getMODIFY_COUNT().equals(new_struct.getMODIFY_COUNT()) != true) ) )
           {
          
            listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
            listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
       
            setErrorMessage("ZZ01105", listMessage);
            break;
           }
          }
         }
       
       
         return false;
        }
       
        /**
         * �i�ڏ��ݒ菈��
         * @param target_struct �ݒ�Ώ�
         * @param w_itemList �i�ڏ�񃊃X�g
         */
        private void setItemInfo(AA0030010Struct target_struct, List w_itemList)
        {
         if(w_itemList.size() <= 0)
         {
          target_struct.setSTOCK_UNIT("");
         }
         else
         {
          AA0030010Struct itemStruct = (AA0030010Struct)w_itemList.get(0);
          target_struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
         }
        }
       //-------------------------------------------------------------------------
       
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                //------------------------------------------------------------------
              
                String Message = "";
                setReadStatus(INITIAL);
              
                try {
                 // ��ƌn�񃊃X�g�N���A
                 _procedureList.clear();
              
                 // �Ώەi�ڏ��擾
                 List itemList = entity.mSelectM_ITEM.read(conn, struct);
              
                 // �i�ڏ��ݒ�
                 setItemInfo(struct, itemList);
              
                 if(itemList.size() <= 0){
                  // hidden�̃N���A
                  struct.seth_ITEM_CD("");
              
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  setErrorMessage("ZZ06001", Message);
                 }
                 else{
                  // ��ƌn��ꗗ�擾
                  _procedureList = entity.mSelect.read(conn, struct);
              
                  if(_procedureList.size() > 0){
                   for(int n = 0; n < _procedureList.size(); n++){
                    // �R���{�l�̑Ή����閼�̂��擾
                    setTypeValueAboutProcGroup((AA0030010Struct)(_procedureList.get(n)));
                   }
                   // �Ǎ����
                   setReadStatus(NORMAL);
              
                  } else if(_procedureList.size() == 0){
                   // �Ǎ����
                   setReadStatus(NOT_FOUND);
                  }
                  // �ǂݍ��݃L�[�ޔ�
                  String w_h_item = struct.getITEM_CD();
              
                  list = _procedureList;
              
                  // �i�ڏ��ݒ�
                  _keyStruct.copy((AA0030010Struct)itemList.get(0));
              
                  // �ǂݍ��݃L�[�擾
                  _keyStruct.seth_ITEM_CD(w_h_item);
              
                  // �R���{�l�̑Ή����閼�̂��擾
                  setTypeValueAboutItem(_keyStruct);
                  _keyStruct.setPLANT_CD(new String(struct.getPLANT_CD()));
                  struct.copy(_keyStruct);
              
                 }
              
                }catch(SQLException e){
                 // �Ǎ����
                 setReadStatus(ERROR);
              
                 setSqlExceptionMsg(e);
              
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAppend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlAppend");
			//{{user_implement_dev:<controlAppend>
                //---------------------------------------------------------------------
              
                struct.initialize();
                struct.setITEM_CD(_keyStruct.getITEM_CD());
                struct.setITEM_NAME(_keyStruct.getITEM_NAME());
                struct.setSTOCK_UNIT(_keyStruct.getSTOCK_UNIT());
// 2008/07/15 SYSCOM ���� ADD START
                struct.setMANHOUR_TYP(_keyStruct.getMANHOUR_TYP());
// 2008/07/15 SYSCOM ���� ADD END
              
				try{
					readStatus = INITIAL;
					// �R���{�{�b�N�X�f�[�^�iPROC_GRP_LT_UNIT�j�擾
					AA0030010Struct LT_UNIT_Struct = new AA0030010Struct();
					List LT_UNIT_List = entity.mSELECT_SYS_TYPE_VALUE.read(conn, LT_UNIT_Struct);
					if(null != LT_UNIT_List && LT_UNIT_List.size()>0){
						LT_UNIT_Struct = (AA0030010Struct)LT_UNIT_List.get(0);
						struct.setLT_UNIT_1(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_2(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_3(LT_UNIT_Struct.getLT_UNIT());
					}else{
						struct.setLT_UNIT_1(null);
						struct.setLT_UNIT_2(null);
						struct.setLT_UNIT_3(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// �G���[�������L�q���Ă��������B
					// 
				}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlAppend>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlAppend");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>
                //---------------------------------------------------------------------
				try{
					readStatus = INITIAL;
					// �R���{�{�b�N�X�f�[�^�iPROC_GRP_LT_UNIT�j�擾
					AA0030010Struct LT_UNIT_Struct = new AA0030010Struct();
					List LT_UNIT_List = entity.mSELECT_SYS_TYPE_VALUE.read(conn, LT_UNIT_Struct);
					if(null != LT_UNIT_List && LT_UNIT_List.size()>0){
						LT_UNIT_Struct = (AA0030010Struct)LT_UNIT_List.get(0);
						struct.setLT_UNIT_1(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_2(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_3(LT_UNIT_Struct.getLT_UNIT());
					}else{
						struct.setLT_UNIT_1(null);
						struct.setLT_UNIT_2(null);
						struct.setLT_UNIT_3(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// �G���[�������L�q���Ă��������B
					// 
				}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlModify>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlCopy");
			//{{user_implement_dev:<controlCopy>
                //---------------------------------------------------------------------
                struct.setPROC_CD(null);

				try{
					readStatus = INITIAL;
					// �R���{�{�b�N�X�f�[�^�iPROC_GRP_LT_UNIT�j�擾
					AA0030010Struct LT_UNIT_Struct = new AA0030010Struct();
					List LT_UNIT_List = entity.mSELECT_SYS_TYPE_VALUE.read(conn, LT_UNIT_Struct);
					if(null != LT_UNIT_List && LT_UNIT_List.size()>0){
						LT_UNIT_Struct = (AA0030010Struct)LT_UNIT_List.get(0);
						struct.setLT_UNIT_1(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_2(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_3(LT_UNIT_Struct.getLT_UNIT());
					}else{
						struct.setLT_UNIT_1(null);
						struct.setLT_UNIT_2(null);
						struct.setLT_UNIT_3(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// �G���[�������L�q���Ă��������B
					// 
				}
                //---------------------------------------------------------------------
              
                //}}user_implement_dev:<controlCopy>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlCopy");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlErace() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlErace");
			//{{user_implement_dev:<controlErace>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                List listMessage = new ArrayList();
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // �Ώۂ̌n����擾
                 AA0030010Struct deleteStruct = new AA0030010Struct(struct);
              
                 // �O���P���e�[�u���폜
                 int cnt1 = entity.mEraceM_SBCNT_UNIT_COST.delete(conn, deleteStruct);
              
                 // �O���P���w�b�_�e�[�u���폜
                 int cnt2 = entity.mEraceM_SBCNT_UNIT_COST_H.delete(conn, deleteStruct);
              
                 // ��ƌn��e�[�u���̑Ώۃf�[�^�`�F�b�N
                 checkTargetDataInM_PROC_GRP(deleteStruct, deleteStruct.getMODIFY_COUNT());
              
                 // �G���[���Ȃ��ꍇ�A�폜����
                 if(msgStruct.sizeError() <= 0)
                 {
                  // ��ƌn��e�[�u���폜
                  int cnt3 = entity.mEraceM_PROC_GRP.delete(conn, deleteStruct);
              
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
              
                  // ����
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // �폜�Ώۂ��Ȃ������ꍇ
                  if(cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0){
                   // �폜�������s�F�Ώۃf�[�^�����݂��܂���
                   listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                   
                  }
              
                  // �V�X�e���p�����[�^�iTIME_CTRL�j�擾
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //�c�a�X�V��`�F�b�N
                  if((struct.getTIME_CTRL()).equals("true")){
                      // �i�ڏ��擾
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP����BOM���擾
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // �Œ胊�[�h�^�C���`�F�b�N
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // �i�ڏ��擾
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // �Œ胊�[�h�^�C���`�F�b�N
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                 
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
                
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlErace>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlErace");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlEraceAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlEraceAll");
			//{{user_implement_dev:<controlEraceAll>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                List listMessage = new ArrayList();
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // �O���P���e�[�u���폜
                 int cnt1 = entity.mEraceAllM_SBCNT_UNIT_COST.delete(conn, _keyStruct);
              
                 // �O���P���w�b�_�e�[�u���폜
                 int cnt2 = entity.mEraceAllM_SBCNT_UNIT_COST_H.delete(conn, _keyStruct);
                 
                 // ��ƌn��e�[�u���̑ΏۑS�f�[�^�`�F�b�N
                 checkTargetAllDataInM_PROC_GRP(_keyStruct);
              
                 // �G���[���Ȃ��ꍇ�A�폜����
                 if(msgStruct.sizeError() <= 0)
                 {
                  // ��ƌn��e�[�u���폜
                  int cnt3 = entity.mEraceAllM_PROC_GRP.delete(conn, _keyStruct);
              
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
              
                  // ����
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // �폜�Ώۂ��Ȃ������ꍇ
                  if(cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0){
                   // �ꊇ�폜�������s�F�Ώۃf�[�^�����݂��܂���
                   listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                  }
              
                  // �V�X�e���p�����[�^�iTIME_CTRL�j�擾
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //�c�a�X�V��`�F�b�N
                  if((struct.getTIME_CTRL()).equals("true")){
                      // �i�ڏ��擾
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP����BOM���擾
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // �Œ胊�[�h�^�C���`�F�b�N
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // �i�ڏ��擾
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // �Œ胊�[�h�^�C���`�F�b�N
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
                
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlEraceAll>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlEraceAll");

		return;
	}

	/**
	 * �ԍ��ĐU�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlChange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlChange");
			//{{user_implement_dev:<controlChange>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                List listMessage = new ArrayList();
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // ��ƌn����̌n��ԍ���"10"���݂ōX�V
                 for(int i = 0, t = 10; i < _procedureList.size(); i++){
              
                  AA0030010Struct updateStruct = (AA0030010Struct)_procedureList.get(i);
              
                  // ����/�X�V�`�F�b�N
                  List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, updateStruct);
                  if(countList.size() <= 0){
                   // ��ƌn��ԍ��U���������s�F�Ώۃf�[�^�����݂��܂���
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                  }else{
                   String modify = ((AA0030010Struct)countList.get(0)).getMODIFY_COUNT();
                   if (updateStruct.getMODIFY_COUNT().equals(modify) == false){
                    // ��ƌn��ԍ��U���������s�F���̏����ɂ��f�[�^�������������Ă��܂�
                    listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                    listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                    listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                    setErrorMessage("ZZ01105", listMessage);
                   }
                  }
              
                  // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                  if(msgStruct.sizeError() <= 0){
                   // �n��ԍ��A�H��R�[�h�A���[�UID �ݒ�
                   updateStruct.setPROC_NO(Long.toString(t));
                   updateStruct.setPLANT_CD(struct.getPLANT_CD());
                   updateStruct.setsUser_ID(struct.getsUser_ID());
              
                   // �X�V
                   entity.mModifyM_PROC_GRP.update(conn, updateStruct);
                  }else{
                   break;
                  }
              
                  t = t + 10;
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0){
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
               
                  // ����
                  struct.copy(_keyStruct);
                  controlSelect();
                 }else{
                  // ���[���o�b�N
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlChange>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlChange");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                //------------------------------------------------------------------
              
                // ������
                setReadStatus(INITIAL);
                _keyStruct = new AA0030010Struct();
                struct.clear();
              
                // ��ƌn���񃊃X�g�N���A
                _procedureList.clear();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //---------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // ���ږ����͎��̃f�t�H���g�l�ݒ�
                 checkStruct(struct);
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
              
                 boolean result = true;			// �`�F�b�N���ʊi�[
              
                 List itemList = entity.mSelectM_ITEM.read(conn, struct);
                 // �i�ڏ��ݒ�
                 setItemInfo(struct, itemList);
                 if(itemList.size() <= 0){
                  // �o�^�������s�F�i�ڏ��̎擾�Ɏ��s���܂���
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  
                  setErrorMessage("AA01002", Message);
                 }else{
                  // ��ƌn���� �d���`�F�b�N
                  result = entity.mcheckM_PROC_GRP.check(conn, struct);
                  if(result == true){
                   // �o�^�������s�F�w��L�[�̃f�[�^�����łɑ��݂��܂�
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ01102", listMessage);
                  }
              
                  // ��ƌn��ԍ� �d���`�F�b�N
                  result = entity.mcheckM_PROC_GRP_proc_no.check(conn, struct);
                  if(result == true){
                   // �o�^�������s�F��ƌn��ԍ����d�����Ă��܂�
                   listMessage.clear();
                   
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("AA00065", listMessage);
                  }
              
                  // ��Ƌ�R�[�h�`�F�b�N
                  if(struct.getWS_CD() != null && "".equals(struct.getWS_CD()) == false){
                   result = entity.mcheckM_WS.check(conn, struct);
                   if(result == false){
                    // �o�^�������s�F�w�肵����Ƌ�R�[�h�͖��o�^�ł�
                    Message = "M_WS.WS_CD:" + struct.getWS_CD();
                    
                    setErrorMessage("AA01003", Message);
                   }else{
                    result = entity.mcheckM_WS_plant_cd.check(conn, struct);
                    if(result == false){
                     // �o�^�������s�F���H��̍�Ƌ�R�[�h�͎w��ł��܂���
                     listMessage.clear();
                     
                     listMessage.add("M_WS.PLANT_CD:" + struct.getPLANT_CD());
                     listMessage.add("M_WS.PROC_CD:" + struct.getPROC_CD());
              
                     setErrorMessage("AA01005", listMessage);
                    }
                   }
                  }
               
                  // �����R�[�h�`�F�b�N
                  if(struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false){
                   result = entity.mcheckM_VEND_CTRL.check(conn, struct);
                   if(result == false){
                    // �o�^�������s�F�w�肵�������R�[�h�͖��o�^�ł�", struct.getsUser_ID());
                    Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                    
                    setErrorMessage("AA01004", Message);
                   }
                  }
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  AA0030010Struct itemStruct = (AA0030010Struct)itemList.get(0);
              
                  // ��ЃR�[�h�擾
                  List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                  if(companyList.size() > 0)
                   struct.setCOMPANY_CD(((AA0030010Struct)companyList.get(0)).getCOMPANY_CD());
              
                  // ��ƌn���ᕪ���b�g�T�C�Y�`�F�b�N
                  boolean resultCeil = false;
                  if(itemStruct.getUNIT_QTY_TYP().intValue() == 1){
                   if(Calculate.isNumeric(struct.getPROP_LOT_SIZE()) == true){
                    resultCeil = true;
                    struct.setPROP_LOT_SIZE(Calculate.ceil(struct.getPROP_LOT_SIZE(), 0));
                   }
                  }
              
                  // �ǉ�
                  entity.mAppendM_PROC_GRP.create(conn, struct);
                  if(resultCeil == true){
                   // �o�^�������s�F�����Ǘ��i�ڂ̂��ߔ�ᕪ���b�g�T�C�Y�̏����_�ȉ��͐؂�グ���ēo�^���܂���
                   setInfoMessage("AA60002", "");
                  }
              
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
              
              
                  // ����
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // �V�X�e���p�����[�^�iTIME_CTRL�j�擾
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //�c�a�X�V��`�F�b�N
                  if((struct.getTIME_CTRL()).equals("true")){
                      // �i�ڏ��擾
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP����BOM���擾
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // �Œ胊�[�h�^�C���`�F�b�N
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // �i�ڏ��擾
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // �Œ胊�[�h�^�C���`�F�b�N
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }

                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //---------------------------------------------------------------------
                boolean transFlg = false;
                String inProcNo = null;
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // ���ږ����͎��̃f�t�H���g�l�ݒ�
                 checkStruct(struct);
              
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
              
                 boolean result = true;			// �`�F�b�N���ʊi�[
              
                 List itemList = entity.mSelectM_ITEM.read(conn, struct);
                 // �i�ڏ��ݒ�
                 setItemInfo(struct, itemList);
                 if(itemList.size() <= 0){
                  // �X�V�������s�F�i�ڏ��̎擾�Ɏ��s���܂���
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  
                  setErrorMessage("AA01002", Message);
                 }else{
                  // ����/�X�V�`�F�b�N
                  List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, struct);
                  if(countList.size() <= 0){
                   // �X�V�������s�F�Ώۃf�[�^�����݂��܂���
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                  }else{
                   String modify = ((AA0030010Struct)countList.get(0)).getMODIFY_COUNT();
                   if(struct.getMODIFY_COUNT().equals(modify) == false){
                    // �X�V�������s�F���̏����ɂ��f�[�^�������������Ă��܂�", struct.getsUser_ID());
                    listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                    listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                    listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                    setErrorMessage("ZZ01105", listMessage);
                   }
                  }
              
                  // ��ƌn��ԍ� �d���`�F�b�N
                  AA0030010Struct buffStruct = new AA0030010Struct(struct);
              
                  // �������X�g���C���O�̍�ƌn��ԍ����擾
                  for(int i=0; i<_procedureList.size(); i++)
                  {
                   if(struct.getPROC_CD().equals(((AA0030010Struct)_procedureList.get(i)).getPROC_CD())) {
                    inProcNo = ((AA0030010Struct)_procedureList.get(i)).getPROC_NO();
                    break;
                   }
                   
                  }
              
                  // �C����̍�ƌn��ԍ��̎擾
                  Integer procNo = IntegerConverter.Convert(struct.getPROC_NO());
                 
                  if((Integer.valueOf(inProcNo)).intValue() != procNo.intValue()){
                   result = entity.mcheckM_PROC_GRP_proc_no.check(conn, struct);
                   if(result == true){
                    // �X�V�������s�F��ƌn��ԍ����d�����Ă��܂�", struct.getsUser_ID());
                    listMessage.clear();
                   
                    listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                    listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                    listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                    setErrorMessage("AA00065", listMessage);
                   }
                  }
              
                  // ��Ƌ�R�[�h�`�F�b�N
                  if(struct.getWS_CD() != null && "".equals(struct.getWS_CD()) == false){
                   result = entity.mcheckM_WS.check(conn, struct);
                   if(result == false){
                    // �X�V�������s�F�w�肵����Ƌ�R�[�h�͖��o�^�ł�
                    Message = "M_WS.PROC_CD:" + struct.getPROC_CD();
                  
                    setErrorMessage("AA01003", Message);
                   }else{
                    result = entity.mcheckM_WS_plant_cd.check(conn, struct);
                    if(result == false){
                     // �X�V�������s�F���H��̍�Ƌ�R�[�h�͎w��ł��܂���
                     listMessage.clear();
                    
                     listMessage.add("M_WS.PLANT_CD:" + struct.getPLANT_CD());
                     listMessage.add("M_WS.PROC_CD:" + struct.getPROC_CD());
              
                     setErrorMessage("AA01005", listMessage);
                    }
                   }
                  }
               
                  // �����R�[�h�`�F�b�N
                  if(struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false){
                   result = entity.mcheckM_VEND_CTRL.check(conn, struct);
                   if(result == false){
                    // �X�V�������s�F�w�肵�������R�[�h�͖��o�^�ł�
                    Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                  
                    setErrorMessage("AA01004", Message);
                   }
                  }
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  AA0030010Struct itemStruct = (AA0030010Struct)itemList.get(0);
               
                  // ��ЃR�[�h�擾
                  List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                  if(companyList.size() > 0)
                   struct.setCOMPANY_CD(((AA0030010Struct)companyList.get(0)).getCOMPANY_CD());
              
                  // ��ƌn���ᕪ���b�g�T�C�Y�`�F�b�N
                  boolean resultCeil = false;
                  if(itemStruct.getUNIT_QTY_TYP().intValue() == 1){
                   if(Calculate.isNumeric(struct.getPROP_LOT_SIZE()) == true){
                    resultCeil = true;
                    struct.setPROP_LOT_SIZE(Calculate.ceil(struct.getPROP_LOT_SIZE(), 0));
                   }
                  }
              
                  // �X�V
                  entity.mModifyM_PROC_GRP.update(conn, struct);
                  if(resultCeil == true){
                   // �o�^�������s�F�����Ǘ��i�ڂ̂��ߔ�ᕪ���b�g�T�C�Y�̏����_�ȉ��͐؂�グ���ēo�^���܂���", struct.getsUser_ID());
                   setInfoMessage("AA60002", "");
                  }
              
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
              
                  // ����
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // �V�X�e���p�����[�^�iTIME_CTRL�j�擾
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //�c�a�X�V��`�F�b�N
                  if((struct.getTIME_CTRL()).equals("true")){
                      // �i�ڏ��擾
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP����BOM���擾
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // �Œ胊�[�h�^�C���`�F�b�N
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // �i�ڏ��擾
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // �Œ胊�[�h�^�C���`�F�b�N
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }
              
                 }else{
                  // ���[���o�b�N
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //------------------------------------------------------------------
              
                // �L�[�R�s�[
                struct.copy(_keyStruct);
                // �ŐV�̏�Ԃ�ǂݍ���
                controlSelect();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //------------------------------------------------------------------
                // ���[�U��`������(�R���{�f�[�^�̎擾)
                usersInitialize();
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------
              
                // ���[�U��`������(�R���{�f�[�^�̎擾)
                usersInitialize();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Append") ) {
				controlAppend();
			} else if( button.equals("Modify") ) {
				controlModify();
			} else if( button.equals("Copy") ) {
				controlCopy();
			} else if( button.equals("Erace") ) {
				controlErace();
			} else if( button.equals("EraceAll") ) {
				controlEraceAll();
			} else if( button.equals("Change") ) {
				controlChange();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 //------------------------------------------------------------------
                 // �R���{�{�b�N�X�̃f�[�^�ݒ�
                 struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
                 struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
                 struct.setList_OUTSIDE_TYP_val(_OUTSIDE_TYP.getValList());
                 struct.setList_OUTSIDE_TYP_name(_OUTSIDE_TYP.getExplanList());
                 struct.setList_OPR_RSLT_TYP_val(_OPR_RSLT_TYP.getValList());
                 struct.setList_OPR_RSLT_TYP_name(_OPR_RSLT_TYP.getExplanList());
                 struct.setList_ACPT_INSPC_TYP_val(_ACPT_INSPC_TYP.getValList());
                 struct.setList_ACPT_INSPC_TYP_name(_ACPT_INSPC_TYP.getExplanList());
// 2008/07/15 SYSCOM ���� ADD START
                 struct.setList_MANHOUR_TYP_val(_MANHOUR_TYP.getValList());
                 struct.setList_MANHOUR_TYP_name(_MANHOUR_TYP.getExplanList());
// 2008/07/15 SYSCOM ���� ADD END

                } catch(AlarmMessageException ame){
                 //ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 //throw ee;
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
//			throw new FoundationException("AA0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0030010Entity entity;
	protected AA0030010Struct struct;
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

		entity = new AA0030010Entity();
		struct = new AA0030010Struct();

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
	 * AA0030010�N���X�̕W���R���X�g���N�^
	 */
	public AA0030010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //------------------------------------------------------------------
                // 2003/07/16 Y.Inada
                //------------------------------------------------------------------
                
                list = new ArrayList(0);
                
                //------------------------------------------------------------------
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
				AA0030010Struct key = (AA0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name") && key.getACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_name", key.getACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val") && key.getACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_val", key.getACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MRP_ODR_NAME") && key.getITEM_MRP_ODR_NAME() != null) {
					msgKey.setKeyValue("ITEM_MRP_ODR_NAME", key.getITEM_MRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_NAME") && key.getITEM_OUTSIDE_NAME() != null) {
					msgKey.setKeyValue("ITEM_OUTSIDE_NAME", key.getITEM_OUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_OPR_RSLT_NAME") && key.getITEM_OPR_RSLT_NAME() != null) {
					msgKey.setKeyValue("ITEM_OPR_RSLT_NAME", key.getITEM_OPR_RSLT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_NAME") && key.getACPT_INSPC_NAME() != null) {
					msgKey.setKeyValue("ACPT_INSPC_NAME", key.getACPT_INSPC_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT_1") && key.getLT_UNIT_1() != null) {
					msgKey.setKeyValue("LT_UNIT_1", key.getLT_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT_2") && key.getLT_UNIT_2() != null) {
					msgKey.setKeyValue("LT_UNIT_2", key.getLT_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT_3") && key.getLT_UNIT_3() != null) {
					msgKey.setKeyValue("LT_UNIT_3", key.getLT_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MANHOUR_NAME") && key.getITEM_MANHOUR_NAME() != null) {
					msgKey.setKeyValue("ITEM_MANHOUR_NAME", key.getITEM_MANHOUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name") && key.getOPR_RSLT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_name", key.getOPR_RSLT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val") && key.getOPR_RSLT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_val", key.getOPR_RSLT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name") && key.getMANHOUR_TYP_name() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_name", key.getMANHOUR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val") && key.getMANHOUR_TYP_val() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_val", key.getMANHOUR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("SPOIL") && key.getSPOIL() != null) {
					msgKey.setKeyValue("SPOIL", key.getSPOIL());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STANDARD_COST") && key.getSTANDARD_COST() != null) {
					msgKey.setKeyValue("STANDARD_COST", key.getSTANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
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
				if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP") && key.getITEM_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("ITEM_OUTSIDE_TYP", key.getITEM_OUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT") && key.getITEM_FIXED_LT() != null) {
					msgKey.setKeyValue("ITEM_FIXED_LT", key.getITEM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LT") && key.getITEM_PROP_LT() != null) {
					msgKey.setKeyValue("ITEM_PROP_LT", key.getITEM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE") && key.getITEM_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("ITEM_PROP_LOT_SIZE", key.getITEM_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT") && key.getITEM_ISSUE_LT() != null) {
					msgKey.setKeyValue("ITEM_ISSUE_LT", key.getITEM_ISSUE_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT") && key.getITEM_SAFETY_LT() != null) {
					msgKey.setKeyValue("ITEM_SAFETY_LT", key.getITEM_SAFETY_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT") && key.getLT_UNIT() != null) {
					msgKey.setKeyValue("LT_UNIT", key.getLT_UNIT());
				}
				if(msgKeyType.containsKeyColumn("BOM_ITEM_CD") && key.getBOM_ITEM_CD() != null) {
					msgKey.setKeyValue("BOM_ITEM_CD", key.getBOM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("BOM_FIXED_LT") && key.getBOM_FIXED_LT() != null) {
					msgKey.setKeyValue("BOM_FIXED_LT", key.getBOM_FIXED_LT().toString());
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
					AA0030010Struct key = new AA0030010Struct();
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name")) {
						key.setACPT_INSPC_TYP_name(msgKey.getKeyValue("ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val")) {
						key.setACPT_INSPC_TYP_val(msgKey.getKeyValue("ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MRP_ODR_NAME")) {
						key.setITEM_MRP_ODR_NAME(msgKey.getKeyValue("ITEM_MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_NAME")) {
						key.setITEM_OUTSIDE_NAME(msgKey.getKeyValue("ITEM_OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_OPR_RSLT_NAME")) {
						key.setITEM_OPR_RSLT_NAME(msgKey.getKeyValue("ITEM_OPR_RSLT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_NAME")) {
						key.setACPT_INSPC_NAME(msgKey.getKeyValue("ACPT_INSPC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT_1")) {
						key.setLT_UNIT_1(msgKey.getKeyValue("LT_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT_2")) {
						key.setLT_UNIT_2(msgKey.getKeyValue("LT_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT_3")) {
						key.setLT_UNIT_3(msgKey.getKeyValue("LT_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MANHOUR_NAME")) {
						key.setITEM_MANHOUR_NAME(msgKey.getKeyValue("ITEM_MANHOUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name")) {
						key.setOPR_RSLT_TYP_name(msgKey.getKeyValue("OPR_RSLT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val")) {
						key.setOPR_RSLT_TYP_val(msgKey.getKeyValue("OPR_RSLT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name")) {
						key.setMANHOUR_TYP_name(msgKey.getKeyValue("MANHOUR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val")) {
						key.setMANHOUR_TYP_val(msgKey.getKeyValue("MANHOUR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("SPOIL")) {
						key.setSPOIL(msgKey.getKeyValue("SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(new Integer(msgKey.getKeyValue("ACPT_INSPC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STANDARD_COST")) {
						key.setSTANDARD_COST(msgKey.getKeyValue("STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
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
					if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP")) {
						key.setITEM_OUTSIDE_TYP(new Integer(msgKey.getKeyValue("ITEM_OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(new Integer(msgKey.getKeyValue("OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT")) {
						key.setITEM_FIXED_LT(new Long(msgKey.getKeyValue("ITEM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LT")) {
						key.setITEM_PROP_LT(new Long(msgKey.getKeyValue("ITEM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE")) {
						key.setITEM_PROP_LOT_SIZE(msgKey.getKeyValue("ITEM_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT")) {
						key.setITEM_ISSUE_LT(new Long(msgKey.getKeyValue("ITEM_ISSUE_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT")) {
						key.setITEM_SAFETY_LT(new Long(msgKey.getKeyValue("ITEM_SAFETY_LT")));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(new Integer(msgKey.getKeyValue("MANHOUR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT")) {
						key.setLT_UNIT(msgKey.getKeyValue("LT_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("BOM_ITEM_CD")) {
						key.setBOM_ITEM_CD(msgKey.getKeyValue("BOM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("BOM_FIXED_LT")) {
						key.setBOM_FIXED_LT(new Long(msgKey.getKeyValue("BOM_FIXED_LT")));
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
