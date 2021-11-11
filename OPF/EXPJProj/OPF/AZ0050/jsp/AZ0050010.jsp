<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:44:36 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050010.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0050.*" %>
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

<jsp:useBean id="aAZ0050010Control" class="com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Control" scope="request"/>
<jsp:useBean id="aAZ0050010Struct" class="com.nec.jp.orteus.metamorBase.AZ0050.AZ0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

>��ʌ���
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050010.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:06:32 $
********************************************************* --%>
<html>
<head>

<title>��ʌ���</title>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">
<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--
/* �N�����`���`�F�b�N���� */
function checkDateType(){

	var bRet = true;

	//�N�����̓`�F�b�N �J�n��
	if(isNull(document.header.w_CREATED_DATE_FROM) == false){
		var vObjDate = document.header.w_CREATED_DATE_FROM;
		var vValDate =	document.header.w_CREATED_DATE_FROM.value;
		vObjDate.value = vObjDate.value;
		//�N�����`���`�F�b�N
		if( isDate(vObjDate) == false ){
			bRet = false;
		}
		document.header.w_CREATED_DATE_FROM.value = vValDate;
  }

	//�N�����̓`�F�b�N �I����
	if(isNull(document.header.w_CREATED_DATE_TO) == false){
		var vObjDate = document.header.w_CREATED_DATE_TO;
		var vValDate =	document.header.w_CREATED_DATE_TO.value;
		vObjDate.value = vObjDate.value;
		//�N�����`���`�F�b�N
		if( isDate(vObjDate) == false ){
			bRet = false;
		}
		document.header.w_CREATED_DATE_TO.value = vValDate;
  }

	return bRet;
}
// -->
</script>

