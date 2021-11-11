CREATE OR REPLACE FUNCTION FNCSHPCOMMITEMCHG(
/*------------------------------------------------------------------------------
' $Id: FncShpCommItemChg.sql,v 1.6 2013/06/03 07:43:03 tai-yanhong Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.16 新規作成
' 2003.11.05 DBMS_OUTPUTのコメントアウト
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 出荷商品品目変換処理
'
' 戻り値    : Boolean
'               True :正常終了（ＬＯＧ出力が行えた時）
'               False:異常終了（ＬＯＧ出力に失敗した時）
'
' 引き数    : pFileHandle          - (i)ファイルハンドル
'             pvc2LogMode          - (i)ＬＯＧモード
'             pvc2OutputMode       - (i)出力モード
'             pvc2UserId           - (i)ユーザＩＤ
'             pvc2BusinessName     - (i)業務名
'             pvc2PlantCd             (i)工場コード

' 機能説明  : 販売管理システムから[入出庫実績I/F]を読込み商品コードから品目番号の変換を行う。
'
' 備考      :
'
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
    )

RETURN BOOLEAN
     is

    --// カーソルの宣言
        --入出庫実績インタフェース読込用
        cursor cur_T_PRD_INV_IF (
        cVc2PLANT_CD     VARCHAR2        --   1.工場コード
        )is
            select * from T_PRD_INV_IF
        where plant_cd = cVc2PLANT_CD               
        order by COMPANY_CD
                      ,SLIP_TYP
                      ,SLIP_CTRL_GRP
                      ,SLIP_CD
                      ,SLIP_DATE
                      ,LINE_NO;

-----------------
-- ROWTYPE宣言 --
-----------------
        lRtpT_PRD_INV_IF cur_T_PRD_INV_IF%ROWTYPE;


    /* 定数の宣言 */
    APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'AK53401';  --ORACLE Error
    APS_COM_OTHER_ERR               VARCHAR2(28)    := 'AK53402';  --その他 Error
    APS_PROC_CNT                    VARCHAR2(28)    := 'AK53412';  --処理件数
    METHOD_START                    VARCHAR2(20)  := 'Start';             --ログ用メソッド開始宣言
    METHOD_END                      VARCHAR2(12)  := 'End';               --ログ用メソッド終了宣言
    MY_SQL_NAME                     VARCHAR2(120) := 'FncShpCommitemChg'; --ファンクション名
    lCOMMENT_MSGLOG_SHIPCOMMSTART   VARCHAR2(120) := '(SBM0730)<< 出荷商品品目変換処理開始 >>';
    lCOMMENT_MSGLOG_SHIPCOMMEND     VARCHAR2(120) := '<< 出荷商品品目変換処理終了 >>';
    lOGMSG_ERR                      VARCHAR2(32)  := '異常終了';

    --// 変数の定義
    lBlnRet                         boolean;        --戻値
    lvc2Comment                     VARCHAR2(1024);  --// メッセージ作成用
    lnumterm_curr                   NUMBER(14);
    lvc2ItemCDtemp                  VARCHAR2(100);   --商品CD、品目番号の一時退避
    lvc2mrpodrtyp                   NUMBER(2);      --品目手配区分取得用
    vc2RunChkComment                VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
    numCnt_SHIP_REQ                 NUMBER(10);     --[出荷要求]追加件数
    lnumterm_curr1                   NUMBER(18,4);
    vc2ORGN             VARCHAR2(100);    

--<メイン処理 >-----------------------------------------------------
begin
--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    --//TraceLogの出力(Start)
    LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,lCOMMENT_MSGLOG_SHIPCOMMSTART);

--vc2RunChkComment := '★★★★通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --出荷要求ﾌｧｲﾙを全て削除する
    delete from T_SHIP_REQ
        where plant_cd = pvc2PlantCd;

--DBMS_OUTPUT.PUT_LINE('入出庫インタフェースファイルの存在確認');

    --[出荷要求]追加件数の初期化
    numCnt_SHIP_REQ := 0;


    --入出庫インタフェースファイルの存在確認
    select count(*) into lnumterm_curr from T_PRD_INV_IF
    where plant_cd = pvc2PlantCd;

    LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0829)入出庫ｲﾝﾀﾌｪｰｽﾌｧｲﾙ読込み件数：' || lnumterm_curr);

    if lnumterm_curr > 0 then--所得件数あり

