<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:34:34 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AE0050\AE0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0050.*" %>
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
<jsp:useBean id="aAE0050010Control" class="com.nec.jp.orteus.metamorBase.AE0050.AE0050010Control" scope="request"/>
<jsp:useBean id="aAE0050010Struct" class="com.nec.jp.orteus.metamorBase.AE0050.AE0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

支給予定一覧出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0050/jsp/AE0050010.jsp,v $
$Author: geng-jia $	
$Revision: 1.16 $ $Date: 2017/02/22 02:05:10 $
********************************************************* --%>
<html>
<head>
<title>支給予定一覧出力</title>
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
<script class="expj-script-AE0050010_init">
  // AE0050010名前空間
  expj.AE0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0050010" data-screen="AE0050010" data-newdata="<%=aAE0050010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AE0050010-AE0050010form1">
expj.AE0050010.AE0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AE0050010.AE0050010form1.onLoad0 = function () {
  console.log('AE0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0050010.AE0050010form1.onDecision0 = function () {
  console.log('AE0050010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0050010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0050010button0/CsvOut,_AE0050010button0/Print"
expj.AE0050010.AE0050010form1.child0 = function () {
  console.log('AE0050010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0050010', 'AE0050010form1', '_AE0050010button0/CsvOut');
expj.common.pscript.setUnMaskToReferenceComponent('AE0050010', 'AE0050010form1', '_AE0050010button0/Print');
};
// script4="child;1;MASK;_AE0050010button0/CsvOut,_AE0050010button0/Print"
expj.AE0050010.AE0050010form1.child1 = function () {
  console.log('AE0050010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0050010', 'AE0050010form1', '_AE0050010button0/CsvOut');
expj.common.pscript.setMaskToReferenceComponent('AE0050010', 'AE0050010form1', '_AE0050010button0/Print');
};
// script5="onDecision;1;CHK;_AE0050010form1/TIME_CTRL[eq]true@*2,*3"
expj.AE0050010.AE0050010form1.onDecision1 = function () {
  console.log('AE0050010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010form1', '_AE0050010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AE0050010form1/SCDL_ISSUE_TIME"
expj.AE0050010.AE0050010form1.child2 = function () {
  console.log('AE0050010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AE0050010', 'AE0050010form1', '_AE0050010form1/SCDL_ISSUE_TIME');
};
// script7="child;3;MASK;_AE0050010form1/SCDL_ISSUE_TIME"
expj.AE0050010.AE0050010form1.child3 = function () {
  console.log('AE0050010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AE0050010', 'AE0050010form1', '_AE0050010form1/SCDL_ISSUE_TIME');
};
expj.AE0050010.AE0050010form1.executeAllOnDecision = function () {
  console.log('execute AE0050010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010form1['onDecision' + i])) {
        expj.AE0050010.AE0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010form1.executeOnLoad = function () {
  expj.AE0050010.AE0050010form1.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0050010.AE0050010form1['onLoad' + i])) {
      expj.AE0050010.AE0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0050010-AE0050010form1" action="AE0050010Servlet" name="AE0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0050010Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:32px;align:left"></div>
<div class="div-td" style="width:160px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:32px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:160px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:32px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:160px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-PLANT_CD">
expj.AE0050010.AE0050010form1.PLANT_CD = {};
expj.AE0050010.AE0050010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/PLANT_CD.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0050010', 'AE0050010form1', 'PLANT_CD', this);
  });
  expj.AE0050010.AE0050010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0050010-AE0050010form1-PLANT_CD" name="PLANT_CD" class="AE0050010-focus-move  required-value expj-AE0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0050010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-PeekerPlantCd">
expj.AE0050010.AE0050010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AE0050010form1/PLANT_CD@<%=contextNo%>"
expj.AE0050010.AE0050010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0050010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010form1', '_PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0050010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0050010.AE0050010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010form1.PeekerPlantCd['onClick' + i])) {
        expj.AE0050010.AE0050010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AE0050010.AE0050010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AE0050010.AE0050010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:32px;text-align:left;"><button type="button" id="expj-AE0050010-AE0050010form1-PeekerPlantCd" class="AE0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:160px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CONS_TYP",rb)%></span><!-- 支給区分 --></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-r1_CONS_TYP">
expj.AE0050010.AE0050010form1.r1_CONS_TYP = {};
expj.AE0050010.AE0050010form1.r1_CONS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/r1_CONS_TYP.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.r1_CONS_TYP.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-r1_CONS_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010form1', 'r1_CONS_TYP', this, 'RadioButton');
    }
  });
  expj.AE0050010.AE0050010form1.r1_CONS_TYP.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.r1_CONS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/r1_CONS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-r1_CONS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="CONS_TYP" data-name="r1_CONS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0050010Struct.getr1_CONS_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-AE0050010-AE0050010form1-r1_CONS_TYP" ><label for="expj-AE0050010-AE0050010form1-r1_CONS_TYP"><%=CoreTools.getRBString("Expj.Cmt0228",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0050010-AE0050010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0050010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AE0050010-AE0050010form1-TIME_CTRL">
expj.AE0050010.AE0050010form1.TIME_CTRL = {};
expj.AE0050010.AE0050010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/TIME_CTRL.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0050010', 'AE0050010form1', 'TIME_CTRL', this);
  });
  expj.AE0050010.AE0050010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SCDL_ISSUE_DATE",rb)%></span><!-- 出庫予定日 --></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-SCDL_ISSUE_DATE">
