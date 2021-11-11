// $Revision: 1.1 $
// $Date: 2017/03/13 08:11:14 $

/////////////////////////////////////////////////
//                  共通変数宣言               //
/////////////////////////////////////////////////

var YEARMIN = 1900;          // 年チェック最小値
var YEARMAX = 2100;       // 年チェック最大値
var MONTHMIN = 1;         // 月チェック最小値
var MONTHMAX = 12;        // 月チェック最大値
var DAYMIN = 1;           // 日チェック最小値
var DAYMAX = 31;          // 日チェック最大値
var NUMMAX_H = 9999999999.9;             // 数値最大値（小数部1桁）
var NUMMAX_J = 9999999999.99;            // 数値最大値（小数部2桁）
var NUMMAX_K = 9999999999.9999999999;    // 数値最大値（小数部10桁）
var NUMMAX_L = 9999999999.9999999999;    // 数値最小値（小数部10桁）
var NUMMIN_H = 0;                        // 数値最小値（小数部1桁）
var NUMMIN_J = 0;                        // 数値最小値（小数部2桁）
var NUMMIN_K = 0;                        // 数値最小値（小数部10桁）
var NUMMIN_L = -9999999999.9999999999;   // 数値最小値（小数部10桁）

var INTEGER_STR = "0123456789";
var DECIMAL_STR = ".0123456789";

/////////////////////////////////////////////////
// HEADLIST変数にチェックする種別を宣言
// nn:NULL/空文字をチェックする
// nu:NULL/空文字をチェックしない
/////////////////////////////////////////////////

var HEADLIST = new Array("nn", "nu");
var HEADATTR = new Array("nn", "nu");
var HEADERR = new Array("必須入力領域に値が入力されていません",
                        "削除するレコードを選択してください",
                        "削除可能なレコードは存在しません");

/////////////////////////////////////////////////
// CHECKLIST変数にチェックするTEXT領域の名前を宣言
// INT:1byte整数チェック
// DCM:1byte数値チェック(小数含む)
// DCH:1byte数値チェック(小数含む フォーマット：9999999999.9)
// DCJ:1byte数値チェック(小数含む フォーマット：9999999999.99)
// DCK:1byte数値チェック(小数含む フォーマット：9999999999.9999999999)
// DCL:1byte数値チェック(小数含む フォーマット：-9999999999.9999999999)
// TEXT:1byte/2byte混在テキスト
// SBTX:1byteテキストチェック
// MBTX:2byteテキストチェック
// YEAR:年(1byte整数,範囲：YEARMIN～YEARMAX)
// MNTH:月(1byte整数,範囲：MONTHMIN～MONTHMAX)
// DAY :日(1byte整数,範囲：DAYMIN～DAYMAX)
// DATE :年月日(1byte整数,範囲：YEARMIN～YEARMAX/MONTHMIN～MONTHMAX/DAYMIN～DAYMAX)
/////////////////////////////////////////////////

var CHECKLIST = new Array("INT","DCM","DCH","DCJ","DCK","DCL","TEXT","SBTX","MBTX","YEAR","MNTH","DAY","DATE");

/////////////////////////////////////////////////
// CHECKLISTに対応してCHECKATTR変数に呼び出すチェックルーチン名を宣言
// I:chkInteger
// G:chkDecimal
// H:chkDecimal_H(整数部10桁：小数部1桁：マイナスなし)
// J:chkDecimal_J(整数部10桁：小数部2桁：マイナスなし)
// K:chkDecimal_K(整数部10桁：小数部10桁：マイナスなし)
// L:chkDecimal_L(整数部10桁：小数部10桁：マイナスあり)
// T:なし
// 1:chk2byte
// 2:chkAll2byte
// Y:chkYear
// M:chkMonth
// D:chkDay
// W:chkDate
/////////////////////////////////////////////////

var CHECKATTR = new Array("I","G","H","J","K","L","T","1","2","Y","M","D","W");

/////////////////////////////////////////////////
// CHECKERRにエラー文言を宣言
/////////////////////////////////////////////////