<script language="JavaScript">
<!--
/* �N�����̊J�n�E�I�� ���փ`�F�b�N���� */
function checkDateSokan()
{
	var fm = document.header;
	//�J�n�ƏI���̎w�肪����ꍇ�́A�`�F�b�N����B
	if(isNull(fm.w_CREATED_DATE_FROM) == false && isNull(fm.w_CREATED_DATE_TO) == false){
		if(Date.parse(fm.w_CREATED_DATE_FROM.value) > Date.parse(fm.w_CREATED_DATE_TO.value))
		      return false;
	}
	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* �Ǎ��{�^���������̏��� */
function checkSelect()
{

	// �N�����`���`�F�b�N
	if(checkDateType() == false){
		addErrorMessage("ZZ05007");
	}
	if(displayErrorMessages() == true){
		// �G���[�o��
		return false;
	}

	// �N�������փ`�F�b�N
	if(checkDateSokan() == false){
		addErrorMessage("ZZ05101");
	}
	if(displayErrorMessages() == true){
		// �G���[�o��
		return false;
	}

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();
	
	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* �Ǎ��ς݃`�F�b�N */
function checkFinishSelect()
{
	//�Ǎ��`�F�b�N
	if(document.header.h_MODE.value == "select"){
		return true;
	}

    if (document.header.h_MODE.value == "normal") {
		//���Ǎ��G���[
		displayErrorMessage("ZZ01114");
	} else if(document.header.h_MODE.value == "select_war"){
		//�Ώۃf�[�^�Ȃ��G���[
		displayErrorMessage("ZZ06001");
	}
	return false;
}

function checkFinishSelect2()
{
	if((document.header.h_MODE.value == "select") || 
	   (document.header.h_MODE.value == "select_war")) {
		return true;
	}
	//���Ǎ��G���[
	displayErrorMessage("ZZ01114");
	return false;
}

// -->
</script>

<script language="JavaScript">
<!--
/* �s�폜�{�^���������̏��� */
function checkDelete()
{

	// �Ǎ����s��?
	if(checkFinishSelect() == false) return false;

	// �m�F���b�Z�[�W�o��
	if(displayConfirmMessage("ZZ07007") != true){
		return false;
	}

	// submit�σt���O ON
	prepareSubmit();
	PreparLock();

	return true;
}
// -->
</script>


<script language="JavaScript">
<!--
/* �s�C��(�t���[)�A�s����(�t���[)�A�������s�A�t���[���́A�Ɩ��O���[�v�ݒ�{�^���������̏��� */
function checkSubmit()
{

	// �Ǎ����s��?
	if(checkFinishSelect() == false) return false;

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>


<script language="JavaScript">
<!--
/* �s�C��(�f�t�h)�A�s����(�f�t�h)�A���������ݒ�{�^���������̏��� */
function checkSubmit2()
{
	var fm = document.header;

	// �Ǎ����s��?
	if(checkFinishSelect() == false) return false;

	// �I�������N�G�����f�t�h���`�F�b�N
	if (<%= aAZ0050010Control.getListsize() %> == 1) {
		if(fm.r_Btn.checked == true){
			if(fm.EDIT_TYP.value != <%= TypeConverter.sanitizer(AZ0050Const.C_INPUT_GUI) %> ){
				displayErrorMessage("AZ00017"); return false;
			}
		}

	} else {
		for( n=0; n< <%= aAZ0050010Control.getListsize() %> ; n++ ){
			if(fm.r_Btn[n].checked == true){
				if(fm.EDIT_TYP[n].value != <%= TypeConverter.sanitizer(AZ0050Const.C_INPUT_GUI) %> )	{
					displayErrorMessage("AZ00017"); return false;
				}
			}
		}
	}
	
	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* �s�ǉ�(�f�t�h)�A�s�ǉ�(�t���[)���̏��� */
function checkSubmit3()
{

	// �Ǎ����s��?
	if(checkFinishSelect2() == false) return false;

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* ���ʃ`�F�b�N */
function checkCommon()
{
	return true;
}
// -->
</script>

<script language="JavaScript">
<!--
/* ��ʕ\�������� */
function initialize()
{
	sizing();
}
// -->
</script>

<script language="JavaScript">
<!--
/* ���͍��ڂ̃T�C�Y�ݒ� */
function sizing()
{
	var fm = document.header;
	fm.w_QUERY_NAME.size = 100;
	fm.w_QUERY_GROUP.size = 50;
	fm.w_MEMO.size = 100;
	fm.w_CREATED_BY.size = 45;				    // �쐬��

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
// �֐����͔C��
function exprSize() {

  // Flash�łƂ̐؂蕪���i�l��null�Ȃ��Flash�Łj
  var parentFrame = null;
  if (parent !== null && parent.document !== null) {
    parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0050010');
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
        var parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0050010');
        // �Ɩ���ʂɗ^����ꂽ�������擾
        var frameHeight = parentFrame.clientHeight;

        // �^����ꂽ��������Œ�ӏ��̍���������
        frameHeight -= document.getElementById('layoutRow1').offsetHeight;
        frameHeight -= document.getElementById('layoutRow3').offsetHeight;
        frameHeight -= document.getElementById('layoutRow4').offsetHeight;
        frameHeight -= document.getElementById('layoutRow5').offsetHeight;
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
    $(window).off('resize.' + 'AZ0050010');
    // window�T�C�Y�ύX�C�x���g�֐���o�^
    $(window).on('resize.' + 'AZ0050010', resizeFunc);
    
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

<body onLoad="sizing();loadComplete();exprSize();"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0050010" data-noFlash="true" data-screenId="AZ0050010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>

<form name="header" method="post" action="AZ0050010Servlet">

  <!-- ��ʃ��[�h�t���O�ێ��p -->
	<input type="hidden" name="h_MODE" value="<%= TypeConverter.sanitizer(aAZ0050010Control.getMode()) %>">
  <!-- �����{�^����ʕێ��p -->
	<input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
  <!-- �E�B���h�E�N���[�Y���� -->
	<script language="JavaScript">
		if(document.header.h_MODE.value == "close"){
			close();
		}
	</script>

	<%
		//��ʕ\���p Struct
		aAZ0050010Struct = null;
		aAZ0050010Struct=(AZ0050010Struct)aAZ0050010Control.getKeyStruct();
	%>

  <table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<tr id="layoutRow1">
  <td> 
    <table border="0" width="100%">
      <tr>
        <td class="name" nowrap><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></td>
        <td colspan="2">
            <input type="text" name="w_QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getw_QUERY_NAME()) %>">
            <%=CoreTools.getRBString("Expj.Cmt0002",rb)%>
        </td>
      </tr>
      <tr> 
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></td>
        <td colspan="2">
          <input type="text" name="w_QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getw_QUERY_GROUP()) %>">
          <%=CoreTools.getRBString("Expj.Cmt0002",rb)%>
        </td>
      </tr>
      <tr> 
        <td class="name"><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
        <td colspan="2">
          <input type="text" name="w_MEMO" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getw_MEMO()) %>">
          <%=CoreTools.getRBString("Expj.Cmt0002",rb)%>
        </td>
      </tr>
      <tr>
        <td class="name"><%=CoreTools.getRBString("Expj.CREATED_BY",rb)%></td>
        <td>
          <input type="text" name="w_CREATED_BY" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getw_CREATED_BY()) %>">
        </td>
      </tr>
      <tr> 
        <td class="name"><%=CoreTools.getRBString("Expj.CREATED_DATE",rb)%></td>
        <td>
          <input type="text" name="w_CREATED_DATE_FROM" maxlength="10" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getw_CREATED_DATE_FROM()) %>"> <%=CoreTools.getRBString("Expj.Cmt0043",rb)%>  <input type="text" name="w_CREATED_DATE_TO" maxlength="10" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getw_CREATED_DATE_TO()) %>">
        </td>
        <td align="right">
          <input type="submit" name="select" value='<%=CoreTools.getRBString("Expj.BtnSelect",rb)%>' class="button" onClick="return checkSelect();">
        </td>
      </tr>
      <tr> 
        <td colspan="3"><hr></td>
      </tr>
    </table>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<tr id="layoutRow2">
  <td height="100%">
    <div class="center" id="layoutDiv2">
    <table class="outer" cellspacing=0 cellpadding=0><tr><td>
      <table cellspacing=1 cellpadding=3>
        <tr class="header"> 
          <td align="center"><%=CoreTools.getRBString("Expj.Cmt0015",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0065",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0413",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0014",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.Cmt0006",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.CREATED_BY",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.CREATED_DATE",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.UPDATED_BY",rb)%></td>
          <td><%=CoreTools.getRBString("Expj.UPDATED_DATE",rb)%></td>
        </tr>
        <%-- ********** Generated section begin ********** --%>
<%
{
  int aAZ0050010StructLength = aAZ0050010Control.getListsize();
  final AZ0050010Struct structBackup = aAZ0050010Struct;
  aAZ0050010Struct = null;
  for(int loopCount = 0; loopCount < aAZ0050010StructLength; ++loopCount) {
%>
<%
  if((aAZ0050010Struct = (AZ0050010Struct) aAZ0050010Control.getListvalue(loopCount)) == null) continue;
  pageContext.setAttribute("aAZ0050010Struct", aAZ0050010Struct);
  String rowStyleClass=(loopCount%2==0)?"":"";
%>
<%-- ********** Generated section end ********** --%>
        <tr class="rows"> 
          <td align="center"> 
            <% if(loopCount == 0){ %>
              <input type="radio" name="r_Btn" value="<%=loopCount%>" id='<%="r_Btn" + loopCount%>' checked>
            <% }else{ %>
              <input type="radio" name="r_Btn" value="<%=loopCount%>" id='<%="r_Btn" + loopCount%>'>
            <% } %>
          </td>
		  <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getEDIT_NAME()) %></orlabel></td>
          <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_NAME()) == null ? null : TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_NAME()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_GROUP()) == null ? null : TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_GROUP()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_MEMO()) == null ? null : TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_MEMO()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getCREATED_BY()) == null ? null : TypeConverter.sanitizer(aAZ0050010Struct.getCREATED_BY()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getCREATED_DATE()) %></orlabel></td>
          <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getUPDATED_BY()) == null ? null : TypeConverter.sanitizer(aAZ0050010Struct.getUPDATED_BY()).replaceAll(" ","&nbsp;") %></td>
          <td><%= TypeConverter.sanitizer(aAZ0050010Struct.getUPDATED_DATE()) %><br></orlabel></td>
		  <input type="hidden" name="EDIT_TYP" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getEDIT_TYP()) %>">
        </tr>
        <%-- ********** Generated section begin ********** --%>
<%
  }
  aAZ0050010Struct = structBackup;
}
%>
<%-- ********** Generated section end ********** --%>
      </table>
    </td>
    </tr>
    </table>
    </div>
  </td>
</tr>
<tr id="layoutRow3">
  <td> 
    <input type="submit" name="insertgui" value='<%=CoreTools.getRBString("Expj.BtnLineInsert_1",rb)%>' class="button" onClick="return checkSubmit3();">
    <input type="submit" name="updategui" value='<%=CoreTools.getRBString("Expj.BtnLineUpdate_1",rb)%>' class="button" onClick="return checkSubmit2();">
    <input type="submit" name="copygui" value='<%=CoreTools.getRBString("Expj.BtnLineCopy_1",rb)%>' class="button" onClick="return checkSubmit2();">
    <input type="submit" name="insertfree" value='<%=CoreTools.getRBString("Expj.BtnLineInsert_2",rb)%>' class="button" onClick="return checkSubmit3();">
    <input type="submit" name="updatefree" value='<%=CoreTools.getRBString("Expj.BtnLineUpdate_2",rb)%>' class="button" onClick="return checkSubmit();">
    <input type="submit" name="copyfree" value='<%=CoreTools.getRBString("Expj.BtnLineCopy_2",rb)%>' class="button" onClick="return checkSubmit();">
    <input type="submit" name="delete" value='<%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%>' class="button" onClick="return checkDelete();">
  </td>
</tr>
<tr id="layoutRow4">
  <td>
    <input type="submit" name="execute" value='<%=CoreTools.getRBString("Expj.BtnExcuteQuery",rb)%>' class="button" onClick="return checkSubmit();">
    <input type="submit" name="condition" value='<%=CoreTools.getRBString("Expj.BtnSetCondition",rb)%>' class="button" onClick="return checkSubmit2();">
    <input type="submit" name="freeSql" value='<%=CoreTools.getRBString("Expj.BtnFreeInput",rb)%>' class="button" onClick="return checkSubmit();">
    <input type="submit" name="groupset" value='<%=CoreTools.getRBString("Expj.BtnBusinessGroupSet",rb)%>' class="button" onClick="return checkSubmit();" style="width:130px">
  </td>
</tr>
<!----------------------------------------------------------------------------->
<tr id="layoutRow5">
  <td height="40px" width="100%">
    <table width="100%">
      <tr>
        <td height="10px"><hr></td>
      </tr>
      <tr>
        <td height="30px" align="right">
          <input type="submit" name="clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
          <input type="button" name="close" value='<%=CoreTools.getRBString("Expj.BtnClose",rb)%>' class="button" onClick="return delPage();">
        </td>
      </tr>
    </table>
  </td>
</tr>
<% MessageStruct msgStruct = aAZ0050010Control.getMessage(); %>
<%@ include file="common/SetServerMessage.jsp" %>
</table>
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div>
<script class="expj-script-AZ0050010-noflash-console-message">
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
