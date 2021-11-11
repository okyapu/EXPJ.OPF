CREATE OR REPLACE VIEW V_ODR_PROG_LST
    (OD_NO,PLANT_CD,ODR_STS_TYP,ITEM_CD,ITEM_NAME,MRP_ODR_TYP,ODR_START_DATE,
    PRD_START_DATE,PRD_DUE_DATE,OD_GNR_TYP,ODR_QTY,TOTAL_RCV_QTY,RCV_CMPLT_DATE,
    JOB_ODR_CD,JOB_ODR_CANCEL_NO,JOB_ODR_TYP,ALC_GRP_CD,EXTERNAL_DM_FLG,
    EXTERNAL_PLAN_CD,MRP_TYP,OUTSIDE_TYP,RLSD_PUCH_ODR_QTY,WORK_IN_PROC_QTY,
    OD_TYP,OPR_RSLT_TYP,ODR_STS_TYP_DISPLAY_NAME,MRP_ODR_TYP_DISPLAY_NAME,
    JOB_ODR_TYP_DISPLAY_NAME,OD_GNR_TYP_DISPLAY_NAME,
    DELAY_BASE_DATE, DELAY_TYP, NOT_DELAY_BASE_DATE, NOT_DELAY_TYP,
    BUSINESS_OPR_DATE, PLANT_NAME)
AS
SELECT
    O.OD_NO,                         --オーダデマンド番号
    O.PLANT_CD,                      --工場コード
    O.ODR_STS_TYP,                   --オーダ状態区分
    O.ITEM_CD,                       --品目番号
    I.ITEM_NAME,                     --品目名
    O.MRP_ODR_TYP,                   --品目手配区分
    O.ODR_START_DATE,                --手配着手日
    O.PRD_START_DATE,                --製造着手日
    O.PRD_DUE_DATE,                  --製造納期
    O.OD_GNR_TYP,                    --所要量発生処理区分
    O.ODR_QTY,                       --計画数
    O.TOTAL_RCV_QTY,                 --実績数
    O.RCV_CMPLT_DATE,                --完了実績日
    O.JOB_ODR_CD,                    --製番
    O.JOB_ODR_CANCEL_NO,             --製番取消発生番号
    J.JOB_ODR_TYP,                   --製番種別
    O.ALC_GRP_CD,                    --引当グループコード
    O.EXTERNAL_DM_FLG,               --外部デマンドフラグ(0:内部デマンド　1:外部デマンド)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --外部デマンド番号
    O.MRP_TYP,                       --所要量処理区分
    O.OUTSIDE_TYP,                   --所要量内外作区分
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --オーダデマンド番号が発注残に存在するレコード数
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --オーダデマンド番号が品目別仕掛に存在するレコード数
    O.OD_TYP,                        --オーダデマンド区分
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --品目別作業実績区分
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --入庫状態区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --品目手配区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --製番種別の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --所要量発生処理区分の表示説明
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) DELAY_BASE_DATE,
    1 AS DELAY_TYP,
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) NOT_DELAY_BASE_DATE,
    1 AS NOT_DELAY_TYP,
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) BUSINESS_OPR_DATE,
    (SELECT
        PLANT_NAME
    FROM
        M_PLANT
    WHERE
        PLANT_CD = O.PLANT_CD
    ) PLANT_NAME
FROM
    T_OD O,
    M_ITEM I,
    T_JOB_ODR J,
    T_EXTERNAL_PLAN E
WHERE
    O.ITEM_CD = I.ITEM_CD(+)
    AND O.JOB_ODR_CD = J.JOB_ODR_CD(+)
    AND O.JOB_ODR_CANCEL_NO = J.JOB_ODR_CANCEL_NO(+)
    AND O.PLANT_CD = J.PLANT_CD(+)
    AND O.OD_NO = E.OD_NO(+)
    AND O.PLANT_CD = E.PLANT_CD(+)
