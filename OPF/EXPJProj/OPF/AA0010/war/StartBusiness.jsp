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

<%@ page import="com.nec.jp.orteus.msg.core.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>

<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.net.*" %>

<%
	ManageContainer container = CoreTools.getContainer();
    @SuppressWarnings("rawtypes")
	Hashtable params = CoreTools.getParamsList(request);
	HttpSession so = null;
	so = request.getSession(false);
	if (so == null || so.isNew() == true) {
		%><jsp:forward page="SessionTimeout.jsp"/><%
	}
	if ( so.getAttribute("UserId") == null){
		%><jsp:forward page="login.jsp"/><%
	}

	String url = TypeConverter.sanitizer(request.getParameter("MSG_PG"));
	String messageId = TypeConverter.sanitizer(request.getParameter("MSG_MESSAGE_ID"));
	Business business = Business.getCurrentBusiness(so,request);

	int match = url.indexOf("?");

	String m_url = null;
	String m_prm = null;
	String nextUrl = null;
	if(match != -1){
		m_url = url.substring(0,match);
		m_prm = url.substring(match+1,url.length());
		if(m_prm != null && m_prm.length() != 0 && m_prm.equals("") != true){
			String [] m_prmSplt = m_prm.split("&");
			StringBuffer m_prmBuf = new StringBuffer();
			for (int i = 0; i<m_prmSplt.length; i++ ) {
				m_prmBuf.append("&");
				m_prmBuf.append(TypeConverter.sanitizer(m_prmSplt[i]));
			}
			nextUrl = m_url + "?MSG_CONTEXT_NO=" + business.getContextNumber() + m_prmBuf.toString();
		}else{
			nextUrl = m_url + "?MSG_CONTEXT_NO=" + business.getContextNumber();
		}
	}else{
		nextUrl = url + "?MSG_CONTEXT_NO=" + business.getContextNumber();
	}
	nextUrl = nextUrl + "&com.nec.jp.orteusActionMethod.orteusSubmitByLink=controlStart";

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

<html>
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
<% // 処理中です... %>
<title><%=CoreTools.getRBString("Orteus.CoreMsg.N01601", rb)%></title>
</head>

<body>
<%
if(messageId != null && messageId.equals("0") == false){
//受信メッセージより起動された場合のみ
%>
<div id="expj-business-screen-startbusiness" data-href="messageControl?MSG_PG=list"></div>
<%
} else {
%>
<div id="expj-business-screen-startbusiness" data-href="<%=nextUrl%>"></div>
<%
}
%>
</body>
</html>
