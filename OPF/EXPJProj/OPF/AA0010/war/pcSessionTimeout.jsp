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

<% // �Z�b�V�����^�C���A�E�g %>
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
          <% // �Z�b�V�����^�C���A�E�g %>
	  <FONT SIZE="+2"><B><%=CoreTools.getRBString("Orteus.CoreMsg.N01501", rb)%></B></FONT>
	</TD>
	<TD WIDTH="33%"><BR>
	</TD>
  </TR>
  </TABLE>
<HR>
<CENTER><FONT COLOR="<%=errFC%>">
<% // �������ԕ��u���ꂽ���߃Z�b�V�������ؒf����܂����B, �ēx���O�C���������Ă��������B %>
<%=CoreTools.getRBString("Orteus.CoreMsg.W01501", rb)%><BR>
<%=CoreTools.getRBString("Orteus.CoreMsg.W01502", rb)%>
</FONT></CENTER>
<HR>
<CENTER>
<!--<a href="login.jsp" target="_top">���O�C����ʂɖ߂�</a>-->
<% // ���O�C����ʂ֖߂� %>
<a href="javascript:BackLogin()"><%=CoreTools.getRBString("Orteus.CoreMsg.N01502", rb)%></a>
</CENTER>
</BODY>
</HTML>
