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
 * バージョン管理用
 */
expj.common.version.expjpscript = 'expjpscript.js Ver1.0.24';

/**
 * EXPLANNER/J(HTML5版)のPスクリプト処理部品用名前空間<br>
 */
expj.common.pscript = {};

expj.common.pscript.stopDecisionFlg = false;

expj.common.pscript.checkDateValue = function (textContent) {
  var patternYMD    = /^\d{4}\/\d{1,2}\/\d{1,2}$/g;
  var patternYM     = /^\d{4}\/\d{1,2}$/g;
  var patternYMDHms = /^\d{4}\/\d{1,2}\/\d{1,2} \d{2}:\d{2}:\d{2}$/g;
  var patternMD     = /^\d{1,2}\/\d{1,2}$/g;
  if (textContent.match(patternYMD)) {
    return + moment(textContent, 'YYYY/MM/DD');
  } else if (textContent.match(patternYM)) {
    return + moment(textContent, 'YYYY/MM');
  } else if (textContent.match(patternYMDHms)) {
    return + moment(textContent, 'YYYY/MM/DD HH:mm:ss');
  } else if (textContent.match(patternMD)) {
    return + moment(textContent, 'MM/DD');
  } else {
    return textContent;
  }
};

/**
 * 引数で与えられたテキストからスラッシュを取り除く関数。<br>
 * PスクリプトのCHK系アクションの大小比較演算で使用される。<br>
 * @param textContent テキスト
 * @returns スラッシュを取り除いた数値
 */
expj.common.pscript.convertNumber = function (textContent) {
  var result;
  if (typeof(textContent) === 'string') {
    result = expj.common.pscript.checkDateValue(textContent);
    if (typeof(result) === 'number') {
      return result;
    }
    if (result === '') {
      return result;
    }
    if (isNaN(result)) {
      return result;
    }
    return Number(result);
  } else if (typeof(textContent) === 'number') {
    // 引数が数値の場合はそのまま返却
    return textContent;
  } else if (Array.isArray(textContent)) {
    // 引数が配列の場合、配列の中身を数値化して返却する
    result = [];
    for (var i = 0, len = textContent.length; i < len; i++) {
      result.push(this.convertNumber(textContent[i]));
    }
    return result;
  } else {
    // それ以外はNaNを返却する
    return Number.NaN;
  }
};

/**
 * Pスクリプトの比較式の評価関数
 * @param leftOp 左辺のデータ
 * @param operator 評価式
 * @param rightOp 右辺のデータ
 * @returns {Boolean} 真偽値
 */
expj.common.pscript.evaluate = function (leftOp, operator, rightOp) {
  if (leftOp === null || rightOp === null) {
    console.log('コンポーネント参照で指定されたコンポーネントが存在していません。');
    return false;
  }
  var leftType = typeof(leftOp);
  var rightType = typeof(rightOp);
  if (leftType === 'boolean' && rightType === 'boolean') {
    leftOp = String(leftOp);
    rightOp = String(rightOp);
    leftType = typeof(leftOp);
    rightType = typeof(rightOp);
  } else if (leftType === 'boolean' && rightType === 'string') {
    leftOp = String(leftOp);
    leftType = typeof(leftOp);
    var rightTmp = rightOp.toLowerCase();
    if (rightTmp === 'true' || rightTmp === '1') {
      rightOp = 'true';
    } else {
      rightOp = 'false';
    }
  } else if (leftType === 'string' && rightType === 'boolean') {
    rightOp = String(rightOp);
    rightType = typeof(rightOp);
    var leftTmp = leftOp.toLowerCase();
    if (leftTmp === 'true' || leftTmp === '1') {
      leftOp = 'true';
    } else {
      leftOp = 'false';
    }
  }
  var i, len;
  if (leftType === 'string' && rightType === 'string') {
    switch (operator) {
    case '[eq]':
      return leftOp === rightOp;
    case '[neq]':
      return leftOp !== rightOp;
    case '[numeq]':
      return true;
    case '[numneq]':
      return false;
    case '[lt]':
      if (leftOp === '' && rightOp === '') {
        return false;
      } else if (leftOp !== '' && rightOp === '') {
        return true;
      } else if (leftOp === '' && rightOp !== '') {
        return false;
      } else {
        return leftOp < rightOp;
      }
      break;
    case '[lte]':
      if (leftOp === '' && rightOp === '') {
        return true;
      } else if (leftOp !== '' && rightOp === '') {
        return true;
      } else if (leftOp === '' && rightOp !== '') {
        return false;
      } else {
        return leftOp <= rightOp;
      }
      break;
    case '[gt]':
      if (leftOp === '' && rightOp === '') {
        return false;
      } else if (leftOp !== '' && rightOp === '') {
        return false;
      } else if (leftOp === '' && rightOp !== '') {
        return true;
      } else {
        return leftOp > rightOp;
      }
      break;
    case '[gte]':
      if (leftOp === '' && rightOp === '') {
        return true;
      } else if (leftOp !== '' && rightOp === '') {
        return false;
      } else if (leftOp === '' && rightOp !== '') {
        return true;
      } else {
        return leftOp >= rightOp;
      }
    }
  } else if (leftType === 'number' && rightType === 'number') {
    switch (operator) {
    case '[numeq]':
      return leftOp === rightOp;
    case '[numneq]':
      return leftOp !== rightOp;
    case '[lt]':
      return leftOp < rightOp;
    case '[lte]':
      return leftOp <= rightOp;
    case '[gt]':
      return leftOp > rightOp;
    case '[gte]':
      return leftOp >= rightOp;
    case '[eq]':
      return leftOp === rightOp;
    case '[neq]':
      return leftOp !== rightOp;
    }
  } else if (leftType === 'number' && rightType === 'string') {
    switch (operator) {
    case '[eq]':
      return String(leftOp) === rightOp;
    case '[neq]':
      return String(leftOp) !== rightOp;
    case '[numeq]':
      if (rightOp === '') {
        return false;
      }
      return leftOp === Number(rightOp);
    case '[numneq]':
      if (rightOp === '') {
        return true;
      }
      return leftOp !== Number(rightOp);
    case '[lt]':
      if (rightOp === '') {
        return true;
      } else if (isNaN(rightOp)) {
        return true;
      }
      return leftOp < Number(rightOp);
    case '[lte]':
      if (rightOp === '') {
        return true;
      } else if (isNaN(rightOp)) {
        return true;
      }
      return leftOp <= Number(rightOp);
    case '[gt]':
      if (rightOp === '') {
        return false;
      } else if (isNaN(rightOp)) {
        return false;
      }
      return leftOp > Number(rightOp);
    case '[gte]':
      if (rightOp === '') {
        return false;
      } else if (isNaN(rightOp)) {
        return false;
      }
      return leftOp >= Number(rightOp);
    }
  } else if (leftType === 'string' && rightType === 'number') {
    switch (operator) {
    case '[eq]':
      return leftOp === String(rightOp);
    case '[neq]':
      return leftOp !== String(rightOp);
    case '[numeq]':
      if (leftOp === '') {
        return false;
      }
      return Number(leftOp) === rightOp;
    case '[numneq]':
      if (leftOp === '') {
        return true;
      }
      return Number(leftOp) !== rightOp;
    case '[lt]':
      if (leftOp === '') {
        return false;
      } else if (isNaN(leftOp)) {
        return false;
      }
      return Number(leftOp) < rightOp;
    case '[lte]':
      if (leftOp === '') {
        return false;
      } else if (isNaN(leftOp)) {
        return false;
      }
      return Number(leftOp) <= rightOp;
    case '[gt]':
      if (leftOp === '') {
        return true;
      } else if (isNaN(leftOp)) {
        return true;
      }
      return Number(leftOp) > rightOp;
    case '[gte]':
      if (leftOp === '') {
        return true;
      } else if (isNaN(leftOp)) {
        return true;
      }
      return Number(leftOp) >= rightOp;
    }
  } else if (Array.isArray(leftOp) && Array.isArray(rightOp)) {
    var length = leftOp.length;
    if (length > rightOp.length) {
      length = rightOp.length;
    }
    for (i = 0; i < length; i++) {
      if (!this.evaluate(leftOp[i], operator, rightOp[i])) {
        return false;
      }
    }
    return true;
  } else if (Array.isArray(leftOp)) {
    for (i = 0, len = leftOp.length; i < len; i++) {
      if (!this.evaluate(leftOp[i], operator, rightOp)) {
        return false;
      }
    }
    return true;
  } else if (Array.isArray(rightOp)) {
    for (i = 0, len = rightOp.length; i < len; i++) {
      if (!this.evaluate(leftOp, operator, rightOp[i])) {
        return false;
      }
    }
    return true;
  }
  console.log('Pスクリプト演算に異常有り。');
  return false;
};

/**
 * コンポーネントの値が変更されているか確認する。<br>
 * これによりonDecisionが必要か判断する。<br>
 * @param component
 * @returns {Boolean}
 */
expj.common.pscript.onDecisionCheck = function (component) {
  return component.onFocusValue !== component.value;
};

/**
 * onClickイベント発生時にクリックしたボタン情報を格納する変数<br>
 */
expj.common.pscript.onClickTargetButtonData = null;

/**
 * onClickイベント発生時にクリックしたボタン情報を記録する関数。<br>
 * 格納する情報はボタンのname属性値とラベル名<br>
 * 本関数の対象はbuttonタグのみである。<br>
 * @param component 対象のボタンオブジェクト
 */
expj.common.pscript.loadOnClickTargetComponent = function (component) {
  if (component.tagName === 'BUTTON') {
    var name = component.name;
    var value = component.textContent;
    //data-lock属性値取得
    var lock = component.getAttribute('data-lock');
    if (typeof(value) === 'undefined') {
      value = '';
    }
    if (!lock) {
      //SUBMIT_BUTTON_TYPEデフォルト1を設定する
      lock = '1';
    }
    var json = {
      'name' : name,
      'value' : value,
      'lock' : lock
    };
    expj.common.pscript.onClickTargetButtonData = json;
  } else if (component.tagName === 'INPUT' && (component.type === 'checkbox' || component.type === 'radio')) {
    var name = component.name;
    var parentNode = component.parentNode;
    var value = '';
    var labelNode = parentNode.querySelector('label[for="' + component.id + '"]');
    if(labelNode){
      value = labelNode.textContent;
    }
    if (typeof(value) === 'undefined') {
      value = '';
    }
    var json = {
      'name' : name,
      'value' : value
    };
    expj.common.pscript.onClickTargetButtonData = json;
  } else {
    expj.common.pscript.onClickTargetButtonData = null;
  }
};

/**
 * 引数で指定した画面内のコンポーネントに対し、値変更フラグと初期値の記録を行う。<br>
 * 値の変更フラグはdata-initChange属性で行う。<br>
 * 初期値の管理はdata-initValue属性で行う。<br>
 * 初期値はチェックボックスとラジオボタンはtrue/false、それ以外はvalue属性の値を保持する。<br>
 * @param screenId
 */
expj.common.pscript.setComponentValueManage = function (screenId) {
  $(screenId).find('input,select').each(function () {
    this.changeState = false;
    if (this.tagName === 'INPUT') {
      if (this.type === 'checkbox' || this.type === 'radio') {
        // チェックボックス、ラジオボタンの初期状態はthis.defaultCheckedを確認する
        this.dataInitValue = this.checked;
        this.dataPrevValue = this.checked;
      } else {
        // それ以外は初期状態はthis.dataInitValueを確認する
        //if (this.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(this.kindData.kind)) {
        //  this.dataInitValue = this.value;
        //} else if (this.kindData.hasKind && this.kindData.kind === 'OBT_DATE') {
        // this.dataInitValue = this.value;
        //}
        this.dataInitValue = this.value;
        this.dataPrevValue = this.value;
      }
      // テキストボックス、パスワードボックスはmaxlengthチェック関数をblurに追加
      if (this.type === 'text' || this.type === 'password') {
        $(this).blur(function () {
          // コンテキストメニュー起動時は関数を素通りする
          if (this.isContextMenu !== true) {
            expj.common.pscript.controlTextLength(this);
          }
        });
      }
    } else if (this.tagName === 'SELECT') {
      this.dataInitValue = this.value;
      this.dataPrevValue = this.value;
    }
    // フォーカス時に変更前のデータを格納するイベントを追加する
    $(this).focus(function () {
      if (this.tagName === 'INPUT') {
        if (this.type === 'checkbox' || this.type === 'radio') {
          this.dataPrevValue = this.checked;
        } else {
          this.dataPrevValue = this.value;
        }
      } else if (this.tagName === 'SELECT') {
        this.dataPrevValue = this.value;
      }
    });
  });
};

expj.common.pscript.controlTextLength = function (component) {
  var kindFlg = false;
  // 書式チェックをし、maxlengthに合わせて文字を修正する
  if(component.type === 'password'){
    kindFlg = false;
  }else{
    kindFlg = expj.common.pscript.kind.checkNumberKind(component.kindData.kind);
  }
  component.value = expj.common.pscript.changeTextLength(component.value, component.maxLength, kindFlg);
};

/**
 * maxlengthの長さに合わせて文字を修正する
 * @param text テキスト
 * @param length 制限する文字数
 * @param flg 書式フラグ(true：数値書式、false:それ以外)
 * @returns {String} 修正後のテキスト
 */
expj.common.pscript.changeTextLength = function (text, length, flg) {
  var newText = '';
  var newTextCount = 0;
  if (length === -1) {
    length = Number.MAX_VALUE;
  }
  // 文字を一文字ずつ確認する
  for (var i = 0, len = text.length; i < len; i++) {
    var c = text.charAt(i);
    if (expj.common.pscript.func.LENB_ONE_BYTE_TEXT.indexOf(c) !== -1) {
      // 1バイトで扱う特殊文字の場合
      if (newTextCount < length) {
        // 制限文字数以下の場合、結合する
        newText += c;
        newTextCount++;
      } else {
        // 制限文字に達した場合、修正後の文字を返却する
        return newText;
      }
    } else {
      // それ以外の文字の場合、文字コードを確認する
      var bytecode = text.charCodeAt(i);
      if (bytecode < 128) {
        // 1バイト文字の場合
        if (flg && (c === ',' || c === '.')) {
          // 数値書式フラグがあり、カンマまたはピリオドの場合、文字数をカウントせずに結合
          newText += c;
        } else if (newTextCount < length) {
          // 制限文字数以下の場合、結合する
          newText += c;
          newTextCount++;
        } else {
          // 制限文字数に達した場合、修正後の文字を返却する
          return newText;
        }
      } else {
        // 2バイト文字の場合
        if (newTextCount + 1 < length) {
          // 文字を追加しても制限文字数以下の場合は結合する
          newText += c;
          newTextCount += 2;
        } else {
          // 制限文字数に達した場合は、修正後の文字を返却する
          return newText;
        }
      }
    }
  }
  // 修正対象文字が制限文字数以下の場合、ここを通過する
  return newText;
};