var CHECKERR = new Array("整数を入力してください",
                         "数値を入力してください",
                         "数値を入力してください フォーマット：9999999999.9",
                         "数値を入力してください フォーマット：9999999999.99",
                         "数値を入力してください フォーマット：9999999999.9999999999",
                         "数値を入力してください フォーマット：±9999999999.9999999999",
                         "文字列を入力してください",
                         "1byte文字で入力してください",
                         "2byte文字で入力してください",
                         "YYYY(4桁西暦)を入力してください",
                         "MM(2桁月)を入力してください",
                         "DD(2桁日)を入力してください",
                         "YYYY/MM/DDの日付形式にて入力してください");

/////////////////////////////////////////////////
//                  日付取得                   //
/////////////////////////////////////////////////
// クライアント日付を出力する際に
// 同一の日付値を取得するため外部変数化
// 通常はサーバ側の日付、時間を使用する

var dat = new Date();

// クライアント年を取得
function getYear()
{
    return dat.getYear();
}

// クライアント月を取得
function getMonth()
{
	var month = dat.getMonth() + 1;
    if (month < 10) {
        // 月数の頭に'0'を付加
        month= "0" + month;
    }
    return month;
}

// クライアント日を取得
function getDay()
{
    var date = dat.getDate();
    if (date < 10) {
        // 日数の頭に'0'を付加
        date= "0" + date;
    }
    return date;
}

/////////////////////////////////////////////////
// 指定FORM中のNAME属性がnnで始まるTEXT領域    //
// の入力チェック                              //
// 必須入力項目のチェックに使用する。          //
/////////////////////////////////////////////////
function isNull(form)
{
    var i = 0;
    for (i = 0; i < form.length; i++) {
        if (form.elements[i].type == "text") {
            var name = form.elements[i].name;
            var flag = name.indexOf(HEADLIST[0],4);
            if (flag != -1 && (form.elements[i].value == "" || form.elements[i].value == null)) {
                form.elements[i].focus();
                return false;
            }
        }
    }
    return true;
}

/////////////////////////////////////////////////
//         入力データのチェック
/////////////////////////////////////////////////
function checkForm(form)
{
    if (isNull(form) != true) {
        alert(HEADERR[0]);
        return false;
    }
    var i = 0, k = 0;
    var flag = false;
    for (i = 0; i < form.length; i++) {
        if (form.elements[i].type == "text") {
            var name = form.elements[i].name;
            for (k = 0; k < CHECKLIST.length; k++) {
                flag = name.indexOf(CHECKLIST[k],6);
                if (flag == 6) {
                    break;
                }
            }
            var res, value;
            value = form.elements[i].value;
            if (value == "" || value.length == 0) {
                res = true;
            }
            else {
                switch(CHECKATTR[k]) {
                  case "I":
                    res = chkInteger(value);
                    break;
                  case "G":
                    res = chkDecimal(value);
                    break;
                  case "H":
                    res = chkDecimal_H(value);
                    break;
                  case "J":
                    res = chkDecimal_J(value);
                    break;
                  case "K":
                    res = chkDecimal_K(value);
                    break;
                  case "L":
                    res = chkDecimal_L(value);
                    break;
                  case "1":
                    res = chk2byte(value);
                    if (res == false) {
                        res = true ;
                    }
                    else {
                        res = false;
                    }
                    break;
                  case "2":
                    res = chkAll2byte(value);
                    break;
                  case "Y":
                    res = chkYear(value);
                    break;
                  case "M":
                    res = chkMonth(value);
                    break;
                  case "D":
                    res = chkDay(value);
                    break;
                  case "W":
                    res = chkDate(value);
                    break;
                }
            }
            if (res == false) {
                alert(CHECKERR[k]);
                form.elements[i].focus();
                return false;
            }
        }
    }
}

/////////////////////////////////////////////////
//                  画面操作関連               //
/////////////////////////////////////////////////
// 画面サイズ変更（最大サイズ相当）
function ResizeToMax(obj)
{
    var sWidth = obj.screen.availWidth;
    var sHeight = obj.screen.availHeight;
    obj.resizeTo(sWidth,sHeight);
    obj.moveTo(0,0);
    obj.focus();
}

