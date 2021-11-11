CREATE OR REPLACE FUNCTION  FNCAUTOSHIP(
/*------------------------------------------------------------------------------
' $Id: FncAutoShip.sql,v 1.4 2013/04/12 05:23:10 tai-yanhong Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2003.11.04 DBMS_OUTPUTのコメントアウト
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 自動出荷処理
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle               - (i) ファイルハンドル
'             pvc2LogMode               - (i) ＬＯＧモード
'             pvc2OutputMode            - (i) 出力モード
'             pvc2UserId                - (i) ユーザＩＤ
'             pvc2BusinessName          - (i) 業務名
--              pvc2PlantCd             (i)工場コード
'             pvc2CompanyCd             - (i) 会社コード
'             pnumSlipTyp               - (i) 伝票種類
'             pvc2SlipCtrlGrp           - (i) 伝票管理グループ
'             pvc2SlipCd                - (i) 伝票番号
'             pdtmSlipDate              - (i) 伝票日付
'             pnumLineNo                - (i) 行
'             pvc2UpdOdrNo              - (i) 更新順序
'             pnumRcvIssueQty           - (i) 出荷数
'             pvc2ItemCd                - (i) 品目番号
'             pnumMrpOdrTyp             - (i) 品目手配区分
'             pnumOdNo                  - (i) オーダデマンド番号
'             pvc2ShipRsvCd             - (i) 出荷保留番号
'             pdtmShipDate              - (i) 出荷実績日
'             pnumCnt_SHIP_RSV          - (io)［出荷保留］追加件数
'             pnumCnt_ITEM_STOCK        - (io)［保管区別品目在庫］更新件数
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)［保管区別製番在庫］更新件数
'
' 機能説明  : 自動出荷処理
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN      UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                 IN      VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode              IN      VARCHAR2            --出力モード
   ,pvc2UserId                  IN      VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName            IN      VARCHAR2            --業務名
   ,pvc2PlantCd                 IN  VARCHAR2              --// 工場コード
   ,pvc2CompanyCd               IN      VARCHAR2            --会社コード
   ,pnumSlipTyp                 IN      NUMBER              --伝票種類
   ,pvc2SlipCtrlGrp             IN      VARCHAR2            --伝票管理グループ
   ,pvc2SlipCd                  IN      VARCHAR2            --伝票番号
   ,pdtmSlipDate                IN      DATE                --伝票日付
   ,pnumLineNo                  IN      NUMBER              --行
   ,pvc2UpdOdrNo                IN      VARCHAR2            --更新順序
   ,pnumRcvIssueQty             IN      NUMBER              --出荷数
   ,pvc2ItemCd                  IN      VARCHAR2            --品目番号
   ,pnumMrpOdrTyp               IN      NUMBER              --品目手配区分
   ,pnumOdNo                    IN      NUMBER              --オーダデマンド番号
   ,pvc2ShipRsvCd               IN      VARCHAR2            --出荷保留番号
   ,pdtmShipDate                IN      DATE                --出荷実績日
   ,pnumCnt_SHIP_RSV            IN OUT  NUMBER              --［出荷保留］追加件数
   ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER              --［保管区別品目在庫］更新件数
   ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER              --［保管区別製番在庫］更新件数
)RETURN BOOLEAN
IS
    -- 例外の宣言
    excNoShipRsv            EXCEPTION;          --出荷保留無し
    excQtyCalcMrp           EXCEPTION;          --ＭＲＰ出荷可能数判断エラー
    excQtyCalcJobOdr        EXCEPTION;          --製番出荷可能数判断エラー
    excReleaseShipRsv       EXCEPTION;          --出荷保留区分解除エラー
    excMakeShipRsv          EXCEPTION;          --出荷保留作成エラー
    excShipForMrp           EXCEPTION;          --ＭＲＰ出荷処理エラー
    excShipForJobOdr        EXCEPTION;          --製番出荷処理エラー
    excGetNewIssueCd        EXCEPTION;          --入出庫管理番号取得エラー
    excGetNewShipRsvCd      EXCEPTION;          --出荷保留番号取得エラー

    -- 定数の宣言
    MY_SQL_NAME                     VARCHAR2(48)    := 'FncAutoShip';
    ODR_TYP_CASE_ODR                NUMBER          := 1;   --品目-品目手配区分(1:個別手配品目)
    ODR_TYP_STOCK_ALOC_CASE_ODR     NUMBER          := 2;   --品目-品目手配区分(2:在庫引当型個別手配品目)
    ODR_TYP_STOCK_ALOC_MANUAL_ODR   NUMBER          := 3;   --品目-品目手配区分(3:在庫引当型マニュアル手配品目)
    ODR_TYP_MANUAL_ODR              NUMBER          := 4;   --品目-品目手配区分(4:マニュアル手配品目)
    ODR_TYP_LOT_ODR                 NUMBER          := 5;   --品目-品目手配区分(5:ロット手配品目)
    ODR_TYP_RATION_ODR              NUMBER          := 6;   --品目-品目手配区分(6:定量手配品目)
    ODR_TYP_ODR_POINT_ODR           NUMBER          := 7;   --品目-品目手配区分(7:発注点手配品目)
    ODR_TYP_ASSIMILATE              NUMBER          := 8;   --品目-品目手配区分(8:擬似品目)
    RCV_ISSUE_TYP_OUT               NUMBER          := 2;   --保管区別入出庫-入出庫区分(2:出庫)
    RCV_ISSUE_GNR_TYP_SHIP          NUMBER          := 31;  --保管区別入出庫-入出庫発生区分(31:出荷)
    RCV_ISSUE_STOCK_UPD_COMPLTED    NUMBER          := 2;   --保管区別入出庫-在庫更新区分(2:更新済み)
    RCV_ISSUE_CMPLT_FLG_COMPLTED    NUMBER          := 1;   --保管区別入出庫-入出庫完了フラグ(1:完了)
    SHIP_RSV_CANCEL_TYP_ERRORDATA   NUMBER          := 9;   --出荷保留-出荷保留解除区分(9:保留解除(不正データ))

    -- 変数の宣言
    blnRet                  BOOLEAN;        --関数戻り値
    intRet                  INTEGER;        --関数戻り値
    blnErrorDateTyp         BOOLEAN;        --エラーデータ区分（TRUE:異常，FALSE:正常）
    vc2Comment              VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    numCount                NUMBER(10);     --件数チェック用

    vc2NewRcvIssueCtrlCd    VARCHAR2(100);   --入出庫管理番号
    vc2NewShipRsvCd         VARCHAR2(100);   --出荷保留番号

    vc2CompanyCd            VARCHAR2(100);   --会社コード
    numSlipTyp              NUMBER(2);      --伝票種類
    vc2SlipCtrlGrp          VARCHAR2(100);   --伝票管理グループ
    vc2SlipCd               VARCHAR2(100);   --伝票番号
    dtmSlipDate             DATE;           --伝票日付
    numLineNo               NUMBER(6);      --行
    vc2UpdOdrNo             VARCHAR2(100);   --更新順序
    numRcvIssueQty          NUMBER(18,4);   --出荷数
    vc2ItemCd               VARCHAR2(100);   --品目番号
    numMrpOdrTyp            NUMBER(2);      --品目手配区分
    numOdNo                 NUMBER(14);     --オーダデマンド番号
    vc2ShipRsvCd            VARCHAR2(100);   --出荷保留番号
    dtmShipDate             DATE;           --出荷実績日
    vc2JobOdrCd             VARCHAR2(100);   --製番
    numJobOdrDetailNo       NUMBER(6);      --製番枝番
    blnRetQty               BOOLEAN;        --出荷可能数判断

    numJobOdrCdStock        NUMBER;         --製番在庫分出荷可能数
    numAlcableJobOdrStock   NUMBER;         --製番引当分出荷可能数
    numAlcableItemStock     NUMBER;         --在庫引当分出荷可能数
    numStockOnHandQty       NUMBER;         --保管区別品目在庫手持ち在庫数

-- MESSAGE の宣言
    APS_COM_NOTEXIST_ISSUE_CTRL_CD      VARCHAR2(28)     := 'AK50558';     --入出庫番号採番データが存在しません
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';     --ＯＲＡＣＬＥエラー
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';     --その他エラー
    APS_COM_NOTEXIST_T_OD               VARCHAR2(28)     := 'AK50585';     --所要量データが存在しません
    APS_COM_NOTEXIST_ISSUE_RSV_CD       VARCHAR2(28)     := 'AK50542';     --出庫保留番号採番データが存在しません

-- LOG の宣言
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    COMMENT_MSGLOG_SHIPEND              VARCHAR2(88)  := '<< 自動出荷処理終了 >>';


BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- 自動出荷処理用データ設定
    vc2CompanyCd   := pvc2CompanyCd;
    numSlipTyp     := pnumSlipTyp;
    vc2SlipCtrlGrp := pvc2SlipCtrlGrp;
    vc2SlipCd      := pvc2SlipCd;
    dtmSlipDate    := pdtmSlipDate;
    numLineNo      := pnumLineNo;
    vc2UpdOdrNo    := pvc2UpdOdrNo;
    numRcvIssueQty := pnumRcvIssueQty;
    vc2ItemCd      := pvc2ItemCd;
    numMrpOdrTyp   := pnumMrpOdrTyp;
    numOdNo        := pnumOdNo;
    vc2ShipRsvCd   := pvc2ShipRsvCd;
    dtmShipDate    := pdtmShipDate;



    -- 出荷数 = 0 and 出荷保留番号 IS NULL
    IF (numRcvIssueQty = 0) AND (vc2ShipRsvCd IS NULL) THEN

        -- 入出庫管理番号取得
        blnRet := FncGetNewIssueCd(pFileHandle
                                  ,pvc2LogMode
                                  ,pvc2OutputMode
                                  ,pvc2UserId
                                  ,pvc2BusinessName
                  ,pvc2PlantCd
                                  ,vc2NewRcvIssueCtrlCd
                                  );
        IF blnRet = FALSE THEN
            RAISE excGetNewIssueCd;
        END IF;
        -- 保管区別入出庫追加
        INSERT INTO T_RCV_ISSUE(
            RCV_ISSUE_CTRL_CD       --入出庫管理番号
           ,RCV_ISSUE_TYP           --入出庫区分
           ,ITEM_CD                 --品目番号
           ,PLANT_CD               --工場コード    
           ,WH_CD                   --保管区コード
           ,JOB_ODR_CD              --製番
           ,JOB_ODR_DETAIL_NO       --製番枝番
           ,PUCH_ODR_CD             --発注番号
           ,ACPT_NO                 --受入回数
           ,ACPT_RSLT_CRCT_NO       --受入実績訂正回数
           ,INSPEC_RSLT_CRCT_NO     --検査実績訂正回数
           ,WORK_ODR_CD             --作業計画番号
           ,WORK_IN_PROC_CD         --仕掛作業コード
           ,PARTIAL_PRD_NO          --分作回数
           ,OPR_RSLT_CRCT_NO        --作業実績訂正回数
           ,ISSUE_INST_CD           --出庫指示番号
           ,RCV_ISSUE_QTY           --入出庫数
           ,RCV_ISSUE_AMOUNT        --入出庫金額
           ,RCV_ISSUE_DATE          --入出庫年月
           ,RCV_ISSUE_GNR_TYP       --入出庫発生区分
           ,RCV_ISSUE_ODD_QTY       --入出庫端数
           ,DEFECT_CAUSE_CD         --入出庫不良理由コード
           ,STOCK_UPD_TYP           --在庫更新区分
           ,RCV_ISSUE_CMPLT_FLG     --入出庫完了フラグ
           ,OD_NO                   --オーダデマンド番号
           ,COMPANY_CD              --会社コード
           ,CREATED_DATE                --ｓｙｓ作成日時
           ,CREATED_BY                  --ｓｙｓ作成者コード
           ,CREATED_PRG_NM  
           ,UPDATED_DATE                --ｓｙｓ最新更新日時
           ,UPDATED_BY                  --ｓｙｓ最新更新者コード
           ,UPDATED_PRG_NM
       ,MODIFY_COUNT    
        ) VALUES (
            vc2NewRcvIssueCtrlCd            --入出庫管理番号
           ,RCV_ISSUE_TYP_OUT               --入出庫区分(2:出庫)
           ,vc2ItemCd                       --引数の品目番号
           ,pvc2PlantCd                     --工場コード
           ,NULL                            --保管区コード
           ,NULL                            --製番
           ,0                               --製番枝番
           ,NULL                            --発注番号
           ,0                               --受入回数
           ,0                               --受入実績訂正回数
           ,0                               --検査実績訂正回数
           ,NULL                            --作業計画番号
           ,NULL                            --仕掛作業コード
           ,0                               --分作回数
           ,0                               --作業実績訂正回数
           ,NULL                            --出庫指示番号
           ,0                               --入出庫数
           ,0                               --入出庫金額
           ,dtmShipDate                     --引数の出荷実績日
           ,RCV_ISSUE_GNR_TYP_SHIP          --入出庫発生区分(31:出荷)
           ,0                               --入出庫端数
           ,NULL                            --入出庫不良理由コード
           ,RCV_ISSUE_STOCK_UPD_COMPLTED    --在庫更新区分(2:更新済み)
           ,RCV_ISSUE_CMPLT_FLG_COMPLTED    --入出庫完了フラグ(1:完了)
           ,numOdNo                         --引数のオーダデマンド番号
           ,vc2CompanyCd                    --会社コード
           ,SYSDATE                         --ｓｙｓ作成日時
           ,pvc2UserId                      --ｓｙｓ作成者コード
           ,MY_SQL_NAME
           ,SYSDATE                         --ｓｙｓ最新更新日時
           ,pvc2UserId                      --ｓｙｓ最新更新者コード
           ,MY_SQL_NAME
           ,0
           );
    ELSE

        --エラーデータ区分 = 正常
        blnErrorDateTyp := FALSE;

        --エラーデータ区分 = 正常
        IF blnErrorDateTyp = FALSE THEN
    
            -- 品目手配区分判定
            IF numMrpOdrTyp >= ODR_TYP_MANUAL_ODR
              AND numMrpOdrTyp <= ODR_TYP_ODR_POINT_ODR THEN
                -- ＭＲＰ品目の場合
        
                -- 出荷可能数算出処理
                blnRet := FncShipQtyPssibleCalcForMrp(
                                                     pFileHandle
                                                    ,pvc2LogMode
                                                    ,pvc2OutputMode
                                                    ,pvc2UserId
                                                    ,pvc2BusinessName
                            ,pvc2PlantCd    
                                                    ,numRcvIssueQty
                                                    ,vc2ItemCd
                                                    ,blnRetQty
                                                    );
vc2RunChkComment := 'AUTO-SHIP 判定=';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


                IF blnRet = FALSE THEN
vc2RunChkComment := 'AUTO-SHIP 判定NG=';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                    RAISE excQtyCalcMrp;
                END IF;
        
        
        -- 出荷可能判定に関わらず、以降のfunctionをコールする。
        -----マイナス在庫も許すため
        
                -- 出荷処理
vc2RunChkComment := 'AUTO-SHIP 出庫数=';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                blnRet := FncShipForMrp(
                                           pFileHandle
                                          ,pvc2LogMode
                                          ,pvc2OutputMode                                          
                                          ,pvc2UserId
                                          ,pvc2BusinessName
                      ,pvc2PlantCd
                                          ,vc2CompanyCd
                                          ,numSlipTyp
                                          ,vc2SlipCtrlGrp
                                          ,vc2SlipCd
                                          ,dtmSlipDate
                                          ,numLineNo
                                          ,vc2UpdOdrNo
                                          ,numRcvIssueQty
                                          ,vc2ItemCd
                                          ,numMrpOdrTyp
                                          ,numOdNo
                                          ,dtmShipDate
                                          ,pnumCnt_ITEM_STOCK
                                          ,pnumCnt_JOB_ODR_CD_STOCK
                                          );
            
                 IF blnRet = FALSE THEN
vc2RunChkComment := 'AUTO-SHIP FncShipForMrp NG';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        RAISE excShipForMrp;
                 END IF;

vc2RunChkComment := 'AUTO-SHIP FncShipForMrp OK';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
         END IF;            
    END IF;
    END IF;

RETURN TRUE;

EXCEPTION

    WHEN excNoShipRsv THEN  --出荷保留無し
--DBMS_OUTPUT.PUT_LINE('出荷保留無し');
        ROLLBACK;
        vc2Comment := '(SBM0001)出荷保留データ無し';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excQtyCalcMrp THEN  --ＭＲＰ出荷可能数判断エラー
--DBMS_OUTPUT.PUT_LINE('ＭＲＰ出荷可能数判断エラー');
        ROLLBACK;
        vc2Comment := '(SBM0002)ＭＲＰ出荷可能数判断エラー';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excQtyCalcJobOdr THEN  --製番出荷可能数判断エラー
--DBMS_OUTPUT.PUT_LINE('製番出荷可能数判断エラー');
        ROLLBACK;
        vc2Comment := '(SBM0003)製番出荷可能数判断エラー';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excReleaseShipRsv THEN  --出荷保留区分解除エラー
--DBMS_OUTPUT.PUT_LINE('出荷保留区分解除エラー');
        ROLLBACK;
        vc2Comment := '(SBM0004)出荷保留区分解除エラー';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excMakeShipRsv THEN  --出荷保留作成エラー
--DBMS_OUTPUT.PUT_LINE('出荷保留作成エラー');
        ROLLBACK;
        vc2Comment := '(SBM0005)出荷保留作成エラー';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excShipForMrp THEN  --ＭＲＰ出荷処理エラー
--DBMS_OUTPUT.PUT_LINE('ＭＲＰ出荷処理エラー');
        ROLLBACK;
        vc2Comment := '(SBM0006)ＭＲＰ出荷処理エラー';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excShipForJobOdr THEN  --製番出荷処理エラー
--DBMS_OUTPUT.PUT_LINE('製番出荷処理エラー');
        ROLLBACK;
        vc2Comment := '(SBM0007)製番出荷処理エラー';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_OTHER_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewIssueCd  THEN  --入出庫管理番号取得エラー
--dbms_output.put_line('入出庫管理番号取得エラー');
        ROLLBACK;
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_ISSUE_CTRL_CD, '');
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excGetNewShipRsvCd  THEN  --出荷保留番号取得エラー
--dbms_output.put_line('出荷保留番号取得エラー');
        ROLLBACK;
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_ISSUE_RSV_CD, '');
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('その他エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0008)' || COMMENT_MSGLOG_SHIPEND || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_ORACLE_ERR, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);
        COMMIT;
        RETURN FALSE;
END;
/
