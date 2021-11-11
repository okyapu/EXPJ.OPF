/**
 * COPYRIGHT (C) 2016        NEC INFORMATEC SYSTEMS, LTD.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * 履歴
 * 1.0.0.0 (2016/08/29),海老原,新規作成
 */
var com;
(function (com) {
    var nec;
    (function (nec) {
        var jp;
        (function (jp) {
            var orteus;
            (function (orteus) {
                var OrteusView;
                (function (OrteusView) {
                    OrteusView.version = 'jQuery.OrteusView.js Ver1.0.2';
                    OrteusView.sort = (function () {
                        /**
                         * 比較対象要素から値を取得する関数。
                         * inputタグのvalue値、selectタグの選択ラベル、spanタグの値を取得する。
                         */
                        function common(xObj, yObj) {
                            var xVal, yVal;
                            if (xObj.nodeName === 'SPAN') {
                                xVal = xObj.textContent;
                            }
                            else if (xObj.nodeName === 'INPUT' && xObj.type === 'checkbox') {
                                xVal = xObj.checked;
                            }
                            else if (xObj.nodeName === 'SELECT') {
                                xVal = xObj[xObj.selectedIndex].label;
                            }
                            else if (xObj.nodeName === '#text') {
                                xVal = xObj.data;
                            }
                            else {
                                xVal = xObj.value;
                            }
                            if (yObj.nodeName === 'SPAN') {
                                yVal = yObj.textContent;
                            }
                            else if (yObj.nodeName === 'INPUT' && yObj.type === 'checkbox') {
                                yVal = yObj.checked;
                            }
                            else if (yObj.nodeName === 'SELECT') {
                                yVal = yObj[yObj.selectedIndex].label;
                            }
                            else if (yObj.nodeName === '#text') {
                                yVal = yObj.data;
                            }
                            else {
                                yVal = yObj.value;
                            }
                            var result = {
                                'x': xVal,
                                'y': yVal
                            };
                            return result;
                        }
                        return {
                            /**
                             * 文字列ソート（昇順）のための項目比較関数。
                             * 第一引数の要素が第二引数の要素より小さい場合は-1を返却。
                             * 第一引数の要素が第二引数の要素より大きい場合は1を返却。
                             * 第一引数の要素と第二引数の要素が等しい場合は0を返却。
                             */
                            'string-asc': function (x, y) {
                                var result = common(x, y);
                                var xVal = result.x;
                                var yVal = result.y;
                                if (xVal === '' && yVal !== '') {
                                    return -1;
                                }
                                else if (xVal !== '' && yVal === '') {
                                    return 1;
                                }
                                else if (xVal === '' && yVal === '') {
                                    return 0;
                                }
                                else {
                                    return ((xVal < yVal) ? -1 : ((xVal > yVal) ? 1 : 0));
                                }
                            },
                            /**
                             * 文字列ソート（降順）のための項目比較関数。
                             * 第一引数の要素が第二引数の要素より小さい場合は1を返却。
                             * 第一引数の要素が第二引数の要素より大きい場合は-1を返却。
                             * 第一引数の要素と第二引数の要素が等しい場合は0を返却。
                             */
                            'string-desc': function (x, y) {
                                var result = common(x, y);
                                var xVal = result.x;
                                var yVal = result.y;
                                if (xVal === '' && yVal !== '') {
                                    return 1;
                                }
                                else if (xVal !== '' && yVal === '') {
                                    return -1;
                                }
                                else if (xVal === '' && yVal === '') {
                                    return 0;
                                }
                                else {
                                    return ((xVal < yVal) ? 1 : ((xVal > yVal) ? -1 : 0));
                                }
                            },
                            /**
                             * 数値ソート（昇順）のための項目比較関数。
                             * 第一引数の要素が第二引数の要素より小さい場合は-1を返却。
                             * 第一引数の要素が第二引数の要素より大きい場合は1を返却。
                             * 第一引数の要素と第二引数の要素が等しい場合は0を返却。
                             */
                            'numeric-asc': function (x, y) {
                                var result = common(x, y);
                                var xVal = Number(result.x.replace(/,/g, ''));
                                var yVal = Number(result.y.replace(/,/g, ''));
                                return ((xVal < yVal) ? -1 : ((xVal > yVal) ? 1 : 0));
                            },
                            /**
                             * 文字列ソート（降順）のための項目比較関数。
                             * 第一引数の要素が第二引数の要素より小さい場合は1を返却。
                             * 第一引数の要素が第二引数の要素より大きい場合は-1を返却。
                             * 第一引数の要素と第二引数の要素が等しい場合は0を返却。
                             */
                            'numeric-desc': function (x, y) {
                                var result = common(x, y);
                                var xVal = Number(result.x.replace(/,/g, ''));
                                var yVal = Number(result.y.replace(/,/g, ''));
                                return ((xVal < yVal) ? 1 : ((xVal > yVal) ? -1 : 0));
                            }
                        };
                    })();
                })(OrteusView = orteus.OrteusView || (orteus.OrteusView = {}));
            })(orteus = jp.orteus || (jp.orteus = {}));
        })(jp = nec.jp || (nec.jp = {}));
    })(nec = com.nec || (com.nec = {}));
})(com || (com = {}));
(function ($) {
    $.fn.orteusView = function (options) {
        // オプションのカスタマイズ
        // 特に必要ないので素通り
        var config = $.extend({}, options);
        var processMaskTag = document.getElementById('orteusView_ProcessMask');
        if (processMaskTag === null) {
            processMaskTag = document.createElement('DIV');
            processMaskTag.setAttribute('id', 'orteusView_ProcessMask');
            processMaskTag.setAttribute('style', 'display: none;');
            document.body.appendChild(processMaskTag);
        }
        // 1行選択または複数選択が有効になっている場合、行選択イベントを定義
        // それ以外のパラメータを指定した場合は、行選択不可となる
        var selectRowFunc = null;
        if (config.rowSelectKind === 'single' || config.rowSelectKind === 'multi') {
            // イベント定義
            selectRowFunc = function (event) {
                var selectable = event.currentTarget.getAttribute('data-selectable');
                if (selectable === 'true') {
                    var kind = config.rowSelectKind;
                    var targetRow = $(event.currentTarget);
                    if (kind === 'single') {
                        // 1行選択の場合
                        // 既に選択済みの行をチェックする
                        var selectedList = targetRow.parent().find('.selected');
                        if (selectedList.length > 0) {
                            // 選択済みの行が存在する場合、行選択を解除する
                            selectedList.removeClass('selected');
                        }
                        // 新しく選択された行を選択済み状態にする
                        targetRow.addClass('selected');
                    }
                    else {
                        // 複数行選択の場合
                        if (targetRow.hasClass('selected')) {
                            // 行が既に選択済みの場合は、選択を解除する
                            targetRow.removeClass('selected');
                        }
                        else {
                            // 行を選択状態にする
                            targetRow.addClass('selected');
                        }
                    }
                }
            };
        }
        // jQueryがセレクタを基に取得した要素ひとつひとつに処理を行う。
        // ここでは取得した要素の個数は1つを想定している
        this.each(function () {
            if ($(this).hasClass('orteusView')) {
                return;
            }
            else {
                $(this).addClass('orteusView');
            }
            // 複数行選択の場合、自身に複数行選択を示すクラスを追加する
            if (config.rowSelectKind === 'multi') {
                $(this).removeClass('orteusView_None').removeClass('orteusView_Single').addClass('orteusView_Multi');
            }
            else if (config.rowSelectKind === 'single') {
                $(this).removeClass('orteusView_None').addClass('orteusView_Single').removeClass('orteusView_Multi');
            }
            else {
                $(this).addClass('orteusView_None').removeClass('orteusView_Single').removeClass('orteusView_Multi');
            }
            // ---------- テーブル（外側）を作成する ----------
            var headerDivTag = document.createElement('DIV');
            headerDivTag.setAttribute('class', 'orteusView_HeadArea');
            this.appendChild(headerDivTag);
            var bodyDivTag = document.createElement('DIV');
            bodyDivTag.setAttribute('class', 'orteusView_BodyArea');
            // ヘッダーテーブルととデータテーブルのスクロール連携を行う
            $(bodyDivTag).on('scroll', function (event) {
                headerDivTag.scrollLeft = bodyDivTag.scrollLeft;
            });
            this.appendChild(bodyDivTag);
            var headerInnerTag = document.createElement('DIV');
            headerInnerTag.setAttribute('class', 'orteusView_scrollHeadWrapper');
            headerDivTag.appendChild(headerInnerTag);
            var headerTable = document.createElement('TABLE');
            headerInnerTag.appendChild(headerTable);
            var headerThead = document.createElement('THEAD');
            headerTable.appendChild(headerThead);
            var headerTheadTr = document.createElement('TR');
            headerThead.appendChild(headerTheadTr);
            var bodyTable = document.createElement('TABLE');
            bodyDivTag.appendChild(bodyTable);
            var bodyThead = document.createElement('THEAD');
            bodyTable.appendChild(bodyThead);
            var bodyTheadTr = document.createElement('TR');
            bodyThead.appendChild(bodyTheadTr);
            var bodyTbody = document.createElement('TBODY');
            bodyTable.appendChild(bodyTbody);
            // ---------- テーブル（外側）を作成する(END) ----------
            // ヘッダ情報と表データを取得する
            var headData = config.headData;
            var bodyData = config.bodyData;
            // 列幅選択が有効になっている場合、イベントを定義する
            var colResizeFunc = null;
            var colResizeMouseDownFunc = null;
            if (config.colResize) {
                // ヘッダー行オンマウス時のマウスカーソルの挙動を操作するイベント定義
                // 特定の位置にマウスカーソルが来たときのみ、列幅再調整状態にする
                colResizeFunc = function (event) {
                    var mouseEvent = event.originalEvent;
                    var thTarget = event.target.nodeName === 'TH' ? event.target : $(event.target).parents('TH')[0];
                    var offset = $(thTarget).offset();
                    var nLength = $(thTarget).innerWidth();
                    // マウスカーソルの位置と列の右端が5px以内の場合、列幅再調整状態にする
                    // それ以外は通常状態とする
                    if (Math.abs(mouseEvent.pageX - Math.round(offset.left + nLength)) <= 5) {
                        $(thTarget).css('cursor', 'col-resize');
                    }
                    else {
                        $(thTarget).css('cursor', '');
                    }
                };
                // 列幅変更時（ドラッグ時）のイベント定義
                colResizeMouseDownFunc = function (event) {
                    var thTarget = event.target.nodeName === 'TH' ? event.target : $(event.target).parents('TH')[0];
                    // 列幅再調整状態の時のみ、イベントの本処理が実行される
                    if ($(thTarget).css('cursor') === 'col-resize') {
                        var index = Number(thTarget.getAttribute('data-colIndex'));
                        var bodyThTarget = bodyTheadTr.childNodes[index];
                        var baseTargetWidth = Number($(thTarget).css('width').replace(/px/g, ''));
                        var baseTableWidth = Number($(headerTable).css('width').replace(/px/g, ''));
                        var originalEvent = event.originalEvent;
                        var baseX = originalEvent.clientX;
                        // ソート無効化フラグを立てる
                        // これがないとマウスアップ後にソートイベントが走ってしまうため、その対策
                        thTarget.isSorting = true;
                        processMaskTag.setAttribute('style', 'cursor: col-resize; display: block;');
                        // ドラッグ時に列幅がリアルタイムで変化しているように見せるイベント
                        // ドラッグ中にマウスカーソルが何処に行ってもいいように、documentオブジェクトに対してイベントを定義する
                        $(document).bind('mousemove.ColResize', function (event) {
                            var positionX = event.originalEvent.clientX;
                            var moveX = positionX - baseX;
                            // 列幅が10px以下にはならないようにする
                            if (baseTargetWidth + moveX > 20) {
                                $(thTarget).css('width', (baseTargetWidth + moveX) + 'px');
                                $(bodyThTarget).css('width', (baseTargetWidth + moveX) + 'px');
                                $(headerTable).css('width', (baseTableWidth + moveX) + 'px');
                                $(bodyTable).css('width', (baseTableWidth + moveX) + 'px');
                                $(headerInnerTag).css('width', (baseTableWidth + moveX + 100) + 'px');
                            }
                            else {
                                $(thTarget).css('width', '20px');
                                $(bodyThTarget).css('width', '20px');
                                $(headerTable).css('width', (baseTableWidth - baseTargetWidth + 20) + 'px');
                                $(bodyTable).css('width', (baseTableWidth - baseTargetWidth + 20) + 'px');
                                $(headerInnerTag).css('width', (baseTableWidth - baseTargetWidth + 120) + 'px');
                            }
                            // ドラッグ時にテキスト選択が行われてしまうので、それを解除する
                            window.getSelection().removeAllRanges();
                        });
                        // 列幅変更終了時（マウスアップ時）にdocumentオブジェクトに追加された列幅変更イベントを削除するイベント
                        // このイベントがないと、列幅変更状態が解除されないため
                        $(document).bind('mouseup.ColResize', function (event) {
                            processMaskTag.setAttribute('style', 'display: none;');
                            delete thTarget.isSorting;
                            // 列幅変更イベントと自分自身を削除する
                            $(document).unbind('mousemove.ColResize');
                            $(document).unbind('mouseup.ColResize');
                        });
                    }
                    // イベント定義終了
                };
            }
            // ソートイベントを定義する
            var sortFunc = function (event) {
                // 対象のヘッダー列を取得
                var target = event.currentTarget;
                // 列幅変更が発生している場合はソートを無効にする
                if (target.isSorting) {
                    delete target.isSorting;
                    return;
                }
                processMaskTag.setAttribute('style', 'cursor: wait; display: block;');
                setTimeout(function () {
                    // 対象の列番号を取得
                    var index = Number(target.getAttribute('data-colIndex'));
                    // ソートの昇順降順を決定する。
                    // 前に行われたのが昇順の場合、降順。それ以外の場合は昇順となる。
                    var sortKind = target.getAttribute('data-sort');
                    if (sortKind === '' || sortKind === 'desc') {
                        sortKind = 'asc';
                    }
                    else {
                        sortKind = 'desc';
                    }
                    // 行うソート順を対象列に記録する
                    target.setAttribute('data-sort', sortKind);
                    // ソートタイプ（文字列ソートまたは数値ソート）を取得する
                    var sortType = target.getAttribute('data-type');
                    // ソートタイプからソート関数の決定
                    var sortFuncName = 'string-' + sortKind;
                    if (sortType === 'numeric') {
                        sortFuncName = sortType + '-' + sortKind;
                    }
                    // 行につけられた奇数偶数情報を削除する
                    var targetRowList = $(bodyTbody).find('tr');
                    targetRowList.removeClass('odd').removeClass('even');
                    // ソートマークを初期化する。その後、対象ソート行にソートマークを付与する。
                    $(headerTheadTr).find('span.orteusView_SortMark').html('');
                    if (sortKind === 'asc') {
                        $(target).find('span.orteusView_SortMark').html('&#9650;').css('top', '3px').css('bottom', '');
                    }
                    else {
                        $(target).find('span.orteusView_SortMark').html('&#9660;').css('top', '').css('bottom', '3px');
                    }
                    // ソートの実行。tbodyタグ配下のtrタグの順番を入れ替えることでソートを行う。
                    for (var i = 1; i < bodyTbody.childNodes.length; i++) {
                        // 二分探索によるソート済み領域の検索
                        var minIndex = 0;
                        var maxIndex = i;
                        var result;
                        while (minIndex <= maxIndex) {
                            var middleIndex = Math.floor((minIndex + maxIndex) / 2);
                            var targetRow = bodyTbody.childNodes[i];
                            var middleRow = bodyTbody.childNodes[middleIndex];
                            var rowData1 = targetRow.childNodes[index].childNodes[0];
                            var rowData2 = middleRow.childNodes[index].childNodes[0];
                            result = com.nec.jp.orteus.OrteusView.sort[sortFuncName](rowData1, rowData2);
                            if (result === 1) {
                                minIndex = middleIndex + 1;
                            }
                            else if (result === -1) {
                                maxIndex = middleIndex - 1;
                            }
                            else {
                                break;
                            }
                        }
                        // 二分探索結果を基に挿入ポイントに探索対象要素を挿入する
                        if (result === 1) {
                            bodyTbody.insertBefore(bodyTbody.childNodes[i], bodyTbody.childNodes[middleIndex + 1]);
                        }
                        else if (result === -1) {
                            bodyTbody.insertBefore(bodyTbody.childNodes[i], bodyTbody.childNodes[middleIndex]);
                        }
                        else {
                            // 同値要素の場合は、配列を更に探索し、同値要素の最後尾を探す
                            var tailFlag = true;
                            do {
                                if (middleIndex + 1 >= i) {
                                    tailFlag = false;
                                    break;
                                }
                                middleIndex++;
                                var targetRow = bodyTbody.childNodes[i];
                                var middleRow = bodyTbody.childNodes[middleIndex];
                                var rowData1 = targetRow.childNodes[index].childNodes[0];
                                var rowData2 = middleRow.childNodes[index].childNodes[0];
                                result = com.nec.jp.orteus.OrteusView.sort[sortFuncName](rowData1, rowData2);
                            } while (result === 0);
                            // 同値要素の最後尾を挿入ポイントとして探索対象要素を挿入する
                            // 同値要素の最後尾がソート済み要素の最後尾と同じ場合は何もしない
                            if (tailFlag) {
                                bodyTbody.insertBefore(bodyTbody.childNodes[i], bodyTbody.childNodes[middleIndex]);
                            }
                        }
                    }
                    // ソート後の行に奇数偶数情報を与える
                    var oddEven = true;
                    targetRowList = $(bodyTbody).find('tr');
                    for (var i = 0; i < targetRowList.length; i++) {
                        var t = $(targetRowList[i]);
                        if (oddEven) {
                            t.addClass('odd');
                            oddEven = false;
                        }
                        else {
                            t.addClass('even');
                            oddEven = true;
                        }
                        t.attr('data-rowIndex', i);
                    }
                    setTimeout(function () {
                        processMaskTag.setAttribute('style', 'display: none;');
                    }, 0);
                }, 15);
            };
            // thead部分の生成
            var tableWidth = 0; // テーブルのトータルサイズを記録
            var columnCount = 0; // 列数を記録
            var headWidthData = []; // 列幅を記録
            var thinHeaderFlg = true; // ヘッダー列にテキストコンテンツがあるか記録
            for (var i = 0; i < headData.length; i++) {
                var target = headData[i];
                // visible=trueのみDOMに追加する
                if (target.visible) {
                    // ヘッダー部分のヘッダーを定義する。ここでパラメータから属性も与える。
                    var headerTheadTh = document.createElement('TH');
                    headerTheadTh.setAttribute('data-colIndex', String(columnCount));
                    headerTheadTh.setAttribute('data-sort', '');
                    var type = typeof (target.type) !== 'undefined' ? target.type : '';
                    headerTheadTh.setAttribute('data-type', type);
                    var name = typeof (target.name) !== 'undefined' ? target.name : '';
                    headerTheadTh.setAttribute('data-name', name);
                    var className = typeof (target["class"]) !== 'undefined' ? target["class"] : '';
                    headerTheadTh.setAttribute('class', className);
                    var hidden = typeof (target.hidden) !== 'undefined' ? target.hidden : '';
                    // テキストコンテンツがあるかチェック
                    var title = typeof (target.title) !== 'undefined' ? target.title : '';
                    if (thinHeaderFlg && title !== '') {
                        thinHeaderFlg = false;
                    }
                    // コンテンツ表示用とソートマーク表示用のspanタグを定義
                    var innerHTML = '<span>' + title + '</span><span class="orteusView_SortMark"></span>';
                    headerTheadTh.innerHTML = innerHTML;
                    headerTheadTr.appendChild(headerTheadTh);
                    // データ部分のヘッダーを定義する
                    var bodyTheadTh = document.createElement('TH');
                    bodyTheadTr.appendChild(bodyTheadTh);
                    // パラメータから列幅を設定する。
                    var width = Number(target.width.replace(/px/g, ''));
                    tableWidth += width;
                    var css = 'width:' + target.width + ';';
                    headerTheadTh.setAttribute('style', css);
                    bodyTheadTh.setAttribute('style', css);
                    headWidthData.push(width);
                    // 0pxの時は非表示列とする
                    if (width === 0 || hidden === 'true') {
                        headerTheadTh.setAttribute('class', 'orteusView_hiddenColumn');
                        bodyTheadTh.setAttribute('class', 'orteusView_hiddenColumn');
                    }
                    // 列幅変更が有効の場合は列幅変更イベントをヘッダーのTHタグに追加する
                    if (config.colResize) {
                        $(headerTheadTh).on('mousemove', colResizeFunc);
                        $(headerTheadTh).on('mousedown', colResizeMouseDownFunc);
                    }
                    // ソートが有効の場合はソートイベントをヘッダーのTHタグに追加する
                    if (target.sortable) {
                        $(headerTheadTh).on('click', sortFunc);
                    }
                    columnCount++;
                }
                else {
                    headWidthData.push(0);
                }
            }
            // ヘッダー内にテキストコンテンツがあるか否かで当てはめるクラスを変更する
            if (thinHeaderFlg) {
                headerTheadTr.setAttribute('class', 'orteusView_headNone');
            }
            else {
                headerTheadTr.setAttribute('class', 'orteusView_headText');
            }
            // TableタグとInnerDivタグの横幅を設定する。
            headerTable.setAttribute('style', 'width:' + tableWidth + 'px;');
            bodyTable.setAttribute('style', 'width:' + tableWidth + 'px;');
            headerInnerTag.setAttribute('style', 'width:' + (tableWidth + 100) + 'px;');
            // データ部分の生成
            var oddEven = true; // 奇数偶数フラグ
            var loopCount = bodyData.length;
            var flagment = document.createDocumentFragment(); // ノード追加を高速化するためのフラグメント
            for (var i = 0; i < loopCount; i++) {
                // TRタグの生成
                var bodyTbodyTr = document.createElement('TR');
                var bodyTbodyTrObj = $(bodyTbodyTr);
                // 行選択イベントの追加
                if (selectRowFunc !== null) {
                    bodyTbodyTrObj.on('click', selectRowFunc);
                }
                // 行クリックイベントの追加
                if (jQuery.isFunction(config.rowSelectEvent)) {
                    bodyTbodyTrObj.on('click', config.rowSelectEvent);
                }
                // 行の奇数偶数で適用するクラスを変更する
                if (oddEven) {
                    bodyTbodyTrObj.addClass('odd');
                    oddEven = false;
                }
                else {
                    bodyTbodyTrObj.addClass('even');
                    oddEven = true;
                }
                // 行番号イベントを追加
                bodyTbodyTr.setAttribute('data-rowIndex', String(i));
                bodyTbodyTr.setAttribute('data-defaultRowIndex', String(i));
                bodyTbodyTr.setAttribute('data-selectable', 'true');
                var tdHtml = '';
                // TDタグを生成する
                for (var j = 0; j < bodyData[i].length; j++) {
                    var targetHeadData = headData[j];
                    if (targetHeadData.visible) {
                        var className = typeof (targetHeadData["class"]) !== 'undefined' ? targetHeadData["class"] : '';
                        tdHtml += '<td class="' + className;
                        if (headWidthData[j] === 0) {
                            tdHtml += ' orteusView_hiddenColumn';
                        }
                        tdHtml += '">';
                        tdHtml += bodyData[i][j];
                        tdHtml += '</td>';
                    }
                }
                // 生成したTDタグを挿入する（高速化のため、複数のTDタグを一度に追加）
                bodyTbodyTr.innerHTML = tdHtml;
                flagment.appendChild(bodyTbodyTr);
            }
            bodyTbody.appendChild(flagment);
            // データ部分テーブルの高さを調整（ヘッダー部分の高さをマイナス）
            bodyDivTag.setAttribute('style', 'height:calc(100% - ' + (headerDivTag.clientHeight + 1) + 'px);');
            if (loopCount === 0) {
                var css = bodyTable.getAttribute('style') + 'height:1px;';
                bodyTheadTr.setAttribute('style', css);
            }
        });
        return this;
    };
})(jQuery);
//# sourceMappingURL=jQuery.OrteusView.js.map