CREATE OR REPLACE VIEW M_PLANT_PS (
     PARENT_PLANT_CD
    ,PARENT_ITEM_CD
    ,COMP_PLANT_CD
    ,COMP_ITEM_CD
    ,PS_EDITION
    ,PS_UNIT_DENOMINATOR
    ,PS_UNIT_NUMERATOR
    ,EFF_PHASE_IN_DATE
    ,RELEASE_POINT_TYP
    ,EFF_PHASE_OUT_DATE
    ,DISABLED_POINT_TYP
    ,PS_SPOIL
    ,FIXED_DISPOSAL_QTY
    ,CONS_TYP
    ,READ_TIME_OFFSET
    ,READ_TIME_OFFSET_MIN
    ,START_POINT_TYP
    ,PS_REF_NO
    ,COST_UP_TYP
    ,EXP_TYP
    ,EXP_PATTERN
    ,ORDERING_TYP
    ,PS_RESERVE_FIELD
    ,INTERNAL_SEQ_NO
    ,GROUP_COST_UP_TYP
    ,CREATED_DATE
    ,CREATED_BY
    ,CREATED_PRG_NM
    ,UPDATED_DATE
    ,UPDATED_BY
    ,UPDATED_PRG_NM
    ,MODIFY_COUNT
) AS
SELECT   MP.PLANT_CD                       AS  PARENT_PLANT_CD
        ,MPS.PARENT_ITEM_CD                AS  PARENT_ITEM_CD
        ,MP.PLANT_CD                       AS  COMP_PLANT_CD
        ,MPS.COMP_ITEM_CD                  AS  COMP_ITEM_CD
        ,MPS.PS_EDITION                    AS  PS_EDITION
        ,NVL(MPS.PS_UNIT_DENOMINATOR, 1)   AS  PS_UNIT_DENOMINATOR
        ,NVL(MPS.PS_UNIT_NUMERATOR, 0)     AS  PS_UNIT_NUMERATOR
        ,MPS.EFF_PHASE_IN_DATE             AS  EFF_PHASE_IN_DATE
        ,3                                 AS  RELEASE_POINT_TYP
        ,MPS.EFF_PHASE_OUT_DATE            AS  EFF_PHASE_OUT_DATE
        ,3                                 AS  DISABLED_POINT_TYP
        ,NVL(MPS.PS_SPOIL, 0)              AS  PS_SPOIL
        ,0                                 AS  FIXED_DISPOSAL_QTY
        ,NVL(MPS.CONS_TYP, 0)              AS  CONS_TYP
        ,0                                 AS  READ_TIME_OFFSET
        ,0                                 AS  READ_TIME_OFFSET_MIN
        ,3                                 AS  START_POINT_TYP
        ,NVL(MPS.PS_REF_NO, 0)             AS  PS_REF_NO
        ,NVL(MPS.COST_UP_TYP, 0)           AS  COST_UP_TYP
        ,1                                 AS  EXP_TYP
        ,''                                AS  EXP_PATTERN
        ,0                                 AS  ORDERING_TYP
        ,''                                AS  PS_RESERVE_FIELD
        ,ROWNUM                            AS  INTERNAL_SEQ_NO
        ,0                                 AS  GROUP_COST_UP_TYP
        ,MPS.CREATED_DATE                  AS  CREATED_DATE
        ,MPS.CREATED_BY                    AS  CREATED_BY
        ,MPS.CREATED_PRG_NM                AS  CREATED_PRG_NM
        ,MPS.UPDATED_DATE                  AS  UPDATED_DATE
        ,MPS.UPDATED_BY                    AS  UPDATED_BY
        ,MPS.UPDATED_PRG_NM                AS  UPDATED_PRG_NM
        ,MPS.MODIFY_COUNT                  AS  MODIFY_COUNT
FROM    M_PS MPS
       ,M_PLANT MP
