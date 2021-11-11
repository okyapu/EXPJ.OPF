CREATE OR REPLACE FUNCTION FNCGETNEWSLIPCD(
/*------------------------------------------------------------------------------
'
' version   : 1.00.00
'
' 修正履歴
' 2004.06.09 初版
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 伝票番号採番
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
'             pvc2ResultData       - (o)検索結果
'
' 機能説明  : 出荷伝票の伝票番号を採番する。
'
' 備考      : 伝票番号に登録されている番号とのチェックを行い、未登録の番号を返す。
'           : 採番桁数は制御テーブルに登録されている採番済番号長となるが、
'           : 未登録時（初回採番）はPKGCOMPARAM.SEQUENCE_LENGTHとする。
'
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ResultData      OUT VARCHAR2            --検索結果
) RETURN BOOLEAN
IS
PRAGMA AUTONOMOUS_TRANSACTION;

-- カーソルの宣言
    CURSOR curSYS_SLIP_CD_CTRL IS
    SELECT  SLIP_CD
    FROM    SYS_SLIP_CD_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE の宣言
    RtpSYS_SLIP_CD_CTRL     curSYS_SLIP_CD_CTRL%ROWTYPE;

-- Add Start 20140122 lt
    CURSOR curSYS_INSTALL_OPTIONS IS
    SELECT INSTALL_FLG
      FROM SYS_INSTALL_OPTIONS
     WHERE OPTION_ID = 'JA*'
       AND INSTALL_FLG = '1';

-- ROWTYPE の宣言
    RtpSYS_INSTALL_OPTIONS     curSYS_INSTALL_OPTIONS%ROWTYPE;
    
-- Add End 20140122 lt

/* 定数の宣言 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncGetNewSlipCd';                          --ＰＬ／ＳＱＬ名
    NUMBER_MAX              VARCHAR2(92)  := PKGCOMPARAM.NUMBER_MAX;       --取得カウントアップ用
    NUMBER_MIN              VARCHAR2(92)  := PKGCOMPARAM.NUMBER_MIN;       --取得カウントアップ用
    NUMBER_MAX_LENGTH       NUMBER        := PKGCOMPARAM.SEQUENCE_LENGTH;  --採番最大桁数
    PLANT_CD_LENGTH         NUMBER        := PKGCOMPARAM.PLANT_CD_LENGTH;  --工場コード桁数
    LOGMSG_START            VARCHAR2(20)   := 'Start';                      --ログ用メソッド開始宣言
    LOGMSG_END              VARCHAR2(12)   := 'End';                        --ログ用メソッド終了宣言

/* 変数の宣言 */
    blnRet                  BOOLEAN;             --返却値
    vc2SequenceNo           VARCHAR2(92);        --採番済み識別番号
    vc2SequenceNoPlant      VARCHAR2(100);        --工場コード＋識別番号
    -- Add Start 20140122 lt
    vc2Sql                  VARCHAR2(4096);      --動的ＳＱＬ用
    lintCur                 INTEGER;             --カーソルＩＤ
    lintRet                 INTEGER;             --関数戻り値
    -- Add End 20140122 lt
    numNowLength            NUMBER(2);           --採番桁数

/*計算用ワーク*/
    numSave                 NUMBER(25);
    intCount                INTEGER(11);
    intCount2               INTEGER(11);

/*エラー用ワーク*/
    vc2TmpMessage           VARCHAR2(1024);       --ＬＯＧメッセージ

BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    /* 採番レコード存在確認 */
    SELECT COUNT(*) INTO intCount2 FROM SYS_SLIP_CD_CTRL
    WHERE PLANT_CD = pvc2PlantCd;

    /* 採番レコードが無い場合、生成 */
    IF intCount2 <= 0 THEN
        vc2SequenceNo := NUMBER_MAX;
        numNowLength := NUMBER_MAX_LENGTH;
        insert into SYS_SLIP_CD_CTRL (
                    PLANT_CD
                   ,SLIP_CD
                   ,CREATED_DATE
                   ,CREATED_BY
                   ,CREATED_PRG_NM
                   ,UPDATED_DATE
                   ,UPDATED_BY
                   ,UPDATED_PRG_NM
                   ,MODIFY_COUNT
                    )values(
                    pvc2PlantCd
                   ,vc2SequenceNo
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,SYSDATE
                   ,pvc2UserId
                   ,pvc2BusinessName
                   ,0
                    );
    END IF;

    OPEN curSYS_SLIP_CD_CTRL;
    FETCH curSYS_SLIP_CD_CTRL INTO RtpSYS_SLIP_CD_CTRL;
    vc2SequenceNo := RtpSYS_SLIP_CD_CTRL.SLIP_CD;
    numNowLength := LENGTH(vc2SequenceNo);
    /*採番のカウントアップ*/
    IF vc2SequenceNo = SUBSTRB(NUMBER_MAX, numNowLength * (-1), numNowLength) THEN
        vc2SequenceNo := SUBSTRB(NUMBER_MIN, numNowLength * (-1), numNowLength);
    ELSE
        numSave := TO_NUMBER(vc2SequenceNo);
        numSave := numSave + 1;
        vc2SequenceNo := LPAD(TO_CHAR(numSave), numNowLength, '0');
    END IF;

    -- Add Start 20140122 lt
    OPEN curSYS_INSTALL_OPTIONS;
    FETCH curSYS_INSTALL_OPTIONS INTO RtpSYS_INSTALL_OPTIONS;
    CLOSE curSYS_INSTALL_OPTIONS;
    -- Add End 20140122 lt

    /*出荷伝票データの存在チェック*/
    LOOP

        /* 工場毎の番号体系へ変換 */
        vc2SequenceNoPlant := pvc2PlantCd || vc2SequenceNo;

        /* チェック実行 */
        SELECT COUNT(*) INTO intCount FROM T_SHIP_SLIP
            WHERE SLIP_CD = vc2SequenceNoPlant;

        -- Add Start 20140122 lt
        IF intCount <= 0 THEN
           lintCur := DBMS_SQL.OPEN_CURSOR;
           vc2Sql := 'SELECT COUNT(*) FROM ';
           IF RtpSYS_INSTALL_OPTIONS.INSTALL_FLG IS NULL THEN
               -- 売上実績
               vc2Sql := vc2Sql || 'T_SALES';
           ELSE
               -- 仮売上実績
               vc2Sql := vc2Sql || 'T_SALES_TEMP';
           END IF;
           vc2Sql := vc2Sql || ' WHERE SLIP_CD = ''' || vc2SequenceNoPlant || '''' ;
           
           DBMS_SQL.PARSE(lintCur,vc2Sql,DBMS_SQL.NATIVE);
           DBMS_SQL.DEFINE_COLUMN(lintCur, 1,intCount);
           lintRet := DBMS_SQL.EXECUTE(lintCur);
           
           IF DBMS_SQL.FETCH_ROWS(lintCur) > 0 THEN
              DBMS_SQL.COLUMN_VALUE(lintCur, 1, intCount);
           END IF;
           
           DBMS_SQL.CLOSE_CURSOR(lintCur);
           
        END IF;
        -- Add End 20140122 lt
        /* 存在しないとき採番を有効 */
        IF intCount <= 0 THEN
            /*伝票番号採番テーブルを更新する*/
            UPDATE SYS_SLIP_CD_CTRL SET
                    SLIP_CD = vc2SequenceNo
                  , UPDATED_DATE   = SYSDATE
                  , UPDATED_BY     = pvc2UserId
                  , UPDATED_PRG_NM = pvc2BusinessName
                  , MODIFY_COUNT   = MODIFY_COUNT+1
            WHERE CURRENT OF curSYS_SLIP_CD_CTRL;
            /*処理終了*/
            EXIT;
        /* 存在するとき採番をし直す */
        ELSE
            /*採番のカウントアップ*/
            IF vc2SequenceNo = SUBSTRB(NUMBER_MAX, numNowLength * (-1), numNowLength) THEN
                vc2SequenceNo := SUBSTRB(NUMBER_MIN, numNowLength * (-1), numNowLength);
            ELSE
                numSave := TO_NUMBER(vc2SequenceNo);
                numSave := numSave + 1;
                vc2SequenceNo := LPAD(TO_CHAR(numSave), numNowLength, '0');
            END IF;
        END IF;

    END LOOP;
    CLOSE curSYS_SLIP_CD_CTRL;

    pvc2ResultData := vc2SequenceNoPlant;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    COMMIT;
    RETURN TRUE;



--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --その他のエラー
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        ROLLBACK;
        RETURN FALSE;
END;
/
