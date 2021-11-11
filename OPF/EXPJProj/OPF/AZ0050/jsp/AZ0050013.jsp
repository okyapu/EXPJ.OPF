<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:44:55 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050013.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0050.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>

<%
    HttpSession so = request.getSession(false);
    String locale = (String)so.getAttribute("LOCALE");
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);
    ResourceBundle rbs = CoreTools.getResourceBundle("OrteusSysDic", locale);

    response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
    response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>

<jsp:useBean id="aAZ0050010Control" class="com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Control" scope="request"/>
<jsp:useBean id="aAZ0050010Struct" class="com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

>検索条件設定
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050013.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:06:33 $
********************************************************* --%>
<%@ page import="java.sql.Types" %>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.util.Calculate" %>
<html>
<head>
<title>検索条件設定</title>

<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">

<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--
// 条件のタイプ コンボボックス変更時処理
function changeConditionType(seq)
{
	var fm = document.header;
	var type = fm.sub3COND_TYPE[seq].value;
	var val1 = fm.disp_sub3COND_VALUE1[seq];
	var val2 = fm.disp_sub3COND_VALUE2[seq];

	if(type == "<%=TypeConverter.sanitizer(AZ0050Const.C_RANG)%>"){
		applyEnable(val1);
		applyEnable(val2);
	}
	else if(type == "<%=TypeConverter.sanitizer(AZ0050Const.C_LIKE)%>" || type == "<%=TypeConverter.sanitizer(AZ0050Const.C_EQ)%>"
	|| type == "<%=TypeConverter.sanitizer(AZ0050Const.C_NE)%>" || type == "<%=TypeConverter.sanitizer(AZ0050Const.C_LT)%>"
	|| type == "<%=TypeConverter.sanitizer(AZ0050Const.C_GT)%>" || type == "<%=TypeConverter.sanitizer(AZ0050Const.C_LS)%>"
	|| type == "<%=TypeConverter.sanitizer(AZ0050Const.C_GR)%>" || type == "<%=TypeConverter.sanitizer(AZ0050Const.C_IN)%>"){
		applyEnable(val1);
		applyDisable(val2);
	}
	else{
		applyDisable(val1);
		applyDisable(val2);
	}
}
// -->
</script>

<script language="JavaScript">
<!--
// 並べ替えコンボボックス変更時処理
function changeSortType(seq)
{
	var fm = document.header;
	var type = fm.sub3SORT_TYPE[seq].value;
	var sequence = fm.disp_sub3SORTKEY_PRI[seq];
	if(type == "<%=TypeConverter.sanitizer(AZ0050Const.C_ASC)%>" || type == "<%=TypeConverter.sanitizer(AZ0050Const.C_DESC)%>")
		applyEnable(sequence);
	else
		applyDisable(sequence);
}
// -->
</script>

<script language="JavaScript">
<!--
// 画面表示時処理
function initialize()
{
	sizing();

	var fm = document.header;
	var n;
	for(n = 0; n < fm.LIST_SIZE.value; n++){
		// 条件指定値＆並べ替え順の入力可/不可設定
		changeConditionType(n); changeSortType(n);

		// サーバ通信用フィールドから値コピー
		fm.disp_sub3COND_VALUE1[n].value = fm.sub3COND_VALUE1[n].value;
		fm.disp_sub3COND_VALUE2[n].value = fm.sub3COND_VALUE2[n].value;
		if(fm.sub3DISPLAY_FLG[n].value == "true")
			fm.disp_sub3DISPLAY_FLG[n].checked = true;
		else
			fm.disp_sub3DISPLAY_FLG[n].checked = false;
		fm.disp_sub3SORTKEY_PRI[n].value = fm.sub3SORTKEY_PRI[n].value;
	}
}
// -->
</script>

<script language="JavaScript">
<!--
/* 入力項目のサイズ設定 */
function sizing()
{
	var fm = document.header;
	fm.QUERY_NAME.size = 100;
	fm.QUERY_GROUP.size = 50;
	fm.QUERY_MEMO.size = 100;
}
// -->
</script>

