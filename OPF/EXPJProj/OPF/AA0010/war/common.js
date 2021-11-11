/*
 * FILE      : $Header: /EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/EJmenu/common.js,v 1.1 2017/03/13 08:11:13 n-saito Exp $
 * VERSION   : $Revision: 1.1 $
 * DATE      : $Date: 2017/03/13 08:11:13 $
 * HISTORY   :
 * COPYRIGHT : Copyright (c) NEC Fielding, Ltd. 2004 All rights reserved.
 */

/* 入力チェックエラーオブジェクト（入力チェック無限ループ回避判定に使用） */
var errorObject = null;

/* 年最小値 */
var MIN_YEAR = 1900;

/* 年最大値 */
var MAX_YEAR = 2100;

/* 確認ダイアログメッセージ【登録】 */
var CNF_MSG_ENTRY = "登録します。よろしいですか？";

/* 確認ダイアログメッセージ【更新】 */
var CNF_MSG_UPDATE = "更新します。よろしいですか？";

/* 確認ダイアログメッセージ【削除】 */
var CNF_MSG_DELETE = "削除します。よろしいですか？";

/* 入力チェックエラーメッセージ【最小文字数】 */
var ERR_MSG_MINLEN = "%1% 文字以上で入力してください。";

/* 入力チェックエラーメッセージ【最大文字数】 */
var ERR_MSG_MAXLEN = "%1% 文字以下で入力してください。";

/* 入力チェックエラーメッセージ【文字数範囲】 */
var ERR_MSG_LENRANGE = "%1% 文字以上 %2% 文字以下で入力してください。";

/* 入力チェックエラーメッセージ【数値範囲】 */
var ERR_MSG_RANGE = "%1% 以上 %2% 以下の数値を入力してください。";

/* 入力チェックエラーメッセージ【機種依存文字】 */
var ERR_MSG_WIN31J = "機種依存文字が含まれています。";

/* 入力チェックエラーメッセージ【半角カナ】 */
var ERR_MSG_HALFKANA = "半角カナが含まれています。";

/* 入力チェックエラーメッセージ【禁則文字】 */
var ERR_MSG_ILLEGAL = "禁則文字が含まれています。";

/* 入力チェックエラーメッセージ【年月日】 */
var ERR_MSG_YYYYMMDD = "有効な年月日形式（YYYY/MM/DD）で入力してください。";

/* 入力チェックエラーメッセージ【年月】 */
var ERR_MSG_YYYYMM = "有効な年月形式（YYYY/MM）で入力してください。";

/* 入力チェックエラーメッセージ【半角数字】 */
var ERR_MSG_DIGIT = "半角数字で入力してください。";

/* 入力チェックエラーメッセージ【数値（整数）】 */
var ERR_MSG_NUMERIC = "正しい数値書式（整数）で入力してください。";

/* 入力チェックエラーメッセージ【数値（小数点数）】 */
var ERR_MSG_DECIMAL = "正しい数値書式（小数点数）で入力してください。";

/* 入力チェックエラーメッセージ【半角英字】 */
var ERR_MSG_ALPHA = "半角英字で入力してください。";

/* 入力チェックエラーメッセージ【半角英数字】 */
var ERR_MSG_ALNUM = "半角英数字で入力してください。";

/* 入力チェックエラーメッセージ【半角文字】 */
var ERR_MSG_HALFSIZE = "半角文字で入力してください。";

/* 入力チェックエラーメッセージ【必須】 */
var ERR_MSG_REQUIRED = "必須です。";

/* 入力チェックエラーメッセージ【checkbox必須】 */
var ERR_MSG_CHKREQUIRED = "1つ以上選択してください。";

/* 半角カナ BEGIN */
var HALF_KANA_BEGIN = 0xFF61;

/* 半角カナ END */
var HALF_KANA_END = 0xFF9F;

/* 全角チルダ */
var FULL_TILDE = 0xFF5E;