--vc2RunChkComment := '★★★★通過 00020';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        open cur_T_PRD_INV_IF(pvc2PlantCd);

        loop
            fetch cur_T_PRD_INV_IF into lRtpT_PRD_INV_IF;
            exit when cur_T_PRD_INV_IF%notfound;

            --入出庫インタフェースファイルを出荷要求ファイルへ追加
            insert into t_ship_req (
                                    COMPANY_CD,
                                    SLIP_TYP,
                                    SLIP_CTRL_GRP,
                                    SLIP_CD,
                                    SLIP_DATE,
                                    LINE_NO,
                                    UPD_ODR_NO,
                                    CRCT_TYP,
                                    ORGN_SLIP_CTRL_GRP,
                                    ORGN_SLIP_CD,
                                    ORGN_SLIP_DATE,
                                    ORGN_LINE_NO,
                                    ODR_SLIP_TYP,
                                    ODR_SLIP_CTRL_GRP,
                                    ODR_SLIP_CD,
                                    ODR_SLIP_DATE,
                                    ODR_LINE_NO,
                                    JOB_ODR_FLG,
                                    CUST_CD,
                                    CUST_NAME,
                                    BRANCH_CD,
                                    BRANCH_NAME,
                                    DIRECT_DLV_TYP,
                                    DLV_LOC_CD,
                                    DLV_LOC_NAME,
                                    COMM_CD,
                                    COMM_NAME,
                                    SPEC,
                                    COMM_SIZE,
                                    COLOR,
                                    PRD_COMM_CODE_CHG_TYP,
                                    SCDL_SHIP_DATE,
                                    SCDL_DLV_DATE,
                    PLANT_CD,
                                    SHIP_WH_CD,
                                    WH_CD,
                                    RCV_ISSUE_QTY,
                                    TOTAL_RCV_ISSUE_QTY,
                                    REMAIN_RCV_ISSUE_QTY,
                                    ODR_ACPT_JOB_ODR_NO,
                                    ITEM_CD,
                                    MRP_ODR_TYP,
                                    OD_TYP,
                                    OD_NO,
                                    JOB_ODR_CD,
                                    JOB_ODR_DETAIL_NO,
                                    PRD_ERROR_TYP,
                                    SHIP_DATE,
                    CREATED_DATE,
                    CREATED_BY,
                    CREATED_PRG_NM,
                    UPDATED_DATE,
                    UPDATED_BY,
                    UPDATED_PRG_NM,
                    MODIFY_COUNT        
                                    )
                                    values
                                    (
                                    lRtpT_PRD_INV_IF.COMPANY_CD,
                                    lRtpT_PRD_INV_IF.SLIP_TYP,
                                    lRtpT_PRD_INV_IF.SLIP_CTRL_GRP,
                                    lRtpT_PRD_INV_IF.SLIP_CD,
                                    lRtpT_PRD_INV_IF.SLIP_DATE,
                                    lRtpT_PRD_INV_IF.LINE_NO,
                                    lRtpT_PRD_INV_IF.UPD_ODR_NO,
                                    lRtpT_PRD_INV_IF.CRCT_TYP,
                                    lRtpT_PRD_INV_IF.ORGN_SLIP_CTRL_GRP,
                                    lRtpT_PRD_INV_IF.ORGN_SLIP_CD,
                                    lRtpT_PRD_INV_IF.ORGN_SLIP_DATE,
                                    lRtpT_PRD_INV_IF.ORGN_LINE_NO,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_TYP,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_CTRL_GRP,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_CD,
                                    lRtpT_PRD_INV_IF.ODR_SLIP_DATE,
                                    lRtpT_PRD_INV_IF.ODR_LINE_NO,
                                    lRtpT_PRD_INV_IF.JOB_ODR_FLG,
                                    lRtpT_PRD_INV_IF.CUST_CD,
                                    lRtpT_PRD_INV_IF.CUST_NAME,
                                    lRtpT_PRD_INV_IF.BRANCH_CD,
                                    lRtpT_PRD_INV_IF.BRANCH_NAME,
                                    lRtpT_PRD_INV_IF.DIRECT_DLV_TYP,
                                    lRtpT_PRD_INV_IF.DLV_LOC_CD,
                                    lRtpT_PRD_INV_IF.DLV_LOC_NAME,
                                    lRtpT_PRD_INV_IF.COMM_CD,
                                    lRtpT_PRD_INV_IF.COMM_NAME,
                                    lRtpT_PRD_INV_IF.SPEC,
                                    lRtpT_PRD_INV_IF.COMM_SIZE,
                                    lRtpT_PRD_INV_IF.COLOR,
                                    lRtpT_PRD_INV_IF.PRD_COMM_CODE_CHG_TYP,
                                    lRtpT_PRD_INV_IF.SCDL_SHIP_DATE,
                                    lRtpT_PRD_INV_IF.SCDL_DLV_DATE,
                    lRtpT_PRD_INV_IF.PLANT_CD,
                                    lRtpT_PRD_INV_IF.SHIP_WH_CD,
                                    lRtpT_PRD_INV_IF.WH_CD,
                                    lRtpT_PRD_INV_IF.RCV_ISSUE_QTY,
                                    lRtpT_PRD_INV_IF.TOTAL_RCV_ISSUE_QTY,
                                    lRtpT_PRD_INV_IF.REMAIN_RCV_ISSUE_QTY,
                                    lRtpT_PRD_INV_IF.ODR_ACPT_JOB_ODR_NO,
                                    lRtpT_PRD_INV_IF.COMM_CD,
                                    lRtpT_PRD_INV_IF.MRP_ODR_TYP,
                                    lRtpT_PRD_INV_IF.OD_TYP,
                                    lRtpT_PRD_INV_IF.OD_NO,
                                    lRtpT_PRD_INV_IF.JOB_ODR_CD,
                                    lRtpT_PRD_INV_IF.JOB_ODR_DETAIL_NO,
                                    lRtpT_PRD_INV_IF.PRD_ERROR_TYP,
                                    lRtpT_PRD_INV_IF.SHIP_DATE,
                                    sysdate,
                                    pvc2UserId,
                    MY_SQL_NAME,
                                    sysdate,
                                    pvc2UserId,
                    MY_SQL_NAME,
                    0
                                    );

            --[出荷要求]追加件数のインクリメント
            numCnt_SHIP_REQ := numCnt_SHIP_REQ + 1;


            --退避した品目番号を基に品目ﾏｽﾀと照合
            select count(*) into lnumterm_curr from M_ITEM ITEM
                                              where ITEM_CD = lRtpT_PRD_INV_IF.COMM_CD;

            if lnumterm_curr <= 0 then --ﾃﾞｰﾀが存在しない場合

