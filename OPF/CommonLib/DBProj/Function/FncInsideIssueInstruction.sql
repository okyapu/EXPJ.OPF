CREATE OR REPLACE FUNCTION FNCINSIDEISSUEINSTRUCTION(
/*------------------------------------------------------------------------------
' $Id: FncInsideIssueInstruction.sql,v 1.10 2013/06/03 07:08:51 tai-yanhong Exp $
' version   : 1.00.00
'
' 修正履歴
' 2003.08.06 初版
' 2003.08.27 パラメータ修正、出庫指示設定値追加
' 2003.11.03 DBMS_OUTPUTのコメントアウト
' 2003.12.10 出庫指示数計算方法の修正。
' 2003.12.11 疑似品目時の出庫単位数、出庫単位数分母、出庫単位数分子の計算は、
'            小数第５位切り上げと修正。
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
' 2007.02.26 初工程の仕掛作業コードの取得方法を修正
'
' 機能      : 出庫指示処理（内作）
'
' 戻り値    : Boolean
'               True :正常終了（出庫指示処理（内作）が行えた時）
'               False:異常終了（出庫指示処理（内作）に失敗した時）
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2WorkOdrCd        - (i)作業計画番号
'             pvc2WorkInProcCd     - (i)仕掛作業コード
'             pvc2OdCd             - (i)オーダデマンド番号
'             pnumOprInstQty       - (i)作業指示数
'             pvc2OprRsltTyp       - (i)品目別作業実績区分
'
' 機能説明  : 作業指示確定に伴い、必要となる資材の出庫指示を作成する。
'         本処理は、内作品の作業計画情報に対する下位品目の出庫指示を、それぞれのデマンド
'         情報をもとに作成する。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle             IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode             IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode          IN  VARCHAR2            --出力モード
   ,pvc2UserId              IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName        IN  VARCHAR2            --業務名
   ,pvc2PlantCd             IN  VARCHAR2            --工場コード
   ,pvc2WorkOdrCd           IN  VARCHAR2            --作業計画番号
   ,pvc2WorkInProcCd        IN  VARCHAR2            --仕掛作業コード
   ,pvc2OdCd                IN  VARCHAR2            --オーダデマンド番号
   ,pnumOprInstQty          IN  NUMBER              --作業指示数
   ,pvc2OprRsltTyp          IN  VARCHAR2            --品目別作業実績区分
) RETURN BOOLEAN
IS
    /* 定数の宣言 */
    OPR_RSLT_TYP_TURNOVER   NUMBER      := 1;   --品目別作業実績区分　出来高
--  OPR_RSLT_TYP_ITEM       NUMBER      := 2;   --品目別作業実績区分　作業指示実績 nesn del
    OPR_RSLT_TYP_PROC       NUMBER      := 2;   --品目別作業実績区分　作業系列 nesn  3->2
    --エラー№
    APS_COM_ORACLE_ERR      NUMBER      := 53401;   --ORACLE Error
    APS_COM_OTHER_ERR       NUMBER      := 53402;   --OTHER Error
    --// レコードの定義
    --//所要量データ読込用
    type Typ_TOD is RECORD(
--      TypOD_NO_TOD                NUMBER(014),    --// オーダデマンド番号 nesn del
        TypOD_NO_TOD                VARCHAR2(100),  --// オーダデマンド番号 nesn
        TypITEM_CD_TOD              VARCHAR2(100),  --// 品目番号
        TypPS_EDITION_TOD           VARCHAR2(100),  --// 製品構成版数(所要品目構成版数)
--      TypPS_UNIT_QTY_TOD          VARCHAR2(100),  --// 製品構成単位数 nesn del
        TypPS_UNIT_QTY_TOD          NUMBER(18,4),   --// 製品構成単位数 nesn 0830
        TypPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),   --// 製品構成単位数分母 nesn 0830
        TypPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),   --// 製品構成単位数分子 nesn 0830
        TypITEM_ODR_TYP_TOD         NUMBER(002),    --// 品目手配区分
        TypOD_TYP_TOD               NUMBER(002),    --// オーダデマンド区分
--      TypPARENT_OD_NO_TOD         NUMBER(014),    --// 親オーダデマンド番号 nesn del
        TypPARENT_OD_NO_TOD         VARCHAR2(100),  --// 親オーダデマンド番号 nesn
        TypISSUE_TYP_TOD            NUMBER(002),    --// 所要量出庫区分
        TypPLANT_CD_TOD             VARCHAR2(8),    --// 所要量工場コード nesn
        TypPATTERN_CD_TOD			VARCHAR2(100),  --// パターンコード
        TypSCDL_ISSUE_DATE_TOD      DATE,           --// 出庫予定日 nesn
        TypPS_SPOIL                 NUMBER(9,4)); --所要量構成仕損率      
    LTypsqlCurr_REC     Typ_TOD;
    type Typ_TOD_DISGUISE is RECORD(
--      TypOD_NO_TOD                NUMBER(014),    --// オーダデマンド番号 nesn del
        TypOD_NO_TOD                VARCHAR2(100),  --// オーダデマンド番号 nesn
        TypITEM_CD_TOD              VARCHAR2(100),  --// 品目番号
        TypPS_EDITION_TOD           VARCHAR2(100),  --// 製品構成版数(所要品目構成版数)
--      TypPS_UNIT_QTY_TOD          VARCHAR2(100),  --// 製品構成単位数 nesn del
        TypPS_UNIT_QTY_TOD          NUMBER(18,4),   --// 製品構成単位数 nesn 0830
        TypPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),   --// 製品構成単位数分母 nesn 0830
        TypPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),   --// 製品構成単位数分子 nesn 0830
        TypITEM_ODR_TYP_TOD         NUMBER(002),    --// 品目手配区分
        TypOD_TYP_TOD               NUMBER(002),    --// オーダデマンド区分
--      TypPARENT_OD_NO_TOD         NUMBER(014),    --// 親オーダデマンド番号 nesn del
        TypPARENT_OD_NO_TOD         VARCHAR2(100),  --// 親オーダデマンド番号 nesn
        TypISSUE_TYP_TOD            NUMBER(002),    --// 所要量出庫区分
        TypPLANT_CD_TOD             VARCHAR2(8),  --// 所要量工場コード nesn
        TypPATTERN_CD_TOD			VARCHAR2(100),  --// パターンコード
        TypSCDL_ISSUE_DATE_T        DATE,             --// 出庫予定日 nesn
        TypPS_SPOIL                 NUMBER(9,4)); --所要量構成仕損率
    LTypsqlCurr_REC_DISGUISE        Typ_TOD_DISGUISE;
    --//作業計画別出庫計画データ（ＴＥＭＰ）作成用
    type Typ is RECORD(
        TypPUCH_ODR_CD_T            VARCHAR2(100),  --// 発注番号
--      TypOD_NO_T                  NUMBER(014),    --// オーダデマンド番号 nesn del
        TypOD_NO_T                  VARCHAR2(100),  --// オーダデマンド番号 nesn
        TypITEM_CD_T                VARCHAR2(100),  --// 品目番号
        TypPS_EDITION_T             VARCHAR2(100),  --// 製品構成版数(所要品目構成版数)
--      TypPS_UNIT_QTY_T            VARCHAR2(100),  --// 製品構成単位数 nesn del
        TypPS_UNIT_QTY_T            NUMBER(18,4),   --// 製品構成単位数 nesn 0830
        TypPS_UNIT_DENOMINATOR_T    NUMBER(18,4),   --// 製品構成単位数分母 nesn 0830
        TypPS_UNIT_NUMERATOR_T      NUMBER(18,4),   --// 製品構成単位数分子 nesn 0830
        TypTOTALISSUETYP_T          NUMBER(002),    --// 出庫指示累計数
        TypMRP_ODR_TYP_T            NUMBER(002),    --// 出庫指示区分(品目手配区分)
        TypODINFO_DISGUISE_T        NUMBER(002),    --// 擬似品目展開フラグ(0:OFF,1:ON)
--      TypPARENT_OD_NO_T           NUMBER(014),    --// 親オーダデマンド番号 nesn del
        TypPARENT_OD_NO_T           VARCHAR2(100),  --// 親オーダデマンド番号 nesn
        TypISSUE_TYP_T              NUMBER(002),    --// 所要量出庫区分
        TypPLANT_CD_T               VARCHAR2(8),  --// 所要量工場コード nesn
        TypSCDL_ISSUE_DATE_T        DATE,           --// 出庫予定日 nesn
        TypPATTERN_CD_T				VARCHAR2(100),  --// パターンコード
        TypPARENT_ITEM_NO_T         VARCHAR2(100),  --// 親品目番号
        TypPS_SPOIL                 NUMBER(9,4)); --所要量構成仕損率
    TYPE Typ_REC_T IS TABLE OF Typ INDEX BY BINARY_INTEGER;
    Typ_REC Typ_REC_T;
    --//出庫指示データ（ＴＥＭＰ）
    --//作業計画別出庫計画データ編集したデータを格納する。
    --//※この構造体を基に出庫指示データを追加する。
    vc2ISSUE_INST_CD                VARCHAR2(100);  --// 出庫指示番号
    vc2PLANT_CD                     VARCHAR2(8);   --// 工場コード
