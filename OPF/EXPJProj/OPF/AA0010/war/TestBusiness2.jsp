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

<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.net.*" %>

<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.core.*" %>

<html>
<head><title></title></head>
<body>

<%

// 2004/01/22 m-kusunoki ���ۉ��Ή�
String locale = null;
String charset = null;
ResourceBundle rb = null;

try {
	ManageContainer container = CoreTools.getContainer();
	Hashtable params = CoreTools.getParamsList(request);
	HttpSession so = null;
	so = request.getSession();
	if (so == null) {
		locale = CoreTools.getLocale(null);
		charset = CoreTools.getCharset(locale);
		rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

		response.setHeader("Content-Type", charset);
		response.setContentType(charset);
		%>
		<% // �Z�b�V�����؂� %>
		<%=CoreTools.getRBString("Orteus.Sample.E00201", rb)%><br>
		<%
	}
	else {
		locale = (String)so.getAttribute("LOCALE");
		charset = CoreTools.getCharset(locale);
		rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

		response.setHeader("Content-Type", charset);
		response.setContentType(charset);

		Business business = null;

		String startBusiness = TypeConverter.sanitizer(request.getParameter("startBusiness"));
		if (startBusiness != null) {
			String businessGroupCd = TypeConverter.sanitizer(request.getParameter("businessGroupCd"));
			String userCd = TypeConverter.sanitizer(request.getParameter("userCd"));
			String businessCd = TypeConverter.sanitizer(request.getParameter("businessCd"));
			String displayLevel = TypeConverter.sanitizer(request.getParameter("displayLevel"));
			String reference = TypeConverter.sanitizer(request.getParameter("reference"));
			String iraiNo = TypeConverter.sanitizer(request.getParameter("iraiNo"));

			Logger m_log = Logger.getLogger("com.nec.jp.orteus.xaf");
			if (m_log.isLoggable(Level.FINER)){
				out.println("businessGroupCd = " + businessGroupCd);
				out.println("userCd = " + userCd);
				out.println("businessCd = " + businessCd);
				out.println("displayLevel = " + displayLevel);
				out.println("reference = " + reference);
				out.println("iraiNo = " + iraiNo);
			}

			int level = 1;
			try {
			business = Business.getStartBusiness(businessGroupCd, userCd, businessCd);
				level = Integer.parseInt(displayLevel);
			}
			catch (Exception e) {
			}
			business.setMessageDisplayLevel(level);			// �\�����x��(�d�v�x)�̎w��
			business.setMessageReference(reference);		// ���l�̎w��

			String tableName = CoreTools.getRBString("Orteus.Common.N00035", rb);	// �̔������\���˗�
			String [] keyColumnName = new String[1];
			keyColumnName[0] = CoreTools.getRBString("Orteus.Common.N00020", rb);	// �˗��ԍ�
			MessageKey msgKey = new MessageKey(tableName,keyColumnName);
			msgKey.setKeyValue(CoreTools.getRBString("Orteus.Common.N00020", rb),iraiNo);	// �˗��ԍ�
			ArrayList msgKeyArray = new ArrayList();
			msgKeyArray.add(msgKey);
			business.setSendMessageKey(tableName, keyColumnName, msgKeyArray);

			business.complete();
		}

		business = Business.getCurrentBusiness(so,request);
		String complete = request.getParameter("complete");
		if (complete != null) {
			business.complete();
		}
		%>
		<% // �Ɩ����, �Ɩ��̏�� %>
		<h1><%=CoreTools.getRBString("Orteus.Sample.N00201", rb)%></h1><hr>
		<%=CoreTools.getRBString("Orteus.Sample.N00202", rb)%>
		<table>
		<tr>
			<th align="right">BusinessCd</th><td><%=business.getBusinessCd()%></td>
			<th align="right">BusinessGroupCd</th><td><%=business.getBusinessGroupCd()%></td>
		</tr>
		<tr>
			<th align="right">ContextNumber</th><td><%=business.getContextNumber()%></td>
			<th align="right">isCanDirectComplete</th><td><%=business.isCanDirectComplete()%></td>
		</tr>
		<tr>
			<th align="right">isCanSend</th><td><%=business.isCanSend()%></td>
			<th align="right">isComplete</th><td><%=business.isComplete()%></td>
		</tr>
		</table>
		<hr>
		<% // ��M���b�Z�[�W�L�[ %>
		<%=CoreTools.getRBString("Orteus.Sample.N00203", rb)%>
		<%
		ArrayList keyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_RECEIVE);
		if (keyTypeArray.size() == 0) {
			%>
			<% // �Ȃ� %>
			<br><%=CoreTools.getRBString("Orteus.Common.N00002", rb)%><br>
			<%
		}
		for(int keyTypeCount = 0; keyTypeCount < keyTypeArray.size();keyTypeCount++) {
			MessageKeyType keyType = (MessageKeyType)keyTypeArray.get(keyTypeCount);
			String tableName = keyType.getTableName();
			String [] keyColumnName = keyType.getKeyColumnName();
			%>
			<br><%=tableName%>
			<table border="1">
			<tr><%
			for(int keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
				%><th><%=keyColumnName[keyColumnCount]%></th><%
			}
			%></tr>
			<%
			ArrayList msgKeyArray = business.getRecieveMessageKey(tableName,keyColumnName);
			for(int msgKeyCount = 0; msgKeyCount < msgKeyArray.size(); msgKeyCount++) {
				%><tr><%
				MessageKey msgKey = (MessageKey)msgKeyArray.get(msgKeyCount);
				for(int keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
					String keyValue = msgKey.getKeyValue(keyColumnName[keyColumnCount]);
					%><td><%=keyValue%></td><%
				}
				%></tr><%
			}
			%></table><%
		}
		%>
		<hr>
		<% // ���M���b�Z�[�W�L�[ %>
		<%=CoreTools.getRBString("Orteus.Sample.N00204", rb)%><br>
		<%
		keyTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_SEND);
		if (keyTypeArray.size() == 0) {
			%>
			<% // �Ȃ� %>
			<br><%=CoreTools.getRBString("Orteus.Common.N00002", rb)%>
			<%
		}
		for(int keyTypeCount = 0; keyTypeCount < keyTypeArray.size();keyTypeCount++) {
			MessageKeyType keyType = (MessageKeyType)keyTypeArray.get(keyTypeCount);
			String tableName = keyType.getTableName();
			String [] keyColumnName = keyType.getKeyColumnName();

			String addFlag = request.getParameter("add");
			if (addFlag != null) {
				String keyTypeCountParam = request.getParameter("keyTypeCount");
				if (keyTypeCountParam != null) {
					try {
						int paramCount = Integer.parseInt(keyTypeCountParam);
						if (paramCount == keyTypeCount) {
							MessageKey msgKey = new MessageKey(tableName,keyColumnName);
							int keyColumnCount;
							for(keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
								String keyValue = request.getParameter("" + keyColumnCount);
								if (keyValue == null || keyValue.equals("")) {
									break;
								}
								msgKey.setKeyValue(keyColumnName[keyColumnCount],keyValue);
							}
							if (keyColumnCount >= keyColumnName.length) {
								ArrayList msgKeyArray = business.getSendMessageKey(tableName,keyColumnName);
								msgKeyArray.add(msgKey);
								business.setSendMessageKey(tableName,keyColumnName,msgKeyArray);
							}
							else { %>
								<% // �����͂̃L�[���ڂ�����܂��B %>
								<font color="red"><%=CoreTools.getRBString("Orteus.Sample.E00202", rb)%></font>
							<% }
						}
					}
					catch(Exception e) {
						out.println("Exception = " + e);
					}
				}
			}

			%>
			<form action="TestBusiness2.jsp" method="post">
			<%=tableName%>
			<table border="1">
			<tr><%
			for(int keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
				%><th><%=keyColumnName[keyColumnCount]%></th><%
			}
			%></tr>
			<%
			ArrayList msgKeyArray = business.getSendMessageKey(tableName,keyColumnName);
			for(int msgKeyCount = 0; msgKeyCount < msgKeyArray.size(); msgKeyCount++) {
				%><tr><%
				MessageKey msgKey = (MessageKey)msgKeyArray.get(msgKeyCount);
				for(int keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
					String keyValue = msgKey.getKeyValue(keyColumnName[keyColumnCount]);
					%><td><%=keyValue%></td><%
				}
				%></tr><%
			}
			%><tr><%
			for(int keyColumnCount = 0; keyColumnCount < keyColumnName.length; keyColumnCount++) {
				%><td><input type="text" name="<%=keyColumnCount%>"></td><%
			}
			%></tr>
			</table>
			<input type="hidden" name="MSG_CONTEXT_NO" value="<%=business.getContextNumber()%>">
			<input type="hidden" name="keyTypeCount" value="<%=keyTypeCount%>">
			<input type="submit" name="add" value="�ǉ�">
			</form>
			<%
		}
		%>
		<hr>
