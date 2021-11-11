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

<jsp:useBean id="model" class="com.nec.jp.orteus.msg.core.MessageListModel" scope="request"/>
<%
	ManageContainer container=CoreTools.getContainer();
	Hashtable params=CoreTools.getParamsList(request);
	HttpSession so = null;
	so = request.getSession(false);
	if ( so == null || so.getAttribute("UserId") == null || so.isNew() == true ){
%>
<script language="JavaScript">
top.location.href="SessionTimeout.jsp";
</script>
<%
		return;
	}
	String sortKey = (String)so.getAttribute("MSG_SORTKEY");
	String sortOrder = (String)so.getAttribute("MSG_SORTORDER");
	String sortOrderRev = null;
	String sortMark = null;
	if(sortOrder == null || sortOrder.equals("ASC")){
		sortOrderRev = "DESC";
	}
	else{
		sortOrderRev = "ASC";
	}

	Message [] message = model.getList();
	String currentMessageStr = (String)so.getAttribute("MSG_MESSAGE_ID");
	int currentMessage = 0;
	if(currentMessageStr != null){
		currentMessage = Integer.parseInt(currentMessageStr);
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

<html>
<head>
<script language="JavaScript">
function change(){
	user = document.form1.MSG_SENDED_USER_CD.value;
	location = "messageControl?MSG_PG=sendList&MSG_SENDED_USER_CD=" + user;
	top.LEFT.location.reload();
}

var oldNum = -1;
function chCursol(num,max){
	image = new Image();
	if(max == 1){
		image.src = "images/ya2.gif";
		document.cursol.src = image.src;
	}else{
		for(i=0;i<max;i++){
			if(i == num){
				image.src = "images/ya2.gif";
				document.cursol[num].src = image.src;
			}else{
				image.src = "images/ball.gif";
				document.cursol[i].src = image.src;
			}
		}
	}
}

</script>
</head>
<body bgcolor="#FFFFFF" vlink="blue" alink="blue">

<form method="POST" action="messageControl?MSG_PG=sendList" name="form1">
<center>
  <table width="100%" cellspacing="1" cellpadding="0">
    <tr>
      <% // 一覧タイトル(images/SendedTitle.jpg) %>
      <td width="60%"><img src="<%=CoreTools.getRBString("Orteus.CoreMsg.N01402", rb)%>"></td>
      <td width="40%" ALIGN="RIGHT" STYLE="FONT-SIZE:11pt">
<%
	String user = (String)so.getAttribute("MSG_SENDED_USER_CD");
	String selGroup = null;
	String selUser = null;
	if(user != null && user.equals("")){
		selGroup = "selected";
		selUser = "";
	}
	else{
		selGroup = "";
		selUser = "selected";
	}
%>
        <% // 所属グループ全体, 個人 %>
        <select name="MSG_SENDED_USER_CD" onChange="change()">
         <option value="" <%=MessageSetForm.setInputType(selGroup)%>><%=CoreTools.getRBString("Orteus.Common.N00003", rb)%>
         <option value="<%=MessageSetForm.setInputType((String)so.getAttribute("UserId"))%>" <%=selUser%>><%=CoreTools.getRBString("Orteus.Common.N00004", rb)%>
        </select>

      <% // 件 該当 %>
      <%=message.length%><%=CoreTools.getRBString("Orteus.Common.N00005", rb)%>
     </td>  
    </tr>  
  </table>  
  <table cellspacing="0" cellpadding="0" width="100%">  
    <tr bgcolor="#9999CC" height="20">  
	<td width="2%" nowrap><br></td>
<%
	if(sortKey.equals("SEND_EXPRESSION")){
		sortOrder = sortOrderRev;
		if(sortOrder.equals("ASC")){
			sortMark = "<img src='images/triangle_l.gif'/>";
		}
		else{
			sortMark = "<img src='images/triangle_u.gif'/>";
		}
	}
	else{
		sortOrder = "ASC";
		sortMark = "";
	}
%>

      <% // メッセージ %>
      <th nowrap width="30%" align="left"><a href="messageControl?MSG_PG=sendList&MSG_SORTKEY=SEND_EXPRESSION&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00006", rb)%></font></a><%=sortMark%></th>  
<%
	if(sortKey.equals("BUSINESS_NAME")){
		sortOrder = sortOrderRev;
		if(sortOrder.equals("ASC")){
			sortMark = "<img src='images/triangle_l.gif'/>";
		}
		else{
			sortMark = "<img src='images/triangle_u.gif'/>";
		}
	}
	else{
		sortOrder = "ASC";
		sortMark = "";
	}
%>
      <th nowrap width="10%" align="left" colspan="2"><font color="black">KEY</font></th>
      <% // 送信先, 業務G %>
      <th nowrap width="18%" align="left"><a href="messageControl?MSG_PG=sendList&MSG_SORTKEY=BUSINESS_NAME&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00009", rb)%>(<%=CoreTools.getRBString("Orteus.CoreMsg.N01401", rb)%>)</font></a><%=sortMark%></th>  
