<% // ���ۉ��Ή� 2004/01/22 %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<%
	String titleBG="#C0C0C0";	// TABLE�̃^�C�g���̔w�i�F
	String colBG="#FFFFFF";		// TABLE�̃J�����̔w�i�F
	String bodyBG="#E0E0E0";	// BODY�̔w�i�F
	String errFC="#FF0000";		// �G���[�\���F
	String warnFC="#00C000";	// ���[�j���O�\���F
%>
<%
//-------------------------------------------------------
// 2004/01/22 m-kusunoki ���ۉ��Ή�
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

<% // �Z�b�V�����^�C���A�E�g %>
<!--
<title><%=CoreTools.getRBString("Orteus.CoreMsg.N01501", rb)%></title>
-->
<title>Session timeout</title>
<script type="text/javascript">
function BackLogin(){
	var ownURL = this.location.href;
	var ownDomain = ownURL.substring(0, ownURL.lastIndexOf("/"));<% // �h���C�����擾 %>

	var crntWin = this.top;
	var openWin = null;
	while(true){
		try {
			openWin = crntWin.opener.top;<% // �e��� %>
			if(openWin == null){<% // �e��ʂȂ� %>
				break;
			}
			if(openWin.location.href.substring(0, ownDomain.length) != ownDomain) {<% // �e��ʃh���C���m�F %>
				break;
			}
		} catch(e) {
//			alert(e.description);
			break;
		}

		if(crntWin != this.top){
			crntWin.window.open('','_self').opener=crntWin.window;<% // �N���[�Y�x��������� %>
			crntWin.window.close();
		}
		crntWin = openWin;
	}

	crntWin.location.href="logout.jsp";<% // ����h���C���̐e��ʂ����O�C����ʂɐݒ� %>
	if(crntWin != this.top){
		this.top.window.open('','_self').opener=this.top.window;<% // �N���[�Y�x��������� %>
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
<% // �Z�b�V�����^�C���A�E�g %>
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
<% // �������ԕ��u���ꂽ���߃Z�b�V�������ؒf����܂����B, �ēx���O�C���������Ă��������B %>
<!--
<%=CoreTools.getRBString("Orteus.CoreMsg.W01501", rb)%><BR>
<%=CoreTools.getRBString("Orteus.CoreMsg.W01502", rb)%>
-->
The session was disconnected since it was left unattended for a long period of time.<BR>
Log in again.
</FONT></CENTER>
<HR>
<CENTER>
<!--<a href="login.jsp" target="_top">���O�C����ʂɖ߂�</a>-->
<% // ���O�C����ʂ֖߂� %>
<!--
<a href="javascript:BackLogin()"><%=CoreTools.getRBString("Orteus.CoreMsg.N01502", rb)%></a>
-->
<a href="javascript:BackLogin()">Return to the login screen.</a>
</CENTER>
</div>
</BODY>
</HTML>
