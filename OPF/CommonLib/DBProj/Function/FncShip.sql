CREATE OR REPLACE FUNCTION FNCSHIP(
/*------------------------------------------------------------------------------
' $Id: FncShip.sql,v 1.4 2013/06/03 07:31:11 tai-yanhong Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2003.11.05 DBMS_OUTPUTのコメントアウト
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
'
' 機能      : 出荷処理または出荷取消処理
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle               - (i) ファイルハンドル
'             pvc2LogMode               - (i) ＬＯＧモード
'             pvc2OutputMode            - (i) 出力モード
'             pvc2UserId                - (i) ユーザＩＤ
'             pvc2BusinessName          - (i) 業務名
'             pvc2PlantCd               - (i)工場コード
'             pvc2RcvIssueCtrlCd        - (i) 入出庫管理番号
'             pnumCnt_ITEM_STOCK        - (io)［保管区別品目在庫］更新件数
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)［保管区別製番在庫］更新件数
'
' 機能説明  : FncShipReq（在庫出庫処理）から使用する
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                 IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2            --出力モード
   ,pvc2UserId                  IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード        
   ,pvc2RcvIssueCtrlCd          IN  VARCHAR2            --入出庫管理番号
   ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER          --［保管区別品目在庫］更新件数
   ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER          --［保管区別製番在庫］更新件数
)RETURN BOOLEAN
IS
    -- 例外の宣言 
    excErr                              EXCEPTION;          --エラー

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(28)     := 'FncShip';
    RCV_ISSUE_TYP_OUT       NUMBER          := 2;   --保管区別入出庫-入出庫区分(2:出庫)
    RCV_ISSUE_GNR_TYP_SHIP  NUMBER          := 31;  --保管区別入出庫-入出庫発生区分(31:出荷)
    RCV_ISSUE_GNR_TYP_CANSHIP NUMBER        := 39;  --保管区別入出庫-入出庫発生区分(39:出荷取消)
    JOB_ODR_ALC_STOCKTYP_JOBORDR NUMBER     := 2;   --製番引当-引当在庫区分(2:製番在庫)
    JOB_ODR_ALC_STOCKTYP_ITEM NUMBER        := 1;   --製番引当-引当在庫区分(1:在庫(余剰から))

    -- 変数の宣言 
    blnRet                  BOOLEAN;        --関数戻り値
    intRet                  INTEGER;        --関数戻り値
    vc2Comment              VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域    
    numMessageNo            NUMBER(5);      --メッセージ番号
    numRcvIssueTyp          NUMBER(2);      --入出庫区分
    vc2ItemCd               VARCHAR2(100);   --品目番号
    vc2WhCd                 VARCHAR2(100);   --保管区コード
    vc2JobOdrCd             VARCHAR2(100);   --製番
    numJobOdrDetailNo       NUMBER(6);      --製番枝番
    numRcvIssueQty          NUMBER(18,4);   --入出庫数
    numRcvIssueGnrTyp       NUMBER(2);      --入出庫発生区分
    numOdNo                 NUMBER(14);     --オーダデマンド番号
    dtmBusinessOprDate      DATE;           --業務運用日
    dtmRcvIssueDate         DATE;           --入出庫年月日

-- MESSAGE の宣言 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --ＯＲＡＣＬＥエラー
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --その他エラー
    APS_COM_NOTEXIST_T_RCV_ISSUE        VARCHAR2(28)     := 'AK50594';    --保管区別入出庫データが存在しません
    APS_CEISSUE_INVALID_RCVISSTYP       VARCHAR2(28)     := 'AK52141';    --入出庫区分が不正です
    APS_CEISSUE_INVALID_RCVISSQTY       VARCHAR2(28)     := 'AK52146';    --入出庫数が負数になっていません
    APS_CECANCEL_INVALID_RCVISSQTY      VARCHAR2(28)     := 'AK52053';    --入出庫数が正数になっていません
    APS_CEISSUE_INV_RCVISSGNRTYP        VARCHAR2(28)     := 'AK52142';    --入出庫発生区分が不正です
    APS_COM_NOTEXIST_SYS_DATE_CTRL      VARCHAR2(28)     := 'AK50537';    --日付制御データが存在しません
    APS_INVALID_ITEM_STOCK              VARCHAR2(28)     := 'AK52026';    --出庫可能数算出処理で検索したはずの保管区別品目在庫データが存在していません
    APS_COM_NOTEXIST_T_OD               VARCHAR2(28)     := 'AK50585';    --所要量データが存在しません

-- LOG の宣言 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    COMMENT_MSGLOG_END                  VARCHAR2(56)  := '<< 出荷処理 >>';

    -- 出荷処理用 所要量（製番在庫）
    FUNCTION FncShipIOd RETURN BOOLEAN IS
    
        numOdrQty                       NUMBER(18,4);
        numTotalIssueQty                NUMBER(18,4);
        dtmIssueCmpltDate               DATE;
        
    BEGIN
    
        -- 業務運用日取得
        BEGIN
            SELECT  BUSINESS_OPR_DATE INTO dtmBusinessOprDate
              FROM  SYS_DATE_CTRL
        WHERE PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                numMessageNo := APS_COM_NOTEXIST_SYS_DATE_CTRL;
                RAISE excErr;
            WHEN OTHERS THEN
                RAISE;
        END;
    
        BEGIN
    
            SELECT ODR_QTY,TOTAL_ISSUE_QTY INTO numOdrQty,numTotalIssueQty
                FROM  T_OD
                WHERE OD_NO = numOdNo
                      AND PLANT_CD = pvc2PlantCd
                FOR UPDATE;
    
            numTotalIssueQty := numTotalIssueQty - numRcvIssueQty;
            IF numOdrQty <= numTotalIssueQty THEN
                dtmIssueCmpltDate := dtmRcvIssueDate;       --保管区別入出庫.入出庫年月日
            ELSE
                dtmIssueCmpltDate := NULL;
            END IF;
        
            UPDATE T_OD SET
                -- 出庫累計数＝出庫累計数＋（－（出庫数量））
                TOTAL_ISSUE_QTY = numTotalIssueQty
               ,TOTAL_ISSUE_INST_QTY = numTotalIssueQty  --ＶＢのソースは出庫累計をそのまま設定している
               ,ISSUE_CMPLT_DATE = dtmIssueCmpltDate
                WHERE  OD_NO = numOdNo
        AND PLANT_CD = pvc2PlantCd;
        EXCEPTION
            WHEN NO_DATA_FOUND THEN
                numMessageNo := APS_COM_NOTEXIST_T_OD;
                RAISE excErr;
            WHEN OTHERS THEN
                RAISE;
        END;
    
        RETURN TRUE;
    EXCEPTION
    
        WHEN excErr THEN  --エラー
            ROLLBACK;
            vc2Comment := '';
            -- エラーメッセージの出力
            blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                MY_SQL_NAME, numMessageNo, vc2Comment);
            -- TraceLog の出力 
            blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, LOGMSG_END);
            COMMIT;
            RETURN FALSE;
    
        WHEN OTHERS THEN
            ROLLBACK;
            vc2Comment := SUBSTRB('(SBM0055)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '：' ||
                                 SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                                 1,1024);
            -- エラーメッセージの出力
            blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
            -- TraceLog の出力（実行位置）
            blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
            -- TraceLog の出力 
            blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, LOGMSG_END);
            COMMIT;
            RETURN FALSE;
    END;

BEGIN

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- TraceLog の出力 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- 保管区別入出庫レコードチェック処理

    -- 保管区別入出庫検索
    BEGIN
        SELECT  RCV_ISSUE_TYP       --入出庫区分
               ,ITEM_CD             --品目番号
               ,WH_CD               --保管区コード
               ,JOB_ODR_CD          --製番
               ,JOB_ODR_DETAIL_NO   --製番枝番
               ,RCV_ISSUE_QTY       --入出庫数
               ,RCV_ISSUE_GNR_TYP   --入出庫発生区分
               ,OD_NO               --オーダデマンド番号
               ,RCV_ISSUE_DATE      --入出庫年月日
                INTO
                numRcvIssueTyp
               ,vc2ItemCd
               ,vc2WhCd
               ,vc2JobOdrCd
               ,numJobOdrDetailNo
               ,numRcvIssueQty
               ,numRcvIssueGnrTyp
               ,numOdNo
               ,dtmRcvIssueDate
          FROM  T_RCV_ISSUE
          WHERE RCV_ISSUE_CTRL_CD = pvc2RcvIssueCtrlCd
      AND PLANT_CD = pvc2PlantCd;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN  --該当無し
            numMessageNo := APS_COM_NOTEXIST_T_RCV_ISSUE;
            RAISE excErr;
        WHEN OTHERS THEN
            RAISE;
    END;

    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, 'pvc2RcvIssueCtrlCd' || pvc2RcvIssueCtrlCd);


--dbms_output.put_line('入出庫区分　　　　：' || numrcvissuetyp);
--dbms_output.put_line('品目番号　　　　　：' || vc2itemcd);
--dbms_output.put_line('保管区　　　　　　：' || vc2whcd);
--dbms_output.put_line('製番　　　　　　　：' || vc2jobodrcd);
--dbms_output.put_line('製番枝番　　　　　：' || numjobodrdetailno);
--dbms_output.put_line('入出庫数　　　　　：' || numrcvissueqty);
--dbms_output.put_line('入出庫発生区分　　：' || numrcvissuegnrtyp);
--dbms_output.put_line('オーダデマンド番号：' || numodno);

--vc2RunChkComment := '●●●●通過 SHIP-01';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 入出庫区分のチェック
    IF numRcvIssueTyp <> RCV_ISSUE_TYP_OUT THEN
        -- 入出庫区分が不正です
        numMessageNo := APS_CEISSUE_INVALID_RCVISSTYP;
        RAISE excErr;
    END IF;

    -- 入出庫発生区分のチェック
    -- 入出庫発生区分（出荷処理 Or 出荷取消処理）以外エラー
    IF numRcvIssueGnrTyp = RCV_ISSUE_GNR_TYP_SHIP THEN
        -- 出荷処理の場合
--vc2RunChkComment := '●●●●通過 SHIP-02';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        -- 入出庫数が０より大きければエラーとする
        IF numRcvIssueQty > 0 THEN
--vc2RunChkComment := '●●●●通過 SHIP-03';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            -- 入出庫数が負数になっていません
            numMessageNo := APS_CEISSUE_INVALID_RCVISSQTY;
            RAISE excErr;
        END IF;

    ELSIF numRcvIssueGnrTyp = RCV_ISSUE_GNR_TYP_CANSHIP THEN
--vc2RunChkComment := '●●●●通過 SHIP-04';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        -- 出荷取消処理の場合
        -- 入出庫数が０未満であればエラーとする
        IF numRcvIssueQty < 0 THEN
--vc2RunChkComment := '●●●●通過 SHIP-05';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- 入出庫数が正数になっていません
            numMessageNo := APS_CECANCEL_INVALID_RCVISSQTY;
            RAISE excErr;
        END IF;

    ELSE
--vc2RunChkComment := '●●●●通過 SHIP-06';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        -- 出荷処理、出荷取消処理以外の場合
        -- 入出庫発生区分が不正です
        numMessageNo := APS_CEISSUE_INV_RCVISSGNRTYP;
        RAISE excErr;

    END IF;

    -- 入出庫発生区分判定
    IF numRcvIssueQty > 0 THEN
--vc2RunChkComment := '●●●●通過 SHIP-07';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- [保管区別入出庫].製番 ＝ Null の場合

            -- 保管区別品目在庫更新
            UPDATE T_ITEM_STOCK SET
                STOCK_ON_HAND_QTY = STOCK_ON_HAND_QTY + numRcvIssueQty
               ,UPDATED_DATE = SYSDATE
               ,UPDATED_BY = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1            
                WHERE  ITEM_CD = vc2ItemCd
                  AND  WH_CD = vc2WhCd
          AND  PLANT_CD = pvc2PlantCd;

            --［保管区別品目在庫］更新件数のインクリメント
            pnumCnt_ITEM_STOCK := pnumCnt_ITEM_STOCK + 1;

            IF SQL%NOTFOUND THEN
                -- ヒットしなかった場合

                -- 保管区別品目在庫追加
                INSERT INTO T_ITEM_STOCK (
                                          ITEM_CD
                                         ,WH_CD
                     ,PLANT_CD  
                                         ,STOCK_ON_HAND_QTY
                                         ,DEFECT_QTY
                                         ,PRVS_DAYEND_STOCK_QTY
                                         ,PRVS_MONTHEND_STOCK_QTY
                                         ,PRVS_TERMEND_STOCK_QTY
                                         ,CREATED_DATE
                                         ,CREATED_BY
                     ,CREATED_PRG_NM
                                         ,UPDATED_DATE
                                         ,UPDATED_BY
                     ,UPDATED_PRG_NM
                     ,MODIFY_COUNT
                                         ) VALUES (
                                          vc2ItemCd      --品目番号
                                         ,vc2WhCd        --保管区コード
                     ,pvc2PlantCd    --工場コード
                                         ,numRcvIssueQty --品目別手持在庫数
                                         ,0              --品目別不良数
                                         ,0              --品目別前日末在庫数
                                         ,0              --品目別前月末在庫数
                                         ,0              --品目別前期末在庫数
                                         ,SYSDATE        --ｓｙｓ作成日時
                                         ,pvc2UserId     --ｓｙｓ作成者コード
                     ,MY_SQL_NAME 
                                         ,SYSDATE        --ｓｙｓ最新更新日時
                                         ,pvc2UserId     --ｓｙｓ最新更新者コード
                     ,MY_SQL_NAME
                     ,0 
                                         );
    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0709)保管区別品目在庫追加/vc2ItemCd/vc2WhCd/numRcvIssueQty' ||
                          vc2ItemCd || '/' || vc2WhCd || '/' || numRcvIssueQty);
--vc2RunChkComment := '●●●●通過 SHIP-08';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);      
        
            END IF;

    ELSIF numRcvIssueQty < 0 THEN

--vc2RunChkComment := '●●●●通過 SHIP-09';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            -- [保管区別入出庫].製番 ＝ Null の場合

            -- 保管区別品目在庫更新
            UPDATE T_ITEM_STOCK SET
                STOCK_ON_HAND_QTY = STOCK_ON_HAND_QTY + numRcvIssueQty
               ,UPDATED_DATE = SYSDATE
               ,UPDATED_BY = pvc2UserId
        ,UPDATED_PRG_NM = MY_SQL_NAME
        ,MODIFY_COUNT = MODIFY_COUNT + 1    
                WHERE  ITEM_CD = vc2ItemCd
                  AND  WH_CD = vc2WhCd
          AND  PLANT_CD = pvc2PlantCd;
    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0710)保管区別品目在庫更新/vc2ItemCd/vc2WhCd/numRcvIssueQty' ||
                          vc2ItemCd || '/' || vc2WhCd || '/' || numRcvIssueQty);

            --［保管区別品目在庫］更新件数のインクリメント
            pnumCnt_ITEM_STOCK := pnumCnt_ITEM_STOCK + 1;

            IF SQL%NOTFOUND THEN
                -- ヒットしなかった場合

                -- 保管区別品目在庫追加
                INSERT INTO T_ITEM_STOCK (
                                          ITEM_CD
                                         ,WH_CD
                     ,PLANT_CD  
                                         ,STOCK_ON_HAND_QTY
                                         ,DEFECT_QTY
                                         ,PRVS_DAYEND_STOCK_QTY
                                         ,PRVS_MONTHEND_STOCK_QTY
                                         ,PRVS_TERMEND_STOCK_QTY
                                         ,CREATED_DATE
                                         ,CREATED_BY
                     ,CREATED_PRG_NM
                                         ,UPDATED_DATE
                                         ,UPDATED_BY
                     ,UPDATED_PRG_NM
                     ,MODIFY_COUNT
                                         ) VALUES (
                                          vc2ItemCd      --品目番号
                                         ,vc2WhCd        --保管区コード
                     ,pvc2PlantCd    --工場コード
                                         ,numRcvIssueQty --品目別手持在庫数
                                         ,0              --品目別不良数
                                         ,0              --品目別前日末在庫数
                                         ,0              --品目別前月末在庫数
                                         ,0              --品目別前期末在庫数
                                         ,SYSDATE        --ｓｙｓ作成日時
                                         ,pvc2UserId     --ｓｙｓ作成者コード
                     ,MY_SQL_NAME 
                                         ,SYSDATE        --ｓｙｓ最新更新日時
                                         ,pvc2UserId     --ｓｙｓ最新更新者コード
                     ,MY_SQL_NAME
                     ,0 
                                         );

--vc2RunChkComment := '●●●●通過 SHIP-10';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    --mhase
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, '(SBM0709)保管区別品目在庫追加/vc2ItemCd/vc2WhCd/numRcvIssueQty' ||
                          vc2ItemCd || '/' || vc2WhCd || '/' || numRcvIssueQty);

            END IF;

    END IF;

    -- TraceLog の出力 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;

EXCEPTION

    WHEN excErr THEN  --エラー
--DBMS_OUTPUT.PUT_LINE('エラー');
        ROLLBACK;
        vc2Comment := '';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, numMessageNo, vc2Comment);
        -- TraceLog の出力 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('その他エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0055)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        -- TraceLog の出力（実行位置）
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        -- TraceLog の出力 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;
END;
/
