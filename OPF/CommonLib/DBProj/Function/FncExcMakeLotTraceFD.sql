CREATE OR REPLACE FUNCTION FNCEXCMAKELOTTRACEFD(
/*------------------------------------------------------------------------------
'
' FncExcMakeLotTraceFdFD.Sql
'
' 修正履歴
' 2006.12.22 新規作成
'
' 機能      : ロットトレース登録
'
' 戻り値    : Boolean
'               True :正常終了（結果ステータス=1:正常終了、2:警告終了）
'               False:異常終了（結果ステータス=3:異常終了）
'
' 引き数    : 
'         -- SYSTEM共通
'             pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'         -- 業務固有
'             pvc2FromItemCd       - (i)元品目コード
'             pvc2FromLotNo        - (i)元ロット番号
'             pvc2ToItemCd         - (i)先品目コード
'             pvc2ToLotNo          - (i)先ロット番号
'             pvc2LotTraceTyp      - (i)ロットトレース区分
'             pvc2ErrCd            - (o)エラーコード
'             pnumStatus           - (o)結果ステータス(1:正常終了、2:警告終了、3:異常終了)
' 機能説明  :ロットトレース情報を登録する。
'
' 備考      :
'
-----------------------------------------------------------------------------*/
    pFileHandle             IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode             IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode          IN  VARCHAR2            --出力モード
   ,pvc2UserId              IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName        IN  VARCHAR2            --業務名
   ,pvc2PlantCd             IN  VARCHAR2            --工場コード
   ,pvc2FromItemCd          IN  VARCHAR2            --元品目コード
   ,pvc2FromLotNo           IN  VARCHAR2            --元ロット番号
   ,pvc2ToItemCd            IN  VARCHAR2            --先品目コード
   ,pvc2ToLotNo             IN  VARCHAR2            --先ロット番号
   ,pvc2LotTraceTyp         IN  NUMBER              --ロットトレース区分
   ,pvc2ErrCd               OUT VARCHAR2            --エラーコード
   ,pnumStatus              OUT NUMBER              --結果ステータス
    ) RETURN BOOLEAN
IS

/* 定数の宣言 */
    MY_SQL_NAME         VARCHAR2(64)    := 'FncExcMakeLotTraceFdFD';  --ＰＬ／ＳＱＬ名

    LOGMSG_START        VARCHAR2(20)     := 'Start';            --ログ用メソッド開始宣言
    LOGMSG_END          VARCHAR2(12)     := 'End';              --ログ用メソッド終了宣言
    LOGMSG_NOT_FOUND    VARCHAR2(80)     := 'NotFound';         --ログ用メソッドマスタNOTFOUND
    LOGMSG_CUROPENERR   VARCHAR2(40)     := 'CurOpenErr';       --ログ用カーソルOPENエラー宣言
    
    STATUS_NORMAL     CONSTANT   NUMBER(01)     := 1;  -- 正常終了
    STATUS_WARNING    CONSTANT   NUMBER(01)     := 2;  -- 警告終了
    STATUS_ERROR      CONSTANT   NUMBER(01)     := 3;  -- 異常終了

    -- メッセージコード

    JF_COM_ERR_WRONG_VALUE                 VARCHAR(28)  := 'ZZ05105';               --値が不正です
    JF_COM_ERR_ORACLE_ERROR                VARCHAR(28)  := 'AC53401';               --ORACLEエラー
    JF_COM_ERR_LOT_CTRL                    VARCHAR(28)  := 'ZZ22004';               --ロット管理にデータが存在しません。
    JF_COM_ERR_LOT_TRACE_ERROR             VARCHAR(28)  := 'ZZ22016';               --ロットトレースの登録または更新に失敗しました。
        

