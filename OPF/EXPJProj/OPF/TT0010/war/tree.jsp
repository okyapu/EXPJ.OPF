<%@ page import="com.nec.jp.orteus.msg.core.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
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
<%@ page import="java.text.*" %>

<jsp:useBean id="model" class="com.nec.jp.orteus.msg.core.TreeModel" scope="request"/>

<%
	ManageContainer container=CoreTools.getContainer();
	Hashtable params=CoreTools.getParamsList(request);
	HttpSession so;
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
<HEAD>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="expires" CONTENT="0">
<META HTTP-EQUIV="cache-control" CONTENT="no-cache">
<% // Orteus 送信済みメッセージの進捗状況 %>
<title><%=CoreTools.getRBString("Orteus.CoreMsg.N01701", rb)%></title>
</HEAD>
<body bgcolor="#ffffff">
<% // 送信済みメッセージの進捗状況 %>
<center><font size="+2"><b><%=CoreTools.getRBString("Orteus.CoreMsg.N01702", rb)%></b></font></center>

<table border=0 cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td align="right">
      <% // 閉じる %>
      <a href="javascript: var wnd = window.close();"> <%=CoreTools.getRBString("Orteus.Common.N00001", rb)%> </a>
    </td>
  </tr>
</table>

<hr>

<%
//	TreeModel model = new TreeModel(so);
//	model.parseRequest(request);
	BusinessNode [][] businessNode = model.getCircumstances();
	int h = businessNode.length;
	int w = 0;
