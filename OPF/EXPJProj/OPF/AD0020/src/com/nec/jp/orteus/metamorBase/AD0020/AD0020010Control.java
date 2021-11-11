/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/src/com/nec/jp/orteus/metamorBase/AD0020/AD0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0020;

import com.nec.jp.orteus.metamorBase.AD0020.*;
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0020010Control
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
				setStruct2XML(elChild, (AD0020010Struct)list.get(i), startId, lvl, parentId);
				// �쐬�����G�������g���q���Ƃ��Ēǉ�
				el.appendChild(elChild);
			}
		}
		return startId;
	}

	public int setXMLDoc(Element el, List list, int startId) throws BusinessProcessException, FoundationException {
		return setXMLDoc(el, list, startId, 1, 0);
	} 

	public void setStruct2XML(Element el, AD0020010Struct struct, int id, int lvl, int parentId) throws BusinessProcessException, FoundationException {

		if(el != null && struct != null) {
			try {
		//{{user_implement_dev:<setStruct2XML>


				// id����(id)�̐ݒ�
				el.setAttribute("id", Integer.toString(id));
				// ���x������(LVL)�̐ݒ�
				el.setAttribute("lvl", Integer.toString(lvl));
				// �e����(Parent)�̐ݒ�
				el.setAttribute("parent", Integer.toString(parentId));
				// ���x������(Label)�̐ݒ�
				if(struct.getlabel() != null && !struct.getlabel().equals("")) {
					el.setAttribute("label", struct.getlabel());
				}

				// �g������
				if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals("")) {
					el.setAttribute("ITEM_CD", struct.getITEM_CD());
				}
				if (struct.getITEM_NAME() != null && !struct.getITEM_NAME().equals("")) {
					el.setAttribute("ITEM_NAME", struct.getITEM_NAME());
				}
				if (struct.getOD_NO() != null && !struct.getOD_NO().equals("")) {
					el.setAttribute("OD_NO", struct.getOD_NO());
				}
				if (struct.getMRP_TYP() != null && !struct.getMRP_TYP().equals("")) {
					el.setAttribute("MRP_TYP", struct.getMRP_TYP());
				}
				if (struct.getMRP_ODR_TYP() != null && !struct.getMRP_ODR_TYP().equals("")) {
					el.setAttribute("MRP_ODR_TYP", struct.getMRP_ODR_TYP());
				}
				if (struct.getODR_STS_TYP() != null && !struct.getODR_STS_TYP().equals("")) {
					el.setAttribute("ODR_STS_TYP", struct.getODR_STS_TYP());
				}
				if (struct.getOD_TYP() != null && !struct.getOD_TYP().equals("")) {
					el.setAttribute("OD_TYP", struct.getOD_TYP());
				}


                //}}user_implement_dev:<setStruct2XML>
			} catch(DOMException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public void setStruct2XML(Element el, AD0020010Struct struct, int id) throws BusinessProcessException, FoundationException {
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
	public AD0020010Struct getListvalue(int x) { return (AD0020010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0020010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public AD0020010Struct createStruct() { return new AD0020010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0020010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//---------------------------------------------------------------------------

	/** �f�t�H�[���g�����W�J���x�� */
	private static final String DEFAULT_INIT_LEVEL = "15";
	/** �ő�݌v�s�� */
	private static final int MAX_NODE_NUM = 50;
	/** �ő�Ǎ��s���i�����Ǎ��܂��͒ǉ��Ǎ����j */
	private static final int MAX_READ_NUM = 20;

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
	/**
	 * �Ɩ��G���[�������̃p�����[�^�ݒ菈����؂�o���Ċ֐���
	 * @param tableName �e�[�u����
	 * @param columnName �J������
	 * @param value �l
	 */
	private void setErrorParameter(String tableName, String columnName, String value) {
		StringBuffer param = new StringBuffer();
		param.append(tableName);
		param.append(".");
		param.append(columnName);
		param.append(":");
		if (value != null) {
			param.append(value);
		}

		ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

	// tree��O����p
	private int _maxDisplayLevel = -1;
	private int _initDisplayLevel = -1;
	private int _maxRead = -1;

	/**
	 * �e�m�[�h�ɑ΂���q�m�[�h���c���[�W�J���܂�
	 * @param  parentNodeElement �e�m�[�h�G�������g
	 * @param  parentNodeStruct �e�m�[�h��sturct
	 * @param  parentNodeId �e�m�[�hID
	 * @param  compNodeId �q�m�[�hID�i����ID����J�n�j
	 * @param  maxNodeId �Ǎ��\�ő�m�[�hID�i����ID�𒴂��邱�Ƃ͂ł��Ȃ��j
	 * @param  compTreeLevel �q�c���[���x��
	 * @param  maxLevel �ő�W�J���x��
	 * @param  selectFlag �Ǎ��t���O
	 * @return ���̃m�[�hID
	 * @throws BusinessProcessException �H
	 * @throws FoundationException �H
	 * @throws ExpjException �H
	 * @throws MaxLineException �H
	 */
	private int expandTree(
		Element parentNodeElement,
		AD0020010Struct parentNodeStruct,
		int parentNodeId,
		int compNodeId,
		int maxNodeId,
		int compTreeLevel,
		int maxLevel,
		boolean selectFlag)
		throws BusinessProcessException, FoundationException, ExpjException, MaxLineException {
		try {
			// �q�m�[�h�̈ꗗ���擾
			AD0020010Struct workStruct = new AD0020010Struct();
			workStruct.setOD_NO(parentNodeStruct.getOD_NO());
			List compNodeList = entity.mNode.read(conn, workStruct);

			if ("3".equals(parentNodeElement.getAttribute("MRP_TYP"))) {
				// �폜�i�ڂ̏ꍇ�A���[�m�[�h�Ƃ��Đ�p�A�C�R�����Z�b�g����B
				parentNodeElement.setAttribute("ctx", "T");
				parentNodeElement.setAttribute("icon1", "TreeIcon3C");
				return compNodeId;
			} else {
				// �폜�i�ڈȊO�̏ꍇ
				
				if (compNodeList.size() == 0) {
					// ���[�m�[�h�̏ꍇ
					parentNodeElement.setAttribute("ctx", "T");
					// �c���[�A�C�R�����Z�b�g
					if ("1".equals(parentNodeElement.getAttribute("OD_TYP"))
						|| "2".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon01C");
					} else if ("3".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon02C");
					} else if ("4".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon03C");
					}
				} else if (parentNodeElement.hasAttribute("target") == false) {
					// ���[�ȊO�̃m�[�h�ł���ARoot�łȂ��ꍇ
					parentNodeElement.setAttribute("ctx", "N");
					// �c���[�A�C�R�����Z�b�g
					if ("1".equals(parentNodeElement.getAttribute("OD_TYP"))
						|| "2".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon01A");
						parentNodeElement.setAttribute("icon2", "AD0020011CIcon01B");
					} else if ("3".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon02A");
						parentNodeElement.setAttribute("icon2", "AD0020011CIcon02B");
					} else if ("4".equals(parentNodeElement.getAttribute("OD_TYP"))) {
						parentNodeElement.setAttribute("icon1", "AD0020011CIcon03A");
						parentNodeElement.setAttribute("icon2", "AD0020011CIcon03B");
					}

					if (compTreeLevel > _maxDisplayLevel) {
						// �c���[�̃��x�����\���ő僌�x���𒴂����ꍇ
						// �e�m�[�h�ɍő僌�x��������ݒ�
						parentNodeElement.setAttribute("terminated", "true");
						ExpjMessage emsg =
							new ExpjMessage("ZZ01120", Integer.toString(_maxDisplayLevel));
						parentNodeElement.setAttribute(
							"terminate_comment",
							emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
						msgStruct.addWarn(emsg);
						sysLog.warning(emsg, getsysUSER_CD());

						return compNodeId;
					}
					if (compTreeLevel > maxLevel) {
						// �c���[�̃��x�����w�背�x���𒴂����ꍇ
						// �e�m�[�h�ɉ��ʃ��x�����Ǎ�������ݒ�
						parentNodeElement.setAttribute("not_read", "true");
						return compNodeId;
					}
				}
			}
			
			int compNodeListSize = compNodeList.size();
			if (maxNodeId > 0) {
				// �c���[�̓Ǎ��s��
				int readCount = 0;
				if (selectFlag) {
					readCount = compNodeId + compNodeListSize - 1;
				} else {
					readCount = compNodeListSize;
				}
				if (readCount - 1 > maxNodeId) {
					// �c���[�̓Ǎ��s�����ő�l�𒴂����ꍇ
					throw new MaxLineException();
				}
			}

			for (int i = 0; i < compNodeListSize; i++) {
				AD0020010Struct compNodeStruct = (AD0020010Struct) compNodeList.get(i);
				// �q�m�[�h�𐶐��A�c���[�pXML�ɒǉ�
				Element compNodeElement = flashTree.createElement("node");
				parentNodeElement.appendChild(compNodeElement);
				// compNodeStruct����q�m�[�h�̊e�푮���f�[�^��ݒ�

				compNodeStruct.setlabel(
					compNodeStruct.getITEM_CD() + " " + null2blank(compNodeStruct.getITEM_NAME()));
				setStruct2XML(
					compNodeElement,
					compNodeStruct,
					compNodeId,
					compTreeLevel,
					parentNodeId);
				// ���ʃ��x���m�[�h��W�J�i�ċA�I�Ƀc���[��W�J����j
				compNodeId =
					expandTree(
						compNodeElement,
						compNodeStruct,
						compNodeId,
						compNodeId + 1,
						maxNodeId,
						compTreeLevel + 1,
						maxLevel,
						selectFlag);
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			// �G���[�F�T�[�o�ŃG���[���������܂����B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(se, emsg);
			emsg = new ExpjMessage("ZZ01006", se.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		}

		return compNodeId;
	}

	/**
	 * ��ʂ̑S���ڂ����������܂��B
	 */
	private void initializeAll() {
		struct.setPLANT_CD(sysPLANT_CD);
		struct.setJOB_ODR_CD(null);
		struct.setJOB_ODR_CANCEL_NO("0");
		struct.setInitLevel(String.valueOf(_initDisplayLevel));

		initializeDetail();
	}

	/**
	 * ��ʂ̏ڍ׍��ڂ����������܂��B
	 */
	private void initializeDetail() {
		struct.setOD_NO(null);
		struct.setOD_TYP(null);
		struct.setMRP_TYP(null);
		struct.setOUTSIDE_TYP(null);
		struct.setJOB_ODR_TYP(null);
		struct.setJOB_ODR_TYP_DN(null);
		struct.setMRP_TYP(null);
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setDRAW_CD(null);
		struct.setSPEC(null);
		struct.setALC_GRP_CD(null);
		struct.setOUTSIDE_TYP(null);
		struct.setOUTSIDE_TYP_DN(null);
		struct.setMRP_ODR_TYP(null);
		struct.setMRP_ODR_TYP_DN(null);
		struct.setITEM_SPOIL(null);
		struct.setUNIT_QTY_TYP(null);
		struct.setUNIT_QTY_TYP_DN(null);
		struct.setJOB_ODR_DLV_DATE(null);
		struct.setDUE_DATE(null);
		struct.setPRD_DUE_DATE(null);
		struct.setPRD_START_DATE(null);
		struct.setODR_START_DATE(null);
		struct.setDM_QTY(null);
		struct.setODR_QTY(null);
		struct.setSUM_ALCD_QTY(null);
		struct.setODR_STS_TYP(null);
		struct.setODR_STS_TYP_DN(null);
		struct.setDM_STS_TYP(null);
		struct.setDM_STS_TYP_DN(null);

		// �c���[��������
		flashTree = new XmlDocument();

		list = null;

		readStatus = INITIAL;
	}

	/**
	 * ������null�̏ꍇ�ɋ󕶎��ɕϊ����ĕԂ��܂��B
	 * @param string ������
	 * @return ������null�̏ꍇ�ɋ󕶎��A����ȊO�̏ꍇ�͕�����
	 */
	private String null2blank(String string) {
		if (string == null) {
			return "";
		} else {
			return string;
		}
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		Element rootElement = null;
		Element topNodeElement = null;
		try {
			// �L�[�ȊO�̉�ʂ�������
			initializeDetail();
			// �c���[�pXML�h�L�������g��������
			flashTree = new XmlDocument();

			// �c���[�̃��[�g������
			struct.setPLANT_CD(this.sysPLANT_CD);
			List rootList = entity.mRoot.read(conn, struct);
			if (rootList.isEmpty()) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "PLANT_CD", this.sysPLANT_CD);
				return;
			}

			AD0020010Struct rootStruct = (AD0020010Struct) rootList.get(0);

			// ���ԏ�ԋ敪��1/2/9�̏ꍇ�̓G���[�ɂ���B
			if (("1".equals(rootStruct.getJOB_ODR_STS_TYP()))
				|| ("2".equals(rootStruct.getJOB_ODR_STS_TYP()))
				|| ("9".equals(rootStruct.getJOB_ODR_STS_TYP()))) {
				setErrorMessage("AD32616");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "JOB_ODR_STS_TYP", rootStruct.getJOB_ODR_STS_TYP());
				return;
			}
			
			// ���[�U����������H��R�[�h�ƁA[���Ԍv��]�̍H��R�[�h��
			// ��v���Ȃ��ꍇ�̓G���[�ɂ���B
			if (!this.sysPLANT_CD.equals(rootStruct.getPLANT_CD())) {
				setErrorMessage("AD00016");
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
				setErrorParameter("T_OD", "PLANT_CD", this.sysPLANT_CD);
				return;
			}

			// �h�L�������gRoot���쐬�A�c���[�pXML�ɒǉ�
			rootElement = flashTree.createElement("root");
			flashTree.appendChild(rootElement);
			// �h�L�������gRoot�ɏ����W�J���x����ݒ�
			rootElement.setAttribute("init_level", struct.getInitLevel());
			// �ŏ�ʃ��x���m�[�h�𐶐��A�c���[�pXML�ɒǉ�
			topNodeElement = flashTree.createElement("node");
			rootElement.appendChild(topNodeElement);
			// struct����ŏ�ʃ��x���m�[�h�̊e�푮���f�[�^��ݒ�
			struct.setOD_NO(rootStruct.getOD_NO());
			struct.setITEM_CD(rootStruct.getITEM_CD());
			struct.setITEM_NAME(rootStruct.getITEM_NAME());
			struct.setOD_TYP(rootStruct.getOD_TYP());
			struct.setODR_STS_TYP(rootStruct.getODR_STS_TYP());
			struct.setDM_STS_TYP(rootStruct.getDM_STS_TYP());
			struct.setMRP_ODR_TYP(rootStruct.getMRP_ODR_TYP());
			struct.setMRP_TYP(rootStruct.getMRP_TYP());
			struct.setOUTSIDE_TYP(rootStruct.getOUTSIDE_TYP());
			struct.setJOB_ODR_STS_TYP(rootStruct.getJOB_ODR_STS_TYP());

			struct.setlabel(struct.getITEM_CD() + " " + null2blank(struct.getITEM_NAME()));

			setStruct2XML(topNodeElement, struct, 1, 1, 0);

			// ���ʃ��x���m�[�h��W�J�i�ċA�I�Ƀc���[��W�J����j
			expandTree(
				topNodeElement,
				struct,
				1,
				2,
				_maxRead,
				2,
				Integer.parseInt(struct.getInitLevel()) + 1,
				true);

			// �Ǎ���ԁi�Ǎ������j��ݒ�
			setReadStatus(NORMAL);
		} catch (MaxLineException me) {
			rootElement.removeChild(topNodeElement);
			Element stopNodeElement = flashTree.createElement("node");
			rootElement.appendChild(stopNodeElement);
			setStruct2XML(stopNodeElement, struct, 1, 1, 0);
			stopNodeElement.setAttribute("terminated", "true");
			ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_maxRead));
			stopNodeElement.setAttribute(
				"terminate_comment",
				emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
			msgStruct.addError(emsg);
			sysLog.warning(emsg, getsysUSER_CD());

			setReadStatus(TOO_MANY);
			return;
		} catch (SQLException e) {
			throw new ExpjException(e);
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * FlashTree�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlFlashTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");
			//{{user_implement_dev:<controlFlashTree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		/*
		try {
			flashTree = new XmlDocument();
			int startId = 0;
			list = entity.mFlashTree.read(conn, struct);
			// �h�L�������gRoot�쐬
			Element root = flashTree.createElement("root");
			flashTree.appendChild(root);
			Element el = null;
			for(int i=0; i<list.size(); i++, startId++) {
				// �G�������g�𐶐�
				el = flashTree.createElement("node");
				root.appendChild(el);
				// �G�������g�ɑ�����ݒ�
				setStruct2XML(el, (AD0020010Struct)list.get(i), startId);

				List lstChld = entity.mFlashTree.read(conn, struct);
				// �������ʂ��q���G�������g�Ƃ��Ēǉ�
				startId = setXMLDoc(el, lstChld, ++startId);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
		*/
                //}}user_implement_dev:<controlFlashTree>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


		initializeAll();


                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �ڍו\���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");
			//{{user_implement_dev:<controlShowDetail>


		try {
			// �I�����ꂽ�m�[�h�����ɏڍ׏����擾
			List detailList = entity.mDetail.read(conn, struct);
			AD0020010Struct detailStruct = (AD0020010Struct) detailList.get(0);

			// �ڍ׏���ݒ�
			struct.setJOB_ODR_TYP(detailStruct.getJOB_ODR_TYP());
			struct.setJOB_ODR_TYP_DN(multcombo("JOB_ODR_TYP",detailStruct.getJOB_ODR_TYP_DN()));
			struct.setALC_GRP_CD(detailStruct.getALC_GRP_CD());
			struct.setITEM_CD(detailStruct.getITEM_CD());
			struct.setITEM_NAME(detailStruct.getITEM_NAME());
			struct.setDRAW_CD(detailStruct.getDRAW_CD());
			struct.setSPEC(detailStruct.getSPEC());
			struct.setOUTSIDE_TYP(detailStruct.getOUTSIDE_TYP());
			struct.setOUTSIDE_TYP_DN(multcombo("OUTSIDE_TYP",detailStruct.getOUTSIDE_TYP_DN()));
			struct.setMRP_ODR_TYP(detailStruct.getMRP_ODR_TYP());
			struct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",detailStruct.getMRP_ODR_TYP_DN()));
			struct.setITEM_SPOIL(detailStruct.getITEM_SPOIL());
			struct.setUNIT_QTY_TYP(detailStruct.getUNIT_QTY_TYP());
			struct.setUNIT_QTY_TYP_DN(multcombo("UNIT_QTY_TYP",detailStruct.getUNIT_QTY_TYP_DN()));
			struct.setJOB_ODR_DLV_DATE(detailStruct.getJOB_ODR_DLV_DATE());
			struct.setDUE_DATE(detailStruct.getDUE_DATE());
			struct.setPRD_DUE_DATE(detailStruct.getPRD_DUE_DATE());
			struct.setPRD_START_DATE(detailStruct.getPRD_START_DATE());
			struct.setODR_START_DATE(detailStruct.getODR_START_DATE());
			struct.setSUM_PUCH_ODR_QTY(detailStruct.getSUM_PUCH_ODR_QTY());
			struct.setSUM_OPR_INST_QTY(detailStruct.getSUM_OPR_INST_QTY());
			struct.setODR_QTY(detailStruct.getODR_QTY());
			struct.setDM_QTY(detailStruct.getDM_QTY());
			struct.setSUM_ALCD_QTY(detailStruct.getSUM_ALCD_QTY());
			struct.setODR_STS_TYP(detailStruct.getODR_STS_TYP());
			struct.setODR_STS_TYP_DN(multcombo("ODR_STS_TYP",detailStruct.getODR_STS_TYP_DN()));
			struct.setDM_STS_TYP(detailStruct.getDM_STS_TYP());
			struct.setDM_STS_TYP_DN(multcombo("DM_STS_TYP",detailStruct.getDM_STS_TYP_DN()));
			struct.setSTOCK_UNIT(detailStruct.getSTOCK_UNIT());
		} catch (SQLException e) {
			throw new ExpjException(e);
		}


                //}}user_implement_dev:<controlShowDetail>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");

		return;
	}

	/**
	 * �c���[�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAddTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");
			//{{user_implement_dev:<controlAddTree>


		Element rootElement = null;
		try {
			// �c���[�pXML�h�L�������g���č\�z
			flashTree = new XmlDocument();
			// �h�L�������gRoot���쐬�A�c���[�pXML�ɒǉ�
			rootElement = flashTree.createElement("root");
			flashTree.appendChild(rootElement);
			// �h�L�������groot�Ƀc���[�ǉ��Ώ�id��ݒ�
			rootElement.setAttribute("target", struct.getid());

			// ���ʃ��x���m�[�h��W�J
			// �����ł́A�P���x�������Ƀm�[�h��W�J����B
			// ���̂��߁A�ő�W�J���x���Ɍ��݂̃��x���{�P��n���Ă���B
			int treeLevel = Integer.parseInt(struct.getlvl());
			int nodeId = Integer.parseInt(struct.getmaxid());
			expandTree(
				rootElement,
				struct,
				Integer.parseInt(struct.getid()),
				nodeId + 1,
				nodeId + _maxRead,
				treeLevel + 1,
				treeLevel + 1,
				false);
		} catch (MaxLineException me) {
			flashTree.removeChild(rootElement);
			Element stopNodeElement = flashTree.createElement("node");
			flashTree.appendChild(stopNodeElement);
			stopNodeElement.setAttribute("target", struct.getid());
			stopNodeElement.setAttribute("terminated", "true");
			ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_maxRead));
			stopNodeElement.setAttribute(
				"terminate_comment",
				emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
			msgStruct.addError(emsg);
			sysLog.warning(emsg, getsysUSER_CD());

			setReadStatus(TOO_MANY);
			return;
		}


                //}}user_implement_dev:<controlAddTree>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


		initializeAll();

		// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
		if (isScreenMove() == true) {
			// �����̃R���g���[�����\�b�h���Ăяo���܂��B
			//				controlSelect();
		}


                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			PrivateConfig pc = new PrivateConfig(conn);
			// �ő�W�J���x�����擾
			Integer maxLevel = pc.getNumber("MAX_DISPLAY_PS_LEVEL");
			if (maxLevel == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				sysLog.severe(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", "SYS_PARAMETER.NAME:MAX_DISPLAY_PS_LEVEL");
				sysLog.severe(emsg, getsysUSER_CD());
				throw new NoDataException();
			}
			_maxDisplayLevel = maxLevel.intValue();

			// �����W�J���x�����擾
			Integer initLevel = pc.getNumber("INIT_DISPLAY_PS_LEVEL");
			if (initLevel == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				sysLog.severe(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", "SYS_PARAMETER.NAME:INIT_DISPLAY_PS_LEVEL");
				sysLog.severe(emsg, getsysUSER_CD());
				throw new NoDataException();
			}
			_initDisplayLevel = initLevel.intValue();

			// �ő�Ǎ��s����ݒ�
			_maxRead = sp.getMaxLine(conn, 10);

		} catch (NoDataException e) {
			throw new ExpjException(e, "ZZ06001");
		} catch (SQLException e) {
			throw new ExpjException(e);
		}


                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("ShowDetail") ) {
				controlShowDetail();
			} else if( button.equals("AddTree") ) {
				controlAddTree();
			} else if( button.equals("initial") ) {
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
//			throw new FoundationException("AD0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0020010Entity entity;
	protected AD0020010Struct struct;
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

		entity = new AD0020010Entity();
		struct = new AD0020010Struct();

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
	 * AD0020010�N���X�̕W���R���X�g���N�^
	 */
	public AD0020010Control() throws BusinessProcessException, FoundationException
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
				AD0020010Struct key = (AD0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("InitLevel") && key.getInitLevel() != null) {
					msgKey.setKeyValue("InitLevel", key.getInitLevel());
				}
				if(msgKeyType.containsKeyColumn("AD0020010tree1") && key.getAD0020010tree1() != null) {
					msgKey.setKeyValue("AD0020010tree1", key.getAD0020010tree1());
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
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUM_PUCH_ODR_QTY") && key.getSUM_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("SUM_PUCH_ODR_QTY", key.getSUM_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OPR_INST_QTY") && key.getSUM_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("SUM_OPR_INST_QTY", key.getSUM_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_ALCD_QTY") && key.getSUM_ALCD_QTY() != null) {
					msgKey.setKeyValue("SUM_ALCD_QTY", key.getSUM_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN") && key.getODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DN", key.getODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN") && key.getDM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("DM_STS_TYP_DN", key.getDM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
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
					AD0020010Struct key = new AD0020010Struct();
					if(msgKeyType.containsKeyColumn("InitLevel")) {
						key.setInitLevel(msgKey.getKeyValue("InitLevel"));
					}
					if(msgKeyType.containsKeyColumn("AD0020010tree1")) {
						key.setAD0020010tree1(msgKey.getKeyValue("AD0020010tree1"));
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
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(msgKey.getKeyValue("OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUM_PUCH_ODR_QTY")) {
						key.setSUM_PUCH_ODR_QTY(msgKey.getKeyValue("SUM_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OPR_INST_QTY")) {
						key.setSUM_OPR_INST_QTY(msgKey.getKeyValue("SUM_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ALCD_QTY")) {
						key.setSUM_ALCD_QTY(msgKey.getKeyValue("SUM_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN")) {
						key.setODR_STS_TYP_DN(msgKey.getKeyValue("ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN")) {
						key.setDM_STS_TYP_DN(msgKey.getKeyValue("DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
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
