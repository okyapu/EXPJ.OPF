CREATE OR REPLACE PROCEDURE SqlLoadPsMake(
/*------------------------------------------------------------------------------
'
' SQL_NAME  : SqlLoadPsMake.Sql
' version   : 1.00.00
'
' 修正履歴
' 2003.09.30 初版
' 2005.10.24 unicode対応（varchar2を4倍）
'
'
' 機能      : 負荷構成マスタ作成
'
' 引き数    ■MetamorBase共通
'           : pvc2LogMode          - (i)ＬＯＧモード
'                 pvc2OutputMode       - (i)出力モード
'                 pvc2OutputPath       - (i)出力ファイルパス
'                 pvc2OutputName       - (i)出力ファイル名
'                 pvc2UserId           - (i)ユーザＩＤ
'                 pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'       ■負荷構成マスタ作成固有
'                         無し
'
' 機能説明  : 負荷構成マスタ作成
'
' 備考
'
------------------------------------------------------------------------------*/
     pvc2LogMode            VARCHAR2    -- ＬＯＧモード
    ,pvc2OutputMode         VARCHAR2    -- 出力モード
    ,pvc2OutputPath         VARCHAR2    -- 出力パス
    ,pvc2OutputName         VARCHAR2    -- 出力ファイル名
    ,pvc2UserId             VARCHAR2    -- ユーザＩＤ
    ,pvc2BusinessName       VARCHAR2    -- 業務名
    ,pvc2PlantCd        VARCHAR2    -- 工場コード
)
IS
    -- 例外の宣言
    excGetPlant             EXCEPTION;          -- 工場取得エラー
--    excGetMyCompany         EXCEPTION;          -- 自社取得エラー
    excMistakeCommonParam   EXCEPTION;          -- 共通の入力パラメータ異常
    excMistakeNativeParam   EXCEPTION;      -- 固有の入力パラメータ異常
    excGetNewLoadPsCd       EXCEPTION;      -- 構成区別キー取得異常
    excUpdateLevelNo        EXCEPTION;      -- HIGHレベル番号更新処理異常

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(128) := 'SqlLoadPsMake';
    FIRST_MODIFY_COUNT      NUMBER       := 0;              -- 新規作成テーブルの初回の更新数
--    CTRL_CD_DEFAULT         VARCHAR2(24)  := 'SYSTEM';       -- コントロール系テーブルのPrimaryKeyの値
    MRP_EXP_TYP_ON          NUMBER       := 1;              -- MRP展開区分(0:展開しない 1:展開する)
    EFF_PHASE_IN_DATE_INI   VARCHAR2(40) := '2000/01/01';   -- 負荷構成有効開始日初期値
    EFF_PHASE_OUT_DATE_INI  VARCHAR2(40) := '2099/12/31';   -- 負荷構成有効終了日初期値
    MINIMUMBEAM             NUMBER       := 0.00000001;     -- 最小桁値(切り上げ用)
    LOAD_PS_CD_MAX          VARCHAR(23)  := PKGCOMPARAM.NUMBER_MAX;-- 構成区別キー最小値
    LOAD_PS_CD_MIN          VARCHAR(23)  := PKGCOMPARAM.NUMBER_MIN;-- 構成区別キー最大値
    NUMBER_MAX_LENGTH       NUMBER       := PKGCOMPARAM.SEQUENCE_LENGTH;  --構成区別キー採番最大桁数


    -- 変数の宣言
    UTL_FileHandle          UTL_FILE.FILE_TYPE; -- ファイルハンドル
    blnRet                  BOOLEAN;            -- 関数戻り値
    intRet                  INTEGER;            -- 関数戻り値
    vc2Comment              VARCHAR2(1024);      -- メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);      -- 実行位置確認用コメント作成作業領域
    vc2TraceComment     VARCHAR2(1024);      -- トレーース出力用コメント作成作業領域（入力パラメータ記録用）
