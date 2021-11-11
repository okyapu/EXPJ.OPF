<% // ‘Û‰»‘Î‰ž 2004/01/22 %>
<% //CoreToolsŠÖ˜A %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //loggingŠÖ˜A logger.jar•K{%>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%@ page import="java.util.*" %>

<%
	HttpSession so = null;
	so = request.getSession(false);
	if ( so == null || so.getAttribute("UserId") == null || so.isNew() == true ){
%>
<script language="JavaScript">
top.location.href="SessionTimeout.jsp";
</script>
<%
		return;
	}

	String locale = CoreTools.getLocale(so.getAttribute("UserId").toString());
	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>

<HTML>
<HEAD>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
</HEAD>
  <BODY>

<jsp:include page="infobody.jsp" />

  </BODY>
</HTML>