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
	so=request.getSession(false);
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
<%
	String control = request.getParameter("MSG_CONTROL");
	if(control != null && (control.equals("delete") || control.equals("revival"))){
%>
	top.LEFT.location.reload();
<%
	}
%>
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

function change(){
	user = document.form1.MSG_COMPLETED_USER_CD.value;
	location = "messageControl?MSG_PG=completeList&MSG_COMPLETED_USER_CD=" + user;
	top.LEFT.location.reload();
}

</script>

<%
// 2004/01/22 国際化対応
// function revivalMessage(), deleteMessage() はchkMessage.jsに移動
   String jsFileName = "chkMessage_" + locale + ".js";
%>
    <SCRIPT SRC="<%=jsFileName%>"></SCRIPT>

<style>
<%
	for(int i=0;i<message.length;i++){
%>
div#rect<%=i%>{
	width:"16";
	height:"18";
	visibility:hidden;
<%
		if(currentMessage == message[i].getMessageId()){
%>
	visibility:visible;
<%
	}
%>
}
<%
	}
%>
</style>
</head>
<body bgcolor="#FFFFFF" vlink="blue" alink="blue">

<form method="POST" action="messageControl?MSG_PG=completeList" name="form1">
  <input type="hidden" name="MSG_CONTROL" value=""><center>
  <table width="100%" cellspacing="1" cellpadding="0">
    <tr>
      <% // 一覧タイトル(images/CompletedTitle.jpg) %>
      <td width="60%"><img src="<%=CoreTools.getRBString("Orteus.CoreMsg.N00205", rb)%>"></td>
      <td width="40%" ALIGN="RIGHT" STYLE="FONT-SIZE:11pt">
<%
	String user = (String)so.getAttribute("MSG_COMPLETED_USER_CD");
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
        <select name="MSG_COMPLETED_USER_CD" onChange="change()">
         <% // 所属グループ全体 , 個人 %>
         <option value="" <%=MessageSetForm.setInputType(selGroup)%>><%=CoreTools.getRBString("Orteus.Common.N00003", rb)%>
         <option value="<%=MessageSetForm.setInputType((String)so.getAttribute("UserId"))%>" <%=MessageSetForm.setText(selUser)%>><%=CoreTools.getRBString("Orteus.Common.N00004", rb)%>
        </select>
      <% // 件 該当 %>
      <%=message.length%><%=CoreTools.getRBString("Orteus.Common.N00005", rb)%>
      </td>  
    </tr>  
  </table>  
  <table cellspacing="0" cellpadding="0" width="100%">  
    <tr bgcolor="#9999CC">  
      <th nowrap width="2%"><br></th>  
<%
	if(sortKey.equals("RECV_EXPRESSION")){
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
      <th nowrap width="30%" align="left"><a href="messageControl?MSG_PG=completeList&MSG_SORTKEY=RECV_EXPRESSION&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00006", rb)%></font></a><%=sortMark%></th>  
<%
	if(sortKey.equals("TRANSMITTING_USER_NAME")){
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
      <% // 送信者(送信元) %>
      <th nowrap width="17%" align="left"><a href="messageControl?MSG_PG=completeList&MSG_SORTKEY=TRANSMITTING_USER_NAME&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00007", rb)%>(<%=CoreTools.getRBString("Orteus.Common.N00008", rb)%>)</font></a><%=sortMark%></th>  
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
      <th nowrap width="15%" align="left"><a href="messageControl?MSG_PG=completeList&MSG_SORTKEY=CREATED_DATE&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00014", rb)%></font></a><%=sortMark%></th>
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
      <th nowrap width="6%"><a href="messageControl?MSG_PG=completeList&MSG_SORTKEY=DISPLAY_LEVEL&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black">LV</font></a><%=sortMark%></th>
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
      <th nowrap width="6%" align="left"><a href="messageControl?MSG_PG=completeList&MSG_SORTKEY=LIMIT&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00015", rb)%></font></a><%=sortMark%></th>  
      <th nowrap width="5%">
