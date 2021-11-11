CREATE OR REPLACE PROCEDURE SQLCSPUCHALL (
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsPuchAll.sql,v $
'$Author: geng-jia $
'$Revision: 1.8 $
'$Date: 2015/11/16 08:20:18 $
'
' 機能      : 購入単価情報一括登録処理
'
' 戻り値    :
'
' 引き数    : ■EXPLANNER/J共通（必須）
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             ■プログラム固有
'             pnumBatchTyp         - (i)バッチ処理区分
'             pnumYear             - (i)対象年度
'             pnumHalfTermTyp      - (i)半期区分
'             pnumCostTyp          - (i)原価種別
'             pnumYyyyMm           - (i)暦日の年月
'             pnumExecuteTyp       - (i)実行処理区分
'                                      1:工程情報抽出と工程情報一括登録（デフォルト）
'                                      2:工程情報抽出処理のみ
'                                      3:工程情報一括登録のみ
'             pnumUpdateMode       - (i)更新モード
'             pnumReturn           - (o)処理結果 (1:正常終了、2:警告終了、3:異常終了)
'
'
' 機能説明  : [購入品インタフェース]を基に、[購入品マスタ]を作成する。
'            またエラー情報を[一括登録エラー]に出力する。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode          IN  VARCHAR2        --ＬＯＧモード
   ,pvc2OutputMode       IN  VARCHAR2        --出力モード
   ,pvc2OutputPath       IN  VARCHAR2        --出力パス
   ,pvc2OutputName       IN  VARCHAR2        --出力ファイル名
   ,pvc2UserId           IN  VARCHAR2        --ユーザＩＤ
   ,pvc2BusinessName     IN  VARCHAR2        --業務名
   ,pvc2PlantCd          IN  VARCHAR2        --工場コード
   ,pnumBatchTyp         IN  NUMBER          --バッチ処理区分
   ,pnumYear             IN  NUMBER          --対象年度
   ,pnumHalfTermTyp      IN  NUMBER          --半期区分
   ,pnumCostTyp          IN  NUMBER          --原価種別
   ,pnumYyyyMm           IN  NUMBER        --暦日の年月
   ,pnumExecuteTyp       IN  NUMBER        --実行処理区分
   ,pnumUpdateMode       IN NUMBER        --更新モード
   ,pnumReturn           OUT  NUMBER        --処理結果
)
IS
   /* 定数の宣言 */

    METHOD_START            VARCHAR2(20) := 'START';          --ログ用メソッド開始宣言
    METHOD_END              VARCHAR2(12) := 'End';            --ログ用メソッド終了宣言
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSPUCHALL'; --ＰＬ／ＳＱＬ名

    APS_COM_BATCH_START     VARCHAR2(28) := 'DB02003';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DB02004';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DB02007';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0343)購入単価情報一括登録処理を開始しました';
    LOGMSG_END_PGNM         VARCHAR2(200) := '購入単価情報一括登録処理を終了しました';

    STATUS_NORMAL           NUMBER        := 1;          -- 正常終了
    STATUS_WARNING          NUMBER        := 2;          -- 警告終了
    STATUS_ERROR          NUMBER        := 3;          -- 異常終了


    /* 変数の定義 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --ファイルハンドル

    numReadCount  NUMBER(11)   := 0;  -- 読込件数
    numErrorCount NUMBER(11)   := 0;  -- エラー件数
    blnRet                  BOOLEAN;        --共通関数の戻値
    vc2Comment              VARCHAR2(1024);  --メッセージ作成用
    numOverlap     NUMBER(2) := 0; -- 重複フラグ
    numRecordCount  NUMBER(11)  := 0;   -- 購入品インタフェースワーク格納数

    tempItemCd VARCHAR2(100) := 'START'; -- 繰り返しで品目退避用
    delFlg BOOLEAN := TRUE; -- 繰り返しの削除フラグ
    errFlg BOOLEAN := FALSE; -- 繰り返しのエラーフラグ
    numLastCount  NUMBER(11)   := 0;   --最終行リストカウント

    /* 例外処理用変数 */
    excNORMAL_SKIP   EXCEPTION;      --実行不可
    excERR_CUR       EXCEPTION;      --カーソルOPEN中のEXCEPTION

    /* 購入品インタフェースワーク */
    TYPE csPuchIfWork IS RECORD (
      itemCd  VARCHAR2(100),
      puchPriorityRefNo NUMBER(6),-- ワーク優先順位
      vendCd VARCHAR2(100), -- ワーク取引先
      effPhaseInDate VARCHAR2(100), -- 有効開始日
      exis   BOOLEAN := FALSE, -- [購入品マスタ]に存在すればtrue、存在しなければfalse
      err     BOOLEAN := FALSE, -- エラーがあって一括登録エラーに登録したらtrueで、購入品インタフェースの更新済フラグを1にしない。エラーがなければ購入品マスタに登録し、購入品インタフェースの登録済フラグを1にする。
      del     BOOLEAN := FALSE -- trueのとき、購入品マスタの削除フラグを１(削除済）にする。
    );

    /* 購入品インタフェースワークリスト */
    TYPE csPuchIfWorkList IS VARRAY(1000000) OF csPuchIfWork;

    /* 購入品インタフェースワークリスト初期化 */
    workCsPuchIfWorkList csPuchIfWorkList := csPuchIfWorkList();

    /* カーソルの宣言  購入品インタフェース */
    CURSOR curT_CS_PUCH_IF
    IS
    select
      to_char(T_CS_PUCH_IF."COST_TYP") as "COST_TYP",
      T_CS_PUCH_IF."PLANT_CD" as "PLANT_CD",
      T_CS_PUCH_IF."ITEM_CD" as "ITEM_CD",
      T_CS_PUCH_IF."CS_PROC_CD" as "CS_PROC_CD",
      T_CS_PUCH_IF."VEND_CD" as "VEND_CD",
      to_char(T_CS_PUCH_IF."EFF_PHASE_IN_DATE", 'YYYY/MM/DD HH24:MI:SS') as "EFF_PHASE_IN_DATE",
      to_char(T_CS_PUCH_IF."PUCH_PRIORITY_REF_NO") as "PUCH_PRIORITY_REF_NO",
      to_char(T_CS_PUCH_IF."UNIT_COST") as "UNIT_COST",
      to_char(T_CS_PUCH_IF."UNIT_COST_TYP") as "UNIT_COST_TYP",
      T_CS_PUCH_IF."CUR_CD" as "CUR_CD",
      to_char(T_CS_PUCH_IF."EXCH_RATE") as "EXCH_RATE",
      to_char(T_CS_PUCH_IF."PUCH_UNIT_QTY") as "PUCH_UNIT_QTY",
      to_char(T_CS_PUCH_IF."RCY_VAL_UNIT_COST") as "RCY_VAL_UNIT_COST",
      to_char(T_CS_PUCH_IF."RCY_RECOUP_RATE") as "RCY_RECOUP_RATE",
      T_CS_PUCH_IF."CLASIFICATION_CD" as "CLASIFICATION_CD",
      T_CS_PUCH_IF.COMPANY_CD as COMPANY_CD,
      T_CS_PUCH_IF.ORG_CD as ORG_CD,
      T_CS_PUCH_IF."STOCK_UNIT" as "STOCK_UNIT",
      to_char(T_CS_PUCH_IF."CS_PUCH_TYP") as "CS_PUCH_TYP",
      to_char(T_CS_PUCH_IF."ONEROUS_CONS_FLG") as "ONEROUS_CONS_FLG",
      to_char(T_CS_PUCH_IF."TRANSACTION_TYP") as "TRANSACTION_TYP",
      to_char(T_CS_PUCH_IF."UPD_FLG") as "UPD_FLG"
    from
      T_CS_PUCH_IF
-- 2008/04/20 対象半期の中で品目／取引先単位に有効開始日が大きいレコードのみを取得するように修正① START
      ,( select YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ITEM_CD,CS_PROC_CD,VEND_CD,MAX(EFF_PHASE_IN_DATE) as MAX_DATE,TRANSACTION_TYP
           from T_CS_PUCH_IF
          where YEAR = pnumYear
            and HALF_TERM_TYP = pnumHalfTermTyp
            and COST_TYP = pnumCostTyp
            and PLANT_CD = pvc2PlantCd
            and CS_PROC_CD = '*'
            and to_date(to_char(EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') <= to_date(pnumYyyyMm, 'YYYYMM')
            and UPD_FLG = 0
          group by YEAR,HALF_TERM_TYP,COST_TYP,PLANT_CD,ITEM_CD,CS_PROC_CD,VEND_CD,TRANSACTION_TYP
        )MAX_CS_PUCH
-- 2008/04/20 対象半期の中で品目／取引先単位に有効開始日が大きいレコードのみを取得するように修正① END
    where 
-- 2008/04/20 対象半期の中で品目／取引先単位に有効開始日が大きいレコードのみを取得するように修正② START
          ( T_CS_PUCH_IF."YEAR" = MAX_CS_PUCH."YEAR"
        and T_CS_PUCH_IF.HALF_TERM_TYP = MAX_CS_PUCH.HALF_TERM_TYP
        and T_CS_PUCH_IF.COST_TYP = MAX_CS_PUCH.COST_TYP
        and T_CS_PUCH_IF."PLANT_CD" = MAX_CS_PUCH."PLANT_CD"
        and T_CS_PUCH_IF."ITEM_CD" = MAX_CS_PUCH."ITEM_CD"
        and T_CS_PUCH_IF."CS_PROC_CD" = MAX_CS_PUCH."CS_PROC_CD"
        and T_CS_PUCH_IF."VEND_CD" = MAX_CS_PUCH."VEND_CD"
        and T_CS_PUCH_IF."EFF_PHASE_IN_DATE" = MAX_CS_PUCH."MAX_DATE" )
        and
-- 2008/04/20 対象半期の中で品目／取引先単位に有効開始日が大きいレコードのみを取得するように修正② END      
        T_CS_PUCH_IF."YEAR" = pnumYear
        and T_CS_PUCH_IF.HALF_TERM_TYP = pnumHalfTermTyp
        and T_CS_PUCH_IF.COST_TYP = pnumCostTyp
        and T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
        and T_CS_PUCH_IF."CS_PROC_CD" = '*'
        and to_date(to_char(T_CS_PUCH_IF."EFF_PHASE_IN_DATE", 'YYYYMM'), 'YYYYMM') <= to_date(pnumYyyyMm, 'YYYYMM')
        and T_CS_PUCH_IF."UPD_FLG" = 0
    order by
      T_CS_PUCH_IF."PLANT_CD",
      T_CS_PUCH_IF."ITEM_CD",
      T_CS_PUCH_IF."PUCH_PRIORITY_REF_NO",
      T_CS_PUCH_IF."EFF_PHASE_IN_DATE" DESC,
      T_CS_PUCH_IF."VEND_CD"

    ;
    recT_CS_PUCH_IF curT_CS_PUCH_IF%ROWTYPE;

/*------------------------------------------------------------------------------
'
' 機能      : 品目存在判定
'
' 引数      : pvc2ITEM_CD 品目コード
'
' 戻り値    : BOOLEAN
'
' 機能説明  : 品目マスタに存在するか確認する。
'            存在する場合はtrue、存在しない場合はfalse
'
'
------------------------------------------------------------------------------*/

FUNCTION FNCITEMEXIST(
  pvc2ITEM_CD IN VARCHAR2
) RETURN BOOLEAN IS
  numItemCount     NUMBER;
BEGIN
  SELECT COUNT(*) INTO numItemCount from M_ITEM
    WHERE ITEM_CD = pvc2ITEM_CD;
  IF numItemCount <> 0 THEN
    RETURN TRUE;
  ELSE
    RETURN FALSE;
  END IF;
END;

/*------------------------------------------------------------------------------
'
' 機能      : 購入品マスタ存在判定
'
' 引数      : pvc2ITEM_CD 品目コード
'
' 戻り値    : [購入品マスタ]に存在すればTRUE,存在しなければFALSE
'
' 機能説明  : [購入品マスタ]に存在するかを判定します 。
'
------------------------------------------------------------------------------*/

FUNCTION FNCMCPUCHEXIST(
  pvc2ITEM_CD IN VARCHAR2
) RETURN BOOLEAN IS
  numItemCount     NUMBER;
BEGIN
  SELECT
    COUNT(*)
  INTO numItemCount
  FROM
    M_CS_PUCH
  WHERE
    M_CS_PUCH."YEAR" = pnumYear
    and M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
    and M_CS_PUCH."COST_TYP" = pnumCostTyp
    and M_CS_PUCH."PLANT_CD" = pvc2PlantCd
    and M_CS_PUCH."ITEM_CD" = pvc2ITEM_CD
  ;
  IF numItemCount <> 0 THEN
    RETURN TRUE;
  ELSE
    RETURN FALSE;
  END IF;

END;

/*------------------------------------------------------------------------------
'
' 機能      : 購入品マスタ優先区分取得
'
' 戻り値    : 購入品マスタ優先区分
'
' 機能説明  : "購入品マスタ優先区分"を返します。
'
------------------------------------------------------------------------------*/

FUNCTION FNCGETPRIORITYTYP(
  pnumPriorityTyp OUT NUMBER
) RETURN NUMBER IS
BEGIN

  SELECT
    M_CS_PUCH_PRIORITY_TYP
  INTO pnumPriorityTyp
  FROM
  SYS_COST_CTRL
  WHERE
    SYS_COST_CTRL."PLANT_CD" = pvc2PlantCd
  ;
  RETURN pnumPriorityTyp;
END;

/*------------------------------------------------------------------------------
'
' 機能      : マスタ優先で、かつマスタによって更新されているかを判定
'
' 戻り値    : 購入品マスタ優先区分=1:マスタ、更新区分=2:マスタで更新の場合はtrueを返します。
'            上記以外はfalseを返します。
'            マスタ更新可能な場合はtrue、変更不可の場合はfalse
'
' 機能説明  : マスタ優先で、かつマスタによって更新されているかを判定します。
'
------------------------------------------------------------------------------*/

FUNCTION FNCISUPDATEDBYMASTER(
  pvc2ItemCd IN VARCHAR2
) RETURN BOOLEAN IS
  pnumUpdateTyp NUMBER;
  pnumdummy NUMBER;
BEGIN
  select
    M_CS_PUCH."UPDATE_TYP" as "UPDATE_TYP"
  INTO pnumUpdateTyp
  FROM
    M_CS_PUCH
  where
    M_CS_PUCH."YEAR" = pnumYear
    and M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
    and M_CS_PUCH."COST_TYP" = pnumCostTyp
    and M_CS_PUCH."PLANT_CD" = pvc2PlantCd
    and M_CS_PUCH."ITEM_CD" = pvc2ItemCd
  ;

  IF FNCGETPRIORITYTYP(pnumdummy) = 1 AND pnumUpdateTyp = 2 THEN
    RETURN TRUE;
  ELSE
    RETURN FALSE;
  END IF;
END;

/*------------------------------------------------------------------------------
'
' 機能      : 一括登録エラー登録
'
' 引数      :　pvc2MessageCode エラーのメッセージコード
'             pnumCount IF入力件数（読込件数）
'
' 戻り値    : BOOLEAN
'
' 機能説明  : 現在のエラー情報を[一括登録エラー]に登録する。
'
'
------------------------------------------------------------------------------*/

FUNCTION FNCINSERTCSERROR(
  pvc2MessageCode IN VARCHAR2, -- メッセージコード
  pnumCount IN NUMBER, -- 読込件数
  pvc2ItemCd  IN VARCHAR2,
  pvc2CsProcCd IN VARCHAR2, -- 工程コード
  pvc2VendCd IN VARCHAR2, -- 取引先コード
  pvc2EffectiveStartDate  IN VARCHAR2, -- 有効開始日
  pnumTransactionTyp IN NUMBER -- 処理区分
) RETURN BOOLEAN IS
  pvc2SeqCsErrorCd  VARCHAR2(80); --原価一括登録エラー番号
BEGIN

  SELECT
    to_char(SEQ_CS_ERROR_CD.NEXTVAL, 'FM00000000000000000000') as CS_ERROR_CD
  INTO pvc2SeqCsErrorCd
  FROM
    DUAL
  ;

  INSERT INTO T_CS_ERROR(
    CS_ERROR_CD,
    BATCH_TYP,
    BUSINESS_ID,
    COST_TYP,
    PLANT_CD,
    ITEM_CD,
    CS_PROC_CD,
    VEND_CD,
    PROC_COST_CLS_CD,
    EFFECTIVE_START_DATE,
    TRANSACTION_TYP,
    MESSAGE_CD,
    READ_COUNT,
    REMARKS,
    LIST_ISS_FLG,
    CREATED_DATE,
    CREATED_BY,
    CREATED_PRG_NM,
    UPDATED_DATE,
    UPDATED_BY,
    UPDATED_PRG_NM,
    MODIFY_COUNT
    )
  values
    (pvc2SeqCsErrorCd, -- エラーコード
    pnumBatchTyp, -- バッチ処理区分
    pvc2BusinessName,
    pnumCostTyp, -- 原価種別
    pvc2PlantCd, -- 工場コード
    pvc2ItemCd, -- 品目コード
    pvc2CsProcCd, -- 工程コード
    pvc2VendCd, -- 取引先コード
    null,
    to_date(pvc2EffectiveStartDate, 'YYYY/MM/DD HH24:MI:SS'), -- 有効開始日
    pnumTransactionTyp, -- 処理区分
    pvc2MessageCode, -- メッセージコード
    pnumCount, -- 読込件数
    'YEAR=' || TO_CHAR(pnumYear) || ' HALF_TERM_TYP='|| TO_CHAR(pnumHalfTermTyp),
    0,
    SYSDATE,
    pvc2UserId,
    pvc2BusinessName,
    SYSDATE,
    pvc2UserId,
    pvc2BusinessName,
    0)
    ;
    DBMS_OUTPUT.PUT_LINE(pvc2SeqCsErrorCd);
    return TRUE;

END;


BEGIN
    /* LogFile の OPEN */
    blnRet :=  FNCLOGOPEN(pvc2OutputPath, pvc2OutputName,pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);

    /* TraceLogの出力(Start)処理を行う */
    blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode, pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, METHOD_START);

    /* 業務開始メッセージの出力 */
    blnRet :=   FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
                          pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_START,
                          LOGMSG_START_PGNM);
    COMMIT;

/***********************************************************************
' メイン処理
***********************************************************************/

    FOR recT_CS_PUCH_IF IN curT_CS_PUCH_IF LOOP
      numReadCount := numReadCount + 1; -- 読込件数+1

      IF (numRecordCount = 0 OR
        recT_CS_PUCH_IF.ITEM_CD != workCsPuchIfWorkList(numRecordCount).itemCd)
        OR
        (recT_CS_PUCH_IF.ITEM_CD = workCsPuchIfWorkList(numRecordCount).itemCd
        AND recT_CS_PUCH_IF.TRANSACTION_TYP != 3
        AND numOverlap = 0)
      THEN
        numOverlap := 0;

        numRecordCount := numRecordCount + 1;
        workCsPuchIfWorkList.EXTEND;
        workCsPuchIfWorkList(numRecordCount).itemCd := recT_CS_PUCH_IF.ITEM_CD;
        workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo := recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO;
        workCsPuchIfWorkList(numRecordCount).vendCd := recT_CS_PUCH_IF.VEND_CD;
        workCsPuchIfWorkList(numRecordCount).effPhaseInDate := recT_CS_PUCH_IF.EFF_PHASE_IN_DATE;
        workCsPuchIfWorkList(numRecordCount).exis := FNCMCPUCHEXIST(recT_CS_PUCH_IF.ITEM_CD); -- 購入品マスタ存在判定
        workCsPuchIfWorkList(numRecordCount).err := FALSE;
        workCsPuchIfWorkList(numRecordCount).del := FALSE;

        -- [品目]存在チェック
        IF FNCITEMEXIST(workCsPuchIfWorkList(numRecordCount).itemCd) = FALSE THEN
          -- [品目]が存在しない場合
          -- 一括登録エラーに登録
          blnRet := FNCINSERTCSERROR(
            'ZZ11002', -- メッセージコード
            numReadCount,
            recT_CS_PUCH_IF.ITEM_CD,
            recT_CS_PUCH_IF.CS_PROC_CD, --　工程コード
            recT_CS_PUCH_IF.VEND_CD, -- 取引先コード
            recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- 有効開始日
            recT_CS_PUCH_IF.TRANSACTION_TYP -- 処理区分
            );

          workCsPuchIfWorkList(numRecordCount).err := TRUE;
          numErrorCount := numErrorCount + 1;

        -- マスタ更新可否チェック
        ELSIF workCsPuchIfWorkList(numRecordCount).exis = TRUE
                AND FNCISUPDATEDBYMASTER(recT_CS_PUCH_IF.ITEM_CD) = TRUE THEN
          -- 一括登録エラーに登録
          blnRet := FNCINSERTCSERROR(
            'DB00009', -- メッセージコード
            numReadCount,
            recT_CS_PUCH_IF.ITEM_CD,
            recT_CS_PUCH_IF.CS_PROC_CD, --　工程コード
            recT_CS_PUCH_IF.VEND_CD, -- 取引先コード
            recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- 有効開始日
            recT_CS_PUCH_IF.TRANSACTION_TYP -- 処理区分
            );

          workCsPuchIfWorkList(numRecordCount).err := TRUE;
          numErrorCount := numErrorCount + 1;
        -- [購入品IF]."トランザクションタイプ" 3（削除）のとき
        ELSIF recT_CS_PUCH_IF.TRANSACTION_TYP = 3 THEN
          -- [購入品マスタ]存在チェック
          IF workCsPuchIfWorkList(numRecordCount).exis = FALSE THEN
            blnRet := FNCINSERTCSERROR(
              'DB00017', -- メッセージコード
              numReadCount,
              recT_CS_PUCH_IF.ITEM_CD,
              recT_CS_PUCH_IF.CS_PROC_CD, --　工程コード
              recT_CS_PUCH_IF.VEND_CD, -- 取引先コード
              recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- 有効開始日
              recT_CS_PUCH_IF.TRANSACTION_TYP -- 処理区分
              );

            workCsPuchIfWorkList(numRecordCount).err := TRUE;
            numErrorCount := numErrorCount + 1;
          END IF;
          -- 削除フラグON
          workCsPuchIfWorkList(numRecordCount).del := TRUE;

        END IF;

        -- [購入品IF]."トランザクションタイプ"判定
        IF recT_CS_PUCH_IF.TRANSACTION_TYP != 3
          AND workCsPuchIfWorkList(numRecordCount).err != TRUE THEN
          -- [購入品マスタ]存在チェック
          IF workCsPuchIfWorkList(numRecordCount).exis = FALSE THEN
          -- [購入品マスタ]に存在しない場合
            INSERT INTO M_CS_PUCH(
              "YEAR",
              "HALF_TERM_TYP",
              "COST_TYP",
              "PLANT_CD",
              "ITEM_CD",
              "CS_PROC_CD",
              "VEND_CD",
              "UNIT_COST",
              "UNIT_COST_TYP",
              "CUR_CD",
              "EXCH_RATE",
              "PUCH_UNIT_QTY",
              "RCY_VAL_UNIT_COST",
              "RCY_RECOUP_RATE",
              "SUB_VEND_CD",
              "SUB_UNIT_COST",
              "SUB_UNIT_COST_TYP",
              "SUB_CUR_CD",
              "SUB_EXCH_RATE",
              "SUB_PUCH_UNIT_QTY",
              "SUB_RCY_VAL_UNIT_COST",
              "SUB_RCY_RECOUP_RATE",
              "CLASIFICATION_CD",
              "STOCK_UNIT",
              "UNIT_COST_ACCEPT_TYP",
              "CS_PUCH_TYP",
              "ONEROUS_CONS_FLG",
              "UPDATE_TYP",
              "DEL_FLG",
              "COMPANY_CD",
              "ORG_CD",
              CREATED_DATE, --作成日
              CREATED_BY, --作成者
              CREATED_PRG_NM, --作成プログラム名
              UPDATED_DATE, --更新日
              UPDATED_BY, --更新者
              UPDATED_PRG_NM, --更新プログラム名
              MODIFY_COUNT) --更新数
            values
              (pnumYear,
              pnumHalfTermTyp,
              recT_CS_PUCH_IF.COST_TYP,
              recT_CS_PUCH_IF.PLANT_CD,
              recT_CS_PUCH_IF.ITEM_CD,
              null,
              recT_CS_PUCH_IF.VEND_CD,
              recT_CS_PUCH_IF.UNIT_COST,
              recT_CS_PUCH_IF.UNIT_COST_TYP,
              recT_CS_PUCH_IF.CUR_CD,
              recT_CS_PUCH_IF.EXCH_RATE,
              recT_CS_PUCH_IF.PUCH_UNIT_QTY,
              recT_CS_PUCH_IF.RCY_VAL_UNIT_COST,
              recT_CS_PUCH_IF.RCY_RECOUP_RATE,
              null,
              0,
              1,
              null,
              0,
              1,
              0,
              0,
              recT_CS_PUCH_IF.CLASIFICATION_CD,
              recT_CS_PUCH_IF.STOCK_UNIT,
              1,
              1,
              recT_CS_PUCH_IF.ONEROUS_CONS_FLG,
              1,
              0,
              recT_CS_PUCH_IF.COMPANY_CD,
              recT_CS_PUCH_IF.ORG_CD,
              SYSDATE,  --システム日時
              pvc2UserId, --引数.ユーザーＩＤ
              pvc2BusinessName, --引数.業務名
              SYSDATE,  --システム日時
              pvc2UserId, --引数.ユーザーＩＤ
              pvc2BusinessName, --引数.業務名
              0
              )
              ;
          ELSE
            UPDATE
              M_CS_PUCH
            SET
              VEND_CD = recT_CS_PUCH_IF.VEND_CD,
              UNIT_COST = recT_CS_PUCH_IF.UNIT_COST,
              UNIT_COST_TYP = recT_CS_PUCH_IF.UNIT_COST_TYP,
              CUR_CD = recT_CS_PUCH_IF.CUR_CD,
              EXCH_RATE = recT_CS_PUCH_IF.EXCH_RATE,
              PUCH_UNIT_QTY = recT_CS_PUCH_IF.PUCH_UNIT_QTY,
              RCY_VAL_UNIT_COST = recT_CS_PUCH_IF.RCY_VAL_UNIT_COST,
              RCY_RECOUP_RATE = recT_CS_PUCH_IF.RCY_RECOUP_RATE,
              "SUB_VEND_CD" = null,
              "SUB_UNIT_COST" = 0,
              "SUB_UNIT_COST_TYP" = 1,
              "SUB_CUR_CD" = null,
              "SUB_EXCH_RATE" = 0,
              "SUB_PUCH_UNIT_QTY" = 1,
              "SUB_RCY_VAL_UNIT_COST" = 0,
              "SUB_RCY_RECOUP_RATE" = 0,
              "CLASIFICATION_CD" = recT_CS_PUCH_IF.CLASIFICATION_CD,
              "STOCK_UNIT" = recT_CS_PUCH_IF.STOCK_UNIT,
              "UNIT_COST_ACCEPT_TYP" = 1,
              "CS_PUCH_TYP" = 1,
              "ONEROUS_CONS_FLG" = recT_CS_PUCH_IF.ONEROUS_CONS_FLG,
              "UPDATE_TYP" = 1,
              "DEL_FLG" = 0,
              "COMPANY_CD" = recT_CS_PUCH_IF.COMPANY_CD,
              "ORG_CD" = recT_CS_PUCH_IF.ORG_CD,
              UPDATED_DATE = SYSDATE,  --更新日
              UPDATED_BY = pvc2UserId, --更新者
              UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
              MODIFY_COUNT = MODIFY_COUNT + 1
            WHERE
              M_CS_PUCH."YEAR" = pnumYear
              AND M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
              AND M_CS_PUCH."COST_TYP" = recT_CS_PUCH_IF.COST_TYP
              AND M_CS_PUCH."PLANT_CD" = recT_CS_PUCH_IF.PLANT_CD
              AND M_CS_PUCH."ITEM_CD" = recT_CS_PUCH_IF.ITEM_CD
            ;
          END IF; -- 購入品マスタ追加or更新終了
          numOverlap := numOverlap + 1;
        END IF;

      ELSIF recT_CS_PUCH_IF.ITEM_CD = workCsPuchIfWorkList(numRecordCount).itemCd
        AND (recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO != workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo
          OR recT_CS_PUCH_IF.VEND_CD != workCsPuchIfWorkList(numRecordCount).vendCd)
        AND recT_CS_PUCH_IF.TRANSACTION_TYP != 3
        AND numOverlap = 1
      THEN
          -- ワークに追加
          numRecordCount := numRecordCount + 1;
          workCsPuchIfWorkList.EXTEND;
          workCsPuchIfWorkList(numRecordCount).itemCd := recT_CS_PUCH_IF.ITEM_CD;
          workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo := recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO;
          workCsPuchIfWorkList(numRecordCount).vendCd := recT_CS_PUCH_IF.VEND_CD;
          workCsPuchIfWorkList(numRecordCount).effPhaseInDate := recT_CS_PUCH_IF.EFF_PHASE_IN_DATE;
          workCsPuchIfWorkList(numRecordCount).exis := TRUE;
          workCsPuchIfWorkList(numRecordCount).err := FALSE;
          workCsPuchIfWorkList(numRecordCount).del := FALSE;

          -- マスタ更新可否チェック
          IF FNCISUPDATEDBYMASTER(recT_CS_PUCH_IF.ITEM_CD) = TRUE THEN
            -- 一括登録エラーに登録
            blnRet := FNCINSERTCSERROR(
              'DB00009', -- メッセージコード
              numReadCount,
              recT_CS_PUCH_IF.ITEM_CD,
              recT_CS_PUCH_IF.CS_PROC_CD, --　工程コード
              recT_CS_PUCH_IF.VEND_CD, -- 取引先コード
              recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- 有効開始日
              recT_CS_PUCH_IF.TRANSACTION_TYP -- 処理区分
              );

            workCsPuchIfWorkList(numRecordCount).err := TRUE;
            numErrorCount := numErrorCount + 1;
           END IF;
        IF workCsPuchIfWorkList(numRecordCount).err = FALSE THEN
          -- 単価を更新してワークに追加
          UPDATE
            M_CS_PUCH
          SET
            SUB_VEND_CD = recT_CS_PUCH_IF.VEND_CD,
            SUB_UNIT_COST = recT_CS_PUCH_IF.UNIT_COST,
            SUB_UNIT_COST_TYP = recT_CS_PUCH_IF.UNIT_COST_TYP,
            SUB_CUR_CD = recT_CS_PUCH_IF.CUR_CD,
            SUB_EXCH_RATE = recT_CS_PUCH_IF.EXCH_RATE,
            SUB_PUCH_UNIT_QTY = recT_CS_PUCH_IF.PUCH_UNIT_QTY,
            SUB_RCY_VAL_UNIT_COST = recT_CS_PUCH_IF.RCY_VAL_UNIT_COST,
            SUB_RCY_RECOUP_RATE = recT_CS_PUCH_IF.RCY_RECOUP_RATE,
            UPDATED_DATE = SYSDATE,  --更新日
            UPDATED_BY = pvc2UserId, --更新者
            UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
            MODIFY_COUNT = MODIFY_COUNT + 1
          where
            M_CS_PUCH."YEAR" = pnumYear
            and M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
            and M_CS_PUCH."COST_TYP" = recT_CS_PUCH_IF.COST_TYP
            and M_CS_PUCH."PLANT_CD" = recT_CS_PUCH_IF.PLANT_CD
            and M_CS_PUCH."ITEM_CD" = recT_CS_PUCH_IF.ITEM_CD
          ;
          numOverlap := numOverlap + 1;
        END IF;

      ELSIF numOverlap = 2 THEN
        -- 第二項目を更新している場合
        -- ワークに追加
        numRecordCount := numRecordCount + 1;
        workCsPuchIfWorkList.EXTEND;
        workCsPuchIfWorkList(numRecordCount).itemCd := recT_CS_PUCH_IF.ITEM_CD;
        workCsPuchIfWorkList(numRecordCount).puchPriorityRefNo := recT_CS_PUCH_IF.PUCH_PRIORITY_REF_NO;
        workCsPuchIfWorkList(numRecordCount).vendCd := recT_CS_PUCH_IF.VEND_CD;
        workCsPuchIfWorkList(numRecordCount).effPhaseInDate := recT_CS_PUCH_IF.EFF_PHASE_IN_DATE;
        workCsPuchIfWorkList(numRecordCount).exis := TRUE;
        workCsPuchIfWorkList(numRecordCount).err := FALSE;
        workCsPuchIfWorkList(numRecordCount).del := FALSE;

          blnRet := FNCINSERTCSERROR(
            'DB02005', -- メッセージコード
            numReadCount,
            recT_CS_PUCH_IF.ITEM_CD,
            recT_CS_PUCH_IF.CS_PROC_CD, --　工程コード
            recT_CS_PUCH_IF.VEND_CD, -- 取引先コード
            recT_CS_PUCH_IF.EFF_PHASE_IN_DATE, -- 有効開始日
            recT_CS_PUCH_IF.TRANSACTION_TYP -- 処理区分
            );
      END IF;
    END LOOP;

    FOR i IN 1..workCsPuchIfWorkList.COUNT-1  LOOP

      tempItemCd := workCsPuchIfWorkList(i).itemCd;

      IF workCsPuchIfWorkList(i).del = FALSE THEN
        delFlg := FALSE;
      ELSE
        delFlg := TRUE;
      END IF;

      IF workCsPuchIfWorkList(i).err = TRUE THEN
        errFlg := TRUE;
      ELSE
        errFlg := FALSE;
      END IF;

      -- 品目が異なるばあい、前の品目について更新・削除を判断する
      IF tempItemCd != workCsPuchIfWorkList(i+1).itemCd THEN

        IF errFlg = FALSE THEN
          -- 購入品インタフェースの品目を更新済にする
          UPDATE
            T_CS_PUCH_IF
          SET
            "UPD_FLG" = 1,
            UPDATED_DATE = SYSDATE,  --更新日
            UPDATED_BY = pvc2UserId, --更新者
            UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
            MODIFY_COUNT = MODIFY_COUNT + 1
          WHERE
            T_CS_PUCH_IF."YEAR" = pnumYear
            AND T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
            AND T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
            AND T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
            AND T_CS_PUCH_IF."ITEM_CD" = tempItemCd
            AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
          ;
        END IF;
        -- すべての処理区分が削除の場合は、マスタを論理削除する。

        IF delFlg = TRUE THEN
          UPDATE
            M_CS_PUCH
          SET
            "UPDATE_TYP" = 1,
            "DEL_FLG" = 1,
            UPDATED_DATE = SYSDATE,  --更新日
            UPDATED_BY = pvc2UserId, --更新者
            UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
            MODIFY_COUNT = MODIFY_COUNT + 1
          WHERE
            M_CS_PUCH."YEAR" = pnumYear
            AND M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
            AND M_CS_PUCH."COST_TYP" = pnumCostTyp
            AND M_CS_PUCH."PLANT_CD" = pvc2PlantCd
            AND M_CS_PUCH."ITEM_CD" = tempItemCd
          ;
        END IF;
      END IF;
      numLastCount := i;
    END LOOP;
    -- 最後だけ別チェック
    IF numLastCount + 1 = workCsPuchIfWorkList.COUNT THEN
        IF workCsPuchIfWorkList(numLastCount+1).err = FALSE THEN
        -- 購入品インタフェースの品目を更新済にする
            UPDATE
              T_CS_PUCH_IF
            SET
              "UPD_FLG" = 1,
              UPDATED_DATE = SYSDATE,  --更新日
              UPDATED_BY = pvc2UserId, --更新者
              UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
              MODIFY_COUNT = MODIFY_COUNT + 1
            WHERE
              T_CS_PUCH_IF."YEAR" = pnumYear
              AND T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
              AND T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
              AND T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
              AND T_CS_PUCH_IF."ITEM_CD" = workCsPuchIfWorkList(numLastCount+1).itemCd
              AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
            ;
        END IF;
        -- すべての処理区分が削除の場合は、マスタを論理削除する。
        IF workCsPuchIfWorkList(numLastCount+1).del = TRUE THEN
            UPDATE
              M_CS_PUCH
            SET
              "UPDATE_TYP" = 1,
              "DEL_FLG" = 1,
              UPDATED_DATE = SYSDATE,  --更新日
              UPDATED_BY = pvc2UserId, --更新者
              UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
              MODIFY_COUNT = MODIFY_COUNT + 1
            WHERE
              M_CS_PUCH."YEAR" = pnumYear
              AND M_CS_PUCH."HALF_TERM_TYP" = pnumHalfTermTyp
              AND M_CS_PUCH."COST_TYP" = pnumCostTyp
              AND M_CS_PUCH."PLANT_CD" = pvc2PlantCd
              AND M_CS_PUCH."ITEM_CD" = workCsPuchIfWorkList(numLastCount+1).itemCd
            ;
        END IF;
     END IF;

/* 処理の終了 */

    /* 終了メッセージの出力 */
    vc2Comment      := SUBSTR('READ COUNT:' || numReadCount || ' ERROR COUNT:' || numErrorCount,1,256);
    blnRet          := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName,
                                 pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                                 vc2Comment);
    COMMIT;

    /* トレースログの出力(終了) */
    blnRet          := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId,pvc2BusinessName,
                                   pvc2PlantCd, MY_SQL_NAME, METHOD_END);

    COMMIT;

    /* LogFile の CLOSE */
    blnRet          := FNCLOGCLOSE(UTL_FileHandle);
    pnumReturn := STATUS_NORMAL; --正常終了


--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excERR_CUR THEN    --カーソルOPEN中のＤＢエラー

        IF curT_CS_PUCH_IF%ISOPEN = TRUE THEN
            CLOSE curT_CS_PUCH_IF;
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* 異常終了 */

    WHEN OTHERS  THEN   --その他のエラー

        IF curT_CS_PUCH_IF%ISOPEN = TRUE THEN
            CLOSE curT_CS_PUCH_IF;
        END IF;

        ROLLBACK;

        /* 終了メッセージの出力 */
        vc2Comment      := SUBSTR('(SBM0328) ＊＊その他のエラーが発生しました＊＊'  ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
        blnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_EXP,
                            vc2Comment);

        /* トレースログの出力(終了) */
        blnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

        /* LogFile の CLOSE */
        blnRet := FNCLOGCLOSE(UTL_FileHandle);

        pnumReturn := STATUS_ERROR; /* 異常終了 */

END;
/
