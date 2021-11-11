CREATE OR REPLACE PROCEDURE SqlSalesTrnDelete (
/*------------------------------------------------------------------------------
'
' SqlSalesTrnDelete.Sql
'
' 修正履歴  2007.06.27 新規作成
'          2013.12.19 受注管理削除
'          2014.03.31 修正作成
'
'
' 機能      : 販売トランザクションデータ削除処理
'
' 引き数    : pvc2LogMode                - (i)ＬＯＧモード
'             pvc2OutputMode             - (i)出力モード
'             pvc2OutputPath             - (i)出力ファイルパス
'             pvc2OutputName             - (i)出力ファイル名
'             pvc2UserId                 - (i)ユーザＩＤ
'             pvc2BusinessName           - (i)業務名
'             pvc2CompanyCd              - (i)自社コード
'             pvc2PlantCd                - (i)工場コード
'             pnumYearMonth              - (i)削除起算年月度
'
' 機能説明  : 販売管理で保持期間を越えたトランザクションデータの削除を行う。
'             削除するデータをCSVファイルに出力する。
'
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pvc2LogMode                 IN  VARCHAR2    -- ＬＯＧモード
   ,pvc2OutputMode              IN  VARCHAR2    -- 出力モード
   ,pvc2OutputPath              IN  VARCHAR2    -- 出力ファイルパス
   ,pvc2OutputName              IN  VARCHAR2    -- 出力ファイル名
   ,pvc2UserId                  IN  VARCHAR2    -- ユーザＩＤ
   ,pvc2BusinessName            IN  VARCHAR2    -- 業務名
   ,pvc2PlantCd                 IN  VARCHAR2    -- 工場コード
   ,pvc2CompanyCd               IN  VARCHAR2    -- 自社コード
   ,pnumYearMonth               IN  NUMBER      -- 削除起算年月度
)  IS

/* 定数の宣言 */
    MY_SQL_NAME                 VARCHAR2(64)  := 'SqlSalesTrnDelete';
    numSalesPlantyp             NUMBER(2) := 12;                                      -- 販売所要計画の保持情報区分
    numOdrtyp                   NUMBER(2) := 13;                                      -- 受注明細の保持情報区分
    numSaletyp                 NUMBER(2) := 14;                                      -- 売上実績の保持情報区分
    numEdityp                   NUMBER(2) := 15;                                      -- EDIデータの保持情報区分

    vc2CsvPathCon               SYS_PARAMETER.NAME%TYPE := 'SALES_DELETE_CSV_PATH ';  -- CSVファイルパスを取得条件
    numOdrTyp1                  NUMBER(2) := 1;                                       -- 注文区分　1
    numOdrTyp2                  NUMBER(2) := 2;                                       -- 注文区分　2
    numOdrTyp3                  NUMBER(2) := 3;                                       -- 注文区分　3
    numDelFlg                   NUMBER(2) := 1;                                       -- 削除フラグ
    numRmainUnconfirmOdrQty     NUMBER(18,4) := 0;                                    -- 内示残数量
    numOdrCmpltFlg              NUMBER(1) := 1;                                       -- 受注完了フラグ
    numStatus                   NUMBER(2) := 20;                                      -- 状態区分
    numSalesTyp                 NUMBER(2) := 3;                                       -- 売上区分
    numSystemProcTyp            NUMBER(2) := 0;                                       -- システム処理区分
    --Add Anken Start 20140423 shang-j
    numOdrFlg0                  NUMBER(2) := 0;                                       -- 受注有無フラグ
    numOdrFlg1                  NUMBER(2) := 1;                                       -- 受注有無フラグ
    --Upt Anken Start 20140515 shang-j
    --numProjectStat3             NUMBER(2) := 3;                                       -- 3:内示
    numProjectStat9             NUMBER(2) := 9;                                       -- 9:完了
    --Upt Anken End   20140515 shang-j
    numProjectStat4             NUMBER(2) := 4;                                       -- 4:確定受注
    --Add Anken End   20140423 shang-j

/* カーソルの宣言 */

/* ROWTYPE の宣言 */

/* EXCEPTION の宣言 */
    excGET_DEL_DATE_ERR         EXCEPTION;                           --「最終削除年月度算出」エラー
    excGET_CSV_PATH_ERR         EXCEPTION;                           --「ＣＳＶファイル出力パス」を取得エラー
    excFNC_CSVPUT_ERR           EXCEPTION;                           -- CSV出力エラー
/* MESSAGE の宣言 */
    APS_COM_BATCH_START         CONSTANT VARCHAR2(28)   := 'ZZ09001';     -- バッチ処理を開始しました
    APS_COM_BATCH_END           CONSTANT VARCHAR2(28)   := 'ZZ09002';     -- バッチ処理を終了しました
    APS_COM_DATA_COUNT          CONSTANT VARCHAR2(28)   := 'BD00058';     -- 処理件数
    CVS_PATH_ERR                CONSTANT VARCHAR2(28)   := 'KV09027';     -- ＣＳＶファイル出力パス
/* LOG の宣言 */
    LOGMSG_START                CONSTANT VARCHAR2(20)   := 'Start';                                 -- ログ用メソッド開始宣言
    LOGMSG_END                  CONSTANT VARCHAR2(12)   := 'End';                                   -- ログ用メソッド終了宣言
    LOGMSG_BATCH_DELETE_CNT     CONSTANT VARCHAR2(44)  := ' 削除件数：';
    --Add Anken End   20140423 shang-j
    LOGMSG_BATCH_UPDATE_CNT     CONSTANT VARCHAR2(44)  := ' 更新件数：';
    --Add Anken End   20140423 shang-j
    LOGMSG_BATCH_START1         CONSTANT VARCHAR2(108)  := '(SBM0786)<<販売所要計画 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END1           CONSTANT VARCHAR2(108)  := '<<販売所要計画 処理終了>>';             -- 処理終了メッセージ

    LOGMSG_BATCH_START2         CONSTANT VARCHAR2(100)  := '(SBM0788)<<受注明細削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END2           CONSTANT VARCHAR2(100)  := '<<受注明細削除 処理終了>>';             -- 処理終了メッセージ
    LOGMSG_BATCH_START3         CONSTANT VARCHAR2(100)  := '(SBM1300)<<受注管理削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END3           CONSTANT VARCHAR2(108)  := '<<受注管理削除 処理終了>>';             -- 処理終了メッセージ
    LOGMSG_BATCH_START4         CONSTANT VARCHAR2(100)  := '(SBM0790)<<受注履歴削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END4           CONSTANT VARCHAR2(108)  := '<<受注履歴削除 処理終了>>';             -- 処理終了メッセージ
    LOGMSG_BATCH_START5         CONSTANT VARCHAR2(100)  := '(SBM0792)<<内示_確定注文取崩履歴削除 処理開始>>';     -- 処理開始メッセージ
    LOGMSG_BATCH_END5           CONSTANT VARCHAR2(108)  := '<<内示_確定注文取崩履歴削除 処理終了>>';     -- 処理終了メッセージ
    LOGMSG_BATCH_START6         CONSTANT VARCHAR2(100)  := '(SBM0794)<<出荷計画削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END6           CONSTANT VARCHAR2(108)  := '<<出荷計画削除 処理終了>>';
    LOGMSG_BATCH_START7         CONSTANT VARCHAR2(100)  := '(SBM0796)<<出荷伝票データ削除 処理開始>>';       -- 処理開始メッセージ
    LOGMSG_BATCH_END7           CONSTANT VARCHAR2(108)  := '<<出荷伝票データ削除 処理終了>>';
    LOGMSG_BATCH_START8         CONSTANT VARCHAR2(100)  := '(SBM0798)<<売上実績削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END8           CONSTANT VARCHAR2(108)  := '<<売上実績削除 処理終了>>';

    LOGMSG_BATCH_START9         CONSTANT VARCHAR2(100)  := '(SBM0800)<<出荷指示削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END9           CONSTANT VARCHAR2(108)  := '<<出荷指示削除 処理終了>>';

    LOGMSG_BATCH_START10        CONSTANT VARCHAR2(100)  := '(SBM0802)<<出荷指示一時テーブル削除 処理開始>>'; -- 処理開始メッセージ
    LOGMSG_BATCH_END10          CONSTANT VARCHAR2(108)  := '<<出荷指示一時テーブル削除 処理終了>>';

    LOGMSG_BATCH_START11        CONSTANT VARCHAR2(100)  := '(SBM0804)<<出荷実績削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END11          CONSTANT VARCHAR2(108)  := '<<出荷実績削除 処理終了>>';

    LOGMSG_BATCH_START12        CONSTANT VARCHAR2(100)  := '<<出荷不可削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END12          CONSTANT VARCHAR2(100)  := '<<出荷不可削除 処理終了>>';             -- 処理終了メッセージ

    LOGMSG_BATCH_START13        CONSTANT VARCHAR2(100)  := '(SBM0806)<<販売所要計画情報IF削除 処理開始>>';-- 処理開始メッセージ
    LOGMSG_BATCH_END13          CONSTANT VARCHAR2(108)  := '<<販売所要計画情報IF削除 処理終了>>';   -- 処理終了メッセージ
    LOGMSG_BATCH_START14        CONSTANT VARCHAR2(100)  := '(SBM0808)<<注文情報IF削除 処理開始>>';           -- 処理開始メッセージ
    LOGMSG_BATCH_END14          CONSTANT VARCHAR2(100)  := '<<注文情報IF削除 処理終了>>';           -- 処理開始メッセージ

    LOGMSG_BATCH_START15        CONSTANT VARCHAR2(100)  := '(SBM0810)<<受注情報共通IF削除 処理開始>>';       -- 処理開始メッセージ
    LOGMSG_BATCH_END15          CONSTANT VARCHAR2(100)  := '<<受注情報共通IF削除 処理終了>>';       -- 処理終了メッセージ

    LOGMSG_BATCH_START16        CONSTANT VARCHAR2(100)  := '(SBM0812)<<検収情報削除 処理開始>>';             -- 処理開始メッセージ
    LOGMSG_BATCH_END16          CONSTANT VARCHAR2(116)  := '<<検収情報削除 処理終了>>';             -- 処理開始メッセージ

    LOGMSG_BATCH_START17        CONSTANT VARCHAR2(100)  := '(SBM0814)<<エラー警告リスト 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END17          CONSTANT VARCHAR2(116)  := '<<エラー警告リスト 処理終了>>';         -- 処理終了メッセージ

    --ADD Strat 20140331 jian-b
    LOGMSG_BATCH_START18         CONSTANT VARCHAR2(100)  := '(SBM1267)<<非在庫受注履歴削除 処理開始>>';      -- 処理開始メッセージ
    LOGMSG_BATCH_END18           CONSTANT VARCHAR2(108)  := '<<非在庫受注履歴削除 処理終了>>';               -- 処理終了メッセージ

    LOGMSG_BATCH_START19         CONSTANT VARCHAR2(100)  := '(SBM1269)<<非在庫受注削除 処理開始>>';          -- 処理開始メッセージ
    LOGMSG_BATCH_END19           CONSTANT VARCHAR2(108)  := '<<非在庫受注削除 処理終了>>';                   -- 処理終了メッセージ
    --ADD End 20140331 jian-b

    --Add Anken Start 20140423 shang-j
    LOGMSG_BATCH_START20        CONSTANT VARCHAR2(100)  := '(SBM1279)<<見積明細削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END20          CONSTANT VARCHAR2(116)  := '<<見積明細削除 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START21        CONSTANT VARCHAR2(100)  := '(SBM1281)<<案件受注紐付削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END21          CONSTANT VARCHAR2(116)  := '<<案件受注紐付削除 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START22        CONSTANT VARCHAR2(100)  := '(SBM1283)<<役務実績削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END22          CONSTANT VARCHAR2(116)  := '<<役務実績削除 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START23        CONSTANT VARCHAR2(100)  := '(SBM1295)<<役務実績履歴削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END23          CONSTANT VARCHAR2(116)  := '<<役務実績履歴削除 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START24        CONSTANT VARCHAR2(100)  := '(SBM1285)<<案件予算進捗削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END24          CONSTANT VARCHAR2(116)  := '<<案件予算進捗削除 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START25        CONSTANT VARCHAR2(100)  := '(SBM1287)<<案件予算積上げエラー 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END25          CONSTANT VARCHAR2(116)  := '<<案件予算積上げエラー 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START26        CONSTANT VARCHAR2(100)  := '(SBM1289)<<案件予算積上明細削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END26          CONSTANT VARCHAR2(116)  := '<<案件予算積上明細削除 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START27        CONSTANT VARCHAR2(100)  := '(SBM1291)<<見積明細更新 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END27          CONSTANT VARCHAR2(116)  := '<<見積明細更新 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START28        CONSTANT VARCHAR2(100)  := '(SBM1275)<<案件削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END28          CONSTANT VARCHAR2(116)  := '<<案件削除 処理終了>>';         -- 処理終了メッセージ
    LOGMSG_BATCH_START29        CONSTANT VARCHAR2(100)  := '(SBM1277)<<見積削除 処理開始>>';         -- 処理開始メッセージ
    LOGMSG_BATCH_END29          CONSTANT VARCHAR2(116)  := '<<見積削除 処理終了>>';         -- 処理終了メッセージ
    --Add Anken End   20140423 shang-j
    LOGMSG_CNTMSG_SALESPLAN     CONSTANT VARCHAR2(64)  := '件 販売所要計画:';
    LOGMSG_CNTMSG_ODRCTL        CONSTANT VARCHAR2(56)  := '件 受注管理:';
    LOGMSG_CNTMSG_ODR           CONSTANT VARCHAR2(56)  := '件 受注明細:';
    --ADD Strat 20140331 jian-b
    LOGMSG_CNTMSG_TODRUNSTOCK   CONSTANT VARCHAR2(56)  := '件 非在庫受注:';
    LOGMSG_CNTMSG_HSTODRUNSTOCK CONSTANT VARCHAR2(48)  := '件 非在庫受注履歴:';
    --ADD End 20140331 jian-b
    LOGMSG_CNTMSG_ODRACPTRSLT   CONSTANT VARCHAR2(48)  := '件 受注履歴:';
    LOGMSG_CNTMSG_ALLOCFOR      CONSTANT VARCHAR2(64)  := '件 内示_確定注文取崩履歴:';
    LOGMSG_CNTMSG_ANSDLVDATE    CONSTANT VARCHAR2(48)  := '件 出荷計画:';
    LOGMSG_CNTMSG_SHIPSLIP      CONSTANT VARCHAR2(56)  := '件 出荷伝票データ:';
    LOGMSG_CNTMSG_SALES         CONSTANT VARCHAR2(48)  := '件 売上実績:';
    LOGMSG_CNTMSG_SHIPODR       CONSTANT VARCHAR2(48)  := '件 出荷指示:';
    LOGMSG_CNTMSG_SHIPT         CONSTANT VARCHAR2(48)  := '件 出荷指示一時テーブル:';
    LOGMSG_CNTMSG_SHIP          CONSTANT VARCHAR2(48)  := '件 出荷実績:';
    LOGMSG_CNTMSG_UNSHIPLIST    CONSTANT VARCHAR2(48)  := '件 出荷不可リスト:';
    LOGMSG_CNTMSG_SALESPLNIF    CONSTANT VARCHAR2(64)  := '件 販売所要計画情報IF:';
    LOGMSG_CNTMSG_ODRINFOEDIIF  CONSTANT VARCHAR2(56)  := '件 注文情報IF:';
    LOGMSG_CNTMSG_ODRINFOCOMIF  CONSTANT VARCHAR2(56)  := '件 受注情報共通IF:';
    LOGMSG_CNTMSG_INSPCACPTINFOIF CONSTANT VARCHAR2(56)  := '件 検収情報IF:';
    LOGMSG_CNTMSG_ERRWNGLST     CONSTANT VARCHAR2(56)  := '件 エラー警告リスト:';
    --Add Anken Start 20140423 shang-j
    LOGMSG_CNTMSG_PROJECT       CONSTANT VARCHAR2(32)  := '件 案件:';
    LOGMSG_CNTMSG_ESTIMATE      CONSTANT VARCHAR2(32)  := '件 見積:';
    LOGMSG_CNTMSG_ESTIMATEDETALUPT CONSTANT VARCHAR2(48)  := '件 見積明細(更新):';
    LOGMSG_CNTMSG_ESTIMATEDETAL CONSTANT VARCHAR2(48)  := '件 見積明細:';
    LOGMSG_CNTMSG_PJODRALC      CONSTANT VARCHAR2(64)  := '件 案件受注紐付:';
    LOGMSG_CNTMSG_SERVICE       CONSTANT VARCHAR2(48)  := '件 役務実績:';
    LOGMSG_CNTMSG_HSSERVICE     CONSTANT VARCHAR2(64)  := '件 役務実績履歴:';
    LOGMSG_CNTMSG_PJCOST        CONSTANT VARCHAR2(64)  := '件 案件予算進捗:';
    LOGMSG_CNTMSG_PJBUDGETDETAIL CONSTANT VARCHAR2(64)  := '件 案件予算積上明細:';
    LOGMSG_CNTMSG_PJBUDGETERROR CONSTANT VARCHAR2(64)  := '件 案件予算積上げエラー:';
    --Add Anken End   20140423 shang-j
    LOGMSG_CNTMSG_END           CONSTANT VARCHAR2(8)  := '件';

/* 変数の宣言 WORK */
    UTL_FileHandle              UTL_FILE.FILE_TYPE;    -- ファイルハンドル
    blnRet                      BOOLEAN;               -- Function返却値
    vc2Comment                  VARCHAR2(4000);        -- メッセージ用コメント作成作業領域
    intSqlCode                  VARCHAR2(28);          -- SQLCODE戻り値
    numDeleteCount              NUMBER(7);             -- 削除用カウント
    dtmYearMonth                DATE;                  -- 削除起算年月度(日付型)

    numDelCntSalesPlan          NUMBER(7) := 0;        -- 販売所要計画削除用カウント
    numSalesPlanterm            NUMBER(6);             -- 販売所要計画データ保存月数
    numSalesPlanDate            NUMBER(6);             -- 販売所要計画データ削除日付
    numOdrCtl                   NUMBER(7) := 0;        -- 受注管理削除用カウント

    numDelCntOdr                NUMBER(7) := 0;        -- 受注情報削除用カウント

    numOdrterm                  NUMBER(6);             -- 受注情報保存月数
    numOdrDate                  NUMBER(6);             -- 受注情報削除日付

    numDelCntOdrAcptRslt        NUMBER(7) := 0;        -- 受注履歴削除用カウント
    --ADD Strat 20140331 jian-b
    numDelCntHsTOdrUnstock      NUMBER(7) := 0;        -- 非在庫受注履歴削除用カウント
    numDelCntTOdrUnstock        NUMBER(7) := 0;        -- 非在庫受注情報削除用カウント
    --ADD End 20140331 jian-b
    numDelCntAllocFixedOdrRslt  NUMBER(7) := 0;        -- 内示_確定注文取崩履歴削除用カウント

    numDelCntAnsDlvDate         NUMBER(7) := 0;        -- 出荷計画削除用カウント

    numDelCntShipSlip           NUMBER(7) := 0;        -- 出荷伝票データ削除用カウント


    numDelCntSales              NUMBER(7) := 0;        -- 売上実績削除用カウント
    numSalesterm                NUMBER(6);             -- 売上実績データ保存月数
    numSalesDate                NUMBER(6);             -- 売上実績データ削除日付

    numDelCntShipOdr            NUMBER(7) := 0;        -- 出荷指示削除用カウント
    numShipOdrterm              NUMBER(6);             -- 出荷指示保存月数
    numShipOdrDate              NUMBER(6);             -- 出荷指示削除日付

    numDelCntShipT              NUMBER(7) := 0;        -- 出荷指示一時テーブル削除用カウント


    numDelCntShip               NUMBER(7) := 0;        -- 出荷実績削除用カウント


    numDelCntUnShipList         NUMBER(7) := 0;        -- 出荷不可リスト削除用カウント


    numDelCntSalesplnIf         NUMBER(7) := 0;        -- 販売所要計画情報削除用カウント
    numEditerm                  NUMBER(6);             -- EDI情報保存月数
    numEdiDate                  NUMBER(6);             -- EDI情報削除日付

    numDelCntOdrInfoEdiIf       NUMBER(7) := 0;        -- 注文情報IF削除用カウント

    numDelCntOdrInfoComIf       NUMBER(7) := 0;        -- 受注情報共通IF削除用カウント

    numDelCntInspcAcptInfo      NUMBER(7) := 0;        -- 検収情報IF削除用カウント

    numDelCntErrWngLst          NUMBER(7) := 0;        -- エラー警告リスト削除用カウント
    --Add Anken Start 20140423 shang-j
    numDelCntPjOdrAlc           NUMBER(7) := 0;        -- 案件受注紐付削除用カウント

    numDelCntService            NUMBER(7) := 0;        -- 役務実績削除用カウント

    numDelCntHsService          NUMBER(7) := 0;        -- 役務実績履歴削除用カウント

    numDelCntEstimate           NUMBER(7) := 0;        -- 見積削除用カウント

    numCntEstimateDetalUpt      NUMBER(7) := 0;        -- 見積明細更新用カウント

    numDelCntPjCost             NUMBER(7) := 0;        -- 案件予算進捗削除用カウント

    numDelCntPjBudgetDetail     NUMBER(7) := 0;        -- 案件予算積上明細削除用カウント

    numDelCntPjBudgetError      NUMBER(7) := 0;        -- 案件予算積上げエラー削除用カウント

    numDelCntEstimateDetal      NUMBER(7) := 0;        -- 見積明細削除用カウント

    numDelCntProject            NUMBER(7) := 0;        -- 案件削除用カウント

    --Add Anken End   20140423 shang-j

/********** CSVファイル出力用変数 **********/
    CSV_FilePath                SYS_PARAMETER.VALUE%TYPE;
    V_BUFFER                    VARCHAR2(32767);
    vc2CsvSalesPlanName         VARCHAR2(28) := 'T_SALES_PLAN';          -- 販売所要計画ファイル名
    vc2CsvOdrCtlName            VARCHAR2(28) := 'T_ODR_CTL';             -- 受注管理ファイル名
    vc2CsvOdrName               VARCHAR2(28) := 'T_ODR';                 -- 受注明細ファイル名
    vc2CsvOdrAcptRslt           VARCHAR2(28) := 'T_ODR_ACPT_RSLT';       -- 受注履歴ファイル名
    --ADD Start 20140331 jian-b
    vc2CsvTOdrUnstock           VARCHAR2(28) := 'T_ODR_UNSTOCK';         -- 非在庫受注ファイル名
    vc2CsvHsTOdrUnstock         VARCHAR2(28) := 'HS_T_ODR_UNSTOCK';      -- 非在庫受注履歴ファイル名
    --ADD End 20140331 jian-b
    vc2CsvAllocFixedOdrRslt     VARCHAR2(28) := 'T_ALLOC_FIXED_ODR_RSLT';-- 内示_確定注文取崩履歴ファイル名
    vc2CsvAnsDlvDate            VARCHAR2(28) := 'T_ANS_DLV_DATE';        -- 出荷計画ファイル名
    vc2CsvShipSlip              VARCHAR2(28) := 'T_SHIP_SLIP';           -- 出荷伝票データファイル名
    vc2CsvSales                 VARCHAR2(28) := 'T_SALES';               -- 売上実績ファイル名
    vc2CsvShipOdr               VARCHAR2(28) := 'T_SHIP_ODR';            -- 出荷指示ファイル名
    vc2CsvShipT                 VARCHAR2(28) := 'SHIP_T';                -- 出荷指示一時テーブルファイル名
    vc2CsvShip                  VARCHAR2(28) := 'T_SHIP';                -- 出荷実績ファイル名
    vc2CsvUnShipList            VARCHAR2(28) := 'T_UN_SHIP_LIST';        -- 出荷不可リストファイル名
    vc2CsvSalesplnIf            VARCHAR2(28) := 'T_SALESPLN_IF';         -- 販売所要計画情報IFファイル名
    vc2CsvOdrInfoEdiIf          VARCHAR2(28) := 'T_ODR_INFO_EDI_IF';     -- 注文情報IFファイル名
    vc2CsvOdrInfoComIf          VARCHAR2(28) := 'T_ODR_INFO_COM_IF';     -- 受注情報共通IFファイル名
    vc2CsvInspcAcptInfoIf       VARCHAR2(28) := 'T_INSPC_ACPT_INFO_IF';  -- 検収情報IFファイル名
    vc2CsvErrWngLst             VARCHAR2(28) := 'T_ERR_WNG_LST';         -- エラー警告リストファイル名
    --Add Anken Start 20140423 shang-j
    vc2CsvProject               VARCHAR2(28) := 'T_PROJECT';             -- 案件ファイル名
    vc2CsvEstimate              VARCHAR2(28) := 'T_ESTIMATE';            -- 見積ファイル名
    vc2CsvEstimateDetal         VARCHAR2(28) := 'T_ESTIMATE_DETAL';      -- 見積明細ファイル名
    vc2CsvPjOdrAlc              VARCHAR2(28) := 'T_PJ_ODR_ALC';          -- 案件受注紐付ファイル名
    vc2CsvService               VARCHAR2(28) := 'T_SERVICE';             -- 役務実績ファイル名
    vc2CsvHsService             VARCHAR2(28) := 'HS_T_SERVICE';          -- 役務実績履歴ファイル名
    vc2CsvPjCost                VARCHAR2(28) := 'T_PJ_COST';             -- 案件予算進捗ファイル名
    vc2CsvPjBudgetDetail        VARCHAR2(28) := 'T_PJ_BUDGET_DETAIL';    -- 案件予算積上明細ファイル名
    vc2CsvPjBudgetError         VARCHAR2(28) := 'T_PJ_BUDGET_ERROR';     -- 案件予算積上げエラーファイル名
    --Add Anken End   20140423 shang-j

    fCsvSalesPlan               UTL_FILE.FILE_TYPE;             -- 販売所要計画ファイルハンドル
    fCsvOdrCtl                  UTL_FILE.FILE_TYPE;             -- 受注管理ファイルハンドル
    fCsvOdr                     UTL_FILE.FILE_TYPE;             -- 受注明細ファイルハンドル
    fCsvOdrAcptRslt             UTL_FILE.FILE_TYPE;             -- 受注履歴ファイルハンドル
    --ADD Start 20140331 jian-b
    fCsvTOdrUnstock             UTL_FILE.FILE_TYPE;             -- 非在庫受注ファイルハンドル
    fCsvHsTOdrUnstock           UTL_FILE.FILE_TYPE;             -- 非在庫受注履歴ファイルハンドル
    --ADD End 20140331 jian-b
    fCsvAllocFixedOdrRslt       UTL_FILE.FILE_TYPE;             -- 内示_確定注文取崩履歴ファイルハンドル
    fCsvAnsDlvDate              UTL_FILE.FILE_TYPE;             -- 出荷計画ファイル名ファイルハンドル
    fCsvShipSlip                UTL_FILE.FILE_TYPE;             -- 出荷伝票データファイルファイルハンドル
    fCsvSales                   UTL_FILE.FILE_TYPE;             -- 売上実績ファイルファイルハンドル
    fCsvShipOdr                 UTL_FILE.FILE_TYPE;             -- 出荷指示ファイルファイルハンドル
    fCsvShipT                   UTL_FILE.FILE_TYPE;             -- 出荷指示一時テーブルファイルファイルハンドル
    fCsvShip                    UTL_FILE.FILE_TYPE;             -- 出荷実績ファイルハンドル
    fCsvUnShipList              UTL_FILE.FILE_TYPE;             -- 出荷不可リストファイルハンドル
    fCsvSalesplnIf              UTL_FILE.FILE_TYPE;             -- 販売所要計画情報IFファイルハンドル
    fCsvOdrInfoEdiIf            UTL_FILE.FILE_TYPE;             -- 注文情報IFファイルハンドル
    fCsvOdrInfoComIf            UTL_FILE.FILE_TYPE;             -- 受注情報共通IFファイルハンドル
    fCsvInspcAcptInfoIf         UTL_FILE.FILE_TYPE;             -- 検収情報IFファイルハンドル
    fCsvErrWngLst               UTL_FILE.FILE_TYPE;             -- エラー警告リストファイルハンドル
    --Add Anken Start 20140423 shang-j
    fCsvProject                 UTL_FILE.FILE_TYPE;             -- 案件ファイルハンドル
    fCsvEstimate                UTL_FILE.FILE_TYPE;             -- 見積ファイルハンドル
    fCsvEstimateDetal           UTL_FILE.FILE_TYPE;             -- 見積明細ファイルハンドル
    fCsvPjOdrAlc                UTL_FILE.FILE_TYPE;             -- 案件受注紐付ファイルハンドル
    fCsvService                 UTL_FILE.FILE_TYPE;             -- 役務実績ファイルハンドル
    fCsvHsService               UTL_FILE.FILE_TYPE;             -- 役務実績履歴ファイルハンドル
    fCsvPjCost                  UTL_FILE.FILE_TYPE;             -- 案件予算進捗ファイルハンドル
    fCsvPjBudgetDetail          UTL_FILE.FILE_TYPE;             -- 案件予算積上明細ファイルハンドル
    fCsvPjBudgetError           UTL_FILE.FILE_TYPE;             -- 案件予算積上げエラーファイルハンドル
    --Add Anken End   20140423 shang-j


/* 内部関数 */

    /*-----------------------------------------------------------------
    ' SubFncSalesPlanCsvWrite
    '
    ' 修正履歴  2007.06.27 新規作成
    '
    ' 機能      : 販売所要計画削除データCSVファイル出力
    '
    ' 引き数    : pvc2CompanyCode   会社コード
    '             pdtTargetDate     削除起算年月日日('YYYY/MM')
    '             pfHandl           ファイルハンドル
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 販売所要計画削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncSalesPlanCsvWrite(
       pvc2CompanyCode     IN  VARCHAR2,
       pdtTergetDate       IN  DATE,
       pfHandl             IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTSalesPlan T_SALES_PLAN%ROWTYPE;
      CURSOR curTSalesPlan(
        vc2CompanyCode      IN  VARCHAR2,
        dtTargetDate        IN  DATE
      ) IS
        SELECT SALES_PLAN_CD,            --販売所要計画番号
               COMPANY_CD,               --会社コード
               CUST_CD,                  --得意先コード
               CUST_ITEM_CD,             --得意先品目番号
               DLV_LOC_CD,               --納品場所コード
               PLN_STR_DATE,             --計画開始日
               PLN_END_DATE,             --計画終了日
               TERM_DAYS,                --期間日数
               PLN_TERM_TYP,             --計画期間タイプ
               PLN_QTY,                  --計画数
               ADD_TO_OD_FLG,            --生産計画登録フラグ
               PLN_QTY_REMAIN,           --計画残数量
               DLT_FLG,                  --削除フラグ
               PLN_CD,                   --計画番号
               CUST_SORT_NO,             --データ処理NO
               CREATED_DATE,             --作成日
               CREATED_BY,               --作成者
               CREATED_PRG_NM,           --作成プログラム名
               UPDATED_DATE,             --更新日
               UPDATED_BY,               --更新者
               UPDATED_PRG_NM,           --更新プログラム名
               MODIFY_COUNT              --更新数
          FROM T_SALES_PLAN SP
          WHERE SP.COMPANY_CD = vc2CompanyCode
                AND TO_DATE(TO_NUMBER(TO_CHAR(SP.PLN_END_DATE,'YYYYMM')),'YYYYMM') < dtTargetDate;
    BEGIN
      OPEN curTSalesPlan(pvc2CompanyCode,pdtTergetDate);
      FETCH curTSalesPlan INTO recTSalesPlan;
      WHILE curTSalesPlan%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTSalesPlan.SALES_PLAN_CD || ',');   --販売所要計画番号
        UTL_FILE.PUT(pfHandl, recTSalesPlan.COMPANY_CD || ',');      --会社コード
        UTL_FILE.PUT(pfHandl, recTSalesPlan.CUST_CD || ',');         --得意先コード
        UTL_FILE.PUT(pfHandl, recTSalesPlan.CUST_ITEM_CD || ',');    --得意先品目番号
        UTL_FILE.PUT(pfHandl, recTSalesPlan.DLV_LOC_CD || ',');      --納品場所コード
        UTL_FILE.PUT(pfHandl, recTSalesPlan.PLN_STR_DATE || ',');    --計画開始日
        UTL_FILE.PUT(pfHandl, recTSalesPlan.PLN_END_DATE || ',');    --計画終了日
        UTL_FILE.PUT(pfHandl, recTSalesPlan.TERM_DAYS || ',');       --期間日数
        UTL_FILE.PUT(pfHandl, recTSalesPlan.PLN_TERM_TYP || ',');    --計画期間タイプ
        UTL_FILE.PUT(pfHandl, recTSalesPlan.PLN_QTY || ',');         --計画数
        UTL_FILE.PUT(pfHandl, recTSalesPlan.ADD_TO_OD_FLG || ',');   --生産計画登録フラグ
        UTL_FILE.PUT(pfHandl, recTSalesPlan.PLN_QTY_REMAIN || ',');  --計画残数量
        UTL_FILE.PUT(pfHandl, recTSalesPlan.DLT_FLG || ',');         -- 削除フラグ
        UTL_FILE.PUT(pfHandl, recTSalesPlan.PLN_CD || ',');          --計画番号
        UTL_FILE.PUT(pfHandl, recTSalesPlan.CUST_SORT_NO || ',');    --データ処理NO
        UTL_FILE.PUT(pfHandl, recTSalesPlan.CREATED_DATE || ',');    --作成日
        UTL_FILE.PUT(pfHandl, recTSalesPlan.CREATED_BY || ',');      --作成者
        UTL_FILE.PUT(pfHandl, recTSalesPlan.CREATED_PRG_NM || ',');  --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTSalesPlan.UPDATED_DATE || ',');    --更新日
        UTL_FILE.PUT(pfHandl, recTSalesPlan.UPDATED_BY || ',');      --更新者
        UTL_FILE.PUT(pfHandl, recTSalesPlan.UPDATED_PRG_NM || ',');  --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTSalesPlan.MODIFY_COUNT || ','); --更新数

        FETCH curTSalesPlan   INTO recTSalesPlan;
      END LOOP;
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncSalesPlanCsvWrite;
    
    /*-----------------------------------------------------------------
    ' SubFncOdrCtlCsvWrite
    
    ' 修正履歴  2013.12.17 新規作成
        '
    ' 機能      : 受注管理削除データCSVファイル出力
        '
    ' 引き数    : 
    
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 受注管理削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncOdrCtlCsvWrite(
       pfHandl                 IN  UTL_FILE.FILE_TYPE 
       ) RETURN BOOLEAN IS
       
       recTOdrCtl T_ODR_CTL%ROWTYPE;
       CURSOR curTOdrCtl IS
         SELECT * 
         FROM T_ODR_CTL ODRCTL
         WHERE NOT EXISTS 
            (SELECT ODR.ODR_CTL_NO 
             FROM T_ODR ODR 
             WHERE ODRCTL.ODR_CTL_NO = ODR.ODR_CTL_NO 
             GROUP BY ODR.ODR_CTL_NO);
    BEGIN 
      OPEN curTOdrCtl;
      FETCH curTOdrCtl INTO recTOdrCtl;
    
      WHILE curTOdrCtl%FOUND LOOP
            UTL_FILE.PUT(pfHandl, recTOdrCtl.ODR_CTL_NO || ',');                         --受注管理番号
            UTL_FILE.PUT(pfHandl, recTOdrCtl.CUST_CD || ',');                            --得意先コード
            UTL_FILE.PUT(pfHandl, recTOdrCtl.CUST_ITEM_CD || ',');                       --得意先品目番号
            UTL_FILE.PUT(pfHandl, recTOdrCtl.CUST_ITEM_NAME || ',');                     --得意先品目名称
            UTL_FILE.PUT(pfHandl, recTOdrCtl.ITEM_CD || ',');                            --品目番号
            UTL_FILE.PUT(pfHandl, recTOdrCtl.ITEM_NAME || ',');                          --品目名称
            UTL_FILE.PUT(pfHandl, recTOdrCtl.DEL_FLG || ',');                            --削除フラグ
            UTL_FILE.PUT(pfHandl, recTOdrCtl.CREATED_DATE || ',');                       --作成日
            UTL_FILE.PUT(pfHandl, recTOdrCtl.CREATED_BY || ',');                         --作成者
            UTL_FILE.PUT(pfHandl, recTOdrCtl.CREATED_PRG_NM || ',');                     --作成プログラム名
            UTL_FILE.PUT(pfHandl, recTOdrCtl.UPDATED_DATE || ',');                       --更新日
            UTL_FILE.PUT(pfHandl, recTOdrCtl.UPDATED_BY || ',');                         --更新者
            UTL_FILE.PUT(pfHandl, recTOdrCtl.UPDATED_PRG_NM || ',');                     --更新プログラム名
            UTL_FILE.PUT_LINE(pfHandl, recTOdrCtl.MODIFY_COUNT || ',');                  --更新数
       
        FETCH curTOdrCtl INTO recTOdrCtl;
      
      END LOOP;
    
      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;
      
    END SubFncOdrCtlCsvWrite;

      /*-----------------------------------------------------------------
    ' SubFncOdrCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      : 受注明細削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 受注明細削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncOdrCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTOdr T_ODR%ROWTYPE;

      CURSOR curTOdr(
         numOdrTyp1              IN  NUMBER,
         numOdrTyp2              IN  NUMBER,
         numOdrTyp3              IN  NUMBER,
         numRmainUnconfirmOdrQty IN  NUMBER,
         numOdrCmpltFlg          IN  NUMBER,
         numDelFlg               IN  NUMBER,
         dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_ODR ODR
          WHERE ((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                  OR (ODR.ODR_TYP = numOdrTyp1
                      AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                OR
                ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                    OR (ODR.ODR_TYP = numOdrTyp2
                      AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                      AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                OR
                ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                  OR (ODR.ODR_TYP = numOdrTyp3
                      AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                      AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate));


    BEGIN
      OPEN curTOdr(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTOdr INTO recTOdr;

      WHILE curTOdr%FOUND LOOP
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_NO || ',');                                      --受注番号
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_TYP || ',');                                     --注文区分
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_CTL_NO || ',');                                  --受注管理番号
            UTL_FILE.PUT(pfHandl, recTOdr.CUST_ODR_NO || ',');                                 --得意先注文番号
            UTL_FILE.PUT(pfHandl, recTOdr.CUST_CHRG_ORG_CD || ',');                            --営業担当部門コード
            UTL_FILE.PUT(pfHandl, recTOdr.CUST_CHRG_PSN_CD || ',');                            --営業担当者コード
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_ACPT_ORG_CD || ',');                             --発行担当者部門コード
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_ACPT_PSN_CD || ',');                             --発行担当者コード
            UTL_FILE.PUT(pfHandl, recTOdr.CURRNCY_CD || ',');                                  --通貨コード
            UTL_FILE.PUT(pfHandl, recTOdr.EXCH_TYP || ',');                                    --為替種別
            UTL_FILE.PUT(pfHandl, recTOdr.DLV_LOC_CD || ',');                                  --納品場所コード
            UTL_FILE.PUT(pfHandl, recTOdr.DLV_LOC_CD_EIAJ || ',');                             --受渡場所コード
            UTL_FILE.PUT(pfHandl, recTOdr.DLV_LOC_NAME || ',');                                --納品場所名
            UTL_FILE.PUT(pfHandl, recTOdr.DLV_LOC_NAME_KANJI || ',');                          --納品場所名(漢字)
            UTL_FILE.PUT(pfHandl, recTOdr.PRD_ODR_PLACE_CD || ',');                            --製造場所コード
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_UNIT_PRICE || ',');                              --受注単価
            UTL_FILE.PUT(pfHandl, recTOdr.SPCL_PRICE_TYP || ',');                              --特値区分
            UTL_FILE.PUT(pfHandl, recTOdr.PART_DLV_COUNT || ',');                              --分納回数
            UTL_FILE.PUT(pfHandl, recTOdr.SHIP_CNT || ',');                                    --出荷回数
            UTL_FILE.PUT(pfHandl, recTOdr.DEPO_TYP || ',');                                    --預託倉庫区分
            UTL_FILE.PUT(pfHandl, recTOdr.DESINATED_DLV_DATE || ',');                          --指定納期
            UTL_FILE.PUT(pfHandl, recTOdr.STD_DESINATED_RCV_DATE || ',');                      --基準入庫指定納期
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_QTY || ',');                                     --受注数量
            UTL_FILE.PUT(pfHandl, recTOdr.REMAIN_UNCONFIRM_ODR_QTY || ',');                    --内示残数量
            UTL_FILE.PUT(pfHandl, recTOdr.CANCELED_UNCONFIRM_ODR_QTY || ',');                  --内示減数量
            UTL_FILE.PUT(pfHandl, recTOdr.UNIT_CD || ',');                                      --単位
            UTL_FILE.PUT(pfHandl, recTOdr.UNCONFIRM_ODR_BALANCE || ',');                       --内示残金額
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_AMOUNT || ',');                                  --受注金額
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_AMOUNT_EXCH_RATES || ',');                       --受注金額(邦貨)
            UTL_FILE.PUT(pfHandl, recTOdr.TOTAL_SHIP_QTY || ',');                              --出荷実績累計数
            UTL_FILE.PUT(pfHandl, recTOdr.SHIP_AMOUNT || ',');                                 --出荷実績金額
            UTL_FILE.PUT(pfHandl, recTOdr.SHIP_AMOUNT_EXCH_RATES || ',');                      --出荷実績金額(邦貨)
            UTL_FILE.PUT(pfHandl, recTOdr.RETURN_PRICE || ',');                                --返品単価
            UTL_FILE.PUT(pfHandl, recTOdr.RETURN_QTY || ',');                                  --返品数量
            UTL_FILE.PUT(pfHandl, recTOdr.RETURN_AMOUNT || ',');                               --返品金額
            UTL_FILE.PUT(pfHandl, recTOdr.RETURN_AMOUNT_EXCH_RATES || ',');                    --返品金額(邦貨)
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_CMPLT_FLG || ',');                               --受注完了フラグ
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_CMPLT_DATE || ',');                              --受注完了日
            UTL_FILE.PUT(pfHandl, recTOdr.BUYER_ORG_CD || ',');                                --発注部門コード
            UTL_FILE.PUT(pfHandl, recTOdr.CUS_DLV_CD || ',');                                  --納入番号
            UTL_FILE.PUT(pfHandl, recTOdr.CUS_DLV_KEY_CD || ',');                              --納品キー番号
            UTL_FILE.PUT(pfHandl, recTOdr.PART_NAME || ',');                                   --一般品名
            UTL_FILE.PUT(pfHandl, recTOdr.UNIT_CD_ORG || ',');                                 --変換前単位
            UTL_FILE.PUT(pfHandl, recTOdr.PUCH_ODR_QTY_TOTAL || ',');                          --総注文数量
            UTL_FILE.PUT(pfHandl, recTOdr.BUYER_NAME || ',');                                  --購買担当
            UTL_FILE.PUT(pfHandl, recTOdr.PKG_UNIT || ',');                                    --荷姿計量単位
            UTL_FILE.PUT(pfHandl, recTOdr.SLIP_PRICE_PRINT_TYP || ',');                        --納品書価格表示区分
            UTL_FILE.PUT(pfHandl, recTOdr.INSPC_TYP || ',');                                   --検査区分
            UTL_FILE.PUT(pfHandl, recTOdr.COCK_TYP || ',');                                    --コック区分
            UTL_FILE.PUT(pfHandl, recTOdr.CLIENT_REMARK || ',');                               --発注者備考
            UTL_FILE.PUT(pfHandl, recTOdr.CLIENT_REMARK_KANJI || ',');                         --発注者備考(漢字)
            UTL_FILE.PUT(pfHandl, recTOdr.CLIENT_BARCODE_INF || ',');                          --発注者バーコード情報
            UTL_FILE.PUT(pfHandl, recTOdr.TRANSPORT_CD || ',');                                --運送便コード
            UTL_FILE.PUT(pfHandl, recTOdr.TRANSPORT_TYP || ',');                               --輸送形態区分
            UTL_FILE.PUT(pfHandl, recTOdr.TAX_APPLY_TYP || ',');                               --消費税適用区分
            UTL_FILE.PUT(pfHandl, recTOdr.TAX_CD || ',');                                      --消費税コード
            UTL_FILE.PUT(pfHandl, recTOdr.TAX_CALC_TYP || ',');                                --消費税計算区分
            UTL_FILE.PUT(pfHandl, recTOdr.REMARKS || ',');                                     --備考
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_ACPT_DATE || ',');                               --受注日
            UTL_FILE.PUT(pfHandl, recTOdr.SHIP_PLAN_REMAIN_QTY || ',');                        --出荷計画残数量
            UTL_FILE.PUT(pfHandl, recTOdr.SHIP_PLAN_CMPLT_FLG || ',');                         --出荷計画完了フラグ
            UTL_FILE.PUT(pfHandl, recTOdr.UNCONFIRMED_ODR_EFF_OVR_FLG || ',');                 --内示有効期間超過フラグ
            UTL_FILE.PUT(pfHandl, recTOdr.PARTIAL_SHIP_INST_FLG || ',');                       --分納出荷指示フラグ
            UTL_FILE.PUT(pfHandl, recTOdr.IF_CTL_NO || ',');                                   --IF情報管理番号
            UTL_FILE.PUT(pfHandl, recTOdr.ODR_SEQ || ',');                                     --注文項番
            UTL_FILE.PUT(pfHandl, recTOdr.ENTRY_TYP || ',');                                   --データ入力区分
            UTL_FILE.PUT(pfHandl, recTOdr.DEL_FLG || ',');                                     --削除フラグ
            UTL_FILE.PUT(pfHandl, recTOdr.CREATED_DATE || ',');                                --作成日
            UTL_FILE.PUT(pfHandl, recTOdr.CREATED_BY || ',');                                  --作成者
            UTL_FILE.PUT(pfHandl, recTOdr.CREATED_PRG_NM || ',');                              --作成プログラム名
            UTL_FILE.PUT(pfHandl, recTOdr.UPDATED_DATE || ',');                                --更新日
            UTL_FILE.PUT(pfHandl, recTOdr.UPDATED_BY || ',');                                  --更新者
            UTL_FILE.PUT(pfHandl, recTOdr.UPDATED_PRG_NM || ',');                              --更新プログラム名
            UTL_FILE.PUT_LINE(pfHandl, recTOdr.MODIFY_COUNT || ',');                           --更新数

        FETCH curTOdr INTO recTOdr;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncOdrCsvWrite;

   --ADD Start 20140331 jian-b
    /*-----------------------------------------------------------------
    ' SubFncTOdrUnstockCsvWrite

    ' 修正履歴  2014.03.31 新規作成
        '
    ' 機能      : 非在庫受注削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 非在庫受注削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncTOdrUnstockCsvWrite(
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTOdrUnstock T_ODR_UNSTOCK%ROWTYPE;

      CURSOR curTOdrUnstock(
         numOdrCmpltFlg          IN  NUMBER,
         numDelFlg               IN  NUMBER,
         dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_ODR_UNSTOCK ODRUN
          WHERE ODRUN.DEL_FLG = numDelFlg
                OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                   AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < dtTergetDate);

    BEGIN
      OPEN curTOdrUnstock(pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTOdrUnstock INTO recTOdrUnstock;

      WHILE curTOdrUnstock%FOUND LOOP
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_NO || ',');                               --受注番号
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.COMPANY_CD || ',');                           --会社コード
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.SLIP_CD || ',');                              --伝票番号
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.CUST_ODR_NO || ',');                          --得意先注文番号
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.CUST_CD || ',');                              --得意先コード
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ITEM_CD || ',');                              --品目番号
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ITEM_NAME || ',');                            --品目名称
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.CUST_CHRG_PSN_CD || ',');                     --営業担当者コード
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_ACPT_PSN_CD || ',');                      --発行担当者コード
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.CURRNCY_CD || ',');                           --通貨コード
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.EXCH_TYP || ',');                             --為替種別
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.DESINATED_DLV_DATE || ',');                   --指定納期
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_UNIT_PRICE || ',');                       --受注単価
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_QTY || ',');                              --受注数量
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_AMOUNT || ',');                           --受注金額
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_AMOUNT_EXCH_RATES || ',');                --受注金額(邦貨)
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.TAX_APPLY_TYP || ',');                        --消費税適用区分
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.TAX_CD || ',');                               --消費税コード
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.TAX_CALC_TYP || ',');                         --消費税計算区分
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.REMARKS || ',');                              --備考
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_ACPT_DATE || ',');                        --受注日
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ORGN_ODR_NO || ',');                          --元受注番号
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ADD_ODR_FLG || ',');                          --増額受注フラグ
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_CMPLT_FLG || ',');                        --受注完了フラグ
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.ODR_CMPLT_DATE || ',');                       --受注完了日
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.DEL_FLG || ',');                              --削除フラグ
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.CREATED_DATE || ',');                         --作成日
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.CREATED_BY || ',');                           --作成者
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.CREATED_PRG_NM || ',');                       --作成プログラム名
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.UPDATED_DATE || ',');                         --更新日
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.UPDATED_BY || ',');                           --更新者
            UTL_FILE.PUT(pfHandl, recTOdrUnstock.UPDATED_PRG_NM || ',');                       --更新プログラム名
            UTL_FILE.PUT_LINE(pfHandl, recTOdrUnstock.MODIFY_COUNT || ',');                         --更新数

        FETCH curTOdrUnstock INTO recTOdrUnstock;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncTOdrUnstockCsvWrite;
    --ADD End 20140331 jian-b

    /*-----------------------------------------------------------------
    ' SubFncOdrAcptRsltCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      : 受注履歴削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 受注履歴削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncOdrAcptRsltCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recTOdrAcptRslt T_ODR_ACPT_RSLT%ROWTYPE;

      CURSOR curTOdrAcptRslt(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_ODR_ACPT_RSLT ODRAR
          WHERE EXISTS
                ( SELECT * FROM T_ODR ODR
                  WHERE ODRAR.ODR_NO = ODR.ODR_NO
                        AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                          OR (ODR.ODR_TYP = numOdrTyp1
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                          OR
                          ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                              OR (ODR.ODR_TYP = numOdrTyp2
                                AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                          OR
                          ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                            OR (ODR.ODR_TYP = numOdrTyp3
                                AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))));

    BEGIN
      OPEN curTOdrAcptRslt(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTOdrAcptRslt
        INTO recTOdrAcptRslt;

      WHILE curTOdrAcptRslt%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.RSLT_CTL_SEQ_CD || ',');                     --履歴管理番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ODR_CTL_NO || ',');                          --受注管理番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ODR_NO || ',');                              --受注番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CUST_ODR_NO || ',');                         --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ODR_TYP || ',');                             --注文区分
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CUST_CD || ',');                             --得意先コード
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CUST_ITEM_CD || ',');                        --得意先品目番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ITEM_CD || ',');                             --品目番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.DESINATED_DLV_DATE || ',');                  --指定納期
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ODR_QTY || ',');                             --受注数量
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.UNIT || ',');                                --単位
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.DLV_PLACE_CD || ',');                        --納品場所コード
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.UNIT_PRICE || ',');                          --単価
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CUR_CD || ',');                              --通貨コード
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.SPCL_PRICE_CO || ',');                       --特値区分
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.DEPO_TYP || ',');                            --預託倉庫区分
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CUST_DLV_CD || ',');                         --納入番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CUST_DLV_KEY_CD || ',');                     --納品キー番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ESTIMATE_NO || ',');                         --見積番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.REMARKS || ',');                             --備考
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CUST_CHRG_PSN_CD || ',');                    --営業担当者コード
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ODR_ACPT_PSN_CD || ',');                     --発行担当者コード
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.IF_CTL_NO || ',');                           --IF情報管理番号
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ODR_SEQ || ',');                             --注文項番
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.ODR_ACPT_DATE || ',');                       --受注日
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CREATED_DATE || ',');                        --作成日
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CREATED_BY || ',');                          --作成者
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.CREATED_PRG_NM || ',');                      --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.UPDATED_DATE || ',');                        --更新日
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.UPDATED_BY || ',');                          --更新者
        UTL_FILE.PUT(pfHandl, recTOdrAcptRslt.UPDATED_PRG_NM || ',');                      --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTOdrAcptRslt.MODIFY_COUNT || ',');                        --更新数

        FETCH curTOdrAcptRslt
          INTO recTOdrAcptRslt;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncOdrAcptRsltCsvWrite;

    --ADD Start 20140331 jian-b
    /*-----------------------------------------------------------------
    ' SubFncHsTOdrUnstockCsvWrite

    ' 修正履歴  2014.03.31 新規作成
        '
    ' 機能      : 非在庫受注履歴削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 非在庫受注履歴削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
     ------------------------------------------------------------------------------*/
    FUNCTION SubFncHsTOdrUnstockCsvWrite(
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recHsTOdrUnstock HS_T_ODR_UNSTOCK%ROWTYPE;

      CURSOR curHsTOdrUnstock(
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM HS_T_ODR_UNSTOCK HSODRUN
          WHERE EXISTS
                ( SELECT * FROM T_ODR_UNSTOCK ODRUN
                  WHERE HSODRUN.ODR_NO = ODRUN.ODR_NO
                        AND (ODRUN.DEL_FLG = numDelFlg
                             OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                                 AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < dtTergetDate)));

    BEGIN
      OPEN curHsTOdrUnstock(pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curHsTOdrUnstock
        INTO recHsTOdrUnstock;

      WHILE curHsTOdrUnstock%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CTL_SEQ_CD || ',');                          --履歴管理番号
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_NO || ',');                              --受注番号
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.NEW_OLD_FLG || ',');                         --新旧フラグ
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.TRAN_TYPE || ',');                           --処理区分
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.COMPANY_CD || ',');                          --会社コード
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.SLIP_CD || ',');                             --伝票番号
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CUST_ODR_NO || ',');                         --得意先注文番号
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CUST_CD || ',');                             --得意先コード
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ITEM_CD || ',');                             --品目番号
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ITEM_NAME || ',');                           --品目名称
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CUST_CHRG_PSN_CD || ',');                    --営業担当者コード
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_ACPT_PSN_CD || ',');                     --発行担当者コード
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CURRNCY_CD || ',');                          --通貨コード
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.EXCH_TYP || ',');                            --為替種別
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.DESINATED_DLV_DATE || ',');                  --指定納期
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_UNIT_PRICE || ',');                      --受注単価
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_QTY || ',');                             --受注数量
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_AMOUNT || ',');                          --受注金額
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_AMOUNT_EXCH_RATES || ',');               --受注金額(邦貨)
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.TAX_APPLY_TYP || ',');                       --消費税適用区分
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.TAX_CD || ',');                              --消費税コード
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.TAX_CALC_TYP || ',');                        --消費税計算区分
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.REMARKS || ',');                             --備考
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_ACPT_DATE || ',');                       --受注日
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ORGN_ODR_NO || ',');                         --元受注番号
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ADD_ODR_FLG || ',');                         --増額受注フラグ
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_CMPLT_FLG || ',');                       --受注完了フラグ
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.ODR_CMPLT_DATE || ',');                      --受注完了日
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.DEL_FLG || ',');                             --削除フラグ
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CREATED_DATE || ',');                        --作成日
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CREATED_BY || ',');                          --作成者
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.CREATED_PRG_NM || ',');                      --作成プログラム名
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.UPDATED_DATE || ',');                        --更新日
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.UPDATED_BY || ',');                          --更新者
        UTL_FILE.PUT(pfHandl, recHsTOdrUnstock.UPDATED_PRG_NM || ',');                      --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recHsTOdrUnstock.MODIFY_COUNT || ',');                   --更新数

        FETCH curHsTOdrUnstock
          INTO recHsTOdrUnstock;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncHsTOdrUnstockCsvWrite;
    --ADD End 20140331 jian-b


    /*-----------------------------------------------------------------
    ' SubFncAllocFixedOdrRsltCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :         内示_確定注文取崩履歴削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :         内示_確定注文取崩履歴削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncAllocFixedORCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                             ) RETURN BOOLEAN IS

      recTAllocFixedOdrRslt T_ALLOC_FIXED_ODR_RSLT%ROWTYPE;

      CURSOR curTAllocFixedOdrRslt(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_ALLOC_FIXED_ODR_RSLT AFOR
          WHERE EXISTS ( SELECT * FROM T_ODR ODR
                  WHERE AFOR.FIXED_ODR_NO = ODR.ODR_NO
                        AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                          OR (ODR.ODR_TYP = numOdrTyp1
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                          OR
                          ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                              OR (ODR.ODR_TYP = numOdrTyp2
                                AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                          OR
                          ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                            OR (ODR.ODR_TYP = numOdrTyp3
                                AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))));

    BEGIN
      OPEN curTAllocFixedOdrRslt(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTAllocFixedOdrRslt
        INTO recTAllocFixedOdrRslt;

      WHILE curTAllocFixedOdrRslt%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.FIXED_ODR_NO || ',');               --確定受注番号
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.ALCTED_SEQ_CD || ',');              --引当順
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.ALCTED_UNCONFIRM_ODR_NO || ',');    --引当先内示受注番号
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.ALCTED_UNCONFIRM_ODR_QTY || ',');   --引当数量
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.DEL_FLG || ',');                    --削除フラグ
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.CREATED_DATE || ',');               --作成日
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.CREATED_BY || ',');                 --作成者
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.CREATED_PRG_NM || ',');             --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.UPDATED_DATE || ',');               --更新日
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.UPDATED_BY || ',');                 --更新者
        UTL_FILE.PUT(pfHandl, recTAllocFixedOdrRslt.UPDATED_PRG_NM || ',');             --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTAllocFixedOdrRslt.MODIFY_COUNT || ',');          --更新数


        FETCH curTAllocFixedOdrRslt
          INTO recTAllocFixedOdrRslt;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncAllocFixedORCsvWrite;



    /*-----------------------------------------------------------------
    ' SubFncAnsDlvDateCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :       出荷計画削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       出荷計画削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
      ------------------------------------------------------------------------------*/
    FUNCTION SubFncAnsDlvDateCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTAnsDlvDate T_ANS_DLV_DATE%ROWTYPE;

      CURSOR curTAnsDlvDate(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_ANS_DLV_DATE AD
          WHERE AD.DEL_FLG = numDelFlg OR EXISTS ( SELECT * FROM T_ODR ODR
                  WHERE AD.ODR_NO = ODR.ODR_NO
                        AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                          OR (ODR.ODR_TYP = numOdrTyp1
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                          OR
                          ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                              OR (ODR.ODR_TYP = numOdrTyp2
                                AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                          OR
                          ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                            OR (ODR.ODR_TYP = numOdrTyp3
                                AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))));

    BEGIN
      OPEN curTAnsDlvDate(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTAnsDlvDate  INTO recTAnsDlvDate;

      WHILE curTAnsDlvDate%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.ODR_NO || ',');                              --受注番号
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.PART_DLV_SEQ_NO || ',');                     --分納項番
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.PRVS_ANS_DLV_DATE_RCD || ',');               --前回納期回答日
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.LAST_ANS_DLV_DATE_RCD || ',');               --最新納期回答日
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.DESINATED_SHIP_DATE || ',');                 --出荷指定日
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.DESINATED_SHIP_QTY || ',');                  --出荷指定数量
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.REST_SHIP_ODR_QTY || ',');                   --出荷指示残数量
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.SHIP_ODR_CMPLT_FLG || ',');                  --出荷指示完了フラグ
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.IF_CTL_NO || ',');                           --IF情報管理番号
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.OD_NO || ',');                               --オーダデマンド番号
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.DEL_FLG || ',');                             --削除フラグ
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.CREATED_DATE || ',');                        --作成日
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.CREATED_BY || ',');                          --作成者
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.CREATED_PRG_NM || ',');                      --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.UPDATED_DATE || ',');                        --更新日
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.UPDATED_BY || ',');                          --更新者
        UTL_FILE.PUT(pfHandl, recTAnsDlvDate.UPDATED_PRG_NM || ',');                      --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTAnsDlvDate.MODIFY_COUNT || ',');                        --更新数

        FETCH curTAnsDlvDate
          INTO recTAnsDlvDate;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncAnsDlvDateCsvWrite;


    /*-----------------------------------------------------------------
    ' SubFncShipOdrCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :  出荷指示削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :  出荷指示削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncShipOdrCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
     ) RETURN BOOLEAN IS

      recTShipOdr T_SHIP_ODR%ROWTYPE;

      CURSOR curTShipOdr(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_SHIP_ODR SO
            WHERE SO.DEL_FLG = numDelFlg OR  EXISTS ( SELECT * FROM T_ODR ODR
                WHERE SO.ODR_NO = ODR.ODR_NO
                      AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                        OR (ODR.ODR_TYP = numOdrTyp1
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                            OR (ODR.ODR_TYP = numOdrTyp2
                              AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                          OR (ODR.ODR_TYP = numOdrTyp3
                              AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))));

    BEGIN
      OPEN curTShipOdr(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTShipOdr
        INTO recTShipOdr;

      WHILE curTShipOdr%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recTShipOdr.SHIP_ODR_NO || ',');                       --出荷指示番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.ODR_NO || ',');                            --受注番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.PART_DLV_SEQ_NO || ',');                   --分納項番
        UTL_FILE.PUT(pfHandl, recTShipOdr.SLIP_CD || ',');                           --伝票番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.ITEM_CD || ',');                           --品目番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.JOB_ODR_CD || ',');                        --製番
        UTL_FILE.PUT(pfHandl, recTShipOdr.CUST_ITEM_CD || ',');                      --得意先品目番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.CUST_ODR_NO || ',');                       --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.CUST_CD || ',');                           --得意先コード
        UTL_FILE.PUT(pfHandl, recTShipOdr.CUST_NAME || ',');                         --得意先名略称
        UTL_FILE.PUT(pfHandl, recTShipOdr.CUST_CHRG_PSN_CD || ',');                  --営業担当者コード
        UTL_FILE.PUT(pfHandl, recTShipOdr.SHIP_ODR_ISS_PSN_CD || ',');               --発行担当者コード
        UTL_FILE.PUT(pfHandl, recTShipOdr.DLV_LOC_CD || ',');                        --納品場所コード
        UTL_FILE.PUT(pfHandl, recTShipOdr.DEPO_TYP || ',');                          --預託倉庫区分
        UTL_FILE.PUT(pfHandl, recTShipOdr.DESINATED_SHIP_DATE || ',');               --出荷指定日
        UTL_FILE.PUT(pfHandl, recTShipOdr.SCDL_DLV_DATE || ',');                     --納品予定日
        UTL_FILE.PUT(pfHandl, recTShipOdr.SHIP_QTY || ',');                          --出荷指示数量
        UTL_FILE.PUT(pfHandl, recTShipOdr.TOTAL_SHIP_QTY || ',');                    --出荷実績累計数
        UTL_FILE.PUT(pfHandl, recTShipOdr.RETURN_QTY || ',');                        --返品数量
        UTL_FILE.PUT(pfHandl, recTShipOdr.UNIT_CD || ',');                           --単位
        UTL_FILE.PUT(pfHandl, recTShipOdr.UNIT_PRICE || ',');                        --単価
        UTL_FILE.PUT(pfHandl, recTShipOdr.SHIP_ODR_AMOUNT || ',');                   --出荷指示金額
        UTL_FILE.PUT(pfHandl, recTShipOdr.SHIP_ODR_AMOUNT_EXCH_RATES || ',');        --出荷指示金額(邦貨)
        UTL_FILE.PUT(pfHandl, recTShipOdr.CURRNCY_CD || ',');                        --通貨コード
        UTL_FILE.PUT(pfHandl, recTShipOdr.LOC_CD || ',');                            --ロケーション番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.PKG_UNIT_QTY || ',');                      --荷姿単位数
        UTL_FILE.PUT(pfHandl, recTShipOdr.CASE_QTY || ',');                          --箱数
        UTL_FILE.PUT(pfHandl, recTShipOdr.REST_QTY || ',');                          --端数
        UTL_FILE.PUT(pfHandl, recTShipOdr.TOTAL_CASE_QTY || ',');                    --口数
        UTL_FILE.PUT(pfHandl, recTShipOdr.REMARKS || ',');                           --備考
        UTL_FILE.PUT(pfHandl, recTShipOdr.DLV_KEY_NO || ',');                        --納品キー番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.PART_DLV_TYP || ',');                      --分納区分
        UTL_FILE.PUT(pfHandl, recTShipOdr.PART_DLV_COUNT || ',');                    --分納回数
        UTL_FILE.PUT(pfHandl, recTShipOdr.TRANSPORT_CD || ',');                      --運送便コード
        UTL_FILE.PUT(pfHandl, recTShipOdr.TRANSPORT_TYP || ',');                     --輸送形態区分
        UTL_FILE.PUT(pfHandl, recTShipOdr.ALLCT_WH_CD || ',');                       --引当保管区
        UTL_FILE.PUT(pfHandl, recTShipOdr.TRANSFER_WH_CD || ',');                    --振替先保管区
        UTL_FILE.PUT(pfHandl, recTShipOdr.DIRECT_DLV_FLG || ',');                    --在庫チェックなしフラグ
        UTL_FILE.PUT(pfHandl, recTShipOdr.ENTRY_TYP || ',');                         --データ入力区分
        UTL_FILE.PUT(pfHandl, recTShipOdr.PRINT_FLG || ',');                         --帳票出力フラグ
        UTL_FILE.PUT(pfHandl, recTShipOdr.SHP_CMPLT_FLG || ',');                     --実績処理フラグ
        UTL_FILE.PUT(pfHandl, recTShipOdr.DEPO_TRANSFER_PROC_FLG || ',');            --預託在庫振替処理フラグ
        UTL_FILE.PUT(pfHandl, recTShipOdr.ORG_SLIP_CD || ',');                       --元伝票番号
        UTL_FILE.PUT(pfHandl, recTShipOdr.DEL_FLG || ',');                           --削除フラグ
        UTL_FILE.PUT(pfHandl, recTShipOdr.CREATED_DATE || ',');                      --作成日
        UTL_FILE.PUT(pfHandl, recTShipOdr.CREATED_BY || ',');                        --作成者
        UTL_FILE.PUT(pfHandl, recTShipOdr.CREATED_PRG_NM || ',');                    --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTShipOdr.UPDATED_DATE || ',');                      --更新日
        UTL_FILE.PUT(pfHandl, recTShipOdr.UPDATED_BY || ',');                        --更新者
        UTL_FILE.PUT(pfHandl, recTShipOdr.UPDATED_PRG_NM || ',');                    --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTShipOdr.MODIFY_COUNT || ',');                 --更新数

        FETCH curTShipOdr
          INTO recTShipOdr;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncShipOdrCsvWrite;


    /*-----------------------------------------------------------------
      ' SubFncShipSlipCsvWrite

      ' 修正履歴  2007.06.27 新規作成
          '
      ' 機能      :       出荷伝票データ削除データCSVファイル出力
          '
      ' 引き数    :

      ' 戻り値    : BOOLEAN           TRUE  = 正常
      '                               FALSE = 異常
      ' 機能説明  :       出荷伝票データ削除データCSVファイル出力をおこなう
          '
      ' 備考      : 特になし
          '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncShipSlipCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTShipSlip T_SHIP_SLIP%ROWTYPE;

      CURSOR curTShipSlip(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_SHIP_SLIP SS
             WHERE SS.DEL_FLG = numDelFlg OR  EXISTS ( SELECT * FROM T_ODR ODR,T_SHIP_ODR SHIPODR
                WHERE SHIPODR.ODR_NO = ODR.ODR_NO AND SS.SLIP_CD = SHIPODR.SLIP_CD
                      AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                        OR (ODR.ODR_TYP = numOdrTyp1
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                            OR (ODR.ODR_TYP = numOdrTyp2
                              AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                          OR (ODR.ODR_TYP = numOdrTyp3
                              AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))));

    BEGIN
      OPEN curTShipSlip(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTShipSlip
        INTO recTShipSlip;

      WHILE curTShipSlip%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTShipSlip.SLIP_CD || ',');                                 --伝票番号
        UTL_FILE.PUT(pfHandl, recTShipSlip.ITEM_CD || ',');                                 --品目番号
        UTL_FILE.PUT(pfHandl, recTShipSlip.CUST_ITEM_CD || ',');                            --得意先品目番号
        UTL_FILE.PUT(pfHandl, recTShipSlip.PART_NAME || ',');                               --一般品名
        UTL_FILE.PUT(pfHandl, recTShipSlip.CUST_ODR_NO || ',');                             --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTShipSlip.CUST_CD || ',');                                 --得意先コード
        UTL_FILE.PUT(pfHandl, recTShipSlip.CUST_NAME || ',');                               --得意先名
        UTL_FILE.PUT(pfHandl, recTShipSlip.DLV_LOC_CD || ',');                              --納品場所コード
        UTL_FILE.PUT(pfHandl, recTShipSlip.DLV_LOC_NAME_KANJI || ',');                      --納品場所名(漢字)
        UTL_FILE.PUT(pfHandl, recTShipSlip.BUYER_NAME || ',');                              --購買担当
        UTL_FILE.PUT(pfHandl, recTShipSlip.CUS_DLV_KEY_CD || ',');                          --納品キー番号
        UTL_FILE.PUT(pfHandl, recTShipSlip.DESINATED_SHIP_DATE || ',');                     --出荷指定日
        UTL_FILE.PUT(pfHandl, recTShipSlip.DESINATED_DLV_DATE || ',');                      --指定納期
        UTL_FILE.PUT(pfHandl, recTShipSlip.SCDL_DLV_DATE || ',');                           --納品予定日
        UTL_FILE.PUT(pfHandl, recTShipSlip.PUCH_ODR_QTY_TOTAL || ',');                      --総注文数量
        UTL_FILE.PUT(pfHandl, recTShipSlip.DLV_ODR_QTY || ',');                             --納入指示数量
        UTL_FILE.PUT(pfHandl, recTShipSlip.SHIP_ODR_QTY || ',');                            --出荷指示数量
        UTL_FILE.PUT(pfHandl, recTShipSlip.UNIT_CD || ',');                                 --単位
        UTL_FILE.PUT(pfHandl, recTShipSlip.UNIT_PRICE || ',');                              --単価
        UTL_FILE.PUT(pfHandl, recTShipSlip.SHIP_ODR_AMOUNT || ',');                         --出荷指示金額
        UTL_FILE.PUT(pfHandl, recTShipSlip.TAX_AMOUNT || ',');                              --消費税額
        UTL_FILE.PUT(pfHandl, recTShipSlip.SHIP_ODR_AMOUNT_TAX || ',');                     --出荷指示金額(税込み)
        UTL_FILE.PUT(pfHandl, recTShipSlip.EXTERNAL_TAX_SALES_AMOUNT || ',');               --外税対象金額
        UTL_FILE.PUT(pfHandl, recTShipSlip.INTERNAL_TAX_SALES_AMOUNT || ',');               --内税対象金額
        UTL_FILE.PUT(pfHandl, recTShipSlip.TAXFREE_SALES_AMOUNT || ',');                    --非課税対象金額
        UTL_FILE.PUT(pfHandl, recTShipSlip.TAX_CREDIT_SALES_AMOUNT || ',');                 --税抜売上金額
        UTL_FILE.PUT(pfHandl, recTShipSlip.EXTERNAL_TAX_AMOUNT || ',');                     --消費税額（外税）
        UTL_FILE.PUT(pfHandl, recTShipSlip.INTERNAL_TAX_AMOUNT || ',');                     --消費税額（内税）
        UTL_FILE.PUT(pfHandl, recTShipSlip.TAX_AMOUNT_1 || ',');                            --税額１
        UTL_FILE.PUT(pfHandl, recTShipSlip.TAX_AMOUNT_2 || ',');                            --税額２
        UTL_FILE.PUT(pfHandl, recTShipSlip.TAX_AMOUNT_3 || ',');                            --税額３
        UTL_FILE.PUT(pfHandl, recTShipSlip.OWN_CUR_TAXCREDIT_SALES_AMOUNT || ',');          --税抜売上金額（邦貨）
        UTL_FILE.PUT(pfHandl, recTShipSlip.INSPC_TYP || ',');                               --検査区分
        UTL_FILE.PUT(pfHandl, recTShipSlip.CLIENT_REMARK_KANJI || ',');                     --発注者備考(漢字)
        UTL_FILE.PUT(pfHandl, recTShipSlip.CLIENT_BARCODE_INF || ',');                      --発注者バーコード情報
        UTL_FILE.PUT(pfHandl, recTShipSlip.PRINT_FLG || ',');                               --帳票出力フラグ
        UTL_FILE.PUT(pfHandl, recTShipSlip.DEL_FLG || ',');                                 --削除フラグ
        UTL_FILE.PUT(pfHandl, recTShipSlip.CREATED_DATE || ',');                            --作成日
        UTL_FILE.PUT(pfHandl, recTShipSlip.CREATED_BY || ',');                              --作成者
        UTL_FILE.PUT(pfHandl, recTShipSlip.CREATED_PRG_NM || ',');                          --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTShipSlip.UPDATED_DATE || ',');                            --更新日
        UTL_FILE.PUT(pfHandl, recTShipSlip.UPDATED_BY || ',');                              --更新者
        UTL_FILE.PUT(pfHandl, recTShipSlip.UPDATED_PRG_NM || ',');                          --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTShipSlip.MODIFY_COUNT || ',');                       --更新数

        FETCH curTShipSlip
          INTO recTShipSlip;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncShipSlipCsvWrite;


    /*-----------------------------------------------------------------
    ' SubFncShipCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :      出荷実績削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       出荷実績削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncShipCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTShip T_SHIP%ROWTYPE;

      CURSOR curTShip(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
            FROM T_SHIP SHIP
              WHERE SHIP.DEL_FLG = numDelFlg OR EXISTS ( SELECT * FROM T_ODR ODR
                WHERE SHIP.ODR_NO = ODR.ODR_NO
                      AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                        OR (ODR.ODR_TYP = numOdrTyp1
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                            OR (ODR.ODR_TYP = numOdrTyp2
                              AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                          OR (ODR.ODR_TYP = numOdrTyp3
                              AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))));


    BEGIN
      OPEN curTShip(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTShip
        INTO recTShip;

      WHILE curTShip%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_SEQ_NO|| ',');                 --出荷実績管理番号
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_ODR_NO|| ',');                 --出荷指示番号
        UTL_FILE.PUT(pfHandl, recTShip.SLIP_CD|| ',');                      --伝票番号
        UTL_FILE.PUT(pfHandl, recTShip.ODR_NO|| ',');                      --受注番号
        UTL_FILE.PUT(pfHandl, recTShip.PART_DLV_SEQ_NO|| ',');             --分納項番
        UTL_FILE.PUT(pfHandl, recTShip.ORGNAL_SLIP_CD|| ',');              --元伝票管理番号
        UTL_FILE.PUT(pfHandl, recTShip.SLIP_TRN_CD|| ',');                 --伝票区分
        UTL_FILE.PUT(pfHandl, recTShip.ITEM_CD|| ',');                      --品目番号
        UTL_FILE.PUT(pfHandl, recTShip.JOB_ODR_CD|| ',');                  --製番
        UTL_FILE.PUT(pfHandl, recTShip.CUST_ITEM_CD|| ',');                --得意先品目番号
        UTL_FILE.PUT(pfHandl, recTShip.CUST_ODR_NO|| ',');                 --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTShip.CUST_CD|| ',');                      --得意先コード
        UTL_FILE.PUT(pfHandl, recTShip.CUST_NAME|| ',');                   --得意先名略称
        UTL_FILE.PUT(pfHandl, recTShip.CUST_CHRG_PSN_CD|| ',');            --営業担当者コード
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_ODR_ISS_PSN_CD|| ',');         --発行担当者コード
        UTL_FILE.PUT(pfHandl, recTShip.DLV_LOC_CD|| ',');                  --納品場所コード
        UTL_FILE.PUT(pfHandl, recTShip.DEPO_TYP|| ',');                    --預託倉庫区分
        UTL_FILE.PUT(pfHandl, recTShip.ALLCT_WH_CD|| ',');                 --引当保管区(出荷倉庫)
        UTL_FILE.PUT(pfHandl, recTShip.DEPO_WH_CD|| ',');                  --払出預託保管区(払出倉庫)
        UTL_FILE.PUT(pfHandl, recTShip.LOC_CD|| ',');                      --ロケーション番号
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_DATE|| ',');                   --出荷実績日
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_QTY|| ',');                     --出荷実績数量
        UTL_FILE.PUT(pfHandl, recTShip.UNIT_CD|| ',');                      --単位
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_UNIT_PRICE|| ',');              --単価
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_ODR_AMOUNT|| ',');              --出荷実績金額
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_ODR_AMOUNT_EXCH_RATES|| ',');   --出荷実績金額(邦貨)
        UTL_FILE.PUT(pfHandl, recTShip.CURRNCY_CD|| ',');                   --通貨コード
        UTL_FILE.PUT(pfHandl, recTShip.DIRECT_DLV_FLG|| ',');               --在庫チェックなしフラグ
        UTL_FILE.PUT(pfHandl, recTShip.SHIP_INFO_IF_CTRL_NO|| ',');         --出荷情報IF管理番号
        UTL_FILE.PUT(pfHandl, recTShip.INSPC_ACPT_INFO_IF_CTRL_NO|| ',');   --検収情報IF管理番号
        UTL_FILE.PUT(pfHandl, recTShip.CUS_DLV_CD|| ',');                   --納入番号
        UTL_FILE.PUT(pfHandl, recTShip.CUS_DLV_KEY_CD|| ',');               --納品キー番号
        UTL_FILE.PUT(pfHandl, recTShip.DEL_FLG|| ',');                      --削除フラグ
        UTL_FILE.PUT(pfHandl, recTShip.CREATED_DATE|| ',');                 --作成日
        UTL_FILE.PUT(pfHandl, recTShip.CREATED_BY|| ',');                   --作成者
        UTL_FILE.PUT(pfHandl, recTShip.CREATED_PRG_NM|| ',');               --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTShip.UPDATED_DATE|| ',');                 --更新日
        UTL_FILE.PUT(pfHandl, recTShip.UPDATED_BY|| ',');                    --更新者
        UTL_FILE.PUT(pfHandl, recTShip.UPDATED_PRG_NM|| ',');               --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTShip.MODIFY_COUNT|| ',');            --更新数


       FETCH curTShip
        INTO recTShip;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncShipCsvWrite;

    --Add Anken Start 20140423 shang-j
    /*-----------------------------------------------------------------
    ' SubFncServiceCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 役務実績削除データCSVファイル出力
    '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 役務実績削除データCSVファイル出力をおこなう
    '
    ' 備考      : 特になし
    '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncServiceCsvWrite(
    --Del Anken Start 20140515 shang-j
--       pnumOdrTyp3              IN  NUMBER,
    --Del Anken End   20140515 shang-j
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recTService T_SERVICE%ROWTYPE;

      CURSOR curTService(
    --Del Anken Start 20140515 shang-j
--        numOdrTyp3              IN  NUMBER,
    --Del Anken End   20140515 shang-j
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_SERVICE SERVICE
          WHERE EXISTS
              --Upt Anken Start 20140515 shang-j
--                ( SELECT * FROM T_ODR ODR
--                  WHERE SERVICE.ODR_NO = ODR.ODR_NO
--                        AND ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
--                            OR (ODR.ODR_TYP = numOdrTyp3
--                                AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
--                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)));
                (SELECT * FROM T_ODR_UNSTOCK ODRUN
                 WHERE SERVICE.ODR_NO = ODRUN.ODR_NO
                       AND (ODRUN.DEL_FLG = numDelFlg
                            OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < dtTergetDate)));
              --Upt Anken End   20140515 shang-j

    BEGIN
    --Upt Anken Start 20140515 shang-j
--      OPEN curTService(pnumOdrTyp3,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      OPEN curTService(pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
    --Upt Anken End   20140515 shang-j
      FETCH curTService
        INTO recTService;

      WHILE curTService%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recTService.CTL_SEQ_CD || ',');                 --役務実績管理番号
        UTL_FILE.PUT(pfHandl, recTService.ODR_NO || ',');                     --受注番号
        UTL_FILE.PUT(pfHandl, recTService.SLIP_TRN_CD || ',');                --伝票番号
        UTL_FILE.PUT(pfHandl, recTService.SALES_DATE || ',');                 --売上計上日
        UTL_FILE.PUT(pfHandl, recTService.SALES_DEPT_CD || ',');              --売上計上部門
        UTL_FILE.PUT(pfHandl, recTService.CUST_CHRG_PSN_CD || ',');           --営業担当者コード
        UTL_FILE.PUT(pfHandl, recTService.UNIT_COST || ',');                  --単価
        UTL_FILE.PUT(pfHandl, recTService.SERVICE_QTY || ',');                --数量
        UTL_FILE.PUT(pfHandl, recTService.SERVICE_AMOUNT || ',');             --金額
        UTL_FILE.PUT(pfHandl, recTService.SERVICE_AMOUNT_EXCH_RATES || ',');  --金額（邦貨)
        UTL_FILE.PUT(pfHandl, recTService.TAX_CD || ',');                     --消費税コード
        UTL_FILE.PUT(pfHandl, recTService.CURRNCY_CD || ',');                 --通貨コード
        UTL_FILE.PUT(pfHandl, recTService.DESINATED_DLV_DATE || ',');         --指定納期
        UTL_FILE.PUT(pfHandl, recTService.CUST_ODR_NO || ',');                --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTService.CUST_CD || ',');                    --得意先コード
        UTL_FILE.PUT(pfHandl, recTService.ITEM_CD || ',');                    --品目番号
        UTL_FILE.PUT(pfHandl, recTService.ITEM_NAME || ',');                  --品目名
        UTL_FILE.PUT(pfHandl, recTService.REMARKS || ',');                    --備考
        UTL_FILE.PUT(pfHandl, recTService.WORK_TIME || ',');                  --作業時間
        UTL_FILE.PUT(pfHandl, recTService.RATE_PAY || ',');                   --賃率
        UTL_FILE.PUT(pfHandl, recTService.WORK_DATE || ',');                  --作業日
        UTL_FILE.PUT(pfHandl, recTService.WORK_PERSON_CD || ',');             --作業担当者コード
        UTL_FILE.PUT(pfHandl, recTService.WORK_REMARKS || ',');               --作業備考
        UTL_FILE.PUT(pfHandl, recTService.DEL_FLG || ',');                    --削除フラグ
        UTL_FILE.PUT(pfHandl, recTService.CREATED_DATE || ',');               --作成日
        UTL_FILE.PUT(pfHandl, recTService.CREATED_BY || ',');                 --作成者
        UTL_FILE.PUT(pfHandl, recTService.CREATED_PRG_NM || ',');             --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTService.UPDATED_DATE || ',');               --更新日
        UTL_FILE.PUT(pfHandl, recTService.UPDATED_BY || ',');                 --更新者
        UTL_FILE.PUT(pfHandl, recTService.UPDATED_PRG_NM || ',');             --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTService.MODIFY_COUNT || ',');               --更新数

        FETCH curTService
          INTO recTService;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncServiceCsvWrite;

    /*-----------------------------------------------------------------
    ' SubFncHsServiceCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 役務実績履歴削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 役務実績履歴削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncHsServiceCsvWrite(
    --Del Anken Start 20140515 shang-j
--       pnumOdrTyp3              IN  NUMBER,
    --Del Anken End   20140515 shang-j
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recHsTService HS_T_SERVICE%ROWTYPE;

      CURSOR curHsTService(
      --Del Anken Start 20140515 shang-j
--        numOdrTyp3              IN  NUMBER,
      --Del Anken End   20140515 shang-j
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM HS_T_SERVICE HSSERVICE
          WHERE EXISTS
              --Upt Anken Start 20140515 shang-j
--                ( SELECT * FROM T_ODR ODR
--                  WHERE HSSERVICE.ODR_NO = ODR.ODR_NO
--                        AND ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
--                            OR (ODR.ODR_TYP = numOdrTyp3
--                                AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
--                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)));
                (SELECT * FROM T_ODR_UNSTOCK ODRUN
                 WHERE HSSERVICE.ODR_NO = ODRUN.ODR_NO
                       AND (ODRUN.DEL_FLG = numDelFlg
                            OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < dtTergetDate)));
              --Upt Anken End   20140515 shang-j

    BEGIN
    --Upt Anken Start 20140515 shang-j
--      OPEN curHsTService(pnumOdrTyp3,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      OPEN curHsTService(pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
    --Upt Anken End   20140515 shang-j
      FETCH curHsTService
        INTO recHsTService;

      WHILE curHsTService%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recHsTService.CTL_SEQ_CD || ',');                  --履歴管理番号
        UTL_FILE.PUT(pfHandl, recHsTService.ODR_NO || ',');                      --受注番号
        UTL_FILE.PUT(pfHandl, recHsTService.NEW_OLD_FLG || ',');                 --新旧フラグ
        UTL_FILE.PUT(pfHandl, recHsTService.TRAN_TYPE || ',');                   --処理区分
        UTL_FILE.PUT(pfHandl, recHsTService.SLIP_CD || ',');                     --伝票番号
        UTL_FILE.PUT(pfHandl, recHsTService.CRCT_TYP || ',');                    --訂正区分
        UTL_FILE.PUT(pfHandl, recHsTService.SALES_DATE || ',');                  --売上計上日
        UTL_FILE.PUT(pfHandl, recHsTService.SALES_DEPT_CD || ',');               --売上計上部門
        UTL_FILE.PUT(pfHandl, recHsTService.CUST_CHRG_PSN_CD || ',');            --営業担当者コード
        UTL_FILE.PUT(pfHandl, recHsTService.UNIT_COST || ',');                   --単価
        UTL_FILE.PUT(pfHandl, recHsTService.SERVICE_AMOUNT || ',');              --金額
        UTL_FILE.PUT(pfHandl, recHsTService.SERVICE_AMOUNT_EXCH_RATES || ',');   --金額（邦貨)
        UTL_FILE.PUT(pfHandl, recHsTService.TAX_CD || ',');                      --消費税コード
        UTL_FILE.PUT(pfHandl, recHsTService.WORK_TIME || ',');                   --作業時間
        UTL_FILE.PUT(pfHandl, recHsTService.RATE_PAY || ',');                    --賃率
        UTL_FILE.PUT(pfHandl, recHsTService.REMARKS || ',');                     --備考
        UTL_FILE.PUT(pfHandl, recHsTService.WORK_DATE || ',');                   --作業日
        UTL_FILE.PUT(pfHandl, recHsTService.WORK_PERSON_CD || ',');              --作業担当者コード
        UTL_FILE.PUT(pfHandl, recHsTService.WORK_REMARKS || ',');                --作業備考
        UTL_FILE.PUT(pfHandl, recHsTService.CREATED_DATE || ',');                --作成日
        UTL_FILE.PUT(pfHandl, recHsTService.CREATED_BY || ',');                  --作成者
        UTL_FILE.PUT(pfHandl, recHsTService.CREATED_PRG_NM || ',');              --作成プログラム名
        UTL_FILE.PUT(pfHandl, recHsTService.UPDATED_DATE || ',');                --更新日
        UTL_FILE.PUT(pfHandl, recHsTService.UPDATED_BY || ',');                  --更新者
        UTL_FILE.PUT(pfHandl, recHsTService.UPDATED_PRG_NM || ',');              --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recHsTService.MODIFY_COUNT || ',');                --更新数

        FETCH curHsTService
          INTO recHsTService;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncHsServiceCsvWrite;

    /*-----------------------------------------------------------------
    ' SubFncPjOdrAlcCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 案件受注紐付削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 案件受注紐付削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncPjOdrAlcCsvWrite(
       pnumOdrTyp3              IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recPjOdrAlc T_PJ_ODR_ALC%ROWTYPE;

      CURSOR curPjOdrAlc(
        numOdrTyp3              IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_PJ_ODR_ALC
          WHERE EXISTS
                ( SELECT * FROM T_ODR ODR
                  WHERE T_PJ_ODR_ALC.ODR_NO = ODR.ODR_NO
                        AND ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                            OR (ODR.ODR_TYP = numOdrTyp3
                                AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)))
         --Add Anken Start 20140515 shang-j
           OR EXISTS
               (SELECT * FROM T_ODR_UNSTOCK ODRUN
                WHERE T_PJ_ODR_ALC.ODR_NO = ODRUN.ODR_NO
                      AND (ODRUN.DEL_FLG = numDelFlg
                           OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                               AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < dtTergetDate)));
         --Add Anken End   20140515 shang-j

    BEGIN
      OPEN curPjOdrAlc(pnumOdrTyp3,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curPjOdrAlc
        INTO recPjOdrAlc;

      WHILE curPjOdrAlc%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recPjOdrAlc.PROJECT_CD || ',');              --案件番号
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.ESTIMATE_NO || ',');             --見積番号
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.DETAL_NO || ',');                --明細番号
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.ODR_NO || ',');                  --受注番号
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.ESTIMATE_TYPE || ',');           --手配品目種
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.CREATED_DATE || ',');            --作成日
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.CREATED_BY || ',');              --作成者
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.CREATED_PRG_NM || ',');          --作成プログラム名
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.UPDATED_DATE || ',');            --更新日
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.UPDATED_BY || ',');              --更新者
        UTL_FILE.PUT(pfHandl, recPjOdrAlc.UPDATED_PRG_NM || ',');          --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recPjOdrAlc.MODIFY_COUNT || ',');            --更新数

        FETCH curPjOdrAlc
          INTO recPjOdrAlc;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncPjOdrAlcCsvWrite;
        /*-----------------------------------------------------------------------------
    ' SubFncEstimateDetalUpdate

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 見積明細更新
        '
    ' 引き数    :

    ' 戻り値    : NUMBER           更新数
    ' 機能説明  : 見積明細更新を行う
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncEstimateDetalUpdate(
       pvc2UserId               IN  VARCHAR2,
       pvc2BusinessName         IN  VARCHAR2,
       pnumOdrFlg0              IN  NUMBER,
       pnumOdrFlg1              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE
                                       ) RETURN NUMBER IS

      CURSOR curEstimateDetalUpdate(
        numOdrTyp3              IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT PROJECT_CD,      -- 案件番号
               ESTIMATE_NO,     -- 見積番号
               DETAL_NO         -- 明細番号
          FROM T_PJ_ODR_ALC PJODRALC
          WHERE EXISTS
                ( SELECT ODR.ODR_NO FROM T_ODR ODR
                  WHERE PJODRALC.ODR_NO = ODR.ODR_NO
                        AND ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                            OR (ODR.ODR_TYP = numOdrTyp3
                                AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)))
        --Add Anken Start 20140515 shang-j
           OR EXISTS
                (SELECT * FROM T_ODR_UNSTOCK ODRUN
                 WHERE PJODRALC.ODR_NO = ODRUN.ODR_NO
                       AND (ODRUN.DEL_FLG = numDelFlg
                            OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                                AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < dtTergetDate)));
       --Add Anken End   20140515 shang-j

       recEstimateDetalUpdate curEstimateDetalUpdate%ROWTYPE;

    BEGIN
      OPEN curEstimateDetalUpdate(pnumOdrTyp3,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curEstimateDetalUpdate
        INTO recEstimateDetalUpdate;

      WHILE curEstimateDetalUpdate%FOUND LOOP
      -- 見積明細更新
      UPDATE T_ESTIMATE_DETAL
         SET ODR_FLG = numOdrFlg0,
         UPDATED_DATE = SYSDATE,  --更新日
         UPDATED_BY = pvc2UserId, --更新者
         UPDATED_PRG_NM = pvc2BusinessName, --更新プログラム名
         MODIFY_COUNT = MODIFY_COUNT + 1
       WHERE PROJECT_CD = recEstimateDetalUpdate.PROJECT_CD
         AND ESTIMATE_NO = recEstimateDetalUpdate.ESTIMATE_NO
         AND DETAL_NO = recEstimateDetalUpdate.DETAL_NO
         AND ODR_FLG = numOdrFlg1;

        FETCH curEstimateDetalUpdate
          INTO recEstimateDetalUpdate;

        numCntEstimateDetalUpt := SQL%ROWCOUNT + numCntEstimateDetalUpt;
      END LOOP;

      RETURN numCntEstimateDetalUpt;

    EXCEPTION
      WHEN OTHERS THEN
        RETURN 0;

    END SubFncEstimateDetalUpdate;

    --Add Anken End   20140423 shang-j
    /*-----------------------------------------------------------------
    ' SubFncShipTCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :       出荷指示一時テーブル削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       出荷指示一時テーブル削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncShipTCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTShipT SHIP_T%ROWTYPE;

      CURSOR curTShipT(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *

        FROM SHIP_T ST
            WHERE EXISTS ( SELECT * FROM T_ODR ODR
                WHERE ST.ODR_NO = ODR.ODR_NO
                      AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                        OR (ODR.ODR_TYP = numOdrTyp1
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                            OR (ODR.ODR_TYP = numOdrTyp2
                              AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                          OR (ODR.ODR_TYP = numOdrTyp3
                              AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))));


    BEGIN
      OPEN curTShipT(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate);
      FETCH curTShipT INTO recTShipT;

      WHILE curTShipT%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTShipT.ODR_NO|| ',');                        --受注番号
        UTL_FILE.PUT(pfHandl, recTShipT.PART_DLV_SEQ_NO|| ',');               --分納項番
        UTL_FILE.PUT(pfHandl, recTShipT.DESINATED_DLV_DATE|| ',');            --指定納期
        UTL_FILE.PUT(pfHandl, recTShipT.DESINATED_SHIP_DATE|| ',');           --出荷指定日
        UTL_FILE.PUT(pfHandl, recTShipT.DESINATED_SHIP_QTY|| ',');            --出荷指定数量
        UTL_FILE.PUT(pfHandl, recTShipT.REST_SHIP_ODR_QTY|| ',');             --出荷指示残数量
        UTL_FILE.PUT(pfHandl, recTShipT.ALLCT_WH_CD|| ',');                   --引当保管区
        UTL_FILE.PUT(pfHandl, recTShipT.WH_NAME|| ',');                       --保管区名
        UTL_FILE.PUT(pfHandl, recTShipT.CUST_ODR_NO|| ',');                   --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTShipT.CUST_CD|| ',');                       --得意先コード
        UTL_FILE.PUT(pfHandl, recTShipT.CUST_NAME|| ',');                     --得意先名略称
        UTL_FILE.PUT(pfHandl, recTShipT.CUST_ITEM_CD|| ',');                  --得意先品目番号
        UTL_FILE.PUT(pfHandl, recTShipT.CUST_ITEM_NAME|| ',');                --得意先品目名称
        UTL_FILE.PUT(pfHandl, recTShipT.ITEM_CD|| ',');                       --品目番号
        UTL_FILE.PUT(pfHandl, recTShipT.ITEM_NAME|| ',');                     --品目名称
        UTL_FILE.PUT(pfHandl, recTShipT.STOCK_UNIT|| ',');                    --計量単位
        UTL_FILE.PUT(pfHandl, recTShipT.UNIT_QTY_TYP|| ',');                  --在庫数単位区分
        UTL_FILE.PUT(pfHandl, recTShipT.MRP_ODR_TYP|| ',');                   --品目手配区分
        UTL_FILE.PUT(pfHandl, recTShipT.TRANSPORT_TYP|| ',');                 --輸送形態区分
        UTL_FILE.PUT(pfHandl, recTShipT.ODR_UNIT_PRICE|| ',');                --受注単価
        UTL_FILE.PUT(pfHandl, recTShipT.SPCL_PRICE_TYP|| ',');                --特値区分
        UTL_FILE.PUT(pfHandl, recTShipT.PARTIAL_SHIP_INST_FLG|| ',');         --分納出荷指示フラグ
        UTL_FILE.PUT(pfHandl, recTShipT.DIRECT_DLV_FLG|| ',');           --在庫チェックなしフラグ
        UTL_FILE.PUT(pfHandl, recTShipT.ODR_CTL_NO|| ',');                    --受注管理番号
        UTL_FILE.PUT(pfHandl, recTShipT.CREATED_DATE|| ',');                  --作成日
        UTL_FILE.PUT(pfHandl, recTShipT.CREATED_BY|| ',');                    --作成者
        UTL_FILE.PUT(pfHandl, recTShipT.CREATED_PRG_NM|| ',');                --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTShipT.UPDATED_DATE|| ',');                  --更新日
        UTL_FILE.PUT(pfHandl, recTShipT.UPDATED_BY|| ',');                    --更新者
        UTL_FILE.PUT(pfHandl, recTShipT.UPDATED_PRG_NM|| ',');                --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTShipT.MODIFY_COUNT|| ',');                  --更新数

       FETCH curTShipT INTO recTShipT;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncShipTCsvWrite;


    /*-----------------------------------------------------------------
    ' SubFncSalesCsvWrite

    ' 修正履歴  2007.06.27 新規作成
                2014.04.01“伝票番号” = [非在庫受注].”伝票番号”、かつ、
                          “状態区分” = “20：売掛計上予定”を削除する。
        '
    ' 機能      :       売上実績削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       売上実績削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncSalesCsvWrite(
       pnumOdrTyp1              IN  NUMBER,
       pnumOdrTyp2              IN  NUMBER,
       pnumOdrTyp3              IN  NUMBER,
       pnumRmainUnconfirmOdrQty IN  NUMBER,
       pnumOdrCmpltFlg          IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pnumStatus               IN  NUMBER,
       pnumSalesTyp             IN  NUMBER,
       pdtSalesDate             IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTSales T_SALES%ROWTYPE;

      CURSOR curTSales(
        numOdrTyp1              IN  NUMBER,
        numOdrTyp2              IN  NUMBER,
        numOdrTyp3              IN  NUMBER,
        numRmainUnconfirmOdrQty IN  NUMBER,
        numOdrCmpltFlg          IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE,
        dtSalesDate             IN  DATE,
        numStatus               IN  NUMBER,
        numSalesTyp             IN  NUMBER
      ) IS
        SELECT *
          FROM T_SALES SALES
             WHERE   (SALES.SALES_TYP = numSalestyp
                     AND SALES.STATUS = numStatus
                     AND TO_DATE(TO_NUMBER(TO_CHAR(SALES.SALES_DATE,'YYYYMM')),'YYYYMM') < dtSalesDate)
                 OR
                  EXISTS ( SELECT * FROM T_ODR ODR,T_SHIP_ODR SHIPODR
                    WHERE SHIPODR.ODR_NO = ODR.ODR_NO AND SALES.SLIP_CD = SHIPODR.SLIP_CD
                          AND SALES.STATUS = numStatus                                           -- "状態区分" = "20：売掛計上予定"
                          AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)          -- 注文区分が1の場合
                            OR (ODR.ODR_TYP = numOdrTyp1
                                  AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                            OR
                            ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                                OR (ODR.ODR_TYP = numOdrTyp2
                                  AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                                  AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))
                            OR
                            ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                              OR (ODR.ODR_TYP = numOdrTyp3
                                  AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                                  AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate))))
                 --ADD Start 20140331 jian-b
                 OR
                  EXISTS ( SELECT * FROM T_ODR_UNSTOCK ODRUN
                    WHERE SALES.SLIP_CD = ODRUN.SLIP_CD
                          AND SALES.STATUS = numStatus
                          AND (ODRUN.DEL_FLG = numDelFlg
                               OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                                   AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < dtTergetDate)));
                 --ADD End 20140331 jian-b

    BEGIN
      OPEN curTSales(pnumOdrTyp1,pnumOdrTyp2,pnumOdrTyp3,pnumRmainUnconfirmOdrQty,pnumOdrCmpltFlg,pnumDelFlg,pdtTergetDate,pdtSalesDate,pnumStatus,pnumSalesTyp);
      FETCH curTSales
        INTO recTSales;

      WHILE curTSales%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTSales.SALES_SEQ_NO|| ',');                     --売上実績管理番号
        UTL_FILE.PUT(pfHandl, recTSales.SHIP_ODR_NO|| ',');                      --出荷指示番号
        UTL_FILE.PUT(pfHandl, recTSales.SLIP_CD|| ',');                          --伝票番号
        UTL_FILE.PUT(pfHandl, recTSales.SALES_TYP|| ',');                        --売上区分
        UTL_FILE.PUT(pfHandl, recTSales.CUST_CD|| ',');                          --得意先コード
        UTL_FILE.PUT(pfHandl, recTSales.ITEM_CD|| ',');                          --品目番号
        UTL_FILE.PUT(pfHandl, recTSales.ITEM_NAME|| ',');                        --品目名称
        UTL_FILE.PUT(pfHandl, recTSales.CUST_ODR_NO|| ',');                      --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTSales.SALES_DATE|| ',');                       --売上計上日
        UTL_FILE.PUT(pfHandl, recTSales.SALES_DEPT_CD|| ',');                    --売上計上部門
        UTL_FILE.PUT(pfHandl, recTSales.VEND_CD|| ',');                          --取引先コード
        UTL_FILE.PUT(pfHandl, recTSales.PRD_ODR_PLACE_CD|| ',');                 --製造場所コード
        UTL_FILE.PUT(pfHandl, recTSales.CUST_CHRG_PSN_CD|| ',');                 --営業担当者コード
        UTL_FILE.PUT(pfHandl, recTSales.ODR_ACPT_PSN_CD|| ',');                  --発行担当者コード
        UTL_FILE.PUT(pfHandl, recTSales.SALES_QTY|| ',');                        --売上実績数量
        UTL_FILE.PUT(pfHandl, recTSales.SALES_UNIT_PRICE|| ',');                 --単価
        UTL_FILE.PUT(pfHandl, recTSales.UNIT_CD|| ',');                          --単位
        UTL_FILE.PUT(pfHandl, recTSales.SALES_AMOUNT|| ',');                     --売上実績金額
        UTL_FILE.PUT(pfHandl, recTSales.SALES_AMOUNT_EXCH_RATES|| ',');          --売上実績金額(邦貨)
        UTL_FILE.PUT(pfHandl, recTSales.INSPC_ACPT_DATE|| ',');                  --受領検収日
        UTL_FILE.PUT(pfHandl, recTSales.INSPC_ACPT_QTY|| ',');                   --受領検収数
        UTL_FILE.PUT(pfHandl, recTSales.EXTERNAL_TAX_SALES_AMOUNT|| ',');        --外税対象金額
        UTL_FILE.PUT(pfHandl, recTSales.INTERNAL_TAX_SALES_AMOUNT|| ',');        --内税対象金額
        UTL_FILE.PUT(pfHandl, recTSales.TAXFREE_SALES_AMOUNT|| ',');             --非課税対象金額
        UTL_FILE.PUT(pfHandl, recTSales.TAX_CREDIT_SALES_AMOUNT|| ',');          --税抜売上金額
        UTL_FILE.PUT(pfHandl, recTSales.EXTERNAL_TAX_AMOUNT|| ',');              --消費税額（外税）
        UTL_FILE.PUT(pfHandl, recTSales.INTERNAL_TAX_AMOUNT|| ',');              --消費税額（内税）
        UTL_FILE.PUT(pfHandl, recTSales.TAX_AMOUNT_1|| ',');                     --税額１
        UTL_FILE.PUT(pfHandl, recTSales.TAX_AMOUNT_2|| ',');                     --税額２
        UTL_FILE.PUT(pfHandl, recTSales.TAX_AMOUNT_3|| ',');                     --税額３
        UTL_FILE.PUT(pfHandl, recTSales.OWN_CUR_TAXCREDIT_SALES_AMOUNT|| ',');   --税抜売上金額（邦貨）
        UTL_FILE.PUT(pfHandl, recTSales.ORG_SLIP_CD|| ',');                      --元伝票番号
        UTL_FILE.PUT(pfHandl, recTSales.CURRNCY_CD|| ',');                       --通貨コード
        UTL_FILE.PUT(pfHandl, recTSales.SPCL_PRICE_CO|| ',');                    --特値区分
        UTL_FILE.PUT(pfHandl, recTSales.REMARKS|| ',');                          --備考
        UTL_FILE.PUT(pfHandl, recTSales.INSPC_ACPT_TYP|| ',');                   --検収区分
        UTL_FILE.PUT(pfHandl, recTSales.STATUS|| ',');                           --状態区分
        UTL_FILE.PUT(pfHandl, recTSales.DEL_FLG|| ',');                          --削除フラグ
        UTL_FILE.PUT(pfHandl, recTSales.APPR_FLG|| ',');                         --承認状況
        UTL_FILE.PUT(pfHandl, recTSales.APPR_ID|| ',');                          --承認者
        UTL_FILE.PUT(pfHandl, recTSales.APPR_DATE|| ',');                        --承認日
        UTL_FILE.PUT(pfHandl, recTSales.RESERVE_CAUSE|| ',');                    --保留理由
        UTL_FILE.PUT(pfHandl, recTSales.AI_AR_IF_FLG|| ',');                     --Ai売掛インタフェースフラグ
        UTL_FILE.PUT(pfHandl, recTSales.EXCH_RATE|| ',');                        --為替レート
        UTL_FILE.PUT(pfHandl, recTSales.CREATED_DATE|| ',');                     --作成日
        UTL_FILE.PUT(pfHandl, recTSales.CREATED_BY|| ',');                       --作成者
        UTL_FILE.PUT(pfHandl, recTSales.CREATED_PRG_NM|| ',');                   --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTSales.UPDATED_DATE|| ',');                     --更新日
        UTL_FILE.PUT(pfHandl, recTSales.UPDATED_BY|| ',');                       --更新者
        UTL_FILE.PUT(pfHandl, recTSales.UPDATED_PRG_NM|| ',');                   --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTSales.MODIFY_COUNT|| ',');                     --更新数

       FETCH curTSales
        INTO recTSales;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncSalesCsvWrite;


    /*-----------------------------------------------------------------
    ' SubFncOdrInfoEdiIfCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :       注文情報IF削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       注文情報IF削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
     ------------------------------------------------------------------------------*/
    FUNCTION SubFncOdrInfoEdiIfCsvWrite(
       pnumDelFlg               IN  NUMBER,
       pnumSystemProcTyp        IN  NUMBER,
       pdtEdiDate               IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
       ) RETURN BOOLEAN IS

      recTOdrInfoEdiIf T_ODR_INFO_EDI_IF%ROWTYPE;

      CURSOR curTOdrInfoEdiIf(
         numDelFlg               IN  NUMBER,
         numSystemProcTyp        IN  NUMBER,
         dtEdiDate               IN  DATE
      ) IS
        SELECT  *
           FROM T_ODR_INFO_EDI_IF OIEI
             WHERE OIEI.DEL_FLG = numDelFlg
                     OR (OIEI.SYSTEM_PROC_TYP <> numSystemProcTyp
                         AND TO_DATE(TO_NUMBER(TO_CHAR(OIEI.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtEdiDate);

    BEGIN
      OPEN curTOdrInfoEdiIf(pnumDelFlg,pnumSystemProcTyp,pdtEdiDate);
      FETCH curTOdrInfoEdiIf
        INTO recTOdrInfoEdiIf;

      WHILE curTOdrInfoEdiIf%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ODR_INFO_IF_CTRL_NO|| ',');                     --注文情報IF管理番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DATA_PROC_CD|| ',');                            --データ処理NO
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.INFO_TYP_CD|| ',');                             --情報区分コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DATA_CREATED_DATE|| ',');                       --データ作成日
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CLIENT_CD|| ',');                               --発注者コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TRUSTEE_CD|| ',');                              --受注者コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.BUYER_ORG_CD|| ',');                            --発注部門コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PUCH_ODR_CD|| ',');                             --注文番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PRDCT_ODR_CD|| ',');                            --製造番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MODIFICATION_CODE|| ',');                       --訂正コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.COCK_TYP|| ',');                                --コック区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PUCH_ODR_DATE|| ',');                           --注文年月日
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNIT|| ',');                                    --単位
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNIT_PRICE|| ',');                              --単価
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PRICE_TYP|| ',');                               --単価区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PUCH_ODR_QTY|| ',');                            --注文数量
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PUCH_ODR_AMOUNT|| ',');                         --注文金額（受注金額）
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CONS_TYP|| ',');                                --支給区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.BUYER_NAME|| ',');                              --購買担当
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MATR_SPEC_SIZE|| ',');                          --材質・規格・寸法
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SPECTP|| ',');                                  --仕様書有無
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DROWING_EDITION|| ',');                         --版数
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PART_NAME|| ',');                               --品名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.OWN_ITEM_CD|| ',');                             --受注者品名コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_ITEM_CD|| ',');                            --発注者品名コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DROW_SPEC_QTY|| ',');                           --図面・仕様書枚数
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PKG_UNIT|| ',');                                --荷姿
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DIRECT_DLV_TYP|| ',');                          --直納区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_LOC_CD|| ',');                              --受渡場所
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.INSPC_TYP|| ',');                               --検査区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_INST_TYP|| ',');                            --納入指示有無区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_1|| ',');                         --納期1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_1|| ',');                          --納入指示数量1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_1|| ',');                                --納入No1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_2|| ',');                         --納期2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_2|| ',');                          --納入指示数量2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_2|| ',');                                --納入No2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_3|| ',');                         --納期3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_3|| ',');                          --納入指示数量3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_3|| ',');                                --納入No3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_4|| ',');                         --納期4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_4|| ',');                          --納入指示数量4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_4|| ',');                                --納入No4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_5|| ',');                         --納期5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_5|| ',');                          --納入指示数量5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_5|| ',');                                --納入No5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_6|| ',');                         --納期6
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_6|| ',');                          --納入指示数量6
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_6|| ',');                                --納入No6
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_7|| ',');                         --納期7
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_7|| ',');                          --納入指示数量7
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_7|| ',');                                --納入No7
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_8|| ',');                         --納期8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_8|| ',');                          --納入指示数量8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_8|| ',');                                --納入No8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_9|| ',');                         --納期9
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_9|| ',');                          --納入指示数量9
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_9|| ',');                                --納入No9
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_10|| ',');                        --納期10
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_10|| ',');                         --納入指示数量10
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_10|| ',');                               --納入No10
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_11|| ',');                        --納期11
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_11|| ',');                         --納入指示数量11
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_11|| ',');                               --納入No11
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_12|| ',');                        --納期12
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_12|| ',');                         --納入指示数量12
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_12|| ',');                               --納入No12
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_13|| ',');                        --納期13
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_13|| ',');                         --納入指示数量13
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_13|| ',');                               --納入No13
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_14|| ',');                        --納期14
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_14|| ',');                         --納入指示数量14
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_14|| ',');                               --納入No14
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_15|| ',');                        --納期15
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_15|| ',');                         --納入指示数量15
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_15|| ',');                               --納入No15
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_16|| ',');                        --納期16
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_16|| ',');                         --納入指示数量16
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_16|| ',');                               --納入No16
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_17|| ',');                        --納期17
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_17|| ',');                         --納入指示数量17
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_17|| ',');                               --納入No17
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_18|| ',');                        --納期18
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_18|| ',');                         --納入指示数量18
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_18|| ',');                               --納入No18
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_19|| ',');                        --納期19
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_19|| ',');                         --納入指示数量19
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_19|| ',');                               --納入No19
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_20|| ',');                        --納期20
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_20|| ',');                         --納入指示数量20
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_20|| ',');                               --納入No20
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_21|| ',');                        --納期21
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_21|| ',');                         --納入指示数量21
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_21|| ',');                               --納入No21
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_22|| ',');                        --納期22
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_22|| ',');                         --納入指示数量22
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_22|| ',');                               --納入No22
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_23|| ',');                        --納期23
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_23|| ',');                         --納入指示数量23
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_23|| ',');                               --納入No23
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_24|| ',');                        --納期24
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_24|| ',');                         --納入指示数量24
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_24|| ',');                               --納入No24
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_25|| ',');                        --納期25
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_25|| ',');                         --納入指示数量25
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_25|| ',');                               --納入NO25
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_26|| ',');                        --納期26
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_26|| ',');                         --納入指示数量26
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_26|| ',');                               --納入No26
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_27|| ',');                        --納期27
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_27|| ',');                         --納入指示数量27
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_27|| ',');                               --納入No27
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_28|| ',');                        --納期28
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_28|| ',');                         --納入指示数量28
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_28|| ',');                               --納入No2-8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_29|| ',');                        --納期29
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_29|| ',');                         --納入指示数量29
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_29|| ',');                               --納入No29
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_30|| ',');                        --納期30
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_30|| ',');                         --納入指示数量30
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_30|| ',');                               --納入No30
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_DATE_31|| ',');                        --納期31
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SCDL_DLV_QTY_31|| ',');                         --納入指示数量31
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CD_31|| ',');                               --納入No31
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.FREE_TEXT|| ',');                               --自由使用欄
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.REMARKS|| ',');                                 --備考
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TAX_TYP|| ',');                                 --消費税区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_TAXATION_TYP|| ',');                       --課税区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TAX_AMOUNT|| ',');                              --消費税額
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_TOTAL_AMOUNT|| ',');                       --合計額
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNCONFIRM_ODR_CD|| ',');                        --予約番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNCONFIRM_ODR_DATE|| ',');                      --予約年月日
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNCONFIRM_ODR_QTY|| ',');                       --予約数量
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNCONFIRM_ODR_AMOUNT|| ',');                    --予約金額
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PLANNING_ODR_CD|| ',');                         --計画番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PLANNING_ODR_DATE|| ',');                       --計画年月日
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.STANDARD_DLV_TERM|| ',');                       --標準納入日数
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ESTIMATE_REQST_CD|| ',');                       --見積依頼番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.STL_COND_CD|| ',');                             --決済条件区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.END_USER_NAME|| ',');                           --エンドユーザー名カナ
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_ZIP_CD|| ',');                              --納入先郵便番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_ADDRESS|| ',');                             --納入先住所
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_ADDRESSEE|| ',');                           --納入先宛先名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_COMM_SUBNAME|| ',');                       --エンドユーザー品名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_COMM_SUBCD|| ',');                         --エンドユーザー品名コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.END_USER_ODR_CD|| ',');                         --エンドユーザー注文番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_DESINATED_MAKER|| ',');                    --指定メーカー名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.REQUIRED_TERM|| ',');                           --所要期間
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_1|| ',');                            --納品キー番号1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_2|| ',');                            --納品キー番号2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_3|| ',');                            --納品キー番号3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_4|| ',');                            --納品キー番号4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_5|| ',');                            --納品キー番号5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_6|| ',');                            --納品キー番号6
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_7|| ',');                            --納品キー番号7
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_8|| ',');                            --納品キー番号8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_9|| ',');                            --納品キー番号9
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_10|| ',');                           --納品キー番号10
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_11|| ',');                           --納品キー番号11
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_12|| ',');                           --納品キー番号12
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_13|| ',');                           --納品キー番号13
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_14|| ',');                           --納品キー番号14
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_15|| ',');                           --納品キー番号15
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_16|| ',');                           --納品キー番号16
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_17|| ',');                           --納品キー番号17
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_18|| ',');                           --納品キー番号18
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_19|| ',');                           --納品キー番号19
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_20|| ',');                           --納品キー番号20
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_21|| ',');                           --納品キー番号21
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_22|| ',');                           --納品キー番号22
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_23|| ',');                           --納品キー番号23
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_24|| ',');                           --納品キー番号24
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_25|| ',');                           --納品キー番号25
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_26|| ',');                           --納品キー番号26
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_27|| ',');                           --納品キー番号27
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_28|| ',');                           --納品キー番号28
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_29|| ',');                           --納品キー番号29
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_30|| ',');                           --納品キー番号30
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_KEY_NO_31|| ',');                           --納品キー番号31
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_LOC_NAME|| ',');                            --受渡場所名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CLIENT_BARCODE_INF|| ',');                      --発注者用バーコード情報
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CLIENT_REMARK|| ',');                           --発注者用備考
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CONTRACT_COND_TYP|| ',');                       --契約条件区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PUCH_ODR_SHAP_TYP|| ',');                       --発注形態区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MASTER_PUCH_ODR_CD|| ',');                      --親注文番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.QTY_CONTRACT_TYP|| ',');                        --数量契約区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ODR_MODIFICATION_TYP_1|| ',');                  --変更注文区分1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ODR_MODIFICATION_TYP_2|| ',');                  --変更注文区分2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ODR_MODIFICATION_TYP_3|| ',');                  --変更注文区分3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MACHINE_TYP_CD|| ',');                          --機種コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ENGINNERING_CHG_CD|| ',');                      --設計変更番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DROW_SPEC_CD|| ',');                            --図面・仕様書番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_FORM_1|| ',');                          --要求書種類1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_COPY_NUM_1|| ',');                      --要求書部数1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_LANG_1|| ',');                          --要求書言語1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_FORM_2|| ',');                          --要求書種類2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_COPY_NUM_2|| ',');                      --要求書部数2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_LANG_2|| ',');                          --要求書言語2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_FORM_3|| ',');                          --要求書種類3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_COPY_NUM_3|| ',');                      --要求書部数3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_LANG_3|| ',');                          --要求書言語3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_FORM_4|| ',');                          --要求書種類4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_COPY_NUM_4|| ',');                      --要求書部数4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_DOC_LANG_4|| ',');                          --要求書言語4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.STRATEGIC_GOODS_TYP|| ',');                     --戦略物資区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ORGN_PLACE_CD_1|| ',');                         --原産地コード1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ORGN_PLACE_CD_2|| ',');                         --原産地コード2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ORGN_PLACE_CD_3|| ',');                         --原産地コード3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ORGN_PLACE_CD_4|| ',');                         --原産地コード4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ORGN_PLACE_CD_5|| ',');                         --原産地コード5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_1|| ',');                              --納入時刻1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_2|| ',');                              --納入時刻2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_3|| ',');                              --納入時刻3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_4|| ',');                              --納入時刻4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_5|| ',');                              --納入時刻5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_6|| ',');                              --納入時刻6
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_7|| ',');                              --納入時刻7
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_8|| ',');                              --納入時刻8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_9|| ',');                              --納入時刻9
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_10|| ',');                             --納入時刻10
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_11|| ',');                             --納入時刻11
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_12|| ',');                             --納入時刻12
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_13|| ',');                             --納入時刻13
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_14|| ',');                             --納入時刻14
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_15|| ',');                             --納入時刻15
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_16|| ',');                             --納入時刻16
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_17|| ',');                             --納入時刻17
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_18|| ',');                             --納入時刻18
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_19|| ',');                             --納入時刻19
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_20|| ',');                             --納入時刻20
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_21|| ',');                             --納入時刻21
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_22|| ',');                             --納入時刻22
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_23|| ',');                             --納入時刻23
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_24|| ',');                             --納入時刻24
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_25|| ',');                             --納入時刻25
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_26|| ',');                             --納入時刻26
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_27|| ',');                             --納入時刻27
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_28|| ',');                             --納入時刻28
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_29|| ',');                             --納入時刻29
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_30|| ',');                             --納入時刻30
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_TIME_31|| ',');                             --納入時刻31
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.PACKAGE_DLV_CD|| ',');                          --一括納入番号
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SPEC|| ',');                                    --発注品仕様
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.BUYER_ORG_NAME|| ',');                          --発注部門名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_1|| ',');                          --条長1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_1|| ',');                          --条長個数1
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_2|| ',');                          --条長2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_2|| ',');                          --条長個数2
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_3|| ',');                          --条長3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_3|| ',');                          --条長個数3
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_4|| ',');                          --条長4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_4|| ',');                          --条長個数4
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_5|| ',');                          --条長5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_5|| ',');                          --条長個数5
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_6|| ',');                          --条長6
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_6|| ',');                          --条長個数6
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_7|| ',');                          --条長7
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_7|| ',');                          --条長個数7
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_8|| ',');                          --条長8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_8|| ',');                          --条長個数8
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_9|| ',');                          --条長9
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_9|| ',');                          --条長個数9
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_LEN_10|| ',');                         --条長10
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_QTY_10|| ',');                         --条長個数10
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_PART_UNIT|| ',');                           --条長単位
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_CONSTRUCT_NAME|| ',');                     --工事件名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MATERIAL_CD|| ',');                             --主材料コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MATERIAL_UNIT_PRICE|| ',');                     --主材料ベース
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MATERIAL_UNIT|| ',');                           --主材料単位
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TEST_REPORT_NEED_TYP|| ',');                    --試験成績書要否区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TEST_REPORT_CHK_TYP|| ',');                     --試験成績書検査区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TEST_REPORT_PRESENT_TYP|| ',');                 --試験成績書提出方法
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MUNICIPAL_CD|| ',');                            --市長村コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_CONTACT_TEL|| ',');                         --納入時連絡先
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SLIP_PRICE_PRINT_TYP|| ',');                    --納品書価格表示区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.BUYER_NAME_KANJI|| ',');                        --購買担当漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SPEC_KANJI|| ',');                              --材質・規格・寸法漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ITEM_NAME_KANJI|| ',');                         --品名漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.REMARKS_KANJI|| ',');                           --備考漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.END_USER_NAME_KANJI|| ',');                     --エンドユーザー名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_ADDRESS_KANJI|| ',');                       --納入先住所漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_ADDRESSEE_KANJI|| ',');                     --納入先宛先名漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.END_USER_ITEM_NAME_KANJI|| ',');                --エンドユーザー品名漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_DESINATED_MAKER_KANJI|| ',');              --指定メーカ名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DLV_LOC_NAME_KANJI|| ',');                      --受渡場所名漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CLIENT_REMARK_KANJI|| ',');                     --発注者用備考漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MACHINE_TYPE_NAME_KANJI|| ',');                 --機種名漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_SPC_KANJI|| ',');                          --発注品仕様漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.BUYER_ORG_NAME_KANJI|| ',');                    --発注部門名漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUST_CONSTRUCT_NAME_KANJI|| ',');               --工事件名漢字
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CUR_CD|| ',');                                  --通貨コード
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNIT_PRICE_EXCH_RATES|| ',');                   --単価（外貨）
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.ODR_AMOUNT_EXCH_RATES|| ',');                   --注文金額（外貨）
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TAX_AMOUNT_EXCH_RATES|| ',');                   --消費税額（外貨）
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.TOTAL_AMOUNT_EXCH_RATES|| ',');                 --合計額（外貨）
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UNCONFIRM_AMOUNT_EXCH_RATES|| ',');             --UNCONFIRM_AMOUNT_EXCH_RATES
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.MATERIAL_CD_EXCH_RATES|| ',');                  --主材料ベース（外貨）
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.SYSTEM_PROC_TYP|| ',');                         --システム処理区分
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.DEL_FLG|| ',');                                 --削除フラグ
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CREATED_DATE|| ',');                            --作成日
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CREATED_BY|| ',');                              --作成者
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.CREATED_PRG_NM|| ',');                          --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UPDATED_DATE|| ',');                            --更新日
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UPDATED_BY|| ',');                              --更新者
        UTL_FILE.PUT(pfHandl, recTOdrInfoEdiIf.UPDATED_PRG_NM|| ',');                          --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTOdrInfoEdiIf.MODIFY_COUNT|| ',');                            --更新数


       FETCH curTOdrInfoEdiIf
        INTO recTOdrInfoEdiIf;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncOdrInfoEdiIfCsvWrite;

    /*-----------------------------------------------------------------
    ' SubFncOdrInfoComIfCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :       受注情報共通I削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :      受注情報共通IF削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
    ------------------------------------------------------------------------------*/
    FUNCTION SubFncOdrInfoComIfCsvWrite(
       pnumDelFlg               IN  NUMBER,
       pnumSystemProcTyp        IN  NUMBER,
       pdtEdiDate               IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                      ) RETURN BOOLEAN IS

      recTOdrInfoComIf T_ODR_INFO_COM_IF%ROWTYPE;

      CURSOR curTOdrInfoComIf(
         numDelFlg               IN  NUMBER,
         numSystemProcTyp        IN  NUMBER,
         dtEdiDate               IN  DATE
      ) IS
        SELECT  *

         FROM T_ODR_INFO_COM_IF OICI
             WHERE OICI.DEL_FLG = numDelFlg
                     OR (OICI.SYSTEM_PROC_TYP <> numSystemProcTyp
                         AND TO_DATE(TO_NUMBER(TO_CHAR(OICI.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtEdiDate);

    BEGIN
      OPEN curTOdrInfoComIf(pnumDelFlg,pnumSystemProcTyp,pdtEdiDate);
      FETCH curTOdrInfoComIf
        INTO recTOdrInfoComIf;

      WHILE curTOdrInfoComIf%FOUND LOOP
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.ODR_INFO_COM_IF_CTRL_NO|| ',');                 --注文情報共通IF管理番号
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.ODR_SEQ|| ',');                                --注文項番
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.ODR_ACPT_PROC_ODR|| ',');                      --注文処理順
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.ODR_TYP|| ',');                                --注文区分
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.IF_TYP|| ',');                                 --IF種別
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.INFO_TYP_CD|| ',');                            --情報区分コード
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CUST_ODR_NO|| ',');                            --得意先注文番号
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.ODR_ACPT_DATE|| ',');                          --受注日
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CUST_CD|| ',');                                --得意先コード
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.BUYER_ORG_CD|| ',');                           --発注部門コード
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CUST_ITEM_CD|| ',');                           --得意先品目番号
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.PART_NAME|| ',');                              --品名
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.PROC_TYP|| ',');                               --処理区分
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.COCK_TYP|| ',');                               --コック区分
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.UNIT_CD|| ',');                                --単位
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.UNIT_CD_ORG|| ',');                            --変換前単位
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.UNIT_COST|| ',');                              --単価
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.UNIT_COST_TYP|| ',');                          --単価区分
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.DESINATED_DLV_DATE|| ',');                     --指定納期
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.PUCH_ODR_QTY|| ',');                           --注文数量
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.PUCH_ODR_QTY_TOTAL|| ',');                     --総注文数量
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.PKG_UNIT|| ',');                               --荷姿
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.BUYER_NAME|| ',');                             --購買担当
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.INSPC_TYP|| ',');                              --検査区分
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.DLV_LOC_CD|| ',');                             --納品場所コード
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.DLV_LOC_CD_EIAJ|| ',');                        --受渡場所コード
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.DLV_LOC_NAME_KANJI|| ',');                     --受渡場所名(漢字)
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CUS_DLV_CD|| ',');                             --納入ＮＯ
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CUS_DLV_KEY_CD|| ',');                         --納品キー番号
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.FREE_REMARK|| ',');                            --自由使用欄
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.REMARK|| ',');                                 --備考
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CLIENT_BARCODE_INF|| ',');                     --発注者用バーコード情報
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CLIENT_REMARK|| ',');                          --発注者備考
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CLIENT_REMARK_KANJI|| ',');                    --発注者備考(漢字)
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.SLIP_PRICE_PRINT_TYP|| ',');                   --納品書価格表示区分
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CUR_CD|| ',');                                 --通貨コード
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.OLD_ITEM_ODR_ACPT_F|| ',');                    --旧製品受注F
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.FORCED_ERR_ITEM_ODR_ACPT_F|| ',');             --強制エラー品受注F
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.SYSTEM_PROC_TYP|| ',');                        --システム処理区分
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.DEL_FLG|| ',');                                --削除フラグ
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CREATED_DATE|| ',');                           --作成日
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CREATED_BY|| ',');                             --作成者
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.CREATED_PRG_NM|| ',');                         --作成プログラム名
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.UPDATED_DATE|| ',');                           --更新日
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.UPDATED_BY|| ',');                             --更新者
          UTL_FILE.PUT(pfHandl, recTOdrInfoComIf.UPDATED_PRG_NM|| ',');                         --更新プログラム名
          UTL_FILE.PUT_LINE(pfHandl, recTOdrInfoComIf.MODIFY_COUNT|| ',');                      --更新数

       FETCH curTOdrInfoComIf
        INTO recTOdrInfoComIf;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncOdrInfoComIfCsvWrite;



    /*-----------------------------------------------------------------
    ' SubFncInspcAcptInfoIfCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :       検収情報IF削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       検収情報IF削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
     ------------------------------------------------------------------------------*/
    FUNCTION SubFncInspcAcptInfoIfCsvWrite(
       pnumDelFlg               IN  NUMBER,
       pnumSystemProcTyp        IN  NUMBER,
       pdtEdiDate               IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
      ) RETURN BOOLEAN IS

      recTInspcAcptInfoIf T_INSPC_ACPT_INFO_IF%ROWTYPE;

      CURSOR curTInspcAcptInfoIf(
        numDelFlg               IN  NUMBER,
        numSystemProcTyp        IN  NUMBER,
        dtEdiDate               IN  DATE
      ) IS
        SELECT *
        FROM T_INSPC_ACPT_INFO_IF IAII
             WHERE IAII.DEL_FLG = numDelFlg
                     OR (IAII.SYSTEM_PROC_TYP <> numSystemProcTyp
                         AND TO_DATE(TO_NUMBER(TO_CHAR(IAII.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtEdiDate);

    BEGIN
      OPEN curTInspcAcptInfoIf(pnumDelFlg,pnumSystemProcTyp,pdtEdiDate);
      FETCH curTInspcAcptInfoIf
        INTO recTInspcAcptInfoIf;

      WHILE curTInspcAcptInfoIf%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_INFO_IF_CTRL_NO|| ',');                   --検収情報IF管理番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DATA_PROC_CD|| ',');                                 --データ処理NO
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INFO_TYP_CD|| ',');                                  --情報区分コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DATA_CREATED_DATE|| ',');                            --データ作成日
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CLIENT_CD|| ',');                                    --発注者コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TRUSTEE_CD|| ',');                                   --受注者コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.BUYER_ORG_CD|| ',');                                 --発注部門コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CUST_ODR_CD|| ',');                                  --注文番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.PRDCT_ODR_CD|| ',');                                 --製造番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.MODIFICATION_CODE|| ',');                            --訂正コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.COCK_TYP|| ',');                                     --コック区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.UNIT_CD|| ',');                                      --単位
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.UNIT_PRICE_EXCH_RATES|| ',');                        --単価（邦貨）
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.UNIT_PRICE_TYP|| ',');                               --単価区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.ODR_QTY|| ',');                                      --受注数量
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.BUYER_CD|| ',');                                     --購買担当
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DROWING_EDITION|| ',');                              --版数
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.ITEM_NAME|| ',');                                    --品名
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.OWN_ITEM_CD|| ',');                                  --受注者品名コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CUST_ITEM_CD|| ',');                                 --発注者品名コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DLV_LOC_CD|| ',');                                   --受渡場所
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DLV_CD|| ',');                                       --納入NO
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DLV_QTY|| ',');                                      --納入数量
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.SHIP_DATE|| ',');                                    --出荷日
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DLV_DATE|| ',');                                     --納入日（着荷予定日）
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.PART_DLV_COUNT|| ',');                               --分納回数
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.SHORT_QTY|| ',');                                    --不足数量
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.REJECT_QTY|| ',');                                   --不良数量
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_UNIT_PRICE_EXCH_RAT|| ',');               --検収単価（邦貨）
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_AMOUNT_EXCH_RATES|| ',');             --検収金額（邦貨）
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_QTY|| ',');                               --検収数量
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_DATE|| ',');                              --検収日
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_TYP|| ',');                               --検収区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.SLIP_CD|| ',');                                      --伝票番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.SHIP_PACKING_CD|| ',');                              --出荷梱包NO
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.REMARKS|| ',');                                      --備考
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TAX_TYP|| ',');                                      --消費税区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TRADE_TYP|| ',');                                    --取引符号区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TAXATION_TYP|| ',');                                 --課税区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TAX_AMOUNT_EXCH_RATES|| ',');                        --消費税額（邦貨）
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TOTAL_AMOUNT_EXCH_RATES|| ',');                      --合計額（邦貨）
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_MONTH|| ',');                             --計上月度
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DLV_KEY_CD|| ',');                                   --納品キー番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DLV_LOC_NAME|| ',');                                 --受渡場所名
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.OWN_BARCODE_INF|| ',');                              --受注者用バーコード情報
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.OWN_REMARKS|| ',');                                  --受注者用備考
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CONTRACT_COND_TYP|| ',');                            --契約条件区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.QTY_CONTRACT_TYP|| ',');                             --数量契約区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.BUYER_ORG_NAME|| ',');                               --発注部門名
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.BUYER_NAME_KANJI|| ',');                             --購買担当(漢字)
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.ITEM_NAME_KANJI|| ',');                              --品名(漢字)
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.REMARKS_KANJI|| ',');                                --備考(漢字)
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DLV_LOC_NAME_KANJI|| ',');                           --受渡場所名(漢字)
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.OWN_REMARKS_KANJI|| ',');                            --受注者用備考(漢字)
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.BUYER_ORG_CD_KANJI|| ',');                           --発注部門名(漢字)
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CUR_CD|| ',');                                       --通貨コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.UNIT_PRICE|| ',');                                   --単価
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_UNIT_PRICE|| ',');                        --検収単価
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.INSPC_ACPT_AMOUNT|| ',');                            --検収金額
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TAX_AMOUNT|| ',');                                   --消費税額
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.TOTAL_AMOUNT|| ',');                                 --合計額
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_SHIP_LIST|| ',');                              --鋼材現品番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_SLIP_CD|| ',');                                --鋼材伝票番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_POC_INDUSTRY|| ',');                           --鋼材加工業者
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_DLV_LOC|| ',');                                --鋼材納入先
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_DEM_FACTRY_CD|| ',');                          --鋼材需要家工場コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_TR_COMP_ORG_CD|| ',');                         --鋼材商社店部課コード
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_TR_COMP_ORG_INQUIRY_CD|| ',');                 --鋼材商社照合番号
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_DSP_SPEC|| ',');                               --鋼材表示規格
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_SIZE|| ',');                                   --鋼材寸法
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.STEEL_POC_COST|| ',');                               --鋼材加工賃区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.SYSTEM_PROC_TYP|| ',');                              --システム処理区分
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.DEL_FLG|| ',');                                      --削除フラグ
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CREATED_DATE|| ',');                                 --作成日
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CREATED_BY|| ',');                                   --作成者
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.CREATED_PRG_NM|| ',');                               --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.UPDATED_DATE|| ',');                                 --更新日
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.UPDATED_BY|| ',');                                   --更新者
        UTL_FILE.PUT(pfHandl, recTInspcAcptInfoIf.UPDATED_PRG_NM|| ',');                               --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTInspcAcptInfoIf.MODIFY_COUNT|| ',');                                 --更新数

       FETCH curTInspcAcptInfoIf
        INTO recTInspcAcptInfoIf;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncInspcAcptInfoIfCsvWrite;

    /*-----------------------------------------------------------------
    ' SubFncErrWngLstCsvWrite

    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :       エラー警告リスト削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       エラー警告リスト削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
     ------------------------------------------------------------------------------*/
    FUNCTION SubFncErrWngLstCsvWrite(
       pnumDelFlg               IN  NUMBER,
       pdtEdiDate               IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                      ) RETURN BOOLEAN IS

      recTErrWngLst T_ERR_WNG_LST%ROWTYPE;

      CURSOR curTErrWngLst(
        numDelFlg               IN  NUMBER,
        dtEdiDate               IN  DATE
      ) IS
        SELECT CTL_SEQ_NO,                    --エラー管理番号
              OCCR_POINT,                     --エラー発生ポイント
              OCCR_DATE,                      --エラー発生日時
              STATUS,                         --ステータス
              MSSGE_CD,                       --メッセージコード
              MSSGE,                          --メッセージ
              CUST_CD,                        --得意先コード
              CUST_ITEM_CD,                   --得意先品目番号
              ITEM_CD,                        --品目番号
              CUST_ODR_NO,                    --得意先注文番号
              CUST_CHRG_PSN_CD,               --営業担当者コード
              ERR_REC_TYP,                    --エラー情報区分
              PROC_TYP,                       --処理区分
              ACTUAL_UNIT_PRICE,              --単価
              MASTER_UNIT_PRICE,              --マスター単価
              QTY,                            --数量
              ODR_NO,                         --受注番号
              DESINATED_DLV_DATE,             --指定納期
              SLIP_NO,                        --伝票番号
              IF_CTL_NO,                      --IF情報管理番号
              ODR_SEQ,                        --注文項番
              ERR_CORRECT_FLG,                --エラー修正フラグ
              DEL_FLG,                        --削除フラグ
              CREATED_DATE,                   --作成日
              CREATED_BY,                     --作成者
              CREATED_PRG_NM,                 --作成プログラム名
              UPDATED_DATE,                   --更新日
              UPDATED_BY,                     --更新者
              UPDATED_PRG_NM,                 --更新プログラム名
              MODIFY_COUNT                    --更新数
          FROM T_ERR_WNG_LST EWL
             WHERE EWL.DEL_FLG = numDelFlg
                     OR ( TO_DATE(TO_NUMBER(TO_CHAR(EWL.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtEdiDate);

    BEGIN
      OPEN curTErrWngLst(pnumDelFlg,pdtEdiDate);
      FETCH curTErrWngLst
        INTO recTErrWngLst;

      WHILE curTErrWngLst%FOUND LOOP
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CTL_SEQ_NO|| ',');                            --エラー管理番号
        UTL_FILE.PUT(pfHandl, recTErrWngLst.OCCR_POINT|| ',');                            --エラー発生ポイント
        UTL_FILE.PUT(pfHandl, recTErrWngLst.OCCR_DATE|| ',');                             --エラー発生日時
        UTL_FILE.PUT(pfHandl, recTErrWngLst.STATUS|| ',');                                --ステータス
        UTL_FILE.PUT(pfHandl, recTErrWngLst.MSSGE_CD|| ',');                              --メッセージコード
        UTL_FILE.PUT(pfHandl, recTErrWngLst.MSSGE|| ',');                                 --メッセージ
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CUST_CD|| ',');                               --得意先コード
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CUST_ITEM_CD|| ',');                          --得意先品目番号
        UTL_FILE.PUT(pfHandl, recTErrWngLst.ITEM_CD|| ',');                               --品目番号
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CUST_ODR_NO|| ',');                           --得意先注文番号
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CUST_CHRG_PSN_CD|| ',');                      --営業担当者コード
        UTL_FILE.PUT(pfHandl, recTErrWngLst.ERR_REC_TYP|| ',');                           --エラー情報区分
        UTL_FILE.PUT(pfHandl, recTErrWngLst.PROC_TYP|| ',');                              --処理区分
        UTL_FILE.PUT(pfHandl, recTErrWngLst.ACTUAL_UNIT_PRICE|| ',');                     --単価
        UTL_FILE.PUT(pfHandl, recTErrWngLst.MASTER_UNIT_PRICE|| ',');                     --マスター単価
        UTL_FILE.PUT(pfHandl, recTErrWngLst.QTY|| ',');                                   --数量
        UTL_FILE.PUT(pfHandl, recTErrWngLst.ODR_NO|| ',');                                --受注番号
        UTL_FILE.PUT(pfHandl, recTErrWngLst.DESINATED_DLV_DATE|| ',');                    --指定納期
        UTL_FILE.PUT(pfHandl, recTErrWngLst.SLIP_NO|| ',');                               --伝票番号
        UTL_FILE.PUT(pfHandl, recTErrWngLst.IF_CTL_NO|| ',');                             --IF情報管理番号
        UTL_FILE.PUT(pfHandl, recTErrWngLst.ODR_SEQ|| ',');                               --注文項番
        UTL_FILE.PUT(pfHandl, recTErrWngLst.ERR_CORRECT_FLG|| ',');                       --エラー修正フラグ
        UTL_FILE.PUT(pfHandl, recTErrWngLst.DEL_FLG|| ',');                               --削除フラグ
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CREATED_DATE|| ',');                          --作成日
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CREATED_BY|| ',');                            --作成者
        UTL_FILE.PUT(pfHandl, recTErrWngLst.CREATED_PRG_NM|| ',');                        --作成プログラム名
        UTL_FILE.PUT(pfHandl, recTErrWngLst.UPDATED_DATE|| ',');                          --更新日
        UTL_FILE.PUT(pfHandl, recTErrWngLst.UPDATED_BY|| ',');                            --更新者
        UTL_FILE.PUT(pfHandl, recTErrWngLst.UPDATED_PRG_NM|| ',');                        --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recTErrWngLst.MODIFY_COUNT|| ',');                          --更新数

       FETCH curTErrWngLst
        INTO recTErrWngLst;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncErrWngLstCsvWrite;

    --Add Anken Start 20140423 shang-j
    /*-----------------------------------------------------------------
    ' SubFncEstimateCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 見積削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 見積削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncEstimateCsvWrite(
       pnumProjectStat4         IN  NUMBER,
       pnumProjectStat9         IN  NUMBER,
       pnumOdrFlg1              IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recEstimate T_ESTIMATE%ROWTYPE;

      CURSOR curEstimate(
        numProjectStat4         IN  NUMBER,
        numProjectStat9         IN  NUMBER,
        numOdrFlg1              IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_ESTIMATE
        WHERE EXISTS
             ( SELECT * FROM T_PROJECT TP
               WHERE T_ESTIMATE.PROJECT_CD = TP.PROJECT_CD
                     AND (TP.DEL_FLG = numDelFlg
                         OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)
                         OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                             AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)));

    BEGIN
      OPEN curEstimate(pnumProjectStat4,pnumProjectStat9,pnumOdrFlg1,pnumDelFlg,pdtTergetDate);
      FETCH curEstimate
        INTO recEstimate;

      WHILE curEstimate%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recEstimate.PROJECT_CD || ',');             --案件番号
        UTL_FILE.PUT(pfHandl, recEstimate.ESTIMATE_NO || ',');            --見積番号
        UTL_FILE.PUT(pfHandl, recEstimate.ESTIMATE_STAT || ',');          --見積ステータス
        UTL_FILE.PUT(pfHandl, recEstimate.ESTIMATE_DATE || ',');          --見積日
        UTL_FILE.PUT(pfHandl, recEstimate.ES_COMMET1 || ',');             --指定納期コメント
        UTL_FILE.PUT(pfHandl, recEstimate.ES_COMMET2 || ',');             --納品場所コメント
        UTL_FILE.PUT(pfHandl, recEstimate.ES_COMMET3 || ',');             --荷造運送費コメント
        UTL_FILE.PUT(pfHandl, recEstimate.ES_COMMET4 || ',');             --お支払条件コメント
        UTL_FILE.PUT(pfHandl, recEstimate.ES_COMMET5 || ',');             --見積有効期限コメント
        UTL_FILE.PUT(pfHandl, recEstimate.ES_USER_CD || ',');             --見積担当者コード
        UTL_FILE.PUT(pfHandl, recEstimate.ES_ORG_CD || ',');              --見積担当部門コード
        UTL_FILE.PUT(pfHandl, recEstimate.ESREMARK1 || ',');              --備考1
        UTL_FILE.PUT(pfHandl, recEstimate.ESREMARK2 || ',');              --備考2
        UTL_FILE.PUT(pfHandl, recEstimate.ESREMARK3 || ',');              --備考3
        UTL_FILE.PUT(pfHandl, recEstimate.ESTIMATE_AMOUNT || ',');        --見積金額合計
        UTL_FILE.PUT(pfHandl, recEstimate.ESTIMATE_AMOUNT_JPN || ',');     --見積金額合計(邦貨)
        UTL_FILE.PUT(pfHandl, recEstimate.UNOFFICIAL_RECEIPT_FLAG || ','); --内示受領フラグ
        UTL_FILE.PUT(pfHandl, recEstimate.DEL_FLG || ',');                 --削除フラグ
        UTL_FILE.PUT(pfHandl, recEstimate.CREATED_DATE || ',');            --作成日
        UTL_FILE.PUT(pfHandl, recEstimate.CREATED_BY || ',');              --作成者
        UTL_FILE.PUT(pfHandl, recEstimate.CREATED_PRG_NM || ',');          --作成プログラム名
        UTL_FILE.PUT(pfHandl, recEstimate.UPDATED_DATE || ',');            --更新日
        UTL_FILE.PUT(pfHandl, recEstimate.UPDATED_BY || ',');              --更新者
        UTL_FILE.PUT(pfHandl, recEstimate.UPDATED_PRG_NM || ',');          --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recEstimate.MODIFY_COUNT || ',');            --更新数

        FETCH curEstimate
          INTO recEstimate;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncEstimateCsvWrite;


    /*-----------------------------------------------------------------
    ' SubFncPjCostCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 案件予算進捗削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 案件予算進捗削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncPjCostCsvWrite(
       pnumProjectStat4         IN  NUMBER,
       pnumProjectStat9         IN  NUMBER,
       pnumOdrFlg1              IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recPjCost T_PJ_COST%ROWTYPE;

      CURSOR curPjCost(
        numProjectStat4         IN  NUMBER,
        numProjectStat9         IN  NUMBER,
        numOdrFlg1              IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_PJ_COST
        WHERE EXISTS
             ( SELECT * FROM T_PROJECT TP
               WHERE T_PJ_COST.PROJECT_CD = TP.PROJECT_CD
                     AND (TP.DEL_FLG = numDelFlg
                         OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)
                         OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                             AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)));

    BEGIN
      OPEN curPjCost(pnumProjectStat4,pnumProjectStat9,pnumOdrFlg1,pnumDelFlg,pdtTergetDate);
      FETCH curPjCost
        INTO recPjCost;

      WHILE curPjCost%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recPjCost.PROJECT_CD || ',');          --案件番号
        UTL_FILE.PUT(pfHandl, recPjCost.ESTIMATE_NO || ',');         --見積番号
        UTL_FILE.PUT(pfHandl, recPjCost.DETAL_NO || ',');            --明細番号
        UTL_FILE.PUT(pfHandl, recPjCost.TOTAL_DATE || ',');          --集計日時
        UTL_FILE.PUT(pfHandl, recPjCost.ODR_NO || ',');              --受注番号
        UTL_FILE.PUT(pfHandl, recPjCost.ITEM_CD || ',');             --品目番号
        UTL_FILE.PUT(pfHandl, recPjCost.ODR_QTY || ',');             --受注数量
        UTL_FILE.PUT(pfHandl, recPjCost.COMP_QTY || ',');            --完成数
        UTL_FILE.PUT(pfHandl, recPjCost.COST_PROGRESS || ',');       --費用進捗
        UTL_FILE.PUT(pfHandl, recPjCost.CMP_COST_MATERIAL || ',');   --消化実績　材料費
        UTL_FILE.PUT(pfHandl, recPjCost.CMP_COST_PROCESS || ',');    --消化実績　加工費
        UTL_FILE.PUT(pfHandl, recPjCost.CMP_COST_OUTSOUCE || ',');   --消化実績　外注費
        UTL_FILE.PUT(pfHandl, recPjCost.CMP_COST_SERVICE || ',');    --消化実績　役務費
        UTL_FILE.PUT(pfHandl, recPjCost.EXP_COST_MATERIAL || ',');   --落着見込　材料費
        UTL_FILE.PUT(pfHandl, recPjCost.EXP_COST_PROCESS || ',');    --落着見込　加工費
        UTL_FILE.PUT(pfHandl, recPjCost.EXP_COST_OUTSOUCE || ',');   --落着見込　外注費
        UTL_FILE.PUT(pfHandl, recPjCost.EXP_COST_SERVICE || ',');    --落着見込　役務費
        UTL_FILE.PUT(pfHandl, recPjCost.CREATED_DATE || ',');        --作成日
        UTL_FILE.PUT(pfHandl, recPjCost.CREATED_BY || ',');          --作成者
        UTL_FILE.PUT(pfHandl, recPjCost.CREATED_PRG_NM || ',');      --作成プログラム名
        UTL_FILE.PUT(pfHandl, recPjCost.UPDATED_DATE || ',');        --更新日
        UTL_FILE.PUT(pfHandl, recPjCost.UPDATED_BY || ',');          --更新者
        UTL_FILE.PUT(pfHandl, recPjCost.UPDATED_PRG_NM || ',');      --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recPjCost.MODIFY_COUNT || ',');        --更新数

        FETCH curPjCost
          INTO recPjCost;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncPjCostCsvWrite;


    /*-----------------------------------------------------------------
    ' SubFncPjBudgetDetailCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 案件予算積上明細削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 案件予算積上明細削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncPjBudgetDetailCsvWrite(
       pnumProjectStat4         IN  NUMBER,
       pnumProjectStat9         IN  NUMBER,
       pnumOdrFlg1              IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recPjBudgetDetail T_PJ_BUDGET_DETAIL%ROWTYPE;

      CURSOR curPjBudgetDetail(
        numProjectStat4         IN  NUMBER,
        numProjectStat9         IN  NUMBER,
        numOdrFlg1              IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_PJ_BUDGET_DETAIL
        WHERE EXISTS
             ( SELECT * FROM T_PROJECT TP
               WHERE T_PJ_BUDGET_DETAIL.PROJECT_CD = TP.PROJECT_CD
                     AND (TP.DEL_FLG = numDelFlg
                         OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)
                         OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                             AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)));

    BEGIN
      OPEN curPjBudgetDetail(pnumProjectStat4,pnumProjectStat9,pnumOdrFlg1,pnumDelFlg,pdtTergetDate);
      FETCH curPjBudgetDetail
        INTO recPjBudgetDetail;

      WHILE curPjBudgetDetail%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PJ_BUDGET_DETAIL_NO || ',');  --案件予算積上明細番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.SEQNO || ',');                --SEQNO
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.OD_NO || ',');                --オーダデマンド番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PROJECT_CD || ',');           --案件番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ESTIMATE_NO || ',');          --見積番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.DETAL_NO || ',');             --明細番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_NO || ',');               --受注番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ESTIMATE_TYPE || ',');        --手配品目種
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_ACPT_DATE || ',');        --受注日
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PLANT_CD || ',');             --工場コード
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.JOB_ODR_CD || ',');           --製番
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.JOB_ODR_DETAIL_NO || ',');    --製番枝番
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.JOB_ODR_CANCEL_NO || ',');    --製番取消発生番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ROOT_ITEM_CD || ',');         --最上位品目番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PARENT_ITEM_CD || ',');       --親品目番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ITEM_CD || ',');              --品目番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_STS_TYP || ',');          --オーダ状態区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.DM_STS_TYP || ',');           --デマンド状態区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.OD_TYP || ',');               --オーダデマンド区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.DUE_DATE || ',');             --要求納期
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_START_DATE || ',');       --手配着手日
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PRD_DUE_DATE || ',');         --製造納期
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PRD_START_DATE || ',');       --製造着手日
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.DM_QTY || ',');               --デマンド数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_QTY || ',');              --オーダ数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.MRP_ODR_TYP || ',');          --品目手配区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.OUTSIDE_TYP || ',');          --所要量内外作区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PRODUCT_TYP || ',');          --製品区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.UNIT_QTY_TYP || ',');         --在庫数単位区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PS_UNIT_QTY || ',');          --製品構成単位数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PS_UNIT_DENOMINATOR || ',');  --製品構成単位数分母
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PS_UNIT_NUMERATOR || ',');    --製品構成単位数分子
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.TOTAL_RCV_QTY || ',');        --入庫累計数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.TOTAL_ISSUE_QTY || ',');      --出庫累計数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.OD_LEVEL_NO || ',');          --所要量レベル番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PARENT_SEQNO || ',');         --親SEQNO
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ITEM_SPOIL || ',');           --所要量品目仕損率
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PS_SPOIL || ',');             --所要量構成仕損率
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CONS_TYP || ',');             --構成支給区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.NECESSARY_QTY || ',');        --必要所要量
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.PS_INPUT_RATIO || ',');       --構成仕損増分係数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ITEM_INPUT_RATIO || ',');     --品目仕損増分係数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.VEND_CD || ',');              --取引先コード
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_COST_MATERIAL || ',');    --手配残　材料費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_COST_PROCESS || ',');     --手配残　加工費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_COST_OUTSOUCE || ',');    --手配残　外注費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_COST_SERVICE || ',');     --手配残　役務費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CMP_COST_MATERIAL || ',');    --消化実績　材料費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CMP_COST_PROCESS || ',');     --消化実績　加工費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CMP_COST_OUTSOUCE || ',');    --消化実績　外注費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CMP_COST_SERVICE || ',');     --消化実績　役務費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.EXP_COST_MATERIAL || ',');    --落着見込　材料費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.EXP_COST_PROCESS || ',');     --落着見込　加工費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.EXP_COST_OUTSOUCE || ',');    --落着見込　外注費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.EXP_COST_SERVICE || ',');     --落着見込　役務費
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.DMY_ITEM_FLG || ',');         --擬似品目フラグ
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.VOLUNT_SPL_FLG || ',');       --無償受給品フラグ
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.COST_UP_TYP || ',');          --原価積上区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ONEROUS_CONS_FLG || ',');     --有償支給品フラグ
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.BUDGET_STACK_TYP || ',');     --予算積上げ区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ODR_RELEASE_FLG || ',');      --オーダ発効済フラグ
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ORG_OD_NO || ',');            --元オーダデマンド番号
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ORG_JOB_ODR_CD || ',');       --元製番
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ORG_JOB_ODR_DETAIL_NO || ','); --元製番枝番
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ORG_ODR_QTY || ',');          --元オーダ数
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.RCV_ISSUE_GNR_TYP || ',');    --入出庫発生区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ALC_STOCK_FLG || ',');        --引当在庫有無フラグ
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ALC_STOCK_ODR_FLG || ',');    --在庫引当所要量展開区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ALC_STOCK_TYP || ',');        --引当在庫区分
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.ALC_STOCK_RATE || ',');       --引当在庫率
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CREATED_DATE || ',');         --作成日
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CREATED_BY || ',');           --作成者
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.CREATED_PRG_NM || ',');       --作成プログラム名
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.UPDATED_DATE || ',');         --更新日
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.UPDATED_BY || ',');           --更新者
        UTL_FILE.PUT(pfHandl, recPjBudgetDetail.UPDATED_PRG_NM || ',');       --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recPjBudgetDetail.MODIFY_COUNT || ',');         --更新数


        FETCH curPjBudgetDetail
          INTO recPjBudgetDetail;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncPjBudgetDetailCsvWrite;


    /*-----------------------------------------------------------------
    ' SubFncPjBudgetErrorCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 案件予算積上げエラー削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 案件予算積上げエラー削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncPjBudgetErrorCsvWrite(
       pnumProjectStat4         IN  NUMBER,
       pnumProjectStat9         IN  NUMBER,
       pnumOdrFlg1              IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recPjBudgetError T_PJ_BUDGET_ERROR%ROWTYPE;

      CURSOR curPjBudgetError(
        numProjectStat4         IN  NUMBER,
        numProjectStat9         IN  NUMBER,
        numOdrFlg1              IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_PJ_BUDGET_ERROR
        WHERE EXISTS
             ( SELECT * FROM T_PROJECT TP
               WHERE T_PJ_BUDGET_ERROR.PROJECT_CD = TP.PROJECT_CD
                     AND (TP.DEL_FLG = numDelFlg
                         OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)
                         OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                             AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)));

    BEGIN
      OPEN curPjBudgetError(pnumProjectStat4,pnumProjectStat9,pnumOdrFlg1,pnumDelFlg,pdtTergetDate);
      FETCH curPjBudgetError
        INTO recPjBudgetError;

      WHILE curPjBudgetError%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recPjBudgetError.PJ_BUDGET_ERR_NO || ',');  --案件予算積上げエラー番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.PROJECT_CD || ',');        --案件番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.ESTIMATE_NO || ',');       --見積番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.DETAL_NO || ',');          --明細番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.ODR_NO || ',');            --受注番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.PLANT_CD || ',');          --工場コード
        UTL_FILE.PUT(pfHandl, recPjBudgetError.JOB_ODR_CD || ',');        --製番
        UTL_FILE.PUT(pfHandl, recPjBudgetError.ROOT_ITEM_CD || ',');      --最上位品目番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.PARENT_ITEM_CD || ',');    --親品目番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.ITEM_CD || ',');           --品目番号
        UTL_FILE.PUT(pfHandl, recPjBudgetError.PROC_CD || ',');           --作業系列コード
        UTL_FILE.PUT(pfHandl, recPjBudgetError.MESSAGE_CD || ',');        --メッセージコード
        UTL_FILE.PUT(pfHandl, recPjBudgetError.REMARKS || ',');           --備考
        UTL_FILE.PUT(pfHandl, recPjBudgetError.LIST_ISS_FLG || ',');           --リスト出力済フラグ
        UTL_FILE.PUT(pfHandl, recPjBudgetError.CREATED_DATE || ',');      --作成日
        UTL_FILE.PUT(pfHandl, recPjBudgetError.CREATED_BY || ',');        --作成者
        UTL_FILE.PUT(pfHandl, recPjBudgetError.CREATED_PRG_NM || ',');    --作成プログラム名
        UTL_FILE.PUT(pfHandl, recPjBudgetError.UPDATED_DATE || ',');      --更新日
        UTL_FILE.PUT(pfHandl, recPjBudgetError.UPDATED_BY || ',');        --更新者
        UTL_FILE.PUT(pfHandl, recPjBudgetError.UPDATED_PRG_NM || ',');    --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recPjBudgetError.MODIFY_COUNT || ',');      --更新数

        FETCH curPjBudgetError
          INTO recPjBudgetError;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncPjBudgetErrorCsvWrite;

    /*-----------------------------------------------------------------
    ' SubFncEstimateDetalCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 見積明細削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 見積明細削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncEstimateDetalCsvWrite(
       pnumProjectStat4         IN  NUMBER,
       pnumProjectStat9         IN  NUMBER,
       pnumOdrFlg1              IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recEstimateDetal T_ESTIMATE_DETAL%ROWTYPE;

      CURSOR curEstimateDetal(
        numProjectStat4         IN  NUMBER,
        numProjectStat9         IN  NUMBER,
        numOdrFlg1              IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
        SELECT *
          FROM T_ESTIMATE_DETAL
        WHERE EXISTS
             ( SELECT * FROM T_PROJECT TP
               WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD
                     AND (TP.DEL_FLG = numDelFlg
                         OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)
                         OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                             AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                             AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)));

    BEGIN
      OPEN curEstimateDetal(pnumProjectStat4,pnumProjectStat9,pnumOdrFlg1,pnumDelFlg,pdtTergetDate);
      FETCH curEstimateDetal
        INTO recEstimateDetal;

      WHILE curEstimateDetal%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recEstimateDetal.PROJECT_CD || ',');          --案件番号
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ESTIMATE_NO || ',');         --見積番号
        UTL_FILE.PUT(pfHandl, recEstimateDetal.DETAL_NO || ',');            --明細番号
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ESTIMATE_TYPE || ',');       --手配品目種
        UTL_FILE.PUT(pfHandl, recEstimateDetal.CUST_ITEM_CD || ',');        --得意先品目番号
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ITEM_NAME || ',');           --品目名
        UTL_FILE.PUT(pfHandl, recEstimateDetal.DESINATED_DLV_DATE || ',');  --指定納期
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ESTIMATE_QTY || ',');        --数量
        UTL_FILE.PUT(pfHandl, recEstimateDetal.UNIT_CD || ',');             --単位
        UTL_FILE.PUT(pfHandl, recEstimateDetal.UNIT_PRICE || ',');          --単価
        UTL_FILE.PUT(pfHandl, recEstimateDetal.DISCOUNT_PRICE || ',');      --単価値引
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ESTIMATE_UNIT_PRICE || ','); --見積単価
        UTL_FILE.PUT(pfHandl, recEstimateDetal.AMOUNT || ',');              --金額
        UTL_FILE.PUT(pfHandl, recEstimateDetal.DISCOUNT_AMOUNT || ',');    --値引金額
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ESTIMATE_AMOUNT || ',');    --見積金額
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ESTIMATE_AMOUNT_JPN || ',');  --見積金額(邦貨)
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ESTIMATE_GAIN || ',');      --見積利益
        UTL_FILE.PUT(pfHandl, recEstimateDetal.REMARKS || ',');            --備考
        UTL_FILE.PUT(pfHandl, recEstimateDetal.UNIT_COST || ',');          --製品単価
        UTL_FILE.PUT(pfHandl, recEstimateDetal.SPEC_CLASS1 || ',');        --製品選択1
        UTL_FILE.PUT(pfHandl, recEstimateDetal.SPEC_CLASS2 || ',');        --製品選択2
        UTL_FILE.PUT(pfHandl, recEstimateDetal.SPEC_SELECT1 || ',');       --仕様選択1
        UTL_FILE.PUT(pfHandl, recEstimateDetal.SPEC_SELECT2 || ',');       --仕様選択2
        UTL_FILE.PUT(pfHandl, recEstimateDetal.SPEC_SELECT3 || ',');       --仕様選択3
        UTL_FILE.PUT(pfHandl, recEstimateDetal.SPEC_SELECT4 || ',');       --仕様選択4
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ES_COST_ALL || ',');        --見積予算　合計
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ES_COST_MATERIAL || ',');   --見積予算　材料費
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ES_COST_PROCESS || ',');    --見積予算　加工費
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ES_COST_OUTSOUCE || ',');   --見積予算　外注費
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ES_COST_ETC || ',');        --見積予算　その他経費
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ES_COST_SERVICE || ',');    --見積予算　役務費
        UTL_FILE.PUT(pfHandl, recEstimateDetal.CMP_COST_ETC || ',');       --消化実績　その他経費
        UTL_FILE.PUT(pfHandl, recEstimateDetal.ODR_FLG || ',');            --受注有無フラグ
        UTL_FILE.PUT(pfHandl, recEstimateDetal.OD_COMP_FLG || ',');        --予算積上完了フラグ
        UTL_FILE.PUT(pfHandl, recEstimateDetal.DEL_FLG || ',');            --削除フラグ
        UTL_FILE.PUT(pfHandl, recEstimateDetal.CREATED_DATE || ',');       --作成日
        UTL_FILE.PUT(pfHandl, recEstimateDetal.CREATED_BY || ',');         --作成者
        UTL_FILE.PUT(pfHandl, recEstimateDetal.CREATED_PRG_NM || ',');     --作成プログラム名
        UTL_FILE.PUT(pfHandl, recEstimateDetal.UPDATED_DATE || ',');       --更新日
        UTL_FILE.PUT(pfHandl, recEstimateDetal.UPDATED_BY || ',');         --更新者
        UTL_FILE.PUT(pfHandl, recEstimateDetal.UPDATED_PRG_NM || ',');     --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recEstimateDetal.MODIFY_COUNT || ',');       --更新数



        FETCH curEstimateDetal
          INTO recEstimateDetal;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncEstimateDetalCsvWrite;

    /*-----------------------------------------------------------------
    ' SubFncProjectCsvWrite

    ' 修正履歴  2014.04.23 新規作成
        '
    ' 機能      : 案件削除データCSVファイル出力
        '
    ' 引き数    :

    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  : 案件削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
        ------------------------------------------------------------------------------*/
    FUNCTION SubFncProjectCsvWrite(
       pnumProjectStat4         IN  NUMBER,
       pnumProjectStat9         IN  NUMBER,
       pnumOdrFlg1              IN  NUMBER,
       pnumDelFlg               IN  NUMBER,
       pdtTergetDate            IN  DATE,
       pfHandl                  IN  UTL_FILE.FILE_TYPE
                                       ) RETURN BOOLEAN IS

      recProject T_PROJECT%ROWTYPE;

      CURSOR curProject(
        numProjectStat4         IN  NUMBER,
        numProjectStat9         IN  NUMBER,
        numOdrFlg1              IN  NUMBER,
        numDelFlg               IN  NUMBER,
        dtTergetDate            IN  DATE
      ) IS
         SELECT * FROM T_PROJECT TP
         WHERE
              TP.DEL_FLG = numDelFlg
              OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                  AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate)
              OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                  AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                  AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < dtTergetDate);

    BEGIN
      OPEN curProject(pnumProjectStat4,pnumProjectStat9,pnumOdrFlg1,pnumDelFlg,pdtTergetDate);
      FETCH curProject
        INTO recProject;

      WHILE curProject%FOUND LOOP

        UTL_FILE.PUT(pfHandl, recProject.PROJECT_CD || ',');          --案件番号
        UTL_FILE.PUT(pfHandl, recProject.PROJECT_NAME || ',');        --案件名
        UTL_FILE.PUT(pfHandl, recProject.CUST_CD || ',');             --得意先コード
        UTL_FILE.PUT(pfHandl, recProject.PROJECT_STAT || ',');        --案件ステータス
        UTL_FILE.PUT(pfHandl, recProject.ACCURACY || ',');            --確度
        UTL_FILE.PUT(pfHandl, recProject.VEND_DATE || ',');           --引合日
        UTL_FILE.PUT(pfHandl, recProject.ASSUME_DLV_DATE || ',');     --想定納期
        UTL_FILE.PUT(pfHandl, recProject.ASSUME_AMOUNT || ',');       --引合想定金額
        UTL_FILE.PUT(pfHandl, recProject.ASSUME_AMOUNT_EXCH_RATES || ','); --引合想定金額(邦貨)
        UTL_FILE.PUT(pfHandl, recProject.DLV_LOC_CD || ',');          --納品場所コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_ORG_CD || ',');           --案件担当部門コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_USER_CD || ',');          --案件担当者コード
        UTL_FILE.PUT(pfHandl, recProject.REMARKS1 || ',');            --備考1
        UTL_FILE.PUT(pfHandl, recProject.REMARKS2 || ',');            --備考2
        UTL_FILE.PUT(pfHandl, recProject.REMARKS3 || ',');            --備考3
        UTL_FILE.PUT(pfHandl, recProject.REMARKS4 || ',');            --備考4
        UTL_FILE.PUT(pfHandl, recProject.REMARKS5 || ',');            --備考5
        UTL_FILE.PUT(pfHandl, recProject.OD_COMP_FLG || ',');         --予算積上完了フラグ
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_01_TYP || ',');     --案件分類01
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_01_CD || ',');      --案件分類01コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_01_NAME || ',');    --案件分類01名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_02_TYP || ',');     --案件分類02
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_02_CD || ',');      --案件分類02コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_02_NAME || ',');    --案件分類02名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_03_TYP || ',');     --案件分類03
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_03_CD || ',');      --案件分類03コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_03_NAME || ',');    --案件分類03名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_04_TYP || ',');     --案件分類04
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_04_CD || ',');      --案件分類04コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_04_NAME || ',');    --案件分類04名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_05_TYP || ',');     --案件分類05
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_05_CD || ',');      --案件分類05コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_05_NAME || ',');    --案件分類05名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_06_TYP || ',');     --案件分類06
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_06_CD || ',');      --案件分類06コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_06_NAME || ',');    --案件分類06名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_07_TYP || ',');     --案件分類07
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_07_CD || ',');      --案件分類07コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_07_NAME || ',');    --案件分類07名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_08_TYP || ',');     --案件分類08
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_08_CD || ',');      --案件分類08コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_08_NAME || ',');    --案件分類08名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_09_TYP || ',');     --案件分類09
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_09_CD || ',');      --案件分類09コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_09_NAME || ',');    --案件分類09名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_10_TYP || ',');     --案件分類10
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_10_CD || ',');      --案件分類10コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_10_NAME || ',');    --案件分類10名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_11_TYP || ',');     --案件分類11
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_11_CD || ',');      --案件分類11コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_11_NAME || ',');    --案件分類11名称
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_12_TYP || ',');     --案件分類12
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_12_CD || ',');      --案件分類12コード
        UTL_FILE.PUT(pfHandl, recProject.PJ_CLASS_12_NAME || ',');    --案件分類12名称
        UTL_FILE.PUT(pfHandl, recProject.DEL_FLG || ',');             --削除フラグ
        UTL_FILE.PUT(pfHandl, recProject.CREATED_DATE || ',');        --作成日
        UTL_FILE.PUT(pfHandl, recProject.CREATED_BY || ',');          --作成者
        UTL_FILE.PUT(pfHandl, recProject.CREATED_PRG_NM || ',');      --作成プログラム名
        UTL_FILE.PUT(pfHandl, recProject.UPDATED_DATE || ',');        --更新日
        UTL_FILE.PUT(pfHandl, recProject.UPDATED_BY || ',');          --更新者
        UTL_FILE.PUT(pfHandl, recProject.UPDATED_PRG_NM || ',');      --更新プログラム名
        UTL_FILE.PUT_LINE(pfHandl, recProject.MODIFY_COUNT || ',');        --更新数



        FETCH curProject
          INTO recProject;

      END LOOP;

      RETURN TRUE;
    EXCEPTION
      WHEN OTHERS THEN
        RETURN FALSE;

    END SubFncProjectCsvWrite;

    --Add Anken End   20140423 shang-j