--  numOD_NO                        NUMBER(014);    --// オーダデマンド番号 nesn del
    vc2OD_NO                        VARCHAR2(100);  --// オーダデマンド番号 nesn
    vc2ITEM_CD                      VARCHAR2(100);  --// 出庫品目番号
    vc2PS_EDITION                   VARCHAR2(100);  --// 製品構成版数(所要品目構成版数)
    vc2PUCH_ODR_CD                  VARCHAR2(100);  --// 発注番号
    vc2WORK_ODR_CD                  VARCHAR2(100);  --// 作業計画番号
    vc2WORK_IN_PROC_CD              VARCHAR2(100);  --// 仕掛作業コード
    numISSUE_INST_UNIT_QTY          NUMBER(18,4);   --// 出庫指示単位数
    numISSUE_INST_UNIT_DENOMINATOR  NUMBER(18,4);   --// 出庫指示単位数分母
    numISSUE_INST_UNIT_NUMERATOR    NUMBER(18,4);   --// 出庫指示単位数分子
    --numISSUE_INST_QTY               NUMBER(18,4);   --// 出庫指示数
    numISSUE_INST_QTY               NUMBER(18,5);   --// 出庫指示数
    numTOTAL_ISSUE_QTY              NUMBER(18,4);   --// 出庫累計数
    dtmSCDL_ISSUE_DATE              DATE;           --// 出庫予定日
    dtmISSUE_CMPLT_DATE             DATE;           --// 出庫完了日
    numISSUE_TYP                    NUMBER(1);      --// 出庫指示出庫区分
    numISSUE_CMPLT_FLG              NUMBER(1);      --// 出庫完了フラグ
    numISSUE_INST_ISS_FLG           NUMBER(1);      --// 出庫指示書発行済みフラグ
    dtmISSUE_INST_DATE              DATE;           --// 出庫指示書発行日
    vc2ISSUE_INST_COMMENT           VARCHAR2(320);  --// 出庫指示備考
    --//擬似品目データ（ＴＥＭＰ）
    type Typ_DISGUISE is RECORD(
        TypWORK_ODR_CD             VARCHAR2(100),   --// 作業計画番号
--      TypOD_NO                   NUMBER(014),     --// オーダデマンド番号 nesn del
        TypOD_NO                   VARCHAR2(100),   --// オーダデマンド番号 nesn
        TypITEM_CD                 VARCHAR2(100),   --// 出庫品目番号
        TypPS_EDITION              VARCHAR2(100),   --// 製品構成版数(所要品目構成版数)
        TypISSUE_INST_UNIT_QTY     NUMBER(18,4),    --// 出庫指示単位数
        TypISSUE_TYP               NUMBER(002),     --// 出庫区分
        TypTOTAL_ISSUE_TYP         NUMBER(18,4),    --// 出庫指示累計数
--      TypPARENT_OD_NO            NUMBER(014),     --// 親オーダデマンド番号 nesn del
        TypPARENT_OD_NO            VARCHAR2(100),   --// 親オーダデマンド番号 nesn
        TypISSUE_INST_TYP          NUMBER(1),       --// 出庫指示区分
        TypDISGUISE_FLG            NUMBER(1));      --// 擬似品目展開フラグ
    TYPE Typ_DISGUISE_REC_T IS TABLE OF Typ_DISGUISE INDEX BY BINARY_INTEGER;
    Typ_DISGUISE_REC    Typ_DISGUISE_REC_T;
    --// カーソルの宣言
    --// 所要量データ読込
    cursor Cur_PuchOdrInst_SelectTOD1(COD_NO VARCHAR2) IS
                 select
                    OD.OD_NO,
                    OD.PLANT_CD,
                    OD.ITEM_CD,
                    OD.PS_EDITION,
                    OD.PS_UNIT_QTY,
                    OD.PS_UNIT_DENOMINATOR,
                    OD.PS_UNIT_NUMERATOR,
                    OD.MRP_ODR_TYP,
                    OD.OD_TYP,
                    OD.PARENT_OD_NO,
                    OD.ISSUE_TYP,
                    --OD.DUE_DATE
                    OD.DUE_DATE,
                    OD.PATTERN_CD,
                    PS_SPOIL
          from  T_OD OD
          where     OD.PARENT_OD_NO = COD_NO;
     /*システムパラメータ（仕損率）*/
     CURSOR CUR_SystemSpoilFlg  IS
         SELECT 
                 VALUE
         FROM  SYS_PARAMETER
         WHERE NAME='SPOIL_FLG';
    --// 所要量データ読込（品目手配区分:8(擬似品目)時の下位デマンドサマリ情報の追加用)
    cursor Cur_PuchOdrInst_SelectTOD2(COD_NO VARCHAR2) IS
                  select
                    OD.OD_NO,
                    OD.PLANT_CD,
                    OD.ITEM_CD,
                    OD.PS_EDITION,
                    OD.PS_UNIT_QTY,
                    OD.PS_UNIT_DENOMINATOR,
                    OD.PS_UNIT_NUMERATOR,
                    OD.MRP_ODR_TYP,
                    OD.OD_TYP,
                    OD.PARENT_OD_NO,
                    OD.ISSUE_TYP,
                    --OD.DUE_DATE
                    OD.DUE_DATE,
                    OD.PATTERN_CD,
                    PS_SPOIL
          from  T_OD OD
          where     OD.PARENT_OD_NO = COD_NO;
    --// 在庫数量単位区分の取得（品目テーブルより（属性:基準テーブル））
    --// 出庫指示作成時に擬似品目展開フラグ:1(ON)の場合の出庫単位数、
    --// 出庫指示数の有効桁数をオーバーした時の在庫数量単位区分の判定
    cursor Cur_PuchOdrInst_UNIT_QTY_TYP(CITEM_CD VARCHAR2) IS
        select UNIT_QTY_TYP
          from  M_ITEM
          where ITEM_CD = CITEM_CD;
--//----------------------------------------------------------------------------
--// nesn 品目別仕掛、作業系列仕掛、作業区マスタの検索を追加し、
--//      出庫指示テーブルの編集に使用する
   /* 品目別仕掛 */
   CURSOR Cur_Proc_By_Item IS
       SELECT WS_CD
       FROM   T_WORK_IN_PROC_BY_ITEM
       WHERE  WORK_ODR_CD = vc2WORK_ODR_CD ;
   /* 作業系列別仕掛AND発注残 */
   CURSOR Cur_Proc_By_Proc IS
       SELECT OUTSIDE_TYP,
              WS_CD,
              DECODE(T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,2,T_WORK_IN_PROC_BY_PROC.COMPANY_CD,'') COMPANY_CD,
              DECODE(T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,2,T_WORK_IN_PROC_BY_PROC.VEND_CD,'') VEND_CD,
              DECODE(T_WORK_IN_PROC_BY_PROC.OUTSIDE_TYP,2,T_RLSD_PUCH_ODR.PUCH_ODR_CD,'') PUCH_ODR_CD
       FROM   T_WORK_IN_PROC_BY_PROC,T_RLSD_PUCH_ODR
       WHERE  T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD     = vc2WORK_ODR_CD
       AND    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = vc2WORK_IN_PROC_CD
       AND    T_WORK_IN_PROC_BY_PROC.WORK_ODR_CD     = T_RLSD_PUCH_ODR.WORK_ODR_CD(+)
       AND    T_WORK_IN_PROC_BY_PROC.WORK_IN_PROC_CD = T_RLSD_PUCH_ODR.WORK_IN_PROC_CD(+)
       Order by T_WORK_IN_PROC_BY_PROC.PROC_NO;

   /* 同一計画番号内で最初の内作工程の作業区コード取得する --20031008コメントアウト
   CURSOR Cur_Proc_Ws_Cd(vc2WORK_ODR_CD VARCHAR2) IS
      SELECT MIN(PROC_NO) --20031008 PROC_NO WS_CD
      FROM   T_WORK_IN_PROC_BY_PROC
      WHERE  WORK_ODR_CD = vc2WORK_ODR_CD
      AND    OUTSIDE_TYP = 1 ; */

   /* 同一計画番号内で最初の内作工程の作業区コード取得する */
   CURSOR Cur_Proc_Ws_Cd(vc2WORK_ODR_CD VARCHAR2) IS --20031008修正
     SELECT WS_CD
     FROM   T_WORK_IN_PROC_BY_PROC
     WHERE  WORK_ODR_CD = vc2WORK_ODR_CD
     AND    PROC_NO = ( SELECT MIN(PROC_NO)
                        FROM   T_WORK_IN_PROC_BY_PROC
                        WHERE  WORK_ODR_CD = vc2WORK_ODR_CD
                        AND    OUTSIDE_TYP = 1 );

   /* 作業区 */
   CURSOR Cur_M_Ws(vc2WS_CD VARCHAR2) IS
       SELECT WH_CD
       FROM   M_WS
       WHERE  WS_CD = vc2WS_CD ;
       
   /* 支給単価 */  --add 20030923
   CURSOR Cur_M_Cons_Unit_Cost(vc2COMPANY_CD VARCHAR2,vc2VEND_CD VARCHAR2,pvc2PlantCd VARCHAR2,vc2ITEM_CD VARCHAR2,dtmSCDL_ISSUE_DATE DATE) IS
       SELECT ONEROUS_FLG
       FROM   M_CONS_UNIT_COST
       WHERE  COMPANY_CD = vc2COMPANY_CD
       AND    VEND_CD    = vc2VEND_CD
       AND    PLANT_CD   = pvc2PlantCd
       AND    ITEM_CD    = vc2ITEM_CD
       AND    EFF_PHASE_IN_DATE = ( SELECT MAX(EFF_PHASE_IN_DATE)
                                    FROM M_CONS_UNIT_COST
                                    WHERE  COMPANY_CD = vc2COMPANY_CD
                                    AND    VEND_CD    = vc2VEND_CD
                                    AND    PLANT_CD   = pvc2PlantCd
                                    AND    ITEM_CD    = vc2ITEM_CD
                                    AND    EFF_PHASE_IN_DATE <= dtmSCDL_ISSUE_DATE ) ;

   /* [品目別仕掛].品目番号(親品目番号)の取得 */
   CURSOR Cur_Proc_Parent_Item_Cd(
      cvc2WorkOdrCd VARCHAR2        --作業計画番号
   ) IS
       SELECT ITEM_CD                --品目番号
       FROM   T_WORK_IN_PROC_BY_ITEM --品目別仕掛
       WHERE  WORK_ODR_CD = cvc2WorkOdrCd;

   /* [作業系列別仕掛].仕掛作業コード(初工程)の取得 */
   CURSOR Cur_Proc_Work_In_Proc_Cd(
      cvc2WorkOdrCd VARCHAR2                      --作業計画番号
   ) IS
       SELECT A.WORK_IN_PROC_CD                   --仕掛作業コード(初工程の)
       FROM T_WORK_IN_PROC_BY_PROC A,             --作業系列別仕掛
            (select WORK_ODR_CD,
                    MIN(PROC_NO) as MIN_PROC_NO
             from T_WORK_IN_PROC_BY_PROC          --作業系列別仕掛
             where WORK_ODR_CD = cvc2WorkOdrCd 
             group by WORK_ODR_CD) B 
       WHERE  A.WORK_ODR_CD = B.WORK_ODR_CD
              AND A.PROC_NO = B.MIN_PROC_NO;

