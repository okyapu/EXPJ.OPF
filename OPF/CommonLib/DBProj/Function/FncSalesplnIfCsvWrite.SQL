create or replace function FncSalesplnIfCsvWrite(
/*-----------------------------------------------------------------
    ' version   : 1.00.00
    ' 
    ' SubFncSalesplnIfCsvWrite
    
    ' 修正履歴  2007.06.27 新規作成
        '
    ' 機能      :       販売所要計画情報IF削除データCSVファイル出力
        '
    ' 引き数    : 
    
    ' 戻り値    : BOOLEAN           TRUE  = 正常
    '                               FALSE = 異常
    ' 機能説明  :       販売所要計画情報IF削除データCSVファイル出力をおこなう
        '
    ' 備考      : 特になし
        '
    ------------------------------------------------------------------------------*/
    pnumDelFlg        IN NUMBER
    ,pnumSystemProcTyp IN NUMBER
    ,pdtEdiDate        IN DATE
    ,pfHandl           IN UTL_FILE.FILE_TYPE
) RETURN BOOLEAN IS

  recTSalesplnIf T_SALESPLN_IF%ROWTYPE;
  CURSOR curTSalesplnIf(numDelFlg IN NUMBER, numSystemProcTyp IN NUMBER, dtEdiDate IN DATE) IS
    SELECT *
      FROM T_SALESPLN_IF SI
     WHERE   SI.DEL_FLG = numDelFlg
        OR (SI.SYSTEM_PROC_TYP <> numSystemProcTyp AND
           TO_DATE(TO_NUMBER(TO_CHAR(SI.UPDATED_DATE, 'YYYYMM')), 'YYYYMM')
< dtEdiDate);


