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

<% //logging�֘A logger.jar�K�{ %>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%@ page import="java.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.io.*" %>
<%@ page import="com.nec.jp.orteus.msg.core.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>

<%
	// 2004/01/22 m-kusunoki ���ۉ��Ή�
	String locale = null;
	String charset = null;
	ResourceBundle rb = null;

	if(CoreTools.initialize()!=true) {
%>

<%@ page contentType="text/html; charset=Windows-31J" %>

<HTML>
<HEAD>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
  <TITLE>Orteus ADMIN console: Initialization processing</TITLE>
</HEAD>

<BODY>

Initialization failed.<br>
Contact the administrator.

</BODY>
</HTML>
<%
	} else {
%>
<%
	try{
%>
<%
	ManageContainer container=CoreTools.getContainer();
	String sUID = request.getParameter("sUSERID");
	Hashtable params=CoreTools.getParamsList(request);
	HttpSession so = null;

	so = request.getSession(true);
	if( so==null || so.isNew() == true || request.getRemoteUser() == null){
		// ���O�C�����s���̏���
		%><jsp:forward page="login.jsp"/><%
		locale = CoreTools.getLocale(null);
		if (locale.equals("") == true) {
%>

<HTML>
<HEAD>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
  <TITLE>Orteus ADMIN console: Initialization processing</TITLE>
</HEAD>
<BODY>
LOCALE is not set up.<br>
</BODY>
</HTML>

<%
		}
	}
	else {
		locale = (String)so.getAttribute("LOCALE");
		if ((null == locale) || (0 == locale.length())) {
			locale = CoreTools.getLocale(request.getRemoteUser());
		}
	}

	so.setAttribute("DB_TYPE","ORACLE");
	MasterCash masterCash = new MasterCash(locale);
	so.setAttribute("MSG_MASTER_CASH",masterCash);
	so.setAttribute("MSG_SORTKEY", "CREATED_DATE");
	so.setAttribute("MSG_SORTORDER", "DESC");
	so.setAttribute("UserId", request.getRemoteUser());
	// 2003/07/18 m-kusunoki �ǉ�
	so.setAttribute("MSG_USER_CD", request.getRemoteUser());
	System.out.println("UserId="+request.getRemoteUser());

	// 2004/01/22 m-kusunoki ���ۉ��Ή�
	charset = CoreTools.getCharset(locale);
	rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>
<HTML>
  <head>
    <meta HTTP-EQUIV="Pragma" CONTENT="no-cache">
    <meta HTTP-EQUIV="expires" CONTENT="0">
    <meta HTTP-EQUIV="cache-control" CONTENT="no-cache">
    <script language="JavaScript">
      function setTitle(s){
        this.document.title=s;
      }
    </script>
    <% // Orteus ���C����� %>
    <title><%=CoreTools.getRBString("Orteus.Common.N00026", rb)%></title>
  </head>
  <frameset cols="20%,80%">

    <frame name="LEFT" SRC="messageControl?MSG_PG=menu">

     <frameset ROWS="70%,30%">
      <frame NAME="UP" SRC="info.jsp" marginwidth=5 marginheight=10>
      <frame NAME="DOWN" SRC="null.html" marginwidth=5 marginheight=2>
     </frameset>
  </frameset>

<%
	}catch(Exception e){
	ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
	PrintStream printStream = new PrintStream(byteStream);
	e.printStackTrace(printStream);
	String error = byteStream.toString();

	if (e instanceof MessageApiException || e instanceof MessageControlException) {
		DisplayMessage objMessage = new DisplayMessage();
		MsgException e_tmp = (MsgException)e;
		MsgException old_tmp = e_tmp;
		while(e_tmp != null){
			%><%=e_tmp.getMessage()%><%=objMessage.getMessage(e_tmp.getMessage())%><%

			String [] detail = e_tmp.getDetail();
			for(int i=0;detail != null && i<detail.length;i++){
                                // "�ڍ�" + (i+1) + " : " + detail[i];
				String msg = CoreTools.getRBString("Orteus.Common.N00022", rb) + (i+1) + " : " + detail[i];
				%><%=msg%><%
			}
			e_tmp = e_tmp.getNextException();
			if(e_tmp != null){
				old_tmp = e_tmp;
			}
		}
	}
	else {
		%><%="" + e%><%
	}
	%><pre><%=error%></pre><%
	}
%>
</HTML>
<% } %>