expj.AE0050010.AE0050010form1.SCDL_ISSUE_DATE = {};
expj.AE0050010.AE0050010form1.SCDL_ISSUE_DATE.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/SCDL_ISSUE_DATE.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.SCDL_ISSUE_DATE.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-SCDL_ISSUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0050010', 'AE0050010form1', 'SCDL_ISSUE_DATE', this);
  });
  expj.AE0050010.AE0050010form1.SCDL_ISSUE_DATE.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.SCDL_ISSUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/SCDL_ISSUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-SCDL_ISSUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0050010-AE0050010form1-SCDL_ISSUE_DATE" name="SCDL_ISSUE_DATE" class="AE0050010-focus-move  required-value expj-AE0050010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0050010Struct.getSCDL_ISSUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-CalendarScdlIssueDate">
expj.AE0050010.AE0050010form1.CalendarScdlIssueDate = {};
// script1="onClick;0;CALENDAR;_AE0050010form1/SCDL_ISSUE_DATE"
expj.AE0050010.AE0050010form1.CalendarScdlIssueDate.onClick0 = function () {
  console.log('CalendarScdlIssueDate script1');
expj.common.pscript.executeCalendar('AE0050010','AE0050010form1','_AE0050010form1/SCDL_ISSUE_DATE');
};
expj.AE0050010.AE0050010form1.CalendarScdlIssueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010form1.CalendarScdlIssueDate['onClick' + i])) {
        expj.AE0050010.AE0050010form1.CalendarScdlIssueDate['onClick' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010form1.CalendarScdlIssueDate.executeAllOnDecision = function () {
};
expj.AE0050010.AE0050010form1.CalendarScdlIssueDate.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-CalendarScdlIssueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010form1', 'CalendarScdlIssueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0050010','AE0050010form1','_AE0050010form1/SCDL_ISSUE_DATE');
  expj.AE0050010.AE0050010form1.CalendarScdlIssueDate.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.CalendarScdlIssueDate.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/CalendarScdlIssueDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-CalendarScdlIssueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0050010-AE0050010form1-CalendarScdlIssueDate" class="AE0050010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-SCDL_ISSUE_TIME">
expj.AE0050010.AE0050010form1.SCDL_ISSUE_TIME = {};
expj.AE0050010.AE0050010form1.SCDL_ISSUE_TIME.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/SCDL_ISSUE_TIME.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.SCDL_ISSUE_TIME.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-SCDL_ISSUE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0050010', 'AE0050010form1', 'SCDL_ISSUE_TIME', this);
  });
  expj.AE0050010.AE0050010form1.SCDL_ISSUE_TIME.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.SCDL_ISSUE_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/SCDL_ISSUE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-SCDL_ISSUE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0050010-AE0050010form1-SCDL_ISSUE_TIME" name="SCDL_ISSUE_TIME" class="AE0050010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0050010Struct.getSCDL_ISSUE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:32px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span><!-- まで --></div><!--/td-->