/////////////////////////////////////////////////
//                  汎用                       //
/////////////////////////////////////////////////
// 文字列長チェック
function checkLength(obj, min_length, max_length)
{
    var len;
    if (obj == null) {
        return false;
    }
    len = getLength(obj.value);
    if (len < min_length || len > max_length) {
        dispLengthErr(min_length, max_length);
        obj.focus();
        return false;
    }
    return true;
}

// 入力値のNULLチェック
function checkNull(obj)
{
	if(obj != null) {
		// objが配列である場合
		if(obj.length > 0) {
		    var i;
		    for(i = 0; i < obj.length; i++) {
		    	if (obj[i].value == null || obj[i].value.length == 0) {
		        	alert(HEADERR[0]);
			        obj[i].focus();
		    	    return false;
		    	}
		    }
		}
		
		// objが配列ではない場合
		else {
		    if (obj.value == null || obj.value.length == 0) {
				alert(HEADERR[0]);
		        obj.focus();
		        return false;
		    }
		}
	}
	return true;
}


// チェックボックスが選択されていることをチェック
function checkCheckboxSelected(obj)
{
	if(obj != null) {
		// objが配列である場合
		if(obj.length > 0){
		    var i;
		    for(i = 0; i < obj.length; i++) {
				
				// チェックボックスが選択されている場合
				if(obj[i] != null && obj[i].checked == true){
					return true;
				}
				else{
			        obj[i].focus();
		        	continue;
				}
		    }
		    alert(HEADERR[1]);
			return false;
		}
		
		// objが配列ではない場合
		else{
			
			// チェックボックスが選択されている場合
			if(obj != null && obj.checked == true){
				return true;
			}
		    obj.focus();
		    alert(HEADERR[1]);
			return false;
		}
	} else {
		alert(HEADERR[2]);
		return false;
	}
	return false;
}


/////////////////////////////////////////////////
//                  日付チェック               //
/////////////////////////////////////////////////
// 指定FORM中のYEAR,MONTH,DAYで始まるTEXT領域の
// 数値をチェックする
// YEARは1900～2100,MONTHは1～12,DAYは1～31をチェック

// 年チェック
function checkYear(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkYear(obj.value) == false) {
        alert(CHECKERR[9]);
        obj.focus();
        return false;
    }
    return true;
}

// 月チェック
function checkMonth(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkMonth(obj.value) == false) {
        alert(CHECKERR[10]);
        obj.focus();
        return false;
    }
    return true;
}

// 日チェック
function checkDay(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDay(obj.value) == false) {
        alert(CHECKERR[11]);
        obj.focus();
        return false;
    }
    return true;
}

// 年月日チェック
function checkDate(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDate(obj.value) == false) {
        alert(CHECKERR[12]);
        obj.focus();
        return false;
    }
    return true;
}

/////////////////////////////////////////////////
//                  数値チェック               //
/////////////////////////////////////////////////
// 整数のみ
function checkInteger(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkInteger(obj.value) == false) {
        alert(CHECKERR[0]);
        obj.focus();
        return false;
    }
    return true;
}

// 小数点含む
function checkDecimal(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal(obj.value) == false) {
        alert(CHECKERR[1]);
        obj.focus();
        return false;
    }
    return true;
}

// 入力数値の範囲チェック(整数のみ)
function checkIntegerRange(obj, min, max)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkInteger(obj.value) == false) {
        alert(CHECKERR[0]);
        obj.focus();
        return false;
    }
    if (obj.value < min || obj.value > max) {
        dispRangeErr(min, max);
        obj.focus();
        return false;
    }
    return true;
}

// 入力数値の範囲チェック(小数含む)
function checkDecimalRange(obj, min, max)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal(obj.value) == false) {
        alert(CHECKERR[1]);
        obj.focus();
        return false;
    }
    if (obj.value < min || obj.value > max) {
        dispRangeErr(min, max);
        obj.focus();
        return false;
    }
    return true;
}

// 小数点含む(フォーマット：9999999999.9)
function checkDecimal_H(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_H(obj.value) == false) {
        alert(CHECKERR[2]);
        obj.focus();
        return false;
    }
    return true;
}

