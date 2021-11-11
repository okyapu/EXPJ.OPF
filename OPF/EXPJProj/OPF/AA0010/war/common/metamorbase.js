// $Revision: 1.1 $
// $Date: 2017/03/13 08:10:53 $
// $Revision: 1.1 $
// $Date: 2017/03/13 08:10:53 $
// $Revision: 1.1 $
// $Date: 2017/03/13 08:10:53 $
//  isNull,isDate,isNumeric,isTelNo,isZipCode,isMailAdress追加
// $Revision: 1.1 $
// $Date: 2017/03/13 08:10:53 $
//  isNullの返り値のtrue,falseを逆転
// $Date: 2017/03/13 08:10:53 $
//  resetLockにて「閉じるボタン」以外の画面終了と画面移動への対処（メッセージ表示）
//  submitExitのwindow.closeを取りやめて、画面に送信するように修正。
//  isNullのチェック基準を修正(半角スペースのみの文字列はNullと判定する)
//  ボタン押下処理全般についてメッセージを修正
//  ボタン押下処理chkNone,chkSelect,chkDelete,chkInsert,chkUpdateの共通部分を関数化
//  →_submitFlagSet,_submitFlagCheck,_checkKey,_checkKeyRead,_checkKeyChange,_checkForm
//  ボタン押下時の処理としてchkClear,chkExecute,chkPdfOut,chkCsvOutを追加。
//  不適当だったコメントを修正
// $Date: 2017/03/13 08:10:53 $
//  従来のsubmitExitと同様にwindow.closeを行うsimpletExitを追加。
//  不適当だったコメントを修正
// $Date: 2017/03/13 08:10:53 $
//  小数点付きの表記でも、「.0」は整数と見なすfunction isIntegerByValue( obj )を追加。
// $Date: 2017/03/13 08:10:53 $
//  function isDate( obj )の年５桁以上を許すバグを修正
//  
//

/////////////////////////////////////////////////
//                  共通変数宣言               //
/////////////////////////////////////////////////

var _load_complete = 0; // 読み込み完了のフラグ。画面の読み込み完了までのボタン押下を拒否するためのチェック用。
var _another_exit = 0; // ボタン押下のフラグ。リロード（画面終了含む）の場合はボタン押下による意図したものであれば画面移動（終了）の当否を問う。
var _dupl_submit = 0; // 二度押し状態のフラグ。ボタン押下後、画面のリロード開始まで（サーバ処理中）のボタン押下を拒否する。

// 画面読み込み完了時の処理。
function loadComplete(obj) {
// 画面の読み込みが完了したときに、フラグをＯＮにする。
    _load_complete = 1;
    var str = obj.document.header.DOWNLOAD_FILE.value;
    var temp = obj.window.location.pathname.split("/");;
    var url = obj.window.location.protocol + "//" + obj.window.location.host + "/" + temp[1] + str;
    if(str.length > 0) {
        var newWin = window.open(url);
    }
}

// ボタン押下によるフラグセット
function _submitFlagSet(_dupl) {
    _another_exit = 1;
    _dupl_submit = _dupl;
}

// 意図しないリロードまたは画面の終了時に本当に画面移動（終了）するか否かを問う。
function resetLock() {
    if(_another_exit == 0) {
        window.event.returnValue=getMessageOnly("ZZ01117"); // 画面移動（終了）するか否かを問う
    }
}

// 閉じるボタン処理
function simpleExit() {
// 閉じるボタンを押されたときにウィンドウを閉じる。
    // 閉じるボタンはフラグをノーチェック
    if(displayConfirmMessage("ZZ01112") == false) {
        return false;
    }
    _submitFlagSet(0);
    window.close();
    return true;
}

// 閉じるボタン処理
function submitExit(frmMe) {
// 閉じるボタンを押されたときに業務ロック解除用の送信を行う。
    // 閉じるボタンはフラグをノーチェック
    if(displayConfirmMessage("ZZ01112") == false) {
        return false;
    }

    _submitFlagSet(1);
    return true;
}

// ボタン押下の可否をフラグでチェックする
function _submitFlagCheck() {
    if(_load_complete == 0) { // 表示完了チェック
        return false;
    }
    if(_dupl_submit == 1) { // ボタン二度押しチェック
        addErrorMessage("ZZ01110");
        displayErrorMessages();
        return false;
    }
}

// キー入力チェック
function _checkKey(frmMe) {
    if(checkKey(frmMe) == false) { // キー値入力チェック
        addErrorMessage("ZZ05104");
        displayErrorMessages();
        return false;
    }
    return true;
}

