CREATE OR REPLACE FUNCTION FNCSHIPFORMRP(
/*------------------------------------------------------------------------------
' $Id: FncShipForMrp.sql,v 1.3 2011/12/23 03:19:44 feng-yi Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2003.11.05 DBMS_OUTPUTのコメントアウト
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
'
' 機能      : 自動出荷処理（ＭＲＰ系品目用）
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
'             pnumRcvIssueQty           - (i) 出荷実績数
'             pvc2ItemCd                - (i) 品目番号
'             pnumMrpOdrTyp             - (i) 品目手配区分
'             pnumOdNo                  - (i) オーダデマンド番号
'             pdtmShipDate              - (i) 出荷実績日
'             pnumCnt_ITEM_STOCK        - (io)［保管区別品目在庫］更新件数
'             pnumCnt_JOB_ODR_CD_STOCK  - (io)［保管区別製番在庫］更新件数
'
' 機能説明  : FncAutoShip（自動出荷処理）から使用する
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle                 IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode                 IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2            --出力モード
   ,pvc2UserId                  IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2            --業務名
    ,pvc2PlantCd            IN  VARCHAR2              --// 工場コード
   ,pvc2CompanyCd               IN  VARCHAR2            --会社コード
   ,pnumSlipTyp                 IN  NUMBER              --伝票種類
   ,pvc2SlipCtrlGrp             IN  VARCHAR2            --伝票管理グループ
   ,pvc2SlipCd                  IN  VARCHAR2            --伝票番号
   ,pdtmSlipDate                IN  DATE                --伝票日付
   ,pnumLineNo                  IN  NUMBER              --行
   ,pvc2UpdOdrNo                IN  VARCHAR2            --更新順序
   ,pnumRcvIssueQty             IN  NUMBER              --出荷実績数
   ,pvc2ItemCd                  IN  VARCHAR2            --品目番号
   ,pnumMrpOdrTyp               IN  NUMBER              --品目手配区分
   ,pnumOdNo                    IN  NUMBER              --オーダデマンド番号
   ,pdtmShipDate                IN  DATE                --出荷実績日
   ,pnumCnt_ITEM_STOCK          IN OUT  NUMBER          --［保管区別品目在庫］更新件数
   ,pnumCnt_JOB_ODR_CD_STOCK    IN OUT  NUMBER          --［保管区別製番在庫］更新件数
)RETURN BOOLEAN
IS
    -- 例外の宣言 
    excNoShipReq                        EXCEPTION;          --出荷要求無し
    excGetNewIssRsvCd                   EXCEPTION;          --出荷保留番号取得エラー
    excInvalidItemStock                 EXCEPTION;          --保管区別品目在庫無し
--
    excInvalidHW_CD         EXCEPTION;      --出庫先保管区なし              

    -- 定数の宣言
    MY_SQL_NAME             VARCHAR2(52)    := 'FncShipForMrp';
    MRPFLAG_TARGET          NUMBER          := 1;   --保管区-MRP対象フラグ(1:MRP対象)
    RCV_ISSUE_TYP_OUT       NUMBER          := 2;   --保管区別入出庫-入出庫区分(2:出庫)
    RCV_ISSUE_GNR_TYP_SHIP  NUMBER          := 31;  --保管区別入出庫-入出庫発生区分(31:出荷)
    RCV_ISSUE_STOCK_UPD_COMPLTED  NUMBER    := 2;   --保管区別入出庫-在庫更新区分(2:更新済み)
    RCV_ISSUE_CMPLT_FLG_COMPLTED  NUMBER    := 1;   --保管区別入出庫-入出庫完了フラグ(1:完了)

    -- 変数の宣言 
    blnRet                  BOOLEAN;        --関数戻り値
    intRet                  INTEGER;        --関数戻り値
    vc2Comment              VARCHAR2(1024);  --メッセージ用コメント作成作業領域
    blnItemStockFlg         BOOLEAN;        --保管区別品目在庫有無判断フラグ
    numWorkShipQty          NUMBER;         --ＷＯＲＫ出荷残数
    numRcvShipQty           NUMBER;         --入出荷数
    vc2RunChkComment        VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
   
    blnWHStockFlg         BOOLEAN;        --出庫先の保管区を保管区Ｍより取得するかの判断フラグ


    
-- MESSAGE の宣言 
    APS_COM_ORACLE_ERR                  VARCHAR2(28)     := 'AK53401';    --ＯＲＡＣＬＥエラー
    APS_COM_OTHER_ERR                   VARCHAR2(28)     := 'AK53402';    --その他エラー
    APS_INVALID_ITEM_STOCK              VARCHAR2(28)     := 'AK52026';    --出庫可能数算出処理で検索したはずの保管区別品目在庫データが存在していません
--
    APS_INVALID_WH_CD           VARCHAR2(28)   := 'AK00026';  --出庫可能な保管区が見つかりません。
-- LOG の宣言 
    LOGMSG_START                        VARCHAR2(20)   := 'Start';         --ログ用メソッド開始宣言
    LOGMSG_END                          VARCHAR2(12)   := 'End';           --ログ用メソッド終了宣言
    LOGMSG_ERR                          VARCHAR2(32)   := '異常終了';
    COMMENT_MSGLOG_END                  VARCHAR2(144)  := '<< 自動出荷処理（ＭＲＰ系品目用） >>';

    -- カーソルの宣言 
    -- 保管区別品目在庫 
    CURSOR curT_ITEM_STOCK(
        cvc2ItemCd          VARCHAR2,
        cvc2PlantCd     VARCHAR2        --   工場コード
        )
    IS
        SELECT A.ITEM_CD, A.WH_CD, A.STOCK_ON_HAND_QTY
            FROM   T_ITEM_STOCK A, M_WH B, M_WH_PRIORITY C
            WHERE  A.WH_CD   = B.WH_CD(+)
              AND  A.ITEM_CD = C.ITEM_CD(+)
              AND  A.WH_CD   = C.WH_CD(+)
              AND  A.ITEM_CD = cvc2ItemCd
              AND  A.STOCK_ON_HAND_QTY > 0
              AND  B.MRP_FLG = MRPFLAG_TARGET
          AND  A.PLANT_CD = cvc2PlantCd
            ORDER BY C.WH_PRIORITY_REF_NO, A.WH_CD;

    --工場Ｍ  代表納入場所の取得 
    CURSOR  CurM_PLANT(
        cVc2PLANT_CD     VARCHAR2        --   工場コード
    )IS
    SELECT  M1.WH_CD                    --保管句
    FROM    M_PLANT M1,M_WH M2
    WHERE  M1.PLANT_CD = cVc2PLANT_CD AND
           M1.WH_CD IS NOT NULL  AND
           M2.MRP_FLG = 1 AND
           M1.PLANT_CD=M2.PLANT_CD AND
           M1.WH_CD = M2.WH_CD;

    -- 品目別保管先優先順位より、優先順位の先頭のもの 
    CURSOR curM_WH_PRIORITY(
        cvc2ItemCd          VARCHAR2,
        cvc2PlantCd     VARCHAR2        --   工場コード
        )
    IS
        SELECT C.ITEM_CD, C.WH_CD
            FROM   M_WH B, M_WH_PRIORITY C
            WHERE    C.ITEM_CD = cvc2ItemCd
        AND  C.PLANT_CD = cvc2PlantCd
                AND  B.MRP_FLG = MRPFLAG_TARGET
        AND  C.WH_CD   = B.WH_CD
            ORDER BY C.WH_PRIORITY_REF_NO, C.WH_CD;

    --【保管区Ｍ】 最後の出庫先
    CURSOR  CurM_WH(
        cVc2PLANT_CD     VARCHAR2        --   工場コード
    )IS
    SELECT  WH_CD                    --保管句
    FROM    M_WH
    WHERE  PLANT_CD = cVc2PLANT_CD AND
    MRP_FLG = 1  
    ORDER BY WH_CD;

-----------------
-- ROWTYPE宣言 --
-----------------
    RtpM_PLANT                       CurM_PLANT%ROWTYPE;        
    RtpM_WH_PRIORITY                     CurM_WH_PRIORITY%ROWTYPE; 
    RtpM_WH                          CurM_WH%ROWTYPE; 

--カーソル件数カウント用
    num_M_PLANT_Count                     NUMBER(10); 
    num_M_WH_PRIORITY_Count                   NUMBER(10);   
    num_M_WH_Count                    NUMBER(10);   

BEGIN

----****************************************************************************************
---  出庫先の保管区が存在しなかった場合は、エラーとする。
---　　　業務ログ出力で、ROLLBACK
---*****************************************************************************************
    -- 保管区別品目在庫データ取得

    numWorkShipQty := pnumRcvIssueQty;
    blnItemStockFlg := FALSE;

    FOR curT_ITEM_STOCK_REC IN curT_ITEM_STOCK(pvc2ItemCd,pvc2PlantCd) LOOP
        blnItemStockFlg := TRUE;

vc2RunChkComment := 'MRP_保管区在庫あり-01';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        -- [保管区別品目在庫].手持在庫数量 と WORK出荷残数の 大小関係チェック
        IF curT_ITEM_STOCK_REC.STOCK_ON_HAND_QTY >= numWorkShipQty THEN

vc2RunChkComment := 'MRP_保管区在庫あり-02';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
            -- [保管区別品目在庫].手持在庫数量 ＞＝ WORK出荷残数 の場合
            -- Work出荷残数 を負数にして[入出荷].入出荷数に設定
            numRcvShipQty := numWorkShipQty * -1;
        
            -- [入出荷]レコード項目設定,追加，出荷処理
            blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,curT_ITEM_STOCK_REC.ITEM_CD
                                   ,curT_ITEM_STOCK_REC.WH_CD
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                   );
            IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-05'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                RETURN FALSE;
            END IF;
            -- Work出荷残数 ＝ Work出荷残数 ＋ [入出荷].入出荷数
            -- 実際には負数が入っているので減算に相当する。
            numWorkShipQty := numWorkShipQty + numRcvShipQty;
            -- Ｅｘｉｔ Ｌｏｏｐ（この品目に関する出荷処理は完了）
            EXIT;
        ELSE

vc2RunChkComment := 'MRP_保管区在庫あり-03';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
            -- [保管区別品目在庫(i)].手持在庫数量 ＜ WORK出荷残数 の場合
            -- [保管区別品目在庫].手持ち在庫数量を負数にして[入出荷].入出荷数に設定
            numRcvShipQty := -1 * curT_ITEM_STOCK_REC.STOCK_ON_HAND_QTY;
        
            -- [入出荷]レコード項目設定,追加，出荷処理
            blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd 
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,curT_ITEM_STOCK_REC.ITEM_CD
                                   ,curT_ITEM_STOCK_REC.WH_CD
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                   );
            IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-04'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                RETURN FALSE;
            END IF;
        END IF;
         
        -- Work出荷残数 ＝ Work出荷残数 ＋ [入出荷].入出荷数
        -- 実際には負数が入っているので減算に相当する。
        numWorkShipQty := numWorkShipQty + numRcvShipQty;
        
    END LOOP;
    
    -- 保管区別品目在庫有無判断
    IF blnItemStockFlg = FALSE THEN
------引落し対象の保管区が在庫＜＝０、レコード未存在の場合、FALSEとなってしまうため
------再度、優先順位と保管区より、引き落とし対象の保管区を取得する。
        SELECT COUNT(*) INTO num_M_WH_PRIORITY_Count
    FROM   M_WH B, M_WH_PRIORITY C
    WHERE    C.ITEM_CD = pvc2ItemCd
    AND  C.PLANT_CD = pvc2PlantCd
        AND  B.MRP_FLG = MRPFLAG_TARGET
    AND  C.WH_CD   = B.WH_CD;
    IF num_M_WH_PRIORITY_Count > 0 THEN 
                ---保管区別品目在庫の有無に関わらず、取得した保管区より出庫 
        OPEN CurM_WH_PRIORITY(pvc2ItemCd,pvc2PlantCd);   
        FETCH CurM_WH_PRIORITY INTO RtpM_WH_PRIORITY;
            
                IF CurM_WH_PRIORITY%FOUND THEN     --存在時
            --出庫数を算出して、以降の処理へ    
                    -- Work出荷残数 を負数にして[入出荷].入出荷数に設定
                    numRcvShipQty := numWorkShipQty * -1;
        
vc2RunChkComment := 'MRP_保管区優先順位より-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        
                    -- [入出荷]レコード項目設定,追加，出荷処理
                    blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,pvc2ItemCd              --品番
                                   ,RtpM_WH_PRIORITY.WH_CD            --保管区(保管区Ｍ）
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                 );
                    IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-01'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                        RETURN FALSE;
        
                    END IF;
                    -- Work出荷残数 ＝ Work出荷残数 ＋ [入出荷].入出荷数
                    -- 実際には負数が入っているので減算に相当する。
                    numWorkShipQty := numWorkShipQty + numRcvShipQty;
                
        END IF;
        ELSE
vc2RunChkComment := 'MRP_保管区在庫なし-01';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
            -- 保管区別品目在庫が全く無い
        --工場Ｍより、代表納入場所取得
            --工場Ｍの代表納入場所が未設定の場合は、
            --保管区の保管区コードの最少のものより、出庫する。
            SELECT  COUNT(*) INTO num_M_PLANT_Count
            FROM    M_PLANT M1,M_WH M2
            WHERE  M1.PLANT_CD = pvc2PlantCd AND
            M1.WH_CD IS NOT NULL  AND
            M2.MRP_FLG = 1 AND
            M1.PLANT_CD=M2.PLANT_CD AND
            M1.WH_CD = M2.WH_CD;
                            
        IF num_M_PLANT_Count > 0 THEN 
            --工場Ｍより、保管区コード取得 
                    ---保管区別品目在庫の有無に関わらず、取得した保管区より出庫 
            OPEN CurM_PLANT(pvc2PlantCd);   
            FETCH CurM_PLANT INTO RtpM_PLANT;
    
                    IF CurM_PLANT%FOUND THEN     --存在時
                --出庫数を算出して、以降の処理へ    
                        -- Work出荷残数 を負数にして[入出荷].入出荷数に設定
                        numRcvShipQty := numWorkShipQty * -1;
    
vc2RunChkComment := 'MRP_工場Ｍより-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
        
                        -- [入出荷]レコード項目設定,追加，出荷処理
                        blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp  
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,pvc2ItemCd              --品番
                                   ,RtpM_PLANT.WH_CD            --保管区(工場Ｍ)
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                    );
                        IF blnRet = FALSE THEN
    
vc2RunChkComment := 'FncMakeRcvShip-NG-03'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            RETURN FALSE;
                        END IF;
                        -- Work出荷残数 ＝ Work出荷残数 ＋ [入出荷].入出荷数
                        -- 実際には負数が入っているので減算に相当する。
                        numWorkShipQty := numWorkShipQty + numRcvShipQty;
            END IF;
    
        else  --工場Ｍに対象データなし
            ---保管区Ｍより、引落し先を取得する。
                ---保管区別品目在庫の有無に関わらず、取得した保管区より出庫                     
            SELECT  COUNT(*)  INTO num_M_WH_Count               --保管句
                FROM    M_WH
                WHERE  PLANT_CD = pvc2PlantCd AND
                MRP_FLG = 1;
    
            IF num_M_WH_Count > 0 THEN 
                        ---保管区別品目在庫の有無に関わらず、取得した保管区より出庫 
                OPEN CurM_WH(pvc2PlantCd);   
                FETCH CurM_WH INTO RtpM_WH;
    
                        IF CurM_WH%FOUND THEN     --存在時
            
        
                    --出庫数を算出して、以降の処理へ    
                            -- Work出荷残数 を負数にして[入出荷].入出荷数に設定
                            numRcvShipQty := numWorkShipQty * -1;
        
vc2RunChkComment := 'MRP_保管区Ｍより-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        
        
                            -- [入出荷]レコード項目設定,追加，出荷処理
                            blnRet := FncMakeRcvShip(
                                        pFileHandle
                                       ,pvc2LogMode
                                       ,pvc2OutputMode
                                       ,pvc2UserId
                                       ,pvc2BusinessName
                           ,pvc2PlantCd
                                       ,pvc2CompanyCd
                                           ,pnumSlipTyp
                                       ,pvc2SlipCtrlGrp
                                        ,pvc2SlipCd
                                        ,pdtmSlipDate
                                        ,pnumLineNo
                                        ,pvc2ItemCd             --品番
                                        ,RtpM_WH.WH_CD            --保管区(保管区Ｍ）
                                        ,pnumOdNo
                                        ,numRcvShipQty
                                        ,pdtmShipDate
                                        ,NULL
                                        ,0
                                        ,pnumCnt_ITEM_STOCK
                                        ,pnumCnt_JOB_ODR_CD_STOCK
                                        );
                            IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-02'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
    
                                RETURN FALSE;
                            END IF;
                            -- Work出荷残数 ＝ Work出荷残数 ＋ [入出荷].入出荷数
                            -- 実際には負数が入っているので減算に相当する。
                            numWorkShipQty := numWorkShipQty + numRcvShipQty;
            
                END IF;
            ELSE  ---出庫先の保管区が見つからなかった場合
                ---エラーメッセージを業務ログに出力して、ROLLBACK 以降の処理は行なわない
                RAISE excInvalidHW_CD;
            END IF;
        end if;
    
    END IF; 


    ELSE
        IF numWorkShipQty > 0 THEN
            -- 保管区別品目在庫があるが数量が足りない
        -- 品目別保管区優先順位の順位の最少のものより出庫          
            SELECT COUNT(*) INTO num_M_WH_PRIORITY_Count
                FROM   M_WH B, M_WH_PRIORITY C
                WHERE    C.ITEM_CD = pvc2ItemCd
        AND  C.PLANT_CD = pvc2PlantCd
                AND  B.MRP_FLG = MRPFLAG_TARGET
        AND  C.WH_CD   = B.WH_CD;
        IF num_M_WH_PRIORITY_Count > 0 THEN 
                    ---保管区別品目在庫の有無に関わらず、取得した保管区より出庫 
            OPEN CurM_WH_PRIORITY(pvc2ItemCd,pvc2PlantCd);   
            FETCH CurM_WH_PRIORITY INTO RtpM_WH_PRIORITY;
            
                    IF CurM_WH_PRIORITY%FOUND THEN     --存在時
                --出庫数を算出して、以降の処理へ    
                        -- Work出荷残数 を負数にして[入出荷].入出荷数に設定
                        numRcvShipQty := numWorkShipQty * -1;
        
vc2RunChkComment := 'MRP_保管区優先順位より-01=';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        
        
                        -- [入出荷]レコード項目設定,追加，出荷処理
                        blnRet := FncMakeRcvShip(
                                    pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId
                                   ,pvc2BusinessName
                   ,pvc2PlantCd
                                   ,pvc2CompanyCd
                                   ,pnumSlipTyp
                                   ,pvc2SlipCtrlGrp
                                   ,pvc2SlipCd
                                   ,pdtmSlipDate
                                   ,pnumLineNo
                                   ,pvc2ItemCd              --品番
                                   ,RtpM_WH_PRIORITY.WH_CD            --保管区(保管区Ｍ）
                                   ,pnumOdNo
                                   ,numRcvShipQty
                                   ,pdtmShipDate
                                   ,NULL
                                   ,0
                                   ,pnumCnt_ITEM_STOCK
                                   ,pnumCnt_JOB_ODR_CD_STOCK
                                   );
                        IF blnRet = FALSE THEN
vc2RunChkComment := 'FncMakeRcvShip-NG-01'; 
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                            RETURN FALSE;
        
                        END IF;
                        -- Work出荷残数 ＝ Work出荷残数 ＋ [入出荷].入出荷数
                        -- 実際には負数が入っているので減算に相当する。
                        numWorkShipQty := numWorkShipQty + numRcvShipQty;
                
            END IF;
        END IF;
        


        END IF;
    END IF;


--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN TRUE;

EXCEPTION
    WHEN excInvalidHW_CD  THEN  --出庫可能な保管区が見つかりません。
--dbms_output.put_line('出庫可能な保管区が見つかりません。');
        ROLLBACK;
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_INVALID_WH_CD, vc2Comment);
        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN excInvalidItemStock THEN  --保管区別品目在庫無し
--DBMS_OUTPUT.PUT_LINE('保管区別品目在庫無し');
        ROLLBACK;
        vc2Comment := '';
        -- エラーメッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_INVALID_ITEM_STOCK, vc2Comment);
        -- TraceLog の出力 
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        RETURN FALSE;

    WHEN OTHERS THEN
--DBMS_OUTPUT.PUT_LINE('その他エラー');
        ROLLBACK;
        vc2Comment := SUBSTRB('(SBM0056)' || COMMENT_MSGLOG_END || LOGMSG_ERR || '：' ||
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