/* 変数の宣言 WORK */
    blnRet              BOOLEAN;

    -- 例外の宣言
    excParameterErr              EXCEPTION;          --「引数」エラー
    excNotFound                  EXCEPTION;          --マスタNOT FOUND
    excCurLotCtrlErr             EXCEPTION;          --カーソルOPEN中のEXCEPTION
    excCurLotTraceErr            EXCEPTION;          --カーソルOPEN中のEXCEPTION
    excLotCtrlErr                EXCEPTION;          --[ロット管理]に存在しないエラー
    excLotTraceErr               EXCEPTION;         --[ロットトレース]に登録・更新失敗エラー

    -- カーソルの宣言
    
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
    
    --//ロットトレースの検索
    CURSOR curT_LOT_TRACE (
    ctypFromItemCd T_LOT_TRACE.FROM_ITEM_CD%TYPE
    ,ctypFromLotNo T_LOT_TRACE.FROM_LOT_NO%TYPE
    ,ctypToItemCd T_LOT_TRACE.TO_ITEM_CD%TYPE
    ,ctypToLotNo T_LOT_TRACE.TO_LOT_NO%TYPE
    ,ctypLotTraceTyp T_LOT_TRACE.LOT_TRACE_TYP%TYPE
    ) IS
    SELECT 
        T_LOT_TRACE.FROM_ITEM_CD
    FROM T_LOT_TRACE
    WHERE FROM_ITEM_CD = ctypFromItemCd
    AND   FROM_LOT_NO  = ctypFromLotNo
    AND   TO_ITEM_CD  = ctypToItemCd
    AND   TO_LOT_NO  = ctypToLotNo
    AND   LOT_TRACE_TYP  = ctypLotTraceTyp;

    recT_LOT_TRACE  curT_LOT_CTRL%ROWTYPE;

