/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0010/src/com/nec/jp/orteus/metamorBase/AL0010/AL0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0010;

import com.nec.jp.orteus.metamorBase.AL0010.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AL0010010Control
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
        protected List list;                                            // ���ʃ��X�g�̃C���X�^���X
        public List getList() { return this.list; }                     // ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
        public int getListsize() {                                      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public AL0010010Struct getStruct() { return this.struct; }  // Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        /**
         * Struct�̒l���N���A���܂��B
         */
        private void clearStruct()
        {
         struct.seth_PLANT_CD(getsysPLANT_CD());
         struct.setNECK_PROC_CD(null);
         struct.setNECK_PROC_NAME(null);
         struct.setNECK_PROC_CAPA("0.0");
         struct.setNECK_PROC_CAPA_UNIT(null);
         struct.setNECK_PROC_CAPA_RATE("0");
         struct.setNECK_PROC_SHIFT("0.0");
         struct.seth_NECK_PROC_CD(null);
         struct.seth_MODIFY_COUNT(null);
        }
       
        /**
         * Struct�̒l���R�s�[���܂��B
         */
        private void copyStruct(AL0010010Struct toStruct, AL0010010Struct fromStruct)
        {
         toStruct.setNECK_PROC_NAME(fromStruct.getNECK_PROC_NAME());
         toStruct.setNECK_PROC_CAPA(fromStruct.getNECK_PROC_CAPA());
         toStruct.setNECK_PROC_CAPA_UNIT(fromStruct.getNECK_PROC_CAPA_UNIT());
         toStruct.setNECK_PROC_CAPA_RATE(fromStruct.getNECK_PROC_CAPA_RATE());
         toStruct.setNECK_PROC_SHIFT(fromStruct.getNECK_PROC_SHIFT());
         toStruct.seth_MODIFY_COUNT(fromStruct.geth_MODIFY_COUNT());
        }
       
        /**
         * �G���[���b�Z�[�W�ƌ����L�[�����o�͂��܂��B
         *
         * @param messageCode
         * @param tableName
         */
        // ���L�[���ڂ́A�H��R�[�h�Ɛ���H���R�[�h�ɌŒ�ł���B
        private void putErrorMessage(String messageCode, String tableName)
        {
         ExpjMessage emsg = new ExpjMessage(messageCode);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage("ZZ01006", tableName + ".PLANT_CD,NECK_PROC_CD:"
           + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                try {
                 // �Ǎ���ԁi������ԁj��ݒ�
                 setReadStatus(INITIAL);
              
                 // �Ǎ��L�[���c���āAStruct���N���A
                 String neckProcCd = struct.getNECK_PROC_CD();
                 clearStruct();
                 struct.setNECK_PROC_CD(neckProcCd);
              
                 // ���X�g����
                 List workList = entity.mSelect.read(conn, struct);
              
                 // �u�H��R�[�h�v+�u�����R�[�h�v���A�m�����n�ɑ��݂��Ȃ��Ƃ�
                 if (workList.isEmpty()) {
                  // �Ǎ���ԁi�O���Ǎ��j��ݒ�
                  setReadStatus(NOT_FOUND);
                  // �f�[�^�����݂��Ȃ�
                  putErrorMessage("ZZ06001", "M_RESOURCE");
                  return;
                 }
              
                 copyStruct(struct, (AL0010010Struct)workList.get(0));
              
                 // ����H���R�[�h��ޔ�
                 struct.seth_NECK_PROC_CD(struct.getNECK_PROC_CD());
              
                 // �Ǎ���ԁi�Ǎ������j��ݒ�
                 setReadStatus(NORMAL);
              
                } catch (SQLException se) {
                 // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                 setReadStatus(ERROR);
                 // �G���[�F�T�[�o�[�G���[
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
                   + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD());
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 // �G���[�F�T�[�o�[�G���[
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                try {
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
              
                 List workList = entity.mSelect.read(conn, struct);
                 if (workList.size() > 0) {
                  // �u�H��R�[�h�v+�u�����R�[�h�v���A�m�����n�Ɋ��ɑ��݂����ꍇ
                  putErrorMessage("AL20010", "M_RESOURCE");
                  return;
                 }
              
                 int dummyRet = entity.mInsertM_RESOURCE.create(conn, struct);
              
                 // �f�[�^���m��
                 conn.commit();
              
                 // ������
                 controlSelect();
              
                } catch (SQLException se) {
                 // �G���[�F�T�[�o�[�G���[
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
                   + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD());
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 // �G���[�F�T�[�o�[�G���[
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                try {
                 // �g�����U�N�V�������J�n
                 conn.beginTransWeb();
              
                 // �f�[�^�X�V�ۃ`�F�b�N
                 List workList = entity.mUpdateM_RESOURCE.read(conn, struct);
                 if (workList == null || workList.isEmpty()) {
                  // [����]."�X�V��"���擾�ł��Ȃ������ꍇ
                  putErrorMessage("ZZ01105", "M_RESOURCE");
                  return;
                 }
                 AL0010010Struct workStruct = (AL0010010Struct)workList.get(0);
                 // [����]."�X�V��"���Z�[�u�X�V��(hidden�g�p)�̏ꍇ
                 if (workStruct.geth_MODIFY_COUNT().equals(struct.geth_MODIFY_COUNT()) == false) {
                  putErrorMessage("ZZ01105", "M_RESOURCE");
                  return;
                 }
              
                 int dummyRet = entity.mUpdateM_RESOURCE.update(conn, struct);
              
                 // �f�[�^���m��
                 conn.commit();
              
                 // ������
                 controlSelect();
              
                } catch (SQLException se) {
                 // �G���[�F�T�[�o�[�G���[
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 emsg = new ExpjMessage("ZZ01006", "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
                   + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD());
                 sysLog.severe(emsg, getsysUSER_CD());
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 // �G���[�F�T�[�o�[�G���[
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
              
                String tableName = null;
              
                try {
                 List workList = null;
              
                 // �g�����U�N�V�������J�n
                 conn.beginTransWeb();
              
                 // �����L���`�F�b�N
                 tableName = "M_RESOURCE";
                 workList = entity.mUpdateM_RESOURCE.read(conn, struct);
                 if (workList != null && workList.isEmpty()) {
                  // ���������݂��Ȃ��ꍇ
                  putErrorMessage("ZZ01105", "M_RESOURCE");
              
                 } else {
                 // �f�[�^�X�V�ۃ`�F�b�N
                  AL0010010Struct workStruct = (AL0010010Struct)workList.get(0);
                  if (workStruct.geth_MODIFY_COUNT().equals(struct.geth_MODIFY_COUNT()) == false) {
                   // [�����c]."�X�V��"���Z�[�u�X�V��(hidden�g�p)�̏ꍇ
                   putErrorMessage("ZZ01105", "M_RESOURCE");
                  }
                 }
              
                 // ����H���L���`�F�b�N
                 tableName = "M_NECK_WS";
                 workList = entity.mSelect_Cnt_M_NECK_WS.read(conn, struct);
                 if (workList != null && workList.size() > 0) {
                  // ����H�������݂���ꍇ
                  putErrorMessage("AL10005", "M_NECK_WS");
                 }
              
                 // ���ז��חL���`�F�b�N
                 tableName = "T_LOAD_DETAIL";
                 workList = entity.mSelect_Cnt_T_LOAD_DETAIL.read(conn, struct);
                 if (workList != null && workList.size() > 0) {
                  // ���ז��ׂ����݂���ꍇ
                  putErrorMessage("AL10006", "T_LOAD_DETAIL");
                 }
              
                 // �V�~�����[�V�������ז��חL���`�F�b�N
                 tableName = "T_SIM_LOAD_DETAIL";
                 workList = entity.mSelect_Cnt_T_SIM_LOAD_DETAIL.read(conn, struct);
                 if (workList != null && workList.size() > 0) {
                  // �V�~�����[�V�������ז��ׂ����݂���ꍇ
                  putErrorMessage("AL10007", "T_SIM_LOAD_DETAIL");
                 }
              
                 // �G���[������ΏI��
              //			if (msgStruct.sizeError() > 0) {
                 if (msgStruct.getError().size() > 0) {
                  return;
                 }
              
                 tableName = "M_RESOURCE";
                 int dummyRet = entity.mDeleteM_RESOURCE.delete(conn, struct);
              
                 // �f�[�^���m��
                 conn.commit();
              
                 // ������
                 controlClear();
              
                } catch (SQLException se) {
                 // �G���[�F�T�[�o�[�G���[
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(se, emsg);
                 if (tableName != null) {
                  emsg = new ExpjMessage("ZZ01006",
                    tableName + ".PLANT_CD,NECK_PROC_CD:"
                    + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 emsg = new ExpjMessage("ZZ01006", se.toString());
                 sysLog.severe(emsg, getsysUSER_CD());
                 throw ee;
                } catch (Exception e) {
                 // �G���[�F�T�[�o�[�G���[
                 ExpjException ee = null;
                 if (e instanceof ExpjException) {
                  ee = (ExpjException)e;
                  sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                 } else {
                  ExpjMessage emsg = new ExpjMessage("ZZ01106");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage("ZZ01006", e.toString());
                  sysLog.severe(emsg, getsysUSER_CD());
                 }
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // Struct���N���A
                clearStruct();
              
                // �Ǎ���ԁi������ԁj��ݒ�
                setReadStatus(INITIAL);
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // Struct���N���A
                clearStruct();
              
                // �Ǎ���ԁi������ԁj��ݒ�
                setReadStatus(INITIAL);
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0010");
		logger.entering("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �_�E�����[�h�t�@�C�����N���A
                 // PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
              //			struct.setDOWNLOAD_FILE((String)null);
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                 // �R���{�{�b�N�X�f�[�^�p��
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AL0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AL0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AL0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AL0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AL0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AL0010010Entity entity;
	protected AL0010010Struct struct;
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

		entity = new AL0010010Entity();
		struct = new AL0010010Struct();

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
	 * AL0010010�N���X�̕W���R���X�g���N�^
	 */
	public AL0010010Control() throws BusinessProcessException, FoundationException
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
				AL0010010Struct key = (AL0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_CD") && key.getNECK_PROC_CD() != null) {
					msgKey.setKeyValue("NECK_PROC_CD", key.getNECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_NAME") && key.getNECK_PROC_NAME() != null) {
					msgKey.setKeyValue("NECK_PROC_NAME", key.getNECK_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_CAPA") && key.getNECK_PROC_CAPA() != null) {
					msgKey.setKeyValue("NECK_PROC_CAPA", key.getNECK_PROC_CAPA());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_CAPA_UNIT") && key.getNECK_PROC_CAPA_UNIT() != null) {
					msgKey.setKeyValue("NECK_PROC_CAPA_UNIT", key.getNECK_PROC_CAPA_UNIT());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_CAPA_RATE") && key.getNECK_PROC_CAPA_RATE() != null) {
					msgKey.setKeyValue("NECK_PROC_CAPA_RATE", key.getNECK_PROC_CAPA_RATE());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_SHIFT") && key.getNECK_PROC_SHIFT() != null) {
					msgKey.setKeyValue("NECK_PROC_SHIFT", key.getNECK_PROC_SHIFT());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ExistFlag") && key.getExistFlag() != null) {
					msgKey.setKeyValue("ExistFlag", key.getExistFlag());
				}
				if(msgKeyType.containsKeyColumn("h_NECK_PROC_CD") && key.geth_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("h_NECK_PROC_CD", key.geth_NECK_PROC_CD());
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
					AL0010010Struct key = new AL0010010Struct();
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_CD")) {
						key.setNECK_PROC_CD(msgKey.getKeyValue("NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_NAME")) {
						key.setNECK_PROC_NAME(msgKey.getKeyValue("NECK_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_CAPA")) {
						key.setNECK_PROC_CAPA(msgKey.getKeyValue("NECK_PROC_CAPA"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_CAPA_UNIT")) {
						key.setNECK_PROC_CAPA_UNIT(msgKey.getKeyValue("NECK_PROC_CAPA_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_CAPA_RATE")) {
						key.setNECK_PROC_CAPA_RATE(msgKey.getKeyValue("NECK_PROC_CAPA_RATE"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_SHIFT")) {
						key.setNECK_PROC_SHIFT(msgKey.getKeyValue("NECK_PROC_SHIFT"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ExistFlag")) {
						key.setExistFlag(msgKey.getKeyValue("ExistFlag"));
					}
					if(msgKeyType.containsKeyColumn("h_NECK_PROC_CD")) {
						key.seth_NECK_PROC_CD(msgKey.getKeyValue("h_NECK_PROC_CD"));
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
