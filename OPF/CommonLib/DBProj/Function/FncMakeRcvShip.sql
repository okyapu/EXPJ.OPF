CREATE OR REPLACE FUNCTION  FNCMAKERCVSHIP(
/*------------------------------------------------------------------------------
' $Id: FncMakeRcvShip.sql,v 1.4 2013/04/12 05:23:10 tai-yanhong Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2003.11.05 DBMS_OUTPUTのコメントアウト
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBを4倍）
'
' 機能      : [入出荷]レコード項目設定,追加，出荷処理
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle               - (i)ファイルハンドル
'             pvc2LogMode               - (i)ＬＯＧモード
'             pvc2OutputMode            - (i)出力モード
'             pvc2UserId                - (i)ユーザＩＤ
'             pvc2BusinessName          - (i)業務名
--              pvc2PlantCd             (i)工場コード
'             pvc2CompanyCd             - (i)会社コード
'             pnumSlipTyp               - (i)伝票種類
'             pvc2SlipCtrlGrp           - (i)伝票管理グループ
'             pvc2SlipCd                - (i)伝票番号
'             pdtmSlipDate              - (i)伝票日付
'             pnumLineNo                - (i)行
'             pvc2ItemCd                - (i)品目番号
'             pvc2WhCd                  - (i)保管区コード
'             pnumOdNo                  - (i)オーダデマンド番号
'             pnumRcvShipQty            - (i)入出荷数
'             pdtmScdlShipDate          - (i)出荷予定日
'             pvc2JobOdrCd              - (i)製番
'             pnumJobOdrDetailNo        - (i)製番枝番
'             pnumCnt_ITEM_STOCK        - (io)［保管区別品目在庫］更新件数
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)［保管区別製番在庫］更新件数
'
' 機能説明  : FncShipForMrp,FncShipForJobOdr から使用する
'
' 備考      :
'
------------------------------------------------------------------------------*/
        pFileHandle                 IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
       ,pvc2LogMode                 IN  VARCHAR2            --ＬＯＧモード
       ,pvc2OutputMode              IN  VARCHAR2            --出力モード
       ,pvc2UserId                  IN  VARCHAR2            --ユーザＩＤ
       ,pvc2BusinessName            IN  VARCHAR2            --業務名
       ,pvc2PlantCd             IN  VARCHAR2              --// 工場コード
       ,pvc2CompanyCd               IN  VARCHAR2            --会社コード
       ,pnumSlipTyp                 IN  NUMBER              --伝票種類
       ,pvc2SlipCtrlGrp             IN  VARCHAR2            --伝票管理グループ
       ,pvc2SlipCd                  IN  VARCHAR2            --伝票番号
       ,pdtmSlipDate                IN  DATE                --伝票日付
       ,pnumLineNo                  IN  NUMBER              --行
       ,pvc2ItemCd                  IN  VARCHAR2            --品目番号
       ,pvc2WhCd                    IN  VARCHAR2            --保管区コード
       ,pnumOdNo                    IN  NUMBER              --オーダデマンド番号
       ,pnumRcvShipQty              IN  NUMBER              --入出荷数
       ,pdtmScdlShipDate            IN  DATE                --出荷予定日
       ,pvc2JobOdrCd                IN  VARCHAR2            --製番
       ,pnumJobOdrDetailNo          IN  NUMBER              --製番枝番
       ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER          --［保管区別品目在庫］更新件数
       ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER          --［保管区別製番在庫］更新件数
)RETURN BOOLEAN
IS
    -- 例外の宣言 
    excGetNewIssueCd                    EXCEPTION;          --入出庫管理番号取得エラー

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(56)    := 'FncMakeRcvShip';
    MRPFLAG_TARGET          NUMBER          := 1;   --保管区-MRP対象フラグ(1:MRP対象)
    RCV_ISSUE_TYP_OUT       NUMBER          := 2;   --保管区別入出庫-入出庫区分(2:出庫)
    RCV_ISSUE_GNR_TYP_SHIP  NUMBER          := 31;  --保管区別入出庫-入出庫発生区分(31:出荷)
    RCV_ISSUE_STOCK_UPD_COMPLTED  NUMBER    := 2;   --保管区別入出庫-在庫更新区分(2:更新済み)
    RCV_ISSUE_CMPLT_FLG_COMPLTED  NUMBER    := 1;   --保管区別入出庫-入出庫完了フラグ(1:完了)

    -- 変数の宣言 
    blnRet                  BOOLEAN;        --関数戻り値
    intRet                  INTEGER;        --関数戻り値
    vc2Comment              VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    vc2RcvIssueCtrlCd       VARCHAR2(100);   --入出庫管理番号

-- MESSAGE の宣言 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --ＯＲＡＣＬＥエラー
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --その他エラー
    APS_NOTEXIST_RCV_ISSUE_CTRL         VARCHAR2(28)     := 'AK50558';    --入出庫番号採番データが存在しません

-- LOG の宣言 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    COMMENT_MSGLOG_END                  VARCHAR2(192)  := '<< [入出荷]レコード項目設定,追加，出荷処理 >>';

    -- 変数の宣言 
BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

vc2RunChkComment := NULL;

    -- 入出庫管理番号取得 
    blnRet := fncGetNewIssueCd(pFileHandle
                              ,pvc2LogMode
                              ,pvc2OutputMode
                              ,pvc2UserId
                              ,pvc2BusinessName
                ,pvc2PlantCd
                              ,vc2RcvIssueCtrlCd
                              );
    IF blnRet = FALSE THEN
        RAISE excGetNewIssueCd;
    END IF;

