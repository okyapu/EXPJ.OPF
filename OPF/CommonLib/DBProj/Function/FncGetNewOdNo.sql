CREATE OR REPLACE FUNCTION FNCGETNEWODNO(
/*------------------------------------------------------------------------------
'
' version   : 1.00.02
'
' 修正履歴
' 2003.07.27 初版
' 2003.08.06 MY_SQL_NAME文字列長変更と工場毎番号体系変換でのSUBSTRチェックの廃止
' 2003.08.22 AUTONOMOUS_TRANSACTION版
' 2004.09.24 SUBSTR→SUBSTRBに変更
' 2005.10.21 unicode対応（varchar2を4倍）
' 2014.08.25 Witleaf性能改善
'
' 機能      : オーダデマンド番号採番
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
' 機能説明  : オーダデマンド番号の採番を行う。
'           : 採番は工場毎に行い、工場コード＋連番の形式で検索結果(pvc2ResultData)に返す。
'
' 備考      : 所要量に登録されている番号とのチェックを行い、未登録の番号を返す。
'           : 採番桁数は制御テーブルに登録されている採番済番号長となるが、
'           : 未登録時（初回採番）はPKGCOMPARAM.OD_NO_LENGTHとする。
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
    CURSOR curSYS_OD_NO_CTRL IS
    SELECT  OD_NO
    FROM    SYS_OD_NO_CTRL
    WHERE   PLANT_CD = pvc2PlantCd
    FOR UPDATE;

-- ROWTYPE の宣言
    RtpSYS_OD_NO_CTRL     curSYS_OD_NO_CTRL%ROWTYPE;

/* 定数の宣言 */
    MY_SQL_NAME             VARCHAR2(120)  := 'FncGetNewOdNo';                          --ＰＬ／ＳＱＬ名
    NUMBER_MAX              VARCHAR2(92)  := PKGCOMPARAM.OD_NO_MAX;       --取得カウントアップ用
    NUMBER_MIN              VARCHAR2(92)  := PKGCOMPARAM.OD_NO_MIN;       --取得カウントアップ用
    NUMBER_MAX_LENGTH       NUMBER        := PKGCOMPARAM.OD_NO_LENGTH;  --採番最大桁数
    PLANT_CD_LENGTH         NUMBER        := PKGCOMPARAM.PLANT_CD_LENGTH;  --工場コード桁数
    LOGMSG_START            VARCHAR2(20)   := 'Start';                      --ログ用メソッド開始宣言
    LOGMSG_END              VARCHAR2(12)   := 'End';                        --ログ用メソッド終了宣言

/* 変数の宣言 */
    blnRet                  BOOLEAN;             --返却値
    vc2SequenceNo           VARCHAR2(92);        --採番済み識別番号
    vc2SequenceNoPlant      VARCHAR2(100);        --工場コード＋識別番号
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
    SELECT COUNT(*) INTO intCount2 FROM SYS_OD_NO_CTRL
    WHERE PLANT_CD = pvc2PlantCd;

    /* 採番レコードが無い場合、生成 */
    IF intCount2 <= 0 THEN
        vc2SequenceNo := NUMBER_MAX;
        numNowLength := NUMBER_MAX_LENGTH;
        insert into SYS_OD_NO_CTRL (
                    PLANT_CD
                   ,OD_NO
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

    OPEN curSYS_OD_NO_CTRL;
    FETCH curSYS_OD_NO_CTRL INTO RtpSYS_OD_NO_CTRL;
    vc2SequenceNo := RtpSYS_OD_NO_CTRL.OD_NO;
    numNowLength := LENGTH(vc2SequenceNo);
    /*採番のカウントアップ*/
    IF vc2SequenceNo = SUBSTRB(NUMBER_MAX, numNowLength * (-1), numNowLength) THEN
        vc2SequenceNo := SUBSTRB(NUMBER_MIN, numNowLength * (-1), numNowLength);
    ELSE
        numSave := TO_NUMBER(vc2SequenceNo);
        numSave := numSave + 1;
        vc2SequenceNo := LPAD(TO_CHAR(numSave), numNowLength, '0');
    END IF;

    /*所要量の存在チェック*/
    LOOP

        /* 工場毎の番号体系へ変換 */
        vc2SequenceNoPlant := pvc2PlantCd || vc2SequenceNo;

        /* チェック実行 */
        SELECT /*+ INDEX(T_OD T_OD_PKY) */ COUNT(*) INTO intCount FROM T_OD
            WHERE OD_NO = vc2SequenceNoPlant;
--        SELECT COUNT(*) INTO intCount FROM T_OD
--            WHERE OD_NO = vc2SequenceNoPlant;

        /* 存在しないとき採番を有効 */
        IF intCount <= 0 THEN
            /*オーダデマンド番号採番テーブルを更新する*/
            UPDATE SYS_OD_NO_CTRL SET
                    OD_NO = vc2SequenceNo
                  , UPDATED_DATE   = SYSDATE
                  , UPDATED_BY     = pvc2UserId
                  , UPDATED_PRG_NM = pvc2BusinessName
                  , MODIFY_COUNT   = MODIFY_COUNT+1
            WHERE CURRENT OF curSYS_OD_NO_CTRL;
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
    CLOSE curSYS_OD_NO_CTRL;

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