/* Windows31J 機種依存文字 */
var WINDOWS31J_CHARS = new Array(
  0x2116, 0x2121, 0x2160, 0x2161, 0x2162, 0x2163, 0x2164, 0x2165, 0x2166,
  0x2167, 0x2168, 0x2169, 0x2170, 0x2171, 0x2172, 0x2173, 0x2174, 0x2175,
  0x2176, 0x2177, 0x2178, 0x2179, 0x2211, 0x221A, 0x221F, 0x2220, 0x2229,
  0x222A, 0x222B, 0x222E, 0x2235, 0x2252, 0x2261, 0x22A5, 0x22BF, 0x2460,
  0x2461, 0x2462, 0x2463, 0x2464, 0x2465, 0x2466, 0x2467, 0x2468, 0x2469,
  0x246A, 0x246B, 0x246C, 0x246D, 0x246E, 0x246F, 0x2470, 0x2471, 0x2472,
  0x2473, 0x301D, 0x301F, 0x3231, 0x3232, 0x3239, 0x32A4, 0x32A5, 0x32A6,
  0x32A7, 0x32A8, 0x3303, 0x330D, 0x3314, 0x3318, 0x3322, 0x3323, 0x3326,
  0x3327, 0x332B, 0x3336, 0x333B, 0x3349, 0x334A, 0x334D, 0x3351, 0x3357,
  0x337B, 0x337C, 0x337D, 0x337E, 0x338E, 0x338F, 0x339C, 0x339D, 0x339E,
  0x33A1, 0x33C4, 0x33CD, 0x4E28, 0x4EE1, 0x4EFC, 0x4F00, 0x4F03, 0x4F39,
  0x4F56, 0x4F8A, 0x4F92, 0x4F94, 0x4F9A, 0x4FC9, 0x4FCD, 0x4FFF, 0x501E,
  0x5022, 0x5040, 0x5042, 0x5046, 0x5070, 0x5094, 0x50D8, 0x50F4, 0x514A,
  0x5164, 0x519D, 0x51BE, 0x51EC, 0x5215, 0x529C, 0x52A6, 0x52AF, 0x52C0,
  0x52DB, 0x5300, 0x5307, 0x5324, 0x5372, 0x5393, 0x53B2, 0x53DD, 0x548A,
  0x549C, 0x54A9, 0x54FF, 0x5586, 0x5759, 0x5765, 0x57AC, 0x57C7, 0x57C8,
  0x589E, 0x58B2, 0x590B, 0x5953, 0x595B, 0x595D, 0x5963, 0x59A4, 0x59BA,
  0x5B56, 0x5BC0, 0x5BD8, 0x5BEC, 0x5C1E, 0x5CA6, 0x5CBA, 0x5CF5, 0x5D27,
  0x5D42, 0x5D53, 0x5D6D, 0x5DB8, 0x5DB9, 0x5DD0, 0x5F21, 0x5F34, 0x5F45,
  0x5F67, 0x5FB7, 0x5FDE, 0x605D, 0x6085, 0x608A, 0x60D5, 0x60DE, 0x60F2,
  0x6111, 0x6120, 0x6130, 0x6137, 0x6198, 0x6213, 0x62A6, 0x63F5, 0x6460,
  0x649D, 0x64CE, 0x654E, 0x6600, 0x6609, 0x6615, 0x661E, 0x6624, 0x662E,
  0x6631, 0x663B, 0x6657, 0x6659, 0x6665, 0x6673, 0x6699, 0x66A0, 0x66B2,
  0x66BF, 0x66FA, 0x66FB, 0x670E, 0x6766, 0x67BB, 0x67C0, 0x6801, 0x6844,
  0x6852, 0x68C8, 0x68CF, 0x6968, 0x6998, 0x69E2, 0x6A30, 0x6A46, 0x6A6B,
  0x6A73, 0x6A7E, 0x6AE2, 0x6AE4, 0x6BD6, 0x6C3F, 0x6C5C, 0x6C6F, 0x6C86,
  0x6CDA, 0x6D04, 0x6D6F, 0x6D87, 0x6D96, 0x6DAC, 0x6DCF, 0x6DF2, 0x6DF8,
  0x6DFC, 0x6E27, 0x6E39, 0x6E3C, 0x6E5C, 0x6EBF, 0x6F88, 0x6FB5, 0x6FF5,
  0x7005, 0x7007, 0x7028, 0x7085, 0x70AB, 0x70BB, 0x7104, 0x710F, 0x7146,
  0x7147, 0x715C, 0x71C1, 0x71FE, 0x72B1, 0x72BE, 0x7324, 0x7377, 0x73BD,
  0x73C9, 0x73D2, 0x73D6, 0x73E3, 0x73F5, 0x7407, 0x7426, 0x7429, 0x742A,
  0x742E, 0x7462, 0x7489, 0x749F, 0x7501, 0x752F, 0x756F, 0x7682, 0x769B,
  0x769C, 0x769E, 0x76A6, 0x7746, 0x7821, 0x784E, 0x7864, 0x787A, 0x7930,
  0x7994, 0x799B, 0x7AD1, 0x7AE7, 0x7AEB, 0x7B9E, 0x7D48, 0x7D5C, 0x7DA0,
  0x7DB7, 0x7DD6, 0x7E52, 0x7E8A, 0x7F47, 0x7FA1, 0x8301, 0x8362, 0x837F,
  0x83C7, 0x83F6, 0x8448, 0x84B4, 0x84DC, 0x8553, 0x8559, 0x856B, 0x85B0,
  0x8807, 0x88F5, 0x891C, 0x8A12, 0x8A37, 0x8A79, 0x8AA7, 0x8ABE, 0x8ADF,
  0x8AF6, 0x8B53, 0x8B7F, 0x8CF0, 0x8CF4, 0x8D12, 0x8D76, 0x8ECF, 0x9067,
  0x90DE, 0x9115, 0x9127, 0x91D7, 0x91DA, 0x91DE, 0x91E4, 0x91E5, 0x91ED,
  0x91EE, 0x9206, 0x920A, 0x9210, 0x9239, 0x923A, 0x923C, 0x9240, 0x924E,
  0x9251, 0x9259, 0x9267, 0x9277, 0x9278, 0x9288, 0x92A7, 0x92D0, 0x92D3,
  0x92D5, 0x92D7, 0x92D9, 0x92E0, 0x92E7, 0x92F9, 0x92FB, 0x92FF, 0x9302,
  0x931D, 0x931E, 0x9321, 0x9325, 0x9348, 0x9357, 0x9370, 0x93A4, 0x93C6,
  0x93DE, 0x93F8, 0x9431, 0x9445, 0x9448, 0x9592, 0x969D, 0x96AF, 0x9733,
  0x973B, 0x9743, 0x974D, 0x974F, 0x9751, 0x9755, 0x9857, 0x9865, 0x9927,
  0x999E, 0x9A4E, 0x9AD9, 0x9ADC, 0x9B72, 0x9B75, 0x9B8F, 0x9BB1, 0x9BBB,
  0x9C00, 0x9D6B, 0x9D70, 0x9E19, 0x9ED1, 0xF929, 0xF9DC, 0xFA0E, 0xFA0F,
  0xFA10, 0xFA11, 0xFA12, 0xFA13, 0xFA14, 0xFA15, 0xFA16, 0xFA17, 0xFA18,
  0xFA19, 0xFA1A, 0xFA1B, 0xFA1C, 0xFA1D, 0xFA1E, 0xFA1F, 0xFA20, 0xFA21,
  0xFA22, 0xFA23, 0xFA24, 0xFA25, 0xFA26, 0xFA27, 0xFA28, 0xFA29, 0xFA2A,
  0xFA2B, 0xFA2C, 0xFA2D, 0xFF02, 0xFF07, 0xFFE2, 0xFFE4
);

