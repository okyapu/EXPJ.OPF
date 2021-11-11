/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0050/src/com/nec/jp/orteus/metamorBase/KP0050/KP0050B001/CtrlMain.java,v $
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
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 *                     ,EXPLANNER/J�p�ɉ���
 * 3.0.0.0 (2003/12/10),�������ʂ𗘗p�\�ɂ���C��
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.KP0050.KP0050B001;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;

//{{user_implement_dev:import
// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//-----------------------------------------------------------------------------
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.util.*;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.15 $ $Date: 2015/12/03 08:53:58 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medKP0050B001 m_med=null;

	/**
	 * control�N���X �C���X�^���X
	 */
	protected interControl m_control=null;

	/**
	 * �R���_�N�^�N���X�C���X�^���X
	 */
	protected BatchAppConductor m_conductor;

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * �������ʃX�e�[�^�X
	 */
	public static int m_status = 0;
	public static int getExecuteStatus() { return m_status; }
	public static void setExecuteStatus(int status) { m_status = status; }

	//////////////////////////////

	/**
	 * CtrlMain�N���X�̃R���X�g���N�^
	 *
		 */
	public CtrlMain(medKP0050B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code

	//////////////////////////////
	// �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���

	/** �N������ */
	private String strBusinessName = null;
	private String strUserId = null;
	private String strPlantCd = null;
	private String strMsgPlantCd = null;
	private String strPlanTyp = null;

	/** DB�R�l�N�V���� */
	private IDbConnection conn = null;
	private String m_vMSG = "";				//���O�t�@�C���p���b�Z�[�W

	// �o�b�`�N���X���ʃG���[�����p
	private String errCode = null;		     // �o�b�`�G���[�R�[�h
	private String errMsg = null;		     // �o�b�`�G���[���b�Z�[�W
	private String errNote = "";             // �o�b�`�G���[���b�Z�[�W(���l) �K�v�ɉ����Ďg�p�B

	// �H��R�[�h�Ƃ���ɑ΂��郍�b�N�����L�[�̔z���ێ����郊�X�g
	private ArrayList plantList = new ArrayList();

	/** �Ɩ����b�N�N���X */
	private BusinessLock lock = null;
	
	/** ���b�N���s�����b�N�L�[ */
	private static final int LOCK_FAILD = -1;	
	
	/**
	* ���[�O�t�@�C���̃��b�Z�[�W�̎擾
	*
	* @param String strMsgCd		�L�[:SYS�R���g���[���R�[�h
	*
	*/
	private boolean getSysMsg(String strMsgCd) throws BatchAppException{
		boolean rv = true;
		try{
			//�L�[�ݒ�       
			m_med.setsysBusinessIN_MEG_CD(strMsgCd);
			if(m_med.getreadSysBusinessMessage().read() != SUCCESS){
				rv = false;
			}else{
				if(m_med.getreadSysBusinessMessage().next()){
					this.m_vMSG = m_med.getsysBusinessMEG();
				}else{
					throw new Exception();
				}
			}
		}catch (Exception e) {
			rv=false;
		}finally{
			return rv;
		}
	}

	/**
	* �G���[/�x�����b�Z�[�W���O�o�͏���(���ߍ��݂Ȃ�)
	*
	* @param String ���b�Z�[�W�R�[�h
	*/
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}

	/**
	* �G���[/�x�����b�Z�[�W���O�o�͏���(IF���Ǘ��ԍ����ߍ���)
	*
	* @param String ���b�Z�[�W�R�[�h
	* @param String IF���Ǘ��ԍ�
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}

	/**
	* �G���[/�x�����b�Z�[�W���O�o�͕⏕���(���ߍ���)
	*
	* @param String �⏕���
	* @param String �⏕���l
	*/
	private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException{
		AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
		CoreTools.write(am.getMessage());
	}

	/**
	* �Ɩ����b�N���s���܂�
	* @param strBusinessName �Ɩ���
	* @param strUserId ���[�U�R�[�h
	* @param strMsgPlantCd �H��R�[�h
	* @return ���b�N�L�����Z���L�[
	* @throws FoundationException
	*/
	private int businessLock(String strBusinessName,String strUserId,String strMsgPlantCd) throws FoundationException {
		lock = new BusinessLock(conn, strUserId, strMsgPlantCd);
		// �����L�[�̎擾
		int lockCancelKey = lock.doLock(m_med.getProgname());
		conn.commit();
		return lockCancelKey;
	}
		
	/**
	* �Ɩ����b�N���������܂�
	* @param lockCancelKey ���b�N�L�����Z���L�[
	* @return ���b�N����������true�A���s��false
	* @throws FoundationException
	*/
	private boolean businessUnLock(int lockCancelKey) throws FoundationException {
		if (lockCancelKey == LOCK_FAILD) {
			return true;
		}
		boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
		conn.commit();
		return result;
	}
		
	/**
	* metamorBase�Ɩ����b�Z�[�W�̏o�͂��s���B
	* metamorBase�Ɩ����b�Z�[�W�̏o�͂ɂ́A�Ɩ����A���[�U�R�[�h�A�H��R�[�h��K�v�Ƃ���
	*
	* @param conn DB�R�l�N�V����
	* @param businessName �Ɩ���
	* @param userId ���[�U�R�[�h
	* @param plantCd �H��R�[�h
	* @return �Ȃ�
	*/
	protected void outBusinessMessage(IDbConnection conn, String businessName, String userId, String plantCd) {
		// ����̋Ɩ��G���[�R�[�h���Z�b�g����Ă��Ȃ��ꍇ
		if (errCode == null) {
			errCode = "ZZ09009";  // �o�b�`�������J�n�ł��܂���ł����B
		}

		// �Ɩ����b�Z�[�W�̏���
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		businessMsgAcc.init(conn);
		businessMsg.setBusinessOperatingName(businessName);
		businessMsg.setUser(userId);
		businessMsg.setPlantCode(plantCd);
		businessMsg.setMessageCode(errCode);
		businessMsg.setData(errNote);
		try {
			Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
			businessMsg.setLogCode(logCd.getNo());
			businessMsgAcc.add(businessMsg);
			// �Ɩ����b�Z�[�W�́A�Ɩ��v���O�������ŃR�l�N�V�������R�~�b�g����
			// �K�v������B�̔����v�v��h�^�e�́A�Ɩ��v���O�����Ńg�����U�N�V������
			// �ӎ�����K�v���Ȃ����߁A���C�������Ɠ����R�l�N�V�����ɑ΂��s�x�R�~�b�g
			// ����B
			conn.commit();
		} catch (SQLException e) {
			errCode = "AC00999"; // SQL���s���G���[�B
			setBatchErrorMessage(e);
			e.printStackTrace();
		} catch (Exception e) {
			errCode = "KP05002";  // ���̑��@�d��������
			setBatchErrorMessage(e);
			e.printStackTrace();
		}
	}

	/**
	* �o�b�`�N���X���ʃG���[�����̃G���[���b�Z�[�W�������o�ϐ��ɃZ�b�g����B
	* �o�b�`�N���X���ʃG���[�����́A�d�l��A�����ɃG���[�R�[�h�ł͂Ȃ��G���[���b�Z�[�W�������K�v�Ƃ���B
	* ����āA�Ɩ��v���O�������ŃG���[�R�[�h���烁�b�Z�[�W���쐬����K�v������B
	*
	* @param e Exception�I�u�W�F�N�g
	* @return �Ȃ�
	*/
	protected void setBatchErrorMessage(Exception e) {
		// ����̃o�b�`�G���[�R�[�h���Z�b�g����Ă��Ȃ��ꍇ
		if (errCode == null) {
			errCode = "KP05002";  // ���̑��@�d��������
		}

		// �o�b�`�G���[���b�Z�[�W�̍쐬
		if (errMsg == null) {
			//AlarmMessage msg = new AlarmMessage(errCode);
			//errMsg = "[" + errCode + "]" + msg.getMessage();
		}
		// Exception�I�u�W�F�N�g�Ƀ��b�Z�[�W������ꍇ�A�t������B
		if (e.getMessage() != null) {
			errMsg = errMsg + " " + e.getMessage();
		}
	}

	protected String getBatchErrorMessage() {
		return errMsg;
	}
		
	/**
	* ���ʕ��iWorkCalendar��p���ĉғ����x�[�X�œ����v�Z���s���B
	* �v�Z�ɂ̓��[�U�R�[�h�A�Ɩ��R�[�h�A�H��R�[�h�A�Ώۓ��t�A���Z���A�O�|���t���O���K�v�Ƃ���B
	*
	* @param Plant_Cd �H��R�[�h
	* @param date     �Ώۓ��t
	* @param margin   ���Z��
	* @param Item_Cd  �i�ڔԍ�
	* @return �v�Z����
	*/
		private Date calcdate(String Plant_Cd,  String Item_Cd, Date date, int margin)throws Exception{
			try{
				WorkCalendar wkd = new WorkCalendar(
												conn,
												strUserId,				//���[�U�R�[�h
												strBusinessName,			//�Ɩ��R�[�h
												Plant_Cd,					//�H��R�[�h
												Item_Cd,				//�i�ڔԍ�
												date,					//�Ώۓ��t
												margin,		//���Z��
												true					//�O�|���t���O
												);
				return wkd.calcDate();
			}catch(Exception e){
				throw new Exception();
			}
		}
	/**
	* ���ʕ��iWorkCalendar��p���ĉғ���������s���B
	* �v�Z�ɂ̓��[�U�R�[�h�A�Ɩ��R�[�h�A�H��R�[�h�A�Ώۓ��t���K�v�Ƃ���B
	*
	* @param Plant_Cd �H��R�[�h
	* @param date     �Ώۓ��t
	* @param Item_Cd  �i�ڔԍ�
	* @return �v�Z����
	*/
		private boolean isworkdate(String Plant_Cd,  String Item_Cd, Date date) throws Exception{
			try{
				WorkCalendar wc = new WorkCalendar(
												conn,
												strUserId,				//���[�U�R�[�h
												strBusinessName,			//�Ɩ��R�[�h
												Plant_Cd,					//�H��R�[�h
												Item_Cd,					//�i�ڔԍ�
												date					//�Ώۓ��t
												);
				return wc.isWorkDate();
			}catch(Exception e){
				throw new Exception();
			}
		}
		
	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
		 */
	public CtrlMain(medKP0050B001 med) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_med = med;
		m_control = new interControl(med);

		// todo: �C���X�^���X���������Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
		 */
	public void finalize()
	{
		// �e�����o�ϐ��̏�����
		m_med = null;
		m_control = null;
		objMessage = null;

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	//////////////////////////////

	/**
	 * main�F ���[�U��`�p���\�b�h�ł�<br>
	 * <<�������L�q���Ă�������>>
	 *
	 * @return <<�������L�q���Ă�������>>
	 * @exception <<�������L�q���Ă�������>>
	 */
	public int main() throws BatchAppException
	{
		
		// �̔����v�c�W�v�o�b�`�Ɠ�����I/F�o�b�`�̉^�s�t���O
		boolean BatchRunFlag = true;
		
		try{
			// �����󂯎��
			String args[] = m_med.getArgs();
			if (args.length < 5 || args.length > 6) {
				throw new Exception();
			}
			
			strUserId = args[1];		// ���[�UID
			strMsgPlantCd = args[2];	// ���[�U�����H��
			strBusinessName = args[3];	// �Ɩ�ID
			strPlanTyp = args[4];		// �̔����v�o�^�t���O
			if (args.length == 5) {
				strPlantCd = "%";		// �H��R�[�h
			} else {
				strPlantCd = args[5];	// �H��R�[�h
			}
			
			//�p�����[�^�m�F
			/*System.out.println(">>>PRG_NAM:" + strBusinessName);	// �Ɩ���
			System.out.println(">>>USER_ID:" + strUserId);	// ���[�U�h�c
			System.out.println(">>>USER_PLNT_CD:" + strMsgPlantCd);	// ���[�U�H��R�[�h
			System.out.println(">>>PLANT_CD:" + strPlantCd);	// �H��R�[�h*/
			
			conn = m_conductor.m_transactionConn;
			
			//�̔����v�v��I/F�o�b�`�̊J�n���b�Z�[�W�o�^
			//�R�l�N�V������n���āA�Ɩ����b�Z�[�W����
			String strMsgCd = "KP05001";
			if(this.getSysMsg(strMsgCd)){
				writeLogMessage(strMsgCd);
			}else{
				throw new Exception();
			}
			errCode = "KP05001";
			errNote = "(SBM0593)<< �̔����v�v��h�^�e�o�b�`�����J�n >>";
			outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			CoreTools.write("\n(SBM1088)******>>>> �̔����v�v��h�^�e�X�^�[�g <<<******");
			
			//=======================================
			// �ΏۍH��R�[�h�擾
			//=======================================
			m_med.setinPLANT_CD(strPlantCd);
			if(m_med.getreadM_PLANT().read() != SUCCESS){
				errCode = "KP05002";
				errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				this.writeLogMessage(errCode);
				throw new Exception();
			}
			if(m_med.getreadM_PLANT().next() == false){
				//�ΏۍH��R�[�h�擾���s
				errCode = "KV03001";
				errNote = "(SBM0595)<< �w�肵���H��R�[�h�͖��o�^�ł� >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				this.writeLogMessage(errCode);
				throw new Exception();
			}
			
			// �o�ׂk�^�s�̐ݒ�
			String ShipLT = null;
			if(m_med.getreadSYS_CLASS_CODE().read() != SUCCESS){
				errCode = "KP05002";
				errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				this.writeLogMessage(errCode);
				throw new Exception();
			}else{
				m_med.getreadSYS_CLASS_CODE().next();
				ShipLT = m_med.getCLASS_CD();
			}
			
			plantList.clear();
			do {
				// �H��R�[�h�ƃ��b�N���i�[����z���p��
				Object plantData[] = new Object[3];
				plantData[0] = m_med.getPLANT_CD(); // �H��R�[�h���Z�b�g
				plantData[1] = null;                // ���b�N�I�u�W�F�N�g�i�[�p
				plantData[2] = null;                // ���b�N�����L�[�i�[�p

				// ���X�g�ɔz���ێ�
				plantList.add(plantData);
			} while (m_med.getreadM_PLANT().next() == true);
			
			for (Iterator it = plantList.iterator(); it.hasNext(); ) {
				// ���b�N�����L�[
				int lockCancelKey = LOCK_FAILD;
				try{
					// �e�H��R�[�h�̎擾
					Object plantData[] = (Object[]) it.next();
					String plantCd = plantData[0].toString();
					m_med.setPLANT_CD(plantCd);
					
					//=======================================
					// �Ɩ����b�N
					//=======================================
					lockCancelKey = businessLock(strBusinessName,strUserId,
							plantCd);
					if (lockCancelKey == LOCK_FAILD) {
						//this.writeLogMessage("ZZ01008");
						// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
						errCode = "ZZ01008";
						errNote = "(SBM0596)<< �Ɩ����b�N�̊J�n�Ɏ��s���܂����B >>";
						outBusinessMessage(conn, strBusinessName, strUserId, 
								strMsgPlantCd);
						CoreTools.write("(SBM0596)�Ɩ����b�N�̊J�n�Ɏ��s���܂����B");	
						return BREAK;
					}
					
					if(BatchRunFlag == true){
						//<< �̔����v�c�W�v�o�b�`�����J�n >>���̌�<< �����E�󒍂h�^�e�o�b�`�����J�n >>
						//=======================================
						//<< �̔����v�c�W�v�o�b�`�����J�n >>
						//=======================================
						
						//---------------����---------------
						ResourceBundle bundle = SystemConfig.getBundle();
						String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
						if(javaPath == null){
							//�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�i�u�l�p�X)
							errCode = "ZZ09010";
							errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
							outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
							this.writeLogMessage(errCode);
							throw new Exception();
						}
						String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
						if(ClassPath == null){
							//�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�N���X�p�X)
							errCode = "ZZ09012";
							errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
							outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
							this.writeLogMessage(errCode);
							throw new Exception();
						}
						String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
						if(batchPath == null){
							//"�V�X�e������l�t�@�C������̏��擾�Ɏ��s���܂���(�o�b�`�N���ݒ�)"
							errCode = "ZZ09011";
							errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
							outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
							this.writeLogMessage(errCode);
							throw new Exception();
						}
							
						// �Œ�l���Z�b�g
						String batchProcessingTyp = "2";		  // ��ʂ��N���F2�^�����^�]�F1
						String ProgID = "KP0040B003";		  // �ďo��̋Ɩ�ID
						String userID = strUserId; // ���O�C�����[�UID
					
						//---------------����---------------
						
						// �S�Ă̒�`��񂪎擾�ł��Ă���΁A���������s����B
						if ((javaPath != null) && (ClassPath != null) && (batchPath != null)) {
//							String cmd1 = "";
//							cmd1 = cmd1 + javaPath;    // �i�u�l
//							cmd1 = cmd1 + " -cp ";
//							cmd1 = cmd1 + ClassPath;   // Java ClassPath
//							cmd1 = cmd1 + " -Dcom.nec.jp.orteus.util.logging.config.file=";
//							cmd1 = cmd1 + batchPath;   // D:/OrteusStudio/lib/logging.properties"; // �N���ݒ�
//							cmd1 = cmd1 + " " + "com.nec.jp.orteus.metamorBase.KP0040.KP0040B003.mainKP0040B003"; // �Ăяo����N���X
//							cmd1 = cmd1 + " " + ProgID;      // �Ɩ�ID
//							cmd1 = cmd1 + " " + userID;     // ���[�UID
//							cmd1 = cmd1 + " " + strMsgPlantCd;// ���b�Z�[�W�o�^�H��
							
							List buffer1 = new ArrayList();
							buffer1.add(javaPath);    // �i�u�l
							buffer1.add("-cp");
							buffer1.add(ClassPath);   // Java ClassPath
							buffer1.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties"; // �N���ݒ�
							buffer1.add("com.nec.jp.orteus.metamorBase.KP0040.KP0040B003.mainKP0040B003"); // �Ăяo����N���X
							buffer1.add(ProgID);      // �Ɩ�ID
							buffer1.add(userID);     // ���[�UID
							buffer1.add(strMsgPlantCd);// ���b�Z�[�W�o�^�H��
							
							//System.out.println(cmd1);
							Runtime runtime1 = Runtime.getRuntime();
//							Process q = runtime1.exec(cmd1);
							Process q = runtime1.exec((String[])buffer1.toArray(new String[buffer1.size()]));
							
							int rt = q.waitFor();
							
							if(q.exitValue() != 0) {
								errCode = "KP04302";
								errNote = "";
								outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
								this.writeLogMessage(errCode);
								throw new Exception();
							}
						
							//-----------------------------------------------------------------
							//=======================================
							//<< �����E�󒍂h�^�e�o�b�`�����J�n >>
							//=======================================
								
							// �Œ�l���Z�b�g
							batchProcessingTyp = "2";		  // ��ʂ��N���F2�^�����^�]�F1
							ProgID = "KP0060B001";		  // �ďo��̋Ɩ�ID
							userID = strUserId; // ���O�C�����[�UID
						
							// �S�Ă̒�`��񂪎擾�ł��Ă���΁A���������s����B
							List buffer2 = new ArrayList();
							buffer2.add(javaPath);    // �i�u�l
							buffer2.add("-cp");
							buffer2.add(ClassPath);   // Java ClassPath
							buffer2.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties"; // �N���ݒ�
							buffer2.add("com.nec.jp.orteus.metamorBase.KP0060.KP0060B001.mainKP0060B001"); // �Ăяo����N���X
							buffer2.add(batchProcessingTyp);
							buffer2.add(userID);     // ���[�UID
							buffer2.add(strMsgPlantCd);// ���[�U�����H��
							buffer2.add(ProgID);      // �Ɩ�ID
							buffer2.add(strPlantCd);      // �H��R�[�h
							
							//System.out.println(cmd2);
							Runtime runtime2 = Runtime.getRuntime();
//							Process r = runtime2.exec(cmd2);
							Process r = runtime2.exec((String[])buffer2.toArray(new String[buffer2.size()]));
							
							rt = r.waitFor();
							
							if(r.exitValue() != 0) {
								errCode = "KP06002";
								errNote = "";
								outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
								this.writeLogMessage(errCode);
								throw new Exception();
							}
						}
						BatchRunFlag = false;
					}
					//-----------------------------------------------------------------
					
					m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
					m_med.setUsername(strUserId);
					
					//=======================================
					// ���Џ��R�[�h
					//=======================================
					if(m_med.getreadSYS_MY_COMPANY().read() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					if(m_med.getreadSYS_MY_COMPANY().next() == false){
						//���Џ��R�[�h�擾���s
						errCode = "KQ00039";
						errNote = "(SBM0597)<< ���Џ��̎擾�Ɏ��s���܂��� >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					// ���Џ��
					CoreTools.write("BATCH COMPANY_CD=" + m_med.getCOMPANY_CD());
					//System.out.println("���Џ��:"+m_med.getCOMPANY_CD());
					
					// �H����
					CoreTools.write("BATCH PLANT_CD=" + plantCd);
					
		
					//=======================================
					// [���v��]����Ώۂ̃��R�[�h���폜����
					//=======================================
					if(m_med.getdeleteT_OD().delete() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					
					//=======================================
					// [�̔����v�v��]�̑Ώۃ��R�[�h�𒊏o����
					//=======================================
					if(m_med.getreadT_SALES_PLAN().read() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}
					
					//=======================================
					// [�V�X�e���p�����[�^]�̎捞����
					//=======================================
					String KP_ADD_MONTH =null;
					String KP_SUB_MONTH =null;
					if(m_med.getreadKP_ADD_MONTH().read() != SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}else{
						m_med.getreadKP_ADD_MONTH().next();
						KP_ADD_MONTH = m_med.getKP_ADD_MONTH();
					}
					if( m_med.getreadKP_SUB_MONTH().read()!= SUCCESS){
						errCode = "KP05002";
						errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						this.writeLogMessage(errCode);
						throw new Exception();
					}else{
						m_med.getreadKP_SUB_MONTH().next();
						KP_SUB_MONTH = m_med.getKP_SUB_MONTH();
					}
					//System.out.println("�����捞����: "+KP_ADD_MONTH+" "+"�ߋ��捞����: "+KP_SUB_MONTH);
					
					//=======================================
					// �捞�J�n���A�捞�I�����̎Z�o
					//=======================================
					
					Calendar cal = Calendar.getInstance();
					Date tempDate = new Date();
					String KP_STR_DATE = DateTool.subtractMonth(m_med.getBUSINESS_OPR_DATE(),KP_SUB_MONTH);
					cal.setTime(Converter.strToDate(KP_STR_DATE ,"yyyy/MM/dd"));
					cal.set(cal.DAY_OF_MONTH, 1);
					KP_STR_DATE = Converter.dateToStr(cal.getTime() ,"yyyy/MM/dd");
					
					String KP_END_DATE = DateTool.addMonth(m_med.getBUSINESS_OPR_DATE(),KP_ADD_MONTH);
					cal.setTime(Converter.strToDate(KP_END_DATE ,"yyyy/MM/dd"));
					cal.set(cal.DAY_OF_MONTH, cal.getActualMaximum(cal.DAY_OF_MONTH));
					KP_END_DATE = Converter.dateToStr(cal.getTime() ,"yyyy/MM/dd");
					
					while (m_med.getreadT_SALES_PLAN().next() == true) {
					/*System.out.println("�v��J�n��:"+m_med.getPLN_STR_DATE());
					System.out.println("�v��I����:"+m_med.getPLN_END_DATE());
					System.out.println("�v��c����:"+m_med.getPLN_QTY_REMAIN());*/
						
						//�v�搔�c�ʂ�0�Ŗ����Ƃ��݈̂ȉ��̏������s���B
						if(m_med.getPLN_QTY_REMAIN().doubleValue() >= 0){
								
							//�捞���Ԃɑ����邩�`�F�b�N
							if ((DateTool.compareYMD(m_med.getPLN_STR_DATE(), KP_STR_DATE)) >= 0 
								&& (DateTool.compareYMD(m_med.getPLN_STR_DATE(), KP_END_DATE)) <= 0){
								
								//=======================================
								// �v���[���A�f�}���h���̐ݒ�
								//=======================================
								boolean rez_typ = false;
								if((strPlanTyp).equals("1")){
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_STR_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									
									//System.out.println("�v���[�� :"+tempDate+" �o�׏���LT:"+ShipLT+"�^������;"+m_med.getTRANSPORT_LT());
									m_med.setDUE_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
									m_med.setDM_QTY(m_med.getPLN_QTY_REMAIN());
									rez_typ =true;
								}else if((strPlanTyp).equals("2")){
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_END_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									
									//System.out.println("�v���[�� :"+tempDate+" �o�׏���LT:"+ShipLT+"�^������;"+m_med.getTRANSPORT_LT());
									m_med.setDUE_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
									m_med.setDM_QTY(m_med.getPLN_QTY_REMAIN());
									rez_typ =true;
								}else{
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_STR_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									m_med.setPLN_STR_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
									if (tempDate == null) {
										errCode = "KP05002";
										errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
										outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
										this.writeLogMessage(errCode);
										throw new Exception();
									}
									tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
															Converter.strToDate(m_med.getPLN_END_DATE(),"yyyy/MM/dd"),
															-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
															);
									//System.out.println("�v���[�� :"+tempDate+" �o�׏���LT:"+ShipLT+"�^������;"+m_med.getTRANSPORT_LT());
									m_med.setPLN_END_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
								}
								
								if (tempDate == null) {
									errCode = "KP05002";
									errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
									outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
									this.writeLogMessage(errCode);
									throw new Exception();
								}
								
								//=======================================
								// [���v��]�̍X�V
								//=======================================
								
								String inOD_NO = null;
								
								//�ǉ��Ώۂ̃��R�[�h��ǉ�����(�����ɓo�^�A�����ɓo�^�I�����j
								if(rez_typ){
									// �I�[�_�f�}���h�ԍ��̔ԃN���X�I�u�W�F�N�g����
									Numbering MyNo = new Numbering(conn, Numbering.ODNO, strUserId, strBusinessName, m_med.getWH_PLANT_CD());
									inOD_NO = MyNo.getNo();
									if (inOD_NO == null || inOD_NO.trim().length() == 0) {
										errCode = "KP05002";
										errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
										outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
										this.writeLogMessage(errCode);
										throw new Exception();
									}
									m_med.setinOD_NO(inOD_NO);
									
									/*System.out.println("***[���v��]�ɒǉ�����郌�R�[�h�̒l***");
									System.out.println("OD_NO:"+m_med.getinOD_NO()+"\n PLANT_CD:"+m_med.getinPLANT_CD()+"\n ITEM_CD:"+m_med.getITEM_CD());
									System.out.println("DUE_DATE:"+m_med.getDUE_DATE()+"\n PRD_DUE_DATE:"+m_med.getDUE_DATE()+"\n DM_QTY:"+m_med.getDM_QTY());
									System.out.println("MRP_ODR_TYP:"+m_med.getMRP_ODR_TYP()+" OUTSIDE_TYP:"+m_med.getOUTSIDE_TYP()+"\n ISSUE_TYP:"+m_med.getISSUE_TYP());
									System.out.println("ODR_LT:"+m_med.getODR_LT()+"\n FIXED_LT:"+m_med.getFIXED_LT()+"\n PROP_LT:"+m_med.getPROP_LT());
									System.out.println("SAFETY_LT:"+m_med.getSAFETY_LT()+"\n ISSUE_LT:"+m_med.getISSUE_LT()+"\n PROP_LOT_SIZE:"+m_med.getPROP_LOT_SIZE());
									System.out.println("OD_LEVEL_NO:"+m_med.getHIGH_LEVEL_NO()+"\n ITEM_SPOIL:"+m_med.getITEM_SPOIL()+"\n");*/
									
									if(m_med.getinsertT_OD().create() != SUCCESS){
										errCode = "KP05002";
										errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
										outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
										this.writeLogMessage(errCode);
										throw new Exception();
									}
								}else{
									//���U���ēo�^�I����
									int basis_QTY =0;
									double rest_QTY =0;
									double PLN_QTY_REMAIN =m_med.getPLN_QTY_REMAIN().doubleValue();
									int TERM_DAYS =1;
									m_med.setCAL_DATE(m_med.getPLN_STR_DATE());
									
									//�ғ������l�����Ċ��ԓ������Čv�Z
									m_med.getselectWORKDAYCOUNT().read();
									if(m_med.getselectWORKDAYCOUNT().next()) {
										TERM_DAYS = Integer.parseInt(m_med.getWORK_DAY_COUNT());
									}
									
									//���ԓ�������Ɍv�搔�c�ʂ𕪎U���ď��v�ʂɓo�^����
									basis_QTY = (int)(PLN_QTY_REMAIN/TERM_DAYS);
									rest_QTY = PLN_QTY_REMAIN%TERM_DAYS;
									while(PLN_QTY_REMAIN >0) {
										if(rest_QTY >= 1){
											m_med.setDM_QTY(new Double(basis_QTY + 1));
											PLN_QTY_REMAIN -= basis_QTY + 1;
											rest_QTY--;
											
										}else if(rest_QTY > 0 && rest_QTY <1){
											m_med.setDM_QTY(new Double(basis_QTY+rest_QTY));
											PLN_QTY_REMAIN -= basis_QTY+rest_QTY;
											rest_QTY--;
											
										}else if(rest_QTY <=0){
											m_med.setDM_QTY(new Double(basis_QTY));
											PLN_QTY_REMAIN -= basis_QTY;
											rest_QTY--;
											
										}
										// �ғ������擾�A�v���[����ݒ�
										m_med.getselectWORK_DAY().read();
										if(m_med.getselectWORK_DAY().next()) {
											m_med.setDUE_DATE(m_med.getCAL_DATE());
										}
										
										m_med.setCAL_DATE(DateTool.addDay(m_med.getCAL_DATE(), "1"));
										Numbering MyNo = new Numbering(conn, Numbering.ODNO, strUserId, strBusinessName, m_med.getWH_PLANT_CD());
										inOD_NO = MyNo.getNo();
										if (inOD_NO == null || inOD_NO.trim().length() == 0) {
											errCode = "KP05002";
											errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
											outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
											this.writeLogMessage(errCode);
											throw new Exception();
										}
										m_med.setinOD_NO(inOD_NO);
										/*System.out.println("***[���v��]�ɒǉ�����郌�R�[�h�̒l***");
										System.out.println("OD_NO:"+m_med.getinOD_NO()+" PLANT_CD:"+m_med.getPLANT_CD()+" ITEM_CD:"+m_med.getITEM_CD());
										System.out.println("DUE_DATE:"+m_med.getDUE_DATE()+" PRD_DUE_DATE:"+m_med.getDUE_DATE()+" DM_QTY:"+m_med.getDM_QTY());
										System.out.println("MRP_ODR_TYP:"+m_med.getMRP_ODR_TYP()+" OUTSIDE_TYP:"+m_med.getOUTSIDE_TYP()+" ISSUE_TYP:"+m_med.getISSUE_TYP());
										System.out.println("ODR_LT:"+m_med.getODR_LT()+" FIXED_LT:"+m_med.getFIXED_LT()+" PROP_LT:"+m_med.getPROP_LT());
										System.out.println("SAFETY_LT:"+m_med.getSAFETY_LT()+" ISSUE_LT:"+m_med.getISSUE_LT()+" PROP_LOT_SIZE:"+m_med.getPROP_LOT_SIZE());
										System.out.println("OD_LEVEL_NO:"+m_med.getHIGH_LEVEL_NO()+" ITEM_SPOIL:"+m_med.getITEM_SPOIL()+"\n");*/
										if(m_med.getinsertT_OD().create() != SUCCESS){
											errCode = "KP05002";
											errNote = "(SBM0594)<< �v���I�ȃG���[ >>";
											outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
											this.writeLogMessage(errCode);
											throw new Exception();
										}
									}
								}
							}
						}
					}
				}catch(Exception e){
					throw e;
				}finally{
					//=======================================
					// �Ɩ����b�N����
					//=======================================
					if (!businessUnLock(lockCancelKey)) {
						this.writeLogMessage("ZZ01004");
					}
				}
			}
		} catch (Exception e) {
			try {
			    conn.rollback();
			    e.printStackTrace();
				setBatchErrorMessage(e);
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		} finally {
			try {
				//�o�b�`�I�����b�Z�[�W�o�^
				errCode = "KP05003";
				errNote = "(SBM0598)<< �̔����v�v��h�^�e�o�b�`�����I�� >>";
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
				conn.commit();
				CoreTools.write("\n(SBM1089)******>>>> �̔����v�v��h�^�e�G���h <<<******");
			} catch (Exception ee) {
				ee.printStackTrace();
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			}
		}
		return BREAK;
	}

	//////////////////////////////

	/**
	 * object�^��Ԃ��܂�
	 *
	 * @return object�^
	 */
	public int getType()
	{
		return m_control.getType();
	}

	/**
	 * ��������
	 *
	 * @return <<�R�����g���L�q���Ă�������>>
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int beginProc() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		return m_control.beginProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int endProc() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		return m_control.endProc();
	}

	/**
	 * �I������
	 *
	 * @exception <<�R�����g���L�q���Ă�������>>
	 */
	public int execute() throws BatchAppException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

		// �������ʂ����^�[���l�Ƃ������Ƃ��͂����Őݒ肵�܂��B
		// setExecuteStatus(0);

		return m_control.execute();
	}

        //}}user_implement_code

	//{{control_class(wizard code)

	//////////////////////////////

	class interControl
		implements IBatchAppCommon
	{

		//////////////////////////////

		/**
		 * mediator�N���X �C���X�^���X
		 */
		public medKP0050B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKP0050B001 med) throws BatchAppException
		{
			// �e�����o�ϐ��̏�����
			m_med = med;

			try {
				m_container = new ManageContainer();
			} catch(FoundationException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "constractor", "DB�ւ̐ڑ��Ɏ��s���܂���");
			}
			return;
		}

		protected void finalize()
		{
			m_med = null;
			return;
		}

		//////////////////////////////



		//////////////////////////////

		public int getType()
		{
			return TYPE_CONTROL;
		}

		public int beginProc() throws BatchAppException
		{
			return IBatchAppCommon.SUCCESS;
		}

		public int endProc() throws BatchAppException
		{
			int ret;

			return IBatchAppCommon.SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret;

			try {
				if((ret=main())!=IBatchAppCommon.SUCCESS ) return ret;
			} catch(Exception ex) {
				throw new BatchAppException("CtrlMain", "execute", "execute�̏����Ɏ��s���܂���");
			}

			return IBatchAppCommon.SUCCESS;
		}

		public void commit() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().commit();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "commit", "DB�ւ̃R�~�b�g���Ɏ��s���܂���(SQLException)");
			}

			return;
		}

		public void rollback() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().rollback();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "rollback", "DB�ւ̃��[���o�b�N���Ɏ��s���܂���(SQLException)");
			}

			return;
		}

		//////////////////////////////

	}

	//}}control_class(wizard code)

}
