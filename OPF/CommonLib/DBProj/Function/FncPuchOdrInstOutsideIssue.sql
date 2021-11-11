CREATE OR REPLACE FUNCTION FNCPUCHODRINSTOUTSIDEISSUE(
/*------------------------------------------------------------------------------
' $Id: FncPuchOdrInstOutsideIssue.sql,v 1.13 2015/12/03 09:10:31 geng-jia Exp $
' version   : 1.00.08
'
' 修正履歴
' 2003.09.22 初版
' 2003.10.01 出庫指示作成時の異常終了対応   Hnes.T.Sugano
' 2003.10.02 デバック用ロジックのコメント化 Hnes.T.Sugano
' 2003.11.19 少数点切上げロジックの修正[Bug#:781] HNES.T.SUGANO
' 2003.12.05 擬似品目有りかつ小数点管理の場合の誤差修正[Bug#:837] HNES.T.SUGANO
' 2003.12.06 製番品で追加発注した場合、出庫指示数が過剰になる不具合の修正[Bug#:860] HNES.T.SUGANO
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
' 2006.09.26 保管区コードを取得する際に工場コードを検索条件に入れる
' 2006.09.28 親が擬似品目の場合、親の出庫指示単位数分母・分子を考慮した出庫指示数にするように修正。
'
' 機能      : 出庫指示処理（外作）<メモリ>
'
' 戻り値    : Boolean
'               True :正常終了（出庫指示処理（外作）が行えた時）
'               False:異常終了（出庫指示処理（外作）に失敗した時）
'
' 引き数    : ■MetamorBase共通（必須）
'             pFileHandle               - (i)ファイルハンドル
'             pvc2LogMode               - (i)ＬＯＧモード
'             pvc2OutputMode            - (i)出力モード
'             pvc2UserId                - (i)ユーザＩＤ
'             pvc2BusinessName          - (i)業務名
'             pvc2PlantCd               - (i)工場コード
'             ■プログラム固有
'             pvc2PuchOdrCd             -発注番号
'             pvc2OdNo                  -オーダデマンド番号
'             pnumPuchOdrQty            -発注数
'             pvc2CompanyCd             -会社コード
'             pvc2VendCd                -取引先コード
'             pvc2ErrorCd               -エラーコード
'
'
' 機能説明  : 発注指示確定に伴い、必要となる資材の出庫指示を作成する。
'             本処理は、外作品の発注情報に対する下位品目の出庫指示を、それぞれのデマンド
'             情報をもとに作成する。
'
' 備考      :
'
'
'
------------------------------------------------------------------------------*/
    pFileHandle             IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode             IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode          IN  VARCHAR2            --出力モード
   ,pvc2UserId              IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName        IN  VARCHAR2            --業務名
   ,pvc2PlantCd             IN  VARCHAR2            --工場コード
   ,pvc2PuchOdrCd           IN  VARCHAR2            --発注番号
   ,pvc2OdNo                IN  VARCHAR2            --オーダデマンド番号
   ,pnumPuchOdrQty          IN  NUMBER              --発注数
   ,pvc2CompanyCd           IN  VARCHAR2            --会社コード
   ,pvc2VendCd              IN  VARCHAR2            --取引先コード
   ,pvc2ErrorCd             OUT VARCHAR2            --エラーコード

) RETURN BOOLEAN
IS

    /* レコードの定義 */
    /* 所要量データ読込用 */
    TYPE sqlTmp_TOD is RECORD(
         sqlTmpOD_NO_TOD                VARCHAR2(100),  --オーダデマンド番号
         sqlTmpITEM_CD_TOD              VARCHAR2(100),  --品目番号
         sqlTmpPS_EDITION_TOD           VARCHAR2(100),  --製品構成版数(所要品目構成版数)
         sqlTmpPS_UNIT_QTY_TOD          NUMBER(18,4),  --製品構成単位数
         sqlTmpPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),  --製品構成単位数分母
         sqlTmpPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),  --製品構成単位数分子
         sqlTmpITEM_ODR_TYP_TOD         NUMBER(02),    --品目手配区分
         sqlTmpOD_TYP_TOD               NUMBER(02),    --オーダデマンド区分
         sqlTmpPARENT_OD_NO_TOD         VARCHAR2(100),  --親オーダデマンド番号
         sqlTmpODR_QTY_TOD              NUMBER(18,4),  --オーダ数(#837)
         sqlTmpISSUE_TYP_TOD            NUMBER(02),    --所要量出庫区分
         sqlTmpSCDL_ISSUE_DATE_TOD      DATE,           --出庫予定日
         sqlTmpPS_SPOIL                 NUMBER(9,4)       --所要量構成仕損率
        );
    typsqlCurr_REC      sqlTmp_TOD;

    TYPE sqlTmp_TOD_DISGUISE IS RECORD(    
         sqlTmpOD_NO_TOD                VARCHAR2(100),  --オーダデマンド番号
         sqlTmpITEM_CD_TOD              VARCHAR2(100),  --品目番号
         sqlTmpPS_EDITION_TOD           VARCHAR2(100),  --製品構成版数(所要品目構成版数)
         sqlTmpPS_UNIT_QTY_TOD          NUMBER(18,4),  --製品構成単位数
         sqlTmpPS_UNIT_DENOMINATOR_TOD  NUMBER(18,4),  --製品構成単位数分母
         sqlTmpPS_UNIT_NUMERATOR_TOD    NUMBER(18,4),  --製品構成単位数分子
         sqlTmpITEM_ODR_TYP_TOD         NUMBER(02),    --品目手配区分
         sqlTmpOD_TYP_TOD               NUMBER(02),    --オーダデマンド区分
         sqlTmpPARENT_OD_NO_TOD         VARCHAR2(100),  --親オーダデマンド番号
         sqlTmpODR_QTY_TOD              NUMBER(18,4),  --オーダ数(#837)
         sqlTmpISSUE_TYP_TOD            NUMBER(02),    --所要量出庫区分
         sqlTmpSCDL_ISSUE_DATE_TOD      DATE,           --出庫予定日
         sqlTmpPS_SPOIL                 NUMBER(9,4)       --所要量構成仕損率
        );
        
     typsqlCurr_REC_DISGUISE         sqlTmp_TOD_DISGUISE;

    /* 支給品出庫計画データ（ＴＥＭＰ）作成用 */
    TYPE sqlTmp is RECORD(
         sqlTmpPUCH_ODR_CD_T            VARCHAR2(100),  --発注番号
         sqlTmpOD_NO_T                  VARCHAR2(100),  --支給品オーダデマンド番号
         sqlTmpITEM_CD_T                VARCHAR2(100),  --支給品品目番号
         sqlTmpITEM_UNIT_QTY_TYP_T      VARCHAR2(100),  --在庫数単位区分
         sqlTmpPS_EDITION_T             VARCHAR2(100),  --支給品製品構成版数(所要品目構成版数)
         sqlTmpPS_UNIT_QTY_T            NUMBER(18,4),  --支給品製品構成単位数
         sqlTmpPS_UNIT_DENOMINATOR_T    NUMBER(18,4),  --支給品製品構成単位数分母
         sqlTmpPS_UNIT_NUMERATOR_T      NUMBER(18,4),  --支給品製品構成単位数分子
         sqlTmpTOTALISSUETYP_T          NUMBER(02),    --出庫指示累計数
         sqlTmpITEM_ODR_TYP_T           NUMBER(02),    --出庫指示区分(1:通常出庫、9:擬似品目出庫)
         sqlTmpODINFO_DISGUISE_T        NUMBER(02),    --擬似品目展開フラグ(0:OFF,1:ON)
         sqlTmpPARENT_OD_NO_T           VARCHAR2(100),  --親オーダデマンド番号
         sqlTmpODR_QTY_T                NUMBER(18,4),  --オーダ数(#837)
         sqlTmpISSUE_TYP_T              NUMBER(02),    --所要量出庫区分
         sqlTmpCONS_TYP_T               NUMBER(02),    --支給区分
         sqlTmpSCDL_ISSUE_DATE_T        DATE,           --出庫予定日
         sqlTmpPS_SPOIL                 NUMBER(9,4)       --所要量構成仕損率
        );

    TYPE sqlTmp_REC_T IS TABLE OF  sqlTmp INDEX BY BINARY_INTEGER;
         sqlTmp_REC  sqlTmp_REC_T;

    /* 出庫指示データ（ＴＥＭＰ）                      */
    /* 支給品出庫計画データ編集したデータを格納する。  */
    /* ※この構造体を基に出庫指示データを追加する。    */
    TYPE sqlTmp_ISSUE_INST is RECORD(
         sqlTmpISSUE_INST_CD            VARCHAR2(100),  --出庫指示番号（自動採番）
         sqlTmpPLANT_CD                 VARCHAR2(8),  --工場コード
         sqlTmpOD_NO                    VARCHAR2(100),  --オーダデマンド番号
         sqlTmpITEM_CD                  VARCHAR2(100),  --出庫品目番号
         sqlTmpPS_EDITION               VARCHAR2(100),  --製品構成版数(所要品目構成版数)
         sqlTmpPUCH_ODR_CD              VARCHAR2(100),  --発注番号
         sqlTmpCOMPANY_CD               VARCHAR2(100),  --会社コード
         sqlTmpVEND_CD                  VARCHAR2(100),  --取引先コード
         sqlTmpCONS_TYP                 NUMBER(02),    --支給区分
         sqlTmpWORK_ODR_CD              VARCHAR2(100),  --作業計画番号
         sqlTmpWORK_IN_PROC_CD          VARCHAR2(100),  --仕掛作業コード
         sqlTmpWS_CD                    VARCHAR2(100),  --作業区コード
         sqlTmpWH_CD                    VARCHAR2(100),  --工程保管場所コード
         sqlTmpISSUE_INST_UNIT_QTY      NUMBER(18,4),  --出庫指示単位数
         sqlTmpISSUE_INST_UNIT_DEN      NUMBER(18,4),  --出庫指示単位数分母
         sqlTmpISSUE_INST_UNIT_NUM      NUMBER(18,4),  --出庫指示単位数分子
         sqlTmpISSUE_INST_QTY           NUMBER(18,4),  --出庫指示数
         sqlTmpTOTAL_ISSUE_QTY          NUMBER(18,4),  --出庫累計数
         sqlTmpSCDL_ISSUE_DATE          DATE,          --出庫予定日
         sqlTmpISSUE_CMPLT_DATE         DATE,          --出庫完了日
         sqlTmpISSUE_TYP                NUMBER(1),     --出庫指示出庫区分
         sqlTmpISSUE_CMPLT_FLG          NUMBER(1),     --出庫完了フラグ
         sqlTmpISSUE_INST_ISS_FLG       NUMBER(1),     --出庫指示書発行済みフラグ
         sqlTmpISSUE_INST_ISS_DATE      DATE,          --出庫指示書発行日
         sqlTmpISSUE_INST_COMMENT       VARCHAR2(320)   --出庫指示備考
        );

    TYPE sqlTmp_ISSUE_INST_REC_T IS TABLE OF  sqlTmp_ISSUE_INST INDEX BY BINARY_INTEGER;
         sqlTmp_ISSUE_INST_REC   sqlTmp_ISSUE_INST_REC_T;

    /* カーソルの宣言 */
    
    /* 所要量データ読込 */
    CURSOR CUR_PuchOdrInst_SelectTOD1(cvc2OD_NO1 VARCHAR2) IS 
        SELECT 
               OD_NO,                                   --オーダデマンド番号
               ITEM_CD,                                 --品目番号
               PS_EDITION,                              --構成版数
               PS_UNIT_QTY,                             --構成単位数
               PS_UNIT_DENOMINATOR,                     --構成単位数分母
               PS_UNIT_NUMERATOR,                       --構成単位数分子
               MRP_ODR_TYP,                             --品目手配区分
               OD_TYP,                                  --オーダデマンド区分
               PARENT_OD_NO,                            --親オーダデマンド番号
               ODR_QTY,                                 --オーダ数(#837)
               ISSUE_TYP,                                --所要量出庫区分
               DUE_DATE,                                 --要求納期
               PS_SPOIL                                    --所要量構成仕損率
        FROM   T_OD                                     --所要量
        WHERE  PARENT_OD_NO = cvc2OD_NO1                --所要量.親オーダーデマンド番号 = パラメータ
               ;
     /*システムパラメータ（仕損率）*/
     CURSOR CUR_SystemSpoilFlg  IS
         SELECT 
                 VALUE
         FROM  SYS_PARAMETER
         WHERE NAME='SPOIL_FLG';
            
    /* 所要量データ読込（品目手配区分:8(擬似品目)時の下位デマンドサマリ情報の追加用) */ 
    CURSOR CUR_PuchOdrInst_SelectTOD2(cvc2OD_NO2 VARCHAR2) IS 
        SELECT 
               OD_NO,                                   --オーダデマンド番号
               ITEM_CD,                                 --品目番号
               PS_EDITION,                              --構成版数
               PS_UNIT_QTY,                             --構成単位数
               PS_UNIT_DENOMINATOR,                     --構成単位数分母
               PS_UNIT_NUMERATOR,                       --構成単位数分子
               MRP_ODR_TYP,                             --品目手配区分
               OD_TYP,                                  --オーダデマンド区分
               PARENT_OD_NO,                            --親オーダデマンド番号
               ODR_QTY,                                 --オーダ数(#837)
               ISSUE_TYP,                                --所要量出庫区分
               DUE_DATE,                                 --要求納期
               PS_SPOIL                                    --所要量構成仕損率
        FROM   T_OD                                     --所要量
        WHERE  PARENT_OD_NO = cvc2OD_NO2                --所要量.親オーダーデマンド番号 = パラメータ
               ;

            
    /* 在庫数量単位区分の取得（品目テーブルより（属性:基準テーブル））
       出庫指示作成時に擬似品目展開フラグ:1(ON)の場合の出庫単位数、
       出庫指示数の有効桁数をオーバーした時の在庫数量単位区分の判定 */
    CURSOR CUR_PuchOdrInst_UNIT_QTY_TYP(cvc2ITEM_CD VARCHAR2) IS 
        SELECT
               UNIT_QTY_TYP
        FROM   M_ITEM
        WHERE  ITEM_CD = cvc2ITEM_CD
               ;

    /* 有償支給フラグの取得（支給単価テーブルより）               
       支給単価が存在し、かつ有効開始日が、[所要量]."要求納期"より過去のデータ
       を検索する。複数該当する場合は、開始日が最大のデータを採用する。
       条件：支給単価の有償支給フラグ(ONEROUS_FLG)の値
             0（無償）の場合  → 支給区分=2（無償支給)
             1（有償）の場合  → 支給区分=1（有償支給)
       検索条件に該当するデータが存在しなかった場合  → 支給区分=2（無償支給） */
    CURSOR CUR_PuchOdrInst_ONEROUS_FLG(
               cvc2COMPANY_CD  VARCHAR2,
               cvc2VEND_CD     VARCHAR2,
               cvc2PLANT_CD    VARCHAR2,
               cvc2ITEM_CD     VARCHAR2,
               cdtmSTART_DATE  DATE
              ) IS 
        SELECT
               M_CONS_UNIT_COST.ONEROUS_FLG AS ONEROUS_FLG
        FROM   M_CONS_UNIT_COST,
              (
               SELECT MAX(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE) AS EFF_PHASE_IN_DATE
               FROM   M_CONS_UNIT_COST
               WHERE
                      M_CONS_UNIT_COST.COMPANY_CD = cvc2COMPANY_CD
                  AND M_CONS_UNIT_COST.VEND_CD    = cvc2VEND_CD
                  AND M_CONS_UNIT_COST.PLANT_CD   = cvc2PLANT_CD
                  AND M_CONS_UNIT_COST.ITEM_CD    = cvc2ITEM_CD
                  AND M_CONS_UNIT_COST.EFF_PHASE_IN_DATE <= TRUNC(cdtmSTART_DATE)
              ) T1
        WHERE  M_CONS_UNIT_COST.EFF_PHASE_IN_DATE = T1.EFF_PHASE_IN_DATE
           AND M_CONS_UNIT_COST.COMPANY_CD        = cvc2COMPANY_CD
           AND M_CONS_UNIT_COST.VEND_CD           = cvc2VEND_CD
           AND M_CONS_UNIT_COST.PLANT_CD          = cvc2PLANT_CD
           AND M_CONS_UNIT_COST.ITEM_CD           = cvc2ITEM_CD
               ;

    /* 保管区データ読込 */
    CURSOR CUR_PuchOdrInst_Select_M_WH(vc2COMPANY_CD VARCHAR2, vc2VEND_CD VARCHAR2, vc2PLANT_CD VARCHAR2) IS 
        SELECT
            M_WH.WH_CD AS WH_CD
        FROM
            M_WH
        WHERE 
            M_WH.COMPANY_CD = vc2COMPANY_CD
            AND M_WH.VEND_CD = vc2VEND_CD
            AND M_WH.PLANT_CD = vc2PLANT_CD
               ;
               
    /* パラメータデータ読込 */
    CURSOR CUR_PuchOdrInst_SYS_PARAMETER(vc2NAME VARCHAR2) IS 
        SELECT
            UPPER(SYS_PARAMETER.VALUE) AS VALUE
        FROM
            SYS_PARAMETER
        WHERE 
            SYS_PARAMETER.NAME = vc2NAME
               ;

-- ▼▼ 2008/08/06 ADD START -TSUCHIDA▼▼
	/* 品目テーブルより、工数管理品目区分取得。
		（工数管理品目区分=1（工数管理品目）の場合、出庫指示に出力しない。） */
    CURSOR CUR_PuchOdrInst_MANHOUR_TYP(cvc2ITEM_CD VARCHAR2) IS 
        SELECT
               MANHOUR_TYP
        FROM   M_ITEM
        WHERE  ITEM_CD = cvc2ITEM_CD
               ;
-- ▲▲ 2008/08/06 ADD END -TSUCHIDA▲▲

    /* 定数の宣言 */
    MY_SQL_NAME                     VARCHAR2(108)  := ' FNCPUCHODRINSTOUTSIDEISSUE'; --ファンクション名
    METHOD_START                    VARCHAR2(112)  := '(SBM0701)<< 出庫指示処理(外作)開始 >>';
    METHOD_END                      VARCHAR2(112)  := '<< 出庫指示処理(外作)終了 >>';
    METHOD_START_PGNM_TOD           VARCHAR2(152)  := '(SBM0703)<< 支給品出庫計画データ作成処理開始 >>';
    METHOD_END_PGNM_TOD             VARCHAR2(152)  := '(SBM0704)<< 支給品出庫計画データ作成処理終了 >>';
    METHOD_START_PGNM_ISSUE_INST    VARCHAR2(128)  := '(SBM0705)<< 出庫指示データ作成処理開始 >>';
    METHOD_END_PGNM_ISSUE_INST      VARCHAR2(128)  := '(SBM0706)<< 出庫指示データ作成処理終了 >>';
    METHOD_START_PGNM_TOD_ADD       VARCHAR2(128)  := '(SBM0707)<< 出庫指示データ追加処理開始 >>';
    METHOD_END_PGNM_TOD_ADD         VARCHAR2(128)  := '(SBM0708)<< 出庫指示データ追加処理終了 >>';
    LOGMSG_ERR                      VARCHAR2(32)  := '異常終了';
    excnumunit_qty_typ              EXCEPTION;                                      --在庫数量単位区分の取得失敗エラー
    excGetNewIssInstCd              EXCEPTION;                                      --自動採番取得エラー
    APS_COM_NOTPRIMARY              VARCHAR2(28)  := 'ZZ06001';                     --対象データが存在しません
    APS_COM_NOTEXIST_DATA           VARCHAR2(28)  := 'ZZ06001';                     --対象データが存在しません
    APS_COM_ORACLE_ERR              VARCHAR2(28)  := 'ZZ01106';                     --サーバエラー
    APS_COM_OTHER_ERR               VARCHAR2(28)  := 'ZZ01106';                     --サーバエラー
    ONEROUS_FLG_OFF                 NUMBER(01)    := 0;                             --無償
    ONEROUS_FLG_ON                  NUMBER(01)    := 1;                             --有償
    CONS_TYP_CHARGE                 NUMBER(02)    := 1;                             --有償
    CONS_TYP_NON_CHARGE             NUMBER(02)    := 2;                             --無償

    /* 変数の定義 */
    lngCntMax                       NUMBER(11):= 0;                                 --支給品出庫計画データ件数
    lngCntMaxWork                   NUMBER(11):= 0;                                 --支給品出庫計画データ件数
    numCntMax_ISSUE_INST            NUMBER(11):= 0;                                 --出庫指示データ件数
    numCntCurr                      NUMBER(11):= 0;                                 --構造体読込用カウンタ
    numCntCurr_ISSUE_INST           NUMBER(11):= 0;                                 --出庫指示単位数取得用カウンタ
    vc2OD_NOTemp                    VARCHAR2(100);                                   --オーダデマンド番号保持用
    cv2PARENT_OD_NoTemp             VARCHAR2(100);                                   --親オーダデマンド番号保持用
    numUNIT_QTY_TYP                 NUMBER(02);                                     --子品目在庫数量単位区分の保持用
    numISSUE_INST_UNIT_QTY_TYP      NUMBER(02);                                     --親品目在庫数量単位区分の保持用
    vc2GetNewPuchCd                 VARCHAR2(100);                                   --出庫番号取得用
    blnRet                          BOOLEAN;                                        --共通関数の戻値
    blnErrFLG                       BOOLEAN;  
    numUNIT_QTY_TYP_REC             NUMBER(11):= 0;                                 --在庫単位データの件数取得用
    vc2Comment                      VARCHAR2(1024);                                  --コメント作成用
    vc2RunChkComment                VARCHAR2(1024);                                  --実行位置確認用コメント作成作業領域
    numONEROUS_FLG                  NUMBER(01);                                     --有償フラグ
    vc2WH_CDTemp                    VARCHAR2(100);                                   --[保管区]."保管区コード"保持用
    vc2VALUETemp                    VARCHAR2(1024);                                  --[パラメータ]."設定値"保持持用
    SYS_SPOIL_FLG                   NUMBER(01);                                        --システムパラメータ仕損率
    excNOTEXIST_M_WH                EXCEPTION;
    excNOTEXIST_SYS_PARAMETER       EXCEPTION;

-- ▼▼ 2008/08/06 ADD START -TSUCHIDA▼▼
	numMANHOUR_TYP					NUMBER(02);										--工数管理品目区分取得用
-- ▲▲ 2008/08/06 ADD END -TSUCHIDA▲▲
--<メイン処理 >-----------------------------------------------------
BEGIN

-- DBMS_OUTPUT.ENABLE(1000000);
-- DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    vc2RunChkComment := NULL;
    --// システム仕損率を取得
    OPEN CUR_SystemSpoilFlg ;
    FETCH CUR_SystemSpoilFlg INTO SYS_SPOIL_FLG ;
    IF CUR_SystemSpoilFlg%FOUND = FALSE THEN
       RAISE excNOTEXIST_SYS_PARAMETER;
    END IF;
    CLOSE CUR_SystemSpoilFlg ;

    /* 下位デマンドサマリ情報の追加処理 */

    /* TraceLogの出力(Start)処理を行う < 出庫指示処理(外作)開始 > */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

--vc2RunChkComment := '★★★★通過 FNC00010';
-- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
    /* TraceLogの出力(Start)処理を行う <支給品出庫計画データ作成処理開始> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START_PGNM_TOD);

    pvc2ErrorCd := '';

    /* 出庫指示データ（ＴＥＭＰ）                     */
    /* 支給品出庫計画データ編集したデータを格納する。 */
    /* ※この構造体を基に出庫指示データを追加する。   */

    OPEN CUR_PuchOdrInst_SelectTOD1(pvc2OdNo);

-- DBMS_OUTPUT.PUT_LINE('＊＊＊支給品出庫計画データの作成＊＊＊');
-- DBMS_OUTPUT.PUT_LINE('発注番号：'|| pvc2PuchOdrCd);
-- DBMS_OUTPUT.PUT_LINE('ＯＤ番号：'|| pvc2OdNo);

-- デバック用
-- SELECT
--    COUNT(*) INTO lngCntMaxWork FROM T_OD
--         WHERE    PARENT_OD_NO = pvc2OdNo;
-- -- DBMS_OUTPUT.PUT_LINE('下位デマンド数：'|| lngCntMaxWork);

    lngCntMax := 0;

    LOOP

-- -- DBMS_OUTPUT.PUT_LINE('メインループの開始');

        FETCH 
            CUR_PuchOdrInst_SelectTOD1 INTO  typsqlCurr_REC;
            EXIT WHEN CUR_PuchOdrInst_SelectTOD1%notfound  ;

        /* 支給品出庫計画データの作成 */
        IF  typsqlCurr_REC. sqlTmpITEM_ODR_TYP_TOD = 8 THEN                 --//擬似品目

--vc2RunChkComment := '★★★★通過 FNC00020';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
-- DBMS_OUTPUT.PUT_LINE('＊＊＊擬似品目＊＊＊');

            /* 発注番号 */
            sqlTmp_REC(lngCntMax). sqlTmpPUCH_ODR_CD_T := pvc2PuchOdrCd;

            /* オーダデマンド番号 */
            sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T :=  typsqlCurr_REC. sqlTmpOD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('オーダデマンド番号'||  sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T);

            vc2OD_NOTemp :=  typsqlCurr_REC. sqlTmpOD_NO_TOD;

            /* 品目番号 */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_CD_T :=  typsqlCurr_REC. sqlTmpITEM_CD_TOD;

            /* 製品構成版数 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_EDITION_T :=
                                       typsqlCurr_REC. sqlTmpPS_EDITION_TOD;

            /* 製品構成単位数 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_QTY_TOD;

            /* 製品構成単位数分母 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_DENOMINATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_DENOMINATOR_TOD;

            /* 製品構成単位数分子 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_NUMERATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_NUMERATOR_TOD;
            /*所要量構成仕損率*/
            sqlTmp_REC(lngCntMax).sqlTmpPS_SPOIL :=typsqlCurr_REC.sqlTmpPS_SPOIL;

            /* 出庫指示累計数 */
            sqlTmp_REC(lngCntMax). sqlTmpTOTALISSUETYP_T := 0;

            /* 出庫指示区分(品目手配区分)の設定 */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T := 9;           --出庫指示区分:擬似品目出庫計画

            /* 擬似品目展開フラグの設定 */
            sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T := 0;        --(0:OFF)

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊擬似品目展開＊＊＊'|| sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T);
            
            sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T :=
                                       typsqlCurr_REC. sqlTmpPARENT_OD_NO_TOD;        --親オーダデマンド番号

            sqlTmp_REC(lngCntMax). sqlTmpODR_QTY_T :=
                                       typsqlCurr_REC. sqlTmpODR_QTY_TOD;             --オーダ数(#837)

            sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T :=
                                       typsqlCurr_REC. sqlTmpISSUE_TYP_TOD; --所要量出庫区分
                                       
            sqlTmp_REC(lngCntMax). sqlTmpSCDL_ISSUE_DATE_T :=
                                       typsqlCurr_REC. sqlTmpSCDL_ISSUE_DATE_TOD; --出庫予定日
                                       
            /* データ件数カウント */
            lngCntMax := lngCntMax + 1;

            /* 擬似品目の下位デマンドの抽出 */
            OPEN CUR_PuchOdrInst_SelectTOD2(vc2OD_NOTemp);

            LOOP
                FETCH CUR_PuchOdrInst_SelectTOD2 INTO  typsqlCurr_REC_DISGUISE;
                EXIT WHEN CUR_PuchOdrInst_SelectTOD2%notfound;

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊擬似品目の子＊＊＊');

                /* さらにこのオーダデマンド番号を親オーダデマンド番号として持っているものを抽出 */
                /* 発注番号 */
                sqlTmp_REC(lngCntMax). sqlTmpPUCH_ODR_CD_T := pvc2PuchOdrCd;

                /* オーダデマンド番号 */
                sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpOD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('オーダデマンド番号'||  sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T);

                vc2OD_NOTemp :=  typsqlCurr_REC_DISGUISE. sqlTmpOD_NO_TOD;

                /* 品目番号 */
                sqlTmp_REC(lngCntMax). sqlTmpITEM_CD_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpITEM_CD_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000001 ＊＊＊');

                /* 製品構成版数 */
                sqlTmp_REC(lngCntMax). sqlTmpPS_EDITION_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_EDITION_TOD;
-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000002 ＊＊＊');

                /* 製品構成単位数 */
                sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_UNIT_QTY_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000003 ＊＊＊');

                /* 製品構成単位数分母 */
                sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_DENOMINATOR_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_UNIT_DENOMINATOR_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000004 ＊＊＊');

                /* 製品構成単位数分子 */
                sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_NUMERATOR_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPS_UNIT_NUMERATOR_TOD;
                /*所要量構成仕損率*/
                sqlTmp_REC(lngCntMax).sqlTmpPS_SPOIL :=typsqlCurr_REC_DISGUISE.sqlTmpPS_SPOIL;
-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000005 ＊＊＊');

                /* 出庫指示累計数 */
                sqlTmp_REC(lngCntMax). sqlTmpTOTALISSUETYP_T := 0;

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000006 ＊＊＊');

                /* 出庫指示区分:通常出庫計画 */
                sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T := 1;

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000007 ＊＊＊');

                /* 擬似品目展開フラグの設定 */
                sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T := 1;    --(1:ON)

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000008 ＊＊＊');

                /* 親オーダデマンド番号 */
                sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpPARENT_OD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('親オーダデマンド番号'||  sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T);

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000009 ＊＊＊');

                /* オーダ数(#837) */
                sqlTmp_REC(lngCntMax). sqlTmpODR_QTY_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpODR_QTY_TOD;

                /* 所要量出庫区分 */
                sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpISSUE_TYP_TOD;

                /* 出庫予定日 */
                sqlTmp_REC(lngCntMax). sqlTmpSCDL_ISSUE_DATE_T := 
                                           typsqlCurr_REC_DISGUISE. sqlTmpSCDL_ISSUE_DATE_TOD;
                                           
-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000010 ＊＊＊');

                /* データ件数カウント */
                lngCntMax := lngCntMax + 1;

-- -- DBMS_OUTPUT.PUT_LINE( sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T);

-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊ 000011 ＊＊＊');

            END LOOP;

            CLOSE CUR_PuchOdrInst_SelectTOD2;

        ELSE                                                                    --擬似品目以外

--vc2RunChkComment := '★★★★通過 FNC00030';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            /* 発注番号 */
            sqlTmp_REC(lngCntMax). sqlTmpPUCH_ODR_CD_T := pvc2PuchOdrCd;

            /* オーダデマンド番号 */
            sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T := 
                                       typsqlCurr_REC. sqlTmpOD_NO_TOD;

-- -- DBMS_OUTPUT.PUT_LINE('オーダデマンド番号'||  sqlTmp_REC(lngCntMax). sqlTmpOD_NO_T);

            /* 品目番号 */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_CD_T := 
                                       typsqlCurr_REC. sqlTmpITEM_CD_TOD;

            /* 製品構成版数 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_EDITION_T := 
                                       typsqlCurr_REC. sqlTmpPS_EDITION_TOD;

            /* 製品構成単位数 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_QTY_TOD;

            /* 製品構成単位数分母 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_DENOMINATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_DENOMINATOR_TOD;

            /* 製品構成単位数分子 */
            sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_NUMERATOR_T := 
                                       typsqlCurr_REC. sqlTmpPS_UNIT_NUMERATOR_TOD;
            /*所要量構成仕損率*/
            sqlTmp_REC(lngCntMax).sqlTmpPS_SPOIL :=typsqlCurr_REC.sqlTmpPS_SPOIL;
-- -- DBMS_OUTPUT.PUT_LINE( sqlTmp_REC(lngCntMax). sqlTmpPS_UNIT_QTY_T||'＊支給データ・擬似以外');

            /* 出庫指示累計数 */
            sqlTmp_REC(lngCntMax). sqlTmpTOTALISSUETYP_T := 0;
 
            /* 出庫指示区分(品目手配区分)の設定 */
            sqlTmp_REC(lngCntMax). sqlTmpITEM_ODR_TYP_T := 1;           --出庫指示区分:通常出庫計画

            /* 擬似品目展開フラグの設定(0:OFF) */
            sqlTmp_REC(lngCntMax). sqlTmpODINFO_DISGUISE_T := 0;        --(0:OFF)

            /* 親オーダデマンド番号 */
            sqlTmp_REC(lngCntMax). sqlTmpPARENT_OD_NO_T := 
                                       typsqlCurr_REC. sqlTmpPARENT_OD_NO_TOD;

            /* オーダ数(#837) */
            sqlTmp_REC(lngCntMax). sqlTmpODR_QTY_T := 
                                       typsqlCurr_REC. sqlTmpODR_QTY_TOD;

            /* 所要量出庫区分 */
            sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T :=  typsqlCurr_REC. sqlTmpISSUE_TYP_TOD;

            /* 出庫予定日 */
            sqlTmp_REC(lngCntMax). sqlTmpSCDL_ISSUE_DATE_T :=  typsqlCurr_REC. sqlTmpSCDL_ISSUE_DATE_TOD;
            
-- -- DBMS_OUTPUT.PUT_LINE('出庫指示出庫区分'||  sqlTmp_REC(lngCntMax). sqlTmpISSUE_TYP_T);

            /* データ件数カウント */
            lngCntMax := lngCntMax + 1;

        END IF;

    END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('***支給品出庫計画データの作成終了***：'|| lngCntMax);

    CLOSE CUR_PuchOdrInst_SelectTOD1;

    /* TraceLogの出力処理を行う<支給品出庫計画データ作成処理終了> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END_PGNM_TOD);

    /* 出庫指示情報の追加処理 */
-- DBMS_OUTPUT.PUT_LINE('＊＊＊出庫指示情報の追加処理開始＊＊＊');

    /* TraceLogの出力(Start)処理を行う<出庫指示データ作成処理開始> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START_PGNM_ISSUE_INST);
                            
    numCntCurr := 0;

-- -- DBMS_OUTPUT.PUT_LINE('***支給品出庫計画データの読込***：'|| TO_CHAR(lngCntMax));

    WHILE lngCntMax > numCntCurr LOOP

-- -- DBMS_OUTPUT.PUT_LINE('numCntCurr:'  ||  TO_CHAR(numCntCurr));
-- -- DBMS_OUTPUT.PUT_LINE('lngCntMax :'  ||  TO_CHAR(lngCntMax));
-- -- DBMS_OUTPUT.PUT_LINE('出庫指示区分' ||  sqlTmp_REC(numCntCurr). sqlTmpITEM_ODR_TYP_T);
    
        /* 出庫指示データ（ＴＥＭＰ）の作成                                               */
        /* 支給品出庫計画データ編集したデータを格納する。                                 */
        /* ※この構造体を基に出庫指示データを追加する。                                   */
        /* 支給品出庫計画データの出庫指示区分:1（通常、擬似品目の下位デマンドのみ抽出）。 */
        IF  sqlTmp_REC(numCntCurr). sqlTmpITEM_ODR_TYP_T = 1 THEN                 --通常品出庫

--vc2RunChkComment := '★★★★通過 FNC00040';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            /* 出庫指示番号(共通関数より取得＜自動採番＞ */
            blnRet := FNCGETNEWISSINSTCD(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                         pvc2UserId,pvc2BusinessName,pvc2PlantCd,vc2GetNewPuchCd);

            IF blnRet = false then

-- -- DBMS_OUTPUT.PUT_LINE(lngCntMax||'＊＊＊自動採番失敗！！！！！＊＊＊');

                RAISE excGetNewIssInstCd;

            END IF;

-- -- DBMS_OUTPUT.PUT_LINE('numCntMax_ISSUE_INST=' || numCntMax_ISSUE_INST);

            /* 出庫指示番号 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_CD := vc2GetNewPuchCd;

            /* 工場コード */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpPLANT_CD := pvc2PlantCd;

            /* オーダデマンド番号 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpOD_NO := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpOD_NO_T;

            /* 出庫品目番号 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpITEM_CD := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T;

            /* 製品構成版数(所要品目構成版数) */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpPS_EDITION := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpPS_EDITION_T;

            /* 発注番号 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpPUCH_ODR_CD := 
                                                             sqlTmp_REC(numCntCurr). sqlTmpPUCH_ODR_CD_T;

            /* 会社コード */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpCOMPANY_CD := pvc2CompanyCd;

            /* 取引先コード */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpVEND_CD := pvc2VendCd;

            /* 支給区分(1:有償、2:無償)の判定 */
            /* 支給単価マスタより、有償フラグを取得する */
            numONEROUS_FLG := ONEROUS_FLG_OFF;
            OPEN  CUR_PuchOdrInst_ONEROUS_FLG(
                      pvc2CompanyCd,                                            --会社コード
                      pvc2VendCd,                                               --取引先コード
                      pvc2PlantCd,                                              --工場コード
                      sqlTmp_REC(numCntCurr).sqlTmpITEM_CD_T,                   --品目番号
                      sqlTmp_REC(numCntCurr).sqlTmpSCDL_ISSUE_DATE_T            --出庫予定日
                     );
                FETCH CUR_PuchOdrInst_ONEROUS_FLG INTO numONEROUS_FLG ;
                CLOSE CUR_PuchOdrInst_ONEROUS_FLG ;

                IF numONEROUS_FLG = ONEROUS_FLG_ON THEN
                      sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpCONS_TYP := 
                                                                       CONS_TYP_CHARGE;             --有償支給
-- -- DBMS_OUTPUT.PUT_LINE('有償支給品');
                ELSE
                      sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpCONS_TYP := 
                                                                       CONS_TYP_NON_CHARGE;         --無償支給
-- -- DBMS_OUTPUT.PUT_LINE('無償支給品');
                END IF;

                /* 作業計画番号 */
                sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWORK_ODR_CD := '';
         
                /* 仕掛作業コード */
                sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWORK_IN_PROC_CD := '';    
 
                /* 作業区コード */
                sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWS_CD := '';          

                /* 工程保管場所コード */
                IF numONEROUS_FLG = ONEROUS_FLG_ON THEN
                
                    --パラメータ取得
                    OPEN CUR_PuchOdrInst_SYS_PARAMETER(
                        pvc2PlantCd || '_ONEROUS_CONS_INV_TYP'               --名称
                        );
                    FETCH CUR_PuchOdrInst_SYS_PARAMETER INTO vc2VALUETemp;
                    IF CUR_PuchOdrInst_SYS_PARAMETER%FOUND = FALSE THEN
                        --エラー
                        RAISE excNOTEXIST_SYS_PARAMETER;
                    END IF;
                    CLOSE CUR_PuchOdrInst_SYS_PARAMETER;
                    
                    IF vc2VALUETemp = 'TRUE' THEN
                        OPEN CUR_PuchOdrInst_Select_M_WH(
                            pvc2CompanyCd,                                           --会社コード
                            pvc2VendCd,                                              --取引先コード
                            pvc2PlantCd                                              --工場コード
                            );
                        FETCH CUR_PuchOdrInst_Select_M_WH INTO vc2WH_CDTemp;
                        IF CUR_PuchOdrInst_Select_M_WH%FOUND = FALSE THEN
                            --エラー
                            RAISE excNOTEXIST_M_WH;
                        END IF;
                        CLOSE CUR_PuchOdrInst_Select_M_WH;
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWH_CD := vc2WH_CDTemp;
                    ELSE
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWH_CD := '';
                    END IF;
                ELSE
                    OPEN CUR_PuchOdrInst_Select_M_WH(
                        pvc2CompanyCd,                                           --会社コード
                        pvc2VendCd,                                              --取引先コード
                        pvc2PlantCd                                              --工場コード
                        );
                    FETCH CUR_PuchOdrInst_Select_M_WH INTO vc2WH_CDTemp;
                    IF CUR_PuchOdrInst_Select_M_WH%FOUND = FALSE THEN
                        --エラー
                        RAISE excNOTEXIST_M_WH;
                    END IF;
                    CLOSE CUR_PuchOdrInst_Select_M_WH;
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpWH_CD := vc2WH_CDTemp;
                END IF;

                /* -------------------- */
                /* -- 出庫指示単位数 -- */
                /* -------------------- */
                 /* 擬似品目展開フラグ(0:OFF,1:ON) */
                IF  sqlTmp_REC(numCntCurr).sqlTmpODINFO_DISGUISE_T = 1 THEN      --擬似品目
            
--vc2RunChkComment := '★★★★通過 FNC00050（擬似品目）';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                    /* 親オーダデマンド番号の退避 */
                    cv2PARENT_OD_NoTemp := sqlTmp_REC(numCntCurr). sqlTmpPARENT_OD_NO_T;

-- -- DBMS_OUTPUT.PUT_LINE(cv2PARENT_OD_NoTemp);

                    numCntCurr_ISSUE_INST := 0;

-- -- DBMS_OUTPUT.PUT_LINE('ループをぬけました(ﾙｰﾌﾟ前)');

                    /* 親データの出庫単位数のサーチ */

                    LOOP

-- -- DBMS_OUTPUT.PUT_LINE('ループの中');

                        EXIT WHEN  sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpOD_NO_T = cv2PARENT_OD_NoTemp ;

                        numCntCurr_ISSUE_INST := numCntCurr_ISSUE_INST + 1;

                    END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('ループをぬけました(ﾙｰﾌﾟ後)');

-- -- DBMS_OUTPUT.PUT_LINE(numCntCurr_ISSUE_INST);

                    /* 出庫品目在庫数量単位区分の取得 */
                    OPEN CUR_PuchOdrInst_UNIT_QTY_TYP(
                             sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T
                            );

                    FETCH CUR_PuchOdrInst_UNIT_QTY_TYP INTO numUNIT_QTY_TYP;
                        
                    /* 在庫数量単位区分の取得(０件、２件以上ならエラー) */
                    SELECT
                           COUNT(*) INTO numUNIT_QTY_TYP_REC
                    FROM   M_ITEM
                    WHERE
                           ITEM_CD = sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T
                           ;

-- -- DBMS_OUTPUT.PUT_LINE('結果判定ＴＨＥＮ');

                    /* 在庫数量単位区分取得結果の判定 */
                    IF numUNIT_QTY_TYP_REC <>  1 then

-- -- DBMS_OUTPUT.PUT_LINE('在庫数量単位区分取得失敗:'|| to_char(numUNIT_QTY_TYP_REC));

                        IF numUNIT_QTY_TYP_REC = 0 THEN                             --取得データなし

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTEXIST_DATA,'');

                            RAISE excnumunit_qty_typ;
    
                        ELSE                                                        --２件以上の取得

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTPRIMARY,'');

                            RAISE excnumunit_qty_typ;

                        END IF;
                    END IF;

                    CLOSE CUR_PuchOdrInst_UNIT_QTY_TYP;

              /* 親品目在庫数量単位区分の取得 */
                    OPEN CUR_PuchOdrInst_UNIT_QTY_TYP(
                             sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpITEM_CD_T
                            );

                    FETCH CUR_PuchOdrInst_UNIT_QTY_TYP INTO numISSUE_INST_UNIT_QTY_TYP;
                        
                    /* 在庫数量単位区分の取得(０件、２件以上ならエラー) */
                    SELECT
                           COUNT(*) INTO numUNIT_QTY_TYP_REC
                    FROM   M_ITEM
                    WHERE
                           ITEM_CD = sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpITEM_CD_T
                           ;


                    /* 在庫数量単位区分取得結果の判定 */
                    IF numUNIT_QTY_TYP_REC <>  1 then

                        IF numUNIT_QTY_TYP_REC = 0 THEN             --取得データなし

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTEXIST_DATA,'');

                            RAISE excnumunit_qty_typ;
    
                        ELSE                                                        --２件以上の取得

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTPRIMARY,'');

                            RAISE excnumunit_qty_typ;

                        END IF;
                    END IF;

                    CLOSE CUR_PuchOdrInst_UNIT_QTY_TYP;

-- #:781 DEL                   /* 出庫単位数 = 親データ.構成単位数 * 子データ.出庫単位数分子 / 子データ.出庫単位数分母 */
-- #:781 DEL                   sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
-- #:781 DEL                       sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
-- #:781 DEL                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
-- #:781 DEL                               sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;
--
-- -- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_REC(1). sqlTmpPS_UNIT_QTY_T);
-- -- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_REC(1). sqlTmpPS_UNIT_DENOMINATOR_T);
-- -- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_REC(1). sqlTmpPS_UNIT_NUMERATOR_T);

