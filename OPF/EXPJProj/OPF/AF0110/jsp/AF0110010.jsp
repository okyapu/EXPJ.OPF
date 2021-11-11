<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:40:17 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0110\AF0110010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0110.*" %>
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
<jsp:useBean id="aAF0110010Control" class="com.nec.jp.orteus.metamorBase.AF0110.AF0110010Control" scope="request"/>
<jsp:useBean id="aAF0110010Struct" class="com.nec.jp.orteus.metamorBase.AF0110.AF0110010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

余剰在庫一括振替
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0110/jsp/AF0110010.jsp,v $
$Author: geng-jia $
$Revision: 1.8 $ $Date: 2017/02/22 02:05:53 $
********************************************************* --%>
<html>
<head>
<title>余剰在庫一括振替</title>
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
<script class="expj-script-AF0110010_init">
  // AF0110010名前空間
  expj.AF0110010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0110010" data-screen="AF0110010" data-newdata="<%=aAF0110010Control.isNewData() %>">
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
              <script class="expj-script-AF0110010-AF0110010form1">
expj.AF0110010.AF0110010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AF0110010.AF0110010form1.onLoad0 = function () {
  console.log('AF0110010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AF0110010.AF0110010form1.onDecision0 = function () {
  console.log('AF0110010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AF0110010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AF0110010button1/PackageChange,_AF0110010button1/Select"
expj.AF0110010.AF0110010form1.child0 = function () {
  console.log('AF0110010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0110010', 'AF0110010form1', '_AF0110010button1/PackageChange');
expj.common.pscript.setUnMaskToReferenceComponent('AF0110010', 'AF0110010form1', '_AF0110010button1/Select');
};
// script4="child;1;MASK;_AF0110010button1/PackageChange,_AF0110010button1/Select"
expj.AF0110010.AF0110010form1.child1 = function () {
  console.log('AF0110010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AF0110010', 'AF0110010form1', '_AF0110010button1/PackageChange');
expj.common.pscript.setMaskToReferenceComponent('AF0110010', 'AF0110010form1', '_AF0110010button1/Select');
};
expj.AF0110010.AF0110010form1.executeAllOnDecision = function () {
  console.log('execute AF0110010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0110010.AF0110010form1['onDecision' + i])) {
        expj.AF0110010.AF0110010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0110010.AF0110010form1.executeOnLoad = function () {
  expj.AF0110010.AF0110010form1.executePScriptOnLoad();
};

expj.AF0110010.AF0110010form1.executePScriptOnLoad = function () {
  console.log('execute AF0110010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0110010.AF0110010form1['onLoad' + i])) {
      expj.AF0110010.AF0110010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0110010-AF0110010form1" action="AF0110010Servlet" name="AF0110010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0110010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:52px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AF0110010-AF0110010form1-JOB_ODR_CD">
expj.AF0110010.AF0110010form1.JOB_ODR_CD = {};
expj.AF0110010.AF0110010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0110010form1/JOB_ODR_CD.onDecision');
  expj.AF0110010.AF0110010form1.executeAllOnDecision();
  expj.AF0110010.executeAllOnDecision();
};
expj.AF0110010.AF0110010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0110010-AF0110010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0110010', 'AF0110010form1', 'JOB_ODR_CD', this);
  });
  expj.AF0110010.AF0110010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0110010.AF0110010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0110010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0110010-AF0110010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0110010-AF0110010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AF0110010-focus-move  required-value expj-AF0110010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0110010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0110010-AF0110010form1-PeekerJobOdrCd">
expj.AF0110010.AF0110010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AF0110010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AF0110010.AF0110010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0110010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0110010', 'PeekerJobOdrCd', 'SQLPARAM_1', '<%=aAF0110010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0110010', 'AF0110010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0110010', 'AF0110010form1', '_AF0110010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_06%&%';
parameterValues += 'TARGET_FIELD%=%_AF0110010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0110010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0110010.AF0110010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0110010.AF0110010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AF0110010.AF0110010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AF0110010.AF0110010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AF0110010.AF0110010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AF0110010-AF0110010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0110010', 'AF0110010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AF0110010.AF0110010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AF0110010.AF0110010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AF0110010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0110010-AF0110010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0110010-AF0110010form1-PeekerJobOdrCd" class="AF0110010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AF0110010-AF0110010form1-JOB_COMP_FLG">
expj.AF0110010.AF0110010form1.JOB_COMP_FLG = {};
expj.AF0110010.AF0110010form1.JOB_COMP_FLG.executeAllOnDecision = function () {
  console.log('execute AF0110010form1/JOB_COMP_FLG.onDecision');
  expj.AF0110010.AF0110010form1.executeAllOnDecision();
  expj.AF0110010.executeAllOnDecision();
};
expj.AF0110010.AF0110010form1.JOB_COMP_FLG.executeOnLoad = function () {
  $('#expj-AF0110010-AF0110010form1-JOB_COMP_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0110010', 'AF0110010form1', 'JOB_COMP_FLG', this, 'CheckBox');
    }
  });
  expj.AF0110010.AF0110010form1.JOB_COMP_FLG.executePScriptOnLoad();
};

expj.AF0110010.AF0110010form1.JOB_COMP_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0110010form1/JOB_COMP_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0110010-AF0110010form1-JOB_COMP_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="JOB_COMP_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAF0110010Struct.getJOB_COMP_FLG())) || "1".equals(TypeConverter.convert(aAF0110010Struct.getJOB_COMP_FLG())))?"checked=\"checked\"":"" %>  class="AF0110010-focus-move" id="expj-AF0110010-AF0110010form1-JOB_COMP_FLG"><label for="expj-AF0110010-AF0110010form1-JOB_COMP_FLG"><%=CoreTools.getRBString("Expj.Cmt0492",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:52px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AF0110010-AF0110010button1">
expj.AF0110010.AF0110010button1 = {};
expj.AF0110010.AF0110010button1.executeAllOnDecision = function () {
  console.log('execute AF0110010button1.onDecision');
};
expj.AF0110010.AF0110010button1.executeOnLoad = function () {
  expj.AF0110010.AF0110010button1.executePScriptOnLoad();
};

expj.AF0110010.AF0110010button1.executePScriptOnLoad = function () {
  console.log('execute AF0110010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0110010-AF0110010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0110010-AF0110010button1-PackageChange">
expj.AF0110010.AF0110010button1.PackageChange = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0110010form1/*@AF0110010Servlet,,$ZZ07001"
expj.AF0110010.AF0110010button1.PackageChange.onClick0 = function () {
  console.log('PackageChange script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0110010', 'AF0110010button1', '_AF0110010form1/*', 'AF0110010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0110010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0110010', response);
expj.common.updateBusinessScreenTab('AF0110010', contents);
};
expj.common.pscript.callConfirm('AF0110010', 'AF0110010button1', 'ZZ07001', okEvent);
};
expj.AF0110010.AF0110010button1.PackageChange.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0110010.AF0110010button1.PackageChange['onClick' + i])) {
        expj.AF0110010.AF0110010button1.PackageChange['onClick' + i]();
      }
    }
  }
};
expj.AF0110010.AF0110010button1.PackageChange.executeAllOnDecision = function () {
};
expj.AF0110010.AF0110010button1.PackageChange.executeOnLoad = function () {
  $('#expj-AF0110010-AF0110010button1-PackageChange').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0110010', 'AF0110010button1', 'PackageChange', this, 'Button');
    }
  });
  expj.AF0110010.AF0110010button1.PackageChange.executePScriptOnLoad();
};

expj.AF0110010.AF0110010button1.PackageChange.executePScriptOnLoad = function () {
  console.log('execute AF0110010button1/PackageChange.onLoad');
  var targetComponent = document.getElementById('expj-AF0110010-AF0110010button1-PackageChange');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0110010-AF0110010button1-PackageChange" name="PackageChange" class="AF0110010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLumpTransfer",rb)%></button><!-- 一括振替ボタン --></div><!--/td-->
<script class="expj-script-AF0110010-AF0110010button1-Select">
expj.AF0110010.AF0110010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0110010form1/*@AF0110010Servlet"
expj.AF0110010.AF0110010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0110010', 'AF0110010button1', '_AF0110010form1/*', 'AF0110010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0110010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0110010', response);
expj.common.updateBusinessScreenTab('AF0110010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0110010.AF0110010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0110010.AF0110010button1.Select['onClick' + i])) {
        expj.AF0110010.AF0110010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AF0110010.AF0110010button1.Select.executeAllOnDecision = function () {
};
expj.AF0110010.AF0110010button1.Select.executeOnLoad = function () {
  $('#expj-AF0110010-AF0110010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0110010', 'AF0110010button1', 'Select', this, 'Button');
    }
  });
  expj.AF0110010.AF0110010button1.Select.executePScriptOnLoad();
};

expj.AF0110010.AF0110010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AF0110010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AF0110010-AF0110010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0110010-AF0110010button1-Select" name="Select" class="AF0110010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AF0110010-AF0110010view1">
expj.AF0110010.AF0110010view1 = {};
expj.AF0110010.AF0110010view1.executeAllOnClick = function () {
};
expj.AF0110010.AF0110010view1.executeAllOnDecision = function () {
  console.log('execute AF0110010view1.onDecision');
};
expj.AF0110010.AF0110010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0110010view1", "expj.AF0110010.AF0110010view1.executeAllOnClick");
%>
  expj.AF0110010.AF0110010view1.executePScriptOnLoad();
};

expj.AF0110010.AF0110010view1.executePScriptOnLoad = function () {
  console.log('execute AF0110010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0110010-AF0110010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0110010view1_Id = "AF0110010view1";
 String AF0110010view1_select = "single";
 String AF0110010view1_sortable = "true";
 String AF0110010view1_resize = "true";
 String AF0110010view1_scroll = "true";
 StringBuffer AF0110010view1_HB = new StringBuffer();
 StringBuffer AF0110010view1_DB = new StringBuffer();
%>
<%
 AF0110010view1_select = "multi";
 AF0110010view1_sortable = "true";
 AF0110010view1_resize = "true";
 AF0110010view1_scroll = "true";
%>
<%
 AF0110010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
%>
     
<%
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'WH_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_TYP",rb))).append("', 'name':'WH_TYP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_3",rb))).append("', 'name':'STOCK_ON_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0494",rb))).append("', 'name':'CHANGE_PLAN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DRAW_CD",rb))).append("', 'name':'DRAW_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
AF0110010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_SPEC",rb))).append("', 'name':'SPEC', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0110010view1_sortable).append("}").append(",");
%>
<%
 int aAF0110010StructLength = aAF0110010Control.getListsize();
 final AF0110010Struct structBackup = aAF0110010Struct;
 aAF0110010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0110010StructLength; ++loopCount) {
  if((aAF0110010Struct = (AF0110010Struct) aAF0110010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0110010Struct", aAF0110010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0110010view1_DB.append("[");
 AF0110010view1_DB.append(loopCount);
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getITEM_CD())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getITEM_NAME())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getWH_CD())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getWH_NAME())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-WH_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-WH_TYP\" data-name=\"WH_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getWH_TYP())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-WH_TYP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-WH_TYP_NAME\" data-name=\"WH_TYP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getWH_TYP_NAME())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-STOCK_ON_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-STOCK_ON_HAND_QTY\" data-name=\"STOCK_ON_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0110010Struct.getSTOCK_ON_HAND_QTY())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-CHANGE_PLAN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-CHANGE_PLAN_QTY\" data-name=\"CHANGE_PLAN_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0110010Struct.getCHANGE_PLAN_QTY())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-DRAW_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-DRAW_CD\" data-name=\"DRAW_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getDRAW_CD())).append("</span>'");
 AF0110010view1_DB.append(",").append("'<span id=\"expj-AF0110010-AF0110010view1-SPEC-").append(loopCount).append("\" class=\"expj-label expj-AF0110010-AF0110010view1-SPEC\" data-name=\"SPEC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0110010Struct.getSPEC())).append("</span>'");
 AF0110010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0110010StructLength) {
   AF0110010view1_DB.append(",");
  }
 }
 aAF0110010Struct = structBackup;
 viewIdList.add(AF0110010view1_Id);
 viewSelectList.add(AF0110010view1_select);
 viewResizeList.add(AF0110010view1_resize);
 viewScrollList.add(AF0110010view1_scroll);
 viewHeaderDataList.add(AF0110010view1_HB);
 viewBodyDataList.add(AF0110010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:12px;">
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0110010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AF0110010-AF0110010button0">
expj.AF0110010.AF0110010button0 = {};
expj.AF0110010.AF0110010button0.executeAllOnDecision = function () {
  console.log('execute AF0110010button0.onDecision');
};
expj.AF0110010.AF0110010button0.executeOnLoad = function () {
  expj.AF0110010.AF0110010button0.executePScriptOnLoad();
};

expj.AF0110010.AF0110010button0.executePScriptOnLoad = function () {
  console.log('execute AF0110010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0110010-AF0110010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0110010-AF0110010button0-Clear">
expj.AF0110010.AF0110010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0110010Servlet,,$ZZ07008"
expj.AF0110010.AF0110010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0110010', 'AF0110010button0', '', 'AF0110010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0110010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0110010', response);
expj.common.updateBusinessScreenTab('AF0110010', contents);
};
expj.common.pscript.callConfirm('AF0110010', 'AF0110010button0', 'ZZ07008', okEvent);
};
expj.AF0110010.AF0110010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0110010.AF0110010button0.Clear['onClick' + i])) {
        expj.AF0110010.AF0110010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AF0110010.AF0110010button0.Clear.executeAllOnDecision = function () {
};
expj.AF0110010.AF0110010button0.Clear.executeOnLoad = function () {
  $('#expj-AF0110010-AF0110010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0110010', 'AF0110010button0', 'Clear', this, 'Button');
    }
  });
  expj.AF0110010.AF0110010button0.Clear.executePScriptOnLoad();
};

expj.AF0110010.AF0110010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AF0110010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0110010-AF0110010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0110010-AF0110010button0-Clear" name="Clear" class="AF0110010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0110010-AF0110010button0-Close">
expj.AF0110010.AF0110010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AF0110010.AF0110010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AF0110010');
};
expj.AF0110010.AF0110010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0110010.AF0110010button0.Close['onClick' + i])) {
        expj.AF0110010.AF0110010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AF0110010.AF0110010button0.Close.executeAllOnDecision = function () {
};
expj.AF0110010.AF0110010button0.Close.executeOnLoad = function () {
  $('#expj-AF0110010-AF0110010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0110010', 'AF0110010button0', 'Close', this, 'Button');
    }
  });
  expj.AF0110010.AF0110010button0.Close.executePScriptOnLoad();
};

expj.AF0110010.AF0110010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AF0110010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AF0110010-AF0110010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0110010-AF0110010button0-Close" name="Close" class="AF0110010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0110010 (END)-->
<%
MessageStruct msgStruct = aAF0110010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0110010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0110010)) {
  expj.common.treeInstanceMap.AF0110010 = {};
}
expj.common.treeInstanceMap.AF0110010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0110010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0110010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0110010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0110010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0110010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0110010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0110010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0110010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0110010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0110010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0110010)) {
  expj.common.detailDialogMap.AF0110010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0110010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0110010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0110010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0110010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0110010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0110010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0110010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0110010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0110010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0110010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0110010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0110010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0110010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0110010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0110010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0110010)) {
  expj.common.viewInstanceMap.AF0110010 = {};
}
expj.common.viewInstanceMap.AF0110010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0110010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0110010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0110010.<%=viewId %>.init = function () {
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
    expj.AF0110010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0110010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0110010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0110010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0110010_init">
/**
 * AF0110010用のロード完了時初期化関数
 */
expj.AF0110010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0110010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0110010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0110010');
  expj.common.calendarInstanceMap.AF0110010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0110010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0110010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0110010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0110010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0110010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0110010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0110010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0110010.AF0110010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010form1.JOB_COMP_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010button1.PackageChange.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010form1.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010button1.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010view1.executeOnLoad();}catch(e){};
  try{expj.AF0110010.AF0110010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0110010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0110010', 'AF0110010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0110010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0110010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0110010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0110010', '<%=request.getContextPath() %>');
};

/**
 * AF0110010の全体onDecision処理
 */
expj.AF0110010.executeAllOnDecision = function () {
  expj.AF0110010.AF0110010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0110010_console">
expj.AF0110010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>