--    vc2CompanyCd      VARCHAR2(8);    -- 会社コード
    vc2WhCd         VARCHAR2(100);       -- 受渡場所（代表納入場所コード）
    numPsUnitQty            NUMBER(22,8);       -- 数量ワーク
    numTgtCnt               NUMBER := 0;        -- 対象件数
    vc2LoadPsCd             VARCHAR2(100);       -- 構成区別キー

    -- MESSAGE の宣言
    APS_COM_BATCH_START                 VARCHAR2(28)   := 'ZZ09001';    -- バッチ処理を開始しました
    APS_COM_BATCH_END                   VARCHAR2(28)   := 'ZZ09002';    -- バッチ処理を終了しました
    APS_COM_MISTAKE_COMMON_PARAM        VARCHAR2(28)   := 'AL30001';    -- 共通の入力パラメータが誤っています
    APS_COM_MISTAKE_NATIVE_PARAM        VARCHAR2(28)   := 'AL30002';    -- 固有の入力パラメータが誤っています
    APS_COM_NOTEXIST_MY_COMPANY         VARCHAR2(28)   := 'AL30003';    -- 自社データが存在しません
    APS_COM_NOTEXIST_PLANT              VARCHAR2(28)   := 'AL30004';    -- 工場データが存在しません
    APS_COM_NOTGET_LOAD_PS_CD           VARCHAR2(28)   := 'AL30005';    -- 構成区別キーが取得できません
    APS_COM_UPDATELEVELNO_ERR           VARCHAR2(28)   := 'AL30006';    -- HIGHレベル番号更新処理異常
    APS_COM_ORACLE_ERR                  VARCHAR2(28)   := 'ZZ01106';    -- ＯＲＡＣＬＥエラー

    -- LOG の宣言
    LOGMSG_START                        VARCHAR2(20)   := 'Start';      -- ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';        -- ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    LOGMSG_START_PGNM                   VARCHAR2(192)  := '(SBM0436)<< 負荷構成マスタ作成処理開始 >>';
    LOGMSG_END_PGNM                     VARCHAR2(192)  := '<< 負荷構成マスタ作成処理終了 >>';
    LOGMSG_PARAM            VARCHAR2(64)  := '入力パラメータ：';
    LOGMSG_TGTCNT                       VARCHAR2(40)  := '対象件数：';
    LOGMSG_DONECNT                      VARCHAR2(40)  := '正常件数：';
    LOGMSG_WARCNT                       VARCHAR2(64)  := 'ワーニング件数：';
    LOGMSG_FATALCNT                     VARCHAR2(40)  := '異常件数：';
    LOGMSG_BRACKETS                     VARCHAR2(4)   := '[';
    LOGMSG_BRACKETE                     VARCHAR2(4)   := ']';
    LOGMSG_COMMA                        VARCHAR2(4)   := ',';

    -- 負荷構成マスタ作成用配列宣言
    TYPE W_LOAD_PS_R IS RECORD(
        PLAN_ITEM_CD       VARCHAR2(100),
        ITEM_CD            VARCHAR2(100),
        LOAD_PS_CD         VARCHAR2(100),
        PLAN_ITEM_LT       NUMBER(6),
--        ITEM_LT            NUMBER(6),
        ODR_LT             NUMBER(6),
        FIXED_LT           NUMBER(6),
        SAFETY_LT          NUMBER(6),
        ISSUE_LT           NUMBER(6),
        PS_UNIT_QTY        NUMBER(22,8),
        EFF_PHASE_IN_DATE  DATE,
        EFF_PHASE_OUT_DATE DATE,
        MRP_ODR_TYP        NUMBER(2)
    );
    TYPE W_LOAD_PS_T IS TABLE OF W_LOAD_PS_R INDEX BY BINARY_INTEGER;
    typW_LOAD_PS W_LOAD_PS_T;

    -- 負荷構成マスタ作成用配列INDEX宣言
    intIND   BINARY_INTEGER; -- INDEX
    intIND_W BINARY_INTEGER; -- INDEX WORK

    -- カーソルの宣言
    -- 品目
    CURSOR curM_ITEM(
        cvc2PlantCd VARCHAR2
    )
    IS
--        SELECT A.ITEM_CD,A.MRP_ODR_TYP,A.ODR_LT,A.FIXED_LT,A.SAFETY_LT,A.ISSUE_LT,A.ITEM_SPOIL,
--            DECODE(B.ITEM_CD,NULL,0,1) LOAD_FLG  
--            FROM   M_ITEM A,(SELECT ITEM_CD FROM M_NECK_WS WHERE PLANT_CD = cvc2PlantCd　GROUP BY ITEM_CD) B
--            WHERE  A.ITEM_CD = B.ITEM_CD(+) 
        SELECT A.ITEM_CD,A.HIGH_LEVEL_NO,A.MRP_ODR_TYP,A.ODR_LT,A.FIXED_LT,A.SAFETY_LT,A.ISSUE_LT,A.ITEM_SPOIL
            FROM   M_ITEM A
