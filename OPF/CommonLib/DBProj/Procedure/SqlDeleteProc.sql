create or replace procedure SQLDELETEPROC(
/*------------------------------------------------------------------------------
' $Id: SqlDeleteProc.sql,v 1.14 2016/05/23 07:39:59 zhangran Exp $
'
' version   : 1.00.00
'
' 修正履歴
' 2003.10.18 新規作成
' 2003.11.04 DBMS_OUTPUTのコメントアウト
' 2005.08.12 購入返品実績テーブルを削除対象に追加
' 2005.10.21 unicode対応（varchar2を4倍）
' 2008.07.22 所要量計算制御（製番）の削除`を追加
' 2008.12.05 業務メッセージ削除処理修正（確認日時→更新日）
' 2013.12.27 作業系列別仕掛、品目別仕掛削除機能を性能改善
' 2015.08.07 EJaSCM／EJa機能強化対応
'
' 機能      : 削除処理
'
' 引き数    : pvc2LogMode           - (i)ＬＯＧモード
'             pvc2OutputMode        - (i)出力モード
'             pvc2OutputPath        - (i)出力ファイルパス
'             pvc2OutputName        - (i)出力ファイル名
'             pvc2UserId            - (i)ユーザＩＤ
'             pvc2BusinessName      - (i)業務名
'             pvc2PlantCd           - (i)工場コード
'             pvcDeleteProcExecDate - (i)トランザクションデータ削除処理対象年月
'
' 機能説明  : 設定した保持期間外のﾄﾗﾝｻﾞｸｼｮﾝﾃﾞｰﾀの削除を行う。
' 備考      :
'
------------------------------------------------------------------------------*/

--< プロシージャ名定義 >-----------------------------------------------------
     pVc2LogMode            IN  VARCHAR2    --// ＬＯＧモード
    ,pVc2OutputMode         IN  VARCHAR2    --// 出力モード
    ,pVc2OutputPath         IN  VARCHAR2    --// 出力ファイルパス
    ,pVc2OutputName         IN  VARCHAR2    --// 出力ファイル名
    ,pvc2UserId             IN  VARCHAR2    --// ユーザ名
    ,pvc2BusinessName       IN  VARCHAR2    --// 業務名
    ,pvc2PlantCd            IN  VARCHAR2    --// 工場コード
    ,pvcDeleteProcExecDate  IN  VARCHAR2    --// トランザクションデータ削除処理対象年月
    ) IS

    --// レコードの定義


    /* 定数の宣言 */
        METHOD_START                    VARCHAR2(20)  := 'Start';            --ログ用メソッド開始宣言
        METHOD_END                      VARCHAR2(12)  := 'End';              --ログ用メソッド終了宣言
        MY_SQL_NAME                     VARCHAR2(52) := 'sqlDeleteProc';    --ＰＬ／ＳＱＬ名
        LOGMSG_START_PGNM_DeleteProc    VARCHAR2(160) := '<< トランザクションデータ削除処理開始 >>';
        LOGMSG_END_PGNM_DeleteProc      VARCHAR2(160) := '<< トランザクションデータ削除処理終了 >>';
        LOGMSG_ERR                      VARCHAR2(32) := '異常終了';

        APS_COM_BATCH_START             VARCHAR2(28)    := 'ZZ09001';  --バッチ処理を開始しました  --A
        APS_COM_BATCH_END               VARCHAR2(28)    := 'ZZ09002';  --バッチ処理を終了しました  --A
        APS_COM_ORACLE_ERR              VARCHAR2(28)    := 'AK53401';  --oracleエラー --A

        excMaxcount                     EXCEPTION;  --保持期間ﾃｰﾌﾞﾙの取得件数が８件以下
        excSys_Mnt_Period_NULL          EXCEPTION;  --取得保持期間ﾃｰﾌﾞﾙの値がNULL


    --// 変数の定義
        UTL_FileHandle                  UTL_FILE.FILE_TYPE; --ファイルハンドル
        llngMaxCount                    NUMBER(5);          --保持期間ﾃｰﾌﾞﾙ件数カウント用
        blnRet                          BOOLEAN;                -- Function返却値
        lvc2Mrp_period                  VARCHAR2(40);   --MRP品目情報保持期間
        lvc2JobOdr_period               VARCHAR2(40);   --製番品目保持期間
        lvc2RcvIssue_period             VARCHAR2(40);   --計画外入出庫情報保持期間
        lvc2Stock_period                VARCHAR2(40);   --在庫情報保持期間
        lvc2OdAlm_period                VARCHAR2(40);   --所要量アラームリスト保持期間
        lvc2BusinessMsg_period          VARCHAR2(40);   --業務メッセージ情報保持期間
        lvc2ForPsT_period               VARCHAR2(40);   --製品構成トランザクション保持期間
        lvc2PchOdRtnRst_period          VARCHAR2(40);   --購入返品実績保持期間  2005/08/12追加
        lnumDeleteCount                 NUMBER(10);     --削除件数

        ldtmBusinessdate                DATE;           --業務日付取得用
        lvc2WkDateTime                  VARCHAR2(76);   --日付編集用
        lBlnRet                         boolean;        --共通関数の戻値
        lvc2Comment                     VARCHAR2(1024);  --コメント作成用
        lvc2Comment2                    VARCHAR2(1024);  --コメント作成用
        vc2RunChkComment                VARCHAR2(1024);  --実行位置確認用コメント作成作業領域
        vc2WorkCsvData                  VARCHAR(32767);         -- CSV出力データ作成用変数
        vc2ErrCd                        VARCHAR2(28);           -- 例外時、メッセージコード格納用
        vc2ErrDetail                    VARCHAR2(4096);         -- 例外時、詳細情報格納用
/* パラメータ検索用文字列 */
    vc2DELETE_CSV_PATH          CONSTANT VARCHAR2(96)  := 'M_SALES_DELETE_CSV_PATH';    -- CSV出力用パス検索用文字列
    LOGMSG_BATCH_EXP                CONSTANT VARCHAR2(200)  := '<<トランザクションデータ削除処理が異常終了しました。>>';
/* メッセージコードの宣言 */
    APS_COM_CSV_PATH_NOT_FOUND      CONSTANT VARCHAR2(28)   := 'KK10019';   -- 削除対象データＣＳＶ出力パスが取得できませんでした。
/********** CSVファイル出力用変数 **********/
    CSV_FilePath                      SYS_PARAMETER.VALUE%TYPE;
    vc2CsvTIssueInstIssiDemandName             VARCHAR2(60) := 'T_ISSUE_INST_DMD';                 --[出庫指示] (デマンド情報)
    vc2CsvTodExc4Name                          VARCHAR2(60) := 'T_OD_EXC4';                        --[所要量]のデマンド情報(（擬似品目以外）)
    vc2CsvTodInt4Name                          VARCHAR2(60) := 'T_OD_INT4' ;                       --[所要量]のデマンド情報(（擬似品目）)
    vc2CsvTRlPuchOdrTodName                    VARCHAR2(60) := 'T_RLSD_PUCH_ODR_TOD' ;             --[発注残](オーダ情報)
    vc2CsvTWorkInPcByPrcName                   VARCHAR2(60) := 'T_WORK_IN_PROC_BY_PROC';           --[作業系列別仕掛](オーダ情報)
    vc2CsvTWorkInPcByItemName                  VARCHAR2(60) := 'T_WORK_IN_PROC_BY_ITEM';           --[品目別仕掛](オーダ情報)
    vc2CsvTOdTypExc34Name                      VARCHAR2(60) := 'T_OD_EXC34';                       --[所要量]のオーダ情報
    vc2CsvTRlsdPuchOdrName                     VARCHAR2(60) := 'T_RLSD_PUCH_ODR';                  --[発注残](備品発注情報)
    vc2CsvTDelJobOdrOdName                     VARCHAR2(60) := 'T_DEL_JOB_ODR_OD';                 --[製番計画削除]
    vc2CsvTIssueInstJobName                    VARCHAR2(60) := 'T_ISSUE_INST_JOB_CD';              --[出庫指示] (製番情報)
    vc2CsvTRsPuchOdrJobName                    VARCHAR2(60) := 'T_RLSD_PUCH_ODR_JOB';              --[発注残](製番情報)
    vc2CsvTWkInPcByPrcJobName                  VARCHAR2(60) := 'T_WORK_IN_PROC_BY_PROC_JOB';       --[作業系列別仕掛](製番情報)
    vc2CsvTWkInPcByItemJobName                 VARCHAR2(60) := 'T_WORK_IN_PROC_BY_ITEM_JOB';       --[品目別仕掛](製番情報)
    vc2CsvTOprInstSlipItemName                 VARCHAR2(60) := 'T_OPR_INST_SLIP_ITEM';             --[作業指示伝票]品目別
    vc2CsvTOprInstSlipPrcName                  VARCHAR2(60) := 'T_OPR_INST_SLIP_PRC';              --[作業指示伝票]系列別
    vc2CsvTJobOdrAlcName                       VARCHAR2(60) := 'T_JOB_ODR_ALC';                    --[製番引当]
    vc2CsvTOdJobName                           VARCHAR2(60) := 'T_OD_JOB';                         --[所要量]製番情報
    vc2CsvTRcvIssueSkName                      VARCHAR2(60) := 'T_RCV_ISSUE_STOCK';                --[保管区別入出庫]計画外、移動入庫
    vc2CsvTRcvIssueMrpName                     VARCHAR2(60) := 'T_RCV_ISSUE_MRP';                  --[保管区別入出庫]MRP品目製番情報
    vc2CsvTItemStockName                       VARCHAR2(60) := 'T_ITEM_STOCK';                     --[保管区別品目在庫]
    vc2CsvTJobCdStockName                      VARCHAR2(60) := 'T_JOB_ODR_CD_STOCK';               --[保管区別製番在庫]
    vc2CsvTJobOdrName                          VARCHAR2(60) := 'T_JOB_ODR';                        --[製番計画]
    vc2CsvSJobCalcCtrlName                     VARCHAR2(60) := 'SYS_JOB_OD_CALC_CTRL';             --[所要量計算制御(製番)]
    vc2CsvTOutputRsltName                      VARCHAR2(60) := 'T_OUTPUT_RSLT';                    --[出来高実績]
    vc2CsvTPOdrRnRsltName                      VARCHAR2(60) := 'T_PUCH_ODR_RTN_RSLT';              --[購入返品実績]
    vc2CsvSysMsgLogName                        VARCHAR2(60) := 'SYS_MSG_LOG';                      --[業務メッセージ]
    vc2CsvSysPsTName                           VARCHAR2(60) := 'SYS_PS_T';                         --[製品構成トランザクション]
    vc2CsvTExtPlanName                         VARCHAR2(60) := 'T_EXTERNAL_PLAN';                  --[外部計画]
    vc2CsvTOdAlarmName                         VARCHAR2(60) := 'T_OD_ALARM';                       --[所要量アラームリスト]
--20150807 ADD START BY SYSCOM
    vc2CsvTRcvIssAiIfDataName                  VARCHAR2(60) := 'T_RCV_ISSUE_AI_IF_DATA';        --[入出庫別会計連携情報]
--20150807 ADD END BY SYSCOM

    vc2CsvTAcptRsltName                        VARCHAR2(60) := 'T_ACPT_RSLT_TOD';                  --[受入実績(オーダ)]
    vc2CsvTAcptRsltBhName                      VARCHAR2(60) := 'T_ACPT_RSLT';                      --[受入実績(備品発注情報)]
    vc2CsvTInspcRsltName                       VARCHAR2(60) := 'T_INSPC_RSL_TOD';                  --[検査実績(オーダ)]
    vc2CsvTInspcRsltBhName                     VARCHAR2(60) := 'T_INSPC_RSL';                      --[検査実績(備品発注情報)]
    vc2CsvTInspcDefectName                     VARCHAR2(60) := 'T_INSPC_DEFECT_TOD';               --[検査不良(オーだ)]
    vc2CsvTInspcDefectBhName                   VARCHAR2(60) := 'T_INSPC_DEFECT';                   --[検査不良(備品発注情報)]
    vc2CsvTPastInspcAcptName                   VARCHAR2(60) := 'T_PAST_INSPC_ACPT_TOD';            --[検収履歴(オーダ)]
    vc2CsvTPastInspcAcptBhName                 VARCHAR2(60) := 'T_PAST_INSPC_ACPT';                --[検収履歴(備品発注情報)]
    vc2CsvTPastInspcAcptAmountName             VARCHAR2(60) := 'T_PAST_INSPC_ACPT_AMOUNT_TOD';     --[検収金額履歴(オーダ)]
    vc2CsvTPastInspcName                       VARCHAR2(60) := 'T_PAST_INSPC_ACPT_AMOUNT';         --[検収金額履歴(備品発注情報)]
    vc2CsvTOprRsltSkName                       VARCHAR2(60) := 'T_OPR_RSLT_ITEM';                  --[作業実績（品目別仕掛）]
    vc2CsvTDefectSkName                        VARCHAR2(60) := 'T_DEFECT_ITEM';                    --[作業不良（品目別仕掛）]
    vc2CsvTOprRsltKeName                       VARCHAR2(60) := 'T_OPR_RSLT_PRC';                   --[作業実績（系列別仕掛）]
    vc2CsvTDefectKeName                        VARCHAR2(60) := 'T_DEFECT_PRC';                     --[作業不良（系列別仕掛）]
    vc2CsvTOdAlarmRName                        VARCHAR2(60) := 'SYS_OD_ALARM_NO_CTRL_EXC34';       --[所要量アラームリスト(オーだ)]
    vc2CsvTMrpReexplosionName                  VARCHAR2(60) := 'T_MRP_REEXPLOSION_EXC34';          --[所要量再展開依頼(オーだ)]
    vc2CsvTRcvIssueItemSkName                  VARCHAR2(60) := 'T_RCV_ISSUE_ITEM_STOCK';        --[品目別入出庫]計画外、移動入庫
    vc2CsvTRcvIssueItemMrpName                 VARCHAR2(60) := 'T_RCV_ISSUE_ITEM_MRP';          --[品目別入出庫]MRP品目製番情報
    
    vc2CsvTAcptRsltJobName                     VARCHAR2(60) := 'T_ACPT_RSLT_JOB';                  --[受入実績(製番)]
    vc2CsvTInspcRsltJobName                    VARCHAR2(60) := 'T_INSPC_RSL_JOB';                  --[検査実績(製番)]
    vc2CsvTInspcDefectJobName                  VARCHAR2(60) := 'T_INSPC_DEFECT_JOB';               --[検査不良(製番)]
    vc2CsvTPastInspcAcptJobName                VARCHAR2(60) := 'T_PAST_INSPC_ACPT_JOB';            --[検収履歴(製番)]
    vc2CsvTPastInspcAcptJobAmName              VARCHAR2(60) := 'T_PAST_INSPC_ACPT_AMOUN_JOB';      --[検収金額履歴(製番)]
    vc2CsvTOdAlarmRJobName                     VARCHAR2(60) := 'SYS_OD_ALARM_NO_CTRL_JOB';         --[所要量アラームリスト(製番)]
    vc2CsvTMrpReexplosionJobName               VARCHAR2(60) := 'T_MRP_REEXPLOSION_JOB';            --[所要量再展開依頼(製番)]

    uftWorkHandl                    UTL_FILE.FILE_TYPE;     -- CSV出力用ワーク変数
    numWorkCnt                      NUMBER(6);              -- CSV作成チェック用ワーク変数
