/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/common/RcvIssueConst.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.common;

/**
 * <pre>
 * 入出庫定数定義インタフェース
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:58 $
 *
 **/

public interface RcvIssueConst {

    /** ステータス：正常終了(0) */
    final static int STS_OK = 0;

    /** ステータス：レコードが存在しない(-1) */
    final static int STS_NO_RECORD = -1;

    /** ステータス：対象レコードが更新済み(-2) */
    final static int STS_UPDATED = -2;

    /** ステータス：その他のエラー(-9) */
    final static int STS_OTHER = -9;

    /** 出庫完了フラグ 0:未 */
    final static int ISSUE_CMPLT_YET = 0;

    /** 出庫完了フラグ 1:完了 */
    final static int ISSUE_CMPLT_DONE = 1;

    /** デマンド状態区分 0:デマンド情報ではない */
    final static int DM_STS_NO_DEMAND = 0;

    /** デマンド状態区分 1:計画(未発効) */
    final static int DM_STS_PLAN = 1;

    /** デマンド状態区分 2:確定(未発効) */
    final static int DM_STS_ALREADY = 2;

    /** デマンド状態区分 9:完了 */
    final static int DM_STS_COMPLETE = 9;

    /** 所要量対象フラグ 0:非 */
    final static int MRP_NONE = 0;

    /** 所要量対象フラグ 1:所要量計算対象 */
    final static int MRP_TARGET = 1;

    /** 内作代表フラグ 0:代表でない */
    final static int WH_INSIDE_NO_TYPICAL = 0;

    /** 内作代表フラグ 1:代表 */
    final static int WH_INSIDE_TYPICAL = 1;

    /** 外作代表フラグ 0:代表でない */
    final static int WH_OUTSIDE_NO_TYPICAL = 0;

    /** 外作代表フラグ 1:代表 */
    final static int WH_OUTSIDE_TYPICAL = 1;

    /** ソートフラグ 昇順 */
    final static boolean SORT_ASC = true;

    /** ソートフラグ 降順 */
    final static boolean SORT_DESC = false;

    /** 引当在庫区分 1:品目在庫 */
    final static int ALC_STOCK_ITEM = 1;

    /** 引当在庫区分 2:製番在庫・先行手配製番 */
    final static int ALC_STOCK_JOB_ODR = 2;

    /** 製番枝番 ZERO */
    final static int JOB_ODR_DETAIL_ZERO = 0;

    /** 読込モード 排他ロックなし */
    final static int NONE_LOCK = 0;

    /** 読込モード 排他ロックあり */
    final static int SELECT_FOR_UPDATE = 1;
    
    /** WH_PRIORITY_REF_NO */
    final static String STR_WH_PRIORITY_REF_NO = "999999999999999999";
}