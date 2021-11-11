CREATE OR REPLACE FUNCTION      FncExcUpdateItemStockFd (
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2006.11.07 初版
' 2006.12.21 入庫の場合は引当済数量を足しこみ、出庫の場合は引当済数量を消しこむように修正。
'
' 機能      : 在庫、入出庫更新
'             (Java呼び出し)
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle                -- (i)ファイルハンドル
'              pvc2LogMode                -- (i)ＬＯＧモード
'             pvc2OutputMode             -- (i)出力モード
'             pvc2UserId                 -- (i)ユーザＩＤ
'             pvc2BusinessName           -- (i)業務名
'             pvc2PlantCd                -- (i)工場コード
'             pvc2RcvIssueCtrlCd         -- (i)入出庫管理番号
'             pvc2ShipQty                -- (i)出荷済数量
'             pvc2MessegeCd              -- (o)エラーコード
'             pnumStatus                 -- (o)結果ステータス
'
' 機能説明  : 入出庫管理番号を元に、保管区別品目在庫・ロット別品目在庫・保管区別入出庫の登録･更新を行う。
'             引当済数量がNULL以外の場合、引数値で［保管区別品目在庫].品目別引当済数量及び、
'             [ロット別品目在庫].ロット別引当済数量の消込を行う。
'
'
' 備考      : 
'
------------------------------------------------------------------------------*/
              pFileHandle           IN	UTL_FILE.FILE_TYPE	--ファイルハンドル
              ,pvc2LogMode          IN  VARCHAR2      -- (i)ＬＯＧモード
              ,pvc2OutputMode       IN  VARCHAR2      -- (i)出力モード
              ,pvc2UserId           IN  VARCHAR2      -- (i)ユーザＩＤ
              ,pvc2BusinessName     IN  VARCHAR2      -- (i)業務名
              ,pvc2PlantCd          IN  VARCHAR2      -- (i)工場コード
              ,pvc2RcvIssueCtrlCd   IN  VARCHAR2      -- (i)入出庫管理番号
              ,pvc2RsvQty           IN  NUMBER        -- (i)出荷済数量
              ,pvc2MessageId        OUT VARCHAR2      -- (o)エラーコード
              ,pnumStatus           OUT NUMBER        -- (o)結果ステータス
)RETURN BOOLEAN
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
        T_RCV_ISSUE.RCV_ISSUE_QTY,
        T_RCV_ISSUE.RCV_ISSUE_AFTER_QTY
    FROM T_RCV_ISSUE
    WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd;
    
    recT_RCV_ISSUE  curT_RCV_ISSUE%ROWTYPE;

    --//保管区別品目在庫の検索
    CURSOR curT_ITEM_STOCK (
    ctypItemCd T_ITEM_STOCK.ITEM_CD%TYPE
    ,ctypWhCd  T_ITEM_STOCK.WH_CD%TYPE
    ) IS
    SELECT *
    FROM T_ITEM_STOCK
    WHERE ITEM_CD = ctypItemCd
    AND   WH_CD   = ctypWhCd;

    recT_ITEM_STOCK  curT_ITEM_STOCK%ROWTYPE;

/* 変数の宣言 */

    blnRet                      BOOLEAN;                                      --BOOLEAN型 返却値

    typRsltRcvIssueTyp          T_RCV_ISSUE.RCV_ISSUE_TYP%TYPE;               --取得結果（入出庫区分）
    typRsltItemCd               T_RCV_ISSUE.ITEM_CD%TYPE;                     --取得結果（品目番号）
    typRsltWhCd                 T_RCV_ISSUE.WH_CD%TYPE;                       --取得結果（保管区コード）
    typRsltLotNo                T_RCV_ISSUE.LOT_NO%TYPE;                      --取得結果（在庫ロット番号）
    typRsltPlantCd              T_RCV_ISSUE.PLANT_CD%TYPE;                    --取得結果（工場コード）
    typRsltRcvIssueQty          T_RCV_ISSUE.RCV_ISSUE_QTY%TYPE;               --取得結果（入出庫数）
    typRsltStockOnHandQty       T_ITEM_STOCK.STOCK_ON_HAND_QTY%TYPE;          --取得結果（品目別手持在庫数）
    typRsltAlcdQty              T_ITEM_STOCK.ALCD_QTY%TYPE;                   --取得結果（品目別引当済数量）

    typRcvIssueBeforeQty        T_RCV_ISSUE.RCV_ISSUE_BEFORE_QTY%TYPE;        --取得結果（入出庫前在庫数）
    typRcvIssueAfterQty         T_RCV_ISSUE.RCV_ISSUE_AFTER_QTY%TYPE;         --取得結果（入出庫後在庫数）
    typBeforStockOnHandQty      T_ITEM_STOCK.STOCK_ON_HAND_QTY%TYPE;          --更新前品目別手持在庫数
    typProcFlg                  NUMBER(1)   := 0;



