<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:44:51 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050015.html
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

>�Ώۍ��ڑI��
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050015.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:06:33 $
********************************************************* --%>
<html>
<head>

<%@include file="common/AZ0050.inc"%>

<title> �Ώۍ��ڑI�� </title>
<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">

<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--

// �����ϐ�
var index;
var line;

var fmodel;								// �I���e�[�u���S�J�����p���X�g
var FromFLG = null;

var tmodel = new TableModel();			// �\�����ڗp���X�g
var TableName = new TableModel();		// �e�[�u�������X�g
var TableAlias = new TableModel();		// �G���A�X�����X�g
var Column = new TableModel();			// �J���������X�g
var ToFLG = null;

var tablelist;
var TableDataList;
var TableAliasList;

/* ���������� */
function initialize()
{

	<%
		// �e�[�u���ꗗ
		List l_tbl = aAZ0050010Struct.getList_h_TABLE_TO();
		
		// �e�[�u���G���A�X�ꗗ
		List l_als = aAZ0050010Struct.getList_h_TABLE_ALIAS_TO();
		
		
		// �ݒ�ς݃e�[�u�����̎擾[�s�C���A�s���ʑΉ�]
		List l_sel_tbl = aAZ0050010Struct.getList_h_TABLE_NAME();
		
		// �ݒ�ς݃G���A�X���̎擾[�s�C���A�s���ʑΉ�]
		List l_sel_als = aAZ0050010Struct.getList_h_TABLE_ALIAS();
		
		// �ݒ�ς݃J�������̎擾[�s�C���A�s���ʑΉ�]
		List l_sel_col = aAZ0050010Struct.getList_h_COLUMN();
	%>

	// �̈�m��
	tablelist = new Array(<%= l_tbl.size() %> * 2);
	TableDataList = new Array(<%= l_tbl.size() %>);
	TableAliasList = new Array(<%= l_tbl.size() %>);

	<%
		for(int i=0; i<l_tbl.size(); i++)
		{
			AZ0050DBInfo dbinfo = aAZ0050010Control.getDBinfo((String)l_tbl.get(i));
		
			List colData = dbinfo.getColumnNames();
			List colComment = dbinfo.getColumnComments();
	%>
	
		// �e�[�u���ꗗ�ƃe�[�u���G���A�X�ꗗ���쐬
		TableDataList[<%=i%>] = "<%= TypeConverter.sanitizer(l_tbl.get(i)) %>";
		TableAliasList[<%=i%>] = "<%= TypeConverter.sanitizer(l_als.get(i)) %>";
		
		// �[���񎟌��z��̍쐬
		tablelist[<%=i * 2%>] = new Array(<%= colData.size() %>);
		tablelist[<%=i * 2 + 1%>] = new Array(<%= colData.size() %>);
	
	<%
			for(int j=0; j<colData.size(); j++)
			{
	%>
				// �J�������A�R�����g����ݒ�
				tablelist[<%=i * 2%>][<%=j%>] = "<%= TypeConverter.sanitizer(colData.get(j)) %>";
				tablelist[<%=i * 2 + 1%>][<%=j%>] = "<%= TypeConverter.sanitizer(colComment.get(j)) %>";
	<%
			}
		}
	%>
	
	// �����f�[�^������ꍇ[�s���ʁA�s�C���Ή�]
	<%
		String sel_tbl_comment;
		String sel_col_comment;
		String disptable;
		
		for(int i=0; i<l_sel_tbl.size(); i++)
		{
			// �e�[�u���R�����g�ƃJ�����R�����g�̎擾
			sel_tbl_comment = aAZ0050010Control.getDBUtilToTableComment((String)l_sel_tbl.get(i));
			sel_col_comment = aAZ0050010Control.getDBUtilToColumnComment((String)l_sel_tbl.get(i), (String)l_sel_col.get(i));
			
			// �\���p�e�[�u�������쐬
			disptable = sel_tbl_comment + "[" + (String)l_sel_als.get(i) + "]";
	%>

			tmodel.setValueAt("<%= disptable %>", <%= i %>, 0);
			tmodel.setValueAt("<%= l_sel_col.get(i) %>", <%= i %>, 1);
			tmodel.setValueAt("<%= sel_col_comment %>", <%= i %>, 2);
			
			TableName.setValueAt("<%= l_sel_tbl.get(i) %>", <%= i %>, 0);
			TableAlias.setValueAt("<%= l_sel_als.get(i) %>", <%= i %>, 0);
			Column.setValueAt("<%= l_sel_col.get(i) %>", <%= i %>, 0);
	
	<%
		}
	%>
	
	// �t���O�𐶐�����
	if(tmodel.getRowCount() != 0)
	{
		ToFLG = new Array(tmodel.getRowCount());
	}
	
}

