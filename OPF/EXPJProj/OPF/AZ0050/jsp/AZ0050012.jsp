<%-- ********************************************************
  This file is generated
    GeneratedDate  : Wed Feb 15 16:44:47 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AZ0050\AZ0050012.html
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

>���������ݒ�
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/jsp/AZ0050012.jsp,v $
$Author: geng-jia $
$Revision: 1.14 $ $Date: 2017/02/22 02:06:33 $
********************************************************* --%>
<HTML>
<HEAD>

<TITLE> ���������ݒ� </TITLE>
<%@include file="common/AZ0050.inc"%>

<%@include file="common/expj.jsp" %>
<link rel="stylesheet" href="common/metamorbase.css">

<script src="common/libs/jquery-2.2.4.min.js"></script>
<script src="common/libs/OrteusUtils.js"></script>
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
<!--

// �����ϐ�

var BelowFLG = null;
var fmodel = null;
var LeftFLG = 0;
var leIndex = 0;
var leDispFlg = 0;

var tmodel = null;
var RightFLG = 0;
var riIndex= 0;
var riDispFlg = 0;

var leftTableName = new TableModel();
var leftTableAlias = new TableModel();
var leftColumn = new TableModel();
var leftColumnCom = new TableModel();
var rightTableName = new TableModel();
var rightTableAlias = new TableModel();
var rightColumn = new TableModel();
var rightColumnCom = new TableModel();
var condition = new TableModel();

var tablelist;
var TableDataList;
var TableAliasList;

/* �������� */
function initialize()
{

	<%
		// �e�[�u���ꗗ
		List l_tbl = aAZ0050010Struct.getList_h_TABLE_TO();
		
		// �e�[�u���G���A�X�ꗗ
		List l_als = aAZ0050010Struct.getList_h_TABLE_ALIAS_TO();
		
		// ���������p
		List left_tbl = aAZ0050010Struct.getList_h_LEFT_TABLE_NAME();
		List left_als = aAZ0050010Struct.getList_h_LEFT_TABLE_ALIAS();
		List left_col = aAZ0050010Struct.getList_h_LEFT_COLUMN();
		List right_tbl = aAZ0050010Struct.getList_h_RIGHT_TABLE_NAME();
		List right_als = aAZ0050010Struct.getList_h_RIGHT_TABLE_ALIAS();
		List right_col = aAZ0050010Struct.getList_h_RIGHT_COLUMN();
		List cond = aAZ0050010Struct.getList_h_CONDITION();
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
				tablelist[<%=i * 2%>][<%=j%>] = "<%= TypeConverter.sanitizer(colData.get(j)) %>";
				tablelist[<%=i * 2 + 1%>][<%=j%>] = "<%= TypeConverter.sanitizer(colComment.get(j)) %>";
	<%
			}
		}
	%>

	if(condition.getRowCount() != 0)
	{
		BelowFLG = new Array(tmodel.getRowCount());
	}
	
	// �����f�[�^������ꍇ
	<%
		String left_col_comment;
		String right_col_comment;
	
		for(int i=0; i<left_tbl.size(); i++)
		{
			// �J�����R�����g���擾
			left_col_comment = aAZ0050010Control.getDBUtilToColumnComment((String)left_tbl.get(i), (String)left_col.get(i));
			right_col_comment = aAZ0050010Control.getDBUtilToColumnComment((String)right_tbl.get(i), (String)right_col.get(i));
	%>
	
			leftColumn.setValueAt("<%= left_col.get(i) %>", <%= i %>, 0);
			leftColumnCom.setValueAt("<%= left_col_comment %>", <%= i %>, 0);
			leftTableName.setValueAt("<%= left_tbl.get(i) %>", <%= i %>, 0);
			leftTableAlias.setValueAt("<%= left_als.get(i) %>", <%= i %>, 0);
			rightColumn.setValueAt("<%= right_col.get(i) %>", <%= i %>, 0);
			rightColumnCom.setValueAt("<%= right_col_comment %>", <%= i %>, 0);
			rightTableName.setValueAt("<%= right_tbl.get(i) %>", <%= i %>, 0);
			rightTableAlias.setValueAt("<%= right_als.get(i) %>", <%= i %>, 0);
			condition.setValueAt("<%= cond.get(i) %>", <%= i %>, 0);
	
	<%
		}
	%>
		// �t���O�𐶐�����
	if(leftColumn.getRowCount() != 0)
	{
		BelowFLG = new Array(leftColumn.getRowCount());
	}
	
}

