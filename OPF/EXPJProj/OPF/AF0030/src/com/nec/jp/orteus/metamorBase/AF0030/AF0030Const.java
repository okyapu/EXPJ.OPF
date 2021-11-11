/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0030/src/com/nec/jp/orteus/metamorBase/AF0030/AF0030Const.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.metamorBase.AF0030;

/**
 * AF0030定数定義
 * @author $Author: suganuma $
 * @version $Revision: 1.5 $
 *
 **/
public interface AF0030Const
{
    /** 品目手配区分 1:製番 */
    final static String _MRP_ODR_JOB_ODR_CD = "1";

    /** 品目手配区分 2:在庫引当型製番 */
    final static String _MRP_ODR_STOCK_ALC_JOB_ODR_CD = "2";

    /** 製番枝番 ZERO */
    final static int _JOB_ODR_DETAIL_NO = 0;

    /** 出庫完了フラグ 0:未 */
    final static String _ISSUE_CMPLT_YET = "0";

    /** 出庫完了フラグ 1:完了 */
    final static String _ISSUE_CMPLT_DONE  = "1";

    /** 在庫単位区分 1:整数管理 */
    final static String _UNIT_QTY_INTEGER  = "1";

    /** 在庫単位区分 0:少数管理 */
    final static String _UNIT_QTY_DECIMAL  = "0";
}