/* �I�������e�[�u���̃J�����^�R�����g�̈ꗗ��\������ */
function checkDispColumn()
{
	index = document.header.tables.selectedIndex;
	fmodel = new TableModel();
	
	FromFLG = new Array(fmodel.getRowCount());
	 
	for(i=0;i<tablelist[index * 2].length;i++)
	{
		fmodel.setValueAt(tablelist[index * 2][i], i, 0);
		fmodel.setValueAt(tablelist[index *2 + 1][i], i, 1);
	}
	// �ĕ`�揈��
	repaint2("mltableF", fmodel);
}

/* ���{�^�����������ꍇ */
function addRow() {
	if(FromFLG == null)
	{
		displayErrorMessage("AZ00031");
		return false;
	}
	
	// �ǉ����鍀�ڂ����I����
	if(Selectline(FromFLG) == null) {
		displayErrorMessage("AZ00031");
		return false;
	}
	
	if(index != document.header.tables.selectedIndex)
	{
		displayErrorMessage("AZ00029");
		return false;
	}
	
	var cnt = document.header.tables.selectedIndex;
	
	// �\���p�e�[�u���̍쐬
	tmodel = addTbData2(fmodel, tmodel, FromFLG, document.header.tables.options[cnt].text);
	
	// �I���J�������̍쐬
	Column = addTbData(fmodel, Column, FromFLG);

	// �I�������J�����̃e�[�u�����A�G���A�X���̍쐬
	for(i=0;i<FromFLG.length;i++) {
		if(FromFLG[i] == 1) {
			TableName = addTableData(TableDataList[index] ,TableName);
			TableAlias = addTableData(TableAliasList[index] ,TableAlias);
		}
	}
	
	// �I���e�[�u���p�t���O�쐬
	ToFLG = new Array(tmodel.getRowCount());

	// �I����ԉ���
	clearTablesColor("mltableF" ,FromFLG);

	// �e�[�u���ꗗ�p�t���O�̏�����
	FromFLG = clearFlgs(FromFLG);
	
	// �ĕ`�揈��
	repaint3("mltableT", tmodel);
}

/* ���{�^�����������ꍇ */
function removeRow() {
	
	if(ToFLG == null)
	{
		displayErrorMessage("AZ00032");
		return false;
	}
	
	// �폜���ڂ����I����
	if(Selectline(ToFLG) == null) {
		displayErrorMessage("AZ00032");
		return false;
	}
	
	// ���ڑI���ꗗ�e�[�u��
	// �I�����ڍ폜
	tmodel = removeTbData2(tmodel, ToFLG);
	
	// �I���J�����̍폜
	Column = removeTbData(Column, ToFLG);
	
	// �I�������J�������̃e�[�u�����폜
	TableName = removeTbData(TableName, ToFLG);
	
	// �I�������J�������̃e�[�u���G���A�X���폜
	TableAlias = removeTbData(TableAlias, ToFLG);

	// �I���e�[�u���p�t���O�č쐬
	ToFLG = new Array(tmodel.getRowCount());

	// �ĕ`�揈��
	repaint3("mltableT", tmodel);
	
	// �Ώۍ��ڑI���e�[�u��
	if(fmodel != null) {
		// �I����ԉ���
		clearTablesColor("mltableF" ,FromFLG);

		// �e�[�u���ꗗ�p�t���O�̏�����
		FromFLG = clearFlgs(FromFLG);
	}
}

