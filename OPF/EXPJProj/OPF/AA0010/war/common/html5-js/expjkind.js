// 名前空間チェック
if (typeof(expj) === 'undefined' || expj === null) {
  expj = {};
}
if (typeof(expj.common) === 'undefined' || expj.common === null) {
  expj.common = {};
}
if (typeof(expj.common.pscript) === 'undefined' || expj.common.pscript === null) {
  expj.common.pscript = {};
}

/**
 * バージョン管理用
 */
if (typeof(expj.common.version) === 'undefined' || expj.common.version === null) {
  expj.common.version = {};
}
expj.common.version.expjkind = 'expjkind.js Ver1.0.13';


/**
 * EXPLANNER/J(HTML5版)のPスクリプト(KIND)処理部品用名前空間<br>
 */
expj.common.pscript.kind = {};

/**
 * IME入力中であるか否かを管理するフラグ<br>
 * trueの時はIME入力中を示す。<br>
 */
expj.common.pscript.kind.imeFlg = false;

expj.common.pscript.kind.tab = false;

/**
 * 指定した画面IDのINPUTTEXTに書式イベントを適用する関数。<br>
 * この関数は各画面の初期化関数から呼び出される。<br>
 * @param screenId 画面IDのセレクタ
 */
expj.common.pscript.kind.applyKind = function (screenId) {
  $(screenId).find('input[type="text"], input[type="password"]').each(function () {
    // コンポーネントオブジェクトの取得
    var component = $(this);
    // コンポーネントに設定された書式を確認
    expj.common.pscript.kind.checkKind(this);
    // コンポーネント初期値と最終入力値の初期化
    this.kindData.initFlg = false;
    this.kindData.lastState = null;

    // 書式が正常であるか確認（hasKind==trueの時は正常）
    if (this.kindData.hasKind) {
      // 書式が正常に設定されている場合
      // 既に入力されている値の書式適用
      expj.common.pscript.kind.setKind(this);
      // フォーカスが外れた時のイベントを追加する
      component.bind('blur', function () {
        if (this.isContextMenu !== true) {
          expj.common.pscript.kind.setKind(this);
        }
      });
      // フォーカスが入った時のイベントを追加する
      component.bind('focus', function () {
        if (this.isContextMenu !== true) {
          if (this.noChangeBeforeValueFlg === true) {
            this.noChangeBeforeValueFlg = false;
          } else {
            this.onFocusValue = this.value;
          }
          if (expj.common.pscript.kind.tab) {
            expj.common.pscript.kind.cursorPos(this);
            this.select();
            expj.common.pscript.kind.tab = false;
          } else {
            expj.common.pscript.kind.cursorPos(this);
          }
        } else {
          this.isContextMenu = false;
        }
      });
      // 文字が入力された時のイベントを追加する
      component.bind('input', function (event) {
        expj.common.pscript.kind.checkInput(this);
        expj.common.pscript.kind.imeFlg = false;
      });
      // 文字が入力された時のイベント（IME対応）を追加する
      component.bind('keydown', function (event) {
        // IME時はキーコード229が来る
        // この時はIMEフラグを立てる
        if (event.keyCode === 229) {
          expj.common.pscript.kind.imeFlg = true;
        }
      });
      // 文字が入力された時のイベント（IME対応）を追加する
      component.bind('keypress', function (event) {
      });
      // 文字が入力された時のイベント（IME対応）を追加する
      component.bind('keyup', function (event) {
        if (expj.common.pscript.kind.imeFlg && event.keyCode === 13) {
          expj.common.pscript.kind.imeFlg = false;
          expj.common.pscript.kind.checkInput(this);
        } else {
          expj.common.pscript.kind.imeFlg = false;
        }
      });
    } else {
      this.kindData.kind = '';
      // 既に入力されている値の書式適用
      expj.common.pscript.kind.setNoKind(this);
      // フォーカスが外れた時のイベントを追加する
      component.bind("blur", function () {
        if (this.isContextMenu !== true) {
          expj.common.pscript.kind.setNoKind(this);
        }
      });
      // フォーカスが入った時のイベントを追加する
      component.bind('focus', function () {
        if (this.isContextMenu !== true) {
          if (this.noChangeBeforeValueFlg === true) {
            this.noChangeBeforeValueFlg = false;
          } else {
            this.onFocusValue = this.value;
          }
          if (expj.common.pscript.kind.tab) {
            expj.common.pscript.kind.cursorPos(this);
            this.select();
            expj.common.pscript.kind.tab = false;
          } else {
            expj.common.pscript.kind.cursorPos(this);
          }
        } else {
          this.isContextMenu = false;
        }
      });
      // 文字が入力された時のイベントを追加する
      component.bind("input", function (event){
        expj.common.pscript.kind.checkInput(this);
        expj.common.pscript.kind.imeFlg = false;
      });
      // 文字が入力された時のイベント（IME対応）を追加する
      component.bind('keydown', function (event) {
        // IME時はキーコード229が来る
        // この時はIMEフラグを立てる
        if (event.keyCode === 229) {
          expj.common.pscript.kind.imeFlg = true;
        }
      });
      // 文字が入力された時のイベント（IME対応）を追加する
      component.bind('keypress', function (event) {
      });
      // 文字が入力された時のイベント（IME対応）を追加する
      component.bind('keyup', function (event) {
        if (expj.common.pscript.kind.imeFlg && event.keyCode === 13) {
          expj.common.pscript.kind.imeFlg = false;
          expj.common.pscript.kind.checkInput(this);
        } else {
          expj.common.pscript.kind.imeFlg = false;
        }
      });
    }
  });
  
  $(screenId).find('input[type="hidden"]').each(function () {
    // コンポーネントオブジェクトの取得
    var component = $(this);
    // コンポーネントに設定された書式を確認
    expj.common.pscript.kind.checkKind(this);
    // コンポーネント初期値と最終入力値の初期化
    this.kindData.initFlg = false;
    this.kindData.lastState = null;
    // 書式が正常であるか確認（hasKind==trueの時は正常）
    if (this.kindData.hasKind) {
      // 書式が正常に設定されている場合
      // 既に入力されている値の書式適用
      expj.common.pscript.kind.setKind(this);
    } else {
      this.kindData.kind = '';
      // 既に入力されている値の書式適用
      expj.common.pscript.kind.setNoKind(this);
    }
  });
  
  $(screenId).find('span[data-view]').each(function () {
    expj.common.pscript.kind.checkSpanKind(this);
    if (this.kindData.hasKind) {
      expj.common.pscript.setSpanData(this, this.textContent);
    }
  });
  
  $(screenId).find('span[data-detailitem]').each(function () {
    expj.common.pscript.kind.checkSpanKind(this);
    if (this.kindData.hasKind) {
      expj.common.pscript.setSpanData(this, this.textContent);
    }
  });
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.cursorPos = function(component) {
  var kindType = component.kindData.kind;
  var pos = $(component).getCursorPosition();
  var newPos;
  // コンポーネントから値を取得する
  var value = component.value;
  // 値が空の時は処理を終了する
  if(value === ''){
    component.kindData.lastState = value;
    return;
  }
  if(kindType.match(/OBT_INTEGER/)) {
    var valueLength = value.length;
    var paraNum = Math.ceil(valueLength / 4);
    var posParaNum = Math.floor((valueLength - pos) / 4);
    newPos = pos - ((paraNum - posParaNum) - 1);

    //カンマ区切り解除
    value = value.split(",").join("");
    component.value = value;
    $(component).setCursorPosition(newPos);

  } else if(kindType.match(/OBT_NUMBER/)) {
    var pointValue = (value.indexOf('.') != -1)?(value.substring(value.indexOf('.'),value.length)):"";
    value = (value.indexOf('.') != -1)?(value.substring(0,value.indexOf('.'))):(component.value);

    if(value.indexOf(',') === -1){
        var tempValue ='';
        let count = 0;
        for(let i = value.length-1;i>=0;i--){
           tempValue = value[i] + tempValue;
           count++;
           if(count % 3 == 0){
               if(i-1 >= 0){
                   tempValue = ',' + tempValue;
               }
           }
        }
        value = tempValue;
    }

    var valueLength = value.length;
    var paraNum = Math.ceil(valueLength / 4);
    if(pos > valueLength) {
      newPos = pos - (paraNum - 1);
    } else {
      var posParaNum = Math.floor((valueLength - pos) / 4);
      newPos = pos - ((paraNum - posParaNum) - 1);
    }

    //カンマ区切り解除
    value = value.split(",").join("");
    component.value = value + pointValue;
    $(component).setCursorPosition(newPos);

  } else {
    newPos = pos;
    $(component).setCursorPosition(newPos);
  }
};

/**
 *
 * @returns {string}
 */
expj.common.pscript.kind.getBrowser = function(){
  var type = '';
    var Sys={};
    var ua=navigator.userAgent.toLowerCase();
    var s;
    (s=ua.match(/(msie\s|trident.*rv:)([\w.]+)/))?Sys.ie=s[1]:
        (s=ua.match(/firefox\/([\d.]+)/))?Sys.firefox=s[1]:
            (s=ua.match(/chrome\/([\d.]+)/))?Sys.chrome=s[1]:
                (s=ua.match(/opera.([\d.]+)/))?Sys.opera=s[1]:
                    (s=ua.match(/version\/([\d.]+).*safari/))?Sys.safari=s[1]:0;
    if(Sys.ie){//IE
      type = 'msie';
    }
    if(Sys.firefox){//firefox
      type = 'firefox';
    }
    if(Sys.chrome){//chrome
      type = 'chrome';
    }
    if(Sys.opera){//opera
      type = 'opera';
    }
    if(Sys.safari){//safari
      type = 'safari';
    }
  return type;
};

/**
 * 入力禁止文字('%','_','\')が含まれていないか確認する関数。<br>
 * 入力禁止文字が含まれている場合はtrue、含まれていない場合はfalseを返却する。<br>
 * @param component 対象のコンポーネントオブジェクト
 * @returns {Boolean} true / false
 */
expj.common.pscript.kind.isRegexExist = function (val) {
  // 文字列が空の場合、falseを返却
  if (val === '') {
    return false;
  }
  // 正規表現オブジェクトを生成し、文字列にマッチさせる
  var reg = /^((?!\\|_|%).)*$/;
  var ret = reg.exec(val);
  // 入力禁止文字が含まれている場合、retはnullになる
  // その場合はtrueを返却する
  if (ret === null) {
    return true;
  }
  // それ以外の場合はfalseを返却する
  return false;
};

/**
 * 書式未設定字の処理を実装した関数。<br>
 * @param component 対象のコンポーネントオブジェクト
 */
expj.common.pscript.kind.setNoKind = function (component){
  // コンポーネントから値を取得する
  //var val = $.trim(component.value);
  var val = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = val;
    return;
  }
  // 入力禁止文字が含まれていないが確認
  var regexFlag = this.isRegexExist(val);
  if(regexFlag === true) {
    // 入力禁止文字が含まれている場合はコンポーネント初期値で初期化する
    if (this.isRegexExist(component.dataInitValue)) {
      // コンポーネント初期値も入力禁止文字が含まれていた場合は空文字にする
      component.kindData.lastState = '';
    } else {
      component.kindData.lastState = component.dataInitValue;
    }
  } else {
    component.kindData.lastState = val;
  }
  // コンポーネントの値をセットし直す
  this.setVal(component, component.kindData.lastState);
};

