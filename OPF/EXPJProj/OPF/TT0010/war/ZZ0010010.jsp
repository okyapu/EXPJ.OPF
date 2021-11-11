<%-- ********************************************************
  This file is generated
    GeneratedDate  : Thu Oct 07 15:35:16 JST 2004
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\V6\OPF\ZZ0010\ZZ0010010.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="Windows-31J" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.ZZ0010.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.Types" %>
<%@ page import="java.util.List" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="com.nec.jp.orteus.expj.util.MessageStruct" %>
<%@ page import="com.nec.jp.orteus.expj.flash.Kind" %>
<%@ page import="com.nec.jp.orteus.expj.flash.ScreenMoveUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
    HttpSession so = request.getSession(false);
    if ( so == null || so.getAttribute("UserId") == null){
        out.print("<html><head></head><body><div id=\"expj-session-timeout\"></div></body></html>");
        return;
    }
    String locale = (String) so.getAttribute("LOCALE");
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);

    response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
    response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
    response.setHeader("Pragma","No-store");
    response.setHeader("Cache-Control","no-store");
    response.setDateHeader("Expires",0);
    
%>

<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

���͕⏕
$Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/EJmenu/ZZ0010010.jsp,v $
$Author: n-saito $
$Revision: 1.1 $ $Date: 2017/03/13 08:11:13 $
********************************************************* --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="<%=CoreTools.getCharset(locale) %>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>PEEKER</title>
</head>

<jsp:useBean id="aZZ0010010Control" class="com.nec.jp.orteus.metamorBase.ZZ0010.ZZ0010010Control" scope="request"/>
<jsp:useBean id="aZZ0010010Struct" class="com.nec.jp.orteus.metamorBase.ZZ0010.ZZ0010010Struct" scope="request"/>