/* ���{�^���������� */
function doUp() {
	
	// ���ڂ��I������ĂȂ��ꍇ
	if(tmodel.getRowCount() == 0) {
		return;
	}

	if(SelectChkFlgs(ToFLG) == false)
	{
		displayErrorMessage("AZ00034");
		return false;
	}

	// �I���s�̎擾
	line = Selectline(ToFLG);

	// �I���s���擪�̏ꍇ
	if(line == 0 || line == null) {
		return;
	}

	// �I�������s�����Ɉړ�����
	tmodel = selectRowUpDisp(tmodel, line);
	TableName = selectRowUpData(TableName, line);
	TableAlias = selectRowUpData(TableAlias, line);
	Column = selectRowUpData(Column, line);
	
	// �ĕ`�揈��
	repaint3("mltableT", tmodel);
	
//	if((line - 1) == 0) {
//		ToFLG[line] = 0;
//	} 
//	else {
		// �t���O�Đݒ�
		ToFLG[line - 1] = 1;
		ToFLG[line] = 0;
		selectRowSingle("mltableT", line, (line + 1));
//	}
}

/* ���{�^���������� */
function doDown() {

	// ���ڂ��I������ĂȂ��ꍇ
	if(tmodel.getRowCount() == 0) {
		return;
	}
	
	if(SelectChkFlgs(ToFLG) == false)
	{
		displayErrorMessage("�������ڂ��I������Ă��܂�");
		return false;
	}
	
	// �I���s�̎擾
	line = Selectline(ToFLG);
	
	// �I���s����Ō���̏ꍇ
	if(line == (ToFLG.length - 1) || line == null) {
		return;
	}

	// �I�������s������Ɉړ�����
	tmodel = selectRowDownDisp(tmodel, line);
	TableName = selectRowDownData(TableName, line);
	TableAlias = selectRowDownData(TableAlias, line);
	Column = selectRowDownData(Column, line);
	
	// �ĕ`�揈��
	repaint3("mltableT", tmodel);

//	if((line + 1) == (ToFLG.length - 1)) {
//		ToFLG[line] = 0;
//	} else {
		// �t���O�Đݒ�
		ToFLG[line + 1] = 1;
		ToFLG[line] = 0;
		selectRowSingle("mltableT", (line + 2), line + 1);
//	}
}



/* �I���������ڍs�̐F��ύX���� */
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

/* �ǉ��������ڍs�̐F��ύX���� */
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

function checkCondition()
{

	if(tmodel.getRowCount() == 0)
	{
		displayErrorMessage("AZ00026");
		return false;
	}

	createHiddenTags(Column, "h_COLUMN", "FORM");
	createHiddenTags(TableAlias, "h_TABLE_ALIAS", "FORM");
	createHiddenTags(TableName, "h_TABLE_NAME", "FORM");

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}

function checkFreeSql()
{

	if(tmodel.getRowCount() != 0)
	{
		createHiddenTags(Column, "h_COLUMN", "FORM");
		createHiddenTags(TableAlias, "h_TABLE_ALIAS", "FORM");
		createHiddenTags(TableName, "h_TABLE_NAME", "FORM");
	}

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}