expj.common.pscript.kind.checkNumberKind = function (kindText) {
  if (kindText === 'OBT_INTEGER') {
    return true;
  } else if (kindText === 'OBT_INTEGER_P') {
    return true;
  } else if (kindText === 'OBT_INTEGER_Z') {
    return true;
  } else if (kindText === 'OBT_NUMBER') {
    return true;
  } else if (kindText === 'OBT_NUMBER_P') {
    return true;
  } else if (kindText === 'OBT_NUMBER_Z') {
    return true;
  }
  return false;
};

/**
 * 対象のコンポーネントのdata-kind属性を解析し、書式を適用する関数。<br>
 * 書式フォーマットに異常がある場合は、書式指定無しとなる。<br>
 * @param component 対象コンポーネントオブジェクト
 */
expj.common.pscript.kind.checkKind = function (component) {
  var kindValue = component.getAttribute('data-kind');
  var data = this.createKindData(kindValue);
  component.kindData = data.kindData;
  if (this.checkNumberKind(data.kindData.kind)) {
    $(component).css('text-align', 'right');
  }
};

expj.common.pscript.kind.checkSpanKind = function (component) {
  var kindValue = component.getAttribute('data-kind');
  var data = this.createKindData(kindValue);
  component.kindData = data.kindData;
  if (this.checkNumberKind(data.kindData.kind)) {
    $(component).parent().css('text-align', 'right');
  }
};

//Ex専用
expj.common.pscript.kind.checkSpanKindEx = function (component) {
  var kindValue = component.kind;
  var data = this.createKindData(kindValue);
  component.kindData = data.kindData;
  if (this.checkNumberKind(data.kindData.kind)) {
    $(component).parent().css('text-align', 'right');
  }
};


expj.common.pscript.kind.createKindData = function (kindValue) {
  var component = {};
  component.kindData = {};
  if (kindValue === null) {
    component.kindData.hasKind = false;
    component.kindData.kind = '';
    return component;
  }
  var kinds = kindValue.split(';');
  var kindType = $.trim(kinds[0]);
  var kindLength = kinds.length;
  switch (kindType) {
  case 'OBT_INTEGER':
  case 'OBT_INTEGER_P':
  case 'OBT_INTEGER_Z':
    component.kindData.hasKind = true;
    component.kindData.kind = kindType;
    if (kindLength === 1) {
      component.kindData.intLength = Number.MAX_VALUE;
    } else {
      var intLength = $.trim(kinds[1]);
      if (intLength === '' || isNaN(intLength) || intLength < 0) {
        component.kindData.intLength = Number.MAX_VALUE;
      } else {
        component.kindData.intLength = Math.floor(intLength);
      }
    }
    break;
  case 'OBT_NUMBER':
  case 'OBT_NUMBER_P':
  case 'OBT_NUMBER_Z':
    component.kindData.hasKind = true;
    component.kindData.kind = kindType;
    if (kindLength === 1) {
      component.kindData.digitalLength = Number.MAX_VALUE;
      component.kindData.decimalLength = 1;
      component.kindData.roundType = 'ROUND';
      component.kindData.roundLength = Number.MAX_VALUE;
    } else {
      var numLength = $.trim(kinds[1]).split('.');
      var digitalLength = numLength[0];
      var decimalLength = null;
      if (numLength.length > 1) {
        decimalLength = numLength[1];
      }
      if (digitalLength === '' || isNaN(digitalLength) || digitalLength <= 0) {
        component.kindData.digitalLength = Number.MAX_VALUE;
      } else {
        component.kindData.digitalLength = parseInt(digitalLength);
      }
      var decimalFlg = true;
      if (decimalLength === null) {
        component.kindData.decimalLength = 0;
      } else if (decimalLength === '') {
        component.kindData.decimalLength = 0;
      } else if (isNaN(decimalLength) || decimalLength < 0) {
        component.kindData.decimalLength = 0;
      } else {
        component.kindData.decimalLength = parseInt(decimalLength);
        decimalFlg = false;
      }
      if (kindLength === 2) {
        component.kindData.roundType = 'ROUND';
        component.kindData.roundLength = Number.MAX_VALUE;
      } else {
        var roundType = $.trim(kinds[2]);
        roundType = roundType.toUpperCase();
        if (roundType === 'ROUND' || roundType === 'CEIL' || roundType === 'FLOOR') {
          component.kindData.roundType = roundType;
        } else {
          component.kindData.roundType = 'ROUND';
        }
        if (kindLength === 3) {
          if (decimalFlg) {
            component.kindData.roundLength = Number.MAX_VALUE;
          } else {
            component.kindData.roundLength = component.kindData.decimalLength;
          }
        } else {
          var roundLength = $.trim(kinds[3]);
          if (roundLength === '' || isNaN(roundLength) || roundLength < 0) {
            if (decimalFlg) {
              component.kindData.roundLength = Number.MAX_VALUE;
            } else {
              component.kindData.roundLength = component.kindData.decimalLength;
            }
          } else {
            component.kindData.roundLength = parseInt(roundLength);
          }
        }
      }
    }
    break;
  case 'OBT_WILD':
  case 'OBT_ALPHA':
  case 'OBT_ALPHA_C':
  case 'OBT_ALPHA_S':
  case 'OBT_N':
  case 'OBT_AN':
  case 'OBT_AN_SPC':
  case 'OBT_ANK':
  case 'OBT_ANK2':
  case 'OBT_ANK3':
  case 'OBT_ANK4':
  case 'OBT_ANK_SPC':
  case 'OBT_ANK2_SPC':
  case 'OBT_ANK3_SPC':
  case 'OBT_ANK4_SPC':
  case 'OBT_TELMO':
  case 'OBT_MAIL':
    component.kindData.hasKind = true;
    component.kindData.kind = kindType;
    break;
  case 'OBT_DATE':
    component.kindData.hasKind = true;
    component.kindData.kind = kindType;
    if (kindLength === 1) {
      component.kindData.hasKind = false;
    } else {
      var dateType = $.trim(kinds[1]);
      if (dateType === 'TYPE_YMD' || dateType === 'TYPE_YM' || dateType === 'TYPE_YMDTIME' || dateType === 'TYPE_MD') {
        component.kindData.dateType = dateType;
      } else {
        component.kindData.dateType = 'TYPE_YMD';
      }
    }
    break;
  default:
    component.kindData.hasKind = false;
    component.kindData.kind = '';
    break;
  }
  return component;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setKind = function (component) {
  var kind = component.kindData.kind;
  switch (kind) {
  case 'OBT_INTEGER':
    this.setObtInteger(component);
    break;
  case 'OBT_INTEGER_P':
    this.setObtIntegerP(component);
    break;
  case 'OBT_INTEGER_Z':
    this.setObtIntegerZ(component);
    break;
  case 'OBT_NUMBER':
    this.setObtNumber(component);
    break;
  case 'OBT_NUMBER_P':
    this.setObtNumberP(component);
    break;
  case 'OBT_NUMBER_Z':
    this.setObtNumberZ(component);
    break;
  case 'OBT_WILD':
    this.setObtWild(component);
    break;
  case 'OBT_ALPHA':
    this.setObtAlpha(component);
    break;
  case 'OBT_ALPHA_C':
    this.setObtAlphaC(component);
    break;
  case 'OBT_ALPHA_S':
    this.setObtAlphaS(component);
    break;
  case 'OBT_N':
    this.setObtN(component);
    break;
  case 'OBT_AN':
    this.setObtAn(component);
    break;
  case 'OBT_AN_SPC':
    this.setObtAnSpc(component);
    break;
  case 'OBT_ANK':
    this.setObtAnk(component);
    break;
  case 'OBT_ANK2':
    this.setObtAnk2(component);
    break;
  case 'OBT_ANK3':
    this.setObtAnk3(component);
    break;
  case 'OBT_ANK4':
    this.setObtAnk4(component);
    break;
  case 'OBT_ANK_SPC':
    this.setObtAnkSpc(component);
    break;
  case 'OBT_ANK2_SPC':
    this.setObtAnk2Spc(component);
    break;
  case 'OBT_ANK3_SPC':
    this.setObtAnk3Spc(component);
    break;
  case 'OBT_ANK4_SPC':
    this.setObtAnk4Spc(component);
    break;
  case 'OBT_TELMO':
    this.setObtTelmo(component);
    break;
  case 'OBT_MAIL':
    this.setObtMail(component);
    break;
  case 'OBT_DATE':
    this.setObtDate(component);
    break;
  default :
    // ここには到達しない
    break;
  }
};

/**
 * 
 * @param component
 * @param value
 */
expj.common.pscript.kind.setVal = function (component, value) {
  component.value = value;
};

/**
 * 
 * @param component
 * @param value
 */
expj.common.pscript.kind.setValByTrimedFLG = function (value) {
  if(expj.common.config.trimedFLG == true){
    return $.trim(value);
  }
  return value;
};

//-----------------------------------------------------------------------------------------------------
//OBT_INTEGER Begin
/**
 * OBT_INTEGER  OBT_INTEGER_P  OBT_INTEGER_Z
 */

/**
 * 整数の最大値を示す文字列を返却する
 * @param value 対象の数値
 * @param length 桁数
 * @returns {String} 変換後の文字列
 */
expj.common.pscript.kind.getMaxInteger = function (value, length) {
  var result = "";
  for (var i = 0; i < length; i++) {
    result += "9";
  }
  if (value < 0) {
    result = "-" + result;
  }
  return result;
}

/**
 * @param value
 * @param degitalLength
 * @param decimalLength
 * @param roundLength
 * @returns {String}
 */
expj.common.pscript.kind.getMaxFloat = function (value, degitalLength, decimalLength, roundLength) {
  var result = '';
  // 整数部分を作成
  for (var i = 0; i < degitalLength; i++) {
    result += '9';
  }
  if (value < 0) {
    result = '-' + result;
  }
  result += '.';
  
  // 元数値の文字列表現を取得
  var valueText = value + '';
  // 小数点の位置を求める
  var periodIndex = valueText.indexOf('.');
  if (periodIndex === -1) {
    // 小数点以下が存在しなかった場合
    return result + '0';
  } else {
    // 小数点以下の候補になる文字列を格納する変数
    var decimalText = valueText.substring(periodIndex + 1);
    return result + decimalText;
  }
}

expj.common.pscript.kind.comma = function (value){
  var parts = value.toString().split('.');
  parts[0] = parts[0].replace(/(\d)(?=(\d\d\d)+(?!\d))/g, '$1,');
  return parts.join('.');
}



/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtInteger = function (component) {
  var value = $.trim(component.value);
  if (value === '') {
    component.kindData.lastState = '0';
    this.setVal(component, component.kindData.lastState);
  } else if (isNaN(value)) {
    var newText = '';
    var target = value.charAt(0);
    if (this.checkRegx(target, /^[0-9\-]*$/)) {
      newText += target;
    }
    for (var i = 1, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      }
    }
    if (newText === '' || newText === '-') {
      component.kindData.lastState = '0';
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = newText;
      this.setVal(component, newText);
    }
  } else {
    var periodIndex = value.indexOf('.');
    if (periodIndex !== -1) {
      value = value.substring(0, periodIndex);
      if (value === '') {
        component.kindData.lastState = '0';
      } else {
        component.kindData.lastState = value;
      }
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = value;
    }
  }

  this.setObtIntegerCommon(component);
};

