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
<meta http-equiv="X-UA-Compatible" content="IE=edge" >

<% // セッションタイムアウト %>
<!--
<title><%=CoreTools.getRBString("Orteus.CoreMsg.N01501", rb)%></title>
-->
<title>Session timeout</title>
<script type="text/javascript">
function BackLogin(){
	var ownURL = this.location.href;
	var ownDomain = ownURL.substring(0, ownURL.lastIndexOf("/"));<% // ドメイン情報取得 %>

	var crntWin = this.top;
	var openWin = null;
	while(true){
		try {
			openWin = crntWin.opener.top;<% // 親画面 %>
			if(openWin == null){<% // 親画面なし %>
				break;
			}
			if(openWin.location.href.substring(0, ownDomain.length) != ownDomain) {<% // 親画面ドメイン確認 %>
				break;
			}
		} catch(e) {
//			alert(e.description);
			break;
		}

		if(crntWin != this.top){
			crntWin.window.open('','_self').opener=crntWin.window;<% // クローズ警告回避処理 %>
			crntWin.window.close();
		}
		crntWin = openWin;
	}

	crntWin.location.href="logout.jsp";<% // 同一ドメインの親画面をログイン画面に設定 %>
	if(crntWin != this.top){
		this.top.window.open('','_self').opener=this.top.window;<% // クローズ警告回避処理 %>
		this.top.window.close();
	}
}
</script>
</head>
<body bgcolor="<%=bodyBG%>" onLoad="BackLogin()">
<div id="expj-session-timeout">
	<TABLE BORDER="0" WIDTH="100%">
	<TR>
		<TD ALIGN=="LEFT" WIDTH="33%"><BR>
		</TD>
		<TD WIDTH="33%" ALIGN="CENTER">
<% // セッションタイムアウト %>
<!--
			<FONT SIZE="+2"><B><%=CoreTools.getRBString("Orteus.CoreMsg.N01501", rb)%></B></FONT>
-->
			<FONT SIZE="+2"><B>Session timeout</B></FONT>
		</TD>
		<TD WIDTH="33%"><BR>
		</TD>
	</TR>
	</TABLE>
<HR>
<CENTER><FONT COLOR="<%=errFC%>">
<% // 長い時間放置されたためセッションが切断されました。, 再度ログインし直してください。 %>
<!--
<%=CoreTools.getRBString("Orteus.CoreMsg.W01501", rb)%><BR>
<%=CoreTools.getRBString("Orteus.CoreMsg.W01502", rb)%>
-->
The session was disconnected since it was left unattended for a long period of time.<BR>
Log in again.
</FONT></CENTER>
<HR>
<CENTER>
<!--<a href="login.jsp" target="_top">ログイン画面に戻る</a>-->
<% // ログイン画面へ戻る %>
<!--
<a href="javascript:BackLogin()"><%=CoreTools.getRBString("Orteus.CoreMsg.N01502", rb)%></a>
-->
<a href="javascript:BackLogin()">Return to the login screen.</a>
</CENTER>
</div>
</BODY>
</HTML>