/*
   CURSOR Cur_Proc_Work_In_Proc_Cd(
      cvc2WorkOdrCd VARCHAR2         --作業計画番号
   ) IS
       SELECT MIN(WORK_IN_PROC_CD)   --仕掛作業コード(最小値)
       FROM   T_WORK_IN_PROC_BY_PROC --作業系列別仕掛
       WHERE  WORK_ODR_CD = cvc2WorkOdrCd;
*/
   /* [払出].払出単位数分子を使用し払出指示数の取得（初工程以外の払出指示数） */
   CURSOR Cur_Issue_Qty_Next(
            cvc2PlantCd           VARCHAR2,             --工場コード
            cvc2ParentItemCd      VARCHAR2,             --親品目番号
            cvc2WorkInProcCd      VARCHAR2,             --仕掛作業コード
            cvc2IssueItemCd       VARCHAR2,             --出庫品目番号
            cvc2Ps_Edition        VARCHAR2,             --出庫品目構成版数
            cnumOprInstQty        NUMBER,               --作業指示数
            cnumPsUnitDenominator NUMBER                --製品構成単位数分母（出庫指示単位数分母）
   ) IS
       SELECT NVL((
                 cnumOprInstQty *                       --作業指示数
              M_ISSUE.ISSUE_UNIT_NUMERATOR /            --払出単位数分子
              cnumPsUnitDenominator                     --製品構成単位数分母（出庫指示単位数分母）
                  --), 0)
                  ), 0),
              NVL(M_ISSUE.ISSUE_UNIT_NUMERATOR, 0)
       FROM   M_ISSUE                                   --払出
       WHERE  M_ISSUE.PLANT_CD       = cvc2PlantCd      --工場コード
       AND    M_ISSUE.ITEM_CD        = cvc2ParentItemCd --親品目番号
       AND    M_ISSUE.PROC_CD        = cvc2WorkInProcCd --仕掛作業コード
       AND    M_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --出庫品目番号
       AND    M_ISSUE.PS_EDITION     = cvc2Ps_Edition;  --出庫品目構成版数

   /* [払出].払出単位数分子を使用し払出指示数の取得（初工程の払出指示数） */
   CURSOR Cur_Issue_Qty_First(
            cvc2PlantCd           VARCHAR2,                  --工場コード
            cvc2ParentItemCd      VARCHAR2,                  --親品目番号
            cvc2WorkInProcCd      VARCHAR2,                  --仕掛作業コード
            cvc2IssueItemCd       VARCHAR2,                  --出庫品目番号
            cvc2Ps_Edition        VARCHAR2,                  --出庫品目構成版数
            cnumOprInstQty        NUMBER,                    --作業指示数
            cnumPsUnitDenominator NUMBER                     --製品構成単位数分母（出庫指示単位数分母）
   ) IS
       --SELECT NVL(SUM(MI.ISSUE_QTY), 0)
       --SELECT NVL(SUM(MI.ISSUE_QTY), 0),
       		  --NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
	   SELECT NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
       FROM
           --(SELECT (
                    --cnumOprInstQty *                         --作業指示数
                    --M_ISSUE.ISSUE_UNIT_NUMERATOR /           --払出単位数分子
                    --cnumPsUnitDenominator                    --製品構成単位数分母（出庫指示単位数分母）
            (SELECT 
                   --) ISSUE_QTY
                   --) ISSUE_QTY, 
                   M_ISSUE.ISSUE_UNIT_NUMERATOR AS ISSUE_UNIT_NUMERATOR
            FROM   M_ISSUE                                   --払出
            WHERE  M_ISSUE.PLANT_CD       = cvc2PlantCd      --工場コード
            AND    M_ISSUE.ITEM_CD        = cvc2ParentItemCd --親品目番号
            AND    M_ISSUE.PROC_CD       <> cvc2WorkInProcCd --仕掛作業コード
            AND    M_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --出庫品目番号
            AND    M_ISSUE.PS_EDITION     = cvc2Ps_Edition   --出庫品目構成版数
           ) MI;

   /* [パターン別払出].払出単位数分子を使用し払出指示数の取得（初工程以外の払出指示数） */
   CURSOR Cur_Issue_Qty_Next_Pattern(
            cvc2PlantCd           VARCHAR2,             --工場コード
            cvc2ParentItemCd      VARCHAR2,             --親品目番号
            cvc2WorkInProcCd      VARCHAR2,             --仕掛作業コード
            cvc2IssueItemCd       VARCHAR2,             --出庫品目番号
            cvc2Ps_Edition        VARCHAR2,             --出庫品目構成版数
            cnumOprInstQty        NUMBER,               --作業指示数
            cnumPsUnitDenominator NUMBER,               --製品構成単位数分母（出庫指示単位数分母）
            cvc2PatternCd		  VARCHAR2				--パターンコード
   ) IS
       SELECT NVL((
                 cnumOprInstQty *                       --作業指示数
              M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR /            --払出単位数分子
              cnumPsUnitDenominator                     --製品構成単位数分母（出庫指示単位数分母）
                  --), 0)
                  ), 0),
              NVL(M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR, 0)
       FROM   M_PATTERN_ISSUE                                   --払出
       WHERE  M_PATTERN_ISSUE.PLANT_CD       = cvc2PlantCd      --工場コード
       AND    M_PATTERN_ISSUE.ITEM_CD        = cvc2ParentItemCd --親品目番号
       AND    M_PATTERN_ISSUE.PROC_CD        = cvc2WorkInProcCd --仕掛作業コード
       AND    M_PATTERN_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --出庫品目番号
       AND    M_PATTERN_ISSUE.PS_EDITION     = cvc2Ps_Edition   --出庫品目構成版数
       AND    M_PATTERN_ISSUE.PATTERN_CD     = cvc2PatternCd;	--パターンコード

   /* [パターン別払出].払出単位数分子を使用し払出指示数の取得（初工程の払出指示数） */
   CURSOR Cur_Issue_Qty_First_Pattern(
            cvc2PlantCd           VARCHAR2,                  --工場コード
            cvc2ParentItemCd      VARCHAR2,                  --親品目番号
            cvc2WorkInProcCd      VARCHAR2,                  --仕掛作業コード
            cvc2IssueItemCd       VARCHAR2,                  --出庫品目番号
            cvc2Ps_Edition        VARCHAR2,                  --出庫品目構成版数
            cnumOprInstQty        NUMBER,                    --作業指示数
            cnumPsUnitDenominator NUMBER,                    --製品構成単位数分母（出庫指示単位数分母）
            cvc2PatternCd		  VARCHAR2					 --パターンコード
   ) IS
       --SELECT NVL(SUM(MI.ISSUE_QTY), 0)
	   --SELECT NVL(SUM(MI.ISSUE_QTY), 0),
	   		  --NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
	   SELECT NVL(SUM(MI.ISSUE_UNIT_NUMERATOR), 0)
       FROM
           --(SELECT (
                    --cnumOprInstQty *                         --作業指示数
                    --M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR /           --払出単位数分子
                    --cnumPsUnitDenominator                    --製品構成単位数分母（出庫指示単位数分母）
           (SELECT
                   --) ISSUE_QTY
                   --) ISSUE_QTY,
                   M_PATTERN_ISSUE.ISSUE_UNIT_NUMERATOR AS ISSUE_UNIT_NUMERATOR
            FROM   M_PATTERN_ISSUE                                   --払出
            WHERE  M_PATTERN_ISSUE.PLANT_CD       = cvc2PlantCd      --工場コード
            AND    M_PATTERN_ISSUE.ITEM_CD        = cvc2ParentItemCd --親品目番号
            AND    M_PATTERN_ISSUE.PROC_CD       <> cvc2WorkInProcCd --仕掛作業コード
            AND    M_PATTERN_ISSUE.ISSUE_ITEM_CD  = cvc2IssueItemCd  --出庫品目番号
            AND    M_PATTERN_ISSUE.PS_EDITION     = cvc2Ps_Edition   --出庫品目構成版数
            AND    M_PATTERN_ISSUE.PATTERN_CD     = cvc2PatternCd    --パターンコード
           ) MI;

-- ▼▼ 2008/08/11 ADD START -TSUCHIDA ▼▼
	/* 工数管理品目区分取得 */
	CURSOR Cur_Manhour_Typ(cvc2ItemCd VARCHAR2) IS
		SELECT M_ITEM.MANHOUR_TYP		-- 工数管理品目区分
		FROM M_ITEM
		WHERE M_ITEM.ITEM_CD = cvc2ItemCd;
-- ▲▲ 2008/08/11 ADD END -TSUCHIDA ▲▲

--//----------------------------------------------------------------------------
    --// 変数の定義
    vc2RunChkComment                VARCHAR2(1024);      --// 実行位置確認用コメント作成作業領域
    vc2Comment                      VARCHAR2(1024);      --// メッセージ用コメント作成作業領域
    LLngCntMax                      NUMBER(11);         --// 支給品出庫計画データ件数
    LNumCntMax_ISSUE_INST           NUMBER(011):= 0;    --// 出庫指示データ件数
    LNumCntCurr                     NUMBER(011):= 0;    --// 構造体読込用カウンタ
    LNumCntCurr_ISSUE_INST          NUMBER(011):= 0;    --// 出庫指示単位数取得用カウンタ
--  Lvc2OD_NOTemp                   NUMBER(014);        --// オーダデマンド番号保持用 nesn del
    Lvc2OD_NOTemp                   VARCHAR2(100);      --// オーダデマンド番号保持用 nesn
--  LNumPARENT_OD_NoTemp            NUMBER(014);        --// 親オーダデマンド番号保持用 nesn del
    LNumPARENT_OD_NoTemp            VARCHAR2(100);      --// 親オーダデマンド番号保持用 nesn
    LNumUNIT_QTY_TYP                NUMBER(002);        --// 子品目在庫数量単位区分の保持用
    LNumISSUE_INST_UNIT_QTY_TYP     NUMBER(002);        --// 親品目在庫数量単位区分の保持用
    LNumWkCnt                       NUMBER(011);        --// 構造体読込用カウンタ
    LNumWkCnt2                      NUMBER(011);        --// 構造体読込用カウンタ
    LNumCnt_DISGUISE                NUMBER(011);        --// 擬似品目カウンタ
    LNumPlanInfoIndex               NUMBER(011):= 0;    --// 構造体読込用カウンタ
    LNumPlanInfoMaxIndex            NUMBER(011):= 0;    --// 構造体読込用カウンタ
    numWorkIssueQty                 NUMBER(18,4);
    numIssueInstUnitQty             NUMBER(18,4);       --// 出庫指示単位数
    numIssueInstQty                 NUMBER(18,4);       --// 出庫指示数
    numOprInstQtyTemp               NUMBER(18,4);       --// 作業系列別仕掛構造体(x)．作業指示数の一時作業領域
    numOprInstQty                   NUMBER(18,4);
    numWorkIssueQtyTemp             NUMBER(18,4);       --// Work出庫計画出庫単位数量残数一時作業領域
    numMaxProcInfoIndex             NUMBER(18,4);
    numErr      NUMBER(10);
    numCount    NUMBER(10);
    LOGMSG_ERR                      VARCHAR2(32)  := '異常終了';
    numSaveDataFrg                  NUMBER(1);          --// 初系列更新判定
    numSaveFeristProcIndex          NUMBER(11);         --// 初系列のSaveDataのIndex
    vc2P_WORK_ODR_CD                VARCHAR2(100);
--  numP_OD_NO                      NUMBER(14);         --// nesn del
    vc2P_OD_NO                      VARCHAR2(100);       --// nesn
    vc2P_WORK_IN_PROC_CD            VARCHAR2(100);
    vc2P_ITEM_CD                    VARCHAR2(100);
    numP_OUTSIDE_TYP                NUMBER(2);
    dtmP_OPR_INST_START_DATE        DATE;
    numP_OPR_INST_QTY               NUMBER(18,4);
    numP_OPR_RSLT_TYP               NUMBER(2);
    vc2P_PUCH_ODR_CD                VARCHAR2(100);
    vc2P_ROUTING_CD                 VARCHAR2(100);
    vc2WS_CD                        VARCHAR2(100);       --// nesn 作業区コード
    vc2WS_CD2                       VARCHAR2(100);       --// nesn 作業区コード
    numOUTSIDE_TYP                  NUMBER(2);          --// nesn 仕掛内外作区分
    vc2WH_CD                        VARCHAR2(100);       --// nesn 保管区コード
    vc2COMPANY_CD                   VARCHAR2(100);       --// nesn 会社コード
    vc2VEND_CD                      VARCHAR2(100);       --// nesn 取引先コード
    numCONS_TYP                     NUMBER(2);          --// nesn 支給区分   20030923
    numONEROUS_FLG                  NUMBER(1);          --// nesn 有償フラグ 20030923
    LBlnRet                         BOOLEAN;            --// 共通関数の戻値
    LGetNewPuchCd                   VARCHAR2(100);      --// 出庫番号取得用
    blnRet                          BOOLEAN;
    vc2ParentItemCd                 VARCHAR2(100);      --// 親品目番号
    vc2WorkInProcCd                 VARCHAR2(100);      --// 仕掛作業コード(初工程)
    --numIssueQty                     NUMBER(18,4);       --// 払出指示数
    --numNeedQty                      NUMBER(18,4);       --// 必要指示数
    numIssueQty                     NUMBER(18,5);       --// 払出指示数
    numNeedQty                      NUMBER(18,5);       --// 必要指示数
    --numIssueNumerator				NUMBER(18,4);       --// 払出単位数分子
    numIssueNumerator				NUMBER(18,5);       --// 払出単位数分子
   SYS_SPOIL_FLG                    NUMBER(1);          --システムパラメータ仕損率
-- ▼▼ 2008/08/11 ADD START -TSUCHIDA ▼▼
	numManhourTyp					NUMBER(2);			-- 工数管理品目区分
