/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/src/com/nec/jp/orteus/metamorBase/AA0050/AA0050Const.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.metamorBase.AA0050;

/**
 * AA0050定数定義
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/08 10:19:05 $
 *
 **/
public interface AA0050Const
{
    /** 所要量計算対象フラグ 0:非 */
    final static int _MRP_NON = 0;

    /** 所要量計算対象フラグ 1:所要量計算対象 */
    final static int _MRP_TARGET = 1;

    /** 倉庫区分 1:工程保管場所 */
	final static int _WH_KEEP_PLACE = 1;

    /** 内作代表フラグ 0:代表でない */
	final static String _WH_INSIDE_NON = "0";

    /** 内作代表フラグ 1:代表 */
	final static String _WH_INSIDE_TYPICAL = "1";

    /** 外作代表フラグ 0:代表でない */
	final static String _WH_OUTSIDE_NON = "0";

    /** 外作代表フラグ 1:代表 */
	final static String _WH_OUTSIDE_TYPICAL = "1";
}