BEGIN
    /* LogFile の OPEN */
    blnRet := FncLogOpen(pvc2OutputPath, pvc2OutputName, pvc2PlantCd, pvc2OutputMode, UTL_FileHandle);
    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_START);

    /* バッチの開始メッセージ */
    vc2Comment := '(SBM0526)◆◆◆データ削除処理開始◆◆◆';
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_START, vc2Comment);

    COMMIT;

    /*====================================================================================================*/
    /*  CSVファイルの出力パスを取得　                                                                          */
    /*====================================================================================================*/
    BEGIN
       SELECT VALUE
         INTO CSV_FilePath
         FROM SYS_PARAMETER
       WHERE NAME = 'SALES_DELETE_CSV_PATH';
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
            RAISE excGET_CSV_PATH_ERR;
    END;
    IF(CSV_FilePath IS NULL OR CSV_FilePath='') THEN
            RAISE excGET_CSV_PATH_ERR;
    END IF;

    /*====================================================================================================*/
    /*  データ保存月数取得                                                                                */
    /*====================================================================================================*/

    -- 販売所要計画の保持期間を取得する
    BEGIN
      SELECT MNT_PERIOD
        INTO numSalesPlanterm
        FROM SYS_MNT_PERIOD
       WHERE MNT_DATA_TYP = numSalesPlantyp
             AND PLANT_CD = pvc2PlantCd;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
            RAISE excGET_DEL_DATE_ERR;
    END;

    -- 販売所要計画の保持期間がNULLの場合
    IF numSalesPlanterm IS NULL THEN
            RAISE excGET_DEL_DATE_ERR;
    END IF;

    -- 販売所要計画の保存期間が0の場合は1へ(当月は含めない)
    IF numSalesPlanterm <= 0 THEN
        numSalesPlanterm := 1;
    END IF;


    -- 受注情報の保持期間を取得する
    BEGIN
      SELECT MNT_PERIOD
        INTO numOdrterm
        FROM SYS_MNT_PERIOD
       WHERE MNT_DATA_TYP = numOdrtyp
             AND PLANT_CD = pvc2PlantCd;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
            RAISE excGET_DEL_DATE_ERR;
    END;

    -- 受注情報の保持期間がNULLの場合
    IF numOdrterm IS NULL THEN
            RAISE excGET_DEL_DATE_ERR;
    END IF;

    -- 受注情報の保存期間が0の場合は1へ(当月は含めない)
    IF numOdrterm <= 0 THEN
        numOdrterm := 1;
    END IF;

    -- その他売上実績の保持期間を取得する
    BEGIN
      SELECT MNT_PERIOD
        INTO numSalesterm
        FROM SYS_MNT_PERIOD
       WHERE MNT_DATA_TYP = numSaletyp
             AND PLANT_CD = pvc2PlantCd;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
            RAISE excGET_DEL_DATE_ERR;
    END;

    -- その他売上実績の保持期間がNULLの場合
    IF numSalesterm IS NULL THEN
            RAISE excGET_DEL_DATE_ERR;
    END IF;

    -- その他売上実績の保存期間が0の場合は1へ(当月は含めない)
    IF numSalesterm <= 0 THEN
        numSalesterm := 1;
    END IF;


    -- EDI情報の保持期間を取得する
    BEGIN
      SELECT MNT_PERIOD
        INTO numEditerm
        FROM SYS_MNT_PERIOD
       WHERE MNT_DATA_TYP = numEdityp
             AND PLANT_CD = pvc2PlantCd;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
            RAISE excGET_DEL_DATE_ERR;
    END;

    -- EDI情報の保持期間がNULLの場合
    IF numEditerm IS NULL THEN
            RAISE excGET_DEL_DATE_ERR;
    END IF;

    -- EDI情報の保存期間が0の場合は1へ(当月は含めない)
    IF numEditerm <= 0 THEN
        numEditerm := 1;
    END IF;

    dtmYearMonth := TO_DATE(pnumYearMonth, 'YYYYMM');

    -- 最終削除年月度の算出(販売所要計画)
    numSalesPlanDate := TO_NUMBER(TO_CHAR(ADD_MONTHS(dtmYearMonth, -1 * numSalesPlanterm), 'YYYYMM'));

    -- 最終削除年月度の算出(受注情報)
    numOdrDate := TO_NUMBER(TO_CHAR(ADD_MONTHS(dtmYearMonth, -1 * numOdrterm), 'YYYYMM'));

   -- 最終削除年月度の算出(その他売上実績)
    numSalesDate := TO_NUMBER(TO_CHAR(ADD_MONTHS(dtmYearMonth, -1 * numSalesterm), 'YYYYMM'));

   -- 最終削除年月度の算出(EDI情報)
    numEdiDate := TO_NUMBER(TO_CHAR(ADD_MONTHS(dtmYearMonth, -1 * numEditerm), 'YYYYMM'));

    /*====================================================================================================*/
    /*  販売所要計画削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/
     fCsvSalesPlan := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSalesPlanName || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncSalesPlanCsvWrite(pvc2CompanyCd,  TO_DATE(numSalesPlanDate, 'YYYYMM'), fCsvSalesPlan);
     UTL_FILE.FCLOSE(fCsvSalesPlan);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  販売所要計画削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START1);


    -- 販売所要計画削除
    DELETE   FROM T_SALES_PLAN
      WHERE EXISTS
            (SELECT * FROM T_SALES_PLAN SP
              WHERE SP.COMPANY_CD    = pvc2CompanyCd
                AND TO_DATE(TO_NUMBER(TO_CHAR(SP.PLN_END_DATE,'YYYYMM')),'YYYYMM') <= TO_DATE(numSalesPlanDate,'YYYYMM')
            );
    numDelCntSalesPlan := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0787)'||LOGMSG_BATCH_END1 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntSalesPlan);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*  受注履歴削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvOdrAcptRslt := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvOdrAcptRslt || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncOdrAcptRsltCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvOdrAcptRslt);
     UTL_FILE.FCLOSE(fCsvOdrAcptRslt);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*  受注履歴削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START4);


    -- 受注履歴削除
    DELETE   FROM T_ODR_ACPT_RSLT ODRAR
      WHERE EXISTS
            (SELECT * FROM  T_ODR ODR
              WHERE  ODRAR.ODR_NO = ODR.ODR_NO
                    AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)        -- 注文区分が1の場合
                    OR (ODR.ODR_TYP = numOdrTyp1
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                        OR (ODR.ODR_TYP = numOdrTyp2
                          AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                      OR (ODR.ODR_TYP = numOdrTyp3
                          AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))))
              );

    numDelCntOdrAcptRslt := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0791)'||LOGMSG_BATCH_END4 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntOdrAcptRslt);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*  内示_確定注文取崩履歴削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvAllocFixedOdrRslt := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvAllocFixedOdrRslt || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncAllocFixedORCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvAllocFixedOdrRslt);
     UTL_FILE.FCLOSE(fCsvAllocFixedOdrRslt);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*  内示_確定注文取崩履歴削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START5);


    -- 内示_確定注文取崩履歴削除
    DELETE   FROM T_ALLOC_FIXED_ODR_RSLT AFOR
      WHERE EXISTS
            (SELECT * FROM  T_ODR ODR
              WHERE  AFOR.FIXED_ODR_NO = ODR.ODR_NO
                    AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)        -- 注文区分が1の場合
                    OR (ODR.ODR_TYP = numOdrTyp1
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                        OR (ODR.ODR_TYP = numOdrTyp2
                          AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                      OR (ODR.ODR_TYP = numOdrTyp3
                          AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))))
              );

    numDelCntAllocFixedOdrRslt := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0793)'||LOGMSG_BATCH_END5 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntAllocFixedOdrRslt);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*  出荷計画削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvAnsDlvDate := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvAnsDlvDate || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncAnsDlvDateCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvAnsDlvDate);

     UTL_FILE.FCLOSE(fCsvAnsDlvDate);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*  出荷計画削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START6);


   -- 出荷計画削除
   DELETE   FROM T_ANS_DLV_DATE AD
      WHERE AD.DEL_FLG = numDelFlg OR
            EXISTS
            (SELECT * FROM  T_ODR ODR
              WHERE  AD.ODR_NO = ODR.ODR_NO
                    AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)        -- 注文区分が1の場合
                    OR (ODR.ODR_TYP = numOdrTyp1
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                        OR (ODR.ODR_TYP = numOdrTyp2
                          AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                      OR (ODR.ODR_TYP = numOdrTyp3
                          AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))))
              );

    numDelCntAnsDlvDate := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0795)'||LOGMSG_BATCH_END6 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntAnsDlvDate);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);





    /*====================================================================================================*/
    /*  売上実績削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvSales := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSales || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncSalesCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),numStatus,numSalestyp,TO_DATE(numSalesDate, 'YYYYMM'),fCsvSales);
     UTL_FILE.FCLOSE(fCsvSales);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*  売上実績削除                                                                 　          　　　　  */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START8);


   -- 売上実績削除
   DELETE   FROM T_SALES SALES
       WHERE (SALES.SALES_TYP = numSalestyp
                     AND SALES.STATUS = numStatus
                     AND TO_DATE(TO_NUMBER(TO_CHAR(SALES.SALES_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numSalesDate, 'YYYYMM'))
                 OR
          EXISTS ( SELECT * FROM T_ODR ODR,T_SHIP_ODR SHIPODR
          WHERE SHIPODR.ODR_NO = ODR.ODR_NO AND SALES.SLIP_CD = SHIPODR.SLIP_CD
                AND SALES.STATUS = numStatus                                           -- "状態区分" = "20：売掛計上予定"
                AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)          -- 注文区分が1の場合
                  OR (ODR.ODR_TYP = numOdrTyp1
                        AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                  OR
                  ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                      OR (ODR.ODR_TYP = numOdrTyp2
                        AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                        AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                  OR
                  ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                    OR (ODR.ODR_TYP = numOdrTyp3
                        AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                        AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))))

                  OR
           EXISTS ( SELECT * FROM T_ODR_UNSTOCK ODRUN
           WHERE SALES.SLIP_CD = ODRUN.SLIP_CD
                 AND SALES.STATUS = numStatus
                 AND (ODRUN.DEL_FLG = numDelFlg
                      OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

    numDelCntSales := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0799)'||LOGMSG_BATCH_END8 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntSales);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*  出荷伝票データ削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvShipSlip := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvShipSlip || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncShipSlipCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvShipSlip);
     UTL_FILE.FCLOSE(fCsvShipSlip);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*  出荷伝票データ削除                                                                 　          　　　　  */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START7);


   -- 出荷伝票データ削除
   DELETE   FROM T_SHIP_SLIP SS
             WHERE  SS.DEL_FLG = numDelFlg OR
                EXISTS ( SELECT * FROM T_ODR ODR,T_SHIP_ODR SHIPODR
                WHERE SHIPODR.ODR_NO = ODR.ODR_NO AND SS.SLIP_CD = SHIPODR.SLIP_CD
                      AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が1の場合
                        OR (ODR.ODR_TYP = numOdrTyp1
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                            OR (ODR.ODR_TYP = numOdrTyp2
                              AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                        OR
                        ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                          OR (ODR.ODR_TYP = numOdrTyp3
                              AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                              AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))));


    numDelCntShipSlip := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0797)'||LOGMSG_BATCH_END7 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntShipOdr);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);



    /*====================================================================================================*/
    /*  出荷指示削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvShipOdr := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvShipOdr || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncShipOdrCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvShipOdr);

     UTL_FILE.FCLOSE(fCsvShipOdr);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*  出荷指示削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START9);


   -- 出荷指示削除
   DELETE   FROM T_SHIP_ODR SO
      WHERE SO.DEL_FLG = numDelFlg OR
            EXISTS
            (SELECT * FROM  T_ODR ODR
              WHERE  SO.ODR_NO = ODR.ODR_NO
                    AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)        -- 注文区分が1の場合
                    OR (ODR.ODR_TYP = numOdrTyp1
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                        OR (ODR.ODR_TYP = numOdrTyp2
                          AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                      OR (ODR.ODR_TYP = numOdrTyp3
                          AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))))
              );

    numDelCntShipOdr := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0801)'||LOGMSG_BATCH_END9 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntShipOdr);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*  出荷指示一時テーブル削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvShipT := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvShipT || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncShipTCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvShipT);

     UTL_FILE.FCLOSE(fCsvShipT);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  出荷指示一時テーブル削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START10);


   -- 出荷指示一時テーブル削除
   DELETE   FROM SHIP_T SHIPT
      WHERE EXISTS
            (SELECT * FROM  T_ODR ODR
              WHERE  SHIPT.ODR_NO = ODR.ODR_NO
                    AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)        -- 注文区分が1の場合
                    OR (ODR.ODR_TYP = numOdrTyp1
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                        OR (ODR.ODR_TYP = numOdrTyp2
                          AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                      OR (ODR.ODR_TYP = numOdrTyp3
                          AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))))
              );

    numDelCntShipT := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0803)'||LOGMSG_BATCH_END10 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntShipT);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*  出荷実績削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvShip := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvShip || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncShipCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvShip);

     UTL_FILE.FCLOSE(fCsvShip);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  出荷実績削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START11);


   -- 出荷実績削除
   DELETE   FROM T_SHIP SHIP
      WHERE SHIP.DEL_FLG = numDelFlg OR
            EXISTS
            (SELECT * FROM  T_ODR ODR
              WHERE  SHIP.ODR_NO = ODR.ODR_NO
                    AND (((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)        -- 注文区分が1の場合
                    OR (ODR.ODR_TYP = numOdrTyp1
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                        OR (ODR.ODR_TYP = numOdrTyp2
                          AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                      OR (ODR.ODR_TYP = numOdrTyp3
                          AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))))
              );

    numDelCntShip := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0805)'||LOGMSG_BATCH_END11 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntShipT);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    --Add Anken Start 20140423 shang-j
    /*====================================================================================================*/
    /*	役務実績削除対象データをCSVファイルへ出力                                                         */
    /*====================================================================================================*/

     fCsvService := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvService || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');
    --Upt Anken Start 20140515 shang-j