/* EXCEPTION の宣言 */
    excPARAMETER_ERR                EXCEPTION;                   -- パラメータ検索エラー
    --// カーソルの宣言

    --// 保持期間ﾃｰﾌﾞﾙの読込
    cursor cur_Sys_Mnt_Period (
        c_PLANT_CD      VARCHAR2
        )is
        select
            *
        from sys_mnt_period
        where plant_cd = c_PLANT_CD
        order by mnt_data_typ; --A

        ltypSys_Mnt_Period  cur_Sys_Mnt_Period%ROWTYPE;     --保持期間ﾃｰﾌﾞﾙの読込
   /*-----------------------------------------------------------------
    'SubFncTIssueInstDdCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : [出庫指示] (デマンド情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate    MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd          工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [出庫指示] (デマンド情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTIssueInstDdCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTIssueInstIDemand(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  ISSUE_INST_CD,             --出庫指示番号
        PLANT_CD,                 --工場コード
        OD_NO,                     --オーダデマンド番号
        ITEM_CD,                 --出庫品目番号
        PS_EDITION,                 --出庫品目構成版数
        PUCH_ODR_CD,             --発注番号
        COMPANY_CD,                 --会社コード
        VEND_CD,                 --取引先コード
        CONS_TYP,                 --支給区分
        WORK_ODR_CD,               --作業計画番号
        WORK_IN_PROC_CD,           --仕掛作業コード
        WS_CD,                     --作業区コード
        WH_CD,                     --出庫先保管区コード
        ISSUE_INST_UNIT_QTY,         --出庫指示単位数
        ISSUE_INST_UNIT_DENOMINATOR,   --出庫指示単位数分母
        ISSUE_INST_UNIT_NUMERATOR,     --出庫指示単位数分子
        ISSUE_INST_QTY,              --出庫指示数
        TOTAL_ISSUE_QTY,         --出庫累計数
        SCDL_ISSUE_DATE,         --出庫予定日
        ISSUE_CMPLT_DATE,         --出庫完了日
        ISSUE_TYP,                    --出庫指示出庫区分
        ISSUE_CMPLT_FLG,         --出庫完了フラグ
        ISSUE_INST_ISS_FLG,       --出庫指示書発行済みフラグ
        ISSUE_INST_ISS_DATE,       --出庫指示書発行日
        ISSUE_INST_COMMENT,       --出庫指示備考
        LOT_CTRL_FLG,             --ロット管理フラグ
        CREATED_DATE,             --作成日
        CREATED_BY,             --作成者
        CREATED_PRG_NM,         --作成プログラム名
        UPDATED_DATE,             --更新日
        UPDATED_BY,             --更新者
        UPDATED_PRG_NM,         --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM T_ISSUE_INST ISS_I
            where exists(select 'x' from t_od OD
                            where ISS_I.od_no = OD.od_no
                              and OD.plant_CD = vcPlant_Cd  --A 工場コード
                              and OD.job_odr_cd is null                                       --製番
                              and OD.dm_sts_typ = 9                                       --デマンド状態区分
                              and OD.issue_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --出庫完了日 <= MRP品目情報保持期間
      recTIssueInstIDemand curTIssueInstIDemand%ROWTYPE;
    BEGIN
      OPEN curTIssueInstIDemand(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTIssueInstIDemand INTO recTIssueInstIDemand;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTIssueInstIDemand%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTIssueInstIssiDemandName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2)|| '.CSV','W');
        END IF;
        vc2WorkCsvData := recTIssueInstIDemand.ISSUE_INST_CD || ',';                                  --出庫指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.PLANT_CD || ',';                     --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.OD_NO || ',';                        --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ITEM_CD || ',';                      --出庫品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.PS_EDITION || ',';                   --出庫品目構成版数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.PUCH_ODR_CD || ',';                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.COMPANY_CD || ',';                   --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.VEND_CD || ',';                      --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CONS_TYP || ',';                     --支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WORK_ODR_CD || ',';                  --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WORK_IN_PROC_CD || ',';              --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WS_CD || ',';                        --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.WH_CD || ',';                        --出庫先保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_UNIT_QTY || ',';          --出庫指示単位数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_UNIT_DENOMINATOR || ',';  --出庫指示単位数分母
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_UNIT_NUMERATOR || ',';    --出庫指示単位数分子
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_QTY || ',';               --出庫指示数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.TOTAL_ISSUE_QTY || ',';              --出庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.SCDL_ISSUE_DATE || ',';              --出庫予定日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_CMPLT_DATE || ',';             --出庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_TYP || ',';                    --出庫指示出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_CMPLT_FLG || ',';              --出庫完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_ISS_FLG || ',';           --出庫指示書発行済み
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_ISS_DATE || ',';          --出庫指示書発行日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.ISSUE_INST_COMMENT || ',';          --出庫指示備考
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.LOT_CTRL_FLG || ',';                 --ロット管理フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CREATED_DATE || ',';                 --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CREATED_BY || ',';                   --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.CREATED_PRG_NM || ',';               --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.UPDATED_DATE || ',';                 --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.UPDATED_BY || ',';                   --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.UPDATED_PRG_NM || ',';               --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstIDemand.MODIFY_COUNT || ',';                 --更新数
                 
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTIssueInstIDemand   INTO recTIssueInstIDemand;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTIssueInstIDemand;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTIssueInstIDemand%ISOPEN = TRUE THEN
          CLOSE curTIssueInstIDemand;
        END IF;
        RETURN FALSE;

    END SubFncTIssueInstDdCsvWrite;
  /*-----------------------------------------------------------------
    'SubFncTOdTypExcCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : [所要量] (擬似品目以外）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate    MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd          工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量] (擬似品目以外）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdTypExcCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdTypExc(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --オーダデマンド番号
        ALC_GRP_CD,        --引当グループコード
        PLANT_CD,        --工場コード
        ITEM_CD,        --品目番号
        PS_EDITION,        --所要量品目構成版数
        PATTERN_CD,        --パターンコード
        JOB_ODR_CD,        --製番
        JOB_ODR_DETAIL_NO,    --製番枝番
        JOB_ODR_CANCEL_NO,    --製番取消発生番号
        ODR_STS_TYP,      --オーダ状態区分
        DM_STS_TYP,        --デマンド状態区分
        OD_TYP,            --オーダデマンド区分
        DUE_DATE,        --要求納期
        ODR_START_DATE,      --手配着手日
        PRD_DUE_DATE,      --製造納期
        PRD_START_DATE,      --製造着手日
        DM_QTY,            --デマンド数
        ODR_QTY,        --オーダ数
        MRP_ODR_TYP,      --品目手配区分
        OUTSIDE_TYP,      --所要量内外作区分
        ISSUE_TYP,        --所要量出庫区分
        ODR_LT,            --手配リードタイム
        FIXED_LT,        --固定分リードタイム
        PROP_LT,        --比例分リードタイム
        SAFETY_LT,        --安全日数
        ISSUE_LT,        --払出リードタイム
        PROP_LOT_SIZE,      --比例分ロットサイズ
        PS_LT_FLG,        --製品構成リードタイム使用フラグ
        PS_FIXED_LT,      --製品構成固定分リードタイム
        PS_PROP_LT,        --製品構成比例分リードタイム
        PS_PROP_LOT_SIZE,    --製品構成比例分ロットサイズ
        PS_UNIT_QTY,      --製品構成単位数
        PS_UNIT_DENOMINATOR,  --製品構成単位数分母
        PS_UNIT_NUMERATOR,    --製品構成単位数分子
        TOTAL_RCV_QTY,      --入庫累計数
        RCV_CMPLT_DATE,      --入庫完了日
        TOTAL_ISSUE_INST_QTY,  --出庫指示累計数
        TOTAL_ISSUE_QTY,    --出庫累計数
        ISSUE_CMPLT_DATE,    --出庫完了日
        OD_GNR_TYP,        --所要量発生処理区分
        OD_LEVEL_NO,      --所要量レベル番号
        PARENT_OD_NO,      --親オーダデマンド番号
        ITEM_SPOIL,        --所要量品目仕損率
        PS_SPOIL,        --所要量構成仕損率
        CONS_TYP,        --構成支給区分
        EFF_PHASE_IN_DATE,    --所要量有効開始日
        EFF_PHASE_OUT_DATE,    --所要量有効終了日
        MRP_TYP,        --所要量処理区分
        EXTERNAL_DM_FLG,    --外部デマンドフラグ
        ODR_RELEASE_FLG,    --オーダ発効済フラグ
        DUE_DATE_TIME,      --要求納期日時
        PRD_DUE_DATE_TIME,    --製造納期日時
        CREATED_DATE,      --作成日
        CREATED_BY,        --作成者
        CREATED_PRG_NM,      --作成プログラム名
        UPDATED_DATE,      --更新日
        UPDATED_BY,        --更新者
        UPDATED_PRG_NM,      --更新プログラム名
        MODIFY_COUNT      --更新数
          FROM T_od
            where job_odr_cd is null                                        --製番
              and plant_CD = vcPlant_Cd    --A 工場コード
              and dm_sts_typ = 9                                            --デマンド状態区分
              and issue_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --出庫完了日 <= MRP品目情報保持期間
              and not ( od_typ = 4 );                                       --オーダデマンド区分
      recTOdTypExc curTOdTypExc%ROWTYPE;
    BEGIN
      OPEN curTOdTypExc(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdTypExc INTO recTOdTypExc;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOdTypExc%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTodExc4Name || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdTypExc.OD_NO || ',';                                  --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ALC_GRP_CD  || ',';           --引当グループコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PLANT_CD || ',';             --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ITEM_CD || ',';              --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_EDITION  || ',';           --所要量品目構成版数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PATTERN_CD  || ',';           --パターンコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.JOB_ODR_CD  || ',';           --製番
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.JOB_ODR_DETAIL_NO  || ',';   --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.JOB_ODR_CANCEL_NO  || ',';   --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_STS_TYP|| ',';           --オーダ状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DM_STS_TYP|| ',';            --デマンド状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OD_TYP  || ',';               --オーダデマンド区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DUE_DATE|| ',';              --要求納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_START_DATE || ',';       --手配着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PRD_DUE_DATE || ',';         --製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PRD_START_DATE  || ',';       --製造着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DM_QTY || ',';               --デマンド数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_QTY || ',';              --オーダ数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.MRP_ODR_TYP || ',';          --品目手配区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OUTSIDE_TYP || ',';          --所要量内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ISSUE_TYP || ',';            --所要量出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_LT  || ',';               --手配リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.FIXED_LT || ',';             --固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PROP_LT || ',';              --比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.SAFETY_LT || ',';            --安全日数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ISSUE_LT || ',';             --払出リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PROP_LOT_SIZE || ',';        --比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_LT_FLG || ',';            --製品構成リードタイム使用フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_FIXED_LT || ',';          --製品構成固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_PROP_LT  || ',';           --製品構成比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_PROP_LOT_SIZE || ',';     --製品構成比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_UNIT_QTY || ',';          --製品構成単位数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_UNIT_DENOMINATOR || ',';      --製品構成単位数分母
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_UNIT_NUMERATOR  || ',';       --製品構成単位数分子
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.TOTAL_RCV_QTY || ',';        --入庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.RCV_CMPLT_DATE  || ',';       --入庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.TOTAL_ISSUE_INST_QTY  || ',';       --出庫指示累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.TOTAL_ISSUE_QTY  || ',';       --出庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ISSUE_CMPLT_DATE  || ',';       --出庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OD_GNR_TYP || ',';           --所要量発生処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.OD_LEVEL_NO || ',';          --所要量レベル番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PARENT_OD_NO || ',';         --親オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ITEM_SPOIL  || ',';           --所要量品目仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PS_SPOIL || ',';             --所要量構成仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CONS_TYP || ',';             --構成支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.EFF_PHASE_IN_DATE || ',';    --所要量有効開始日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.EFF_PHASE_OUT_DATE  || ',';   --所要量有効終了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.MRP_TYP || ',';              --所要量処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.EXTERNAL_DM_FLG || ',';      --外部デマンドフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.ODR_RELEASE_FLG || ',';      --オーダ発効済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.DUE_DATE_TIME || ',';        --要求納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.PRD_DUE_DATE_TIME || ',';    --製造納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CREATED_DATE || ',';         --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CREATED_BY || ',';           --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.CREATED_PRG_NM  || ',';      --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.UPDATED_DATE  || ',';        --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.UPDATED_BY || ',';           --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.UPDATED_PRG_NM  || ',';      --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc.MODIFY_COUNT || ',';         --更新数
                 
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdTypExc   INTO recTOdTypExc;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdTypExc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdTypExc%ISOPEN = TRUE THEN
          CLOSE curTOdTypExc;
        END IF;
        RETURN FALSE;

    END SubFncTOdTypExcCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOdTypIntCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : [所要量] (擬似品目）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate    MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd          工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量] (擬似品目）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdTypIntCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdTypInt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --オーダデマンド番号
        ALC_GRP_CD,        --引当グループコード
        PLANT_CD,        --工場コード
        ITEM_CD,        --品目番号
        PS_EDITION,        --所要量品目構成版数
        PATTERN_CD,        --パターンコード
        JOB_ODR_CD,        --製番
        JOB_ODR_DETAIL_NO,    --製番枝番
        JOB_ODR_CANCEL_NO,    --製番取消発生番号
        ODR_STS_TYP,      --オーダ状態区分
        DM_STS_TYP,        --デマンド状態区分
        OD_TYP,            --オーダデマンド区分
        DUE_DATE,        --要求納期
        ODR_START_DATE,      --手配着手日
        PRD_DUE_DATE,      --製造納期
        PRD_START_DATE,      --製造着手日
        DM_QTY,            --デマンド数
        ODR_QTY,        --オーダ数
        MRP_ODR_TYP,      --品目手配区分
        OUTSIDE_TYP,      --所要量内外作区分
        ISSUE_TYP,        --所要量出庫区分
        ODR_LT,            --手配リードタイム
        FIXED_LT,        --固定分リードタイム
        PROP_LT,        --比例分リードタイム
        SAFETY_LT,        --安全日数
        ISSUE_LT,        --払出リードタイム
        PROP_LOT_SIZE,      --比例分ロットサイズ
        PS_LT_FLG,        --製品構成リードタイム使用フラグ
        PS_FIXED_LT,      --製品構成固定分リードタイム
        PS_PROP_LT,        --製品構成比例分リードタイム
        PS_PROP_LOT_SIZE,    --製品構成比例分ロットサイズ
        PS_UNIT_QTY,      --製品構成単位数
        PS_UNIT_DENOMINATOR,  --製品構成単位数分母
        PS_UNIT_NUMERATOR,    --製品構成単位数分子
        TOTAL_RCV_QTY,      --入庫累計数
        RCV_CMPLT_DATE,      --入庫完了日
        TOTAL_ISSUE_INST_QTY,  --出庫指示累計数
        TOTAL_ISSUE_QTY,    --出庫累計数
        ISSUE_CMPLT_DATE,    --出庫完了日
        OD_GNR_TYP,        --所要量発生処理区分
        OD_LEVEL_NO,      --所要量レベル番号
        PARENT_OD_NO,      --親オーダデマンド番号
        ITEM_SPOIL,        --所要量品目仕損率
        PS_SPOIL,        --所要量構成仕損率
        CONS_TYP,        --構成支給区分
        EFF_PHASE_IN_DATE,    --所要量有効開始日
        EFF_PHASE_OUT_DATE,    --所要量有効終了日
        MRP_TYP,        --所要量処理区分
        EXTERNAL_DM_FLG,    --外部デマンドフラグ
        ODR_RELEASE_FLG,    --オーダ発効済フラグ
        DUE_DATE_TIME,      --要求納期日時
        PRD_DUE_DATE_TIME,    --製造納期日時
        CREATED_DATE,      --作成日
        CREATED_BY,        --作成者
        CREATED_PRG_NM,      --作成プログラム名
        UPDATED_DATE,      --更新日
        UPDATED_BY,        --更新者
        UPDATED_PRG_NM,      --更新プログラム名
        MODIFY_COUNT      --更新数
          FROM  T_od OD1
            where not exists( select od_no from T_od OD2 WHERE OD1.od_no = OD2.parent_od_no )
              and OD1.plant_CD = vcPlant_Cd    --A 工場コード
              and OD1.job_odr_cd is null                               --製番
              and OD1.dm_sts_typ = 9                                   --デマンド状態区分
              and OD1.updated_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --出庫完了日 <= MRP品目情報保持期間
              and OD1.od_typ = 4;                                      --オーダデマンド区分
      recTOdTypInt curTOdTypInt%ROWTYPE;
    BEGIN
      OPEN curTOdTypInt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdTypInt INTO recTOdTypInt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOdTypInt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_'  || vc2CsvTodInt4Name || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdTypInt.OD_NO || ',';                                  --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ALC_GRP_CD  || ',';           --引当グループコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PLANT_CD || ',';             --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ITEM_CD || ',';              --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_EDITION  || ',';           --所要量品目構成版数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PATTERN_CD  || ',';           --パターンコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.JOB_ODR_CD  || ',';           --製番
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.JOB_ODR_DETAIL_NO  || ',';   --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.JOB_ODR_CANCEL_NO  || ',';   --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_STS_TYP|| ',';           --オーダ状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DM_STS_TYP|| ',';            --デマンド状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OD_TYP  || ',';               --オーダデマンド区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DUE_DATE|| ',';              --要求納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_START_DATE || ',';       --手配着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PRD_DUE_DATE || ',';         --製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PRD_START_DATE  || ',';       --製造着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DM_QTY || ',';               --デマンド数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_QTY || ',';              --オーダ数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.MRP_ODR_TYP || ',';          --品目手配区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OUTSIDE_TYP || ',';          --所要量内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ISSUE_TYP || ',';            --所要量出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_LT  || ',';               --手配リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.FIXED_LT || ',';             --固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PROP_LT || ',';              --比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.SAFETY_LT || ',';            --安全日数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ISSUE_LT || ',';             --払出リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PROP_LOT_SIZE || ',';        --比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_LT_FLG || ',';            --製品構成リードタイム使用フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_FIXED_LT || ',';          --製品構成固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_PROP_LT  || ',';           --製品構成比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_PROP_LOT_SIZE || ',';     --製品構成比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_UNIT_QTY || ',';          --製品構成単位数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_UNIT_DENOMINATOR || ',';      --製品構成単位数分母
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_UNIT_NUMERATOR  || ',';       --製品構成単位数分子
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.TOTAL_RCV_QTY || ',';        --入庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.RCV_CMPLT_DATE  || ',';       --入庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.TOTAL_ISSUE_INST_QTY  || ',';       --出庫指示累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.TOTAL_ISSUE_QTY  || ',';       --出庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ISSUE_CMPLT_DATE  || ',';       --出庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OD_GNR_TYP || ',';           --所要量発生処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.OD_LEVEL_NO || ',';          --所要量レベル番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PARENT_OD_NO || ',';         --親オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ITEM_SPOIL  || ',';           --所要量品目仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PS_SPOIL || ',';             --所要量構成仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CONS_TYP || ',';             --構成支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.EFF_PHASE_IN_DATE || ',';    --所要量有効開始日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.EFF_PHASE_OUT_DATE  || ',';   --所要量有効終了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.MRP_TYP || ',';              --所要量処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.EXTERNAL_DM_FLG || ',';      --外部デマンドフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.ODR_RELEASE_FLG || ',';      --オーダ発効済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.DUE_DATE_TIME || ',';        --要求納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PRD_DUE_DATE_TIME || ',';    --製造納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CREATED_DATE || ',';         --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.PARENT_OD_NO || ',';         --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CREATED_BY  || ',';           --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.CREATED_PRG_NM  || ',';       --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.UPDATED_DATE || ',';         --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.UPDATED_PRG_NM  || ',';       --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypInt.MODIFY_COUNT || ',';         --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdTypInt   INTO recTOdTypInt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdTypInt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdTypInt%ISOPEN = TRUE THEN
          CLOSE curTOdTypInt;
        END IF;
        RETURN FALSE;

    END SubFncTOdTypIntCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTRlPuchOdrTodCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : [発注残] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [発注残] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRlPuchOdrTodCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRlPuchOdrTod(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,            --発注番号
        ITEM_CD,                --品目番号
        WH_CD,                    --受入場所
        NON_NO_ITEM_NAME,        --備品発注品目名
        NON_NO_ITEM_TYP,        --備品発注製品区分
        COMPANY_CD,                --会社コード
        VEND_CD,                --取引先コード
        PLANT_CD,                --工場コード
        PUCH_ODR_PERSON,        --発注担当者
        PUCH_ODR_START_DATE,      --発注着手日
        PUCH_ODR_DLV_DATE,        --発注納期
        PUCH_ODR_QTY,            --発注数
        NON_NO_ITEM_PUCH_ODR_UNIT,    --備品発注単位
        UNIT_COST_TYP,            --単価区分
        UNIT_COST,                --単価
        PROCESSING_COST,        --加工費
        MATERIAL_COST,            --材料費
        OTHER_OVERHEADS,        --その他経費
        DISC_AMOUNT,            --値引金額
        PUCH_ODR_AMOUNT,        --発注金額
        PUCH_ODR_GNR_TYP,        --発注発生処理区分
        PUCH_ODR_INST_DATE,        --発注指示日
        PUCH_ODR_INST_SLIP_ISS_FLG,    --発注伝票発行済みフラグ
        PUCH_ODR_SLIP_ISS_DATE,      --発注伝票発行日
        ACPT_CMPLT_DATE,        --受入完了日
        PUCH_ODR_STS_TYP,        --発注状態区分
        INSPC_CMPLT_FLG,        --検査完了フラグ
        INSPC_CMPLT_DATE,        --検査完了日
        CONFIRM_DLV_DATE,        --回答納期
        CONFIRM_DLV_DATE_COMMENT,    --回答納期備考
        SPL_ITEM_TYP,            --受給品区分
        ACPT_INSPC_TYP,            --発注時受入検査区分
        INV_CTRL_FLG,            --在庫管理フラグ
        WORK_ODR_CD,            --作業計画番号
        WORK_IN_PROC_CD,        --仕掛作業コード
        OD_NO,                    --オーダデマンド番号
        PUCH_ODR_COMMENT,        --発注備考
        ODR_CD,                    --注文番号
        DETAIL_NO,                --明細番号
        RATE_JUDGE_DATE,        --レート判定日
        EXCH_RATE,                --為替レート
        TAX_RATE_1,                --税率1
        TAX_RATE_2,                --税率2
        TAX_RATE_3,                --税率3
        NET_AMOUNT,                --本体金額
        TAX_AMOUNT_1,            --税額1
        TAX_AMOUNT_2,            --税額2
        TAX_AMOUNT_3,            --税額3
        AMOUNT_INCLUDE_TAX,        --税込金額
        HOME_CUR_AMOUNT,        --邦貨金額
        TAX_CD,                    --消費税コード
        TAX_ROUND_TYP,            --税端数区分
        NON_NO_ITEM_FLG,        --備品発注フラグ
        PUCH_ODR_EDI_ISS_FLG,      --ＥＤＩデータ出力済フラグ
        PUCH_ODR_EDI_ISS_DATE,      --ＥＤＩデータ出力日
        ODR_CANCEL_EDI_ISS_DATE,    --ＥＤＩデータ取消出力日
        PUCH_ODR_FAX_ISS_FLG,      --ＦＡＸデータ出力済フラグ
        PUCH_ODR_FAX_ISS_DATE,      --ＦＡＸデータ出力日
        PUCH_ODR_MAIL_ISS_FLG,      --ＭＡＩＬデータ出力済フラグ
        PUCH_ODR_MAIL_ISS_DATE,      --ＭＡＩＬデータ出力日
        ODR_CANCEL_SLIP_ISS_FLG,    --注文取消伝票発行フラグ
        ODR_CANCEL_SLIP_ISS_DATE,    --取消伝票発行日
        ODR_CANCEL_CAUSE_CD,      --取消理由コード
        DIRECT_FLG,                --直送品フラグ
        CUST_CD,                --得意先コード
        ODR_H_NO,                --受注伝票番号
        ODR_D_SEQ_NO,            --受注明細発生連番
        DELV_CD,                --納品場所コード
        CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT,            --更新数
        APPR_ID,                --確定実行者
        APPR_DATE              --確定日
          FROM  T_RLSD_PUCH_ODR RLSD
                where exists(select 'x' from  T_od OD1
                                where  RLSD.od_no = OD1.od_no
                                  and   OD1.plant_CD = vcPlant_Cd    --A 工場コード
                                  and   OD1.job_odr_cd is null                                        --製番
                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')    --入庫完了日 <= MRP品目情報保持期間
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
      recTRlPuchOdrTod curTRlPuchOdrTod%ROWTYPE;
    BEGIN
      OPEN curTRlPuchOdrTod(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTRlPuchOdrTod INTO recTRlPuchOdrTod;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRlPuchOdrTod%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRlPuchOdrTodName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRlPuchOdrTod.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ITEM_CD  || ',';                 --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.WH_CD || ',';                      --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_NAME  || ',';         --備品発注品目名
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_TYP  || ',';         --備品発注製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.COMPANY_CD  || ',';                 --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.VEND_CD  || ',';                 --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_PERSON|| ',';             --発注担当者
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_START_DATE|| ',';         --発注着手日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_DLV_DATE  || ',';         --発注納期
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_QTY|| ',';                --発注数
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --備品発注単位
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UNIT_COST_TYP || ',';              --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UNIT_COST  || ',';                 --単価
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PROCESSING_COST || ',';            --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.MATERIAL_COST || ',';              --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.OTHER_OVERHEADS || ',';            --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DISC_AMOUNT || ',';                --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_AMOUNT || ',';            --発注金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_GNR_TYP  || ',';         --発注発生処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_INST_DATE || ',';         --発注指示日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_INST_SLIP_ISS_FLG || ','; --発注伝票発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_SLIP_ISS_DATE || ',';     --発注伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ACPT_CMPLT_DATE || ',';            --受入完了日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_STS_TYP || ',';           --発注状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.INSPC_CMPLT_FLG || ',';            --検査完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.INSPC_CMPLT_DATE || ',';           --検査完了日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CONFIRM_DLV_DATE  || ',';         --回答納期
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CONFIRM_DLV_DATE_COMMENT || ',';   --回答納期備考
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.SPL_ITEM_TYP || ',';               --受給品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ACPT_INSPC_TYP || ',';             --発注時受入検査区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.INV_CTRL_FLG  || ',';             --在庫管理フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.WORK_ODR_CD || ',';                --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.WORK_IN_PROC_CD  || ',';         --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.OD_NO  || ',';                     --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_COMMENT  || ',';         --発注備考
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CD  || ',';                     --注文番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DETAIL_NO || ',';                  --明細番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.RATE_JUDGE_DATE || ',';            --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.EXCH_RATE || ',';                  --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_RATE_1  || ',';                 --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_RATE_2 || ',';                 --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_RATE_3 || ',';                 --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NET_AMOUNT || ',';                 --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_AMOUNT_1  || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_AMOUNT_2 || ',';               --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_AMOUNT_3 || ',';               --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.AMOUNT_INCLUDE_TAX || ',';         --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.HOME_CUR_AMOUNT || ',';            --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_CD || ',';                     --消費税コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.TAX_ROUND_TYP || ',';              --税端数区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.NON_NO_ITEM_FLG || ',';            --備品発注フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_EDI_ISS_FLG  || ',';     --ＥＤＩデータ出力済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_EDI_ISS_DATE  || ',';     --ＥＤＩデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_EDI_ISS_DATE || ',';    --ＥＤＩデータ取消出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_FAX_ISS_FLG  || ',';     --ＦＡＸデータ出力済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_FAX_ISS_DATE || ',';      --ＦＡＸデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_MAIL_ISS_FLG  || ',';     --ＭＡＩＬデータ出力済フラ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.PUCH_ODR_MAIL_ISS_DATE || ',';     --ＭＡＩＬデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_SLIP_ISS_FLG || ',';    --注文取消伝票発行フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_SLIP_ISS_DATE || ',';   --取消伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_CANCEL_CAUSE_CD  || ',';     --取消理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DIRECT_FLG || ',';                 --直送品フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CUST_CD || ',';                    --得意先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_H_NO || ',';                   --受注伝票番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.ODR_D_SEQ_NO  || ',';             --受注明細発生連番
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.DELV_CD || ',';                    --納品場所コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.MODIFY_COUNT || ',';               --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.APPR_ID || ',';                    --確定実行者
        vc2WorkCsvData := vc2WorkCsvData || recTRlPuchOdrTod.APPR_DATE || ',';                  --確定日
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRlPuchOdrTod   INTO recTRlPuchOdrTod;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRlPuchOdrTod;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRlPuchOdrTod%ISOPEN = TRUE THEN
          CLOSE curTRlPuchOdrTod;
        END IF;
        RETURN FALSE;

    END SubFncTRlPuchOdrTodCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTAcptRsltCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [受入実績] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [受入実績] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTAcptRsltCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTAcptRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,         --発注番号
        ACPT_NO,                     --受入回数
        ACPT_QTY,                    --受入数
        ACPT_DATE,                   --受入日
        UNIT_COST,                   --単価
        UNIT_COST_TYP,               --単価区分
        PROCESSING_COST,             --加工費
        MATERIAL_COST,               --材料費
        OTHER_OVERHEADS,             --その他経費
        DISC_AMOUNT,                 --値引金額
        PUCH_ODR_AMOUNT,             --受入金額
        ACPT_STS_TYP,                --受入状態区分
        DLV_CD,                      --納品書番号
        PLANT_CD,                    --工場コード
        WH_CD,                       --受入場所
        ACPT_RSLT_COMMENT,           --受入実績備考
        INVOICE_CD,                  --送り状番号
        RATE_JUDGE_DATE,             --レート判定日
        EXCH_RATE,                   --為替レート
        TAX_RATE_1,                  --税率1
        TAX_RATE_2,                  --税率2
        TAX_RATE_3,                  --税率3
        NET_AMOUNT,                  --本体金額
        TAX_AMOUNT_1,                --税額1
        TAX_AMOUNT_2,                --税額2
        TAX_AMOUNT_3,                --税額3
        AMOUNT_INCLUDE_TAX,          --税込金額
        HOME_CUR_AMOUNT,             --邦貨金額
        TAX_CD,                      --消費税コード
        TAX_ROUND_TYP,               --税端数区分
        VEND_LOT_NO,                 --メーカロット番号
        LOT_NO,                      --在庫ロット番号
        ACPT_CRCT_NO,                --受入訂正回数
        CREATED_DATE,                --作成日
        CREATED_BY,                  --作成者
        CREATED_PRG_NM,              --作成プログラム名
        UPDATED_DATE,                --更新日
        UPDATED_BY,                  --更新者
        UPDATED_PRG_NM,              --更新プログラム名
        MODIFY_COUNT,                --更新数
        ITEM_CD,                     --品目番号
        NON_NO_ITEM_NAME,            --備品発注品目名
        INSPC_WH_CD                  --検査待ち保管区
          FROM  T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTAcptRslt curTAcptRslt%ROWTYPE;
    BEGIN
      OPEN curTAcptRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTAcptRslt INTO recTAcptRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTAcptRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTAcptRsltName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTAcptRslt.PUCH_ODR_CD || ',';                                 --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_NO  || ',';                  --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_QTY  || ',';                 --受入数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_DATE  || ',';                --受入日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST  || ',';                --単価
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST_TYP  || ',';            --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PROCESSING_COST || ',';           --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MATERIAL_COST || ',';             --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.OTHER_OVERHEADS || ',';           --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DISC_AMOUNT  || ',';              --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PUCH_ODR_AMOUNT || ',';           --受入金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_STS_TYP || ',';              --受入状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DLV_CD  || ',';                   --納品書番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.WH_CD  || ',';                    --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_RSLT_COMMENT  || ',';        --受入実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INVOICE_CD  || ',';               --送り状番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.RATE_JUDGE_DATE || ',';           --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.EXCH_RATE  || ',';                --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_1  || ',';               --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_2  || ',';               --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_3  || ',';               --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NET_AMOUNT  || ',';               --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_1  || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_2  || ',';             --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_3  || ',';             --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.AMOUNT_INCLUDE_TAX || ',';        --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.HOME_CUR_AMOUNT || ',';           --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_CD  || ',';                   --消費税コード
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_ROUND_TYP || ',';             --税端数区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.VEND_LOT_NO || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.LOT_NO   || ',';                  --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_CRCT_NO  || ',';             --受入訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_DATE || ',';              --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_BY || ',';                --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_PRG_NM || ',';            --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_DATE || ',';              --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_BY || ',';                --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_PRG_NM || ',';            --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MODIFY_COUNT || ',';              --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ITEM_CD  || ',';                  --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NON_NO_ITEM_NAME || ',';          --備品発注品目名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INSPC_WH_CD  || ',';              --検査待ち保管区
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        

        FETCH curTAcptRslt   INTO recTAcptRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTAcptRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTAcptRslt%ISOPEN = TRUE THEN
          CLOSE curTAcptRslt;
        END IF;
        RETURN FALSE;

    END SubFncTAcptRsltCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTInspcRsltCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検査実績] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検査実績] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcRsltCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPECTED_QTY,             --検査済み数
        ACCEPTED_QTY,              --合格数
        INSPEC_DATE,               --検査日
        PLANT_CD,                  --工場コード
        WH_CD,                     --受入場所
        INSPEC_RSLT_COMMENT,       --検査実績備考
        VEND_LOT_NO,               --メーカロット番号
        LOT_NO,                    --在庫ロット番号
        INSPC_CRCT_NO,             --検査訂正回数
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT,              --更新数
        INSPC_WH_CD                --検査待ち保管区
          FROM  T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTInspcRslt curTInspcRslt%ROWTYPE;
    BEGIN
      OPEN curTInspcRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcRslt INTO recTInspcRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTInspcRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcRsltName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcRslt.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPECTED_QTY || ',';              --検査済み数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACCEPTED_QTY  || ',';              --合格数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_DATE  || ',';               --検査日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.WH_CD  || ',';                     --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_RSLT_COMMENT  || ',';       --検査実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.VEND_LOT_NO  || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.LOT_NO  || ',';                    --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_CRCT_NO  || ',';             --検査訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.MODIFY_COUNT || ',';               --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_WH_CD  || ',';               --検査待ち保管区
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        FETCH curTInspcRslt   INTO recTInspcRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcRslt%ISOPEN = TRUE THEN
          CLOSE curTInspcRslt;
        END IF;
        RETURN FALSE;

    END SubFncTInspcRsltCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcDefectCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検査不良] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検査不良] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcDefectCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        DEFECT_CAUSE_CD,           --検査不良理由コード
        PLANT_CD,                  --工場コード
        DEFECT_INSPC_QTY,          --検査不良数
        DEFECT_COMMENT,            --検査不良備考
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and INSPC.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTInspcDefect curTInspcDefect%ROWTYPE;
    BEGIN
      OPEN curTInspcDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcDefect INTO recTInspcDefect;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTInspcDefect%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcDefectName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcDefect.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_CAUSE_CD || ',';            --検査不良理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_INSPC_QTY  || ',';          --検査不良数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_COMMENT  || ',';            --検査不良備考
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTInspcDefect   INTO recTInspcDefect;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcDefect%ISOPEN = TRUE THEN
          CLOSE curTInspcDefect;
        END IF;
        RETURN FALSE;

    END SubFncTInspcDefectCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPastInspcAcptCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検収履歴] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検収履歴] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcAcptCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcpt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPC_ACPT_NO,             --検収番号
        INSPC_ACPT_GNR_TYP,        --検収発生区分
        CRCT_NO,                   --訂正回数
        CRCT_TYP,                  --訂正区分
        ITEM_CD,                   --品目番号
        ITEM_NAME,                 --品目名
        SLIP_TYP,                  --伝票種類
        WORK_IN_PROC_CD,           --仕掛作業コード
        COMPANY_CD,                --会社コード
        VEND_CD,                   --取引先コード
        PLANT_CD,                  --工場コード
        UNIT_COST,                 --単価
        UNIT_COST_TYP,             --単価区分
        PROCESSING_COST,           --加工費
        MATERIAL_COST,             --材料費
        OTHER_OVERHEADS,           --その他経費
        ACPT_QTY,                  --受入数
        INSPC_ACPT_QTY,            --検収数
        STOCK_UNIT,                --計量単位
        INSPC_ACPT_AMOUNT,         --検収金額
        SAVING_AMOUNT,             --値引金額
        ACPT_DATE,                 --受入日
        INSPC_ACPT_DATE,           --検収日
        PRODUCT_TYP,               --製品区分
        DLV_CD,                    --納品書番号
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and ACPT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTPastInspcAcpt curTPastInspcAcpt%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcpt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcpt INTO recTPastInspcAcpt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTPastInspcAcpt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcpt.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_NO || ',';              --検収番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_GNR_TYP  || ',';        --検収発生区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_NO  || ',';                   --訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_TYP  || ',';                  --訂正区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_CD  || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_NAME   || ',';                --品目名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SLIP_TYP   || ',';                 --伝票種類
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.WORK_IN_PROC_CD   || ',';          --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.COMPANY_CD   || ',';               --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.VEND_CD   || ',';                  --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PLANT_CD   || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST   || ',';                --単価
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST_TYP   || ',';            --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PROCESSING_COST   || ',';          --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MATERIAL_COST   || ',';            --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.OTHER_OVERHEADS   || ',';          --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_QTY   || ',';                 --受入数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_QTY   || ',';           --検収数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.STOCK_UNIT   || ',';               --計量単位
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_AMOUNT || ',';          --検収金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SAVING_AMOUNT   || ',';            --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_DATE    || ',';               --受入日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_DATE   || ',';          --検収日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PRODUCT_TYP   || ',';              --製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.DLV_CD   || ',';                   --納品書番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcpt   INTO recTPastInspcAcpt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcpt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcpt%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcpt;
        END IF;
        RETURN FALSE;

    END SubFncTPastInspcAcptCsvWrite;

    /*-----------------------------------------------------------------
    'SubFncTPastInspcCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検収金額履歴] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検収金額履歴] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcptAmount(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPC_ACPT_NO,             --検収番号
        CRCT_TYP,                  --訂正区分
        CRCT_NO,                   --訂正回数
        ODR_CD,                    --注文番号
        DETAIL_NO,                 --明細番号
        INVOICE_CD,                --送り状番号
        RATE_JUDGE_DATE,           --レート判定日
        EXCH_RATE,                 --為替レート
        TAX_RATE_1,                --税率1
        TAX_RATE_2,                --税率2
        TAX_RATE_3,                --税率3
        NET_AMOUNT,                --本体金額
        TAX_AMOUNT_1,              --税額1
        TAX_AMOUNT_2,              --税額2
        TAX_AMOUNT_3,              --税額3
        AMOUNT_INCLUDE_TAX,        --税込金額
        HOME_CUR_AMOUNT,           --邦貨金額
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = vcPlant_Cd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and AMOUNT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
      recTPastInspcAcptAmount curTPastInspcAcptAmount%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcptAmount(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcptAmount INTO recTPastInspcAcptAmount;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTPastInspcAcptAmount%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptAmountName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcptAmount.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INSPC_ACPT_NO || ',';              --検収番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_TYP  || ',';                  --訂正区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_NO  || ',';                   --訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ODR_CD   || ',';                   --注文番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.DETAIL_NO   || ',';                --明細番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INVOICE_CD   || ',';               --送り状番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.RATE_JUDGE_DATE   || ',';          --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.EXCH_RATE   || ',';                --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_1   || ',';               --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_2   || ',';               --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_3   || ',';               --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.NET_AMOUNT   || ',';               --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_1   || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_2   || ',';             --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_3   || ',';             --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.AMOUNT_INCLUDE_TAX   || ',';       --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.HOME_CUR_AMOUNT   || ',';          --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcptAmount   INTO recTPastInspcAcptAmount;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcptAmount;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcptAmount%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcptAmount;
        END IF;
        RETURN FALSE;

    END SubFncTPastInspcCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTWorkInPcByPrcCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : [作業系列別仕掛] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [作業系列別仕掛] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWorkInPcByPrcCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTWorkInPcByPrc(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT   WORK_ODR_CD,            --作業計画番号
        WORK_IN_PROC_CD,        --仕掛作業コード
        OD_NO,                    --オーダデマンド番号
        PROC_NAME,                --仕掛作業名
        PROC_NO,                --仕掛作業系列番号
        ITEM_CD,                --品目番号
        OUTSIDE_TYP,            --仕掛内外作区分
        WS_CD,                    --作業区コード
        COMPANY_CD,                --会社コード
        VEND_CD,                --取引先コード
        PLANT_CD,                --工場コード
        WORK_ODR_DLV_DATE,        --作業系列別製造納期
        OPR_INST_START_DATE,      --作業系列別着手日
        OPR_INST_QTY,            --作業指示数
        UNIT_COST_TYP,            --単価区分
        UNIT_COST,                --単価
        PROCESSING_COST,        --加工費
        MATERIAL_COST,            --材料費
        OTHER_OVERHEADS,        --その他経費
        PUCH_ODR_AMOUNT,        --発注金額
        DISC_AMOUNT,            --値引金額
        ACPT_INSPC_TYP,            --作業系列受入検査区分
        WORK_STS_TYP,            --作業系列別作業状態区分
        FINAL_PROC_FLG,            --最終系列フラグ
        OPR_INST_DATE,            --作業系列別作業指示日
        WORK_CMPLT_DATE,        --作業系列別仕掛完了日
        OPR_INST_CD,            --作業指示番号
        WORK_IN_PROC_COMMENT,      --作業系列別仕掛備考
        WORKER_QTY,                --要員数
        CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT              --更新数
          FROM  T_WORK_IN_PROC_BY_PROC PROC
                where exists(select 'x' from t_od OD1
                                    where OD1.job_odr_cd is null                                     --製番
                                      and OD1.plant_CD = vcPlant_Cd                                  --A 工場コード
                                      and OD1.odr_sts_typ = 9                                        --オーダ状態区分
                                      and OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd') --入庫完了日 <= MRP品目情報保持期間
                                      and not exists (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4))                 --ここまでが前提条件 upd 2002.09.04
                                      and PROC.od_no = OD1.od_no);                                  --  以下<作業系列別仕掛>抽出の条件
      recTWorkInPcByPrc curTWorkInPcByPrc%ROWTYPE;
    BEGIN
      OPEN curTWorkInPcByPrc(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTWorkInPcByPrc INTO recTWorkInPcByPrc;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTWorkInPcByPrc%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWorkInPcByPrcName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWorkInPcByPrc.WORK_ODR_CD || ',';                                  --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_IN_PROC_CD  || ',';          --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OD_NO || ',';                      --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PROC_NAME  || ',';                  --仕掛作業名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PROC_NO  || ',';                  --仕掛作業系列番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.ITEM_CD  || ',';                  --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OUTSIDE_TYP  || ',';              --仕掛内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WS_CD  || ',';                      --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.COMPANY_CD || ',';                 --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.VEND_CD || ',';                    --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_ODR_DLV_DATE|| ',';           --作業系列別製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_START_DATE || ',';        --作業系列別着手日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_QTY || ',';               --作業指示数
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UNIT_COST_TYP  || ',';              --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UNIT_COST || ',';                  --単価
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PROCESSING_COST || ',';            --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.MATERIAL_COST || ',';              --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OTHER_OVERHEADS || ',';            --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.PUCH_ODR_AMOUNT || ',';            --発注金額
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.DISC_AMOUNT  || ',';              --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.ACPT_INSPC_TYP || ',';             --作業系列受入検査区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_STS_TYP || ',';               --作業系列別作業状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.FINAL_PROC_FLG || ',';             --最終系列フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_DATE || ',';              --作業系列別作業指示日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_CMPLT_DATE || ',';            --作業系列別仕掛完了日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.OPR_INST_CD || ',';                --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORK_IN_PROC_COMMENT || ',';       --作業系列別仕掛備考
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.WORKER_QTY  || ',';              --要員数
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrc.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWorkInPcByPrc   INTO recTWorkInPcByPrc;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWorkInPcByPrc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWorkInPcByPrc%ISOPEN = TRUE THEN
          CLOSE curTWorkInPcByPrc;
        END IF;
        RETURN FALSE;

    END SubFncTWorkInPcByPrcCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTWorkInPcByItemCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : [品目別仕掛ﾃﾞｰﾀ]削除 (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [品目別仕掛ﾃﾞｰﾀ] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWorkInPcByItemCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTWorkInPcByItem(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT   WORK_ODR_CD,              --作業計画番号
        PLANT_CD,                  --工場コード
        OD_NO,                      --オーダデマンド番号
        ITEM_CD,                  --品目番号
        WS_CD,                      --作業区コード
        OPR_INST_START_DATE,        --作業製造着手日
        WORK_ODR_DLV_DATE,          --作業製造納期
        OPR_INST_QTY,              --作業指示数
        OPR_RSLT_TYP,              --品目別作業実績区分
        WORK_STS_TYP,              --品目別作業状態区分
        PROC_EXPLOSION_FLG,          --作業系列展開済みフラグ
        OPR_INST_DATE,              --作業指示日
        WORK_CMPLT_DATE,          --作業完了日
        OPR_INST_CD,              --作業指示番号
        WORK_IN_PROC_COMMENT,        --品目別仕掛備考
        CREATED_DATE,              --作成日
        CREATED_BY,                  --作成者
        CREATED_PRG_NM,              --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                  --更新者
        UPDATED_PRG_NM,              --更新プログラム名
        MODIFY_COUNT              --更新数
          FROM  T_WORK_IN_PROC_BY_ITEM PITEM
                where exists(select 'x' from t_od OD1
                                where OD1.job_odr_cd is null                                     --製番
                                  and OD1.plant_CD = vcPlant_Cd    --A 工場コード
                                  and OD1.odr_sts_typ = 9                                        --オーダ状態区分
                                  and OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd') --入庫完了日 <= MRP品目情報保持期間
                                  and not exists (select OD2.parent_od_no from T_od OD2
                                                             where OD2.parent_od_no = OD1.od_no
                                                             and OD2.od_typ in (3,4))         --ここまでが前提条件  up 2002.09.04
                                  and PITEM.od_no = OD1.od_no);                             --以下<品目別仕掛>抽出の条件
      recTWorkInPcByItem curTWorkInPcByItem%ROWTYPE;
    BEGIN
      OPEN curTWorkInPcByItem(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTWorkInPcByItem INTO recTWorkInPcByItem;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTWorkInPcByItem%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWorkInPcByItemName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWorkInPcByItem.WORK_ODR_CD || ',';                                  --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.PLANT_CD  || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OD_NO || ',';                      --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.ITEM_CD  || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WS_CD  || ',';                   --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_START_DATE  || ',';       --作業製造着手日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_ODR_DLV_DATE  || ',';       --作業製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_QTY  || ',';               --作業指示数
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_RSLT_TYP || ',';               --品目別作業実績区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_STS_TYP || ',';               --品目別作業状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.PROC_EXPLOSION_FLG  || ',';       --作業系列展開済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_DATE|| ',';               --作業指示日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_CMPLT_DATE || ',';            --作業完了日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.OPR_INST_CD || ',';                --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.WORK_IN_PROC_COMMENT  || ',';       --品目別仕掛備考
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByItem.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWorkInPcByItem   INTO recTWorkInPcByItem;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWorkInPcByItem;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWorkInPcByItem%ISOPEN = TRUE THEN
          CLOSE curTWorkInPcByItem;
        END IF;
        RETURN FALSE;

    END SubFncTWorkInPcByItemCsvWrite;

  /*-----------------------------------------------------------------
    'SubFncTOdExc34CsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 所要量（オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate    MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd          工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdExc34CsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdTypExc34(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --オーダデマンド番号
        ALC_GRP_CD,        --引当グループコード
        PLANT_CD,        --工場コード
        ITEM_CD,        --品目番号
        PS_EDITION,        --所要量品目構成版数
        PATTERN_CD,        --パターンコード
        JOB_ODR_CD,        --製番
        JOB_ODR_DETAIL_NO,    --製番枝番
        JOB_ODR_CANCEL_NO,    --製番取消発生番号
        ODR_STS_TYP,      --オーダ状態区分
        DM_STS_TYP,        --デマンド状態区分
        OD_TYP,            --オーダデマンド区分
        DUE_DATE,        --要求納期
        ODR_START_DATE,      --手配着手日
        PRD_DUE_DATE,      --製造納期
        PRD_START_DATE,      --製造着手日
        DM_QTY,            --デマンド数
        ODR_QTY,        --オーダ数
        MRP_ODR_TYP,      --品目手配区分
        OUTSIDE_TYP,      --所要量内外作区分
        ISSUE_TYP,        --所要量出庫区分
        ODR_LT,            --手配リードタイム
        FIXED_LT,        --固定分リードタイム
        PROP_LT,        --比例分リードタイム
        SAFETY_LT,        --安全日数
        ISSUE_LT,        --払出リードタイム
        PROP_LOT_SIZE,      --比例分ロットサイズ
        PS_LT_FLG,        --製品構成リードタイム使用フラグ
        PS_FIXED_LT,      --製品構成固定分リードタイム
        PS_PROP_LT,        --製品構成比例分リードタイム
        PS_PROP_LOT_SIZE,    --製品構成比例分ロットサイズ
        PS_UNIT_QTY,      --製品構成単位数
        PS_UNIT_DENOMINATOR,  --製品構成単位数分母
        PS_UNIT_NUMERATOR,    --製品構成単位数分子
        TOTAL_RCV_QTY,      --入庫累計数
        RCV_CMPLT_DATE,      --入庫完了日
        TOTAL_ISSUE_INST_QTY,  --出庫指示累計数
        TOTAL_ISSUE_QTY,    --出庫累計数
        ISSUE_CMPLT_DATE,    --出庫完了日
        OD_GNR_TYP,        --所要量発生処理区分
        OD_LEVEL_NO,      --所要量レベル番号
        PARENT_OD_NO,      --親オーダデマンド番号
        ITEM_SPOIL,        --所要量品目仕損率
        PS_SPOIL,        --所要量構成仕損率
        CONS_TYP,        --構成支給区分
        EFF_PHASE_IN_DATE,    --所要量有効開始日
        EFF_PHASE_OUT_DATE,    --所要量有効終了日
        MRP_TYP,        --所要量処理区分
        EXTERNAL_DM_FLG,    --外部デマンドフラグ
        ODR_RELEASE_FLG,    --オーダ発効済フラグ
        DUE_DATE_TIME,      --要求納期日時
        PRD_DUE_DATE_TIME,    --製造納期日時
        CREATED_DATE,      --作成日
        CREATED_BY,        --作成者
        CREATED_PRG_NM,      --作成プログラム名
        UPDATED_DATE,      --更新日
        UPDATED_BY,        --更新者
        UPDATED_PRG_NM,      --更新プログラム名
        MODIFY_COUNT      --更新数
        FROM T_od OD1
                where job_odr_cd is null                                     --製番
                  and plant_CD = vcPlant_Cd    --A 工場コード
                  and odr_sts_typ = 9                                        --オーダ状態区分
                  and rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd') --入庫完了日 <= MRP品目情報保持期間
                  and od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4));   --ここまでが前提条件
      recTOdTypExc34 curTOdTypExc34%ROWTYPE;
    BEGIN
      OPEN curTOdTypExc34(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdTypExc34 INTO recTOdTypExc34;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOdTypExc34%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdTypExc34Name || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdTypExc34.OD_NO || ',';                                  --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ALC_GRP_CD  || ',';           --引当グループコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PLANT_CD || ',';             --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ITEM_CD || ',';              --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_EDITION  || ',';           --所要量品目構成版数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PATTERN_CD  || ',';           --パターンコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.JOB_ODR_CD  || ',';           --製番
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.JOB_ODR_DETAIL_NO  || ',';   --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.JOB_ODR_CANCEL_NO  || ',';   --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_STS_TYP|| ',';           --オーダ状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DM_STS_TYP|| ',';            --デマンド状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OD_TYP  || ',';               --オーダデマンド区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DUE_DATE|| ',';              --要求納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_START_DATE || ',';       --手配着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PRD_DUE_DATE || ',';         --製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PRD_START_DATE  || ',';       --製造着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DM_QTY || ',';               --デマンド数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_QTY || ',';              --オーダ数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.MRP_ODR_TYP || ',';          --品目手配区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OUTSIDE_TYP || ',';          --所要量内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ISSUE_TYP || ',';            --所要量出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_LT  || ',';               --手配リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.FIXED_LT || ',';             --固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PROP_LT || ',';              --比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.SAFETY_LT || ',';            --安全日数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ISSUE_LT || ',';             --払出リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PROP_LOT_SIZE || ',';        --比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_LT_FLG || ',';            --製品構成リードタイム使用フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_FIXED_LT || ',';          --製品構成固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_PROP_LT  || ',';           --製品構成比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_PROP_LOT_SIZE || ',';     --製品構成比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_UNIT_QTY || ',';          --製品構成単位数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_UNIT_DENOMINATOR || ',';      --製品構成単位数分母
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_UNIT_NUMERATOR  || ',';       --製品構成単位数分子
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.TOTAL_RCV_QTY || ',';        --入庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.RCV_CMPLT_DATE  || ',';       --入庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.TOTAL_ISSUE_INST_QTY  || ',';       --出庫指示累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.TOTAL_ISSUE_QTY  || ',';       --出庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ISSUE_CMPLT_DATE  || ',';       --出庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OD_GNR_TYP || ',';           --所要量発生処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.OD_LEVEL_NO || ',';          --所要量レベル番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PARENT_OD_NO || ',';         --親オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ITEM_SPOIL  || ',';           --所要量品目仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PS_SPOIL || ',';             --所要量構成仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CONS_TYP || ',';             --構成支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.EFF_PHASE_IN_DATE || ',';    --所要量有効開始日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.EFF_PHASE_OUT_DATE  || ',';   --所要量有効終了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.MRP_TYP || ',';              --所要量処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.EXTERNAL_DM_FLG || ',';      --外部デマンドフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.ODR_RELEASE_FLG || ',';      --オーダ発効済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.DUE_DATE_TIME || ',';        --要求納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PRD_DUE_DATE_TIME || ',';    --製造納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CREATED_DATE || ',';         --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.PARENT_OD_NO || ',';         --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CREATED_BY  || ',';           --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.CREATED_PRG_NM  || ',';       --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.UPDATED_DATE || ',';         --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.UPDATED_PRG_NM  || ',';       --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdTypExc34.MODIFY_COUNT || ',';         --更新数
                 
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdTypExc34   INTO recTOdTypExc34;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdTypExc34;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdTypExc34%ISOPEN = TRUE THEN
          CLOSE curTOdTypExc34;
        END IF;
        RETURN FALSE;

    END SubFncTOdExc34CsvWrite;

   /*-----------------------------------------------------------------
    'SubFncTOdAlarmCsvRWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [所要量アラームリスト] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量アラームリスト] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdAlarmCsvRWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdAlarm(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_ALARM_NO,       --所要量アラームリスト番号
        OD_NO,                     --オーダデマンド番号
        PLANT_CD,                  --工場コード
        MRP_DATE,                  --処理日
        JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,         --製番枝番
        MSG_NO,                    --メッセージ番号
        MSG,                       --メッセージ
        OD_ALARM_FLG,              --所要量アラームリスト発行済みフラグ
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where  ALARM.od_no = OD1.od_no
                                  and   OD1.plant_CD = vcPlant_Cd                                     --A 工場コード
                                  and   OD1.job_odr_cd is null                                        --製番
                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
      recTOdAlarm curTOdAlarm%ROWTYPE;
    BEGIN
      OPEN curTOdAlarm(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOdAlarm INTO recTOdAlarm;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOdAlarm%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdAlarmRName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdAlarm.OD_ALARM_NO || ',';                                  --所要量アラームリスト番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_NO  || ',';                     --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.PLANT_CD || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MRP_DATE  || ',';                  --処理日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_CD  || ',';                --製番
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_DETAIL_NO  || ',';         --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG_NO  || ',';                    --メッセージ番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG  || ',';                       --メッセージ
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_ALARM_FLG  || ',';              --所要量アラームリスト発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdAlarm   INTO recTOdAlarm;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdAlarm;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdAlarm%ISOPEN = TRUE THEN
          CLOSE curTOdAlarm;
        END IF;
        RETURN FALSE;

    END SubFncTOdAlarmCsvRWrite;

     /*-----------------------------------------------------------------
    'SubFncTMrpReexplosioCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [所要量再展開依頼] (オーダ情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量再展開依頼] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTMrpReexplosioCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTMrpReexplosion(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_NO,             --オーダデマンド番号
        PLANT_CD,                  --工場コード
        JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,         --製番枝番
        JOB_ODR_CANCEL_NO,         --製番取消発生番号
        OD_LEVEL_NO,               --所要量レベル番号
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where  REE.od_no = OD1.od_no
                                  and   OD1.plant_CD = vcPlant_Cd                                     --A 工場コード
                                  and   OD1.job_odr_cd is null                                        --製番
                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                  and   OD1.rcv_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
      recTMrpReexplosion curTMrpReexplosion%ROWTYPE;
    BEGIN
      OPEN curTMrpReexplosion(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTMrpReexplosion INTO recTMrpReexplosion;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTMrpReexplosion%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTMrpReexplosionName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTMrpReexplosion.OD_NO || ',';                                        --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.PLANT_CD || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CD  || ',';                --製番
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_DETAIL_NO  || ',';         --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CANCEL_NO  || ',';         --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.OD_LEVEL_NO  || ',';               --所要量レベル番号
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTMrpReexplosion   INTO recTMrpReexplosion;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTMrpReexplosion;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTMrpReexplosion%ISOPEN = TRUE THEN
          CLOSE curTMrpReexplosion;
        END IF;
        RETURN FALSE;

    END SubFncTMrpReexplosioCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTRlsdPuchOdrCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 発注残(備品発注情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 発注残(備品発注情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRlsdPuchOdrCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRlsdPuchOdr(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,            --発注番号
        ITEM_CD,                --品目番号
        WH_CD,                    --受入場所
        NON_NO_ITEM_NAME,        --備品発注品目名
        NON_NO_ITEM_TYP,        --備品発注製品区分
        COMPANY_CD,                --会社コード
        VEND_CD,                --取引先コード
        PLANT_CD,                --工場コード
        PUCH_ODR_PERSON,        --発注担当者
        PUCH_ODR_START_DATE,      --発注着手日
        PUCH_ODR_DLV_DATE,        --発注納期
        PUCH_ODR_QTY,            --発注数
        NON_NO_ITEM_PUCH_ODR_UNIT,    --備品発注単位
        UNIT_COST_TYP,            --単価区分
        UNIT_COST,                --単価
        PROCESSING_COST,        --加工費
        MATERIAL_COST,            --材料費
        OTHER_OVERHEADS,        --その他経費
        DISC_AMOUNT,            --値引金額
        PUCH_ODR_AMOUNT,        --発注金額
        PUCH_ODR_GNR_TYP,        --発注発生処理区分
        PUCH_ODR_INST_DATE,        --発注指示日
        PUCH_ODR_INST_SLIP_ISS_FLG,    --発注伝票発行済みフラグ
        PUCH_ODR_SLIP_ISS_DATE,      --発注伝票発行日
        ACPT_CMPLT_DATE,        --受入完了日
        PUCH_ODR_STS_TYP,        --発注状態区分
        INSPC_CMPLT_FLG,        --検査完了フラグ
        INSPC_CMPLT_DATE,        --検査完了日
        CONFIRM_DLV_DATE,        --回答納期
        CONFIRM_DLV_DATE_COMMENT,    --回答納期備考
        SPL_ITEM_TYP,            --受給品区分
        ACPT_INSPC_TYP,            --発注時受入検査区分
        INV_CTRL_FLG,            --在庫管理フラグ
        WORK_ODR_CD,            --作業計画番号
        WORK_IN_PROC_CD,        --仕掛作業コード
        OD_NO,                    --オーダデマンド番号
        PUCH_ODR_COMMENT,        --発注備考
        ODR_CD,                    --注文番号
        DETAIL_NO,                --明細番号
        RATE_JUDGE_DATE,        --レート判定日
        EXCH_RATE,                --為替レート
        TAX_RATE_1,                --税率1
        TAX_RATE_2,                --税率2
        TAX_RATE_3,                --税率3
        NET_AMOUNT,                --本体金額
        TAX_AMOUNT_1,            --税額1
        TAX_AMOUNT_2,            --税額2
        TAX_AMOUNT_3,            --税額3
        AMOUNT_INCLUDE_TAX,        --税込金額
        HOME_CUR_AMOUNT,        --邦貨金額
        TAX_CD,                    --消費税コード
        TAX_ROUND_TYP,            --税端数区分
        NON_NO_ITEM_FLG,        --備品発注フラグ
        PUCH_ODR_EDI_ISS_FLG,      --ＥＤＩデータ出力済フラグ
        PUCH_ODR_EDI_ISS_DATE,      --ＥＤＩデータ出力日
        ODR_CANCEL_EDI_ISS_DATE,    --ＥＤＩデータ取消出力日
        PUCH_ODR_FAX_ISS_FLG,      --ＦＡＸデータ出力済フラグ
        PUCH_ODR_FAX_ISS_DATE,      --ＦＡＸデータ出力日
        PUCH_ODR_MAIL_ISS_FLG,      --ＭＡＩＬデータ出力済フラグ
        PUCH_ODR_MAIL_ISS_DATE,      --ＭＡＩＬデータ出力日
        ODR_CANCEL_SLIP_ISS_FLG,    --注文取消伝票発行フラグ
        ODR_CANCEL_SLIP_ISS_DATE,    --取消伝票発行日
        ODR_CANCEL_CAUSE_CD,      --取消理由コード
        DIRECT_FLG,                --直送品フラグ
        CUST_CD,                --得意先コード
        ODR_H_NO,                --受注伝票番号
        ODR_D_SEQ_NO,            --受注明細発生連番
        DELV_CD,                --納品場所コード
        CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT,            --更新数
        APPR_ID,                --確定実行者
        APPR_DATE              --確定日
          FROM  T_RLSD_PUCH_ODR
          where inv_ctrl_flg = 0                                         --在庫管理ﾌﾗｸﾞ
              and plant_CD = vcPlant_Cd    --A 工場コード
              and puch_odr_sts_typ = 9                                     --発注状態区分
              and acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd'); --受入完了日
      recTRlsdPuchOdr curTRlsdPuchOdr%ROWTYPE;
    BEGIN
      OPEN curTRlsdPuchOdr(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTRlsdPuchOdr INTO recTRlsdPuchOdr;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRlsdPuchOdr%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRlsdPuchOdrName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRlsdPuchOdr.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ITEM_CD  || ',';                 --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.WH_CD || ',';                      --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_NAME  || ',';         --備品発注品目名
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_TYP  || ',';         --備品発注製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.COMPANY_CD  || ',';                 --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.VEND_CD  || ',';                 --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_PERSON|| ',';             --発注担当者
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_START_DATE|| ',';         --発注着手日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_DLV_DATE  || ',';         --発注納期
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_QTY|| ',';                --発注数
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --備品発注単位
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UNIT_COST_TYP || ',';              --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UNIT_COST  || ',';                 --単価
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PROCESSING_COST || ',';            --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.MATERIAL_COST || ',';              --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.OTHER_OVERHEADS || ',';            --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DISC_AMOUNT || ',';                --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_AMOUNT || ',';            --発注金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_GNR_TYP  || ',';         --発注発生処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_INST_DATE || ',';         --発注指示日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_INST_SLIP_ISS_FLG || ','; --発注伝票発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_SLIP_ISS_DATE || ',';     --発注伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ACPT_CMPLT_DATE || ',';            --受入完了日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_STS_TYP || ',';           --発注状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.INSPC_CMPLT_FLG || ',';            --検査完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.INSPC_CMPLT_DATE || ',';           --検査完了日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CONFIRM_DLV_DATE  || ',';         --回答納期
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CONFIRM_DLV_DATE_COMMENT || ',';   --回答納期備考
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.SPL_ITEM_TYP || ',';               --受給品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ACPT_INSPC_TYP || ',';             --発注時受入検査区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.INV_CTRL_FLG  || ',';             --在庫管理フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.WORK_ODR_CD || ',';                --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.WORK_IN_PROC_CD  || ',';         --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.OD_NO  || ',';                     --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_COMMENT  || ',';         --発注備考
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CD  || ',';                     --注文番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DETAIL_NO || ',';                  --明細番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.RATE_JUDGE_DATE || ',';            --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.EXCH_RATE || ',';                  --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_RATE_1  || ',';                 --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_RATE_2 || ',';                 --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_RATE_3 || ',';                 --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NET_AMOUNT || ',';                 --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_AMOUNT_1  || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_AMOUNT_2 || ',';               --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_AMOUNT_3 || ',';               --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.AMOUNT_INCLUDE_TAX || ',';         --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.HOME_CUR_AMOUNT || ',';            --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_CD || ',';                     --消費税コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.TAX_ROUND_TYP || ',';              --税端数区分
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.NON_NO_ITEM_FLG || ',';            --備品発注フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_EDI_ISS_FLG  || ',';     --ＥＤＩデータ出力済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_EDI_ISS_DATE  || ',';     --ＥＤＩデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_EDI_ISS_DATE || ',';    --ＥＤＩデータ取消出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_FAX_ISS_FLG  || ',';     --ＦＡＸデータ出力済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_FAX_ISS_DATE || ',';      --ＦＡＸデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_MAIL_ISS_FLG  || ',';     --ＭＡＩＬデータ出力済フラ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.PUCH_ODR_MAIL_ISS_DATE || ',';     --ＭＡＩＬデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_SLIP_ISS_FLG || ',';    --注文取消伝票発行フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_SLIP_ISS_DATE || ',';   --取消伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_CANCEL_CAUSE_CD  || ',';     --取消理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DIRECT_FLG || ',';                 --直送品フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CUST_CD || ',';                    --得意先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_H_NO || ',';                   --受注伝票番号
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.ODR_D_SEQ_NO  || ',';             --受注明細発生連番
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.DELV_CD || ',';                    --納品場所コード
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.MODIFY_COUNT || ',';               --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.APPR_ID || ',';                    --確定実行者
        vc2WorkCsvData := vc2WorkCsvData || recTRlsdPuchOdr.APPR_DATE || ',';                  --確定日
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRlsdPuchOdr   INTO recTRlsdPuchOdr;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRlsdPuchOdr;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRlsdPuchOdr%ISOPEN = TRUE THEN
          CLOSE curTRlsdPuchOdr;
        END IF;
        RETURN FALSE;

    END SubFncTRlsdPuchOdrCsvWrite;

        /*-----------------------------------------------------------------
    'SubFncTAcptRsltBhCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [受入実績] (備品発注情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [受入実績] (備品発注情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTAcptRsltBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTAcptRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,         --発注番号
        ACPT_NO,                     --受入回数
        ACPT_QTY,                    --受入数
        ACPT_DATE,                   --受入日
        UNIT_COST,                   --単価
        UNIT_COST_TYP,               --単価区分
        PROCESSING_COST,             --加工費
        MATERIAL_COST,               --材料費
        OTHER_OVERHEADS,             --その他経費
        DISC_AMOUNT,                 --値引金額
        PUCH_ODR_AMOUNT,             --受入金額
        ACPT_STS_TYP,                --受入状態区分
        DLV_CD,                      --納品書番号
        PLANT_CD,                    --工場コード
        WH_CD,                       --受入場所
        ACPT_RSLT_COMMENT,           --受入実績備考
        INVOICE_CD,                  --送り状番号
        RATE_JUDGE_DATE,             --レート判定日
        EXCH_RATE,                   --為替レート
        TAX_RATE_1,                  --税率1
        TAX_RATE_2,                  --税率2
        TAX_RATE_3,                  --税率3
        NET_AMOUNT,                  --本体金額
        TAX_AMOUNT_1,                --税額1
        TAX_AMOUNT_2,                --税額2
        TAX_AMOUNT_3,                --税額3
        AMOUNT_INCLUDE_TAX,          --税込金額
        HOME_CUR_AMOUNT,             --邦貨金額
        TAX_CD,                      --消費税コード
        TAX_ROUND_TYP,               --税端数区分
        VEND_LOT_NO,                 --メーカロット番号
        LOT_NO,                      --在庫ロット番号
        ACPT_CRCT_NO,                --受入訂正回数
        CREATED_DATE,                --作成日
        CREATED_BY,                  --作成者
        CREATED_PRG_NM,              --作成プログラム名
        UPDATED_DATE,                --更新日
        UPDATED_BY,                  --更新者
        UPDATED_PRG_NM,              --更新プログラム名
        MODIFY_COUNT,                --更新数
        ITEM_CD,                     --品目番号
        NON_NO_ITEM_NAME,            --備品発注品目名
        INSPC_WH_CD                  --検査待ち保管区
          FROM  T_ACPT_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                           --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = vcPlant_Cd                                      --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                       --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --受入完了日
      recTAcptRslt curTAcptRslt%ROWTYPE;
    BEGIN
      OPEN curTAcptRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTAcptRslt INTO recTAcptRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTAcptRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTAcptRsltBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTAcptRslt.PUCH_ODR_CD || ',';                                 --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_NO  || ',';                  --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_QTY  || ',';                 --受入数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_DATE  || ',';                --受入日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST  || ',';                --単価
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST_TYP  || ',';            --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PROCESSING_COST || ',';           --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MATERIAL_COST || ',';             --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.OTHER_OVERHEADS || ',';           --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DISC_AMOUNT  || ',';              --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PUCH_ODR_AMOUNT || ',';           --受入金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_STS_TYP || ',';              --受入状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DLV_CD  || ',';                   --納品書番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.WH_CD  || ',';                    --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_RSLT_COMMENT  || ',';        --受入実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INVOICE_CD  || ',';               --送り状番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.RATE_JUDGE_DATE || ',';           --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.EXCH_RATE  || ',';                --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_1  || ',';               --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_2  || ',';               --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_3  || ',';               --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NET_AMOUNT  || ',';               --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_1  || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_2  || ',';             --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_3  || ',';             --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.AMOUNT_INCLUDE_TAX || ',';        --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.HOME_CUR_AMOUNT || ',';           --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_CD  || ',';                   --消費税コード
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_ROUND_TYP || ',';             --税端数区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.VEND_LOT_NO || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.LOT_NO   || ',';                  --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_CRCT_NO  || ',';             --受入訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_DATE || ',';              --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_BY || ',';                --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_PRG_NM || ',';            --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_DATE || ',';              --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_BY || ',';                --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_PRG_NM || ',';            --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MODIFY_COUNT || ',';              --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ITEM_CD  || ',';                  --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NON_NO_ITEM_NAME || ',';          --備品発注品目名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INSPC_WH_CD  || ',';              --検査待ち保管区
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        

        FETCH curTAcptRslt   INTO recTAcptRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTAcptRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTAcptRslt%ISOPEN = TRUE THEN
          CLOSE curTAcptRslt;
        END IF;
        RETURN FALSE;

    END SubFncTAcptRsltBhCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcRsltBhCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検査実績] (備品発注情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検査実績] (備品発注情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcRsltBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPECTED_QTY,             --検査済み数
        ACCEPTED_QTY,              --合格数
        INSPEC_DATE,               --検査日
        PLANT_CD,                  --工場コード
        WH_CD,                     --受入場所
        INSPEC_RSLT_COMMENT,       --検査実績備考
        VEND_LOT_NO,               --メーカロット番号
        LOT_NO,                    --在庫ロット番号
        INSPC_CRCT_NO,             --検査訂正回数
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT,              --更新数
        INSPC_WH_CD                --検査待ち保管区
          FROM  T_INSPC_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = vcPlant_Cd                                       --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --受入完了日
      recTInspcRslt curTInspcRslt%ROWTYPE;
    BEGIN
      OPEN curTInspcRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcRslt INTO recTInspcRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTInspcRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcRsltBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcRslt.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPECTED_QTY || ',';              --検査済み数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACCEPTED_QTY  || ',';              --合格数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_DATE  || ',';               --検査日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.WH_CD  || ',';                     --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_RSLT_COMMENT  || ',';       --検査実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.VEND_LOT_NO  || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.LOT_NO  || ',';                    --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_CRCT_NO  || ',';             --検査訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.MODIFY_COUNT || ',';               --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_WH_CD  || ',';               --検査待ち保管区
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        FETCH curTInspcRslt   INTO recTInspcRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcRslt%ISOPEN = TRUE THEN
          CLOSE curTInspcRslt;
        END IF;

    END SubFncTInspcRsltBhCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcDefectBhCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検査不良] (備品発注情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検査不良] (備品発注情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcDefectBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTInspcDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        DEFECT_CAUSE_CD,           --検査不良理由コード
        PLANT_CD,                  --工場コード
        DEFECT_INSPC_QTY,          --検査不良数
        DEFECT_COMMENT,            --検査不良備考
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_INSPC_DEFECT INSPC
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where INSPC.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = vcPlant_Cd                                       --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --受入完了日
      recTInspcDefect curTInspcDefect%ROWTYPE;
    BEGIN
      OPEN curTInspcDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTInspcDefect INTO recTInspcDefect;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTInspcDefect%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcDefectBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcDefect.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_CAUSE_CD || ',';            --検査不良理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_INSPC_QTY  || ',';          --検査不良数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_COMMENT  || ',';            --検査不良備考
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTInspcDefect   INTO recTInspcDefect;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcDefect%ISOPEN = TRUE THEN
          CLOSE curTInspcDefect;
        END IF;

    END SubFncTInspcDefectBhCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPastInspcAcptBhCsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検収履歴] (備品発注情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検収履歴] (備品発注情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcAcptBhCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcpt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPC_ACPT_NO,             --検収番号
        INSPC_ACPT_GNR_TYP,        --検収発生区分
        CRCT_NO,                   --訂正回数
        CRCT_TYP,                  --訂正区分
        ITEM_CD,                   --品目番号
        ITEM_NAME,                 --品目名
        SLIP_TYP,                  --伝票種類
        WORK_IN_PROC_CD,           --仕掛作業コード
        COMPANY_CD,                --会社コード
        VEND_CD,                   --取引先コード
        PLANT_CD,                  --工場コード
        UNIT_COST,                 --単価
        UNIT_COST_TYP,             --単価区分
        PROCESSING_COST,           --加工費
        MATERIAL_COST,             --材料費
        OTHER_OVERHEADS,           --その他経費
        ACPT_QTY,                  --受入数
        INSPC_ACPT_QTY,            --検収数
        STOCK_UNIT,                --計量単位
        INSPC_ACPT_AMOUNT,         --検収金額
        SAVING_AMOUNT,             --値引金額
        ACPT_DATE,                 --受入日
        INSPC_ACPT_DATE,           --検収日
        PRODUCT_TYP,               --製品区分
        DLV_CD,                    --納品書番号
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_PAST_INSPC_ACPT ACPT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where ACPT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = vcPlant_Cd                                       --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --受入完了日
      recTPastInspcAcpt curTPastInspcAcpt%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcpt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcpt INTO recTPastInspcAcpt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTPastInspcAcpt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptBhName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcpt.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_NO || ',';              --検収番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_GNR_TYP  || ',';        --検収発生区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_NO  || ',';                   --訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_TYP  || ',';                  --訂正区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_CD  || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_NAME   || ',';                --品目名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SLIP_TYP   || ',';                 --伝票種類
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.WORK_IN_PROC_CD   || ',';          --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.COMPANY_CD   || ',';               --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.VEND_CD   || ',';                  --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PLANT_CD   || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST   || ',';                --単価
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST_TYP   || ',';            --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PROCESSING_COST   || ',';          --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MATERIAL_COST   || ',';            --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.OTHER_OVERHEADS   || ',';          --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_QTY   || ',';                 --受入数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_QTY   || ',';           --検収数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.STOCK_UNIT   || ',';               --計量単位
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_AMOUNT || ',';          --検収金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SAVING_AMOUNT   || ',';            --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_DATE    || ',';               --受入日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_DATE   || ',';          --検収日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PRODUCT_TYP   || ',';              --製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.DLV_CD   || ',';                   --納品書番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcpt   INTO recTPastInspcAcpt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcpt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcpt%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcpt;
        END IF;

    END SubFncTPastInspcAcptBhCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPastInspcBhcsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [検収金額履歴] (備品発注情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検収金額履歴] (備品発注情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcBhcsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPastInspcAcptAmount(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPC_ACPT_NO,             --検収番号
        CRCT_TYP,                  --訂正区分
        CRCT_NO,                   --訂正回数
        ODR_CD,                    --注文番号
        DETAIL_NO,                 --明細番号
        INVOICE_CD,                --送り状番号
        RATE_JUDGE_DATE,           --レート判定日
        EXCH_RATE,                 --為替レート
        TAX_RATE_1,                --税率1
        TAX_RATE_2,                --税率2
        TAX_RATE_3,                --税率3
        NET_AMOUNT,                --本体金額
        TAX_AMOUNT_1,              --税額1
        TAX_AMOUNT_2,              --税額2
        TAX_AMOUNT_3,              --税額3
        AMOUNT_INCLUDE_TAX,        --税込金額
        HOME_CUR_AMOUNT,           --邦貨金額
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where AMOUNT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = vcPlant_Cd                                       --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')); --受入完了日
      recTPastInspcAcptAmount curTPastInspcAcptAmount%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcptAmount(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTPastInspcAcptAmount INTO recTPastInspcAcptAmount;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTPastInspcAcptAmount%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcptAmount.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INSPC_ACPT_NO || ',';              --検収番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_TYP  || ',';                  --訂正区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_NO  || ',';                   --訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ODR_CD   || ',';                   --注文番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.DETAIL_NO   || ',';                --明細番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INVOICE_CD   || ',';               --送り状番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.RATE_JUDGE_DATE   || ',';          --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.EXCH_RATE   || ',';                --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_1   || ',';               --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_2   || ',';               --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_3   || ',';               --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.NET_AMOUNT   || ',';               --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_1   || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_2   || ',';             --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_3   || ',';             --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.AMOUNT_INCLUDE_TAX   || ',';       --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.HOME_CUR_AMOUNT   || ',';          --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcptAmount   INTO recTPastInspcAcptAmount;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcptAmount;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcptAmount%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcptAmount;
        END IF;

    END SubFncTPastInspcBhcsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTDelJobOdrOdCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 製番計画削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :  [製番計画削除] 削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTDelJobOdrOdCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTDelJobOdrOd(
        vcMrp_periodDate       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  OD_NO,            --オーダデマンド番号
        JOB_ODR_CD,               --製番
        JOB_ODR_DETAIL_NO,        --製番枝番
        JOB_ODR_CANCEL_NO,        --製番取消発生番号
        CREATED_DATE,             --作成日
        CREATED_BY,               --作成者
        CREATED_PRG_NM,           --作成プログラム名
        UPDATED_DATE,             --更新日
        UPDATED_BY,               --更新者
        UPDATED_PRG_NM,           --更新プログラム名
        MODIFY_COUNT              --更新数
          FROM T_DEL_JOB_ODR_OD DEL
             WHERE exists(select 'x' from T_JOB_ODR_CD_STOCK J_STOCK
                       where DEL.JOB_ODR_CD = J_STOCK.JOB_ODR_CD                       --製番
                         and DEL.JOB_ODR_DETAIL_NO = J_STOCK.JOB_ODR_DETAIL_NO         --製番枝番
                         and J_STOCK.plant_cd = pvc2PlantCd                            --工場コード
                         and J_STOCK.stock_on_hand_qty <> 0);                          --製番別手持在庫数
      recTDelJobOdrOd curTDelJobOdrOd%ROWTYPE;
    BEGIN
          insert into T_DEL_JOB_ODR_OD(
        OD_NO,              --// オーダデマンド番号
        JOB_ODR_CD,         --// 製番
        JOB_ODR_DETAIL_NO,  --// 製番枝番
        JOB_ODR_CANCEL_NO   --// 製番取消
        )
        select  OD1.OD_NO,          --// オーダデマンド番号
            OD1.JOB_ODR_CD,         --// 製番
            OD1.JOB_ODR_DETAIL_NO,  --// 製番枝番
            OD1.JOB_ODR_CANCEL_NO   --// 製番取消
        from    t_od OD1
        where   OD1.job_odr_cd      is not NULL
        and OD1.parent_od_no    is NULL
        and OD1.odr_sts_typ     = 9
        and OD1.RCV_CMPLT_DATE  <= to_date(pvcMrp_periodDate,'yyyy/mm/dd')
        and OD1.plant_cd = pvcPlant_Cd    --A 工場コード
        and (
            OD1.JOB_ODR_CD,         --// 製番
            OD1.JOB_ODR_DETAIL_NO,  --// 製番枝番
            OD1.JOB_ODR_CANCEL_NO   --// 製番取消
            ) not in (
            select  OD2.JOB_ODR_CD,
                OD2.JOB_ODR_DETAIL_NO,
                OD2.JOB_ODR_CANCEL_NO
            from    t_od OD2
            where   OD2.JOB_ODR_CD      = OD1.JOB_ODR_CD
            and OD2.JOB_ODR_DETAIL_NO   = OD1.JOB_ODR_DETAIL_NO
            and OD2.JOB_ODR_CANCEL_NO   = OD1.JOB_ODR_CANCEL_NO
            and ((OD2.od_typ    = 1     and OD2.odr_sts_typ <> 9) or
                 (OD2.od_typ    in(1,3,4)   and OD2.dm_sts_typ  <> 9))
            );
      OPEN curTDelJobOdrOd(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTDelJobOdrOd INTO recTDelJobOdrOd;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTDelJobOdrOd%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTDelJobOdrOdName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTDelJobOdrOd.OD_NO || ',';                                  --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.JOB_ODR_CD  || ',';           --製番
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.JOB_ODR_DETAIL_NO  || ',';   --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.JOB_ODR_CANCEL_NO  || ',';   --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.CREATED_DATE || ',';         --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.CREATED_BY || ',';         --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.CREATED_PRG_NM  || ',';           --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.UPDATED_DATE  || ',';       --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.UPDATED_BY || ',';         --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.UPDATED_PRG_NM  || ',';       --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTDelJobOdrOd.MODIFY_COUNT || ',';         --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTDelJobOdrOd   INTO recTDelJobOdrOd;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTDelJobOdrOd;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTDelJobOdrOd%ISOPEN = TRUE THEN
          CLOSE curTDelJobOdrOd;
        END IF;
        RETURN FALSE;

    END SubFncTDelJobOdrOdCsvWrite;
   /*-----------------------------------------------------------------
    'SubFncTIssueInstDdCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 出庫指示(製番情報)の削除データCSVファイル出力
    '
    ' 引き数    : 
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [出庫指示] (デマンド情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTIssueInstJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTIssueInstJob  IS
        SELECT  ISSUE_INST_CD,             --出庫指示番号
        PLANT_CD,                 --工場コード
        OD_NO,                     --オーダデマンド番号
        ITEM_CD,                 --出庫品目番号
        PS_EDITION,                 --出庫品目構成版数
        PUCH_ODR_CD,             --発注番号
        COMPANY_CD,                 --会社コード
        VEND_CD,                 --取引先コード
        CONS_TYP,                 --支給区分
        WORK_ODR_CD,               --作業計画番号
        WORK_IN_PROC_CD,           --仕掛作業コード
        WS_CD,                     --作業区コード
        WH_CD,                     --出庫先保管区コード
        ISSUE_INST_UNIT_QTY,         --出庫指示単位数
        ISSUE_INST_UNIT_DENOMINATOR,   --出庫指示単位数分母
        ISSUE_INST_UNIT_NUMERATOR,     --出庫指示単位数分子
        ISSUE_INST_QTY,               --出庫指示数
        TOTAL_ISSUE_QTY,         --出庫累計数
        SCDL_ISSUE_DATE,         --出庫予定日
        ISSUE_CMPLT_DATE,         --出庫完了日
        ISSUE_TYP,                    --出庫指示出庫区分
        ISSUE_CMPLT_FLG,         --出庫完了フラグ
        ISSUE_INST_ISS_FLG,       --出庫指示書発行済みフラグ
        ISSUE_INST_ISS_DATE,       --出庫指示書発行日
        ISSUE_INST_COMMENT,       --出庫指示備考
        LOT_CTRL_FLG,             --ロット管理フラグ
        CREATED_DATE,             --作成日
        CREATED_BY,             --作成者
        CREATED_PRG_NM,         --作成プログラム名
        UPDATED_DATE,             --更新日
        UPDATED_BY,             --更新者
        UPDATED_PRG_NM,         --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM T_ISSUE_INST IS_INST
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL
                                   where IS_INST.OD_NO in (select od_no from t_od OD
                                                           where DEL.JOB_ODR_CD = OD.JOB_ODR_CD
                                                             and DEL.JOB_ODR_DETAIL_NO = OD.JOB_ODR_DETAIL_NO
                                                             and DEL.job_odr_cancel_no = OD.job_odr_cancel_no
                                                             and (OD.od_typ = 1 or OD.od_typ = 3)));    --仕変指示ﾒｰﾙ2000/03/30
      recTIssueInstJob curTIssueInstJob%ROWTYPE;
    BEGIN
      OPEN curTIssueInstJob();
      FETCH curTIssueInstJob INTO recTIssueInstJob;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTIssueInstJob%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTIssueInstJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTIssueInstJob.ISSUE_INST_CD || ',';                                  --出庫指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.PLANT_CD || ',';                     --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.OD_NO || ',';                        --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ITEM_CD || ',';                      --出庫品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.PS_EDITION || ',';                   --出庫品目構成版数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.PUCH_ODR_CD || ',';                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.COMPANY_CD || ',';                   --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.VEND_CD || ',';                      --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CONS_TYP || ',';                     --支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WORK_ODR_CD || ',';                  --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WORK_IN_PROC_CD || ',';              --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WS_CD || ',';                        --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.WH_CD || ',';                        --出庫先保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_UNIT_QTY || ',';          --出庫指示単位数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_UNIT_DENOMINATOR || ',';  --出庫指示単位数分母
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_UNIT_NUMERATOR || ',';    --出庫指示単位数分子
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_QTY || ',';               --出庫指示数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.TOTAL_ISSUE_QTY || ',';              --出庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.SCDL_ISSUE_DATE || ',';              --出庫予定日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_CMPLT_DATE || ',';             --出庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_TYP || ',';                    --出庫指示出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_CMPLT_FLG || ',';              --出庫完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_ISS_FLG || ',';           --出庫指示書発行済み
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_ISS_DATE || ',';          --出庫指示書発行日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.ISSUE_INST_COMMENT || ',';          --出庫指示備考
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.LOT_CTRL_FLG || ',';                 --ロット管理フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CREATED_DATE || ',';                 --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CREATED_BY || ',';                   --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.CREATED_PRG_NM || ',';               --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.UPDATED_DATE || ',';                 --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.UPDATED_BY || ',';                   --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.UPDATED_PRG_NM || ',';               --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTIssueInstJob.MODIFY_COUNT || ',';                 --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTIssueInstJob   INTO recTIssueInstJob;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTIssueInstJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTIssueInstJob%ISOPEN = TRUE THEN
          CLOSE curTIssueInstJob;
        END IF;
        RETURN FALSE;

    END SubFncTIssueInstJobCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTRsPuchOdrJobCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 発注残(製番情報)削除データCSVファイル出力
    '
    ' 引き数    : 
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 発注残(製番情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRsPuchOdrJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTRsPuchOdrJob IS
        SELECT  PUCH_ODR_CD,            --発注番号
        ITEM_CD,                --品目番号
        WH_CD,                    --受入場所
        NON_NO_ITEM_NAME,        --備品発注品目名
        NON_NO_ITEM_TYP,        --備品発注製品区分
        COMPANY_CD,                --会社コード
        VEND_CD,                --取引先コード
        PLANT_CD,                --工場コード
        PUCH_ODR_PERSON,        --発注担当者
        PUCH_ODR_START_DATE,      --発注着手日
        PUCH_ODR_DLV_DATE,        --発注納期
        PUCH_ODR_QTY,            --発注数
        NON_NO_ITEM_PUCH_ODR_UNIT,    --備品発注単位
        UNIT_COST_TYP,            --単価区分
        UNIT_COST,                --単価
        PROCESSING_COST,        --加工費
        MATERIAL_COST,            --材料費
        OTHER_OVERHEADS,        --その他経費
        DISC_AMOUNT,            --値引金額
        PUCH_ODR_AMOUNT,        --発注金額
        PUCH_ODR_GNR_TYP,        --発注発生処理区分
        PUCH_ODR_INST_DATE,        --発注指示日
        PUCH_ODR_INST_SLIP_ISS_FLG,    --発注伝票発行済みフラグ
        PUCH_ODR_SLIP_ISS_DATE,      --発注伝票発行日
        ACPT_CMPLT_DATE,        --受入完了日
        PUCH_ODR_STS_TYP,        --発注状態区分
        INSPC_CMPLT_FLG,        --検査完了フラグ
        INSPC_CMPLT_DATE,        --検査完了日
        CONFIRM_DLV_DATE,        --回答納期
        CONFIRM_DLV_DATE_COMMENT,    --回答納期備考
        SPL_ITEM_TYP,            --受給品区分
        ACPT_INSPC_TYP,            --発注時受入検査区分
        INV_CTRL_FLG,            --在庫管理フラグ
        WORK_ODR_CD,            --作業計画番号
        WORK_IN_PROC_CD,        --仕掛作業コード
        OD_NO,                    --オーダデマンド番号
        PUCH_ODR_COMMENT,        --発注備考
        ODR_CD,                    --注文番号
        DETAIL_NO,                --明細番号
        RATE_JUDGE_DATE,        --レート判定日
        EXCH_RATE,                --為替レート
        TAX_RATE_1,                --税率1
        TAX_RATE_2,                --税率2
        TAX_RATE_3,                --税率3
        NET_AMOUNT,                --本体金額
        TAX_AMOUNT_1,            --税額1
        TAX_AMOUNT_2,            --税額2
        TAX_AMOUNT_3,            --税額3
        AMOUNT_INCLUDE_TAX,        --税込金額
        HOME_CUR_AMOUNT,        --邦貨金額
        TAX_CD,                    --消費税コード
        TAX_ROUND_TYP,            --税端数区分
        NON_NO_ITEM_FLG,        --備品発注フラグ
        PUCH_ODR_EDI_ISS_FLG,      --ＥＤＩデータ出力済フラグ
        PUCH_ODR_EDI_ISS_DATE,      --ＥＤＩデータ出力日
        ODR_CANCEL_EDI_ISS_DATE,    --ＥＤＩデータ取消出力日
        PUCH_ODR_FAX_ISS_FLG,      --ＦＡＸデータ出力済フラグ
        PUCH_ODR_FAX_ISS_DATE,      --ＦＡＸデータ出力日
        PUCH_ODR_MAIL_ISS_FLG,      --ＭＡＩＬデータ出力済フラグ
        PUCH_ODR_MAIL_ISS_DATE,      --ＭＡＩＬデータ出力日
        ODR_CANCEL_SLIP_ISS_FLG,    --注文取消伝票発行フラグ
        ODR_CANCEL_SLIP_ISS_DATE,    --取消伝票発行日
        ODR_CANCEL_CAUSE_CD,      --取消理由コード
        DIRECT_FLG,                --直送品フラグ
        CUST_CD,                --得意先コード
        ODR_H_NO,                --受注伝票番号
        ODR_D_SEQ_NO,            --受注明細発生連番
        DELV_CD,                --納品場所コード
        CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT,            --更新数
        APPR_ID,                --確定実行者
        APPR_DATE              --確定日
          FROM  T_RLSD_PUCH_ODR RLSD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         t_od OD
                            where OD.od_no              = RLSD.od_no
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTRsPuchOdrJob curTRsPuchOdrJob%ROWTYPE;
    BEGIN
      OPEN curTRsPuchOdrJob();
      FETCH curTRsPuchOdrJob INTO recTRsPuchOdrJob;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRsPuchOdrJob%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRsPuchOdrJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRsPuchOdrJob.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ITEM_CD  || ',';                 --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.WH_CD || ',';                      --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_NAME  || ',';         --備品発注品目名
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_TYP  || ',';         --備品発注製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.COMPANY_CD  || ',';                 --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.VEND_CD  || ',';                 --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_PERSON|| ',';             --発注担当者
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_START_DATE|| ',';         --発注着手日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_DLV_DATE  || ',';         --発注納期
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_QTY|| ',';                --発注数
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --備品発注単位
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UNIT_COST_TYP || ',';              --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UNIT_COST  || ',';                 --単価
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PROCESSING_COST || ',';            --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.MATERIAL_COST || ',';              --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.OTHER_OVERHEADS || ',';            --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DISC_AMOUNT || ',';                --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_AMOUNT || ',';            --発注金額
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_GNR_TYP  || ',';         --発注発生処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_INST_DATE || ',';         --発注指示日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_INST_SLIP_ISS_FLG || ','; --発注伝票発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_SLIP_ISS_DATE || ',';     --発注伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ACPT_CMPLT_DATE || ',';            --受入完了日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_STS_TYP || ',';           --発注状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.INSPC_CMPLT_FLG || ',';            --検査完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.INSPC_CMPLT_DATE || ',';           --検査完了日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CONFIRM_DLV_DATE  || ',';         --回答納期
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CONFIRM_DLV_DATE_COMMENT || ',';   --回答納期備考
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.SPL_ITEM_TYP || ',';               --受給品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ACPT_INSPC_TYP || ',';             --発注時受入検査区分
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.INV_CTRL_FLG  || ',';             --在庫管理フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.WORK_ODR_CD || ',';                --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.WORK_IN_PROC_CD  || ',';         --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.OD_NO  || ',';                     --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_COMMENT  || ',';         --発注備考
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CD  || ',';                     --注文番号
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DETAIL_NO || ',';                  --明細番号
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.RATE_JUDGE_DATE || ',';            --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.EXCH_RATE || ',';                  --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_RATE_1  || ',';                 --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_RATE_2 || ',';                 --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_RATE_3 || ',';                 --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NET_AMOUNT || ',';                 --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_AMOUNT_1  || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_AMOUNT_2 || ',';               --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_AMOUNT_3 || ',';               --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.AMOUNT_INCLUDE_TAX || ',';         --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.HOME_CUR_AMOUNT || ',';            --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_CD || ',';                     --消費税コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.TAX_ROUND_TYP || ',';              --税端数区分
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.NON_NO_ITEM_FLG || ',';            --備品発注フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_EDI_ISS_FLG  || ',';     --ＥＤＩデータ出力済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_EDI_ISS_DATE  || ',';     --ＥＤＩデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_EDI_ISS_DATE || ',';    --ＥＤＩデータ取消出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_FAX_ISS_FLG  || ',';     --ＦＡＸデータ出力済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_FAX_ISS_DATE || ',';      --ＦＡＸデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_MAIL_ISS_FLG  || ',';     --ＭＡＩＬデータ出力済フラ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.PUCH_ODR_MAIL_ISS_DATE || ',';     --ＭＡＩＬデータ出力日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_SLIP_ISS_FLG || ',';    --注文取消伝票発行フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_SLIP_ISS_DATE || ',';   --取消伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_CANCEL_CAUSE_CD  || ',';     --取消理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DIRECT_FLG || ',';                 --直送品フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CUST_CD || ',';                    --得意先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_H_NO || ',';                   --受注伝票番号
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.ODR_D_SEQ_NO  || ',';             --受注明細発生連番
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.DELV_CD || ',';                    --納品場所コード
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.MODIFY_COUNT || ',';               --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.APPR_ID || ',';                    --確定実行者
        vc2WorkCsvData := vc2WorkCsvData || recTRsPuchOdrJob.APPR_DATE || ',';                  --確定日
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRsPuchOdrJob   INTO recTRsPuchOdrJob;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRsPuchOdrJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRsPuchOdrJob%ISOPEN = TRUE THEN
          CLOSE curTRsPuchOdrJob;
        END IF;
        RETURN FALSE;

    END SubFncTRsPuchOdrJobCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTAcptRsltJobCsvWrite
    '
    ' 修正履歴  2014.12.30 新規作成
    '
    ' 機能      : [受入実績](製番情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [受入実績] (製番情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTAcptRsltJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTAcptRslt IS
        SELECT  PUCH_ODR_CD,         --発注番号
        ACPT_NO,                     --受入回数
        ACPT_QTY,                    --受入数
        ACPT_DATE,                   --受入日
        UNIT_COST,                   --単価
        UNIT_COST_TYP,               --単価区分
        PROCESSING_COST,             --加工費
        MATERIAL_COST,               --材料費
        OTHER_OVERHEADS,             --その他経費
        DISC_AMOUNT,                 --値引金額
        PUCH_ODR_AMOUNT,             --受入金額
        ACPT_STS_TYP,                --受入状態区分
        DLV_CD,                      --納品書番号
        PLANT_CD,                    --工場コード
        WH_CD,                       --受入場所
        ACPT_RSLT_COMMENT,           --受入実績備考
        INVOICE_CD,                  --送り状番号
        RATE_JUDGE_DATE,             --レート判定日
        EXCH_RATE,                   --為替レート
        TAX_RATE_1,                  --税率1
        TAX_RATE_2,                  --税率2
        TAX_RATE_3,                  --税率3
        NET_AMOUNT,                  --本体金額
        TAX_AMOUNT_1,                --税額1
        TAX_AMOUNT_2,                --税額2
        TAX_AMOUNT_3,                --税額3
        AMOUNT_INCLUDE_TAX,          --税込金額
        HOME_CUR_AMOUNT,             --邦貨金額
        TAX_CD,                      --消費税コード
        TAX_ROUND_TYP,               --税端数区分
        VEND_LOT_NO,                 --メーカロット番号
        LOT_NO,                      --在庫ロット番号
        ACPT_CRCT_NO,                --受入訂正回数
        CREATED_DATE,                --作成日
        CREATED_BY,                  --作成者
        CREATED_PRG_NM,              --作成プログラム名
        UPDATED_DATE,                --更新日
        UPDATED_BY,                  --更新者
        UPDATED_PRG_NM,              --更新プログラム名
        MODIFY_COUNT,                --更新数
        ITEM_CD,                     --品目番号
        NON_NO_ITEM_NAME,            --備品発注品目名
        INSPC_WH_CD                  --検査待ち保管区
          FROM  T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTAcptRslt curTAcptRslt%ROWTYPE;
    BEGIN
      OPEN curTAcptRslt();
      FETCH curTAcptRslt INTO recTAcptRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTAcptRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTAcptRsltJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTAcptRslt.PUCH_ODR_CD || ',';                                 --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_NO  || ',';                  --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_QTY  || ',';                 --受入数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_DATE  || ',';                --受入日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST  || ',';                --単価
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UNIT_COST_TYP  || ',';            --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PROCESSING_COST || ',';           --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MATERIAL_COST || ',';             --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.OTHER_OVERHEADS || ',';           --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DISC_AMOUNT  || ',';              --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PUCH_ODR_AMOUNT || ',';           --受入金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_STS_TYP || ',';              --受入状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.DLV_CD  || ',';                   --納品書番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.WH_CD  || ',';                    --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_RSLT_COMMENT  || ',';        --受入実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INVOICE_CD  || ',';               --送り状番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.RATE_JUDGE_DATE || ',';           --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.EXCH_RATE  || ',';                --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_1  || ',';               --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_2  || ',';               --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_RATE_3  || ',';               --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NET_AMOUNT  || ',';               --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_1  || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_2  || ',';             --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_AMOUNT_3  || ',';             --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.AMOUNT_INCLUDE_TAX || ',';        --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.HOME_CUR_AMOUNT || ',';           --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_CD  || ',';                   --消費税コード
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.TAX_ROUND_TYP || ',';             --税端数区分
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.VEND_LOT_NO || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.LOT_NO   || ',';                  --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ACPT_CRCT_NO  || ',';             --受入訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_DATE || ',';              --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_BY || ',';                --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.CREATED_PRG_NM || ',';            --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_DATE || ',';              --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_BY || ',';                --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.UPDATED_PRG_NM || ',';            --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.MODIFY_COUNT || ',';              --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.ITEM_CD  || ',';                  --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.NON_NO_ITEM_NAME || ',';          --備品発注品目名
        vc2WorkCsvData := vc2WorkCsvData || recTAcptRslt.INSPC_WH_CD  || ',';              --検査待ち保管区
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        

        FETCH curTAcptRslt   INTO recTAcptRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTAcptRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTAcptRslt%ISOPEN = TRUE THEN
          CLOSE curTAcptRslt;
        END IF;

    END SubFncTAcptRsltJobCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTInspcRsltJobCsvWrite
    '
    ' 修正履歴  2014.12.30 新規作成
    '
    ' 機能      : [検査実績] (製番情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検査実績] (製番情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcRsltJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTInspcRslt IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPECTED_QTY,             --検査済み数
        ACCEPTED_QTY,              --合格数
        INSPEC_DATE,               --検査日
        PLANT_CD,                  --工場コード
        WH_CD,                     --受入場所
        INSPEC_RSLT_COMMENT,       --検査実績備考
        VEND_LOT_NO,               --メーカロット番号
        LOT_NO,                    --在庫ロット番号
        INSPC_CRCT_NO,             --検査訂正回数
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT,              --更新数
        INSPC_WH_CD                --検査待ち保管区
          FROM  T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTInspcRslt curTInspcRslt%ROWTYPE;
    BEGIN
      OPEN curTInspcRslt();
      FETCH curTInspcRslt INTO recTInspcRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTInspcRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcRsltJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcRslt.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPECTED_QTY || ',';              --検査済み数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.ACCEPTED_QTY  || ',';              --合格数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_DATE  || ',';               --検査日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.WH_CD  || ',';                     --受入場所
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPEC_RSLT_COMMENT  || ',';       --検査実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.VEND_LOT_NO  || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.LOT_NO  || ',';                    --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_CRCT_NO  || ',';             --検査訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.MODIFY_COUNT || ',';               --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcRslt.INSPC_WH_CD  || ',';               --検査待ち保管区
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;
        FETCH curTInspcRslt   INTO recTInspcRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcRslt%ISOPEN = TRUE THEN
          CLOSE curTInspcRslt;
        END IF;

    END SubFncTInspcRsltJobCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTInspcDefectJobCsvWrite
    '
    ' 修正履歴  2014.12.30新規作成
    '
    ' 機能      : [検査不良] (製番情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検査不良] (製番情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTInspcDefectJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTInspcDefect IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        DEFECT_CAUSE_CD,           --検査不良理由コード
        PLANT_CD,                  --工場コード
        DEFECT_INSPC_QTY,          --検査不良数
        DEFECT_COMMENT,            --検査不良備考
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTInspcDefect curTInspcDefect%ROWTYPE;
    BEGIN
      OPEN curTInspcDefect();
      FETCH curTInspcDefect INTO recTInspcDefect;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTInspcDefect%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTInspcDefectJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTInspcDefect.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_CAUSE_CD || ',';            --検査不良理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_INSPC_QTY  || ',';          --検査不良数
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.DEFECT_COMMENT  || ',';            --検査不良備考
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTInspcDefect.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTInspcDefect   INTO recTInspcDefect;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTInspcDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTInspcDefect%ISOPEN = TRUE THEN
          CLOSE curTInspcDefect;
        END IF;

    END SubFncTInspcDefectJobCsvWrite;

         /*-----------------------------------------------------------------
    'SubFncTPInsAcptJobCsvWrite
    '
    ' 修正履歴  2014.12.30 新規作成
    '
    ' 機能      : [検収履歴] (製番情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検収履歴] (製番情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPInsAcptJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTPastInspcAcpt IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPC_ACPT_NO,             --検収番号
        INSPC_ACPT_GNR_TYP,        --検収発生区分
        CRCT_NO,                   --訂正回数
        CRCT_TYP,                  --訂正区分
        ITEM_CD,                   --品目番号
        ITEM_NAME,                 --品目名
        SLIP_TYP,                  --伝票種類
        WORK_IN_PROC_CD,           --仕掛作業コード
        COMPANY_CD,                --会社コード
        VEND_CD,                   --取引先コード
        PLANT_CD,                  --工場コード
        UNIT_COST,                 --単価
        UNIT_COST_TYP,             --単価区分
        PROCESSING_COST,           --加工費
        MATERIAL_COST,             --材料費
        OTHER_OVERHEADS,           --その他経費
        ACPT_QTY,                  --受入数
        INSPC_ACPT_QTY,            --検収数
        STOCK_UNIT,                --計量単位
        INSPC_ACPT_AMOUNT,         --検収金額
        SAVING_AMOUNT,             --値引金額
        ACPT_DATE,                 --受入日
        INSPC_ACPT_DATE,           --検収日
        PRODUCT_TYP,               --製品区分
        DLV_CD,                    --納品書番号
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTPastInspcAcpt curTPastInspcAcpt%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcpt();
      FETCH curTPastInspcAcpt INTO recTPastInspcAcpt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTPastInspcAcpt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcpt.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_NO || ',';              --検収番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_GNR_TYP  || ',';        --検収発生区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_NO  || ',';                   --訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CRCT_TYP  || ',';                  --訂正区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_CD  || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ITEM_NAME   || ',';                --品目名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SLIP_TYP   || ',';                 --伝票種類
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.WORK_IN_PROC_CD   || ',';          --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.COMPANY_CD   || ',';               --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.VEND_CD   || ',';                  --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PLANT_CD   || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST   || ',';                --単価
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UNIT_COST_TYP   || ',';            --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PROCESSING_COST   || ',';          --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MATERIAL_COST   || ',';            --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.OTHER_OVERHEADS   || ',';          --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_QTY   || ',';                 --受入数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_QTY   || ',';           --検収数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.STOCK_UNIT   || ',';               --計量単位
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_AMOUNT || ',';          --検収金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.SAVING_AMOUNT   || ',';            --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.ACPT_DATE    || ',';               --受入日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.INSPC_ACPT_DATE   || ',';          --検収日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.PRODUCT_TYP   || ',';              --製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.DLV_CD   || ',';                   --納品書番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcpt.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcpt   INTO recTPastInspcAcpt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcpt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcpt%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcpt;
        END IF;

    END SubFncTPInsAcptJobCsvWrite;

    /*-----------------------------------------------------------------
    'SubFncTPastInspcJobCsvWrite
    '
    ' 修正履歴  2014.12.30 新規作成
    '
    ' 機能      : [検収金額履歴] (製番情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [検収金額履歴] (製番情報)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPastInspcJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTPastInspcAcptAmount IS
        SELECT  PUCH_ODR_CD,       --発注番号
        ACPT_NO,                   --受入回数
        INSPC_ACPT_NO,             --検収番号
        CRCT_TYP,                  --訂正区分
        CRCT_NO,                   --訂正回数
        ODR_CD,                    --注文番号
        DETAIL_NO,                 --明細番号
        INVOICE_CD,                --送り状番号
        RATE_JUDGE_DATE,           --レート判定日
        EXCH_RATE,                 --為替レート
        TAX_RATE_1,                --税率1
        TAX_RATE_2,                --税率2
        TAX_RATE_3,                --税率3
        NET_AMOUNT,                --本体金額
        TAX_AMOUNT_1,              --税額1
        TAX_AMOUNT_2,              --税額2
        TAX_AMOUNT_3,              --税額3
        AMOUNT_INCLUDE_TAX,        --税込金額
        HOME_CUR_AMOUNT,           --邦貨金額
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
      recTPastInspcAcptAmount curTPastInspcAcptAmount%ROWTYPE;
    BEGIN
      OPEN curTPastInspcAcptAmount();
      FETCH curTPastInspcAcptAmount INTO recTPastInspcAcptAmount;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTPastInspcAcptAmount%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPastInspcAcptJobAmName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPastInspcAcptAmount.PUCH_ODR_CD || ',';                                  --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ACPT_NO  || ',';                   --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INSPC_ACPT_NO || ',';              --検収番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_TYP  || ',';                  --訂正区分
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CRCT_NO  || ',';                   --訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.ODR_CD   || ',';                   --注文番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.DETAIL_NO   || ',';                --明細番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.INVOICE_CD   || ',';               --送り状番号
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.RATE_JUDGE_DATE   || ',';          --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.EXCH_RATE   || ',';                --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_1   || ',';               --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_2   || ',';               --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_RATE_3   || ',';               --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.NET_AMOUNT   || ',';               --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_1   || ',';             --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_2   || ',';             --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.TAX_AMOUNT_3   || ',';             --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.AMOUNT_INCLUDE_TAX   || ',';       --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.HOME_CUR_AMOUNT   || ',';          --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPastInspcAcptAmount.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPastInspcAcptAmount   INTO recTPastInspcAcptAmount;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPastInspcAcptAmount;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPastInspcAcptAmount%ISOPEN = TRUE THEN
          CLOSE curTPastInspcAcptAmount;
        END IF;

    END SubFncTPastInspcJobCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTWkInPcByPrcJobCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 作業系列別仕掛ﾃﾞｰﾀ削除(製番情報)削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [作業系列別仕掛] (オーダ情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWkInPcByPrcJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTWorkInPcByPrcJob IS
        SELECT   WORK_ODR_CD,            --作業計画番号
        WORK_IN_PROC_CD,        --仕掛作業コード
        OD_NO,                    --オーダデマンド番号
        PROC_NAME,                --仕掛作業名
        PROC_NO,                --仕掛作業系列番号
        ITEM_CD,                --品目番号
        OUTSIDE_TYP,            --仕掛内外作区分
        WS_CD,                    --作業区コード
        COMPANY_CD,                --会社コード
        VEND_CD,                --取引先コード
        PLANT_CD,                --工場コード
        WORK_ODR_DLV_DATE,        --作業系列別製造納期
        OPR_INST_START_DATE,      --作業系列別着手日
        OPR_INST_QTY,            --作業指示数
        UNIT_COST_TYP,            --単価区分
        UNIT_COST,                --単価
        PROCESSING_COST,        --加工費
        MATERIAL_COST,            --材料費
        OTHER_OVERHEADS,        --その他経費
        PUCH_ODR_AMOUNT,        --発注金額
        DISC_AMOUNT,            --値引金額
        ACPT_INSPC_TYP,            --作業系列受入検査区分
        WORK_STS_TYP,            --作業系列別作業状態区分
        FINAL_PROC_FLG,            --最終系列フラグ
        OPR_INST_DATE,            --作業系列別作業指示日
        WORK_CMPLT_DATE,        --作業系列別仕掛完了日
        OPR_INST_CD,            --作業指示番号
        WORK_IN_PROC_COMMENT,      --作業系列別仕掛備考
        WORKER_QTY,                --要員数
        CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT              --更新数
          FROM  T_WORK_IN_PROC_BY_PROC PROC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no              = PROC.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTWorkInPcByPrcJob curTWorkInPcByPrcJob%ROWTYPE;
    BEGIN
      OPEN curTWorkInPcByPrcJob();
      FETCH curTWorkInPcByPrcJob INTO recTWorkInPcByPrcJob;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTWorkInPcByPrcJob%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWkInPcByPrcJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWorkInPcByPrcJob.WORK_ODR_CD || ',';                                  --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_IN_PROC_CD  || ',';          --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OD_NO || ',';                      --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PROC_NAME  || ',';                  --仕掛作業名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PROC_NO  || ',';                  --仕掛作業系列番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.ITEM_CD  || ',';                  --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OUTSIDE_TYP  || ',';              --仕掛内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WS_CD  || ',';                      --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.COMPANY_CD || ',';                 --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.VEND_CD || ',';                    --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_ODR_DLV_DATE|| ',';           --作業系列別製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_START_DATE || ',';        --作業系列別着手日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_QTY || ',';               --作業指示数
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UNIT_COST_TYP  || ',';              --単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UNIT_COST || ',';                  --単価
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PROCESSING_COST || ',';            --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.MATERIAL_COST || ',';              --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OTHER_OVERHEADS || ',';            --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.PUCH_ODR_AMOUNT || ',';            --発注金額
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.DISC_AMOUNT  || ',';              --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.ACPT_INSPC_TYP || ',';             --作業系列受入検査区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_STS_TYP || ',';               --作業系列別作業状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.FINAL_PROC_FLG || ',';             --最終系列フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_DATE || ',';              --作業系列別作業指示日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_CMPLT_DATE || ',';            --作業系列別仕掛完了日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.OPR_INST_CD || ',';                --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORK_IN_PROC_COMMENT || ',';       --作業系列別仕掛備考
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.WORKER_QTY  || ',';              --要員数
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWorkInPcByPrcJob.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWorkInPcByPrcJob   INTO recTWorkInPcByPrcJob;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWorkInPcByPrcJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWorkInPcByPrcJob%ISOPEN = TRUE THEN
          CLOSE curTWorkInPcByPrcJob;
        END IF;
        RETURN FALSE;

    END SubFncTWkInPcByPrcJobCsvWrite;
/*-----------------------------------------------------------------
    'SubFncTWkInPcByItemJobCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : [品目別仕掛ﾃﾞｰﾀ]削除 (製番情報）削除データCSVファイル出力
    '
    ' 引き数    : 
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [品目別仕掛ﾃﾞｰﾀ] (製番情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTWkInPcByItemJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTWkInPcByItemJob IS
        SELECT   WORK_ODR_CD,              --作業計画番号
        PLANT_CD,                  --工場コード
        OD_NO,                      --オーダデマンド番号
        ITEM_CD,                  --品目番号
        WS_CD,                      --作業区コード
        OPR_INST_START_DATE,        --作業製造着手日
        WORK_ODR_DLV_DATE,          --作業製造納期
        OPR_INST_QTY,              --作業指示数
        OPR_RSLT_TYP,              --品目別作業実績区分
        WORK_STS_TYP,              --品目別作業状態区分
        PROC_EXPLOSION_FLG,          --作業系列展開済みフラグ
        OPR_INST_DATE,              --作業指示日
        WORK_CMPLT_DATE,          --作業完了日
        OPR_INST_CD,              --作業指示番号
        WORK_IN_PROC_COMMENT,        --品目別仕掛備考
        CREATED_DATE,              --作成日
        CREATED_BY,                  --作成者
        CREATED_PRG_NM,              --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                  --更新者
        UPDATED_PRG_NM,              --更新プログラム名
        MODIFY_COUNT              --更新数
          FROM  T_WORK_IN_PROC_BY_ITEM PITEM
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no = PITEM.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTWkInPcByItemJob curTWkInPcByItemJob%ROWTYPE;
    BEGIN
      OPEN curTWkInPcByItemJob();
      FETCH curTWkInPcByItemJob INTO recTWkInPcByItemJob;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTWkInPcByItemJob%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTWkInPcByItemJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTWkInPcByItemJob.WORK_ODR_CD || ',';                                  --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.PLANT_CD  || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OD_NO || ',';                      --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.ITEM_CD  || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WS_CD  || ',';                   --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_START_DATE  || ',';       --作業製造着手日
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_ODR_DLV_DATE  || ',';       --作業製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_QTY  || ',';               --作業指示数
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_RSLT_TYP || ',';               --品目別作業実績区分
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_STS_TYP || ',';               --品目別作業状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.PROC_EXPLOSION_FLG  || ',';       --作業系列展開済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_DATE|| ',';               --作業指示日
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_CMPLT_DATE || ',';            --作業完了日
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.OPR_INST_CD || ',';                --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.WORK_IN_PROC_COMMENT  || ',';       --品目別仕掛備考
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTWkInPcByItemJob.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTWkInPcByItemJob   INTO recTWkInPcByItemJob;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTWkInPcByItemJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTWkInPcByItemJob%ISOPEN = TRUE THEN
          CLOSE curTWkInPcByItemJob;
        END IF;
        RETURN FALSE;

    END SubFncTWkInPcByItemJobCsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTOprInstSlipItemCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :作業指示伝票(品目別仕掛)削除データCSVファイル出力
    '
    ' 引き数    : pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 作業指示伝票(品目別仕掛)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprInstSlipItemCsvWrite(
       pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprInstSlipItem(
       vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,      --作業指示番号
        OPR_INST_CD_GNR_TYP,  --作業指示番号発生区分
        OPR_INST_SLIP_ISS_DATE,  --作業指示伝票発行日
        OPR_INST_SLIP_ISS_FLG,  --作業指示伝票発行済みフラグ
        PLANT_CD,        --工場コード
        CREATED_DATE,      --作成日
        CREATED_BY,        --作成者
        CREATED_PRG_NM,      --作成プログラム名
        UPDATED_DATE,      --更新日
        UPDATED_BY,        --更新者
        UPDATED_PRG_NM,      --更新プログラム名
        MODIFY_COUNT      --更新数
          FROM T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                          where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 1
               and plant_CD = vcPlant_Cd;
      recTOprInstSlipItem curTOprInstSlipItem%ROWTYPE;
    BEGIN
      OPEN curTOprInstSlipItem(pvcPlant_Cd);
      FETCH curTOprInstSlipItem INTO recTOprInstSlipItem;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOprInstSlipItem%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprInstSlipItemName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprInstSlipItem.OPR_INST_CD || ',';                               --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.OPR_INST_CD_GNR_TYP || ',';     --作業指示番号発生区分
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.OPR_INST_SLIP_ISS_DATE || ',';  --作業指示伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.OPR_INST_SLIP_ISS_FLG  || ',';  --作業指示伝票発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.PLANT_CD  || ',';              --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.CREATED_DATE || ',';            --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.CREATED_BY || ',';            --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.CREATED_PRG_NM  || ',';              --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.UPDATED_DATE  || ',';          --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.UPDATED_BY || ',';            --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.UPDATED_PRG_NM  || ',';          --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipItem.MODIFY_COUNT || ',';            --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprInstSlipItem   INTO recTOprInstSlipItem;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprInstSlipItem;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprInstSlipItem%ISOPEN = TRUE THEN
          CLOSE curTOprInstSlipItem;
        END IF;
        RETURN FALSE;

    END SubFncTOprInstSlipItemCsvWrite;

    /*-----------------------------------------------------------------
    'SubFncTOprRsltSkcsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [作業実績] (品目別仕掛）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [作業実績] (品目別仕掛）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprRsltSkcsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --作業指示番号
        PARTIAL_PRD_NO,             --分作回数
        ITEM_CD,                    --品目番号
        ACPT_QTY,                   --作業実績良品数
        DEFECT_QTY,                 --作業実績不良数
        OPR_DATE,                   --作業実績作業日
        PLANT_CD,                   --工場コード
        WH_CD,                      --保管区コード
        WS_CD,                      --作業区コード
        OPR_RSLT_PERSON,            --作業実績作業者
        OPR_RSLT_COMMENT,           --作業実績備考
        OPR_TIME_UNIT_TYP,          --作業実績作業時間単位区分
        PRE_ARRANGEMENT_TIME,       --作業実績前段取時間
        POST_ARRANGEMENT_TIME,      --作業実績後段取時間
        OPR_TIME,                   --作業実績作業時間
        CESSATION_TIME,             --作業実績停止時間
        CESSATION_CAUSE,            --作業実績停止理由
        OUTPUT_RSLT_CD,             --出来高実績番号
        LOT_NO,                     --在庫ロット番号
        VEND_LOT_NO,                --メーカロット番号
        OPR_CRCT_NO,                --作業訂正回数
        CREATED_DATE,               --作成日
        CREATED_BY,                 --作成者
        CREATED_PRG_NM,             --作成プログラム名
        UPDATED_DATE,               --更新日
        UPDATED_BY,                 --更新者
        UPDATED_PRG_NM,             --更新プログラム名
        MODIFY_COUNT                --更新数
          FROM  T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTOprRslt curTOprRslt%ROWTYPE;
    BEGIN
      OPEN curTOprRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOprRslt INTO recTOprRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOprRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprRsltSkName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprRslt.OPR_INST_CD || ',';                                  --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PARTIAL_PRD_NO || ',';             --分作回数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ITEM_CD  || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ACPT_QTY  || ',';                  --作業実績良品数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.DEFECT_QTY  || ',';                --作業実績不良数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_DATE  || ',';                  --作業実績作業日
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WH_CD  || ',';                     --保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WS_CD  || ',';                     --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_PERSON  || ',';           --作業実績作業者
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_COMMENT  || ',';          --作業実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME_UNIT_TYP  || ',';         --作業実績作業時間単位区分
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PRE_ARRANGEMENT_TIME  || ',';      --作業実績前段取時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.POST_ARRANGEMENT_TIME  || ',';     --作業実績後段取時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME  || ',';                  --作業実績作業時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_TIME  || ',';            --作業実績停止時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_CAUSE  || ',';           --作業実績停止理由
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OUTPUT_RSLT_CD  || ',';            --出来高実績番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.LOT_NO  || ',';                    --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.VEND_LOT_NO  || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_CRCT_NO  || ',';               --作業訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprRslt   INTO recTOprRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprRslt%ISOPEN = TRUE THEN
          CLOSE curTOprRslt;
        END IF;

    END SubFncTOprRsltSkcsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTDefectSkcsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [作業不良] (品目別仕掛）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [作業不良] (品目別仕掛）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTDefectSkcsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --作業指示番号
        PARTIAL_PRD_NO,             --分作回数
        DEFECT_CAUSE_CD,            --作業不良理由コード
        PLANT_CD,                   --工場コード
        DEFECT_QTY,                 --作業不良数
        DEFECT_COMMENT,             --作業不良備考
        CREATED_DATE,               --作成日
        CREATED_BY,                 --作成者
        CREATED_PRG_NM,             --作成プログラム名
        UPDATED_DATE,               --更新日
        UPDATED_BY,                 --更新者
        UPDATED_PRG_NM,             --更新プログラム名
        MODIFY_COUNT                --更新数
          FROM  T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTDefect curTDefect%ROWTYPE;
    BEGIN
      OPEN curTDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTDefect INTO recTDefect;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTDefect%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTDefectSkName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTDefect.OPR_INST_CD || ',';                                  --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PARTIAL_PRD_NO || ',';             --分作回数
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_CAUSE_CD || ',';            --作業不良理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PLANT_CD || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_QTY || ',';                 --作業不良数
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_COMMENT || ',';             --作業不良備考
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTDefect   INTO recTDefect;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTDefect%ISOPEN = TRUE THEN
          CLOSE curTDefect;
        END IF;

    END SubFncTDefectSkcsvWrite;

 /*-----------------------------------------------------------------
    'SubFncTOprInstSlipPrcCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :作業指示伝票(系列別仕掛)削除データCSVファイル出力
    '
    ' 引き数    : pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 作業指示伝票(系列別仕掛)削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprInstSlipPrcCsvWrite(
       pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprInstSlipPrc(
       vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,      --作業指示番号
        OPR_INST_CD_GNR_TYP,  --作業指示番号発生区分
        OPR_INST_SLIP_ISS_DATE,  --作業指示伝票発行日
        OPR_INST_SLIP_ISS_FLG,  --作業指示伝票発行済みフラグ
        PLANT_CD,        --工場コード
        CREATED_DATE,      --作成日
        CREATED_BY,        --作成者
        CREATED_PRG_NM,      --作成プログラム名
        UPDATED_DATE,      --更新日
        UPDATED_BY,        --更新者
        UPDATED_PRG_NM,      --更新プログラム名
        MODIFY_COUNT      --更新数
          FROM T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                          where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 2
               and plant_CD = vcPlant_Cd ;
      recTOprInstSlipPrc curTOprInstSlipPrc%ROWTYPE;
    BEGIN
      OPEN curTOprInstSlipPrc(pvcPlant_Cd);
      FETCH curTOprInstSlipPrc INTO recTOprInstSlipPrc;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOprInstSlipPrc%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprInstSlipPrcName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprInstSlipPrc.OPR_INST_CD || ',';                               --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.OPR_INST_CD_GNR_TYP || ',';     --作業指示番号発生区分
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.OPR_INST_SLIP_ISS_DATE || ',';  --作業指示伝票発行日
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.OPR_INST_SLIP_ISS_FLG  || ',';  --作業指示伝票発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.PLANT_CD  || ',';              --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.CREATED_DATE || ',';            --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.CREATED_BY || ',';            --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.CREATED_PRG_NM  || ',';              --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.UPDATED_DATE  || ',';          --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.UPDATED_BY || ',';            --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.UPDATED_PRG_NM  || ',';          --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprInstSlipPrc.MODIFY_COUNT || ',';            --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprInstSlipPrc   INTO recTOprInstSlipPrc;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprInstSlipPrc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprInstSlipPrc%ISOPEN = TRUE THEN
          CLOSE curTOprInstSlipPrc;
        END IF;
        RETURN FALSE;

    END SubFncTOprInstSlipPrcCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTOprRsltKecsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [作業実績] (系列別仕掛）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [作業実績] (系列別仕掛）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOprRsltKecsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOprRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --作業指示番号
        PARTIAL_PRD_NO,             --分作回数
        ITEM_CD,                    --品目番号
        ACPT_QTY,                   --作業実績良品数
        DEFECT_QTY,                 --作業実績不良数
        OPR_DATE,                   --作業実績作業日
        PLANT_CD,                   --工場コード
        WH_CD,                      --保管区コード
        WS_CD,                      --作業区コード
        OPR_RSLT_PERSON,            --作業実績作業者
        OPR_RSLT_COMMENT,           --作業実績備考
        OPR_TIME_UNIT_TYP,          --作業実績作業時間単位区分
        PRE_ARRANGEMENT_TIME,       --作業実績前段取時間
        POST_ARRANGEMENT_TIME,      --作業実績後段取時間
        OPR_TIME,                   --作業実績作業時間
        CESSATION_TIME,             --作業実績停止時間
        CESSATION_CAUSE,            --作業実績停止理由
        OUTPUT_RSLT_CD,             --出来高実績番号
        LOT_NO,                     --在庫ロット番号
        VEND_LOT_NO,                --メーカロット番号
        OPR_CRCT_NO,                --作業訂正回数
        CREATED_DATE,               --作成日
        CREATED_BY,                 --作成者
        CREATED_PRG_NM,             --作成プログラム名
        UPDATED_DATE,               --更新日
        UPDATED_BY,                 --更新者
        UPDATED_PRG_NM,             --更新プログラム名
        MODIFY_COUNT                --更新数
          FROM  T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTOprRslt curTOprRslt%ROWTYPE;
    BEGIN
      OPEN curTOprRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOprRslt INTO recTOprRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOprRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOprRsltKeName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOprRslt.OPR_INST_CD || ',';                                  --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PARTIAL_PRD_NO || ',';             --分作回数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ITEM_CD  || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.ACPT_QTY  || ',';                  --作業実績良品数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.DEFECT_QTY  || ',';                --作業実績不良数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_DATE  || ',';                  --作業実績作業日
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PLANT_CD  || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WH_CD  || ',';                     --保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.WS_CD  || ',';                     --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_PERSON  || ',';           --作業実績作業者
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_RSLT_COMMENT  || ',';          --作業実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME_UNIT_TYP  || ',';         --作業実績作業時間単位区分
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.PRE_ARRANGEMENT_TIME  || ',';      --作業実績前段取時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.POST_ARRANGEMENT_TIME  || ',';     --作業実績後段取時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_TIME  || ',';                  --作業実績作業時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_TIME  || ',';            --作業実績停止時間
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CESSATION_CAUSE  || ',';           --作業実績停止理由
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OUTPUT_RSLT_CD  || ',';            --出来高実績番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.LOT_NO  || ',';                    --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.VEND_LOT_NO  || ',';               --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.OPR_CRCT_NO  || ',';               --作業訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOprRslt.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOprRslt   INTO recTOprRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOprRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOprRslt%ISOPEN = TRUE THEN
          CLOSE curTOprRslt;
        END IF;
        RETURN FALSE;

    END SubFncTOprRsltKecsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTDefectKecsvWrite
    '
    ' 修正履歴  2014.12.19 新規作成
    '
    ' 機能      : [作業不良] (系列別仕掛）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [作業不良] (系列別仕掛）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTDefectKecsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTDefect(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OPR_INST_CD,        --作業指示番号
        PARTIAL_PRD_NO,             --分作回数
        DEFECT_CAUSE_CD,            --作業不良理由コード
        PLANT_CD,                   --工場コード
        DEFECT_QTY,                 --作業不良数
        DEFECT_COMMENT,             --作業不良備考
        CREATED_DATE,               --作成日
        CREATED_BY,                 --作成者
        CREATED_PRG_NM,             --作成プログラム名
        UPDATED_DATE,               --更新日
        UPDATED_BY,                 --更新者
        UPDATED_PRG_NM,             --更新プログラム名
        MODIFY_COUNT                --更新数
          FROM  T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = vcPlant_Cd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
      recTDefect curTDefect%ROWTYPE;
    BEGIN
      OPEN curTDefect(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTDefect INTO recTDefect;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTDefect%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTDefectKeName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTDefect.OPR_INST_CD || ',';                                  --作業指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PARTIAL_PRD_NO || ',';             --分作回数
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_CAUSE_CD || ',';            --作業不良理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.PLANT_CD || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_QTY || ',';                 --作業不良数
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.DEFECT_COMMENT || ',';             --作業不良備考
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTDefect.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTDefect   INTO recTDefect;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTDefect;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTDefect%ISOPEN = TRUE THEN
          CLOSE curTDefect;
        END IF;
        RETURN FALSE;

    END SubFncTDefectKecsvWrite;

/*-----------------------------------------------------------------
    'SubFncTJobOdrAlcCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 製番引当ﾃﾞｰﾀ削除データCSVファイル出力
    '
    ' 引き数    : 
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [製番引当ﾃﾞｰﾀ] 削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTJobOdrAlcCsvWrite RETURN BOOLEAN IS
      CURSOR curTJobOdrAlc IS
        SELECT   JOB_ODR_ALC_CD,              --製番引当管理番号
        OD_NO,                      --オーダデマンド番号
        PLANT_CD,                  --工場コード
        ITEM_CD,                  --品目番号
        ALC_STOCK_TYP,              --引当在庫区分
        JOB_ODR_CD,                    --製番
        JOB_ODR_DETAIL_NO,          --製番枝番
        ALCD_QTY,                  --引当済み数
        ISSUEED_QTY,              --出庫済み数
        ISSUE_CMPLT_FLG,          --出庫完了フラグ
        CREATED_DATE,              --作成日
        CREATED_BY,                  --作成者
        CREATED_PRG_NM,              --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                  --更新者
        UPDATED_PRG_NM,              --更新プログラム名
        MODIFY_COUNT              --更新数
          FROM  T_JOB_ODR_ALC ALC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD
                            where OD.OD_NO = ALC.OD_NO
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);
      recTJobOdrAlc curTJobOdrAlc%ROWTYPE;
    BEGIN
      OPEN curTJobOdrAlc();
      FETCH curTJobOdrAlc INTO recTJobOdrAlc;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTJobOdrAlc%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTJobOdrAlcName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTJobOdrAlc.JOB_ODR_ALC_CD || ',';                               --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.OD_NO || ',';                      --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.PLANT_CD  || ',';                --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ITEM_CD  || ',';                    --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ALC_STOCK_TYP  || ',';            --引当在庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.JOB_ODR_CD  || ',';                --製番
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.JOB_ODR_DETAIL_NO  || ',';        --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ALCD_QTY  || ',';                --引当済み数
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ISSUEED_QTY || ',';                --出庫済み数
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.ISSUE_CMPLT_FLG || ',';            --出庫完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdrAlc.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTJobOdrAlc   INTO recTJobOdrAlc;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTJobOdrAlc;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTJobOdrAlc%ISOPEN = TRUE THEN
          CLOSE curTJobOdrAlc;
        END IF;
        RETURN FALSE;

    END SubFncTJobOdrAlcCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOdJobCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 所要量ﾌｧｲﾙの削除（製番情報)削除データCSVファイル出力
    '
    ' 引き数    : 
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量] (製番情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdJobCsvWrite  RETURN BOOLEAN IS

      CURSOR curTOdJob IS
        SELECT  OD_NO,            --オーダデマンド番号
        ALC_GRP_CD,        --引当グループコード
        PLANT_CD,        --工場コード
        ITEM_CD,        --品目番号
        PS_EDITION,        --所要量品目構成版数
        PATTERN_CD,        --パターンコード
        JOB_ODR_CD,        --製番
        JOB_ODR_DETAIL_NO,    --製番枝番
        JOB_ODR_CANCEL_NO,    --製番取消発生番号
        ODR_STS_TYP,      --オーダ状態区分
        DM_STS_TYP,        --デマンド状態区分
        OD_TYP,            --オーダデマンド区分
        DUE_DATE,        --要求納期
        ODR_START_DATE,      --手配着手日
        PRD_DUE_DATE,      --製造納期
        PRD_START_DATE,      --製造着手日
        DM_QTY,            --デマンド数
        ODR_QTY,        --オーダ数
        MRP_ODR_TYP,      --品目手配区分
        OUTSIDE_TYP,      --所要量内外作区分
        ISSUE_TYP,        --所要量出庫区分
        ODR_LT,            --手配リードタイム
        FIXED_LT,        --固定分リードタイム
        PROP_LT,        --比例分リードタイム
        SAFETY_LT,        --安全日数
        ISSUE_LT,        --払出リードタイム
        PROP_LOT_SIZE,      --比例分ロットサイズ
        PS_LT_FLG,        --製品構成リードタイム使用フラグ
        PS_FIXED_LT,      --製品構成固定分リードタイム
        PS_PROP_LT,        --製品構成比例分リードタイム
        PS_PROP_LOT_SIZE,    --製品構成比例分ロットサイズ
        PS_UNIT_QTY,      --製品構成単位数
        PS_UNIT_DENOMINATOR,  --製品構成単位数分母
        PS_UNIT_NUMERATOR,    --製品構成単位数分子
        TOTAL_RCV_QTY,      --入庫累計数
        RCV_CMPLT_DATE,      --入庫完了日
        TOTAL_ISSUE_INST_QTY,  --出庫指示累計数
        TOTAL_ISSUE_QTY,    --出庫累計数
        ISSUE_CMPLT_DATE,    --出庫完了日
        OD_GNR_TYP,        --所要量発生処理区分
        OD_LEVEL_NO,      --所要量レベル番号
        PARENT_OD_NO,      --親オーダデマンド番号
        ITEM_SPOIL,        --所要量品目仕損率
        PS_SPOIL,        --所要量構成仕損率
        CONS_TYP,        --構成支給区分
        EFF_PHASE_IN_DATE,    --所要量有効開始日
        EFF_PHASE_OUT_DATE,    --所要量有効終了日
        MRP_TYP,        --所要量処理区分
        EXTERNAL_DM_FLG,    --外部デマンドフラグ
        ODR_RELEASE_FLG,    --オーダ発効済フラグ
        DUE_DATE_TIME,      --要求納期日時
        PRD_DUE_DATE_TIME,    --製造納期日時
        CREATED_DATE,      --作成日
        CREATED_BY,        --作成者
        CREATED_PRG_NM,      --作成プログラム名
        UPDATED_DATE,      --更新日
        UPDATED_BY,        --更新者
        UPDATED_PRG_NM,      --更新プログラム名
        MODIFY_COUNT      --更新数
        FROM T_OD OD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD2
                            where OD2.OD_NO = OD.OD_NO
                              and DEL.job_odr_cd        = OD2.job_odr_cd
                              and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no);
      recTOdJob  curTOdJob%ROWTYPE;
    BEGIN
      OPEN curTOdJob();
      FETCH curTOdJob INTO recTOdJob;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOdJob%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdJobName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdJob.OD_NO || ',';                                  --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ALC_GRP_CD  || ',';           --引当グループコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PLANT_CD || ',';             --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ITEM_CD || ',';              --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_EDITION  || ',';           --所要量品目構成版数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PATTERN_CD  || ',';           --パターンコード
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.JOB_ODR_CD  || ',';           --製番
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.JOB_ODR_DETAIL_NO  || ',';   --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.JOB_ODR_CANCEL_NO  || ',';   --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_STS_TYP|| ',';           --オーダ状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DM_STS_TYP|| ',';            --デマンド状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OD_TYP  || ',';               --オーダデマンド区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DUE_DATE|| ',';              --要求納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_START_DATE || ',';       --手配着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PRD_DUE_DATE || ',';         --製造納期
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PRD_START_DATE  || ',';       --製造着手日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DM_QTY || ',';               --デマンド数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_QTY || ',';              --オーダ数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.MRP_ODR_TYP || ',';          --品目手配区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OUTSIDE_TYP || ',';          --所要量内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ISSUE_TYP || ',';            --所要量出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_LT  || ',';               --手配リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.FIXED_LT || ',';             --固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PROP_LT || ',';              --比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.SAFETY_LT || ',';            --安全日数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ISSUE_LT || ',';             --払出リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PROP_LOT_SIZE || ',';        --比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_LT_FLG || ',';            --製品構成リードタイム使用フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_FIXED_LT || ',';          --製品構成固定分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_PROP_LT  || ',';           --製品構成比例分リードタイム
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_PROP_LOT_SIZE || ',';     --製品構成比例分ロットサイズ
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_UNIT_QTY || ',';          --製品構成単位数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_UNIT_DENOMINATOR || ',';      --製品構成単位数分母
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_UNIT_NUMERATOR  || ',';       --製品構成単位数分子
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.TOTAL_RCV_QTY || ',';        --入庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.RCV_CMPLT_DATE  || ',';       --入庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.TOTAL_ISSUE_INST_QTY  || ',';       --出庫指示累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.TOTAL_ISSUE_QTY  || ',';       --出庫累計数
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ISSUE_CMPLT_DATE  || ',';       --出庫完了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OD_GNR_TYP || ',';           --所要量発生処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.OD_LEVEL_NO || ',';          --所要量レベル番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PARENT_OD_NO || ',';         --親オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ITEM_SPOIL  || ',';           --所要量品目仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PS_SPOIL || ',';             --所要量構成仕損率
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CONS_TYP || ',';             --構成支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.EFF_PHASE_IN_DATE || ',';    --所要量有効開始日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.EFF_PHASE_OUT_DATE  || ',';   --所要量有効終了日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.MRP_TYP || ',';              --所要量処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.EXTERNAL_DM_FLG || ',';      --外部デマンドフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.ODR_RELEASE_FLG || ',';      --オーダ発効済フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.DUE_DATE_TIME || ',';        --要求納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PRD_DUE_DATE_TIME || ',';    --製造納期日時
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CREATED_DATE || ',';         --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.PARENT_OD_NO || ',';         --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CREATED_BY  || ',';           --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.CREATED_PRG_NM  || ',';       --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.UPDATED_DATE || ',';         --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.UPDATED_PRG_NM  || ',';       --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdJob.MODIFY_COUNT || ',';         --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));

        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdJob   INTO recTOdJob;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdJob;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdJob%ISOPEN = TRUE THEN
          CLOSE curTOdJob;
        END IF;
        RETURN FALSE;

    END SubFncTOdJobCsvWrite;
    
   /*-----------------------------------------------------------------
    'SubFncTOdAlarmJobCsvWrite
    '
    ' 修正履歴  2014.12.30 新規作成
    '
    ' 機能      : [所要量アラームリスト] (製番情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量アラームリスト] (製番情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdAlarmJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTOdAlarm IS
        SELECT  OD_ALARM_NO,       --所要量アラームリスト番号
        OD_NO,                     --オーダデマンド番号
        PLANT_CD,                  --工場コード
        MRP_DATE,                  --処理日
        JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,         --製番枝番
        MSG_NO,                    --メッセージ番号
        MSG,                       --メッセージ
        OD_ALARM_FLG,              --所要量アラームリスト発行済みフラグ
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
      recTOdAlarm curTOdAlarm%ROWTYPE;
    BEGIN
      OPEN curTOdAlarm();
      FETCH curTOdAlarm INTO recTOdAlarm;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOdAlarm%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdAlarmRJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdAlarm.OD_ALARM_NO || ',';                                  --所要量アラームリスト番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_NO  || ',';                     --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.PLANT_CD || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MRP_DATE  || ',';                  --処理日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_CD  || ',';                --製番
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_DETAIL_NO  || ',';         --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG_NO  || ',';                    --メッセージ番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG  || ',';                       --メッセージ
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_ALARM_FLG  || ',';              --所要量アラームリスト発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdAlarm   INTO recTOdAlarm;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdAlarm;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdAlarm%ISOPEN = TRUE THEN
          CLOSE curTOdAlarm;
        END IF;
        RETURN FALSE;

    END SubFncTOdAlarmJobCsvWrite;

     /*-----------------------------------------------------------------
    'SubFncTMrpReexJobCsvWrite
    '
    ' 修正履歴  2014.12.30 新規作成
    '
    ' 機能      : [所要量再展開依頼] (製番情報）削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd       工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : [所要量再展開依頼] (製番情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTMrpReexJobCsvWrite RETURN BOOLEAN IS

      CURSOR curTMrpReexplosion IS
        SELECT  OD_NO,             --オーダデマンド番号
        PLANT_CD,                  --工場コード
        JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,         --製番枝番
        JOB_ODR_CANCEL_NO,         --製番取消発生番号
        OD_LEVEL_NO,               --所要量レベル番号
        CREATED_DATE,              --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,              --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT               --更新数
          FROM  T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
      recTMrpReexplosion curTMrpReexplosion%ROWTYPE;
    BEGIN
      OPEN curTMrpReexplosion();
      FETCH curTMrpReexplosion INTO recTMrpReexplosion;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTMrpReexplosion%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTMrpReexplosionJobName || SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTMrpReexplosion.OD_NO || ',';                                        --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.PLANT_CD || ',';                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CD  || ',';                --製番
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_DETAIL_NO  || ',';         --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.JOB_ODR_CANCEL_NO  || ',';         --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.OD_LEVEL_NO  || ',';               --所要量レベル番号
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_DATE || ',';               --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_BY || ',';                 --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.CREATED_PRG_NM || ',';             --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_DATE || ',';               --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_BY || ',';                 --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.UPDATED_PRG_NM || ',';             --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTMrpReexplosion.MODIFY_COUNT || ',';               --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTMrpReexplosion   INTO recTMrpReexplosion;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTMrpReexplosion;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTMrpReexplosion%ISOPEN = TRUE THEN
          CLOSE curTMrpReexplosion;
        END IF;
        RETURN FALSE;

    END SubFncTMrpReexJobCsvWrite;
    
 /*-----------------------------------------------------------------
    'SubFncTRcvIssueSkCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 保管区別入出庫ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）CSVファイル出力
    '
    ' 引き数    : pvc2RcvIssue_period  計画外入出庫情報保持期間
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 保管区別入出庫ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueSkCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueSk(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  RCV_ISSUE_CTRL_CD,        --入出庫管理番号
        RCV_ISSUE_TYP,            --入出庫区分
        ITEM_CD,                --品目番号
        PLANT_CD,                --工場コード
        WH_CD,                    --保管区コード
        JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,        --製番枝番
        PUCH_ODR_CD,            --発注番号
        ACPT_NO,                --受入回数
        ACPT_RSLT_CRCT_NO,        --受入実績訂正回数
        INSPEC_RSLT_CRCT_NO,      --検査実績訂正回数
        WORK_ODR_CD,            --作業計画番号
        WORK_IN_PROC_CD,        --仕掛作業コード
        PARTIAL_PRD_NO,            --分作回数
        OPR_RSLT_CRCT_NO,        --作業実績訂正回数
        ISSUE_INST_CD,            --出庫指示番号
        RCV_ISSUE_BEFORE_QTY,      --入出庫前在庫数
        RCV_ISSUE_QTY,            --入出庫数
        RCV_ISSUE_AFTER_QTY,      --入出庫後在庫数
        RCV_ISSUE_AMOUNT,        --入出庫金額
        RCV_ISSUE_DATE,            --入出庫年月日
        RCV_ISSUE_GNR_TYP,        --入出庫発生区分
        RCV_ISSUE_ODD_QTY,        --入出庫端数
        DEFECT_CAUSE_CD,        --入出庫不良理由コード
        STOCK_UPD_TYP,            --在庫更新区分
        RCV_ISSUE_CMPLT_FLG,      --入出庫完了フラグ
        OD_NO,                    --オーダデマンド番号
        LOT_NO,                    --在庫ロット番号
        VEND_LOT_NO,            --メーカロット番号
        RCV_ISSUE_COMMENT,        --入出庫備考
        COMPANY_CD,                --会社コード
        VEND_CD,                --取引先コード
        CONS_TYP,                --支給区分
        CONS_EXEC_DATE,            --有償支給実績抽出日
        CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT            --更新数
      FROM  T_RCV_ISSUE RCV
            where RCV.od_no is NULL
              and RCV.plant_CD = vcPlant_Cd     --A
              and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);
      recTRcvIssueSk curTRcvIssueSk%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueSk(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueSk INTO recTRcvIssueSk;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRcvIssueSk%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueSkName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueSk.RCV_ISSUE_CTRL_CD || ',';                     --入出庫管理番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_TYP  || ',';    --入出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ITEM_CD || ',';             --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.PLANT_CD || ',';            --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.WH_CD  || ',';            --保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.JOB_ODR_CD  || ',';        --製番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.JOB_ODR_DETAIL_NO  || ',';--製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.PUCH_ODR_CD  || ',';        --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ACPT_NO  || ',';            --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ACPT_RSLT_CRCT_NO|| ',';    --受入実績訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.INSPEC_RSLT_CRCT_NO|| ',';  --検査実績訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.WORK_ODR_CD  || ',';        --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.WORK_IN_PROC_CD|| ',';      --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.PARTIAL_PRD_NO || ',';      --分作回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.OPR_RSLT_CRCT_NO || ',';    --作業実績訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.ISSUE_INST_CD  || ',';    --出庫指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_BEFORE_QTY || ',';--入出庫前在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_QTY || ',';       --入出庫数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_AFTER_QTY || ','; --入出庫後在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_AMOUNT || ',';    --入出庫金額
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_DATE || ',';      --入出庫年月日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_GNR_TYP  || ',';--入出庫発生区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_ODD_QTY || ',';   --入出庫端数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.DEFECT_CAUSE_CD || ',';     --入出庫不良理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.STOCK_UPD_TYP || ',';       --在庫更新区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_CMPLT_FLG || ','; --入出庫完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.OD_NO || ',';               --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.LOT_NO || ',';              --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.VEND_LOT_NO || ',';         --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.RCV_ISSUE_COMMENT  || ',';--入出庫備考
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.COMPANY_CD || ',';          --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.VEND_CD || ',';             --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CONS_TYP || ',';            --支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CONS_EXEC_DATE  || ',';    --有償支給実績抽出日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CREATED_DATE || ',';        --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CREATED_BY || ',';          --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.CREATED_PRG_NM  || ',';    --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.UPDATED_DATE  || ',';        --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.UPDATED_BY || ',';          --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.UPDATED_PRG_NM  || ',';    --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueSk.MODIFY_COUNT || ',';        --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueSk   INTO recTRcvIssueSk;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueSk;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueSk%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueSk;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueSkCsvWrite;
--20150807 ADD START BY SYSCOM
 /*-----------------------------------------------------------------
    'SubFucTRcvIssAiIfDataCsvWriter
    '
    ' 修正履歴  2015.08.07 新規作成
    '
    ' 機能      : 入出庫別会計連携情報データCSVファイル出力
    '
    ' 引き数    : pvc2RcvIssue_period  計画外入出庫情報保持期間
                  pvcPlant_Cd    　工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : (計画外、移動による入出庫データ）検索を行い、取得したデータのCSV出力を行なう。
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFucTRcvIssAiIfDataCsvWriter(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssAiIfData(
        vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT 
        ISSAID.RCV_ISSUE_CTRL_CD,         --入出庫管理番号
        ISSAID.ACCT_CD,                   --科目コード
        ISSAID.DEPT_CD,                   --負担部門コード
        ISSAID.PJ_CD,                     --プロジェクトコード
        ISSAID.SEG_CONTENTS1,             --セグメント1
        ISSAID.SEG_CONTENTS2,             --セグメント2
        ISSAID.SEG_CONTENTS3,             --セグメント3
        ISSAID.SEG_CONTENTS4,             --セグメント4
        ISSAID.IF_FLG,                    --連携済みフラグ
        ISSAID.IF_DATE,                   --連携日時
        ISSAID.CREATED_DATE,              --作成日
        ISSAID.CREATED_BY,                --作成者
        ISSAID.CREATED_PRG_NM,            --作成プログラム名
        ISSAID.UPDATED_DATE,              --更新日
        ISSAID.UPDATED_BY,                --更新者
        ISSAID.UPDATED_PRG_NM,            --更新プログラム名
        ISSAID.MODIFY_COUNT               --更新数
          FROM T_RCV_ISSUE_AI_IF_DATA ISSAID,T_RCV_ISSUE RCV
           where
            ISSAID.rcv_issue_ctrl_cd = RCV.rcv_issue_ctrl_cd                    --[入出庫別会計連携情報]."入出庫管理番号"＝ [保管区別入出庫]."入出庫管理番号"
            and RCV.od_no is null                                               --[保管区別入出庫]."オーダデマンド番号" ＝ NULL 
            and RCV.plant_cd = vcPlant_Cd                                       --[保管区別入出庫]."工場コード" ＝ 指定された工場コード
            and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')  --[保管区別入出庫]."入出庫年月日"  <＝  変数「計画外入出庫情報保持期間」"
            and (RCV.stock_upd_typ = 2 OR RCV.stock_upd_typ = 3);               --[保管区別入出庫]."在庫更新区分" ＝ 2:更新済み OR 3: 更新失敗
      recTRcvIssAiIfData curTRcvIssAiIfData%ROWTYPE;
    BEGIN
      OPEN curTRcvIssAiIfData(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssAiIfData INTO recTRcvIssAiIfData;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRcvIssAiIfData%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssAiIfDataName || SUBSTR(pvc2RcvIssue_period,1,4) ||SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssAiIfData.RCV_ISSUE_CTRL_CD || ',';                    --入出庫管理番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.ACCT_CD  || ',';           --科目コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.DEPT_CD  || ',';           --負担部門コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.PJ_CD  || ',';             --プロジェクトコード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS1 || ',';      --セグメント1
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS2 || ',';      --セグメント2
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS3  || ',';     --セグメント3
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.SEG_CONTENTS4  || ',';     --セグメント4
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.IF_FLG || ',';             --連携済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.IF_DATE  || ',';           --連携日時
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.CREATED_DATE  || ',';      --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.CREATED_BY  || ',';        --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.CREATED_PRG_NM  || ',';    --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.UPDATED_DATE  || ',';      --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.UPDATED_BY  || ',';        --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.UPDATED_PRG_NM  || ',';    --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssAiIfData.MODIFY_COUNT || ',';       --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssAiIfData   INTO recTRcvIssAiIfData;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssAiIfData;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssAiIfData%ISOPEN = TRUE THEN
          CLOSE curTRcvIssAiIfData;
        END IF;
        RETURN FALSE;
        
    END SubFucTRcvIssAiIfDataCsvWriter;
--20150807 ADD END BY SYSCOM
 /*-----------------------------------------------------------------
    'SubFncTRcvIssueItemSkCsvWrite
    '
    ' 修正履歴  2015.06.16  新規作成
    '
    ' 機能      : 品目別入出庫ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）CSVファイル出力
    '
    ' 引き数    : pvc2RcvIssue_period  計画外入出庫TX情報保持期間
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 品目別入出庫ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueItemSkCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueItemSk(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  ISSUE_ITEM.RCV_ISSUE_CTRL_CD,        --入出庫管理番号
        ISSUE_ITEM.PLANT_CD,                         --工場コード
        ISSUE_ITEM.PRODUCT_TYP,                      --製品区分
        ISSUE_ITEM.SBCNT_PUCH_TYP,                   --外注購入品区分
        ISSUE_ITEM.MRP_ODR_TYP,                      --品目手配区分
        ISSUE_ITEM.OUTSIDE_TYP,                      --内外作区分
        ISSUE_ITEM.PARENT_ITEM_CD,                   --親品目番号
        ISSUE_ITEM.PARENT_JOB_ODR_CD,                --親製番
        ISSUE_ITEM.PARENT_JOB_ODR_DETAIL_NO,         --親製番枝番
        ISSUE_ITEM.CONS_TYP,                         --支給区分
        ISSUE_ITEM.NON_PLANNED_CAUSE_CD,             --計画外理由コード
        ISSUE_ITEM.CREATED_DATE,                     --作成日
        ISSUE_ITEM.CREATED_BY,                       --作成者
        ISSUE_ITEM.CREATED_PRG_NM,                   --作成プログラム名
        ISSUE_ITEM.UPDATED_DATE,                     --更新日
        ISSUE_ITEM.UPDATED_BY,                       --更新者
        ISSUE_ITEM.UPDATED_PRG_NM,                   --更新プログラム名
        ISSUE_ITEM.MODIFY_COUNT                      --更新数
      FROM  T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where RCV.od_no is NULL
                             and RCV.WH_CD = M.WH_CD      --保管区コード
                             and M.PLANT_CD = vcPlant_Cd   --工場コード
                             and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
                             
      recTRcvIssueItemSk curTRcvIssueItemSk%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueItemSk(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueItemSk INTO recTRcvIssueItemSk;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRcvIssueItemSk%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueItemSkName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueItemSk.RCV_ISSUE_CTRL_CD || ',';                           --入出庫管理番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PRODUCT_TYP || ',';               --製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.SBCNT_PUCH_TYP || ',';            --外注購入品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.MRP_ODR_TYP  || ',';              --品目手配区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.OUTSIDE_TYP  || ',';              --内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PARENT_ITEM_CD  || ',';           --親品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PARENT_JOB_ODR_CD  || ',';        --親製番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.PARENT_JOB_ODR_DETAIL_NO  || ','; --親製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CONS_TYP|| ',';                   --支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.NON_PLANNED_CAUSE_CD|| ',';       --計画外理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CREATED_DATE || ',';              --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CREATED_BY || ',';                --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.CREATED_PRG_NM  || ',';           --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.UPDATED_DATE  || ',';             --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.UPDATED_BY || ',';                --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.UPDATED_PRG_NM  || ',';           --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemSk.MODIFY_COUNT || ',';              --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueItemSk   INTO recTRcvIssueItemSk;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueItemSk;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueItemSk%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueItemSk;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueItemSkCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTRcvIssueMrpCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 保管区別入出庫ﾃﾞｰﾀ削除（MRP品目,製番情報） CSVファイル出力
    '
    ' 引き数    : pvc2RcvIssue_period  計画外入出庫情報保持期間
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 保管区別入出庫ﾃﾞｰﾀ削除（MRP品目,製番情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueMrpCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueMrp(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  RCV_ISSUE_CTRL_CD,        --入出庫管理番号
        RCV_ISSUE_TYP,            --入出庫区分
        ITEM_CD,                --品目番号
        PLANT_CD,                --工場コード
        WH_CD,                    --保管区コード
        JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,        --製番枝番
        PUCH_ODR_CD,            --発注番号
        ACPT_NO,                --受入回数
        ACPT_RSLT_CRCT_NO,        --受入実績訂正回数
        INSPEC_RSLT_CRCT_NO,      --検査実績訂正回数
        WORK_ODR_CD,            --作業計画番号
        WORK_IN_PROC_CD,        --仕掛作業コード
        PARTIAL_PRD_NO,            --分作回数
        OPR_RSLT_CRCT_NO,        --作業実績訂正回数
        ISSUE_INST_CD,            --出庫指示番号
        RCV_ISSUE_BEFORE_QTY,      --入出庫前在庫数
        RCV_ISSUE_QTY,            --入出庫数
        RCV_ISSUE_AFTER_QTY,      --入出庫後在庫数
        RCV_ISSUE_AMOUNT,        --入出庫金額
        RCV_ISSUE_DATE,            --入出庫年月日
        RCV_ISSUE_GNR_TYP,        --入出庫発生区分
        RCV_ISSUE_ODD_QTY,        --入出庫端数
        DEFECT_CAUSE_CD,        --入出庫不良理由コード
        STOCK_UPD_TYP,            --在庫更新区分
        RCV_ISSUE_CMPLT_FLG,      --入出庫完了フラグ
        OD_NO,                    --オーダデマンド番号
        LOT_NO,                    --在庫ロット番号
        VEND_LOT_NO,            --メーカロット番号
        RCV_ISSUE_COMMENT,        --入出庫備考
        COMPANY_CD,                --会社コード
        VEND_CD,                --取引先コード
        CONS_TYP,                --支給区分
        CONS_EXEC_DATE,            --有償支給実績抽出日
        CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT            --更新数
      FROM  T_RCV_ISSUE RCV
            where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
              and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
              and RCV.plant_CD = vcPlant_Cd     --A
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);
      recTRcvIssueMrp curTRcvIssueMrp%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueMrp(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueMrp INTO recTRcvIssueMrp;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRcvIssueMrp%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueMrpName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueMrp.RCV_ISSUE_CTRL_CD || ',';                     --入出庫管理番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_TYP  || ',';    --入出庫区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ITEM_CD || ',';             --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.PLANT_CD || ',';            --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.WH_CD  || ',';            --保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.JOB_ODR_CD  || ',';        --製番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.JOB_ODR_DETAIL_NO  || ',';--製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.PUCH_ODR_CD  || ',';        --発注番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ACPT_NO  || ',';            --受入回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ACPT_RSLT_CRCT_NO|| ',';    --受入実績訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.INSPEC_RSLT_CRCT_NO|| ',';  --検査実績訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.WORK_ODR_CD  || ',';        --作業計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.WORK_IN_PROC_CD|| ',';      --仕掛作業コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.PARTIAL_PRD_NO || ',';      --分作回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.OPR_RSLT_CRCT_NO || ',';    --作業実績訂正回数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.ISSUE_INST_CD  || ',';    --出庫指示番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_BEFORE_QTY || ',';--入出庫前在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_QTY || ',';       --入出庫数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_AFTER_QTY || ','; --入出庫後在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_AMOUNT || ',';    --入出庫金額
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_DATE || ',';      --入出庫年月日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_GNR_TYP  || ',';--入出庫発生区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_ODD_QTY || ',';   --入出庫端数
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.DEFECT_CAUSE_CD || ',';     --入出庫不良理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.STOCK_UPD_TYP || ',';       --在庫更新区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_CMPLT_FLG || ','; --入出庫完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.OD_NO || ',';               --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.LOT_NO || ',';              --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.VEND_LOT_NO || ',';         --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.RCV_ISSUE_COMMENT  || ',';--入出庫備考
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.COMPANY_CD || ',';          --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.VEND_CD || ',';             --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CONS_TYP || ',';            --支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CONS_EXEC_DATE  || ',';    --有償支給実績抽出日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CREATED_DATE || ',';        --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CREATED_BY || ',';          --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.CREATED_PRG_NM  || ',';    --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.UPDATED_DATE  || ',';        --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.UPDATED_BY || ',';          --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.UPDATED_PRG_NM  || ',';    --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueMrp.MODIFY_COUNT || ',';        --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueMrp   INTO recTRcvIssueMrp;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueMrp;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueMrp%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueMrp;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueMrpCsvWrite;
/*-----------------------------------------------------------------
    'SubFncTRcvIssueItemMrpCsvWrite
    '
    ' 修正履歴  2015.06.16 新規作成
    '
    ' 機能      : 品目別入出庫ﾃﾞｰﾀ削除（MRP品目,製番情報） CSVファイル出力
    '
    ' 引き数    : pvc2RcvIssue_period  計画外入出庫TX情報保持期間
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 品目別入出庫ﾃﾞｰﾀ削除（MRP品目,製番情報）削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTRcvIssueItemMrpCsvWrite(
       pvc2RcvIssue_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTRcvIssueItemMrp(
         vc2RcvIssue_period       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  ISSUE_ITEM.RCV_ISSUE_CTRL_CD,        --入出庫管理番号
        ISSUE_ITEM.PLANT_CD,                         --工場コード
        ISSUE_ITEM.PRODUCT_TYP,                      --製品区分
        ISSUE_ITEM.SBCNT_PUCH_TYP,                   --外注購入品区分
        ISSUE_ITEM.MRP_ODR_TYP,                      --品目手配区分
        ISSUE_ITEM.OUTSIDE_TYP,                      --内外作区分
        ISSUE_ITEM.PARENT_ITEM_CD,                   --親品目番号
        ISSUE_ITEM.PARENT_JOB_ODR_CD,                --親製番
        ISSUE_ITEM.PARENT_JOB_ODR_DETAIL_NO,         --親製番枝番
        ISSUE_ITEM.CONS_TYP,                         --支給区分
        ISSUE_ITEM.NON_PLANNED_CAUSE_CD,             --計画外理由コード
        ISSUE_ITEM.CREATED_DATE,                     --作成日
        ISSUE_ITEM.CREATED_BY,                       --作成者
        ISSUE_ITEM.CREATED_PRG_NM,                   --作成プログラム名
        ISSUE_ITEM.UPDATED_DATE,                     --更新日
        ISSUE_ITEM.UPDATED_BY,                       --更新者
        ISSUE_ITEM.UPDATED_PRG_NM,                   --更新プログラム名
        ISSUE_ITEM.MODIFY_COUNT                      --更新数
        FROM  T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
                             and RCV.rcv_issue_date <= to_date(vc2RcvIssue_period,'yyyy/mm/dd')
                             and RCV.WH_CD = M.WH_CD
                             and M.PLANT_CD = vcPlant_Cd
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
              
      recTRcvIssueItemMrp curTRcvIssueItemMrp%ROWTYPE;
    BEGIN
      OPEN curTRcvIssueItemMrp(pvc2RcvIssue_period,pvcPlant_Cd);
      FETCH curTRcvIssueItemMrp INTO recTRcvIssueItemMrp;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTRcvIssueItemMrp%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTRcvIssueItemMrpName || SUBSTR(pvc2RcvIssue_period,1,4) || SUBSTR(pvc2RcvIssue_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTRcvIssueItemMrp.RCV_ISSUE_CTRL_CD || ',';                           --入出庫管理番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PLANT_CD  || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PRODUCT_TYP || ',';               --製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.SBCNT_PUCH_TYP || ',';            --外注購入品区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.MRP_ODR_TYP  || ',';              --品目手配区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.OUTSIDE_TYP  || ',';              --内外作区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PARENT_ITEM_CD  || ',';           --親品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PARENT_JOB_ODR_CD  || ',';        --親製番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.PARENT_JOB_ODR_DETAIL_NO  || ','; --親製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CONS_TYP|| ',';                   --支給区分
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.NON_PLANNED_CAUSE_CD|| ',';       --計画外理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CREATED_DATE || ',';              --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CREATED_BY || ',';                --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.CREATED_PRG_NM  || ',';           --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.UPDATED_DATE  || ',';             --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.UPDATED_BY || ',';                --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.UPDATED_PRG_NM  || ',';           --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recTRcvIssueItemMrp.MODIFY_COUNT || ',';              --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTRcvIssueItemMrp   INTO recTRcvIssueItemMrp;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTRcvIssueItemMrp;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTRcvIssueItemMrp%ISOPEN = TRUE THEN
          CLOSE curTRcvIssueItemMrp;
        END IF;
        RETURN FALSE;

    END SubFncTRcvIssueItemMrpCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTItemStockCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :保管区別品目在庫ﾃﾞｰﾀ削除 CSVファイル出力
    '
    ' 引き数    : pvc2WkDateTime  在庫情報保持期間
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 保管区別品目在庫削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTItemStockCsvWrite(
       pvc2WkDateTime       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTItemStock(
         vc2WkDateTime       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  ITEM_CD,                --品目番号
        WH_CD,                    --保管区コード
        PLANT_CD,                --工場コード
        STOCK_ON_HAND_QTY,        --品目別手持在庫数
        DEFECT_QTY,                --品目別不良数
        PRVS_DAYEND_STOCK_QTY,      --品目別前日末在庫数
        PRVS_MONTHEND_STOCK_QTY,    --品目別前月末在庫数
        PRVS_TERMEND_STOCK_QTY,      --品目別前期末在庫数
        ALCD_QTY,                --品目別引当済数量
          CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT            --更新数
      FROM  T_ITEM_STOCK
            where stock_on_hand_qty = 0
              and UPDATED_DATE <= to_date(vc2WkDateTime,'yyyy/mm/dd HH24:MI:SS') --A
              and plant_CD = vcPlant_Cd     --A
              and defect_qty = 0;
      recTItemStock curTItemStock%ROWTYPE;
    BEGIN
      OPEN curTItemStock(pvc2WkDateTime,pvcPlant_Cd);
      FETCH curTItemStock INTO recTItemStock;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTItemStock%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTItemStockName || SUBSTR(pvc2WkDateTime,1,4) ||SUBSTR(pvc2WkDateTime,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTItemStock.ITEM_CD || ',';                                  --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.WH_CD  || ',';                --保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PLANT_CD || ',';               --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.STOCK_ON_HAND_QTY  || ',';    --品目別手持在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.DEFECT_QTY || ',';             --品目別不良数
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PRVS_DAYEND_STOCK_QTY  || ',';--品目別前日末在庫数 
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PRVS_MONTHEND_STOCK_QTY  || ',';--品目別前月末在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.PRVS_TERMEND_STOCK_QTY  || ',';--品目別前期末在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.ALCD_QTY  || ',';            --品目別引当済数量
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.CREATED_DATE || ',';           --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.CREATED_BY || ',';             --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.CREATED_PRG_NM  || ',';        --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.UPDATED_DATE  || ',';        --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.UPDATED_BY || ',';             --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.UPDATED_PRG_NM  || ',';        --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recTItemStock.MODIFY_COUNT || ',';           --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTItemStock  INTO recTItemStock;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTItemStock;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTItemStock%ISOPEN = TRUE THEN
          CLOSE curTItemStock;
        END IF;
        RETURN FALSE;

    END SubFncTItemStockCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTJobCdStockCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :保管区別製番在庫 CSVファイル出力
    '
    ' 引き数    : pvc2WkDateTime  在庫情報保持期間
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 保管区別製番在庫データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTJobCdStockCsvWrite(
       pvc2WkDateTime       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTJobCdStock(
         vc2WkDateTime       IN  VARCHAR2
        ,vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,        --製番枝番
        ITEM_CD,                --品目番号
        WH_CD,                    --保管区コード
        PLANT_CD,                --工場コード
        STOCK_ON_HAND_QTY,          --製番別手持在庫数
        PRVS_DAYEND_STOCK_QTY,        --製番別前日末在庫数
        PRVS_MONTHEND_STOCK_QTY,    --製番別前月末在庫数
        PRVS_TERMEND_STOCK_QTY,      --製番別前期末在庫数
          CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT            --更新数
      FROM  T_JOB_ODR_CD_STOCK
            where stock_on_hand_qty = 0
              and plant_CD = vcPlant_Cd     --A
              and UPDATED_DATE <= to_date(vc2WkDateTime,'yyyy/mm/dd HH24:MI:SS'); --A
      recTJobCdStock curTJobCdStock%ROWTYPE;
    BEGIN
      OPEN curTJobCdStock(pvc2WkDateTime,pvcPlant_Cd);
      FETCH curTJobCdStock INTO recTJobCdStock;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTJobCdStock%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTJobCdStockName ||SUBSTR(pvc2WkDateTime,1,4) ||SUBSTR(pvc2WkDateTime,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTJobCdStock.JOB_ODR_CD || ',';                                  --製番
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.JOB_ODR_DETAIL_NO  || ',';         --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.ITEM_CD || ',';                   --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.WH_CD  || ',';                     --保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PLANT_CD || ',';                  --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.STOCK_ON_HAND_QTY  || ',';         --製番別手持在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PRVS_DAYEND_STOCK_QTY  || ',';     --製番別前日末在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PRVS_MONTHEND_STOCK_QTY  || ','; --製番別前月末在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.PRVS_TERMEND_STOCK_QTY  || ','; --製番別前期末在庫数
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.CREATED_DATE || ',';              --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.CREATED_BY || ',';                --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.CREATED_PRG_NM  || ',';         --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.UPDATED_DATE  || ',';             --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.UPDATED_BY || ',';                --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.UPDATED_PRG_NM  || ',';         --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recTJobCdStock.MODIFY_COUNT || ',';              --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTJobCdStock  INTO recTJobCdStock;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTJobCdStock;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTJobCdStock%ISOPEN = TRUE THEN
          CLOSE curTJobCdStock;
        END IF;
        RETURN FALSE;

    END SubFncTJobCdStockCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTJobOdrCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :製番計画 CSVファイル出力
    '
    ' 引き数    : pvc2WkDateTime  在庫情報保持期間
                  pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 保管区別製番在庫データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTJobOdrCsvWrite(
         pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTJobOdr(
        vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  JOB_ODR_CD,                --製番
        JOB_ODR_DETAIL_NO,        --製番枝番
                JOB_ODR_CANCEL_NO,              --製番取消発生番号
        PLANT_CD,                --工場コード
        ITEM_CD,                --品目番号
        JOB_ODR_TYP,            --製番種別
        PLAN_TYP,                  --計画タイプ
        JOB_ODR_DLV_DATE,            --製番納期
        JOB_ODR_QTY,                --製番数
        ALC_GRP_CD,                  --引当グループコード
        JOB_ODR_STS_TYP,          --製番状態区分
        JOB_ODR_EXP_TYP,           --製番処理区分
        JOB_ODR_DEL_FLG,          --製番削除フラグ
          CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT,            --更新数
                JOB_ODR_INPUT_TYP               --製番入力区分
      FROM  T_JOB_ODR JOB
            where JOB.job_odr_sts_typ = 9                   --以下<製番計画の抽出条件>
            and plant_CD = pvc2PlantCd     --A
            and (   JOB.job_odr_cd,
                JOB.job_odr_detail_no,
                JOB.job_odr_cancel_no,
                JOB.item_cd) not in (   select  OD.job_odr_cd,
                                                OD.job_odr_detail_no,
                                                OD.job_odr_cancel_no,
                                                OD.item_cd
                                        from    t_od OD
                                        where   OD.job_odr_cd           = JOB.job_odr_cd
                                        and     OD.job_odr_detail_no    = JOB.job_odr_detail_no
                                        and     OD.job_odr_cancel_no    = JOB.job_odr_cancel_no
                                        and     OD.item_cd              = JOB.item_cd)
             and (   JOB.job_odr_cd,                         --以下<保管区別製番在庫の抽出条件>
                JOB.job_odr_detail_no,
                JOB.item_cd) not in (   select  STOCK.job_odr_cd,
                                                STOCK.job_odr_detail_no,
                                                STOCK.item_cd
                                        from    T_JOB_ODR_CD_STOCK STOCK
                                        where   STOCK.job_odr_cd        = JOB.job_odr_cd
                                        and     STOCK.job_odr_detail_no = JOB.job_odr_detail_no
                                        and     STOCK.item_cd           = JOB.item_cd);
      recTJobOdr curTJobOdr%ROWTYPE;
    BEGIN
      OPEN curTJobOdr(pvcPlant_Cd);
      FETCH curTJobOdr INTO recTJobOdr;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTJobOdr%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTJobOdrName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTJobOdr.JOB_ODR_CD || ',';                                 --製番
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_DETAIL_NO  || ',';     --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_CANCEL_NO || ',';        --製番取消発生番号
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.PLANT_CD || ',';                 --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.ITEM_CD || ',';                  --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_TYP  || ',';             --製番種別
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.PLAN_TYP  || ',';                 --計画タイプ
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_DLV_DATE  || ',';         --製番納期
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_QTY  || ',';             --製番数
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.ALC_GRP_CD  || ',';             --引当グループコード
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_STS_TYP  || ',';         --製番状態区分
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_EXP_TYP  || ',';         --製番処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_DEL_FLG  || ',';         --製番削除フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.CREATED_DATE || ',';             --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.CREATED_BY || ',';               --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.CREATED_PRG_NM  || ',';         --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.UPDATED_DATE  || ',';             --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.UPDATED_BY || ',';               --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.UPDATED_PRG_NM  || ',';         --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.MODIFY_COUNT || ',';             --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTJobOdr.JOB_ODR_INPUT_TYP || ',';        --製番入力区分
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTJobOdr  INTO recTJobOdr;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTJobOdr;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTJobOdr%ISOPEN = TRUE THEN
          CLOSE curTJobOdr;
        END IF;
        RETURN FALSE;

    END SubFncTJobOdrCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTJobOdrCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :所要量計算制御(製番) CSVファイル出力
    '
    ' 引き数    : pvcPlant_Cd      工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 所要量計算制御(製番)データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSJobCalcCtrlCsvWrite(
         pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curSJobCalcCtrl(
        vcPlant_Cd             IN  VARCHAR2
      ) IS
        SELECT  PLANT_CD,                       --工場コード
                JOB_ODR_CD,                --製番
        OD_CALC_FLG,            --所要量計算中フラグ
                OD_MNT_FLG,                     --所要量メンテナンス中フラグ
          CREATED_DATE,            --作成日
        CREATED_BY,                --作成者
        CREATED_PRG_NM,            --作成プログラム名
        UPDATED_DATE,            --更新日
        UPDATED_BY,                --更新者
        UPDATED_PRG_NM,            --更新プログラム名
        MODIFY_COUNT            --更新数
      FROM  SYS_JOB_OD_CALC_CTRL JOB_CTRL
        where JOB_CTRL.PLANT_CD = vcPlant_Cd
        and (JOB_CTRL.JOB_ODR_CD) not in ( select JOB_OD.JOB_ODR_CD
                                                              from T_JOB_ODR JOB_OD
                                                              where JOB_OD.PLANT_CD = JOB_CTRL.PLANT_CD
                                                              AND JOB_OD.JOB_ODR_CD =JOB_CTRL.JOB_ODR_CD );
      recSJobCalcCtrl curSJobCalcCtrl%ROWTYPE;
    BEGIN
      OPEN curSJobCalcCtrl(pvcPlant_Cd);
      FETCH curSJobCalcCtrl INTO recSJobCalcCtrl;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curSJobCalcCtrl%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSJobCalcCtrlName ||  SUBSTR(lvc2Mrp_period,1,4) ||SUBSTR(lvc2Mrp_period,6,2)  || '.CSV','W');
        END IF;
        vc2WorkCsvData := recSJobCalcCtrl.PLANT_CD || ',';                                   --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.JOB_ODR_CD  || ',';             --製番
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.OD_CALC_FLG || ',';              --所要量計算中フラグ
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.OD_MNT_FLG || ',';               --所要量メンテナンス中フラグ
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.CREATED_DATE || ',';             --作成日 
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.CREATED_BY || ',';               --作成者
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.CREATED_PRG_NM  || ',';         --作成プログラム名 
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.UPDATED_DATE  || ',';             --更新日
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.UPDATED_BY || ',';               --更新者
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.UPDATED_PRG_NM  || ',';         --更新プログラム名   
        vc2WorkCsvData := vc2WorkCsvData || recSJobCalcCtrl.MODIFY_COUNT || ',';             --更新数
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curSJobCalcCtrl  INTO recSJobCalcCtrl;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curSJobCalcCtrl;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curSJobCalcCtrl%ISOPEN = TRUE THEN
          CLOSE curSJobCalcCtrl;
        END IF;
        RETURN FALSE;

    END SubFncSJobCalcCtrlCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOutputRsltCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 出来高実績削除データCSVファイル出力
    '
    ' 引き数    : pvcMrp_periodDate  MRP品目情報保持期間('YYYYMM')
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 出来高実績削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOutputRsltCsvWrite(
       pvcMrp_periodDate       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOutputRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OUTPUT_RSLT_CD,        --出来高実績番号
        ITEM_CD,            --品目番号
        ACPT_QTY,            --出来高実績良品数
        DEFECT_QTY,            --出来高実績不良数
        DEFECT_CAUSE_CD,      --出来高実績不良理由コード
        OPR_DATE,            --出来高実績作業日
        PLANT_CD,            --工場コード
        WH_CD,                --保管区コード
        WS_CD,                --作業区コード
        OUTPUT_RSLT_PERSON,      --出来高実績作業者
        OUTPUT_RSLT_COMMENT,    --出来高実績備考
        OPR_TIME_UNIT_TYP,      --出来高実績作業時間単位区分
        PRE_ARRANGEMENT_TIME,    --出来高実績前段取時間
        POST_ARRANGEMENT_TIME,    --出来高実績後段取時間
        OPR_TIME,            --出来高実績作業時間
        CESSATION_TIME,        --出来高実績停止時間
        CESSATION_CAUSE,      --出来高実績停止理由
        LOT_NO,                --在庫ロット番号
        VEND_LOT_NO,        --メーカロット番号
        PATTERN_CD,             --パターンコード
        CREATED_DATE,        --作成日
        CREATED_BY,            --作成者
        CREATED_PRG_NM,        --作成プログラム名
        UPDATED_DATE,        --更新日
        UPDATED_BY,            --更新者
        UPDATED_PRG_NM,        --更新プログラム名
        MODIFY_COUNT,        --更新数
        DEFECT_COMMENT        --出来高実績不良備考
          FROM  T_OUTPUT_RSLT
                where opr_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')
                  and plant_CD = pvc2PlantCd;     --A
      recTOutputRslt curTOutputRslt%ROWTYPE;
    BEGIN
      OPEN curTOutputRslt(pvcMrp_periodDate,pvcPlant_Cd);
      FETCH curTOutputRslt INTO recTOutputRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOutputRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOutputRsltName || SUBSTR(pvcMrp_periodDate,1,4) ||SUBSTR(pvcMrp_periodDate,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOutputRslt.OUTPUT_RSLT_CD || ',';                           --出来高実績番号
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.ITEM_CD  || ',';                --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.ACPT_QTY || ',';               --出来高実績良品数
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.DEFECT_QTY  || ',';            --出来高実績不良数
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.DEFECT_CAUSE_CD  || ',';        --出来高実績不良理由コー
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OPR_DATE  || ',';            --出来高実績作業日
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.PLANT_CD  || ',';            --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.WH_CD  || ',';                --保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.WS_CD|| ',';                   --作業区コード
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OUTPUT_RSLT_PERSON|| ',';      --出来高実績作業者
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OUTPUT_RSLT_COMMENT  || ',';    --出来高実績備考
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OPR_TIME_UNIT_TYP|| ',';       --出来高実績作業時間単位
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.PRE_ARRANGEMENT_TIME || ',';   --出来高実績前段取時間
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.POST_ARRANGEMENT_TIME || ',';  --出来高実績後段取時間
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.OPR_TIME  || ',';            --出来高実績作業時間
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CESSATION_TIME || ',';         --出来高実績停止時間
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CESSATION_CAUSE || ',';        --出来高実績停止理由
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.LOT_NO || ',';                 --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.VEND_LOT_NO || ',';            --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.PATTERN_CD || ',';             --パターンコード
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CREATED_DATE || ',';           --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CREATED_BY || ',';             --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.CREATED_PRG_NM || ',';         --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.UPDATED_DATE || ',';           --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.UPDATED_BY || ',';             --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.UPDATED_PRG_NM || ',';         --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.MODIFY_COUNT || ',';           --更新数
        vc2WorkCsvData := vc2WorkCsvData || recTOutputRslt.DEFECT_COMMENT || ',';         --出来高実績不良備考
        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOutputRslt   INTO recTOutputRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOutputRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOutputRslt%ISOPEN = TRUE THEN
          CLOSE curTOutputRslt;
        END IF;
        RETURN FALSE;

    END SubFncTOutputRsltCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTPOdrRnRsltCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 購入品返品実績ﾃﾞｰﾀ削除データCSVファイル出力
    '
    ' 引き数    : pvc2PchOdRtnRst_period  購入返品実績保持期間 
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 出来高実績削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTPOdrRnRsltCsvWrite(
       pvc2PchOdRtnRst_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTPOdrRnRslt(
        vcMrp_periodDate        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  PUCH_ODR_CD,        --購入返品番号
        COMPANY_CD,            --会社コード
        VEND_CD,            --取引先コード
        PLANT_CD,              --工場コード
        ITEM_CD,            --品目番号
        JOB_ODR_CD,            --製番
        JOB_ODR_DETAIL_NO,      --製番枝番
        INV_CTRL_FLG,        --在庫管理フラグ
        PUCH_ODR_PERSON,      --担当者コード
        PUCH_RTN_DATE,        --返品日
        PUCH_RTN_QTY,        --返品数
        WH_CD,                --返品元保管区コード
        LOT_NO,                --在庫ロット番号
        VEND_LOT_NO,        --メーカロット番号
        UNIT_COST_TYP,        --返品単価区分
        UNIT_COST,            --返品単価
        PROCESSING_COST,      --加工費
        MATERIAL_COST,        --材料費
        OTHER_OVERHEADS,      --その他経費
        PUCH_ODR_AMOUNT,      --返品金額
        DISC_AMOUNT,        --値引金額
        NET_AMOUNT,            --本体金額
        PUCH_RTN_COMMENT,      --返品理由コード
        RATE_JUDGE_DATE,      --レート判定日
        EXCH_RATE,            --為替レート
        TAX_RATE_1,            --税率1
        TAX_RATE_2,            --税率2
        TAX_RATE_3,            --税率3
        TAX_AMOUNT_1,        --税額1
        TAX_AMOUNT_2,        --税額2
        TAX_AMOUNT_3,        --税額3
        AMOUNT_INCLUDE_TAX,      --税込金額
        HOME_CUR_AMOUNT,      --邦貨金額
        TAX_CD,                --消費税コード
        TAX_ROUND_TYP,        --税端数区分
        RTN_DEL_FLG,        --返品取消フラグ
        RTN_DEL_DATE,        --返品取消日
        NON_NO_ITEM_NAME,      --備品品目名
        NON_NO_ITEM_TYP,      --備品製品区分
        NON_NO_ITEM_PUCH_ODR_UNIT,  --備品単位
        CREATED_DATE,        --作成日
        CREATED_BY,            --作成者
        CREATED_PRG_NM,        --作成プログラム名
        UPDATED_DATE,        --更新日
        UPDATED_BY,            --更新者
        UPDATED_PRG_NM,        --更新プログラム名
        MODIFY_COUNT        --更新数
          FROM T_PUCH_ODR_RTN_RSLT
                where puch_rtn_date <= to_date(vcMrp_periodDate,'yyyy/mm/dd')
                  and plant_CD = vcPlant_Cd;     --A
      recTPOdrRnRslt curTPOdrRnRslt%ROWTYPE;
    BEGIN
      OPEN curTPOdrRnRslt(pvc2PchOdRtnRst_period,pvcPlant_Cd);
      FETCH curTPOdrRnRslt INTO recTPOdrRnRslt;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTPOdrRnRslt%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTPOdrRnRsltName || SUBSTR(pvc2PchOdRtnRst_period,1,4) ||SUBSTR(pvc2PchOdRtnRst_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTPOdrRnRslt.PUCH_ODR_CD || ',';                          --購入返品番号
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.COMPANY_CD  || ',';       --会社コード
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.VEND_CD || ',';            --取引先コード
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PLANT_CD  || ',';           --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.ITEM_CD  || ',';           --品目番号
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.JOB_ODR_CD  || ',';       --製番
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.JOB_ODR_DETAIL_NO  || ',';--製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.INV_CTRL_FLG  || ',';       --在庫管理フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_ODR_PERSON|| ',';     --担当者コード
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_RTN_DATE|| ',';       --返品日
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_RTN_QTY  || ',';       --返品数
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.WH_CD|| ',';               --返品元保管区コード
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.LOT_NO || ',';             --在庫ロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.VEND_LOT_NO || ',';        --メーカロット番号
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UNIT_COST_TYP  || ',';   --返品単価区分
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UNIT_COST || ',';          --返品単価
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PROCESSING_COST || ',';    --加工費
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.MATERIAL_COST || ',';      --材料費
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.OTHER_OVERHEADS  || ',';   --その他経費
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_ODR_AMOUNT  || ',';   --返品金額
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.DISC_AMOUNT|| ',';         --値引金額
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NET_AMOUNT|| ',';          --本体金額
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.PUCH_RTN_COMMENT  || ',';   --返品理由コード
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.RATE_JUDGE_DATE|| ',';     --レート判定日
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.EXCH_RATE || ',';          --為替レート
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_RATE_1 || ',';         --税率1
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_RATE_2  || ',';       --税率2
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_RATE_3 || ',';         --税率3
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_AMOUNT_1 || ',';       --税額1
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_AMOUNT_2 || ',';       --税額2
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_AMOUNT_3 || ',';       --税額3
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.AMOUNT_INCLUDE_TAX || ','; --税込金額
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.HOME_CUR_AMOUNT || ',';    --邦貨金額
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_CD || ',';             --消費税コード
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.TAX_ROUND_TYP || ',';      --税端数区分
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.RTN_DEL_FLG || ',';        --返品取消フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.RTN_DEL_DATE || ',';       --返品取消日
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NON_NO_ITEM_NAME || ',';   --備品品目名
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NON_NO_ITEM_TYP || ',';    --備品製品区分
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.NON_NO_ITEM_PUCH_ODR_UNIT || ',';  --備品単位
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.CREATED_DATE || ',';           --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.CREATED_BY || ',';             --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.CREATED_PRG_NM || ',';         --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UPDATED_DATE || ',';           --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UPDATED_BY || ',';             --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.UPDATED_PRG_NM || ',';         --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTPOdrRnRslt.MODIFY_COUNT || ',';           --更新数

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTPOdrRnRslt   INTO recTPOdrRnRslt;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTPOdrRnRslt;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTPOdrRnRslt%ISOPEN = TRUE THEN
          CLOSE curTPOdrRnRslt;
        END IF;
        RETURN FALSE;

    END SubFncTPOdrRnRsltCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncTOdAlarmCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      : 所要量ｱﾗｰﾑﾘｽﾄﾃﾞｰﾀ削除データCSVファイル出力
    '
    ' 引き数    : pvc2OdAlm_period  所要量アラームリスト保持期間 
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 所要量ｱﾗｰﾑﾘｽﾄﾃﾞｰﾀCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdAlarmCsvWrite(
       pvc2OdAlm_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTOdAlarm(
        vc2OdAlm_period        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  OD_ALARM_NO,        --所要量アラームリスト番号
        OD_NO,                --オーダデマンド番号
        PLANT_CD,              --工場コード
        MRP_DATE,            --処理日
        JOB_ODR_CD,            --製番
        JOB_ODR_DETAIL_NO,      --製番枝番
        MSG_NO,                --メッセージ番号
        MSG,                  --メッセージ
        OD_ALARM_FLG,        --所要量アラームリスト発行済みフラグ
        CREATED_DATE,        --作成日
        CREATED_BY,            --作成者
        CREATED_PRG_NM,        --作成プログラム名
        UPDATED_DATE,        --更新日
        UPDATED_BY,            --更新者
        UPDATED_PRG_NM,        --更新プログラム名
        MODIFY_COUNT        --更新数
          FROM T_OD_ALARM AL
            where AL.od_alarm_flg = 1
              and AL.plant_CD = vcPlant_Cd --A
              and AL.mrp_date <= to_date(vc2OdAlm_period,'yyyy/mm/dd');
      recTOdAlarm curTOdAlarm%ROWTYPE;
    BEGIN
      OPEN curTOdAlarm(pvc2OdAlm_period,pvcPlant_Cd);
      FETCH curTOdAlarm INTO recTOdAlarm;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTOdAlarm%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdAlarmName || SUBSTR(pvc2OdAlm_period,1,4) ||SUBSTR(pvc2OdAlm_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTOdAlarm.OD_ALARM_NO || ',';                              --所要量アラームリスト番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_NO  || ',';               --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.PLANT_CD  || ',';               --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MRP_DATE  || ',';               --処理日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_CD  || ',';           --製番
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.JOB_ODR_DETAIL_NO  || ',';   --製番枝番
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG_NO  || ',';               --メッセージ番号
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MSG|| ',';                     --メッセージ
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.OD_ALARM_FLG|| ',';            --所要量アラームリスト発行済みフラグ
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_DATE || ',';           --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_BY || ',';             --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.CREATED_PRG_NM || ',';         --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_DATE || ',';           --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_BY || ',';             --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.UPDATED_PRG_NM || ',';         --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTOdAlarm.MODIFY_COUNT || ',';           --更新数

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTOdAlarm   INTO recTOdAlarm;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTOdAlarm;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTOdAlarm%ISOPEN = TRUE THEN
          CLOSE curTOdAlarm;
        END IF;
        RETURN FALSE;

    END SubFncTOdAlarmCsvWrite;
 /*-----------------------------------------------------------------
    'SubFncSysMsgLogCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :業務ﾒｯｾｰｼﾞﾃﾞｰﾀ削除データCSVファイル出力
    '
    ' 引き数    : pvc2BusinessMsg_period  業務メッセージ情報保持期間 
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 業務ﾒｯｾｰｼﾞﾃﾞｰﾀCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSysMsgLogCsvWrite(
       pvc2BusinessMsg_period       IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curSysMsgLog(
        vc2BusinessMsg_period        IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  LOG_CD,                --LOG識別番号
        PLANT_CD,              --工場コード
        BUSINESS_NAME,        --業務名
        MSG_CD,                --メッセージコード
        MSG,                --メッセージ
        DATA_STRING,          --データストリング
        CONFIRM_DATE,        --確認日時
        CREATED_DATE,        --作成日
        CREATED_BY,            --作成者
        CREATED_PRG_NM,        --作成プログラム名
        UPDATED_DATE,        --更新日
        UPDATED_BY,            --更新者
        UPDATED_PRG_NM,        --更新プログラム名
        MODIFY_COUNT        --更新数
          FROM SYS_MSG_LOG
            where updated_date is not null
              and plant_CD = vcPlant_Cd --A
              and updated_date <= to_date(vc2BusinessMsg_period,'yyyy/mm/dd');
      recSysMsgLog curSysMsgLog%ROWTYPE;
    BEGIN
      OPEN curSysMsgLog(pvc2BusinessMsg_period,pvcPlant_Cd);
      FETCH curSysMsgLog INTO recSysMsgLog;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curSysMsgLog%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSysMsgLogName || SUBSTR(pvc2BusinessMsg_period,1,4) || SUBSTR(pvc2BusinessMsg_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recSysMsgLog.LOG_CD || ',';                                   --LOG識別番号
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.PLANT_CD  || ',';            --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.BUSINESS_NAME  || ',';        --業務名
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.MSG_CD  || ',';                --メッセージコード
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.MSG  || ',';                    --メッセージ
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.DATA_STRING  || ',';            --データストリング
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CONFIRM_DATE  || ',';        --確認日時
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CREATED_DATE || ',';           --作成日
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CREATED_BY || ',';             --作成者
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.CREATED_PRG_NM || ',';         --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.UPDATED_DATE || ',';           --更新日
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.UPDATED_BY || ',';             --更新者
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.UPDATED_PRG_NM || ',';         --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recSysMsgLog.MODIFY_COUNT || ',';           --更新数

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curSysMsgLog   INTO recSysMsgLog;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curSysMsgLog;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curSysMsgLog%ISOPEN = TRUE THEN
          CLOSE curSysMsgLog;
        END IF;
        RETURN FALSE;

    END SubFncSysMsgLogCsvWrite;
/*-----------------------------------------------------------------
    'SubFncSysPsTCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :-製品構成トランザクションデータCSVファイル出力
    '
    ' 引き数    : pvc2ForPsT_period  製品構成トランザクション保持期間 
      ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 製品構成トランザクションﾃﾞｰﾀCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSysPsTCsvWrite(
       pvc2ForPsT_period       IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curSysPsT(
        vc2ForPsT_period        IN  VARCHAR2
      ) IS
        SELECT  SEQ_NO,                --SYSシーケンシャル番号
        PARENT_ITEM_CD,          --親品目番号
        COMP_ITEM_CD,        --子品目番号
        PS_EDITION,            --製品構成版数
        ACCESS_TYP,            --処理方法
        CMPLT_FLG,              --完了フラグ
        CREATED_DATE,        --作成日
        CREATED_BY,            --作成者
        CREATED_PRG_NM,        --作成プログラム名
        UPDATED_DATE,        --更新日
        UPDATED_BY,            --更新者
        UPDATED_PRG_NM,        --更新プログラム名
        MODIFY_COUNT        --更新数
          FROM SYS_PS_T
            where UPDATED_DATE <= to_date(vc2ForPsT_period,'yyyy/mm/dd') --A
              and cmplt_flg = 1;
      recSysPsT curSysPsT%ROWTYPE;
    BEGIN
      OPEN curSysPsT(pvc2ForPsT_period);
      FETCH curSysPsT INTO recSysPsT;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curSysPsT%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSysPsTName || SUBSTR(pvc2ForPsT_period,1,4) || SUBSTR(pvc2ForPsT_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recSysPsT.SEQ_NO || ',';                                   ---SYSシーケンシャル番号
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.PARENT_ITEM_CD  || ',';         --親品目番号
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.COMP_ITEM_CD  || ',';         --子品目番号
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.PS_EDITION  || ',';             --製品構成版数
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.ACCESS_TYP  || ',';             --処理方法
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CMPLT_FLG  || ',';             --完了フラグ
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CREATED_DATE || ',';           --作成日
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CREATED_BY || ',';             --作成者
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.CREATED_PRG_NM || ',';         --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.UPDATED_DATE || ',';           --更新日
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.UPDATED_BY || ',';             --更新者
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.UPDATED_PRG_NM || ',';         --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recSysPsT.MODIFY_COUNT || ',';           --更新数

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curSysPsT   INTO recSysPsT;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curSysPsT;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curSysPsT%ISOPEN = TRUE THEN
          CLOSE curSysPsT;
        END IF;
        RETURN FALSE;

    END SubFncSysPsTCsvWrite;
/*-----------------------------------------------------------------
    'SubFncTExtPlanCsvWrite
    '
    ' 修正履歴  2010.11.23 新規作成
    '
    ' 機能      :外部計画削除データCSVファイル出力
    '
    ' 引き数    : pvc2Mrp_period  MRP情報保持期間 
                  pvcPlant_Cd        工場コード
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 業務ﾒｯｾｰｼﾞﾃﾞｰﾀCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTExtPlanCsvWrite(
       pvc2Mrp_period          IN  VARCHAR2
      ,pvcPlant_Cd             IN  VARCHAR2
       ) RETURN BOOLEAN IS

      CURSOR curTExtPlan(
        vc2Mrp_period           IN  VARCHAR2
       ,vcPlant_Cd              IN  VARCHAR2
      ) IS
        SELECT  EXTERNAL_PLAN_CD,      --外部計画番号
                OD_NO,                      --オーダデマンド番号
        PLANT_CD,              --工場コード
        EXTERNAL_PLAN_REG_TYP,    --外部計画登録区分
        EXTERNAL_PLAN_EXP_TYP,    --外部計画処理区分
        EXTERNAL_PLAN_DEL_FLG,    --外部計画削除フラグ
        EXTERNAL_EXP_INDEX,      --外部計画展開インデックス
        EXTERNAL_LEVEL_NO,      --相対レベル番号
        CREATED_DATE,        --作成日
        CREATED_BY,            --作成者
        CREATED_PRG_NM,        --作成プログラム名
        UPDATED_DATE,        --更新日
        UPDATED_BY,            --更新者
        UPDATED_PRG_NM,        --更新プログラム名
        MODIFY_COUNT        --更新数
          FROM T_EXTERNAL_PLAN EP
                where not exists( select od_no from T_OD where EP.od_no = T_OD.od_no )
                  and UPDATED_DATE <= to_date(vc2Mrp_period,'yyyy/mm/dd')
                  and EXTERNAL_PLAN_EXP_TYP = 9
                  and plant_CD = vcPlant_Cd;
      recTExtPlan curTExtPlan%ROWTYPE;
    BEGIN
      OPEN curTExtPlan(pvc2Mrp_period,pvcPlant_Cd);
      FETCH curTExtPlan INTO recTExtPlan;
      /* CSV作成用カウント変数の初期化 */
      numWorkCnt := 0;
      WHILE curTExtPlan%FOUND LOOP
        /* CSV作成処理(OPEN) */
        IF numWorkCnt = 0 THEN
            uftWorkHandl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTExtPlanName || SUBSTR(pvc2Mrp_period,1,4) ||SUBSTR(pvc2Mrp_period,6,2) || '.CSV','W');
        END IF;
        vc2WorkCsvData := recTExtPlan.EXTERNAL_PLAN_CD || ',';                         --外部計画番号
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.OD_NO  || ',';                 --オーダデマンド番号
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.PLANT_CD  || ',';             --工場コード
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_PLAN_REG_TYP  || ','; --外部計画登録区分
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_PLAN_EXP_TYP  || ','; --外部計画処理区分
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_PLAN_DEL_FLG  || ','; --外部計画削除フラグ
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_EXP_INDEX  || ',';     --外部計画展開インデックス
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.EXTERNAL_LEVEL_NO  || ',';     --相対レベル番号
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.CREATED_DATE || ',';           --作成日
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.CREATED_BY || ',';             --作成者
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.CREATED_PRG_NM || ',';         --作成プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.UPDATED_DATE || ',';           --更新日
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.UPDATED_BY || ',';             --更新者
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.UPDATED_PRG_NM || ',';         --更新プログラム名
        vc2WorkCsvData := vc2WorkCsvData || recTExtPlan.MODIFY_COUNT || ',';           --更新数

        UTL_FILE.PUT_LINE(uftWorkHandl, CONVERT(vc2WorkCsvData ,'JA16SJIS' ,'AL32UTF8'));
        numWorkCnt := numWorkCnt + 1;

        FETCH curTExtPlan   INTO recTExtPlan;
      END LOOP;
      /* CSV作成処理(CLOSE) */
      IF numWorkCnt > 0 THEN
          UTL_FILE.FCLOSE(uftWorkHandl);
      END IF;
      CLOSE curTExtPlan;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        IF curTExtPlan%ISOPEN = TRUE THEN
          CLOSE curTExtPlan;
        END IF;
        RETURN FALSE;

    END SubFncTExtPlanCsvWrite;
 /*-----------------------------------------------------------------
--<メイン処理 >-----------------------------------------------------*/
begin

