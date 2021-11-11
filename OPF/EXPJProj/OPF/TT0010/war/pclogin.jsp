<% //CoreTools�֘A %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //foundation�֘A %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.log.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="com.nec.jp.orteus.xaf.util.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //logging�֘A logger.jar�K�{%>
<%//@ page import="com.nec.jp.orteus.util.logging.*" %>

<% //JAVA�֘A %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>

<%
//-------------------------------------------------------
// 2004/01/22 m-kusunoki ���ۉ��Ή�
	String locale = CoreTools.getLocale(null);
	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>

<HTML>
<HEAD>
  <TITLE>Orteus NewFoundation Authentication</TITLE>
  <SCRIPT LANGUAGE="JavaScript">
	if(window.top.location.href != window.location.href){
		window.top.location.href = encodeURI(window.location.href);
	}
	function setfocus(){
		document.Login.j_username.focus();
	}
	function chkdata(){
		if ( document.Login.j_username.value.length == 0 ){
		  document.Login.j_username.focus();
		  return false;
		}
		if ( document.Login.j_password.value.length == 0 ){
		  document.Login.j_password.focus();
		  return false;
		}
		return true;
	}
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
			if(top.location != null && top.location != window.location.href) {
				top.location.href = "login.jsp";
			}
		}
	}
  </SCRIPT>
<% 
    if(request.getRemoteUser() != null){ 
%>
  
    <% session.invalidate(); %>
    <% response.sendRedirect("main.jsp"); %>
  
<%
    }else{
%>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + charset%>">

</HEAD>
<BODY BGCOLOR="#E0E0E0" LEFTMARGIN=0 TOPMARGIN=0 marginheight='0' marginwidth='0' onLoad="setfocus();BackLogin();">
  <CENTER>
  <TABLE BORDER="0" WIDTH="100%" HEIGHT="100%" bgcolor="#FFFFFF">
    <TR>
      <TD ALIGN="CENTER" VALIGN="MIDDLE" height="538"> 
        <% // Welcome to the Orteus %>
        <jsp:include page="logintitle.jsp" />
<P><HR WIDTH="50%"><P>
	<% // ���[�U�h�c�ƃp�X���[�h����͂��Ă��������B %>
	<%=CoreTools.getRBString("Orteus.Common.N00029", rb)%>

      <form method="POST" name="Login" action="j_security_check">

      <TABLE border="0" cellpadding="1" cellspacing="0">
        <TR>
          <TD valign="top">
            <table border="0" cellpadding="5" cellspacing="0" align="center">
              <tr>
                <% // ���[�U�h�c %>
                <td nowrap align="left" class="allaire"><%=CoreTools.getRBString("Orteus.Common.N00030", rb)%></td>
                <td><INPUT TYPE='text' NAME='j_username' SIZE=14 MAXLENGTH=255 class="inputShort"><br></td>
              </tr>

              <tr>
                <% // �p�X���[�h %>
                <td align="left" class="allaire"><%=CoreTools.getRBString("Orteus.Common.N00031", rb)%></td>
                <td><INPUT TYPE='password' NAME='j_password' SIZE=14 MAXLENGTH=255 class="inputShort"><br></td>
              </tr>

              <tr>
                <% //���O�C�� %>
                <td COLSPAN="2"><BUTTON TYPE='submit' STYLE="WIDTH:100%" onClick="return chkdata();"> <%=CoreTools.getRBString("Orteus.Common.N00032", rb)%> </BUTTON></td>
              </tr>
            </table>
          </TD>
          </TR>
        </table>
        </FORM>
    </TD></TR>
  </TABLE>
  </CENTER>
</BODY>
</HTML>
<%  
    }
	
%>