// キー入力チェック(更新・削除)
function _checkKeyRead(frmMe) {
    if(checkKey(frmMe) == false) { // キー値入力チェック
        addErrorMessage("ZZ01114");
        displayErrorMessages();
        return false;
    }
    return true;
}

// キー変更済みチェック
function _checkKeyChange(frmMe) {
    if(checkKeyChange(frmMe) == true) { // キー変更ありはエラー
        addErrorMessage("ZZ01111");
        displayErrorMessages();
        return false;
    }
    return true;
}

// 必須項目入力チェック
function _checkForm(frmMe) {
    if(checkForm(frmMe) == false) { // 必須項目入力チェック
        addErrorMessage("ZZ05106");
        displayErrorMessages();
        return false;
    }
    return true;
}

// 項目チェック無しのボタン処理
function chkNone(frmMe) {
// 何もチェックを行わないボタン押下時のフラグ設定処理のみを行う。
    if(_submitFlagCheck() == false) return false;

    _submitFlagSet(1);
    return true;
}

// 検索ボタン用
function chkSelect(frmMe) {
// 検索時のチェック。キー値の入力チェックを行う。
    if(_submitFlagCheck() == false) return false;
    if(_checkKey(frmMe) == false) return false; // キー値入力チェック

    _submitFlagSet(1);
    return true;
}

// 削除ボタン用
function chkDelete(frmMe) {
// 削除時のチェック。キー値の入力チェックと、hiddenのキー値からの未変更チェックを行う。
    if(_submitFlagCheck() == false) return false;
    if(_checkKeyRead(frmMe) == false) return false; // キー値入力チェック
    if(_checkKeyChange(frmMe) == false) return false; // キー変更ありはエラー
    if(displayConfirmMessage("ZZ07004") == false) return false; // 削除しますか？

    _submitFlagSet(1);
    return true;
}

// 登録ボタン用
function chkInsert(frmMe) {
// 登録時のチェック。キー値の入力チェックと、キー値以外の必須項目の入力チェックと形式チェックを行う。
    if(_submitFlagCheck() == false) return false;
    if(_checkKey(frmMe) == false) return false; // キー値入力チェック
    if(_checkForm(frmMe) == false) return false; // 必須項目入力チェック
    if(displayConfirmMessage("ZZ07001") == false) return false; // 登録しますか？

    _submitFlagSet(1);
    return true;
}

// 更新ボタン用
function chkUpdate(frmMe) {
// 変更時のチェック。キー値の入力チェックと、キー値以外の必須項目の入力チェックと形式チェックを行う。
    if(_submitFlagCheck() == false) return false;
    if(_checkKeyRead(frmMe) == false) return false; // キー値入力チェック
    if(_checkKeyChange(frmMe) == false) return false; // キー変更ありはエラー
    if(_checkForm(frmMe) == false) return false; // 必須項目入力チェック
    if(displayConfirmMessage("ZZ07003") == false) return false; // 更新しますか？

    _submitFlagSet(1);
    return true;
}

// クリアボタン用
function chkClear(frmMe) {
// クリアボタン押下時の確認。
    if(_submitFlagCheck() == false) return false;
    if(displayConfirmMessage("ZZ07008") == false) return false; // クリアしますか？

    _submitFlagSet(1);
    return true;
}

// バッチ実行ボタン用
function chkExecute(frmMe) {
// バッチ実行時検索時のチェック。キー値の入力チェックと、キー値以外の必須項目の入力チェックと形式チェックを行う。
    if(_submitFlagCheck() == false) return false;
    if(_checkKey(frmMe) == false) return false; // キー値入力チェック
    if(_checkForm(frmMe) == false) return false; // 必須項目入力チェック
    if(displayConfirmMessage("ZZ07010") == false) return false; // バッチ実行しますか？

    _submitFlagSet(1);
    return true;
}

// PDF出力ボタン用
function chkPdfOut(frmMe) {
// PDF出力時のチェック。キー値の入力チェックを行う。
    if(_submitFlagCheck() == false) return false;
    if(_checkKey(frmMe) == false) return false; // キー値入力チェック
    if(_checkKey(frmMe) == false) return false; // キー値入力チェック
    if(displayConfirmMessage("ZZ07012") == false) return false; // PDF出力しますか？

    _submitFlagSet(1);
    return true;
}

// CSV出力ボタン用
function chkCsvOut(frmMe) {
// 検索時のチェック。キー値の入力チェックを行う。
    if(_submitFlagCheck() == false) return false;
    if(_checkKey(frmMe) == false) return false; // キー値入力チェック
    if(displayConfirmMessage("ZZ07011") == false) return false; // CSV出力しますか？

    _submitFlagSet(0);
    return true;
}