/* �I�������e�[�u���̃J�����^�R�����g�̈ꗗ��\������ */
function checkDispColumn(tableid)
{
	if(tableid == "tableLeft")
	{
		leDispFlg = 0;
		LeftFLG = 0;
		leIndex = document.header.select1.selectedIndex;
		fmodel = new TableModel();

		for(i=0;i<tablelist[leIndex * 2].length;i++)
		{
			fmodel.setValueAt(tablelist[leIndex * 2][i], i, 0);
			fmodel.setValueAt(tablelist[leIndex *2 + 1][i], i, 1);
		}
		
		// �ĕ`�揈��
		repaint2(tableid, fmodel);
	}
	else
	{
		riDispFlg = 0;
		RightFLG = 0;
		riIndex = document.header.select2.selectedIndex;
		tmodel = new TableModel();

		for(i=0;i<tablelist[riIndex * 2].length;i++)
		{
			tmodel.setValueAt(tablelist[riIndex * 2][i], i, 0);
			tmodel.setValueAt(tablelist[riIndex *2 + 1][i], i, 1);
		}
		
		// �ĕ`�揈��
		repaint2(tableid, tmodel);
	}

}

/* �����̃e�[�u���̑I�������s�̐F��ύX���� */
function selectRowLeft() {

	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} if(LeftFLG == event.srcElement.parentElement.rowIndex) {
		leDispFlg = updatedFlg(leDispFlg);
	} else {
		leDispFlg = 1;
	}
	
	selectRowSingle("tableLeft", event.srcElement.parentElement.rowIndex, LeftFLG);
	
	LeftFLG = event.srcElement.parentElement.rowIndex;
}

/* �E���̃e�[�u���̑I�������s�̐F��ύX���� */
function selectRowRight() {

	

	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 
	if (RightFLG == event.srcElement.parentElement.rowIndex) {
		riDispFlg = updatedFlg(riDispFlg);
	} else {
		riDispFlg = 1;
	}

	selectRowSingle("tableRight", event.srcElement.parentElement.rowIndex, RightFLG);
	
	RightFLG = event.srcElement.parentElement.rowIndex;
}

/* �����̃e�[�u���̑I�������s�̐F��ύX���� */
function selectRowBelow() {

	if (event.srcElement.parentElement.rowIndex == null) {
		return;
	}
	if (event.srcElement.parentElement.rowIndex == 0) {
		return;
	} 

	BelowFLG[event.srcElement.parentElement.rowIndex -1]
	= updatedFlg(BelowFLG[event.srcElement.parentElement.rowIndex -1]);

	selectRow("condition", BelowFLG, event.srcElement.parentElement.rowIndex);
}


/* ���{�^���������� */
function doDown() {

	result = checkSelectColumn();
	if(displayErrorMessages() == true || result == false){
		// �G���[�o��
		return false;
	}
	
	result = checkSelectTable();
	if(displayErrorMessages() == true || result == false){
		// �G���[�o��
		return false;
	}
	
	// ���e�[�u��
	leftColumn = addColumnData(fmodel, leftColumn, LeftFLG, 0);
	leftColumnCom = addColumnData(fmodel, leftColumnCom, LeftFLG, 1);
	leftTableName = addTableData(TableDataList[leIndex], leftTableName);
	leftTableAlias = addTableData(TableAliasList[leIndex], leftTableAlias);

	// �E�e�[�u��
	rightColumn = addColumnData(tmodel, rightColumn, RightFLG, 0);
	rightColumnCom = addColumnData(tmodel, rightColumnCom, RightFLG, 1);
	rightTableName = addTableData(TableDataList[riIndex], rightTableName);
	rightTableAlias = addTableData(TableAliasList[riIndex], rightTableAlias);
	
	// ���W�I�{�^���`�F�b�N�m�F
	num = document.header.rdJOINTYPE.length;
	var cod;
	for(i=0; i<num; i++)
	{
		// ������ݒ�
		if(document.header.rdJOINTYPE[i].checked == true)
		{
			if(document.header.rdJOINTYPE[i].value == 1) {
				cod = "=";
			} else if(document.header.rdJOINTYPE[i].value == 2) {
				cod = "left";
			} else {
				cod = "right";
			}
		}
	}

	condition = addTableData(cod, condition);

	// �t���O�̏�����
	leDispFlg = 0;
	riDispFlg = 0;
	
	// �I����ԉ���
	clearTableColor("tableLeft", LeftFLG);
	clearTableColor("tableRight", RightFLG);
	
	// �����p�e�[�u���t���O�쐬
	BelowFLG = new Array(leftColumn.getRowCount());
	
	// �ĕ`�揈��
	repaintCondition("condition", leftTableAlias, leftColumnCom, condition, rightTableAlias, rightColumnCom);
}

