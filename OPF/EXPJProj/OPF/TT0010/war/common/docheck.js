//------------------------------------------------------------------------------
// (#)docheck.js
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/07/24 version 1.00 新規作成  K.Shiraki
// 2003/08/08 version 1.01 Y.Inada
//            submit可能かどうかの確認時、submit済の場合にメッセージを
//            表示するよう修正
// 2003/08/25 version 1.02 K.Shiraki
//            メッセージ表示関数名変更
// 2003/10/03 version 1.03 K.Shiraki
//            正規の終了処理でない場合に警告を出力する仕組みを追加
//            onUnload時に指定する関数(confirmIfIllegal) 追加
//            close()実行前に実行する関数(preClose) 追加
// 2003/10/06 version 1.04 K.Shiraki
//            リロード予定フラグの初期値変更  予定あり(true)→予定なし(false)
//            ロード時処理から リロード予定フラグの操作廃止
//------------------------------------------------------------------------------

/** 画面表示完了フラグ */
var g_completed = false;

/** submit済フラグ */
var g_submitted = false;

/** リロード予定フラグ */
var g_maybeLegalUnload = false;

/**
 * 画面表示完了設定<br>
 * <br>
 * bodyのonLoadで実行すること。
 */
function setCompleted() { g_completed = true; }

/**
 * submit可能かどうかの確認<br>
 * <br>
 * submitが発生するイベントの先頭で本関数を実行し submit可か確認すること。
 * 本関数の戻りがfalseの場合 イベントの戻りをfalseで終了すること。
 *
 * @return true:可/false:不可
 */
function canSubmit() {
    // 表示未完了のとき 何もせず終了
    if(g_completed == false)  return false;

    // submit済
    if(g_submitted){
    	displayErrorMessage("ZZ01110");
        return false;
    }

    // OK
    return true;
}

/**
 * submit実行直前処理<br>
 * <br>
 * submitを実行する直前で本関数を実行すること。
 * ただし submitの結果 別画面を表示/描画するときは 実行しない。
 */
function preSubmit(){
	g_submitted = true;
	g_maybeLegalUnload = true;
}

/**
 * 画面アンロード時処理
 *
 * body の onBeforeUnloadで実行すること。
 */
function confirmIfIllegal() {
	if(g_maybeLegalUnload == false)
		window.event.returnValue = getMessageOnly("ZZ01117");
	return;
}

/**
 * 画面終了時処理
 *
 * html内のscriptでclose()を呼ぶ前に実行すること。
 */
function preClose() { g_maybeLegalUnload = true; }