-- -- DBMS_OUTPUT.PUT_LINE('出庫単位数1：' ||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY);
                    IF numISSUE_INST_UNIT_QTY_TYP = 1 THEN                      --親品目在庫数量単位区分=1(整数)
                        /* 親品目の出庫指示数を算出 */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                           CEIL(pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_NUMERATOR_T /
                             sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_DENOMINATOR_T) ;
                     ELSE
                        /* 親品目の出庫指示数を算出 */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                           CEIL((pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_NUMERATOR_T /
                              sqlTmp_REC(numCntCurr_ISSUE_INST).sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                    END IF;

                    IF numUNIT_QTY_TYP = 1 THEN                                 --在庫数量単位区分=1(整数)

-- --vc2RunChkComment := '★★★★通過 FNC00060（整数）';
-- --DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD ↓ */

                    /* 出庫単位数 = 親データ.構成単位数 * 子データ.出庫単位数分子 / 子データ.出庫単位数分母 */
                    /* 整数切上げ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
 
                    /* 出庫指示単位数分母 */
                    /* 少数切上げ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_DENOMINATOR_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T * 10000) / 10000 ;

                    /* 出庫指示単位数分子 */
                    /* 少数切上げ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_NUMERATOR_T *
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T * 10000) / 10000 ;
                            
  /* #:837 ADD ↓ */
                        /* 出庫指示数 = 少数切上げ( 発注数 * 親データ構成単位数 * 出庫単位数分子 / 出庫単位数分母 ) */
                        /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) 
                                ;*/
                         IF SYS_SPOIL_FLG = 1 THEN
                            /* 出庫指示数 = 整数切上げ( 発注数 *（1＋仕損率 ）＊出庫指示単位数分子 / 出庫指示単位数分母 ) */
                            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                               CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                                sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                 sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) ;
                         ELSE
                             /* 出庫指示数 = 整数切上げ( 発注数 * 出庫指示単位数分子 / 出庫指示単位数分母 ) */
                            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                               CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY * sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                 sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) ;
                         END IF;


  /* #:837 END ↑ */
  /* #:837 DEL ↓ */
