<%-- ********************************************************
  This file is generated
    GeneratedDate  : Fri Mar 25 16:14:51 JST 2005
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\WORKProj\OPF\ZZ0020\ZZ0020010.html
********************************************************* --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>	
<%@ page import="com.nec.jp.orteus.metamorBase.ZZ0020.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.nec.jp.orteus.expj.util.MessageStruct" %>

<%
    HttpSession so = request.getSession(false);
    String locale = (String)so.getAttribute("LOCALE");
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);

    response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
    response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>

<jsp:useBean id="aZZ0020010Control" class="com.nec.jp.orteus.metamorBase.ZZ0020.ZZ0020010Control" scope="request"/>
<jsp:useBean id="aZZ0020010Struct" class="com.nec.jp.orteus.metamorBase.ZZ0020.ZZ0020010Struct" scope="request"/>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�v�����^�_�C�A���O
$Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/EJmenu/ZZ0020010.jsp,v $
$Author: n-saito $
$Revision: 1.1 $ $Date: 2017/03/13 08:11:13 $
********************************************************* --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="<%=CoreTools.getCharset(locale) %>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>�v�����^�_�C�A���O</title>
</head>

<body>
<%String nativevalue;%>
<div id="expj-business-screen-ZZ0020010">
</div>

<!-- ����_�C�A���O�������� -->
<div id="expj-ZZ0020010-print-dialog" title="Print Dialog" data-orftype="DataGrid" data-mode="DETAIL">
  <div style="position:relative;height:100%;">
    <div id="expj-ZZ0020010-print-dialog-radioArea">
<%
    String checked = "";
    if ("true".equals(TypeConverter.convert(aZZ0020010Struct.getr_REPORT1())) || "".equals(TypeConverter.convert(aZZ0020010Struct.getr_REPORT1()))) {
        checked = "checked=\"checked\" ";
    }
