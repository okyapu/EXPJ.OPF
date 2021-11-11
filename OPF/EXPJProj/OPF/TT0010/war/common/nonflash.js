/* nonFlash.js
/
/  Common Processing JavaScript File
*/
/*=============================================================================
 Variable Definition
=============================================================================*/
var YEARMIN     = 1;           // Year Check Min
var YEARMAX     = Infinity;    // Year Check Max
var MONTHMIN    = 1;           // Month Check Min
var MONTHMAX    = 12;          // Month Check Max
var DAYMIN      = 1;           // Day Check Min
var DAYMAX      = 31;          // Day Check Max

/*=============================================================================
=============================================================================*/


/*=============================================================================
 Common Function
=============================================================================*/

function flashOnSCRMV(action,param,target,exStr,pageName,sbType){
//alert(""+action+"/"+param+"/"+target+"/"+exStr+"/"+pageName+"/"+sbType);
	var scrmvAry = exStr.split(",");
	var obj = getElementParent("EJBAR");
	var postStr = param + "%&%SCREEN_MOVE_FLG%=%1%&%MSG_CONTEXT_NO%=%" + scrmvAry[0] + "%&%TARGET_WINDOW%=%" + scrmvAry[1];

var s = "";
s += "self=[" + self + "]\n";
s += "self.parent=[" + self.parent + "]\n";
s += "self.parent.parent=[" + self.parent.parent + "]\n";
	if(obj){
		obj.SetVariable('exFunc.call',"scrmv%_FLASHSEPVALUES_%CREATE%_FLASHSEPVALUES_%"+scrmvAry[2]+"%_FLASHSEPVALUES_%"+"%_FLASHSEPVALUES_%"+scrmvAry[1]+"%_FLASHSEPVALUES_%" + postStr + "%_FLASHSEPVALUES_%" + pageName + "%_FLASHSEPVALUES_%" + this.name + "%_FLASHSEPVALUES_%" + action);
	}
}
function runScreenMvSub(postStr,pageName,target_window,action,name){
//alert(""+postStr+"/"+pageName+"/"+target_window+"/"+action+"/"+name);
	flashOnSubmit(action,postStr,name,"",pageName,"9");
}

// Processing before SUBMIT
function prepareSubmit()
{
	parent.expj.common.setScreenFrameConsoleMessage('');
	return true;
}

// Processing before SUBMIT (No Disp)
function prepareSubmitNoDisp()
{
	parent.expj.common.setScreenFrameConsoleMessage('');
	return true;
}

// Reading Completion Processing
function loadComplete()
{
	if(this.name.indexOf("_scrchg") != -1){
		var dname = this.name.split("_scrchg")[0];
		
		parent.document.body.all.stage.removeChild(parent.document.body.all(dname));
/*
		parent.document.body.all[this.name].name = target;
*/
		parent.document.body.all[this.name].id = dname;
		this.name = dname;
	}

	if(parent.hideStatus){
		parent.hideStatus();
		
		return true;
	}else{
		return false;
	}
}

// Processing of Close Button
function delPage(){
  if (typeof(expj) !== 'undefined' && expj !== null) {
    return true;
  }
  var list = document.getElementsByClassName('expj-noflash');
  if (list.length > 0) {
    var screenId = list[0].getAttribute('data-screenId');
    parent.expj.common.closeCommonPage(screenId);
  } else {

    var isIE = navigator.userAgent.search(/Trident/i)==-1 ? false :true;
    var iframe = null;
    if(isIE){
      iframe = document.frames.frameElement;
    }else{
      iframe = parent.document.activeElement;
    }

    if (iframe === null) {
      window.close();
    } else {
      var node = iframe.parentNode;
      var screenId = node.getAttribute('data-key');
      parent.expj.common.closeCommonPage(screenId);
    }
  }
}

// Processing of Clear Button
function clearPage()
{
	// The confirmation dialog is displayed.
	if (displayConfirmMessage("ZZ07008") == false) {
		return false;
	}

	parent.expj.common.setScreenFrameConsoleMessage('');
	return true;
}

// Null Check
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