--                        /* 出庫指示数 = 少数切上げ( 出庫単位数 * 発注指示数 ) */
--                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL((sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                 pnumPuchOdrQty) ;
  /* #:837 END ↑ */
  /* #:781 END ↑ */
-- #:781 DEL                            CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                 pnumPuchOdrQty) ;

-- -- DBMS_OUTPUT.PUT_LINE('出庫指示数2：' ||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY);

                    ELSE                                                        --在庫数量単位区分=2(小数)

--vc2RunChkComment := '★★★★通過 FNC00070（小数）';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD ↓ */

                    /* 出庫指示単位数分母 */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_DENOMINATOR_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T * 10000) / 10000 ;

                    /* 出庫指示単位数分子 */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM :=
                        CEIL(sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_NUMERATOR_T *
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T * 10000) / 10000;
                    
                    /* 出庫単位数 = 親データ.構成単位数 * 子データ.出庫単位数分子 / 子データ.出庫単位数分母 */
                    /* 少数切上げ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL((sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;

                        /* 出庫指示数 = 小数第5位切上げ( 発注数 * 親データ構成単位数 * 出庫単位数分子 / 出庫単位数分母 ) */
  /* #:837 ADD ↓ */
                      /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL(((pnumPuchOdrQty * sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                                 sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;*/
                     
                     IF SYS_SPOIL_FLG = 1 THEN
                        /* 出庫指示数 = 小数第5位切上げ( 発注数 *(1+仕損率)* 出庫指示単位数分子 / 出庫指示単位数分母 ) */
                       sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                         CEIL((sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                              sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                     ELSE
                        /* 出庫指示数 = 小数第5位切上げ( 発注数 * 出庫指示単位数分子 / 出庫指示単位数分母 ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY := 
                          CEIL((sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST).sqlTmpISSUE_INST_QTY * sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_NUMERATOR_T /
                                sqlTmp_REC(numCntCurr).sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                     END IF;
                                 
                                 
  /* #:837 END ↑ */
  /* #:837 DEL ↓ */
--                      sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL(((sqlTmp_REC(numCntCurr_ISSUE_INST). sqlTmpPS_UNIT_QTY_T * 
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                                sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                   pnumPuchOdrQty) * 10000)
--                            / 10000 ;
  /* #:837 END ↑ */
  /* #:781 END ↑ */
-- #:781 DEL                            CEIL(( sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                   pnumPuchOdrQty) * 10000)
-- #:781 DEL                            / 10000 ;

-- -- DBMS_OUTPUT.PUT_LINE('出庫指示数4：' ||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY);

                    END IF;

                ELSE                                                            --擬似フラグ=0(擬似以外)

--vc2RunChkComment := '★★★★通過 FNC00080（擬似以外）';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            
-- #:781 DEL                    /* 出庫指示単位数 = 支給品製品構成単位数分子 / 支給品製品構成単位数分母 */
-- #:781 DEL                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
-- #:781 DEL                        sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
-- #:781 DEL                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;

                    /* 在庫数量単位区分の取得 */
                
                    OPEN CUR_PuchOdrInst_UNIT_QTY_TYP( sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T);
                
                    FETCH CUR_PuchOdrInst_UNIT_QTY_TYP INTO numUNIT_QTY_TYP;
                
                    /* 在庫数量単位区分の取得(０件、２件以上ならエラー) */
                    SELECT COUNT(*) INTO numUNIT_QTY_TYP_REC
                    FROM M_ITEM
                    WHERE ITEM_CD =  sqlTmp_REC(numCntCurr). sqlTmpITEM_CD_T;

                    IF numUNIT_QTY_TYP_REC <>  1 then

-- -- DBMS_OUTPUT.PUT_LINE('在庫数量単位区分取得失敗:'|| to_char(numUNIT_QTY_TYP_REC));

                        IF numUNIT_QTY_TYP_REC = 0 THEN                         --取得データなし

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTEXIST_DATA,'');
                                                
                        RAISE excnumunit_qty_typ;

                        ELSE                                                    --２件以上の取得

                            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                                MY_SQL_NAME,APS_COM_NOTPRIMARY,'');
                        
                            RAISE excnumunit_qty_typ;
                        END IF;
                    END IF;
                
                    CLOSE CUR_PuchOdrInst_UNIT_QTY_TYP;

                    IF numUNIT_QTY_TYP = 1 THEN                                 --在庫数量単位区分=1(整数管理)

--vc2RunChkComment := '★★★★通過 FNC00090（整数）';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD ↓ */
  
                    /* 出庫指示単位数分母 */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;
                    /* 出庫指示単位数分子 */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ;
  
                    /* 出庫指示単位数 = 支給品製品構成単位数分子 / 支給品製品構成単位数分母 */
                    /* 整数切上げ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL(sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
  /* #:837 ADD ↓ */
                     IF SYS_SPOIL_FLG = 1 THEN
                        /* 出庫指示数 = 少数切上げ( 発注数 * (1+仕損率) *単位数分子 / 単位数分母 ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((pnumPuchOdrQty * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                                  sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
                      ELSE
                        /* 出庫指示数 = 少数切上げ( 発注数 * 単位数分子 / 単位数分母 ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((pnumPuchOdrQty * sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) ;
                      END IF;   
  /* #:837 END ↑ */
  /* #:837 DEL ↓ */
--                        /* 出庫指示数 = 少数切上げ( 出庫単位数 * 発注指示数 ) */
--                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL((sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                pnumPuchOdrQty);
  /* #:837 END ↑ */
  /* #:781 END ↑ */
-- #:781 DEL                            CEIL(sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                pnumPuchOdrQty);

                    ELSE                                                        --在庫数量単位区分=2(少数管理)
                
--vc2RunChkComment := '★★★★通過 FNC00100（少数）';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
  /* #:781 ADD ↓ */
  
                    /* 出庫指示単位数分母 */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;
                    /* 出庫指示単位数分子 */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ;
 
                    /* 出庫指示単位数 = 支給品製品構成単位数分子 / 支給品製品構成単位数分母 */
                    /* 少数切上げ */
                    sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY := 
                        CEIL((sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000 ;
                    IF SYS_SPOIL_FLG = 1 THEN
                        /* 出庫指示数 = 少数第5位切上げ( 出庫単位数 * 発注指示数*(1+仕損率) ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((( pnumPuchOdrQty * (1+ sqlTmp_REC(numCntCurr).sqlTmpPS_SPOIL/100) *
                                 sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                    ELSE
                        /* 出庫指示数 = 少数第5位切上げ( 出庫単位数 * 発注指示数 ) */
                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
                        CEIL((( pnumPuchOdrQty  *  sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ) /
                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) * 10000) / 10000;
                    END IF;
  /* #:837 END ↑ */
  /* #:837 DEL ↓ */
--                        sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_QTY := 
--                        CEIL(((sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T /
--                            sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T) *
--                                pnumPuchOdrQty) * 10000) / 10000;
  /* #:837 END ↑ */
  /* #:781 END ↑ */
-- #:781 DEL                            CEIL(( sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_QTY * 
-- #:781 DEL                                pnumPuchOdrQty) * 10000) / 10000;
                    END IF;
                END IF;

            /* 出庫指示単位数分母 */
            /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_DEN := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_DENOMINATOR_T ;*/
            /* 出庫指示単位数分子 */
            /*sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_UNIT_NUM := 
                                           sqlTmp_REC(numCntCurr). sqlTmpPS_UNIT_NUMERATOR_T ;*/
            /* 出庫累計数 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpTOTAL_ISSUE_QTY := 0 ;

            /* 出庫予定日 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpSCDL_ISSUE_DATE := 
                                           sqlTmp_REC(numCntCurr). sqlTmpSCDL_ISSUE_DATE_T;

            /* 出庫完了日 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_CMPLT_DATE := NULL;

            /* 出庫指示出庫区分 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_TYP :=
                             sqlTmp_REC(numCntCurr). sqlTmpISSUE_TYP_T;
                            
-- -- DBMS_OUTPUT.PUT_LINE('出庫指示出庫区分'||  sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_TYP);
                
            /* 出庫完了フラグ */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_CMPLT_FLG := 0;

            /* 出庫指示書発行済みフラグ */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_ISS_FLG := 0;

            /* 出庫指示書発行日 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_ISS_DATE := NULL;

            /* 出庫指示備考 */
            sqlTmp_ISSUE_INST_REC(numCntMax_ISSUE_INST). sqlTmpISSUE_INST_COMMENT := '';

            numCntMax_ISSUE_INST := numCntMax_ISSUE_INST + 1;

        END IF;

        numCntCurr := numCntCurr + 1;

-- -- DBMS_OUTPUT.PUT_LINE('＊データの移し替え＊');

    END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('LOOP END');

    /* TraceLogの出力処理を行う<出庫指示データ作成処理終了> */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END_PGNM_ISSUE_INST);

-- -- DBMS_OUTPUT.PUT_LINE('＊対象データの判定＊');

    IF numCntCurr <> 0 THEN                                                     --対象データがない場合は処理しない

--vc2RunChkComment := '★★★★通過 FNC00110';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        /* TraceLogの出力(Start)処理を行う<出庫指示データ追加処理開始> */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START_PGNM_TOD_ADD);
    
-- -- DBMS_OUTPUT.PUT_LINE('＊＊＊出庫指示の書込み処理＊＊＊');

        /* 出庫指示ファイルへ追加 */
        numCntCurr := 0;
        LOOP
            EXIT WHEN numCntMax_ISSUE_INST <= numCntCurr;

-- -- DBMS_OUTPUT.PUT_LINE(numCntCurr ||  sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_CD);      
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPLANT_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpOD_NO);              
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpITEM_CD);            
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPS_EDITION);         
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPUCH_ODR_CD);        
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCOMPANY_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpVEND_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCONS_TYP);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_ODR_CD);        
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_IN_PROC_CD);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWS_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWH_CD);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_QTY);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_DEN);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_NUM);
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_QTY);     
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpTOTAL_ISSUE_QTY);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpSCDL_ISSUE_DATE);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_DATE);   
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_TYP);          
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_FLG);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_FLG); 
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_DATE);    
-- -- DBMS_OUTPUT.PUT_LINE(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_COMMENT);