/**
 * onClick、onDecisionイベントを発生させたコンポーネントを記憶する変数。<br>
 */
expj.common.pscript.targetComponentNode = null;
/**
 * onClick、onDecisionイベントを発生させたコンポーネントの親ノードを記憶する変数。<br>
 */
expj.common.pscript.targetParentComponentNode = null;

/**
 * コンポーネントのonClickイベントが発生した時に呼び出される関数。<br>
 * Pスクリプトで定義されたonClickイベントを呼び出す。<br>
 */
expj.common.pscript.executeOnClickEvent = function (screenId, datagridName, componentName, targetObject, targetType) {

  if (expj.common.pscript.alertMessageFlag) {
    return;
  }

  console.log('execute ' + datagridName + '/' + componentName + '.onClick');
  // アラートフラグの初期化
  expj.common.pscript.alertMessageFlag = false;
  // クリックしたコンポーネントを記録する
  expj.common.pscript.setActionTargetComponent(targetObject);
  // BUTTON時にクリックしたボタンを記録する
  expj.common.pscript.loadOnClickTargetComponent(targetObject);
  // Pスクリプトで定義されたonclickを呼び出す
  if (expj.common.checkNameSpace(expj[screenId][datagridName][componentName].executeAllOnClick)) {
    expj[screenId][datagridName][componentName].executeAllOnClick();
  }
  if (targetType === 'CheckBox' || targetType === 'RadioButton') {
    expj[screenId][datagridName].executeAllOnDecision();
    expj[screenId].executeAllOnDecision();
  }
  // クリックしたコンポーネントを初期化する
  expj.common.pscript.setActionTargetComponentNull();
};

/**
 * TextInputのonDecisionイベントが発生した時に呼び出される関数。<br>
 * Pスクリプトで定義されたonDecisionイベントを呼び出す。<br>
 * @param screenId 画面ID
 * @param datagridName DataGrid名
 * @param componentName コンポーネント名
 * @param targetObject 対象のコンポーネントオブジェクト
 */
expj.common.pscript.executeTextInputOnDecisionEvent = function (screenId, datagridName, componentName, targetObject) {
  if (expj.common.pscript.onDecisionCheck(targetObject)) {
    expj.common.pscript.alertMessageFlag = false;
    expj.common.pscript.setActionTargetComponent(targetObject);
    expj[screenId][datagridName][componentName].executeAllOnDecision();
    expj.common.pscript.setActionTargetComponentNull();
    if (expj.common.pscript.alertMessageFlag && targetObject.getAttribute('data-view') !== 'true') {
      targetObject.noChangeBeforeValueFlg = true;
      expj.common.pscript.alertAfterFocusObj = targetObject;
    }
  }
};

/**
 * SETアクションでTextInputのonDecisionイベントが発生した時に呼び出される関数。<br>
 * Pスクリプトで定義されたonDecisionイベントを呼び出す。<br>
 * @param screenId 画面ID
 * @param datagridName DataGrid名
 * @param componentName コンポーネント名
 * @param targetObject 対象のコンポーネントオブジェクト
 * @param prevValue 元の値
 */
expj.common.pscript.executeSetTextInputOnDecisionEvent = function (screenId, datagridName, componentName, targetObject, prevValue) {
  if (targetObject.value !== prevValue) {
    expj.common.pscript.alertMessageFlag = false;
    expj.common.pscript.setActionTargetComponent(targetObject);
    expj[screenId][datagridName][componentName].executeAllOnDecision();
    expj.common.pscript.setActionTargetComponentNull();
  }
};

/**
 * ComboBoxのonDecisionイベントが発生した時に呼び出される関数。<br>
 * Pスクリプトで定義されたonDecisionイベントを呼び出す。<br>
 * @param screenId 画面ID
 * @param datagridName DataGrid名
 * @param componentName コンポーネント名
 * @param targetObject 対象のコンポーネントオブジェクト
 */
expj.common.pscript.executeComboBoxOnDecisionEvent = function (screenId, datagridName, componentName, targetObject) {
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(targetObject);
  expj[screenId][datagridName][componentName].executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};

/**
 * onClick、onDecisionイベントを発生させたコンポーネントを変数に記憶する関数。<br>
 * @param component 対象のコンポーネントオブジェクト
 */
expj.common.pscript.setActionTargetComponent = function (component) {
  expj.common.pscript.targetComponentNode = component;
  if (component.getAttribute('data-view') === 'true') {
    // VIEWの時はコンポーネントの親ノードも記憶する
    var parentComponent = component.parentNode.parentNode;
    expj.common.pscript.targetParentComponentNode = parentComponent;
  } else {
    // VIEW以外の時はnullをセットする
    expj.common.pscript.targetParentComponentNode = null;
  }
};

expj.common.pscript.getActionTargetComponent = function () {
  return expj.common.pscript.targetComponentNode;
}

/**
 * onClick、onDecisionイベントを発生させたコンポーネントを記録する変数を初期化する関数。<br>
 */
expj.common.pscript.setActionTargetComponentNull = function () {
  expj.common.pscript.targetComponentNode = null;
  expj.common.pscript.targetParentComponentNode = null;
};

/**
 * 指定したコンポーネントの値を取得する関数。<br>
 * 挙動は以下のとおりである。<br>
 * ・TextInput   ： 格納されている値を返却する。<br>
 * ・CheckBox    ： チェック状態ならtrue、非チェック状態ならfalseを返却する。<br>
 * ・RadioButton ： チェック状態ならtrue、非チェック状態ならfalseを返却する。<br>
 * ・ComboBox    ： 選択中の値を返却する。<br>
 * @param componentId 値を取得するコンポーネントのID
 * @returns コンポーネントが持つ値
 */
expj.common.pscript.getComponentValue = function (componentId) {
  // コンポーネントの取得
  var component = document.getElementById(componentId);
  // コンポーネントの取得に失敗した場合は空文字を返却する
  if (component === null) {
    return '';
  }
  // タグ名を取得する
  var tagName = component.tagName;
  if (tagName === 'INPUT') {
    // <input>タグの場合type属性も確認する
    var type = component.type;
    if (type === 'text' || type === 'hidden') {
      if (component.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(component.kindData.kind)) {
        return component.value.replace(/,/g, '');
      }
      if (component.kindData.hasKind && component.kindData.kind === 'OBT_DATE' && component.kindData.dateType === 'TYPE_YM') {
        var datagridId = componentId.substring(0, componentId.lastIndexOf('-'));
        var datagrid = document.getElementById(datagridId);
        if (datagrid !== null && datagrid.getAttribute('data-mode') === 'FORM' && component.value !== '') {
          return component.value + '/01';
        }
      }
      return component.value;
    } else if (type === 'password' || type === 'file') {
      // テキストボックス系の型の場合は、コンポーネントのvalue値を返却する
      return component.value;
    } else if (type === 'checkbox' || type === 'radio') {
      // 選択系の型の場合は、コンポーネントの選択状態を返却する
      return component.checked;
    }
  } else if (tagName === 'SELECT') {
    // コンボボックスの場合は、選択中の値を返却する
    return component.value;
  } else if (tagName === 'SPAN') {
    if (component.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(component.kindData.kind)) {
      return component.textContent.replace(/,/g, '');
    }
    return component.textContent;
  }
  // それ以外の場合はnullを返却する
  return null;
};

/**
 * 指定したコンポーネントに値を格納する関数。<br>
 * 挙動は以下のとおりである。<br>
 * ・TextInput   ： 引数で指定した値を格納する。<br>
 * ・CheckBox    ： trueならばチェック状態、falseならば非チェック状態にする。<br>
 * ・RadioButton ： trueならばチェック状態、falseならば非チェック状態にする。<br>
 * ・ComboBox    ： 引数で指定した値に選択を変更する。<br>
 * @param componentId コンポーネントのID
 * @param value       コンポーネントに格納する値
 */
expj.common.pscript.setComponentValue = function (componentId, value) {
  // コンポーネントの取得
  var component = document.getElementById(componentId);
  //コンポーネントの取得に失敗した場合は処理を終了する
  if (component === null) {
    return false;
  }
  //タグ名を取得する
  var tagName = component.tagName;
  var splitId = componentId.split('-');
  var targetComponentNode, targetParentComponentNode;
  if (tagName === 'INPUT') {
    // <input>タグの場合type属性も確認する
    var type = component.type;
    if (type === 'text' || type === 'hidden' || type === 'password') {
      var prevValue = component.value;
      component.value = value;
      if (component.kindData.hasKind) {
        expj.common.pscript.kind.setKind(component);
      }
      expj.common.pscript.controlTextLength(component);
      targetComponentNode = expj.common.pscript.targetComponentNode;
      targetParentComponentNode = expj.common.pscript.targetParentComponentNode;
      expj.common.pscript.executeSetTextInputOnDecisionEvent(splitId[1], splitId[2], splitId[3], component, prevValue);
      expj.common.pscript.targetComponentNode = targetComponentNode;
      expj.common.pscript.targetParentComponentNode = targetParentComponentNode;
    } else if (type === 'file') {
      // テキストボックス系の型の場合、valueの値を更新する
      component.value = value;
    } else if (type === "checkbox" || type === 'radio') {
      var componentType;
      if (type === 'checkbox') {
        componentType = 'CheckBox';
      } else {
        componentType = 'RadioButton';
      }
      // 選択系の型の場合は、check状態を更新する
      var tmpOnClickTargetButtonData = null;
      if (value === 'true' || value === '1') {
        if (!component.checked) {
          targetComponentNode = expj.common.pscript.targetComponentNode;
          component.checked = true;
          // クリックしたボタン情報を記録する
          tmpOnClickTargetButtonData = expj.common.pscript.onClickTargetButtonData;
          expj.common.pscript.executeOnClickEvent(splitId[1], splitId[2], splitId[3], component, componentType);
          // クリックしたボタン情報を再セットする
          expj.common.pscript.onClickTargetButtonData = tmpOnClickTargetButtonData;
          tmpOnClickTargetButtonData = null;
          expj.common.pscript.targetComponentNode = targetComponentNode;
        }
      } else {
        if (component.checked) {
          targetComponentNode = expj.common.pscript.targetComponentNode;
          component.checked = false;
          // クリックしたボタン情報を記録する
          tmpOnClickTargetButtonData = expj.common.pscript.onClickTargetButtonData;
          expj.common.pscript.executeOnClickEvent(splitId[1], splitId[2], splitId[3], component, componentType);
          // クリックしたボタン情報を再セットする
          expj.common.pscript.onClickTargetButtonData = tmpOnClickTargetButtonData;
          tmpOnClickTargetButtonData = null;
          expj.common.pscript.targetComponentNode = targetComponentNode;
        }
      }
    } else {
      return false;
    }
  } else if (tagName === 'SELECT') {
    // コンボボックスの場合は、選択要素を変更する
    if (component.value !== value) {
      var hasValue = false;
      for (var i = 0; i < component.childNodes.length; i++) {
        var childNode = component.childNodes[i];
        if (childNode.nodeName === 'OPTION') {
          if (childNode.value === value) {
            hasValue = true;
            break;
          }
        }
      }
      if (hasValue) {
        component.value = value;
        targetComponentNode = expj.common.pscript.targetComponentNode;
        expj.common.pscript.executeComboBoxOnDecisionEvent(splitId[1], splitId[2], splitId[3], component);
        expj.common.pscript.targetComponentNode = targetComponentNode;
      }
    }
  } else if (tagName === 'SPAN') {
    //form labelの場合、値をセット、return true。
    if($(component).hasClass('form-label')){
      component.textContent = value;
      return true;
    }
    expj.common.pscript.setSpanData(component, value);
  } else {
    return false;
  }
  return true;
};

/**
 * 指定したラベル（spanタグ）のテキストを書き変える関数。
 * @param componentObject 書き変え対象のspanタグオブジェクト
 * @param value 書き変え内容
 */
expj.common.pscript.setSpanData = function (componentObject, value) {
  var component = {
    'value' : value,
    'val' : function (arg0) {
      if (typeof(arg0) === 'undefined') {
        return component.value;
      }
      component.value = arg0;
    },
    'kindData' : componentObject.kindData
  };
  component.kindData.initFlg = false;
  component.kindData.lastState = value;
  if (componentObject.kindData.hasKind) {
    expj.common.pscript.kind.setKind(component);
  }
  componentObject.textContent = component.value;
};

//ExView専用
//dataにkind適応
expj.common.pscript.setSpanKindDataEx = function (obj, kind, type) {
  var valueEx = obj.value;
  obj.kindData = {
    'kind' : obj.kind,
    'hasKind' : true
  };
  expj.common.pscript.kind.checkSpanKindEx(obj);
  expj.common.pscript.setSpanData(obj, obj.value);
  valueEx = expj.common.pscript.convertNumberValue(obj.textContent, obj.kind, type);
  return valueEx;
};

/**
 * コンポーネント参照記述を解析してJSON化する関数。<br>
 * @param baseDataGridName 呼出DataGridのname属性値
 * @param componentRefDesc コンポーネント参照記述
 * @returns コンポーネント参照記述を解析して得られたJSON
 */
expj.common.pscript.getReferenceComponentDescription = function (baseDataGridName, componentRefDesc) {
  var descJson = {};
  // コンポーネント参照記述が0文字のテキストの場合、nullを返却する
  if (componentRefDesc.length === 0) {
    descJson.defChar = '';
    descJson.datagridName = '';
    descJson.componentName = componentRefDesc;
    return descJson;
  }
  // 規程文字の取得
  var defChar = componentRefDesc.charAt(0);
  if (defChar !== '_' && defChar !== '?') {
    descJson.defChar = '';
    descJson.datagridName = '';
    descJson.componentName = componentRefDesc;
  } else {
    // 「/」の有無および位置の取得
    var slashIndex = componentRefDesc.indexOf('/');
    // DataGridとコンポーネントのnameを格納する変数宣言
    var datagridName = null;
    var componentName = null;
    
    // コンポーネント参照記述から対象のDataGrid名とコンポーネント名を割り出す
    if (slashIndex === -1) {
      // 半角スラッシュが存在しない場合は呼出DataGridが対象DataGridと判断する
      datagridName = baseDataGridName;
      componentName = componentRefDesc.substring(1, componentRefDesc.length);
    } else {
      // 半角スラッシュが存在する場合はコンポーネント参照記述から読み込む
      datagridName = componentRefDesc.substring(1, slashIndex);
      componentName = componentRefDesc.substring(slashIndex + 1, componentRefDesc.length);
    }
    descJson.defChar = defChar;
    descJson.datagridName = datagridName;
    descJson.componentName = componentName;
  }
  return descJson;
};

