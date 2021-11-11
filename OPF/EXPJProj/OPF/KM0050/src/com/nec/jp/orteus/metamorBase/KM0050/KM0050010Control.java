/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0050/src/com/nec/jp/orteus/metamorBase/KM0050/KM0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0050;

import com.nec.jp.orteus.metamorBase.KM0050.*;
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
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
import java.math.BigDecimal;
import java.text.DecimalFormat;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0050010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 03:24:05 $
 *
 */
//}}user_implement_code_header

public class KM0050010Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

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
	// �f�t�H���g�A�N�Z�T���\�b�h
	protected List list;											// ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }						// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {										// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public KM0050010Struct getListvalue(int x) { return (KM0050010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KM0050010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KM0050010Struct createStruct() { return new KM0050010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KM0050010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** ��ʑJ�ڃL�[(�Č��ԍ�) */
	private String _ProjectCd = null;

	/**
	 * ��ʑJ�ڃL�[(�Č��ԍ�)�擾
	 * @return �Č��ԍ�
	 */
	public String getProjectCd() {
		return _ProjectCd;
	}
	
	/**
	 * ��ʑJ�ڃL�[(�Č��ԍ�)�ݒ�
	 * @param cd �Č��ԍ�
	 */
	public void setProjectCd(String cd) {
		_ProjectCd = cd;
	}
    
    /**
	 * �敪���擾
	 * 
	 * @param comboStruct
	 *            �敪��񃊃X�g
	 * @param strTyp
	 *            �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getComboTypeName(ComboStruct comboStruct, String strTyp) {
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (((String) (comboStruct.getValList().get(i))).equals(strTyp)) {
				strTypName = (String) (comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
	
	/**
	 * null�܂��͋󔒕����Ȃ��0�A����ȊO�͂��̂܂܂ɂ��܂��B
	 *
	 * @param String str
	 * @return String �ϊ��㕶����
	 */
	private String convertNull(String str){
		if (str == null || str.equals("")) {
			return "0";
		}
		return str;
	}
	
	/**
	 * ���z�̔䗦���v�Z����B
	 *
	 * @param String amount1
	 * @param String amount2
	 * @return String ���z�̔䗦
	 */
	private String calculateRate(String amount1, String amount2){
		if (Double.parseDouble(amount2) == 0) {
			return "0%";
		}
		String result = Calculate.divide(amount1, amount2, 2, Calculate.ROUND);
		String tmp = Calculate.multiply(result, "100");
		result = tmp.substring(0, tmp.length()-2) + "%";
		return result;
	}

	/**
     * �G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param param ���b�Z�[�W�p�����[�^
     */
    private void setErrorMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addError( emsg ); // �G���[���b�Z�[�W�Ƃ��ēo�^
        sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
    }
    /**
     * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     */
    private void setWarningMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
     msgStruct.addWarn(emsg);
     sysLog.info(emsg, sysUSER_CD);
    }

	/**
     * �Č��i���f�[�^���擾����
     * @return List �Č��i���f�[�^
	 * @throws SQLException 
	 * @throws FoundationException 
     */
    private List getAnkenData() throws FoundationException, SQLException {
    	List ankenData = new ArrayList();
		KM0050010Struct chkProjectStruct = null ;
		KM0050010Struct st = null ;
		
		// ���ϖ��׃f�[�^���擾����
		List lstDetailData = entity.mgetDetailData.read(conn, struct);
		
		// �f�[�^���Ȃ��ꍇ
		if (lstDetailData == null || lstDetailData.isEmpty()) {
			setErrorMessage("KM00010", null);
            return null;
        }
    	//[�Č�].�h�Č��X�e�[�^�X�h���A�󒍁A�����łȂ��ꍇ
    	chkProjectStruct = (KM0050010Struct) lstDetailData.get(0);
    	if(!"4".equals(chkProjectStruct.getPROJECT_STAT()) && !"9".equals(chkProjectStruct.getPROJECT_STAT())) {
			setErrorMessage("KM00011", null);
            return null;
    	}
		
    	for (int i = 0; i < lstDetailData.size(); i++) {
    		st = (KM0050010Struct) lstDetailData.get(i);
    		
			// �Č��ɕR�Â��󒍏��̑��݃`�F�b�N
    		if (st.getODR_NO() == null) {
				setErrorMessage("KM00007", null);
    			return null;
    		}
    	}
    	
    	struct.setESTIMATE_NO(chkProjectStruct.getESTIMATE_NO()); // ���ϔԍ�
    	struct.setPROJECT_NAME(chkProjectStruct.getPROJECT_NAME()); // �Č���
    	struct.setPJ_MODIFY_COUNT(chkProjectStruct.getPJ_MODIFY_COUNT()); // �Č��X�V��

		// �i���f�[�^���擾����
    	List lstProgressData = entity.mgetProgressData.read(conn, struct);
    	Map mapProgress = new HashMap(); // �i��Map�f�[�^
		// �f�[�^���擾�ł����ꍇ�AMap�f�[�^���쐬����
		if (lstProgressData != null) {
			for (int i = 0; i < lstProgressData.size(); i++) {
				st = (KM0050010Struct) lstProgressData.get(i);
				mapProgress.put(st.getDETAL_NO(), st);
			}
		}
		
		ankenData.add(lstDetailData); // ���ϖ��׃f�[�^
		ankenData.add(mapProgress); // �i���f�[�^
    	
    	return ankenData;
    }

	/**
     * �Č��i���f�[�^�̍��v���v�Z����
	 * @param stEs ���σf�[�^
	 * @param stCmp ���уf�[�^
	 * @param stExp �����f�[�^
	 * @param stDif2 ���كf�[�^ ���ρ[����
	 * @param stDif3 ���كf�[�^�@�����[����
     */
    private void sumAnkenData(KM0050010Struct stEs, KM0050010Struct stCmp, KM0050010Struct stExp, KM0050010Struct stDif2, KM0050010Struct stDif3) {

		// =======================================
		// �ڍ׉�ʍ��v�f�[�^�̌v�Z
		// =======================================
		struct.setODR_AMOUNT_W(Calculate.add(convertNull(struct.getODR_AMOUNT_W()), stEs.getODR_AMOUNT())); // �󒍋��z(����)�̍��v
		struct.setITEM_TOTAL_COST_W(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_W()), stEs.getITEM_TOTAL_COST())); // �\�Z���v(����)�̍��v
		struct.setITEM_TOTAL_COST_T(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_T()), stCmp.getITEM_TOTAL_COST())); // �\�Z���v(����)�̍��v
		struct.setITEM_TOTAL_COST_P(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_P()), stExp.getITEM_TOTAL_COST())); // �\�Z���v(����)�̍��v
		struct.setITEM_TOTAL_COST_D(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_D()), stDif2.getITEM_TOTAL_COST())); // �\�Z���v(����)�̍��v
		struct.setITEM_TOTAL_COST_D2(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_D2()), stDif3.getITEM_TOTAL_COST())); // �\�Z���v(����2)�̍��v
		struct.setMATERIAL_COST_W(Calculate.add(convertNull(struct.getMATERIAL_COST_W()), stEs.getES_COST_MATERIAL())); // �ޗ���(����)�̍��v
		struct.setMATERIAL_COST_T(Calculate.add(convertNull(struct.getMATERIAL_COST_T()), stCmp.getES_COST_MATERIAL())); // �ޗ���(����)�̍��v
		struct.setMATERIAL_COST_P(Calculate.add(convertNull(struct.getMATERIAL_COST_P()), stExp.getES_COST_MATERIAL())); // �ޗ���(����)�̍��v
		struct.setMATERIAL_COST_D(Calculate.add(convertNull(struct.getMATERIAL_COST_D()), stDif2.getES_COST_MATERIAL())); // �ޗ���(����)�̍��v
		struct.setMATERIAL_COST_D2(Calculate.add(convertNull(struct.getMATERIAL_COST_D2()), stDif3.getES_COST_MATERIAL())); // �ޗ���(����2)�̍��v
		struct.setPROCESSING_COST_W(Calculate.add(convertNull(struct.getPROCESSING_COST_W()), stEs.getES_COST_PROCESS())); // ���H��(����)�̍��v
		struct.setPROCESSING_COST_T(Calculate.add(convertNull(struct.getPROCESSING_COST_T()), stCmp.getES_COST_PROCESS())); // ���H��(����)�̍��v
		struct.setPROCESSING_COST_P(Calculate.add(convertNull(struct.getPROCESSING_COST_P()), stExp.getES_COST_PROCESS())); // ���H��(����)�̍��v
		struct.setPROCESSING_COST_D(Calculate.add(convertNull(struct.getPROCESSING_COST_D()), stDif2.getES_COST_PROCESS())); // ���H��(����)�̍��v
		struct.setPROCESSING_COST_D2(Calculate.add(convertNull(struct.getPROCESSING_COST_D2()), stDif3.getES_COST_PROCESS())); // ���H��(����2)�̍��v
		struct.setSBCNT_COST_W(Calculate.add(convertNull(struct.getSBCNT_COST_W()), stEs.getES_COST_OUTSOUCE())); // �O����(����)�̍��v
		struct.setSBCNT_COST_T(Calculate.add(convertNull(struct.getSBCNT_COST_T()), stCmp.getES_COST_OUTSOUCE())); // �O����(����)�̍��v
		struct.setSBCNT_COST_P(Calculate.add(convertNull(struct.getSBCNT_COST_P()), stExp.getES_COST_OUTSOUCE())); // �O����(����)�̍��v
		struct.setSBCNT_COST_D(Calculate.add(convertNull(struct.getSBCNT_COST_D()), stDif2.getES_COST_OUTSOUCE())); // �O����(����)�̍��v
		struct.setSBCNT_COST_D2(Calculate.add(convertNull(struct.getSBCNT_COST_D2()), stDif3.getES_COST_OUTSOUCE())); // �O����(����2)�̍��v
		struct.setOTHER_OVERHEADS_W(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_W()), stEs.getES_COST_ETC())); // ���̑��o��(����)�̍��v
		struct.setOTHER_OVERHEADS_T(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_T()), stCmp.getES_COST_ETC())); // ���̑��o��(����)�̍��v
		struct.setOTHER_OVERHEADS_P(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_P()), stExp.getES_COST_ETC())); // ���̑��o��(����)�̍��v
		struct.setOTHER_OVERHEADS_D(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_D()), stDif2.getES_COST_ETC())); // ���̑��o��(����)�̍��v
		struct.setOTHER_OVERHEADS_D2(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_D2()), stDif3.getES_COST_ETC())); // ���̑��o��(����2)�̍��v
		struct.setSERVICE_COST_W(Calculate.add(convertNull(struct.getSERVICE_COST_W()), stEs.getES_COST_SERVICE())); // �𖱔�(����)�̍��v
		struct.setSERVICE_COST_T(Calculate.add(convertNull(struct.getSERVICE_COST_T()), stCmp.getES_COST_SERVICE())); // �𖱔�(����)�̍��v
		struct.setSERVICE_COST_P(Calculate.add(convertNull(struct.getSERVICE_COST_P()), stExp.getES_COST_SERVICE())); // �𖱔�(����)�̍��v
		struct.setSERVICE_COST_D(Calculate.add(convertNull(struct.getSERVICE_COST_D()), stDif2.getES_COST_SERVICE())); // �𖱔�(����)�̍��v
		struct.setSERVICE_COST_D2(Calculate.add(convertNull(struct.getSERVICE_COST_D2()), stDif3.getES_COST_SERVICE())); // �𖱔�(����2)�̍��v
		struct.setPROFIT_RATIO_W(calculateRate(Calculate.subtract(
				struct.getODR_AMOUNT_W(), struct.getITEM_TOTAL_COST_W()), struct.getODR_AMOUNT_W())); // ���v��(����)�̍��v
		struct.setPROFIT_RATIO_P(calculateRate(Calculate.subtract(
				struct.getODR_AMOUNT_W(), struct.getITEM_TOTAL_COST_P()), struct.getODR_AMOUNT_W())); // ���v��(����)�̍��v
    }

	/**
     * ���z�̍��v���v�Z����
	 * @param arrAmount �v�Z�p���z
     * @return String ���z�̍��v
     */
    private String sumAmount(String[] arrAmount) {
    	String totalCost = "0";
		// ���z���v���v�Z����
    	for (int i = 0; i < arrAmount.length; i++) {
			totalCost = Calculate.add(totalCost, convertNull(arrAmount[i]));
    	}
		return totalCost;
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���v�\���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlTotalShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlTotalShow");
			//{{user_implement_dev:<controlTotalShow>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlTotalShow>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlTotalShow");

		return;
	}

	/**
	 * �Čv�Z�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRecalculation() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRecalculation");
			//{{user_implement_dev:<controlRecalculation>
		try {
			KM0050010Struct st = new KM0050010Struct();
			List lstBatParm = entity.mSYS_BAT_PARM.read(conn, st);
			if (lstBatParm == null || lstBatParm.isEmpty()) {
				setErrorMessage("ZZ09007", null);
			} else {
				
				// ���ϖ��׃f�[�^���擾����
				List lstDetailData = entity.mgetDetailData.read(conn, struct);
				KM0050010Struct stParm = (KM0050010Struct) lstBatParm.get(0);
				List lstRlt = null;
				
				if (lstDetailData != null && lstDetailData.size() > 0) {
					boolean isThereError = false;
			    	for (int i = 0; i < lstDetailData.size(); i++) {
			    		st = (KM0050010Struct) lstDetailData.get(i);

						st.setpvc2LogMode(stParm.getLOG_MODE_TYP()); // �k�n�f���[�h
						st.setpvc2OutputMode(stParm.getOUTPUT_MODE_TYP()); // �o�̓��[�h
						st.setpvc2OutputPath(stParm.getFILE_PATH()); // �o�̓t�@�C���p�X
						st.setpvc2OutputName(stParm.getFILE_NAME()); // �o�̓t�@�C����
						st.setpvc2UserId(this.getsysUSER_CD()); // ���[�U�h�c
						st.setpvc2BusinessName(this.getScreenId()); // �Ɩ���
						st.setpvc2PlantCd(this.getsysPLANT_CD()); // �H��R�[�h
						st.setpnumFlag("0");//�����t���O(�ʎ��s)
						st.setpvc2OdrNo(st.getODR_NO()); // �󒍔ԍ�
						st.setpvc2PProjectCd(struct.getPROJECT_CD()); // �Č��ԍ�
						st.setpnumEstimateNo(st.getESTIMATE_NO()); // ���ϔԍ�
						st.setpnumDetalNo(st.getDETAL_NO()); // ���הԍ�
						
						// �Č��\�Z�Ϗ���s��
						lstRlt = entity.mSQLPjBudgetCostMake.call(conn, st);
						if(!lstRlt.isEmpty()){
							if("3".equals(((KM0050010Struct)lstRlt.get(0)).getpnumReturn())){
								setErrorMessage("KM00046", st.getDETAL_NO());
								return;
							}
							else if("2".equals(((KM0050010Struct)lstRlt.get(0)).getpnumReturn())){
								setWarningMessage("KM00046", st.getDETAL_NO());
								isThereError = true;
							}
							
						}
						if (!isThereError) {
							st.setPROJECT_CD(struct.getPROJECT_CD()); // �Č��ԍ�
							st.setESTIMATE_NO(st.getESTIMATE_NO()); // ���ϔԍ�
							st.setDETAL_NO(st.getDETAL_NO()); // ���הԍ�
							
							// ���ϖ��ׂ́g�\�Z�Ϗ㊮���t���O�h�̎擾���s��
							lstRlt = entity.mT_ESTIMATE_DETAL.read(conn, st);
							if (lstRlt == null || !"1".equals(((KM0050010Struct)lstRlt.get(0)).getOD_COMP_FLG())) {
								isThereError = true;
							}
						}
			    	}
			    	if (!isThereError) {
			    		lstRlt = entity.mT_PROJECT.read(conn, st);
			    		// �r���`�F�b�N
			    		if (struct.getPJ_MODIFY_COUNT().equals(((KM0050010Struct)lstRlt.get(0)).getMODIFY_COUNT())) {
			    			st.setOD_COMP_FLG("1");
			    			st.setsUser_ID(struct.getsUser_ID());
			    			entity.mT_PROJECT.update(conn, st);
			    		} else {
			    			setErrorMessage("ZZ01105", null);
			    		}
			    	}
		        }
			}
			
			// �Č��i�������ēǍ�����
			controlSelect();
			
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlRecalculation>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRecalculation");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
			DecimalFormat df = new DecimalFormat();
			String styleOne = "#,###.00";
			String styleTwo = "#,###.0";
			
        	// �Č��i���f�[�^���擾����
        	List ankenData = this.getAnkenData();
        	if (ankenData == null) {
	            setReadStatus(NOT_FOUND);
                return;
        	}
			// ���ϖ��׃f�[�^���擾����
			List lstDetailData = (List) ankenData.get(0);
			// �i���f�[�^���擾����
			Map mapProgress = (Map) ankenData.get(1);
			List lstDetail = new ArrayList(); // �ꗗ���׃f�[�^
			KM0050010Struct st = null ;         // ���׃f�[�^�i�[�p
			KM0050010Struct stEs = null ;       // ���σf�[�^�i�[�p
			KM0050010Struct stCmp = null ;      // ���уf�[�^�i�[�p
			KM0050010Struct stExp = null ;      // �����f�[�^�i�[�p
			KM0050010Struct stDif = null ;      // ���كf�[�^�i�[�p
			KM0050010Struct stDif2 = null ;      // ����2�f�[�^�i�[�p
			KM0050010Struct stDif3 = null ;      // ����3�f�[�^�i�[�p
			KM0050010Struct stProgress = null ; // �i���f�[�^�i�[�p
			String strCalculateDate = "";       //�W�v����
			if((KM0050010Struct)mapProgress.get("1") != null){
				strCalculateDate = ((KM0050010Struct)mapProgress.get("1")).getTOTAL_DATE();
			}
            // �����ꍀ�ڎ擾�Ή�
	        String locale = CoreTools.getLocale(sysUSER_CD);
	        String property = "OrteusUserDic";
	        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
			
            // �R���{�{�b�N�X�f�[�^�p��
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            ComboStruct stestimateTyp = controller.getData("ESTIMATE_TYPE"); // ��z�i�ڎ�
            ComboStruct stCostProgressTyp = controller.getData("COST_PROGRESS"); // ��p�i��
			
			// �ꗗ�f�[�^�̍쐬
        	for (int i = 0; i < lstDetailData.size(); i++) {
        		st = (KM0050010Struct) lstDetailData.get(i);
        		
        		// ���הԍ��ɑ΂���i���f�[�^���擾����
        		stProgress = (KM0050010Struct)mapProgress.get(st.getDETAL_NO());
        		if (stProgress == null) {
        			stProgress = new KM0050010Struct();
        			stProgress.setCOST_PROGRESS("0");//�v����Z�b�g����
        		}
    			// =======================================
    			// ���σf�[�^�̍쐬
    			// =======================================
        		stEs = new KM0050010Struct();
        		stEs.setTYP(CoreTools.getRBString("Expj.Cmt6687",resource)); // �敪
        		stEs.setTYP_NUM("1"); // �敪�ԍ�
        		stEs.setTOTAL_DATE(st.getTOTAL_DATE()); // �W�v����(CSV�o�͗p)
        		stEs.setDETAL_NO(st.getDETAL_NO()); // ���הԍ�
        		stEs.setESTIMATE_TYPE(getComboTypeName(stestimateTyp, st.getESTIMATE_TYPE())); // ��z�i�ڎ�
        		stEs.setCUST_ITEM_CD(st.getCUST_ITEM_CD()); // ���Ӑ�i�ڔԍ�
        		stEs.setITEM_NAME(st.getITEM_NAME()); // �i�ږ�
        		stEs.setODR_AMOUNT(convertNull(st.getODR_AMOUNT())); // �󒍋��z
    			df.applyPattern(styleOne);
        		stEs.setl_ODR_AMOUNT(df.format(Double.parseDouble(convertNull(st.getODR_AMOUNT()))));// �󒍋��z(�\���p)
        		
        		stEs.setPROGRESS(getComboTypeName(stCostProgressTyp, stProgress.getCOST_PROGRESS())); // �i��
        		stEs.seth_COST_PROGRESS(stProgress.getCOST_PROGRESS());// �i��(Hidden)
    			// ��z�i�ڎ킪���i�̏ꍇ
        		if ("1".equals(st.getESTIMATE_TYPE())) {
        			stEs.setES_COST_MATERIAL(convertNull(st.getES_COST_MATERIAL())); // �ޗ���
        			stEs.setES_COST_PROCESS(convertNull(st.getES_COST_PROCESS())); // ���H��
        			stEs.setES_COST_OUTSOUCE(convertNull(st.getES_COST_OUTSOUCE())); // �O����
            		stEs.setUNIT_CD(st.getUNIT_CD()); // �P��
        		} else {
        			stEs.setES_COST_MATERIAL("0"); // �ޗ���
        			stEs.setES_COST_PROCESS("0"); // ���H��
        			stEs.setES_COST_OUTSOUCE("0"); // �O����
        		}
        		stEs.setES_COST_ETC(convertNull(st.getES_COST_ETC())); // ���̑��o��
    			// ��z�i�ڎ킪�𖱂̏ꍇ
        		if ("2".equals(st.getESTIMATE_TYPE())) {
        			stEs.setES_COST_SERVICE(convertNull(st.getES_COST_SERVICE())); // �𖱔�
        		} else {
        			stEs.setES_COST_SERVICE("0"); // �𖱔�
        		}
        		// �\�Z���v���v�Z����(�ޗ���{���H��{�O����{���̑��o��{�𖱔�)
        		stEs.setITEM_TOTAL_COST(sumAmount(new String[]{stEs.getES_COST_MATERIAL(),
        				stEs.getES_COST_PROCESS(),
        				stEs.getES_COST_OUTSOUCE(),
        				stEs.getES_COST_ETC(),
        				stEs.getES_COST_SERVICE()})); // �\�Z���v
        		
         		stEs.setODR_UNIT_PRICE(convertNull(st.getODR_UNIT_PRICE())); // �󒍒P��
        		stEs.setl_ODR_UNIT_PRICE(df.format(Double.parseDouble(convertNull(st.getODR_UNIT_PRICE()))));// �󒍒P��(�\���p)
        		df.applyPattern(styleTwo);
        		stEs.setODR_QTY(convertNull(st.getODR_QTY())); // ����
        		stEs.setl_ODR_QTY(df.format(Double.parseDouble(convertNull(st.getODR_QTY())))); // ����(�\���p)
        		
        		stEs.setDESINATED_DLV_DATE(st.getDESINATED_DLV_DATE()); // �w��[��
        		stEs.setl_JOB_ODR_CD(st.getl_JOB_ODR_CD());//����
        		stEs.setl_JOB_ODR_CANCEL_NO(st.getl_JOB_ODR_CANCEL_NO());//���Ԏ�������ԍ�
        		stEs.setl_PLANT_CD(st.getl_PLANT_CD());//�H��R�[�h
        		stEs.setPROFIT_RATIO(calculateRate(Calculate.subtract(
        				stEs.getODR_AMOUNT(), stEs.getITEM_TOTAL_COST()), stEs.getODR_AMOUNT())); // ���v��
        		stEs.setPROFIT_RATIO(calculateRate(Calculate.subtract(
        				st.getODR_AMOUNT(), stEs.getITEM_TOTAL_COST()), st.getODR_AMOUNT())); // ���v��
        		
        		// ���σf�[�^���i�[����
        		lstDetail.add(stEs);
        		
    			// =======================================
    			// ���уf�[�^�̍쐬
    			// =======================================
        		stCmp = new KM0050010Struct();
        		stCmp.setTYP(CoreTools.getRBString("Expj.Cmt0725",resource)); // �敪
        		stCmp.setTYP_NUM("2"); // �敪�ԍ�
    			// ��z�i�ڎ킪���i�̏ꍇ
        		if ("1".equals(st.getESTIMATE_TYPE())) {
        			stCmp.setES_COST_MATERIAL(convertNull(stProgress.getCMP_COST_MATERIAL())); // �ޗ���
        			stCmp.setES_COST_PROCESS(convertNull(stProgress.getCMP_COST_PROCESS())); // ���H��
        			stCmp.setES_COST_OUTSOUCE(convertNull(stProgress.getCMP_COST_OUTSOUCE())); // �O����
        		} else {
        			stCmp.setES_COST_MATERIAL("0"); // �ޗ���
        			stCmp.setES_COST_PROCESS("0"); // ���H��
        			stCmp.setES_COST_OUTSOUCE("0"); // �O����
        		}
        		stCmp.setES_COST_ETC(convertNull(st.getCMP_COST_ETC())); // ���̑��o��
    			// ��z�i�ڎ킪�𖱂̏ꍇ
        		if ("2".equals(st.getESTIMATE_TYPE())) {
        			stCmp.setES_COST_SERVICE(convertNull(stProgress.getCMP_COST_SERVICE())); // �𖱔�
        		} else {
        			stCmp.setES_COST_SERVICE("0"); // �𖱔�
        		}
        		// �\�Z���v���v�Z����(�ޗ���{���H��{�O����{���̑��o��{�𖱔�)
        		stCmp.setITEM_TOTAL_COST(sumAmount(new String[]{stCmp.getES_COST_MATERIAL(),
        				stCmp.getES_COST_PROCESS(),
        				stCmp.getES_COST_OUTSOUCE(),
        				stCmp.getES_COST_ETC(),
        				stCmp.getES_COST_SERVICE()})); // �\�Z���v
        		stCmp.setMODIFY_COUNT(st.getMODIFY_COUNT()); // �X�V��
        		stCmp.setESTIMATE_NO(st.getESTIMATE_NO()); // ���ϔԍ�
        		stCmp.seth_DETAL_NO(st.getDETAL_NO()); // ���הԍ�
        		stCmp.seth_ES_COST_ETC(convertNull(st.getCMP_COST_ETC())); // ���̑��o��
        		
        		// ���уf�[�^���i�[����
        		lstDetail.add(stCmp);
        		
    			// =======================================
    			// �����f�[�^�̍쐬
    			// =======================================
        		stExp = new KM0050010Struct();
        		stExp.setTYP(CoreTools.getRBString("Expj.Prospects",resource)); // �敪
        		stExp.setTYP_NUM("3"); // �敪�ԍ�
    			// ��z�i�ڎ킪���i�̏ꍇ
        		if ("1".equals(st.getESTIMATE_TYPE())) {
        			stExp.setES_COST_MATERIAL(convertNull(stProgress.getEXP_COST_MATERIAL())); // �ޗ���
        			stExp.setES_COST_PROCESS(convertNull(stProgress.getEXP_COST_PROCESS())); // ���H��
        			stExp.setES_COST_OUTSOUCE(convertNull(stProgress.getEXP_COST_OUTSOUCE())); // �O����
        		} else {
        			stExp.setES_COST_MATERIAL("0"); // �ޗ���
        			stExp.setES_COST_PROCESS("0"); // ���H��
        			stExp.setES_COST_OUTSOUCE("0"); // �O����
        		}
        		// ���т�0�̏ꍇ�́A���ς̋��z�A���т�0�łȂ��ꍇ�͎��эs�̋��z��\������B
        		if (Double.parseDouble(stCmp.getES_COST_ETC()) == 0) {
        			stExp.setES_COST_ETC(stEs.getES_COST_ETC()); // ���̑��o��
        		} else {
        			stExp.setES_COST_ETC(stCmp.getES_COST_ETC()); // ���̑��o��
        		}
    			// ��z�i�ڎ킪�𖱂̏ꍇ
        		if ("2".equals(st.getESTIMATE_TYPE())) {
        			// ���т�0�̏ꍇ�́A���ς̋��z�A���т�0�łȂ��ꍇ�͎��т̋��z��\������B
            		if (Double.parseDouble(stCmp.getES_COST_SERVICE()) == 0) {
            			stExp.setES_COST_SERVICE(stEs.getES_COST_SERVICE()); // ���̑��o��
            		} else {
            			stExp.setES_COST_SERVICE(stCmp.getES_COST_SERVICE()); // ���̑��o��
            		}
        		} else {
        			stExp.setES_COST_SERVICE("0"); // �𖱔�
        		}
        		// �\�Z���v���v�Z����(�ޗ���{���H��{�O����{���̑��o��{�𖱔�)
        		stExp.setITEM_TOTAL_COST(sumAmount(new String[]{stExp.getES_COST_MATERIAL(),
        				stExp.getES_COST_PROCESS(),
        				stExp.getES_COST_OUTSOUCE(),
        				stExp.getES_COST_ETC(),
        				stExp.getES_COST_SERVICE()})); // �\�Z���v
        		stExp.setPROFIT_RATIO(calculateRate(Calculate.subtract(
        				stEs.getODR_AMOUNT(), stExp.getITEM_TOTAL_COST()), stEs.getODR_AMOUNT())); // ���v��
        		
        		// �����f�[�^���i�[����
        		lstDetail.add(stExp);
        		
    			// =======================================
    			// ���كf�[�^�̍쐬 ���ρ|����
    			// =======================================
        		stDif = new KM0050010Struct();
        		stDif.setTYP(CoreTools.getRBString("Expj.Cmt5883",resource)); // �敪
        		stDif.setTYP_NUM("4"); // �敪�ԍ�
        		stDif.setES_COST_MATERIAL(Calculate.subtract(stEs.getES_COST_MATERIAL(), stExp.getES_COST_MATERIAL())); // �ޗ���
        		stDif.setES_COST_PROCESS(Calculate.subtract(stEs.getES_COST_PROCESS(), stExp.getES_COST_PROCESS())); // ���H��
        		stDif.setES_COST_OUTSOUCE(Calculate.subtract(stEs.getES_COST_OUTSOUCE(), stExp.getES_COST_OUTSOUCE())); // �O����
        		stDif.setES_COST_ETC(Calculate.subtract(stEs.getES_COST_ETC(), stExp.getES_COST_ETC())); // ���̑��o��
        		stDif.setES_COST_SERVICE(Calculate.subtract(stEs.getES_COST_SERVICE(), stExp.getES_COST_SERVICE())); // �𖱔�
        		stDif.setITEM_TOTAL_COST(Calculate.subtract(stEs.getITEM_TOTAL_COST(), stExp.getITEM_TOTAL_COST())); // �\�Z���v
        		stDif.setPROFIT_RATIO(" ");
        		
        		// ���كf�[�^���i�[����
        		lstDetail.add(stDif);

    			// =======================================
    			// ���كf�[�^�̍쐬2 ����-����
    			// =======================================
        		stDif2 = new KM0050010Struct();
        		stDif2.setES_COST_MATERIAL(Calculate.subtract(stEs.getES_COST_MATERIAL(), stCmp.getES_COST_MATERIAL())); // �ޗ���
        		stDif2.setES_COST_PROCESS(Calculate.subtract(stEs.getES_COST_PROCESS(), stCmp.getES_COST_PROCESS())); // ���H��
        		stDif2.setES_COST_OUTSOUCE(Calculate.subtract(stEs.getES_COST_OUTSOUCE(), stCmp.getES_COST_OUTSOUCE())); // �O����
        		stDif2.setES_COST_ETC(Calculate.subtract(stEs.getES_COST_ETC(), stCmp.getES_COST_ETC())); // ���̑��o��
        		stDif2.setES_COST_SERVICE(Calculate.subtract(stEs.getES_COST_SERVICE(), stCmp.getES_COST_SERVICE())); // �𖱔�
        		stDif2.setITEM_TOTAL_COST(Calculate.subtract(stEs.getITEM_TOTAL_COST(), stCmp.getITEM_TOTAL_COST())); // �\�Z���v
        		
    			// =======================================
    			// ���كf�[�^�̍쐬3 ����-����
    			// =======================================
        		stDif3 = new KM0050010Struct();
        		stDif3.setES_COST_MATERIAL(Calculate.subtract(stExp.getES_COST_MATERIAL(), stCmp.getES_COST_MATERIAL())); // �ޗ���
        		stDif3.setES_COST_PROCESS(Calculate.subtract(stExp.getES_COST_PROCESS(), stCmp.getES_COST_PROCESS())); // ���H��
        		stDif3.setES_COST_OUTSOUCE(Calculate.subtract(stExp.getES_COST_OUTSOUCE(), stCmp.getES_COST_OUTSOUCE())); // �O����
        		stDif3.setES_COST_ETC(Calculate.subtract(stExp.getES_COST_ETC(), stCmp.getES_COST_ETC())); // ���̑��o��
        		stDif3.setES_COST_SERVICE(Calculate.subtract(stExp.getES_COST_SERVICE(), stCmp.getES_COST_SERVICE())); // �𖱔�
        		stDif3.setITEM_TOTAL_COST(Calculate.subtract(stExp.getITEM_TOTAL_COST(), stCmp.getITEM_TOTAL_COST())); // �\�Z���v

        		// ���v�f�[�^���v�Z����
        		sumAnkenData(stEs, stCmp, stExp, stDif2, stDif3);
        	}
    		
        	struct.setCALCULATION_DATE(strCalculateDate); // �W�v����
            setReadStatus(NORMAL);
			this.setList(lstDetail);
			
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * ���̑��o��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlOtherRegister() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlOtherRegister");
			//{{user_implement_dev:<controlOtherRegister>
		try {

            // ��ʓ��͍��ڂ��擾
			List lstTypNum = struct.getList_TYP_NUM(); // ���R�[�h�敪
			List lstDetalNo = struct.getList_h_DETAL_NO(); // ���הԍ�
			List lstHEsCostEtc = struct.getList_h_ES_COST_ETC(); // ���̑��o��(�ޔ�)
			List lstEsCostEtc = struct.getList_ES_COST_ETC(); // ���̑��o��
			List lstModifyCount = struct.getList_MODIFY_COUNT(); // �X�V��
			KM0050010Struct st = null;
			struct.setsUser_ID(this.getsysUSER_CD()); // ���[�U�R�[�h
			String strNewCostEtc = null;

			List lstTEstimateDetal = null;
			for (int i = 0; i < lstTypNum.size(); i++) {
				strNewCostEtc = convertNull((String)lstEsCostEtc.get(i)); // ���̑��o��
				// ���уf�[�^�A���A���͒l���ς��ꍇ
				if ("2".equals((String)lstTypNum.get(i))
						&& Double.parseDouble(strNewCostEtc)
						!= Double.parseDouble((String)lstHEsCostEtc.get(i))) {
					
					struct.setDETAL_NO((String)lstDetalNo.get(i)); // ���הԍ�
					// �X�V���̎擾
					lstTEstimateDetal = entity.mT_ESTIMATE_DETAL.read(conn, struct);
					if (lstTEstimateDetal == null || lstTEstimateDetal.size() == 0
							|| lstTEstimateDetal.size() == 1
							&& new BigDecimal(((KM0050010Struct)lstTEstimateDetal.get(0)).getMODIFY_COUNT()).compareTo(
									new BigDecimal((String)lstModifyCount.get(i))) != 0) {
						// [���ϖ���].�h�X�V���h ���Ǎ����ƈقȂ�ꍇ�A�G���[
						setErrorMessage("ZZ01105", null);
						conn.rollback();
						return;
					}
					struct.setCMP_COST_ETC(strNewCostEtc); // ���̑��o��
					entity.mT_ESTIMATE_DETAL.update(conn, struct);
				}
			}
			conn.commit();
			controlSelect();
			
		} catch(SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			conn.rollback();
			throw ee;
		}
                //}}user_implement_dev:<controlOtherRegister>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlOtherRegister");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
		try {

        	// �Č��i���f�[�^���擾����
			controlSelect();

			// CSV���̍쐬
			List csvList = new ArrayList();
			String[] title = {
				"Expj.PROJECT_CD",               // �Č��ԍ�
				"Expj.PROJECT_NAME",             // �Č���
				"Expj.TOTAL_DATE",               // �W�v����
				"Expj.DETAIL_NO",                // ���הԍ�
				"Expj.ARRANGE_ITEMS_SPECIES",    // ��z�i�ڎ�
				"Expj.CUST_ITEM_CD",             // ���Ӑ�i�ڔԍ�
				"Expj.ITEM_NAME",                // �i�ږ�
				"Expj.ODR_AMOUNT",               // �󒍋��z
				"Expj.PROGRESS",                 // �i��
				"Expj.6694",                     // ���ϗ��v��
				"Expj.6695",                     // ���ϗ\�Z���v
				"Expj.ES_COST_MATERIAL",         // ���ϗ\�Z �ޗ���
				"Expj.ES_COST_PROCESS",          // ���ϗ\�Z ���H��
				"Expj.ES_COST_OUTSOUCE",         // ���ϗ\�Z �O����
				"Expj.ES_COST_ETC",              // ���ϗ\�Z ���̑��o��
				"Expj.ES_COST_SERVICE",          // ���ϗ\�Z �𖱔�
				"Expj.6697",                     // �������э��v
				"Expj.CMP_COST_MATERIAL",        // �������с@�ޗ���
				"Expj.CMP_COST_PROCESS",         // �������с@���H��
				"Expj.CMP_COST_OUTSOUCE",        // �������с@�O����
				"Expj.CMP_COST_REAL_ETC",        // �������с@���̑��o��
				"Expj.CMP_COST_SERVICE",         // �������с@�𖱔�
				"Expj.6698",                     // �������v��
				"Expj.6699",                     // �����������v
				"Expj.EXP_COST_MATERIAL",        // ���������@�ޗ���
				"Expj.EXP_COST_PROCESS",         // ���������@���H��
				"Expj.EXP_COST_OUTSOUCE",        // ���������@�O����
				"Expj.CMP_COST_ESTM_ETC",        // ���������@���̑��o��
				"Expj.EXP_COST_SERVICE",         // ���������@�𖱔�
				"Expj.6701",                     // ���ٗ\�Z���v
				"Expj.DIF_COST_MATERIAL",        // ���ٍޗ���
				"Expj.DIF_COST_PROCESS",         // ���ى��H��
				"Expj.DIF_COST_OUTSOUCE",        // ���يO����
				"Expj.CMP_COST_ETC",             // ���ق��̑��o��
				"Expj.DIF_COST_SERVICE",         // ���ٖ𖱔�
				"Expj.QTY",                      // ����
				"Expj.PUCH_ODR_UNIT",            // �P��
				"Expj.ODR_UNIT_PRICE",           // �󒍒P��
				"Expj.DESINATED_DLV_DATE",       // �w��[��
				"Expj.JOB_ODR_CD",               // ����
			};
			csvList.add(title);
			
			String[] csvStr = null;
			int intRecordCnt = this.getListsize() / 4;
			int intRow = 0;
			KM0050010Struct stEs = null ;       // ���σf�[�^�i�[�p
			KM0050010Struct stCmp = null ;      // ���уf�[�^�i�[�p
			KM0050010Struct stExp = null ;      // �����f�[�^�i�[�p
			KM0050010Struct stDif = null ;      // ���كf�[�^�i�[�p
			for (int i = 0; i < intRecordCnt; i++) {
				intRow = i * 4;
				stEs = (KM0050010Struct) this.getList().get(intRow + 0);
				stCmp = (KM0050010Struct) this.getList().get(intRow + 1);
				stExp = (KM0050010Struct) this.getList().get(intRow + 2);
				stDif = (KM0050010Struct) this.getList().get(intRow + 3);
        		
        		int arrIdx = 0; // ��̔ԍ�
				csvStr = new String[title.length];
				csvStr[arrIdx++] = struct.getPROJECT_CD(); // �Č��ԍ�
				csvStr[arrIdx++] = struct.getPROJECT_NAME(); // �Č���
				csvStr[arrIdx++] = struct.getCALCULATION_DATE(); // �W�v����
				csvStr[arrIdx++] = stEs.getDETAL_NO(); // ���הԍ�
				csvStr[arrIdx++] = stEs.getESTIMATE_TYPE(); // ��z�i�ڎ�
				csvStr[arrIdx++] = stEs.getCUST_ITEM_CD(); // ���Ӑ�i�ڔԍ�
				csvStr[arrIdx++] = stEs.getITEM_NAME(); // �i�ږ�
				csvStr[arrIdx++] = stEs.getODR_AMOUNT(); // �󒍋��z
				csvStr[arrIdx++] = stEs.getPROGRESS(); // �i��
				csvStr[arrIdx++] = stEs.getPROFIT_RATIO(); // ���ϗ��v��
				csvStr[arrIdx++] = stEs.getITEM_TOTAL_COST(); // ���ϗ\�Z���v(Modify)
				csvStr[arrIdx++] = stEs.getES_COST_MATERIAL(); // ���ϗ\�Z �ޗ���
				csvStr[arrIdx++] = stEs.getES_COST_PROCESS(); // ���ϗ\�Z ���H��
				csvStr[arrIdx++] = stEs.getES_COST_OUTSOUCE(); // ���ϗ\�Z �O����
				csvStr[arrIdx++] = stEs.getES_COST_ETC(); // ���ϗ\�Z ���̑��o��
				csvStr[arrIdx++] = stEs.getES_COST_SERVICE(); // ���ϗ\�Z �𖱔�(Modify)
				csvStr[arrIdx++] = stCmp.getITEM_TOTAL_COST(); // �������э��v(Modify)
				csvStr[arrIdx++] = stCmp.getES_COST_MATERIAL(); // �������с@�ޗ���
				csvStr[arrIdx++] = stCmp.getES_COST_PROCESS(); // �������с@���H��
				csvStr[arrIdx++] = stCmp.getES_COST_OUTSOUCE(); // �������с@�O����
				csvStr[arrIdx++] = stCmp.getES_COST_ETC(); // �������с@���̑��o��
				csvStr[arrIdx++] = stCmp.getES_COST_SERVICE(); // �������с@�𖱔�(Modify)
				csvStr[arrIdx++] = stExp.getPROFIT_RATIO(); // �������v��
				csvStr[arrIdx++] = stExp.getITEM_TOTAL_COST(); // �����������v
				csvStr[arrIdx++] = stExp.getES_COST_MATERIAL(); // ���������@�ޗ���
				csvStr[arrIdx++] = stExp.getES_COST_PROCESS(); // ���������@���H��
				csvStr[arrIdx++] = stExp.getES_COST_OUTSOUCE(); // ���������@�O����
				csvStr[arrIdx++] = stExp.getES_COST_ETC(); // ���������@���̑��o��
				csvStr[arrIdx++] = stExp.getES_COST_SERVICE(); // ���������@�𖱔�(Modify)
				csvStr[arrIdx++] = stDif.getITEM_TOTAL_COST(); // ���ٗ\�Z���v
				csvStr[arrIdx++] = stDif.getES_COST_MATERIAL(); // ���ٍޗ���
				csvStr[arrIdx++] = stDif.getES_COST_PROCESS(); // ���ى��H��
				csvStr[arrIdx++] = stDif.getES_COST_OUTSOUCE(); // ���يO����
				csvStr[arrIdx++] = stDif.getES_COST_ETC(); // ���ق��̑��o��
				csvStr[arrIdx++] = stDif.getES_COST_SERVICE(); // ���ٖ𖱔�
				csvStr[arrIdx++] = stEs.getODR_QTY(); // ����
            	csvStr[arrIdx++] = stEs.getUNIT_CD(); // �P��
				csvStr[arrIdx++] = stEs.getODR_UNIT_PRICE(); // �󒍒P��
				csvStr[arrIdx++] = stEs.getDESINATED_DLV_DATE(); // �w��[��
				csvStr[arrIdx++] = stEs.getl_JOB_ODR_CD();       // ����
				csvList.add(csvStr);
			}

			if (csvList != null && !csvList.isEmpty()) {
				// CsvWriter�𐶐�
				csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			struct.initialize();
			if(list != null)
			{
				list.clear();
			}
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���ԕʐi���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlJobOdrProgress() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgress");
			//{{user_implement_dev:<controlJobOdrProgress>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			int nRet = 0;
			nRet = entity.mUpdate.update(conn, struct);
			nRet = entity.mT_ESTIMATE_DETAL.update(conn, struct);
			nRet = entity.mT_PROJECT.update(conn, struct);
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlJobOdrProgress>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgress");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
*/
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				struct.setPROJECT_CD(this.getProjectCd());
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
				controlSelect();
			}

