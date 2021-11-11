Create OR Replace View V_PUCH_PRDCT_REP
(
    OD_NO,              --オーダデマンド番号
    PLANT_CD,           --工場コード
    JOB_ODR_CD,         --製番
    JOB_ODR_DETAIL_NO,  --製番枝番
    ITEM_CD,            --品目番号
    ITEM_NAME,          --品名
    COMPANY_CD,         --会社コード
    VEND_CD,            --取引先コード
    VEND_NAME,          --取引先名
    ODR_STS_TYP,        --オーダ状態区分
    ODR_START_DATE,     --手配着手日
    PRD_DUE_DATE,       --製造納期
    PRD_START_DATE,     --製造着手日
    OD_TYP,             --オーダデマンド区分
    ODR_QTY,            --オーダ数
    OUTSIDE_TYP,        --所要量内外作区分
    TOTAL_RCV_QTY,      --入庫累計数
    PUCH_ODR_QTY,       --発注数
    UNIT_COST,          --単価
    UNIT_COST_TYP,      --単価区分
    ROUND_TYP,          --発注金額まるめ区分
    PUCH_ODR_AMOUNT     --発注金額
)
AS
SELECT 
    OD_NO,
    PLANT_CD,
    JOB_ODR_CD,
    JOB_ODR_DETAIL_NO,
    ITEM_CD,
    ITEM_NAME,
    COMPANY_CD,
    VEND_CD,
    VEND_NAME,
    ODR_STS_TYP,
    ODR_START_DATE,
    PRD_DUE_DATE,
    PRD_START_DATE,
    OD_TYP,
    ODR_QTY,
    OUTSIDE_TYP,
    TOTAL_RCV_QTY,
    PUCH_ODR_QTY,
    UNIT_COST,
    UNIT_COST_TYP,
    ROUND_TYP,
    PUCH_ODR_AMOUNT
