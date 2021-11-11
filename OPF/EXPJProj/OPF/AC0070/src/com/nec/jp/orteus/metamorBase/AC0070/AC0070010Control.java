/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0070/src/com/nec/jp/orteus/metamorBase/AC0070/AC0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0070;

import com.nec.jp.orteus.metamorBase.AC0070.*;
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
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0070010Control
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
       
        public AC0070010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
       //------------------------------------------------------------------------------
       
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
        //-------------------------------------------------------------------------
        /** �L�[���ێ��ׂ̈�Struct */
        private AC0070010Struct _keyStruct = new AC0070010Struct();
       
        /** �L�[���Struct�̎擾 */
        public AC0070010Struct getKeyStruct(){ return _keyStruct; }
        
        /** �L�[���Struct�̐ݒ� */
        public void setKeyStruct(AC0070010Struct struct){ _keyStruct.copy(struct); }
       
       
        //-------------------------------------------------------------------------
       
        /**
         * ���b�Z�[�W�擾 
         * @@return ���b�Z�[�W
         */
        public MessageStruct getMessage()
        {
         return msgStruct;
        }
       
        /**
         * ���b�Z�[�W�ݒ�
         * @@param ���b�Z�[�W
         */
        public void setMessage(MessageStruct msg)
        {
         msgStruct = msg;
        }
       
        //-------------------------------------------------------------------------
       
        /** ���O��敪 **/
        ComboStruct _w_OUTSIDE_TYP = new ComboStruct();
       
        /** ���O��敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setw_OUTSIDE_TYP_comb(ComboStruct combo){ _w_OUTSIDE_TYP = combo; }
       
        /** ���O��敪�擾
         * @return ���O��敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getw_OUTSIDE_TYP_comb(){ return _w_OUTSIDE_TYP; }
       
       
        /** �i�ڎ�z�敪 **/
        ComboStruct _w_MRP_ODR_TYP = new ComboStruct();
       
        /** �i�ڎ�z�敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setw_MRP_ODR_TYP_comb(ComboStruct combo){ _w_MRP_ODR_TYP = combo; }
       
        /** �i�ڎ�z�敪�擾
         * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getw_MRP_ODR_TYP_comb(){ return _w_MRP_ODR_TYP; }
       
       
        /** �݌ɐ��ʒP�ʋ敪 **/
        ComboStruct _w_UNIT_QTY_TYP = new ComboStruct();
       
        /** �݌ɐ��ʒP�ʋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setw_UNIT_QTY_TYP_comb(ComboStruct combo){ _w_UNIT_QTY_TYP = combo; }
       
        /** �݌ɐ��ʒP�ʋ敪�擾
         * @return �݌ɐ��ʒP�ʋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getw_UNIT_QTY_TYP_comb(){ return _w_UNIT_QTY_TYP; }
       
       
        /** �I�[�_��ԋ敪 **/
        ComboStruct _w_ODR_STS_TYP = new ComboStruct();
       
        /** �I�[�_��ԋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setw_ODR_STS_TYP_comb(ComboStruct combo){ _w_ODR_STS_TYP = combo; }
       
        /** �I�[�_��ԋ敪�擾
         * @return �I�[�_��ԋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getw_ODR_STS_TYP_comb(){ return _w_ODR_STS_TYP; }
       
       
        /** �f�}���h��ԋ敪 **/
        ComboStruct _w_EXTERNAL_PLAN_DEL_FLG = new ComboStruct();
       
        /** �f�}���h��ԋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
        */
        public void setw_EXTERNAL_PLAN_DEL_FLG_comb(ComboStruct combo){ _w_EXTERNAL_PLAN_DEL_FLG = combo; }
       
        /** �f�}���h��ԋ敪�擾
         * @return �f�}���h��ԋ敪�̃R���{�{�b�N�X�f�[�^
        */
        public ComboStruct getw_EXTERNAL_PLAN_DEL_FLG_comb(){ return _w_EXTERNAL_PLAN_DEL_FLG; }
       
       
        /**
         * �R���{�{�b�N�X�̒��g���擾���܂��B
         *
         * @param data �f�[�^�̔�
         */
         private void setComboData(AC0070010Struct data)
         {
          ComboBox controller = new ComboBox(conn, sysUSER_CD);
         try{
          //�R���{�f�[�^�̎擾
          ComboStruct w_OUTSIDE_TYP_comb = controller.getData("OUTSIDE_TYP");
          ComboStruct w_MRP_ODR_TYP_comb = controller.getData("MRP_ODR_TYP");
          ComboStruct w_UNIT_QTY_TYP_comb = controller.getData("UNIT_QTY_TYP");
          ComboStruct w_ODR_STS_TYP_comb = controller.getData("ODR_STS_TYP");
          ComboStruct w_EXTERNAL_PLAN_DEL_FLG_comb = controller.getData("EXTERNAL_PLAN_DEL_FLG");
          
          controller.setConnection(null);
       
          //�����Ɏ擾�f�[�^�ݒ�
          setw_OUTSIDE_TYP_comb(w_OUTSIDE_TYP_comb);
          setw_MRP_ODR_TYP_comb(w_MRP_ODR_TYP_comb);
          setw_UNIT_QTY_TYP_comb(w_UNIT_QTY_TYP_comb);
          setw_ODR_STS_TYP_comb(w_ODR_STS_TYP_comb);
          setw_EXTERNAL_PLAN_DEL_FLG_comb(w_EXTERNAL_PLAN_DEL_FLG_comb);
       
       
         }catch(SQLException e) {
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
         }catch(ComboException e){
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
         }
        }
       
        //-------------------------------------------------------------------------
        /**
         * �O���I�[�_�Q�Ƃ̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����
         */
        private void setTypeValueAboutProcGroup(AC0070010Struct s)
        {
         s.setOUTSIDE_NAME(getTypeName(_w_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setMRP_ODR_NAME(getTypeName(_w_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_w_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
         s.setODR_STS_NAME(getTypeName(_w_ODR_STS_TYP,s.getODR_STS_TYP()));
         s.setEXTERNAL_PLAN_DEL_NAME(getTypeName(_w_EXTERNAL_PLAN_DEL_FLG,s.getEXTERNAL_PLAN_DEL_FLG()));
        }
         
        //-------------------------------------------------------------------------
        /**
         * �敪���擾
         * @param comboStruct �敪��񃊃X�g
         * @param intType �敪�R�[�h
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
         
        //-------------------------------------------------------------------------
         
        /** ���[�U��`�̏������σt���O */
        private boolean _usersIntialized = false;
       
        /**
         * ���[�U��` ����������
         */
        private void usersInitialize()
        {
         try{
          // ���[�h�ݒ�
          setReadStatus(INITIAL);
       
          if(_usersIntialized) return;
       
          // �R���{�f�[�^�̎擾
          setComboData(struct);
       
          _usersIntialized = true;
          return ;
       
         }catch(AlarmMessageException msg){
          throw msg;
       
         }catch(Exception e){
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
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
         

       //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                    //------------------------------------------------------------------
                  
                    String Message = "";
                    setReadStatus(INITIAL);
                  
                    try {
                  
                     // ���X�g�N���A
                     if(list != null){
                      list.clear();
                     }

                     // �ϐ���`
                     AC0070010Struct aStruct = null;
                     ScreenParam sp = new ScreenParam(this.getClass());
                     int maxLine = sp.getMaxLine(conn,10);
                     if(maxLine != 0) {
         				struct.setROW_COUNT(String.valueOf(maxLine));
         			} else {
         				struct.setROW_COUNT(null);
         			}
                     list = entity.mEXTERNAL_ORDER_REFCnt.read(conn, struct);
                     long rowCount = Long.parseLong(((AC0070010Struct)list.get(0)).getl_COUNT());
                     // ��������0���̏ꍇ
                     if(rowCount == 0){
                         // �Ǎ��������s�F�������ʂ�0���ł�
                         Message = "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + struct.getw_PLAN_CD();
                         setErrorMessage("ZZ06001", Message);
                         if(list != null && list.size() > 0){
                        	list.clear(); 
                         }
                         return;
                        }
                   //�\���ő�s����������
                     if(maxLine != 0 && (rowCount ==maxLine+1)){
                    	 if(list != null && list.size() > 0){
                     	    this.list.clear(); 
                         }
                         // ���[�h�ݒ�
                         setReadStatus(TOO_MANY);
                         ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                         msgStruct.addError( emsg );
                         sysLog.warning(emsg, getsysUSER_CD());
                         emsg = new ExpjMessage( "ZZ01006", "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + struct.getw_PLAN_CD() );
                         msgStruct.addError( emsg );
                         sysLog.warning(emsg, getsysUSER_CD());
                         return;
                     }    
                     // �f�[�^�Ǎ�
                     list = entity.mEXTERNAL_ORDER_REF.read(conn, struct);
                     for(int i=0; i<list.size(); i++){
                        // �R���{�{�b�N�X�̃f�[�^�ݒ�
                        setTypeValueAboutProcGroup((AC0070010Struct)(list.get(i)));
                        aStruct = (AC0070010Struct)list.get(i);	
                        aStruct.setODR_START_DATE(aStruct.getODR_START_DATE());
                        aStruct.setPRD_START_DATE(aStruct.getPRD_START_DATE());
                        aStruct.setPRD_DUE_DATE(aStruct.getPRD_DUE_DATE());
                       }
                       // ���[�h�ݒ�
                       setReadStatus(NORMAL);      
                    } catch(SQLException e) {
                     setSqlExceptionMsg(e);
                  
                    }
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
              
                // ���X�g�N���A
                if(list != null){
                 list.clear();
                }
                else{
                 list = new ArrayList(0);
                }
              
                // ������
                struct.clear();
                _keyStruct = new AC0070010Struct();
              
                // ���[�h�ݒ�
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------
              
                try{
                 // ���[�U��`������
                 usersInitialize();
              
                }catch(AlarmMessageException msg){
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(msg, emsg);
                 
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AC0070010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0070010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0070010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0070010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0070010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0070010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0070010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0070010Entity entity;
	protected AC0070010Struct struct;
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

		entity = new AC0070010Entity();
		struct = new AC0070010Struct();

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
	 * AC0070010�N���X�̕W���R���X�g���N�^
	 */
	public AC0070010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AC0070010Struct key = (AC0070010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ODR_STS_NAME") && key.getODR_STS_NAME() != null) {
					msgKey.setKeyValue("ODR_STS_NAME", key.getODR_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_NAME") && key.getEXTERNAL_PLAN_DEL_NAME() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_DEL_NAME", key.getEXTERNAL_PLAN_DEL_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME") && key.getUNIT_QTY_NAME() != null) {
					msgKey.setKeyValue("UNIT_QTY_NAME", key.getUNIT_QTY_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLAN_CD") && key.getw_PLAN_CD() != null) {
					msgKey.setKeyValue("w_PLAN_CD", key.getw_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_val") && key.getw_OUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP_val", key.getw_OUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_name") && key.getw_OUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP_name", key.getw_OUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_val") && key.getw_MRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP_val", key.getw_MRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_name") && key.getw_MRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP_name", key.getw_MRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_val") && key.getw_UNIT_QTY_TYP_val() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP_val", key.getw_UNIT_QTY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_name") && key.getw_UNIT_QTY_TYP_name() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP_name", key.getw_UNIT_QTY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_val") && key.getw_ODR_STS_TYP_val() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP_val", key.getw_ODR_STS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_name") && key.getw_ODR_STS_TYP_name() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP_name", key.getw_ODR_STS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_val") && key.getw_EXTERNAL_PLAN_DEL_FLG_val() != null) {
					msgKey.setKeyValue("w_EXTERNAL_PLAN_DEL_FLG_val", key.getw_EXTERNAL_PLAN_DEL_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_name") && key.getw_EXTERNAL_PLAN_DEL_FLG_name() != null) {
					msgKey.setKeyValue("w_EXTERNAL_PLAN_DEL_FLG_name", key.getw_EXTERNAL_PLAN_DEL_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_LEVEL_NO") && key.getEXTERNAL_LEVEL_NO() != null) {
					msgKey.setKeyValue("EXTERNAL_LEVEL_NO", key.getEXTERNAL_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG") && key.getEXTERNAL_PLAN_DEL_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_DEL_FLG", key.getEXTERNAL_PLAN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					AC0070010Struct key = new AC0070010Struct();
					if(msgKeyType.containsKeyColumn("ODR_STS_NAME")) {
						key.setODR_STS_NAME(msgKey.getKeyValue("ODR_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_NAME")) {
						key.setEXTERNAL_PLAN_DEL_NAME(msgKey.getKeyValue("EXTERNAL_PLAN_DEL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME")) {
						key.setUNIT_QTY_NAME(msgKey.getKeyValue("UNIT_QTY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLAN_CD")) {
						key.setw_PLAN_CD(msgKey.getKeyValue("w_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_val")) {
						key.setw_OUTSIDE_TYP_val(msgKey.getKeyValue("w_OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_name")) {
						key.setw_OUTSIDE_TYP_name(msgKey.getKeyValue("w_OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_val")) {
						key.setw_MRP_ODR_TYP_val(msgKey.getKeyValue("w_MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_name")) {
						key.setw_MRP_ODR_TYP_name(msgKey.getKeyValue("w_MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_val")) {
						key.setw_UNIT_QTY_TYP_val(msgKey.getKeyValue("w_UNIT_QTY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_name")) {
						key.setw_UNIT_QTY_TYP_name(msgKey.getKeyValue("w_UNIT_QTY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_val")) {
						key.setw_ODR_STS_TYP_val(msgKey.getKeyValue("w_ODR_STS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_name")) {
						key.setw_ODR_STS_TYP_name(msgKey.getKeyValue("w_ODR_STS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_val")) {
						key.setw_EXTERNAL_PLAN_DEL_FLG_val(msgKey.getKeyValue("w_EXTERNAL_PLAN_DEL_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_name")) {
						key.setw_EXTERNAL_PLAN_DEL_FLG_name(msgKey.getKeyValue("w_EXTERNAL_PLAN_DEL_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_LEVEL_NO")) {
						key.setEXTERNAL_LEVEL_NO(msgKey.getKeyValue("EXTERNAL_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG")) {
						key.setEXTERNAL_PLAN_DEL_FLG(msgKey.getKeyValue("EXTERNAL_PLAN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
