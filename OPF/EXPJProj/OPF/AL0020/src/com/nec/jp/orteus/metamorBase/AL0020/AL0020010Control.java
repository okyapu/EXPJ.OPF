/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0020/src/com/nec/jp/orteus/metamorBase/AL0020/AL0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0020;

import com.nec.jp.orteus.metamorBase.AL0020.*;
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

public class AL0020010Control
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
           protected List list;                                            // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
       
           // �f�t�H���g�A�N�Z�T���\�b�h
           public List getList() { return this.list; }                     // ���X�g��Ԃ��܂��B
           public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
           public int getListsize() {                                      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
               int nret = 0;
               if( this.list != null ) {nret = this.list.size();}
               return nret;
           }
       //  public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l��Ԃ��܂��B
           public AL0020010Struct getListvalue(int x) { return (AL0020010Struct)(this.list.get(x)); }  // ���X�g�̒l��Ԃ��܂��B
           public AL0020010Struct getStruct() { return this.struct; }  // Struct��Ԃ��܂��B
           public AL0020010Struct createStruct() { return new AL0020010Struct(); } // �V����Struct������ĕԂ��܂��B
           public void setStruct(Object structname) { this.struct.setStruct((AL0020010Struct)structname); }    // Struct���Z�b�g���܂��B
           public void initializeStruct() { this.struct.initialize(); }    // Struct�̒l�����������܂��B
       
           // CSV�o�͗p���X�g
           private CsvWriter csvWriter = null;
           public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
           private CsvReader csvReader = null;
           public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
           /**
            * Struct�̒l���N���A���܂��B
            */
           private void clearStruct()
           {
               struct.initialize();
       
               struct.seth_PLANT_CD(getsysPLANT_CD());
       
               if (list != null) {
                   list.clear();
               }
           }
       
           /**
            * Struct�̒l���R�s�[���܂��B
            */
           private void copyStruct(AL0020010Struct toStruct, AL0020010Struct fromStruct)
           {
               toStruct.setITEM_CD(fromStruct.getITEM_CD());
               toStruct.setITEM_NAME(fromStruct.getITEM_NAME());
               toStruct.setNECK_PROC_CD(fromStruct.getNECK_PROC_CD());
               toStruct.setPROC_START_IDLE_DATE(fromStruct.getPROC_START_IDLE_DATE());
               toStruct.setUNIT_LOAD(fromStruct.getUNIT_LOAD());
               toStruct.setNECK_PROC_LT(fromStruct.getNECK_PROC_LT());
               toStruct.setLOAD_ASSIGN_TYP(fromStruct.getLOAD_ASSIGN_TYP());
               toStruct.setNECK_PROC_NAME(fromStruct.getNECK_PROC_NAME());
               toStruct.setdet_NECK_PROC_CAPA(fromStruct.getdet_NECK_PROC_CAPA());
               toStruct.setdet_NECK_PROC_CAPA_UNIT(fromStruct.getdet_NECK_PROC_CAPA_UNIT());
               toStruct.setdet_MRP_ODR_TYP(fromStruct.getdet_MRP_ODR_TYP());
               toStruct.setdet_OUTSIDE_TYP(fromStruct.getdet_OUTSIDE_TYP());
               toStruct.setdet_ODR_LT(fromStruct.getdet_ODR_LT());
               toStruct.setdet_FIXED_LT(fromStruct.getdet_FIXED_LT());
               toStruct.setdet_SAFETY_LT(fromStruct.getdet_SAFETY_LT());
               toStruct.setdet_ISSUE_LT(fromStruct.getdet_ISSUE_LT());
               toStruct.setPROC_CD(fromStruct.getPROC_CD());
               toStruct.setPROC_NAME(fromStruct.getPROC_NAME());
               toStruct.setWS_CD(fromStruct.getWS_CD());
               toStruct.seth_MODIFY_COUNT(fromStruct.geth_MODIFY_COUNT());
           }
	//�R���{�{�b�N�X�̐����擾�i������j
	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
		try {
			ComboBox com = new ComboBox(conn, sysUSER_CD);
			ComboStruct _comstruct = new ComboStruct();
			_comstruct = com.getData(comname);
			for (int j = 0; j < _comstruct.size(); j++) {
				if ((_comstruct.getData(j)[0]).equals(value)) {
					return _comstruct.getData(j)[1];
				}
			}
			return null;
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                      String tableAndKeys = null;
              
                     try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // �Ǎ���ԁi������ԁj��ݒ�
                          setReadStatus(INITIAL);
              
                          // �Ǎ��L�[���c���āAStruct���N���A
                          String itemCd = struct.getITEM_CD();
                          String neckProcCd = struct.getNECK_PROC_CD();
                          clearStruct();
                          struct.setITEM_CD(itemCd);
                          struct.setNECK_PROC_CD(neckProcCd);
              
                          // ���X�g����
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          list = entity.mSelect.read(conn, struct);
                          //�m��ʏ���(�i�ڃR�[�h�A����H���R�[�h)�Łn
                          if (list == null || list.isEmpty()) {
              
                              // �Ǎ���ԁi�O���Ǎ��j��ݒ�
                              setReadStatus(NOT_FOUND);
              
                              // ����H���}�X�^�A�����A�i�ڂɃf�[�^�����݂��Ȃ��Ƃ�
                              // �x���F�Ώۃf�[�^�����݂��܂���B
                              ExpjMessage emsg = new ExpjMessage("ZZ06001");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
              
                              // �i�ڃ}�X�^�ɑ��݂��Ă���Ε\������B
                              list = entity.mSelectItem.read(conn, struct);
                              if (list != null && list.size() > 0) {
                                  workStruct = (AL0020010Struct)list.get(0);
                                  struct.setITEM_NAME(workStruct.getITEM_NAME());
                                  struct.setdet_MRP_ODR_TYP(this.multcombo("MRP_ODR_TYP",workStruct.getdet_MRP_ODR_TYP()));
                                  struct.setdet_OUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",workStruct.getdet_OUTSIDE_TYP()));
                                  struct.setOUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",workStruct.getOUTSIDE_TYP()));
                                  struct.setdet_ODR_LT(workStruct.getdet_ODR_LT());
                                  struct.setdet_FIXED_LT(workStruct.getdet_FIXED_LT());
                                  struct.setdet_SAFETY_LT(workStruct.getdet_SAFETY_LT());
                                  struct.setdet_ISSUE_LT(workStruct.getdet_ISSUE_LT());
                              }
              
                              // �����}�X�^�ɑ��݂��Ă���Ε\������B
                              workList = entity.mSelectResource.read(conn, struct);
                              if (workList != null && workList.size() > 0) {
                                  workStruct = (AL0020010Struct)workList.get(0);
                                  struct.setNECK_PROC_NAME(workStruct.getNECK_PROC_NAME());
                                  struct.setdet_NECK_PROC_CAPA(workStruct.getdet_NECK_PROC_CAPA());
                                  struct.setdet_NECK_PROC_CAPA_UNIT(workStruct.getdet_NECK_PROC_CAPA_UNIT());
                              }
              
                              return;
                          }
                          
                          AL0020010Struct TempStruct = (AL0020010Struct)list.get(0);
                          TempStruct.setdet_MRP_ODR_TYP(this.multcombo("MRP_ODR_TYP",TempStruct.getdet_MRP_ODR_TYP()));
                          TempStruct.setdet_OUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",TempStruct.getdet_OUTSIDE_TYP()));
											for(int i = 0; i < list.size() ; i++ ) {
												  AL0020010Struct forOutSideTypStruct = (AL0020010Struct)list.get(i);
                          forOutSideTypStruct.setOUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",forOutSideTypStruct.getOUTSIDE_TYP()));
                      }
              
                          // �i�ڔԍ��A����H���R�[�h�̑ޔ�
                          struct.seth_ITEM_CD(struct.getITEM_CD());
                          struct.seth_NECK_PROC_CD(struct.getNECK_PROC_CD());
              
                          // �f�[�^��ݒ�
                          copyStruct(struct, (AL0020010Struct)list.get(0));
              
                          // �Ǎ���ԁi�Ǎ������j��ݒ�
                          setReadStatus(NORMAL);
              
                      } catch (SQLException se) {
                          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                          setReadStatus(ERROR);
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006",tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // �G���[�F�T�[�o�ŃG���[���������܂����B
                              ExpjMessage emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ee = new ExpjException(e, emsg);
                              emsg = new ExpjMessage("ZZ01006", e.toString());
                              sysLog.severe(emsg, getsysUSER_CD());
                          }
                          throw ee;
                      }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                      String tableAndKeys = null;
              
                      try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // �g�����U�N�V�������J�n
                          conn.beginTransWeb();
              
                          // �u�i�ڔԍ��v+�u����H���R�[�h�v���A[����H��]�Ɋ��ɑ��݂��邩���`�F�b�N
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mInsertM_NECK_WS.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
              
                          // �w��L�[�̃f�[�^�����ɑ��݂��Ă��邩���ׂ�B
                          if (workStruct.getCNT().equals("0") == false) {
                              // �x���F���łɑ��݂��Ă���f�[�^�ł��B�Ď��s���Ă��������B
                              ExpjMessage emsg = new ExpjMessage("AL20010");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // �i�ڃ}�X�^���݃`�F�b�N
                          tableAndKeys = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                          workList = entity.mCheckM_ITEM.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_ITEM_CD().equals("0") == true) {
                              // �i�ڃ}�X�^���݂����G���[
                              struct.setITEM_NAME(null);
                              // �x���F�i�ڔԍ����}�X�^�ɑ��݂��܂���B
                              ExpjMessage emsg = new ExpjMessage("AL50004");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          // �������݃`�F�b�N
                          tableAndKeys = "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckM_RESOURCE.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_NECK_PROC_CD().equals("0") == true) {
                              // �������݂����G���[
                              struct.setNECK_PROC_NAME(null);
                              // �x���F����H�������݂��܂���B
                              ExpjMessage emsg = new ExpjMessage("AL20009");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          if (msgStruct.sizeError() > 0) {
                              // �G���[������ΏI��
                              return;
                          }
              
                          // ����H����ǉ�
                          int dummyRet = entity.mInsertM_NECK_WS.create(conn, struct);
              
                          // �f�[�^���m��
                          conn.commit();
              
                          // ��ʂ��ĕ\��
                          controlSelect();
              
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // �G���[�F�T�[�o�ŃG���[���������܂����B
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
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                      String tableAndKeys = null;
              
                      try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // �g�����U�N�V�������J�n
                          conn.beginTransWeb();
              
                          // �f�[�^�X�V�ۃ`�F�b�N
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mUpdateM_NECK_WS.read(conn, struct);
                          // �f�[�^���Ȃ��ꍇ
                          if (workList == null || workList.isEmpty()) {
                              // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B
                              //       ���j���[�ɖ߂��Ă�蒼���ĉ������B
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          workStruct = (AL0020010Struct)workList.get(0);
                          // [����H��]."�X�V��"���Z�[�u�X�V��(hidden�g�p)�̏ꍇ
                          if (workStruct.geth_MODIFY_COUNT().equals(struct.geth_MODIFY_COUNT()) == false) {
                              // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B
                              //       ���j���[�ɖ߂��Ă�蒼���ĉ������B
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // �i�ڃ}�X�^���݃`�F�b�N
                          tableAndKeys = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                          workList = entity.mCheckM_ITEM.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_ITEM_CD().equals("0") == true) {
                              // �x���F�i�ڔԍ����}�X�^�ɑ��݂��܂���B
                              ExpjMessage emsg = new ExpjMessage("AL50004");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          // �������݃`�F�b�N
                          tableAndKeys = "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckM_RESOURCE.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_NECK_PROC_CD().equals("0") == true) {
                              // �x���F����H�������݂��܂���B
                              ExpjMessage emsg = new ExpjMessage("AL20009");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          if (msgStruct.sizeError() > 0) {
                              // �G���[������ΏI��
                              return;
                          }
              
                          // ����H�����X�V
                          int dummyRet = entity.mUpdateM_NECK_WS.update(conn, struct);
              
                          // �f�[�^���m��
                          conn.commit();
              
                          // ��ʂ��ĕ\��
                          controlSelect();
              
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // �G���[�F�T�[�o�ŃG���[���������܂����B
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
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
              
                      String tableAndKeys = null;
              
                      try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // �g�����U�N�V�������J�n
                          conn.beginTransWeb();
              
                          // ����H���L���`�F�b�N
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mUpdateM_NECK_WS.read(conn, struct);
                          if (workList == null || workList.isEmpty()) {
                              // �u����H���R�[�h�v�A�u�i�ڔԍ��v������H�������݂��Ȃ�
                              // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B
                              //       ���j���[�ɖ߂��Ă�蒼���ĉ������B
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // �f�[�^�X�V�ۃ`�F�b�N
                          workStruct = (AL0020010Struct)workList.get(0);
                          // [����H��]."�X�V��"���Z�[�u�X�V��(hidden�g�p)�̏ꍇ
                          if (workStruct.geth_MODIFY_COUNT().equals(struct.geth_MODIFY_COUNT()) == false) {
                              // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B
                              //       ���j���[�ɖ߂��Ă�蒼���ĉ������B
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // ���ז��חL���`�F�b�N
                          tableAndKeys = "T_LOAD_DETAIL.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckT_LOAD_DETAIL.read(conn, struct);
                          if (workList != null && workList.size() > 0) {
                              // ���ז��ׂ����݂���
                              // �x���F���ז��ׂɃf�[�^�����݂��邽�ߍ폜�ł��܂���B
                              ExpjMessage emsg = new ExpjMessage("AL10006");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          // �V�~�����[�V�������ז��חL���`�F�b�N
                          tableAndKeys = "T_SIM_LOAD_DETAIL.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckT_SIM_LOAD_DETAIL.read(conn, struct);
                          if (workList != null && workList.size() > 0) {
                              // �V�~�����[�V�������ז��ׂ����݂���
                              // �x���F�V�~�����[�V�������ז��ׂɃf�[�^�����݂��邽�ߍ폜�ł��܂���B
                              ExpjMessage emsg = new ExpjMessage("AL10007");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          if (msgStruct.sizeError() > 0) {
                              // �G���[������ΏI��
                              return;
                          }
              
                          // ����H���}�X�^�̍폜����
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          int dummyRet = entity.mDeleteM_NECK_WS.delete(conn, struct);
              
                          // �f�[�^���m��
                          conn.commit();
              
                          // �Ǎ���ԁi������ԁj��ݒ�
                          setReadStatus(INITIAL);
              
                          // ��ʂ��������iStruct���N���A�j
                          clearStruct();
              
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // �G���[�F�T�[�o�ŃG���[���������܂����B
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
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                      // Struct���N���A
                      clearStruct();
              
                      // �Ǎ���ԁi������ԁj��ݒ�
                      setReadStatus(INITIAL);
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              /*          // �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
                      try{
              */
                          // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
                          if ( isScreenMove() == true ) {
                              // �����̃R���g���[�����\�b�h���Ăяo���܂��B
              //              controlSelect();
                          }
              
                          // Struct���N���A
                          clearStruct();
              
                          // �Ǎ���ԁi������ԁj��ݒ�
                          setReadStatus(INITIAL);
              
              /*          // �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
                      } catch(SQLException e) {
              //          e.printStackTrace();
                          // �G���[�������L�q���Ă��������B
                          //
                      }
              */
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              
                      try {
                          // ���׊��t�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                          ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                          ComboStruct LOAD_ASSIGN_TYP = comboController.getData("LOAD_ASSIGN_TYP");
                          struct.setList_LOAD_ASSIGN_TYP_val(LOAD_ASSIGN_TYP.getValList());
                          struct.setList_LOAD_ASSIGN_TYP_name(LOAD_ASSIGN_TYP.getExplanList());
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      }
              
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              //      �\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
              //      } catch(AlarmMessageException ame){
              //          ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //          throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AL0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AL0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AL0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AL0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AL0020010Entity entity;
	protected AL0020010Struct struct;
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

		entity = new AL0020010Entity();
		struct = new AL0020010Struct();

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
	 * AL0020010�N���X�̕W���R���X�g���N�^
	 */
	public AL0020010Control() throws BusinessProcessException, FoundationException
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
				AL0020010Struct key = (AL0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_name") && key.getLOAD_ASSIGN_TYP_name() != null) {
					msgKey.setKeyValue("LOAD_ASSIGN_TYP_name", key.getLOAD_ASSIGN_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_val") && key.getLOAD_ASSIGN_TYP_val() != null) {
					msgKey.setKeyValue("LOAD_ASSIGN_TYP_val", key.getLOAD_ASSIGN_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_NECK_PROC_CD") && key.geth_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("h_NECK_PROC_CD", key.geth_NECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_CD") && key.getNECK_PROC_CD() != null) {
					msgKey.setKeyValue("NECK_PROC_CD", key.getNECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_START_IDLE_DATE") && key.getPROC_START_IDLE_DATE() != null) {
					msgKey.setKeyValue("PROC_START_IDLE_DATE", key.getPROC_START_IDLE_DATE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_LOAD") && key.getUNIT_LOAD() != null) {
					msgKey.setKeyValue("UNIT_LOAD", key.getUNIT_LOAD());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_LT") && key.getNECK_PROC_LT() != null) {
					msgKey.setKeyValue("NECK_PROC_LT", key.getNECK_PROC_LT());
				}
				if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP") && key.getLOAD_ASSIGN_TYP() != null) {
					msgKey.setKeyValue("LOAD_ASSIGN_TYP", key.getLOAD_ASSIGN_TYP());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_NAME") && key.getNECK_PROC_NAME() != null) {
					msgKey.setKeyValue("NECK_PROC_NAME", key.getNECK_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA") && key.getdet_NECK_PROC_CAPA() != null) {
					msgKey.setKeyValue("det_NECK_PROC_CAPA", key.getdet_NECK_PROC_CAPA());
				}
				if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA_UNIT") && key.getdet_NECK_PROC_CAPA_UNIT() != null) {
					msgKey.setKeyValue("det_NECK_PROC_CAPA_UNIT", key.getdet_NECK_PROC_CAPA_UNIT());
				}
				if(msgKeyType.containsKeyColumn("det_MRP_ODR_TYP") && key.getdet_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("det_MRP_ODR_TYP", key.getdet_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("det_OUTSIDE_TYP") && key.getdet_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("det_OUTSIDE_TYP", key.getdet_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("det_ODR_LT") && key.getdet_ODR_LT() != null) {
					msgKey.setKeyValue("det_ODR_LT", key.getdet_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("det_FIXED_LT") && key.getdet_FIXED_LT() != null) {
					msgKey.setKeyValue("det_FIXED_LT", key.getdet_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("det_SAFETY_LT") && key.getdet_SAFETY_LT() != null) {
					msgKey.setKeyValue("det_SAFETY_LT", key.getdet_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("det_ISSUE_LT") && key.getdet_ISSUE_LT() != null) {
					msgKey.setKeyValue("det_ISSUE_LT", key.getdet_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CNT") && key.getCNT() != null) {
					msgKey.setKeyValue("CNT", key.getCNT());
				}
				if(msgKeyType.containsKeyColumn("CNT_ITEM_CD") && key.getCNT_ITEM_CD() != null) {
					msgKey.setKeyValue("CNT_ITEM_CD", key.getCNT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CNT_NECK_PROC_CD") && key.getCNT_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("CNT_NECK_PROC_CD", key.getCNT_NECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("check_T_LOAD_CD") && key.getcheck_T_LOAD_CD() != null) {
					msgKey.setKeyValue("check_T_LOAD_CD", key.getcheck_T_LOAD_CD());
				}
				if(msgKeyType.containsKeyColumn("check_SIM_LOAD_CD") && key.getcheck_SIM_LOAD_CD() != null) {
					msgKey.setKeyValue("check_SIM_LOAD_CD", key.getcheck_SIM_LOAD_CD());
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
					AL0020010Struct key = new AL0020010Struct();
					if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_name")) {
						key.setLOAD_ASSIGN_TYP_name(msgKey.getKeyValue("LOAD_ASSIGN_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_val")) {
						key.setLOAD_ASSIGN_TYP_val(msgKey.getKeyValue("LOAD_ASSIGN_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_NECK_PROC_CD")) {
						key.seth_NECK_PROC_CD(msgKey.getKeyValue("h_NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_CD")) {
						key.setNECK_PROC_CD(msgKey.getKeyValue("NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_START_IDLE_DATE")) {
						key.setPROC_START_IDLE_DATE(msgKey.getKeyValue("PROC_START_IDLE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_LOAD")) {
						key.setUNIT_LOAD(msgKey.getKeyValue("UNIT_LOAD"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_LT")) {
						key.setNECK_PROC_LT(msgKey.getKeyValue("NECK_PROC_LT"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP")) {
						key.setLOAD_ASSIGN_TYP(msgKey.getKeyValue("LOAD_ASSIGN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_NAME")) {
						key.setNECK_PROC_NAME(msgKey.getKeyValue("NECK_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA")) {
						key.setdet_NECK_PROC_CAPA(msgKey.getKeyValue("det_NECK_PROC_CAPA"));
					}
					if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA_UNIT")) {
						key.setdet_NECK_PROC_CAPA_UNIT(msgKey.getKeyValue("det_NECK_PROC_CAPA_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("det_MRP_ODR_TYP")) {
						key.setdet_MRP_ODR_TYP(msgKey.getKeyValue("det_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("det_OUTSIDE_TYP")) {
						key.setdet_OUTSIDE_TYP(msgKey.getKeyValue("det_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("det_ODR_LT")) {
						key.setdet_ODR_LT(msgKey.getKeyValue("det_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("det_FIXED_LT")) {
						key.setdet_FIXED_LT(msgKey.getKeyValue("det_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("det_SAFETY_LT")) {
						key.setdet_SAFETY_LT(msgKey.getKeyValue("det_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("det_ISSUE_LT")) {
						key.setdet_ISSUE_LT(msgKey.getKeyValue("det_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CNT")) {
						key.setCNT(msgKey.getKeyValue("CNT"));
					}
					if(msgKeyType.containsKeyColumn("CNT_ITEM_CD")) {
						key.setCNT_ITEM_CD(msgKey.getKeyValue("CNT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CNT_NECK_PROC_CD")) {
						key.setCNT_NECK_PROC_CD(msgKey.getKeyValue("CNT_NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("check_T_LOAD_CD")) {
						key.setcheck_T_LOAD_CD(msgKey.getKeyValue("check_T_LOAD_CD"));
					}
					if(msgKeyType.containsKeyColumn("check_SIM_LOAD_CD")) {
						key.setcheck_SIM_LOAD_CD(msgKey.getKeyValue("check_SIM_LOAD_CD"));
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
