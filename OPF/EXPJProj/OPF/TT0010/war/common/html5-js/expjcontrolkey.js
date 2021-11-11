//========================================================
// キー入力制御
//========================================================
// 名前空間チェック
if (typeof(expj) === 'undefined' || expj === null) {
  expj = {};
}
if (typeof(expj.common) === 'undefined' || expj.common === null) {
  expj.common = {};
}
if (typeof(expj.common.version) === 'undefined' || expj.common.version === null) {
  expj.common.version = {};
}
/**
 * バージョン表記（名前空間チェックも含む）
 */
expj.common.version.expjcontrolkey = 'expjcontrolkey.js Ver1.0.1';

/**
 * キー制御用名前空間の定義
 */
var _expj_controlKey = {};

/**
 * デバッグモードを設定する変数。
 * trueだとデバッグモードになる。
 */
_expj_controlKey.DEBUG_MODE = false;

/**
 * 禁止するキーのマップ
 */
_expj_controlKey.disabledKeys = [
  {
    // [Alt] + [←]
    'keyCode': 37,  // 禁止対象にするキーコード
    'shift': false, // Shiftキーと同時押しが対象か
    'ctrl': false,  // Ctrlキーと同時押しが対象か
    'alt': true,    // Altキーと同時押しが対象か
    'text': false   // テキストフィールドでは有効にするか
  },
  {
    // [Alt] + [→]
    'keyCode': 39,
    'shift': false,
    'ctrl': false,
    'alt': true,
    'text': false
  },
  {
    // [F5]
    'keyCode': 116,
    'shift': false,
    'ctrl': false,
    'alt': false,
    'text': false
  },
  {
    // [Ctrl] + [F5]
    'keyCode': 116,
    'shift': false,
    'ctrl': true,
    'alt': false,
    'text': false
  },
  {
    // [Ctrl] + [N]
    'keyCode': 78,
    'shift': false,
    'ctrl': true,
    'alt': false,
    'text': false
  },
  {
    // [BackSpace] *テキスト項目にフォーカスがある場合は有効
    'keyCode': 8,
    'shift': false,
    'ctrl': false,
    'alt': false,
    'text': true
  },
  {
    // [Ctrl] + [Z] *テキスト項目にフォーカスがある場合は有効
    'keyCode': 90,
    'shift': false,
    'ctrl': true,
    'alt': false,
    'text': false
  }
];

_expj_controlKey.keyDownHandler = function (event) {
  var result = _expj_controlKey.isDisabled(event);
  if (result) {
    var message = '';
    if (event.ctrlKey) {
      message += '[Ctrl] + ';
    }
    if (event.altKey) {
      message += '[Alt] + ';
    }
    if (event.shiftKey) {
      message += '[Shift] + ';
    }
    message += '[' + event.key + ']';
    alert(message + ' Key is disabled.');
    event.preventDefault(); // デフォルト動作無効
  }
};

_expj_controlKey.isDisabled = function(event) {
  var disableList = _expj_controlKey.disabledKeys;
  for (var i = 0; i < disableList.length; ++i) {
    var key = disableList[i];
    if (key.keyCode === event.keyCode) {
      if (key.shift === event.shiftKey) {
        if (key.ctrl === event.ctrlKey) {
          if (key.alt === event.altKey) {
            if (!key.text || ((key.text) && (document.activeElement.type !== 'text' && document.activeElement.type !== 'password'))) {
              return true;
            }
          }
        }
      }
    }
  }
  return false;
};

$(function () {
  if (_expj_controlKey.DEBUG_MODE === false) {
    // キーイベントハンドラ登録
    window.addEventListener('keydown', _expj_controlKey.keyDownHandler, true);
  }
});