/*
 * ウィンドウオープン
 *
 * param url    URL
 * param name   ウィンドウオブジェクト名
 * param scroll スクロールバー ( yes / no )
 * param width  ウィンドウ幅
 * param height ウィンドウ高さ
 * param top    ウィンドウ位置 ( 画面上端からの距離 )
 * param left   ウィンドウ位置 ( 画面左端からの距離 )
 * return       ウィンドウオブジェクト
 */
function openWindow( url, name, scroll, width, height, top, left ) {

    // top, left が指定されていない場合、センタリング
    top  = top  ? top  : ( window.screen.height - height ) / 2;
    left = left ? left : ( window.screen.width - width ) / 2

    var opt = "scrollbars="  + scroll + "," // スクロールバー
            + "width="       + width  + "," // 幅
            + "height="      + height + "," // 高さ
            + "top="         + top    + "," // ウィンドウ位置
            + "left="        + left   + "," // ウィンドウ位置
            + "toolber="     + "no"   + "," // ツールバー
            + "directories=" + "no"   + "," // ユーザ設定ツールバー
            + "location="    + "no"   + "," // ロケーションバー
            + "status="      + "yes"  + "," // ステータスバー
            + "resizable="   + "no"   + "," // リサイズ
            + "menubar="     + "no";        // メニューバー

    return window.open( url, name, opt );
}

/*
 * セレクトボックス判定
 *
 * param  obj     入力部品オブジェクト
 * return boolean 判定結果
 */
function isSelect( obj ) {

    return isSelectOne( obj ) || isSelectMultiple( obj );
}

/*
 * セレクトボックス配列判定
 *
 * param  obj     入力部品オブジェクト
 * return boolean 判定結果
 */
function isSelectArray( obj ) {

    return isSelectOneArray( obj ) || isSelectMultipleArray( obj );
}

/*
 * セレクトボックス判定 ( select-one )
 *
 * param  obj     入力部品オブジェクト
 * return boolean 判定結果
 */
function isSelectOne( obj ) {

    return getObjectType( obj ) == "select-one";
}

/*
 * セレクトボックス判定 ( select-multiple )
 *
 * param  obj     入力部品オブジェクト
 * return boolean 判定結果
 */
function isSelectMultiple( obj ) {

    return getObjectType( obj ) == "select-multiple";
}

/*
 * セレクトボックス配列判定 ( select-one )
 *
 * param  obj     入力部品オブジェクト
 * return boolean 判定結果
 */
function isSelectOneArray( obj ) {

    return isSelectOne( obj ) && isDefined( obj[ 0 ].type );
}

/*
 * セレクトボックス配列判定 ( select-multiple )
 *
 * param  obj     入力部品オブジェクト
 * return boolean 判定結果
 */
function isSelectMultipleArray( obj ) {

    return isSelectMultiple( obj ) && isDefined( obj[ 0 ].type );
}

/*
 * 全てのチェックボックスをＯＮにする
 *
 * param obj チェックボックスオブジェクト
 */
function allOn( obj ) {

    if ( getObjectType( obj ) != "checkbox" ) {
        return;
    }
    if ( !obj.length ) {
        obj.checked = true;
        return;
    }
    for ( var i = 0; i < obj.length; i++ ) {
        obj[ i ].checked = true;
    }
}

/*
 * 全てのチェックボックスをＯＦＦにする
 *
 * param obj チェックボックスオブジェクト
 */
function allOff( obj ) {

    if ( getObjectType( obj ) != "checkbox" ) {
        return;
    }
    if ( !obj.length ) {
        obj.checked = false;
        return;
    }
    for ( var i = 0; i < obj.length; i++ ) {
        obj[ i ].checked = false;
    }
}

/*
 * 定義済判定
 *
 * param  obj     オブジェクト
 * return boolean 判定結果
 */
function isDefined( obj ) {

    return typeof( obj ) != "undefined";
}

/*
 * 未定義判定
 *
 * param  obj     オブジェクト
 * return boolean 判定結果
 */
function isUndefined( obj ) {

    return !isDefined( obj );
}

/*
 * オブジェクトタイププロパティ取得
 *
 * param  obj オブジェクト
 * return     オブジェクトタイププロパティ
 */
function getObjectType( obj ) {

    if ( isUndefined( obj ) ) {
        return "undefined";
    }
    if ( isDefined( obj.type ) ) {
        return obj.type;
    }
    if ( isDefined( obj[ 0 ].type ) ) {
        return obj[ 0 ].type;
    }
    return "undefined";
}