expj.common.pscript.kind.setObtIntegerCommon = function (component) {
  // 桁数が0の時はテキストボックスを空にする
  var digitalLength = component.kindData.intLength;
  if (digitalLength === 0) {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  
  // コンポーネントから値を取得する。（この時、不要な空白を除去する）
  var value = $.trim(component.value);
  
  var minusFlg = value.charAt(0) === '-';
  if (minusFlg) {
    value = value.substring(1);
  }
  while (value.length > 1 && value.charAt(0) === '0') {
    value = value.substring(1, value.length);
  }
  if (minusFlg) {
    value = '-' + value;
  }
  
  var valueLength = value > 0 ? value.length : value.length - 1;
  if (valueLength <= digitalLength) {
    value = this.comma(value);
    this.setVal(component, value);
  } else {
    var max = '';
    //if (digitalLength > 15) {
    //  if (value < 0) {
    //    max = '-1e,+' + digitalLength;
    //  } else {
    //    max = '1e,+' + digitalLength;
    //  }
    //} else {
      max = this.getMaxInteger(value, digitalLength);
      component.kindData.lastState = max;
      max = this.comma(max);
    //}
    this.setVal(component, max);
  }
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtIntegerP = function (component) {
  var value = $.trim(component.value);
  if (component.kindData.initFlg === false) {
    component.kindData.initFlg = true;
    if (value === '') {
      component.value = '1';
      value = '1';
    } else {
      var periodIndex = value.indexOf('.');
      if (periodIndex !== -1) {
        value = value.substring(0, periodIndex);
        if (value === '') {
          component.value = '0';
          value = '0';
        } else {
          component.value = value;
        }
      }
    }
    
    if (Number(value) === 0) {
      this.setObtIntegerCommon(component);
      return;
    }
  }
  if (value === '') {
    if (component.dataInitValue === '') {
      component.kindData.lastState = '1';
      this.setVal(component, component.kindData.lastState);
    } else if (Number(component.dataInitValue) === 0) {
      component.kindData.lastState = '0';
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = component.dataInitValue;
      this.setVal(component, component.kindData.lastState.replace(/,/g,""));
    }
  } else if (isNaN(value)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      }
    }
    if (newText === '' || parseInt(newText) === 0) {
      component.kindData.lastState = '1';
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = newText;
      this.setVal(component, newText);
    }
  } else if (value <= 0) {
    if (component.dataInitValue === '') {
      component.kindData.lastState = '1';
      this.setVal(component, component.kindData.lastState);
    } else if (Number(component.dataInitValue) === 0) {
      component.kindData.lastState = '0';
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = component.dataInitValue;
      this.setVal(component, component.kindData.lastState.replace(/,/g,""));
    }
  } else {
    var periodIndex = value.indexOf('.');
    if (periodIndex !== -1) {
      value = value.substring(0, periodIndex);
      if (value === '') {
        component.kindData.lastState = '0';
      } else {
        component.kindData.lastState = value;
      }
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = value;
    }
  }
  this.setObtIntegerCommon(component);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtIntegerZ = function (component) {
  var value = $.trim(component.value);
  if (value === '') {
    component.kindData.lastState = '0';
    this.setVal(component, component.kindData.lastState);
  } else if (isNaN(value)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      }
    }
    if (newText === '') {
      component.kindData.lastState = '0';
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = newText;
      this.setVal(component, newText);
    }
  } else if (value < 0) {
    component.kindData.lastState = '0';
    this.setVal(component, component.kindData.lastState);
  } else {
    var periodIndex = value.indexOf('.');
    if (periodIndex !== -1) {
      value = value.substring(0, periodIndex);
      if (value === '') {
        component.kindData.lastState = '0';
      } else {
        component.kindData.lastState = value;
      }
      this.setVal(component, component.kindData.lastState);
    } else {
      component.kindData.lastState = value;
    }
  }
  this.setObtIntegerCommon(component);
};
//OBT_INTEGER End
//-----------------------------------------------------------------------------------------------------
//OBT_NUMBER Begin
/**
 * OBT_NUMBER  OBT_NUMBER_P  OBT_NUMBER_Z
 */
