<% //CoreTools関連 %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.signature.*" %>

<%
    ConfirmLicense cfrmLicense = new ConfirmLicense();
    int chkRslt = cfrmLicense.chkLicense("R");
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

<HTML>
<HEAD>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
  <% // ライセンス無効通知 %>
  <TITLE><%=CoreTools.getRBString("Orteus.CoreMsg.N00901", rb)%></TITLE>
</HEAD>

<BODY bgcolor="#FFFFCC">
<%
    if(chkRslt == 1) {
    %>
        <% // 使用期限が切れました。 %>
        <%=CoreTools.getRBString("Orteus.CoreMsg.W00901", rb)%><BR>
        <% // 今月末, をもって使用できなくなります。 %>
        <FONT SIZE="+2" COLOR="red"><%=CoreTools.getRBString("Orteus.CoreMsg.W00902", rb)%></FONT><%=CoreTools.getRBString("Orteus.CoreMsg.W00903", rb)%><BR>
        <% // ライセンス再申請, をお願いいたします。 %>
        <FONT SIZE="+2" COLOR="red"><%=CoreTools.getRBString("Orteus.CoreMsg.W00904", rb)%></FONT><%=CoreTools.getRBString("Orteus.CoreMsg.W00905", rb)%><BR>
        <FORM METHOD="POST" ACTION="messageControl?MSG_PG=menu">
        <% // 確認 %>
        <INPUT TYPE="submit" VALUE="<%=CoreTools.getRBString("Orteus.CoreMsg.N00902", rb)%>">
        </FORM>
    <%
    }
    else if(chkRslt == -1) {
    %>
        <% // ライセンス期限が完全に切れました。 %>
        <FONT SIZE="+2" COLOR="red"><%=CoreTools.getRBString("Orteus.CoreMsg.E00901", rb)%></FONT><BR>
        <FORM>
        <% // 確認 %>
        <INPUT TYPE="button" VALUE="<%=CoreTools.getRBString("Orteus.CoreMsg.N00902", rb)%>" onClick="window.top.close()">
        </FORM>
    <%
    }
%>
</BODY>
</HTML>
