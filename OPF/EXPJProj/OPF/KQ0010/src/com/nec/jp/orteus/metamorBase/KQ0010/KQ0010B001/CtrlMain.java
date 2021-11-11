/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001;

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
//-----------------------------------------------------------------------------
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
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.util.Converter;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.23 $ $Date: 2015/12/03 08:12:34 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�@(2003/11/29),�V�K�쐬
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
	public medKQ0010B001 m_med=null;

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
	public CtrlMain(medKQ0010B001 med, BatchAppConductor cdr) throws BatchAppException
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
//-----------------------------------------------------------------------------

	/** ���{�~�̒ʉ݃R�[�h */
	private String jpCurrency = null;

	/** �o�׏���L/T */
	private int shukka_jyunbi_day = 0;

	/** �Z�[���ݒ�� */
	private int tan_nouki_day = 0;

	/** EDI ���敪�R�[�h */
	private final static String INFO_TYP_0201  = "0201";	//���v�v����
	private final static String INFO_TYP_0203  = "0203";	//�\�񒍕����
	private final static String INFO_TYP_0501  = "0501";	//�����������
	private final static String INFO_TYP_0502  = "0502";	//�m�蒍�����
	private final static String INFO_TYP_0503  = "0503";	//�ύX�������
	private final static String INFO_TYP_0504  = "0504";	//����������

	/** RN ���敪�R�[�h */
	private final static String INFO_TYP_03A04      = "03A04";		//�����V�K
	private final static String INFO_TYP_03A08_CHG  = "03A08_CHG";	//�����ύX
	private final static String INFO_TYP_03A08_OFF  = "03A08_OFF";	//�����Ő�
	private final static String INFO_TYP_03A08_CMP  = "03A08_CMP";	//�������[
	private final static String INFO_TYP_03A09      = "03A09";		//�����폜
	private final static String INFO_TYP_04A04      = "04A04";		//����

	/** �[���� ���敪�R�[�h */
	private final static String INFO_TYP_0702      = "0702";		//�[����

	/** �����敪�l */
	private final static String ODR_TYP_MIKOMI = "1";
	private final static String ODR_TYP_NAIJI = "2";
	private final static String ODR_TYP_KAKUTEI = "3";

	/** �a���敪�l */
	private final static String YOTAKU_NORMAL = "10";
	private final static String YOTAKU_YOTAKU = "20";

	/** �����敪 */
	private final static String	PROC_TYP_NEW = "1";		//�V�K
	private final static String	PROC_TYP_UPD = "2";		//�ύX
	private final static String	PROC_TYP_CAN = "3";		//����E�폜
	private final static String	PROC_TYP_STP = "4";		//�Ő�
	private final static String	PROC_TYP_CPL = "5";		//���[
	private final static String	PROC_TYP_RSV = "6";		//�\��

	/** �V�X�e�������敪 */
	private final static String	SYS_PROC_TYP_MI = "0";
	private final static String	SYS_PROC_TYP_SUMI = "1";
	private final static String	SYS_PROC_TYP_NG = "2";
	private final static String	SYS_PROC_TYP_ETC = "9";

	/** �V�X�e���p�����[�^�ǂݏo���L�[ */
	private final static String	SYSCLASS_JP_CUR = "JP_CUR";
	private final static String	SYSCLASS_SHUKKA_LT = "SHIP_LT";
	private final static String	SYSCLASS_TAN_NOUKI = "DLV_DATE_CDT";
	private final static String	SYSCLASS_PLANT_BATCH = "PLANT_BATCH";
	private final static String	SYSCLASS_CORP_CD = "UNIFIED_CORP_CD";

	/** �ȗ�����DB�o�^����f�t�H���g�l */
	private final static String DEFAULT_SPCL_PRICE_TYP = "0";
	private final static String DEFAULT_DEPO_TYP = YOTAKU_NORMAL;

	/** �N������ */
	private String strBusinessName = null;
	private String strUserId = null;
	private String strPlantCd = null;
	private String strMsgPlantCd = null;
	private String strLocale = null;
	private ResourceBundle strResource = null; 

	/** DB�R�l�N�V���� */
    private IDbConnection conn = null;

	private String m_vMSG = "";				//���O�t�@�C���p���b�Z�[�W

	/** ExchAmount�@�O�݌v�Z�N���X�̃C���X�^���X */
	private ExchAmount exch = null;

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
	 * ���̓f�[�^�`�F�b�N����
	 *
	 * @return true:����@false:�ُ�
	 */
	private boolean chkInData() throws ParseException,Exception
	{
		/**
		 * �EIF���Ǘ��ԍ��̕K�{�`�F�b�N
		 * �E�����敪�̕K�{�`�F�b�N�A�͈̓`�F�b�N
		 * �E�ڋq�i�Ԃ̕K�{�`�F�b�N
		 * �E�ڋq�R�[�h�̕K�{�`�F�b�N
		 * �E�ڋq�����ԍ��̕K�{�`�F�b�N
		 * �E�w��[���̕K�{�`�F�b�N�A���t�`���`�F�b�N
		 * �E�������ʂ̕K�{�`�F�b�N�A�����`�F�b�N�A�P�ȏ�`�F�b�N
		 * �E�P���̐����`�F�b�N�A�O�ȏ�`�F�b�N
		 * �E�w��[�����A�����i�Ɩ����t�j�܂��͖������ł��邱�Ƃ��`�F�b�N����
		 */
		boolean ok_flg = true;

		if(m_med.getg_ODR_TYP() != null && "0".equals(m_med.getg_ODR_TYP())){
			//�����敪���O�̏ꍇ�́A��荞�܂�Ȃ��̂ŁA�`�F�b�N���Ȃ��łn�j�ɂ���
			return ok_flg;
		}
		//�����敪�i�K�{�`�F�b�N�^�͈̓`�F�b�N�j
		if(m_med.getg_ODR_TYP() == null || "".equals(m_med.getg_ODR_TYP()) ||
			(!"2".equals(m_med.getg_ODR_TYP()) && !"3".equals(m_med.getg_ODR_TYP()))){
			//�����敪���ȗ��܂��͔͈͊O
			ok_flg = false;
			this.writeLogMessage("KQ00101",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00101");
		}
		//�ڋq�i�ԁi�K�{�`�F�b�N�j
		if(m_med.getg_CUST_ITEM_CD() == null || "".equals(m_med.getg_CUST_ITEM_CD()) ){
			//�ڋq�i�Ԃ��ȗ�
			ok_flg = false;
			this.writeLogMessage("KQ00102",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00102");
		}
		//�ڋq�R�[�h�i�K�{�`�F�b�N�j
		if(m_med.getg_CUST_CD() == null || "".equals(m_med.getg_CUST_CD()) ){
			//�ڋq�R�[�h���ȗ�
			ok_flg = false;
			this.writeLogMessage("KQ00103",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00103");
		}
		//�ڋq�����ԍ��i�K�{�`�F�b�N�j
		if(m_med.getg_CUST_ODR_NO() == null || "".equals(m_med.getg_CUST_ODR_NO()) ){
			//�ڋq�����ԍ����ȗ�
			ok_flg = false;
			this.writeLogMessage("KQ00149",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00149");
		}

		//�ʉ݃R�[�h�i�ȗ��^�w�肪�����Ă��`�F�b�N�Ȃ��j
		//�[�i�ꏊ�i�ȗ��^�w�肪�����Ă��`�F�b�N�Ȃ��j
		//�󒍒P�ʁi�ȗ��^�w�肪�����Ă��`�F�b�N�Ȃ��j
		//�󒍒P���i�ȗ��^�w�肪����ꍇ�͂O�ȏ�ł��邱�Ɓj
		if(m_med.getg_UNIT_COST() != null && m_med.getg_UNIT_COST().doubleValue() < 0){
			//�ݒ�l���͈͊O
			ok_flg = false;
			this.writeLogMessage("KQ00123",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.writeLogMessageInfo(CoreTools.getRBString("Expj.ODR_UNIT_PRICE", strResource), m_med.getg_UNIT_COST().toString());
			this.setErrWngMessage("1","KQ00123");
		}
		//�󒍐��ʁi�K�{�`�F�b�N�^0���傫�����Ɓj
		if(m_med.getg_PUCH_ODR_QTY() == null){
			ok_flg = false;
			this.writeLogMessage("KQ00108",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00108");
		}else if(m_med.getg_PUCH_ODR_QTY().doubleValue() < 0){
			//�ݒ�l���͈͊O
			ok_flg = false;
			this.writeLogMessage("KQ00122",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.writeLogMessageInfo(CoreTools.getRBString("Expj.ODR_QTY_4", strResource), m_med.getg_PUCH_ODR_QTY().toString());
			this.setErrWngMessage("1","KQ00122");
		}
		//�[���ԍ��i�ȗ��^�w�肪�����Ă��`�F�b�N�Ȃ��j
		//�[�i�L�[�ԍ��i�ȗ��^�w�肪�����Ă��`�F�b�N�Ȃ��j
		//���l�i�ȗ��^�w�肪�����Ă��`�F�b�N�Ȃ��j
		//���ϔԍ��i�ȗ��^�w�肪�����Ă��`�F�b�N�Ȃ��j
		//�w��[���i�K�{�`�F�b�N�^�ߋ����s�j
		if(m_med.getg_DESINATED_DLV_DATE() == null || "".equals(m_med.getg_DESINATED_DLV_DATE()) ){
			//�w��[�����ȗ�
			ok_flg = false;
			this.writeLogMessage("KQ00105",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00105");
		}else{
			// =======================================
			//�w����t���ߋ����łȂ����Ƃ��`�F�b�N����
			// =======================================
			/**�@��������������������������������������
			 * �����ΏۊO�Ɠ����`�F�b�N
			 * �����ΏۊO�̂Ƃ��G���[�ɂ��Ȃ��̂Ȃ�A���t�̔�r�`�F�b�N�͂���Ă̓_��
			 *
			 */
			//SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");

			//�w��[��
			GregorianCalendar inpDate = new GregorianCalendar();
		//	inpDate.setTime(sdi.parse(m_med.getg_DESINATED_DLV_DATE()));
			inpDate.setTime(Converter.strToDate(m_med.getg_DESINATED_DLV_DATE(), "yyyy/MM/dd"));
				//�Ɩ����t
			GregorianCalendar gyoDate = new GregorianCalendar();
		//	gyoDate.setTime(sdi.parse(m_med.getstrBUSINESS_OPR_DATE()));
			gyoDate.setTime(Converter.strToDate(m_med.getstrBUSINESS_OPR_DATE(), "yyyy/MM/dd"));
			//�w����t���Ɩ����t
			if(inpDate.getTime().compareTo(gyoDate.getTime()) < 0){
				//�Ɩ����t���ߋ����͌x�� 2004/1/27
//				ok_flg = false;
				this.writeLogMessage("KQ00106",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
				this.writeLogMessageInfo(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",strResource), m_med.getg_DESINATED_DLV_DATE());
				this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6211", strResource), m_med.getstrBUSINESS_OPR_DATE());
				this.setErrWngMessage("2","KQ00106");
			}
		}
		return ok_flg;
	}
	/**
	 * ���z�P�ʕϊ�����
	 *
	 * @param kin �ϊ��Ώۋ��z
	 * @param inCur �ϊ��Ώۂ̒ʉ݃R�[�h
	 * @param outCur �ϊ���̒ʉ݃R�[�h
	 * @return �ϊ���̋��z
	 */
	private Double cnvQty(boolean exch_flg,String strAmount,String inCur,medKQ0010B001 wst) throws Exception,BatchAppException
	{
		// =======================================
		// �בփ��[�g��ǂݍ���ŁA���z�ϊ�����
		// =======================================
		//if(inCur.equals(this.jpCurrency)){
			//���{�~�̏ꍇ�́A���̂܂ܕԂ�
			//System.out.println("���͂Əo�͂̒ʉ݃R�[�h������");
			//return new Double(kin);
		//}
		//String strAmount = NumberFormat.getInstance().format(kin).replaceAll(",","");
		String strCompanyCd = wst.getstrCOMPANY_CD();
		String strCurrcyCd = inCur;
		String strExchTyp = String.valueOf(wst.getstrEXCH_TYP().intValue());
		String strRoundTyp = wst.getstrROUND_TYP();
		String strDate = wst.getstrBUSINESS_OPR_DATE();
        double strRv ;
        if(exch_flg)
        {
            if(exch.doExchAmount(strAmount,strCompanyCd,strCurrcyCd,strExchTyp,strRoundTyp,strDate)){
                strRv = exch.getD_EXCH_AMOUNT();
            }else{
                this.writeLogMessage("KQ00138",Integer.toString(wst.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6212", strResource), strAmount);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), strCompanyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.CUR_CD", strResource), strCurrcyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6213", strResource), strExchTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.ROUND_TYP_1", strResource), strRoundTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5857", strResource), strDate);
                this.setErrWngMessage("1","KQ00138");
                return null;
            }
        }
        else
        {
            if(exch.doMarume(strAmount,strCompanyCd,strCurrcyCd,strExchTyp,strRoundTyp,strDate)){
                strRv = exch.getD_EXCH_AMOUNT();
            }else{
                this.writeLogMessage("KQ00138",Integer.toString(wst.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6212", strResource), strAmount);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), strCompanyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.CUR_CD", strResource), strCurrcyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6213", strResource), strExchTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.ROUND_TYP_1", strResource), strRoundTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5857", strResource), strDate);
                this.setErrWngMessage("1","KQ00138");
                return null;
            }
        }
		return new Double(strRv);
	}
    /**
     * �o�׎w����v�Z����
     *
     * @param KQ0010010Struct Struct
     * @return �Z�o��̏o�׎w���
     */
    private String cnvShipDate(medKQ0010B001 wst, String plantCd) throws ParseException,FoundationException,BatchAppException,Exception
    {
        // =======================================
        // �o�׎w������v�Z����
        // =======================================
        // �o�׎w����@���@�w��[���@�|�@�^������
        // ���̌v�Z�����ł́A�J�����_���l�����܂��B
        //
        String rv = null;
        //SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");

        //�w��[��
        GregorianCalendar inpDate = new GregorianCalendar();
//	    inpDate.setTime(sdi.parse(wst.getstrDESINATED_DLV_DATE()));
        inpDate.setTime(Converter.strToDate(wst.getstrDESINATED_DLV_DATE(), "yyyy/MM/dd"));
        //�Ɩ����t
        GregorianCalendar gyoDate = new GregorianCalendar();
	//  gyoDate.setTime(sdi.parse(m_med.getstrBUSINESS_OPR_DATE()));
        gyoDate.setTime(Converter.strToDate(m_med.getstrBUSINESS_OPR_DATE(), "yyyy/MM/dd"));
        //�^������
        int unso_day = wst.getstrTRANSPORT_LT().intValue();
        //�o�׏���L/T
        int jyun_day = shukka_jyunbi_day;

        //�w��[�����v�Z����ɂ���
        java.util.Date wkDate = inpDate.getTime();

        String tempPlantCd;
        if ((plantCd == null) || (plantCd.length() == 0)) {
            tempPlantCd = strPlantCd;
        }
        else {
            tempPlantCd = plantCd;
        }

        //�Ɩ����t�v�Z
        //�w��[������^������������
        WorkCalendar wkd = new WorkCalendar(conn,this.strUserId,				//���[�U�R�[�h
                this.strBusinessName,											//�Ɩ��R�[�h
                tempPlantCd,														//�H��R�[�h
                wkDate,															//�Ώۓ��t
                0 - unso_day - jyun_day,													//���Z��
                true															//�O�|���t���O
                );
        wkDate = wkd.calcDate();		//�v�Z����
        if(wkDate == null){
            //�G���[
            this.writeLogMessage("KQ00140",Integer.toString(wst.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
            this.setErrWngMessage("E","KQ00140");
            this.writeErrWngMessage();
            throw new Exception();
        }

        //�ߋ����̏ꍇ�́A�Ɩ����t��ݒ�
//      String tmpSa = new String(sdi.format(gyoDate.getTime()));
        String tmpSa = new String(Converter.dateToStr(gyoDate.getTime(), "yyyy/MM/dd"));
        //String tmpSb = new String(sdi.format(wkDate));
		String tmpSb = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
		if (DateTool.compareYMD(tmpSb, tmpSa) < 0) {
       //   rv = new String(sdi.format(gyoDate.getTime()));
       		rv = new String(Converter.dateToStr(gyoDate.getTime(), "yyyy/MM/dd"));
        }else{
        //  rv = new String(sdi.format(wkDate));
        	rv = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
         }

        return rv;
	}
	/**
	 * ���t�v�Z����
	 *
	 * @param KQ0010010Struct Struct
	 * @return �Z�o��̓�
	 */
	private java.util.Date calcWorkDate(java.util.Date dateValue,int addValue) throws ParseException,FoundationException,BatchAppException,Exception
	{
		// =======================================
		// ���t�v�Z
		// =======================================
		String rv = null;
		java.util.Date wkDate = dateValue;
		//�Ɩ����t�v�Z
		WorkCalendar wkd = new WorkCalendar(conn,this.strUserId,				//���[�U�R�[�h
				this.strBusinessName,											//�Ɩ��R�[�h
				strPlantCd,														//�H��R�[�h
				wkDate,															//�Ώۓ��t
				addValue,														//���Z��
				((addValue < 0) ? true : false)								//�O�|���t���O
				);
		wkDate = wkd.calcDate();		//�v�Z����
		if(wkDate == null){
			return null;
		}
		return wkDate;
	}
	private String calcWorkDate(String dateValue,int addValue) throws ParseException,FoundationException,BatchAppException,Exception
	{
		String rv = null;
		//SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
	//	java.util.Date wkDate = sdi.parse(dateValue);
		java.util.Date wkDate = Converter.strToDate(dateValue, "yyyy/MM/dd");
	//	return new String(sdi.format(calcWorkDate(wkDate,addValue)));
		return new String(Converter.dateToStr(calcWorkDate(wkDate,addValue), "yyyy/MM/dd"));
	}


	/**
	 * �G���[/�x�����b�Z�[�W�����p�����N���X�u�n
	 *
	 */
	private class msgVO
	{
		String STATUS;
		String MSSGE_CD;
		String MSSGE;
		String CUST_CD;
		String CUST_ITEM_CD;
		String ITEM_CD;
		String CUST_ODR_NO;
		String CUST_CHRG_PSN_CD;
		String ERR_REC_TYPE;
		String PROC_TYP;
		Double ACTUAL_UNIT_PRICE;
		Double MASTER_UNIT_PRICE;
		Double QTY;
		String ODR_NO;
		String DESINATED_DLV_DATE;
		String SLIP_NO;
		Double IF_CTL_NO;
		Double ODR_SEQ;								// 2004/1/5
	}
	List msgList = new ArrayList();
	/**
	 * �G���[/�x�����b�Z�[�W�ݒ�(�G���[�x�����X�g)
	 *
	 * @param String status	(E:�G���[/W:�x��)
	 * @param String msgCd		(�G���[�R�[�h)
	 */
	private void setErrWngMessage(String status,String msgCd) throws Exception,BatchAppException
	{
		msgVO ms = new msgVO();

		ms.STATUS = status;
		ms.MSSGE_CD = msgCd;
		AlarmMessage am = new AlarmMessage(msgCd,Integer.toString((m_med.getg_ODR_INFO_COM_IF_CTRL_NO()==null) ? 0 : m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
		ms.MSSGE = am.getMessage();
		if(ms.MSSGE.indexOf("]") != -1){
			ms.MSSGE = ms.MSSGE.substring(ms.MSSGE.indexOf("]") + 1).trim();
		}
		ms.CUST_CD = m_med.getg_CUST_CD();
		ms.CUST_ITEM_CD = m_med.getg_CUST_ITEM_CD();
		ms.ITEM_CD = (m_med.getstrITEM_CD() == null) ? "" : m_med.getstrITEM_CD();
		ms.CUST_ODR_NO = m_med.getg_CUST_ODR_NO();
		ms.CUST_CHRG_PSN_CD = m_med.getstrOWN_PERSON_CD();
 		if(ODR_TYP_KAKUTEI.equals(m_med.getg_ODR_TYP())){ //�m�蒍���ȊO�͓����ɂ���
	 		ms.ERR_REC_TYPE = "2";
 		}else{
	 		ms.ERR_REC_TYPE = "1";
 		}
		ms.PROC_TYP = (m_med.getg_PROC_TYP() == null) ? "" : m_med.getg_PROC_TYP();
		ms.ACTUAL_UNIT_PRICE = (m_med.getg_UNIT_COST() == null) ? new Double(0) : m_med.getg_UNIT_COST();
		ms.MASTER_UNIT_PRICE = (m_med.getstrUNIT_PRICE() == null) ? new Double(0) : m_med.getstrUNIT_PRICE();
		ms.QTY = (m_med.getg_PUCH_ODR_QTY() == null) ? new Double(0) : m_med.getg_PUCH_ODR_QTY();
		ms.ODR_NO = (m_med.getstrODR_NO() == null) ? "" : m_med.getstrODR_NO();
		ms.DESINATED_DLV_DATE = (m_med.getstrDESINATED_DLV_DATE() == null) ? "" : m_med.getstrDESINATED_DLV_DATE();
		if(ms.DESINATED_DLV_DATE == null || "".equals(ms.DESINATED_DLV_DATE)){
			ms.DESINATED_DLV_DATE = (m_med.getg_DESINATED_DLV_DATE() == null) ? "" : m_med.getg_DESINATED_DLV_DATE();
		}
		ms.SLIP_NO = "";		//�󒍂ł͐ݒ肵�Ȃ�
		ms.IF_CTL_NO = m_med.getg_ODR_INFO_COM_IF_CTRL_NO();
		ms.ODR_SEQ = m_med.getg_ODR_SEQ();								// 2004/1/5
		msgList.add(ms);
	}
	/**
	 * �G���[/�x�����b�Z�[�W�������ݏ���(�G���[�x�����X�g)
	 */
	private void writeErrWngMessage() throws Exception,BatchAppException
	{
		try{
		    conn.rollback();
	    } catch(Exception e) {
            e.printStackTrace();
        }
		msgVO mv = null;
		String msgCd = "";
		String msgBody = "";
		String msgStatus = "2";
		if(msgList.size() > 0){
			for(int i = 0 ; i < msgList.size(); i++){
				mv = (msgVO)msgList.get(i);
				msgCd += "[" + mv.MSSGE_CD + "]";
				msgBody += "[" + mv.MSSGE + "]";
				if(mv.STATUS.equals("1")){
					msgStatus = mv.STATUS;
				}
			}
			if(!msgCd.equals("")){
				if(m_med.getgetSEQ_ERR_WNG_LST().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSEQ_ERR_WNG_LST().next() == false){
					//�G���[�x�����X�g�ԍ��̔ԃG���[
					this.writeLogMessage("KQ00143");
					throw new Exception();
				}
				m_med.seterrMSSGE_CD(msgCd);
				m_med.seterrMSSGE(msgBody);
				m_med.seterrSTATUS(msgStatus);
				m_med.seterrCUST_CD(mv.CUST_CD);
				m_med.seterrCUST_ITEM_CD(mv.CUST_ITEM_CD);
				m_med.seterrITEM_CD(mv.ITEM_CD);
				m_med.seterrCUST_ODR_NO(mv.CUST_ODR_NO);
				m_med.seterrCUST_CHRG_PSN_CD(mv.CUST_CHRG_PSN_CD);
				m_med.seterrERR_REC_TYPE(mv.ERR_REC_TYPE);
				m_med.seterrPROC_TYP(mv.PROC_TYP);
				m_med.seterrACTUAL_UNIT_PRICE(mv.ACTUAL_UNIT_PRICE);
				m_med.seterrMASTER_UNIT_PRICE(mv.MASTER_UNIT_PRICE);
				m_med.seterrQTY(mv.QTY);
				m_med.seterrODR_NO(mv.ODR_NO);
				m_med.seterrDESINATED_DLV_DATE(mv.DESINATED_DLV_DATE);
				m_med.seterrSLIP_NO(mv.SLIP_NO);
				m_med.seterrIF_CTL_NO(mv.IF_CTL_NO);
				m_med.seterrODR_SEQ(mv.ODR_SEQ);

				int rv = m_med.getwriteErrWngLst().create();
			}
			try {
		        conn.commit();
		    } catch(Exception e) {
                e.printStackTrace();
            }
		}
		msgList = new ArrayList();
	}
	/**
	 * �G���[/�x�����b�Z�[�W���Z�b�g����(�G���[�x�����X�g)
	 */
	private void resetErrWngMessage() throws Exception,BatchAppException
	{
		try {
		    conn.rollback();
		} catch(Exception e) {
            e.printStackTrace();
        }
		msgList = new ArrayList();
	}
	/**
	 * �G���[/�x�����b�Z�[�W���O�o�͏���(���ߍ��݂Ȃ�)
	 *
	 * @param String ���b�Z�[�W�R�[�h
	 */
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException
	{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
		System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	/**
	 * �G���[/�x�����b�Z�[�W���O�o�͏���(IF���Ǘ��ԍ����ߍ���)
	 *
	 * @param String ���b�Z�[�W�R�[�h
	 * @param String IF���Ǘ��ԍ�
	 */
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException
	{
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
		System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	/**
	 * �G���[/�x�����b�Z�[�W���O�o�͕⏕���(���ߍ���)
	 *
	 * @param String �⏕���
	 * @param String �⏕���l
	 */
	private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException
	{
		AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
		CoreTools.write(am.getMessage());
		System.out.println(am.getMessage());
	}
//-----------------------------------------------------------------------------

	/**
	 * CtrlMain�N���X�̕W���R���X�g���N�^
	 *
	 * @return �Ȃ�
	 */
	public CtrlMain(medKQ0010B001 med) throws BatchAppException
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
/*

		// todo: �����Ƀ��[�U��`�R�[�h���L�q���Ă�������

*/
//-----------------------------------------------------------------------------

		// �f�t�H���g�A�N�Z�T���\�b�h
       // ������
        int nret = 0;
        List WhCdList = new ArrayList();
        List YukouSuList = new ArrayList();

       	// �G���[���X�g
		List errCodeList = new ArrayList();

		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();

		Numbering logCd = null;		//���O���ʃR�[�h�̔Ԃ̏���
		
		// �Ɩ����b�N
		int lockCancelKey = -1;		//���b�N�L�����Z���L�[�̏���
		BusinessLock lock = null;	//���b�N����		

		// �����󂯎��
		String args[] = m_med.getArgs();

		strBusinessName = args[0];
		strUserId = args[1];;
		strPlantCd = args[2];
		strMsgPlantCd = args[2];
		String property = "OrteusUserDic";
		strLocale = CoreTools.getLocale(strUserId);
		strResource = CoreTools.getResourceBundle(property, strLocale);
		

		// �p�����[�^�m�F
		//System.out.println(">>>PRG_NAM:" + args[0]);	// �Ɩ���
		//System.out.println(">>>USER_ID:" + args[1]);	// ���[�U�h�c
		//System.out.println(">>>PLNT_CD:" + args[2]);	// �H��R�[�h

		try{
			conn = m_conductor.m_transactionConn;

			//�o�b�`�J�n���b�Z�[�W�o�^
			try {
				
				// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				
				// �R�l�N�V������n���āA�̔Ԃ̏���
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
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
				String strMsgCd = "KQ00301";
				String strDataString = "(SBM0602)<< �������捞�o�b�`�����J�n >>";
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
				e.printStackTrace();
				throw new Exception();
			}
			try{
//System.out.println("\n******>>>> �������捞�Ώۃf�[�^�擾�X�^�[�g <<<******");
//����������������������������������������������������������������������������������������������������������������������������������������������
//-----------------------------------------------------------------------------
//		�������捞�����i��������j
//-----------------------------------------------------------------------------
			//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
				exch = new ExchAmount(conn);

				// =======================================
				// ���Џ��̎擾
				// =======================================
				if(m_med.getgetCompanyInfo().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetCompanyInfo().next() == false || m_med.getstrCOMPANY_CD() == null || "".equals(m_med.getstrCOMPANY_CD())){
					//���Џ�񂪖���/������
					this.writeLogMessage("KQ00039");
					this.setErrWngMessage("1","KQ00039");
					this.writeErrWngMessage();
					throw new Exception();
				}

				//=======================================
				// ���p�ҏ��擾
				//=======================================
				m_med.setstrUSER_CD(strUserId);
				if(m_med.getgetUserInfo().read() != SUCCESS){
					throw new Exception();
				}
                else if(m_med.getgetUserInfo().next() == false)
                {
					//���[�U��񂪖���/������
					this.writeLogMessage("KQ00025");
					this.writeLogMessageInfo(CoreTools.getRBString("Expj.USER_CD", strResource), m_med.getstrUSER_CD());
					this.setErrWngMessage("1","KQ00025");
					this.writeErrWngMessage();
					throw new Exception();
				}

				//=======================================
				// �o�b�`�p�H��R�[�h�擾
				//=======================================
				m_med.setsysCLASS_CODE(SYSCLASS_PLANT_BATCH);
				if(m_med.getgetSYS_CLASS_CODE().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_CLASS_CODE().next() == false || m_med.getsysCODE() == null || "".equals(m_med.getsysCODE())){
					//�o�b�`�p�R�[�h��񂪖���
					this.writeLogMessage("KQ00153");
					this.writeLogMessageInfo("CODE", SYSCLASS_PLANT_BATCH);
					this.setErrWngMessage("1","KQ00153");
					this.writeErrWngMessage();
					throw new Exception();
				}
				strPlantCd = m_med.getsysCODE();

				//=======================================
				// �Ɩ����t�擾
				//=======================================
				m_med.setstrPLANT_CD(this.strPlantCd);
				if(m_med.getgetGyomuDate().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetGyomuDate().next() == false || m_med.getstrBUSINESS_OPR_DATE() == null || "".equals(m_med.getstrBUSINESS_OPR_DATE())){
					//�Ɩ����t��񂪖���/������
					this.writeLogMessage("KQ00026");
					this.writeLogMessageInfo(CoreTools.getRBString("Expj.PLANT_CD", strResource), m_med.getstrPLANT_CD());
					this.setErrWngMessage("1","KQ00026");
					this.writeErrWngMessage();
					throw new Exception();
				}

				//=======================================
				// ���{�~�ʉ݃R�[�h�擾
				//=======================================
				if(m_med.getgetSYS_HOME_CUR().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_HOME_CUR().next() == false || m_med.getsysHomeCurCd() == null){
					//���{�~�ʉ݃R�[�h��񂪖���/������
					this.writeLogMessage("KQ00041");
					this.writeLogMessageInfo("CODE", SYSCLASS_JP_CUR);
					this.setErrWngMessage("1","KQ00041");
					this.writeErrWngMessage();
					throw new Exception();
				}
				jpCurrency = m_med.getsysHomeCurCd();

				//=======================================
				// �o�׏���L/T�擾
				//=======================================
				m_med.setsysCLASS_CODE(SYSCLASS_SHUKKA_LT);
				if(m_med.getgetSYS_CLASS_CODE().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_CLASS_CODE().next() == false || m_med.getsysCODE() == null){
					//�o�׏���L/T��񂪖���/������
					this.writeLogMessage("KQ00037");
					this.writeLogMessageInfo("CODE", this.SYSCLASS_SHUKKA_LT);
					this.setErrWngMessage("1","KQ00037");
					this.writeErrWngMessage();
					throw new Exception();
				}
				shukka_jyunbi_day = Integer.parseInt(m_med.getsysCODE());

				//=======================================
				// �Z�[���ݒ���擾
				//=======================================
				m_med.setsysCLASS_CODE(SYSCLASS_TAN_NOUKI);
				if(m_med.getgetSYS_CLASS_CODE().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_CLASS_CODE().next() == false || m_med.getsysCODE() == null){
					//�Z�[���ݒ��������/������
					this.writeLogMessage("KQ00043");
					this.writeLogMessageInfo("CODE", this.SYSCLASS_TAN_NOUKI);
					this.setErrWngMessage("1","KQ00043");
					this.writeErrWngMessage();
					throw new Exception();
				}
				tan_nouki_day = Integer.parseInt(m_med.getsysCODE());

				//=======================================
				// �Ώۃf�[�^�̎擾
				//=======================================
				if(m_med.getINDATA().read() != SUCCESS){
					throw new Exception();
				}
				boolean ok_flg = true;
				boolean warn_flg = true;
				long torikuzushiSuryo = 0;
				for(int rec=0;m_med.getINDATA().next();rec++){					// �󒍏��捞T����ǂݍ��񂾃f�[�^���P������������
//System.out.println(Integer.toString(rec+1) +"���ڂ̃}�X�^�`�F�b�N�����J�n����������");

					this.writeErrWngMessage();


					ok_flg = true;
					warn_flg = true;
					//=======================================
					// �G���[���X�g�ɏo�͂��鍀�ڂ̂������̃e�[�u������擾���鍀�ڂ�����������
					//=======================================
					m_med.setstrITEM_CD("");
					m_med.setstrOWN_PERSON_CD("");
					m_med.setstrUNIT_PRICE(new Double(0));
					m_med.setstrODR_NO("");
					m_med.setstrDESINATED_DLV_DATE("");

					//=======================================
					// ���敪�`�F�b�N
					//=======================================
					//EDI
					//	0201		���v�v����	�����o�^	�����敪�P�̂�	�����������Ԕ���
					//	0203		�\�񒍕����	�����o�^	�����敪�P�̂�
					//	0501		�����������	�����o�^	�����敪�P�̂�
					//	0502		�m�蒍�����	�m��o�^	�����敪�P�̂�
					//	0503		�ύX�������	�G���[�x��
					//	0504		����������	�G���[�x��
					//RN
					//	03A04		�����V�K		�m��o�^	�����敪�P�̂�
					//	03A08_CHG	�����ύX		�G���[�x��
					//	03A08_OFF	�����Ő�		�G���[�x��
					//	03A08_CMP	�������[		�G���[�x��
					//	03A09		�����폜		�G���[�x��
					//	04A04		����			�����o�^	�����敪�P�̂�
					//��L�ȊO�̏��敪�����o����Exception
					String msgCd = "";
					if(!INFO_TYP_0201.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0203.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0501.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0502.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0503.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0504.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A04.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A08_CHG.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A08_OFF.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A08_CMP.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A09.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_04A04.equals(m_med.getg_INFO_TYP_CD())	){
							//IF�o�b�`�Ƃ̃C���^�t�F�[�X�o�O
							//System.out.println("INFO_TYP="+m_med.getg_INFO_TYP_CD());
							throw new Exception();
					}
					if(INFO_TYP_0503.equals(m_med.getg_INFO_TYP_CD()) || INFO_TYP_03A08_CHG.equals(m_med.getg_INFO_TYP_CD())){
						//�����ύX�������o
						msgCd = "KQ00062";
						m_med.setg_PROC_TYP(this.PROC_TYP_UPD);
					}
					if(INFO_TYP_0504.equals(m_med.getg_INFO_TYP_CD())){
						//��������������o
						msgCd = "KQ00063";
						m_med.setg_PROC_TYP(this.PROC_TYP_CAN);
					}
					if(INFO_TYP_03A08_OFF.equals(m_med.getg_INFO_TYP_CD())){
						//�����Ő؏������o
						msgCd = "KQ00064";
						m_med.setg_PROC_TYP(this.PROC_TYP_STP);
					}
					if(INFO_TYP_03A09.equals(m_med.getg_INFO_TYP_CD())){
						//�����폜�������o
						msgCd = "KQ00065";
						m_med.setg_PROC_TYP(this.PROC_TYP_CAN);
					}
					if(INFO_TYP_03A08_CMP.equals(m_med.getg_INFO_TYP_CD())){
						//�������[�������o
						msgCd = "KQ00066";
						m_med.setg_PROC_TYP(this.PROC_TYP_CPL);
					}
					if(INFO_TYP_04A04.equals(m_med.getg_INFO_TYP_CD())){
						//�\��������o
						msgCd = "KQ00071";
						m_med.setg_PROC_TYP(this.PROC_TYP_RSV);
					}
					if(!"".equals(msgCd)){
						ok_flg = false;
						this.writeLogMessage(msgCd,Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5345", strResource), m_med.getg_INFO_TYP_CD());
						this.setErrWngMessage("1",msgCd);
						this.writeErrWngMessage();
						//���Y�f�[�^�̃V�X�e�������敪�͂��̑��ɐݒ肷��
						m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_ETC);
						int rv = m_med.getINDATA().update();
						conn.commit();
						continue;
						//�ȍ~�̃`�F�b�N�͍s��Ȃ�
					}
					//=======================================
					// �����敪�`�F�b�N
					//=======================================
					if(!PROC_TYP_NEW.equals(m_med.getg_PROC_TYP())){
						//�V�K�ȊO�̏����敪�́A�G���[�x���o�͂��A�������Ȃ�
						ok_flg = false;
						if(PROC_TYP_UPD.equals(m_med.getg_PROC_TYP())){
							msgCd = "KQ00044";
						}else{
							msgCd = "KQ00045";
						}
						this.writeLogMessage(msgCd,Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.EXEC_TYP", strResource), m_med.getg_PROC_TYP());
						this.setErrWngMessage("1",msgCd);
						this.writeErrWngMessage();
						//���Y�f�[�^�̃V�X�e�������敪�͂��̑��ɐݒ肷��
						m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_ETC);
						int rv = m_med.getINDATA().update();
						conn.commit();
						continue;
						//�ȍ~�̃`�F�b�N�͍s��Ȃ�
					}
					//=======================================
					// �󒍎捞�Ώۃf�[�^�̎捞�t���O��SYS_PROC_TYP_NG�ɍX�V
					//=======================================
					m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_NG);
					int rv = m_med.getINDATA().update();
					conn.commit();
					//sww�ǉ�20040729

					//=======================================
					// ���̓`�F�b�N
					//=======================================
					if(chkInData() == false){
						// ���̓G���[������ꍇ�́A���̍s����������
						ok_flg = false;
//System.out.println("���������͒l�`�F�b�N�G���[ Continue");
//						continue;
						//�ȍ~�̃`�F�b�N�͍s��Ȃ�
					}

					//=======================================
					// �ڋq���̎擾
					//=======================================
					m_med.setstrCUST_CD(m_med.getg_CUST_CD());
					if(m_med.gettbl_M_CUST().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_CUST().next() == false){
						//�ڋq��񂪖���/������
						ok_flg = false;
						this.writeLogMessage("KQ00114",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getg_CUST_CD());
						this.setErrWngMessage("1","KQ00114");
						this.writeErrWngMessage();
						continue;
						//�ȍ~�̃`�F�b�N�͍s��Ȃ�
					}
                    //NULL �Ȃ�M�݃}�X�^.���{�~�ʉ݃R�[�h
                    if(m_med.getstrCUR_CD() == null || "".equals(m_med.getstrCUR_CD())){
                        m_med.setstrCUR_CD(jpCurrency);
					}

					//�ʉ݃R�[�h�ȗ����́A�ڋq�}�X�^�̒ʉ݃R�[�h��ݒ�
					m_med.setg_CUR_CD(m_med.getstrCUR_CD());	// ��� �� �ʉ݃R�[�h
					//=======================================
					// �[�i�ꏊ�̃`�F�b�N/�擾
					//=======================================
					//�[�i�ꏊ���ȗ����ꂽ�ꍇ
					//		�}�X�^����擾�����[�i�ꏊ���g�p����
					//		�������擾�ł���ꍇ�̓G���[
					//�[�i�ꏊ�̎w�肪����ꍇ
					//		�w�肳�ꂽ�[�i�ꏊ���}�X�^�ɖ�����΃G���[
                    String shipPlantCd = ""; // �o�בq�ɂ̍H��R�[�h
					if(m_med.getg_DLV_LOC_CD() == null || "".equals(m_med.getg_DLV_LOC_CD().trim())){
						//�[�i�ꏊ�ȗ���
						m_med.setstrDLV_LOC_CD("");
						if(m_med.gettbl_M_CUST_BASE().read() != SUCCESS){
							throw new Exception();
						}else if(m_med.gettbl_M_CUST_BASE().next() == false){
							//�[�i�ꏊ��񂪖���
							ok_flg = false;
							this.writeLogMessage("KQ00115",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.setErrWngMessage("1","KQ00115");
						} else { }
						m_med.setg_DLV_LOC_CD(m_med.getstrDLV_LOC_CD());	// ��� �� �[�i�ꏊ�R�[�h
                        shipPlantCd = m_med.getstrSHIP_PLANT_CD();
						//�����ꌏ�ǂ�ŁA�ǂݍ��߂�ꍇ�́A�G���[
						if(m_med.gettbl_M_CUST_BASE().next() != false){
							//�[�i�ꏊ��񂪕�����
							ok_flg = false;
							this.writeLogMessage("KQ00116",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.setErrWngMessage("1","KQ00116");
						} else {}
					}else{
						//�[�i�ꏊ�w�莞
						m_med.setstrDLV_LOC_CD(m_med.getg_DLV_LOC_CD());
						if(m_med.gettbl_M_CUST_BASE_check().read() != SUCCESS){
							throw new Exception();
						}else if(m_med.gettbl_M_CUST_BASE_check().next() == false){
							//�[�i�ꏊ��񂪖���
							ok_flg = false;
							this.writeLogMessage("KQ00115",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5934", strResource), m_med.getstrDLV_LOC_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6209", strResource), m_med.getstrDEPO_WH_CD());
							this.setErrWngMessage("1","KQ00115");
						}
                        shipPlantCd = m_med.getstrSHIP_PLANT_CD();
					}
//					custbase_calcd = Integer.parseInt(m_med.getstrCAL_NO());			//�ڋq�[�i�ꏊ�̃J�����_�R�[�h��ݒ�

					//=======================================
					// ���i�d�l���̎擾
					//=======================================
					m_med.setstrCUST_ITEM_CD(m_med.getg_CUST_ITEM_CD());
//System.out.println("@@@ CUST_ITEM_CD=" + m_med.getstrCUST_ITEM_CD());						//�ڋq�i��
					if(m_med.gettbl_M_ITEM_SPEC().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_ITEM_SPEC().next() == false){
						//���i�d�l��񂪂Ȃ�
						ok_flg = false;
						this.writeLogMessage("KQ00117",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6210", strResource), m_med.getstrCUST_ITEM_CD());
                        this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6209", strResource), m_med.getstrDEPO_TYP());
						this.setErrWngMessage("1","KQ00117");
//del					}else{
					}
					
					//Add Start 20131218 Meng-qzh
					if("1".equals(m_med.getstrTAX_APPLY_TYP())){        //[���Ӑ�].�g����œK�p�敪�h�́u1�F���i�}�X�^�̏���ŃR�[�h�v�̏ꍇ�A[���i].�g����ŃR�[�h�h
						m_med.setstrTAX_CD(m_med.getstrsTAX_CD());      //����ŃR�[�h
					}
					//Add End 20131218 Meng-qzh
					
					//sww�ǉ�20040728�J�n
					//���i�}�X�^�e�[�u���̃`�F�b�N
					if(m_med.getstrDEPO_WH_CD() == null && "20".equals(m_med.getstrDEPO_TYP())){
						//�w��[�����ȗ�
						ok_flg = false;
						this.writeLogMessage("KQ20002",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.DEPO_TYP", strResource), m_med.getstrDEPO_TYP());
						this.setErrWngMessage("1","KQ20002");
					}
					//sww�ǉ�20040802�a��20���m�F��3�̏ꍇ�̃G���[����
					if( ("3".equals(m_med.getg_ODR_TYP())) && "20".equals(m_med.getstrDEPO_TYP())){
						//�w��[�����ȗ�
						ok_flg = false;
						this.writeLogMessage("KQ20003",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.DEPO_TYP", strResource), m_med.getstrDEPO_TYP());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.ODR_TYP", strResource), m_med.getg_ODR_TYP());
						this.setErrWngMessage("1","KQ20003");
					}
					//sww�ǉ�20040802�I��
					//sww�ǉ�20040728�I��
					//=======================================
					// �P���̎擾
					//=======================================
					m_med.setstrEFF_PHASE_IN_DATE(m_med.getstrBUSINESS_OPR_DATE());
					if(m_med.gettbl_M_UNIT_COST().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_UNIT_COST().next() == false){
						//���R�[�h�Ȃ��̏ꍇ
						if(m_med.getg_UNIT_COST() == null || "".equals(m_med.getg_UNIT_COST().toString())){
							//�P�����ȗ�����Ă���ꍇ�A�O�ɂ���
							m_med.setg_UNIT_COST(new Double(0));	// ��� �� �P���i�O�j
						}else{
							//�P�����w�肳��Ă���ꍇ
							warn_flg = false;
							this.writeLogMessage("KQ00121",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6211", strResource), m_med.getstrBUSINESS_OPR_DATE());
							this.setErrWngMessage("2","KQ00121");
							//�x���Ȃ̂ŏ������s
						}
					}else{
						//���R�[�h������ꍇ
						if(m_med.getg_UNIT_COST() == null || "".equals(m_med.getg_UNIT_COST().toString())){
							//�P�����ȗ�����Ă���ꍇ�A�擾�����P����ݒ�
							m_med.setg_UNIT_COST(m_med.getstrUNIT_PRICE());	// ��� �� �P��
						}else{
							//�P�����w�肳��Ă���ꍇ�A�擾�����l�ƈ�v�`�F�b�N
							double dbTanka = m_med.getstrUNIT_PRICE().doubleValue();
							double inTanka = m_med.getg_UNIT_COST().doubleValue();
							if(dbTanka != inTanka){
								//�������Ȃ��Ƃ��͌x�����b�Z�[�W
								warn_flg = false;
								this.writeLogMessage("KQ00120",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5566", strResource), m_med.getstrEFF_PHASE_IN_DATE());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6211", strResource), m_med.getstrBUSINESS_OPR_DATE());
								this.setErrWngMessage("2","KQ00120");
								//�x���Ȃ̂ŏ������s
							}
						}
					}
//System.out.println("UNIT_PRICE="+m_med.getstrUNIT_PRICE());
//System.out.println("UNIT_COST ="+m_med.getg_UNIT_COST());

					//=======================================
					// �i�ڏ��̎擾
					//=======================================
					if(m_med.gettbl_M_ITEM().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_ITEM().next() == false){
						//�i�ڏ�񂪖���
						ok_flg = false;
						this.writeLogMessage("KQ00127",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
						this.setErrWngMessage("1","KQ00127");
					}else if(m_med.getg_UNIT_CD() == null || "".equals(m_med.getg_UNIT_CD())){
						//�P�ʂ��w�肳��Ă��Ȃ��ꍇ�A�}�X�^�̒l���g�p
						m_med.setg_UNIT_CD(m_med.getstrSTOCK_UNIT());
					}else if(!m_med.getg_UNIT_CD().equals(m_med.getstrSTOCK_UNIT())){
						//�P�ʂ��}�X�^�ƈقȂ�
						ok_flg = false;
						this.writeLogMessage("KQ00067",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
						this.setErrWngMessage("1","KQ00067");
					}
					m_med.setstrUNIT_CD(m_med.getg_UNIT_CD());

                    // �����Ǘ��`�F�b�N
                    if ("1".equals(m_med.getstrUNIT_QTY_TYP())) {
                        // �����Ǘ�
                        // �������͂̏ꍇ�F�؏グ
                        String tempString1 = m_med.getg_PUCH_ODR_QTY().toString();
                        double tempDouble1 = m_med.getg_PUCH_ODR_QTY().doubleValue();
                        String tempString2 = Calculate.ceil(tempString1, 0);
                        double tempDouble2 = Double.parseDouble(tempString2);
                        if (tempDouble1 != tempDouble2) {
                            // ".0"���O
                            this.writeLogMessage("KQ20005", Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                            this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
                            this.setErrWngMessage("2", "KQ20005");
                            m_med.setg_PUCH_ODR_QTY(new Double(tempString2));
                        }
                    }


//System.out.println("ITEM_NAME=" + m_med.getstrITEM_NAME());						//�i�ږ�

//System.out.print("�}�X�^�`�F�b�N�����܂�-----------------------------------------");
//System.out.println(Integer.toString(rec+1) +"���ڂ̓o�^�����J�n����������");
					if(ok_flg == false){
						//�G���[������ꍇ�́AContinue
						//System.out.println("�G���[������̂œo�^���Ȃ�");
						continue;
					}
					//=======================================
					// �󒍊Ǘ��ԍ��̎擾
					//=======================================
					boolean flg_create = false;	//�󒍊Ǘ��e�[�u����V�K�ǉ��������ۂ��̃t���O
					if(m_med.gettbl_T_ODR_CTL().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_T_ODR_CTL().next() == false){
						//�󒍊Ǘ���񂪖����ꍇ�A�󒍊Ǘ��ԍ����̔Ԃ��A�󒍊Ǘ����R�[�h���쐬����
						//=======================================
						// �󒍊Ǘ��ԍ��̔�
						//=======================================
						if(m_med.getgetSEQ_ODR_CTL().read() != SUCCESS){
							throw new Exception();
						}else if(m_med.getgetSEQ_ODR_CTL().next() == false){
							//�󒍊Ǘ��ԍ��̔ԃG���[
							this.writeLogMessage("KQ00130",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.setErrWngMessage("1","KQ00130");
							this.writeErrWngMessage();
							continue;
						}
						//=======================================
						// �󒍊Ǘ��o�^
						//=======================================
						rv = m_med.gettbl_T_ODR_CTL().create();
						flg_create = true;
					}else if(m_med.gettbl_T_ODR_CTL().next() != false){
						//�󒍊Ǘ���񂪕��������݂���ꍇ�A�G���[���b�Z�[�W�o��
						this.writeLogMessage("KQ00129",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6210", strResource), m_med.getstrCUST_ITEM_CD());
						this.setErrWngMessage("1","KQ00129");
						this.writeErrWngMessage();
						continue;
//del					}else{
					}

					//=======================================
					// �󒍔ԍ��̎擾
					//=======================================
                    if(m_med.getgetSEQ_ODR().read() != SUCCESS){
                        throw new Exception();
                    }else if(m_med.getgetSEQ_ODR().next() == false){
                        //�󒍔ԍ��̔ԃG���[
                        this.writeLogMessage("KQ00131",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                        this.setErrWngMessage("1","KQ00131");
                        this.writeErrWngMessage();
                        continue;
                    }


					//=======================================
					// �󒍖��ׂ̓o�^
					//=======================================
					m_med.setstrODR_TYP(m_med.getg_ODR_TYP());												//�����敪
					m_med.setstrCUST_ODR_NO(m_med.getg_CUST_ODR_NO());										//�ڋq�����ԍ�
					m_med.setstrCUST_CHRG_ORG_CD(m_med.getstrOWN_ORG_CD());									//�c�ƒS������
					m_med.setstrCUST_CHRG_PSN_CD(m_med.getstrOWN_PERSON_CD());								//�c�ƒS����
					m_med.setstrODR_ACPT_ORG_CD(m_med.getstrORG_CD());										//���s�S���ҕ���
					m_med.setstrODR_ACPT_PSN_CD(strUserId);								                    //���s�S���ҁi�o�b�`�̏ꍇ�j
					m_med.setstrCURRNCY_CD(m_med.getg_CUR_CD());											//�ʉ݃R�[�h
					m_med.setstrDLV_LOC_CD_EIAJ(m_med.getg_DLV_LOC_CD_EIAJ());								//�󂯓n���ꏊ�i�o�b�`�̂݁j
					m_med.setstrDLV_LOC_NAME_KANJI(m_med.getstrDLV_LOC_NAME());								//�[�i�ꏊ�������i�[�i�ꏊ�j
					if(m_med.getg_DLV_LOC_NAME_KANJI() != null && !"".equals(m_med.getg_DLV_LOC_NAME_KANJI().replaceAll("�@"," ").trim())){
						m_med.setstrDLV_LOC_NAME_KANJI(m_med.getg_DLV_LOC_NAME_KANJI());			//�[�i�ꏊ�������i���͂�����Ƃ��́A���̒l�Œu�������j
					}
					//System.out.println("CURRNCY_CD=" + m_med.getstrCURRNCY_CD());
					m_med.setstrODR_UNIT_PRICE(m_med.getg_UNIT_COST());										//�󒍒P��
					m_med.setstrSPCL_PRICE_TYP(DEFAULT_SPCL_PRICE_TYP);										//���l
					m_med.setstrODR_QTY(m_med.getg_PUCH_ODR_QTY());											//�󒍐���
					torikuzushiSuryo = m_med.getstrODR_QTY().longValue();
					//�����c�Z�o�@�������Z�o
					if( ODR_TYP_NAIJI.equals(m_med.getg_ODR_TYP()) )
                    {// �����敪������
                    m_med.setstrREMAIN_UNCONFIRM_ODR_QTY(m_med.getstrODR_QTY());					//�����c
                    m_med.setstrCANCELED_UNCONFIRM_ODR_QTY(new Double(0));							//������

					}else{
						//System.out.println("�����敪�������ȊO");
						m_med.setstrREMAIN_UNCONFIRM_ODR_QTY(new Double(0));								//�����c
						m_med.setstrCANCELED_UNCONFIRM_ODR_QTY(new Double(0));								//������
					}

					m_med.setstrUNIT_CD(m_med.getg_UNIT_CD());												//�P��
					if( ODR_TYP_NAIJI.equals(m_med.getg_ODR_TYP()) ){										//�����c���z�i���l�j
						// �����敪������
//update by luo at 2004/05/25 start
//						Double w_qty = cnvQty(false,m_med.getstrREMAIN_UNCONFIRM_ODR_QTY().doubleValue() * m_med.getstrODR_UNIT_PRICE().doubleValue(),
//						m_med.getstrCURRNCY_CD(),m_med);

						String unconfirmOdrBalance1 = Calculate.multiply(
										m_med.getstrREMAIN_UNCONFIRM_ODR_QTY().toString(),
										m_med.getstrODR_UNIT_PRICE().toString());
						Double w_qty1 = cnvQty(false,unconfirmOdrBalance1,m_med.getstrCURRNCY_CD(),m_med);
//update by luo at 2004/05/25 end

						if(w_qty1 == null){
							ok_flg = false;
							continue;
						}
						m_med.setstrUNCONFIRM_ODR_BALANCE(w_qty1);
					}else{
						m_med.setstrUNCONFIRM_ODR_BALANCE(new Double(0));
					}

                    			//�󒍋��z�i���l�j
//update by luo at 2004/05/25 start
//					Double w_qty = cnvQty(false,m_med.getstrODR_QTY().doubleValue() * m_med.getstrODR_UNIT_PRICE().doubleValue(),
//					m_med.getstrCURRNCY_CD(),m_med);

					String unconfirmOdrBalance2 = Calculate.multiply(
									m_med.getstrODR_QTY().toString(),
									m_med.getstrODR_UNIT_PRICE().toString());
					Double w_qty2 = cnvQty(false,unconfirmOdrBalance2,m_med.getstrCURRNCY_CD(),m_med);
//update by luo at 2004/05/25 end
					if(w_qty2 == null){
						ok_flg = false;
						continue;
					}
					m_med.setstrODR_AMOUNT(w_qty2);

					//�󒍋��z�i�~�݁j
					w_qty2 = null;
                    			w_qty2 = cnvQty(true,unconfirmOdrBalance2,m_med.getstrCURRNCY_CD(),m_med);
                    			if(w_qty2 == null){
                        			ok_flg = false;
                        			continue;
                    			}
					m_med.setstrODR_AMOUNT_EXCH_RATES(w_qty2);

					m_med.setstrCUS_DLV_CD(m_med.getg_CUS_DLV_CD());										//�[���ԍ�
					m_med.setstrCUS_DLV_KEY_CD(m_med.getg_CUS_DLV_KEY_CD());								//�[�i�L�[�ԍ�
					m_med.setstrREMARKS(m_med.getg_REMARK());												//���l
					m_med.setstrODR_ACPT_DATE(m_med.getstrBUSINESS_OPR_DATE());								//�󒍓�

/* 2004/03/17
                    //�o�׌v��c����
                    //2004/03/16
                    //�ʏ�����F�O
                    //�ʏ�m�蒍���F�󒍐���
                    //�a�������F�󒍐���
                    //�a���m��F�O
                m_med.setstrSHIP_PLAN_REMAIN_QTY(new Double(0));
                if(ODR_TYP_NAIJI.equals(m_med.getstrODR_TYP())){
                    if(YOTAKU_YOTAKU.equals(m_med.getstrDEPO_TYP())){
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(m_med.getstrODR_QTY());
                    }
                }else if(ODR_TYP_KAKUTEI.equals(m_med.getstrODR_TYP())){
                    if(YOTAKU_NORMAL.equals(m_med.getstrDEPO_TYP())){
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(m_med.getstrODR_QTY());
                    }
				}
*/
                    m_med.setstrDESINATED_DLV_DATE(m_med.getg_DESINATED_DLV_DATE());						//�w��[��
                    m_med.setstrSTD_DESINATED_RCV_DATE(m_med.getg_DESINATED_DLV_DATE());					//��w��[��

                //�o�׌v��c����

                    //=======================================
                    //�Z�[������
                    //=======================================
                    boolean tan_flg_QTY = false;
//update by luo at 2004/05/25 start
                    String quickDeliveryDate1 = calcWorkDate(m_med.getstrBUSINESS_OPR_DATE(), tan_nouki_day);


                    // �Z�[��
                    if (DateTool.compareYMD(quickDeliveryDate1, m_med.getstrDESINATED_DLV_DATE()) >= 0) {
                        tan_flg_QTY = true;
                    } else {
                        tan_flg_QTY = false;
                    }



//update by luo at 2004/05/25 end
//                    //�w��[��
//                    GregorianCalendar inpDate_QTY = new GregorianCalendar();
//                    inpDate_QTY.setTime(sdi.parse(m_med.getstrDESINATED_DLV_DATE()));
//                    //�Ɩ����t
//                    GregorianCalendar gyoDate_QTY = new GregorianCalendar();
//                    gyoDate_QTY.setTime(sdi.parse(m_med.getstrBUSINESS_OPR_DATE()));

//                    gyoDate_QTY.add(GregorianCalendar.DATE,tan_nouki_day);
//                    //�w��[�� <= �󒍓��{�Z�[���ݒ���@�̏ꍇ�A�Z�[���ƂȂ�
//                    if(inpDate_QTY.getTime().compareTo(gyoDate_QTY.getTime()) <= 0){
//                        tan_flg_QTY = true;
//                    }
                    if( tan_flg_QTY == true                                        // �����̓��t + n�� >= �w��[��
                        && (ODR_TYP_KAKUTEI.equals(m_med.getg_ODR_TYP())  	   // �����敪���m�蒍��
                        || ( ODR_TYP_NAIJI.equals(m_med.getg_ODR_TYP())        // �����敪������
                        && YOTAKU_YOTAKU.equals(m_med.getstrDEPO_TYP())) ))   // �a���敪���a��
                    {
                        tan_flg_QTY = true;
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(new Double(0));
                    }
                    else
                    {
                        tan_flg_QTY = false;
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(m_med.getstrODR_QTY());
                    }

					//�o�b�`�p����
					m_med.setstrIF_CTL_NO(m_med.getg_ODR_INFO_COM_IF_CTRL_NO());							//IF���Ǘ��ԍ�
					m_med.setstrPART_NAME(m_med.getg_PART_NAME());											//�i��
					m_med.setstrPKG_UNIT(m_med.getg_PKG_UNIT());											//�׎p
					m_med.setstrINSPC_TYP(m_med.getg_INSPC_TYP());											//�����敪
					m_med.setstrSLIP_PRICE_PRINT_TYP(m_med.getg_SLIP_PRICE_PRINT_TYP());					//�[�i�����i�\���敪
					m_med.setstrCLIENT_REMARK(m_med.getg_CLIENT_REMARK());									//�����Ҕ��l
					m_med.setstrCLIENT_REMARK_KANJI(m_med.getg_CLIENT_REMARK_KANJI());						//�����Ҕ��l(����)
					m_med.setstrCLIENT_BARCODE_INF(m_med.getg_CLIENT_BARCODE_INF());						//�����҃o�[�R�[�h���
					m_med.setstrODR_SEQ(m_med.getg_ODR_SEQ());												//�������ԁ@2004/1/5
					//�o�b�`�iEDI�j�̂�
					m_med.setstrUNIT_CD_ORG(m_med.getg_UNIT_CD_ORG());										//�ϊ��O�P��
					m_med.setstrPUCH_ODR_QTY_TOTAL(m_med.getg_PUCH_ODR_QTY_TOTAL());						//����������
					m_med.setstrBUYER_NAME(m_med.getg_BUYER_NAME());										//�w���S��
					m_med.setstrBUYER_ORG_CD(m_med.getg_BUYER_ORG_CD());									//��������R�[�h
					m_med.setstrCOCK_TYP(m_med.getg_COCK_TYP());											//�R�b�N�敪

					//System.out.println("ODR_NO=" + m_med.getstrODR_NO());
					//System.out.println("ODR_TYP=" + m_med.getstrODR_TYP());
					//System.out.println("ODR_CTL_NO=" + m_med.getstrODR_CTL_NO());
					//System.out.println("CUST_ODR_NO=" + m_med.getstrCUST_ODR_NO());
					//System.out.println("CUST_CHRG_ORG_CD=" + m_med.getstrCUST_CHRG_ORG_CD());
					//System.out.println("CUST_CHRG_PSN_CD=" + m_med.getstrCUST_CHRG_PSN_CD());
					//System.out.println("ODR_ACPT_ORG_CD=" + m_med.getstrODR_ACPT_ORG_CD());
					//System.out.println("ODR_ACPT_PSN_CD=" + m_med.getstrODR_ACPT_PSN_CD());
					//System.out.println("CURRNCY_CD=" + m_med.getstrCURRNCY_CD());
					//System.out.println("DLV_LOC_CD=" + m_med.getstrDLV_LOC_CD());
					//System.out.println("DLV_LOC_NAME=" + m_med.getstrDLV_LOC_NAME());
					//System.out.println("DLV_LOC_NAME_KANJI=" + m_med.getstrDLV_LOC_NAME_KANJI());
					//System.out.println("ODR_UNIT_PRICE=" + m_med.getstrODR_UNIT_PRICE());
					//System.out.println("SPCL_PRICE_TYP=" + m_med.getstrSPCL_PRICE_TYP());
					//System.out.println("DESINATED_DLV_DATE=" + m_med.getstrDESINATED_DLV_DATE());
					//System.out.println("STD_DESINATED_RCV_DATE=" + m_med.getstrSTD_DESINATED_RCV_DATE());
					//System.out.println("ODR_QTY=" + m_med.getstrODR_QTY());
					//System.out.println("REMAIN_UNCONFIRM_ODR_QTY=" + m_med.getstrREMAIN_UNCONFIRM_ODR_QTY());
					//System.out.println("CANCELED_UNCONFIRM_ODR_QTY=" + m_med.getstrCANCELED_UNCONFIRM_ODR_QTY());
					//System.out.println("UNIT_CD=" + m_med.getstrUNIT_CD());
					//System.out.println("UNCONFIRM_ODR_BALANCE=" + m_med.getstrUNCONFIRM_ODR_BALANCE());
					//System.out.println("ODR_AMOUNT=" + m_med.getstrODR_AMOUNT());
					//System.out.println("ODR_AMOUNT_EXCH_RATES=" + m_med.getstrODR_AMOUNT_EXCH_RATES());
					//System.out.println("CUS_DLV_CD=" + m_med.getstrCUS_DLV_CD());
					//System.out.println("CUS_DLV_KEY_CD=" + m_med.getstrCUS_DLV_KEY_CD());
					//System.out.println("PART_NAME=" + m_med.getstrPART_NAME());
					//System.out.println("TRANSPORT_CD=" + m_med.getstrTRANSPORT_CD());
					//System.out.println("TAX_APPLY_TYP=" + m_med.getstrTAX_APPLY_TYP());
					//System.out.println("TAX_CD=" + m_med.getstrTAX_CD());
					//System.out.println("TAX_CALC_TYP=" + m_med.getstrTAX_CALC_TYP());
					//System.out.println("REMARKS=" + m_med.getstrREMARKS());
					//System.out.println("ODR_ACPT_DATE=" + m_med.getstrODR_ACPT_DATE());
					//System.out.println("PARTIAL_SHIP_INST_FLG=" + m_med.getstrPARTIAL_SHIP_INST_FLG());
					//System.out.println("DEPO_TYP=" + m_med.getstrDEPO_TYP());
					//System.out.println("EXCH_TYP=" + m_med.getstrEXCH_TYP());
					//System.out.println("ODR_SEQ=" + m_med.getstrODR_SEQ());

                    // �󒍖��ׂ�V�K�ǉ�����
                    rv = m_med.gettbl_T_ODR().create();

					if( ODR_TYP_KAKUTEI.equals(m_med.getg_ODR_TYP()) &&
						 torikuzushiSuryo != 0){ 					// �����敪���m�蒍��
						boolean wkFlg = false;

                        //�����̏ꍇ�A����Ώۂ́A�����̂݁B�m��̏ꍇ�A����Ώۂ́A�����Ɠ���
                        //����Ώی��������ɓ�����������
                        m_med.setnijODR_TYP(ODR_TYP_NAIJI);
                        //�����ԍ���r���s���ڋq���ۂ�

						if(wkFlg == false){
							//�����ԍ���r���s��Ȃ��ڋq�ꍇ�A�܂��́A
							//�����ԍ���r���s���ڋq�ł��A��r���������œ����c���O�̏ꍇ
							// =======================================
							// ��������i�ڋq�i�ԁj
							// =======================================
							m_med.setnijCUST_CD(m_med.getstrCUST_CD());
							m_med.setnijCUST_ITEM_CD(m_med.getstrCUST_ITEM_CD());

                            if(m_med.getnaiji_T_ODR_hinban().read() != SUCCESS){
                                throw new Exception();
                            }
                            wkFlg = m_med.getnaiji_T_ODR_hinban().next();
						}

						// ����Ώۂ̌������m�F����
						long torisu = torikuzushiSuryo;
						if(wkFlg != false){
							//������ʁi�󒍐��ʂ������l�j
							int i_tk = 0;
							boolean bk_flg = true;

							do{
								long zansu = 0;
								if(ODR_TYP_NAIJI.equals(m_med.getnijODR_TYP())){
									if(m_med.getnijREMAIN_UNCONFIRM_ODR_QTY() != null){
										zansu = m_med.getnijREMAIN_UNCONFIRM_ODR_QTY().longValue();
									}
								}

								long hikiate_su = 0;
								if(torisu > zansu){
									hikiate_su = zansu;
									torisu -= zansu;
									if(ODR_TYP_NAIJI.equals(m_med.getnijODR_TYP())){
										m_med.setnijREMAIN_UNCONFIRM_ODR_QTY(new Double(0));					//�����c
										m_med.setnijUNCONFIRM_ODR_BALANCE(new Double(0));						//�����c���z�i���l�j
									}
								}else{
									hikiate_su = torisu;

									if(ODR_TYP_NAIJI.equals(m_med.getnijODR_TYP())){
										m_med.setnijREMAIN_UNCONFIRM_ODR_QTY(new Double(zansu - torisu));		//�����c
										torisu = 0;
//update by luo at 2004/05/25 start
//										w_qty = cnvQty(false,m_med.getnijREMAIN_UNCONFIRM_ODR_QTY().doubleValue() * m_med.getnijODR_UNIT_PRICE().doubleValue(),
//											m_med.getnijCURRNCY_CD(),m_med);

										String unconfirmOdrBalance3 = Calculate.multiply(
														m_med.getnijREMAIN_UNCONFIRM_ODR_QTY().toString(),
														m_med.getnijODR_UNIT_PRICE().toString());
										Double w_qty3 = cnvQty(false,unconfirmOdrBalance3,m_med.getnijCURRNCY_CD(),m_med);
//update by luo at 2004/05/25 end
										if(w_qty3 == null){
											ok_flg = false;
											continue;
										}
										m_med.setnijUNCONFIRM_ODR_BALANCE(w_qty3);								//�����c���z�i���l�j
									}
                                    else
                                    {
                                        m_med.setnijUNCONFIRM_ODR_BALANCE(new Double(0));
                                    }
								}
								rv = m_med.getnaiji_T_ODR().update();

								// =======================================
								// �����m�蒍����������쐬
								// =======================================
								m_med.sethisFIXED_ODR_NO(m_med.getstrODR_NO());									//�m��󒍔ԍ�
								m_med.sethisALCTED_SEQ_CD(new Double(++i_tk));					//�������ď�
								m_med.sethisALCTED_UNCONFIRM_ODR_NO(m_med.getnijODR_NO());						//�������Đ�����󒍔ԍ�
								m_med.sethisALCTED_UNCONFIRM_ODR_QTY(new Double(hikiate_su));					//��������
//System.out.println("FIXED_ODR_NO=" + m_med.gethisFIXED_ODR_NO());
//System.out.println("ALCTED_SEQ_CD=" + m_med.gethisALCTED_SEQ_CD());
//System.out.println("ALCTED_UNCONFIRM_ODR_NO=" + m_med.gethisALCTED_UNCONFIRM_ODR_NO());
//System.out.println("ALCTED_UNCONFIRM_ODR_QTY=" + m_med.gethisALCTED_UNCONFIRM_ODR_QTY());

								rv = m_med.gettbl_T_ALLOC_FIXED_ODR_RSLT().create();

								//���̃��R�[�h��ǂݍ���
                                bk_flg = m_med.getnaiji_T_ODR_hinban().next();

								if(torisu <= 0) bk_flg = false;
							}while(bk_flg );
							// debug

//System.out.println("������� END");
						}else{
						}

					}

					// =======================================
					// �󒍗���ԍ��̔�
					// =======================================
//System.out.println("�󒍗���ԍ��̔� BEGIN");
					if(m_med.getgetSEQ_RSLT_ODR().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.getgetSEQ_RSLT_ODR().next() == false){
						//�󒍗���ԍ��̔ԃG���[
						this.writeLogMessage("KQ00135",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.setErrWngMessage("1","KQ00135");
						this.writeErrWngMessage();
						continue;
					}
					m_med.setstrRSLT_CTL_SEQ_CD(m_med.getstrRSLT_CTL_SEQ_CD());
//int aaa=100/0;
					//=======================================
					// �󒍗����쐬
					//=======================================
//System.out.println("�󒍗����̓o�^ BEGIN");
					m_med.setstrUNIT(m_med.getstrUNIT_CD());										//�P��
					m_med.setstrDLV_PLACE_CD(m_med.getstrDLV_LOC_CD());								//�[�i�ꏊ�R�[�h
					m_med.setstrUNIT_PRICE(m_med.getstrODR_UNIT_PRICE());							//�P��
					m_med.setstrSPCL_PRICE_CO(m_med.getstrSPCL_PRICE_TYP());						//���l
					m_med.setstrCUST_DLV_CD(m_med.getstrCUS_DLV_CD());								//�[���ԍ�
					m_med.setstrCUST_DLV_KEY_CD(m_med.getstrCUS_DLV_KEY_CD());						//�[�i�L�[�ԍ�

					//System.out.println("RSLT_CTL_SEQ_CD=" + m_med.getstrRSLT_CTL_SEQ_CD());
					//System.out.println("UNIT=" + m_med.getstrUNIT());							//�P��
					//System.out.println("DLV_PLACE_CD=" + m_med.getstrDLV_PLACE_CD());			//�[�i�ꏊ�R�[�h
					//System.out.println("UNIT_PRICE=" + m_med.getstrUNIT_PRICE());				//�P��
					//System.out.println("SPCL_PRICE_CO=" + m_med.getstrSPCL_PRICE_CO());			//���l
					//System.out.println("CUST_DLV_CD=" + m_med.getstrCUST_DLV_CD());				//�[���ԍ�
					//System.out.println("CUST_DLV_KEY_CD=" + m_med.getstrCUST_DLV_KEY_CD());		//�[�i�L�[�ԍ�

					rv = m_med.gettbl_T_ODR_ACPT_RSLT().create();
					//System.out.println("�󒍗����̓o�^ END");


					/* �Z�[���̏ꍇ */
                    if(tan_flg_QTY == true){

                      //=======================================
                      // �o�׌v��i�[���񓚁j�쐬
                      //=======================================
                      //System.out.println("�[���񓚍쐬 BEGIN");
                      m_med.setstrDESINATED_SHIP_DATE(cnvShipDate(m_med, shipPlantCd));						//�o�׎w���
                      m_med.setstrDESINATED_SHIP_QTY(m_med.getstrODR_QTY());						//�o�׎w�萔��
                      m_med.setstrREST_SHIP_ODR_QTY(m_med.getstrODR_QTY());						//�o�׎w���c����
                      //�ŐV�[���񓚓��@�o�׎w����{�^��������ݒ� 2004/1/21
                      m_med.setstrLAST_ANS_DLV_DATE_RCD(calcWorkDate(m_med.getstrDESINATED_SHIP_DATE(),m_med.getstrTRANSPORT_LT().intValue()));

                      rv = m_med.gettbl_T_ANS_DLV_DATE().create();
                      //System.out.println("�[���񓚍쐬 END");

                    }//�m�蒍���i�ʏ�܂��͗a��SP�j�̏ꍇ�̏��������

					//=======================================
					// �󒍎捞�Ώۃf�[�^�̎捞�t���O���P�ɍX�V
					//=======================================
					m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_SUMI);
					rv = m_med.getINDATA().update();
					conn.commit();

					this.writeLogMessage("KQ00146",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
//System.out.println(Integer.toString(rec+1) +"���ڂ̏����I��-----------------------------------------commit���܂���");
				}
				//�X�^�b�N����Ă��郁�b�Z�[�W������΁A�o�͂���
//				if(warn_flg == false || ok_flg == false){
					//�x���܂��̓G���[������ꍇ�́A���b�Z�[�W����������
					this.writeErrWngMessage();
//				}

				conn.commit();

//-----------------------------------------------------------------------------
//		�������捞�����i�����܂Łj
//-----------------------------------------------------------------------------
//System.out.println("\n******>>>> ("+this.m_vTODAY+")�̒������捞�o�b�`����END <<<<******");
			}catch(Exception e) {
				try {
				conn.rollback();
				e.printStackTrace();
					// �R�l�N�V������n���āA�̔Ԃ̏���
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// �������捞�Ώۃf�[�^�̎擾�Ɏ��s���܂����B
					String strMsgCd = "KQ00303";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
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
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
	    } catch (Exception e) {
			try {
				conn.rollback();
				e.printStackTrace();
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// �������捞�o�b�`�����ɂĒv���I�ȃG���[���������܂����B
				String strMsgCd = "KQ00303";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				}
				conn.commit();
			} catch (SQLException ex) {
				ex.printStackTrace();
			} catch (FoundationException ex) {
				ex.printStackTrace();
			}
	    } finally {
			//�o�b�`�I�����b�Z�[�W�o�^
			// �R�l�N�V������n���āA�̔Ԃ̏���
			try {
				
				// �R�l�N�V������n���āA�Ɩ����b�Z�[�W����
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				
				// �R�l�N�V������n���āA�̔Ԃ̏���
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
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
					// �Ɩ����b�Z�[�W�ǉ�
					String strMsgCd = "KQ00302";
					String strDataString = "(SBM0603)<< �������捞�o�b�`�����I�� >>";
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

//-----------------------------------------------------------------------------

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
		public medKQ0010B001 m_med=null;

		/**
		 * �R���e�i�N���X�C���X�^���X
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKQ0010B001 med) throws BatchAppException
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
