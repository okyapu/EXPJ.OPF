<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:05:41 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0090\AE0090030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0090.*" %>
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
<jsp:useBean id="aAE0090030Control" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090030Control" scope="request"/>
<jsp:useBean id="aAE0090030Struct" class="com.nec.jp.orteus.metamorBase.AE0090.AE0090030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

発注点割品目一覧データ作成
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/jsp/AE0090030.jsp,v $
$Author: geng-jia $ 
$Revision: 1.23 $ $Date: 2017/02/22 02:05:20 $
********************************************************* --%>
<html>
<head>
<title>発注点割品目一覧データ作成</title>
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
<script class="expj-script-AE0090030_init">
  // AE0090030名前空間
  expj.AE0090030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0090030" data-screen="AE0090030" data-newdata="<%=aAE0090030Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr expjDynamicHeight" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;"> 
              <script class="expj-script-AE0090030-AE0090030form1">
expj.AE0090030.AE0090030form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AE0090030.AE0090030form1.onLoad0 = function () {
  console.log('AE0090030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0090030.AE0090030form1.onDecision0 = function () {
  console.log('AE0090030form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0090030', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0090030button0/CsvOut"
expj.AE0090030.AE0090030form1.child0 = function () {
  console.log('AE0090030form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0090030', 'AE0090030form1', '_AE0090030button0/CsvOut');
};
// script4="child;1;MASK;_AE0090030button0/CsvOut"
expj.AE0090030.AE0090030form1.child1 = function () {
  console.log('AE0090030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0090030', 'AE0090030form1', '_AE0090030button0/CsvOut');
};
expj.AE0090030.AE0090030form1.executeAllOnDecision = function () {
  console.log('execute AE0090030form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090030.AE0090030form1['onDecision' + i])) {
        expj.AE0090030.AE0090030form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0090030.AE0090030form1.executeOnLoad = function () {
  expj.AE0090030.AE0090030form1.executePScriptOnLoad();
};

expj.AE0090030.AE0090030form1.executePScriptOnLoad = function () {
  console.log('execute AE0090030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0090030.AE0090030form1['onLoad' + i])) {
      expj.AE0090030.AE0090030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0090030-AE0090030form1" action="AE0090030Servlet" name="AE0090030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0090030-AE0090030form1-PLANT_CD">
expj.AE0090030.AE0090030form1.PLANT_CD = {};
expj.AE0090030.AE0090030form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0090030form1/PLANT_CD.onDecision');
  expj.AE0090030.AE0090030form1.executeAllOnDecision();
  expj.AE0090030.executeAllOnDecision();
};
expj.AE0090030.AE0090030form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0090030-AE0090030form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090030', 'AE0090030form1', 'PLANT_CD', this);
  });
  expj.AE0090030.AE0090030form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0090030.AE0090030form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0090030form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0090030-AE0090030form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0090030-AE0090030form1-PLANT_CD" name="PLANT_CD" class="AE0090030-focus-move  required-value expj-AE0090030-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0090030Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0090030-AE0090030form1-PeekerPlantCd">
expj.AE0090030.AE0090030form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AE0090030form1/PLANT_CD@<%=contextNo%>"
expj.AE0090030.AE0090030form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0090030';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0090030', 'AE0090030form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0090030form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0090030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0090030.AE0090030form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090030.AE0090030form1.PeekerPlantCd['onClick' + i])) {
        expj.AE0090030.AE0090030form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AE0090030.AE0090030form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AE0090030.AE0090030form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AE0090030-AE0090030form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090030', 'AE0090030form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AE0090030.AE0090030form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AE0090030.AE0090030form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AE0090030form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0090030-AE0090030form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0090030-AE0090030form1-PeekerPlantCd" class="AE0090030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0090030-AE0090030form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0090030Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AE0090030-AE0090030form1-DOWNLOAD_FILE">
expj.AE0090030.AE0090030form1.DOWNLOAD_FILE = {};
expj.AE0090030.AE0090030form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AE0090030form1/DOWNLOAD_FILE.onDecision');
  expj.AE0090030.AE0090030form1.executeAllOnDecision();
  expj.AE0090030.executeAllOnDecision();
};
expj.AE0090030.AE0090030form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AE0090030-AE0090030form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0090030', 'AE0090030form1', 'DOWNLOAD_FILE', this);
  });
  expj.AE0090030.AE0090030form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AE0090030.AE0090030form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AE0090030form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AE0090030-AE0090030form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0090030 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AE0090030-AE0090030button0">
expj.AE0090030.AE0090030button0 = {};
expj.AE0090030.AE0090030button0.executeAllOnDecision = function () {
  console.log('execute AE0090030button0.onDecision');
};
expj.AE0090030.AE0090030button0.executeOnLoad = function () {
  expj.AE0090030.AE0090030button0.executePScriptOnLoad();
};

expj.AE0090030.AE0090030button0.executePScriptOnLoad = function () {
  console.log('execute AE0090030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0090030-AE0090030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0090030-AE0090030button0-CsvOut">
expj.AE0090030.AE0090030button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0090030form1/*@AE0090030Servlet,,$ZZ07011"
expj.AE0090030.AE0090030button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090030', 'AE0090030button0', '_AE0090030form1/*', 'AE0090030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090030', response);
expj.common.updateBusinessScreenTab('AE0090030', contents);
};
expj.common.pscript.callConfirm('AE0090030', 'AE0090030button0', 'ZZ07011', okEvent);
};
expj.AE0090030.AE0090030button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090030.AE0090030button0.CsvOut['onClick' + i])) {
        expj.AE0090030.AE0090030button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AE0090030.AE0090030button0.CsvOut.executeAllOnDecision = function () {
};
expj.AE0090030.AE0090030button0.CsvOut.executeOnLoad = function () {
  $('#expj-AE0090030-AE0090030button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090030', 'AE0090030button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AE0090030.AE0090030button0.CsvOut.executePScriptOnLoad();
};

expj.AE0090030.AE0090030button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AE0090030button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AE0090030-AE0090030button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090030-AE0090030button0-CsvOut" name="CsvOut" class="AE0090030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AE0090030-AE0090030button0-Clear">
expj.AE0090030.AE0090030button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0090030Servlet,,$ZZ07008"
expj.AE0090030.AE0090030button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0090030', 'AE0090030button0', '', 'AE0090030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0090030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0090030', response);
expj.common.updateBusinessScreenTab('AE0090030', contents);
};
expj.common.pscript.callConfirm('AE0090030', 'AE0090030button0', 'ZZ07008', okEvent);
};
expj.AE0090030.AE0090030button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090030.AE0090030button0.Clear['onClick' + i])) {
        expj.AE0090030.AE0090030button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0090030.AE0090030button0.Clear.executeAllOnDecision = function () {
};
expj.AE0090030.AE0090030button0.Clear.executeOnLoad = function () {
  $('#expj-AE0090030-AE0090030button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090030', 'AE0090030button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0090030.AE0090030button0.Clear.executePScriptOnLoad();
};

expj.AE0090030.AE0090030button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0090030button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0090030-AE0090030button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090030-AE0090030button0-Clear" name="Clear" class="AE0090030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0090030-AE0090030button0-Close">
expj.AE0090030.AE0090030button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0090030.AE0090030button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0090030');
};
expj.AE0090030.AE0090030button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0090030.AE0090030button0.Close['onClick' + i])) {
        expj.AE0090030.AE0090030button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0090030.AE0090030button0.Close.executeAllOnDecision = function () {
};
expj.AE0090030.AE0090030button0.Close.executeOnLoad = function () {
  $('#expj-AE0090030-AE0090030button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0090030', 'AE0090030button0', 'Close', this, 'Button');
    }
  });
  expj.AE0090030.AE0090030button0.Close.executePScriptOnLoad();
};

expj.AE0090030.AE0090030button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0090030button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0090030-AE0090030button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0090030-AE0090030button0-Close" name="Close" class="AE0090030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0090030 (END)-->
<%
MessageStruct msgStruct = aAE0090030Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0090030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0090030)) {
  expj.common.treeInstanceMap.AE0090030 = {};
}
expj.common.treeInstanceMap.AE0090030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0090030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0090030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0090030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0090030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0090030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0090030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0090030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0090030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0090030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090030)) {
  expj.common.detailDialogMap.AE0090030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0090030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090030.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0090030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0090030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0090030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0090030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0090030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0090030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0090030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0090030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0090030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0090030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0090030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0090030)) {
  expj.common.viewInstanceMap.AE0090030 = {};
}
expj.common.viewInstanceMap.AE0090030.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0090030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0090030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0090030.<%=viewId %>.init = function () {
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
    expj.AE0090030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0090030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0090030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0090030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0090030_init">
/**
 * AE0090030用のロード完了時初期化関数
 */
expj.AE0090030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0090030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0090030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0090030');
  expj.common.calendarInstanceMap.AE0090030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0090030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0090030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0090030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0090030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0090030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0090030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0090030-<%=detailId %>');
<%
 }
%>
  try{expj.AE0090030.AE0090030form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0090030.AE0090030form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AE0090030.AE0090030form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AE0090030.AE0090030button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AE0090030.AE0090030button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0090030.AE0090030button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0090030.AE0090030form1.executeOnLoad();}catch(e){};
  try{expj.AE0090030.AE0090030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0090030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0090030', 'AE0090030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0090030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0090030-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0090030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0090030', '<%=request.getContextPath() %>');
};

/**
 * AE0090030の全体onDecision処理
 */
expj.AE0090030.executeAllOnDecision = function () {
  expj.AE0090030.AE0090030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0090030_console">
expj.AE0090030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>