<%-- ********************************************************
  This file is generated
    GeneratedDate  : Sun Feb 12 12:23:47 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0130\AA0130010Control.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0130.*" %>
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

<jsp:useBean id="aAA0130010Control" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130010Control" scope="request"/>
<jsp:useBean id="aAA0130010Struct" class="com.nec.jp.orteus.metamorBase.AA0130.AA0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

制御
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0130/jsp/AA0130010Control.jsp,v $
$Author: geng-jia $    
$Revision: 1.15 $ $Date: 2017/02/22 02:04:02 $
********************************************************* --%>
<html>
<head>
<title>制御</title>
<%@include file="common/expj_v5.jsp" %>
<meta http-equiv="Content-Type" content="text/html;charset=Shift_JIS">
<script>
var data1 = '<%=aAA0130010Control.getFlashTreeXML()%>';
function onLoadAddTree() {
    addTreeDataParent('AA0130010', "AA0130010tree1", data1);
}
</script>
<%-- ********** Generated section begin ********** --%>
<script language="javascript">
function executeSubmit(formobj) {
  return(true);
}
</script>
<%-- ********** Generated section end ********** --%>
</head>

<body onLoad="onLoadAddTree()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AA0130010" data-noFlash="true" data-screenId="AA0130010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<%
  MessageStruct msgStruct = aAA0130010Control.getMsgStruct();
%>
<%@include file="common/SetServerMessage.jsp" %>
</div>
<script class="expj-script-AA0130010-noflash-console-message">
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
