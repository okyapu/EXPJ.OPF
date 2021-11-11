<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:32:55 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0130\AD0130011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0130.*" %>
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
<jsp:useBean id="aAD0130010Control" class="com.nec.jp.orteus.metamorBase.AD0130.AD0130010Control" scope="request"/>
<jsp:useBean id="aAD0130010Struct" class="com.nec.jp.orteus.metamorBase.AD0130.AD0130010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業日報・人日報メンテナンス 人日報
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0130/jsp/AD0130011.jsp,v $
$Author: geng-jia $	
$Revision: 1.9 $　$Date: 2017/02/22 02:05:00 $
********************************************************* --%>
<html>
<head>
<title>作業日報・人日報メンテナンス 人日報</title>
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
<script class="expj-script-AD0130010_init">
  // AD0130010名前空間
  expj.AD0130010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AD0130010" data-screen="AD0130011" data-newdata="<%=aAD0130010Control.isNewData() %>">
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
			  <script class="expj-script-AD0130010-AD0130011form1">
expj.AD0130010.AD0130011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AD0130010.AD0130011form1.onLoad0 = function () {
  console.log('AD0130011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AD0130010.AD0130011form1.onDecision0 = function () {
  console.log('AD0130011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0130010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;_AD0130011form1/h_UpdateFlag[eq]true@*2,*3"
expj.AD0130010.AD0130011form1.onDecision1 = function () {
  console.log('AD0130011form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130011form1', '_AD0130011form1/h_UpdateFlag'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;0;UNMASK;_AD0130011button1/sub1_Insert,_AD0130011button1/sub1_Update"
expj.AD0130010.AD0130011form1.child0 = function () {
  console.log('AD0130011form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011button1/sub1_Insert');
expj.common.pscript.setUnMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011button1/sub1_Update');
};
// script5="child;1;MASK;_AD0130011button1/sub1_Insert,_AD0130011button1/sub1_Update"
expj.AD0130010.AD0130011form1.child1 = function () {
  console.log('AD0130011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011button1/sub1_Insert');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011button1/sub1_Update');
};
// script6="child;2;MASK;_AD0130011button1/sub1_Insert,_AD0130011form1/USER_CD,_AD0130011form1/PeekerUserCd,_AD0130011form1/OPR_DATE,_AD0130011form1/CalendarOPR_DATE,_AD0130011form1/WORK_SHIFT_CODE,_AD0130011form1/PeekerWorkShiftCode"
expj.AD0130010.AD0130011form1.child2 = function () {
  console.log('AD0130011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011button1/sub1_Insert');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011form1/USER_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011form1/PeekerUserCd');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011form1/OPR_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011form1/CalendarOPR_DATE');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011form1/WORK_SHIFT_CODE');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011form1/PeekerWorkShiftCode');
};
// script7="child;3;MASK;_AD0130011button1/sub1_Update"
expj.AD0130010.AD0130011form1.child3 = function () {
  console.log('AD0130011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AD0130010', 'AD0130011form1', '_AD0130011button1/sub1_Update');
};
expj.AD0130010.AD0130011form1.executeAllOnDecision = function () {
  console.log('execute AD0130011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130011form1['onDecision' + i])) {
        expj.AD0130010.AD0130011form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130011form1.executeOnLoad = function () {
  expj.AD0130010.AD0130011form1.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0130010.AD0130011form1['onLoad' + i])) {
      expj.AD0130010.AD0130011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0130010-AD0130011form1" action="AD0130010Servlet" name="AD0130011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.USER_CD",rb)%></span><!-- ユーザコード --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-USER_CD">
expj.AD0130010.AD0130011form1.USER_CD = {};
expj.AD0130010.AD0130011form1.USER_CD.executeAllOnDecision = function () {
  console.log('execute AD0130011form1/USER_CD.onDecision');
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011form1.USER_CD.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011form1', 'USER_CD', this);
  });
  expj.AD0130010.AD0130011form1.USER_CD.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.USER_CD.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130011form1-USER_CD" name="USER_CD" class="AD0130010-focus-move  required-value expj-AD0130010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getUSER_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-PeekerUserCd">
expj.AD0130010.AD0130011form1.PeekerUserCd = {};
// script1="onClick;0;PEEKER;_AD0130011form1/USER_CD@<%=contextNo%>"
expj.AD0130010.AD0130011form1.PeekerUserCd.onClick0 = function () {
  console.log('PeekerUserCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0130010';
var parameterValues = 'PeekerUserCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0130010', 'PeekerUserCd', 'SQLPARAM_1', '<%=aAD0130010Control.getPlantCd()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130011form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130011form1', '_AD0130011form1/USER_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_07%&%';
parameterValues += 'TARGET_FIELD%=%_AD0130011form1/USER_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0130010.AD0130011form1.PeekerUserCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130011form1.PeekerUserCd['onClick' + i])) {
        expj.AD0130010.AD0130011form1.PeekerUserCd['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130011form1.PeekerUserCd.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130011form1.PeekerUserCd.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-PeekerUserCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130011form1', 'PeekerUserCd', this, 'Button');
    }
  });
  expj.AD0130010.AD0130011form1.PeekerUserCd.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.PeekerUserCd.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/PeekerUserCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-PeekerUserCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130011form1-PeekerUserCd" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-USER_NAME">
expj.AD0130010.AD0130011form1.USER_NAME = {};
expj.AD0130010.AD0130011form1.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AD0130011form1/USER_NAME.onDecision');
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011form1.USER_NAME.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011form1', 'USER_NAME', this);
  });
  expj.AD0130010.AD0130011form1.USER_NAME.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130011form1-USER_NAME" name="USER_NAME" class="AD0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0130010-AD0130011form1-h_DAILY_WORK_REPORT_CTL_NO" name="h_DAILY_WORK_REPORT_CTL_NO" class="" data-kind="" maxlength="25" value="<%= TypeConverter.sanitizer(aAD0130010Struct.geth_DAILY_WORK_REPORT_CTL_NO()) %>">
<script class="expj-script-AD0130010-AD0130011form1-h_DAILY_WORK_REPORT_CTL_NO">
expj.AD0130010.AD0130011form1.h_DAILY_WORK_REPORT_CTL_NO = {};
expj.AD0130010.AD0130011form1.h_DAILY_WORK_REPORT_CTL_NO.executeAllOnDecision = function () {
  console.log('execute AD0130011form1/h_DAILY_WORK_REPORT_CTL_NO.onDecision');
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011form1.h_DAILY_WORK_REPORT_CTL_NO.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-h_DAILY_WORK_REPORT_CTL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011form1', 'h_DAILY_WORK_REPORT_CTL_NO', this);
  });
  expj.AD0130010.AD0130011form1.h_DAILY_WORK_REPORT_CTL_NO.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.h_DAILY_WORK_REPORT_CTL_NO.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/h_DAILY_WORK_REPORT_CTL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-h_DAILY_WORK_REPORT_CTL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt5833",rb)%></span><!-- 作業日 --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-OPR_DATE">