expj.common.pscript.kind.setObtNumber = function (component) {
  // コンポーネントの値を取得
  var value = $.trim(component.value);
  if (value === '') {
    component.kindData.lastState = '0';
    this.setVal(component, component.kindData.lastState);
  } else if (isNaN(value)) {
    var newText = '';
    var index = 0;
    var target = value.charAt(index);
    if (target !== '.') {
      if (this.checkRegx(target, /^[0-9\-]*$/)) {
        newText += target;
      }
      var len = value.length;
      for (index++; index < len; index++) {
        target = value.charAt(index);
        if (this.checkRegx(target, /^[0-9]*$/)) {
          newText += target;
        } else if (target === '.') {
          break;
        }
      }
      if (newText === '' || newText === '-') {
        newText += '0';
      }
      newText += '.';
    } else {
      newText += '0.';
    }
    var len = value.length;
    for (index++; index < len; index++) {
      target = value.charAt(index);
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      } else {
        break;
      }
    }
    if (newText.charAt(newText.length - 1) === '.') {
      newText += '0';
    }
    component.kindData.lastState = newText;
    this.setVal(component, newText);
  } else {
    component.kindData.lastState = value;
  }
  switch (component.kindData.roundType) {
  case 'ROUND':
    this.setRound(component);
    break;
  case 'CEIL':
    this.setCeil(component);
    break;
  case 'FLOOR':
    this.setFloor(component);
    break;
  default:
    // ここには到達しない
    break;
  }
};

expj.common.pscript.kind.setObtNumberP = function (component) {
  // コンポーネントの値を取得
  var value = $.trim(component.value);
  if (component.kindData.initFlg === false) {
    component.kindData.initFlg = true;
    if (value === '') {
      component.value = '1';
      value = '1';
    }
    if (Number(value) <= 0) {
      switch (component.kindData.roundType) {
      case 'ROUND':
        this.setRound(component);
        break;
      case 'CEIL':
        this.setCeil(component);
        break;
      case 'FLOOR':
        this.setFloor(component);
        break;
      default:
        // ここには到達しない
        break;
      }
      return;
    }
  }
  if (value === '') {
    if (component.dataInitValue === '') {
      component.kindData.lastState = '1.0';
      this.setVal(component, '1.0');
    } else if (Number(component.dataInitValue) === 0) {
      component.kindData.lastState = '0.0';
      this.setVal(component, '0.0');
    } else {
      component.kindData.lastState = component.dataInitValue;
      this.setVal(component, component.kindData.lastState.replace(/,/g,""));
    }
  } else if (isNaN(value)) {
    var newText = '';
    var index = 0;
    var target = value.charAt(index);
    if (target !== '.') {
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      }
      var len = value.length;
      for (index++; index < len; index++) {
        target = value.charAt(index);
        if (this.checkRegx(target, /^[0-9]*$/)) {
          newText += target;
        } else if (target === '.') {
          break;
        }
      }
      if (newText === '') {
        newText += '0';
      }
      newText += '.';
    } else {
      newText += '0.';
    }
    var len = value.length;
    for (index++; index < len; index++) {
      target = value.charAt(index);
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      } else {
        break;
      }
    }
    if (newText.charAt(newText.length - 1) === '.') {
      newText += '0';
    }
    if (newText <= 0) {
      newText = '1.0';
    }
    component.kindData.lastState = newText;
    this.setVal(component, newText);
  } else if (value <= 0) {
    if (component.dataInitValue === '') {
      component.kindData.lastState = '1.0';
      this.setVal(component, '1.0');
    } else if (Number(component.dataInitValue) === 0) {
      component.kindData.lastState = '0.0';
      this.setVal(component, '0.0');
    } else {
      component.kindData.lastState = component.dataInitValue;
      this.setVal(component, component.kindData.lastState.replace(/,/g,""));
    }
  } else {
    component.kindData.lastState = value;
  }
  switch (component.kindData.roundType) {
  case 'ROUND':
    this.setRound(component);
    break;
  case 'CEIL':
    this.setCeil(component);
    break;
  case 'FLOOR':
    this.setFloor(component);
    break;
  default:
    // ここには到達しない
    break;
  }
};

expj.common.pscript.kind.setObtNumberZ = function (component) {
  // コンポーネントの値を取得
  var value = $.trim(component.value);
  if (value === '') {
    component.kindData.lastState = '0';
    this.setVal(component, component.kindData.lastState);
  } else if (isNaN(value)) {
    var newText = '';
    var index = 0;
    var target = value.charAt(index);
    if (target !== '.') {
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      }
      var len = value.length;
      for (index++; index < len; index++) {
        target = value.charAt(index);
        if (this.checkRegx(target, /^[0-9]*$/)) {
          newText += target;
        } else if (target === '.') {
          break;
        }
      }
      if (newText === '') {
        newText += '0';
      }
      newText += '.';
    } else {
      newText += '0.';
    }
    var len = value.length;
    for (index++; index < len; index++) {
      target = value.charAt(index);
      if (this.checkRegx(target, /^[0-9]*$/)) {
        newText += target;
      } else {
        break;
      }
    }
    if (newText.charAt(newText.length - 1) === '.') {
      newText += '0';
    }
    if (newText < 0) {
      newText = '0';
    }
    component.kindData.lastState = newText;
    this.setVal(component, newText);
  } else if (value < 0) {
    component.kindData.lastState = '0';
    this.setVal(component, '0');
  } else {
    component.kindData.lastState = value;
  }
  switch (component.kindData.roundType) {
  case 'ROUND':
    this.setRound(component);
    break;
  case 'CEIL':
    this.setCeil(component);
    break;
  case 'FLOOR':
    this.setFloor(component);
    break;
  default:
    // ここには到達しない
    break;
  }
};

expj.common.pscript.kind.removeExtraZero = function (value) {
  var periodIndex = value.indexOf('.');
  var minusFlg = value.charAt(0) === '-';
  if (minusFlg) {
    value = value.substring(1);
  }
  var digitalData = '';
  if (periodIndex !== -1) {
    digitalData = value.substring(0, periodIndex);
  } else {
    digitalData = value;
  }
  while (digitalData.length > 1 && digitalData.charAt(0) === '0') {
    digitalData = digitalData.substring(1, digitalData.length);
  }
  if (periodIndex === -1) {
    value = digitalData;
  } else {
    value = digitalData + value.substring(periodIndex, value.length);
  }
  if (minusFlg) {
    value = '-' + value;
  }
  return value;
};

expj.common.pscript.kind.setRound = function (component) {
  var value = $.trim(component.value);
  var digitalLength = component.kindData.digitalLength;
  var decimalLength = component.kindData.decimalLength;
  var roundLength = component.kindData.roundLength;

  value = expj.common.pscript.kind.removeExtraZero(value);
  var periodIndex = value.indexOf('.');
  var digitalData = '';
  if (periodIndex !== -1) {
    digitalData = value.substring(0, periodIndex);
  } else {
    digitalData = value;
  }
  if (digitalData < 0) {
    digitalData = digitalData.substring(1);
  }
  
  //var tmpData = Math.abs(parseInt(value)) + "";
  var intergerLength = digitalData.length;
  if(digitalLength > 0 && intergerLength > digitalLength){
    var max = this.getMaxFloat(value, digitalLength, decimalLength, roundLength);
    max = this.Digit.round(max, digitalLength, decimalLength, roundLength);
    if (max.length > digitalLength) {
      max = this.getMaxFloat(max, digitalLength, decimalLength, roundLength);
      max = this.Digit.round(max, digitalLength, decimalLength, roundLength);
    }
    component.kindData.lastState = max;
    max = this.comma(max);
    this.setVal(component, max);
    value = max;
    return;
  }

  value = this.Digit.round(value, digitalLength, decimalLength, roundLength);
  component.kindData.lastState = value;
  value = this.comma(value);
  this.setVal(component, value);
};

/**
 * 
 */
expj.common.pscript.kind.setCeil = function (component) {
  var value = $.trim(component.value);
  var digitalLength = component.kindData.digitalLength;
  var decimalLength = component.kindData.decimalLength;
  var roundLength = component.kindData.roundLength;

  value = expj.common.pscript.kind.removeExtraZero(value);
  var periodIndex = value.indexOf('.');
  var digitalData = '';
  if (periodIndex !== -1) {
    digitalData = value.substring(0, periodIndex);
  } else {
    digitalData = value;
  }
  if (digitalData < 0) {
    digitalData = digitalData.substring(1);
  }

  var intergerLength = digitalData.length;
  if(digitalLength > 0 && intergerLength > digitalLength){
    var max = this.getMaxFloat(value, digitalLength, decimalLength, roundLength);
    max = this.Digit.ceil(max, digitalLength, decimalLength, roundLength);
    if (max.length > digitalLength) {
      max = this.getMaxFloat(max, digitalLength, decimalLength, roundLength);
      max = this.Digit.ceil(max, digitalLength, decimalLength, roundLength);
    }
    component.kindData.lastState = max;
    max = this.comma(max);
    this.setVal(component, max);
    value = max;
    return;
  }

  value = this.Digit.ceil(value, digitalLength, decimalLength, roundLength);
  component.kindData.lastState = value;
  value = this.comma(value);
  this.setVal(component, value);
};

