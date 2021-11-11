<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:41:51 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0010\AH0010021.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0010.*" %>
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
<jsp:useBean id="aAH0010020Control" class="com.nec.jp.orteus.metamorBase.AH0010.AH0010020Control" scope="request"/>
<jsp:useBean id="aAH0010020Struct" class="com.nec.jp.orteus.metamorBase.AH0010.AH0010020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目別棚卸設定メンテナンスサブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/jsp/AH0010021.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:02 $
********************************************************* --%>
<html>
<head>
<title>品目別棚卸設定メンテナンスサブ1</title>
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
<script class="expj-script-AH0010020_init">
  // AH0010020名前空間
  expj.AH0010020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<%@include file="common/upload.jsp" %>

  <div id="expj-business-screen-AH0010020" data-screen="AH0010021" data-newdata="<%=aAH0010020Control.isNewData() %>">
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
              <script class="expj-script-AH0010020-AH0010021form1">
expj.AH0010020.AH0010021form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AH0010020.AH0010021form1.onLoad0 = function () {
  console.log('AH0010021form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AH0010020.AH0010021form1.onDecision0 = function () {
  console.log('AH0010021form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AH0010020', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AH0010021button1/CsvIn"
expj.AH0010020.AH0010021form1.child0 = function () {
  console.log('AH0010021form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AH0010020', 'AH0010021form1', '_AH0010021button1/CsvIn');
};
// script4="child;1;MASK;_AH0010021button1/CsvIn"
expj.AH0010020.AH0010021form1.child1 = function () {
  console.log('AH0010021form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AH0010020', 'AH0010021form1', '_AH0010021button1/CsvIn');
};
expj.AH0010020.AH0010021form1.executeAllOnDecision = function () {
  console.log('execute AH0010021form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010021form1['onDecision' + i])) {
        expj.AH0010020.AH0010021form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010021form1.executeOnLoad = function () {
  expj.AH0010020.AH0010021form1.executePScriptOnLoad();
};

expj.AH0010020.AH0010021form1.executePScriptOnLoad = function () {
  console.log('execute AH0010021form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AH0010020.AH0010021form1['onLoad' + i])) {
      expj.AH0010020.AH0010021form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0010020-AH0010021form1" action="AH0010020Servlet" name="AH0010021form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0046",rb)%></span><!-- 取込ファイル --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010021form1-FileName">
expj.AH0010020.AH0010021form1.FileName = {};
expj.AH0010020.AH0010021form1.FileName.executeAllOnDecision = function () {
  console.log('execute AH0010021form1/FileName.onDecision');
  expj.AH0010020.AH0010021form1.executeAllOnDecision();
  expj.AH0010020.executeAllOnDecision();
};
expj.AH0010020.AH0010021form1.FileName.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010021form1-FileName').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0010020', 'AH0010021form1', 'FileName', this);
  });
  expj.AH0010020.AH0010021form1.FileName.executePScriptOnLoad();
};

expj.AH0010020.AH0010021form1.FileName.executePScriptOnLoad = function () {
  console.log('execute AH0010021form1/FileName.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010021form1-FileName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AH0010020-AH0010021form1-FileName" name="FileName" class="AH0010020-focus-move  required-value expj-AH0010020-required-A" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0010020Struct.getFileName()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AH0010020-AH0010021button1">
expj.AH0010020.AH0010021button1 = {};
expj.AH0010020.AH0010021button1.executeAllOnDecision = function () {
  console.log('execute AH0010021button1.onDecision');
};
expj.AH0010020.AH0010021button1.executeOnLoad = function () {
  expj.AH0010020.AH0010021button1.executePScriptOnLoad();
};

expj.AH0010020.AH0010021button1.executePScriptOnLoad = function () {
  console.log('execute AH0010021button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0010020-AH0010021button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0010020-AH0010021button1-Browse">
expj.AH0010020.AH0010021button1.Browse = {};
// script1="onClick;0;FILEDLG;_AH0010021form1/FileName"
expj.AH0010020.AH0010021button1.Browse.onClick0 = function () {
  console.log('Browse script1');
expj.common.pscript.openFileDialog('AH0010020', 'AH0010021button1', '_AH0010021form1/FileName');
};
expj.AH0010020.AH0010021button1.Browse.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010021button1.Browse['onClick' + i])) {
        expj.AH0010020.AH0010021button1.Browse['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010021button1.Browse.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010021button1.Browse.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010021button1-Browse').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010021button1', 'Browse', this, 'Button');
    }
  });
  expj.AH0010020.AH0010021button1.Browse.executePScriptOnLoad();
};

expj.AH0010020.AH0010021button1.Browse.executePScriptOnLoad = function () {
  console.log('execute AH0010021button1/Browse.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010021button1-Browse');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010021button1-Browse" name="Browse" class="AH0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBrowse",rb)%></button><!-- 参照ボタン --></div><!--/td-->
<script class="expj-script-AH0010020-AH0010021button1-CsvIn">
expj.AH0010020.AH0010021button1.CsvIn = {};
// script1="onClick;0;FILEUPLOAD;AH0010020Servlet"
expj.AH0010020.AH0010021button1.CsvIn.onClick0 = function () {
  console.log('CsvIn script1');
expj.common.pscript.executeFileUpload('AH0010020', 'AH0010021button1', 'AH0010020Servlet');
};
expj.AH0010020.AH0010021button1.CsvIn.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010021button1.CsvIn['onClick' + i])) {
        expj.AH0010020.AH0010021button1.CsvIn['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010021button1.CsvIn.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010021button1.CsvIn.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010021button1-CsvIn').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010021button1', 'CsvIn', this, 'Button');
    }
  });
  expj.AH0010020.AH0010021button1.CsvIn.executePScriptOnLoad();
};