%>
      <!-- �ꊇ���[�o��(�Č���) -->
      <div><label><input type="radio" id="expj-ZZ0020010-print-dialog-r_REPORT1" data-name="r_REPORT1" value="true" <%=checked %>name="GROUPA"><%=CoreTools.getRBString("Expj.Cmt0061",rb)%></label></div>
<%
    checked = "";
    if ("false".equals(TypeConverter.convert(aZZ0020010Struct.getr_REPORT2()))) {
        checked = "checked=\"checked\" ";
    }
%>
      <!-- �ꊇ���[�o�� -->
      <div><label><input type="radio" id="expj-ZZ0020010-print-dialog-r_REPORT2" data-name="r_REPORT2" value="false" <%=checked %>name="GROUPA"><%=CoreTools.getRBString("Expj.Cmt0062",rb)%></label></div>
<%
    checked = "";
    if ("false".equals(TypeConverter.convert(aZZ0020010Struct.getr_REPORT3()))) {
        checked = "checked=\"checked\" ";
    }
%>
      <!-- �I�𒠕[�o�� -->
      <div><label><input type="radio" id="expj-ZZ0020010-print-dialog-r_REPORT3" data-name="r_REPORT3" value="false" <%=checked %>name="GROUPA"><%=CoreTools.getRBString("Expj.Cmt0063",rb)%></label></div>
    </div>
  
    <!-- �e�[�u���`�敔�� -->
    <div id="expj-ZZ0020010-printer-table-view-wrapper" class="expj-datagrid-view expj-view-single" style="height:185px; border:solid 1px #000;"></div>
  
    <div style="text-align: right; right: 10px; bottom: 0px; position: absolute;">
      <div class="div-td" style="float:none;width:105px;height:30px;"><button id="expj-ZZ0020010-printer-dialog-ok"><%=CoreTools.getRBString("Expj.BtnOk",rb)%></button></div>
      <div class="div-td" style="float:none;width:105px;height:30px;"><button id="expj-ZZ0020010-printer-dialog-cancel"><%=CoreTools.getRBString("Expj.BtnCancel",rb)%></button></div>
    </div>
  </div>
</div>
<!-- ����_�C�A���O�����܂� -->

<%
MessageStruct msgStruct = aZZ0020010Control.getMsgStruct();
%>
<%@include file="common/SetServerMessage.jsp" %>
<script>
expj.ZZ0020010 = {};

//�v�����^�_�C�A���O�C���X�^���X�錾
expj.ZZ0020010.mainTable = null;
expj.ZZ0020010.printDialog = null;

// �v�����^�_�C�A���O(ZZ0020010)�̏������֐�
expj.ZZ0020010.expj_onLoad = function () {
  // �e�[�u���w�b�_�[��`
  var expj_ZZ0020010_gTableHeader = [
    { 'visible' : false },
    { 'name' : 'PRINTER_DISPLAY_NAME', 'sortable': false, 'width': '280px', 'visible': true, 'title': '<%=CoreTools.getRBString("Expj.Cmt0064",rb)%>','class':'expj-align-left'},
    { 'name' : 'PRINTER_TYPE', 'sortable': false, 'width': '0px', 'visible': true, 'title': ''},
    { 'name' : 'SELECTED_PRINTER', 'sortable': false, 'width': '0px', 'visible': true, 'title': ''},
    { 'sortable': false, 'width': '120px', 'visible': true }
  ];
  // �e�[�u���f�[�^��`
  var expj_ZZ0020010_gTableData = [
  <%
      int aZZ0020010StructLength = aZZ0020010Control.getListsize();
      final ZZ0020010Struct structBackup = aZZ0020010Struct;
      aZZ0020010Struct = null;
      int loopCount2=0;
      for(int loopCount = 0; loopCount < aZZ0020010StructLength; ++loopCount) {
          if((aZZ0020010Struct = (ZZ0020010Struct) aZZ0020010Control.getListvalue(loopCount)) == null) {
              continue;
          }
          pageContext.setAttribute("aZZ0020010Struct", aZZ0020010Struct);
          String rowStyleClass = (loopCount % 2 == 0) ? "" : "";
  %>
    ['<%= ++loopCount2 %>','<%= TypeConverter.sanitizer(aZZ0020010Struct.getPRINTER_DISPLAY_NAME()) %>','<%= TypeConverter.sanitizer(aZZ0020010Struct.getPRINTER_TYPE()) %>','<%= TypeConverter.sanitizer(aZZ0020010Struct.getSELECTED_PRINTER()) %>', ''],
  <%
      }
      aZZ0020010Struct = structBackup;
  %>
  ];
  expj.ZZ0020010.mainTable = expj.common.createOrteusViewInstance('#expj-ZZ0020010-printer-table-view-wrapper', expj_ZZ0020010_gTableHeader, expj_ZZ0020010_gTableData, false, 'single', expj.ZZ0020010.executePrinterOnRowSelected);

  //���������A��s�ځA�I����Ԃɂ���
  $('#expj-ZZ0020010-printer-table-view-wrapper tbody tr:first-child').click();
  
  //$('#expj-ZZ0020010-printer-table-view-wrapper div.expjView_scrollBody').css('height', '164px').css('width', '475px').css('overflow-x', 'hidden');
  $('#expj-ZZ0020010-printer-table-view-wrapper div.expjView_scrollBody').css('overflow-x', 'hidden');
};

//�I�������s�̃f�[�^���i�[�����ϐ�
expj.ZZ0020010.printerSelectRowData = null;

//�\�̍s��I���������Ɏ��s�����֐�
expj.ZZ0020010.executePrinterOnRowSelected = function (event) {
  // �I���s�̃G�������g���擾
  var row = $(event.currentTarget).find('td');
  var rowData = [];
  for (var i = 0; i < row.length; i++) {
    if (row[i].childNodes.length > 0) {
      rowData.push(row[i].childNodes[0].data);
    } else {
      rowData.push('');
    }
  }

  // �I�����ꂽ�i�ڔԍ���ێ�(�m��{�^���őJ�ڌ�̉�ʂŕ\�����邽��)
  expj.ZZ0020010.printerSelectRowData = rowData;
}

//�_�C�A���O�̏�����
expj.ZZ0020010.openDialog = function (okEvent, cancelEvent) {
  var dialogHeight = 340;
  dialogHeight -= 20 * (3 - $('#expj-ZZ0020010-print-dialog-radioArea input:visible').length);
  expj.ZZ0020010.printDialog = $("#expj-ZZ0020010-print-dialog").dialog({
    'autoOpen': false,      // �y�[�W�ǂݍ��ݎ��Ƀ_�C�A���O�������\�����邩�ݒ�
    'closeOnEscape': false, // �uEsc�v�L�[�����������Ƀ_�C�A���O����邩�ݒ�
    'modal': true,          // �_�C�A���O��\�����ɔw�i��ʂ𑀍�ł��邩�ݒ�
    'draggable': true,      // �^�C�g���������}�E�X�Ńh���b�O�������Ƀ_�C�A���O�𓮂����邩�ݒ�
    'width': 426,           // �_�C�A���O�̉���
    'height': dialogHeight, // �_�C�A���O�̏c��
    'resizable': false,     // ���T�C�Y��
    'close': function (event) {
      expj.common.deleteBusinessScreenJavaScript('ZZ0020010');
      expj.common.deleteBusinessScreenDialog('ZZ0020010');
    }
  });
  $('#expj-ZZ0020010-printer-dialog-ok').bind('click', function () {
    okEvent();
  });
  $('#expj-ZZ0020010-printer-dialog-cancel').bind('click', function () {
    cancelEvent();
  });
  expj.ZZ0020010.printDialog.dialog('option', 'position', {
    'my': 'left top',
    'at': 'left+12 top+110',
    'of': $(window)
  });
  expj.ZZ0020010.printDialog.dialog('open');
};

expj.ZZ0020010.closeDialog = function () {
  expj.ZZ0020010.printDialog.dialog('close');
};

expj.ZZ0020010.getSelectPrinter = function () {
  if (expj.ZZ0020010.printerSelectRowData === null) {
    return null;
  }
  var result = {};
  var columnList = $('#expj-ZZ0020010-printer-table-view-wrapper .orteusView_scrollHeadWrapper thead th');
  for (var i = 0; i < columnList.length; i++) {
    var columnName = columnList[i].getAttribute('data-name');
    if (columnName !== '') {
      result[columnName] = expj.ZZ0020010.printerSelectRowData[i];
    }
  }
  var paramName = 'PRINT_PATTERN';
  var check1 = document.getElementById('expj-ZZ0020010-print-dialog-r_REPORT1');
  if (check1.checked) {
    result[paramName] = '1';
  } else {
    var check2 = document.getElementById('expj-ZZ0020010-print-dialog-r_REPORT2');
    if (check2.checked) {
      result[paramName] = '2';
    } else {
      var check3 = document.getElementById('expj-ZZ0020010-print-dialog-r_REPORT3');
      if (check3.checked) {
        result[paramName] = '3';
      } else {
        result[paramName] = '1';
      }
    }
  }
  return result;
};
</script>
</body>
</html>