--WHERE A.HIGH_LEVEL_NO IN (1,2,3)
            ORDER BY A.HIGH_LEVEL_NO ASC,A.ITEM_CD ASC;

    -- 構成(親品目からのシングル正展開用)
    CURSOR curM_PS(
        cvc2ParentItemCd VARCHAR2
    )
    IS
        SELECT PARENT_ITEM_CD,COMP_ITEM_CD,PS_UNIT_DENOMINATOR ,PS_UNIT_NUMERATOR,
            EFF_PHASE_IN_DATE,EFF_PHASE_OUT_DATE,PS_SPOIL,MRP_EXP_TYP 
            FROM   M_PS
            WHERE  PARENT_ITEM_CD = cvc2ParentItemCd
            --ORDER  BY COMP_ITEM_CD ASC,PS_EDITION ASC
            ;

    -- 構成区別キー採番(データロック用)
    CURSOR curSYS_LOAD_PS_CD_CTRL 
    IS
        SELECT  LOAD_PS_CD
        FROM    SYS_LOAD_PS_CD_CTRL
        WHERE   PLANT_CD = pvc2PlantCd
        FOR UPDATE;

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

vc2RunChkComment := NULL;

/*------------------------------------------------------------
'　ログのオープンと開始メッセージの出力
-------------------------------------------------------------*/

    -- トレース出力用にパラメータを記録
    vc2TraceComment := '<<';
    vc2TraceComment := vc2TraceComment || LOGMSG_PARAM || LOGMSG_BRACKETS || pvc2LogMode || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputMode || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputPath || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2OutputName || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2UserId || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2BusinessName || LOGMSG_BRACKETE || LOGMSG_COMMA;
    vc2TraceComment := vc2TraceComment || LOGMSG_BRACKETS || pvc2PlantCd || LOGMSG_BRACKETE || '>>';
    vc2TraceComment := SUBSTR(vc2TraceComment,1,256);

    -- LogFile の OPEN
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd,pvc2OutputMode,UTL_FileHandle);

    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

/*------------------------------------------------------------
'　共通の入力パラメータをチェックする
'　固有の入力パラメータをチェックする
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 共通の入力パラメータのチェック
    IF  pvc2LogMode IS NULL THEN    --ＬＯＧモードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputMode IS NULL THEN --出力モードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputPath IS NULL THEN --出力パスがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2OutputName IS NULL THEN --出力ファイル名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2UserId IS NULL THEN     --ユーザＩＤがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2BusinessName IS NULL THEN   --業務名がＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;
    IF  pvc2PlantCd IS NULL THEN    --工場コードがＮＵＬＬ
        RAISE excMistakeCommonParam;
    END IF;

    -- 固有の入力パラメータのチェック
    -- 無し

/*------------------------------------------------------------
'　開始メッセージの出力
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00015';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 開始メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, LOGMSG_START_PGNM);

    -- コミット
    COMMIT;

/*------------------------------------------------------------
'　品目のHIGHレベル番号更新処理CALL
'　エラー時：強制終了
-------------------------------------------------------------*/
-- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'HIGH LEVEL UPDATE START');

--vc2RunChkComment := '●●●●通過 00017';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    BEGIN
        SqlUpdateLevelNo.UP_LVL(pvc2UserId);
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excUpdateLevelNo;    
    END;

    -- コミット
    COMMIT;

-- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'HIGH LEVEL UPDATE END  ');