--     blnRet :=  SubFncServiceCsvWrite(numOdrTyp3,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvService);
      blnRet :=  SubFncServiceCsvWrite(numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvService);
    --Upt Anken End   20140515 shang-j
     UTL_FILE.FCLOSE(fCsvService);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	役務実績削除                                                                                      */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START22);


   -- 役務実績削除
   DELETE   FROM T_SERVICE SERVICE
       WHERE EXISTS
           --Upt Anken Start 20140515 shang-j
--             ( SELECT * FROM T_ODR ODR
--               WHERE SERVICE.ODR_NO = ODR.ODR_NO
--                     AND ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)
--                         OR (ODR.ODR_TYP = numOdrTyp3
--                             AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
--                             AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));
             (SELECT * FROM T_ODR_UNSTOCK ODRUN
              WHERE SERVICE.ODR_NO = ODRUN.ODR_NO
                    AND (ODRUN.DEL_FLG = numDelFlg
                         OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                             AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));
           --Upt Anken End   20140515 shang-j
    numDelCntService := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1284)'||LOGMSG_BATCH_END22 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntService);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*	役務実績履歴削除対象データをCSVファイルへ出力                                                     */
    /*====================================================================================================*/

     fCsvHsService := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvHsService || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');
    --Upt Anken Start 20140515 shang-j