<%
	if(sortKey.equals("CREATED_DATE")){
		sortOrder = sortOrderRev;
		if(sortOrder.equals("ASC")){
			sortMark = "<img src='images/triangle_l.gif'/>";
		}
		else{
			sortMark = "<img src='images/triangle_u.gif'/>";
		}
	}
	else{
		sortOrder = "ASC";
		sortMark = "";
	}
%>
      <% // 日付 %>
      <th nowrap width="12%" align="left"><a href="messageControl?MSG_PG=sendList&MSG_SORTKEY=CREATED_DATE&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00014", rb)%></font></a><%=sortMark%></th>  
<%
	if(sortKey.equals("DISPLAY_LEVEL")){
		sortOrder = sortOrderRev;
		if(sortOrder.equals("ASC")){
			sortMark = "<img src='images/triangle_l.gif'/>";
		}
		else{
			sortMark = "<img src='images/triangle_u.gif'/>";
		}
	}
	else{
		sortOrder = "ASC";
		sortMark = "";
	}
%>
      <th nowrap width="8%"><a href="messageControl?MSG_PG=sendList&MSG_SORTKEY=DISPLAY_LEVEL&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black">LV</font></a><%=sortMark%></th>  
<%
	if(sortKey.equals("LIMIT")){
		sortOrder = sortOrderRev;
		if(sortOrder.equals("ASC")){
			sortMark = "<img src='images/triangle_l.gif'/>";
		}
		else{
			sortMark = "<img src='images/triangle_u.gif'/>";
		}
	}
	else{
		sortOrder = "ASC";
		sortMark = "";
	}
%>
      <% // 納期 %>
      <th nowrap width="12%" align="left"><a href="messageControl?MSG_PG=sendList&MSG_SORTKEY=LIMIT&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00015", rb)%></font></a><%=sortMark%></th>  
<%
	if(sortKey.equals("PROGRESS_STATE")){
		sortOrder = sortOrderRev;
		if(sortOrder.equals("ASC")){
			sortMark = "<img src='images/triangle_l.gif'/>";
		}
		else{
			sortMark = "<img src='images/triangle_u.gif'/>";
		}
	}
	else{
		sortOrder = "ASC";
		sortMark = "";
	}
%>
      <% // 状態 %>
      <th nowrap width="9%"><a href="messageControl?MSG_PG=sendList&MSG_SORTKEY=PROGRESS_STATE&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00016", rb)%></font></a><%=sortMark%></th>  
    </tr>  
<%
	for(int i=0;i<message.length;i++){
%>
	<input type="hidden" name="MSG_MESSAGE_ID" value="<%=message[i].getMessageId()%>">
<%
		String recordBgColor = "#E6E6FF";
		String curImage = "images/ball.gif";
		if(currentMessage == message[i].getMessageId()){
			curImage = "images/ya2.gif";
//			recordBgColor = "wheat";
		}

		String limitBC = recordBgColor;
		Date createdDate = message[i].getCreatedDate();
		Date limit = message[i].getLimit();
		String limitStr = "-";
		if(limit != null){
			// 2003/09/10 m-kusunoki 納期のフォーマットを YYYY/MM/DD -> YY/MM/DD に変更
			// DateFormat df = DateFormat.getDateInstance();
			DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
			limitStr = df.format(limit);

			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE,-1);
			Date today = cal.getTime();

			if(!today.before(limit) && message[i].getProgressState() != Message.PROGRESS_COMPLETION){
				limitBC = "#FF0000";
			}
		}

		String createdDateStr = "-";
		if(createdDate != null){
			DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
			createdDateStr = df.format(createdDate);
		}

		String progressState = "";
		String progressStateBC = recordBgColor;
		if(message[i].getProgressState() == 1){
			progressState = CoreTools.getRBString("Orteus.Common.N00010", rb);	// 受信
			progressStateBC = "#CCCCFF";
		}
		else if(message[i].getProgressState() == 2){
			progressState = CoreTools.getRBString("Orteus.Common.N00011", rb);	// 参照
			progressStateBC = "YELLOWGREEN";
		}
		else if(message[i].getProgressState() == 3){
			progressState = CoreTools.getRBString("Orteus.Common.N00012", rb);	// 開始
			progressStateBC = "YELLOW";
		}
		else if(message[i].getProgressState() == 4){
			progressState = CoreTools.getRBString("Orteus.Common.N00013", rb);	// 完了
			progressStateBC = "#c0c0c0";
		}

		String groupName = "-";
		String [] tempGroup = model.getRecvGroupName(message[i].getBusinessCd());
		if(tempGroup != null){
			for(int count=0;count<tempGroup.length;count++){
				if(count == 0){
					groupName = tempGroup[count];
				}
				else{
					groupName = groupName + "," + tempGroup[count];
				}
			}
		}
		String borderColor = "#9999CC";

%>
<%
String msgKey = "";
ArrayList valueArray = model.getFirstMessageKey(""+message[i].getManagesDataId());
ArrayList chkKeyArray = new ArrayList();
String chkKeyAddStr = "";

