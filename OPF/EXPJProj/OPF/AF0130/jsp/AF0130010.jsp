<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:40:36 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0130\AF0130010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0130.*" %>
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
<jsp:useBean id="aAF0130010Control" class="com.nec.jp.orteus.metamorBase.AF0130.AF0130010Control" scope="request"/>
<jsp:useBean id="aAF0130010Struct" class="com.nec.jp.orteus.metamorBase.AF0130.AF0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

マニュアル出庫実績CSV取込
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0130/jsp/AF0130010.jsp,v $
$Author: geng-jia $	
$Revision: 1.7 $　$Date: 2017/02/22 02:05:54 $
********************************************************* --%>
<html>
<head>
<title>マニュアル出庫実績CSV取込</title>
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
<script class="expj-script-AF0130010_init">
  // AF0130010名前空間
  expj.AF0130010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <%@include file="common/upload.jsp" %>
  <div id="expj-business-screen-AF0130010" data-screen="AF0130010" data-newdata="<%=aAF0130010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
			  <script class="expj-script-AF0130010-AF0130010form1">
expj.AF0130010.AF0130010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AF0130010.AF0130010form1.onLoad0 = function () {
  console.log('AF0130010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AF0130010.AF0130010form1.onDecision0 = function () {
  console.log('AF0130010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AF0130010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?AF0130010view/$[eq]0@*2,3"
expj.AF0130010.AF0130010form1.onDecision1 = function () {
  console.log('AF0130010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0130010', 'AF0130010form1', '?AF0130010view/$'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;0;UNMASK;_AF0130010button1/CsvIn"
expj.AF0130010.AF0130010form1.child0 = function () {
  console.log('AF0130010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AF0130010', 'AF0130010form1', '_AF0130010button1/CsvIn');
};
// script5="child;1;MASK;_AF0130010button1/CsvIn"
expj.AF0130010.AF0130010form1.child1 = function () {
  console.log('AF0130010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0130010', 'AF0130010form1', '_AF0130010button1/CsvIn');
};
// script6="child;2;MASK;_AF0130010button0/CSVOut"
expj.AF0130010.AF0130010form1.child2 = function () {
  console.log('AF0130010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AF0130010', 'AF0130010form1', '_AF0130010button0/CSVOut');
};
// script7="child;3;UNMASK;_AF0130010button0/CSVOut"
expj.AF0130010.AF0130010form1.child3 = function () {
  console.log('AF0130010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AF0130010', 'AF0130010form1', '_AF0130010button0/CSVOut');
};
expj.AF0130010.AF0130010form1.executeAllOnDecision = function () {
  console.log('execute AF0130010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0130010.AF0130010form1['onDecision' + i])) {
        expj.AF0130010.AF0130010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0130010.AF0130010form1.executeOnLoad = function () {
  expj.AF0130010.AF0130010form1.executePScriptOnLoad();
};

expj.AF0130010.AF0130010form1.executePScriptOnLoad = function () {
  console.log('execute AF0130010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0130010.AF0130010form1['onLoad' + i])) {
      expj.AF0130010.AF0130010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0130010-AF0130010form1" action="AF0130010Servlet" name="AF0130010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0130010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0046",rb)%></span><!-- 取込ファイル --></div><!--/td-->
<script class="expj-script-AF0130010-AF0130010form1-FileName">
expj.AF0130010.AF0130010form1.FileName = {};
expj.AF0130010.AF0130010form1.FileName.executeAllOnDecision = function () {
  console.log('execute AF0130010form1/FileName.onDecision');
  expj.AF0130010.AF0130010form1.executeAllOnDecision();
  expj.AF0130010.executeAllOnDecision();
};
expj.AF0130010.AF0130010form1.FileName.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010form1-FileName').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0130010', 'AF0130010form1', 'FileName', this);
  });
  expj.AF0130010.AF0130010form1.FileName.executePScriptOnLoad();
};

expj.AF0130010.AF0130010form1.FileName.executePScriptOnLoad = function () {
  console.log('execute AF0130010form1/FileName.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010form1-FileName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AF0130010-AF0130010form1-FileName" name="FileName" class="AF0130010-focus-move  required-value expj-AF0130010-required-A" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0130010Struct.getFileName()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0130010-AF0130010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0130010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AF0130010-AF0130010form1-DOWNLOAD_FILE">
expj.AF0130010.AF0130010form1.DOWNLOAD_FILE = {};
expj.AF0130010.AF0130010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AF0130010form1/DOWNLOAD_FILE.onDecision');
  expj.AF0130010.AF0130010form1.executeAllOnDecision();
  expj.AF0130010.executeAllOnDecision();
};
expj.AF0130010.AF0130010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0130010', 'AF0130010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AF0130010.AF0130010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AF0130010.AF0130010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AF0130010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AF0130010-AF0130010button1">
expj.AF0130010.AF0130010button1 = {};
expj.AF0130010.AF0130010button1.executeAllOnDecision = function () {
  console.log('execute AF0130010button1.onDecision');
};
expj.AF0130010.AF0130010button1.executeOnLoad = function () {
  expj.AF0130010.AF0130010button1.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button1.executePScriptOnLoad = function () {
  console.log('execute AF0130010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0130010-AF0130010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0130010-AF0130010button1-Browse">
expj.AF0130010.AF0130010button1.Browse = {};
// script1="onClick;0;FILEDLG;_AF0130010form1/FileName"
expj.AF0130010.AF0130010button1.Browse.onClick0 = function () {
  console.log('Browse script1');
expj.common.pscript.openFileDialog('AF0130010', 'AF0130010button1', '_AF0130010form1/FileName');
};
expj.AF0130010.AF0130010button1.Browse.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0130010.AF0130010button1.Browse['onClick' + i])) {
        expj.AF0130010.AF0130010button1.Browse['onClick' + i]();
      }
    }
  }
};
expj.AF0130010.AF0130010button1.Browse.executeAllOnDecision = function () {
};
expj.AF0130010.AF0130010button1.Browse.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010button1-Browse').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0130010', 'AF0130010button1', 'Browse', this, 'Button');
    }
  });
  expj.AF0130010.AF0130010button1.Browse.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button1.Browse.executePScriptOnLoad = function () {
  console.log('execute AF0130010button1/Browse.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010button1-Browse');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0130010-AF0130010button1-Browse" name="Browse" class="AF0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBrowse",rb)%></button><!-- 参照ボタン --></div><!--/td-->
<script class="expj-script-AF0130010-AF0130010button1-CsvIn">
expj.AF0130010.AF0130010button1.CsvIn = {};
// script1="onClick;0;FILEUPLOAD;AF0130010Servlet"
expj.AF0130010.AF0130010button1.CsvIn.onClick0 = function () {
  console.log('CsvIn script1');
expj.common.pscript.executeFileUpload('AF0130010', 'AF0130010button1', 'AF0130010Servlet');
};
expj.AF0130010.AF0130010button1.CsvIn.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0130010.AF0130010button1.CsvIn['onClick' + i])) {
        expj.AF0130010.AF0130010button1.CsvIn['onClick' + i]();
      }
    }
  }
};
expj.AF0130010.AF0130010button1.CsvIn.executeAllOnDecision = function () {
};
expj.AF0130010.AF0130010button1.CsvIn.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010button1-CsvIn').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0130010', 'AF0130010button1', 'CsvIn', this, 'Button');
    }
  });
  expj.AF0130010.AF0130010button1.CsvIn.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button1.CsvIn.executePScriptOnLoad = function () {
  console.log('execute AF0130010button1/CsvIn.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010button1-CsvIn');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0130010-AF0130010button1-CsvIn" name="CsvIn" class="AF0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvIn",rb)%></button><!-- 取込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AF0130010-AF0130010view">
expj.AF0130010.AF0130010view = {};
expj.AF0130010.AF0130010view.executeAllOnClick = function () {
};
expj.AF0130010.AF0130010view.executeAllOnDecision = function () {
  console.log('execute AF0130010view.onDecision');
};
expj.AF0130010.AF0130010view.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0130010view", "expj.AF0130010.AF0130010view.executeAllOnClick");
%>
  expj.AF0130010.AF0130010view.executePScriptOnLoad();
};

