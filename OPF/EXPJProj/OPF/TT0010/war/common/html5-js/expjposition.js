
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
expj.common.version.expjposition = 'expjposition.js Ver1.0.0';

(function($, undefined) {
    $.fn.getCursorPosition = function() {
        var el = $(this).get(0);
        var pos = 0;
        if ('selectionStart' in el) {
            pos = el.selectionStart;
        } else if ('selection' in document) {
            el.focus();
            var Sel = document.selection.createRange();
            var SelLength = document.selection.createRange().text.length;
            Sel.moveStart('character', -el.value.length);
            pos = Sel.text.length - SelLength;
        }
        return pos;
    };
    $.fn.setCursorPosition = function(position){
        if(this.lengh == 0) return this;
        return $(this).setSelection(position, position);
    };
    $.fn.setSelection = function(selectionStart, selectionEnd) {
        if(this.lengh == 0) return this;
        input = this[0];

        if (input.createTextRange) {
            var range = input.createTextRange();
            range.collapse(true);
            range.moveEnd('character', selectionEnd);
            range.moveStart('character', selectionStart);
            range.select();
        } else if (input.setSelectionRange) {
            input.focus();
            input.setSelectionRange(selectionStart, selectionEnd);
        }

        return this;
    };
    $.fn.focusEnd = function(){
        this.setCursorPosition(this.val().length);
    };
})(jQuery);