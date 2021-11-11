<%-- ********************************************************
  This file is generated
    GeneratedDate  : Sun Feb 12 12:47:55 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0020\AZ0020010.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AZ0020.*" %>
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

<jsp:useBean id="aAZ0020010Control" class="com.nec.jp.orteus.metamorBase.AZ0020.AZ0020010Control" scope="request"/>
<jsp:useBean id="aAZ0020010Struct" class="com.nec.jp.orteus.metamorBase.AZ0020.AZ0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�Ɩ����b�N�����e�i���X
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0020/jsp/AZ0020010.jsp,v $
$Author: geng-jia $
$Revision: 1.9 $ $Date: 2017/02/22 02:06:29 $
********************************************************* --%>

<html>
<head>
<title> �Ɩ����b�N�����e�i���X</title>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">
<!----------------------------------------------------------------------------->
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--
/* �����{�^���������̏��� */
function checkSelect(frmMe)
{
	if(document.all.item("c_USER_CD").checked == true){
		// ���b�N���s���[�U�����̓`�F�b�N
		if(isNull(document.all.item("USER_CD")) == true)
		{
			addErrorMessage("AZ01001");
		}
	}

		// �G���[�o��
	if(displayErrorMessages() == true)
	{
		return false;
	}

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}
//-->
</script>

<script language="JavaScript">
<!--
/* ���������{�^���������̏��� */
function checkUpdate()
{
	// �������s��?
	if(document.header.h_MODE.value != "select"){
		displayErrorMessage("AA00001");
		return false;
	}

	// �ǂݍ��݌�̃L�[���ύX����Ă��Ȃ����ǂ����̃`�F�b�N
	// ���b�N���s���[�U�̃`�F�b�N�{�b�N�X���ύX����Ă��Ȃ����`�F�b�N
	if(document.all.item("h_USER_CD").value != document.all.item("h_lastUSER_CD").value) {
		addErrorMessage("ZZ01111");
	} else {
		// ���b�N���s���[�U�̃`�F�b�N�{�b�N�X���I������Ă���ꍇ
		if(document.all.item("c_USER_CD").checked == true) {
			// ���b�N���s���[�U���ŏI�Ǎ���̃��b�N���s���[�U�Ɠ������ǂ����̃`�F�b�N
			if(document.all.item("USER_CD").value != document.all.item("h_lastUSER_NAME").value) {
				addErrorMessage("ZZ01111");
			}
		}
	}

    flg = 0;

    // �������b�N�����̎擾
	val = document.header.h_LEN.value;

	for(c=0;c<val;c++){
	// ���b�N����������f�[�^�Ƀ`�F�b�N�������Ă��邩�`�F�b�N
		if(document.all.item("c_CANCEL_CD" + c).checked == true) {
			flg = 1; break;
		}
	}

	// ���������`�F�b�N
	if(val == "0"){
		displayErrorMessage("ZZ06001");
		return false;
	}

    if(flg == 0){
    	addErrorMessage("AZ00006");
    }

    // �G���[�o��
	if(displayErrorMessages() == true)
	{
		return false;
	}

	// �m�F���b�Z�[�W�o��
	if(displayConfirmMessage("ZZ07009") != true)
	{
		return false;
	}
	
	// submit�σt���O ON
	prepareSubmit();
	PreparLock();
	
	return true;
}
//-->
</script>

<script language="JavaScript">
<!--
/* ���b�N���s���[�U�`�F�b�N�{�^���I�����̏��� */
function checkCheckBox()
{
	
	intext = document.all.item("USER_CD");

	if(document.all.item("c_USER_CD").checked == true)
	{
		// �`�F�b�N�{�b�N�X�L���t���OON
		document.all.item("h_USER_CD").value = "1";

		// ���̓e�L�X�g��L��
		intext.disabled = false;
	}
	else
	{
		// �`�F�b�N�{�b�N�X�L���t���OOFF
		document.all.item("h_USER_CD").value = "0";

		// ���̓e�L�X�g�𖳌�
		intext.disabled = true;
	}

	if(intext.disabled == true)
	{
		intext.className = "disable";
	} else {
		intext.className = "";
	}

}
//-->
</script>