/**
 * コンポーネント参照記述で指定したコンポーネントのステータスを取得する。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName 呼び出しDataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @returns コンポーネント参照をした結果得られたステータス値 
 */
expj.common.pscript.getReferenceComponentValue = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return null;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  var id;

  // 規定文字によって処理が分岐する
  if (defChar === '_') {
    // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値の取得を行う
    var targetDataGridObject = $('#expj-' + screenId + '-' + datagridName);
    if (targetDataGridObject.attr('data-mode') === 'VIEW') {
      // 対象がVIEW上のコンポーネントの時
      if (componentName === 'THIS') {
        // コンポーネント名がTHISの時は自分自身の値を返却する
        if (this.targetComponentNode.tagName === 'INPUT') {
          if (this.targetComponentNode.type === 'checkbox' || this.targetComponentNode.type === 'radio') {
            return this.targetComponentNode.checked;
          } else if (this.targetComponentNode.type === 'text') {
            if (this.targetComponentNode.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(this.targetComponentNode.kindData.kind)) {
              return this.targetComponentNode.value.replace(/,/g, '');
            }
          }
          return this.targetComponentNode.value;
        } else if (this.targetComponentNode.tagName === 'SPAN') {
          if (this.targetComponentNode.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(this.targetComponentNode.kindData.kind)) {
            return this.targetComponentNode.textContent.replace(/,/g, '');
          }
          return this.targetComponentNode.textContent;
        }
        return this.targetComponentNode.value;
      }
      var targetRow = this.targetParentComponentNode;
      if (targetRow === null) {
        targetRow = $('#expj-' + screenId + '-' + datagridName).find('.orteusView_BodyArea tbody .selected');
        if (targetRow.length === 0) {
          targetRow = $('#expj-' + screenId + '-' + datagridName).find('.orteusView_BodyArea tbody tr');
          if (targetRow.length > 0) {
            targetRow = $(targetRow.get(0));
          }
        }
      }
      // コンポーネントの親ノードから対象のコンポーネントを探索する
      var selector = '[data-name=' + '"' + componentName + '"]';
      var targetList = $(targetRow).find(selector);
      if (targetList.length > 0) {
        var resultList = [];
        for (var i = 0, len = targetList.length; i < len; i++) {
          var target = targetList[i];
          if (target.tagName === 'INPUT') {
            var type = target.type;
            if (type === 'checkbox' || type === 'radio') {
              resultList.push(target.checked);
            } else if (type === 'text') {
              if (target.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(target.kindData.kind)) {
                resultList.push(target.value.replace(/,/g, ''));
              } else {
                resultList.push(target.value);
              }
            } else {
              resultList.push(target.value);
            }
          } else if (target.tagName === 'SELECT') {
            resultList.push(target.value);
          } else if (target.tagName === 'SPAN') {
            if (target.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(target.kindData.kind)) {
              resultList.push(target.textContent.replace(/,/g, ''));
            } else {
              resultList.push(target.textContent);
            }
          }
        }
        return resultList;
      }
      return '';
    } else if (targetDataGridObject.attr('data-mode') === 'TREE') {
      // 対象がTREEの時
      var selectTreeNode = expj.common.treeInstanceMap[screenId][datagridName].gPrevSelectedNode;
      if (selectTreeNode === null) {
        return '';
      }
      var result = selectTreeNode.data[componentName];
      if (expj.common.checkNameSpace(result)) {
        return String(result);
      } else {
        return '';
      }
    } else {
      // 対象がVIEW以外の時
      if (componentName === 'THIS') {
        // コンポーネント名がTHISの時は自分自身の値を返却する
        if (this.targetComponentNode.tagName === 'INPUT') {
          if (this.targetComponentNode.type === 'checkbox' || this.targetComponentNode.type === 'radio') {
            return this.targetComponentNode.checked;
          } else if (this.targetComponentNode.type === 'text') {
            if (this.targetComponentNode.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(this.targetComponentNode.kindData.kind)) {
              return this.targetComponentNode.value.replace(/,/g, '');
            }
          }
        } else if (this.targetComponentNode.tagName === 'SPAN') {
          if (this.targetComponentNode.kindData.hasKind && expj.common.pscript.kind.checkNumberKind(this.targetComponentNode.kindData.kind)) {
            return this.targetComponentNode.textContent.replace(/,/g, '');
          }
          return this.targetComponentNode.textContent;
        }
        return this.targetComponentNode.value;
      }
      // HTML上のIDを生成
      id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
      // コンポーネントのvalue値を取得する
      return this.getComponentValue(id);
    }
  } else if (defChar === '?') {
    // 規程文字が半角クエスチョンの場合、対象コンポーネントのステータス取得を行う
    if (componentName === '*') {
      // コンポーネント名が半角アスタリスクの場合のステータス取得処理
      // DataGridまたはTREEのHTML上のIDを生成
      id = 'expj-' + screenId + '-' + datagridName;
      return this.getDataGridStatus(id);
    } else if (componentName === '?') {
      // コンポーネント名が半角クエスチョンの場合のステータス取得処理
      return this.getDataGridVIEWSelectStatus(screenId, datagridName);
    } else if (componentName === '#') {
      // コンポーネント名が半角シャープの場合のステータス取得処理
      return this.getDataGridVIEWSelectedCount(screenId, datagridName);
    } else if (componentName === '$') {
      // コンポーネント名が半角ダラー場合のステータス取得処理
      return this.getDataGridVIEWElementCount(screenId, datagridName);
    } else {
      // コンポーネント名が指定されていた場合
      return this.getComponentStatus(screenId, datagridName, componentName);
    }
  }
  // それ以外はコンポーネント名を返却する
  return componentName;
};

/**
 * コンポーネント参照記述で指定したコンポーネントのステータスを更新する。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName 呼び出しDataGrid名
 * @param componentRefDesc コンポーネント参照記述
 */
expj.common.pscript.setReferenceComponentValue = function (screenId, baseDataGridName, componentRefDesc, value) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合は処理を終了する
  if (descJson === null) {
    return false;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  // 規定文字によって処理が分岐する
  if (defChar === '_') {
    // セットする値が配列の時は第一要素を対象とする
    if (Array.isArray(value)) {
      if (value.length !== 0) {
        value = value[0];
      } else {
        value = '';
      }
    }
    // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値の取得を行う
    var targetDataGridObject = $('#expj-' + screenId + '-' + datagridName);
    if (targetDataGridObject.attr('data-mode') === 'VIEW') {
      // 対象がVIEW上のコンポーネントの時
      if (componentName === 'THIS') {
        // コンポーネント名がTHISの時は自分自身の値を返却する
        if (this.targetComponentNode.tagName === 'INPUT') {
          if (this.targetComponentNode.type === 'checkbox' || this.targetComponentNode.type === 'radio') {
            if (value === 'true') {
              this.targetComponentNode.checked = true;
            } else {
              this.targetComponentNode.checked = false;
            }
          } else {
            this.targetComponentNode.value = value;
            if (this.targetComponentNode.kindData.hasKind) {
              expj.common.pscript.kind.setKind(this.targetComponentNode);
            }
            expj.common.pscript.controlTextLength(this.targetComponentNode);
          }
        } else {
          this.targetComponentNode.value = value;
        }
        return true;
      }
      var targetRow = this.targetParentComponentNode;
      if (targetRow === null) {
        targetRow = $('#expj-' + screenId + '-' + datagridName).find('.orteusView_BodyArea tbody .selected');
      }
      // コンポーネントの親ノードから対象のコンポーネントを探索する
      var selector = '[data-name=' + '"' + componentName + '"]';
      var target = $(targetRow).find(selector);
      if (target.length > 0) {
        target = target[0];
        if (target.tagName === 'INPUT') {
          var type = target.type;
          if (type === 'checkbox' || type === 'radio') {
            if (value === 'true') {
              target.checked = true;
            } else {
              target.checked = false;
            }
          } else {
            target.value = value;
            if (target.kindData.hasKind) {
              expj.common.pscript.kind.setKind(target);
            }
            expj.common.pscript.controlTextLength(target);
          }
        } else if (target.tagName === 'SELECT') {
          target.value = value;
        } else if (target.tagName === 'SPAN') {
          target.textContent = value;
          //View Span セット後、書式セットする
          expj.common.pscript.kind.checkSpanKind(target);
          if (target.kindData.hasKind) {
            expj.common.pscript.setSpanData(target, target.textContent);
          }
        } else {
          return false;
        }
        return true;
      }
      return false;
    } else if (targetDataGridObject.attr('data-mode') === 'TREE') {
      // 対象がTREEの時
      return false;
    } else {
      // 対象がVIEW以外の時
      if (componentName === 'THIS') {
        // コンポーネント名がTHISの時は自分自身の値を返却する
        if (this.targetComponentNode.tagName === 'INPUT') {
          if (this.targetComponentNode.type === 'checkbox' || this.targetComponentNode.type === 'radio') {
            if (value === 'true') {
              this.targetComponentNode.checked = true;
            } else {
              this.targetComponentNode.checked = false;
            }
            return true;
          }
        }
        this.targetComponentNode.value = value;
        if (this.targetComponentNode.kindData.hasKind) {
          expj.common.pscript.kind.setKind(this.targetComponentNode);
        }
        expj.common.pscript.controlTextLength(this.targetComponentNode);
        return true;
      }
      // HTML上のIDを生成
      var id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
      // コンポーネントのvalue値を取得する
      return this.setComponentValue(id, value);
    }
  }
  return false;
};

/**
 * DataGrid(VIEW)のステータスを取得する関数。<br>
 * HTML上のDataGridタグにステータスを取得できるような細工をしておく必要がある。<br>
 * DataGrid(VIEW)のステータステキストは以下のとおり。
 * 1. INITIAL   初期表示状態<br>
 * 2. NORMAL    正常読込（1件以上データがあった）状態<br>
 * 3. NOT_FOUND 0件（読込後）<br>
 * 4. TOO_MANY  最大表示件数を超えていた（読込後）<br>
 * 5. ERROR     エラー<br>
 * @param componentId DataGridに割り当てられたHTMLのID
 * @returns DataGrid(VIEW)のステータステキスト
 */
expj.common.pscript.getDataGridStatus = function (componentId) {
  // コンポーネントオブジェクトを取得
  var component = document.getElementById(componentId);
  if (component === null) {
    console.log('コンポーネント参照で指定されたコンポーネント(' + componentId + ')が存在していません。');
    return null;
  }
  // orftypeの確認
  var orftype = component.getAttribute("data-orftype");
  if (orftype === "DataGrid") {
    // ステータス属性の値を返却
    return component.getAttribute('data-status');
  } else if (orftype === "Tree") {
    var active = $(component).find('.node-selected-self');
    if (active.length === 0) {
      return 'NOT_SELECTED';
    } else {
      return 'SELECTED';
    }
  }
  return null;
};

/**
 * コンポーネントのステータスを取得する関数。<br>
 * コンポーネントの値が変更されていれば「DIFFER」、変更されていなければ「SAME」を返却する。<br>
 * @param screenId      画面ID
 * @param datagridName  DataGrid名
 * @param componentName コンポーネント名
 * @returns
 */
expj.common.pscript.getComponentStatus = function (screenId, datagridName, componentName) {
  // 対象のDataGridオブジェクトを取得する
  var datagridId = 'expj-' + screenId + '-' + datagridName;
  var datagridObject = document.getElementById(datagridId);
  if (datagridObject !== null) {
    var component = null;
    var mode = datagridObject.getAttribute('data-mode');
    if (mode === 'VIEW') {
      // DataGridがVIEWの時
      if (componentName === 'THIS') {
        // コンポーネント名がTHISの時は自分自身を調べる
        component = this.targetComponentNode;
        if (component.tagName === 'INPUT') {
          if (component.type === 'checkbox' || component.type === 'radio') {
            if (component.defaultChecked === component.checked) {
              return 'SAME';
            } else {
              return 'DIFFER';
            }
          }
        }
        if (component.dataInitValue === component.value) {
          return 'SAME';
        } else {
          return 'DIFFER';
        }
      }
      // コンポーネント名がTHIS以外の時は親ノードから対象のコンポーネント名を探索する
      var selector = '[data-name="' + componentName + '"]';
      var target = null;
      if (this.targetParentComponentNode === null) {
        target = $(datagridObject).find('.orteusView_BodyArea tbody ' + selector);
      } else {
        target = $(this.targetParentComponentNode).find(selector);
      }
      if (target.length === 1) {
        component = target[0];
        if (component.tagName === 'INPUT') {
          if (component.type === 'checkbox' || component.type === 'radio') {
            if (component.defaultChecked === component.checked) {
              return 'SAME';
            } else {
              return 'DIFFER';
            }
          }
        }
        if (component.dataInitValue === component.value) {
          return 'SAME';
        } else {
          return 'DIFFER';
        }
      } else if (target.length > 1) {
        var result = [];
        for (var i = 0; i < target.length; i++) {
          component = target[0];
          if (component.tagName === 'INPUT') {
            if (component.type === 'checkbox' || component.type === 'radio') {
              if (component.defaultChecked === component.checked) {
                result.push('SAME');
              } else {
                result.push('DIFFER');
              }
            } else {
              if (component.dataInitValue === component.value) {
                result.push('SAME');
              } else {
                result.push('DIFFER');
              }
            }
          } else {
            if (component.dataInitValue === component.value) {
              result.push('SAME');
            } else {
              result.push('DIFFER');
            }
          }
        }
        return result;
      }
    } else {
      // DataGridがVIEW以外の時
      if (componentName === 'THIS') {
        component = this.targetComponentNode;
      } else {
        var componentId = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
        component = document.getElementById(componentId);
      }
      if (component === null) {
        console.log('コンポーネント参照で指定されたコンポーネント(' + componentName + ')が存在していません。');
        return null;
      }
      if (component.tagName === 'INPUT') {
        if (component.type === 'checkbox' || component.type === 'radio') {
          if (component.defaultChecked === component.checked) {
            return 'SAME';
          } else {
            return 'DIFFER';
          }
        }
      }
      if (component.dataInitValue === component.value) {
        return 'SAME';
      } else {
        return 'DIFFER';
      }
    }
  }
  console.log('コンポーネント参照で指定されたコンポーネント(' + datagridId + ')が存在していません。');
  return null;
};

