/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0090/src/com/nec/jp/orteus/metamorBase/AF0090/AF0090Const.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.metamorBase.AF0090;

/**
 * AF0090定数定義
 * @author $Author: kong-haijing $
 * @version $Revision: 1.3 $
 *
 **/
public interface AF0090Const
{
    /** 品目手配区分 1:製番 */
    final static Integer _MRP_ODR_JOB_ODR_CD = new Integer(1);

    /** 品目手配区分 2:在庫引当型製番 */
    final static Integer _MRP_ODR_STOCK_ALC_JOB_ODR_CD = new Integer(2);

    /** 製番枝番 ZERO */
    final static int _JOB_ODR_DETAIL_NO = 0;

    /** 所要量計算対象フラグ 1:所要量計算対象 */
    final static String _MRP_TARGET = "1";
}