--DBMS_OUTPUT.ENABLE(1000000);
--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 開始 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));
vc2RunChkComment := NULL;

    /* LogFile の OPEN */

        LblnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle); --A

    --//TraceLogの出力(Start)処理を行う

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_START); --A

    --//業務開始のメッセージ取得

    lvc2Comment := '工場コード：[ '|| pvc2PlantCd ||' ]';--A
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_START,'(SBM0374)' || LOGMSG_START_PGNM_DeleteProc || lvc2Comment); --A
        commit;

        --ＴＥＭＰファイルのデータ削除
        delete from T_DEL_JOB_ODR_OD;

        commit;
    /*====================================================================================================*/
    /*                                                                                                    */
    /*  CSVファイルの出力パスを取得                                                                       */
    /*                                                                                                    */
    /*====================================================================================================*/
    BEGIN
       SELECT VALUE
         INTO CSV_FilePath
         FROM SYS_PARAMETER
       WHERE NAME = vc2DELETE_CSV_PATH;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
            vc2ErrCd     := APS_COM_CSV_PATH_NOT_FOUND;
            vc2ErrDetail := SUBSTR('SELECT [SYS_PARAMETER]:NAME = ' || vc2DELETE_CSV_PATH,1,256);
            RAISE excPARAMETER_ERR;
    END;
    IF(CSV_FilePath IS NULL OR CSV_FilePath='') THEN
            vc2ErrCd     := APS_COM_CSV_PATH_NOT_FOUND;
            vc2ErrDetail := SUBSTR('SELECT [SYS_PARAMETER]:NAME = ' || vc2DELETE_CSV_PATH,1,256);
            RAISE excPARAMETER_ERR;
    END IF;

