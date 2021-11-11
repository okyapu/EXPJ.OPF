/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0180;

import com.nec.jp.orteus.metamorBase.AA0180.*;
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

import java.io.*;
import org.w3c.dom.*;
import org.apache.crimson.tree.*;
//{{user_implement_code_import

import java.text.ParseException;

import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.expj.psmaintenance.PsMaintenance;
import com.nec.jp.orteus.expj.exception.ExpjBadException;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;
// 2008/07/22 SYSCOM �镔 ADD START
import com.nec.jp.orteus.expj.exception.PsManhourTypException;
// 2008/07/22 SYSCOM �镔 ADD END


import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0180010Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// FlashTree�p�A�N�Z�T���\�b�h
	private Document flashTree = null;
	public Document getFlashTree() { return this.flashTree; }
	public void setFlashTree( Document obj ) { this.flashTree = obj; }
	public String getFlashTreeXML() {
		if(flashTree == null) {
			return (String)null;
		}
		StringWriter strWr = new StringWriter();
		try {
			((XmlDocument)flashTree).write(strWr, "Shift_JIS");
		}catch(IOException e){
			e.printStackTrace();
		}
                String osname = System.getProperty("os.name");
                if(osname.indexOf("Windows")>=0){
         		return StringConverter.substitute(strWr.toString(), "\r\n", "");
                } else {
              		return StringConverter.substitute(strWr.toString(), "\n", "");
                }
	}
	public int setXMLDoc(Element el, List list, int startId, int lvl, int parentId) throws BusinessProcessException, FoundationException {

		if(el != null && list != null) {
			Element elChild = null;
			for(int i=0; i<list.size(); i++, startId++) {
				// �G�������g�𐶐�
				elChild = flashTree.createElement("node");
				setStruct2XML(elChild, (AA0180010Struct)list.get(i), startId, lvl, parentId);
				// �쐬�����G�������g���q���Ƃ��Ēǉ�
				el.appendChild(elChild);
			}
		}
		return startId;
	}

	public int setXMLDoc(Element el, List list, int startId) throws BusinessProcessException, FoundationException {
		return setXMLDoc(el, list, startId, 1, 0);
	} 

	public void setStruct2XML(Element el, AA0180010Struct struct, int id, int lvl, int parentId) throws BusinessProcessException, FoundationException {

		if(el != null && struct != null) {
			try {
		//{{user_implement_dev:<setStruct2XML>
              
                              // ��{����
                              // id����(id)�̐ݒ�
                              el.setAttribute("id", String.valueOf(id));
                              // ���x������(lvl)�̐ݒ�
                              el.setAttribute("lvl", String.valueOf(lvl));
                              // �e����(parent)�̐ݒ�
                              el.setAttribute("parent", String.valueOf(parentId));
                              // ���x������(label)�̐ݒ�
                              el.setAttribute("label", struct.getlabel());
              
                              // �g������
                              // ��ʃ��x���i�ڔԍ������̐ݒ�
                              if (struct.getUpper_ITEM_CD() != null
                                      && struct.getUpper_ITEM_CD().equals("") == false)
                              {
                                  el.setAttribute("Upper_ITEM_CD", struct.getUpper_ITEM_CD());
                              } else {
                                  el.setAttribute("Upper_ITEM_CD", "");
                              }
                              // ���ʃ��x���i�ڔԍ������̐ݒ�
                              if (struct.getLower_ITEM_CD() != null
                                      && struct.getLower_ITEM_CD().equals("") == false)
                              {
                                  el.setAttribute("Lower_ITEM_CD", struct.getLower_ITEM_CD());
                              } else {
                                  el.setAttribute("Lower_ITEM_CD", "");
                              }
                              // ���i�\���Ő������̐ݒ�
                              if (struct.getPS_EDITION() != null
                                      && struct.getPS_EDITION().equals("") == false)
                              {
                                  el.setAttribute("PS_EDITION", struct.getPS_EDITION());
                              } else {
                                  el.setAttribute("PS_EDITION", "");
                              }
                              // �X�V�������̐ݒ�i���i�\���j
                              if (struct.getMODIFY_COUNT() != null
                                      && struct.getMODIFY_COUNT().equals("") == false)
                              {
                                  el.setAttribute("MODIFY_COUNT", struct.getMODIFY_COUNT());
                              } else {
                                  el.setAttribute("MODIFY_COUNT", "0");
                              }

                              // �i�ڕʍ�ƃR�[�h�����̐ݒ�i��ƌn��j
                              if (struct.getPROC_CD() != null
                                      && struct.getPROC_CD().equals("") == false)
                              {
                                  el.setAttribute("PROC_CD", struct.getPROC_CD());
                              } else {
                                  el.setAttribute("PROC_CD", "");
                              }
                              // �X�V�������̐ݒ�i��ƌn��j
                              if (struct.getMODIFY_CNT_PROC() != null
                                      && struct.getMODIFY_CNT_PROC().equals("") == false)
                              {
                                  el.setAttribute("MODIFY_CNT_PROC", struct.getMODIFY_CNT_PROC());
                              } else {
                                  el.setAttribute("MODIFY_CNT_PROC", "0");
                              }
                              // �X�V�������̐ݒ�i���o�j
                              if (struct.getMODIFY_CNT_ISSUE() != null
                                      && struct.getMODIFY_CNT_ISSUE().equals("") == false)
                              {
                                  el.setAttribute("MODIFY_CNT_ISSUE", struct.getMODIFY_CNT_ISSUE());
                              } else {
                                  el.setAttribute("MODIFY_CNT_ISSUE", "0");
                              }
                              // �ڍ׏��^�C�v�����̐ݒ�
                              if (struct.geth_ProcTyp() != null
                                      && struct.geth_ProcTyp().equals("") == false)
                              {
                                  el.setAttribute("DET_TYP", struct.geth_ProcTyp());
                              } else {
                                  el.setAttribute("DET_TYP", "0");
                              }                                               
                              // ���H�������̐ݒ�
                              if (struct.getFIRST_PROC() != null
                                      && struct.getFIRST_PROC().equals("") == false)
                              {
                                  el.setAttribute("FIRST_PROC", struct.getFIRST_PROC());
                              } else {
                                  el.setAttribute("FIRST_PROC", "0");
                              }                                               
// 2008/07/22 SYSCOM �镔 ADD START
                              // �H���Ǘ��i�ڋ敪�����̐ݒ�
                              if (struct.getLower_MANHOUR_TYP() != null
                                      && struct.getLower_MANHOUR_TYP().equals("") == false)
                              {
                                  el.setAttribute("Lower_MANHOUR_TYP", struct.getLower_MANHOUR_TYP());
                              } else {
                                  el.setAttribute("Lower_MANHOUR_TYP", "0");
                              }
// 2008/07/22 SYSCOM �镔 ADD END
                            
                                if (struct.geth_ProcTyp() == null || struct.geth_ProcTyp().equals("")) {
//                                  el.setAttribute("icon1", "AD0020011CIcon01A");
//                                  el.setAttribute("icon2", "AD0020011CIcon01B");
                                } else if (struct.geth_ProcTyp().equals("PROC")) {
//                                  el.setAttribute("icon1", "AD0020011CIcon03C");
                                    el.setAttribute("icon1", "AD0020011CIcon01C");
                                } else {
//                                  el.setAttribute("icon1", "AD0020011CIcon01A");
//                                  el.setAttribute("icon2", "AD0020011CIcon01B");
                                }
              
                //}}user_implement_dev:<setStruct2XML>
			} catch(DOMException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public void setStruct2XML(Element el, AA0180010Struct struct, int id) throws BusinessProcessException, FoundationException {
		setStruct2XML(el, struct, id, 1, 0);
		return;
	}

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
           public AA0180010Struct getListvalue(int x) { return (AA0180010Struct)(this.list.get(x)); }  // ���X�g�̒l��Ԃ��܂��B
           public AA0180010Struct getStruct() { return this.struct; }  // Struct��Ԃ��܂��B
           public AA0180010Struct createStruct() { return new AA0180010Struct(); } // �V����Struct������ĕԂ��܂��B
           public void setStruct(Object structname) { this.struct.setStruct((AA0180010Struct)structname); }    // Struct���Z�b�g���܂��B
           public void initializeStruct() { this.struct.initialize(); }    // Struct�̒l�����������܂��B
       
           // CSV�o�͗p���X�g
           private CsvWriter csvWriter = null;
           public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
           private CsvReader csvReader = null;
           public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
           /** �W�J�敪�F���W�J */
           private static final String DEVELOP_NORMAL = "1";
       
           /** �W�J�敪�F�t�W�J */
           private static final String DEVELOP_REVERSE = "2";
       
           /** �f�t�H�[���g�����W�J���x�� */
           private static final int DEFAULT_INIT_DEVELOP_LEVEL = 15;
       
           /** �f�t�H�[���g�ő�W�J���x�� */
           private static final int DEFAULT_MAX_DEVELOP_LEVEL = 50;
       
           /** �f�t�H�[���g�����W�J���x�� */
           private int _intInitDevelopLevel = DEFAULT_INIT_DEVELOP_LEVEL;
       
           /** �ő�W�J���x�� */
           private int _intMaxDevelopLevel = DEFAULT_MAX_DEVELOP_LEVEL;
       
           /** �ő�Ǎ��s�� */
           private int _intMaxReadNum = 0;
       
           /** �Ώۓ��t */
           private String _targetDate = null;
       
           /** ���i�\�������e�i���X���i�A�N�Z�X�p�I�u�W�F�N�g */
           private PsMaintenance _psMaint = null;
       
           /** �i�ڎ�z�敪�R���{�{�b�N�X�l���X�g */
           private List _detMrpOdrTypValList = null;
       
           /** �i�ڎ�z�敪�R���{�{�b�N�X�\���������X�g */
           private List _detMrpOdrTypNameList = null;
       
           /** ���O��敪�R���{�{�b�N�X�l���X�g */
           private List _detOutsideTypValList = null;
       
           /** ���O��敪�R���{�{�b�N�X�\���������X�g */
           private List _detOutsideTypNameList = null;
       
           /** ���i�\��LT�g�p�t���O�\���p�i�R���{�{�b�N�X�j�l���X�g */
           private List _detPsLtFlgValList = null;
       
           /** ���i�\��LT�g�p�t���O�\���p�i�R���{�{�b�N�X�j�������X�g */
           private List _detPsLtFlgNameList = null;

        /** �ڍ׉�ʏo�̓^�C�v */
        private String _detTyp = "";
        public void setDetType(String detTyp){ this._detTyp = detTyp; };
        public String getDetType(){ return this._detTyp; };
           /**
            * �f�[�^�Ȃ���O�N���X�ł��B
            */
           private class AA0180010NoDataException extends ExpjBadException
           {
               /**
                * AA0180010NoDataException�I�u�W�F�N�g���\�z���܂��B
                *
                * @param em �G���[���b�Z�[�W�I�u�W�F�N�g
                */
               private AA0180010NoDataException(ExpjMessage em)
               {
                   super(em);
               }
           }
       
           /**
            * �c���[�̓Ǎ��s���I�[�o�[��O�N���X�ł��B
            */
           private class AA0180010MaxReadException extends ExpjBadException
           {
               /**
                * AA0180010MaxReadException�I�u�W�F�N�g���\�z���܂��B
                *
                * @param em �G���[���b�Z�[�W�I�u�W�F�N�g
                */
               private AA0180010MaxReadException(ExpjMessage em)
               {
                   super(em);
               }
           }
       
           /**
            * �c���[�̍ő�W�J���x���I�[�o�[��O�N���X�ł��B
            */
           private class AA0180010MaxLevelException extends ExpjBadException
           {
               /**
                * AA0180010MaxLevelException�I�u�W�F�N�g���\�z���܂��B
                */
               private AA0180010MaxLevelException()
               {
                   super();
               }
           }
       
           /**
            * ��ʃ��x���m�[�h�ɑ΂����ʃ��x���m�[�h���c���[�W�J���܂��B
            *
            * @param  upperNodeElement ��ʃ��x���m�[�h�G�������g
            * @param  upperNodeStruct ��ʃ��x���m�[�h��sturct
            * @param  upperNodeId ��ʃ��x���m�[�hID
            * @param  lowerNodeId ���ʃ��x���m�[�hID�i����ID����n�J�j
            * @param  maxNodeId �Ǎ��\�ő�m�[�hID�i����ID�𒴂��邱�Ƃ͂ł��Ȃ��j
            * @param  lowerTreeLevel ���ʃ��x���c���[���x��
            * @param  maxLevel �ő�W�J���x��
            * @return ���̃m�[�hID
            * @throws BusinessProcessException
            * @throws FoundationException
            * @throws SQLException
            * @throws ParseException
            * @throws AA0180010NoDataException
            * @throws AA0180010MaxReadException
            */
           private int expandTree(Element upperNodeElement, AA0180010Struct upperNodeStruct,
                   int upperNodeId, int lowerNodeId, int maxNodeId, int lowerTreeLevel, int maxLevel)
                   throws BusinessProcessException, FoundationException, SQLException, ParseException,
                           AA0180010NoDataException, AA0180010MaxReadException
           {
               // �q�m�[�h�̈ꗗ���擾
               List lowerNodeList = new ArrayList();
               if (upperNodeStruct.geth_ProcTyp().equals("PS")) { 
                   lowerNodeList = getLowerNodeList(upperNodeStruct.getLower_ITEM_CD());
               } else{
                   lowerNodeList.clear();
               }
               if (lowerNodeList.isEmpty()) {
                   // ���[�m�[�h�̏ꍇ
                   if (upperNodeStruct.geth_ProcTyp().equals("PS")) {
                         upperNodeElement.setAttribute("ctx", "T");
                   } else {
                       upperNodeElement.setAttribute("ctx", "P");
                   }
               } else if (upperNodeElement.hasAttribute("target") == false) {
                   // ���[�ȊO�̃m�[�h�ł���ARoot�łȂ��ꍇ
                   upperNodeElement.setAttribute("ctx", "N");
                   if (lowerTreeLevel > maxLevel) {
                       // �c���[�̃��x�����ő僌�x���𒴂����ꍇ
                       if (lowerTreeLevel > _intMaxDevelopLevel + 1) {
                           // �c���[�̃��x�����ő�W�J���x���𒴂����ꍇ
                           // �e�m�[�h�ɉ��ʃ��x���W�J�s������ݒ�
                           upperNodeElement.setAttribute("terminated", "true");
                           // �x���F�ő�W�J���x���i{0}�j�𒴂��ēW�J���邱�Ƃ͂ł��܂���B
                           ExpjMessage emsg = new ExpjMessage("AA20018",
                                   String.valueOf(_intMaxDevelopLevel));
                           upperNodeElement.setAttribute("terminate_comment",
                                   emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
                       } else {
                           // �e�m�[�h�ɉ��ʃ��x�����Ǎ�������ݒ�
                           upperNodeElement.setAttribute("not_read", "true");
                       }
                       return lowerNodeId;
                   }
               }
               int lowerNodeListSize = lowerNodeList.size();
               if (maxNodeId > 0 && lowerNodeId + lowerNodeListSize - 1 > maxNodeId) {
                   // �c���[�̓Ǎ��s�����ő�l�𒴂����ꍇ
                   throw new AA0180010MaxReadException(new ExpjMessage("ZZ01006",
                       "M_PS.COMP_ITEM_CD:" + upperNodeStruct.getLower_ITEM_CD()));
               }
       
               for (int i = 0; i < lowerNodeListSize; i++) {
                   // �q�m�[�h�𐶐��A�c���[�pXML�ɒǉ�
                   Element lowerNodeElement = flashTree.createElement("node");
                   upperNodeElement.appendChild(lowerNodeElement);
                   // lowerNodeStruct����q�m�[�h�̊e�푮���f�[�^��ݒ�
                   AA0180010Struct lowerNodeStruct = new AA0180010Struct();
                   lowerNodeStruct = (AA0180010Struct)lowerNodeList.get(i);
                   if (lowerNodeStruct.getKBN1().equals("2") || lowerNodeStruct.getKBN2().equals("2")) {
                       //���o�Ȃ����i�\���s�����o���萻�i�\���s�̏ꍇ
                       lowerNodeStruct.seth_ProcTyp("PS");                     
                   }else {
                       //��ƌn��s�̏ꍇ
                       lowerNodeStruct.seth_ProcTyp("PROC");                       
                   }
                   if (lowerNodeStruct.getKBN1().equals("1")) {
                       //��ƌn��s�����o���萻�i�\���s�̏ꍇ�A���H������
                       if (lowerNodeStruct.getPROC_NO().equals(lowerNodeStruct.getFIRST_PROC_NO())) {
                           lowerNodeStruct.setFIRST_PROC("1");                     
                       }
                   }
                   StringBuffer buf = new StringBuffer();
                   if (lowerNodeStruct.getKBN1().equals("2") || lowerNodeStruct.getKBN2().equals("2")) {
                       //���o����̎q���i�܂��́A���o�Ȃ��̎q���i�̏ꍇ   
                       buf.append(lowerNodeStruct.getLower_ITEM_CD()); //�i�ڃR�[�h
                       buf.append(",");
                       buf.append(getItemName(lowerNodeStruct.getLower_ITEM_CD()));//�i�ږ�
                       buf.append(",");
                       buf.append(lowerNodeStruct.getPS_EDITION());//�Ő�
                       buf.append("[");
                       buf.append(lowerNodeStruct.getEFF_PHASE_IN_DATE());//�L���J�n��
                       buf.append("-");
                       buf.append(lowerNodeStruct.getEFF_PHASE_OUT_DATE());//�L���I����
                       buf.append("]");
// 2008/07/22 SYSCOM �镔 ADD START
//                       lowerNodeStruct.setLower_MANHOUR_TYP(getManhourTyp(lowerNodeStruct.getLower_ITEM_CD()));
// 2008/07/22 SYSCOM �镔 ADD END
                   } else {
                       //��ƌn��̏ꍇ   
                       buf.append(lowerNodeStruct.getPROC_CD()); //�i�ڕʍ�ƃR�[�h
                       buf.append(",");
                       buf.append(lowerNodeStruct.getPROC_NO());//��ƌn��ԍ�
                       buf.append(",");
                       buf.append(lowerNodeStruct.getPROC_NAME());//��Ɩ�
                       buf.append(",");
                       buf.append(lowerNodeStruct.getWS_CD());//��Ƌ�
                   }
                   lowerNodeStruct.setlabel(buf.toString());
                   setStruct2XML(lowerNodeElement, lowerNodeStruct, lowerNodeId, lowerTreeLevel,
                           upperNodeId);
                   // ���ʃ��x���m�[�h��W�J�i�ċA�I�Ƀc���[��W�J����j
                   lowerNodeId = expandTree(lowerNodeElement, lowerNodeStruct, lowerNodeId,
                           lowerNodeId + 1, maxNodeId, lowerTreeLevel + 1, maxLevel);
               }
       
               return lowerNodeId;
           }
       
           /**
            * ���ʃ��x���m�[�h�̈ꗗ���擾���܂��B
            *
            * @param  �i�ڔԍ�
            * @return ���ʃ��x���m�[�h�̈ꗗ
            * @throws SQLException DB�A�N�Z�X�Ɏ��s
            * @throws ParseException ���t�̌`���ϊ��Ɏ��s
            */
           private List getLowerNodeList(String itemCd)
                   throws SQLException, ParseException,FoundationException
           {
               if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                   // ���W�J�̏ꍇ
                   if (_targetDate == null || _targetDate.equals("") == true) {
                       // �Ώۓ��t�Ȃ��̏ꍇ
                       AA0180010Struct workStruct = new AA0180010Struct();
                       workStruct.setUpper_ITEM_CD(itemCd);
                       workStruct.setPLANT_CD(getsysPLANT_CD());
                       workStruct.setTargetDate_IN("9999/99/99");
                       workStruct.setTargetDate_OUT("0000/00/00");
                       return  entity.mGetComp.read(conn, workStruct);
                   } else {
                       // �Ώۓ��t����̏ꍇ
                       AA0180010Struct workStruct = new AA0180010Struct();
                       workStruct.setUpper_ITEM_CD(itemCd);
                       workStruct.setPLANT_CD(getsysPLANT_CD());
                       workStruct.setTargetDate_IN(_targetDate);
                       workStruct.setTargetDate_OUT(_targetDate);
                       return  entity.mGetComp.read(conn, workStruct);
                   }
               } else {
                   // �t�W�J�̏ꍇ
                   if (_targetDate == null || _targetDate.equals("") == true) {
                       // �Ώۓ��t�Ȃ��̏ꍇ
                       AA0180010Struct workStruct = new AA0180010Struct();
                       workStruct.setUpper_ITEM_CD(itemCd);
                       workStruct.setPLANT_CD(getsysPLANT_CD());
                       workStruct.setTargetDate_IN("9999/99/99");
                       workStruct.setTargetDate_OUT("0000/00/00");
                       return  entity.mGetParent.read(conn, workStruct);
                   } else {
                       // �Ώۓ��t����̏ꍇ
                       AA0180010Struct workStruct = new AA0180010Struct();
                       workStruct.setUpper_ITEM_CD(itemCd);
                       workStruct.setPLANT_CD(getsysPLANT_CD());
                       workStruct.setTargetDate_IN(_targetDate);
                       workStruct.setTargetDate_OUT(_targetDate);
                       return  entity.mGetParent.read(conn, workStruct);
                   }
               }
           }
       
           /**
            * �i�ڔԍ��ɑ΂���i�ږ����擾���܂��B
            *
            * @param  �i�ڔԍ�
            * @return �i�ږ�
            * @throws FoundationException
            * @throws SQLException DB�A�N�Z�X�Ɏ��s
            * @throws AA0180010NoDataException DB�A�N�Z�X�Ɏ��s
            */
           private String getItemName(String itemCd)
                   throws FoundationException, SQLException, AA0180010NoDataException
           {
               AA0180010Struct workStruct = new AA0180010Struct();
               workStruct.setLower_ITEM_CD(itemCd);
               List workList = entity.mSelect.read(conn, workStruct);
               if (workList == null || workList.isEmpty()) {
                   // �i�ڔԍ������݂��Ȃ��ꍇ
                   throw new AA0180010NoDataException(new ExpjMessage("ZZ01006",
                           "M_ITEM.ITEM_CD:" + itemCd));
               }
               workStruct = (AA0180010Struct)workList.get(0);
               if (workStruct.getLower_ITEM_NAME() == null) {
                   return "";
               } else {
                   return workStruct.getLower_ITEM_NAME();
               }
           }
           /**
            * �i�ڔԍ��ɑ΂���v�ʒP�ʂ��擾���܂��B
            *
            * @param  �i�ڔԍ�
            * @return �v�ʒP��
            * @throws FoundationException
            * @throws SQLException DB�A�N�Z�X�Ɏ��s
            * @throws AA0180010NoDataException DB�A�N�Z�X�Ɏ��s
            */
           private String getStockUnit(String itemCd)
                   throws FoundationException, SQLException, AA0180010NoDataException
           {
               AA0180010Struct workStruct = new AA0180010Struct();
               workStruct.setLower_ITEM_CD(itemCd);
               List workList = entity.mSelect.read(conn, workStruct);
               if (workList == null || workList.isEmpty()) {
                   // �i�ڔԍ������݂��Ȃ��ꍇ
                   throw new AA0180010NoDataException(new ExpjMessage("ZZ01006",
                           "M_ITEM.ITEM_CD:" + itemCd));
               }
               workStruct = (AA0180010Struct)workList.get(0);
               if (workStruct.getLower_STOCK_UNIT() == null) {
                   return "";
               } else {
                   return workStruct.getLower_STOCK_UNIT();
               }
           }

// 2008/07/22 SYSCOM �镔 ADD START
           /**
            * �i�ڔԍ��ɑ΂���H���Ǘ��i�ڋ敪���擾���܂��B
            *
            * @param  �i�ڔԍ�
            * @return �H���Ǘ��i�ڋ敪
            * @throws FoundationException
            * @throws SQLException DB�A�N�Z�X�Ɏ��s
            * @throws AA0180010NoDataException DB�A�N�Z�X�Ɏ��s
            */
           private String getManhourTyp(String itemCd)
                   throws FoundationException, SQLException, AA0180010NoDataException
           {
               AA0180010Struct workStruct = new AA0180010Struct();
               workStruct.setLower_ITEM_CD(itemCd);
               List workList = entity.mSelectMANHOUR_TYP.read(conn, workStruct);
               if (workList == null || workList.isEmpty()) {
                   // �i�ڔԍ������݂��Ȃ��ꍇ
                   throw new AA0180010NoDataException(new ExpjMessage("ZZ01006",
                           "M_ITEM.ITEM_CD:" + itemCd));
               }
               workStruct = (AA0180010Struct)workList.get(0);
               if (workStruct.getLower_MANHOUR_TYP() == null) {
                   return "";
               } else {
                   return workStruct.getLower_MANHOUR_TYP();
               }
           }
// 2008/07/22 SYSCOM �镔 ADD END
        
           /**
            * ���ϐ���ݒ肵�܂��B
            *
            * @throws FoundationException
            * @throws ExpjException �T�[�o�[�G���[
            */
           private void setEnvironment()
                   throws FoundationException, ExpjException
           {
               try {
                   PrivateConfig pc = new PrivateConfig(conn);
       
                   // �ő�W�J���x�����擾
                   _intMaxDevelopLevel = DEFAULT_MAX_DEVELOP_LEVEL;
                   Integer maxDevelopLevel = pc.getNumber("MAX_DISPLAY_PS_LEVEL");
                   if (maxDevelopLevel != null) {
                       int i = maxDevelopLevel.intValue();
                       if (i < 0) {
                           // �x���F�ő�W�J���x����0�ȏ��ݒ肵�Ă��������B
                           ExpjMessage emsg = new ExpjMessage("AA20017");
                           msgStruct.addError(emsg);
                           sysLog.warning(emsg, getsysUSER_CD());
                       } else {
                           _intMaxDevelopLevel = i;
                       }
                   }
       
                   // �f�t�H�[���g�����W�J���x�����擾
                   _intInitDevelopLevel = DEFAULT_INIT_DEVELOP_LEVEL;
                   Integer initDevelopLevel = pc.getNumber("INIT_DISPLAY_PS_LEVEL");
                   if (initDevelopLevel != null) {
                       int i = initDevelopLevel.intValue();
                       if (i < 0) {
                           // �x���F�����W�J���x����0�ȏ��ݒ肵�Ă��������B
                           ExpjMessage emsg = new ExpjMessage("AA20016");
                           msgStruct.addError(emsg);
                           sysLog.warning(emsg, getsysUSER_CD());
                       } else if (i > _intMaxDevelopLevel) {
                           // �x���F�����W�J���x���͍ő�W�J���x���i{0}�j�ȓ����w�肵�Ă��������B
                           ExpjMessage emsg = new ExpjMessage("AA20001",
                                   String.valueOf(_intMaxDevelopLevel));
                           msgStruct.addError(emsg);
                           sysLog.warning(emsg, getsysUSER_CD());
                           _intInitDevelopLevel = _intMaxDevelopLevel;
                       } else {
                           _intInitDevelopLevel = i;
                       }
                   }
       
                   // �ő�Ǎ��s����ݒ�
                   _intMaxReadNum = sp.getMaxLine(conn, 10);
       
               } catch (SQLException se) {
                   // �G���[�F�T�[�o�ŃG���[���������܂����B
                   ExpjMessage emsg = new ExpjMessage("ZZ01106");
                   sysLog.severe(emsg, getsysUSER_CD());
                   ExpjException ee = new ExpjException(se, emsg);
                   emsg = new ExpjMessage("ZZ01006", se.toString());
                   sysLog.severe(emsg, getsysUSER_CD());
                   throw ee;
               }
           }
       
           /**
            * ��ʂ����������܂��B
            */
           private void initializeScreen()
           {
               // �Ǎ���ԁi������ԁj��ݒ�
               setReadStatus(INITIAL);
               // struct��������
               struct.initialize();
               // list��������
               if (list != null) {
                   list.clear();
               }
               // �c���[��������
               flashTree = new XmlDocument();
               // �����W�J���x����ݒ�
               struct.setInitLevel(String.valueOf(_intInitDevelopLevel));
               // �ő�W�J���x����ݒ�
               struct.seth_MaxLevel(String.valueOf(_intMaxDevelopLevel));
           }
       
           /**
            * �ڍ׉�ʃf�[�^��Struct�����������܂��B
            */
           private void initializeDetStruct()
           {
               struct.setDetParent_ITEM_CD(null);
               struct.setDetParent_ITEM_NAME(null);
               struct.setDetParent_MRP_ODR_TYP(null);
               struct.setDetParent_OUTSIDE_TYP(null);
               struct.setDetComp_ITEM_CD(null);
               struct.setDetComp_ITEM_NAME(null);
               struct.setDetComp_MRP_ODR_TYP(null);
               struct.setDetComp_OUTSIDE_TYP(null);
               struct.setDet_PS_EDITION(null);
               struct.setDet_PS_UNIT_QTY("0.0/0.0");
               struct.setDet_STOCK_UNIT(null);
               struct.setDet_EFF_PHASE_IN_DATE(null);
               struct.setDet_EFF_PHASE_OUT_DATE(null);
               struct.setDet_PS_SPOIL("0.0");
               struct.setDet_CONS_TYP(null);
               struct.setDet_PS_LT_FLG(null);
               struct.setDet_PS_FIXED_LT("0");
               struct.setDet_PS_PROP_LT("0");
               struct.setDet_PS_PROP_LOT_SIZE("0.0");
               struct.setDet_PS_REF_NO("0");
               struct.setDet_COST_UP_TYP(null);
               struct.setDet_MRP_EXP_TYP(null);
// 2008/07/22 SYSCOM �镔 ADD START
               struct.setDet_MANHOUR_TYP(null);
// 2008/07/22 SYSCOM �镔 ADD END
           }
       
           /**
            * �R���{�{�b�N�X�̒l�A�l���X�g�A�\���������X�g��n���ƁA�l�ɑΉ�����\��������Ԃ��܂��B
            *
            * @param  val �R���{�{�b�N�X�̒l
            * @param  valList �R���{�{�b�N�X�̒l���X�g
            * @param  nameList �R���{�{�b�N�X�̕\���������X�g
            * @return �l�ɑΉ�����\������
            */
           private String getDisplayName(String val, List valList, List nameList)
           {
               if (val == null || val.equals("") == true) {
                   return null;
               }
               int i = valList.indexOf(val);
               if (i == -1) {
                   return null;
               } else {
                   return (String)nameList.get(i);
               }
           }

// 2008/07/22 SYSCOM �镔 ADD START
           /** �H���Ǘ��i�ڋ敪�R���{�{�b�N�X�l���X�g */
           private List _detManhourTypValList = null;
       
           /** �H���Ǘ��i�ڋ敪�R���{�{�b�N�X�\���������X�g */
           private List _detManhourTypNameList = null;
       
           /** �H���Ǘ��i�ڋ敪DB�l�ێ� */
           private String _manhourTyp = null;
       
           /**
            * �H���Ǘ��i�ڋ敪�ݒ�
            * @param value �H���Ǘ��i�ڋ敪
            */
           public void setManhourTyp(String value) {
            _manhourTyp = value;
           }
       
           /**
            * �H���Ǘ��i�ڋ敪�擾
            * @return String �H���Ǘ��i�ڋ敪
            */
           public String getManhourTyp()
           {
            return _manhourTyp;
           }
// 2008/07/22 SYSCOM �镔 ADD END

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
           /**
            * �ڍ׉�ʃf�[�^��Struct�𕡎ʂ��܂��B
            *
            * @param  detStruct AA0180010��Struct
            */
           private void copyDetStruct(AA0180010Struct detStruct)
           {
               struct.setDetParent_ITEM_CD(detStruct.getDetParent_ITEM_CD());
               struct.setDetParent_ITEM_NAME(detStruct.getDetParent_ITEM_NAME());
               struct.setDetParent_MRP_ODR_TYP(getDisplayName(detStruct.getDetParent_MRP_ODR_TYP(),
                       _detMrpOdrTypValList, _detMrpOdrTypNameList));
               struct.setDetParent_OUTSIDE_TYP(getDisplayName(detStruct.getDetParent_OUTSIDE_TYP(),
                       _detOutsideTypValList, _detOutsideTypNameList));
               struct.setDetComp_ITEM_CD(detStruct.getDetComp_ITEM_CD());
               struct.setDetComp_ITEM_NAME(detStruct.getDetComp_ITEM_NAME());
               struct.setDetComp_MRP_ODR_TYP(getDisplayName(detStruct.getDetComp_MRP_ODR_TYP(),
                       _detMrpOdrTypValList, _detMrpOdrTypNameList));
               struct.setDetComp_OUTSIDE_TYP(getDisplayName(detStruct.getDetComp_OUTSIDE_TYP(),
                       _detOutsideTypValList, _detOutsideTypNameList));
               struct.setDet_PS_EDITION(detStruct.getDet_PS_EDITION());
               struct.setDet_PS_UNIT_QTY(detStruct.getDet_PS_UNIT_QTY());
               struct.setDet_STOCK_UNIT(detStruct.getDet_STOCK_UNIT());
               struct.setDet_EFF_PHASE_IN_DATE(detStruct.getDet_EFF_PHASE_IN_DATE());
               struct.setDet_EFF_PHASE_OUT_DATE(detStruct.getDet_EFF_PHASE_OUT_DATE());
               struct.setDet_PS_SPOIL(detStruct.getDet_PS_SPOIL());
               struct.setDet_CONS_TYP(getDisplayName(detStruct.getDet_CONS_TYP(),
                       struct.getList_Sub1_CONS_TYP_val(), struct.getList_Sub1_CONS_TYP_name()));
               struct.setDet_PS_LT_FLG(getDisplayName(detStruct.getDet_PS_LT_FLG(),
                       _detPsLtFlgValList, _detPsLtFlgNameList));
               struct.setDet_PS_FIXED_LT(detStruct.getDet_PS_FIXED_LT());
               struct.setDet_PS_PROP_LT(detStruct.getDet_PS_PROP_LT());
               struct.setDet_PS_PROP_LOT_SIZE(detStruct.getDet_PS_PROP_LOT_SIZE());
               struct.setDet_PS_REF_NO(detStruct.getDet_PS_REF_NO());
               struct.setDet_COST_UP_TYP(getDisplayName(detStruct.getDet_COST_UP_TYP(),
                       struct.getList_Sub1_COST_UP_TYP_val(), struct.getList_Sub1_COST_UP_TYP_name()));
               struct.setDet_MRP_EXP_TYP(getDisplayName(detStruct.getDet_MRP_EXP_TYP(),
                       struct.getList_Sub1_MRP_EXP_TYP_val(), struct.getList_Sub1_MRP_EXP_TYP_name()));
// 2008/07/22 SYSCOM �镔 ADD START
               setManhourTyp(detStruct.getDet_MANHOUR_TYP());
               struct.setDet_MANHOUR_TYP(getDisplayName(getManhourTyp(),
                       _detManhourTypValList, _detManhourTypNameList));
// 2008/07/22 SYSCOM �镔 ADD END
           }
           /**
            * �ڍ׉�ʃf�[�^��Struct�𕡎ʂ��܂��B
            *
            * @param  detStruct AA0180010��Struct
            */
           private void copyDetStruct2(AA0180010Struct detStruct)
           {
               struct.setDet2ITEM_CD(detStruct.getDet2ITEM_CD());
               struct.setDet2ITEM_NAME(detStruct.getDet2ITEM_NAME());
               struct.setDet2PROC_CD(detStruct.getDet2PROC_CD());
               struct.setDet2PROC_NO(detStruct.getDet2PROC_NO());
               struct.setDet2PROC_NAME(detStruct.getDet2PROC_NAME());
               struct.setDet2WS_CD(detStruct.getDet2WS_CD());
               struct.setDet2WS_NAME(detStruct.getDet2WS_NAME());
               struct.setDet2COMPANY_CD(detStruct.getDet2COMPANY_CD());
               struct.setDet2VEND_CD(detStruct.getDet2VEND_CD());
               struct.setDet2VEND_NAME(detStruct.getDet2VEND_NAME());
               struct.setDet2FIXED_LT(detStruct.getDet2FIXED_LT());
               struct.setDet2PROP_LT(detStruct.getDet2PROP_LT());
               struct.setDet2SAFETY_LT(detStruct.getDet2SAFETY_LT());
               struct.setDet2PROP_LOT_SIZE(detStruct.getDet2PROP_LOT_SIZE());
               struct.setDet2SPOIL(detStruct.getDet2SPOIL());
               //�R���{�l�̑Ή����閼�̂��擾
               setTypeValueAboutProcGroup((AA0180010Struct)detStruct);
               struct.setDet2OUTSIDE_TYP(detStruct.getDet2OUTSIDE_TYP());
               struct.setDet2ACPT_INSPC_TYP(detStruct.getDet2ACPT_INSPC_TYP());
               struct.setDet2STANDARD_COST(detStruct.getDet2STANDARD_COST());
           }
       
           /**
            * Struct�̃T�u�P�ҏW�̈�����������܂��B
            */
           private void initializeSub1Struct() throws BusinessProcessException, FoundationException
           {
               struct.setSub1_PS_EDITION("1");
               struct.setSub1_PS_UNIT_DENOMINATOR("1.0");
               struct.setSub1_PS_UNIT_NUMERATOR("1.0");
               struct.setSub1_STOCK_UNIT(null);
               struct.setSub1_EFF_PHASE_IN_DATE(null);
               struct.setSub1_EFF_PHASE_OUT_DATE(null);
               struct.setSub1_PS_SPOIL("0.0");
               struct.setSub1_CONS_TYP(null);
               struct.setc_Sub1_PS_LT_FLG(null);
               struct.seth_Sub1_PS_LT_FLG(null);
               struct.setSub1_PS_FIXED_LT("0");
               struct.setSub1_PS_PROP_LT("0");
               struct.setSub1_PS_PROP_LOT_SIZE("1.0");
               struct.setSub1_PS_REF_NO("1");
               struct.setSub1_COST_UP_TYP("1");
               struct.setSub1_MRP_EXP_TYP("1");
               struct.seth_Sub1_MODIFY_COUNT(null);
               struct.setPLANT_CD(getsysPLANT_CD());
               try{
                // �V�X�e���p�����[�^�擾
                struct.setPARAM_INPUT_DATA("PS_EFF_PHASE_IN_DATE");
                List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
                if (sysParameterList!=null && sysParameterList.size()>0) {
                    AA0180010Struct sysParameterStruct = (AA0180010Struct) sysParameterList.get(0);
                    // �\���L���J�n��       
                    String ps_EFF_PHASE_IN_DATE = sysParameterStruct.getPARAM_RESULT_DATA();  
                    // �f*�f�ł���΁A�H��Ɩ����t��\������
                    if("*".equals(ps_EFF_PHASE_IN_DATE)){
                       List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
                       if(!temlist.isEmpty()){
                           // �\���L���J�n��  =  �Ɩ��^�p��
                           struct.setSub1_EFF_PHASE_IN_DATE(((AA0180010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());                            
                       }
                    } else {
                        if(checkDate(ps_EFF_PHASE_IN_DATE)){
                            try{
                               //���t�`���𔻕�
                               Date t = stringToDate(ps_EFF_PHASE_IN_DATE);
                               //[�p�����[�^]�D"�ݒ�l"!=null�̏ꍇ�A�L���J�n���t�@= [�p�����[�^]�D"�ݒ�l"
                               struct.setSub1_EFF_PHASE_IN_DATE(dateToString(t));
                            }catch(ParseException   e){
                               //"�L���J�n���̃p�����[�^���s���ł��B"
                               ExpjMessage emsg = new ExpjMessage("ZZ13001");
                               msgStruct.addError(emsg);
                               sysLog.warning(emsg, getsysUSER_CD());
                            }
                        } else if(!ps_EFF_PHASE_IN_DATE.toLowerCase().equals("null")){
                            //"�L���J�n���̃p�����[�^���s���ł��B"
                            ExpjMessage emsg = new ExpjMessage("ZZ13001");
                            msgStruct.addError(emsg);
                            sysLog.warning(emsg, getsysUSER_CD());
                        }
                    }
                } else {
                    struct.setSub1_EFF_PHASE_IN_DATE(null); 
                } 
                // �V�X�e���p�����[�^�擾
                struct.setPARAM_INPUT_DATA("PS_EFF_PHASE_OUT_DATE");
                List sysParameterList2 = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
                if (sysParameterList2 != null && sysParameterList2.size() > 0) {
                    AA0180010Struct sysParameterStruct = (AA0180010Struct) sysParameterList2.get(0);
                    // �\���L���I����
                    String ps_EFF_PHASE_OUT_DATE = sysParameterStruct.getPARAM_RESULT_DATA(); 
                    // �f*�f�ł���΁A�H��Ɩ����t��\������
                    if("*".equals(ps_EFF_PHASE_OUT_DATE)){
                       List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
                       if(!temlist.isEmpty()){
                           // �\���L���I����  =  �Ɩ��^�p��
                           struct.setSub1_EFF_PHASE_OUT_DATE(((AA0180010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());                               
                       }
                    } else {
                        if(checkDate(ps_EFF_PHASE_OUT_DATE)){
                            try{
                               //���t�`���𔻕�
                               Date t = stringToDate(ps_EFF_PHASE_OUT_DATE);
                               //[�p�����[�^]�D"�ݒ�l"!=null�̏ꍇ�A�L���J�n���t�@= [�p�����[�^]�D"�ݒ�l"
                               struct.setSub1_EFF_PHASE_OUT_DATE(dateToString(t));
                            }catch(ParseException   e){
                               //"�L���J�n���̃p�����[�^���s���ł��B"
                               ExpjMessage emsg = new ExpjMessage("ZZ13001");
                               msgStruct.addError(emsg);
                               sysLog.warning(emsg, getsysUSER_CD());
                            }
                        } else if(!ps_EFF_PHASE_OUT_DATE.toLowerCase().equals("null")){
                            //"�\���L���I�����̃p�����[�^���s���ł��B"
                            ExpjMessage emsg = new ExpjMessage("ZZ13002");
                            msgStruct.addError(emsg);
                            sysLog.warning(emsg, getsysUSER_CD());
                        }               
                    }
                } else {
                    struct.setSub1_EFF_PHASE_OUT_DATE(null);
                }
                }catch(SQLException e){
                    setSqlExceptionMsg(e);
                }
           }
       
           /**
            * �T�u�P��ʃf�[�^��Struct�𕡎ʂ��܂��B
            *
            * @param  sub1Struct AA0180010��Struct
            */
           private void copySub1Struct(AA0180010Struct sub1Struct)
           {
               struct.seth_Sub1Parent_ITEM_CD(sub1Struct.getSub1Parent_ITEM_CD());
               struct.setSub1Parent_ITEM_NAME(sub1Struct.getSub1Parent_ITEM_NAME());
               struct.seth_Sub1Comp_ITEM_CD(sub1Struct.getSub1Comp_ITEM_CD());
               struct.setSub1Comp_ITEM_NAME(sub1Struct.getSub1Comp_ITEM_NAME());
               struct.seth_Sub1_PS_EDITION(sub1Struct.getSub1_PS_EDITION());
               struct.setSub1_PS_UNIT_DENOMINATOR(sub1Struct.getSub1_PS_UNIT_DENOMINATOR());
               struct.setSub1_PS_UNIT_NUMERATOR(sub1Struct.getSub1_PS_UNIT_NUMERATOR());
               if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                   // ���W�J�̏ꍇ
                   struct.setSub1_STOCK_UNIT(sub1Struct.getSub1Comp_STOCK_UNIT());
               } else {
                   // �t�W�J�̏ꍇ
            	   struct.setSub1_STOCK_UNIT(sub1Struct.getSub1_STOCK_UNIT());
               }
               struct.setSub1_EFF_PHASE_IN_DATE(sub1Struct.getSub1_EFF_PHASE_IN_DATE());
               struct.setSub1_EFF_PHASE_OUT_DATE(sub1Struct.getSub1_EFF_PHASE_OUT_DATE());
               struct.setSub1_PS_SPOIL(sub1Struct.getSub1_PS_SPOIL());
               struct.setSub1_CONS_TYP(sub1Struct.getSub1_CONS_TYP());
               if (sub1Struct.geth_Sub1_PS_LT_FLG().equals("1") == true) {
                   struct.setc_Sub1_PS_LT_FLG("true");
               } else {
                   struct.setc_Sub1_PS_LT_FLG(null);
               }
               struct.setSub1_PS_FIXED_LT(sub1Struct.getSub1_PS_FIXED_LT());
               struct.setSub1_PS_PROP_LT(sub1Struct.getSub1_PS_PROP_LT());
               struct.setSub1_PS_PROP_LOT_SIZE(sub1Struct.getSub1_PS_PROP_LOT_SIZE());
               struct.setSub1_PS_REF_NO(sub1Struct.getSub1_PS_REF_NO());
               struct.setSub1_COST_UP_TYP(sub1Struct.getSub1_COST_UP_TYP());
               struct.setSub1_MRP_EXP_TYP(sub1Struct.getSub1_MRP_EXP_TYP());
               struct.seth_Sub1_MODIFY_COUNT(sub1Struct.geth_Sub1_MODIFY_COUNT());
           }
        
        
                   /**
            * Struct�̃T�u�Q�ҏW�̈�����������܂��B
            */
           private void initializeSub2Struct() throws BusinessProcessException, FoundationException
           {
               struct.setSub2_PROC_CD(null);
               struct.setSub2_PROC_NAME(null);
               struct.setSub2_PROC_NO(null);
               struct.setSub2_SPOIL("0.0");
               struct.setSub2_FIXED_LT("0");
               struct.setSub2_PROP_LT("0");
               struct.setSub2_PROP_LOT_SIZE("1");
               struct.setSub2_STOCK_UNIT(null);
               struct.setSub2_SAFETY_LT("0");
               struct.setSub2_OUTSIDE_TYP("1");
               struct.setSub2_WS_CD(null);
               struct.setSub2_WS_NAME(null);
               struct.setSub2_VEND_CD(null);
               struct.setSub2_VEND_NAME(null);
               struct.setSub2_ACPT_INSPC_TYP("1");
               struct.setSub2_STANDARD_COST("0");
            try {
                // �V�X�e���p�����[�^�擾
                struct.setPARAM_INPUT_DATA("PROC_GRP_LT_UNIT");
                List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
                
                if (sysParameterList!=null && sysParameterList.size()>0) {
                    AA0180010Struct sysParameterStruct = (AA0180010Struct) sysParameterList.get(0);
                    String paramResult = sysParameterStruct.getPARAM_RESULT_DATA();         
                    /** ��ƌn��Œ蕪���[�h�^�C���P�� */
                    struct.setsub2_STOCK_UNIT_1(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
                    /** ��ƌn���ᕪ���[�h�^�C���P�� */
                    struct.setsub2_STOCK_UNIT_2(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
                    /** ���S�����P�� */
                    struct.setsub2_STOCK_UNIT_3(getTypeName(_PROC_GRP_LT_UNIT,paramResult));                                        
                }
            }catch(SQLException e) {
                setSqlExceptionMsg(e);
            }catch(FoundationException e){
                throw e;    
            }
           }
       
           /**
            * �T�u�Q��ʃf�[�^��Struct�𕡎ʂ��܂��B
            *
            * @param  sub2Struct AA0180010��Struct
            */
           private void copySub2Struct(AA0180010Struct sub2Struct)
           {
               //struct.setSub2_PROC_CD(sub2Struct.getSub2_PROC_CD());
               struct.setSub2_ITEM_NAME(sub2Struct.getSub2_ITEM_NAME());
               struct.setSub2_PROC_NAME(sub2Struct.getSub2_PROC_NAME());
               struct.setSub2_PROC_NO(sub2Struct.getSub2_PROC_NO());
               struct.setSub2_SPOIL(sub2Struct.getSub2_SPOIL());
               struct.setSub2_FIXED_LT(sub2Struct.getSub2_FIXED_LT());
               struct.setSub2_PROP_LT(sub2Struct.getSub2_PROP_LT());
               struct.setSub2_PROP_LOT_SIZE(sub2Struct.getSub2_PROP_LOT_SIZE());
               struct.setSub2_STOCK_UNIT(sub2Struct.getSub2_STOCK_UNIT());
               struct.setSub2_SAFETY_LT(sub2Struct.getSub2_SAFETY_LT());
               struct.setSub2_OUTSIDE_TYP(sub2Struct.getSub2_OUTSIDE_TYP());
               struct.setSub2_WS_CD(sub2Struct.getSub2_WS_CD());
               struct.setSub2_WS_NAME(sub2Struct.getSub2_WS_NAME());
               struct.setSub2_VEND_CD(sub2Struct.getSub2_VEND_CD());
               struct.setSub2_VEND_NAME(sub2Struct.getSub2_VEND_NAME());
               struct.setSub2_ACPT_INSPC_TYP(sub2Struct.getSub2_ACPT_INSPC_TYP());
               struct.setSub2_STANDARD_COST(sub2Struct.getSub2_STANDARD_COST());
               struct.seth_Sub2_MODIFY_COUNT(sub2Struct.geth_Sub2_MODIFY_COUNT());
           }       
        
        //����ƌn�񃁃��e�i���X�p�R�[�hstart��
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
        
       /**************/
        
        /** ��ƌn��Œ蕪���[�h�^�C���P�� */
        ComboStruct _PROC_GRP_LT_UNIT = new ComboStruct();
           
        /** ��ƌn��Œ蕪���[�h�^�C���P�ʐݒ�
         * @param �R���{�{�b�N�X�f�[�^
         */
        public void setPROC_GRP_LT_UNIT_comb(ComboStruct combo) { _PROC_GRP_LT_UNIT = combo; }
           
        /** ��ƌn��Œ蕪���[�h�^�C���P�ʎ擾
         * @return ��ƌn��Œ蕪���[�h�^�C���P�ʂ̃R���{�{�b�N�X�f�[�^
         */
        public ComboStruct getPROC_GRP_LT_UNIT_comb() { return _PROC_GRP_LT_UNIT; } 
        
       /**************/
        
// 2008/07/22 SYSCOM �镔 ADD START
        /** �\���Ǘ��i�ڋ敪 */
        ComboStruct _MANHOUR_TYP = new ComboStruct();
           
        /** �\���Ǘ��i�ڋ敪�ݒ�
         * @param �R���{�{�b�N�X�f�[�^
         */
        public void setMANHOUR_TYP_comb(ComboStruct combo) { _MANHOUR_TYP = combo; }
           
        /** �\���Ǘ��i�ڋ敪�擾
         * @return ��ƌn��Œ蕪���[�h�^�C���P�ʂ̃R���{�{�b�N�X�f�[�^
         */
        public ComboStruct getMANHOUR_TYP_comb() { return _MANHOUR_TYP; } 
// 2008/07/22 SYSCOM �镔 ADD END

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
//        /**
//         * �i�ڏ��̃t���O�̕\����ݒ�
//         * @param s �t���O�̒l���ݒ肳��Ă�����
//         */
//        private void setTypeValueAboutItem(AA0180010Struct s)
//        {
//         s.setITEM_MRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
//         s.setITEM_OUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getITEM_OUTSIDE_TYP()));
//         s.setITEM_OPR_RSLT_NAME(getTypeName(_OPR_RSLT_TYP,s.getOPR_RSLT_TYP()));
//        }
        /**
         * ��ƌn����̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����
         */
        private void setTypeValueAboutProcGroup(AA0180010Struct s)
        {
         s.setDet2OUTSIDE_TYP(getTypeName(_OUTSIDE_TYP,s.getDet2OUTSIDE_TYP()));
         s.setDet2ACPT_INSPC_TYP(getTypeName(_ACPT_INSPC_TYP,s.getDet2ACPT_INSPC_TYP()));
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
         private void setComboData(AA0180010Struct data) throws ExpjException
         {
         ComboBox comboController = new ComboBox(conn, sysUSER_CD);
         try{
          //�R���{�f�[�^�̎擾
          ComboStruct MRP_ODR_TYP_comb = comboController.getData("MRP_ODR_TYP");
          ComboStruct OUTSIDE_TYP_comb = comboController.getData("OUTSIDE_TYP");
          ComboStruct OPR_RSLT_TYP_comb = comboController.getData("OPR_RSLT_TYP");
          ComboStruct ACPT_INSPC_TYP_comb = comboController.getData("ACPT_INSPC_TYP");
          ComboStruct PROC_GRP_LT_UNIT_comb = comboController.getData("PROC_GRP_LT_UNIT");
// 2008/07/22 SYSCOM �镔 ADD START
          ComboStruct MANHOUR_TYP_comb = comboController.getData("MANHOUR_TYP");
// 2008/07/22 SYSCOM �镔 ADD END
          comboController.setConnection(null);
       
          //�����Ɏ擾�f�[�^�ݒ�
          setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
          setOUTSIDE_TYP_comb(OUTSIDE_TYP_comb);
          setOPR_RSLT_TYP_comb(OPR_RSLT_TYP_comb);
          setACPT_INSPC_TYP_comb(ACPT_INSPC_TYP_comb);
          setPROC_GRP_LT_UNIT_comb(PROC_GRP_LT_UNIT_comb);
// 2008/07/22 SYSCOM �镔 ADD START
          setMANHOUR_TYP_comb(MANHOUR_TYP_comb);
// 2008/07/22 SYSCOM �镔 ADD END
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
        private AA0180010Struct _keyStruct = new AA0180010Struct();
       
        /** �L�[���Struct�̎擾 */
        public AA0180010Struct getKeyStruct(){ return _keyStruct; }
               
       
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
        private void checkStruct(AA0180010Struct checkStruct)
        {
         // ��ƌn��ԍ�
         if(checkStruct.getPROC_NO() == null
         || "".equals(checkStruct.getPROC_NO()))
          checkStruct.setPROC_NO(AA0180Common._PROC_NO);
       
         // ��ƌn��Œ蕪���[�h�^�C��
         if(checkStruct.getFIXED_LT() == null
         || "".equals(checkStruct.getFIXED_LT()))
          checkStruct.setFIXED_LT(AA0180Common._FIXED_LT);
       
         // ��ƌn���ᕪ���[�h�^�C��
         if(checkStruct.getPROP_LT() == null
         || "".equals(checkStruct.getPROP_LT()))
          checkStruct.setPROP_LT(AA0180Common._PROP_LT);    
       
         // ��ƌn����S����
         if(checkStruct.getSAFETY_LT() == null
         || "".equals(checkStruct.getSAFETY_LT()))
          checkStruct.setSAFETY_LT(AA0180Common._SAFETY_LT);
       
         // ��ƌn���ᕪ���b�g�T�C�Y
         if(checkStruct.getPROP_LOT_SIZE() == null
         || "".equals(checkStruct.getPROP_LOT_SIZE()))
          checkStruct.setPROP_LOT_SIZE(AA0180Common._PROP_LOT_SIZE);
       
         // ��ƌn��d����
         if(checkStruct.getSPOIL() == null
         || "".equals(checkStruct.getSPOIL()))
          checkStruct.setSPOIL(AA0180Common._SPOIL);
       
         // �W���H��
         if(checkStruct.getSTANDARD_COST() == null
         || "".equals(checkStruct.getSTANDARD_COST()))
          checkStruct.setSTANDARD_COST(AA0180Common._STANDARD_COST);
       
         return;
        }
       
       //-----------------------------------------------------------------------------
    /**
     * �Œ胊�[�h�^�C���`�F�b�N
     * @param itemStruct �i�ڏ��Struct
     * @throws SQLException 
     * @throws FoundationException 
     */
    private void checkLT(AA0180010Struct itemStruct) throws FoundationException, SQLException {
        
        // �Œ蕪���[�h�^�C���`�F�b�N
        AA0180010Struct param = new AA0180010Struct();
        param.setPLANT_CD(getsysPLANT_CD());
        param.setITEM_CD(itemStruct.getITEM_CD());
        List procGrpList = entity.mselectSumM_PROC_GRP.read(conn, param); 

        long fixed_lt  = 0;    //��ƌn��Œ蕪���[�h�^�C�����v�l
        long prop_lt   = 0;    //��ƌn���ᕪ���[�h�^�C�����v�l

        if (procGrpList.size() > 0) {
            AA0180010Struct procGrpStruct = (AA0180010Struct)procGrpList.get(0);
            if ( procGrpStruct.getSUM_FIXED_LT() != null 
                    && ! (procGrpStruct.getSUM_FIXED_LT()).equals("")
                    && procGrpStruct.getSUM_PROP_LT() != null 
                    && ! (procGrpStruct.getSUM_PROP_LT()).equals("")) {
                fixed_lt    = Long.parseLong(procGrpStruct.getSUM_FIXED_LT());
                prop_lt     = Long.parseLong(procGrpStruct.getSUM_PROP_LT());
            }
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
         * �Ώۃf�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
         * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
         *
         * @param target_struct �Ώۃf�[�^���
         * @param modify_count �Ώۃf�[�^MODIFY_COUNT
         * @return boolean true:�G���[���� false:�G���[�Ȃ�
         */
        private boolean checkTargetDataInM_PROC_GRP(AA0180010Struct target_struct, String modify_count) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // �����Ώۃf�[�^�̑��݃`�F�b�N
         List temp_list = new ArrayList(0);
//         temp_list = entity.mSelectOne_for_update_nowait.read(conn, target_struct);
         temp_list = entity.mselectM_PROC_GRP_modify_count.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          
          listMessage.add("M_PROC_GRP.PLANT_CD:" + target_struct.getPLANT_CD());
          listMessage.add("M_PROC_GRP.ITEM_CD:" + target_struct.getITEM_CD());
          listMessage.add("M_PROC_GRP.PROC_CD:" + target_struct.getPROC_CD());
       
          setErrorMessage("ZZ06001", listMessage);
          return true;
         }
         else
         {
          // ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
          AA0180010Struct temp_struct = (AA0180010Struct)temp_list.get(0);
          if(temp_struct.getMODIFY_COUNT().equals(modify_count) != true)
          {
           
           listMessage.add("M_PROC_GRP.PLANT_CD:" + target_struct.getPLANT_CD());
           listMessage.add("M_PROC_GRP.ITEM_CD:" + target_struct.getITEM_CD());
           listMessage.add("M_PROC_GRP.PROC_CD:" + target_struct.getPROC_CD());
       
           setErrorMessage("ZZ01105", listMessage);
           return true;
          }
         }
       
         return false;
        }
       
       
        /**
         * �i�ڏ��ݒ菈��
         * @param target_struct �ݒ�Ώ�
         * @param w_itemList �i�ڏ�񃊃X�g
         */
        private void setItemInfo(AA0180010Struct target_struct, List w_itemList)
        {
         if(w_itemList.size() <= 0)
         {
          target_struct.setSTOCK_UNIT("");
         }
         else
         {
          AA0180010Struct itemStruct = (AA0180010Struct)w_itemList.get(0);
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
        //����ƌn�񃁃��e�i���X�p�R�[�hend��

    /** 
     * �w��L�[�̐��i�\�������ɍ폜�ς݂��`�F�b�N
     * ����e�i�ڂɑ΂��鉺�ʃm�[�h�ɂ́A�������i�\���q�i�ڂ�������o�ꂷ�邱�Ƃ����邽��
     * ���肪�K�v
     * @param targetList �`�F�b�N�Ώۂ�List
     * @param targetStruct �`�F�b�N�Ώۂ�Struct
     * @return true:�����Ă��Ȃ��Afalse:�����Ă���
     * @throws SQLException 
     * @throws FoundationException 
     */
    private boolean checkAlreadyDelete(ArrayList targetList,AA0180010Struct targetStruct) 
        throws FoundationException, SQLException {
        
        for (int i = 0 ; i < targetList.size() ; i++) {
            AA0180010Struct deletedStruct = (AA0180010Struct)targetList.get(i);
            if (deletedStruct.getUpper_ITEM_CD().equals(targetStruct.getUpper_ITEM_CD())
                    && deletedStruct.getLower_ITEM_CD().equals(targetStruct.getLower_ITEM_CD())
                    && deletedStruct.getPS_EDITION().equals(targetStruct.getPS_EDITION())) {
                
                //�w��L�[�̍\�������ɍ폜�ς݂̏ꍇ�́Afalse
                return false;
            }
        }
        return true;
        

    }


        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                      Element rootElement = null;
                      Element topNodeElement = null;
              
                      try {
                          // �Ǎ��L�[���c���āAStruct���N���A
                          String saveTargetItemCd = struct.getTarget_ITEM_CD();
                          String saveInitLevel = struct.getInitLevel();
                          String saveTargetDate = struct.getTargetDate();
                          String saveDevelopTyp = struct.getDEVELOP_TYP();
                          initializeScreen();
                          struct.setTarget_ITEM_CD(saveTargetItemCd);
                          struct.setInitLevel(saveInitLevel);
                          struct.setTargetDate(saveTargetDate);
                          struct.setDEVELOP_TYP(saveDevelopTyp);
                          // �ő�W�J���x���`�F�b�N
                          int initLevel = Integer.parseInt(struct.getInitLevel());
                          if (initLevel > _intMaxDevelopLevel) {
                              // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
                              // �ő�W�J���x���𒴂����ꍇ
                              throw new AA0180010MaxLevelException();
                          }
                          // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
                          beginTransaction();     // �V�X�e���������擾
                          _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                                  struct.getsSysdate());
                          // �Ώۓ��t��ݒ�
                          _targetDate = struct.getTargetDate();
              
                          // �i�ڔԍ��A�i�ږ���ݒ�
                          struct.setLower_ITEM_CD(struct.getTarget_ITEM_CD());
                          struct.setLower_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
              
                          // �h�L�������gRoot���쐬�A�c���[�pXML�ɒǉ�
                          rootElement = flashTree.createElement("root");
                          flashTree.appendChild(rootElement);
                          // �h�L�������gRoot�ɏ����W�J���x����ݒ�
                          rootElement.setAttribute("init_level", struct.getInitLevel());
              
                          // �ŏ�ʃ��x���m�[�h�𐶐��A�c���[�pXML�ɒǉ�
                          topNodeElement = flashTree.createElement("node");
                          rootElement.appendChild(topNodeElement);
                          // struct����ŏ�ʃ��x���m�[�h�̊e�푮���f�[�^��ݒ�
                          // �ŏ�ʃ��x���m�[�h�́ALower_ITEM_CD�����Lower_ITEM_NAME�̂�
                          struct.setlabel(struct.getLower_ITEM_CD() + "," + struct.getLower_ITEM_NAME());
                          struct.seth_ProcTyp("PS");     
                          // �����Ӂ�
                          //   Flash ���i�̎d�l�ŁA�m�[�h�̃��x���Ƃ��āu1�v����_�Ƃ���K�v������܂��B
                          setStruct2XML(topNodeElement, struct, 1, 1, 0);
              
                          // ���ʃ��x���m�[�h��W�J�i�ċA�I�Ƀc���[��W�J����j
                          // �����Ӂ�
                          //   �m�[�h�̃��x���̊�_���u1�v�Ȃ̂ŁA
                          //   �����W�J���x�����u+1�v���Ă����K�v������܂��B
                          expandTree(topNodeElement, struct, 1, 2, _intMaxReadNum, 2, initLevel + 1);
              
                          // �Ǎ���ԁi�Ǎ������j��ݒ�
                          setReadStatus(NORMAL);
              
                      } catch (AA0180010MaxLevelException mle) {
                          // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
                          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                          setReadStatus(ERROR);
                          // �x���F�����W�J���x���͍ő�W�J���x���i{0}�j�ȓ����w�肵�Ă��������B
                          ExpjMessage emsg = new ExpjMessage("AA20001", String.valueOf(_intMaxDevelopLevel));
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          return;
                      } catch (AA0180010NoDataException nde) {
                          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                          setReadStatus(ERROR);
                          // �x���F�Ώۃf�[�^�����݂��܂���B
                          ExpjMessage emsg = new ExpjMessage("ZZ06001");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = nde.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (AA0180010MaxReadException mle) {
                          // �Ǎ���ԁi�ő�s���I�[�o�[�j��ݒ�
                          setReadStatus(TOO_MANY);
                          // �ŏ�ʍs�݂̂�W�J�s�s�Ƃ��ĕ\��
                          rootElement.removeChild(topNodeElement);
                          Element stopNodeElement = flashTree.createElement("node");
                          rootElement.appendChild(stopNodeElement);
                          setStruct2XML(stopNodeElement, struct, 1, 1, 0);
                          stopNodeElement.setAttribute("terminated", "true");
                          // �x���F�\���������K��l(%0)�𒴂��Ă��܂��B������ύX���Ă�蒼���Ă��������B
                          ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_intMaxReadNum));
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          stopNodeElement.setAttribute("terminate_comment",
                                  emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
                          emsg = mle.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (ParseException pe) {
                          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                          setReadStatus(ERROR);
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(pe, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          throw ee;
                      } catch (SQLException se) {
                          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                          setReadStatus(ERROR);
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * FlashTree�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlFlashTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");
			//{{user_implement_dev:<controlFlashTree>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlFlashTree>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");

		return;
	}

	/**
	 * �\���ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
              
          try {

              if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                  // ���W�J�̏ꍇ
                  struct.setSub1Parent_ITEM_CD(struct.getLower_ITEM_CD());
                  struct.seth_Sub1Parent_ITEM_CD(struct.getLower_ITEM_CD());
                  struct.setSub1Parent_ITEM_NAME(getItemName(struct.getSub1Parent_ITEM_CD()));
              } else {
                  // �t�W�J�̏ꍇ
                      struct.setSub1Comp_ITEM_CD(struct.getLower_ITEM_CD());
                      struct.seth_Sub1Comp_ITEM_CD(struct.getLower_ITEM_CD());
                      struct.setSub1Comp_ITEM_NAME(getItemName(struct.getSub1Comp_ITEM_CD()));
                  }
                  struct.seth_Target_ITEM_CD(struct.getTarget_ITEM_CD());
                  struct.seth_TargetDate(struct.getTargetDate());
                  struct.seth_DEVELOP_TYP(struct.getDEVELOP_TYP());
                  struct.seth_InitLevel(struct.getInitLevel());
      
                  // Struct�̃T�u�P��ʕҏW�̈敔���̏�����
                  initializeSub1Struct();
      
                  // �Ǎ���ԁi�Ǎ������j��ݒ�
                  setReadStatus(NORMAL);
      
          } catch (AA0180010NoDataException nde) {
                  // �Ǎ���ԁi�Ǎ����s�j��ݒ�
              setReadStatus(ERROR);
              // �x���F�Ώۃf�[�^�����݂��܂���B
              ExpjMessage emsg = new ExpjMessage("ZZ06001");
              msgStruct.addError(emsg);
              sysLog.warning(emsg, getsysUSER_CD());
              emsg = nde.getExpjMessage();
              if (emsg != null) {
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());
              }
              return;
          } catch (SQLException se) {
              // �Ǎ���ԁi�Ǎ����s�j��ݒ�
              setReadStatus(ERROR);
              // �G���[�F�T�[�o�ŃG���[���������܂����B
              ExpjMessage emsg = new ExpjMessage("ZZ01106");
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(se, emsg);
              if (_psMaint != null) {
                  emsg = _psMaint.getErrorInfo();
                  if (emsg != null) {
                      sysLog.severe(emsg, getsysUSER_CD());
                  }
              }
              emsg = new ExpjMessage("ZZ01006", se.toString());
              sysLog.severe(emsg, getsysUSER_CD());
              throw ee;
          }
              
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �\���C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
              
        List listMessage = new ArrayList();

        try {
            if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                // ���W�J�̏ꍇ
                struct.setSub1Parent_ITEM_CD(struct.getUpper_ITEM_CD());
                struct.setSub1Comp_ITEM_CD(struct.getLower_ITEM_CD());
            } else {
                // �t�W�J�̏ꍇ
                struct.setSub1Parent_ITEM_CD(struct.getLower_ITEM_CD());
                struct.setSub1Comp_ITEM_CD(struct.getUpper_ITEM_CD());
            }
            struct.setSub1_PS_EDITION(struct.getPS_EDITION());
            List workList = entity.mSelectSub1.read(conn, struct);
            if (workList == null || workList.isEmpty()) {
                // �x���F���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
                ExpjMessage emsg = new ExpjMessage("ZZ01105");
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
                return;
            }

            copySub1Struct((AA0180010Struct)workList.get(0));

            if(struct.geth_Sub1_MODIFY_COUNT().equals(struct.getMODIFY_COUNT()) == false){
                // �X�V�������s�F���̏����ɂ��f�[�^�������������Ă��܂�
                listMessage.add("M_PS.Parent_ITEM_CD:" + struct.getSub1Parent_ITEM_CD());
                listMessage.add("M_PS.Comp_ITEM_CD:" + struct.getSub1Comp_ITEM_CD());
                listMessage.add("M_PS.PS_EDITION:" +  struct.getSub1_PS_EDITION());
                setErrorMessage("ZZ01105", listMessage);
                return;
            }

            struct.seth_Sub1Parent_ITEM_CD(struct.getSub1Parent_ITEM_CD());
            struct.seth_Sub1Comp_ITEM_CD(struct.getSub1Comp_ITEM_CD());
            struct.seth_Sub1_PS_EDITION(struct.getSub1_PS_EDITION());
            struct.seth_Sub1_PS_UNIT_DENOMINATOR(struct.getSub1_PS_UNIT_DENOMINATOR());
            struct.seth_Sub1_PS_UNIT_NUMERATOR(struct.getSub1_PS_UNIT_NUMERATOR());
            struct.seth_Target_ITEM_CD(struct.getTarget_ITEM_CD());
            struct.seth_TargetDate(struct.getTargetDate());
            struct.seth_DEVELOP_TYP(struct.getDEVELOP_TYP());
            struct.seth_InitLevel(struct.getInitLevel());

            // �Ǎ���ԁi�Ǎ������j��ݒ�
            setReadStatus(NORMAL);

        } catch (SQLException se) {
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006",
                    "M_PS,M_ITEM:" + struct.getSub1Parent_ITEM_CD() + ","
                    + struct.getSub1Comp_ITEM_CD() + "," + struct.getSub1_PS_EDITION());
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
              
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                      // ���ϐ���ݒ�
                      setEnvironment();
              
                      // ��ʂ��������istruct�Clist���������j
                      initializeScreen();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �ꊇ�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
              
                      try {
                          // �g�����U�N�V�������J�n
                          conn.beginTransWeb();
              
                          // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
                          beginTransaction();     // �V�X�e���������擾
                          _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                                  struct.getsSysdate());
              
                          // ���i�\�����폜�i�폜�Ώۂ́A�C���f�b�N�X1�ȏ�̉��ʃ��x���s�j
                          List upperItemCdList = struct.getList_Upper_ITEM_CD();
                          List lowerItemCdList = struct.getList_Lower_ITEM_CD();
                          List psEditionList = struct.getList_PS_EDITION();
                          List modifyCountList = struct.getList_MODIFY_COUNT();
                          List detTypList = struct.getList_DET_TYP();
                          ArrayList alreadyDeleteList = new ArrayList();
                          int lowerItemCdListSize = 0;
                          if (lowerItemCdList != null) {
                              lowerItemCdListSize = lowerItemCdList.size();
                          }
                          if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                              // ���W�J�̏ꍇ
                              for (int i = 1; i < lowerItemCdListSize; i++) {
                                  if (detTypList.get(i).equals("PS")){
                                      // �w��L�[�ɂ���Ă��łɍ폜�ς݂�����
                                      AA0180010Struct targetStruct = new AA0180010Struct();
                                      targetStruct.setUpper_ITEM_CD((String)upperItemCdList.get(i));
                                      targetStruct.setLower_ITEM_CD((String)lowerItemCdList.get(i));
                                      targetStruct.setPS_EDITION((String)psEditionList.get(i));
                                      if (checkAlreadyDelete(alreadyDeleteList,targetStruct)==true){                                      
                                          _psMaint.deleteM_PS((String)upperItemCdList.get(i),
                                                  (String)lowerItemCdList.get(i), (String)psEditionList.get(i),
                                                  (String)modifyCountList.get(i));
                                          
                                          // �폜�����f�[�^�̃L�[��ޔ�
                                          alreadyDeleteList.add(targetStruct);
                                      }
                                  }
                              }
                          } else {
                              // �t�W�J�̏ꍇ
                              for (int i = 1; i < lowerItemCdListSize; i++) {
                                  if (detTypList.get(i).equals("PS")){
                                      // �w��L�[�ɂ���Ă��łɍ폜�ς݂�����
                                      AA0180010Struct targetStruct = new AA0180010Struct();
                                      targetStruct.setUpper_ITEM_CD((String)upperItemCdList.get(i));
                                      targetStruct.setLower_ITEM_CD((String)lowerItemCdList.get(i));
                                      targetStruct.setPS_EDITION((String)psEditionList.get(i));
                                      if (checkAlreadyDelete(alreadyDeleteList,targetStruct)==true){                                      
                                          _psMaint.deleteM_PS((String)lowerItemCdList.get(i),
                                                  (String)upperItemCdList.get(i), (String)psEditionList.get(i),
                                                  (String)modifyCountList.get(i));
                                          // �폜�����f�[�^�̃L�[��ޔ�
                                          alreadyDeleteList.add(targetStruct);
                                      }
                                  }
                              }
                          }
              
                          // �f�[�^���m��
                          conn.commit();
              
                          // �f�[�^���ēǍ����āA��ʂ�\��
                          controlSelect();
              
                      } catch (NoDataException nde) {
                          // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
                          ExpjMessage emsg = new ExpjMessage("ZZ01105");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  msgStruct.addError(emsg);
                                  sysLog.warning(emsg, getsysUSER_CD());
                              }
                          }
                          return;
                      } catch (ExpjBadException ebe) {
                          ExpjMessage emsg = ebe.getExpjMessage();
                          if (emsg == null) {
                              // �G���[�F�T�[�o�ŃG���[���������܂����B
                              emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ExpjException ee = new ExpjException(ebe, emsg);
                              throw ee;
                          }
                          // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
                          String value = emsg.getValue();
                          emsg = new ExpjMessage("ZZ01105");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", value);
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          return;
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } finally {
                          if (conn != null) {
                              conn.rollback();
                          }
                      }
              
                //}}user_implement_dev:<controlDeleteAll>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}

	/**
	 * ���̕i�ڂŐ��W�J�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowS_Tree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowS_Tree");
			//{{user_implement_dev:<controlShowS_Tree>
              
                      // ���̕i�ڂŐ��W�J�p�̃p�����^��ݒ�
                      struct.setTarget_ITEM_CD(struct.getLower_ITEM_CD());
                      struct.setDEVELOP_TYP(DEVELOP_NORMAL);
              
                      // ���̕i�ڂŐ��W�J�p�̃p�����^�ōēǍ����āA��ʂ�\��
                      controlSelect();
              
                //}}user_implement_dev:<controlShowS_Tree>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowS_Tree");

		return;
	}

	/**
	 * ���̕i�ڂŋt�W�J�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowR_Tree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowR_Tree");
			//{{user_implement_dev:<controlShowR_Tree>
              
                      // ���̕i�ڂŋt�W�J�p�̃p�����^��ݒ�
                      struct.setTarget_ITEM_CD(struct.getLower_ITEM_CD());
                      struct.setDEVELOP_TYP(DEVELOP_REVERSE);
              
                      // ���̕i�ڂŋt�W�J�p�̃p�����^�ōēǍ����āA��ʂ�\��
                      controlSelect();
              
                //}}user_implement_dev:<controlShowR_Tree>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowR_Tree");

		return;
	}

	/**
	 * �c���[�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAddTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");
			//{{user_implement_dev:<controlAddTree>
              
                      Element rootElement = null;
              
                      try {
                          // �ő�W�J���x���`�F�b�N
                          int treeLevel = Integer.parseInt(struct.getlvl());
                          // �����Ӂ�
                          //   �m�[�h�̃��x���̊�_���u1�v�Ȃ̂ŁA
                          //   �ő�W�J���x�����u+1�v���Ă����K�v������܂��B
                          if (treeLevel + 1 > _intMaxDevelopLevel + 1) {
                              // �ő�W�J���x���𒴂����ꍇ
                              // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
                              throw new AA0180010MaxLevelException();
                          }
              
                          // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
                          beginTransaction();     // �V�X�e���������擾
                          _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                                  struct.getsSysdate());
                          // �Ώۓ��t�̐ݒ�
                          _targetDate = struct.getTargetDate();
              
                          // �c���[�pXML�h�L�������g���č\�z
                          flashTree = new XmlDocument();
              
                          // �h�L�������gRoot���쐬�A�c���[�pXML�ɒǉ�
                          rootElement = flashTree.createElement("root");
                          flashTree.appendChild(rootElement);
                          // �h�L�������gRoot�Ƀc���[�ǉ��Ώ�id��ݒ�
                          rootElement.setAttribute("target", struct.getid());
              
                          // �ő�Ǎ��s����ݒ�
                          int maxReadNum = _intMaxReadNum;
                          int nodeId = Integer.parseInt(struct.getmaxid());
                            rootElement.setAttribute("icon1", "AD0020011CIcon03A");
                            rootElement.setAttribute("icon2", "AD0020011CIcon03B");
                                // ���ʃ��x���m�[�h��W�J
                          //   �����ł́A�P���x�������m�[�h��W�J����B
                          //   ���̂��߁A�ő�W�J���x���Ɍ��݂̃��x���{�P��n���Ă���B
                          expandTree(rootElement, struct, Integer.parseInt(struct.getid()), nodeId + 1,
                                  maxReadNum, treeLevel + 1, treeLevel + 1);
              
                      } catch (AA0180010MaxLevelException mle) {
                          // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
                          // �x���F�ő�W�J���x���i{0}�j�𒴂��ēW�J���邱�Ƃ͂ł��܂���B
                          ExpjMessage emsg = new ExpjMessage("AA20018", String.valueOf(_intMaxDevelopLevel));
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          return;
                      } catch (AA0180010NoDataException nde) {
                          // �x���F���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
                          ExpjMessage emsg = new ExpjMessage("ZZ01105");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = nde.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (AA0180010MaxReadException mle) {
                          // �W�J�s�s�Ƃ��ĕ\��
                          flashTree.removeChild(rootElement);
                          Element stopNodeElement = flashTree.createElement("node");
                          flashTree.appendChild(stopNodeElement);
                          stopNodeElement.setAttribute("target", struct.getid());
                          stopNodeElement.setAttribute("terminated", "true");
                          // �x���F�\���������K��l(%0)�𒴂��Ă��܂��B������ύX���Ă�蒼���Ă��������B
                          ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_intMaxReadNum));
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          stopNodeElement.setAttribute("terminate_comment",
                                  emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
                          emsg = mle.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (ParseException pe) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(pe, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          throw ee;
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      }
              
                //}}user_implement_dev:<controlAddTree>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");

		return;
	}

	/**
	 * �ڍ׏��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");
			//{{user_implement_dev:<controlShowDetail>

        String tableAndKeys = null;

        try {
            // �ڍ׏���ʂ̏�����
            initializeDetStruct();

            //�ڍ׉�ʏo�̓^�C�v 
            _detTyp = struct.getDET_TYP();
            if (struct.getid().equals("1") == true) {
                // �ŏ�ʃm�[�h�̏ꍇ
                // �e�i�ڔԍ��A�i�ږ��A�i�ڎ�z�敪�A�i�ړ��O��敪�݂̂�\��
                tableAndKeys = "M_ITEM:" + struct.getLower_ITEM_CD();
                List workList = entity.mSelectDetailTop.read(conn, struct);
                if (workList == null || workList.isEmpty()) {
                    throw new AA0180010NoDataException(new ExpjMessage("ZZ01006", tableAndKeys));
                }
                AA0180010Struct workStruct = (AA0180010Struct)workList.get(0);
                // �e�i�ڔԍ��A�i�ږ��A�i�ڎ�z�敪�A�i�ړ��O��敪�݂̂�\��
                struct.setDetParent_ITEM_CD(workStruct.getDetParent_ITEM_CD());
                struct.setDetParent_ITEM_NAME(workStruct.getDetParent_ITEM_NAME());
                struct.setDetParent_MRP_ODR_TYP(getDisplayName(
                        workStruct.getDetParent_MRP_ODR_TYP(),
                        _detMrpOdrTypValList, _detMrpOdrTypNameList));
                struct.setDetParent_OUTSIDE_TYP(getDisplayName(
                        workStruct.getDetParent_OUTSIDE_TYP(),
                        _detOutsideTypValList, _detOutsideTypNameList));
                struct.setDet_STOCK_UNIT(workStruct.getDet_STOCK_UNIT());
//2008/07/22 SYSCOM �镔 ADD START
                setManhourTyp(workStruct.getDet_MANHOUR_TYP());
                struct.setDet_MANHOUR_TYP(getDisplayName(getManhourTyp(),
                        _detManhourTypValList, _detManhourTypNameList));
//2008/07/22 SYSCOM �镔 ADD END
            } else {
                // �ŏ�ʃm�[�h�ȊO�̏ꍇ
                // ���ׂĂ̍��ڂ�\��
                AA0180010Struct workStruct = new AA0180010Struct();
                if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                    // ���W�J�̏ꍇ
                    workStruct.setDetParent_ITEM_CD(struct.getUpper_ITEM_CD());
                    workStruct.setDetComp_ITEM_CD(struct.getLower_ITEM_CD());
                    if (struct.getPROC_CD() != null && struct.getPROC_CD().equals("") == false) {
                        //���W�J�ŕ��o����̐��i�\���s�̏ꍇ�A���o�L�[���ǉ��Z�b�g
                        workStruct.setPLANT_CD(getsysPLANT_CD());
                        workStruct.setPROC_CD(struct.getPROC_CD());
                    }
                } else {
                    // �t�W�J�̏ꍇ
                    workStruct.setDetParent_ITEM_CD(struct.getLower_ITEM_CD());
                    workStruct.setDetComp_ITEM_CD(struct.getUpper_ITEM_CD());
                }
                workStruct.setPS_EDITION(struct.getPS_EDITION());
                tableAndKeys = "M_PS,M_ITEM:" + workStruct.getDetParent_ITEM_CD() + ","
                + workStruct.getDetComp_ITEM_CD() + "," + workStruct.getPS_EDITION();
                List workList = entity.mSelectDetail.read(conn, workStruct);
                if (workList == null || workList.isEmpty()) {
                    throw new AA0180010NoDataException(new ExpjMessage("ZZ01006", tableAndKeys));
                }
                copyDetStruct((AA0180010Struct)workList.get(0));
            }
        } catch (AA0180010NoDataException nde) {
            // �x���F�Ώۃf�[�^�����݂��܂���B
            ExpjMessage emsg = new ExpjMessage("ZZ06001");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
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

        }
              
                //}}user_implement_dev:<controlShowDetail>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub1Insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Insert");
			//{{user_implement_dev:<controlSub1Insert>
              
                      try {
                          // �g�����U�N�V�������J�n
                          conn.beginTransWeb();
              
                          // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
                          beginTransaction();     // �V�X�e���������擾
                          _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                                  struct.getsSysdate());
                          // �Ώۓ��t�̐ݒ�
                          _targetDate = struct.geth_TargetDate();
                          
                          // �L���J�n���̃p�����[�^�`�F�b�N
                          if(!checkDate(struct.getSub1_EFF_PHASE_IN_DATE())){
                             ExpjMessage emsg = new ExpjMessage("ZZ13001"); 
                             msgStruct.addError(emsg);
                             sysLog.warning(emsg, getsysUSER_CD());
                             return;
                          }
                          // �L���I�����̃p�����[�^�`�F�b�N
                          if(!checkDate(struct.getSub1_EFF_PHASE_OUT_DATE())){
                             ExpjMessage emsg = new ExpjMessage("ZZ13002"); 
                             msgStruct.addError(emsg);
                             sysLog.warning(emsg, getsysUSER_CD());
                             return;
                          }
              
                          // �i�ڂ̓��ꐫ����
                          if (struct.getSub1Parent_ITEM_CD().equals(struct.getSub1Comp_ITEM_CD()) == true) {
                              // �x���F����i�ڔԍ��͒ǉ��ł��܂���B
                              ExpjMessage emsg = new ExpjMessage("AA00051");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                        boolean checkResult = false;
                        checkResult = entity.mcheckM_BY_PRODUCT.check(conn, struct);
                        if (checkResult) {
                            ExpjMessage emsg = new ExpjMessage("AA20053");  //�m���Y���n�ɑ��݂��邽�ߎg�p�ł��܂���B
                            msgStruct.addError(emsg);
                            sysLog.warning(emsg, getsysUSER_CD());
                            return;
                        }

// 2008/07/22 SYSCOM �镔 ADD START
                          // �i�ڂ̍H���Ǘ��i�ڋ敪����
                          _psMaint.testManhourTyp(struct.getSub1Parent_ITEM_CD());
// 2008/07/22 SYSCOM �镔 ADD END

                          // ���i�\���̕i�ڎ�z�敪����
                          _psMaint.testMrpOrderType(struct.getSub1Parent_ITEM_CD(),
                                  struct.getSub1Comp_ITEM_CD());
              
                          // ���i�\���̏d�����Ԍ���
                          _psMaint.testConflictEffPhase(struct.getSub1Parent_ITEM_CD(),
                                  struct.getSub1Comp_ITEM_CD(), struct.getSub1_PS_EDITION(),
                                  struct.getSub1_EFF_PHASE_IN_DATE(), struct.getSub1_EFF_PHASE_OUT_DATE());
              
                          // ���i�\���̃��[�s���O����
                          if (struct.geth_DEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                              // ���W�J�̏ꍇ
                              _psMaint.testLoopingCompPs(struct.getSub1Parent_ITEM_CD(),
                                      struct.getSub1Comp_ITEM_CD());
                          } else {
                              // �t�W�J�̏ꍇ
                              _psMaint.testLoopingParentPs(struct.getSub1Parent_ITEM_CD(),
                                      struct.getSub1Comp_ITEM_CD());
                          }

                          // �Ɩ����t�̑��ݐ��`�F�b�N
                          if(getsysPLANT_CD() != null && !"".equals(getsysPLANT_CD())){
                             struct.setPLANT_CD(getsysPLANT_CD());
                             List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
                               if(temlist == null || temlist.size()<=0){
                                   // �Ɩ��^�p�� ���擾�ł��Ȃ������ꍇ
                                   ExpjMessage emsg = new ExpjMessage("KR00017");   
                                   msgStruct.addError(emsg);
                                   sysLog.warning(emsg, getsysUSER_CD());
                                   return;
                               }
                          } else {
                              // ���Џ�� ���擾�ł��Ȃ������ꍇ
                              ExpjMessage emsg = new ExpjMessage("KR00017");    
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }    
                          
                          // ���i�\����ǉ�
                          List attribute = new ArrayList(0);
                          attribute.add(struct.getSub1_PS_UNIT_DENOMINATOR());
                          attribute.add(struct.getSub1_PS_UNIT_NUMERATOR());
                          attribute.add(struct.getSub1_EFF_PHASE_IN_DATE());
                          attribute.add(struct.getSub1_EFF_PHASE_OUT_DATE());
                          attribute.add(struct.getSub1_PS_SPOIL());
                          attribute.add(struct.getSub1_CONS_TYP());
                          if (struct.getc_Sub1_PS_LT_FLG().equals("true") == true) {
                              attribute.add("1");
                          } else {
                              attribute.add("0");
                          }
                          attribute.add(struct.getSub1_PS_FIXED_LT());
                          attribute.add(struct.getSub1_PS_PROP_LT());
                          attribute.add(struct.getSub1_PS_PROP_LOT_SIZE());
                          attribute.add(struct.getSub1_PS_REF_NO());
                          attribute.add(struct.getSub1_COST_UP_TYP());
                          attribute.add(struct.getSub1_MRP_EXP_TYP());
                          _psMaint.addM_PS(struct.getSub1Parent_ITEM_CD(), struct.getSub1Comp_ITEM_CD(),
                          struct.getSub1_PS_EDITION(), attribute);
              
                          // �f�[�^���m��
                          conn.commit();
              
                          // �z���\�c���[�����e�i���X��ʂɕ��A
                          controlSub1Return();
              
// 2008/07/22 SYSCOM �镔 ADD START
                      } catch (PsManhourTypException pmte) {
                          // �x���F�H���Ǘ��i�ڂɁA���ʕi�ڂ̍\���ǉ��͍s���܂���B
                          ExpjMessage emsg = new ExpjMessage("AA00178");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = pmte.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
// 2008/07/22 SYSCOM �镔 ADD END
                      } catch (PsMrpOdrTypException pmote) {
                          // �x���F���̍\���͎�z�敪�ɖ���������܂��B
                          ExpjMessage emsg = new ExpjMessage("AA00052");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = pmote.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (PsEffPhaseException pepe) {
                          // �x���F�L�������d�����Ă��܂��B
                          ExpjMessage emsg = new ExpjMessage("AA00054");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = pepe.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (PsLoopException ple) {
                          // �x���F�\�����ɖ���������܂��B
                          ExpjMessage emsg = new ExpjMessage("AA00055");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = ple.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (NoDataException nde) {
                          // �x���F�Ώۃf�[�^�����݂��܂���B
                          ExpjMessage emsg = new ExpjMessage("ZZ06001");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  msgStruct.addError(emsg);
                                  sysLog.warning(emsg, getsysUSER_CD());
                              }
                          }
                          return;
                      } catch (ExpjBadException ebe) {
                          ExpjMessage emsg = ebe.getExpjMessage();
                          if (emsg == null) {
                              // �G���[�F�T�[�o�ŃG���[���������܂����B
                              emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ExpjException ee = new ExpjException(ebe, emsg);
                              throw ee;
                          }
                          // �x���F�u����i�ڔԍ��͊��ɐ��i�\���}�X�^�ɑ��݂��܂��B
                          String code = emsg.getCode();
                          String value = emsg.getValue();
                          emsg = new ExpjMessage(code);
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", value);
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          return;
                      } catch (ParseException pe) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(pe, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          throw ee;
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } finally {
                          if (conn != null) {
                              conn.rollback();
                          }
                      }
              
                //}}user_implement_dev:<controlSub1Insert>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Insert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub1Update() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Update");
			//{{user_implement_dev:<controlSub1Update>
              
                      try {
                          // �g�����U�N�V�������J�n
                          conn.beginTransWeb();
                        
                        boolean checkResult = false;
                        checkResult = entity.mcheckM_BY_PRODUCT.check(conn, struct);
                        if (checkResult) {
                            ExpjMessage emsg = new ExpjMessage("AA20053");  //�m���Y���n�ɑ��݂��邽�ߎg�p�ł��܂���B
                            msgStruct.addError(emsg);
                            sysLog.warning(emsg, getsysUSER_CD());
                            return;
                        }
                        
                          // ���i�\���̑��݃`�F�b�N
                          AA0180010Struct param = new AA0180010Struct();
                          param.setSub1Parent_ITEM_CD(struct.getSub1Parent_ITEM_CD());
                          param.setSub1Comp_ITEM_CD(struct.getSub1Comp_ITEM_CD());
                          param.setSub1_PS_EDITION(struct.getSub1_PS_EDITION());
                          List psList = entity.mSelectSub1.read(conn, param);
                          if (psList.size() == 0) {
                            // ���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
                            throw new ExpjBadException(new ExpjMessage("ZZ01105",
                                    "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
                                    + struct.getSub1Parent_ITEM_CD() + "," 
                                    + struct.getSub1Comp_ITEM_CD() + "," 
                                    + struct.getSub1_PS_EDITION()));                              
                          } else {
                              String modifyCount = 
                                  ((AA0180010Struct)psList.get(0)).geth_Sub1_MODIFY_COUNT();
                          
                              if (! modifyCount.equals(struct.geth_Sub1_MODIFY_COUNT())) {
                                    // ���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
                                    throw new ExpjBadException(new ExpjMessage("ZZ01105",
                                            "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
                                            + struct.getSub1Parent_ITEM_CD() + "," 
                                            + struct.getSub1Comp_ITEM_CD() + "," 
                                            + struct.getSub1_PS_EDITION()));  
                              }
                          }
                          // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
                          beginTransaction();     // �V�X�e���������擾
                          _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                                  struct.getsSysdate());
                          // �Ώۓ��t�̐ݒ�
                          _targetDate = struct.geth_TargetDate();
              
                          // ���i�\���̕i�ڎ�z�敪����
                          _psMaint.testMrpOrderType(struct.getSub1Parent_ITEM_CD(),
                                  struct.getSub1Comp_ITEM_CD());
              
                          // ���i�\���̏d�����Ԍ���
                          _psMaint.testConflictEffPhase(struct.getSub1Parent_ITEM_CD(),
                                  struct.getSub1Comp_ITEM_CD(), struct.getSub1_PS_EDITION(),
                                  struct.getSub1_EFF_PHASE_IN_DATE(), struct.getSub1_EFF_PHASE_OUT_DATE());
              
                          // ���i�\����ǉ�
                          List attribute = new ArrayList(0);
                          attribute.add(struct.getSub1_PS_UNIT_DENOMINATOR());
                          attribute.add(struct.getSub1_PS_UNIT_NUMERATOR());
                          attribute.add(struct.getSub1_EFF_PHASE_IN_DATE());
                          attribute.add(struct.getSub1_EFF_PHASE_OUT_DATE());
                          attribute.add(struct.getSub1_PS_SPOIL());
                          attribute.add(struct.getSub1_CONS_TYP());
                          if (struct.getc_Sub1_PS_LT_FLG().equals("true") == true) {
                              attribute.add("1");
                          } else {
                              attribute.add("0");
                          }
                          attribute.add(struct.getSub1_PS_FIXED_LT());
                          attribute.add(struct.getSub1_PS_PROP_LT());
                          attribute.add(struct.getSub1_PS_PROP_LOT_SIZE());
                          attribute.add(struct.getSub1_PS_REF_NO());
                          attribute.add(struct.getSub1_COST_UP_TYP());
                          attribute.add(struct.getSub1_MRP_EXP_TYP());
                          attribute.add(struct.geth_Sub1_MODIFY_COUNT());
                          _psMaint.modifyM_PS(struct.getSub1Parent_ITEM_CD(), struct.getSub1Comp_ITEM_CD(),
                                  struct.getSub1_PS_EDITION(), attribute);
              
                          // �f�[�^���m��
                          conn.commit();                              
                                                              
                          // �z���\�c���[�����e�i���X��ʂɕ��A
                          controlSub1Return();
              
                      } catch (PsMrpOdrTypException pmote) {
                          // �x���F���̍\���͎�z�敪�ɖ���������܂��B
                          ExpjMessage emsg = new ExpjMessage("AA00052");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = pmote.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (PsEffPhaseException pepe) {
                          // �x���F�L�������d�����Ă��܂��B
                          ExpjMessage emsg = new ExpjMessage("AA00054");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = pepe.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (ExpjBadException ebe) {
                          ExpjMessage emsg = ebe.getExpjMessage();
                          if (emsg == null) {
                              // �G���[�F�T�[�o�ŃG���[���������܂����B
                              emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ExpjException ee = new ExpjException(ebe, emsg);
                              throw ee;
                          }
                          // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
                          // �x���F�w��L�[�̃f�[�^�����݂��܂���B
                          String code = emsg.getCode();
                          String value = emsg.getValue();
                          emsg = new ExpjMessage(code);
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", value);
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          return;
                      } catch (ParseException pe) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(pe, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          throw ee;
                      } catch (SQLException se) {
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } finally {
                          if (conn != null) {
                              conn.rollback();
                          }
                      }
              
                //}}user_implement_dev:<controlSub1Update>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Update");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub1Return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Return");
			//{{user_implement_dev:<controlSub1Return>
              
                      // ���������f�[�^�𕜌�
                      struct.setTarget_ITEM_CD(struct.geth_Target_ITEM_CD());
                      struct.setTargetDate(struct.geth_TargetDate());
                      struct.setDEVELOP_TYP(struct.geth_DEVELOP_TYP());
                      struct.setInitLevel(struct.geth_InitLevel());
              
                      // �z���\�c���[�����e�i���X��ʂ�\��
                      controlSelect();
              
                //}}user_implement_dev:<controlSub1Return>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Return");

		return;
	}

	/**
	 * �ڍ׏��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowDetail2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail2");
			//{{user_implement_dev:<controlShowDetail2>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        
        String tableAndKeys = null;

        try {
            // �ڍ׏���ʂ̏�����
            initializeDetStruct();
            //�ڍ׉�ʏo�̓^�C�v 
            _detTyp = struct.getDET_TYP();

            AA0180010Struct workStruct = new AA0180010Struct();
            if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                // ���W�J�̏ꍇ
                workStruct.setDet2ITEM_CD(struct.getUpper_ITEM_CD());
            } else {
                // �t�W�J�̏ꍇ
                workStruct.setDet2ITEM_CD(struct.getLower_ITEM_CD());
            }
            //�i�ږ���ݒ�
            struct.setDet2ITEM_NAME(getItemName(workStruct.getDet2ITEM_CD()));
            
            workStruct.setPLANT_CD(getsysPLANT_CD());
            workStruct.setPROC_CD(struct.getPROC_CD());
            tableAndKeys = "M_PROC_GRP:" + workStruct.getPLANT_CD() + ","
            + workStruct.getDet2ITEM_CD() + "," + workStruct.getPROC_CD();
            List workList = entity.mSelectDetail2.read(conn, workStruct);
            if (workList == null || workList.isEmpty()) {
                throw new AA0180010NoDataException(new ExpjMessage("ZZ01006", tableAndKeys));
            }
            copyDetStruct2((AA0180010Struct)workList.get(0));
            
            // �V�X�e���p�����[�^�擾
            struct.setPARAM_INPUT_DATA("PROC_GRP_LT_UNIT");
            List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
            
            if (sysParameterList!=null && sysParameterList.size()>0) {
                AA0180010Struct sysParameterStruct = (AA0180010Struct) sysParameterList.get(0);
                String paramResult = sysParameterStruct.getPARAM_RESULT_DATA();         
                /** ��ƌn��Œ蕪���[�h�^�C���P�� */
                struct.setDet2FIXED_LT_UNIT(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
                /** ��ƌn���ᕪ���[�h�^�C���P�� */
                struct.setDet2PROP_LT_UNIT(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
                /** ��ᕪ���b�g�T�C�Y�P�� */
                struct.setDet2PROP_LOT_SIZE_UNIT(getStockUnit(workStruct.getDet2ITEM_CD()));
                /** ���S�����P�� */
                struct.setDet2SAFETY_LT_UNIT(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
            }           
        } catch (AA0180010NoDataException nde) {
            // �x���F�Ώۃf�[�^�����݂��܂���B
            ExpjMessage emsg = new ExpjMessage("ZZ06001");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
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

        }

                //}}user_implement_dev:<controlShowDetail2>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail2");

		return;
	}

	/**
	 * �n��ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsertProc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineInsertProc");
			//{{user_implement_dev:<controlLineInsertProc>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              
                      try {
             
                          struct.setSub2_ITEM_CD(struct.getLower_ITEM_CD());
                          struct.setSub2_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
                          struct.setSub2_STOCK_UNIT(getStockUnit(struct.getLower_ITEM_CD()));
                        
                          struct.seth_Target_ITEM_CD2(struct.getTarget_ITEM_CD());
                          struct.seth_TargetDate2(struct.getTargetDate());
                          struct.seth_DEVELOP_TYP2(struct.getDEVELOP_TYP());
                          struct.seth_InitLevel2(struct.getInitLevel());
// 2008/07/22 SYSCOM �镔 ADD START
                          struct.setMANHOUR_TYP(getManhourTyp(struct.getLower_ITEM_CD()));
// 2008/07/22 SYSCOM �镔 ADD END
              
                          // Struct�̃T�u�Q��ʕҏW�̈敔���̏�����
                          initializeSub2Struct();
              
                          // �Ǎ���ԁi�Ǎ������j��ݒ�
                          setReadStatus(NORMAL);
              
                      } catch (AA0180010NoDataException nde) {
                          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                          setReadStatus(ERROR);
                          // �x���F�Ώۃf�[�^�����݂��܂���B
                          ExpjMessage emsg = new ExpjMessage("ZZ06001");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, getsysUSER_CD());
                          emsg = nde.getExpjMessage();
                          if (emsg != null) {
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
                          return;
                      } catch (SQLException se) {
                          // �Ǎ���ԁi�Ǎ����s�j��ݒ�
                          setReadStatus(ERROR);
                          // �G���[�F�T�[�o�ŃG���[���������܂����B
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          if (_psMaint != null) {
                              emsg = _psMaint.getErrorInfo();
                              if (emsg != null) {
                                  sysLog.severe(emsg, getsysUSER_CD());
                              }
                          }
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      }
                
                //}}user_implement_dev:<controlLineInsertProc>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineInsertProc");

		return;
	}

	/**
	 * �n��C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdateProc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdateProc");
			//{{user_implement_dev:<controlLineUpdateProc>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        
        List listMessage = new ArrayList();
        
        try {
            struct.setPLANT_CD(getsysPLANT_CD());
            if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                // ���W�J�̏ꍇ
                struct.setSub2_ITEM_CD(struct.getUpper_ITEM_CD());
            } else {
                // �t�W�J�̏ꍇ
                struct.setSub2_ITEM_CD(struct.getLower_ITEM_CD());
            }
            struct.setSub2_PROC_CD(struct.getPROC_CD());
            
           List workList = entity.mSelectSub2.read(conn, struct);
            if (workList == null || workList.isEmpty()) {
                // �x���F���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
                ExpjMessage emsg = new ExpjMessage("ZZ01105");
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
                return;
            }

            copySub2Struct((AA0180010Struct)workList.get(0));

            struct.seth_Sub2_PROC_NO(struct.getSub2_PROC_NO());
            
            if(struct.geth_Sub2_MODIFY_COUNT().equals(struct.getMODIFY_CNT_PROC()) == false){
                // �X�V�������s�F���̏����ɂ��f�[�^�������������Ă��܂�
                listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getSub2_ITEM_CD());
                listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getSub2_PROC_CD());
                setErrorMessage("ZZ01105", listMessage);
                return;
            }
            
            struct.seth_Target_ITEM_CD2(struct.getTarget_ITEM_CD());
            struct.seth_TargetDate2(struct.getTargetDate());
            struct.seth_DEVELOP_TYP2(struct.getDEVELOP_TYP());
            struct.seth_InitLevel2(struct.getInitLevel());
// 2008/07/22 SYSCOM �镔 ADD START
            struct.setMANHOUR_TYP(getManhourTyp(struct.getSub2_ITEM_CD()));
// 2008/07/22 SYSCOM �镔 ADD END
            
            // �V�X�e���p�����[�^�擾
            struct.setPARAM_INPUT_DATA("PROC_GRP_LT_UNIT");
            List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
            
            if (sysParameterList!=null && sysParameterList.size()>0) {
                AA0180010Struct sysParameterStruct = (AA0180010Struct) sysParameterList.get(0);
                String paramResult = sysParameterStruct.getPARAM_RESULT_DATA();         
                /** ��ƌn��Œ蕪���[�h�^�C���P�� */
                struct.setsub2_STOCK_UNIT_1(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
                /** ��ƌn���ᕪ���[�h�^�C���P�� */
                struct.setsub2_STOCK_UNIT_2(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
                /** ���S�����P�� */
                struct.setsub2_STOCK_UNIT_3(getTypeName(_PROC_GRP_LT_UNIT,paramResult));                                        
            }
            
            // �Ǎ���ԁi�Ǎ������j��ݒ�
            setReadStatus(NORMAL);

// 2008/07/22 SYSCOM �镔 ADD START
        } catch (AA0180010NoDataException nde) {
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �x���F�Ώۃf�[�^�����݂��܂���B
            ExpjMessage emsg = new ExpjMessage("ZZ06001");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
// 2008/07/22 SYSCOM �镔 ADD END
        } catch (SQLException se) {
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006",
                    "M_PROC_GRP,M_ITEM:" + struct.getPLANT_CD() + ","
                    + struct.getSub2_ITEM_CD() + "," + struct.getSub2_PROC_CD());
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
        
                //}}user_implement_dev:<controlLineUpdateProc>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdateProc");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub2insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2insert");
			//{{user_implement_dev:<controlSub2insert>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //---------------------------------------------------------------------
        boolean transFlg = false;
        String Message = "";
        List listMessage = new ArrayList();
      
        try{
            //��ʍ���ID��PDConnecterWhere��������ID�փZ�b�g
            struct.setITEM_CD(struct.getSub2_ITEM_CD());
            struct.setPROC_CD(struct.getSub2_PROC_CD());
            struct.setPROC_NO(struct.getSub2_PROC_NO());
            struct.setWS_CD(struct.getSub2_WS_CD());
            struct.setVEND_CD(struct.getSub2_VEND_CD());
            struct.setPROP_LOT_SIZE(struct.getSub2_PROP_LOT_SIZE());
            struct.setPLANT_CD(getsysPLANT_CD());
            
         // ���ږ����͎��̃f�t�H���g�l�ݒ�
         checkStruct(struct);
      
         // �g�����U�N�V�����J�n
         conn.beginTransWeb();
         transFlg = true;
      
         boolean result = true;         // �`�F�b�N���ʊi�[
      
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
          AA0180010Struct itemStruct = (AA0180010Struct)itemList.get(0);
      
          // ��ЃR�[�h�擾
          List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
          if(companyList.size() > 0)
           struct.setCOMPANY_CD(((AA0180010Struct)companyList.get(0)).getCOMPANY_CD());
      
          // ��ƌn���ᕪ���b�g�T�C�Y�`�F�b�N
          boolean resultCeil = false;
          if(itemStruct.getUNIT_QTY_TYP().intValue() == 1){
           if(Calculate.isNumeric(struct.getPROP_LOT_SIZE()) == true){
            resultCeil = true;
            struct.setPROP_LOT_SIZE(Calculate.ceil(struct.getPROP_LOT_SIZE(), 0));
            struct.setSub2_PROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
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
      
      
          // �z���\�c���[�����e�i���X��ʂɕ��A
          controlSub2Return();
      
          // �Œ胊�[�h�^�C���`�F�b�N
          checkLT(itemStruct);
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
                //}}user_implement_dev:<controlSub2insert>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2insert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub2update() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2update");
			//{{user_implement_dev:<controlSub2update>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //---------------------------------------------------------------------
        boolean transFlg = false;
        String inProcNo = null;
        String Message = "";
        List listMessage = new ArrayList();
      
        try{
            //��ʍ���ID��PDConnecterWhere��������ID�փZ�b�g
            struct.setITEM_CD(struct.getSub2_ITEM_CD());
            struct.setPROC_CD(struct.getSub2_PROC_CD());
            struct.setPROC_NO(struct.getSub2_PROC_NO());
            struct.setWS_CD(struct.getSub2_WS_CD());
            struct.setVEND_CD(struct.getSub2_VEND_CD());
            struct.setPROP_LOT_SIZE(struct.getSub2_PROP_LOT_SIZE());
            struct.setMODIFY_COUNT(struct.geth_Sub2_MODIFY_COUNT());
            struct.setPLANT_CD(getsysPLANT_CD());
            
         // ���ږ����͎��̃f�t�H���g�l�ݒ�
         checkStruct(struct);
      
         // �g�����U�N�V�����J�n
         conn.beginTransWeb();
         transFlg = true;
      
         boolean result = true;         // �`�F�b�N���ʊi�[
      
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
           String modify = ((AA0180010Struct)countList.get(0)).getMODIFY_COUNT();
           if(struct.getMODIFY_COUNT().equals(modify) == false){
            // �X�V�������s�F���̏����ɂ��f�[�^�������������Ă��܂�", struct.getsUser_ID());
            listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
            listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
            listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
      
            setErrorMessage("ZZ01105", listMessage);
           }
          }
      
//          // ��ƌn��ԍ� �d���`�F�b�N
//          AA0180010Struct buffStruct = new AA0180010Struct(struct);
      
          // �������X�g���C���O�̍�ƌn��ԍ����擾
          inProcNo = struct.geth_Sub2_PROC_NO();
      
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
          AA0180010Struct itemStruct = (AA0180010Struct)itemList.get(0);
       
          // ��ЃR�[�h�擾
          List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
          if(companyList.size() > 0)
           struct.setCOMPANY_CD(((AA0180010Struct)companyList.get(0)).getCOMPANY_CD());
      
          // ��ƌn���ᕪ���b�g�T�C�Y�`�F�b�N
          boolean resultCeil = false;
          if(itemStruct.getUNIT_QTY_TYP().intValue() == 1){
           if(Calculate.isNumeric(struct.getPROP_LOT_SIZE()) == true){
            resultCeil = true;
            struct.setPROP_LOT_SIZE(Calculate.ceil(struct.getPROP_LOT_SIZE(), 0));
            struct.setSub2_PROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
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
      
          // �z���\�c���[�����e�i���X��ʂɕ��A
          controlSub2Return();
      
          // �Œ胊�[�h�^�C���`�F�b�N
          checkLT(itemStruct);
      
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
                //}}user_implement_dev:<controlSub2update>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2update");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub2Return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2Return");
			//{{user_implement_dev:<controlSub2Return>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              
                      // ���������f�[�^�𕜌�
                      struct.setTarget_ITEM_CD(struct.geth_Target_ITEM_CD2());
                      struct.setTargetDate(struct.geth_TargetDate2());
                      struct.setDEVELOP_TYP(struct.geth_DEVELOP_TYP2());
                      struct.setInitLevel(struct.geth_InitLevel2());
              
                      // �z���\�c���[�����e�i���X��ʂ�\��
                      controlSelect();
              
                //}}user_implement_dev:<controlSub2Return>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2Return");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub1Delete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Delete");
			//{{user_implement_dev:<controlSub1Delete>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        try {
            // �g�����U�N�V�������J�n
            conn.beginTransWeb();

            // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
            beginTransaction();     // �V�X�e���������擾
            _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                    struct.getsSysdate());

            // ���i�\�����폜
                _psMaint.deleteM_PS(struct.getSub1Parent_ITEM_CD(), struct.getSub1Comp_ITEM_CD(),
                        struct.getSub1_PS_EDITION(), struct.geth_Sub1_MODIFY_COUNT());
                
            // �f�[�^���m��
            conn.commit();

            // �z���\�c���[�����e�i���X��ʂɕ��A
            controlSub1Return();

        } catch (NoDataException nde) {
            // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
            ExpjMessage emsg = new ExpjMessage("ZZ01105");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, getsysUSER_CD());
                }
            }
            return;
        } catch (ExpjBadException ebe) {
            ExpjMessage emsg = ebe.getExpjMessage();
            if (emsg == null) {
                // �G���[�F�T�[�o�ŃG���[���������܂����B
                emsg = new ExpjMessage("ZZ01106");
                sysLog.severe(emsg, getsysUSER_CD());
                ExpjException ee = new ExpjException(ebe, emsg);
                throw ee;
            }
            // �x���F���̏����ɂ��f�[�^�������������Ă��܂��B���j���[�ɖ߂��Ă�蒼���ĉ������B
            String value = emsg.getValue();
            emsg = new ExpjMessage("ZZ01105");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", value);
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            return;
        } catch (SQLException se) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        } finally {
            if (conn != null) {
                conn.rollback();
            }
        }
                //}}user_implement_dev:<controlSub1Delete>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub1Delete");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSub2delete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2delete");
			//{{user_implement_dev:<controlSub2delete>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //----------------------------------------------------------------------
        boolean transFlg = false;
        List listMessage = new ArrayList();
      
        try{
         // �g�����U�N�V�����J�n
         conn.beginTransWeb();
         transFlg = true;
      
         // DELETE��where����struct�ݒ�
         AA0180010Struct deleteStruct = new AA0180010Struct();
         deleteStruct.setITEM_CD(struct.getSub2_ITEM_CD());
         deleteStruct.setPROC_CD(struct.getSub2_PROC_CD());
         deleteStruct.setPROC_NO(struct.getSub2_PROC_NO());
         deleteStruct.setWS_CD(struct.getSub2_WS_CD());
         deleteStruct.setVEND_CD(struct.getSub2_VEND_CD());
         deleteStruct.setPROP_LOT_SIZE(struct.getSub2_PROP_LOT_SIZE());
         deleteStruct.setMODIFY_COUNT(struct.geth_Sub2_MODIFY_COUNT());
         deleteStruct.setPLANT_CD(getsysPLANT_CD());
         
      
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
      
          // �z���\�c���[�����e�i���X��ʂɕ��A
          controlSub2Return();
      
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
      
          // �i�ڏ��擾
          List itemList = entity.mSelectM_ITEM.read(conn, struct);
          if(itemList.size() > 0){
           // �Œ胊�[�h�^�C���`�F�b�N
           checkLT((AA0180010Struct)itemList.get(0));
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
                //}}user_implement_dev:<controlSub2delete>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlSub2delete");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        // ���[�U��`������(�R���{�f�[�^�̎擾)
        usersInitialize();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                      // ���ϐ���ݒ�
                      setEnvironment();
              
                      // ��ʂ��������istruct�Clist���������j
                      initializeScreen();
                      // ���[�U��`������(�R���{�f�[�^�̎擾)
                      usersInitialize();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0180");
		logger.entering("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                          ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                          // �W�J�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                          ComboStruct developTyp = comboController.getData("DEVELOP_TYP");
                          struct.setList_DEVELOP_TYP_val(developTyp.getValList());
                          struct.setList_DEVELOP_TYP_name(developTyp.getExplanList());
                          // �x���敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                          ComboStruct sub1ConsTyp = comboController.getData("CONS_TYP");
                          struct.setList_Sub1_CONS_TYP_val(sub1ConsTyp.getValList());
                          struct.setList_Sub1_CONS_TYP_name(sub1ConsTyp.getExplanList());
                          // �����Ϗ�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                          ComboStruct sub1CostUpTyp = comboController.getData("COST_UP_TYP");
                          struct.setList_Sub1_COST_UP_TYP_val(sub1CostUpTyp.getValList());
                          struct.setList_Sub1_COST_UP_TYP_name(sub1CostUpTyp.getExplanList());
                          // MRP�W�J�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                          ComboStruct sub1MrpExpTyp = comboController.getData("MRP_EXP_TYP");
                          struct.setList_Sub1_MRP_EXP_TYP_val(sub1MrpExpTyp.getValList());
                          struct.setList_Sub1_MRP_EXP_TYP_name(sub1MrpExpTyp.getExplanList());
                          // �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                          ComboStruct detMrpOdrTyp = comboController.getData("MRP_ODR_TYP");
                          _detMrpOdrTypValList = detMrpOdrTyp.getValList();
                          _detMrpOdrTypNameList = detMrpOdrTyp.getExplanList();
                          // ���O��敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                          ComboStruct detOutsideTyp = comboController.getData("OUTSIDE_TYP");
                          _detOutsideTypValList = detOutsideTyp.getValList();
                          _detOutsideTypNameList = detOutsideTyp.getExplanList();
                          // ���i�\��LT�g�p�t���O�̓��e�\���p�i�R���{�{�b�N�X�j�f�[�^��ݒ�
                          ComboStruct detPsLtFlg = comboController.getData("PS_LT_FLG");
                          _detPsLtFlgValList = detPsLtFlg.getValList();
                          _detPsLtFlgNameList = detPsLtFlg.getExplanList();
// 2008/07/22 SYSCOM �镔 ADD START
                          // �H���Ǘ��i�ڋ敪�̓��e�\���p�i�R���{�{�b�N�X�j�f�[�^��ݒ�
                          ComboStruct detManhourTyp = comboController.getData("MANHOUR_TYP");
                          _detManhourTypValList = detManhourTyp.getValList();
                          _detManhourTypNameList = detManhourTyp.getExplanList();
// 2008/07/22 SYSCOM �镔 ADD END
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
		logger.exiting("AA0180010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("FlashTree") ) {
				controlFlashTree();
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("DeleteAll") ) {
				controlDeleteAll();
			} else if( button.equals("ShowS_Tree") ) {
				controlShowS_Tree();
			} else if( button.equals("ShowR_Tree") ) {
				controlShowR_Tree();
			} else if( button.equals("AddTree") ) {
				controlAddTree();
			} else if( button.equals("ShowDetail") ) {
				controlShowDetail();
			} else if( button.equals("Sub1Insert") ) {
				controlSub1Insert();
			} else if( button.equals("Sub1Update") ) {
				controlSub1Update();
			} else if( button.equals("Sub1Return") ) {
				controlSub1Return();
			} else if( button.equals("ShowDetail2") ) {
				controlShowDetail2();
			} else if( button.equals("LineInsertProc") ) {
				controlLineInsertProc();
			} else if( button.equals("LineUpdateProc") ) {
				controlLineUpdateProc();
			} else if( button.equals("Sub2insert") ) {
				controlSub2insert();
			} else if( button.equals("Sub2update") ) {
				controlSub2update();
			} else if( button.equals("Sub2Return") ) {
				controlSub2Return();
			} else if( button.equals("Sub1Delete") ) {
				controlSub1Delete();
			} else if( button.equals("Sub2delete") ) {
				controlSub2delete();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
            //------------------------------------------------------------------
            // �R���{�{�b�N�X�̃f�[�^�ݒ�
            struct.setList_Sub2_OUTSIDE_TYP_val(_OUTSIDE_TYP.getValList());
            struct.setList_Sub2_OUTSIDE_TYP_name(_OUTSIDE_TYP.getExplanList());
            struct.setList_Sub2_ACPT_INSPC_TYP_val(_ACPT_INSPC_TYP.getValList());
            struct.setList_Sub2_ACPT_INSPC_TYP_name(_ACPT_INSPC_TYP.getExplanList());
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
//			throw new FoundationException("AA0180010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0180010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0180010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                          // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0180010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0180010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0180010Entity entity;
	protected AA0180010Struct struct;
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

		entity = new AA0180010Entity();
		struct = new AA0180010Struct();

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
	 * AA0180010�N���X�̕W���R���X�g���N�^
	 */
	public AA0180010Control() throws BusinessProcessException, FoundationException
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
				AA0180010Struct key = (AA0180010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("Target_ITEM_CD") && key.getTarget_ITEM_CD() != null) {
					msgKey.setKeyValue("Target_ITEM_CD", key.getTarget_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP") && key.getDEVELOP_TYP() != null) {
					msgKey.setKeyValue("DEVELOP_TYP", key.getDEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("InitLevel") && key.getInitLevel() != null) {
					msgKey.setKeyValue("InitLevel", key.getInitLevel());
				}
				if(msgKeyType.containsKeyColumn("id") && key.getid() != null) {
					msgKey.setKeyValue("id", key.getid());
				}
				if(msgKeyType.containsKeyColumn("lvl") && key.getlvl() != null) {
					msgKey.setKeyValue("lvl", key.getlvl());
				}
				if(msgKeyType.containsKeyColumn("parent") && key.getparent() != null) {
					msgKey.setKeyValue("parent", key.getparent());
				}
				if(msgKeyType.containsKeyColumn("label") && key.getlabel() != null) {
					msgKey.setKeyValue("label", key.getlabel());
				}
				if(msgKeyType.containsKeyColumn("ctx") && key.getctx() != null) {
					msgKey.setKeyValue("ctx", key.getctx());
				}
				if(msgKeyType.containsKeyColumn("maxid") && key.getmaxid() != null) {
					msgKey.setKeyValue("maxid", key.getmaxid());
				}
				if(msgKeyType.containsKeyColumn("TargetDate") && key.getTargetDate() != null) {
					msgKey.setKeyValue("TargetDate", key.getTargetDate());
				}
				if(msgKeyType.containsKeyColumn("h_Target_ITEM_CD") && key.geth_Target_ITEM_CD() != null) {
					msgKey.setKeyValue("h_Target_ITEM_CD", key.geth_Target_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_TargetDate") && key.geth_TargetDate() != null) {
					msgKey.setKeyValue("h_TargetDate", key.geth_TargetDate());
				}
				if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP") && key.geth_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("h_DEVELOP_TYP", key.geth_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_InitLevel") && key.geth_InitLevel() != null) {
					msgKey.setKeyValue("h_InitLevel", key.geth_InitLevel());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name") && key.getDEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_name", key.getDEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val") && key.getDEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_val", key.getDEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_ProcTyp") && key.geth_ProcTyp() != null) {
					msgKey.setKeyValue("h_ProcTyp", key.geth_ProcTyp());
				}
				if(msgKeyType.containsKeyColumn("h_MaxLevel") && key.geth_MaxLevel() != null) {
					msgKey.setKeyValue("h_MaxLevel", key.geth_MaxLevel());
				}
				if(msgKeyType.containsKeyColumn("DET_TYP") && key.getDET_TYP() != null) {
					msgKey.setKeyValue("DET_TYP", key.getDET_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub2_OUTSIDE_TYP_name") && key.getSub2_OUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("Sub2_OUTSIDE_TYP_name", key.getSub2_OUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("Sub2_OUTSIDE_TYP_val") && key.getSub2_OUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("Sub2_OUTSIDE_TYP_val", key.getSub2_OUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("Sub2_ACPT_INSPC_TYP_name") && key.getSub2_ACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("Sub2_ACPT_INSPC_TYP_name", key.getSub2_ACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("Sub2_ACPT_INSPC_TYP_val") && key.getSub2_ACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("Sub2_ACPT_INSPC_TYP_val", key.getSub2_ACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1Parent_ITEM_CD") && key.geth_Sub1Parent_ITEM_CD() != null) {
					msgKey.setKeyValue("h_Sub1Parent_ITEM_CD", key.geth_Sub1Parent_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1Comp_ITEM_CD") && key.geth_Sub1Comp_ITEM_CD() != null) {
					msgKey.setKeyValue("h_Sub1Comp_ITEM_CD", key.geth_Sub1Comp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_PS_EDITION") && key.geth_Sub1_PS_EDITION() != null) {
					msgKey.setKeyValue("h_Sub1_PS_EDITION", key.geth_Sub1_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("Sub1_CONS_TYP_name") && key.getSub1_CONS_TYP_name() != null) {
					msgKey.setKeyValue("Sub1_CONS_TYP_name", key.getSub1_CONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("Sub1_CONS_TYP_val") && key.getSub1_CONS_TYP_val() != null) {
					msgKey.setKeyValue("Sub1_CONS_TYP_val", key.getSub1_CONS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c_Sub1_PS_LT_FLG") && key.getc_Sub1_PS_LT_FLG() != null) {
					msgKey.setKeyValue("c_Sub1_PS_LT_FLG", key.getc_Sub1_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("Sub1_COST_UP_TYP_name") && key.getSub1_COST_UP_TYP_name() != null) {
					msgKey.setKeyValue("Sub1_COST_UP_TYP_name", key.getSub1_COST_UP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("Sub1_COST_UP_TYP_val") && key.getSub1_COST_UP_TYP_val() != null) {
					msgKey.setKeyValue("Sub1_COST_UP_TYP_val", key.getSub1_COST_UP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("Sub1_MRP_EXP_TYP_name") && key.getSub1_MRP_EXP_TYP_name() != null) {
					msgKey.setKeyValue("Sub1_MRP_EXP_TYP_name", key.getSub1_MRP_EXP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("Sub1_MRP_EXP_TYP_val") && key.getSub1_MRP_EXP_TYP_val() != null) {
					msgKey.setKeyValue("Sub1_MRP_EXP_TYP_val", key.getSub1_MRP_EXP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_Target_ITEM_CD2") && key.geth_Target_ITEM_CD2() != null) {
					msgKey.setKeyValue("h_Target_ITEM_CD2", key.geth_Target_ITEM_CD2());
				}
				if(msgKeyType.containsKeyColumn("h_TargetDate2") && key.geth_TargetDate2() != null) {
					msgKey.setKeyValue("h_TargetDate2", key.geth_TargetDate2());
				}
				if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP2") && key.geth_DEVELOP_TYP2() != null) {
					msgKey.setKeyValue("h_DEVELOP_TYP2", key.geth_DEVELOP_TYP2());
				}
				if(msgKeyType.containsKeyColumn("h_InitLevel2") && key.geth_InitLevel2() != null) {
					msgKey.setKeyValue("h_InitLevel2", key.geth_InitLevel2());
				}
				if(msgKeyType.containsKeyColumn("h_Sub2_PROC_NO") && key.geth_Sub2_PROC_NO() != null) {
					msgKey.setKeyValue("h_Sub2_PROC_NO", key.geth_Sub2_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("FIRST_PROC") && key.getFIRST_PROC() != null) {
					msgKey.setKeyValue("FIRST_PROC", key.getFIRST_PROC());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_PS_UNIT_NUMERATOR") && key.geth_Sub1_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("h_Sub1_PS_UNIT_NUMERATOR", key.geth_Sub1_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_PS_UNIT_DENOMINATOR") && key.geth_Sub1_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("h_Sub1_PS_UNIT_DENOMINATOR", key.geth_Sub1_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("AA0180010tree1") && key.getAA0180010tree1() != null) {
					msgKey.setKeyValue("AA0180010tree1", key.getAA0180010tree1());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_1") && key.getsub2_STOCK_UNIT_1() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_1", key.getsub2_STOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_2") && key.getsub2_STOCK_UNIT_2() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_2", key.getsub2_STOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_3") && key.getsub2_STOCK_UNIT_3() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_3", key.getsub2_STOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("Det2FIXED_LT_UNIT") && key.getDet2FIXED_LT_UNIT() != null) {
					msgKey.setKeyValue("Det2FIXED_LT_UNIT", key.getDet2FIXED_LT_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Det2PROP_LT_UNIT") && key.getDet2PROP_LT_UNIT() != null) {
					msgKey.setKeyValue("Det2PROP_LT_UNIT", key.getDet2PROP_LT_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Det2PROP_LOT_SIZE_UNIT") && key.getDet2PROP_LOT_SIZE_UNIT() != null) {
					msgKey.setKeyValue("Det2PROP_LOT_SIZE_UNIT", key.getDet2PROP_LOT_SIZE_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Det2SAFETY_LT_UNIT") && key.getDet2SAFETY_LT_UNIT() != null) {
					msgKey.setKeyValue("Det2SAFETY_LT_UNIT", key.getDet2SAFETY_LT_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("Lower_ITEM_NAME") && key.getLower_ITEM_NAME() != null) {
					msgKey.setKeyValue("Lower_ITEM_NAME", key.getLower_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Lower_STOCK_UNIT") && key.getLower_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Lower_STOCK_UNIT", key.getLower_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Lower_ITEM_CD") && key.getLower_ITEM_CD() != null) {
					msgKey.setKeyValue("Lower_ITEM_CD", key.getLower_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Upper_ITEM_NAME") && key.getUpper_ITEM_NAME() != null) {
					msgKey.setKeyValue("Upper_ITEM_NAME", key.getUpper_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Upper_ITEM_CD") && key.getUpper_ITEM_CD() != null) {
					msgKey.setKeyValue("Upper_ITEM_CD", key.getUpper_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DetParent_ITEM_CD") && key.getDetParent_ITEM_CD() != null) {
					msgKey.setKeyValue("DetParent_ITEM_CD", key.getDetParent_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DetParent_ITEM_NAME") && key.getDetParent_ITEM_NAME() != null) {
					msgKey.setKeyValue("DetParent_ITEM_NAME", key.getDetParent_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DetParent_MRP_ODR_TYP") && key.getDetParent_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("DetParent_MRP_ODR_TYP", key.getDetParent_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("DetParent_OUTSIDE_TYP") && key.getDetParent_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("DetParent_OUTSIDE_TYP", key.getDetParent_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("DetComp_ITEM_CD") && key.getDetComp_ITEM_CD() != null) {
					msgKey.setKeyValue("DetComp_ITEM_CD", key.getDetComp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DetComp_ITEM_NAME") && key.getDetComp_ITEM_NAME() != null) {
					msgKey.setKeyValue("DetComp_ITEM_NAME", key.getDetComp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DetComp_MRP_ODR_TYP") && key.getDetComp_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("DetComp_MRP_ODR_TYP", key.getDetComp_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("DetComp_OUTSIDE_TYP") && key.getDetComp_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("DetComp_OUTSIDE_TYP", key.getDetComp_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_MANHOUR_TYP") && key.getDet_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("Det_MANHOUR_TYP", key.getDet_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_EDITION") && key.getDet_PS_EDITION() != null) {
					msgKey.setKeyValue("Det_PS_EDITION", key.getDet_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_UNIT_QTY") && key.getDet_PS_UNIT_QTY() != null) {
					msgKey.setKeyValue("Det_PS_UNIT_QTY", key.getDet_PS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("Det_STOCK_UNIT") && key.getDet_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Det_STOCK_UNIT", key.getDet_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Det_EFF_PHASE_IN_DATE") && key.getDet_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("Det_EFF_PHASE_IN_DATE", key.getDet_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("Det_EFF_PHASE_OUT_DATE") && key.getDet_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("Det_EFF_PHASE_OUT_DATE", key.getDet_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_SPOIL") && key.getDet_PS_SPOIL() != null) {
					msgKey.setKeyValue("Det_PS_SPOIL", key.getDet_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Det_CONS_TYP") && key.getDet_CONS_TYP() != null) {
					msgKey.setKeyValue("Det_CONS_TYP", key.getDet_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_LT_FLG") && key.getDet_PS_LT_FLG() != null) {
					msgKey.setKeyValue("Det_PS_LT_FLG", key.getDet_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_FIXED_LT") && key.getDet_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("Det_PS_FIXED_LT", key.getDet_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_PROP_LT") && key.getDet_PS_PROP_LT() != null) {
					msgKey.setKeyValue("Det_PS_PROP_LT", key.getDet_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_PROP_LOT_SIZE") && key.getDet_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("Det_PS_PROP_LOT_SIZE", key.getDet_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("Det_PS_REF_NO") && key.getDet_PS_REF_NO() != null) {
					msgKey.setKeyValue("Det_PS_REF_NO", key.getDet_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("Det_COST_UP_TYP") && key.getDet_COST_UP_TYP() != null) {
					msgKey.setKeyValue("Det_COST_UP_TYP", key.getDet_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_MRP_EXP_TYP") && key.getDet_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("Det_MRP_EXP_TYP", key.getDet_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("Sub1Parent_ITEM_NAME") && key.getSub1Parent_ITEM_NAME() != null) {
					msgKey.setKeyValue("Sub1Parent_ITEM_NAME", key.getSub1Parent_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Sub1Comp_ITEM_NAME") && key.getSub1Comp_ITEM_NAME() != null) {
					msgKey.setKeyValue("Sub1Comp_ITEM_NAME", key.getSub1Comp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_NUMERATOR") && key.getSub1_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("Sub1_PS_UNIT_NUMERATOR", key.getSub1_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_DENOMINATOR") && key.getSub1_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("Sub1_PS_UNIT_DENOMINATOR", key.getSub1_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("Sub1_STOCK_UNIT") && key.getSub1_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Sub1_STOCK_UNIT", key.getSub1_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Sub1Comp_STOCK_UNIT") && key.getSub1Comp_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Sub1Comp_STOCK_UNIT", key.getSub1Comp_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Sub1_EFF_PHASE_IN_DATE") && key.getSub1_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("Sub1_EFF_PHASE_IN_DATE", key.getSub1_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_EFF_PHASE_OUT_DATE") && key.getSub1_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("Sub1_EFF_PHASE_OUT_DATE", key.getSub1_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_SPOIL") && key.getSub1_PS_SPOIL() != null) {
					msgKey.setKeyValue("Sub1_PS_SPOIL", key.getSub1_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Sub1_CONS_TYP") && key.getSub1_CONS_TYP() != null) {
					msgKey.setKeyValue("Sub1_CONS_TYP", key.getSub1_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_PS_LT_FLG") && key.geth_Sub1_PS_LT_FLG() != null) {
					msgKey.setKeyValue("h_Sub1_PS_LT_FLG", key.geth_Sub1_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_FIXED_LT") && key.getSub1_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("Sub1_PS_FIXED_LT", key.getSub1_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_PROP_LT") && key.getSub1_PS_PROP_LT() != null) {
					msgKey.setKeyValue("Sub1_PS_PROP_LT", key.getSub1_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_PROP_LOT_SIZE") && key.getSub1_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("Sub1_PS_PROP_LOT_SIZE", key.getSub1_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_REF_NO") && key.getSub1_PS_REF_NO() != null) {
					msgKey.setKeyValue("Sub1_PS_REF_NO", key.getSub1_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("Sub1_COST_UP_TYP") && key.getSub1_COST_UP_TYP() != null) {
					msgKey.setKeyValue("Sub1_COST_UP_TYP", key.getSub1_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub1_MRP_EXP_TYP") && key.getSub1_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("Sub1_MRP_EXP_TYP", key.getSub1_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_MODIFY_COUNT") && key.geth_Sub1_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_Sub1_MODIFY_COUNT", key.geth_Sub1_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("Sub1Parent_ITEM_CD") && key.getSub1Parent_ITEM_CD() != null) {
					msgKey.setKeyValue("Sub1Parent_ITEM_CD", key.getSub1Parent_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1Comp_ITEM_CD") && key.getSub1Comp_ITEM_CD() != null) {
					msgKey.setKeyValue("Sub1Comp_ITEM_CD", key.getSub1Comp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_EDITION") && key.getSub1_PS_EDITION() != null) {
					msgKey.setKeyValue("Sub1_PS_EDITION", key.getSub1_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("KBN1") && key.getKBN1() != null) {
					msgKey.setKeyValue("KBN1", key.getKBN1());
				}
				if(msgKeyType.containsKeyColumn("KBN2") && key.getKBN2() != null) {
					msgKey.setKeyValue("KBN2", key.getKBN2());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
				if(msgKeyType.containsKeyColumn("MODIFY_CNT_PROC") && key.getMODIFY_CNT_PROC() != null) {
					msgKey.setKeyValue("MODIFY_CNT_PROC", key.getMODIFY_CNT_PROC());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_CNT_ISSUE") && key.getMODIFY_CNT_ISSUE() != null) {
					msgKey.setKeyValue("MODIFY_CNT_ISSUE", key.getMODIFY_CNT_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PS_REF_NO") && key.getPS_REF_NO() != null) {
					msgKey.setKeyValue("PS_REF_NO", key.getPS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("FIRST_PROC_NO") && key.getFIRST_PROC_NO() != null) {
					msgKey.setKeyValue("FIRST_PROC_NO", key.getFIRST_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("TargetDate_IN") && key.getTargetDate_IN() != null) {
					msgKey.setKeyValue("TargetDate_IN", key.getTargetDate_IN());
				}
				if(msgKeyType.containsKeyColumn("TargetDate_OUT") && key.getTargetDate_OUT() != null) {
					msgKey.setKeyValue("TargetDate_OUT", key.getTargetDate_OUT());
				}
				if(msgKeyType.containsKeyColumn("Det2ITEM_CD") && key.getDet2ITEM_CD() != null) {
					msgKey.setKeyValue("Det2ITEM_CD", key.getDet2ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Det2PROC_CD") && key.getDet2PROC_CD() != null) {
					msgKey.setKeyValue("Det2PROC_CD", key.getDet2PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("Det2PROC_NO") && key.getDet2PROC_NO() != null) {
					msgKey.setKeyValue("Det2PROC_NO", key.getDet2PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("Det2PROC_NAME") && key.getDet2PROC_NAME() != null) {
					msgKey.setKeyValue("Det2PROC_NAME", key.getDet2PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det2WS_CD") && key.getDet2WS_CD() != null) {
					msgKey.setKeyValue("Det2WS_CD", key.getDet2WS_CD());
				}
				if(msgKeyType.containsKeyColumn("Det2COMPANY_CD") && key.getDet2COMPANY_CD() != null) {
					msgKey.setKeyValue("Det2COMPANY_CD", key.getDet2COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("Det2VEND_CD") && key.getDet2VEND_CD() != null) {
					msgKey.setKeyValue("Det2VEND_CD", key.getDet2VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("Det2FIXED_LT") && key.getDet2FIXED_LT() != null) {
					msgKey.setKeyValue("Det2FIXED_LT", key.getDet2FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("Det2PROP_LT") && key.getDet2PROP_LT() != null) {
					msgKey.setKeyValue("Det2PROP_LT", key.getDet2PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("Det2SAFETY_LT") && key.getDet2SAFETY_LT() != null) {
					msgKey.setKeyValue("Det2SAFETY_LT", key.getDet2SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("Det2PROP_LOT_SIZE") && key.getDet2PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("Det2PROP_LOT_SIZE", key.getDet2PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("Det2SPOIL") && key.getDet2SPOIL() != null) {
					msgKey.setKeyValue("Det2SPOIL", key.getDet2SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Det2OUTSIDE_TYP") && key.getDet2OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("Det2OUTSIDE_TYP", key.getDet2OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det2ACPT_INSPC_TYP") && key.getDet2ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("Det2ACPT_INSPC_TYP", key.getDet2ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det2STANDARD_COST") && key.getDet2STANDARD_COST() != null) {
					msgKey.setKeyValue("Det2STANDARD_COST", key.getDet2STANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("Det2ITEM_NAME") && key.getDet2ITEM_NAME() != null) {
					msgKey.setKeyValue("Det2ITEM_NAME", key.getDet2ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det2WS_NAME") && key.getDet2WS_NAME() != null) {
					msgKey.setKeyValue("Det2WS_NAME", key.getDet2WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det2VEND_NAME") && key.getDet2VEND_NAME() != null) {
					msgKey.setKeyValue("Det2VEND_NAME", key.getDet2VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("Sub2_ITEM_CD") && key.getSub2_ITEM_CD() != null) {
					msgKey.setKeyValue("Sub2_ITEM_CD", key.getSub2_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub2_PROC_CD") && key.getSub2_PROC_CD() != null) {
					msgKey.setKeyValue("Sub2_PROC_CD", key.getSub2_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub2_PROC_NO") && key.getSub2_PROC_NO() != null) {
					msgKey.setKeyValue("Sub2_PROC_NO", key.getSub2_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("Sub2_PROC_NAME") && key.getSub2_PROC_NAME() != null) {
					msgKey.setKeyValue("Sub2_PROC_NAME", key.getSub2_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("Sub2_WS_CD") && key.getSub2_WS_CD() != null) {
					msgKey.setKeyValue("Sub2_WS_CD", key.getSub2_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub2_VEND_CD") && key.getSub2_VEND_CD() != null) {
					msgKey.setKeyValue("Sub2_VEND_CD", key.getSub2_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub2_FIXED_LT") && key.getSub2_FIXED_LT() != null) {
					msgKey.setKeyValue("Sub2_FIXED_LT", key.getSub2_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("Sub2_PROP_LT") && key.getSub2_PROP_LT() != null) {
					msgKey.setKeyValue("Sub2_PROP_LT", key.getSub2_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("Sub2_SAFETY_LT") && key.getSub2_SAFETY_LT() != null) {
					msgKey.setKeyValue("Sub2_SAFETY_LT", key.getSub2_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("Sub2_PROP_LOT_SIZE") && key.getSub2_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("Sub2_PROP_LOT_SIZE", key.getSub2_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("Sub2_SPOIL") && key.getSub2_SPOIL() != null) {
					msgKey.setKeyValue("Sub2_SPOIL", key.getSub2_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Sub2_OUTSIDE_TYP") && key.getSub2_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("Sub2_OUTSIDE_TYP", key.getSub2_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub2_ACPT_INSPC_TYP") && key.getSub2_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("Sub2_ACPT_INSPC_TYP", key.getSub2_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub2_STANDARD_COST") && key.getSub2_STANDARD_COST() != null) {
					msgKey.setKeyValue("Sub2_STANDARD_COST", key.getSub2_STANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
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
				if(msgKeyType.containsKeyColumn("UNIT_QTY") && key.getUNIT_QTY() != null) {
					msgKey.setKeyValue("UNIT_QTY", key.getUNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_TIME") && key.getWORK_TIME() != null) {
					msgKey.setKeyValue("WORK_TIME", key.getWORK_TIME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_Sub2_MODIFY_COUNT") && key.geth_Sub2_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_Sub2_MODIFY_COUNT", key.geth_Sub2_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("Sub2_ITEM_NAME") && key.getSub2_ITEM_NAME() != null) {
					msgKey.setKeyValue("Sub2_ITEM_NAME", key.getSub2_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Sub2_STOCK_UNIT") && key.getSub2_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Sub2_STOCK_UNIT", key.getSub2_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Sub2_WS_NAME") && key.getSub2_WS_NAME() != null) {
					msgKey.setKeyValue("Sub2_WS_NAME", key.getSub2_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("Sub2_VEND_NAME") && key.getSub2_VEND_NAME() != null) {
					msgKey.setKeyValue("Sub2_VEND_NAME", key.getSub2_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SUM_FIXED_LT") && key.getSUM_FIXED_LT() != null) {
					msgKey.setKeyValue("SUM_FIXED_LT", key.getSUM_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("SUM_PROP_LT") && key.getSUM_PROP_LT() != null) {
					msgKey.setKeyValue("SUM_PROP_LT", key.getSUM_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("BY_PRODUCT_CD") && key.getBY_PRODUCT_CD() != null) {
					msgKey.setKeyValue("BY_PRODUCT_CD", key.getBY_PRODUCT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARAM_RESULT_DATA") && key.getPARAM_RESULT_DATA() != null) {
					msgKey.setKeyValue("PARAM_RESULT_DATA", key.getPARAM_RESULT_DATA());
				}
				if(msgKeyType.containsKeyColumn("PARAM_INPUT_DATA") && key.getPARAM_INPUT_DATA() != null) {
					msgKey.setKeyValue("PARAM_INPUT_DATA", key.getPARAM_INPUT_DATA());
				}
				if(msgKeyType.containsKeyColumn("Lower_MANHOUR_TYP") && key.getLower_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("Lower_MANHOUR_TYP", key.getLower_MANHOUR_TYP());
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
					AA0180010Struct key = new AA0180010Struct();
					if(msgKeyType.containsKeyColumn("Target_ITEM_CD")) {
						key.setTarget_ITEM_CD(msgKey.getKeyValue("Target_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP")) {
						key.setDEVELOP_TYP(msgKey.getKeyValue("DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("InitLevel")) {
						key.setInitLevel(msgKey.getKeyValue("InitLevel"));
					}
					if(msgKeyType.containsKeyColumn("id")) {
						key.setid(msgKey.getKeyValue("id"));
					}
					if(msgKeyType.containsKeyColumn("lvl")) {
						key.setlvl(msgKey.getKeyValue("lvl"));
					}
					if(msgKeyType.containsKeyColumn("parent")) {
						key.setparent(msgKey.getKeyValue("parent"));
					}
					if(msgKeyType.containsKeyColumn("label")) {
						key.setlabel(msgKey.getKeyValue("label"));
					}
					if(msgKeyType.containsKeyColumn("ctx")) {
						key.setctx(msgKey.getKeyValue("ctx"));
					}
					if(msgKeyType.containsKeyColumn("maxid")) {
						key.setmaxid(msgKey.getKeyValue("maxid"));
					}
					if(msgKeyType.containsKeyColumn("TargetDate")) {
						key.setTargetDate(msgKey.getKeyValue("TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("h_Target_ITEM_CD")) {
						key.seth_Target_ITEM_CD(msgKey.getKeyValue("h_Target_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_TargetDate")) {
						key.seth_TargetDate(msgKey.getKeyValue("h_TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP")) {
						key.seth_DEVELOP_TYP(msgKey.getKeyValue("h_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_InitLevel")) {
						key.seth_InitLevel(msgKey.getKeyValue("h_InitLevel"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name")) {
						key.setDEVELOP_TYP_name(msgKey.getKeyValue("DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val")) {
						key.setDEVELOP_TYP_val(msgKey.getKeyValue("DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_ProcTyp")) {
						key.seth_ProcTyp(msgKey.getKeyValue("h_ProcTyp"));
					}
					if(msgKeyType.containsKeyColumn("h_MaxLevel")) {
						key.seth_MaxLevel(msgKey.getKeyValue("h_MaxLevel"));
					}
					if(msgKeyType.containsKeyColumn("DET_TYP")) {
						key.setDET_TYP(msgKey.getKeyValue("DET_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_OUTSIDE_TYP_name")) {
						key.setSub2_OUTSIDE_TYP_name(msgKey.getKeyValue("Sub2_OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_OUTSIDE_TYP_val")) {
						key.setSub2_OUTSIDE_TYP_val(msgKey.getKeyValue("Sub2_OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_ACPT_INSPC_TYP_name")) {
						key.setSub2_ACPT_INSPC_TYP_name(msgKey.getKeyValue("Sub2_ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_ACPT_INSPC_TYP_val")) {
						key.setSub2_ACPT_INSPC_TYP_val(msgKey.getKeyValue("Sub2_ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1Parent_ITEM_CD")) {
						key.seth_Sub1Parent_ITEM_CD(msgKey.getKeyValue("h_Sub1Parent_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1Comp_ITEM_CD")) {
						key.seth_Sub1Comp_ITEM_CD(msgKey.getKeyValue("h_Sub1Comp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_PS_EDITION")) {
						key.seth_Sub1_PS_EDITION(msgKey.getKeyValue("h_Sub1_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_CONS_TYP_name")) {
						key.setSub1_CONS_TYP_name(msgKey.getKeyValue("Sub1_CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_CONS_TYP_val")) {
						key.setSub1_CONS_TYP_val(msgKey.getKeyValue("Sub1_CONS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c_Sub1_PS_LT_FLG")) {
						key.setc_Sub1_PS_LT_FLG(msgKey.getKeyValue("c_Sub1_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_COST_UP_TYP_name")) {
						key.setSub1_COST_UP_TYP_name(msgKey.getKeyValue("Sub1_COST_UP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_COST_UP_TYP_val")) {
						key.setSub1_COST_UP_TYP_val(msgKey.getKeyValue("Sub1_COST_UP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_MRP_EXP_TYP_name")) {
						key.setSub1_MRP_EXP_TYP_name(msgKey.getKeyValue("Sub1_MRP_EXP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_MRP_EXP_TYP_val")) {
						key.setSub1_MRP_EXP_TYP_val(msgKey.getKeyValue("Sub1_MRP_EXP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_Target_ITEM_CD2")) {
						key.seth_Target_ITEM_CD2(msgKey.getKeyValue("h_Target_ITEM_CD2"));
					}
					if(msgKeyType.containsKeyColumn("h_TargetDate2")) {
						key.seth_TargetDate2(msgKey.getKeyValue("h_TargetDate2"));
					}
					if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP2")) {
						key.seth_DEVELOP_TYP2(msgKey.getKeyValue("h_DEVELOP_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("h_InitLevel2")) {
						key.seth_InitLevel2(msgKey.getKeyValue("h_InitLevel2"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub2_PROC_NO")) {
						key.seth_Sub2_PROC_NO(msgKey.getKeyValue("h_Sub2_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_PROC")) {
						key.setFIRST_PROC(msgKey.getKeyValue("FIRST_PROC"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_PS_UNIT_NUMERATOR")) {
						key.seth_Sub1_PS_UNIT_NUMERATOR(msgKey.getKeyValue("h_Sub1_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_PS_UNIT_DENOMINATOR")) {
						key.seth_Sub1_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("h_Sub1_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("AA0180010tree1")) {
						key.setAA0180010tree1(msgKey.getKeyValue("AA0180010tree1"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_1")) {
						key.setsub2_STOCK_UNIT_1(msgKey.getKeyValue("sub2_STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_2")) {
						key.setsub2_STOCK_UNIT_2(msgKey.getKeyValue("sub2_STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_3")) {
						key.setsub2_STOCK_UNIT_3(msgKey.getKeyValue("sub2_STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("Det2FIXED_LT_UNIT")) {
						key.setDet2FIXED_LT_UNIT(msgKey.getKeyValue("Det2FIXED_LT_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Det2PROP_LT_UNIT")) {
						key.setDet2PROP_LT_UNIT(msgKey.getKeyValue("Det2PROP_LT_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Det2PROP_LOT_SIZE_UNIT")) {
						key.setDet2PROP_LOT_SIZE_UNIT(msgKey.getKeyValue("Det2PROP_LOT_SIZE_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Det2SAFETY_LT_UNIT")) {
						key.setDet2SAFETY_LT_UNIT(msgKey.getKeyValue("Det2SAFETY_LT_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(msgKey.getKeyValue("MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Lower_ITEM_NAME")) {
						key.setLower_ITEM_NAME(msgKey.getKeyValue("Lower_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Lower_STOCK_UNIT")) {
						key.setLower_STOCK_UNIT(msgKey.getKeyValue("Lower_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Lower_ITEM_CD")) {
						key.setLower_ITEM_CD(msgKey.getKeyValue("Lower_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Upper_ITEM_NAME")) {
						key.setUpper_ITEM_NAME(msgKey.getKeyValue("Upper_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Upper_ITEM_CD")) {
						key.setUpper_ITEM_CD(msgKey.getKeyValue("Upper_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DetParent_ITEM_CD")) {
						key.setDetParent_ITEM_CD(msgKey.getKeyValue("DetParent_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DetParent_ITEM_NAME")) {
						key.setDetParent_ITEM_NAME(msgKey.getKeyValue("DetParent_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DetParent_MRP_ODR_TYP")) {
						key.setDetParent_MRP_ODR_TYP(msgKey.getKeyValue("DetParent_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DetParent_OUTSIDE_TYP")) {
						key.setDetParent_OUTSIDE_TYP(msgKey.getKeyValue("DetParent_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DetComp_ITEM_CD")) {
						key.setDetComp_ITEM_CD(msgKey.getKeyValue("DetComp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DetComp_ITEM_NAME")) {
						key.setDetComp_ITEM_NAME(msgKey.getKeyValue("DetComp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DetComp_MRP_ODR_TYP")) {
						key.setDetComp_MRP_ODR_TYP(msgKey.getKeyValue("DetComp_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DetComp_OUTSIDE_TYP")) {
						key.setDetComp_OUTSIDE_TYP(msgKey.getKeyValue("DetComp_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_MANHOUR_TYP")) {
						key.setDet_MANHOUR_TYP(msgKey.getKeyValue("Det_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_EDITION")) {
						key.setDet_PS_EDITION(msgKey.getKeyValue("Det_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_UNIT_QTY")) {
						key.setDet_PS_UNIT_QTY(msgKey.getKeyValue("Det_PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Det_STOCK_UNIT")) {
						key.setDet_STOCK_UNIT(msgKey.getKeyValue("Det_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Det_EFF_PHASE_IN_DATE")) {
						key.setDet_EFF_PHASE_IN_DATE(msgKey.getKeyValue("Det_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Det_EFF_PHASE_OUT_DATE")) {
						key.setDet_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("Det_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_SPOIL")) {
						key.setDet_PS_SPOIL(msgKey.getKeyValue("Det_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Det_CONS_TYP")) {
						key.setDet_CONS_TYP(msgKey.getKeyValue("Det_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_LT_FLG")) {
						key.setDet_PS_LT_FLG(msgKey.getKeyValue("Det_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_FIXED_LT")) {
						key.setDet_PS_FIXED_LT(msgKey.getKeyValue("Det_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_PROP_LT")) {
						key.setDet_PS_PROP_LT(msgKey.getKeyValue("Det_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_PROP_LOT_SIZE")) {
						key.setDet_PS_PROP_LOT_SIZE(msgKey.getKeyValue("Det_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("Det_PS_REF_NO")) {
						key.setDet_PS_REF_NO(msgKey.getKeyValue("Det_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("Det_COST_UP_TYP")) {
						key.setDet_COST_UP_TYP(msgKey.getKeyValue("Det_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_MRP_EXP_TYP")) {
						key.setDet_MRP_EXP_TYP(msgKey.getKeyValue("Det_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("Sub1Parent_ITEM_NAME")) {
						key.setSub1Parent_ITEM_NAME(msgKey.getKeyValue("Sub1Parent_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Sub1Comp_ITEM_NAME")) {
						key.setSub1Comp_ITEM_NAME(msgKey.getKeyValue("Sub1Comp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_NUMERATOR")) {
						key.setSub1_PS_UNIT_NUMERATOR(msgKey.getKeyValue("Sub1_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_DENOMINATOR")) {
						key.setSub1_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("Sub1_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_STOCK_UNIT")) {
						key.setSub1_STOCK_UNIT(msgKey.getKeyValue("Sub1_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Sub1Comp_STOCK_UNIT")) {
						key.setSub1Comp_STOCK_UNIT(msgKey.getKeyValue("Sub1Comp_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_EFF_PHASE_IN_DATE")) {
						key.setSub1_EFF_PHASE_IN_DATE(msgKey.getKeyValue("Sub1_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_EFF_PHASE_OUT_DATE")) {
						key.setSub1_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("Sub1_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_SPOIL")) {
						key.setSub1_PS_SPOIL(msgKey.getKeyValue("Sub1_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_CONS_TYP")) {
						key.setSub1_CONS_TYP(msgKey.getKeyValue("Sub1_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_PS_LT_FLG")) {
						key.seth_Sub1_PS_LT_FLG(msgKey.getKeyValue("h_Sub1_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_FIXED_LT")) {
						key.setSub1_PS_FIXED_LT(msgKey.getKeyValue("Sub1_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_PROP_LT")) {
						key.setSub1_PS_PROP_LT(msgKey.getKeyValue("Sub1_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_PROP_LOT_SIZE")) {
						key.setSub1_PS_PROP_LOT_SIZE(msgKey.getKeyValue("Sub1_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_REF_NO")) {
						key.setSub1_PS_REF_NO(msgKey.getKeyValue("Sub1_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_COST_UP_TYP")) {
						key.setSub1_COST_UP_TYP(msgKey.getKeyValue("Sub1_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_MRP_EXP_TYP")) {
						key.setSub1_MRP_EXP_TYP(msgKey.getKeyValue("Sub1_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_MODIFY_COUNT")) {
						key.seth_Sub1_MODIFY_COUNT(msgKey.getKeyValue("h_Sub1_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("Sub1Parent_ITEM_CD")) {
						key.setSub1Parent_ITEM_CD(msgKey.getKeyValue("Sub1Parent_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1Comp_ITEM_CD")) {
						key.setSub1Comp_ITEM_CD(msgKey.getKeyValue("Sub1Comp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_EDITION")) {
						key.setSub1_PS_EDITION(msgKey.getKeyValue("Sub1_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("KBN1")) {
						key.setKBN1(msgKey.getKeyValue("KBN1"));
					}
					if(msgKeyType.containsKeyColumn("KBN2")) {
						key.setKBN2(msgKey.getKeyValue("KBN2"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("MODIFY_CNT_PROC")) {
						key.setMODIFY_CNT_PROC(msgKey.getKeyValue("MODIFY_CNT_PROC"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_CNT_ISSUE")) {
						key.setMODIFY_CNT_ISSUE(msgKey.getKeyValue("MODIFY_CNT_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PS_REF_NO")) {
						key.setPS_REF_NO(msgKey.getKeyValue("PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_PROC_NO")) {
						key.setFIRST_PROC_NO(msgKey.getKeyValue("FIRST_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("TargetDate_IN")) {
						key.setTargetDate_IN(msgKey.getKeyValue("TargetDate_IN"));
					}
					if(msgKeyType.containsKeyColumn("TargetDate_OUT")) {
						key.setTargetDate_OUT(msgKey.getKeyValue("TargetDate_OUT"));
					}
					if(msgKeyType.containsKeyColumn("Det2ITEM_CD")) {
						key.setDet2ITEM_CD(msgKey.getKeyValue("Det2ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det2PROC_CD")) {
						key.setDet2PROC_CD(msgKey.getKeyValue("Det2PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det2PROC_NO")) {
						key.setDet2PROC_NO(msgKey.getKeyValue("Det2PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("Det2PROC_NAME")) {
						key.setDet2PROC_NAME(msgKey.getKeyValue("Det2PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det2WS_CD")) {
						key.setDet2WS_CD(msgKey.getKeyValue("Det2WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det2COMPANY_CD")) {
						key.setDet2COMPANY_CD(msgKey.getKeyValue("Det2COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det2VEND_CD")) {
						key.setDet2VEND_CD(msgKey.getKeyValue("Det2VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det2FIXED_LT")) {
						key.setDet2FIXED_LT(msgKey.getKeyValue("Det2FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("Det2PROP_LT")) {
						key.setDet2PROP_LT(msgKey.getKeyValue("Det2PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("Det2SAFETY_LT")) {
						key.setDet2SAFETY_LT(msgKey.getKeyValue("Det2SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("Det2PROP_LOT_SIZE")) {
						key.setDet2PROP_LOT_SIZE(msgKey.getKeyValue("Det2PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("Det2SPOIL")) {
						key.setDet2SPOIL(msgKey.getKeyValue("Det2SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Det2OUTSIDE_TYP")) {
						key.setDet2OUTSIDE_TYP(msgKey.getKeyValue("Det2OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det2ACPT_INSPC_TYP")) {
						key.setDet2ACPT_INSPC_TYP(msgKey.getKeyValue("Det2ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det2STANDARD_COST")) {
						key.setDet2STANDARD_COST(msgKey.getKeyValue("Det2STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("Det2ITEM_NAME")) {
						key.setDet2ITEM_NAME(msgKey.getKeyValue("Det2ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det2WS_NAME")) {
						key.setDet2WS_NAME(msgKey.getKeyValue("Det2WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det2VEND_NAME")) {
						key.setDet2VEND_NAME(msgKey.getKeyValue("Det2VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_ITEM_CD")) {
						key.setSub2_ITEM_CD(msgKey.getKeyValue("Sub2_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_PROC_CD")) {
						key.setSub2_PROC_CD(msgKey.getKeyValue("Sub2_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_PROC_NO")) {
						key.setSub2_PROC_NO(msgKey.getKeyValue("Sub2_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_PROC_NAME")) {
						key.setSub2_PROC_NAME(msgKey.getKeyValue("Sub2_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_WS_CD")) {
						key.setSub2_WS_CD(msgKey.getKeyValue("Sub2_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_VEND_CD")) {
						key.setSub2_VEND_CD(msgKey.getKeyValue("Sub2_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_FIXED_LT")) {
						key.setSub2_FIXED_LT(msgKey.getKeyValue("Sub2_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_PROP_LT")) {
						key.setSub2_PROP_LT(msgKey.getKeyValue("Sub2_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_SAFETY_LT")) {
						key.setSub2_SAFETY_LT(msgKey.getKeyValue("Sub2_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_PROP_LOT_SIZE")) {
						key.setSub2_PROP_LOT_SIZE(msgKey.getKeyValue("Sub2_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_SPOIL")) {
						key.setSub2_SPOIL(msgKey.getKeyValue("Sub2_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_OUTSIDE_TYP")) {
						key.setSub2_OUTSIDE_TYP(msgKey.getKeyValue("Sub2_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_ACPT_INSPC_TYP")) {
						key.setSub2_ACPT_INSPC_TYP(msgKey.getKeyValue("Sub2_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_STANDARD_COST")) {
						key.setSub2_STANDARD_COST(msgKey.getKeyValue("Sub2_STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("UNIT_QTY")) {
						key.setUNIT_QTY(msgKey.getKeyValue("UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_TIME")) {
						key.setWORK_TIME(msgKey.getKeyValue("WORK_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub2_MODIFY_COUNT")) {
						key.seth_Sub2_MODIFY_COUNT(msgKey.getKeyValue("h_Sub2_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_ITEM_NAME")) {
						key.setSub2_ITEM_NAME(msgKey.getKeyValue("Sub2_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_STOCK_UNIT")) {
						key.setSub2_STOCK_UNIT(msgKey.getKeyValue("Sub2_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_WS_NAME")) {
						key.setSub2_WS_NAME(msgKey.getKeyValue("Sub2_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Sub2_VEND_NAME")) {
						key.setSub2_VEND_NAME(msgKey.getKeyValue("Sub2_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_FIXED_LT")) {
						key.setSUM_FIXED_LT(msgKey.getKeyValue("SUM_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_PROP_LT")) {
						key.setSUM_PROP_LT(msgKey.getKeyValue("SUM_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("BY_PRODUCT_CD")) {
						key.setBY_PRODUCT_CD(msgKey.getKeyValue("BY_PRODUCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_RESULT_DATA")) {
						key.setPARAM_RESULT_DATA(msgKey.getKeyValue("PARAM_RESULT_DATA"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_INPUT_DATA")) {
						key.setPARAM_INPUT_DATA(msgKey.getKeyValue("PARAM_INPUT_DATA"));
					}
					if(msgKeyType.containsKeyColumn("Lower_MANHOUR_TYP")) {
						key.setLower_MANHOUR_TYP(msgKey.getKeyValue("Lower_MANHOUR_TYP"));
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
