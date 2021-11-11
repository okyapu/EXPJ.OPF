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

<% //waTool(logging)関連 watool.jar必須%>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>
<%@ page import="java.util.*" %>

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

	response.setHeader("Content-Type", charset);
	response.setContentType(charset);
%>

<%
	Hashtable params = CoreTools.getParamsList(request);
	HttpSession so = null;
	so = request.getSession(true);
	if ( so == null || so.isNew() == true ){
%>
<!-- session object is null -->
<% // ログインしていません %>
<%=CoreTools.getRBString("Orteus.Sample.E00001", rb)%>
<%
	}
%>
<HTML>
<HEAD>
  <TITLE>TEST</TITLE>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
<meta http-equiv="Content-Type" content="<%=charset%>">
</HEAD>
<BODY>
  <CENTER>
<% // ユーザ名 %>
<%=CoreTools.getRBString("Orteus.Common.N00027", rb)%>:<%=request.getRemoteUser()%><br>
MSG_CONTEXT_NO:<%=request.getParameter("MSG_CONTEXT_NO")%><BR>
<h1>TEST.JSP</h1>
  </CENTER>
<HR>
<BR>
<form name="form1" method="post" action="test.jsp">
<center>
    <p>&nbsp;&nbsp;</p>
    <% // おめでとうございます。この画面が表示されれば動作確認は終了です。 %>
    <p><font size=6><%=CoreTools.getRBString("Orteus.Sample.N00001", rb)%></font> </p>
  </center>
  <p>&nbsp;&nbsp;</p>
  <p><BR>
  </p>
  <HR>
  <%@include file="msgnext.jsp"%>
</form>
</BODY>
</HTML>
