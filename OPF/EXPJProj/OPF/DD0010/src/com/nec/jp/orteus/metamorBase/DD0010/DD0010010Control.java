/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0010/src/com/nec/jp/orteus/metamorBase/DD0010/DD0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DD0010;

import com.nec.jp.orteus.metamorBase.DD0010.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class DD0010010Control
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
				setStruct2XML(elChild, (DD0010010Struct)list.get(i), startId, lvl, parentId);
				// �쐬�����G�������g���q���Ƃ��Ēǉ�
				el.appendChild(elChild);
			}
		}
		return startId;
	}

	public int setXMLDoc(Element el, List list, int startId) throws BusinessProcessException, FoundationException {
		return setXMLDoc(el, list, startId, 1, 0);
	} 

	public void setStruct2XML(Element el, DD0010010Struct struct, int id, int lvl, int parentId) throws BusinessProcessException, FoundationException {

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
                  if (struct.getlabel() != null && !struct.getlabel().equals("")) {
                   el.setAttribute("label", struct.getlabel());
                  }
              
                  if (struct.gett_YEAR() != null && !struct.gett_YEAR().equals("")) {
                   el.setAttribute("t_YEAR", struct.gett_YEAR());
                  }
                  if (struct.gett_HALF_TERM_TYP() != null
                   && !struct.gett_HALF_TERM_TYP().equals("")) {
                   el.setAttribute("t_HALF_TERM_TYP", struct.gett_HALF_TERM_TYP());
                  }
                  if (struct.gett_PLANT_CD() != null && !struct.gett_PLANT_CD().equals("")) {
                   el.setAttribute("t_PLANT_CD", struct.gett_PLANT_CD());
                  }
                  if (struct.gett_ROOT_ITEM_CD() != null && !struct.gett_ROOT_ITEM_CD().equals("")) {
                   el.setAttribute("t_ROOT_ITEM_CD", struct.gett_ROOT_ITEM_CD());
                  }
                  if (struct.gett_PARENT_ITEM_CD() != null
                   && !struct.gett_PARENT_ITEM_CD().equals("")) {
                   el.setAttribute("t_PARENT_ITEM_CD", struct.gett_PARENT_ITEM_CD());
                  }
                  if (struct.gett_ITEM_CD() != null && !struct.gett_ITEM_CD().equals("")) {
                   el.setAttribute("t_ITEM_CD", struct.gett_ITEM_CD());
                  }
                  if (struct.gett_ITEM_NAME() != null && !struct.gett_ITEM_NAME().equals("")) {
                   el.setAttribute("t_ITEM_NAME", struct.gett_ITEM_NAME());
                  }
                  if (struct.gett_PS_EDITION() != null && !struct.gett_PS_EDITION().equals("")) {
                   el.setAttribute("t_PS_EDITION", struct.gett_PS_EDITION());
                  }
                  if (struct.gett_COST_STATEMENT_NO() != null && !struct.gett_COST_STATEMENT_NO().equals("")) {
                   el.setAttribute("t_COST_STATEMENT_NO", struct.gett_COST_STATEMENT_NO());
                  }
                //}}user_implement_dev:<setStruct2XML>
			} catch(DOMException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public void setStruct2XML(Element el, DD0010010Struct struct, int id) throws BusinessProcessException, FoundationException {
		setStruct2XML(el, struct, id, 1, 0);
		return;
	}

	// PDF�p�A�N�Z�T���\�b�h
	private String queryFileName = null;
	public String getQueryfileName() { return this.queryFileName; }
	public void setQueryFileName(String queryFileName) { this.queryFileName = queryFileName; }
	private String frmFileName = null;
	public String getFrmfileName() { return this.frmFileName; }
	public void setFrmFileName(String frmFileName) { this.frmFileName = frmFileName; }
	private String pdfFileName = null;
	public String getPdfFileName() { return this.pdfFileName; }
	public void setPdfFileName(String pdfFileName) { this.pdfFileName = pdfFileName; }
	private String dbUID = null;
	private String dbPWD = null;
	private String dbDBQ = null;
	private String dbKIND = null;
	private String pdfFilePath = null;
	public String getPdfFilePath() { return this.pdfFilePath; }
	public void setPdfFilePath(String pdfFilePath) { this.pdfFilePath = pdfFilePath; }

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
        protected List list; // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
       
        // �f�t�H���g�A�N�Z�T���\�b�h
        public List getList() {
         return this.list;
        } // ���X�g��Ԃ��܂��B
        public void setList(List listname) {
         this.list = listname;
        } // ���X�g���Z�b�g���܂��B
        public int getListsize() { // ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if (this.list != null) {
          nret = this.list.size();
         }
         return nret;
        }
        //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public DD0010010Struct getListvalue(int x) {
         return (DD0010010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public DD0010010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public DD0010010Struct createStruct() {
         return new DD0010010Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((DD0010010Struct) structname);
        } // Struct���Z�b�g���܂��B
        public void initializeStruct() {
         this.struct.initialize();
        } // Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter() {
         return this.csvWriter;
        }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr) {
         this.csvReader = cr;
        }
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        /** ���O�C�����[�U�̍H��R�[�h���L�[�Ɍ�������[�����Ǘ��p�����[�^]�f�[�^�I�u�W�F�N�g�i��ʏ������Ɏg�p�j */
        private DD0010010Struct _mySysCostCtrl;
       
        /** ������敪��R���{�{�b�N�X�f�[�^ */
        private ComboStruct _halfTermTypComboStruct = new ComboStruct();
       
        /** CSV�o�̓f�[�^���X�g */
        private List _csvList;
       
        /** ��ʑJ�ڃL�[(�H��R�[�h) */
        private String _plantCd;
        /** ��ʑJ�ڃL�[(�N�x) */
        private String _year;
        /** ��ʑJ�ڃL�[(�����敪) */
        private String _halfTermTyp;
        /** ��ʑJ�ڃL�[(�ŏ�ʕi�ڔԍ�) */
        private String _rootItemCd;
       
        /** �f�t�H�[���g�����W�J���x�� */
        private static final String DEFAULT_INIT_LEVEL = "15";
        /** �ő�݌v�s�� */
        private static final int MAX_NODE_NUM = 50;
        /** �ő�Ǎ��s���i�����Ǎ��܂��͒ǉ��Ǎ����j */
        private static final int MAX_READ_NUM = 20;
       
        /**
         * ��ʑJ�ڃL�[(�H��R�[�h)���擾���܂��B
         * @return ��ʑJ�ڃL�[(�H��R�[�h)
         */
        public String getPlantCd() {
         return _plantCd;
        }
        /**
         * ��ʑJ�ڃL�[(�H��R�[�h)��ݒ肵�܂��B
         * @param string ��ʑJ�ڃL�[(�H��R�[�h)
         */
        public void setPlantCd(String string) {
         _plantCd = string;
        }
        /**
         * ��ʑJ�ڃL�[(�N�x)���擾���܂��B
         * @return ��ʑJ�ڃL�[(�N�x)
         */
        public String getYear() {
         return _year;
        }
        /**
         * ��ʑJ�ڃL�[(�N�x)��ݒ肵�܂��B
         * @param string ��ʑJ�ڃL�[(�N�x)
         */
        public void setYear(String string) {
         _year = string;
        }
        /**
         * ��ʑJ�ڃL�[(�����敪)���擾���܂��B
         * @return ��ʑJ�ڃL�[(�����敪)
         */
        public String getHalfTermTyp() {
         return _halfTermTyp;
        }
        /**
         * ��ʑJ�ڃL�[(�����敪)��ݒ肵�܂��B
         * @param string ��ʑJ�ڃL�[(�����敪)
         */
        public void setHalfTermTyp(String string) {
         _halfTermTyp = string;
        }
        /**
         * ��ʑJ�ڃL�[(�ŏ�ʕi�ڔԍ�)���擾���܂��B
         * @return ��ʑJ�ڃL�[(�ŏ�ʕi�ڔԍ�)
         */
        public String getRootItemCd() {
         return _rootItemCd;
        }
        /**
         * ��ʑJ�ڃL�[(�ŏ�ʕi�ڔԍ�)��ݒ肵�܂��B
         * @param string ��ʑJ�ڃL�[(�ŏ�ʕi�ڔԍ�)
         */
        public void setRootItemCd(String string) {
         _rootItemCd = string;
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
         DD0010010Struct parentNodeStruct,
         int parentNodeId,
         int compNodeId,
         int maxNodeId,
         int compTreeLevel,
         int maxLevel,
         boolean selectFlag)
         throws BusinessProcessException, FoundationException, ExpjException, MaxLineException {
         try {
       
          // �������O�t���O�`�F�b�N
          if ("1".equals(parentNodeStruct.gett_COST_EXCLUDE_FLG())) {
           // �������O�t���O=1�̏ꍇ�A���[�m�[�h�Ƃ��Đ�p�A�C�R�����Z�b�g����B
           parentNodeElement.setAttribute("ctx", "T");
           parentNodeElement.setAttribute("icon1", "TreeIcon3C");
           return compNodeId;
          }
       
          // �q�m�[�h�̈ꗗ���擾
          DD0010010Struct workStruct = new DD0010010Struct();
          workStruct.sett_YEAR(parentNodeStruct.gett_YEAR());
          workStruct.sett_HALF_TERM_TYP(parentNodeStruct.gett_HALF_TERM_TYP());
          workStruct.sett_PLANT_CD(parentNodeStruct.gett_PLANT_CD());
          workStruct.sett_ROOT_ITEM_CD(parentNodeStruct.gett_ROOT_ITEM_CD());
          workStruct.sett_PARENT_ITEM_CD(parentNodeStruct.gett_ITEM_CD());
          workStruct.sett_PARENT_COST_STATEMENT_NO(parentNodeStruct.gett_COST_STATEMENT_NO());
          List compNodeList = null;
       
          compNodeList = entity.mNode.read(conn, workStruct);
       
          if (compNodeList.size() == 0) {
           // ���[�m�[�h�̏ꍇ
           parentNodeElement.setAttribute("ctx", "T");
           // �c���[�A�C�R�����Z�b�g
           // �[���i�ڂł��邩�𔻒�
           if ("1".equals(parentNodeStruct.gett_DMY_ITEM_FLG())) {
            // �[���i�ڂ̓O���[�́�
            parentNodeElement.setAttribute("icon1", "AD0020011CIcon03C");
           } else {
            // �[���i�ڈȊO�̓u���[�́�
            parentNodeElement.setAttribute("icon1", "AD0020011CIcon01C");
           }
          } else if (parentNodeElement.hasAttribute("target") == false) {
           // ���[�ȊO�̃m�[�h�ł���ARoot�łȂ��ꍇ
           parentNodeElement.setAttribute("ctx", "N");
           // �c���[�A�C�R�����Z�b�g
           // �[���i�ڂł��邩�𔻒�
           if ("1".equals(parentNodeStruct.gett_DMY_ITEM_FLG())) {
            // �[���i�ڂ̓O���[�́�
            parentNodeElement.setAttribute("icon1", "AD0020011CIcon03A");
            parentNodeElement.setAttribute("icon2", "AD0020011CIcon03B");
           } else {
            // �[���i�ڈȊO�̓u���[�́�
            parentNodeElement.setAttribute("icon1", "AD0020011CIcon01A");
            parentNodeElement.setAttribute("icon2", "AD0020011CIcon01B");
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
           DD0010010Struct compNodeStruct = (DD0010010Struct) compNodeList.get(i);
           // �q�m�[�h�𐶐��A�c���[�pXML�ɒǉ�
           Element compNodeElement = flashTree.createElement("node");
           parentNodeElement.appendChild(compNodeElement);
           // compNodeStruct����q�m�[�h�̊e�푮���f�[�^��ݒ�
           compNodeStruct.setlabel(
            compNodeStruct.gett_ITEM_CD()
             + " "
             + null2blank(compNodeStruct.gett_ITEM_NAME())
             + "�i"
             + compNodeStruct.gett_PS_EDITION()
             + "�j�m"
             + compNodeStruct.gett_EFF_PHASE_IN_DATE()
             + "-"
             + compNodeStruct.gett_EFF_PHASE_OUT_DATE()
             + "�n");
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
         struct.setPLANT_NAME(null);
         struct.setYEAR(_mySysCostCtrl.getCURRENT_YEAR());
         struct.setHALF_TERM_TYP(_mySysCostCtrl.getHALF_TERM_TYP());
         struct.setROOT_ITEM_CD(null);
         struct.setROOT_ITEM_NAME(null);
         struct.setInitLevel(String.valueOf(_initDisplayLevel));
       
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
       
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                Element rootElement = null;
                Element topNodeElement = null;
                DD0010010Struct workStruct = null;
                try {
                 // �L�[�ȊO�̉�ʂ�������
                 initializeDetail();
                 // �c���[�pXML�h�L�������g��������
                 flashTree = new XmlDocument();
              
                 // �L�[���ڂ̖��̎擾
                 // �H�ꖼ
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DD0010010Struct mPlantStruct = (DD0010010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // �i�ږ�
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getROOT_ITEM_CD());
                  struct.setROOT_ITEM_NAME(null);
                 } else {
                  DD0010010Struct mItemStruct = (DD0010010Struct) mItemList.get(0);
                  struct.setROOT_ITEM_NAME(mItemStruct.getROOT_ITEM_NAME());
                 }
              
                 // �G���[���������珈���𒆒f
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // �c���[�̃��[�g������
                 List rootList = entity.mRoot.read(conn, struct);
                 if (rootList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  return;
                 }
              
                 DD0010010Struct rootStruct = (DD0010010Struct) rootList.get(0);
              
                 // �h�L�������gRoot���쐬�A�c���[�pXML�ɒǉ�
                 rootElement = flashTree.createElement("root");
                 flashTree.appendChild(rootElement);
                 // �h�L�������gRoot�ɏ����W�J���x����ݒ�
                 rootElement.setAttribute("init_level", struct.getInitLevel());
                 // �ŏ�ʃ��x���m�[�h�𐶐��A�c���[�pXML�ɒǉ�
                 topNodeElement = flashTree.createElement("node");
                 rootElement.appendChild(topNodeElement);
                 // struct����ŏ�ʃ��x���m�[�h�̊e�푮���f�[�^��ݒ�
                 struct.sett_YEAR(rootStruct.gett_YEAR());
                 struct.sett_HALF_TERM_TYP(rootStruct.gett_HALF_TERM_TYP());
                 struct.sett_PLANT_CD(rootStruct.gett_PLANT_CD());
                 struct.sett_ROOT_ITEM_CD(rootStruct.gett_ROOT_ITEM_CD());
                 struct.sett_PARENT_ITEM_CD(rootStruct.gett_PARENT_ITEM_CD());
                 struct.sett_ITEM_CD(rootStruct.gett_ITEM_CD());
                 struct.sett_ITEM_NAME(rootStruct.gett_ITEM_NAME());
                 struct.sett_PARENT_COST_STATEMENT_NO(rootStruct.gett_PARENT_COST_STATEMENT_NO());
                 struct.sett_COST_STATEMENT_NO(rootStruct.gett_COST_STATEMENT_NO());
                 struct.sett_PS_EDITION(rootStruct.gett_PS_EDITION());
                 struct.sett_EFF_PHASE_IN_DATE(rootStruct.gett_EFF_PHASE_IN_DATE());
                 struct.sett_EFF_PHASE_OUT_DATE(rootStruct.gett_EFF_PHASE_OUT_DATE());
                 struct.sett_DMY_ITEM_FLG(rootStruct.gett_DMY_ITEM_FLG());
                 struct.sett_COST_EXCLUDE_FLG(rootStruct.gett_COST_EXCLUDE_FLG());
                 struct.setlabel(
                  rootStruct.gett_ITEM_CD()
                   + " "
                   + null2blank(rootStruct.gett_ITEM_NAME())
                   + "�i"
                   + rootStruct.gett_PS_EDITION()
                   + "�j�m"
                   + rootStruct.gett_EFF_PHASE_IN_DATE()
                   + "-"
                   + rootStruct.gett_EFF_PHASE_OUT_DATE()
                   + "�n");
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
              
                 // CSV�f�[�^������
                 List csvList = entity.mCsv.read(conn, struct);
                 _csvList = csvList;
              
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
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * FlashTree�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlFlashTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");
			//{{user_implement_dev:<controlFlashTree>
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
                  setStruct2XML(el, (DD0010010Struct)list.get(i), startId);
                
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
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
                // CSV���̍쐬
                List csvList = new ArrayList();
                String[] title =
                 {
                 	"Expj.YEAR" ,
					"Expj.HALF_TERM_TYP" ,
					"Expj.Cmt1105" ,
					"Expj.COST_TYP" ,
					"Expj.Cmt1035" ,
					"Expj.PLANT_CD" ,
					"Expj.PLANT_NAME" ,
					"Expj.ROOT_ITEM_CD" ,
					"Expj.ROOT_ITEM_NAME" ,
					"Expj.PARENT_ITEM_CD" ,
					"Expj.PARENT_ITEM_NAME" ,
					"Expj.ITEM_CD" ,
					"Expj.ITEM_NAME" ,
					"Expj.PS_EDITION" ,
					"Expj.Cmt1033" ,
					"Expj.CS_PROC_CD" ,
					"Expj.CS_PROC_NAME" ,
					"Expj.WS_CD" ,
					"Expj.WS_NAME" ,
					"Expj.ORG_CD" ,
					"Expj.ORG_NAME" ,
					"Expj.NECESSARY_QTY" ,
					"Expj.PS_INPUT_RATIO" ,
					"Expj.ITEM_INPUT_RATIO" ,
					"Expj.TOTAL_COST" ,
					"Expj.OWN_MATR_COST" ,
					"Expj.TOTAL_MATR_COST" ,
					"Expj.OWN_SBCNT_MATR_COST" ,
					"Expj.TOTAL_SBCNT_MATR_COST" ,
					"Expj.OWN_PROC_COST_SUM_ALL" ,
					"Expj.TOTAL_PROC_COST_SUM_ALL" ,
					"Expj.CUR_UNIT" ,
					"Expj.Cmt1070" ,
					"Expj.Cmt1071" ,
					"Expj.Cmt1067" ,
					"Expj.Cmt1068" ,
					"Expj.STOCK_UNIT" ,
					"Expj.CLASIFICATION_CD_1" ,
					"Expj.OUTSIDE_TYP_4" ,
					"Expj.Cmt1110" ,
					"Expj.OUTSIDE_TYP_6" ,
					"Expj.Cmt1039" ,
					"Expj.PROC_COST_CLS_CD" ,
					"Expj.PROC_COST_CLS_NAME" ,
					"Expj.PROC_COST_UNIT_QTY" ,
					"Expj.STOCK_UNIT_2" ,
					"Expj.Cmt1051" ,
					"Expj.Cmt1052" ,
					"Expj.Cmt1053" ,
					"Expj.Cmt1054" ,
					"Expj.Cmt1055" ,
					"Expj.Cmt1056" ,
					"Expj.Cmt1057" ,
					"Expj.Cmt1058" ,
					"Expj.Cmt1059" ,
					"Expj.Cmt1060" ,
					"Expj.Cmt1061" ,
					"Expj.Cmt1062" ,
					"Expj.Cmt1063" ,
					"Expj.Cmt1077" ,
					"Expj.Cmt1078" ,
					"Expj.Cmt1079" ,
					"Expj.Cmt1080" ,
					"Expj.Cmt1081" ,
					"Expj.Cmt1082" ,
					"Expj.Cmt1083" ,
					"Expj.Cmt1084" ,
					"Expj.Cmt1085" ,
					"Expj.Cmt1086" ,
					"Expj.Cmt1087" ,
					"Expj.Cmt1088" ,
					"Expj.Cmt1089" ,
					"Expj.Cmt1018" ,
					"Expj.Cmt1019" ,
					"Expj.Cmt1020" ,
					"Expj.Cmt1021" ,
					"Expj.Cmt1022" ,
					"Expj.Cmt1023" ,
					"Expj.Cmt1024" ,
					"Expj.Cmt1025" ,
					"Expj.Cmt1026" ,
					"Expj.Cmt1027" ,
					"Expj.Cmt1028" ,
					"Expj.Cmt1029" 
                  };
                csvList.add(title);
                for (Iterator i = _csvList.iterator(); i.hasNext();) {
                 DD0010010Struct csvStruct = (DD0010010Struct) i.next();
                 String[] csvStr = new String[title.length];
                 csvStr[0] = csvStruct.getYEAR();
                 csvStr[1] = csvStruct.getHALF_TERM_TYP();
                 csvStr[2] = this.multcombo("HALF_TERM_TYP",csvStruct.getHALF_TERM_TYP());
                 csvStr[3] = csvStruct.getCOST_TYP();
                 csvStr[4] = this.multcombo("COST_TYP",csvStruct.getCOST_TYP());
                 csvStr[5] = csvStruct.getPLANT_CD();
                 csvStr[6] = csvStruct.getPLANT_NAME();
                 csvStr[7] = csvStruct.getROOT_ITEM_CD();
                 csvStr[8] = csvStruct.getROOT_ITEM_NAME();
                 csvStr[9] = csvStruct.getPARENT_ITEM_CD();
                 csvStr[10] = csvStruct.getPARENT_ITEM_NAME();
                 csvStr[11] = csvStruct.getITEM_CD();
                 csvStr[12] = csvStruct.getITEM_NAME();
                 csvStr[13] = csvStruct.getPS_EDITION();
                 csvStr[14] = csvStruct.getCOST_STATEMENT_NO();
                 csvStr[15] = csvStruct.getCS_PROC_CD();
                 csvStr[16] = csvStruct.getCS_PROC_NAME();
                 csvStr[17] = csvStruct.getWS_CD();
                 csvStr[18] = csvStruct.getWS_NAME();
                 csvStr[19] = csvStruct.getORG_CD();
                 csvStr[20] = csvStruct.getORG_NAME();
                 csvStr[21] = csvStruct.getNECESSARY_QTY();
                 csvStr[22] = csvStruct.getPS_INPUT_RATIO();
                 csvStr[23] = csvStruct.getITEM_INPUT_RATIO();
                 csvStr[24] = csvStruct.getTOTAL_COST();
                 csvStr[25] = csvStruct.getOWN_MATR_COST();
                 csvStr[26] = csvStruct.getTOTAL_MATR_COST();
                 csvStr[27] = csvStruct.getOWN_SBCNT_MATR_COST();
                 csvStr[28] = csvStruct.getTOTAL_SBCNT_MATR_COST();
                 csvStr[29] = csvStruct.getOWN_PROC_COST_SUM_ALL();
                 csvStr[30] = csvStruct.getTOTAL_PROC_COST_SUM_ALL();
                 csvStr[31] = csvStruct.getHOME_CUR_UNIT();
                 csvStr[32] = csvStruct.getEFF_PHASE_IN_DATE();
                 csvStr[33] = csvStruct.getEFF_PHASE_OUT_DATE();
                 csvStr[34] = csvStruct.getPARENT_COST_STATEMENT_NO();
                 csvStr[35] = csvStruct.getPARENT_ITEM_STOCK_UNIT();
                 csvStr[36] = csvStruct.getSTOCK_UNIT();
                 csvStr[37] = csvStruct.getCLASIFICATION_CD();
                 csvStr[38] = csvStruct.getOUTSIDE_TYP();
                 csvStr[39] = this.multcombo("OUTSIDE_TYP",csvStruct.getOUTSIDE_TYP());
                 csvStr[40] = csvStruct.getPROC_OUTSIDE_TYP();
                 csvStr[41] = this.multcombo("OUTSIDE_TYP",csvStruct.getPROC_OUTSIDE_TYP());
                 csvStr[42] = csvStruct.getPROC_COST_CLS_CD();
                 csvStr[43] = csvStruct.getPROC_COST_CLS_NAME();
                 csvStr[44] = csvStruct.getPROC_COST_UNIT_QTY();
                 csvStr[45] = csvStruct.getPROC_COST_UNIT_QTY_UNIT();
                 csvStr[46] = csvStruct.getOWN_PROC_COST_01();
                 csvStr[47] = csvStruct.getOWN_PROC_COST_02();
                 csvStr[48] = csvStruct.getOWN_PROC_COST_03();
                 csvStr[49] = csvStruct.getOWN_PROC_COST_04();
                 csvStr[50] = csvStruct.getOWN_PROC_COST_05();
                 csvStr[51] = csvStruct.getOWN_PROC_COST_06();
                 csvStr[52] = csvStruct.getOWN_PROC_COST_07();
                 csvStr[53] = csvStruct.getOWN_PROC_COST_08();
                 csvStr[54] = csvStruct.getOWN_PROC_COST_09();
                 csvStr[55] = csvStruct.getOWN_PROC_COST_10();
                 csvStr[56] = csvStruct.getOWN_PROC_COST_11();
                 csvStr[57] = csvStruct.getOWN_PROC_COST_12();
                 csvStr[58] = csvStruct.getOWN_PROC_COST_SUM();
                 csvStr[59] = csvStruct.getTOTAL_PROC_COST_01();
                 csvStr[60] = csvStruct.getTOTAL_PROC_COST_02();
                 csvStr[61] = csvStruct.getTOTAL_PROC_COST_03();
                 csvStr[62] = csvStruct.getTOTAL_PROC_COST_04();
                 csvStr[63] = csvStruct.getTOTAL_PROC_COST_05();
                 csvStr[64] = csvStruct.getTOTAL_PROC_COST_06();
                 csvStr[65] = csvStruct.getTOTAL_PROC_COST_07();
                 csvStr[66] = csvStruct.getTOTAL_PROC_COST_08();
                 csvStr[67] = csvStruct.getTOTAL_PROC_COST_09();
                 csvStr[68] = csvStruct.getTOTAL_PROC_COST_10();
                 csvStr[69] = csvStruct.getTOTAL_PROC_COST_11();
                 csvStr[70] = csvStruct.getTOTAL_PROC_COST_12();
                 csvStr[71] = csvStruct.getTOTAL_PROC_COST_SUM();
                 csvStr[72] = csvStruct.getPROC_COST_01_NAME();
                 csvStr[73] = csvStruct.getPROC_COST_02_NAME();
                 csvStr[74] = csvStruct.getPROC_COST_03_NAME();
                 csvStr[75] = csvStruct.getPROC_COST_04_NAME();
                 csvStr[76] = csvStruct.getPROC_COST_05_NAME();
                 csvStr[77] = csvStruct.getPROC_COST_06_NAME();
                 csvStr[78] = csvStruct.getPROC_COST_07_NAME();
                 csvStr[79] = csvStruct.getPROC_COST_08_NAME();
                 csvStr[80] = csvStruct.getPROC_COST_09_NAME();
                 csvStr[81] = csvStruct.getPROC_COST_10_NAME();
                 csvStr[82] = csvStruct.getPROC_COST_11_NAME();
                 csvStr[83] = csvStruct.getPROC_COST_12_NAME();
                 csvList.add(csvStr);
                }
                if (csvList != null && !csvList.isEmpty()) {
                 // CsvWriter�𐶐�
                 csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
                 csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
                 struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
                }
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // ��ʂ�������
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAddTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");
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
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");

		return;
	}

	/**
	 * �{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");
			//{{user_implement_dev:<controlShowDetail>
                try {
                 // �I�����ꂽ�m�[�h�����ɏڍ׏����擾
                 List detailList = entity.mDetail.read(conn, struct);
                 DD0010010Struct detailStruct = (DD0010010Struct) detailList.get(0);
              
                 // �ڍ׏���ݒ�
                 struct.setd_PARENT_ITEM_CD(detailStruct.getd_PARENT_ITEM_CD());
                 struct.setd_PARENT_ITEM_NAME(detailStruct.getd_PARENT_ITEM_NAME());
                 struct.setd_ITEM_CD(detailStruct.getd_ITEM_CD());
                 struct.setd_ITEM_NAME(detailStruct.getd_ITEM_NAME());
                 struct.setd_MRP_ODR_TYP_DN(this.multcombo("MRP_ODR_TYP",detailStruct.getd_MRP_ODR_TYP_DN()));
                 struct.setd_OUTSIDE_TYP_DN(this.multcombo("OUTSIDE_TYP",detailStruct.getd_OUTSIDE_TYP_DN()));
                 struct.setd_PROC_OUTSIDE_TYP_DN(this.multcombo("OUTSIDE_TYP",detailStruct.getd_PROC_OUTSIDE_TYP_DN()));
                 struct.setd_CLASIFICATION_CD(detailStruct.getd_CLASIFICATION_CD());
                 struct.setd_CS_PROC_CD(detailStruct.getd_CS_PROC_CD());
                 struct.setd_CS_PROC_NAME(detailStruct.getd_CS_PROC_NAME());
                 struct.setd_PS_UNIT_QTY(detailStruct.getd_PS_UNIT_QTY());
                 struct.setd_NECESSARY_QTY(detailStruct.getd_NECESSARY_QTY());
                 struct.setd_STOCK_UNIT(detailStruct.getd_STOCK_UNIT());
                 struct.setd_PS_INPUT_RATIO(detailStruct.getd_PS_INPUT_RATIO());
                 struct.setd_ITEM_INPUT_RATIO(detailStruct.getd_ITEM_INPUT_RATIO());
                 struct.setd_TOTAL_COST(detailStruct.getd_TOTAL_COST());
                 struct.setd_OWN_MATR_COST(detailStruct.getd_OWN_MATR_COST());
                 struct.setd_TOTAL_MATR_COST(detailStruct.getd_TOTAL_MATR_COST());
                 struct.setd_OWN_SBCNT_MATR_COST(detailStruct.getd_OWN_SBCNT_MATR_COST());
                 struct.setd_TOTAL_SBCNT_MATR_COST(detailStruct.getd_TOTAL_SBCNT_MATR_COST());
                 struct.setd_OWN_PROC_COST_SUM_ALL(detailStruct.getd_OWN_PROC_COST_SUM_ALL());
                 struct.setd_TOTAL_PROC_COST_SUM_ALL(detailStruct.getd_TOTAL_PROC_COST_SUM_ALL());
                 struct.setd_HOME_CUR_UNIT(detailStruct.getd_HOME_CUR_UNIT());
                 struct.setd_COST_UP_TYP_DN(this.multcombo("COST_UP_TYP",detailStruct.getd_COST_UP_TYP_DN()));
                 struct.setd_VOLUNT_SPL_FLG_DN(this.multcombo("VOLUNT_SPL_FLG",detailStruct.getd_VOLUNT_SPL_FLG_DN()));
                 struct.setd_ONEROUS_CONS_FLG_DN(this.multcombo("ONEROUS_CONS_FLG",detailStruct.getd_ONEROUS_CONS_FLG_DN()));
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlShowDetail>
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");

		return;
	}

	/**
	 * �ꗗ�\���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlMoveList() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlMoveList");
			//{{user_implement_dev:<controlMoveList>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlMoveList>
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlMoveList");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // ���O�C�����[�U�̍H��R�[�h���L�[��[�����Ǘ��p�����[�^]���擾����i��ʏ������Ɏg�p�j
                 struct.setPLANT_CD(sysPLANT_CD);
                 List sysCostCtrlList = entity.mSYS_COST_CTRL.read(conn, struct);
                 // [�����Ǘ��p�����[�^]�����݂��Ȃ��ꍇ�̓G���[���b�Z�[�W��\��
                 if (sysCostCtrlList.isEmpty()) {
                  setErrorMessage("DD00001");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  _mySysCostCtrl = new DD0010010Struct();
                 } else {
                  _mySysCostCtrl = (DD0010010Struct) sysCostCtrlList.get(0);
                 }
              
                 // �R���{�{�b�N�X�f�[�^���擾
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _halfTermTypComboStruct = comboBox.getData("HALF_TERM_TYP");
                 comboBox.setConnection(null);
                 // �R���{�{�b�N�X�f�[�^�̐ݒ�
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
              
                 // ��ʂ�������
                 initializeAll();
              
                 // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
                 if (isScreenMove() == true) {
                  struct.setPLANT_CD(_plantCd);
                  struct.setYEAR(_year);
                  struct.setHALF_TERM_TYP(_halfTermTyp);
                  struct.setROOT_ITEM_CD(_rootItemCd);
              
                  // �����̃R���g���[�����\�b�h���Ăяo���܂��B
                  controlSelect();
                 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A

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
                 // �R���{�{�b�N�X�f�[�^�̐ݒ�
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
              
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
		logger.exiting("DD0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("AddTree") ) {
				controlAddTree();
			} else if( button.equals("ShowDetail") ) {
				controlShowDetail();
			} else if( button.equals("MoveList") ) {
				controlMoveList();
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
//			throw new FoundationException("DD0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DD0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("DD0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DD0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("DD0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DD0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("DD0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected DD0010010Entity entity;
	protected DD0010010Struct struct;
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

		entity = new DD0010010Entity();
		struct = new DD0010010Struct();

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
	 * DD0010010�N���X�̕W���R���X�g���N�^
	 */
	public DD0010010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                try {
                } catch (MissingResourceException e) {
                 e.printStackTrace();
                }
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
				DD0010010Struct key = (DD0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name") && key.getHALF_TERM_TYP_name() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_name", key.getHALF_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val") && key.getHALF_TERM_TYP_val() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_val", key.getHALF_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("InitLevel") && key.getInitLevel() != null) {
					msgKey.setKeyValue("InitLevel", key.getInitLevel());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("h_MaxLevel") && key.geth_MaxLevel() != null) {
					msgKey.setKeyValue("h_MaxLevel", key.geth_MaxLevel());
				}
				if(msgKeyType.containsKeyColumn("h_ProcTyp") && key.geth_ProcTyp() != null) {
					msgKey.setKeyValue("h_ProcTyp", key.geth_ProcTyp());
				}
				if(msgKeyType.containsKeyColumn("DD0010010tree1") && key.getDD0010010tree1() != null) {
					msgKey.setKeyValue("DD0010010tree1", key.getDD0010010tree1());
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
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN") && key.getHALF_TERM_TYP_DN() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_DN", key.getHALF_TERM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_DN") && key.getCOST_TYP_DN() != null) {
					msgKey.setKeyValue("COST_TYP_DN", key.getCOST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP_DN") && key.getPROC_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("PROC_OUTSIDE_TYP_DN", key.getPROC_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("t_YEAR") && key.gett_YEAR() != null) {
					msgKey.setKeyValue("t_YEAR", key.gett_YEAR());
				}
				if(msgKeyType.containsKeyColumn("t_HALF_TERM_TYP") && key.gett_HALF_TERM_TYP() != null) {
					msgKey.setKeyValue("t_HALF_TERM_TYP", key.gett_HALF_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("t_PLANT_CD") && key.gett_PLANT_CD() != null) {
					msgKey.setKeyValue("t_PLANT_CD", key.gett_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("t_ROOT_ITEM_CD") && key.gett_ROOT_ITEM_CD() != null) {
					msgKey.setKeyValue("t_ROOT_ITEM_CD", key.gett_ROOT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("t_PARENT_ITEM_CD") && key.gett_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("t_PARENT_ITEM_CD", key.gett_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("t_ITEM_CD") && key.gett_ITEM_CD() != null) {
					msgKey.setKeyValue("t_ITEM_CD", key.gett_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("t_ITEM_NAME") && key.gett_ITEM_NAME() != null) {
					msgKey.setKeyValue("t_ITEM_NAME", key.gett_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("t_PS_EDITION") && key.gett_PS_EDITION() != null) {
					msgKey.setKeyValue("t_PS_EDITION", key.gett_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("t_COST_STATEMENT_NO") && key.gett_COST_STATEMENT_NO() != null) {
					msgKey.setKeyValue("t_COST_STATEMENT_NO", key.gett_COST_STATEMENT_NO());
				}
				if(msgKeyType.containsKeyColumn("t_EFF_PHASE_IN_DATE") && key.gett_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("t_EFF_PHASE_IN_DATE", key.gett_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("t_EFF_PHASE_OUT_DATE") && key.gett_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("t_EFF_PHASE_OUT_DATE", key.gett_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("t_DMY_ITEM_FLG") && key.gett_DMY_ITEM_FLG() != null) {
					msgKey.setKeyValue("t_DMY_ITEM_FLG", key.gett_DMY_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("t_COST_EXCLUDE_FLG") && key.gett_COST_EXCLUDE_FLG() != null) {
					msgKey.setKeyValue("t_COST_EXCLUDE_FLG", key.gett_COST_EXCLUDE_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("YEAR") && key.getYEAR() != null) {
					msgKey.setKeyValue("YEAR", key.getYEAR());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP") && key.getHALF_TERM_TYP() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP", key.getHALF_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD") && key.getROOT_ITEM_CD() != null) {
					msgKey.setKeyValue("ROOT_ITEM_CD", key.getROOT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("t_PARENT_COST_STATEMENT_NO") && key.gett_PARENT_COST_STATEMENT_NO() != null) {
					msgKey.setKeyValue("t_PARENT_COST_STATEMENT_NO", key.gett_PARENT_COST_STATEMENT_NO());
				}
				if(msgKeyType.containsKeyColumn("d_PARENT_ITEM_CD") && key.getd_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("d_PARENT_ITEM_CD", key.getd_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PARENT_ITEM_NAME") && key.getd_PARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("d_PARENT_ITEM_NAME", key.getd_PARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_CD") && key.getd_ITEM_CD() != null) {
					msgKey.setKeyValue("d_ITEM_CD", key.getd_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_NAME") && key.getd_ITEM_NAME() != null) {
					msgKey.setKeyValue("d_ITEM_NAME", key.getd_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_MRP_ODR_TYP_DN") && key.getd_MRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("d_MRP_ODR_TYP_DN", key.getd_MRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("d_OUTSIDE_TYP_DN") && key.getd_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("d_OUTSIDE_TYP_DN", key.getd_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("d_PROC_OUTSIDE_TYP_DN") && key.getd_PROC_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("d_PROC_OUTSIDE_TYP_DN", key.getd_PROC_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("d_CLASIFICATION_CD") && key.getd_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("d_CLASIFICATION_CD", key.getd_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CS_PROC_CD") && key.getd_CS_PROC_CD() != null) {
					msgKey.setKeyValue("d_CS_PROC_CD", key.getd_CS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CS_PROC_NAME") && key.getd_CS_PROC_NAME() != null) {
					msgKey.setKeyValue("d_CS_PROC_NAME", key.getd_CS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_PS_UNIT_QTY") && key.getd_PS_UNIT_QTY() != null) {
					msgKey.setKeyValue("d_PS_UNIT_QTY", key.getd_PS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_NECESSARY_QTY") && key.getd_NECESSARY_QTY() != null) {
					msgKey.setKeyValue("d_NECESSARY_QTY", key.getd_NECESSARY_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_STOCK_UNIT") && key.getd_STOCK_UNIT() != null) {
					msgKey.setKeyValue("d_STOCK_UNIT", key.getd_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("d_PS_INPUT_RATIO") && key.getd_PS_INPUT_RATIO() != null) {
					msgKey.setKeyValue("d_PS_INPUT_RATIO", key.getd_PS_INPUT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_INPUT_RATIO") && key.getd_ITEM_INPUT_RATIO() != null) {
					msgKey.setKeyValue("d_ITEM_INPUT_RATIO", key.getd_ITEM_INPUT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("d_TOTAL_COST") && key.getd_TOTAL_COST() != null) {
					msgKey.setKeyValue("d_TOTAL_COST", key.getd_TOTAL_COST());
				}
				if(msgKeyType.containsKeyColumn("d_OWN_MATR_COST") && key.getd_OWN_MATR_COST() != null) {
					msgKey.setKeyValue("d_OWN_MATR_COST", key.getd_OWN_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("d_TOTAL_MATR_COST") && key.getd_TOTAL_MATR_COST() != null) {
					msgKey.setKeyValue("d_TOTAL_MATR_COST", key.getd_TOTAL_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("d_OWN_SBCNT_MATR_COST") && key.getd_OWN_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("d_OWN_SBCNT_MATR_COST", key.getd_OWN_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("d_TOTAL_SBCNT_MATR_COST") && key.getd_TOTAL_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("d_TOTAL_SBCNT_MATR_COST", key.getd_TOTAL_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("d_OWN_PROC_COST_SUM_ALL") && key.getd_OWN_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("d_OWN_PROC_COST_SUM_ALL", key.getd_OWN_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("d_TOTAL_PROC_COST_SUM_ALL") && key.getd_TOTAL_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("d_TOTAL_PROC_COST_SUM_ALL", key.getd_TOTAL_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("d_HOME_CUR_UNIT") && key.getd_HOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("d_HOME_CUR_UNIT", key.getd_HOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("d_COST_UP_TYP_DN") && key.getd_COST_UP_TYP_DN() != null) {
					msgKey.setKeyValue("d_COST_UP_TYP_DN", key.getd_COST_UP_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("d_VOLUNT_SPL_FLG_DN") && key.getd_VOLUNT_SPL_FLG_DN() != null) {
					msgKey.setKeyValue("d_VOLUNT_SPL_FLG_DN", key.getd_VOLUNT_SPL_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("d_ONEROUS_CONS_FLG_DN") && key.getd_ONEROUS_CONS_FLG_DN() != null) {
					msgKey.setKeyValue("d_ONEROUS_CONS_FLG_DN", key.getd_ONEROUS_CONS_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP") && key.getCOST_TYP() != null) {
					msgKey.setKeyValue("COST_TYP", key.getCOST_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ROOT_ITEM_NAME") && key.getROOT_ITEM_NAME() != null) {
					msgKey.setKeyValue("ROOT_ITEM_NAME", key.getROOT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("COST_STATEMENT_NO") && key.getCOST_STATEMENT_NO() != null) {
					msgKey.setKeyValue("COST_STATEMENT_NO", key.getCOST_STATEMENT_NO());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_NAME") && key.getCS_PROC_NAME() != null) {
					msgKey.setKeyValue("CS_PROC_NAME", key.getCS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("NECESSARY_QTY") && key.getNECESSARY_QTY() != null) {
					msgKey.setKeyValue("NECESSARY_QTY", key.getNECESSARY_QTY());
				}
				if(msgKeyType.containsKeyColumn("PS_INPUT_RATIO") && key.getPS_INPUT_RATIO() != null) {
					msgKey.setKeyValue("PS_INPUT_RATIO", key.getPS_INPUT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_INPUT_RATIO") && key.getITEM_INPUT_RATIO() != null) {
					msgKey.setKeyValue("ITEM_INPUT_RATIO", key.getITEM_INPUT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_COST") && key.getTOTAL_COST() != null) {
					msgKey.setKeyValue("TOTAL_COST", key.getTOTAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OWN_MATR_COST") && key.getOWN_MATR_COST() != null) {
					msgKey.setKeyValue("OWN_MATR_COST", key.getOWN_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_MATR_COST") && key.getTOTAL_MATR_COST() != null) {
					msgKey.setKeyValue("TOTAL_MATR_COST", key.getTOTAL_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("OWN_SBCNT_MATR_COST") && key.getOWN_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("OWN_SBCNT_MATR_COST", key.getOWN_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_SBCNT_MATR_COST") && key.getTOTAL_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("TOTAL_SBCNT_MATR_COST", key.getTOTAL_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM_ALL") && key.getOWN_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_SUM_ALL", key.getOWN_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM_ALL") && key.getTOTAL_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_SUM_ALL", key.getTOTAL_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARENT_COST_STATEMENT_NO") && key.getPARENT_COST_STATEMENT_NO() != null) {
					msgKey.setKeyValue("PARENT_COST_STATEMENT_NO", key.getPARENT_COST_STATEMENT_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_STOCK_UNIT") && key.getPARENT_ITEM_STOCK_UNIT() != null) {
					msgKey.setKeyValue("PARENT_ITEM_STOCK_UNIT", key.getPARENT_ITEM_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP") && key.getPROC_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PROC_OUTSIDE_TYP", key.getPROC_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD") && key.getPROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_CD", key.getPROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME") && key.getPROC_COST_CLS_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_NAME", key.getPROC_COST_CLS_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY") && key.getPROC_COST_UNIT_QTY() != null) {
					msgKey.setKeyValue("PROC_COST_UNIT_QTY", key.getPROC_COST_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY_UNIT") && key.getPROC_COST_UNIT_QTY_UNIT() != null) {
					msgKey.setKeyValue("PROC_COST_UNIT_QTY_UNIT", key.getPROC_COST_UNIT_QTY_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_01") && key.getOWN_PROC_COST_01() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_01", key.getOWN_PROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_02") && key.getOWN_PROC_COST_02() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_02", key.getOWN_PROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_03") && key.getOWN_PROC_COST_03() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_03", key.getOWN_PROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_04") && key.getOWN_PROC_COST_04() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_04", key.getOWN_PROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_05") && key.getOWN_PROC_COST_05() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_05", key.getOWN_PROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_06") && key.getOWN_PROC_COST_06() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_06", key.getOWN_PROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_07") && key.getOWN_PROC_COST_07() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_07", key.getOWN_PROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_08") && key.getOWN_PROC_COST_08() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_08", key.getOWN_PROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_09") && key.getOWN_PROC_COST_09() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_09", key.getOWN_PROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_10") && key.getOWN_PROC_COST_10() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_10", key.getOWN_PROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_11") && key.getOWN_PROC_COST_11() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_11", key.getOWN_PROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_12") && key.getOWN_PROC_COST_12() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_12", key.getOWN_PROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM") && key.getOWN_PROC_COST_SUM() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_SUM", key.getOWN_PROC_COST_SUM());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_01") && key.getTOTAL_PROC_COST_01() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_01", key.getTOTAL_PROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_02") && key.getTOTAL_PROC_COST_02() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_02", key.getTOTAL_PROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_03") && key.getTOTAL_PROC_COST_03() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_03", key.getTOTAL_PROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_04") && key.getTOTAL_PROC_COST_04() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_04", key.getTOTAL_PROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_05") && key.getTOTAL_PROC_COST_05() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_05", key.getTOTAL_PROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_06") && key.getTOTAL_PROC_COST_06() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_06", key.getTOTAL_PROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_07") && key.getTOTAL_PROC_COST_07() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_07", key.getTOTAL_PROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_08") && key.getTOTAL_PROC_COST_08() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_08", key.getTOTAL_PROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_09") && key.getTOTAL_PROC_COST_09() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_09", key.getTOTAL_PROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_10") && key.getTOTAL_PROC_COST_10() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_10", key.getTOTAL_PROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_11") && key.getTOTAL_PROC_COST_11() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_11", key.getTOTAL_PROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_12") && key.getTOTAL_PROC_COST_12() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_12", key.getTOTAL_PROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM") && key.getTOTAL_PROC_COST_SUM() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_SUM", key.getTOTAL_PROC_COST_SUM());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_01_NAME") && key.getPROC_COST_01_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_01_NAME", key.getPROC_COST_01_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_02_NAME") && key.getPROC_COST_02_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_02_NAME", key.getPROC_COST_02_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_03_NAME") && key.getPROC_COST_03_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_03_NAME", key.getPROC_COST_03_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_04_NAME") && key.getPROC_COST_04_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_04_NAME", key.getPROC_COST_04_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_05_NAME") && key.getPROC_COST_05_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_05_NAME", key.getPROC_COST_05_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_06_NAME") && key.getPROC_COST_06_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_06_NAME", key.getPROC_COST_06_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_07_NAME") && key.getPROC_COST_07_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_07_NAME", key.getPROC_COST_07_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_08_NAME") && key.getPROC_COST_08_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_08_NAME", key.getPROC_COST_08_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_09_NAME") && key.getPROC_COST_09_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_09_NAME", key.getPROC_COST_09_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_10_NAME") && key.getPROC_COST_10_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_10_NAME", key.getPROC_COST_10_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_11_NAME") && key.getPROC_COST_11_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_11_NAME", key.getPROC_COST_11_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_12_NAME") && key.getPROC_COST_12_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_12_NAME", key.getPROC_COST_12_NAME());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_YEAR") && key.getCURRENT_YEAR() != null) {
					msgKey.setKeyValue("CURRENT_YEAR", key.getCURRENT_YEAR());
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
					DD0010010Struct key = new DD0010010Struct();
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name")) {
						key.setHALF_TERM_TYP_name(msgKey.getKeyValue("HALF_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val")) {
						key.setHALF_TERM_TYP_val(msgKey.getKeyValue("HALF_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("InitLevel")) {
						key.setInitLevel(msgKey.getKeyValue("InitLevel"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("h_MaxLevel")) {
						key.seth_MaxLevel(msgKey.getKeyValue("h_MaxLevel"));
					}
					if(msgKeyType.containsKeyColumn("h_ProcTyp")) {
						key.seth_ProcTyp(msgKey.getKeyValue("h_ProcTyp"));
					}
					if(msgKeyType.containsKeyColumn("DD0010010tree1")) {
						key.setDD0010010tree1(msgKey.getKeyValue("DD0010010tree1"));
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
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN")) {
						key.setHALF_TERM_TYP_DN(msgKey.getKeyValue("HALF_TERM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_DN")) {
						key.setCOST_TYP_DN(msgKey.getKeyValue("COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP_DN")) {
						key.setPROC_OUTSIDE_TYP_DN(msgKey.getKeyValue("PROC_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("t_YEAR")) {
						key.sett_YEAR(msgKey.getKeyValue("t_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("t_HALF_TERM_TYP")) {
						key.sett_HALF_TERM_TYP(msgKey.getKeyValue("t_HALF_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("t_PLANT_CD")) {
						key.sett_PLANT_CD(msgKey.getKeyValue("t_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_ROOT_ITEM_CD")) {
						key.sett_ROOT_ITEM_CD(msgKey.getKeyValue("t_ROOT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_PARENT_ITEM_CD")) {
						key.sett_PARENT_ITEM_CD(msgKey.getKeyValue("t_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_ITEM_CD")) {
						key.sett_ITEM_CD(msgKey.getKeyValue("t_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_ITEM_NAME")) {
						key.sett_ITEM_NAME(msgKey.getKeyValue("t_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("t_PS_EDITION")) {
						key.sett_PS_EDITION(msgKey.getKeyValue("t_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("t_COST_STATEMENT_NO")) {
						key.sett_COST_STATEMENT_NO(msgKey.getKeyValue("t_COST_STATEMENT_NO"));
					}
					if(msgKeyType.containsKeyColumn("t_EFF_PHASE_IN_DATE")) {
						key.sett_EFF_PHASE_IN_DATE(msgKey.getKeyValue("t_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("t_EFF_PHASE_OUT_DATE")) {
						key.sett_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("t_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("t_DMY_ITEM_FLG")) {
						key.sett_DMY_ITEM_FLG(msgKey.getKeyValue("t_DMY_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("t_COST_EXCLUDE_FLG")) {
						key.sett_COST_EXCLUDE_FLG(msgKey.getKeyValue("t_COST_EXCLUDE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("YEAR")) {
						key.setYEAR(msgKey.getKeyValue("YEAR"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP")) {
						key.setHALF_TERM_TYP(msgKey.getKeyValue("HALF_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD")) {
						key.setROOT_ITEM_CD(msgKey.getKeyValue("ROOT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("t_PARENT_COST_STATEMENT_NO")) {
						key.sett_PARENT_COST_STATEMENT_NO(msgKey.getKeyValue("t_PARENT_COST_STATEMENT_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_PARENT_ITEM_CD")) {
						key.setd_PARENT_ITEM_CD(msgKey.getKeyValue("d_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PARENT_ITEM_NAME")) {
						key.setd_PARENT_ITEM_NAME(msgKey.getKeyValue("d_PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_CD")) {
						key.setd_ITEM_CD(msgKey.getKeyValue("d_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_NAME")) {
						key.setd_ITEM_NAME(msgKey.getKeyValue("d_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_MRP_ODR_TYP_DN")) {
						key.setd_MRP_ODR_TYP_DN(msgKey.getKeyValue("d_MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("d_OUTSIDE_TYP_DN")) {
						key.setd_OUTSIDE_TYP_DN(msgKey.getKeyValue("d_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("d_PROC_OUTSIDE_TYP_DN")) {
						key.setd_PROC_OUTSIDE_TYP_DN(msgKey.getKeyValue("d_PROC_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("d_CLASIFICATION_CD")) {
						key.setd_CLASIFICATION_CD(msgKey.getKeyValue("d_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CS_PROC_CD")) {
						key.setd_CS_PROC_CD(msgKey.getKeyValue("d_CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CS_PROC_NAME")) {
						key.setd_CS_PROC_NAME(msgKey.getKeyValue("d_CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_PS_UNIT_QTY")) {
						key.setd_PS_UNIT_QTY(msgKey.getKeyValue("d_PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_NECESSARY_QTY")) {
						key.setd_NECESSARY_QTY(msgKey.getKeyValue("d_NECESSARY_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_STOCK_UNIT")) {
						key.setd_STOCK_UNIT(msgKey.getKeyValue("d_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("d_PS_INPUT_RATIO")) {
						key.setd_PS_INPUT_RATIO(msgKey.getKeyValue("d_PS_INPUT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_INPUT_RATIO")) {
						key.setd_ITEM_INPUT_RATIO(msgKey.getKeyValue("d_ITEM_INPUT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("d_TOTAL_COST")) {
						key.setd_TOTAL_COST(msgKey.getKeyValue("d_TOTAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_OWN_MATR_COST")) {
						key.setd_OWN_MATR_COST(msgKey.getKeyValue("d_OWN_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_TOTAL_MATR_COST")) {
						key.setd_TOTAL_MATR_COST(msgKey.getKeyValue("d_TOTAL_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_OWN_SBCNT_MATR_COST")) {
						key.setd_OWN_SBCNT_MATR_COST(msgKey.getKeyValue("d_OWN_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_TOTAL_SBCNT_MATR_COST")) {
						key.setd_TOTAL_SBCNT_MATR_COST(msgKey.getKeyValue("d_TOTAL_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_OWN_PROC_COST_SUM_ALL")) {
						key.setd_OWN_PROC_COST_SUM_ALL(msgKey.getKeyValue("d_OWN_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("d_TOTAL_PROC_COST_SUM_ALL")) {
						key.setd_TOTAL_PROC_COST_SUM_ALL(msgKey.getKeyValue("d_TOTAL_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("d_HOME_CUR_UNIT")) {
						key.setd_HOME_CUR_UNIT(msgKey.getKeyValue("d_HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("d_COST_UP_TYP_DN")) {
						key.setd_COST_UP_TYP_DN(msgKey.getKeyValue("d_COST_UP_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("d_VOLUNT_SPL_FLG_DN")) {
						key.setd_VOLUNT_SPL_FLG_DN(msgKey.getKeyValue("d_VOLUNT_SPL_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("d_ONEROUS_CONS_FLG_DN")) {
						key.setd_ONEROUS_CONS_FLG_DN(msgKey.getKeyValue("d_ONEROUS_CONS_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP")) {
						key.setCOST_TYP(msgKey.getKeyValue("COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ROOT_ITEM_NAME")) {
						key.setROOT_ITEM_NAME(msgKey.getKeyValue("ROOT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("COST_STATEMENT_NO")) {
						key.setCOST_STATEMENT_NO(msgKey.getKeyValue("COST_STATEMENT_NO"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_NAME")) {
						key.setCS_PROC_NAME(msgKey.getKeyValue("CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NECESSARY_QTY")) {
						key.setNECESSARY_QTY(msgKey.getKeyValue("NECESSARY_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PS_INPUT_RATIO")) {
						key.setPS_INPUT_RATIO(msgKey.getKeyValue("PS_INPUT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_INPUT_RATIO")) {
						key.setITEM_INPUT_RATIO(msgKey.getKeyValue("ITEM_INPUT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_COST")) {
						key.setTOTAL_COST(msgKey.getKeyValue("TOTAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OWN_MATR_COST")) {
						key.setOWN_MATR_COST(msgKey.getKeyValue("OWN_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_MATR_COST")) {
						key.setTOTAL_MATR_COST(msgKey.getKeyValue("TOTAL_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("OWN_SBCNT_MATR_COST")) {
						key.setOWN_SBCNT_MATR_COST(msgKey.getKeyValue("OWN_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_SBCNT_MATR_COST")) {
						key.setTOTAL_SBCNT_MATR_COST(msgKey.getKeyValue("TOTAL_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM_ALL")) {
						key.setOWN_PROC_COST_SUM_ALL(msgKey.getKeyValue("OWN_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM_ALL")) {
						key.setTOTAL_PROC_COST_SUM_ALL(msgKey.getKeyValue("TOTAL_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_COST_STATEMENT_NO")) {
						key.setPARENT_COST_STATEMENT_NO(msgKey.getKeyValue("PARENT_COST_STATEMENT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_STOCK_UNIT")) {
						key.setPARENT_ITEM_STOCK_UNIT(msgKey.getKeyValue("PARENT_ITEM_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP")) {
						key.setPROC_OUTSIDE_TYP(msgKey.getKeyValue("PROC_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD")) {
						key.setPROC_COST_CLS_CD(msgKey.getKeyValue("PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME")) {
						key.setPROC_COST_CLS_NAME(msgKey.getKeyValue("PROC_COST_CLS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY")) {
						key.setPROC_COST_UNIT_QTY(msgKey.getKeyValue("PROC_COST_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY_UNIT")) {
						key.setPROC_COST_UNIT_QTY_UNIT(msgKey.getKeyValue("PROC_COST_UNIT_QTY_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_01")) {
						key.setOWN_PROC_COST_01(msgKey.getKeyValue("OWN_PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_02")) {
						key.setOWN_PROC_COST_02(msgKey.getKeyValue("OWN_PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_03")) {
						key.setOWN_PROC_COST_03(msgKey.getKeyValue("OWN_PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_04")) {
						key.setOWN_PROC_COST_04(msgKey.getKeyValue("OWN_PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_05")) {
						key.setOWN_PROC_COST_05(msgKey.getKeyValue("OWN_PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_06")) {
						key.setOWN_PROC_COST_06(msgKey.getKeyValue("OWN_PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_07")) {
						key.setOWN_PROC_COST_07(msgKey.getKeyValue("OWN_PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_08")) {
						key.setOWN_PROC_COST_08(msgKey.getKeyValue("OWN_PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_09")) {
						key.setOWN_PROC_COST_09(msgKey.getKeyValue("OWN_PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_10")) {
						key.setOWN_PROC_COST_10(msgKey.getKeyValue("OWN_PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_11")) {
						key.setOWN_PROC_COST_11(msgKey.getKeyValue("OWN_PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_12")) {
						key.setOWN_PROC_COST_12(msgKey.getKeyValue("OWN_PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM")) {
						key.setOWN_PROC_COST_SUM(msgKey.getKeyValue("OWN_PROC_COST_SUM"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_01")) {
						key.setTOTAL_PROC_COST_01(msgKey.getKeyValue("TOTAL_PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_02")) {
						key.setTOTAL_PROC_COST_02(msgKey.getKeyValue("TOTAL_PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_03")) {
						key.setTOTAL_PROC_COST_03(msgKey.getKeyValue("TOTAL_PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_04")) {
						key.setTOTAL_PROC_COST_04(msgKey.getKeyValue("TOTAL_PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_05")) {
						key.setTOTAL_PROC_COST_05(msgKey.getKeyValue("TOTAL_PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_06")) {
						key.setTOTAL_PROC_COST_06(msgKey.getKeyValue("TOTAL_PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_07")) {
						key.setTOTAL_PROC_COST_07(msgKey.getKeyValue("TOTAL_PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_08")) {
						key.setTOTAL_PROC_COST_08(msgKey.getKeyValue("TOTAL_PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_09")) {
						key.setTOTAL_PROC_COST_09(msgKey.getKeyValue("TOTAL_PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_10")) {
						key.setTOTAL_PROC_COST_10(msgKey.getKeyValue("TOTAL_PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_11")) {
						key.setTOTAL_PROC_COST_11(msgKey.getKeyValue("TOTAL_PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_12")) {
						key.setTOTAL_PROC_COST_12(msgKey.getKeyValue("TOTAL_PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM")) {
						key.setTOTAL_PROC_COST_SUM(msgKey.getKeyValue("TOTAL_PROC_COST_SUM"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_01_NAME")) {
						key.setPROC_COST_01_NAME(msgKey.getKeyValue("PROC_COST_01_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_02_NAME")) {
						key.setPROC_COST_02_NAME(msgKey.getKeyValue("PROC_COST_02_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_03_NAME")) {
						key.setPROC_COST_03_NAME(msgKey.getKeyValue("PROC_COST_03_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_04_NAME")) {
						key.setPROC_COST_04_NAME(msgKey.getKeyValue("PROC_COST_04_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_05_NAME")) {
						key.setPROC_COST_05_NAME(msgKey.getKeyValue("PROC_COST_05_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_06_NAME")) {
						key.setPROC_COST_06_NAME(msgKey.getKeyValue("PROC_COST_06_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_07_NAME")) {
						key.setPROC_COST_07_NAME(msgKey.getKeyValue("PROC_COST_07_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_08_NAME")) {
						key.setPROC_COST_08_NAME(msgKey.getKeyValue("PROC_COST_08_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_09_NAME")) {
						key.setPROC_COST_09_NAME(msgKey.getKeyValue("PROC_COST_09_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_10_NAME")) {
						key.setPROC_COST_10_NAME(msgKey.getKeyValue("PROC_COST_10_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_11_NAME")) {
						key.setPROC_COST_11_NAME(msgKey.getKeyValue("PROC_COST_11_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_12_NAME")) {
						key.setPROC_COST_12_NAME(msgKey.getKeyValue("PROC_COST_12_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_YEAR")) {
						key.setCURRENT_YEAR(msgKey.getKeyValue("CURRENT_YEAR"));
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
