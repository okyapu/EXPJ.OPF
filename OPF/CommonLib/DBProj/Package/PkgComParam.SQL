CREATE OR REPLACE PACKAGE PKGCOMPARAM
/*------------------------------------------------------------------------------
'
' version   : 1.00.01
'
' 修正履歴
' 2003.07.26 初版
' 2003.08.10 製番採番、LOG識別番号採番
' 2005.11.21 多言語対応（VARCHAR2を4倍）
'
' 機能      : 共通パラメータ定義
'
' 戻り値    : なし
'
' 引き数    : なし
'
' 機能説明  : 各（共通）FUNCTION,SPで共有するパラメータを定義する。
'
' 備考      :
'
------------------------------------------------------------------------------*/
IS

    PLANT_CD_LENGTH CONSTANT NUMBER       := 2;  -- 工場コード桁数
    SEQUENCE_LENGTH CONSTANT NUMBER       := 10; -- 採番桁数
    NUMBER_MAX      CONSTANT VARCHAR2(100) := LPAD('9',SEQUENCE_LENGTH,'9'); -- '9999999999'
    NUMBER_MIN      CONSTANT VARCHAR2(100) := LPAD('1',SEQUENCE_LENGTH,'0'); -- '0000000001';
    OD_NO_LENGTH    CONSTANT NUMBER       := 23; -- オーダデマンド番号桁数
    OD_NO_MAX       CONSTANT VARCHAR2(100) := LPAD('9',OD_NO_LENGTH,'9'); -- '99999999999999999999999'
    OD_NO_MIN       CONSTANT VARCHAR2(100) := LPAD('1',OD_NO_LENGTH,'0'); -- '0000000001';

    LOG_CD_LENGTH   CONSTANT NUMBER       := 23; -- LOG識別番号桁数
    LOG_CD_MAX      CONSTANT VARCHAR2(100) := LPAD('9',LOG_CD_LENGTH,'9'); -- '99999999999999999999999'
    LOG_CD_MIN      CONSTANT VARCHAR2(100) := LPAD('1',LOG_CD_LENGTH,'0'); -- '00000000000000000000001';

    JOB_ODR_CD_PREFIX_LENGTH CONSTANT NUMBER  := 3;  -- 接頭辞桁数
    JOB_ODR_CD_LENGTH CONSTANT NUMBER         := 10; -- 製番桁数
    JOB_ODR_CD_MAX    CONSTANT VARCHAR2(100)   := LPAD('9',JOB_ODR_CD_LENGTH,'9'); -- '9999999999'
    JOB_ODR_CD_MIN    CONSTANT VARCHAR2(100)   := LPAD('1',JOB_ODR_CD_LENGTH,'0'); -- '0000000001';

END;
/
