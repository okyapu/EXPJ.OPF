/**
 * パスワード変更ボタンを押したときに実行される関数<br>
 * @param minLen 最小文字数
 * @param rule ルール
 */
function expj_submit_change_password_process(minLen, rule) {
  // 入力チェックに合格した場合のみ変更処理を行う。
  if (chkinput2(minLen, rule)) {
    // フォームのパラメータを取得する
    var passwordOld = $("#expj-business-screen-PASSWORD-passwordOld");
    var password1 = $("#expj-business-screen-PASSWORD-password1");
    var password2 = $("#expj-business-screen-PASSWORD-password2");
    var userCd = $("#expj-business-screen-PASSWORD-userCd");
    var button = $("#expj-business-screen-PASSWORD-button");
    
    // Submitを行う
    var requestParameter = {
      'passwordOld' : passwordOld.val(),
      'password1' : password1.val(),
      'password2' : password2.val(),
      'userCd' : userCd.val(),
      'change' : button.val()
    };
    var response = expj.common.accessBusinessScreen('POST', 'changePassword.jsp', requestParameter);

    /** タブに表示する内容 */
    var tabBody = "";
    if (response.status === 0) {
      // HTTPステータスコードが0の時の処理（WebLogicが起動していないなどのネットワークエラー発生時）
      // 内容を生成する
      tabBody += '<div>HTTP Status : ' + response.status + '<br>';
      tabBody += 'Status Text : ' + response.statusText + '</div>';
    } else if (response.status === 200) {
      // HTTPステータスコードが200の時の処理（正常動作時）
      // レスポンスオブジェクトからHTMLオブジェクトを取得する
      /** jQueryのHTMLオブジェクト */
      var htmlObject = expj.common.convertBusinessScreenHtmlObject(response);
      /** jQueryのHTMLオブジェクト解析結果 */
      var result = expj.common.analyzeBusinessScreenHtmlObject("PASSWORD", htmlObject);
      tabBody = result.tabBody;
    } else if (response.status === 500) {
      // HTTPステータスコードが500の時の処理（サーバエラー）
      // レスポンスオブジェクトからHTMLオブジェクトを取得する
      /** jQueryのHTMLオブジェクト */
      var htmlObject = expj.common.convertBusinessScreenHtmlObject(response);
      /** jQueryのHTMLオブジェクト解析結果 */
      var result = expj.common.analyzeBusinessScreenHtmlObject("error", htmlObject);
      tabBody = result.tabBody;
    }
    $("#expj-business-screen-tabs-body-PASSWORD").html(tabBody);
  }
}