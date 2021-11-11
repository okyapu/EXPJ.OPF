/**
 * EXPLANNER/J Framework
 * Copyright (c) 2003-2016 NEC Corporation
 * Copyright (c) 2003-2016 NEC Informatec Systems,Ltd.
 */
// ========================================================
// 名前空間定義
// ========================================================
/**
 * EXPLANNER/J(HTML5版)の名前空間<br>
 */
var expj = {};

/**
 * エラー処理用名前空間<br>
 */
expj.error = {};

/**
 * エラー処理用コンソール関数<br>
 */
expj.error.viewConsole = function () {};

/**
 * 共通部品用名前空間<br>
 */
expj.common = {};

/**
 * バージョン管理用名前空間
 */
expj.common.version = {};

/**
 * expjcoreのバージョン表記
 */
expj.common.version.expjcore = 'expjcore.js Ver1.1.32';

/**
 * UI関連用名前空間<br>
 */
expj.common.ui = {};

/**
 * ツールチップ部品用名前空間<br>
 */
expj.common.ui.tooltip = {};

/**
 * ツリー用名前空間<br>
 */
expj.common.ui.tree = {};

/**
 * config用名前空間と定数初期化<br>
 */
expj.common.config = {
  'trimedFLG' : true,
  'unuseableMarkArr' : [],
  'textInputSelectAllFLG' : false
};


/**
 * ロガー用名前空間<br>
 */
expj.common.logger = {};

/**
 * ログレベル定数<br>
 */
expj.common.logger.DEBUG = 0;
expj.common.logger.INFO = 1;
expj.common.logger.WARNING = 2;
expj.common.logger.ERROR = 3;

/**
 * ログレベルの設定変数<br>
 */
expj.common.logger.LEVEL = 0;

/**
 * ログ出力関数
 */
expj.common.logger.log = function (text, level) {
  if (typeof(level) === 'undefined' || level === null || level >= expj.common.logger.LEVEL) {
    console.log(text);
  }
};

// ========================================================
// 定数定義
// ========================================================
/**
 * EXPJ業務画面のタブ部品のデフォルトmin-heightの値<br>
 */
expj.common.EXPJ_SCREEN_FRAME_BUSINESS_SCREEN_DEFAULT_HEIGHT = 590;

/**
 * タブエリアの高さを示す変数
 */
expj.common.EXPJ_SCREEN_FRAME_TABS_INDEX_HEIGHT = '20px';

/**
 * キーコード
 */
expj.common.ui.EXPJ_KEY_CODE_TAB = 9;    // TAB
expj.common.ui.EXPJ_KEY_CODE_ENTER = 13; // Enter
expj.common.ui.EXPJ_KEY_CODE_ESC = 27;   // ESC

// ========================================================
// グローバル変数
// ========================================================
/**
 * タブオブジェクト(#expj-screen-header-tabs)への参照変数
 */
expj.common.screenFrameTabsAreaInstance = null;

/**
 * タブオブジェクト内にある要素(#expj-screen-header-tabs > ul)への参照変数<br>
 * 0からN個のタブ要素を配列として扱える
 */
expj.common.screenFrameTabIndexAreaInstance = null;

/**
 * タブページを切り替えるスピナーオブジェクト(#expj-screen-header-paging-tab-spinner)への参照変数
 */
expj.common.screenFrameTabSpinnerInstance = null;

/**
 * ローディングスクリーンのインスタンス
 */
expj.common.screenFrameLoadingInstance = null;

/**
 * ローディングスクリーンを表示するためのsetTimeout関数のdelay時間(ms)
 */
expj.common.screenFrameLoadingTime = 20;

/**
 * タブに割り当てたページクラス数を記録する変数
 */
expj.common.screenFrameTabPageClassCount = 0;

/**
 * 現在開かれているタブの個数を記録する変数
 */
expj.common.screenFrameActivateBusinessScreenCount = 0;

/**
 * EXPJコンソール領域(#expj-screen-header-message-text)への参照変数
 */
expj.common.screenFrameConsoleInstance = null;

/**
 * 業務画面上のVIEWを管理するマップ。<br>
 */
expj.common.viewInstanceMap = {};

/**
 * 業務画面上のカレンダーを管理するマップ。<br>
 */
expj.common.calendarInstanceMap = {};

/**
 * 業務画面上のツリーを管理するマップ。<br>
 */
expj.common.treeInstanceMap = {};

/**
 * 業務画面上の詳細ウィンドウを管理するマップ。<br>
 */
expj.common.detailDialogMap = {};

/**
 * 業務画面上の各DataGridのスクロール状況を管理するマップ。<br>
 */
expj.common.datagridScrollMap = {};

/**
 * 業務画面毎のフォーカス位置を記録するマップ<br>
 */
expj.common.focusPositionMap = {};

/**
 * 画面内タブの表示タブを記録するマップ<br>
 */
expj.common.innerTabMap = {};

/**
 * 閉じるボタンでの画面遷移先を記録するマップ<br>
 */
expj.common.closeMoveMap = {};


// ========================================================
// 関数
// ========================================================
// DOM構築完了時に実行する関数
$(function() {
  // ブラウザウィンドウのリサイズが発生した時に実行される処理を登録する
  // デザインの修正などはすべてここで登録する
  $(window).on('resize',function(){
    // フォーム表示スペースのレイアウト（高さ）を調節
    expj.common.regulateScreenFrameFormsAreaHeight();
    // タブ表示スペースのレイアウト（高さ）を調節
    expj.common.regulateScreenFrameTabsAreaHeight();
    // タブエリアのデザイン（横幅表示）を調整
    expj.common.regulateScreenFrameTabsIndexAreaDesign();
    // タブのページング割り当てを行う
    expj.common.controlScreenFrameTabPagingAndSpinner();
    // アクティブタブのページをスピナーに設定
    try {
      var nowIndex = expj.common.screenFrameTabIndexAreaInstance.find('li.ui-tabs-active').attr('data-page');
      if(!nowIndex){
        nowIndex = 1;
      }
      expj.common.screenFrameTabSpinnerInstance.val(Number(nowIndex));
    } catch (e) {}
    // スピナーで選択されたページを表示する
    expj.common.switchViewScreenFrameTabPage();
  });
  
  // 各種グローバル変数を初期化する
  expj.common.screenFrameTabsAreaInstance = $('#expj-screen-header-tabs');
  expj.common.screenFrameTabIndexAreaInstance = $('#expj-screen-header-tabs > ul');
  expj.common.screenFrameTabSpinnerInstance = $('#expj-screen-header-paging-tab-spinner');
  expj.common.screenFrameConsoleInstance = $('#expj-screen-header-message-text');
  expj.common.screenFrameLoadingInstance = $('#expj-loading-mask-screen');
  
  // メニューダイアログの初期化関数
  expj.common.initMenuWindow();
  expj.common.initMenuTree();
  
  expj.common.initPrintDialog();
});

// 画像等関連ファイル全ロード完了時に実行する関数
$(window).load(function(){
  // タブの初期化
  expj.common.initializeScreenFrameTabAreaDesign();

  // 画面レイアウトの調整
  expj.common.regulateScreenFrameTabsAreaHeight();
});

/**
*業務画面ロード完了後
*IEとChromeだとcheckboxのダブルクリック表現一致にする関数
*/
expj.common.regulateCheckboxForDblClick = function(screenId){
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE) {
    $(screenId).find('input[type="checkbox"]').bind('click', function(event) {
      if (event.currentTarget.isChanged) {
        delete event.currentTarget.isChanged;
      } else {
        event.currentTarget.checked = !event.currentTarget.checked;
        $(event.currentTarget).change();
      }
    }).bind('dblclick', function (event) {
      //none;
    }).bind('change', function (event) {
      event.currentTarget.isChanged = true;
    });
  }
}

/**
 * 画面固有のonLoad関数を呼び出す関数<br>
 * @param tabKey 該当画面のタブのキー
 */
expj.common.callOnLoadFunction = function (tabKey) {
  try {
    expj[tabKey].executeScreenLoad();
  } catch (e) {
    // PASSWORD画面などonLoad関数が無い画面ではエラーになる(想定通り)
    console.log(e);
  }
};

/**
 * 印刷ダイアログの初期化処理
 */
expj.common.initPrintDialog = function () {
  var method = 'POST';
  var sevletName = 'messageControl';
  var requestParameter = {
    'MSG_PG' : 'ZZ0020010Servlet',
    'MSG_BUSINESS_GROUP_CD' : 'B0012',
    'MSG_BUSINESS_CD' : 'G0112',
    'MSG_MESSAGE_ID' : '0',
    'TARGET_WINDOW' : 'EJBARSUBMIT',
    'NEW_SCREEN_FLG' : 'FALSE'
  };
  var response = expj.common.accessBusinessScreen(method, sevletName, requestParameter);
  var result = expj.common.analyzeBusinessScreenResponse('ZZ0020010', response);
  if (result.screenId !== 'ZZ0020010') {
    console.log('Failure printer dialog initialize.');
  }
};

/**
 * EXPLANNER/JやJavaScriptファイルのバージョン情報をコンソール領域に表示する関数。
 */
expj.common.printVersion = function () {
  // EXPLANNER/Jのバージョン情報を取得（変数宣言はcommon/apversion.js）
  var messageString = '<img draggable="false" src="common/img/info.png">&nbsp;<span style="color: #0000FF;">' + APVERSION + '</span><br>';
  // 各JavaScriptファイルのバージョン情報を取得
  messageString += '<img draggable="false" src="common/img/info.png">&nbsp;<span style="color: #0000FF;">';
  for (var name in expj.common.version) {
    var message = expj.common.version[name];
    messageString += '[' + message + ']';
  }
  try {
    messageString += '[' + com.nec.jp.orteus.OrteusView.version + ']';
    messageString += '[' + com.nec.jp.orteus.OrteusViewExVersion + ']';
  } catch (e) {}
  messageString += '</span>';
  // コンソール部品に出力する
  expj.common.setScreenFrameConsoleMessage(messageString);
};

/**
 * 名前空間が有効であるかチェックする。<br>
 * 判定基準は該当変数がundefinedまたはnullであるか否か。<br>
 * undefinedまたはnullの場合、falseが返却される。<br>
 * @param targetSpace 対象の変数
 */
expj.common.checkNameSpace = function (targetSpace) {
  if (typeof(targetSpace) === 'undefined') {
    return false;
  } else if (targetSpace === null) {
    return false;
  }
  return true;
};

/**
 * テキストのサニタイズを行う関数。
 * 二重エスケープ対策も行っています。
 * @param input サニタイズ対象テキスト。
 */
