/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0050/src/com/nec/jp/orteus/metamorBase/KM0050/KM0050010Struct.java,v $
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
 * EXPJ    (2005/01/19),SRCGEN�Ή�
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 * EXPJ    (2004/04/01),setStruct���\�b�h�̌ʃ����o�̂ݔ�setStructM�ƁA���X�g�����o�̂ݔ�setStructL��ǉ��B
 *                      initialize�ł̃f�[�^�Z�b�g�́Aclear���Ă�ł���s���悤�ɏC���B
 * EXPJ    (2004/03/31),�����l�̃R�����g�A�E�g�̃o�O���C���B
 * EXPJ    (2004/03/20),���r���[���ʂ𔽉f�B
 * EXPJ    (2004/03/02),EXPLANNER/J�p�ɉ����i�\�[�X�w�b�_�E�N���X�w�b�_�ύX�j
 *                      �����������ɏ����l��null�ō쐬�B
 *                      ���������\�b�hinitialize�A�f�[�^�Z�b�g���\�b�hsetStruct�ǉ��B
 *                      �R���X�g���N�^�̃��[�U�L�q����initialize���\�b�h�ďo�ǉ��B
 *                      initialize()���\�b�h�AsetStruct()���\�b�h�ǉ��B
 * 4.1.0.0 (2003/07/16),setL2L_xxx���\�b�h�ǉ�
 * 4.0.0.1 (2003/06/05),javadoc�R�����g�G���[�C��
 * 4.0.0.0 (2003/04/23),�N���X���W�����Ή�
 * 3.0.0.0 (2003/03/19),Time,Timestamp�^�Ή�
 * 2.1.0.0 (2002/12/17),Logging package�C��
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.KM0050;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0050010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 03:24:09 $
 *
 */
//}}user_implement_code_header

public class KM0050010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_CALCULATION_DATE */
	public String m_CALCULATION_DATE = null;
	/** �� 2 �ϐ��F m_TYP */
	public String m_TYP = null;
	/** �� 3 �ϐ��F m_PROGRESS */
	public String m_PROGRESS = null;
	/** �� 4 �ϐ��F m_PROFIT_RATIO */
	public String m_PROFIT_RATIO = null;
	/** �� 5 �ϐ��F m_ITEM_TOTAL_COST */
	public String m_ITEM_TOTAL_COST = null;
	/** �� 6 �ϐ��F m_ODR_AMOUNT_W */
	public String m_ODR_AMOUNT_W = null;
	/** �� 7 �ϐ��F m_ITEM_TOTAL_COST_W */
	public String m_ITEM_TOTAL_COST_W = null;
	/** �� 8 �ϐ��F m_ITEM_TOTAL_COST_T */
	public String m_ITEM_TOTAL_COST_T = null;
	/** �� 9 �ϐ��F m_ITEM_TOTAL_COST_P */
	public String m_ITEM_TOTAL_COST_P = null;
	/** �� 10 �ϐ��F m_ITEM_TOTAL_COST_D */
	public String m_ITEM_TOTAL_COST_D = null;
	/** �� 11 �ϐ��F m_MATERIAL_COST_W */
	public String m_MATERIAL_COST_W = null;
	/** �� 12 �ϐ��F m_MATERIAL_COST_T */
	public String m_MATERIAL_COST_T = null;
	/** �� 13 �ϐ��F m_MATERIAL_COST_P */
	public String m_MATERIAL_COST_P = null;
	/** �� 14 �ϐ��F m_MATERIAL_COST_D */
	public String m_MATERIAL_COST_D = null;
	/** �� 15 �ϐ��F m_PROCESSING_COST_W */
	public String m_PROCESSING_COST_W = null;
	/** �� 16 �ϐ��F m_PROCESSING_COST_T */
	public String m_PROCESSING_COST_T = null;
	/** �� 17 �ϐ��F m_PROCESSING_COST_P */
	public String m_PROCESSING_COST_P = null;
	/** �� 18 �ϐ��F m_PROCESSING_COST_D */
	public String m_PROCESSING_COST_D = null;
	/** �� 19 �ϐ��F m_SBCNT_COST_W */
	public String m_SBCNT_COST_W = null;
	/** �� 20 �ϐ��F m_SBCNT_COST_T */
	public String m_SBCNT_COST_T = null;
	/** �� 21 �ϐ��F m_SBCNT_COST_P */
	public String m_SBCNT_COST_P = null;
	/** �� 22 �ϐ��F m_SBCNT_COST_D */
	public String m_SBCNT_COST_D = null;
	/** �� 23 �ϐ��F m_OTHER_OVERHEADS_W */
	public String m_OTHER_OVERHEADS_W = null;
	/** �� 24 �ϐ��F m_OTHER_OVERHEADS_T */
	public String m_OTHER_OVERHEADS_T = null;
	/** �� 25 �ϐ��F m_OTHER_OVERHEADS_P */
	public String m_OTHER_OVERHEADS_P = null;
	/** �� 26 �ϐ��F m_OTHER_OVERHEADS_D */
	public String m_OTHER_OVERHEADS_D = null;
	/** �� 27 �ϐ��F m_SERVICE_COST_W */
	public String m_SERVICE_COST_W = null;
	/** �� 28 �ϐ��F m_SERVICE_COST_T */
	public String m_SERVICE_COST_T = null;
	/** �� 29 �ϐ��F m_SERVICE_COST_P */
	public String m_SERVICE_COST_P = null;
	/** �� 30 �ϐ��F m_SERVICE_COST_D */
	public String m_SERVICE_COST_D = null;
	/** �� 31 �ϐ��F m_PROFIT_RATIO_W */
	public String m_PROFIT_RATIO_W = null;
	/** �� 32 �ϐ��F m_PROFIT_RATIO_P */
	public String m_PROFIT_RATIO_P = null;
	/** �� 33 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 34 �ϐ��F m_TYP_NUM */
	public String m_TYP_NUM = null;
	/** �� 35 �ϐ��F m_h_DETAL_NO */
	public String m_h_DETAL_NO = null;
	/** �� 36 �ϐ��F m_h_ES_COST_ETC */
	public String m_h_ES_COST_ETC = null;
	/** �� 37 �ϐ��F m_h_COST_PROGRESS */
	public String m_h_COST_PROGRESS = null;
	/** �� 38 �ϐ��F m_l_ODR_AMOUNT */
	public String m_l_ODR_AMOUNT = null;
	/** �� 39 �ϐ��F m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** �� 40 �ϐ��F m_l_ODR_UNIT_PRICE */
	public String m_l_ODR_UNIT_PRICE = null;
	/** �� 41 �ϐ��F m_ITEM_TOTAL_COST_D2 */
	public String m_ITEM_TOTAL_COST_D2 = null;
	/** �� 42 �ϐ��F m_MATERIAL_COST_D2 */
	public String m_MATERIAL_COST_D2 = null;
	/** �� 43 �ϐ��F m_PROCESSING_COST_D2 */
	public String m_PROCESSING_COST_D2 = null;
	/** �� 44 �ϐ��F m_SBCNT_COST_D2 */
	public String m_SBCNT_COST_D2 = null;
	/** �� 45 �ϐ��F m_OTHER_OVERHEADS_D2 */
	public String m_OTHER_OVERHEADS_D2 = null;
	/** �� 46 �ϐ��F m_SERVICE_COST_D2 */
	public String m_SERVICE_COST_D2 = null;
	/** �� 47 �ϐ��F m_PROGRESS_NO */
	public String m_PROGRESS_NO = null;
	/** �� 48 �ϐ��F m_pnumFlag */
	public String m_pnumFlag = null;
	/** �� 49 �ϐ��F m_PROJECT_STAT */
	public String m_PROJECT_STAT = null;
	/** �� 50 �ϐ��F m_PROJECT_CD */
	public String m_PROJECT_CD = null;
	/** �� 51 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;
	/** �� 52 �ϐ��F m_CMP_COST_ETC */
	public String m_CMP_COST_ETC = null;
	/** �� 53 �ϐ��F m_ESTIMATE_NO */
	public String m_ESTIMATE_NO = null;
	/** �� 54 �ϐ��F m_DETAL_NO */
	public String m_DETAL_NO = null;
	/** �� 55 �ϐ��F m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** �� 56 �ϐ��F m_NAME */
	public String m_NAME = null;
	/** �� 57 �ϐ��F m_VALUE */
	public String m_VALUE = null;
	/** �� 58 �ϐ��F m_PROJECT_NAME */
	public String m_PROJECT_NAME = null;
	/** �� 59 �ϐ��F m_PJ_MODIFY_COUNT */
	public String m_PJ_MODIFY_COUNT = null;
	/** �� 60 �ϐ��F m_ESTIMATE_TYPE */
	public String m_ESTIMATE_TYPE = null;
	/** �� 61 �ϐ��F m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** �� 62 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 63 �ϐ��F m_ODR_AMOUNT */
	public String m_ODR_AMOUNT = null;
	/** �� 64 �ϐ��F m_ES_COST_MATERIAL */
	public String m_ES_COST_MATERIAL = null;
	/** �� 65 �ϐ��F m_ES_COST_PROCESS */
	public String m_ES_COST_PROCESS = null;
	/** �� 66 �ϐ��F m_ES_COST_OUTSOUCE */
	public String m_ES_COST_OUTSOUCE = null;
	/** �� 67 �ϐ��F m_ES_COST_ETC */
	public String m_ES_COST_ETC = null;
	/** �� 68 �ϐ��F m_ES_COST_SERVICE */
	public String m_ES_COST_SERVICE = null;
	/** �� 69 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 70 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 71 �ϐ��F m_UNIT_CD */
	public String m_UNIT_CD = null;
	/** �� 72 �ϐ��F m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** �� 73 �ϐ��F m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** �� 74 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 75 �ϐ��F m_l_JOB_ODR_CANCEL_NO */
	public String m_l_JOB_ODR_CANCEL_NO = null;
	/** �� 76 �ϐ��F m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** �� 77 �ϐ��F m_TOTAL_DATE */
	public String m_TOTAL_DATE = null;
	/** �� 78 �ϐ��F m_COST_PROGRESS */
	public String m_COST_PROGRESS = null;
	/** �� 79 �ϐ��F m_CMP_COST_MATERIAL */
	public String m_CMP_COST_MATERIAL = null;
	/** �� 80 �ϐ��F m_EXP_COST_MATERIAL */
	public String m_EXP_COST_MATERIAL = null;
	/** �� 81 �ϐ��F m_CMP_COST_PROCESS */
	public String m_CMP_COST_PROCESS = null;
	/** �� 82 �ϐ��F m_EXP_COST_PROCESS */
	public String m_EXP_COST_PROCESS = null;
	/** �� 83 �ϐ��F m_CMP_COST_OUTSOUCE */
	public String m_CMP_COST_OUTSOUCE = null;
	/** �� 84 �ϐ��F m_EXP_COST_OUTSOUCE */
	public String m_EXP_COST_OUTSOUCE = null;
	/** �� 85 �ϐ��F m_CMP_COST_SERVICE */
	public String m_CMP_COST_SERVICE = null;
	/** �� 86 �ϐ��F m_EXP_COST_SERVICE */
	public String m_EXP_COST_SERVICE = null;
	/** �� 87 �ϐ��F m_OD_COMP_FLG */
	public String m_OD_COMP_FLG = null;
	/** �� 88 �ϐ��F m_pvc2LogMode */
	public String m_pvc2LogMode = null;
	/** �� 89 �ϐ��F m_pvc2OutputMode */
	public String m_pvc2OutputMode = null;
	/** �� 90 �ϐ��F m_pvc2OutputPath */
	public String m_pvc2OutputPath = null;
	/** �� 91 �ϐ��F m_pvc2OutputName */
	public String m_pvc2OutputName = null;
	/** �� 92 �ϐ��F m_pvc2UserId */
	public String m_pvc2UserId = null;
	/** �� 93 �ϐ��F m_pvc2BusinessName */
	public String m_pvc2BusinessName = null;
	/** �� 94 �ϐ��F m_pvc2PlantCd */
	public String m_pvc2PlantCd = null;
	/** �� 95 �ϐ��F m_pvc2OdrNo */
	public String m_pvc2OdrNo = null;
	/** �� 96 �ϐ��F m_pvc2PProjectCd */
	public String m_pvc2PProjectCd = null;
	/** �� 97 �ϐ��F m_pnumEstimateNo */
	public String m_pnumEstimateNo = null;
	/** �� 98 �ϐ��F m_pnumDetalNo */
	public String m_pnumDetalNo = null;
	/** �� 99 �ϐ��F m_pnumReturn */
	public String m_pnumReturn = null;
	/** �� 100 �ϐ��F m_FILE_PATH */
	public String m_FILE_PATH = null;
	/** �� 101 �ϐ��F m_FILE_NAME */
	public String m_FILE_NAME = null;
	/** �� 102 �ϐ��F m_LOG_MODE_TYP */
	public String m_LOG_MODE_TYP = null;
	/** �� 103 �ϐ��F m_OUTPUT_MODE_TYP */
	public String m_OUTPUT_MODE_TYP = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_CALCULATION_DATE */
	public List l_CALCULATION_DATE = null;

	/** �� 2 List�ϐ��F l_TYP */
	public List l_TYP = null;

	/** �� 3 List�ϐ��F l_PROGRESS */
	public List l_PROGRESS = null;

	/** �� 4 List�ϐ��F l_PROFIT_RATIO */
	public List l_PROFIT_RATIO = null;

	/** �� 5 List�ϐ��F l_ITEM_TOTAL_COST */
	public List l_ITEM_TOTAL_COST = null;

	/** �� 6 List�ϐ��F l_ODR_AMOUNT_W */
	public List l_ODR_AMOUNT_W = null;

	/** �� 7 List�ϐ��F l_ITEM_TOTAL_COST_W */
	public List l_ITEM_TOTAL_COST_W = null;

	/** �� 8 List�ϐ��F l_ITEM_TOTAL_COST_T */
	public List l_ITEM_TOTAL_COST_T = null;

	/** �� 9 List�ϐ��F l_ITEM_TOTAL_COST_P */
	public List l_ITEM_TOTAL_COST_P = null;

	/** �� 10 List�ϐ��F l_ITEM_TOTAL_COST_D */
	public List l_ITEM_TOTAL_COST_D = null;

	/** �� 11 List�ϐ��F l_MATERIAL_COST_W */
	public List l_MATERIAL_COST_W = null;

	/** �� 12 List�ϐ��F l_MATERIAL_COST_T */
	public List l_MATERIAL_COST_T = null;

	/** �� 13 List�ϐ��F l_MATERIAL_COST_P */
	public List l_MATERIAL_COST_P = null;

	/** �� 14 List�ϐ��F l_MATERIAL_COST_D */
	public List l_MATERIAL_COST_D = null;

	/** �� 15 List�ϐ��F l_PROCESSING_COST_W */
	public List l_PROCESSING_COST_W = null;

	/** �� 16 List�ϐ��F l_PROCESSING_COST_T */
	public List l_PROCESSING_COST_T = null;

	/** �� 17 List�ϐ��F l_PROCESSING_COST_P */
	public List l_PROCESSING_COST_P = null;

	/** �� 18 List�ϐ��F l_PROCESSING_COST_D */
	public List l_PROCESSING_COST_D = null;

	/** �� 19 List�ϐ��F l_SBCNT_COST_W */
	public List l_SBCNT_COST_W = null;

	/** �� 20 List�ϐ��F l_SBCNT_COST_T */
	public List l_SBCNT_COST_T = null;

	/** �� 21 List�ϐ��F l_SBCNT_COST_P */
	public List l_SBCNT_COST_P = null;

	/** �� 22 List�ϐ��F l_SBCNT_COST_D */
	public List l_SBCNT_COST_D = null;

	/** �� 23 List�ϐ��F l_OTHER_OVERHEADS_W */
	public List l_OTHER_OVERHEADS_W = null;

	/** �� 24 List�ϐ��F l_OTHER_OVERHEADS_T */
	public List l_OTHER_OVERHEADS_T = null;

	/** �� 25 List�ϐ��F l_OTHER_OVERHEADS_P */
	public List l_OTHER_OVERHEADS_P = null;

	/** �� 26 List�ϐ��F l_OTHER_OVERHEADS_D */
	public List l_OTHER_OVERHEADS_D = null;

	/** �� 27 List�ϐ��F l_SERVICE_COST_W */
	public List l_SERVICE_COST_W = null;

	/** �� 28 List�ϐ��F l_SERVICE_COST_T */
	public List l_SERVICE_COST_T = null;

	/** �� 29 List�ϐ��F l_SERVICE_COST_P */
	public List l_SERVICE_COST_P = null;

	/** �� 30 List�ϐ��F l_SERVICE_COST_D */
	public List l_SERVICE_COST_D = null;

	/** �� 31 List�ϐ��F l_PROFIT_RATIO_W */
	public List l_PROFIT_RATIO_W = null;

	/** �� 32 List�ϐ��F l_PROFIT_RATIO_P */
	public List l_PROFIT_RATIO_P = null;

	/** �� 33 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 34 List�ϐ��F l_TYP_NUM */
	public List l_TYP_NUM = null;

	/** �� 35 List�ϐ��F l_h_DETAL_NO */
	public List l_h_DETAL_NO = null;

	/** �� 36 List�ϐ��F l_h_ES_COST_ETC */
	public List l_h_ES_COST_ETC = null;

	/** �� 37 List�ϐ��F l_h_COST_PROGRESS */
	public List l_h_COST_PROGRESS = null;

	/** �� 38 List�ϐ��F l_l_ODR_AMOUNT */
	public List l_l_ODR_AMOUNT = null;

	/** �� 39 List�ϐ��F l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** �� 40 List�ϐ��F l_l_ODR_UNIT_PRICE */
	public List l_l_ODR_UNIT_PRICE = null;

	/** �� 41 List�ϐ��F l_ITEM_TOTAL_COST_D2 */
	public List l_ITEM_TOTAL_COST_D2 = null;

	/** �� 42 List�ϐ��F l_MATERIAL_COST_D2 */
	public List l_MATERIAL_COST_D2 = null;

	/** �� 43 List�ϐ��F l_PROCESSING_COST_D2 */
	public List l_PROCESSING_COST_D2 = null;

	/** �� 44 List�ϐ��F l_SBCNT_COST_D2 */
	public List l_SBCNT_COST_D2 = null;

	/** �� 45 List�ϐ��F l_OTHER_OVERHEADS_D2 */
	public List l_OTHER_OVERHEADS_D2 = null;

	/** �� 46 List�ϐ��F l_SERVICE_COST_D2 */
	public List l_SERVICE_COST_D2 = null;

	/** �� 47 List�ϐ��F l_PROGRESS_NO */
	public List l_PROGRESS_NO = null;

	/** �� 48 List�ϐ��F l_pnumFlag */
	public List l_pnumFlag = null;

	/** �� 49 List�ϐ��F l_PROJECT_STAT */
	public List l_PROJECT_STAT = null;

	/** �� 50 List�ϐ��F l_PROJECT_CD */
	public List l_PROJECT_CD = null;

	/** �� 51 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;

	/** �� 52 List�ϐ��F l_CMP_COST_ETC */
	public List l_CMP_COST_ETC = null;

	/** �� 53 List�ϐ��F l_ESTIMATE_NO */
	public List l_ESTIMATE_NO = null;

	/** �� 54 List�ϐ��F l_DETAL_NO */
	public List l_DETAL_NO = null;

	/** �� 55 List�ϐ��F l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** �� 56 List�ϐ��F l_NAME */
	public List l_NAME = null;

	/** �� 57 List�ϐ��F l_VALUE */
	public List l_VALUE = null;

	/** �� 58 List�ϐ��F l_PROJECT_NAME */
	public List l_PROJECT_NAME = null;

	/** �� 59 List�ϐ��F l_PJ_MODIFY_COUNT */
	public List l_PJ_MODIFY_COUNT = null;

	/** �� 60 List�ϐ��F l_ESTIMATE_TYPE */
	public List l_ESTIMATE_TYPE = null;

	/** �� 61 List�ϐ��F l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** �� 62 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 63 List�ϐ��F l_ODR_AMOUNT */
	public List l_ODR_AMOUNT = null;

	/** �� 64 List�ϐ��F l_ES_COST_MATERIAL */
	public List l_ES_COST_MATERIAL = null;

	/** �� 65 List�ϐ��F l_ES_COST_PROCESS */
	public List l_ES_COST_PROCESS = null;

	/** �� 66 List�ϐ��F l_ES_COST_OUTSOUCE */
	public List l_ES_COST_OUTSOUCE = null;

	/** �� 67 List�ϐ��F l_ES_COST_ETC */
	public List l_ES_COST_ETC = null;

	/** �� 68 List�ϐ��F l_ES_COST_SERVICE */
	public List l_ES_COST_SERVICE = null;

	/** �� 69 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 70 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 71 List�ϐ��F l_UNIT_CD */
	public List l_UNIT_CD = null;

	/** �� 72 List�ϐ��F l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** �� 73 List�ϐ��F l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** �� 74 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 75 List�ϐ��F l_l_JOB_ODR_CANCEL_NO */
	public List l_l_JOB_ODR_CANCEL_NO = null;

	/** �� 76 List�ϐ��F l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** �� 77 List�ϐ��F l_TOTAL_DATE */
	public List l_TOTAL_DATE = null;

	/** �� 78 List�ϐ��F l_COST_PROGRESS */
	public List l_COST_PROGRESS = null;

	/** �� 79 List�ϐ��F l_CMP_COST_MATERIAL */
	public List l_CMP_COST_MATERIAL = null;

	/** �� 80 List�ϐ��F l_EXP_COST_MATERIAL */
	public List l_EXP_COST_MATERIAL = null;

	/** �� 81 List�ϐ��F l_CMP_COST_PROCESS */
	public List l_CMP_COST_PROCESS = null;

	/** �� 82 List�ϐ��F l_EXP_COST_PROCESS */
	public List l_EXP_COST_PROCESS = null;

	/** �� 83 List�ϐ��F l_CMP_COST_OUTSOUCE */
	public List l_CMP_COST_OUTSOUCE = null;

	/** �� 84 List�ϐ��F l_EXP_COST_OUTSOUCE */
	public List l_EXP_COST_OUTSOUCE = null;

	/** �� 85 List�ϐ��F l_CMP_COST_SERVICE */
	public List l_CMP_COST_SERVICE = null;

	/** �� 86 List�ϐ��F l_EXP_COST_SERVICE */
	public List l_EXP_COST_SERVICE = null;

	/** �� 87 List�ϐ��F l_OD_COMP_FLG */
	public List l_OD_COMP_FLG = null;

	/** �� 88 List�ϐ��F l_pvc2LogMode */
	public List l_pvc2LogMode = null;

	/** �� 89 List�ϐ��F l_pvc2OutputMode */
	public List l_pvc2OutputMode = null;

	/** �� 90 List�ϐ��F l_pvc2OutputPath */
	public List l_pvc2OutputPath = null;

	/** �� 91 List�ϐ��F l_pvc2OutputName */
	public List l_pvc2OutputName = null;

	/** �� 92 List�ϐ��F l_pvc2UserId */
	public List l_pvc2UserId = null;

	/** �� 93 List�ϐ��F l_pvc2BusinessName */
	public List l_pvc2BusinessName = null;

	/** �� 94 List�ϐ��F l_pvc2PlantCd */
	public List l_pvc2PlantCd = null;

	/** �� 95 List�ϐ��F l_pvc2OdrNo */
	public List l_pvc2OdrNo = null;

	/** �� 96 List�ϐ��F l_pvc2PProjectCd */
	public List l_pvc2PProjectCd = null;

	/** �� 97 List�ϐ��F l_pnumEstimateNo */
	public List l_pnumEstimateNo = null;

	/** �� 98 List�ϐ��F l_pnumDetalNo */
	public List l_pnumDetalNo = null;

	/** �� 99 List�ϐ��F l_pnumReturn */
	public List l_pnumReturn = null;

	/** �� 100 List�ϐ��F l_FILE_PATH */
	public List l_FILE_PATH = null;

	/** �� 101 List�ϐ��F l_FILE_NAME */
	public List l_FILE_NAME = null;

	/** �� 102 List�ϐ��F l_LOG_MODE_TYP */
	public List l_LOG_MODE_TYP = null;

	/** �� 103 List�ϐ��F l_OUTPUT_MODE_TYP */
	public List l_OUTPUT_MODE_TYP = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCALCULATION_DATE() { return m_CALCULATION_DATE; }
	public String getTYP() { return m_TYP; }
	public String getPROGRESS() { return m_PROGRESS; }
	public String getPROFIT_RATIO() { return m_PROFIT_RATIO; }
	public String getITEM_TOTAL_COST() { return m_ITEM_TOTAL_COST; }
	public String getODR_AMOUNT_W() { return m_ODR_AMOUNT_W; }
	public String getITEM_TOTAL_COST_W() { return m_ITEM_TOTAL_COST_W; }
	public String getITEM_TOTAL_COST_T() { return m_ITEM_TOTAL_COST_T; }
	public String getITEM_TOTAL_COST_P() { return m_ITEM_TOTAL_COST_P; }
	public String getITEM_TOTAL_COST_D() { return m_ITEM_TOTAL_COST_D; }
	public String getMATERIAL_COST_W() { return m_MATERIAL_COST_W; }
	public String getMATERIAL_COST_T() { return m_MATERIAL_COST_T; }
	public String getMATERIAL_COST_P() { return m_MATERIAL_COST_P; }
	public String getMATERIAL_COST_D() { return m_MATERIAL_COST_D; }
	public String getPROCESSING_COST_W() { return m_PROCESSING_COST_W; }
	public String getPROCESSING_COST_T() { return m_PROCESSING_COST_T; }
	public String getPROCESSING_COST_P() { return m_PROCESSING_COST_P; }
	public String getPROCESSING_COST_D() { return m_PROCESSING_COST_D; }
	public String getSBCNT_COST_W() { return m_SBCNT_COST_W; }
	public String getSBCNT_COST_T() { return m_SBCNT_COST_T; }
	public String getSBCNT_COST_P() { return m_SBCNT_COST_P; }
	public String getSBCNT_COST_D() { return m_SBCNT_COST_D; }
	public String getOTHER_OVERHEADS_W() { return m_OTHER_OVERHEADS_W; }
	public String getOTHER_OVERHEADS_T() { return m_OTHER_OVERHEADS_T; }
	public String getOTHER_OVERHEADS_P() { return m_OTHER_OVERHEADS_P; }
	public String getOTHER_OVERHEADS_D() { return m_OTHER_OVERHEADS_D; }
	public String getSERVICE_COST_W() { return m_SERVICE_COST_W; }
	public String getSERVICE_COST_T() { return m_SERVICE_COST_T; }
	public String getSERVICE_COST_P() { return m_SERVICE_COST_P; }
	public String getSERVICE_COST_D() { return m_SERVICE_COST_D; }
	public String getPROFIT_RATIO_W() { return m_PROFIT_RATIO_W; }
	public String getPROFIT_RATIO_P() { return m_PROFIT_RATIO_P; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getTYP_NUM() { return m_TYP_NUM; }
	public String geth_DETAL_NO() { return m_h_DETAL_NO; }
	public String geth_ES_COST_ETC() { return m_h_ES_COST_ETC; }
	public String geth_COST_PROGRESS() { return m_h_COST_PROGRESS; }
	public String getl_ODR_AMOUNT() { return m_l_ODR_AMOUNT; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_ODR_UNIT_PRICE() { return m_l_ODR_UNIT_PRICE; }
	public String getITEM_TOTAL_COST_D2() { return m_ITEM_TOTAL_COST_D2; }
	public String getMATERIAL_COST_D2() { return m_MATERIAL_COST_D2; }
	public String getPROCESSING_COST_D2() { return m_PROCESSING_COST_D2; }
	public String getSBCNT_COST_D2() { return m_SBCNT_COST_D2; }
	public String getOTHER_OVERHEADS_D2() { return m_OTHER_OVERHEADS_D2; }
	public String getSERVICE_COST_D2() { return m_SERVICE_COST_D2; }
	public String getPROGRESS_NO() { return m_PROGRESS_NO; }
	public String getpnumFlag() { return m_pnumFlag; }
	public String getPROJECT_STAT() { return m_PROJECT_STAT; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getCMP_COST_ETC() { return m_CMP_COST_ETC; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getDETAL_NO() { return m_DETAL_NO; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String getNAME() { return m_NAME; }
	public String getVALUE() { return m_VALUE; }
	public String getPROJECT_NAME() { return m_PROJECT_NAME; }
	public String getPJ_MODIFY_COUNT() { return m_PJ_MODIFY_COUNT; }
	public String getESTIMATE_TYPE() { return m_ESTIMATE_TYPE; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getODR_AMOUNT() { return m_ODR_AMOUNT; }
	public String getES_COST_MATERIAL() { return m_ES_COST_MATERIAL; }
	public String getES_COST_PROCESS() { return m_ES_COST_PROCESS; }
	public String getES_COST_OUTSOUCE() { return m_ES_COST_OUTSOUCE; }
	public String getES_COST_ETC() { return m_ES_COST_ETC; }
	public String getES_COST_SERVICE() { return m_ES_COST_SERVICE; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_JOB_ODR_CANCEL_NO() { return m_l_JOB_ODR_CANCEL_NO; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getTOTAL_DATE() { return m_TOTAL_DATE; }
	public String getCOST_PROGRESS() { return m_COST_PROGRESS; }
	public String getCMP_COST_MATERIAL() { return m_CMP_COST_MATERIAL; }
	public String getEXP_COST_MATERIAL() { return m_EXP_COST_MATERIAL; }
	public String getCMP_COST_PROCESS() { return m_CMP_COST_PROCESS; }
	public String getEXP_COST_PROCESS() { return m_EXP_COST_PROCESS; }
	public String getCMP_COST_OUTSOUCE() { return m_CMP_COST_OUTSOUCE; }
	public String getEXP_COST_OUTSOUCE() { return m_EXP_COST_OUTSOUCE; }
	public String getCMP_COST_SERVICE() { return m_CMP_COST_SERVICE; }
	public String getEXP_COST_SERVICE() { return m_EXP_COST_SERVICE; }
	public String getOD_COMP_FLG() { return m_OD_COMP_FLG; }
	public String getpvc2LogMode() { return m_pvc2LogMode; }
	public String getpvc2OutputMode() { return m_pvc2OutputMode; }
	public String getpvc2OutputPath() { return m_pvc2OutputPath; }
	public String getpvc2OutputName() { return m_pvc2OutputName; }
	public String getpvc2UserId() { return m_pvc2UserId; }
	public String getpvc2BusinessName() { return m_pvc2BusinessName; }
	public String getpvc2PlantCd() { return m_pvc2PlantCd; }
	public String getpvc2OdrNo() { return m_pvc2OdrNo; }
	public String getpvc2PProjectCd() { return m_pvc2PProjectCd; }
	public String getpnumEstimateNo() { return m_pnumEstimateNo; }
	public String getpnumDetalNo() { return m_pnumDetalNo; }
	public String getpnumReturn() { return m_pnumReturn; }
	public String getFILE_PATH() { return m_FILE_PATH; }
	public String getFILE_NAME() { return m_FILE_NAME; }
	public String getLOG_MODE_TYP() { return m_LOG_MODE_TYP; }
	public String getOUTPUT_MODE_TYP() { return m_OUTPUT_MODE_TYP; }

	public List getList_CALCULATION_DATE() { return l_CALCULATION_DATE; }
	public List getList_TYP() { return l_TYP; }
	public List getList_PROGRESS() { return l_PROGRESS; }
	public List getList_PROFIT_RATIO() { return l_PROFIT_RATIO; }
	public List getList_ITEM_TOTAL_COST() { return l_ITEM_TOTAL_COST; }
	public List getList_ODR_AMOUNT_W() { return l_ODR_AMOUNT_W; }
	public List getList_ITEM_TOTAL_COST_W() { return l_ITEM_TOTAL_COST_W; }
	public List getList_ITEM_TOTAL_COST_T() { return l_ITEM_TOTAL_COST_T; }
	public List getList_ITEM_TOTAL_COST_P() { return l_ITEM_TOTAL_COST_P; }
	public List getList_ITEM_TOTAL_COST_D() { return l_ITEM_TOTAL_COST_D; }
	public List getList_MATERIAL_COST_W() { return l_MATERIAL_COST_W; }
	public List getList_MATERIAL_COST_T() { return l_MATERIAL_COST_T; }
	public List getList_MATERIAL_COST_P() { return l_MATERIAL_COST_P; }
	public List getList_MATERIAL_COST_D() { return l_MATERIAL_COST_D; }
	public List getList_PROCESSING_COST_W() { return l_PROCESSING_COST_W; }
	public List getList_PROCESSING_COST_T() { return l_PROCESSING_COST_T; }
	public List getList_PROCESSING_COST_P() { return l_PROCESSING_COST_P; }
	public List getList_PROCESSING_COST_D() { return l_PROCESSING_COST_D; }
	public List getList_SBCNT_COST_W() { return l_SBCNT_COST_W; }
	public List getList_SBCNT_COST_T() { return l_SBCNT_COST_T; }
	public List getList_SBCNT_COST_P() { return l_SBCNT_COST_P; }
	public List getList_SBCNT_COST_D() { return l_SBCNT_COST_D; }
	public List getList_OTHER_OVERHEADS_W() { return l_OTHER_OVERHEADS_W; }
	public List getList_OTHER_OVERHEADS_T() { return l_OTHER_OVERHEADS_T; }
	public List getList_OTHER_OVERHEADS_P() { return l_OTHER_OVERHEADS_P; }
	public List getList_OTHER_OVERHEADS_D() { return l_OTHER_OVERHEADS_D; }
	public List getList_SERVICE_COST_W() { return l_SERVICE_COST_W; }
	public List getList_SERVICE_COST_T() { return l_SERVICE_COST_T; }
	public List getList_SERVICE_COST_P() { return l_SERVICE_COST_P; }
	public List getList_SERVICE_COST_D() { return l_SERVICE_COST_D; }
	public List getList_PROFIT_RATIO_W() { return l_PROFIT_RATIO_W; }
	public List getList_PROFIT_RATIO_P() { return l_PROFIT_RATIO_P; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_TYP_NUM() { return l_TYP_NUM; }
	public List getList_h_DETAL_NO() { return l_h_DETAL_NO; }
	public List getList_h_ES_COST_ETC() { return l_h_ES_COST_ETC; }
	public List getList_h_COST_PROGRESS() { return l_h_COST_PROGRESS; }
	public List getList_l_ODR_AMOUNT() { return l_l_ODR_AMOUNT; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_ODR_UNIT_PRICE() { return l_l_ODR_UNIT_PRICE; }
	public List getList_ITEM_TOTAL_COST_D2() { return l_ITEM_TOTAL_COST_D2; }
	public List getList_MATERIAL_COST_D2() { return l_MATERIAL_COST_D2; }
	public List getList_PROCESSING_COST_D2() { return l_PROCESSING_COST_D2; }
	public List getList_SBCNT_COST_D2() { return l_SBCNT_COST_D2; }
	public List getList_OTHER_OVERHEADS_D2() { return l_OTHER_OVERHEADS_D2; }
	public List getList_SERVICE_COST_D2() { return l_SERVICE_COST_D2; }
	public List getList_PROGRESS_NO() { return l_PROGRESS_NO; }
	public List getList_pnumFlag() { return l_pnumFlag; }
	public List getList_PROJECT_STAT() { return l_PROJECT_STAT; }
	public List getList_PROJECT_CD() { return l_PROJECT_CD; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_CMP_COST_ETC() { return l_CMP_COST_ETC; }
	public List getList_ESTIMATE_NO() { return l_ESTIMATE_NO; }
	public List getList_DETAL_NO() { return l_DETAL_NO; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_NAME() { return l_NAME; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_PROJECT_NAME() { return l_PROJECT_NAME; }
	public List getList_PJ_MODIFY_COUNT() { return l_PJ_MODIFY_COUNT; }
	public List getList_ESTIMATE_TYPE() { return l_ESTIMATE_TYPE; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_ODR_AMOUNT() { return l_ODR_AMOUNT; }
	public List getList_ES_COST_MATERIAL() { return l_ES_COST_MATERIAL; }
	public List getList_ES_COST_PROCESS() { return l_ES_COST_PROCESS; }
	public List getList_ES_COST_OUTSOUCE() { return l_ES_COST_OUTSOUCE; }
	public List getList_ES_COST_ETC() { return l_ES_COST_ETC; }
	public List getList_ES_COST_SERVICE() { return l_ES_COST_SERVICE; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_UNIT_CD() { return l_UNIT_CD; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_CANCEL_NO() { return l_l_JOB_ODR_CANCEL_NO; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_TOTAL_DATE() { return l_TOTAL_DATE; }
	public List getList_COST_PROGRESS() { return l_COST_PROGRESS; }
	public List getList_CMP_COST_MATERIAL() { return l_CMP_COST_MATERIAL; }
	public List getList_EXP_COST_MATERIAL() { return l_EXP_COST_MATERIAL; }
	public List getList_CMP_COST_PROCESS() { return l_CMP_COST_PROCESS; }
	public List getList_EXP_COST_PROCESS() { return l_EXP_COST_PROCESS; }
	public List getList_CMP_COST_OUTSOUCE() { return l_CMP_COST_OUTSOUCE; }
	public List getList_EXP_COST_OUTSOUCE() { return l_EXP_COST_OUTSOUCE; }
	public List getList_CMP_COST_SERVICE() { return l_CMP_COST_SERVICE; }
	public List getList_EXP_COST_SERVICE() { return l_EXP_COST_SERVICE; }
	public List getList_OD_COMP_FLG() { return l_OD_COMP_FLG; }
	public List getList_pvc2LogMode() { return l_pvc2LogMode; }
	public List getList_pvc2OutputMode() { return l_pvc2OutputMode; }
	public List getList_pvc2OutputPath() { return l_pvc2OutputPath; }
	public List getList_pvc2OutputName() { return l_pvc2OutputName; }
	public List getList_pvc2UserId() { return l_pvc2UserId; }
	public List getList_pvc2BusinessName() { return l_pvc2BusinessName; }
	public List getList_pvc2PlantCd() { return l_pvc2PlantCd; }
	public List getList_pvc2OdrNo() { return l_pvc2OdrNo; }
	public List getList_pvc2PProjectCd() { return l_pvc2PProjectCd; }
	public List getList_pnumEstimateNo() { return l_pnumEstimateNo; }
	public List getList_pnumDetalNo() { return l_pnumDetalNo; }
	public List getList_pnumReturn() { return l_pnumReturn; }
	public List getList_FILE_PATH() { return l_FILE_PATH; }
	public List getList_FILE_NAME() { return l_FILE_NAME; }
	public List getList_LOG_MODE_TYP() { return l_LOG_MODE_TYP; }
	public List getList_OUTPUT_MODE_TYP() { return l_OUTPUT_MODE_TYP; }

	public void setCALCULATION_DATE(String val) { m_CALCULATION_DATE = val; }
	public void setTYP(String val) { m_TYP = val; }
	public void setPROGRESS(String val) { m_PROGRESS = val; }
	public void setPROFIT_RATIO(String val) { m_PROFIT_RATIO = val; }
	public void setITEM_TOTAL_COST(String val) { m_ITEM_TOTAL_COST = val; }
	public void setODR_AMOUNT_W(String val) { m_ODR_AMOUNT_W = val; }
	public void setITEM_TOTAL_COST_W(String val) { m_ITEM_TOTAL_COST_W = val; }
	public void setITEM_TOTAL_COST_T(String val) { m_ITEM_TOTAL_COST_T = val; }
	public void setITEM_TOTAL_COST_P(String val) { m_ITEM_TOTAL_COST_P = val; }
	public void setITEM_TOTAL_COST_D(String val) { m_ITEM_TOTAL_COST_D = val; }
	public void setMATERIAL_COST_W(String val) { m_MATERIAL_COST_W = val; }
	public void setMATERIAL_COST_T(String val) { m_MATERIAL_COST_T = val; }
	public void setMATERIAL_COST_P(String val) { m_MATERIAL_COST_P = val; }
	public void setMATERIAL_COST_D(String val) { m_MATERIAL_COST_D = val; }
	public void setPROCESSING_COST_W(String val) { m_PROCESSING_COST_W = val; }
	public void setPROCESSING_COST_T(String val) { m_PROCESSING_COST_T = val; }
	public void setPROCESSING_COST_P(String val) { m_PROCESSING_COST_P = val; }
	public void setPROCESSING_COST_D(String val) { m_PROCESSING_COST_D = val; }
	public void setSBCNT_COST_W(String val) { m_SBCNT_COST_W = val; }
	public void setSBCNT_COST_T(String val) { m_SBCNT_COST_T = val; }
	public void setSBCNT_COST_P(String val) { m_SBCNT_COST_P = val; }
	public void setSBCNT_COST_D(String val) { m_SBCNT_COST_D = val; }
	public void setOTHER_OVERHEADS_W(String val) { m_OTHER_OVERHEADS_W = val; }
	public void setOTHER_OVERHEADS_T(String val) { m_OTHER_OVERHEADS_T = val; }
	public void setOTHER_OVERHEADS_P(String val) { m_OTHER_OVERHEADS_P = val; }
	public void setOTHER_OVERHEADS_D(String val) { m_OTHER_OVERHEADS_D = val; }
	public void setSERVICE_COST_W(String val) { m_SERVICE_COST_W = val; }
	public void setSERVICE_COST_T(String val) { m_SERVICE_COST_T = val; }
	public void setSERVICE_COST_P(String val) { m_SERVICE_COST_P = val; }
	public void setSERVICE_COST_D(String val) { m_SERVICE_COST_D = val; }
	public void setPROFIT_RATIO_W(String val) { m_PROFIT_RATIO_W = val; }
	public void setPROFIT_RATIO_P(String val) { m_PROFIT_RATIO_P = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setTYP_NUM(String val) { m_TYP_NUM = val; }
	public void seth_DETAL_NO(String val) { m_h_DETAL_NO = val; }
	public void seth_ES_COST_ETC(String val) { m_h_ES_COST_ETC = val; }
	public void seth_COST_PROGRESS(String val) { m_h_COST_PROGRESS = val; }
	public void setl_ODR_AMOUNT(String val) { m_l_ODR_AMOUNT = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_ODR_UNIT_PRICE(String val) { m_l_ODR_UNIT_PRICE = val; }
	public void setITEM_TOTAL_COST_D2(String val) { m_ITEM_TOTAL_COST_D2 = val; }
	public void setMATERIAL_COST_D2(String val) { m_MATERIAL_COST_D2 = val; }
	public void setPROCESSING_COST_D2(String val) { m_PROCESSING_COST_D2 = val; }
	public void setSBCNT_COST_D2(String val) { m_SBCNT_COST_D2 = val; }
	public void setOTHER_OVERHEADS_D2(String val) { m_OTHER_OVERHEADS_D2 = val; }
	public void setSERVICE_COST_D2(String val) { m_SERVICE_COST_D2 = val; }
	public void setPROGRESS_NO(String val) { m_PROGRESS_NO = val; }
	public void setpnumFlag(String val) { m_pnumFlag = val; }
	public void setPROJECT_STAT(String val) { m_PROJECT_STAT = val; }
	public void setPROJECT_CD(String val) { m_PROJECT_CD = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setCMP_COST_ETC(String val) { m_CMP_COST_ETC = val; }
	public void setESTIMATE_NO(String val) { m_ESTIMATE_NO = val; }
	public void setDETAL_NO(String val) { m_DETAL_NO = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void setNAME(String val) { m_NAME = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setPROJECT_NAME(String val) { m_PROJECT_NAME = val; }
	public void setPJ_MODIFY_COUNT(String val) { m_PJ_MODIFY_COUNT = val; }
	public void setESTIMATE_TYPE(String val) { m_ESTIMATE_TYPE = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setODR_AMOUNT(String val) { m_ODR_AMOUNT = val; }
	public void setES_COST_MATERIAL(String val) { m_ES_COST_MATERIAL = val; }
	public void setES_COST_PROCESS(String val) { m_ES_COST_PROCESS = val; }
	public void setES_COST_OUTSOUCE(String val) { m_ES_COST_OUTSOUCE = val; }
	public void setES_COST_ETC(String val) { m_ES_COST_ETC = val; }
	public void setES_COST_SERVICE(String val) { m_ES_COST_SERVICE = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setUNIT_CD(String val) { m_UNIT_CD = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_CANCEL_NO(String val) { m_l_JOB_ODR_CANCEL_NO = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setTOTAL_DATE(String val) { m_TOTAL_DATE = val; }
	public void setCOST_PROGRESS(String val) { m_COST_PROGRESS = val; }
	public void setCMP_COST_MATERIAL(String val) { m_CMP_COST_MATERIAL = val; }
	public void setEXP_COST_MATERIAL(String val) { m_EXP_COST_MATERIAL = val; }
	public void setCMP_COST_PROCESS(String val) { m_CMP_COST_PROCESS = val; }
	public void setEXP_COST_PROCESS(String val) { m_EXP_COST_PROCESS = val; }
	public void setCMP_COST_OUTSOUCE(String val) { m_CMP_COST_OUTSOUCE = val; }
	public void setEXP_COST_OUTSOUCE(String val) { m_EXP_COST_OUTSOUCE = val; }
	public void setCMP_COST_SERVICE(String val) { m_CMP_COST_SERVICE = val; }
	public void setEXP_COST_SERVICE(String val) { m_EXP_COST_SERVICE = val; }
	public void setOD_COMP_FLG(String val) { m_OD_COMP_FLG = val; }
	public void setpvc2LogMode(String val) { m_pvc2LogMode = val; }
	public void setpvc2OutputMode(String val) { m_pvc2OutputMode = val; }
	public void setpvc2OutputPath(String val) { m_pvc2OutputPath = val; }
	public void setpvc2OutputName(String val) { m_pvc2OutputName = val; }
	public void setpvc2UserId(String val) { m_pvc2UserId = val; }
	public void setpvc2BusinessName(String val) { m_pvc2BusinessName = val; }
	public void setpvc2PlantCd(String val) { m_pvc2PlantCd = val; }
	public void setpvc2OdrNo(String val) { m_pvc2OdrNo = val; }
	public void setpvc2PProjectCd(String val) { m_pvc2PProjectCd = val; }
	public void setpnumEstimateNo(String val) { m_pnumEstimateNo = val; }
	public void setpnumDetalNo(String val) { m_pnumDetalNo = val; }
	public void setpnumReturn(String val) { m_pnumReturn = val; }
	public void setFILE_PATH(String val) { m_FILE_PATH = val; }
	public void setFILE_NAME(String val) { m_FILE_NAME = val; }
	public void setLOG_MODE_TYP(String val) { m_LOG_MODE_TYP = val; }
	public void setOUTPUT_MODE_TYP(String val) { m_OUTPUT_MODE_TYP = val; }


	public void setList_CALCULATION_DATE(List list) { l_CALCULATION_DATE = list; }
	public void setList_TYP(List list) { l_TYP = list; }
	public void setList_PROGRESS(List list) { l_PROGRESS = list; }
	public void setList_PROFIT_RATIO(List list) { l_PROFIT_RATIO = list; }
	public void setList_ITEM_TOTAL_COST(List list) { l_ITEM_TOTAL_COST = list; }
	public void setList_ODR_AMOUNT_W(List list) { l_ODR_AMOUNT_W = list; }
	public void setList_ITEM_TOTAL_COST_W(List list) { l_ITEM_TOTAL_COST_W = list; }
	public void setList_ITEM_TOTAL_COST_T(List list) { l_ITEM_TOTAL_COST_T = list; }
	public void setList_ITEM_TOTAL_COST_P(List list) { l_ITEM_TOTAL_COST_P = list; }
	public void setList_ITEM_TOTAL_COST_D(List list) { l_ITEM_TOTAL_COST_D = list; }
	public void setList_MATERIAL_COST_W(List list) { l_MATERIAL_COST_W = list; }
	public void setList_MATERIAL_COST_T(List list) { l_MATERIAL_COST_T = list; }
	public void setList_MATERIAL_COST_P(List list) { l_MATERIAL_COST_P = list; }
	public void setList_MATERIAL_COST_D(List list) { l_MATERIAL_COST_D = list; }
	public void setList_PROCESSING_COST_W(List list) { l_PROCESSING_COST_W = list; }
	public void setList_PROCESSING_COST_T(List list) { l_PROCESSING_COST_T = list; }
	public void setList_PROCESSING_COST_P(List list) { l_PROCESSING_COST_P = list; }
	public void setList_PROCESSING_COST_D(List list) { l_PROCESSING_COST_D = list; }
	public void setList_SBCNT_COST_W(List list) { l_SBCNT_COST_W = list; }
	public void setList_SBCNT_COST_T(List list) { l_SBCNT_COST_T = list; }
	public void setList_SBCNT_COST_P(List list) { l_SBCNT_COST_P = list; }
	public void setList_SBCNT_COST_D(List list) { l_SBCNT_COST_D = list; }
	public void setList_OTHER_OVERHEADS_W(List list) { l_OTHER_OVERHEADS_W = list; }
	public void setList_OTHER_OVERHEADS_T(List list) { l_OTHER_OVERHEADS_T = list; }
	public void setList_OTHER_OVERHEADS_P(List list) { l_OTHER_OVERHEADS_P = list; }
	public void setList_OTHER_OVERHEADS_D(List list) { l_OTHER_OVERHEADS_D = list; }
	public void setList_SERVICE_COST_W(List list) { l_SERVICE_COST_W = list; }
	public void setList_SERVICE_COST_T(List list) { l_SERVICE_COST_T = list; }
	public void setList_SERVICE_COST_P(List list) { l_SERVICE_COST_P = list; }
	public void setList_SERVICE_COST_D(List list) { l_SERVICE_COST_D = list; }
	public void setList_PROFIT_RATIO_W(List list) { l_PROFIT_RATIO_W = list; }
	public void setList_PROFIT_RATIO_P(List list) { l_PROFIT_RATIO_P = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_TYP_NUM(List list) { l_TYP_NUM = list; }
	public void setList_h_DETAL_NO(List list) { l_h_DETAL_NO = list; }
	public void setList_h_ES_COST_ETC(List list) { l_h_ES_COST_ETC = list; }
	public void setList_h_COST_PROGRESS(List list) { l_h_COST_PROGRESS = list; }
	public void setList_l_ODR_AMOUNT(List list) { l_l_ODR_AMOUNT = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_ODR_UNIT_PRICE(List list) { l_l_ODR_UNIT_PRICE = list; }
	public void setList_ITEM_TOTAL_COST_D2(List list) { l_ITEM_TOTAL_COST_D2 = list; }
	public void setList_MATERIAL_COST_D2(List list) { l_MATERIAL_COST_D2 = list; }
	public void setList_PROCESSING_COST_D2(List list) { l_PROCESSING_COST_D2 = list; }
	public void setList_SBCNT_COST_D2(List list) { l_SBCNT_COST_D2 = list; }
	public void setList_OTHER_OVERHEADS_D2(List list) { l_OTHER_OVERHEADS_D2 = list; }
	public void setList_SERVICE_COST_D2(List list) { l_SERVICE_COST_D2 = list; }
	public void setList_PROGRESS_NO(List list) { l_PROGRESS_NO = list; }
	public void setList_pnumFlag(List list) { l_pnumFlag = list; }
	public void setList_PROJECT_STAT(List list) { l_PROJECT_STAT = list; }
	public void setList_PROJECT_CD(List list) { l_PROJECT_CD = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_CMP_COST_ETC(List list) { l_CMP_COST_ETC = list; }
	public void setList_ESTIMATE_NO(List list) { l_ESTIMATE_NO = list; }
	public void setList_DETAL_NO(List list) { l_DETAL_NO = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_NAME(List list) { l_NAME = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_PROJECT_NAME(List list) { l_PROJECT_NAME = list; }
	public void setList_PJ_MODIFY_COUNT(List list) { l_PJ_MODIFY_COUNT = list; }
	public void setList_ESTIMATE_TYPE(List list) { l_ESTIMATE_TYPE = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_ODR_AMOUNT(List list) { l_ODR_AMOUNT = list; }
	public void setList_ES_COST_MATERIAL(List list) { l_ES_COST_MATERIAL = list; }
	public void setList_ES_COST_PROCESS(List list) { l_ES_COST_PROCESS = list; }
	public void setList_ES_COST_OUTSOUCE(List list) { l_ES_COST_OUTSOUCE = list; }
	public void setList_ES_COST_ETC(List list) { l_ES_COST_ETC = list; }
	public void setList_ES_COST_SERVICE(List list) { l_ES_COST_SERVICE = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_UNIT_CD(List list) { l_UNIT_CD = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_CANCEL_NO(List list) { l_l_JOB_ODR_CANCEL_NO = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_TOTAL_DATE(List list) { l_TOTAL_DATE = list; }
	public void setList_COST_PROGRESS(List list) { l_COST_PROGRESS = list; }
	public void setList_CMP_COST_MATERIAL(List list) { l_CMP_COST_MATERIAL = list; }
	public void setList_EXP_COST_MATERIAL(List list) { l_EXP_COST_MATERIAL = list; }
	public void setList_CMP_COST_PROCESS(List list) { l_CMP_COST_PROCESS = list; }
	public void setList_EXP_COST_PROCESS(List list) { l_EXP_COST_PROCESS = list; }
	public void setList_CMP_COST_OUTSOUCE(List list) { l_CMP_COST_OUTSOUCE = list; }
	public void setList_EXP_COST_OUTSOUCE(List list) { l_EXP_COST_OUTSOUCE = list; }
	public void setList_CMP_COST_SERVICE(List list) { l_CMP_COST_SERVICE = list; }
	public void setList_EXP_COST_SERVICE(List list) { l_EXP_COST_SERVICE = list; }
	public void setList_OD_COMP_FLG(List list) { l_OD_COMP_FLG = list; }
	public void setList_pvc2LogMode(List list) { l_pvc2LogMode = list; }
	public void setList_pvc2OutputMode(List list) { l_pvc2OutputMode = list; }
	public void setList_pvc2OutputPath(List list) { l_pvc2OutputPath = list; }
	public void setList_pvc2OutputName(List list) { l_pvc2OutputName = list; }
	public void setList_pvc2UserId(List list) { l_pvc2UserId = list; }
	public void setList_pvc2BusinessName(List list) { l_pvc2BusinessName = list; }
	public void setList_pvc2PlantCd(List list) { l_pvc2PlantCd = list; }
	public void setList_pvc2OdrNo(List list) { l_pvc2OdrNo = list; }
	public void setList_pvc2PProjectCd(List list) { l_pvc2PProjectCd = list; }
	public void setList_pnumEstimateNo(List list) { l_pnumEstimateNo = list; }
	public void setList_pnumDetalNo(List list) { l_pnumDetalNo = list; }
	public void setList_pnumReturn(List list) { l_pnumReturn = list; }
	public void setList_FILE_PATH(List list) { l_FILE_PATH = list; }
	public void setList_FILE_NAME(List list) { l_FILE_NAME = list; }
	public void setList_LOG_MODE_TYP(List list) { l_LOG_MODE_TYP = list; }
	public void setList_OUTPUT_MODE_TYP(List list) { l_OUTPUT_MODE_TYP = list; }

	public int setL2L_CALCULATION_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CALCULATION_DATE == null) {
			l_CALCULATION_DATE = new ArrayList();
		} else {
			l_CALCULATION_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CALCULATION_DATE.add(((KM0050010Struct) list.get(i)).getCALCULATION_DATE());
		}
		return size;
	}
	public int setL2L_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TYP == null) {
			l_TYP = new ArrayList();
		} else {
			l_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TYP.add(((KM0050010Struct) list.get(i)).getTYP());
		}
		return size;
	}
	public int setL2L_PROGRESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRESS == null) {
			l_PROGRESS = new ArrayList();
		} else {
			l_PROGRESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRESS.add(((KM0050010Struct) list.get(i)).getPROGRESS());
		}
		return size;
	}
	public int setL2L_PROFIT_RATIO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROFIT_RATIO == null) {
			l_PROFIT_RATIO = new ArrayList();
		} else {
			l_PROFIT_RATIO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROFIT_RATIO.add(((KM0050010Struct) list.get(i)).getPROFIT_RATIO());
		}
		return size;
	}
	public int setL2L_ITEM_TOTAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_TOTAL_COST == null) {
			l_ITEM_TOTAL_COST = new ArrayList();
		} else {
			l_ITEM_TOTAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_TOTAL_COST.add(((KM0050010Struct) list.get(i)).getITEM_TOTAL_COST());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT_W == null) {
			l_ODR_AMOUNT_W = new ArrayList();
		} else {
			l_ODR_AMOUNT_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT_W.add(((KM0050010Struct) list.get(i)).getODR_AMOUNT_W());
		}
		return size;
	}
	public int setL2L_ITEM_TOTAL_COST_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_TOTAL_COST_W == null) {
			l_ITEM_TOTAL_COST_W = new ArrayList();
		} else {
			l_ITEM_TOTAL_COST_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_TOTAL_COST_W.add(((KM0050010Struct) list.get(i)).getITEM_TOTAL_COST_W());
		}
		return size;
	}
	public int setL2L_ITEM_TOTAL_COST_T(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_TOTAL_COST_T == null) {
			l_ITEM_TOTAL_COST_T = new ArrayList();
		} else {
			l_ITEM_TOTAL_COST_T.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_TOTAL_COST_T.add(((KM0050010Struct) list.get(i)).getITEM_TOTAL_COST_T());
		}
		return size;
	}
	public int setL2L_ITEM_TOTAL_COST_P(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_TOTAL_COST_P == null) {
			l_ITEM_TOTAL_COST_P = new ArrayList();
		} else {
			l_ITEM_TOTAL_COST_P.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_TOTAL_COST_P.add(((KM0050010Struct) list.get(i)).getITEM_TOTAL_COST_P());
		}
		return size;
	}
	public int setL2L_ITEM_TOTAL_COST_D(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_TOTAL_COST_D == null) {
			l_ITEM_TOTAL_COST_D = new ArrayList();
		} else {
			l_ITEM_TOTAL_COST_D.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_TOTAL_COST_D.add(((KM0050010Struct) list.get(i)).getITEM_TOTAL_COST_D());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST_W == null) {
			l_MATERIAL_COST_W = new ArrayList();
		} else {
			l_MATERIAL_COST_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST_W.add(((KM0050010Struct) list.get(i)).getMATERIAL_COST_W());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST_T(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST_T == null) {
			l_MATERIAL_COST_T = new ArrayList();
		} else {
			l_MATERIAL_COST_T.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST_T.add(((KM0050010Struct) list.get(i)).getMATERIAL_COST_T());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST_P(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST_P == null) {
			l_MATERIAL_COST_P = new ArrayList();
		} else {
			l_MATERIAL_COST_P.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST_P.add(((KM0050010Struct) list.get(i)).getMATERIAL_COST_P());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST_D(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST_D == null) {
			l_MATERIAL_COST_D = new ArrayList();
		} else {
			l_MATERIAL_COST_D.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST_D.add(((KM0050010Struct) list.get(i)).getMATERIAL_COST_D());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST_W == null) {
			l_PROCESSING_COST_W = new ArrayList();
		} else {
			l_PROCESSING_COST_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST_W.add(((KM0050010Struct) list.get(i)).getPROCESSING_COST_W());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST_T(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST_T == null) {
			l_PROCESSING_COST_T = new ArrayList();
		} else {
			l_PROCESSING_COST_T.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST_T.add(((KM0050010Struct) list.get(i)).getPROCESSING_COST_T());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST_P(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST_P == null) {
			l_PROCESSING_COST_P = new ArrayList();
		} else {
			l_PROCESSING_COST_P.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST_P.add(((KM0050010Struct) list.get(i)).getPROCESSING_COST_P());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST_D(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST_D == null) {
			l_PROCESSING_COST_D = new ArrayList();
		} else {
			l_PROCESSING_COST_D.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST_D.add(((KM0050010Struct) list.get(i)).getPROCESSING_COST_D());
		}
		return size;
	}
	public int setL2L_SBCNT_COST_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_COST_W == null) {
			l_SBCNT_COST_W = new ArrayList();
		} else {
			l_SBCNT_COST_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_COST_W.add(((KM0050010Struct) list.get(i)).getSBCNT_COST_W());
		}
		return size;
	}
	public int setL2L_SBCNT_COST_T(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_COST_T == null) {
			l_SBCNT_COST_T = new ArrayList();
		} else {
			l_SBCNT_COST_T.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_COST_T.add(((KM0050010Struct) list.get(i)).getSBCNT_COST_T());
		}
		return size;
	}
	public int setL2L_SBCNT_COST_P(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_COST_P == null) {
			l_SBCNT_COST_P = new ArrayList();
		} else {
			l_SBCNT_COST_P.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_COST_P.add(((KM0050010Struct) list.get(i)).getSBCNT_COST_P());
		}
		return size;
	}
	public int setL2L_SBCNT_COST_D(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_COST_D == null) {
			l_SBCNT_COST_D = new ArrayList();
		} else {
			l_SBCNT_COST_D.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_COST_D.add(((KM0050010Struct) list.get(i)).getSBCNT_COST_D());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS_W == null) {
			l_OTHER_OVERHEADS_W = new ArrayList();
		} else {
			l_OTHER_OVERHEADS_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS_W.add(((KM0050010Struct) list.get(i)).getOTHER_OVERHEADS_W());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS_T(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS_T == null) {
			l_OTHER_OVERHEADS_T = new ArrayList();
		} else {
			l_OTHER_OVERHEADS_T.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS_T.add(((KM0050010Struct) list.get(i)).getOTHER_OVERHEADS_T());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS_P(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS_P == null) {
			l_OTHER_OVERHEADS_P = new ArrayList();
		} else {
			l_OTHER_OVERHEADS_P.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS_P.add(((KM0050010Struct) list.get(i)).getOTHER_OVERHEADS_P());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS_D(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS_D == null) {
			l_OTHER_OVERHEADS_D = new ArrayList();
		} else {
			l_OTHER_OVERHEADS_D.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS_D.add(((KM0050010Struct) list.get(i)).getOTHER_OVERHEADS_D());
		}
		return size;
	}
	public int setL2L_SERVICE_COST_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SERVICE_COST_W == null) {
			l_SERVICE_COST_W = new ArrayList();
		} else {
			l_SERVICE_COST_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SERVICE_COST_W.add(((KM0050010Struct) list.get(i)).getSERVICE_COST_W());
		}
		return size;
	}
	public int setL2L_SERVICE_COST_T(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SERVICE_COST_T == null) {
			l_SERVICE_COST_T = new ArrayList();
		} else {
			l_SERVICE_COST_T.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SERVICE_COST_T.add(((KM0050010Struct) list.get(i)).getSERVICE_COST_T());
		}
		return size;
	}
	public int setL2L_SERVICE_COST_P(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SERVICE_COST_P == null) {
			l_SERVICE_COST_P = new ArrayList();
		} else {
			l_SERVICE_COST_P.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SERVICE_COST_P.add(((KM0050010Struct) list.get(i)).getSERVICE_COST_P());
		}
		return size;
	}
	public int setL2L_SERVICE_COST_D(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SERVICE_COST_D == null) {
			l_SERVICE_COST_D = new ArrayList();
		} else {
			l_SERVICE_COST_D.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SERVICE_COST_D.add(((KM0050010Struct) list.get(i)).getSERVICE_COST_D());
		}
		return size;
	}
	public int setL2L_PROFIT_RATIO_W(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROFIT_RATIO_W == null) {
			l_PROFIT_RATIO_W = new ArrayList();
		} else {
			l_PROFIT_RATIO_W.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROFIT_RATIO_W.add(((KM0050010Struct) list.get(i)).getPROFIT_RATIO_W());
		}
		return size;
	}
	public int setL2L_PROFIT_RATIO_P(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROFIT_RATIO_P == null) {
			l_PROFIT_RATIO_P = new ArrayList();
		} else {
			l_PROFIT_RATIO_P.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROFIT_RATIO_P.add(((KM0050010Struct) list.get(i)).getPROFIT_RATIO_P());
		}
		return size;
	}
	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((KM0050010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_TYP_NUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TYP_NUM == null) {
			l_TYP_NUM = new ArrayList();
		} else {
			l_TYP_NUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TYP_NUM.add(((KM0050010Struct) list.get(i)).getTYP_NUM());
		}
		return size;
	}
	public int setL2L_h_DETAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DETAL_NO == null) {
			l_h_DETAL_NO = new ArrayList();
		} else {
			l_h_DETAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DETAL_NO.add(((KM0050010Struct) list.get(i)).geth_DETAL_NO());
		}
		return size;
	}
	public int setL2L_h_ES_COST_ETC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ES_COST_ETC == null) {
			l_h_ES_COST_ETC = new ArrayList();
		} else {
			l_h_ES_COST_ETC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ES_COST_ETC.add(((KM0050010Struct) list.get(i)).geth_ES_COST_ETC());
		}
		return size;
	}
	public int setL2L_h_COST_PROGRESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COST_PROGRESS == null) {
			l_h_COST_PROGRESS = new ArrayList();
		} else {
			l_h_COST_PROGRESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COST_PROGRESS.add(((KM0050010Struct) list.get(i)).geth_COST_PROGRESS());
		}
		return size;
	}
	public int setL2L_l_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_AMOUNT == null) {
			l_l_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_AMOUNT.add(((KM0050010Struct) list.get(i)).getl_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_QTY == null) {
			l_l_ODR_QTY = new ArrayList();
		} else {
			l_l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_QTY.add(((KM0050010Struct) list.get(i)).getl_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_UNIT_PRICE == null) {
			l_l_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_l_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_UNIT_PRICE.add(((KM0050010Struct) list.get(i)).getl_ODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_ITEM_TOTAL_COST_D2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_TOTAL_COST_D2 == null) {
			l_ITEM_TOTAL_COST_D2 = new ArrayList();
		} else {
			l_ITEM_TOTAL_COST_D2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_TOTAL_COST_D2.add(((KM0050010Struct) list.get(i)).getITEM_TOTAL_COST_D2());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST_D2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST_D2 == null) {
			l_MATERIAL_COST_D2 = new ArrayList();
		} else {
			l_MATERIAL_COST_D2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST_D2.add(((KM0050010Struct) list.get(i)).getMATERIAL_COST_D2());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST_D2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST_D2 == null) {
			l_PROCESSING_COST_D2 = new ArrayList();
		} else {
			l_PROCESSING_COST_D2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST_D2.add(((KM0050010Struct) list.get(i)).getPROCESSING_COST_D2());
		}
		return size;
	}
	public int setL2L_SBCNT_COST_D2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_COST_D2 == null) {
			l_SBCNT_COST_D2 = new ArrayList();
		} else {
			l_SBCNT_COST_D2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_COST_D2.add(((KM0050010Struct) list.get(i)).getSBCNT_COST_D2());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS_D2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS_D2 == null) {
			l_OTHER_OVERHEADS_D2 = new ArrayList();
		} else {
			l_OTHER_OVERHEADS_D2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS_D2.add(((KM0050010Struct) list.get(i)).getOTHER_OVERHEADS_D2());
		}
		return size;
	}
	public int setL2L_SERVICE_COST_D2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SERVICE_COST_D2 == null) {
			l_SERVICE_COST_D2 = new ArrayList();
		} else {
			l_SERVICE_COST_D2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SERVICE_COST_D2.add(((KM0050010Struct) list.get(i)).getSERVICE_COST_D2());
		}
		return size;
	}
	public int setL2L_PROGRESS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRESS_NO == null) {
			l_PROGRESS_NO = new ArrayList();
		} else {
			l_PROGRESS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRESS_NO.add(((KM0050010Struct) list.get(i)).getPROGRESS_NO());
		}
		return size;
	}
	public int setL2L_pnumFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pnumFlag == null) {
			l_pnumFlag = new ArrayList();
		} else {
			l_pnumFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pnumFlag.add(((KM0050010Struct) list.get(i)).getpnumFlag());
		}
		return size;
	}
	public int setL2L_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_STAT == null) {
			l_PROJECT_STAT = new ArrayList();
		} else {
			l_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_STAT.add(((KM0050010Struct) list.get(i)).getPROJECT_STAT());
		}
		return size;
	}
	public int setL2L_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_CD == null) {
			l_PROJECT_CD = new ArrayList();
		} else {
			l_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_CD.add(((KM0050010Struct) list.get(i)).getPROJECT_CD());
		}
		return size;
	}
	public int setL2L_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_NO == null) {
			l_ODR_NO = new ArrayList();
		} else {
			l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_NO.add(((KM0050010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_CMP_COST_ETC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CMP_COST_ETC == null) {
			l_CMP_COST_ETC = new ArrayList();
		} else {
			l_CMP_COST_ETC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CMP_COST_ETC.add(((KM0050010Struct) list.get(i)).getCMP_COST_ETC());
		}
		return size;
	}
	public int setL2L_ESTIMATE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_NO == null) {
			l_ESTIMATE_NO = new ArrayList();
		} else {
			l_ESTIMATE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_NO.add(((KM0050010Struct) list.get(i)).getESTIMATE_NO());
		}
		return size;
	}
	public int setL2L_DETAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAL_NO == null) {
			l_DETAL_NO = new ArrayList();
		} else {
			l_DETAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAL_NO.add(((KM0050010Struct) list.get(i)).getDETAL_NO());
		}
		return size;
	}
	public int setL2L_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_NAME == null) {
			l_DISPLAY_NAME = new ArrayList();
		} else {
			l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_NAME.add(((KM0050010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NAME == null) {
			l_NAME = new ArrayList();
		} else {
			l_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NAME.add(((KM0050010Struct) list.get(i)).getNAME());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((KM0050010Struct) list.get(i)).getVALUE());
		}
		return size;
	}
	public int setL2L_PROJECT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_NAME == null) {
			l_PROJECT_NAME = new ArrayList();
		} else {
			l_PROJECT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_NAME.add(((KM0050010Struct) list.get(i)).getPROJECT_NAME());
		}
		return size;
	}
	public int setL2L_PJ_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_MODIFY_COUNT == null) {
			l_PJ_MODIFY_COUNT = new ArrayList();
		} else {
			l_PJ_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_MODIFY_COUNT.add(((KM0050010Struct) list.get(i)).getPJ_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_TYPE == null) {
			l_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_TYPE.add(((KM0050010Struct) list.get(i)).getESTIMATE_TYPE());
		}
		return size;
	}
	public int setL2L_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ITEM_CD == null) {
			l_CUST_ITEM_CD = new ArrayList();
		} else {
			l_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ITEM_CD.add(((KM0050010Struct) list.get(i)).getCUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME == null) {
			l_ITEM_NAME = new ArrayList();
		} else {
			l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME.add(((KM0050010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT == null) {
			l_ODR_AMOUNT = new ArrayList();
		} else {
			l_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT.add(((KM0050010Struct) list.get(i)).getODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_ES_COST_MATERIAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COST_MATERIAL == null) {
			l_ES_COST_MATERIAL = new ArrayList();
		} else {
			l_ES_COST_MATERIAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COST_MATERIAL.add(((KM0050010Struct) list.get(i)).getES_COST_MATERIAL());
		}
		return size;
	}
	public int setL2L_ES_COST_PROCESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COST_PROCESS == null) {
			l_ES_COST_PROCESS = new ArrayList();
		} else {
			l_ES_COST_PROCESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COST_PROCESS.add(((KM0050010Struct) list.get(i)).getES_COST_PROCESS());
		}
		return size;
	}
	public int setL2L_ES_COST_OUTSOUCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COST_OUTSOUCE == null) {
			l_ES_COST_OUTSOUCE = new ArrayList();
		} else {
			l_ES_COST_OUTSOUCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COST_OUTSOUCE.add(((KM0050010Struct) list.get(i)).getES_COST_OUTSOUCE());
		}
		return size;
	}
	public int setL2L_ES_COST_ETC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COST_ETC == null) {
			l_ES_COST_ETC = new ArrayList();
		} else {
			l_ES_COST_ETC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COST_ETC.add(((KM0050010Struct) list.get(i)).getES_COST_ETC());
		}
		return size;
	}
	public int setL2L_ES_COST_SERVICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COST_SERVICE == null) {
			l_ES_COST_SERVICE = new ArrayList();
		} else {
			l_ES_COST_SERVICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COST_SERVICE.add(((KM0050010Struct) list.get(i)).getES_COST_SERVICE());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT == null) {
			l_MODIFY_COUNT = new ArrayList();
		} else {
			l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT.add(((KM0050010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_QTY == null) {
			l_ODR_QTY = new ArrayList();
		} else {
			l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_QTY.add(((KM0050010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_CD == null) {
			l_UNIT_CD = new ArrayList();
		} else {
			l_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_CD.add(((KM0050010Struct) list.get(i)).getUNIT_CD());
		}
		return size;
	}
	public int setL2L_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_UNIT_PRICE == null) {
			l_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_UNIT_PRICE.add(((KM0050010Struct) list.get(i)).getODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_DLV_DATE == null) {
			l_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_DLV_DATE.add(((KM0050010Struct) list.get(i)).getDESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CD == null) {
			l_l_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CD.add(((KM0050010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CANCEL_NO == null) {
			l_l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CANCEL_NO.add(((KM0050010Struct) list.get(i)).getl_JOB_ODR_CANCEL_NO());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((KM0050010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_TOTAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_DATE == null) {
			l_TOTAL_DATE = new ArrayList();
		} else {
			l_TOTAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_DATE.add(((KM0050010Struct) list.get(i)).getTOTAL_DATE());
		}
		return size;
	}
	public int setL2L_COST_PROGRESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_PROGRESS == null) {
			l_COST_PROGRESS = new ArrayList();
		} else {
			l_COST_PROGRESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_PROGRESS.add(((KM0050010Struct) list.get(i)).getCOST_PROGRESS());
		}
		return size;
	}
	public int setL2L_CMP_COST_MATERIAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CMP_COST_MATERIAL == null) {
			l_CMP_COST_MATERIAL = new ArrayList();
		} else {
			l_CMP_COST_MATERIAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CMP_COST_MATERIAL.add(((KM0050010Struct) list.get(i)).getCMP_COST_MATERIAL());
		}
		return size;
	}
	public int setL2L_EXP_COST_MATERIAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXP_COST_MATERIAL == null) {
			l_EXP_COST_MATERIAL = new ArrayList();
		} else {
			l_EXP_COST_MATERIAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXP_COST_MATERIAL.add(((KM0050010Struct) list.get(i)).getEXP_COST_MATERIAL());
		}
		return size;
	}
	public int setL2L_CMP_COST_PROCESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CMP_COST_PROCESS == null) {
			l_CMP_COST_PROCESS = new ArrayList();
		} else {
			l_CMP_COST_PROCESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CMP_COST_PROCESS.add(((KM0050010Struct) list.get(i)).getCMP_COST_PROCESS());
		}
		return size;
	}
	public int setL2L_EXP_COST_PROCESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXP_COST_PROCESS == null) {
			l_EXP_COST_PROCESS = new ArrayList();
		} else {
			l_EXP_COST_PROCESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXP_COST_PROCESS.add(((KM0050010Struct) list.get(i)).getEXP_COST_PROCESS());
		}
		return size;
	}
	public int setL2L_CMP_COST_OUTSOUCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CMP_COST_OUTSOUCE == null) {
			l_CMP_COST_OUTSOUCE = new ArrayList();
		} else {
			l_CMP_COST_OUTSOUCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CMP_COST_OUTSOUCE.add(((KM0050010Struct) list.get(i)).getCMP_COST_OUTSOUCE());
		}
		return size;
	}
	public int setL2L_EXP_COST_OUTSOUCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXP_COST_OUTSOUCE == null) {
			l_EXP_COST_OUTSOUCE = new ArrayList();
		} else {
			l_EXP_COST_OUTSOUCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXP_COST_OUTSOUCE.add(((KM0050010Struct) list.get(i)).getEXP_COST_OUTSOUCE());
		}
		return size;
	}
	public int setL2L_CMP_COST_SERVICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CMP_COST_SERVICE == null) {
			l_CMP_COST_SERVICE = new ArrayList();
		} else {
			l_CMP_COST_SERVICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CMP_COST_SERVICE.add(((KM0050010Struct) list.get(i)).getCMP_COST_SERVICE());
		}
		return size;
	}
	public int setL2L_EXP_COST_SERVICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXP_COST_SERVICE == null) {
			l_EXP_COST_SERVICE = new ArrayList();
		} else {
			l_EXP_COST_SERVICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXP_COST_SERVICE.add(((KM0050010Struct) list.get(i)).getEXP_COST_SERVICE());
		}
		return size;
	}
	public int setL2L_OD_COMP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_COMP_FLG == null) {
			l_OD_COMP_FLG = new ArrayList();
		} else {
			l_OD_COMP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_COMP_FLG.add(((KM0050010Struct) list.get(i)).getOD_COMP_FLG());
		}
		return size;
	}
	public int setL2L_pvc2LogMode(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2LogMode == null) {
			l_pvc2LogMode = new ArrayList();
		} else {
			l_pvc2LogMode.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2LogMode.add(((KM0050010Struct) list.get(i)).getpvc2LogMode());
		}
		return size;
	}
	public int setL2L_pvc2OutputMode(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2OutputMode == null) {
			l_pvc2OutputMode = new ArrayList();
		} else {
			l_pvc2OutputMode.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2OutputMode.add(((KM0050010Struct) list.get(i)).getpvc2OutputMode());
		}
		return size;
	}
	public int setL2L_pvc2OutputPath(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2OutputPath == null) {
			l_pvc2OutputPath = new ArrayList();
		} else {
			l_pvc2OutputPath.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2OutputPath.add(((KM0050010Struct) list.get(i)).getpvc2OutputPath());
		}
		return size;
	}
	public int setL2L_pvc2OutputName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2OutputName == null) {
			l_pvc2OutputName = new ArrayList();
		} else {
			l_pvc2OutputName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2OutputName.add(((KM0050010Struct) list.get(i)).getpvc2OutputName());
		}
		return size;
	}
	public int setL2L_pvc2UserId(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2UserId == null) {
			l_pvc2UserId = new ArrayList();
		} else {
			l_pvc2UserId.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2UserId.add(((KM0050010Struct) list.get(i)).getpvc2UserId());
		}
		return size;
	}
	public int setL2L_pvc2BusinessName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2BusinessName == null) {
			l_pvc2BusinessName = new ArrayList();
		} else {
			l_pvc2BusinessName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2BusinessName.add(((KM0050010Struct) list.get(i)).getpvc2BusinessName());
		}
		return size;
	}
	public int setL2L_pvc2PlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2PlantCd == null) {
			l_pvc2PlantCd = new ArrayList();
		} else {
			l_pvc2PlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2PlantCd.add(((KM0050010Struct) list.get(i)).getpvc2PlantCd());
		}
		return size;
	}
	public int setL2L_pvc2OdrNo(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2OdrNo == null) {
			l_pvc2OdrNo = new ArrayList();
		} else {
			l_pvc2OdrNo.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2OdrNo.add(((KM0050010Struct) list.get(i)).getpvc2OdrNo());
		}
		return size;
	}
	public int setL2L_pvc2PProjectCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pvc2PProjectCd == null) {
			l_pvc2PProjectCd = new ArrayList();
		} else {
			l_pvc2PProjectCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pvc2PProjectCd.add(((KM0050010Struct) list.get(i)).getpvc2PProjectCd());
		}
		return size;
	}
	public int setL2L_pnumEstimateNo(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pnumEstimateNo == null) {
			l_pnumEstimateNo = new ArrayList();
		} else {
			l_pnumEstimateNo.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pnumEstimateNo.add(((KM0050010Struct) list.get(i)).getpnumEstimateNo());
		}
		return size;
	}
	public int setL2L_pnumDetalNo(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pnumDetalNo == null) {
			l_pnumDetalNo = new ArrayList();
		} else {
			l_pnumDetalNo.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pnumDetalNo.add(((KM0050010Struct) list.get(i)).getpnumDetalNo());
		}
		return size;
	}
	public int setL2L_pnumReturn(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pnumReturn == null) {
			l_pnumReturn = new ArrayList();
		} else {
			l_pnumReturn.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pnumReturn.add(((KM0050010Struct) list.get(i)).getpnumReturn());
		}
		return size;
	}
	public int setL2L_FILE_PATH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FILE_PATH == null) {
			l_FILE_PATH = new ArrayList();
		} else {
			l_FILE_PATH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FILE_PATH.add(((KM0050010Struct) list.get(i)).getFILE_PATH());
		}
		return size;
	}
	public int setL2L_FILE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FILE_NAME == null) {
			l_FILE_NAME = new ArrayList();
		} else {
			l_FILE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FILE_NAME.add(((KM0050010Struct) list.get(i)).getFILE_NAME());
		}
		return size;
	}
	public int setL2L_LOG_MODE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOG_MODE_TYP == null) {
			l_LOG_MODE_TYP = new ArrayList();
		} else {
			l_LOG_MODE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOG_MODE_TYP.add(((KM0050010Struct) list.get(i)).getLOG_MODE_TYP());
		}
		return size;
	}
	public int setL2L_OUTPUT_MODE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTPUT_MODE_TYP == null) {
			l_OUTPUT_MODE_TYP = new ArrayList();
		} else {
			l_OUTPUT_MODE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTPUT_MODE_TYP.add(((KM0050010Struct) list.get(i)).getOUTPUT_MODE_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CALCULATION_DATE = null;
		m_TYP = null;
		m_PROGRESS = null;
		m_PROFIT_RATIO = null;
		m_ITEM_TOTAL_COST = null;
		m_ODR_AMOUNT_W = null;
		m_ITEM_TOTAL_COST_W = null;
		m_ITEM_TOTAL_COST_T = null;
		m_ITEM_TOTAL_COST_P = null;
		m_ITEM_TOTAL_COST_D = null;
		m_MATERIAL_COST_W = null;
		m_MATERIAL_COST_T = null;
		m_MATERIAL_COST_P = null;
		m_MATERIAL_COST_D = null;
		m_PROCESSING_COST_W = null;
		m_PROCESSING_COST_T = null;
		m_PROCESSING_COST_P = null;
		m_PROCESSING_COST_D = null;
		m_SBCNT_COST_W = null;
		m_SBCNT_COST_T = null;
		m_SBCNT_COST_P = null;
		m_SBCNT_COST_D = null;
		m_OTHER_OVERHEADS_W = null;
		m_OTHER_OVERHEADS_T = null;
		m_OTHER_OVERHEADS_P = null;
		m_OTHER_OVERHEADS_D = null;
		m_SERVICE_COST_W = null;
		m_SERVICE_COST_T = null;
		m_SERVICE_COST_P = null;
		m_SERVICE_COST_D = null;
		m_PROFIT_RATIO_W = null;
		m_PROFIT_RATIO_P = null;
		m_DOWNLOAD_FILE = null;
		m_TYP_NUM = null;
		m_h_DETAL_NO = null;
		m_h_ES_COST_ETC = null;
		m_h_COST_PROGRESS = null;
		m_l_ODR_AMOUNT = null;
		m_l_ODR_QTY = null;
		m_l_ODR_UNIT_PRICE = null;
		m_ITEM_TOTAL_COST_D2 = null;
		m_MATERIAL_COST_D2 = null;
		m_PROCESSING_COST_D2 = null;
		m_SBCNT_COST_D2 = null;
		m_OTHER_OVERHEADS_D2 = null;
		m_SERVICE_COST_D2 = null;
		m_PROGRESS_NO = null;
		m_pnumFlag = null;
		m_PROJECT_STAT = null;
		m_PROJECT_CD = null;
		m_ODR_NO = null;
		m_CMP_COST_ETC = null;
		m_ESTIMATE_NO = null;
		m_DETAL_NO = null;
		m_DISPLAY_NAME = null;
		m_NAME = null;
		m_VALUE = null;
		m_PROJECT_NAME = null;
		m_PJ_MODIFY_COUNT = null;
		m_ESTIMATE_TYPE = null;
		m_CUST_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_ODR_AMOUNT = null;
		m_ES_COST_MATERIAL = null;
		m_ES_COST_PROCESS = null;
		m_ES_COST_OUTSOUCE = null;
		m_ES_COST_ETC = null;
		m_ES_COST_SERVICE = null;
		m_MODIFY_COUNT = null;
		m_ODR_QTY = null;
		m_UNIT_CD = null;
		m_ODR_UNIT_PRICE = null;
		m_DESINATED_DLV_DATE = null;
		m_l_JOB_ODR_CD = null;
		m_l_JOB_ODR_CANCEL_NO = null;
		m_l_PLANT_CD = null;
		m_TOTAL_DATE = null;
		m_COST_PROGRESS = null;
		m_CMP_COST_MATERIAL = null;
		m_EXP_COST_MATERIAL = null;
		m_CMP_COST_PROCESS = null;
		m_EXP_COST_PROCESS = null;
		m_CMP_COST_OUTSOUCE = null;
		m_EXP_COST_OUTSOUCE = null;
		m_CMP_COST_SERVICE = null;
		m_EXP_COST_SERVICE = null;
		m_OD_COMP_FLG = null;
		m_pvc2LogMode = null;
		m_pvc2OutputMode = null;
		m_pvc2OutputPath = null;
		m_pvc2OutputName = null;
		m_pvc2UserId = null;
		m_pvc2BusinessName = null;
		m_pvc2PlantCd = null;
		m_pvc2OdrNo = null;
		m_pvc2PProjectCd = null;
		m_pnumEstimateNo = null;
		m_pnumDetalNo = null;
		m_pnumReturn = null;
		m_FILE_PATH = null;
		m_FILE_NAME = null;
		m_LOG_MODE_TYP = null;
		m_OUTPUT_MODE_TYP = null;

		l_CALCULATION_DATE = null;
		l_TYP = null;
		l_PROGRESS = null;
		l_PROFIT_RATIO = null;
		l_ITEM_TOTAL_COST = null;
		l_ODR_AMOUNT_W = null;
		l_ITEM_TOTAL_COST_W = null;
		l_ITEM_TOTAL_COST_T = null;
		l_ITEM_TOTAL_COST_P = null;
		l_ITEM_TOTAL_COST_D = null;
		l_MATERIAL_COST_W = null;
		l_MATERIAL_COST_T = null;
		l_MATERIAL_COST_P = null;
		l_MATERIAL_COST_D = null;
		l_PROCESSING_COST_W = null;
		l_PROCESSING_COST_T = null;
		l_PROCESSING_COST_P = null;
		l_PROCESSING_COST_D = null;
		l_SBCNT_COST_W = null;
		l_SBCNT_COST_T = null;
		l_SBCNT_COST_P = null;
		l_SBCNT_COST_D = null;
		l_OTHER_OVERHEADS_W = null;
		l_OTHER_OVERHEADS_T = null;
		l_OTHER_OVERHEADS_P = null;
		l_OTHER_OVERHEADS_D = null;
		l_SERVICE_COST_W = null;
		l_SERVICE_COST_T = null;
		l_SERVICE_COST_P = null;
		l_SERVICE_COST_D = null;
		l_PROFIT_RATIO_W = null;
		l_PROFIT_RATIO_P = null;
		l_DOWNLOAD_FILE = null;
		l_TYP_NUM = null;
		l_h_DETAL_NO = null;
		l_h_ES_COST_ETC = null;
		l_h_COST_PROGRESS = null;
		l_l_ODR_AMOUNT = null;
		l_l_ODR_QTY = null;
		l_l_ODR_UNIT_PRICE = null;
		l_ITEM_TOTAL_COST_D2 = null;
		l_MATERIAL_COST_D2 = null;
		l_PROCESSING_COST_D2 = null;
		l_SBCNT_COST_D2 = null;
		l_OTHER_OVERHEADS_D2 = null;
		l_SERVICE_COST_D2 = null;
		l_PROGRESS_NO = null;
		l_pnumFlag = null;
		l_PROJECT_STAT = null;
		l_PROJECT_CD = null;
		l_ODR_NO = null;
		l_CMP_COST_ETC = null;
		l_ESTIMATE_NO = null;
		l_DETAL_NO = null;
		l_DISPLAY_NAME = null;
		l_NAME = null;
		l_VALUE = null;
		l_PROJECT_NAME = null;
		l_PJ_MODIFY_COUNT = null;
		l_ESTIMATE_TYPE = null;
		l_CUST_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_ODR_AMOUNT = null;
		l_ES_COST_MATERIAL = null;
		l_ES_COST_PROCESS = null;
		l_ES_COST_OUTSOUCE = null;
		l_ES_COST_ETC = null;
		l_ES_COST_SERVICE = null;
		l_MODIFY_COUNT = null;
		l_ODR_QTY = null;
		l_UNIT_CD = null;
		l_ODR_UNIT_PRICE = null;
		l_DESINATED_DLV_DATE = null;
		l_l_JOB_ODR_CD = null;
		l_l_JOB_ODR_CANCEL_NO = null;
		l_l_PLANT_CD = null;
		l_TOTAL_DATE = null;
		l_COST_PROGRESS = null;
		l_CMP_COST_MATERIAL = null;
		l_EXP_COST_MATERIAL = null;
		l_CMP_COST_PROCESS = null;
		l_EXP_COST_PROCESS = null;
		l_CMP_COST_OUTSOUCE = null;
		l_EXP_COST_OUTSOUCE = null;
		l_CMP_COST_SERVICE = null;
		l_EXP_COST_SERVICE = null;
		l_OD_COMP_FLG = null;
		l_pvc2LogMode = null;
		l_pvc2OutputMode = null;
		l_pvc2OutputPath = null;
		l_pvc2OutputName = null;
		l_pvc2UserId = null;
		l_pvc2BusinessName = null;
		l_pvc2PlantCd = null;
		l_pvc2OdrNo = null;
		l_pvc2PProjectCd = null;
		l_pnumEstimateNo = null;
		l_pnumDetalNo = null;
		l_pnumReturn = null;
		l_FILE_PATH = null;
		l_FILE_NAME = null;
		l_LOG_MODE_TYP = null;
		l_OUTPUT_MODE_TYP = null;

		return;
	}

	//////////////////////////////
	// Orteus�W��Struct
	// ���[�U�R�[�h
	public String sUser_ID = null;
	// set/get���\�b�h
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// �g�D�R�[�h
	public String sOrganization_CD = null;
	// set/get���\�b�h
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// �������t
	public String sSysdate = null;
	// set/get���\�b�h
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medKM0050010�N���X�̕W���R���X�g���N�^
	 */
	public KM0050010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
			// TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * �f�[�^�̃Z�b�g(�ʃ����o�E���X�g�����o����)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStruct(KM0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(�ʃ����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructM(KM0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCALCULATION_DATE(struct.getCALCULATION_DATE());
			this.setTYP(struct.getTYP());
			this.setPROGRESS(struct.getPROGRESS());
			this.setPROFIT_RATIO(struct.getPROFIT_RATIO());
			this.setITEM_TOTAL_COST(struct.getITEM_TOTAL_COST());
			this.setODR_AMOUNT_W(struct.getODR_AMOUNT_W());
			this.setITEM_TOTAL_COST_W(struct.getITEM_TOTAL_COST_W());
			this.setITEM_TOTAL_COST_T(struct.getITEM_TOTAL_COST_T());
			this.setITEM_TOTAL_COST_P(struct.getITEM_TOTAL_COST_P());
			this.setITEM_TOTAL_COST_D(struct.getITEM_TOTAL_COST_D());
			this.setMATERIAL_COST_W(struct.getMATERIAL_COST_W());
			this.setMATERIAL_COST_T(struct.getMATERIAL_COST_T());
			this.setMATERIAL_COST_P(struct.getMATERIAL_COST_P());
			this.setMATERIAL_COST_D(struct.getMATERIAL_COST_D());
			this.setPROCESSING_COST_W(struct.getPROCESSING_COST_W());
			this.setPROCESSING_COST_T(struct.getPROCESSING_COST_T());
			this.setPROCESSING_COST_P(struct.getPROCESSING_COST_P());
			this.setPROCESSING_COST_D(struct.getPROCESSING_COST_D());
			this.setSBCNT_COST_W(struct.getSBCNT_COST_W());
			this.setSBCNT_COST_T(struct.getSBCNT_COST_T());
			this.setSBCNT_COST_P(struct.getSBCNT_COST_P());
			this.setSBCNT_COST_D(struct.getSBCNT_COST_D());
			this.setOTHER_OVERHEADS_W(struct.getOTHER_OVERHEADS_W());
			this.setOTHER_OVERHEADS_T(struct.getOTHER_OVERHEADS_T());
			this.setOTHER_OVERHEADS_P(struct.getOTHER_OVERHEADS_P());
			this.setOTHER_OVERHEADS_D(struct.getOTHER_OVERHEADS_D());
			this.setSERVICE_COST_W(struct.getSERVICE_COST_W());
			this.setSERVICE_COST_T(struct.getSERVICE_COST_T());
			this.setSERVICE_COST_P(struct.getSERVICE_COST_P());
			this.setSERVICE_COST_D(struct.getSERVICE_COST_D());
			this.setPROFIT_RATIO_W(struct.getPROFIT_RATIO_W());
			this.setPROFIT_RATIO_P(struct.getPROFIT_RATIO_P());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setTYP_NUM(struct.getTYP_NUM());
			this.seth_DETAL_NO(struct.geth_DETAL_NO());
			this.seth_ES_COST_ETC(struct.geth_ES_COST_ETC());
			this.seth_COST_PROGRESS(struct.geth_COST_PROGRESS());
			this.setl_ODR_AMOUNT(struct.getl_ODR_AMOUNT());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_ODR_UNIT_PRICE(struct.getl_ODR_UNIT_PRICE());
			this.setITEM_TOTAL_COST_D2(struct.getITEM_TOTAL_COST_D2());
			this.setMATERIAL_COST_D2(struct.getMATERIAL_COST_D2());
			this.setPROCESSING_COST_D2(struct.getPROCESSING_COST_D2());
			this.setSBCNT_COST_D2(struct.getSBCNT_COST_D2());
			this.setOTHER_OVERHEADS_D2(struct.getOTHER_OVERHEADS_D2());
			this.setSERVICE_COST_D2(struct.getSERVICE_COST_D2());
			this.setPROGRESS_NO(struct.getPROGRESS_NO());
			this.setpnumFlag(struct.getpnumFlag());
			this.setPROJECT_STAT(struct.getPROJECT_STAT());
			this.setPROJECT_CD(struct.getPROJECT_CD());
			this.setODR_NO(struct.getODR_NO());
			this.setCMP_COST_ETC(struct.getCMP_COST_ETC());
			this.setESTIMATE_NO(struct.getESTIMATE_NO());
			this.setDETAL_NO(struct.getDETAL_NO());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.setNAME(struct.getNAME());
			this.setVALUE(struct.getVALUE());
			this.setPROJECT_NAME(struct.getPROJECT_NAME());
			this.setPJ_MODIFY_COUNT(struct.getPJ_MODIFY_COUNT());
			this.setESTIMATE_TYPE(struct.getESTIMATE_TYPE());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setODR_AMOUNT(struct.getODR_AMOUNT());
			this.setES_COST_MATERIAL(struct.getES_COST_MATERIAL());
			this.setES_COST_PROCESS(struct.getES_COST_PROCESS());
			this.setES_COST_OUTSOUCE(struct.getES_COST_OUTSOUCE());
			this.setES_COST_ETC(struct.getES_COST_ETC());
			this.setES_COST_SERVICE(struct.getES_COST_SERVICE());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setODR_QTY(struct.getODR_QTY());
			this.setUNIT_CD(struct.getUNIT_CD());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_JOB_ODR_CANCEL_NO(struct.getl_JOB_ODR_CANCEL_NO());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setTOTAL_DATE(struct.getTOTAL_DATE());
			this.setCOST_PROGRESS(struct.getCOST_PROGRESS());
			this.setCMP_COST_MATERIAL(struct.getCMP_COST_MATERIAL());
			this.setEXP_COST_MATERIAL(struct.getEXP_COST_MATERIAL());
			this.setCMP_COST_PROCESS(struct.getCMP_COST_PROCESS());
			this.setEXP_COST_PROCESS(struct.getEXP_COST_PROCESS());
			this.setCMP_COST_OUTSOUCE(struct.getCMP_COST_OUTSOUCE());
			this.setEXP_COST_OUTSOUCE(struct.getEXP_COST_OUTSOUCE());
			this.setCMP_COST_SERVICE(struct.getCMP_COST_SERVICE());
			this.setEXP_COST_SERVICE(struct.getEXP_COST_SERVICE());
			this.setOD_COMP_FLG(struct.getOD_COMP_FLG());
			this.setpvc2LogMode(struct.getpvc2LogMode());
			this.setpvc2OutputMode(struct.getpvc2OutputMode());
			this.setpvc2OutputPath(struct.getpvc2OutputPath());
			this.setpvc2OutputName(struct.getpvc2OutputName());
			this.setpvc2UserId(struct.getpvc2UserId());
			this.setpvc2BusinessName(struct.getpvc2BusinessName());
			this.setpvc2PlantCd(struct.getpvc2PlantCd());
			this.setpvc2OdrNo(struct.getpvc2OdrNo());
			this.setpvc2PProjectCd(struct.getpvc2PProjectCd());
			this.setpnumEstimateNo(struct.getpnumEstimateNo());
			this.setpnumDetalNo(struct.getpnumDetalNo());
			this.setpnumReturn(struct.getpnumReturn());
			this.setFILE_PATH(struct.getFILE_PATH());
			this.setFILE_NAME(struct.getFILE_NAME());
			this.setLOG_MODE_TYP(struct.getLOG_MODE_TYP());
			this.setOUTPUT_MODE_TYP(struct.getOUTPUT_MODE_TYP());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KM0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CALCULATION_DATE(struct.getList_CALCULATION_DATE());
			this.setList_TYP(struct.getList_TYP());
			this.setList_PROGRESS(struct.getList_PROGRESS());
			this.setList_PROFIT_RATIO(struct.getList_PROFIT_RATIO());
			this.setList_ITEM_TOTAL_COST(struct.getList_ITEM_TOTAL_COST());
			this.setList_ODR_AMOUNT_W(struct.getList_ODR_AMOUNT_W());
			this.setList_ITEM_TOTAL_COST_W(struct.getList_ITEM_TOTAL_COST_W());
			this.setList_ITEM_TOTAL_COST_T(struct.getList_ITEM_TOTAL_COST_T());
			this.setList_ITEM_TOTAL_COST_P(struct.getList_ITEM_TOTAL_COST_P());
			this.setList_ITEM_TOTAL_COST_D(struct.getList_ITEM_TOTAL_COST_D());
			this.setList_MATERIAL_COST_W(struct.getList_MATERIAL_COST_W());
			this.setList_MATERIAL_COST_T(struct.getList_MATERIAL_COST_T());
			this.setList_MATERIAL_COST_P(struct.getList_MATERIAL_COST_P());
			this.setList_MATERIAL_COST_D(struct.getList_MATERIAL_COST_D());
			this.setList_PROCESSING_COST_W(struct.getList_PROCESSING_COST_W());
			this.setList_PROCESSING_COST_T(struct.getList_PROCESSING_COST_T());
			this.setList_PROCESSING_COST_P(struct.getList_PROCESSING_COST_P());
			this.setList_PROCESSING_COST_D(struct.getList_PROCESSING_COST_D());
			this.setList_SBCNT_COST_W(struct.getList_SBCNT_COST_W());
			this.setList_SBCNT_COST_T(struct.getList_SBCNT_COST_T());
			this.setList_SBCNT_COST_P(struct.getList_SBCNT_COST_P());
			this.setList_SBCNT_COST_D(struct.getList_SBCNT_COST_D());
			this.setList_OTHER_OVERHEADS_W(struct.getList_OTHER_OVERHEADS_W());
			this.setList_OTHER_OVERHEADS_T(struct.getList_OTHER_OVERHEADS_T());
			this.setList_OTHER_OVERHEADS_P(struct.getList_OTHER_OVERHEADS_P());
			this.setList_OTHER_OVERHEADS_D(struct.getList_OTHER_OVERHEADS_D());
			this.setList_SERVICE_COST_W(struct.getList_SERVICE_COST_W());
			this.setList_SERVICE_COST_T(struct.getList_SERVICE_COST_T());
			this.setList_SERVICE_COST_P(struct.getList_SERVICE_COST_P());
			this.setList_SERVICE_COST_D(struct.getList_SERVICE_COST_D());
			this.setList_PROFIT_RATIO_W(struct.getList_PROFIT_RATIO_W());
			this.setList_PROFIT_RATIO_P(struct.getList_PROFIT_RATIO_P());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_TYP_NUM(struct.getList_TYP_NUM());
			this.setList_h_DETAL_NO(struct.getList_h_DETAL_NO());
			this.setList_h_ES_COST_ETC(struct.getList_h_ES_COST_ETC());
			this.setList_h_COST_PROGRESS(struct.getList_h_COST_PROGRESS());
			this.setList_l_ODR_AMOUNT(struct.getList_l_ODR_AMOUNT());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_ODR_UNIT_PRICE(struct.getList_l_ODR_UNIT_PRICE());
			this.setList_ITEM_TOTAL_COST_D2(struct.getList_ITEM_TOTAL_COST_D2());
			this.setList_MATERIAL_COST_D2(struct.getList_MATERIAL_COST_D2());
			this.setList_PROCESSING_COST_D2(struct.getList_PROCESSING_COST_D2());
			this.setList_SBCNT_COST_D2(struct.getList_SBCNT_COST_D2());
			this.setList_OTHER_OVERHEADS_D2(struct.getList_OTHER_OVERHEADS_D2());
			this.setList_SERVICE_COST_D2(struct.getList_SERVICE_COST_D2());
			this.setList_PROGRESS_NO(struct.getList_PROGRESS_NO());
			this.setList_pnumFlag(struct.getList_pnumFlag());
			this.setList_PROJECT_STAT(struct.getList_PROJECT_STAT());
			this.setList_PROJECT_CD(struct.getList_PROJECT_CD());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_CMP_COST_ETC(struct.getList_CMP_COST_ETC());
			this.setList_ESTIMATE_NO(struct.getList_ESTIMATE_NO());
			this.setList_DETAL_NO(struct.getList_DETAL_NO());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_NAME(struct.getList_NAME());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_PROJECT_NAME(struct.getList_PROJECT_NAME());
			this.setList_PJ_MODIFY_COUNT(struct.getList_PJ_MODIFY_COUNT());
			this.setList_ESTIMATE_TYPE(struct.getList_ESTIMATE_TYPE());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_ODR_AMOUNT(struct.getList_ODR_AMOUNT());
			this.setList_ES_COST_MATERIAL(struct.getList_ES_COST_MATERIAL());
			this.setList_ES_COST_PROCESS(struct.getList_ES_COST_PROCESS());
			this.setList_ES_COST_OUTSOUCE(struct.getList_ES_COST_OUTSOUCE());
			this.setList_ES_COST_ETC(struct.getList_ES_COST_ETC());
			this.setList_ES_COST_SERVICE(struct.getList_ES_COST_SERVICE());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_UNIT_CD(struct.getList_UNIT_CD());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_JOB_ODR_CANCEL_NO(struct.getList_l_JOB_ODR_CANCEL_NO());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_TOTAL_DATE(struct.getList_TOTAL_DATE());
			this.setList_COST_PROGRESS(struct.getList_COST_PROGRESS());
			this.setList_CMP_COST_MATERIAL(struct.getList_CMP_COST_MATERIAL());
			this.setList_EXP_COST_MATERIAL(struct.getList_EXP_COST_MATERIAL());
			this.setList_CMP_COST_PROCESS(struct.getList_CMP_COST_PROCESS());
			this.setList_EXP_COST_PROCESS(struct.getList_EXP_COST_PROCESS());
			this.setList_CMP_COST_OUTSOUCE(struct.getList_CMP_COST_OUTSOUCE());
			this.setList_EXP_COST_OUTSOUCE(struct.getList_EXP_COST_OUTSOUCE());
			this.setList_CMP_COST_SERVICE(struct.getList_CMP_COST_SERVICE());
			this.setList_EXP_COST_SERVICE(struct.getList_EXP_COST_SERVICE());
			this.setList_OD_COMP_FLG(struct.getList_OD_COMP_FLG());
			this.setList_pvc2LogMode(struct.getList_pvc2LogMode());
			this.setList_pvc2OutputMode(struct.getList_pvc2OutputMode());
			this.setList_pvc2OutputPath(struct.getList_pvc2OutputPath());
			this.setList_pvc2OutputName(struct.getList_pvc2OutputName());
			this.setList_pvc2UserId(struct.getList_pvc2UserId());
			this.setList_pvc2BusinessName(struct.getList_pvc2BusinessName());
			this.setList_pvc2PlantCd(struct.getList_pvc2PlantCd());
			this.setList_pvc2OdrNo(struct.getList_pvc2OdrNo());
			this.setList_pvc2PProjectCd(struct.getList_pvc2PProjectCd());
			this.setList_pnumEstimateNo(struct.getList_pnumEstimateNo());
			this.setList_pnumDetalNo(struct.getList_pnumDetalNo());
			this.setList_pnumReturn(struct.getList_pnumReturn());
			this.setList_FILE_PATH(struct.getList_FILE_PATH());
			this.setList_FILE_NAME(struct.getList_FILE_NAME());
			this.setList_LOG_MODE_TYP(struct.getList_LOG_MODE_TYP());
			this.setList_OUTPUT_MODE_TYP(struct.getList_OUTPUT_MODE_TYP());
		}
	}

	/**
	 * �I�u�W�F�N�g�̕�����\����Ԃ��܂��B
	 * �����ł́AgetXXXX�Ŏ擾�ł��邱�̃N���X�̑����l�i���X�g�͏����j��Ԃ��܂��B
	 * @return �I�u�W�F�N�g�̕�����\��
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		java.lang.reflect.Method[] method = getClass().getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			String name = method[i].getName();
			if (name.startsWith("get") && !name.startsWith("getList")) {
				try {
					buffer.append(name.substring(3));
					buffer.append("=[");
					buffer.append(method[i].invoke(this, new Object[]{}));
					buffer.append("], ");
				} catch (IllegalAccessException e) {
					buffer.append(name);
					buffer.append("is IllegalAccessException!! , ");
				} catch (java.lang.reflect.InvocationTargetException e) {
					buffer.append(name);
					buffer.append("is InvocationTargetException!! , ");
				}
			}
		}
		if (buffer.length() < 2) {
			return super.toString();
		}
		return buffer.substring(0, buffer.length() - 2);
	}

	//////////////////////////////
	// �����l��`
	// �ȉ��ɏ������Ɏg���萔�̎Q�l�Ƃ��čĐ����̂��тɎ����I�ɑS�����o�[�̃T���v�����R�����g�A�E�g���ďo�͂��Ă��܂��B
/*
	// �� 1 �ϐ������l�F i_CALCULATION_DATE


	final static String i_CALCULATION_DATE = null;

	// �� 2 �ϐ������l�F i_TYP


	final static String i_TYP = null;

	// �� 3 �ϐ������l�F i_PROGRESS


	final static String i_PROGRESS = null;

	// �� 4 �ϐ������l�F i_PROFIT_RATIO


	final static String i_PROFIT_RATIO = null;

	// �� 5 �ϐ������l�F i_ITEM_TOTAL_COST


	final static String i_ITEM_TOTAL_COST = null;

	// �� 6 �ϐ������l�F i_ODR_AMOUNT_W


	final static String i_ODR_AMOUNT_W = null;

	// �� 7 �ϐ������l�F i_ITEM_TOTAL_COST_W


	final static String i_ITEM_TOTAL_COST_W = null;

	// �� 8 �ϐ������l�F i_ITEM_TOTAL_COST_T


	final static String i_ITEM_TOTAL_COST_T = null;

	// �� 9 �ϐ������l�F i_ITEM_TOTAL_COST_P


	final static String i_ITEM_TOTAL_COST_P = null;

	// �� 10 �ϐ������l�F i_ITEM_TOTAL_COST_D


	final static String i_ITEM_TOTAL_COST_D = null;

	// �� 11 �ϐ������l�F i_MATERIAL_COST_W


	final static String i_MATERIAL_COST_W = null;

	// �� 12 �ϐ������l�F i_MATERIAL_COST_T


	final static String i_MATERIAL_COST_T = null;

	// �� 13 �ϐ������l�F i_MATERIAL_COST_P


	final static String i_MATERIAL_COST_P = null;

	// �� 14 �ϐ������l�F i_MATERIAL_COST_D


	final static String i_MATERIAL_COST_D = null;

	// �� 15 �ϐ������l�F i_PROCESSING_COST_W


	final static String i_PROCESSING_COST_W = null;

	// �� 16 �ϐ������l�F i_PROCESSING_COST_T


	final static String i_PROCESSING_COST_T = null;

	// �� 17 �ϐ������l�F i_PROCESSING_COST_P


	final static String i_PROCESSING_COST_P = null;

	// �� 18 �ϐ������l�F i_PROCESSING_COST_D


	final static String i_PROCESSING_COST_D = null;

	// �� 19 �ϐ������l�F i_SBCNT_COST_W


	final static String i_SBCNT_COST_W = null;

	// �� 20 �ϐ������l�F i_SBCNT_COST_T


	final static String i_SBCNT_COST_T = null;

	// �� 21 �ϐ������l�F i_SBCNT_COST_P


	final static String i_SBCNT_COST_P = null;

	// �� 22 �ϐ������l�F i_SBCNT_COST_D


	final static String i_SBCNT_COST_D = null;

	// �� 23 �ϐ������l�F i_OTHER_OVERHEADS_W


	final static String i_OTHER_OVERHEADS_W = null;

	// �� 24 �ϐ������l�F i_OTHER_OVERHEADS_T


	final static String i_OTHER_OVERHEADS_T = null;

	// �� 25 �ϐ������l�F i_OTHER_OVERHEADS_P


	final static String i_OTHER_OVERHEADS_P = null;

	// �� 26 �ϐ������l�F i_OTHER_OVERHEADS_D


	final static String i_OTHER_OVERHEADS_D = null;

	// �� 27 �ϐ������l�F i_SERVICE_COST_W


	final static String i_SERVICE_COST_W = null;

	// �� 28 �ϐ������l�F i_SERVICE_COST_T


	final static String i_SERVICE_COST_T = null;

	// �� 29 �ϐ������l�F i_SERVICE_COST_P


	final static String i_SERVICE_COST_P = null;

	// �� 30 �ϐ������l�F i_SERVICE_COST_D


	final static String i_SERVICE_COST_D = null;

	// �� 31 �ϐ������l�F i_PROFIT_RATIO_W


	final static String i_PROFIT_RATIO_W = null;

	// �� 32 �ϐ������l�F i_PROFIT_RATIO_P


	final static String i_PROFIT_RATIO_P = null;

	// �� 33 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 34 �ϐ������l�F i_TYP_NUM


	final static String i_TYP_NUM = null;

	// �� 35 �ϐ������l�F i_h_DETAL_NO


	final static String i_h_DETAL_NO = null;

	// �� 36 �ϐ������l�F i_h_ES_COST_ETC


	final static String i_h_ES_COST_ETC = null;

	// �� 37 �ϐ������l�F i_h_COST_PROGRESS


	final static String i_h_COST_PROGRESS = null;

	// �� 38 �ϐ������l�F i_l_ODR_AMOUNT


	final static String i_l_ODR_AMOUNT = null;

	// �� 39 �ϐ������l�F i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// �� 40 �ϐ������l�F i_l_ODR_UNIT_PRICE


	final static String i_l_ODR_UNIT_PRICE = null;

	// �� 41 �ϐ������l�F i_ITEM_TOTAL_COST_D2


	final static String i_ITEM_TOTAL_COST_D2 = null;

	// �� 42 �ϐ������l�F i_MATERIAL_COST_D2


	final static String i_MATERIAL_COST_D2 = null;

	// �� 43 �ϐ������l�F i_PROCESSING_COST_D2


	final static String i_PROCESSING_COST_D2 = null;

	// �� 44 �ϐ������l�F i_SBCNT_COST_D2


	final static String i_SBCNT_COST_D2 = null;

	// �� 45 �ϐ������l�F i_OTHER_OVERHEADS_D2


	final static String i_OTHER_OVERHEADS_D2 = null;

	// �� 46 �ϐ������l�F i_SERVICE_COST_D2


	final static String i_SERVICE_COST_D2 = null;

	// �� 47 �ϐ������l�F i_PROGRESS_NO


	final static String i_PROGRESS_NO = null;

	// �� 48 �ϐ������l�F i_pnumFlag


	final static String i_pnumFlag = null;

	// �� 49 �ϐ������l�F i_PROJECT_STAT


	final static String i_PROJECT_STAT = null;

	// �� 50 �ϐ������l�F i_PROJECT_CD


	final static String i_PROJECT_CD = null;

	// �� 51 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

	// �� 52 �ϐ������l�F i_CMP_COST_ETC


	final static String i_CMP_COST_ETC = null;

	// �� 53 �ϐ������l�F i_ESTIMATE_NO


	final static String i_ESTIMATE_NO = null;

	// �� 54 �ϐ������l�F i_DETAL_NO


	final static String i_DETAL_NO = null;

	// �� 55 �ϐ������l�F i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// �� 56 �ϐ������l�F i_NAME


	final static String i_NAME = null;

	// �� 57 �ϐ������l�F i_VALUE


	final static String i_VALUE = null;

	// �� 58 �ϐ������l�F i_PROJECT_NAME


	final static String i_PROJECT_NAME = null;

	// �� 59 �ϐ������l�F i_PJ_MODIFY_COUNT


	final static String i_PJ_MODIFY_COUNT = null;

	// �� 60 �ϐ������l�F i_ESTIMATE_TYPE


	final static String i_ESTIMATE_TYPE = null;

	// �� 61 �ϐ������l�F i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// �� 62 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 63 �ϐ������l�F i_ODR_AMOUNT


	final static String i_ODR_AMOUNT = null;

	// �� 64 �ϐ������l�F i_ES_COST_MATERIAL


	final static String i_ES_COST_MATERIAL = null;

	// �� 65 �ϐ������l�F i_ES_COST_PROCESS


	final static String i_ES_COST_PROCESS = null;

	// �� 66 �ϐ������l�F i_ES_COST_OUTSOUCE


	final static String i_ES_COST_OUTSOUCE = null;

	// �� 67 �ϐ������l�F i_ES_COST_ETC


	final static String i_ES_COST_ETC = null;

	// �� 68 �ϐ������l�F i_ES_COST_SERVICE


	final static String i_ES_COST_SERVICE = null;

	// �� 69 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 70 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 71 �ϐ������l�F i_UNIT_CD


	final static String i_UNIT_CD = null;

	// �� 72 �ϐ������l�F i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// �� 73 �ϐ������l�F i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// �� 74 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 75 �ϐ������l�F i_l_JOB_ODR_CANCEL_NO


	final static String i_l_JOB_ODR_CANCEL_NO = null;

	// �� 76 �ϐ������l�F i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// �� 77 �ϐ������l�F i_TOTAL_DATE


	final static String i_TOTAL_DATE = null;

	// �� 78 �ϐ������l�F i_COST_PROGRESS


	final static String i_COST_PROGRESS = null;

	// �� 79 �ϐ������l�F i_CMP_COST_MATERIAL


	final static String i_CMP_COST_MATERIAL = null;

	// �� 80 �ϐ������l�F i_EXP_COST_MATERIAL


	final static String i_EXP_COST_MATERIAL = null;

	// �� 81 �ϐ������l�F i_CMP_COST_PROCESS


	final static String i_CMP_COST_PROCESS = null;

	// �� 82 �ϐ������l�F i_EXP_COST_PROCESS


	final static String i_EXP_COST_PROCESS = null;

	// �� 83 �ϐ������l�F i_CMP_COST_OUTSOUCE


	final static String i_CMP_COST_OUTSOUCE = null;

	// �� 84 �ϐ������l�F i_EXP_COST_OUTSOUCE


	final static String i_EXP_COST_OUTSOUCE = null;

	// �� 85 �ϐ������l�F i_CMP_COST_SERVICE


	final static String i_CMP_COST_SERVICE = null;

	// �� 86 �ϐ������l�F i_EXP_COST_SERVICE


	final static String i_EXP_COST_SERVICE = null;

	// �� 87 �ϐ������l�F i_OD_COMP_FLG


	final static String i_OD_COMP_FLG = null;

	// �� 88 �ϐ������l�F i_pvc2LogMode


	final static String i_pvc2LogMode = null;

	// �� 89 �ϐ������l�F i_pvc2OutputMode


	final static String i_pvc2OutputMode = null;

	// �� 90 �ϐ������l�F i_pvc2OutputPath


	final static String i_pvc2OutputPath = null;

	// �� 91 �ϐ������l�F i_pvc2OutputName


	final static String i_pvc2OutputName = null;

	// �� 92 �ϐ������l�F i_pvc2UserId


	final static String i_pvc2UserId = null;

	// �� 93 �ϐ������l�F i_pvc2BusinessName


	final static String i_pvc2BusinessName = null;

	// �� 94 �ϐ������l�F i_pvc2PlantCd


	final static String i_pvc2PlantCd = null;

	// �� 95 �ϐ������l�F i_pvc2OdrNo


	final static String i_pvc2OdrNo = null;

	// �� 96 �ϐ������l�F i_pvc2PProjectCd


	final static String i_pvc2PProjectCd = null;

	// �� 97 �ϐ������l�F i_pnumEstimateNo


	final static String i_pnumEstimateNo = null;

	// �� 98 �ϐ������l�F i_pnumDetalNo


	final static String i_pnumDetalNo = null;

	// �� 99 �ϐ������l�F i_pnumReturn


	final static String i_pnumReturn = null;

	// �� 100 �ϐ������l�F i_FILE_PATH


	final static String i_FILE_PATH = null;

	// �� 101 �ϐ������l�F i_FILE_NAME


	final static String i_FILE_NAME = null;

	// �� 102 �ϐ������l�F i_LOG_MODE_TYP


	final static String i_LOG_MODE_TYP = null;

	// �� 103 �ϐ������l�F i_OUTPUT_MODE_TYP


	final static String i_OUTPUT_MODE_TYP = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_CALCULATION_DATE

	final static String i_CALCULATION_DATE = null;

	// �� 2 �ϐ������l�F i_TYP

	final static String i_TYP = null;

	// �� 3 �ϐ������l�F i_PROGRESS

	final static String i_PROGRESS = null;

	// �� 4 �ϐ������l�F i_PROFIT_RATIO

	final static String i_PROFIT_RATIO = null;

	// �� 5 �ϐ������l�F i_ITEM_TOTAL_COST

	final static String i_ITEM_TOTAL_COST = null;

	// �� 6 �ϐ������l�F i_ODR_AMOUNT_W

	final static String i_ODR_AMOUNT_W = null;

	// �� 7 �ϐ������l�F i_ITEM_TOTAL_COST_W

	final static String i_ITEM_TOTAL_COST_W = null;

	// �� 8 �ϐ������l�F i_ITEM_TOTAL_COST_T

	final static String i_ITEM_TOTAL_COST_T = null;

	// �� 9 �ϐ������l�F i_ITEM_TOTAL_COST_P

	final static String i_ITEM_TOTAL_COST_P = null;

	// �� 10 �ϐ������l�F i_ITEM_TOTAL_COST_D

	final static String i_ITEM_TOTAL_COST_D = null;

	// �� 11 �ϐ������l�F i_MATERIAL_COST_W

	final static String i_MATERIAL_COST_W = null;

	// �� 12 �ϐ������l�F i_MATERIAL_COST_T

	final static String i_MATERIAL_COST_T = null;

	// �� 13 �ϐ������l�F i_MATERIAL_COST_P

	final static String i_MATERIAL_COST_P = null;

	// �� 14 �ϐ������l�F i_MATERIAL_COST_D

	final static String i_MATERIAL_COST_D = null;

	// �� 15 �ϐ������l�F i_PROCESSING_COST_W

	final static String i_PROCESSING_COST_W = null;

	// �� 16 �ϐ������l�F i_PROCESSING_COST_T

	final static String i_PROCESSING_COST_T = null;

	// �� 17 �ϐ������l�F i_PROCESSING_COST_P

	final static String i_PROCESSING_COST_P = null;

	// �� 18 �ϐ������l�F i_PROCESSING_COST_D

	final static String i_PROCESSING_COST_D = null;

	// �� 19 �ϐ������l�F i_SBCNT_COST_W

	final static String i_SBCNT_COST_W = null;

	// �� 20 �ϐ������l�F i_SBCNT_COST_T

	final static String i_SBCNT_COST_T = null;

	// �� 21 �ϐ������l�F i_SBCNT_COST_P

	final static String i_SBCNT_COST_P = null;

	// �� 22 �ϐ������l�F i_SBCNT_COST_D

	final static String i_SBCNT_COST_D = null;

	// �� 23 �ϐ������l�F i_OTHER_OVERHEADS_W

	final static String i_OTHER_OVERHEADS_W = null;

	// �� 24 �ϐ������l�F i_OTHER_OVERHEADS_T

	final static String i_OTHER_OVERHEADS_T = null;

	// �� 25 �ϐ������l�F i_OTHER_OVERHEADS_P

	final static String i_OTHER_OVERHEADS_P = null;

	// �� 26 �ϐ������l�F i_OTHER_OVERHEADS_D

	final static String i_OTHER_OVERHEADS_D = null;

	// �� 27 �ϐ������l�F i_SERVICE_COST_W

	final static String i_SERVICE_COST_W = null;

	// �� 28 �ϐ������l�F i_SERVICE_COST_T

	final static String i_SERVICE_COST_T = null;

	// �� 29 �ϐ������l�F i_SERVICE_COST_P

	final static String i_SERVICE_COST_P = null;

	// �� 30 �ϐ������l�F i_SERVICE_COST_D

	final static String i_SERVICE_COST_D = null;

	// �� 32 �ϐ������l�F i_PROFIT_RATIO_W

	final static String i_PROFIT_RATIO_W = null;

	// �� 33 �ϐ������l�F i_PROFIT_RATIO_P

	final static String i_PROFIT_RATIO_P = null;

	// �� 34 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 35 �ϐ������l�F i_TYP_NUM

	final static String i_TYP_NUM = null;

	// �� 37 �ϐ������l�F i_h_DETAL_NO

	final static String i_h_DETAL_NO = null;

	// �� 38 �ϐ������l�F i_h_ES_COST_ETC

	final static String i_h_ES_COST_ETC = null;

	// �� 39 �ϐ������l�F i_PJ_MODIFY_COUNT

	final static String i_PJ_MODIFY_COUNT = null;

	// �� 40 �ϐ������l�F i_PROGRESS_NO

	final static String i_PROGRESS_NO = null;

	// �� 41 �ϐ������l�F i_PROJECT_STAT

	final static String i_PROJECT_STAT = null;

	// �� 42 �ϐ������l�F i_PROJECT_CD

	final static String i_PROJECT_CD = null;

	// �� 43 �ϐ������l�F i_ODR_NO

	final static String i_ODR_NO = null;

	// �� 44 �ϐ������l�F i_CMP_COST_ETC

	final static String i_CMP_COST_ETC = null;

	// �� 45 �ϐ������l�F i_ESTIMATE_NO

	final static String i_ESTIMATE_NO = null;

	// �� 46 �ϐ������l�F i_DETAL_NO

	final static String i_DETAL_NO = null;

	// �� 47 �ϐ������l�F i_DISPLAY_NAME

	final static String i_DISPLAY_NAME = null;

	// �� 48 �ϐ������l�F i_NAME

	final static String i_NAME = null;

	// �� 49 �ϐ������l�F i_VALUE

	final static String i_VALUE = null;

	// �� 50 �ϐ������l�F i_PROJECT_NAME

	final static String i_PROJECT_NAME = null;

	// �� 51 �ϐ������l�F i_ESTIMATE_TYPE

	final static String i_ESTIMATE_TYPE = null;

	// �� 52 �ϐ������l�F i_CUST_ITEM_CD

	final static String i_CUST_ITEM_CD = null;

	// �� 53 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 54 �ϐ������l�F i_ODR_AMOUNT

	final static String i_ODR_AMOUNT = null;

	// �� 55 �ϐ������l�F i_ES_COST_MATERIAL

	final static String i_ES_COST_MATERIAL = null;

	// �� 56 �ϐ������l�F i_ES_COST_PROCESS

	final static String i_ES_COST_PROCESS = null;

	// �� 57 �ϐ������l�F i_ES_COST_OUTSOUCE

	final static String i_ES_COST_OUTSOUCE = null;

	// �� 58 �ϐ������l�F i_ES_COST_ETC

	final static String i_ES_COST_ETC = null;

	// �� 59 �ϐ������l�F i_ES_COST_SERVICE

	final static String i_ES_COST_SERVICE = null;

	// �� 60 �ϐ������l�F i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// �� 61 �ϐ������l�F i_ODR_QTY

	final static String i_ODR_QTY = null;

	// �� 62 �ϐ������l�F i_UNIT_CD

	final static String i_UNIT_CD = null;

	// �� 63 �ϐ������l�F i_ODR_UNIT_PRICE

	final static String i_ODR_UNIT_PRICE = null;

	// �� 64 �ϐ������l�F i_DESINATED_DLV_DATE

	final static String i_DESINATED_DLV_DATE = null;

	// �� 65 �ϐ������l�F i_TOTAL_DATE

	final static String i_TOTAL_DATE = null;

	// �� 66 �ϐ������l�F i_COST_PROGRESS

	final static String i_COST_PROGRESS = null;

	// �� 67 �ϐ������l�F i_CMP_COST_MATERIAL

	final static String i_CMP_COST_MATERIAL = null;

	// �� 68 �ϐ������l�F i_EXP_COST_MATERIAL

	final static String i_EXP_COST_MATERIAL = null;

	// �� 69 �ϐ������l�F i_CMP_COST_PROCESS

	final static String i_CMP_COST_PROCESS = null;

	// �� 70 �ϐ������l�F i_EXP_COST_PROCESS

	final static String i_EXP_COST_PROCESS = null;

	// �� 71 �ϐ������l�F i_CMP_COST_OUTSOUCE

	final static String i_CMP_COST_OUTSOUCE = null;

	// �� 72 �ϐ������l�F i_EXP_COST_OUTSOUCE

	final static String i_EXP_COST_OUTSOUCE = null;

	// �� 73 �ϐ������l�F i_CMP_COST_SERVICE

	final static String i_CMP_COST_SERVICE = null;

	// �� 74 �ϐ������l�F i_EXP_COST_SERVICE

	final static String i_EXP_COST_SERVICE = null;

	// �� 75 �ϐ������l�F i_OD_COMP_FLG

	final static String i_OD_COMP_FLG = null;

	// �� 76 �ϐ������l�F i_pvc2LogMode

	final static String i_pvc2LogMode = null;

	// �� 77 �ϐ������l�F i_pvc2OutputMode

	final static String i_pvc2OutputMode = null;

	// �� 78 �ϐ������l�F i_pvc2OutputPath

	final static String i_pvc2OutputPath = null;

	// �� 79 �ϐ������l�F i_pvc2OutputName

	final static String i_pvc2OutputName = null;

	// �� 80 �ϐ������l�F i_pvc2UserId

	final static String i_pvc2UserId = null;

	// �� 81 �ϐ������l�F i_pvc2BusinessName

	final static String i_pvc2BusinessName = null;

	// �� 82 �ϐ������l�F i_pvc2PlantCd

	final static String i_pvc2PlantCd = null;

	// �� 83 �ϐ������l�F i_pvc2OdrNo

	final static String i_pvc2OdrNo = null;

	// �� 84 �ϐ������l�F i_pvc2PProjectCd

	final static String i_pvc2PProjectCd = null;

	// �� 85 �ϐ������l�F i_pnumEstimateNo

	final static String i_pnumEstimateNo = null;

	// �� 86 �ϐ������l�F i_pnumDetalNo

	final static String i_pnumDetalNo = null;

	// �� 87 �ϐ������l�F i_pnumReturn

	final static String i_pnumReturn = null;

	// �� 88 �ϐ������l�F i_FILE_PATH

	final static String i_FILE_PATH = null;

	// �� 89 �ϐ������l�F i_FILE_NAME

	final static String i_FILE_NAME = null;

	// �� 90 �ϐ������l�F i_LOG_MODE_TYP

	final static String i_LOG_MODE_TYP = null;

	// �� 91 �ϐ������l�F i_OUTPUT_MODE_TYP

	final static String i_OUTPUT_MODE_TYP = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_CALCULATION_DATE = i_CALCULATION_DATE;
		m_TYP = i_TYP;
		m_PROGRESS = i_PROGRESS;
		m_PROFIT_RATIO = i_PROFIT_RATIO;
		m_ITEM_TOTAL_COST = i_ITEM_TOTAL_COST;
		m_ODR_AMOUNT_W = i_ODR_AMOUNT_W;
		m_ITEM_TOTAL_COST_W = i_ITEM_TOTAL_COST_W;
		m_ITEM_TOTAL_COST_T = i_ITEM_TOTAL_COST_T;
		m_ITEM_TOTAL_COST_P = i_ITEM_TOTAL_COST_P;
		m_ITEM_TOTAL_COST_D = i_ITEM_TOTAL_COST_D;
		m_MATERIAL_COST_W = i_MATERIAL_COST_W;
		m_MATERIAL_COST_T = i_MATERIAL_COST_T;
		m_MATERIAL_COST_P = i_MATERIAL_COST_P;
		m_MATERIAL_COST_D = i_MATERIAL_COST_D;
		m_PROCESSING_COST_W = i_PROCESSING_COST_W;
		m_PROCESSING_COST_T = i_PROCESSING_COST_T;
		m_PROCESSING_COST_P = i_PROCESSING_COST_P;
		m_PROCESSING_COST_D = i_PROCESSING_COST_D;
		m_SBCNT_COST_W = i_SBCNT_COST_W;
		m_SBCNT_COST_T = i_SBCNT_COST_T;
		m_SBCNT_COST_P = i_SBCNT_COST_P;
		m_SBCNT_COST_D = i_SBCNT_COST_D;
		m_OTHER_OVERHEADS_W = i_OTHER_OVERHEADS_W;
		m_OTHER_OVERHEADS_T = i_OTHER_OVERHEADS_T;
		m_OTHER_OVERHEADS_P = i_OTHER_OVERHEADS_P;
		m_OTHER_OVERHEADS_D = i_OTHER_OVERHEADS_D;
		m_SERVICE_COST_W = i_SERVICE_COST_W;
		m_SERVICE_COST_T = i_SERVICE_COST_T;
		m_SERVICE_COST_P = i_SERVICE_COST_P;
		m_SERVICE_COST_D = i_SERVICE_COST_D;
		m_PROFIT_RATIO_W = i_PROFIT_RATIO_W;
		m_PROFIT_RATIO_P = i_PROFIT_RATIO_P;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_TYP_NUM = i_TYP_NUM;
		m_h_DETAL_NO = i_h_DETAL_NO;
		m_h_ES_COST_ETC = i_h_ES_COST_ETC;
		m_PJ_MODIFY_COUNT = i_PJ_MODIFY_COUNT;
		m_PROGRESS_NO = i_PROGRESS_NO;
		m_PROJECT_STAT = i_PROJECT_STAT;
		m_PROJECT_CD = i_PROJECT_CD;
		m_ODR_NO = i_ODR_NO;
		m_CMP_COST_ETC = i_CMP_COST_ETC;
		m_ESTIMATE_NO = i_ESTIMATE_NO;
		m_DETAL_NO = i_DETAL_NO;
		m_DISPLAY_NAME = i_DISPLAY_NAME;
		m_NAME = i_NAME;
		m_VALUE = i_VALUE;
		m_PROJECT_NAME = i_PROJECT_NAME;
		m_ESTIMATE_TYPE = i_ESTIMATE_TYPE;
		m_CUST_ITEM_CD = i_CUST_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_ODR_AMOUNT = i_ODR_AMOUNT;
		m_ES_COST_MATERIAL = i_ES_COST_MATERIAL;
		m_ES_COST_PROCESS = i_ES_COST_PROCESS;
		m_ES_COST_OUTSOUCE = i_ES_COST_OUTSOUCE;
		m_ES_COST_ETC = i_ES_COST_ETC;
		m_ES_COST_SERVICE = i_ES_COST_SERVICE;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_ODR_QTY = i_ODR_QTY;
		m_UNIT_CD = i_UNIT_CD;
		m_ODR_UNIT_PRICE = i_ODR_UNIT_PRICE;
		m_DESINATED_DLV_DATE = i_DESINATED_DLV_DATE;
		m_TOTAL_DATE = i_TOTAL_DATE;
		m_COST_PROGRESS = i_COST_PROGRESS;
		m_CMP_COST_MATERIAL = i_CMP_COST_MATERIAL;
		m_EXP_COST_MATERIAL = i_EXP_COST_MATERIAL;
		m_CMP_COST_PROCESS = i_CMP_COST_PROCESS;
		m_EXP_COST_PROCESS = i_EXP_COST_PROCESS;
		m_CMP_COST_OUTSOUCE = i_CMP_COST_OUTSOUCE;
		m_EXP_COST_OUTSOUCE = i_EXP_COST_OUTSOUCE;
		m_CMP_COST_SERVICE = i_CMP_COST_SERVICE;
		m_EXP_COST_SERVICE = i_EXP_COST_SERVICE;
		m_OD_COMP_FLG = i_OD_COMP_FLG;
		m_pvc2LogMode = i_pvc2LogMode;
		m_pvc2OutputMode = i_pvc2OutputMode;
		m_pvc2OutputPath = i_pvc2OutputPath;
		m_pvc2OutputName = i_pvc2OutputName;
		m_pvc2UserId = i_pvc2UserId;
		m_pvc2BusinessName = i_pvc2BusinessName;
		m_pvc2PlantCd = i_pvc2PlantCd;
		m_pvc2OdrNo = i_pvc2OdrNo;
		m_pvc2PProjectCd = i_pvc2PProjectCd;
		m_pnumEstimateNo = i_pnumEstimateNo;
		m_pnumDetalNo = i_pnumDetalNo;
		m_pnumReturn = i_pnumReturn;
		m_FILE_PATH = i_FILE_PATH;
		m_FILE_NAME = i_FILE_NAME;
		m_LOG_MODE_TYP = i_LOG_MODE_TYP;
		m_OUTPUT_MODE_TYP = i_OUTPUT_MODE_TYP;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