/**
 * DataGrid(VIEW)の選択状態を取得する関数。<br>
 * 選択状態を表すテキストは以下のとおり。<br>
 * 1. NOT_SELECTED 選択行なし
 * 2. SINGLE       1行選択状態
 * 3. MULTI        複数行選択状態
 * @param screenId 対象DataGrid(VIEW)の画面ID
 * @param datagridName 対象DataGrid(VIEW)のID
 * @returns DataGrid(VIEW)の選択状態を表すテキスト
 */
expj.common.pscript.getDataGridVIEWSelectStatus = function (screenId, datagridName) {
  var count = this.getDataGridVIEWSelectedCount(screenId, datagridName);
  if (count === 1) {
    return 'SINGLE';
  } else if (count > 1 ) {
    return 'MULTI';
  }
  return 'NOT_SELECTED';
};

/**
 * DataGrid(VIEW)の選択行数を取得する関数。<br>
 * @param screenId 対象DataGrid(VIEW)の画面ID
 * @param datagridName 対象DataGrid(VIEW)のID
 * @returns {String} 選択行数は0～Nのテキスト
 */
expj.common.pscript.getDataGridVIEWSelectedCount = function (screenId, datagridName) {
  var targetViewObj = $('#expj-' + screenId + '-' + datagridName);
  var targetView = targetViewObj.get(0);
  var exView = targetView.getAttribute('data-viewtype');
  if (exView === 'ExView') {
    var size = targetView.OrteusView.bodyData.length;
    var count = 0;
    for (var i = 0; i < size; i++) {
      if (targetView.OrteusView.bodyData[i].selected) {
        count++;
      }
    }
    return count;
  } else {
    var list = targetViewObj.find('.orteusView_BodyArea tbody tr.selected');
    var count = list.length;
    return count;
  }
};

/**
 * DataGrid(VIEW)の表示行数を取得する関数。<br>
 * @param screenId 対象DataGrid(VIEW)の画面ID
 * @param datagridName 対象DataGrid(VIEW)のID
 * @returns {String} 選択行数は0～Nのテキスト
 */
expj.common.pscript.getDataGridVIEWElementCount = function (screenId, datagridName) {
  var targetViewObj = $('#expj-' + screenId + '-' + datagridName);
  var targetView = targetViewObj.get(0);
  var exView = targetView.getAttribute('data-viewtype');
  if (exView === 'ExView') {
    return targetView.OrteusView.bodyData.length;
  } else {
    var list = targetViewObj.find('.orteusView_BodyArea tbody tr');
    var count = list.length;
    return count;
  }
};

/**
 * 指定した必須入力コンポーネントの入力状況をチェックする関数。<br>
 * @param screenId    画面ID
 * @param groupIds     必須入力コンポーネントグループを示す文字
 * @returns {Boolean} すべて入力済みならtrue、それ以外ならfalse
 */
expj.common.pscript.satisfiedRequiredComponent = function (screenId, groupIds) {
  var groupList = groupIds.split(',');
  var regExp = new RegExp(' ', 'g');
  var i, j, len, jlen;
  var targetGroupId;
  for (i = 0, len = groupList.length; i < len; i++) {
    targetGroupId = groupList[i];
    targetGroupId = targetGroupId.replace(regExp, '');
    groupList[i] = targetGroupId;
  }
  var checkFlg = true;
  for (i = 0, len = groupList.length; i < len; i++) {
    targetGroupId = groupList[i];
    var requiredComponentList = $('.expj-' + screenId + '-required-' + targetGroupId);
    var groupFlg = true;
    for (j = 0, jlen = requiredComponentList.length; j < jlen; j++) {
      countFlg = false;
      var component = requiredComponentList[j];
      var value = '';
      //タグ名を取得する
      var tagName = component.tagName;
      if (tagName === 'INPUT') {
        // <input>タグの場合type属性も確認する
        var type = component.type;
        if (type === 'text' || type === 'password' || type === 'hidden' || type === 'file') {
          // テキストボックス系の型の場合、valueの値を更新する
          value = component.value;
        } else if (type === "checkbox" || type === 'radio') {
          // 選択系の型の場合は、check状態を更新する
          if (component.checked) {
            value = 'true';
            component.checked = true;
          }
        }
      } else if (tagName === 'SELECT') {
        // コンボボックスの場合は、選択要素を変更する
        value = component.value;
      }
      if (value === '') {
        groupFlg = false;
        break;
      }
    }
    if (!groupFlg) {
      checkFlg = false;
      break;
    }
    // 指定したグループのコンポーネントが0個の時は素通りさせる
  }
  return checkFlg;
};

expj.common.pscript.focusActiveElement = null;

expj.common.pscript.commonMaskProcess = function (screenId, baseDataGridName, componentRefDesc, disabled) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合は処理を終了する
  if (descJson === null) {
    return false;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  // 規定文字によって処理が分岐する
  if (defChar === '_') {
    // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値を更新する
    var datagridId = 'expj-' + screenId + '-' + datagridName;
    var datagridObject = document.getElementById(datagridId);
    if (datagridObject !== null) {
      var mode = datagridObject.getAttribute('data-mode');
      var component = null, target = null, i;
      if (mode === 'FORM' || mode === 'BUTTON') {
        // HTML上のIDを生成
        var id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
        // コンポーネント取得
        component = document.getElementById(id);
        if (component === null) {
          return false;
        }
        var revokeCtrl = component.getAttribute('data-revokectrl');
        if (revokeCtrl === 'disabled' || revokeCtrl === 'hidden') {
          return false;
        }
        if (disabled) {
          if (component === document.activeElement) {
            expj.common.pscript.focusActiveElement = component.parentNode;
          }
          component.setAttribute('disabled', 'disabled');
        } else {
          component.removeAttribute('disabled');
          //maskしてからUnmask時、focus項目自動parentNodeのDIVになる。maskしてunmaskのfocus対応するため
          if(component.parentNode === expj.common.pscript.focusActiveElement){
            component.focus();
            expj.common.pscript.focusActiveElement = null;
          }
        }
        // ラジオボタンまたはチェックボックスの時、ラベルもグレーにする
        if (component.type === 'checkbox' || component.type === 'radio') {
          target = $(datagridObject).find('label[for="' + id + '"]');
          if (disabled) {
            target.addClass('expj-disabled-label');
          } else {
            target.removeClass('expj-disabled-label');
          }
        }
        return true;
      } else if (mode === 'VIEW') {
        var className = '.expj-' + screenId + '-' + datagridName + '-' + componentName;
        var componentList = $(className);
        if (componentList.length === 0) {
          return false;
        }
        if (disabled) {
          componentList.attr('disabled', 'disabled');
        } else {
          componentList.removeAttr('disabled');
        }
        // ラジオボタンまたはチェックボックスの時、ラベルもグレーにする
        for (i = 0; i < componentList.length; i++) {
          component = componentList[i];
          if (component.type === 'checkbox' || component.type === 'radio') {
            target = $(component).parent().find('label[for="' + component.id + '"]');
            if (disabled) {
              target.addClass('expj-disabled-label');
            } else {
              target.removeClass('expj-disabled-label');
            }
          }
        }
        return true;
      } else if (mode === 'TREE') {
        var targetContextList = componentName.split(':');
        var contextData = expj.common.treeInstanceMap[screenId][datagridName].contextData;
        if (expj.common.checkNameSpace(contextData)) {
          var contextInstance = contextData.instance;
          for (i = 0, len = targetContextList.length; i < len; i++) {
            var index = parseInt(targetContextList[i]);
            if (isNaN(index)) {
              continue;
            }
            var childNode = contextInstance.childNodes[index];
            if (typeof(childNode) !== 'undefined' && childNode !== null) {
              childNode.expjTreeContext.disabled = disabled;
            }
          }
        }
        return true;
      }
    }
  }
  return false;
};

/**
 * コンポーネント参照記述で指定したコンポーネントにマスクをかける<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName 呼び出しDataGrid名
 * @param componentRefDesc コンポーネント参照記述
 */
expj.common.pscript.setMaskToReferenceComponent = function (screenId, baseDataGridName, componentRefDesc) {
  return this.commonMaskProcess(screenId, baseDataGridName, componentRefDesc, true);
};

/**
 * コンポーネント参照記述で指定したコンポーネントのマスクを外す<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName 呼び出しDataGrid名
 * @param componentRefDesc コンポーネント参照記述
 */
expj.common.pscript.setUnMaskToReferenceComponent = function (screenId, baseDataGridName, componentRefDesc) {
  return this.commonMaskProcess(screenId, baseDataGridName, componentRefDesc, false);
};

expj.common.pscript.makeRadioButtonRequestParameter = function (component) {
  var checkName = component.getAttribute('data-name');
  var param = '';
  if (component === expj.common.pscript.getActionTargetComponent()) {
    var parentNode = component.parentNode;
    var labelNode = parentNode.querySelector('label[for="' + component.id + '"]');
    param += checkName + '%=%' + labelNode.innerText + '%&%';
  }
  if (component.checked) {
    param += checkName + '%=%true%&%';
    return param;
  } else {
    return checkName + '%=%NULL%&%';
  }
};

expj.common.pscript.makeCheckboxRequestParameter = function (component) {
  var param = '';
  if (component === expj.common.pscript.getActionTargetComponent()) {
    var parentNode = component.parentNode;
    var labelNode = parentNode.querySelector('label[for="' + component.id + '"]');
    param += component.name + '%=%' + labelNode.innerText + '%&%';
  }
  if (component.checked) {
    param += component.name + '%=%true%&%';
  } else {
    param += component.name + '%=%NULL%&%';
  }
  return param;
};

expj.common.pscript.makeFormRequestParameter = function (datagridId, componentName, datagridObject) {
  var component;
  var result = '';
  var paramName, paramValue;
  if (componentName === '*' || componentName === '+') {
    var elms = datagridObject.elements;
    for (var i = 0, len = elms.length; i < len; i++) {
      component = elms[i];
      if (component.tagName === 'INPUT' || component.tagName === 'SELECT') {
        if (component.type === 'radio') {
          result += this.makeRadioButtonRequestParameter(component);
        } else if (component.type === 'checkbox') {
          result += this.makeCheckboxRequestParameter(component);
        } else {
          paramName = component.name;
          paramValue = expj.common.pscript.convertNumberValue(component.value, component.getAttribute('data-kind'), 'FORM');
          result += paramName + '%=%' + paramValue + '%&%';
        }
      }
    }
  } else {
    var componentId = datagridId + '-' + componentName;
    component = document.getElementById(componentId);
    if (component !== null) {
      if (component.tagName === 'INPUT' || component.tagName === 'SELECT') {
        if (component.type === 'checkbox') {
          result += this.makeCheckboxRequestParameter(component);
        } else if (component.type === 'radio') {
          result += this.makeRadioButtonRequestParameter(component);
        } else {
          paramName = component.name;
          paramValue = expj.common.pscript.convertNumberValue(component.value, component.getAttribute('data-kind'), 'FORM');
          result += paramName + '%=%' + paramValue + '%&%';
        }
      }
    }
  }
  return result;
};

/**
 * PRINTアクションでリクエストパラメータを収集する際に、[_DataGrid名/#」で選択行の行数を取得を有効にする変数。
 */
expj.common.pscript.makePrintParameterFlg = false;

/**
 * VIEWのリクエストパラメータを生成する関数。
 * @param screenId 画面ID
 * @param datagridName ベースDataGrid名
 * @param componentName コンポーネント参照記述
 * @returns {String} リクエストパラメータ
 */
expj.common.pscript.makeViewRequestParameter = function (screenId, datagridName, componentName) {
  // リクエストパラメータ格納変数
  var result = '';
  var cellsDataList = null;
  var i, len, cellData, rowNumber;
  
  // PRINTアクション時の[_DataGrid名/#」処理
  if (componentName === '#' && expj.common.pscript.makePrintParameterFlg) {
    cellsDataList = this.getSelectedVIEWCells(screenId, datagridName);
    if (cellsDataList !== null) {
      for (i = 0, len = cellsDataList.length; i < len; i++) {
        cellData = cellsDataList[i];
        rowNumber = cellData[datagridName + '_rownum'];
        result += 'PRINT_TARGET%=%' + (rowNumber - 1) + '%&%';
      }
    }
    return result;
  }
  
  // リクエストパラメータ生成
  if (componentName === '*') {
    // VIEWの全要素取得
    cellsDataList = this.getPreviewVIEWCells(screenId, datagridName);
    // VIEWの選択行要素取得
  } else if (componentName === '+') {
    cellsDataList = this.getSelectedVIEWCells(screenId, datagridName);
  }
  if (cellsDataList !== null) {
    for (i = 0, len = cellsDataList.length; i < len; i++) {
      cellData = cellsDataList[i];
      rowNumber = cellData[datagridName + '_rownum'];
      result += datagridName + '_rownum%=%' + rowNumber + '%&%';
      var selected = cellData[datagridName + '_selected'];
      result += datagridName + '_selected%=%' + selected + '%&%';
      for (var cellName in cellData.rowData) {
        var cellValue = cellData.rowData[cellName];
        result += cellName + '%=%' + cellValue + '%&%';
      }
    }
  }
  return result;
};

expj.common.pscript.makeTreeRequestParameter = function (screenId, datagridName, componentName, datagridObject) {
  var result = 'type%=%Tree%&%';
  result += 'maxid%=%' + datagridObject.getAttribute('data-maxid') + '%&%';
  var selectNode = expj.common.treeInstanceMap[screenId][datagridName].gPrevSelectedNode;
  var propName, propValue;
  if (selectNode !== null) {
    result += '_row_color%=%selected%&%';
    for (propName in selectNode.data) {
      propValue = selectNode.data[propName];
      result += propName + '%=%' + propValue + '%&%';
    }
    if (componentName === '*') {
      var childNodes = selectNode.children;
      for (var i = 0, len = childNodes.length; i < len; i++) {
        result += '_row_color%=%normal%&%';
        for (propName in childNodes[i].data) {
          propValue = childNodes[i].data[propName];
          result += propName + '%=%' + propValue + '%&%';
        }
      }
    }
  }
  return result;
};