<div class="div-td" style="width:160px;text-align:right;"></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-r2_CONS_TYP">
expj.AE0050010.AE0050010form1.r2_CONS_TYP = {};
expj.AE0050010.AE0050010form1.r2_CONS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/r2_CONS_TYP.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.r2_CONS_TYP.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-r2_CONS_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010form1', 'r2_CONS_TYP', this, 'RadioButton');
    }
  });
  expj.AE0050010.AE0050010form1.r2_CONS_TYP.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.r2_CONS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/r2_CONS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-r2_CONS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="CONS_TYP" data-name="r2_CONS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0050010Struct.getr2_CONS_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-AE0050010-AE0050010form1-r2_CONS_TYP" ><label for="expj-AE0050010-AE0050010form1-r2_CONS_TYP"><%=CoreTools.getRBString("Expj.Cmt0229",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-VEND_CD">
expj.AE0050010.AE0050010form1.VEND_CD = {};
expj.AE0050010.AE0050010form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/VEND_CD.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0050010', 'AE0050010form1', 'VEND_CD', this);
  });
  expj.AE0050010.AE0050010form1.VEND_CD.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0050010-AE0050010form1-VEND_CD" name="VEND_CD" class="AE0050010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0050010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-PeekerVendCd">
expj.AE0050010.AE0050010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AE0050010form1/VEND_CD@<%=contextNo%>"
expj.AE0050010.AE0050010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0050010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010form1', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0050010form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0050010.AE0050010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010form1.PeekerVendCd['onClick' + i])) {
        expj.AE0050010.AE0050010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AE0050010.AE0050010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AE0050010.AE0050010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:32px;text-align:left;"><button type="button" id="expj-AE0050010-AE0050010form1-PeekerVendCd" class="AE0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:160px;text-align:right;"></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010form1-r3_CONS_TYP">
expj.AE0050010.AE0050010form1.r3_CONS_TYP = {};
expj.AE0050010.AE0050010form1.r3_CONS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/r3_CONS_TYP.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.r3_CONS_TYP.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-r3_CONS_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010form1', 'r3_CONS_TYP', this, 'RadioButton');
    }
  });
  expj.AE0050010.AE0050010form1.r3_CONS_TYP.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.r3_CONS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/r3_CONS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-r3_CONS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="CONS_TYP" data-name="r3_CONS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAE0050010Struct.getr3_CONS_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-AE0050010-AE0050010form1-r3_CONS_TYP" ><label for="expj-AE0050010-AE0050010form1-r3_CONS_TYP"><%=CoreTools.getRBString("Expj.Cmt0045",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0050010-AE0050010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0050010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AE0050010-AE0050010form1-DOWNLOAD_FILE">
expj.AE0050010.AE0050010form1.DOWNLOAD_FILE = {};
expj.AE0050010.AE0050010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AE0050010form1/DOWNLOAD_FILE.onDecision');
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
  expj.AE0050010.executeAllOnDecision();
};
expj.AE0050010.AE0050010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0050010', 'AE0050010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AE0050010.AE0050010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AE0050010.AE0050010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AE0050010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 410px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0050010 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AE0050010-AE0050010button0">
expj.AE0050010.AE0050010button0 = {};
expj.AE0050010.AE0050010button0.executeAllOnDecision = function () {
  console.log('execute AE0050010button0.onDecision');
};
expj.AE0050010.AE0050010button0.executeOnLoad = function () {
  expj.AE0050010.AE0050010button0.executePScriptOnLoad();
};

