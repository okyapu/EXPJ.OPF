<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:37:33 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0180\AE0180010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0180.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
 HttpSession so = request.getSession(false);
 String locale = (String)so.getAttribute("LOCALE");
 ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);
 ResourceBundle rbs = CoreTools.getResourceBundle("OrteusSysDic", locale);
 response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
 response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>
<jsp:useBean id="aAE0180010Control" class="com.nec.jp.orteus.metamorBase.AE0180.AE0180010Control" scope="request"/>
<jsp:useBean id="aAE0180010Struct" class="com.nec.jp.orteus.metamorBase.AE0180.AE0180010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�����v��CSV�捞���
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/jsp/AE0180010.jsp,v $
$Author: geng-jia $	
$Revision: 1.7 $�@$Date: 2017/02/22 02:05:31 $
********************************************************* --%>
<html>
<head>
<title>�����v��CSV�捞���</title>
<%@include file="common/expj_v5.jsp" %>

<%-- ********** Generated section begin ********** --%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%
 //For DETAIL
 String detailId = null;
 String detailFloat = null;
 int detailWidth = -1;
 int detailHeight = -1;
 String detailViewId = null;
 StringBuffer detailViewHeaderData = null;
 StringBuffer detailViewBodyData = null;
 String detailViewSelect = null;
 String detailViewResize = null;
 String detailViewScroll = null;
 //For TREE
 String treeId = null;
 String treeXmlData = null;
 //For VIEW
 List viewIdList = new ArrayList();
 List viewHeaderDataList = new ArrayList();
 List viewBodyDataList = new ArrayList();
 List viewSelectList = new ArrayList();
 List viewResizeList = new ArrayList();
 List viewScrollList = new ArrayList();
 Map viewSelectEvent = new HashMap();
 Map treeClickEvent = new HashMap();
%>
<script class="expj-script-AE0180010_init">
  // AE0180010���O���
  expj.AE0180010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <%@include file="common/upload.jsp" %>
  <div id="expj-business-screen-AE0180010" data-screen="AE0180010" data-newdata="<%=aAE0180010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <!-- �����ɏ�i���������p��DataGrid��z�u����B�� -->
			  <script class="expj-script-AE0180010-AE0180010form1">