expj.common.pscript.makeDetailRequestParameter = function (datagridId, componentName, datagridObject) {
  var result = '';
  var paramList = $(datagridObject).find('[data-detailItem="true"]');
  var component, paramName, paramValue, paramKind;
  if (componentName === '*' || componentName === '+') {
    for (var i = 0, len = paramList.length; i < len; i++) {
      component = paramList[i];
      if (component.tagName === 'INPUT' || component.tagName === 'SELECT') {
        if (component.type === 'radio') {
          result += this.makeRadioButtonRequestParameter(component);
        } else if (component.type === 'checkbox') {
          result += this.makeCheckboxRequestParameter(component);
        } else {
          paramName = component.name;
          paramValue = expj.common.pscript.convertNumberValue(component.value, component.getAttribute('data-kind'), 'DETAIL');
          result += paramName + '%=%' + paramValue + '%&%';
        }
      } else if (component.tagName === 'SPAN') {
        paramName = component.getAttribute('data-name');
        paramValue = expj.common.pscript.convertNumberValue(component.textContent, component.getAttribute('data-kind'), 'DETAIL');
        result += paramName + '%=%' + paramValue + '%&%';
      }
    }
  } else {
    var componentId = datagridId + '-' + componentName;
    component = document.getElementById(componentId);
    if (component.tagName === 'INPUT' || component.tagName === 'SELECT') {
      if (component.type === 'checkbox') {
        result += this.makeCheckboxRequestParameter(component);
      } else if (component.type === 'radio') {
        result += this.makeRadioButtonRequestParameter(component);
      } else {
        paramName = component.name;
        paramValue = expj.common.pscript.convertNumberValue(component.value, component.getAttribute('data-kind'), 'DETAIL');
        result += paramName + '%=%' + paramValue + '%&%';
      }
    } else if (component.tagName === 'SPAN') {
      paramName = component.getAttribute('data-name');
      paramValue = expj.common.pscript.convertNumberValue(component.textContent, component.getAttribute('data-kind'), 'DETAIL');
      result += paramName + '%=%' + paramValue + '%&%';
    }
  }
  return result;
};

expj.common.pscript.convertNumberValue = function (paramValue, paramKind, type) {
  if (typeof(paramKind) === 'undefined' || paramKind === null) {
    return paramValue;
  }
  var kind = paramKind.split(';');
  paramKind = kind[0];
  if (paramKind === 'OBT_INTEGER' || paramKind === 'OBT_INTEGER_P' || paramKind === 'OBT_INTEGER_Z' || paramKind === 'OBT_NUMBER' || paramKind === 'OBT_NUMBER_P' || paramKind === 'OBT_NUMBER_Z') {
    return paramValue.replace(/,/g, '');
  }
  if (paramKind === 'OBT_DATE') {
    var dateType = kind[1];
    if (dateType === 'TYPE_YM' && paramValue !== '' && type === 'FORM') {
      paramValue += '/01';
    }
  }
  return paramValue;
};

/**
 * 指定したコンポーネント参照から、リクエストパラメータを作成する関数。<br>
 * @param screenId             業務画面ID
 * @param baseDataGridName     呼出DataGrid名
 * @param componentRefDescText コンポーネント参照記述
 * @returns {String} リクエストパラメータテキスト
 */
expj.common.pscript.getRequestParameter = function (screenId, baseDataGridName, componentRefDescText) {
  var componentRefDescList = componentRefDescText.split(',');
  var result = '';
  if (expj.common.pscript.onClickTargetButtonData !== null) {
  	//requestにボタン情報追加：name,value,lock
    result += expj.common.pscript.onClickTargetButtonData.name + '%=%' + expj.common.pscript.onClickTargetButtonData.value + '%&%' + 'SUBMIT_BUTTON_TYPE' + '%=%' + expj.common.pscript.onClickTargetButtonData.lock + '%&%';
    expj.common.pscript.onClickTargetButtonData = null;
  }
  for (var i = 0, len = componentRefDescList.length; i < len; i++) {
    var componentRefDesc = componentRefDescList[i];
    componentRefDesc = componentRefDesc.trim();
    var defChar = componentRefDesc.charAt(0);
    if (defChar === '_') {
      // コンポーネント参照記述の解析
      var descJson = expj.common.pscript.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
      // 変数の取得
      defChar = descJson.defChar;
      var datagridName = descJson.datagridName;
      var componentName = descJson.componentName;
      // HTML上のIDを生成
      var datagridId = 'expj-' + screenId + '-' + datagridName;
      var datagridObject = document.getElementById(datagridId);
      if (datagridObject !== null) {
        if (datagridObject.getAttribute('data-mode') === 'FORM') {
          result += expj.common.pscript.makeFormRequestParameter(datagridId, componentName, datagridObject);
        } else if (datagridObject.getAttribute('data-mode') === 'VIEW') {
          result += expj.common.pscript.makeViewRequestParameter(screenId, datagridName, componentName);
        } else if (datagridObject.getAttribute('data-mode') === 'TREE') {
          result += expj.common.pscript.makeTreeRequestParameter(screenId, datagridName, componentName, datagridObject);
        } else if (datagridObject.getAttribute('data-mode') === 'DETAIL') {
          result += expj.common.pscript.makeDetailRequestParameter(datagridId, componentName, datagridObject);
        }
      }
    } else {
      if (componentRefDesc === '') {
        continue;
      }
      var expr = componentRefDesc.split('=');
      var name = expr[0];
      var value = '';
      if (expr.length === 2) {
        value = expr[1];
      }
      result += name + '%=%' + value + '%&%';
    }
  }
  return result;
};

/**
 * 詳細ウィンドウを起動する関数。<br>
 * @param screenId     画面ID
 * @param dataGridName DataGrid(DETAIL)名(Float)
 */
expj.common.pscript.showDetailWindow = function (screenId, dataGridName, topPosition) {
  var top = parseInt(topPosition);
  if (isNaN(top) || top < 0) {
    var parentDataGrid = $(expj.common.pscript.targetComponentNode);
    while (parentDataGrid !== null && parentDataGrid.attr('data-orftype') !== 'DataGrid') {
      parentDataGrid = parentDataGrid.parent();
    }
    if (parentDataGrid === null) {
      top = 92;
    } else {
      var dataGridList = $('#expj-business-screen-tabs-body-' + screenId).find('[data-orftype="DataGrid"]');
      top = -1;
      var nextFlg = false;
      for (var i = 0, len = dataGridList.length; i < len; i++) {
        if (dataGridList[i].id === parentDataGrid.attr('id')) {
          nextFlg = true;
        } else if (nextFlg) {
          top = $(dataGridList[i]).offset().top;
          break;
        }
      }
      if (top === -1) {
        if (dataGridList.length > 0) {
          top = $(expj.common.pscript.targetComponentNode).offset().top;
        } else {
          top = 92;
        }
      }
    }
  } else {
    top += 92;
  }
  
  var position = 'right-35 top+' + String(top);
  var id = expj.common.detailDialogMap[screenId]._detailWindowNameMap_[dataGridName];
  var detailWindowData = expj.common.detailDialogMap[screenId][id];
  if (!detailWindowData.visible) {
    var instance = detailWindowData.dialogInstance;
    instance.dialog('option', 'position', {
      'my' : 'right top',
      'at' : position,
      'of' : $(window)
    });
    instance.dialog('open');
    if (this.targetComponentNode !== null) {
      this.targetComponentNode.focus();
    }
  } else {
    var dialog = detailWindowData.dialogInstance.parent();
    var left = $(window).innerWidth() - dialog.outerWidth() - 35;
    dialog.css('left', left + 'px');
    dialog.css('top', top + 'px');
  }
};

/**
 * 詳細ウィンドウのみアップデートされた時に呼び出される詳細ウィンドウ起動関数
 * @param screenId 画面ID
 * @param dataGridName 詳細ウィンドウのID
 * @param topPosition 表示位置（高さ）
 */
expj.common.pscript.showDetailWindowByDirectId = function (screenId, dataGridName, topPosition) {
  var detailWindowData = expj.common.detailDialogMap[screenId][dataGridName];
  var instance = detailWindowData.dialogInstance;
  instance.dialog('option', 'position', {
    'my' : 'right top',
    'at' : 'right-35 top+' + topPosition,
    'of' : $(window)
  });
  instance.dialog('open');
};

/**
 * ファイルダイアログを起動する関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 */
expj.common.pscript.openFileDialog = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  var iframeField = $('#expj-business-screen-tabs-body-' + screenId).find('iframe[name="form_iframe"]');
  var fileInputField = null;
  if (iframeField.length !== 0) {
    fileInputField = $(iframeField[0].contentDocument.body).find('input[type="file"]');
    if (fileInputField.length === 0) {
      fileInputField = null;
    }
  }
  if (fileInputField === null) {
    fileInputField = $('#expj-file-field').find('input[type="file"]');
  }
  
  //chrome用イベント登録
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
     //データ保存obj作成
     var preObj = fileInputField.clone(true);
     fileInputField[0].onclick = function(){
       // 規定文字によって処理が分岐する
       var textValue ='';
       if (defChar === '_') {
         // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値の取得を行う
         // HTML上のIDを生成
         var id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
         // コンポーネントのvalue値をセットする
         var component = document.getElementById(id);
         if (component !== null) {
           textValue = component.value;
         }
       }
       
       /*
         onchange動くため、iframeのデータ消す
         ①inputが空の場合、キャンセル⇒onchang動かない；iframe空なる。
         ②inputが空の場合、ファイル選択した⇒onchang動く；新値iframe。
         ③inputが空でない場合、キャンセル⇒onchange動かない；iframe維持。
         ④inputが空でない場合、ファイル選択⇒onchange動く；新値iframe。
       */
       if(textValue == ''){
         fileInputField.val('');
       }
     };
     
     fileInputField[0].onchange = function () {
       //キャンセル場合の処理
       if(fileInputField.val() == ''){
         fileInputField.replaceWith(preObj[0]);
       }
       var fileName = fileInputField.val();
       if(fileInputField.val() == ''){
         fileName = preObj.val();
       }
       
       // 規定文字によって処理が分岐する
       if (defChar === '_') {
         // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値の取得を行う
         // HTML上のIDを生成
         var id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
         // コンポーネントのvalue値をセットする
         var component = document.getElementById(id);
         if (component !== null) {
           component.value = fileName;
           expj[screenId].executeAllOnDecision();
         }
       }
     };
  }
  
  
  fileInputField.click();
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
    
  } else {
    var fileName = fileInputField.val();
    // 規定文字によって処理が分岐する
    if (defChar === '_') {
      // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値の取得を行う
      // HTML上のIDを生成
      var id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
      // コンポーネントのvalue値をセットする
      var component = document.getElementById(id);
      if (component !== null) {
        component.value = fileName;
        expj[screenId].executeAllOnDecision();
      }
    }
  }
};

/**
 * ファイルアップロード処理を行う関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param servletName      サーブレット名
 */
expj.common.pscript.executeFileUpload = function (screenId, baseDataGridName, servletName) {
  var messageKey = 'ZZ07015';
  var dialogMessage = '[' + messageKey + ']' + getMessageOnly(messageKey) + '\n';
  if (!confirm(dialogMessage)) {
    return;
  }
  var iframeField = $('#expj-business-screen-tabs-body-' + screenId).find('iframe[name="form_iframe"]');
  var formField = null;
  if (iframeField.length !== 0) {
    formField = $(iframeField[0].contentDocument.body).find('form[name="csvup"]');
    if (formField.length === 0) {
      formField = null;
    }
  }
  if (formField === null) {
    formField = $('#expj-file-field').find('form[name="csvup"]');
  }

  expj.common.controlLoadingScreen(true);
  setTimeout(function () {
    // Upload用Formのオブジェクトを取得
    var formObj = formField[0];
    // 業務ロックパラメータをセット
    var servletUrl = servletName;
    if (expj.common.pscript.onClickTargetButtonData !== null) {
      servletUrl += '?SUBMIT_BUTTON_TYPE=' + expj.common.pscript.onClickTargetButtonData.lock;
      expj.common.pscript.onClickTargetButtonData = null;
    }
    // FormDataオブジェクトの作成
    var formData = new FormData(formObj);
    // Ajax通信（通常とは異なるので共通関数は呼び出さない）
    // https://developer.mozilla.org/ja/docs/Web/Guide/Using_FormData_Objects
    var response = $.ajax({
      'url' : servletUrl,
      'type' : 'post',
      'async' : false,
      'cache' : false,
      'data' : formData,
      'processData' : false, // Ajaxがdataを整形しないようにする指定
      'contentType' : false  // 上記と同様
    });
    // レスポンス解析
    var contents = expj.common.analyzeBusinessScreenResponse(screenId, response);
    expj.common.updateBusinessScreenTab(screenId, contents);
  }, expj.common.screenFrameLoadingTime);
};

/**
 * カレンダーオブジェクトを作成する関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 */
expj.common.pscript.createCalendar = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  // 規定文字によって処理が分岐する
  if (defChar === '_') {
    // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値の取得を行う
    // HTML上のIDを生成
    var id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
    var obj = document.getElementById(id);
    var kind = obj.getAttribute('data-kind');
    if (kind === null || typeof(kind) === 'undefined') {
      kind = 'OBT_DATE;TYPE_YMD';
    }
    kind = kind.split(';');
    var format = null;
    if (kind[0] === 'OBT_DATE') {
      if (kind.length === 1) {
        format = 'yy/mm/dd';
      } else {
        if (kind[1] === 'TYPE_YMD') {
          format = 'yy/mm/dd';
        } else if (kind[1] === 'TYPE_YM') {
          format = 'yy/mm';
        } else if (kind[1] === 'TYPE_MD') {
          format = 'mm/dd';
        } else {
          format = 'yy/mm/dd';
        }
      }
    } else {
      format = 'yy/mm/dd';
    }
    id = '#' + id;
    expj.common.createCalendarInstance(id, format);
  }
};

/**
 * カレンダーを起動する関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 */
expj.common.pscript.executeCalendar = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  // 規定文字によって処理が分岐する
  if (defChar === '_') {
    // 規程文字が半角アンダーバーの場合、対象コンポーネントの格納値の取得を行う
    // HTML上のIDを生成
    var screenCalendarMap = expj.common.calendarInstanceMap[screenId];
    var targetFieldData = screenCalendarMap[datagridName + '-' + componentName];
    targetFieldData.buttonInstance.click();
  }
};