expj.common.pscript.kind.setFloor = function (component) {
  var value = $.trim(component.value);
  var digitalLength = component.kindData.digitalLength;
  var decimalLength = component.kindData.decimalLength;
  var roundLength = component.kindData.roundLength;

  value = expj.common.pscript.kind.removeExtraZero(value);
  var periodIndex = value.indexOf('.');
  var digitalData = '';
  if (periodIndex !== -1) {
    digitalData = value.substring(0, periodIndex);
  } else {
    digitalData = value;
  }
  if (digitalData < 0) {
    digitalData = digitalData.substring(1);
  }
  
  var intergerLength = digitalData.length;
  if(digitalLength > 0 && intergerLength > digitalLength){
    var max = this.getMaxFloat(value, digitalLength, decimalLength, roundLength);
    max = this.Digit.floor(max, digitalLength, decimalLength, roundLength);
    component.kindData.lastState = max;
    max = this.comma(max);
    this.setVal(component, max);
    value = max;
    return;
  }

  value = this.Digit.floor(value, digitalLength, decimalLength, roundLength);
  component.kindData.lastState = value;
  value = this.comma(value);
  this.setVal(component, value);
};

/**
 * 
 */
expj.common.pscript.kind.Digit = (function () {
  function convert(digit) {
    var values = digit.split('.');
    var digital = values[0];
    if (digital === '') {
      digital = '0';
    } else if (digital === '-') {
      digital = '-0';
    } else if (digital === '-0') {
      digital = '-0';
    } else if (digital === '0') {
      digital = '0';
    } else {
      var index = 0;
      var nextDigital = '';
      if (digital.charAt(index) === '-') {
        nextDigital = '-';
        index++;
      }
      var zeroFlg = true;
      while (index < digital.length) {
        if (zeroFlg && digital.charAt(index) !== '0') {
          nextDigital += digital.charAt(index);
          zeroFlg = false;
        } else if (zeroFlg === false) {
          nextDigital += digital.charAt(index);
        }
        index++;
      }
      if (nextDigital === '' || nextDigital === '-') {
        nextDigital += '0';
      }
      digital = nextDigital;
    }
    var decimal = '0';
    if (values.length === 2) {
      decimal = values[1];
      if (decimal === '') {
        decimal = '0';
      }
    }
    var result = {
      'digital' : digital,
      'decimal' : decimal
    }
    return result;
  }
  
  function remakeDecimalByRoundLength(decimal, roundLength) {
    var value = '0';
    var flg = false;
    var digitalLength = 0;
    for (var i = 0, len = decimal.length; i < len; i++) {
      var c = decimal.charAt(i);
      if (i < roundLength) {
        value += c;
        digitalLength++;
      } else if (flg) {
        value += c;
      } else {
        value += '.' + c;
        flg = true;
      }
    }
    var result = {
      'digitalLength' : digitalLength,
      'value' : value
    }
    return result;
  }
  
  function calculate(digital, decimal, roundLength) {
    if (decimal !== '0' || roundLength !== 0) {
      if (decimal.length < roundLength) {
        for (var i = decimal.length; i < roundLength; i++) {
          decimal = '0' + decimal;
        }
      } else if (decimal.length > roundLength) {
        var upValue = decimal.substring(0, 1);
        decimal = decimal.substring(1);
        if (Number(decimal) === 0) {
          decimal = '0';
        }
        if (digital[0] === '-') {
          digital = String(Number(digital) - Number(upValue));
        } else {
          digital = String(Number(digital) + Number(upValue));
        }
      }
    }
    var result = {
      'digital' : digital,
      'decimal' : decimal
    };
    return result;
  }
  
  function remakeDecimalByDecimalLength(baseDecimal, decimalLength) {
    var decimal = '';
    if (isNaN(decimalLength)) {
      if (Number(baseDecimal) === 0) {
        decimal = '';
      } else {
        decimal = '.';
        for (var i = 0, len = baseDecimal.length; i < len; i++) {
          if (Number(baseDecimal.substring(i, len)) !== 0) {
            decimal += baseDecimal[i];
          } else {
            break;
          }
        }
      }
      return decimal;
    }
    if (Number(baseDecimal) === 0 && decimalLength === 0) {
      decimal = '';
    } else if (baseDecimal.length >= decimalLength) {
      decimal = '.';
      for (var i = 0, len = baseDecimal.length; i < len; i++) {
        if (i < decimalLength) {
          decimal += baseDecimal[i];
        } else if (Number(baseDecimal.substring(i, len)) !== 0) {
          decimal += baseDecimal[i];
        } else {
          break;
        }
      }
    } else {
      decimal = '.' + baseDecimal;
      for (var i = 0, len = decimalLength - baseDecimal.length; i < len; i++) {
        decimal += '0';
      }
    }
    return decimal;
  }

  function checkDigitalLength(digital, decimal, digitalLength) {
    if ((digital < 0 && digital.length > digitalLength + 1) || (digital >= 0 && digital.length > digitalLength)) {
      if (digital < 0) {
        digital = '-';
      } else {
        digital = '';
      }
      for (var i = 0; i < digitalLength; i++) {
        digital += '9';
      }
      decimal = decimal.replace(/[0-9]/g, '9');
    }
    return {
      'digital' : digital,
      'decimal' : decimal
    }
  }

  return {
    'round': function (digit, digitalLength, decimalLength, roundLength) {
      var values = convert(digit);
      var baseDecimal = remakeDecimalByRoundLength(values.decimal, roundLength);
      var roundResult = String(Math.round(parseFloat(baseDecimal.value)));
      var calResult = calculate(values.digital, roundResult, baseDecimal.digitalLength);
      var digital = calResult.digital;
      var decimal = remakeDecimalByDecimalLength(calResult.decimal, decimalLength);
      var checkData = checkDigitalLength(digital, decimal, digitalLength);
      digital = checkData.digital;
      decimal = checkData.decimal;
      var result = digital + decimal;
      if (Number(result) === 0) {
        result = '0' + decimal;
      }
      return result;
    },
    'floor': function (digit, digitalLength, decimalLength, roundLength) {
      var values = convert(digit);
      var baseDecimal = remakeDecimalByRoundLength(values.decimal, roundLength);
      var pointIndex = baseDecimal.value.indexOf('.');
      if (pointIndex === -1) {
        pointIndex = baseDecimal.value.length;
      }
      var roundResult = String(Math.floor(parseFloat(baseDecimal.value.substring(0, pointIndex))));
      var calResult = calculate(values.digital, roundResult, baseDecimal.digitalLength);
      var digital = calResult.digital;
      var decimal = remakeDecimalByDecimalLength(calResult.decimal, decimalLength);
      var result = digital + decimal;
      if (Number(result) === 0) {
        result = '0' + decimal;
      }
      return result;
    },
    'ceil': function (digit, digitalLength, decimalLength, roundLength) {
      var values = convert(digit);
      var baseDecimal = remakeDecimalByRoundLength(values.decimal, roundLength);
      var roundResult = String(Math.ceil(parseFloat(baseDecimal.value)));
      var calResult = calculate(values.digital, roundResult, baseDecimal.digitalLength);
      var digital = calResult.digital;
      var decimal = remakeDecimalByDecimalLength(calResult.decimal, decimalLength);
      var checkData = checkDigitalLength(digital, decimal, digitalLength);
      digital = checkData.digital;
      decimal = checkData.decimal;
      var result = digital + decimal;
      if (Number(result) === 0) {
        result = '0' + decimal;
      }
      return result;
    }
  };
})();

// -----------------------------------------------------------------------------------------------------
// OBT_ Other Begin
/**
 * OBT_WILD
 * OBT_ALPHA    OBT_ALPHA_C   OBT_ALPHA_S
 * OBT_N        OBT_N_SPC
 * OBT_ANK      OBT_ANK2      OBT_ANK3      OBT_ANK4
 * OBT_ANK_SPC  OBT_ANK2_SPC  OBT_ANK3_SPC  OBT_ANK4_SPC
 * OBT_TELMO    OBT_DATE      OBT_MAIL
 */
expj.common.pscript.kind.ValidateRegex = (function () {
    return {
        //'obt_wild': /^((?!\\|\s).)*$/,
        'obt_wild': /^((?!\\|\s).|\u0020|\u3000)*$/,
        'obt_alpha': /^[A-Za-z]+$/,
        'obt_alpha_c': /^[A-Z]+$/,
        'obt_alpha_s': /^[a-z]+$/,
        'obt_n': /^[\d]+$/,
        'obt_an': /^[A-Za-z0-9]+$/,
        'obt_an_spc': /^[A-Za-z0-9\u0020]+$/,
        'obt_ank': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9D]+$/,
        'obt_ank2': /^[A-Za-z0-9\uFF66\uFF71-\uFF9D]+$/,
        'obt_ank3': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9F]+$/,
        'obt_ank4': /^[A-Za-z0-9\uFF66\uFF71-\uFF9F]+$/,
        'obt_ank_spc': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9D\u0020]+$/,
        'obt_ank2_spc': /^[A-Za-z0-9\uFF66\uFF71-\uFF9D\u0020]+$/,
        'obt_ank3_spc': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9F\u0020]+$/,
        'obt_ank4_spc': /^[A-Za-z0-9\uFF66\uFF71-\uFF9F\u0020]+$/,
        'obt_telmo': /^[A-Z0-9\uFF66\uFF71-\uFF9F\,\.\uFF62\uFF63\(\)\-\/\u0020]+$/,
        'obt_date': /^[0-9\/]+$/,
        'obt_mail': /^[A-Za-z0-9\@\!\#\$\%\&\'\*\+\-\/\=\?\^\_\`\{\|\}\~\.\,]+$/
    }
})();