/***********************
*    保持期間の算出    *
************************/

--vc2RunChkComment := '●●●●通過 00010';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        select count(*) into llngMaxCount from sys_mnt_period where plant_CD = pvc2PlantCd; --A
        if llngMaxCount < 7 then
            /***********************************
            *取得件数が８件以下ならエラー処理  *
            *ｴﾗｰﾒｯｾｰｼﾞを出力する               *
            ***********************************/
            RAISE excMaxcount;
        else
--vc2RunChkComment := '●●●●通過 00020';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
        open cur_Sys_Mnt_Period(pvc2PlantCd);
        loop
            fetch   cur_Sys_Mnt_Period into ltypSys_Mnt_Period;
            exit when cur_Sys_Mnt_Period%notfound;

            if ltypSys_Mnt_Period.mnt_data_typ is null then
            /**************************************************
            *取得した保持情報区分nullであるｴﾗｰﾒｯｾｰｼﾞを出力する*
            **************************************************/
                RAISE excSys_Mnt_Period_NULL;
            else
            --情報保持期間の計算
--vc2RunChkComment := '●●●●通過 00030';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);



                if ltypSys_Mnt_Period.mnt_data_typ = 1 then
                    --MRP品目情報保持期間
                    lvc2Mrp_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '●●●●通過 00040';