-- ▲▲ 2008/08/11 ADD END -TSUCHIDA ▲▲
    excUNIT_QTY_TYP_ERR             EXCEPTION;
    excERR_GET_NEW_INST_CD          EXCEPTION;
    excT_WORK_IN_PROC_BY_ITEM_ERR   EXCEPTION;          --// nesn
    excT_WORK_IN_PROC_BY_PROC_ERR   EXCEPTION;          --// nesn
    excM_WS_ERR                     EXCEPTION;          --// nesn
    excM_WS_ERR2                    EXCEPTION;          --// nesn
    excM_PARENT_ITEM_ERR            EXCEPTION;          --// [品目別仕掛].品目番号(親品目番号)の取得エラー
    excM_FIRST_PROC_ERR             EXCEPTION;          --// [作業系列別仕掛].仕掛作業コード(初工程)の取得エラー
    excNOTEXIST_SYS_PARAMETER       EXCEPTION;
    LOGMSG_START                VARCHAR2(20)  := 'Start';     --ログ用メソッド開始宣言
    LOGMSG_END                  VARCHAR2(12)  := 'End';       --ログ用メソッド終了宣言
    METHOD_START                VARCHAR2(20)  := 'Start';     --ログ用メソッド開始宣言
    METHOD_END                  VARCHAR2(12)  := 'End';       --ログ用メソッド終了宣言
    MY_SQL_NAME                 VARCHAR2(120) := 'FNCINSIDEISSUEINSTRUCTION';   --ＰＬ／ＳＱＬ名

--<メイン処理 >-----------------------------------------------------
begin
--20031103 DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;
    --// システム仕損率を取得
    OPEN CUR_SystemSpoilFlg ;
    FETCH CUR_SystemSpoilFlg INTO SYS_SPOIL_FLG ;
    IF CUR_SystemSpoilFlg%FOUND = FALSE THEN
       RAISE excNOTEXIST_SYS_PARAMETER;
    END IF;
    CLOSE CUR_SystemSpoilFlg ;
    --トレースログ（start）0823
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_START);
--vc2RunChkComment := '★★★★通過 00000';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --// [品目別仕掛].品目番号(親品目番号)の取得
    vc2ParentItemCd := '';
    OPEN Cur_Proc_Parent_Item_Cd(pvc2WorkOdrCd); --作業計画番号
    FETCH Cur_Proc_Parent_Item_Cd INTO vc2ParentItemCd;
        IF Cur_Proc_Parent_Item_Cd%FOUND = FALSE THEN
            --// [品目別仕掛].品目番号(親品目番号)の取得エラー
            RAISE excM_PARENT_ITEM_ERR;
        END IF;
   CLOSE Cur_Proc_Parent_Item_Cd;
   --// [作業系列別仕掛].仕掛作業コード(初工程)の取得
   vc2WorkInProcCd := NULL;
   --作業指示実績の場合のみ取得
   IF  to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_PROC) THEN
        OPEN Cur_Proc_Work_In_Proc_Cd(pvc2WorkOdrCd); --作業計画番号
        FETCH Cur_Proc_Work_In_Proc_Cd INTO vc2WorkInProcCd;
        IF vc2WorkInProcCd IS NULL THEN
             --// [作業系列別仕掛].仕掛作業コード(初工程)の取得エラー
            RAISE excM_FIRST_PROC_ERR;
        END IF;
        CLOSE Cur_Proc_Work_In_Proc_Cd;
   END IF;
--vc2RunChkComment := '★★★★通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
LLngCntMax := 0;
    --//＊＊＊ 下位デマンドサマリ情報の追加処理 ＊＊＊
    --// カーソルのオープン
    for LTypsqlCurr_REC in Cur_PuchOdrInst_SelectTOD1(pvc2OdCd) LOOP
--vc2RunChkComment := '★★★★通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --// 作業計画別出庫計画データの作成
        IF LTypsqlCurr_REC.MRP_ODR_TYP = 8 then --//擬似品目
--vc2RunChkComment := '★★★★通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            --// オーダデマンド番号
            Typ_REC(LLngCntMax).TypOD_NO_T := LTypsqlCurr_REC.OD_NO;
            Lvc2OD_NOTemp := LTypsqlCurr_REC.OD_NO;
            --// 品目番号
            Typ_REC(LLngCntMax).TypITEM_CD_T := LTypsqlCurr_REC.ITEM_CD;
            --// 製品構成版数
            Typ_REC(LLngCntMax).TypPS_EDITION_T :=
             LTypsqlCurr_REC.PS_EDITION;
            --// 製品構成単位数
            Typ_REC(LLngCntMax).TypPS_UNIT_QTY_T :=
                                    LTypsqlCurr_REC.PS_UNIT_QTY;
            --// 製品構成単位数分母
            Typ_REC(LLngCntMax).TypPS_UNIT_DENOMINATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_DENOMINATOR;
            --// 製品構成単位数分子
            Typ_REC(LLngCntMax).TypPS_UNIT_NUMERATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_NUMERATOR;
            /*所要量構成仕損率*/
            Typ_REC(LLngCntMax).TypPS_SPOIL :=LTypsqlCurr_REC.PS_SPOIL;
            --// 出庫指示区分(品目手配区分)の設定
            Typ_REC(LLngCntMax).TypMRP_ODR_TYP_T := 9;--// 出庫指示区分:擬似品目出庫計画
            --// 擬似品目展開フラグの設定
            Typ_REC(LLngCntMax).TypODINFO_DISGUISE_T := 0; --//(0:OFF)
            --// 親オーダデマンド番号
            Typ_REC(LLngCntMax).TypPARENT_OD_NO_T :=
                 LTypsqlCurr_REC.PARENT_OD_NO;
            --// 所要量出庫区分
            Typ_REC(LLngCntMax).TypISSUE_TYP_T := LTypsqlCurr_REC.ISSUE_TYP;
            --// 所要量工場コード
            Typ_REC(LLngCntMax).TypPLANT_CD_T := LTypsqlCurr_REC.PLANT_CD;
            --// 出庫予定日
            Typ_REC(LLngCntMax).TypSCDL_ISSUE_DATE_T := LTypsqlCurr_REC.DUE_DATE;
            --// 親品目番号
            Typ_REC(LLngCntMax).TypPARENT_ITEM_NO_T := vc2ParentItemCd;
        	--//パターンコード
        	Typ_REC(LLngCntMax).TypPATTERN_CD_T := LTypsqlCurr_REC.PATTERN_CD;
            --//データ件数カウント
            LLngCntMax := LLngCntMax + 1;
--vc2RunChkComment := '★★★★通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            --// 擬似品目の下位デマンドの抽出
            for LTypsqlCurr_REC_DISGUISE in Cur_PuchOdrInst_SelectTOD2(Lvc2OD_NOTemp) Loop
                --// さらにこのオーダデマンド番号を親オーダデマンド番号として持っているものを抽出
--vc2RunChkComment := '★★★★通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// オーダデマンド番号
                    Typ_REC(LLngCntMax).TypOD_NO_T :=
                                LTypsqlCurr_REC_DISGUISE.OD_NO;
                    Lvc2OD_NOTemp := LTypsqlCurr_REC_DISGUISE.OD_NO;
                    --// 品目番号
                    Typ_REC(LLngCntMax).TypITEM_CD_T :=
                                    LTypsqlCurr_REC_DISGUISE.ITEM_CD;
                    --// 製品構成版数
                    Typ_REC(LLngCntMax).TypPS_EDITION_T :=
                                    LTypsqlCurr_REC_DISGUISE.PS_EDITION;
                    --// 製品構成単位数
                    Typ_REC(LLngCntMax).TypPS_UNIT_QTY_T :=
                                LTypsqlCurr_REC_DISGUISE.PS_UNIT_QTY;
                    --// 製品構成単位数分母
                    Typ_REC(LLngCntMax).TypPS_UNIT_DENOMINATOR_T :=
                                            LTypsqlCurr_REC_DISGUISE.PS_UNIT_DENOMINATOR;
                    --// 製品構成単位数分子
                    Typ_REC(LLngCntMax).TypPS_UNIT_NUMERATOR_T :=
                                            LTypsqlCurr_REC_DISGUISE.PS_UNIT_NUMERATOR;
                      /*所要量構成仕損率*/
                    Typ_REC(LLngCntMax).TypPS_SPOIL :=LTypsqlCurr_REC_DISGUISE.PS_SPOIL;
                    --// 出庫指示区分:通常出庫計画
                    Typ_REC(LLngCntMax).TypMRP_ODR_TYP_T := 1;
                    --// 擬似品目展開フラグの設定
                    Typ_REC(LLngCntMax).TypODINFO_DISGUISE_T := 1; --//(1:ON)
                    --// 親オーダデマンド番号
                    Typ_REC(LLngCntMax).TypPARENT_OD_NO_T :=
                                 LTypsqlCurr_REC_DISGUISE.PARENT_OD_NO;
                    --// 所要量出庫区分
                    Typ_REC(LLngCntMax).TypISSUE_TYP_T :=
                                LTypsqlCurr_REC_DISGUISE.ISSUE_TYP;
                    --// 所要量工場コード
                    Typ_REC(LLngCntMax).TypPLANT_CD_T :=
                                LTypsqlCurr_REC_DISGUISE.PLANT_CD;
                    --// 出庫予定日
                    Typ_REC(LLngCntMax).TypSCDL_ISSUE_DATE_T := 
                                LTypsqlCurr_REC_DISGUISE.DUE_DATE;
                    --// 親品目番号
                    Typ_REC(LLngCntMax).TypPARENT_ITEM_NO_T := 
                                vc2ParentItemCd;
        			--//パターンコード
        			Typ_REC(LLngCntMax).TypPATTERN_CD_T := LTypsqlCurr_REC_DISGUISE.PATTERN_CD;
                    --//データ件数カウント
                    LLngCntMax := LLngCntMax + 1;
            End loop;
--vc2RunChkComment := '★★★★通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        ELSE    --//擬似品目以外
--vc2RunChkComment := '★★★★通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            --// オーダデマンド番号
            Typ_REC(LLngCntMax).TypOD_NO_T := LTypsqlCurr_REC.OD_NO;
            --// 品目番号
            Typ_REC(LLngCntMax).TypITEM_CD_T := LTypsqlCurr_REC.ITEM_CD;
            --// 製品構成版数
            Typ_REC(LLngCntMax).TypPS_EDITION_T := LTypsqlCurr_REC.PS_EDITION;
            --// 製品構成単位数
            Typ_REC(LLngCntMax).TypPS_UNIT_QTY_T :=
                                    LTypsqlCurr_REC.PS_UNIT_QTY;
            --// 製品構成単位数分母
            Typ_REC(LLngCntMax).TypPS_UNIT_DENOMINATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_DENOMINATOR;
            --// 製品構成単位数分子
            Typ_REC(LLngCntMax).TypPS_UNIT_NUMERATOR_T :=
                                    LTypsqlCurr_REC.PS_UNIT_NUMERATOR;
              /*所要量構成仕損率*/
            Typ_REC(LLngCntMax).TypPS_SPOIL :=LTypsqlCurr_REC.PS_SPOIL;
            --// 出庫指示区分(品目手配区分)の設定
            Typ_REC(LLngCntMax).TypMRP_ODR_TYP_T := 1; --// 出庫指示区分:通常出庫計画
            --// 擬似品目展開フラグの設定(0:OFF)
            Typ_REC(LLngCntMax).TypODINFO_DISGUISE_T := 0; --//(0:OFF)
            --// 親オーダデマンド番号
            Typ_REC(LLngCntMax).TypPARENT_OD_NO_T :=
                                    LTypsqlCurr_REC.PARENT_OD_NO;
            --// 所要量出庫区分
            Typ_REC(LLngCntMax).TypISSUE_TYP_T := LTypsqlCurr_REC.ISSUE_TYP;
            --// 所要量工場コード
            Typ_REC(LLngCntMax).TypPLANT_CD_T :=
                                    LTypsqlCurr_REC.PLANT_CD;
            --// 出庫予定日
            Typ_REC(LLngCntMax).TypSCDL_ISSUE_DATE_T := LTypsqlCurr_REC.DUE_DATE;
            --// 親品目番号
            Typ_REC(LLngCntMax).TypPARENT_ITEM_NO_T := vc2ParentItemCd;
        	--//パターンコード
        	Typ_REC(LLngCntMax).TypPATTERN_CD_T := LTypsqlCurr_REC.PATTERN_CD;
            --//データ件数カウント
            LLngCntMax := LLngCntMax + 1;
        END IF;
    END LOOP;