expj.AH0010020.AH0010021button1.CsvIn.executePScriptOnLoad = function () {
  console.log('execute AH0010021button1/CsvIn.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010021button1-CsvIn');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010021button1-CsvIn" name="CsvIn" class="AH0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvIn",rb)%></button><!-- 取込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0010020-AH0010021view1">
expj.AH0010020.AH0010021view1 = {};
expj.AH0010020.AH0010021view1.executeAllOnClick = function () {
};
expj.AH0010020.AH0010021view1.executeAllOnDecision = function () {
  console.log('execute AH0010021view1.onDecision');
};
expj.AH0010020.AH0010021view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AH0010021view1", "expj.AH0010020.AH0010021view1.executeAllOnClick");
%>
  expj.AH0010020.AH0010021view1.executePScriptOnLoad();
};

expj.AH0010020.AH0010021view1.executePScriptOnLoad = function () {
  console.log('execute AH0010021view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AH0010020-AH0010021view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AH0010021view1_Id = "AH0010021view1";
 String AH0010021view1_select = "single";
 String AH0010021view1_sortable = "true";
 String AH0010021view1_resize = "true";
 String AH0010021view1_scroll = "true";
 StringBuffer AH0010021view1_HB = new StringBuffer();
 StringBuffer AH0010021view1_DB = new StringBuffer();
%>
<%
 AH0010021view1_select = "multi";
 AH0010021view1_sortable = "true";
 AH0010021view1_resize = "true";
 AH0010021view1_scroll = "true";
%>
<%
 AH0010021view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AH0010021view1_sortable).append("}").append(",");
%>
     
<%
AH0010021view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AH0010021view1_sortable).append("}").append(",");
AH0010021view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0047",rb))).append("', 'name':'ERR_ADR', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0010021view1_sortable).append("}").append(",");
AH0010021view1_HB.append("{'visible':true, 'type':'string', 'width':'600px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0048",rb))).append("', 'name':'ERR_MSG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AH0010021view1_sortable).append("}").append(",");
%>
<%
 int aAH0010020StructLength = aAH0010020Control.getListsize();
 final AH0010020Struct structBackup = aAH0010020Struct;
 aAH0010020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAH0010020StructLength; ++loopCount) {
  if((aAH0010020Struct = (AH0010020Struct) aAH0010020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAH0010020Struct", aAH0010020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AH0010021view1_DB.append("[");
 AH0010021view1_DB.append(loopCount);
 AH0010021view1_DB.append(",''");
 AH0010021view1_DB.append(",").append("'<span id=\"expj-AH0010020-AH0010021view1-ERR_ADR-").append(loopCount).append("\" class=\"expj-label expj-AH0010020-AH0010021view1-ERR_ADR\" data-name=\"ERR_ADR\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0010020Struct.getERR_ADR())).append("</span>'");
 AH0010021view1_DB.append(",").append("'<span id=\"expj-AH0010020-AH0010021view1-ERR_MSG-").append(loopCount).append("\" class=\"expj-label expj-AH0010020-AH0010021view1-ERR_MSG\" data-name=\"ERR_MSG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAH0010020Struct.getERR_MSG())).append("</span>'");
 AH0010021view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAH0010020StructLength) {
   AH0010021view1_DB.append(",");
  }
 }
 aAH0010020Struct = structBackup;
 viewIdList.add(AH0010021view1_Id);
 viewSelectList.add(AH0010021view1_select);
 viewResizeList.add(AH0010021view1_resize);
 viewScrollList.add(AH0010021view1_scroll);
 viewHeaderDataList.add(AH0010021view1_HB);
 viewBodyDataList.add(AH0010021view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-right" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AH0010021 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AH0010020-AH0010021button0">
expj.AH0010020.AH0010021button0 = {};
expj.AH0010020.AH0010021button0.executeAllOnDecision = function () {
  console.log('execute AH0010021button0.onDecision');
};
expj.AH0010020.AH0010021button0.executeOnLoad = function () {
  expj.AH0010020.AH0010021button0.executePScriptOnLoad();
};

expj.AH0010020.AH0010021button0.executePScriptOnLoad = function () {
  console.log('execute AH0010021button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0010020-AH0010021button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0010020-AH0010021button0-return_sub1">
expj.AH0010020.AH0010021button0.return_sub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0010021form1/*,_AH0010021view1/*@AH0010020Servlet,,$ZZ07013"
expj.AH0010020.AH0010021button0.return_sub1.onClick0 = function () {
  console.log('return_sub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0010020', 'AH0010021button0', '_AH0010021form1/*,_AH0010021view1/*', 'AH0010020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0010020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0010020', response);
expj.common.changeBusinessScreenTab('AH0010020', contents);
};
expj.common.pscript.callConfirm('AH0010020', 'AH0010021button0', 'ZZ07013', okEvent);
};
expj.AH0010020.AH0010021button0.return_sub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0010020.AH0010021button0.return_sub1['onClick' + i])) {
        expj.AH0010020.AH0010021button0.return_sub1['onClick' + i]();
      }
    }
  }
};
expj.AH0010020.AH0010021button0.return_sub1.executeAllOnDecision = function () {
};
expj.AH0010020.AH0010021button0.return_sub1.executeOnLoad = function () {
  $('#expj-AH0010020-AH0010021button0-return_sub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0010020', 'AH0010021button0', 'return_sub1', this, 'Button');
    }
  });
  expj.AH0010020.AH0010021button0.return_sub1.executePScriptOnLoad();
};

expj.AH0010020.AH0010021button0.return_sub1.executePScriptOnLoad = function () {
  console.log('execute AH0010021button0/return_sub1.onLoad');
  var targetComponent = document.getElementById('expj-AH0010020-AH0010021button0-return_sub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0010020-AH0010021button0-return_sub1" name="return_sub1" class="AH0010020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0010020 (END)-->
<%
MessageStruct msgStruct = aAH0010020Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0010020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0010020)) {
  expj.common.treeInstanceMap.AH0010020 = {};
}
expj.common.treeInstanceMap.AH0010020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0010020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0010020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0010020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0010020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0010020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0010020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020)) {
  expj.common.detailDialogMap.AH0010020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0010020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0010020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0010020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0010020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0010020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0010020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0010020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0010020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0010020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0010020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0010020)) {
  expj.common.viewInstanceMap.AH0010020 = {};
}
expj.common.viewInstanceMap.AH0010020.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0010020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0010020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0010020.<%=viewId %>.init = function () {
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
    expj.AH0010020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0010020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0010020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0010020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0010020_init">
/**
 * AH0010020用のロード完了時初期化関数
 */
expj.AH0010020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0010020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0010020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0010020');
  expj.common.calendarInstanceMap.AH0010020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0010020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0010020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0010020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0010020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0010020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0010020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0010020-<%=detailId %>');
<%
 }
%>
  try{expj.AH0010020.AH0010021form1.FileName.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010021button1.Browse.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010021button1.CsvIn.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010021button0.return_sub1.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010021form1.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010021button1.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010021view1.executeOnLoad();}catch(e){};
  try{expj.AH0010020.AH0010021button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0010020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0010020', 'AH0010020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0010020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0010020-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0010020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0010020', '<%=request.getContextPath() %>');
};

/**
 * AH0010020の全体onDecision処理
 */
expj.AH0010020.executeAllOnDecision = function () {
  expj.AH0010020.AH0010021form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0010020_console">
expj.AH0010020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>