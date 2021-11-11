<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:46:23 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AN0030\AN0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AN0030.*" %>
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
<jsp:useBean id="aAN0030010Control" class="com.nec.jp.orteus.metamorBase.AN0030.AN0030010Control" scope="request"/>
<jsp:useBean id="aAN0030010Struct" class="com.nec.jp.orteus.metamorBase.AN0030.AN0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

トランザクション保持期間メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0030/jsp/AN0030010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:06:22 $
********************************************************* --%>
<html>
<head>
<title>トランザクション保持期間メンテナンス</title>
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
<script class="expj-script-AN0030010_init">
  // AN0030010名前空間
  expj.AN0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AN0030010" data-screen="AN0030010" data-newdata="<%=aAN0030010Control.isNewData() %>">
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
              <script class="expj-script-AN0030010-AN0030010form1">
expj.AN0030010.AN0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AN0030010.AN0030010form1.onLoad0 = function () {
  console.log('AN0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AN0030010.AN0030010form1.onDecision0 = function () {
  console.log('AN0030010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AN0030010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AN0030010button1/Select"
expj.AN0030010.AN0030010form1.child0 = function () {
  console.log('AN0030010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AN0030010', 'AN0030010form1', '_AN0030010button1/Select');
};
// script4="child;1;MASK;_AN0030010button1/Select"
expj.AN0030010.AN0030010form1.child1 = function () {
  console.log('AN0030010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AN0030010', 'AN0030010form1', '_AN0030010button1/Select');
};
// script5="onDecision;1;CHK;?AN0030010view1/*[eq]NORMAL[and]?AN0030010form1/PLANT_CD[eq]SAME@*2,*3"
expj.AN0030010.AN0030010form1.onDecision1 = function () {
  console.log('AN0030010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0030010', 'AN0030010form1', '?AN0030010view1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AN0030010', 'AN0030010form1', '?AN0030010form1/PLANT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AN0030010button2/Update"
expj.AN0030010.AN0030010form1.child2 = function () {
  console.log('AN0030010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AN0030010', 'AN0030010form1', '_AN0030010button2/Update');
};
// script7="child;3;MASK;_AN0030010button2/Update"
expj.AN0030010.AN0030010form1.child3 = function () {
  console.log('AN0030010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AN0030010', 'AN0030010form1', '_AN0030010button2/Update');
};
expj.AN0030010.AN0030010form1.executeAllOnDecision = function () {
  console.log('execute AN0030010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0030010.AN0030010form1['onDecision' + i])) {
        expj.AN0030010.AN0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.AN0030010.AN0030010form1.executeOnLoad = function () {
  expj.AN0030010.AN0030010form1.executePScriptOnLoad();
};

expj.AN0030010.AN0030010form1.executePScriptOnLoad = function () {
  console.log('execute AN0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AN0030010.AN0030010form1['onLoad' + i])) {
      expj.AN0030010.AN0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AN0030010-AN0030010form1" action="AN0030010Servlet" name="AN0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AN0030010-AN0030010form1-PLANT_CD">
expj.AN0030010.AN0030010form1.PLANT_CD = {};
expj.AN0030010.AN0030010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AN0030010form1/PLANT_CD.onDecision');
  expj.AN0030010.AN0030010form1.executeAllOnDecision();
  expj.AN0030010.executeAllOnDecision();
};
expj.AN0030010.AN0030010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AN0030010-AN0030010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0030010', 'AN0030010form1', 'PLANT_CD', this);
  });
  expj.AN0030010.AN0030010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AN0030010.AN0030010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AN0030010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AN0030010-AN0030010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AN0030010-AN0030010form1-PLANT_CD" name="PLANT_CD" class="AN0030010-focus-move  required-value expj-AN0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0030010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AN0030010-AN0030010form1-PeekerPlantCd">
expj.AN0030010.AN0030010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AN0030010form1/PLANT_CD@<%=contextNo%>"
expj.AN0030010.AN0030010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AN0030010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AN0030010', 'AN0030010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AN0030010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AN0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AN0030010.AN0030010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0030010.AN0030010form1.PeekerPlantCd['onClick' + i])) {
        expj.AN0030010.AN0030010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AN0030010.AN0030010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AN0030010.AN0030010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AN0030010-AN0030010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0030010', 'AN0030010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AN0030010.AN0030010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AN0030010.AN0030010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AN0030010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AN0030010-AN0030010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AN0030010-AN0030010form1-PeekerPlantCd" class="AN0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AN0030010-AN0030010form1-PLANT_NAME">
expj.AN0030010.AN0030010form1.PLANT_NAME = {};
expj.AN0030010.AN0030010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AN0030010form1/PLANT_NAME.onDecision');
  expj.AN0030010.AN0030010form1.executeAllOnDecision();
  expj.AN0030010.executeAllOnDecision();
};
expj.AN0030010.AN0030010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AN0030010-AN0030010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0030010', 'AN0030010form1', 'PLANT_NAME', this);
  });
  expj.AN0030010.AN0030010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AN0030010.AN0030010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AN0030010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AN0030010-AN0030010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AN0030010-AN0030010form1-PLANT_NAME" name="PLANT_NAME" class="AN0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAN0030010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0030010-AN0030010button1">
expj.AN0030010.AN0030010button1 = {};
expj.AN0030010.AN0030010button1.executeAllOnDecision = function () {
  console.log('execute AN0030010button1.onDecision');
};
expj.AN0030010.AN0030010button1.executeOnLoad = function () {
  expj.AN0030010.AN0030010button1.executePScriptOnLoad();
};

expj.AN0030010.AN0030010button1.executePScriptOnLoad = function () {
  console.log('execute AN0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0030010-AN0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0030010-AN0030010button1-Select">
expj.AN0030010.AN0030010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0030010form1/*@AN0030010Servlet"
expj.AN0030010.AN0030010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0030010', 'AN0030010button1', '_AN0030010form1/*', 'AN0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0030010', response);
expj.common.updateBusinessScreenTab('AN0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AN0030010.AN0030010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0030010.AN0030010button1.Select['onClick' + i])) {
        expj.AN0030010.AN0030010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AN0030010.AN0030010button1.Select.executeAllOnDecision = function () {
};
expj.AN0030010.AN0030010button1.Select.executeOnLoad = function () {
  $('#expj-AN0030010-AN0030010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0030010', 'AN0030010button1', 'Select', this, 'Button');
    }
  });
  expj.AN0030010.AN0030010button1.Select.executePScriptOnLoad();
};

expj.AN0030010.AN0030010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AN0030010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AN0030010-AN0030010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0030010-AN0030010button1-Select" name="Select" class="AN0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AN0030010-AN0030010view1">
expj.AN0030010.AN0030010view1 = {};
expj.AN0030010.AN0030010view1.executeAllOnClick = function () {
};
expj.AN0030010.AN0030010view1.executeAllOnDecision = function () {
  console.log('execute AN0030010view1.onDecision');
};
expj.AN0030010.AN0030010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AN0030010view1", "expj.AN0030010.AN0030010view1.executeAllOnClick");
%>
  expj.AN0030010.AN0030010view1.executePScriptOnLoad();
};

expj.AN0030010.AN0030010view1.executePScriptOnLoad = function () {
  console.log('execute AN0030010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AN0030010-AN0030010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%= TypeConverter.sanitizer(aAN0030010Control.getReadStatusString()) %>"></div>
<!-- VIEW END -->
<%
 String AN0030010view1_Id = "AN0030010view1";
 String AN0030010view1_select = "single";
 String AN0030010view1_sortable = "true";
 String AN0030010view1_resize = "true";
 String AN0030010view1_scroll = "true";
 StringBuffer AN0030010view1_HB = new StringBuffer();
 StringBuffer AN0030010view1_DB = new StringBuffer();
%>
<%
 AN0030010view1_select = "none";
 AN0030010view1_sortable = "false";
 AN0030010view1_resize = "true";
 AN0030010view1_scroll = "true";
%>
<%
 AN0030010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AN0030010view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AN0030010-AN0030010view1-MNT_PERIOD">
expj.AN0030010.AN0030010view1.MNT_PERIOD = {};
expj.AN0030010.AN0030010view1.MNT_PERIOD.executeAllOnClick = function () {
};
expj.AN0030010.AN0030010view1.MNT_PERIOD.executeAllOnDecision = function () {
  console.log('execute AN0030010view1/MNT_PERIOD.onDecision');
  expj.AN0030010.AN0030010view1.executeAllOnDecision();
  expj.AN0030010.executeAllOnDecision();
};
expj.AN0030010.AN0030010view1.MNT_PERIOD.executeOnLoad = function () {
  $('.expj-AN0030010-AN0030010view1-MNT_PERIOD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AN0030010', 'AN0030010view1', 'MNT_PERIOD', this);
  });
  expj.AN0030010.AN0030010view1.MNT_PERIOD.executePScriptOnLoad();
};

expj.AN0030010.AN0030010view1.MNT_PERIOD.executePScriptOnLoad = function () {
  console.log('execute AN0030010view1/MNT_PERIOD.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AN0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'300px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MNT_DATA_TYP",rb))).append("', 'name':'DISPLAY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AN0030010view1_sortable).append("}").append(",");
AN0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MNT_PERIOD_1",rb))).append("', 'name':'MNT_PERIOD', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AN0030010view1_sortable).append("}").append(",");
AN0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MNT_DATA_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0030010view1_sortable).append("}").append(",");
AN0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MNT_PERIOD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0030010view1_sortable).append("}").append(",");
AN0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AN0030010view1_sortable).append("}").append(",");
%>
<%
 int aAN0030010StructLength = aAN0030010Control.getListsize();
 final AN0030010Struct structBackup = aAN0030010Struct;
 aAN0030010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAN0030010StructLength; ++loopCount) {
  if((aAN0030010Struct = (AN0030010Struct) aAN0030010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAN0030010Struct", aAN0030010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AN0030010view1_DB.append("[");
 AN0030010view1_DB.append(loopCount);
 AN0030010view1_DB.append(",").append("'<span id=\"expj-AN0030010-AN0030010view1-DISPLAY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AN0030010-AN0030010view1-DISPLAY_NAME\" data-name=\"DISPLAY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0030010Struct.getDISPLAY_NAME())).append("</span>'");
 AN0030010view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AN0030010-AN0030010view1-MNT_PERIOD-").append(loopCount).append("\" class=\"expj-AN0030010-AN0030010view1-MNT_PERIOD AN0030010-focus-move\" data-name=\"MNT_PERIOD\" data-view=\"true\" style=\"text-align:right;\" maxlength=\"2147483647\" data-kind=\"").append("OBT_INTEGER_P;4").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAN0030010Struct.getMNT_PERIOD())).append("\">'");
 AN0030010view1_DB.append(",").append("'<span id=\"expj-AN0030010-AN0030010view1-h_MNT_DATA_TYP-").append(loopCount).append("\" class=\"expj-label expj-AN0030010-AN0030010view1-h_MNT_DATA_TYP\" data-name=\"h_MNT_DATA_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0030010Struct.geth_MNT_DATA_TYP())).append("</span>'");
 AN0030010view1_DB.append(",").append("'<span id=\"expj-AN0030010-AN0030010view1-h_MNT_PERIOD-").append(loopCount).append("\" class=\"expj-label expj-AN0030010-AN0030010view1-h_MNT_PERIOD\" data-name=\"h_MNT_PERIOD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0030010Struct.geth_MNT_PERIOD())).append("</span>'");
 AN0030010view1_DB.append(",").append("'<span id=\"expj-AN0030010-AN0030010view1-h_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AN0030010-AN0030010view1-h_MODIFY_COUNT\" data-name=\"h_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAN0030010Struct.geth_MODIFY_COUNT())).append("</span>'");
 AN0030010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAN0030010StructLength) {
   AN0030010view1_DB.append(",");
  }
 }
 aAN0030010Struct = structBackup;
 viewIdList.add(AN0030010view1_Id);
 viewSelectList.add(AN0030010view1_select);
 viewResizeList.add(AN0030010view1_resize);
 viewScrollList.add(AN0030010view1_scroll);
 viewHeaderDataList.add(AN0030010view1_HB);
 viewBodyDataList.add(AN0030010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AN0030010-AN0030010button2">
expj.AN0030010.AN0030010button2 = {};
expj.AN0030010.AN0030010button2.executeAllOnDecision = function () {
  console.log('execute AN0030010button2.onDecision');
};
expj.AN0030010.AN0030010button2.executeOnLoad = function () {
  expj.AN0030010.AN0030010button2.executePScriptOnLoad();
};

expj.AN0030010.AN0030010button2.executePScriptOnLoad = function () {
  console.log('execute AN0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0030010-AN0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0030010-AN0030010button2-Update">
expj.AN0030010.AN0030010button2.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0030010form1/*,_AN0030010view1/*@AN0030010Servlet,,$ZZ07003"
expj.AN0030010.AN0030010button2.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0030010', 'AN0030010button2', '_AN0030010form1/*,_AN0030010view1/*', 'AN0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0030010', response);
expj.common.updateBusinessScreenTab('AN0030010', contents);
};
expj.common.pscript.callConfirm('AN0030010', 'AN0030010button2', 'ZZ07003', okEvent);
};
expj.AN0030010.AN0030010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0030010.AN0030010button2.Update['onClick' + i])) {
        expj.AN0030010.AN0030010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AN0030010.AN0030010button2.Update.executeAllOnDecision = function () {
};
expj.AN0030010.AN0030010button2.Update.executeOnLoad = function () {
  $('#expj-AN0030010-AN0030010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0030010', 'AN0030010button2', 'Update', this, 'Button');
    }
  });
  expj.AN0030010.AN0030010button2.Update.executePScriptOnLoad();
};

expj.AN0030010.AN0030010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AN0030010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AN0030010-AN0030010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0030010-AN0030010button2-Update" name="Update" class="AN0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AN0030010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AN0030010-AN0030010button0">
expj.AN0030010.AN0030010button0 = {};
expj.AN0030010.AN0030010button0.executeAllOnDecision = function () {
  console.log('execute AN0030010button0.onDecision');
};
expj.AN0030010.AN0030010button0.executeOnLoad = function () {
  expj.AN0030010.AN0030010button0.executePScriptOnLoad();
};

expj.AN0030010.AN0030010button0.executePScriptOnLoad = function () {
  console.log('execute AN0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AN0030010-AN0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AN0030010-AN0030010button0-Clear">
expj.AN0030010.AN0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AN0030010form1/*@AN0030010Servlet,,$ZZ07008"
expj.AN0030010.AN0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AN0030010', 'AN0030010button0', '_AN0030010form1/*', 'AN0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AN0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AN0030010', response);
expj.common.updateBusinessScreenTab('AN0030010', contents);
};
expj.common.pscript.callConfirm('AN0030010', 'AN0030010button0', 'ZZ07008', okEvent);
};
expj.AN0030010.AN0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0030010.AN0030010button0.Clear['onClick' + i])) {
        expj.AN0030010.AN0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AN0030010.AN0030010button0.Clear.executeAllOnDecision = function () {
};
expj.AN0030010.AN0030010button0.Clear.executeOnLoad = function () {
  $('#expj-AN0030010-AN0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0030010', 'AN0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.AN0030010.AN0030010button0.Clear.executePScriptOnLoad();
};

expj.AN0030010.AN0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AN0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AN0030010-AN0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0030010-AN0030010button0-Clear" name="Clear" class="AN0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AN0030010-AN0030010button0-Close">
expj.AN0030010.AN0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AN0030010.AN0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AN0030010');
};
expj.AN0030010.AN0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AN0030010.AN0030010button0.Close['onClick' + i])) {
        expj.AN0030010.AN0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AN0030010.AN0030010button0.Close.executeAllOnDecision = function () {
};
expj.AN0030010.AN0030010button0.Close.executeOnLoad = function () {
  $('#expj-AN0030010-AN0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AN0030010', 'AN0030010button0', 'Close', this, 'Button');
    }
  });
  expj.AN0030010.AN0030010button0.Close.executePScriptOnLoad();
};

expj.AN0030010.AN0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AN0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AN0030010-AN0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AN0030010-AN0030010button0-Close" name="Close" class="AN0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AN0030010 (END)-->
<%
  MessageStruct msgStruct = aAN0030010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AN0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AN0030010)) {
  expj.common.treeInstanceMap.AN0030010 = {};
}
expj.common.treeInstanceMap.AN0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AN0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AN0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AN0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AN0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AN0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AN0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AN0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AN0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AN0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0030010)) {
  expj.common.detailDialogMap.AN0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AN0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.AN0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AN0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AN0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AN0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AN0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AN0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AN0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AN0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AN0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AN0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AN0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AN0030010)) {
  expj.common.viewInstanceMap.AN0030010 = {};
}
expj.common.viewInstanceMap.AN0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.AN0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AN0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AN0030010.<%=viewId %>.init = function () {
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
    expj.AN0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AN0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AN0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AN0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AN0030010_init">
/**
 * AN0030010用のロード完了時初期化関数
 */
expj.AN0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AN0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AN0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AN0030010');
  expj.common.calendarInstanceMap.AN0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AN0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AN0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AN0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AN0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AN0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AN0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AN0030010-<%=detailId %>');
<%
 }
%>
  try{expj.AN0030010.AN0030010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010view1.MNT_PERIOD.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010form1.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010button1.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010view1.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010button2.executeOnLoad();}catch(e){};
  try{expj.AN0030010.AN0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AN0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AN0030010', 'AN0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AN0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AN0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.AN0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AN0030010', '<%=request.getContextPath() %>');
};

/**
 * AN0030010の全体onDecision処理
 */
expj.AN0030010.executeAllOnDecision = function () {
  expj.AN0030010.AN0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AN0030010_console">
expj.AN0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>