%>
<table border=0 cellspacing=0 cellpadding =0>
<%
	// 2003/09/10 m-kusunoki 発行日のフォーマットを YYYY/MM/DD hh:mm:ss -> YY/MM/DD hh:mm:ss に変更
	// DateFormat df = DateFormat.getDateTimeInstance();
	DateFormat df = DateFormat.getDateTimeInstance( DateFormat.SHORT, DateFormat.MEDIUM );

	String color = null;
	String textColor = null;
	int messageCounter = 0;

	for(int i=0;i<h;i++) {
%>
  <tr>
<%
		for(int j=0;j<businessNode[i].length;j++) {
			String bgColor = "#fafad2";
			String stateColor = "#fafad2";
			if(businessNode[i][j] == null) {
%>
  <td></td><td></td>
<%
				continue;
			}
			String joint = null;
			String joint_img = null;
			if(businessNode[i][j].getJoint() == BusinessNode.JOINT_FIRST){
				joint = "T";
				joint_img = "images/joint_first.jpg";
			} else if(businessNode[i][j].getJoint() == BusinessNode.JOINT_SINGLE){
				joint = "--";
				joint_img = "images/joint_single.jpg";
			} else if(businessNode[i][j].getJoint() == BusinessNode.JOINT_MIDDLE){
				joint = "|-";
				joint_img = "images/joint_middle.jpg";
			} else if(businessNode[i][j].getJoint() == BusinessNode.JOINT_LAST){
				joint = "L";
				joint_img = "images/joint_last.jpg";
			} else if(businessNode[i][j].getJoint() == BusinessNode.JOINT_VERTICAL){
				joint = "|";
				joint_img = "images/joint_vertical.jpg";
			} else if(businessNode[i][j].getJoint() == BusinessNode.JOINT_NONE){
				// joint = "|";
				// joint_img = "images/joint_root.jpg";
				joint = "";
				joint_img = "images/joint_none.jpg";
			}


%>
  <td><img src="<%=joint_img%>"></td>
<%
			String nodeMessageCd = businessNode[i][j].getMessageCd();
			String nodeBusinessCd = businessNode[i][j].getBusinessCd();
			MasterCash mstCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
			if (mstCash == null) {
				mstCash = new MasterCash(locale);
			}
			String nodeBusinessName = mstCash.getNameFromBusinessCd(nodeBusinessCd);

			Message msg = businessNode[i][j].getMessage();
			Business biz = businessNode[i][j].getBusiness();
			if((msg==null && biz==null && nodeMessageCd == null && nodeBusinessCd == null)){
%>
  <td><br></td>
<%
			}else {
				int progressState = msg.getProgressState();
				String cancelState = "TEST";
				if ( msg == null ){
					progressState = 0;
				}
				if ( msg.getBusinessName() == null || msg.getBusinessName().length() == 0 ){
					progressState = 0;
				}
				boolean isSet = true;
				String state = null;
				if(progressState == 0){
					textColor = "black";
					stateColor = "black";
					color = "white";
					bgColor = "white";
					state = CoreTools.getRBString("Orteus.CoreMsg.N01703", rb);	// 未発行
					isSet = false;
				}else if(progressState==Message.PROGRESS_RECEPTION){//受信
					textColor = "black";
					stateColor = "black";
					color = "#CCCCFF";
					state = CoreTools.getRBString("Orteus.Common.N00010", rb);	// 受信
				}else if(progressState==Message.PROGRESS_REFERENCE){//参照
					textColor = "black";
					stateColor = "black";
					color = "YELLOWGREEN";
					state = CoreTools.getRBString("Orteus.Common.N00011", rb);	// 参照
				}else if(progressState==Message.PROGRESS_START){//開始
					textColor = "black";
					stateColor = "black";
					color = "YELLOW";
					state = CoreTools.getRBString("Orteus.Common.N00012", rb);	// 開始
				}else if(progressState==Message.PROGRESS_COMPLETION){//終了
					textColor = "black";
					stateColor = "black";
					color = "#c0c0c0";
					state = CoreTools.getRBString("Orteus.Common.N00013", rb);	// 完了
				}
				if ( isSet != false ){
					int dispLevel=0;
					if ( msg == null ){
					  dispLevel = 1;
					}else{
					  dispLevel = msg.getDisplayLevel();
					}
					//state=state+"：表示レベル="+dispLevel;
				}
%>
  <td>
    <table border="0" height="100">
      <tr><td valign="middle">
        <table border="1" width="100">
<%
	if ( cancelState != null ){
%>
          <tr><td nowrap align="center" bgcolor="#c0c0ff" valign="middle">
<%
	}else{
%>
          <tr><td nowrap align="center" bgcolor="#c0c0c0" valign="middle">
<%
	}
%>
        <%=MessageSetForm.setTable(msg.getSendExpression())%></td></tr>
        </table>
      </td><td valign="middle">
        <table border="1" width="200" height="100">
          <tr>
            <% // 業務名 %>
            <th nowrap width="30%" bgcolor="#263275"><font color="#ffffff"><%=CoreTools.getRBString("Orteus.CoreMsg.N01704", rb)%></font></th>
            <td nowrap width="70%" bgcolor=<%=bgColor%>><center><font color="<%=textColor%>"><%=MessageSetForm.setTable(nodeBusinessName)%></font></center></td>
          </tr>
<%
	if(msg != null || biz != null || nodeBusinessCd != null || nodeMessageCd != null){
%>
          <tr>
            <% // 発行日 %>
            <th nowrap width="30%" bgcolor="#263275"><font color="#ffffff"><%=CoreTools.getRBString("Orteus.CoreMsg.N01705", rb)%></font></th>
<%
	String sendDay = df.format(msg.getCreatedDate());
	if(progressState == 0){
		sendDay = "";
	}
	if ( cancelState != null ){
%>
            <td nowrap width="70%" bgcolor=<%=bgColor%>><font color="<%=textColor%>"><%=MessageSetForm.setTable(sendDay)%></font></td>
<%
	}else{
%>
            <td nowrap width="70%" bgcolor=<%=bgColor%>><font color="<%=textColor%>"><br></font></td>
<%
	}
%>
          </tr>
          <tr>
            <% // 状態 %>
            <th nowrap width="30%" bgcolor="#263275"><font color="#ffffff"><%=CoreTools.getRBString("Orteus.Common.N00016", rb)%></font></th>
            <td nowrap width="70%" bgcolor=<%=color%>><center><font color="<%=stateColor%>"><%=MessageSetForm.setTable(state)%></font></center></td>
            <br>
          </td>
         </tr>
<%
				messageCounter++;
	}else{
%>
         <tr>
           <% // 発行日 %>
           <th width="30%" bgcolor="#263275"><font color="#ffffff"><%=CoreTools.getRBString("Orteus.CoreMsg.N01705", rb)%></font></th>
           <td nowrap width="70%" bgcolor=<%=bgColor%>><BR></td>
         </tr>
       <tr>
         <% // 担当 %>
         <th width="30%" bgcolor="#263275"><font color="#ffffff"><%=CoreTools.getRBString("Orteus.CoreMsg.N01706", rb)%></font></th>
           <td></td>
<!--    <td nowrap width="70%" bgcolor=<%=bgColor%>><%//=model.getNameFromUserCd(msg.getPersonInCharge())%>(<%//=model.getNameFromBusinessGroupCd(msg.getBusinessGroupCd())%>)</td>-->
       </tr>
       <tr>
         <% // 状態 %>
         <th width="30%" bgcolor="#263275"><font color="#ffffff"><%=CoreTools.getRBString("Orteus.Common.N00016", rb)%></font></th>
         <td nowrap width="70%" bgcolor=<%=bgColor%>><center><%=MessageSetForm.setTable(state)%></center></td>
       </tr>
<%
	}
%>
      </table>
    </tr>
  </table>
  </td>
<%
			}
		}
%>
  </tr>
<%
	}
%>
</table>
<br>
<hr>
</center>
</body>
</html>
