create or replace procedure SQLDELETEHISTORYBYTRIGGER(
/*------------------------------------------------------------------------------
' $Id: SqlDeleteHistoryByTrigger.sql,v 1.4 2011/12/23 03:19:48 feng-yi Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2008/08/12新規作成
'
' 機能      : 削除処理
'
' 引き数    : pvc2LogMode           - (i)ＬＯＧモード
'             pvc2OutputMode        - (i)出力モード
'             pvc2OutputPath        - (i)出力ファイルパス
'             pvc2OutputName        - (i)出力ファイル名
'             pvc2UserId            - (i)ユーザＩＤ
'             pvc2BusinessName      - (i)業務名
'             pvc2PlantCd          - (i)工場コード
'             pvcDeleteProcExecDate - (i)削除処理基準年月
'
' 機能説明  : 設定した保持期間外の履歴ﾃﾞｰﾀの削除を行う。
' 備考      :
'
------------------------------------------------------------------------------*/

--< プロシージャ名定義 >-----------------------------------------------------
     pvc2LogMode            IN  VARCHAR2    --// ＬＯＧモード
    ,pvc2OutputMode         IN  VARCHAR2    --// 出力モード
    ,pvc2OutputPath         IN  VARCHAR2    --// 出力ファイルパス
    ,pvc2OutputName         IN  VARCHAR2    --// 出力ファイル名
    ,pvc2UserId               IN   VARCHAR2    --// ユーザ名
    ,pvc2BusinessName       IN  VARCHAR2    --// 業務名
    ,pvc2PlantCd              IN  VARCHAR2    --工場コード
    ,pvcDeleteProcExecDate  IN  VARCHAR2    --// 削除処理基準年月
    ) IS

    --// レコードの定義

    /* 定数の宣言 */
        METHOD_START                    VARCHAR2(20)  := 'Start';            --ログ用メソッド開始宣言
        METHOD_END                      VARCHAR2(12)  := 'End';              --ログ用メソッド終了宣言
        MY_SQL_NAME                     VARCHAR2(52) := 'SqlDeleteHistoryByTrigger';    --ＰＬ／ＳＱＬ名
        LOGMSG_START_PGNM_DeleteProc    VARCHAR2(160) := '<< 自動履歴削除処理開始 >>';
        LOGMSG_END_PGNM_DeleteProc      VARCHAR2(160) := '<< 自動履歴削除処理終了 >>';
        LOGMSG_ERR                      VARCHAR2(32) := '異常終了';

        APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';  --バッチ処理を開始しました  --A
        APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';  --バッチ処理を終了しました  --A
        APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'AK53401';  --oracleエラー --A
        EXCHISTORY_PERIOD_NULL          EXCEPTION;  --取得保持期間の値がNULL
        EXCHISTORY_PERIOD_EXC          EXCEPTION;  --取得保持期間が0-100の整数ではない


    --// 変数の定義
        UTL_FileHandle                  UTL_FILE.FILE_TYPE; --ファイルハンドル
        vc2Sql                      VARCHAR2(4096); --動的ＳＱＬ用
        lintdeleteHsCur              INTEGER;        --カーソルＩＤ
        lintRet      INTEGER;              --関数戻り値
        lvc2HsTable                 VARCHAR2(40);   --履歴
        lvc2APPRID                  VARCHAR2(100);   --承認ID
        lvc2DeletePeriod                 VARCHAR2(1024);   --保持期間
        lnumDeleteDate         NUMBER(6);   ---削除処理基準年月の月数
        lvc2HistoryPeriod                 VARCHAR2(40);   --履歴保持期間
        lvc2LastLineDate                  VARCHAR2(40);   --最終更新日
        ldtmBusinessdate                DATE;           --業務日付取得用
        lvc2WkDateTime                  VARCHAR2(76);   --日付編集用
        lblnRet                         boolean;        --共通関数の戻値
        lvc2Comment                     VARCHAR2(1024);  --コメント作成用
        lvc2Comment2                    VARCHAR2(1024);  --コメント作成用
        vc2RunChkComment                VARCHAR2(1024);  --実行位置確認用コメント作成作業領域

    --// カーソルの宣言

    --// 履歴ﾃｰﾌﾞﾙの読込
    cursor cur_Hs_List (
        c_TALBE_NAME      VARCHAR2
        )is
        select   *
        from   user_tables
        where table_name  like c_TALBE_NAME ESCAPE '\' ;

        ltyp_Hs_List  cur_Hs_List%ROWTYPE;     --履歴ﾃｰﾌﾞﾙの読込
        
     --// マスタ承認依頼テーブルの読込
     CURSOR curMST_APPR(
      ctypYearMonth      VARCHAR2
     )IS
     SELECT * FROM MST_APPR
     WHERE APPR_DATE < TO_DATE(ctypYearMonth,'YYYY/MM/DD');
     
     recMST_APPR curMST_APPR%ROWTYPE;         --マスタ承認依頼テーブルの読込

     --/* 内部関数 */
     /*------------------------------------------------------------------------------
     ' numChk
     ' SubFncDateFormatChk
'
     ' 機能      : numチェック
     ' 引き数    : pvc2ChkNum     - (i)チェック対象')
     ' 戻り値    : BOOLEAN           TRUE  = 正常
     '                               FALSE = 異常
     ' 機能説明  : チェック対象のフォーマットと内容の成否チェックを行う。
     ' 備考      : 特になし
     ------------------------------------------------------------------------------*/


     FUNCTION  numChk(
         pvc2ChkNum         IN  VARCHAR2  --入力対象
           ) RETURN BOOLEAN IS
               BEGIN
                  select  to_number(pvc2ChkNum) into lvc2DeletePeriod from dual;
                       IF lvc2DeletePeriod < 0 OR  lvc2DeletePeriod > 100 THEN
                        RETURN FALSE;
                        END IF;
                       RETURN TRUE;
                 EXCEPTION
                    WHEN OTHERS THEN
                        RETURN FALSE;
                END numChk;