/**
 * 
 * @param string
 * @param regex
 * @returns {Boolean}
 */
expj.common.pscript.kind.checkRegx = function (string, regex) {
  var flag = true;
  if (!regex.exec(string)) {
      flag = false;
  }
  return flag;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtWild = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_wild)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_wild)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAlpha = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_alpha)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_alpha)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAlphaC = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_alpha_c)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_alpha_c)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAlphaS = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_alpha_s)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_alpha_s)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtN = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_n)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_n)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAn = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_an)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_an)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnSpc = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_an_spc)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_an_spc)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnk = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnk2 = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank2)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank2)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnk3 = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank3)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank3)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnk4 = function (component) {
  var value = $.trim(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank4)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank4)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnkSpc = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank_spc)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank_spc)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnk2Spc = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank2_spc)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank2_spc)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnk3Spc = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank3_spc)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank3_spc)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtAnk4Spc = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_ank4_spc)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_ank4_spc)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtTelmo = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_telmo)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_telmo)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.setObtMail = function (component) {
  //var value = $.trim(component.value);
  var value = this.setValByTrimedFLG(component.value);
  // コンポーネントの初期値が設定されていない場合はそれを設定し関数を終了する
  if (!component.kindData.initFlg) {
    component.kindData.initFlg = true;
    component.kindData.lastState = value;
    return;
  }
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  if (!this.checkRegx(value, this.ValidateRegex.obt_mail)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_mail)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
  }
  this.setVal(component, value);
};

/**
 * 
 */
expj.common.pscript.kind.setObtDate = function (component) {
  var dateFormatType = component.kindData.dateType;
  switch (dateFormatType) {
  case 'TYPE_YMD':
    this.setByYMD(component);
    break;
  case 'TYPE_YM':
    this.setByYM(component);
    break;
  case 'TYPE_YMDTIME':
    this.setByYMDTIME(component);
    break;
  case 'TYPE_MD':
    this.setByMD(component);
    break;
  default:
    // ここは通過しない
    break;
  }
};

expj.common.pscript.kind.setByYMD = function (component) {
  var value = $.trim(component.value);
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  value = value.split(' ');
  value = value[0];
  if (!this.checkRegx(value, this.ValidateRegex.obt_date)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_date)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
    this.setVal(component, value);
    return;
  }
  
  var momentObj = moment();
  var year = null;
  var month = null;
  var date = null;
  if (value === '/') {
    // [/]が入力
    value = momentObj.format('YYYY/MM/DD');
  } else {
    value = value.split('/');
    if (value.length === 1) {
      var yearText = value[0];
      if (yearText.length <= 2) {
        // [YY]
        year = 2000 + Number(yearText);
        month = momentObj.month();
        date = this.loadDate(year, month, '', momentObj);
      } else if (yearText.length === 3) {
        // [YYM]
        year = 2000 + Number(yearText.substring(0, 2));
        month = this.loadMonth(yearText.substring(2, 3), momentObj);
        date = this.loadDate(year, month, '', momentObj);
      } else if (yearText.length === 4) {
        // [YYMD]
        year = 2000 + Number(yearText.substring(0, 2));
        month = this.loadMonth(yearText.substring(2, 3), momentObj);
        date = this.loadDate(year, month, yearText.substring(3, 4), momentObj);
      } else if (yearText.length === 5) {
        // [YYMDD]
        year = 2000 + Number(yearText.substring(0, 2));
        month = this.loadMonth(yearText.substring(2, 3), momentObj);
        date = this.loadDate(year, month, yearText.substring(3, 5), momentObj);
      } else if (yearText.length === 6) {
        // [YYMMDD]
        year = 2000 + Number(yearText.substring(0, 2));
        month = this.loadMonth(yearText.substring(2, 4), momentObj);
        date = this.loadDate(year, month, yearText.substring(4, 6), momentObj);
      } else if (yearText.length === 7) {
        // [YYYYMMD]
        year = this.loadYear(yearText.substring(0, 4), momentObj);
        month = this.loadMonth(yearText.substring(4, 6), momentObj);
        date = this.loadDate(year, month, yearText.substring(6, 7), momentObj);
      } else if (yearText.length === 8) {
        // [YYYYMMDD]
        year = this.loadYear(yearText.substring(0, 4), momentObj);
        month = this.loadMonth(yearText.substring(4, 6), momentObj);
        date = this.loadDate(year, month, yearText.substring(6, 8), momentObj);
      } else {
        year = this.loadYear(yearText.substring(0, 4), momentObj);
        month = this.loadMonth(yearText.substring(4, 6), momentObj);
        date = this.loadDate(year, month, yearText.substring(6, yearText.length), momentObj);
      }
      // 2月=month(1)
      if (month === 1 && date === 29 && !this.isLeapYear(year)) {
        date = 28;
      }
    } else if (value.length === 2) {
      // [YYYY/][YYYY/MM]
      var yearText = value[0];
      year = this.loadYear(yearText, momentObj);
      var monthText = value[1];
      month = this.loadMonth(monthText, momentObj);
      date = this.loadDate(year, month, '', momentObj);
    } else if (value.length >= 3) {
      // [YYYY/MM/DD][YYYY/MM/DD/.....]
      year = this.loadYear(value[0], momentObj);
      month = this.loadMonth(value[1], momentObj);
      date = this.loadDate(year, month, value[2], momentObj);
    }
    momentObj.year(year);
    momentObj.month(month);
    momentObj.date(date);
    value = momentObj.format('YYYY/MM/DD');
  }
  component.kindData.lastState = value;
  this.setVal(component, value);
  return;
};

expj.common.pscript.kind.setByYM = function (component) {
  var value = $.trim(component.value);
  
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  
  value = value.split(' ');
  value = value[0];
  
  if (!this.checkRegx(value, this.ValidateRegex.obt_date)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_date)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
    this.setVal(component, value);
    return;
  }
  
  var momentObj = moment();
  var year = null;
  var month = null;
  var date = null;
  if (value === '/') {
    // [/]
    value = momentObj.format('YYYY/MM');
  } else {
    value = value.split('/');
    if (value.length === 1) {
      var yearText = value[0];
      if (yearText.length <= 4) {
        // [YYYY]
        year = Number(yearText);
        if (year < 1000) {
          year += 2000;
        }
        month = momentObj.month();
        date = this.loadDate(year, month, '', momentObj);
      } else if (yearText.length === 5) {
        // [YYYYM]
        year = this.loadYear(yearText.substring(0, 4), momentObj);
        month = this.loadMonth(yearText.substring(4, 5), momentObj);
        date = this.loadDate(year, month, '', momentObj);
      } else if (yearText.length === 6) {
        // [YYYYMM]
        year = this.loadYear(yearText.substring(0, 4), momentObj);
        month = this.loadMonth(yearText.substring(4, 6), momentObj);
        date = this.loadDate(year, month, '', momentObj);
      } else {
        year = this.loadYear(yearText.substring(0, 4), momentObj);
        month = this.loadMonth(yearText.substring(4, 6), momentObj);
        date = this.loadDate(year, month, yearText.substring(6, yearText.length), momentObj);
      }
      
      if (month === 1 && date === 29 && !this.isLeapYear(year)) {
        date = 28;
      }
    } else if (value.length === 2) {
      // [YYYY/][YYYY/MM]
      year = this.loadYear(value[0], momentObj);
      month = this.loadMonth(value[1], momentObj);
      date = this.loadDate(year, month, '', momentObj);
    } else if (value.length >= 3) {
      // [YYYY/MM/DD][YYYY/MM/DD/.....]
      year = this.loadYear(value[0], momentObj);
      month = this.loadMonth(value[1], momentObj);
      date = this.loadDate(year, month, value[2], momentObj);
    }
    momentObj.year(year);
    momentObj.month(month);
    momentObj.date(date);
    value = momentObj.format('YYYY/MM');
  }
  component.kindData.lastState = value;
  this.setVal(component, value);
  return;
};

