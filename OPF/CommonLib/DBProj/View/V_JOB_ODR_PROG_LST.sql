CREATE OR REPLACE VIEW V_JOB_ODR_PROG_LST
    (OD_NO,PLANT_CD,PARENT_OD_NO,JOB_ODR_CD,JOB_ODR_CANCEL_NO,ODR_STS_TYP,
    DM_STS_TYP,ITEM_CD,ITEM_NAME,MRP_ODR_TYP,ODR_START_DATE,PRD_START_DATE,
    PRD_DUE_DATE,DUE_DATE,ODR_QTY,TOTAL_RCV_QTY,RCV_CMPLT_DATE,DM_QTY,TOTAL_ISSUE_QTY,
    ISSUE_CMPLT_DATE,ALCD_QTY,OD_GNR_TYP,EXTERNAL_DM_FLG,MRP_TYP,OUTSIDE_TYP,
    RLSD_PUCH_ODR_QTY,WORK_IN_PROC_QTY,OD_TYP,OPR_RSLT_TYP,ODR_STS_TYP_DISPLAY_NAME,
    DM_STS_TYP_DISPLAY_NAME,MRP_ODR_TYP_DISPLAY_NAME,OD_GNR_TYP_DISPLAY_NAME,
    BUSINESS_OPR_DATE,STOCK_UNIT)
AS
SELECT
    O.OD_NO,                         --オーダデマンド番号
    O.PLANT_CD,                      --工場コード
    O.PARENT_OD_NO,                  --親オーダデマンド番号
    O.JOB_ODR_CD,                    --製番
    O.JOB_ODR_CANCEL_NO,             --製番取消発生番号
    O.ODR_STS_TYP,                   --オーダ状態区分
    O.DM_STS_TYP,                    --デマンド状態区分
    O.ITEM_CD,                       --品目番号
    I.ITEM_NAME,                     --品目名
    O.MRP_ODR_TYP,                   --品目手配区分
    O.ODR_START_DATE,                --手配着手日
    O.PRD_START_DATE,                --製造着手日
    O.PRD_DUE_DATE,                  --製造納期
    O.DUE_DATE,                      --要求納期
    O.ODR_QTY,                       --入庫予定数（オーダ数）
    O.TOTAL_RCV_QTY,                 --入庫実績数（入庫累計数）
    O.RCV_CMPLT_DATE,                --入庫完了実績日（入庫完了日）
    O.DM_QTY,                        --出庫予定数（デマンド数）
    O.TOTAL_ISSUE_QTY,               --出庫実績数（出庫累計数）
    O.ISSUE_CMPLT_DATE,              --出庫完了実績日（出庫完了日）
    (SELECT SUM(ALCD_QTY)
        FROM
            T_JOB_ODR_ALC A
        WHERE
            A.OD_NO = O.OD_NO
    ) AS ALCD_QTY,                   --引当済み数
    O.OD_GNR_TYP,                    --所要量発生処理区分
    O.EXTERNAL_DM_FLG,               --外部デマンドフラグ(0:内部デマンド　1:外部デマンド)
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
      NAME = 'DM_STS_TYP'
      AND VALUE = O.DM_STS_TYP
    ) DM_STS_TYP_DISPLAY_NAME,       --出庫状態区分の表示説明
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
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --所要量発生処理区分の表示説明
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) BUSINESS_OPR_DATE,
    I.STOCK_UNIT                     --計量単位
FROM
    T_OD O,
    M_ITEM I
WHERE
    O.ITEM_CD = I.ITEM_CD(+)
/