expj.AE0050010.AE0050010button0.executePScriptOnLoad = function () {
  console.log('execute AE0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0050010-AE0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0050010-AE0050010button0-Print">
expj.AE0050010.AE0050010button0.Print = {};
// script1="onClick;0;CHK;_AE0050010form1/TIME_CTRL[eq]true@*0"
expj.AE0050010.AE0050010button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010button0', '_AE0050010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]1[or]~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]2@#AS00110"
expj.AE0050010.AE0050010button0.Print.child0 = function () {
  console.log('Print script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0050010', 'AE0050010button0', 'AS00110');
}
};
// script3="onClick;1;CHK;_AE0050010form1/TIME_CTRL[eq]true[and]~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]3@*1"
expj.AE0050010.AE0050010button0.Print.onClick1 = function () {
  console.log('Print script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010button0', '_AE0050010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;[{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:1)}*10+{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:2)}][gte]60@#AS00111"
expj.AE0050010.AE0050010button0.Print.child1 = function () {
  console.log('Print script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0050010', 'AE0050010button0', 'AS00111');
}
};
// script5="onClick;2;CHK;_AE0050010form1/TIME_CTRL[eq]true[and]~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]4@*2"
expj.AE0050010.AE0050010button0.Print.onClick2 = function () {
  console.log('Print script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010button0', '_AE0050010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;CHK;[{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:0)}*10+{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:1)}][gte]24[or][{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:2)}*10+{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:3)}][gte]60@#AS00111"
expj.AE0050010.AE0050010button0.Print.child2 = function () {
  console.log('Print script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0050010', 'AE0050010button0', 'AS00111');
}
};
// script7="onClick;3;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AE0050010form1/*@AE0050010Servlet:H,H,H"
expj.AE0050010.AE0050010button0.Print.onClick3 = function () {
  console.log('Print script7');
expj.common.pscript.viewPrinterDialog('AE0050010', 'AE0050010button0', '_AE0050010form1/*', 'AE0050010Servlet', 'H,H,H');
};
expj.AE0050010.AE0050010button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010button0.Print['onClick' + i])) {
        expj.AE0050010.AE0050010button0.Print['onClick' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010button0.Print.executeAllOnDecision = function () {
};
expj.AE0050010.AE0050010button0.Print.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010button0', 'Print', this, 'Button');
    }
  });
  expj.AE0050010.AE0050010button0.Print.executePScriptOnLoad();
};

expj.AE0050010.AE0050010button0.Print.executePScriptOnLoad = function () {
  console.log('execute AE0050010button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0050010-AE0050010button0-Print" name="Print" class="AE0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010button0-CsvOut">
expj.AE0050010.AE0050010button0.CsvOut = {};
// script1="onClick;0;CHK;_AE0050010form1/TIME_CTRL[eq]true@*0"
expj.AE0050010.AE0050010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010button0', '_AE0050010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]1[or]~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]2@#AS00110"
expj.AE0050010.AE0050010button0.CsvOut.child0 = function () {
  console.log('CsvOut script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0050010', 'AE0050010button0', 'AS00110');
}
};
// script3="onClick;1;CHK;_AE0050010form1/TIME_CTRL[eq]true[and]~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]3@*1"
expj.AE0050010.AE0050010button0.CsvOut.onClick1 = function () {
  console.log('CsvOut script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010button0', '_AE0050010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;CHK;[{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:1)}*10+{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:2)}][gte]60@#AS00111"
expj.AE0050010.AE0050010button0.CsvOut.child1 = function () {
  console.log('CsvOut script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0050010', 'AE0050010button0', 'AS00111');
}
};
// script5="onClick;2;CHK;_AE0050010form1/TIME_CTRL[eq]true[and]~LEN(_AE0050010form1/SCDL_ISSUE_TIME)[eq]4@*2"
expj.AE0050010.AE0050010button0.CsvOut.onClick2 = function () {
  console.log('CsvOut script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0050010', 'AE0050010button0', '_AE0050010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;CHK;[{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:0)}*10+{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:1)}][gte]24[or][{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:2)}*10+{~CHARAT(_AE0050010form1/SCDL_ISSUE_TIME:3)}][gte]60@#AS00111"
expj.AE0050010.AE0050010button0.CsvOut.child2 = function () {
  console.log('CsvOut script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0050010', 'AE0050010button0', '_AE0050010form1/SCDL_ISSUE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0050010', 'AE0050010button0', 'AS00111');
}
};
// script7="onClick;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0050010form1/*@AE0050010Servlet,,$ZZ07011"
expj.AE0050010.AE0050010button0.CsvOut.onClick3 = function () {
  console.log('CsvOut script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0050010', 'AE0050010button0', '_AE0050010form1/*', 'AE0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0050010', response);
expj.common.updateBusinessScreenTab('AE0050010', contents);
};
expj.common.pscript.callConfirm('AE0050010', 'AE0050010button0', 'ZZ07011', okEvent);
};
expj.AE0050010.AE0050010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010button0.CsvOut['onClick' + i])) {
        expj.AE0050010.AE0050010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AE0050010.AE0050010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AE0050010.AE0050010button0.CsvOut.executePScriptOnLoad();
};

