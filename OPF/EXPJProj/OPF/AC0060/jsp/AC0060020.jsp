<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:27:47 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0060\AC0060020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0060.*" %>
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
<jsp:useBean id="aAC0060020Control" class="com.nec.jp.orteus.metamorBase.AC0060.AC0060020Control" scope="request"/>
<jsp:useBean id="aAC0060020Struct" class="com.nec.jp.orteus.metamorBase.AC0060.AC0060020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

�����v�ʓW�J���s
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0060/jsp/AC0060020.jsp,v $
$Author: geng-jia $	
$Revision: 1.17 $ $Date: 2017/02/22 02:04:26 $
********************************************************* --%>
<html>
<head>
<title>�����v�ʓW�J���s</title>
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
<script class="expj-script-AC0060020_init">
  // AC0060020���O���
  expj.AC0060020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0060020" data-screen="AC0060020" data-newdata="<%=aAC0060020Control.isNewData() %>">
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
              <script class="expj-script-AC0060020-AC0060020form1">
expj.AC0060020.AC0060020form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AC0060020.AC0060020form1.onLoad0 = function () {
  console.log('AC0060020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AC0060020.AC0060020form1.onDecision0 = function () {
  console.log('AC0060020form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AC0060020', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AC0060020button1/execute"
expj.AC0060020.AC0060020form1.child0 = function () {
  console.log('AC0060020form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AC0060020', 'AC0060020form1', '_AC0060020button1/execute');
};
// script4="child;1;MASK;_AC0060020button1/execute"
expj.AC0060020.AC0060020form1.child1 = function () {
  console.log('AC0060020form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0060020', 'AC0060020form1', '_AC0060020button1/execute');
};
expj.AC0060020.AC0060020form1.executeAllOnDecision = function () {
  console.log('execute AC0060020form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060020.AC0060020form1['onDecision' + i])) {
        expj.AC0060020.AC0060020form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0060020.AC0060020form1.executeOnLoad = function () {
  expj.AC0060020.AC0060020form1.executePScriptOnLoad();
};

expj.AC0060020.AC0060020form1.executePScriptOnLoad = function () {
  console.log('execute AC0060020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0060020.AC0060020form1['onLoad' + i])) {
      expj.AC0060020.AC0060020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0060020-AC0060020form1" action="AC0060020Servlet" name="AC0060020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0060020Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb)%></span><!-- �H��R�[�h --></div><!--/td-->
<script class="expj-script-AC0060020-AC0060020form1-w_PLANT_CD">
expj.AC0060020.AC0060020form1.w_PLANT_CD = {};
expj.AC0060020.AC0060020form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0060020form1/w_PLANT_CD.onDecision');
  expj.AC0060020.AC0060020form1.executeAllOnDecision();
  expj.AC0060020.executeAllOnDecision();
};
expj.AC0060020.AC0060020form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0060020-AC0060020form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0060020', 'AC0060020form1', 'w_PLANT_CD', this);
  });
  expj.AC0060020.AC0060020form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AC0060020.AC0060020form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0060020form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0060020-AC0060020form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0060020-AC0060020form1-w_PLANT_CD" name="w_PLANT_CD" class="AC0060020-focus-move  required-value expj-AC0060020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0060020Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AC0060020-AC0060020form1-PeekerPlantCd">
expj.AC0060020.AC0060020form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AC0060020form1/w_PLANT_CD@<%=contextNo%>"
expj.AC0060020.AC0060020form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0060020';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0060020', 'AC0060020form1', '_AC0060020form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0060020form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0060020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0060020.AC0060020form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060020.AC0060020form1.PeekerPlantCd['onClick' + i])) {
        expj.AC0060020.AC0060020form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AC0060020.AC0060020form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AC0060020.AC0060020form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AC0060020-AC0060020form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060020', 'AC0060020form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AC0060020.AC0060020form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AC0060020.AC0060020form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AC0060020form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0060020-AC0060020form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0060020-AC0060020form1-PeekerPlantCd" class="AC0060020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0060020-AC0060020button1">
expj.AC0060020.AC0060020button1 = {};
expj.AC0060020.AC0060020button1.executeAllOnDecision = function () {
  console.log('execute AC0060020button1.onDecision');
};
expj.AC0060020.AC0060020button1.executeOnLoad = function () {
  expj.AC0060020.AC0060020button1.executePScriptOnLoad();
};

expj.AC0060020.AC0060020button1.executePScriptOnLoad = function () {
  console.log('execute AC0060020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0060020-AC0060020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0060020-AC0060020button1-execute">
expj.AC0060020.AC0060020button1.execute = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0060020form1/*@AC0060020Servlet,,$ZZ07010"
expj.AC0060020.AC0060020button1.execute.onClick0 = function () {
  console.log('execute script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0060020', 'AC0060020button1', '_AC0060020form1/*', 'AC0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0060020', response);
expj.common.updateBusinessScreenTab('AC0060020', contents);
};
expj.common.pscript.callConfirm('AC0060020', 'AC0060020button1', 'ZZ07010', okEvent);
};
expj.AC0060020.AC0060020button1.execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060020.AC0060020button1.execute['onClick' + i])) {
        expj.AC0060020.AC0060020button1.execute['onClick' + i]();
      }
    }
  }
};
expj.AC0060020.AC0060020button1.execute.executeAllOnDecision = function () {
};
expj.AC0060020.AC0060020button1.execute.executeOnLoad = function () {
  $('#expj-AC0060020-AC0060020button1-execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060020', 'AC0060020button1', 'execute', this, 'Button');
    }
  });
  expj.AC0060020.AC0060020button1.execute.executePScriptOnLoad();
};

expj.AC0060020.AC0060020button1.execute.executePScriptOnLoad = function () {
  console.log('execute AC0060020button1/execute.onLoad');
  var targetComponent = document.getElementById('expj-AC0060020-AC0060020button1-execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060020-AC0060020button1-execute" name="execute" class="AC0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- ���s�{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0060020 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0060020-ZZ0000000button0">
expj.AC0060020.ZZ0000000button0 = {};
expj.AC0060020.ZZ0000000button0.executeAllOnDecision = function () {
  console.log('execute ZZ0000000button0.onDecision');
};
expj.AC0060020.ZZ0000000button0.executeOnLoad = function () {
  expj.AC0060020.ZZ0000000button0.executePScriptOnLoad();
};

expj.AC0060020.ZZ0000000button0.executePScriptOnLoad = function () {
  console.log('execute ZZ0000000button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0060020-ZZ0000000button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0060020-ZZ0000000button0-clear">
expj.AC0060020.ZZ0000000button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0060020Servlet,,$ZZ07008"
expj.AC0060020.ZZ0000000button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0060020', 'ZZ0000000button0', '', 'AC0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0060020', response);
expj.common.updateBusinessScreenTab('AC0060020', contents);
};
expj.common.pscript.callConfirm('AC0060020', 'ZZ0000000button0', 'ZZ07008', okEvent);
};
expj.AC0060020.ZZ0000000button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060020.ZZ0000000button0.clear['onClick' + i])) {
        expj.AC0060020.ZZ0000000button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AC0060020.ZZ0000000button0.clear.executeAllOnDecision = function () {
};
expj.AC0060020.ZZ0000000button0.clear.executeOnLoad = function () {
  $('#expj-AC0060020-ZZ0000000button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060020', 'ZZ0000000button0', 'clear', this, 'Button');
    }
  });
  expj.AC0060020.ZZ0000000button0.clear.executePScriptOnLoad();
};

expj.AC0060020.ZZ0000000button0.clear.executePScriptOnLoad = function () {
  console.log('execute ZZ0000000button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0060020-ZZ0000000button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060020-ZZ0000000button0-clear" name="clear" class="AC0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- �N���A�{�^�� --></div><!--/td-->
<script class="expj-script-AC0060020-ZZ0000000button0-close">
expj.AC0060020.ZZ0000000button0.close = {};
// script1="onClick;0;CLOSE"
expj.AC0060020.ZZ0000000button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AC0060020');
};
expj.AC0060020.ZZ0000000button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0060020.ZZ0000000button0.close['onClick' + i])) {
        expj.AC0060020.ZZ0000000button0.close['onClick' + i]();
      }
    }
  }
};
expj.AC0060020.ZZ0000000button0.close.executeAllOnDecision = function () {
};
expj.AC0060020.ZZ0000000button0.close.executeOnLoad = function () {
  $('#expj-AC0060020-ZZ0000000button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0060020', 'ZZ0000000button0', 'close', this, 'Button');
    }
  });
  expj.AC0060020.ZZ0000000button0.close.executePScriptOnLoad();
};

expj.AC0060020.ZZ0000000button0.close.executePScriptOnLoad = function () {
  console.log('execute ZZ0000000button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AC0060020-ZZ0000000button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0060020-ZZ0000000button0-close" name="close" class="AC0060020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- ����{�^�� --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0060020 (END)-->
<%
MessageStruct msgStruct = aAC0060020Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS�錾
 if (treeId != null) {
%>
<script class="expj-script-AC0060020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0060020)) {
  expj.common.treeInstanceMap.AC0060020 = {};
}
expj.common.treeInstanceMap.AC0060020.<%=treeId %> = {};
// TREE�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AC0060020.<%=treeId %>.treeInstance = null;
// �I�𒆂�Node��ۑ�����ϐ�
expj.common.treeInstanceMap.AC0060020.<%=treeId %>.gPrevSelectedNode = null;
// �R���e�L�X�g���j���[�̃C���X�^���X��ۑ�����ϐ�
expj.common.treeInstanceMap.AC0060020.<%=treeId %>.contextData = null;
// �c���[�̃m�[�h���I�����ꂽ���ɏ��������֐�
expj.common.treeInstanceMap.AC0060020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0060020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0060020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0060020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0060020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0060020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js�錾
 if (detailId != null) {
%>
<script class="expj-script-AC0060020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060020)) {
  expj.common.detailDialogMap.AC0060020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0060020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060020.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0060020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0060020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0060020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0060020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)��VIEW�{�f�B�f�[�^
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)��VIEW�w�b�_�[�f�[�^
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0060020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)��VIEW����
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0060020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // �ڍ׃E�B���h�E�̏�����
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0060020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0060020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0060020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0060020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0060020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0060020)) {
  expj.common.viewInstanceMap.AC0060020 = {};
}
expj.common.viewInstanceMap.AC0060020.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0060020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0060020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0060020.<%=viewId %>.init = function () {
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
    expj.AC0060020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0060020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0060020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0060020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0060020_init">
/**
 * AC0060020�p�̃��[�h�������������֐�
 */
expj.AC0060020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0060020');
  //�{�^���Ȃ��{�^���s�G���A�폜����
  expj.common.arrangeDatagridButtonArea('AC0060020');
  //��DataGridTable�ɓ��I�����ݒ�
  expj.common.setExpjDynamicHeight('AC0060020');
  expj.common.calendarInstanceMap.AC0060020 = {};
<%
 if (treeId != null) {
%>
  // TREE�̏�����
  expj.common.treeInstanceMap.AC0060020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)�p�̏�����
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0060020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)�̏�����
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0060020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0060020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0060020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0060020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0060020-<%=detailId %>');
<%
 }
%>
  try{expj.AC0060020.AC0060020form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0060020.AC0060020form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AC0060020.AC0060020button1.execute.executeOnLoad();}catch(e){};
  try{expj.AC0060020.ZZ0000000button0.clear.executeOnLoad();}catch(e){};
  try{expj.AC0060020.ZZ0000000button0.close.executeOnLoad();}catch(e){};
  try{expj.AC0060020.AC0060020form1.executeOnLoad();}catch(e){};
  try{expj.AC0060020.AC0060020button1.executeOnLoad();}catch(e){};
  try{expj.AC0060020.ZZ0000000button0.executeOnLoad();}catch(e){};
  // �R���\�[���o��
  expj.AC0060020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0060020', 'AC0060020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0060020');  
  // �L�[�ɂ��t�H�[�J�X�ړ��ݒ�
  expj.common.ui.setupFocusMove('.AC0060020-focus-move');
  // �����t�H�[�J�X���Ă鏈��
  $('.AC0060020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // �t�@�C���_�E�����[�h����
  expj.common.executeFileDownLoad('AC0060020', '<%=request.getContextPath() %>');
};

/**
 * AC0060020�̑S��onDecision����
 */
expj.AC0060020.executeAllOnDecision = function () {
  expj.AC0060020.AC0060020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0060020_console">
expj.AC0060020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // �R���\�[���o��
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>