UNION ALL
SELECT
    O.OD_NO,                         --オーダデマンド番号
    O.PLANT_CD,                      --工場コード
    O.ODR_STS_TYP,                   --オーダ状態区分
    O.ITEM_CD,                       --品目番号
    I.ITEM_NAME,                     --品目名
    O.MRP_ODR_TYP,                   --品目手配区分
    O.ODR_START_DATE,                --手配着手日
    O.PRD_START_DATE,                --製造着手日
    O.PRD_DUE_DATE,                  --製造納期
    O.OD_GNR_TYP,                    --所要量発生処理区分
    O.ODR_QTY,                       --計画数
    O.TOTAL_RCV_QTY,                 --実績数
    O.RCV_CMPLT_DATE,                --完了実績日
    O.JOB_ODR_CD,                    --製番
    O.JOB_ODR_CANCEL_NO,             --製番取消発生番号
    J.JOB_ODR_TYP,                   --製番種別
    O.ALC_GRP_CD,                    --引当グループコード
    O.EXTERNAL_DM_FLG,               --外部デマンドフラグ(0:内部デマンド　1:外部デマンド)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --外部デマンド番号
    O.MRP_TYP,                       --所要量処理区分
    O.OUTSIDE_TYP,                   --所要量内外作区分
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --オーダデマンド番号が発注残に存在するレコード数
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --オーダデマンド番号が品目別仕掛に存在するレコード数
    O.OD_TYP,                        --オーダデマンド区分
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --品目別作業実績区分
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --入庫状態区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --品目手配区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --製番種別の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --所要量発生処理区分の表示説明
    (SELECT BUSINESS_OPR_DATE FROM SYS_DATE_CTRL WHERE PLANT_CD = o.PLANT_CD) DELAY_BASE_DATE,
    1 AS DELAY_TYP,
    to_date('0001/01/01') NOT_DELAY_BASE_DATE,
    2 AS NOT_DELAY_TYP,
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) BUSINESS_OPR_DATE,
    (SELECT
        PLANT_NAME
    FROM
        M_PLANT
    WHERE
        PLANT_CD = O.PLANT_CD
    ) PLANT_NAME
FROM
    T_OD O,
    M_ITEM I,
    T_JOB_ODR J,
    T_EXTERNAL_PLAN E
WHERE
    O.ITEM_CD = I.ITEM_CD(+)
    AND O.JOB_ODR_CD = J.JOB_ODR_CD(+)
    AND O.JOB_ODR_CANCEL_NO = J.JOB_ODR_CANCEL_NO(+)
    AND O.PLANT_CD = J.PLANT_CD(+)
    AND O.OD_NO = E.OD_NO(+)
    AND O.PLANT_CD = E.PLANT_CD(+)
UNION ALL
SELECT
    O.OD_NO,                         --オーダデマンド番号
    O.PLANT_CD,                      --工場コード
    O.ODR_STS_TYP,                   --オーダ状態区分
    O.ITEM_CD,                       --品目番号
    I.ITEM_NAME,                     --品目名
    O.MRP_ODR_TYP,                   --品目手配区分
    O.ODR_START_DATE,                --手配着手日
    O.PRD_START_DATE,                --製造着手日
    O.PRD_DUE_DATE,                  --製造納期
    O.OD_GNR_TYP,                    --所要量発生処理区分
    O.ODR_QTY,                       --計画数
    O.TOTAL_RCV_QTY,                 --実績数
    O.RCV_CMPLT_DATE,                --完了実績日
    O.JOB_ODR_CD,                    --製番
    O.JOB_ODR_CANCEL_NO,             --製番取消発生番号
    J.JOB_ODR_TYP,                   --製番種別
    O.ALC_GRP_CD,                    --引当グループコード
    O.EXTERNAL_DM_FLG,               --外部デマンドフラグ(0:内部デマンド　1:外部デマンド)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --外部デマンド番号
    O.MRP_TYP,                       --所要量処理区分
    O.OUTSIDE_TYP,                   --所要量内外作区分
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --オーダデマンド番号が発注残に存在するレコード数
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --オーダデマンド番号が品目別仕掛に存在するレコード数
    O.OD_TYP,                        --オーダデマンド区分
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --品目別作業実績区分
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --入庫状態区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --品目手配区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --製番種別の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --所要量発生処理区分の表示説明
    to_date('9999/12/31') DELAY_BASE_DATE,
    2 AS DELAY_TYP,
    (SELECT BUSINESS_OPR_DATE FROM SYS_DATE_CTRL WHERE PLANT_CD = o.PLANT_CD) NOT_DELAY_BASE_DATE,
    1 AS NOT_DELAY_TYP,
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) BUSINESS_OPR_DATE,
    (SELECT
        PLANT_NAME
    FROM
        M_PLANT
    WHERE
        PLANT_CD = O.PLANT_CD
    ) PLANT_NAME