/**
 * エラーメッセージを溜めておくリスト。<br>
 */
expj.common.pscript.errorMessageCodeList = [];
/**
 * 警告メッセージを溜めておくリスト。<br>
 */
expj.common.pscript.warningMessageCodeList = [];

expj.common.pscript.alertMessageFlag = false;

expj.common.pscript.alertAfterFocusObj = null;

/**
 * エラーメッセージと警告メッセージを溜めているリストを初期化する関数。<br>
 */
expj.common.pscript.init = function () {
  expj.common.pscript.errorMessageCodeList = [];
  expj.common.pscript.warningMessageCodeList = [];
};

/**
 * エラーメッセージをリストに追加する関数。<br>
 * @param message メッセージコード
 */
expj.common.pscript.addErrorMessage = function (screenId, baseDataGridName, message) {
  var messageList = message.split(':');
  var messageKey = messageList[0];
  var messageData = getMessageOnly(messageKey);
  for (var i = 1, len = messageList.length; i < len; i++) {
    var key = '\\{' + (i - 1) + '\\}';
    var regExp = new RegExp(key, 'g');
    var componentRefDesc = messageList[i];
    messageData = messageData.replace(regExp, this.getReferenceComponentValue(screenId, baseDataGridName, componentRefDesc));
  }
  var dialogMessage = '[' + messageKey + ']' + messageData + '\n';
  this.errorMessageCodeList.push(dialogMessage);
};

/**
 * 警告メッセージをリストに追加する関数。<br>
 * @param messageKey メッセージコード
 */
expj.common.pscript.addWarningMessage = function (screenId, baseDataGridName, message) {
  var messageList = message.split(':');
  var messageKey = messageList[0];
  var messageData = getMessageOnly(messageKey);
  for (var i = 1, len = messageList.length; i < len; i++) {
    var key = '\\{' + (i - 1) + '\\}';
    var regExp = new RegExp(key, 'g');
    var componentRefDesc = messageList[i];
    messageData = messageData.replace(regExp, this.getReferenceComponentValue(screenId, baseDataGridName, componentRefDesc));
  }
  var dialogMessage = '[' + messageKey + ']' + messageData + '\n';
  this.warningMessageCodeList.push(dialogMessage);
};

expj.common.pscript.viewAlert = function (message) {
  setTimeout(function () {
    alert(message);
    expj.common.pscript.alertMessageFlag = false;
    if (expj.common.pscript.alertAfterFocusObj) {
      setTimeout(function () {
        expj.common.pscript.alertAfterFocusObj.focus();
        expj.common.pscript.alertAfterFocusObj = null;
      }, 1);
    }
  }, 1);
};

/**
 * 即時メッセージを表示する関数。<br>
 * @param messageKey メッセージコード
 */
expj.common.pscript.viewErrorMessage = function (screenId, baseDataGridName, message) {
  var messageList = message.split(':');
  var messageKey = messageList[0];
  var messageData = getMessageOnly(messageKey);
  for (var i = 1, len = messageList.length; i < len; i++) {
    var key = '\\{' + (i - 1) + '\\}';
    var regExp = new RegExp(key, 'g');
    var componentRefDesc = messageList[i];
    messageData = messageData.replace(regExp, expj.common.pscript.getReferenceComponentValue(screenId, baseDataGridName, componentRefDesc));
  }
  var dialogMessage = '[' + messageKey + ']' + messageData + '\n';
  expj.common.pscript.viewAlert(dialogMessage);
  expj.common.pscript.alertMessageFlag = true;
};

/**
 * 確認ダイアログを表示し、Submit前に確認を行う関数。<br>
 * エラーメッセージや警告メッセージが溜まっている場合、ここで出力する。<br>
 * 確認ダイアログでOKボタンを押すと、引数で指定した関数が実行される。<br>
 * キャンセルボタンを押すと、何もせずに処理を終了する。<br>
 * @param message    メッセージコード
 * @param okEvent    OKボタンを押した時に実行する関数
 */
expj.common.pscript.callConfirm = function (screenId, baseDataGridName, message, okEvent) {
  var dialogMessage = '';
  var messageData;
  var i, len;
  if (this.errorMessageCodeList.length > 0) {
    for (i = 0, len = this.errorMessageCodeList.length; i < len; i++) {
      messageData = this.errorMessageCodeList[i];
      dialogMessage += messageData;
    }
    expj.common.pscript.viewAlert(dialogMessage);
    this.init();
    return;
  }
  if (this.warningMessageCodeList.length > 0) {
    for (i = 0, len = this.warningMessageCodeList.length; i < len; i++) {
      messageData = this.warningMessageCodeList[i];
      dialogMessage += messageData;
    }
    dialogMessage += '\n\n';
    this.init();
  }
  
  var messageList = message.split(':');
  var messageKey = messageList[0];
  messageData = getMessageOnly(messageKey);
  for (i = 1, len = messageList.length; i < len; i++) {
    var key = '\\{' + (i - 1) + '\\}';
    var regExp = new RegExp(key, 'g');
    var componentRefDesc = messageList[i];
    messageData = messageData.replace(regExp, this.getReferenceComponentValue(screenId, baseDataGridName, componentRefDesc));
  }
  
  dialogMessage += '[' + messageKey + ']' + messageData;
  var result = confirm(dialogMessage);
  if (result) {
    expj.common.controlLoadingScreen(true);
    setTimeout(okEvent, expj.common.screenFrameLoadingTime);
  } else {
    // キャンセルボタンを押した時、起動ボタンの情報をクリアする
    expj.common.pscript.onClickTargetButtonData = null;
  }
};

/**
 * エラーメッセージや警告メッセージが溜まっている場合、出力する関数。<br>
 * メッセージが溜まっていない場合は、引数で指定した関数が実行される。<br>
 * @param submitProcess 実行する関数
 */
expj.common.pscript.callSubmit = function (submitProcess) {
  var dialogMessage = '';
  var messageData;
  var i, len;
  if (this.errorMessageCodeList.length > 0) {
    for (i = 0, len = this.errorMessageCodeList.length; i < len; i++) {
      messageData = this.errorMessageCodeList[i];
      dialogMessage += messageData;
    }
    expj.common.pscript.viewAlert(dialogMessage);
    this.init();
    return;
  }
  if (this.warningMessageCodeList.length > 0) {
    for (i = 0, len = this.warningMessageCodeList.length; i < len; i++) {
      messageData = this.warningMessageCodeList[i];
      dialogMessage += messageData;
    }
    this.init();
    if (confirm(dialogMessage)) {
      expj.common.controlLoadingScreen(true);
      setTimeout(submitProcess, expj.common.screenFrameLoadingTime);
      return;
    }
    return;
  }
  expj.common.controlLoadingScreen(true);
  setTimeout(submitProcess, expj.common.screenFrameLoadingTime);
};

/**
 * エラーメッセージや警告メッセージが溜まっている場合は出力する関数。<br>
 * エラーメッセージが表示、または警告メッセージでキャンセルを選択した時はtrue、<br>
 * それ以外の時はfalseを返却する。<br>
 * @returns {Boolean} true/false
 */
expj.common.pscript.callMessage = function () {
  var dialogMessage = '';
  var messageData;
  var i, len;
  if (this.errorMessageCodeList.length > 0) {
    for (i = 0, len = this.errorMessageCodeList.length; i < len; i++) {
      messageData = this.errorMessageCodeList[i];
      dialogMessage += messageData;
    }
    expj.common.pscript.viewAlert(dialogMessage);
    this.init();
    return true;
  }
  if (this.warningMessageCodeList.length > 0) {
    for (i = 0, len = this.warningMessageCodeList.length; i < len; i++) {
      messageData = this.warningMessageCodeList[i];
      dialogMessage += messageData;
    }
    this.init();
    if (confirm(dialogMessage)) {
      return false;
    }
    return true;
  }
  return false;
};

/**
 * VIEWのインスタンスを取得する関数。<br>
 * @param screenId     画面ID
 * @param datagridName DataGrid名
 * @returns VIEWのインスタンス
 */
expj.common.pscript.getViewInstanceFromViewMap = function (screenId, datagridName) {
  // 対象画面のVIEWマップを取得する
  // 取得に失敗したらnullを返却する
  var screenViewMap = expj.common.viewInstanceMap[screenId];
  if (typeof(screenViewMap) === 'undefined' || screenViewMap === null) {
    return null;
  }
  
  // 対象のVIEWを取得する
  // 取得に失敗したらnullを返却する
  var viewInstance = screenViewMap[datagridName];
  if (typeof(viewInstance) === 'undefined' || viewInstance === null) {
    return null;
  }
  return viewInstance;
};

/**
 * 指定したDataGridのデータを返却する。<br>
 * 第三引数にtrueを指定すると、選択中の行のみを対象にする。<br>
 * @param screenId     画面ID
 * @param datagridName DataGrid名
 * @param selected     取得対象の指定（trueの時は選択行、それ以外は全行取得）
 * @returns {Array}
 */
expj.common.pscript.getDataTableData = function (screenId, datagridName, selected) {
  var targetViewObj = $('#expj-' + screenId + '-' + datagridName);
  var dataList = [];
  var targetView = targetViewObj.get(0);
  var exView = targetView.getAttribute('data-viewtype');
  if (exView === 'ExView') {
    var rowList = targetView.OrteusView.bodyData;
    for (var i = 0, len = rowList.length; i < len; i++) {
      var rowObject = rowList[i];
      if (selected === true && rowObject.selected === false) {
        continue;
      }
      var rowData = {};
      rowData.index = rowObject.defaultIndex + 1;
      rowData.selected = rowObject.selected;
      var rowComponentData = {};
      // 列リストを取得する
      var rowChildList = rowObject.datalist;
      for (var j = 0, jlen = rowChildList.length; j < jlen; j++) {
        // 列を取得
        var colObject = rowChildList[j];
        // 本来のname属性値を取得
        var name = colObject.name;
        // name属性値が有効値であれば、コンポーネントの値を取得する
        if (typeof(name) === 'string' && name !== '') {
          if (colObject.type === 'label' || colObject.type === 'text' || colObject.type === 'hidden') {
              if(colObject.kind){
                //Ex専用kind適用関数呼び出し
                rowComponentData[name] = expj.common.pscript.setSpanKindDataEx(colObject, colObject.kind, 'VIEW');
              }else{
                rowComponentData[name] = expj.common.pscript.convertNumberValue(colObject.value, colObject.kind, 'VIEW');
              }
              if(rowComponentData[name]){
                //エスケープ戻す関数を呼び出し
                rowComponentData[name] = expj.common.sanitizeBack(rowComponentData[name]);
              }
          } else if (colObject.type === 'checkbox' || colObject.type === 'radio') {
            if (colObject.checked) {
              rowComponentData[name] = 'true';
            } else {
              rowComponentData[name] = 'NULL';
            }
          } else if (colObject.type === 'select') {
            rowComponentData[name] = String(colObject.value);
          }
        }
      }
      rowData.componentData = rowComponentData;
      // リストにデータを格納する
      dataList.push(rowData);
    }
  } else {
    var rowList = targetViewObj.find('.orteusView_BodyArea tbody tr');
    for (var i = 0, len = rowList.length; i < len; i++) {
      var trObject = $(rowList[i]);
      if (selected === true && !trObject.hasClass('selected')) {
        continue;
      }
      var rowData = {};
      var defaultIndex = rowList[i].getAttribute('data-defaultRowIndex');
      rowData.index = Number(defaultIndex) + 1;
      rowData.selected = trObject.hasClass('selected');
      var rowComponentData = {};
      // <td>タグのリストを取得する
      var rowChildList = rowList[i].childNodes;
      for (var j = 0, jlen = rowChildList.length; j < jlen; j++) {
        // <td>タグを取得
        var colObject = rowChildList[j];
        // <td>タグの子要素を取得
        var tagObject = colObject.childNodes[0];
        if (typeof(tagObject) !== 'undefined') {
          // 本来のname属性値を取得
          var name = tagObject.getAttribute('data-name');
          // name属性値が有効値であれば、コンポーネントの値を取得する
          if (typeof(name) === 'string' && name !== '') {
            if (tagObject.nodeName === 'SPAN') {
              rowComponentData[name] = expj.common.pscript.convertNumberValue(tagObject.textContent, tagObject.getAttribute('data-kind'), 'VIEW');
            } else if (tagObject.nodeName === 'INPUT') {
              if (tagObject.type === 'checkbox' || tagObject.type === 'radio') {
                if (tagObject.checked) {
                  rowComponentData[name] = 'true';
                } else {
                  rowComponentData[name] = 'NULL';
                }
              } else {
                rowComponentData[name] = expj.common.pscript.convertNumberValue(tagObject.value, tagObject.getAttribute('data-kind'), 'VIEW');
              }
            } else if (tagObject.nodeName === 'SELECT') {
              rowComponentData[name] = String(tagObject.value);
            }
          }
        }
      }
      rowData.componentData = rowComponentData;
      // リストにデータを格納する
      dataList.push(rowData);
    }
  }
  return dataList;
};

/**
 * 引数で指定したVIEWのデータを取得する関数。<br>
 * この関数では、VIEWのすべての要素を取得する。<br>
 * @param screenId     画面ID
 * @param datagridName DataGrid名
 * @returns {Array}    VIEWデータ
 */
expj.common.pscript.getPreviewVIEWCells = function (screenId, datagridName) {
  // すべての行データを格納する配列を用意
  var dataList = [];
  // すべての行データ（複数）を取得
  var rowList = this.getDataTableData(screenId, datagridName, false);
  // 用意した配列に行データを格納する
  for (var i = 0, len = rowList.length; i < len; i++) {
    var data = rowList[i];
    var rowParamData = {};
    rowParamData[datagridName + '_rownum'] = data.index;
    rowParamData[datagridName + '_selected'] = data.selected;
    rowParamData.rowData = data.componentData;
    dataList.push(rowParamData);
  }
  return dataList;
};

/**
 * 引数で指定したVIEWのデータを取得する関数。<br>
 * この関数では、選択中のVIEWの要素を取得する。<br>
 * @param screenId     画面ID
 * @param datagridName DataGrid名
 * @returns {Array}    VIEWデータ
 */
