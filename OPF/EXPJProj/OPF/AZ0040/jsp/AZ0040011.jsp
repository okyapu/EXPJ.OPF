<%-- ********************************************************
  This file is generated
    GeneratedDate  : Fri Feb 17 10:25:16 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0040\AZ0040011.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0040.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>

<%
    HttpSession so = request.getSession(false);
    String locale = (String)so.getAttribute("LOCALE");
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);
    ResourceBundle rbs = CoreTools.getResourceBundle("OrteusSysDic", locale);

    response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
    response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>

<jsp:useBean id="aAZ0040010Control" class="com.nec.jp.orteus.metamorBase.AZ0040.AZ0040010Control" scope="request"/>
<jsp:useBean id="aAZ0040010Struct" class="com.nec.jp.orteus.metamorBase.AZ0040.AZ0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

>���������ݒ�
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0040/jsp/AZ0040011.jsp,v $
$Author: geng-jia $
$Revision: 1.15 $ $Date: 2017/02/22 02:06:31 $
********************************************************* --%>
<%@ page import="java.sql.Types" %>
<%@ page import="com.nec.jp.orteus.metamorBase.common01.util.Calculate" %>
<html>
<head>
<title>���������ݒ�</title>

<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">

<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--
// �����̃^�C�v �R���{�{�b�N�X�ύX������
function changeConditionType(seq)
{
	var fm = document.header;
	var type = fm.sub1COND_TYPE[seq].value;
	var val1 = fm.disp_sub1COND_VALUE1[seq];
	var val2 = fm.disp_sub1COND_VALUE2[seq];

	if(type == "<%=TypeConverter.sanitizer(AZ0040Const.C_RANG)%>"){
		applyEnable(val1);
		applyEnable(val2);
	}
	else if(type == "<%=TypeConverter.sanitizer(AZ0040Const.C_LIKE)%>" || type == "<%=TypeConverter.sanitizer(AZ0040Const.C_EQ)%>"
	|| type == "<%=TypeConverter.sanitizer(AZ0040Const.C_NE)%>" || type == "<%=TypeConverter.sanitizer(AZ0040Const.C_LT)%>"
	|| type == "<%=TypeConverter.sanitizer(AZ0040Const.C_GT)%>" || type == "<%=TypeConverter.sanitizer(AZ0040Const.C_LS)%>"
	|| type == "<%=TypeConverter.sanitizer(AZ0040Const.C_GR)%>" || type == "<%=TypeConverter.sanitizer(AZ0040Const.C_IN)%>"){
		applyEnable(val1);
		applyDisable(val2);
	}
	else{
		applyDisable(val1);
		applyDisable(val2);
	}
}
// -->
</script>

<script language="JavaScript">
<!--
// ���בւ��R���{�{�b�N�X�ύX������
function changeSortType(seq)
{
	var fm = document.header;
	var type = fm.sub1SORT_TYPE[seq].value;
	var sequence = fm.disp_sub1SORTKEY_PRI[seq];
	if(type == "<%=TypeConverter.sanitizer(AZ0040Const.C_ASC)%>" || type == "<%=TypeConverter.sanitizer(AZ0040Const.C_DESC)%>")
		applyEnable(sequence);
	else
		applyDisable(sequence);
}
// -->
</script>

<script language="JavaScript">
<!--
// ��ʕ\��������
function initialize()
{
	sizing();

	var fm = document.header;
	var n;
	for(n = 0; n < fm.LIST_SIZE.value; n++){
		// �����w��l�����בւ����̓��͉�/�s�ݒ�
		changeConditionType(n); changeSortType(n);

		// �T�[�o�ʐM�p�t�B�[���h����l�R�s�[
		fm.disp_sub1COND_VALUE1[n].value = fm.sub1COND_VALUE1[n].value;
		fm.disp_sub1COND_VALUE2[n].value = fm.sub1COND_VALUE2[n].value;
		if(fm.sub1DISPLAY_FLG[n].value == "true")
			fm.disp_sub1DISPLAY_FLG[n].checked = true;
		else
			fm.disp_sub1DISPLAY_FLG[n].checked = false;
		fm.disp_sub1SORTKEY_PRI[n].value = fm.sub1SORTKEY_PRI[n].value;
	}
}
// -->
</script>

