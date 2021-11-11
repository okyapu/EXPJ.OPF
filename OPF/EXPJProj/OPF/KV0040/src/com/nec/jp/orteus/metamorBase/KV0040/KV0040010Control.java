/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0040/src/com/nec/jp/orteus/metamorBase/KV0040/KV0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0040;

import com.nec.jp.orteus.metamorBase.KV0040.*;
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
//���t����
import java.util.Calendar;
import java.text.ParseException;
import java.text.*;
import java.io.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : BC2060010Control �N���X
 * �����f�[�^�쐬�o�b�`���s
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.4 $ $Date: 2016/05/23 08:25:56 $
 *
 */
//}}user_implement_code_header

public class KV0040010Control
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
	public KV0040010Struct getListvalue(int x) { return (KV0040010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KV0040010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KV0040010Struct createStruct() { return new KV0040010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KV0040010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
    /** ��ЃR�[�h */
    protected String companyCd;
    protected String businessCtrlDate;
    protected String plantCd;
    private void setCOMPANY_CD(String companyCd) { this.companyCd = companyCd; }
    private String getCOMPANY_CD() { return this.companyCd; }

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
     * Exception���b�Z�[�W�ݒ�
     * @param �L�[����
     */
    private void setExceptionMsg(Exception e) throws ExpjException
    {
        // �G���[���b�Z�[�W�쐬
        ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
        sysLog.severe(emsg, getsysUSER_CD());                       //�v���I�G���[ �G���[���e
        ExpjException ee = new ExpjException(e, emsg);  // �G�N�Z�v�V�����𐶐�
        throw ee;
    }

    /**
     * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     */
    private void setInformationMessage(String code) {
        ExpjMessage emsg = new ExpjMessage(code);
        msgStruct.addInfo(emsg);
        sysLog.config(emsg, sysUSER_CD);
    }
    /**
     * �폜�͈�(�폜�N���x)�̎擾
     * @param strDate ��ʃf�[�^(�폜�N�Z�N���x:YYYY/MM/DD)
     * @param strTERM ��ʃf�[�^(�ۊǌ���)
     * @return  resultStr �폜�N���x(YYYY/MM/DD)
    */
    public String getPastDate(String strDate, String strTERM)
    {
            String resultStr = null;
    
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
                                // ���͂̏����ɍ��킹�ăt�H�[�}�b�g��������w��
                                // �t�H�[�}�b�g������̏ڍׂ̓��t�@�����X���Q��
        Date date = null;
        try {
                date = formatter.parse(strDate);        // �����񁨓��t
    
        } catch (ParseException x) {                    // �����G���[
                return resultStr;
        }
    
        //---------------
        // ���t�v�Z
        //---------------
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
    
        cal.add(cal.MONTH, -1 * Integer.parseInt(strTERM)); // ���t(��)�̌��Z
        Date result = cal.getTime();
    
        resultStr = formatter.format(result);               // ���t��������
    
        return resultStr;
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldo() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controldo");
			//{{user_implement_dev:<controldo>
        /** *** �o�b�`���� **** */
		try {
			// �o�b�`�����N���X��main����
			String batchProcessingTyp = null; // �o�b�`�����敪(1: ��ԃo�b�`(�����^�]) 2:
												// �}�j���A��(�����^�]�Ȃ�) )
			String userId = null; // ���[�UID
			String plantCd = null; // �H��R�[�h
			String company_cd = null; // ��ЃR�[�h
			String YearMonth_YYYYMMDD = null; // �폜�N�Z�N���x(YYYYMMDD)
			String YearMonth = null; // �폜�N�Z�N���x(YYYYMM)

			// �o�b�`�����敪
			batchProcessingTyp = "2"; // 2: �����^�]���Ȃ��i��ԃo�b�`�Ȃ��j
			// ���[�UID
			userId = getsysUSER_CD();
			// �H��R�[�h
			plantCd = this.plantCd;
			// ��ЃR�[�h
			company_cd = struct.getCOMPANY_CD();
			// �폜�N�Z�N���x
			YearMonth_YYYYMMDD = struct.getDELETE_RECKON_YM().replaceAll("/","");
			YearMonth = YearMonth_YYYYMMDD.substring(0, 6);

			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09010"); // �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
				msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				return;
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09011"); // �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
				msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				return;
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09012"); // �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)
				msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				return;
			}

			String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE", bundle); // JAVA�o�b�`�p�q�[�v�T�C�Y�擾
			if (heapSize == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09017"); // �V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)
				msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				return;
			}

			StringBuffer cmd = new StringBuffer(javaPath); // �R�}���h������
			cmd.append(" -Xms").append(heapSize).append("m");
			cmd.append(" -Xmx").append(heapSize).append("m");
			cmd.append(" -cp ");
			cmd.append(ClassPath);
			cmd.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
			cmd.append(batchPath); // D:/OrteusStudio/lib/logging.properties";
									// // �N���ݒ�
			cmd.append(" ").append("com.nec.jp.orteus.metamorBase.KV0040.KV0040B001.mainKV0040B001"); // �Ăяo����N���X
			cmd.append(" ").append(batchProcessingTyp); // �o�b�`�����敪
			cmd.append(" ").append(userId); // ���[�UID
			cmd.append(" ").append(plantCd); // �H��R�[�h
			cmd.append(" ").append(company_cd); // ��ЃR�[�h
			cmd.append(" ").append(YearMonth); // �폜�N�Z�N���x
			sysLog.info("ZZ01006", getsysUSER_CD(), cmd.toString());
			
			List buffer = new ArrayList(); // �R�}���h������
			buffer.add("-Xms"+ heapSize+"m");
			buffer.add("-Xmx"+ heapSize+"m");
			buffer.add("-cp");
			buffer.add(ClassPath);
			buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties";
									// // �N���ݒ�
			buffer.add("com.nec.jp.orteus.metamorBase.KV0040.KV0040B001.mainKV0040B001"); // �Ăяo����N���X
			buffer.add(batchProcessingTyp); // �o�b�`�����敪
			buffer.add(userId); // ���[�UID
			buffer.add(plantCd); // �H��R�[�h
			buffer.add(company_cd); // ��ЃR�[�h
			buffer.add(YearMonth); // �폜�N�Z�N���x

			// ���b�Z�[�W�o��
			setInformationMessage("ZZ09013");
			// �o�b�`�L�b�N
			Runtime runtime = Runtime.getRuntime();
//			Process p = runtime.exec(cmd.toString());
			runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			
		} catch (IOException e) {
			// �o�b�`�Ăяo�����s�̏ꍇ�A��ʃ��b�Z�[�W��\������B
			ExpjMessage emsg = new ExpjMessage("ZZ09016");
			msgStruct.addError(emsg);
			return;
		} catch (Exception e) {
			// e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ09016");
			msgStruct.addError(emsg);
			return;
		}
		/** *** �ēǍ��f�[�^�̎擾 **** */
		/** *** �폜�N���x(YYYY/MM)�̎Z�o (�폜�N�Z�N���x - �ۊǌ���) **** */
		// �N���x(YYYY/MM)�擾�ϐ�
		String DEL_YM = null;
		// �̔����v�v��
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct
				.getSALES_PLAN_TERM());
		if (DEL_YM != null) {
			struct.setSALES_PLAN_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
		// �󒍏��
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct
				.getODR_SHIP_TERM());
		if (DEL_YM != null) {
			struct.setODR_SHIP_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
		// ���̑�����
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct
				.getSALES_TERM());
		if (DEL_YM != null) {
			struct.setSALES_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
		// EDI
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct.getEDI_TERM());
		if (DEL_YM != null) {
			struct.setEDI_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
                //}}user_implement_dev:<controldo>
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controldo");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		     controlRELOAD();
                //}}user_implement_dev:<controlclear>
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			// ���Џ����擾
			List companyList = entity.mSYS_MY_COMPANY.read(conn, struct);
			if (companyList == null || companyList.size() <= 0) {
				setErrorMessage("KQ00039");
				return;
			}
			companyCd = (String)((KV0040010Struct) companyList.get(0)).getCOMPANY_CD();
			struct.setCOMPANY_CD(companyCd);

			// �Ɩ����t���擾
			List sysDateList = entity.mSYS_DATE_CTRL.read(conn, struct);
			if (sysDateList == null || sysDateList.size() <= 0) {
				setErrorMessage("KQ00026");
				return;
			}
			businessCtrlDate = (String)((KV0040010Struct)sysDateList.get(0)).getBUSINESS_CTRL_DATE().substring(0,10);
			struct.setBUSINESS_CTRL_DATE(businessCtrlDate);
			struct.setDELETE_RECKON_YM(businessCtrlDate);
			//�@�H��R�[�h���擾
			List plantCdList =  entity.mSYS_CLASS_CODE.read(conn,struct);
			if (plantCdList == null || plantCdList.size() <= 0){
				setErrorMessage("KV09025");
				return;
			}
			plantCd = (String) ((KV0040010Struct)plantCdList.get(0)).getCODE();
			struct.setPLANT_CD(plantCd);
            
			// �N���x(YYYY/MM)�擾�ϐ�
            String DEL_YM = null;
            List termList = entity.mSYS_MNT_PERIOD.read(conn,struct);
            if (termList == null || termList.size() <= 0){
            	setErrorMessage("KV09026");
            	return;
            }
            // �̔����v�v��ۑ�����
            struct.setSALES_PLAN_TERM(((KV0040010Struct)termList.get(0)).getSALES_PLAN_TERM());
            
            // �̔����v�v��ۑ�������0�̏ꍇ��1��(�����͊܂߂Ȃ�)
            if( Long.parseLong(struct.getSALES_PLAN_TERM()) <= 0 ){
                struct.setSALES_PLAN_TERM("1");
            }

            // �󒍏��ۑ�����
            struct.setODR_SHIP_TERM(((KV0040010Struct)termList.get(0)).getODR_SHIP_TERM());
            
            // �󒍏��ۑ�������0�̏ꍇ��1��(�����͊܂߂Ȃ�)
            if( Long.parseLong(struct.getODR_SHIP_TERM()) <= 0 ){
                struct.setODR_SHIP_TERM("1");
            }
            
            // ���̑�����ۑ�����
            struct.setSALES_TERM(((KV0040010Struct)termList.get(0)).getSALES_TERM());
            
            // ���̑�����ۑ�������0�̏ꍇ��1��(�����͊܂߂Ȃ�)
            if( Long.parseLong(struct.getSALES_TERM()) <= 0 ){
                struct.setSALES_TERM("1");
            }  
            // EDI�ۑ�����
            struct.setEDI_TERM(((KV0040010Struct)termList.get(0)).getEDI_TERM());
            
            // EDI�ۑ�������0�̏ꍇ��1��(�����͊܂߂Ȃ�)
            if( Long.parseLong(struct.getEDI_TERM()) <= 0 ){
                struct.setEDI_TERM("1");
            }            
            /***** �폜�N���x(YYYY/MM)�̎Z�o (�폜�N�Z�N���x - �ۊǌ���) *****/
            // �̔����v�v��
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getSALES_PLAN_TERM());
            if(DEL_YM != null){
                struct.setSALES_PLAN_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }
            // �󒍏��
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getODR_SHIP_TERM());
            if(DEL_YM != null){
                struct.setODR_SHIP_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }
            // ���̑�����
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getSALES_TERM());
            if(DEL_YM != null){
                struct.setSALES_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }   
            // EDI
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getEDI_TERM());
            if(DEL_YM != null){
                struct.setEDI_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }                
		} catch (FoundationException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		    
		    
/*
 * // �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B try{
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
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("do") ) {
				controldo();
			} else if( button.equals("clear") ) {
				controlclear();
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
//			throw new FoundationException("KV0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KV0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KV0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KV0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KV0040010Entity entity;
	protected KV0040010Struct struct;
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

		entity = new KV0040010Entity();
		struct = new KV0040010Struct();

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
	 * KV0040010�N���X�̕W���R���X�g���N�^
	 */
	public KV0040010Control() throws BusinessProcessException, FoundationException
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
				KV0040010Struct key = (KV0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DELETE_RECKON_YM") && key.getDELETE_RECKON_YM() != null) {
					msgKey.setKeyValue("DELETE_RECKON_YM", key.getDELETE_RECKON_YM());
				}
				if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM_LAST_YM") && key.getSALES_PLAN_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("SALES_PLAN_TERM_LAST_YM", key.getSALES_PLAN_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM_LAST_YM") && key.getODR_SHIP_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("ODR_SHIP_TERM_LAST_YM", key.getODR_SHIP_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("SALES_TERM_LAST_YM") && key.getSALES_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("SALES_TERM_LAST_YM", key.getSALES_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("EDI_TERM_LAST_YM") && key.getEDI_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("EDI_TERM_LAST_YM", key.getEDI_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_CTRL_DATE") && key.getBUSINESS_CTRL_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_CTRL_DATE", key.getBUSINESS_CTRL_DATE());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM") && key.getSALES_PLAN_TERM() != null) {
					msgKey.setKeyValue("SALES_PLAN_TERM", key.getSALES_PLAN_TERM());
				}
				if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM") && key.getODR_SHIP_TERM() != null) {
					msgKey.setKeyValue("ODR_SHIP_TERM", key.getODR_SHIP_TERM());
				}
				if(msgKeyType.containsKeyColumn("SALES_TERM") && key.getSALES_TERM() != null) {
					msgKey.setKeyValue("SALES_TERM", key.getSALES_TERM());
				}
				if(msgKeyType.containsKeyColumn("EDI_TERM") && key.getEDI_TERM() != null) {
					msgKey.setKeyValue("EDI_TERM", key.getEDI_TERM());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					KV0040010Struct key = new KV0040010Struct();
					if(msgKeyType.containsKeyColumn("DELETE_RECKON_YM")) {
						key.setDELETE_RECKON_YM(msgKey.getKeyValue("DELETE_RECKON_YM"));
					}
					if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM_LAST_YM")) {
						key.setSALES_PLAN_TERM_LAST_YM(msgKey.getKeyValue("SALES_PLAN_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM_LAST_YM")) {
						key.setODR_SHIP_TERM_LAST_YM(msgKey.getKeyValue("ODR_SHIP_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TERM_LAST_YM")) {
						key.setSALES_TERM_LAST_YM(msgKey.getKeyValue("SALES_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("EDI_TERM_LAST_YM")) {
						key.setEDI_TERM_LAST_YM(msgKey.getKeyValue("EDI_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_CTRL_DATE")) {
						key.setBUSINESS_CTRL_DATE(msgKey.getKeyValue("BUSINESS_CTRL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM")) {
						key.setSALES_PLAN_TERM(msgKey.getKeyValue("SALES_PLAN_TERM"));
					}
					if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM")) {
						key.setODR_SHIP_TERM(msgKey.getKeyValue("ODR_SHIP_TERM"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TERM")) {
						key.setSALES_TERM(msgKey.getKeyValue("SALES_TERM"));
					}
					if(msgKeyType.containsKeyColumn("EDI_TERM")) {
						key.setEDI_TERM(msgKey.getKeyValue("EDI_TERM"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