<body style="background-color: #FFFFFF; margin: 0px;">
<div id="expj-business-screen-ZZ0010010">
  <div class="expj-tab-contants back" style="width: 100%; height: 100%; background-color: #fff;">
    <!-- �^�u����[�̗]�������������� -->
    <div class="div-tr" style="height: 5px;">
      <div class="div-td" style="width: 100%;"></div>
    </div> <!-- tr -->
    <!-- �^�u����[�̗]�����������܂� -->
    <input type="hidden" id="expj-ZZ0010010-peeker-SQLNAME" value="<%=TypeConverter.sanitizer(aZZ0010010Control.getSqlName()) %>">
    <input type="hidden" id="expj-ZZ0010010-peeker-TARGET_WINDOW" value="<%=TypeConverter.sanitizer(aZZ0010010Control.getTargetWindow()) %>">
    <input type="hidden" id="expj-ZZ0010010-peeker-TARGET_FIELD" value="<%=TypeConverter.sanitizer(aZZ0010010Control.getTargetField()) %>">
    <input type="hidden" id="expj-ZZ0010010-peeker-FLASH_NAME" value="<%=TypeConverter.sanitizer(aZZ0010010Control.getTargetFlashName()) %>">
    
    <!-- PEEKER-VIEW���� -->
    <div id="expj-ZZ0010010-peeker-datagrid" style="position: static; width: 100%; height: calc(100% - 53px);">
      <div class="data-grid-table" style="margin-right:5px; height:100%; box-sizing:border-box;">
          
        <!-- �e�[�u���`�敔�� -->
        <div id="expj-ZZ0010010-peeker-table-view-wrapper" class="expj-datagrid-view expj-view-single" data-orftype="DataGrid" data-mode="VIEW" style="height:calc(100% - 32px);"></div>
          
        <!-- �{�^���̍s -->
        <div class="div-tr" style="height: 32px;">
          <div class="div-td align-right" style="width:100%;">
            <div class="datagrid-button-field-cell frame07 button-area" style="width: 12px;"></div>
            <div class="datagrid-button-field-cell frame08 button-area" style="width: 315px;">
              <table data-orftype="DataGrid" data-mode="BUTTON" style="width: 315px; height: 100%;margin-top:5px;">
                <tbody>
                  <tr>
                    <td><button type="button" id="expj-ZZ0010010-peeker-setcondition-button" name="SetCondition" style="width: 100px" class="ZZ0010010-focus-move" onclick="expj.ZZ0010010.executePeekerDetailDialog()"><%=CoreTools.getRBString("Expj.BtnSetCondition",rb) %></button></td>
                    <td><button type="button" name="ShowAll" style="width: 100px;" class="ZZ0010010-focus-move" onclick="expj.ZZ0010010.executeSearchAllElement()"><%=CoreTools.getRBString("Expj.BtnShowAll",rb) %></button></td>
                    <td><button type="button" id="expj-ZZ0010010-peeker-setfield-button" class="ZZ0010010-focus-move" name="SetField" style="width: 100px;" onclick="expj.ZZ0010010.executeSettingSelectValueOnPeeker()" disabled="disabled"><%=CoreTools.getRBString("Expj.BtnDecide",rb) %></button></td>
                  </tr>
                </tbody>
              </table>
            </div>
            <div class="datagrid-button-field-cell frame09 button-area-right" style="width: 60px;"></div>
            <div class="datagrid-button-field-cell frame10"></div>
            <div class="datagrid-button-field-cell frame11"></div>
          </div><!-- td -->
        </div><!-- tr -->
      </div><!-- data-grid-table -->
    </div>
    <!-- PEEKER-VIEW����(END) -->
    
    <!-- �t�b�^�[�̏�̗]������ -->
    <div class="div-tr" style="height: 5px;">
      <div class="div-td" style="width: 100%;"></div>
    </div> <!-- tr -->

    <!-- �t�b�^�[ (�o�[�W�����\���ƃ{�^��) -->
    <div class="expj-tr">
      <div class="expj-td under-gradation" style="width:100%;">
        <div class="div-table" style="width:100%;">
          <div class="div-tr">
            <div class="div-td" style="width:calc(100% - 107px); float:left;padding-top:19px">
<%
SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
String dateTime = sdf.format(new Date());
%>
              <span class="version">ZZ0010010&nbsp;Revision:&nbsp;2.0&nbsp;<%= dateTime %></span>
            </div><!-- /td -->
            <div class="div-td" style="width:105px;">
              <div data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
                <div class = "div-tr">
                  <div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" class="ZZ0010010-focus-move" id="expj-business-screen-close-btn-ZZ0010010"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button></div><!-- /td -->
                </div><!-- /tr -->
              </div><!-- /DataGridTable -->
            </div><!-- /td -->
          </div><!-- /tr -->
        </div><!-- /table2 -->
      </div><!-- /td -->
    </div><!-- /tr -->
  <!-- �t�b�^�[ (�o�[�W�����\���ƃ{�^��) -->
  </div>
  <!-- �ڍ׃_�C�A���O -->
  <div id="expj-ZZ0010010-detail-dialog" title="Detail Window" data-orftype="DataGrid" data-mode="DETAIL">
  </div>
  <!-- �ڍ׃_�C�A���O�i�����܂Łj -->
</div>

<%
    MessageStruct msgStruct = aZZ0010010Control.getMsgStruct();
%>
<%@include file="common/SetServerMessage.jsp" %>
<%
if(aZZ0010010Control.isNewData() == true){
    StringBuffer peekerHeaderBuffer = new StringBuffer();
    StringBuffer peekerDataBuffer = new StringBuffer();
    
    List columnNameList = aZZ0010010Control.getColumnNameList();
    List columnTypeList = aZZ0010010Control.getColumnTypeList();
    List dataArray = aZZ0010010Control.getDataArray();
    List columnStringLength = aZZ0010010Control.getColumnLength();
    List columnStringPxLength = aZZ0010010Control.getColumnPxLength();
    int rowCount = aZZ0010010Control.getDispRowCount();
    int columnCount = aZZ0010010Control.getColumnCount();
    int columnPx = 0;
    String alignString = "";
    String sortTypeString = "";

    List displayMLangList = aZZ0010010Control.getDisplayMLangList();
    int displayMLangCount = aZZ0010010Control.getDisplayMLangSize();

    peekerHeaderBuffer.append("{ 'visible' : false },");
    for (int i = 0; i < columnCount; ++i ) {
        if (((Integer)columnTypeList.get(i)).intValue() == Types.NUMERIC) {
            alignString = "table-column-right";
            sortTypeString = "numeric";
        }
        else {
            alignString = "";
            sortTypeString = "string";
        }
        columnPx = ((Integer)columnStringPxLength.get(i)).intValue();

        if(i < displayMLangCount) {
            peekerHeaderBuffer.append("{ 'visible' : true, type: '" + sortTypeString + "',");
            peekerHeaderBuffer.append(" 'title':'" + TypeConverter.sanitizer(displayMLangList.get(i)) + "',");
            peekerHeaderBuffer.append(" 'name':'col" + i + "',");
            if (!alignString.isEmpty()) {
                peekerHeaderBuffer.append(" 'class':'expj-tooltip expj-peeker-tooltip-customs " + alignString + "',");
            } else {
                peekerHeaderBuffer.append(" 'class':'expj-tooltip expj-peeker-tooltip-customs',");
            }
            peekerHeaderBuffer.append(" 'width':'" + columnPx + "px',");
            peekerHeaderBuffer.append(" 'sortable': true");
            peekerHeaderBuffer.append(" }");
        } else {
            peekerHeaderBuffer.append("{ 'visible' : true, type: '" + sortTypeString + "',");
            peekerHeaderBuffer.append(" 'title':'',");
            peekerHeaderBuffer.append(" 'name':'col" + i + "',");
            if (!alignString.isEmpty()) {
                peekerHeaderBuffer.append(" 'class':'expj-tooltip expj-peeker-tooltip-customs " + alignString + "',");
            } else {
                peekerHeaderBuffer.append(" 'class':'expj-tooltip expj-peeker-tooltip-customs',");
            }
            peekerHeaderBuffer.append(" 'width':'" + columnPx + "px',");
            peekerHeaderBuffer.append(" 'sortable': true");
            peekerHeaderBuffer.append(" }");
        }
        if (i + 1 < columnCount) {
            peekerHeaderBuffer.append(",");
        }
    }
    if (columnCount <= 0) {
        peekerHeaderBuffer.append("{ 'title' : '&nbsp;' }");
    }

    for (int h = 0; h < rowCount; ++h ) {
        String[] columnDataList = (String[])dataArray.get(h);

        peekerDataBuffer.append("[");
        peekerDataBuffer.append("'" + h + "', ");
        for (int j  =  0; j < columnCount; ++j ) {
            String data = TypeConverter.sanitizer(columnDataList[j]);
            peekerDataBuffer.append("'<span>" + data + "</span>'");
            if (j + 1 < columnCount) {
                peekerDataBuffer.append(", ");
            }
        }
        peekerDataBuffer.append("]");
        if (h + 1 < rowCount) {
            peekerDataBuffer.append(",");
        }
    }
    
    StringBuffer detailHeaderBuffer = new StringBuffer();
    StringBuffer detailDataBuffer = new StringBuffer();
    
    detailHeaderBuffer.append("{ 'visible' : false },");
    detailHeaderBuffer.append("{ 'sortable' : false, 'visible' : true, 'width' : '115px', 'class' : 'table-column-right' },");
    detailHeaderBuffer.append("{ 'sortable' : false, 'visible' : true, 'width' : '215px', 'class' : 'expj-view-cell-input-header' },");
    detailHeaderBuffer.append("{ 'sortable' : false, 'visible' : true, 'width' : '115px' }");
    
    List filterCommentList = aZZ0010010Control.getFilterCommentList();
    int filterCommentCount = aZZ0010010Control.getFilterCommentSize();

    List filterMLangList = aZZ0010010Control.getFilterMLangList();
    int filterMLangCount = aZZ0010010Control.getFilterMLangSize();

    List sqlParameterList = aZZ0010010Control.getSqlParameterList();
    int sqlParameterCount = aZZ0010010Control. getSqlParameterSize();

    List sqlParameterFlgList = aZZ0010010Control.getSqlParameterFlgList();
    int setKeyFilterPosition = aZZ0010010Control.getSetKeyFilterPosition();

    int[] filterChangeableFlg = aZZ0010010Control.getFilterChangeableFlg();
    
    StringBuffer showAllParam = new StringBuffer();
    StringBuffer selectParam = new StringBuffer();

    for (int k = 0; k < filterMLangCount; ++k ) {
        detailDataBuffer.append("[");
        detailDataBuffer.append("'" + (k + 1) + "', ");
        detailDataBuffer.append("'" + TypeConverter.sanitizer(filterMLangList.get(k)) + "', ");

        if (((Boolean)(sqlParameterFlgList.get(k))).booleanValue()==false){
            selectParam.append("'FILTER_").append(k + 1).append("%=%' + ").append("$('#expj-business-screen-ZZ0010010-ZZ0010010detail1-FILTER_").append(k + 1).append("').val() + '%&%' + ");
            showAllParam.append("FILTER_").append(k + 1).append("%=%%&%");
            detailDataBuffer.append("'<input type=\"text\" ");
            detailDataBuffer.append("value=\"").append(TypeConverter.sanitizer(sqlParameterList.get(k))).append("\" ");
            detailDataBuffer.append("id=\"expj-business-screen-ZZ0010010-ZZ0010010detail1-FILTER_").append(k + 1).append("\" ");
            detailDataBuffer.append("class=\"expj-view-cell-input\" style=\"width : 100%\">', ");
        } else if (filterChangeableFlg[k] == 1) {
            selectParam.append("'SQLPARAM_").append(k + 1).append("%=%' + ").append("$('#expj-business-screen-ZZ0010010-ZZ0010010detail1-SQLPARAM_").append(k + 1).append("').val() + '%&%' + ");
            showAllParam.append("SQLPARAM_").append(k + 1).append("%=%%%&%");
            detailDataBuffer.append("'<input type=\"text\" ");
            detailDataBuffer.append("value=\"").append(TypeConverter.sanitizer(sqlParameterList.get(k))).append("\" ");
            detailDataBuffer.append("id=\"expj-business-screen-ZZ0010010-ZZ0010010detail1-SQLPARAM_").append(k + 1).append("\" ");
            detailDataBuffer.append("class=\"expj-view-cell-input\" style=\"width : 100%\">', ");
        } else {
            selectParam.append("'SQLPARAM_").append(k + 1).append("%=%' + ").append("$('#expj-business-screen-ZZ0010010-ZZ0010010detail1-SQLPARAM_").append(k + 1).append("').val() + '%&%' + ");
            showAllParam.append("SQLPARAM_").append(k + 1).append("%=%' + ").append("$('#expj-business-screen-ZZ0010010-ZZ0010010detail1-SQLPARAM_").append(k + 1).append("').val() + '%&%");
            detailDataBuffer.append("'<input type=\"text\" ");
            detailDataBuffer.append("value=\"").append(TypeConverter.sanitizer(sqlParameterList.get(k))).append("\" ");
            detailDataBuffer.append("id=\"expj-business-screen-ZZ0010010-ZZ0010010detail1-SQLPARAM_").append(k + 1).append("\" ");
            detailDataBuffer.append("class=\"expj-view-cell-input\" style=\"width : 100%\" disabled=\"disabled\">', ");
        }
        selectParam.append("'COMMENT_").append(k + 1).append("%=%' + ").append("document.getElementById('expj-business-screen-ZZ0010010-ZZ0010010detail1-COMMENT_").append(k + 1).append("').innerHTML + '");
        showAllParam.append("COMMENT_").append(k + 1).append("%=%' + ").append("document.getElementById('expj-business-screen-ZZ0010010-ZZ0010010detail1-COMMENT_").append(k + 1).append("').innerHTML + '");
        detailDataBuffer.append("'<span id=\"expj-business-screen-ZZ0010010-ZZ0010010detail1-COMMENT_").append(k + 1).append("\">");
        detailDataBuffer.append(TypeConverter.sanitizer(aZZ0010010Control.getFilterComment(k)));
        detailDataBuffer.append("</span>'");
        
        detailDataBuffer.append("]");
        
        if (k + 1 < filterMLangCount) {
            selectParam.append("%&%' + ");
            showAllParam.append("%&%");
            detailDataBuffer.append(",");
        } else {
            selectParam.append("'");
        }
    }
%>
<script>
expj.ZZ0010010 = {};
expj.common.viewInstanceMap.ZZ0010010 = {};
expj.common.detailDialogMap.ZZ0010010 = {};

// �Ɩ����(ZZ0010010)�̏������֐�
expj.ZZ0010010.executeScreenLoad = function () {
  var viewInstanceMap = expj.common.viewInstanceMap.ZZ0010010;
  var detailDialogMap = expj.common.detailDialogMap.ZZ0010010;
  // DataGrid(VIEW)�̏�����
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var expj_peeker_body_data = [<%=peekerDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
  var expj_peeker_header_data = [<%=peekerHeaderBuffer.toString() %>];
  viewInstanceMap.mainTable = expj.common.createOrteusViewInstance('#expj-ZZ0010010-peeker-table-view-wrapper', expj_peeker_header_data, expj_peeker_body_data, true, 'single', expj.ZZ0010010.executePeekerOnRowSelected);
  
  // �ڍ׃E�B���h�E�i���e�j�̏�����
  // �ڍ׃E�B���h�E�̃{�f�B�f�[�^
  var expj_peeker_detail_body_data =  [<%=detailDataBuffer.toString() %>];
  // �ڍ׃E�B���h�E�̃w�b�_�[�f�[�^
  var expj_peeker_detail_header_data = [<%=detailHeaderBuffer.toString() %>];
  // �ڍ׃E�B���h�E��DataTables�̃C���X�^���X
  viewInstanceMap.detailTable = expj.common.createOrteusViewInstance('#expj-ZZ0010010-detail-dialog', expj_peeker_detail_header_data, expj_peeker_detail_body_data, true, 'none', null);
  
  // �ڍ׃E�B���h�E�̏�����  
  detailDialogMap.detailWindow = {};
  var buttonsJson = {
    '<%=CoreTools.getRBString("Expj.BtnSearch",rb) %>':function() {
      expj.ZZ0010010.executeSearchOnDetailDialog();
    }
  };
  detailDialogMap.detailWindow.dialogInstance = expj.common.createDetailWindowInstance('#expj-ZZ0010010-detail-dialog', false, '491', '300', buttonsJson);
  detailDialogMap.detailWindow.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.ZZ0010010.detailWindow.visible = true;
      //open���Afocus�pclass�ƃC�x���g�ǉ�
      $('#expj-ZZ0010010-detail-dialog').find('.expj-view-cell-input').each(function(){
        var targetInput = $(this);
        targetInput.addClass('ZZ0010010-focus-move');
      });
      $('#expj-ZZ0010010-detail-dialog').parent().find('button').each(function(){
        var targetButton = $(this);
        targetButton.addClass('ZZ0010010-focus-move');
      });
      var targetSelector =  $('#expj-ZZ0010010-detail-dialog').parent().find('.ZZ0010010-focus-move');
      expj.common.ui.setupFocusMovePeekerDetailWindow(targetSelector, '.ZZ0010010-focus-move');
    },
    'close' : function (event) {
      expj.common.detailDialogMap.ZZ0010010.detailWindow.visible = false;
      
      //close���Afocus�pclass�ƃC�x���g�폜
      //obj.removeClass(focusClass).unbind('keydown.radio');
      $('#expj-ZZ0010010-detail-dialog').parent().find('.ZZ0010010-focus-move').each(function(){
        var targetInput = $(this);
        targetInput.removeClass('ZZ0010010-focus-move').unbind('keydown');
      });
    }
  });
  detailDialogMap.detailWindow.visible = false;
  detailDialogMap.detailWindow.hidden = false;
  
  expj.common.ui.tooltip.create('expj-ZZ0010010-peeker-table-view-wrapper');
  
  $('#expj-ZZ0010010-detail-dialog table.dataTable td').css('height', '14px');
  
  // �R���\�[���o��
  expj.common.setScreenFrameConsoleMessage('<%=messageString %>');
  
  expj.common.ui.setupFocusMove('.ZZ0010010-focus-move');
  $('#expj-ZZ0010010-peeker-setcondition-button').focus();
};

// ���������ݒ�{�^�����N���b�N�������Ɏ��s����鏈�����`�����֐�
expj.ZZ0010010.executePeekerDetailDialog = function () {
  // �ڍ׃E�B���h�E�\���ʒu�𒲐�
  expj.common.detailDialogMap.ZZ0010010.detailWindow.dialogInstance.dialog('option', 'position', {
    // �_�C�A���O�̏ꏊ�w��: http://jquery.keicode.com/ui/dialog-position.php
    'my': 'right top',
    'at': 'right-8 top+105',
    'of': $(window)
  });
  // �ڍ׃E�B���h�E�̋N��
  expj.common.detailDialogMap.ZZ0010010.detailWindow.dialogInstance.dialog('open');
  $('#expj-ZZ0010010-peeker-setcondition-button').focus();
};

// �I�������s�̃f�[�^���i�[�����ϐ�
expj.ZZ0010010.peekerSelectRowData = null;

// �\�̍s��I���������Ɏ��s�����֐�
expj.ZZ0010010.executePeekerOnRowSelected = function (event) {
  // �I���s�̃G�������g���擾
  var row = $(event.currentTarget).find('td');
  var rowData = [];
  for (var i = 0; i < row.length; i++) {
    if (row[i].childNodes.length > 0) {
      rowData.push(row[i].childNodes[0].textContent);
    } else {
      rowData.push('');
    }
  }
  // �I�����ꂽ�i�ڔԍ���ێ�(�m��{�^���őJ�ڌ�̉�ʂŕ\�����邽��)
  expj.ZZ0010010.peekerSelectRowData = rowData;
  // �m��{�^����L��������
  $('#expj-ZZ0010010-peeker-setfield-button').removeAttr('disabled');
};

// �ڍ׃E�B���h�E�́u�����v�{�^�����N���b�N�������Ɏ��s�����֐�
expj.ZZ0010010.executeSearchOnDetailDialog = function () {
  // �p�����[�^�̐���
  expj.common.controlLoadingScreen(true);
  setTimeout(function () {
    var parameterValues = '';
    parameterValues += 'Select%=%<%=CoreTools.getRBString("Expj.BtnSearch",rb) %>%&%';
    parameterValues += 'SQLNAME%=%' + $('#expj-ZZ0010010-peeker-SQLNAME').val() + '%&%';
    parameterValues += 'TARGET_WINDOW%=%' + $('#expj-ZZ0010010-peeker-TARGET_WINDOW').val() + '%&%';
    parameterValues += 'TARGET_FIELD%=%' + $('#expj-ZZ0010010-peeker-TARGET_FIELD').val() + '%&%';
    parameterValues += 'FLASH_NAME%=%' + $('#expj-ZZ0010010-peeker-FLASH_NAME').val() + '%&%';
    parameterValues += <%=selectParam.toString() %> + '%&%';
    parameterValues += 'undefined%=%%&%';
    parameterValues += 'SUBMIT_BUTTON_TYPE%=%0%&%';
    parameterValues += 'NEW_SCREEN_FLG%=%FALSE';
    // ��ʂ̍X�V
    expj.common.updatePeekerPage(parameterValues, true);
  }, expj.common.screenFrameLoadingTime);
};

// �u�S���\���v�{�^�����N���b�N�������Ɏ��s�����֐�
expj.ZZ0010010.executeSearchAllElement = function () {
  // �p�����[�^�̐���
  expj.common.controlLoadingScreen(true);
  setTimeout(function () {
    var parameterValues = '';
    parameterValues += 'ShowAll%=%<%=CoreTools.getRBString("Expj.BtnShowAll",rb) %>%&%';
    parameterValues += 'SQLNAME%=%' + $('#expj-ZZ0010010-peeker-SQLNAME').val() + '%&%';
    parameterValues += 'TARGET_WINDOW%=%' + $('#expj-ZZ0010010-peeker-TARGET_WINDOW').val() + '%&%';
    parameterValues += 'TARGET_FIELD%=%' + $('#expj-ZZ0010010-peeker-TARGET_FIELD').val() + '%&%';
    parameterValues += 'FLASH_NAME%=%' + $('#expj-ZZ0010010-peeker-FLASH_NAME').val() + '%&%';
    parameterValues += '<%=showAllParam.toString() %>%&%';
    parameterValues += 'undefined%=%%&%';
    parameterValues += 'SUBMIT_BUTTON_TYPE%=%0%&%';
    parameterValues += 'NEW_SCREEN_FLG%=%FALSE';
    // ��ʂ̍X�V
    expj.common.updatePeekerPage(parameterValues, false);
  }, expj.common.screenFrameLoadingTime);
};

// �u�m��v�{�^�����N���b�N�������Ɏ��s�����֐�
expj.ZZ0010010.executeSettingSelectValueOnPeeker = function () {
  var targetField = $('#expj-ZZ0010010-peeker-TARGET_FIELD').val();
  var targetFieldList = targetField.split(':');
  var selectKey = '<%=TypeConverter.sanitizer(aZZ0010010Control.getSetKeyPosition()) %>';
  var selectKeyList = selectKey.split(':');
  var counter = 0;
  if (targetFieldList.length < selectKeyList.length) {
    counter = targetFieldList.length;
  } else {
    counter = selectKeyList.length;
  }
  for (var i = 0; i < counter; i++) {
    var key = Number(selectKeyList[i]);
    if (isNaN(key)) {
      continue;
    }
    var fieldName = targetFieldList[i];
    if (fieldName === '') {
      continue;
    }
    var screenId = $('#expj-ZZ0010010-peeker-FLASH_NAME').val();
    var index = fieldName.indexOf("/");
    var datagridName, componentName;
    if (index !== -1) {
      datagridName = fieldName.substring(1, index);
      componentName = fieldName.substring(index + 1, fieldName.length);
    } else {
      datagridName = '';
      componentName = '';
    }
    var targetId = 'expj-' + screenId + '-' + datagridName + '-' + componentName;
    var target = document.getElementById(targetId);
    if (target !== null) {
      expj.common.pscript.setComponentValue(targetId, expj.ZZ0010010.peekerSelectRowData[key]);
    }
  }
  expj.common.deleteBusinessScreen('ZZ0010010');
  expj.common.clearScreenFrameConsoleMessage();
  expj.common.activateBusinessScreenTabPage(screenId);
};
</script>
<%
}
%>
</body>
</html>
