//------------------------------------------------------------------------------
// (#)AA0010Common.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AA0010;

/**
 * AA00100��`
 * @author  Y.Inada
 * @version 1.00
 */
class AA0010Common
{
	/** ���x���ԍ� */
	final static String _HIGH_LEVEL_NO = new String("1");

	/** ���x���ԍ� �f�t�H���g�l[DB] */
	final static String _HIGH_LEVEL_NO_DB = new String("0");


	/** �o�ɋ敪 */
	final static Integer _ISSUE_TYP = new Integer(1);

	/** �i�ڎ�z�敪 */
	final static Integer _MRP_ODR_TYP = new Integer(1);

	/** ���O��敪 */
	final static Integer _OUTSIDE_TYP = new Integer(1);

	/** �׎p�Ǘ��t���O */
	final static Integer _STOCK_UNIT_FLG = new Integer(0);


	/** �׎p�P�ʐ� */
	final static String _PKG_UNIT_QTY = new String("1.0");

	/** �׎p�P�ʐ� �f�t�H���g�l[DB] */
	final static String _PKG_UNIT_QTY_DB = new String("0.0");


	/** �݌ɐ��P�ʋ敪 */
	final static Integer _UNIT_QTY_TYP = new Integer(1);

	/** �i�ڎ�z���[�h�^�C�� */
	final static String _ODR_LT = new String("0");

	/** �i�ڌŒ蕪���[�h�^�C�� */
	final static String _FIXED_LT = new String("0");

	/** �i�ڔ�ᕪ���[�h�^�C�� */
	final static String _PROP_LT = new String("0");

	/** ���S���� */
	final static String _SAFETY_LT = new String("0");

	/** ���o���[�h�^�C�� */
	final static String _ISSUE_LT = new String("0");

	/** �i�ڔ�ᕪ���b�g�T�C�Y */
	final static String _PROP_LOT_SIZE = new String("1.0");

	/** �i�ڎd���� */
	final static String _ITEM_SPOIL = new String("0.0");

	/** ���S�݌ɗ� */
	final static String _SAFETY_STOCK = new String("0.0");

	/** ���b�g�܂Ƃߋ敪 */
	final static Integer _LOT_SIZING_TYP = new Integer(1);


	/** �ő�܂Ƃߊ��� */
	final static String _MAX_PERIOD = new String("1");

	/** �ő�܂Ƃߊ��� �f�t�H���g�l[DB] */
	final static String _MAX_PERIOD_DB = new String("0");


	/** �ő��z�� */
	final static String _MAX_ODR_QTY = new String("99999999999999.0000");

	/** �ő��z�� �f�t�H���g�l[DB] */
	final static String _MAX_ODR_QTY_DB = new String("0.0");


	/** �����_�݌ɐ� */
	final static String _ODR_POINT = new String("0.0");


	/** ��ʔ����� */
	//final static String _FIXED_ODR_QTY = new String("99999999999999.0000");
	final static String _FIXED_ODR_QTY = new String("0.0");

	/** ��ʔ����� �f�t�H���g�l[DB] */
	final static String _FIXED_ODR_QTY_DB = new String("0.0");


	/** �ŏ���z�� */
	final static String _MIN_ODR_QTY = new String("0.0");


	/** �܂�ߒP�� */
	final static String _MUL_ODR_QTY = new String("1.0");

	/** �܂�ߒP�� �f�t�H���g�l[DB] */
	final static String _MUL_ODR_QTY_DB = new String("0.0");

// 2008/07/14 SYSCOM ���� ADD START
	/** �H���Ǘ��i�ڋ敪 */
	final static Integer _MANHOUR_TYP = new Integer(0);
// 2008/07/14 SYSCOM ���� ADD END

	/** MPS�i�ڃt���O */
	final static Integer _MPS_FLG = new Integer(0);

	/** ��������敪 */
	final static Integer _ACPT_INSPC_TYP = new Integer(1);

	/** ���i�敪 */
	final static Integer _PRODUCT_TYP = new Integer(1);

	/** �P�ʏd�� */
	final static String _UNIT_WEIGHT = new String("0.0");

	/** �I���敪 */
	final static Integer _ABC_TYP = new Integer(0);

	/** ��Ǝ��ы敪 */
	final static Integer _OPR_RSLT_TYP = new Integer(2);

	/** �󋋕i�敪 */
	final static Integer _SPL_ITEM_TYP = new Integer(0);
	
	/** �ۊǋ敪 */
	final static Integer _DEPO_TYP = new Integer(1); 
	
	/** ���b�g�Ǘ��t���O */
	final static Integer _LOT_CTRL_FLG = new Integer(0); 
	
	/** ���b�g�̔ԋ敪 */
	final static Integer _LOT_NUMBERING_TYP = new Integer(1); 
	
	/** �啪�ދ敪 */
	final static String CLASS_CD = new String("30");
	/** �����ދ敪00 */
	final static String CLASS_CD00 = new String("00");
	/** �����ދ敪01 */
	final static String CLASS_CD01 = new String("01");
	/** �����ދ敪02 */
	final static String CLASS_CD02 = new String("02");
	/** �����ދ敪03 */
	final static String CLASS_CD03 = new String("03");
	/** �����ދ敪04 */
	final static String CLASS_CD04 = new String("04");
	/** �����ދ敪05 */
	final static String CLASS_CD05 = new String("05");
	/** �����ދ敪06 */
	final static String CLASS_CD06 = new String("06");
	/** �����ދ敪07 */
	final static String CLASS_CD07 = new String("07");
	/** �����ދ敪08 */
	final static String CLASS_CD08 = new String("08");
	/** �����ދ敪09 */
	final static String CLASS_CD09 = new String("09");
	/** �����ދ敪10 */
	final static String CLASS_CD10 = new String("10");
	/** �����ދ敪11 */
	final static String CLASS_CD11 = new String("11");
	/** �����ދ敪12 */
	final static String CLASS_CD12 = new String("12");	
	
}