--DBMS_OUTPUT.PUT_LINE('MRP品目情報保持期間'||lvc2Mrp_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 2 then
                    --製番品目保持期間
                    lvc2JobOdr_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '●●●●通過 00050';
--DBMS_OUTPUT.PUT_LINE('製番品目保持期間'||lvc2JobOdr_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 3 then
                    --入出庫トランザクション情報保持期間 --A
                    lvc2RcvIssue_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '●●●●通過 00060';
--DBMS_OUTPUT.PUT_LINE('入出庫トランザクション情報保持期間'||lvc2RcvIssue_period); --A
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 4 then
                    --在庫情報保持期間
                    lvc2Stock_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '●●●●通過 00070';
--DBMS_OUTPUT.PUT_LINE('在庫情報保持期間'||lvc2Stock_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 5 then
                    --所要量アラームリスト保持期間
                    lvc2OdAlm_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '●●●●通過 00080';
--DBMS_OUTPUT.PUT_LINE('所要量アラームリスト保持期間'||lvc2OdAlm_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
                elsif ltypSys_Mnt_Period.mnt_data_typ = 6 then
                    --業務メッセージ情報保持期間
                    lvc2BusinessMsg_period :=
                             to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '●●●●通過 00090';
--DBMS_OUTPUT.PUT_LINE('業務メッセージ情報保持期間'||lvc2BusinessMsg_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '●●●●通過 00100';
--DBMS_OUTPUT.PUT_LINE('カレンダ情報保持期間'||lvc2Cal_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '●●●●通過 00110';
--DBMS_OUTPUT.PUT_LINE('検収情報保持期間'||lvc2InspcAcpt_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '●●●●通過 00120';
--DBMS_OUTPUT.PUT_LINE('出荷保留情報保持期間'||lvc2ShipRsv_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '●●●●通過 00130';
--DBMS_OUTPUT.PUT_LINE('検収金額情報保持期間'||lvc2InspcAcptAmount_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '●●●●通過 00140';
--DBMS_OUTPUT.PUT_LINE('売上送り状履歴情報保持期間'||lvc2PastSalesInvoice_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--vc2RunChkComment := '●●●●通過 00150';
--DBMS_OUTPUT.PUT_LINE('売上送り状情報保持期間'||lvc2SalesInvoice_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

                elsif ltypSys_Mnt_Period.mnt_data_typ = 7 then --A
                    --製品構成トランザクション保持期間
                    lvc2ForPsT_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');
--vc2RunChkComment := '●●●●通過 00160';
--DBMS_OUTPUT.PUT_LINE('製品構成トランザクション保持期間'||lvc2ForPsT_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


                --購入返品実績保持期間  205/08/12追加
                elsif ltypSys_Mnt_Period.mnt_data_typ = 11 then
                    lvc2PchOdRtnRst_period :=
                            to_char(add_months(to_date(pvcDeleteProcExecDate||'/01','yyyy/mm/dd'),-ltypSys_Mnt_Period.mnt_period)-1,'yyyy/mm/dd');


--DBMS_OUTPUT.PUT_LINE('ltypSys_Mnt_Period.mnt_data_typ:' || ltypSys_Mnt_Period.mnt_data_typ);
--vc2RunChkComment := '●●●●通過 00170';
--DBMS_OUTPUT.PUT_LINE('自動出庫要求保持期間'||lvc2ForAutoIssReq_period);
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    -------------------------------------------------------------------

                end if;
            end if;
        end loop;
        close cur_Sys_Mnt_Period;
        end if;
      --日付の編集
      lvc2WkDateTime :=  lvc2Stock_period || ' 23:59:59';
  /****************************************************************
  *                         csv出力処理                              *
  *****************************************************************/  
     --出庫指示(デマンド情報)の削除
     blnRet :=  SubFncTIssueInstDdCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --所要量ﾌｧｲﾙの削除（擬似品目以外）
     --csv出力処理がデータ削除直前に移動
     --blnRet :=  SubFncTOdTypExcCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --所要量ﾌｧｲﾙの削除（擬似品目）
     --csv出力処理がデータ削除直前に移動
     --blnRet :=  SubFncTOdTypIntCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --[発注残](オーダ情報)の削除 
     --csv出力処理がデータ削除直前に移動
     --blnRet := SubFncTRlPuchOdrTodCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --作業系列別仕掛ﾃﾞｰﾀ削除
     --csv出力処理がデータ削除直前に移動
     --blnRet := SubFncTWorkInPcByPrcCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --品目別仕掛ﾃﾞｰﾀ削除 
     --csv出力処理がデータ削除直前に移動
     --blnRet := SubFncTWorkInPcByItemCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --所要量ﾌｧｲﾙの削除（オーダ情報）
     --csv出力処理がデータ削除直前に移動
     --blnRet := SubFncTOdExc34CsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --発注残ﾃﾞｰﾀ削除(備品発注情報)
     --csv出力処理がデータ削除直前に移動
     --blnRet := SubFncTRlsdPuchOdrCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --製番計画削除
     blnRet := SubFncTDelJobOdrOdCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --出庫指示(製番情報)の削除
     blnRet :=SubFncTIssueInstJobCsvWrite();
     --発注残ﾃﾞｰﾀ削除(製番情報)
     blnRet :=SubFncTRsPuchOdrJobCsvWrite();
     --受入実績削除(製番情報)
     blnRet :=SubFncTAcptRsltJobCsvWrite();
     --検査実績削除(製番情報)
     blnRet :=SubFncTInspcRsltJobCsvWrite();
     --検査不良削除(製番情報)
     blnRet :=SubFncTInspcDefectJobCsvWrite();
     --検収履歴削除(製番情報)
     blnRet :=SubFncTPInsAcptJobCsvWrite();
     --検収金額履歴削除(製番情報)
     blnRet :=SubFncTPastInspcJobCsvWrite();
     --作業系列別仕掛ﾃﾞｰﾀ削除(製番情報)
     blnRet :=SubFncTWkInPcByPrcJobCsvWrite();
     --品目別仕掛(製番情報)
     blnRet :=SubFncTWkInPcByItemJobCsvWrite();
     --作業指示伝票(品目別仕掛)
     --csv出力処理がデータ削除直前に移動
     --blnRet :=SubFncTOprInstSlipItemCsvWrite(pvc2PlantCd);
     --作業指示伝票(系列別仕掛)
     --csv出力処理がデータ削除直前に移動
     --blnRet :=SubFncTOprInstSlipPrcCsvWrite(pvc2PlantCd);
     --製番引当ﾃﾞｰﾀ削除
     blnRet :=SubFncTJobOdrAlcCsvWrite();
     --所要量ﾌｧｲﾙの削除（製番情報)
     blnRet :=SubFncTOdJobCsvWrite();
--20150807 ADD START BY SYSCOM
     --入出庫別会計連携情報削除（計画外、移動による入出庫データ
     blnRet := SubFucTRcvIssAiIfDataCsvWriter(lvc2RcvIssue_period,pvc2PlantCd);
--20150807 ADD END BY SYSCOM
     --所要量アラームリストの削除（製番情報)
     blnRet :=SubFncTOdAlarmJobCsvWrite();
     --所要量再展開依頼の削除（製番情報)
     blnRet :=SubFncTMrpReexJobCsvWrite();
     --保管区別入出庫ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）
     --csv出力処理がデータ削除直前に移動
     --blnRet :=SubFncTRcvIssueSkCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
     --保管区別入出庫ﾃﾞｰﾀ削除（MRP品目,製番情報）
     --csv出力処理がデータ削除直前に移動
     --blnRet :=SubFncTRcvIssueMrpCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
     --保管区別品目在庫ﾃﾞｰﾀ削除
     blnRet :=SubFncTItemStockCsvWrite(lvc2WkDateTime,pvc2PlantCd);
     --保管区別製番在庫
     blnRet :=SubFncTJobCdStockCsvWrite(lvc2WkDateTime,pvc2PlantCd);
     --製番計画
     blnRet :=SubFncTJobOdrCsvWrite(pvc2PlantCd);
     --所要量計算制御(製番)
     blnRet :=SubFncSJobCalcCtrlCsvWrite(pvc2PlantCd);
     --出来高実績
     blnRet :=SubFncTOutputRsltCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     --購入品返品実績ﾃﾞｰﾀ削除
     blnRet :=SubFncTPOdrRnRsltCsvWrite(lvc2PchOdRtnRst_period,pvc2PlantCd);
     --所要量ｱﾗｰﾑﾘｽﾄﾃﾞｰﾀ削除
     blnRet :=SubFncTOdAlarmCsvWrite(lvc2OdAlm_period,pvc2PlantCd);
     --業務ﾒｯｾｰｼﾞﾃﾞｰﾀ削除
     blnRet :=SubFncSysMsgLogCsvWrite(lvc2BusinessMsg_period,pvc2PlantCd);
     --製品構成トランザクション
     blnRet :=SubFncSysPsTCsvWrite(lvc2ForPsT_period);
     --外部計画削除T_EXTERNAL_PLANSubFncTExtPlanCsvWritelvc2Mrp_period
     blnRet :=SubFncTExtPlanCsvWrite(lvc2Mrp_period,pvc2PlantCd);
  /****************************************************************
  *                         削除処理                              *
  *****************************************************************/


--vc2RunChkComment := '●●●●通過 00180';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

    /**********************************************************
    *  MRP品目のトランザクションデータ削除処理(デマンド情報)  *
    **********************************************************/

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0743)◆◆ MRP品目のトランザクションデータ削除処理(デマンド情報) ◆◆'); --A

--vc2RunChkComment := '●●●●通過 00190';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00210';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --出庫指示ﾌｧｲﾙの削除
        delete from T_ISSUE_INST ISS_I
            where exists(select 'x' from t_od OD
                            where ISS_I.od_no = OD.od_no
                              and OD.plant_CD = pvc2PlantCd  --A 工場コード
                              and OD.job_odr_cd is null                                       --製番
                              and OD.dm_sts_typ = 9                                       --デマンド状態区分
                              and OD.issue_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --出庫完了日 <= MRP品目情報保持期間

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0744)出庫指示削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00220';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --所要量ﾌｧｲﾙの削除（擬似品目以外）のcsv出力
     blnRet :=  SubFncTOdTypExcCsvWrite(lvc2Mrp_period,pvc2PlantCd);

        --所要量ﾌｧｲﾙの削除（擬似品目以外）
        delete from T_od
            where job_odr_cd is null                                        --製番
              and plant_CD = pvc2PlantCd    --A 工場コード
              and dm_sts_typ = 9                                            --デマンド状態区分
              and issue_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --出庫完了日 <= MRP品目情報保持期間
              and not ( od_typ = 4 );                                       --オーダデマンド区分

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0745)所要量（擬似品目以外）削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00225';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --所要量ﾌｧｲﾙの削除（擬似品目）のcsv出力
     blnRet :=  SubFncTOdTypIntCsvWrite(lvc2Mrp_period,pvc2PlantCd);

        --所要量ﾌｧｲﾙの削除（擬似品目）
        delete from T_od OD1
            where not exists( select od_no from T_od OD2 WHERE OD1.od_no = OD2.parent_od_no )
              and OD1.plant_CD = pvc2PlantCd    --A 工場コード
              and OD1.job_odr_cd is null                               --製番
              and OD1.dm_sts_typ = 9                                   --デマンド状態区分
              and OD1.updated_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --更新日 <= MRP品目情報保持期間
              and OD1.od_typ = 4;                                      --オーダデマンド区分

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0746)所要量（擬似品目）削除件数：'||SQL%ROWCOUNT); --A


    /*******************************************************
    *  MRP品目/トランザクションデータ削除処理(オーダ情報)  *
    ********************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0747)◆◆ MRP品目/トランザクションデータ削除処理(オーダ情報) ◆◆'); --A
--20150807 ADD START BY SYSCOM
vc2RunChkComment := '●●●●通過 00425';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --入出庫別会計連携情報ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）
        DELETE FROM
          T_RCV_ISSUE_AI_IF_DATA ISSAID
        WHERE
                   ISSAID.RCV_ISSUE_CTRL_CD IN ( SELECT RCV.RCV_ISSUE_CTRL_CD
                                               FROM
                                                 T_RCV_ISSUE RCV
                                               WHERE
                                                 RCV.plant_CD = pvc2PlantCd
                                                 AND RCV.od_no is NULL
                                                 AND RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
                                                 AND (RCV.stock_upd_typ = 2 OR RCV.stock_upd_typ = 3));  
          
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1614)入出庫別会計連携情報(計画外、移動)削除件数：'||SQL%ROWCOUNT); --A
--20150807 ADD END BY SYSCOM


--vc2RunChkComment := '●●●●通過 00230';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --[検収履歴](オーダ情報)のcsv出力
     blnRet := SubFncTPastInspcAcptCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[検収金額履歴](オーダ情報)のcsv出力
     blnRet := SubFncTPastInspcCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[検査不良](オーダ情報)のcsv出力
     blnRet := SubFncTInspcDefectCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[検査実績](オーダ情報)のcsv出力
     blnRet := SubFncTInspcRsltCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[受入実績](オーダ情報)のcsv出力 
     blnRet := SubFncTAcptRsltCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[発注残](オーダ情報)のcsv出力
     blnRet := SubFncTRlPuchOdrTodCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --検収履歴ﾃﾞｰﾀ削除
            delete from T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                    --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')    --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and ACPT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1604)検収履歴削除件数：'||SQL%ROWCOUNT);

            --検収金額履歴ﾃﾞｰﾀ削除
            delete from T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                    --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')    --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and AMOUNT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1605)検収金額履歴削除件数：'||SQL%ROWCOUNT);
                                    
            --検査不良ﾃﾞｰﾀ削除
            delete from T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and INSPC.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1606)検査不良削除件数：'||SQL%ROWCOUNT);
            
            --検査実績ﾃﾞｰﾀ削除
            delete from T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1607)検査実績削除件数：'||SQL%ROWCOUNT);
            
            --受入実績ﾃﾞｰﾀ削除
            delete from T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from  T_od OD1
                                                where RLSD.od_no = OD1.od_no
                                                  and   OD1.plant_CD = pvc2PlantCd                                     --A 工場コード
                                                  and   OD1.job_odr_cd is null                                        --製番
                                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                                              where OD2.parent_od_no = OD1.od_no
                                                                                                    and OD2.od_typ in (3,4))
                                                  and RSLT.PUCH_ODR_CD = RLSD.PUCH_ODR_CD));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1608)受入実績削除件数：'||SQL%ROWCOUNT);
            
            --発注残ﾃﾞｰﾀ削除
            delete from T_RLSD_PUCH_ODR RLSD
                where exists(select 'x' from  T_od OD1
                                where   RLSD.od_no = OD1.od_no
                                  and   OD1.plant_CD = pvc2PlantCd    --A 工場コード
                                  and   OD1.job_odr_cd is null                                        --製番
                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')    --入庫完了日 <= MRP品目情報保持期間
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0748)発注残削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00240';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00250';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --作業系列別仕掛ﾃﾞｰﾀのcsv出力
     blnRet := SubFncTWorkInPcByPrcCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --作業系列別仕掛ﾃﾞｰﾀ削除
            delete from T_WORK_IN_PROC_BY_PROC PROC
                where exists(select 'x' from t_od OD1
                                    where OD1.job_odr_cd is null                                     --製番
                                      and OD1.plant_CD = pvc2PlantCd    --A 工場コード
                                      and OD1.odr_sts_typ = 9                                        --オーダ状態区分
                                      and OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --入庫完了日 <= MRP品目情報保持期間
                                      and not exists (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4))                 --ここまでが前提条件 upd 2002.09.04
                                      and PROC.od_no = OD1.od_no);                                  --  以下<作業系列別仕掛>抽出の条件

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0749)作業系列別仕掛削除件数：'||SQL%ROWCOUNT); --A


--vc2RunChkComment := '●●●●通過 00260';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --品目別仕掛ﾃﾞｰﾀのcsv出力
     blnRet := SubFncTWorkInPcByItemCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --品目別仕掛ﾃﾞｰﾀ削除
            delete from T_WORK_IN_PROC_BY_ITEM PITEM
                where exists(select 'x' from t_od OD1
                                where OD1.job_odr_cd is null                                     --製番
                                  and OD1.plant_CD = pvc2PlantCd    --A 工場コード
                                  and OD1.odr_sts_typ = 9                                        --オーダ状態区分
                                  and OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --入庫完了日 <= MRP品目情報保持期間
                                  and not exists (select OD2.parent_od_no from T_od OD2
                                                             where OD2.parent_od_no = OD1.od_no
                                                             and OD2.od_typ in (3,4))         --ここまでが前提条件  up 2002.09.04
                                  and PITEM.od_no = OD1.od_no);                             --以下<品目別仕掛>抽出の条件

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0750)品目別仕掛削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00270';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00290';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --所要量アラームリストのcsv出力（オーダ情報）
     blnRet := SubFncTOdAlarmCsvRWrite(lvc2Mrp_period,pvc2PlantCd);

     --所要量再展開依頼のcsv出力（オーダ情報）
     blnRet := SubFncTMrpReexplosioCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --所要量ﾌｧｲﾙのcsv出力（オーダ情報）
     blnRet := SubFncTOdExc34CsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --所要量アラームリストﾃﾞｰﾀ削除
            delete from T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where  ALARM.od_no = OD1.od_no
                                  and   OD1.plant_CD = pvc2PlantCd                                     --A 工場コード
                                  and   OD1.job_odr_cd is null                                        --製番
                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0767)所要量アラームリスト削除件数：'||SQL%ROWCOUNT); --A
            
            --所要量再展開依頼ﾃﾞｰﾀ削除
            delete from T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where  REE.od_no = OD1.od_no
                                  and   OD1.plant_CD = pvc2PlantCd                                     --A 工場コード
                                  and   OD1.job_odr_cd is null                                        --製番
                                  and   OD1.odr_sts_typ = 9                                           --オーダ状態区分
                                  and   OD1.rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')  --入庫完了日 <= MRP品目情報保持期間
                                  and   OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                                    and OD2.od_typ in (3,4))); -- upd 2002.09.04
            
            BlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1609)所要量再展開依頼削除件数：'||SQL%ROWCOUNT); --A
            
            --所要量ﾌｧｲﾙの削除
            delete from T_od OD1
                where job_odr_cd is null                                     --製番
                  and plant_CD = pvc2PlantCd    --A 工場コード
                  and odr_sts_typ = 9                                        --オーダ状態区分
                  and rcv_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --入庫完了日 <= MRP品目情報保持期間
                  and OD1.od_no not in (select OD2.parent_od_no from T_od OD2
                                                              where OD2.parent_od_no = OD1.od_no
                                                                and OD2.od_typ in (3,4));   --ここまでが前提条件

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0751)所要量削除件数：'||SQL%ROWCOUNT); --A


    /**********************************************************
    *   MRP品目/トランザクションデータ削除処理(備品発注情報)  *
    ***********************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0752)◆◆ MRP品目/トランザクションデータ削除処理(備品発注情報) ◆◆'); --A

--vc2RunChkComment := '●●●●通過 00300';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --[検収履歴](備品発注情報)のcsv出力
     blnRet := SubFncTPastInspcAcptBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --[検収金額履歴](備品発注情報)のcsv出力
     blnRet := SubFncTPastInspcBhcsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --[検査不良](備品発注情報)のcsv出力
     blnRet := SubFncTInspcDefectBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --[検査実績](備品発注情報)のcsv出力
     blnRet := SubFncTInspcRsltBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --[受入実績](備品発注情報)のcsv出力
     blnRet := SubFncTAcptRsltBhCsvWrite(lvc2Mrp_period,pvc2PlantCd);

     --発注残ﾃﾞｰﾀのcsv出力(備品発注情報)
     blnRet := SubFncTRlsdPuchOdrCsvWrite(lvc2Mrp_period,pvc2PlantCd);

            --検収履歴ﾃﾞｰﾀ削除
            delete from T_PAST_INSPC_ACPT ACPT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where ACPT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = pvc2PlantCd                                      --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd'));   --受入完了日

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1604)検収履歴削除件数：'||SQL%ROWCOUNT);

            --検収金額履歴ﾃﾞｰﾀ削除
            delete from T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where AMOUNT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = pvc2PlantCd                                      --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd'));   --受入完了日

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1605)検収金額履歴削除件数：'||SQL%ROWCOUNT);

            --検査不良ﾃﾞｰﾀ削除
            delete from T_INSPC_DEFECT INSPC
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where INSPC.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = pvc2PlantCd                                       --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --受入完了日
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1606)検査不良削除件数：'||SQL%ROWCOUNT);
            
            --検査実績ﾃﾞｰﾀ削除
            delete from T_INSPC_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                            --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = pvc2PlantCd                                       --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                        --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --受入完了日
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1607)検査実績削除件数：'||SQL%ROWCOUNT);
            
            --受入実績ﾃﾞｰﾀ削除
            delete from T_ACPT_RSLT RSLT
                where exists(select 'x' from  T_RLSD_PUCH_ODR ODR
                                where RSLT.PUCH_ODR_CD = ODR.PUCH_ODR_CD
                                  and ODR.inv_ctrl_flg = 0                                           --在庫管理ﾌﾗｸﾞ
                                  and ODR.plant_CD = pvc2PlantCd                                      --A 工場コード
                                  and ODR.puch_odr_sts_typ = 9                                       --発注状態区分
                                  and ODR.acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')); --受入完了日
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1608)受入実績削除件数：'||SQL%ROWCOUNT);

        --発注残ﾃﾞｰﾀ削除
        delete from T_RLSD_PUCH_ODR
            where inv_ctrl_flg = 0                                         --在庫管理ﾌﾗｸﾞ
              and plant_CD = pvc2PlantCd    --A 工場コード
              and puch_odr_sts_typ = 9                                     --発注状態区分
              and acpt_cmplt_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd'); --受入完了日

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0748)発注残削除件数：'||SQL%ROWCOUNT); --A


    /**********************************************************
    *      トランザクション系データ削除処理(製番品目)         *
    ***********************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0753)◆◆ トランザクション系データ削除処理(製番品目) ◆◆'); --A

--vc2RunChkComment := '●●●●通過 00330';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --出庫指示ﾃﾞｰﾀ削除
        --                      取得した 製番－枝番－取消発生番号 をもとに 保管区別製番在庫を検索し
        --                      数量が０でなければ（数量＜＞０）削除対象
        delete from T_ISSUE_INST IS_INST
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL
                                   where IS_INST.OD_NO in (select od_no from t_od OD
                                                           where DEL.JOB_ODR_CD = OD.JOB_ODR_CD
                                                             and DEL.JOB_ODR_DETAIL_NO = OD.JOB_ODR_DETAIL_NO
                                                             and DEL.job_odr_cancel_no = OD.job_odr_cancel_no
                                                             and (OD.od_typ = 1 or OD.od_typ = 3)));    --仕変指示ﾒｰﾙ2000/03/30

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0744)出庫指示削除件数：'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00340';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --検収履歴ﾃﾞｰﾀ削除
            delete from T_PAST_INSPC_ACPT ACPT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1604)検収履歴削除件数：'||SQL%ROWCOUNT);

            --検収金額履歴ﾃﾞｰﾀ削除
            delete from T_PAST_INSPC_ACPT_AMOUNT AMOUNT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1605)検収金額履歴削除件数：'||SQL%ROWCOUNT);

            --検査不良ﾃﾞｰﾀ削除
            delete from T_INSPC_DEFECT INSPC
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1606)検査不良削除件数：'||SQL%ROWCOUNT);
            
            --検査実績ﾃﾞｰﾀ削除
            delete from T_INSPC_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1607)検査実績削除件数：'||SQL%ROWCOUNT);
            
            --受入実績ﾃﾞｰﾀ削除
            delete from T_ACPT_RSLT RSLT
                where exists(select PUCH_ODR_CD from  T_RLSD_PUCH_ODR RLSD
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, t_od OD
                                                   where OD.od_no              = RLSD.od_no
                                                     and DEL.job_odr_cd        = OD.job_odr_cd
                                                     and DEL.job_odr_detail_no = OD.job_odr_detail_no));
            
            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1608)受入実績削除件数：'||SQL%ROWCOUNT);

        --発注残ﾃﾞｰﾀ削除
        --                      取得した 製番－枝番－取消発生番号 をもとに 保管区別製番在庫を検索し
        --                      数量が０でなければ（数量＜＞０）削除対象
        delete from T_RLSD_PUCH_ODR RLSD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         t_od OD
                            where OD.od_no              = RLSD.od_no
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0748)発注残削除件数：'|| SQL%ROWCOUNT); --A


--vc2RunChkComment := '●●●●通過 00350';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);


--vc2RunChkComment := '●●●●通過 00360';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --作業系列別仕掛ﾃﾞｰﾀ削除
        --                      取得した 製番－枝番－取消発生番号 をもとに 保管区別製番在庫を検索し
        --                      数量が０でなければ（数量＜＞０）削除対象
        delete from T_WORK_IN_PROC_BY_PROC PROC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no              = PROC.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0749)作業系列別仕掛削除件数：'|| SQL%ROWCOUNT); --A


--vc2RunChkComment := '●●●●通過 00370';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --品目別仕掛ﾃﾞｰﾀ削除
        --                      取得した 製番－枝番－取消発生番号 をもとに 保管区別製番在庫を検索し
        --                      数量が０でなければ（数量＜＞０）削除対象
        delete from T_WORK_IN_PROC_BY_ITEM PITEM
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                    t_od od
                        where OD.od_no = PITEM.od_no
                          and DEL.job_odr_cd        = OD.job_odr_cd
                          and DEL.job_odr_detail_no = OD.job_odr_detail_no
                          and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0750)品目別仕掛削除件数：'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00380';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     --作業実績(品目別仕掛)のcsv出力
     blnRet :=SubFncTOprRsltSkcsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --作業不良(品目別仕掛)のcsv出力
     blnRet :=SubFncTDefectSkcsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
      --作業指示伝票(品目別仕掛)のcsv出力
     blnRet :=SubFncTOprInstSlipItemCsvWrite(pvc2PlantCd);
     
     --作業実績(系列別仕掛)のcsv出力
     blnRet :=SubFncTOprRsltKecsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --作業不良(系列別仕掛)のcsv出力
     blnRet :=SubFncTDefectKecsvWrite(lvc2Mrp_period,pvc2PlantCd);
     
     --作業指示伝票(系列別仕掛)のcsv出力
     blnRet :=SubFncTOprInstSlipPrcCsvWrite(pvc2PlantCd);

        --作業指示伝票削除

--        delete from T_OPR_INST_SLIP SLIP
--            where opr_inst_cd not in(select opr_inst_cd from t_work_in_proc_by_proc
--                                        where opr_inst_cd is not null)
--              and opr_inst_cd not in(select opr_inst_cd from t_work_in_proc_by_item
--                                        where opr_inst_cd is not null)
--              and plant_CD = pvc2PlantCd ;    --A

          -- 作業実績（品目別仕掛）
          delete from T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1610)作業実績（品目別仕掛）削除件数：'|| SQL%ROWCOUNT); --A
                               
          -- 作業不良（品目別仕掛）
          delete from T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                                           where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 1
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1611)作業不良（品目別仕掛）削除件数：'|| SQL%ROWCOUNT); --A
                               
          -- 作業実績（系列別仕掛分）
          delete from T_OPR_RSLT RSLT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and RSLT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1612)作業実績（系列別仕掛分）削除件数：'|| SQL%ROWCOUNT); --A
                               
          -- 作業不良（系列別仕掛分）
          delete from T_DEFECT DEFECT
                where exists (select 'x' from T_OPR_INST_SLIP SLIP
                                 where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                                           where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
                                                               and SLIP.opr_inst_cd_gnr_typ = 2
                                                               and SLIP.plant_CD = pvc2PlantCd
                                                               and DEFECT.OPR_INST_CD = SLIP.OPR_INST_CD);
          
          LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1613)作業不良（系列別仕掛分）削除件数：'|| SQL%ROWCOUNT); --A

          -- 作業指示伝票 （品目別仕掛分）
          delete from T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_ITEM WIBI
                                          where SLIP.opr_inst_cd  = WIBI.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 1
               and plant_CD = pvc2PlantCd ;

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0755)作業指示伝票削除件数１：'|| SQL%ROWCOUNT); --A

          -- 作業指示伝票 （系列別仕掛分）
          delete from T_OPR_INST_SLIP SLIP
              where not exists (select opr_inst_cd from T_WORK_IN_PROC_BY_PROC WIBP
                                          where SLIP.opr_inst_cd  = WIBP.opr_inst_cd)
               and opr_inst_cd_gnr_typ = 2
               and plant_CD = pvc2PlantCd ;

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0756)作業指示伝票削除件数２：'|| SQL%ROWCOUNT); --A


--vc2RunChkComment := '●●●●通過 00390';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00410';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --製番引当ﾃﾞｰﾀ削除
        --                      取得した 製番－枝番－取消発生番号 をもとに 保管区別製番在庫を検索し
        --                      数量が０でなければ（数量＜＞０）削除対象
        delete from T_JOB_ODR_ALC ALC
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD
                            where OD.OD_NO = ALC.OD_NO
                              and DEL.job_odr_cd        = OD.job_odr_cd
                              and DEL.job_odr_detail_no = OD.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0757)製番引当削除件数：'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00420';
--20031104 DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --所要量アラームリストﾃﾞｰﾀ削除（製番情報)
        delete from T_OD_ALARM ALARM
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0767)所要量アラームリスト削除件数：'|| SQL%ROWCOUNT); --A
        
        --所要量再展開依頼ﾃﾞｰﾀ削除（製番情報)
        delete from T_MRP_REEXPLOSION REE
                where exists(select 'x' from  T_od OD1
                                where exists(select 'x' from T_DEL_JOB_ODR_OD DEL, T_OD OD2
                                     where OD2.OD_NO = OD1.OD_NO
                                         and DEL.job_odr_cd        = OD2.job_odr_cd
                                         and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                                         and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no));
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1609)所要量再展開依頼削除件数：'|| SQL%ROWCOUNT); --A

        --所要量ﾃﾞｰﾀ削除
        --                      取得した 製番－枝番－取消発生番号 をもとに 保管区別製番在庫を検索し
        --                      数量が０でなければ（数量＜＞０）削除対象
        delete from T_OD OD
            where exists(select 'x' from T_DEL_JOB_ODR_OD DEL,
                                         T_OD OD2
                            where OD2.OD_NO = OD.OD_NO
                              and DEL.job_odr_cd        = OD2.job_odr_cd
                              and DEL.job_odr_detail_no = OD2.job_odr_detail_no
                              and DEL.job_odr_cancel_no = OD2.job_odr_cancel_no);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0751)所要量削除件数：'|| SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00320';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --仕変指示ﾒｰﾙ2000/03/26
        DELETE FROM T_DEL_JOB_ODR_OD DEL
             WHERE exists(select 'x' from T_JOB_ODR_CD_STOCK J_STOCK
                       where DEL.JOB_ODR_CD = J_STOCK.JOB_ODR_CD
                         and DEL.JOB_ODR_DETAIL_NO = J_STOCK.JOB_ODR_DETAIL_NO
                         and J_STOCK.plant_cd = pvc2PlantCd    --A 工場コード
                         and J_STOCK.stock_on_hand_qty <> 0); --A

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                               pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0754)製番在庫有りの為削除対象外件数：'|| SQL%ROWCOUNT); --A

     /***************************************************************************************
     *  トランザクション系データ削除                                                        *
     *      (保管区別入出庫､保管区別品目在庫､保管区別製番在庫､製番計画､出来高実績､検収､     *
     *       検収金額､売上送り状履歴､売上送り状)                                            *
     ***************************************************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0758)◆◆ トランザクション系データ削除 ◆◆');

--vc2RunChkComment := '●●●●通過 00430';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --品目別入出庫ﾃﾞｰﾀ（計画外、移動による入出庫データ）のcsv出力
        blnRet :=SubFncTRcvIssueItemSkCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --保管区別入出庫ﾃﾞｰﾀ（計画外、移動による入出庫データ）のcsv出力
        blnRet :=SubFncTRcvIssueSkCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --品目別入出庫ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）
        delete from T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where RCV.od_no is NULL
                             and RCV.WH_CD = M.WH_CD      --保管区コード
                             and M.PLANT_CD = pvc2PlantCd   --工場コード
                             and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1615)品目別入出庫(計画外、移動)削除件数：'||SQL%ROWCOUNT); --A
        
        --保管区別入出庫ﾃﾞｰﾀ削除（計画外、移動による入出庫データ）
        delete from T_RCV_ISSUE RCV
            where RCV.od_no is NULL
              and RCV.plant_CD = pvc2PlantCd     --A
              and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0759)保管区別入出庫(計画外、移動)削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00435';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --品目別入出庫ﾃﾞｰﾀ（ＭＲＰ品目、製番品目の入出庫データ）のcsv出力
        blnRet :=SubFncTRcvIssueItemMrpCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --保管区別入出庫ﾃﾞｰﾀ（ＭＲＰ品目、製番品目の入出庫データ）のcsv出力
        blnRet :=SubFncTRcvIssueMrpCsvWrite(lvc2RcvIssue_period,pvc2PlantCd);
        
        --品目別入出庫ﾃﾞｰﾀ削除（ＭＲＰ品目、製番品目の入出庫データ）
        delete from T_RCV_ISSUE_ITEM ISSUE_ITEM
                where exists(select RCV_ISSUE_CTRL_CD from T_RCV_ISSUE RCV , M_WH M
                             where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
                             and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
                             and RCV.WH_CD = M.WH_CD
                             and M.PLANT_CD = pvc2PlantCd
                             and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3)
                             and ISSUE_ITEM.RCV_ISSUE_CTRL_CD = RCV.RCV_ISSUE_CTRL_CD);
        
        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM1616)品目別入出庫（ＭＲＰ品目、製番品目）削除件数：'||SQL%ROWCOUNT); --A

        --保管区別入出庫ﾃﾞｰﾀ削除（ＭＲＰ品目、製番品目の入出庫データ）
        delete from T_RCV_ISSUE RCV
            where not exists( select od_no from T_OD where RCV.od_no = T_OD.od_no )
              and RCV.rcv_issue_date <= to_date(lvc2RcvIssue_period,'yyyy/mm/dd')
              and RCV.plant_CD = pvc2PlantCd     --A
              and (RCV.stock_upd_typ = 2 or RCV.stock_upd_typ = 3);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0760)保管区別入出庫（ＭＲＰ品目、製番品目）削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00440';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --保管区別品目在庫ﾃﾞｰﾀ削除

        delete from T_ITEM_STOCK
            where stock_on_hand_qty = 0
              and UPDATED_DATE <= to_date(lvc2WkDateTime,'yyyy/mm/dd HH24:MI:SS') --A
              and plant_CD = pvc2PlantCd     --A
              and defect_qty = 0;


        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0761)保管区別品目在庫削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00450';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --保管区別製番在庫ﾃﾞｰﾀ削除
        --日付の編集
        lvc2WkDateTime :=  lvc2Stock_period || ' 23:59:59';

        delete from T_JOB_ODR_CD_STOCK
            where stock_on_hand_qty = 0
              and plant_CD = pvc2PlantCd     --A
              and UPDATED_DATE <= to_date(lvc2WkDateTime,'yyyy/mm/dd HH24:MI:SS'); --A

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0762)保管区別製番在庫削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00460';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --製番計画ﾃﾞｰﾀ削除
        delete from T_JOB_ODR JOB
        where JOB.job_odr_sts_typ = 9                   --以下<製番計画の抽出条件>
        and plant_CD = pvc2PlantCd     --A
        and (   JOB.job_odr_cd,
                JOB.job_odr_detail_no,
                JOB.job_odr_cancel_no,
                JOB.item_cd) not in (   select  OD.job_odr_cd,
                                                OD.job_odr_detail_no,
                                                OD.job_odr_cancel_no,
                                                OD.item_cd
                                        from    t_od OD
                                        where   OD.job_odr_cd           = JOB.job_odr_cd
                                        and     OD.job_odr_detail_no    = JOB.job_odr_detail_no
                                        and     OD.job_odr_cancel_no    = JOB.job_odr_cancel_no
                                        and     OD.item_cd              = JOB.item_cd)
        and (   JOB.job_odr_cd,                         --以下<保管区別製番在庫の抽出条件>
                JOB.job_odr_detail_no,
                JOB.item_cd) not in (   select  STOCK.job_odr_cd,
                                                STOCK.job_odr_detail_no,
                                                STOCK.item_cd
                                        from    T_JOB_ODR_CD_STOCK STOCK
                                        where   STOCK.job_odr_cd        = JOB.job_odr_cd
                                        and     STOCK.job_odr_detail_no = JOB.job_odr_detail_no
                                        and     STOCK.item_cd           = JOB.item_cd);

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0763)製番計画削除件数：'||SQL%ROWCOUNT); --A


        --所要量計算制御(製番)ﾃﾞｰﾀ削除
        delete from SYS_JOB_OD_CALC_CTRL JOB_CTRL
        where JOB_CTRL.PLANT_CD = pvc2PlantCd
        and (JOB_CTRL.JOB_ODR_CD) not in ( select JOB_OD.JOB_ODR_CD
                                                              from T_JOB_ODR JOB_OD
                                                              where JOB_OD.PLANT_CD = JOB_CTRL.PLANT_CD
                                                              AND JOB_OD.JOB_ODR_CD =JOB_CTRL.JOB_ODR_CD );
         LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0824)所要量計算制御(製番)削除件数：'||SQL%ROWCOUNT); --A
        /**********************
        * 出来高実績ﾃﾞｰﾀ削除  *
        **********************/

--vc2RunChkComment := '●●●●通過 00470';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --出来高実績ﾃﾞｰﾀ削除する前に、出来高実績の削除対象ﾃﾞｰﾀに対する作業実績の出来高実績番号の初期化を行う
            update T_OPR_RSLT set output_rslt_cd = ''
                where opr_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd') --A
                  and plant_CD = pvc2PlantCd;     --A

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0764)作業実績の出来高実績番号の初期化'); --A

--vc2RunChkComment := '●●●●通過 00480';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --出来高実績ﾃﾞｰﾀ削除
            delete from T_OUTPUT_RSLT
                where opr_date <= to_date(lvc2Mrp_period,'yyyy/mm/dd')
                  and plant_CD = pvc2PlantCd;     --A

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0765)出来高実績削除件数：'||SQL%ROWCOUNT); --A

       /***************************
        * 購入品返品実績ﾃﾞｰﾀ削除  *
        ***************************/

--vc2RunChkComment := '●●●●通過 00490';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

            --購入品返品実績ﾃﾞｰﾀ削除
            delete from T_PUCH_ODR_RTN_RSLT
                where puch_rtn_date <= to_date(lvc2PchOdRtnRst_period,'yyyy/mm/dd')
                  and plant_CD = pvc2PlantCd;     --A

            LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0825)購入品返品実績削除件数：'||SQL%ROWCOUNT); --A



--vc2RunChkComment := '●●●●通過 00500';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00510';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00520';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

     /***************************************************************
     *  その他のﾃﾞｰﾀ削除 (所要量ｱﾗｰﾑﾘｽﾄ､業務ﾒｯｾｰｼﾞ､ｶﾚﾝﾀﾞ､出荷保留)  *
     ***************************************************************/

    LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                            pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0766)◆◆ その他のデータ ◆◆'); --A


--vc2RunChkComment := '●●●●通過 00530';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --所要量ｱﾗｰﾑﾘｽﾄﾃﾞｰﾀ削除
        delete from T_OD_ALARM AL
            where AL.od_alarm_flg = 1
              and AL.plant_CD = pvc2PlantCd --A
              and AL.mrp_date <= to_date(lvc2OdAlm_period,'yyyy/mm/dd');

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0767)所要量ｱﾗｰﾑﾘｽﾄ削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00540';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --業務ﾒｯｾｰｼﾞﾃﾞｰﾀ削除
        delete from SYS_MSG_LOG
            where updated_date is not null
              and plant_CD = pvc2PlantCd --A
              and updated_date <= to_date(lvc2BusinessMsg_period,'yyyy/mm/dd');

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0768)業務ﾒｯｾｰｼﾞ削除件数：'||SQL%ROWCOUNT); --A