<script language="JavaScript">
<!--
/* クエリ一覧ボタン押下時の処理 */
function checkReturn()
{

	// 確認メッセージ出力
	if(displayConfirmMessage("AZ90001") != true) return false;

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 対象項目選択、フリー入力ボタン押下時の処理 */
function checkSubmit()
{

	// サーバ通信用フィールドに値コピー
	disp2sendfield();

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 検索実行ボタン押下時の処理 */
function checkExecute()
{

	// 入力OK?
	checkInputValue();
	if(displayErrorMessages() == true)  return false;

	// サーバ通信用フィールドに値コピー
	disp2sendfield();

	// submit済フラグ ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 画面入力値が正しい? */
function checkInputValue()
{
	var fm = document.header;
	var size = fm.LIST_SIZE.value;
	var n, m, target;

	// 設定値入力済?
	for(n = 0; n < size; n++){
		target = fm.disp_sub3COND_VALUE1[n];
		if(target.disabled == false && target.value == ""){
			addErrorMessage("AZ00009"); break;
		}
		target = fm.disp_sub3COND_VALUE2[n];
		if(target.disabled == false && target.value == ""){
			addErrorMessage("AZ00009"); break;
		}
	}
	// 並び替え順入力値OK?
	var valueOk = true;
	for(n = 0; n < size; n++){
		target = fm.disp_sub3SORTKEY_PRI[n];
		if(target.disabled == false && (target.value == "" || isInteger(target) == false || parseInt(target.value) <= 0)){
			addErrorMessage("AZ00010"); valueOk = false; break;
		}
	}
	// 並び替え順 同じ値はない?
	if(valueOk != false){
		var current;
		var isOk;
		for(n = 0; n < size; n++){
			target = fm.disp_sub3SORTKEY_PRI[n];
			if(target.disabled == true) continue;
			current = target.value;
			isOk = true;
			for(m = n + 1; m < size; m++){
				target = fm.disp_sub3SORTKEY_PRI[m];
				if(target.disabled == true) continue;
				if(target.value == current){
					addErrorMessage("AZ00013"); isOk = false; break;
				}
			}
			if(isOk == false) break;
		}
	}
	// 表示チェックボックスは1つ以上ON?
	var existOn = false;
	for(n = 0; n < size; n++){
		if(fm.disp_sub3DISPLAY_FLG[n].checked == true){
			existOn = true; break;
		}
	}
	if(existOn == false) addErrorMessage("AZ00012");
}
// -->
</script>

<script language="JavaScript">
<!--
/* サーバ通信用フィールドに画面入力値コピー */
function disp2sendfield()
{
	var n, target;
	var fm = document.header;
	for(n = 0; n < fm.LIST_SIZE.value; n++){
		target = fm.disp_sub3COND_VALUE1[n];
		if(target.disabled == true)
			fm.sub3COND_VALUE1[n].value = "";
		else
			fm.sub3COND_VALUE1[n].value = target.value;

		target = fm.disp_sub3COND_VALUE2[n];
		if(target.disabled == true)
			fm.sub3COND_VALUE2[n].value = "";
		else
			fm.sub3COND_VALUE2[n].value = target.value;

		if(fm.disp_sub3DISPLAY_FLG[n].checked == true)
			fm.sub3DISPLAY_FLG[n].value = "true";
		else
			fm.sub3DISPLAY_FLG[n].value = "false";

		target = fm.disp_sub3SORTKEY_PRI[n];
		if(target.disabled == true)
			fm.sub3SORTKEY_PRI[n].value = "";
		else
			fm.sub3SORTKEY_PRI[n].value = target.value;
	}
}
// -->
</script>

<script language="JavaScript">
<!--
function PreparLock(){ document.header.SUBMIT_BUTTON_TYPE.value=1; }

function PreparNoLock(){ document.header.SUBMIT_BUTTON_TYPE.value=0; }

// -->
</script>

<script language="JavaScript">
<!--
/**
 * disabledのスタイル適用。
 * @param オブジェクト
 */
function applyDisable(obj)
{
	obj.disabled = true;
	obj.style.backgroundColor = "#CCCCCC";
}

/**
 * disabledのスタイル解除。
 * @param オブジェクト
 */
function applyEnable(obj)
{
	obj.disabled = false;
	obj.style.backgroundColor = "#FFFFFF";
}

// -->
</script>

<script language="JavaScript">
// 関数名は任意
function exprSize() {

  // Flash版との切り分け（値がnullならばFlash版）
  var parentFrame = null;
  if (parent !== null && parent.document !== null) {
    parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0050010');
  }
  if (parentFrame === null) {
    return;
  }

  // IE専用処理
  // isMSIEをisChromeにするとChrome専用になる
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE) {
    // サイズ調整関数の定義
    var resizeFunc = function () {
      try {
        // 業務画面に割り当てられたフレームタグを取得
        var parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0050010');
        // 業務画面に与えられた高さを取得
        var frameHeight = parentFrame.clientHeight;

        // 与えられた高さから固定箇所の高さを引く
        frameHeight -= document.getElementById('layoutRow1').offsetHeight;
        frameHeight -= document.getElementById('layoutRow3').offsetHeight;

        // 誤差がある時は更に引く
        frameHeight -= 50;

        // レイアウトを調整したい場所の高さを修正
        document.getElementById('layoutRow2').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv2').setAttribute('style', 'height:' + frameHeight + 'px');
        // ※既にタグにstyle属性がある場合は、以下を利用すると既存のstyle属性に影響を与えずに修正できる
        // $('#layoutRow2').css('height', frameHeight + 'px');
        // $('#layoutDiv2').css('height', frameHeight + 'px');

      } catch (e) {
        // エラーが発生したらここでキャッチされる。
      }
    }; 
    
    // 1回関数を呼び出してレイアウトを調整する
    resizeFunc();

    // すでに登録してあるwindowサイズ変更イベント関数を削除
    $(window).off('resize.' + 'AZ0050010');
    // windowサイズ変更イベント関数を登録
    $(window).on('resize.' + 'AZ0050010', resizeFunc);
    
  } else if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
      // formタグのmargin-bottomを修正
      $('form').css('margin-bottom', '0px');
  }

}
</script>

<%-- ********** Generated section begin ********** --%>
<script language="javascript">
function executeSubmit(formobj) {
  return(true);
}
</script>
<meta http-equiv="X-UA-Compatible" content="IE=5" />
<script language="JavaScript" src="common/html5_message.js"></script>
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + CoreTools.getCharset(locale)%>">
<%-- ********** Generated section end ********** --%>
</head>

<body onLoad="initialize();loadComplete();exprSize()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0050010" data-noFlash="true" data-screenId="AZ0050010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<form name="header" method="post" action="AZ0050010Servlet">

	<%
		//画面表示用 Struct
		aAZ0050010Struct = null;
		aAZ0050010Struct=(AZ0050010Struct)aAZ0050010Control.getSelStruct();
	%>
<table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<!--- 上段 --->
<tr id="layoutRow1">
  <td>
<%
	AZ0050010Struct currentQuery = aAZ0050010Control.getSelStruct();
	// クエリ名/分類/概要いずれか設定があれば表示
	if(currentQuery.getQUERY_NAME() != null || currentQuery.getQUERY_GROUP() != null || currentQuery.getQUERY_MEMO() != null){
%>
    <table border="0" width="100%">
      <tr> 
        <td width="120" class="name"><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></td>
        <td>
          <input type="text" name="QUERY_NAME" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_NAME()) %>">
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></td>
        <td>
          <input type="text" name="QUERY_GROUP" size="50" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_GROUP()) %>">
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
        <td> 
          <input type="text" name="QUERY_MEMO" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_MEMO()) %>">
        </td>
      </tr>
      <tr> 
        <td colspan="3"> <hr></td>
      </tr>
    </table>