/* ���{�^���������� */
function doUp() {

	if(leftColumn.getRowCount() == 0) {
		displayErrorMessage("AZ00022");
		return false;
	} else {
		if(Selectline(BelowFLG) == null) {
			displayErrorMessage("AZ00022");
			return false;
		}
	}
	
	// ���e�[�u��
	leftColumn = removeTbData(leftColumn, BelowFLG);
	leftColumnCom = removeTbData(leftColumnCom, BelowFLG);
	leftTableName = removeTbData(leftTableName, BelowFLG);
	leftTableAlias = removeTbData(leftTableAlias, BelowFLG);
	
	// �E�e�[�u��
	rightColumn = removeTbData(rightColumn, BelowFLG);
	rightColumnCom = removeTbData(rightColumnCom, BelowFLG);
	rightTableName = removeTbData(rightTableName, BelowFLG);
	rightTableAlias = removeTbData(rightTableAlias, BelowFLG);
	
	condition = removeTbData(condition, BelowFLG);


	// ���e�[�u���I����������
	if(fmodel != null && LeftFLG != 0) {
		// �t���O�̏�����
		leDispFlg = 0;
		
		// �I����ԉ���
		clearTableColor("tableLeft", LeftFLG);
	}
	
	// �E�e�[�u���I����������
	if(tmodel != null && RightFLG != 0) {
		// �t���O�̏�����
		riDispFlg = 0;
		
		clearTableColor("tableRight", RightFLG);
	}
	
	// �����p�e�[�u���t���O�쐬
	BelowFLG = new Array(leftColumn.getRowCount());
	
	// �ĕ`�揈��
	repaintCondition("condition", leftTableAlias, leftColumnCom, condition, rightTableAlias, rightColumnCom);
	
}

// �e�[�u���ύX�`�F�b�N
function checkSelectTable()
{
	result = true;
	
	if(leIndex != document.header.select1.selectedIndex)
	{
		addErrorMessage("AZ00027");
		result = false;
	}
	
	if(riIndex != document.header.select2.selectedIndex)
	{
		addErrorMessage("AZ00028");
		result = false;
	}
}

