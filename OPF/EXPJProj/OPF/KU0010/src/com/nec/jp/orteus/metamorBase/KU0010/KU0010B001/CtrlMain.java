/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0010.KU0010B001;

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
//======================================================================================
/*import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
//sunww�ǉ�20040730
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
/*sunww�폜20040730
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
*/
/*import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkDay;
import com.nec.jp.orteus.kis.common.ExchAmount.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;*/

import java.util.Date;

import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
//import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
//import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
//import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
//import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.util.Converter;
//======================================================================================
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.22 $ $Date: 2015/12/03 08:16:00 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2003/11/6),�V�K�쐬
 *         [ : <�o�[�W����> (<���t>),<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediator�N���X �C���X�^���X
	 */
	public medKU0010B001 m_med=null;

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
	public CtrlMain(medKU0010B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// �����o�ϐ������������܂�
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
	protected IDbConnection conn;

	//////////////////////////////
	// �R�[�h�W�F�l���[�^�́A�ȉ��̃R�[�h�ւ̏㏑�����s���܂���
	private String m_vMSG = "";				//���O�n�@�C���p���b�Z�[�W

	/** ExchAmount�@�O�݌v�Z�N���X�̃C���X�^���X */
	private ExchAmount exch = null;

	//�Œ�l
	private final static String m_kSYS_CLASS = "SALES";		//�V�X�e������
	private final static String m_kCTRL_CD = "SYSTEM";		//SYS�R���g���[���R�[�h
	private final static String m_kPLT_CLASS_CODE = "PLANT_BATCH";	//�H��R�[�h
	private final static String m_kRSN_CLASS_CODE = "UN_SHIP_RSN";	//�o�וs���R
	private final static String m_kLEED_CLASS_CODE = "SHIP_LT";	//���[�h�^�C��
	private final static String m_kNORMAL_DEPO_TYP = "10";		//�a���q�ɋ敪(�ʏ�)
		
	private String strUserId = null;


	//���ʐݒ�l
	//sww�e�X�g�ǉ�
	private String glb_plantCd ="";
	private String mv_PLANT_CD = "";				//�H��R�[�h
	private String mv_PLANT_CAL_CD = "7";				//�H��J�����_�[�R�[�h
	private String mv_BUSINEESS_OPR_DATE = "";			//�Ɩ��^�p��
	private String mv_COMPANY_CD = "";				//��ЃR�[�h
	private String mv_LEED_TIME = "";				//���[�h�^�C��
	private String mv_SCDL_DLV_DATE = "";				//�[���\���
	private String mv_UN_SHIP_RSN = "";				//�o�׎w���s���R
//	private double md_TRUE_SHIP_QTY;				//�o�׈�������(���ێw������)
	private double md_SHIP_ODR_AMOUNT;				//�o�׎w�����z
	private String mv_CASE_QTY;					//����
	private String mv_REST_QTY;					//�[��
	private String mv_TOTAL_CASE_QTY;				//����

	private double md_SHIP_QTY_SUM;		//�o�׎w�����ʂ̍��v��

	private double md_STOCK_ON_HAND_QTY;//�i�ڕʎ莝�݌ɐ�
	private double md_YUKOSU;//�L���݌ɐ�
	private String mv_WH_CD;//�ۊǋ�R�[�h

	//�o�׌v��̒l(�o�׌v��A�󒍖��ׁA�󒍊Ǘ�)
	//�o�׌v��TBL
	private String mv_ODR_NO = "";					//�󒍔ԍ�
	private String mv_PART_DLV_SEQ_NO = "";				//���[����
	private String mv_DESINATED_SHIP_DATE = "";			//�o�׎w���
	private String mv_DESINATED_SHIP_QTY = "";			//�o�׎w�萔��
	private String mv_REST_SHIP_ODR_QTY = "";			//�o�׎w���c����

	//�󒍖���TBL
	private String mv_EXCH_TYP = "";//�ב֎��sww�ǉ��󒍖��ׁA�M�݌v�Z�̈���

	private String mv_ODR_CTL_NO = "";				//�󒍊Ǘ��ԍ�
	private String mv_CUST_ODR_NO = "";				//���Ӑ撍���ԍ�7
	private String mv_CUST_CHRG_PSN_CD = "";		//�c�ƒS���҃R�[�h10
	private String mv_DLV_LOC_CD = "";				//�[�i�ꏊ�R�[�h12
	private String mv_DEPO_TYP = "";				//�a���q�ɋ敪13
	private String mv_UNIT_CD = "";					//�P��19
	private String mv_ODR_UNIT_PRICE = "";			//�󒍒P��20
	private String mv_CURRNCY_CD = "";				//�ʉ݃R�[�h23
	private String mv_REMARKS = "";					//���l28
	private String mv_CUS_DLV_KEY_CD = "";			//�[�i�L�[�ԍ�29
	//20040204�d�l�ǉ�
	private int mv_SHIP_CNT = 0;					//�o�׉�29
	private String mv_TRANSPORT_CD = "";			//�^���փR�[�h31

	private String mv_PART_NAME = "";					//�i��4
	private String mv_DLV_LOC_NAME_KANJI = "";			//�[�i�ꏊ��(����)9
	//20040107�d�l�ύX�p
	private String mv_BUYER_NAME = "";					//�w���S��10
	private String mv_DESINATED_DLV_DATE = "";			//�w��[��13
	private String mv_PUCH_ODR_QTY_TOTAL = "";			//����������15
	private String mv_DLV_ODR_QTY = "";					//�[���w������16
	private String mv_UNIT_CD_ORG = "";					//�`�[�E���x���p�P��(�ϊ��O�P��)18
	private String mv_INSPC_TYP = "";					//�����敪33
	private String mv_CLIENT_REMARK = "";				//�����Ҕ��l34
	private String mv_CLIENT_BARCODE_INF = "";			//�����҃o�[�R�[�h���35

	private String mv_PARTIAL_SHIP_INST_FLG = "";	//���[�o�׎w��F


	//�󒍊Ǘ�TBL
	private String mv_ITEM_CD = "";					//�i�ڔԍ�5
	private String mv_CUST_ITEM_CD = "";			//���Ӑ�i�ڔԍ�6
	private String mv_CUST_CD = "";					//���Ӑ�R�[�h8

	//�i�ڃ}�X�^
	private String mv_PKG_UNIT_QTY = "";			//�׎p�P�ʐ�24

	//���Ӑ�}�X�^
	private String mv_CUST_ANAME = "";				//���Ӑ於����9
	private String mv_DETAIL_ROUND_TYP = "";   //���׌v�Z�܂�ߋ敪

	//���Ӑ�[�i�ꏊ
	private String mv_TRANSPORT_LT = "";				//�^������
	private String mv_SHIP_WH_CD = "";				//�o�בq�ɃR�[�h33
	private String mv_DEPO_WH_CD = "";				//���o�a���ۊǋ�34


	//����Ōv�Z�֘A
	private String mv_TAX_KBN = "";					//�ō��݋敪
	private String mv_TAX_RATE = "";				//�ŗ�
	private String mv_TAX_START_DATE = "";			//�V����ŊJ�n��
	private String mv_ROUND_TYP = "";				//ROUND_TYP
	private String mv_TAX_AMOUNT = "";				//�����
	private String mv_SHIP_ODR_AMOUNT_TAX = "";		//�o�׎w�����z(�ō���)
	//Add Start 20131223 ma-jf
	private String mv_TAX_CD = "";                  //����ŃR�[�h
	private String mv_INSPC_ACPT_TYP = "";          //�����敪
	//Add End 20131223 ma-jf

	//�a���q�ɃR�[�h
	private String mv_TRANSFER_WH_CD = "";			//�U�֐�ۊǋ�

	private void doInit() throws BatchAppException{

		this.mv_EXCH_TYP = "";//�ב֎��
//delete by t-tou 2004/08/11
//		this.mv_COMPANY_CD = "";//���Џ��

		this.mv_ITEM_CD = "";
		this.mv_ODR_NO = "";
		this.mv_PART_DLV_SEQ_NO = "";
		this.mv_DESINATED_SHIP_DATE = "";
		this.mv_DESINATED_SHIP_QTY = "";
		this.mv_REST_SHIP_ODR_QTY = "";
		this.mv_ODR_CTL_NO = "";
		this.mv_CUST_CD = "";

		this.mv_CUST_ODR_NO = "";
		this.mv_UNIT_CD = "";
		this.mv_ODR_UNIT_PRICE = "";
		this.mv_CURRNCY_CD = "";
		this.mv_REMARKS = "";
		this.mv_TRANSPORT_CD = "";
		this.mv_PART_NAME = "";
		this.mv_DLV_LOC_NAME_KANJI = "";

		this.mv_CUS_DLV_KEY_CD = "";
		this.mv_DESINATED_DLV_DATE = "";
		this.mv_INSPC_TYP = "";

		//this.mv_CLIENT_REMARK_KANJI = "";

		this.mv_CLIENT_BARCODE_INF = "";
		this.mv_CUST_CHRG_PSN_CD = "";

		this.mv_DLV_LOC_CD = "";
		this.mv_DEPO_TYP = "";


		this.mv_PARTIAL_SHIP_INST_FLG = "";
		this.mv_BUYER_NAME = "";
		this.mv_PUCH_ODR_QTY_TOTAL = "";
		this.mv_DLV_ODR_QTY = "";
		this.mv_UNIT_CD_ORG = "";
		this.mv_SHIP_CNT = 0;

		this.mv_CUST_ITEM_CD = "";

		this.mv_CUST_ANAME = "";
		this.mv_DETAIL_ROUND_TYP = "";//���׌v�Z�܂�ߋ敪
//		this.mv_SLIP_TYPE = "";
//		this.mv_LABEL_TYP = "";
//		this.mv_PRICE_DISP_TYP = "";

		this.mv_PKG_UNIT_QTY = "";
		//this.mv_UNIT_WEIGHT = "";

		this.mv_TRANSPORT_LT = "";
		this.mv_SHIP_WH_CD = "";
		this.mv_DEPO_WH_CD = "";

		//this.md_WHSU = 0.0;

		this.mv_WH_CD = "";
		this.md_STOCK_ON_HAND_QTY = 0.0;
//		this.md_ALCED_QTY = 0.0;
		this.md_YUKOSU = 0.0;
//		this.mv_LOC_CD = "";

//		this.md_TRUE_SHIP_QTY =0.0;

		this.mv_UN_SHIP_RSN = "";

		this.mv_TRANSFER_WH_CD = "";
		//Add Start 20131223 ma-jf
		this.mv_TAX_CD = "";
		//Add End 20131223 ma-jf
	}

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
	 * �G���[/�x�����b�Z�[�W���O�o�͏���(IF���Ǘ��ԍ����ߍ���)
	 *
	 * @param String ���b�Z�[�W�R�[�h
	 * @param String IF���Ǘ��ԍ�
	 */
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException
	{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
		//System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
	}

//------------------------����Ŋ֘A--------------------------------BEGIN
//�ȑO�̏���ŋ��z�v�Z�̍폜sww20040730
//sww�ǉ��֐��J�n20040730
	/**
	 * ����ŋ��z�v�Z
	 * @param  String strCustCd ���Ӑ�R�[�h
	 * @param  String strTaxCd ����ŃR�[�h
	 * @param  String strAmount �o�׎w�����z
     * @param  String strCurrncyCd �ʉ݃R�[�h
	 * @return String rv ����ŋ��z
	 *
	 * */
	private String[] doCalcuTaxAmount(medKU0010B001 m_med, String strCustCd,
                              //Mod Start 20131223 ma-jf
	                          String strCompanyCd, String strTaxCd,
//	                          String strCompanyCd, String strItemCd,
	                          //Mod End 20131223 ma-jf
                              String strAmount, String strCurrncyCd)
                              throws BatchAppException, ParseException,
                              FoundationException, SQLException{

			String rv[] = new String[3];
            int decimalFig = 0;

            m_med.setstrCUR_CD(strCurrncyCd);
            if(m_med.gettblM_CUR().read() != SUCCESS){
            }else{
                if( m_med.gettblM_CUR().next() == false){
                } else {
                    decimalFig = Integer.parseInt(m_med.getstrDECIMAL_FIG());
                }
            }

			//����Ń}�X�^����擾
			String strTaxKbn = "";	//�ō��敪
			//String strStartDate ="";	//�V����ŃR�[�h�J�n��
		   	String strTaxRate[] = {"0", "0", "0"};	//�ŗ�
			//String strTaxRate[] = new String[3];	//�ŗ�
			String strRoundTyp = "";

			m_med.setstrTaxIN_COMPANYCD(strCompanyCd);
			m_med.setstrTaxIN_CUSTCD(strCustCd);
			//Add Start 20131223 ma-jf
			m_med.setstrTaxIN_TAXCD(strTaxCd);
			//Add End 20131223 ma-jf
			//Del Start 20131223 ma-jf
//		    m_med.setg_CUST_ITEM_CD(strItemCd);
			//Del End 20131223 ma-jf

	        if(m_med.getgetTax().read() != SUCCESS){
	        }else{
	        	if( m_med.getgetTax().next() == false){
				} else {
					this.mv_TAX_KBN = m_med.getstrTaxTAX_KBN();
					//strStartDate = m_med.getstrTaxSTART_DATE();
					this.mv_TAX_START_DATE = m_med.getstrTaxSTART_DATE();
					strRoundTyp = m_med.getstrTaxROUND_TYP();
					//Add Start 20131223 ma-jf
					this.mv_INSPC_ACPT_TYP = m_med.getstrINSPC_ACPT_TYP();
					//Add End 20131223 ma-jf

					//�ŗ��ݒ�(�V����ŊJ�n��<=�o�׎w����̏ꍇ�A�V�ŗ�)
					if(this.isNewTax()){
						strTaxRate[0] = this.plZero(m_med.getstrTaxNEW_TAX_1());
						strTaxRate[1] = this.plZero(m_med.getstrTaxNEW_TAX_2());
						strTaxRate[2] = this.plZero(m_med.getstrTaxNEW_TAX_3());
					} else {
						strTaxRate[0] = this.plZero(m_med.getstrTaxOLD_TAX_1());
						strTaxRate[1] = this.plZero(m_med.getstrTaxOLD_TAX_2());
						strTaxRate[2] = this.plZero(m_med.getstrTaxOLD_TAX_3());
					}
				}
			}
//Add by t-tou 2004/08/11
//System.out.println(strTaxRate[0]);
//System.out.println(strTaxRate[1]);
//System.out.println(strTaxRate[2]);

			//�[���敪��ROUND���s��
			ExchAmount ex = new ExchAmount(conn);

			for (int i = 0; i < 3; i ++) {
				String strIn = ex.doMul(strAmount,strTaxRate[i]);
//System.out.println("�v�Z�OstrIn==" + strIn);
				if ("0".equals(this.mv_TAX_KBN)){
					strIn = "0";
				} else if ("1".equals(this.mv_TAX_KBN)){
					strIn = String.valueOf(Double.parseDouble(strIn) / Double.parseDouble("100"));
				} else {
					strIn = String.valueOf(
						Double.parseDouble(strIn) / (Double.parseDouble("100")
						+ Double.parseDouble(strTaxRate[i])));
				}
//System.out.println("�v�Z��strIn==" + strIn);
				//rv[i] = this.doRound(strIn,strRoundTyp);
                if ("2".equals(strRoundTyp)) {
                    // �؂�グ
                    rv[i] = Calculate.ceil(strIn, decimalFig);
                }
                else if ("3".equals(strRoundTyp)) {
                    // �؂�̂�
                    rv[i] = Calculate.floor(strIn, decimalFig);
                }
                else {
                    // �l�̌ܓ�
                    rv[i] = Calculate.round(strIn, decimalFig);
                }
                //System.out.println("rv[" + i + "]:" + rv[i]);

			}
			return rv;
	}

//sww�ǉ��֐��J�n20040730�I��

	/**
	 * �V����ŃR�[�h�J�n���Ɣ�r
	 *
	 * @return true/false
	 */
	private boolean isNewTax() throws ParseException
	{
		boolean rv = false;

	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
		//�V����ŃR�[�h�J�n��
		GregorianCalendar date1 = new GregorianCalendar();
	//	date1.setTime(sdi.parse(this.mv_TAX_START_DATE));
		date1.setTime(Converter.strToDate(this.mv_TAX_START_DATE, "yyyy/MM/dd"));
		//�o�׎w���
		GregorianCalendar date2 = new GregorianCalendar();
	//	date2.setTime(sdi.parse(this.mv_DESINATED_SHIP_DATE));
		//Add Start 20131223 ma-jf
		if ("1".equals(this.mv_INSPC_ACPT_TYP)) {
        //Add End 20131223 ma-jf
		    date2.setTime(Converter.strToDate(this.mv_DESINATED_SHIP_DATE, "yyyy/MM/dd"));
		//Add Start 20131223 ma-jf
		} else {
			date2.setTime(Converter.strToDate(this.mv_SCDL_DLV_DATE, "yyyy/MM/dd"));
		}
		//Add End 20131223 ma-jf
		//�V����ŃR�[�h�J�n�� <= �o�׎w����̏ꍇ�A�V�ŗ�
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}

	/**
	 * �[���敪�ɂ���Đ����ϊ�
	 *
	 * @param	strIn 		�ϊ��l
	 * 			strRoundTyp	�[���敪
	 * @return rv	�ϊ�����
	 */
	private String doRound(String strIn, String strRoundTyp){
		String rv = strIn;

		int iPt;
		double d1 = 0.0;
		double d2 = 0.0;
		double d3 = 0.0;

		iPt = rv.indexOf(".");

		if(iPt != -1){
			String str1 = rv.substring(0, iPt);
			if(!"".equals(str1)){
				d1 = Double.parseDouble(str1);
			}
			d2 = Double.parseDouble(rv.substring(iPt+1));
			d3 = Double.parseDouble(rv.substring(iPt+1,iPt+2));
			if("2".equals(strRoundTyp)){
				if(d2 > 0){
					d1 += 1;
				}
			}else if("1".equals(strRoundTyp)){
				if(d3 > 4){
					d1 += 1;
				}
			}
			rv = d1 + "";
		}
		return rv;
	}

	/**
	 * .999�̏�����9.999�̌`���ɕϊ�(��F.12��0.12)
	 *
	 * @param	String strIn	�ϊ��l
	 * @return	String rv		�ϊ����ʒl
	 */
	private String plZero(String strIn){
		String rv = strIn;
		int ipt = rv.indexOf(".");

		if(ipt==0){
			rv="0"+rv;
		}
		return rv;
	}
//------------------------����Ŋ֘A--------------------------------END


	/**
	 * ���[�h�^�C��+���t�̎擾
	 *
	 * @param	IDbConnection conn		DB�R�l�N�V����
	 * 			String strUserId		���[�UID
	 * 			String strBusinessName	�r�W�l�X��
	 * 			String strKbn			���t�擾�敪(UNTIL/SDLC)
	 * @return true/false
	 */
	private boolean getPlusLeedDate(IDbConnection conn, String strUserId, String strBusinessName, String strKbn)
		throws BatchAppException
		//, ParseException,FoundationException
	{

		boolean rv = true;
		String strBaseDate = "";
		String strLeedTime = "";
		String strLT = "";
		String strUnSoDate = "";
		int iAddDays = 0;
		try{

	//		SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
	//		SimpleDateFormat sdc = new SimpleDateFormat("yyyyMMdd");
			// �^������ + �o�׎w��� + ���[�h�^�C��
			strLT = this.mv_LEED_TIME;
			strUnSoDate = this.mv_TRANSPORT_LT;
			iAddDays = Integer.parseInt(strLT) + Integer.parseInt(strUnSoDate) ;
			strLeedTime = String.valueOf(iAddDays);
			strBaseDate = this.mv_DESINATED_SHIP_DATE;


			GregorianCalendar inpDate = new GregorianCalendar();
		//	inpDate.setTime(sdi.parse(strBaseDate));
			inpDate.setTime(Converter.strToDate(strBaseDate, "yyyy/MM/dd"));

			java.util.Date wkDate = inpDate.getTime();

//System.out.println("00000000000000000");
			WorkCalendar wkd = new WorkCalendar(
					conn,
					strUserId,				//���[�U�R�[�h
					strBusinessName,			//�Ɩ��R�[�h
					this.glb_plantCd,					//�H��R�[�h
					wkDate,					//�Ώۓ��t
					Integer.parseInt(strLeedTime),		//���Z��
					false					//�O�|���t���O
					);
			wkDate = wkd.calcDate();				//�v�Z����

			if(wkDate == null){
				throw new Exception();
			}

			//�[���\���
			//	this.mv_SCDL_DLV_DATE = new String(sdi.format(wkDate));
			this.mv_SCDL_DLV_DATE = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
	
		}catch (Exception e) {
			rv = false;
		}finally{
			return rv;
		}
	}
	private String replaceNull(String strIn){

		String rv="";

		if(strIn != null){
			rv = strIn;
		}

		return rv;
	}
	/**
	 *�@LPAD����
	 *
	 * @return ����
	 */
	private String doLpad(String strIn, int iLen, String strBlank) throws BatchAppException{
		String rv = "";

		int istrInLen = strIn.length();

		if(istrInLen < iLen){
			for(int i=0; i<iLen-istrInLen; i++){
				rv += strBlank;
			}
		}
		rv += strIn;
		return rv;
	}

	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
	 * @return �Ȃ�
	 */
	public CtrlMain(medKU0010B001 med) throws BatchAppException
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
	 * @param �Ȃ�
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
		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������
//-------------------------------------------------------------------------------------
       		// ������
        	int nret = 0;
        	List WhCdList = new ArrayList();
        	List YukouSuList = new ArrayList();
        	boolean errFlg = false;

       		// �G���[���X�g
		//List errCodeList = new ArrayList();
//delete by t-tou
//        IDbConnection conn = null;

		String strBusinessName = null;
		String strPlantCd = null;
		String strDirectDlvFlg = null;

		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();

		Numbering logCd = null;		//���O���ʃR�[�h�̔Ԃ̏���
		
		// �Ɩ����b�N
		int lockCancelKey = -1;		//���b�N�L�����Z���L�[�̏���
		BusinessLock lock = null;	//���b�N����		

		// �����󂯎��
		String args[] = m_med.getArgs();
		//�Ɩ��R�[�h�A���[�U�R�[�h�A�H��R�[�h�A�݌Ƀ`�F�b�N�Ȃ��t���O
		strBusinessName = args[0];
		strUserId = args[1];
		strPlantCd = args[2];
		strDirectDlvFlg = args[3];

    if ("true".equals(strDirectDlvFlg)) {
     strDirectDlvFlg = "1"; 
    } else{
     strDirectDlvFlg = "0";
    }

		this.glb_plantCd=strPlantCd;

//System.out.println("�Ɩ���:" + args[0]);
//System.out.println("���[�U:" + args[1]);
//System.out.println("�H��:" + args[2]);


		try{
			// �V�X�e���H��R�[�h�擾
			String sysClassCode = strPlantCd;
			if (m_med.gettblSYS_CLASS_CODE().read() == SUCCESS) {
				if (m_med.gettblSYS_CLASS_CODE().next()) {
					sysClassCode = m_med.getstrSYS_CLASS_CODE();
				}
			}

			CoreTools.write("(SBM1090)sww�J�n");
			conn = m_conductor.m_transactionConn;
			//�o�b�`�J�n���b�Z�[�W�o�^
			try {
				conn.beginTransWeb();
				
				// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strPlantCd);
				
				// �R�l�N�V������n���āA�̔Ԃ̏���
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				
				// �Ɩ����b�N���s
				lock = new BusinessLock(conn, strUserId,strPlantCd);
				lockCancelKey = lock.doLock(m_med.getProgname());
				if ( lockCancelKey == -1) {
					// �Ɩ����b�Z�[�W�ǉ�
					String strMsgCd = "ZZ01001";
					businessMsg.setMessageCode(strMsgCd);
					businessMsgAcc.add(businessMsg);
					
					return BREAK;
				}
				
				// �Ɩ����b�Z�[�W�ǉ�
				String strMsgCd = "KU00001";
				String strDataString = "(SBM0604)<< �o�׎w���o�b�`�����J�n>>";
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
				}else{
					throw new Exception();
				}
				conn.commit();
			}catch(Exception e) {
				throw new Exception();
			}

			try{
//System.out.println("\n||******>>>> �o�׎w���o�b�`�X�^�[�g <<<******||");
//����������������������������������������������������������������������������������������������������������������������������������������������
//-----------------------------------------------------------------------------
//		�o�׎w�������i��������j
//------------------------------------------------------------------------------
//-----------------------------------------------------------------------------

				//sww�ǉ�20030730�J�n
				// =======================================
				// ���Џ��̎擾
				// =======================================
				if(m_med.getgetCompanyInfo().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetCompanyInfo().next() == false
					|| m_med.getstrCOMPANY_CD() == null
					|| "".equals(m_med.getstrCOMPANY_CD())){

					//���Џ�񂪖���/������
					this.writeLogMessage("KQ00039");
					throw new Exception();

				}
//System.out.println("���Џ��̎擾");
//System.out.println("\tCOMPANY_CD=" + m_med.getstrCOMPANY_CD());
				this.mv_COMPANY_CD = m_med.getstrCOMPANY_CD();

				//=======================================
				// �Ɩ����t�擾
				//=======================================
				if(m_med.getgetGyomuDate().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetGyomuDate().next() == false
					|| m_med.getstrBUSINESS_OPR_DATE() == null
					|| "".equals(m_med.getstrBUSINESS_OPR_DATE())){
					//�Ɩ����t��񂪖���/������
					this.writeLogMessage("KQ00026");
					throw new Exception();
				}
//System.out.println("�Ɩ����t�擾");
//System.out.println("\tBUSINESS_OPR_DATE=" + m_med.getstrBUSINESS_OPR_DATE());
				this.mv_BUSINEESS_OPR_DATE = m_med.getstrBUSINESS_OPR_DATE();

				//���Џ�񏈗��ƋƖ����t�̎擾�I��sww����20040802

				// =======================================
				// ���[�h�^�C���̎擾
				// =======================================
				//�V�X�e�����ށA�敪�R�[�hsales,ship_lt
				if(m_med.getleedTime().read() != SUCCESS){
					throw new Exception();
				}else{
					if(m_med.getleedTime().next() == false
						|| m_med.getleedTimeCODE() == null ){
						//�o�׏���L/T��񂪖���/������
						this.writeLogMessage("KQ00037");
						throw new Exception();
					}else{
						//�o�׏������[�h�^�C���̎擾
						this.mv_LEED_TIME = m_med.getleedTimeCODE();
					}
				}
//System.out.println("�o�׏������[�_�^�C�����擾����");
//System.out.println("||**���[�h�^�C���擾����(mv_LEED_TIME):"+this.mv_LEED_TIME);

				//=======================================
				// //�Ώۏo�׎w����̎擾
				//=======================================
//System.out.println("4)�^�p+���[�h�^�C���̎擾");

				// �o�׎w����� �Ώۏo�׎w���(�Ɩ��^�p��+���[�h�^�C�� )��ݒ肷��
////System.out.println("||**<"+this.mv_UNTIL_DATE);

				m_med.setreadTAnsDlvDateDESINATED_SHIP_DATE(this.mv_BUSINEESS_OPR_DATE);

				//���ЃR�[�h
				m_med.setreadTAnsDlvDateCOMPANY_CD(this.mv_COMPANY_CD);


				//=======================================
				// �o�׎w���s���X�g��������
				//=======================================
				m_med.setUN_SHIP_SEQ_NO("1");
				if(m_med.gettblT_UN_SHIP_LIST().delete()!=SUCCESS){
//System.out.println("�o�׎w���s���X�g�����������s");
					throw new Exception();
				}

				//=======================================
				//�o�׌v�悩��Ώۃf�[�^�𒊏o����if�J�n
				//=======================================
				if(m_med.gettblT_ANS_DLV_DATE().read()!=SUCCESS){
//System.out.println("||***�Ώۃf�[�^�擾���s");
					throw new Exception();
				}else{
					int iNum = 0;	//�e�X�g�p


					//=======================================
					//�o�׌v�悩��Ώۃf�[�^�̏���while�J�n
					//=======================================
				  try {
					while(m_med.gettblT_ANS_DLV_DATE().next()){
						//�i�ڔԍ���ROLLBACK���s������
						conn.beginTransWeb();
						this.doInit();//������

//System.out.println("\n||----------[("+(++iNum)+")�Ԗڏo�׎w���o�b�`�J�n]----------||");



						//=======================================
						//�o�׎w���o�^�p�̏o�׌v�悩��̃f�[�^�̎擾
						//=======================================
						this.mv_ODR_NO = replaceNull(m_med.getreadTAnsDlvDateODR_NO());							//�󒍔ԍ�2
						this.mv_PART_DLV_SEQ_NO = replaceNull(m_med.getreadTAnsDlvDatePART_DLV_SEQ_NO());		//���[����3
						this.mv_ITEM_CD = replaceNull(m_med.getreadTAnsDlvDateITEM_CD());						//�i�ڔԍ�5
						this.mv_DESINATED_SHIP_DATE = replaceNull(m_med.getreadTAnsDlvDateDESINATED_SHIP_DATE());//�o�׎w���14
						this.mv_REST_SHIP_ODR_QTY = replaceNull(m_med.getreadTAnsDlvDateREST_SHIP_ODR_QTY());	//�o�׎w���c���ʁi�X�V�p�j

						this.mv_DESINATED_SHIP_QTY = replaceNull(m_med.getreadTAnsDlvDateDESINATED_SHIP_QTY());	//�o�׎w������16



						//=======================================
						//�o�׎w���o�^�p�̏o�ז��ׂ���̃f�[�^�̎擾
						//=======================================
						// Mod Start 20140217 liu-chy
						//this.mv_EXCH_TYP = replaceNull(m_med.getreadTAnsDlvDateEXCH_TYP());//�ב֎��sww�ǉ��󒍖���,�M�݌v�Z�̈���
						this.mv_EXCH_TYP = replaceNull(m_med.getreadTAnsDlvDateEXCH_TYP_R());//�ב֎��sww�ǉ����Ӑ�}�X�^,�M�݌v�Z�̈���
						// Mod End 20140217 liu-chy

						this.mv_CUST_ODR_NO =replaceNull( m_med.getreadTAnsDlvDateCUST_ODR_NO());			//���Ӑ撍���ԍ�7
						this.mv_CUST_CHRG_PSN_CD = replaceNull(m_med.getreadTAnsDlvDateCUST_CHRG_PSN_CD());		//�c�ƒS���҃R�[�h10
						this.mv_DLV_LOC_CD = replaceNull(m_med.getreadTAnsDlvDateDLV_LOC_CD());			//�[�i�ꏊ�R�[�h12
						this.mv_DEPO_TYP = replaceNull(m_med.getreadTAnsDlvDateDEPO_TYP());				//�a���q�ɋ敪13
						this.mv_UNIT_CD = replaceNull(m_med.getreadTAnsDlvDateUNIT_CD());				//�P��19
													    //readTAnsDlvDateODR_UNIT_PRICE
						this.mv_ODR_UNIT_PRICE = replaceNull(m_med.getreadTAnsDlvDateODR_UNIT_PRICE());		//�󒍒P��20
						// Mod Start 20140217 liu-chy
						//this.mv_CURRNCY_CD = replaceNull(m_med.getreadTAnsDlvDateCURRNCY_CD());			//�ʉ݃R�[�h23
						this.mv_CURRNCY_CD = replaceNull(m_med.getreadTAnsDlvDateCUR_CD());			//�ʉ݃R�[�h23
						// Mod End 20140217 liu-chy
						this.mv_REMARKS =replaceNull( m_med.getreadTAnsDlvDateREMARKS());				//���l28
						this.mv_CUS_DLV_KEY_CD = replaceNull(m_med.getreadTAnsDlvDateCUS_DLV_KEY_CD());		//�[�i�L�[�ԍ�29
						//swwint����C��
						this.mv_SHIP_CNT = Integer.parseInt(m_med.getreadTAnsDlvDateSHIP_CNT());	//�o�׉�29
/*del g-matsumoto 2004.08.27
//add t-tou 2004/08/11
						String strTemp = String.valueOf(this.mv_SHIP_CNT + 1);
						if(strTemp.length() == 1){
							strTemp = "00" + strTemp;
						}else if(strTemp.length() == 2){
							strTemp = "0" + strTemp;
						}
						if(this.mv_CUS_DLV_KEY_CD.equals("")){
							this.mv_CUS_DLV_KEY_CD = this.mv_CUST_ODR_NO + "+" + strTemp;
						}else{
							this.mv_CUS_DLV_KEY_CD = this.mv_CUS_DLV_KEY_CD + "+" + strTemp;
						}
//end
//del-end g-matsumoto 2004.08.27 */
						//���Ӑ撍���ԍ��̒ǉ��K�v29
						this.mv_TRANSPORT_CD = m_med.getreadTAnsDlvDateTRANSPORT_CD();			//�^���փR�[�h31

						//�o�ד`�[�o�^�p�̏o�ז��ׂ���̃f�[�^�̎擾
						this.mv_PART_NAME = replaceNull(m_med.getreadTAnsDlvDatePART_NAME());			//�i��4
						this.mv_DLV_LOC_NAME_KANJI = replaceNull(m_med.getreadTAnsDlvDateDLV_LOC_NAME_KANJI());	//�[�i�ꏊ��(����)9
						this.mv_BUYER_NAME = replaceNull(m_med.getreadTAnsDlvDateBUYER_NAME());			//�w���S��10
						this.mv_DESINATED_DLV_DATE = replaceNull(m_med.getreadTAnsDlvDateDESINATED_DLV_DATE());	//�w��[��13
						this.mv_PUCH_ODR_QTY_TOTAL = replaceNull(m_med.getreadTAnsDlvDatePUCH_ODR_QTY_TOTAL());	//����������15
						this.mv_DLV_ODR_QTY = replaceNull(m_med.getreadTAnsDlvDateODR_QTY()); 			//�[���w������16
						this.mv_UNIT_CD_ORG = replaceNull(m_med.getreadTAnsDlvDateUNIT_CD_ORG()); 			//�P��(�`�[�E���x���p)18
						this.mv_INSPC_TYP = replaceNull(m_med.getreadTAnsDlvDateINSPC_TYP());			//�����敪33
						this.mv_CLIENT_REMARK = replaceNull(m_med.getreadTAnsDlvDateCLIENT_REMARK());		//�����Ҕ��l34
						this.mv_CLIENT_BARCODE_INF = replaceNull(m_med.getreadTAnsDlvDateCLIENT_BARCODE_INF());	//�����҃o�[�R�[�h���35
						//Add Start 201312223 ma-jf
						this.mv_TAX_CD = replaceNull(m_med.getreadTAnsDlvDateTAX_CD());                 //����ŃR�[�h
						//Add End 20131223 ma-jf
						//�L���݌ɐ��̎Z���`�F�b�N����
						this.mv_PARTIAL_SHIP_INST_FLG = replaceNull(m_med.getreadTAnsDlvDatePARTIAL_SHIP_INST_FLG());//���[�o�׎w��F

						//=======================================
						//�o�׎w���o�^�p�̎󒍊Ǘ�����̃f�[�^�̎擾
						//=======================================
						this.mv_ITEM_CD =      replaceNull(m_med.getreadTAnsDlvDateITEM_CD());			//�i�ڔԍ�5
						this.mv_CUST_ITEM_CD = replaceNull(m_med.getreadTAnsDlvDateCUST_ITEM_CD()); 		//���Ӑ�i�ڔԍ�6
						this.mv_CUST_CD =      replaceNull(m_med.getreadTAnsDlvDateCUST_CD());			//���Ӑ�R�[�h8

						//=======================================
						//�o�׎w���o�^�p�̓��Ӑ�}�X�^����̃f�[�^�̎擾
						//=======================================

						this.mv_CUST_ANAME =   replaceNull(m_med.getreadTAnsDlvDateCUST_ANAME());		//���Ӑ於����9
						//���׌v�Z�܂�ߋ敪sww�ǉ��M�݌v�Z�̈���
						this.mv_DETAIL_ROUND_TYP =   replaceNull(m_med.getreadTAnsDlvDateDETAIL_ROUND_TYP());

						//=======================================
						//�o�׎w���o�^�p�̕i�ڂ���̃f�[�^�̎擾
						//=======================================
						this.mv_PKG_UNIT_QTY = replaceNull(m_med.getreadTAnsDlvDatePKG_UNIT_QTY());		//�׎p�P�ʐ�24

						//=======================================
						//�o�׎w���o�^�p�̓��Ӑ�[�i�ꏊ����̃f�[�^�̎擾
						//=======================================
						this.mv_TRANSPORT_LT = replaceNull(m_med.getreadTAnsDlvDateTRANSPORT_LT());		//�^������15
//modified t-tou
//						this.mv_SHIP_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateCUST_ITEM_CD());		//�o�בq�ɃR�[�h33
//						this.mv_DEPO_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateCUST_ITEM_CD());		//���o�a���ۊǋ�34
						this.mv_SHIP_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateSHIP_WH_CD());		//�o�בq�ɃR�[�h33
						this.mv_DEPO_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateDEPO_WH_CD());		//���o�a���ۊǋ�34
//end t-tou

						//�[���\����̎擾15(�o�׌v��o�׎w�����A���Ӑ�[�i�ꏊ�̉^�������A�o�׏������[�h�^�C��)
						boolean returnPlusNouhinDate =
							this.getPlusLeedDate(conn, strUserId, strBusinessName,"SCDL");
						//this.mv_SCDL_DLV_DATE�̎擾

						//SWW�f�[�^�̎擾�̊���20040802
						
						
						
						// �P�C�O�c�@2007/10/30
						m_med.setreadTJOBODRODRALCPLANT_CD(strPlantCd);
						// ���Ԏ󒍕R�t�Ɏ󒍔ԍ��`�b�N
						if(m_med.gettblT_JOB_ODR_ODR_ALC().read() != SUCCESS){
							throw new Exception();
						}else{
							if(m_med.gettblT_JOB_ODR_ODR_ALC().next()){
								//�󒍊Ǘ��̕i�ڔԍ��A���Ӑ�[�i�ꏊ�̏o�בq�ɃR�[�h�̌�������
								m_med.setreadTJOBODRCDSTOCKITEM_CD(this.mv_ITEM_CD);
								m_med.setreadTJOBODRCDSTOCKIN_WHCD(this.mv_SHIP_WH_CD);
								if(m_med.gettblT_JOB_ODR_CD_STOCK().read() != SUCCESS){
									//System.out.println("--------------------------------------");
									throw new Exception();
								}else{
									if(m_med.gettblT_JOB_ODR_CD_STOCK().next()){
										//�ۊǋ�R�[�h
										this.mv_WH_CD = m_med.getreadTJOBODRCDSTOCK_WHCD();
										//�L���݌ɐ�=�i�ڎ莝�݌ɐ�-�o�׎w�����ʂ̍��v��
										this.md_YUKOSU =  Double.parseDouble(m_med.getreadTJOBODRCDSTOCK_PBL_SHIP_QTY());
									}
								}
							}else{
								//=======================================
								//�ۊǋ�ʕi�ڍ݌ɂ���i�ڕʎ莝�݌ɐ��̎擾
								//=======================================
								//�󒍊Ǘ��̕i�ڔԍ��A���Ӑ�[�i�ꏊ�̏o�בq�ɃR�[�h�̌�������
								m_med.setreadTItemStockIN_ITEMCD(this.mv_ITEM_CD);
								m_med.setreadTItemStockIN_WHTYP(this.mv_SHIP_WH_CD);
								//�o�׎w���o�^���Ԃ�null�ɐݒ�
								m_med.setstrJOB_ODR_CD("");
								if(m_med.gettblT_ITEM_STOCK().read()!=SUCCESS){
									throw new Exception();
								}else{
									if(m_med.gettblT_ITEM_STOCK().next()){
									//�ۊǋ�R�[�h
									this.mv_WH_CD = m_med.getreadTItemStockWH_CD();
									//�L���݌ɐ���
									this.md_YUKOSU = Double.parseDouble(m_med.getreadTItemStockYUKOSU());
									}
								}
							}
						}
						//�@�P�C�O�c�@2007/10/30

						

						/*//=======================================
						//�o�׎w�����o�׎w�����ʂ̍��v���̎擾
						//=======================================
						if(m_med.gettblT_SHIP_ODR_CHK().read()!=SUCCESS){
							throw new Exception();
						}else{
							//�o�׎w���L���݌ɐ��Z�o�̂��߂ɓǍ�
							if(m_med.gettblT_SHIP_ODR_CHK().next()){
								//�o�׎w�����o�׎w�����ʂ̍��v���̎擾
								this.md_SHIP_QTY_SUM = Double.parseDouble(m_med.getstrSHIP_QTY_SUM());
							}
						}

						//=======================================
						//�L���݌ɐ�=�i�ڎ莝�݌ɐ�-�o�׎w�����ʂ̍��v��
						//=======================================
						this.md_YUKOSU = this.md_STOCK_ON_HAND_QTY - this.md_SHIP_QTY_SUM ;*/
//System.out.println("�L���݌ɐ� ==" + this.md_YUKOSU);

						//�o�׎w�����ʂƏo�׎w���s���ʂ̎Z�o
						double md_CHKYUKOSU = this.md_YUKOSU;//�L���݌ɐ�
						double md_CHKSHIP_QTY= Double.parseDouble(this.mv_REST_SHIP_ODR_QTY);//�o�׎w�萔

						//=======================================
						//���򏈗��F�o�׎w�����Əo�׎w���s���ʂ̎Z�o
						//=======================================
						//�o�׎w����
						double md_CALCULATION_SHIP_QTY = 0;
						//�o�׎w���s����
						double md_DISABLE_QTY = 0;

/*2005�E08�E19�@update�@start*/
						if ( (md_CHKYUKOSU >= md_CHKSHIP_QTY) || (strDirectDlvFlg == "1")) { 
							//�L���݌ɐ�>=�o�׎w�萔�A���邢�͍݌Ƀ`�F�b�N���Ȃ��Ƃ�
							//�o�׎w�萔�A�O
							md_CALCULATION_SHIP_QTY = md_CHKSHIP_QTY;
							md_DISABLE_QTY = 0 ;
						}else if (  md_CHKYUKOSU < md_CHKSHIP_QTY ) {
							if  ( ("1".equals(this.mv_PARTIAL_SHIP_INST_FLG)) && (strDirectDlvFlg == "0")){ 
							  //�L���݌ɐ�<�o�׎w�萔�@���@���[OK�@���@�݌Ƀ`�F�b�N����Ƃ�
								//�L���݌ɐ��A�o�׎w�萔-�L���݌ɐ�
								md_CALCULATION_SHIP_QTY = md_CHKYUKOSU;
								md_DISABLE_QTY = md_CHKSHIP_QTY - md_CHKYUKOSU;
							} else if( ("0".equals(this.mv_PARTIAL_SHIP_INST_FLG)) && (strDirectDlvFlg == "0")) { 
                //�L���݌ɐ�<�o�׎w�萔�@���@���[�s�@���@�݌Ƀ`�F�b�N����Ƃ�
                //�O�A�o�׎w�萔
								md_CALCULATION_SHIP_QTY = 0;
								md_DISABLE_QTY = md_CHKSHIP_QTY ;
							}
						}
/*2005�E08�E19�@update�@end*/

						//=======================================
						//�o�׎w����>0�̏ꍇ�A�o�^�X�V����
						//=======================================
						if ( md_CALCULATION_SHIP_QTY > 0 ) {

							Numbering SHIP_ODR_NO = null;		//�o�׎w���ԍ��̔Ԃ̏���
							Numbering SLIP_CD = null;			//�`�[�ԍ��̔Ԃ̏���

							// =======================================
							//�o�׎w���̓o�^
							// =======================================
							//�o�׎w���ԍ��A�`�[�ԍ��������̔Ԃ���
							SHIP_ODR_NO = new Numbering(conn,Numbering.SHIP_ODR_NO,strUserId,strBusinessName, sysClassCode);
							SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,strUserId,strBusinessName, sysClassCode);
							String strSHIP_ODR_NO = SHIP_ODR_NO.getNo();
							String strSLIP_CD = SLIP_CD.getNo();

							m_med.setcreTShipOdrSHIP_ODR_NO(strSHIP_ODR_NO);//�o�׎w���ԍ�1
							m_med.setcreTShipOdrSLIP_CD(strSLIP_CD);//�`�[�ԍ�4
//							m_med.setcreTShipOdrSLIP_CD(strSHIP_ODR_NO);//�o�׎w���ԍ�1
//							m_med.setcreTShipOdrSHIP_ODR_NO(strSLIP_CD);//�`�[�ԍ�4

							m_med.setcreTShipOdrODR_NO(this.mv_ODR_NO);			//�󒍔ԍ�2
							m_med.setcreTShipOdrPART_DLV_SEQ_NO(this.mv_PART_DLV_SEQ_NO);	//���[����3
							m_med.setcreTShipOdrITEM_CD(this.mv_ITEM_CD);			//�i�ڔԍ�5

							m_med.setcreTShipOdrCUST_ITEM_CD(this.mv_CUST_ITEM_CD);		//���Ӑ�i�ڔԍ�6
							m_med.setcreTShipOdrCUST_ODR_NO(this.mv_CUST_ODR_NO);		//���Ӑ撍���ԍ�7
							m_med.setcreTShipOdrCUST_CD(this.mv_CUST_CD);			//���Ӑ�R�[�h8
							m_med.setcreTShipOdrCUST_NAME(this.mv_CUST_ANAME);		//���Ӑ於��9
							m_med.setcreTShipOdrCUST_CHRG_PSN_CD(this.mv_CUST_CHRG_PSN_CD);	//�c�ƒS���҃R�[�h10

							m_med.setcreTShipOdrSHIP_ODR_ISS_PSN_CD(strUserId);	//���s�S���҃R�[�h11���[�U�h�c
							m_med.setcreTShipOdrDLV_LOC_CD(this.mv_DLV_LOC_CD);		//�[�i�ꏊ�R�[�h12
							m_med.setcreTShipOdrDEPO_TYP(this.mv_DEPO_TYP);			//�a���q�ɋ敪13
							m_med.setcreTShipOdrDESINATED_SHIP_DATE(this.mv_DESINATED_SHIP_DATE);	//�o�׎w���14

							//�[���\����̎擾�m�F�K�v
							//if(!this.getPlusLeedDate(conn, strUserId, strBusinessName, "SCDL"))
								//{ throw new Exception(); }

							m_med.setcreTShipOdrSCDL_DLV_DATE(this.mv_SCDL_DLV_DATE);	//�[���\���15 //2004.1.6�ǉ�

							m_med.setcreTShipOdrSHIP_QTY(md_CALCULATION_SHIP_QTY+"");		//�o�׎w������16,17=0,18=0
							m_med.setcreTShipOdrUNIT_CD(this.mv_UNIT_CD);			//�P��19
							m_med.setcreTShipOdrUNIT_PRICE(this.mv_ODR_UNIT_PRICE);		//�P��20

							ExchAmount ex = new ExchAmount(conn);
							//�o�׎w�����ʁ��P�����o�׎w�����z21
//modified by t-tou
//System.out.println("this.mv_ODR_UNIT_PRICE ===" + this.mv_ODR_UNIT_PRICE);
//System.out.println("this.md_CALCULATION_SHIP_QTY ===" + md_CALCULATION_SHIP_QTY);
							String strAmount = ex.doMul(this.mv_ODR_UNIT_PRICE,md_CALCULATION_SHIP_QTY+"") ;
//							String strAmount = ex.doMul(this.mv_ODR_UNIT_PRICE,this.md_TRUE_SHIP_QTY+"") ;

							//�o�׎w�����z21
							m_med.setcreTShipOdrSHIP_ODR_AMOUNT(strAmount);
							this.md_SHIP_ODR_AMOUNT = Double.parseDouble(strAmount);

							String strShipOdrAmount = "";//���Ԓl
			                String strShipOdrAmountExchRates = "";//�o�׎w�����z�i�M�݁j

							// =======================================
							//���ʊ֐��𗘗p���A�M�݂̊��Z(�o�׎w���̓o�^)sww�C���K�v
							// =======================================
			                if(ex.doMarume(strAmount, this.mv_COMPANY_CD, this.mv_CURRNCY_CD, this.mv_EXCH_TYP,
			                						this.mv_DETAIL_ROUND_TYP, this.mv_BUSINEESS_OPR_DATE)){
			                    strShipOdrAmount = ex.getS_EXCH_AMOUNT();
			                }
//add by t-tou
//System.out.println("strShipOdrAmount ===" + strShipOdrAmount);
//System.out.println("this.mv_COMPANY_CD ===" + this.mv_COMPANY_CD);
//System.out.println("this.mv_CURRNCY_CD ===" + this.mv_CURRNCY_CD);
//System.out.println("this.mv_EXCH_TYP ===" + this.mv_EXCH_TYP);
//System.out.println("this.mv_DETAIL_ROUND_TYP ===" + this.mv_DETAIL_ROUND_TYP);
//System.out.println("this.mv_BUSINEESS_OPR_DATE ===" + this.mv_BUSINEESS_OPR_DATE);
			                if(ex.doExchAmount(strShipOdrAmount, this.mv_COMPANY_CD, this.mv_CURRNCY_CD,
			                			this.mv_EXCH_TYP, this.mv_DETAIL_ROUND_TYP, this.mv_BUSINEESS_OPR_DATE)){
			                    strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
//System.out.println("�idoExchAmount�j�M�݂Ɋ��Z�����A���Z��l ===" + strShipOdrAmountExchRates);
			                }
							//�o�׎w�����z�i�M�݁j�����ʊ֐��d�l���Z�����M��22
							m_med.setcreTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES(strShipOdrAmountExchRates);

							m_med.setcreTShipOdrCURRNCY_CD(this.mv_CURRNCY_CD);		//�ʉ݃R�[�h23
							m_med.setcreTShipOdrPKG_UNIT_QTY(this.mv_PKG_UNIT_QTY);		//�׎p�P�ʐ�����24
							//25,26,27�v��Ȃ�
							m_med.setcreTShipOdrREMARKS(this.mv_REMARKS);			//���l28
							//2004.2.4�ǉ�15
/* add 2004.08.27 g-matsumoto */
							if(this.mv_CUS_DLV_KEY_CD.equals("")){
								this.mv_CUS_DLV_KEY_CD = strSHIP_ODR_NO;
							}
/* add-end 2004.08.27 g-matsumoto */
							m_med.setcreTShipOdrDLV_KEY_NO(this.mv_CUS_DLV_KEY_CD);		//�[�i�L�[�ԍ�29,30=0

							m_med.setcreTShipOdrTRANSPORT_CD(this.mv_TRANSPORT_CD);		//�^���փR�[�h31
							//�A���`�ԋ敪32�v��Ȃ�
							m_med.setcreTShipOdrALLCT_WH_CD(this.mv_SHIP_WH_CD);		//�����ۊǋ�33
							//�U�֌��ۊǋ�34
							if ("10".equals(this.mv_DEPO_TYP) ){
								m_med.setcreTShipOdrTRANSFER_WH_CD("");
							}else if ("20".equals(this.mv_DEPO_TYP) ){
								m_med.setcreTShipOdrTRANSFER_WH_CD(this.mv_DEPO_WH_CD);
							}

/* add-start 2005.08.11 */
							//�����t���O
							if (strDirectDlvFlg=="1"){
								m_med.setcreTShipOdrDIRECT_DLV_FLG("1");
							}else{
								m_med.setcreTShipOdrDIRECT_DLV_FLG("0");
							}
/* add-end 2005.08.11 */
							//����
							m_med.setcreTShipOdrJOB_ODR_CD(m_med.getstrJOB_ODR_CD());

							//�R�T����S�O�܂�0,1,0,0,0,0

							//�o�׎w�����R�[�h�쐬
							if(m_med.gettblT_SHIP_ODR().create()!=SUCCESS){
//System.out.println("||***!!�o�׎w�����R�[�h�̍쐬���s!!!");
							    throw new Exception();
							}

							// =======================================
							// �󒍖��� TBL �̍X�V(20040701�ǉ�)
							// =======================================
							//�󒍔ԍ��P�ʂŏo�׉񐔂��X�V����B(�o�׉�+1,���[��+1)
							m_med.setuptOdr_IN_ODRNO(this.mv_ODR_NO);

							//�󒍖��׃��R�[�h�X�V
							if(m_med.gettblT_ODR().update()!=SUCCESS){
//System.out.println("||***!!�󒍖��׃R�[�h�̍X�V���s!!!");
							    throw new Exception();
							}


							// =======================================
							//�o�ד`�[�̓o�^
							// =======================================
							m_med.setcreTShipSlipSLIP_CD(strSLIP_CD);//�`�[�ԍ�
							m_med.setcreTShipSlipITEM_CD(this.mv_ITEM_CD);				//�i�ڔԍ�2
							m_med.setcreTShipSlipCUST_ITEM_CD(this.mv_CUST_ITEM_CD);		//���Ӑ�i�ڔԍ�3
							m_med.setcreTShipSlipPART_NAME(this.mv_PART_NAME);			//��ʕi��4
							m_med.setcreTShipSlipCUST_ODR_NO(this.mv_CUST_ODR_NO);			//���Ӑ撍���ԍ�5

							m_med.setcreTShipSlipCUST_CD(this.mv_CUST_CD);				//���Ӑ�R�[�h6
							m_med.setcreTShipSlipCUST_NAME(this.mv_CUST_ANAME);			//���Ӑ於��7
							m_med.setcreTShipSlipDLV_LOC_CD(this.mv_DLV_LOC_CD);			//�[�i�ꏊ�R�[�h8
							m_med.setcreTShipSlipDLV_LOC_NAME_KANJI(this.mv_DLV_LOC_NAME_KANJI);	//�[�i�ꏊ��(����)9
							m_med.setcreTShipSlipBUYER_NAME(this.mv_BUYER_NAME);			//�w���S��10

							//2004.2.4�ύX
							m_med.setcreTShipSlipCUS_DLV_KEY_CD(m_med.getcreTShipOdrDLV_KEY_NO());	//�[�i�L�[�ԍ�11
							m_med.setcreTShipSlipDESINATED_SHIP_DATE(this.mv_DESINATED_SHIP_DATE);	//�o�׎w���12
							m_med.setcreTShipSlipDESINATED_DLV_DATE(this.mv_DESINATED_DLV_DATE);	//�w��[��13
							//�[���\����̎擾
							//if(!this.getPlusLeedDate(conn, strUserId, strBusinessName, "SCDL"))
							//{ throw new Exception(); }

							m_med.setcreTShipSlipSCDL_DLV_DATE(this.mv_SCDL_DLV_DATE);		//�[���\���14
							m_med.setcreTShipSlipPUCH_ODR_QTY_TOTAL(this.mv_PUCH_ODR_QTY_TOTAL);//����������15

							m_med.setcreTShipSlipDLV_ODR_QTY(this.mv_DLV_ODR_QTY);			//�[���w������16
							m_med.setcreTShipSlipSHIP_ODR_QTY(md_CALCULATION_SHIP_QTY+"");	//�o�׎w������17
							m_med.setcreTShipSlipUNIT_CD(this.mv_UNIT_CD_ORG);				//�P��18
							m_med.setcreTShipSlipUNIT_PRICE(this.mv_ODR_UNIT_PRICE);		//�P��19

							m_med.setcreTShipSlipINSPC_TYP(this.mv_INSPC_TYP);					//�����敪33
							//20040202�d�l�ύX���󒍖��ׂ̔����Ҕ��l��ݒ�
							m_med.setcreTShipSlipCLIENT_REMARK_KANJI(this.mv_CLIENT_REMARK);	//�����Ҕ��l(����)34
							m_med.setcreTShipSlipCLIENT_BARCODE_INF(this.mv_CLIENT_BARCODE_INF);//�����҃o�[�R�[�h���35

							//���[�o��F36 �폜F37 0,0

							// =======================================
							//����ŋ��z�v�Z(�o�ד`�[�̓o�^)  �Q�O�ȉ���fields�̌v�Z
							// =======================================
							//sww�C��20040729�J�n
//Add by t-tou
//System.out.println("this.mv_CUST_CD = "+this.mv_CUST_CD);
//System.out.println("this.mv_COMPANY_CD = "+this.mv_COMPANY_CD);
//System.out.println("this.mv_CUST_ITEM_CD = "+this.mv_CUST_ITEM_CD);
//System.out.println("strShipOdrAmountExchRates = "+strShipOdrAmountExchRates);
							String taxAmount[] = this.doCalcuTaxAmount(m_med, this.mv_CUST_CD,
			                                                           //Mod Start 20131223 ma-jf
//											                           this.mv_COMPANY_CD, this.mv_CUST_ITEM_CD,
											                           this.mv_COMPANY_CD, this.mv_TAX_CD,
											                           //Mod End 20131223 ma-jf
                                                                       strShipOdrAmount, this.mv_CURRNCY_CD);

							//sww�C��20040729�I��
							m_med.setcreTShipSlipTAX_AMOUNT_1(taxAmount[0]);	// �Ŋz�P 29
							m_med.setcreTShipSlipTAX_AMOUNT_2(taxAmount[1]);	// �Ŋz�Q 30
							m_med.setcreTShipSlipTAX_AMOUNT_3(taxAmount[2]);	// �Ŋz�R 31

							//23,24,25,27,28�l�̂����A
							m_med.setcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT("0");// �O�őΏۋ��z
							m_med.setcreTShipSlipINTERNAL_TAX_SALES_AMOUNT("0");// ���őΏۋ��z
							m_med.setcreTShipSlipTAXFREE_SALES_AMOUNT("0");		// ��ېőΏۋ��z
							m_med.setcreTShipSlipEXTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i�O�Łj
							m_med.setcreTShipSlipINTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i���Łj

							//�Ŋz1 �{ �Ŋz2 �{ �Ŋz3 �i�a�a�a�j
                            String sTmpTax = Calculate.add(taxAmount[0], taxAmount[1]);
                            sTmpTax = Calculate.add(sTmpTax, taxAmount[2]);
                            double tmpTax = Double.parseDouble(sTmpTax);
							//double tmpTax = Double.parseDouble(taxAmount[0])
							//			+Double.parseDouble(taxAmount[1])
							//			+Double.parseDouble(taxAmount[2]);

							if ("1".equals(this.mv_TAX_KBN)){
								//����Ŋz�i�O�Łj27
								m_med.setcreTShipSlipEXTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
								//�O�őΏۋ��z 23
								m_med.setcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
							} else
							if ("5".equals(this.mv_TAX_KBN) || "9".equals(this.mv_TAX_KBN)){
								//����Ŋz�i���Łj28
								m_med.setcreTShipSlipINTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
								//���őΏۋ��z 24
								m_med.setcreTShipSlipINTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
							} else
							if ("0".equals(this.mv_TAX_KBN)){
								//��ېőΏۋ��z 25
								m_med.setcreTShipSlipTAXFREE_SALES_AMOUNT(strShipOdrAmount);
							}

							//����ŋ��z 21 �̌v�Z	�i�a�j
							tmpTax = Double.parseDouble(m_med.getcreTShipSlipEXTERNAL_TAX_AMOUNT())
									+Double.parseDouble(m_med.getcreTShipSlipINTERNAL_TAX_AMOUNT());
							//����ŋ��z 21
							m_med.setcreTShipSlipTAX_AMOUNT(String.valueOf(tmpTax));

							// �Ŕ�������z 26		�i�a�a�a���j
							tmpTax = Double.parseDouble(m_med.getcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT())
									+Double.parseDouble(m_med.getcreTShipSlipINTERNAL_TAX_SALES_AMOUNT())
									+Double.parseDouble(m_med.getcreTShipSlipTAXFREE_SALES_AMOUNT())
									-Double.parseDouble(m_med.getcreTShipSlipINTERNAL_TAX_AMOUNT());
							m_med.setcreTShipSlipTAX_CREDIT_SALES_AMOUNT(String.valueOf(tmpTax));

                            // �Ŕ�������z�i�M�݁j32
                            String tmpTaxExchRates = "0";
                            if(ex.doExchAmount(String.valueOf(tmpTax), this.mv_COMPANY_CD, this.mv_CURRNCY_CD,
                                               this.mv_EXCH_TYP, this.mv_DETAIL_ROUND_TYP, this.mv_BUSINEESS_OPR_DATE)){
                                tmpTaxExchRates = ex.getS_EXCH_AMOUNT();
                                //System.out.println("�i�Ŕ�������z�j�M�݂Ɋ��Z�����A���Z�O�l ===" + tmpTax);
                                //System.out.println("�i�Ŕ�������z�j�M�݂Ɋ��Z�����A���Z��l ===" + tmpTaxExchRates);
                            }
							m_med.setcreTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT(tmpTaxExchRates);

							//�o�׎w�����z 20 //sww�C��20040729
							m_med.setcreTShipSlipSHIP_ODR_AMOUNT(String.valueOf(tmpTax));

							//�o�׎w�����z(�ō�) 22 �i�a�j
							tmpTax = tmpTax + Double.parseDouble(m_med.getcreTShipSlipTAX_AMOUNT());
							m_med.setcreTShipSlipSHIP_ODR_AMOUNT_TAX(String.valueOf(tmpTax));

							//sww�ǉ��v�Z20040730�I��
							//�ȑO�̋��z�v�Z��sww�폜20040730�I��
							//�o�ד`�[���R�[�h�쐬
							if(m_med.gettblT_SHIP_SLIP().create()!=SUCCESS){
								//System.out.println("||***!!�o�ד`�[���R�[�h�̍쐬���s!!!");
							    throw new Exception();
							}

							// =======================================
							// �o�׌v��s�a�k�̍X�V
							// =======================================
							//�󒍔ԍ�
							m_med.setupTAnsDlvDateIN_ODRNO(this.mv_ODR_NO);
							//���[����
							m_med.setupTAnsDlvDateIN_PARTDLVSEQNO(this.mv_PART_DLV_SEQ_NO);
							//sww�C���K�vdouble,String
							this.mv_REST_SHIP_ODR_QTY = String.valueOf(Double.parseDouble(this.mv_REST_SHIP_ODR_QTY) - md_CALCULATION_SHIP_QTY);
							//�o�׎w���c����
							m_med.setupTAnsDlvDateREST_SHIP_ODR_QTY(this.mv_REST_SHIP_ODR_QTY);
							if (Double.parseDouble(this.mv_REST_SHIP_ODR_QTY) == 0) {
								//�o�׎w�������t���O
								m_med.setupTAnsDlvDateSHIP_ODR_CMPLT_FLG("1");
							}else{
								//�o�׎w�������t���O
								m_med.setupTAnsDlvDateSHIP_ODR_CMPLT_FLG("0");
							}

							//�o�׌v��̍X�V
							if(m_med.gettblT_ANS_DLV_DATE().update()!=SUCCESS){
								//System.out.println("||***!!�o�׌v�惌�R�[�h�̍X�V���s!!!");
							    throw new Exception();
							}
						}

						//=======================================
						//�o�׎w���s����>0�̏ꍇ�A�o�^�X�V����
						//=======================================
						if ( md_DISABLE_QTY > 0) {

//System.out.println("�o�׎w���s���X�g���R�[�h�쐬 �J�n");
							m_med.setcreTUnShipListCUST_CD(this.mv_CUST_CD);			//���Ӑ�R�[�h2
							m_med.setcreTUnShipListACPT_ODR_CD(this.mv_ODR_NO);			//�󒍔ԍ�3
							m_med.setcreTUnShipListPART_DLV_SEQ_NO(this.mv_PART_DLV_SEQ_NO);	//���[����4
							m_med.setcreTUnShipListITEM_CD(this.mv_ITEM_CD);			//�i�ڔԍ�5

							m_med.setcreTUnShipListUN_SHIP_QTY(md_DISABLE_QTY+"");		//�o�׎w���s����6
//							this.mv_UN_SHIP_RSN = "KU00032 �w��ۊǋ悩��݌ɕt���̂��ߏo�׏o���܂���" ;

							// 04.08.16add by g.matsumoto �R�l�N�V������n���āA�̔Ԃ̏���
							logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
							// �o�׎w���Ώۃf�[�^�̎擾�Ɏ��s���܂����B
							String strMsgCd = "KU00032";
							String strDataString = "(SBM0605)�󒍔ԍ�[" + this.mv_ODR_NO + "] ���[����[" + this.mv_PART_DLV_SEQ_NO + "]";
							businessMsgAcc.init(conn);
							businessMsg.setBusinessOperatingName(strBusinessName);
							businessMsg.setUser(strUserId);
							businessMsg.setPlantCode(strPlantCd);
							businessMsg.setLogCode(logCd.getNo());
							businessMsg.setData(strDataString);
							businessMsg.setMessageCode(strMsgCd);
							businessMsgAcc.add(businessMsg);
							if(this.getSysMsg(strMsgCd)){
								CoreTools.write(strMsgCd+" "+this.m_vMSG);
							}else{
								throw new Exception();
							}
							this.mv_UN_SHIP_RSN = strMsgCd+" "+this.m_vMSG;

							m_med.setcreTUnShipListUN_SHIP_RSN(this.mv_UN_SHIP_RSN);	//�o�׎w���s���R7
//04.08.29.MOD						m_med.setcreTUnShipListWH_CD(this.mv_WH_CD);				//�ۊǋ�R�[�h8
							m_med.setcreTUnShipListWH_CD(this.mv_SHIP_WH_CD);				//�ۊǋ�R�[�h8
//System.out.println("m_med.getcreTUnShipListCUST_CD" + m_med.getcreTUnShipListCUST_CD());
//System.out.println("m_med.setcreTUnShipListACPT_ODR_CD" + m_med.getcreTUnShipListACPT_ODR_CD());
//System.out.println("m_med.setcreTUnShipListPART_DLV_SEQ_NO" + m_med.getcreTUnShipListPART_DLV_SEQ_NO());
//System.out.println("m_med.setcreTUnShipListITEM_CD" + m_med.getcreTUnShipListITEM_CD());
//System.out.println("m_med.setcreTUnShipListUN_SHIP_QTY" + m_med.getcreTUnShipListUN_SHIP_QTY());
//System.out.println("m_med.setcreTUnShipListUN_SHIP_RSN" + m_med.getcreTUnShipListUN_SHIP_RSN());
//System.out.println("m_med.setcreTUnShipListWH_CD" + m_med.getcreTUnShipListWH_CD());

							//�o�׃��x�����R�[�h�쐬
							if(m_med.gettblT_UN_SHIP_LIST().create()!=SUCCESS){
//System.out.println("||***!!�o�׎w���s���X�g���R�[�h�̍쐬���s!!!");
							    throw new Exception();
							}
						}


//-----------------------------------------------------------------------------
//		�������捞�����i�����܂Łj
//-----------------------------------------------------------------------------
//System.out.println("||----------[("+iNum+")�Ԗڂ̏o�׎w���o�b�`����������]--||");
//System.out.println("\n******>>>>�o�׎w���o�b�`��������END <<<<******");
						//�Ώ��i�ڔԍ����o�b�`����������ɏI������ꍇ COMMIT����
						conn.commit();
					}//while-end�Ǎ��I��
				   } catch (Exception e) {
					   // �G���[�ڍ׏���ݒ�
					   String strDataString = "(SBM0605)�󒍔ԍ�[" + this.mv_ODR_NO + "] ���[����[" + this.mv_PART_DLV_SEQ_NO + "]";
					   businessMsg.setData(strDataString);
					   throw e;
				   }
					if(iNum==0){
//System.out.println("\n||*****�o�׎w���Ώۃf�[�^������܂���I�I");
					}
				}//if-end�Ǎ������I��
				//�o�b�`����END
			}catch(Exception e) {
//add by t-tou 2004/08/11
		e.printStackTrace();
//end
				try {
					errFlg = true;
					//conn.rollback();
					conn.rollback();
					// �R�l�N�V������n���āA�̔Ԃ̏���
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
					// �o�׎w���Ώۃf�[�^�̎擾�Ɏ��s���܂����B
					String strMsgCd = "KU00010";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsgAcc.add(businessMsg);
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG);
					}else{
						throw new Exception();
					}
					conn.commit();
				} catch (SQLException ex) {
					ex.printStackTrace();
					errFlg = true;
				} catch (FoundationException ex) {
					ex.printStackTrace();
					errFlg = true;
				}
			}
//System.out.println("\n||******>>>> ("+this.mv_BUSINEESS_OPR_DATE+")�̏o�׎w���o�b�`����END <<<<******||");
	    } catch (Exception e) {
			try {
				errFlg = true;
				conn.rollback();
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
				// �o�׎w���o�b�`�����ɂĒv���I�ȃG���[���������܂����B
				String strMsgCd = "KU00003";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				}
				conn.commit();
			} catch (SQLException ex) {
				errFlg = true;
				ex.printStackTrace();
			} catch (FoundationException ex) {
				errFlg = true;
				ex.printStackTrace();
			}
	    } finally {
				//�o�b�`�I�����b�Z�[�W�o�^
				try {
					
					// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strPlantCd);
					
					// �R�l�N�V������n���āA�̔Ԃ̏���
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					
					//�Ɩ����b�N����
					boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
					if (result == false) {
						// �Ɩ����b�Z�[�W�ǉ�
						String strMsgCd = "ZZ01004";
						businessMsg.setMessageCode(strMsgCd);
						businessMsgAcc.add(businessMsg);
					}
					
					if (lockCancelKey != -1) {
						String strMsgCd = null;
						// �Ɩ����b�Z�[�W�ǉ�
						if(errFlg) {
							strMsgCd = "KU00111"; // �ُ�I���ꍇ
						} else {
							strMsgCd = "KU00002"; // ����I���ꍇ
						}
						String strDataString = "(SBM0606)<< �o�׎w���o�b�`�����I�� >>";
						businessMsg.setMessageCode(strMsgCd);
						businessMsg.setData(strDataString);
						businessMsgAcc.add(businessMsg);
						if(this.getSysMsg(strMsgCd)){
							CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
						}
					}
					
					conn.commit();
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (FoundationException ex) {
					ex.printStackTrace();
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
		public medKU0010B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKU0010B001 med) throws BatchAppException
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