--     blnRet :=  SubFncHsServiceCsvWrite(numOdrTyp3,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvHsService);
     blnRet :=  SubFncHsServiceCsvWrite(numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvHsService);
    --Upt Anken End   20140515 shang-j
     UTL_FILE.FCLOSE(fCsvHsService);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	役務実績履歴削除                                                                                  */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START23);


   -- 役務実績履歴削除
   DELETE   FROM HS_T_SERVICE HSSERVICE
       WHERE EXISTS
           --Upt Anken Start 20140515 shang-j
--             ( SELECT * FROM T_ODR ODR
--               WHERE HSSERVICE.ODR_NO = ODR.ODR_NO
--                     AND ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)
--                         OR (ODR.ODR_TYP = numOdrTyp3
--                             AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
--                             AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));
               (SELECT * FROM T_ODR_UNSTOCK ODRUN
                WHERE HSSERVICE.ODR_NO = ODRUN.ODR_NO
                      AND (ODRUN.DEL_FLG = numDelFlg
                           OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                               AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

          --Upt Anken End   20140515 shang-j
    numDelCntHsService := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1296)'||LOGMSG_BATCH_END23 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntHsService);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*	見積明細更新                                                                                      */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START27);


   -- [見積明細]の受注有りフラグが0：受注無しに更新
    numCntEstimateDetalUpt := SubFncEstimateDetalUpdate(pvc2UserId, pvc2BusinessName,numOdrFlg0,numOdrFlg1,numOdrTyp3,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'));

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1292)'||LOGMSG_BATCH_END27 || LOGMSG_BATCH_UPDATE_CNT || TO_CHAR(numCntEstimateDetalUpt);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*	案件受注紐付削除対象データをCSVファイルへ出力                                                     */
    /*====================================================================================================*/

     fCsvPjOdrAlc := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvPjOdrAlc || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncPjOdrAlcCsvWrite(numOdrTyp3,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvPjOdrAlc);

     UTL_FILE.FCLOSE(fCsvPjOdrAlc);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	案件受注紐付削除                                                                                  */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START21);


   -- 案件受注紐付削除
   DELETE   FROM T_PJ_ODR_ALC
       WHERE EXISTS
             ( SELECT * FROM T_ODR ODR
               WHERE T_PJ_ODR_ALC.ODR_NO = ODR.ODR_NO
                     AND ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)
                         OR (ODR.ODR_TYP = numOdrTyp3
                             AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                             AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))))
    --Add Anken Start 20140515 shang-j
         OR EXISTS
             (SELECT * FROM T_ODR_UNSTOCK ODRUN
              WHERE T_PJ_ODR_ALC.ODR_NO = ODRUN.ODR_NO
                    AND (ODRUN.DEL_FLG = numDelFlg
                         OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                             AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));
    --Add Anken End   20140515 shang-j

    numDelCntPjOdrAlc := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1282)'||LOGMSG_BATCH_END21 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntPjOdrAlc);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);
    --Add Anken End   20140423 shang-j
    /*====================================================================================================*/
    /*  受注明細削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvOdr := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvOdrName || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W',32767);

     blnRet :=  SubFncOdrCsvWrite(numOdrTyp1,numOdrTyp2,numOdrTyp3,numRmainUnconfirmOdrQty,numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvOdr);

     UTL_FILE.FCLOSE(fCsvOdr);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  受注明細削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START2);


   -- 受注明細削除
   DELETE   FROM T_ODR ODR
      WHERE EXISTS
            (SELECT * FROM  T_ODR
                 WHERE  ((ODR.ODR_TYP = numOdrTyp1  AND ODR.DEL_FLG = numDelFlg)        -- 注文区分が1の場合
                    OR (ODR.ODR_TYP = numOdrTyp1
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_ACPT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp2  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が2の場合
                        OR (ODR.ODR_TYP = numOdrTyp2
                          AND ODR.REMAIN_UNCONFIRM_ODR_QTY = numRmainUnconfirmOdrQty
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')))
                    OR
                    ((ODR.ODR_TYP = numOdrTyp3  AND ODR.DEL_FLG = numDelFlg)            -- 注文区分が3の場合
                      OR (ODR.ODR_TYP = numOdrTyp3
                          AND ODR.ODR_CMPLT_FLG = numOdrCmpltFlg
                          AND TO_DATE(TO_NUMBER(TO_CHAR(ODR.ODR_CMPLT_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

    numDelCntOdr := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0789)'||LOGMSG_BATCH_END2 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntOdr);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*  受注管理削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/
    
    fCsvOdrCtl := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvOdrCtlName || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');
    
    blnRet :=  SubFncOdrCtlCsvWrite(fCsvOdrCtl);
    UTL_FILE.FCLOSE(fCsvOdrCtl);
    IF blnRet = FALSE THEN
         RAISE excFNC_CSVPUT_ERR;
    END IF;
    /*====================================================================================================*/
    /*  受注管理削除                                                                                */
    /*====================================================================================================*/
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START3);
    
    
    --受注管理削除
    DELETE  FROM T_ODR_CTL ODRCTL
      WHERE EXISTS 
            (SELECT * FROM T_ODR_CTL  
                WHERE NOT EXISTS 
                   (SELECT ODR.ODR_CTL_NO 
                    FROM T_ODR ODR 
                    WHERE ODRCTL.ODR_CTL_NO = ODR.ODR_CTL_NO
                    GROUP BY ODR.ODR_CTL_NO)
            );
    
    numOdrCtl := SQL%ROWCOUNT;  -- 削除件数取得
    
    COMMIT;
    
    -- 終了TraceLog の出力
    vc2Comment := '(SBM1301)'||LOGMSG_BATCH_END3 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numOdrCtl);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    --ADD Start 20140331 jian-b
    /*====================================================================================================*/
    /*  非在庫受注履歴削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvHsTOdrUnstock := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvHsTOdrUnstock || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncHsTOdrUnstockCsvWrite(numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvHsTOdrUnstock);
     UTL_FILE.FCLOSE(fCsvHsTOdrUnstock);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*  非在庫受注履歴削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START18);


    -- 非在庫受注履歴削除
     DELETE FROM HS_T_ODR_UNSTOCK HSODRUN
      WHERE EXISTS
            (SELECT * FROM T_ODR_UNSTOCK ODRUN
              WHERE HSODRUN.ODR_NO = ODRUN.ODR_NO
                    AND (ODRUN.DEL_FLG = numDelFlg
                        OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                            AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

    numDelCntHsTOdrUnstock := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1276)'||LOGMSG_BATCH_END18 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntHsTOdrUnstock);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*  非在庫受注削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvTOdrUnstock := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvTOdrUnstock || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W',32767);

     blnRet :=  SubFncTOdrUnstockCsvWrite(numOdrCmpltFlg,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvTOdrUnstock);

     UTL_FILE.FCLOSE(fCsvTOdrUnstock);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  非在庫受注削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START19);


   -- 非在庫受注削除
   DELETE   FROM T_ODR_UNSTOCK ODRUN
      WHERE EXISTS
            (SELECT * FROM  T_ODR_UNSTOCK
                 WHERE ODRUN.DEL_FLG = numDelFlg
                       OR (ODRUN.ODR_CMPLT_FLG = numOdrCmpltFlg
                           AND TO_DATE(TO_NUMBER(TO_CHAR(ODRUN.ODR_CMPLT_DATE, 'YYYYMM')), 'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM')));

    numDelCntTOdrUnstock := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1278)'||LOGMSG_BATCH_END19 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntTOdrUnstock);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

   --ADD End 20140331 jian-b
    /*====================================================================================================*/
    /*  販売所要計画情報IF削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvSalesplnIf := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvSalesplnIf || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W',32767);

     blnRet :=  FncSalesplnIFCsvWrite(numDelFlg,numSystemProcTyp,TO_DATE(numEdiDate, 'YYYYMM'),fCsvSalesplnIf);

     UTL_FILE.FCLOSE(fCsvSalesplnIf);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  販売所要計画情報IF削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START13);


   -- 販売所要計画情報削除
   DELETE   FROM T_SALESPLN_IF SI
            WHERE   SI.DEL_FLG = numDelFlg
                 OR (SI.SYSTEM_PROC_TYP <> numSystemProcTyp
                     AND TO_DATE(TO_NUMBER(TO_CHAR(SI.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numEdiDate, 'YYYYMM'));


    numDelCntSalesplnIf := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0807)'||LOGMSG_BATCH_END13 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntSalesplnIf);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);





    /*====================================================================================================*/
    /*  注文情報IF削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvOdrInfoEdiIf := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvOdrInfoEdiIf || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W',32767);

     blnRet :=  SubFncOdrInfoEdiIfCsvWrite(numDelFlg,numSystemProcTyp,TO_DATE(numEdiDate, 'YYYYMM'),fCsvOdrInfoEdiIf);

     UTL_FILE.FCLOSE(fCsvOdrInfoEdiIf);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  注文情報IF削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START14);


   -- 注文情報IF削除
   DELETE   FROM T_ODR_INFO_Edi_IF OIEI
            WHERE OIEI.DEL_FLG = numDelFlg
                 OR (OIEI.SYSTEM_PROC_TYP <> numSystemProcTyp
                     AND TO_DATE(TO_NUMBER(TO_CHAR(OIEI.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numEdiDate, 'YYYYMM'));


    numDelCntOdrInfoEdiIf := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0809)'||LOGMSG_BATCH_END14 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntOdrInfoEdiIf);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*  受注情報共通IF削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvOdrInfoComIf := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvOdrInfoComIf || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W',32767);

     blnRet :=  SubFncOdrInfoComIfCsvWrite(numDelFlg,numSystemProcTyp,TO_DATE(numEdiDate, 'YYYYMM'),fCsvOdrInfoComIf);

     UTL_FILE.FCLOSE(fCsvOdrInfoComIf);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  受注情報共通IF削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START15);


   -- 受注情報共通IF削除
   DELETE   FROM T_ODR_INFO_COM_IF OICI
            WHERE OICI.DEL_FLG = numDelFlg
                 OR (OICI.SYSTEM_PROC_TYP <> numSystemProcTyp
                     AND TO_DATE(TO_NUMBER(TO_CHAR(OICI.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numEdiDate, 'YYYYMM'));


    numDelCntOdrInfoComIf := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0811)'||LOGMSG_BATCH_END15 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntOdrInfoComIf);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*  検収情報削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvInspcAcptInfoIf := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvInspcAcptInfoIf || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W',32767);

     blnRet :=  SubFncInspcAcptInfoIfCsvWrite(numDelFlg,numSystemProcTyp,TO_DATE(numEdiDate, 'YYYYMM'),fCsvInspcAcptInfoIf);

     UTL_FILE.FCLOSE(fCsvInspcAcptInfoIf);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  検収情報削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START16);


   -- 検収情報削除
   DELETE   FROM T_INSPC_ACPT_INFO_IF IAII
            WHERE IAII.DEL_FLG = numDelFlg
                 OR (IAII.SYSTEM_PROC_TYP <> numSystemProcTyp
                     AND TO_DATE(TO_NUMBER(TO_CHAR(IAII.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numEdiDate, 'YYYYMM'));


    numDelCntInspcAcptInfo := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0813)'||LOGMSG_BATCH_END16 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntInspcAcptInfo);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);



    /*====================================================================================================*/
    /*  エラー警告削除対象データをCSVファイルへ出力　　　                                                              */
    /*====================================================================================================*/

     fCsvErrWngLst := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvErrWngLst || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W',32767);

     blnRet :=  SubFncErrWngLstCsvWrite(numDelFlg,TO_DATE(numEdiDate, 'YYYYMM'),fCsvErrWngLst);

     UTL_FILE.FCLOSE(fCsvErrWngLst);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;

    /*====================================================================================================*/
    /*  エラー警告削除                                                                                */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START17);


   -- エラー警告削除
   DELETE   FROM T_ERR_WNG_LST EWL
            WHERE EWL.DEL_FLG = numDelFlg
               OR  TO_DATE(TO_NUMBER(TO_CHAR(EWL.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numEdiDate, 'YYYYMM');


    numDelCntErrWngLst:= SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM0815)'||LOGMSG_BATCH_END17 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntErrWngLst);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    --Add Anken Start 20140423 shang-j
    /*====================================================================================================*/
    /*	 見積削除対象データをCSVファイルへ出力                                                            */
    /*====================================================================================================*/

     fCsvEstimate := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvEstimate || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncEstimateCsvWrite(numProjectStat4,numProjectStat9,numOdrFlg1,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvEstimate);

     UTL_FILE.FCLOSE(fCsvEstimate);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	 見積削除                                                                                         */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START29);


   --  見積削除
   DELETE   FROM T_ESTIMATE
      WHERE EXISTS
            ( SELECT * FROM T_PROJECT TP
              WHERE T_ESTIMATE.PROJECT_CD = TP.PROJECT_CD
                    AND (TP.DEL_FLG = numDelFlg
                        OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))
                        OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                            AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

   numDelCntEstimate := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1278)'||LOGMSG_BATCH_END29 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntEstimate);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);



    /*====================================================================================================*/
    /*	 案件予算進捗削除対象データをCSVファイルへ出力                                                    */
    /*====================================================================================================*/

     fCsvPjCost := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvPjCost || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncPjCostCsvWrite(numProjectStat4,numProjectStat9,numOdrFlg1,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvPjCost);

     UTL_FILE.FCLOSE(fCsvPjCost);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	 案件予算進捗削除                                                                                 */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START24);


   --  案件予算進捗削除
   DELETE   FROM T_PJ_COST
      WHERE EXISTS
            ( SELECT * FROM T_PROJECT TP
              WHERE T_PJ_COST.PROJECT_CD = TP.PROJECT_CD
                    AND (TP.DEL_FLG = numDelFlg
                        OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))
                        OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                            AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

   numDelCntPjCost := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1286)'||LOGMSG_BATCH_END24 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntPjCost);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*	 案件予算積上明細削除対象データをCSVファイルへ出力                                                */
    /*====================================================================================================*/

     fCsvPjBudgetDetail := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvPjBudgetDetail || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncPjBudgetDetailCsvWrite(numProjectStat4,numProjectStat9,numOdrFlg1,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvPjBudgetDetail);

     UTL_FILE.FCLOSE(fCsvPjBudgetDetail);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	 案件予算積上明細削除                                                                             */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START26);


   --  案件予算積上明細削除
   DELETE   FROM T_PJ_BUDGET_DETAIL
      WHERE EXISTS
            ( SELECT * FROM T_PROJECT TP
              WHERE T_PJ_BUDGET_DETAIL.PROJECT_CD = TP.PROJECT_CD
                    AND (TP.DEL_FLG = numDelFlg
                        OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))
                        OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                            AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

   numDelCntPjBudgetDetail := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1290)'||LOGMSG_BATCH_END26 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntPjBudgetDetail);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);


    /*====================================================================================================*/
    /*	 案件予算積上げエラー削除対象データをCSVファイルへ出力                                            */
    /*====================================================================================================*/

     fCsvPjBudgetError := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvPjBudgetError || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncPjBudgetErrorCsvWrite(numProjectStat4,numProjectStat9,numOdrFlg1,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvPjBudgetError);

     UTL_FILE.FCLOSE(fCsvPjBudgetError);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	 案件予算積上げエラー削除                                                                         */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START25);


   --  案件予算積上げエラー削除
   DELETE   FROM T_PJ_BUDGET_ERROR
      WHERE EXISTS
            ( SELECT * FROM T_PROJECT TP
              WHERE T_PJ_BUDGET_ERROR.PROJECT_CD = TP.PROJECT_CD
                    AND (TP.DEL_FLG = numDelFlg
                        OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))
                        OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                            AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

   numDelCntPjBudgetError := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1288)'||LOGMSG_BATCH_END25 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntPjBudgetError);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*	 見積明細削除対象データをCSVファイルへ出力                                                        */
    /*====================================================================================================*/

     fCsvEstimateDetal := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvEstimateDetal || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncEstimateDetalCsvWrite(numProjectStat4,numProjectStat9,numOdrFlg1,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvEstimateDetal);

     UTL_FILE.FCLOSE(fCsvEstimateDetal);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	 見積明細削除                                                                                     */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START20);


   --  見積明細削除
   DELETE   FROM T_ESTIMATE_DETAL
      WHERE EXISTS
            ( SELECT * FROM T_PROJECT TP
              WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD
                    AND (TP.DEL_FLG = numDelFlg
                        OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))
                        OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                            AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                            AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))));

   numDelCntEstimateDetal := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1280)'||LOGMSG_BATCH_END20 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntEstimateDetal);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    /*====================================================================================================*/
    /*	 案件削除対象データをCSVファイルへ出力                                                            */
    /*====================================================================================================*/

     fCsvProject := UTL_FILE.FOPEN(CSV_FilePath, pvc2PlantCd || '_' || vc2CsvProject || TO_CHAR(dtmYearMonth,'YYYYMM') || '.csv','W');

     blnRet :=  SubFncProjectCsvWrite(numProjectStat4,numProjectStat9,numOdrFlg1,numDelFlg,TO_DATE(numOdrDate, 'YYYYMM'),fCsvProject);

     UTL_FILE.FCLOSE(fCsvProject);
     IF blnRet = FALSE THEN
          RAISE excFNC_CSVPUT_ERR;
     END IF;
    /*====================================================================================================*/
    /*	 案件削除                                                                                         */
    /*====================================================================================================*/
    -- 開始TraceLog の出力
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                             pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                             MY_SQL_NAME, LOGMSG_BATCH_START28);


   --  案件削除
   DELETE   FROM T_PROJECT TP
       WHERE
            TP.DEL_FLG = numDelFlg
            OR (TP.PROJECT_STAT NOT IN (numProjectStat4,numProjectStat9)
                AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'))
            OR (TP.PROJECT_STAT IN (numProjectStat4,numProjectStat9)
                AND NOT EXISTS(SELECT * FROM T_ESTIMATE_DETAL WHERE T_ESTIMATE_DETAL.PROJECT_CD = TP.PROJECT_CD AND T_ESTIMATE_DETAL.ODR_FLG = numOdrFlg1)
                AND TO_DATE(TO_NUMBER(TO_CHAR(TP.UPDATED_DATE,'YYYYMM')),'YYYYMM') < TO_DATE(numOdrDate, 'YYYYMM'));

   numDelCntProject := SQL%ROWCOUNT;  -- 削除件数取得

    COMMIT;

    -- 終了TraceLog の出力
    vc2Comment := '(SBM1276)'||LOGMSG_BATCH_END28 || LOGMSG_BATCH_DELETE_CNT || TO_CHAR(numDelCntProject);
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, vc2Comment);

    --Add Anken End   20140423 shang-j
    /********************************************************************************************************************/
    /* 処理件数MessageLog の出力 */
    vc2Comment := '(SBM0578)' || LOGMSG_CNTMSG_SALESPLAN  || TO_CHAR(numDelCntSalesPlan)    ||
                  LOGMSG_CNTMSG_ODRCTL  || TO_CHAR(numOdrCtl)    ||
                  LOGMSG_CNTMSG_ODR  || TO_CHAR(numDelCntOdr)    ||
                  LOGMSG_CNTMSG_ODRACPTRSLT  || TO_CHAR(numDelCntOdrAcptRslt)    ||
                  --ADD Start 20140331 jian-b
                  LOGMSG_CNTMSG_TODRUNSTOCK  || TO_CHAR(numDelCntTOdrUnstock)    ||
                  LOGMSG_CNTMSG_HSTODRUNSTOCK  || TO_CHAR(numDelCntHsTOdrUnstock)    ||
                  --ADD End 20140331 jian-b
                  LOGMSG_CNTMSG_ALLOCFOR  || TO_CHAR(numDelCntAllocFixedOdrRslt)    ||
                  LOGMSG_CNTMSG_ANSDLVDATE  || TO_CHAR(numDelCntAnsDlvDate)    ||
                  LOGMSG_CNTMSG_SHIPSLIP  || TO_CHAR(numDelCntShipSlip)    ||
                  LOGMSG_CNTMSG_SALES  || TO_CHAR(numDelCntSales)    ||
                  LOGMSG_CNTMSG_SHIPODR  || TO_CHAR(numDelCntShipOdr)    ||
                  LOGMSG_CNTMSG_SHIPT  || TO_CHAR(numDelCntShipT)    ||
                  LOGMSG_CNTMSG_SHIP  || TO_CHAR(numDelCntShip)    ||
                  LOGMSG_CNTMSG_UNSHIPLIST  || TO_CHAR(numDelCntUnShipList)    ||
                  LOGMSG_CNTMSG_SALESPLNIF  || TO_CHAR(numDelCntSalesplnIf)    ||
                  LOGMSG_CNTMSG_ODRINFOEDIIF  || TO_CHAR(numDelCntOdrInfoEdiIf)    ||
                  LOGMSG_CNTMSG_ODRINFOCOMIF  || TO_CHAR(numDelCntOdrInfoComIf)    ||
                  LOGMSG_CNTMSG_INSPCACPTINFOIF  || TO_CHAR(numDelCntInspcAcptInfo)    ||
                  LOGMSG_CNTMSG_ERRWNGLST  || TO_CHAR(numDelCntErrWngLst)    ||
                  --Add Anken Start 20140423 shang-j
                  LOGMSG_CNTMSG_PJODRALC  || TO_CHAR(numDelCntPjOdrAlc)    ||
                  LOGMSG_CNTMSG_SERVICE  || TO_CHAR(numDelCntService)    ||
                  LOGMSG_CNTMSG_HSSERVICE  || TO_CHAR(numDelCntHsService)    ||
                  LOGMSG_CNTMSG_ESTIMATEDETALUPT  || TO_CHAR(numCntEstimateDetalUpt)    ||
                  LOGMSG_CNTMSG_ESTIMATE  || TO_CHAR(numDelCntEstimate)    ||
                  LOGMSG_CNTMSG_PJCOST  || TO_CHAR(numDelCntPjCost)    ||
                  LOGMSG_CNTMSG_PJBUDGETDETAIL  || TO_CHAR(numDelCntPjBudgetDetail)    ||
                  LOGMSG_CNTMSG_PJBUDGETERROR  || TO_CHAR(numDelCntPjBudgetError)    ||
                  LOGMSG_CNTMSG_ESTIMATEDETAL  || TO_CHAR(numDelCntEstimateDetal)    ||
                  LOGMSG_CNTMSG_PROJECT  || TO_CHAR(numDelCntProject)    ||
                  --Add Anken End   20140423 shang-j
                  LOGMSG_CNTMSG_END;
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_DATA_COUNT, vc2Comment);

     /*バッチの終了メッセージ  */
    vc2Comment := '(SBM0528)◆◆◆データ削除処理終了◆◆◆';
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);


    COMMIT;
    /* TraceLog の出力 */
    blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);
    /*  LogFile の CLOSE */
    blnRet := FncLogClose(UTL_FileHandle);
    RETURN;

