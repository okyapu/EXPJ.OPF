<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>

<%@ page import="com.nec.jp.orteus.expj.util.MessageStruct" %>
<%@ page import="com.nec.jp.orteus.expj.flash.Kind" %>
<%@ page import="com.nec.jp.orteus.expj.flash.ScreenMoveUtil" %>

<%
if ( so == null || so.getAttribute("UserId") == null){
%>
    <script language="JavaScript">
    opener.top.location.href="SessionTimeout.jsp";
    this.window.close();
    
    </script>
<%
    return;
}
%>
<%
    response.setHeader("Pragma","No-cache");
    response.setHeader("Cache-Control","no-cache");
    response.setDateHeader("Expires",0);
%>
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + CoreTools.getCharset(locale)%>">
<script type="text/javascript" src="common/flash_v5.js"></script>
<script type="text/javascript" src="common/expj_flash.js"></script>
