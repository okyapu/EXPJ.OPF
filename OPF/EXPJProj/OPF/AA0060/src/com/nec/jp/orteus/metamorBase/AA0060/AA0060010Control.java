/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0060/src/com/nec/jp/orteus/metamorBase/AA0060/AA0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0060;

import com.nec.jp.orteus.metamorBase.AA0060.*;
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
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0060010Control
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

	/** �q�ɋ敪 1:�H���ۊǏꏊ */
	private final static String WH_PROCESS = "1";

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

	public AA0060010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	//------------------------------------------------------------------------
	// ���b�Z�[�W�֘A�̏���

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

	/**
	 * SQLException���b�Z�[�W�ݒ�
	 * @param SQLException
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		// emsg = new ExpjMessage( "ZZ01006", key );
		// sysLog.severe(emsg ,getsysUSER_CD()); //�G���[�ڍ�
		// ee.add(emsg);

		// emsg = new ExpjMessage( "ZZ01006", e.toString());
		// sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
		throw ee;
	}

	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
	}

	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W(List)
	 */
	private void setErrorMessage(String code, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
		}
	}

	// Add Anken Start 20140312 wang-tt
	/**
	 * ���[�j���O���b�Z�[�W�ݒ�
	 * @param code ���b�Z�[�W�ԍ�
	 * @param key �o�̓��b�Z�[�W
	 */
	private void setWarnMessage(String code)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn( emsg );	// ���[�j���O���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD());
	}
	// Add Anken End   20140312 wang-tt
	//------------------------------------------------------------------------
	
	/**
	 * DB�o�^/�X�V������ �ݒ���e�`�F�b�N
	 *
	 * @return  true:OK / false:NG
	 */
	private boolean isValidContents()throws FoundationException, SQLException
	{
		String keyMessage = "";
		List key = new ArrayList();

		boolean result = true;

		// �ۊǋ�`�F�b�N
		if(struct.getWH_CD().equals("") == false){
			List w = entity.mcheckWH_CD.read(conn, struct);

			// ���݂��Ȃ�
			if(w.size() <= 0){
				result = false;
				
				// �ۊǋ於�N���A
				struct.setWH_NAME("");
				
				sysLog.finest_d("update error:WH_CD[" +  struct.getWH_CD()
					+ "] not exist in M_WH", struct.getsUser_ID());
				keyMessage = "M_WH.WH_CD:" + struct.getWH_CD();
				setErrorMessage("AA01009", keyMessage);
			}
			else{
				// �ۊǋ於�̐ݒ�
				struct.setWH_NAME(((AA0060010Struct)w.get(0)).getWH_NAME());

				// �H��s��v ?
				if(getsysPLANT_CD().equals(((AA0060010Struct)w.get(0)).getw_PLANT_CD()) == false){
					result = false;
					sysLog.finest_d("insert error:strage area is in another plant.", struct.getsUser_ID());
					sysLog.finest_d("M_WH.WH_CD[" + ((AA0060010Struct)w.get(0)).getWH_CD() + "]"
						+ "M_WH.PLANT_CD[" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD() + "]  "
						+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

					key.add("M_WH.WH_CD:" + ((AA0060010Struct)w.get(0)).getWH_CD());
					key.add("M_WH.PLANT_CD:" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD());
					setErrorMessage("AA01007", key);
				} else {
					// [�ۊǋ�]."�q�ɋ敪"���P(1:�H���ۊǏꏊ)�łȂ��ꍇ�Ɩ��G���[�B
					if( !WH_PROCESS.equals(((AA0060010Struct)w.get(0)).getWH_TYP()) ){
						result = false;
						keyMessage = "M_WH.WH_CD:" + ((AA0060010Struct)w.get(0)).getWH_CD();
						setErrorMessage("AA00156", keyMessage);
					}
				}
			}
		}

		// ��֍�Ƌ�`�F�b�N
		if(struct.getSUB_WS_CD().equals("") == false){
			List w = entity.mcheckSUB_WS_EXIST.read(conn, struct);

			// ���݂��Ȃ�
			if(w.size() <= 0){
				result = false;
				
				// ��֍�Ƌ於�N���A
				struct.setSUB_WS_NAME("");
				
				sysLog.finest_d("insert errror:SUB_WS_CD[" + struct.getSUB_WS_CD()
					+ "] not exist in M_WS", struct.getsUser_ID());

				keyMessage = "M_WS.SUB_WS_CD:" + struct.getSUB_WS_CD();
				setErrorMessage("AA01010", keyMessage);
			}
			else{
				// ��֍�Ƌ於�̐ݒ�
				struct.setSUB_WS_NAME(((AA0060010Struct)w.get(0)).getSUB_WS_NAME());
				
				// �H��s��v ?
				if(getsysPLANT_CD().equals(((AA0060010Struct)w.get(0)).getw_PLANT_CD()) == false){
					result = false;
					sysLog.finest_d("insert error:sub-WS is in another plant.", struct.getsUser_ID());
					sysLog.finest_d("M_WS.WS_CD[" + ((AA0060010Struct)w.get(0)).getWS_CD() + "]"
						+ "M_WS.PLANT_CD[" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD() + "]  "
						+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

					key.add("M_WS.WS_CD:" + ((AA0060010Struct)w.get(0)).getWS_CD());
					key.add("M_WS.PLANT_CD:" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD());
					setErrorMessage("AA01011", key);
				}
			}
		}

		// ��֍�Ƌ�ƍ�Ƌ�̏d���`�F�b�N
		if(struct.getWS_CD().equals(struct.getSUB_WS_CD())){
			sysLog.finest_d("insert error:SUB_WS_CD is a duplication of WS_CD", struct.getsUser_ID());

			key.add("M_WS.SUB_WS_CD:" + struct.getSUB_WS_CD());
			key.add("M_WS.WS_CD:" + struct.getWS_CD());
			setErrorMessage("AA00081", key);
			result = false;
		}
		
		// Add Anken Start 20140307 wang-tt
		// ��Ƌ敪��01�R�[�h��null�ł͂Ȃ�
		if (struct.getWS_CLASS_01_CD() != null && !"".equals(struct.getWS_CLASS_01_CD())) {
			List classList = entity.mselectWS_CLASS_01_NAME.read(conn, struct);
			// ��Ƌ�01�R�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B
			if (classList.isEmpty()) {
				keyMessage = "M_WS_CLASS.WS_CLASS_01_CD:" + struct.getWS_CLASS_01_CD();
				setErrorMessage("AA01609", keyMessage);
			} else {
				// ��Ƌ�01��
				AA0060010Struct WSCLASS01NAMEstruct = (AA0060010Struct) classList.get(0);
				struct.setWS_CLASS_01_NAME(WSCLASS01NAMEstruct.getWS_CLASS_01_NAME());
			}
		}
		// Add Anken End   20140307 wang-tt
		return result;
	}

	//------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		String keyMessage = "";

		try {
				
			// �ǂݍ��ݏ���
			list = entity.mselect.read(conn, struct);
			
			// Add Anken Start 20140307 wang-tt
			List wsclassList = entity.mselectM_WS_CLASS.read(conn, struct);
			List classnameList = entity.mselectCLASS_NAME.read(conn, struct);
			// Add Anken End   20140307 wang-tt
			
			// ��������0���̏ꍇ
			if(list.size() <= 0){
				sysLog.finest_d("read error:WS_CD not exist in M_WS", struct.getsUser_ID());
				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ06001", keyMessage);

				// �f�[�^�����݂��Ȃ��ꍇ�̃N���A����
				String w_wsCd = struct.getWS_CD();	// �L�[���̑ޔ�
				this.struct.initialize();			// �\�����ڂ��f�t�H���g�ɖ߂�
				struct.setWS_CD(w_wsCd);			// �L�[���̐ݒ�

				if(list != null){
					list.clear();
				}
				else{
					list = new ArrayList(0);
				}

				// ������Ԃ��u������ԁv�ɐݒ�
				setReadStatus(INITIAL);
			}
			//Del Anken Start 20140415 hui-x
//			// Add Anken Start 20140307 wang-tt
//			// ��Ƌ�R�[�h �� [��Ƌ敪��] �ɑ��݂��Ȃ��ꍇ
//			else if (!(struct.getCLASS_NAME() == null || "".equals(struct.getCLASS_NAME())) && wsclassList.isEmpty()) {
//				keyMessage = "M_WS_CLASS.WS_CD:" + struct.getWS_CD();
//				setErrorMessage("AA01611", keyMessage);
//			}
//			// Add Anken End   20140307 wang-tt
			//Del Anken End 20140415 hui-x	
			else {
				AA0060010Struct w = (AA0060010Struct)this.getListvalue(0);

				// �H��R�[�h�����[�U�̍H��R�[�h�ƈ�v ?
				if(getsysPLANT_CD().equals(((AA0060010Struct)list.get(0)).getw_PLANT_CD()) == false){
					sysLog.finest_d("read error:mismatch PLANT_CD and USER PLANT_CD", struct.getsUser_ID());
					sysLog.finest_d("M_WS.WS_CD[" + ((AA0060010Struct)this.getListvalue(0)).getWS_CD() + "] "
					+ "M_WS.PLANT_CD[" + ((AA0060010Struct)getListvalue(0)).getw_PLANT_CD() + "]"
					+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

					keyMessage = "M_WS.PLANT_CD:" + ((AA0060010Struct)getListvalue(0)).getw_PLANT_CD();
					setErrorMessage("AA01005", keyMessage);

					// ������Ԃ��u������ԁv�ɐݒ�
					setReadStatus(INITIAL);
				}
				// OK
				else{
					struct.copy((AA0060010Struct)this.getListvalue(0));

					// Add Anken Start 20140307 wang-tt
					// ��Ƌ敪��01�̎擾
					if (!classnameList.isEmpty()) {
						AA0060010Struct classnameStruct = (AA0060010Struct) classnameList.get(0);
						struct.setCLASS_NAME(classnameStruct.getCLASS_NAME());
					} else {
						struct.setCLASS_NAME_FLAG("0");
					}
					
					// ��Ƌ敪��01�R�[�h
					if (!wsclassList.isEmpty()) {
						AA0060010Struct wsclassStruct = (AA0060010Struct) wsclassList.get(0);
						struct.setWS_CLASS_01_CD(wsclassStruct.getWS_CLASS_01_CD());
						struct.seth_WS_CLASS_01_CD(wsclassStruct.getWS_CLASS_01_CD());
						struct.seth_MODIFY_COUNT(wsclassStruct.geth_MODIFY_COUNT());
					}
					// ��Ƌ敪��01����
					List wsclassnameList = entity.mselectWS_CLASS_01_NAME.read(conn, struct);
					if (!wsclassnameList.isEmpty()) {
						AA0060010Struct wsclassnameStruct = (AA0060010Struct) wsclassnameList.get(0);
						struct.setWS_CLASS_01_NAME(wsclassnameStruct.getWS_CLASS_01_NAME());
					}
					// Add Anken End   20140307 wang-tt
					// ������Ԃ��u�Ǎ������v�ɐݒ�
					setReadStatus(NORMAL);
				}
			}
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			setSqlExceptionMsg(e, "");

			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------
		String keyMessage = "";

		try {
			boolean result = false;			// �`�F�b�N���ʊi�[�p

			result = entity.mcheckM_WS.check(conn, struct);
			if(result == true){
				sysLog.finest_d("insert error:WS_CD already exist.", struct.getsUser_ID());

				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ01102", keyMessage);
			}
			
			// �H��R�[�h�����O�C�����[�U�̍H��ɐݒ�
			struct.setw_PLANT_CD(getsysPLANT_CD());

			isValidContents();

			// �G���[���Ȃ��ꍇ�A�o�^����
			if(msgStruct.sizeError() == 0){

				// Add Anken Start 20140307 wang-tt
				// ��Ƌ敪�ނO�P��null�ł͂Ȃ��ꍇ
				if (struct.getCLASS_NAME() != null && !"".equals(struct.getCLASS_NAME())) {
					// ��Ƌ�R�[�h�����ł�[��Ƌ敪��]�ɑ��݂����ꍇ
					List wscdList = entity.mselectM_WS_CLASS.read(conn, struct);
					if (!wscdList.isEmpty()) {

						keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
						setErrorMessage("AA01610", keyMessage);
						return;
					} else {
						
						if(struct.getWS_CLASS_01_CD() == null || "".equals(struct.getWS_CLASS_01_CD())){
							struct.setWS_CLASS_01_NAME(null);
						}
						// [��Ƌ敪��]�̓o�^
						int nMWSCLASS = entity.minsertM_WS_CLASS.create(conn, struct);
					}

				}
				// Add Anken End   20140307 wang-tt

				// �o�^����
				int nRet = entity.minsertM_WS.create(conn, struct);
				
				// �ǂݍ��ݏ���
				controlselect();

			}
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			setSqlExceptionMsg(e, "");
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//----------------------------------------------------------------------
		String keyMessage = "";

		try {
			conn.beginTransWeb();  // Connection��AutoCommit�t���O�𐧌䂵�܂�

			boolean result = false;			// �`�F�b�N���ʊi�[�p

			// select for update�œǍ�
			List w = entity.mreadM_WS4Update.read(conn, struct);

			// ���R�[�h�͑��݂��� ?
			if(w.size() <= 0){
				sysLog.finest_d("update error:M_WS.WS_CD[" + struct.getWS_CD() + "] already deleted.", struct.getsUser_ID());

				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ06001", keyMessage);
			}
			else {
				// �X�V�J�E���gOK?
				if(struct.getMODIFY_COUNT().equals(((AA0060010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					sysLog.finest_d("update error:M_WS.WS_CD[" + struct.getWS_CD() + "] already updated.",struct.getsUser_ID());

					keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
					setErrorMessage("ZZ01105", keyMessage);
				}
				else{
					// �ݒ�l�̊m�F
					isValidContents();

					if(msgStruct.sizeError() == 0){
						// �X�V����
						int nRet = entity.mupdateM_WS.update(conn, struct);
						
						// Add Anken Start 20140307 wang-tt
						// ��Ƌ敪�ނO�P��null�ł͂Ȃ��ꍇ
						if (struct.getCLASS_NAME() != null && !"".equals(struct.getCLASS_NAME())) {
							
							List tempList = entity.mselectM_WS_CLASS.read(conn, struct);
							if (!tempList.isEmpty()) {
								
								AA0060010Struct tempStruct = (AA0060010Struct)tempList.get(0);
								if (!struct.geth_MODIFY_COUNT().equals(tempStruct.geth_MODIFY_COUNT())) {
									keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
									setErrorMessage("ZZ01105", keyMessage);
									return;
								}
								String hWSCLASS01CD = struct.geth_WS_CLASS_01_CD();
								String WSCLASS01CD =struct.getWS_CLASS_01_CD();
								// �u��Ƌ敪��01�R�[�h�v���ύX���ꂽ�ꍇ
								if (!((hWSCLASS01CD == null || "".equals(hWSCLASS01CD)) && (WSCLASS01CD == null || "".equals(WSCLASS01CD)))) {
									if (!WSCLASS01CD.equals(hWSCLASS01CD)) {
									
										if (struct.getWS_CLASS_01_CD() == null || "".equals(struct.getWS_CLASS_01_CD())) {
											struct.setWS_CLASS_01_NAME(null);
										}
										// [��Ƌ敪��]�̍X�V
										int nMWSCLASS = entity.mupdateM_WS_CLASS.update(conn, struct);
									} 
								}
							}
							//Add Anken Start 20140415 hui-x
							//[��Ƌ敪��]�����݂��Ȃ��ꍇ
							else {
								
								if(struct.getWS_CLASS_01_CD() == null || "".equals(struct.getWS_CLASS_01_CD())){
									struct.setWS_CLASS_01_NAME(null);
								}
								// [��Ƌ敪��]�̓o�^
								int nMWSCLASS = entity.minsertM_WS_CLASS.create(conn, struct);
							}
							//Add Anken End 20140415 hui-x
						}
						// Add Anken End   20140307 wang-tt
						
						// �ǂݍ��ݏ���
						controlselect();
						
					}
				}
			}
		} catch(SQLException e) {
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			setSqlExceptionMsg(e, "");
		}
		finally{
			if(msgStruct.sizeError() == 0) conn.commit();
			else conn.rollback();
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//---------------------------------------------------------------------
		String keyMessage = "";
		List key = new ArrayList();

		try {
			conn.beginTransWeb();
			
			// Add Anken Start 20140312 wang-tt
			if (struct.getCLASS_NAME() != null && !"".equals(struct.getCLASS_NAME())) {
				// �u��Ƌ�R�[�h�v ��[��Ƌ敪��]�ɑ��݂��Ȃ��ꍇ
				List wscdList = entity.mselectM_WS_CLASS.read(conn, struct);
				if (wscdList.isEmpty()) {
					
					keyMessage = "M_WS_CLASS.WS_CD:" + struct.getWS_CD();
					setWarnMessage("AA01612");
				}
			}
			// Add Anken End   20140312 wang-tt
			
			// select for update�œǍ�
			List w = entity.mreadM_WS4Update.read(conn, struct);

			// ���R�[�h�͑��݂��� ?
			if(w.size() <= 0){
				sysLog.finest_d("delete error:M_WS.WS_CD[" + struct.getWS_CD() + "] already deleted.", struct.getsUser_ID());

				keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
				setErrorMessage("ZZ06001", keyMessage);
			}
			else {
				// �X�V�J�E���gOK?
				if(struct.getMODIFY_COUNT().equals(((AA0060010Struct)w.get(0)).getMODIFY_COUNT()) == false){
					sysLog.finest_d("delete error:M_WS.WS_CD[" + struct.getWS_CD() + "] already updated.",struct.getsUser_ID());

					keyMessage = "M_WS.WS_CD:" + struct.getWS_CD();
					setErrorMessage("ZZ01105", keyMessage);
				}
				else{
					// �H��R�[�h�����[�U�̍H��R�[�h�ƈ�v ?
					if(getsysPLANT_CD().equals(((AA0060010Struct)w.get(0)).getw_PLANT_CD()) == false){
						sysLog.finest_d("delete error:mismatch M_WS.PLANT_CD and USER PALNT_CD", struct.getsUser_ID());
						sysLog.finest_d("M_WS.WS_CD[" + ((AA0060010Struct)w.get(0)).getWS_CD() + "] "
							+ "M_WS.PLANT_CD[" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD() + "]"
							+ "USER PLANT_CD[" + getsysPLANT_CD() + "]",struct.getsUser_ID());

						key.add("M_WS.WS_CD:" + ((AA0060010Struct)w.get(0)).getWS_CD());
						key.add("M_WS.PLANT_CD:" + ((AA0060010Struct)w.get(0)).getw_PLANT_CD());
						setErrorMessage("AA01005", key);
					}
					else{
						boolean result = false;			// �`�F�b�N���ʊi�[�p

						// [��Ƌ�]�}�X�^���݃`�F�b�N
						result = entity.mcheckSUB_WS_CD.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:SUB_WS_CD is used in M_WS.", struct.getsUser_ID());
							keyMessage = "M_WS.SUB_WS_CD:" + struct.getSUB_WS_CD();
							setErrorMessage("AA00082", keyMessage);
						}

						// [��ƌn��]�}�X�^���݃`�F�b�N
						result = entity.mcheckM_PROC_GRP.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in M_PROC_GRP.", struct.getsUser_ID());
							keyMessage = "M_PROC_GRP.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00083", keyMessage);
						}

						// [�i�ڕʎd�|]���݃`�F�b�N
						result = entity.mcheck_T_WORK_IN_PROC_BY_ITEM.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_WORK_IN_PROC_BY_ITEM.", struct.getsUser_ID());
							keyMessage = "T_WORK_IN_PROC_BY_ITEM.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00084", keyMessage);
						}

						// [��ƌn��ʎd�|]���݃`�F�b�N
						result = entity.mcheck_T_WORK_IN_PROC_BY_PROC.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_WORK_IN_PROC_BY_PROC.", struct.getsUser_ID());
							keyMessage = "T_WORK_IN_PROC_BY_PROC.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00085", keyMessage);
						}

						// [��Ǝ���]���݃`�F�b�N
						result = entity.mcheck_T_OPR_RSLT.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_OPR_RSLT.WS_CD.", struct.getsUser_ID());
							keyMessage = "T_OPR_RSLT.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00086", keyMessage);
						}

						// [�o��������]���݃`�F�b�N
						result = entity.mcheck_T_OUTPUT_RSLT.check(conn, struct);
						if(result == true){
							sysLog.finest_d("delete error:WS_CD is used in T_OUTPUT_RSLT.", struct.getsUser_ID());
							keyMessage = "T_OUTPUT_RSLT.WS_CD:" + struct.getWS_CD();
							setErrorMessage("AA00088", keyMessage);
						}

						// �G���[���Ȃ��ꍇ�A�폜����
						if(msgStruct.sizeError() == 0){

							// Add Anken Start 20140312 wang-tt
							if (msgStruct.sizeWarn() != 0) {
							// Add Anken Start 20140312 wang-tt

								// �폜����
								int nRet = entity.mdeleteM_WS.delete(conn, struct);
								
							// Add Anken Start 20140312 wang-tt
							} else {

								// [��Ƌ�]�̍폜
								int nRet = entity.mdeleteM_WS.delete(conn, struct);
								// [��Ƌ敪��]�̍폜
								int nMWSCLASS = entity.mdeleteM_WS_CLASS.delete(conn, struct);
							}
							// Add Anken End   20140312 wang-tt
							
							// �N���A����
							controlclear();
						}
					}
				}
			}
		} catch(SQLException e) {
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			setSqlExceptionMsg(e, "");
		}
		finally{
			if(msgStruct.sizeError() == 0){
				conn.commit();
			}else{
				conn.rollback();
			}
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		//------------------------------------------------------------------
		if(list != null){
			list.clear();
		}
		else{
			list = new ArrayList(0);
		}
		this.struct.initialize();
		
		// Add Anken Start 20140314 wang-tt
		controlRELOAD();
		// Add Anken End   20140314 wang-tt

		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
	    //------------------------------------------------------------------
		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
	    //------------------------------------------------------------------
		// Add Anken Start 20140313 wang-tt
		try{
			List tempList = entity.mselectCLASS_NAME.read(conn, struct);
			if(!tempList.isEmpty()){
				AA0060010Struct tempStruct = (AA0060010Struct) tempList.get(0);
				struct.setCLASS_NAME(tempStruct.getCLASS_NAME());
			} else {
				struct.setCLASS_NAME_FLAG("0");
			}
		}
		catch (SQLException e) {
			setSqlExceptionMsg(e, "");
		}
		// Add Anken End   20140313 wang-tt		
        setReadStatus(INITIAL);
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0060");
		logger.entering("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		} catch(AlarmMessageException ame) {
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0060010Entity entity;
	protected AA0060010Struct struct;
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

		entity = new AA0060010Entity();
		struct = new AA0060010Struct();

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
	 * AA0060010�N���X�̕W���R���X�g���N�^
	 */
	public AA0060010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AA0060010Struct key = (AA0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CLASS_NAME_FLAG") && key.getCLASS_NAME_FLAG() != null) {
					msgKey.setKeyValue("CLASS_NAME_FLAG", key.getCLASS_NAME_FLAG());
				}
				if(msgKeyType.containsKeyColumn("h_WS_CLASS_01_CD") && key.geth_WS_CLASS_01_CD() != null) {
					msgKey.setKeyValue("h_WS_CLASS_01_CD", key.geth_WS_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("h_WS_CD") && key.geth_WS_CD() != null) {
					msgKey.setKeyValue("h_WS_CD", key.geth_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_TEL") && key.getWS_TEL() != null) {
					msgKey.setKeyValue("WS_TEL", key.getWS_TEL());
				}
				if(msgKeyType.containsKeyColumn("WS_PERSON") && key.getWS_PERSON() != null) {
					msgKey.setKeyValue("WS_PERSON", key.getWS_PERSON());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_WS_CD") && key.getSUB_WS_CD() != null) {
					msgKey.setKeyValue("SUB_WS_CD", key.getSUB_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("SUB_WS_NAME") && key.getSUB_WS_NAME() != null) {
					msgKey.setKeyValue("SUB_WS_NAME", key.getSUB_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME") && key.getCLASS_NAME() != null) {
					msgKey.setKeyValue("CLASS_NAME", key.getCLASS_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CLASS_01_CD") && key.getWS_CLASS_01_CD() != null) {
					msgKey.setKeyValue("WS_CLASS_01_CD", key.getWS_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WS_CLASS_01_NAME") && key.getWS_CLASS_01_NAME() != null) {
					msgKey.setKeyValue("WS_CLASS_01_NAME", key.getWS_CLASS_01_NAME());
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
					AA0060010Struct key = new AA0060010Struct();
					if(msgKeyType.containsKeyColumn("CLASS_NAME_FLAG")) {
						key.setCLASS_NAME_FLAG(msgKey.getKeyValue("CLASS_NAME_FLAG"));
					}
					if(msgKeyType.containsKeyColumn("h_WS_CLASS_01_CD")) {
						key.seth_WS_CLASS_01_CD(msgKey.getKeyValue("h_WS_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_WS_CD")) {
						key.seth_WS_CD(msgKey.getKeyValue("h_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_TEL")) {
						key.setWS_TEL(msgKey.getKeyValue("WS_TEL"));
					}
					if(msgKeyType.containsKeyColumn("WS_PERSON")) {
						key.setWS_PERSON(msgKey.getKeyValue("WS_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_WS_CD")) {
						key.setSUB_WS_CD(msgKey.getKeyValue("SUB_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(new Integer(msgKey.getKeyValue("MODIFY_COUNT")));
					}
					if(msgKeyType.containsKeyColumn("SUB_WS_NAME")) {
						key.setSUB_WS_NAME(msgKey.getKeyValue("SUB_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME")) {
						key.setCLASS_NAME(msgKey.getKeyValue("CLASS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CLASS_01_CD")) {
						key.setWS_CLASS_01_CD(msgKey.getKeyValue("WS_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WS_CLASS_01_NAME")) {
						key.setWS_CLASS_01_NAME(msgKey.getKeyValue("WS_CLASS_01_NAME"));
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
