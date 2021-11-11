<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="java.util.*" %>
<%
/*
	ManageContainer container=CoreTools.getContainer();
	Hashtable params=CoreTools.getParamsList(request);
	SessionObject so=CoreTools.login(waSecurityManager.TYPE_USER, container, params,
			getServletConfig(), request, response);

	// ログイン失敗時の処理
	if(so==null) CoreTools.gotoPage(pageContext,"login.jsp");
*/
%>

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

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>
<%
	////////////////////////////
	// エラー内容書き出し
	//////////////////////////

	String requestURI = "";
	String errorCode = "";
	String message = "";
	
	Object obj;
	
        // 要求されたURI
	obj = request.getAttribute("javax.servlet.error.request_uri");
	if (obj != null) {
		requestURI = (String) obj;
	}
        // ステータスコード
	obj = request.getAttribute("javax.servlet.error.status_code");
	if (obj != null) {
		errorCode = String.valueOf((Integer)obj);
	}
        // エラーメッセージ
	obj = request.getAttribute("javax.servlet.error.message");
	if (obj != null) {
		message = (String) obj;
	}

	// session.invalidate();
%>

<HTML>
<HEAD>
        <% // Orteus エラーメッセージ %>
	<TITLE><%=CoreTools.getRBString("Orteus.CoreMsg.N00401", rb)%></TITLE>
</HEAD>
<body bgcolor="#F0F0F0">
<form name="form1" method="post" action="<%=TypeConverter.sanitizer(request.getRequestURI()) %>">
  <p align="right"><font size=+2 face="Arial Black" color="#4040FF"><i><font color="#333366"> 
    <font size="+1">SYSTEM</font></font></i></font><font size="+1"><font face="Arial, Helvetica, sans-serif" color="#333366"> 
    <i><font face="Arial Black">Error Page</font></i></font></font><font face="Arial, Helvetica, sans-serif" color="#333366" size="+2"><i><font face="Arial Black"></font></i></font><u><font face="Arial, Helvetica, sans-serif" color="#333366" size="+2"><i><font face="Arial Black"> 
    </font></i></font></u></p>
  <table width="100%">
    <tr>
      <% // エラーＩＤ %>
      <td width="20%"><b><font size="5"><i><%=CoreTools.getRBString("Orteus.Common.N00024", rb)%>:</i></font></b></td>
      <td width="50%"><font size="5"><i><%= CoreTools.getErrorId(request)%></i></font></td>
      <td width="30%"> 
        <div align="right">
          <% // 戻る %>
          <input type="button" name="submit" value="<%=CoreTools.getRBString("Orteus.Common.N00023", rb)%>" onClick="history.back()">
          <font size="5"></font></div>
      </td>
  </tr>
</table>
<hr>
  <% // エラーメッセージ %>
  <p><font size="6"><b><%=CoreTools.getRBString("Orteus.CoreMsg.N00402", rb)%></b></font><b>:</b></p>
  <table width="80%" align="center">
    <tr> 
      <td width="80%"><font size="6"><%= CoreTools.getErrorMessage(request)%></font></td>
    </tr>
  </table>
<p>&nbsp;</p>
<hr>
  <table width="100%" align="left" height="8">
    <tr>
      <% // エラー例外 %>
      <td width="20%" height="19"><i><%=CoreTools.getRBString("Orteus.CoreMsg.N00403", rb)%>:</i></td>
      <td width="87%" height="19"><i> <a href="errorDetail.jsp"> 
        <%
	Exception e=CoreTools.getErrorException(request);

	if(e==null) {
		out.print("null");
	} else {
		out.print(e.toString());
	}
%>
        </a> </i></td>
    </tr>
  </table>
<div align="right"></div>
<BR>
<hr>
<table border="1" cellpadding="2" cellspacing="0" bordercolor="#111111" id="AutoNumber1" bordercolorlight="#C0C0C0" style="border-collapse: collapse">
  <tr>
    <td >ステータスコード</td>
    <td ><%= errorCode %></td>
  </tr>
  <tr>
    <td >リクエストURI</td>
    <td ><%= requestURI %></td>
  </tr>
  <tr>
    <td >メッセージ</td>
    <td ><%= message %></td>
  </tr>
</table>
</form>
</body>
</html>

<!--
=======================================
==  StatusCode
=======================================
<%= errorCode %>


=======================================
==  requestURI
=======================================
<%= requestURI %>


=======================================
==  message
=======================================
<%= message %>
-->