<%	}
	// タイトル未定のときは ダミーの入力域を配置
	else{ %>
      <input type="hidden" name="QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_NAME()) %>">
      <input type="hidden" name="QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_GROUP()) %>">
      <input type="hidden" name="QUERY_MEMO" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_MEMO()) %>">
<%	} %>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<!--- 中段 --->
<tr id="layoutRow2">
  <td height="100%">
    <div class="center" id="layoutDiv2">
      <table class="outer" cellspacing=0 cellpadding=0><tr><td>
        <table cellspacing="1" cellpadding="3">
          <tr class="header"> 
            <td><%=CoreTools.getRBString("Expj.TABLE_NAME",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0068",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.VALUE_1",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0023",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0069",rb)%></td>
          </tr>
<%
	List list = aAZ0050010Control.getColumnList();
%>
	<input type="hidden" name="LIST_SIZE" value="<%= list.size() %>">
<%
	for(int cnt = 0; cnt < list.size(); cnt++)
	{ 
		aAZ0050010Struct = (AZ0050010Struct)list.get(cnt);
%>

          <tr class="rows">
            <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3TABLE_NAME_COMMENT()) == null ? null : TypeConverter.sanitizer(aAZ0050010Struct.getsub3TABLE_NAME_COMMENT()).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3TABLE_NAME()) %></orlabel>]</td>
            <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3COLUMN_NAME()) %></orlabel></td>
            <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3COLUMN_NAME_COMMENT()) == null ? null : TypeConverter.sanitizer(aAZ0050010Struct.getsub3COLUMN_NAME_COMMENT()).replaceAll(" ","&nbsp;") %><input type="hidden" name="sub3COLUMN_TYPE" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3COLUMN_TYPE()) %>"></td>
            <td><select name="sub3COND_TYPE" onChange='<%= "changeConditionType(" + cnt + ")" %>'>