expj.AD0130010.AD0130011form1.OPR_DATE = {};
expj.AD0130010.AD0130011form1.OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0130011form1/OPR_DATE.onDecision');
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011form1.OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011form1', 'OPR_DATE', this);
  });
  expj.AD0130010.AD0130011form1.OPR_DATE.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130011form1-OPR_DATE" name="OPR_DATE" class="AD0130010-focus-move  required-value expj-AD0130010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getOPR_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-CalendarOPR_DATE">
expj.AD0130010.AD0130011form1.CalendarOPR_DATE = {};
// script1="onClick;0;CALENDAR;_AD0130011form1/OPR_DATE@<%=contextNo%>"
expj.AD0130010.AD0130011form1.CalendarOPR_DATE.onClick0 = function () {
  console.log('CalendarOPR_DATE script1');
expj.common.pscript.executeCalendar('AD0130010','AD0130011form1','_AD0130011form1/OPR_DATE');
};
expj.AD0130010.AD0130011form1.CalendarOPR_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130011form1.CalendarOPR_DATE['onClick' + i])) {
        expj.AD0130010.AD0130011form1.CalendarOPR_DATE['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130011form1.CalendarOPR_DATE.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130011form1.CalendarOPR_DATE.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-CalendarOPR_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130011form1', 'CalendarOPR_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0130010','AD0130011form1','_AD0130011form1/OPR_DATE');
  expj.AD0130010.AD0130011form1.CalendarOPR_DATE.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.CalendarOPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/CalendarOPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-CalendarOPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130011form1-CalendarOPR_DATE" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AD0130010-AD0130011form1-h_UpdateFlag" name="h_UpdateFlag" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0130010Struct.geth_UpdateFlag()) %>">
