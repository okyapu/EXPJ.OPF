/*
 * Copyright (c) 2003-2004 NEC Corporation
 * Copyright (c) 2003-2004 NEC informatec Systems,Ltd.
 *
 * AL0040010：複数工程日別負荷参照画面用JavaScript関数群
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/jsp/common/AL0040010.js,v $
 * $Author: shakya $
 * $Revision: 1.2 $ $Date: 2005/04/05 07:54:44 $
 */

/**
 * 読込ボタン押下時の処理
 */
function checkSelectKey(frmMe)
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

	// 検索時のチェック
	if (isNull(frmMe.DateFrom) == true || isNull(frmMe.DateTo) == true) {
		// 期間(From), 期間(To)のいずれかがNullの場合
		addErrorMessage("ZZ01104");
	}

	if (isDate(frmMe.DateFrom) == false) {
		// 期間(From)が日付として正しくない場合
		addErrorMessage("AL40011");
	}

	if (isDate(frmMe.DateTo) == false) {
		// 期間(To)が日付として正しくない場合
		addErrorMessage("AL40012");
	}

	if (isNull(frmMe.DateFrom) == false && isNull(frmMe.DateTo) == false
			&& isDate(frmMe.DateTo) == true && isDate(frmMe.DateFrom) == true) {
		// 期間(From), 期間(To)のいずれも日付として正しい場合

		// 期間の大小をチェック
		if (Date.parse(frmMe.DateFrom.value) > Date.parse(frmMe.DateTo.value)) {
			addErrorMessage("AL04001");
		}

		// 90日以内かをチェック
		ChangeDay = new Date(frmMe.DateFrom.value);
		Day = 24 * 60 * 60 * 1000;
		if (Date.parse(frmMe.DateTo.value) > ChangeDay.setTime(ChangeDay.getTime() + Day * 89)) {
			addErrorMessage("AL04002");
		}
	}

	// エラーメッセージを表示
	if (displayErrorMessages()) {
		return false;
	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

/**
 * サブ(子)画面戻るボタン押下時の処理
 */
function checkCancel1(frmMe)
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

	// 確認ダイアログを表示
	if (displayConfirmMessage("ZZ07013") == false) {
		return false;
	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

/**
 * サブ(孫)画面戻るボタン押下時の処理
 */
function checkCancel2(frmMe)
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

	// 確認ダイアログを表示
	if (displayConfirmMessage("ZZ07013") == false) {
		return false;
	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

/**
 * グラフ移動時のチェック処理
 */
function checkSelGraph(frmMe)
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

	if (isNull(frmMe.Shift_Date) == true) {
		// 移動日数がNullの場合
		addErrorMessage("ZZ05002");
		displayErrorMessages();
		_another_exit = 0;
		_dupl_submit = 0;
		return false;
	}
	if (isInteger(frmMe.Shift_Date) == false) {
		// 移動日数が数値でないの場合
		addErrorMessage("ZZ05002");
		displayErrorMessages();
		_another_exit = 0;
		_dupl_submit = 0;
		return false;
	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

/**
 * クリアボタン押下時の処理
 */
function clickClear(frmMe)
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

	// 確認ダイアログを表示
	if (displayConfirmMessage("ZZ07008") == false) {
		return false;
	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

/**
 * 閉じるボタン押下時の処理
 */
function clickClose()
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

//	// 確認ダイアログを表示
//	if (displayConfirmMessage("ZZ01112") == false) {
//		return false;
//	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

/**
 * アンカークリックの処理
 */
function clickAnchor()
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

/**
 * グラフハイパーリンククリックの処理
 */
function clickHyperlink()
{
	// submit可能かどうかを確認
	if (canSubmit() == false) {
		return false;
	}

	// submit済フラグを設定
	preSubmit();
	return true;
}

// --- from docheck.js ---

/** 画面表示完了フラグ */
var g_completed = false;

/** submit済フラグ */
var g_submitted = false;

/** リロード予定フラグ */
var g_maybeLegalUnload = false;

/**
 * 画面表示完了設定
 * 注意：bodyのonLoadで実行すること。
 */
function setCompleted()
{
	g_completed = true;
}

/**
 * submit可能かどうかの確認
 * 注意：submitが発生するイベントの先頭で本関数を実行し submit可か確認すること。
 *       本関数の戻りがfalseの場合 イベントの戻りをfalseで終了すること。
 *
 * @return true:可/false:不可
 */
function canSubmit()
{
    // 表示未完了のとき 何もせず終了
    if (g_completed == false) {
		return false;
	}

    // submit済
    if (g_submitted) {
    	displayErrorMessage("ZZ01110");
        return false;
    }

    // OK
    return true;
}

/**
 * submit実行直前処理
 * 注意：submitを実行する直前で本関数を実行すること。
 *       ただし submitの結果 別画面を表示/描画するときは 実行しない。
 */
function preSubmit()
{
	g_submitted = true;
	g_maybeLegalUnload = true;
}

/**
 * 画面アンロード時処理
 * 注意：body の onBeforeUnloadで実行すること。
 */
function confirmIfIllegal()
{
	if (g_maybeLegalUnload == false) {
		window.event.returnValue = getMessageOnly("ZZ01117");
	}
}

/**
 * 画面終了時処理
 * 注意：html内のscriptでclose()を呼ぶ前に実行すること。
 */
function preClose()
{
	g_maybeLegalUnload = true;
}

// --- from metamorbase.js ---

/////////////////////////////////////////////////
//                  共通変数宣言               //
/////////////////////////////////////////////////

var _another_exit = 0; // ボタン押下のフラグ。リロード（画面終了含む）の場合はボタン押下による意図したものであれば画面移動（終了）の当否を問う。
var _dupl_submit = 0; // 二度押し状態のフラグ。ボタン押下後、画面のリロード開始まで（サーバ処理中）のボタン押下を拒否する。

/////////////////////////////////////////////////
//                  汎用                       //
/////////////////////////////////////////////////
var YEARMIN     = 1;           // 年チェック最小値
var YEARMAX     = Infinity;    // 年チェック最大値
var MONTHMIN    = 1;           // 月チェック最小値
var MONTHMAX    = 12;          // 月チェック最大値
var DAYMIN      = 1;           // 日チェック最小値
var DAYMAX      = 31;          // 日チェック最大値


/**
 * 入力値のNULLチェック
 *
 * @param obj チェック対象オブジェクト
 */
function isNull(obj)
{
	if (obj.value == null || obj.value.length == 0) {
		return true;
	}
	chkstr = obj.value.replace(/^\s+|\s+$/g, "");
	if (chkstr == null || chkstr.length == 0) {
		return true;
	}
	return false;
}

/**
 * 日付チェック
 *
 * @param obj チェック対象オブジェクト
 */
function isDate(obj)
{
	if (obj.value == null || obj.value.length == 0) {
		return true;
	}
	var date = obj.value;

	if (date.length < 8 || date.length > 10) {
		return false;
	}
	if (!date.match(/(^[0-9]{4,4})\/([0-9]{1,2})\/([0-9]{1,2})$/)) {
		return false;
	}
	var year = RegExp.$1;
	var month = RegExp.$2;
	var day = RegExp.$3;

	var Monthdays = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
	// 年、うるう年の設定
	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
		Monthdays[1] = 29;
	}
	// 年チェック
	if (isNaN(year) || year < YEARMIN || year > YEARMAX) {
		return false;
	}
	// 月チェック
	if (isNaN(month) || month < MONTHMIN || month > MONTHMAX) {
		return false;
	}
	// 日チェック
	DAYMAX = Monthdays[month - 1];
	if (isNaN(day) || day < DAYMIN || day > DAYMAX) {
		return false;
	}

	return true;
}

/**
 * 整数値チェック
 *
 * @param obj チェック対象オブジェクト
 */
function isInteger(obj)
{
	if (obj.value == null || obj.value.length == 0) {
		return true;
	}
	var str = obj.value;
	if (!str.match(/^[-+]?[0-9]+$/)) {
		return false;
	}
	return true;
}

