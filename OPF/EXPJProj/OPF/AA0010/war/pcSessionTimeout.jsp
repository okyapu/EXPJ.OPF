<% // 国際化対応 2004/01/22 %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<%
	String titleBG="#C0C0C0";	// TABLEのタイトルの背景色
	String colBG="#FFFFFF";		// TABLEのカラムの背景色
	String bodyBG="#E0E0E0";	// BODYの背景色
	String errFC="#FF0000";		// エラー表示色
	String warnFC="#00C000";	// ワーニング表示色
%>
<%
//-------------------------------------------------------
// 2004/01/22 m-kusunoki 国際化対応
	String locale = CoreTools.getLocale(null);
	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>

<html>
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + charset%>">

<% // セッションタイムアウト %>
<title><%=CoreTools.getRBString("Orteus.CoreMsg.N01501", rb)%></title>
<script language="JavaScript">
function BackLogin(){
	var openWin = top.opener;
	if(openWin != null && openWin.top != null){
		while(true){
			if(openWin.top.opener == null){
				break;
			}else{
				openWin.window.close();
			}
			openWin = openWin.opener;
		}
		openWin.top.location="login.jsp";
		top.close();
	}else{
		top.location = "login.jsp";
	}
}
</script>
</head>
<body bgcolor="<%=bodyBG%>" onLoad="BackLogin()">
  <TABLE BORDER="0" WIDTH="100%">
  <TR>
	<TD ALIGN=="LEFT" WIDTH="33%"><BR>
	</TD>
	<TD WIDTH="33%" ALIGN="CENTER">
          <% // セッションタイムアウト %>
	  <FONT SIZE="+2"><B><%=CoreTools.getRBString("Orteus.CoreMsg.N01501", rb)%></B></FONT>
	</TD>
	<TD WIDTH="33%"><BR>
	</TD>
  </TR>
  </TABLE>
<HR>
<CENTER><FONT COLOR="<%=errFC%>">
<% // 長い時間放置されたためセッションが切断されました。, 再度ログインし直してください。 %>
<%=CoreTools.getRBString("Orteus.CoreMsg.W01501", rb)%><BR>
<%=CoreTools.getRBString("Orteus.CoreMsg.W01502", rb)%>
</FONT></CENTER>
<HR>
<CENTER>
<!--<a href="login.jsp" target="_top">ログイン画面に戻る</a>-->
<% // ログイン画面へ戻る %>
<a href="javascript:BackLogin()"><%=CoreTools.getRBString("Orteus.CoreMsg.N01502", rb)%></a>
</CENTER>
</BODY>
</HTML>