<script class="expj-script-AD0130010-AD0130011form1-h_UpdateFlag">
expj.AD0130010.AD0130011form1.h_UpdateFlag = {};
expj.AD0130010.AD0130011form1.h_UpdateFlag.executeAllOnDecision = function () {
  console.log('execute AD0130011form1/h_UpdateFlag.onDecision');
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011form1.h_UpdateFlag.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-h_UpdateFlag').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011form1', 'h_UpdateFlag', this);
  });
  expj.AD0130010.AD0130011form1.h_UpdateFlag.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.h_UpdateFlag.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/h_UpdateFlag.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-h_UpdateFlag');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt6746",rb)%></span><!-- 勤務シフト --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-WORK_SHIFT_CODE">
expj.AD0130010.AD0130011form1.WORK_SHIFT_CODE = {};
expj.AD0130010.AD0130011form1.WORK_SHIFT_CODE.executeAllOnDecision = function () {
  console.log('execute AD0130011form1/WORK_SHIFT_CODE.onDecision');
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011form1.WORK_SHIFT_CODE.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-WORK_SHIFT_CODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011form1', 'WORK_SHIFT_CODE', this);
  });
  expj.AD0130010.AD0130011form1.WORK_SHIFT_CODE.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.WORK_SHIFT_CODE.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/WORK_SHIFT_CODE.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-WORK_SHIFT_CODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130011form1-WORK_SHIFT_CODE" name="WORK_SHIFT_CODE" class="AD0130010-focus-move  required-value expj-AD0130010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getWORK_SHIFT_CODE()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-PeekerWorkShiftCode">
expj.AD0130010.AD0130011form1.PeekerWorkShiftCode = {};
// script1="onClick;0;PEEKER;_AD0130011form1/WORK_SHIFT_CODE@<%=contextNo%>"
expj.AD0130010.AD0130011form1.PeekerWorkShiftCode.onClick0 = function () {
  console.log('PeekerWorkShiftCode script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0130010';
var parameterValues = 'PeekerWorkShiftCode%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130011form1', '_AD0130011form1/WORK_SHIFT_CODE') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WORK_SHIFT_CODE_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0130011form1/WORK_SHIFT_CODE%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0130010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0130010.AD0130011form1.PeekerWorkShiftCode.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130011form1.PeekerWorkShiftCode['onClick' + i])) {
        expj.AD0130010.AD0130011form1.PeekerWorkShiftCode['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130011form1.PeekerWorkShiftCode.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130011form1.PeekerWorkShiftCode.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-PeekerWorkShiftCode').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130011form1', 'PeekerWorkShiftCode', this, 'Button');
    }
  });
  expj.AD0130010.AD0130011form1.PeekerWorkShiftCode.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.PeekerWorkShiftCode.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/PeekerWorkShiftCode.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-PeekerWorkShiftCode');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0130010-AD0130011form1-PeekerWorkShiftCode" class="AD0130010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011form1-WORK_SHIFT_NAME">
expj.AD0130010.AD0130011form1.WORK_SHIFT_NAME = {};
expj.AD0130010.AD0130011form1.WORK_SHIFT_NAME.executeAllOnDecision = function () {
  console.log('execute AD0130011form1/WORK_SHIFT_NAME.onDecision');
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011form1.WORK_SHIFT_NAME.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011form1-WORK_SHIFT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011form1', 'WORK_SHIFT_NAME', this);
  });
  expj.AD0130010.AD0130011form1.WORK_SHIFT_NAME.executePScriptOnLoad();
};

expj.AD0130010.AD0130011form1.WORK_SHIFT_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0130011form1/WORK_SHIFT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011form1-WORK_SHIFT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0130010-AD0130011form1-WORK_SHIFT_NAME" name="WORK_SHIFT_NAME" class="AD0130010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0130010Struct.getWORK_SHIFT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0130010-AD0130011view1">
expj.AD0130010.AD0130011view1 = {};
expj.AD0130010.AD0130011view1.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.executeAllOnDecision = function () {
  console.log('execute AD0130011view1.onDecision');
};
expj.AD0130010.AD0130011view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0130011view1", "expj.AD0130010.AD0130011view1.executeAllOnClick");
%>
  expj.AD0130010.AD0130011view1.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0130010-AD0130011view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0130011view1_Id = "AD0130011view1";
 String AD0130011view1_select = "single";
 String AD0130011view1_sortable = "true";
 String AD0130011view1_resize = "true";
 String AD0130011view1_scroll = "true";
 StringBuffer AD0130011view1_HB = new StringBuffer();
 StringBuffer AD0130011view1_DB = new StringBuffer();
