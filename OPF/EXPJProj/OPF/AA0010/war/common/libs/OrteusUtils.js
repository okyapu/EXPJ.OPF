// ----- 名前空間の確認と設定 -----
if (typeof(com) === 'undefined' || com === null) {
  var com = {};
}
if (typeof(com.nec) === 'undefined' || com.nec === null) {
  com.nec = {};
}
if (typeof(com.nec.jp) === 'undefined' || com.nec.jp === null) {
  com.nec.jp = {};
}
if (typeof(com.nec.jp.orteus) === 'undefined' || com.nec.jp.orteus === null) {
  com.nec.jp.orteus = {};
}
if (typeof(com.nec.jp.orteus.utils) === 'undefined' || com.nec.jp.orteus.utils === null) {
  com.nec.jp.orteus.utils = {};
}
//----- 名前空間の確認と設定(終了) -----

//----- バージョン情報 -----
com.nec.jp.orteus.utils.version = 'OrteusUtils.js Version1.0.0';
//----- バージョン情報(終了) -----

/**
 * クライアント環境を解析した結果をJSON形式で格納するフィールド。
 */
com.nec.jp.orteus.utils.ClientInfo = (function () {
  // ユーザエージェントを解析した結果を格納するJSONオブジェクト。
  var clientInfo = {};
  
  // ユーザエージェントを取得する。
  var userAgent = window.navigator.userAgent.toLowerCase();
  
  // 端末情報を解析する。一時的な関数を生成・実行し、その結果(JSON)を格納する。
  // ここで生成するデータは「com.nec.jp.orteus.utils.ClientInfo.terminal.***」で参照することができる。
  clientInfo.terminal = (function () {
    // OSや端末種類(タブレットなど）を格納する領域。
    // 今は使わないが、予約領域としておく。
    return {};
  })();
  
  // ブラウザ情報を解析する。一時的な関数を生成・実行し、その結果(JSON)を格納する。
  // ここで生成するデータは「com.nec.jp.orteus.utils.ClientInfo.browser.***」で参照することができる。
  clientInfo.browser = (function () {
    var browserInfo = {};
    // ブラウザ判定が行えるフィールドを初期化する。
    // 今はメジャーなものだけを用意し、必要があったら追加していく。
    browserInfo.isMSIE = false;
    browserInfo.isEdge = false;
    browserInfo.isChrome = false;
    browserInfo.isFirefox = false;
    browserInfo.isSafari = false;
    browserInfo.isOpera = false;
    browserInfo.isGecko = false;
    browserInfo.applicationName = '';

    // アプリケーション情報をユーザエージェントから解析する共通関数定義
    // 第一引数にセットしたい
    var setApplicationInfo = function (name, key) {
      var startIndex = -1, endIndex = -1;
      // アプリケーション名の設定
      browserInfo.applicationName = name;
      // バージョン記述の先頭を探索する
      startIndex = userAgent.indexOf(key) + key.length;
      // バージョン記述の末尾を探索する
      endIndex = userAgent.indexOf(' ', startIndex);
      if (endIndex === -1) {
        endIndex = userAgent.length;
      }
      // バージョン情報を設定
      browserInfo.version = userAgent.substring(startIndex, endIndex);
    };
    
    // ユーザエージェントを解析し、ブラウザごとに固有の処理を行う。
    // 単純な文字列比較で判定しているため、ユーザエージェント内に複数のブラウザを示すものは誤判定される場合もある。
    // if文の順番は適宜入れ替えること。
    if (userAgent.indexOf('msie') > -1) {
      // IE専用ロジック（11は含まない）
      browserInfo.isMSIE = true;
      browserInfo.applicationName = 'Internet Explorer';
      if (userAgent.indexOf('msie 6.') > -1) {
        browserInfo.version = 6;
      } else if (userAgent.indexOf('msie 7.') > -1) {
        browserInfo.version = 7;
      } else if (userAgent.indexOf('msie 8.') > -1) {
        browserInfo.version = 8;
      } else if (userAgent.indexOf('msie 9.') > -1) {
        browserInfo.version = 9;
      } else if (userAgent.indexOf('msie 10.') > -1) {
        browserInfo.version = 10;
      } else {
        // 6~10ではなかった場合は5と設定する
        browserInfo.version = 5;
      }
    } else if (userAgent.indexOf('trident') > -1) {
      // IE11専用ロジック
      browserInfo.isMSIE = true;
      browserInfo.applicationName = 'Internet Explorer';
      browserInfo.version = 11;
    } else if (userAgent.indexOf('edge') > -1) {
      // Microsoft Edge専用ロジック
      browserInfo.isEdge = true;
      setApplicationInfo('Microsoft Edge', 'edge/');
    } else if (userAgent.indexOf('chrome') > -1) {
      // Google Chrome専用ロジック
      browserInfo.isChrome = true;
      setApplicationInfo('Google Chrome', 'chrome/');
    } else if (userAgent.indexOf('firefox') > -1) {
      // Firefox専用ロジック
      browserInfo.isFirefox = true;
      setApplicationInfo('Mozilla Firefox', 'firefox/');
    } else if (userAgent.indexOf('safari') > -1) {
      // Safari専用ロジック
      browserInfo.isSafari = true;
      setApplicationInfo('Safari', 'safari/');
    } else if (userAgent.indexOf('opera') > -1) {
      // Opera専用ロジック
      browserInfo.isOpera = true;
      setApplicationInfo('Opera', 'opera/');
    } else {
      // 判定不可能ブラウザの場合、
      result.applicationName = 'unknown';
      result.version = 'null';
    }
    return browserInfo;
  })();
  
  clientInfo.userAgent = window.navigator.userAgent;
  
  return clientInfo;
})();