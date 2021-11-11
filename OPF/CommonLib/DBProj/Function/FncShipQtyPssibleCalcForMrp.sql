CREATE OR REPLACE FUNCTION FNCSHIPQTYPSSIBLECALCFORMRP(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
'
' 機能      : ＭＲＰ出荷可能数判断
'
' 戻り値    : Boolean
'               True :正常終了
'               False:異常終了
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd               - (i)工場コード
'             pnumRcvIssueQty      - (i)出荷実績数
'             pvc2ItemCd           - (i)品目番号
'             pblnRetQty           - (o)出荷可能数判定
'
' 機能説明  : FncAutoShip（自動出荷処理）から使用する
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd                 IN      VARCHAR2       --// 工場コード
   ,pnumRcvIssueQty     IN  NUMBER              --出荷数
   ,pvc2ItemCd          IN  VARCHAR2            --品目番号
   ,pblnRetQty          OUT BOOLEAN         --出荷可能数判定

)RETURN BOOLEAN
IS
    -- 例外の宣言 

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(108)    := 'FncShipQtyPssibleCalcForMrp';
    MRPFLAG_TARGET          NUMBER          := 1;   --保管区-MRP対象フラグ(1:MRP対象)

    -- 変数の宣言 
    blnRet                  BOOLEAN;        --関数戻り値
    intRet                  INTEGER;        --関数戻り値
    vc2Comment              VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    numSumOfStockAll        NUMBER;         --出荷可能数

-- MESSAGE の宣言 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --ＯＲＡＣＬＥエラー
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --その他エラー

-- LOG の宣言 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    COMMENT_MSGLOG_END                  VARCHAR2(104)  := '<< ＭＲＰ出荷可能数判断 >>';


BEGIN
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    -- TraceLog の出力 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);
--vc2RunChkComment := '★★★★通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 出荷可能数算出
    SELECT SUM(STOCK_ON_HAND_QTY) INTO numSumOfStockAll
      FROM T_ITEM_STOCK A, M_WH B
      WHERE A.WH_CD = B.WH_CD
        AND A.ITEM_CD = pvc2ItemCd
    AND A.PLANT_CD = pvc2PlantCd
        AND B.MRP_FLG = MRPFLAG_TARGET;
    IF numSumOfStockAll IS NULL THEN
        numSumOfStockAll := 0;
    END IF;
    IF numSumOfStockAll < 0 THEN
        numSumOfStockAll := 0;
    END IF;

--vc2RunChkComment := '★★★★通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- 出荷可能数判断
    IF pnumRcvIssueQty <= numSumOfStockAll THEN
        pblnRetQty := TRUE;
    ELSE
        pblnRetQty := FALSE;
    END IF;



--vc2RunChkComment := '★★★★通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -- TraceLog の出力 
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;

EXCEPTION

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('その他のエラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0057)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '：' ||
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
