CREATE OR REPLACE procedure SQLMONTHLYPROC(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.18 新規作成
' 2005.10.24 unicode対応（varchar2を4倍）
' 2014.03.02 二版　入出庫情報ベース月末在庫処理対応
''
' 機能      : 月次処理
'
' 引き数    : pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2OutputPath       - (i)出力ファイルパス
'             pvc2OutputName       - (i)出力ファイル名
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvc2MonthlyDate      - (i)月次処理対象日
'
' 機能説明  : 当月の在庫の締め処理を行う。
' 備考      :
'
------------------------------------------------------------------------------*/
--< プロシージャ名定義 >-----------------------------------------------------
    pVc2LogMode         IN  VARCHAR2,       --// ＬＯＧモード
    pVc2OutputMode      IN  VARCHAR2,       --// 出力モード
    pVc2OutputPath      IN  VARCHAR2,       --// 出力ファイルパス
    pVc2OutputName      IN  VARCHAR2,       --// 出力ファイル名
    pvc2UserId          IN  VARCHAR2,       --// ユーザ名
    pvc2BusinessName    IN  VARCHAR2,       --// 業務名
    pvc2PlantCd         IN  VARCHAR2,       --// 工場コード
    pvc2MonthlyDate     IN  VARCHAR2        --// 月次処理対象日
    ) is
    --// レコードの定義
    /* 定数の宣言 */
        METHOD_START                    VARCHAR2(20)  := 'Start';      --ログ用メソッド開始宣言
        METHOD_END                      VARCHAR2(12)  := 'End';        --ログ用メソッド終了宣言
        MY_SQL_NAME                     VARCHAR2(56) := 'SqlMonthlyProc'; --ＰＬ／ＳＱＬ名
        LOGMSG_START_PGNM_MonthlyProc   VARCHAR2(72) := '<< 月次処理開始 >>';
        LOGMSG_END_PGNM_MonthlyProc     VARCHAR2(72) := '<< 月次処理終了 >>';
        LOGMSG_ERR                      VARCHAR2(32)  := '異常終了';
        APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';  --バッチ処理を開始しました  --A
        APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';  --バッチ処理を終了しました  --A
        APS_COM_NOTEXIST_DATA           VARCHAR2(28)    := 'AD00067'; --対象データが存在しません     --A
        APS_COM_NOTPRIMARY              VARCHAR2(28)    := 'AD00068'; --データが２件以上存在します   --A
        LCTRL_CD_DEFAULT                VARCHAR2(100) := 'SYSTEM';
        excSysFinalMonthlyProcCtrl      EXCEPTION;              --月次処理制御ﾃｰﾌﾞﾙ読込失敗
    --// 変数の定義
        UTL_FileHandle                  UTL_FILE.FILE_TYPE; --ファイルハンドル
        lnumterm_curr                   NUMBER(5);          --月次処理制御ﾃｰﾌﾞﾙ件数カウント用
        lBlnRet                         boolean;            --共通関数の戻値
        lvc2Comment                     VARCHAR2(1024);
        lvc2Comment2                    VARCHAR2(1024);
        vc2RunChkComment                VARCHAR2(1024);      --実行位置確認用コメント作成作業領域
        monthendstockflg                NUMBER;             --月末在庫作成処理の完了状態判定用フラグ
        vc2ErrCodeRt                    VARCHAR2(100);      -- エラーコード格納戻り用
        vc2ErrCode                      VARCHAR2(100);      -- エラーコード格納用
    --// 例外処理用変数
        excERR_CALLPROC                 EXCEPTION;          -- 月末在庫作成処理失敗
--<メイン処理 >-----------------------------------------------------
begin
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;
    /* LogFile の OPEN */
        LblnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle); --A
    --//TraceLogの出力(Start)処理を行う
        LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_START); --A
    --//業務開始のメッセージ取得
    lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0445)'|| LOGMSG_START_PGNM_MonthlyProc || lvc2Comment); --A
        commit;
vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --//保管区別品目在庫ﾃｰﾌﾞﾙの更新
        update t_item_stock set prvs_monthend_stock_qty = stock_on_hand_qty,
                                updated_date = sysdate,
                                updated_by = pvc2UserId,
                                updated_prg_nm = MY_SQL_NAME,
                                modify_count = (modify_count + 1)
                            where stock_on_hand_qty <> prvs_monthend_stock_qty and
                                  plant_cd = pvc2PlantCd; --A
vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --//保管区別製番在庫ﾃｰﾌﾞﾙの更新
        update t_job_odr_cd_stock set prvs_monthend_stock_qty = stock_on_hand_qty,
                                updated_date = sysdate,
                                updated_by = pvc2UserId,
                                updated_prg_nm = MY_SQL_NAME,
                                modify_count = (modify_count + 1)
                            where stock_on_hand_qty <> prvs_monthend_stock_qty and
                                  plant_cd = pvc2PlantCd; --A
vc2RunChkComment := '●●●●通過 00021'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//同一月再処理時用に、処理月日で[月末品目在庫]の削除 --A
          delete T_MONTHLY_ITEM_STOCK
                      where plant_cd = pvc2PlantCd and 
                            monthly_proc_exec_date = pvc2MonthlyDate ; --A
vc2RunChkComment := '●●●●通過 00022'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//同一月再処理時用に、処理月日で[月末製番在庫]の削除 --A
          delete T_MONTHLY_JOB_ODR_CD_STOCK
                      where plant_cd = pvc2PlantCd and 
                            monthly_proc_exec_date = pvc2MonthlyDate ; --A
vc2RunChkComment := '●●●●通過 00023'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//[月末品目在庫]のコピー登録 --A
          Insert Into T_MONTHLY_ITEM_STOCK (
                 MONTHLY_PROC_EXEC_DATE,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 DEFECT_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 CREATED_DATE,
                 CREATED_BY,
                 CREATED_PRG_NM,
                 UPDATED_DATE,
                 UPDATED_BY,
                 UPDATED_PRG_NM,
                 MODIFY_COUNT)
          Select
                 pvc2MonthlyDate,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 DEFECT_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 0
          From T_ITEM_STOCK
          where PLANT_CD = pvc2PlantCd ; --A
vc2RunChkComment := '●●●●通過 00023'; --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment); --A
        --//[月末製番在庫]のコピー登録 --A
          Insert Into T_MONTHLY_JOB_ODR_CD_STOCK (
                 MONTHLY_PROC_EXEC_DATE,
                 JOB_ODR_CD,
                 JOB_ODR_DETAIL_NO,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 CREATED_DATE,
                 CREATED_BY,
                 CREATED_PRG_NM,
                 UPDATED_DATE,
                 UPDATED_BY,
                 UPDATED_PRG_NM,
                 MODIFY_COUNT)
          Select
                 pvc2MonthlyDate,
                 JOB_ODR_CD,
                 JOB_ODR_DETAIL_NO,
                 ITEM_CD,
                 WH_CD,
                 PLANT_CD,
                 STOCK_ON_HAND_QTY,
                 PRVS_DAYEND_STOCK_QTY,
                 PRVS_MONTHEND_STOCK_QTY,
                 PRVS_TERMEND_STOCK_QTY,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 sysdate,
                 pvc2UserId,
                 MY_SQL_NAME,
                 0
          From T_JOB_ODR_CD_STOCK
          where PLANT_CD = pvc2PlantCd ; --A
vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        --//月末在庫作成処理PL/SQL呼び出し
        SQLCREATEMONTHENDSTOCK(pVc2LogMode,        --// ＬＯＧモード
                                   pVc2OutputMode,     --// 出力モード
                                   pVc2OutputPath,     --// 出力ファイルパス
                                   null,               --// 出力ファイル名（呼び先で設定するためNULL）
                                   pvc2UserId,         --// ユーザ名
                                   pvc2BusinessName,   --// 業務名
                                   pvc2PlantCd,        --// 工場コード
                                   pvc2MonthlyDate,    --// 月次処理対象日
                                   monthendstockflg,   --//処理結果 (1:正常終了、2:異常終了)
                                   vc2ErrCode);
        if monthendstockflg = 2 then
            raise excERR_CALLPROC;
        end if;
        --//月次処理制御ﾃｰﾌﾞﾙの更新
        select count(*) into lnumterm_curr from sys_monthly_proc_ctrl
            where plant_cd = pvc2PlantCd; --A
vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            if lnumTerm_Curr <>  1 then
vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                if lnumTerm_Curr = 0 then --取得データなし
vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME,APS_COM_NOTEXIST_DATA,''); --A
                    RAISE excSysFinalMonthlyProcCtrl;
                else --２件以上の取得
vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                        pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                        MY_SQL_NAME,APS_COM_NOTPRIMARY,''); --A
                    RAISE excSysFinalMonthlyProcCtrl;
                end if;
            else
vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                --月次処理制御ﾃｰﾌﾞﾙの更新
                update sys_monthly_proc_ctrl set final_monthly_proc_exec_date = pvc2MonthlyDate,
                                updated_date = sysdate,
                                updated_by = pvc2UserId,
                                updated_prg_nm = MY_SQL_NAME,
                                modify_count = (modify_count + 1)
                            where plant_cd = pvc2PlantCd; --A
            end if;
    --//業務終了のメッセージ
    lvc2Comment := '月次処理対象年月：[ '|| pvc2MonthlyDate ||' ]';
    lvc2Comment2 := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0446)' || LOGMSG_END_PGNM_MonthlyProc || lvc2Comment2 || lvc2Comment); --A
    commit;
    --//TraceLogの出力処理を行う
    LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
    /* LogFile の CLOSE */
    LblnRet := FncLogClose(UTL_FileHandle);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
--< 例外処理 >---------------------------------------------------------------
exception
    when excSysFinalMonthlyProcCtrl then    --//月次処理制御ﾃｰﾌﾞﾙ読込失敗
--DBMS_OUTPUT.PUT_LINE('excSysFinalMonthlyProcCtrl');
            --ロールバック
            rollback;
            --//業務終了のメッセージ
            --異常処理終了したことを通知
            lvc2Comment := '月次処理対象年月：[ '|| pvc2MonthlyDate ||' ]';
            lvc2Comment2 := '月次処理制御ﾃｰﾌﾞﾙ読込に失敗しました。';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0447)' || LOGMSG_END_PGNM_MonthlyProc  || LOGMSG_ERR ||'：'|| lvc2Comment|| lvc2Comment2); --A
            --トレースログ（end）
            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
            commit;
            /* LogFile の CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
    when excERR_CALLPROC then        --//月末在庫作成処理失敗
--DBMS_OUTPUT.PUT_LINE('excSysFinalMonthlyProcCtrl');
            --ロールバック
            rollback;
            IF vc2ErrCode IS NOT NULL THEN 
            lvc2Comment := '月次処理対象年月：[ '|| pvc2MonthlyDate ||' ]';
	    LBlnRet := 	FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId, pvc2BusinessName,
						  pvc2PlantCd, MY_SQL_NAME, vc2ErrCode,
						  lvc2Comment);
            END IF;
            --//業務終了のメッセージ
            --異常処理終了したことを通知
            lvc2Comment := '月次処理対象年月：[ '|| pvc2MonthlyDate ||' ]';
            lvc2Comment2 := '月末在庫作成処理に失敗しました。';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                 '(SBM1298)' || LOGMSG_END_PGNM_MonthlyProc  || LOGMSG_ERR ||'：'|| lvc2Comment|| lvc2Comment2); --A
            --トレースログ（end）
            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
            commit;
            /* LogFile の CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
    WHEN OTHERS THEN   --その他のエラー
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
            --ロールバック
            rollback;
            --//業務終了のメッセージ
            --異常処理終了したことを通知
            lvc2Comment := '月次処理対象年月：[ '|| pvc2MonthlyDate ||' ]';
            lvc2Comment2 := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),1,256);
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0448)' || LOGMSG_END_PGNM_MonthlyProc || LOGMSG_ERR ||'：'|| lvc2Comment ||  lvc2Comment2); --A
            /* TraceLog の出力（実行位置） */
            LblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, METHOD_END || vc2RunChkComment); --A
            --トレースログ（end）
            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A
            commit;
            /* LogFile の CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
end;
/
