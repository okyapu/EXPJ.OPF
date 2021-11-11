CREATE OR REPLACE FUNCTION FNCEXCUPDATELOTSTOCKFD(
/*----------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2006.12.21 入庫の場合は引当済数量を足しこみ、出庫の場合は引当済数量を消しこむように修正。
'
' 機能      :入出庫管理番号を基に保管区別入出庫を検索し、
'            取得した値を基にロット別品目在庫の登録または更新を行う。
'            引当済数量がNULL以外の場合、引数値で[ロット別品目在庫].ロット別引当済数量の消込を行う。
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle                      - (i)ファイルハンドル
'             pvc2LogMode                      - (i)ＬＯＧモード
'             pvc2OutputMode                   - (i)出力モード
'             pvc2UserId                       - (i)ユーザＩＤ
'             pvc2BusinessName                 - (i)業務名
'             pvc2PlantCd                      - (i)工場コード
'             pvc2RcvIssueCtrlCd               - (i)入出庫管理番号
'             pvc2AlcdQty                      - (i)引当済み数量
'             pnumStatus                       - (o)結果ステータス
'             pvc2MessageId                    - (o)エラーメッセージID
'
'
'
' 備考      :
'
------------------------------------------------------------------------------*/
   pFileHandle                  IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                 IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2            --出力モード
   ,pvc2UserId                  IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2            --業務名
   ,pvc2PlantCd                 IN  VARCHAR2            --工場コード
   ,pvc2RcvIssueCtrlCd          IN  VARCHAR2            --入出庫管理番号
   ,pvc2RsvQty                  IN  NUMBER              --引当済み数量
   ,pvc2MessageId               OUT VARCHAR2            --エラーメッセージID
   ,pnumStatus                  OUT NUMBER              --結果ステータス（1：正常終了 2:警告終了 3：異常終了）
    ) RETURN BOOLEAN
IS

/* カーソルの宣言*/

    --//保管区別入出庫の検索
    CURSOR curT_RCV_ISSUE IS
    SELECT
        T_RCV_ISSUE.RCV_ISSUE_TYP,
        T_RCV_ISSUE.ITEM_CD,
        T_RCV_ISSUE.WH_CD,
        T_RCV_ISSUE.LOT_NO,
        T_RCV_ISSUE.PLANT_CD,
        T_RCV_ISSUE.RCV_ISSUE_QTY
    FROM T_RCV_ISSUE
    WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd
    FOR UPDATE NOWAIT;

    recT_RCV_ISSUE  curT_RCV_ISSUE%ROWTYPE;

    --//ロット管理の検索
    CURSOR curT_LOT_CTRL (
    ctypItemCd T_LOT_CTRL.ITEM_CD%TYPE
    ,ctypLotNo T_LOT_CTRL.LOT_NO%TYPE
    ) IS
    SELECT
        T_LOT_CTRL.ITEM_CD
    FROM T_LOT_CTRL
    WHERE ITEM_CD = ctypItemCd
    AND   LOT_NO  = ctypLotNo;

    recT_LOT_CTRL  curT_LOT_CTRL%ROWTYPE;

    --//ロット別品目在庫の検索
    CURSOR curT_LOT_STOCK(
    ctypItemCd T_LOT_STOCK.ITEM_CD%TYPE
    ,ctypWhCd  T_LOT_STOCK.WH_CD%TYPE
    ,ctypLotNo T_LOT_STOCK.LOT_NO%TYPE
    ) IS
    SELECT
        STOCK_ON_HAND_QTY
        ,DEFECT_QTY
        ,ALCD_QTY
    FROM T_LOT_STOCK
    WHERE ITEM_CD = ctypItemCd
    AND   WH_CD   = ctypWhCd
    AND   LOT_NO  = ctypLotNo
    FOR UPDATE NOWAIT;

    recT_LOT_STOCK  curT_LOT_STOCK%ROWTYPE;