expj.AF0130010.AF0130010view.executePScriptOnLoad = function () {
  console.log('execute AF0130010view.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0130010-AF0130010view" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAF0130010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AF0130010view_Id = "AF0130010view";
 String AF0130010view_select = "single";
 String AF0130010view_sortable = "true";
 String AF0130010view_resize = "true";
 String AF0130010view_scroll = "true";
 StringBuffer AF0130010view_HB = new StringBuffer();
 StringBuffer AF0130010view_DB = new StringBuffer();
%>
<%
 AF0130010view_select = "none";
 AF0130010view_sortable = "true";
 AF0130010view_resize = "true";
 AF0130010view_scroll = "true";
%>
<%
 AF0130010view_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
%>
     
<%
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3094",rb))).append("', 'name':'l_ERROR_IN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3095",rb))).append("', 'name':'l_ERR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'210px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3098",rb))).append("', 'name':'l_ERR_INFO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt6220",rb))).append("', 'name':'l_ERR_CTR_NM', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'l_ERR_ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ERR_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_ERR_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_WH_CD_1",rb))).append("', 'name':'l_ERR_ISSUE_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_ERR_STOCK_LOT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_QTY",rb))).append("', 'name':'l_ERR_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_DATE",rb))).append("', 'name':'l_ERR_ISSUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_FLG_2",rb))).append("', 'name':'l_ERR_ISSUE_CMPLT_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_WH_CD_1",rb))).append("', 'name':'l_ERR_RCV_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
AF0130010view_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_LOT_NO",rb))).append("', 'name':'l_ERR_VEND_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0130010view_sortable).append("}").append(",");
%>
<%
 int aAF0130010StructLength = aAF0130010Control.getListsize();
 final AF0130010Struct structBackup = aAF0130010Struct;
 aAF0130010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0130010StructLength; ++loopCount) {
  if((aAF0130010Struct = (AF0130010Struct) aAF0130010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0130010Struct", aAF0130010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0130010view_DB.append("[");
 AF0130010view_DB.append(loopCount);
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERROR_IN-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERROR_IN\" data-name=\"l_ERROR_IN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERROR_IN())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_TYP\" data-name=\"l_ERR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_TYP())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_INFO-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_INFO\" data-name=\"l_ERR_INFO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_INFO())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_CTR_NM-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_CTR_NM\" data-name=\"l_ERR_CTR_NM\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_CTR_NM())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_ISSUE_INST_CD\" data-name=\"l_ERR_ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_ISSUE_INST_CD())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_ITEM_CD\" data-name=\"l_ERR_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_ITEM_CD())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_JOB_ODR_CD\" data-name=\"l_ERR_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_JOB_ODR_CD())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_ISSUE_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_ISSUE_WH_CD\" data-name=\"l_ERR_ISSUE_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_ISSUE_WH_CD())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_STOCK_LOT_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_STOCK_LOT_CD\" data-name=\"l_ERR_STOCK_LOT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_STOCK_LOT_CD())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_ISSUE_QTY\" data-name=\"l_ERR_ISSUE_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_ISSUE_QTY())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_ISSUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_ISSUE_DATE\" data-name=\"l_ERR_ISSUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_ISSUE_DATE())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_ISSUE_CMPLT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_ISSUE_CMPLT_FLG\" data-name=\"l_ERR_ISSUE_CMPLT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_ISSUE_CMPLT_FLG())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_RCV_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_RCV_WH_CD\" data-name=\"l_ERR_RCV_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_RCV_WH_CD())).append("</span>'");
 AF0130010view_DB.append(",").append("'<span id=\"expj-AF0130010-AF0130010view-l_ERR_VEND_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0130010-AF0130010view-l_ERR_VEND_LOT_NO\" data-name=\"l_ERR_VEND_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0130010Struct.getl_ERR_VEND_LOT_NO())).append("</span>'");
 AF0130010view_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0130010StructLength) {
   AF0130010view_DB.append(",");
  }
 }
 aAF0130010Struct = structBackup;
 viewIdList.add(AF0130010view_Id);
 viewSelectList.add(AF0130010view_select);
 viewResizeList.add(AF0130010view_resize);
 viewScrollList.add(AF0130010view_scroll);
 viewHeaderDataList.add(AF0130010view_HB);
 viewBodyDataList.add(AF0130010view_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
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
<span class="version">AF0130010 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AF0130010-AF0130010button0">
expj.AF0130010.AF0130010button0 = {};
expj.AF0130010.AF0130010button0.executeAllOnDecision = function () {
  console.log('execute AF0130010button0.onDecision');
};
expj.AF0130010.AF0130010button0.executeOnLoad = function () {
  expj.AF0130010.AF0130010button0.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button0.executePScriptOnLoad = function () {
  console.log('execute AF0130010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0130010-AF0130010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0130010-AF0130010button0-Execute">
expj.AF0130010.AF0130010button0.Execute = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0130010form1/*@AF0130010Servlet,,$AF80001"
expj.AF0130010.AF0130010button0.Execute.onClick0 = function () {
  console.log('Execute script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0130010', 'AF0130010button0', '_AF0130010form1/*', 'AF0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0130010', response);
expj.common.updateBusinessScreenTab('AF0130010', contents);
};
expj.common.pscript.callConfirm('AF0130010', 'AF0130010button0', 'AF80001', okEvent);
};
expj.AF0130010.AF0130010button0.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0130010.AF0130010button0.Execute['onClick' + i])) {
        expj.AF0130010.AF0130010button0.Execute['onClick' + i]();
      }
    }
  }
};
expj.AF0130010.AF0130010button0.Execute.executeAllOnDecision = function () {
};
expj.AF0130010.AF0130010button0.Execute.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010button0-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0130010', 'AF0130010button0', 'Execute', this, 'Button');
    }
  });
  expj.AF0130010.AF0130010button0.Execute.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button0.Execute.executePScriptOnLoad = function () {
  console.log('execute AF0130010button0/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010button0-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0130010-AF0130010button0-Execute" name="Execute" class="AF0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
<script class="expj-script-AF0130010-AF0130010button0-CSVOut">
expj.AF0130010.AF0130010button0.CSVOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0130010view/*@AF0130010Servlet,,$ZZ07011"
expj.AF0130010.AF0130010button0.CSVOut.onClick0 = function () {
  console.log('CSVOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0130010', 'AF0130010button0', '_AF0130010view/*', 'AF0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0130010', response);
expj.common.updateBusinessScreenTab('AF0130010', contents);
};
expj.common.pscript.callConfirm('AF0130010', 'AF0130010button0', 'ZZ07011', okEvent);
};
expj.AF0130010.AF0130010button0.CSVOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0130010.AF0130010button0.CSVOut['onClick' + i])) {
        expj.AF0130010.AF0130010button0.CSVOut['onClick' + i]();
      }
    }
  }
};
expj.AF0130010.AF0130010button0.CSVOut.executeAllOnDecision = function () {
};
expj.AF0130010.AF0130010button0.CSVOut.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010button0-CSVOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0130010', 'AF0130010button0', 'CSVOut', this, 'Button');
    }
  });
  expj.AF0130010.AF0130010button0.CSVOut.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button0.CSVOut.executePScriptOnLoad = function () {
  console.log('execute AF0130010button0/CSVOut.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010button0-CSVOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0130010-AF0130010button0-CSVOut" name="CSVOut" class="AF0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AF0130010-AF0130010button0-Clear">
expj.AF0130010.AF0130010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0130010Servlet,,$ZZ07008"
expj.AF0130010.AF0130010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0130010', 'AF0130010button0', '', 'AF0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0130010', response);
expj.common.updateBusinessScreenTab('AF0130010', contents);
};
expj.common.pscript.callConfirm('AF0130010', 'AF0130010button0', 'ZZ07008', okEvent);
};
expj.AF0130010.AF0130010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0130010.AF0130010button0.Clear['onClick' + i])) {
        expj.AF0130010.AF0130010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AF0130010.AF0130010button0.Clear.executeAllOnDecision = function () {
};
expj.AF0130010.AF0130010button0.Clear.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0130010', 'AF0130010button0', 'Clear', this, 'Button');
    }
  });
  expj.AF0130010.AF0130010button0.Clear.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AF0130010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0130010-AF0130010button0-Clear" name="Clear" class="AF0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0130010-AF0130010button0-Close">
expj.AF0130010.AF0130010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AF0130010.AF0130010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AF0130010');
};
expj.AF0130010.AF0130010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0130010.AF0130010button0.Close['onClick' + i])) {
        expj.AF0130010.AF0130010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AF0130010.AF0130010button0.Close.executeAllOnDecision = function () {
};
expj.AF0130010.AF0130010button0.Close.executeOnLoad = function () {
  $('#expj-AF0130010-AF0130010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0130010', 'AF0130010button0', 'Close', this, 'Button');
    }
  });
  expj.AF0130010.AF0130010button0.Close.executePScriptOnLoad();
};

expj.AF0130010.AF0130010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AF0130010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AF0130010-AF0130010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0130010-AF0130010button0-Close" name="Close" class="AF0130010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0130010 (END)-->
<%
MessageStruct msgStruct = aAF0130010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0130010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0130010)) {
  expj.common.treeInstanceMap.AF0130010 = {};
}
expj.common.treeInstanceMap.AF0130010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0130010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0130010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0130010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0130010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0130010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0130010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0130010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0130010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0130010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0130010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0130010)) {
  expj.common.detailDialogMap.AF0130010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0130010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0130010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0130010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0130010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0130010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0130010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0130010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0130010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0130010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0130010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0130010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0130010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0130010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0130010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS宣言(END)

//VIEW JS宣言
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-AF0130010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0130010)) {
  expj.common.viewInstanceMap.AF0130010 = {};
}
expj.common.viewInstanceMap.AF0130010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0130010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0130010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0130010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)のボディデータ
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)のヘッダーデータ
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
    expj.AF0130010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0130010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0130010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0130010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0130010_init">
/**
 * AF0130010用のロード完了時初期化関数
 */
expj.AF0130010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0130010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0130010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0130010');
  expj.common.calendarInstanceMap.AF0130010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0130010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0130010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0130010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0130010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0130010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0130010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0130010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0130010.AF0130010form1.FileName.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button1.Browse.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button1.CsvIn.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button0.Execute.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button0.CSVOut.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010form1.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button1.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010view.executeOnLoad();}catch(e){};
  try{expj.AF0130010.AF0130010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0130010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0130010', 'AF0130010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0130010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0130010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0130010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0130010', '<%=request.getContextPath() %>');
};

/**
 * AF0130010の全体onDecision処理
 */
expj.AF0130010.executeAllOnDecision = function () {
  expj.AF0130010.AF0130010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0130010_console">
expj.AF0130010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>