<script language="JavaScript">
<!--
/* ������������f�[�^�I�����̏��� */
function changeCheckBox(val)
{

	if(document.all.item("c_CANCEL_CD" + val).checked == true)
	{
		// ���������t���OON
		document.all.item("h_CANCEL_CD" + val).value = "1";
	}
	else
	{
		// ���������t���OOFF
		document.all.item("h_CANCEL_CD" + val).value = "0";
	}
}
//-->
</script>

<script language="JavaScript">
<!--
/* ���͍��ڂ̃T�C�Y�ݒ� */
function sizing()
{
	var fm = document.header;
	sizeChar25(fm.USER_CD);					// ���b�N���s���[�U
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
// DB�����ɂ��ݒ�
function sizeChar25(obj){ obj.size = 45; }
// -->
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

<body onLoad="sizing();loadComplete()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0020010" data-noFlash="true" data-screenId="AZ0020010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<% 
	aAZ0020010Struct = null;
	aAZ0020010Struct = aAZ0020010Control.getStruct();
%>
<!----------------------------------------------------------------------------->
<form name="header" method="post" action="AZ0020010Servlet">

	<input type="hidden" name="h_MODE" value="<%= TypeConverter.sanitizer(aAZ0020010Control.getMode()) %>">
    <input type="hidden" name="h_LEN" value="<%= aAZ0020010Control.getDispList().size() %>">
    <input type="hidden" name="h_lastUSER_CD" value="<%= TypeConverter.sanitizer(aAZ0020010Control.getStruct().geth_USER_CD()) %>">
    <input type="hidden" name="h_lastUSER_NAME" value="<%= TypeConverter.sanitizer(aAZ0020010Control.getStruct().getUSER_CD()) %>">
	<input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
	<script language="JavaScript">
		if(document.header.h_MODE.value == "close")
		{
			close();
		}
	</script>
<table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<tr>
<!--- �ŏ�i --->
		<td>
      <!--- ��i --->
        <table border="0" width="100%">
          <tr>
            <td width="50"></td>
            <td>
              <% if(aAZ0020010Struct.geth_USER_CD().equals("0")) { %>
                    <input type="checkbox" name="c_USER_CD" onClick="checkCheckBox()"><%=CoreTools.getRBString("Expj.Cmt0410",rb)%>
              <% } else { %>
                    <input type="checkbox" name="c_USER_CD" checked onClick="checkCheckBox()"><%=CoreTools.getRBString("Expj.Cmt0410",rb)%>
              <% } %>
              <input type="hidden" name="h_USER_CD" value="<%= TypeConverter.sanitizer(aAZ0020010Struct.geth_USER_CD()) %>">
              <% if(aAZ0020010Struct.geth_USER_CD().equals("0")) { %> 
                    <input type="text" name="USER_CD" class="disable" disabled value="<%= TypeConverter.sanitizer(aAZ0020010Struct.getUSER_CD()) %>">

              <% } else { %>
                    <input type="text" name="USER_CD" value="<%= TypeConverter.sanitizer(aAZ0020010Struct.getUSER_CD()) %>">
              <% } %>
                    <input type="text" name="dummy" style="visibility:hidden">
            </td>
            <td> 
              <div align="right">
                <input name="select" type="submit" class="button" onClick="return checkSelect(this.form);" value='<%=CoreTools.getRBString("Expj.BtnSelect",rb)%>' <% if (request.getAttribute("ORTEUS_REVOKE_PRIV_SELECT") != null) { out.print("disabled"); } %>
>
              </div>
            </td>
			</tr>
          <tr> 
            <td colspan="3"><hr></td>
          </tr>
        </table>
    </td>
</tr>
<!----------------------------------------------------------------------------->
<!-- ���i -->
<tr>
  <td height="100%">
    <div class="center">
    <table>
    <tr><td>
      <table class="outer" cellspacing=0 cellpadding=0>
        <tr>
          <td>
            <table cellspacing=1 cellpadding=3>
              <tr class="header">
                <td><%=CoreTools.getRBString("Expj.Cmt0015",rb)%></td>
                <td><%=CoreTools.getRBString("Expj.Cmt0411",rb)%></td>
                <td><%=CoreTools.getRBString("Expj.Cmt0410",rb)%></td>
                <td><%=CoreTools.getRBString("Expj.MODE_FORM_FROM_NAME",rb)%></td>
                <td><%=CoreTools.getRBString("Expj.PLANT_NAME_2",rb)%></td>
                <td><%=CoreTools.getRBString("Expj.PROGRAM_CD_3",rb)%></td>
              </tr>
              <%  
                List list = aAZ0020010Control.getDispList();
                for(int cnt = 0; cnt < list.size(); cnt++) {
                    aAZ0020010Struct = (AZ0020010Struct)list.get(cnt);
                    List p_list = aAZ0020010Struct.getList_LIST_PLANT_NAME();
                    List p_cdlist = aAZ0020010Struct.getList_PLANT_CD();
                    List b_list = aAZ0020010Struct.getList_LIST_TO_BUSINESS_NAME();
                  
                    int array = 0;
                    array = p_list.size();
              %>

              <tr class="rows">
                <td rowspan="<%= array %>" valign="top" class="header">
                <input type="checkbox" name='<%="c_CANCEL_CD" + cnt%>' onClick='<%="changeCheckBox("+cnt+")"%>'>
                <input type="hidden" name='<%="h_CANCEL_CD" + cnt%>' value="0">
                </td>
                <td rowspan="<%= array %>" valign="top"><%= aAZ0020010Struct.getCREATE_DATE() %></td>
                <td rowspan="<%= array %>" valign="top"><%= aAZ0020010Struct.getUSER_NAME() %></td>
                <td rowspan="<%= array %>" valign="top"><%= aAZ0020010Struct.getMODE_FORM_FROM_NAME() %></td>
                <%
                
                  String beforePlant = "";
                  String nextPlantCd = "";
                  String PlantName = "";
                  String PlantCd = "";
                  String nextPlantName = "";
                  int sumPlant = 0;
                  int nextPlant = 0;
                
                  for(int i = 0; i < array; i++) {
                      if(!p_cdlist.get(i).equals(beforePlant)) {
                        PlantCd = (String)p_cdlist.get(i);
                        for(sumPlant = i; sumPlant < array; sumPlant++) {
                          
                          nextPlantCd = (String)p_cdlist.get(sumPlant);
                          if(!PlantCd.equals(nextPlantCd)) {
                            nextPlant = sumPlant - i;
                            break;
                          }
                          nextPlant = (sumPlant - i) + 1;
                        }
                      }
                      
                      if(i != 0) {
                %>
              <tr class="rows">
                <%
                      }
                      if(!p_cdlist.get(i).equals(beforePlant)){
                %>
                       <td valign="top" rowspan="<%=nextPlant%>"><%= TypeConverter.sanitizer((String)p_list.get(i)) %></td>
                <%
                      }
                %>
                       <td><%= (String)b_list.get(i) %>&nbsp;</td>
              </tr>
              <%
                      beforePlant = (String)p_cdlist.get(i);
                  }
                 
                }
              %>
              </tr> 
            </table>
          </td>
        </tr>
      </table>
    </td></tr>
    </table>
    </div>
  </td>
</tr><!----------------------------------------------------------------------------->
<!--- �ҏW�{�^�� --->
<tr>
  <td>
    <table border="0" width="100%">
      <tr>
        <td>
          
          <input name="update" type="submit" class="button" onClick="return checkUpdate();" value='<%=CoreTools.getRBString("Expj.BtnDeleteAssort",rb)%>' <% if (request.getAttribute("ORTEUS_REVOKE_PRIV_UPDATE") != null) { out.print("disabled"); } %>
>
        </td>
      </tr>
    </table>
  </td>
</tr>
<tr><td height="10px" width="100%"><hr></td></tr>
<!----------------------------------------------------------------------------->
<!--- ���i --->
<tr>
  <td width="100%">
    <table width="100%">
      <tr> 
        <td align="right">
          <input type="submit" name="clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
          <input type="button" name="close" value='<%=CoreTools.getRBString("Expj.BtnClose",rb)%>' class="button" onClick="return delPage();">
        </td>
      </tr>
    </table>
  </td>
</tr>
<%
MessageStruct msgStruct = aAZ0020010Control.getMessage();
%>
<%@ include file="common/SetServerMessage.jsp" %>
</table>
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>

<!----------------------------------------------------------------------------->
</div>
<script class="expj-script-AZ0020010-noflash-console-message">
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