--mhase

    -- 保管区別入出庫作成

    INSERT INTO T_RCV_ISSUE (
                             RCV_ISSUE_CTRL_CD
                            ,RCV_ISSUE_TYP
                            ,ITEM_CD
                            ,PLANT_CD   
                            ,WH_CD
                            ,JOB_ODR_CD
                            ,JOB_ODR_DETAIL_NO
                            ,PUCH_ODR_CD
                            ,ACPT_NO
                            ,ACPT_RSLT_CRCT_NO
                            ,INSPEC_RSLT_CRCT_NO
                            ,WORK_ODR_CD
                            ,WORK_IN_PROC_CD
                            ,PARTIAL_PRD_NO
                            ,OPR_RSLT_CRCT_NO
                            ,ISSUE_INST_CD
                            ,RCV_ISSUE_QTY
                            ,RCV_ISSUE_AMOUNT
                            ,RCV_ISSUE_DATE
                            ,RCV_ISSUE_GNR_TYP
                            ,RCV_ISSUE_ODD_QTY
                            ,DEFECT_CAUSE_CD
                            ,STOCK_UPD_TYP
                            ,RCV_ISSUE_CMPLT_FLG
                            ,OD_NO
                            ,COMPANY_CD
                            ,CREATED_DATE
                            ,CREATED_BY
                            ,CREATED_PRG_NM
                            ,UPDATED_DATE
                            ,UPDATED_BY
                            ,UPDATED_PRG_NM
                            ,MODIFY_COUNT   
                            ) VALUES (
                             vc2RcvIssueCtrlCd      --入出庫管理番号**
                            ,RCV_ISSUE_TYP_OUT      --入出庫区分**
                            ,pvc2ItemCd             --品目番号**
                            ,pvc2PlantCd
                            ,pvc2WhCd               --保管区コード
                            ,pvc2JobOdrCd           --製番
                            ,pnumJobOdrDetailNo     --製番枝番**
                            ,NULL                   --発注番号
                            ,0                      --受入回数**
                            ,0                      --受入実績訂正回数**
                            ,0                      --検査実績訂正回数**
                            ,NULL                   --作業計画番号
                            ,NULL                   --仕掛作業コード
                            ,0                      --分作回数**
                            ,0                      --作業実績訂正回数**
                            ,NULL                   --出庫指示番号
                            ,pnumRcvShipQty         --入出庫数**
                            ,0                      --入出庫金額**
                            ,pdtmScdlShipDate       --入出庫年月日**
                            ,RCV_ISSUE_GNR_TYP_SHIP --入出庫発生区分*
                            ,0                      --入出庫端数**
                            ,NULL                   --入出庫不良理由コード
                            ,RCV_ISSUE_STOCK_UPD_COMPLTED --在庫更新区分**
                            ,RCV_ISSUE_CMPLT_FLG_COMPLTED --入出庫完了フラグ**
                            ,pnumOdNo               --オーダデマンド番号
                            ,pvc2CompanyCd          --会社コード
                            ,SYSDATE                --ｓｙｓ作成日時
                            ,pvc2UserId             --ｓｙｓ作成者コード
                            ,MY_SQL_NAME    
                            ,SYSDATE                --ｓｙｓ最新更新日時
                            ,pvc2UserId             --ｓｙｓ最新更新者コード
                            ,MY_SQL_NAME
                            ,0
                            );

    -- 出荷管理制御作成

    INSERT INTO SYS_SHIP_CTRL(
                             COMPANY_CD
                            ,SLIP_TYP
                            ,SLIP_CTRL_GRP
                            ,SLIP_CD
                            ,SLIP_DATE
                            ,LINE_NO
                            ,RCV_ISSUE_CTRL_CD
                            ,RESERVE_CHAR
                            ,RESERVE_NUM
                            ,CREATED_DATE
                            ,CREATED_BY
                ,CREATED_PRG_NM 
                            ,UPDATED_DATE
                            ,UPDATED_BY
                ,UPDATED_PRG_NM
                    ,MODIFY_COUNT
                            ) VALUES (
                             pvc2CompanyCd          --会社コード
                            ,pnumSlipTyp            --伝票種類
                            ,pvc2SlipCtrlGrp        --伝票管理グループ
                            ,pvc2SlipCd             --伝票番号
                            ,pdtmSlipDate           --伝票日付
                            ,pnumLineNo             --行
                            ,vc2RcvIssueCtrlCd      --入出庫管理番号
                            ,NULL                   --予備（文字）
                            ,0                      --予備（数値）
                            ,SYSDATE                --ｓｙｓ作成日時
                            ,pvc2UserId             --ｓｙｓ作成者コード
                ,MY_SQL_NAME
                            ,SYSDATE                --ｓｙｓ最新更新日時
                            ,pvc2UserId             --ｓｙｓ最新更新者コード
                ,MY_SQL_NAME
                            ,0
                            );
    -- 出荷処理

    blnRet := FncShip(pFileHandle
                     ,pvc2LogMode
                     ,pvc2OutputMode
                     ,pvc2UserId
                     ,pvc2BusinessName
            ,pvc2PlantCd
                     ,vc2RcvIssueCtrlCd
                     ,pnumCnt_ITEM_STOCK
                     ,pnumCnt_JOB_ODR_CD_STOCK
                     );
    IF blnRet = FALSE THEN
vc2RunChkComment := 'FncShip NG';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        RETURN FALSE;
    END IF;

vc2RunChkComment := 'FncShip OK';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    RETURN TRUE;

EXCEPTION

    WHEN excGetNewIssueCd THEN  --入出庫管理番号取得エラー
--DBMS_OUTPUT.PUT_LINE('入出庫管理番号取得エラー');
        ROLLBACK;
        vc2Comment := '';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_NOTEXIST_RCV_ISSUE_CTRL, vc2Comment);
        -- TraceLog の出力 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('その他エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0048)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        /* TraceLog の出力（実行位置） */
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