expj.AE0180010.AE0180010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AE0180010.AE0180010form1.onLoad0 = function () {
  console.log('AE0180010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0180010.AE0180010form1.onDecision0 = function () {
  console.log('AE0180010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0180010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?AE0180010view/$[eq]0@*2,3"
expj.AE0180010.AE0180010form1.onDecision1 = function () {
  console.log('AE0180010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0180010', 'AE0180010form1', '?AE0180010view/$'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;0;UNMASK;_AE0180010button1/CsvIn"
expj.AE0180010.AE0180010form1.child0 = function () {
  console.log('AE0180010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AE0180010', 'AE0180010form1', '_AE0180010button1/CsvIn');
};
// script5="child;1;MASK;_AE0180010button1/CsvIn"
expj.AE0180010.AE0180010form1.child1 = function () {
  console.log('AE0180010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AE0180010', 'AE0180010form1', '_AE0180010button1/CsvIn');
};
// script6="child;2;MASK;_AE0180010button0/CSVOut"
expj.AE0180010.AE0180010form1.child2 = function () {
  console.log('AE0180010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AE0180010', 'AE0180010form1', '_AE0180010button0/CSVOut');
};
// script7="child;3;UNMASK;_AE0180010button0/CSVOut"
expj.AE0180010.AE0180010form1.child3 = function () {
  console.log('AE0180010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0180010', 'AE0180010form1', '_AE0180010button0/CSVOut');
};
expj.AE0180010.AE0180010form1.executeAllOnDecision = function () {
  console.log('execute AE0180010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0180010.AE0180010form1['onDecision' + i])) {
        expj.AE0180010.AE0180010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0180010.AE0180010form1.executeOnLoad = function () {
  expj.AE0180010.AE0180010form1.executePScriptOnLoad();
};

expj.AE0180010.AE0180010form1.executePScriptOnLoad = function () {
  console.log('execute AE0180010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0180010.AE0180010form1['onLoad' + i])) {
      expj.AE0180010.AE0180010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0180010-AE0180010form1" action="AE0180010Servlet" name="AE0180010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0180010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0046",rb)%></span><!-- �捞�t�@�C�� --></div><!--/td-->
<script class="expj-script-AE0180010-AE0180010form1-FileName">
expj.AE0180010.AE0180010form1.FileName = {};
expj.AE0180010.AE0180010form1.FileName.executeAllOnDecision = function () {
  console.log('execute AE0180010form1/FileName.onDecision');
  expj.AE0180010.AE0180010form1.executeAllOnDecision();
  expj.AE0180010.executeAllOnDecision();
};
expj.AE0180010.AE0180010form1.FileName.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010form1-FileName').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0180010', 'AE0180010form1', 'FileName', this);
  });
  expj.AE0180010.AE0180010form1.FileName.executePScriptOnLoad();
};

expj.AE0180010.AE0180010form1.FileName.executePScriptOnLoad = function () {
  console.log('execute AE0180010form1/FileName.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010form1-FileName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AE0180010-AE0180010form1-FileName" name="FileName" class="AE0180010-focus-move  required-value expj-AE0180010-required-A" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0180010Struct.getFileName()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0180010-AE0180010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0180010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AE0180010-AE0180010form1-DOWNLOAD_FILE">
expj.AE0180010.AE0180010form1.DOWNLOAD_FILE = {};
expj.AE0180010.AE0180010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AE0180010form1/DOWNLOAD_FILE.onDecision');
  expj.AE0180010.AE0180010form1.executeAllOnDecision();
  expj.AE0180010.executeAllOnDecision();
};
expj.AE0180010.AE0180010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0180010', 'AE0180010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AE0180010.AE0180010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AE0180010.AE0180010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AE0180010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AE0180010-AE0180010form1-h_INSTALL_FLG" name="h_INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0180010Struct.geth_INSTALL_FLG()) %>">
<script class="expj-script-AE0180010-AE0180010form1-h_INSTALL_FLG">
expj.AE0180010.AE0180010form1.h_INSTALL_FLG = {};
expj.AE0180010.AE0180010form1.h_INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0180010form1/h_INSTALL_FLG.onDecision');
  expj.AE0180010.AE0180010form1.executeAllOnDecision();
  expj.AE0180010.executeAllOnDecision();
};
expj.AE0180010.AE0180010form1.h_INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010form1-h_INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0180010', 'AE0180010form1', 'h_INSTALL_FLG', this);
  });
  expj.AE0180010.AE0180010form1.h_INSTALL_FLG.executePScriptOnLoad();
};

expj.AE0180010.AE0180010form1.h_INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0180010form1/h_INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010form1-h_INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- �����ɏ�i���������p��DataGrid��z�u����B�� --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0180010-AE0180010button1">
expj.AE0180010.AE0180010button1 = {};
expj.AE0180010.AE0180010button1.executeAllOnDecision = function () {
  console.log('execute AE0180010button1.onDecision');
};
expj.AE0180010.AE0180010button1.executeOnLoad = function () {
  expj.AE0180010.AE0180010button1.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button1.executePScriptOnLoad = function () {
  console.log('execute AE0180010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0180010-AE0180010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0180010-AE0180010button1-Browse">
expj.AE0180010.AE0180010button1.Browse = {};
// script1="onClick;0;FILEDLG;_AE0180010form1/FileName"
expj.AE0180010.AE0180010button1.Browse.onClick0 = function () {
  console.log('Browse script1');
expj.common.pscript.openFileDialog('AE0180010', 'AE0180010button1', '_AE0180010form1/FileName');
};
expj.AE0180010.AE0180010button1.Browse.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0180010.AE0180010button1.Browse['onClick' + i])) {
        expj.AE0180010.AE0180010button1.Browse['onClick' + i]();
      }
    }
  }
};
expj.AE0180010.AE0180010button1.Browse.executeAllOnDecision = function () {
};
expj.AE0180010.AE0180010button1.Browse.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010button1-Browse').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0180010', 'AE0180010button1', 'Browse', this, 'Button');
    }
  });
  expj.AE0180010.AE0180010button1.Browse.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button1.Browse.executePScriptOnLoad = function () {
  console.log('execute AE0180010button1/Browse.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010button1-Browse');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0180010-AE0180010button1-Browse" name="Browse" class="AE0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBrowse",rb)%></button><!-- �Q�ƃ{�^�� --></div><!--/td-->
<script class="expj-script-AE0180010-AE0180010button1-CsvIn">
expj.AE0180010.AE0180010button1.CsvIn = {};
// script1="onClick;0;FILEUPLOAD;AE0180010Servlet"
expj.AE0180010.AE0180010button1.CsvIn.onClick0 = function () {
  console.log('CsvIn script1');
expj.common.pscript.executeFileUpload('AE0180010', 'AE0180010button1', 'AE0180010Servlet');
};
expj.AE0180010.AE0180010button1.CsvIn.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0180010.AE0180010button1.CsvIn['onClick' + i])) {
        expj.AE0180010.AE0180010button1.CsvIn['onClick' + i]();
      }
    }
  }
};
expj.AE0180010.AE0180010button1.CsvIn.executeAllOnDecision = function () {
};
expj.AE0180010.AE0180010button1.CsvIn.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010button1-CsvIn').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0180010', 'AE0180010button1', 'CsvIn', this, 'Button');
    }
  });
  expj.AE0180010.AE0180010button1.CsvIn.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button1.CsvIn.executePScriptOnLoad = function () {
  console.log('execute AE0180010button1/CsvIn.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010button1-CsvIn');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0180010-AE0180010button1-CsvIn" name="CsvIn" class="AE0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvIn",rb)%></button><!-- �捞�{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- �����ɉ��i�����e�i���X�p��DataGrid��z�u����B�� --><script class="expj-script-AE0180010-AE0180010view">
expj.AE0180010.AE0180010view = {};
expj.AE0180010.AE0180010view.executeAllOnClick = function () {
};
expj.AE0180010.AE0180010view.executeAllOnDecision = function () {
  console.log('execute AE0180010view.onDecision');
};
expj.AE0180010.AE0180010view.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0180010view", "expj.AE0180010.AE0180010view.executeAllOnClick");
%>
  expj.AE0180010.AE0180010view.executePScriptOnLoad();
};