-- ▼▼ 2008/08/06 ADD START -TSUCHIDA▼▼
			OPEN CUR_PuchOdrInst_MANHOUR_TYP(sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpITEM_CD);
			FETCH CUR_PuchOdrInst_MANHOUR_TYP INTO numMANHOUR_TYP;
			CLOSE CUR_PuchOdrInst_MANHOUR_TYP;
-- ▲▲ 2008/08/06 ADD END -TSUCHIDA▲▲
-- ▼▼ 2008/08/06 ADD START -TSUCHIDA▼▼
			-- 工数管理品目区分が１：工数管理品目の場合除外
			IF numMANHOUR_TYP != 1 THEN
-- ▲▲ 2008/08/06 ADD END -TSUCHIDA▲▲
            INSERT INTO T_ISSUE_INST(
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
                WS_CD,
                WH_CD,
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
                CREATED_PRG_NM,
                UPDATED_DATE,
                UPDATED_BY,
                UPDATED_PRG_NM,
                MODIFY_COUNT
                )
            VALUES(                
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_CD,      
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPLANT_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpOD_NO,              
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpITEM_CD,            
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPS_EDITION,         
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpPUCH_ODR_CD,        
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCOMPANY_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpVEND_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpCONS_TYP,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_ODR_CD,        
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWORK_IN_PROC_CD,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWS_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpWH_CD,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_QTY,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_DEN,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_UNIT_NUM,
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_QTY,     
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpTOTAL_ISSUE_QTY,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpSCDL_ISSUE_DATE,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_DATE,   
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_TYP,          
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_CMPLT_FLG,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_FLG, 
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_ISS_DATE,    
                 sqlTmp_ISSUE_INST_REC(numCntCurr). sqlTmpISSUE_INST_COMMENT,
                 SYSDATE,
                 pvc2UserId,
                 MY_SQL_NAME,
                 SYSDATE,
                 pvc2UserId,
                 MY_SQL_NAME,
                 0
                );
