<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:31:59 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0080\AD0080020.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0080.*" %>
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
<jsp:useBean id="aAD0080020Control" class="com.nec.jp.orteus.metamorBase.AD0080.AD0080020Control" scope="request"/>
<jsp:useBean id="aAD0080020Struct" class="com.nec.jp.orteus.metamorBase.AD0080.AD0080020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業実績取込バッチ処理
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/jsp/AD0080020.jsp,v $
$Author: geng-jia $	
$Revision: 1.11 $　$Date: 2017/02/22 02:04:55 $
********************************************************* --%>
<html>
<head>
<title>作業実績取込バッチ処理</title>
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
<script class="expj-script-AD0080020_init">
  // AD0080020名前空間
  expj.AD0080020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AD0080020" data-screen="AD0080020" data-newdata="<%=aAD0080020Control.isNewData() %>">
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
              <script class="expj-script-AD0080020-AD0080020form1">
expj.AD0080020.AD0080020form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AD0080020.AD0080020form1.onLoad0 = function () {
  console.log('AD0080020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AD0080020form1/*[eq]ERROR@*1"
expj.AD0080020.AD0080020form1.child0 = function () {
  console.log('AD0080020form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0080020', 'AD0080020form1', '?AD0080020form1/*'), '[eq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;MASK;_AD0080020button0/Clear,_AD0080020button1/Execute"
expj.AD0080020.AD0080020form1.child1 = function () {
  console.log('AD0080020form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AD0080020', 'AD0080020form1', '_AD0080020button0/Clear');
expj.common.pscript.setMaskToReferenceComponent('AD0080020', 'AD0080020form1', '_AD0080020button1/Execute');
};
expj.AD0080020.AD0080020form1.executeAllOnDecision = function () {
  console.log('execute AD0080020form1.onDecision');
};
expj.AD0080020.AD0080020form1.executeOnLoad = function () {
  expj.AD0080020.AD0080020form1.executePScriptOnLoad();
};

expj.AD0080020.AD0080020form1.executePScriptOnLoad = function () {
  console.log('execute AD0080020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0080020.AD0080020form1['onLoad' + i])) {
      expj.AD0080020.AD0080020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0080020-AD0080020form1" action="AD0080020Servlet" name="AD0080020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0080020Control.getReadStatusString()) %>" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:center"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:20px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt5060",rb)%></span><!-- 取込期間 --></div><!--/td-->
<script class="expj-script-AD0080020-AD0080020form1-INTAKE_TERM_FROM">
expj.AD0080020.AD0080020form1.INTAKE_TERM_FROM = {};
expj.AD0080020.AD0080020form1.INTAKE_TERM_FROM.executeAllOnDecision = function () {
  console.log('execute AD0080020form1/INTAKE_TERM_FROM.onDecision');
  expj.AD0080020.AD0080020form1.executeAllOnDecision();
  expj.AD0080020.executeAllOnDecision();
};
expj.AD0080020.AD0080020form1.INTAKE_TERM_FROM.executeOnLoad = function () {
  $('#expj-AD0080020-AD0080020form1-INTAKE_TERM_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0080020', 'AD0080020form1', 'INTAKE_TERM_FROM', this);
  });
  expj.AD0080020.AD0080020form1.INTAKE_TERM_FROM.executePScriptOnLoad();
};

expj.AD0080020.AD0080020form1.INTAKE_TERM_FROM.executePScriptOnLoad = function () {
  console.log('execute AD0080020form1/INTAKE_TERM_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AD0080020-AD0080020form1-INTAKE_TERM_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0080020-AD0080020form1-INTAKE_TERM_FROM" name="INTAKE_TERM_FROM" class="AD0080020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0080020Struct.getINTAKE_TERM_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0080020-AD0080020form1-CalendarIntakeTermFrom">
expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom = {};
// script1="onClick;0;CALENDAR;_AD0080020form1/INTAKE_TERM_FROM"
expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom.onClick0 = function () {
  console.log('CalendarIntakeTermFrom script1');
expj.common.pscript.executeCalendar('AD0080020','AD0080020form1','_AD0080020form1/INTAKE_TERM_FROM');
};
expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom['onClick' + i])) {
        expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom['onClick' + i]();
      }
    }
  }
};
expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom.executeAllOnDecision = function () {
};
expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom.executeOnLoad = function () {
  $('#expj-AD0080020-AD0080020form1-CalendarIntakeTermFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0080020', 'AD0080020form1', 'CalendarIntakeTermFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0080020','AD0080020form1','_AD0080020form1/INTAKE_TERM_FROM');
  expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom.executePScriptOnLoad();
};

expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom.executePScriptOnLoad = function () {
  console.log('execute AD0080020form1/CalendarIntakeTermFrom.onLoad');
  var targetComponent = document.getElementById('expj-AD0080020-AD0080020form1-CalendarIntakeTermFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0080020-AD0080020form1-CalendarIntakeTermFrom" class="AD0080020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0080020-AD0080020form1-INTAKE_TERM_TO">
expj.AD0080020.AD0080020form1.INTAKE_TERM_TO = {};
expj.AD0080020.AD0080020form1.INTAKE_TERM_TO.executeAllOnDecision = function () {
  console.log('execute AD0080020form1/INTAKE_TERM_TO.onDecision');
  expj.AD0080020.AD0080020form1.executeAllOnDecision();
  expj.AD0080020.executeAllOnDecision();
};
expj.AD0080020.AD0080020form1.INTAKE_TERM_TO.executeOnLoad = function () {
  $('#expj-AD0080020-AD0080020form1-INTAKE_TERM_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0080020', 'AD0080020form1', 'INTAKE_TERM_TO', this);
  });
  expj.AD0080020.AD0080020form1.INTAKE_TERM_TO.executePScriptOnLoad();
};

expj.AD0080020.AD0080020form1.INTAKE_TERM_TO.executePScriptOnLoad = function () {
  console.log('execute AD0080020form1/INTAKE_TERM_TO.onLoad');
  var targetComponent = document.getElementById('expj-AD0080020-AD0080020form1-INTAKE_TERM_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0080020-AD0080020form1-INTAKE_TERM_TO" name="INTAKE_TERM_TO" class="AD0080020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0080020Struct.getINTAKE_TERM_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0080020-AD0080020form1-CalendarIntakeTermTo">
expj.AD0080020.AD0080020form1.CalendarIntakeTermTo = {};
// script1="onClick;0;CALENDAR;_AD0080020form1/INTAKE_TERM_TO"
expj.AD0080020.AD0080020form1.CalendarIntakeTermTo.onClick0 = function () {
  console.log('CalendarIntakeTermTo script1');
expj.common.pscript.executeCalendar('AD0080020','AD0080020form1','_AD0080020form1/INTAKE_TERM_TO');
};
expj.AD0080020.AD0080020form1.CalendarIntakeTermTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0080020.AD0080020form1.CalendarIntakeTermTo['onClick' + i])) {
        expj.AD0080020.AD0080020form1.CalendarIntakeTermTo['onClick' + i]();
      }
    }
  }
};
expj.AD0080020.AD0080020form1.CalendarIntakeTermTo.executeAllOnDecision = function () {
};
expj.AD0080020.AD0080020form1.CalendarIntakeTermTo.executeOnLoad = function () {
  $('#expj-AD0080020-AD0080020form1-CalendarIntakeTermTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0080020', 'AD0080020form1', 'CalendarIntakeTermTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0080020','AD0080020form1','_AD0080020form1/INTAKE_TERM_TO');
  expj.AD0080020.AD0080020form1.CalendarIntakeTermTo.executePScriptOnLoad();
};

expj.AD0080020.AD0080020form1.CalendarIntakeTermTo.executePScriptOnLoad = function () {
  console.log('execute AD0080020form1/CalendarIntakeTermTo.onLoad');
  var targetComponent = document.getElementById('expj-AD0080020-AD0080020form1-CalendarIntakeTermTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AD0080020-AD0080020form1-CalendarIntakeTermTo" class="AD0080020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0080020-AD0080020button1">
expj.AD0080020.AD0080020button1 = {};
expj.AD0080020.AD0080020button1.executeAllOnDecision = function () {
  console.log('execute AD0080020button1.onDecision');
};
expj.AD0080020.AD0080020button1.executeOnLoad = function () {
  expj.AD0080020.AD0080020button1.executePScriptOnLoad();
};

expj.AD0080020.AD0080020button1.executePScriptOnLoad = function () {
  console.log('execute AD0080020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0080020-AD0080020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0080020-AD0080020button1-Execute">
expj.AD0080020.AD0080020button1.Execute = {};
// script1="onClick;1;CHK;_AD0080020form1/INTAKE_TERM_FROM[neq][and]_AD0080020form1/INTAKE_TERM_TO[neq][and]_AD0080020form1/INTAKE_TERM_TO[lt]_AD0080020form1/INTAKE_TERM_FROM@#AE00192"
expj.AD0080020.AD0080020button1.Execute.onClick1 = function () {
  console.log('Execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0080020', 'AD0080020button1', '_AD0080020form1/INTAKE_TERM_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0080020', 'AD0080020button1', '_AD0080020form1/INTAKE_TERM_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0080020', 'AD0080020button1', '_AD0080020form1/INTAKE_TERM_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0080020', 'AD0080020button1', '_AD0080020form1/INTAKE_TERM_FROM')))) {
expj.common.pscript.addErrorMessage('AD0080020', 'AD0080020button1', 'AE00192');
}
};
// script2="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0080020form1/*@AD0080020Servlet,,$ZZ07009"
expj.AD0080020.AD0080020button1.Execute.onClick2 = function () {
  console.log('Execute script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0080020', 'AD0080020button1', '_AD0080020form1/*', 'AD0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0080020', response);
expj.common.updateBusinessScreenTab('AD0080020', contents);
};
expj.common.pscript.callConfirm('AD0080020', 'AD0080020button1', 'ZZ07009', okEvent);
};
expj.AD0080020.AD0080020button1.Execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0080020.AD0080020button1.Execute['onClick' + i])) {
        expj.AD0080020.AD0080020button1.Execute['onClick' + i]();
      }
    }
  }
};
expj.AD0080020.AD0080020button1.Execute.executeAllOnDecision = function () {
};
expj.AD0080020.AD0080020button1.Execute.executeOnLoad = function () {
  $('#expj-AD0080020-AD0080020button1-Execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0080020', 'AD0080020button1', 'Execute', this, 'Button');
    }
  });
  expj.AD0080020.AD0080020button1.Execute.executePScriptOnLoad();
};

