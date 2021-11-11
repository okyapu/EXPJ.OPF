<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:44:41 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050011.html
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

>�e�[�u���I��
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050011.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:06:32 $
********************************************************* --%>
<html>
<head>

<%@include file="common/AZ0050.inc"%>
<title> �e�[�u���I�� </title>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">

<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">

<!--

var fmodel = new TableModel();			// �e�[�u���ꗗ
var fmodel_com = new TableModel();		// �e�[�u���R�����g
var FromFLG = null;

var tmodel = new TableModel();			// �I���e�[�u��
var tmodel_com = new TableModel();		// �e�[�u���R�����g
var ToFLG = null;

var datalen;

/* ���������� */
function initialize()
{

	<%
		List fromTABLE = aAZ0050010Control.getSub1Data();
		List fromCOMMENT = aAZ0050010Control.getSub1CommentData();
		for(int i=0;i<fromTABLE.size();i++) {
	%>
			fmodel.setValueAt("<%= TypeConverter.sanitizer(fromTABLE.get(i)) %>", <%= i %>, 0);
			fmodel_com.setValueAt("<%= TypeConverter.sanitizer(fromCOMMENT.get(i)) %>", <%= i %>, 0);
	<%
		}
	%>

	FromFLG = new Array(fmodel.getRowCount());
	
	<%
		List toTABLE = aAZ0050010Struct.getList_h_TABLE_TO();
		List toCOMMENT = aAZ0050010Struct.getList_h_TABLE_COMMENT_TO();
		for(int i=0;i<toTABLE.size();i++) {
	%>
			tmodel.setValueAt("<%= toTABLE.get(i) %>", <%= i %>, 0);
			tmodel_com.setValueAt("<%= toCOMMENT.get(i) %>", <%= i %>, 0);
	<%
		}
	%>
	
	if(tmodel.getRowCount() != 0)
	{
		ToFLG = new Array(tmodel.getRowCount());
		datalen = tmodel.getRowCount();
	}
}

/* ���{�^�����������ꍇ */
function addRow() {
	if(FromFLG == null)
	{
		displayErrorMessage("AZ00018");
		return false;
	}
	
	// �ǉ��e�[�u�������I����
	if(Selectline(FromFLG) == null) {
		displayErrorMessage("AZ00018");
		return false;
	}
	// �I���e�[�u���ɒǉ�����
	tmodel = addTbData(fmodel, tmodel, FromFLG);
	
	// �I���e�[�u��[�R�����g]�ɒǉ�����
	tmodel_com = addTbData(fmodel_com, tmodel_com, FromFLG);

	// �I���e�[�u���p�t���O�쐬
	ToFLG = new Array(tmodel.getRowCount());

	// �I����ԉ���
	clearTablesColor("mltableF" ,FromFLG);

	// �e�[�u���ꗗ�p�t���O�̏�����
	FromFLG = clearFlgs(FromFLG);

	// �ĕ`�揈��
	repaint("mltableT", tmodel, tmodel_com);
}

/* ���{�^�����������ꍇ */
function removeRow() {
	if(ToFLG == null)
	{
		displayErrorMessage("AZ00030");
		return false;
	}
	
	// �폜�e�[�u�������I����
	if(Selectline(ToFLG) == null) {
		displayErrorMessage("AZ00030");
		return false;
	}
	
	// �����f�[�^�폜�`�F�b�N
	for(i=0; i<datalen;i++) {
		if(ToFLG[i] == 1) {
			displayErrorMessage("AZ00019");
			return false;
		}
	}
	
	// �I���e�[�u���ĕ`�揈��
	// �I�����ڍ폜
	tmodel = removeTbData(tmodel, ToFLG);
	
	// �I�����ڍ폜[�R�����g]
	tmodel_com = removeTbData(tmodel_com, ToFLG);

	// �I���e�[�u���p�t���O�č쐬
	ToFLG = new Array(tmodel.getRowCount());

	// �`�揈��
	repaint("mltableT", tmodel, tmodel_com);
	
	// �e�[�u���ꗗ�ĕ`�揈��
	// �I����ԉ���
	clearTablesColor("mltableF" ,FromFLG);

	// �e�[�u���ꗗ�p�t���O�̏�����
	FromFLG = clearFlgs(FromFLG);

	// �`�揈��
	repaint("mltableT", tmodel, tmodel_com);
}

/* �e�[�u���ꗗ�̑I�������s�̐F��ύX���� */
function selectRowFrom() {

	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 

	FromFLG[event.srcElement.parentElement.rowIndex -1]
	= updatedFlg(FromFLG[event.srcElement.parentElement.rowIndex -1]);

	selectRow("mltableF", FromFLG, event.srcElement.parentElement.rowIndex);
}

/* �I���e�[�u���̑I�������s�̐F��ύX���� */
function selectRowTo() {
	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 
	
	ToFLG[event.srcElement.parentElement.rowIndex -1]
	= updatedFlg(ToFLG[event.srcElement.parentElement.rowIndex -1]);
	
	selectRow("mltableT", ToFLG, event.srcElement.parentElement.rowIndex);
}

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

/* ���փ{�^���������̏��� */
function checkNext()
{

	if(tmodel.getRowCount() == 0)
	{
		displayErrorMessage("AZ00016");
		return false;
	}

	createHiddenTags(tmodel, "h_TABLE_TO", "FORM");
	createHiddenTags(tmodel_com, "h_TABLE_COMMENT_TO", "FORM");
	
	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}

/* ���̑��̃{�^���������̏��� */
function checkFreeSql()
{
	
	if(tmodel.getRowCount() != 0)
	{
		createHiddenTags(tmodel, "h_TABLE_TO", "FORM");
		createHiddenTags(tmodel_com, "h_TABLE_COMMENT_TO", "FORM");
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
        frameHeight -= 50;

        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
        document.getElementById('layoutRow2').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv21').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
        document.getElementById('layoutDiv22').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
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

<body onLoad="initialize();loadComplete();exprSize();"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0050010" data-noFlash="true" data-screenId="AZ0050010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<% 
	aAZ0050010Struct = null;
	aAZ0050010Struct = aAZ0050010Control.getStruct();
%>
<form id="FORM" name="header" method="post" action="AZ0050010Servlet">

<table width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<tr id="layoutRow1">
	<!--- ��i --->
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
	<!--- ���i --->
<tr id="layoutRow2">
	<td height="100%">
		<div class="center">
			<table border="0" height="100%" width="100%">
				<tr height="100%">
					<td width="500" valign="top" align="center">
						<div id="layoutDiv21" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">
										<table id="mltableF" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowFrom()" style="{cursor:hand;}">
										<tr class="header"> 
										  <td><%=CoreTools.getRBString("Expj.Cmt0072",rb)%></td>
										</tr>
										<%
											List tbl_f_list = aAZ0050010Control.getSub1Data();
											List tbl_f_comment = aAZ0050010Control.getSub1CommentData();
											
											for(int cnt=0; cnt<tbl_f_list.size(); cnt++)
											{
										%>
										<tr class="rows">
										  <td><%= TypeConverter.sanitizer(tbl_f_comment.get(cnt)) == null ? null : TypeConverter.sanitizer(tbl_f_comment.get(cnt)).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(tbl_f_list.get(cnt)) %>]</td>
										</tr>
										<%
											}
										%>
										  
										</table>
									</td>
								</tr>
							</table>
						</div>
					</td>
					<td align="center">
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnRight",rb)%>' class="subButton" onClick="return addRow();"></p>
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnLeft",rb)%>' class="subButton" onClick="return removeRow();"></p>
					</td>
					<td width="500" valign="top" align="center">
						<div id="layoutDiv22" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">
										<table id="mltableT" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowTo()" style="{cursor:hand;}">
										<tr class="header"> 
										  <td><%=CoreTools.getRBString("Expj.Cmt0073",rb)%></td>
										</tr>
										<%
										List tbl_t_list = aAZ0050010Struct.getList_h_TABLE_TO();
										List tbl_t_comment = aAZ0050010Struct.getList_h_TABLE_COMMENT_TO();
										
										for(int cnt=0; cnt<tbl_t_list.size(); cnt++)
										{
										%>
										<tr class="rows">
										  <td><%= TypeConverter.sanitizer(tbl_t_comment.get(cnt)) == null ? null : TypeConverter.sanitizer(tbl_t_comment.get(cnt)).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(tbl_t_list.get(cnt)) %>]</td>
										</tr>
										<%
											}
										%>
										</table>
									</td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</td>
</tr>
    <!----------------------------------------------------------------------------->
<tr id="layoutRow3" valign="middle">
	<!--- ���i --->
	<td height="50" width="100%">
		
      <table height="50" width="100%">
        <tr> 
          <td height="30">
            <hr>
          </td>
        </tr>
        <tr> 
          <td height="30"> 
            <div align="right">
              <input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
              <input type="submit" name="sub1next" value='<%=CoreTools.getRBString("Expj.BtnNextCond",rb)%>' class="button" onClick="return checkNext();">
              <input type="submit" name="sub1freeSql" value='<%=CoreTools.getRBString("Expj.BtnFreeInput",rb)%>' class="button" onClick="return checkFreeSql();">
              <input type="submit" name="sub1clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
              <input type="submit" name="sub1return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
            </div>
          </td>
        </tr>
      </table>
	</td>
</tr>
<!----------------------------------------------------------------------------->
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