--20031103 IF LLngCntMax > 0 THEN
--20031103 DBMS_OUTPUT.PUT_LINE(pvc2WorkOdrCd || ':' || pvc2WorkInProcCd || ':' || LLngCntMax);
--20031103 END IF;




--vc2RunChkComment := '★★★★通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    IF to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_TURNOVER) THEN
    --出来高(1)の場合
--vc2RunChkComment := '★★★★通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        LNumCntMax_ISSUE_INST := 0;
        LNumCntCurr := 0;
        loop

--DBMS_OUTPUT.PUT_LINE(LLngCntMax);
--DBMS_OUTPUT.PUT_LINE(LNumCntCurr);

            exit when LLngCntMax <= LNumCntCurr;
        --//出庫指示データ（ＴＥＭＰ）の作成
        --//支給品出庫計画データ編集したデータを格納する。
        --//※この構造体を基に出庫指示データを追加する。
            --//作業計画別出庫計画データの出庫指示区分:1（通常、擬似品目の下位デマンドのみ抽出）。

--DBMS_OUTPUT.PUT_LINE(LNumCntCurr);

            if Typ_REC(LNumCntCurr).TypMRP_ODR_TYP_T = 1 then
--vc2RunChkComment := '★★★★通過 00100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --// 出庫指示番号(共通関数より取得＜自動採番＞) nesn引数変更
                --//引数:(ファイルハンドル、ＬＯＧモード、出力モード､
                --//      ユーザＩＤ､業務名、工場コード、検索結果)
                LBlnRet := FncGetNewIssInstCd(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,LGetNewPuchCd);
                IF LBlnRet = FALSE THEN
                    --// 出庫指示番号採番エラー
                    RAISE excERR_GET_NEW_INST_CD;
                END IF;
                vc2ISSUE_INST_CD := LGetNewPuchCd;
                --// オーダデマンド番号
                vc2OD_NO := Typ_REC(LNumCntCurr).TypOD_NO_T;
                --// 出庫品目番号
                vc2ITEM_CD := Typ_REC(LNumCntCurr).TypITEM_CD_T;
                --// 製品構成版数(所要品目構成版数)
                vc2PS_EDITION := Typ_REC(LNumCntCurr).TypPS_EDITION_T;
                --// 発注番号
                vc2PUCH_ODR_CD := Typ_REC(LNumCntCurr).TypPUCH_ODR_CD_T;
                --// 作業計画番号
                vc2WORK_ODR_CD := pvc2WorkOdrCd;
                --// 仕掛作業コード
                vc2WORK_IN_PROC_CD := '';
                --// 品目別仕掛検索＆作業区コードの設定 nesn
                OPEN Cur_Proc_By_Item ;
                FETCH Cur_Proc_By_Item INTO vc2WS_CD ;
                IF Cur_Proc_By_Item%FOUND = FALSE THEN
                   RAISE excT_WORK_IN_PROC_BY_ITEM_ERR;
                END IF;
                CLOSE Cur_Proc_By_Item ;
                --// 作業区検索＆工程保管場所コード設定 nesn
                OPEN Cur_M_Ws(vc2WS_CD) ;
                FETCH Cur_M_Ws INTO vc2WH_CD ;
                IF Cur_M_Ws%FOUND = FALSE THEN
                   RAISE excM_WS_ERR;
                END IF;
                CLOSE Cur_M_Ws ;
                --// 出庫指示単位数、出庫指示単位数分母、出庫指示単位数分子、出庫指示数 nesn 0830
                --// 擬似品目展開フラグ(0:OFF,1:ON)
                if Typ_REC(LNumCntCurr).TypODINFO_DISGUISE_T = 1 then
--vc2RunChkComment := '★★★★通過 00110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --//親データの出庫単位数を取得
                --//親オーダデマンド番号の退避
                    LNumPARENT_OD_NoTemp := Typ_REC(LNumCntCurr).TypPARENT_OD_NO_T;
                    LNumCntCurr_ISSUE_INST := 0;
                    loop
                        IF Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp THEN

                            --// 親品目在庫数量単位区分の取得