/* 変数の宣言 */
    blnRet                    BOOLEAN;                                --BOOLEAN型 返却値
    vc2Comment                VARCHAR2(1024);                         -- メッセージ作成用

    typRsltRcvIssueTyp        T_RCV_ISSUE.RCV_ISSUE_TYP%TYPE;         --取得結果（入出庫区分）
    typRsltItemCd             T_RCV_ISSUE.ITEM_CD%TYPE;               --取得結果（品目番号）
    typRsltWhCd               T_RCV_ISSUE.WH_CD%TYPE;                 --取得結果（保管区コード）
    typRsltLotNo              T_RCV_ISSUE.LOT_NO%TYPE;                --取得結果（在庫ロット番号）
    typRsltPlantCd            T_RCV_ISSUE.PLANT_CD%TYPE;              --取得結果（工場コード）
    typRsltRcvIssueQty        T_RCV_ISSUE.RCV_ISSUE_QTY%TYPE;         --取得結果（入出庫数）
    typRsltStockOnHandQty     T_LOT_STOCK.STOCK_ON_HAND_QTY%TYPE;     --取得結果（ロット別手持在庫数）
    typRsltDefectQty          T_LOT_STOCK.DEFECT_QTY%TYPE;            --取得結果（ロット別不良数）
    typRsltAlcdQty            T_LOT_STOCK.ALCD_QTY%TYPE;            --取得結果（ロット別不良数）
    typProcFlg                NUMBER(1)   := 0;

/* 定数の宣言 */
    MY_SQL_NAME              VARCHAR2(120)  := 'FncExcUpdateLotStockFd';     --ＰＬ／ＳＱＬ名
    LOGMODE_NOLOG            VARCHAR2(4)    := '0';                     --ＬＯＧモード　ＬＯＧ無し
    OUTPUTMODE_FILE          VARCHAR2(4)    := '1';                     --出力モード　　ファイル
    LOGMSG_START             VARCHAR2(20)   := 'Start';                 --ログ用メソッド開始宣言
    LOGMSG_END               VARCHAR2(12)   := 'End';                   --ログ用メソッド終了宣言
    LOGMSG_ERR               VARCHAR2(12)   := 'Err';                   --ログ用メソッドエラー宣言
    LOGMSG_CUROPENERR        VARCHAR2(40)   := 'CurOpenErr';            --ログ用カーソルOPENエラー宣言
    LOGMSG_NOTFOUND          VARCHAR2(32)   := 'NotFound';              --ログ用未存在宣言
    STATUS_NORMAL            NUMBER         := 1;                       --正常終了
    STATUS_WARNING           NUMBER         := 2;                       --警告終了
    STATUS_ERROR             NUMBER         := 3;                       --異常終了
    PROC_TYP_ENTRY           NUMBER         := 1;                       --ロット別品目在庫登録
    PROC_TYP_UPDATE          NUMBER         := 2;                       --ロット別品目在庫更新

/* MESSAGE の宣言 */
    COM_BATCH_EXP                  VARCHAR2(28)   := 'ZZ22001';        --ロット別品目在庫の登録または更新に失敗しました。
    COM_ERR_WRONG_VALUE            VARCHAR2(28)   := 'ZZ05105';        --値が不正です。
    COM_NOTEXIST_RCVISSUECTRLCD    VARCHAR2(28)   := 'AF00068';        --該当する入出庫管理番号が存在しません。
    COM__ERR_LOT_STOCK_ON_HAND_QTY VARCHAR2(28)   := 'AE20606';        --ロット在庫数が不足しています。
    COM_CUR_ORA_54                 VARCHAR2(28)   := 'ZZ01105';        --他の処理によりデータが書き換えられています。メニューに戻ってやり直して下さい。

    -- 例外の宣言
    excFncTraceLog           EXCEPTION;    --トレースログ出力エラー
    excCurRcvIssueErr        EXCEPTION;    --カーソルOPEN中のEXCEPTION
    excCurLotCtrlErr         EXCEPTION;    --カーソルOPEN中のEXCEPTION
    excCurLotStockErr        EXCEPTION;    --カーソルOPEN中のEXCEPTION
    excParameterErr          EXCEPTION;    --「引数」エラー
    excGetNewIssueCd         EXCEPTION;    --入出庫管理番号取得エラー
    excLotStockErr           EXCEPTION;    --ロット取得エラー
    excOnHandQtyErr          EXCEPTION;    --在庫数が不足エラー


