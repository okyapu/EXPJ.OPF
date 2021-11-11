/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0150/src/com/nec/jp/orteus/metamorBase/AC0150/AC0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0150;

import com.nec.jp.orteus.metamorBase.AC0150.*;
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
/**
 * CLASS     : AC0150010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.11 $ $Date: 2014/11/28 01:27:45 $
 *
 */
//}}user_implement_code_header

public class AC0150010Control
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
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public AC0150010Struct getListvalue(int x) { return (AC0150010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AC0150010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AC0150010Struct createStruct() { return new AC0150010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AC0150010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/** ���W�J�p���X�g�i�S�ēW�J�����Ώہj */
	private List Levellist = null;
	/** �W�J���x���p�t���O */
	private boolean LevelOverFlg = false;
	/** �W�J���ʂ̕\������ */
	private int DisplayOrderID = 0;
	
	/** �W�J���x�� */
	private int maxDevelopLevel = 0;
	
	private boolean flag = false;
	
	/**
	 * �V�X�e���̓��t�擾
	 */
	public String getDateTime(){
		Date datetime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		return sdf.format(datetime);
	}  
	
	/**
	 * �����������ɐ��W�J�������s��
	 * @param odNo �I�[�_�f�}���h�ԍ�
	 * @param jobOdrCd ����
	 * @param jobOdrCancelNo ���Ԏ�������ԍ�
	 * @param plantCd �H��R�[�h
	 * @param level ���x��
	 * @param O����StsTyp �I�[�_��ԋ敪
	 * @param emsg �G���[���b�Z�[�W
	 * @exception FoundationException �����������ɃG���[�����������ꍇ
	 * @exception SQLException �����������ɃG���[�����������ꍇ
	 * @exception ParseException �����������ɃG���[�����������ꍇ
	 */
	private void developForward(String odNo, String jobOdrCd,
			String jobOdrCancelNo, String plantCd, int level,String O����StsTyp)
			throws Exception{

		AC0150010Struct aStruct = null;
		AC0150010Struct childStruct = new AC0150010Struct();
		List resultList = null;

		// ���������̐ݒ�
		childStruct.setPARENT_OD_NO(odNo);
		childStruct.setJOB_ODR_CD(jobOdrCd);
		childStruct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
		childStruct.setPLANT_CD(plantCd);
		//childStruct.setInC_ODR_STS_TYP(O����StsTyp);
		int maxLine = sp.getMaxLine(conn, 10);
		
         //���v�ʂ�����
		if (level == 1) {
			if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("")) {
				resultList = entity.mV_JOB_ODR_PROG_LST_ROOT.read(conn, childStruct);
			} else {
				String targetItemCd = struct.getITEM_CD();
				childStruct.setITEM_CD(targetItemCd);
				resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
				if (resultList.size() > 1) {
					setWarningMessage("AJ00020");
				}
			}
		} else {
			resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
		}

		for (int i = 0; i < resultList.size(); i++) {
			aStruct = (AC0150010Struct)resultList.get(i);
			try{
				aStruct.setl_ODR_STS_TYP_NAME(multcombo("ODR_STS_TYP",aStruct.getl_ODR_STS_TYP()));
				aStruct.setl_OD_GNR_TYP_NAME(multcombo("OD_GNR_TYP",aStruct.getl_OD_GNR_TYP()));
			}catch(Exception e){
				e.printStackTrace();
			}

			// ���΃��x��
			aStruct.setLev_No(String.valueOf(level));

			// �I�[�_��ԋ敪
			if (("0").equals(aStruct.getl_ODR_STS_TYP())){
				aStruct.setl_ODR_STS_TYP_NAME(null);
				// �����[����Null��ݒ肷��
				aStruct.setl_PRD_DUE_DATE(null);
			}

			// �f�}���h��ԋ敪
			if (("0").equals(aStruct.getl_DM_STS_TYP())) {
				// �v���[����Null��ݒ肷��
				aStruct.setl_DUE_DATE(null);
			}

			// ���O��敪
			setOutsideTyp(aStruct);		
			
			
			// �ő僌�x���ɒB�����ꍇ�͓W�J�I��
			if (level > maxDevelopLevel + 1) {
				this.LevelOverFlg = true;
			}else{
				//�\�����ʃ��X�g
				if ("1".equals(O����StsTyp)){ //�I�[�_��ԋ敪�͌v���I�������ꍇ
					//���ԏ�ԋ敪�̃`�F�b�N�@�@�P�F�v��̃f�[�^�̂݁A�\�����ꂽ
					if ("1".equals(((AC0150010Struct)resultList.get(i)).getl_ODR_STS_TYP())){
						list.add(resultList.get(i));
						if ((maxLine != 0) && (list.size() > maxLine)) {
				        	flag = true;
				        	return;
						} 
					}
				}else{
					list.add(resultList.get(i));
					if ((maxLine != 0) && (list.size() > maxLine)) {
			        	flag = true;
			        	return;
					} 
				}
			}
			//�\�����ʏ���
			aStruct.setOrderID(String.valueOf(DisplayOrderID++));
			//�W�J���ʃ��X�g�i�S�ēW�J�����Ώہj
			Levellist.add(resultList.get(i));
			// ���v�ʏ����敪���u3:�폜�v�ȊO�̏ꍇ�A���ʃ��x���̓W�J���s��
			if (!("3").equals(aStruct.getMRP_TYP())) {
				developForward(aStruct.getl_OD_NO(), jobOdrCd,
						jobOdrCancelNo, aStruct.getPLANT_CD(), level + 1,O����StsTyp);
			}
			
			if(flag == true){
				return;
			}
		}
	}
	/**
	 * ���O��敪�̐ݒ�
	 * @param aStruct ���O��敪��ݒ肷��Struct
	 */
	private void setOutsideTyp(AC0150010Struct aStruct) throws Exception{
		String displayName = "";  // �R���{�{�b�N�X�f�[�^�\���p
		int workInProcQty = 0;
		int rlsdPuchOdrQty = 0;
		workInProcQty = Integer.parseInt(aStruct.getl_WORK_IN_PROC_QTY());
		rlsdPuchOdrQty = Integer.parseInt(aStruct.getl_RLSD_PUCH_ODR_QTY());

		// �I�[�_�f�}���h�ԍ��̑��݃`�F�b�N
		if (rlsdPuchOdrQty > 0 || workInProcQty > 0) {
			// ���O��敪�i�i���Ǘ��p�j
			if (rlsdPuchOdrQty > 0 && workInProcQty > 0) {
				// �����c�E�i�ڕʎd�|�ɑ��݂���
				displayName = multcombo("J_OUTSIDE_TYP", "9");
			} else if (rlsdPuchOdrQty > 0) {
				// �����c�̂ݑ��݂���
				displayName = multcombo("J_OUTSIDE_TYP", "2");
			} else if (workInProcQty > 0) {
				// �i�ڕʎd�|�̂ݑ��݂���
				displayName = multcombo("J_OUTSIDE_TYP", "1");
			} else {
				displayName = null;
			}
			aStruct.setl_OUTSIDE_TYP_NAME(displayName);
		} else {
			// ���O��敪
			displayName = multcombo("OUTSIDE_TYP",
					aStruct.getl_OUTSIDE_TYP());
			aStruct.setl_OUTSIDE_TYP_NAME(displayName);
		}
	}
	/**
	 * �R���{�{�b�N�X�̐����擾�i������j
	 * @param comname �R���{�{�b�N�X��ID�ԍ�
	 * @param value �@���l
	 * @return �u��������
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
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
	/**
	 * �ʃI�[�_����
	 */
	private void OdrReleas(){
		try{ 
			 // �p�����[�^���擾����
			 String userId = getsysUSER_CD();							// ���[�UID
		 	 String plantCd = getsysPLANT_CD();							// �H��R�[�h
		 	 String SysTime = struct.getSYS_TIME();			    	    // �^�C���X�^���v
			 String JobOdrCd = struct.getJOB_ODR_CD();				    // ����
			 String batchProcessingTyp = null;    					   	// �o�b�`�����敪

			 
			 //�Œ�l���Z�b�g
			 batchProcessingTyp = "2";    // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
			 
			 ResourceBundle bundle = SystemConfig.getBundle();
		     String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
		     if(javaPath == null){
		    	 setErrorMessage("ZZ09010");
		     }
		     String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
		     if(ClassPath == null){
		    	 setErrorMessage("ZZ09012");
		     }
		     String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
		     if(batchPath == null){
		    	 setErrorMessage("ZZ09011");
		     }		     
		     
		     // �ʃI�[�_�����o�b�`
//			 String cmdB001 = "";
//			   cmdB001 = cmdB001 + javaPath;    // �i�u�l
//			   cmdB001 = cmdB001 + " -cp ";
//			   cmdB001 = cmdB001 + ClassPath;   // Java ClassPath
//			   cmdB001 = cmdB001 + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//			   cmdB001 = cmdB001 + batchPath;   //"; // �N���ݒ�
//		       // �Ăяo����N���X
//			   cmdB001 = cmdB001 + (" com.nec.jp.orteus.metamorBase.AC0150.AC0150B001.mainAC0150B001");
//			   cmdB001 = cmdB001 + " \"" + batchProcessingTyp + "\""; // �o�b�`�����敪
//			   cmdB001 = cmdB001 + " \"" + userId + "\"";				// ���[�UID
//	 		   cmdB001 = cmdB001 + " \"" + plantCd + "\"";				// �H��R�[�h
//			   cmdB001 = cmdB001 + " \"" + SysTime + "\"";              // �^�C���X�^���v
//			   cmdB001 = cmdB001 + " \"" + JobOdrCd + "\"";              // ����
	               //cmdB001 = cmdB001 + " " + null;					// ���Ԏ}�ԁi�\���j
	               
	         //�o�b�`�����s����
//			 Runtime runtime = Runtime.getRuntime();
			 
			 // ===============================
			 // �ʃI�[�_�����o�b�`�����s
			 // ===============================

//			 Process p = runtime.exec(cmdB001);
			 
		     List buffer = new ArrayList();
		     buffer.add(javaPath);            // �i�u�l
		     buffer.add("-cp");
		     buffer.add(ClassPath);          // Java ClassPath
		     buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // �N���ݒ�
		     buffer.add("com.nec.jp.orteus.metamorBase.AC0150.AC0150B001.mainAC0150B001"); // �Ăяo����N���X
		     buffer.add(batchProcessingTyp);             // �o�b�`�����敪
		     buffer.add(userId);                         // ���[�UID
		     buffer.add(plantCd);                        // �H��R�[�h
		     buffer.add(SysTime);                        // �^�C���X�^���v
		     buffer.add(JobOdrCd);                       // ����

		     // �o�b�`�������s
		     Runtime runtime = Runtime.getRuntime();
		     runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			 // �o�b�`�Ăяo�������̏ꍇ�A��ʃ��b�Z�[�W��\������B
			 setWarningMessage("ZZ09013");
             
		} catch (Exception e) {
			e.printStackTrace();			
			// �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
			setErrorMessage("ZZ09014");
			try{
				// �ꎞ�e�[�u�����폜����
				entity.mT_ODRELEASE_T.delete(conn, struct);
			}catch(Exception ee){
				ee.printStackTrace();
				setErrorMessage("ZZ01106");
				return;
			}
			
			return;
		}
	}
	/**
     * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈��
     * @param ���b�Z�[�W�ԍ�
     */
    private void setWarningMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addWarn( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
     sysLog.warning(emsg, getsysUSER_CD()); //���b�Z�[�W���e
    }
	/**
     * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈��
     * @param ���b�Z�[�W�ԍ�
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
     sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
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
     * ��ʂɐ��Ԍv����̐ݒ�
     */
    private void setJobOdr(AC0150010Struct WorkStruct)throws Exception{
    	if(WorkStruct==null){
			struct.setJOB_ODR_STS_TYP_NAME("");
			struct.setJOB_ODR_TYP_NAME("");
			struct.setPLAN_TYP_NAME("");
			struct.setALC_GRP_CD("");
			struct.setJOB_ODR_DLV_DATE("");
			struct.setJOB_ODR_QTY("");
			struct.setJOB_ODR_DEL_FLG("");

    	}else{
    		struct.setJOB_ODR_STS_TYP_NAME(multcombo("JOB_ODR_STS_TYP", WorkStruct.getJOB_ODR_STS_TYP()));
			struct.setJOB_ODR_TYP_NAME(multcombo("JOB_ODR_TYP",WorkStruct.getJOB_ODR_TYP()));
			struct.setPLAN_TYP_NAME(multcombo("PLAN_TYP",WorkStruct.getPLAN_TYP()));
			struct.setALC_GRP_CD(WorkStruct.getALC_GRP_CD());
			struct.setJOB_ODR_DLV_DATE(WorkStruct.getJOB_ODR_DLV_DATE());
			struct.setJOB_ODR_QTY(WorkStruct.getJOB_ODR_QTY());
			struct.setJOB_ODR_DEL_FLG(WorkStruct.getJOB_ODR_DEL_FLG());
    	}
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		try {
			flag = false;
			struct.setPLANT_CD(getsysPLANT_CD());
			setReadStatus(INITIAL);
			List WorkList = null;
			AC0150010Struct WorkStruct = null;
			list = new ArrayList(0);
			Levellist = new ArrayList(0);
			DisplayOrderID = 0;
			
			//�W�J���x���p�t���O 
			LevelOverFlg = false;
			//�I�[�_��ԋ敪�̏�����
            struct.setInC_ODR_STS_TYP("");

            
            // ��ʕҏW�s���ڃN���A
            setJobOdr(null);
            
			// ���Ԍv��̑��݃`�F�b�N
			WorkList = entity.mSelect_form.read(conn, struct);
			
			if(WorkList.isEmpty()||WorkList.size()==0){
				setErrorMessage("AJ00018");
				setErrorMessage("ZZ01006","T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				setErrorMessage("ZZ01006","T_JOB_ODR.JOB_ODR_CANCEL_NO:" + struct.getJOB_ODR_CANCEL_NO());
			}else{
				WorkStruct=(AC0150010Struct)WorkList.get(0);
				if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
					if (!WorkStruct.getPLANT_CD().equals(struct.getPLANT_CD())) {
						setErrorMessage("AJ00019");
						setErrorMessage("ZZ01006","T_JOB_ODR.PLANT_CD:" + WorkStruct.getPLANT_CD());
					}
				}
				if (WorkStruct.getJOB_ODR_STS_TYP().equals("1")
					|| WorkStruct.getJOB_ODR_STS_TYP().equals("2")) {
					// ���v�ʌv�Z�����s���Ă��Ȃ�
					setErrorMessage("AJ00016");
				} else {
					setJobOdr(WorkStruct);
				}
			
			}
			
			// �i�ڔԍ����w�肳��Ă���ꍇ
			if (struct.getITEM_CD() != null&& !struct.getITEM_CD().equals("")) {
				WorkList = entity.mM_ITEM.read(conn, struct);
				if (WorkList.isEmpty()||WorkList.size()== 0) {
					setErrorMessage("AJ00015");
					setErrorMessage("ZZ01006","M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					struct.setITEM_NAME("");
				} else {
					struct.setITEM_NAME(((AC0150010Struct)WorkList.get(0)).getITEM_NAME());
				}
			}		
	
			//�I�[�_��ԋ敪�ݒ�
            if("true".equals(struct.getc1_ODR_STS_TYP())){
            	//1:�v��i�������j
            	struct.setInC_ODR_STS_TYP("1");
            }
            
            
            // �G���[������ΏI��
			if (msgStruct.hasError()) {

				setReadStatus(ERROR);

				return;
			}
			
			// �W�J���x���i�����l�j
			maxDevelopLevel = Integer.parseInt(struct.getDEVELOP_LEVEL());
			int level = 1;
			// ���W�J
          	developForward(null, struct.getJOB_ODR_CD(),struct.getJOB_ODR_CANCEL_NO(), struct.getPLANT_CD(), level,struct.getInC_ODR_STS_TYP());
			
			if (struct.getJOB_ODR_DEL_FLG().equals("1")) {
				// �폜�Ώہi���[�j���O�j
				setWarningMessage("AJ00017");
			}
			if (list.size() > 0) {
				// �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
	          	int maxLine = sp.getMaxLine(conn, 10);
	          	if ((maxLine != 0) && (list.size() > maxLine)) {
	            	setErrorMessage("AC00229", String.valueOf(maxLine));
	            	setList(null);
	            	setReadStatus(TOO_MANY);
	            	return;
	          	}
	          	
				setReadStatus(NORMAL);
			}else{	
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				return;
			}
	

			if (LevelOverFlg){
				setWarningMessage("AC00232");
			}
			
		} catch(Exception e) {
			setReadStatus(ERROR);	
			e.printStackTrace();
			// �G���[�������L�q���܂�
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClearAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClearAssort");
			//{{user_implement_dev:<controlClearAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClearAssort>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClearAssort");

		return;
	}

	/**
	 * �I�[�_�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReleased() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlReleased");
			//{{user_implement_dev:<controlReleased>
		try{
			AC0150010Struct WorksSruct = null;
			List WorkList = null;
			//add by �z�E���́@2008/4/9  start
			String od_No = null;
			//data��List�ɑ��݃t���O
			boolean dateFlg = false;
			List T_ODRELEASE_TList = new ArrayList(0);
			//add by �z�E���́@2008/4/9  end
			struct.setPLANT_CD(getsysPLANT_CD());
			struct.setSYS_USER(getsysUSER_CD());
			struct.setSYS_TIME(getDateTime());
			WorkList = struct.getList_OrderID();
			
			//�ŏ�ʃI�[�_���݃t���O
			boolean RootFlg = false;
			
			//�ŏ�ʃI�[�_����������
			for (int i=0;i < WorkList.size();i++){
				if ("0".equals((String)WorkList.get(i))){
					RootFlg = true;
				}
			}
			//�����Ώے��ɍŏ�ʃI�[�_�����ꍇ(�S�ēW�J�����Ώۂ𔭌�����)
			if(RootFlg){
				for (int i=0;i < Levellist.size();i++){
					WorksSruct = (AC0150010Struct)Levellist.get(i);
					WorksSruct.setsUser_ID(getsysUSER_CD());
					WorksSruct.setSYS_USER(getsysUSER_CD());
					WorksSruct.setSYS_TIME(struct.getSYS_TIME());
					WorksSruct.setPLANT_CD(getsysPLANT_CD());
					//�I�[�_��ԋ敪�͌v��ł͂Ȃ��ꍇ�A�ΏۊO�ł�
					if (!"1".equals(WorksSruct.getl_ODR_STS_TYP())){
						continue;
					}
					entity.mT_ODRELEASE_T.create(conn, WorksSruct);
				}
			}else{	//�����Ώے��ɍŏ�ʃI�[�_�����Ȃ��ꍇ(�Ώۂ�I��)
				
				for (int i=0;i < WorkList.size();i++){
					int j = Integer.parseInt((String)WorkList.get(i));
					WorksSruct = (AC0150010Struct)Levellist.get(j);
					WorksSruct.setsUser_ID(getsysUSER_CD());
					WorksSruct.setSYS_USER(getsysUSER_CD());
					WorksSruct.setSYS_TIME(struct.getSYS_TIME());
					WorksSruct.setPLANT_CD(getsysPLANT_CD());
					//entity.mT_ODRELEASE_T.create(conn, WorksSruct);

					//add by �z�E���́@2008/4/9  start
					if(T_ODRELEASE_TList.size() == 0){
						T_ODRELEASE_TList.add(WorksSruct);								
					}
					dateFlg = false;
					od_No = WorksSruct.getl_OD_NO();
					for(int tSize = 0; tSize < T_ODRELEASE_TList.size();tSize++){
						if(od_No.equals(((AC0150010Struct)T_ODRELEASE_TList.get(tSize)).getl_OD_NO())){
							dateFlg = true;
							break;
						}				
					}
					if(!dateFlg){
						T_ODRELEASE_TList.add(WorksSruct);		
					}
					//add by �z�E���́@2008/4/9  end
					
					int intLev_No = Integer.parseInt(WorksSruct.getLev_No());
					//�����Ώۂ̉��ʃI�[�_����������
					for (j = ++j; j < Levellist.size()
							&& (intLev_No < Integer
									.parseInt(((AC0150010Struct) Levellist
											.get(j)).getLev_No())); j++) {
						
						WorksSruct = (AC0150010Struct) Levellist.get(j);
						//�I�[�_��ԋ敪�͌v��ł͂Ȃ��ꍇ�A�ΏۊO�ł�
						if (!"1".equals(WorksSruct.getl_ODR_STS_TYP())){
							continue;
						}
						WorksSruct.setsUser_ID(getsysUSER_CD());
						WorksSruct.setSYS_USER(getsysUSER_CD());
						WorksSruct.setSYS_TIME(struct.getSYS_TIME());
						WorksSruct.setPLANT_CD(getsysPLANT_CD());
						//entity.mT_ODRELEASE_T.create(conn, WorksSruct);

						//add by �z�E���́@2008/4/9  start
						dateFlg = false;
						od_No = WorksSruct.getl_OD_NO();
						for(int tSize = 0; tSize < T_ODRELEASE_TList.size();tSize++){
							if(od_No.equals(((AC0150010Struct)T_ODRELEASE_TList.get(tSize)).getl_OD_NO())){
								dateFlg = true;
								break;
							}				
						}
						if(!dateFlg){
							T_ODRELEASE_TList.add(WorksSruct);		
						}						
						//add by �z�E���́@2008/4/9  end
					}
					
				}

				//add by �z�E���́@2008/4/9  start
				for(int i = 0;i<T_ODRELEASE_TList.size();i++){
					AC0150010Struct insertStruct = (AC0150010Struct)T_ODRELEASE_TList.get(i);					
					entity.mT_ODRELEASE_T.create(conn, insertStruct);					
				}
				//add by �z�E���́@2008/4/9  end
			}
			conn.commit();
			//�I�[�_���������s����			
			OdrReleas();
			
		}catch(Exception e){
			setReadStatus(ERROR);	
			conn.rollback();
			e.printStackTrace();
			// �G���[�������L�q���܂�
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlReleased>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlReleased");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		try{
			//��ʂ̏�����
			struct.setPLANT_CD(getsysPLANT_CD());
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber("INIT_DISPLAY_PS_LEVEL");
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
			setList(null);
			setReadStatus(INITIAL);
		}catch(Exception e){
			e.printStackTrace();
		}		
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			//��ʂ̏�����
			struct.setPLANT_CD(getsysPLANT_CD());
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber("INIT_DISPLAY_PS_LEVEL");
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
		}catch(Exception e){
			e.printStackTrace();
		}
	
/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
*/
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
			if ( isScreenMove() == true ) {
				// �����̃R���g���[�����\�b�h���Ăяo���܂��B
//				controlSelect();
			}

/*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		} catch(SQLException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0150");
		logger.entering("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AC0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("ClearAssort") ) {
				controlClearAssort();
			} else if( button.equals("Released") ) {
				controlReleased();
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
//			throw new FoundationException("AC0150010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0150010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0150010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0150010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0150010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0150010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0150010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0150010Entity entity;
	protected AC0150010Struct struct;
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

		entity = new AC0150010Entity();
		struct = new AC0150010Struct();

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
	 * AC0150010�N���X�̕W���R���X�g���N�^
	 */
	public AC0150010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
		try {
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
				AC0150010Struct key = (AC0150010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL") && key.getDEVELOP_LEVEL() != null) {
					msgKey.setKeyValue("DEVELOP_LEVEL", key.getDEVELOP_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP") && key.getc1_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c1_ODR_STS_TYP", key.getc1_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_NAME") && key.getJOB_ODR_TYP_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_NAME", key.getJOB_ODR_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_NAME") && key.getJOB_ODR_STS_TYP_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP_NAME", key.getJOB_ODR_STS_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("Lev_No") && key.getLev_No() != null) {
					msgKey.setKeyValue("Lev_No", key.getLev_No());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_NAME") && key.getl_ODR_STS_TYP_NAME() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_NAME", key.getl_ODR_STS_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_NAME") && key.getl_OUTSIDE_TYP_NAME() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_NAME", key.getl_OUTSIDE_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_NAME") && key.getl_OD_GNR_TYP_NAME() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP_NAME", key.getl_OD_GNR_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP_NAME") && key.getPLAN_TYP_NAME() != null) {
					msgKey.setKeyValue("PLAN_TYP_NAME", key.getPLAN_TYP_NAME());
				}
				if(msgKeyType.containsKeyColumn("OrderID") && key.getOrderID() != null) {
					msgKey.setKeyValue("OrderID", key.getOrderID());
				}
				if(msgKeyType.containsKeyColumn("InC_ODR_STS_TYP") && key.getInC_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("InC_ODR_STS_TYP", key.getInC_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP") && key.getPLAN_TYP() != null) {
					msgKey.setKeyValue("PLAN_TYP", key.getPLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE") && key.getl_DUE_DATE() != null) {
					msgKey.setKeyValue("l_DUE_DATE", key.getl_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_START_DATE") && key.getl_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_ODR_START_DATE", key.getl_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE") && key.getl_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE", key.getl_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP") && key.getl_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP", key.getl_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_QTY") && key.getl_RCV_QTY() != null) {
					msgKey.setKeyValue("l_RCV_QTY", key.getl_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE") && key.getl_RCV_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_RCV_CMPLT_DATE", key.getl_RCV_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP") && key.getl_OD_GNR_TYP() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP", key.getl_OD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP") && key.getl_DM_STS_TYP() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP", key.getl_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY") && key.getl_RLSD_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_RLSD_PUCH_ODR_QTY", key.getl_RLSD_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY") && key.getl_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_QTY", key.getl_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SYS_USER") && key.getSYS_USER() != null) {
					msgKey.setKeyValue("SYS_USER", key.getSYS_USER());
				}
				if(msgKeyType.containsKeyColumn("SYS_TIME") && key.getSYS_TIME() != null) {
					msgKey.setKeyValue("SYS_TIME", key.getSYS_TIME());
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
					AC0150010Struct key = new AC0150010Struct();
					if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL")) {
						key.setDEVELOP_LEVEL(msgKey.getKeyValue("DEVELOP_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP")) {
						key.setc1_ODR_STS_TYP(msgKey.getKeyValue("c1_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_NAME")) {
						key.setJOB_ODR_TYP_NAME(msgKey.getKeyValue("JOB_ODR_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP_NAME")) {
						key.setJOB_ODR_STS_TYP_NAME(msgKey.getKeyValue("JOB_ODR_STS_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Lev_No")) {
						key.setLev_No(msgKey.getKeyValue("Lev_No"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_NAME")) {
						key.setl_ODR_STS_TYP_NAME(msgKey.getKeyValue("l_ODR_STS_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_NAME")) {
						key.setl_OUTSIDE_TYP_NAME(msgKey.getKeyValue("l_OUTSIDE_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_NAME")) {
						key.setl_OD_GNR_TYP_NAME(msgKey.getKeyValue("l_OD_GNR_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP_NAME")) {
						key.setPLAN_TYP_NAME(msgKey.getKeyValue("PLAN_TYP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OrderID")) {
						key.setOrderID(msgKey.getKeyValue("OrderID"));
					}
					if(msgKeyType.containsKeyColumn("InC_ODR_STS_TYP")) {
						key.setInC_ODR_STS_TYP(msgKey.getKeyValue("InC_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP")) {
						key.setPLAN_TYP(msgKey.getKeyValue("PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(msgKey.getKeyValue("JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(msgKey.getKeyValue("l_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE")) {
						key.setl_DUE_DATE(msgKey.getKeyValue("l_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_START_DATE")) {
						key.setl_ODR_START_DATE(msgKey.getKeyValue("l_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE")) {
						key.setl_PRD_START_DATE(msgKey.getKeyValue("l_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP")) {
						key.setl_OUTSIDE_TYP(msgKey.getKeyValue("l_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_QTY")) {
						key.setl_RCV_QTY(msgKey.getKeyValue("l_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE")) {
						key.setl_RCV_CMPLT_DATE(msgKey.getKeyValue("l_RCV_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP")) {
						key.setl_OD_GNR_TYP(msgKey.getKeyValue("l_OD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP")) {
						key.setl_DM_STS_TYP(msgKey.getKeyValue("l_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY")) {
						key.setl_RLSD_PUCH_ODR_QTY(msgKey.getKeyValue("l_RLSD_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY")) {
						key.setl_WORK_IN_PROC_QTY(msgKey.getKeyValue("l_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SYS_USER")) {
						key.setSYS_USER(msgKey.getKeyValue("SYS_USER"));
					}
					if(msgKeyType.containsKeyColumn("SYS_TIME")) {
						key.setSYS_TIME(msgKey.getKeyValue("SYS_TIME"));
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