--<メイン処理 >-----------------------------------------------------
begin

vc2RunChkComment := NULL;

    /* LogFile の OPEN */

       lblnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName , pvc2PlantCd,pvc2OutputMode, UTL_FileHandle); --A

    --//TraceLogの出力(Start)処理を行う

        lblnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName, pvc2PlantCd,MY_SQL_NAME,METHOD_START); --A

    --//業務開始のメッセージ取得

    lvc2Comment := '削除処理基準年月：[ '|| pvcDeleteProcExecDate ||' ]';--A
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0369)' || LOGMSG_START_PGNM_DeleteProc || lvc2Comment); --A

        commit;

/***********************
*    最終更新日 の算出    *
************************/
     --deleteperiod  varchar2(30);
     -- lvc2DeletePeriod    sys_parameter.value%type;
       begin
        select    sys_parameter.value   into  lvc2DeletePeriod  from     sys_parameter
         where    sys_parameter.name = 'HISTORY_BY_TRIGGER_PERIOD';

            /**************************************************
            *取得した保持期間nullであるｴﾗｰﾒｯｾｰｼﾞを出力する*
            **************************************************/
               if  lvc2DeletePeriod is null  then
                RAISE EXCHISTORY_PERIOD_NULL;
               end if;
               if (numChk(lvc2DeletePeriod) = false) then
                RAISE EXCHISTORY_PERIOD_EXC;
               end if;
            --最終更新日 の計算
           lvc2LastLineDate :=
                  to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-lvc2DeletePeriod),'yyyy/mm/dd') ;

               EXCEPTION
                  WHEN NO_DATA_FOUND THEN
                       RAISE EXCHISTORY_PERIOD_NULL;
                  WHEN OTHERS THEN
                       RAISE;
         end ;
  /****************************************************************
  *                         削除処理                              *
  *****************************************************************/

        open cur_Hs_List ('HS\_%');
        loop
              fetch  cur_Hs_List  into ltyp_Hs_List;
              exit  when  cur_Hs_List%notfound;

             --履歴ﾃｰﾌﾞﾙデータの削除
              lvc2HsTable := ltyp_Hs_List.table_name;

              lintdeleteHsCur := DBMS_SQL.OPEN_CURSOR;
              vc2Sql := 'delete from ';
              vc2Sql := vc2Sql || lvc2HsTable;
              vc2Sql := vc2Sql || '  where ';
              vc2Sql := vc2Sql || lvc2HsTable|| '.UPDATED_DATE < to_date(''' || lvc2LastLineDate || ''',''yyyy/mm/dd'')';

             -- DBMS_OUTPUT.PUT_LINE(vc2Sql);
               -- ＳＱＬ文解析
               DBMS_SQL.PARSE(lintdeleteHsCur,vc2Sql,DBMS_SQL.NATIVE);
               lintRet := DBMS_SQL.EXECUTE(lintdeleteHsCur);

        end loop;
        close  cur_Hs_List;
        
        
        OPEN curMST_APPR(lvc2LastLineDate);
        LOOP
            FETCH curMST_APPR INTO recMST_APPR;
            EXIT WHEN curMST_APPR%NOTFOUND;
            
            lvc2APPRID := recMST_APPR.Appr_Id;
            
            -- 承認小明細データ削除
            DELETE FROM MST_APPR_DETAIL_LIST 
            WHERE MST_APPR_DETAIL_LIST.APPR_ID = lvc2APPRID;
            
            -- 承認明細データ削除
            DELETE FROM MST_APPR_DETAIL
            WHERE MST_APPR_DETAIL.APPR_ID = lvc2APPRID;
            
            -- 承認キー対応表データ削除
            DELETE FROM MST_APPR_KEY
            WHERE MST_APPR_KEY.APPR_ID = lvc2APPRID;
            
            -- マスタ承認データ削除
            DELETE FROM MST_APPR
            WHERE MST_APPR.APPR_ID = lvc2APPRID;
        
        END LOOP;
        
        CLOSE curMST_APPR;
        
       
--//業務終了のメッセージ

    lvc2Comment := '削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';

    lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0370)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment); --A


    commit;


--//TraceLogの出力処理を行う

    lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

    /* LogFile の CLOSE */
    lblnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));


--< 例外処理 >---------------------------------------------------------------
exception

WHEN EXCHISTORY_PERIOD_NULL THEN   --取得保持期間がNULL
            rollback;
            --//業務終了のメッセージ
            lvc2Comment := '削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := 'DBトリガー自動履歴保持期間が取得できませんでした。';
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0371)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '：' || lvc2Comment2);
            --トレースログ（end）

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

            commit;
            /* LogFile の CLOSE */
            lblnRet := FncLogClose(UTL_FileHandle);

WHEN EXCHISTORY_PERIOD_EXC THEN   --取得保持期間が0-100の整数ではない
            rollback;
            --//業務終了のメッセージ
            lvc2Comment := '削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := 'DBトリガー自動履歴保持期間は0から100までの整数がでなありません。';
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0372)' ||  LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '：' || lvc2Comment2);
            --トレースログ（end）

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

            commit;
            /* LogFile の CLOSE */
            lblnRet := FncLogClose(UTL_FileHandle);

WHEN OTHERS THEN   --その他のエラー
            rollback;
            lvc2Comment := '削除処理基準年月：[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),1,256);
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_ORACLE_ERR,
                                 lvc2Comment2);
            lblnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,pvc2PlantCd,
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0373)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment || LOGMSG_ERR);
            /* TraceLog の出力（実行位置） */

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, METHOD_END || vc2RunChkComment);
            --トレースログ（end）

            lblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

            commit;
            /* LogFile の CLOSE */
            lblnRet := FncLogClose(UTL_FileHandle);
end;
/