// 小数点含む(フォーマット：9999999999.99)
function checkDecimal_J(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_J(obj.value) == false) {
        alert(CHECKERR[3]);
        obj.focus();
        return false;
    }
    return true;
}

// 小数点含む(フォーマット：9999999999.9999999999)
function checkDecimal_K(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_K(obj.value) == false) {
        alert(CHECKERR[4]);
        obj.focus();
        return false;
    }
    return true;
}

// 小数点含む(フォーマット：-9999999999.9999999999)
function checkDecimal_L(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkDecimal_L(obj.value) == false) {
        alert(CHECKERR[5]);
        obj.focus();
        return false;
    }
    return true;
}

// テキスト
function checkText(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    return true;
}

// 1byte文字のチェック
function checkSingleByte(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chk2byte(obj.value) == true) {
        alert(CHECKERR[7]);
        obj.focus();
        return false;
    }
    return true;
}

// 2byte文字のチェック
function checkMultiByte(obj)
{
    if (obj == null) {
        return true;
    }
    if (isUndefined(obj) == true) {
        return true;
    }
    if (chkAll2byte(obj.value) == false) {
        alert(CHECKERR[8]);
        obj.focus();
        return false;
    }
    return true;
}

/////////////////////////////////////////////////
//                  内部関数                   //
/////////////////////////////////////////////////

// 年のチェック
function chkYear(value)
{
    var year = value;
    if (year.length == 0) {
        return true;
    }
    if (chkInteger(year) == false) {
        return false;
    }
    if (year < YEARMIN || year > YEARMAX) {
        return false;
    }
    return true;
}

// 月のチェック
function chkMonth(value)
{
    var month = value;
    if (month.length == 0) {
        return true;
    }
    if (chkInteger(month) == false) {
        return false;
    }
    if (month < MONTHMIN || month > MONTHMAX) {
        return false;
    }
    return true;
}

// 日のチェック
function chkDay(value)
{
    var day = value;
    if (day.length == 0) {
        return true;
    }
    if (chkInteger(day) == false) {
        return false;
    }
    if (day < DAYMIN || day > DAYMAX) {
        return false;
    }
    return true;
}

// 年月日のチェック
function chkDate(value)
{
    var monthdays0 = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
    var monthdays1 = new Array(31,29,31,30,31,30,31,31,30,31,30,31); // 閏年
    var date = value;
    var year, month, day;
    var leapyear = false;
    var dx;

    // 書式チェック(YYYY/MM/DD)
    if (date.length == 0) {
        return true;
    }
    if (date.length < 10) {
        return false;
    }
    year = date.substr(0,4);
    month = date.substr(5,2);
    day = date.substr(8,2);
    if (chkInteger(year) == false) {
        return false;
    }
    if (date.substr(4,1) != "/") {
        return false;
    }
    if (chkInteger(month) == false) {
        return false;
    }
    if (date.substr(7,1) != "/") {
        return false;
    }
    if (chkInteger(day) == false) {
        return false;
    }

    // 範囲チェック
    if (year < YEARMIN || year > YEARMAX) {
        return false;
    }
    if (month < MONTHMIN || month > MONTHMAX) {
        return false;
    }
    // 閏年？
    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        leapyear = true;
    }
    if (leapyear == false) {
        dx = monthdays0[eval(month) - 1];
    }
    else {
        dx = monthdays1[eval(month) - 1];
    }
    if (day < DAYMIN || day > dx) {
        return false;
    }
    return true;
}

// 数字チェックを行う(整数)
function chkInteger(str)
{
    if (chkChar(str, INTEGER_STR) == false) {
        return false;
    }
    return true;
}

// 数字チェックを行う(小数含む)
function chkDecimal(str)
{
    if (chkChar(str, DECIMAL_STR) == false) {
        return false;
    }
    if (chkDot(str) == false) {
        return false;
    }
    return true;
}

// 数字チェックを行う(小数含む。整数部10桁、小数部1桁、マイナス無し)
function chkDecimal_H(str)
{
    if (chkDecimal(str) == false) {
        return false;
    }
    if (chkFormat(str, 10, 1) == false) {
        return false;
    }
    return true;
}