/* ���̑��̃{�^���������̏��� */
function checkSubmit()
{

	if(tmodel.getRowCount() != 0)
	{
		createHiddenTags(Column, "h_COLUMN", "FORM");
		createHiddenTags(TableAlias, "h_TABLE_ALIAS", "FORM");
		createHiddenTags(TableName, "h_TABLE_NAME", "FORM");
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
        frameHeight -= document.getElementById('layoutRow2').offsetHeight;
        frameHeight -= document.getElementById('layoutRow4').offsetHeight;

        // �덷�����鎞�͍X�Ɉ���
        frameHeight -= 40;

        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
        document.getElementById('layoutRow3').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv31').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
        document.getElementById('layoutDiv32').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
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
<tr id="layoutRow2">
<td colspan="4">
<%
	List tbl_list = aAZ0050010Struct.getList_h_TABLE_ALIAS_TO();
	List tbl_comment = aAZ0050010Struct.getList_h_TABLE_COMMENT_TO();
%>
		<table border="0" height="100%" width="100%">
        <tr> 
          <td>&nbsp;&nbsp;&nbsp;&nbsp;
            <select name="tables">
            <%
              for(int cnt=0; cnt<tbl_list.size(); cnt++)
              {
            %>
              <OPTION><%= TypeConverter.sanitizer(tbl_comment.get(cnt)) == null ? null : TypeConverter.sanitizer(tbl_comment.get(cnt)).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(tbl_list.get(cnt)) %>]</OPTION>
            <%
              }
            %>
            </select> <input type="button" name="dispcalumn" value='<%=CoreTools.getRBString("Expj.Cmt0023",rb)%>' class="button" onClick="return checkDispColumn();"></td></tr>
            
          </table>
</td>

</tr>
	<!--- ���i --->
<tr id="layoutRow3">
	<td height="100%">
		<div class="center">
			<table border="0" height="100%" width="100%">
				<tr height="100%">
					<td align="center">
						<div id="layoutDiv31" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">

                      <table id="mltableF" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowFrom()" style="{cursor:hand;}">
                        <tr class="header"> 
                          <td><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></td>
                          <td><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></td>
                        </tr>
                      </table>
									</td>
								</tr>
							</table>
						</div>
					</td>
					<td align="center">
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnRight",rb)%>' class="subButton" onClick="return addRow();"></p>
						<p><br></p>
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnLeft",rb)%>' class="subButton" onClick="return removeRow();"></p>
					</td>
					<td align="center">
						<div id="layoutDiv32" class="half" style="border: 1px solid black">
							<table class="outer" cellspacing=0 cellpadding=0 width="100%">
								<tr>
									<td align="center">

                      <table id="mltableT" cellspacing=1 cellpadding=3 width="100%" onclick="return selectRowTo()" style="{cursor:hand;}">
                        <tr class="header"> 
                          <td><%=CoreTools.getRBString("Expj.TABLE_NAME",rb)%></td>
                          <td><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></td>
                          <td><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></td>
                        </tr>
                        <%
                        	List sel_tbl = aAZ0050010Struct.getList_h_TABLE_NAME();
							List sel_als = aAZ0050010Struct.getList_h_TABLE_ALIAS();
							List sel_col = aAZ0050010Struct.getList_h_COLUMN();
							
							for(int cnt=0; cnt<sel_tbl.size(); cnt++)
							{
								// �e�[�u���R�����g�ƃJ�����R�����g�̎擾
								String tbl_com = aAZ0050010Control.getDBUtilToTableComment((String)sel_tbl.get(cnt));
								String col_com = aAZ0050010Control.getDBUtilToColumnComment((String)sel_tbl.get(cnt), (String)sel_col.get(cnt));
			
								// �\���p�e�[�u�������쐬
								String tbl_disp = tbl_com + "[" + (String)sel_als.get(cnt) + "]";
                        %>
                        <tr class="rows">
                          <td><%= TypeConverter.sanitizer(tbl_disp) == null ? null :  TypeConverter.sanitizer(tbl_disp).replaceAll(" ","&nbsp;") %></td>
                          <td><%= TypeConverter.sanitizer(sel_col.get(cnt)) %></td>
                          <td><%= TypeConverter.sanitizer(col_com) == null ? null :  TypeConverter.sanitizer(col_com).replaceAll(" ","&nbsp;") %></td>
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
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnUp",rb)%>' class="subButton" onClick="return doUp();"></p>
						<p><br></p>
						<p><input type="button" value='<%=CoreTools.getRBString("Expj.BtnDown",rb)%>' class="subButton" onClick="return doDown();"></p>
					</td>
				</tr>
			</table>
		</div>
	</td>
</tr>
    <!----------------------------------------------------------------------------->
<tr id="layoutRow4" valign="middle">
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
              <input type="submit" name="sub5condition" value='<%=CoreTools.getRBString("Expj.BtnNextCond",rb)%>' class="button" onClick="return checkCondition();">
              <input type="submit" name="sub5prior" value='<%=CoreTools.getRBString("Expj.BtnBeforeCond",rb)%>' class="button" onClick="return checkSubmit();">
              <input type="submit" name="sub5freeSql" value='<%=CoreTools.getRBString("Expj.BtnFreeInput",rb)%>' class="button" onClick="return checkFreeSql();">
              <input type="submit" name="sub5clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
              <input type="submit" name="sub5return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
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