// Date Check
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

	// Setting at leap year
	if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
		Monthdays[1] = 29;
	}
	// Year Check
	if(isNaN(year) || year < YEARMIN || year > YEARMAX) {
		return false;
	}
	// Month Check
	if(isNaN(month) || month < MONTHMIN || month > MONTHMAX) {
		return false;
	}
	// Day Check
	DAYMAX = Monthdays[month-1];
	if(isNaN(day) || day < DAYMIN || day > DAYMAX) {
		return false;
	}

	return true;
}


// Integer Check (Decimal Format OK)
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

// Integer Check
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

// Decimal Check
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

function _expj_getScreenId() {
  var target = document.getElementsByClassName('expj-noflash');
  var screenId = '';
  if (target.length > 0) {
    screenId = target[0].getAttribute('data-screenId');
  } else {
    var iframe = document.frames.frameElement;
    if (iframe !== null) {
      var node = iframe.parentNode;
      screenId = node.getAttribute('data-key');
    }
  }
  return screenId;
}

function _expj_screen_move_convert() {
  var anchorElements = document.getElementsByTagName('A');
  for (var i = 0, len = anchorElements.length; i < len; i++) {
    var target = anchorElements[i];
    target.hrefData = target.href;
    target.href = '#';
    target.addEventListener('click', function () {
      parent.expj.common.controlLoadingScreen(true);
      var data = this.hrefData;
      setTimeout(function () {
        var screenId = _expj_getScreenId();
        parent.expj.common.controlNoFlashPageMove(screenId, data);
      }, 0);
    }, false);
  }
  
  /*
  var formElements = document.getElementsByTagName('FORM');
  for (var i = 0, len = formElements.length; i < len; i++) {
    var target = formElements[i];
    target.definedOnsubmit = target.onsubmit;
    target.onsubmit = function () {
      result = true;
      if (typeof(this.definedOnsubmit) !== 'undefined' && this.definedOnsubmit !== null) {
        result = this.definedOnsubmit();
      }
      if (result) {
        var params = {};
        var elms = this.elements;
        for (var j = 0, jlen = elms.length; j < jlen; j++) {
          var component = elms[j];
          if (component.nodeName === 'INPUT' && (component.type === 'submit' || component.type === 'button')) {
            if (component.name === _expj_noflash_submit_button.name) {
              params[component.name] = component.value;
            }
          } else if (component.nodeName === 'INPUT' && (component.type === 'radio' || component.type === 'checkbox')) {
            if (component.checked) {
              if (Array.isArray(params[component.name])) {
                params[component.name].push(component.value);
              } else if (typeof(params[component.name]) !== 'undefined' && params[component.name] !== null) {
                var tmp = params[component.name];
                params[component.name] = [];
                params[component.name].push(tmp);
                params[component.name].push(component.value);
              } else {
                params[component.name] = component.value;
              }
            }
          } else {
            if (Array.isArray(params[component.name])) {
              params[component.name].push(component.value);
            } else if (typeof(params[component.name]) !== 'undefined' && params[component.name] !== null) {
              var tmp = params[component.name];
              params[component.name] = [];
              params[component.name].push(tmp);
              params[component.name].push(component.value);
            } else {
              params[component.name] = component.value;
            }
          }
        }
        if (_expj_noflash_submit_button.type === 'image') {
          params[_expj_noflash_submit_button.name] = _expj_noflash_submit_button.value;
        }
        _expj_noflash_submit_button = null;
        var screenId = _expj_getScreenId();
        parent.expj.common.controlNoFlashPageMove(screenId, this.action, params);
      }
      return false;
    }
  }
  */
  
  var mapElements = document.getElementsByTagName('MAP');
  for (var i = 0, len = mapElements.length; i < len; i++) {
    var list = mapElements[i].children;
    for (var j = 0, jlen = list.length; j < jlen; j++) {
      var target = list[j];
      if (target.href !== '') {
        target.flashData = target.href;
        target.href = '#';
        target.addEventListener('click', function () {
          parent.expj.common.controlLoadingScreen(true);
          var data = this.flashData;
          setTimeout(function () {
            var screenId = _expj_getScreenId();
            parent.expj.common.controlNoFlashPageMove(screenId, data);
          }, 0);
        }, false);
      }
    }
  }
}

var _expj_noflash_submit_button = null;

/*=============================================================================
=============================================================================*/