-- ▼▼ 2008/08/06 ADD START -TSUCHIDA▼▼
			END IF;
-- ▲▲ 2008/08/06 ADD END -TSUCHIDA▲▲

-- -- DBMS_OUTPUT.PUT_LINE('***書込み終了***：');

            numCntCurr := numCntCurr + 1;

        END LOOP;

-- -- DBMS_OUTPUT.PUT_LINE('***書込み処理***：'|| numCntCurr);
-- DBMS_OUTPUT.PUT_LINE('***出庫指示データ作成処理終了***：');

        /* TraceLogの出力処理を行う<出庫指示データ作成処理終了> */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_END_PGNM_TOD_ADD);

    END IF;

--vc2RunChkComment := '★★★★通過 FNC00120';
-- -- DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);

-- -- DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN True;

--< 例外処理 >---------------------------------------------------------------

EXCEPTION

    WHEN excGetNewIssInstCd THEN --//自動採番に失敗

-- -- DBMS_OUTPUT.PUT_LINE('＊自動採番に失敗＊');

        /* 異常終了のメッセージ作成 */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             '(SBM0050)' || METHOD_END || LOGMSG_ERR || '：' || '自動採番に失敗しました。');


        /* TraceLog の出力（実行位置） */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME,  '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLogの出力 */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                        
    blnErrFLG := False;   --ﾜｰﾆﾝｸﾞ

    RETURN False;

    WHEN excnumunit_qty_typ THEN --//在庫単位区分取得に失敗

