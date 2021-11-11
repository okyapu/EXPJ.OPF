<% // 国際化対応 2004/01/22 %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<%
	String locale = null;

	HttpSession so = request.getSession(false);
	if(so==null || so.isNew() == true){
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

<html>
<head>
<script language="JavaScript">
function infoDisp(){
	clearTimeout(timer);

	openWin = opener;
	while(true){
		if(openWin.opener == null){
			break;
		}
		openWin = openWin.opener;
	}
	openWin.top.UP.location.reload();
	openWin.top.LEFT.location.reload();
	openWin.top.DOWN.location="null.html";


	close();
}
</script>
</head>
<body bgcolor="bisque" onLoad="timer=setTimeout('infoDisp()',1500)">
<center>
<% // メッセージの送信が完了しました %>
<h2><%=CoreTools.getRBString("Orteus.CoreMsg.N01801", rb)%></h2>
</center>
</body>
</html>
