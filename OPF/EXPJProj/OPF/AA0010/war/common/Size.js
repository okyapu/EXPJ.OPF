//------------------------------------------------------------------------------
// (#)Size.js
// 入力フィールドのサイズを変更する関数群
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// version 1.00 2003/11/05 新規作成  K.Shiraki
// version 1.01 2003/11/07  K.Shiraki
//              sizeNumber18x2, SYS_TYPE_VALUEによる設定の関数 追加
// version 1.02 2003/11/10 sizeChar40Narrow, sizeChar80Narrow 追加  K.Shiraki
// version 1.03 2003/11/11 K.Shiraki
//              SYS_TYPE_VALUE設定を使用する値分追加/sizeTypeValueCommon 追加
// version 1.04 2003/11/11 M.Shirai
//              SYS_TYPE_VALUE設定の支給区分を追加
// version 1.05 2004/01/26 J.Tamai
//              SYS_TYPE_VALUE設定の棚卸区分を追加
//------------------------------------------------------------------------------

// DB桁数による設定
function sizeChar20(obj){ obj.size = 36; }
function sizeChar25(obj){ obj.size = 45; }
function sizeChar40(obj){ obj.size = 70; }
function sizeChar40Narrow(obj){ obj.size = 60; }
function sizeChar80(obj){ obj.size = 130; }
function sizeChar80Narrow(obj){ obj.size = 120; }
function sizeNumber18(obj){ obj.size = 25; }
function sizeNumber18x2(obj) { obj.size = 40; }

//------------------------------------------------------------------------------
// SYS_TYPE_VALUEによる設定
// 品目手配区分
function sizeMRP_ODR_TYP(obj){ sizeTypeValueCommon(obj); }
// ロットまとめ区分
function sizeLOT_SIZING_TYP(obj){ obj.size = 48; }
// 内外作区分
function sizeOUTSIDE_TYP(obj){ sizeTypeValueCommon(obj); }
// 在庫数量単位区分
function sizeUNIT_QTY_TYP(obj){ sizeTypeValueCommon(obj); }
// 作業指示実績
function sizeOPR_RSLT_TYP(obj){ sizeTypeValueCommon(obj); }
// 支給区分
function sizeCONS_TYP(obj){ sizeTypeValueCommon(obj); }
// 棚卸区分
function sizeABC_TYP(obj){ sizeTypeValueCommon(obj); }

// SYS_TYPE_VALUE共通設定 個別jspでは 本関数を使用しないこと
function sizeTypeValueCommon(obj){ obj.size = 45; }