expj.AE0050010.AE0050010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AE0050010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0050010-AE0050010button0-CsvOut" name="CsvOut" class="AE0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010button0-Clear">
expj.AE0050010.AE0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0050010Servlet,,$ZZ07008"
expj.AE0050010.AE0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0050010', 'AE0050010button0', '', 'AE0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0050010', response);
expj.common.updateBusinessScreenTab('AE0050010', contents);
};
expj.common.pscript.callConfirm('AE0050010', 'AE0050010button0', 'ZZ07008', okEvent);
};
expj.AE0050010.AE0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010button0.Clear['onClick' + i])) {
        expj.AE0050010.AE0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0050010.AE0050010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0050010.AE0050010button0.Clear.executePScriptOnLoad();
};

expj.AE0050010.AE0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0050010-AE0050010button0-Clear" name="Clear" class="AE0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0050010-AE0050010button0-Close">
expj.AE0050010.AE0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0050010.AE0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0050010');
};
expj.AE0050010.AE0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0050010.AE0050010button0.Close['onClick' + i])) {
        expj.AE0050010.AE0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0050010.AE0050010button0.Close.executeAllOnDecision = function () {
};
expj.AE0050010.AE0050010button0.Close.executeOnLoad = function () {
  $('#expj-AE0050010-AE0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0050010', 'AE0050010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0050010.AE0050010button0.Close.executePScriptOnLoad();
};

expj.AE0050010.AE0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0050010-AE0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0050010-AE0050010button0-Close" name="Close" class="AE0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0050010 (END)-->
<%
MessageStruct msgStruct = aAE0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0050010)) {
  expj.common.treeInstanceMap.AE0050010 = {};
}
expj.common.treeInstanceMap.AE0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0050010)) {
  expj.common.detailDialogMap.AE0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0050010)) {
  expj.common.viewInstanceMap.AE0050010 = {};
}
expj.common.viewInstanceMap.AE0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0050010.<%=viewId %>.init = function () {
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
    expj.AE0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0050010_init">
/**
 * AE0050010用のロード完了時初期化関数
 */
expj.AE0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0050010');
  expj.common.calendarInstanceMap.AE0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0050010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0050010.AE0050010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.r1_CONS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.SCDL_ISSUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.CalendarScdlIssueDate.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.SCDL_ISSUE_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.r2_CONS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.r3_CONS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010button0.Print.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010form1.executeOnLoad();}catch(e){};
  try{expj.AE0050010.AE0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0050010', 'AE0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0050010', '<%=request.getContextPath() %>');
};

/**
 * AE0050010の全体onDecision処理
 */
expj.AE0050010.executeAllOnDecision = function () {
  expj.AE0050010.AE0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0050010_console">
expj.AE0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>