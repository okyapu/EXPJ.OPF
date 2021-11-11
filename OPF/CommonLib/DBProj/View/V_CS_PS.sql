CREATE OR REPLACE VIEW V_CS_PS
    (PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR,
    EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_SPOIL,CONS_TYP,PS_LT_FLG,PS_FIXED_LT,
    PS_PROP_LT,PS_PROP_LOT_SIZE,PS_REF_NO,COST_UP_TYP,MRP_EXP_TYP,CREATED_DATE,
    CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT)
AS
SELECT
    T.PARENT_ITEM_CD,
    T.COMP_ITEM_CD,
    T.PS_EDITION,
    T.PS_UNIT_DENOMINATOR,
    T.PS_UNIT_NUMERATOR,
    T.EFF_PHASE_IN_DATE,
    T.EFF_PHASE_OUT_DATE,
    T.PS_SPOIL,
    T.CONS_TYP,
    T.PS_LT_FLG,
    T.PS_FIXED_LT,
    T.PS_PROP_LT,
    T.PS_PROP_LOT_SIZE,
    T.PS_REF_NO,
    T.COST_UP_TYP,
    T.MRP_EXP_TYP,
    T.CREATED_DATE,
    T.CREATED_BY,
    T.CREATED_PRG_NM,
    T.UPDATED_DATE,
    T.UPDATED_BY,
    T.UPDATED_PRG_NM,
    T.MODIFY_COUNT
FROM
    (SELECT
       PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION,PS_UNIT_DENOMINATOR,PS_UNIT_NUMERATOR,
       EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_SPOIL,CONS_TYP,PS_LT_FLG,PS_FIXED_LT,
       PS_PROP_LT,PS_PROP_LOT_SIZE,PS_REF_NO,COST_UP_TYP,MRP_EXP_TYP,CREATED_DATE,
       CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT,
       RANK() OVER(PARTITION BY PARENT_ITEM_CD,COMP_ITEM_CD ORDER BY PS_EDITION DESC) AS  RANK_PS_EDITION
     FROM M_PS
     ) T  --製品構成版数が最大の製品構成Ｍ
WHERE  RANK_PS_EDITION=1

/
COMMENT ON TABLE V_CS_PS IS '原価対象製品構成抽出ビュー'
/
COMMENT ON COLUMN V_CS_PS.PARENT_ITEM_CD IS '親品目番号'
/
COMMENT ON COLUMN V_CS_PS.COMP_ITEM_CD IS '子品目番号'
/
COMMENT ON COLUMN V_CS_PS.PS_EDITION IS '製品構成版数'
/
COMMENT ON COLUMN V_CS_PS.PS_UNIT_DENOMINATOR IS '製品構成単位数分母'
/
COMMENT ON COLUMN V_CS_PS.PS_UNIT_NUMERATOR IS '製品構成単位数分子'
/
COMMENT ON COLUMN V_CS_PS.EFF_PHASE_IN_DATE IS '製品構成有効開始日'
/
COMMENT ON COLUMN V_CS_PS.EFF_PHASE_OUT_DATE IS '製品構成有効終了日'
/
COMMENT ON COLUMN V_CS_PS.PS_SPOIL IS '構成仕損率'
/
COMMENT ON COLUMN V_CS_PS.CONS_TYP IS '支給区分（未使用）'
/
COMMENT ON COLUMN V_CS_PS.PS_LT_FLG IS '製品構成リードタイム使用フラグ'
/
COMMENT ON COLUMN V_CS_PS.PS_FIXED_LT IS '製品構成固定分リードタイム'
/
COMMENT ON COLUMN V_CS_PS.PS_PROP_LT IS '製品構成比例分リードタイム'
/
COMMENT ON COLUMN V_CS_PS.PS_PROP_LOT_SIZE IS '製品構成比例分ロットサイズ'
/
COMMENT ON COLUMN V_CS_PS.PS_REF_NO IS '製品構成照会キー'
/
COMMENT ON COLUMN V_CS_PS.COST_UP_TYP IS '原価積上区分'
/
COMMENT ON COLUMN V_CS_PS.MRP_EXP_TYP IS '所要量展開区分'
/
COMMENT ON COLUMN V_CS_PS.CREATED_DATE IS '作成日'
/
COMMENT ON COLUMN V_CS_PS.CREATED_BY IS '作成者'
/
COMMENT ON COLUMN V_CS_PS.CREATED_PRG_NM IS '作成プログラム'
/
COMMENT ON COLUMN V_CS_PS.UPDATED_DATE IS '更新日'
/
COMMENT ON COLUMN V_CS_PS.UPDATED_BY IS '更新者'
/
COMMENT ON COLUMN V_CS_PS.UPDATED_PRG_NM IS '更新プログラム'
/
COMMENT ON COLUMN V_CS_PS.MODIFY_COUNT IS '更新数'
/
