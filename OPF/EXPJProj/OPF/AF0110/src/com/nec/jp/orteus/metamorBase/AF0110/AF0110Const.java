/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0110/src/com/nec/jp/orteus/metamorBase/AF0110/AF0110Const.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.metamorBase.AF0110;

/**
 * AF0110定数定義
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 04:13:35 $
 *
 **/
public interface AF0110Const
{
    /** 製番枝番 ZERO */
    final static int _JOB_ODR_DETAIL_ZERO = 0;

    /** 入出庫区分 1:入庫 */
    final static Integer _RCV_TYP = new Integer(1);

    /** 入出庫区分 2:出庫 */
    final static Integer _ISSUE_TYP = new Integer(2);

    /** 入出庫発生区分 14:振替入庫 */
    final static Integer _RCV_GNR_TYP = new Integer(14);

    /** 入出庫発生区分 24:振替出庫 */
    final static Integer _ISSUE_GNR_TYP = new Integer(24);

    /** 在庫数単位区分 1:整数管理 */
    final static int _UNIT_QTY_INTEGER = 1;
}