%>
<%
 AD0130011view1_select = "none";
 AD0130011view1_sortable = "false";
 AD0130011view1_resize = "true";
 AD0130011view1_scroll = "true";
%>
<%
 AD0130011view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AD0130010-AD0130011view1-l_WS_CD">
expj.AD0130010.AD0130011view1.l_WS_CD = {};
expj.AD0130010.AD0130011view1.l_WS_CD.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.l_WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0130011view1/l_WS_CD.onDecision');
  expj.AD0130010.AD0130011view1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011view1.l_WS_CD.executeOnLoad = function () {
  $('.expj-AD0130010-AD0130011view1-l_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011view1', 'l_WS_CD', this);
  });
  expj.AD0130010.AD0130011view1.l_WS_CD.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.l_WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1/l_WS_CD.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0130010-AD0130011view1-l_START_TIME">
expj.AD0130010.AD0130011view1.l_START_TIME = {};
expj.AD0130010.AD0130011view1.l_START_TIME.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.l_START_TIME.executeAllOnDecision = function () {
  console.log('execute AD0130011view1/l_START_TIME.onDecision');
  expj.AD0130010.AD0130011view1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011view1.l_START_TIME.executeOnLoad = function () {
  $('.expj-AD0130010-AD0130011view1-l_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011view1', 'l_START_TIME', this);
  });
  expj.AD0130010.AD0130011view1.l_START_TIME.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.l_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1/l_START_TIME.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0130010-AD0130011view1-l_END_TIME">
expj.AD0130010.AD0130011view1.l_END_TIME = {};
expj.AD0130010.AD0130011view1.l_END_TIME.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.l_END_TIME.executeAllOnDecision = function () {
  console.log('execute AD0130011view1/l_END_TIME.onDecision');
  expj.AD0130010.AD0130011view1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011view1.l_END_TIME.executeOnLoad = function () {
  $('.expj-AD0130010-AD0130011view1-l_END_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011view1', 'l_END_TIME', this);
  });
  expj.AD0130010.AD0130011view1.l_END_TIME.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.l_END_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1/l_END_TIME.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0130010-AD0130011view1-l_OPR_TYP">
expj.AD0130010.AD0130011view1.l_OPR_TYP = {};
expj.AD0130010.AD0130011view1.l_OPR_TYP.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.l_OPR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0130011view1/l_OPR_TYP.onDecision');
  expj.AD0130010.AD0130011view1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011view1.l_OPR_TYP.executeOnLoad = function () {
  $('.expj-AD0130010-AD0130011view1-l_OPR_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0130010', 'AD0130011view1', 'l_OPR_TYP', this);
  });
  expj.AD0130010.AD0130011view1.l_OPR_TYP.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.l_OPR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1/l_OPR_TYP.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0130010-AD0130011view1-l_UN_OPR_CAUSE_TYP">
expj.AD0130010.AD0130011view1.l_UN_OPR_CAUSE_TYP = {};
expj.AD0130010.AD0130011view1.l_UN_OPR_CAUSE_TYP.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.l_UN_OPR_CAUSE_TYP.executeAllOnDecision = function () {
  console.log('execute AD0130011view1/l_UN_OPR_CAUSE_TYP.onDecision');
  expj.AD0130010.AD0130011view1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011view1.l_UN_OPR_CAUSE_TYP.executeOnLoad = function () {
  $('.expj-AD0130010-AD0130011view1-l_UN_OPR_CAUSE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0130010', 'AD0130011view1', 'l_UN_OPR_CAUSE_TYP', this);
  });
  expj.AD0130010.AD0130011view1.l_UN_OPR_CAUSE_TYP.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.l_UN_OPR_CAUSE_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1/l_UN_OPR_CAUSE_TYP.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0130010-AD0130011view1-l_UN_OPR_TIME">
