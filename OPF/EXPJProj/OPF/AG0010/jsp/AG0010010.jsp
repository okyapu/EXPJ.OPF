<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:40:47 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AG0010\AG0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AG0010.*" %>
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
<jsp:useBean id="aAG0010010Control" class="com.nec.jp.orteus.metamorBase.AG0010.AG0010010Control" scope="request"/>
<jsp:useBean id="aAG0010010Struct" class="com.nec.jp.orteus.metamorBase.AG0010.AG0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

在庫参照
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/jsp/AG0010010.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:05:55 $
********************************************************* --%>
<html>
<head>
<title>在庫参照</title>
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
<script class="expj-script-AG0010010_init">
  // AG0010010名前空間
  expj.AG0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AG0010010" data-screen="AG0010010" data-newdata="<%=aAG0010010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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
 
            <div class="expj-td frame04" style=""></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <script class="expj-script-AG0010010-AG0010010form1">
expj.AG0010010.AG0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AG0010010.AG0010010form1.onLoad0 = function () {
  console.log('AG0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AG0010010.AG0010010form1.onDecision0 = function () {
  console.log('AG0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AG0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AG0010010button1/select,_AG0010010button1/inventoryDetail"
expj.AG0010010.AG0010010form1.child0 = function () {
  console.log('AG0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AG0010010', 'AG0010010form1', '_AG0010010button1/select');
expj.common.pscript.setUnMaskToReferenceComponent('AG0010010', 'AG0010010form1', '_AG0010010button1/inventoryDetail');
};
// script4="child;1;MASK;_AG0010010button1/select,_AG0010010button1/inventoryDetail"
expj.AG0010010.AG0010010form1.child1 = function () {
  console.log('AG0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AG0010010', 'AG0010010form1', '_AG0010010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AG0010010', 'AG0010010form1', '_AG0010010button1/inventoryDetail');
};
expj.AG0010010.AG0010010form1.executeAllOnDecision = function () {
  console.log('execute AG0010010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010010form1['onDecision' + i])) {
        expj.AG0010010.AG0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010010form1.executeOnLoad = function () {
  expj.AG0010010.AG0010010form1.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form1.executePScriptOnLoad = function () {
  console.log('execute AG0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AG0010010.AG0010010form1['onLoad' + i])) {
      expj.AG0010010.AG0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0010010-AG0010010form1" action="AG0010010Servlet" name="AG0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form1-w_PLANT_CD">
expj.AG0010010.AG0010010form1.w_PLANT_CD = {};
expj.AG0010010.AG0010010form1.w_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AG0010010form1/w_PLANT_CD.onDecision');
  expj.AG0010010.AG0010010form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form1.w_PLANT_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form1-w_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form1', 'w_PLANT_CD', this);
  });
  expj.AG0010010.AG0010010form1.w_PLANT_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form1.w_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010010form1/w_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form1-w_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form1-w_PLANT_CD" name="w_PLANT_CD" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_PLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form1-PeekerWPlantCd">
expj.AG0010010.AG0010010form1.PeekerWPlantCd = {};
// script1="onClick;0;PEEKER;_AG0010010form1/w_PLANT_CD@<%=contextNo%>"
expj.AG0010010.AG0010010form1.PeekerWPlantCd.onClick0 = function () {
  console.log('PeekerWPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0010010';
var parameterValues = 'PeekerWPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0010010', 'AG0010010form1', '_AG0010010form1/w_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0010010form1/w_PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0010010.AG0010010form1.PeekerWPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010010form1.PeekerWPlantCd['onClick' + i])) {
        expj.AG0010010.AG0010010form1.PeekerWPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010010form1.PeekerWPlantCd.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010010form1.PeekerWPlantCd.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form1-PeekerWPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010010form1', 'PeekerWPlantCd', this, 'Button');
    }
  });
  expj.AG0010010.AG0010010form1.PeekerWPlantCd.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form1.PeekerWPlantCd.executePScriptOnLoad = function () {
  console.log('execute AG0010010form1/PeekerWPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form1-PeekerWPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0010010-AG0010010form1-PeekerWPlantCd" class="AG0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form1-w_PLANT_NAME">
expj.AG0010010.AG0010010form1.w_PLANT_NAME = {};
expj.AG0010010.AG0010010form1.w_PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010010form1/w_PLANT_NAME.onDecision');
  expj.AG0010010.AG0010010form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form1.w_PLANT_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form1-w_PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form1', 'w_PLANT_NAME', this);
  });
  expj.AG0010010.AG0010010form1.w_PLANT_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form1.w_PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010010form1/w_PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form1-w_PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form1-w_PLANT_NAME" name="w_PLANT_NAME" class="AG0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_PLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form1-w_ITEM_CD">
expj.AG0010010.AG0010010form1.w_ITEM_CD = {};
expj.AG0010010.AG0010010form1.w_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AG0010010form1/w_ITEM_CD.onDecision');
  expj.AG0010010.AG0010010form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form1.w_ITEM_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form1-w_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form1', 'w_ITEM_CD', this);
  });
  expj.AG0010010.AG0010010form1.w_ITEM_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form1.w_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010010form1/w_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form1-w_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form1-w_ITEM_CD" name="w_ITEM_CD" class="AG0010010-focus-move  required-value expj-AG0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form1-PeekerWItemCd">
expj.AG0010010.AG0010010form1.PeekerWItemCd = {};
// script1="onClick;0;PEEKER;_AG0010010form1/w_ITEM_CD@<%=contextNo%>"
expj.AG0010010.AG0010010form1.PeekerWItemCd.onClick0 = function () {
  console.log('PeekerWItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AG0010010';
var parameterValues = 'PeekerWItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AG0010010', 'AG0010010form1', '_AG0010010form1/w_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AG0010010form1/w_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AG0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AG0010010.AG0010010form1.PeekerWItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010010form1.PeekerWItemCd['onClick' + i])) {
        expj.AG0010010.AG0010010form1.PeekerWItemCd['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010010form1.PeekerWItemCd.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010010form1.PeekerWItemCd.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form1-PeekerWItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010010form1', 'PeekerWItemCd', this, 'Button');
    }
  });
  expj.AG0010010.AG0010010form1.PeekerWItemCd.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form1.PeekerWItemCd.executePScriptOnLoad = function () {
  console.log('execute AG0010010form1/PeekerWItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form1-PeekerWItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AG0010010-AG0010010form1-PeekerWItemCd" class="AG0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form1-w_ITEM_NAME">
expj.AG0010010.AG0010010form1.w_ITEM_NAME = {};
expj.AG0010010.AG0010010form1.w_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010010form1/w_ITEM_NAME.onDecision');
  expj.AG0010010.AG0010010form1.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form1.w_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form1-w_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form1', 'w_ITEM_NAME', this);
  });
  expj.AG0010010.AG0010010form1.w_ITEM_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form1.w_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010010form1/w_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form1-w_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form1-w_ITEM_NAME" name="w_ITEM_NAME" class="AG0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AG0010010-AG0010010button1">
expj.AG0010010.AG0010010button1 = {};
expj.AG0010010.AG0010010button1.executeAllOnDecision = function () {
  console.log('execute AG0010010button1.onDecision');
};
expj.AG0010010.AG0010010button1.executeOnLoad = function () {
  expj.AG0010010.AG0010010button1.executePScriptOnLoad();
};

expj.AG0010010.AG0010010button1.executePScriptOnLoad = function () {
  console.log('execute AG0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0010010-AG0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0010010-AG0010010button1-inventoryDetail">
expj.AG0010010.AG0010010button1.inventoryDetail = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AG0010010form1/*@AG0010010Servlet"
expj.AG0010010.AG0010010button1.inventoryDetail.onClick0 = function () {
  console.log('inventoryDetail script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0010010', 'AG0010010button1', '_AG0010010form1/*', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0010010', response);
expj.common.changeBusinessScreenTab('AG0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0010010.AG0010010button1.inventoryDetail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010010button1.inventoryDetail['onClick' + i])) {
        expj.AG0010010.AG0010010button1.inventoryDetail['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010010button1.inventoryDetail.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010010button1.inventoryDetail.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010button1-inventoryDetail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010010button1', 'inventoryDetail', this, 'Button');
    }
  });
  expj.AG0010010.AG0010010button1.inventoryDetail.executePScriptOnLoad();
};

expj.AG0010010.AG0010010button1.inventoryDetail.executePScriptOnLoad = function () {
  console.log('execute AG0010010button1/inventoryDetail.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010button1-inventoryDetail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0010010-AG0010010button1-inventoryDetail" name="inventoryDetail" class="AG0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInventoryDetail",rb)%></button><!-- 在庫詳細ボタン --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010button1-select">
expj.AG0010010.AG0010010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AG0010010form1/*@AG0010010Servlet"
expj.AG0010010.AG0010010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0010010', 'AG0010010button1', '_AG0010010form1/*', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0010010', response);
expj.common.updateBusinessScreenTab('AG0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AG0010010.AG0010010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010010button1.select['onClick' + i])) {
        expj.AG0010010.AG0010010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010010button1.select.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010010button1.select.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010010button1', 'select', this, 'Button');
    }
  });
  expj.AG0010010.AG0010010button1.select.executePScriptOnLoad();
};

expj.AG0010010.AG0010010button1.select.executePScriptOnLoad = function () {
  console.log('execute AG0010010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0010010-AG0010010button1-select" name="select" class="AG0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AG0010010-AA0010010form2">
expj.AG0010010.AA0010010form2 = {};
expj.AG0010010.AA0010010form2.executeAllOnDecision = function () {
  console.log('execute AA0010010form2.onDecision');
};
expj.AG0010010.AA0010010form2.executeOnLoad = function () {
  expj.AG0010010.AA0010010form2.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0010010-AA0010010form2" action="AG0010010Servlet" name="AA0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0222",rb)%></span><!-- MRP対象 --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0223",rb)%></span><!-- MRP対象外 --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_2",rb)%></span><!-- 品目別手持在庫数 --></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY">
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY = {};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_ITEM_STOCK_QTY', this);
  });
  expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY" name="w_ITEM_STOCK_QTY" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_STOCK_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_FOR_MRP">
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_FOR_MRP = {};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_FOR_MRP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_FOR_MRP.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_FOR_MRP.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_FOR_MRP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_ITEM_STOCK_QTY_FOR_MRP', this);
  });
  expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_FOR_MRP.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_FOR_MRP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_FOR_MRP.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_FOR_MRP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_FOR_MRP" name="w_ITEM_STOCK_QTY_FOR_MRP" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_STOCK_QTY_FOR_MRP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_OUTSIDE_MRP">
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_OUTSIDE_MRP = {};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_OUTSIDE_MRP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_OUTSIDE_MRP.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_OUTSIDE_MRP.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_OUTSIDE_MRP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_ITEM_STOCK_QTY_OUTSIDE_MRP', this);
  });
  expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_OUTSIDE_MRP.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_OUTSIDE_MRP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_OUTSIDE_MRP.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_OUTSIDE_MRP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_OUTSIDE_MRP" name="w_ITEM_STOCK_QTY_OUTSIDE_MRP" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_STOCK_QTY_OUTSIDE_MRP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_1",rb)%></span><!-- 製番別手持在庫数 --></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY">
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY = {};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_JOB_ODR_STOCK_QTY', this);
  });
  expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY" name="w_JOB_ODR_STOCK_QTY" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_JOB_ODR_STOCK_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_FOR_MRP">
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_FOR_MRP = {};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_FOR_MRP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_FOR_MRP.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_FOR_MRP.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_FOR_MRP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_JOB_ODR_STOCK_QTY_FOR_MRP', this);
  });
  expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_FOR_MRP.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_FOR_MRP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_FOR_MRP.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_FOR_MRP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_FOR_MRP" name="w_JOB_ODR_STOCK_QTY_FOR_MRP" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_JOB_ODR_STOCK_QTY_FOR_MRP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP">
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = {};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP', this);
  });
  expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP" name="w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0307",rb)%></span><!-- 在庫合計 --></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY">
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY = {};
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_TOTAL_STOCK_QTY.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_TOTAL_STOCK_QTY', this);
  });
  expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_TOTAL_STOCK_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY" name="w_TOTAL_STOCK_QTY" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_TOTAL_STOCK_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_QTY_4",rb)%></span><!-- 品目別不良数 --></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_ITEM_DEFECT_QTY">
expj.AG0010010.AA0010010form2.w_ITEM_DEFECT_QTY = {};
expj.AG0010010.AA0010010form2.w_ITEM_DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_ITEM_DEFECT_QTY.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_ITEM_DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_ITEM_DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_ITEM_DEFECT_QTY', this);
  });
  expj.AG0010010.AA0010010form2.w_ITEM_DEFECT_QTY.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_ITEM_DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_ITEM_DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_ITEM_DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_ITEM_DEFECT_QTY" name="w_ITEM_DEFECT_QTY" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_DEFECT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0116",rb)%></span><!-- 前日末 --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0115",rb)%></span><!-- 前月末 --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_2",rb)%></span><!-- 品目別手持在庫数 --></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_DAY">
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_DAY = {};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_DAY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_LAST_DAY.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_DAY.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_DAY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_ITEM_STOCK_QTY_LAST_DAY', this);
  });
  expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_DAY.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_DAY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_LAST_DAY.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_DAY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_DAY" name="w_ITEM_STOCK_QTY_LAST_DAY" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_STOCK_QTY_LAST_DAY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_MONTH">
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_MONTH = {};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_MONTH.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_LAST_MONTH.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_MONTH.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_ITEM_STOCK_QTY_LAST_MONTH', this);
  });
  expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_MONTH.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_MONTH.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_ITEM_STOCK_QTY_LAST_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_ITEM_STOCK_QTY_LAST_MONTH" name="w_ITEM_STOCK_QTY_LAST_MONTH" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_ITEM_STOCK_QTY_LAST_MONTH()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_1",rb)%></span><!-- 製番別手持在庫数 --></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_DAY">
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_DAY = {};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_DAY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_LAST_DAY.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_DAY.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_DAY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_JOB_ODR_STOCK_QTY_LAST_DAY', this);
  });
  expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_DAY.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_DAY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_LAST_DAY.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_DAY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_DAY" name="w_JOB_ODR_STOCK_QTY_LAST_DAY" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_JOB_ODR_STOCK_QTY_LAST_DAY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_MONTH">
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_MONTH = {};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_MONTH.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_LAST_MONTH.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_MONTH.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_JOB_ODR_STOCK_QTY_LAST_MONTH', this);
  });
  expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_MONTH.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_MONTH.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_JOB_ODR_STOCK_QTY_LAST_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_JOB_ODR_STOCK_QTY_LAST_MONTH" name="w_JOB_ODR_STOCK_QTY_LAST_MONTH" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_JOB_ODR_STOCK_QTY_LAST_MONTH()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0307",rb)%></span><!-- 在庫合計 --></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_DAY">
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_DAY = {};
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_DAY.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_TOTAL_STOCK_QTY_LAST_DAY.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_DAY.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_DAY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_TOTAL_STOCK_QTY_LAST_DAY', this);
  });
  expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_DAY.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_DAY.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_TOTAL_STOCK_QTY_LAST_DAY.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_DAY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_DAY" name="w_TOTAL_STOCK_QTY_LAST_DAY" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_TOTAL_STOCK_QTY_LAST_DAY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_MONTH">
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_MONTH = {};
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_MONTH.executeAllOnDecision = function () {
  console.log('execute AA0010010form2/w_TOTAL_STOCK_QTY_LAST_MONTH.onDecision');
  expj.AG0010010.AA0010010form2.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_MONTH.executeOnLoad = function () {
  $('#expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AA0010010form2', 'w_TOTAL_STOCK_QTY_LAST_MONTH', this);
  });
  expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_MONTH.executePScriptOnLoad();
};

expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_MONTH.executePScriptOnLoad = function () {
  console.log('execute AA0010010form2/w_TOTAL_STOCK_QTY_LAST_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AG0010010-AA0010010form2-w_TOTAL_STOCK_QTY_LAST_MONTH" name="w_TOTAL_STOCK_QTY_LAST_MONTH" class="AG0010010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getw_TOTAL_STOCK_QTY_LAST_MONTH()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AG0010010-AG0010010form3">
expj.AG0010010.AG0010010form3 = {};
expj.AG0010010.AG0010010form3.executeAllOnDecision = function () {
  console.log('execute AG0010010form3.onDecision');
};
expj.AG0010010.AG0010010form3.executeOnLoad = function () {
  expj.AG0010010.AG0010010form3.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form3.executePScriptOnLoad = function () {
  console.log('execute AG0010010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AG0010010-AG0010010form3" action="AG0010010Servlet" name="AG0010010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form3-DRAW_CD">
expj.AG0010010.AG0010010form3.DRAW_CD = {};
expj.AG0010010.AG0010010form3.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AG0010010form3/DRAW_CD.onDecision');
  expj.AG0010010.AG0010010form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form3.DRAW_CD.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form3-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form3', 'DRAW_CD', this);
  });
  expj.AG0010010.AG0010010form3.DRAW_CD.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form3.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AG0010010form3/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form3-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form3-DRAW_CD" name="DRAW_CD" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT",rb)%></span><!-- 計量単位 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form3-STOCK_UNIT">
expj.AG0010010.AG0010010form3.STOCK_UNIT = {};
expj.AG0010010.AG0010010form3.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AG0010010form3/STOCK_UNIT.onDecision');
  expj.AG0010010.AG0010010form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form3.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form3-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form3', 'STOCK_UNIT', this);
  });
  expj.AG0010010.AG0010010form3.STOCK_UNIT.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form3.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AG0010010form3/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form3-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form3-STOCK_UNIT" name="STOCK_UNIT" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form3-SPEC">
expj.AG0010010.AG0010010form3.SPEC = {};
expj.AG0010010.AG0010010form3.SPEC.executeAllOnDecision = function () {
  console.log('execute AG0010010form3/SPEC.onDecision');
  expj.AG0010010.AG0010010form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form3.SPEC.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form3-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form3', 'SPEC', this);
  });
  expj.AG0010010.AG0010010form3.SPEC.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form3.SPEC.executePScriptOnLoad = function () {
  console.log('execute AG0010010form3/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form3-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form3-SPEC" name="SPEC" class="AG0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010form3-MRP_ODR_NAME">
expj.AG0010010.AG0010010form3.MRP_ODR_NAME = {};
expj.AG0010010.AG0010010form3.MRP_ODR_NAME.executeAllOnDecision = function () {
  console.log('execute AG0010010form3/MRP_ODR_NAME.onDecision');
  expj.AG0010010.AG0010010form3.executeAllOnDecision();
  expj.AG0010010.executeAllOnDecision();
};
expj.AG0010010.AG0010010form3.MRP_ODR_NAME.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010form3-MRP_ODR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AG0010010', 'AG0010010form3', 'MRP_ODR_NAME', this);
  });
  expj.AG0010010.AG0010010form3.MRP_ODR_NAME.executePScriptOnLoad();
};

expj.AG0010010.AG0010010form3.MRP_ODR_NAME.executePScriptOnLoad = function () {
  console.log('execute AG0010010form3/MRP_ODR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010form3-MRP_ODR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AG0010010-AG0010010form3-MRP_ODR_NAME" name="MRP_ODR_NAME" class="AG0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAG0010010Struct.getMRP_ODR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AG0010010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AG0010010-AG0010010button0">
expj.AG0010010.AG0010010button0 = {};
expj.AG0010010.AG0010010button0.executeAllOnDecision = function () {
  console.log('execute AG0010010button0.onDecision');
};
expj.AG0010010.AG0010010button0.executeOnLoad = function () {
  expj.AG0010010.AG0010010button0.executePScriptOnLoad();
};

expj.AG0010010.AG0010010button0.executePScriptOnLoad = function () {
  console.log('execute AG0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AG0010010-AG0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AG0010010-AG0010010button0-clear">
expj.AG0010010.AG0010010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AG0010010Servlet,,$ZZ07008"
expj.AG0010010.AG0010010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AG0010010', 'AG0010010button0', '', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AG0010010', response);
expj.common.updateBusinessScreenTab('AG0010010', contents);
};
expj.common.pscript.callConfirm('AG0010010', 'AG0010010button0', 'ZZ07008', okEvent);
};
expj.AG0010010.AG0010010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010010button0.clear['onClick' + i])) {
        expj.AG0010010.AG0010010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010010button0.clear.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010010button0.clear.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010010button0', 'clear', this, 'Button');
    }
  });
  expj.AG0010010.AG0010010button0.clear.executePScriptOnLoad();
};

expj.AG0010010.AG0010010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AG0010010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0010010-AG0010010button0-clear" name="clear" class="AG0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AG0010010-AG0010010button0-close">
expj.AG0010010.AG0010010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AG0010010.AG0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AG0010010');
};
expj.AG0010010.AG0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AG0010010.AG0010010button0.close['onClick' + i])) {
        expj.AG0010010.AG0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AG0010010.AG0010010button0.close.executeAllOnDecision = function () {
};
expj.AG0010010.AG0010010button0.close.executeOnLoad = function () {
  $('#expj-AG0010010-AG0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AG0010010', 'AG0010010button0', 'close', this, 'Button');
    }
  });
  expj.AG0010010.AG0010010button0.close.executePScriptOnLoad();
};

expj.AG0010010.AG0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute AG0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AG0010010-AG0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AG0010010-AG0010010button0-close" name="close" class="AG0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AG0010010 (END)-->
<%
MessageStruct msgStruct = aAG0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AG0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AG0010010)) {
  expj.common.treeInstanceMap.AG0010010 = {};
}
expj.common.treeInstanceMap.AG0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AG0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AG0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AG0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AG0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AG0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AG0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010)) {
  expj.common.detailDialogMap.AG0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AG0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AG0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AG0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AG0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AG0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AG0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AG0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AG0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AG0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AG0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AG0010010)) {
  expj.common.viewInstanceMap.AG0010010 = {};
}
expj.common.viewInstanceMap.AG0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AG0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AG0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AG0010010.<%=viewId %>.init = function () {
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
    expj.AG0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AG0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AG0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AG0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AG0010010_init">
/**
 * AG0010010用のロード完了時初期化関数
 */
expj.AG0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AG0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AG0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AG0010010');
  expj.common.calendarInstanceMap.AG0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AG0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AG0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AG0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AG0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AG0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AG0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AG0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AG0010010.AG0010010form1.w_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form1.PeekerWPlantCd.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form1.w_PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form1.w_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form1.PeekerWItemCd.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form1.w_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010button1.inventoryDetail.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010button1.select.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_FOR_MRP.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_OUTSIDE_MRP.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_FOR_MRP.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_ITEM_DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_DAY.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_ITEM_STOCK_QTY_LAST_MONTH.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_DAY.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_JOB_ODR_STOCK_QTY_LAST_MONTH.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_DAY.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.w_TOTAL_STOCK_QTY_LAST_MONTH.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form3.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form3.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form3.SPEC.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form3.MRP_ODR_NAME.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010button1.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AA0010010form2.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010form3.executeOnLoad();}catch(e){};
  try{expj.AG0010010.AG0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AG0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AG0010010', 'AG0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AG0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AG0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AG0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AG0010010', '<%=request.getContextPath() %>');
};

/**
 * AG0010010の全体onDecision処理
 */
expj.AG0010010.executeAllOnDecision = function () {
  expj.AG0010010.AG0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AG0010010_console">
expj.AG0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>