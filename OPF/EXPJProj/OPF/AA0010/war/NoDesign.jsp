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
    // ���O�C���`�F�b�N
    ManageContainer container=CoreTools.getContainer();
    Hashtable params=CoreTools.getParamsList(request);
    HttpSession so;
    so = request.getSession(false);
    if(so==null || so.isNew() == true){
        // ���O�C�����Ă��Ȃ��ꍇ�̏���
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
// 2004/01/22 m-kusunoki ���ۉ��Ή�
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
    <% // ���̉�ʂ́A�܂���������Ă��܂���B %>
    <%=CoreTools.getRBString("Orteus.CoreMsg.N01901", rb)%>
  </span></div>
</BODY>
</HTML>
