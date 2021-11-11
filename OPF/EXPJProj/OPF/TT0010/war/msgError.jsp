<% //CoreTools関連 %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //foundation関連 %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.log.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="com.nec.jp.orteus.xaf.util.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //logging関連 logger.jar必須%>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%@ page import="com.nec.jp.orteus.msg.core.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>

<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.io.*" %>

<!-- add EJ from-->
<%@ page import="com.nec.jp.orteus.expj.util.MessageStruct" %>
<%@ page import="com.nec.jp.orteus.expj.util.ExpjMessage" %>
<!-- add EJ to-->

<%
//-------------------------------------------------------
// 2004/01/22 m-kusunoki 国際化対応
	String locale = null;
	HttpSession so = request.getSession(false);
	if( (so == null) || (so.isNew() == true) ){
		locale = CoreTools.getLocale(null);
	}
	else {
		locale = (String)so.getAttribute("LOCALE");
	}

	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	if(charset == null) {
		charset = "UTF-8";
	}

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>

<jsp:useBean id="e" class="java.lang.Exception" scope="request"/>

<html>
<head>
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + charset%>">
<meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">
<script type="text/javascript" src="common/nonflash.js"></script>
</head>
<body>
<div id="expj-business-screen-error">
<%
	ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
	PrintStream printStream = new PrintStream(byteStream);
	e.printStackTrace(printStream);
	String error = byteStream.toString();
// add EJ from
		DisplayMessage objMessage = new DisplayMessage();
		MsgException e_tmp = (MsgException)e;
		MsgException old_tmp = e_tmp;
		MsgException e_tmp_sv = e_tmp;
		String msg = "";
// add EJ to

	if (e instanceof MessageApiException || e instanceof MessageControlException) {
/* del EJ from
		DisplayMessage objMessage = new DisplayMessage();
		MsgException e_tmp = (MsgException)e;
		MsgException old_tmp = e_tmp;
   del EJ to */
		while(e_tmp != null){
			%><%=TypeConverter.sanitizer(e_tmp.getMessage())%><%=TypeConverter.sanitizer(objMessage.getMessage(e_tmp.getMessage()))%><%

			String [] detail = e_tmp.getDetail();
			for(int i=0;detail != null && i<detail.length;i++){
                                // "詳細" + (i+1) + " : " + detail[i];
/* del EJ from
				String msg = CoreTools.getRBString("Orteus.Common.N00022", rb) + (i+1) + " : " + detail[i];
   del EJ to */
// add EJ from
				msg = CoreTools.getRBString("Orteus.Common.N00022", rb) + (i+1) + " : " + detail[i];
// add EJ to
				%><br><%=TypeConverter.sanitizer(msg)%><%
			}
			e_tmp = e_tmp.getNextException();
			if(e_tmp != null){
				old_tmp = e_tmp;
			}
		}
	}
	else {
		%><%=TypeConverter.sanitizer(e.toString())%><%
	}
	%><pre><%=TypeConverter.sanitizer(error) %></pre>

<!-- add EJ from -->
<% // 閉じる %>
<button type="button" style="width:100px;height:22px;" onclick="delPage();"><%=CoreTools.getRBString("Orteus.Common.N00001", rb)%></button>
</div>
<%
MessageStruct msgStruct = new MessageStruct();
if (e instanceof MessageApiException || e instanceof MessageControlException) {
	ExpjMessage emsg;
	while(e_tmp_sv != null){
		emsg = new ExpjMessage( "ZZ01006", e_tmp_sv.getMessage() + " " + objMessage.getMessage(e_tmp_sv.getMessage()));
		msgStruct.addError( emsg );
		e_tmp_sv = e_tmp_sv.getNextException();
	}
	emsg = new ExpjMessage( "ZZ01006", msg );
	msgStruct.addError( emsg );
} else {
	ExpjMessage emsg = new ExpjMessage( "ZZ01006", error );
	msgStruct.addError( emsg );
}
%>
<%@include file="common/SetServerMessage.jsp" %>
<script>
if (typeof(expj) !== 'undefined' && expj !== null) {
  expj.error.viewConsole = function () {
    expj.common.setScreenFrameConsoleMessage('<%=messageString %>');
  };
} else if (type(parent.expj) !== 'undefined' && parent.expj !== null) {
  parent.expj.common.controlLoadingScreen(false);
}
</script>
<!-- add EJ to -->
</BODY>
</HTML>