// ���ڑI���`�F�b�N
function checkSelectColumn()
{
	result = true;
	
	// ���̍��ږ��I����
	if(leDispFlg == 0)
	{
		addErrorMessage("AZ00020");
		result = false;
	}
	
	// �E�̍��ږ��I����
	if(riDispFlg == 0)
	{
		addErrorMessage("AZ00021");
		result = false;
	}
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

/* �Ώۍ��ڑI���{�^���������̏��� */
function checkSelectItem()
{

	if(leftColumn.getRowCount() == 0)
	{
		displayErrorMessage("AZ00033");
		return false;
	}

	createHiddenTags(leftTableName, "h_LEFT_TABLE_NAME", "FORM");
	createHiddenTags(leftTableAlias, "h_LEFT_TABLE_ALIAS", "FORM");
	createHiddenTags(leftColumn, "h_LEFT_COLUMN", "FORM");
	createHiddenTags(rightTableName, "h_RIGHT_TABLE_NAME", "FORM");
	createHiddenTags(rightTableAlias, "h_RIGHT_TABLE_ALIAS", "FORM");
	createHiddenTags(rightColumn, "h_RIGHT_COLUMN", "FORM");
	createHiddenTags(condition, "h_CONDITION", "FORM");

	// submit�σt���O ON
	prepareSubmit();
	PreparNoLock();

	return true;
}

/* �e�[�u���I���A�t���[���̓{�^���������̏��� */
function checkSubmit()
{

	if(leftColumn.getRowCount() != 0)
	{
		createHiddenTags(leftTableName, "h_LEFT_TABLE_NAME", "FORM");
		createHiddenTags(leftTableAlias, "h_LEFT_TABLE_ALIAS", "FORM");
		createHiddenTags(leftColumn, "h_LEFT_COLUMN", "FORM");
		createHiddenTags(rightTableName, "h_RIGHT_TABLE_NAME", "FORM");
		createHiddenTags(rightTableAlias, "h_RIGHT_TABLE_ALIAS", "FORM");
		createHiddenTags(rightColumn, "h_RIGHT_COLUMN", "FORM");
		createHiddenTags(condition, "h_CONDITION", "FORM");
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
  if (com.nec.jp.orteus.utils.ClientInfo.browser.isMSIE || com.nec.jp.orteus.utils.ClientInfo.browser.isChrome ) {
    // �T�C�Y�����֐��̒�`
    var resizeFunc = function () {
      try {
        // �Ɩ���ʂɊ��蓖�Ă�ꂽ�t���[���^�O���擾
        var parentFrame = parent.document.getElementById('expj-business-screen-tabs-body-AZ0050010');
        // �Ɩ���ʂɗ^����ꂽ�������擾
        var frameHeight  = parentFrame.clientHeight;
        
        
        //layoutRow5�̃T�C�Y�Œ�ipx)
        //var frameHeight5 = document.getElementById('layoutRow5').offsetHeight;
        var frameHeight5 = 70;
        
      
        //document.write("frmeHeightall="+frameHeight+"px<br>"+
        //"frmeHeight layoutRow1="+document.getElementById('layoutRow1').offsetHeight+"px<br>"+
        //"frmeHeight layoutRow2="+document.getElementById('layoutRow2').offsetHeight+"px<br>"+
        //"frmeHeight layoutRow3="+document.getElementById('layoutRow3').offsetHeight+"px<br>"+
        //"frmeHeight layoutRow4="+document.getElementById('layoutRow4').offsetHeight+"px<br>"+
        //"frmeHeight layoutRow5="+document.getElementById('layoutRow5').offsetHeight+"px<br>"+
        //"frmeHeight layoutRow6="+document.getElementById('layoutRow6').offsetHeight+"px<br>");

        // �^����ꂽ��������Œ�ӏ��̍���������
        frameHeight -= document.getElementById('layoutRow1').offsetHeight;
        frameHeight -= document.getElementById('layoutRow2').offsetHeight;
        frameHeight -= document.getElementById('layoutRow4').offsetHeight;
        frameHeight -= frameHeight5;
        frameHeight -= document.getElementById('layoutRow6').offsetHeight;

        // �덷�����鎞�͍X�Ɉ���
        frameHeight -= 80;

        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
        // ���C�A�E�g�𒲐��������ꏊ�̍������C��
        document.getElementById('layoutRow3').setAttribute('style', 'height:' + frameHeight + 'px');
        document.getElementById('layoutDiv31').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
        document.getElementById('layoutDiv32').setAttribute('style', 'height:' + frameHeight + 'px' + ';'+'border: 1px solid black');
        
        document.getElementById('layoutRow5').setAttribute('style', 'height:' + frameHeight5 + 'px');
        document.getElementById('layoutDiv5').setAttribute('style', 'height:' + frameHeight5 + 'px');
        
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
    
    if (com.nec.jp.orteus.utils.ClientInfo.browser.isChrome) {
      // form�^�O��margin-bottom���C��
      $('form').css('margin-bottom', '0px');
    }    
    
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
</HEAD>

<body onLoad="initialize();loadComplete();exprSize()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AZ0050010" data-noFlash="true" data-screenId="AZ0050010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<% 
	aAZ0050010Struct = null;
	aAZ0050010Struct = aAZ0050010Control.getStruct();
%>
<form id="FORM" name="header" method="post" action="AZ0050010Servlet">


<table border="0" width="100%" border="0" height="100%">
<!----------------------------------------------------------------------------->
<!--- ��i --->
  <TR id="layoutRow1">
   <TD align="right" colspan="3">
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
   </TD>
  </TR>
<!----------------------------------------------------------------------------->
<!--- ���i --->
<%
	List tbl_list = aAZ0050010Struct.getList_h_TABLE_ALIAS_TO();
	List tbl_comment = aAZ0050010Struct.getList_h_TABLE_COMMENT_TO();
%>
  <TR id="layoutRow2" height="10%">
      <TD align="center">
       <SELECT name="select1" style="width: 400">
        <%
          for(int cnt=0; cnt<tbl_list.size(); cnt++)
          {
        %>
          <OPTION><%= TypeConverter.sanitizer(tbl_comment.get(cnt)) == null ? null : TypeConverter.sanitizer(tbl_comment.get(cnt)).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(tbl_list.get(cnt)) %>]</OPTION>
          
        <%
          }
        %>
       </SELECT><br><br>
       <input type="button" name="dispcalumn" value='<%=CoreTools.getRBString("Expj.Cmt0023",rb)%>' class="button" onClick="return checkDispColumn('tableLeft');">
      </TD>
      <TD><BR></TD>
      <TD align="center">
       <SELECT name="select2" style="width: 400">
        <%
          for(int cnt=0; cnt<tbl_list.size(); cnt++)
          {
        %>
          <OPTION><%= TypeConverter.sanitizer(tbl_comment.get(cnt)) == null ? null : TypeConverter.sanitizer(tbl_comment.get(cnt)).replaceAll(" ","&nbsp;") %>[<%= TypeConverter.sanitizer(tbl_list.get(cnt)) %>]</OPTION>
        <%
          }
        %>
       </SELECT><br><br>
       <input type="button" name="dispcalumn" value='<%=CoreTools.getRBString("Expj.Cmt0023",rb)%>' class="button" onClick="return checkDispColumn('tableRight');">
      </TD>
  </TR>
<!--- ���i2 --->
  <TR id="layoutRow3" height="60%">
    <TD align="center">
      <div id="layoutDiv31" class="half" style="border: 1px solid black">
	  <table class="outer" cellspacing=0 cellpadding=0 width="100%">
      <TR>
       <TD align="center">
        <TABLE id="tableLeft" cellspacing="1" cellpadding="3" width="100%" onclick="return selectRowLeft()" style="{cursor:hand;}">
          <tr class="header"><TD><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></TD><TD><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></TD></TR>
        </TABLE>
       </TD>
      </TR>
     </TABLE>
     </div>
    </TD>
    <TD align="center" width="150">
      <div style="white-space:normal;">
        <P><INPUT type="radio" name="rdJOINTYPE" value="1" checked><%=CoreTools.getRBString("Expj.Cmt0247",rb)%></P>
        <P></P>
        <P><INPUT type="radio" name="rdJOINTYPE" value="2"><%=CoreTools.getRBString("Expj.Cmt0248",rb)%></P>
        <P></P>
        <P><INPUT type="radio" name="rdJOINTYPE" value="3"><%=CoreTools.getRBString("Expj.Cmt0249",rb)%></P>
      </div>
    </TD>
    <TD align="center">
      <div id="layoutDiv32" class="half" style="border: 1px solid black">
      <table class="outer" cellspacing=0 cellpadding=0 width="100%">
      <TR>
        <TD align="center">
          <TABLE id="tableRight" cellspacing="1" cellpadding="3" width="100%" onclick="return selectRowRight()" style="{cursor:hand;}">
          <tr class="header"><TD><%=CoreTools.getRBString("Expj.Cmt0066",rb)%></TD><TD><%=CoreTools.getRBString("Expj.Cmt0067",rb)%></TD></TR>
          </TABLE>
        </TD>
      </TR>
      </TABLE></div>
    </TD>
   </TR>
<!---- �I���{�^�� ----->
   <TR id="layoutRow4">
    <TD><br></TD>
    <TD align="center">
      <input type="button" value='<%=CoreTools.getRBString("Expj.BtnDown",rb)%>' class="subButton" onClick="return doDown();">
      <input type="button" value='<%=CoreTools.getRBString("Expj.BtnUp",rb)%>' class="subButton" onClick="return doUp();">
    </TD>
    <TD><br></TD>
   </TR>
<!---- �I�����ʕ\���G���A ----->
   <TR id="layoutRow5" height="30%">
    <TD colspan="3" align="center">
      <div id="layoutDiv5" class="center">
      <table class="outer" cellspacing=0 cellpadding=0>
      <tr><td align="center">
      <table id="condition" cellspacing=1 cellpadding=3 onclick="return selectRowBelow()" style="{cursor:hand;}">
      <tr class="header">
        <td><%=CoreTools.getRBString("Expj.Cmt0070",rb)%></td>
        <td><%=CoreTools.getRBString("Expj.CONDITION",rb)%></td>
        <td><%=CoreTools.getRBString("Expj.Cmt0071",rb)%></td>
      </tr>
      <%
      		// ���������̊e�����擾
			List lef_tbl = aAZ0050010Struct.getList_h_LEFT_TABLE_NAME();
			List lef_als = aAZ0050010Struct.getList_h_LEFT_TABLE_ALIAS();
			List lef_col = aAZ0050010Struct.getList_h_LEFT_COLUMN();
			List rig_tbl = aAZ0050010Struct.getList_h_RIGHT_TABLE_NAME();
			List rig_als = aAZ0050010Struct.getList_h_RIGHT_TABLE_ALIAS();
			List rig_col = aAZ0050010Struct.getList_h_RIGHT_COLUMN();
			List cnd = aAZ0050010Struct.getList_h_CONDITION();
			
			String cnd_disp;
			
			for(int cnt=0; cnt<lef_tbl.size(); cnt++)
			{
				// �J�����R�����g�̎擾
				String lef_col_com = aAZ0050010Control.getDBUtilToColumnComment((String)left_tbl.get(cnt), (String)left_col.get(cnt));
				String rig_col_com = aAZ0050010Control.getDBUtilToColumnComment((String)right_tbl.get(cnt), (String)right_col.get(cnt));
				
				// �\���p<td>�̍쐬
				String lef_disp = (String)lef_als.get(cnt) + "." + lef_col_com;
				String rig_disp = (String)rig_als.get(cnt) + "." + rig_col_com;
				
				if( ((String)cnd.get(cnt)).equals("=") )
				{
					cnd_disp = "�����ƈ�v����";
				} else if( ((String)cnd.get(cnt)).equals("left") )
				{
					cnd_disp = "���S���ƈ�v����";
				} else {
					cnd_disp = "�E�S���ƈ�v����";
				}
      %>
      <tr class="rows">
        <td><%= lef_disp == null ? null : lef_disp.replaceAll(" ","&nbsp;") %></td>
        <td><%= cnd_disp %></td>
        <td><%= rig_disp == null ? null : rig_disp.replaceAll(" ","&nbsp;")%></td>
      </tr>
      <%
      		}
      %>
      </table>
      </td></tr>
      </table>
      </div>
    </TD>
   </TR>

<!--- ���i --->
 <TR id="layoutRow6" valign="middle">
   <TD colspan="3" height="30"><HR></TD></TR>
 <TR>
  <TD colspan="3" height="30">
  <P align="right">
    <input type="hidden" name="SUBMIT_BUTTON_TYPE" value="0">
    <input type="submit" name="sub2selectItem" value='<%=CoreTools.getRBString("Expj.BtnNextCond",rb)%>' class="button" onClick="return checkSelectItem();">
    <input type="submit" name="sub2selectTable" value='<%=CoreTools.getRBString("Expj.BtnBeforeCond",rb)%>' class="button" onClick="return checkSubmit();">
    <input type="submit" name="sub2freeSql" value='<%=CoreTools.getRBString("Expj.BtnFreeInput",rb)%>' class="button" onClick="return checkSubmit();">
    <input type="submit" name="sub2clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
    <input type="submit" name="sub2return" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' class="button" onClick="return checkReturn();">
  </P>
  </TD>
</TR>
<% MessageStruct msgStruct = aAZ0050010Control.getMessage(); %>
<%@ include file="common/SetServerMessage.jsp" %>
</TABLE>
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
</BODY>
</HTML>