/* 定数の宣言 */
    MY_SQL_NAME            VARCHAR2(120)  := 'FncExcUpdateItemStockFd';  --ＰＬ／ＳＱＬ名
    LOGMODE_NOLOG          VARCHAR2(4)    := '0';                       --ＬＯＧモード　ＬＯＧ無し
    OUTPUTMODE_FILE        VARCHAR2(4)    := '1';                       --出力モード　　ファイル
    LOGMSG_START           VARCHAR2(20)   := 'Start';                   --ログ用メソッド開始宣言
    LOGMSG_END             VARCHAR2(12)   := 'End';                     --ログ用メソッド終了宣言
    LOGMSG_ERR             VARCHAR2(12)   := 'Err';                     --ログ用メソッドエラー宣言
    LOGMSG_GETERR          VARCHAR2(32)   := 'GetNoErr';                --ログ用メソッド採番エラー宣言
    LOGMSG_CUROPENERR      VARCHAR2(40)   := 'CurOpenErr';            --ログ用カーソルOPENエラー宣言
    LOGMSG_NOTFOUND        VARCHAR2(32)   := 'NotFound';              --ログ用未存在宣言
    STATUS_NORMAL          NUMBER        := 1;          -- 正常終了
    STATUS_WORNING         NUMBER        := 2;          -- 警告終了
    STATUS_ERROR           NUMBER        := 3;          -- 異常終了
    PROC_TYP_ENTRY         NUMBER        := 1;                       --ロット別品目在庫登録
    PROC_TYP_UPDATE        NUMBER        := 2;                       --ロット別品目在庫更新

    /* 変数の宣言 WORK */       
    vc2WkMessageId           VARCHAR2(28)     := NULL;            --エラーコード
    numWKStatus              NUMBER(1)        := STATUS_NORMAL;   --結果ステータス

/* MESSAGE の宣言 */

    COM_UPDATE_LOT_STOCK_FD      VARCHAR2(28)   := 'ZZ22001';        --ロット別品目在庫の登録または更新に失敗しました。
    COM_ERR_WRONG_VALUE          VARCHAR2(28)   := 'ZZ05105';        --値が不正です。
    COM_NOTEXIST_RCVISSUECTRLCD  VARCHAR2(28)   := 'AF00068';        --入出庫管理番号データが存在しません。
    

    -- 例外の宣言
    excFncTraceLog         EXCEPTION;          --トレースログ出力エラー
    excCurRcvIssueErr      EXCEPTION;          --カーソルOPEN中のEXCEPTION
    excCurItemStockErr     EXCEPTION;          --カーソルOPEN中のEXCEPTION
    excParameterErr        EXCEPTION;          --「引数」エラー
    excRcvIssueCtrl        EXCEPTION;          --入出庫管理番号データなしエラー
    excUpdateLotStockFd    EXCEPTION;          --ロットトレース登録・更新処理エラー
    