BEGIN
  OPEN curTSalesplnIf(pnumDelFlg, pnumSystemProcTyp, pdtEdiDate);
  FETCH curTSalesplnIf
    INTO recTSalesplnIf;

  WHILE curTSalesplnIf%FOUND LOOP
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ODR_INFO_IF_CTRL_NO || ',');
  
    --所要計画情報IF管理番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DATA_PROC_CD || ',');
  
    --データ処理NO
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.INFO_TYP_CD || ',');
  
    --情報区分コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DATA_CREATED_DATE || ',');
  
    --データ作成日
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CLIENT_CD || ',');
  
    --発注者コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TRUSTEE_CD || ',');
  
    --受注者コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.BUYER_ORG_CD || ',');
  
    --発注部門コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PUCH_ODR_CD || ',');
  
    --注文番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PRDCT_ODR_CD || ',');
  
    --製造番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MODIFICATION_CODE || ',');
  
    --訂正コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.COCK_TYP || ',');
  
    --コック区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PUCH_ODR_DATE || ',');
  
    --注文年月日
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UNIT || ',');
  
    --単位
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UNIT_PRICE || ',');
  
    --単価
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PRICE_TYP || ',');
  
    --単価区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PUCH_ODR_QTY || ',');
  
    --注文数量
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PUCH_ODR_AMOUNT || ',');
  
    --注文金額（受注金額）
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CONS_TYP || ',');
  
    --支給区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.BUYER_NAME || ',');
  
    --購買担当
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MATR_SPEC_SIZE || ',');
  
    --材質・規格・寸法
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SPECTP || ',');
  
    --仕様書有無
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DROWING_EDITION || ',');
  
    --版数
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PART_NAME || ',');
  
    --品名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.OWN_ITEM_CD || ',');
  
    --受注者品名コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_ITEM_CD || ',');
  
    --発注者品名コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DROW_SPEC_QTY || ',');
  
    --図面・仕様書枚数
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PKG_UNIT || ',');
  
    --荷姿
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DIRECT_DLV_TYP || ',');
  
    --直納区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_LOC_CD || ',');
  
    --受渡場所
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.INSPC_TYP || ',');
  
    --検査区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_INST_TYP || ',');
  
    --納入指示有無区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_1 || ',');
  
    --納期1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_1 || ',');
  
    --納入指示数量1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_1 || ',');
  
    --納入No1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_2 || ',');
  
    --納期2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_2 || ',');
  
    --納入指示数量2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_2 || ',');
  
    --納入No2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_3 || ',');
  
    --納期3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_3 || ',');
  
    --納入指示数量3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_3 || ',');
  
    --納入No3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_4 || ',');
  
    --納期4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_4 || ',');
  
    --納入指示数量4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_4 || ',');
  
    --納入No4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_5 || ',');
  
    --納期5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_5 || ',');
  
    --納入指示数量5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_5 || ',');
  
    --納入No5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_6 || ',');
  
    --納期6
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_6 || ',');
  
    --納入指示数量6
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_6 || ',');
  
    --納入No6
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_7 || ',');
  
    --納期7
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_7 || ',');
  
    --納入指示数量7
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_7 || ',');
  
    --納入No7
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_8 || ',');
  
    --納期8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_8 || ',');
  
    --納入指示数量8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_8 || ',');
  
    --納入No8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_9 || ',');
  
    --納期9
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_9 || ',');
  
    --納入指示数量9
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_9 || ',');
  
    --納入No9
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_10 || ',');
  
    --納期10
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_10 || ',');
  
    --納入指示数量10
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_10 || ',');
  
    --納入No10
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_11 || ',');
  
    --納期11
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_11 || ',');
  
    --納入指示数量11
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_11 || ',');
  
    --納入No11
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_12 || ',');
  
    --納期12
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_12 || ',');
  
    --納入指示数量12
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_12 || ',');
  
    --納入No12
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_13 || ',');
  
    --納期13
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_13 || ',');
  
    --納入指示数量13
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_13 || ',');
  
    --納入No13
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_14 || ',');
  
    --納期14
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_14 || ',');
  
    --納入指示数量14
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_14 || ',');
  
    --納入No14
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_15 || ',');
  
    --納期15
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_15 || ',');
  
    --納入指示数量15
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_15 || ',');
  
    --納入No15
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_16 || ',');
  
    --納期16
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_16 || ',');
  
    --納入指示数量16
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_16 || ',');
  
    --納入No16
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_17 || ',');
  
    --納期17
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_17 || ',');
  
    --納入指示数量17
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_17 || ',');
  
    --納入No17
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_18 || ',');
  
    --納期18
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_18 || ',');
  
    --納入指示数量18
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_18 || ',');
  
    --納入No18
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_19 || ',');
  
    --納期19
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_19 || ',');
  
    --納入指示数量19
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_19 || ',');
  
    --納入No19
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_20 || ',');
  
    --納期20
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_20 || ',');
  
    --納入指示数量20
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_20 || ',');
  
    --納入No20
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_21 || ',');
  
    --納期21
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_21 || ',');
  
    --納入指示数量21
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_21 || ',');
  
    --納入No21
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_22 || ',');
  
    --納期22
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_22 || ',');
  
    --納入指示数量22
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_22 || ',');
  
    --納入No22
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_23 || ',');
  
    --納期23
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_23 || ',');
  
    --納入指示数量23
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_23 || ',');
  
    --納入No23
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_24 || ',');
  
    --納期24
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_24 || ',');
  
    --納入指示数量24
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_24 || ',');
  
    --納入No24
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_25 || ',');
  
    --納期25
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_25 || ',');
  
    --納入指示数量25
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_25 || ',');
  
    --納入NO25
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_26 || ',');
  
    --納期26
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_26 || ',');
  
    --納入指示数量26
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_26 || ',');
  
    --納入No26
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_27 || ',');
  
    --納期27
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_27 || ',');
  
    --納入指示数量27
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_27 || ',');
  
    --納入No27
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_28 || ',');
  
    --納期28
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_28 || ',');
  
    --納入指示数量28
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_28 || ',');
  
    --納入No2-8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_29 || ',');
  
    --納期29
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_29 || ',');
  
    --納入指示数量29
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_29 || ',');
  
    --納入No29
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_30 || ',');
  
    --納期30
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_30 || ',');
  
    --納入指示数量30
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_30 || ',');
  
    --納入No30
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_DATE_31 || ',');
  
    --納期31
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SCDL_DLV_QTY_31 || ',');
  
    --納入指示数量31
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CD_31 || ',');
  
    --納入No31
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.FREE_TEXT || ',');
  
    --自由使用欄
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.REMARKS || ',');
  
    --備考
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TAX_TYP || ',');
  
    --消費税区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_TAXATION_TYP || ',');
  
    --課税区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TAX_AMOUNT || ',');
  
    --消費税額
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_TOTAL_AMOUNT || ',');
  
    --合計額
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UNCONFIRM_ODR_CD || ',');
  
    --予約番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UNCONFIRM_ODR_DATE || ',');
  
    --予約年月日
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UNCONFIRM_ODR_QTY || ',');
  
    --予約数量
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UNCONFIRM_ODR_AMOUNT || ',');
  
    --予約金額
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PLANNING_ODR_CD || ',');
  
    --計画番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PLANNING_ODR_DATE || ',');
  
    --計画年月日
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.STANDARD_DLV_TERM || ',');
  
    --標準納入日数
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ESTIMATE_REQST_CD || ',');
  
    --見積依頼番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.STL_COND_CD || ',');
  
    --決済条件区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.END_USER_NAME || ',');
  
    --エンドユーザー名カナ
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_ZIP_CD || ',');
  
    --納入先郵便番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_ADDRESS || ',');
  
    --納入先住所
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_ADDRESSEE || ',');
  
    --納入先宛先名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_COMM_SUBNAME || ',');
  
    --エンドユーザー品名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_COMM_SUBCD || ',');
  
    --エンドユーザー品名コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.END_USER_ODR_CD || ',');
  
    --エンドユーザー注文番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_DESINATED_MAKER || ',');
  
    --指定メーカー名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.REQUIRED_TERM || ',');
  
    --所要期間
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_1 || ',');
  
    --納品キー番号1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_2 || ',');
  
    --納品キー番号2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_3 || ',');
  
    --納品キー番号3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_4 || ',');
  
    --納品キー番号4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_5 || ',');
  
    --納品キー番号5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_6 || ',');
  
    --納品キー番号6
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_7 || ',');
  
    --納品キー番号7
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_8 || ',');
  
    --納品キー番号8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_9 || ',');
  
    --納品キー番号9
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_10 || ',');
  
    --納品キー番号10
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_11 || ',');
  
    --納品キー番号11
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_12 || ',');
  
    --納品キー番号12
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_13 || ',');
  
    --納品キー番号13
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_14 || ',');
  
    --納品キー番号14
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_15 || ',');
  
    --納品キー番号15
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_16 || ',');
  
    --納品キー番号16
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_17 || ',');
  
    --納品キー番号17
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_18 || ',');
  
    --納品キー番号18
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_19 || ',');
  
    --納品キー番号19
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_20 || ',');
  
    --納品キー番号20
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_21 || ',');
  
    --納品キー番号21
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_22 || ',');
  
    --納品キー番号22
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_23 || ',');
  
    --納品キー番号23
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_24 || ',');
  
    --納品キー番号24
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_25 || ',');
  
    --納品キー番号25
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_26 || ',');
  
    --納品キー番号26
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_27 || ',');
  
    --納品キー番号27
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_28 || ',');
  
    --納品キー番号28
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_29 || ',');
  
    --納品キー番号29
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_30 || ',');
  
    --納品キー番号30
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_KEY_NO_31 || ',');
  
    --納品キー番号31
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_LOC_NAME || ',');
  
    --受渡場所名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CLIENT_BARCODE_INF || ',');
  
    --発注者用バーコード情報
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CLIENT_REMARK || ',');
  
    --発注者用備考
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CONTRACT_COND_TYP || ',');
  
    --契約条件区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PUCH_ODR_SHAP_TYP || ',');
  
    --発注形態区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MASTER_PUCH_ODR_CD || ',');
  
    --親注文番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.QTY_CONTRACT_TYP || ',');
  
    --数量契約区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ODR_MODIFICATION_TYP_1 || ',');
  
    --変更注文区分1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ODR_MODIFICATION_TYP_2 || ',');
  
    --変更注文区分2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ODR_MODIFICATION_TYP_3 || ',');
  
    --変更注文区分3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MACHINE_TYP_CD || ',');
  
    --機種コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ENGINNERING_CHG_CD || ',');
  
    --設計変更番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DROW_SPEC_CD || ',');
  
    --図面・仕様書番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_FORM_1 || ',');
  
    --要求書種類1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_COPY_NUM_1 || ',');
  
    --要求書部数1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_LANG_1 || ',');
  
    --要求書言語1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_FORM_2 || ',');
  
    --要求書種類2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_COPY_NUM_2 || ',');
  
    --要求書部数2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_LANG_2 || ',');
  
    --要求書言語2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_FORM_3 || ',');
  
    --要求書種類3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_COPY_NUM_3 || ',');
  
    --要求書部数3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_LANG_3 || ',');
  
    --要求書言語3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_FORM_4 || ',');
  
    --要求書種類4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_COPY_NUM_4 || ',');
  
    --要求書部数4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_DOC_LANG_4 || ',');
  
    --要求書言語4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.STRATEGIC_GOODS_TYP || ',');
  
    --戦略物資区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ORGN_PLACE_CD_1 || ',');
  
    --原産地コード1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ORGN_PLACE_CD_2 || ',');
  
    --原産地コード2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ORGN_PLACE_CD_3 || ',');
  
    --原産地コード3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ORGN_PLACE_CD_4 || ',');
  
    --原産地コード4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ORGN_PLACE_CD_5 || ',');
  
    --原産地コード5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_1 || ',');
  
    --納入時刻1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_2 || ',');
  
    --納入時刻2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_3 || ',');
  
    --納入時刻3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_4 || ',');
  
    --納入時刻4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_5 || ',');
  
    --納入時刻5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_6 || ',');
  
    --納入時刻6
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_7 || ',');
  
    --納入時刻7
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_8 || ',');
  
    --納入時刻8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_9 || ',');
  
    --納入時刻9
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_10 || ',');
  
    --納入時刻10
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_11 || ',');
  
    --納入時刻11
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_12 || ',');
  
    --納入時刻12
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_13 || ',');
  
    --納入時刻13
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_14 || ',');
  
    --納入時刻14
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_15 || ',');
  
    --納入時刻15
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_16 || ',');
  
    --納入時刻16
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_17 || ',');
  
    --納入時刻17
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_18 || ',');
  
    --納入時刻18
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_19 || ',');
  
    --納入時刻19
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_20 || ',');
  
    --納入時刻20
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_21 || ',');
  
    --納入時刻21
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_22 || ',');
  
    --納入時刻22
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_23 || ',');
  
    --納入時刻23
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_24 || ',');
  
    --納入時刻24
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_25 || ',');
  
    --納入時刻25
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_26 || ',');
  
    --納入時刻26
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_27 || ',');
  
    --納入時刻27
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_28 || ',');
  
    --納入時刻28
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_29 || ',');
  
    --納入時刻29
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_30 || ',');
  
    --納入時刻30
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_TIME_31 || ',');
  
    --納入時刻31
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.PACKAGE_DLV_CD || ',');
  
    --一括納入番号
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SPEC || ',');
  
    --発注品仕様
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.BUYER_ORG_NAME || ',');
  
    --発注部門名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_1 || ',');
  
    --条長1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_1 || ',');
  
    --条長個数1
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_2 || ',');
  
    --条長2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_2 || ',');
  
    --条長個数2
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_3 || ',');
  
    --条長3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_3 || ',');
  
    --条長個数3
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_4 || ',');
  
    --条長4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_4 || ',');
  
    --条長個数4
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_5 || ',');
  
    --条長5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_5 || ',');
  
    --条長個数5
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_6 || ',');
  
    --条長6
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_6 || ',');
  
    --条長個数6
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_7 || ',');
  
    --条長7
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_7 || ',');
  
    --条長個数7
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_8 || ',');
  
    --条長8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_8 || ',');
  
    --条長個数8
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_9 || ',');
  
    --条長9
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_9 || ',');
  
    --条長個数9
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_LEN_10 || ',');
  
    --条長10
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_QTY_10 || ',');
  
    --条長個数10
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_PART_UNIT || ',');
  
    --条長単位
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_CONSTRUCT_NAME || ',');
  
    --工事件名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MATERIAL_CD || ',');
  
    --主材料コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MATERIAL_UNIT_PRICE || ',');
  
    --主材料ベース
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MATERIAL_UNIT || ',');
  
    --主材料単位
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TEST_REPORT_NEED_TYP || ',');
  
    --試験成績書要否区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TEST_REPORT_CHK_TYP || ',');
  
    --試験成績書検査区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TEST_REPORT_PRESENT_TYP || ',');
  
    --試験成績書提出方法
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MUNICIPAL_CD || ',');
  
    --市長村コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_CONTACT_TEL || ',');
  
    --納入時連絡先
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SLIP_PRICE_PRINT_TYP || ',');
  
    --納品書価格表示区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.BUYER_NAME_KANJI || ',');
  
    --購買担当漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SPEC_KANJI || ',');
  
    --材質・規格・寸法漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ITEM_NAME_KANJI || ',');
  
    --品名漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.REMARKS_KANJI || ',');
  
    --備考漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.END_USER_NAME_KANJI || ',');
  
    --エンドユーザー名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_ADDRESS_KANJI || ',');
  
    --納入先住所漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_ADDRESSEE_KANJI || ',');
  
    --納入先宛先名漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.END_USER_ITEM_NAME_KANJI || ',');
  
    --エンドユーザー品名漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_DESINATED_MAKER_KANJI || ',');
  
    --指定メーカ名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DLV_LOC_NAME_KANJI || ',');
  
    --受渡場所名漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CLIENT_REMARK_KANJI || ',');
  
    --発注者用備考漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MACHINE_TYPE_NAME_KANJI || ',');
  
    --機種名漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_SPC_KANJI || ',');
  
    --発注品仕様漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.BUYER_ORG_NAME_KANJI || ',');
  
    --発注部門名漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUST_CONSTRUCT_NAME_KANJI || ',');
  
    --工事件名漢字
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CUR_CD || ',');
  
    --通貨コード
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UNIT_PRICE_EXCH_RATES || ',');
  
    --単価（外貨）
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.ODR_AMOUNT_EXCH_RATES || ',');
  
    --注文金額（外貨）
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TAX_AMOUNT_EXCH_RATES || ',');
  
    --消費税額（外貨）
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.TOTAL_AMOUNT_EXCH_RATES || ',');
  
    --合計額（外貨）
    UTL_FILE.PUT(pfHandl,
                 recTSalesplnIf.UNCONFIRM_AMOUNT_EXCH_RATES || ',');
  
    --UNCONFIRM_AMOUNT_EXCH_RATES
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MATERIAL_CD_EXCH_RATES || ',');
  
    --主材料ベース（外貨）
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.SYSTEM_PROC_TYP || ',');
  
    --システム処理区分
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.DEL_FLG || ',');
  
    --削除フラグ
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CREATED_DATE || ',');
  
    --作成日
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CREATED_BY || ',');
  
    --作成者
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.CREATED_PRG_NM || ',');
  
    --作成プログラム名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UPDATED_DATE || ',');
  
    --更新日
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UPDATED_BY || ',');
  
    --更新者
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.UPDATED_PRG_NM || ',');
  
    --更新プログラム名
    UTL_FILE.PUT(pfHandl, recTSalesplnIf.MODIFY_COUNT || ',');
  
    --更新数
  
    FETCH curTSalesplnIf
      INTO recTSalesplnIf;
  
  END LOOP;

  RETURN TRUE;
EXCEPTION
  WHEN OTHERS THEN
    RETURN FALSE;
  
END FncSalesplnIfCsvWrite;
/