/////////////////////////////////////////////////
//                  汎用                       //
/////////////////////////////////////////////////
var YEARMIN     = 1;           // 年チェック最小値
var YEARMAX     = Infinity;    // 年チェック最大値
var MONTHMIN    = 1;           // 月チェック最小値
var MONTHMAX    = 12;          // 月チェック最大値
var DAYMIN      = 1;           // 日チェック最小値
var DAYMAX      = 31;          // 日チェック最大値


//入力値のNULLチェック
function isNull( obj ){
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	chkstr=obj.value.replace(/^\s+|\s+$/g,"");
	if ( chkstr == null || chkstr.length == 0  ){
		return true;
	}
	return false;
}


//日付チェック
function isDate( obj ){
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	var date = obj.value;

	if(date.length < 8 || date.length > 10) return false;
	if(!date.match(/(^[0-9]{4,4})\/([0-9]{1,2})\/([0-9]{1,2})$/)){
		return false;
	}
	var year = RegExp.$1;
	var month = RegExp.$2;
	var day = RegExp.$3;

	var Monthdays = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
	// 年、うるう年の設定
	if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
		Monthdays[1] = 29;
	}
	// 年チェック
	if(isNaN(year) || year < YEARMIN || year > YEARMAX) {
		return false;
	}
	// 月チェック
	if(isNaN(month) || month < MONTHMIN || month > MONTHMAX) {
		return false;
	}
	// 日チェック
	DAYMAX = Monthdays[month-1];
	if(isNaN(day) || day < DAYMIN || day > DAYMAX) {
		return false;
	}

	return true;
}


//整数値チェック(小数形式表記でもOKとする)
function isIntegerByValue( obj ){
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	if(!chkNumeric(obj.value)) {
		return false;
	}
	var str = obj.value.replace(/\.0+$/g,"");
	if(!str.match(/^[-+]?[0-9]+$/)) {
		return false;
	}
	return true;
}

//整数値チェック
function isInteger( obj ){
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	var str = obj.value;
	if(!str.match(/^[-+]?[0-9]+$/)) {
		return false;
	}
	return true;
}

//小数チェック
function isNumeric(obj, upper, lower)
{
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	if(!chkNumeric(obj.value) || !chkNumericLength(obj.value, upper, lower)) {
		return false;
	}
	return true;
}

function chkNumericLength(str, upper, lower)
{
	if(!lower || str.indexOf(".") == -1) {
		var top = str.substring(0,1);
		if(top == "+" || top == "-"){
			upper = upper + 1;
		}
		if(str.length > upper) {
			return false;
		}
	}
	else {
		var obj= str.split(".");
		var top = obj[0].substring(0,1);
		if(top == "+" || top == "-"){
			upper = upper + 1;
		}
		if(obj[0].length > upper || obj[0].length <= 0){
			return false;
		}
		if(obj[1].length > lower || obj[1].length <= 0)  return false;
	}

	return true;
}

function jikken(obj,upper,lower){
	return chkNumericLength(obj.value, upper, lower);
}

function chkNumeric(str)
{
	if(!str.match(/^[-+]?([0-9]*)\.?([0-9]*)$/)) {
		return false;
	}
	else {
		var int_part = RegExp.$1;
		var dec_part = RegExp.$2;

		if(!int_part && !dec_part) {
			return false;
		}
	}
	return true;
}


//メールチェック
function isMailAddress( obj ) {
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	var str = obj.value;
	if(!str.match(/^[^()\[\]<>@\\:;\,"\b\s]+@(.+)$/)) {
		return false;
	}
	var domain = RegExp.$1;
	if(!chkDomain(domain)) {
		return false;
	}
	return true;
}

//ドメインチェック
function chkDomain(str) {
	if(!str.match(/^[A-Za-z0-9\-_]+(\.[A-Za-z0-9\-_]+)*(\.[A-Za-z0-9]+)$/)) {
		return false;
	}
	return true;
}

//郵便番号チェック
function isZipCode( obj ) {
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	var str = obj.value;
	if(str.length == 8) {
		if(str.match(/^\d{3}-\d{4}$/)) return true;
	}
	return false;
}

//電話番号チェック
// 　          0344445555（整数のみ）
// 　          090-9999-9999、0120-444-444、0-123-456-7890（ハイフンを含む）
function isTelNo( obj ) {
	if ( obj.value == null || obj.value.length == 0 ){
		return true;
	}
	var str = obj.value;
	if(str.length <= 15) {
		var temp = str.split("-");
		for(var i = 0; i < temp.length; i++) {
			if(temp[i].length == 0 || isNaN(temp[i])) return false;
		}
		return true;
	}
	return false;
}