/*
 * 空文字列判定
 *
 * param  str     文字列
 * return boolean 判定結果
 */
function isBlankOrNull( str ) {

    return str == null || str.length == 0;
}

/*
 * 配列判定
 *
 * param  obj     配列オブジェクト
 * return boolean 判定結果
 */
function isArray( arr ) {

    if ( !arr || typeof( arr ) != "object" ) {
        return false;
    }
    if ( isUndefined( arr.length ) ) {
        return false;
    }
    return true;
}

/*
 * ゼロサプレス
 *
 * param  str 整数文字列（符号なし）
 * return     ゼロサプレスされた文字列
 */
function suppressZero( str ) {

    if ( isBlankOrNull( str ) || !str.match( /^\d+$/ ) ) {
        return str;
    }
    var buf = str.replace( /^0+/, "" );
    return buf ? buf : "0";
}

/*
 * ゼロパディング
 *
 * param  str   文字列
 * param  scale 桁
 * return       ゼロパディングされた文字列
 */
function paddingZero( str, scale ) {

    if ( isBlankOrNull( str ) || isBlankOrNull( scale ) ) {
        return str;
    }
    if ( !validateDigit( scale ) ) {
        return str;
    }
    str = String( str );
    while ( str.length < scale ) {
        str = String( "0" ) + str;
    }
    return str;
}

/*
 * 文字列反転
 *
 * param  str 文字列
 * return     反転された文字列
 */
function reverse( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    var buf = new String();
    str = new String( str );
    for ( var i = 0; i < str.length; i++ ) {
        buf = str.charAt( i ) + buf;
    }
    return buf;
}

/*
 * 空白削除
 *
 * param  str 文字列
 * return     左右の空白が削除された文字列
 */
function trim( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = lTrim( str );
    str = rTrim( str );
    return str;
}

/*
 * 左側空白削除
 *
 * param  str 文字列
 * return     左側の空白が削除された文字列
 */
function lTrim( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    return str.replace( /^\s+/g, "" );
}

/*
 * 右側空白削除
 *
 * param  str 文字列
 * return     右側の空白が削除された文字列
 */
function rTrim( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    return str.replace( /\s+$/g, "" );
}

/*
 * 二分探索
 *
 * param  arr     ソート済み検索対象配列
 * param  key     検索値
 * return boolean 検索結果
 */
