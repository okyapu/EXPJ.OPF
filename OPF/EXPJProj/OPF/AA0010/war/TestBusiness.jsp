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

<% //waTool(logging)�֘A watool.jar�K�{%>
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

	try{
%>

<%
	ManageContainer container = CoreTools.getContainer();
	Hashtable param = CoreTools.getParamsList(request);
	HttpSession so = null;
	so = request.getSession();
	if ( so == null ){
		%><jsp:forward page="init.jsp"/><%
	}
%>

<%
//-------------------------------------------------------
// 2004/01/22 m-kusunoki ���ۉ��Ή�
	locale = (String)so.getAttribute("LOCALE");
	charset = CoreTools.getCharset(locale);
	rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", charset);
	response.setContentType(charset);
%>

<html>
<head>
    <META HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
    <META HTTP-EQUIV="expires" CONTENT="0">
    <META HTTP-EQUIV="cache-control" CONTENT="no-cache">
</head>
<% // �Ɩ���ʂł� %>
<%=CoreTools.getRBString("Orteus.Sample.N00101", rb)%><br>

	<%
	Business business = Business.getCurrentBusiness(so,request);
	ArrayList msgTypeArray = business.getMessageKeyType(Business.MSGKEY_TYPE_CAN_SEND);
	%>
	  <% // ���M�o���郁�b�Z�[�W�L�[�� %>
	  <%=CoreTools.getRBString("Orteus.Sample.N00102", rb)%><br>
	<%
	if(msgTypeArray.size()==0){
		%>
		  <% // ����܂��� %>
		  <%=CoreTools.getRBString("Orteus.Sample.N00103", rb)%>
		<%
	}
	%><table border=1 bgcolor="bisque"><%
	for(int i=0;i<msgTypeArray.size();i++){
		MessageKeyType msgKeyType = (MessageKeyType)msgTypeArray.get(i);
		String tTableName = msgKeyType.getTableName();
		String [] tColName = msgKeyType.getKeyColumnName();
		for(int j=0;j<tColName.length;j++){
			%>
			<% // �e�[�u����, �J������ %>
			<tr><th><%=CoreTools.getRBString("Orteus.Sample.N00104", rb)%>:<%=tTableName%></th><th><%=CoreTools.getRBString("Orteus.Sample.N00113", rb)%>:<%=tColName[j]%></th></tr>
		<%
		}
	}
	%></table>

	<% // �e���b�Z�[�W�̑��M������ %>
	<br><%=CoreTools.getRBString("Orteus.Sample.N00105", rb)%><br><%
	MasterCash mstCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
	IDbConnection conn = CoreTools.getDefaultConnection();
	String businessCd = business.getBusinessCd();
	SqlSelect ss = new SqlSelect("BUSINESS_RELATION_MST");
	ss.addKey("BUSINESS_CD_FROM",businessCd);
	ss.execute(conn);

	%><table border=1>
	<% // ��Ɩ�, ���b�Z�[�W, ���M���� %>
	<th><%=CoreTools.getRBString("Orteus.Sample.N00106", rb)%></th><th><%=CoreTools.getRBString("Orteus.Common.N00006", rb)%></th><th>SQL</th><th><%=CoreTools.getRBString("Orteus.Sample.N00107", rb)%></th><%
	while(ss.next()){
		String mCd = ss.getString("MESSAGE_CD");
		String mCond = ss.getString("CONDITION");
		String mBusinessTo = ss.getString("BUSINESS_CD_TO");
		String mSendMethod = ss.getString("SEND_METHOD");
		if(mCond == null){
			mCond = CoreTools.getRBString("Orteus.Common.N00002", rb);	// �Ȃ�
		}
		%><tr><td><%=mBusinessTo%></td><td><%=mstCash.getSendExpression(mCd)%></td><td><%=mCond%></td><td><%=mSendMethod%></td></tr><%
	}
	%></table><%
	ss.close();
	ss = null;

	URLDecoder dec = new URLDecoder();
	ArrayList paramCol = new ArrayList();
	ArrayList valCol = new ArrayList();
	String tableName = (String)request.getParameter("TEST_TABLE_NAME");
	if(tableName != null){
		out.println("tableName="+tableName);
		tableName = dec.decode(tableName);
	}

	for(int i=1;i<=3;i++){
		String colNameTemp = request.getParameter("TEST_COL_NAME" + i);
		String valueTemp = request.getParameter("TEST_VALUE" + i);
			
		if(colNameTemp != null && !colNameTemp.equals("")){
			colNameTemp = dec.decode(colNameTemp);
			if(valueTemp != null && !valueTemp.equals("")){
				valueTemp = dec.decode(valueTemp);
			}else{
				valueTemp = "";
			}
			paramCol.add(colNameTemp);
			valCol.add(valueTemp);
		}
	}

	String [] colName = new String[paramCol.size()];
	String [] value = new String[paramCol.size()];

	for(int i=0;i<paramCol.size();i++){
		colName[i] = (String)paramCol.get(i);
		value[i] = (String)valCol.get(i);
	}


	if(tableName != null && !tableName.equals("") && colName != null && value != null){
out.println("���b�Z�[�W�L�[���Z�b�g���܂����B");
		MessageKey msgKey = null;
//		ArrayList msgArray = new ArrayList();
		ArrayList msgArray = business.getSendMessageKey(tableName,colName);
		msgKey = new MessageKey(tableName,colName);
		for(int i=0;i<colName.length;i++){
			if(value[i] != null){
				int max = value[i].length();
				if(value[i].lastIndexOf("[") == 0 && value[i].indexOf("]") == max-1){
					msgKey.setKeyValue(colName[i],value[i].substring(1,max-1));
				}else{
					msgKey.setKeyValue(colName[i],Integer.parseInt(value[i]));
				}
			}
			else{
//				msgKey.setKeyValue(colName[i],"");
			}
		}
		msgArray.add(msgKey);
		business.setSendMessageKey(tableName,colName,msgArray);
	}

	Hashtable keyHash = business.m_msgKeyHash;
	%>
	<% // ���݃Z�b�g����Ă��郁�b�Z�[�W�L�[�� %>
	<hr><%=CoreTools.getRBString("Orteus.Sample.N00109", rb)%><br>
	<%
	if(keyHash.size()==0){
		%>
		<% // ����܂��� %>
		<%=CoreTools.getRBString("Orteus.Sample.N00103", rb)%>
		<%
	}
	else{
		Enumeration enum = keyHash.elements();
		int count = 0;
		while(enum.hasMoreElements()){
			ArrayList ar = (ArrayList)enum.nextElement();
			for(int i=0;i<ar.size();i++){
				%><table border=1><%
				MessageKey kekkaMsgKey = (MessageKey)ar.get(i);
				String mTableName = kekkaMsgKey.getTableName();
				String [] mColName = kekkaMsgKey.getKeyColumnName();
				String th = "<th bgcolor=skyblue>(T)" + mTableName + "</th>";
				String td = "<td bgcolor=skyblue>(T)" + mTableName + "</td>";
				ss = new SqlSelect(mTableName);
				String [] hkeyValue = new String[mColName.length];
				String [] hkeyType = new String[mColName.length];
				for(int j=0;j<mColName.length;j++){
					hkeyValue[j] = kekkaMsgKey.getKeyValue(mColName[j]);
					hkeyType[j] = kekkaMsgKey.getKeyDataType(mColName[j]);
					ss.addKey(mColName[j],hkeyValue[j]);
					th = th + "<th>" + mColName[j] + "(" + hkeyType[j] + ")</th>";
					td = td + "<td>" + hkeyValue[j] + "</td>";
				}
				ss.execute(conn);
				IDbRecordset rec = ss.getRecordset();
				if(!rec.next()){
					%>
					<% // ���R�[�h�����݂��܂��� %>
					<tr><%=th%><th></th></tr><tr><%=td%><td><%=CoreTools.getRBString("Orteus.Sample.E00101", rb)%></td></tr></table><br>
					<%
					break;
				}
				String [] hColName = new String[rec.getColSize()];
				String [] hValue = new  String[rec.getColSize()];
				for(int j=mColName.length+1;j<=rec.getColSize();j++){
					th = th + "<th>" + rec.getColName(j) + "</th>";
					td = td + "<td>" + rec.getString(j) + "</td>";
				}

				%><tr><%=th%></tr><tr><%=td%></tr></table><br><%
				rec.close();
				ss.close();
				ss = null;
			}
		}
	}
	CoreTools.closeDefaultConnection(conn);

	String compStr = request.getParameter("COMPLETE");
	if(compStr != null && compStr.equals("1")){
		business.setMessageReference(CoreTools.getRBString("Orteus.Sample.N00110", rb));	// �����@�Α�
		business.setMessageDisplayLevel(5);
		business.complete();
	}


%>
<form action="TestBusiness.jsp" method=POST>
<hr>
<% // ���b�Z�[�W�L�[�̃Z�b�g, �l���͎��̒��ӁF�����^��[]�ň͂ށB���l�͂��̂܂ܓ��� %>
<%=CoreTools.getRBString("Orteus.Sample.N00111", rb)%><br>
<%=CoreTools.getRBString("Orteus.Sample.N00112", rb)%><br>
<table border=1 bgcolor="bisque">
<tr>
<% // �e�[�u����, �̔������\���˗� %>
<td colspan=2><%=CoreTools.getRBString("Orteus.Sample.N00104", rb)%><input type="text" name="TEST_TABLE_NAME" value="<%=CoreTools.getRBString("Orteus.Common.N00035", rb)%>" size="50"></td>
</tr>
<tr>

<% // �J������, �˗��ԍ�, �l %>
<td><%=CoreTools.getRBString("Orteus.Sample.N00113", rb)%>�P<input type="text" name="TEST_COL_NAME1" value="<%=CoreTools.getRBString("Orteus.Common.N00020", rb)%>"></td>
<td><%=CoreTools.getRBString("Orteus.Sample.N00114", rb)%>�P<input type="text" name="TEST_VALUE1" value=""></td>
</tr>

<% // �J������, �l %>
<tr>
<td><%=CoreTools.getRBString("Orteus.Sample.N00113", rb)%>�Q<input type="text" name="TEST_COL_NAME2" value=""></td>
<td><%=CoreTools.getRBString("Orteus.Sample.N00114", rb)%>�Q<input type="text" name="TEST_VALUE2" value=""></td>
</tr>

<% // �J������, �l %>
<tr>
<td><%=CoreTools.getRBString("Orteus.Sample.N00113", rb)%>�R<input type="text" name="TEST_COL_NAME3" value=""></td>
<td><%=CoreTools.getRBString("Orteus.Sample.N00114", rb)%>�R<input type="text" name="TEST_VALUE3" value=""></td>
</tr>
</table>

<% // ���b�Z�[�W�L�[�̃Z�b�g %>
<input type="submit" value="<%=CoreTools.getRBString("Orteus.Sample.N00111", rb)%>">
<input type="hidden" name="MSG_CONTEXT_NO" value="<%=business.getContextNumber()%>">
</form>
<hr>
<form action="TestBusiness.jsp" method=POST>

<% // �Ɩ��I�� %>
<input type="submit" value="<%=CoreTools.getRBString("Orteus.Common.N00036", rb)%>�iComplete�j">
<input type="hidden" name="COMPLETE" value="1">
<input type="hidden" name="MSG_CONTEXT_NO" value="<%=business.getContextNumber()%>">
</form>
<hr>
<%@include file="msgnext.jsp"%>

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

</body>
</HTML>
