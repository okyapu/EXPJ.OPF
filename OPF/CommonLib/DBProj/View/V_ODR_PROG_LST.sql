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
    O.OD_NO,                         --�I�[�_�f�}���h�ԍ�
    O.PLANT_CD,                      --�H��R�[�h
    O.ODR_STS_TYP,                   --�I�[�_��ԋ敪
    O.ITEM_CD,                       --�i�ڔԍ�
    I.ITEM_NAME,                     --�i�ږ�
    O.MRP_ODR_TYP,                   --�i�ڎ�z�敪
    O.ODR_START_DATE,                --��z�����
    O.PRD_START_DATE,                --���������
    O.PRD_DUE_DATE,                  --�����[��
    O.OD_GNR_TYP,                    --���v�ʔ��������敪
    O.ODR_QTY,                       --�v�搔
    O.TOTAL_RCV_QTY,                 --���ѐ�
    O.RCV_CMPLT_DATE,                --�������ѓ�
    O.JOB_ODR_CD,                    --����
    O.JOB_ODR_CANCEL_NO,             --���Ԏ�������ԍ�
    J.JOB_ODR_TYP,                   --���Ԏ��
    O.ALC_GRP_CD,                    --�����O���[�v�R�[�h
    O.EXTERNAL_DM_FLG,               --�O���f�}���h�t���O(0:�����f�}���h�@1:�O���f�}���h)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --�O���f�}���h�ԍ�
    O.MRP_TYP,                       --���v�ʏ����敪
    O.OUTSIDE_TYP,                   --���v�ʓ��O��敪
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --�I�[�_�f�}���h�ԍ��������c�ɑ��݂��郌�R�[�h��
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --�I�[�_�f�}���h�ԍ����i�ڕʎd�|�ɑ��݂��郌�R�[�h��
    O.OD_TYP,                        --�I�[�_�f�}���h�敪
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --�i�ڕʍ�Ǝ��ы敪
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --���ɏ�ԋ敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --�i�ڎ�z�敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --���Ԏ�ʂ̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --���v�ʔ��������敪�̕\������
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
    O.OD_NO,                         --�I�[�_�f�}���h�ԍ�
    O.PLANT_CD,                      --�H��R�[�h
    O.ODR_STS_TYP,                   --�I�[�_��ԋ敪
    O.ITEM_CD,                       --�i�ڔԍ�
    I.ITEM_NAME,                     --�i�ږ�
    O.MRP_ODR_TYP,                   --�i�ڎ�z�敪
    O.ODR_START_DATE,                --��z�����
    O.PRD_START_DATE,                --���������
    O.PRD_DUE_DATE,                  --�����[��
    O.OD_GNR_TYP,                    --���v�ʔ��������敪
    O.ODR_QTY,                       --�v�搔
    O.TOTAL_RCV_QTY,                 --���ѐ�
    O.RCV_CMPLT_DATE,                --�������ѓ�
    O.JOB_ODR_CD,                    --����
    O.JOB_ODR_CANCEL_NO,             --���Ԏ�������ԍ�
    J.JOB_ODR_TYP,                   --���Ԏ��
    O.ALC_GRP_CD,                    --�����O���[�v�R�[�h
    O.EXTERNAL_DM_FLG,               --�O���f�}���h�t���O(0:�����f�}���h�@1:�O���f�}���h)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --�O���f�}���h�ԍ�
    O.MRP_TYP,                       --���v�ʏ����敪
    O.OUTSIDE_TYP,                   --���v�ʓ��O��敪
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --�I�[�_�f�}���h�ԍ��������c�ɑ��݂��郌�R�[�h��
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --�I�[�_�f�}���h�ԍ����i�ڕʎd�|�ɑ��݂��郌�R�[�h��
    O.OD_TYP,                        --�I�[�_�f�}���h�敪
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --�i�ڕʍ�Ǝ��ы敪
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --���ɏ�ԋ敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --�i�ڎ�z�敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --���Ԏ�ʂ̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --���v�ʔ��������敪�̕\������
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
    O.OD_NO,                         --�I�[�_�f�}���h�ԍ�
    O.PLANT_CD,                      --�H��R�[�h
    O.ODR_STS_TYP,                   --�I�[�_��ԋ敪
    O.ITEM_CD,                       --�i�ڔԍ�
    I.ITEM_NAME,                     --�i�ږ�
    O.MRP_ODR_TYP,                   --�i�ڎ�z�敪
    O.ODR_START_DATE,                --��z�����
    O.PRD_START_DATE,                --���������
    O.PRD_DUE_DATE,                  --�����[��
    O.OD_GNR_TYP,                    --���v�ʔ��������敪
    O.ODR_QTY,                       --�v�搔
    O.TOTAL_RCV_QTY,                 --���ѐ�
    O.RCV_CMPLT_DATE,                --�������ѓ�
    O.JOB_ODR_CD,                    --����
    O.JOB_ODR_CANCEL_NO,             --���Ԏ�������ԍ�
    J.JOB_ODR_TYP,                   --���Ԏ��
    O.ALC_GRP_CD,                    --�����O���[�v�R�[�h
    O.EXTERNAL_DM_FLG,               --�O���f�}���h�t���O(0:�����f�}���h�@1:�O���f�}���h)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --�O���f�}���h�ԍ�
    O.MRP_TYP,                       --���v�ʏ����敪
    O.OUTSIDE_TYP,                   --���v�ʓ��O��敪
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --�I�[�_�f�}���h�ԍ��������c�ɑ��݂��郌�R�[�h��
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --�I�[�_�f�}���h�ԍ����i�ڕʎd�|�ɑ��݂��郌�R�[�h��
    O.OD_TYP,                        --�I�[�_�f�}���h�敪
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --�i�ڕʍ�Ǝ��ы敪
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --���ɏ�ԋ敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --�i�ڎ�z�敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --���Ԏ�ʂ̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --���v�ʔ��������敪�̕\������
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
    O.OD_NO,                         --�I�[�_�f�}���h�ԍ�
    O.PLANT_CD,                      --�H��R�[�h
    O.ODR_STS_TYP,                   --�I�[�_��ԋ敪
    O.ITEM_CD,                       --�i�ڔԍ�
    I.ITEM_NAME,                     --�i�ږ�
    O.MRP_ODR_TYP,                   --�i�ڎ�z�敪
    O.ODR_START_DATE,                --��z�����
    O.PRD_START_DATE,                --���������
    O.PRD_DUE_DATE,                  --�����[��
    O.OD_GNR_TYP,                    --���v�ʔ��������敪
    O.ODR_QTY,                       --�v�搔
    O.TOTAL_RCV_QTY,                 --���ѐ�
    O.RCV_CMPLT_DATE,                --�������ѓ�
    O.JOB_ODR_CD,                    --����
    O.JOB_ODR_CANCEL_NO,             --���Ԏ�������ԍ�
    J.JOB_ODR_TYP,                   --���Ԏ��
    O.ALC_GRP_CD,                    --�����O���[�v�R�[�h
    O.EXTERNAL_DM_FLG,               --�O���f�}���h�t���O(0:�����f�}���h�@1:�O���f�}���h)
    (SELECT E.EXTERNAL_PLAN_CD
        FROM T_EXTERNAL_PLAN E
       WHERE E.OD_NO(+) = O.OD_NO
       AND E.PLANT_CD(+) = O.PLANT_CD
       AND O.EXTERNAL_DM_FLG = 1
    )  EXTERNAL_PLAN_CD,             --�O���f�}���h�ԍ�
    O.MRP_TYP,                       --���v�ʏ����敪
    O.OUTSIDE_TYP,                   --���v�ʓ��O��敪
    (SELECT COUNT(*)
     FROM T_RLSD_PUCH_ODR P
     WHERE P.OD_NO = O.OD_NO
     AND P.PLANT_CD = O.PLANT_CD
    ) RLSD_PUCH_ODR_QTY,             --�I�[�_�f�}���h�ԍ��������c�ɑ��݂��郌�R�[�h��
    (SELECT COUNT(*)
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
    ) WORK_IN_PROC_QTY,              --�I�[�_�f�}���h�ԍ����i�ڕʎd�|�ɑ��݂��郌�R�[�h��
    O.OD_TYP,                        --�I�[�_�f�}���h�敪
    (SELECT OPR_RSLT_TYP
     FROM T_WORK_IN_PROC_BY_ITEM W
     WHERE W.OD_NO = O.OD_NO
     AND W.PLANT_CD = O.PLANT_CD
     GROUP BY OPR_RSLT_TYP
    ) OPR_RSLT_TYP,                  --�i�ڕʍ�Ǝ��ы敪
    (SELECT
      DISPLAY_NAME
    FROM
      SYS_TYPE_VALUE
    WHERE
      NAME = 'ODR_STS_TYP'
      AND VALUE = O.ODR_STS_TYP
    ) ODR_STS_TYP_DISPLAY_NAME,      --���ɏ�ԋ敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'MRP_ODR_TYP'
        AND VALUE = O.MRP_ODR_TYP
    ) MRP_ODR_TYP_DISPLAY_NAME,      --�i�ڎ�z�敪�̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'JOB_ODR_TYP'
        AND VALUE = J.JOB_ODR_TYP
    ) JOB_ODR_TYP_DISPLAY_NAME,      --���Ԏ�ʂ̕\������
    (SELECT
        DISPLAY_NAME
    FROM
        SYS_TYPE_VALUE
    WHERE
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --���v�ʔ��������敪�̕\������
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