--vc2RunChkComment := '●●●●通過 00550';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

--vc2RunChkComment := '●●●●通過 00560';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --製品構成トランザクションlvc2ForPsT_period
        --工場指定なしで削除 --A
        delete from SYS_PS_T
            where UPDATED_DATE <= to_date(lvc2ForPsT_period,'yyyy/mm/dd') --A
              and cmplt_flg = 1;

        LBlnRet := FncTraceLog(UTL_FileHandle, pVc2LogMode, pvc2OutputMode,
                                pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,'(SBM0769)製品構成トランザクション：'||SQL%ROWCOUNT);--A

--vc2RunChkComment := '●●●●通過 00570';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);

        --外部計画削除
            delete from T_EXTERNAL_PLAN EP
                where not exists( select od_no from T_OD where EP.od_no = T_OD.od_no )
                  and UPDATED_DATE <= to_date(lvc2Mrp_period,'yyyy/mm/dd')
                  and EXTERNAL_PLAN_EXP_TYP = 9
                  and plant_CD = pvc2PlantCd;

--vc2RunChkComment := '●●●●通過 00580';
--DBMS_OUTPUT.PUT_LINE(vc2RunChkComment);
--//業務終了のメッセージ

    lvc2Comment := 'トランザクションデータ削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';

    LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                            MY_SQL_NAME, APS_COM_BATCH_END,'(SBM0387)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment); --A


    commit;