/*------------------------------------------------------------
'　自社マスタをチェックする
'　会社コードを取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--    -- 自社マスタの存在チェック
--    BEGIN
--        SELECT  COMPANY_CD INTO vc2CompanyCd
--            FROM   SYS_MY_COMPANY
--            WHERE  SYS_MY_COMPANY.CTRL_CD = CTRL_CD_DEFAULT;  -- SYSTEMが設定
--    EXCEPTION
--        WHEN NO_DATA_FOUND THEN
--            RAISE excGetMyCompany;
--        WHEN OTHERS THEN
--            RAISE;
--    END;

/*------------------------------------------------------------
'　工場マスタをチェックする
'　代表納入場所を取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 工場マスタの存在チェック
    BEGIN
        SELECT  WH_CD INTO vc2WhCd
            FROM   M_PLANT
            WHERE  M_PLANT.PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE excGetPlant;
        WHEN OTHERS THEN
            RAISE;
    END;

/*------------------------------------------------------------
'　構成区別キーを取得する
'　エラー時：強制終了
-------------------------------------------------------------*/
--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 初回の採番のみ取得関数を使用する
    
    -- 構成区別キー取得
    blnRet := FncGetNewLoadPsCd(UTL_FileHandle
                               ,pvc2LogMode
                               ,pvc2OutputMode
                               ,pvc2UserId
                               ,pvc2BusinessName
                               ,pvc2PlantCd
                               ,vc2LoadPsCd
                               );
    IF blnRet = FALSE THEN
        RAISE excGetNewLoadPsCd;
    END IF;

    -- ソース内でカウントアップするため工場コードをはずす
    vc2LoadPsCd := SUBSTR(vc2LoadPsCd,LENGTH(pvc2PlantCd)+1,25);

    -- 構成区別キー採番テーブルロック
    OPEN curSYS_LOAD_PS_CD_CTRL;

--DBMS_OUTPUT.PUT_LINE(vc2LoadPsCd||' '||vc2LoadPsCd_Min||' '||vc2LoadPsCd_Max);

/*------------------------------------------------------------
'　負荷構成マスタ作成
-------------------------------------------------------------*/

--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 配列用INDEXの初期化
    intIND := 1;

    -- 処理順はレベル番号,品目番号の昇順
    FOR curM_ITEM_REC IN curM_ITEM(pvc2PlantCd) LOOP

        -- シングル展開
        FOR curM_PS_REC IN curM_PS(curM_ITEM_REC.ITEM_CD) LOOP

            -- 所要量展開区分が展開しない場合配列に登録しない
            IF curM_PS_REC.MRP_EXP_TYP = MRP_EXP_TYP_ON THEN

                -- 子品番で配列を検索し存在していれば新規に配列に登録する
                intIND_W := intIND;
                FOR i IN 1..intIND_W - 1 LOOP
                    IF typW_LOAD_PS(i).PLAN_ITEM_CD = curM_PS_REC.COMP_ITEM_CD THEN

                        -- (配列.有効開始日 > 構成.有効終了日)or(配列.有効終了日 < 構成.有効開始日)の場合、配列に登録しない
                        IF (typW_LOAD_PS(i).EFF_PHASE_IN_DATE <= curM_PS_REC.EFF_PHASE_OUT_DATE) 
                           AND (typW_LOAD_PS(i).EFF_PHASE_OUT_DATE >= curM_PS_REC.EFF_PHASE_IN_DATE) THEN

--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                        -- 構成区別キーカウントアップ
                        IF (TO_NUMBER(vc2LoadPsCd) + 1) > TO_NUMBER(LOAD_PS_CD_MAX) THEN
                            vc2LoadPsCd := LOAD_PS_CD_MIN;
                        ELSE
                            vc2LoadPsCd := LPAD(TO_NUMBER(vc2LoadPsCd)+1,NUMBER_MAX_LENGTH,'0');
                        END IF;

                            typW_LOAD_PS(intIND).PLAN_ITEM_CD       := curM_ITEM_REC.ITEM_CD;
                            typW_LOAD_PS(intIND).ITEM_CD            := typW_LOAD_PS(i).ITEM_CD;
                            typW_LOAD_PS(intIND).LOAD_PS_CD         := pvc2PlantCd || vc2LoadPsCd;
                            typW_LOAD_PS(intIND).PLAN_ITEM_LT       := typW_LOAD_PS(i).PLAN_ITEM_LT 
                                                                    + curM_ITEM_REC.ODR_LT + curM_ITEM_REC.FIXED_LT 
                                                                    + curM_ITEM_REC.SAFETY_LT + curM_ITEM_REC.ISSUE_LT;
