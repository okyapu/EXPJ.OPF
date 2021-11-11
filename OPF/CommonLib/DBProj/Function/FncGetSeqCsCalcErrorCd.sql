CREATE OR REPLACE FUNCTION      FNCGETSEQCSCALCERRORCD (
/*------------------------------------------------------------------------------
'
'$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/DBProj/Function/FncGetSeqCsCalcErrorCd.sql,v $
'$Author: iwata $
'$Revision: 1.4 $ $Date: 2008/07/24 08:53:16 $
'
' 修正履歴
' 2004.10.20 初版
' 2005.10.21 unicode対応（varchar2を4倍）
'
' 機能      : 原価計算エラー番号採番
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
' 機能説明  : 原価計算エラー番号の採番を行う。
'           : 採番は順序SEQ_CS_CALC_ERROR_CDで行い、２０桁の連番の形式で検索結果(pvc2ResultData)に返す。
'
'
------------------------------------------------------------------------------*/
    pvc2PlantCd         IN  VARCHAR2            --工場コード
   ,pvc2ResultData      OUT VARCHAR2            --検索結果
) RETURN BOOLEAN
IS

    numSequenceNo           NUMBER(20);          --採番済み識別番号
    vc2SequenceNo           VARCHAR2(80);        --原価計算エラー番号

BEGIN

    SELECT SEQ_CS_CALC_ERROR_CD.NEXTVAL INTO numSequenceNo FROM DUAL;
    vc2SequenceNo  := TO_CHAR(numSequenceNo,'FM00000000000000000000');
    pvc2ResultData := vc2SequenceNo;

    RETURN TRUE;

--< 例外処理 >---------------------------------------------------------------
EXCEPTION
    WHEN OTHERS THEN   --その他のエラー
        RETURN FALSE;
END;
/
