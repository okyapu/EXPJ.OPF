<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:27:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0070\AC0070010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0070.*" %>
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
<jsp:useBean id="aAC0070010Control" class="com.nec.jp.orteus.metamorBase.AC0070.AC0070010Control" scope="request"/>
<jsp:useBean id="aAC0070010Struct" class="com.nec.jp.orteus.metamorBase.AC0070.AC0070010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

外部オーダ参照
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0070/jsp/AC0070010.jsp,v $
$Author: geng-jia $	
$Revision: 1.10 $ $Date: 2017/02/22 02:04:27 $
********************************************************* --%>
<html>
<head>
<title>外部オーダ参照</title>
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
<script class="expj-script-AC0070010_init">
  // AC0070010名前空間
  expj.AC0070010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0070010" data-screen="AC0070010" data-newdata="<%=aAC0070010Control.isNewData() %>">
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
              <script class="expj-script-AC0070010-AC0070010form1">
expj.AC0070010.AC0070010form1 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AC0070010.AC0070010form1.onLoad0 = function () {
  console.log('AC0070010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AC0070010.AC0070010form1.onDecision0 = function () {
  console.log('AC0070010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AC0070010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AC0070010button1/select"
expj.AC0070010.AC0070010form1.child0 = function () {
  console.log('AC0070010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AC0070010', 'AC0070010form1', '_AC0070010button1/select');
};
// script4="child;1;MASK;_AC0070010button1/select"
expj.AC0070010.AC0070010form1.child1 = function () {
  console.log('AC0070010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AC0070010', 'AC0070010form1', '_AC0070010button1/select');
};
expj.AC0070010.AC0070010form1.executeAllOnDecision = function () {
  console.log('execute AC0070010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0070010.AC0070010form1['onDecision' + i])) {
        expj.AC0070010.AC0070010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0070010.AC0070010form1.executeOnLoad = function () {
  expj.AC0070010.AC0070010form1.executePScriptOnLoad();
};

expj.AC0070010.AC0070010form1.executePScriptOnLoad = function () {
  console.log('execute AC0070010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0070010.AC0070010form1['onLoad' + i])) {
      expj.AC0070010.AC0070010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0070010-AC0070010form1" action="AC0070010Servlet" name="AC0070010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0070010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt0434",rb)%></span><!-- 外部計画番号 --></div><!--/td-->
<script class="expj-script-AC0070010-AC0070010form1-w_PLAN_CD">
expj.AC0070010.AC0070010form1.w_PLAN_CD = {};
expj.AC0070010.AC0070010form1.w_PLAN_CD.executeAllOnDecision = function () {
  console.log('execute AC0070010form1/w_PLAN_CD.onDecision');
  expj.AC0070010.AC0070010form1.executeAllOnDecision();
  expj.AC0070010.executeAllOnDecision();
};
expj.AC0070010.AC0070010form1.w_PLAN_CD.executeOnLoad = function () {
  $('#expj-AC0070010-AC0070010form1-w_PLAN_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0070010', 'AC0070010form1', 'w_PLAN_CD', this);
  });
  expj.AC0070010.AC0070010form1.w_PLAN_CD.executePScriptOnLoad();
};

expj.AC0070010.AC0070010form1.w_PLAN_CD.executePScriptOnLoad = function () {
  console.log('execute AC0070010form1/w_PLAN_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0070010-AC0070010form1-w_PLAN_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0070010-AC0070010form1-w_PLAN_CD" name="w_PLAN_CD" class="AC0070010-focus-move  required-value expj-AC0070010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0070010Struct.getw_PLAN_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0070010-AC0070010form1-PeekerPlantCd">
expj.AC0070010.AC0070010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AC0070010form1/w_PLAN_CD@<%=contextNo%>"
expj.AC0070010.AC0070010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0070010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0070010', 'AC0070010form1', '_AC0070010form1/w_PLAN_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%EXTERNAL_PLAN_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0070010form1/w_PLAN_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0070010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0070010.AC0070010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0070010.AC0070010form1.PeekerPlantCd['onClick' + i])) {
        expj.AC0070010.AC0070010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AC0070010.AC0070010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AC0070010.AC0070010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AC0070010-AC0070010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0070010', 'AC0070010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AC0070010.AC0070010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AC0070010.AC0070010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AC0070010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0070010-AC0070010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0070010-AC0070010form1-PeekerPlantCd" class="AC0070010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0070010-AC0070010button1">
expj.AC0070010.AC0070010button1 = {};
expj.AC0070010.AC0070010button1.executeAllOnDecision = function () {
  console.log('execute AC0070010button1.onDecision');
};
expj.AC0070010.AC0070010button1.executeOnLoad = function () {
  expj.AC0070010.AC0070010button1.executePScriptOnLoad();
};

expj.AC0070010.AC0070010button1.executePScriptOnLoad = function () {
  console.log('execute AC0070010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0070010-AC0070010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0070010-AC0070010button1-select">
expj.AC0070010.AC0070010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0070010form1/*@AC0070010Servlet"
expj.AC0070010.AC0070010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0070010', 'AC0070010button1', '_AC0070010form1/*', 'AC0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0070010', response);
expj.common.updateBusinessScreenTab('AC0070010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0070010.AC0070010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0070010.AC0070010button1.select['onClick' + i])) {
        expj.AC0070010.AC0070010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AC0070010.AC0070010button1.select.executeAllOnDecision = function () {
};
expj.AC0070010.AC0070010button1.select.executeOnLoad = function () {
  $('#expj-AC0070010-AC0070010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0070010', 'AC0070010button1', 'select', this, 'Button');
    }
  });
  expj.AC0070010.AC0070010button1.select.executePScriptOnLoad();
};

expj.AC0070010.AC0070010button1.select.executePScriptOnLoad = function () {
  console.log('execute AC0070010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AC0070010-AC0070010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0070010-AC0070010button1-select" name="select" class="AC0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AC0070010-AC0070010view1">
expj.AC0070010.AC0070010view1 = {};
expj.AC0070010.AC0070010view1.executeAllOnClick = function () {
};
expj.AC0070010.AC0070010view1.executeAllOnDecision = function () {
  console.log('execute AC0070010view1.onDecision');
};
expj.AC0070010.AC0070010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0070010view1", "expj.AC0070010.AC0070010view1.executeAllOnClick");
%>
  expj.AC0070010.AC0070010view1.executePScriptOnLoad();
};

expj.AC0070010.AC0070010view1.executePScriptOnLoad = function () {
  console.log('execute AC0070010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0070010-AC0070010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0070010view1_Id = "AC0070010view1";
 String AC0070010view1_select = "single";
 String AC0070010view1_sortable = "true";
 String AC0070010view1_resize = "true";
 String AC0070010view1_scroll = "true";
 StringBuffer AC0070010view1_HB = new StringBuffer();
 StringBuffer AC0070010view1_DB = new StringBuffer();
%>
<%
 AC0070010view1_select = "multi";
 AC0070010view1_sortable = "false";
 AC0070010view1_resize = "true";
 AC0070010view1_scroll = "true";
%>
<%
 AC0070010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
%>
     
<%
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0019",rb))).append("', 'name':'EXTERNAL_LEVEL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_PLANT_CD",rb))).append("', 'name':'PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_NAME",rb))).append("', 'name':'PLANT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_START_DATE",rb))).append("', 'name':'ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_START_DATE",rb))).append("', 'name':'PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY",rb))).append("', 'name':'ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_STS_TYP",rb))).append("', 'name':'ODR_STS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'EXTERNAL_PLAN_DEL_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0444",rb))).append("', 'name':'EXTERNAL_PLAN_DEL_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DRAW_CD",rb))).append("', 'name':'DRAW_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_SPEC",rb))).append("', 'name':'SPEC', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb))).append("', 'name':'UNIT_QTY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'MRP_ODR_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
AC0070010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'OUTSIDE_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0070010view1_sortable).append("}").append(",");
%>
<%
 int aAC0070010StructLength = aAC0070010Control.getListsize();
 final AC0070010Struct structBackup = aAC0070010Struct;
 aAC0070010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0070010StructLength; ++loopCount) {
  if((aAC0070010Struct = (AC0070010Struct) aAC0070010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0070010Struct", aAC0070010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0070010view1_DB.append("[");
 AC0070010view1_DB.append(loopCount);
 AC0070010view1_DB.append(",''");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-EXTERNAL_LEVEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-EXTERNAL_LEVEL_NO\" data-name=\"EXTERNAL_LEVEL_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;4\">").append(TypeConverter.sanitizer(aAC0070010Struct.getEXTERNAL_LEVEL_NO())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-PLANT_CD\" data-name=\"PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getPLANT_CD())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-PLANT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-PLANT_NAME\" data-name=\"PLANT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getPLANT_NAME())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getITEM_CD())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getITEM_NAME())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-ODR_START_DATE\" data-name=\"ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getODR_START_DATE())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-PRD_START_DATE\" data-name=\"PRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getPRD_START_DATE())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-PRD_DUE_DATE\" data-name=\"PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getPRD_DUE_DATE())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-ODR_QTY\" data-name=\"ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0070010Struct.getODR_QTY())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-ODR_STS_TYP\" data-name=\"ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getODR_STS_TYP())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-ODR_STS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-ODR_STS_NAME\" data-name=\"ODR_STS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getODR_STS_NAME())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-EXTERNAL_PLAN_DEL_FLG-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-EXTERNAL_PLAN_DEL_FLG\" data-name=\"EXTERNAL_PLAN_DEL_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getEXTERNAL_PLAN_DEL_FLG())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-EXTERNAL_PLAN_DEL_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-EXTERNAL_PLAN_DEL_NAME\" data-name=\"EXTERNAL_PLAN_DEL_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getEXTERNAL_PLAN_DEL_NAME())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-DRAW_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-DRAW_CD\" data-name=\"DRAW_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getDRAW_CD())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-SPEC-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-SPEC\" data-name=\"SPEC\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getSPEC())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-UNIT_QTY_TYP\" data-name=\"UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getUNIT_QTY_TYP())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-UNIT_QTY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-UNIT_QTY_NAME\" data-name=\"UNIT_QTY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getUNIT_QTY_NAME())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-MRP_ODR_TYP\" data-name=\"MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getMRP_ODR_TYP())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-MRP_ODR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-MRP_ODR_NAME\" data-name=\"MRP_ODR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getMRP_ODR_NAME())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-OUTSIDE_TYP\" data-name=\"OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getOUTSIDE_TYP())).append("</span>'");
 AC0070010view1_DB.append(",").append("'<span id=\"expj-AC0070010-AC0070010view1-OUTSIDE_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0070010-AC0070010view1-OUTSIDE_NAME\" data-name=\"OUTSIDE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0070010Struct.getOUTSIDE_NAME())).append("</span>'");
 AC0070010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0070010StructLength) {
   AC0070010view1_DB.append(",");
  }
 }
 aAC0070010Struct = structBackup;
 viewIdList.add(AC0070010view1_Id);
 viewSelectList.add(AC0070010view1_select);
 viewResizeList.add(AC0070010view1_resize);
 viewScrollList.add(AC0070010view1_scroll);
 viewHeaderDataList.add(AC0070010view1_HB);
 viewBodyDataList.add(AC0070010view1_DB);
%>
<%
}
%>
</div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0070010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0070010-AC0070010button0">
expj.AC0070010.AC0070010button0 = {};
expj.AC0070010.AC0070010button0.executeAllOnDecision = function () {
  console.log('execute AC0070010button0.onDecision');
};
expj.AC0070010.AC0070010button0.executeOnLoad = function () {
  expj.AC0070010.AC0070010button0.executePScriptOnLoad();
};

expj.AC0070010.AC0070010button0.executePScriptOnLoad = function () {
  console.log('execute AC0070010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0070010-AC0070010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0070010-AC0070010button0-clear">
expj.AC0070010.AC0070010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0070010Servlet,,$ZZ07008"
expj.AC0070010.AC0070010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0070010', 'AC0070010button0', '', 'AC0070010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0070010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0070010', response);
expj.common.updateBusinessScreenTab('AC0070010', contents);
};
expj.common.pscript.callConfirm('AC0070010', 'AC0070010button0', 'ZZ07008', okEvent);
};
expj.AC0070010.AC0070010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0070010.AC0070010button0.clear['onClick' + i])) {
        expj.AC0070010.AC0070010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AC0070010.AC0070010button0.clear.executeAllOnDecision = function () {
};
expj.AC0070010.AC0070010button0.clear.executeOnLoad = function () {
  $('#expj-AC0070010-AC0070010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0070010', 'AC0070010button0', 'clear', this, 'Button');
    }
  });
  expj.AC0070010.AC0070010button0.clear.executePScriptOnLoad();
};

expj.AC0070010.AC0070010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AC0070010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0070010-AC0070010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0070010-AC0070010button0-clear" name="clear" class="AC0070010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0070010-AC0070010button0-close">
expj.AC0070010.AC0070010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AC0070010.AC0070010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AC0070010');
};
expj.AC0070010.AC0070010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0070010.AC0070010button0.close['onClick' + i])) {
        expj.AC0070010.AC0070010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AC0070010.AC0070010button0.close.executeAllOnDecision = function () {
};
expj.AC0070010.AC0070010button0.close.executeOnLoad = function () {
  $('#expj-AC0070010-AC0070010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0070010', 'AC0070010button0', 'close', this, 'Button');
    }
  });
  expj.AC0070010.AC0070010button0.close.executePScriptOnLoad();
};

expj.AC0070010.AC0070010button0.close.executePScriptOnLoad = function () {
  console.log('execute AC0070010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AC0070010-AC0070010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0070010-AC0070010button0-close" name="close" class="AC0070010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0070010 (END)-->
<%
MessageStruct msgStruct = aAC0070010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0070010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0070010)) {
  expj.common.treeInstanceMap.AC0070010 = {};
}
expj.common.treeInstanceMap.AC0070010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0070010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0070010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0070010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0070010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0070010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0070010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0070010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0070010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0070010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0070010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0070010)) {
  expj.common.detailDialogMap.AC0070010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0070010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0070010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0070010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0070010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0070010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0070010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0070010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0070010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0070010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0070010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0070010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0070010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0070010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0070010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0070010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0070010)) {
  expj.common.viewInstanceMap.AC0070010 = {};
}
expj.common.viewInstanceMap.AC0070010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0070010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0070010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0070010.<%=viewId %>.init = function () {
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
    expj.AC0070010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0070010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0070010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0070010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0070010_init">
/**
 * AC0070010用のロード完了時初期化関数
 */
expj.AC0070010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0070010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0070010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0070010');
  expj.common.calendarInstanceMap.AC0070010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0070010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0070010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0070010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0070010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0070010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0070010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0070010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0070010.AC0070010form1.w_PLAN_CD.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010button1.select.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010button0.close.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010form1.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010button1.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010view1.executeOnLoad();}catch(e){};
  try{expj.AC0070010.AC0070010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0070010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0070010', 'AC0070010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0070010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0070010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0070010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0070010', '<%=request.getContextPath() %>');
};

/**
 * AC0070010の全体onDecision処理
 */
expj.AC0070010.executeAllOnDecision = function () {
  expj.AC0070010.AC0070010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0070010_console">
expj.AC0070010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>