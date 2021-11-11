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
    O.OD_NO,                         --�I�[�_�f�}���h�ԍ�
    O.PLANT_CD,                      --�H��R�[�h
    O.PARENT_OD_NO,                  --�e�I�[�_�f�}���h�ԍ�
    O.JOB_ODR_CD,                    --����
    O.JOB_ODR_CANCEL_NO,             --���Ԏ�������ԍ�
    O.ODR_STS_TYP,                   --�I�[�_��ԋ敪
    O.DM_STS_TYP,                    --�f�}���h��ԋ敪
    O.ITEM_CD,                       --�i�ڔԍ�
    I.ITEM_NAME,                     --�i�ږ�
    O.MRP_ODR_TYP,                   --�i�ڎ�z�敪
    O.ODR_START_DATE,                --��z�����
    O.PRD_START_DATE,                --���������
    O.PRD_DUE_DATE,                  --�����[��
    O.DUE_DATE,                      --�v���[��
    O.ODR_QTY,                       --���ɗ\�萔�i�I�[�_���j
    O.TOTAL_RCV_QTY,                 --���Ɏ��ѐ��i���ɗ݌v���j
    O.RCV_CMPLT_DATE,                --���Ɋ������ѓ��i���Ɋ������j
    O.DM_QTY,                        --�o�ɗ\�萔�i�f�}���h���j
    O.TOTAL_ISSUE_QTY,               --�o�Ɏ��ѐ��i�o�ɗ݌v���j
    O.ISSUE_CMPLT_DATE,              --�o�Ɋ������ѓ��i�o�Ɋ������j
    (SELECT SUM(ALCD_QTY)
        FROM
            T_JOB_ODR_ALC A
        WHERE
            A.OD_NO = O.OD_NO
    ) AS ALCD_QTY,                   --�����ςݐ�
    O.OD_GNR_TYP,                    --���v�ʔ��������敪
    O.EXTERNAL_DM_FLG,               --�O���f�}���h�t���O(0:�����f�}���h�@1:�O���f�}���h)
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
      NAME = 'DM_STS_TYP'
      AND VALUE = O.DM_STS_TYP
    ) DM_STS_TYP_DISPLAY_NAME,       --�o�ɏ�ԋ敪�̕\������
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
        NAME = 'OD_GNR_TYP'
        AND VALUE = O.OD_GNR_TYP
    ) OD_GNR_TYP_DISPLAY_NAME,        --���v�ʔ��������敪�̕\������
    (SELECT
        BUSINESS_OPR_DATE
    FROM
        SYS_DATE_CTRL
    WHERE
        PLANT_CD = o.PLANT_CD
    ) BUSINESS_OPR_DATE,
    I.STOCK_UNIT                     --�v�ʒP��
FROM
    T_OD O,
    M_ITEM I
WHERE
    O.ITEM_CD = I.ITEM_CD(+)
/