expj.common.pscript.kind.setByYMDTIME = function (component) {
  var value = $.trim(component.value);
  if(value === ""){
    return;
  }
  value = value.split(' ');
  var ymdText = '';
  var timeText = '';
  for (var i = 0, len = value.length; i < len; i++) {
    if (value[i].match(/^\d*\/\d*\/\d*$/)) {
      ymdText = value[i];
    } else if (value[i].match(/^\d*\:\d*\:\d*$/)) {
      timeText = value[i]
    }
  }
  var momentObj = moment();
  var year, month, date, hour, minute, second;
  ymdText = ymdText.split('/');
  if (ymdText.length === 1) {
    year = this.loadYear(ymdText[0], momentObj);
    month = momentObj.month();
    date = this.loadDate(year, month, '', momentObj);
  } else if (ymdText.length === 2) {
    year = this.loadYear(ymdText[0], momentObj);
    month = this.loadMonth(ymdText[1], momentObj);
    date = this.loadDate(year, month, '', momentObj);
  } else {
    year = this.loadYear(ymdText[0], momentObj);
    month = this.loadMonth(ymdText[1], momentObj);
    date = this.loadDate(year, month, ymdText[2], momentObj);
  }
  timeText = timeText.split(':');
  if (timeText.length === 1) {
    hour = Number(timeText[0]);
    if (hour < 0) {
      hour = 0;
    } else if (hour > 23) {
      hour
    }
    minute = 0;
    second = 0;
  } else if (timeText.length === 2) {
    hour = Number(timeText[0]);
    if (hour < 0) {
      hour = 0;
    } else if (hour > 23) {
      hour = 23;
    }
    minute = Number(timeText[1]);
    if (minute < 0) {
      minute = 0;
    } else if (minute > 59) {
      minute = 59;
    }
    second = 0;
  } else {
    hour = Number(timeText[0]);
    if (hour < 0) {
      hour = 0;
    } else if (hour > 23) {
      hour = 23;
    }
    minute = Number(timeText[1]);
    if (minute < 0) {
      minute = 0;
    } else if (minute > 59) {
      minute = 59;
    }
    second = Number(timeText[2]);
    if (second < 0) {
      second = 0;
    } else if (second > 59) {
      second = 59;
    }
  }

  momentObj.year(year);
  momentObj.month(month);
  momentObj.date(date);
  momentObj.hour(hour);
  momentObj.minute(minute);
  momentObj.second(second);
  
  var value = momentObj.format("YYYY/MM/DD HH:mm:ss")
  this.setVal(component, value);
};

expj.common.pscript.kind.setByMD = function (component) {
  var value = $.trim(component.value);
  
  if (value === '') {
    component.kindData.lastState = '';
    this.setVal(component, '');
    return;
  }
  
  value = value.split(' ');
  value = value[0];
  
  if (!this.checkRegx(value, this.ValidateRegex.obt_date)) {
    var newText = '';
    for (var i = 0, len = value.length; i < len; i++) {
      var target = value.charAt(i);
      if (this.checkRegx(target, this.ValidateRegex.obt_date)) {
        newText += target;
      }
    }
    value = newText;
    component.kindData.lastState = value;
    this.setVal(component, value);
    return;
  }
  
  var momentObj = moment();
  var year = null;
  var month = null;
  var date = null;
  if (value === '/') {
    // [/]
    value = momentObj.format('MM/DD');
  } else {
    year = 2016;
    value = value.split('/');
    if (value.length === 1) {
      // [MM]
      var monthText = value[0];
      if (monthText.length <= 2) {
        month = this.loadMonth(monthText, momentObj);
        date = this.loadDate(year, month, '', momentObj);
      } else {
        month = this.loadMonth(monthText.substring(0, 2), momentObj);
        date = this.loadDate(year, month, monthText.substring(2, monthText.length), momentObj);
      }
    } else if (value.length == 2) {
      // [MM/DD][MM/DD/.....]
      month = this.loadMonth(value[0], momentObj);
      date = this.loadDate(year, month, value[1], momentObj);
    } else if (value.length >= 3) {
      month = this.loadMonth(value[1], momentObj);
      date = this.loadDate(year, month, value[2], momentObj);
    }
    momentObj.year(year);
    momentObj.month(month);
    momentObj.date(date);
    value = momentObj.format('MM/DD');
  }
  component.kindData.lastState = value;
  this.setVal(component, value);
  return;
};

expj.common.pscript.kind.loadYear = function (yearText, moment) {
  var year = null;
  if (yearText === '') {
    year = moment.year();
  } else {
    if (yearText.length === 4) {
      year = Number(yearText);
      if (year === 0) {
        year++;
      }
      return year;
    }
    year = parseInt(yearText);
    if (year < 1000) {
      year += 2000;
    } else if (year > 9999) {
      year = 9999;
    }
  }
  return year;
};

expj.common.pscript.kind.loadMonth = function (monthText, moment) {
  var month = null;
  if (monthText === '') {
    month = moment.month();
  } else {
    month = parseInt(monthText);
    if (month < 1) {
      month = 1;
    } else if (month > 12) {
      month = 12;
    }
    month--;
  }
  return month;
};

expj.common.pscript.kind.loadDate = function (year, month, dateText, moment) {
  month++;
  var date = null;
  if (dateText === '') {
    date = moment.date();
    if (month === 4 || month === 6 || month === 9 || month === 11) {
      if (date === 31) {
        date = 30;
      }
    } else if (month === 2) {
      if (date > 29 && this.isLeapYear(year)) {
        date = 29;
      } else if (date > 28) {
        date = 28;
      }
    }
  } else {
    date = parseInt(dateText);
    if (date < 1) {
      date = 1;
    } else {
      if (month === 1 || month === 3 || month === 5 || month === 7 || month === 8 || month === 10 || month === 12) {
        if (date > 31) {
          date = 31;
        }
      } else if (month === 4 || month === 6 || month === 9 || month === 11) {
        if (date > 30) {
          date = 30;
        }
      } else {
        if (date >= 29 && this.isLeapYear(year)) {
          date = 29;
        } else if (date > 28) {
          date = 28;
        }
      }
    }
  }
  return date;
};

expj.common.pscript.kind.isLeapYear = function (year) {
  if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
    return true;
  } else {
    return false;
  }
}

// --------------------------------------------------------------------------------------------------------------
// これ以降は入力アクション定義

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkInput = function (component) {
  var kind = component.kindData.kind;
  switch (kind) {
  case 'OBT_INTEGER':
    this.checkObtInteger(component);
    break;
  case 'OBT_INTEGER_P':
    this.checkObtIntegerP(component);
    break;
  case 'OBT_INTEGER_Z':
    this.checkObtIntegerZ(component);
    break;
  case 'OBT_NUMBER':
    this.checkObtNumber(component);
    break;
  case 'OBT_NUMBER_P':
    this.checkObtNumberP(component);
    break;
  case 'OBT_NUMBER_Z':
    this.checkObtNumberZ(component);
    break;
  case 'OBT_WILD':
    this.checkObtWild(component);
    break;
  case 'OBT_ALPHA':
    this.checkObtAlpha(component);
    break;
  case 'OBT_ALPHA_C':
    this.checkObtAlphaC(component);
    break;
  case 'OBT_ALPHA_S':
    this.checKObtAlphaS(component);
    break;
  case 'OBT_N':
    this.checkObtN(component);
    break;
  case 'OBT_AN':
    this.checkObtAn(component);
    break;
  case 'OBT_AN_SPC':
    this.checkObtAnSpc(component);
    break;
  case 'OBT_ANK':
    this.checkObtAnk(component);
    break;
  case 'OBT_ANK2':
    this.checkObtAnk2(component);
    break;
  case 'OBT_ANK3':
    this.checkObtAnk3(component);
    break;
  case 'OBT_ANK4':
    this.checkObtAnk4(component);
    break;
  case 'OBT_ANK_SPC':
    this.checkObtAnkSpc(component);
    break;
  case 'OBT_ANK2_SPC':
    this.checkObtAnk2Spc(component);
    break;
  case 'OBT_ANK3_SPC':
    this.checkObtAnk3Spc(component);
    break;
  case 'OBT_ANK4_SPC':
    this.checkObtAnk4Spc(component);
    break;
  case 'OBT_TELMO':
    this.checkObtTelmo(component);
    break;
  case 'OBT_MAIL':
    this.checkObtMail(component);
    break;
  case 'OBT_DATE':
    this.checkObtDate(component);
    break;
  default :
    this.checkDefault(component)
    break;
  }
};