FROM
    T_OD O,
    M_ITEM I,
    T_JOB_ODR J,
    T_EXTERNAL_PLAN E
WHERE
    O.ITEM_CD = I.ITEM_CD(+)
    AND O.JOB_ODR_CD = J.JOB_ODR_CD(+)
    AND O.JOB_ODR_CANCEL_NO = J.JOB_ODR_CANCEL_NO(+)
    AND O.PLANT_CD = J.PLANT_CD(+)
    AND O.OD_NO = E.OD_NO(+)
    AND O.PLANT_CD = E.PLANT_CD(+)
UNION ALL
SELECT
    O.OD_NO,                         --オーダデマンド番号
    O.PLANT_CD,                      --工場コード
    O.ODR_STS_TYP,                   --オーダ状態区分
    O.ITEM_CD,                       --品目番号
    I.ITEM_NAME,                     --品目名
    O.MRP_ODR_TYP,                   --品目手配区分
    O.ODR_START_DATE,                --手配着手日
    O.PRD_START_DATE,                --製造着手日
    O.PRD_DUE_DATE,                  --製造納期
    O.OD_GNR_TYP,                    --所要量発生処理区分
    O.ODR_QTY,                       --計画数
    O.TOTAL_RCV_QTY,                 --実績数
    O.RCV_CMPLT_DATE,                --完了実績日
    O.JOB_ODR_CD,                    --製番
    O.JOB_ODR_CANCEL_NO,             --製番取消発生番号
    J.JOB_ODR_TYP,                   --製番種別
    O.ALC_GRP_CD,                    --引当グループコード
    O.EXTERNAL_DM_FLG,               --外部デマンドフラグ(0:内部デマンド　1:外部デマンド)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --外部デマンド番号
    O.MRP_TYP,                       --所要量処理区分
    O.OUTSIDE_TYP,                   --所要量内外作区分
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --オーダデマンド番号が発注残に存在するレコード数
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --オーダデマンド番号が品目別仕掛に存在するレコード数
    O.OD_TYP,                        --オーダデマンド区分
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --品目別作業実績区分
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --入庫状態区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --品目手配区分の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --製番種別の表示説明
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --所要量発生処理区分の表示説明
    to_date('9999/12/31') DELAY_BASE_DATE,
    2 AS DELAY_TYP,
    to_date('0001/01/01') NOT_DELAY_BASE_DATE,
    2 AS NOT_DELAY_TYP,
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) BUSINESS_OPR_DATE,
    (SELECT
        PLANT_NAME
    FROM
        M_PLANT
    WHERE
        PLANT_CD = O.PLANT_CD
    ) PLANT_NAME
FROM
    T_OD O,
    M_ITEM I,
    T_JOB_ODR J,
    T_EXTERNAL_PLAN E
WHERE
    O.ITEM_CD = I.ITEM_CD(+)
    AND O.JOB_ODR_CD = J.JOB_ODR_CD(+)
    AND O.JOB_ODR_CANCEL_NO = J.JOB_ODR_CANCEL_NO(+)
    AND O.PLANT_CD = J.PLANT_CD(+)
    AND O.OD_NO = E.OD_NO(+)
    AND O.PLANT_CD = E.PLANT_CD(+)
/