// 2003/09/11 m-kusunoki メッセージキーの種類と数を属性に設定する処理を追加
int MultiKey_flag = -1;	// 0:メッセージキーが１種類 / 1:メッセージキーが複数種類 / -1:メッセージキーなし
int AnyKey_flag = -1;	// 0:メッセージキーがひとつ / 1:メッセージキーが複数     / -1:メッセージキーなし

if(valueArray != null && valueArray.size() != 0){
	msgKey = (String)valueArray.get(0);

	if(model.isMultiMessageKey(""+message[i].getManagesDataId()) == true){
		chkKeyAddStr = "<img src='images/MultiKey.gif' title='" + CoreTools.getRBString("Orteus.Common.N00017", rb) + "'>";
		chkKeyArray.add(chkKeyAddStr);	// 複合キー
		MultiKey_flag = 1;
	}else{
		chkKeyArray.add("<img src='images/WHITE_MultiKey.gif'");
		MultiKey_flag = 0;
	}
	if(model.hasAnyRealMessageKey(""+message[i].getManagesDataId()) == true){
		chkKeyAddStr = "<img src='images/AnyKey.gif' title='" + CoreTools.getRBString("Orteus.Common.N00018", rb) + "'>";
		chkKeyArray.add(chkKeyAddStr);	// 複数
		AnyKey_flag = 1;
	}else{
		chkKeyArray.add("<img src='images/WHITE_AnyKey.gif'>");
		AnyKey_flag = 0;
	}
}

String key[] = {"<br>","<br>"};
for(int chkNum=0;chkNum<chkKeyArray.size();chkNum++){
	key[chkNum] = (String)chkKeyArray.get(chkNum);
}
%>

<tr height="23" bgcolor="<%=recordBgColor%>">
	  <td width="2%" nowrap style="border-bottom:solid 2px <%=borderColor%>;"><img src="<%=curImage%>" name="cursol"></td>
      <td width="30%" style="border-bottom:solid 2px <%=borderColor%>;"><font COLOR="black" size="2">  
<a HREF="messageControl?MSG_PG=sendDetail&MSG_MESSAGE_ID=<%=message[i].getMessageId()%>&MSG_GROUP_NAME=<%=URLEncoder.encode(groupName)%>&MULTIKEY_FLAG=<%=MultiKey_flag%>&ANYKEY_FLAG=<%=AnyKey_flag%>"
  TITLE="<%=MessageSetForm.setText(message[i].getReference())%>" target="DOWN" onClick="chCursol(<%=i%>,<%=message.length%>)">
<%=MessageSetForm.setTable(message[i].getSendExpression())%></a>
</font></td>
      <td width="3%" style="border-bottom:solid 2px <%=borderColor%>;">
	  <table border=0 width="100%" cellspacing="1" cellpadding="0"><tr>
	  <td width="45%" align="left"><%=key[0]%></td><td width="45%" align="left"><%=key[1]%></td><td width="10%" nowrap>&nbsp;</td>
	  </tr></table>
	  </td>  
      <td width="7%" nowrap style="border-bottom:solid 2px <%=borderColor%>;">
        <% if ( msgKey!=null && msgKey.equals("")!=true ) { %>
          <% // メッセージキーを表示します %>
          <a href="DisplayMessageKey.jsp?MSG_MESSAGE_ID=<%=message[i].getMessageId()%>&MSG_BUSINESS_CD=<%=MessageSetForm.setInputType(message[i].getBusinessCd())%>&MSG_BUSINESS_GROUP_CD=<%=message[i].getTransmittingGroupCd()%>&MSG_BUSINESS_START=no" target="messagekey" title="<%=CoreTools.getRBString("Orteus.Common.N00021", rb)%>">
	  <%=MessageSetForm.setTable(msgKey)%>
	  </a>
        <% } %>
          &nbsp;
      </td>
      <td width="18%" style="border-bottom:solid 2px <%=borderColor%>;"><font COLOR="black" size="2"><%=MessageSetForm.setTable(message[i].getBusinessName())%>(<%=MessageSetForm.setText(groupName)%>)</font></td>  
      <td width="12%" style="border-bottom:solid 2px <%=borderColor%>;"><font COLOR="black" size="2"><%=MessageSetForm.setTable(createdDateStr)%></font></td>  
      <td width="8%" style="border-bottom:solid 2px <%=borderColor%>;">  
        <p align="center"><%=message[i].getDisplayLevel()%></td>  
      <td width="12%" bgcolor="<%=limitBC%>" style="border-bottom:solid 2px <%=borderColor%>;"><font color="black" size="2"><%=MessageSetForm.setTable(limitStr)%></font></td>
      <td bgcolor="<%=progressStateBC%>" width="9%" align="center" style="border-bottom:solid 2px <%=borderColor%>;"><font size="2" color="black"><%=MessageSetForm.setTable(progressState)%></font></td>
</tr>
<%
	}
%>

  </table>
  </center>
</form>

</body>

</html>