/
COMMENT ON TABLE M_PLANT_PS            IS '�}���`�v�����g���i�\���}�X�^�r���['
/
COMMENT ON COLUMN M_PLANT_PS.PARENT_PLANT_CD      IS '�e�H��R�[�h'
/
COMMENT ON COLUMN M_PLANT_PS.PARENT_ITEM_CD       IS '�e�i�ڔԍ�'
/
COMMENT ON COLUMN M_PLANT_PS.COMP_PLANT_CD        IS '�q�H��R�[�h'
/
COMMENT ON COLUMN M_PLANT_PS.COMP_ITEM_CD         IS '�q�i�ڔԍ�'
/
COMMENT ON COLUMN M_PLANT_PS.PS_EDITION           IS '���i�\���Ő�'
/
COMMENT ON COLUMN M_PLANT_PS.PS_UNIT_DENOMINATOR  IS '���i�\���P�ʐ�����'
/
COMMENT ON COLUMN M_PLANT_PS.PS_UNIT_NUMERATOR    IS '���i�\���P�ʐ����q'
/
COMMENT ON COLUMN M_PLANT_PS.EFF_PHASE_IN_DATE    IS '���i�\���L���J�n��'
/
COMMENT ON COLUMN M_PLANT_PS.RELEASE_POINT_TYP    IS '�����|�C���g'
/
COMMENT ON COLUMN M_PLANT_PS.EFF_PHASE_OUT_DATE   IS '���i�\���L���I����'
/
COMMENT ON COLUMN M_PLANT_PS.DISABLED_POINT_TYP   IS '�����|�C���g'
/
COMMENT ON COLUMN M_PLANT_PS.PS_SPOIL             IS '�\���d����'
/
COMMENT ON COLUMN M_PLANT_PS.FIXED_DISPOSAL_QTY   IS '�Œ�p������'
/
COMMENT ON COLUMN M_PLANT_PS.CONS_TYP             IS '�x���敪'
/
COMMENT ON COLUMN M_PLANT_PS.READ_TIME_OFFSET     IS '�G���g���[���[�h�^�C��'
/
COMMENT ON COLUMN M_PLANT_PS.READ_TIME_OFFSET_MIN IS '�G���g���[���[�h�^�C���i���ԁj'
/
COMMENT ON COLUMN M_PLANT_PS.START_POINT_TYP      IS '�N�_�|�C���g'
/
COMMENT ON COLUMN M_PLANT_PS.PS_REF_NO            IS '���i�\���Ɖ�L�['
/
COMMENT ON COLUMN M_PLANT_PS.COST_UP_TYP          IS '�����Ϗ�敪'
/
COMMENT ON COLUMN M_PLANT_PS.EXP_TYP              IS '�W�J�敪'
/
COMMENT ON COLUMN M_PLANT_PS.EXP_PATTERN          IS '�W�J�p�^�[��'
/
COMMENT ON COLUMN M_PLANT_PS.ORDERING_TYP         IS '�ʌ���z�敪'
/
COMMENT ON COLUMN M_PLANT_PS.PS_RESERVE_FIELD     IS '�\���\���t�B�[���h'
/
COMMENT ON COLUMN M_PLANT_PS.INTERNAL_SEQ_NO      IS '�����A��'
/
COMMENT ON COLUMN M_PLANT_PS.GROUP_COST_UP_TYP    IS '�O���[�v�����Ϗ�敪'
/
COMMENT ON COLUMN M_PLANT_PS.CREATED_DATE         IS  '�쐬��'
/
COMMENT ON COLUMN M_PLANT_PS.CREATED_BY           IS  '�쐬��'
/
COMMENT ON COLUMN M_PLANT_PS.CREATED_PRG_NM       IS  '�쐬�v���O������'
/
COMMENT ON COLUMN M_PLANT_PS.UPDATED_DATE         IS  '�X�V��'
/
COMMENT ON COLUMN M_PLANT_PS.UPDATED_BY           IS  '�X�V��'
/
COMMENT ON COLUMN M_PLANT_PS.UPDATED_PRG_NM       IS  '�X�V�v���O������'
/
COMMENT ON COLUMN M_PLANT_PS.MODIFY_COUNT         IS  '�X�V��'
/

