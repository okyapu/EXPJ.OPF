<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:45:12 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050017.html
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

>クエリ名設定
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050017.jsp,v $
$Author: geng-jia $
$Revision: 1.9 $ $Date: 2017/02/22 02:06:34 $
********************************************************* --%>
<HTML>
<HEAD>
<TITLE>クエリ名設定</TITLE>

<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">

<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--
/* 必須項目入力チェック */
function mustCheck()
{
	// クエリ名
	if(isNull(document.header.disp_QUERY_NAME) == true){
		displayErrorMessage("ZZ05106");
		return false;
	}

	// 分類
	if(isNull(document.header.disp_QUERY_GROUP) == true){
		displayErrorMessage("ZZ05106");
		return false;
	}

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* サーバ通信用フィールドへ値コピー */
function copy2Struct()
{
	var fm = document.header;
	fm.QUERY_NAME.value = fm.disp_QUERY_NAME.value;
	fm.QUERY_GROUP.value = fm.disp_QUERY_GROUP.value;
	fm.QUERY_MEMO.value = fm.disp_QUERY_MEMO.value;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 登録ボタン押下時の処理 */
function checkInsert()
{

	// 必須入力チェック
	if(mustCheck() == false) return false;

	// 確認メッセージ出力
	if(displayConfirmMessage("ZZ07005") == false)  return false;

	// サーバ通信用フィールドに値コピー
	copy2Struct();

	// submit済フラグ ON
	prepareSubmit();
	PreparLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* 更新ボタン押下時の処理 */
function checkUpdate()
{

	// 必須入力チェック
	if(mustCheck() == false) return false;

	// 確認メッセージ出力
	if(displayConfirmMessage("ZZ07006") == false)  return false;

	// サーバ通信用フィールドに値コピー
	copy2Struct();

	// submit済フラグ ON
	prepareSubmit();
	PreparLock();

	return true;
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
function initialize()
{
	// sizing();

	var fm = document.header;
	// サーバ通信用フィールドから値コピー
	fm.disp_QUERY_NAME.value = fm.QUERY_NAME.value;
	fm.disp_QUERY_GROUP.value = fm.QUERY_GROUP.value;
	fm.disp_QUERY_MEMO.value = fm.QUERY_MEMO.value;

	if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
      // formタグのmargin-bottomを修正
      $('form').css('margin-bottom', '0px');
    }


}
//-->
</script>

<script language="JavaScript">
<!--
function PreparLock(){ document.header.SUBMIT_BUTTON_TYPE.value=1; }

function PreparNoLock(){ document.header.SUBMIT_BUTTON_TYPE.value=0; }

// -->
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
</HEAD>

<body onLoad="initialize();loadComplete()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0050010" data-noFlash="true" data-screenId="AZ0050010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<form name="header" method="post" action="AZ0050010Servlet">


<table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<tr>
	<!--- 上段 --->
	<td height="80">
    <table border="0" width="100%">
      <tr>
        <td width="120" class="name"><b><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></b></td>
        <td colspan="2">
          <input type="text" name="disp_QUERY_NAME" size="100">
          <input type="hidden" name="QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_NAME()) %>">
        </td>
      </tr>
      <tr> 
        <td class="name"><b><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></b></td>
        <td colspan="2">
          <input type="text" name="disp_QUERY_GROUP" size="50">
          <input type="hidden" name="QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_GROUP()) %>">
        </td>
      </tr>
      <tr> 
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
        <td colspan="2">
          <input type="text" name="disp_QUERY_MEMO" size="100">
          <input type="hidden" name="QUERY_MEMO" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_MEMO()) %>">
        </td>
      </tr>
    </table>
	</td>
</tr>
<!----------------------------------------------------------------------------->
<tr>
	<!--- 中段 --->
	<td height="100%"></td>
</tr>
<!----------------------------------------------------------------------------->
<tr valign="middle">
	<!--- 下段 --->
	<td height="50" width="100%">
		
      <table height="50" width="100%">
        <tr> 
          <td height="30">
            <hr>
          </td>
        </tr>
        <tr> 
          <td height="30"> 
            <div align="right">
              <input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
              <input type="submit" name="sub7insert" value='<%=CoreTools.getRBString("Expj.BtnInsert",rb)%>' class="button" onClick="return checkInsert();">
<% if(aAZ0050010Control.canSub7Update() != false) { %>
              <input type="submit" name="sub7update" value='<%=CoreTools.getRBString("Expj.BtnUpdate",rb)%>' class="button" onClick="return checkUpdate();">
<% } %>
              <input type="submit" name="sub7clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
              <input type="submit" name="sub7return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
            </div>
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
</BODY>
</HTML>