--                            typW_LOAD_PS(intIND).ITEM_LT            := typW_LOAD_PS(i).ITEM_LT;
                            typW_LOAD_PS(intIND).ODR_LT            := typW_LOAD_PS(i).ODR_LT;
                            typW_LOAD_PS(intIND).FIXED_LT            := typW_LOAD_PS(i).FIXED_LT;
                            typW_LOAD_PS(intIND).SAFETY_LT            := typW_LOAD_PS(i).SAFETY_LT;
                            typW_LOAD_PS(intIND).ISSUE_LT            := typW_LOAD_PS(i).ISSUE_LT;

                            -- 切り上げのためROUND関数使用後、元の値以上ならばそのまま、未満ならば最小桁で１プラスする
                            numPsUnitQty := ROUND(((curM_PS_REC.PS_UNIT_NUMERATOR / curM_PS_REC.PS_UNIT_DENOMINATOR)
                                                    * (1 + curM_PS_REC.PS_SPOIL / 100)
                                                    * (1 + curM_ITEM_REC.ITEM_SPOIL / 100)
                                                    * typW_LOAD_PS(i).PS_UNIT_QTY),8);
                            IF numPsUnitQty >= ((curM_PS_REC.PS_UNIT_NUMERATOR / curM_PS_REC.PS_UNIT_DENOMINATOR) 
                                                    * (1 + curM_PS_REC.PS_SPOIL / 100) 
                                                    * (1 + curM_ITEM_REC.ITEM_SPOIL / 100) 
                                                    * typW_LOAD_PS(i).PS_UNIT_QTY) THEN
                                typW_LOAD_PS(intIND).PS_UNIT_QTY  := numPsUnitQty;
                            ELSE
                                typW_LOAD_PS(intIND).PS_UNIT_QTY  := ROUND(((curM_PS_REC.PS_UNIT_NUMERATOR / curM_PS_REC.PS_UNIT_DENOMINATOR)
                                                                            * (1 + curM_PS_REC.PS_SPOIL / 100)
                                                                            * (1 + curM_ITEM_REC.ITEM_SPOIL / 100)
                                                                            * typW_LOAD_PS(i).PS_UNIT_QTY),8)
                                                                            + MINIMUMBEAM ;
                            END IF;

                            typW_LOAD_PS(intIND).EFF_PHASE_IN_DATE  := GREATEST(typW_LOAD_PS(i).EFF_PHASE_IN_DATE,curM_PS_REC.EFF_PHASE_IN_DATE);
                            typW_LOAD_PS(intIND).EFF_PHASE_OUT_DATE := LEAST(typW_LOAD_PS(i).EFF_PHASE_OUT_DATE,curM_PS_REC.EFF_PHASE_OUT_DATE);
                            typW_LOAD_PS(intIND).MRP_ODR_TYP        := typW_LOAD_PS(i).MRP_ODR_TYP;
--                            typW_LOAD_PS(intIND).CRE_DATE           := SYSDATE;
                            intIND := intIND + 1;
--
IF intIND/1000=ROUND(intIND/1000) THEN
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, ' LEVEL='||TO_CHAR(curM_ITEM_REC.HIGH_LEVEL_NO)||' '||TO_CHAR(intIND));
END IF;
--


                        END IF;
                    END IF;
                END LOOP;
            END IF;
    END LOOP;

--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        -- 構成区別キーカウントアップ
        IF (TO_NUMBER(vc2LoadPsCd) + 1) > TO_NUMBER(LOAD_PS_CD_MAX) THEN
            vc2LoadPsCd := LOAD_PS_CD_MIN;
        ELSE
            vc2LoadPsCd := LPAD(TO_NUMBER(vc2LoadPsCd)+1,NUMBER_MAX_LENGTH,'0');
        END IF;

        -- 品目番号自分自身のW_LOAD_PS登録
        typW_LOAD_PS(intIND).PLAN_ITEM_CD       := curM_ITEM_REC.ITEM_CD;
        typW_LOAD_PS(intIND).ITEM_CD            := curM_ITEM_REC.ITEM_CD;
        typW_LOAD_PS(intIND).LOAD_PS_CD         := pvc2PlantCd || vc2LoadPsCd;
        typW_LOAD_PS(intIND).PLAN_ITEM_LT       := 0;