BEGIN

    pnumStatus := STATUS_NORMAL;

    /* TraceLog の出力 */
    blnRet := FNCTRACELOG(pFileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                           MY_SQL_NAME, LOGMSG_START);

    IF blnRet=FALSE THEN
        RAISE excFncTraceLog;
    END IF
    ;

    /* 引数チェック */

    -- 入出庫管理番号 --
    IF (pvc2RcvIssueCtrlCd IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2RcvIssueCtrlCd = '' THEN      -- 空文字
        RAISE excParameterErr;
    END IF;

    /* カーソルＯＰＥＮ（保管区別入出庫）*/
    BEGIN
        OPEN curT_RCV_ISSUE;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurRcvIssueErr;
    END;

    /* カーソルＦＥＴＣＨ（保管区別入出庫）*/
    BEGIN
        FETCH curT_RCV_ISSUE INTO recT_RCV_ISSUE;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurRcvIssueErr;
    END;

    /* 対象データが存在しない場合 */
    IF curT_RCV_ISSUE%NOTFOUND THEN
        RAISE excGetNewIssueCd;

    /* 対象データが存在する場合 */
    ELSE

        /*対象データの取得*/
        typRsltRcvIssueTyp     := recT_RCV_ISSUE.RCV_ISSUE_TYP;       -- 入出庫区分の取得
        typRsltItemCd          := recT_RCV_ISSUE.ITEM_CD;             -- 品目番号の取得
        typRsltWhCd            := recT_RCV_ISSUE.WH_CD;               -- 保管区コードの取得
        typRsltLotNo           := recT_RCV_ISSUE.LOT_NO;              -- 在庫ロット番号の取得
        typRsltPlantCd         := recT_RCV_ISSUE.PLANT_CD;            -- 工場コードの取得
        typRsltRcvIssueQty     := recT_RCV_ISSUE.RCV_ISSUE_QTY;       -- 入出庫数

        /* 在庫ロット番号がNULLの場合*/
        IF typRsltLotNo IS NULL THEN
             RAISE excLotStockErr;
        END IF
        ;

        /* カーソルＯＰＥＮ（ロット管理）*/
        BEGIN
           OPEN curT_LOT_CTRL(
         typRsltItemCd
        ,typRsltLotNo
        );
        EXCEPTION
           WHEN OTHERS THEN
              RAISE excCurLotCtrlErr;
        END;

        /* カーソルＦＥＴＣＨ（ロット管理）*/
        BEGIN
            FETCH curT_LOT_CTRL INTO recT_LOT_CTRL;
        EXCEPTION
            WHEN OTHERS THEN
            RAISE excCurLotCtrlErr;
        END;

        /* ロット管理に対象データが存在しない場合 */
        IF curT_LOT_CTRL%NOTFOUND THEN
            RAISE excLotStockErr;
        END IF
        ;

        /* カーソルＣＬＯＳＥ（ロット管理）*/
        IF curT_LOT_CTRL%ISOPEN = TRUE THEN
           CLOSE curT_LOT_CTRL;
        END IF;


        /* カーソルＣＬＯＳＥ（保管区別入出庫）*/
        IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
             CLOSE curT_RCV_ISSUE;
        END IF;

        /* カーソルＯＰＥＮ(ロット別品目在庫）*/
        BEGIN
            OPEN curT_LOT_STOCK(
            typRsltItemCd
            ,typRsltWhCd
            ,typRsltLotNo
            );
        EXCEPTION
            WHEN OTHERS THEN
                RAISE excCurLotStockErr;
        END;

    END IF;

    /* カーソルＦＥＴＣＨ（ロット別品目在庫情報）*/
    BEGIN
        FETCH curT_LOT_STOCK INTO recT_LOT_STOCK;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurLotStockErr;
    END;

    /* 対象データが存在しない場合 */
    IF curT_LOT_STOCK%NOTFOUND THEN

        /* ロット別品目在庫登録*/
        typProcFlg := PROC_TYP_ENTRY;

        /* 品目別手持在庫数の取得 */
        typRsltStockOnHandQty    := 0;

        /* 入出庫区分が1:入庫  2:出庫の場合、ロット別手持在庫数は取得した入出庫数　ロット別不良数は0
        それ以外はロット別手持在庫数は0、ロット別不良数は入出庫数 */
        IF typRsltRcvIssueTyp IN (1,2) THEN
            typRsltRcvIssueQty := typRsltRcvIssueQty;
            typRsltDefectQty := 0;
        ELSE
             typRsltDefectQty := typRsltRcvIssueQty;
             typRsltRcvIssueQty := 0;
        END IF
        ;

        /* 引当済数量の設定*/
        IF pvc2RsvQty IS NOT NULL THEN
           /* 入出庫区分が1or3の場合は引当済数を増やす（出荷取消）*/
           IF typRsltRcvIssueTyp IN (1,3) THEN
                  typRsltAlcdQty := pvc2RsvQty;
           /* 入出庫区分が1or3以外の場合は引当済数を消しこむ（出荷実績）*/
           ELSE
                  typRsltAlcdQty := -pvc2RsvQty;
           END IF
           ;
        ELSE
        typRsltAlcdQty :=0;
        END IF
        ;

        /* 	出庫可能数のチェック */
       IF typRsltRcvIssueQty - typRsltAlcdQty < 0 THEN
           RAISE excOnHandQtyErr;
       ELSIF typRsltDefectQty < 0 THEN
          RAISE excOnHandQtyErr;
       END IF
       ;

        /* 保管区別品目在庫の登録 */
        INSERT INTO T_LOT_STOCK(
            ITEM_CD                          --品目番号
           ,WH_CD                            --保管区コード
           ,LOT_NO                           --在庫ロット番号
           ,PLANT_CD                         --工場コード
           ,STOCK_ON_HAND_QTY                --ロット別手持在庫数
           ,DEFECT_QTY                       --ロット別不良数
           ,ALCD_QTY                         --ロット別引当済数量
           ,CREATED_DATE                     --作成日
           ,CREATED_BY                       --作成者
           ,CREATED_PRG_NM                   --作成プログラム名
           ,UPDATED_DATE                     --更新日
           ,UPDATED_BY                       --更新者
           ,UPDATED_PRG_NM                   --更新プログラム名
           ,MODIFY_COUNT                     --更新数
        ) VALUES (
            typRsltItemCd                    --品目番号
           ,typRsltWhCd                      --保管区コード
           ,typRsltLotNo                     --在庫ロット番号
           ,typRsltPlantCd                   --工場コード
           ,typRsltRcvIssueQty               --ロット別別手持在庫数
           ,typRsltDefectQty                 --ロット別不良数
           ,typRsltAlcdQty                    --ロット別引当済数量
           ,sysdate                          --作成日
           ,pvc2UserId                       --作成者
           ,MY_SQL_NAME                      --作成プログラム名
           ,sysdate                          --更新日
           ,pvc2UserId                       --更新者
           ,MY_SQL_NAME                      --更新プログラム名
           ,0                                --更新数
         );

    /* 対象データが存在する場合 */
    ELSE

        /* ロット別品目在庫更新*/
        typProcFlg := PROC_TYP_UPDATE;

        /* ロット別手持在庫数の取得 */
        typRsltStockOnHandQty    := recT_LOT_STOCK.STOCK_ON_HAND_QTY;

        /* ロット別不良数の取得 */
        typRsltDefectQty := recT_LOT_STOCK.DEFECT_QTY;

        /* 引当済数量の取得*/
        typRsltAlcdQty := recT_LOT_STOCK.ALCD_QTY;

    END IF
    ;

      /* カーソルＣＬＯＳＥ（保管区別品目在庫情報）*/
      IF curT_LOT_STOCK%ISOPEN = TRUE THEN
           CLOSE curT_LOT_STOCK;
      END IF;

      /* 入出庫区分が1:入庫  2:出庫の場合、ロット別手持在庫数の設定 */
      IF typRsltRcvIssueTyp IN (1,2) THEN
          /* 品目別手持在庫数 */
          typRsltStockOnHandQty   := typRsltStockOnHandQty + typRsltRcvIssueQty;
      ELSE /*入出庫区分が1:入庫  2:出庫以外の場合、ロット別不良数の設定 */
          /* 品目別手持在庫数 */
          typRsltDefectQty   := typRsltDefectQty + typRsltRcvIssueQty;

      END IF;

      /* 引当済数量の設定*/
      IF pvc2RsvQty IS NOT NULL THEN
          /* 入出庫区分が1or3の場合は引当済数を増やす（出荷取消）*/
          IF typRsltRcvIssueTyp IN (1,3) THEN
              typRsltAlcdQty := typRsltAlcdQty + pvc2RsvQty;
          ELSE
          /* 入出庫区分が1or3以外の場合は引当済数を消しこむ（出荷実績）*/
              typRsltAlcdQty := typRsltAlcdQty - pvc2RsvQty;
          END IF
          ;
      ELSE
          typRsltAlcdQty := typRsltAlcdQty;
      END IF
      ;

      /* 	出庫可能数のチェック */
      IF typRsltStockOnHandQty - typRsltAlcdQty < 0 THEN
          RAISE excOnHandQtyErr;
      ELSIF typRsltDefectQty < 0 THEN
          RAISE excOnHandQtyErr;
      END IF
       ;

      /* ロット別品目在庫データがあるときのみ更新*/
      IF typProcFlg = PROC_TYP_UPDATE THEN


	      /* ロット別品目在庫の更新 */
	     UPDATE T_LOT_STOCK SET
	               STOCK_ON_HAND_QTY  = typRsltStockOnHandQty     --ロット別手持在庫
	              ,DEFECT_QTY         = typRsltDefectQty          --ロット別不良数
                      ,ALCD_QTY           = typRsltAlcdQty            --引当済数量
	              ,UPDATED_DATE       = sysdate                   --更新日
	              ,UPDATED_BY         = pvc2UserId                --更新者
	              ,UPDATED_PRG_NM     = MY_SQL_NAME               --更新プログラム名
	              ,MODIFY_COUNT       = MODIFY_COUNT + 1          --更新数
	      WHERE ITEM_CD   = typRsltItemCd
	      AND   WH_CD     = typRsltWhCd
	      AND   LOT_NO    = typRsltLotNo;

      END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;    -- 正常終了

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN

       /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_ERR_WRONG_VALUE, '');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM_ERR_WRONG_VALUE;
        RETURN FALSE;

     WHEN excGetNewIssueCd  THEN  --入出庫管理番号取得エラー
        ROLLBACK;

       /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_NOTEXIST_RCVISSUECTRLCD, '');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM_NOTEXIST_RCVISSUECTRLCD;

        RETURN FALSE;

      WHEN excLotStockErr  THEN  --ロット番号取得エラー
        ROLLBACK;

       /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_NOTEXIST_RCVISSUECTRLCD, '');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM_BATCH_EXP;

        RETURN FALSE;

    WHEN excCurRcvIssueErr THEN
        --ROLLBACK;

        /* カーソルＣＬＯＳＥ（保管区別入出庫）*/
        IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE;
        END IF;

        pnumStatus := STATUS_ERROR;
	pvc2MessageId := COM_CUR_ORA_54;

        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;

     WHEN excCurLotCtrlErr THEN
        --ROLLBACK;

        /* カーソルＣＬＯＳＥ（保管区別入出庫）*/
        IF curT_LOT_CTRL%ISOPEN = TRUE THEN
            CLOSE curT_LOT_CTRL;
        END IF;

        pnumStatus := STATUS_ERROR;

        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;


    WHEN excCurLotStockErr THEN
        --ROLLBACK;

        /* カーソルＣＬＯＳＥ（ロット別品目在庫情報）*/
        IF curT_LOT_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_LOT_STOCK;
        END IF;

        pnumStatus := STATUS_ERROR;
	pvc2MessageId := COM_CUR_ORA_54;

        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;

    WHEN excOnHandQtyErr THEN
        ROLLBACK;

        /* カーソルＣＬＯＳＥ（ロット別品目在庫情報）*/
        IF curT_LOT_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_LOT_STOCK;
        END IF;

        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM__ERR_LOT_STOCK_ON_HAND_QTY, '');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := COM__ERR_LOT_STOCK_ON_HAND_QTY;
        
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_PATH THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN OTHERS THEN
        --ROLLBACK;
        pnumStatus := STATUS_ERROR;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_ERR);
        RETURN FALSE;
END;
/