expj.AD0130010.AD0130011view1.l_UN_OPR_TIME = {};
expj.AD0130010.AD0130011view1.l_UN_OPR_TIME.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.l_UN_OPR_TIME.executeAllOnDecision = function () {
  console.log('execute AD0130011view1/l_UN_OPR_TIME.onDecision');
  expj.AD0130010.AD0130011view1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011view1.l_UN_OPR_TIME.executeOnLoad = function () {
  $('.expj-AD0130010-AD0130011view1-l_UN_OPR_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011view1', 'l_UN_OPR_TIME', this);
  });
  expj.AD0130010.AD0130011view1.l_UN_OPR_TIME.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.l_UN_OPR_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1/l_UN_OPR_TIME.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0130010-AD0130011view1-l_REMARKS">
expj.AD0130010.AD0130011view1.l_REMARKS = {};
expj.AD0130010.AD0130011view1.l_REMARKS.executeAllOnClick = function () {
};
expj.AD0130010.AD0130011view1.l_REMARKS.executeAllOnDecision = function () {
  console.log('execute AD0130011view1/l_REMARKS.onDecision');
  expj.AD0130010.AD0130011view1.executeAllOnDecision();
  expj.AD0130010.executeAllOnDecision();
};
expj.AD0130010.AD0130011view1.l_REMARKS.executeOnLoad = function () {
  $('.expj-AD0130010-AD0130011view1-l_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0130010', 'AD0130011view1', 'l_REMARKS', this);
  });
  expj.AD0130010.AD0130011view1.l_REMARKS.executePScriptOnLoad();
};