// 数字チェックを行う(小数含む。整数部10桁、小数部2桁、マイナス無し)
function chkDecimal_J(str)
{
    if (chkDecimal(str) == false) {
        return false;
    }
    if (chkFormat(str, 10, 2) == false) {
        return false;
    }
    return true;
}

// 数字チェックを行う(小数含む。整数部10桁、小数部10桁、マイナス無し)
function chkDecimal_K(str)
{
    if (chkDecimal(str) == false) {
        return false;
    }
    if (chkFormat(str, 10, 10) == false) {
        return false;
    }
    return true;
}

// 数字チェックを行う(小数含む。整数部10桁、小数部10桁、マイナス有り)
function chkDecimal_L(str)
{
    var nstr;
    if (str.charAt(0) == "-") {
        nstr = str.substr(1);
    }
    else {
        nstr = str;
    }
    if (chkDecimal_K(nstr) == false) {
        return false;
    }
    return true;
}

// 文字の長さを取得する
function getLength(str)
{
    var i, cnt = 0;
    for(i = 0; i < str.length; i++) {
        if (isZenkaku(str.charCodeAt(i)) == true) {
            cnt += 2;
        }
        else {
            cnt++;
        }
    }
    return cnt;
}

// 2byte文字が含まれているかチェック
function chk2byte(str)
{
    var i;
    for(i = 0; i < str.length; i++) {
        if (isZenkaku(str.charCodeAt(i)) == true) {
            return true; // 2byte文字が含まれている
        }
    }
    return false; // 2byte文字は含まれていない
}

// 全て2byteかチェック
function chkAll2byte(str)
{
    var i;
    for(i = 0; i < str.length; i++) {
        if (isZenkaku(str.charCodeAt(i)) == false) {
            return false;
        }
    }
    return true;
}

// isUndefined
function isUndefined(obj)
{
    if (obj.toString() == "undefined") {
        return true;
    }
    return false;
}

// chkChar
function chkChar(str, chkstr)
{
    var flag = false;
    var i = 0, j = 0;
    for (i = 0; i < str.length; i++) {
        flag = false;
        for(j = 0; j < chkstr.length; j++) {
            if (str.charAt(i) == chkstr.charAt(j)) {
                flag = true;
                break;
            }
        }
        if (flag != true) {
            return false;
        }
    }
    return true;
}

// chkDot
function chkDot(str)
{
    var first, last;
    first = str.indexOf(".");
    last = str.lastIndexOf(".");
    if (first == last) {
        return true;
    }
    return false;
}

// chkFormat
function chkFormat(str, left, right)
{
    var dot = str.indexOf(".");
    if (dot == -1) { // 小数点なし
        if (str.length > left) {
            return false;
        }
        return true;
    }
    if (dot > left) {
        return false;
    }
    if ((str.length - dot) > (right + 1)) {
        return false;
    }
    return true;
}

// isZenkaku
function isZenkaku(code)
{
    // ASCIIコード
    if ((code != 0x9 || code != 0x0A || code != 0x0D || code != 0x20) && (code <= 0x7F)) {
        return false;
    }
    // 半角カナチェック
    if ((code >= 0xFF6C && code <= 0xFF9F) || (code >= 0xFF66 && code <= 0xFF6B) || (code >= 0xFF61 && code <= 0xFF63) && (code != 0x30FB)) {
        return false;
    }
    return true;
}

// ブラウザ
function getAppName()
{
    return navigator.appName;
}

/////////////////////////////////////////////////
//                  エラー表示
/////////////////////////////////////////////////
function dispLengthErr(min, max)
{
    if (min == max) {
        alert(min + "文字の値を入力してください");
    }
    else{
        alert(min + "文字～" + max + "文字の値を入力してください");
    }
}

function dispRangeErr(min, max)
{
    alert(min + "～" + max + "の範囲の値を入力してください");
}


////////////////////////////////////////////////////////////
//  PAGE CONTROLLER FUNCTION
////////////////////////////////////////////////////////////

/*
 * ページ制御
 *
 * param formobj フォームオブジェクト
 * param row     検索開始行
 */
function pageLink( formobj, row ) {

    formobj.orteusBeginRow.value = row;
    formobj.submit();
}