/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("TotalShow") ) {
				controlTotalShow();
			} else if( button.equals("Recalculation") ) {
				controlRecalculation();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("OtherRegister") ) {
				controlOtherRegister();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("JobOdrProgress") ) {
				controlJobOdrProgress();
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
//			throw new FoundationException("KM0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KM0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KM0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KM0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KM0050010Entity entity;
	protected KM0050010Struct struct;
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

		entity = new KM0050010Entity();
		struct = new KM0050010Struct();

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
	 * KM0050010�N���X�̕W���R���X�g���N�^
	 */
	public KM0050010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
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
				KM0050010Struct key = (KM0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CALCULATION_DATE") && key.getCALCULATION_DATE() != null) {
					msgKey.setKeyValue("CALCULATION_DATE", key.getCALCULATION_DATE());
				}
				if(msgKeyType.containsKeyColumn("TYP") && key.getTYP() != null) {
					msgKey.setKeyValue("TYP", key.getTYP());
				}
				if(msgKeyType.containsKeyColumn("PROGRESS") && key.getPROGRESS() != null) {
					msgKey.setKeyValue("PROGRESS", key.getPROGRESS());
				}
				if(msgKeyType.containsKeyColumn("PROFIT_RATIO") && key.getPROFIT_RATIO() != null) {
					msgKey.setKeyValue("PROFIT_RATIO", key.getPROFIT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST") && key.getITEM_TOTAL_COST() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST", key.getITEM_TOTAL_COST());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_W") && key.getODR_AMOUNT_W() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_W", key.getODR_AMOUNT_W());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_W") && key.getITEM_TOTAL_COST_W() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_W", key.getITEM_TOTAL_COST_W());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_T") && key.getITEM_TOTAL_COST_T() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_T", key.getITEM_TOTAL_COST_T());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_P") && key.getITEM_TOTAL_COST_P() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_P", key.getITEM_TOTAL_COST_P());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D") && key.getITEM_TOTAL_COST_D() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_D", key.getITEM_TOTAL_COST_D());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_W") && key.getMATERIAL_COST_W() != null) {
					msgKey.setKeyValue("MATERIAL_COST_W", key.getMATERIAL_COST_W());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_T") && key.getMATERIAL_COST_T() != null) {
					msgKey.setKeyValue("MATERIAL_COST_T", key.getMATERIAL_COST_T());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_P") && key.getMATERIAL_COST_P() != null) {
					msgKey.setKeyValue("MATERIAL_COST_P", key.getMATERIAL_COST_P());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_D") && key.getMATERIAL_COST_D() != null) {
					msgKey.setKeyValue("MATERIAL_COST_D", key.getMATERIAL_COST_D());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_W") && key.getPROCESSING_COST_W() != null) {
					msgKey.setKeyValue("PROCESSING_COST_W", key.getPROCESSING_COST_W());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_T") && key.getPROCESSING_COST_T() != null) {
					msgKey.setKeyValue("PROCESSING_COST_T", key.getPROCESSING_COST_T());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_P") && key.getPROCESSING_COST_P() != null) {
					msgKey.setKeyValue("PROCESSING_COST_P", key.getPROCESSING_COST_P());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_D") && key.getPROCESSING_COST_D() != null) {
					msgKey.setKeyValue("PROCESSING_COST_D", key.getPROCESSING_COST_D());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_W") && key.getSBCNT_COST_W() != null) {
					msgKey.setKeyValue("SBCNT_COST_W", key.getSBCNT_COST_W());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_T") && key.getSBCNT_COST_T() != null) {
					msgKey.setKeyValue("SBCNT_COST_T", key.getSBCNT_COST_T());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_P") && key.getSBCNT_COST_P() != null) {
					msgKey.setKeyValue("SBCNT_COST_P", key.getSBCNT_COST_P());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_D") && key.getSBCNT_COST_D() != null) {
					msgKey.setKeyValue("SBCNT_COST_D", key.getSBCNT_COST_D());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_W") && key.getOTHER_OVERHEADS_W() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_W", key.getOTHER_OVERHEADS_W());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_T") && key.getOTHER_OVERHEADS_T() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_T", key.getOTHER_OVERHEADS_T());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_P") && key.getOTHER_OVERHEADS_P() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_P", key.getOTHER_OVERHEADS_P());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D") && key.getOTHER_OVERHEADS_D() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_D", key.getOTHER_OVERHEADS_D());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_W") && key.getSERVICE_COST_W() != null) {
					msgKey.setKeyValue("SERVICE_COST_W", key.getSERVICE_COST_W());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_T") && key.getSERVICE_COST_T() != null) {
					msgKey.setKeyValue("SERVICE_COST_T", key.getSERVICE_COST_T());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_P") && key.getSERVICE_COST_P() != null) {
					msgKey.setKeyValue("SERVICE_COST_P", key.getSERVICE_COST_P());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_D") && key.getSERVICE_COST_D() != null) {
					msgKey.setKeyValue("SERVICE_COST_D", key.getSERVICE_COST_D());
				}
				if(msgKeyType.containsKeyColumn("PROFIT_RATIO_W") && key.getPROFIT_RATIO_W() != null) {
					msgKey.setKeyValue("PROFIT_RATIO_W", key.getPROFIT_RATIO_W());
				}
				if(msgKeyType.containsKeyColumn("PROFIT_RATIO_P") && key.getPROFIT_RATIO_P() != null) {
					msgKey.setKeyValue("PROFIT_RATIO_P", key.getPROFIT_RATIO_P());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("TYP_NUM") && key.getTYP_NUM() != null) {
					msgKey.setKeyValue("TYP_NUM", key.getTYP_NUM());
				}
				if(msgKeyType.containsKeyColumn("h_DETAL_NO") && key.geth_DETAL_NO() != null) {
					msgKey.setKeyValue("h_DETAL_NO", key.geth_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ES_COST_ETC") && key.geth_ES_COST_ETC() != null) {
					msgKey.setKeyValue("h_ES_COST_ETC", key.geth_ES_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("h_COST_PROGRESS") && key.geth_COST_PROGRESS() != null) {
					msgKey.setKeyValue("h_COST_PROGRESS", key.geth_COST_PROGRESS());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D2") && key.getITEM_TOTAL_COST_D2() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_D2", key.getITEM_TOTAL_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_D2") && key.getMATERIAL_COST_D2() != null) {
					msgKey.setKeyValue("MATERIAL_COST_D2", key.getMATERIAL_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_D2") && key.getPROCESSING_COST_D2() != null) {
					msgKey.setKeyValue("PROCESSING_COST_D2", key.getPROCESSING_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_D2") && key.getSBCNT_COST_D2() != null) {
					msgKey.setKeyValue("SBCNT_COST_D2", key.getSBCNT_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D2") && key.getOTHER_OVERHEADS_D2() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_D2", key.getOTHER_OVERHEADS_D2());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_D2") && key.getSERVICE_COST_D2() != null) {
					msgKey.setKeyValue("SERVICE_COST_D2", key.getSERVICE_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("PROGRESS_NO") && key.getPROGRESS_NO() != null) {
					msgKey.setKeyValue("PROGRESS_NO", key.getPROGRESS_NO());
				}
				if(msgKeyType.containsKeyColumn("pnumFlag") && key.getpnumFlag() != null) {
					msgKey.setKeyValue("pnumFlag", key.getpnumFlag());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_ETC") && key.getCMP_COST_ETC() != null) {
					msgKey.setKeyValue("CMP_COST_ETC", key.getCMP_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAL_NO") && key.getDETAL_NO() != null) {
					msgKey.setKeyValue("DETAL_NO", key.getDETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_MODIFY_COUNT") && key.getPJ_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PJ_MODIFY_COUNT", key.getPJ_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE") && key.getESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("ESTIMATE_TYPE", key.getESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_MATERIAL") && key.getES_COST_MATERIAL() != null) {
					msgKey.setKeyValue("ES_COST_MATERIAL", key.getES_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_PROCESS") && key.getES_COST_PROCESS() != null) {
					msgKey.setKeyValue("ES_COST_PROCESS", key.getES_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_OUTSOUCE") && key.getES_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("ES_COST_OUTSOUCE", key.getES_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_ETC") && key.getES_COST_ETC() != null) {
					msgKey.setKeyValue("ES_COST_ETC", key.getES_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_SERVICE") && key.getES_COST_SERVICE() != null) {
					msgKey.setKeyValue("ES_COST_SERVICE", key.getES_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_DATE") && key.getTOTAL_DATE() != null) {
					msgKey.setKeyValue("TOTAL_DATE", key.getTOTAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("COST_PROGRESS") && key.getCOST_PROGRESS() != null) {
					msgKey.setKeyValue("COST_PROGRESS", key.getCOST_PROGRESS());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_MATERIAL") && key.getCMP_COST_MATERIAL() != null) {
					msgKey.setKeyValue("CMP_COST_MATERIAL", key.getCMP_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_MATERIAL") && key.getEXP_COST_MATERIAL() != null) {
					msgKey.setKeyValue("EXP_COST_MATERIAL", key.getEXP_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_PROCESS") && key.getCMP_COST_PROCESS() != null) {
					msgKey.setKeyValue("CMP_COST_PROCESS", key.getCMP_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_PROCESS") && key.getEXP_COST_PROCESS() != null) {
					msgKey.setKeyValue("EXP_COST_PROCESS", key.getEXP_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_OUTSOUCE") && key.getCMP_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("CMP_COST_OUTSOUCE", key.getCMP_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_OUTSOUCE") && key.getEXP_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("EXP_COST_OUTSOUCE", key.getEXP_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_SERVICE") && key.getCMP_COST_SERVICE() != null) {
					msgKey.setKeyValue("CMP_COST_SERVICE", key.getCMP_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_SERVICE") && key.getEXP_COST_SERVICE() != null) {
					msgKey.setKeyValue("EXP_COST_SERVICE", key.getEXP_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("OD_COMP_FLG") && key.getOD_COMP_FLG() != null) {
					msgKey.setKeyValue("OD_COMP_FLG", key.getOD_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("pvc2LogMode") && key.getpvc2LogMode() != null) {
					msgKey.setKeyValue("pvc2LogMode", key.getpvc2LogMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputMode") && key.getpvc2OutputMode() != null) {
					msgKey.setKeyValue("pvc2OutputMode", key.getpvc2OutputMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputPath") && key.getpvc2OutputPath() != null) {
					msgKey.setKeyValue("pvc2OutputPath", key.getpvc2OutputPath());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputName") && key.getpvc2OutputName() != null) {
					msgKey.setKeyValue("pvc2OutputName", key.getpvc2OutputName());
				}
				if(msgKeyType.containsKeyColumn("pvc2UserId") && key.getpvc2UserId() != null) {
					msgKey.setKeyValue("pvc2UserId", key.getpvc2UserId());
				}
				if(msgKeyType.containsKeyColumn("pvc2BusinessName") && key.getpvc2BusinessName() != null) {
					msgKey.setKeyValue("pvc2BusinessName", key.getpvc2BusinessName());
				}
				if(msgKeyType.containsKeyColumn("pvc2PlantCd") && key.getpvc2PlantCd() != null) {
					msgKey.setKeyValue("pvc2PlantCd", key.getpvc2PlantCd());
				}
				if(msgKeyType.containsKeyColumn("pvc2OdrNo") && key.getpvc2OdrNo() != null) {
					msgKey.setKeyValue("pvc2OdrNo", key.getpvc2OdrNo());
				}
				if(msgKeyType.containsKeyColumn("pvc2PProjectCd") && key.getpvc2PProjectCd() != null) {
					msgKey.setKeyValue("pvc2PProjectCd", key.getpvc2PProjectCd());
				}
				if(msgKeyType.containsKeyColumn("pnumEstimateNo") && key.getpnumEstimateNo() != null) {
					msgKey.setKeyValue("pnumEstimateNo", key.getpnumEstimateNo());
				}
				if(msgKeyType.containsKeyColumn("pnumDetalNo") && key.getpnumDetalNo() != null) {
					msgKey.setKeyValue("pnumDetalNo", key.getpnumDetalNo());
				}
				if(msgKeyType.containsKeyColumn("pnumReturn") && key.getpnumReturn() != null) {
					msgKey.setKeyValue("pnumReturn", key.getpnumReturn());
				}
				if(msgKeyType.containsKeyColumn("FILE_PATH") && key.getFILE_PATH() != null) {
					msgKey.setKeyValue("FILE_PATH", key.getFILE_PATH());
				}
				if(msgKeyType.containsKeyColumn("FILE_NAME") && key.getFILE_NAME() != null) {
					msgKey.setKeyValue("FILE_NAME", key.getFILE_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOG_MODE_TYP") && key.getLOG_MODE_TYP() != null) {
					msgKey.setKeyValue("LOG_MODE_TYP", key.getLOG_MODE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP") && key.getOUTPUT_MODE_TYP() != null) {
					msgKey.setKeyValue("OUTPUT_MODE_TYP", key.getOUTPUT_MODE_TYP());
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
					KM0050010Struct key = new KM0050010Struct();
					if(msgKeyType.containsKeyColumn("CALCULATION_DATE")) {
						key.setCALCULATION_DATE(msgKey.getKeyValue("CALCULATION_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TYP")) {
						key.setTYP(msgKey.getKeyValue("TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROGRESS")) {
						key.setPROGRESS(msgKey.getKeyValue("PROGRESS"));
					}
					if(msgKeyType.containsKeyColumn("PROFIT_RATIO")) {
						key.setPROFIT_RATIO(msgKey.getKeyValue("PROFIT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST")) {
						key.setITEM_TOTAL_COST(msgKey.getKeyValue("ITEM_TOTAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_W")) {
						key.setODR_AMOUNT_W(msgKey.getKeyValue("ODR_AMOUNT_W"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_W")) {
						key.setITEM_TOTAL_COST_W(msgKey.getKeyValue("ITEM_TOTAL_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_T")) {
						key.setITEM_TOTAL_COST_T(msgKey.getKeyValue("ITEM_TOTAL_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_P")) {
						key.setITEM_TOTAL_COST_P(msgKey.getKeyValue("ITEM_TOTAL_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D")) {
						key.setITEM_TOTAL_COST_D(msgKey.getKeyValue("ITEM_TOTAL_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_W")) {
						key.setMATERIAL_COST_W(msgKey.getKeyValue("MATERIAL_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_T")) {
						key.setMATERIAL_COST_T(msgKey.getKeyValue("MATERIAL_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_P")) {
						key.setMATERIAL_COST_P(msgKey.getKeyValue("MATERIAL_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_D")) {
						key.setMATERIAL_COST_D(msgKey.getKeyValue("MATERIAL_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_W")) {
						key.setPROCESSING_COST_W(msgKey.getKeyValue("PROCESSING_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_T")) {
						key.setPROCESSING_COST_T(msgKey.getKeyValue("PROCESSING_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_P")) {
						key.setPROCESSING_COST_P(msgKey.getKeyValue("PROCESSING_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_D")) {
						key.setPROCESSING_COST_D(msgKey.getKeyValue("PROCESSING_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_W")) {
						key.setSBCNT_COST_W(msgKey.getKeyValue("SBCNT_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_T")) {
						key.setSBCNT_COST_T(msgKey.getKeyValue("SBCNT_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_P")) {
						key.setSBCNT_COST_P(msgKey.getKeyValue("SBCNT_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_D")) {
						key.setSBCNT_COST_D(msgKey.getKeyValue("SBCNT_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_W")) {
						key.setOTHER_OVERHEADS_W(msgKey.getKeyValue("OTHER_OVERHEADS_W"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_T")) {
						key.setOTHER_OVERHEADS_T(msgKey.getKeyValue("OTHER_OVERHEADS_T"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_P")) {
						key.setOTHER_OVERHEADS_P(msgKey.getKeyValue("OTHER_OVERHEADS_P"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D")) {
						key.setOTHER_OVERHEADS_D(msgKey.getKeyValue("OTHER_OVERHEADS_D"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_W")) {
						key.setSERVICE_COST_W(msgKey.getKeyValue("SERVICE_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_T")) {
						key.setSERVICE_COST_T(msgKey.getKeyValue("SERVICE_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_P")) {
						key.setSERVICE_COST_P(msgKey.getKeyValue("SERVICE_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_D")) {
						key.setSERVICE_COST_D(msgKey.getKeyValue("SERVICE_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("PROFIT_RATIO_W")) {
						key.setPROFIT_RATIO_W(msgKey.getKeyValue("PROFIT_RATIO_W"));
					}
					if(msgKeyType.containsKeyColumn("PROFIT_RATIO_P")) {
						key.setPROFIT_RATIO_P(msgKey.getKeyValue("PROFIT_RATIO_P"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("TYP_NUM")) {
						key.setTYP_NUM(msgKey.getKeyValue("TYP_NUM"));
					}
					if(msgKeyType.containsKeyColumn("h_DETAL_NO")) {
						key.seth_DETAL_NO(msgKey.getKeyValue("h_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ES_COST_ETC")) {
						key.seth_ES_COST_ETC(msgKey.getKeyValue("h_ES_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("h_COST_PROGRESS")) {
						key.seth_COST_PROGRESS(msgKey.getKeyValue("h_COST_PROGRESS"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D2")) {
						key.setITEM_TOTAL_COST_D2(msgKey.getKeyValue("ITEM_TOTAL_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_D2")) {
						key.setMATERIAL_COST_D2(msgKey.getKeyValue("MATERIAL_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_D2")) {
						key.setPROCESSING_COST_D2(msgKey.getKeyValue("PROCESSING_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_D2")) {
						key.setSBCNT_COST_D2(msgKey.getKeyValue("SBCNT_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D2")) {
						key.setOTHER_OVERHEADS_D2(msgKey.getKeyValue("OTHER_OVERHEADS_D2"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_D2")) {
						key.setSERVICE_COST_D2(msgKey.getKeyValue("SERVICE_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("PROGRESS_NO")) {
						key.setPROGRESS_NO(msgKey.getKeyValue("PROGRESS_NO"));
					}
					if(msgKeyType.containsKeyColumn("pnumFlag")) {
						key.setpnumFlag(msgKey.getKeyValue("pnumFlag"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_ETC")) {
						key.setCMP_COST_ETC(msgKey.getKeyValue("CMP_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAL_NO")) {
						key.setDETAL_NO(msgKey.getKeyValue("DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_MODIFY_COUNT")) {
						key.setPJ_MODIFY_COUNT(msgKey.getKeyValue("PJ_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE")) {
						key.setESTIMATE_TYPE(msgKey.getKeyValue("ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_MATERIAL")) {
						key.setES_COST_MATERIAL(msgKey.getKeyValue("ES_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_PROCESS")) {
						key.setES_COST_PROCESS(msgKey.getKeyValue("ES_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_OUTSOUCE")) {
						key.setES_COST_OUTSOUCE(msgKey.getKeyValue("ES_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_ETC")) {
						key.setES_COST_ETC(msgKey.getKeyValue("ES_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_SERVICE")) {
						key.setES_COST_SERVICE(msgKey.getKeyValue("ES_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_DATE")) {
						key.setTOTAL_DATE(msgKey.getKeyValue("TOTAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COST_PROGRESS")) {
						key.setCOST_PROGRESS(msgKey.getKeyValue("COST_PROGRESS"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_MATERIAL")) {
						key.setCMP_COST_MATERIAL(msgKey.getKeyValue("CMP_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_MATERIAL")) {
						key.setEXP_COST_MATERIAL(msgKey.getKeyValue("EXP_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_PROCESS")) {
						key.setCMP_COST_PROCESS(msgKey.getKeyValue("CMP_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_PROCESS")) {
						key.setEXP_COST_PROCESS(msgKey.getKeyValue("EXP_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_OUTSOUCE")) {
						key.setCMP_COST_OUTSOUCE(msgKey.getKeyValue("CMP_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_OUTSOUCE")) {
						key.setEXP_COST_OUTSOUCE(msgKey.getKeyValue("EXP_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_SERVICE")) {
						key.setCMP_COST_SERVICE(msgKey.getKeyValue("CMP_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_SERVICE")) {
						key.setEXP_COST_SERVICE(msgKey.getKeyValue("EXP_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("OD_COMP_FLG")) {
						key.setOD_COMP_FLG(msgKey.getKeyValue("OD_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("pvc2LogMode")) {
						key.setpvc2LogMode(msgKey.getKeyValue("pvc2LogMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputMode")) {
						key.setpvc2OutputMode(msgKey.getKeyValue("pvc2OutputMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputPath")) {
						key.setpvc2OutputPath(msgKey.getKeyValue("pvc2OutputPath"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputName")) {
						key.setpvc2OutputName(msgKey.getKeyValue("pvc2OutputName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2UserId")) {
						key.setpvc2UserId(msgKey.getKeyValue("pvc2UserId"));
					}
					if(msgKeyType.containsKeyColumn("pvc2BusinessName")) {
						key.setpvc2BusinessName(msgKey.getKeyValue("pvc2BusinessName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2PlantCd")) {
						key.setpvc2PlantCd(msgKey.getKeyValue("pvc2PlantCd"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OdrNo")) {
						key.setpvc2OdrNo(msgKey.getKeyValue("pvc2OdrNo"));
					}
					if(msgKeyType.containsKeyColumn("pvc2PProjectCd")) {
						key.setpvc2PProjectCd(msgKey.getKeyValue("pvc2PProjectCd"));
					}
					if(msgKeyType.containsKeyColumn("pnumEstimateNo")) {
						key.setpnumEstimateNo(msgKey.getKeyValue("pnumEstimateNo"));
					}
					if(msgKeyType.containsKeyColumn("pnumDetalNo")) {
						key.setpnumDetalNo(msgKey.getKeyValue("pnumDetalNo"));
					}
					if(msgKeyType.containsKeyColumn("pnumReturn")) {
						key.setpnumReturn(msgKey.getKeyValue("pnumReturn"));
					}
					if(msgKeyType.containsKeyColumn("FILE_PATH")) {
						key.setFILE_PATH(msgKey.getKeyValue("FILE_PATH"));
					}
					if(msgKeyType.containsKeyColumn("FILE_NAME")) {
						key.setFILE_NAME(msgKey.getKeyValue("FILE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOG_MODE_TYP")) {
						key.setLOG_MODE_TYP(msgKey.getKeyValue("LOG_MODE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP")) {
						key.setOUTPUT_MODE_TYP(msgKey.getKeyValue("OUTPUT_MODE_TYP"));
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