--< 例外処理 >---------------------------------------------------------------------
EXCEPTION
    WHEN excGET_DEL_DATE_ERR    THEN    --「最終削除年月度算出」エラー
        ROLLBACK;
        /* 異常メッセージの出力 */
        vc2Comment := '(SBM0529)最終削除年月度算出エラー';
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, 'BZ00173', vc2Comment);
        vc2Comment := '(SBM0528)◆◆◆データ削除処理終了◆◆◆';
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        COMMIT;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                   MY_SQL_NAME, 'BZ00173', vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

   WHEN excGET_CSV_PATH_ERR    THEN    --「CSVファイル出力パス」を取得エラー
        ROLLBACK;
        /* 異常メッセージの出力 */
        vc2Comment := '(SBM0530)CSVファイル出力パスの取得エラー';
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, CVS_PATH_ERR, vc2Comment);
        vc2Comment := '(SBM0528)◆◆◆データ削除処理終了◆◆◆';
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        COMMIT;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                   MY_SQL_NAME, 'BZ00173', vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

   WHEN excFNC_CSVPUT_ERR    THEN    -- CSV出力エラーエラー
        ROLLBACK;
        /* 異常メッセージの出力 */
        vc2Comment := '(SBM0531)CSV出力エラー';
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, '？', vc2Comment);
        vc2Comment := '(SBM0528)◆◆◆データ削除処理終了◆◆◆';
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        COMMIT;
        /* ErrorLog の出力 */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                   pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                   MY_SQL_NAME, 'BZ00173', vc2Comment);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);

    WHEN OTHERS THEN                             -- その他のエラー
        ROLLBACK;
        /* 異常メッセージを待避 */
        vc2Comment := 'CODE=' || SQLCODE || SUBSTR(SQLERRM,1,1023);
        intSqlCode := 'BZ09900';
        /* 異常メッセージの出力 */
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                               MY_SQL_NAME, intSqlCode, vc2Comment);
        COMMIT;

        /* ErrorLog の出力 */
        blnRet := FncErrLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                               MY_SQL_NAME, intSqlCode, vc2Comment);
        /* 処理件数MessageLog の出力 */
    vc2Comment := '(SBM0578)' || LOGMSG_CNTMSG_SALESPLAN  || TO_CHAR(numDelCntSalesPlan)    ||
                  LOGMSG_CNTMSG_ODRCTL  || TO_CHAR(numOdrCtl)    ||
                  LOGMSG_CNTMSG_ODR  || TO_CHAR(numDelCntOdr)    ||
                  LOGMSG_CNTMSG_ODRACPTRSLT  || TO_CHAR(numDelCntOdrAcptRslt)    ||
                  --ADD Start 20140331 jian-b
                  LOGMSG_CNTMSG_TODRUNSTOCK  || TO_CHAR(numDelCntTOdrUnstock)    ||
                  LOGMSG_CNTMSG_HSTODRUNSTOCK  || TO_CHAR(numDelCntHsTOdrUnstock)    ||
                  --ADD End 20140331 jian-b
                  LOGMSG_CNTMSG_ALLOCFOR  || TO_CHAR(numDelCntAllocFixedOdrRslt)    ||
                  LOGMSG_CNTMSG_ANSDLVDATE  || TO_CHAR(numDelCntAnsDlvDate)    ||
                  LOGMSG_CNTMSG_SHIPSLIP  || TO_CHAR(numDelCntShipSlip)    ||
                  LOGMSG_CNTMSG_SALES  || TO_CHAR(numDelCntSales)    ||
                  LOGMSG_CNTMSG_SHIPODR  || TO_CHAR(numDelCntShipOdr)    ||
                  LOGMSG_CNTMSG_SHIPT  || TO_CHAR(numDelCntShipT)    ||
                  LOGMSG_CNTMSG_SHIP  || TO_CHAR(numDelCntShip)    ||
                  LOGMSG_CNTMSG_UNSHIPLIST  || TO_CHAR(numDelCntUnShipList)    ||
                  LOGMSG_CNTMSG_SALESPLNIF  || TO_CHAR(numDelCntSalesplnIf)    ||
                  LOGMSG_CNTMSG_ODRINFOEDIIF  || TO_CHAR(numDelCntOdrInfoEdiIf)    ||
                  LOGMSG_CNTMSG_ODRINFOCOMIF  || TO_CHAR(numDelCntOdrInfoComIf)    ||
                  LOGMSG_CNTMSG_INSPCACPTINFOIF  || TO_CHAR(numDelCntInspcAcptInfo)    ||
                  LOGMSG_CNTMSG_ERRWNGLST  || TO_CHAR(numDelCntErrWngLst)    ||
                  --Add Anken Start 20140423 shang-j
                  LOGMSG_CNTMSG_PJODRALC  || TO_CHAR(numDelCntPjOdrAlc)    ||
                  LOGMSG_CNTMSG_SERVICE  || TO_CHAR(numDelCntService)    ||
                  LOGMSG_CNTMSG_HSSERVICE  || TO_CHAR(numDelCntHsService)    ||
                  LOGMSG_CNTMSG_ESTIMATEDETALUPT  || TO_CHAR(numCntEstimateDetalUpt)    ||
                  LOGMSG_CNTMSG_ESTIMATE  || TO_CHAR(numDelCntEstimate)    ||
                  LOGMSG_CNTMSG_PJCOST  || TO_CHAR(numDelCntPjCost)    ||
                  LOGMSG_CNTMSG_PJBUDGETDETAIL  || TO_CHAR(numDelCntPjBudgetDetail)    ||
                  LOGMSG_CNTMSG_PJBUDGETERROR  || TO_CHAR(numDelCntPjBudgetError)    ||
                  LOGMSG_CNTMSG_ESTIMATEDETAL  || TO_CHAR(numDelCntEstimateDetal)    ||
                  LOGMSG_CNTMSG_PROJECT  || TO_CHAR(numDelCntProject)    ||
                  --Add Anken End   20140423 shang-j
                  LOGMSG_CNTMSG_END;
    blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_DATA_COUNT, vc2Comment);
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                               pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                               MY_SQL_NAME, APS_COM_DATA_COUNT, vc2Comment);

        /* バッチの終了メッセージ*/
        vc2Comment := '(SBM0528)◆◆◆データ削除処理終了◆◆◆';
        blnRet := FncMsgLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                        pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                        MY_SQL_NAME, APS_COM_BATCH_END, vc2Comment);

        COMMIT;

        /* TraceLog の出力 */
        blnRet := FncTraceLog(UTL_FileHandle, pvc2LogMode, pvc2OutputMode,
                                 pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                                 MY_SQL_NAME, LOGMSG_END);
        /* LogFile の CLOSE */
        blnRet := FncLogClose(UTL_FileHandle);
END;
/
