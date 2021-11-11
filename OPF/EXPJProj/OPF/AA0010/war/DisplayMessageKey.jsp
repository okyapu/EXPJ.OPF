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
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.net.*" %>

<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.core.*" %>

<%
	String locale = null;
	String charset = null;
	ResourceBundle rb = null;

try {
	HttpSession so = null;
	so = request.getSession(false);
	if ( so == null || so.getAttribute("UserId") == null || so.isNew() == true){
%>
<script language="JavaScript">
opener.top.location.href="SessionTimeout.jsp";
this.window.close();
</script>
<%
		return;
	}

	// 2004/01/22 m-kusunoki 国際化対応
	locale = (String)so.getAttribute("LOCALE");
	charset = CoreTools.getCharset(locale);
	rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);

	Business business = null;
	business = Business.getCurrentBusiness(so,request);
%>

<html>
<% // Orteus メッセージキー %>
<head><title><%=CoreTools.getRBString("Orteus.CoreMsg.N00301", rb)%></title></head>
<body onLoad="focus();">

        <% // メッセージキー %>
        <center><font size="+2"><b><%=CoreTools.getRBString("Orteus.CoreMsg.N00302", rb)%></b></font></center>

        <table border=0 cellspacing="0" cellpadding="0" width="100%">
          <tr>
            <td align="right">
              <a href="javascript: var wnd = window.close();"> <%=CoreTools.getRBString("Orteus.Common.N00001", rb)%> </a>
            </td>
          </tr>
        </table>

        <hr>
        <center>
	<%
	ArrayList keyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_RECEIVE);
	if (keyTypeArray.size() == 0) {
		%>
		<% // なし %>
		<br><%=CoreTools.getRBString("Orteus.Common.N00002", rb)%><br>
		<%
	}
	for(int keyTypeCount = 0; keyTypeCount < keyTypeArray.size();keyTypeCount++) {
		MessageKeyType keyType = (MessageKeyType)keyTypeArray.get(keyTypeCount);
		String tableName = keyType.getTableName();
		String [] keyColumnName = keyType.getKeyColumnName();
		%>
		<br><img src="images/blue-square.gif"/>&nbsp;<font color="#314e28"><b></font><%=MessageSetForm.setText(tableName)%></b>
		<table border="1">
		<tr><%
		for(int keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
			%><th bgcolor="#006400"><font color="#ffffff"><%=MessageSetForm.setTable(keyColumnName[keyColumnCount])%></font></th><%
		}
		%></tr>
		<%
		ArrayList msgKeyArray = business.getRecieveMessageKey(tableName,keyColumnName);
		if(msgKeyArray.size() == 0){
			%><tr bgcolor="#fff3c9"><%
			  // なし
			%><td colspan="<%=keyColumnName.length%>"><%=CoreTools.getRBString("Orteus.Common.N00002", rb)%></td><%
			%></tr><%
		}
		else{
			for(int msgKeyCount = 0; msgKeyCount < msgKeyArray.size(); msgKeyCount++) {
				%><tr bgcolor="#fff3c9"><%
				MessageKey msgKey = (MessageKey)msgKeyArray.get(msgKeyCount);
				for(int keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
					String keyValue = msgKey.getKeyValue(keyColumnName[keyColumnCount]);
					%><td><%=MessageSetForm.setTable(keyValue)%></td><%
				}
				%></tr><%
			}
		}
		%></table><%
	}

	String contextNumber = "" + business.getContextNumber();
	Hashtable contextHash = (Hashtable)so.getAttribute("MSG_CONTEXT_HASH");
	contextHash.remove(contextNumber);
	Enumeration keys = contextHash.keys();
	int max = 0;
	while(keys.hasMoreElements()){
		String contNumStr = (String)keys.nextElement();
		int contNum = Integer.parseInt(contNumStr);
		if(contNum > max){
			max = contNum;
		}
	}
	so.setAttribute("CURRENT_CONTEXT_NO","" + max);	// セッションに保持

}
catch(Exception e){
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
				// "詳細" + (i+1) + " : " + detail[i];
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
<body>
</html>