-- -- DBMS_OUTPUT.PUT_LINE('＊在庫単位区分取得に失敗＊');

        /* 異常終了のメッセージ */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             '(SBM0051)' || METHOD_END || LOGMSG_ERR || '：' || '在庫単位区分取得に失敗しました。');
                             

        /* TraceLog の出力（実行位置） */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLogの出力 */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                    
    blnErrFLG := False; --ﾜｰﾆﾝｸﾞ
    RETURN False;

    WHEN excNOTEXIST_M_WH THEN   --保管区データが存在しません
    
        /* 異常終了のメッセージ */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                            '(SBM0052)' || METHOD_END || LOGMSG_ERR || '：' || '保管区コードの取得に失敗しました。');
                             

        /* TraceLog の出力（実行位置） */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLogの出力 */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                    
    blnErrFLG := True; --エラー
    pvc2ErrorCd := 'ZZ11006';
    RETURN False;
    
    WHEN excNOTEXIST_SYS_PARAMETER THEN   --パラメータデータが存在しません
    
        /* 異常終了のメッセージ */
        blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                             APS_COM_OTHER_ERR,
                             '(SBM0053)' || METHOD_END || LOGMSG_ERR || '：' || 'パラメータの取得に失敗しました。');
                             

        /* TraceLog の出力（実行位置） */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);


        /* TraceLogの出力 */
        blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                                    
    blnErrFLG := True; --エラー
    pvc2ErrorCd := 'ZZ06001';
    RETURN False;
    

    WHEN OTHERS THEN   --その他のエラー

-- -- DBMS_OUTPUT.PUT_LINE('＊その他のエラー出庫指示＊');

            /* メッセージの作成 */
            vc2Comment := SUBSTRB( '(SBM0054)' || METHOD_END || LOGMSG_ERR || '：' || SQLCODE ||SQLERRM,1,1024);
            
            /* 異常終了のメッセージ */
            blnRet := FNCMSGLOG(pFileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, 
                                 APS_COM_ORACLE_ERR,
                                 vc2Comment );

                                 
           /* TraceLog の出力（実行位置） */
            blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END || vc2RunChkComment);

            --//TraceLogの出力
            blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, '(SBM0702)'||METHOD_END);
                     
    blnErrFLG := True; --ｴﾗｰ
    RETURN False;

END;
/
