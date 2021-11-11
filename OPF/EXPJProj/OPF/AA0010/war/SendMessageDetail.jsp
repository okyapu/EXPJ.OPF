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

<jsp:useBean id="model" class="com.nec.jp.orteus.msg.core.MessageDetailModel" scope="request"/>

<%
	ManageContainer container = CoreTools.getContainer();
	Hashtable params = CoreTools.getParamsList(request);
	HttpSession so = null;
	so = request.getSession(false);
	if ( so == null || so.getAttribute("UserId") == null || so.isNew() == true){
%>
<script language="JavaScript">
top.location.href="SessionTimeout.jsp";
</script>
<%
		return;
	}

	// 2004/01/22 m-kusunoki 国際化対応
	String locale = (String)so.getAttribute("LOCALE");
	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	Message message = model.getMessage();

	Date createdDate = message.getCreatedDate();
	String createdDateStr = "-";
	if(createdDate != null){
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.SHORT);
		createdDateStr = df.format(createdDate);
	}

	String [] conductName = model.getConductName();
	String [] url = model.getUrl();
	String progressState = "-";
	if(message.getProgressState() == 1){
		progressState = CoreTools.getRBString("Orteus.Common.N00010", rb);	// 受信
	}
	else if(message.getProgressState() == 2){
		progressState = CoreTools.getRBString("Orteus.Common.N00011", rb);	// 参照
	}
	else if(message.getProgressState() == 3){
		progressState = CoreTools.getRBString("Orteus.Common.N00012", rb);	// 開始
	}
	else if(message.getProgressState() == 4){
		progressState = CoreTools.getRBString("Orteus.Common.N00013", rb);	// 完了
	}

	// 2004/01/22 m-kusunoki 国際化対応
	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>
<html>
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + charset%>">
<meta name="GENERATOR" content="Microsoft FrontPage 4.0">
<meta name="ProgId" content="FrontPage.Editor.Document">

<% // 業務メニュー %>
<title><%=CoreTools.getRBString("Orteus.Common.N00033", rb)%></title>
<script language="JavaScript">
function move(){
	window.open("nextMessage.html","new","resizable=yes,width=800,height=600");
}
function move2(){
	window.open("gyoumu_screen.html","new2","resizable=yes,width=800,height=500");
}
function Jyoukyou(){
	window.open("tree.html","new2","resizable=yes,width=1000,height=500");
}

</script>
</head>
<body bgcolor="#FFFFFF">

<table border=0 width=100% height="90%" CELLPADDING=0 CELLSPACING=0>
<tr>
<td>

<%
String limitBC = "#CCCCFF";
Date limit = message.getLimit();
String limitStr = "-";
if(limit != null){
	DateFormat df = DateFormat.getDateInstance();
	limitStr = df.format(limit);

	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE,-1);
	Date today = cal.getTime();

	if(!today.before(limit) && message.getProgressState() != Message.PROGRESS_COMPLETION){
		limitBC = "#FF0000";
	}
}

%>

<%
//---------------------------------------------------------------------------------
// 2003/09/11 m-kusunoki 追加 メッセージキーの種類と数により、表示するイメージを判定
String key_img = null;

String strMultiKey_flag = request.getParameter("MULTIKEY_FLAG");
String strAnyKey_flag = request.getParameter("ANYKEY_FLAG");

int multiKey_flag = -1;	// 0:メッセージキーが１種類 / 1:メッセージキーが複数種類 / -1:メッセージキーなし
int anyKey_flag = -1;	// 0:メッセージキーがひとつ / 1:メッセージキーが複数     / -1:メッセージキーなし

if ( strMultiKey_flag!=null && strMultiKey_flag.equals("")!=true ) {
    multiKey_flag = Integer.parseInt(strMultiKey_flag);
}
if ( strAnyKey_flag!=null && strAnyKey_flag.equals("")!=true ) {
    anyKey_flag = Integer.parseInt(strAnyKey_flag);
}

if( (multiKey_flag == 1) && (anyKey_flag == 1) ) {
	key_img = "images/Multi-AnyKey.gif";
}
else if( (multiKey_flag == 1) && (anyKey_flag == 0) ) {
	key_img = "images/Multi-WAnyKey.gif";
}
else if( (multiKey_flag == 0) && (anyKey_flag == 1) ) {
	key_img = "images/WMulti-AnyKey.gif";
}
else if( (multiKey_flag == 0) && (anyKey_flag == 0) ) {
	key_img = "images/WMulti-WAnyKey.gif";
}
else {
	key_img = "";
}

// 送信先の業務グループ名を取得
String businessGroupName = "-";		// 業務グループ名

String [] groupNames = (String [])params.get("MSG_GROUP_NAME");
if ( groupNames!=null && groupNames.length>0 ) {
    businessGroupName = groupNames[0];
}
%>

<table border="0" cellpadding="2" cellspacing="1" width="100%" bgcolor="#9999CC">
  <tr>
    <% // （本人） → （送信先） %>
    <td nowrap width="100%"><b>&nbsp;(<%=CoreTools.getRBString("Orteus.Common.N00034", rb)%>)&nbsp;<%=MessageSetForm.setText(message.getTransmittingGroupName())%></b> 
       -&gt; &nbsp;(<%=CoreTools.getRBString("Orteus.Common.N00009", rb)%>)&nbsp;<%=MessageSetForm.setTable(URLDecoder.decode(businessGroupName))%>
    </td>
    
    <td nowrap width="10%" align="center" rowspan=2>
      <% if ( key_img!=null && key_img.equals("")!=true ) { %>
        <% // メッセージキーを表示します %>
        <a href="DisplayMessageKey.jsp?MSG_MESSAGE_ID=<%=message.getMessageId()%>&MSG_BUSINESS_CD=<%=MessageSetForm.setInputType(message.getBusinessCd())%>&MSG_BUSINESS_GROUP_CD=<%=MessageSetForm.setInputType(message.getTransmittingGroupCd())%>&MSG_BUSINESS_START=no" target="messagekey" title="<%=CoreTools.getRBString("Orteus.Common.N00021", rb)%>">
          <img border="0" src="<%=key_img%>">
        </a>
      <% } %>
    </td>

    <form method="POST" action="javascript: var wnd = window.open('messageControl?MSG_PG=flow&messageId=<%=message.getMessageId()%>');" name="tree">
    <td nowrap width="20%" align="center" rowspan="2">
      <% // 進捗表示 %>
      <input type="submit" value="<%=CoreTools.getRBString("Orteus.CoreMsg.N01301", rb)%>">
    </td>
    </form>
  </tr>

  <tr>
    <td nowrap width="100%"><%=MessageSetForm.setTable(message.getRecvExpression())%></td>
  </tr>

</table>

</td>
</tr>
<tr height="100%">
<td valign=top bgcolor="#EEEEFF">
<table width="100%" cellpadding="0" cellspacing="0">
<tr><td width="100%">
<textarea style="width:100%;height:100%;min-height:110;background:#EEEEFF;border:0" readonly>
<%=MessageSetForm.setInputType(message.getReference())%>
</textarea>
</td></tr>
</table>
</td>
<tr>
<td>
<TABLE WIDTH="100%" BGCOLOR="#9999CC" >
<TR>
<td><br></td>
</tr>

</table>


<br>

</body>

</html>