--        typW_LOAD_PS(intIND).ITEM_LT            := curM_ITEM_REC.ODR_LT + curM_ITEM_REC.FIXED_LT 
--                                                + curM_ITEM_REC.SAFETY_LT + curM_ITEM_REC.ISSUE_LT;
        typW_LOAD_PS(intIND).ODR_LT            := curM_ITEM_REC.ODR_LT;
        typW_LOAD_PS(intIND).FIXED_LT            := curM_ITEM_REC.FIXED_LT;
        typW_LOAD_PS(intIND).SAFETY_LT            := curM_ITEM_REC.SAFETY_LT;
        typW_LOAD_PS(intIND).ISSUE_LT            := curM_ITEM_REC.ISSUE_LT;

        -- 切り上げのためROUND関数使用後、元の値以上ならばそのまま、未満ならば最小桁で１プラスする
        numPsUnitQty := ROUND(1 * (1 + curM_ITEM_REC.ITEM_SPOIL / 100),8);
        IF numPsUnitQty >= (1 * (1 + curM_ITEM_REC.ITEM_SPOIL / 100)) THEN
            typW_LOAD_PS(intIND).PS_UNIT_QTY        := numPsUnitQty;
        ELSE
            typW_LOAD_PS(intIND).PS_UNIT_QTY        := ROUND(1 * (1 + curM_ITEM_REC.ITEM_SPOIL / 100),8) + MINIMUMBEAM;
        END IF;

        typW_LOAD_PS(intIND).EFF_PHASE_IN_DATE  := TO_DATE(EFF_PHASE_IN_DATE_INI,'YYYY/MM/DD');
        typW_LOAD_PS(intIND).EFF_PHASE_OUT_DATE := TO_DATE(EFF_PHASE_OUT_DATE_INI,'YYYY/MM/DD');
        typW_LOAD_PS(intIND).MRP_ODR_TYP        := curM_ITEM_REC.MRP_ODR_TYP;
--        typW_LOAD_PS(intIND).CRE_DATE           := SYSDATE;
        intIND := intIND + 1;

--
IF intIND/1000=ROUND(intIND/1000) THEN
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, ' LEVEL='||TO_CHAR(curM_ITEM_REC.HIGH_LEVEL_NO)||' '||TO_CHAR(intIND));
END IF;
--

    END LOOP;

--vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

---------
    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'MAKE_END');
----------
/*------------------------------------------------------------
'　負荷構成マスタ削除
-------------------------------------------------------------*/

--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    DELETE FROM M_LOAD_PS;

---------
    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'DEL_END');
----------

    -- 登録件数初期化
    numTgtCnt := 0;

    -- 負荷構成データの登録
    intIND_W := intIND;
    FOR i IN 1..intIND_W - 1 LOOP



            INSERT INTO M_LOAD_PS (
                PLAN_ITEM_CD
               ,ITEM_CD
               ,LOAD_PS_CD
               ,MRP_ODR_TYP
               ,PLAN_ITEM_LT
--               ,ITEM_LT
               ,ODR_LT
               ,FIXED_LT
               ,SAFETY_LT
               ,ISSUE_LT
               ,PS_UNIT_QTY
               ,EFF_PHASE_IN_DATE
               ,EFF_PHASE_OUT_DATE
               ,CREATED_DATE
               ,CREATED_BY
               ,CREATED_PRG_NM
               ,UPDATED_DATE
               ,UPDATED_BY
               ,UPDATED_PRG_NM
               ,MODIFY_COUNT
            ) VALUES (
                typW_LOAD_PS(i).PLAN_ITEM_CD       -- 立案品目番号
               ,typW_LOAD_PS(i).ITEM_CD            -- 構成品目番号
               ,typW_LOAD_PS(i).LOAD_PS_CD         -- 構成区別キー
               ,typW_LOAD_PS(i).MRP_ODR_TYP       -- 構成品目手配区分
               ,typW_LOAD_PS(i).PLAN_ITEM_LT       -- 立案品目リードタイム
--               ,typW_LOAD_PS(i).ITEM_LT              -- 品目リードタイム
               ,typW_LOAD_PS(i).ODR_LT             -- 品目手配リードタイム
               ,typW_LOAD_PS(i).FIXED_LT       -- 品目固定分リードタイム
               ,typW_LOAD_PS(i).SAFETY_LT      -- 品目安全日数
               ,typW_LOAD_PS(i).ISSUE_LT       -- 品目払出リードタイム
               ,typW_LOAD_PS(i).PS_UNIT_QTY        -- 必要数
               ,typW_LOAD_PS(i).EFF_PHASE_IN_DATE  -- 製品構成有効開始日
               ,typW_LOAD_PS(i).EFF_PHASE_OUT_DATE -- 製品構成有効終了日
               ,SYSDATE                            -- 作成日時
               ,pvc2UserId                         -- 作成者
               ,MY_SQL_NAME                    -- 作成プログラム名
               ,SYSDATE                            -- 更新日
               ,pvc2UserId                         -- 更新者
               ,MY_SQL_NAME                    -- 更新プログラム名
               ,FIRST_MODIFY_COUNT                 -- 更新数
             );

            numTgtCnt := numTgtCnt + 1;


    END LOOP;