expj.AD0080020.AD0080020button1.Execute.executePScriptOnLoad = function () {
  console.log('execute AD0080020button1/Execute.onLoad');
  var targetComponent = document.getElementById('expj-AD0080020-AD0080020button1-Execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0080020-AD0080020button1-Execute" name="Execute" class="AD0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0080020 Revision: 1.1.1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0080020-AD0080020button0">
expj.AD0080020.AD0080020button0 = {};
expj.AD0080020.AD0080020button0.executeAllOnDecision = function () {
  console.log('execute AD0080020button0.onDecision');
};
expj.AD0080020.AD0080020button0.executeOnLoad = function () {
  expj.AD0080020.AD0080020button0.executePScriptOnLoad();
};

expj.AD0080020.AD0080020button0.executePScriptOnLoad = function () {
  console.log('execute AD0080020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0080020-AD0080020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0080020-AD0080020button0-Clear">
expj.AD0080020.AD0080020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AD0080020Servlet,,$ZZ07008"
expj.AD0080020.AD0080020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0080020', 'AD0080020button0', '', 'AD0080020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0080020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0080020', response);
expj.common.updateBusinessScreenTab('AD0080020', contents);
};
expj.common.pscript.callConfirm('AD0080020', 'AD0080020button0', 'ZZ07008', okEvent);
};
expj.AD0080020.AD0080020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0080020.AD0080020button0.Clear['onClick' + i])) {
        expj.AD0080020.AD0080020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0080020.AD0080020button0.Clear.executeAllOnDecision = function () {
};
expj.AD0080020.AD0080020button0.Clear.executeOnLoad = function () {
  $('#expj-AD0080020-AD0080020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0080020', 'AD0080020button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0080020.AD0080020button0.Clear.executePScriptOnLoad();
};

expj.AD0080020.AD0080020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0080020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0080020-AD0080020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0080020-AD0080020button0-Clear" name="Clear" class="AD0080020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0080020-AD0080020button0-Close">
expj.AD0080020.AD0080020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0080020.AD0080020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0080020');
};
expj.AD0080020.AD0080020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0080020.AD0080020button0.Close['onClick' + i])) {
        expj.AD0080020.AD0080020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0080020.AD0080020button0.Close.executeAllOnDecision = function () {
};
expj.AD0080020.AD0080020button0.Close.executeOnLoad = function () {
  $('#expj-AD0080020-AD0080020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0080020', 'AD0080020button0', 'Close', this, 'Button');
    }
  });
  expj.AD0080020.AD0080020button0.Close.executePScriptOnLoad();
};

expj.AD0080020.AD0080020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0080020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0080020-AD0080020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0080020-AD0080020button0-Close" name="Close" class="AD0080020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0080020 (END)-->
<%
MessageStruct msgStruct = aAD0080020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0080020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0080020)) {
  expj.common.treeInstanceMap.AD0080020 = {};
}
expj.common.treeInstanceMap.AD0080020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0080020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0080020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0080020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0080020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0080020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0080020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0080020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0080020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0080020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0080020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0080020)) {
  expj.common.detailDialogMap.AD0080020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0080020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0080020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0080020.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0080020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0080020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0080020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0080020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0080020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0080020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0080020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0080020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0080020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0080020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0080020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0080020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0080020)) {
  expj.common.viewInstanceMap.AD0080020 = {};
}
expj.common.viewInstanceMap.AD0080020.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0080020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0080020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0080020.<%=viewId %>.init = function () {
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
    expj.AD0080020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0080020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0080020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0080020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0080020_init">
/**
 * AD0080020用のロード完了時初期化関数
 */
expj.AD0080020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0080020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0080020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0080020');
  expj.common.calendarInstanceMap.AD0080020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0080020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0080020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0080020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0080020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0080020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0080020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0080020-<%=detailId %>');
<%
 }
%>
  try{expj.AD0080020.AD0080020form1.INTAKE_TERM_FROM.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020form1.CalendarIntakeTermFrom.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020form1.INTAKE_TERM_TO.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020form1.CalendarIntakeTermTo.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020button1.Execute.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020form1.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020button1.executeOnLoad();}catch(e){};
  try{expj.AD0080020.AD0080020button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0080020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0080020', 'AD0080020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0080020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0080020-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0080020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0080020', '<%=request.getContextPath() %>');
};

/**
 * AD0080020の全体onDecision処理
 */
expj.AD0080020.executeAllOnDecision = function () {
  expj.AD0080020.AD0080020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0080020_console">
expj.AD0080020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>