--vc2RunChkComment := '★★★★通過 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            open Cur_PuchOdrInst_UNIT_QTY_TYP
                                    (Typ_REC(LNumCntCurr_ISSUE_INST).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumISSUE_INST_UNIT_QTY_TYP;
                            IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                RAISE excUNIT_QTY_TYP_ERR;
                            END IF;
                            close Cur_PuchOdrInst_UNIT_QTY_TYP;
                            --// 子品目在庫数量単位区分の取得
--vc2RunChkComment := '★★★★通過 00120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            open Cur_PuchOdrInst_UNIT_QTY_TYP
                                    (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                            IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                RAISE excUNIT_QTY_TYP_ERR;
                            END IF;
                            close Cur_PuchOdrInst_UNIT_QTY_TYP;
--//20031211 ins ↓
                          --//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
                          --//小数第5位切上げ
                            numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
                                                      Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
                          --//出庫単位数分母 = 親データ.出庫単位数分母 * 子データ出庫単位数分母
                          --//小数第5位切上げ
                            numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
                                                              Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
                          --//出庫単位数分子 = 親データ.出庫単位数分子 * 子データ出庫単位数分子
                          --//小数第5位切上げ
                            numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
                                                            Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
--//20031211 ins ↑
                            if LNumISSUE_INST_UNIT_QTY_TYP = 1 then --//親品目在庫数量単位区分 1:整数管理、2:小数管理
                                --親品目出庫指示数
                                numISSUE_INST_QTY := ceil(pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
                            else
                                --親品目出庫指示数
                                numISSUE_INST_QTY := ceil((pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                            end if;

                            if LNumUNIT_QTY_TYP = 1 then --//子品目在庫数量単位区分 1:整数管理、2:小数管理
--vc2RunChkComment := '★★★★通過 00130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T);
--20031211                              --//出庫単位数分母 = 親データ.出庫単位数分母 * 子データ出庫単位数分母
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
--20031211                              --//出庫単位数分子 = 親データ.出庫単位数分子 * 子データ出庫単位数分母
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T);
                              --//出庫指示数 =   作業指示数 * (出庫指示単位数分子 / 出庫指示単位数分母)
                              --//小数切上げ
--                                numISSUE_INST_QTY := ceil(pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR);
--20031210                                numISSUE_INST_QTY := ceil((numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * pnumOprInstQty ); --nesn
                                if SYS_SPOIL_FLG = 1 then
                                  --子品目出庫指示数
                                  numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T); 
                                else
                                  --子品目出庫指示数
                                  numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T);
                                end if;
                            else
--vc2RunChkComment := '★★★★通過 00140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
--20031211                              --//小数第5位切上げ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
--20031211                              --//出庫単位数分母 = 親データ.出庫単位数分母 * 子データ出庫単位数分母
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
--20031211                              --//出庫単位数分子 = 親データ.出庫単位数分子 * 子データ出庫単位数分子
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
                              --//出庫指示数 =   作業指示数 * (出庫指示単位数分子 / 出庫指示単位数分母)
                              --//小数第5位切上げ
--                                numISSUE_INST_QTY := ceil(pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR * 10000) / 10000;
--20031210                                numISSUE_INST_QTY := ceil((numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * pnumOprInstQty * 10000) / 10000; --nesn
                                if SYS_SPOIL_FLG = 1 then
                                  --子品目出庫指示数
                                  numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; 
                                else
                                  --子品目出庫指示数
                                  numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                                end if;
                            end if;
                        END IF;
                        EXIT WHEN Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp
                                   or LNumCntCurr_ISSUE_INST >= LLngCntMax;
                        LNumCntCurr_ISSUE_INST := LNumCntCurr_ISSUE_INST + 1;
                    end loop;
                    LNumCntCurr_ISSUE_INST := 0;
                else
--vc2RunChkComment := '★★★★通過 00150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// 出庫指示単位数
                    numISSUE_INST_UNIT_QTY := Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T;
                    --// 出庫指示単位数分母 nens 0830
                    numISSUE_INST_UNIT_DENOMINATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                    --// 出庫指示単位数分子 nesn 0830
                    numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T;
                    --// 在庫数量単位区分の取得
                    open Cur_PuchOdrInst_UNIT_QTY_TYP
                            (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                    IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                        RAISE excUNIT_QTY_TYP_ERR;
                    END IF;
                    close Cur_PuchOdrInst_UNIT_QTY_TYP;
                    if LNumUNIT_QTY_TYP = 1 then --//在庫数量単位区分 1:整数管理、2:小数管理
                      --//出庫指示数 =   作業指示数 * (出庫指示単位数分子 / 出庫指示単位数分母) nesn
                      --//小数切上げ
--nesn                  numISSUE_INST_QTY := ceil(numISSUE_INST_UNIT_QTY * pnumOprInstQty);
--20031210                        numISSUE_INST_QTY := ceil( pnumOprInstQty * ( numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR )); --nesn 0830
                        if SYS_SPOIL_FLG  = 1 then
                          numISSUE_INST_QTY := ceil( ( pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                             numISSUE_INST_UNIT_NUMERATOR ) / numISSUE_INST_UNIT_DENOMINATOR ); --//20031210
                        else
                          numISSUE_INST_QTY := ceil( ( pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR ) / numISSUE_INST_UNIT_DENOMINATOR ); --//20031210
                        end if;
                        
                    else
                      --//出庫指示数 =   作業指示数 * (出庫指示単位数分子 / 出庫指示単位数分母) nesn
                      --//小数第5位切上げ
--20031210                        numISSUE_INST_QTY := ceil(pnumOprInstQty * ( numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR ) * 10000) / 10000; --nesn 0830
                        if SYS_SPOIL_FLG = 1 then
                          numISSUE_INST_QTY := ceil(((pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                              numISSUE_INST_UNIT_NUMERATOR) / numISSUE_INST_UNIT_DENOMINATOR ) * 10000) / 10000; --//20031210
                        else
                          numISSUE_INST_QTY := ceil(((pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR) / numISSUE_INST_UNIT_DENOMINATOR ) * 10000) / 10000; --//2003
                        end if;
                    end if;
                end if;
                --// 出庫累計数
                numTOTAL_ISSUE_QTY := 0;
                --// 出庫予定日
                dtmSCDL_ISSUE_DATE := Typ_REC(LNumCntCurr).TypSCDL_ISSUE_DATE_T;
                --// 出庫完了日
                dtmISSUE_CMPLT_DATE := NULL;
                --// 出庫指示出庫区分
                numISSUE_TYP := Typ_REC(LNumCntCurr).TypISSUE_TYP_T;
                --// 出庫完了フラグ
                numISSUE_CMPLT_FLG := 0;
                --// 出庫指示書発行済みフラグ
                numISSUE_INST_ISS_FLG := 0;
                --// 出庫指示書発行日
                dtmISSUE_INST_DATE := NULL;
                --// 出庫指示備考
                vc2ISSUE_INST_COMMENT := '';
                --// 工場コード
                vc2PLANT_CD := Typ_REC(LNumCntCurr).TypPLANT_CD_T;
                LNumCntMax_ISSUE_INST := LNumCntMax_ISSUE_INST + 1;
--vc2RunChkComment := '★★★★通過 00160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

-- ▼▼ 2008/08/11 ADD START -TSUCHIDA ▼▼
				-- 工数管理品目区分取得
				OPEN Cur_Manhour_Typ(vc2ITEM_CD);
				FETCH Cur_Manhour_Typ into numManhourTyp;
				CLOSE Cur_Manhour_Typ;

				-- 工数管理品目区分が1の場合出庫指示に追加しない
				IF numManhourTyp != 1 THEN
-- ▲▲ 2008/08/11 ADD END -TSUCHIDA ▲▲
                --出庫指示追加
                insert into T_ISSUE_INST (
                ISSUE_INST_CD,
                PLANT_CD,
                OD_NO,
                ITEM_CD,
                PS_EDITION,
                PUCH_ODR_CD,
                COMPANY_CD,
                VEND_CD,
                CONS_TYP,
                WORK_ODR_CD,
                WORK_IN_PROC_CD,
                WS_CD,                          --// 作業区コード nesn
                WH_CD,                          --// 工程保管場所コード nesn
                ISSUE_INST_UNIT_QTY,
                ISSUE_INST_UNIT_DENOMINATOR,
                ISSUE_INST_UNIT_NUMERATOR,
                ISSUE_INST_QTY,
                TOTAL_ISSUE_QTY,
                SCDL_ISSUE_DATE,
                ISSUE_CMPLT_DATE,
                ISSUE_TYP,
                ISSUE_CMPLT_FLG,
                ISSUE_INST_ISS_FLG,
                ISSUE_INST_ISS_DATE,
                ISSUE_INST_COMMENT,
                CREATED_DATE,
                CREATED_BY,
                CREATED_PRG_NM,                 --// 作成プログラム名 nesn
                UPDATED_DATE,
                UPDATED_BY,
                UPDATED_PRG_NM,                 --// 更新プログラム名 nesn
                MODIFY_COUNT                    --// 更新数 nesn
                )
                 values(
                vc2ISSUE_INST_CD,               --// 出庫指示番号
                vc2PLANT_CD,                    --// 工場コード
                vc2OD_NO,                       --// オーダデマンド番号
                vc2ITEM_CD,                     --// 出庫品目番号
                vc2PS_EDITION,                  --// 製品構成版数(所要品目構成版数)
                vc2PUCH_ODR_CD,                 --// 発注番号
                NULL,                           --// 会社コード
                NULL,                           --// 取引先コード
                0,                              --// 支給区分
                vc2WORK_ODR_CD,                 --// 作業計画番号
                vc2WORK_IN_PROC_CD,             --// 仕掛作業コード
                vc2WS_CD,                       --// 作業区コード nesn 
                vc2WH_CD,                       --// 工程保管場所コード nesn 
                numISSUE_INST_UNIT_QTY,         --// 出庫指示単位数
                numISSUE_INST_UNIT_DENOMINATOR, --// 出庫指示単位数分母 nesn
                numISSUE_INST_UNIT_NUMERATOR,   --// 出庫指示単位数分子 nesn
                numISSUE_INST_QTY,              --// 出庫指示数
                numTOTAL_ISSUE_QTY,             --// 出庫累計数
                dtmSCDL_ISSUE_DATE,             --// 出庫予定日
                dtmISSUE_CMPLT_DATE,            --// 出庫完了日
                numISSUE_TYP,                   --// 出庫指示出庫区分
                numISSUE_CMPLT_FLG,             --// 出庫完了フラグ
                numISSUE_INST_ISS_FLG,          --// 出庫指示書発行済みフラグ
                dtmISSUE_INST_DATE,             --// 出庫指示書発行日
                vc2ISSUE_INST_COMMENT,          --// 出庫指示備考
                SYSDATE,
                pvc2UserId,
                MY_SQL_NAME,                    --// 作成プログラム名 nesn
                SYSDATE,
                pvc2UserId,
                MY_SQL_NAME,                    --// 更新プログラム名 nesn
                0                               --// 更新数：登録時0 nesn
                );
-- ▼▼ 2008/08/11 ADD START -TSUCHIDA ▼▼
				END IF;
-- ▲▲ 2008/08/11 ADD END -TSUCHIDA ▲▲
            end if;
            LNumCntCurr := LNumCntCurr + 1;
        end loop;
--nesn    ELSIF  to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_ITEM)  THEN
    ELSIF  to_number(pvc2OprRsltTyp) IN (OPR_RSLT_TYP_PROC)  THEN  --nesn
    --作業指示実績(2)の場合
--vc2RunChkComment := '★★★★通過 10090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        LNumCntMax_ISSUE_INST := 0;
        LNumCntCurr := 0;
        loop
            exit when LLngCntMax <= LNumCntCurr;
        --//出庫指示データ（ＴＥＭＰ）の作成
        --//支給品出庫計画データ編集したデータを格納する。
        --//※この構造体を基に出庫指示データを追加する。
            --//作業計画別出庫計画データの出庫指示区分:1（通常、擬似品目の下位デマンドのみ抽出）。
            if Typ_REC(LNumCntCurr).TypMRP_ODR_TYP_T = 1 then
--vc2RunChkComment := '★★★★通過 10100';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --// 出庫指示番号(共通関数より取得＜自動採番＞) nesn引数変更
                --//引数:(ファイルハンドル、ＬＯＧモード、出力モード､
                --//      ユーザＩＤ､業務名、工場コード、検索結果)
                LBlnRet := FncGetNewIssInstCd(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,LGetNewPuchCd);
                IF LBlnRet = FALSE THEN
                    --// 出庫指示番号採番エラー
                    RAISE excERR_GET_NEW_INST_CD;
                END IF;
                vc2ISSUE_INST_CD := LGetNewPuchCd;
                --// オーダデマンド番号
                vc2OD_NO := Typ_REC(LNumCntCurr).TypOD_NO_T;
                --// 出庫品目番号
                vc2ITEM_CD := Typ_REC(LNumCntCurr).TypITEM_CD_T;
                --// 製品構成版数(所要品目構成版数)
                vc2PS_EDITION := Typ_REC(LNumCntCurr).TypPS_EDITION_T;
                --// 発注番号
                vc2PUCH_ODR_CD := Typ_REC(LNumCntCurr).TypPUCH_ODR_CD_T;
                --// 作業計画番号
                vc2WORK_ODR_CD := pvc2WorkOdrCd;
                --// 仕掛作業コード
                vc2WORK_IN_PROC_CD := pvc2WorkInProcCd;
              --// 作業系列別仕掛検索 nesn
                OPEN Cur_Proc_By_Proc ;
                FETCH Cur_Proc_By_Proc INTO numOUTSIDE_TYP, vc2WS_CD, vc2COMPANY_CD, vc2VEND_CD, vc2PUCH_ODR_CD ;
                IF Cur_Proc_By_Proc%FOUND = FALSE THEN
                   RAISE excT_WORK_IN_PROC_BY_PROC_ERR;
                END IF;
                CLOSE Cur_Proc_By_Proc ;

                --// 作業区コード＆工程保管場所コード設定 nesn
                --// 作業区コード：内作時は作業系列別仕掛より設定。外作時はNULL。
                --// 工程保管場所コード：外作時は最初の内作工程の作業区コードを用いる。
                IF (numOUTSIDE_TYP = 1) THEN
                    --// 作業区検索＆工程保管場所コード設定 nesn
                    OPEN Cur_M_Ws(vc2WS_CD) ;
                    FETCH Cur_M_Ws INTO vc2WH_CD ;
                    IF Cur_M_Ws%FOUND = FALSE THEN
                       RAISE excM_WS_ERR;
                    END IF;                    
                    CLOSE Cur_M_Ws ;
                    numCONS_TYP := 0;     --add 20030923 内作時支給区分0固定
                ELSE
                    vc2WS_CD2 := '';
                    OPEN Cur_Proc_Ws_Cd(vc2WORK_ODR_CD) ; --20031008修正
                    FETCH Cur_Proc_Ws_Cd INTO vc2WS_CD2 ;
                    IF Cur_Proc_Ws_Cd%FOUND = FALSE THEN
                     --取得できない場合はどうするか保留
                       vc2WH_CD := ''; --20031008修正 RAISE excM_WS_ERR2;
                    END IF;                    
                    CLOSE Cur_Proc_Ws_Cd ;

                    IF vc2WS_CD2 IS NOT NULL THEN
                        OPEN Cur_M_Ws(vc2WS_CD2) ; --20031008追加
                        FETCH Cur_M_Ws INTO vc2WH_CD ;
                        IF Cur_M_Ws%FOUND = FALSE THEN
                            RAISE excM_WS_ERR;
                        END IF;                    
                        CLOSE Cur_M_Ws ;
                    END IF;

                    vc2WS_CD := '' ;
                    numCONS_TYP := 0;
                    
                END IF;
                  
                --// 出庫指示単位数、出庫指示単位数分母、出庫指示単位数分子、出庫指示数 nesn
                --// 擬似品目展開フラグ(0:OFF,1:ON)
                if Typ_REC(LNumCntCurr).TypODINFO_DISGUISE_T = 1 then
--vc2RunChkComment := '★★★★通過 10110';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// パラメータの「仕掛作業コード」≠初工程の場合
                    IF pvc2WorkInProcCd <> vc2WorkInProcCd THEN
                        --//出庫指示へ出力しない
                        numISSUE_INST_QTY := 0;
                    ELSE
                    --//親データの出庫単位数を取得
                    --//親オーダデマンド番号の退避
                        LNumPARENT_OD_NoTemp := Typ_REC(LNumCntCurr).TypPARENT_OD_NO_T;
                        LNumCntCurr_ISSUE_INST := 0;
                        loop
                            IF Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp THEN
                                --// 親品目在庫数量単位区分の取得
--vc2RunChkComment := '★★★★通過 10120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                                open Cur_PuchOdrInst_UNIT_QTY_TYP
                                        (Typ_REC(LNumCntCurr_ISSUE_INST).TypITEM_CD_T);
                                fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumISSUE_INST_UNIT_QTY_TYP;
                                IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                    RAISE excUNIT_QTY_TYP_ERR;
                                END IF;
                                close Cur_PuchOdrInst_UNIT_QTY_TYP;
                                --// 子品目在庫数量単位区分の取得
--vc2RunChkComment := '★★★★通過 10120';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                                open Cur_PuchOdrInst_UNIT_QTY_TYP
                                        (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                                fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                                IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                                    RAISE excUNIT_QTY_TYP_ERR;
                                END IF;
                                close Cur_PuchOdrInst_UNIT_QTY_TYP;
--//20031211 ins ↓
                              --//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
                              --//小数第5位切上げ
                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
                                                          Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
                              --//出庫単位数分母 = 親データ.出庫単位数分母 * 子データ出庫単位数分母
                              --//小数第5位切上げ
                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
                                                                  Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
                              --//出庫単位数分子 = 親データ.出庫単位数分子 * 子データ出庫単位数分子
                              --//小数第5位切上げ
                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
                                                                Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
--//20031211 ins ↑
                                if LNumISSUE_INST_UNIT_QTY_TYP = 1 then --//親品目在庫数量単位区分 1:整数管理、2:小数管理
                                    --親品目出庫指示数
                                    numISSUE_INST_QTY := ceil(pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
                                else
                                    --親品目出庫指示数
                                    numISSUE_INST_QTY := ceil((pnumOprInstQty * Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; 
                                end if;
                                if LNumUNIT_QTY_TYP = 1 then --//在庫数量単位区分 1:整数管理、2:小数管理
--vc2RunChkComment := '★★★★通過 10130';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T);
--20031211                              --//出庫単位数分母 = 親データ.出庫単位数分母 * 子データ出庫単位数分母
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T);
--20031211                              --//出庫単位数分子 = 親データ.出庫単位数分子 * 子データ出庫単位数分子
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T);
                                  --//出庫指示数 =   作業指示数 *  ( 出庫指示単位数分子 / 出庫指示単位数分母) nesn
                                  --//小数切上げ
--20031210                                numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR)); --nesn 0830
                                    if SYS_SPOIL_FLG = 1 then
                                      --子品目出庫指示数
                                      numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T); 
                                    else
                                      --子品目出庫指示数
                                      numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T);
                                    end if;
                                else
--vc2RunChkComment := '★★★★通過 10140';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--20031211                              --//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
--20031211                              --//小数第5位切上げ
--20031211                                numISSUE_INST_UNIT_QTY := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_QTY_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T * 10000) / 10000;
--20031211                              --//出庫単位数分母 = 親データ.出庫単位数分母 * 子データ出庫単位数分母
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_DENOMINATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_DENOMINATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T * 10000) / 10000;
--20031211                              --//出庫単位数分子 = 親データ.出庫単位数分子 * 子データ出庫単位数分子
--20031211                              --//小数切上げ
--20031211                                numISSUE_INST_UNIT_NUMERATOR := ceil(Typ_REC(LNumCntCurr_ISSUE_INST).TypPS_UNIT_NUMERATOR_T *
--20031211                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T * 10000) / 10000;
                                  --//出庫指示数 =   作業指示数 *  ( 出庫指示単位数分子 / 出庫指示単位数分母) nesn
                                  --//小数第5位切上げ
