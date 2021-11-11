CREATE OR REPLACE FUNCTION FNCGETROUND(
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2003.07.26 初版
' 2003.08.16 端数処理区分が規定値でない場合、四捨五入とする
'
' 機能      : 端数処理
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
'             pvc2PlantCd          --(i)工場コード
'             pnumData             - (i)端数処理前の値
'             pnumDecimalFig       - (i)少数桁数
'             pnumRoundTyp         - (i)端数処理区分
'             pnumResult           - (o)端数処理後の値
'
' 機能説明  : 少数桁数と端数処理区分で端数処理を行う。
'
' 備考      :
'
------------------------------------------------------------------------------*/
    pFileHandle         IN  UTL_FILE.FILE_TYPE  --ファイルハンドル
   ,pvc2LogMode         IN  VARCHAR2            --ＬＯＧモード
   ,pvc2OutputMode      IN  VARCHAR2            --出力モード
   ,pvc2UserId          IN  VARCHAR2            --ユーザＩＤ
   ,pvc2BusinessName    IN  VARCHAR2            --業務名
   ,pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pnumData            IN  NUMBER              --端数処理前の値
   ,pnumDecimalFig      IN  NUMBER              --少数桁数
   ,pnumRoundTyp        IN  NUMBER              --端数処理区分
   ,pnumResult          OUT NUMBER              --端数処理後の値
    ) RETURN BOOLEAN
IS

-----------------
-- CONST値宣言 --
-----------------
    MY_SQL_NAME         VARCHAR2(44)    := 'FncGetRound';       --ＰＬ／ＳＱＬ名
    ROUND_TYP_NORMAL    NUMBER(1)       := 1;                   --取引先の発注金額丸め区分(1:四捨五入)
    ROUND_TYP_CUTUP     NUMBER(1)       := 2;                   --取引先の発注金額丸め区分(2:切り上げ)
    ROUND_TYP_CUTDOWN   NUMBER(1)       := 3;                   --取引先の発注金額丸め区分(3:切り捨て)
    ROUND_COEFFICIENT   NUMBER(2,1)     := 0.5;                 --四捨五入用
    CUTUP_COEFFICIENT   NUMBER(2,1)     := 1;                   --切り上げ用
    CUTDOWN_COEFFICIENT NUMBER(2,1)     := 0;                   --切り捨て用
    LOGMSG_START        VARCHAR2(20)     := 'Start';             --ログ用メソッド開始宣言
    LOGMSG_END          VARCHAR2(12)     := 'End';               --ログ用メソッド終了宣言

--------------
-- 変数宣言 --
--------------
    NumWkRound      NUMBER(2,1);
    NumWkDecimal    NUMBER(28);
    BlnRet          BOOLEAN;

BEGIN

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_START);

    -- 端数処理係数の設定
    IF    pnumRoundTyp = ROUND_TYP_NORMAL   THEN        -- 四捨五入
        NumWkRound := ROUND_COEFFICIENT;
    ELSIF pnumRoundTyp = ROUND_TYP_CUTUP    THEN        -- 切り上げ
        NumWkRound := CUTUP_COEFFICIENT;
    ELSIF pnumRoundTyp = ROUND_TYP_CUTDOWN  THEN        -- 切り捨て
        NumWkRound := CUTDOWN_COEFFICIENT;
    ELSE
        NumWkRound := ROUND_COEFFICIENT;
    END IF;

    IF pnumDecimalFig > 0 THEN
        NumWkDecimal := POWER(10, pnumDecimalFig);
    ELSE
        NumWkDecimal := 1;
    END IF;
    
    IF pnumRoundTyp = ROUND_TYP_CUTUP    THEN          --切り上げ時
        IF MOD(pnumData * NumWkDecimal , 1) >0   THEN
            pnumResult := TRUNC(pnumData * NumWkDecimal + NumWkRound) / NumWkDecimal;
        ELSE
            pnumResult := TRUNC(pnumData * NumWkDecimal) / NumWkDecimal;  
        END IF;
    ELSE                                               --四捨五入,切り捨て時
        pnumResult := TRUNC(pnumData * NumWkDecimal + NumWkRound) / NumWkDecimal;
    END IF;

    /* TraceLog の出力 */
    blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                          pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                          MY_SQL_NAME, LOGMSG_END);

    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN
        /* ErrorLog の出力 */
        blnRet := FncErrLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                            pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                            MY_SQL_NAME, SQLCODE, SQLERRM);
        /* TraceLog の出力 */
        blnRet := FncTraceLog(pFileHandle, pvc2LogMode, pvc2OutputMode,
                              pvc2UserId, pvc2BusinessName, pvc2PlantCd,
                              MY_SQL_NAME, LOGMSG_END);
        RETURN FALSE;
END;
/