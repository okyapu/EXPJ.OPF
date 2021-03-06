<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<%@ page import="java.io.ByteArrayOutputStream" %>
<%@ page import="java.io.PrintStream" %>

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

<HTML>
<HEAD>
	<meta http-equiv="X-UA-Compatible" content="IE=edge" >
	<% // Orteus エラーメッセージ詳細 %>
	<TITLE><%=CoreTools.getRBString("Orteus.CoreMsg.N00501", rb)%></TITLE>
</HEAD>
<body bgcolor="#F0F0F0">
<form name="form1" method="post" action="error.jsp">
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
  <% // エラー詳細 %>
  <p><font size="6"><b><%=CoreTools.getRBString("Orteus.CoreMsg.N00502", rb)%></b></font><b>:</b></p>
  <table width="80%" align="center">
    <tr> 
      <td width="80%"><i>
<%
	Exception e=CoreTools.getErrorException(request);
	if(e==null) {
		out.print("no message");
	} else {
		Logger m_log = Logger.getLogger("com.nec.jp.orteus.xaf");
		if (m_log.isLoggable(Level.FINER)){
			PrintWriter pw = pageContext.getResponse().getWriter();
			out.print(e.getMessage());
			out.print("<br><br>");
			e.printStackTrace(pw);
		} else {
			// 詳細はログファイルを参照してください
			out.print(CoreTools.getRBString("Orteus.CoreMsg.N00503", rb));
			ByteArrayOutputStream bs = new ByteArrayOutputStream();
			PrintStream ps = new PrintStream(bs);
			e.printStackTrace(ps);
			m_log.log(Level.FINER, bs.toString());
		}
	}
%>
      </i></td>
    </tr>
  </table>
<p>&nbsp;</p>
<hr>
</form>
</body>
</html>