expj.AE0180010.AE0180010view.executePScriptOnLoad = function () {
  console.log('execute AE0180010view.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0180010-AE0180010view" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAE0180010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AE0180010view_Id = "AE0180010view";
 String AE0180010view_select = "single";
 String AE0180010view_sortable = "true";
 String AE0180010view_resize = "true";
 String AE0180010view_scroll = "true";
 StringBuffer AE0180010view_HB = new StringBuffer();
 StringBuffer AE0180010view_DB = new StringBuffer();
%>
<%
 AE0180010view_select = "none";
 AE0180010view_sortable = "true";
 AE0180010view_resize = "true";
 AE0180010view_scroll = "true";
%>
<%
 AE0180010view_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
%>
     
<%
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3094",rb))).append("', 'name':'l_ERROR_IN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3095",rb))).append("', 'name':'l_ERR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3098",rb))).append("', 'name':'l_ERR_INFO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'145px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6220",rb))).append("', 'name':'l_ERR_CTR_NM', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ERR_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE_1",rb))).append("', 'name':'l_ERR_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE_1",rb))).append("', 'name':'l_ERR_PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'75px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb))).append("', 'name':'l_ERR_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_ERR_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_ERR_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_1",rb))).append("', 'name':'l_ERR_CONFIRM_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_2",rb))).append("', 'name':'l_ERR_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_COMMENT_3",rb))).append("', 'name':'l_ERR_WORK_IN_PROC_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_FLG",rb))).append("', 'name':'l_ERR_NON_NO_ITEM_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_NAME",rb))).append("', 'name':'l_ERR_NON_NO_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_TYP",rb))).append("', 'name':'l_ERR_NON_NO_ITEM_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_PUCH_ODR_UNIT",rb))).append("', 'name':'l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'l_ERR_UNIT_COST_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb))).append("', 'name':'l_ERR_ACTUAL_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST",rb))).append("', 'name':'l_ERR_PROCESSING_COST', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST",rb))).append("', 'name':'l_ERR_MATERIAL_COST', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb))).append("', 'name':'l_ERR_OTHER_OVERHEADS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NET_AMOUNT",rb))).append("', 'name':'l_ERR_NET_AMOUNT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXCH_RATE",rb))).append("', 'name':'l_ERR_EXCH_RATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXPENSE_CLASS_CD",rb))).append("', 'name':'l_ERR_EXPENSE_CLASS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEPT_CD",rb))).append("', 'name':'l_ERR_DEPT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PJ_CD",rb))).append("', 'name':'l_ERR_PJ_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SEG_CONTENTS1",rb))).append("', 'name':'l_ERR_SEG_CONTENTS1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SEG_CONTENTS2",rb))).append("', 'name':'l_ERR_SEG_CONTENTS2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SEG_CONTENTS3",rb))).append("', 'name':'l_ERR_SEG_CONTENTS3', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
AE0180010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SEG_CONTENTS4",rb))).append("', 'name':'l_ERR_SEG_CONTENTS4', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0180010view_sortable).append("}").append(",");
%>
<%
 int aAE0180010StructLength = aAE0180010Control.getListsize();
 final AE0180010Struct structBackup = aAE0180010Struct;
 aAE0180010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0180010StructLength; ++loopCount) {
  if((aAE0180010Struct = (AE0180010Struct) aAE0180010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0180010Struct", aAE0180010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0180010view_DB.append("[");
 AE0180010view_DB.append(loopCount);
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERROR_IN-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERROR_IN\" data-name=\"l_ERROR_IN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERROR_IN())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_TYP\" data-name=\"l_ERR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_TYP())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_INFO-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_INFO\" data-name=\"l_ERR_INFO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_INFO())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_CTR_NM-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_CTR_NM\" data-name=\"l_ERR_CTR_NM\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_CTR_NM())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_ITEM_CD\" data-name=\"l_ERR_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_ITEM_CD())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_PRD_DUE_DATE\" data-name=\"l_ERR_PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_PRD_DUE_DATE())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_PUCH_ODR_DLV_DATE\" data-name=\"l_ERR_PUCH_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_PUCH_ODR_DLV_DATE())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_PUCH_ODR_QTY\" data-name=\"l_ERR_PUCH_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_PUCH_ODR_QTY())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_VEND_CD\" data-name=\"l_ERR_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_VEND_CD())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_JOB_ODR_CD\" data-name=\"l_ERR_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_JOB_ODR_CD())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_CONFIRM_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_CONFIRM_DLV_DATE\" data-name=\"l_ERR_CONFIRM_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_CONFIRM_DLV_DATE())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_WH_CD\" data-name=\"l_ERR_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_WH_CD())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_WORK_IN_PROC_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_WORK_IN_PROC_COMMENT\" data-name=\"l_ERR_WORK_IN_PROC_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_WORK_IN_PROC_COMMENT())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_FLG-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_FLG\" data-name=\"l_ERR_NON_NO_ITEM_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_NON_NO_ITEM_FLG())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_NAME\" data-name=\"l_ERR_NON_NO_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_NON_NO_ITEM_NAME())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_TYP\" data-name=\"l_ERR_NON_NO_ITEM_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_NON_NO_ITEM_TYP())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT\" data-name=\"l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_UNIT_COST_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_UNIT_COST_TYP\" data-name=\"l_ERR_UNIT_COST_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_UNIT_COST_TYP())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_ACTUAL_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_ACTUAL_UNIT_PRICE\" data-name=\"l_ERR_ACTUAL_UNIT_PRICE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_ACTUAL_UNIT_PRICE())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_PROCESSING_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_PROCESSING_COST\" data-name=\"l_ERR_PROCESSING_COST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_PROCESSING_COST())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_MATERIAL_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_MATERIAL_COST\" data-name=\"l_ERR_MATERIAL_COST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_MATERIAL_COST())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_OTHER_OVERHEADS-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_OTHER_OVERHEADS\" data-name=\"l_ERR_OTHER_OVERHEADS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_OTHER_OVERHEADS())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_NET_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_NET_AMOUNT\" data-name=\"l_ERR_NET_AMOUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_NET_AMOUNT())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_EXCH_RATE-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_EXCH_RATE\" data-name=\"l_ERR_EXCH_RATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_EXCH_RATE())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_EXPENSE_CLASS_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_EXPENSE_CLASS_CD\" data-name=\"l_ERR_EXPENSE_CLASS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_EXPENSE_CLASS_CD())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_DEPT_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_DEPT_CD\" data-name=\"l_ERR_DEPT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_DEPT_CD())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_PJ_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_PJ_CD\" data-name=\"l_ERR_PJ_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_PJ_CD())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS1-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS1\" data-name=\"l_ERR_SEG_CONTENTS1\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_SEG_CONTENTS1())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS2-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS2\" data-name=\"l_ERR_SEG_CONTENTS2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_SEG_CONTENTS2())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS3-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS3\" data-name=\"l_ERR_SEG_CONTENTS3\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_SEG_CONTENTS3())).append("</span>'");
 AE0180010view_DB.append(",").append("'<span id=\"expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS4-").append(loopCount).append("\" class=\"expj-label expj-AE0180010-AE0180010view-l_ERR_SEG_CONTENTS4\" data-name=\"l_ERR_SEG_CONTENTS4\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0180010Struct.getl_ERR_SEG_CONTENTS4())).append("</span>'");
 AE0180010view_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0180010StructLength) {
   AE0180010view_DB.append(",");
  }
 }
 aAE0180010Struct = structBackup;
 viewIdList.add(AE0180010view_Id);
 viewSelectList.add(AE0180010view_select);
 viewResizeList.add(AE0180010view_resize);
 viewScrollList.add(AE0180010view_scroll);
 viewHeaderDataList.add(AE0180010view_HB);
 viewBodyDataList.add(AE0180010view_DB);
%>
<%
}
%>
<!-- �����ɉ��i�����e�i���X�p��DataGrid��z�u����B�� --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-right" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 430px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0180010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AE0180010-AE0180010button0">
expj.AE0180010.AE0180010button0 = {};
expj.AE0180010.AE0180010button0.executeAllOnDecision = function () {
  console.log('execute AE0180010button0.onDecision');
};
expj.AE0180010.AE0180010button0.executeOnLoad = function () {
  expj.AE0180010.AE0180010button0.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button0.executePScriptOnLoad = function () {
  console.log('execute AE0180010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0180010-AE0180010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0180010-AE0180010button0-Execute">
expj.AE0180010.AE0180010button0.Execute = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0180010form1/*@AE0180010Servlet,,$AE60006"
expj.AE0180010.AE0180010button0.Execute.onClick0 = function () {
  console.log('Execute script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0180010', 'AE0180010button0', '_AE0180010form1/*', 'AE0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0180010', response);
expj.common.updateBusinessScreenTab('AE0180010', contents);
};
expj.common.pscript.callConfirm('AE0180010', 'AE0180010button0', 'AE60006', okEvent);
};
expj.AE0180010.AE0180010button0.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0180010.AE0180010button0.Execute['onClick' + i])) {
        expj.AE0180010.AE0180010button0.Execute['onClick' + i]();
      }
    }
  }
};
expj.AE0180010.AE0180010button0.Execute.executeAllOnDecision = function () {
};
expj.AE0180010.AE0180010button0.Execute.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010button0-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0180010', 'AE0180010button0', 'Execute', this, 'Button');
    }
  });
  expj.AE0180010.AE0180010button0.Execute.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button0.Execute.executePScriptOnLoad = function () {
  console.log('execute AE0180010button0/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010button0-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0180010-AE0180010button0-Execute" name="Execute" class="AE0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- ���s�{�^�� --></div><!--/td-->
<script class="expj-script-AE0180010-AE0180010button0-CSVOut">
expj.AE0180010.AE0180010button0.CSVOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0180010view/*@AE0180010Servlet,,$ZZ07011"
expj.AE0180010.AE0180010button0.CSVOut.onClick0 = function () {
  console.log('CSVOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0180010', 'AE0180010button0', '_AE0180010view/*', 'AE0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0180010', response);
expj.common.updateBusinessScreenTab('AE0180010', contents);
};
expj.common.pscript.callConfirm('AE0180010', 'AE0180010button0', 'ZZ07011', okEvent);
};
expj.AE0180010.AE0180010button0.CSVOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0180010.AE0180010button0.CSVOut['onClick' + i])) {
        expj.AE0180010.AE0180010button0.CSVOut['onClick' + i]();
      }
    }
  }
};
expj.AE0180010.AE0180010button0.CSVOut.executeAllOnDecision = function () {
};
expj.AE0180010.AE0180010button0.CSVOut.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010button0-CSVOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0180010', 'AE0180010button0', 'CSVOut', this, 'Button');
    }
  });
  expj.AE0180010.AE0180010button0.CSVOut.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button0.CSVOut.executePScriptOnLoad = function () {
  console.log('execute AE0180010button0/CSVOut.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010button0-CSVOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0180010-AE0180010button0-CSVOut" name="CSVOut" class="AE0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV�o�̓{�^�� --></div><!--/td-->
<script class="expj-script-AE0180010-AE0180010button0-Clear">
expj.AE0180010.AE0180010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0180010Servlet,,$ZZ07008"
expj.AE0180010.AE0180010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0180010', 'AE0180010button0', '', 'AE0180010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0180010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0180010', response);
expj.common.updateBusinessScreenTab('AE0180010', contents);
};
expj.common.pscript.callConfirm('AE0180010', 'AE0180010button0', 'ZZ07008', okEvent);
};
expj.AE0180010.AE0180010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0180010.AE0180010button0.Clear['onClick' + i])) {
        expj.AE0180010.AE0180010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0180010.AE0180010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0180010.AE0180010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0180010', 'AE0180010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0180010.AE0180010button0.Clear.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0180010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0180010-AE0180010button0-Clear" name="Clear" class="AE0180010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-AE0180010-AE0180010button0-Close">
expj.AE0180010.AE0180010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0180010.AE0180010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0180010');
};
expj.AE0180010.AE0180010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0180010.AE0180010button0.Close['onClick' + i])) {
        expj.AE0180010.AE0180010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0180010.AE0180010button0.Close.executeAllOnDecision = function () {
};
expj.AE0180010.AE0180010button0.Close.executeOnLoad = function () {
  $('#expj-AE0180010-AE0180010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0180010', 'AE0180010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0180010.AE0180010button0.Close.executePScriptOnLoad();
};

expj.AE0180010.AE0180010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0180010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0180010-AE0180010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0180010-AE0180010button0-Close" name="Close" class="AE0180010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0180010 (END)-->
<%
MessageStruct msgStruct = aAE0180010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AE0180010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0180010)) {
  expj.common.treeInstanceMap.AE0180010 = {};
}
expj.common.treeInstanceMap.AE0180010.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AE0180010.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AE0180010.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AE0180010.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.AE0180010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0180010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0180010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0180010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0180010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0180010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-AE0180010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0180010)) {
  expj.common.detailDialogMap.AE0180010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0180010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0180010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0180010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0180010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0180010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0180010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0180010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0180010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0180010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0180010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0180010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0180010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0180010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0180010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS�錾(END)

//VIEW JS�錾
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AE0180010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0180010)) {
  expj.common.viewInstanceMap.AE0180010 = {};
}
expj.common.viewInstanceMap.AE0180010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0180010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0180010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0180010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)�̃{�f�B�f�[�^
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)�̃w�b�_�[�f�[�^
  var header_data = [<%=viewHeaderBuffer.toString() %>];
  var viewSelectEvent = function (target) {
    console.log('execute <%=viewId %>.onClick');
    expj.common.pscript.onClickTargetButtonData = null;
<%
 String viewClickFunctionName = (String) viewSelectEvent.get((String) viewId);
 if (viewClickFunctionName != null) {
%>
    <%=viewClickFunctionName %>();
<%
 }
%>
    expj.AE0180010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0180010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0180010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0180010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0180010_init">
/**
 * AE0180010�p�̃��[�h�������������֐�
 */
expj.AE0180010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0180010');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AE0180010');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('AE0180010');
  expj.common.calendarInstanceMap.AE0180010 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AE0180010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0180010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0180010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0180010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0180010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0180010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0180010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0180010.AE0180010form1.FileName.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010form1.h_INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button1.Browse.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button1.CsvIn.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button0.Execute.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button0.CSVOut.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010form1.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button1.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010view.executeOnLoad();}catch(e){};
  try{expj.AE0180010.AE0180010button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.AE0180010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0180010', 'AE0180010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0180010');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AE0180010-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AE0180010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AE0180010', '<%=request.getContextPath() %>');
};

/**
 * AE0180010�̑S��onDecision����
 */
expj.AE0180010.executeAllOnDecision = function () {
  expj.AE0180010.AE0180010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0180010_console">
expj.AE0180010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>