expj.AD0130010.AD0130011view1.l_REMARKS.executePScriptOnLoad = function () {
  console.log('execute AD0130011view1/l_REMARKS.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 
<%
AD0130011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'20px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.LINE_NO",rb))).append("', 'name':'l_SEQ_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NC_WS_CD",rb))).append("', 'name':'l_WS_CD', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NC_WS_NAME",rb))).append("', 'name':'l_WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.START_TIME_1",rb))).append("', 'name':'l_START_TIME', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.END_TIME",rb))).append("', 'name':'l_END_TIME', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_TIME_MINUTE",rb))).append("', 'name':'l_OPR_TIME', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'string', 'width':'110px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_PROC_TYP",rb))).append("', 'name':'l_OPR_TYP', 'class':'expj-tooltip expj-view-cell-combobox', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'string', 'width':'180px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UN_OPR_CAUSE",rb))).append("', 'name':'l_UN_OPR_CAUSE_TYP', 'class':'expj-tooltip expj-view-cell-combobox', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UN_OPR_TIME",rb))).append("', 'name':'l_UN_OPR_TIME', 'class':'expj-tooltip expj-view-cell-textinput expj-align-right', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'string', 'width':'145px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS",rb))).append("', 'name':'l_REMARKS', 'class':'expj-tooltip expj-view-cell-textinput', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
AD0130011view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0130011view1_sortable).append("}").append(",");
%>
<%
 int aAD0130010StructLength = aAD0130010Control.getListsize();
 final AD0130010Struct structBackup = aAD0130010Struct;
 aAD0130010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0130010StructLength; ++loopCount) {
  if((aAD0130010Struct = (AD0130010Struct) aAD0130010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0130010Struct", aAD0130010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0130011view1_DB.append("[");
 AD0130011view1_DB.append(loopCount);
 AD0130011view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130011view1-l_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130011view1-l_SEQ_NO\" data-name=\"l_SEQ_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_Z;6;;\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_SEQ_NO())).append("</span>'");
 AD0130011view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AD0130010-AD0130011view1-l_WS_CD-").append(loopCount).append("\" class=\"expj-AD0130010-AD0130011view1-l_WS_CD AD0130010-focus-move\" data-name=\"l_WS_CD\" data-view=\"true\" maxlength=\"25\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAD0130010Struct.getl_WS_CD())).append("\">'");
 AD0130011view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130011view1-l_WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130011view1-l_WS_NAME\" data-name=\"l_WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_WS_NAME())).append("</span>'");
 AD0130011view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AD0130010-AD0130011view1-l_START_TIME-").append(loopCount).append("\" class=\"expj-AD0130010-AD0130011view1-l_START_TIME AD0130010-focus-move\" data-name=\"l_START_TIME\" data-view=\"true\" maxlength=\"4\" data-kind=\"").append("OBT_N;").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAD0130010Struct.getl_START_TIME())).append("\">'");
 AD0130011view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AD0130010-AD0130011view1-l_END_TIME-").append(loopCount).append("\" class=\"expj-AD0130010-AD0130011view1-l_END_TIME AD0130010-focus-move\" data-name=\"l_END_TIME\" data-view=\"true\" maxlength=\"4\" data-kind=\"").append("OBT_N;").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAD0130010Struct.getl_END_TIME())).append("\">'");
 AD0130011view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130011view1-l_OPR_TIME-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130011view1-l_OPR_TIME\" data-name=\"l_OPR_TIME\" data-view=\"true\" data-kind=\"OBT_INTEGER_Z;4;;\">").append(TypeConverter.sanitizer(aAD0130010Struct.getl_OPR_TIME())).append("</span>'");
 AD0130011view1_DB.append(",").append("'<select id=\"expj-AD0130010-AD0130011view1-l_OPR_TYP-").append(loopCount).append("\" class=\"expj-AD0130010-AD0130011view1-l_OPR_TYP AD0130010-focus-move\" data-name=\"l_OPR_TYP\" data-view=\"true\">"); for(int i = 0, size = aAD0130010Control.getStruct().getList_l_OPR_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0130010Control.getStruct().getList_l_OPR_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0130010Control.getStruct().getList_l_OPR_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0130010Struct.getl_OPR_TYP()))) ? " selected" : "";    AD0130011view1_DB.append("<option value=\"").append(val).append("\"").append( selected ).append(">").append(name).append("</option>");  } AD0130011view1_DB.append("</select>'");
 AD0130011view1_DB.append(",").append("'<select id=\"expj-AD0130010-AD0130011view1-l_UN_OPR_CAUSE_TYP-").append(loopCount).append("\" class=\"expj-AD0130010-AD0130011view1-l_UN_OPR_CAUSE_TYP AD0130010-focus-move\" data-name=\"l_UN_OPR_CAUSE_TYP\" data-view=\"true\">"); for(int i = 0, size = aAD0130010Control.getStruct().getList_l_UN_OPR_CAUSE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0130010Control.getStruct().getList_l_UN_OPR_CAUSE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0130010Control.getStruct().getList_l_UN_OPR_CAUSE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0130010Struct.getl_UN_OPR_CAUSE_TYP()))) ? " selected" : "";    AD0130011view1_DB.append("<option value=\"").append(val).append("\"").append( selected ).append(">").append(name).append("</option>");  } AD0130011view1_DB.append("</select>'");
 AD0130011view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AD0130010-AD0130011view1-l_UN_OPR_TIME-").append(loopCount).append("\" class=\"expj-AD0130010-AD0130011view1-l_UN_OPR_TIME AD0130010-focus-move\" data-name=\"l_UN_OPR_TIME\" data-view=\"true\" style=\"text-align:right;\" maxlength=\"4\" data-kind=\"").append("OBT_INTEGER_Z;4;;").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAD0130010Struct.getl_UN_OPR_TIME())).append("\">'");
 AD0130011view1_DB.append(",").append("'<input type=\"text\" id=\"expj-AD0130010-AD0130011view1-l_REMARKS-").append(loopCount).append("\" class=\"expj-AD0130010-AD0130011view1-l_REMARKS AD0130010-focus-move\" data-name=\"l_REMARKS\" data-view=\"true\" maxlength=\"80\" data-kind=\"").append("").append("\"").append("").append(" value=\"").append(TypeConverter.sanitizer(aAD0130010Struct.getl_REMARKS())).append("\">'");
 AD0130011view1_DB.append(",").append("'<span id=\"expj-AD0130010-AD0130011view1-h_l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AD0130010-AD0130011view1-h_l_MODIFY_COUNT\" data-name=\"h_l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0130010Struct.geth_l_MODIFY_COUNT())).append("</span>'");
 AD0130011view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0130010StructLength) {
   AD0130011view1_DB.append(",");
  }
 }
 aAD0130010Struct = structBackup;
 viewIdList.add(AD0130011view1_Id);
 viewSelectList.add(AD0130011view1_select);
 viewResizeList.add(AD0130011view1_resize);
 viewScrollList.add(AD0130011view1_scroll);
 viewHeaderDataList.add(AD0130011view1_HB);
 viewBodyDataList.add(AD0130011view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:559px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 748px);"><script class="expj-script-AD0130010-AD0130011button1">