<table cellspacing="0" cellpadding="0"><tr>
<% // 戻す %>
<td><input type="submit" value="<%=CoreTools.getRBString("Orteus.CoreMsg.N00203", rb)%>" name="B7" ALIGN="RIGHT" onClick="return revivalMessage();" STYLE="WIDTH:30;HEIGHT:20;FONT-SIZE:10"></td>
<% // 削除 %>
<td><input type="submit" value="<%=CoreTools.getRBString("Orteus.CoreMsg.N00204", rb)%>" name="B7" ALIGN="RIGHT" onClick="return deleteMessage();" STYLE="WIDTH:30;HEIGHT:20;FONT-SIZE:10"></td>
</tr></table>
      </th>  
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
      <th nowrap width="9%"><a href="messageControl?MSG_PG=completeList&MSG_SORTKEY=PROGRESS_STATE&MSG_SORTORDER=<%=MessageSetForm.setInputType(sortOrder)%>"><font color="black"><%=CoreTools.getRBString("Orteus.Common.N00016", rb)%></font></a><%=sortMark%></th>
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
			progressStateBC = "#C0C0C0";
		}
		String borderColor = "#9999CC";

		// 2003/09/17 m-kusunoki 追加 業務Ｇ名の取得
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
<tr bgcolor=<%=recordBgColor%>>
      <td width="2%" align="left" style="border-bottom:solid 2px <%=borderColor%>;"><img src="<%=curImage%>" name="cursol"></td>  
      <td width="30%" style="border-bottom:solid 2px <%=borderColor%>;"><font COLOR="black" size="2">  
<a HREF="messageControl?MSG_PG=completeDetail&MSG_MESSAGE_ID=<%=message[i].getMessageId()%>&MSG_GROUP_NAME=<%=URLEncoder.encode(groupName)%>&MULTIKEY_FLAG=<%=MultiKey_flag%>&ANYKEY_FLAG=<%=AnyKey_flag%>"
  TITLE="<%=MessageSetForm.setText(message[i].getReference())%>" target="DOWN" onClick="chCursol(<%=i%>,<%=message.length%>)">
<%=MessageSetForm.setTable(message[i].getRecvExpression())%></a>
</font></td>  
      <td width="3%" style="border-bottom:solid 2px <%=borderColor%>;">
	  <table border=0 width="100%" cellspacing="1" cellpadding="0"><tr>
	  <td width="45%" align="left"><%=key[0]%></td><td width="45%" align="left"><%=key[1]%></td><td width="10%" nowrap>&nbsp;</td>
	  </tr></table>
	  </td>  
      <td width="7%" nowrap style="border-bottom:solid 2px <%=borderColor%>;">
        <% if ( msgKey!=null && msgKey.equals("")!=true ) { %>
          <% // メッセージキーを表示します %>
          <a href="DisplayMessageKey.jsp?MSG_MESSAGE_ID=<%=message[i].getMessageId()%>&MSG_BUSINESS_CD=<%=MessageSetForm.setInputType(message[i].getBusinessCd())%>&MSG_BUSINESS_GROUP_CD=<%=MessageSetForm.setInputType(message[i].getTransmittingGroupCd())%>&MSG_BUSINESS_START=no" target="messagekey" title="<%=CoreTools.getRBString("Orteus.Common.N00021", rb)%>">
	    <%=MessageSetForm.setTable(msgKey)%>
	    </a>
        <% } %>
            &nbsp;
      </td>
      <td width="18%" style="border-bottom:solid 2px <%=borderColor%>;"><font COLOR="black" size="2"><%=MessageSetForm.setText(message[i].getTransmittingUserName())%>(<%=MessageSetForm.setText(message[i].getTransmittingGroupName())%>)</font></td>  
      <td width="7%" style="border-bottom:solid 2px <%=borderColor%>;"><font COLOR="black" size="2"><%=createdDateStr%></font></td>  
      <td width="8%" style="border-bottom:solid 2px <%=borderColor%>;">  
        <p align="center"><%=message[i].getDisplayLevel()%></td>  
      <td width="12%" bgcolor="<%=limitBC%>" style="border-bottom:solid 2px <%=borderColor%>;"><font color="black" size="2"><%=MessageSetForm.setTable(limitStr)%></font></td>
      <td width="5%" style="border-bottom:solid 2px <%=borderColor%>;">
        <p align="center"><input type="checkbox" name="MSG_CB" value="<%=i%>">
	  </td>
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
