/// <reference types="jquery" />
/// <reference path="expjcore.ts" />
// OrteusView jQuery PlugIn
(function ($) {
    $.fn.orteusViewEx = function (options) {
        // オプションのカスタマイズ
        // 特に必要ないので素通り
        var config = $.extend({
            reloadTuningTableAfter: expj.common.tuningReloadTableAfter
        }, options);
        // jQueryがセレクタを基に取得した要素の先頭ひとつに処理を行う。
        // ここでは取得した要素の個数は1つを想定している。
        if (this.length > 0) {
            // 先頭要素の取得
            var element = this.get(0);
            var targetElement = $(element);
            if (targetElement.hasClass('orteusView') === false) {
                // 既にView化されていないかチェック
                targetElement.addClass('orteusView');
                // OrteusViewインスタンス生成
                var instance = new com.nec.jp.orteus.OrteusViewEx(config, element);
                element.OrteusView = instance;
            }
        }
        return this;
    };
})(jQuery);
var com;
(function (com) {
    var nec;
    (function (nec) {
        var jp;
        (function (jp) {
            var orteus;
            (function (orteus) {
                orteus.OrteusViewExVersion = 'jQuery.OrteusViewEx.js Ver1.0.2';
                var OrteusViewEx = /** @class */ (function () {
                    /**
                     * OrteusViewコンストラクタ
                     * @param config コンフィグデータ
                     * @param source 対象エレメント
                     */
                    function OrteusViewEx(config, source) {
                        // コンフィグデータ
                        /**
                         * 行選択種類
                         */
                        this.rowSelectKind = '';
                        /**
                         * 列幅変更可否
                         */
                        this.colResize = false;
                        /**
                         * ヘッダーデータ
                         */
                        this.headData = [];
                        /**
                         * ボディデータ
                         */
                        this.bodyData = [];
                        /**
                         * 行選択イベント（ユーザ定義）
                         */
                        this.rowSelectEvent = null;
                        /**
                         * View化対象HTMLElement
                         */
                        this.source = null;
                        /**
                         * ソート実行時マスクエリア
                         */
                        this.processMaskTag = null;
                        // OrteusViewが生成するViewタグエリア 
                        /**
                         * ヘッダー用DIVタグElement
                         */
                        this.headerDivTag = null;
                        /**
                         * ボディ用DIVタグElement
                         */
                        this.bodyDivTag = null;
                        /**
                         * ヘッダー用ラッパーDIVタグElement
                         */
                        this.headerInnerTag = null;
                        /**
                         * ヘッダー用TABLEタグElement
                         */
                        this.headerTable = null;
                        /**
                         * ヘッダー用テーブルのヘッダーTRタグElement
                         */
                        this.headerTheadTr = null;
                        /**
                         * ボディ用TABLEタグElement
                         */
                        this.bodyTable = null;
                        /**
                         * ボディ用テーブルのヘッダーTRタグElement
                         */
                        this.bodyTheadTr = null;
                        /**
                         * ボディ用テーブルのTBODYタグelement
                         */
                        this.bodyTbody = null;
                        // リサイズ時に利用するフィールド
                        /**
                         * ベースX軸記録フィールド
                         */
                        this.baseX = 0;
                        /**
                         * リサイズターゲット列のTHタグElement
                         */
                        this.resizeThTarget = null;
                        /**
                         * リサイズ前のターゲット列のTHタグの横幅
                         */
                        this.resizeThTargetWidth = 0;
                        /**
                         * リサイズ前のTABLEタグの横幅
                         */
                        this.resizeTableWidth = 0;
                        /**
                         * リサイズ中であることを示すbooleanフィールド
                         */
                        this.resizeFlg = false;
                        /**
                         * ソート時に利用するフィールド
                         */
                        this.sortTarget = null;
                        /**
                         * コールバック時にパラメータとして利用するインスタンスフィールド
                         */
                        this.callbackInstance = null;
                        // データ表示コントロールエリア
                        /**
                         * 表示行数
                         */
                        this.viewLine = 200;
                        /**
                         * リフレッシュ行数
                         */
                        this.refleshLine = 100;
                        /**
                         * 行の高さ
                         */
                        this.viewRowHeight = 18;
                        /**
                         * 非表示にしている行の総高さ（トップ）
                         */
                        this.topBlankElementHeight = 0;
                        /**
                         * 非表示にしている行の総高さ（ボトム）
                         */
                        this.bottomBlankElementHeight = 0;
                        /**
                         * 表示している行の位置（トップ）
                         */
                        this.viewTopPosition = 0;
                        /**
                         * 表示している行の位置（ボトム）
                         */
                        this.viewBottomPosition = Number.MAX_VALUE;
                        /**
                         * 非表示部分の行を再レンダリングする時に実行するコールバック関数
                         */
                        this.reloadTuningTableAfter = function () { };
                        /**
                         * View化するタグのID
                         */
                        this.viewId = '';
                        this.instanceId = new Date().getTime();
                        this.rowSelectKind = config.rowSelectKind;
                        this.colResize = config.colResize;
                        this.headData = config.headData;
                        this.bodyData = [];
                        for (var i = 0; i < config.bodyData.length; i++) {
                            var data = {
                                selected: false,
                                defaultIndex: i,
                                index: i,
                                datalist: config.bodyData[i]
                            };
                            this.bodyData.push(data);
                        }
                        this.rowSelectEvent = config.rowSelectEvent;
                        this.source = source;
                        this.viewTopPosition = 0;
                        this.viewBottomPosition = this.viewLine;
                        this.reloadTuningTableAfter = config.reloadTuningTableAfter;
                        this.viewId = config.viewId;
                        this.processMaskTag = OrteusViewEx.createMask();
                        this.createTable();
                    }
                    /**
                     * Viewソート時のマスクタグを取得するメソッド。
                     * タグが存在しなければbodyタグ配下に新規作成する。
                     */
                    OrteusViewEx.createMask = function () {
                        // タグの取得
                        var processMaskTag = document.getElementById('orteusView_ProcessMask');
                        if (processMaskTag === null) {
                            // タグの新規作成
                            processMaskTag = document.createElement('DIV');
                            processMaskTag.setAttribute('id', 'orteusView_ProcessMask');
                            processMaskTag.setAttribute('style', 'display: none;');
                            document.body.appendChild(processMaskTag);
                        }
                        return processMaskTag;
                    };
                    /**
                     * コールバック関数に渡すパラメータを生成するメソッド。
                     */
                    OrteusViewEx.prototype.getInstance = function () {
                        if (this.callbackInstance === null) {
                            this.callbackInstance = {
                                instance: this
                            };
                        }
                        return this.callbackInstance;
                    };
                    /**
                     * 行選択時に実行されるメソッド。
                     * @param event イベントオブジェクト
                     */
                    OrteusViewEx.selectedRow = function (event) {
                        var instance = event.data.instance;
                        var eventTarget = event.currentTarget;
                        var selectable = eventTarget.getAttribute('data-selectable');
                        if (selectable === 'true') {
                            var targetRow = $(eventTarget);
                            if (instance.rowSelectKind === 'single') {
                                // 1行選択の場合
                                // 既に選択済みの行をチェックする（Dom上）
                                var selectedList = targetRow.parent().find('.selected');
                                if (selectedList.length > 0) {
                                    // 選択済みの行が存在する場合、行選択を解除する
                                    selectedList.removeClass('selected');
                                    for (var i = 0; i < selectedList.length; i++) {
                                        var selectElement = selectedList[i];
                                        var indexText_1 = selectElement.getAttribute('data-rowIndex');
                                        var index_1 = parseInt(indexText_1);
                                        instance.bodyData[index_1].selected = false;
                                    }
                                }
                                //Data内をもう一回チェックする、存在する場合、選択外す
                                if (instance.bodyData.length > 0) {
                                    // 先頭のselectable=trueの要素を1個探し、選択状態にする。
                                    for (var i = 0; i < instance.bodyData.length; i++) {
                                        if (instance.bodyData[i].selected) {
                                            instance.bodyData[i].selected = false;
                                            break;
                                        }
                                    }
                                }
                                // 新しく選択された行を選択済み状態にする
                                targetRow.addClass('selected');
                                var indexText = eventTarget.getAttribute('data-rowIndex');
                                var index = parseInt(indexText);
                                instance.bodyData[index].selected = true;
                            }
                            else if (instance.rowSelectKind === 'multi') {
                                // 複数行選択の場合
                                var indexText = eventTarget.getAttribute('data-rowIndex');
                                var index = parseInt(indexText);
                                if (targetRow.hasClass('selected')) {
                                    // 行が既に選択済みの場合は、選択を解除する
                                    targetRow.removeClass('selected');
                                    instance.bodyData[index].selected = false;
                                }
                                else {
                                    // 行を選択状態にする
                                    targetRow.addClass('selected');
                                    instance.bodyData[index].selected = true;
                                }
                            }
                        }
                    };
                    // ヘッダー行オンマウス時のマウスカーソルの挙動を操作するイベント定義
                    // 特定の位置にマウスカーソルが来たときのみ、列幅再調整状態にする
                    OrteusViewEx.colResizeOverFunc = function (event) {
                        var mouseEvent = event.originalEvent;
                        var eventTarget = event.target;
                        var thTarget = eventTarget.nodeName === 'TH' ? eventTarget : $(eventTarget).parents('TH')[0];
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
                    ;
                    // 列幅変更時（ドラッグ時）のイベント定義
                    OrteusViewEx.colResizeMouseDownFunc = function (event) {
                        var instance = event.data.instance;
                        var eventTarget = event.target;
                        var thTarget = eventTarget.nodeName === 'TH' ? eventTarget : $(eventTarget).parents('TH')[0];
                        // 列幅再調整状態の時のみ、イベントの本処理が実行される
                        if ($(thTarget).css('cursor') === 'col-resize') {
                            var originalEvent = event.originalEvent;
                            instance.baseX = originalEvent.clientX;
                            // ソート無効化フラグを立てる
                            // これがないとマウスアップ後にソートイベントが走ってしまうため、その対策
                            instance.resizeFlg = true;
                            instance.resizeThTarget = thTarget;
                            instance.resizeThTargetWidth = Number($(thTarget).css('width').replace(/px/g, ''));
                            instance.resizeTableWidth = Number($(instance.headerTable).css('width').replace(/px/g, ''));
                            instance.processMaskTag.setAttribute('style', 'cursor: col-resize; display: block;');
                            // ドラッグ時に列幅がリアルタイムで変化しているように見せるイベント
                            // ドラッグ中にマウスカーソルが何処に行ってもいいように、documentオブジェクトに対してイベントを定義する
                            $(document).bind('mousemove.ColResize', instance.getInstance(), OrteusViewEx.colResizeMoveFunc);
                            // 列幅変更終了時（マウスアップ時）にdocumentオブジェクトに追加された列幅変更イベントを削除するイベント
                            // このイベントがないと、列幅変更状態が解除されないため
                            $(document).bind('mouseup.ColResize', instance.getInstance(), OrteusViewEx.colResizeEndFunc);
                        }
                        else {
                            instance.baseX = 0;
                            instance.resizeThTarget = null;
                            instance.resizeThTargetWidth = 0;
                            instance.resizeTableWidth = 0;
                        }
                    };
                    OrteusViewEx.colResizeMoveFunc = function (event) {
                        var instance = event.data.instance;
                        var mouseEvent = event.originalEvent;
                        var positionX = mouseEvent.clientX;
                        var moveX = positionX - instance.baseX;
                        var index = Number(instance.resizeThTarget.getAttribute('data-colIndex'));
                        var bodyThTarget = instance.bodyTheadTr.childNodes[index];
                        var baseTargetWidth = instance.resizeThTargetWidth;
                        var baseTableWidth = instance.resizeTableWidth;
                        // 列幅が10px以下にはならないようにする
                        if (baseTargetWidth + moveX > 20) {
                            $(instance.resizeThTarget).css('width', (baseTargetWidth + moveX) + 'px');
                            $(bodyThTarget).css('width', (baseTargetWidth + moveX) + 'px');
                            $(instance.headerTable).css('width', (baseTableWidth + moveX) + 'px');
                            $(instance.bodyTable).css('width', (baseTableWidth + moveX) + 'px');
                            $(instance.headerInnerTag).css('width', (baseTableWidth + moveX + 100) + 'px');
                        }
                        else {
                            $(instance.resizeThTarget).css('width', '20px');
                            $(bodyThTarget).css('width', '20px');
                            $(instance.headerTable).css('width', (baseTableWidth - baseTargetWidth + 20) + 'px');
                            $(instance.bodyTable).css('width', (baseTableWidth - baseTargetWidth + 20) + 'px');
                            $(instance.headerInnerTag).css('width', (baseTableWidth - baseTargetWidth + 120) + 'px');
                        }
                        // ドラッグ時にテキスト選択が行われてしまうので、それを解除する
                        window.getSelection().removeAllRanges();
                    };
                    OrteusViewEx.colResizeEndFunc = function (event) {
                        var instance = event.data.instance;
                        instance.processMaskTag.setAttribute('style', 'display: none;');
                        instance.resizeFlg = false;
                        // 列幅変更イベントと自分自身を削除する
                        $(document).unbind('mousemove.ColResize');
                        $(document).unbind('mouseup.ColResize');
                    };
                    /**
                     * ソート起動メソッド。
                     * @param event イベントオブジェクト
                     */
                    OrteusViewEx.sortFunc = function (event) {
                        // 対象のヘッダー列を取得
                        var target = event.currentTarget;
                        var instance = event.data.instance;
                        // 列幅変更が発生している場合はソートを無効にする
                        if (instance.resizeFlg) {
                            instance.resizeFlg = false;
                            return;
                        }
                        instance.processMaskTag.setAttribute('style', 'cursor: wait; display: block;');
                        instance.sortTarget = target;
                        setTimeout(OrteusViewEx.sortFuncMain, 15, instance);
                    };
                    /**
                     * ソートメインメソッド。
                     * @param instance Viewインスタンス
                     */
                    OrteusViewEx.sortFuncMain = function (instance) {
                        // 対象の列番号を取得
                        var index = Number(instance.sortTarget.getAttribute('data-colIndex'));
                        // ソートの昇順降順を決定する。
                        // 前に行われたのが昇順の場合、降順。それ以外の場合は昇順となる。
                        var sortKind = instance.sortTarget.getAttribute('data-sort');
                        if (sortKind === '' || sortKind === 'desc') {
                            sortKind = 'asc';
                        }
                        else {
                            sortKind = 'desc';
                        }
                        // 行うソート順を対象列に記録する
                        instance.sortTarget.setAttribute('data-sort', sortKind);
                        // ソートタイプ（文字列ソートまたは数値ソート）を取得する
                        var sortType = instance.sortTarget.getAttribute('data-type');
                        // ソートタイプからソート関数の決定
                        var sortFuncName = 'string-' + sortKind;
                        if (sortType === 'numeric') {
                            sortFuncName = sortType + '-' + sortKind;
                        }
                        // 行につけられた奇数偶数情報を削除する
                        var targetRowList = $(instance.bodyTbody).find('tr');
                        targetRowList.removeClass('odd').removeClass('even');
                        // ソートマークを初期化する。その後、対象ソート行にソートマークを付与する。
                        $(instance.headerTheadTr).find('span.orteusView_SortMark').html('');
                        if (sortKind === 'asc') {
                            $(instance.sortTarget).find('span.orteusView_SortMark').html('&#9650;').css('top', '3px').css('bottom', '');
                        }
                        else {
                            $(instance.sortTarget).find('span.orteusView_SortMark').html('&#9660;').css('top', '').css('bottom', '3px');
                        }
                        // ソートの実行。tbodyタグ配下のtrタグの順番を入れ替えることでソートを行う。
                        for (var i = 1; i < instance.bodyData.length; i++) {
                            // 二分探索によるソート済み領域の検索
                            var minIndex = 0;
                            var maxIndex = i;
                            var middleIndex = -1;
                            var result = 0;
                            while (minIndex <= maxIndex) {
                                middleIndex = Math.floor((minIndex + maxIndex) / 2);
                                var targetRow = instance.bodyData[i];
                                var middleRow = instance.bodyData[middleIndex];
                                var rowData1 = targetRow.datalist[index];
                                var rowData2 = middleRow.datalist[index];
                                result = OrteusViewEx.sortDataCheck(sortFuncName, rowData1, rowData2);
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
                                OrteusViewEx.rowDataSort(instance.bodyData, i, middleIndex + 1);
                            }
                            else if (result === -1) {
                                OrteusViewEx.rowDataSort(instance.bodyData, i, middleIndex);
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
                                    var targetRow = instance.bodyData[i];
                                    var middleRow = instance.bodyData[middleIndex];
                                    var rowData1 = targetRow.datalist[index];
                                    var rowData2 = middleRow.datalist[index];
                                    result = OrteusViewEx.sortDataCheck(sortFuncName, rowData1, rowData2);
                                } while (result === 0);
                                // 同値要素の最後尾を挿入ポイントとして探索対象要素を挿入する
                                // 同値要素の最後尾がソート済み要素の最後尾と同じ場合は何もしない
                                if (tailFlag) {
                                    OrteusViewEx.rowDataSort(instance.bodyData, i, middleIndex);
                                }
                            }
                        }
                        instance.clearBodyTableData();
                        instance.createBodyTableData();
                        instance.reloadTuningTableAfter(instance.viewId);
                        setTimeout(OrteusViewEx.sortFuncEnd, 0, instance);
                    };
                    OrteusViewEx.rowDataSort = function (list, targetIndex, referenceIndex) {
                        list.splice(referenceIndex, 0, list.splice(targetIndex, 1)[0]);
                    };
                    OrteusViewEx.sortFuncEnd = function (instance) {
                        instance.processMaskTag.setAttribute('style', 'display: none;');
                    };
                    /**
                     * OrteusViewのスクロールイベント定義
                     * @param event
                     */
                    OrteusViewEx.tableScrollControl = function (event) {
                        var instance = event.data.instance;
                        // ヘッダーテーブルとデータテーブルの横スクロール同期
                        OrteusViewEx.tableHorizontalScrollControll(instance);
                        // データテーブルの縦スクロール制御（データロード／アンロード）
                        OrteusViewEx.tableVerticalScrollControll(instance);
                    };
                    /**
                     * ヘッダーテーブルとデータテーブルの横スクロール同期
                     * @param instance OrteusViewのインスタンス
                     */
                    OrteusViewEx.tableHorizontalScrollControll = function (instance) {
                        instance.headerDivTag.scrollLeft = instance.bodyDivTag.scrollLeft;
                    };
                    /**
                     * データテーブルの縦スクロール制御（データロード／アンロード）
                     * @param instance OrteusViewのインスタンス
                     */
                    OrteusViewEx.tableVerticalScrollControll = function (instance) {
                        // スクロール量取得
                        var scrollTop = instance.bodyDivTag.scrollTop;
                        // ボトムの閾値
                        var bottomCheckPosition = instance.topBlankElementHeight + (instance.viewLine - 25) * instance.viewRowHeight;
                        // トップの閾値
                        var topCheckPosition = instance.topBlankElementHeight + 25 * instance.viewRowHeight;
                        if (bottomCheckPosition < scrollTop) {
                            // ボトム閾値よりもスクロール量が多い場合はデータロード／アンロード
                            do {
                                instance.viewTopPosition += instance.refleshLine;
                                instance.viewBottomPosition += instance.refleshLine;
                                instance.topBlankElementHeight = instance.viewRowHeight * instance.viewTopPosition;
                                bottomCheckPosition = instance.topBlankElementHeight + (instance.viewLine - 25) * instance.viewRowHeight;
                            } while (bottomCheckPosition < scrollTop);
                            instance.clearBodyTableData();
                            instance.createBodyTableData();
                            instance.reloadTuningTableAfter(instance.viewId);
                        }
                        else if (topCheckPosition > scrollTop && instance.viewTopPosition >= instance.refleshLine) {
                            // トップ閾値よりもスクロール量が少なく、かつ、トップ部のデータアンロードが発生していない場合はデータロード／アンロード
                            do {
                                instance.viewTopPosition -= instance.refleshLine;
                                instance.viewBottomPosition -= instance.refleshLine;
                                instance.topBlankElementHeight = instance.viewRowHeight * instance.viewTopPosition;
                                topCheckPosition = instance.topBlankElementHeight + 25 * instance.viewRowHeight;
                            } while (topCheckPosition > scrollTop && instance.viewTopPosition >= instance.refleshLine);
                            instance.clearBodyTableData();
                            instance.createBodyTableData();
                            instance.reloadTuningTableAfter(instance.viewId);
                        }
                    };
                    /**
                     * DOM上のテーブルデータをクリアする
                     */
                    OrteusViewEx.prototype.clearBodyTableData = function () {
                        var tbody = this.bodyTbody;
                        while (tbody.firstChild) {
                            tbody.removeChild(tbody.firstChild);
                        }
                    };
                    /**
                     * 全行選択メソッド
                     */
                    OrteusViewEx.prototype.selectedAllRow = function () {
                        OrteusViewEx.changeSelectedState(this, true);
                    };
                    /**
                     * 全行非選択メソッド
                     */
                    OrteusViewEx.prototype.unselectedAllRow = function () {
                        OrteusViewEx.changeSelectedState(this, false);
                    };
                    /**
                     * 全行選択状態変更メソッド
                     * @param instance OrteusViewインスタンス
                     * @param state 選択状態
                     */
                    OrteusViewEx.changeSelectedState = function (instance, state) {
                        if (instance.rowSelectKind === 'single') {
                            if (instance.bodyData.length > 0) {
                                // 先頭のselectable=trueの要素を1個探し、選択状態にする。
                                for (var i = 0; i < instance.bodyData.length; i++) {
                                    if (instance.bodyData[i].selectable) {
                                        instance.bodyData[i].selected = state;
                                        break;
                                    }
                                }
                            }
                        }
                        else if (instance.rowSelectKind === 'multi') {
                            for (var i = 0; i < instance.bodyData.length; i++) {
                                if (instance.bodyData[i].selectable) {
                                    instance.bodyData[i].selected = state;
                                }
                            }
                        }
                        instance.clearBodyTableData();
                        instance.createBodyTableData();
                        instance.reloadTuningTableAfter(instance.viewId);
                    };
                    OrteusViewEx.prototype.createTable = function () {
                        var targetElement = $(this.source);
                        // 複数行選択の場合、自身に複数行選択を示すクラスを追加する
                        if (this.rowSelectKind === 'multi') {
                            $(targetElement).removeClass('orteusView_None').removeClass('orteusView_Single').addClass('orteusView_Multi');
                        }
                        else if (this.rowSelectKind === 'single') {
                            $(targetElement).removeClass('orteusView_None').addClass('orteusView_Single').removeClass('orteusView_Multi');
                        }
                        else {
                            $(targetElement).addClass('orteusView_None').removeClass('orteusView_Single').removeClass('orteusView_Multi');
                        }
                        // ---------- テーブル（外側）を作成する ----------
                        this.headerDivTag = document.createElement('DIV');
                        this.headerDivTag.setAttribute('class', 'orteusView_HeadArea');
                        this.source.appendChild(this.headerDivTag);
                        this.bodyDivTag = document.createElement('DIV');
                        this.bodyDivTag.setAttribute('class', 'orteusView_BodyArea');
                        // ヘッダーテーブルととデータテーブルのスクロール連携を行う
                        $(this.bodyDivTag).on('scroll', this.getInstance(), OrteusViewEx.tableScrollControl);
                        this.source.appendChild(this.bodyDivTag);
                        this.headerInnerTag = document.createElement('DIV');
                        this.headerInnerTag.setAttribute('class', 'orteusView_scrollHeadWrapper');
                        this.headerDivTag.appendChild(this.headerInnerTag);
                        this.headerTable = document.createElement('TABLE');
                        this.headerInnerTag.appendChild(this.headerTable);
                        var headerThead = document.createElement('THEAD');
                        this.headerTable.appendChild(headerThead);
                        this.headerTheadTr = document.createElement('TR');
                        headerThead.appendChild(this.headerTheadTr);
                        this.bodyTable = document.createElement('TABLE');
                        this.bodyDivTag.appendChild(this.bodyTable);
                        var bodyThead = document.createElement('THEAD');
                        this.bodyTable.appendChild(bodyThead);
                        this.bodyTheadTr = document.createElement('TR');
                        bodyThead.appendChild(this.bodyTheadTr);
                        this.bodyTbody = document.createElement('TBODY');
                        this.bodyTable.appendChild(this.bodyTbody);
                        // ---------- テーブル（外側）を作成する(END) ----------
                        // ヘッダ情報と表データを取得する
                        var headData = this.headData;
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
                                headerTheadTh.setAttribute('data-colIndex', columnCount.toString());
                                headerTheadTh.setAttribute('data-sort', '');
                                var type = typeof (target.type) !== 'undefined' ? target.type : '';
                                headerTheadTh.setAttribute('data-type', type);
                                var name_1 = typeof (target.name) !== 'undefined' ? target.name : '';
                                headerTheadTh.setAttribute('data-name', name_1);
                                var className = typeof (target.class) !== 'undefined' ? target.class : '';
                                headerTheadTh.setAttribute('class', className);
                                var hidden = typeof (target.hidden) !== 'undefined' ? target.hidden : '';
                                // テキストコンテンツがあるかチェック
                                var title = typeof (target.title) !== 'undefined' ? target.title : '';
                                if (thinHeaderFlg && title !== '') {
                                    thinHeaderFlg = false;
                                }
                                // コンテンツ表示用とソートマーク表示用のspanタグを定義
                                var thLabel = document.createElement('SPAN');
                                thLabel.innerHTML = title;
                                var thMark = document.createElement('SPAN');
                                thMark.setAttribute('class', 'orteusView_SortMark');
                                headerTheadTh.appendChild(thLabel);
                                headerTheadTh.appendChild(thMark);
                                this.headerTheadTr.appendChild(headerTheadTh);
                                // データ部分のヘッダーを定義する
                                var bodyTheadTh = document.createElement('TH');
                                this.bodyTheadTr.appendChild(bodyTheadTh);
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
                                if (this.colResize) {
                                    $(headerTheadTh).on('mousemove', this.getInstance(), OrteusViewEx.colResizeOverFunc);
                                    $(headerTheadTh).on('mousedown', this.getInstance(), OrteusViewEx.colResizeMouseDownFunc);
                                }
                                // ソートが有効の場合はソートイベントをヘッダーのTHタグに追加する
                                if (target.sortable) {
                                    $(headerTheadTh).on('click', this.getInstance(), OrteusViewEx.sortFunc);
                                }
                                columnCount++;
                            }
                            else {
                                headWidthData.push(0);
                            }
                        }
                        // ヘッダー内にテキストコンテンツがあるか否かで当てはめるクラスを変更する
                        if (thinHeaderFlg) {
                            this.headerTheadTr.setAttribute('class', 'orteusView_headNone');
                        }
                        else {
                            this.headerTheadTr.setAttribute('class', 'orteusView_headText');
                        }
                        // TableタグとInnerDivタグの横幅を設定する。
                        this.headerTable.setAttribute('style', 'width:' + tableWidth + 'px;');
                        this.bodyTable.setAttribute('style', 'width:' + tableWidth + 'px;');
                        this.headerInnerTag.setAttribute('style', 'width:' + (tableWidth + 100) + 'px;');
                        for (var i = 0; i < this.bodyData.length; i++) {
                            var rowData = this.bodyData[i];
                            rowData.selectable = true;
                            for (var j = 0; j < rowData.datalist.length; j++) {
                                if (rowData.datalist[j].rowselectable === 'false') {
                                    rowData.selectable = false;
                                    break;
                                }
                            }
                        }
                        this.createBodyTableData();
                    };
                    OrteusViewEx.prototype.createBodyTableData = function () {
                        var headData = this.headData;
                        var headWidthData = []; // 列幅を記録
                        for (var i = 0; i < headData.length; i++) {
                            var target = headData[i];
                            if (target.visible) {
                                var width = Number(target.width.replace(/px/g, ''));
                                headWidthData.push(width);
                            }
                            else {
                                headWidthData.push(0);
                            }
                        }
                        var bodyData = this.bodyData;
                        // データ部分の生成
                        var oddEven = true; // 奇数偶数フラグ
                        var loopCount = bodyData.length;
                        var flagment = document.createDocumentFragment(); // ノード追加を高速化するためのフラグメント
                        var selectFlg = false;
                        if (this.rowSelectKind === 'single' || this.rowSelectKind === 'multi') {
                            selectFlg = true;
                        }
                        this.topBlankElementHeight = 0;
                        if (this.viewTopPosition > 0) {
                            var topBlankElement = document.createElement('TR');
                            flagment.appendChild(topBlankElement);
                            this.topBlankElementHeight = this.viewRowHeight * this.viewTopPosition;
                            topBlankElement.setAttribute('style', 'height: ' + this.topBlankElementHeight + 'px');
                            topBlankElement.setAttribute('class', 'orteusView_blankRow');
                        }
                        for (var i = 0; i < this.viewTopPosition; i++) {
                            var rowData = bodyData[i];
                            rowData.index = i;
                        }
                        var viewSize = this.viewBottomPosition > loopCount ? loopCount : this.viewBottomPosition;
                        for (var i = this.viewTopPosition; i < viewSize; i++) {
                            // TRタグの生成
                            var bodyTbodyTr = document.createElement('TR');
                            var bodyTbodyTrObj = $(bodyTbodyTr);
                            // 行選択イベントの追加
                            if (selectFlg) {
                                bodyTbodyTrObj.on('click', this.getInstance(), OrteusViewEx.selectedRow);
                            }
                            // 行クリックイベントの追加
                            if (jQuery.isFunction(this.rowSelectEvent)) {
                                bodyTbodyTrObj.on('click', this.getInstance(), this.rowSelectEvent);
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
                            var rowData = bodyData[i];
                            // 選択情報を追加
                            if (rowData.selected) {
                                bodyTbodyTrObj.addClass('selected');
                            }
                            if (rowData.selectable) {
                                bodyTbodyTr.setAttribute('data-selectable', 'true');
                            }
                            else {
                                bodyTbodyTr.setAttribute('data-selectable', 'false');
                            }
                            var tdHtml = '';
                            // TDタグを生成する
                            rowData.index = i;
                            bodyTbodyTr.setAttribute('data-rowIndex', rowData.index.toString());
                            for (var j = 0; j < rowData.datalist.length; j++) {
                                var targetHeadData = headData[j];
                                if (targetHeadData.visible) {
                                    var className = typeof (targetHeadData.class) !== 'undefined' ? targetHeadData.class : '';
                                    tdHtml += '<td class="' + className;
                                    if (headWidthData[j] === 0) {
                                        tdHtml += ' orteusView_hiddenColumn';
                                    }
                                    tdHtml += '">';
                                    tdHtml += OrteusViewEx.createViewBodyData(rowData.datalist[j]);
                                    tdHtml += '</td>';
                                }
                            }
                            // 生成したTDタグを挿入する（高速化のため、複数のTDタグを一度に追加）
                            bodyTbodyTr.innerHTML = tdHtml;
                            flagment.appendChild(bodyTbodyTr);
                        }
                        for (var i = viewSize; i < bodyData.length; i++) {
                            var rowData = bodyData[i];
                            rowData.index = i;
                        }
                        this.bottomBlankElementHeight = 0;
                        var bottomBlankCount = loopCount - this.viewBottomPosition;
                        if (bottomBlankCount > 0) {
                            var bottomBlankElement = document.createElement('TR');
                            flagment.appendChild(bottomBlankElement);
                            this.bottomBlankElementHeight = this.viewRowHeight * bottomBlankCount;
                            bottomBlankElement.setAttribute('style', 'height: ' + this.bottomBlankElementHeight + 'px');
                            bottomBlankElement.setAttribute('class', 'orteusView_blankRow');
                        }
                        this.bodyTbody.appendChild(flagment);
                        var rowCount = 0;
                        var rowSumHeight = 0;
                        for (var i = 0; i < this.bodyTbody.childNodes.length; i++) {
                            var rowNode = this.bodyTbody.childNodes[i];
                            if (rowNode instanceof HTMLTableRowElement) {
                                var classValue = rowNode.getAttribute('class');
                                if (classValue !== 'orteusView_blankRow') {
                                    rowCount++;
                                    rowSumHeight += rowNode.clientHeight;
                                }
                            }
                        }
                        if (rowCount > 0) {
                            this.viewRowHeight = rowSumHeight / rowCount;
                        }
                        else {
                            this.viewRowHeight = 18;
                        }
                        // データ部分テーブルの高さを調整（ヘッダー部分の高さをマイナス）
                        this.bodyDivTag.setAttribute('style', 'height:calc(100% - ' + (this.headerDivTag.clientHeight + 1) + 'px);');
                        if (loopCount === 0) {
                            var css = this.bodyTable.getAttribute('style') + 'height:1px;';
                            this.bodyTheadTr.setAttribute('style', css);
                        }
                        $(this.bodyTbody).find('input,select').bind('change', this.getInstance(), OrteusViewEx.changeInputText);
                    };
                    OrteusViewEx.changeInputText = function (event) {
                        var target = event.currentTarget;
                        var name = target.name;
                        var parent = target.parentElement;
                        while (!(parent instanceof HTMLTableRowElement)) {
                            if (parent === null) {
                                return;
                            }
                            parent = parent.parentElement;
                        }
                        var indexText = parent.getAttribute('data-rowIndex');
                        var index = parseInt(indexText);
                        var instance = event.data.instance;
                        var datalist = instance.bodyData[index].datalist;
                        for (var i = 0; i < datalist.length; i++) {
                            var data = datalist[i];
                            if (name === data.name) {
                                if (target instanceof HTMLInputElement) {
                                    if (data.type === 'text') {
                                        var exData = data;
                                        exData.value = target.value;
                                        console.debug((i + 1) + '行目のテキストボックス[' + name + ']を更新しました。：' + target.value);
                                    }
                                    else if (data.type === 'checkbox') {
                                        var exData = data;
                                        exData.checked = target.checked;
                                        console.debug((i + 1) + '行目のチェックボックス[' + name + ']を更新しました。：' + target.checked);
                                    }
                                    else if (data.type === 'radio') {
                                        var exData = data;
                                        for (var j = 0; j < instance.bodyData.length; j++) {
                                            var subdatalist = instance.bodyData[j].datalist;
                                            var subData = subdatalist[i];
                                            if (name === data.name && data.type === 'radio') {
                                                var subExData = subData;
                                                subExData.checked = false;
                                            }
                                        }
                                        exData.checked = target.checked;
                                        console.debug((i + 1) + '行目のテキストボックス[' + name + ']を更新しました。：' + target.checked);
                                    }
                                    else if (data.type === 'hidden') {
                                        var exData = data;
                                        exData.value = target.value;
                                        console.debug((i + 1) + '行目のテキストボックス[' + name + ']を更新しました。：' + target.value);
                                    }
                                }
                                else if (target instanceof HTMLSelectElement) {
                                    var exData = data;
                                    var value = target.value;
                                    exData.value = value;
                                    for (var j = 0; j < exData.options.length; j++) {
                                        var option = exData.options[j];
                                        if (option.value === value) {
                                            option.selected = true;
                                        }
                                        else {
                                            option.selected = false;
                                        }
                                    }
                                    console.debug((i + 1) + '行目のセレクト[' + name + ']を更新しました。：' + target.value);
                                }
                                break;
                            }
                        }
                    };
                    OrteusViewEx.createViewBodyData = function (viewData) {
                        var dataText = '';
                        if (viewData.type === 'label') {
                            var labelData = viewData;
                            dataText += '<span';
                            dataText += ' id="' + labelData.id + '"';
                            dataText += ' class="' + labelData.class + '"';
                            dataText += ' data-name="' + labelData.name + '"';
                            dataText += ' data-view="' + labelData.dataView + '"';
                            dataText += ' data-kind="' + labelData.kind + '"';
                            if (labelData.bgcolor) {
                                dataText += ' data-bgcolor="' + labelData.bgcolor + '"';
                            }
                            if (labelData.rowselectable) {
                                dataText += ' data-rowselectable="' + labelData.rowselectable + '"';
                            }
                            if (labelData.color) {
                                dataText += ' data-color="' + labelData.color + '"';
                            }
                            dataText += '>' + labelData.value + '</span>';
                        }
                        else if (viewData.type === 'text') {
                            var textData = viewData;
                            dataText += '<input type="text"';
                            dataText += ' id="' + textData.id + '"';
                            dataText += ' class="' + textData.class + '"';
                            dataText += ' name="' + textData.name + '"';
                            dataText += ' value="' + textData.value + '"';
                            dataText += ' data-kind="' + textData.kind + '"';
                            dataText += '/>';
                        }
                        else if (viewData.type === 'hidden') {
                            var hiddenData = viewData;
                            dataText += '<input type="hidden"';
                            dataText += ' id="' + hiddenData.id + '"';
                            dataText += ' class="' + hiddenData.class + '"';
                            dataText += ' name="' + hiddenData.name + '"';
                            dataText += ' value="' + hiddenData.value + '"';
                            dataText += ' data-kind="' + hiddenData.kind + '"';
                            dataText += '/>';
                        }
                        else if (viewData.type === 'checkbox') {
                            var checkData = viewData;
                            dataText += '<input type="checkbox"';
                            dataText += ' id="' + checkData.id + '"';
                            dataText += ' class="' + checkData.class + '"';
                            dataText += ' name="' + checkData.name + '"';
                            dataText += ' value="' + checkData.value + '"';
                            if (checkData.checked) {
                                dataText += ' checked="true"';
                            }
                            dataText += '/>';
                        }
                        else if (viewData.type === 'radio') {
                            var radioData = viewData;
                            dataText += '<input type="radio"';
                            dataText += ' id="' + radioData.id + '"';
                            dataText += ' class="' + radioData.class + '"';
                            dataText += ' name="' + radioData.name + '"';
                            dataText += ' value="' + radioData.value + '"';
                            if (radioData.checked) {
                                dataText += ' checked="true"';
                            }
                            dataText += '/>';
                        }
                        else if (viewData.type === 'select') {
                            var selectData = viewData;
                            dataText += '<select';
                            dataText += ' id="' + selectData.id + '"';
                            dataText += ' class="' + selectData.class + '"';
                            dataText += ' name="' + selectData.name + '"';
                            dataText += '>';
                            for (var i = 0; i < selectData.options.length; i++) {
                                var option = selectData.options[i];
                                dataText += '<option value="' + option.value + '"';
                                if (option.selected) {
                                    dataText += ' selected';
                                    selectData.value = option.value;
                                }
                                dataText += '>' + option.label + '</option>';
                            }
                            dataText += '</select>';
                        }
                        return dataText;
                    };
                    OrteusViewEx.sortDataCheck = function (sortKey, x, y) {
                        var result = OrteusViewEx.sortDataCheckCommon(x, y);
                        var xVal = result.x;
                        var yVal = result.y;
                        if (sortKey === 'string-asc') {
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
                        }
                        else if (sortKey === 'string-desc') {
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
                        }
                        else if (sortKey === 'numeric-asc') {
                            xVal = Number(xVal.replace(/,/g, ''));
                            yVal = Number(yVal.replace(/,/g, ''));
                            return ((xVal < yVal) ? -1 : ((xVal > yVal) ? 1 : 0));
                        }
                        else if (sortKey === 'numeric-desc') {
                            xVal = Number(xVal.replace(/,/g, ''));
                            yVal = Number(yVal.replace(/,/g, ''));
                            return ((xVal < yVal) ? 1 : ((xVal > yVal) ? -1 : 0));
                        }
                    };
                    OrteusViewEx.sortDataCheckCommon = function (xObj, yObj) {
                        var xVal;
                        var yVal;
                        if (xObj.type === 'label') {
                            xVal = xObj.value;
                        }
                        else if (xObj.type === 'text') {
                            xVal = xObj.value;
                        }
                        else if (xObj.type === 'checkbox') {
                            xVal = xObj.checked;
                        }
                        else if (xObj.type === 'radio') {
                            xVal = xObj.checked;
                        }
                        else if (xObj.type === 'hidden') {
                            xVal = xObj.value;
                        }
                        else if (xObj.type === 'select') {
                            xVal = xObj.value;
                        }
                        if (yObj.type === 'label') {
                            yVal = yObj.value;
                        }
                        else if (yObj.type === 'text') {
                            yVal = yObj.value;
                        }
                        else if (yObj.type === 'checkbox') {
                            yVal = yObj.checked;
                        }
                        else if (yObj.type === 'radio') {
                            yVal = yObj.checked;
                        }
                        else if (yObj.type === 'hidden') {
                            yVal = yObj.value;
                        }
                        else if (yObj.type === 'select') {
                            yVal = yObj.value;
                        }
                        var result = {
                            'x': xVal,
                            'y': yVal
                        };
                        return result;
                    };
                    return OrteusViewEx;
                }());
                orteus.OrteusViewEx = OrteusViewEx;
            })(orteus = jp.orteus || (jp.orteus = {}));
        })(jp = nec.jp || (nec.jp = {}));
    })(nec = com.nec || (com.nec = {}));
})(com || (com = {}));
//# sourceMappingURL=jQuery.OrteusViewEx.js.map