expj.common.sanitize = function (input) {
  var result = '';
  // 現在処理中のテキスト位置
  var i = 0;
  // 初めに'&'のエスケープを行う。
  // これは二重エスケープを回避するために、テキストを1字1字確認して行う。
  while (i < input.length) {
    // 処理対象テキスト位置から'&'を探索
    var index = input.indexOf('&', i);
    if (index === -1) {
      // '&'が存在しなければ残りのテキストを連結し、ループを脱出
      result += input.substring(i, input.length);
      break;
    }
    
    // '&'が存在する場合は、処理対象テキスト位置から'&'までのテキストを連結する
    result += input.substring(i, index);
    // 探索した'&'以降の文字を取得する
    var temp = input.substring(index);
    // エスケープフラグ
    var matchResult = false;
    
    // 文字表記(&XXXXX;)形式のエスケープであるか調査する
    var textMatch = temp.match(/^\&[A-za-z0-9]+\;.*$/g);
    if (textMatch !== null) {
      matchResult = true;
    }
    
    // 10進表記(&#YYYYY;)形式のエスケープであるか確認する
    if (matchResult === false) {
      var octMatch = temp.match(/^\&\#[0-9]+\;.*$/g);
      if (octMatch !== null) {
        matchResult = true;
      }
    }
    
    // 16進表記(&#xYYYY;)形式のエスケープであるか確認する
    if (matchResult === false) {
      var hexMatch = temp.match(/^\&\#x[A-Fa-f0-9]+\;.*$/g);
      if (hexMatch !== null) {
        matchResult = true;
      }
    }
    
    if (matchResult) {
      // 探索した'&'がエスケープである場合は、そのままテキストを連結する
      var semiIndex = input.indexOf(';', index) + 1;
      result += input.substring(index, semiIndex);
      // 処理テキスト位置はセミコロンの次の文字
      i = semiIndex;
    } else {
      // 探索した'&'がエスケープでない場合は、エスケープする
      result += '&amp;';
      // 処理テキスト位置を'&'の次の文字にする
      i = index + 1;
    }
  }
  
  // 「<」、「>」、「"」、「'」、「 」をエスケープする
  result = result.replace(/\</g, '&lt;');
  result = result.replace(/\>/g, '&gt;');
  result = result.replace(/\"/g, '&quot;');
  result = result.replace(/\'/g, '&#39;');
  result = result.replace(/\ /g, '&nbsp;');
  return result;
};

// 「<」、「>」、「"」、「'」、「 」をエスケープ戻す
expj.common.sanitizeBack = function (inputStr) {
  return inputStr.replace(/&quot;/g,'"').replace(/&#39;/g,"'").replace(/&lt;/g,"<").replace(/&gt;/g,">").replace(/&amp;/g,"&"); 
};

/**
 * 文字「px」を除去し、Number型の数値を返却する関数。<br>
 * 文字列が予期しないものであった場合は0を返却する。<br>
 * @param text 変換対象のテキスト
 */
expj.common.convertToNumberFromCssPx = function (text) {
  var value = text.replace(/px/g, '');
  var pxSize = Number(value);
  if (isNaN(pxSize)) {
    return 0;
  }
  return pxSize;
};

/**
 * ローディング中を示す画面をコントロールする関数。<br>
 */
expj.common.controlLoadingScreen = function (visible) {
  if (visible) {
    expj.common.screenFrameLoadingInstance.css('display', 'table');
  } else {
    expj.common.screenFrameLoadingInstance.css('display', 'none');
    try {
      window.getSelection().removeAllRanges();
    } catch (e) {}
  }
};

/**
 * タブ表示スペースのレイアウト（高さ）を調節する関数
 */
expj.common.regulateScreenFrameTabsAreaHeight = function () {
};

/**
 * フォーム表示スペースのレイアウト（高さ）を調節する関数
 */
expj.common.regulateScreenFrameFormsAreaHeight = function () {
  let expjDynamicHeight = $('#expj-screen-header-tabs').find('div.expjDynamicHeight');
  if(typeof(expjDynamicHeight) !== 'undefined' && expjDynamicHeight.length !== 0 ){
    $('div.expjDynamicHeight').find('form').css('height','100%');
  }
};

/**
 * EXPLANNER/J共通フレームのタブの初期化を行う関数
 */
expj.common.initializeScreenFrameTabAreaDesign = function () {
  // タブを実装するタグをタブらしくデザイン変更
  expj.common.screenFrameTabsAreaInstance.tabs({
    'beforeActivate': function (event, ui) {
      // タブ切替前に実行される関数
      expj.common.manageChangeTabPage(ui);
      expj.common.clearScreenFrameConsoleMessage();
    },
    'activate' : function (event, ui) {
      // タブ切替後に実行される関数
      if (typeof(ui.oldTab.attr('data-key')) !== 'undefined') {
        expj.common.manageChangeTabPageAfter(ui);
      }
    }
  });

  // タブの高さを調整
  // これをやらないとタブがつぶれる
  expj.common.screenFrameTabIndexAreaInstance.css('height', expj.common.EXPJ_SCREEN_FRAME_TABS_INDEX_HEIGHT);

  // テキストボックスをスピナー化する
  expj.common.screenFrameTabSpinnerInstance.spinner({
    'max' : 1,
    'min' : 1,
    'stop' : function(event, ui) {
      expj.common.switchViewScreenFrameTabPage();
    }
  });

  // タブエリアの調整を行う
  expj.common.regulateScreenFrameTabsIndexAreaDesign();
};

/**
 * 業務画面タブを切り替えた時に実行される関数。<br>
 * 業務画面内のDataGridのスクロール位置やダイアログ起動状況を管理する。<br>
 * この関数はタブを切り替える前に実行される。<br>
 */
expj.common.manageChangeTabPage = function (ui) {
  /** 新しく表示するタブインデックス */
  var nextScreenId = ui.newTab.attr('data-key');
  /** 前に表示していたタブインデックス */
  var prevScreenId = ui.oldTab.attr('data-key');
  // スクロール位置の状態記録
  if (typeof(prevScreenId) !== 'undefined' && prevScreenId !== null) {
    // DataGrid管理マップから表示していたタブのマップデータを取得
    var datagridScrollMap = expj.common.datagridScrollMap[prevScreenId];
    if (typeof(datagridScrollMap) === 'undefined' || datagridScrollMap === null) {
      // マップデータ存在しない場合は新しく作成する
      datagridScrollMap = {};
      expj.common.datagridScrollMap[prevScreenId] = datagridScrollMap;
    }
    // 表示していたタブのDataGridのスクロール位置を管理マップにそれぞれ記録する
    $('#expj-business-screen-tabs-body-' + prevScreenId).find('[data-orftype]').each(function () {
      var topPosition = 0;
      if (this.getAttribute('data-mode') === 'FORM' && this.nodeName === 'FORM') {
        if ($(this).css('display') !== 'none') {
          topPosition = $(this).scrollTop();
          datagridScrollMap[this.id] = topPosition;
        }
      } else if (this.getAttribute('data-mode') === 'VIEW') {
        topPosition = $(this).find('.orteusView_BodyArea').scrollTop();
        datagridScrollMap[this.id] = topPosition;
      } else if (this.getAttribute('data-mode') === 'TREE') {
        topPosition = $(this).parent().scrollTop();
        datagridScrollMap[this.id] = topPosition;
      }
    });
  }
  // 詳細ウィンドウの表示状態記録
  var dialogId, dialogMap, dialogParentTag;
  // 詳細ウィンドウ管理マップから表示していたタブのマップを取り出す
  for (dialogId in expj.common.detailDialogMap[prevScreenId]) {
    // 保持している詳細ウィンドウをひとつひとつ取り出す
    dialogMap = expj.common.detailDialogMap[prevScreenId][dialogId];
    if (dialogMap.visible) {
      // 詳細ウィンドウが表示状態の時はウィンドウを閉じ、隠しフラグを設定する
      dialogMap.hidden = true;
      dialogParentTag = dialogMap.dialogInstance.parent();
      dialogMap.left = dialogParentTag.css('left');
      dialogMap.top = dialogParentTag.css('top');
      dialogMap.dialogInstance.dialog('close');
    }
  }
  // 詳細ウィンドウ管理マップからこれから表示するタブのマップを取り出す
  for (dialogId in expj.common.detailDialogMap[nextScreenId]) {
    // 保持している詳細ウィンドウをひとつひとつ取り出す
    dialogMap = expj.common.detailDialogMap[nextScreenId][dialogId];
    if (dialogMap.hidden) {
      try {
        dialogMap.dialogInstance.dialog('open');
        // 隠しフラグが設定されている場合は詳細ウィンドウを表示状態にする
        dialogMap.hidden = false;
        dialogParentTag = dialogMap.dialogInstance.parent();
        dialogParentTag.css('left', dialogMap.left);
        dialogParentTag.css('top', dialogMap.top);
        delete dialogMap.left;
        delete dialogMap.top;
      } catch (e) {
        // エラー発生時はここを通過
      }
    }
  }
};

/**
 * 業務画面タブを切り替えた時に実行される関数。<br>
 * 業務画面内のDataGridのスクロール位置やフォーカス位置を管理する。<br>
 * この関数はタブを切り替えた後に実行される。<br>
 */
expj.common.manageChangeTabPageAfter = function (ui) {
  /** 新しく表示するタブ本体 */
  var nextScreenId = ui.newTab.attr('data-key');
  /** 前に表示していたタブ本体 */
  var prevScreenId = ui.oldTab.attr('data-key');
  // スクロール位置の状態設定
  if (typeof(expj[nextScreenId]) !== 'undefined' && expj[nextScreenId] !== null) {
    // DataGrid管理マップから表示していたタブのマップデータを取得
    var datagridScrollMap = expj.common.datagridScrollMap[nextScreenId];
    if (typeof(datagridScrollMap) === 'undefined' || datagridScrollMap === null) {
      // マップデータ存在しない場合は新しく作成する
      datagridScrollMap = {};
      expj.common.datagridScrollMap[nextScreenId] = datagridScrollMap;
    }
    // 新しく表示する業務画面が持つDataGridのスクロール位置を管理マップを基にそれぞれに設定する
    for (var datagridName in datagridScrollMap) {
      var topPosition = datagridScrollMap[datagridName];
      var datagrid = $('#expj-business-screen-tabs-body-' + nextScreenId).find('#' + datagridName);
      if (datagrid.attr('data-mode') === 'FORM') {
        datagrid.scrollTop(topPosition);
      } else if (datagrid.attr('data-mode') === 'VIEW') {
        datagrid.find('.orteusView_BodyArea').scrollTop(topPosition);
      } else if (datagrid.attr('data-mode') === 'TREE') {
        datagrid.parent().scrollTop(topPosition);
      }
    }
  }
  // フォーカス管理マップから該当画面のフォーカス情報を取得し、設定する
  var targetFocus = expj.common.focusPositionMap[nextScreenId];
  if (typeof(targetFocus) !== 'undefined' && targetFocus !== null) {
    targetFocus.focus();
  }
};

/**
 * 画面内タブを切り替えた時に実行される関数<br>
 * 画面内タブのDataGridのスクロール位置を管理する。<br>
 * この関数はタブを切り替える前に実行される。<br>
 */
expj.common.manageChangeInnerTabPage = function (ui) {
  // 前に表示していたタブ本体からIDを取得する
  var prevTabId = ui.oldPanel.attr('id');
  // 画面IDを取得する(IDは"expj-[screenId]-[DataGridName]"で構成されているため)
  var screenId = prevTabId.split('-')[1];
  var topPosition = 0;
  // DataGridのスクロール情報を記録したマップを取得
  var datagridScrollMap = expj.common.datagridScrollMap[screenId];
  if (typeof(datagridScrollMap) === 'undefined' || datagridScrollMap === null) {
    // マップが存在しない場合は生成する
    datagridScrollMap = {};
    expj.common.datagridScrollMap[screenId] = datagridScrollMap;
  }
  // スクロール位置を管理マップに記録する
  if (typeof(prevTabId) !== 'undefined' && prevTabId !== null) {
    if (ui.oldPanel.attr('data-mode') === 'FORM') {
      topPosition = ui.oldPanel.scrollTop();
      datagridScrollMap[prevTabId] = topPosition;
    } else if (ui.oldPanel.attr('data-mode') === 'VIEW') {
      topPosition = ui.oldPanel.find('.orteusView_BodyArea').scrollTop();
      datagridScrollMap[prevTabId] = topPosition;
    } else if (ui.oldPanel.attr('data-mode') === 'TREE') {
      topPosition = ui.oldPanel.parent().scrollTop();
      datagridScrollMap[prevTabId] = topPosition;
    }
  }
  ui.oldPanel.parent().parent().css('display', 'none');
  ui.newPanel.parent().parent().css('display', '');
};

/**
 * 画面内タブを切り替えた時に実行される関数<br>
 * 画面内タブのDataGridのスクロール位置を管理する。<br>
 * この関数はタブを切り替えた後に実行される。<br>
 */
expj.common.manageChangeInnerTabPageAfter = function (ui) {
  // 表示するタブ本体からIDを取得する
  var nextTabId = ui.newPanel.attr('id');
  // 画面IDを取得する(IDは"expj-[screenId]-[DataGridName]"で構成されているため)
  var screenId = nextTabId.split('-')[1];
  var topPosition = 0;
  // DataGridのスクロール情報を記録したマップを取得
  var datagridScrollMap = expj.common.datagridScrollMap[screenId];
  if (typeof(datagridScrollMap) === 'undefined' || datagridScrollMap === null) {
    // マップが存在しない場合は生成する
    datagridScrollMap = {};
    expj.common.datagridScrollMap[screenId] = datagridScrollMap;
  }
  // 管理マップからスクロール位置を設定する
  if (typeof(nextTabId) !== 'undefined' && nextTabId !== null) {
    topPosition = datagridScrollMap[nextTabId];
    if (typeof(topPosition) !== 'undefined' && topPosition !==null) {
      if (ui.newPanel.attr('data-mode') === 'FORM') {
        ui.newPanel.scrollTop(topPosition);
      } else if (ui.newPanel.attr('data-mode') === 'VIEW') {
        ui.newPanel.find('.orteusView_BodyArea').scrollTop(topPosition);
      } else if (ui.newPanel.attr('data-mode') === 'TREE') {
        ui.newPanel.parent().scrollTop(topPosition);
      }
    }
  }
};

/**
 * 画面枠部品にタブを追加する関数。<br>
 * left.jspのタブオブジェクト（#expj-screen-header-tabs）にタブのDIVタグを追加する。<br>
 * 追加されるDIVタグには「expj-business-screen-tabs-body-[tabKey]」という名前が与えられる。<br>
 * @param tabKey タブに割り当てる一意なキー
 * @param tabName タブ名
 * @param tabBody タブ本体部分に表示する内容（HTMLタグで記述）
 */
expj.common.createBusinessScreenTabPage = function (tabKey, tabName, tabBody) {
  var tabAreaInstance = expj.common.screenFrameTabsAreaInstance;
  /** タブ本体を構成するDIVタグに与えられるID */
  var tabBodyId = 'expj-business-screen-tabs-body-' + tabKey;
  /** タブインデックスを構成するanchorタグのhref値 */
  var liHref = '#' + tabBodyId;

  // タブ名エリアのタグを作成し、DOMにアペンド
  var litext = '<li data-key="' + tabKey + '"><a href="' + liHref + '" draggable="false">' + tabName + '</a></li>';
  expj.common.screenFrameTabIndexAreaInstance.append($(litext));

  // タブ（内容）エリアのタグを作成し、DOMにアペンド
  var divtext = '<div id="' + tabBodyId + '" class="tab-body expj-business-screen-height" data-key="' + tabKey + '">' + tabBody + '</div>';
  try {
    tabAreaInstance.append(divtext);
  } catch (e) {
    // DOMへのアペンドに失敗した場合はPスクリプトから生成したJavaスクリプトに異常がある
    // ここで警告アラートを表示する
    alert('PScript Syntax Error!');
    // 閉じるボタンのイベントが無効化されているので、ここで追加する
    $('#' + tabBodyId).find('.expj-business-screen-close-button').bind('click', function () {
      expj.common.executeBusinessScreenCloseDialog(tabKey);
    });
  }

  // タブの高さをデフォルトに戻し、リフレッシュ
  expj.common.screenFrameTabIndexAreaInstance.css('height', '');
  tabAreaInstance.tabs('refresh');

  // タブエリアの再描画に必要な処理
  expj.common.regulateScreenFrameTabsAreaHeight();
  expj.common.regulateScreenFrameTabsIndexAreaDesign();
  expj.common.controlScreenFrameTabPagingAndSpinner();
  expj.common.switchViewScreenFrameTabPage();

  // 新しく追加されたタブをアクティブにする
  tabAreaInstance.tabs('option', 'active', expj.common.screenFrameActivateBusinessScreenCount);

  // タブの個数をインクリメント
  expj.common.screenFrameActivateBusinessScreenCount++;
};

/**
 * タブエリアのデザイン（横幅表示）を調整する関数
 */
expj.common.regulateScreenFrameTabsIndexAreaDesign = function () {
  var tabAreaInstance = expj.common.screenFrameTabsAreaInstance;
  // タブエリアに割り当てられた横幅を取得
  var maxWidth = tabAreaInstance.innerWidth();
  // padding値を取得
  var padLeftWidth = expj.common.convertToNumberFromCssPx(tabAreaInstance.css('padding-left'));
  var padRightWidth = expj.common.convertToNumberFromCssPx(tabAreaInstance.css('padding-right'));
  // margin値の取得
  var marLeftWidth = tabAreaInstance.offset().left;
  // スピナーの横幅を取得(jQuery UIが親タグにspanタグを追加しているので、それを取得する)
  var selectWidth = expj.common.screenFrameTabSpinnerInstance.parent().outerWidth();
  
  //ズーム縮小、画面崩れ対策
  var tmpWidth = selectWidth + (selectWidth-53)*(selectWidth-53) + 8;
  var tmpWidthStr = "calc(100% - " + tmpWidth + "px)";
  expj.common.screenFrameTabIndexAreaInstance.css('width', tmpWidthStr);
  
  
  // タブ（リスト部分）の横幅を調整する
  var tabWidth = maxWidth - selectWidth - padLeftWidth - padRightWidth - marLeftWidth - 8;
  //expj.common.screenFrameTabIndexAreaInstance.css('width', tabWidth);
};

/**
 * タブのページング割り当てを行う関数
 */
expj.common.controlScreenFrameTabPagingAndSpinner = function () {
  // タブのリストを取得
  var tablist = $('#expj-screen-header-tabs > ul > li');
  var target;
  var i, len;

  // すべてのタブを一時的に表示状態にする
  for (i = 0, len = tablist.length; i < len; i++) {
    target = $(tablist[i]);

    var pagingClassIndex = target.attr('data-page');

    // タブが所属するtabClassを消去する。
    target.removeClass('expj-screen-tab-paging-class-' + pagingClassIndex);

    target.css('display', 'inline');
  }

  // タブの位置（高さ）を記録する変数。-1は使われるので初期値は-10000とする
  var topPosition = -10000;

  // クラス数を0に初期化
  expj.common.screenFrameTabPageClassCount = 0;
  for (i = 0, len =  tablist.length; i < len; i++) {
    // タブ要素を取得し、その表示位置を取得する
    target = $(tablist[i]);
    var position = target.position();

    // 記録されていたタブの位置（高さ）と検索対象のタブの位置（高さ）を比較する
    // 一致しない場合はクラスを1段階上げ、新しいタブの位置（高さ）を記録する
    if (topPosition != position.top) {
      expj.common.screenFrameTabPageClassCount++;
      topPosition = position.top;
    }

    // 検索対象のタブにクラスを追加する
    target.addClass('expj-screen-tab-paging-class-' + expj.common.screenFrameTabPageClassCount);

    // ページ番号を追加
    target.attr('data-page', expj.common.screenFrameTabPageClassCount);
  }

  var tabMaxPage = expj.common.screenFrameTabPageClassCount;
  if (tabMaxPage === 0) {
    tabMaxPage = 1;
  }
  // スピナー設定
  expj.common.screenFrameTabSpinnerInstance.spinner({
    'max' : tabMaxPage,
    'min' : 1
  });
  expj.common.screenFrameTabSpinnerInstance.val(tabMaxPage);
};

/**
 * スピナーで選択されたページを表示する関数
 */
expj.common.switchViewScreenFrameTabPage = function () {
  // セレクトされているページ数を取得
  var value = expj.common.screenFrameTabSpinnerInstance.val();
  for (var i = 1; i <= expj.common.screenFrameTabPageClassCount; i++) {
    // 該当するページに属しているタブを表示、それ以外を非表示にする
    if (value == i) {
      $('.expj-screen-tab-paging-class-' + i).css('display', 'inline');
    } else {
      $('.expj-screen-tab-paging-class-' + i).css('display', 'none');
    }
  }
};

/**
 * 画面枠部品から業務画面を削除する関数。<br>
 * @param targetScreenId 削除対象の画面ID
 */
expj.common.deleteBusinessScreenTabPage = function (targetScreenId) {
  /** タブに追加されている要素のリストを取得 */
  var tablist = $('#expj-screen-header-tabs > ul > li');
  // 上記はセレクタを使い、最新の情報を取得しなければならない

  /** 削除対象タブ（Index）のjQueryオブジェクト */
  var targetTab = null;

  /** 削除対象タブ（Index）のkey属性に隠したキー値 */
  var key = null;

  /** 起動中のタブインデックス */
  var activeTabIndex = -1;

  // 取得したリストと引数から削除対象タブを探索
  for (var i = 0, len = tablist.length; i < len; i++) {
    var target = tablist[i];
    // 属性「data-key」の値を取得。target.data('key')だと取得できない時がある。
    var targetKey = target.getAttribute('data-key');
    if (targetKey === targetScreenId) {
      // 対象のオブジェクトが見つかった場合はオブジェクトを格納してループを脱出する。
      targetTab = $(target);
      key = targetKey;
      activeTabIndex = i;
      break;
    }
  }

  // 削除対象タブのjQueryオブジェクトが見つからない場合は中止する。
  if (targetTab === null) {
    return;
  }

  // タブ（Index）をリムーブする
  targetTab.remove();

  // タブの内容もリムーブする
  $('#expj-business-screen-tabs-body-' + key).remove();

  // タブをリフレッシュする
  expj.common.screenFrameTabsAreaInstance.tabs('refresh');

  // タブの再ページングを行う
  expj.common.controlScreenFrameTabPagingAndSpinner();

  // ひとつ前のインデックスを指定
  activeTabIndex--;
  
  // 選択中のタブを削除したタブのひとつ前にする。
  // この処理により、スピナーの値も更新する。（ひとつ前のページのタブがアクティブになった時の対策）
  // タブが0個になる場合は、この処理を飛ばす。
  if (activeTabIndex > -1) {
    var tabObject = expj.common.getScreenFrameTabsLIIndexByScreenId(activeTabIndex);
    if (tabObject !== -1) {
      var pageIndex = tabObject.attr('data-page');
      expj.common.screenFrameTabSpinnerInstance.val(pageIndex);
    }
  }
  
  // スピナーで選択されたページを表示する
  expj.common.switchViewScreenFrameTabPage();

  // タブの個数をカウントしている変数を更新する
  expj.common.screenFrameActivateBusinessScreenCount--;

  if (expj.common.screenFrameActivateBusinessScreenCount === 0) {
    // タブ要素が0個の場合、タブ（Index）部分の高さを調節する。（これがないと潰れてしまう）
    expj.common.screenFrameTabIndexAreaInstance.css('height', expj.common.EXPJ_SCREEN_FRAME_TABS_INDEX_HEIGHT);
    // 業務画面枠を初期画面に戻す
    $('#expj-initial-business-screen').css('display', 'block');
  } else {
    // ひとつ前の業務画面をアクティブにする
    expj.common.screenFrameTabsAreaInstance.tabs('option', 'active', activeTabIndex);
  }
};

/**
 * 指定した画面IDを持つタブインデックスのオブジェクトを取得する。<br>
 * オブジェクトが存在しない場合は、nullを返す。<br>
 * @param screenId 画面ID
 * @returns 指定した画面IDを持つタブインデックスのオブジェクトまたはnull
 */
expj.common.getScreenFrameTabsLIObjectByScreenId = function (screenId) {
  // タブインデックスのリストを取得
  var tabList = $('#expj-screen-header-tabs > ul > li');
  var result = null;
  for (var i = 0, len = tabList.length; i < len; i++) {
    var target = tabList[i];
    // オブジェクト内の画面IDを取得
    var key = target.getAttribute('data-key');
    // 画面IDが一致した場合はそのオブジェクトを返す
    if (key === screenId) {
      result = $(target);
      break;
    }
  }
  return result;
};

/**
 * 指定した画面IDを持つタブインデックスのオブジェクトのリスト上の位置を取得する。<br>
 * オブジェクトが存在しない場合は-1を返す。
 * @param screenId 画面ID
 * @returns インデックス値または-1
 */
expj.common.getScreenFrameTabsLIIndexByScreenId = function (screenId) {
  // タブインデックスのリストを取得
  var tabList = $('#expj-screen-header-tabs > ul > li');
  var result = -1;
  for (var i = 0, len = tabList.length; i < len; i++) {
    var target = tabList[i];
    // オブジェクト内の画面IDを取得
    var key = target.getAttribute('data-key');
    // 画面IDが一致した場合はそのインデックス値を返す
    if (key === screenId) {
      result = i;
      break;
    }
  }
  return result;
};

/**
 * 画面枠部品（コンソール）にメッセージを書き込む関数。<br>
 * パラメータで与えるメッセージはHTMLの書き方をすることでフォントなどのカスタマイズを行える。<br>
 * @param message コンソールに表示するメッセージ
 */
expj.common.setScreenFrameConsoleMessage = function (message) {
  expj.common.screenFrameConsoleInstance.html(message);
};

/**
 * 画面枠部品（コンソール）のメッセージをクリアする関数。<br>
 */
expj.common.clearScreenFrameConsoleMessage = function () {
  expj.common.screenFrameConsoleInstance.html('');
};

/**
 * EXPJメニューウィンドウの実体を確保する変数
 */
expj.common.menuWindowInstance = null;

/**
 * スタイル解除処理用の前回選択ノード保存用
 */
expj.common.menuTreePrevSelectNode = null;

/**
 * EXPJメニューウィンドウのスクロール状態記録用
 */
expj.common.menuWindowScrollTop = 0;

/**
 * メニューウィンドウの初期化
 */
expj.common.initMenuWindow = function () {
  // Dialog Widget API
  // http://api.jqueryui.com/dialog/

  expj.common.menuWindowInstance = $('#expj-menu-window').dialog({
    'autoOpen' : false,      // ページ読み込み時にダイアログを自動表示するか設定
    'closeOnEscape' : false, // 「Esc」キーを押した時にダイアログを閉じるか設定
    'modal' : true,          // ダイアログを表示中に背景画面を操作できるか設定
    'draggable' : true,      // タイトル部分をマウスでドラッグした時にダイアログを動かせるか設定
    'width' : 525,           // ダイアログの横幅
    'height' : 688,          // ダイアログの縦幅
    'resizable' : false      // ダイアログのリサイズ許可設定
  });
};

/**
 * メニューウィンドウの起動
 */
expj.common.executeMenuWindow = function () {
  // メニューウィンドウが初期化されていない場合は初期化する
  if (expj.common.menuWindowInstance === null) {
    expj.common.initMenuWindow();
  }

  // メニューウィンドウを表示する位置を指定
  expj.common.menuWindowInstance.dialog('option', 'position', {
    // ダイアログの場所指定: http://jquery.keicode.com/ui/dialog-position.php
    'my' : 'left top',
    'at' : 'left top',
    'of' : $(window)
  });
  
  // メニューウィンドウの起動
  expj.common.menuWindowInstance.dialog('open');

  // メニューウィンドウのスクロール状態設定
  $('#expj-menu-window').scrollTop(expj.common.menuWindowScrollTop);
};

/**
 * メニューウィンドウのクローズ
 */
expj.common.closeMenuWindow = function () {
  // メニューウィンドウが初期化されていれば起動
  if (expj.common.menuWindowInstance !== null) {
    expj.common.menuWindowInstance.dialog('close');
  }
};

/**
 * メニューウィンドウのツリーの初期化
 */
expj.common.initMenuTree = function () {
  // left.jspに出力されたメニューウィンドウ用のデータをJSONオブジェクトに変換する
  /** メニューウィンドウのJSONデータ */
  var treeData = JSON.parse(expj.common.getLeftJspMenuWindowTreeJsonData());

  // メニューウィンドウのツリー部分を構築
  //   オプション説明はこちらを参照。
  //   http://wwwendt.de/tech/fancytree/doc/jsdoc/global.html#FancytreeOptions
  $('#expj-menu-tree').fancytree({
    'source' : treeData,
    'icon' : true,
    'clickFolderMode' : 3,
    'activate' : function(event, data) {
      expj.common.onMenuTreeNodeActivate(event, data);
    }
  });
};

/**
 * ツリーのノードが選択された時のイベント処理を定義した関数<br>
 * @param event イベントオブジェクト
 * @param data データオブジェクト
 */
expj.common.onMenuTreeNodeActivate = function (event, data) {
  /** 選択されたノードのオブジェクト */
  var selectedNode = data.tree.getActiveNode();

  // ノードのハイライト処理
  expj.common.highlightSelectMenuNode(selectedNode);
  expj.common.highlightParentMenuNode(selectedNode);

  // 次回の解除処理用に今回処理したノードを保持しておく
  expj.common.menuTreePrevSelectNode = selectedNode;
  
  // 次回のメニュー開く処理用に今回処理したスクロール状態を記録する
  expj.common.menuWindowScrollTop = $('#expj-menu-window').scrollTop();


  // folderがundefinedの場合、業務画面（子ノード。空のフォルダではない。）とする
  if (typeof selectedNode.folder === 'undefined') {
    // 業務画面の追加
    expj.common.addBusinessScreenByTreeNode(selectedNode);
  }
};

/**
 * 選択中のノードをハイライトする関数。<br>
 * @param selectedNode 選択中のノード
 */
expj.common.highlightSelectMenuNode = function (selectedNode) {
  // 選択中ノードにスタイルを適用
  selectedNode.extraClasses = 'node-selected-self';
  // レンダリング
  selectedNode.render();

  // 前回の選択中だったノードのスタイルを解除（再選択したノードが前回選択中のノードと同じ場合は無視される）
  if ((this.menuTreePrevSelectNode !== null) && (this.menuTreePrevSelectNode != selectedNode)) {
    // 前回選択したノードのスタイルを解除
    this.menuTreePrevSelectNode.extraClasses = 'node-deselected';
    // レンダリング
    this.menuTreePrevSelectNode.render();
  }
};

/**
 * 選択中のノードの親ノードをハイライトする処理<br>
 * @param selfNode 選択中のノード
 */
expj.common.highlightParentMenuNode = function (selfNode) {
  /** 親ノード */
  var parentNode = selfNode.getParent();

  // 今回の親ノードにスタイルを適用
  parentNode.extraClasses = 'node-selected-parent';
  // レンダリング
  parentNode.render();

  // 前回の親ノードのスタイルを解除
  if (this.menuTreePrevSelectNode !== null) {
    /** 前回の親ノード */
    var prevParentNode = this.menuTreePrevSelectNode.getParent();
    // 親ノードが存在しない場合や、選択中のノードが前回の親ノードだった場合、前回と今回の親ノードが同じ場合は無視する
    if ((prevParentNode !== null) && (prevParentNode != selfNode) && (prevParentNode != parentNode)) {
      // 前回の親ノードのスタイルを解除
      prevParentNode.extraClasses = 'node-deselected-parent';
      // レンダリング
      prevParentNode.render();
    }
  }
};

/**
 * 閉じるダイアログを開いている業務画面IDが格納される変数
 */
expj.common.closingTabIndexKey = null;

/**
 * 起動中の業務画面の状態を管理するマップ<br>
 */
expj.common.openBusinessScreenState = {};

/**
 * メニューで選択された業務画面を画面枠部品のタブに追加する関数。<br>
 * @param selectedNode 選択されたメニューツリーのノードオブジェクト
 */
expj.common.addBusinessScreenByTreeNode = function (selectedNode) {
  /** 業務画面ID */
  var screenId = selectedNode.key;
  /** 業務画面のタイトル */
  var nodeTitle = selectedNode.title;
  /** 業務画面のURL */
  var businessUrl = selectedNode.data.url;
  
  var businessScreenState = this.openBusinessScreenState[screenId];
  if (typeof(businessScreenState) === 'undefined') {
    businessScreenState = {
      'activate' : false,
      'url' : businessUrl
    };
    this.openBusinessScreenState[screenId] = businessScreenState;
  }
  
  var openMessage = '';

  if (businessScreenState.activate !== true) {
    // 現在開いている業務画面ではない場合の処理

    expj.common.controlLoadingScreen(true);
    setTimeout(function () {
      // メニューウィンドウのクローズ
      expj.common.closeMenuWindow();
      
      /** タブのキー */
      var tabKey = screenId;

      /** タブの名前  */
      var tabName = nodeTitle;

      // URLにアクセスし、レスポンスを取得する
      /** レスポンスオブジェクト */
      var requestParameter = {};
      var response = expj.common.accessBusinessScreen('GET', businessUrl, requestParameter);

      // レスポンスを解析し、その結果を取得する
      /** レスポンス解析結果 */
      var result = expj.common.analyzeBusinessScreenResponse(tabKey, response);

      if (result === null) {
        // 結果がnullの時はセッションタイムアウトが発生したものとする
        return;
      }
      
      var tabBody = null;
      if (result.noFlash) {
        tabBody = '<iframe style="width:100%;height:100%;border-width:0px;"></iframe>';
      } else {
        tabBody = result.tabBody;
        if (tabBody !== null) {
          // 詳細ウィンドウのDOMを追加した際にスクロールが表示されるのを防ぐ
          expj.common.tuningScreenOverflow();
          
          // 業務画面固有のJavaScriptを画面枠部品に登録する
          expj.common.appendBusinessScreenHtmlDialog(tabKey, result.dialogBodyList);
          expj.common.appendBusinessScreenJavaScriptSource(tabKey, result.scriptSrcList);
          expj.common.appendBusinessScreenJavaScriptText(tabKey, result.scriptTextList);
        } else {
          // 業務画面が取得できない場合の対処（開発用）
          // タブの内容（今は固定）
          result.screenId = '';
          tabBody = '<div style=\"text-align:center;background-color:#dadcf4;height:100%;font-size:16pt;\"><div>"' + nodeTitle + '" is not HTML5 page.</div><hr><button>Close</button></div>';
        }
      }

      // 業務画面をタブに追加する
      expj.common.createBusinessScreenTabPage(tabKey, tabName, tabBody);
      
      document.getElementById('expj-business-screen-tabs-body-' + tabKey).setAttribute('data-loadingPage', result.loadScreenId);

      // デフォルト業務画面を非表示にする
      $('#expj-initial-business-screen').css('display', 'none');

      // 業務画面管理マップに開いた業務画面を登録する
      businessScreenState.activate = true;

      // 業務画面の閉じるボタンにイベントハンドラを登録
      expj.common.bindCloseButtonEvent(screenId, result);

      if (tabKey === result.screenId) {
        // コンソールメッセージを記述する
        var openMessage = '';
        if (expj.common.local === 'ja') {
          openMessage = '「' + nodeTitle + '」を開きました。';
        } else {
          openMessage = 'open [' + nodeTitle + ']';
        }
        expj.common.setScreenFrameConsoleMessage(openMessage);
        
        if (!result.noFlash) {
          // 業務画面固有のonLoad関数の呼び出し
          expj.common.callOnLoadFunction(tabKey);
        } else {
          var tabBodyId = '#expj-business-screen-tabs-body-' + tabKey;
          var iframeObj = $(tabBodyId).find('iframe')[0];
          iframeObj.contentDocument.open();
          iframeObj.contentDocument.write(result.tabBody);
          iframeObj.contentDocument.close();
        }
      } else {
        expj.error.viewConsole();
        expj.error.viewConsole = function () {};
      }
      
      expj.common.controlLoadingScreen(false);
    }, this.screenFrameLoadingTime);
  } else {
    // 既に業務画面を起動している場合の処理
    this.activateBusinessScreenTabPage(screenId);
    
    // コンソールメッセージを記述する
    openMessage = '';
    if (expj.common.local === 'ja') {
      openMessage = '「' + nodeTitle + '」は既に開いています。';
    } else {
      openMessage = '[' + nodeTitle + '] has already been opened.';
    }
    expj.common.setScreenFrameConsoleMessage(openMessage);
    
    // メニューウィンドウのクローズ
    expj.common.closeMenuWindow();
  }
  // ノードの再クリックを有効にする
  selectedNode.setActive(false);
};

/**
 * EXPJ画面枠部品のタブが表示中の業務画面を指定した業務画面に切り替える。<br>
 * @Param screenId アクティブ化対象の業務画面ID
 */
expj.common.activateBusinessScreenTabPage = function (screenId) {
  // タブインデックスのリストを取得
  var tabList = $('#expj-screen-header-tabs > ul > li');
  // リストの中身をひとつひとつ調べる
  for (var i = 0, len = tabList.length; i < len; i++) {
    var target = tabList[i];
    // 画面IDの取得
    var targetId = target.getAttribute('data-key');
    if (targetId === screenId) {
      // 画面IDが一致した場合、タブがその画面を表示するように切り替える
      this.screenFrameTabsAreaInstance.tabs('option', 'active', i);
      // タブスピナーの値も修正し、タブページエリアの表示も切り替える
      var pageId = target.getAttribute('data-page');
      this.screenFrameTabSpinnerInstance.val(pageId);
      this.switchViewScreenFrameTabPage();
      break;
    }
  }
};

/**
 * 現在表示中の業務画面の状態オブジェクトを取得する関数。<br>
 * @returns 状態オブジェクトまたはnull
 */
expj.common.getActivateBusinessScreenTabPageState = function () {
  // 現在選択中のタブインデックスを取得
  var index = this.screenFrameTabsAreaInstance.tabs('option', 'active');
  // タブインデックスが存在しない場合（ひとつもページが起動されていない場合）はnullを返す
  if (index === false) {
    return null;
  }
  // タブインデックスのリストを取得
  var tabList = $('#expj-screen-header-tabs > ul > li');
  // 画面IDを取得し、管理マップからオブジェクトをリターンする
  var screenId = tabList[index].getAttribute('data-key');
  return this.openBusinessScreenState[screenId];
};

/**
 * 業務画面の閉じるボタンにイベントのハンドラを登録する関数<br>
 * @param screenId 画面ID
 * @param contents サーバーから受信したコンテンツ
 */
expj.common.bindCloseButtonEvent = function (screenId, contents) {
  if (contents.screenId !== screenId) {
    $('#expj-business-screen-tabs-body-' + screenId + ' button').on('click', function() {
      expj.common.closeCommonPage(screenId);
    });
  }
};

expj.common.analyzeScreenId = function (key) {
  var keyword = 'Servlet';
  var keywordLength = keyword.length;
  if (key.length <= keywordLength) {
    return key;
  }
  var v = key.substring(key.length - keywordLength, key.length);
  if (v === keyword) {
    return key.substring(0, key.length - keywordLength);
  } else {
    return key;
  }
};

expj.common.createErrorResponseObjectForAnalyzeResponse = function () {
  var result = {
    'tabBody' : '',
    'scriptSrcList' : [],
    'scriptTextList' : [],
    'screenId' : 'error',
    'dialogBodyList' : [],
    'viewBodyList' : [],
    'formBodyList' : [],
    'treeBodyList' : [],
    'buttonBodyList' : [],
    'isNewData': true
  };
  return result;
};

/**
 * Ajax通信で得られたレスポンスオブジェクトを解析する関数<br>
 * 戻り値はレスポンス解析オブジェクトとなる。<br>
 * <br>
 * レスポンス解析オブジェクトの内容は以下のとおり。<br>
 * tabBody : タブ（内容部）に表示する内容（HTML構造）<br>
 * scriptSrcList : 追加するscript（外部ファイル）のリスト<br>
 * scriptTextList : 追加するscript（テキスト）のリスト<br>
 * @param tabKey   業務画面ID
 * @param response レスポンスオブジェクト
 * @returns レスポンス解析オブジェクト
 */
expj.common.analyzeBusinessScreenResponse = function (tabKey, response) {
  var htmlObject;
  var result;
  if (response.status === 200) {
    // HTTPステータスコードが200の時の処理（正常動作時）
    // レスポンスオブジェクトからHTMLオブジェクトを取得する
    /** jQueryのHTMLオブジェクト */
    htmlObject = this.convertBusinessScreenHtmlObject(response);
    /** jQueryのHTMLオブジェクト解析結果 */
    result = this.analyzeBusinessScreenHtmlObject(tabKey, htmlObject, response);
    return result;
  } else {
    /** jQueryのHTMLオブジェクト */
    htmlObject = this.convertBusinessScreenHtmlObject(response);
    if (htmlObject === null) {
      result = expj.common.createErrorResponseObjectForAnalyzeResponse();
      result.tabBody = response.statusText;
      result.tabBody += '<hr><button>Close</button>';
      return result;
    }
    /** jQueryのHTMLオブジェクト解析結果 */
    result = this.analyzeBusinessScreenHtmlObject('error', htmlObject, response);
    if (result.tabBody !== null) {
      return result;
    } else {
      /** タブに表示する内容 */
      var tabBody = '';
      for (var i = 0, len = htmlObject.length; i < len; i++) {
        var target = htmlObject[i];
        if (target.nodeName !== '#text' && target.nodeName !== 'TITLE') {
          tabBody += target.outerHTML;
        }
      }
      // 内容を生成する
      tabBody += '<hr><button>Close</button>';
      result = expj.common.createErrorResponseObjectForAnalyzeResponse();
      result.tabBody = tabBody;
      return result;
    }
  }
};

/**
 * jQueryのHTMLオブジェクトを解析する関数。<br>
 * jQueryのHTMLオブジェクトは以下のような配列形式。<br>
 * htmlObject[0]="metaオブジェクト(metaタグ要素：書かれている分だけ配列に出現する)"<br>
 * htmlObject[1]="titleオブジェクト(titleタグ要素：ひとつなはず)"<br>
 * htmlObject[2]="linkオブジェクト(linkタグ要素：書かれている分だけ配列に出現する)"<br>
 * htmlObject[3]="scriptオブジェクト(scriptタグ要素：書かれている分だけ配列に出現する)"<br>
 * htmlObject[4]="textオブジェクト(metaタグなどの内部に書かれたテキスト)"<br>
 * htmlObject[5]="commentオブジェクト(コメント)"<br>
 * htmlObject[6]="bodyタグ直下のオブジェクト"<br>
 * EXPJではbodyの直下に固有のIDを与えたDIVタグ設けるものとする。<br>
 * <br>
 * レスポンス解析オブジェクトの内容は以下のとおり。<br>
 * tabBody : タブ（内容部）に表示する内容（HTML構造）<br>
 * scriptSrcList : 追加するscript（外部ファイル）のリスト<br>
 * scriptTextList : 追加するscript（テキスト）のリスト<br>
 * @param tabKey     業務画面ID
 * @param htmlObject jQueryのHTMLオブジェクト
 * @returns
 */
expj.common.analyzeBusinessScreenHtmlObject = function (tabKey, htmlObject, response) {
  /** HTMLテキストを格納した変数 */
  var htmlBody = '';
  /** 追加するscript（外部ファイル）のリスト */
  var scriptSrcList = [];
  /** 追加するscript（テキスト）のリスト */
  var scriptTextList = [];
  /** ダイアログ用HTMLを格納したリスト */
  var dialogHtmlBodyList = [];
  var formHtmlBodyList = [];
  var viewHtmlBodyList = [];
  var treeHtmlBodyList = [];
  var buttonHtmlBodyList = [];
  var loadScreenId = '';
  var isNewData = true;

  var screenId = tabKey;

  var result = null;
  
  // HTMLオブジェクトは配列で渡される。その要素をひとつひとつ調べていく。
  for (var i = 0, len = htmlObject.length; i < len; i++) {
    /** HTMLオブジェクト（単体） */
    var target = htmlObject[i];
    if (target.tagName === 'DIV') {
      // オブジェクトのタグ名がDIVだった時の処理
      if (target.id === 'expj-session-timeout') {
        // DIVタブのIDが"expj-session-timeout"の場合、セッションタイムアウトが発生したものとする。
        this.executeSessionTimeout();
        return null;
      }
      if (target.id === 'expj-business-screen-startbusiness') {
        // DIVタブのIDが"expj-business-screen-startbusiness"の場合、StartBusiness.jspが返却されたものとする。
        // DIVタグの内部に次にアクセスすべきURLが記述されているのでそれを使い、再度アクセスする。
        /** 次にアクセスすべきURL */
        var url = target.getAttribute('data-href');
        /** アクセスした結果オブジェクト */
        var requestParameter = {};
        var res = this.accessBusinessScreen('GET', url, requestParameter);
        // レスポンスの解析を依頼し、それをそのまま返却する
        var ret = this.analyzeBusinessScreenResponse(tabKey, res);
        return ret;
      }
      // DIVタブのIDがそれ以外の場合は業務画面を判定する。
      // 業務画面はDIVのIDが"expj-business-screen-[screenId]"となる。
      /** 業務画面ID */
      var id = 'expj-business-screen-' + tabKey;
      // 引数で与えられたIDと一致する場合はDIVタグ内部のインナーHTMLを取得する。
      if (target.id === id) {
        if (target.getAttribute('data-noFlash') === 'true') {
          result = {
            'noFlash' : true,
            'screenId' : screenId,
            'tabBody' : response.responseText,
            'loadScreenId' : target.getAttribute('data-screenId')
          };
          return result;
        } else {
          htmlBody += target.innerHTML;
          loadScreenId = target.getAttribute('data-screen');
        }
        if (target.getAttribute('data-newdata') === 'false') {
          isNewData = false;
        }
      } else if (target.id === 'expj-business-screen-error') {
        htmlBody += target.innerHTML;
        screenId = 'error';
        loadScreenId = 'error';
      } else {
        // 一致しない場合、詳細ダイアログの可能性があるので調べる
        var orftype = target.getAttribute('data-orftype');
        var mode = target.getAttribute('data-mode');
        // 詳細ダイアログの場合、ダイアログリストに格納する
        if (orftype === 'DataGrid' && mode === 'DETAIL') {
          dialogHtmlBodyList.push(target);
        } else if (orftype === 'DataGrid' && mode === 'VIEW') {
          viewHtmlBodyList.push(target);
        } else if (orftype === 'DataGrid' && mode === 'FORM') {
          formHtmlBodyList.push(target);
        } else if (orftype === 'Tree' && mode === 'TREE') {
          treeHtmlBodyList.push(target);
        } else if (orftype === 'DataGrid' && mode === 'BUTTON') {
          buttonHtmlBodyList.push(target);
        }
      }
    } else if (target.tagName === 'FORM') {
      // iframe-FORM
      var orftype = target.getAttribute('data-orftype');
      var mode = target.getAttribute('data-mode');
      if (orftype === 'DataGrid' && mode === 'FORM') {
        formHtmlBodyList.push(target);
      }
    } else if (target.tagName === 'SCRIPT') {
      // オブジェクトのタグ名がscriptだった時の処理
      // 画面固有のscriptを保存する。
      // 外部ファイルとテキスト記述の2パターンがあるのでそれぞれを分けて保存する
      
      if (target.src === '') {
        // HTML上にJavaScriptが記述されている場合はインナーHTMLを保存する
        scriptTextList.push(target);
      } else {
        // 外部ファイルのURLが指定されている場合はそのURLを保存する
        scriptSrcList.push(target);
      }
    } else if (target.tagName === 'IFRAME' && $(target).hasClass('expj-upload-iframe')) {
      htmlBody += target.outerHTML;
    }
  }
  
  if (htmlBody === '') {
    htmlBody = null;
  }

  /** 解析結果オブジェクト */
  result = {
    'noFlash' : false,
    'tabBody' : htmlBody,
    'scriptSrcList' : scriptSrcList,
    'scriptTextList' : scriptTextList,
    'screenId' : screenId,
    'dialogBodyList' : dialogHtmlBodyList,
    'viewBodyList' : viewHtmlBodyList,
    'formBodyList' : formHtmlBodyList,
    'treeBodyList' : treeHtmlBodyList,
    'buttonBodyList' : buttonHtmlBodyList,
    'loadScreenId' : loadScreenId,
    'isNewData' : isNewData
  };
  return result;
};

/**
 * 業務画面追加時に業務画面固有のJavaScript（外部ファイル）を画面枠部品のDOMに追加する関数。<br>
 * ここで追加されるscriptタグにはclass名として"expj-business-screen-[screenId]-dedicated-javascript"が与えられる。<br>
 * ここで追加されるclassは画面削除時にscriptを削除するために使用する。<br>
 * @param screenId   業務画面ID
 * @param scriptList JavaScript（外部ファイル）のリスト
 */
expj.common.appendBusinessScreenJavaScriptSource = function (screenId, scriptList) {
  /**
   * scriptタグに埋め込むclass名。<br>
   * "expj-business-screen-[screenId]-dedicated-javascript"という名前になる。<br>
   */
  var className = 'expj-business-screen-' + screenId + '-dedicated-javascript';
  //業務画面固有のJavaScript（外部ファイル）をすべて追加する
  for (var i = 0, len = scriptList.length; i < len; i++) {
    /** JavaScript（外部ファイルURL）の取得 */
    var srcObj = $(scriptList[i]);
    // scriptタグにclassを追加する
    srcObj.addClass(className);
    // 画面枠部品のDOM（head部分）に生成したscriptを追加する
    srcObj.appendTo('head');
  }
};

/**
 * 業務画面追加時に業務画面固有のJavaScript（テキスト記述）を画面枠部品のDOMに追加する関数。<br>
 * ここで追加されるscriptタグにはclass名として"expj-business-screen-[screenId]-dedicated-javascript"が与えられる。<br>
 * ここで追加されるclassは画面削除時にscriptを削除するために使用する。<br>
 * @param screenId   業務画面ID
 * @param scriptList JavaScript（テキスト記述）のリスト
 */
expj.common.appendBusinessScreenJavaScriptText = function (screenId, scriptList) {
  /**
   * scriptタグに埋め込むclass名。<br>
   * "expj-business-screen-[screenId]-dedicated-javascript"という名前になる。<br>
   */
  var className = 'expj-business-screen-' + screenId + '-dedicated-javascript';
  // 業務画面固有のJavaScript（テキスト記述）をすべて追加する
  for (var i = 0, len = scriptList.length; i < len; i++) {
    /** JavaScript（テキスト）の取得 */
    var textObj = $(scriptList[i]);
    // scriptタグにclassを追加する
    textObj.addClass(className);
    // 画面枠部品のDOM（head部分）に生成したscriptを追加する
    textObj.appendTo('head');
  }
};

/**
 * 業務画面追加時に業務画面固有のダイアログを画面枠部品のDOMに追加する関数。<br>
 * ここで追加されるダイアログのdivタグにはclass名として"expj-business-screen-[screenId]-dedicated-detail-dialog"が与えられる。<br>
 * ここで追加されるclassは業務画面削除時にdivタグを削除するために使用する。<br>
 * @param screenId   業務画面ID
 * @param dialogList ダイアログを構築したHTMLのリスト
 */
expj.common.appendBusinessScreenHtmlDialog = function (screenId, dialogList) {
  /**
   * ダイアログを構築したDIVタグに埋め込むclass名<br>
   * "expj-business-screen-[screenId]-dedicated-detail-dialog"という名前になる。<br>
   */
  var className = 'expj-business-screen-' + screenId + '-dedicated-detail-dialog';
  for (var i = 0, len = dialogList.length; i < len; i++) {
    // htmlを取得し、domに変換する
    var dom = $(dialogList[i]);
    // domにクラスを追加する
    dom.attr('class', className);
    // bodyタグ子要素の最後尾にdomを追加する
    dom.appendTo('body');
  }
};

/**
 * 業務画面の削除を取りまとめる関数。<br>
 * 以下の処理を実行する。<br>
 * 1．画面枠から業務画面を削除<br>
 * 2．DOMのヘッダーに格納された業務画面固有のJavaScriptを削除<br>
 * 3.Bodyに格納された業務画面固有のDetailWindowを削除<br>
 * 4．業務画面起動管理マップの更新<br>
 * @param screenId 削除対象の業務画面ID
 */
expj.common.deleteBusinessScreen = function (screenId) {
  // 画面枠部品から業務画面のデータを削除する
  this.deleteBusinessScreenTabPage(screenId);

  // 業務画面固有のJavaScriptを削除
  this.deleteBusinessScreenJavaScript(screenId);

  // 業務画面固有のDetailWindowの削除
  this.deleteBusinessScreenDialog(screenId);
  
  // 業務画面起動管理マップを更新する
  this.openBusinessScreenState[screenId].activate = false;

  expj.common.viewInstanceMap[screenId] = {};
  expj.common.calendarInstanceMap[screenId] = {};
  expj.common.treeInstanceMap[screenId] = {};
  expj.common.detailDialogMap[screenId] = {};
  expj.common.datagridScrollMap[screenId] = {};
  expj.common.focusPositionMap[screenId] = null;
  expj.common.innerTabMap[screenId] = null;
  
  $(window).off('resize.' + screenId);
  
  // コンソールメッセージのクリア
  this.clearScreenFrameConsoleMessage();
};

/**
 * 業務画面固有のJavaScriptを削除する関数<br>
 * @param screenId 画面ID
 */
expj.common.deleteBusinessScreenJavaScript = function (screenId) {
  // 業務画面固有のJavaScriptを削除
  /** 削除対象の業務画面要素のクラスセレクタ */
  var className = '.expj-business-screen-' + screenId + '-dedicated-javascript';
  /** 削除対象の業務画面要素のjQueryオブジェクト（複数） */
  var obj = $(className);
  // DOMのヘッダーに追加されたJavaScriptを削除する
  obj.remove();
};

expj.common.deleteBusinessScreenDialog = function (screenId) {
  //業務画面固有のDetailWindowの削除
  var className = '.expj-business-screen-' + screenId + '-dedicated-detail-dialog';
  var obj = $(className);
  // 要素ひとつひとつに対して行う（親タグが追加されているため、JavaScriptのように一括での削除が行えない
  for (var i = 0, len = obj.length; i < len; i++) {
    // 対象のオブジェクトを取得
    var target = $(obj[i]);
    // 親要素の削除
    target.parent().remove();
    // 対象の要素の削除
    target.remove();
  }
};

/**
 * Ajaxで指定されたURLにリクエストを投げ、レスポンスオブジェクトを取得する関数<br>
 * @param httpMethod HTTPメソッド
 * @param url        参照先URL
 * @param requestParameter リクエストパラメータ(JSON)
 * @returns レスポンスオブジェクト
 */
expj.common.accessBusinessScreen = function (httpMethod, url, requestParameter) {
  var response = $.ajax({
    'type' : httpMethod,
    'url' : url,
    'async' : false,
    'cache' : false,
    'data' : requestParameter
  });
  return response;
};

/**
 * 指定されたレスポンスオブジェクトからHTMLオブジェクトを取得する関数。<br>
 * レスポンスオブジェクトがnullまたはオブジェクト内にレスポンステキストが無い場合はnullを返す。<br>
 * @param response レスポンスオブジェクト
 * @returns HTMLオブジェクトまたはnull
 */
expj.common.convertBusinessScreenHtmlObject = function (response) {
  // 引数で与えられたレスポンスやレスポンステキストが無効な場合、nullを返す
  if (response === null || typeof(response) === 'undefined' || typeof(response.responseText) === 'undefined') {
    return null;
  }
  // レスポンステキストが有効な場合、jQueryのオブジェクト（HTMLオブジェクト）を返す
  return $(response.responseText);
};

/**
 * セッションタイムアウトを検知した時に実行する関数。<br>
 * メイン画面を強制的にセッションタイムアウト画面に遷移させる。<br>
 * 業務画面ウィンドウはクローズされる。
 */
expj.common.executeSessionTimeout = function () {
  // メイン画面をセッションタイムアウト画面に移動。
  opener.top.location.href='SessionTimeout.jsp';
  // 業務画面ウィンドウをクローズする。
  window.close();
};

/**
 * 各業務画面の閉じるボタンの実行イベントハンドラ関数。<br>
 * 閉じるダイアログが起動する。<br>
 */
expj.common.executeBusinessScreenCloseDialog = function (screenId) {
  if (!expj.common.pscript.callMessage()) {
    var messageKey = 'ZZ01112';
    var dialogMessage= '[' + messageKey + ']' + getMessageOnly(messageKey);
    var result = confirm(dialogMessage);
    if (result) {
      this.actionBusinessScreenCloseDialogPressOK(screenId);
    }
    //クリックした閉じるボタン情報をクリアする
    expj.common.pscript.onClickTargetButtonData = null;
  }
};

/**
 * 各業務画面の閉じるダイアログのOKボタンイベント。<br>
 * この関数は閉じるダイアログ初期化時に閉じるダイアログのOKボタンにバインドされる。<br>
 * 他の関数からは呼ばれることはない。<br>
 */
expj.common.actionBusinessScreenCloseDialogPressOK = function (screenId) {
  // 業務画面削除の実施
  this.deleteBusinessScreen(screenId);
  // 呼び出しもとがある場合は、その画面に遷移する
  var moveScreenId = expj.common.closeMoveMap[screenId];
  if (expj.common.checkNameSpace(moveScreenId)) {
    expj.common.activateBusinessScreenTabPage(moveScreenId);
    delete expj.common.closeMoveMap[screenId];
  }
};

/**
 * 共通画面を閉じるボタンを押した時に実行される処理。<br>
 */
expj.common.closeCommonPage = function (screenId) {
  // 表示するメッセージの作成
  var code = 'ZZ01112';
  var str = '[' + code + '] ' + getMessageOnly(code);
  var str2 = '<img draggable="false" src="common/img/info.png">&nbsp;<span style="color: #0000FF">[' + code + '] ' + getMessageOnly(code) + '</span>';
  // コンソールにメッセージを表示
  this.setScreenFrameConsoleMessage(str2);
  // ネイティブダイアログの起動
  if (confirm(str)) {
    // OKボタンが押された場合、コンソールを初期化し、業務画面を閉じる
    this.clearScreenFrameConsoleMessage();
    this.deleteBusinessScreen(screenId);
  }
};

/**
 * エラー画面を閉じるボタンを押した時に実行される処理。<br>
 */
expj.common.closeErrorPage = function (screenId) {
  this.clearScreenFrameConsoleMessage();
  this.deleteBusinessScreen(screenId);
};

/**
 * Peekerを起動する関数。<br>
 * @param submitScreenId  Peekerを呼び出す画面ID
 * @param parameterValues Peekerに与えるパラメータ
 */
expj.common.executeStartupPeekerPage = function (submitScreenId, parameterValues) {
  /** Peekerを実装した画面ID */
  var peekerId = 'ZZ0010010';
  /** PeekerのServlet */
  var servletName = peekerId + 'Servlet';
  /** RequestParameter */
  var requestParameter = {
      'SUBMIT_PROGRAM' : servletName,
      'SUBMIT_SCREEN' : submitScreenId,
      '_FLASHPARAMETERVALUES_' : parameterValues
  };
  /** レスポンス */
  var response = this.accessBusinessScreen('GET', servletName, requestParameter);
  /** レスポンス解析結果 */
  var result = this.analyzeBusinessScreenResponse(peekerId, response);
  
  var peekerScreenState = this.openBusinessScreenState[peekerId];
  if (typeof(peekerScreenState) === 'undefined') {
    peekerScreenState = {
      'activate' : false,
      'url' : ''
    };
    this.openBusinessScreenState[peekerId] = peekerScreenState;
  }
  
  expj.common.closeMoveMap[peekerId] = submitScreenId;
  
  // コンソールメッセージのクリア
  this.clearScreenFrameConsoleMessage();
  
  expj.common.datagridScrollMap[peekerId] = {};

  // Peekerが起動済みならば、既に起動しているPeekerを破棄する
  if (peekerScreenState.activate === true) {
    var tabBodyId = '#expj-business-screen-tabs-body-' + peekerId;
    // DOMの削除
    $(tabBodyId).html('');
    // 業務画面固有のJavaScriptを削除
    this.deleteBusinessScreenJavaScript(peekerId);
    // 業務画面固有のDetailWindowの削除
    this.deleteBusinessScreenDialog(peekerId);
    
    // 業務画面固有のJavaScriptを画面枠部品に再登録
    this.appendBusinessScreenHtmlDialog(peekerId, result.dialogBodyList);
    this.appendBusinessScreenJavaScriptSource(peekerId, result.scriptSrcList);
    this.appendBusinessScreenJavaScriptText(peekerId, result.scriptTextList);
    
    // タブの内容を更新
    $(tabBodyId).html(result.tabBody);
    
    var tabIndex = expj.common.getScreenFrameTabsLIIndexByScreenId(peekerId);
    this.screenFrameTabsAreaInstance.tabs('option', 'active', tabIndex);
    expj.common.activateBusinessScreenTabPage(peekerId);
  } else {
    // 業務画面をタブに追加する
    this.createBusinessScreenTabPage(peekerId, 'PEEKER', result.tabBody);
    // PeekerのJavaScriptを追加
    this.appendBusinessScreenJavaScriptSource(peekerId, result.scriptSrcList);
    this.appendBusinessScreenJavaScriptText(peekerId, result.scriptTextList);
    // Peekerの詳細ウィンドウを追加
    this.appendBusinessScreenHtmlDialog(peekerId, result.dialogBodyList);
    
    // Peekerを起動済み業務画面に追加する
    peekerScreenState.activate = true;
  }
  
  if (result.screenId === peekerId) {
    // PEEKER呼び出しが成功した場合の処理

    // PEEKER画面の閉じるボタンにイベントを追加する
    $('#expj-business-screen-close-btn-' + peekerId).on('click', function() {
      // 閉じるダイアログの起動
      expj.common.executeBusinessScreenCloseDialog(peekerId);
    });
    
    // Peekerのオンロード処理の追加
    this.callOnLoadFunction('ZZ0010010');
  } else {
    // PEEKER呼び出しに失敗した（エラー画面表示）の場合
    expj.common.bindCloseButtonEvent(peekerId, result);
    
    expj.error.viewConsole();
    expj.error.viewConsole = function () {};
  }
  
  // 画面レイアウトの調整
  this.regulateScreenFrameTabsAreaHeight();
  
  setTimeout(function(){
    expj.common.controlLoadingScreen(false);
  },1);
};

expj.common.updatePeekerPage = function (parameterValues, dialogKeep) {
  /** Peekerを実装した画面ID */
  var peekerId = 'ZZ0010010';
  /** PeekerのServlet */
  var servletName = peekerId + 'Servlet';
  /** RequestParameter */
  var requestParameter = {
      'SUBMIT_PROGRAM' : servletName,
      'SUBMIT_SCREEN' : peekerId,
      '_FLASHPARAMETERVALUES_' : parameterValues
  };
  /** レスポンス */
  var response = this.accessBusinessScreen('GET', servletName, requestParameter);
  /** レスポンス解析結果 */
  var result = this.analyzeBusinessScreenResponse(peekerId, response);
  
  // コンソールメッセージのクリア
  this.clearScreenFrameConsoleMessage();
  
  var tabBody = result.tabBody;
  
  var tabBodyId = '#expj-business-screen-tabs-body-' + peekerId;
  
  var dialogInfo = {};
  var dialogId, dialogMap, parent;
  if (dialogKeep) {
    for (dialogId in this.detailDialogMap[peekerId]) {
      dialogMap = this.detailDialogMap[peekerId][dialogId];
      if (dialogMap.visible) {
        var dialogData = {};
        parent = dialogMap.dialogInstance.parent();
        dialogData.left = parent.css('left');
        dialogData.top = parent.css('top');
        dialogInfo[dialogId] = dialogData;
      }
    }
  }
  
  // VIEWの幅を維持するための更新前の状態を記憶する
  var viewColumnWidth = [];
  $('#expj-business-screen-tabs-body-' + peekerId).find('div.expj-datagrid-view').each(function () {
    var id = this.id;
    var headWrapperWidth = $(this).find('div.orteusView_scrollHeadWrapper').css('width');
    var headTableWidth = $(this).find('div.orteusView_scrollHeadWrapper > table').css('width');
    var columnList = $(this).find('div.orteusView_scrollHeadWrapper > table > thead > tr > th');
    var columnWidthList = [];
    for (var i = 0; i < columnList.length; i++) {
      var columnWidth = $(columnList[i]).css('width');
      columnWidthList.push(columnWidth);
    }
    var viewData = {
      'id' : id,
      'headWrapperWidth' : headWrapperWidth,
      'headTableWidth' : headTableWidth,
      'columnWidthList' : columnWidthList
    };
    viewColumnWidth.push(viewData);
  });

  // DOMの削除
  $(tabBodyId).html('');
  // 業務画面固有のJavaScriptを削除
  this.deleteBusinessScreenJavaScript(peekerId);
  // 業務画面固有のDetailWindowの削除
  this.deleteBusinessScreenDialog(peekerId);
  
  // 業務画面固有のJavaScriptを画面枠部品に再登録
  this.appendBusinessScreenHtmlDialog(peekerId, result.dialogBodyList);
  this.appendBusinessScreenJavaScriptSource(peekerId, result.scriptSrcList);
  this.appendBusinessScreenJavaScriptText(peekerId, result.scriptTextList);
  
  // タブの内容を更新
  $(tabBodyId).html(result.tabBody);
  
  if (result.screenId === peekerId) {
    // PEEKER呼び出しが成功した場合の処理

    // PEEKER画面の閉じるボタンにイベントを追加する
    $('#expj-business-screen-close-btn-' + peekerId).on('click', function() {
      // 閉じるダイアログの起動
      expj.common.executeBusinessScreenCloseDialog(peekerId);
    });
    
    // Peekerのオンロード処理の追加
    this.callOnLoadFunction('ZZ0010010');
    
    if (dialogKeep) {
      for (dialogId in dialogInfo) {
        if (dialogInfo[dialogId]) {
          dialogMap = this.detailDialogMap[peekerId][dialogId];
          dialogMap.hidden = false;
          dialogMap.dialogInstance.dialog('open');
          parent = $('#expj-ZZ0010010-detail-dialog').parent();
          parent.css('left', dialogInfo[dialogId].left);
          parent.css('top', dialogInfo[dialogId].top);
        }
      }
    }
    
    // VIEWの列幅設定
    for (i = 0; i < viewColumnWidth.length; i++) {
      var viewData = viewColumnWidth[i];
      var baseDataGrid = $('#' + viewData.id);
      baseDataGrid.find('div.orteusView_scrollHeadWrapper').css('width', viewData.headWrapperWidth);
      baseDataGrid.find('div.orteusView_scrollHeadWrapper > table').css('width', viewData.headTableWidth);
      baseDataGrid.find('div.orteusView_BodyArea > table').css('width', viewData.headTableWidth);
      var columnList = baseDataGrid.find('div.orteusView_scrollHeadWrapper > table > thead > tr > th');
      var bodyColumnList = baseDataGrid.find('div.orteusView_BodyArea > table > thead > tr > th');
      for (var j = 0; j < columnList.length; j++) {
        $(columnList[j]).css('width', viewData.columnWidthList[j]);
        $(bodyColumnList[j]).css('width', viewData.columnWidthList[j]);
      }
    }

    expj.common.ui.focusFirstComponent(peekerId);
    
  } else {
    expj.common.viewInstanceMap[peekerId] = {};
    expj.common.calendarInstanceMap[peekerId] = {};
    expj.common.treeInstanceMap[peekerId] = {};
    expj.common.detailDialogMap[peekerId] = {};
    expj.common.datagridScrollMap[peekerId] = {};
    expj.common.focusPositionMap[peekerId] = null;
    
    // PEEKER呼び出しに失敗した（エラー画面表示）の場合
    expj.common.bindCloseButtonEvent(peekerId, result);
    
    expj.error.viewConsole();
    expj.error.viewConsole = function () {};
  }
  
  // 画面レイアウトの調整
  this.regulateScreenFrameTabsAreaHeight();
  
  setTimeout(function(){
    expj.common.controlLoadingScreen(false);
  },1);
};

/**
 * タブの中身を更新する関数。<br>
 *「expj-business-screen-tabs-body-[tabKey]」という名前が与えられているDIVタグの内容を差し替える。<br>
 * @param tabKey 更新するタブに割り当てられている一意なキー
 * @param contents 更新するコンテンツ
 */
expj.common.updateBusinessScreenTab = function (tabKey, contents) {
  /** タブの内容 */
  var tabBody = contents.tabBody;

  /** タブ本体を構成するDIVタグに与えられるID */
  var tabBodyId = '#expj-business-screen-tabs-body-' + tabKey;
  
  // コンソールメッセージのクリア
  this.clearScreenFrameConsoleMessage();
  
  var dialogId, dialogMap, parent, i, len, j;
  if (tabBody !== null && contents.isNewData) {
    var dialogInfo = {};
    for (dialogId in this.detailDialogMap[tabKey]) {
      dialogMap = this.detailDialogMap[tabKey][dialogId];
      if (dialogMap.visible) {
        var dialogData = {};
        parent = dialogMap.dialogInstance.parent();
        dialogData.left = parent.css('left');
        dialogData.top = parent.css('top');
        dialogInfo[dialogId] = dialogData;
      }
    }
    //業務画面更新する前にフォームスクロール位置の状態記録
    var _scroll = [];
    var formList = $('#expj-business-screen-tabs-body-' + tabKey).find('form');
    if (formList.length > 0) {
      for (i = 0, len = formList.length; i < len; i++) {
        _scroll.push(formList[i].scrollTop);
      }
    }

    // VIEWの幅を維持するための更新前の状態を記憶する
    var viewColumnWidth = [];
    $('#expj-business-screen-tabs-body-' + tabKey).find('div.expj-datagrid-view').each(function () {
      var id = this.id;
      var headWrapperWidth = $(this).find('div.orteusView_scrollHeadWrapper').css('width');
      var headTableWidth = $(this).find('div.orteusView_scrollHeadWrapper > table').css('width');
      var columnList = $(this).find('div.orteusView_scrollHeadWrapper > table > thead > tr > th');
      var columnWidthList = [];
      for (var i = 0; i < columnList.length; i++) {
        var columnWidth = $(columnList[i]).css('width');
        columnWidthList.push(columnWidth);
      }
      var viewData = {
        'id' : id,
        'headWrapperWidth' : headWrapperWidth,
        'headTableWidth' : headTableWidth,
        'columnWidthList' : columnWidthList
      };
      viewColumnWidth.push(viewData);
    });
    
    // fileuploadを維持するための更新前の状態を外側に記憶する
    var iframeField = $('#expj-business-screen-tabs-body-' + tabKey).find('iframe[name="form_iframe"]');
    var formField = null;
    if (iframeField.length !== 0) {
        formField = $(iframeField[0].contentDocument.body).find('form[name="csvup"]');
        if(formField.length != 0){
        var fileFieldDiv = $('#expj-file-field');
        var fileFieldDivTmp = $('<div id="expj-file-field-tmp">').insertAfter(fileFieldDiv);
        fileFieldDivTmp.append($(formField[0]));
      }
    }
    
    // DOMの削除
    $(tabBodyId).html('');
    // 業務画面固有のJavaScriptを削除
    this.deleteBusinessScreenJavaScript(tabKey);
    // 業務画面固有のDetailWindowの削除
    this.deleteBusinessScreenDialog(tabKey);
    $(window).off('resize.' + tabKey);
    
    // 詳細ウィンドウのDOMを追加した際にスクロールが表示されるのを防ぐ
    expj.common.tuningScreenOverflow();
    
    // 業務画面固有のJavaScriptを画面枠部品に再登録
    this.appendBusinessScreenHtmlDialog(tabKey, contents.dialogBodyList);
    this.appendBusinessScreenJavaScriptSource(tabKey, contents.scriptSrcList);
    this.appendBusinessScreenJavaScriptText(tabKey, contents.scriptTextList);
    
    try {
      // タブの内容を更新
      $(tabBodyId).html(tabBody);
    } catch (e) {
      alert(e + '\nPScript Syntax Error!');
      $(tabBodyId).find('.expj-business-screen-close-button').bind('click', function () {
        expj.common.executeBusinessScreenCloseDialog(tabKey);
      });
    }

    // 業務画面の閉じるボタンにイベントハンドラを登録
    this.bindCloseButtonEvent(tabKey, contents);

    // 画面固有のonLoad関数呼び出し
    if (contents.screenId !== 'error') {
      this.callOnLoadFunction(tabKey);
      for (dialogId in dialogInfo) {
        if (dialogInfo[dialogId]) {
          dialogMap = this.detailDialogMap[tabKey][dialogId];
          dialogMap.hidden = false;
          dialogMap.dialogInstance.dialog('open');
          parent = $('#expj-' + tabKey + '-' + dialogId).parent();
          parent.css('left', dialogInfo[dialogId].left);
          parent.css('top', dialogInfo[dialogId].top);
        }
      }
      //業務画面更新後にフォームスクロール位置設定
      if (_scroll.length > 0) {
        formList = $('#expj-business-screen-tabs-body-' + tabKey).find('form');
        if (formList.length > 0) {
          len = _scroll.length > formList.length ? formList.length : _scroll.length;
          for (i = 0; i < len; i++) {
            formList[i].scrollTop = _scroll[i];
          }
        }
      }
      
      // VIEWの列幅設定
      for (i = 0; i < viewColumnWidth.length; i++) {
        var viewData = viewColumnWidth[i];
        var baseDataGrid = $('#' + viewData.id);
        if(baseDataGrid.hasClass('expj-view-headeronly')) {
          continue;
        }
        baseDataGrid.find('div.orteusView_scrollHeadWrapper').css('width', viewData.headWrapperWidth);
        baseDataGrid.find('div.orteusView_scrollHeadWrapper > table').css('width', viewData.headTableWidth);
        baseDataGrid.find('div.orteusView_BodyArea > table').css('width', viewData.headTableWidth);
        var columnList = baseDataGrid.find('div.orteusView_scrollHeadWrapper > table > thead > tr > th');
        var bodyColumnList = baseDataGrid.find('div.orteusView_BodyArea > table > thead > tr > th');
        for (j = 0; j < columnList.length; j++) {
          $(columnList[j]).css('width', viewData.columnWidthList[j]);
          $(bodyColumnList[j]).css('width', viewData.columnWidthList[j]);
        }
      }
      
      // fileupload iframeに記憶情報を設定
      setTimeout(function () {
        var bodyField = null;
        var iframeField = $('#expj-business-screen-tabs-body-' + tabKey).find('iframe[name="form_iframe"]');
        if (iframeField.length !== 0) {
          var tmpFormDiv = $('#expj-file-field-tmp');
          var tmpForm = tmpFormDiv.find('form[name="csvup"]');
          $(iframeField[0]).attr('src','');
          iframeField[0].contentDocument.open();
          iframeField[0].contentDocument.write('<html><head></head><body></body></html>');
          iframeField[0].contentDocument.close();
          bodyField = $(iframeField[0].contentDocument.body);
          if(bodyField.length !== 0){
            bodyField.empty();
            bodyField[0].appendChild(tmpForm[0]);
            tmpFormDiv.remove();
          }
        }
      }, expj.common.screenFrameLoadingTime);
      
      document.getElementById('expj-business-screen-tabs-body-' + tabKey).setAttribute('data-loadingPage', contents.loadScreenId);
      
      expj.common.ui.focusFirstComponent(tabKey);
    } else {
      expj.common.viewInstanceMap[tabKey] = {};
      expj.common.calendarInstanceMap[tabKey] = {};
      expj.common.treeInstanceMap[tabKey] = {};
      expj.common.detailDialogMap[tabKey] = {};
      expj.common.datagridScrollMap[tabKey] = {};
      expj.common.focusPositionMap[tabKey] = null;
      expj.common.innerTabMap[tabKey] = null;
      
      expj.error.viewConsole();
      expj.error.viewConsole = function () {};
    }
  } else if (tabBody !== null) {
    /*
    var target = $('.expj-script-' + tabKey + '_console');
    parent = target.parent();
    var newConsole = $(tabBody).find('.expj-script-' + tabKey + '_console');
    target.remove();
    newConsole.appendTo(parent);
    */
    $('.expj-script-' + tabKey + '_console').remove();
    for (i = 0, len = contents.scriptTextList.length; i < len; i++) {
       var scriptObject = $(contents.scriptTextList[i]);
       if (scriptObject.hasClass('expj-script-' + tabKey + '_console')) {
         scriptObject.addClass('expj-business-screen-' + tabKey + '-dedicated-javascript');
         scriptObject.appendTo('head');
       }
    }
    expj[tabKey].viewConsole();
  } else {
    // iframe処理
    if (contents.dialogBodyList.length === 0 && contents.viewBodyList.length === 0 && contents.formBodyList.length === 0 && contents.treeBodyList.length === 0 && contents.buttonBodyList.length === 0) {
      contents.screenId = '';
      tabBody = '<div style=\"text-align:center;background-color:#dadcf4;height:100%;font-size:16pt;\"><div>"' + nodeTitle + '" is not HTML5 page.</div><hr><button>Close</button></div>';
      // タブの内容を更新
      $(tabBodyId).html(tabBody);
      // 業務画面の閉じるボタンにイベントハンドラを登録
      this.bindCloseButtonEvent(tabKey, contents);
    } else {
      // 詳細ウィンドウのDOMを追加した際にスクロールが表示されるのを防ぐ
      if (contents.dialogBodyList.length > 0) {
        expj.common.tuningScreenOverflow();
      }
      
      var dataGridObj, dataGridId, dataGridIdSplit;
      var dataGridDOMList = $('#expj-business-screen-tabs-body-' + tabKey).find('div[data-orftype]');
      var dataGridList = [];
      for (i = 0; i < dataGridDOMList.length; i++) {
        dataGridObj = dataGridDOMList[i];
        var mode = dataGridObj.getAttribute('data-mode');
        dataGridId = '';
        if (mode === 'FORM') {
          dataGridId = dataGridObj.parentNode.getAttribute('id');
        } else {
          dataGridId = dataGridObj.getAttribute('id');
        }
        dataGridIdSplit = dataGridId.split('-');
        dataGridId = dataGridIdSplit[2];
        dataGridList.push({
          'id' : dataGridId,
          'mode' : mode,
          'load' : false
        });
      }
      dataGridDOMList = $('div.expj-business-screen-' + tabKey + '-dedicated-detail-dialog[data-mode="DETAIL"]');
      for (i = 0; i < dataGridDOMList.length; i++) {
        dataGridObj = dataGridDOMList[i];
        dataGridId = dataGridObj.getAttribute('id');
        dataGridIdSplit = dataGridId.split('-');
        dataGridId = dataGridIdSplit[2];
        dataGridList.push({
          'id' : dataGridId,
          'mode' : 'DETAIL',
          'load' : false
        });
      }
      
      expj.common.replaceDialogDom(contents.dialogBodyList, contents.scriptTextList, dataGridList);
      
      expj.common.replaceViewDom(contents.viewBodyList, contents.scriptTextList, dataGridList);
      
      expj.common.replaceFormDom(contents.formBodyList, contents.scriptTextList, dataGridList);
      
      expj.common.replaceTreeDom(contents.treeBodyList, contents.scriptTextList, dataGridList);
      
      expj.common.replaceButtonDom(contents.buttonBodyList, contents.scriptTextList, dataGridList);
      
      expj.common.particalReplaceOnload(tabKey, dataGridList);

      if (contents.formBodyList.length > 0) {
        for (i = 0; i < contents.formBodyList.length; i++) {
          expj.common.tuningLoadScreenFormAfter('#' + contents.formBodyList[i].id, false);
        }
      }
      
      // コンソールスクリプトの差し替え
      $('.expj-script-' + tabKey + '_console').remove();
      for (i = 0, len = contents.scriptTextList.length; i < len; i++) {
        var scriptObject = $(contents.scriptTextList[i]);
        if (scriptObject.hasClass('expj-script-' + tabKey + '_console')) {
          scriptObject.addClass('expj-business-screen-' + tabKey + '-dedicated-javascript');
          scriptObject.appendTo('head');
        }
      }
      expj[tabKey].viewConsole();
    }
  }
  setTimeout(function(){
    expj.common.controlLoadingScreen(false);
  },1);
};

expj.common.replaceDialogDom = function (dialogBodyList, scriptTextList, dataGridList) {
  for (var i = 0, len = dialogBodyList.length; i < len; i++) {
    // 新しい詳細ウィンドウのHTMLオブジェクトを取得
    var dialogHtmlObject = dialogBodyList[i];
    // 詳細ウィンドウのIDを取得
    var dialogId = dialogHtmlObject.getAttribute('id');
    
    var documentDialogObject = document.getElementById(dialogId);
    var topPosition = $(documentDialogObject).parent().css('top');
    topPosition = topPosition.replace(/px/g, '');
    
    // 今のDOMにある既存の詳細ウィンドウを削除する
    $(documentDialogObject).parent().remove();
    $(documentDialogObject).remove();
    
    // 名前を取得する
    var idSplit = dialogId.split('-');
    var screenId = idSplit[1];
    var datagridName = idSplit[2];
    var classId = 'expj-script-' + screenId + '-' + datagridName;
    
    // 既存の詳細ウィンドウのJavaScriptを削除する
    $('.' + classId).remove();
    
    // 新しい詳細ウィンドウのJavaScriptを追加する
    for (var j = 0, jlen = scriptTextList.length; j < jlen; j++) {
      var scriptObject = $(scriptTextList[j]);
      if (scriptObject.hasClass(classId)) {
        scriptObject.addClass('expj-business-screen-' + screenId + '-dedicated-javascript');
        scriptObject.appendTo('head');
      }
    }
    // 新しい詳細ウィンドウをDOMに追加する
    $(dialogHtmlObject).appendTo('body');
    // 詳細ウィンドウの初期化関数を呼び出す
    expj.common.detailDialogMap[screenId][datagridName].init();
    // 詳細ウィンドウが起動済みであるならば起動状態にする
    if (expj.common.detailDialogMap[screenId][datagridName].visible === true) {
      expj.common.detailDialogMap[screenId][datagridName].visible = false;
      expj.common.pscript.showDetailWindowByDirectId(screenId, datagridName, topPosition);
    }
    expj.common.pscript.kind.applyKind('#' + dialogId);
    
    for (var k = 0; k < dataGridList.length; k++) {
      if (dataGridList[k].id === datagridName) {
        dataGridList[k].load = true;
      }
    }
  }
};

expj.common.replaceViewDom = function (viewBodyList, scriptTextList, dataGridList) {
  for (var i = 0, len = viewBodyList.length; i < len; i++) {
    var viewColumnWidth = [];
    var viewHtmlObject = viewBodyList[i];
    // VIEWのIDを取得
    var viewId = viewHtmlObject.getAttribute('id');
    var viewParentDom = $(document.getElementById(viewId)).parent();
    
    //iframe切り替える前、VIEWの幅を維持するための更新前の状態を記憶する
    var headWrapperWidth = viewParentDom.find('div.orteusView_scrollHeadWrapper').css('width');
    var headTableWidth = viewParentDom.find('div.orteusView_scrollHeadWrapper > table').css('width');
    var columnList = viewParentDom.find('div.orteusView_scrollHeadWrapper > table > thead > tr > th');
    var columnWidthList = [];
    for (var i = 0; i < columnList.length; i++) {
      var columnWidth = $(columnList[i]).css('width');
      columnWidthList.push(columnWidth);
    }
    var viewData = {
      'id' : viewId,
      'headWrapperWidth' : headWrapperWidth,
      'headTableWidth' : headTableWidth,
      'columnWidthList' : columnWidthList
    };
    viewColumnWidth.push(viewData);
    
    viewParentDom.children().remove();
    
    // 名前を取得する
    var idSplit = viewId.split('-');
    var screenId = idSplit[1];
    var datagridName = idSplit[2];
    var classId = 'expj-script-' + screenId + '-' + datagridName;

    // 既存のVIEWのJavaScriptを削除する
    $('.' + classId).remove();

    for (var j = 0, jlen = scriptTextList.length; j < jlen; j++) {
        var scriptObject = $(scriptTextList[j]);
        console.log(scriptObject);
        var scriptClass = scriptObject.attr('class');
        console.log(scriptClass);
        if (scriptClass !== undefined) {
            var scriptClassList = scriptClass.split(' ');
            for (var k = 0; k < scriptClassList.length; k++) {
                var clsElem = scriptClassList[k];
                if (clsElem.substr(0, classId.length) === classId) {
                    scriptObject.addClass('expj-business-screen-' + screenId + '-dedicated-javascript');
                    scriptObject.appendTo('head');
                }
            }
        }
    }
    $(viewHtmlObject).appendTo(viewParentDom);
    expj.common.viewInstanceMap[screenId][datagridName].init();
    expj.common.pscript.kind.applyKind('#' + viewId);
    
    // iframe切り替える後、VIEWの列幅設定
    for (i = 0; i < viewColumnWidth.length; i++) {
      var viewData = viewColumnWidth[i];
      var baseDataGrid = $('#' + viewData.id);
      baseDataGrid.find('div.orteusView_scrollHeadWrapper').css('width', viewData.headWrapperWidth);
      baseDataGrid.find('div.orteusView_scrollHeadWrapper > table').css('width', viewData.headTableWidth);
      baseDataGrid.find('div.orteusView_BodyArea > table').css('width', viewData.headTableWidth);
      var columnList = baseDataGrid.find('div.orteusView_scrollHeadWrapper > table > thead > tr > th');
      var bodyColumnList = baseDataGrid.find('div.orteusView_BodyArea > table > thead > tr > th');
      for (var j = 0; j < columnList.length; j++) {
        $(columnList[j]).css('width', viewData.columnWidthList[j]);
        $(bodyColumnList[j]).css('width', viewData.columnWidthList[j]);
      }
    }
    
    var classNameOfTargetElements = '.' + screenId + '-focus-move';
    var targetSelector = $(viewParentDom).find(classNameOfTargetElements);
    
    expj.common.ui.setupFocusMoveIframe(targetSelector, classNameOfTargetElements);
    
    for (var k = 0; k < dataGridList.length; k++) {
      if (dataGridList[k].id === datagridName) {
        dataGridList[k].load = true;
      }
    }
  }
};

expj.common.replaceFormDom = function (formBodyList, scriptTextList, dataGridList) {
  for (var i = 0, len = formBodyList.length; i < len; i++) {
    var formHtmlObject = formBodyList[i];
    // FORMのIDを取得
    var formId = formHtmlObject.getAttribute('id');
    
    var formDom = $(document.getElementById(formId));
    formDom.children().remove();
    
    // 名前を取得する
    var idSplit = formId.split('-');
    var screenId = idSplit[1];
    var datagridName = idSplit[2];
    var classId = 'expj-script-' + screenId + '-' + datagridName;
    
    // 既存のFORMのJavaScriptを削除する
    $('.' + classId).remove();
    
    for (var j = 0, jlen = scriptTextList.length; j < jlen; j++) {
      var scriptObject = $(scriptTextList[j]);
      if (scriptObject.hasClass(classId)) {
        scriptObject.addClass('expj-business-screen-' + screenId + '-dedicated-javascript');
        scriptObject.appendTo('head');
      }
    }
    $(formHtmlObject).children().appendTo(formDom);
    expj.common.pscript.kind.applyKind('#' + formId);
    
    var classNameOfTargetElements = '.' + screenId + '-focus-move';
    var targetSelector = $(formDom).find(classNameOfTargetElements);
    
    expj.common.ui.setupFocusMoveIframe(targetSelector, classNameOfTargetElements);
    
    var targetSelectorRadio = $(formDom).find('input[type="radio"]');
    expj.common.ui.setupFocusMoveIframeRadio(targetSelectorRadio, screenId);
    
    //frame.htmlを呼び出して画面の一部のみ置き換える場合、画面初期値取得
    var tabScreenId = '#' + formId;
    expj.common.pscript.setComponentValueManage(tabScreenId);
    
    for (var k = 0; k < dataGridList.length; k++) {
      if (dataGridList[k].id === datagridName) {
        dataGridList[k].load = true;
      }
    }
  }
};

expj.common.replaceTreeDom = function (treeBodyList, scriptTextList, dataGridList) {
  for (var i = 0, len = treeBodyList.length; i < len; i++) {
    var treeHtmlObject = treeBodyList[i];
    // TREEのIDを取得
    var treeId = treeHtmlObject.getAttribute('id');
    
    var treeParentDom = $(document.getElementById(treeId)).parent().parent();
    treeParentDom.children().remove();
    
    // 名前を取得する
    var idSplit = treeId.split('-');
    var screenId = idSplit[1];
    var datagridName = idSplit[2];
    var classId = 'expj-script-' + screenId + '-' + datagridName;
    
    // 既存のTREEのJavaScriptを削除する
    $('.' + classId).remove();
    
    for (var j = 0, jlen = scriptTextList.length; j < jlen; j++) {
      var scriptObject = $(scriptTextList[j]);
      if (scriptObject.hasClass(classId)) {
        scriptObject.addClass('expj-business-screen-' + screenId + '-dedicated-javascript');
        scriptObject.appendTo('head');
      }
    }
    $(treeHtmlObject).appendTo(treeParentDom);
    expj.common.treeInstanceMap[screenId][datagridName].init();
    
    for (var k = 0; k < dataGridList.length; k++) {
      if (dataGridList[k].id === datagridName) {
        dataGridList[k].load = true;
      }
    }
  }
};

expj.common.replaceButtonDom = function (buttonBodyList, scriptTextList, dataGridList) {
  for (var i = 0, len = buttonBodyList.length; i < len; i++) {
    var buttonHtmlObject = buttonBodyList[i];
    // ButtonのIDを取得
    var buttonId = buttonHtmlObject.getAttribute('id');
    
    var buttonParentDom = $(document.getElementById(buttonId)).parent();
    buttonParentDom.children().remove();
    
    // 名前を取得する
    var idSplit = buttonId.split('-');
    var screenId = idSplit[1];
    var datagridName = idSplit[2];
    var classId = 'expj-script-' + screenId + '-' + datagridName;
    
    // 既存のButtonのJavaScriptを削除する
    $('.' + classId).remove();
    
    for (var j = 0, jlen = scriptTextList.length; j < jlen; j++) {
      var scriptObject = $(scriptTextList[j]);
      if (scriptObject.hasClass(classId)) {
        scriptObject.addClass('expj-business-screen-' + screenId + '-dedicated-javascript');
        scriptObject.appendTo('head');
      }
    }
    $(buttonHtmlObject).appendTo(buttonParentDom);
    
    for (var k = 0; k < dataGridList.length; k++) {
      if (dataGridList[k].id === datagridName) {
        dataGridList[k].load = true;
      }
    }
  }
};

expj.common.particalReplaceOnload = function (screenId, dataGridList) {
  var i;
  for (i = 0; i < dataGridList.length; i++) {
    expj.common.particalComponentReplaceOnload(screenId, dataGridList[i]);
  }
  for (i = 0; i < dataGridList.length; i++) {
    expj.common.particalDataGridReplaceOnload(screenId, dataGridList[i]);
  }
};

expj.common.particalComponentReplaceOnload = function (screenId, dataGridInfo) {
  var dataGridName = dataGridInfo.id;
  var componentName;
  if (dataGridInfo.load) {
    for (componentName in expj[screenId][dataGridName]) {
      try {
        expj[screenId][dataGridName][componentName].executeOnLoad();
      } catch (e) {}
    }
  } else {
    for (componentName in expj[screenId][dataGridName]) {
      try {
        expj[screenId][dataGridName][componentName].executePScriptOnLoad();
      } catch (e) {}
    }
  }
};

expj.common.particalDataGridReplaceOnload = function (screenId, dataGridInfo) {
  var dataGridName = dataGridInfo.id;
  if (dataGridInfo.load) {
    try {
      expj[screenId][dataGridName].executeOnLoad();
    } catch (e) {}
  } else {
    try {
      expj[screenId][dataGridName].executePScriptOnLoad();
    } catch (e) {}
  }
};

expj.common.changeBusinessScreenTab = function (tabKey, contents) {
  // コンソールメッセージのクリア
  this.clearScreenFrameConsoleMessage();
  
  /** タブ本体を構成するDIVタグに与えられるID */
  var tabBodyId = '#expj-business-screen-tabs-body-' + tabKey;
  
  /** タブの内容 */
  var tabBody = contents.tabBody;
  
  if (tabBody !== null && contents.isNewData == false) {
    //業務ロック時の処理
    $('.expj-script-' + tabKey + '_console').remove();
    for (i = 0, len = contents.scriptTextList.length; i < len; i++) {
       var scriptObject = $(contents.scriptTextList[i]);
       if (scriptObject.hasClass('expj-script-' + tabKey + '_console')) {
         scriptObject.addClass('expj-business-screen-' + tabKey + '-dedicated-javascript');
         scriptObject.appendTo('head');
       }
    }
    expj[tabKey].viewConsole();
  } else {
    // DOMの削除
    var domObj = $(tabBodyId);
    domObj.html('');
    // 業務画面固有のJavaScriptを削除
    this.deleteBusinessScreenJavaScript(tabKey);
    // 業務画面固有のDetailWindowの削除
    this.deleteBusinessScreenDialog(tabKey);
    $(window).off('resize.' + tabKey);
    
    expj.common.viewInstanceMap[tabKey] = {};
    expj.common.calendarInstanceMap[tabKey] = {};
    expj.common.treeInstanceMap[tabKey] = {};
    expj.common.detailDialogMap[tabKey] = {};
    expj.common.datagridScrollMap[tabKey] = {};
    expj.common.focusPositionMap[tabKey] = null;
    expj.common.innerTabMap[tabKey] = null;
    
    if (contents.noFlash) {
      tabBody = '<iframe style="width:100%;height:100%;border-width:0px;"></iframe>';
      // タブの内容を更新
      $(tabBodyId).html(tabBody);
      var iframeObj = $(tabBodyId).find('iframe')[0];
      iframeObj.contentDocument.open();
      iframeObj.contentDocument.write(contents.tabBody);
      iframeObj.contentDocument.close();
    } else {
      if (tabBody !== null) {
        // 詳細ウィンドウのDOMを追加した際にスクロールが表示されるのを防ぐ
        expj.common.tuningScreenOverflow();
        
        // 業務画面固有のJavaScriptを画面枠部品に再登録
        this.appendBusinessScreenHtmlDialog(tabKey, contents.dialogBodyList);
        this.appendBusinessScreenJavaScriptSource(tabKey, contents.scriptSrcList);
        this.appendBusinessScreenJavaScriptText(tabKey, contents.scriptTextList);
      } else {
        contents.screenId = '';
        tabBody = '<div style=\"text-align:center;background-color:#dadcf4;height:100%;font-size:16pt;\"><div>"' + nodeTitle + '" is not HTML5 page.</div><hr><button>Close</button></div>';
      }
      
      try {
        // タブの内容を更新
        $(tabBodyId).html(tabBody);
      } catch (e) {
        alert('PScript Syntax Error!');
        $(tabBodyId).find('.expj-business-screen-close-button').bind('click', function () {
          expj.common.executeBusinessScreenCloseDialog(tabKey);
        });
      }

      // 業務画面の閉じるボタンにイベントハンドラを登録
      this.bindCloseButtonEvent(tabKey, contents);

      // 画面固有のonLoad関数呼び出し
      if (contents.screenId !== 'error') {
        document.getElementById('expj-business-screen-tabs-body-' + tabKey).setAttribute('data-loadingPage', contents.loadScreenId);
        this.callOnLoadFunction(tabKey);
      } else {
        expj.error.viewConsole();
        expj.error.viewConsole = function () {};
      }
    }
  }
  
  setTimeout(function(){
    expj.common.controlLoadingScreen(false);
  },1);
};

expj.common.addSubBusinessScreen = function (tabKey, tabName, contents, baseScreenId) {
  // エスケープされている文字を修正する
  tabName = tabName.replace(/&amp;amp;nbsp;/g, '&nbsp;');
  tabName = tabName.replace(/&amp;nbsp;/g, '&nbsp;');
  
  // コンソールメッセージのクリア
  this.clearScreenFrameConsoleMessage();
  
  /** タブ本体を構成するDIVタグに与えられるID */
  var tabBodyId = '#expj-business-screen-tabs-body-' + tabKey;
  
  /** タブの内容 */
  var tabBody = contents.tabBody;
  if (tabBody === null) {
    contents.screenId = '';
    tabBody = '<div style=\"text-align:center;background-color:#dadcf4;height:100%;font-size:16pt;\"><div>"' + tabKey + '" is not HTML5 page.</div><hr><button>Close</button></div>';
  }
  
  var screenState = this.openBusinessScreenState[tabKey];
  if (typeof(screenState) === 'undefined') {
    screenState = {
      'activate' : false,
      'url' : ''
    };
    this.openBusinessScreenState[tabKey] = screenState;
  }
  
  // 詳細ウィンドウのDOMを追加した際にスクロールが表示されるのを防ぐ
  expj.common.tuningScreenOverflow();
  
  if (screenState.activate === true) {
    tabBodyId = '#expj-business-screen-tabs-body-' + tabKey;
    // DOMの削除
    $(tabBodyId).html('');
    // 業務画面固有のJavaScriptを削除
    this.deleteBusinessScreenJavaScript(tabKey);
    // 業務画面固有のDetailWindowの削除
    this.deleteBusinessScreenDialog(tabKey);
    $(window).off('resize.' + tabKey);
    
    // 業務画面固有のJavaScriptを画面枠部品に再登録
    this.appendBusinessScreenHtmlDialog(tabKey, contents.dialogBodyList);
    this.appendBusinessScreenJavaScriptSource(tabKey, contents.scriptSrcList);
    this.appendBusinessScreenJavaScriptText(tabKey, contents.scriptTextList);
    
    try {
      // タブの内容を更新
      $(tabBodyId).html(tabBody);
    } catch (e) {
      alert(e + '\nPScript Syntax Error!');
      $(tabBodyId).find('.expj-business-screen-close-button').bind('click', function () {
        expj.common.executeBusinessScreenCloseDialog(tabKey);
      });
    }
    
    if (tabKey === contents.screenId) {
      document.getElementById('expj-business-screen-tabs-body-' + tabKey).setAttribute('data-loadingPage', contents.loadScreenId);
    }
    
    var tabIndex = expj.common.getScreenFrameTabsLIIndexByScreenId(tabKey);
    this.screenFrameTabsAreaInstance.tabs('option', 'active', tabIndex);
    expj.common.activateBusinessScreenTabPage(tabKey);
  } else {
    // JavaScriptを追加
    this.appendBusinessScreenJavaScriptSource(tabKey, contents.scriptSrcList);
    this.appendBusinessScreenJavaScriptText(tabKey, contents.scriptTextList);
    // 詳細ウィンドウを追加
    this.appendBusinessScreenHtmlDialog(tabKey, contents.dialogBodyList);
    
    // 業務画面をタブに追加する
    this.createBusinessScreenTabPage(tabKey, tabName, tabBody);
    
    if (tabKey === contents.screenId) {
      document.getElementById('expj-business-screen-tabs-body-' + tabKey).setAttribute('data-loadingPage', contents.loadScreenId);
    }
    
    // 起動済み業務画面に追加する
    screenState.activate = true;
  }
  
  // 業務画面の閉じるボタンにイベントハンドラを登録
  this.bindCloseButtonEvent(tabKey, contents);

  if (contents.screenId === tabKey) {
    // 画面固有のonLoad関数呼び出し
    this.callOnLoadFunction(tabKey);
  } else {
    expj.error.viewConsole();
    expj.error.viewConsole = function () {};
  }
  
  // 呼び出し元を記録
  expj.common.closeMoveMap[tabKey] = baseScreenId;
  
  setTimeout(function(){
    expj.common.controlLoadingScreen(false);
  },1);
};

expj.common.controlNoFlashPageMove = function (screenId, url, params) {
  if (!expj.common.checkNameSpace(params)) {
    params = {};
  }
  var response = expj.common.accessBusinessScreen('POST', url, params);
  var contents = expj.common.analyzeBusinessScreenResponse(screenId, response);
  if (contents.noFlash) {
    var tabBodyId = '#expj-business-screen-tabs-body-' + screenId;
    var iframeObj = $(tabBodyId).find('iframe')[0];
    iframeObj.contentDocument.open();
    iframeObj.contentDocument.write(contents.tabBody);
    iframeObj.contentDocument.close();
  } else {
    expj.common.updateBusinessScreenTab(screenId, contents);
  }
};

expj.common.controlNoFlashPageMoveWithUploadFile = function (screenId, formObj, btnObj) {
    // FormDataオブジェクトの作成
    var formData = new FormData(formObj);
    var btnName = btnObj.getAttribute("name");
    var btnValue = btnObj.getAttribute("value");
    formData.append(btnName, btnValue);
    // Ajax通信（通常とは異なるので共通関数は呼び出さない）
    // https://developer.mozilla.org/ja/docs/Web/Guide/Using_FormData_Objects
    var response = $.ajax({
      'url' : formObj.action,
      'type' : 'post',
      'async' : false,
      'cache' : false,
      'data' : formData,
      'processData' : false, // Ajaxがdataを整形しないようにする指定
      'contentType' : false  // 上記と同様
    });
  var contents = expj.common.analyzeBusinessScreenResponse(screenId, response);
  if (contents.noFlash) {
    var tabBodyId = '#expj-business-screen-tabs-body-' + screenId;
    var iframeObj = $(tabBodyId).find('iframe')[0];
    iframeObj.contentDocument.open();
    iframeObj.contentDocument.write(contents.tabBody);
    iframeObj.contentDocument.close();
  } else {
    expj.common.updateBusinessScreenTab(screenId, contents);
  }
};

/**
 * OrteusViewのインスタンスを生成する関数。
 * @param selector OrteusViewによってテーブル化するtableタグのID
 * @param headData テーブルのヘッダー部分を構成するJSON
 * @param bodyData テーブルのボディ部分を構成するJSON
 * @param allowResize 列の横幅変更の可否
 * @param selectKind 行選択の種類
 * @param selectEvent 行選択時に実行するイベント処理
 * @param deselectEvent 行選択解除時に実行するイベント処理
 */
expj.common.createOrteusViewInstance = function (selector, headData, bodyData, allowResize, selectKind, selectEvent, viewType) {
  var i;
  // Datatablesを適用するtableタグの親ノード（divタグ）を取得する。（0件処理のため）
  var viewNode = $(selector);
  var viewId = selector + '';
  
  // ヘッダデータ不正対策
  if (headData.length === 0) {
    headData.push({
      'bVisible': false
    });
  } else {
    for (i = 0; i < headData.length; i++) {
      var target = headData[i];
      if (typeof(target) === 'undefined' || target === null) {
        headData[i] = {
          'bVisible': false
        };
      }
    }
  }
  
  // tableタグにDatatablesを適用する
  var instance = null;
  var viewPulgInStr = 'orteusView';
  if(viewType && viewType === 'ExView'){
      viewPulgInStr = 'orteusViewEx';
  }
  try {
    instance = viewNode[viewPulgInStr]({
      'bodyData'  : bodyData,        // 表のボディデータ
      'headData'  : headData,        // 表のヘッダデータ
      'colResize' : allowResize,     // 列幅変更の可否
      'rowSelectKind' : selectKind,  // 行選択の種類（1行、複数行、選択不可）
      'rowSelectEvent' : selectEvent, // 行選択時に実行するイベント
      'viewId' : viewId
    });
  } catch (e) {
    console.log(e.stack);
    var message = '----- VIEW Header Data -----\n';
    message += 'Head Data Length = ' + headData.length + '\n';
    message += 'Body Data Length = ' + bodyData.length;
    var bVisible = false;
    for (i = 0; i < headData.length; i++) {
      var t = headData[i];
      if (typeof(t.bVisible) === 'undefined' || t.bVisible === true) {
        bVisible = true;
        break;
      }
    }
    if (!bVisible) {
      message += '\nNo bVisible record.';
    }
    console.log(message);
    return null;
  }
  
  viewNode.find('[data-rowselectable="false"]').each(function () {
    var parentTr = $(this).parent().parent();
    if (parentTr.hasClass('odd')) {
      parentTr.attr('style', 'background-color:rgb(200, 208, 221);');
    } else {
      parentTr.attr('style', 'background-color:rgb(210, 216, 226);');
    }
    parentTr.attr('data-selectable', 'false');
    parentTr.unbind('click'); //セレクトできない行のクリックイベント削除
  });
  expj.common.ui.tooltip.create(viewNode.attr('id'));
  
  if (viewNode.hasClass('expj-view-headeronly')) {
    var childViewNode = viewNode.find('div.orteusView_scrollHeadWrapper');
    childViewNode.css('width', '100%');
    childViewNode = childViewNode.find('table');
    childViewNode.css('width', '100%');
    childViewNode = childViewNode.find('th');
    childViewNode.css('width', '100%');
  }
  
  return instance;
};

/**
 * jQuery UI(Dialog)のインスタンスを生成する関数
 * @param selector jQuery UIによってダイアログ化するdivタグのID
 * @param allowModel ダイアログモーダル化の可否
 * @param width ダイアログの横幅指定
 * @param height ダイアログの縦幅指定
 * @param buttonsJson ダイアログに追加するボタンとその処理
 */
expj.common.createDetailWindowInstance = function (selector, allowModal, width, height, buttonsJson) {
  var instance = $(selector).dialog({
    'autoOpen' : false,
    'closeOnEscape' : false,
    'modal' : allowModal,
    'draggable' : true,
    'width' : width,
    'height' : height,
    'resizable' : false,
    'buttons' : buttonsJson
  });
  var nameList = selector.split('-');
  var screenId = nameList[1];
  var datagridName = nameList[2];
  instance.addClass('expj-datagrid-detail');
  instance.addClass('expj-business-screen-' + screenId + '-dedicated-detail-dialog');
  return instance;
};

/**
 * ロードしたツリーの要素数をカウントするカウンター<br>
 */
expj.common.treeNodeCounter = 0;

/**
 * DataGrid(TREE)のインスタンスを生成する関数。<br>
 * @param treeXml サーバーから取得したDataGrid(TREE)用のデータ
 * @param selector インスタンス化対象のDIVタグのセレクタ
 * @param onTreeActivate ツリーのノードをクリックした時に実行するイベント
 */
expj.common.createDataGridTreeInstance = function (treeXml, selector, onTreeActivate, getNodeEvent) {
  var treeJson = null;
  expj.common.treeNodeCounter = 0;
  var splitNames = selector.split('-');
  var screenId = splitNames[1];
  var datagridName = splitNames[2];
  // XMLドキュメントをDOMオブジェクト化
  try {
    if (expj.common.checkTreeXml(treeXml)) {
      var treeXmlObject = $.parseXML(treeXml);
      for (var i = 0, len = treeXmlObject.childNodes.length; i < len; i++) {
        var targetNode = treeXmlObject.childNodes[i];
        if (targetNode.tagName === 'root') {
          treeJson = expj.common.convertToJsonFromTreeXml(targetNode);
          break;
        }
      }
    }
  } catch (e) {
    // 件数が0件のTREEデータが流れてきた場合、ここを通過する可能性がある
  }

  // fancytreeの適用
  var instance = $(selector).fancytree({
    'source' : treeJson,
    'icon' : true,
    'activate' : function (event, data) {
      var selectedNode = data.tree.getActiveNode();
      if (selectedNode.extraClasses === 'expj-terminated-node') {
        return;
      }
      onTreeActivate(event, data);
      selectedNode.setActive(false);
    },
    'lazyLoad' : function (event, data) {
      data.result = expj.common.getTreeNode(screenId, datagridName, data.node, getNodeEvent);
    }
  });
  
  // ノード数をDOMに記録
  instance.attr('data-maxid', expj.common.treeNodeCounter);
  expj.common.treeNodeCounter = 0;
  
  // terminatedNodeの時はファイルアイコンを削除
  $(selector).find('.expj-terminated-node').find('.fancytree-icon').remove();
  
  return instance;
};

/**
 * TREEのXMLテキストが有効か否か判定するプログラム。<br>
 * @param treeXml TREEのXMLテキスト
 */
expj.common.checkTreeXml = function (treeXml) {
  if (typeof(treeXml) === 'undefined') {
    return false;
  } else if (treeXml === null) {
    return false;
  } else if (treeXml === '<?xml version="1.0" encoding="Shift_JIS"?>') {
    return false;
  }
  return true;
};

/**
 * TreeXmlの解析し、JSONに変換する。<br>
 * @param targetNode 探索対象のノード
 */
expj.common.convertToJsonFromTreeXml = function (targetNode, datagridObject) {
  // 対象ノード用のJSON格納配列を用意
  var json = [];
  // 対象ノードの子ノードを取得
  var children = targetNode.childNodes;
  for (var i = 0, len = children.length; i < len; i++) {
    // 子ノードをひとつずつチェックする。すべての子ノードを探索したらループを脱出する。
    var childNode = children[i];
    var count = 0;
    if (childNode.nodeName === '#text') {
      // 
    } else if (childNode.nodeName === 'node') {
      // ノードの属性を取得する
      var attributes = childNode.attributes;
      count++;
      // 対象ノード用JSON格納変数を用意
      var targetJson = {};
      var nodeData = {};
      var notReadAttr = attributes.getNamedItem('not_read');
      var terminatedAttr = attributes.getNamedItem('terminated');
      var terminateCommentAttr = attributes.getNamedItem('terminate_comment');
      if (notReadAttr !== null) {
        targetJson.children = null;
        targetJson.folder = true;
        targetJson.expanded = false;
        targetJson.lazy = true;
        nodeData.not_read = notReadAttr.nodeValue;
        nodeData.terminated = false;
      } else if (terminatedAttr !== null) {
        targetJson.children = [
          {
            'children' : null,
            'folder' : false,
            'expanded' : true,
            'title' : '<img draggable="false" src="common/img/warn.png">' + (terminateCommentAttr !== null ? terminateCommentAttr.nodeValue : ''),
            'data' : {},
            'extraClasses' : 'expj-terminated-node'
          }
        ];
        targetJson.folder = true;
        targetJson.expanded = true;
        nodeData.not_read = false;
        nodeData.terminated = terminatedAttr.nodeValue;
      } else if (childNode.childNodes.length !== 0) {
        // 探索対象ノードに子ノードがある場合は、先に子ノードの探索を行う
        var childrenJson = this.convertToJsonFromTreeXml(childNode);
        // 探索対象ノードの子ノードデータとフォルダフラグをセットする
        targetJson.children = childrenJson;
        targetJson.folder = true;
        targetJson.expanded = true;
        nodeData.not_read = false;
        nodeData.terminated = false;
      } else {
        targetJson.children = null;
        targetJson.folder = false;
        targetJson.expanded = true;
        nodeData.not_read = false;
        nodeData.terminated = false;
      }
      var icon = '';
      var title = '';
      for (var j = 0, jlen = attributes.length; j < jlen; j++) {
        var attr = attributes[j];
        if (attr.name === 'id') {
          // 属性名がidのときは属性名をkeyに変換して格納する
          targetJson.key = attr.value;
        } else if (attr.name === 'label') {
          // 属性名がlabelのときは属性名をtitleに変換して格納する
          title = attr.value;
          //エスケープ処理
          title = expj.common.sanitize(title);
        } else if (attr.name === 'icon1') {
          icon = '<img draggable="false" src="common/img/' + attr.value + '.png">';
        }
        // それ以外の属性はそのままの属性名で格納する
        nodeData[attr.name] = attr.value;
      }
      targetJson.title = icon + ' ' + title;
      targetJson.data = nodeData;
      // 生成したJSONを配列に格納
      json.push(targetJson);
      this.treeNodeCounter++;
      if(datagridObject){
        datagridObject.setAttribute('data-maxid', Number(datagridObject.getAttribute('data-maxid')) + count);
      }
    }
  }
  return json;
};

expj.common.getTreeNode = function (screenId, datagridName, targetNode, getNodeEvent) {
  var notReadData = {};
  notReadData.data = {};
  
  //子ノード展開しているため、親ノードのnode_read状態をtrue→flaseに変更する
  targetNode.data['not_read'] = false;
  
  for (var propName in targetNode.data) {
    var propValue = targetNode.data[propName];
    notReadData.data[propName] = propValue;
  }
  var datagridObject = document.getElementById('expj-' + screenId + '-' + datagridName);
  //datagridObject.setAttribute('data-maxid', '0');
  var gPrevSelectedNodeTmp = this.treeInstanceMap[screenId][datagridName].gPrevSelectedNode;
  this.treeInstanceMap[screenId][datagridName].gPrevSelectedNode = notReadData;
  var params = getNodeEvent();
  this.treeInstanceMap[screenId][datagridName].gPrevSelectedNode = gPrevSelectedNodeTmp;
  var response = expj.common.accessBusinessScreen('POST', params.SUBMIT_PROGRAM, params);

  if (response.status === 200) {
    // HTTPステータスコードが200の時の処理（正常動作時）
    // レスポンスオブジェクトからHTMLオブジェクトを取得する
    
    /** jQueryのHTMLオブジェクト */
    var htmlObject = this.convertBusinessScreenHtmlObject(response);
    
    var result = expj.common.analyzeBusinessScreenHtmlObject(screenId, htmlObject, response);
    if (result.screenId !== 'error') {
      
      // 解析
      var className = 'expj-script-' + screenId + '-' + datagridName + 'treescript';
      for (var i = 0, len = htmlObject.length; i < len; i++) {
        var target = htmlObject[i];
        if (target.tagName === 'SCRIPT') {
          try {
            var object = $(target);
            object.addClass(className);
            object.appendTo('head');
          } catch (e) {
            // エラーが発生する場合があるが想定内
            // 握りつぶす
          }
        }
      }
      
      try {
        var message = getExpjNoFlashPageConsoleMessage();
        if (message !== '') {
          expj.common.setScreenFrameConsoleMessage(message);
        }
      } catch (e) {
      }
      
      var treeXml = '';
      if (this.checkNameSpace(data1)) {
        treeXml = data1;
      }
      $('.' + className).remove();
      try {
        if (this.checkTreeXml(treeXml)) {
          var treeXmlObject = $.parseXML(treeXml);
          for (i = 0, len = treeXmlObject.childNodes.length; i < len; i++) {
            var nextNode = treeXmlObject.childNodes[i];
            if (nextNode.tagName === 'root') {
              return this.convertToJsonFromTreeXml(nextNode, datagridObject);
            }
            datagridObject.setAttribute('data-maxid', Number(datagridObject.getAttribute('data-maxid')) + treeXmlObject.childNodes.length);
          }
        }
      } catch (e) {
        // 件数が0件のTREEデータが流れてきた場合、ここを通過する可能性がある
      }
      
    } else {
      if (result.tabBody !== null) {
        var tabBodyId = '#expj-business-screen-tabs-body-' + screenId;
        // DOMの削除
        $(tabBodyId).html('');
        // 業務画面固有のJavaScriptを削除
        expj.common.deleteBusinessScreenJavaScript(screenId);
        // 業務画面固有のDetailWindowの削除
        expj.common.deleteBusinessScreenDialog(screenId);
        $(window).off('resize.' + screenId);
        
        // 業務画面固有のJavaScriptを画面枠部品に再登録
        expj.common.appendBusinessScreenHtmlDialog(screenId, result.dialogBodyList);
        expj.common.appendBusinessScreenJavaScriptSource(screenId, result.scriptSrcList);
        expj.common.appendBusinessScreenJavaScriptText(screenId, result.scriptTextList);
        
        try {
          // タブの内容を更新
          $(tabBodyId).html(result.tabBody);
        } catch (e) {
           alert(e + '\nPScript Syntax Error!');
           $(tabBodyId).find('.expj-business-screen-close-button').bind('click', function () {
             expj.common.executeBusinessScreenCloseDialog(tabKey);
          });
        }
        expj.common.bindCloseButtonEvent(screenId, result);
      } else {
        /** タブに表示する内容 */
        var tabBody = '';
        for (var i = 0, len = htmlObject.length; i < len; i++) {
          var target = htmlObject[i];
          if (target.nodeName !== '#text' && target.nodeName !== 'TITLE') {
            tabBody += target.outerHTML;
          }
        }
        // 内容を生成する
        tabBody += '<hr><button>Close</button>';
        result = expj.common.createErrorResponseObjectForAnalyzeResponse();
        result.tabBody = tabBody;
      }
    }
    
  }
  return [];
};

expj.common.createTreeContextInstance = function (spanSelector, targetSelector, contextData, controlData, beforeFunc) {
  $(spanSelector).parent().contextmenu({
    'delegate': spanSelector,
    'menu': contextData,
    'beforeOpen': beforeFunc
  });
  var instance = $(spanSelector).parent().contextmenu('getMenu')[0];
  for (var i = 0, len = instance.childNodes.length; i < len; i++) {
    var menu = instance.childNodes[i];
    var control = controlData[i];
    if (control === '') {
      continue;
    }
    var con = control.split(',');
    menu.expjTreeContext = {};
    menu.expjTreeContext.disabled = false;
    var c;
    if (con.length > 1) {
      c = con[0];
      if (c === 'N0' || c === 'N1') {
        menu.expjTreeContext.N = c;
      } else {
        menu.expjTreeContext.N = 'N0';
      }
      c = con[1];
      if (c === 'T0' || c === 'T1') {
        menu.expjTreeContext.T = c;
      } else {
        menu.expjTreeContext.T = 'T0';
      }
    } else if (con.length === 1) {
      c = con[0];
      if (c === 'N0' || c === 'N1') {
        menu.expjTreeContext.N = c;
      } else {
        menu.expjTreeContext.N = 'N0';
      }
      menu.expjTreeContext.T = 'T0';
    } else {
      menu.expjTreeContext.N = 'N0';
      menu.expjTreeContext.T = 'T0';
    }
  }
  var nameSplit = targetSelector.split('-');
  var screenId = nameSplit[1];
  var datagridName = nameSplit[2];
  expj.common.treeInstanceMap[screenId][datagridName].contextData = {
    'selector' : spanSelector,
    'instance' : instance
  };
};

expj.common.changeStateTreeContext = function (selectedNode, contextUi) {
  var nodeKind = 'unknown';
  if (selectedNode === null) {
    // No Selected Node
    nodeKind = 'noSelected';
  } else if (typeof(selectedNode.folder) === 'undefined') {
    // File Node Selected
    nodeKind = 'fileSelected';
  } else {
    // Folder Node Selected
    nodeKind = 'folderSelected';
  }
  // コンテキストのリストを取得
  var contextList = contextUi.menu[0].childNodes;
  for (var i = 0, len = contextList.length; i < len; i++) {
    // コンテキストのDOMを取得
    var context = contextList[i];
    var target = $(context);
    // 対象のDOMがコンテキストメニューの仕切りだった場合、飛ばす
    if (target.hasClass('ui-menu-divider')) {
      continue;
    }
    if (nodeKind === 'noSelected') {
      // ノードが未選択状態の場合
      // DOMにクラスと属性を追加する
      this.changeStateTreeContextDOM(target, true);
    } else {
      // ノードが選択状態の場合
      if (nodeKind === 'folderSelected') {
        if (context.expjTreeContext.N === 'N1' && context.expjTreeContext.disabled === false) {
          this.changeStateTreeContextDOM(target, false);
        } else {
          this.changeStateTreeContextDOM(target, true);
        }
      } else if (nodeKind === 'fileSelected') {
        if (context.expjTreeContext.T === 'T1' && context.expjTreeContext.disabled === false) {
          this.changeStateTreeContextDOM(target, false);
        } else {
          this.changeStateTreeContextDOM(target, true);
        }
      }
    }
  }
};

expj.common.changeStateTreeContextDOM = function (target, isDisabled) {
  var hasAriaDisabled = null;
  if (isDisabled) {
    // DOMにクラスと属性を追加する（重複回避）
    if (!target.hasClass('ui-state-disabled')) {
      target.addClass('ui-state-disabled');
    }
    hasAriaDisabled = target.attr('aria-disabled');
    if (typeof(hasAriaDisabled) === 'undefined') {
      target.attr('aria-disabled', 'true');
    }
  } else {
    if (target.hasClass('ui-state-disabled')) {
      target.removeClass('ui-state-disabled');
    }
    hasAriaDisabled = target.attr('aria-disabled');
    if (hasAriaDisabled === 'true') {
      target.removeAttr('aria-disabled', 'true');
    }
  }
};

expj.common.createCalendarInstance = function (selector, format) {
  var targetField = $(selector);
  var monthFormat = ['January [1]',
                     'February [2]',
                     'March [3]',
                     'April [4]',
                     'May [5]',
                     'June [6]',
                     'July [7]',
                     'August [8]',
                     'September [9]',
                     'October [10]',
                     'November [11]',
                     'December [12]'];
  targetField.datepicker({
    'dateFormat' : format,
    'monthNames' : monthFormat,
    'monthNamesShort' : monthFormat,
    'showOn' : 'button',
    'onClose' : function (dateText, inst) {
      $(selector).blur();
      $(selector).focus(); //calendarで日選択後、前のtextInputにファーカスする
      if(expj.common.config.textInputSelectAllFLG == true){ //focus時、文字全選択
        $(selector).focus(function(){
          $(this).select();
        });
      }
    },
    'beforeShow' : function (input, inst) {
      setTimeout(function () {
        var mObj = moment();
        inst.drawYear = mObj.year();
        inst.drawMonth = mObj.month();
        $.datepicker._updateDatepicker(inst);
      }, 0);
    }
  });
  var buttonInstance = targetField.parent().find('button.ui-datepicker-trigger');
  var nameList = selector.split('-');
  var screenId = nameList[1];
  var datagridName = nameList[2];
  var componentName = nameList[3];
  var screenCalendarMap = expj.common.calendarInstanceMap[screenId];
  var data = {
    'targetField' : targetField[0],
    'buttonInstance' : buttonInstance[0]
  };
  screenCalendarMap[datagridName + '-' + componentName] = data;
};

expj.common.arrangeDatagridButtonArea = function (screenId) {
  //DataGridTableがボタン行ない場合、強制height=12のTR追加
  $('#expj-business-screen-tabs-body-' + screenId).find('.data-grid-table').each(function () {
    var buttonFields = $(this).find('.datagrid-button-field');
    if (buttonFields.length === 0) {
      $(this).append('<div class="datagrid-button-field" style="height:12px"></div>');
    }
  });
 
  $('#expj-business-screen-tabs-body-' + screenId).find('.datagrid-button-field').each(function () {
    // noButton判定用
    var noButton = true;
    // 行divの子を選択
    var targetButtonField = $(this);
    var targetChildren = targetButtonField.children('div');
    for (var i = 0, len = targetChildren.length; i < len; i++) {
      var targetDiv = targetChildren[i];
      var targetDivInnerHtml = targetDiv.innerHTML;
      if (typeof(targetDivInnerHtml) !== 'undefined' && targetDivInnerHtml !== '') {
        noButton = false;
      }
    }
    if (noButton === true) {
      targetChildren.removeClass("button-area button-area-left button-area-right");
      targetChildren.height(12);
      targetButtonField.height(12);
      
      //サイズ可変,noButtonForm変換障害対応,12pxはボタンない行の高さ
      var nobuttonFormTr = targetButtonField.prev('div');
      nobuttonFormTr.css('height','calc(100% - 12px)');
    }
  });
};

expj.common.setExpjDynamicHeight = function (screenId) {
  //可変TRに動的高さ設定
  var targetTr = $('#expj-business-screen-tabs-body-' + screenId).find('div.expjDynamicHeight');
  var parentTr = targetTr.parent();
  var childList = parentTr.children('div'); 
  var dynamicHeight = 0; 
  childList.each(function () {
    if (this !== targetTr[0]) {
      dynamicHeight += $(this).outerHeight();
    }
  });
  var dynamicHeightSet = "calc(100% - " + dynamicHeight + "px)";
  targetTr.css('height', dynamicHeightSet);
};

/**
 * 画面内のinputタグ（name属性が"DOWNLOAD_FILE"のもの）を探索し、value属性に格納されたURLを別ウィンドウで開く。<br>
 * value属性が空の時は無視される。<br>
 * @param screenId 画面ID
 * @param contextPath コンテキストパス
 */
expj.common.executeFileDownLoad = function (screenId, contextPath) {
  // 業務画面内の<input name="DOWNLOAD_FILE">を探索
  var list = $('#expj-business-screen-tabs-body-' + screenId).find('input[name="DOWNLOAD_FILE"]');
  for (var i = 0, len = list.length; i < len; i++) {
    var object = list[i];
    // ファイルのvalue属性を取得
    var path = object.value;
    if (path !== '') {
      // value属性にダウンロードするファイルのパスが設定されていた場合、ダウンロード処理を開始する
      expj.common.executeFileDownloadWindow(contextPath, path);
    }
  }
};

expj.common.executeFileDownloadWindow = function (contextPath, filePath) {
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE) {
    // IE11
    window.open(contextPath + filePath, '_blank');
  } else if (com.nec.jp.orteus.utils.ClientInfo.browser.isEdge) {
    // Edge
    if (filePath.endsWith('.csv')) {
      var link = document.createElement('a');
      link.href = contextPath + filePath;
      link.click();
    } else {
      window.open(contextPath + filePath, '_blank');
    }
  } else {
    // Chrome and Chromium Edge
    if (filePath.endsWith('.pdf')){
      if(expj.common.config.pdfDownloadWindowValidPeriod <= 0 || expj.common.config.pdfDownloadWindowValidPeriod === undefined){
        // PDF表示：新規ウィンドウ
        window.open(contextPath + filePath, '_blank','status=no,resizable=yes,location=no');
      } else {
        var subWindow = window.open(contextPath + filePath, 'FileDownload','width=150,height=150,status=no,resizable=yes,location=no');
        setTimeout(function () {
          subWindow.close();
        }, expj.common.config.pdfDownloadWindowValidPeriod);
      }
    }else{
      //CSV出力：ダウンロードバー表示
      window.open(contextPath + filePath, '_self','status=no,resizable=yes,location=no');
    }
  }
};

expj.common.tuningScreenOverflow = function () {
  $('#expj-screen-wrapper').css('overflow', 'hidden');
  setTimeout(function () {
    $('#expj-screen-wrapper').css('overflow', '');
  }, 0);
};

expj.common.ui.tree.clickTreeNodeInit = function (targetTreeInstance, fancytreeData) {
  // 選択されたノード情報を取得
  var selectedNode = fancytreeData.tree.getActiveNode();
  
  // ---------- ノードハイライト処理--------------------------
  // 選択中ノードにスタイルを適用
  selectedNode.extraClasses = "node-selected-self";
  selectedNode.render();
  
  //前回の選択中だったノードのスタイルを解除
  if ((targetTreeInstance.gPrevSelectedNode !== null) && (targetTreeInstance.gPrevSelectedNode !== selectedNode)) {
    targetTreeInstance.gPrevSelectedNode.extraClasses = "node-deselected";
    targetTreeInstance.gPrevSelectedNode.render();
  }
  //---------- ノードハイライト処理(END)--------------------------
  //---------- 親ノードハイライト処理--------------------------
  var parentNode = selectedNode.getParent();
  
  // 今回の親ノードにスタイルを適用
  parentNode.extraClasses = "node-selected-parent";
  parentNode.render();
  
  if (targetTreeInstance.gPrevSelectedNode !== null) {
    var prevParentNode = targetTreeInstance.gPrevSelectedNode.getParent();
    if ((prevParentNode !== null) && (prevParentNode !== selectedNode) && (prevParentNode !== parentNode)) {
      prevParentNode.extraClasses = "node-deselected-parent";
      prevParentNode.render();
    }
  }
  //---------- 親ノードハイライト処理(END)--------------------------
  // 選択中のノードを変数に格納する
  targetTreeInstance.gPrevSelectedNode = selectedNode;
};

/**
 * メニューでdisabled指定がされたボタンを操作する。
 */
expj.common.revokeControl = function (screenId) {
  var buttonList = $(screenId).find('button[data-revokectrl="disabled"],button[data-revokectrl="hidden"]');
  buttonList.each(function () {
    this.setAttribute('disabled', 'disabled');
  });
};

//ExView専用
expj.common.tuningReloadTableAfter = function (viewId) {
  //cell背景適用
  $(viewId).find('.expj-view-cell-label span').each(function () {
    var innerBgcolor = '';
    innerBgcolor = this.getAttribute('data-bgcolor');
    if (innerBgcolor !== null && innerBgcolor !== '') {
      innerBgcolor = '#' + innerBgcolor;
      $(this).parent().css('background-color', innerBgcolor);
    }
  });

  //cell文字色適用
  $(viewId).find('.expj-view-cell-label span').each(function () {
    var innerColor = '';
    innerColor = this.getAttribute('data-color');
    if (innerColor !== null && innerColor !== '') {
      innerColor = '#' + innerColor;
      $(this).parent().css('color', innerColor);
    }
  });

  //rowselectable適用
  $(viewId).find('[data-rowselectable="false"]').each(function () {
    var parentTr = $(this).parent().parent();
    if (parentTr.hasClass('odd')) {
      parentTr.attr('style', 'background-color:rgb(200, 208, 221);');
    } else {
      parentTr.attr('style', 'background-color:rgb(210, 216, 226);');
    }
    parentTr.attr('data-selectable', 'false');
    parentTr.unbind('click'); //セレクトできない行のクリックイベント削除
  });
  
  //tooltip適用
  expj.common.ui.tooltip.create($(viewId).attr('id'));
  
  //書式適用
  expj.common.pscript.kind.applyKind("" + viewId);

}

expj.common.tuningLoadScreenAfter = function (screenId, processName) {

  expj.common.regulateCheckboxForDblClick(screenId);

  //Viewテキストボックス、hidden処理
  $(screenId).find('.expj-view-cell-hidden input').each(function () {
    if(this.getAttribute('type') === 'checkbox'){
      //checkboxのみ、hidden属性追加する、typeをhiddenしない。
      this.setAttribute('hidden', 'hidden');
    }else{
      this.setAttribute('type', 'hidden');
    }
    $(this).removeClass(processName + "-focus-move");
  });
  
  //View内、cell背景対応
  $(screenId).find('.expj-view-cell-label span').each(function () {
    var innerBgcolor = '';
    innerBgcolor = this.getAttribute('data-bgcolor');
    if (innerBgcolor !== null && innerBgcolor !== '') {
      innerBgcolor = '#' + innerBgcolor;
      $(this).parent().css('background-color', innerBgcolor);
    }
  });

  //cell文字色適用
  $(screenId).find('.expj-view-cell-label span').each(function () {
    var innerColor = '';
    innerColor = this.getAttribute('data-color');
    if (innerColor !== null && innerColor !== '') {
      innerColor = '#' + innerColor;
      $(this).parent().css('color', innerColor);
    }
  });

  //View内、textinput背景対応
  $(screenId).find('.expj-view-cell-textinput input[type="text"]').each(function () {
    var innerBgcolor = '';
    innerBgcolor = this.getAttribute('data-bgcolor');
    if (innerBgcolor !== null && innerBgcolor !== '') {
      innerBgcolor = '#' + innerBgcolor;
      $(this).parent().css('background-color', innerBgcolor);
    }
  });
  
  //Hidden属性の動的変更Viewの列幅変更対応
  $(screenId).find('div.expj-datagrid-view').each(function () {
    var target = $(this);
    var targetTable = target.find('div.orteusView_scrollHeadWrapper > table');
    var headTableWidth = targetTable.css('width');
    var headTableWidthInt = 0;
    if(headTableWidth != null && headTableWidth != ""){
      headTableWidthInt = parseInt(headTableWidth);
    }
    var columnList = target.find('div.orteusView_scrollHeadWrapper > table > thead > tr > th');
    var hasThHidden = false;
    var resizeByWidth = 0;
    for (var i = 0; i < columnList.length; i++) {
      var columnWidth = $(columnList[i]).get(0).style.width;
      if($(columnList[i]).hasClass('orteusView_hiddenColumn')){
        hasThHidden = true;
      }else{
        var columnWidthInt = 0;
        if(columnWidth != null && columnWidth != ""){
           columnWidthInt = parseInt(columnWidth);
        }
        resizeByWidth += columnWidthInt;
      }
    }
    if(hasThHidden == true && resizeByWidth != 0 && resizeByWidth < headTableWidthInt){
      targetTable.css('width', resizeByWidth);
      target.find('div.orteusView_BodyArea > table').css('width', resizeByWidth);
    }
  });
  
  //コンボボックスの&nbsp;を半角スペースに置換
  $(screenId).find('option').each(function () {
    var optionText = $(this).html();
    $(this).html(optionText.replace(/&amp;nbsp;/g,' '));
  });
  
  //radioデフォルトチェック状態する
  var oRadio = $(screenId).find('input[type="radio"]');
  var radioGroupMap = {};
  var splitId = screenId.split('-');
  var originalScreenId = splitId[splitId.length - 1];
  var focusClass = originalScreenId + "-focus-move";
  for(var i = 0, len = oRadio.length; i < len; i++){
    var oRadioName = oRadio[i].getAttribute("name");
    var groupMap = radioGroupMap[oRadioName];
    if (typeof(groupMap) === 'undefined' || groupMap === null) {
      groupMap = {};
      radioGroupMap[oRadioName] = groupMap;
    }
    var oRadioId = oRadio[i].getAttribute('id');
    groupMap[oRadioId] = oRadio[i];
  }
  for (var groupName in radioGroupMap) {
    var group = radioGroupMap[groupName];
    var checked = false;
    var id, radio;
    for (id in group) {
      radio = group[id];
      if (radio.checked) {
        checked = true;
        $(radio).addClass(focusClass);
        break;
      }
    }
    if (!checked) {
      checked = false;
      for (id in group) {
        radio = group[id];
        if (!radio.disabled) {
          radio.checked = true;
          checked = true;
          $(radio).addClass(focusClass);
          break;
        }
      }
      if (!checked) {
        for (id in group) {
          radio = group[id];
          radio.checked = true;
          $(radio).addClass(focusClass);
          break;
        }
      }
    }

    //radioのfocus用class追加削除処理
    for (id in group) {
      radio = group[id];
      $(radio).change(function () {
        var group = radioGroupMap[this.name];
        for (var inId in group) {
          var inRadio = group[inId];
          var obj = $(inRadio);
          if (inRadio.checked) {
            obj.addClass(focusClass).bind('keydown.radio', function(e) {
              var key = e.keyCode;
              // エンターキーとタブキーの場合にフォーカス制御する
              if ((key === expj.common.ui.EXPJ_KEY_CODE_ESC) || ((key === expj.common.ui.EXPJ_KEY_CODE_TAB) && e.shiftKey)) {
                // ESCキー or シフトキー + タブキー : 逆方向フォーカス移動
                expj.common.ui.focusMoveBackward(this, '.' + focusClass);
                // 本来のイベント動作をさせない
                e.preventDefault();
              } else if ((key === expj.common.ui.EXPJ_KEY_CODE_ENTER) || (key === expj.common.ui.EXPJ_KEY_CODE_TAB)) {
                // エンターキー or シフトキー : 正方向フォーカス移動
                expj.common.ui.focusMoveForward(this, '.' + focusClass);
                // 本来のイベント動作をさせない
                e.preventDefault();
              }
            });
          } else if (!inRadio.checked) {
            obj.removeClass(focusClass).unbind('keydown.radio');
          }
        }
      });
    }
  }
  
  // FORM系のデザイン調整
  expj.common.tuningLoadScreenFormAfter(screenId, true);
  
  //Formテキストボックス幅大きすぎ、項目ずれ対応
  $(screenId).find('.over-inner').each(function(){
    var targetList = $(this).prevAll('div');
    for(i = 0;i<targetList.length -1;i++){
      var targetTmp = $(targetList[0]);
      if(targetTmp.get(0) && targetTmp.get(0).nodeName === 'DIV'){
        var target = targetTmp;
        var targetWidth = parseInt(target.get(0).style.width);
        var targetChildList = target.children();
        var targetChildAllWidth = 0;
        //radioなど複数child項目対応
        if(targetChildList.length > 1 ){
          for(var j= 0;j < targetChildList.length;j++){
            var targetChild = $(targetChildList[j]);
            var targetChildWidth = parseInt(targetChild.css('width'));
            targetChildAllWidth += targetChildWidth;
          }
        }else{
          targetChildAllWidth = parseInt(target.children().css('width'));
        }
        var overInnerWidth = targetWidth - targetChildAllWidth;
        if(targetWidth > targetChildAllWidth){
          target.css('width',targetChildAllWidth);
          $(this).css('width',overInnerWidth);
        }
      }
    }
  });
  
  //2つ横並びView、右側buttonない場合ずれる現象対応
  $(screenId).find('.widthResizeLinePartition').each(function(){
    var targetList = $(this).nextAll('div');
    var noRightButton = false;
    var chkTarget;
    for(i = 0;i<targetList.length -1;i++){
      if($(targetList[i]).hasClass("for-two-button")){
        chkTarget = $(targetList[i]);
          if(chkTarget && chkTarget.children().length === 0){
            noRightButton = true;
          }
      }
      
      if(noRightButton === true){
        chkTarget.parent().css('width','calc(50% + 8px)');
        $(targetList).remove();
        break;
      }
    }
  });
  
  //FormView横並び、レイアウト調整
  $(screenId).find('.multitrFormView').each(function(){
    var targetArea = $(this);
    
    //child TR取得,一行目のheight=0の行をdisplay:noneにする
    var targetChildList = targetArea.children('.expj-tr');
    if(targetChildList){
      $(targetChildList[1]).css('display','none');
    }
    
    //中央枠高さを調整
    var targetLinePartitionList = targetArea.find('.widthLinePartition');
    if(targetLinePartitionList){
      $(targetLinePartitionList[1]).css('height', '100%');
    }
    
    //左右用の割分取得
    //初期化、ボタンwidth調整
    var dataPer = targetArea.attr('data-multitrFormView');
    if(dataPer){
      var leftWidth = 0;
      var rightWidth = 0;
      var dataLeftWidth = "calc(" + dataPer + " - 8px)";
      var dataRightWidth = "calc(100% - " + dataPer + " - 8px)";
      //左右％指定td部分取得,調整
      var targetTrList = targetArea.find('.expj-multitr');
      if(targetTrList){
        $(targetTrList[0]).css('width', dataLeftWidth).css('height', '100%');
        $(targetTrList[1]).css('width', dataRightWidth).css('height', '100%');
        var openWindowSize = parseInt($(window).width());
        var openWindowSizeHeight = parseInt($(window).height());
        var targetAreaSize = targetArea.width();
        var dataPerInt = parseInt(dataPer);
        leftWidth = targetAreaSize * dataPerInt / 100 - 8;
        rightWidth = targetAreaSize - leftWidth -16;
      }
      
      //初期化、ボタンwidth調整
      var buttonResizeAreaLeft = targetArea.find('.buttonResizeArea-left');
      var buttonResizeAreaRight = targetArea.find('.buttonResizeArea-right');
      if(leftWidth != 0 && rightWidth != 0){
        var leftButtonWidth = targetArea.find('.left-button').width();
        var rightButtonWidth =  targetArea.find('.right-button').width();
        var leftResize = leftWidth - leftButtonWidth - 84;
        var rightResize = rightWidth - rightButtonWidth - 84;
        buttonResizeAreaLeft.css('width',leftResize);
        buttonResizeAreaRight.css('width',rightResize);
      }
    }
    
    //FormViewボタン部分のresizeイベント
    $(window).on('resize',function(){
      $(screenId).find('.multitrFormView').each(function(){
        var targetArea = $(this);
        
        //左右用の割分取得、formViewとボタン幅再設定
        var dataPer = targetArea.attr('data-multitrFormView');
        if(dataPer){
          var dataLeftWidth = "calc(" + dataPer + " - 8px)";
          var dataRightWidth = "calc(100% - " + dataPer + " - 8px)";
          var dataPerInt = parseInt(dataPer);
          var buttonResizeAreaLeft = targetArea.find('.buttonResizeArea-left');
          var buttonResizeAreaRight = targetArea.find('.buttonResizeArea-right');
          var leftButtonWidth = parseInt(targetArea.find('.left-button').get(0).style.width);
          var rightButtonWidth =  parseInt(targetArea.find('.right-button').get(0).style.width);
          var leftWidth = 0;
          var rightWidth = 0;
          var leftResize = 0;
          var rightResize = 0;
          //左右％指定td部分取得,調整
          var targetTrList = targetArea.find('.expj-multitr');
          if(targetTrList){
            var trFirst = $(targetTrList[0]); //左Formのtr
            var trSecond = $(targetTrList[1]); //右Viewのtr
            trFirst.css('width', dataLeftWidth);
            trSecond.css('width', dataRightWidth);
            
            var openWindowSize = parseInt($(window).width());
            var openWindowSizeHeight = parseInt($(window).height());
            
            //画面最小時、レイアウト調整
            if(openWindowSize <= 968){
              var baseWidth = 946;
              leftWidth = baseWidth * dataPerInt / 100 - 8;
              rightWidth = baseWidth - leftWidth -16;
              
              leftResize = leftWidth - leftButtonWidth - 84;
              rightResize = rightWidth - rightButtonWidth - 84;
              
              buttonResizeAreaLeft.css('width',leftResize);
              buttonResizeAreaRight.css('width',rightResize);
              trFirst.css('width', leftWidth);
              trSecond.css('width', rightWidth);
              return;
            }
             //画面最小時、レイアウト調整、スクロールある
            if(openWindowSizeHeight <= 686 && openWindowSize <= 985){
              leftWidth = 946 * dataPerInt / 100 - 8;
              rightWidth = 946 - leftWidth -16;
              leftResize = leftWidth - leftButtonWidth - 84;
              rightResize = rightWidth - rightButtonWidth - 84;
              
              buttonResizeAreaLeft.css('width',leftResize);
              buttonResizeAreaRight.css('width',rightResize);
              trFirst.css('width', leftWidth);
              trSecond.css('width', rightWidth);
              return;
            }
            
            
            //正常時、レイアウト調整
            var targetAreaSize = 0;
            if(openWindowSizeHeight < 686){
              targetAreaSize = openWindowSize - 39; //スクロール17px分なくす
            }else{
              targetAreaSize = openWindowSize - 22;
            }
            leftWidth = targetAreaSize * dataPerInt / 100 - 8;
            rightWidth = targetAreaSize - leftWidth -16;
            //ボタンwidth調整
            if(leftWidth > 0 && rightWidth > 0){
              leftResize = leftWidth - leftButtonWidth - 84;
              rightResize = rightWidth - rightButtonWidth - 84;
              if(leftResize > 0 && rightResize > 0){
                buttonResizeAreaLeft.css('width',leftResize);
                buttonResizeAreaRight.css('width',rightResize);
                trFirst.css('width', leftWidth);
                trSecond.css('width', rightWidth);
              }
            }
          }
        }
      });
    });
  });
  
  //Formスクロールリサイズ処理：4px以内、スクロール表示しない。
  $(screenId).find('form').each(function(){
    //初期時
    var formHeight = $(this).outerHeight();
    var formTableHeight = $(this).children('div').outerHeight();
    if(formHeight && formTableHeight && formHeight < formTableHeight){
      var rangHeight = formTableHeight - formHeight;
      if(rangHeight < 4){
        $(this).css('height',formTableHeight);
        }
      }
    
    //resize時、対応ため、イベント追加
    $(window).on('resize',function(){
      $(screenId).find('form').each(function(){
        var formHeight = $(this).outerHeight();
        var formTableHeight = $(this).children('div').outerHeight();
        if(formHeight && formTableHeight && formHeight < formTableHeight){
          var rangHeight = formTableHeight - formHeight;
          if(rangHeight < 4){
            $(this).css('height',formTableHeight);
          }
        }
       });
    });
    
  });
  
  
  //ボタンなし場合、ボタンエリア削除する
  $(screenId).find('.multitrFormView').each(function(){
    var targetArea = $(this);
    var buttonParentTag = $(targetArea.find('.left-button'));
    if(buttonParentTag.find('button').length === 0){
      buttonParentTag.prev('div').css('border-bottom-color','transparent');
      buttonParentTag.next('div').css('background-color','transparent');
    }
  });
  
  //特殊ViewView対応
  $(screenId).find('.two-view-button .left-button').each(function(){
    var targetLeftButtonArea = $(this);
    if(targetLeftButtonArea.find('button').length === 0){
      var targetList = targetLeftButtonArea.parent('div').prev('div').find('.expj-datagrid-view');
      if(targetList.length === 2){
        $(targetList[0]).children('.orteusView_BodyArea').css('padding-bottom','32px');
      }
    }
  });
  
  
    //ViewView比率　横並び、レイアウト調整
  $(screenId).find('.multitrViewView').each(function(){
    var targetArea = $(this);
    
    //child TR取得,一行目のheight=0の行をdisplay:noneにする
    var targetChildList = targetArea.children('.expj-tr');
    if(targetChildList){
      $(targetChildList[1]).css('display','none');
    }
    
    //中央枠高さを調整
    var targetLinePartitionList = targetArea.find('.widthLinePartition');
    if(targetLinePartitionList){
      $(targetLinePartitionList[1]).css('height', '100%');
    }
    
    //左右用の割分取得
    //初期化、ボタンwidth調整
    var dataPer = targetArea.attr('data-multitrViewView');
    if(dataPer){
      var leftWidth = 0;
      var rightWidth = 0;
      var dataLeftWidth = "calc(" + dataPer + " - 8px)";
      var dataRightWidth = "calc(100% - " + dataPer + " - 8px)";
      //左右％指定td部分取得,調整
      var targetTrList = targetArea.find('.expj-multitr');
      if(targetTrList){
        $(targetTrList[0]).css('width', dataLeftWidth).css('height', '100%');
        $(targetTrList[1]).css('width', dataRightWidth).css('height', '100%');
        var openWindowSize = parseInt($(window).width());
        var targetAreaSize = targetArea.width();
        var dataPerInt = parseInt(dataPer);
        leftWidth = targetAreaSize * dataPerInt / 100 - 8;
        rightWidth = targetAreaSize - leftWidth -16;
      }
      
      //初期化、ボタンwidth調整
      var buttonResizeAreaLeft = targetArea.find('.buttonResizeArea-left');
      var buttonResizeAreaRight = targetArea.find('.buttonResizeArea-right');
      if(leftWidth != 0 && rightWidth != 0){
        var leftButtonWidth = targetArea.find('.left-button').width();
        var rightButtonWidth =  targetArea.find('.right-button').width();
        var leftResize = leftWidth - leftButtonWidth - 84;
        var rightResize = rightWidth - rightButtonWidth - 84;
        buttonResizeAreaLeft.css('width',leftResize);
        buttonResizeAreaRight.css('width',rightResize);
      }
    }
    
    //ViewViewボタン部分のresizeイベント
    $(window).on('resize',function(){
      $(screenId).find('.multitrViewView').each(function(){
        var targetArea = $(this);
        
        //左右用の割分取得、viewViewとボタン幅再設定
        var dataPer = targetArea.attr('data-multitrViewView');
        if(dataPer){
          var dataLeftWidth = "calc(" + dataPer + " - 8px)";
          var dataRightWidth = "calc(100% - " + dataPer + " - 8px)";
          var dataPerInt = parseInt(dataPer);
          var buttonResizeAreaLeft = targetArea.find('.buttonResizeArea-left');
          var buttonResizeAreaRight = targetArea.find('.buttonResizeArea-right');
          var leftButtonWidth = parseInt(targetArea.find('.left-button').get(0).style.width);
          var rightButtonWidth =  parseInt(targetArea.find('.right-button').get(0).style.width);
          var leftWidth = 0;
          var rightWidth = 0;
          var leftResize = 0;
          var rightResize = 0;
          //左右％指定td部分取得,調整
          var targetTrList = targetArea.find('.expj-multitr');
          if(targetTrList){
            var trFirst = $(targetTrList[0]); //左Viewのtr
            var trSecond = $(targetTrList[1]); //右Viewのtr
           // trFirst.css('width', dataLeftWidth);
           // trSecond.css('width', dataRightWidth);
            
            var openWindowSize = parseInt($(window).width());
            var openWindowSizeHeight = parseInt($(window).height());
            
            //画面最小時、レイアウト調整
            if(openWindowSize <= 968){
              leftWidth = 946 * dataPerInt / 100 - 8;
              rightWidth = 946 - leftWidth -16;
              leftResize = leftWidth - leftButtonWidth - 84;
              rightResize = rightWidth - rightButtonWidth - 84;
              
              buttonResizeAreaLeft.css('width',leftResize);
              buttonResizeAreaRight.css('width',rightResize);
              trFirst.css('width', leftWidth);
              trSecond.css('width', rightWidth);
              return;
            }
            //画面最小時、レイアウト調整、スクロールある
            if(openWindowSizeHeight <= 686 && openWindowSize <= 985){
              leftWidth = 946 * dataPerInt / 100 - 8;
              rightWidth = 946 - leftWidth -16;
              leftResize = leftWidth - leftButtonWidth - 84;
              rightResize = rightWidth - rightButtonWidth - 84;
              
              buttonResizeAreaLeft.css('width',leftResize);
              buttonResizeAreaRight.css('width',rightResize);
              trFirst.css('width', leftWidth);
              trSecond.css('width', rightWidth);
              return;
            }
            
            //正常時、レイアウト調整
            var targetAreaSize = 0;
            if(openWindowSizeHeight < 686){
              targetAreaSize = openWindowSize - 39; //スクロール17px分なくす
            }else{
              targetAreaSize = openWindowSize - 22;
            }
            leftWidth = targetAreaSize * dataPerInt / 100 - 8;
            rightWidth = targetAreaSize - leftWidth -16;
            //ボタンwidth調整
            if(leftWidth > 0 && rightWidth > 0){
              leftResize = leftWidth - leftButtonWidth - 84;
              rightResize = rightWidth - rightButtonWidth - 84;
              if(leftResize > 0 && rightResize > 0){
                buttonResizeAreaLeft.css('width',leftResize);
                buttonResizeAreaRight.css('width',rightResize);
                trFirst.css('width', leftWidth);
                trSecond.css('width', rightWidth);
              }
            }
          }
        }
      });
    });
  });
};

expj.common.tuningLoadScreenFormAfter = function (targetId, isAll) {
  let targetObj = $(targetId);
  if (isAll) {
    targetObj = targetObj.find('form');
  }

  //Formの一列目の項目にmargin-left:5pxにする
  targetObj.children('div.div-table').children('div.div-tr').each(function(){
    let targetTrChildren = $(this).children('div');
    if (targetTrChildren.length > 0) {
      let targetTd = $(targetTrChildren[0]);
      let targetAlign = targetTd.css('text-align');
      let targetChild = targetTd.children();
      if (targetAlign !== 'right' && targetAlign !== 'center') {
        if(targetChild.length == 1){
          targetChild.css('margin-left','5px');
        }
        if(targetChild.length == 2 && targetChild.get(0).nodeName === "INPUT" && targetChild.get(1).nodeName === "LABEL"){
          $(targetChild.get(0)).css('margin-left','5px');
        }
      }
    }
  });

  //Form最後列、各TDのwidthを再設定する(最後列width= trWidth - tdWidth合計)
  targetObj.find('.div-table .div-tr').each(function(){
    if($(this).outerHeight() !== 0 ){
      let trWidth = $(this).css('width');
      let trWidthInt = 0;
      if(trWidth !== "100%" && trWidth !== null && trWidth !== ""){
        trWidthInt = parseInt(trWidth);
      }
      if(trWidthInt > 946){
        trWidthInt = 946;
      }
      let tdList = $(this).children('div');
      let tdWidthALL = 0;
      let i= 0;
      let lastTdwidth = 0;
      for(i= 0 ;i < tdList.length - 1; i++){
        let target = $(tdList[i]);
        let targetWidth = target.get(0).style.width;
        let targetWidthInt = 0;
        targetWidthInt = parseInt(targetWidth);
        tdWidthALL +=  targetWidthInt;
        if(trWidthInt !== 0 && tdWidthALL > trWidthInt){
          target.css('width','0px');//td全体over時
        }
      }
      if(trWidthInt !== 0 && tdWidthALL !== 0){
        if(tdWidthALL < trWidthInt){
          lastTdwidth = trWidthInt - tdWidthALL;
          $(tdList[tdList.length - 1]).css('width',lastTdwidth);
        }else{
          $(tdList[tdList.length - 1]).css('width','0px');
        }
      }
    }
  });

  //Formのからdiv結合処理
  targetObj.find('.div-table .div-tr').each(function(){
    if($(this).outerHeight() !== 0 ){
      let tdList = $(this).children('div');
      for(let i= tdList.length - 1 ;i > 0; i--){
        let target = $(tdList[i]);
        let targetPrev = $(tdList[i-1]);
        if(target.children().length > 0){ //項目ある場合、ループ飛ばす。
          continue;
        }else{                
          let targetWidth = target.get(0).style.width;
          let targetPrevWidth = targetPrev.get(0).style.width;
          if(!targetPrevWidth){
            targetPrevWidth = 0;
          }
          let targetPrevWidthInt = parseInt(targetPrevWidth);
          let targetWidthInt = parseInt(targetWidth);
          targetPrevWidthInt = targetPrevWidthInt + targetWidthInt;
          //if(targetPrev.children().length > 0 && targetPrev.children().outerWidth() < targetPrev.outerWidth() ){
          //spanの場合、結合除外する、align Centerがおかしくなるため
          if(targetPrev.children().length > 0 && targetPrev.children().get(0).nodeName === 'SPAN'){
            continue;
          }
          if(targetPrev.children().length > 0 && targetPrev.children().get(0).style.width === '100%' && targetPrevWidth !== 0){
            targetPrev.children().css('width',targetPrevWidth);
          }
          targetPrev.css('width',targetPrevWidthInt);
          target.remove();
        }
      }
    }
  });

  //spanのtdにmin-heightとmax-width追加する
  targetObj.find('.div-table .div-tr .div-td span').each(function(){
    let target = $(this);
    let targetParent = target.parent();
    targetParent.css('height','23px');
    let targetParentWidth = targetParent.get(0).style.width;
    if(targetParentWidth !== "" && targetParentWidth !== null && targetParentWidth !== "100%" && targetParentWidth !== "0px"){
      targetParent.css('max-width',targetParentWidth);
    }
  });

  //buttonあるformのtd高さ23を設定
  targetObj.find('.div-table .div-tr .div-td button').each(function(){
    let target = $(this);
    if(!target.hasClass("expj-iconbutton")){
      let targetParent = target.parent();
      targetParent.css('height','23px');
    }
  });
  
  //Form下部分の不要行に高さ再設定
  targetObj.find('.div-table').each(function(){
    let hiddenTrFLG = true;
    let targetTrList = $(this).children('div');
    for(let i= targetTrList.length - 1 ;i >= 0; i--){
      let targetTr = $(targetTrList[i]);
      if(targetTr.children('div').length > 0){
        let targetTdList = targetTr.children('div');
        for(let j= 0 ; j < targetTdList.length ; j++){
          let targetTd = $(targetTdList[j]);
          if(targetTd.children().length > 0){
            hiddenTrFLG = false;
          }
        }
      }
      if(hiddenTrFLG === true){
        targetTr.css('height','auto');
      }else{
        break;
      }
    }
  });

}

expj.common.tuningLoadScreenBefore = function (screenId) {
  //一段内formView同時ありのレイアウト調整
  $(screenId).find('.multigrid-form').each(function () {
    var formObj = $(this);
    var formObjHeight = formObj.css('height');
    if(formObj && formObjHeight != null && formObjHeight != '100%'){
      var formObjParent = formObj.parent('div');
      formObjParent.css('height','');
      var divList = formObjParent.siblings();
      for(i=0; i<divList.length; i++){
        $(divList[i]).find('.expj-datagrid-view').each(function () {
          var target = $(this).parent('div');
          var targetHeight = 'calc(100% - ' + formObjHeight + ')';
          $(target).css('height',targetHeight);
        });
      }
    }
  });
  
  //htmlで設定したdivにclass(div-td)を追加
  $(screenId).find('form .div-tr div').each(function () {
    var div = $(this);
    if (!div.hasClass('div-td')) {
      div.addClass('div-td');
    }
  });
  
  //view-button行処理
  $(screenId).find('.view-next-button').each(function(){
    var list =$(this).children('div');
    
    //ボタン行TRのbuttonTable外側tdない対応
    for(i=0;i<list.length;i++){
      if($(list[i]).hasClass('div-table') && list.length > 1){
         $(list[i]).prev('script').remove().appendTo(list[1]);
         $(list[i]).remove().appendTo(list[1]);
      }
    }
    
    //viewボタンん行td個数5まで追加処理
    var tdLength = 0;
    if(list.length == 2) {
     $(this).append('<div class="datagrid-button-field-cell  button-area-right" style="width:60px;"></div>');
     tdLength = 3;
    }
    if(list.length == 3 || tdLength == 3) {
     $(this).append('<div class="datagrid-button-field-cell " style=""></div>');
     tdLength = 4;
    }
    if(list.length == 4 || tdLength == 4) {
     $(this).append('<div class="datagrid-button-field-cell " style="width:12px"></div>');
     tdLength = 5;
    }
  });
  
  //Viewボタン行、ボタン移動とright三角前後div横幅リサイズ
  $(screenId).find('.button-area-right').each(function(){
    //RightDiv直前Div
    var oButtonAreaRightDivPrev = $(this).prev('div');
    //RightDiv直後Div
    var oButtonAreaRightDivNext = $(this).next('div');
    //Button移動
    if(oButtonAreaRightDivNext.html() !== ''){
      var oButtonAreaRightDivNextButtonTableWidth = $(oButtonAreaRightDivNext).find('.div-table').css('width');
      $(oButtonAreaRightDivNext.html()).appendTo(oButtonAreaRightDivPrev);
      $(oButtonAreaRightDivNext).css('width', '').empty();
      $(oButtonAreaRightDivPrev).css('width', oButtonAreaRightDivNextButtonTableWidth);
    }
    //ボタン行リサイズ
    var oButtonAreaRightDivPrevWidth = parseInt($(oButtonAreaRightDivPrev).css('width'));
    if(oButtonAreaRightDivPrev.html() !== ''){
      var oButtonAreaRightDivPrevButtonTableWidth = parseInt($(oButtonAreaRightDivPrev).find('.div-table').css('width'));
      if(oButtonAreaRightDivPrevWidth != oButtonAreaRightDivPrevButtonTableWidth){
        var oButtonAreaRightDivNextReWidth = (862 - oButtonAreaRightDivPrevButtonTableWidth) ;
        $(oButtonAreaRightDivPrev).css('width', oButtonAreaRightDivPrevButtonTableWidth);
        $(oButtonAreaRightDivNext).css('width', oButtonAreaRightDivNextReWidth);
      }
    }
  });
  
    //2view横並び、左右view下buttonエリアの処理
  $(screenId).find('.two-view-button .for-two-button').each(function(){
    if($(this).children().length === 0){
      var targetButtonFieldForTwoViewPrev = $(this).prev('div');
      var targetButtonFieldForTwoViewNext = $(this).next('div');
      $(this).removeClass('button-area');
      targetButtonFieldForTwoViewPrev.removeClass('button-area');
      targetButtonFieldForTwoViewNext.removeClass('button-area-right');
    }
  
  });
  
  //Formボタン行、ボタン移動とleft三角前後div横幅リサイズ
  $(screenId).find('.button-area-left').each(function(){
    //leftDiv直前Div
    var oButtonAreaLeftDivPrev = $(this).prev('div');
    //leftDiv直後Div
    var oButtonAreaLeftDivNext = $(this).next('div');
    //Button移動
    if(oButtonAreaLeftDivPrev.html() !== ''){
    //ButtonTableの幅取得
      var oButtonAreaLeftDivPrevButtonTableWidth = $(oButtonAreaLeftDivPrev).find('.div-table').css('width');
      $(oButtonAreaLeftDivPrev.html()).appendTo(oButtonAreaLeftDivNext);
      $(oButtonAreaLeftDivPrev).css('width', '').empty();
      $(oButtonAreaLeftDivNext).css('width', oButtonAreaLeftDivPrevButtonTableWidth);
    }
    //ボタン行リサイズ
    var oButtonAreaLeftDivNextWidth = parseInt($(oButtonAreaLeftDivNext).css('width'));
    if(oButtonAreaLeftDivNext.html() !== ''){
        var oButtonAreaLeftDivNextButtonTableWidth = parseInt($(oButtonAreaLeftDivNext).find('.div-table').css('width'));
        if(oButtonAreaLeftDivNextWidth != oButtonAreaLeftDivNextButtonTableWidth){
          var oButtonAreaLeftDivPrevReWidth = (862 - oButtonAreaLeftDivNextButtonTableWidth) ;
          $(oButtonAreaLeftDivNext).css('width', oButtonAreaLeftDivNextButtonTableWidth);
          $(oButtonAreaLeftDivPrev).css('width', oButtonAreaLeftDivPrevReWidth);
        }
      }
  });
  
  //フッター行リサイズ
  $(screenId).find('.footer-button').each(function(){
    var targetFooterTable = $(this);
    var footerButtonTableWidth = parseInt(targetFooterTable.css('width'));
    var Button = targetFooterTable.children().children('div');
    var buttonCount = 0;
    var minWidth = 0;
    
    for (var i = 0; i < Button.length; i++) {
      var ButtonWidth = parseInt($(Button[i]).css('width'));
      minWidth += ButtonWidth;
    }
    if(Button && Button.length > 0){
      buttonCount = Button.length;
      minWidth = minWidth + 1 * buttonCount; //button数より、buttonTableのminWidth取得
      if(minWidth !== 0){
        targetFooterTable.css('min-width',minWidth);
      }
    }
    if(footerButtonTableWidth && footerButtonTableWidth > 0){
      var footerButtonPrevWdith = "calc(100% - " + footerButtonTableWidth + "px)";
      targetFooterTable.parent('div').css('width',footerButtonTableWidth).prev('div').css('width',footerButtonPrevWdith);
    }
    //400JSPと403JSPのfooterを統合する
    targetFooterTable.parent('div').prev('div').css('padding-top', '15px').css('position', 'fixed');
    
    
  });
  
  //radioデフォルトチェック状態する

  
  //空白行処理
  var list = $(screenId).find('.expj-tab-contants').children('div');
  for (var i = 0; i < list.length; i++) {
    if (i % 2 === 0) {
      var target = $(list[i]);
      if (target.css('height') !== '5px') {
        target.before('<div class="expj-tr" style="height:5px;"></div>');
        target.css('height','');
      }
    }
  }
  
  // disabledのラジオボタン、チェックボックスのラベルをグレーにする
  $(screenId).find('label').each(function () {
    var targetId = this.htmlFor;
    var target = document.getElementById(targetId);
    if (target !== null) {
      if (target.disabled) {
        $(this).addClass('expj-disabled-label');
      } else {
        $(this).removeClass('expj-disabled-label');
      }
    }
  });
};

// ========================================================
// UI
// ========================================================
/**
 * コンボボックス展開時、キーで選択項目のフォーカス移動を可能にする関数。
 */
expj.common.ui.customizeSelect = function (screenId) {
  $(screenId).find('select').bind('keydown', function (event) {
    var inputChar = event.key; //event.charはchrome非対応
    var keyCode = event.keyCode;
    var target = $(this);
    console.log('keyCode = ' + keyCode);
    // スペース、Enter、Tabキーは通常の動作、追加：↓キー、↑キー
    if (keyCode === 32 || keyCode === 9 || keyCode === 13 || keyCode === 40 || keyCode === 38) {
      return true;
    }
    // 文字以外（スペース除く）の場合何もしない
    if(!inputChar) {
      return true;
    }
  
    var selectObj = event.target;
    var selectedIndex = selectObj.selectedIndex;
    
    var sorted = [];
    var keys = [];
    var obj,label,c;
    
    var i, j, len;
    // 選択されたindexが先頭のindex配列を作成。同時に頭文字取得。
    for(i = 0, j = selectedIndex, len = selectObj.length; i < len; i++) {
      obj = selectObj[j];
      label = obj.label;
      
      sorted.push(j);
      
      if(label.length < 1) {
        keys.push("");
      }else{
        c = label.charAt(0);
        keys.push(toAscLower(c));
      }
      
      j++;
      //選択indexから順に、最後までいったら最初に戻る
      if (j===len) { j = 0; }
    }
    
    inputChar = toAscLower(inputChar);
    
    // 入力とソート済みラベルイニシャルのマッチング
    var key;
    for (i = 0, len = keys.length; i < len; i++) {
      key = keys[i];
      if(key === inputChar) {
        // 選択中のラベルイニシャルの場合先頭スキップ
        if(i === 0) {
          continue;
        }
        selectObj.selectedIndex = sorted[i];
        target.change(); // selectにchangeイベント登録
        break;
      }
    }
    event.preventDefault();
    return true;
  });
  
  // 全角半角変換→小文字
  function toAscLower(c) {
    if (c.charCodeAt(0) > 0xFEE0) {
      c = String.fromCharCode(c.charCodeAt(0) - 0xFEE0);
    }
    return c.toLowerCase();
  }
};

expj.common.ui.focusFirstComponent = function (screenId) {
  var list = $('#expj-business-screen-tabs-body-' + screenId).find('.' + screenId + '-focus-move');
  for (var i = 0, len = list.length; i < len; i++) {
    var target = list[i];
    if (target.disabled) {
      continue;
    }
    if (target.nodeName === 'INPUT') {
      if (target.type === 'radio') {
        if (!target.checked) {
          continue;
        }
      }
    }

    if (target.nodeName === 'INPUT' && target.type == 'text') {
        let kindType = target.kindData.kind;
        if(target.kindData !== "" && kindType.match(/OBT_INTEGER/) || kindType.match(/OBT_NUMBER/)){
            target.focus();
            break;
        }else{
            setTimeout(function(){target.focus();},50);
            break;
        }
    }else{
        setTimeout(function(){target.focus();},50);
        break;
    }
  }
};

/**
 * フォーカス移動制御の設定
 */
expj.common.ui.setupFocusMove = function(classNameOfTargetElements) {
  $(classNameOfTargetElements).keydown(function(e) {
    var key = e.keyCode;

    // エンターキーとタブキーの場合にフォーカス制御する
    if ((key === expj.common.ui.EXPJ_KEY_CODE_ESC) || ((key === expj.common.ui.EXPJ_KEY_CODE_TAB) && e.shiftKey)) {
      // ESCキー or シフトキー + タブキー : 逆方向フォーカス移動
      expj.common.ui.focusMoveBackward(this, classNameOfTargetElements);

      // 本来のイベント動作をさせない
      e.preventDefault();
    } else if ((key === expj.common.ui.EXPJ_KEY_CODE_ENTER) || (key === expj.common.ui.EXPJ_KEY_CODE_TAB)) {
      // エンターキー or シフトキー : 正方向フォーカス移動
      expj.common.ui.focusMoveForward(this, classNameOfTargetElements);

      // 本来のイベント動作をさせない
      e.preventDefault();
    }
  });
  var screenId = classNameOfTargetElements.substring(1, classNameOfTargetElements.indexOf('-'));
  $(classNameOfTargetElements).focus(function () {
    expj.common.focusPositionMap[screenId] = this;
  });
};

expj.common.ui.setupFocusMoveIframe = function(targetSelector, classNameOfTargetElements) {
  $(targetSelector).keydown(function(e) {
    var key = e.keyCode;

    // エンターキーとタブキーの場合にフォーカス制御する
    if ((key === expj.common.ui.EXPJ_KEY_CODE_ESC) || ((key === expj.common.ui.EXPJ_KEY_CODE_TAB) && e.shiftKey)) {
      // ESCキー or シフトキー + タブキー : 逆方向フォーカス移動
      expj.common.ui.focusMoveBackward(this, classNameOfTargetElements);

      // 本来のイベント動作をさせない
      e.preventDefault();
    } else if ((key === expj.common.ui.EXPJ_KEY_CODE_ENTER) || (key === expj.common.ui.EXPJ_KEY_CODE_TAB)) {
      // エンターキー or シフトキー : 正方向フォーカス移動
      expj.common.ui.focusMoveForward(this, classNameOfTargetElements);

      // 本来のイベント動作をさせない
      e.preventDefault();
    }
  });
  var screenId = classNameOfTargetElements.substring(1, classNameOfTargetElements.indexOf('-'));
  $(targetSelector).focus(function () {
    expj.common.focusPositionMap[screenId] = this;
  });
};

//ifram Radioのfocusセット
expj.common.ui.setupFocusMoveIframeRadio = function(targetSelectorRadio, screenId) {
  //radioデフォルトチェック状態する
  var oRadio = $(targetSelectorRadio);
  var radioGroupMap = {};
  var focusClass = screenId + "-focus-move";
  for(var i = 0, len = oRadio.length; i < len; i++){
    var oRadioName = oRadio[i].getAttribute("name");
    var groupMap = radioGroupMap[oRadioName];
    if (typeof(groupMap) === 'undefined' || groupMap === null) {
      groupMap = {};
      radioGroupMap[oRadioName] = groupMap;
    }
    var oRadioId = oRadio[i].getAttribute('id');
    groupMap[oRadioId] = oRadio[i];
  }
  for (var groupName in radioGroupMap) {
    var group = radioGroupMap[groupName];
    var checked = false;
    var id, radio;
    for (id in group) {
      radio = group[id];
      if (radio.checked) {
        checked = true;
        $(radio).addClass(focusClass);
        break;
      }
    }
    if (!checked) {
      checked = false;
      for (id in group) {
        radio = group[id];
        if (!radio.disabled) {
          radio.checked = true;
          checked = true;
          $(radio).addClass(focusClass);
          break;
        }
      }
      if (!checked) {
        for (id in group) {
          radio = group[id];
          radio.checked = true;
          $(radio).addClass(focusClass);
          break;
        }
      }
    }

    //radioのfocus用class追加削除処理
    for (id in group) {
      radio = group[id];
      $(radio).change(function () {
        var group = radioGroupMap[this.name];
        for (var inId in group) {
          var inRadio = group[inId];
          var obj = $(inRadio);
          if (inRadio.checked) {
            obj.addClass(focusClass).bind('keydown.radio', function(e) {
              var key = e.keyCode;
              // エンターキーとタブキーの場合にフォーカス制御する
              if ((key === expj.common.ui.EXPJ_KEY_CODE_ESC) || ((key === expj.common.ui.EXPJ_KEY_CODE_TAB) && e.shiftKey)) {
                // ESCキー or シフトキー + タブキー : 逆方向フォーカス移動
                expj.common.ui.focusMoveBackward(this, '.' + focusClass);
                // 本来のイベント動作をさせない
                e.preventDefault();
              } else if ((key === expj.common.ui.EXPJ_KEY_CODE_ENTER) || (key === expj.common.ui.EXPJ_KEY_CODE_TAB)) {
                // エンターキー or シフトキー : 正方向フォーカス移動
                expj.common.ui.focusMoveForward(this, '.' + focusClass);
                // 本来のイベント動作をさせない
                e.preventDefault();
              }
            });
          } else if (!inRadio.checked) {
            obj.removeClass(focusClass).unbind('keydown.radio');
          }
        }
      });
    }
  }
};

expj.common.ui.setupFocusMovePeekerDetailWindow = function(targetSelector, classNameOfTargetElements) {
  $(targetSelector).keydown(function(e) {
    var key = e.keyCode;

    // エンターキーとタブキーの場合にフォーカス制御する
    if ((key === expj.common.ui.EXPJ_KEY_CODE_ESC) || ((key === expj.common.ui.EXPJ_KEY_CODE_TAB) && e.shiftKey)) {
      // ESCキー or シフトキー + タブキー : 逆方向フォーカス移動
      expj.common.ui.focusMoveBackward(this, classNameOfTargetElements);

      // 本来のイベント動作をさせない
      e.preventDefault();
    } else if ((key === expj.common.ui.EXPJ_KEY_CODE_ENTER) || (key === expj.common.ui.EXPJ_KEY_CODE_TAB)) {
      // エンターキー or シフトキー : 正方向フォーカス移動
      expj.common.ui.focusMoveForward(this, classNameOfTargetElements);

      // 本来のイベント動作をさせない
      e.preventDefault();
    }
  });
  var screenId = classNameOfTargetElements.substring(1, classNameOfTargetElements.indexOf('-'));
  $(targetSelector).focus(function () {
    expj.common.focusPositionMap[screenId] = this;
  });
};

/**
 * フォーカス移動制御(正方向)
 */
expj.common.ui.focusMoveForward = function(obj, classNameOfTargetElements) {
  // フォーカス移動対象クラスが設定されている要素の数を取得
  var elementCount = $(classNameOfTargetElements).size();

  // キーが押された時にフォーカスが当たっていた要素のindexを取得する
  var indexOld = $(classNameOfTargetElements).index(obj);

  // キーが押された時にフォーカスが当たっていた要素の次要素のindexを取得する
  var index = indexOld + 1;

  // 次の要素を取得する
  var nextEl;
  if (index > elementCount - 1) {
    // 最後の要素まで到達したので先頭へ戻る
    index = 0;
  } 
  classNameOfTargetElements = classNameOfTargetElements.substr(1);
  nextEl = $((document.getElementsByClassName(classNameOfTargetElements))[index]);

  // キーが押された時にフォーカスが当たっていた要素を取得する
  //var oldEl = $((document.getElementsByClassName(classNameOfTargetElements))[indexOld]);

  // disabledな要素をskipする
  var disabledCount = 0;
  while (nextEl.prop("disabled")) {
    disabledCount++;
    index++;
    if (index > elementCount - 1) {
      // 最後の要素まで到達したので先頭へ戻る
      index = 0;
    }
    nextEl = $((document.getElementsByClassName(classNameOfTargetElements))[index]);

    // 一周して全部disabledだった場合は無限ループするので脱出
    if (disabledCount == elementCount) {
      return;
    }
  }
  
  if (!nextEl.is(':visible')) {
    var parentNode = nextEl.parent();
    while (parentNode !== null && parentNode.attr('role') !== 'tabpanel') {
      parentNode = parentNode.parent();
    }
    if (parentNode !== null) {
      var tabAreaId = parentNode.attr('id');
      while (parentNode !== null && !parentNode.hasClass('ui-tabs')) {
        parentNode = parentNode.parent();
      }
      if (parentNode !== null) {
        var target = parentNode.find('a[href="#' + tabAreaId + '"]');
        target.click();
      }
    }
  }

  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE){
    if(obj.setSelectionRange) {
      obj.setSelectionRange(obj.value.length, obj.value.length);
    }
  }

  // 確定した要素へフォーカスをセットする
  //テキストボックス、文字全選択
  if(expj.common.config.textInputSelectAllFLG == true && nextEl.get(0).tagName === 'INPUT' && nextEl.get(0).getAttribute('type') === 'text'){
    nextEl.focus(function(){
      $(this).select();
    });
    nextEl.select();
  } else {
    nextEl.focus();
  }
  
  if (nextEl.tagName === 'INPUT' && nextEl.getAttribute('type') === 'text') {
    expj.common.pscript.kind.tab = true;
  }
  
};

/**
 * フォーカス移動制御(逆方向)
 */
expj.common.ui.focusMoveBackward = function(obj, classNameOfTargetElements) {
  // フォーカス移動対象クラスが設定されている要素の数を取得
  var elementCount = $(classNameOfTargetElements).size();

  // キーが押された時にフォーカスが当たっていた要素の要素indexを取得する
  var indexOld = $(classNameOfTargetElements).index(obj);
  
  // キーが押された時にフォーカスが当たっていた要素の前の要素indexを取得する
  var index = indexOld - 1;

  // 次の要素を取得する
  var nextEl;
  if (index < 0) {
    // 先頭の要素まで到達したので最終要素へ戻る
    index = elementCount - 1;
  }
  classNameOfTargetElements = classNameOfTargetElements.substr(1);
  nextEl = $((document.getElementsByClassName(classNameOfTargetElements))[index]);
  
  // キーが押された時にフォーカスが当たっていた要素を取得する
  //var oldEl = $((document.getElementsByClassName(classNameOfTargetElements))[indexOld]);

  // disabledな要素をskipする
  var disabledCount = 0;
  while (nextEl.prop("disabled")) {
    disabledCount++;
    index--;
    if (index < 0) {
      // 先頭の要素まで到達したので最終要素へ戻る
      index = elementCount - 1;
    }
    nextEl = $((document.getElementsByClassName(classNameOfTargetElements))[index]);
    // 一周して全部disabledだった場合は無限ループするので脱出
    if (disabledCount == elementCount) {
      return;
    }
  }

  if (!nextEl.is(':visible')) {
    var parentNode = nextEl.parent();
    while (parentNode !== null && parentNode.attr('role') !== 'tabpanel') {
      parentNode = parentNode.parent();
    }
    if (parentNode !== null) {
      var tabAreaId = parentNode.attr('id');
      while (parentNode !== null && !parentNode.hasClass('ui-tabs')) {
        parentNode = parentNode.parent();
      }
      if (parentNode !== null) {
        var target = parentNode.find('a[href="#' + tabAreaId + '"]');
        target.click();
      }
    }
  }

  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE){
    if(obj.setSelectionRange) {
      obj.setSelectionRange(obj.value.length, obj.value.length);
    }
  }

  // 確定した要素へフォーカスをセットする
  //テキストボックス、文字全選択
  if(expj.common.config.textInputSelectAllFLG == true && nextEl.get(0).tagName === 'INPUT' && nextEl.get(0).getAttribute('type') === 'text'){
    nextEl.focus(function(){
      $(this).select();
    });
    nextEl.select();
  } else {
      nextEl.focus();
  }
  
  if (nextEl.tagName === 'INPUT' && nextEl.getAttribute('type') === 'text') {
    expj.common.pscript.kind.tab = true;
  }
};

// ========================================================
// ツールチップ
// ========================================================

/**
 * オンマウスしてからツールチップを表示するまでの時間（ミリ秒）
 */
expj.common.ui.tooltip.waitTime = 500;
/**
 * ツールチップの表示位置オフセット（左）
 */
expj.common.ui.tooltip.leftOffset = 0;
/**
 * ツールチップ表示位置オフセット（右）
 */
expj.common.ui.tooltip.topOffset = 0;

/**
 * Datatablesのセル用ツールチップ。<br>
 * セルにマウスカーソルを当てると、セル内に表示しきれない場合は、内容をツールチップで表示する。<br>
 * ただし、Datatablesのセルにはexpj-tooltipクラスを与える必要がある。<br>
 * @param id         Datatablesを実装したtableタグのラッパーdivタグのID
 */
expj.common.ui.tooltip.create = function (id) {
  // イベント追加用のセレクターを生成
  var selector = '#' + id + ' td.expj-tooltip';
  // bodyタグ内にツールチップ用divタグが存在していないか確認する
  var space = document.getElementById('expj-tooltip-instance');
  if (space === null) {
    // divタグが無い場合は、新しく生成する
    var obj = $('<div id="expj-tooltip-instance" style="white-space:normal">');
    obj.appendTo('body');
    // 変数に登録する
    expj.common.ui.tooltip.tooltipSpace = obj;
  } else if (expj.common.ui.tooltip.tooltipSpace === null) {
    // divタグが存在しているかつ、変数に登録されていない場合、変数に登録する
    expj.common.ui.tooltip.tooltipSpace = $(space);
  }
  // Datatablesのセルにイベントを追加する
  $(selector).on({
    'mouseenter' : function () {
      // 対象のtdタグのオフセット値を基にキーを作成する
      var position = $(this).offset();
      var positionKey = Math.round(position.left) + '-' + Math.round(position.top);
      // 管理テーブルにキーと表示状態を格納する
      expj.common.ui.tooltip.manageTable[positionKey] = true;
      // 時間差でツールチップ表示関数を呼び出す
      setTimeout(expj.common.ui.tooltip.tooltipView, expj.common.ui.tooltip.waitTime, this, positionKey, expj.common.ui.tooltip.leftOffset, expj.common.ui.tooltip.topOffset);
    },
    'mouseleave' : function () {
      // 対象のtdタグのオフセット値を基にキーを作成する
      var position = $(this).offset();
      var positionKey = Math.round(position.left) + '-' + Math.round(position.top);
      // 管理テーブルをfalseにする
      expj.common.ui.tooltip.manageTable[positionKey] = false;
      // ツールチップを非表示にする
      expj.common.ui.tooltip.tooltipSpace.css('display', 'none');
      // テーブルからデータを削除する
      delete expj.common.ui.tooltip.manageTable[positionKey];
    }
  });
};
/**
 * ツールチップ表示対象のセルを管理するテーブル<br>
 * key : String、value : boolean
 */
expj.common.ui.tooltip.manageTable = {};

/**
 * ツールチップを実現するdivタグのオブジェクトを格納する変数<br>
 */
expj.common.ui.tooltip.tooltipSpace = null;

/**
 * ツールチップを表示する関数。<br>
 * @param target     対象のtdタグ
 * @param key        対象のtdタグを示す管理テーブルのキー
 * @param leftOffset ツールチップの表示位置(セルの左上から相対的なX座標指定)
 * @param topOffset  ツールチップの表示位置(セルの左上から相対的なY座標指定)
 */
expj.common.ui.tooltip.tooltipView = function (target, key, leftOffset, topOffset) {
  // 管理テーブルをチェックする
  // 既にmouseleave済みの場合処理を終了する
  if (expj.common.ui.tooltip.manageTable[key] === true) {
    // 二重表示回避のため、falseを設定する
    expj.common.ui.tooltip.manageTable[key] = false;
    // 対象のtdタグのテキストを取得する
    var obj = $(target);
    var childObj = obj.context.firstChild;
    if (childObj === null) {
      childObj = obj.context;
    }
    var text = '';
    if (childObj.nodeName === '#text') {
      text = childObj.nodeValue;
    } else if (childObj.nodeName === 'SPAN') {
      text = childObj.textContent;
    } else if (childObj.nodeName === 'SELECT') {
      text = childObj[childObj.selectedIndex].label;
    } else if (childObj.nodeName === 'INPUT') {
      if (childObj.type === 'text') {
        text = childObj.value;
      }
    } else if (childObj.nodeName === 'TD') {
      text = childObj.innerText;
    }
    // テキストが空の場合、ツールチップ表示を中止する
    if (text === '') {
      delete expj.common.ui.tooltip.manageTable[key];
      return;
    }

    // ツールチップ表示位置を調整する
    var position = obj.offset();
    var left = position.left + leftOffset;
    var top = position.top + topOffset;
    var tooltip = expj.common.ui.tooltip.tooltipSpace;
    
    // テキストを挿入
    tooltip.text(text);
    tooltip.css('display', '');
    
    // 表の列上のテキストが完全に表示できている場合はツールチップの表示を中止する。
    if (obj.outerWidth() - 15 > tooltip.outerWidth()) {
      tooltip.css('display', 'none');
      return;
    }

    //xy
    if (top - tooltip.outerHeight() > 0) {
      tooltip.css('top', (top - tooltip.outerHeight()) + 'px');
    } else {
      tooltip.css('top', (top + obj.outerHeight()) + 'px');
    }
    if((left + tooltip.outerWidth()) > $(window).width()) {
      tooltip.css('left', ($(window).width() - tooltip.outerWidth()) + 'px');
    } else if (left < 0) {
      tooltip.css('left', '0px');
    } else {
      tooltip.css('left', left + 'px');
    }
  }
};