<%		Message message = business.getMessageFrom();
		if (message == null) {
			%>
			<% // ���̋Ɩ���ʂ͏�݃��j���[����N������܂����B, ���b�Z�[�W�̏��͂���܂���B %>
			<%=CoreTools.getRBString("Orteus.Sample.N00206", rb)%><br>
			<hr>
			<%=CoreTools.getRBString("Orteus.Sample.N00207", rb)%>
			<%
		}
		else { %>
			<% // ���̋Ɩ���ʂ̓��b�Z�[�W����N������܂����B, ���b�Z�[�W�̏�� %>
			<%=CoreTools.getRBString("Orteus.Sample.N00208", rb)%><br>
			<hr>
			<%=CoreTools.getRBString("Orteus.Sample.N00209", rb)%>
			<table>
			<tr>
				<th align="right">BusinessCd</th><td><%=message.getBusinessCd()%></td>
				<th align="right">BusinessName</th><td><%=message.getBusinessName()%></td>
			</tr>
			<tr>
				<th align="right">CreatedBy</th><td><%=message.getCreatedBy()%></td>
				<th align="right">CreatedDate</th><td><%=message.getCreatedDate()%></td>
			</tr>
			<tr>
				<th align="right">CreatedPrgNm</th><td><%=message.getCreatedPrgNm()%></td>
				<th align="right">DisplayLevel</th><td><%=message.getDisplayLevel()%></td>
			</tr>
			<tr>
				<th align="right">Limit</th><td><%=message.getLimit()%></td>
				<th align="right">LockState</th><td><%=message.getLockState()%></td>
			</tr>
			<tr>
				<th align="right">ManagesDataId</th><td><%=message.getManagesDataId()%></td>
				<th align="right">MessageCd</th><td><%=message.getMessageCd()%></td>
			</tr>
			<tr>
				<th align="right">MessageId</th><td><%=message.getMessageId()%></td>
				<th align="right">ModifyCount</th><td><%=message.getModifyCount()%></td>
			</tr>
			<tr>
				<th align="right">ParentMessageId</th><td><%=message.getParentMessageId()%></td>
				<th align="right">ProcessId</th><td><%=message.getProcessId()%></td>
			</tr>
			<tr>
				<th align="right">ProgressState</th><td><%=message.getProgressState()%></td>
				<th align="right">RecvExpression</th><td><%=message.getRecvExpression()%></td>
			</tr>
			<tr>
				<th align="right">Reference</th><td><%=message.getReference()%></td>
				<th align="right">SendExpression</th><td><%=message.getSendExpression()%></td>
			</tr>
			<tr>
				<th align="right">TransmittingBusinessCd</th><td><%=message.getTransmittingBusinessCd()%></td>
				<th align="right">TransmittingBusinessName</th><td><%=message.getTransmittingBusinessName()%></td>
			</tr>
			<tr>
				<th align="right">TransmittingGroupCd</th><td><%=message.getTransmittingGroupCd()%></td>
				<th align="right">TransmittingGroupName</th><td><%=message.getTransmittingGroupName()%></td>
			</tr>
			<tr>
				<th align="right">TransmittingUserCd</th><td><%=message.getTransmittingUserCd()%></td>
				<th align="right">TransmittingUserName</th><td><%=message.getTransmittingUserName()%></td>
			</tr>
			<tr>
				<th align="right">UpdatedBy</th><td><%=message.getUpdatedBy()%></td>
				<th align="right">UpdatedPrgNm</th><td><%=message.getUpdatedPrgNm()%></td>
			</tr>
			<tr>
				<th align="right">isComplete</th><td><%=message.isComplete()%></td>
				<th align="right">isDelete</th><td><%=message.isDelete()%></td>
			</tr>
			</table>
			<hr>
<%		} %>
		<form action="TestBusiness2.jsp" method="POST">
		<input type="hidden" name="MSG_CONTEXT_NO" value="<%=business.getContextNumber()%>">
		<% // �Ɩ��I�� %>
		<input type="submit" name="complete" value="<%=CoreTools.getRBString("Orteus.Common.N00036", rb)%>">
		</form>
		<hr>
		<%@include file="msgnext.jsp"%>