<script language="JavaScript">
<!--
/* ���͍��ڂ̃T�C�Y�ݒ� */
function sizing()
{
	var fm = document.header;
	fm.QUERY_NAME.size = 100;
	fm.QUERY_GROUP.size = 50;
	fm.QUERY_MEMO.size = 100;
}
// -->
</script>

<script language="JavaScript">
<!--
/* �N�G���ꗗ�{�^���������̏��� */
function checkReturn()
{

	// �m�F���b�Z�[�W�o��
	if(displayConfirmMessage("AZ90001") != true) return false;

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* �Ώۍ��ڑI���A�t���[���̓{�^���������̏��� */
function checkSubmit()
{

	// �T�[�o�ʐM�p�t�B�[���h�ɒl�R�s�[
	disp2sendfield();

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* �������s�{�^���������̏��� */
function checkExecute()
{

	// ����OK?
	checkInputValue();
	if(displayErrorMessages() == true)  return false;

	// �T�[�o�ʐM�p�t�B�[���h�ɒl�R�s�[
	disp2sendfield();

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* ��ʓ��͒l��������? */
function checkInputValue()
{
	var fm = document.header;
	var size = fm.LIST_SIZE.value;
	var n, m, target;

	// �ݒ�l���͍�?
	for(n = 0; n < size; n++){
		target = fm.disp_sub1COND_VALUE1[n];
		if(target.disabled == false && target.value == ""){
			addErrorMessage("AZ00009"); break;
		}
		target = fm.disp_sub1COND_VALUE2[n];
		if(target.disabled == false && target.value == ""){
			addErrorMessage("AZ00009"); break;
		}
	}
	// ���ёւ������͒lOK?
	var valueOk = true;
	for(n = 0; n < size; n++){
		target = fm.disp_sub1SORTKEY_PRI[n];
		if(target.disabled == false && (target.value == "" || isInteger(target) == false || parseInt(target.value) <= 0)){
			addErrorMessage("AZ00010"); valueOk = false; break;
		}
	}
	// ���ёւ��� �����l�͂Ȃ�?
	if(valueOk != false){
		var current;
		var isOk;
		for(n = 0; n < size; n++){
			target = fm.disp_sub1SORTKEY_PRI[n];
			if(target.disabled == true) continue;
			current = target.value;
			isOk = true;
			for(m = n + 1; m < size; m++){
				target = fm.disp_sub1SORTKEY_PRI[m];
				if(target.disabled == true) continue;
				if(target.value == current){
					addErrorMessage("AZ00013"); isOk = false; break;
				}
			}
			if(isOk == false) break;
		}
	}
	// �\���`�F�b�N�{�b�N�X��1�ȏ�ON?
	var existOn = false;
	for(n = 0; n < size; n++){
		if(fm.disp_sub1DISPLAY_FLG[n].checked == true){
			existOn = true; break;
		}
	}
	if(existOn == false) addErrorMessage("AZ00012");
}
// -->
</script>

<script language="JavaScript">
<!--
/* �T�[�o�ʐM�p�t�B�[���h�ɉ�ʓ��͒l�R�s�[ */
function disp2sendfield()
{
	var n, target;
	var fm = document.header;
	for(n = 0; n < fm.LIST_SIZE.value; n++){
		target = fm.disp_sub1COND_VALUE1[n];
		if(target.disabled == true)
			fm.sub1COND_VALUE1[n].value = "";
		else
			fm.sub1COND_VALUE1[n].value = target.value;

		target = fm.disp_sub1COND_VALUE2[n];
		if(target.disabled == true)
			fm.sub1COND_VALUE2[n].value = "";
		else
			fm.sub1COND_VALUE2[n].value = target.value;

		if(fm.disp_sub1DISPLAY_FLG[n].checked == true)
			fm.sub1DISPLAY_FLG[n].value = "true";
		else
			fm.sub1DISPLAY_FLG[n].value = "false";

		target = fm.disp_sub1SORTKEY_PRI[n];
		if(target.disabled == true)
			fm.sub1SORTKEY_PRI[n].value = "";
		else
			fm.sub1SORTKEY_PRI[n].value = target.value;
	}
}
// -->
</script>

<script language="JavaScript">
<!--
function PreparLock(){ document.header.SUBMIT_BUTTON_TYPE.value=1; }

function PreparNoLock(){ document.header.SUBMIT_BUTTON_TYPE.value=0; }

// -->
</script>

<script language="JavaScript">
<!--
/**
 * disabled�̃X�^�C���K�p�B
 * @param �I�u�W�F�N�g
 */
function applyDisable(obj)
{
	obj.disabled = true;
	obj.style.backgroundColor = "#CCCCCC";
}

/**
 * disabled�̃X�^�C�������B
 * @param �I�u�W�F�N�g
 */
function applyEnable(obj)
{
	obj.disabled = false;
	obj.style.backgroundColor = "#FFFFFF";
}

// -->
</script>

<script language="JavaScript">
// �֐����͔C��
function exprSize() {

  // Flash�łƂ̐؂蕪���i�l��null�Ȃ��Flash�Łj
  var parentFrame = null;
  if (parent !== null && parent.document !== null) {
    parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0040010');
  }
  if (parentFrame === null) {
    return;
  }

  // IE��p����
  // isMSIE��isChrome�ɂ����Chrome��p�ɂȂ�
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE) {
    // �T�C�Y�����֐��̒�`
    var resizeFunc = function () {
      try {
        // �Ɩ���ʂɊ��蓖�Ă�ꂽ�t���[���^�O���擾
        var parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0040010');
        // �Ɩ���ʂɗ^����ꂽ�������擾
        var frameHeight = parentFrame.clientHeight;

        // �^����ꂽ��������Œ�ӏ��̍���������
        frameHeight -= document.getElementById('layoutRow1').offsetHeight;
        frameHeight -= document.getElementById('layoutRow3').offsetHeight;

        // �덷�����鎞�͍X�Ɉ���
        frameHeight -= 50;

        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
        document.getElementById('layoutRow2').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv2').setAttribute('style', 'height:' + frameHeight + 'px');
        // �����Ƀ^�O��style����������ꍇ�́A�ȉ��𗘗p����Ɗ�����style�����ɉe����^�����ɏC���ł���
        // $('#layoutRow2').css('height', frameHeight + 'px');
        // $('#layoutDiv2').css('height', frameHeight + 'px');

      } catch (e) {
        // �G���[�����������炱���ŃL���b�`�����B
      }
    }; 
    
    // 1��֐����Ăяo���ă��C�A�E�g�𒲐�����
    resizeFunc();

    // ���łɓo�^���Ă���window�T�C�Y�ύX�C�x���g�֐����폜
    $(window).off('resize.' + 'AZ0040010');
    // window�T�C�Y�ύX�C�x���g�֐���o�^
    $(window).on('resize.' + 'AZ0040010', resizeFunc);
    
  } else if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
      // form�^�O��margin-bottom���C��
      $('form').css('margin-bottom', '0px');
  }

}
</script>

<%-- ********** Generated section begin ********** --%>
<script language="javascript">
function executeSubmit(formobj) {
  return(true);
}
</script>
<meta http-equiv="X-UA-Compatible" content="IE=5" />
<script language="JavaScript" src="common/html5_message.js"></script>
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + CoreTools.getCharset(locale)%>">
<%-- ********** Generated section end ********** --%>
</head>

<body onLoad="initialize();loadComplete();exprSize()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0040010" data-noFlash="true" data-screenId="AZ0040010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<form name="header" method="post" action="AZ0040010Servlet">

	<%
		//��ʕ\���p Struct
		aAZ0040010Struct = null;
		aAZ0040010Struct=(AZ0040010Struct)aAZ0040010Control.getSelStruct();
	%>
<table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<!--- ��i --->
<tr id="layoutRow1">
  <td>
<%
	AZ0040010Struct currentQuery = aAZ0040010Control.getSelStruct();
	// �N�G����/����/�T�v�����ꂩ�ݒ肪����Ε\��
	if(currentQuery.getQUERY_NAME() != null || currentQuery.getQUERY_GROUP() != null || currentQuery.getQUERY_MEMO() != null){
%>
    <table border="0" width="100%">
      <tr> 
        <td width="120" class="name"><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></td>
        <td>
          <input type="text" name="QUERY_NAME" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_NAME()) %>">
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></td>
        <td>
          <input type="text" name="QUERY_GROUP" size="50" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_GROUP()) %>">
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
        <td> 
          <input type="text" name="QUERY_MEMO" size="100" class="readonly" readonly value="<%= TypeConverter.sanitizer(currentQuery.getQUERY_MEMO()) %>">
        </td>
      </tr>
      <tr> 
        <td colspan="3"> <hr></td>
      </tr>
    </table>
<%	}
	// �^�C�g������̂Ƃ��� �_�~�[�̓��͈��z�u
	else{ %>
      <input type="hidden" name="QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_NAME()) %>">
      <input type="hidden" name="QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_GROUP()) %>">
      <input type="hidden" name="QUERY_MEMO" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getQUERY_MEMO()) %>">
<%	} %>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<!--- ���i --->
<tr id="layoutRow2">
  <td height="100%">
    <div class="center" id="layoutDiv2">
      <table class="outer" cellspacing=0 cellpadding=0><tr><td>
        <table cellspacing="1" cellpadding="3">
          <tr class="header"> 
            <td><%=CoreTools.getRBString("Expj.TABLE_NAME",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0068",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.VALUE_1",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0023",rb)%></td>
            <td><%=CoreTools.getRBString("Expj.Cmt0069",rb)%></td>
          </tr>
<%
	List list = aAZ0040010Control.getColumnList();
%>
	<input type="hidden" name="LIST_SIZE" value="<%= list.size() %>">
<%
	for(int cnt = 0; cnt < list.size(); cnt++)
	{ 
		aAZ0040010Struct = (AZ0040010Struct)list.get(cnt);
%>

          <tr class="rows">
            <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1TABLE_NAME_COMMENT()) == null ? null : TypeConverter.sanitizer(aAZ0040010Struct.getsub1TABLE_NAME_COMMENT()).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1TABLE_NAME()) %></orlabel>]</td>
            <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1COLUMN_NAME()) %></orlabel></td>
            <td><%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1COLUMN_NAME_COMMENT()) == null ? null : TypeConverter.sanitizer(aAZ0040010Struct.getsub1COLUMN_NAME_COMMENT()).replaceAll(" ","&nbsp;") %><input type="hidden" name="sub1COLUMN_TYPE" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1COLUMN_TYPE()) %>"></td>
            <td><select name="sub1COND_TYPE" onChange='<%= "changeConditionType(" + cnt + ")" %>'>