--20031210                                numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * 10000) / 10000;
                                    if SYS_SPOIL_FLG = 1 then
                                      --子品目出庫指示数
                                      numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; --//20031210
                                    else
                                      --子品目出庫指示数
                                      numISSUE_INST_QTY := ceil((numISSUE_INST_QTY * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T) * 10000) / 10000; --//2003121
                                    end if;
                                end if;
                            END IF;
                            EXIT WHEN Typ_REC(LNumCntCurr_ISSUE_INST).TypOD_NO_T = LNumPARENT_OD_NoTemp
                                       or LNumCntCurr_ISSUE_INST >= LLngCntMax;
                            LNumCntCurr_ISSUE_INST := LNumCntCurr_ISSUE_INST + 1;
                        end loop;
                        LNumCntCurr_ISSUE_INST := 0;
                    END IF;
                else
--vc2RunChkComment := '★★★★通過 10150';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    --// 出庫指示単位数
                    numISSUE_INST_UNIT_QTY := Typ_REC(LNumCntCurr).TypPS_UNIT_QTY_T;
                    --// 出庫指示単位数分母 nesn 0830
                    numISSUE_INST_UNIT_DENOMINATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                    --// 出庫指示単位数分子 nesn 0830
                    numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T;
                    --// 払出指示数または出庫指示数を求める
                    IF pvc2WorkInProcCd <> vc2WorkInProcCd THEN
                    --// パラメータの「仕掛作業コード」≠初工程の場合
                       IF SYS_SPOIL_FLG = 1 THEN
                         numOprInstQty :=  pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100);
                       ELSE
                         numOprInstQty :=  pnumOprInstQty;
                       END IF;
                    
					IF Typ_REC(LNumCntCurr).TypPATTERN_CD_T IS NULL THEN

					/* [パターン別払出]."パターンコード"がNullの場合 */
                    /* [払出].払出単位数分子を使用し払出指示数の取得（初工程以外の払出指示数） */
                        OPEN Cur_Issue_Qty_Next(
                               pvc2PlantCd,                                   --// 工場コード
                               vc2ParentItemCd,                               --// 親品目番号
                               pvc2WorkInProcCd,                              --// 仕掛作業コード
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// 出庫品目番号
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// 出庫品目構成版数
                               numOprInstQty, --// 作業指示数
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T  --// 製品構成単位数分母（出庫指示単位数分母）
                        );
                        --FETCH Cur_Issue_Qty_Next INTO numIssueQty;
                        FETCH Cur_Issue_Qty_Next INTO numIssueQty, numIssueNumerator;
                        IF Cur_Issue_Qty_Next%FOUND = FALSE THEN
                            numIssueQty := 0; --// データがない時は、払出指示数を0とする
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_Next;
                        numISSUE_INST_QTY := numIssueQty;
                        
                        numISSUE_INST_UNIT_NUMERATOR :=  numIssueNumerator;
                        
                    ELSE
                    /* [パターン別払出]."パターンコード"がNull以外の場合 */
                    /* [パターン別払出].払出単位数分子を使用し払出指示数の取得（初工程以外の払出指示数） */
                        OPEN Cur_Issue_Qty_Next_Pattern(
                               pvc2PlantCd,                                   --// 工場コード
                               vc2ParentItemCd,                               --// 親品目番号
                               pvc2WorkInProcCd,                              --// 仕掛作業コード
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// 出庫品目番号
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// 出庫品目構成版数
                               numOprInstQty, --// 作業指示数
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T,  --// 製品構成単位数分母（出庫指示単位数分母）
                               Typ_REC(LNumCntCurr).TypPATTERN_CD_T  		  --// パターンコード
                        );
                        --FETCH Cur_Issue_Qty_Next_Pattern INTO numIssueQty;
                        FETCH Cur_Issue_Qty_Next_Pattern INTO numIssueQty, numIssueNumerator;
                        IF Cur_Issue_Qty_Next_Pattern%FOUND = FALSE THEN
                            numIssueQty := 0; --// データがない時は、払出指示数を0とする
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_Next_Pattern;
                        numISSUE_INST_QTY := numIssueQty;
                        
                        numISSUE_INST_UNIT_NUMERATOR :=  numIssueNumerator;
                        
                    END IF;
                        
                    ELSE
					--// パラメータの「仕掛作業コード」＝初工程の場合
					
                    IF Typ_REC(LNumCntCurr).TypPATTERN_CD_T IS NULL THEN
                    /* [パターン別払出]."パターンコード"がNullの場合 */
                    /* [払出].払出単位数分子を使用し払出指示数の取得（初工程以外の払出指示数） */
                        OPEN Cur_Issue_Qty_First(
                               pvc2PlantCd,                                   --// 工場コード
                               vc2ParentItemCd,                               --// 親品目番号
                               pvc2WorkInProcCd,                              --// 仕掛作業コード
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// 出庫品目番号
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// 出庫品目構成版数
                               pnumOprInstQty,                                --// 作業指示数
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T  --// 製品構成単位数分母（出庫指示単位数分母）
                        );
                        
                        --FETCH Cur_Issue_Qty_First INTO numIssueQty;
                        --FETCH Cur_Issue_Qty_First INTO numIssueQty, numIssueNumerator ;
                        FETCH Cur_Issue_Qty_First INTO numIssueNumerator ;
                        
                        IF Cur_Issue_Qty_First%FOUND = FALSE THEN
                            --numIssueQty := 0; --// データがない時は、払出指示数を0とする
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_First;
                        --// 必要指示数を求める
                        --// 「作業指示数」（パラメータ） * [出庫計画].製品構成単位数分子（出庫指示単位数分子）
                        --//                    / [出庫計画].製品構成単位数分母（出庫指示単位数分母）
                        --numNeedQty := pnumOprInstQty * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T
                        --                    / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;

                        numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T - numIssueNumerator;
 
                        IF SYS_SPOIL_FLG = 1 THEN                        
						  --出庫指示数=「作業指示数」×上記の「出庫指示単位数分子」/[出庫計画]."出庫指示単位数分母"
                          --numISSUE_INST_QTY := numNeedQty - numIssueQty;
                          numISSUE_INST_QTY := pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                           numISSUE_INST_UNIT_NUMERATOR /Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        ELSE
                          numISSUE_INST_QTY := pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR /
                                                        Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        END IF;

                    ELSE
                    
                    /* [パターン別払出]."パターンコード"がNull以外の場合 */
                    /* [パターン別払出].払出単位数分子を使用し払出指示数の取得（初工程以外の払出指示数） */
                        OPEN Cur_Issue_Qty_First_Pattern(
                               pvc2PlantCd,                                   --// 工場コード
                               vc2ParentItemCd,                               --// 親品目番号
                               pvc2WorkInProcCd,                              --// 仕掛作業コード
                               Typ_REC(LNumCntCurr).TypITEM_CD_T,             --// 出庫品目番号
                               Typ_REC(LNumCntCurr).TypPS_EDITION_T,          --// 出庫品目構成版数
                               pnumOprInstQty,                                --// 作業指示数
                               Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T,  --// 製品構成単位数分母（出庫指示単位数分母）
                               Typ_REC(LNumCntCurr).TypPATTERN_CD_T  --// パターンコード
                        );
                        --FETCH Cur_Issue_Qty_First_Pattern INTO numIssueQty;
						--FETCH Cur_Issue_Qty_First_Pattern INTO numIssueQty, numIssueNumerator;
						FETCH Cur_Issue_Qty_First_Pattern INTO numIssueNumerator;
                        IF Cur_Issue_Qty_First_Pattern%FOUND = FALSE THEN
                            --numIssueQty := 0; --// データがない時は、払出指示数を0とする
                            numIssueNumerator := 0;
                        END IF;
                        CLOSE Cur_Issue_Qty_First_Pattern;
                        --// 必要指示数を求める
                        --// 「作業指示数」（パラメータ） * [出庫計画].製品構成単位数分子（出庫指示単位数分子）
                        --//                    / [出庫計画].製品構成単位数分母（出庫指示単位数分母）
                        --numNeedQty := pnumOprInstQty * Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T
                        --                    / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;

                        numISSUE_INST_UNIT_NUMERATOR := Typ_REC(LNumCntCurr).TypPS_UNIT_NUMERATOR_T - numIssueNumerator;

                        
                        IF SYS_SPOIL_FLG = 1 THEN 
						  --出庫指示数=「作業指示数」×上記の「出庫指示単位数分子」/[出庫計画]."出庫指示単位数分母"
                          --numISSUE_INST_QTY := numNeedQty - numIssueQty;
                          numISSUE_INST_QTY := pnumOprInstQty * (1+Typ_REC(LNumCntCurr).TypPS_SPOIL/100) * 
                                                            numISSUE_INST_UNIT_NUMERATOR/ Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        ELSE
                          numISSUE_INST_QTY := pnumOprInstQty * numISSUE_INST_UNIT_NUMERATOR / Typ_REC(LNumCntCurr).TypPS_UNIT_DENOMINATOR_T;
                        END IF;
                        
                    END IF;
                        
                    END IF;
                    --// 在庫数量単位区分の取得
                    open Cur_PuchOdrInst_UNIT_QTY_TYP
                            (Typ_REC(LNumCntCurr).TypITEM_CD_T);
                            fetch Cur_PuchOdrInst_UNIT_QTY_TYP into LNumUNIT_QTY_TYP;
                    IF Cur_PuchOdrInst_UNIT_QTY_TYP%FOUND = FALSE THEN
                        RAISE excUNIT_QTY_TYP_ERR;
                    END IF;
                    close Cur_PuchOdrInst_UNIT_QTY_TYP;
                    if LNumUNIT_QTY_TYP = 1 then --//在庫数量単位区分 1:整数管理、2:小数管理