--vc2RunChkComment := '★★★★通過 00070';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--DBMS_OUTPUT.PUT_LINE('ﾃﾞｰﾀが存在しない場合');

                update t_ship_req set MRP_ODR_TYP = 0,  --品目手配区分
                                      PRD_ERROR_TYP = 9 --生産情報エラー区分 = 9(ｴﾗｰﾃﾞｰﾀ)
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PKが更新条件
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                  and plant_cd = pvc2PlantCd ;

            else--ﾃﾞｰﾀが存在する場合

--vc2RunChkComment := '★★★★通過 00080';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--DBMS_OUTPUT.PUT_LINE('ﾃﾞｰﾀが存在する場合');
                --品目手配区分の取得
                select mrp_odr_typ into lvc2mrpodrtyp from M_ITEM
                                                          where ITEM_CD = lRtpT_PRD_INV_IF.COMM_CD;

                update t_ship_req set MRP_ODR_TYP = lvc2mrpodrtyp, --取得した品目手配区分の設定
                                      PRD_ERROR_TYP = 1            --生産情報エラー区分 = 1(正常)
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PKが更新条件
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                                  and plant_cd = pvc2PlantCd;
            end if;

------エラーチェックの追加　　出荷実績数がマイナスか
                    
            select RCV_ISSUE_QTY,ORGN_SLIP_CTRL_GRP into lnumterm_curr1,vc2ORGN from T_SHIP_REQ
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PKが更新条件
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                                  and plant_cd = pvc2PlantCd;
     if (lnumterm_curr1 < 0) AND (vc2ORGN IS NULL)  then
                update t_ship_req set PRD_ERROR_TYP = 9            --生産情報エラー区分  9(ｴﾗｰﾃﾞｰﾀ)
                                where COMPANY_CD  = lRtpT_PRD_INV_IF.COMPANY_CD  --PKが更新条件
                                  and SLIP_TYP  = lRtpT_PRD_INV_IF.SLIP_TYP
                                  and SLIP_CTRL_GRP = lRtpT_PRD_INV_IF.SLIP_CTRL_GRP
                                  and SLIP_CD = lRtpT_PRD_INV_IF.SLIP_CD
                                  and SLIP_DATE = lRtpT_PRD_INV_IF.SLIP_DATE
                                  and LINE_NO = lRtpT_PRD_INV_IF.LINE_NO
                                  and UPD_ODR_NO = lRtpT_PRD_INV_IF.UPD_ODR_NO
                                  and plant_cd = pvc2PlantCd;
       end if;  
        end loop;

        close cur_T_PRD_INV_IF;

        --入出庫実績インタフェースファイルの全件削除
        delete from T_PRD_INV_IF
                where plant_cd = pvc2PlantCd;

    end if;

    --[出荷要求]追加件数の出力
    LBlnRet := FncMsgLog(pFileHandle, pVc2LogMode, pVc2OutputMode, pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                         MY_SQL_NAME, APS_PROC_CNT, '(SBM0063)【出荷要求】追加件数： ' || numCnt_SHIP_REQ || ' 件');

--vc2RunChkComment := '★★★★通過 00090';
--20031105 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment||'[出荷要求]追加件数の出力件数:'||numCnt_SHIP_REQ);

--vc2RunChkComment := '★★★★通過 00090';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    --//TraceLogの出力(End)
    LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0731)'||lCOMMENT_MSGLOG_SHIPCOMMEND);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));

    RETURN true;

--< 例外処理 >---------------------------------------------------------------
exception
    WHEN OTHERS THEN   --オラクルエラー
--20031105 DBMS_OUTPUT.PUT_LINE('＊オラクルエラー＊');

        ROLLBACK;

        --//異常終了のメッセージ
        LBlnRet := FncMsgLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                             MY_SQL_NAME, APS_COM_ORACLE_ERR,'(SBM0064)'|| lCOMMENT_MSGLOG_SHIPCOMMEND || LOGMSG_ERR);

        /* TraceLog の出力（実行位置） */
        LblnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                               MY_SQL_NAME, METHOD_END || vc2RunChkComment);

        --//TraceLogの出力
        LBlnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0064)'||lCOMMENT_MSGLOG_SHIPCOMMEND || LOGMSG_ERR);
        COMMIT;
        RETURN false;
end;
/