function binarySearch( arr, key ) {

    if ( !isArray( arr ) || isBlankOrNull( key ) ) {
        return false;
    }
    var low  = 0;
    var high = arr.length - 1;
    while ( low <= high ) {
        var mid = Math.floor( ( high + low ) / 2 );
        if ( key == arr[ mid ] ) {
            return true;
        } else if ( key < arr[ mid ] ) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return false;
}

////////////////////////////////////////////////////////////
//  FORMAT AND UNFORMAT FUNCTION
////////////////////////////////////////////////////////////

/*
 * テキストフィールドフォーマット処理
 *
 * param obj テキストフィールドオブジェクト
 * param fmt フォーマット指定文字列
 */
function textFormat( obj, fmt ) {

    if ( !obj || isBlankOrNull( obj.value ) ) {
        return;
    }
    if ( fmt ) {
        obj.value = format( obj.value, fmt );
    }
}

/*
 * テキストフィールドアンフォーマット時処理
 *
 * param obj テキストフィールドオブジェクト
 * param fmt フォーマット指定文字列
 */
function textUnformat( obj, fmt ) {

    if ( !obj || isBlankOrNull( obj.value ) ) {
        return;
    }
    if ( fmt ) {
        obj.value = unformat( obj.value, fmt );
        obj.select();
    }
}

/*
 * フォーマット
 *
 * フォーマット指定文字列
 *   numeric    : 数値フォーマット
 *   decimal1   : 小数点数 ( 小数点以下1桁 )
 *   decimal2   : 小数点数 ( 小数点以下2桁 )
 *   decimal3   : 小数点数 ( 小数点以下3桁 )
 *   decimal4   : 小数点数 ( 小数点以下4桁 )
 *   yyyy/MM/dd : 年月日 ( yyyy/MM/dd )
 *   yyyy/MM    : 年月 ( yyyy/MM )
 *
 * param  str フォーマット対象文字列
 * param  fmt フォーマット指定文字列
 * return     フォーマット文字列
 */
function format( str, fmt ) {

    if ( isBlankOrNull( str ) || isBlankOrNull( fmt ) ) {
        return str;
    }

    switch ( fmt ) {
    case "numeric":
        str = formatNumeric( str );
        break;
    case "decimal1":
        str = formatDecimal( str, 1 );
        break;
    case "decimal2":
        str = formatDecimal( str, 2 );
        break;
    case "decimal3":
        str = formatDecimal( str, 3 );
        break;
    case "decimal4":
        str = formatDecimal( str, 4 );
        break;
    case "yyyy/MM/dd":
        str = formatYmd( str );
        break;
    case "yyyy/MM":
        str = formatYm( str );
        break;
    default:
    }
    return String( str );
}

/*
 * アンフォーマット
 *
 * アンフォーマット指定文字列
 *   numeric    : 数値フォーマット
 *   decimal1   : 小数点数 ( 小数点以下1桁 )
 *   decimal2   : 小数点数 ( 小数点以下2桁 )
 *   decimal3   : 小数点数 ( 小数点以下3桁 )
 *   yyyy/MM/dd : 年月日 ( yyyy/MM/dd )
 *   yyyy/MM    : 年月 ( yyyy/MM )
 *
 * param  str アンフォーマット対象文字列
 * param  fmt アンフォーマット指定文字列
 * return     アンフォーマット文字列
 */
function unformat( str, fmt ) {

    if ( isBlankOrNull( str ) || isBlankOrNull( fmt ) ) {
        return str;
    }

    switch ( fmt ) {
    case "numeric":
        str = unformatNumeric( str );
        break;
    case "decimal1":
    case "decimal2":
    case "decimal3":
        str = unformatDecimal( str );
        break;
    case "yyyy/MM/dd":
        str = unformatYmd( str );
        break;
    case "yyyy/MM":
        str = unformatYm( str );
        break;
    default:
        break;
    }
    return String( str );
}

/*
 * 数値フォーマット
 *
 * param  str 数値フォーマット対象文字列
 * return     数値フォーマット文字列
 */
function formatNumeric( str ) {

    var buf = new String();
    var sign;
    var num;

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    if ( !str.match( /^(-)?(\d+)$/ ) ) {
        return str;
    }
    sign = RegExp.$1;
    num  = RegExp.$2;
    sign = sign ? sign : "";
    num  = suppressZero( num );

    for ( var i = 0; i < num.length; i++ ) {
        if ( i != 0 && !( i % 3 ) ) {
            buf = "," + buf;
        }
        buf = num.charAt( num.length - i - 1 ) + buf;
    }
    return sign + buf;
}

/*
 * 数値アンフォーマット
 *
 * param  str 数値アンフォーマット対象文字列
 * return     数値アンフォーマット文字列
 */
function unformatNumeric( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    if ( str.match( /^-?\d{1,3}(,\d{3})*$/ ) ) {
        return str.replace( /,/g, "" );
    } else {
        return str;
    }
}

/*
 * 小数点数フォーマット
 * ※指定桁数以降は切り捨て
 *
 * param  str   小数点数フォーマット対象文字列
 * param  scale 小数点以下桁数 ( ※1桁以上 )
 * return       小数点数フォーマット文字列
 */
function formatDecimal( str, scale ) {

    var integer;
    var decimal;
    var sign;

    if ( isBlankOrNull( str ) || isBlankOrNull( scale ) ) {
        return str;
    }
    if ( !validateDigit( scale ) || scale == 0 ) {
        return String( str );
    }
    str = String( str );
    if ( !str.match( /^(-)?(\d+)\.?(\d*)$/ ) ) {
        return str;
    }
    sign    = RegExp.$1;
    integer = RegExp.$2;
    decimal = RegExp.$3;
    integer = suppressZero( integer );
    decimal = decimal ? decimal : "0";
    if ( decimal.length >= scale ) {
        decimal = decimal.substr( 0, scale );
    } else {
        decimal = reverse( decimal );
        decimal = paddingZero( decimal, scale );
        decimal = reverse( decimal );
    }
    return sign + integer + "." + decimal;
}

/*
 * 小数点数アンフォーマット
 *
 * param  str 小数点数アンフォーマット対象文字列
 * return     小数点数アンフォーマット文字列
 */
function unformatDecimal( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    return String( str );
}

/*
 * 年月日フォーマット
 * ( yyyy/MM/dd )
 *
 * param  str 年月日フォーマット対象文字列
 * return     年月日フォーマット文字列
 */
function formatYmd( str ) {

    var arr;

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    if ( str.match( /^\d{4}\/\d{1,2}\/\d{1,2}$/ ) ) {
        arr = str.split( "/" );
        str = String( arr[ 0 ] )         + "/"
            + paddingZero( arr[ 1 ], 2 ) + "/"
            + paddingZero( arr[ 2 ], 2 );
    } else if ( str.match( /^\d{8}$/ ) ) {
        str = str.substring( 0, 4 ) + "/"
            + str.substring( 4, 6 ) + "/"
            + str.substring( 6, 8 );
    }
    return str;
}

/*
 * 年月日アンフォーマット
 * ( yyyy/MM/dd )
 *
 * param  str 年月日アンフォーマット対象文字列
 * return     年月日アンフォーマット文字列
 */
function unformatYmd( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    if ( str.match( /^\d{4}\/\d{2}\/\d{2}$/ ) ) {
        return str.replace( /\//g, "" );
    } else {
        return str;
    }
}

/*
 * 年月フォーマット
 * ( yyyy/MM )
 *
 * param  str 年月フォーマット対象文字列
 * return     年月フォーマット文字列
 */
function formatYm( str ) {

    var arr;

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    if ( str.match( /^\d{4}\/\d{1,2}$/ ) ) {
        arr = str.split( "/" );
        str = String( arr[ 0 ] ) + "/"
            + paddingZero( arr[ 1 ], 2 );
    } else if ( str.match( /^\d{6}$/ ) ) {
        str = str.substring( 0, 4 ) + "/"
            + str.substring( 4, 6 );
    }
    return str;
}

/*
 * 年月アンフォーマット
 * ( yyyy/MM )
 *
 * param  str 年月アンフォーマット対象文字列
 * return     年月アンフォーマット文字列
 */
function unformatYm( str ) {

    if ( isBlankOrNull( str ) ) {
        return str;
    }
    str = String( str );
    if ( str.match( /^\d{4}\/\d{2}$/ ) ) {
        return str.replace( /\//g, "" );
    } else {
        return str;
    }
}

////////////////////////////////////////////////////////////
//  VALIDATE FUNCTION
////////////////////////////////////////////////////////////

/*
 * 最小文字数チェック
 *
 * param  str     チェック対象文字列
 * param  len     最小文字数
 * return boolean チェック結果
 */
function validateMinLen( str, len ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    if ( !validateDigit( len ) ) {
        return false;
    }
    str = String( str );
    return str.length >= len;
}

/*
 * 最大文字数チェック
 *
 * param  str     チェック対象文字列
 * param  len     最大文字数
 * return boolean チェック結果
 */
function validateMaxLen( str, len ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    if ( !validateDigit( len ) ) {
        return false;
    }
    str = String( str );
    return str.length <= len;
}

/*
 * 文字数範囲チェック
 *
 * param  str     チェック対象文字列
 * param  min     最小文字数
 * param  max     最大文字数
 * return boolean チェック結果
 */
function validateLenRange( str, min, max ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    if ( !validateDigit( min ) || !validateDigit( max ) ) {
        return false;
    }
    str = String( str );
    return str.length >= min && str.length <= max;
}

/*
 * 数値範囲チェック
 *
 * param  str     チェック対象文字列
 * param  min     最小値
 * param  max     最大値
 * return boolean チェック結果
 */
function validateRange( str, min, max ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    if ( !validateNumeric( str ) && !validateDecimal( str ) ) {
        return false;
    }
    if ( !validateNumeric( min ) && !validateDecimal( min ) ) {
        return false;
    }
    if ( !validateNumeric( max ) && !validateDecimal( max ) ) {
        return false;
    }
    str = String( str );
    min = String( min );
    max = String( max );
    var num = new Number( str.replace( /,/g, "" ) );
    var minNum = new Number( min.replace( /,/g, "" ) );
    var maxNum = new Number( max.replace( /,/g, "" ) );
    return num >= minNum && num <= maxNum;
}

/*
 * 機種依存文字チェック
 *
 * チェック対象文字列に機種依存文字が含まれる場合に false を返却
 *
 * ※機種依存文字
 *
 *   ・NEC特殊文字
 *   ・NEC選定IBM拡張文字
 *   ・IBM拡張文字
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateWin31J( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    for ( var i = 0; i < str.length; i++ ) {
        var code = str.charCodeAt( i );
        if ( binarySearch( WINDOWS31J_CHARS, code  ) ) {
            return false;
        }
    }
    return true;
}

/*
 * 半角カナチェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateHalfKana( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    for ( var i = 0; i < str.length; i++ ) {
        var code = str.charCodeAt( i );
        if ( code >= HALF_KANA_BEGIN && code <= HALF_KANA_END ) {
            return false;
        }
    }
    return true;
}

/*
 * 禁則文字チェック
 *
 * ※禁則文字
 *
 *   ・半角カナ
 *   ・NEC特殊文字
 *   ・NEC選定IBM拡張文字
 *   ・IBM拡張文字
 *   ・全角チルダ
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateIllegalChars( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    for ( var i = 0; i < str.length; i++ ) {
        var code = str.charCodeAt( i );
        if ( ( code >= HALF_KANA_BEGIN && code <= HALF_KANA_END ) ||
             binarySearch( WINDOWS31J_CHARS, code  ) ||
             code == FULL_TILDE ) {
            return false;
        }
    }
    return true;
}

/*
 * 年月日チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateYmd( str ) {

    var ymd;
    var year;
    var month;
    var day;
    var days;

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    if ( str.match( /^\d{4}\/\d{1,2}\/\d{1,2}$/ ) ) {
        ymd   = str.split( "/" );
        year  = new Number( ymd[ 0 ] );
        month = new Number( ymd[ 1 ] );
        day   = new Number( ymd[ 2 ] );
    } else if ( str.match( /^\d{8}$/ ) ) {
        year  = new Number( str.substring( 0, 4 ) );
        month = new Number( str.substring( 4, 6 ) );
        day   = new Number( str.substring( 6, 8 ) );
    } else {
        return false;
    }
    if ( year < MIN_YEAR || year > MAX_YEAR ) {
        return false;
    }
    if ( month < 1 || month > 12 ) {
        return false;
    }
    if ( ( year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ) {
        days = new Array( 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 );
    } else {
        days = new Array( 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 );
    }
    return day >= 1 && day <= days[ month - 1 ];
}

/*
 * 年月チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateYm( str ) {

    var ym;
    var year;
    var month;

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    if ( str.match( /^\d{4}\/\d{1,2}$/ ) ) {
        ym    = str.split( "/" );
        year  = new Number( ym[ 0 ] );
        month = new Number( ym[ 1 ] );
    } else if ( str.match( /^\d{6}$/ ) ) {
        year  = new Number( str.substring( 0, 4 ) );
        month = new Number( str.substring( 4, 6 ) );
    } else {
        return false;
    }
    if ( year < MIN_YEAR || year > MAX_YEAR ) {
        return false;
    }
    if ( month < 1 || month > 12 ) {
        return false;
    }
    return true;
}

/*
 * 半角数字チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateDigit( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    return str.match( /^\d+$/ ) ? true : false;
}

/*
 * 数値（整数）チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateNumeric( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    return str.match( /^-?\d+$/ ) ||
           str.match( /^-?\d{1,3}(,\d{3})*$/ ) ? true : false;
}

/*
 * 数値（小数点数）チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateDecimal( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    return str.match( /^-?\d+\.?\d*$/ ) ? true : false;
}

/*
 * 半角英字チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateAlpha( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    return str.match( /^[A-Za-z]+$/ ) ? true : false;
}

/*
 * 半角英数字チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateAlnum( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    return str.match( /^[0-9A-Za-z]+$/ ) ? true : false;
}

/*
 * 半角文字チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateHalfSize( str ) {

    if ( isBlankOrNull( str ) ) {
        return true;
    }
    str = String( str );
    for ( var i = 0; i < str.length; i++ ) {
        var code = str.charCodeAt( i );
        if ( code < 0x20 || code > 0x7E ) {
            return false;
        }
    }
    return true;
}

/*
 * 必須チェック
 *
 * param  str     チェック対象文字列
 * return boolean チェック結果
 */
function validateRequired( str ) {

    return !isBlankOrNull( str );
}

////////////////////////////////////////////////////////////
//  FORM OBJECT INPUT CHECK FUNCTION
////////////////////////////////////////////////////////////

/*
 * 入力チェック
 * ※マルチプルセレクトボックスは未対応
 *
 * param  obj     入力部品オブジェクト
 * param  msg     エラメッセージ
 * param  func    チェック関数名
 * param  args    引数配列
 * return boolean チェック結果
 */
function inputCheck( obj, msg, func, args ) {

    var arr;
    var val;
    if ( !obj ) {
        return true;
    }
    if ( isSelectMultiple( obj ) ) {
        return true;
    }
    if ( isInfinityLoop( obj ) ) {
        return true;
    }
    if ( !obj.length || ( isSelect( obj ) && !isSelectArray( obj ) ) ) {
        val = isSelect( obj )
            ? obj.options[ obj.selectedIndex ].value
            : obj.value;
        arr = new Array( val );
        arr = arr.concat( args );
        if ( !evalValidateFunc( func, arr ) ) {
            inputCheckError( obj, replaceToken( msg, args ) );
            return false;
        }
    } else {
        for ( var i = 0; i < obj.length; i++ ) {
            val = isSelect( obj[ i ] )
                ? obj[ i ].options[ obj[ i ].selectedIndex ].value
                : obj[ i ].value;
            arr = new Array( val );
            arr = arr.concat( args );
            if ( !evalValidateFunc( func, arr ) ) {
                inputCheckError( obj[ i ], replaceToken( msg, args ) );
                return false;
            }

        }
    }
    clearErrorObject();
    return true;
}

/*
 * チェック関数実行
 *
 * param func チェック関数名
 * param args 引数配列
 * return     関数実行結果
 */
function evalValidateFunc( func, args ) {

    if ( !func || !isArray( args ) ) {
        return null;
    }
    var stmt;
    var arg = new String();
    for ( var i = 0; i < args.length; i++ ) {
        if ( i != 0 ) {
            arg += ", ";
        }
        arg += "args[ " + i + " ]";
    }
    stmt = func + "( " + arg + " )";
    return eval( stmt );
}

/*
 * 入力チェックエラー処理
 *
 * param obj 入力部品オブジェクト
 * param msg エラーメッセージ
 */
function inputCheckError( obj, msg ) {

    setErrorObject( obj );
    alert( msg );
    obj = isDefined( obj.length ) && !isSelect( obj ) ? obj[ 0 ] : obj;
    switch ( obj.type ) {
    case "text":
    case "textarea":
    case "password":
        obj.focus();
        obj.select();
        break;
    case "checkbox":
    case "select-one":
    case "select-multiple":
        obj.focus();
        break;
    default:
    }
}

/*
 * 入力チェックエラーオブジェクト設定
 *
 * param obj 入力部品オブジェクト
 */
function setErrorObject( obj ) {

    errorObject = errorObject != null ? errorObject : obj;
}

/*
 * 入力チェックエラーオブジェクトINDEXクリア
 *
 */
function clearErrorObject() {

    errorObject = null;
}

/*
 * 入力チェックエラー無限ループ判定
 *
 * param obj 入力部品オブジェクト
 * return    判定結果
 */
function isInfinityLoop( obj ) {

    return errorObject != null && errorObject != obj;
}

/*
 * オブジェクトINDEX取得
 *
 * param obj オブジェクト
 * return    オブジェクトINDEX
 */
function getObjectIndex( obj ) {

    if ( typeof( obj ) != "object" ) {
        return null;
    }
    var elm = isDefined( obj.length ) && !isSelect( obj ) ? obj[ 0 ] : obj;
    if ( !elm.form ) {
        return null;
    }
    for ( var i = 0; i < elm.form.length; i++ ) {
        if ( elm.form.elements[ i ] == elm ) {
            return i;
        }
    }
    return null;
}

/*
 * 入力チェックエラーメッセージトークン変換
 *
 * param msg   エラーメッセージ
 * param token トークン配列
 * return      トークン変換済エラーメッセージ
 */
function replaceToken( msg, token ) {

    var arr = isArray( token ) ? token : new Array( String( token ) );
    for ( var i = 0; i < arr.length; i++ ) {
        var reg = new RegExp( "%" + ( i + 1 ) + "%", "g" );
        msg = msg.replace( reg, arr[ i ] );
    }
    return msg;
}

/*
 * 入力チェック【最小文字数】
 *
 * param  obj     入力部品オブジェクト
 * param  len     最小文字数
 * return boolean チェック結果
 */
function inputCheckMinLen( obj, len ) {

    var func = "validateMinLen";
    return inputCheck( obj, ERR_MSG_MINLEN, func, len );
}

/*
 * 入力チェック【最大文字数】
 *
 * param  obj     入力部品オブジェクト
 * param  len     最大文字数
 * return boolean チェック結果
 */
function inputCheckMaxLen( obj, len ) {

    var func = "validateMaxLen";
    return inputCheck( obj, ERR_MSG_MAXLEN, func, len );
}

/*
 * 入力チェック【文字数範囲】
 *
 * param  obj     入力部品オブジェクト
 * param  min     最小文字数
 * param  max     最大文字数
 * return boolean チェック結果
 */
function inputCheckLenRange( obj, min, max ) {

    var func = "validateLenRange";
    var args = new Array( min, max );
    return inputCheck( obj, ERR_MSG_LENRANGE, func, args );
}

/*
 * 入力チェック【数値範囲】
 *
 * param  obj     入力部品オブジェクト
 * param  min     最小値
 * param  max     最大値
 * return boolean チェック結果
 */
function inputCheckRange( obj, min, max ) {

    var func = "validateRange";
    var args = new Array( min, max );
    return inputCheck( obj, ERR_MSG_RANGE, func, args );
}

/*
 * 入力チェック【機種依存文字】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckWin31J( obj ) {

    var func = "validateWin31J";
    return inputCheck( obj, ERR_MSG_WIN31J, func );
}

/*
 * 入力チェック【半角カナ】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckHalfKana( obj ) {

    var func = "validateHalfKana";
    return inputCheck( obj, ERR_MSG_HALFKANA, func );
}

/*
 * 入力チェック【禁則文字】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckIllegalChars( obj ) {

    var func = "validateIllegalChars";
    return inputCheck( obj, ERR_MSG_ILLEGAL, func );
}

/*
 * 入力チェック【年月日】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckYmd( obj ) {

    var func = "validateYmd";
    return inputCheck( obj, ERR_MSG_YYYYMMDD, func );
}

/*
 * 入力チェック【年月】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckYm( obj ) {

    var func = "validateYm";
    return inputCheck( obj, ERR_MSG_YYYYMM, func );
}

/*
 * 入力チェック【半角数字】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckDigit( obj ) {

    var func = "validateDigit";
    return inputCheck( obj, ERR_MSG_DIGIT, func );
}

/*
 * 入力チェック【数値（整数）】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckNumeric( obj ) {

    var func = "validateNumeric";
    return inputCheck( obj, ERR_MSG_NUMERIC, func );
}

/*
 * 入力チェック【数値（小数点数）】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckDecimal( obj ) {

    var func = "validateDecimal";
    return inputCheck( obj, ERR_MSG_DECIMAL, func );
}

/*
 * 入力チェック【半角英字】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckAlpha( obj ) {

    var func = "validateAlpha";
    return inputCheck( obj, ERR_MSG_ALPHA, func );
}

/*
 * 入力チェック【半角英数字】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckAlnum( obj ) {

    var func = "validateAlnum";
    return inputCheck( obj, ERR_MSG_ALNUM, func );
}

/*
 * 入力チェック【半角文字】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckHalfSize( obj ) {

    var func = "validateHalfSize";
    return inputCheck( obj, ERR_MSG_HALFSIZE, func );
}

/*
 * 入力チェック【必須】
 *
 * param  obj     入力部品オブジェクト
 * return boolean チェック結果
 */
function inputCheckRequired( obj ) {

    var func = "validateRequired";
    return inputCheck( obj, ERR_MSG_REQUIRED, func );
}

/*
 * 入力チェック【checkbox必須】
 *
 * param  obj     チェックボックスオブジェクト
 * return boolean チェック結果
 */
function inputCheckChkRequired( obj ) {

    if ( isUndefined( obj ) || !obj ) {
        inputCheckError( obj, ERR_MSG_CHKREQUIRED );
        return false;
    }
    if ( getObjectType( obj ) != "checkbox" ) {
        return true;
    }
    if ( !obj.length ) {
        if ( !obj.checked ) {
            inputCheckError( obj, ERR_MSG_CHKREQUIRED );
            return false;
        } else {
            return true;
        }
    } else {
        for ( var i = 0; i < obj.length; i++ ) {
            if ( obj[ i ].checked == true ) {
                return true;
            }
        }
        inputCheckError( obj, ERR_MSG_CHKREQUIRED );
        return false;
    }
}

////////////////////////////////////////////////////////////
//  CONFIRM DIALOG
////////////////////////////////////////////////////////////

/*
 * 登録確認ダイアログ
 *
 */
function entryDialog() {

    return window.confirm( CNF_MSG_ENTRY );
}

/*
 * 更新確認ダイアログ
 *
 */
function updateDialog() {

    return window.confirm( CNF_MSG_UPDATE );
}

/*
 * 削除確認ダイアログ
 *
 */
function deleteDialog() {

    return window.confirm( CNF_MSG_DELETE );
}