<%
  if(aAZ0040010Control.getStruct().getList_sub1COND_TYPE_name() != null &&
     aAZ0040010Control.getStruct().getList_sub1COND_TYPE_val() != null ) {
    for(int i = 0, size = aAZ0040010Control.getStruct().getList_sub1COND_TYPE_name().size(); i < size; ++i ) {
      String name = (String)aAZ0040010Control.getStruct().getList_sub1COND_TYPE_name().get(i);
      String val = TypeConverter.convert((String)aAZ0040010Control.getStruct().getList_sub1COND_TYPE_val().get(i));
%>
<option value="<%= val %>" <%= (val!=null && val.equals(TypeConverter.convert(aAZ0040010Struct.getsub1COND_TYPE())))? "selected" : ""%>><%= name %></option>
<%
    }
  }
%>
</select></td>
            <td>
<%	if(false){ %>
              <input type="text" name="disp_sub1COND_VALUE1" style="text-align:right"><%=CoreTools.getRBString("Expj.Cmt0043",rb)%>
              <input type="text" name="disp_sub1COND_VALUE2" style="text-align:right">
<%	} else { %>
              <input type="text" name="disp_sub1COND_VALUE1"><%=CoreTools.getRBString("Expj.Cmt0043",rb)%>
              <input type="text" name="disp_sub1COND_VALUE2">
<%	} %>
              <input type="hidden" name="sub1COND_VALUE1" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1COND_VALUE1()) %>">
              <input type="hidden" name="sub1COND_VALUE2" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1COND_VALUE2()) %>">
            </td>
            <td align="center"> 
              <input type="checkbox" name="disp_sub1DISPLAY_FLG">
              <input type="hidden" name="sub1DISPLAY_FLG" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1DISPLAY_FLG()) %>">
            </td>
            <td>
              <select name="sub1SORT_TYPE" onChange='<%= "changeSortType(" + cnt + ")" %>'>