expj.common.pscript.getSelectedVIEWCells = function (screenId, datagridName) {
  // 選択中の行データを格納する配列を用意
  var dataList = [];
  // 選択中の行データ（複数）を取得
  var rowList = this.getDataTableData(screenId, datagridName, true);
  // 用意した配列に行データを格納する
  for (var i = 0, len = rowList.length; i < len; i++) {
    var data = rowList[i];
    var rowParamData = {};
    rowParamData[datagridName + '_rownum'] = data.index;
    rowParamData[datagridName + '_selected'] = data.selected;
    rowParamData.rowData = data.componentData;
    dataList.push(rowParamData);
  }
  return dataList;
};

/**
 * VIEWを全行選択状態にする関数。<br>
 * @param screenId     画面ID
 * @param datagridName DataGrid名
 */
expj.common.pscript.selectVIEWAllRow = function (screenId, datagridName) {
  var targetViewObj = $('#expj-' + screenId + '-' + datagridName);
  var targetView = targetViewObj.get(0);
  var exView = targetView.getAttribute('data-viewtype');
  if (exView === 'ExView') {
    var rowCount = targetView.OrteusView.bodyData.length;
    if (rowCount === 1) {
      if (targetView.OrteusView.bodyData[0].selectable) {
        targetView.OrteusView.bodyData[0].selected = false;
        var selectedRows = $('#expj-' + screenId + '-' + datagridName).find('div.orteusView_BodyArea tbody tr');
        if (selectedRows.hasClass('selected')) {
          selectedRows.removeClass('selected');
        }
        selectedRows.click();
      }
    } else {
      // 選択中の行（複数）を取得
      targetView.OrteusView.selectedAllRow();
      expj[screenId][datagridName].executeAllOnClick();
      expj[screenId].executeAllOnDecision();
    }
  } else {
    var selectedRows = $('#expj-' + screenId + '-' + datagridName).find('div.orteusView_BodyArea tbody tr').not('[data-selectable="false"]');
    if(selectedRows.length == 1){
      if (selectedRows.hasClass('selected')) {
        selectedRows.removeClass('selected');
      }
      selectedRows.click();
    } else {
      // 選択中の行（複数）を取得
      selectedRows.addClass('selected');
      console.log('execute ' + datagridName + '.onClick');
      expj[screenId][datagridName].executeAllOnClick();
      expj[screenId].executeAllOnDecision();
    }
  }
};

/**
 * VIEWを全行非選択状態にする関数。<br>
 * @param screenId     画面ID
 * @param datagridName DataGrid名
 */
expj.common.pscript.unselectVIEWAllRow = function (screenId, datagridName) {
  var targetViewObj = $('#expj-' + screenId + '-' + datagridName);
  var targetView = targetViewObj.get(0);
  var exView = targetView.getAttribute('data-viewtype');
  if (exView === 'ExView') {
    targetView.OrteusView.unselectedAllRow();
    expj[screenId][datagridName].executeAllOnClick();
    expj[screenId].executeAllOnDecision();
  } else {
    // 選択中の行（複数）を取得
    $('#expj-' + screenId + '-' + datagridName).find('div.orteusView_BodyArea tbody tr').removeClass('selected');
    console.log('execute ' + datagridName + '.onClick');
    expj[screenId][datagridName].executeAllOnClick();
    expj[screenId].executeAllOnDecision();
  }
};

/**
 * 指定したVIEWの列に値を設定する関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @param value 設定する値
 */
expj.common.pscript.setVIEWColumn = function (screenId, baseDataGridName, componentRefDesc, value) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return;
  }
  // 変数の取得
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  // 選択中の行（複数）を取得
  var htmlId = '#expj-' + screenId + '-' + datagridName;
  var componentClass = '.expj-' + screenId + '-' + datagridName + '-' + componentName;
  var rowList = $(htmlId).find(componentClass);
  for (var i = 0, len = rowList.length; i < len; i++) {
    var target = rowList[i];
    if (target.nodeName === 'INPUT') {
      var type = target.type;
      if (type === 'checkbox' || type === 'radio') {
        if (value === 'true') {
          target.checked = true;
        } else {
          target.checked = false;
        }
      } else {
        target.value = value;
      }
    } else if (target.nodeName === 'SPAN'){
      target.textContent = value;
    } else if (target.nodeName === 'SELECT') {
      target.value = value;
    }
  }
};

/**
 * リクエストパラメータを取得する関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param ComponentRefDesc コンポーネント参照記述
 * @param servletName      サーブレット名
 * @returns リクエストパラメータ
 */
expj.common.pscript.createParameter = function (screenId, baseDataGridName, ComponentRefDesc, servletName) {
  var params = this.getRequestParameter(screenId, baseDataGridName, ComponentRefDesc);
  var submitScreen = document.getElementById('expj-business-screen-tabs-body-' + screenId).getAttribute('data-loadingPage');
  if (submitScreen === null) {
    submitScreen = screenId;
  }
  var result = {};
  result.SUBMIT_PROGRAM = servletName;
  result.SUBMIT_SCREEN = submitScreen;
  result._FLASHPARAMETERVALUES_ = params;
  return result;
};

/**
 * コンポーネントの値を編集前の値に戻す関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 */
expj.common.pscript.backInputValue = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return false;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  if (defChar === '_') {
    // HTML上のIDを生成
    var id = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
    var component = document.getElementById(id);
    if (component !== null && typeof(component.dataPrevValue) !== 'undefined') {
      component.value = component.dataPrevValue;
      
      //フォーカス戻る
      var nextEl = $(document.getElementById(id));
      nextEl.focus();
      //FLGより、内容全選択
      if(expj.common.config.textInputSelectAllFLG == true && nextEl.get(0).tagName === 'INPUT' && nextEl.get(0).getAttribute('type') === 'text'){
          nextEl.focus(function(){
          $(this).select();
        });
      }
    }
  }
};

/**
 * 確認ダイアログを表示する関数。<br>
 * 本関数はCFMPUT専用である。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @param messageCode      メッセージコード
 * @param yesFunc          OK時の処理を定義した関数
 * @param noFunc           キャンセル時の処理を定義した関数
 */
expj.common.pscript.executeConfirmPut = function (screenId, baseDataGridName, componentRefDesc, messageCode, yesFunc, noFunc) {
  var dialogMessage = '[' + messageCode + ']' + getMessageOnly(messageCode) + '\n';
  if (confirm(dialogMessage)) {
    yesFunc();
  } else {
    noFunc();
  }
};

/**
 * プリンタダイアログを表示する関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @param servletName      サーブレット名
 * @param printPattern     印刷パターン
 */
expj.common.pscript.viewPrinterDialog = function (screenId, baseDataGridName, componentRefDesc, servletName, printPattern) {
  var dialogMessage = '';
  var messageData;
  var i, len;
  // エラーダイアログ、警告ダイアログで表示する内容があるか確認
  // ある場合は表示し、終了する
  if (this.errorMessageCodeList.length > 0) {
    for (i = 0, len = this.errorMessageCodeList.length; i < len; i++) {
      messageData = this.errorMessageCodeList[i];
      dialogMessage += messageData;
    }
    expj.common.pscript.viewAlert(dialogMessage);
    this.init();
    return;
  }
  if (this.warningMessageCodeList.length > 0) {
    for (i = 0, len = this.warningMessageCodeList.length; i < len; i++) {
      messageData = this.warningMessageCodeList[i];
      dialogMessage += messageData;
    }
    this.init();
    if (!confirm(dialogMessage)) {
      return;
    }
  }
  
  // ローディング画面を表示
  expj.common.controlLoadingScreen(true);
  
  setTimeout(function () {
    // 印刷ダイアログに投げるパラメータを生成
    var printerId = 'ZZ0020010';
    var printerServletName = printerId + 'Servlet';
    var requestParameter = {
      'SUBMIT_PROGRAM' : printerServletName,
      'NEW_SCREEN_FLG' : 'FALSE',
      'MSG_BUSINESS_GROUP_CD' : 'B0012',
      'SUBMIT_SCREEN' : screenId,
      'MSG_MESSAGE_ID' : '0',
      'MSG_BUSINESS_CD' : 'G0112',
      'TARGET_WINDOW' : 'G0234'
    };
    // Submitし、レスポンスを受け取る
    var response = expj.common.accessBusinessScreen('POST', printerServletName, requestParameter);
    // レスポンスを解析
    var result = expj.common.analyzeBusinessScreenResponse(printerId, response);
    
    if (result.screenId === 'error') {
      // エラーが発生し、エラーページが返ってきた時。
      var tabBodyId = '#expj-business-screen-tabs-body-' + screenId;
      // DOMの削除
      $(tabBodyId).html('');
      // 業務画面固有のJavaScriptを削除
      expj.common.deleteBusinessScreenJavaScript(screenId);
      // 業務画面固有のDetailWindowの削除
      expj.common.deleteBusinessScreenDialog(screenId);
      // 業務画面固有のJavaScriptを画面枠部品に再登録
      expj.common.appendBusinessScreenHtmlDialog(screenId, result.dialogBodyList);
      expj.common.appendBusinessScreenJavaScriptSource(screenId, result.scriptSrcList);
      expj.common.appendBusinessScreenJavaScriptText(screenId, result.scriptTextList);
      
      // タブの内容を更新
      $(tabBodyId).html(result.tabBody);
      
      // Printerダイアログ呼び出しに失敗した（エラー画面表示）の場合
      $('#expj-business-screen-tabs-body-' + screenId + ' button').on('click', function() {
        // 閉じるダイアログの起動
        expj.common.closeCommonPage(screenId);
      });
      
      expj.error.viewConsole();
      expj.error.viewConsole = function () {};
      return;
    }
    // PrinterダイアログのJavaScriptを追加
    expj.common.appendBusinessScreenJavaScriptText(printerId, result.scriptTextList);
    // Printerダイアログの詳細ウィンドウを追加
    expj.common.appendBusinessScreenHtmlDialog(printerId, result.dialogBodyList);
    try {
      // onLoadの実行
      expj.ZZ0020010.expj_onLoad();
    } catch (e) {
      console.log(e);
    }
    
    // OKボタンを押した時のイベント定義
    var okEvent = function () {
      // ローディング画面の起動
      expj.common.controlLoadingScreen(true);
      
      setTimeout(function () {
        // Servletに送るパラメータを生成
        var printRequestParameter = '';
        var selectPrinterData = expj.ZZ0020010.getSelectPrinter();
        if (selectPrinterData !== null) {
          for (var propName in selectPrinterData) {
            var propValue = selectPrinterData[propName];
            printRequestParameter += propName + '%=%' + propValue + '%&%';
          }
        }
        expj.common.pscript.makePrintParameterFlg = true;
        printRequestParameter += expj.common.pscript.getRequestParameter(screenId, baseDataGridName, componentRefDesc);
        expj.common.pscript.makePrintParameterFlg = false;
        printRequestParameter += 'SUBMIT_BUTTON_TYPE' + '%=%' + '1' + '%&%';
        printRequestParameter += 'NEW_SCREEN_FLG' + '%=%' + 'FALSE' + '%&%';
        var result = {};
        result.SUBMIT_PROGRAM = servletName;
        result.SUBMIT_SCREEN = screenId;
        result._FLASHPARAMETERVALUES_ = printRequestParameter;
        // 印刷ダイアログのクローズ
        expj.ZZ0020010.closeDialog();
        // Submitとレスポンス受信
        var printResponse = expj.common.accessBusinessScreen('POST', servletName, result);
        // 業務画面の更新
        var contents = expj.common.analyzeBusinessScreenResponse(screenId, printResponse);
        expj.common.updateBusinessScreenTab(screenId, contents);
        
      }, expj.common.screenFrameLoadingTime);
    };
    
    // キャンセルボタンを押した時のイベント定義
    var cancelEvent = function () {
      expj.common.pscript.onClickTargetButtonData = null;
      expj.ZZ0020010.closeDialog();
    };
    
    // パターンパラメータからラジオボタンの状態を操作する
    var patternArray = printPattern.split(',');
    var focusTarget = null;
    var hasShow = false;
    for (i = 0; i < 3; i++) {
      var pattern = 'M';
      if (i < patternArray.length) {
        pattern = patternArray[i].trim();
        if (!(pattern === 'C' || pattern === 'M' || pattern === 'U' || pattern === 'H')) {
          pattern = 'M';
        }
      }
      var id = 'expj-ZZ0020010-print-dialog-r_REPORT' + (i + 1);
      var component = document.getElementById(id);
      if (pattern === 'C') {
        component.setAttribute('checked', 'checked');
        component.removeAttribute('disabled');
        focusTarget = component;
        hasShow = true;
      } else if (pattern === 'M') {
        component.removeAttribute('checked');
        component.setAttribute('disabled', 'disabled');
        hasShow = true;
      } else if (pattern === 'U') {
        component.removeAttribute('checked');
        component.removeAttribute('disabled');
        hasShow = true;
      } else {
        component.removeAttribute('checked');
        component.removeAttribute('disabled');
        $(component.parentElement).css('display', 'none');
      }
      if(i == 2 && hasShow == false){
        component.setAttribute('checked', 'checked');
      }
    }
    
    // 印刷ダイアログの起動
    expj.ZZ0020010.openDialog(okEvent, cancelEvent);
    
    // ローディング画面の解除
    expj.common.controlLoadingScreen(false);
    
    // 印刷ダイアログの一番上のラジオボタンにフォーカスを当てる。
    $(focusTarget).focus();
    
    // 印刷ダイアログ後にスクロールバーが表示されてしまう問題に対処(chrome)
    expj.common.tuningScreenOverflow();
    
  }, expj.common.screenFrameLoadingTime);
};

/**
 * PEEKERのパラメータ履歴を残すマップ<br>
 * 残す対象はsqlparam属性に定数として定義されたものである。<br>
 */
expj.common.pscript.peekerParamHistoryMap = {};

/**
 * PEEKERのパラメータ（定数）をチェックし、正式な値を求める関数。<br>
 * パラメータ（定数）が文字列のnullの時は、前回の値を返却する。<br>
 * それ以外の時は値をそのまま返却する。<br>
 * 前回の値が不定な場合は、空文字を返却する。<br>
 * @param screenId 画面ID
 * @param componentName コンポーネント名
 * @param paramName パラメータ名
 * @param paramValue パラメータ値
 * @returns {String} 正式なパラメータ値
 */