<%		if (message == null) { %>
			<form action="TestBusiness2.jsp" method="POST">
			<input type="hidden" name="MSG_CONTEXT_NO" value="<%=business.getContextNumber()%>">
			<table>
			<% // �Ɩ��O���[�v�R�[�h %>
			<tr><td><%=CoreTools.getRBString("Orteus.Sample.N00210", rb)%></td><td><input type="text" name="businessGroupCd" value="<%=business.getBusinessGroupCd()%>"></td></tr>
			<% // ���[�U�R�[�h %>
			<tr><td><%=CoreTools.getRBString("Orteus.Sample.N00211", rb)%></td><td><input type="text" name="userCd" value="<%=(String)so.getAttribute("UserId")%>"></td></tr>
			<% // �J�n�Ɩ��R�[�h %>
			<tr><td><%=CoreTools.getRBString("Orteus.Sample.N00212", rb)%></td><td><input type="text" name="businessCd" value="<%=business.getBusinessCd()%>"></td></tr>
			<% // �\�����x�� %>
			<tr><td><%=CoreTools.getRBString("Orteus.Sample.N00213", rb)%></td><td><input type="text" name="displayLevel" value="1"></td></tr>
			<% // ���l, ���l�ł���` %>
			<tr><td><%=CoreTools.getRBString("Orteus.Common.N00019", rb)%></td><td><input type="text" name="reference" value="<%=CoreTools.getRBString("Orteus.Sample.N00214", rb)%>"></td></tr>
			<% // �˗��ԍ� %>
			<tr><td><%=CoreTools.getRBString("Orteus.Common.N00020", rb)%></td><td><input type="text" name="iraiNo" value="1"></td></tr>
			<% // �J�n�Ɩ���complete() %>
			<tr><td colspan="2"><input type="submit" name="startBusiness" value="<%=CoreTools.getRBString("Orteus.Sample.N00215", rb)%>"></td></tr>
			</table>
			</form>
<%		}
	} %>

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
<body>
</html>