--//TraceLogの出力処理を行う

    LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                           pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

    /* LogFile の CLOSE */
    LblnRet := FncLogClose(UTL_FileHandle);

--DBMS_OUTPUT.PUT_LINE(MY_SQL_NAME || '★★★★★ 終了 ★★★★★ ' || TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'));


--< 例外処理 >---------------------------------------------------------------
exception

WHEN excMaxcount THEN   --保持期間ﾃｰﾌﾞﾙの取得件数が８件以下
--DBMS_OUTPUT.PUT_LINE('excMaxcount')3;
            rollback;
            --//業務終了のメッセージ
            lvc2Comment := 'トランザクションデータ削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := '保持期間ﾃｰﾌﾞﾙの取得件数が７件以下です。';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0388)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '：' || lvc2Comment2);

            --トレースログ（end）

            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

            commit;
            /* LogFile の CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);

WHEN excSys_Mnt_Period_NULL THEN   --取得ﾃｰﾌﾞﾙがNULL
--DBMS_OUTPUT.PUT_LINE('excSys_Mnt_Period_NULL');
            rollback;
            IF cur_Sys_Mnt_Period%ISOPEN = TRUE THEN
              CLOSE cur_Sys_Mnt_Period;
            END IF;
            --//業務終了のメッセージ
            lvc2Comment := 'トランザクションデータ削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := '保持期間ﾃｰﾌﾞﾙの保持情報区分がNULLです。';
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                 '(SBM0389)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment ||  LOGMSG_ERR || '：' || lvc2Comment2);
            --トレースログ（end）

            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END); --A

            commit;
            /* LogFile の CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
WHEN excPARAMETER_ERR THEN

        /* ロールバック */
        ROLLBACK;

        /* カーソルＣＬＯＳＥ*/
        IF cur_Sys_Mnt_Period%ISOPEN = TRUE THEN
            CLOSE cur_Sys_Mnt_Period;
        END IF
        ;
        lvc2Comment := 'トランザクションデータ削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';
        LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 vc2ErrCd,
                                 vc2ErrDetail);

        LBlnRet := FNCMSGLOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,pvc2UserId,
                            pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, APS_COM_BATCH_END,
                            '(SBM0390)' || LOGMSG_BATCH_EXP || lvc2Comment);


        /* トレースログの出力(終了) */
        LBlnRet := FNCTRACELOG(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId,pvc2BusinessName, pvc2PlantCd, MY_SQL_NAME, METHOD_END);

        COMMIT;

       LblnRet := FncLogClose(UTL_FileHandle);
