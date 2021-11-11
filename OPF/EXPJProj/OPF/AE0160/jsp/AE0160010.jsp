<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:37:06 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0160\AE0160010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0160.*" %>
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
<jsp:useBean id="aAE0160010Control" class="com.nec.jp.orteus.metamorBase.AE0160.AE0160010Control" scope="request"/>
<jsp:useBean id="aAE0160010Struct" class="com.nec.jp.orteus.metamorBase.AE0160.AE0160010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受入実績取込
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/jsp/AE0160010.jsp,v $
$Author: geng-jia $	
$Revision: 1.12 $　$Date: 2017/02/22 02:05:29 $
********************************************************* --%>
<html>
<head>
<title>受入実績取込</title>
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
<script class="expj-script-AE0160010_init">
  // AE0160010名前空間
  expj.AE0160010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
 <%@include file="common/upload.jsp" %>  
  <div id="expj-business-screen-AE0160010" data-screen="AE0160010" data-newdata="<%=aAE0160010Control.isNewData() %>">
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
              <script class="expj-script-AE0160010-AE0160010form1">
expj.AE0160010.AE0160010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AE0160010.AE0160010form1.onLoad0 = function () {
  console.log('AE0160010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0160010.AE0160010form1.onDecision0 = function () {
  console.log('AE0160010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0160010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?AE0160010form1/*[eq]ERROR@*2,*3"
expj.AE0160010.AE0160010form1.onDecision1 = function () {
  console.log('AE0160010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0160010', 'AE0160010form1', '?AE0160010form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;0;UNMASK;_AE0160010button1/CsvIn"
expj.AE0160010.AE0160010form1.child0 = function () {
  console.log('AE0160010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button1/CsvIn');
};
// script5="child;1;MASK;_AE0160010button1/CsvIn"
expj.AE0160010.AE0160010form1.child1 = function () {
  console.log('AE0160010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button1/CsvIn');
};
// script6="child;2;MASK;_AE0160010button1/CsvIn,_AE0160010button1/Browse,_AE0160010button0/CsvOut,_AE0160010button0/DeleteAll"
expj.AE0160010.AE0160010form1.child2 = function () {
  console.log('AE0160010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button1/CsvIn');
expj.common.pscript.setMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button1/Browse');
expj.common.pscript.setMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button0/CsvOut');
expj.common.pscript.setMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button0/DeleteAll');
};
// script7="child;3;CHK;?AE0160010form1/*[eq]TOO_MANY@*4,*5"
expj.AE0160010.AE0160010form1.child3 = function () {
  console.log('AE0160010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0160010', 'AE0160010form1', '?AE0160010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AE0160010button0/CsvOut"
expj.AE0160010.AE0160010form1.child4 = function () {
  console.log('AE0160010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button0/CsvOut');
};
// script9="child;5;MASK;_AE0160010button0/CsvOut"
expj.AE0160010.AE0160010form1.child5 = function () {
  console.log('AE0160010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AE0160010', 'AE0160010form1', '_AE0160010button0/CsvOut');
};
expj.AE0160010.AE0160010form1.executeAllOnDecision = function () {
  console.log('execute AE0160010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0160010.AE0160010form1['onDecision' + i])) {
        expj.AE0160010.AE0160010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0160010.AE0160010form1.executeOnLoad = function () {
  expj.AE0160010.AE0160010form1.executePScriptOnLoad();
};

expj.AE0160010.AE0160010form1.executePScriptOnLoad = function () {
  console.log('execute AE0160010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0160010.AE0160010form1['onLoad' + i])) {
      expj.AE0160010.AE0160010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0160010-AE0160010form1" action="AE0160010Servlet" name="AE0160010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0160010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0046",rb)%></span><!-- 取込ファイル --></div><!--/td-->
<script class="expj-script-AE0160010-AE0160010form1-FileName">
expj.AE0160010.AE0160010form1.FileName = {};
expj.AE0160010.AE0160010form1.FileName.executeAllOnDecision = function () {
  console.log('execute AE0160010form1/FileName.onDecision');
  expj.AE0160010.AE0160010form1.executeAllOnDecision();
  expj.AE0160010.executeAllOnDecision();
};
expj.AE0160010.AE0160010form1.FileName.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010form1-FileName').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0160010', 'AE0160010form1', 'FileName', this);
  });
  expj.AE0160010.AE0160010form1.FileName.executePScriptOnLoad();
};

expj.AE0160010.AE0160010form1.FileName.executePScriptOnLoad = function () {
  console.log('execute AE0160010form1/FileName.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010form1-FileName');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AE0160010-AE0160010form1-FileName" name="FileName" class="AE0160010-focus-move  required-value expj-AE0160010-required-A" style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0160010Struct.getFileName()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0160010-AE0160010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0160010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AE0160010-AE0160010form1-DOWNLOAD_FILE">
expj.AE0160010.AE0160010form1.DOWNLOAD_FILE = {};
expj.AE0160010.AE0160010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AE0160010form1/DOWNLOAD_FILE.onDecision');
  expj.AE0160010.AE0160010form1.executeAllOnDecision();
  expj.AE0160010.executeAllOnDecision();
};
expj.AE0160010.AE0160010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0160010', 'AE0160010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AE0160010.AE0160010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AE0160010.AE0160010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AE0160010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010form1-DOWNLOAD_FILE');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0160010-AE0160010button1">
expj.AE0160010.AE0160010button1 = {};
expj.AE0160010.AE0160010button1.executeAllOnDecision = function () {
  console.log('execute AE0160010button1.onDecision');
};
expj.AE0160010.AE0160010button1.executeOnLoad = function () {
  expj.AE0160010.AE0160010button1.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button1.executePScriptOnLoad = function () {
  console.log('execute AE0160010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0160010-AE0160010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0160010-AE0160010button1-Browse">
expj.AE0160010.AE0160010button1.Browse = {};
// script1="onClick;0;FILEDLG;_AE0160010form1/FileName"
expj.AE0160010.AE0160010button1.Browse.onClick0 = function () {
  console.log('Browse script1');
expj.common.pscript.openFileDialog('AE0160010', 'AE0160010button1', '_AE0160010form1/FileName');
};
expj.AE0160010.AE0160010button1.Browse.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0160010.AE0160010button1.Browse['onClick' + i])) {
        expj.AE0160010.AE0160010button1.Browse['onClick' + i]();
      }
    }
  }
};
expj.AE0160010.AE0160010button1.Browse.executeAllOnDecision = function () {
};
expj.AE0160010.AE0160010button1.Browse.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010button1-Browse').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0160010', 'AE0160010button1', 'Browse', this, 'Button');
    }
  });
  expj.AE0160010.AE0160010button1.Browse.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button1.Browse.executePScriptOnLoad = function () {
  console.log('execute AE0160010button1/Browse.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010button1-Browse');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0160010-AE0160010button1-Browse" name="Browse" class="AE0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnBrowse",rb)%></button><!-- 参照ボタン --></div><!--/td-->
<script class="expj-script-AE0160010-AE0160010button1-CsvIn">
expj.AE0160010.AE0160010button1.CsvIn = {};
// script1="onClick;0;FILEUPLOAD;AE0160010Servlet"
expj.AE0160010.AE0160010button1.CsvIn.onClick0 = function () {
  console.log('CsvIn script1');
expj.common.pscript.executeFileUpload('AE0160010', 'AE0160010button1', 'AE0160010Servlet');
};
expj.AE0160010.AE0160010button1.CsvIn.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0160010.AE0160010button1.CsvIn['onClick' + i])) {
        expj.AE0160010.AE0160010button1.CsvIn['onClick' + i]();
      }
    }
  }
};
expj.AE0160010.AE0160010button1.CsvIn.executeAllOnDecision = function () {
};
expj.AE0160010.AE0160010button1.CsvIn.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010button1-CsvIn').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0160010', 'AE0160010button1', 'CsvIn', this, 'Button');
    }
  });
  expj.AE0160010.AE0160010button1.CsvIn.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button1.CsvIn.executePScriptOnLoad = function () {
  console.log('execute AE0160010button1/CsvIn.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010button1-CsvIn');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0160010-AE0160010button1-CsvIn" name="CsvIn" class="AE0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvIn",rb)%></button><!-- 取込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0160010-AE0160010view1">
expj.AE0160010.AE0160010view1 = {};
expj.AE0160010.AE0160010view1.executeAllOnClick = function () {
};
expj.AE0160010.AE0160010view1.executeAllOnDecision = function () {
  console.log('execute AE0160010view1.onDecision');
};
expj.AE0160010.AE0160010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0160010view1", "expj.AE0160010.AE0160010view1.executeAllOnClick");
%>
  expj.AE0160010.AE0160010view1.executePScriptOnLoad();
};