expj.AD0130010.AD0130011button1 = {};
expj.AD0130010.AD0130011button1.executeAllOnDecision = function () {
  console.log('execute AD0130011button1.onDecision');
};
expj.AD0130010.AD0130011button1.executeOnLoad = function () {
  expj.AD0130010.AD0130011button1.executePScriptOnLoad();
};

expj.AD0130010.AD0130011button1.executePScriptOnLoad = function () {
  console.log('execute AD0130011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0130010-AD0130011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0130010-AD0130011button1-sub1_Insert">
expj.AD0130010.AD0130011button1.sub1_Insert = {};
// script1="onClick;0;CHK;_AD0130011form1/OPR_DATE[gt]<%=aAD0130010Control.getBusinessOprDate()%>@!ZZ05103"
expj.AD0130010.AD0130011button1.sub1_Insert.onClick0 = function () {
  console.log('sub1_Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130011button1', '_AD0130011form1/OPR_DATE')), '[gt]', expj.common.pscript.convertNumber('<%=aAD0130010Control.getBusinessOprDate()%>'))) {
expj.common.pscript.viewErrorMessage('AD0130010', 'AD0130011button1', 'ZZ05103');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0130011form1/*,_AD0130011view1/*@AD0130010Servlet,,$ZZ07003"
expj.AD0130010.AD0130011button1.sub1_Insert.onClick1 = function () {
  console.log('sub1_Insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130011button1', '_AD0130011form1/*,_AD0130011view1/*', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.changeBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callConfirm('AD0130010', 'AD0130011button1', 'ZZ07003', okEvent);
};
expj.AD0130010.AD0130011button1.sub1_Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130011button1.sub1_Insert['onClick' + i])) {
        expj.AD0130010.AD0130011button1.sub1_Insert['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130011button1.sub1_Insert.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130011button1.sub1_Insert.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011button1-sub1_Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130011button1', 'sub1_Insert', this, 'Button');
    }
  });
  expj.AD0130010.AD0130011button1.sub1_Insert.executePScriptOnLoad();
};

expj.AD0130010.AD0130011button1.sub1_Insert.executePScriptOnLoad = function () {
  console.log('execute AD0130011button1/sub1_Insert.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011button1-sub1_Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130011button1-sub1_Insert" name="sub1_Insert" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AD0130010-AD0130011button1-sub1_Update">
expj.AD0130010.AD0130011button1.sub1_Update = {};
// script1="onClick;0;CHK;_AD0130011form1/OPR_DATE[gt]<%=aAD0130010Control.getBusinessOprDate()%>@!ZZ05103"
expj.AD0130010.AD0130011button1.sub1_Update.onClick0 = function () {
  console.log('sub1_Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0130010', 'AD0130011button1', '_AD0130011form1/OPR_DATE')), '[gt]', expj.common.pscript.convertNumber('<%=aAD0130010Control.getBusinessOprDate()%>'))) {
expj.common.pscript.viewErrorMessage('AD0130010', 'AD0130011button1', 'ZZ05103');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0130011form1/*,_AD0130011view1/*@AD0130010Servlet,,$ZZ07003"
expj.AD0130010.AD0130011button1.sub1_Update.onClick1 = function () {
  console.log('sub1_Update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130011button1', '_AD0130011form1/*,_AD0130011view1/*', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.changeBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callConfirm('AD0130010', 'AD0130011button1', 'ZZ07003', okEvent);
};
expj.AD0130010.AD0130011button1.sub1_Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130011button1.sub1_Update['onClick' + i])) {
        expj.AD0130010.AD0130011button1.sub1_Update['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130011button1.sub1_Update.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130011button1.sub1_Update.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011button1-sub1_Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130011button1', 'sub1_Update', this, 'Button');
    }
  });
  expj.AD0130010.AD0130011button1.sub1_Update.executePScriptOnLoad();
};

expj.AD0130010.AD0130011button1.sub1_Update.executePScriptOnLoad = function () {
  console.log('execute AD0130011button1/sub1_Update.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011button1-sub1_Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130011button1-sub1_Update" name="sub1_Update" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 105px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0130011 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AD0130010-AD0130011button0">
expj.AD0130010.AD0130011button0 = {};
expj.AD0130010.AD0130011button0.executeAllOnDecision = function () {
  console.log('execute AD0130011button0.onDecision');
};
expj.AD0130010.AD0130011button0.executeOnLoad = function () {
  expj.AD0130010.AD0130011button0.executePScriptOnLoad();
};

expj.AD0130010.AD0130011button0.executePScriptOnLoad = function () {
  console.log('execute AD0130011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0130010-AD0130011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0130010-AD0130011button0-sub1_Return">
expj.AD0130010.AD0130011button0.sub1_Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0130011form1/*,_AD0130011view1/*@AD0130010Servlet,,$ZZ07013"
expj.AD0130010.AD0130011button0.sub1_Return.onClick0 = function () {
  console.log('sub1_Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0130010', 'AD0130011button0', '_AD0130011form1/*,_AD0130011view1/*', 'AD0130010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0130010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0130010', response);
expj.common.changeBusinessScreenTab('AD0130010', contents);
};
expj.common.pscript.callConfirm('AD0130010', 'AD0130011button0', 'ZZ07013', okEvent);
};
expj.AD0130010.AD0130011button0.sub1_Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0130010.AD0130011button0.sub1_Return['onClick' + i])) {
        expj.AD0130010.AD0130011button0.sub1_Return['onClick' + i]();
      }
    }
  }
};
expj.AD0130010.AD0130011button0.sub1_Return.executeAllOnDecision = function () {
};
expj.AD0130010.AD0130011button0.sub1_Return.executeOnLoad = function () {
  $('#expj-AD0130010-AD0130011button0-sub1_Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0130010', 'AD0130011button0', 'sub1_Return', this, 'Button');
    }
  });
  expj.AD0130010.AD0130011button0.sub1_Return.executePScriptOnLoad();
};

expj.AD0130010.AD0130011button0.sub1_Return.executePScriptOnLoad = function () {
  console.log('execute AD0130011button0/sub1_Return.onLoad');
  var targetComponent = document.getElementById('expj-AD0130010-AD0130011button0-sub1_Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0130010-AD0130011button0-sub1_Return" name="sub1_Return" class="AD0130010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0130010 (END)-->
<%
MessageStruct msgStruct = aAD0130010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0130010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0130010)) {
  expj.common.treeInstanceMap.AD0130010 = {};
}
expj.common.treeInstanceMap.AD0130010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0130010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0130010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0130010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0130010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0130010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0130010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010)) {
  expj.common.detailDialogMap.AD0130010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0130010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0130010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0130010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0130010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0130010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0130010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0130010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0130010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0130010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0130010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0130010)) {
  expj.common.viewInstanceMap.AD0130010 = {};
}
expj.common.viewInstanceMap.AD0130010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0130010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0130010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0130010.<%=viewId %>.init = function () {
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
    expj.AD0130010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0130010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0130010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0130010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0130010_init">
/**
 * AD0130010用のロード完了時初期化関数
 */
expj.AD0130010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0130010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0130010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0130010');
  expj.common.calendarInstanceMap.AD0130010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0130010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0130010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0130010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0130010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0130010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0130010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0130010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0130010.AD0130011form1.USER_CD.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.PeekerUserCd.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.h_DAILY_WORK_REPORT_CTL_NO.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.CalendarOPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.h_UpdateFlag.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.WORK_SHIFT_CODE.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.PeekerWorkShiftCode.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.WORK_SHIFT_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.l_WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.l_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.l_END_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.l_OPR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.l_UN_OPR_CAUSE_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.l_UN_OPR_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.l_REMARKS.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011button1.sub1_Insert.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011button1.sub1_Update.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011button0.sub1_Return.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011form1.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011view1.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011button1.executeOnLoad();}catch(e){};
  try{expj.AD0130010.AD0130011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0130010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0130010', 'AD0130010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0130010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0130010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0130010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0130010', '<%=request.getContextPath() %>');
};

/**
 * AD0130010の全体onDecision処理
 */
expj.AD0130010.executeAllOnDecision = function () {
  expj.AD0130010.AD0130011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0130010_console">
expj.AD0130010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>