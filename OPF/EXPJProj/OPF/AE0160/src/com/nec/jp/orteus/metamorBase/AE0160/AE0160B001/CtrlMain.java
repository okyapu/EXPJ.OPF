/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/src/com/nec/jp/orteus/metamorBase/AE0160/AE0160B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0160.AE0160B001;

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
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.util.DateCtrl;
import com.nec.jp.orteus.expj.util.DateTool;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.AE0060.AE0060010Entity;
import com.nec.jp.orteus.metamorBase.AE0060.AE0060010Struct;
import com.nec.jp.orteus.metamorBase.AE0060.InspcAcpt;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.Calculate;
import java.math.BigDecimal;
import java.math.BigInteger;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.19 $ $Date: 2017/01/09 08:43:58 $
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
	public medAE0160B001 m_med=null;

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
	public CtrlMain(medAE0160B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
	/** ���O���x�� �C���t�H���[�V���� */
    private static final int INFOMATION = 0;
    /** ���O���x�� ���[�j���O */
    private static final int WORNING = 1;
    /** ���O���x�� �G���[ */
    private static final int ERROR = 2;
    
    /** �G���[ */
    private static final String ERROR_NO = "PUCH_ODR_CD = ";
	/**
     * �Ώۂ̕�����Null�i�󕶎����邢��Null�j�ł��邩�𔻒肵�܂��B
     * @param str �Ώە�����
     * @return Null�̏ꍇ��true�ANull�ł͂Ȃ��ꍇ��false
     */
    private boolean isNull(String str) {
    	if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
    		return true;
    	}
    	return false;
    }
	/**
     * ���O�t�@�C���o��
     * @param logLevel ���O���x��
     * @param code ���b�Z�[�W�R�[�h
     * @param value �u��������
     */
    private void writeLogFiles(int logLevel, String code, String value) {
     ExpjMessage emsg;
     // �u�������񔻒�
     if (!isNull(value)) {
      emsg = new ExpjMessage(code, value);
     } else {
      emsg = new ExpjMessage(code);
     }
   
     // ���O���x���ɂ���ă��O�^�C�v�𕪂���
     switch (logLevel) {
      case INFOMATION :
       m_med.getSyslog().info(emsg, m_med.getUsername());
       break;
      case WORNING :
       m_med.getSyslog().warning(emsg, m_med.getUsername());
       break;
      case ERROR :
       m_med.getSyslog().severe(emsg, m_med.getUsername());
       break;
     }
    }
    /** DB�R�l�N�V���� */
    private IDbConnection conn = null;
	IDbConnection conn_msg = null;
   
    /** �Ɩ����b�Z�[�W���O�pNumbering�N���X */
    private Numbering numbering = null;
    /** �Ɩ����b�Z�[�W���O�pBusinessMessageAccessor�N���X */
    private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
    /** �Ɩ����b�Z�[�W���O�pBusinessMessage�N���X */
    private BusinessMessage businessMsg = new BusinessMessage();
    // �o�b�`�N���X���ʃG���[�����p
    private String errCode = null;		     // �o�b�`�G���[�R�[�h
    private List errList  = null;            // �G���[���X�g
    private String businessErrCode = null;          // metamorBase�Ɩ����b�Z�[�W�R�[�h
    private String errNote = "";             // �o�b�`�G���[���b�Z�[�W(���l) �K�v�ɉ����Ďg�p
    private AE0060010Entity entity = null;
    private AE0060010Struct struct = null;
    /** ���b�N���s�����b�N�L�[ */
    private static final int LOCK_FAILD = -1;
   