WHEN OTHERS THEN   --その他のエラー
--DBMS_OUTPUT.PUT_LINE('excOTHERS');
            rollback;
            IF cur_Sys_Mnt_Period%ISOPEN = TRUE THEN
              CLOSE cur_Sys_Mnt_Period;
            END IF;
            lvc2Comment := 'トランザクションデータ削除処理対象年月：[ '|| pvcDeleteProcExecDate || ' ]';
            lvc2Comment2 := SUBSTR(SQLCODE || ',' || SUBSTR(SQLERRM,1,256),1,256);
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_ORACLE_ERR,
                                 lvc2Comment2);
            LBlnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId,
                                 pvc2BusinessName,
                                 pvc2PlantCd, --A
                                 MY_SQL_NAME,
                                 APS_COM_BATCH_END,
                                '(SBM0391)' || LOGMSG_END_PGNM_DeleteProc || lvc2Comment || LOGMSG_ERR);
            /* TraceLog の出力（実行位置） */

            LblnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                  pvc2UserId, pvc2BusinessName,pvc2PlantCd,
                                  MY_SQL_NAME, METHOD_END || vc2RunChkComment); --A

            --トレースログ（end）

            LBlnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                    pvc2UserId,pvc2BusinessName,pvc2PlantCd,MY_SQL_NAME,METHOD_END);

            commit;
            /* LogFile の CLOSE */
            LblnRet := FncLogClose(UTL_FileHandle);
end;
/
