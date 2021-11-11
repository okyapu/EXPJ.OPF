CREATE OR REPLACE FUNCTION FNCMAKEMRPDMND(
/*------------------------------------------------------------------------------
' $Id: FncMakeMrpDmnd.sql,v 1.4 2013/06/03 07:09:58 tai-yanhong Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2003.11.04 DBMS_OUTPUTのコメントアウト
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍、SUBSTRBの引数を4倍）
'
' 機能      : ＭＲＰ品デマンド生成
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
'             pvc2PlantCd          - (i)工場コード
'
' 機能説明  : 所要量により、外部デマンドの全体を削除し、その後、生産要求の内容で
'             新たに外部デマンドの作成を行う。
'
' 備考      :
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
) RETURN BOOLEAN
IS



-- カーソルの宣言
    --【生産要求】
    CURSOR curT_PRD_REQ(
        cVc2PLANT_CD     VARCHAR2        --   工場コード     
    )IS
    SELECT
            T_PRD_REQ.COMPANY_CD,                   --生産要求 会社コード
            T_PRD_REQ.SLIP_TYP,                     --生産要求 伝票種類
            T_PRD_REQ.SLIP_CTRL_GRP,                --生産要求 伝票管理グループ
            T_PRD_REQ.SLIP_CD,                      --生産要求 伝票番号
            T_PRD_REQ.SLIP_DATE,                    --生産要求 伝票日付
            T_PRD_REQ.LINE_NO,                      --生産要求 行
            T_PRD_REQ.UNCONFIRM_ODR_TYP,            --生産要求 内示受注区分
            T_PRD_REQ.REQ_PRD_ISSUE_DATE,           --生産要求 出庫要求日
            T_PRD_REQ.REQ_PRD_QTY,                  --生産要求 要求数量
            T_PRD_REQ.TOTAL_SHIP_QTY,               --生産要求 出荷実績累計数
            T_PRD_REQ.ITEM_CD,                      --生産要求 品目番号
            T_PRD_REQ.MRP_ODR_TYP,                  --生産要求 品目手配区分
        T_PRD_REQ.PLANT_CD              --工場コード    
    FROM    
            T_PRD_REQ           --生産要求
    WHERE
        T_PRD_REQ.PLANT_CD = cVc2PLANT_CD  AND    --工場コード
            T_PRD_REQ.PRD_PLAN_TYP  = 1   AND   --生産計画対象区分（１：今回生産計画対象）
            T_PRD_REQ.PRD_ERROR_TYP = 1   AND   --生産情報エラー区分（１：正常）
          ((T_PRD_REQ.MRP_ODR_TYP = 4) OR       --品目手配区分(4:マニュアル手配品目)
           (T_PRD_REQ.MRP_ODR_TYP = 5) OR       --品目手配区分(5:ロット手配品目)
           (T_PRD_REQ.MRP_ODR_TYP = 6))         --品目手配区分(6:定量手配品目)
       
    ORDER BY COMPANY_CD
            ,SLIP_TYP
            ,SLIP_CTRL_GRP
            ,SLIP_CD
            ,SLIP_DATE
            ,LINE_NO;


    --【品目】
    CURSOR curM_ITEM(
        c_ITEM_CD       VARCHAR2
    ) IS
    SELECT
            M_ITEM.HIGH_LEVEL_NO,                   --品目 レベル番号
            M_ITEM.OUTSIDE_TYP,                     --品目 品目内外作区分
            M_ITEM.ODR_LT,                          --品目 品目手配リードタイム
            M_ITEM.FIXED_LT,                        --品目 品目固定リードタイム
            M_ITEM.PROP_LT,                         --品目 品目比例リードタイム
            M_ITEM.SAFETY_LT,                       --品目 安全日数
            M_ITEM.ISSUE_LT,                        --品目 払出リードタイム
            M_ITEM.PROP_LOT_SIZE,                   --品目 品目比例区分ロットサイズ
            M_ITEM.ITEM_SPOIL,                      --品目 品目仕損率
            M_ITEM.ISSUE_TYP                        --品目 出庫区分
    FROM    
            M_ITEM              --品目
    WHERE   
            M_ITEM.ITEM_CD = c_ITEM_CD;         --品目番号



-- ROWTYPE の宣言
    RtpT_PRD_REQ                    curT_PRD_REQ%ROWTYPE;       --【生産要求】
    RtpM_ITEM                       curM_ITEM%ROWTYPE;          --【品目】



-- 定数の宣言
    MY_SQL_NAME                     VARCHAR2(56)    := 'FncMakeMrpDmnd';
    OD_GNR_TYP_MANUAL               NUMBER(1)       := 1;       --所要量-所要量発生処理区分(1:マニュアル登録)
    OD_GNR_TYP_PRCHPLAN             NUMBER(1)       := 2;       --所要量-所要量発生処理区分(2:発注計画から登録)
    OD_GNR_TYP_PROCPLAN             NUMBER(1)       := 3;       --所要量-所要量発生処理区分(3:作業計画から登録)
    OD_GNR_TYP_UNCONFIRM_ODR        NUMBER(1)       := 5;       --所要量-所要量発生処理区分(5:販売（内示）情報から登録)
    OD_GNR_TYP_ODR_ACPT             NUMBER(1)       := 6;       --所要量-所要量発生処理区分(6:受注情報から登録)
    OD_GNR_TYP_SHIP_RSV             NUMBER(1)       := 7;       --所要量-所要量発生処理区分(7:出荷保留情報から登録)
    OD_GNR_TYP_MRP                  NUMBER(1)       := 9;       --所要量-所要量発生処理区分(9:所要量計算にて登録)
    ODR_STS_NOTODR                  NUMBER(1)       := 0;       --所要量-オーダ状態区分(0:オーダではない)
    ODR_STS_PLAN                    NUMBER(1)       := 1;       --所要量-オーダ状態区分(1:計画（未発効）)
    DM_STS_NOTDEMAND                NUMBER(1)       := 0;       --所要量-デマンド状態区分(0:デマンドではない)
    DM_STS_PLAN                     NUMBER(1)       := 1;       --所要量-デマンド状態区分(1:計画(未発効))
    DM_STS_RELEASE                  NUMBER(1)       := 2;       --所要量-デマンド状態区分(2:確定(未発効))
    DM_STS_COMPLETE                 NUMBER(1)       := 9;       --所要量-デマンド状態区分(9:完了)
    OD_TYP_ODR_DEMAND               NUMBER(1)       := 1;       --所要量-オーダデマンド区分(1:オーダデマンド（製番）)
    OD_TYP_ODR                      NUMBER(1)       := 2;       --所要量-オーダデマンド区分(2:オーダ)
    OD_TYP_DEMAND                   NUMBER(1)       := 3;       --所要量-オーダデマンド区分(3:デマンド)
    OD_TYP_ASSIMILATE               NUMBER(1)       := 4;       --所要量-オーダデマンド区分(4:擬似)
    CONS_TYP_NO                     NUMBER(1)       := 0;       --所要量-構成支給区分(0:非)
    CONS_TYP_PAID                   NUMBER(1)       := 1;       --所要量-構成支給区分(1:有償支給)
    CONS_TYP_FREE                   NUMBER(1)       := 2;       --所要量-構成支給区分(2:無償支給)
    MRP_TYP_ADD                     NUMBER(1)       := 1;       --所要量-所要量処理区分(1:追加)
    MRP_TYP_CHANGE                  NUMBER(1)       := 2;       --所要量-所要量処理区分(2:変更)
    MRP_TYP_UPDATE                  NUMBER(1)       := 3;       --所要量-所要量処理区分(3:削除)
    MRP_TYP_END                     NUMBER(1)       := 9;       --所要量-所要量処理区分(9:済)
    PS_LT_FLG_NOUSE                 NUMBER(1)       := 0;       --製品構成-ＬＴ使用フラグ(0:製品構成マスタのL/Tを使用しない。)
    PS_LT_FLG_USE                   NUMBER(1)       := 1;       --製品構成-ＬＴ使用フラグ(1:製品構成マスタのL/Tを使用する。)
    PRD_PLAN_TYP_CUR_PLAN           NUMBER(1)       := 1;       --生産要求-生産計画対象区分（１：今回生産計画対象）
    PRD_PLAN_TYP_LAST_PLAN          NUMBER(1)       := 2;       --生産要求-生産計画対象区分（２：前回生産計画対象）
    PRD_PLAN_TYP_DEL_PLAN           NUMBER(1)       := 9;       --生産要求-生産計画対象区分（９：生産要求削除対象）
    PRD_ERROR_TYP_NORMAL            NUMBER(1)       := 1;       --生産要求-生産情報エラー区分（１：正常）
    PRD_ERROR_TYP_ERROR             NUMBER(1)       := 9;       --生産要求-生産情報エラー区分（９：エラー）
    MRP_ODR_TYP_CASE_ODR            NUMBER(1)       := 1;       --品目-品目手配区分(1:個別手配品目)
    MRP_ODR_TYP_STOCK_ALOC_CASE     NUMBER(1)       := 2;       --品目-品目手配区分(2:在庫引当型個別手配品目)
    MRP_ODR_TYP_STOCK_ALOC_MANUAL   NUMBER(1)       := 3;       --品目-品目手配区分(3:在庫引当型マニュアル手配品目)
    MRP_ODR_TYP_MANUAL_ODR          NUMBER(1)       := 4;       --品目-品目手配区分(4:マニュアル手配品目)
    MRP_ODR_TYP_LOT_ODR             NUMBER(1)       := 5;       --品目-品目手配区分(5:ロット手配品目)
    MRP_ODR_TYP_RATION_ODR          NUMBER(1)       := 6;       --品目-品目手配区分(6:定量手配品目)
    MRP_ODR_TYP_ODR_POINT_ODR       NUMBER(1)       := 7;       --品目-品目手配区分(7:発注点手配品目)
    MRP_ODR_TYP_ASSIMILATE          NUMBER(1)       := 8;       --品目-品目手配区分(8:擬似品目)
    UNCONFIRM_SALSE_TYP_SALSE_ODR   NUMBER(1)       := 1;       --生産要求-内示受注区分(1:受注)
    UNCONFIRM_SALSE_TYP_UNCONFIRM   NUMBER(1)       := 2;       --生産要求-内示受注区分(2:内示)



-- LOG の宣言
    COMMENT_MSGLOG_MAKEMRPDMNDST    VARCHAR2(124)    := '<< MRP品デマンド生成処理開始 >>';
    COMMENT_MSGLOG_MAKEMRPDMNDEN    VARCHAR2(124)    := '<< MRP品デマンド生成処理終了 >>';
    LOGMSG_START                    VARCHAR2(20)     := 'Start'; --ログ用メソッド開始宣言
    LOGMSG_END                      VARCHAR2(12)     := 'End';   --ログ用メソッド終了宣言
    LOGMSG_ERR                      VARCHAR2(32)     := '異常終了';



-- EXCEPTION の宣言
    excFncGetNewOdNo_ERR            EXCEPTION;                  --オーダデマンド番号採番エラー
    excNOT_PRIMARY_ERR              EXCEPTION;                  --「２重データ」エラー
    excNOT_EXIST_DATA_ERR           EXCEPTION;                  --「対象データ無し」エラー


-- MESSAGE の宣言
    APS_COM_BATCH_START             VARCHAR2(28)       := 'ZZ09001';   --バッチ処理を開始しました
    APS_COM_BATCH_END               VARCHAR2(28)       := 'ZZ09002';   --バッチ処理を終了しました
    APS_COM_NOTEXIST_DATA           VARCHAR2(28)       := 'AK50700';   --対象データが存在しません
    APS_COM_NOTPRIMARY              VARCHAR2(28)       := 'AK50702';   --データが２件以上存在します
    APS_PROC_CNT                    VARCHAR2(28)       := 'AK53412';   --処理件数



--変数の宣言
    blnRet                          BOOLEAN;                    --BOOLEAN型 返却値
    vc2Comment                      VARCHAR2(1024);              --メッセージ用コメント作成作業領域
    vc2RunChkComment                VARCHAR2(72);               --実行位置確認用コメント作成作業領域
    lngCount                        NUMBER;                     --件数カウント用
    numGotOdNo                      VARCHAR2(100);                 --オーダデマンド番号採番結果
    numWkODGNRTYP                   NUMBER(2);                  --ＷＫ所要量発生処理区分
    numCnt_OD                       NUMBER(10);     --[所要量]追加件数



BEGIN



--DBMS_OUTPUT.ENABLE(1000000);
--20031104 DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;



    --TraceLog の出力
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);


--vc2RunChkComment := '★★★★通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-001';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    --外部デマンド削除処理
    DELETE FROM T_OD        --所要量
        WHERE
        (PLANT_CD  =  pvc2PlantCd) AND   --工場コード U
            (OD_GNR_TYP = OD_GNR_TYP_UNCONFIRM_ODR OR    --所要量発生処理区分(5:販売（内示）情報から登録)
             OD_GNR_TYP = OD_GNR_TYP_ODR_ACPT      OR    --所要量発生処理区分(6:受注情報から登録)
             OD_GNR_TYP = OD_GNR_TYP_SHIP_RSV);           --所要量発生処理区分(7:出荷保留情報から登録)


--vc2RunChkComment := 'MAKE-DM-002';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);



    --[所要量]追加件数の初期化
    numCnt_OD := 0;

    --生産要求 の抽出
    OPEN curT_PRD_REQ(pvc2PlantCd);
    FETCH curT_PRD_REQ INTO RtpT_PRD_REQ;
    LOOP
        --生産要求 のＥＯＦ
        EXIT WHEN curT_PRD_REQ%NOTFOUND;


--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-003';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --ＳＱＬの実行
        SELECT COUNT(*) INTO lngCount
            FROM  M_ITEM    --品目
            WHERE M_ITEM.ITEM_CD = RtpT_PRD_REQ.ITEM_CD;    --品目番号
        --２件以上
        IF lngCount > 1 THEN
            RAISE excNOT_PRIMARY_ERR;
        --データ無し
        ELSIF lngCount <= 0 THEN
            RAISE excNOT_EXIST_DATA_ERR;
        END IF;

--vc2RunChkComment := 'MAKE-DM-004';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


        --品目 の抽出
        OPEN curM_ITEM(RtpT_PRD_REQ.ITEM_CD);
        FETCH curM_ITEM INTO RtpM_ITEM;
        --データ有り
        IF curM_ITEM%FOUND THEN

--vc2RunChkComment := '★★★★通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-005';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


            --オーダデマンド番号採番
            blnRet := FncGetNewOdNo(pFileHandle
                                   ,pvc2LogMode
                                   ,pvc2OutputMode
                                   ,pvc2UserId          --ユーザＩＤ
                                   ,pvc2BusinessName    --業務名
                   ,pvc2PlantCd         --工場コード
                                   ,numGotOdNo          --検索結果
                                   );
            IF blnRet = FALSE THEN
                RAISE excFncGetNewOdNo_ERR;
            END IF;

--vc2RunChkComment := 'MAKE-DM-006';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


            --生産要求.内示受注区分 = 1(受注) の時
            IF RtpT_PRD_REQ.UNCONFIRM_ODR_TYP = UNCONFIRM_SALSE_TYP_SALSE_ODR THEN

--vc2RunChkComment := '★★★★通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-007';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                numWkODGNRTYP := OD_GNR_TYP_ODR_ACPT;       --所要量発生処理区分(6:受注情報から登録)
            --生産要求.内示受注区分 = 2(内示) の時
            ELSIF RtpT_PRD_REQ.UNCONFIRM_ODR_TYP = UNCONFIRM_SALSE_TYP_UNCONFIRM THEN

--vc2RunChkComment := '★★★★通過 00040';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                numWkODGNRTYP := OD_GNR_TYP_UNCONFIRM_ODR;  --所要量発生処理区分(5:販売（内示）情報から登録)
            --その他
            ELSE
--vc2RunChkComment := '★★★★通過 00050';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
            
                --ORACLEのﾃﾞﾌｫﾙﾄ値
                numWkODGNRTYP := OD_GNR_TYP_MANUAL;         --所要量発生処理区分(1:マニュアル登録)
            END IF;


--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '★★★★通過 00060';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := 'MAKE-DM-008';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --【所要量】への追加処理
            INSERT INTO T_OD(
                 OD_NO                              --オーダデマンド番号
                ,ALC_GRP_CD                         --引当グループコード
        ,PLANT_CD               --工場コード
                ,ITEM_CD                            --品目番号
                ,PS_EDITION                         --所要量品目構成版数
                ,JOB_ODR_CD                         --製番
                ,JOB_ODR_DETAIL_NO                  --製番枝番
                ,JOB_ODR_CANCEL_NO                  --製番取消発生番号
                ,ODR_STS_TYP                        --オーダ状態区分
                ,DM_STS_TYP                         --デマンド状態区分
                ,OD_TYP                             --オーダデマンド区分
                ,DUE_DATE                           --要求納期
                ,ODR_START_DATE                     --手配着手日
                ,PRD_DUE_DATE                       --製造納期
                ,PRD_START_DATE                     --製造着手日
                ,DM_QTY                             --デマンド数
                ,ODR_QTY                            --オーダ数
                ,MRP_ODR_TYP                       --品目手配区分
                ,OUTSIDE_TYP                        --所要量内外作区分
                ,ISSUE_TYP                          --所要量出庫区分
                ,ODR_LT                             --手配リードタイム
                ,FIXED_LT                           --固定分リードタイム
                ,PROP_LT                            --比例分リードタイム
                ,SAFETY_LT                          --安全日数
                ,ISSUE_LT                           --払出リードタイム
                ,PROP_LOT_SIZE                      --比例分ロットサイズ
                ,PS_LT_FLG                          --製品構成リードタイム使用フラグ
                ,PS_FIXED_LT                        --製品構成固定分リードタイム
                ,PS_PROP_LT                         --製品構成比例分リードタイム
                ,PS_PROP_LOT_SIZE                   --製品構成比例分ロットサイズ
                ,PS_UNIT_QTY                        --製品構成単位数
        ,PS_UNIT_DENOMINATOR            --製品構成単位数分母    
        ,PS_UNIT_NUMERATOR          --製品構成単位分子  
                ,TOTAL_RCV_QTY                      --入庫累計数
                ,RCV_CMPLT_DATE                     --入庫完了日
                ,TOTAL_ISSUE_INST_QTY               --出庫指示累計数
                ,TOTAL_ISSUE_QTY                    --出庫累計数
                ,ISSUE_CMPLT_DATE                   --出庫完了日
                ,OD_GNR_TYP                         --所要量発生処理区分
                ,OD_LEVEL_NO                        --所要量レベル番号
                ,PARENT_OD_NO                       --親オーダデマンド番号
                ,ITEM_SPOIL                         --所要量品目仕損率
                ,PS_SPOIL                           --所要量構成仕損率
                ,CONS_TYP                        --構成支給区分
                ,EFF_PHASE_IN_DATE                  --所要量有効開始日
                ,EFF_PHASE_OUT_DATE                 --所要量有効終了日
                ,MRP_TYP                            --所要量処理区分
--
        ,EXTERNAL_DM_FLG            --外部デマンドフラグ
            ,ODR_RELEASE_FLG            --オーダ発行済フラグ
            ,CREATED_DATE              
            ,CREATED_BY                     
            ,CREATED_PRG_NM                
            ,UPDATED_DATE                   
            ,UPDATED_BY                     
            ,UPDATED_PRG_NM                 
            ,MODIFY_COUNT                  
            ) VALUES (
                 numGotOdNo                         --オーダデマンド番号
                ,NULL                               --引当グループコード
        ,pvc2PlantCd                --工場コード    
                ,RtpT_PRD_REQ.ITEM_CD               --生産要求.品目番号
                ,NULL                               --所要量品目構成版数
                ,NULL                               --製番
                ,0                                  --製番枝番
                ,0                                  --製番取消発生番号
                ,ODR_STS_NOTODR                     --オーダ状態区分(0:オーダではない)
                ,DM_STS_RELEASE                     --デマンド状態区分(2:確定(未発効))
                ,OD_TYP_DEMAND                      --オーダデマンド区分(3:デマンド)
                ,RtpT_PRD_REQ.REQ_PRD_ISSUE_DATE    --生産要求.出庫要求日
                ,NULL                               --手配着手日
                ,RtpT_PRD_REQ.REQ_PRD_ISSUE_DATE    --生産要求.出庫要求日
                ,NULL                               --製造着手日
                ,RtpT_PRD_REQ.REQ_PRD_QTY           --生産要求.要求数量
                ,0                                  --オーダ数量
                ,RtpT_PRD_REQ.MRP_ODR_TYP           --生産要求.品目手配区分
                ,RtpM_ITEM.OUTSIDE_TYP              --品目.品目内外作区分
                ,RtpM_ITEM.ISSUE_TYP                --品目.出庫区分
                ,RtpM_ITEM.ODR_LT                   --品目.品目手配リードタイム
                ,RtpM_ITEM.FIXED_LT                 --品目.品目固定分リードタイム
                ,RtpM_ITEM.PROP_LT                  --品目.品目比例分リードタイム
                ,RtpM_ITEM.SAFETY_LT                --品目.安全日数
                ,RtpM_ITEM.ISSUE_LT                 --品目.払出リードタイム
                ,RtpM_ITEM.PROP_LOT_SIZE            --品目.品目比例分ロットサイズ
                ,PS_LT_FLG_NOUSE                    --ＬＴ使用フラグ(0:製品構成マスタのL/Tを使用しない。)
                ,0                                  --製品構成固定分リードタイム
                ,0                                  --製品構成比例分リードタイム
                ,0                                  --製品構成比例分ロットサイズ
                ,0                                  --製品構成単位数量
        ,1                  --製品構成単位分母  
        ,0                  --製品構成単位分子
                ,0                                  --入庫累計数
                ,NULL                               --入庫完了日
                ,RtpT_PRD_REQ.TOTAL_SHIP_QTY        --生産要求.出荷実績累計数
                ,RtpT_PRD_REQ.TOTAL_SHIP_QTY        --生産要求.出荷実績累計数
                ,NULL                               --出庫完了日
                ,numWkODGNRTYP                      --ＷＫ所要量発生処理区分
                ,RtpM_ITEM.HIGH_LEVEL_NO            --品目.レベル番号
                ,NULL                               --親オーダデマンド番号
                ,RtpM_ITEM.ITEM_SPOIL               --品目.品目仕損率
                ,0                                  --所要量構成仕損率
                ,CONS_TYP_NO                        --構成支給区分(0:非)
                ,NULL                               --所要量有効開始日
                ,NULL                               --所要量有効終了日
                ,MRP_TYP_ADD                        --所要量処理区分(1:追加)
        ,1                  --外部デマンドフラグ
                ,1                                  --オーダ発行済フラグ
        ,SYSDATE
        ,pvc2UserId
                ,MY_SQL_NAME
        ,SYSDATE
        ,pvc2UserId
        ,MY_SQL_NAME
        ,0
            );

            --[所要量]追加件数のインクリメント
            numCnt_OD := numCnt_OD + 1;

--vc2RunChkComment := 'MAKE-DM-009';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        ELSE
            RAISE excNOT_EXIST_DATA_ERR;
        END IF;
        --カーソルクローズ
        CLOSE curM_ITEM;

        --次データ読み込み
        FETCH curT_PRD_REQ INTO RtpT_PRD_REQ;
    END LOOP;
    --カーソルクローズ
    CLOSE curT_PRD_REQ;

--vc2RunChkComment := 'MAKE-DM-010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --[所要量]追加件数の出力
    blnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode,pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                        MY_SQL_NAME, APS_PROC_CNT, '(SBM0045)【所要量】追加件数： ' || numCnt_OD || ' 件');


--vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


    -- TraceLog の出力
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);



--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

--vc2RunChkComment := 'MAKE-DM-END';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    RETURN TRUE;



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN excNOT_PRIMARY_ERR THEN        --「２重データ」エラー
--DBMS_OUTPUT.PUT_LINE('excNOT_PRIMARY_ERR');
        ROLLBACK;
        --エラーメッセージの作成
        vc2Comment := SUBSTRB('(SBM0046)' || LOGMSG_ERR ||
                             '，品目(M_ITEM) 品目番号:' || RtpT_PRD_REQ.ITEM_CD, 1, 1024);
        /* エラーメッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTPRIMARY, vc2Comment);
        -- 終了メッセージの作成
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR ,1,1024);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;

    WHEN excNOT_EXIST_DATA_ERR THEN     --「対象データ無し」エラー
--DBMS_OUTPUT.PUT_LINE('excNOT_EXIST_DATA_ERR');
        ROLLBACK;
        --エラーメッセージの作成
        vc2Comment := SUBSTRB('(SBM0046)' || LOGMSG_ERR ||
                             '，品目(M_ITEM) 品目番号:' || RtpT_PRD_REQ.ITEM_CD, 1, 1024);
        /* エラーメッセージの出力 */
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_NOTEXIST_DATA, vc2Comment);
        -- 終了メッセージの作成
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR ,1,1024);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;

    WHEN excFncGetNewOdNo_ERR THEN      --オーダデマンド番号採番エラー
--DBMS_OUTPUT.PUT_LINE('excFncGetNewOdNo_ERR');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR ,1,1024);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;

    WHEN OTHERS THEN                    --その他のエラー
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
        ROLLBACK;
        -- 終了メッセージの作成
        vc2Comment := SUBSTRB('(SBM0047)' || COMMENT_MSGLOG_MAKEMRPDMNDEN || LOGMSG_ERR || '：' ||
                             SQLCODE || ',' || SUBSTRB(SQLERRM,1,1024),
                             1,1024);
        -- 終了メッセージの出力
        blnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);
        
        /* TraceLog の出力（実行位置） */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END || vc2RunChkComment);

        -- TraceLog の出力
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        COMMIT;
        IF curT_PRD_REQ%ISOPEN THEN
            CLOSE curT_PRD_REQ;
        END IF;
        IF curM_ITEM%ISOPEN THEN
            CLOSE curM_ITEM;
        END IF;
        RETURN FALSE;
END;
/