--                        numISSUE_INST_QTY := ceil(numISSUE_INST_UNIT_QTY * pnumOprInstQty);
--20031210                        numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR)); --nesn 0830
                      --//出庫指示数
                      --//小数切上げ
                        numISSUE_INST_QTY := ceil(numISSUE_INST_QTY);
						numISSUE_INST_UNIT_QTY := ceil(numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR);
                    else
                      --//出庫指示数 =   作業指示数 *  ( 出庫指示単位数分子 / 出庫指示単位数分母)
                      --//小数第5位切上げ
--                        numISSUE_INST_QTY := ceil(numISSUE_INST_UNIT_QTY * pnumOprInstQty * 10000) / 10000;
--20031210                         numISSUE_INST_QTY := ceil(pnumOprInstQty * (numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * 10000) / 10000;  --nesn 0830
                         numISSUE_INST_QTY := ceil(numISSUE_INST_QTY * 10000) / 10000;
						 numISSUE_INST_UNIT_QTY := ceil((numISSUE_INST_UNIT_NUMERATOR / numISSUE_INST_UNIT_DENOMINATOR) * 10000) / 10000;
                    end if;
                end if;
                --// 出庫累計数
                numTOTAL_ISSUE_QTY := 0;
                --// 出庫予定日
                dtmSCDL_ISSUE_DATE := Typ_REC(LNumCntCurr).TypSCDL_ISSUE_DATE_T;
                --// 出庫完了日
                dtmISSUE_CMPLT_DATE := NULL;
                --// 出庫指示出庫区分
                numISSUE_TYP := Typ_REC(LNumCntCurr).TypISSUE_TYP_T;
                --// 出庫完了フラグ
                numISSUE_CMPLT_FLG := 0;
                --// 出庫指示書発行済みフラグ
                numISSUE_INST_ISS_FLG := 0;
                --// 出庫指示書発行日
                dtmISSUE_INST_DATE := NULL;
                --// 出庫指示備考
                vc2ISSUE_INST_COMMENT := '';
                --// 工場コード
                vc2PLANT_CD := Typ_REC(LNumCntCurr).TypPLANT_CD_T;
                LNumCntMax_ISSUE_INST := LNumCntMax_ISSUE_INST + 1;
                --// 出庫指示数（計算で求めた払出指示数および出庫指示数）が０以外の時、出庫指示へ追加する
                IF numISSUE_INST_QTY <> 0 THEN
--vc2RunChkComment := '★★★★通過 10160';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
-- ▼▼ 2008/08/11 ADD START -TSUCHIDA ▼▼
					-- 工数管理品目区分取得
					OPEN Cur_Manhour_Typ(vc2ITEM_CD);
					FETCH Cur_Manhour_Typ into numManhourTyp;
					CLOSE Cur_Manhour_Typ;

					-- 工数管理品目区分が1の場合出庫指示に追加しない
					IF numManhourTyp != 1 THEN
-- ▲▲ 2008/08/11 ADD END -TSUCHIDA ▲▲
                    --出庫指示追加
                    insert into T_ISSUE_INST (
                    ISSUE_INST_CD,
                    PLANT_CD,
                    OD_NO,
                    ITEM_CD,
                    PS_EDITION,
                    PUCH_ODR_CD,
                    COMPANY_CD,                     --// 会社コード nesn
                    VEND_CD,                        --// 取引先コード nesn
                    CONS_TYP,                       --// 支給区分 nesn 
                    WORK_ODR_CD,
                    WORK_IN_PROC_CD,
                    WS_CD,                          --// 作業区コード nesn
                    WH_CD,                          --// 工程保管場所コード nesn         
                    ISSUE_INST_UNIT_QTY,
                    ISSUE_INST_UNIT_DENOMINATOR,
                    ISSUE_INST_UNIT_NUMERATOR,
                    ISSUE_INST_QTY,
                    TOTAL_ISSUE_QTY,
                    SCDL_ISSUE_DATE,
                    ISSUE_CMPLT_DATE,
                    ISSUE_TYP,
                    ISSUE_CMPLT_FLG,
                    ISSUE_INST_ISS_FLG,
                    ISSUE_INST_ISS_DATE,
                    ISSUE_INST_COMMENT,
                    CREATED_DATE,
                    CREATED_BY,
                    CREATED_PRG_NM,                 --// 作成プログラム名 nesn
                    UPDATED_DATE,
                    UPDATED_BY,
                    UPDATED_PRG_NM,                 --// 更新プログラム名 nesn
                    MODIFY_COUNT                    --// 更新数 nesn 
                    )
                     values(
                    vc2ISSUE_INST_CD,               --// 出庫指示番号
                    vc2PLANT_CD,                    --// 工場コード
                    vc2OD_NO,                       --// オーダデマンド番号
                    vc2ITEM_CD,                     --// 出庫品目番号
                    vc2PS_EDITION,                  --// 製品構成版数(所要品目構成版数)
                    vc2PUCH_ODR_CD,                 --// 発注番号
                    vc2COMPANY_CD,                  --// 会社コード nesn
                    vc2VEND_CD,                     --// 取引先コード nesn
                    numCONS_TYP,                    --// 支給区分 nesn 
                    vc2WORK_ODR_CD,                 --// 作業計画番号
                    vc2WORK_IN_PROC_CD,             --// 仕掛作業コード
                    vc2WS_CD,                       --// 作業区コード nesn 
                    vc2WH_CD,                       --// 工程保管場所コード nesn 
                    numISSUE_INST_UNIT_QTY,         --// 出庫指示単位数
                    numISSUE_INST_UNIT_DENOMINATOR, --// 出庫指示単位数分母 nesn
                    numISSUE_INST_UNIT_NUMERATOR,   --// 出庫指示単位数分子 nesn
                    numISSUE_INST_QTY,              --// 出庫指示数
                    numTOTAL_ISSUE_QTY,             --// 出庫累計数
                    dtmSCDL_ISSUE_DATE,             --// 出庫予定日
                    dtmISSUE_CMPLT_DATE,            --// 出庫完了日
                    numISSUE_TYP,                   --// 出庫指示出庫区分
                    numISSUE_CMPLT_FLG,             --// 出庫完了フラグ
                    numISSUE_INST_ISS_FLG,          --// 出庫指示書発行済みフラグ
                    dtmISSUE_INST_DATE,             --// 出庫指示書発行日
                    vc2ISSUE_INST_COMMENT,          --// 出庫指示備考
                    SYSDATE,
                    pvc2UserId,
                    MY_SQL_NAME,                    --// 作成プログラム名 nesn
                    SYSDATE,
                    pvc2UserId,
                    MY_SQL_NAME,                    --// 更新プログラム名 nesn
                    0                               --// 更新数：登録時0 nesn
                    );
-- ▼▼ 2008/08/11 ADD START -TSUCHIDA ▼▼
					END IF;
-- ▲▲ 2008/08/11 ADD END -TSUCHIDA ▲▲
                end if;
              END IF;
            LNumCntCurr := LNumCntCurr + 1;
        end loop;
    END IF;


--END IF;



    --// 出庫指示ファイルへ追加
--vc2RunChkComment := '★★★★通過 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    LNumCntCurr := 0;
--vc2RunChkComment := '★★★★通過 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --トレースログ（end）nesn
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
    RETURN true;
--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excUNIT_QTY_TYP_ERR THEN   --在庫数量単位区分取得エラー
--DBMS_OUTPUT.PUT_LINE('在庫数量単位区分取得エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0036)在庫数量単位区分取得エラー',1,1024);
        /* 終了メッセージの出力 */ -- nesn 引数変更
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
        RETURN FALSE;
   WHEN excNOTEXIST_SYS_PARAMETER THEN   --パラメータデータが存在しません
    
        /* 異常終了のメッセージ */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             METHOD_END ||'(SBM0037)' || LOGMSG_ERR || '：' || 'パラメータの取得に失敗しました。');
                             

        /* TraceLog の出力（実行位置） */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END || vc2RunChkComment);


        /* TraceLogの出力 */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END);
                                    
        RETURN False;
    
    WHEN excERR_GET_NEW_INST_CD THEN   --出庫指示番号採番エラー
--DBMS_OUTPUT.PUT_LINE('出庫指示番号採番エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0038)出庫指示番号採番エラー',1,1024);
        /* 終了メッセージの出力 */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excT_WORK_IN_PROC_BY_ITEM_ERR THEN   --品目別仕掛取得エラー nesn
--DBMS_OUTPUT.PUT_LINE('品目別仕掛取得エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0039)品目別仕掛取得エラー',1,1024);
        /* 終了メッセージの出力 */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_WS_ERR THEN   --作業区．保管区コード取得エラー nesn
--DBMS_OUTPUT.PUT_LINE('作業区．保管区コード取得エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0040)作業区．保管区コード取得エラー',1,1024);
        /* 終了メッセージの出力 */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excT_WORK_IN_PROC_BY_PROC_ERR THEN   --作業系列別仕掛取得エラー nesn
--DBMS_OUTPUT.PUT_LINE('作業系列別仕掛取得エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0041)作業系列別仕掛取得エラー',1,1024);
        /* 終了メッセージの出力 */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_WS_ERR2 THEN   --内作初工程による作業区．保管区コード取得エラー nesn
--DBMS_OUTPUT.PUT_LINE('内作初工程による作業区．保管区コード取得エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0042)内作初工程による作業区．保管区コード取得エラー',1,1024);
        /* 終了メッセージの出力 */ -- nesn
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_PARENT_ITEM_ERR THEN   --[品目別仕掛].品目番号(親品目番号)の取得エラー
--DBMS_OUTPUT.PUT_LINE('[品目別仕掛].品目番号(親品目番号)の取得エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0043)[品目別仕掛].品目番号(親品目番号)の取得エラー',1,1024);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN excM_FIRST_PROC_ERR THEN   --[作業系列別仕掛].仕掛作業コード(初工程)の取得エラー
--DBMS_OUTPUT.PUT_LINE('[作業系列別仕掛].仕掛作業コード(初工程)の取得エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0044)[作業系列別仕掛].仕掛作業コード(初工程)の取得エラー',1,1024);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        COMMIT;
        --トレースログ（end）
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
    WHEN OTHERS THEN   --その他のエラー
--DBMS_OUTPUT.PUT_LINE('その他のエラー');
        ROLLBACK;
        vc2Comment := SUBSTRB(SQLCODE || SQLERRM,1,1024);
        /* 終了メッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog の出力（実行位置） */ -- nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        COMMIT;
        --トレースログ（end）nesn
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                       pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);
    RETURN FALSE;
END;
/