<%
  if(aAZ0040010Control.getStruct().getList_sub1SORT_TYPE_name() != null &&
     aAZ0040010Control.getStruct().getList_sub1SORT_TYPE_val() != null ) {
    for(int i = 0, size = aAZ0040010Control.getStruct().getList_sub1SORT_TYPE_name().size(); i < size; ++i ) {
      String name = (String)aAZ0040010Control.getStruct().getList_sub1SORT_TYPE_name().get(i);
      String val = TypeConverter.convert((String)aAZ0040010Control.getStruct().getList_sub1SORT_TYPE_val().get(i));
%>
<option value="<%= val %>" <%= (val!=null && val.equals(TypeConverter.convert(aAZ0040010Struct.getsub1SORT_TYPE())))? "selected" : ""%>><%= name %></option>
<%
    }
  }
%>
</select>
              <input type="text" name="disp_sub1SORTKEY_PRI" size="3" maxlength="2" style="text-align:right">
              <input type="hidden" name="sub1SORTKEY_PRI" value="<%= TypeConverter.sanitizer(aAZ0040010Struct.getsub1SORTKEY_PRI()) %>">
            </td>
          </tr>
	  <% } %>
          </table>
        </td>
      </tr>
      </table>
    </div>
  </td>
</tr>
<% // �K���z��A�N�Z�X���\�Ȃ悤�� �_�~�[ %>
<input type="hidden" name="sub1COND_TYPE">
<input type="hidden" name="disp_sub1COND_VALUE1">
<input type="hidden" name="disp_sub1COND_VALUE2">
<input type="hidden" name="sub1COND_VALUE1">
<input type="hidden" name="sub1COND_VALUE2">
<input type="hidden" name="disp_sub1DISPLAY_FLG">
<input type="hidden" name="sub1DISPLAY_FLG">
<input type="hidden" name="sub1SORT_TYPE">
<input type="hidden" name="disp_sub1SORTKEY_PRI">
<input type="hidden" name="sub1SORTKEY_PRI">
<!----------------------------------------------------------------------------->
<!--- ���i --->
<tr id="layoutRow3">
  <td height="50" width="100%">
    <table height="50" width="100%">
      <tr> 
        <td height="30"><hr></td>
      </tr>
      <tr>
        <td height="30" align="right">
          <input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
          <input type="submit" name="sub1execute" value='<%=CoreTools.getRBString("Expj.BtnExcuteQuery",rb)%>' class="button" onClick="return checkExecute();">
          <input type="submit" name="sub1clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
          <input type="submit" name="sub1return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
        </td>
      </tr>
    </table>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<% MessageStruct msgStruct = aAZ0040010Control.getMessage(); %>
<%@ include file="common/SetServerMessage.jsp" %>
</table>
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div>
<script class="expj-script-AZ0040010-noflash-console-message">
function getExpjNoFlashPageConsoleMessage() {
  return '<%=messageString %>';
}
(function () {
  var message = getExpjNoFlashPageConsoleMessage();
  if (message !== '') {
    // �R���\�[���o��
    parent.expj.common.setScreenFrameConsoleMessage(message);
  }
  parent.expj.common.controlLoadingScreen(false);
  _expj_screen_move_convert();
  
  var forms = document.getElementsByTagName('form');
  for (var formElement in forms) {
    var ele = forms[formElement];
    forms[formElement].onsubmit = function () {
      parent.expj.common.controlLoadingScreen(true);
    };
  }
})();
</script>
</body>
</html>
