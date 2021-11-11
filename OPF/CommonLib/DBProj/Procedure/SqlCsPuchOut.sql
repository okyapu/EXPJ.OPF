CREATE OR REPLACE PROCEDURE SQLCSPUCHOUT (
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Procedure/SqlCsPuchOut.sql,v $
'$Author: li-lu $
'$Revision: 1.8 $
'$Date: 2015/11/17 03:01:24 $
'
' 機能      : 購入単価情報抽出処理
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
' 機能説明  : [購入品単価ヘッダ]、[購入単価]、[支給単価]を基に、
'            [購入品インタフェース]を作成する。
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
   ,pvc2Year             IN  NUMBER          --対象年度
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
    MY_SQL_NAME             VARCHAR2(120) := 'SQLCSPUCHOUT'; --ＰＬ／ＳＱＬ名

    APS_COM_BATCH_START     VARCHAR2(28) := 'DB02001';
    APS_COM_BATCH_END       VARCHAR2(28) := 'DB02002';
    APS_COM_BATCH_EXP       VARCHAR2(28) := 'DB02006';

    LOGMSG_START_PGNM       VARCHAR2(200) := '(SBM0344)購入単価情報抽出処理を開始しました';
    LOGMSG_END_PGNM         VARCHAR2(200) := '購入単価情報抽出処理を終了しました';

    STATUS_NORMAL           NUMBER        := 1;          -- 正常終了
    STATUS_WARNING          NUMBER        := 2;          -- 警告終了
    STATUS_ERROR          NUMBER        := 3;          -- 異常終了


    /* 変数の定義 */
    UTL_FileHandle          UTL_FILE.FILE_TYPE;     --ファイルハンドル

    numCountExtract         NUMBER(11)   := 0;       --抽出データ件数
    numCountUpdated         NUMBER(11)   := 0;       --更新データ件数
    numCountSelected        NUMBER(11)   := 0;       --更新時件数カウント
    blnRet                  BOOLEAN;        --共通関数の戻値
    vc2Comment              VARCHAR2(1024);  --メッセージ作成用

    /* 例外処理用変数 */
    excNORMAL_SKIP   EXCEPTION;      --実行不可
    excERR_CUR       EXCEPTION;      --カーソルOPEN中のEXCEPTION

    /* カーソルの宣言  購入品単価（ワーク）*/
    CURSOR curPUCH_UNIT_COST
    IS
    SELECT
      UNIT_COST.PLANT_CD as PLANT_CD,
      UNIT_COST.ITEM_CD as ITEM_CD,
      UNIT_COST_H.PUCH_PRIORITY_REF_NO as PUCH_PRIORITY_REF_NO,
      UNIT_COST.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE,
      UNIT_COST.VEND_CD as VEND_CD,
      trunc(decode(UNIT_COST.PUCH_SIZE, 0, M_PUCH_UNIT_COST.UNIT_COST, M_PUCH_UNIT_COST.UNIT_COST * UNIT_COST.PUCH_SIZE) + 0.00009, 4) as UNIT_COST,
      M_PUCH_UNIT_COST.UNIT_COST_TYP as UNIT_COST_TYP,
      M_VEND_CTRL.CUR_CD as CUR_CD,
      decode(EXCH_RATE.EXCH_RATE, null, 1, EXCH_RATE.EXCH_RATE) as EXCH_RATE,
      decode(UNIT_COST.PUCH_SIZE, 0, 1, UNIT_COST.PUCH_SIZE) as PUCH_UNIT_QTY,
      M_ITEM.CLASIFICATION_CD as CLASIFICATION_CD,
      M_PUCH_UNIT_COST.COMPANY_CD as COMPANY_CD,
      SYS_COST_CTRL.ORG_CD as ORG_CD,
      M_ITEM.STOCK_UNIT as STOCK_UNIT,
      decode(CONS.ONEROUS_FLG, null, 0, CONS.ONEROUS_FLG) as ONEROUS_FLG,
-- 2008/04/20 ヘッダと明細で大きいほうの更新日を選択 START
--    M_PUCH_UNIT_COST.UPDATED_DATE as UPDATED_DATE,
      CASE WHEN M_PUCH_UNIT_COST.UPDATED_DATE > UNIT_COST_H.UPDATED_DATE_H THEN M_PUCH_UNIT_COST.UPDATED_DATE ELSE UNIT_COST_H.UPDATED_DATE_H END as UPDATED_DATE,
-- 2008/04/20 ヘッダと明細で大きいほうの更新日を選択 END
      decode(CS_PUCH_IF.PLANT_CD, null, 1, 2) as TRANSACTION_TYP,
      CS_PUCH_IF.SAVE_UPDATED_DATE as SAVE_UPDATED_DATE
    from
      M_PUCH_UNIT_COST,
      M_VEND_CTRL,
      M_ITEM,
      (
        select
          T_CS_PUCH_IF.PLANT_CD as PLANT_CD,
          T_CS_PUCH_IF.ITEM_CD as ITEM_CD,
          T_CS_PUCH_IF.CS_PROC_CD as CS_PROC_CD,
          T_CS_PUCH_IF.VEND_CD as VEND_CD,
          T_CS_PUCH_IF.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE,
          T_CS_PUCH_IF.SAVE_UPDATED_DATE as SAVE_UPDATED_DATE
        from
          T_CS_PUCH_IF
        where
          T_CS_PUCH_IF."YEAR" = pvc2Year
          and T_CS_PUCH_IF.HALF_TERM_TYP = pnumHalfTermTyp
          and T_CS_PUCH_IF.COST_TYP = pnumCostTyp
      ) CS_PUCH_IF,
      (
        select
          M_PUCH_UNIT_COST_H.COMPANY_CD,
          M_PUCH_UNIT_COST_H.VEND_CD,
          M_PUCH_UNIT_COST_H.PLANT_CD as PLANT_CD,
          M_PUCH_UNIT_COST_H.ITEM_CD as ITEM_CD,
          min(M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO
-- 2008/04/20 更新日を追加 START
          ,max(UPDATED_DATE) as UPDATED_DATE_H
-- 2008/04/20 更新日を追加 END
        from
          M_PUCH_UNIT_COST_H
        group by
          M_PUCH_UNIT_COST_H.COMPANY_CD,
          M_PUCH_UNIT_COST_H.VEND_CD,
          M_PUCH_UNIT_COST_H.ITEM_CD,
          M_PUCH_UNIT_COST_H.PLANT_CD
      ) UNIT_COST_H,
      (
        select
          UNIT_COST.COMPANY_CD as COMPANY_CD,
          UNIT_COST.VEND_CD as VEND_CD,
          UNIT_COST.PLANT_CD as PLANT_CD,
          UNIT_COST.ITEM_CD as ITEM_CD,
          UNIT_COST.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE,
          min(UNIT_COST.PUCH_SIZE) as PUCH_SIZE
        from
          M_PUCH_UNIT_COST UNIT_COST,
          (
            select
              UNIT_COST.COMPANY_CD as COMPANY_CD,
              UNIT_COST.VEND_CD as VEND_CD,
              UNIT_COST.PLANT_CD as PLANT_CD,
              UNIT_COST.ITEM_CD as ITEM_CD,
              max(UNIT_COST.EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
            from
              M_PUCH_UNIT_COST UNIT_COST
            where
              UNIT_COST.PLANT_CD = pvc2PlantCd
              and to_date(to_char(UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') < to_date(pnumYyyyMm, 'YYYYMM')
            group by
              UNIT_COST.COMPANY_CD,
              UNIT_COST.VEND_CD,
              UNIT_COST.PLANT_CD,
              UNIT_COST.ITEM_CD
          ) UNIT_COST_2
        where
          UNIT_COST.COMPANY_CD = UNIT_COST_2.COMPANY_CD
          and UNIT_COST.VEND_CD = UNIT_COST_2.VEND_CD
          and UNIT_COST.PLANT_CD = UNIT_COST_2.PLANT_CD
          and UNIT_COST.ITEM_CD = UNIT_COST_2.ITEM_CD
          and UNIT_COST.EFF_PHASE_IN_DATE = UNIT_COST_2.EFF_PHASE_IN_DATE
        group by
          UNIT_COST.COMPANY_CD,
          UNIT_COST.VEND_CD,
          UNIT_COST.PLANT_CD,
          UNIT_COST.ITEM_CD,
          UNIT_COST.EFF_PHASE_IN_DATE
      ) UNIT_COST,
      (
        select
          M_EXCH_RATE.COMPANY_CD as COMPANY_CD,
          M_EXCH_RATE.CUR_CD as CUR_CD,
          M_EXCH_RATE.EXCH_TYP as EXCH_TYP,
          M_EXCH_RATE.EXCH_RATE as EXCH_RATE
        from
          M_EXCH_RATE,
          (
            select
              M_EXCH_RATE.COMPANY_CD as COMPANY_CD,
              M_EXCH_RATE.CUR_CD as CUR_CD,
              M_EXCH_RATE.EXCH_TYP as EXCH_TYP,
              max(M_EXCH_RATE.EXCH_START_DATE) as EXCH_START_DATE
            from
              M_EXCH_RATE
            where
              to_date(to_char(M_EXCH_RATE.EXCH_START_DATE, 'YYYYMM'), 'YYYYMM') < to_date(pnumYyyyMm, 'YYYYMM')
            group by
              M_EXCH_RATE.COMPANY_CD,
              M_EXCH_RATE.CUR_CD,
              M_EXCH_RATE.EXCH_TYP
          ) EXCH_RATE
        where
          M_EXCH_RATE.COMPANY_CD = EXCH_RATE.COMPANY_CD
          and M_EXCH_RATE.CUR_CD = EXCH_RATE.CUR_CD
          and M_EXCH_RATE.EXCH_TYP = EXCH_RATE.EXCH_TYP
          and M_EXCH_RATE.EXCH_START_DATE = EXCH_RATE.EXCH_START_DATE
      ) EXCH_RATE,
      (
        select
          M_CONS_UNIT_COST.COMPANY_CD as COMPANY_CD,
          M_CONS_UNIT_COST.PLANT_CD as PLANT_CD,
          M_CONS_UNIT_COST.ITEM_CD as ITEM_CD,
          min(M_CONS_UNIT_COST.ONEROUS_FLG) as ONEROUS_FLG
        from
          M_CONS_UNIT_COST,
          (
            select
              M_CONS_UNIT_COST.COMPANY_CD as COMPANY_CD,
              M_CONS_UNIT_COST.PLANT_CD as PLANT_CD,
              M_CONS_UNIT_COST.ITEM_CD as ITEM_CD,
              max(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE
            from
              M_CONS_UNIT_COST
            where
              M_CONS_UNIT_COST.PLANT_CD = pvc2PlantCd
              and to_date(to_char(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') < to_date(pnumYyyyMm, 'YYYYMM')
            group by
              M_CONS_UNIT_COST.COMPANY_CD,
              M_CONS_UNIT_COST.PLANT_CD,
              M_CONS_UNIT_COST.ITEM_CD
          ) CONS
        WHERE
          M_CONS_UNIT_COST.COMPANY_CD = CONS.COMPANY_CD
          and M_CONS_UNIT_COST.PLANT_CD = CONS.PLANT_CD
          and M_CONS_UNIT_COST.ITEM_CD = CONS.ITEM_CD
          and M_CONS_UNIT_COST.EFF_PHASE_IN_DATE = CONS.EFF_PHASE_IN_DATE
        group by
          M_CONS_UNIT_COST.COMPANY_CD,
          M_CONS_UNIT_COST.PLANT_CD,
          M_CONS_UNIT_COST.ITEM_CD
      ) CONS,
      SYS_COST_CTRL,
      SYS_MY_COMPANY
    where
      UNIT_COST.COMPANY_CD = M_PUCH_UNIT_COST.COMPANY_CD
      and UNIT_COST.VEND_CD = M_PUCH_UNIT_COST.VEND_CD
      and UNIT_COST.PLANT_CD = M_PUCH_UNIT_COST.PLANT_CD
      and UNIT_COST.ITEM_CD = M_PUCH_UNIT_COST.ITEM_CD
      and UNIT_COST.EFF_PHASE_IN_DATE = M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE
      and UNIT_COST.PUCH_SIZE = M_PUCH_UNIT_COST.PUCH_SIZE
      and UNIT_COST.COMPANY_CD = UNIT_COST_H.COMPANY_CD
      and UNIT_COST.VEND_CD = UNIT_COST_H.VEND_CD
      and UNIT_COST.PLANT_CD = UNIT_COST_H.PLANT_CD
      and UNIT_COST.ITEM_CD = UNIT_COST_H.ITEM_CD
      and UNIT_COST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD
      and UNIT_COST.VEND_CD = M_VEND_CTRL.VEND_CD
      and UNIT_COST.ITEM_CD = M_ITEM.ITEM_CD
      and UNIT_COST.COMPANY_CD = CONS.COMPANY_CD(+)
      and UNIT_COST.PLANT_CD = CONS.PLANT_CD(+)
      and UNIT_COST.ITEM_CD = CONS.ITEM_CD(+)
      and M_VEND_CTRL.COMPANY_CD = EXCH_RATE.COMPANY_CD(+)
      and M_VEND_CTRL.CUR_CD = EXCH_RATE.CUR_CD(+)
      and M_VEND_CTRL.EXCH_TYP = EXCH_RATE.EXCH_TYP(+)
      and UNIT_COST.PLANT_CD = CS_PUCH_IF.PLANT_CD(+)
      and UNIT_COST.ITEM_CD = CS_PUCH_IF.ITEM_CD(+)
      and '*' = CS_PUCH_IF.CS_PROC_CD(+)
      and UNIT_COST.VEND_CD = CS_PUCH_IF.VEND_CD(+)
      and UNIT_COST.EFF_PHASE_IN_DATE = CS_PUCH_IF.EFF_PHASE_IN_DATE(+)
      and UNIT_COST.PLANT_CD = SYS_COST_CTRL.PLANT_CD(+)
      and UNIT_COST.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD
      and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM'
    order by
      UNIT_COST.PLANT_CD,
      UNIT_COST.ITEM_CD,
      UNIT_COST_H.PUCH_PRIORITY_REF_NO,
      UNIT_COST.EFF_PHASE_IN_DATE desc,
      UNIT_COST.VEND_CD
    ;

    recPUCH_UNIT_COST curPUCH_UNIT_COST%ROWTYPE;

/*------------------------------------------------------------------------------
'
' 機能      : 更新可能判定
'
' 引数      : TRANSACTION_TYP 処理区分
'             SAVE_UPDATED_DATE 退避更新日
'            UPDATED_DATE 更新日
'            pnumExecuteTyp 実行処理区分
'            pnumUpdateMode 更新モード
'
' 戻り値    : BOOLEAN
'
' 機能説明  : 抽出処理において、更新可能であるかを判定します。
'             更新可能な場合はtrue、更新可能ではない場合はfalse
'
'
------------------------------------------------------------------------------*/

FUNCTION FNCCANUPDATE(
  FNC_TRANSACTION_TYP IN NUMBER,
  FNC_SAVE_UPDATED_DATE IN DATE,
  FNC_UPDATED_DATE IN DATE,
  pnumExecuteTyp IN NUMBER,
  pnumUpdateMode IN NUMBER
) RETURN BOOLEAN IS
BEGIN

  -- 処理区分が「更新」以外は対象にしない
  IF FNC_TRANSACTION_TYP != 2 THEN
    RETURN FALSE;
  END IF;

  -- 退避更新日が存在しない場合は更新する
  IF FNC_SAVE_UPDATED_DATE IS NULL THEN
    RETURN TRUE;
  END IF;

  -- 「退避更新日」<「更新日」の場合は更新する。
  IF FNC_SAVE_UPDATED_DATE < FNC_UPDATED_DATE THEN
    RETURN TRUE;
  -- 1:差分更新の場合は対象にしない
  ELSIF pnumUpdateMode = 1 THEN
    RETURN FALSE;
  END IF;

  RETURN TRUE;
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
    BEGIN  /* カーソルOPEN（購入品単価（ワーク） */
        OPEN  curPUCH_UNIT_COST;
    EXCEPTION
        WHEN OTHERS THEN
            vc2Comment  := SUBSTR('1:OPEN curPUCH_UNIT_COST'  ||
                                  ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                  ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
            RAISE    excERR_CUR;
    END;  /* カーソルOPEN（購入品単価（ワーク） */

    LOOP  /* 購入品単価（ワーク）繰り返し*/

      BEGIN  /* カーソルFETCH（購入品単価（ワーク） */
        FETCH curPUCH_UNIT_COST INTO recPUCH_UNIT_COST;
        EXIT WHEN curPUCH_UNIT_COST%NOTFOUND;

      EXCEPTION
        WHEN OTHERS THEN
              vc2Comment := SUBSTR('(SBM0661)2:FETCH 購入品単価（ワーク）'  ||
                                       ' SQLCODE=' || '[ ' || SQLCODE || ' ]' ||
                                       ' SQLERRM=' || '[ ' || SQLERRM || ' ]',1,256);
        RAISE  excERR_CUR;
      END;  /* カーソルFETCH */

      numCountExtract := numCountExtract+1; /* 抽出件数のインクリメント */
      DBMS_OUTPUT.PUT_LINE('numCountExtract ' || numCountExtract);

      IF recPUCH_UNIT_COST.TRANSACTION_TYP = 1 THEN

        INSERT INTO
        T_CS_PUCH_IF(
          "YEAR",
          "HALF_TERM_TYP",
          "COST_TYP",
          "PLANT_CD",
          "ITEM_CD",
          "CS_PROC_CD",
          "VEND_CD",
          "EFF_PHASE_IN_DATE",
          "PUCH_PRIORITY_REF_NO",
          "UNIT_COST",
          "UNIT_COST_TYP",
          "CUR_CD",
          "EXCH_RATE",
          "PUCH_UNIT_QTY",
          "RCY_VAL_UNIT_COST",
          "RCY_RECOUP_RATE",
          "CLASIFICATION_CD",
          "COMPANY_CD",
          "ORG_CD",
          "STOCK_UNIT",
          "CS_PUCH_TYP",
          "ONEROUS_CONS_FLG",
          "SAVE_UPDATED_DATE",
          "TRANSACTION_TYP",
          "UPD_FLG",
          CREATED_DATE,                    --作成日
          CREATED_BY,                      --作成者
          CREATED_PRG_NM,                  --作成プログラム名
          UPDATED_DATE,                    --更新日
          UPDATED_BY,                      --更新者
          UPDATED_PRG_NM,                  --更新プログラム名
          MODIFY_COUNT)                    --更新数
        values
          (pvc2Year,
          pnumHalfTermTyp,
          pnumCostTyp,
          pvc2PlantCd,
          recPUCH_UNIT_COST.ITEM_CD,
          '*',
          recPUCH_UNIT_COST.VEND_CD,
          recPUCH_UNIT_COST.EFF_PHASE_IN_DATE,
          recPUCH_UNIT_COST.PUCH_PRIORITY_REF_NO,
          recPUCH_UNIT_COST.UNIT_COST,
          recPUCH_UNIT_COST.UNIT_COST_TYP,
          recPUCH_UNIT_COST.CUR_CD,
          recPUCH_UNIT_COST.EXCH_RATE,
          recPUCH_UNIT_COST.PUCH_UNIT_QTY,
          0,
          0,
          recPUCH_UNIT_COST.CLASIFICATION_CD,
          recPUCH_UNIT_COST.COMPANY_CD,
          recPUCH_UNIT_COST.ORG_CD,
          recPUCH_UNIT_COST.STOCK_UNIT,
          1,
          recPUCH_UNIT_COST.ONEROUS_FLG,
          recPUCH_UNIT_COST.UPDATED_DATE,
          recPUCH_UNIT_COST.TRANSACTION_TYP,
          0,
          SYSDATE,                              --システム日時
          pvc2UserId,                              --引数.ユーザーＩＤ
          pvc2BusinessName,                        --引数.業務名
          SYSDATE,                                 --システム日時
          pvc2UserId,                              --引数.ユーザーＩＤ
          pvc2BusinessName,                        --引数.業務名
          0
          );

      ELSIF
        FNCCANUPDATE(recPUCH_UNIT_COST.TRANSACTION_TYP,
                     recPUCH_UNIT_COST.SAVE_UPDATED_DATE,
                     recPUCH_UNIT_COST.UPDATED_DATE,
                     pnumExecuteTyp,
                     pnumUpdateMode) THEN

        update
          T_CS_PUCH_IF
        set
          "YEAR" = pvc2Year,
          "HALF_TERM_TYP" = pnumHalfTermTyp,
          "COST_TYP" = pnumCostTyp,
          "PLANT_CD" = pvc2PlantCd,
          "ITEM_CD" = recPUCH_UNIT_COST.ITEM_CD,
          "CS_PROC_CD" = '*',
          "VEND_CD" = recPUCH_UNIT_COST.VEND_CD,
          "EFF_PHASE_IN_DATE" = recPUCH_UNIT_COST.EFF_PHASE_IN_DATE,
          "PUCH_PRIORITY_REF_NO" = recPUCH_UNIT_COST.PUCH_PRIORITY_REF_NO,
          "UNIT_COST" = recPUCH_UNIT_COST.UNIT_COST,
          "UNIT_COST_TYP" = recPUCH_UNIT_COST.UNIT_COST_TYP,
          "CUR_CD" = recPUCH_UNIT_COST.CUR_CD,
          "EXCH_RATE" = recPUCH_UNIT_COST.EXCH_RATE,
          "PUCH_UNIT_QTY" = recPUCH_UNIT_COST.PUCH_UNIT_QTY,
          "RCY_VAL_UNIT_COST" = 0,
          "RCY_RECOUP_RATE" = 0,
          "CLASIFICATION_CD" = recPUCH_UNIT_COST.CLASIFICATION_CD,
          "COMPANY_CD" = recPUCH_UNIT_COST.COMPANY_CD,
          "ORG_CD" = recPUCH_UNIT_COST.ORG_CD,
          "STOCK_UNIT" = recPUCH_UNIT_COST.STOCK_UNIT,
          "CS_PUCH_TYP" = 1,
          "ONEROUS_CONS_FLG" = recPUCH_UNIT_COST.ONEROUS_FLG,
          "SAVE_UPDATED_DATE" = recPUCH_UNIT_COST.UPDATED_DATE,
          "TRANSACTION_TYP" = recPUCH_UNIT_COST.TRANSACTION_TYP,
          "UPD_FLG" = 0,
          UPDATED_DATE = SYSDATE,  --更新日
          UPDATED_BY = pvc2UserId, --更新者
          UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
          MODIFY_COUNT = MODIFY_COUNT + 1
        where
          T_CS_PUCH_IF."YEAR" = pvc2Year
          and T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
          and T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
          and T_CS_PUCH_IF."PLANT_CD" = recPUCH_UNIT_COST.PLANT_CD
          and T_CS_PUCH_IF."ITEM_CD" = recPUCH_UNIT_COST.ITEM_CD
          and T_CS_PUCH_IF."CS_PROC_CD" = '*'
          and T_CS_PUCH_IF."VEND_CD" = recPUCH_UNIT_COST.VEND_CD
          and T_CS_PUCH_IF."EFF_PHASE_IN_DATE" = recPUCH_UNIT_COST.EFF_PHASE_IN_DATE
        ;

      END IF;

    END LOOP; /* 購入品単価（ワーク）繰り返し*/

    CLOSE curPUCH_UNIT_COST;

    -- 論理削除処理
    UPDATE
      T_CS_PUCH_IF
    SET
      "TRANSACTION_TYP" = 3,
      "UPD_FLG" = 0,
      UPDATED_DATE = SYSDATE,  --更新日
      UPDATED_BY = pvc2UserId, --更新者
      UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
      MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE
      T_CS_PUCH_IF."YEAR" = pvc2Year
      AND T_CS_PUCH_IF."HALF_TERM_TYP" = pnumHalfTermTyp
      AND T_CS_PUCH_IF."COST_TYP" = pnumCostTyp
      AND T_CS_PUCH_IF."PLANT_CD" = pvc2PlantCd
      AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
      AND T_CS_PUCH_IF."TRANSACTION_TYP" <> '3'
      AND NOT EXISTS(
        SELECT
          1
        FROM
          M_PUCH_UNIT_COST
        WHERE
          M_PUCH_UNIT_COST.COMPANY_CD = T_CS_PUCH_IF."COMPANY_CD"
          AND M_PUCH_UNIT_COST."PLANT_CD" = T_CS_PUCH_IF."PLANT_CD"
          AND M_PUCH_UNIT_COST."ITEM_CD" = T_CS_PUCH_IF."ITEM_CD"
          AND M_PUCH_UNIT_COST."VEND_CD" = T_CS_PUCH_IF."VEND_CD"
          AND M_PUCH_UNIT_COST."EFF_PHASE_IN_DATE" = T_CS_PUCH_IF."EFF_PHASE_IN_DATE"
        )
    ;

    -- 更新されたグループを未更新にする
    UPDATE
      T_CS_PUCH_IF
    SET
      T_CS_PUCH_IF."UPD_FLG" = 0,
      UPDATED_DATE = SYSDATE,  --更新日
      UPDATED_BY = pvc2UserId, --更新者
      UPDATED_PRG_NM   = pvc2BusinessName,  --更新プログラム名
      MODIFY_COUNT = MODIFY_COUNT + 1
    WHERE
      EXISTS(
        SELECT
          1
        FROM
          (
            SELECT
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            FROM
              T_CS_PUCH_IF CS
            WHERE
              CS."YEAR" = pvc2Year
              AND CS."HALF_TERM_TYP" = pnumHalfTermTyp
              AND CS."COST_TYP" = pnumCostTyp
              AND CS."PLANT_CD" = pvc2PlantCd
              AND CS."CS_PROC_CD" = '*'
            GROUP BY
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            HAVING
              MIN(CS."UPD_FLG") = 0
              AND MIN(CS."TRANSACTION_TYP") <> 3
          ) PUCH_IF
        WHERE
          T_CS_PUCH_IF."YEAR" = PUCH_IF."YEAR"
          AND T_CS_PUCH_IF."HALF_TERM_TYP" = PUCH_IF."HALF_TERM_TYP"
          AND T_CS_PUCH_IF."COST_TYP" = PUCH_IF."COST_TYP"
          AND T_CS_PUCH_IF."PLANT_CD" = PUCH_IF."PLANT_CD"
          AND T_CS_PUCH_IF."ITEM_CD" = PUCH_IF."ITEM_CD"
          AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
      )
      ;
      /* 購入品インタフェースの更新件数 */
      SELECT
          COUNT(1) INTO numCountSelected
        FROM
          T_CS_PUCH_IF,
          (
            SELECT
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            FROM
              T_CS_PUCH_IF CS
            WHERE
              CS."YEAR" = pvc2Year
              AND CS."HALF_TERM_TYP" = pnumHalfTermTyp
              AND CS."COST_TYP" = pnumCostTyp
              AND CS."PLANT_CD" = pvc2PlantCd
              AND CS."CS_PROC_CD" = '*'
            GROUP BY
              CS."YEAR",
              CS."HALF_TERM_TYP",
              CS."COST_TYP",
              CS."PLANT_CD",
              CS."ITEM_CD"
            HAVING
              MIN(CS."UPD_FLG") = 0
              AND MIN(CS."TRANSACTION_TYP") <> 3
          ) PUCH_IF
        WHERE
          T_CS_PUCH_IF."YEAR" = PUCH_IF."YEAR"
          AND T_CS_PUCH_IF."HALF_TERM_TYP" = PUCH_IF."HALF_TERM_TYP"
          AND T_CS_PUCH_IF."COST_TYP" = PUCH_IF."COST_TYP"
          AND T_CS_PUCH_IF."PLANT_CD" = PUCH_IF."PLANT_CD"
          AND T_CS_PUCH_IF."ITEM_CD" = PUCH_IF."ITEM_CD"
          AND T_CS_PUCH_IF."CS_PROC_CD" = '*'
      ;
      numCountUpdated := numCountUpdated + numCountSelected;    /* 抽出件数のインクリメント */

/* 処理の終了 */

    /* 終了メッセージの出力 */
    vc2Comment      := SUBSTR('READ_COUNT=' || numCountExtract || ' UPDATED_COUNT=' || numCountUpdated,1,256);
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

        IF curPUCH_UNIT_COST%ISOPEN = TRUE THEN
            CLOSE curPUCH_UNIT_COST;
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

        IF curPUCH_UNIT_COST%ISOPEN = TRUE THEN
            CLOSE curPUCH_UNIT_COST;
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
