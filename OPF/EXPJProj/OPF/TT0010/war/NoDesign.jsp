<% //CoreTools関連 %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //foundation関連 %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.log.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="com.nec.jp.orteus.xaf.util.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //logging関連 logger.jar必須%>
<%//@ page import="com.nec.jp.orteus.util.logging.*" %>

<% //JAVA関連 %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>

<%
    // ログインチェック
    ManageContainer container=CoreTools.getContainer();
    Hashtable params=CoreTools.getParamsList(request);
    HttpSession so;
    so = request.getSession(false);
    if(so==null || so.isNew() == true){
        // ログインしていない場合の処理
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
//-------------------------------------------------------
// 2004/01/22 m-kusunoki 国際化対応
    String locale = (String)so.getAttribute("LOCALE");
    String charset = CoreTools.getCharset(locale);
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

    response.setHeader("Content-Type", "text/html; charset=" + charset);
    response.setContentType("text/html; charset=" + charset);
%>

<HTML>
<HEAD>
  <TITLE>No Design</TITLE>
  <style type="text/css">
<!--
.style3 {
    font-size: large;
    color: #FF0000;
}
-->
  </style>
</HEAD>
<BODY BGCOLOR="#E0E0E0">
<div align="center"><br>
  <br>
  <br>
  <span class="style3">
    <% // この画面は、まだ実装されていません。 %>
    <%=CoreTools.getRBString("Orteus.CoreMsg.N01901", rb)%>
  </span></div>
</BODY>
</HTML>