<%
  if(aAZ0050010Control.getStruct().getList_sub3COND_TYPE_name() != null &&
     aAZ0050010Control.getStruct().getList_sub3COND_TYPE_val() != null ) {
    for(int i = 0, size = aAZ0050010Control.getStruct().getList_sub3COND_TYPE_name().size(); i < size; ++i ) {
      String name = (String)aAZ0050010Control.getStruct().getList_sub3COND_TYPE_name().get(i);
      String val = TypeConverter.convert((String)aAZ0050010Control.getStruct().getList_sub3COND_TYPE_val().get(i));
%>
<option value="<%= val %>" <%= (val!=null && val.equals(TypeConverter.convert(aAZ0050010Struct.getsub3COND_TYPE())))? "selected" : ""%>><%= name %></option>
<%
    }
  }
%>
</select></td>
            <td>
<%	if(false){ %>
              <input type="text" name="disp_sub3COND_VALUE1" style="text-align:right"><%=CoreTools.getRBString("Expj.Cmt0043",rb)%>
              <input type="text" name="disp_sub3COND_VALUE2" style="text-align:right">
<%	} else { %>
              <input type="text" name="disp_sub3COND_VALUE1"><%=CoreTools.getRBString("Expj.Cmt0043",rb)%>
              <input type="text" name="disp_sub3COND_VALUE2">
<%	} %>
              <input type="hidden" name="sub3COND_VALUE1" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3COND_VALUE1()) %>">
              <input type="hidden" name="sub3COND_VALUE2" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3COND_VALUE2()) %>">
            </td>
            <td align="center"> 
              <input type="checkbox" name="disp_sub3DISPLAY_FLG">
              <input type="hidden" name="sub3DISPLAY_FLG" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3DISPLAY_FLG()) %>">
            </td>
            <td>
              <select name="sub3SORT_TYPE" onChange='<%= "changeSortType(" + cnt + ")" %>'>