---------
    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'ADD_END');
----------

--vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 構成区別キー更新
    UPDATE SYS_LOAD_PS_CD_CTRL 
    SET  LOAD_PS_CD        = vc2LoadPsCd
        ,UPDATED_DATE   = SYSDATE
        ,UPDATED_BY     = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE  PLANT_CD = pvc2PlantCd;

    -- コミット
    COMMIT;

    -- 終了メッセージの作成
    vc2Comment := LOGMSG_END_PGNM;
    vc2Comment :='(SBM0438)' || vc2Comment || LOGMSG_TGTCNT || LOGMSG_BRACKETS || numTgtCnt || LOGMSG_BRACKETE ;
    vc2Comment := SUBSTR(vc2Comment,1,256);

    -- 終了メッセージの出力
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

    -- TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

    -- コミット
    COMMIT;

    -- LogFile の CLOSE
    blnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

/*------------------------------------------------------------
'　強制終了（異常終了）となるEXCEPTION
-------------------------------------------------------------*/
EXCEPTION

    WHEN excMistakeCommonParam  THEN    -- 共通の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeCommonParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0439)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：共通の入力パラメータが誤っています',
                             1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            NVL(pvc2UserId,' '), NVL(pvc2BusinessName,' '),NVL(pvc2PlantCd,' '),
                            MY_SQL_NAME, APS_COM_MISTAKE_COMMON_PARAM, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excMistakeNativeParam  THEN    --固有の入力パラメータが不備
--DBMS_OUTPUT.PUT_LINE('excMistakeNativeParam');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0440)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：固有の入力パラメータが誤っています',
                             1,256);

        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_MISTAKE_NATIVE_PARAM, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

--    WHEN excGetMyCompany  THEN    --自社取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetMyCompany');
--        ROLLBACK;
--        -- 終了メッセージの作成
--        vc2Comment := SUBSTR(LOGMSG_END_PGNM || LOGMSG_ERR || '：自社取得エラー',
--                             1,256);
--        -- 終了メッセージの出力
--        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                            MY_SQL_NAME, APS_COM_NOTEXIST_MY_COMPANY, vc2Comment);
--        -- TraceLog の出力
--        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
--                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
--                              MY_SQL_NAME, LOGMSG_END || vc2TraceComment);
--        COMMIT;
--
--        -- LogFile の CLOSE
--        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetPlant  THEN    --工場取得エラー
--DBMS_OUTPUT.PUT_LINE('excGetPlant');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0441)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：工場取得エラー'||
                             LOGMSG_BRACKETS||pvc2PlantCd||LOGMSG_BRACKETE,
                             1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_PLANT, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excGetNewLoadPsCd  THEN    --構成区別キーエラー
--DBMS_OUTPUT.PUT_LINE('excGetNewLoadCd');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTR('(SBM0442)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：構成区別キー取得エラー',1,256);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTGET_LOAD_PS_CD, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);
        COMMIT;

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN excUpdateLevelNo THEN
--DBMS_OUTPUT.PUT_LINE('excUpdateLevelNo');

        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0443)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：HIGHレベル番号更新処理異常',1,256);

        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_UPDATELEVELNO_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

        COMMIT;

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('excOTHERS');

        ROLLBACK;
        vc2Comment := SUBSTR('(SBM0444)' || LOGMSG_END_PGNM || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTR(SQLERRM,1,256),
                             1,256);

        -- 終了メッセージの出力
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog の出力
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, '(SBM0698)'||LOGMSG_END || vc2TraceComment);

        COMMIT;

        -- LogFile の CLOSE
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