BEGIN

    pnumStatus := STATUS_NORMAL;
    pvc2MessageId := '';

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
        RAISE excRcvIssueCtrl;

    /* 対象データが存在する場合 */
    ELSE

        /*対象データの取得*/
        typRsltRcvIssueTyp          := recT_RCV_ISSUE.RCV_ISSUE_TYP;       -- 入出庫区分の取得 
        typRsltItemCd               := recT_RCV_ISSUE.ITEM_CD;                   -- 品目番号の取得 
        typRsltWhCd                 := recT_RCV_ISSUE.WH_CD;                     -- 保管区コードの取得 
        typRsltLotNo                := recT_RCV_ISSUE.LOT_NO;                    -- 在庫ロット番号の取得 
        typRsltPlantCd              := recT_RCV_ISSUE.PLANT_CD;                  -- 工場コードの取得 
        typRsltRcvIssueQty          := recT_RCV_ISSUE.RCV_ISSUE_QTY;             -- 入出庫数

    END IF;
    
    /* カーソルＣＬＯＳＥ（保管区別入出庫）*/
    IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
         CLOSE curT_RCV_ISSUE;
    END IF;

    /* カーソルＯＰＥＮ（保管区別品目在庫）*/
    BEGIN
        OPEN curT_ITEM_STOCK(
        typRsltItemCd
        ,typRsltWhCd
        );
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurItemStockErr;
    END;

    /* カーソルＦＥＴＣＨ（保管区別品目在庫情報）*/
    BEGIN
        FETCH curT_ITEM_STOCK INTO recT_ITEM_STOCK;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE excCurItemStockErr;
    END;

    /* 対象データが存在しない場合 */
    IF curT_ITEM_STOCK%NOTFOUND THEN

        /* 保管区別品目在庫登録*/
        typProcFlg := PROC_TYP_ENTRY;

        /* 品目別手持在庫数の取得 */
        typRsltStockOnHandQty    := 0;

        /* 品目別引当済数量のセット */

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

        /* 更新前手持在庫数の保持*/
        typBeforStockOnHandQty   := 0;

        /* 保管区別品目在庫の登録 */
        INSERT INTO T_ITEM_STOCK(
        ITEM_CD                          --品目番号
       ,WH_CD                            --保管区コード
       ,PLANT_CD                         --工場コード
       ,STOCK_ON_HAND_QTY                --品目別手持在庫数
       ,DEFECT_QTY                       --品目別不良数
       ,PRVS_DAYEND_STOCK_QTY            --品目別前日末在庫数
       ,PRVS_MONTHEND_STOCK_QTY          --品目別前月末在庫数
       ,PRVS_TERMEND_STOCK_QTY           --品目別前期末在庫数
       ,ALCD_QTY                         --品目別引当済数量
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
       ,typRsltPlantCd                   --工場コード
       ,typRsltRcvIssueQty               --品目別手持在庫数
       ,0                                --品目別不良数
       ,0                                --品目別前日末在庫数
       ,0                                --品目別前月末在庫数
       ,0                                --品目別前期末在庫数
       ,typRsltAlcdQty                   --品目別引当済数量
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
        
        /* 保管区別品目在庫更新*/
        typProcFlg := PROC_TYP_UPDATE;

        /* 品目別手持在庫数の取得 */
        typRsltStockOnHandQty    := recT_ITEM_STOCK.STOCK_ON_HAND_QTY;

        /* 品目別引当済数量の取得 */
        typRsltAlcdQty           := recT_ITEM_STOCK.ALCD_QTY;

        /* 更新前手持在庫数の保持*/
        typBeforStockOnHandQty   := recT_ITEM_STOCK.STOCK_ON_HAND_QTY;

    END IF
    ;

    /* カーソルＣＬＯＳＥ（保管区別品目在庫情報）*/
    IF curT_ITEM_STOCK%ISOPEN = TRUE THEN
         CLOSE curT_ITEM_STOCK;
    END IF;

    /* 品目別手持在庫数の設定 */

        /* 品目別手持在庫数 */
        typRsltStockOnHandQty    := typRsltStockOnHandQty + typRsltRcvIssueQty;

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

    /* 保管区別品目在庫データがあるときのみ更新*/
    IF typProcFlg = PROC_TYP_UPDATE THEN

        /* 保管区別品目在庫の更新 */
        UPDATE T_ITEM_STOCK SET
             STOCK_ON_HAND_QTY  = typRsltStockOnHandQty      --品目別手持在庫数
             ,ALCD_QTY           = typRsltAlcdQty            --品目別引当済数量
             ,UPDATED_DATE       = sysdate                   --更新日
             ,UPDATED_BY         = pvc2UserId                --更新者
             ,UPDATED_PRG_NM     = MY_SQL_NAME               --更新プログラム名
             ,MODIFY_COUNT       = MODIFY_COUNT + 1          --更新数
        WHERE ITEM_CD   = typRsltItemCd
        AND   WH_CD     = typRsltWhCd
        ;
     END IF
     ;

    /* 入出庫前在庫数の設定*/
    typRcvIssueBeforeQty  := typBeforStockOnHandQty;

    /* 入出庫後在庫数の設定*/
    typRcvIssueAfterQty   := typBeforStockOnHandQty + typRsltRcvIssueQty ;

    /* 保管区別入出庫の更新*/
    UPDATE T_RCV_ISSUE SET
             RCV_ISSUE_BEFORE_QTY  = typRcvIssueBeforeQty
             ,RCV_ISSUE_AFTER_QTY   = typRcvIssueAfterQty
             ,STOCK_UPD_TYP         = 2
    WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd
    ;

    /* 保管区別入出庫の在庫ロット番号がNULL以外の場合*/ 
    IF typRsltLotNo IS NOT NULL THEN
        /* ロット別品目在庫登録・更新処理の呼び出し*/
        blnRet := FNCEXCUPDATELOTSTOCKFD(pFileHandle
                                     ,pvc2LogMode
                                     ,pvc2OutputMode
                                     ,pvc2UserId
                                     ,pvc2BusinessName
                                     ,pvc2PlantCd 
                                     ,pvc2RcvIssueCtrlCd
                                     ,pvc2RsvQty
                                     ,vc2WkMessageId
                                     ,numWKStatus);
    
    END IF
    ;

    IF blnRet=FALSE THEN
        RAISE excUpdateLotStockFd;
    END IF
    ;
    

RETURN TRUE;
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

    WHEN excRcvIssueCtrl THEN

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

    WHEN excUpdateLotStockFd THEN

       /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, COM_UPDATE_LOT_STOCK_FD, '');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);

        pnumStatus := STATUS_ERROR;
        pvc2MessageId := vc2WkMessageId;

        RETURN FALSE;


    WHEN excCurRcvIssueErr THEN
        --ROLLBACK;
        
        /* カーソルＣＬＯＳＥ（保管区別入出庫）*/
        IF curT_RCV_ISSUE%ISOPEN = TRUE THEN
            CLOSE curT_RCV_ISSUE;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
        
     WHEN excCurItemStockErr THEN
        --ROLLBACK;
        
        /* カーソルＣＬＯＳＥ（ロット別品目在庫情報）*/
        IF curT_ITEM_STOCK%ISOPEN = TRUE THEN
            CLOSE curT_ITEM_STOCK;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;

    WHEN excFncTraceLog THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_PATH THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_MODE THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_OPERATION THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INTERNAL_ERROR THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN UTL_FILE.INVALID_FILEHANDLE THEN
        pnumStatus := STATUS_ERROR;
        RETURN FALSE;
    WHEN OTHERS THEN
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