<%
  if(aAZ0050010Control.getStruct().getList_sub3SORT_TYPE_name() != null &&
     aAZ0050010Control.getStruct().getList_sub3SORT_TYPE_val() != null ) {
    for(int i = 0, size = aAZ0050010Control.getStruct().getList_sub3SORT_TYPE_name().size(); i < size; ++i ) {
      String name = (String)aAZ0050010Control.getStruct().getList_sub3SORT_TYPE_name().get(i);
      String val = TypeConverter.convert((String)aAZ0050010Control.getStruct().getList_sub3SORT_TYPE_val().get(i));
%>
<option value="<%= val %>" <%= (val!=null && val.equals(TypeConverter.convert(aAZ0050010Struct.getsub3SORT_TYPE())))? "selected" : ""%>><%= name %></option>
<%
    }
  }
%>
</select>
              <input type="text" name="disp_sub3SORTKEY_PRI" size="3" maxlength="2" style="text-align:right">
              <input type="hidden" name="sub3SORTKEY_PRI" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getsub3SORTKEY_PRI()) %>">
            </td>
          </tr>
	  <% } %>
          </table>
        </td>
      </tr>
      </table>
    </div>
  </td>
</tr>
<% // 必ず配列アクセスが可能なように ダミー %>
<input type="hidden" name="sub3COND_TYPE">
<input type="hidden" name="disp_sub3COND_VALUE1">
<input type="hidden" name="disp_sub3COND_VALUE2">
<input type="hidden" name="sub3COND_VALUE1">
<input type="hidden" name="sub3COND_VALUE2">
<input type="hidden" name="disp_sub3DISPLAY_FLG">
<input type="hidden" name="sub3DISPLAY_FLG">
<input type="hidden" name="sub3SORT_TYPE">
<input type="hidden" name="disp_sub3SORTKEY_PRI">
<input type="hidden" name="sub3SORTKEY_PRI">
<!----------------------------------------------------------------------------->
<!--- 下段 --->
<tr id="layoutRow3">
  <td height="50" width="100%">
    <table height="50" width="100%">
      <tr> 
        <td height="30"><hr></td>
      </tr>
      <tr>
        <td height="30" align="right">
          <input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
          <input type="submit" name="sub3execute" value='<%=CoreTools.getRBString("Expj.BtnExcuteQuery",rb)%>' class="button" onClick="return checkExecute();">
<% if(aAZ0050010Control.canSub3SelectItem() != false){ %>
          <input type="submit" name="sub3selectItem" value='<%=CoreTools.getRBString("Expj.BtnBeforeCond",rb)%>' class="button" onClick="return checkSubmit();">
<% } %>
          <input type="submit" name="sub3freeSql" value='<%=CoreTools.getRBString("Expj.BtnFreeInput",rb)%>' class="button" onClick="return checkSubmit();">
          <input type="submit" name="sub3clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
          <input type="submit" name="sub3return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
        </td>
      </tr>
    </table>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<% MessageStruct msgStruct = aAZ0050010Control.getMessage(); %>
<%@ include file="common/SetServerMessage.jsp" %>
</table>
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div>
<script class="expj-script-AZ0050010-noflash-console-message">
function getExpjNoFlashPageConsoleMessage() {
  return '<%=messageString %>';
}
(function () {
  var message = getExpjNoFlashPageConsoleMessage();
  if (message !== '') {
    // コンソール出力
    parent.expj.common.setScreenFrameConsoleMessage(message);
  }
  parent.expj.common.controlLoadingScreen(false);
  _expj_screen_move_convert();
  
  var forms = document.getElementsByTagName('form');
  for (var formElement in forms) {
    var ele = forms[formElement];
    forms[formElement].onsubmit = function () {
      parent.expj.common.controlLoadingScreen(true);
    };
  }
})();
</script>
</body>
</html>