expj.common.pscript.kind.maskText = function (component, regex, value) {
  var pos = $(component).getCursorPosition();
  var newText = '';
  for (var i = 0, len = value.length; i < len; i++) {
    var target = value.charAt(i);
    if (!this.checkRegx(target, regex)) {
      pos--;
    } else {
      newText += target;
    }
  }
  component.kindData.lastState = newText;
  this.setVal(component, newText);
  $(component).setCursorPosition(pos);
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtInteger = function (component) {
  // コンポーネントから値を取得する
  var value = component.value;
  // 値が空の時は処理を終了する
  if(value === ''){
    component.kindData.lastState = value;
    return;
  }
  
  if (this.imeFlg === true) {
    return;
  }
  
  if (this.checkRegx(value, this.CheckRegex.obt_interger)) {
    // 値が正常系の場合は最終値を更新する
    component.kindData.lastState = value;
  } else {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_interger, value);
  }
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtIntegerP = function (component) {
  // コンポーネントから値を取得する
  var value = component.value;
  // 値が空の時は処理を終了する
  if(value === ''){
    component.kindData.lastState = value;
    return;
  }
  
  if (this.imeFlg === true) {
    return;
  }
  
  if (this.checkRegx(value, this.CheckRegex.obt_interger_p)) {
    // 値が正常系の場合は最終値を更新する
    component.kindData.lastState = value;
  } else {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_interger_p, value);
  }
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtIntegerZ = function (component) {
  // コンポーネントから値を取得する
  var value = component.value;
  // 値が空の時は処理を終了する
  if(value === ''){
    component.kindData.lastState = value;
    return;
  }
  
  if (this.imeFlg === true) {
    return;
  }
  
  if (this.checkRegx(value, this.CheckRegex.obt_interger_z)) {
    // 値が正常系の場合は最終値を更新する
    component.kindData.lastState = value;
  } else {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_interger_z, value);
  }
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtNumber = function (component) {
  var value = component.value;
  if(value === ''){
    component.kindData.lastState = value;
    return;
  }
  
  if (this.imeFlg === true) {
    return;
  }
  
  if (this.checkRegx(value, this.CheckRegex.obt_number)) {
    component.kindData.lastState = value;
  } else {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_number, value);
  }
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtNumberP = function (component) {
  var value = component.value;
  if(value === ''){
    component.kindData.lastState = value;
    return;
  }
  
  if (this.imeFlg === true) {
    return;
  }
  
  if (this.checkRegx(value, this.CheckRegex.obt_number_p)) {
    component.kindData.lastState = value;
  } else {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_number_p, value);
  }
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtNumberZ = function (component) {
  var value = component.value;
  if(value === ''){
    component.kindData.lastState = value;
    return;
  }
  
  if (this.imeFlg === true) {
    return;
  }
  
  if (this.checkRegx(value, this.CheckRegex.obt_number_z)) {
    component.kindData.lastState = value;
  } else {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_number_z, value);
  }
}

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtWild = function (component){
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_wild)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_wild, value);
    return;
  }
  
    //追加禁止文字処理
  if (!this.checkUnuseableMark(value)) {
    expj.common.pscript.kind.setUnuseableMark(component, value);
    return
  }
  
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAlpha = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_alpha)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_alpha, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAlphaC = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_alpha_c)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_alpha_c, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checKObtAlphaS = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_alpha_s)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_alpha_s, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtN = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_n)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_n, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAn = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_an)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_an, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnSpc = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_an_spc)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_an_spc, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnk = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnk2 = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank2)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank2, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnk3 = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank3)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank3, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnk4 = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank4)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank4, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnkSpc = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank_spc)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank_spc, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnk2Spc = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank2_spc)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank2_spc, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnk3Spc = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank3_spc)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank3_spc, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtAnk4Spc = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_ank4_spc)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_ank4_spc, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtTelmo = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_telmo)) {
    value = value.toUpperCase();
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_telmo, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtMail = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_mail)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_mail, value);
    return;
  }
  
    //追加禁止文字処理
  /*if (!this.checkUnuseableMark(value)) {
    expj.common.pscript.kind.setUnuseableMark(component, value);
    return
  }*/
  
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkObtDate = function (component) {
  var dateFormatType = component.kindData.dateType;
  switch (dateFormatType) {
  case 'TYPE_YMD':
    this.checkByYMD(component);
    break;
  case 'TYPE_YM':
    this.checkByYM(component);
    break;
  case 'TYPE_YMDTIME':
    //checkByYMDTIME(component);
    break;
  case 'TYPE_MD':
    this.checkByMD(component);
    break;
  default:
    // ここは通過しない
    break;
  }
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkByYMD = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_date_ymd)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_date_ymd, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkByYM = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_date_ym)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_date_ym, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkByMD = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.obt_date_md)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.obt_date_md, value);
    return;
  }
  component.kindData.lastState = value;
};

/**
 * 
 * @param component
 */
expj.common.pscript.kind.checkDefault = function (component) {
  var value = component.value;
  if (value === '') {
    component.kindData.lastState = value;
    return;
  }
  if (this.imeFlg === true) {
    return;
  }
  if (!this.checkRegx(value, this.CheckRegex.noKind)) {
    expj.common.pscript.kind.maskText(component, this.CheckRegex.noKind, value);
    return;
  }
  
  //追加禁止文字処理
  if (!this.checkUnuseableMark(value)) {
    expj.common.pscript.kind.setUnuseableMark(component, value);
    return
  }
  
  component.kindData.lastState = value;
};


//追加禁止文字チェック
expj.common.pscript.kind.checkUnuseableMark = function(value){
  for(var i=0; i<expj.common.config.unuseableMarkArr.length; i++){
    if(value.indexOf(expj.common.config.unuseableMarkArr[i]) >= 0){
      return false;
    }
  }
  return true;
}

//追加禁止文字処理,禁止文字削除
expj.common.pscript.kind.setUnuseableMark = function (component, value) {
    var pos = $(component).getCursorPosition();
    var newText = '';
    var tmpNewText = '';
    
    for (var i = 0, len = value.length; i < len; i++) {
       var target = value.charAt(i);
       var newTextFLG = true;
       for(var j=0; j<expj.common.config.unuseableMarkArr.length; j++){
          if (target == expj.common.config.unuseableMarkArr[j]) {
            newTextFLG = false;
            break;
          }
       }
       if(newTextFLG == false){
          pos--;
       }else{
         newText += target;
       }
    }
    
    component.kindData.lastState = newText;
    this.setVal(component, newText);
    $(component).setCursorPosition(pos);
};

/**
 * OBT_WILD
 * OBT_ALPHA    OBT_ALPHA_C   OBT_ALPHA_S
 * OBT_N        OBT_N_SPC
 * OBT_ANK      OBT_ANK2      OBT_ANK3      OBT_ANK4
 * OBT_ANK_SPC  OBT_ANK2_SPC  OBT_ANK3_SPC  OBT_ANK4_SPC
 * OBT_TELMO    OBT_DATE      OBT_MAIL
 */
expj.common.pscript.kind.CheckRegex = (function () {
    return {
        'noKind': /^[^\\_%\n\r\f\t\v]+[^\\_%\n\r\f\t\v]*$/,//not: \\, _, %

        'obt_interger': /^[0-9\-]*$/ ,//OBT_INTEGER
        'obt_interger_p': /^[0-9]*$/ ,//OBT_INTEGER_P
        'obt_interger_z': /^[0-9]*$/ ,//OBT_INTEGER_Z
        'obt_number': /^[0-9\-\.]*$/ ,//OBT_NUMBER
        'obt_number_p': /^[0-9\.]*$/ ,//OBT_NUMBER_P
        'obt_number_z': /^[0-9\.]*$/ ,//OBT_NUMBER_Z

        'obt_wild': /^((?!\\|\s).|\u0020|\u3000)*$/,///^[^\\|\s]*$/;//not: \\,\s
        'obt_alpha': /^[A-Za-z]+$/,
        'obt_alpha_c': /^[A-Z]+$/,
        'obt_alpha_s': /^[a-z]+$/,
        'obt_n': /^[\d]+$/,
        'obt_an': /^[A-Za-z0-9]+$/,
        'obt_an_spc': /^[A-Za-z0-9\u0020]+$/,
        'obt_ank': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9D]+$/,
        'obt_ank2': /^[A-Za-z0-9\uFF66\uFF71-\uFF9D]+$/,
        'obt_ank3': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9F]+$/,
        'obt_ank4': /^[A-Za-z0-9\uFF66\uFF71-\uFF9F]+$/,
        'obt_ank_spc': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9D\u0020]+$/,
        'obt_ank2_spc': /^[A-Za-z0-9\uFF66\uFF71-\uFF9D\u0020]+$/,
        'obt_ank3_spc': /^[A-Za-z0-9\uFF66-\uFF6F\uFF71-\uFF9F\u0020]+$/,
        'obt_ank4_spc': /^[A-Za-z0-9\uFF66\uFF71-\uFF9F\u0020]+$/,
        'obt_telmo': /^[A-Z0-9\uFF66\uFF71-\uFF9F\,\.\uFF62\uFF63\(\)\-\/\u0020]+$/,
        'obt_date': /^[0-9\/]+$/,
        'obt_date_ymd': /^[0-9\/]*$/,
        'obt_date_ym': /^[0-9\/]*$/,
        'obt_date_md': /^[0-9\/]*$/,
        'obt_date_ymdtime': /^([12]([0-9]?){3}|0?[0-9]?)(\/(((0?[1-9]?|1[0-2])(\/(0?[1-9]?|[12][0-9]|30))?|((0?[13578]|1[02])\/31))(\u0020([01][0-9]?|2[0-4]?)?)?)?)?$/,

        'obt_mail': /^[A-Za-z0-9\@\!\#\$\%\&\'\*\+\-\/\=\?\^\_\`\{\|\}\~\.\,]+$/
    }
})();