FROM
(
------
SELECT 
    OD1.OD_NO                   OD_NO,              --オーダデマンド番号
    OD1.PLANT_CD                PLANT_CD,           --工場コード
    OD1.JOB_ODR_CD              JOB_ODR_CD,         --製番
    OD1.JOB_ODR_DETAIL_NO       JOB_ODR_DETAIL_NO,  --製番枝番
    OD1.ITEM_CD                 ITEM_CD,            --品目番号
    OD1.ITEM_NAME               ITEM_NAME,          --品名
    OD1.COMPANY_CD              COMPANY_CD,         --会社コード
    OD1.VEND_CD                 VEND_CD,            --取引先コード
    OD1.VEND_NAME               VEND_NAME,          --取引先名
    OD1.ODR_STS_TYP             ODR_STS_TYP,        --オーダ状態区分
    OD1.ODR_START_DATE          ODR_START_DATE,     --手配着手日
    OD1.PRD_DUE_DATE            PRD_DUE_DATE,       --製造納期
    OD1.PRD_START_DATE          PRD_START_DATE,     --製造着手日
    OD1.OD_TYP                  OD_TYP,             --オーダデマンド区分
    OD1.ODR_QTY                 ODR_QTY,            --オーダ数
    OD1.OUTSIDE_TYP             OUTSIDE_TYP,        --所要量内外作区分
    OD1.TOTAL_RCV_QTY           TOTAL_RCV_QTY,      --入庫累計数
    OD1.PUCH_ODR_QTY            PUCH_ODR_QTY,       --発注数
    NVL(OD2.UNIT_COST, 0)       UNIT_COST,          --単価
    NVL(OD2.UNIT_COST_TYP, 1)   UNIT_COST_TYP,      --単価区分
    OD1.ROUND_TYP               ROUND_TYP,          --発注金額まるめ区分
    ROUND((OD1.PUCH_ODR_QTY * NVL(OD2.UNIT_COST, 0)), OD1.DECIMAL_FIG)  PUCH_ODR_AMOUNT     --発注金額
FROM
    (
    SELECT
        A1.OD_NO                    OD_NO,
        A1.PLANT_CD                 PLANT_CD,
        A1.ITEM_CD                  ITEM_CD,
        A2.ITEM_NAME                ITEM_NAME,
        A5.COMPANY_CD               COMPANY_CD,
        A3.VEND_CD                  VEND_CD,
        A3.VEND_NAME                VEND_NAME,
        NVL(A3.ROUND_TYP, 1)        ROUND_TYP,
        NVL(A4.DECIMAL_FIG, 0)      DECIMAL_FIG,
        A1.JOB_ODR_CD               JOB_ODR_CD,
        A1.JOB_ODR_DETAIL_NO        JOB_ODR_DETAIL_NO,
        A1.ODR_STS_TYP              ODR_STS_TYP,
        A1.ODR_START_DATE           ODR_START_DATE,
        A1.PRD_DUE_DATE             PRD_DUE_DATE,
        A1.PRD_START_DATE           PRD_START_DATE,
        A1.OD_TYP                   OD_TYP,
        A1.ODR_QTY                  ODR_QTY,
        A1.OUTSIDE_TYP              OUTSIDE_TYP,
        A1.TOTAL_RCV_QTY            TOTAL_RCV_QTY,
        GREATEST((A1.ODR_QTY - A1.TOTAL_RCV_QTY), 0)    PUCH_ODR_QTY
    FROM
        T_OD            A1,
        M_ITEM          A2,
        M_VEND_CTRL     A3,
        M_CUR           A4,
        SYS_MY_COMPANY  A5
    WHERE
        A1.ODR_STS_TYP IN (1,2) AND
        A1.OUTSIDE_TYP = 2 AND
        A1.OD_TYP <> 4 AND
        A2.ITEM_CD = A1.ITEM_CD AND
        A5.CTRL_CD = 'SYSTEM' AND
        A3.COMPANY_CD = A5.COMPANY_CD AND
        A3.VEND_CD = 
            (
            SELECT
                MIN(H1.VEND_CD)
            FROM
                M_PUCH_UNIT_COST_H H1
            WHERE
                H1.COMPANY_CD = A5.COMPANY_CD AND
                H1.PLANT_CD = A1.PLANT_CD AND
                H1.ITEM_CD = A1.ITEM_CD AND
                H1.PUCH_PRIORITY_REF_NO = 
                (
                 SELECT
                        MIN(H2.PUCH_PRIORITY_REF_NO)
                    FROM
                        M_PUCH_UNIT_COST_H H2
                    WHERE
                        H2.COMPANY_CD = A5.COMPANY_CD AND
                        H2.PLANT_CD = A1.PLANT_CD AND
                        H2.ITEM_CD = A1.ITEM_CD
                    GROUP BY
                        H2.COMPANY_CD,
                        H2.PLANT_CD,
                        H2.ITEM_CD
                )
            GROUP BY
                H1.COMPANY_CD,
                H1.PLANT_CD,
                H1.ITEM_CD
            ) AND
        A3.CUR_CD = A4.CUR_CD(+)
    )   OD1,
    (
    SELECT
        A1.OD_NO                    OD_NO,
        NVL(A3.UNIT_COST, 0)        UNIT_COST,
        NVL(A3.UNIT_COST_TYP, 1)    UNIT_COST_TYP
    FROM
        T_OD A1 ,
        SYS_MY_COMPANY A2,
        M_PUCH_UNIT_COST A3
    WHERE 
        A1.ODR_STS_TYP IN (1,2) AND
        A1.OUTSIDE_TYP = 2 AND
        A1.OD_TYP <> 4 AND
        A2.CTRL_CD = 'SYSTEM' AND
        A3.COMPANY_CD = A2.COMPANY_CD AND
        A3.PLANT_CD = A1.PLANT_CD AND
        A3.ITEM_CD = A1.ITEM_CD AND 
        A3.VEND_CD = 
            (
            SELECT
                MIN(H1.VEND_CD)
            FROM
                M_PUCH_UNIT_COST_H H1
            WHERE
                H1.COMPANY_CD = A2.COMPANY_CD AND
                H1.PLANT_CD = A1.PLANT_CD AND
                H1.ITEM_CD = A1.ITEM_CD AND
                H1.PUCH_PRIORITY_REF_NO = 
                (
                 SELECT
                        MIN(H2.PUCH_PRIORITY_REF_NO)
                    FROM
                        M_PUCH_UNIT_COST_H H2
                    WHERE
                        H2.COMPANY_CD = A2.COMPANY_CD AND
                        H2.PLANT_CD = A1.PLANT_CD AND
                        H2.ITEM_CD = A1.ITEM_CD
                    GROUP BY
                        H2.COMPANY_CD,
                        H2.PLANT_CD,
                        H2.ITEM_CD
                )
            GROUP BY
                H1.COMPANY_CD,
                H1.PLANT_CD,
                H1.ITEM_CD
            ) AND
        A3.EFF_PHASE_IN_DATE = 
            (
            SELECT
                MAX(P2.EFF_PHASE_IN_DATE)
            FROM
                M_PUCH_UNIT_COST P2
            WHERE
                P2.COMPANY_CD = A2.COMPANY_CD AND
                P2.VEND_CD = A3.VEND_CD AND
                P2.PLANT_CD = A1.PLANT_CD AND
                P2.ITEM_CD = A1.ITEM_CD AND
                P2.EFF_PHASE_IN_DATE <= A1.PRD_START_DATE 
            GROUP BY
                P2.COMPANY_CD,
                P2.VEND_CD,
                P2.PLANT_CD,
                P2.ITEM_CD
            )
        AND
        A3.PUCH_SIZE =
            (
            SELECT
                MAX(P3.PUCH_SIZE)
            FROM
                M_PUCH_UNIT_COST P3
            WHERE
                P3.COMPANY_CD = A2.COMPANY_CD AND
                P3.VEND_CD = A3.VEND_CD AND
                P3.PLANT_CD = A1.PLANT_CD AND
                P3.ITEM_CD = A1.ITEM_CD AND
                P3.EFF_PHASE_IN_DATE =
                    (
                    SELECT
                        MAX(P4.EFF_PHASE_IN_DATE)
                    FROM
                        M_PUCH_UNIT_COST P4
                    WHERE
                        P4.COMPANY_CD = A2.COMPANY_CD AND
                        P4.VEND_CD =  A3.VEND_CD AND
                        P4.PLANT_CD = A1.PLANT_CD AND
                        P4.ITEM_CD = A1.ITEM_CD AND
                        P4.EFF_PHASE_IN_DATE <= A1.PRD_START_DATE 
                    GROUP BY
                        P4.COMPANY_CD,
                        P4.VEND_CD,
                        P4.PLANT_CD,
                        P4.ITEM_CD
                    )
                AND
                P3.PUCH_SIZE <= A1.ODR_QTY
            GROUP BY
                P3.COMPANY_CD,
                P3.VEND_CD,
                P3.PLANT_CD,
                P3.ITEM_CD
            )
    )   OD2
WHERE
    OD1.OD_NO = OD2.OD_NO(+) AND
    OD1.ROUND_TYP = 1
------
UNION ALL
------
SELECT 
    OD1.OD_NO                   OD_NO,              --オーダデマンド番号
    OD1.PLANT_CD                PLANT_CD,           --工場コード
    OD1.JOB_ODR_CD              JOB_ODR_CD,         --製番
    OD1.JOB_ODR_DETAIL_NO       JOB_ODR_DETAIL_NO,  --製番枝番
    OD1.ITEM_CD                 ITEM_CD,            --品目番号
    OD1.ITEM_NAME               ITEM_NAME,          --品名
    OD1.COMPANY_CD              COMPANY_CD,         --会社コード
    OD1.VEND_CD                 VEND_CD,            --取引先コード
    OD1.VEND_NAME               VEND_NAME,          --取引先名
    OD1.ODR_STS_TYP             ODR_STS_TYP,        --オーダ状態区分
    OD1.ODR_START_DATE          ODR_START_DATE,     --手配着手日
    OD1.PRD_DUE_DATE            PRD_DUE_DATE,       --製造納期
    OD1.PRD_START_DATE          PRD_START_DATE,     --製造着手日
    OD1.OD_TYP                  OD_TYP,             --オーダデマンド区分
    OD1.ODR_QTY                 ODR_QTY,            --オーダ数
    OD1.OUTSIDE_TYP             OUTSIDE_TYP,        --所要量内外作区分
    OD1.TOTAL_RCV_QTY           TOTAL_RCV_QTY,      --入庫累計数
    OD1.PUCH_ODR_QTY            PUCH_ODR_QTY,       --発注数
    NVL(OD2.UNIT_COST, 0)       UNIT_COST,          --単価
    NVL(OD2.UNIT_COST_TYP, 1)   UNIT_COST_TYP,      --単価区分
    OD1.ROUND_TYP               ROUND_TYP,          --発注金額まるめ区分
    CEIL(OD1.PUCH_ODR_QTY * NVL(OD2.UNIT_COST,0) * POWER(10, OD1.DECIMAL_FIG)) / POWER(10, OD1.DECIMAL_FIG) PUCH_ODR_AMOUNT  --発注金額
FROM
    (
    SELECT
        A1.OD_NO                    OD_NO,
        A1.PLANT_CD                 PLANT_CD,
        A1.ITEM_CD                  ITEM_CD,
        A2.ITEM_NAME                ITEM_NAME,
        A5.COMPANY_CD               COMPANY_CD,
        A3.VEND_CD                  VEND_CD,
        A3.VEND_NAME                VEND_NAME,
        NVL(A3.ROUND_TYP, 1)        ROUND_TYP,
        NVL(A4.DECIMAL_FIG, 0)      DECIMAL_FIG,
        A1.JOB_ODR_CD               JOB_ODR_CD,
        A1.JOB_ODR_DETAIL_NO        JOB_ODR_DETAIL_NO,
        A1.ODR_STS_TYP              ODR_STS_TYP,
        A1.ODR_START_DATE           ODR_START_DATE,
        A1.PRD_DUE_DATE             PRD_DUE_DATE,
        A1.PRD_START_DATE           PRD_START_DATE,
        A1.OD_TYP                   OD_TYP,
        A1.ODR_QTY                  ODR_QTY,
        A1.OUTSIDE_TYP              OUTSIDE_TYP,
        A1.TOTAL_RCV_QTY            TOTAL_RCV_QTY,
        GREATEST((A1.ODR_QTY - A1.TOTAL_RCV_QTY), 0)    PUCH_ODR_QTY
    FROM
        T_OD            A1,
        M_ITEM          A2,
        M_VEND_CTRL     A3,
        M_CUR           A4,
        SYS_MY_COMPANY  A5
    WHERE
        A1.ODR_STS_TYP IN (1,2) AND
        A1.OUTSIDE_TYP = 2 AND
        A1.OD_TYP <> 4 AND
        A2.ITEM_CD = A1.ITEM_CD AND
        A5.CTRL_CD = 'SYSTEM' AND
        A3.COMPANY_CD = A5.COMPANY_CD AND
        A3.VEND_CD = 
            (
            SELECT
                MIN(H1.VEND_CD)
            FROM
                M_PUCH_UNIT_COST_H H1
            WHERE
                H1.COMPANY_CD = A5.COMPANY_CD AND
                H1.PLANT_CD = A1.PLANT_CD AND
                H1.ITEM_CD = A1.ITEM_CD AND
                H1.PUCH_PRIORITY_REF_NO = 
                (
                 SELECT
                        MIN(H2.PUCH_PRIORITY_REF_NO)
                    FROM
                        M_PUCH_UNIT_COST_H H2
                    WHERE
                        H2.COMPANY_CD = A5.COMPANY_CD AND
                        H2.PLANT_CD = A1.PLANT_CD AND
                        H2.ITEM_CD = A1.ITEM_CD
                    GROUP BY
                        H2.COMPANY_CD,
                        H2.PLANT_CD,
                        H2.ITEM_CD
                )
            GROUP BY
                H1.COMPANY_CD,
                H1.PLANT_CD,
                H1.ITEM_CD
            ) AND
        A3.CUR_CD = A4.CUR_CD(+)
    )   OD1,
    (
    SELECT
        A1.OD_NO                    OD_NO,
        NVL(A3.UNIT_COST, 0)        UNIT_COST,
        NVL(A3.UNIT_COST_TYP, 1)    UNIT_COST_TYP
    FROM
        T_OD A1 ,
        SYS_MY_COMPANY A2,
        M_PUCH_UNIT_COST A3
    WHERE 
        A1.ODR_STS_TYP IN (1,2) AND
        A1.OUTSIDE_TYP = 2 AND
        A1.OD_TYP <> 4 AND
        A2.CTRL_CD = 'SYSTEM' AND
        A3.COMPANY_CD = A2.COMPANY_CD AND
        A3.PLANT_CD = A1.PLANT_CD AND
        A3.ITEM_CD = A1.ITEM_CD AND 
        A3.VEND_CD = 
            (
            SELECT
                MIN(H1.VEND_CD)
            FROM
                M_PUCH_UNIT_COST_H H1
            WHERE
                H1.COMPANY_CD = A2.COMPANY_CD AND
                H1.PLANT_CD = A1.PLANT_CD AND
                H1.ITEM_CD = A1.ITEM_CD AND
                H1.PUCH_PRIORITY_REF_NO = 
                (
                 SELECT
                        MIN(H2.PUCH_PRIORITY_REF_NO)
                    FROM
                        M_PUCH_UNIT_COST_H H2
                    WHERE
                        H2.COMPANY_CD = A2.COMPANY_CD AND
                        H2.PLANT_CD = A1.PLANT_CD AND
                        H2.ITEM_CD = A1.ITEM_CD
                    GROUP BY
                        H2.COMPANY_CD,
                        H2.PLANT_CD,
                        H2.ITEM_CD
                )
            GROUP BY
                H1.COMPANY_CD,
                H1.PLANT_CD,
                H1.ITEM_CD
            ) AND
        A3.EFF_PHASE_IN_DATE = 
            (
            SELECT
                MAX(P2.EFF_PHASE_IN_DATE)
            FROM
                M_PUCH_UNIT_COST P2
            WHERE
                P2.COMPANY_CD = A2.COMPANY_CD AND
                P2.VEND_CD = A3.VEND_CD AND
                P2.PLANT_CD = A1.PLANT_CD AND
                P2.ITEM_CD = A1.ITEM_CD AND
                P2.EFF_PHASE_IN_DATE <= A1.PRD_START_DATE 
            GROUP BY
                P2.COMPANY_CD,
                P2.VEND_CD,
                P2.PLANT_CD,
                P2.ITEM_CD
            )
        AND
        A3.PUCH_SIZE =
            (
            SELECT
                MAX(P3.PUCH_SIZE)
            FROM
                M_PUCH_UNIT_COST P3
            WHERE
                P3.COMPANY_CD = A2.COMPANY_CD AND
                P3.VEND_CD = A3.VEND_CD AND
                P3.PLANT_CD = A1.PLANT_CD AND
                P3.ITEM_CD = A1.ITEM_CD AND
                P3.EFF_PHASE_IN_DATE =
                    (
                    SELECT
                        MAX(P4.EFF_PHASE_IN_DATE)
                    FROM
                        M_PUCH_UNIT_COST P4
                    WHERE
                        P4.COMPANY_CD = A2.COMPANY_CD AND
                        P4.VEND_CD =  A3.VEND_CD AND
                        P4.PLANT_CD = A1.PLANT_CD AND
                        P4.ITEM_CD = A1.ITEM_CD AND
                        P4.EFF_PHASE_IN_DATE <= A1.PRD_START_DATE 
                    GROUP BY
                        P4.COMPANY_CD,
                        P4.VEND_CD,
                        P4.PLANT_CD,
                        P4.ITEM_CD
                    )
                AND
                P3.PUCH_SIZE <= A1.ODR_QTY
            GROUP BY
                P3.COMPANY_CD,
                P3.VEND_CD,
                P3.PLANT_CD,
                P3.ITEM_CD
            )
    )   OD2
WHERE
    OD1.OD_NO = OD2.OD_NO(+) AND
    OD1.ROUND_TYP = 2
------
UNION ALL
------
SELECT 
    OD1.OD_NO                   OD_NO,              --オーダデマンド番号
    OD1.PLANT_CD                PLANT_CD,           --工場コード
    OD1.JOB_ODR_CD              JOB_ODR_CD,         --製番
    OD1.JOB_ODR_DETAIL_NO       JOB_ODR_DETAIL_NO,  --製番枝番
    OD1.ITEM_CD                 ITEM_CD,            --品目番号
    OD1.ITEM_NAME               ITEM_NAME,          --品名
    OD1.COMPANY_CD              COMPANY_CD,         --会社コード
    OD1.VEND_CD                 VEND_CD,            --取引先コード
    OD1.VEND_NAME               VEND_NAME,          --取引先名
    OD1.ODR_STS_TYP             ODR_STS_TYP,        --オーダ状態区分
    OD1.ODR_START_DATE          ODR_START_DATE,     --手配着手日
    OD1.PRD_DUE_DATE            PRD_DUE_DATE,       --製造納期
    OD1.PRD_START_DATE          PRD_START_DATE,     --製造着手日
    OD1.OD_TYP                  OD_TYP,             --オーダデマンド区分
    OD1.ODR_QTY                 ODR_QTY,            --オーダ数
    OD1.OUTSIDE_TYP             OUTSIDE_TYP,        --所要量内外作区分
    OD1.TOTAL_RCV_QTY           TOTAL_RCV_QTY,      --入庫累計数
    OD1.PUCH_ODR_QTY            PUCH_ODR_QTY,       --発注数
    NVL(OD2.UNIT_COST, 0)       UNIT_COST,          --単価
    NVL(OD2.UNIT_COST_TYP, 1)   UNIT_COST_TYP,      --単価区分
    OD1.ROUND_TYP               ROUND_TYP,          --発注金額まるめ区分
    TRUNC((OD1.PUCH_ODR_QTY * NVL(OD2.UNIT_COST,0)), OD1.DECIMAL_FIG)    PUCH_ODR_AMOUNT    --発注金額
FROM
    (
    SELECT
        A1.OD_NO                    OD_NO,
        A1.PLANT_CD                 PLANT_CD,
        A1.ITEM_CD                  ITEM_CD,
        A2.ITEM_NAME                ITEM_NAME,
        A5.COMPANY_CD               COMPANY_CD,
        A3.VEND_CD                  VEND_CD,
        A3.VEND_NAME                VEND_NAME,
        NVL(A3.ROUND_TYP, 1)        ROUND_TYP,
        NVL(A4.DECIMAL_FIG, 0)      DECIMAL_FIG,
        A1.JOB_ODR_CD               JOB_ODR_CD,
        A1.JOB_ODR_DETAIL_NO        JOB_ODR_DETAIL_NO,
        A1.ODR_STS_TYP              ODR_STS_TYP,
        A1.ODR_START_DATE           ODR_START_DATE,
        A1.PRD_DUE_DATE             PRD_DUE_DATE,
        A1.PRD_START_DATE           PRD_START_DATE,
        A1.OD_TYP                   OD_TYP,
        A1.ODR_QTY                  ODR_QTY,
        A1.OUTSIDE_TYP              OUTSIDE_TYP,
        A1.TOTAL_RCV_QTY            TOTAL_RCV_QTY,
        GREATEST((A1.ODR_QTY - A1.TOTAL_RCV_QTY), 0)    PUCH_ODR_QTY
    FROM
        T_OD            A1,
        M_ITEM          A2,
        M_VEND_CTRL     A3,
        M_CUR           A4,
        SYS_MY_COMPANY  A5
    WHERE
        A1.ODR_STS_TYP IN (1,2) AND
        A1.OUTSIDE_TYP = 2 AND
        A1.OD_TYP <> 4 AND
        A2.ITEM_CD = A1.ITEM_CD AND
        A5.CTRL_CD = 'SYSTEM' AND
        A3.COMPANY_CD = A5.COMPANY_CD AND
        A3.VEND_CD = 
            (
            SELECT
                MIN(H1.VEND_CD)
            FROM
                M_PUCH_UNIT_COST_H H1
            WHERE
                H1.COMPANY_CD = A5.COMPANY_CD AND
                H1.PLANT_CD = A1.PLANT_CD AND
                H1.ITEM_CD = A1.ITEM_CD AND
                H1.PUCH_PRIORITY_REF_NO = 
                (
                 SELECT
                        MIN(H2.PUCH_PRIORITY_REF_NO)
                    FROM
                        M_PUCH_UNIT_COST_H H2
                    WHERE
                        H2.COMPANY_CD = A5.COMPANY_CD AND
                        H2.PLANT_CD = A1.PLANT_CD AND
                        H2.ITEM_CD = A1.ITEM_CD
                    GROUP BY
                        H2.COMPANY_CD,
                        H2.PLANT_CD,
                        H2.ITEM_CD
                )
            GROUP BY
                H1.COMPANY_CD,
                H1.PLANT_CD,
                H1.ITEM_CD
            ) AND
        A3.CUR_CD = A4.CUR_CD(+)
    )   OD1,
    (
    SELECT
        A1.OD_NO                    OD_NO,
        NVL(A3.UNIT_COST, 0)        UNIT_COST,
        NVL(A3.UNIT_COST_TYP, 1)    UNIT_COST_TYP
    FROM
        T_OD A1 ,
        SYS_MY_COMPANY A2,
        M_PUCH_UNIT_COST A3
    WHERE 
        A1.ODR_STS_TYP IN (1,2) AND
        A1.OUTSIDE_TYP = 2 AND
        A1.OD_TYP <> 4 AND
        A2.CTRL_CD = 'SYSTEM' AND
        A3.COMPANY_CD = A2.COMPANY_CD AND
        A3.PLANT_CD = A1.PLANT_CD AND
        A3.ITEM_CD = A1.ITEM_CD AND 
        A3.VEND_CD = 
            (
            SELECT
                MIN(H1.VEND_CD)
            FROM
                M_PUCH_UNIT_COST_H H1
            WHERE
                H1.COMPANY_CD = A2.COMPANY_CD AND
                H1.PLANT_CD = A1.PLANT_CD AND
                H1.ITEM_CD = A1.ITEM_CD AND
                H1.PUCH_PRIORITY_REF_NO = 
                (
                 SELECT
                        MIN(H2.PUCH_PRIORITY_REF_NO)
                    FROM
                        M_PUCH_UNIT_COST_H H2
                    WHERE
                        H2.COMPANY_CD = A2.COMPANY_CD AND
                        H2.PLANT_CD = A1.PLANT_CD AND
                        H2.ITEM_CD = A1.ITEM_CD
                    GROUP BY
                        H2.COMPANY_CD,
                        H2.PLANT_CD,
                        H2.ITEM_CD
                )
            GROUP BY
                H1.COMPANY_CD,
                H1.PLANT_CD,
                H1.ITEM_CD
            ) AND
        A3.EFF_PHASE_IN_DATE = 
            (
            SELECT
                MAX(P2.EFF_PHASE_IN_DATE)
            FROM
                M_PUCH_UNIT_COST P2
            WHERE
                P2.COMPANY_CD = A2.COMPANY_CD AND
                P2.VEND_CD = A3.VEND_CD AND
                P2.PLANT_CD = A1.PLANT_CD AND
                P2.ITEM_CD = A1.ITEM_CD AND
                P2.EFF_PHASE_IN_DATE <= A1.PRD_START_DATE 
            GROUP BY
                P2.COMPANY_CD,
                P2.VEND_CD,
                P2.PLANT_CD,
                P2.ITEM_CD
            )
        AND
        A3.PUCH_SIZE =
            (
            SELECT
                MAX(P3.PUCH_SIZE)
            FROM
                M_PUCH_UNIT_COST P3
            WHERE
                P3.COMPANY_CD = A2.COMPANY_CD AND
                P3.VEND_CD = A3.VEND_CD AND
                P3.PLANT_CD = A1.PLANT_CD AND
                P3.ITEM_CD = A1.ITEM_CD AND
                P3.EFF_PHASE_IN_DATE =
                    (
                    SELECT
                        MAX(P4.EFF_PHASE_IN_DATE)
                    FROM
                        M_PUCH_UNIT_COST P4
                    WHERE
                        P4.COMPANY_CD = A2.COMPANY_CD AND
                        P4.VEND_CD =  A3.VEND_CD AND
                        P4.PLANT_CD = A1.PLANT_CD AND
                        P4.ITEM_CD = A1.ITEM_CD AND
                        P4.EFF_PHASE_IN_DATE <= A1.PRD_START_DATE 
                    GROUP BY
                        P4.COMPANY_CD,
                        P4.VEND_CD,
                        P4.PLANT_CD,
                        P4.ITEM_CD
                    )
                AND
                P3.PUCH_SIZE <= A1.ODR_QTY
            GROUP BY
                P3.COMPANY_CD,
                P3.VEND_CD,
                P3.PLANT_CD,
                P3.ITEM_CD
            )
    )   OD2
WHERE
    OD1.OD_NO = OD2.OD_NO(+) AND
    OD1.ROUND_TYP = 3
------
UNION ALL
------
SELECT
    A1.OD_NO                    OD_NO,
    A1.PLANT_CD                 PLANT_CD,
    A1.JOB_ODR_CD               JOB_ODR_CD,
    A1.JOB_ODR_DETAIL_NO        JOB_ODR_DETAIL_NO,
    A1.ITEM_CD                  ITEM_CD,
    A2.ITEM_NAME                ITEM_NAME,
    A3.COMPANY_CD               COMPANY_CD,
    NULL                        VEND_CD,
    NULL                        VEND_NAME,
    A1.ODR_STS_TYP              ODR_STS_TYP,
    A1.ODR_START_DATE           ODR_START_DATE,
    A1.PRD_DUE_DATE             PRD_DUE_DATE,
    A1.PRD_START_DATE           PRD_START_DATE,
    A1.OD_TYP                   OD_TYP,
    A1.ODR_QTY                  ODR_QTY,
    A1.OUTSIDE_TYP              OUTSIDE_TYP,
    A1.TOTAL_RCV_QTY            TOTAL_RCV_QTY,
    GREATEST((A1.ODR_QTY - A1.TOTAL_RCV_QTY), 0)    PUCH_ODR_QTY,
    0                           UNIT_COST,
    1                           UNIT_COST_TYP,
    1                           ROUND_TYP,
    0                           PUCH_ODR_AMOUNT
FROM
    T_OD            A1,
    M_ITEM          A2,
    SYS_MY_COMPANY  A3,
    M_PUCH_UNIT_COST_H  A4
WHERE
    A1.ODR_STS_TYP IN (1,2) AND
    A1.OUTSIDE_TYP = 2 AND
    A1.OD_TYP <> 4 AND
    A1.PLANT_CD = A4.PLANT_CD(+) AND
    A1.ITEM_CD = A4.ITEM_CD(+) AND
    A4.VEND_CD IS NULL AND
    A3.CTRL_CD = 'SYSTEM' AND
    A2.ITEM_CD = A1.ITEM_CD
)
/