BEGIN

    pnumStatus         :=  STATUS_NORMAL;  --結果ステータス
    pvc2ErrCd          :=  NULL;           --エラーコード

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 引数チェック */

    -- 元品目コード --
    IF (pvc2FromItemCd IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2FromItemCd = '' THEN      -- 空文字
        RAISE excParameterErr;
    END IF;

    -- 元ロット番号 --
    IF (pvc2FromLotNo IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2FromLotNo = '' THEN      -- 空文字
        RAISE excParameterErr;
    END IF;
    
    -- 先品目コード --
    IF (pvc2ToItemCd IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2ToItemCd = '' THEN      -- 空文字
        RAISE excParameterErr;
    END IF;
    
    -- 先ロット番号 --
    IF (pvc2ToLotNo IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2ToLotNo = '' THEN      -- 空文字
        RAISE excParameterErr;
    END IF;
    
    -- ロットトレース区分 --
    IF (pvc2LotTraceTyp IS NULL) THEN    -- NULL
        RAISE excParameterErr;
    ELSIF pvc2LotTraceTyp = '' THEN      -- 空文字
        RAISE excParameterErr;
    END IF;

---------------------------------------------------------
    --  元品目コード＝先品目コードかつ元ロット番＝号先ロット番号の場合--
    IF pvc2FromItemCd = pvc2ToItemCd AND
        pvc2FromLotNo = pvc2ToLotNo THEN
        RAISE excLotTraceErr;
    END IF;
---------------------------------------------------------
    /* 元品目番号・元ロット番号の[ロット管理]の検索*/
    
    /* カーソルＯＰＥＮ（ロット管理）*/
    BEGIN
       OPEN curT_LOT_CTRL(
     pvc2FromItemCd
    ,pvc2FromLotNo
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
        RAISE excLotCtrlErr;
    END IF
    ;

    /* カーソルＣＬＯＳＥ（ロット管理）*/
    IF curT_LOT_CTRL%ISOPEN = TRUE THEN
       CLOSE curT_LOT_CTRL;
    END IF;
---------------------------------------------------------
 /* 先品目番号・先ロット番号の[ロット管理]の検索*/
    
    /* カーソルＯＰＥＮ（ロット管理）*/
    BEGIN
       OPEN curT_LOT_CTRL(
     pvc2ToItemCd
    ,pvc2ToLotNo
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
        RAISE excLotCtrlErr;
    END IF
    ;

    /* カーソルＣＬＯＳＥ（ロット管理）*/
    IF curT_LOT_CTRL%ISOPEN = TRUE THEN
       CLOSE curT_LOT_CTRL;
    END IF;

---------------------------------------------------------
/* [ロットトレース]の検索*/

 /* カーソルＯＰＥＮ（ロットトレース）*/
    BEGIN
       OPEN curT_LOT_TRACE(
     pvc2FromItemCd
    ,pvc2FromLotNo 
    ,pvc2ToItemCd
    ,pvc2ToLotNo
    ,pvc2LotTraceTyp
    );
    EXCEPTION
       WHEN OTHERS THEN
          RAISE excCurLotCtrlErr;
    END;

    /* カーソルＦＥＴＣＨ（ロットトレース）*/
    BEGIN
        FETCH curT_LOT_TRACE INTO recT_LOT_TRACE;
    EXCEPTION
        WHEN OTHERS THEN
        RAISE excCurLotCtrlErr;
    END;

    /* ロットトレースに対象データが存在しない場合 */
    IF curT_LOT_TRACE%NOTFOUND THEN
        
        /*[ロットトレース]の登録*/
        INSERT INTO T_LOT_TRACE(
            FROM_ITEM_CD                     --元品目コード
           ,FROM_LOT_NO                      --元ロット番号
           ,TO_ITEM_CD                       --先品目コード
           ,TO_LOT_NO                        --先ロット番号
           ,LOT_TRACE_TYP                    --ロットトレース区分
           ,CREATED_DATE                     --作成日
           ,CREATED_BY                       --作成者
           ,CREATED_PRG_NM                   --作成プログラム名
           ,UPDATED_DATE                     --更新日
           ,UPDATED_BY                       --更新者
           ,UPDATED_PRG_NM                   --更新プログラム名
           ,MODIFY_COUNT                     --更新数
        ) VALUES (
            pvc2FromItemCd                   --元品目コード
           ,pvc2FromLotNo                    --元ロット番号
           ,pvc2ToItemCd                     --先品目コード
           ,pvc2ToLotNo                      --先ロット番号
           ,pvc2LotTraceTyp                  --ロットトレース区分
           ,sysdate                          --作成日
           ,pvc2UserId                       --作成者
           ,MY_SQL_NAME                      --作成プログラム名
           ,sysdate                          --更新日
           ,pvc2UserId                       --更新者
           ,MY_SQL_NAME                      --更新プログラム名
           ,0                                --更新数
         );
        
    ELSE
        /*[ロットトレース]の更新 */ 
        UPDATE T_LOT_TRACE SET
	              UPDATED_DATE       = sysdate                   --更新日
	              ,UPDATED_BY         = pvc2UserId                --更新者
	              ,UPDATED_PRG_NM     = MY_SQL_NAME               --更新プログラム名
	              ,MODIFY_COUNT       = MODIFY_COUNT + 1          --更新数
	    WHERE FROM_ITEM_CD   = pvc2FromItemCd
        AND   FROM_LOT_NO    = pvc2FromLotNo
        AND   TO_ITEM_CD     = pvc2ToItemCd
        AND   TO_LOT_NO      = pvc2ToLotNo
        AND   LOT_TRACE_TYP  = pvc2LotTraceTyp;
    END IF
    ;

    /* カーソルＣＬＯＳＥ（ロットトレース）*/
    IF curT_LOT_CTRL%ISOPEN = TRUE THEN
       CLOSE curT_LOT_CTRL;
    END IF;

---------------------------------------------------------

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excParameterErr THEN
        pnumStatus         := STATUS_ERROR;               --結果ステータス
        pvc2ErrCd          := JF_COM_ERR_WRONG_VALUE;     --エラーコード
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
        
    WHEN excCurLotCtrlErr THEN
        --ROLLBACK;
        
        /* カーソルＣＬＯＳＥ（ロット管理）*/
        IF curT_LOT_CTRL%ISOPEN = TRUE THEN
            CLOSE curT_LOT_CTRL;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
        
    WHEN excCurLotTraceErr THEN
        --ROLLBACK;
        
        /* カーソルＣＬＯＳＥ（ロットトレース）*/
        IF curT_LOT_TRACE%ISOPEN = TRUE THEN
            CLOSE curT_LOT_TRACE;
        END IF;
        
        pnumStatus := STATUS_ERROR;
        
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_CUROPENERR);
        RETURN FALSE;
        
    WHEN excLotTraceErr  THEN  --[ロットトレース]に登録・更新失敗エラー
        ROLLBACK;

       /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, JF_COM_ERR_LOT_TRACE_ERROR, '');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
                              
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_LOT_TRACE_ERROR;
        
        RETURN FALSE;

    WHEN excLotCtrlErr  THEN  --[ロット管理]に存在しないエラー
        ROLLBACK;

       /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, JF_COM_ERR_LOT_CTRL, '');
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
                              
        pnumStatus := STATUS_ERROR;
        pvc2ErrCd  := JF_COM_ERR_LOT_CTRL;
        
        RETURN FALSE;
        
    WHEN OTHERS THEN
        pnumStatus         := STATUS_ERROR;               --結果ステータス
        pvc2ErrCd          := JF_COM_ERR_ORACLE_ERROR;    --エラーコード
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/