//  �x���i�g�p�e�[�u����[�g�p�\�萔��]�E[�x���i�g�p�P�ʐ�����]�E[�x���i�g�p�P�ʐ����q]�̍ő�l 
    BigDecimal Decival = new BigDecimal("100000000000000");
    List lotNoList = new ArrayList();
    //  �Ǎ�����
    int inputCount = 0;                
    // �o�^����
    int insertCount = 0;                    
    /**
     * ���O�t�@�C���o��
     * @param logLevel ���O���x��
     * @param code ���b�Z�[�W�R�[�h
     */
    private void writeLogFiles(int logLevel, String code) {
     writeLogFiles(logLevel, code, null);
    }
    
    /**
     * ���ODB�o��
     * @param code ���b�Z�[�W�R�[�h
     * @param value �u��������
     * @param dataStr �f�[�^�X�g�����O
     * @throws FoundationException
     * @throws SQLException
     */
    private void writeLogDB(String code, String value, String dataStr)
     throws FoundationException, SQLException {
     if (numbering == null) {
      throw new NullPointerException();
     }
     businessMsg.setLogCode(numbering.getNo());
     businessMsg.setMessageCode(code);
     businessMsg.setData(dataStr);
     businessMsgAcc.add(businessMsg);
    }
   
    /**
     * ���O�t�@�C���A���ODB�o�͂��s���܂��B
     * @param logLevel ���O���x��
     * @param code ���b�Z�[�W�R�[�h
     * @param value �u��������
     * @param dataStr �f�[�^�X�g�����O
     * @throws FoundationException
     * @throws SQLException
     */
    private void writeLog(int logLevel, String code, String value, String dataStr)
     throws FoundationException, SQLException {
     writeLogFiles(logLevel, code, value);
     if (!isNull(dataStr)) {
      writeLogFiles(logLevel, "ZZ01006", dataStr);
     }
     writeLogDB(code, value, dataStr);
    }
   
    
   
    /**
     * ���O�t�@�C���A���ODB�o�͂��s���܂��B
     * @param logLevel ���O���x��
     * @param code ���b�Z�[�W�R�[�h
     * @throws FoundationException
     * @throws SQLException
     */
    private void writeLog(int logLevel, String code) throws FoundationException, SQLException {
     writeLog(logLevel, code, null, null);
    }
    /**
     * �X�g�A�h�v���V�[�W�����s
     * @param userId ���[�UID
     * @param businessName �Ɩ���
     * @param plantCd �H��R�[�h
     * @param csvTime CSV�捞����
     * @param outStatus ��������
     * @return ���s����
     * @throws Exception 
     * @throws Exception 
     */
    public void spExecute(String userId, String businessName, 
      String plantCd, String _sysDateFrom,String _sysDateTo,String _businessOprDate) throws Exception{
        try{
		    // �������s --------------------------------------------------------
		    writeLog(INFOMATION, "AE00176" );// �o�b�`�������J�n���܂����B
		    // ���b�Z�[�W�v���p�e�B�t�@�C��
	        ResourceBundle _messages = CoreTools.getResourceBundle("ExpjMessage", CoreTools.getLocale(userId));

		    // �e�J�E���^�ɏ����l=0���Z�b�g����B
		    inputCount = 0;                     
		    insertCount = 0;  
		    entity = new AE0060010Entity();
		    // �����ԍ��敪�A����
		    int recordCount ;
			// [������ю捞]�Ǎ�
			m_med.setDATEFROM(_sysDateFrom);
			m_med.setDATETO(_sysDateTo);
			m_med.getselectT_ACPT_RSLT_TEMP().read();
			while(m_med.getselectT_ACPT_RSLT_TEMP().next()){
				inputCount = inputCount + Integer.parseInt(m_med.getLINE_COUNT());

				// �����ԍ����A [������ю捞]�Ǎ�
				m_med.getselectT_ACPT_RSLT_TEMPByPuchOdrCd().read();

				int checkresult = 0;
				boolean completeFlg = false;
				conn.beginTransWeb();
			    // �����ԍ��敪�A����
			    recordCount = 1;
				while(m_med.getselectT_ACPT_RSLT_TEMPByPuchOdrCd().next()){
					errList = new ArrayList();
					//�����  
					if(null == m_med.getTEMP_ACPT_DATE() || "".equals(m_med.getTEMP_ACPT_DATE())){
						//Null�̏ꍇ�A�u�Ɩ��^�p���v
						m_med.setTEMP_ACPT_DATE(_businessOprDate);
					}
					m_med.getlockT_ACPT_RSLT_TEMP().read();
					struct = new AE0060010Struct();
					writeLogFiles(INFOMATION, "AE00188",m_med.getTEMP_ACPT_RSLT_TEMP_CTL_NO());
					// ��������̐ݒ�
					if("1".equals(m_med.getTEMP_ACPT_RSLT_COMP()) || "2".equals(m_med.getTEMP_ACPT_RSLT_COMP())){
						completeFlg = true;
					}
					if(recordCount == Integer.parseInt(m_med.getLINE_COUNT())){
						if(completeFlg == true){
							m_med.setCOMPLETE_FLG("true");
						}else{
							m_med.setCOMPLETE_FLG("false");
						}
					}else{
						m_med.setCOMPLETE_FLG("false");
					}
/*					//������̐ݒ�:�������Null�̏ꍇ�A[�����c]�D������-SUM�i[�������]�D������j
					if (m_med.getTEMP_ACPT_QTY() == null || "".equals(m_med.getTEMP_ACPT_QTY())){
						m_med.getselectT_ACPT_RSLT().read();
						m_med.getselectT_ACPT_RSLT().next();
					}*/
					// ��������t���O���Q�F0�����̏ꍇ�A���u������v���O�̏ꍇ
					if("2".equals(m_med.getTEMP_ACPT_RSLT_COMP()) && Calculate.compare("0", m_med.getTEMP_ACPT_QTY()) !=0){
						m_med.setTEMP_ACPT_QTY("0");
						writeLogFiles(INFOMATION, "AE00190");
					}
					// �f�[�^�`�F�b�N
					checkresult = doCheck(_businessOprDate,m_med.getTEMP_PUCH_ODR_CD());
					plantCd = m_med.getPLANT_CD();
					if(0 != checkresult){
						conn.rollback();
						break;
					}
					//�݌Ƀ��b�g�ԍ��̔�
					if ("1".equals(m_med.getLOT_CTRL_FLG())
							&& !"0".equals(m_med.getTEMP_ACPT_QTY())
							&& !"1".equals(m_med.getNON_NO_ITEM_FLG())
							&& !(null != m_med.getWORK_ODR_CD() 
									&& !"".equals(m_med.getWORK_ODR_CD()) 
									&& "0".equals(m_med.getFINAL_PROC_FLG()))){
						//�����̔Ԃ̏ꍇ�A���A�݌Ƀ��b�g�ԍ���Null�̏ꍇ
						if (!"0".equals(m_med.getLOT_NUMBERING_TYP())
								&& (null == m_med.getTEMP_LOT_NO() || "".equals(m_med.getTEMP_LOT_NO()))){
							// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
			                String itemCdStr = m_med.getTEMP_ITEM_CD();              //�i�ڔԍ�
			                String acptDateStr = m_med.getTEMP_ACPT_DATE();          //�����
							BizCommon bc = new BizCommon(conn, userId, businessName, plantCd);
							//���b�g�̔ԋ��ʕ��i
							List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
							//���ʃX�e�[�^�X������I��
				            if(bc.getResultStatus().intValue() == 1){
				                if(resultList != null && resultList.size() > 0){
				        	        String result1 = (String)resultList.get(0);
				        	        struct.setLOT_NO(result1);                  //���b�g�ԍ�
				                }
				            }else{
				            	//���ʃX�e�[�^�X������I���ȊO
				                if(resultList != null && resultList.size() > 1){
				                	//�����̃G���[�R�[�h�ŃG���[���b�Z�[�W��\����
				                	errCode = "AE00184";
				                	writeLog(ERROR, errCode, null,ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
				        	        struct.setLOT_NO(null); 
				        	        checkresult = 9;
				        	        conn.rollback();
				        	        break;
				                }
				            }
						}
						//����͂���ꍇ�A�݌Ƀ��b�g�ԍ������b�g�Ǘ��ɑ��݂��Ȃ��ꍇ
						if("0".equals(m_med.getLOT_NUMBERING_TYP())
								&& (null != m_med.getTEMP_LOT_NO() && !"".equals(m_med.getTEMP_LOT_NO()))){
							//���b�g�Ǘ��Ƀf�[�^��Ǎ�
							m_med.getT_LOT_CTRL().read();
							if (!m_med.getT_LOT_CTRL().next()){
								// �ܖ����������v�Z���s���B
				                String itemCdStr = m_med.getTEMP_ITEM_CD();              //�i�ڔԍ�
				                String acptDateStr = m_med.getTEMP_ACPT_DATE();          //�����
								BizCommon bc = new BizCommon(conn, userId, businessName, plantCd);
								//�ܖ����������v�Z���ʕ��i
								List resultList = bc.calcBestBeforeFd(itemCdStr, acptDateStr);
								//���ʃX�e�[�^�X������I��
					            if(bc.getResultStatus().intValue() == 1){
					                if(resultList != null && resultList.size() > 0){
					        	        String result1 = (String)resultList.get(0);
										if(result1.length() < 10) {
											m_med.setTEMP_BEST_BEFORE_DATE(null); // �ܖ�����
										} else {
											m_med.setTEMP_BEST_BEFORE_DATE(result1); // �ܖ�����
										}
					                }
					            }else{
					            	//���ʃX�e�[�^�X������I���ȊO
					                if(resultList != null && resultList.size() > 1){
					                	//�����̃G���[�R�[�h�ŃG���[���b�Z�[�W��\����
					                	errCode = "AE22056";
					                	writeLog(ERROR, "AE22056", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
					        	        m_med.setTEMP_BEST_BEFORE_DATE(null);                  //�ܖ�����
					        	        checkresult = 9;
					        	        conn.rollback();
					        	        break;
					                }
					            }
								m_med.setUSER_CD(userId);
								m_med.setPRG_NM(businessName);
								m_med.getT_LOT_CTRL().create();				
							}
						}
					}
/*					//struct�ɕϐ���u���܂���
					copyMedToStruct();*/
					struct.setsUser_ID(userId);
					if("true".equals(m_med.getCOMPLETE_FLG())){
						struct.setc_COMPLETE("true");
					}
					//�u�l�����z�v�� [�ʉ�].�h�����_�����h ���� �� [�����].�h�������z�܂�ߋ敪�h �ł܂�߂��ꍇ
					String disc_amount = Calculate.divide(struct.getDISC_AMOUNT(), "1", 
							Integer.parseInt(struct.getVEND_DECIMAL_FIG()),	Integer.parseInt(struct.getROUND_TYP()));
					if (!disc_amount.equals(struct.getDISC_AMOUNT())){
						//�l�����z�ɂ��ėL�������ȉ��̂܂�ߏ������s���܂����B
						writeLogFiles(WORNING, "AE00195");
						struct.setDISC_AMOUNT(disc_amount);
					}
					
					// �������z��̌v�Z
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							struct.getACPT_QTY(),
							struct.getUNIT_COST(),
							struct.getROUND_TYP(),
							struct.getVEND_DECIMAL_FIG());
					struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
					// �{�̋��z�̌v�Z
					struct.setNET_AMOUNT(AmountCalculator.calcNetAmount(struct.getPUCH_ODR_AMOUNT(), struct.getDISC_AMOUNT()));
					// Add Start 20131227 fang-xf
					TaxStruct ts =
						TaxControl.getDataTax(
							conn,
							m_med.getCOMPANY_CD(),
							m_med.getVEND_CD(),
							m_med.getITEM_CD(),
							struct.getACPT_DATE(),
							m_med.getTAX_CD());
					// ����ŃR�[�h
					struct.setTAX_CD(ts.getTAX_CD());
					// �ŗ��P
					struct.setTAX_RATE_1(ts.getTAX_RATE_1());
					// �ŗ��Q
					struct.setTAX_RATE_2(ts.getTAX_RATE_2());
					// �ŗ��R
					struct.setTAX_RATE_3(ts.getTAX_RATE_3());
					// �Œ[�������敪
					struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
					// Add End 20131227 fang-xf
					// Mod Start 20140207 fang-xf
					//// ��Ŋz1��̌v�Z
					//String taxAmount1 =
					//	AmountCalculator.calcTaxAmount(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_RATE_1(),
					//		struct.getTAX_ROUND_TYP(),
					//		struct.getVEND_DECIMAL_FIG());
					//struct.setTAX_AMOUNT_1(taxAmount1);
					//// ��Ŋz2��̌v�Z
					//String taxAmount2 =
					//	AmountCalculator.calcTaxAmount(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_RATE_2(),
					//		struct.getTAX_ROUND_TYP(),
					//		struct.getVEND_DECIMAL_FIG());
					//struct.setTAX_AMOUNT_2(taxAmount2);
					//// ��Ŋz3��̌v�Z
					//String taxAmount3 =
					//	AmountCalculator.calcTaxAmount(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_RATE_3(),
					//		struct.getTAX_ROUND_TYP(),
					//		struct.getVEND_DECIMAL_FIG());
					//struct.setTAX_AMOUNT_3(taxAmount3);
					//// ��ō����z��̌v�Z
					//String amountIncludeTax =
					//	AmountCalculator.calcAmountIncludeTax(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_AMOUNT_1(),
					//		struct.getTAX_AMOUNT_2(),
					//		struct.getTAX_AMOUNT_3());
					//struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
					
					// ���ł̏ꍇ�ɐŊz���v�Z����
			 		String lowerTaxCd =
			 			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
			 		if (!lowerTaxCd.equals("1")) {
						//�o�b�`�p�����[�^�ďo
						List batList = entity.mSYS_BAT_PARM.read(conn, struct);
						if(!batList.isEmpty()){
							//�Ōv�Z���i���R�[��
							AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
							struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
							struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
							struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
							struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
							struct.setPVC2USERID(m_med.getUSER_CD());
							struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
							struct.setPVC2PLANTCD(m_med.getPLANT_CD());
							struct.setPVC2TAXID("5");
							batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
							batStruct = (AE0060010Struct)batList.get(0);
							if(!"1".equals(batStruct.getPNUMSTATUS())){
								// �����̃G���[�R�[�h�ŃG���[���b�Z�[�W��\����
			                	errCode = batStruct.getPVC2ERRCD();
			                	writeLog(ERROR, batStruct.getPVC2ERRCD(), null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
			        	        m_med.setTEMP_BEST_BEFORE_DATE(null);                  //�ܖ�����
			        	        checkresult = 9;
			        	        conn.rollback();
			        	        break;  				       				
							}
							struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
							struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
							struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
							struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
						}else{
							// �����̃G���[�R�[�h�ŃG���[���b�Z�[�W��\����
		                	errCode = "ZZ09007";
		                	writeLog(ERROR, "ZZ09007", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
		        	        m_med.setTEMP_BEST_BEFORE_DATE(null);                  //�ܖ�����
		        	        checkresult = 9;
		        	        conn.rollback();
		        	        break;      				
						}
			     	}else{
			     		//  ��Ŋz1��̌v�Z
						String taxAmount1 =
							AmountCalculator.calcTaxAmount(
								struct.getNET_AMOUNT(),
								struct.getTAX_RATE_1(),
								struct.getTAX_ROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_1(taxAmount1);
						// ��Ŋz2��̌v�Z
						String taxAmount2 =
							AmountCalculator.calcTaxAmount(
								struct.getNET_AMOUNT(),
								struct.getTAX_RATE_2(),
								struct.getTAX_ROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_2(taxAmount2);
						// ��Ŋz3��̌v�Z
						String taxAmount3 =
							AmountCalculator.calcTaxAmount(
								struct.getNET_AMOUNT(),
								struct.getTAX_RATE_3(),
								struct.getTAX_ROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_3(taxAmount3);
						// ��ō����z��̌v�Z
						String amountIncludeTax =
							AmountCalculator.calcAmountIncludeTax(
								struct.getNET_AMOUNT(),
								struct.getTAX_AMOUNT_1(),
								struct.getTAX_AMOUNT_2(),
								struct.getTAX_AMOUNT_3());
						struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
			     	}
					// Mod End 20140207 fang-xf
					// ��M�݋��z��̌v�Z
					HomeCurStruct _homeCurStruct = new HomeCurStruct();
					_homeCurStruct = HomeCurControl.getData(conn);
					String homeCurAmount =
						AmountCalculator.calcHomeCurAmount(
							struct.getAMOUNT_INCLUDE_TAX(),
							struct.getEXCH_RATE(),
							struct.getROUND_TYP(),
							_homeCurStruct.getDECIMAL_FIG());
					struct.setHOME_CUR_AMOUNT(homeCurAmount);
					
					// [�����c]."��������������敪"��1:����̂� �̏ꍇ
					if ("1".equals(struct.getACPT_INSPC_TYP())) {
						//�����҂��ۊǋ�
						struct.setINSPC_WH_CD(null);
						//�����ԋ敪: 2�F��������
						struct.setACPT_STS_TYP("2");
					}
					
					// [�����c].�h��������������敪�h �� 2�F����ƌ������s�� �̏ꍇ
					if("2".equals(struct.getACPT_INSPC_TYP())){
						//�����ԋ敪: 1�F������
						struct.setACPT_STS_TYP("1");
					}
				
					// �p�����[�^[���������t���O]���擾
					PrivateConfig pc = new PrivateConfig(conn);
				    String _inspcvalue = pc.getString("INSPC_CMPLT_FLG");
					//�@[�����c]."��������敪"��2:�����Ɍ������s�����������=0����"���������t���O"=1�@2009/07/14
					if("2".equals(struct.getACPT_INSPC_TYP()) &&
					   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
					   "1".equals(_inspcvalue)){
						struct.setACPT_STS_TYP("2");
					}
					
					// [�����c]."���i�����t���O"��0:���i�ȊO�i�ʏ�d���i�j�������ꍇ
					if ("0".equals(struct.getNON_NO_ITEM_FLG())) {
						//���i�����i�ږ� : NULL
						struct.setITEM_NAME(null);
					}
					// [�������]��o�^
					entity.mT_ACPT_RSLT.create(conn, struct);

					// [�����c]."��������敪"��1:����݂̂̏ꍇ
					if ("1".equals(struct.getACPT_INSPC_TYP())) {
						// [��������]��o�^
						entity.mT_INSPC_RSLT.create(conn, struct);
					}

					// �S��������̏ꍇ
					if ("true".equals(struct.getc_COMPLETE())) {
						//�����������Ǎ�
						List aList = entity.mT_RLSD_PUCH_ODRForComplete.read(conn, struct);
						AE0060010Struct aStruct = (AE0060010Struct) aList.get(0);
						aStruct.setsOraganization_CD(struct.getsOrganization_CD());
						aStruct.setsSysdate(struct.getsSysdate());
						aStruct.setsUser_ID(struct.getsUser_ID());
						//������ԋ敪:9 ����
						aStruct.setPUCH_ODR_STS_TYP("9");
						//��������`�[���s�t���O 
						aStruct.setODR_CANCEL_SLIP_ISS_FLG("0");
						
						//�@[�����c]."��������敪"��2:�����Ɍ������s�����������=0����"���������t���O"=1�@2009/07/14
						if("2".equals(struct.getACPT_INSPC_TYP()) &&
								   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
								   "1".equals(_inspcvalue)){
							aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
							aStruct.setINSPC_CMPLT_FLG("1");
						}
						// [�����c]���X�V
						entity.mT_RLSD_PUCH_ODRForComplete.update(conn, aStruct);
					}
		
					// ������ъ֘A�̃e�[�u�����X�V
					String[] message;
					InspcAcpt ia = new InspcAcpt(conn, userId, businessName, plantCd);
				
					if (!ia.addAcpt(struct.getPUCH_ODR_CD(), struct.getACPT_NO(), null, m_med.getCOMPANY_CD())) {
						if (ia.getErrorList() != null && !ia.getErrorList().isEmpty() ) {
							if ("BZ00180".equals(ia.getErrorList().get(0).toString())) {
								errCode = "BZ00180";
								writeLog(ERROR, "BZ00180", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
								checkresult = 9;
								conn.rollback();
								break;
							}
						}
						errCode = "AE05017";
						writeLog(ERROR, "AE05017", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
						checkresult = 9;
						conn.rollback();
						break;
					}

					// �Ɩ����[�j���O�̏o��
					for(int i=0; i<ia.getWarnList().size(); i++){
						message = (String[])ia.getErrorList().get(i);
						if("AD10003".equals(message[0])){
							writeLogFiles(WORNING, "AE00162");
						}
					}
					if(!ia.getErrorList().isEmpty()){
						for(int i=0; i<ia.getErrorList().size(); i++){
							message = (String[])ia.getErrorList().get(i);
							errCode = message[0];
		                	errList.add(message[0]);
		                	errList.add(message[1]);
		                	writeLog(ERROR, errCode, message[1], ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
						}
						checkresult = 9;
						conn.rollback();
						break;
					}
					// �x���i�݂Ȃ��o�ɏ���
					if(!consInssue(userId, businessName, plantCd, m_med.getTEMP_PUCH_ODR_CD())){
						checkresult = 9;
						conn.rollback();
						break;
					}

					// �����o�ɂ̋Ɩ��A���[��������Ώo�͂���B
					for(int i=0; i<ia.getWarnList().size(); i++){
						message = (String[])ia.getWarnList().get(i);
						writeLogFiles(WORNING, message[0], message[1]);
					}
					if(recordCount == Integer.parseInt(m_med.getLINE_COUNT())){
						insertCount = insertCount + Integer.parseInt(m_med.getLINE_COUNT());
					}
					recordCount++;
					
				}
				if(checkresult !=0){
					m_med.setACPT_RSLT_TEMP_CTL_NO(m_med.getTEMP_ACPT_RSLT_TEMP_CTL_NO());
					m_med.setACPT_RSLT_TAKE_ERR_TYP(Integer.toString(checkresult));
					StringBuffer sb = new StringBuffer();
					if (errList.isEmpty()){
						sb.append(_messages.getString((String)errCode));
					}else {
						for(int i =0;i< errList.size();i++){
							ExpjMessage emsg = new ExpjMessage((String)errList.get(i), (String)errList.get(i+1));
							sb.append(emsg.getMessage());
							i++;
						}
					}
					m_med.setACPT_RSLT_TAKE_ERR_INFO(sb.toString());
				}else{
					m_med.setACPT_RSLT_TEMP_CTL_NO(null);
					m_med.setACPT_RSLT_TAKE_ERR_TYP(null);
					m_med.setACPT_RSLT_TAKE_ERR_INFO(null);
				}
				m_med.setUSER_CD(userId);
				m_med.setPRG_NM(businessName);
				
				// �m������ю捞�����n�̓o�^
				m_med.getinsertT_ACPT_RSLT_TEMP_HISTORY().create();
				// [������ю捞]�̍폜
				m_med.getdeleteT_ACPT_RSLT_TEMP().delete();
				conn.commit();
			}
			
        } catch(SQLException e) {
        	e.printStackTrace();
        	//�G���[���e�����
			writeLog(ERROR, "ZZ01106",null,e.getMessage());
			writeLog(ERROR, "AE00186",null ,ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
    		conn.rollback();
    		throw e;
    	} catch(Exception e) {
        	e.printStackTrace();
			writeLog(ERROR, "AE00186",null ,ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
    		conn.rollback();
    		throw e;
    	}
	}
	/**
	 * 	�f�[�^�`�F�b�N
	 * @return 1�F�����c�G���[ 2�F���͍��ڃG���[ 0:����
	 * @throws BatchAppException
	 * @throws ParseException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private int doCheck(String _businessOprDate, String puchno) throws BatchAppException, ParseException, SQLException, FoundationException{
	    // [�����c]�ɓǍ�
		m_med.getT_RLSD_PUCH_ODR().read();
		// [������ю捞].�h�����ԍ��h �� [�����c] �ɑ��݂��Ă��Ȃ��ꍇ
		if(!m_med.getT_RLSD_PUCH_ODR().next()){
			errCode = "ZZ06001";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		// [�����c].�h������ԋ敪�h �� 1�F���w�� �ł���ꍇ
		if("1".equals(m_med.getPUCH_ODR_STS_TYP())){
			errCode = "AE30803";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		// [�����c].�h�ŃR�[�h�h �� [����ŋ敪] ���������A���݂��Ȃ������ꍇ
		if(null == m_med.getTAX_CD() || "".equals(m_med.getTAX_CD())){
			try {
				TaxStruct ts =
					TaxControl.getData(
						conn,
						m_med.getCOMPANY_CD(),
						m_med.getVEND_CD(),
						m_med.getITEM_CD(),
						m_med.getPUCH_ODR_START_DATE());

				m_med.setTAX_CD(ts.getTAX_CD());
			} catch (DataNotFoundException e) {
				// Mod Start 20140211 fang-xf
				//errCode = "AE05003";
				errCode = "KQ10011";
				// Mod End 20140211 fang-xf
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 1;
			}
		}
		m_med.getM_TAX().read();
		if (!m_med.getM_TAX().next()){
			errCode = "AE05003";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		
		// [�����c].�h�󋋋敪�h��2:������
		if(!"2".equals(m_med.getSPL_ITEM_TYP())){
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			AE0060010Struct readStruct = new AE0060010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0060010Struct installOptionsStruct = (AE0060010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// ���|�Ǘ����C���X�g�[������Ă���ꍇ�A���N���x���擾
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0060010Struct debtCtrlStruct = (AE0060010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					// [�C���X�g�[���I�v�V����]." �V�X�e���I�v�V�������ʎq"�� C* �A[�C���X�g�[���I�v�V����]." �V�X�e�������t���O"�� 1:������
					//[����]." SYS�R���g���[���R�[�h"�@���@SYSTEM�A[����]."��ЃR�[�h"��[���|�V�X�e���Ǘ�]."��ЃR�[�h"�A
					//[���|�V�X�e���Ǘ�]."���N���x"�� [������ю捞]. "�����"�iYYYY/MM�j
					if(DateTool.compareYM(m_med.getTEMP_ACPT_DATE(), struct.getTHIS_MONTH()) < 0){
						writeLogFiles(WORNING, "AE00183");
					}
				} else {
					// ���|�V�X�e���Ǘ��̓��N���x���ݒ肳��Ă��܂���B
					errCode = "AE00145";
					writeLog(ERROR, errCode, null, ERROR_NO + puchno);
					return 1;
				}
			}
		}

		// [�����c].�h������ԋ敪�h �� 9�F��������ł���ꍇ
		if("9".equals(m_med.getPUCH_ODR_STS_TYP())){
			errCode = "AE05005";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		// [�����c].�h��������������敪�h �� 2�F����ƌ������s��
		if("2".equals(m_med.getACPT_INSPC_TYP())){
			AE0060010Struct readStruct = new AE0060010Struct();
			readStruct.setPLANT_CD(m_med.getPLANT_CD());
			List inspcWhList = entity.mselectM_WH.read(conn, readStruct);
			
			// [�ۊǋ�]."�H��R�[�h"=[�����c]."�H��R�[�h"����[�ۊǋ�]."�q�ɋ敪"=40(�����҂��ۊǋ�)
			// �ɊY������f�[�^�����݂��Ȃ��ꍇ
			if (inspcWhList.isEmpty()) {
				// �����҂��ۊǋ悪���݂��܂���B
				errCode = "AE00163";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 1;
			}
			//�����҂��ۊǋ�̐ݒ�
			m_med.setWH_CD(((AE0060010Struct)inspcWhList.get(0)).getINSPC_WH_CD());
		}
		// [������ю捞]."�����" �� [���t����]."�Ɩ��^�p��" �̏ꍇ
		if(DateTool.compareYMD(m_med.getTEMP_ACPT_DATE(), _businessOprDate)>0){
			errCode = "AE33111";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		//[������ю捞]."�i�ڔԍ�" �� [�����c]."�i�ڔԍ�"�̏ꍇ
		if(m_med.getTEMP_ITEM_CD() != null && !"".equals(m_med.getTEMP_ITEM_CD())
				&& !m_med.getTEMP_ITEM_CD().equals(m_med.getITEM_CD())){
			errCode = "AE00187";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		//struct�ɕϐ���u���܂���
		copyMedToStruct();
		// �u������v��0�A�u��������t���O�v��2�F0���̏ꍇ
		if(Calculate.compare(struct.getACPT_QTY(), "0") == 0 && !"2".equals(m_med.getTEMP_ACPT_RSLT_COMP())) {
			errCode = "AE00197";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		
		// [������ю捞].�h����ꏊ�h �� [�ۊǋ�] ���������A���݂��Ȃ��ꍇ
		if(null!= m_med.getTEMP_WH_CD() && !"".equals(m_med.getTEMP_WH_CD())){
			AE0060010Struct whStruct = new AE0060010Struct();
			whStruct.setWH_CD(m_med.getTEMP_WH_CD());
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				errCode = "AE00018";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 2;
			} else {
				// [�ۊǋ�]."�H��R�[�h" != ��H��R�[�h��̏ꍇ
				whStruct = (AE0060010Struct) whList.get(0);
				if (!m_med.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
					errCode = "AE00032";
					writeLog(ERROR, errCode, null, ERROR_NO + puchno);
					return 2;
				}
			}
		}
		// [�����c]."���i�����t���O" = 1:���i���� ���@[������ю捞]."�݌Ƀ��b�g�ԍ�"�@�� Null �̏ꍇ
		if("1".equals(m_med.getNON_NO_ITEM_FLG())
				&& m_med.getTEMP_LOT_NO() != null 
				&& !"".equals(m_med.getTEMP_LOT_NO())){
			errCode = "AE20608";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// [�i��]."���b�g�Ǘ��t���O" = 1(���b�g�Ǘ����s���B) ���� [�i��]�D"���b�g�ԍ��̔ԋ敪"�� 0�F����́B 
		//���A[�����c]."��ƌv��ԍ�" = Null ���A[�����c]."���i�����t���O" �� 1(���i����)�@���A[������ю捞]."�݌Ƀ��b�g�ԍ�" �� Null�̏ꍇ
		m_med.getM_ITEM().read();
		m_med.getM_ITEM().next();
		//[�i��] .�h�݌ɐ��P�ʋ敪�h�������Ǘ��ŁA�u������v�ɏ����_�ȉ������݂���ꍇ
		if ("1".equals(m_med.getUNIT_QTY_TYP()) && Calculate.isNumeric(struct.getACPT_QTY())){
			errCode = "AE00194";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		if("1".equals(m_med.getLOT_CTRL_FLG()) 
				&& "0".equals(m_med.getLOT_NUMBERING_TYP()) 
				&& (m_med.getWORK_ODR_CD() == null || "".equals(m_med.getWORK_ODR_CD()) )
				&& !"1".equals(m_med.getNON_NO_ITEM_FLG()) 
				&& (m_med.getTEMP_LOT_NO() == null || "".equals(m_med.getTEMP_LOT_NO()))
				&& Calculate.compare(struct.getACPT_QTY(), "0") > 0){
			errCode = "AE20600";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		
		// [������ю捞].�h�݌Ƀ��b�g�ԍ��h�@�� Null�ŁA[�i��].�h���b�g�Ǘ��t���O�h �� 1�̏ꍇ
		if(null != m_med.getTEMP_LOT_NO() 
				&& !"".equals(m_med.getTEMP_LOT_NO()) 
				&& !"1".equals(m_med.getLOT_CTRL_FLG())){
			errCode = "AF20006";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		
		// [��ƌn��ʎd�|]�ɓǍ�
		m_med.getT_WORK_IN_PROC_BY_PROC().read();
		m_med.getT_WORK_IN_PROC_BY_PROC().next();
		// [�����c]."��ƌv��ԍ�" �� Null ���A[��ƌn��ʎd�|]."�ŏI�n��t���O" �� 1���A[������ю捞]."�݌Ƀ��b�g�ԍ�"�@�� Null�@�̏ꍇ
		if(m_med.getWORK_ODR_CD() != null
				&& !"".equals(m_med.getWORK_ODR_CD()) 
				&& !"1".equals(m_med.getFINAL_PROC_FLG()) 
				&& m_med.getTEMP_LOT_NO() != null
				&& !"".equals(m_med.getTEMP_LOT_NO())){
			errCode = "AE20602";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// [�i��]."���b�g�Ǘ��t���O" = 1(���b�g�Ǘ����s���B) ���� [�i��]�D"���b�g�ԍ��̔ԋ敪"�� 0�F����́B
		//���A[�����c]."���i�����t���O" �� 1(���i����) ���A[�����c]."��ƌv��ԍ�" �� Null
		//���A[�����c]."��ƌv��ԍ�"�A"�d�|��ƃR�[�h"�Łu��ƌn��ʎd�|�v���������A�u��ƌn��ʎd�|�v."�ŏI�n��t���O" = 1(�ŏI�n��)�ŁA
		//[������ю捞]."�݌Ƀ��b�g�ԍ�" �� Null�ꍇ
		if("1".equals(m_med.getLOT_CTRL_FLG()) 
				&& "0".equals(m_med.getLOT_NUMBERING_TYP()) 
				&& !"1".equals(m_med.getNON_NO_ITEM_FLG()) 
				&& (null != m_med.getWORK_ODR_CD() || !"".equals(m_med.getWORK_ODR_CD())) 
				&& "1".equals(m_med.getFINAL_PROC_FLG()) 
				&& (null == m_med.getTEMP_LOT_NO() || "".equals(m_med.getTEMP_LOT_NO()))
				&& Calculate.compare(struct.getACPT_QTY(), "0") > 0){
			errCode = "AE20600";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// [�i��]."���b�g�Ǘ��t���O" = 1(���b�g�Ǘ����s���B) 
		//���� [������ю捞]."�݌Ƀ��b�g�ԍ�"�@�� Null[������ю捞].�h�݌Ƀ��b�g�ԍ��h��[�����c].�h�i�ڔԍ��h��[���b�g�Ǘ�]���������A[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
		if("1".equals(m_med.getLOT_CTRL_FLG()) 
				&& null != m_med.getTEMP_LOT_NO() 
				&& !"".equals(m_med.getTEMP_LOT_NO()) 
				&& !"0".equals(m_med.getLOT_NUMBERING_TYP())){
			m_med.getT_LOT_CTRL().read();
			if(!m_med.getT_LOT_CTRL().next()){
				errCode = "AE22008";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 2;
			}
		}
		// [�����c].�h�������h ��[������ю捞].�h������h �̏ꍇ
		if(DateTool.compareYMD(m_med.getPUCH_ODR_SLIP_ISS_DATE(), m_med.getTEMP_ACPT_DATE())>0){
			errCode = "AE05006";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// �݌v�����擾
		m_med.getT_ACPT_RSLT().read();
		m_med.getT_ACPT_RSLT().next();
		// �u������v��0�A�u��������t���O�v=2�F0���̏ꍇ�͐��ʃ`�F�b�N���X�L�b�v
		if(Calculate.compare(struct.getACPT_QTY(), "0") != 0 || !"2".equals(m_med.getTEMP_ACPT_RSLT_COMP())) {			
			// �u�݌v���v�j ���@�u�������v �̏ꍇ
			if(Calculate.compare(m_med.getALREADY_ACPT_QTY(), m_med.getPUCH_ODR_QTY())>0){
				errCode = "AE00178";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 2;
			}
			// [������ю捞].�h��������h�@�� 0�F���������A�i�u������v�{�u�݌v���v�j �� �u�������v �̏ꍇ
			String sumAcptQty = Calculate.add(m_med.getALREADY_ACPT_QTY(), struct.getACPT_QTY());
			if("false".equals(m_med.getCOMPLETE_FLG())){
				if(Calculate.compare(sumAcptQty, m_med.getPUCH_ODR_QTY()) > 0){
					writeLogFiles(WORNING, "AE00179");	
				}
			}
			
			if("true".equals(m_med.getCOMPLETE_FLG())){
				// [������ю捞]."�������"�@�� 1�F�������A�i�u������v�{�u�݌v���v�j �� �u�������v �̏ꍇ
				if(Calculate.compare(sumAcptQty, m_med.getPUCH_ODR_QTY()) < 0){
					writeLogFiles(WORNING, "AE00180");
				}
			}
		}
		// [������ю捞]." �����" �̔N�� �iYYYY/MM�j �� �u�Ɩ��^�p���v �̔N�� �iYYYY/MM�j �ꍇ
		if(DateTool.compareYM(m_med.getTEMP_ACPT_DATE(), _businessOprDate)<0){
			writeLogFiles(WORNING, "AE00181");
		}
		// [������ю捞]. "�P��"�v �� �i[������ю捞]. "���H��" �{ [������ю捞]. "�ޗ���"�v �{[������ю捞]. " ���̑��o��"�j�̏ꍇ
		if(Calculate.compare(struct.getUNIT_COST(), Calculate.add(Calculate.add(struct.getPROCESSING_COST(), struct.getMATERIAL_COST()),struct.getOTHER_OVERHEADS()))<0){
			writeLogFiles(WORNING, "AE00182");
		}

		// �p�����[�^[���ی����̒��߂��������Ă��錎�̎��т̓o�^�^�C�����\�Ƃ��邩�ۂ��̋敪]���擾
		PrivateConfig pc = new PrivateConfig(conn);
		String value = pc.getString("PAST_RESULT_ENTRY_TYP");
		// [���ی����Ǘ��p�����[�^].�g�Ώ۔N���h���擾
		m_med.getSYS_ACTUAL_COST_CTRL_AC().read();
		m_med.getSYS_ACTUAL_COST_CTRL_AC().next();
		if(null != m_med.getPROC_EXEC_DATE() && m_med.getPROC_EXEC_DATE().length() >4){
			m_med.setPROC_EXEC_DATE(m_med.getPROC_EXEC_DATE().substring(0,4)+"/"+m_med.getPROC_EXEC_DATE().substring(4)) ;
		}
		if(value != null && "false".equalsIgnoreCase(value)){
			if(DateTool.compareYM(m_med.getTEMP_ACPT_DATE(),m_med.getPROC_EXEC_DATE())<0){
				errCode = "AE00160";
				writeLog(ERROR,errCode, null, ERROR_NO + puchno);
				return 2;
			}
		}
		// �q�i�ڂł��邩�ۊǋ�R�[�h���ۊǋ�}�X�^�ɑ��݂��Ȃ��ꍇ
		AE0060010Struct tempstruct = new AE0060010Struct();
		tempstruct.setPUCH_ODR_CD(m_med.getTEMP_PUCH_ODR_CD());
		List issueList = entity.mT_ISSUE_INST.read(conn, tempstruct);
		if (!issueList.isEmpty()){
			// ���[�v�`�F�b�N
			for (int i = 0; i < issueList.size(); i++ ) {
				AE0060010Struct issueStruct = (AE0060010Struct) issueList.get(i);
				// [�o�Ɏw��]."�����"=[�ۊǋ�}�X�^]."�ۊǋ�R�[�h"�̑��݃`�F�b�N
				tempstruct.setsetVEND_CD(issueStruct.getreadVEND_CD());
				tempstruct.setsetPLANT_CD(issueStruct.getreadPLANT_CD());
				List m_whList = entity.mreadM_WH.read(conn, tempstruct);
				// �x����ƈ�v��������ۊǂ����݂��Ȃ��ꍇ
				if (m_whList.isEmpty()) {
					// AE00068:�x����ƈ�v��������ۊǋ悪���݂��܂���B�ۊǋ�R�[�h�̓o�^���K�v�ł��B
					errCode = "AE00068";
					writeLog(ERROR,errCode, null, ERROR_NO + puchno);
					// �����𔲂���B
					return 2;
				}
			} // FOR END
		}
		return 0;
    }
    private boolean consInssue(String userId,String businessName,String plantCd,String puchno) throws FoundationException, SQLException{
    	String itemCdBak = struct.getITEM_CD();
		String vendlotno_bak = struct.getLOT_NO();
    	String itemQty = struct.getACPT_QTY();
    	double acptQty = Double.parseDouble(itemQty);
    	String lotNumberingTypBak = struct.geth_LOT_NUMBERING_TYP();
    	String lotControlFlgBak = struct.geth_LOT_CTRL_FLG();

		//�x���i�݂Ȃ��o�ɏ���
		BigDecimal planSum     = new BigDecimal(0);			// �����
		BigDecimal denominator = new BigDecimal(0);			// �o�Ɏw���P�ʐ����q
		BigDecimal numerator   = new BigDecimal(0);			// �o�Ɏw���P�ʐ�����

		boolean mHantei = false ;							// �݌ɐ��}�C�i�X�m�F�t���O
		boolean lHantei = false ;							// �݌ɐ��}�C�i�X�m�F�t���O

		// [�o�Ɏw��]�f�[�^���擾����B
		List issueInstList = entity.mT_ISSUE_INST.read(conn, struct);
		if (!issueInstList.isEmpty()){
			for (int i = 0; i < issueInstList.size(); i++ ) 
			{
				AE0060010Struct tempIssueStruct = (AE0060010Struct) issueInstList.get(i);
				// �g�p�\�萔�ʂ̌v�Z
				planSum = new BigDecimal(struct.getACPT_QTY());										// �����
				denominator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �o�Ɏw���P�ʐ����q
				numerator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �o�Ɏw���P�ʐ�����

				double beforeQty = 0;		// �X�V�O�莝�݌ɐ�(������)
				double afterQty = 0;		// �X�V��莝�݌ɐ�(������)
				double rcvissueQty = 0;		// �ۊǋ�ʓ��o�ɓ��o�ɐ�(������)

				// �݌ɐ��P�ʋ敪�̔���
				if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
				{
					// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
					// �v�Z���ɑg�ݍ��܂Ȃ��B
					// 1:�����Ǘ�
					if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
						"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
					{
						// �P�ʕ���A���q��0�̏ꍇ�B
						planSum = planSum.setScale(0,BigDecimal.ROUND_UP);
					} else {
						planSum = planSum.multiply(numerator).divide(denominator,0,BigDecimal.ROUND_UP).setScale(1);
					}
				} else {
					// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
					// �v�Z���ɑg�ݍ��܂Ȃ��B
					// 2:�����Ǘ�
					if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
						"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
					{
						planSum = planSum.setScale(4,BigDecimal.ROUND_HALF_UP);
					} else {
						// ������5�ʂ��l�̌ܓ�
						planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
					}
				}

				//�x���i�e�[�u���̎�L�[�����݂���ꍇ�̑Ή�(�i�ڍ\���ɋ[���i�ڂ�����A�����i�ڂ��݂Ȃ��o�ɂ���ꍇ)
				String parentITEM_CD = struct.getITEM_CD();
				//struct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
				//struct.setACPT_NO(struct.getACPT_NO());
				struct.setITEM_CD(tempIssueStruct.getreadITEM_CD());
				List PartSuppliedIssueList = entity.mreadT_PART_SUPPLIED_ISSUE.read(conn, struct);
				if(PartSuppliedIssueList.isEmpty()){
					//�x���i�g�p�e�[�u���ɓ����L�[�����݂��Ȃ��ꍇ
					if(parentITEM_CD != null && !"".equals(parentITEM_CD.trim())){
						String subITEM_CD = tempIssueStruct.getreadITEM_CD();
						// ���i�\�����|�W�g���쐬
                        ProductStructureRepository repository = new ProductStructureRepository(conn);
				        if(checkReverseRooping(repository, subITEM_CD, parentITEM_CD)){
				        	errCode = "AE20607";
				        	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
            				conn.rollback();
            				return false;
                        }
					}
					
					// 1�x���i�g�p�e�[�u��(T_PART_SUPPLIED_ISSUE)�̓o�^����
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());												// �����ԍ�
					struct.setsetACPT_NO(struct.getACPT_NO());														// �����
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());											// �x���i�i�ڔԍ�
					struct.setsetACPT_QTY(struct.getACPT_QTY());													// �����
					struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());									// ��ЃR�[�h
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());											// �����R�[�h
					struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());									// ����
					struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());						// ���Ԏ}��
					struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());										// �H��R�[�h
					struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());								// �o�Ɏw���ԍ�
					struct.setsetMRP_ODR_TYP(tempIssueStruct.getreadMRP_ODR_TYP());									// �i�ڎ�z�敪
					struct.setsetSUPPLIED_ISSUE_GNR_TYP("1");														// �����敪(1:�݂Ȃ��o��)
					struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));										// �g�p�\�萔��
					struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));											// �g�p�ϐ���
					struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �x���i�g�p�P�ʐ�����
					struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �x���i�g�p�P�ʐ����q
					struct.setsetSUPPLIED_DATE(struct.getACPT_DATE());												// �g�p��
					struct.setsetPART_SUPPLIED_COMMENT(null);														// �x���i�g�p���l
					entity.mT_PART_SUPPLIED_ISSUE.create(conn, struct);
				}else{
					///�x���i�g�p�e�[�u���ɓ����L�[�����݂���ꍇ
					AE0060010Struct tempSuppliedStruct = (AE0060010Struct) PartSuppliedIssueList.get(0);
					BigDecimal Denominator = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_DENOMINATOR());	// ���������x���i�g�p�P�ʐ�����
					BigDecimal Numerator   = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_NUMERATOR());		// ���������x���i�g�p�P�ʐ����q
					BigDecimal newDenominator = new BigDecimal(0); //�v�Z��̎x���i�g�p�P�ʐ�����
					BigDecimal newNumerator = new BigDecimal(0);  //�v�Z��̎x���i�g�p�P�ʐ����q
					BigDecimal gcd = new BigDecimal(0); //���ꓯ�m�̍ő����
					
					//�x���i�g�p�P�ʐ�����E���q�̌v�Z���s��
					if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
					{
						// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
						// �l��ύX���Ȃ��B
						// 1:�����Ǘ�
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							// �P�ʕ���A���q��0�̏ꍇ�B
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �x���i�g�p�P�ʐ�����
							struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �x���i�g�p�P�ʐ����q
						} else {
							gcd = getgcd(Denominator,denominator);//���ꓯ�m�̍ŏ����{�����X�V���镪��Ƃ��� 
							newDenominator = Denominator.multiply(denominator).divide(gcd,0,BigDecimal.ROUND_UP); //����i�ŏ����{���j
							newNumerator = Numerator.multiply(newDenominator).divide(Denominator,0,BigDecimal.ROUND_UP).add(numerator.multiply(newDenominator).divide(denominator,0,BigDecimal.ROUND_UP));//���q�̌v�Z
							//���ꓯ�m�̍ŏ����{�����X�V���镪��Ƃ���
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
							struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
						}
					} else {
						// [�o�Ɏw��]�e�[�u���̏o�Ɏw���P�ʐ����q�E���ꂪ0�̏ꍇ
						// �l��ύX���Ȃ��B
						// 2:�����Ǘ�
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// �x���i�g�p�P�ʐ�����
							struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// �x���i�g�p�P�ʐ����q
						} else {
							// ������5�ʂ��l�̌ܓ�
							if(Denominator.compareTo(denominator) >= 0){ //�傫���ق��̕���𕪕�Ƃ��čX�V����
								newDenominator = Denominator;
								newNumerator = Numerator.add((numerator.multiply(Denominator)).divide(denominator,4,BigDecimal.ROUND_UP));
							}else{
								newDenominator = denominator;
								newNumerator = numerator.add((Numerator.multiply(denominator)).divide(Denominator,4,BigDecimal.ROUND_UP))/*.setScale(4,BigDecimal.ROUND_HALF_UP))*/;
							}//�傫���ق��̕���𕪕�Ƃ��čX�V����
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
							struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
						}
					}
					BigDecimal SuppliedIssueQty = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_ISSUE_QTY());	// ���������g�p�\�萔��
					struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));				// �g�p�\�萔��
					struct.setsetTOTAL_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));					// �g�p�ϐ���

					if(newDenominator.compareTo(Decival) > 0 ||
						newNumerator.compareTo(Decival) > 0 ||
						SuppliedIssueQty.compareTo(Decival) > 0){//�o�^���鐔�l�������ӂꂪ�N����ꍇ
						errCode = "ZZ05109";
						writeLog(ERROR, errCode, null, ERROR_NO + puchno);
						return false;
					}//�o�^���錅���`�F�b�N 
					entity.mupdateT_PART_SUPPLIED_ISSUE.update(conn, struct);
				}
			    if(lotNoList != null){
                    lotNoList.clear();
                }
				//���b�g�Ǘ������ρA���b�g�Ǘ����s��
				if("1".equals(tempIssueStruct.getreadLOT_CONTROL_FLG())){
                    AE0060010Struct chkStruct = new AE0060010Struct();
                    chkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());           //�����ԍ�
                    chkStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());      //�i�ڔԍ�
                    chkStruct.setACPT_NO(struct.getACPT_NO());                   //�����
                    //�o�Ɏ��і��ׂɑ��݃`�F�b�N
                    if(entity.mcheckT_LOT_ISSUE_INST.check(conn, chkStruct)){
                	    AE0060010Struct tmpStruct = new AE0060010Struct();
                	    tmpStruct.setACPT_NO(struct.getACPT_NO());               //�����
                	    tmpStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());       //�����ԍ�
                	    tmpStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());  //�i�ڔԍ�
                	    tmpStruct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());    //�����ԍ�
                	    tmpStruct.setsetACPT_NO(struct.getACPT_NO());            //�����
                	    tmpStruct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());//�i�ڔԍ�
                    	//[�x���i�g�p]�̓Ǎ�
                	    List tmpList = entity.mSelectT_PART_SUPPLIED_ISSUE.read(conn, tmpStruct);
                	    if(tmpList != null && tmpList.size() > 0){
                		    AE0060010Struct tpsiStruct = (AE0060010Struct)tmpList.get(0);
                		    tmpStruct.setVEND_CD(tpsiStruct.getreadVEND_CD());                //�����R�[�h
            		        tmpStruct.setPLANT_CD(tpsiStruct.getreadPLANT_CD());              //�H��R�[�h
            		        tmpStruct.setISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD());    //�o�Ɏw���ԍ�
            		        tmpStruct.setsetISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD()); //�o�Ɏw���ԍ�
            		        tmpStruct.setsetSUPPLIED_DATE(tpsiStruct.getreadSUPPLIED_DATE()); //�g�p��
            		        //[���b�g�ʎg�p����]�̒ǉ�
            		        if(!insertT_LOT_USE_RSLT(tmpStruct,puchno)){
            		        	return false;
            		        }
                	    }else{
                	    	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���B
                	    	errCode = "AE20609";
                	    	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
						    conn.rollback();
						    return false;
                	    }
                    }else{
                    	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���B
                    	errCode = "AE20609";
                    	writeLog(ERROR, "AE20609", null, ERROR_NO + puchno);
					    conn.rollback();
					    return false;
                    }
                }
				// �A�ۊǋ�ʕi�ڍ݌�(T_ITEM_STOCK)�A�ۊǋ�ʐ��ԍ݌�(T_JOB_ODR_CD_STOCK)�̓o�^�E�X�V����
				// �i�ڎ�z�敪�ɂ��X�V�Ώۂ̕ύX
				// MRP�Ǘ��i  4:�ƭ�َ�z�i�ځA5:ۯĎ�z�i�ځA6:��ʎ�z�i�ځA7:�����_��z�i��
				// ���ԊǗ��i 1:���ԁA2 :�݌Ɉ����^����

				// �ۊǋ�R�[�h�擾
				struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());                       //�����R�[�h
				struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());                     //�H��R�[�h
				List mWhList = entity.mreadM_WH.read(conn, struct);
				AE0060010Struct tempWhStruct = (AE0060010Struct) mWhList.get(0);

				if (("4".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("5".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
				   ("6".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("7".equals(tempIssueStruct.getreadMRP_ODR_TYP())))
				{
					// MRP�Ǘ��i(�ۊǋ�ʕi�ڍ݌ɑΏ�)
					// �ۊǋ�ʕi�ڍ݌Ƀ`�F�b�N
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
					List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);

					// �X�V�`�F�b�N
					if (itemStList.isEmpty()) 
					{
						// �ۊǋ�ʕi�ڍ݌ɓo�^
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 01.�i�ڔԍ�
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 02.�ۊǋ�R�[�h
						struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 03.�H��R�[�h
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 04.�i�ڕʎ莝�݌ɐ�
						entity.minsertT_ITEM_STOCK.create(conn, struct);

						// �X�V�O�莝�݌ɐ��Z�b�g
						beforeQty = 0;								// �X�V�O
						afterQty = planSum.doubleValue() * -1;		// �X�V��
						rcvissueQty = planSum.doubleValue() * -1;	// ���o�ɐ�
						// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
						mHantei = true;
					} else {
						AE0060010Struct tempItemStStruct = (AE0060010Struct) itemStList.get(0);
						// �ۊǋ�ʕi�ڍ݌ɍX�V
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue()));						// 01.�i�ڕʎ莝�݌ɐ�
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// ����.�i�ڔԍ�
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// ����.�ۊǋ�R�[�h
						entity.mupdateT_ITEM_STOCK.update(conn, struct);

						// �X�V�O�莝�݌ɐ��Z�b�g
						beforeQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY());	// �X�V�O
						afterQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue();						// �X�V��
						rcvissueQty = planSum.doubleValue() * -1;										// ���o�ɐ�
						// �݌ɐ��̃}�C�i�X�`�F�b�N
						if (afterQty < 0 && lHantei == false)
						{
							// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
							mHantei = true;
							lHantei = true; 
						}
					}
				} else if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) {
					// ���ԊǗ��i(�ۊǋ�ʐ��ԍ݌ɑΏ�)
					// �ۊǋ�ʐ��ԍ݌Ƀ`�F�b�N
					struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// ����
					struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// ���Ԏ}��
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());								// �i�ڔԍ�
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());									// �ۊǋ�R�[�h
					List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

					// �X�V�`�F�b�N
					if (itemJobList.isEmpty()) 
					{
						// �ۊǋ�ʐ��ԍ݌ɓo�^
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// 01.����
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// 02.���Ԏ}��
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 03.�i�ڔԍ�
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 04.�ۊǋ�R�[�h
						struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 05.�H��R�[�h
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 06.���ԕʎ莝�݌ɐ�
						entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);
						// �X�V�O�莝�݌ɐ��Z�b�g
						beforeQty = 0;								// �X�V�O
						afterQty = planSum.doubleValue() * -1;		// �X�V��
						rcvissueQty = planSum.doubleValue() * -1;	// ���o�ɐ�
						// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
						mHantei = true;
					} else {
						AE0060010Struct tempJobStruct = (AE0060010Struct) itemJobList.get(0);
						// �ۊǋ�ʐ��ԍ݌ɍX�V
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue()));						// 01.���ԕʎ莝�݌ɐ�
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// ����.����
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// ����.���Ԏ}��
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// ����.�i�ڔԍ�
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// ����.�ۊǋ�R�[�h
						entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);
						// �X�V�O�莝�݌ɐ��Z�b�g
						beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());		// �X�V�O
						afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue();						// �X�V��
						rcvissueQty = planSum.doubleValue() * -1;										// ���o�ɐ�
						// �݌ɐ��̃}�C�i�X�`�F�b�N
						if (afterQty < 0 && lHantei == false)
						{
							// ����t���O��"true"(�}�C�i�X�f�[�^)�Z�b�g
							mHantei = true;
							lHantei = true; 
						}
					}
				} // END IF�ۊǋ�ʕi�ڍ݌ɁA�ۊǋ�ʐ��ԍ݌ɂ̓o�^�E�X�V����

				// �B�ۊǋ�ʓ��o��(T_RCV_ISSUE)�̓o�^����
				// ���o�ɔԍ��̔�, 
				Numbering collectNum = new Numbering(conn,
						CollectNumber.ISSUE_CD,
						userId,
						businessName,
						plantCd);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) 
				{
					//�̔Ԍ��ʂ��Ȃ�
					errCode = "ZZ01106";
					writeLog(ERROR, errCode, null, ERROR_NO + puchno);
					return false;
				}
				struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.���o�ɊǗ��ԍ�
				struct.setsetRCV_ISSUE_TYP("2");														// 02.���o�ɋ敪(2:�Œ�)
				struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());									// 03.�i�ڔԍ�
				struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());								// 04.�H��R�[�h
				struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.�ۊǋ�R�[�h

				// �i�ڎ�z�敪�ɂ��X�V�l�ύX
				if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
				    ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) 
				{
					struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// 06.����
					struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// 07.���Ԏ}��
				}
				struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.�����ԍ�
				struct.setsetACPT_NO(struct.getACPT_NO());												// 09.�����
				struct.setsetACPT_RSLT_CRCT_NO("0");													// 10.������ђ�����(0:�Œ�)
				struct.setsetINSPEC_RSLT_CRCT_NO("0");													// 11.�������ђ�����(0:�Œ�)
				struct.setsetWORK_ODR_CD(null);															// 12.��ƌv��ԍ�(null)
				struct.setWORK_IN_PROC_CD(null);														// 13.�d�|��ƃR�[�h(null)
				struct.setsetPARTIAL_PRD_NO("0");														// 14.�����(0:�Œ�)
				struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.��Ǝ��ђ�����(0:�Œ�)
				struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());						// 16.�o�Ɏw���ԍ�
				struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.���o�ɑO�݌ɐ�
				struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.���o�ɐ�
				struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.���o�Ɍ�݌ɐ�
				struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.���o�ɋ��z(0:�Œ�)
				struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.���o�ɔN����
				struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.���o�ɔ����敪(71:�Œ�)
				struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.���o�ɒ[��(0:�Œ�)
				struct.setsetDEFECT_CAUSE_CD(null);														// 24.���o�ɕs�Ǘ��R�R�[�h
				struct.setsetSTOCK_UPD_TYP("2");														// 25.�݌ɍX�V�敪(2:�Œ�)
				struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.���o�Ɋ����t���O
				struct.setsetOD_NO(tempIssueStruct.getreadOD_NO());										// 27.�I�[�_�f�}���h�ԍ�
				struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 28.���[�J���b�g�ԍ�
				struct.setsetRCV_ISSUE_COMMENT(null);													// 30.���o�ɔ��l(null)
				struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());							// 31.��ЃR�[�h
				struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());									// 32.�����R�[�h
				struct.setsetCONS_TYP(tempIssueStruct.getreadCONS_TYP());								// 33.�x���敪
				struct.setsetCONS_EXEC_DATE(null);														// 34.�L���x�����ђ��o��
				
				if(lotNoList != null && lotNoList.size() > 0){
				    for(int l=0; l<lotNoList.size(); l++){
					    if(l > 0){
						    no = null;
						    Numbering collectNum1 = new Numbering(conn,
					    			CollectNumber.ISSUE_CD,
					    			userId,
					    			businessName,
					    			plantCd);
				            no = collectNum1.getNo();
				            if (no == null || no.length() == 0) 
				            {
				                //�̔Ԍ��ʂ��Ȃ�
				            	errCode = "ZZ01106";
				            	writeLog(ERROR, "ZZ01106", null, ERROR_NO + puchno);
							    conn.rollback();
							    return false;
				            }
				            beforeQty = afterQty;
				        }
				        struct.setsetRCV_ISSUE_CTRL_CD(no);
				        struct.setsetLOT_NO((String)lotNoList.get(l));                                          // 29.�݌Ƀ��b�g�ԍ�
				        rcvissueQty = getDoubleValue((String)lotNoList.get(l+1)) * -1;
				        afterQty = beforeQty + rcvissueQty;
				        struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.���o�ɑO�݌ɐ�
				        struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.���o�ɐ�
				        struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.���o�Ɍ�݌ɐ�
				        entity.minsertT_RCV_ISSUE.create(conn, struct);
					    //���b�g�ʕi�ڍ݌ɓo�^�D�X�V
				        BizCommon bc = new BizCommon(conn, userId,businessName,plantCd);
				        List updateLotStockList = bc.excUpdateLotStockFd(no, "");
         
				        if(bc.getResultStatus().intValue() == 1){
				        }else{
				            if(updateLotStockList != null && updateLotStockList.size() > 0){
				            	errCode = (String)updateLotStockList.get(0);
				            	writeLog(ERROR, (String)updateLotStockList.get(0), null, ERROR_NO + puchno);
							    conn.rollback();
							    return false;
				            }else{
				            	errCode = "ZZ22001";
				            	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
							    conn.rollback();
							    return false;
				            }
				        }
				        //���b�g�g���[�X�ǉ�
				        if("1".equals(lotControlFlgBak)){
				        	if(acptQty != 0 && vendlotno_bak != null){
				        		  List lotTraceList = bc.excMakeLotTraceFd(tempIssueStruct.getreadITEM_CD(),       //[���b�g�ʎg�p����].�h�x���i�ڔԍ��h
		                                   								   (String)lotNoList.get(l),               //[���b�g�ʎg�p����].�h�݌Ƀ��b�g�ԍ��h
		                                   								   itemCdBak,                              //�h�����ԍ��h�Ō�������[�����c]�D�h�i�ڔԍ��h
				        				                                   vendlotno_bak,                          //[�������].�h�݌Ƀ��b�g�ԍ��h
				        				                                   "1");                                   //1:���
						            if(bc.getResultStatus().intValue() != 1){
						                if(lotTraceList != null && lotTraceList.size() > 0){
						                    errCode = (String)lotTraceList.get(0);
						                    writeLog(ERROR, errCode, null, ERROR_NO + puchno);
										    conn.rollback();
										    return false;
						                }else{
						                	errCode = "ZZ22016";
						                	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
										    conn.rollback();
										    return false;
						                } 
						            } else {
						            	struct.setFROM_ITEM_CD(tempIssueStruct.getreadITEM_CD());
						            	struct.setFROM_LOT_NO((String)lotNoList.get(l));
						            	struct.setTO_ITEM_CD(itemCdBak);
						            	struct.setTO_LOT_NO(vendlotno_bak);
						            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
						            	//[�������]�Ŕ����ԍ����擾
						            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
						            	if((formList != null && formList.size() > 0)){
						            		//�����ԍ����\�[�g���i�~���j�ɂ��A�P���ڂ̃��R�[�h���擾����B
							            	AE0060010Struct orderStruct = (AE0060010Struct) formList.get(0);
							            	//[���b�g�g���[�X].�g�������ԍ��h = [�������]."�����ԍ�"
							            	struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
						            	}else{
						            		struct.setFROM_PUCH_ODR_CD("");
						            	}
						            	// �m���b�g�g���[�X�n�̍X�V���s��
						            	entity.mupdateT_LOT_TRACE.update(conn, struct);	
					            }
				        	}
				        }
				        l = l+1;
				    }
				}else{
					//�݌Ƀ��b�g�ԍ�
					struct.setsetLOT_NO(null);
				    //�ۊǋ�ʓ��o�ɂ�ǉ�
					entity.minsertT_RCV_ISSUE.create(conn, struct);
				}
			} // END FOR
		}
		if (mHantei == true ){ 
			// AE00069:�x���i�݂Ȃ��o�ɂŎ����ۊǋ�̕i�ڂ܂���
			// ���Ԏ莝�݌ɐ����ꕔ�}�C�i�X�ƂȂ�܂����B
			writeLogFiles(WORNING,"AE00069");
		}

		// [���b�g�Ǘ�]�̍X�V
        if(vendlotno_bak != null && !"".equals(vendlotno_bak)){
            AE0060010Struct setStructForTlot = new AE0060010Struct();
            setStructForTlot.setsetLOT_NO(vendlotno_bak);               //�݌Ƀ��b�g�ԍ�
            setStructForTlot.setsetITEM_CD(itemCdBak);        //�i�ڔԍ�
            setStructForTlot.setsUser_ID(userId);
            entity.mupdateT_LOT_CTRL.update(conn, setStructForTlot);    //[���b�g�Ǘ�]�̍X�V
        }
        // �����Ԃɂ������ς݂̏ꍇ�ɁA�����Ϗo�Ɏc�������̍݌ɐ��ƂȂ���ѐ��Ŋ��������ꍇ
        if(StringUtil.Validate(struct.getJOB_ODR_CD()) &&
				"true".equals(struct.getc_COMPLETE())){
			// �����Ϗo�Ɏc�������ԍ݌Ɂi�莝�݌Ɂj�̏ꍇ
			// ��S�����������`�F�b�N����Ă��鎞�Ƀ`�F�b�N
			if(!(new IssueRemain(conn)).isEnoughAlcdQty(plantCd,
					struct.getITEM_CD(), struct.getJOB_ODR_CD(),
					0)){
				writeLogFiles(WORNING, "AE00080");
			}
		}
        
		return true;
    }
    /**
     *struct�ɕϐ���u���܂���
     */
    private void copyMedToStruct() throws FoundationException, SQLException{
    	struct.setPUCH_ODR_CD(m_med.getTEMP_PUCH_ODR_CD());                            // �����ԍ�
    	struct.setITEM_CD(m_med.getTEMP_ITEM_CD());                                    // �i�ڔԍ�
    	struct.setACPT_DATE(m_med.getTEMP_ACPT_DATE());                                // �����
    	//struct.setACPT_QTY(m_med.getTEMP_ACPT_QTY());                                  // �����
    	struct.setLOT_NO(m_med.getTEMP_LOT_NO());                                      // �݌Ƀ��b�g�ԍ�
    	struct.setVEND_LOT_NO(m_med.getTEMP_VEND_LOT_NO());                            // ���[�J���b�g�ԍ�
    	struct.setDLV_CD(m_med.getTEMP_DLV_CD());                                      // �[�i���ԍ�
    	struct.setACPT_RSLT_COMMENT(m_med.getTEMP_ACPT_RSLT_COMMENT());                // ������є��l
    	struct.setACPT_INSPC_TYP(m_med.getACPT_INSPC_TYP());						   // ��������敪
    	struct.setTAX_RATE_1(m_med.getTAX_RATE_1());								   // �ŗ�1
    	struct.setTAX_RATE_2(m_med.getTAX_RATE_2());								   // �ŗ�2
    	struct.setTAX_RATE_3(m_med.getTAX_RATE_3());								   // �ŗ�3
    	//����f�[�^��Ǎ�
    	AE0060010Struct tempStruct = new AE0060010Struct();
    	tempStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
    	tempStruct.setACPT_NO("1");
    	
    	//������ё��݃`�F�b�N
		List acptList = entity.mT_ACPT_RSLT.read(conn, tempStruct);
		List tempList = null;
		if (acptList.isEmpty()){
			tempList = entity.mFormFirst.read(conn, tempStruct);
		} else {
			tempList = entity.mFormAfter.read(conn, tempStruct);
		}
    	tempStruct = (AE0060010Struct) tempList.get(0);
    	if ("0".equals(tempStruct.getNON_NO_ITEM_FLG())){
    		struct.setITEM_NAME(null);                                                 //�i�ڔԍ�
    	} else {
        	struct.setITEM_NAME(tempStruct.getNON_NO_ITEM_NAME());                     // ���i�i�ږ�	
    	}
    	// �����
    	if (m_med.getTEMP_ACPT_QTY() != null && !"".equals(m_med.getTEMP_ACPT_QTY())){
    		struct.setACPT_QTY(m_med.getTEMP_ACPT_QTY());
    	} else {
    		struct.setACPT_QTY(tempStruct.getACPT_QTY());
    	}
    	// ����ꏊ
    	if (m_med.getTEMP_WH_CD() != null && !"".equals(m_med.getTEMP_WH_CD())){
        	struct.setWH_CD(m_med.getTEMP_WH_CD());
    	} else {
    		m_med.setTEMP_WH_CD(tempStruct.getWH_CD());
    		struct.setWH_CD(tempStruct.getWH_CD());
    	}
        // �P���敪
    	if (m_med.getTEMP_UNIT_COST_TYP() != null && !"".equals(m_med.getTEMP_UNIT_COST_TYP())){
    		struct.setUNIT_COST_TYP(m_med.getTEMP_UNIT_COST_TYP());
    	} else {
    		struct.setUNIT_COST_TYP(tempStruct.getUNIT_COST_TYP());
    	}
    	// �P��
    	if (m_med.getTEMP_UNIT_COST() != null && !"".equals(m_med.getTEMP_UNIT_COST())){
    		struct.setUNIT_COST(m_med.getTEMP_UNIT_COST());
    	} else {
    		struct.setUNIT_COST(tempStruct.getUNIT_COST());
    	}
    	//���H��
    	if (m_med.getTEMP_PROCESSING_COST() != null && !"".equals(m_med.getTEMP_PROCESSING_COST())){
    		struct.setPROCESSING_COST(m_med.getTEMP_PROCESSING_COST());
    	} else {
    		struct.setPROCESSING_COST(tempStruct.getPROCESSING_COST());
    	}
    	// �ޗ���
    	if (m_med.getTEMP_MATERIAL_COST() != null && !"".equals(m_med.getTEMP_MATERIAL_COST())){
    		struct.setMATERIAL_COST(m_med.getTEMP_MATERIAL_COST());
    	} else {
    		struct.setMATERIAL_COST(tempStruct.getMATERIAL_COST());
    	}
    	// ���̑��o��
    	if (m_med.getTEMP_OTHER_OVERHEADS() != null && !"".equals(m_med.getTEMP_OTHER_OVERHEADS())){
    		struct.setOTHER_OVERHEADS(m_med.getTEMP_OTHER_OVERHEADS());
    	} else {
    		struct.setOTHER_OVERHEADS(tempStruct.getOTHER_OVERHEADS());
    	}
    	// �l�����z
    	if (m_med.getTEMP_DISC_AMOUNT() != null && !"".equals(m_med.getTEMP_DISC_AMOUNT())){
    		struct.setDISC_AMOUNT(m_med.getTEMP_DISC_AMOUNT());
    	} else {
    		struct.setDISC_AMOUNT(tempStruct.getDISC_AMOUNT());
    	}
    	//�בփ��[�g
    	if (m_med.getTEMP_EXCH_RATE() != null && !"".equals(m_med.getTEMP_EXCH_RATE())){
    		struct.setEXCH_RATE(m_med.getTEMP_EXCH_RATE());
    	} else {
    		struct.setEXCH_RATE(tempStruct.getEXCH_RATE());
    	}
    	struct.setROUND_TYP(tempStruct.getROUND_TYP());								   // �������z�܂�ߋ敪
        struct.setTAX_ROUND_TYP(tempStruct.getTAX_ROUND_TYP());                        // �Œ[���敪
    	struct.setVEND_DECIMAL_FIG(tempStruct.getVEND_DECIMAL_FIG());                  // [�ʉ�].�h�����_�����h 
    	struct.seth_LOT_NUMBERING_TYP(tempStruct.geth_LOT_NUMBERING_TYP());            // ���b�g�ԍ��̔ԋ敪
    	struct.seth_LOT_CTRL_FLG(tempStruct.geth_LOT_CTRL_FLG());					   // ���b�g�Ǘ��t���O
    	struct.setNON_NO_ITEM_FLG(tempStruct.getNON_NO_ITEM_FLG());					   // ���i�����t���O
    	struct.setPLANT_CD(tempStruct.getPLANT_CD());                                  // �H��R�[�h
    	struct.setACPT_NO(tempStruct.getACPT_NO());                                    // �����
    	struct.setINSPC_WH_CD(m_med.getWH_CD());                                       // �����҂��ۊǋ�
        struct.setTAX_CD(tempStruct.getTAX_CD());                                      // �ŃR�[�h
    	struct.setJOB_ODR_CD(tempStruct.getJOB_ODR_CD());                              // ����
    	struct.setDRAW_CD(tempStruct.getDRAW_CD());                                    // �}�ʔԍ�
    	struct.setSPEC(tempStruct.getSPEC());										   // ���
    	struct.setUNIT_QTY_TYP(tempStruct.getUNIT_QTY_TYP());                          // �݌ɐ��P�ʋ敪
    	struct.setPUCH_ODR_QTY(tempStruct.getPUCH_ODR_QTY());                          // ������
    	struct.setSUM_ACPT_QTY(tempStruct.getSUM_ACPT_QTY());                          // ����݌v��
    	struct.setPUCH_ODR_SLIP_ISS_DATE(tempStruct.getPUCH_ODR_SLIP_ISS_DATE());      // ������
    	struct.setPUCH_ODR_DLV_DATE(tempStruct.getPUCH_ODR_DLV_DATE());                // �����[��
    	struct.setCONFIRM_DLV_DATE(tempStruct.getCONFIRM_DLV_DATE());                  // �����񓚔[��
    	struct.setWORK_IN_PROC_CD(tempStruct.getWORK_IN_PROC_CD());                    // ��ƃR�[�h
    	struct.setPROC_NAME(tempStruct.getPROC_NAME());                                // ��Ɩ�
    	struct.setPUCH_ODR_PERSON(tempStruct.getPUCH_ODR_PERSON());                    // �����S���҃R�[�h
    	struct.setPUCH_ODR_STS_TYP(tempStruct.getPUCH_ODR_STS_TYP());                  // ������ԋ敪
    	struct.setINSPC_CMPLT_FLG(tempStruct.getINSPC_CMPLT_FLG());                    // ���������t���O
    	struct.setSPL_ITEM_TYP(tempStruct.getSPL_ITEM_TYP());                          // �󋋕i�敪
    	struct.setPRODUCT_TYP(tempStruct.getPRODUCT_TYP());                            // ���i�敪
    	struct.setCOMPANY_CD(tempStruct.getCOMPANY_CD());                              // ��ЃR�[�h
    	struct.setPUCH_ODR_START_DATE(tempStruct.getPUCH_ODR_START_DATE());            // ���������
    	struct.setPUCH_ODR_MODIFY_COUNT(tempStruct.getPUCH_ODR_MODIFY_COUNT());        // �X�V��
    	struct.setPUCH_ODR_COMMENT(tempStruct.getPUCH_ODR_COMMENT());                  // �������l
    	struct.seth_WORK_ODR_CD(tempStruct.geth_WORK_ODR_CD());                        // ��ƌv��ԍ�
    	struct.seth_FINAL_PROC_CD(tempStruct.geth_FINAL_PROC_CD());                    // �ŏI�n��t���O
    }
    /**
     * ���[�s���O�`�F�b�N�B�t�W�J���s�����i�ڔԍ������� �L��
     * @param repository ���i�\�����|�W�g��
     * @param checkItem �Ώەi�ڔԍ�
     * @param item ��r����i�ڔԍ�
     * @return true:�L  false:��
    */
    private boolean checkReverseRooping(ProductStructureRepository repository, 
                   String targetItem, String item)
         throws SQLException
    {
        // �e�i�ڔԍ��ꗗ�擾
        ArrayList itemList = repository.reverseDeployment(item);
        checkItemList(itemList);

        for(int i = 0; i < itemList.size(); i++){
            if(targetItem.equals((String)itemList.get(i)) == false){
                // �e�i�ڔԍ��ꗗ����X�ɏ�̐e�i�ڎ擾
                boolean result = checkReverseRooping(repository, 
                                       targetItem, (String)itemList.get(i));
                if(result == true){
                    return true;
                }
            }else{
                return true;
            }
        }
        return false;
    }
    /** �d���`�F�b�N
     * @param itemList �d���`�F�b�N����i�ڃ��X�g
    */
    private void checkItemList(ArrayList itemList){
        List workList = new ArrayList(0);
        for(int i = 0; i < itemList.size(); i++){
            boolean result =true;
            String item_cd = (String)itemList.get(i);
            for(int t = 0; t < workList.size(); t++){
                if(item_cd.equals((String)workList.get(t)) == true){
                    result = false;
                }
            }
            if(result == true){
                workList.add(item_cd);
            }
        }

        itemList.clear();
        for(int i = 0; i < workList.size(); i++){
            itemList.add(workList.get(i));
        }
    }
    /**
	 * ����̍ő���񐔂����߂鏈��
	 * @param Bigvala
	 */
	public BigDecimal getgcd(BigDecimal Bigvala,BigDecimal Bigvalb)
	{
		BigInteger gcdval = new BigInteger("0");
		gcdval = Bigvala.toBigInteger().gcd(Bigvalb.toBigInteger()); 
		return new BigDecimal(gcdval);
	}
	/**
     * [���b�g�ʎg�p����]�̒ǉ�,[�o�Ɏ��і���]�̍X�V
     */
    private boolean insertT_LOT_USE_RSLT(AE0060010Struct s, String puchno) throws FoundationException,SQLException{  
    	try{
    	    String vendCd = s.getVEND_CD();                  //�����R�[�h
    	    String plantCd = s.getPLANT_CD();                //�H��R�[�h
    	    String issueInstCd = s.getsetISSUE_INST_CD();    //�o�Ɏw���ԍ�
    	    String puchOdrCd = s.getsetPUCH_ODR_CD();        //�����ԍ�
    	    String acptNo = s.getsetACPT_NO();               //�����
    	    String itemCd = s.getsetITEM_CD();               //�i�ڔԍ�
    	    String suppliedDate = s.getsetSUPPLIED_DATE();   //�g�p��
    	
    	    List qtyList = entity.mSelectQty.read(conn, s);
    	
    	    if(qtyList != null && qtyList.size() > 0){
    		    String supplied_issue_qty = ((AE0060010Struct)qtyList.get(0)).getreadSUPPLIED_ISSUE_QTY();  //[�x���i�g�p].�h�g�p�\�萔�ʁh
                AE0060010Struct whcdStruct = new AE0060010Struct();
                whcdStruct.setVEND_CD(vendCd);               //�����R�[�h
                whcdStruct.setPLANT_CD(plantCd);             //�H��R�[�h
                String wh_cdStr = getWh_cd(whcdStruct);      //�ۊǋ�R�[�h
            
                int listSize = qtyList.size();
                for(int i=0; i<listSize; i++){
            	    AE0060010Struct rStruct = (AE0060010Struct)qtyList.get(i);
                    String lot_no = rStruct.getreadLOT_NO();  //�݌Ƀ��b�g�ԍ�
                    String qty = rStruct.getreadQTY();        //[�o�Ɏ��і���].�h�o�Ɏx�����ʁh�|[�o�Ɏ��і���].�h�g�p�ϐ��ʁh
                    
                    if(lotNoList == null){
                    	lotNoList = new ArrayList();
                    }

                    AE0060010Struct insertStruct = new AE0060010Struct();
                    insertStruct.setsetSEQ_NO(getNextval());          //�I���N���V�[�P���X�̔�
                    insertStruct.setsetISSUE_INST_CD(issueInstCd);    //�o�Ɏw���ԍ�
                    insertStruct.setsetLOT_NO(lot_no);                //�݌Ƀ��b�g�ԍ�
                    insertStruct.setsetPUCH_ODR_CD(puchOdrCd);        //�����ԍ�
                    insertStruct.setsetACPT_NO(acptNo);               //�����
                    insertStruct.setsetITEM_CD(itemCd);               //�x���i�ڔԍ�
                    insertStruct.setsetWH_CD(wh_cdStr);               //�ۊǋ�R�[�h
                    insertStruct.setsetSUPPLIED_DATE(suppliedDate);   //�g�p��
                    insertStruct.setsUser_ID(struct.getsUser_ID());        //���[�U�R�[�h

                    //�Ōヌ�R�[�h
                    if(i == (listSize-1)){
                    	
                    	if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    		//�x���i�̃��b�g�g�p�����o�Ɏx�����ʂ𒴂��Ă��܂��B
                    		//�x���i�ڔԍ�{0},�݌Ƀ��b�g�ԍ�{0}
                    		writeLogFiles(WORNING, "AE20610");
                    		writeLogFiles(WORNING, "ZZ01006", "T_PART_SUPPLIED_ISSUE.ITEM_CD:" + itemCd);
                    		writeLogFiles(WORNING, "ZZ01006", "T_LOT_ISSUE_INST.LOT_NO:" + lot_no);
                    	}
                        lotNoList.add(lot_no);                                      //�݌Ƀ��b�g�ԍ�
                        lotNoList.add(supplied_issue_qty);                          //�g�p�ϐ���
                	    insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);     //�g�p�ϐ���
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty);  //�g�p�\�萔��
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);    //[���b�g�ʎg�p����]�̒ǉ�

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);           //�g�p�ϐ���
                        updateStruct.setISSUE_INST_CD(issueInstCd);                 //�o�Ɏw���ԍ�
                        updateStruct.setLOT_NO(lot_no);                             //�݌Ƀ��b�g�ԍ�
                        updateStruct.setITEM_CD(itemCd);                            //�o�ɕi�ڔԍ�
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                     //�����ԍ�
                        updateStruct.setsUser_ID(struct.getsUser_ID());                  //���[�U�R�[�h
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct);  //[�o�Ɏ��і���]�̍X�V
                        break;
                    }

                    if("0".equals(qty)){
                    	continue;
                    }
                    //[�x���i�g�p].�h�g�p�\�萔�ʁh>[�o�Ɏ��і���].�h�o�Ɏx�����ʁh�|[�o�Ɏ��і���].�h�g�p�ϐ��ʁh
                    if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    	//[�x���i�g�p].�h�g�p�\�萔�ʁh �| �P���ڂōX�V��������
                        supplied_issue_qty = Calculate.subtract(supplied_issue_qty, qty);
                        lotNoList.add(lot_no);
                        lotNoList.add(qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(qty);                   //�g�p�ϐ���
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(qty);                //�g�p�\�萔��
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[���b�g�ʎg�p����]�̒ǉ�

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(qty);                         //�g�p�ϐ���
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //�o�Ɏw���ԍ�
                        updateStruct.setLOT_NO(lot_no);                            //�݌Ƀ��b�g�ԍ�
                        updateStruct.setITEM_CD(itemCd);                           //�o�ɕi�ڔԍ�
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //�����ԍ�
                        updateStruct.setsUser_ID(struct.getsUser_ID());                 //���[�U�R�[�h
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[�o�Ɏ��і���]�̍X�V

                    }else{
                    	//[�o�Ɏ��і���].�h�o�Ɏx�����ʁh �| [�o�Ɏ��і���].�h�g�p�ϐ��ʁh �� [�x���i�g�p].�h�g�p�\�萔�ʁh
                    	//�̏ꍇ�� [�x���i�g�p].�h�g�p�\�萔�ʁh���Z�b�g����
                    	lotNoList.add(lot_no);
                        lotNoList.add(supplied_issue_qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);    //�g�p�ϐ���
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty); //�g�p�\�萔��
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[���b�g�ʎg�p����]�̒ǉ�

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);          //�g�p�ϐ���
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //�o�Ɏw���ԍ�
                        updateStruct.setLOT_NO(lot_no);                            //�݌Ƀ��b�g�ԍ�
                        updateStruct.setITEM_CD(itemCd);                           //�o�ɕi�ڔԍ�
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //�����ԍ�
                        updateStruct.setsUser_ID(struct.getsUser_ID());                 //���[�U�R�[�h
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[�o�Ɏ��і���]�̍X�V
                        break;
                    }
                }
    	    }else{
    	    	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���
    	    	writeLog(ERROR, "AE20609", null, ERROR_NO + puchno);
                return false;
            }
        }catch(Exception e){
        	e.printStackTrace();
        	//�x���i�ڂɑ΂���o�Ɏ��і��ׂ܂��̓��b�g�Ǘ��}�X�^�����݂��܂���
        	writeLog(ERROR, "AE20609", null, ERROR_NO + puchno);
            return false;
        }
        return true;
    }
    private double getDoubleValue(String numString){
    	if(numString == null || "".equals(numString.trim())){
    		return 0.0;
    	}
    	BigDecimal bd = new BigDecimal(0);
    	bd = new BigDecimal(numString);
    	return bd.doubleValue();
    }
    /**
	 * �I���N���V�[�P���X�̔�
	 */
	private String getNextval(){
		try{
		    List l = entity.mSelectSEQ_JF_RSLT.read(conn, struct);
		    if(l != null && l.size() > 0){
			    return ((AE0060010Struct)l.get(0)).getNEXTVAL();
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * [�x���i�g�p].�h�����R�[�h�h��[�ۊǋ�].�g�����R�[�h�h�A[�x���i�g�p].�h�H��R�[�h�h��[�ۊǋ�].�g�H��R�[�h�h�ƂȂ�MIN([�ۊǋ�].�h�ۊǋ�R�[�h�h)
	 */
    private String getWh_cd(AE0060010Struct s){
    	try{
    	    List list = entity.mSelectWH_CD.read(conn, s);
    	    if(list != null && list.size() > 0){
    		    return ((AE0060010Struct)list.get(0)).getreadWH_CD();
    	    }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return null;
    }
	/**
     * �o�b�`�p�����[�^�̃`�F�b�N���s���܂��B
     * @param batchType �o�b�`�����敪
     * @return ����̏ꍇtrue�A�s���̏ꍇfalse
     * @throws BatchAppException
     */
    private boolean checkArgs(String batchType) throws BatchAppException,FoundationException,SQLException {
     // �o�b�`�p�����[�^�̌`�����s���ȏꍇ
     if (m_med.getArgs().length != 7) {
    	 writeLog(ERROR, "ZZ09022");
      return false;
     }
     // �o�b�`�����敪��Null�̏ꍇ
     if (isNull(batchType)) {
    	 writeLog(ERROR, "ZZ09023");
      return false;
     }
     // �o�b�`�����敪���P�A�Q�ȊO�̏ꍇ
     if (!"1".equals(batchType) && !"2".equals(batchType)) {
    	 writeLog(ERROR, "ZZ09024");
      return false;
     }
     return true;
    }


	//////////////////////////////
	// �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���

	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
		 */
	public CtrlMain(medAE0160B001 med) throws BatchAppException
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
	public int main() throws BatchAppException,SQLException,FoundationException
	{

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
		BusinessLock Lock = null;     // �Ɩ����b�N
        int lockCancelKey = 0;	      // ���b�N�����L�[
        Numbering logCd = null;       //���O���ʃR�[�h�̔Ԃ̏���

        // metamorBase�Ɩ����b�Z�[�W
       
      
        // �X�g�A�h�v���V�[�W����
        String functionName = "AE0160B001";  // ������ю捞����
        // �p�����[�^�擾
		String[] args = m_med.getArgs();

		if(args.length >= 2){
           m_med.setUsername(args[1]);
        }
		String _sysBatchType = args[0];
	    String _sysUserCd    = args[1];
	    String _sysProgramId = args[2];
	    String _sysPlantCd   = args[3];
	    String _sysDateFrom  = args[4];
	    String _sysDateTo    = args[5];
	    String _businessOprDate = args[6];
        // �����`�F�b�N
        if (!checkArgs(_sysBatchType)) {
        	writeLog(ERROR, "ZZ09009");
         return BREAK;
        }

        try{	
		   // DB�ڑ��擾����
		   conn = m_conductor.m_transactionConn;			

		   // DB���b�Z�[�W�X�V����
		   conn_msg = m_conductor.m_defaultConn;
           // �Ɩ����b�Z�[�W�̏���
		   numbering = new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _sysPlantCd);
           businessMsgAcc = new BusinessMessageAccessor();
           businessMsg = new BusinessMessage();
           businessMsgAcc.init(conn_msg);
           businessMsg.setBusinessOperatingName(_sysProgramId);
           businessMsg.setUser(_sysUserCd);
           businessMsg.setPlantCode(_sysPlantCd);  
           // �Ɩ����b�N��������
           Lock = new BusinessLock(conn_msg, _sysUserCd, _sysPlantCd);
           lockCancelKey = Lock.doLock(_sysProgramId);  // �����L�[�̎擾
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}
           conn_msg.commit();
	       // SP���s
           spExecute( _sysUserCd,_sysProgramId, _sysPlantCd, _sysDateFrom,_sysDateTo,_businessOprDate);

           // �o�b�`������ɏI�������ꍇ
	       writeLog(INFOMATION, "AE00185",null,"(SBM0638)�Ǎ����� = ["+inputCount+"]�A�o�^���� = ["+insertCount+"]�A�G���[���� = ["+(inputCount-insertCount)+"]");
 		
		}catch (SQLException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// �Ɩ����b�N����
				Lock.doUnLock(_sysProgramId, lockCancelKey);
				conn_msg.commit();
				} catch (Exception e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "main", e.getMessage());
			}
		}
		return BREAK;
	}


	// ////////////////////////////

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
	 * @exception <
	 *                <�R�����g���L�q���Ă�������>>
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
		public medAE0160B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAE0160B001 med) throws BatchAppException
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