expj.common.pscript.getPeekerParam = function (screenId, componentName, paramName, paramValue) {
  var resultValue = '';
  // 画面固有の履歴マップを取得
  var screenMap = expj.common.pscript.peekerParamHistoryMap[screenId];
  var componentMap = {};
  if (expj.common.checkNameSpace(screenMap)) {
    componentMap = screenMap[componentName];
    if (!expj.common.checkNameSpace(componentMap)) {
      componentMap = {};
      screenMap[componentName] = componentMap;
    }
    if (paramValue === 'null') {
      // 前回の値を取得
      var value = componentMap[paramName];
      if (expj.common.checkNameSpace(value)) {
        resultValue = value;
      } else {
        resultValue = '';
      }
    } else {
      resultValue = paramValue;
    }
  } else {
    // 履歴マップがない場合、マップを生成して登録する
    screenMap = {};
    expj.common.pscript.peekerParamHistoryMap[screenId] = screenMap;
    componentMap = {};
    screenMap[componentName] = componentMap;
    // 設定しようとしたパラメータ値が"null"の場合、空文字にする
    if (paramValue === 'null') {
      resultValue = '';
    } else {
      resultValue = paramValue;
    }
  }
  // 履歴マップに値を登録する
  componentMap[paramName] = resultValue;
  return resultValue;
};

/**
 * DGCOLSET専用の関数。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @param setData          セットするデータ
 */
expj.common.pscript.setDGCOLSET = function (screenId, baseDataGridName, componentRefDesc, setData) {
  if (typeof(setData) === 'number') {
    this.setVIEWColumn(screenId, baseDataGridName, componentRefDesc, setData);
  } else {
    // コンポーネント参照記述の解析
    var descJson = this.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
    // コンポーネント参照記述を解析できなかった場合はnullを返却する
    if (descJson === null) {
      return false;
    }
    // 変数の取得
    var datagridName = descJson.datagridName;
    var componentName = descJson.componentName;
    
    // 選択中の行（複数）を取得
    var htmlId = '#expj-' + screenId + '-' + datagridName;
    var componentClass = '.expj-' + screenId + '-' + datagridName + '-' + componentName;
    var rowList = $(htmlId).find(componentClass);
    for (var i = 0, len = rowList.length; i < len; i++) {
      var target = rowList[i];
      if (target.nodeName === 'INPUT') {
        target.value = setData[i];
      } else if (target.nodeName === 'SPAN'){
        expj.common.pscript.setSpanData(target, setData[i]);
      } else if (target.nodeName === 'SELECT') {
        target.value = setData[i];
      }
    }
  }
  return true;
};

//-------------------------------------------------------------------------------------------------------------------------------
/**
 * EXPLANNER/J(HTML5版)のPスクリプト処理部品用名前空間<br>
 */
expj.common.pscript.func = {};

/**
 * PスクリプトのLEN関数の実装。<br>
 * 引数で与えられた文字の文字数を返す。<br>
 * @param screenId         画面ID
 * @param baseDataGridName ベースDataGridのname属性値
 * @param componentRefDesc コンポーネント参照記述または固定テキスト
 * @returns 引数で与えた文字列の文字数
 */
expj.common.pscript.func.LEN = function (screenId, baseDataGridName, componentRefDesc) {
  // 文字列を取得する
  var value = this.getPFuncParaText(screenId, baseDataGridName, componentRefDesc);
  // 文字列の取得に失敗した場合は0を返却する
  if (value === null) {
    return null;
  }
  // 文字列の長さを返却する
  return value.length;
};

/**
 * 1byteとして扱う文字リスト（非ASCII)
 */
expj.common.pscript.func.LENB_ONE_BYTE_TEXT = '｡｢｣､･ｦｧｨｩｪｫｬｭｮｯｰｱｲｳｴｵｶｷｸｹｺｻｼｽｾｿﾀﾁﾂﾃﾄﾅﾆﾇﾈﾉﾊﾋﾌﾍﾎﾏﾐﾑﾒﾓﾔﾕﾖﾗﾘﾙﾚﾛﾜﾝﾞﾟ';

/**
 * PスクリプトのLENB関数の実装。<br>
 * 引数で与えられた文字の文字数をShift_JIS換算のバイト数で返す。<br>
 * @param screenId
 * @param baseDataGridName
 * @param componentRefDesc
 * @returns {Number}
 */
expj.common.pscript.func.LENB = function (screenId, baseDataGridName, componentRefDesc) {
  //文字列を取得する
  var value = this.getPFuncParaText(screenId, baseDataGridName, componentRefDesc);
  //文字列の取得に失敗した場合は0を返却する
  if (value === null) {
    return null;
  }
  var count = 0;
  for (var i = 0, len = value.length; i < len; i++) {
    var c = value.charAt(i);
    if (this.LENB_ONE_BYTE_TEXT.indexOf(c) !== -1) {
      count++;
    } else {
      var bytecode = value.charCodeAt(i);
      // 128以下は半角扱いとする
      // それ以外は全角として扱い、2バイト換算する。
      if (bytecode < 128) {
        count++;
      } else {
        count += 2;
      }
    }
  }
  return count;
};

/**
 * 指定したコンポーネント参照記述から文字列を取得する関数。<br>
 * コンポーネント参照記述が不正、またはコンポーネントが存在しない場合は空文字が返される。<br>
 * コンポーネント参照記述に当たる変数が固定文字列の場合、その値をそのまま返却する。<br>
 * @param screenId         画面ID
 * @param baseDataGridName ベースDataGridのname属性値
 * @param componentRefDesc コンポーネント参照記述または固定テキスト
 * @returns コンポーネント参照の解析で得た文字列
 */
expj.common.pscript.func.getPFuncParaText = function (screenId, baseDataGridName, componentRefDesc) {
  // 文字列の長さが0の時はここで空文字を返却する
  if (componentRefDesc.length === 0) {
    return '';
  }
  // 規程文字の取得
  var defChar = componentRefDesc.charAt(0);
  if (defChar === '_' || defChar === '?') {
    // 規程文字が半角アンダーバーまたは半角クエスチョンの場合はコンポーネント参照とする
    // コンポーネントの値を取得する
    var value = expj.common.pscript.getReferenceComponentValue(screenId, baseDataGridName, componentRefDesc);
    // 値が取得できなかった場合は0を返却する
    if (value === null) {
      return null;
    }
    if (Array.isArray(value)) {
      return value[0];
    }
    // 値が取得できた場合はその長さを返却する
    return value;
  } else {
    // それ以外の場合は固定テキストとし、その長さを返却する
    return componentRefDesc;
  }
};

/**
 * PスクリプトのCHARAT関数の実装。<br>
 * 引数として設定された文字列内の1文字を返却する関数。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName DataGrid名
 * @param componentRefDesc コンポーネント参照記述または固定文字列
 * @param indexText 先頭から数えた取得文字の位置（0始まり）
 * @returns 該当する文字1字
 */
expj.common.pscript.func.CHARAT = function (screenId, baseDataGridName, componentRefDesc, indexText) {
  // インデックスの数値化
  // ここで変換に失敗した場合はnullを返却する
  var index = parseInt(indexText);
  if (isNaN(index)) {
    return null;
  }
  // 文字列を取得する
  var value = this.getPFuncParaText(screenId, baseDataGridName, componentRefDesc);
  // 値が取得できなかった場合は0を返却する
  if (value === null) {
    return null;
  }
  // インデックスがマイナスまたは文字列の長さよりも長い場合はnullを返却する
  if (index < 0 || index >= value.length) {
    return "";
  }
  // インデックスで指定された文字を返却する
  return value.charAt(index);
};

/**
 * PスクリプトのTO_YYYY_MM関数の実装。<br>
 * 引数として設定された日付の書式を変更する関数。<br>
 * 引数の書式は「YYYY/MM/DD」形式、戻り値の書式は「YYYY/MM」形式固定である。<br>
 * 引数の書式が上記以外の場合は動作を保証しない。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName DataGrid名
 * @param componentRefDesc コンポーネント参照記述または固定文字列（YYYY/MM/DD）
 * @returns 日付文字列（YYYY/MM）
 */
expj.common.pscript.func.TO_YYYY_MM = function (screenId, baseDataGridName, componentRefDesc) {
  //文字列を取得する
  var value = this.getPFuncParaText(screenId, baseDataGridName, componentRefDesc);
  //文字列の取得に失敗した場合は0を返却する
  if (value === null) {
    return null;
  }
  // YYYY/MM/DD形式で日付を示すテキストを読み込む
  mObj = moment(value, 'YYYY/MM/DD');
  // YYYY/MM形式で日付を示すテキストを返却する
  return mObj.format('YYYY/MM');
};

/**
 * PスクリプトのTO_YY_MM関数の実装。<br>
 * 引数として設定された日付の書式を変更する関数。<br>
 * 引数の書式は「YYYY/MM/DD」形式、戻り値の書式は「YY/MM」形式固定である。<br>
 * 引数の書式が上記以外の場合は動作を保証しない。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName DataGrid名
 * @param componentRefDesc コンポーネント参照記述または固定文字列（YYYY/MM/DD）
 * @returns 日付文字列（YY/MM）
 */
expj.common.pscript.func.TO_YY_MM = function (screenId, baseDataGridName, componentRefDesc) {
  //文字列を取得する
  var value = this.getPFuncParaText(screenId, baseDataGridName, componentRefDesc);
  //文字列の取得に失敗した場合は0を返却する
  if (value === null) {
    return null;
  }
  //YYYY/MM/DD形式で日付を示すテキストを読み込む
  mObj = moment(value, 'YYYY/MM/DD');
  //YYYY/MM形式で日付を示すテキストを返却する
  return mObj.format('YY/MM');
};

/**
 * PスクリプトのTO_MM_DD関数の実装。<br>
 * 引数として設定された日付の書式を変更する関数。<br>
 * 引数の書式は「YYYY/MM/DD」形式、戻り値の書式は「MM/DD」形式固定である。<br>
 * 引数の書式が上記以外の場合は動作を保証しない。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName DataGrid名
 * @param componentRefDesc コンポーネント参照記述または固定文字列（YYYY/MM/DD）
 * @returns 日付文字列（MM/DD）
 */
expj.common.pscript.func.TO_MM_DD = function (screenId, baseDataGridName, componentRefDesc) {
  //文字列を取得する
  var value = this.getPFuncParaText(screenId, baseDataGridName, componentRefDesc);
  //文字列の取得に失敗した場合は0を返却する
  if (value === null) {
    return null;
  }
  mObj = moment(value, 'YYYY/MM/DD');
  return mObj.format('MM/DD');
};

/**
 * PスクリプトのADDDATE関数の実装。<br>
 * 引数として設定された日付に日数を加算して戻す関数。<br>
 * 引数の書式は「YYYY/MM/DD」形式、戻り値の書式は「YYYY/MM/DD」形式固定である。<br>
 * 引数の書式が上記以外の場合は動作を保証しない。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName DataGrid名
 * @param componentRefDesc コンポーネント参照記述または固定文字列（YYYY/MM/DD）
 * @param dateIndexText    加算日数（整数、マイナス値可能）
 * @returns 日付文字列（YYYY/MM/DD）
 */
expj.common.pscript.func.ADDDATE = function (screenId, baseDataGridName, componentRefDesc, dateIndexText) {
  // インデックスの数値化
  // ここで変換に失敗した場合はnullを返却する
  var index = parseInt(dateIndexText);
  if (isNaN(index)) {
    return null;
  }
  // コンポーネントの値を取得する
  var value = expj.common.pscript.getReferenceComponentValue(screenId, baseDataGridName, componentRefDesc);
  //文字列の取得に失敗した場合は0を返却する
  if (value === null) {
    return null;
  }
  mObj = moment(value, 'YYYY/MM/DD');
  var date = mObj.date();
  date += index;
  mObj.date(date);
  return mObj.format('YYYY/MM/DD');
};

/**
 * PスクリプトのCOLSUM関数の実装。<br>
 * VIEW内の全行を対象として項目値の合計を戻すVIEW用の関数である。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @returns VIEWの項目値の合計
 */
expj.common.pscript.func.COLSUM = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = expj.common.pscript.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return null;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  var total = 0;
  var dataList = expj.common.pscript.getDataTableData(screenId, datagridName, false);
  for (var i = 0, len = dataList.length; i < len; i++) {
    var targetData = dataList[i];
    var data = targetData.componentData[componentName];
    data = Number(data);
    if (isNaN(data)) {
      return data;
    }
    total += data;
    total = Number(total.toFixed(15));
  }
  return total;
};

/**
 * PスクリプトのSELSUM関数の実装。<br>
 * VIEW内の選択行を対象として項目値の合計を戻す関数。<br>
 * @param screenId         業務画面ID
 * @param baseDataGridName DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @returns 選択中のVIEWの項目値の合計
 */
expj.common.pscript.func.SELSUM = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = expj.common.pscript.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return null;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  var total = 0;
  var dataList = expj.common.pscript.getDataTableData(screenId, datagridName, true);
  for (var i = 0, len = dataList.length; i < len; i++) {
    var targetData = dataList[i];
    var data = targetData.componentData[componentName];
    data = Number(data);
    if (isNaN(data)) {
      return data;
    }
    total += data;
    total = Number(total.toFixed(15));
  }
  return total;
};

/**
 * DGCOLSETで使用されるSUM関数の実装。<br>
 * @param screenId         画面ID
 * @param baseDataGridName 保管用DataGrid名
 * @param componentRefDesc コンポーネント参照記述
 * @returns expj.common.pscript.setDGCOLSET関数に渡すデータ配列
 */
expj.common.pscript.func.SUM = function (screenId, baseDataGridName, componentRefDesc) {
  // コンポーネント参照記述の解析
  var descJson = expj.common.pscript.getReferenceComponentDescription(baseDataGridName, componentRefDesc);
  // コンポーネント参照記述を解析できなかった場合はnullを返却する
  if (descJson === null) {
    return null;
  }
  // 変数の取得
  var defChar = descJson.defChar;
  var datagridName = descJson.datagridName;
  var componentName = descJson.componentName;
  
  var result = [];
  var total = 0;
  var dataList = expj.common.pscript.getDataTableData(screenId, datagridName, false);
  for (var i = 0, len = dataList.length; i < len; i++) {
    if (isNaN(total)) {
      result.push(total);
      continue;
    }
    var targetData = dataList[i];
    var data = Number(targetData.componentData[componentName]);
    if (isNaN(data)) {
      total = Number.NaN;
    } else {
      total += data;
      total = Number(total.toFixed(15));
    }
    result.push(total);
  }
  return result;
};