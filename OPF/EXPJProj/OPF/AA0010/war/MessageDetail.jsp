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

<% //waTool(logging)関連 watool.jar必須%>
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
	so=request.getSession(false);
	if ( so == null || so.getAttribute("UserId") == null || so.isNew() == true ){
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
</style>
<script language="JavaScript">
<%
	if(conductName == null || conductName.length != 1){
%>
	top.UP.location="messageControl?MSG_PG=list";
<%
	}
%>
function Jyoukyou(){
	window.open("tree.html","new2","resizable=yes,width=1000,height=500");
}
function openWindow(url,name){
	window.open(url,name,"");
}
</script>
</head>
<body bgcolor="#FFFFFF">
<table border=0 width=100% CELLPADDING=0 CELLSPACING=0>
<tr>
<td>
<%
String limitBC = "#9999CC";
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
MasterCash masterCash = null;
masterCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
String businessGroupName = "-";

if ( masterCash!=null ) {
    businessGroupName = masterCash.getNameFromBusinessGroupCd((String)so.getAttribute("MSG_BUSINESS_GROUP_CD"));
}
%>

<table border="0" cellpadding="2" cellspacing="1" width="100%" bgcolor="#9999CC">
  <tr>
    <% // （送信元）→ （本人） %>
    <td nowrap width="100%">&nbsp;(<%=CoreTools.getRBString("Orteus.Common.N00008", rb)%>)&nbsp;<%=MessageSetForm.setText(message.getTransmittingGroupName())%> 
      -&gt; <b>&nbsp;(<%=CoreTools.getRBString("Orteus.Common.N00034", rb)%>)&nbsp;
      <% if ( businessGroupName!=null && businessGroupName.equals("")!=true ) { %>
      <%=MessageSetForm.setText(businessGroupName)%>
      <% } %>
    </b></td>

    <td nowrap width="100%" align="center" rowspan=2>
      <% if ( key_img!=null && key_img.equals("")!=true ) { %>
        <% // メッセージキーを表示します %>
        <a href="DisplayMessageKey.jsp?MSG_MESSAGE_ID=<%=message.getMessageId()%>&MSG_BUSINESS_CD=<%=MessageSetForm.setInputType(message.getBusinessCd())%>&MSG_BUSINESS_GROUP_CD=<%=MessageSetForm.setInputType(message.getTransmittingGroupCd())%>&MSG_BUSINESS_START=no" target="messagekey" title="<%=CoreTools.getRBString("Orteus.Common.N00021", rb)%>">
          <img border="0" src="<%=key_img%>">
      </a>
      <% } %>
    </td>
  </tr>

  <tr>
    <td nowrap width="100%"><%=MessageSetForm.setTable(message.getRecvExpression())%></td>
  </tr>

</table>

</td>
</tr>
<tr>
<td valign=top height="110" width="100%" bgcolor="#EEEEFF">
<table width="100%" cellpadding="0" cellspacing="0">
<tr><td width="100%">
<textarea style="width:100%;height:100%;min-height:110;background:#EEEEFF;border:0" readonly>
<%=MessageSetForm.setInputType(message.getReference())%>
</textarea>
</td></tr>
</table>
</td>
<tr>
<td height="100%" valign="top">
<TABLE WIDTH="100%" BGCOLOR="#9999CC" border=0>
<TR>
<%
	int amari = 3 - conductName.length % 3;
	for(int i=0;i<conductName.length;i++){
		if(i != 0 && i % 3 == 0){
			%></tr><tr height="5"><%
		}
%>
<form action="messageControl" method=POST target="<%=MessageSetForm.setText(message.getBusinessCd())%>">
<TD WIDTH="33%" height="5">
<!--<input type="submit" value="<%=conductName[i]%>" style="width=100%" onClick="openWindow('messageControl?MSG_PG=<%=url[i]%>&MSG_BUSINESS_GROUP_CD=<%=model.getBusinessGroupCd()%>&MSG_BUSINESS_CD=<%=message.getBusinessCd()%>&MSG_MESSAGE_ID=<%=message.getMessageId()%>','<%=message.getBusinessCd()%>');"></TD>-->
<input type="submit" value="<%=MessageSetForm.setInputType(conductName[i])%>" style="width=100%">
<input type="hidden" name="MSG_PG" value="<%=MessageSetForm.setInputType(url[i])%>">
<input type="hidden" name="MSG_BUSINESS_GROUP_CD" value="<%=MessageSetForm.setInputType(model.getBusinessGroupCd())%>">
<input type="hidden" name="MSG_BUSINESS_CD" value="<%=MessageSetForm.setInputType(message.getBusinessCd())%>">
<input type="hidden" name="MSG_MESSAGE_ID" value="<%=message.getMessageId()%>">
</TD>
</form>
<%
	}
	for(int i=0;i<amari;i++){
%>
<TD WIDTH="33%"><BR></TD>
<%
	}
%>
</TR>
</TABLE>

</td>
</tr>

</table>


<br>
<%
	if(conductName != null && conductName.length == 1){
		url[0] = URLEncoder.encode(url[0]);
%>
<script language="JavaScript">
window.open("messageControl?MSG_PG=<%=MessageSetForm.setInputType(url[0])%>&MSG_BUSINESS_GROUP_CD=<%=MessageSetForm.setInputType(model.getBusinessGroupCd())%>&MSG_BUSINESS_CD=<%=MessageSetForm.setInputType(message.getBusinessCd())%>&MSG_MESSAGE_ID=<%=message.getMessageId()%>","<%=MessageSetForm.setText(message.getBusinessCd())%>","");
</script>
<%
	}
%>


</body>

</html>
