CREATE OR REPLACE VIEW V_PROJECE_ESTIMATE
AS
SELECT
  A."PROJECT_CD",                        --�Č��ԍ�
  A."PROJECT_NAME",                      --�Č���
  A."CUST_CD",                           --���Ӑ�R�[�h
  B."CUST_NAME",                         --���Ӑ於
  A."DLV_LOC_CD",                        --�[�i�ꏊ�R�[�h
  J."DLV_LOC_NAME",                      --�[�i�ꏊ��
  A."ACCURACY",                          --�m�x
  A."PROJECT_STAT",                      --�Č��X�e�[�^�X
  A."VEND_DATE",                         --������
  A."ASSUME_DLV_DATE",                   --�z��[��
  A."ASSUME_AMOUNT",                     --�����z����z
  B."CUR_CD",                            --�ʉ݃R�[�h
  F."CUR_UNIT",                          --�ʉݒP��
  A."ASSUME_AMOUNT_EXCH_RATES",          --�����z����z(�M��)
  A."PJ_ORG_CD",                         --�Č��S������R�[�h
  C1."ORG_NAME" AS ORG_NAME_1,           --�Č��S�����喼
  A."PJ_USER_CD",                        --�Č��S���҃R�[�h
  D1."USER_NAME" AS USER_NAME_1 ,        --�Č��S���Җ�
  A."REMARKS1",                          --�Č����l1
  A."REMARKS2",                          --�Č����l2
  A."REMARKS3",                          --�Č����l3
  A."REMARKS4",                          --�Č����l4
  A."REMARKS5",                          --�Č����l5
  M."ESTIMATE_NO",                       --���ϔԍ�
  M."ESTIMATE_STAT",                     --���σX�e�[�^�X
  M."ESTIMATE_DATE",                     --���ϓ�
  M."ES_COMMET1",                        --�w��[���R�����g
  M."ES_COMMET2",                        --�[�i�ꏊ�R�����g
  M."ES_COMMET3",                        --�ב��^����R�����g
  M."ES_COMMET4",                        --���x�������R�����g
  M."ES_COMMET5",                        --���ϗL�������R�����g
  M."ES_ORG_CD",                         --���ϒS������R�[�h
  M."ORG_NAME" AS ORG_NAME_2,            --���ϒS�����喼
  M."ES_USER_CD",                        --���ϒS���҃R�[�h
  M."USER_NAME" AS USER_NAME_2,          --���ϒS���Җ�
  M."ESTIMATE_AMOUNT",                   --���ϋ��z���v
  M."ESTIMATE_AMOUNT_JPN",               --���ϋ��z���v(�M��)
  M."ESREMARK1",                         --���ϔ��l1
  M."ESREMARK2",                         --���ϔ��l2
  M."ESREMARK3"                          --���ϔ��l3
FROM
  T_PROJECT A,                                              --�Č�
  M_CUST B,                                                 --���Ӑ�}�X�^
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
      T_ESTIMATE TT,                                -- ����
      USER_MST D2,                                  -- ���[�U�}�X�^
      (SELECT
          C3."ORG_CD",C3."ORG_NAME"                 --  ����R�[�h�ƕ��喼
       FROM 
          M_ORG C3,                                 -- ����
          SYS_MY_COMPANY S3                         -- ����
       WHERE
          (S3."CTRL_CD" = 'SYSTEM' AND C3."COMPANY_CD" = S3."COMPANY_CD" )
      )  C2                                         -- ����}�X�^�i���ϒS���p���o�ς݁j
   WHERE
      (TT."ES_USER_CD" = D2."USER_CD" (+))          -- ���ϒS���҃R�[�h
       AND (TT."ES_ORG_CD"  = C2."ORG_CD"  (+))     -- ���ϒS������R�[�h
      )  M,                                         -- ����
  (SELECT
      C4."ORG_CD",C4."ORG_NAME"     -- ����R�[�h�ƕ��喼
   FROM 
      M_ORG C4,                     -- ����
      SYS_MY_COMPANY S4             -- ����
  WHERE
      (S4."CTRL_CD" = 'SYSTEM' AND C4."COMPANY_CD" = S4."COMPANY_CD")
   )  C1,                           -- ����}�X�^�i�Č��S���p���o�ς�
   (SELECT
       C4."DLV_LOC_CD",C4."DLV_LOC_NAME",C4."CUST_CD"    --  �[�i�ꏊ�R�[�h�A�[�i�ꏊ���A���Ӑ�R�[�h
    FROM 
       M_CUST_BASE C4,              -- ���Ӑ�[�i�ꏊ
       SYS_MY_COMPANY S4            -- ����
    WHERE
       (S4."CTRL_CD" = 'SYSTEM' AND C4."COMPANY_CD" = S4."COMPANY_CD")
   ) J,                                                     --���Ӑ�[�i�ꏊ
  USER_MST D1,                                              --���[�U�}�X�^
  M_CUR F,                                                  --�ʉ�
  SYS_MY_COMPANY H                                          --����
WHERE
   (A."DEL_FLG" = '0')
   AND (H."CTRL_CD" = 'SYSTEM')                                         -- ���Ђ̎擾
   AND (A."CUST_CD" = B."CUST_CD" AND B."COMPANY_CD" = H."COMPANY_CD")  -- ���Ӑ�Ƃ̌����i���Ӑ�R�[�h�i�Č��̓��Ӑ�R�[�h�͕K�{�j�j
   AND (A."PROJECT_CD" = M."PROJECT_CD"(+))                             -- ���ςƂ̌���
   AND (B."CUR_CD" = F."CUR_CD")                                        -- �ʉ݂̌���
   AND (A."PJ_ORG_CD"  = C1."ORG_CD" (+))                               -- �Č��S������R�[�h�̈Č��Ƃ̌����i�K�{���͂łȂ��j
   AND (A."PJ_USER_CD" = D1."USER_CD"(+))                               -- �Č��S���҃R�[�h�i�K�{���͂łȂ��j
   AND A."DLV_LOC_CD" = J."DLV_LOC_CD"(+)
   AND A."CUST_CD" = J."CUST_CD"(+)
/
