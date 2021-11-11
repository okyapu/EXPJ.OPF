<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:45:04 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050014.html
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

>�������s
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050014.jsp,v $
$Author: geng-jia $
$Revision: 1.13 $ $Date: 2017/02/22 02:06:33 $
********************************************************* --%>

<%@ page import="java.sql.Types" %>
<html>
<head>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">
<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>

<title>�������s</title>


<script language="JavaScript">
<!--
/* �N�G���ꗗ�{�^���������̏��� */
function checkReturn()
{

	// �m�F���b�Z�[�W�o��
	if(displayConfirmMessage("AZ90001") == false)  return false;

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	document.header.target="_self";
	return true;
}
/* CSV�o�̓{�^���������̏��� */
function checkCsv()
{
<% if(aAZ0050010Control.getSub4Data() == null || aAZ0050010Control.getSub4Data().size() == 0){ %>
	// ���ׂȂ��̂Ƃ� ���s�s��
	displayErrorMessage("AZ00015"); return false;
<% } %>

	prepareSubmitNoDisp();
	PreparNoLock();

	if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE) {
		document.header.target="_blank";
	}
    if (typeof(parent.expj) !== 'undefined' && parent.expj !== null) {
        setTimeout(function () {
        parent.expj.common.controlLoadingScreen(false);
      }, 0); 
    }

	return true;
}
/* ���̑����M�{�^���������̃`�F�b�N */
function checkSubmit()
{

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	document.header.target="_self";
	return true;
}
//-->
</script>

<script language="JavaScript">
<!--
function initialize()
{
	sizing();
}
//-->
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

        // �덷�����鎞�͍X�Ɉ���
        frameHeight -= 40;

        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
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

<body onLoad="initialize();loadComplete();exprSize()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0050010" data-noFlash="true" data-screenId="AZ0050010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<form name="header" method="post" action="AZ0050010Servlet">

	<%
		//��ʕ\���p Struct
		aAZ0050010Struct = null;
		aAZ0050010Struct=(AZ0050010Struct)aAZ0050010Control.getSelStruct();
	%>
<table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<tr id="layoutRow1">
  <td>
<%
	AZ0050010Struct currentQuery = aAZ0050010Control.getSelStruct();
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
      <input type="hidden" name="QUERY_NAME" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_NAME()) %>">
      <input type="hidden" name="QUERY_GROUP" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_GROUP()) %>">
      <input type="hidden" name="QUERY_MEMO" value="<%= TypeConverter.sanitizer(aAZ0050010Struct.getQUERY_MEMO()) %>">
<%	} %>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<%
List cloname = aAZ0050010Control.getSub4Name();
List clotype = aAZ0050010Control.getSub4Type();
List clodata = aAZ0050010Control.getSub4Data();

int ixx = 0;
int iyy = 0;

%>

<tr id="layoutRow2">
  <td height="100%">
    <div class="center" id="layoutDiv2">
      <table class="outer" cellspacing=0 cellpadding=0><tr><td>
        <table cellspacing=1 cellpadding=3>
          <tr class="header"> 
<%
            for (ixx = 0; ixx < cloname.size(); ixx++) {
%>
              <td><%= cloname.get(ixx)%></td>
<%
            }
%>
          </tr>
<%      for (iyy = 0; iyy < clodata.size(); iyy++) { %>
          <tr class="rows">
<%
          String[] val = (String[])clodata.get(iyy);
		  
          if (val != null) {
            for (ixx = 0; ixx < cloname.size() && val[ixx] != null; ixx++) {
              String align = null;
			  String valtemp = val[ixx];
			  if (valtemp!=null) {
   			     valtemp = valtemp.replaceAll("<","&lt;");
			     valtemp = valtemp.replaceAll(">","&gt;");
			     valtemp = valtemp.replaceAll(" ","&nbsp;");
			  }
              if( ((Integer)clotype.get(ixx)).intValue() == Types.NUMERIC ){
                align = "align=right";
              }
%>
              <td <%= TypeConverter.sanitizer(align) %>><%= valtemp%></td>
			 
<% 
            } 
          } 
%>
          </tr>
<%      } %>
        </table>
      </td>
      </tr>
      </table>
    </div>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<tr id="layoutRow3">
  <td height="50" width="100%">
    <table height="50" width="100%">
      <tr> 
        <td height="30"><hr></td>
      </tr>
      <tr> 
        <td height="30" align="right">
          <input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
          <input type="submit" name="sub4csv" value='<%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%>' class="button" onClick="return checkCsv();">
<% if(aAZ0050010Control.canSub4InputTitle() != false){ %>
          <input type="submit" name="sub4inputTitle" value='<%=CoreTools.getRBString("Expj.Cmt0074",rb)%>' class="button" onClick="return checkSubmit();">
<% } %>
<% if(aAZ0050010Control.canSub4Condition() != false){ %>
          <input type="submit" name="sub4condition" value='<%=CoreTools.getRBString("Expj.BtnSetCondition",rb)%>' class="button" onClick="return checkSubmit();">
<% } %>
          <input type="submit" name="sub4freeSql" value='<%=CoreTools.getRBString("Expj.BtnFreeInput",rb)%>' class="button" onClick="return checkSubmit();">
          <input type="submit" name="sub4return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
        </td>
      </tr>
    </table>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<% MessageStruct msgStruct = aAZ0050010Control.getMessage(); %>
<%@ include file="common/SetServerMessage.jsp" %>
</table>
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form></div>
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
