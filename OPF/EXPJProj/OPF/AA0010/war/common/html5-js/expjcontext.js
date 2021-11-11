//========================================================
// コンテキストメニュー
//========================================================
// 名前空間チェック
if (typeof(expj) === 'undefined' || expj === null) {
  var expj = {};
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
expj.common.version.expjcontext = 'expjcontext.js Ver1.0.6';

/**
 * コンテキストメニュー用名前空間の定義
 */
var _expj_contextMenu = {};

/**
 * コンテキストメニュー起動対象のコンポーネントを指す
 */
_expj_contextMenu.targetComponent = null;

/**
 * コンテキストメニューの初期化関数
 */
_expj_contextMenu.init = function () {
  // bodyタグ配下のノードに対して、オリジナルのコンテキストメニュー関数を設定する
  $('body').on('contextmenu', (function (e) {
    // TREEにはオリジナルの右クリックメニューがあるので対象から除外する
    var target = e.target;
    while (target !== null) {
      // 右クリックした範囲がツリー部品だった時はループを脱出
      if ($(target).hasClass('expj-datagrid-tree')) {
        break;
      }
      // 右クリックした範囲がコンテキストメニューの場合は右クリックイベントを終了する
      if ($(target).hasClass('ui-contextmenu')) {
        return false;
      }
      target = target.parentNode;
    }
    
    // 右クリックした範囲がツリー部品だった時は、この分岐内に入る
    if (target !== null) {
      // コンテキストメニューエリアが表示状態（事前に他のコンテキストメニューが表示されている）の場合は、コンテキストメニューエリアを削除し、右クリック情報も削除する
      $('#expj-main-contextMenu').remove();
      if (_expj_contextMenu.targetComponent !== null) {
        _expj_contextMenu.targetComponent.isContextMenu = false;
        _expj_contextMenu.targetComponent = null;
      }
      // TREEオリジナルの右クリックメニューを起動するために、trueでイベントを終了する
      return true;
    }
    
    // Google Chrome と Edge 対応
    if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome || com.nec.jp.orteus.utils.ClientInfo.browser.isEdge) {
      var targetElement = e.target;
      var nodeName = targetElement.nodeName;
      if (nodeName === 'TEXTAREA' && targetElement.disabled === false) {
        // 右クリック対象がテキストエリアの時は、disabled=trueで無ければネイティブコンテキストメニューの表示を許可する
        return true;
      } else if (nodeName === 'INPUT') {
        var type = targetElement.type;
        if ((type === 'text' || type === 'password') && targetElement.disabled === false) {
          // 右クリック対象がテキストフィールドまたはパスワードフィールドの時は、disabled=trueで無ければネイティブコンテキストメニューの表示を許可する
          return true;
        }
      } else if (nodeName === 'SELECT' || nodeName === 'BUTTON' || nodeName === 'IMG' || nodeName === 'A') {
        // プルダウン、ボタン、イメージ、アンカーは対象外
        return false;
      }
      // それ以外の場合は、文字列の選択確認を行う
      var selectObj = window.getSelection();
      var text = selectObj.toString();
      // 文字列が1文字以上選択状態の時はネイティブコンテキストメニューの表示を許可する
      // 文字列未選択状態の時はコンテキストメニューを表示しない。
      return text.length > 0;
    }
    
    // ===================
    // 以降はIE11のみ通過する
    // ===================
    
    // TREE部品以外の場合はオリジナルコンテキストメニューを設定する
    
    target = e.target;
    
    var nodeName = target.nodeName;
    var flg = true;
    if (nodeName === 'TEXTAREA' && target.disabled === false) {
      flg = false;
    } else if (nodeName === 'INPUT') {
      var type = target.type;
      if ((type === 'text' || type === 'password') && target.disabled === false) {
        flg = false;
      }
    }
    if (flg) {
      // それ以外の場合は、文字列の選択確認を行う
      if (typeof(target.selectionEnd) === 'number' && target.selectionEnd > 0) {
        flg = false;
      } else {
        var selectObj = window.getSelection();
        var text = selectObj.toString();
        // 文字列が1文字以上選択状態の時はネイティブコンテキストメニューの表示を許可する
        // 文字列未選択状態の時はコンテキストメニューを表示しない。
        flg = !(text.length > 0);
      }
    }
    if (flg) {
      return false;
    }
    
    // 対象コンポーネントを設定
    _expj_contextMenu.targetComponent = target;
    // コンポーネントに対し、右クリック状態を設定
    target.isContextMenu = true;
    
    // コンテキストメニュー表示中にEsc、Enter、Tabキーが押された時の対策を行う
    // 上記3つのキーが押された時は、コンテキストメニューを閉じ、通常の処理を行う
    // それ以外のキーは無効化する
    $(window).on('keydown.context', function (event) {
      // コンテキストメニューが表示状態か、確認する
      var menuArea = document.getElementById('expj-main-contextMenu');
      if (menuArea !== null) {
        // コンテキストメニューが表示状態の時、押されたキーコードを確認する
        if (event.keyCode === 9 || event.keyCode === 13 || event.keyCode === 27) {
          // 押されたキーがEsc、Enter、Tabの時はコンテキストメニューを非表示にする
          $(menuArea).remove();
          // 右クリック情報を保持している場合、削除する
          if (_expj_contextMenu.targetComponent !== null) {
            // コンポーネントに与えられたコンテキストメニューフラグを削除する
            delete _expj_contextMenu.targetComponent.isContextMenu;
            // 右クリック起動コンポーネント情報をクリアする
            _expj_contextMenu.targetComponent = null;
          }
          // キー対策イベント（自分自身を削除する
          $(window).off('keydown.context');
          return true;
        } else {
          // それ以外のキーは無効化する
          return false;
        }
      }
      // 非表示の場合、何もしないでtrueを返却する
      return true;
    });
    
    var selectedText = '';
    var position = 0;
    
    // 選択中の文字を取得する
    if (typeof(target.selectionEnd) === 'number') {
      selectedText = target.value.substring(target.selectionStart, target.selectionEnd);
      position = target.selectionStart;
    } else if (window.getSelection()) {
      selectedText = getSelectionText();
    }
    
    // コンテキストメニューを表示する
    showContextMenu(e, selectedText, target, position);
    // Magical line to turn off the native contextMenu.
    return false;
  }));
  
  // コンテキストメニュー領域以外の場所をクリックした際にコンテキストメニューをクローズするイベントを定義
  $('body').on('click', (function (e) {
    // Chromeの場合、必要ないので終了
    if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
      return;
    }
    // コンテキストメニューが表示されているか確認。非表示の場合、終了
    var menuArea = document.getElementById('expj-main-contextMenu');
    if (menuArea === null) {
      return;
    }
    // クリックしたオブジェクトのIDでコンテキストメニュー内かそれ以外かを判定する。
    // コンテキストメニュー内の場合、終了
    if (e.target.parentNode.id === 'expj-main-contextMenu') {
      return;
    }
    
    $(window).off('keydown.context');
    // コンテキストメニュー外の場合はコンテキストメニューを削除する
    $(menuArea).remove();
    // 右クリック情報を保持している場合、削除する
    if (_expj_contextMenu.targetComponent !== null) {
      // コンポーネントに与えられたコンテキストメニューフラグを削除する
      delete _expj_contextMenu.targetComponent.isContextMenu;
      
      // クリックしたのがコンテキストメニュー起動コンポーネントではなく、かつ、コンテキストメニュー起動コンポーネントがdisabled=trueでない場合はそのコンポーネントのonDecisionを起動する
      if (_expj_contextMenu.targetComponent !== e.target && _expj_contextMenu.targetComponent.disabled === false) {
        $(_expj_contextMenu.targetComponent).blur();
      }
      
      // 右クリック起動コンポーネント情報をクリアする
      _expj_contextMenu.targetComponent = null;
    }
  }));
  
  /**
   * コンテキストメニュー表示関数
   * @param e            コンテキストメニューイベントオブジェクト
   * @param selectedText 選択中のテキスト
   * @param trigger      コンテキストメニュー起動オブジェクト
   * @param position     選択開始位置
   */
  function showContextMenu (e, selectedText, trigger, position) {
    if ($('#expj-main-contextMenu').length < 1) {
      // コンテキストメニュー領域がDOMに存在しない場合はDOM上にメニューHTMLを追加する
      var html = '' +
        '<ul class="ui-contextmenu ui-menu ui-widget ui-widget-content" id="expj-main-contextMenu">' +
        ' <li class="ui-menu-item" id="expj-contextmenu-cut">Cut</li>' + 
        ' <li class="ui-menu-item" id="expj-contextmenu-copy">Copy</li>' +
        ' <li class="ui-menu-item" id="expj-contextmenu-paste">Paste</li>' +
        ' <li class="ui-menu-item" id="expj-contextmenu-selectall">SelectAll</li>' +
        '</ul>'
      ;
      $('body').append(html);
      // コンテキストメニューの表示位置を指定する（基本的にはクリック地点の右下）
      $('#expj-main-contextMenu').css({
        'position' : 'absolute',
        'left' : e.pageX,
        'top' : e.pageY
      });
      // クリック地点が画面の右端の場合は、マウスカーソルの左に表示する
      if(window.innerWidth - e.clientX <= $('#expj-main-contextMenu').outerWidth()) {
        $('#expj-main-contextMenu').css('left', e.pageX - $('#expj-main-contextMenu').outerWidth());
      }
      // クリック地点が画面の下端の場合は、マウスカーソルの上に表示する
      if(window.innerHeight - e.clientY <= $('#expj-main-contextMenu').outerHeight()) {
        $('#expj-main-contextMenu').css('top', e.pageY - $('#expj-main-contextMenu').outerHeight());
      }
    } else {
      // コンテキストメニュー領域がDOM上に存在する場合はDOMから削除し、再度関数を呼び出す
      $('#expj-main-contextMenu').remove();
      showContextMenu(e, selectedText, trigger, position);
      return;
    }
    
    // 選択中のテキストが存在しない場合はカットとコピーを禁止する
    if(!selectedText || selectedText.length < 0) {
      $('#expj-contextmenu-cut').addClass('ui-state-disabled');
      $('#expj-contextmenu-copy').addClass('ui-state-disabled');
    }
    
    // 対象オブジェクトが有効なテキストフィールドでない場合は、カットとペーストを無効化する
    if (trigger.nodeName !== ('INPUT' || 'TEXTAREA') || trigger.type !== 'text' || trigger.disabled) {
      $('#expj-contextmenu-cut').addClass('ui-state-disabled');
      $('#expj-contextmenu-paste').addClass('ui-state-disabled');
    }
    
    // 対象オブジェクトがinput passwordの場合、カットとコピーを無効化する
    if (trigger.nodeName === 'INPUT' && trigger.type === 'password') {
      $('#expj-contextmenu-copy').addClass('ui-state-disabled');
      $('#expj-contextmenu-paste').removeClass('ui-state-disabled');
    }
    
    // クリップボードに何も存在しない場合は、ペーストを無効化する
    var clipboardData = window.clipboardData.getData("text");
    if(clipboardData === null || clipboardData.length < 1) {
      $('#expj-contextmenu-paste').addClass('ui-state-disabled');
    }
    
    // 選択中のテキストをコンテキストメニュー領域に保存する
    $('#expj-main-contextMenu').attr('selectedText', selectedText);
    
    // コンテキストメニューのリストがフォーカスされた時のアクションを設定する
    $('#expj-main-contextMenu li').hover((function (e) {
        $(e.target).addClass('ui-state-focus');
    }), (function (e) {
        $(e.target).removeClass('ui-state-focus');
    }));
    
    // コンテキストメニューのリストがクリックされた時のアクションを設定する
    $('#expj-main-contextMenu li').on('click', (function (e) {
      //クリック項目が選択不可の場合、終了する
      if($(e.target).hasClass('ui-state-disabled')) {
        return;
      }
      
      if (this.parentNode.id === 'expj-main-contextMenu') {
        bindContextMenu(e, $(trigger), position);
      }
      $('#expj-main-contextMenu').remove();
    }));
  }
  
  /**
   * コンテキストメニューのイベントを定義する関数
   * @param e        コンテキストメニューイベントオブジェクト
   * @param trigger  コンテキストメニュー起動オブジェクト
   * @param position 選択開始位置
   */
  function bindContextMenu (e, trigger, position) {
    // アクション名を取得
    var action = e.target.outerText;
    // 選択中のテキスト情報を取得
    var selectedText = $('#expj-main-contextMenu').attr('selectedText');
    
    if(action === 'Paste') {
      // ペーストイベント
      
      // クリップボードにデータない場合は終了する
      if(window.clipboardData.getData('text').length < 1) {
        return;
      }
      
      // ペースト先のカーソル位置を取得
      var pos = trigger.getCursorPosition();
      var str;
      if (trigger.context.selectionStart >= 0 && trigger.context.selectionEnd >= 0) {
        // ペースト先にテキスト選択情報がある場合
        
        // クリップボードのデータと対象のvalueを取得
        str = trigger.val();
        var winText = window.clipboardData.getData('text');
        // 選択情報を基にテキストを合体
        var text = str.slice(0, trigger.context.selectionStart) + winText + str.slice(trigger.context.selectionEnd);
        // テキストデータとカーソル情報を再設定する
        trigger.val(text);
        pos += winText.length;
        trigger.setCursorPosition(pos);
        
      } else if(position >= 0) {
        // ペースト先に選択情報がない場合
        // カーソルの位置にクリップボードの内容を貼り付ける
        str = trigger.val();
        trigger.val(
          str.slice(0, position) + 
          window.clipboardData.getData('text') + 
          str.slice(position)
        );
      } else {
        // それ以外の場合はペーストコマンドを実行する
        document.execCommand('paste', false, undefined);
      }
      // 書式を適用する、lengthチェック
      if (typeof(expj) !== 'undefined' && expj !== null) {
        expj.common.pscript.kind.checkInput(trigger.context);
        expj.common.pscript.controlTextLength(trigger.context);
      }
      return;
    }
    
    if(action === 'SelectAll') {
      // 選択イベント
      if (trigger.context.selectionEnd >= 0) { // it doesn't work in input somewhat if you use trigger.selectionEnd
        trigger.select();
      } else {
        var range = document.body.createTextRange();
        range.moveToElementText(trigger.context);
        range.select();
      }
      return;
    }
    
    window.clipboardData.setData('text', selectedText);
    switch(action){
      case 'Copy':
        document.execCommand('copy');
        break;
      case 'Cut':
        document.execCommand('cut');
        trigger.val(trigger.val().replace(selectedText, ""));
        break;
    }
    $(trigger.context).focus();
    return;
  }
  
  /**
   * 選択中のテキストを取得する関数
   */
  function getSelectionText() {
    // Selectionオブジェクトの取得
    // https://developer.mozilla.org/ja/docs/Web/API/Selection
    var selectObj = window.getSelection();
    // Selectionの始点ノードと終点ノード取得
    var targetNode = selectObj.anchorNode;
    var endNode = selectObj.focusNode;

    // 始点ノードまたは終点ノードが存在しない場合はSelectionオブジェクトの文字列を返却する
    if (targetNode === null || endNode === null || (endNode instanceof HTMLTableDataCellElement)) {
      return selectObj.toString();
    }

    // 始点と終点を求める
    var startPoint = selectObj.anchorOffset;
    var endPoint = selectObj.focusOffset;
    // 始点と終点の順番確認
    var targetNodeSourceIndex = targetNode.sourceIndex;
    if (!targetNodeSourceIndex) {
        targetNodeSourceIndex = targetNode.parentNode.sourceIndex;
    }
    var endNodeSourceIndex = endNode.sourceIndex;
    if (!endNodeSourceIndex) {
        endNodeSourceIndex = endNode.parentNode.sourceIndex;
    }
    if (targetNodeSourceIndex > endNodeSourceIndex) {
        var tmpNode = endNode;
        endNode = targetNode;
        targetNode = tmpNode;
        var temPoint = endPoint;
        endPoint = startPoint;
        startPoint = temPoint;
    }

    // 始点ノードと終点ノードが同一ノードで、始点と終点も同じ場合、選択無しとして空文字を返却
    if (targetNode === endNode && startPoint === endPoint) {
      return '';
    }
    // 返却するテキスト変数
    var text = '';
    
    if (targetNode === endNode) {
      // 始点ノードと終点ノードが同じ場合の処理
      if (targetNode.nodeName === '#text') {
        // テキストオブジェクトの場合、選択中のテキストを返却する
        return targetNode.data.substring(startPoint, endPoint);
      } else {
        return '';
      }
    }
    
    if (targetNode.nodeName === '#text') {
      // 始点がテキストオブジェクトの場合、選択文字列の始点からテキストの終点までをテキスト変数に格納する
      var data = targetNode.data;
      text += data.substring(startPoint, data.length) + '\t';
      // 次のノードを探索
      targetNode = getNextNode(targetNode);
    }
    // 終点ノードまたはnullになるまで探索を続ける
    while (targetNode !== endNode) {
      if (targetNode === null) {
        break;
      }
      if (targetNode.nodeName === '#text') {
        if (!targetNode.data.match(/^[\n\u0020]+/)) {
          // 探索対象ノードがテキストオブジェクトの場合、テキストをテキスト変数に追加する
          text += targetNode.data + '\t';
        }
      } else if (targetNode.nodeName === 'SCRIPT') {
        // SCRIPTタグの場合、次のノード（テキストオブジェクト）をスキップする
        targetNode = getNextNode(targetNode);
      } else if (targetNode.nodeName === 'BUTTON') {
        // BUTTONタグの場合、次のノード（テキストオブジェクト）をスキップする
        targetNode = getNextNode(targetNode);
      } else if (targetNode.nodeName === 'SELECT') {
        text += targetNode[targetNode.selectedIndex].innerText + '\t';
        targetNode = getLastChildNode(targetNode);
      } else if (targetNode.nodeName === 'INPUT') {
        var inputType = targetNode.getAttribute('type');
        if (inputType === 'text') {
          text += targetNode.value + '\t';
        } else if (inputType === 'password') {
          for (var i = 0; i < targetNode.value.length; i++) {
            text += '*';
          }
          text += '\t';
        }
      } else if (targetNode.nodeName === 'DIV') {
        var classValue = targetNode.getAttribute('class');
        if (classValue === 'div-tr') {
          text += '\n';
        }
      }
      // 次のノードを探索する
      targetNode = getNextNode(targetNode);
    }
    if (targetNode !== null && targetNode.nodeName === '#text') {
      // 終点がテキストオブジェクトの場合、文字列の始点から選択文字列の終点までをテキスト変数に格納する
      text += targetNode.data.substring(0, endPoint);
    }
    // テキスト変数の値を返却する
    return text;
  }
  
  /**
   * 引数で指定したノードの次のノードを取得する関数
   * 対象が子ノードを持っている場合は先頭の子ノードを返却する
   * 対象がその親ノードの最終要素の場合は次の親ノードを返却する
   * 親ノードが存在しない場合はnullを返却する
   */
  function getNextNode(target) {
    // 子ノードを持つ場合は先頭の子ノードを返却
    if (target.childNodes.length > 0) {
      return target.childNodes[0];
    }
    // 次のノードを探索
    return getParentNextNode(target);
  }
  
  function getLastChildNode(target) {
    var count = target.childNodes.length;
    if (count === 0) {
      return target;
    }
    return getLastChildNode(target.childNodes[count - 1]);
  }
  
  /**
   * 引数で指定したノードの次のノードを探索する関数。
   * この関数は再帰でできており、親ノード中に次ノードが見つからない場合は、更に上の親を探索する。
   * 親ノードが見つからない場合はnullを返却する
   */
  function getParentNextNode(target) {
    // 親ノードを取得する
    // 親ノードが存在しない場合はnullを返却する
    var parent = target.parentNode;
    if (parent === null) {
      return null;
    }
    // 親ノードが持つ子ノードをひとつずつ探索する
    for (var i = 0; i < parent.childNodes.length; i++) {
      var t = parent.childNodes[i];
      // 対象のノードを発見した場合は次の要素が存在するか確認する。
      // 存在する場合はそのノードを返却する
      if (t === target && i + 1 < parent.childNodes.length) {
        return parent.childNodes[i + 1];
      }
    }
    // 対象ノードの次ノードが親ノード中に存在しない場合は、さらに上の親を探索する
    return getParentNextNode(parent);
  }
};

// オリジナルコンテキストメニューの初期化関数起動
$(function () {
  _expj_contextMenu.init();
});