expj.AE0160010.AE0160010view1.executePScriptOnLoad = function () {
  console.log('execute AE0160010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0160010-AE0160010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0160010view1_Id = "AE0160010view1";
 String AE0160010view1_select = "single";
 String AE0160010view1_sortable = "true";
 String AE0160010view1_resize = "true";
 String AE0160010view1_scroll = "true";
 StringBuffer AE0160010view1_HB = new StringBuffer();
 StringBuffer AE0160010view1_DB = new StringBuffer();
%>
<%
 AE0160010view1_select = "single";
 AE0160010view1_sortable = "true";
 AE0160010view1_resize = "true";
 AE0160010view1_scroll = "true";
%>
<%
 AE0160010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0160010view1_sortable).append("}").append(",");
%>
     
<%
AE0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0047",rb))).append("', 'name':'l_ERRLINE_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0160010view1_sortable).append("}").append(",");
AE0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'600px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0048",rb))).append("', 'name':'l_ERR_MSG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0160010view1_sortable).append("}").append(",");
%>
<%
 int aAE0160010StructLength = aAE0160010Control.getListsize();
 final AE0160010Struct structBackup = aAE0160010Struct;
 aAE0160010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0160010StructLength; ++loopCount) {
  if((aAE0160010Struct = (AE0160010Struct) aAE0160010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0160010Struct", aAE0160010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0160010view1_DB.append("[");
 AE0160010view1_DB.append(loopCount);
 AE0160010view1_DB.append(",").append("'<span id=\"expj-AE0160010-AE0160010view1-l_ERRLINE_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0160010-AE0160010view1-l_ERRLINE_NO\" data-name=\"l_ERRLINE_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0160010Struct.getl_ERRLINE_NO())).append("</span>'");
 AE0160010view1_DB.append(",").append("'<span id=\"expj-AE0160010-AE0160010view1-l_ERR_MSG-").append(loopCount).append("\" class=\"expj-label expj-AE0160010-AE0160010view1-l_ERR_MSG\" data-name=\"l_ERR_MSG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0160010Struct.getl_ERR_MSG())).append("</span>'");
 AE0160010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0160010StructLength) {
   AE0160010view1_DB.append(",");
  }
 }
 aAE0160010Struct = structBackup;
 viewIdList.add(AE0160010view1_Id);
 viewSelectList.add(AE0160010view1_select);
 viewResizeList.add(AE0160010view1_resize);
 viewScrollList.add(AE0160010view1_scroll);
 viewHeaderDataList.add(AE0160010view1_HB);
 viewBodyDataList.add(AE0160010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area" style="width:3px;"></div><!--/td-->
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
<span class="version">AE0160010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AE0160010-AE0160010button0">
expj.AE0160010.AE0160010button0 = {};
expj.AE0160010.AE0160010button0.executeAllOnDecision = function () {
  console.log('execute AE0160010button0.onDecision');
};
expj.AE0160010.AE0160010button0.executeOnLoad = function () {
  expj.AE0160010.AE0160010button0.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button0.executePScriptOnLoad = function () {
  console.log('execute AE0160010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0160010-AE0160010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0160010-AE0160010button0-Execute">
expj.AE0160010.AE0160010button0.Execute = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0160010form1/*@AE0160010Servlet,,$AE60001"
expj.AE0160010.AE0160010button0.Execute.onClick0 = function () {
  console.log('Execute script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0160010', 'AE0160010button0', '_AE0160010form1/*', 'AE0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0160010', response);
expj.common.updateBusinessScreenTab('AE0160010', contents);
};
expj.common.pscript.callConfirm('AE0160010', 'AE0160010button0', 'AE60001', okEvent);
};
expj.AE0160010.AE0160010button0.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0160010.AE0160010button0.Execute['onClick' + i])) {
        expj.AE0160010.AE0160010button0.Execute['onClick' + i]();
      }
    }
  }
};
expj.AE0160010.AE0160010button0.Execute.executeAllOnDecision = function () {
};
expj.AE0160010.AE0160010button0.Execute.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010button0-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0160010', 'AE0160010button0', 'Execute', this, 'Button');
    }
  });
  expj.AE0160010.AE0160010button0.Execute.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button0.Execute.executePScriptOnLoad = function () {
  console.log('execute AE0160010button0/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010button0-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0160010-AE0160010button0-Execute" name="Execute" class="AE0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
<script class="expj-script-AE0160010-AE0160010button0-CsvOut">
expj.AE0160010.AE0160010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0160010form1/*,_AE0160010view1/*@AE0160010Servlet,,$ZZ07011"
expj.AE0160010.AE0160010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0160010', 'AE0160010button0', '_AE0160010form1/*,_AE0160010view1/*', 'AE0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0160010', response);
expj.common.updateBusinessScreenTab('AE0160010', contents);
};
expj.common.pscript.callConfirm('AE0160010', 'AE0160010button0', 'ZZ07011', okEvent);
};
expj.AE0160010.AE0160010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0160010.AE0160010button0.CsvOut['onClick' + i])) {
        expj.AE0160010.AE0160010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AE0160010.AE0160010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AE0160010.AE0160010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0160010', 'AE0160010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AE0160010.AE0160010button0.CsvOut.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AE0160010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0160010-AE0160010button0-CsvOut" name="CsvOut" class="AE0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AE0160010-AE0160010button0-DeleteAll">
expj.AE0160010.AE0160010button0.DeleteAll = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0160010form1/*,_AE0160010view1/*@AE0160010Servlet,,$AD00225"
expj.AE0160010.AE0160010button0.DeleteAll.onClick0 = function () {
  console.log('DeleteAll script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0160010', 'AE0160010button0', '_AE0160010form1/*,_AE0160010view1/*', 'AE0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0160010', response);
expj.common.updateBusinessScreenTab('AE0160010', contents);
};
expj.common.pscript.callConfirm('AE0160010', 'AE0160010button0', 'AD00225', okEvent);
};
expj.AE0160010.AE0160010button0.DeleteAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0160010.AE0160010button0.DeleteAll['onClick' + i])) {
        expj.AE0160010.AE0160010button0.DeleteAll['onClick' + i]();
      }
    }
  }
};
expj.AE0160010.AE0160010button0.DeleteAll.executeAllOnDecision = function () {
};
expj.AE0160010.AE0160010button0.DeleteAll.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010button0-DeleteAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0160010', 'AE0160010button0', 'DeleteAll', this, 'Button');
    }
  });
  expj.AE0160010.AE0160010button0.DeleteAll.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button0.DeleteAll.executePScriptOnLoad = function () {
  console.log('execute AE0160010button0/DeleteAll.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010button0-DeleteAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0160010-AE0160010button0-DeleteAll" name="DeleteAll" class="AE0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
<script class="expj-script-AE0160010-AE0160010button0-Close">
expj.AE0160010.AE0160010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0160010.AE0160010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0160010');
};
expj.AE0160010.AE0160010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0160010.AE0160010button0.Close['onClick' + i])) {
        expj.AE0160010.AE0160010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0160010.AE0160010button0.Close.executeAllOnDecision = function () {
};
expj.AE0160010.AE0160010button0.Close.executeOnLoad = function () {
  $('#expj-AE0160010-AE0160010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0160010', 'AE0160010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0160010.AE0160010button0.Close.executePScriptOnLoad();
};

expj.AE0160010.AE0160010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0160010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0160010-AE0160010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0160010-AE0160010button0-Close" name="Close" class="AE0160010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0160010 (END)-->
<%
MessageStruct msgStruct = aAE0160010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0160010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0160010)) {
  expj.common.treeInstanceMap.AE0160010 = {};
}
expj.common.treeInstanceMap.AE0160010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0160010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0160010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0160010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0160010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0160010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0160010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0160010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0160010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0160010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0160010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0160010)) {
  expj.common.detailDialogMap.AE0160010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0160010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0160010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0160010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0160010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0160010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0160010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0160010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0160010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0160010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0160010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0160010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0160010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0160010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0160010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0160010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0160010)) {
  expj.common.viewInstanceMap.AE0160010 = {};
}
expj.common.viewInstanceMap.AE0160010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0160010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0160010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0160010.<%=viewId %>.init = function () {
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
    expj.AE0160010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0160010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0160010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0160010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0160010_init">
/**
 * AE0160010用のロード完了時初期化関数
 */
expj.AE0160010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0160010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0160010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0160010');
  expj.common.calendarInstanceMap.AE0160010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0160010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0160010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0160010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0160010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0160010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0160010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0160010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0160010.AE0160010form1.FileName.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button1.Browse.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button1.CsvIn.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button0.Execute.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button0.DeleteAll.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010form1.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button1.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010view1.executeOnLoad();}catch(e){};
  try{expj.AE0160010.AE0160010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0160010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0160010', 'AE0160010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0160010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0160010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0160010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0160010', '<%=request.getContextPath() %>');
};

/**
 * AE0160010の全体onDecision処理
 */
expj.AE0160010.executeAllOnDecision = function () {
  expj.AE0160010.AE0160010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0160010_console">
expj.AE0160010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>