<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.lang.*" %>
<%@ page import="java.io.ByteArrayOutputStream" %>
<%@ page import="java.io.PrintStream" %>

<%@ page import="com.nec.jp.orteus.msg.core.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>

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
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%
try {
%>
<center>
<script language="JavaScript">
function sendM(){
	document.frmMsgNext.MSG_CONTROL.value="send";
	return true;
}

function completeM(){
	document.frmMsgNext.MSG_CONTROL.value="complete";
	return true;
}

</script>

<%
// 2004/01/22 ���ۉ��Ή�
// function checkD() ��chkMessage.js�Ɉړ�
    String jsFileName = "chkMessage_" + locale + ".js";
%>
    <SCRIPT SRC="<%=jsFileName%>"></SCRIPT>

<%
	// 2004/02/06 ���ۉ��Ή� m-kasai
	String localeOrteusSysDic = (String)so.getAttribute("LOCALE");
	ResourceBundle rbOrteusSysDic = CoreTools.getResourceBundle("OrteusSysDic", localeOrteusSysDic);

	ManageContainer MsgContainer = CoreTools.getContainer();
	Hashtable MsgParams = CoreTools.getParamsList(request);
	HttpSession MsgSo = null;
	MsgSo = request.getSession();
	if ( MsgSo == null ){
		%><jsp:forward page="login.jsp"/><%
	}else{
		if ( MsgSo.getAttribute("UserId") == null ){
			%><jsp:forward page="login.jsp"/><%
		}
	}
	Business MsgBusiness = Business.getCurrentBusiness(MsgSo,request);
	Message messageFrom = MsgBusiness.getMessageFrom();
	NextMessage [] nextMessage = MsgBusiness.getNextMessage();

	String reference = "";
	if(messageFrom != null){
		reference = messageFrom.getReference();
	}
%>
<%
if(!MsgBusiness.isComplete()){
	//�Ȃɂ��\�����Ȃ�
}else if(!MsgBusiness.isCanSend() && MsgBusiness.isCanDirectComplete()){
	//��M���b�Z�[�W�������ł��邾��
%>
<form name="frmMsgNext" action="messageControl" method=POST>
<% // ���� %>
<input type="submit" value="<%=CoreTools.getRBString("Orteus.Common.N00013", rbOrteusSysDic)%>" name="B3" style="width:30%;height:30" onClick="return completeM();">
<input type="hidden" name="MSG_PG" value="send">
<input type="hidden" name="MSG_CONTROL" value="">
<input type="hidden" name="MSG_CONTEXT_NO" value="<%=MsgBusiness.getContextNumber()%>">
</form>
<%
}else if(!MsgBusiness.isCanSend() && !MsgBusiness.isCanDirectComplete()){
	//�Ȃɂ��\�����Ȃ�
}else{
%>
<% // �����b�Z�[�W���M %>
<%=CoreTools.getRBString("Orteus.CoreMsg.N01201", rbOrteusSysDic)%>
<form name="frmMsgNext" action="messageControl" method=POST>
<input type="hidden" name="MSG_PG" value="send">
<input type="hidden" name="MSG_CONTROL" value="">
<input type="hidden" name="MSG_CONTEXT_NO" value="<%=MsgBusiness.getContextNumber()%>">
<table border="1" cellpadding="0" cellspacing="0" width="80%">
  <tr>   
    <td width="8%" bgcolor="#9999CC">
      <% // ���� %>
      <p align="left"><b><%=CoreTools.getRBString("Orteus.CoreMsg.N01202", rbOrteusSysDic)%></b></p>
    </td>
    <td width="92%" colspan="5" bgcolor="#9999CC">
      <table border="0" cellpadding="0" cellspacing="1" width="100%">
<%
	int amari = 3 - nextMessage.length % 3;
	amari = amari % 3;

	for(int i=0;i<nextMessage.length;i++){
		if(i%3 == 0){
			%><tr><%
		}
		String MsgBusinessCd = nextMessage[i].getBusinessCd();
		String MsgBusinessName = nextMessage[i].getBusinessName();
		String [] MsgBusinessGroupCd = nextMessage[i].getBusinessGroupCd();
		String [] MsgBusinessGroupName = nextMessage[i].getBusinessGroupName();
		String messageCd = nextMessage[i].getMessageCd();
		String sendExpression = nextMessage[i].getSendExpression();
		String enableStr = null;


		if(nextMessage[i].isEnable() == true){
			enableStr = "ENABLED";
		}else{
			enableStr = "DISABLED";
		}
		String groupNameAll = "";
		for(int j=0;j<MsgBusinessGroupName.length;j++){
			if(j == 0){
				groupNameAll = MsgBusinessGroupName[j];
			}else{
				groupNameAll = groupNameAll + "," + MsgBusinessGroupName[j];
			}
		}

		if(!groupNameAll.equals("")){
			groupNameAll = "(" + groupNameAll + ")";
		}

		String selectedStr = null;
		if(nextMessage[i].isCandidate() == true){
			selectedStr = "CHECKED";
		}else{
			selectedStr = "";
		}
%>
          <td width="33%" bgcolor="#EEEEFF" NOWRAP>
			<table border=0 celpadding=0 cellspacing=0 width=100%>
			<tr>
			<td NOWRAP>
<%
		if(nextMessage[i].isEnable()){
%>
            <input type="checkbox" <%=selectedStr%>  <%=enableStr%> name="MSG_CB" value="<%=i%>">
<%
		}
		else if(nextMessage[i].isCandidate()){
%>
            <input type="checkbox" <%=selectedStr%>  <%=enableStr%> name="" value="<%=i%>">
            <input type="hidden" name="MSG_CB" value="<%=i%>">   
<%
		}
		else{
%>
            <input type="checkbox" <%=selectedStr%>  <%=enableStr%> name="" value="<%=i%>">
<%
		}
%>
            <input type="hidden" name="MSG_BUSINESS_CD_TO" value="<%=MessageSetForm.setInputType(MsgBusinessCd)%>">
            <input type="hidden" name="MSG_MESSAGE_CD" value="<%=MessageSetForm.setInputType(messageCd)%>">
            <%=MessageSetForm.setText(sendExpression)%><%=MessageSetForm.setText(groupNameAll)%>
			</td><td align=right NOWRAP>
<%
			String limit = nextMessage[i].getLimit();
			if(limit != null){
%>
                      <% // �[��, �� %>
	              <%=CoreTools.getRBString("Orteus.Common.N00015", rbOrteusSysDic)%><input type="text" name="MSG_LIMIT<%=i%>" size="4" maxlength="4" value="<%=MessageSetForm.setInputType(limit)%>"><%=CoreTools.getRBString("Orteus.CoreMsg.N01203", rbOrteusSysDic)%>
<%
			}
%>
			</td>
			</tr>
			</table>
          </td>
<%
		if(i%3 == 2){
			%></tr><%
		}
	}
%>
<%
if(amari != 0){
	for(int j=0;j<amari;j++){
%>
<td width=33% bgcolor="#EEEEFF" NOWRAP><br></td>
<%
	}
%>
</tr>
<%
}
%>

      </table>
    </td>
  </tr>
  <tr>
    <td width="8%" nowrap bgcolor="#9999CC">
      <p align="left"><b>LV</b></p>
    </td>
    <td width="7%" nowrap bgcolor="#EEEEFF">
        <select size="1" name="MSG_DISPLAY_LEVEL">
<%
		for(int i=1;i<=5;i++){
%>
	        <option><%=i%></option>
<%
		}
%>
        </select>    
    </td>    
    <td width="7%" nowrap bgcolor="#9999CC">
      <% // ���l %>
      <p align="left"><b><%=CoreTools.getRBString("Orteus.Common.N00019", rbOrteusSysDic)%></b></p>
    </td>    
    <td width="78%" nowrap bgcolor="#EEEEFF">
        <textarea rows="2" name="MSG_REFERENCE" style="width:100%"><%=MessageSetForm.setInputType(reference)%></textarea>
    </td>      
    <td width="15%" nowrap bgcolor="#EEEEFF">    
		<table celpadding=0 celspacing=0 border=0 width="100%">
		<tr>
<%
	if(MsgBusiness.isCanSend() && MsgBusiness.isCanDirectComplete()){
		//�����b�Z�[�W�����M�ł��A����M���b�Z�[�W�������ł���
%>
		<td NOWRAP>
          <% // ���M %>
          <input type="submit" value="<%=CoreTools.getRBString("Orteus.CoreMsg.N01204", rbOrteusSysDic)%>" name="B3" style="width:100%;height:30" onClick="return sendM() && checkD();">
		</td>
		<td NOWRAP>
          <% // ���� %>
          <input type="submit" value="<%=CoreTools.getRBString("Orteus.Common.N00013", rbOrteusSysDic)%>" name="B3" style="width:100%;height:30" onClick="return completeM();">
		</td>
<%
	}else if(MsgBusiness.isCanSend() && !MsgBusiness.isCanDirectComplete()){
		//�����b�Z�[�W�����M�ł���
%>
		<td NOWRAP>
          <% // ���M %>
          <input type="submit" value="<%=CoreTools.getRBString("Orteus.CoreMsg.N01204", rbOrteusSysDic)%>" name="B3" style="width:100%;height:30" onClick="return sendM() && checkD();">
		</td>
<%
	}else if(!MsgBusiness.isCanSend() && MsgBusiness.isCanDirectComplete()){
		//��M���b�Z�[�W�������ł���
%>
		<td NOWRAP>
          <% // ���� %>
          <input type="submit" value="<%=CoreTools.getRBString("Orteus.Common.N00013", rbOrteusSysDic)%>" name="B3" style="width:100;height:30" onClick="return completeM();">
		</td>
<%
	}
%>
		</tr>
		</table>
    </td>   
  </tr>   
</table>      
</form>
<%
}
%>
</center>
<%
}
catch (Exception e) {
	Logger m_log = Logger.getLogger("com.nec.jp.orteus.xaf");
	if (m_log.isLoggable(Level.FINER)){
		PrintWriter pw = pageContext.getResponse().getWriter();
		pw.println("<PRE>");
		e.printStackTrace(pw);
		pw.println("</PRE>");
	} else {
		// �ڍׂ̓��O�t�@�C�����Q�Ƃ��Ă�������
		out.print(CoreTools.getRBString("Orteus.CoreMsg.N00503", rb));
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(bs);
		e.printStackTrace(ps);
		m_log.log(Level.FINER, bs.toString());
	}
}
%>
