<% // ���ۉ��Ή� 2004/01/22 %>
<% //CoreTools�֘A %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //logging�֘A logger.jar�K�{%>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%@ page import="java.util.*" %>

<%
	HttpSession so = null;
	so = request.getSession(false);

	String locale = CoreTools.getLocale(so.getAttribute("UserId").toString());
	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>

<DIV ALIGN="LEFT"> <font size="+4" face="Book Antiqua"><b><i>Orteus</i></b></font> 
</DIV>
    <HR>
    <% // ���m�点 %>
    <H2><%=CoreTools.getRBString("Orteus.CoreMsg.N00601", rb)%></H2>
    <BR>
    <% // Orteus�^�p�O���[�v���V�X�e���ғ��̂��m�点, �������܃f�����ł��B %>
    <img src="images/CategoryIcon9.gif"/>&nbsp;<%=CoreTools.getRBString("Orteus.CoreMsg.N00602", rb)%><BR><BR>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=CoreTools.getRBString("Orteus.CoreMsg.N00603", rb)%><BR>
    <BR>
    <BR>
    <BR>
    <BR>
    
<DIV ALIGN="RIGHT"> <font size="+2" face="Book Antiqua">Orteus</font> </DIV>

