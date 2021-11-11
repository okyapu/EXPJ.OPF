CREATE OR REPLACE VIEW V_PROJECE_ESTIMATE
AS
SELECT
  A."PROJECT_CD",                        --案件番号
  A."PROJECT_NAME",                      --案件名
  A."CUST_CD",                           --得意先コード
  B."CUST_NAME",                         --得意先名
  A."DLV_LOC_CD",                        --納品場所コード
  J."DLV_LOC_NAME",                      --納品場所名
  A."ACCURACY",                          --確度
  A."PROJECT_STAT",                      --案件ステータス
  A."VEND_DATE",                         --引合日
  A."ASSUME_DLV_DATE",                   --想定納期
  A."ASSUME_AMOUNT",                     --引合想定金額
  B."CUR_CD",                            --通貨コード
  F."CUR_UNIT",                          --通貨単位
  A."ASSUME_AMOUNT_EXCH_RATES",          --引合想定金額(邦貨)
  A."PJ_ORG_CD",                         --案件担当部門コード
  C1."ORG_NAME" AS ORG_NAME_1,           --案件担当部門名
  A."PJ_USER_CD",                        --案件担当者コード
  D1."USER_NAME" AS USER_NAME_1 ,        --案件担当者名
  A."REMARKS1",                          --案件備考1
  A."REMARKS2",                          --案件備考2
  A."REMARKS3",                          --案件備考3
  A."REMARKS4",                          --案件備考4
  A."REMARKS5",                          --案件備考5
  M."ESTIMATE_NO",                       --見積番号
  M."ESTIMATE_STAT",                     --見積ステータス
  M."ESTIMATE_DATE",                     --見積日
  M."ES_COMMET1",                        --指定納期コメント
  M."ES_COMMET2",                        --納品場所コメント
  M."ES_COMMET3",                        --荷造運送費コメント
  M."ES_COMMET4",                        --お支払条件コメント
  M."ES_COMMET5",                        --見積有効期限コメント
  M."ES_ORG_CD",                         --見積担当部門コード
  M."ORG_NAME" AS ORG_NAME_2,            --見積担当部門名
  M."ES_USER_CD",                        --見積担当者コード
  M."USER_NAME" AS USER_NAME_2,          --見積担当者名
  M."ESTIMATE_AMOUNT",                   --見積金額合計
  M."ESTIMATE_AMOUNT_JPN",               --見積金額合計(邦貨)
  M."ESREMARK1",                         --見積備考1
  M."ESREMARK2",                         --見積備考2
  M."ESREMARK3"                          --見積備考3
FROM
  T_PROJECT A,                                              --案件
  M_CUST B,                                                 --得意先マスタ
  (SELECT
      C2."ORG_NAME",
      D2."USER_NAME",
      TT."PROJECT_CD",
      TT."DEL_FLG",
      TT."ESTIMATE_NO",
      TT."ESTIMATE_STAT",
      TT."ESTIMATE_DATE",
      TT."ES_COMMET1",
      TT."ES_COMMET2",
      TT."ES_COMMET3",
      TT."ES_COMMET4",
      TT."ES_COMMET5",
      TT."ES_ORG_CD",
      TT."ES_USER_CD",
      TT."ESTIMATE_AMOUNT",
      TT."ESTIMATE_AMOUNT_JPN",
      TT."ESREMARK1",
      TT."ESREMARK2",
      TT."ESREMARK3"
   FROM
      T_ESTIMATE TT,                                -- 見積
      USER_MST D2,                                  -- ユーザマスタ
      (SELECT
          C3."ORG_CD",C3."ORG_NAME"                 --  部門コードと部門名
       FROM 
          M_ORG C3,                                 -- 部門
          SYS_MY_COMPANY S3                         -- 自社
       WHERE
          (S3."CTRL_CD" = 'SYSTEM' AND C3."COMPANY_CD" = S3."COMPANY_CD" )
      )  C2                                         -- 部門マスタ（見積担当用抽出済み）
   WHERE
      (TT."ES_USER_CD" = D2."USER_CD" (+))          -- 見積担当者コード
       AND (TT."ES_ORG_CD"  = C2."ORG_CD"  (+))     -- 見積担当部門コード
      )  M,                                         -- 見積
  (SELECT
      C4."ORG_CD",C4."ORG_NAME"     -- 部門コードと部門名
   FROM 
      M_ORG C4,                     -- 部門
      SYS_MY_COMPANY S4             -- 自社
  WHERE
      (S4."CTRL_CD" = 'SYSTEM' AND C4."COMPANY_CD" = S4."COMPANY_CD")
   )  C1,                           -- 部門マスタ（案件担当用抽出済み
   (SELECT
       C4."DLV_LOC_CD",C4."DLV_LOC_NAME",C4."CUST_CD"    --  納品場所コード、納品場所名、得意先コード
    FROM 
       M_CUST_BASE C4,              -- 得意先納品場所
       SYS_MY_COMPANY S4            -- 自社
    WHERE
       (S4."CTRL_CD" = 'SYSTEM' AND C4."COMPANY_CD" = S4."COMPANY_CD")
   ) J,                                                     --得意先納品場所
  USER_MST D1,                                              --ユーザマスタ
  M_CUR F,                                                  --通貨
  SYS_MY_COMPANY H                                          --自社
WHERE
   (A."DEL_FLG" = '0')
   AND (H."CTRL_CD" = 'SYSTEM')                                         -- 自社の取得
   AND (A."CUST_CD" = B."CUST_CD" AND B."COMPANY_CD" = H."COMPANY_CD")  -- 得意先との結合（得意先コード（案件の得意先コードは必須））
   AND (A."PROJECT_CD" = M."PROJECT_CD"(+))                             -- 見積との結合
   AND (B."CUR_CD" = F."CUR_CD")                                        -- 通貨の結合
   AND (A."PJ_ORG_CD"  = C1."ORG_CD" (+))                               -- 案件担当部門コードの案件との結合（必須入力でない）
   AND (A."PJ_USER_CD" = D1."USER_CD"(+))                               -- 案件担当者コード（必須入力でない）
   AND A."DLV_LOC_CD" = J."DLV_LOC_CD"(+)
   AND A."CUST_CD" = J."CUST_CD"(+)
/
